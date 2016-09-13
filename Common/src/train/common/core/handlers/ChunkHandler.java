package src.train.common.core.handlers;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import net.minecraft.entity.Entity;
import net.minecraft.world.ChunkCoordIntPair;
import net.minecraft.world.World;
import net.minecraftforge.common.ForgeChunkManager;
import net.minecraftforge.common.ForgeChunkManager.Ticket;
import net.minecraftforge.event.ForgeSubscribe;
import net.minecraftforge.event.entity.EntityEvent;
import src.train.common.api.AbstractTrains;
import src.train.common.api.EntityBogie;
import src.train.common.api.Locomotive;

import com.google.common.collect.LinkedListMultimap;
import com.google.common.collect.ListMultimap;

public class ChunkHandler implements ForgeChunkManager.LoadingCallback, ForgeChunkManager.OrderedLoadingCallback, ForgeChunkManager.PlayerOrderedLoadingCallback {
	private static ChunkHandler instance;

	public static ChunkHandler getInstance() {
		if (instance == null) {
			instance = new ChunkHandler();
		}

		return instance;
	}
	
	@ForgeSubscribe
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
				if(((EntityBogie) var2).entityMainTrain!=null && ((EntityBogie) var2).entityMainTrain instanceof AbstractTrains){
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
	public List ticketsLoaded(List var1, World var2, int var3) {
		HashSet var4 = new HashSet();
		HashSet var5 = new HashSet();
		Iterator var6 = var1.iterator();

		while (var6.hasNext()) {
			ForgeChunkManager.Ticket var7 = (ForgeChunkManager.Ticket) var6.next();
			Entity var8 = var7.getEntity();
			if (var8 instanceof AbstractTrains) {
				var5.add(var7);
			}
		}

		LinkedList var13 = new LinkedList();
		var13.addAll(var5);
		var13.addAll(var4);
		return var13;
	}
	@Override
	public ListMultimap playerTicketsLoaded(ListMultimap var1, World var2) {
		return LinkedListMultimap.create();
	}
}
