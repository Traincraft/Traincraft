package train.common.core.handlers;

import com.google.common.collect.ListMultimap;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.world.ChunkCoordIntPair;
import net.minecraft.world.World;
import net.minecraftforge.common.ForgeChunkManager;
import net.minecraftforge.common.ForgeChunkManager.Ticket;
import net.minecraftforge.event.entity.EntityEvent;
import train.common.api.AbstractTrains;

import java.util.ArrayList;
import java.util.List;

/**
 * <h1>Chunkloading manager</h1>
 * This is a modified chunkloading manager from TiM. Changed to suit TC's use.
 * @author Eternal Blue Flame
 */
public class ChunkEvents implements ForgeChunkManager.LoadingCallback, ForgeChunkManager.OrderedLoadingCallback, ForgeChunkManager.PlayerOrderedLoadingCallback {


	@SuppressWarnings("unused")
	@SubscribeEvent
	public void entityEnteredChunk(EntityEvent.EnteringChunk event) {
		if(event.entity instanceof AbstractTrains && !event.entity.worldObj.isRemote) {
			forceChunkLoading(((AbstractTrains) event.entity), event.newChunkX, event.newChunkZ);
		}
	}

	private static void forceChunkLoading(AbstractTrains transport, int newChunkX, int newChunkZ) {
		if(transport != null && transport.getTicket() != null) {
			List<ChunkCoordIntPair> newChunks = new ArrayList<ChunkCoordIntPair>();
			for(int x = newChunkX - 1; x <= newChunkX + 1; ++x) {
				for(int z = newChunkZ - 1; z <= newChunkZ + 1; ++z) {
					newChunks.add(new ChunkCoordIntPair(x, z));
				}
			}

			for(ChunkCoordIntPair chunk : newChunks) {
				if(!transport.loadedChunks.contains(chunk)) {
					ForgeChunkManager.forceChunk(transport.getTicket(), chunk);
					ForgeChunkManager.reorderChunk(transport.getTicket(), chunk);
				}
			}

			for (ChunkCoordIntPair oldChunk : transport.loadedChunks){
				if(!newChunks.contains(oldChunk)){
					ForgeChunkManager.unforceChunk(transport.getTicket(), oldChunk);
				}
			}

			transport.loadedChunks = newChunks;
		}
	}

	public void ticketsLoaded(List<Ticket> tickets, World world) {
		for(Ticket ticket : tickets) {
			if(!ticket.isPlayerTicket() && ticket.getEntity() instanceof AbstractTrains) {
				AbstractTrains train = (AbstractTrains)ticket.getEntity();
				train.setTicket(ticket);
				forceChunkLoading(train, train.chunkCoordX, train.chunkCoordZ);
			}
		}
	}

	public List<Ticket> ticketsLoaded(List<Ticket> tickets, World world, int maxTicketCount) {
		List<Ticket> ticketList = new ArrayList<Ticket>();
		for(Ticket ticket : tickets){
			if(ticket.getEntity() instanceof AbstractTrains) {
				ticketList.add(ticket);
			}
		}

		return ticketList;
	}

	public ListMultimap<String, Ticket> playerTicketsLoaded(ListMultimap<String, Ticket> tickets, World world) {
		return tickets;
	}
}
