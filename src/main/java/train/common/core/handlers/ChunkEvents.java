package train.common.core.handlers;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.google.common.collect.LinkedListMultimap;
import com.google.common.collect.ListMultimap;
import com.google.common.eventbus.Subscribe;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.entity.Entity;
import net.minecraft.world.ChunkCoordIntPair;
import net.minecraft.world.World;
import net.minecraftforge.common.ForgeChunkManager;
import net.minecraftforge.common.ForgeChunkManager.Ticket;
import net.minecraftforge.event.entity.EntityEvent;
import train.common.api.AbstractTrains;
import train.common.api.EntityBogie;
import train.common.api.Locomotive;

public class ChunkEvents implements ForgeChunkManager.LoadingCallback, ForgeChunkManager.PlayerOrderedLoadingCallback {

	@SubscribeEvent
	public void entityEnteredChunk(EntityEvent.EnteringChunk var1) {
		Entity var2 = var1.entity;
		//System.out.println("entered "+var2);
		if (var2 instanceof AbstractTrains) {
			if (!var2.worldObj.isRemote) {
				AbstractTrains stock = (AbstractTrains) var2;
				Ticket ticket = stock.getChunkTicket();
				//System.out.println(stock+" "+stock.shouldChunkLoad);
				if(ticket!=null && stock.shouldChunkLoad)stock.forceChunkLoading(ticket);
			}
		}
		if (var2 instanceof EntityBogie) {
			if (!var2.worldObj.isRemote) {
				if(((EntityBogie) var2).entityMainTrain!=null){
					AbstractTrains stock = ((EntityBogie) var2).entityMainTrain;
					Ticket ticket = stock.getChunkTicket();
					if(ticket!=null && stock.shouldChunkLoad)stock.forceChunkLoading(ticket);
				}
			}
		}
		if(var2 instanceof AbstractTrains && !(var2 instanceof Locomotive)){
			AbstractTrains stock = (AbstractTrains) var2;
			if (stock.train != null && stock.train.getTrains().size() > 1){
				for (int i = 0; i < stock.train.getTrains().size(); i++) {
					if(stock.train.getTrains().get(i)!=null && stock.train.getTrains().get(i) instanceof Locomotive){
						Locomotive loco = (Locomotive) stock.train.getTrains().get(i);
						Ticket ticket = loco.getChunkTicket();
						if(ticket!=null && loco.shouldChunkLoad)loco.forceChunkLoading(ticket);
					}
				}
			}
		}
	}

	public Set getChunksAround(int var1, int var2, int var3) {
		HashSet var4 = new HashSet();
		var4.add(new ChunkCoordIntPair(var1, var2));
		return var4;
	}

	private void printAnchor(String var1, int var2, int var3, int var4) {
		//System.out.println( "{0} found at [{1},{2},{3}]"+new Object[] {var1, Integer.valueOf(var2), Integer.valueOf(var3), Integer.valueOf(var4)});
	}
	@Override
	public void ticketsLoaded(List var1, World var2) {
		//TODO railcraft support for chunkloaders
		/*Iterator var3 = var1.iterator();

		while (var3.hasNext()) {
			ForgeChunkManager.Ticket var4 = (ForgeChunkManager.Ticket) var3.next();
			Entity var5 = var4.getEntity();

			if (var5 instanceof AbstractTrains) {
				AbstractTrains var11 = (AbstractTrains) var5;
				var11.setChunkTicket(var4);
				var11.forceChunkLoading(var11.chunkCoordX, var11.chunkCoordZ);
				this.printAnchor(var11.getEntityName(), (int) var5.posX, (int) var5.posY, (int) var5.posZ);
			}
		}*/
	}

	@Override
	public ListMultimap playerTicketsLoaded(ListMultimap var1, World var2) {
		return LinkedListMultimap.create();
	}
}
