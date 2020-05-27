package train.common.core.handlers;

import net.minecraft.world.WorldServer;
import net.minecraft.world.chunk.Chunk;
import net.minecraftforge.event.world.ChunkDataEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;
import traincraft.Traincraft;

import java.util.ArrayList;
import java.util.Random;

@Mod.EventBusSubscriber(modid = Traincraft.MOD_ID)
public class RetrogenHandler {
	
	public static final byte VERSION = 1; // useful for world generation changes in future releases, to allow partial retrogen.
	private static final ArrayList<Chunk> chunksToRetroGen = new ArrayList<Chunk>();
	public static final ArrayList<ChunkData> gennedChunks = new ArrayList<ChunkData>();
	private static final Random rand = new Random();
	
	/**
	 * Called whenever a chunk is loaded, checks for retrogen flag and adds it to the list of chunks to retrogen if neededg.
	 */
	@SubscribeEvent
	public static void onChunkLoad(ChunkDataEvent.Load event) {
		ChunkData data = new ChunkData(event.getChunk());
		if(false /*ConfigHandler.RETROGEN_CHUNKS*/ && event.getData().getByte("TraincraftRetrogen") < VERSION && !gennedChunks.contains(data)){
			chunksToRetroGen.add(event.getChunk());
		}
		gennedChunks.remove(data);
	}
	
	/**
	 * Called whenever a chunk is saved, sets the retrogen flag.
	 */
	@SubscribeEvent
	public static void onChunkSave(ChunkDataEvent.Save event) {
		event.getData().setByte("TraincraftRetrogen", VERSION);
	}
	
	/**
	 * called every server tick. Retrogens chunks if needed.
	 **/
	@SubscribeEvent
	public static void onServerTick(TickEvent.ServerTickEvent event) {
		if(false /*ConfigHandler.RETROGEN_CHUNKS*/){
			if(event.phase == TickEvent.Phase.END){
				for(Chunk chunk : (ArrayList<Chunk>) chunksToRetroGen.clone()){
					chunksToRetroGen.remove(chunk);
					if(chunk.getWorld() instanceof WorldServer){
						WorldServer world = (WorldServer) chunk.getWorld();
						rand.setSeed((long) chunk.x * 341873128712L + (long) chunk.z * 132897987541L);
						Traincraft.LOGGER.info("Retrogen chunk at " + chunk.x + ", " + chunk.z + " for dimension " + world.provider.getDimension() + ", Version " + VERSION);
						Traincraft.worldGen.generate(rand, chunk.x, chunk.z, world, world.getChunkProvider().chunkGenerator, world.getChunkProvider());
						gennedChunks.remove(new ChunkData(chunk));
					}
				}
			}
		}
	}
	
	public static class ChunkData {
		
		private final int chunkX, chunkZ, dimension;
		
		private ChunkData(Chunk chunk) {
			this.chunkX = chunk.x;
			this.chunkZ = chunk.z;
			this.dimension = chunk.getWorld().provider.getDimension();
		}
		
		public ChunkData(int chunkX, int chunkZ, int dimension) {
			this.chunkX = chunkX;
			this.chunkZ = chunkZ;
			this.dimension = dimension;
		}
		
		@Override
		public boolean equals(Object o) {
			if(o instanceof ChunkData){
				ChunkData data = (ChunkData) o;
				return (data == this) || (data.chunkX == this.chunkX && data.chunkZ == this.chunkZ && data.dimension == this.dimension);
			}
			return false;
		}
	}
}