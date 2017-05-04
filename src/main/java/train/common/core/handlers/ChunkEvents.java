package train.common.core.handlers;

import com.google.common.collect.LinkedListMultimap;
import com.google.common.collect.ListMultimap;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.world.World;
import net.minecraftforge.common.ForgeChunkManager;
import net.minecraftforge.common.ForgeChunkManager.Ticket;
import net.minecraftforge.event.entity.EntityEvent;
import train.common.api.AbstractTrains;
import train.common.api.EntityBogie;
import train.common.api.EntityRollingStock;

import java.util.ArrayList;
import java.util.List;

public class ChunkEvents implements ForgeChunkManager.LoadingCallback, ForgeChunkManager.OrderedLoadingCallback, ForgeChunkManager.PlayerOrderedLoadingCallback {

	@SuppressWarnings("unused")
	@SubscribeEvent
	public void entityEnteredChunk(EntityEvent.EnteringChunk event) {
		if (event.entity instanceof EntityBogie) {
			if (((EntityBogie) event.entity).entityMainTrain == null){
				return;
			}
			if(!event.entity.worldObj.isRemote) {
				((EntityBogie)event.entity).entityMainTrain.forceChunkLoading(((EntityBogie)event.entity).entityMainTrain.chunkCoordX, ((EntityBogie)event.entity).entityMainTrain.chunkCoordZ, event.newChunkX, event.newChunkZ);
			} else {
				((EntityBogie)event.entity).entityMainTrain.collectNearbyChunks(((EntityBogie)event.entity).entityMainTrain.chunkCoordX, ((EntityBogie)event.entity).entityMainTrain.chunkCoordZ,event.newChunkX, event.newChunkZ);
			}
			return;
		} else if (event.entity instanceof EntityRollingStock){
			if(!event.entity.worldObj.isRemote) {
				((EntityRollingStock)event.entity).forceChunkLoading(event.newChunkX, event.newChunkZ,
						((EntityRollingStock)event.entity).bogieLoco!=null?((EntityRollingStock)event.entity).bogieLoco.chunkCoordX:((EntityRollingStock)event.entity).chunkCoordX,
						((EntityRollingStock)event.entity).bogieLoco!=null?((EntityRollingStock)event.entity).bogieLoco.chunkCoordZ:((EntityRollingStock)event.entity).chunkCoordZ);
			} else {
				((EntityRollingStock)event.entity).collectNearbyChunks(event.newChunkX, event.newChunkZ,
						((EntityRollingStock)event.entity).bogieLoco!=null?((EntityRollingStock)event.entity).bogieLoco.chunkCoordX:((EntityRollingStock)event.entity).chunkCoordX,
						((EntityRollingStock)event.entity).bogieLoco!=null?((EntityRollingStock)event.entity).bogieLoco.chunkCoordZ:((EntityRollingStock)event.entity).chunkCoordZ);
			}
			return;
		}

		if(event.entity instanceof AbstractTrains) {
			if(!event.entity.worldObj.isRemote) {
				((AbstractTrains)event.entity).forceChunkLoading(event.newChunkX, event.newChunkZ);
			} else {
				((AbstractTrains)event.entity).collectNearbyChunks(event.newChunkX, event.newChunkZ);
			}
		}

	}


	public void ticketsLoaded(List<Ticket> tickets, World world) {

		for(Ticket ticket : tickets) {
			if(!ticket.isPlayerTicket()) {
				if(ticket.getEntity() instanceof AbstractTrains) {
					AbstractTrains train = (AbstractTrains)ticket.getEntity();
					train.setTicket(ticket);
					train.forceChunkLoading(train.chunkCoordX, train.chunkCoordZ);
				}
			}
		}

	}

	public List<Ticket> ticketsLoaded(List<Ticket> tickets, World world, int maxTicketCount) {
		List<Ticket> bogieTickets = new ArrayList<Ticket>();
		for(Ticket ticket : tickets){
			if(ticket.getEntity() instanceof EntityBogie) {
				bogieTickets.add(ticket);
			} else if(ticket.getEntity() instanceof AbstractTrains) {
				bogieTickets.add(ticket);
			}
		}

		return bogieTickets;
	}

	public ListMultimap<String, Ticket> playerTicketsLoaded(ListMultimap<String, Ticket> tickets, World world) {
		return LinkedListMultimap.create();
	}
}
