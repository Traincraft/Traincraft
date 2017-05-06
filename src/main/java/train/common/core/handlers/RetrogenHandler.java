package train.common.core.handlers;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.TickEvent;
import net.minecraft.world.WorldServer;
import net.minecraft.world.chunk.Chunk;
import net.minecraftforge.event.world.ChunkDataEvent;
import train.common.Traincraft;

import java.util.ArrayList;
import java.util.Random;

public class RetrogenHandler {
	public static final byte VERSION = 1; // useful for world generation changes in future releases, to allow partial retrogen.
	private static final ArrayList<Chunk> chunksToRetroGen = new ArrayList<Chunk>();
	public static final ArrayList<ChunkData> gennedChunks = new ArrayList<ChunkData>();
	private static final Random rand = new Random();
	/** Called whenever a chunk is loaded, checks for retrogen flag and adds it to the list of chunks to retrogen if neededg. */
	@SubscribeEvent
	public void onChunkLoad(ChunkDataEvent.Load event) {
		ChunkData data = new ChunkData(event.getChunk());
		if (ConfigHandler.RETROGEN_CHUNKS && event.getData().getByte("TraincraftRetrogen") < VERSION && !gennedChunks.contains(data)) {
			chunksToRetroGen.add(event.getChunk());
		}
		gennedChunks.remove(data);
	}
	/** Called whenever a chunk is saved, sets the retrogen flag. */
	@SubscribeEvent
	public void onChunkSave(ChunkDataEvent.Save event) {
		event.getData().setByte("TraincraftRetrogen", VERSION);
	}
	/** called every server tick. Retrogens chunks if needed. **/
	@SubscribeEvent
	public void onServerTick(TickEvent.ServerTickEvent event) {
		if (ConfigHandler.RETROGEN_CHUNKS) {
			if (event.phase == TickEvent.Phase.END) {
				for (Chunk chunk : (ArrayList<Chunk>) chunksToRetroGen.clone()) {
					chunksToRetroGen.remove(chunk);
					if (chunk.worldObj instanceof WorldServer) {
						WorldServer world = (WorldServer) chunk.worldObj;
						rand.setSeed((long)chunk.xPosition * 341873128712L + (long)chunk.zPosition * 132897987541L);
						Traincraft.tcLog.info("Retrogen chunk at " + chunk.xPosition + ", " + chunk.zPosition + " for dimension " + world.provider.dimensionId + ", Version " + VERSION);
						Traincraft.worldGen.generate(rand, chunk.xPosition, chunk.zPosition, world, world.theChunkProviderServer.currentChunkProvider, world.theChunkProviderServer.currentChunkProvider);
						gennedChunks.remove(new ChunkData(chunk));
					}
				}
			}
		}
	}
	
	public static class ChunkData {
		private final int chunkX, chunkZ, dimension;
		private ChunkData(Chunk chunk) {
			this.chunkX = chunk.xPosition;
			this.chunkZ = chunk.zPosition;
			this.dimension = chunk.worldObj.provider.dimensionId;
		}
		public ChunkData(int chunkX, int chunkZ, int dimension) {
			this.chunkX = chunkX;
			this.chunkZ = chunkZ;
			this.dimension = dimension;
		}
		@Override
		public boolean equals(Object o) {
			if (o instanceof ChunkData) {
				ChunkData data = (ChunkData) o;
				return (data == this) || (data.chunkX == this.chunkX && data.chunkZ == this.chunkZ && data.dimension == this.dimension);
			}
			return false;
		}
	}
}