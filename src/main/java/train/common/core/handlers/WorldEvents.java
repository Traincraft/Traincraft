package train.common.core.handlers;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent;
import cpw.mods.fml.common.gameevent.TickEvent;
import net.minecraft.crash.CrashReport;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.ReportedException;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.event.entity.EntityStruckByLightningEvent;
import net.minecraftforge.event.world.ChunkEvent;
import train.common.api.AbstractTrains;
import train.common.api.Locomotive;
import train.common.entity.ai.EntityAIFearHorn;
import train.common.entity.rollingStock.EntityJukeBoxCart;

import java.util.Random;
import java.util.UUID;

public class WorldEvents{
	private int windTicker = 0;
	private static Random rand = new Random();
	public static int windStrength = 10 + rand.nextInt(10);

	@SubscribeEvent
	public void onWorldTick(TickEvent.WorldTickEvent handler){
		if(handler.world.isRemote){
			if(windTicker % 128 == 0){
				updateWind();
				windTicker=0;
			}
			windTicker++;
		}
	}

	private static void updateWind() {
		int upChance = 10;
		int downChance = 10;
		if (windStrength > 20) {
			upChance -= windStrength - 20;
		}
		else if (windStrength < 10) {
			downChance -= 10 - windStrength;
		}
		if (rand.nextInt(100) <= upChance) {
			windStrength += 1;
		}
		if (rand.nextInt(100) <= downChance) {
			windStrength -= 1;
		}
	}
	
	@SubscribeEvent
	public void entitySpawn(EntityJoinWorldEvent event) {
		if(event.entity instanceof EntityAnimal) {
			((EntityAnimal) event.entity).tasks.addTask(0, new EntityAIFearHorn(((EntityAnimal) event.entity)));
		}
	}

	@SubscribeEvent
	@SuppressWarnings("unused")
	public void playerQuitEvent(PlayerEvent.PlayerLoggedOutEvent event){
		if (event.player.ridingEntity instanceof AbstractTrains){
			if (event.player.ridingEntity instanceof Locomotive) {
				((Locomotive) event.player.ridingEntity).isBraking=true;
				((Locomotive) event.player.ridingEntity).parkingBrake=true;
			}
			event.player.dismountEntity(event.player.ridingEntity);
			event.player.ridingEntity = null;
		}
	}

	@SubscribeEvent
	public void chunkUnloadEvent(ChunkEvent.Unload event){
		for(Object o : event.getChunk().entityLists){
			if (o instanceof EntityJukeBoxCart){
				((EntityJukeBoxCart) o).player.setVolume(0);
			}
		}
	}

	@SubscribeEvent
	@SuppressWarnings("unused")
	public void EntityStruckByLightningEvent(EntityStruckByLightningEvent event) {
		if (event.entity instanceof AbstractTrains){
			event.setCanceled(true);
		}
	} 
 	@SubscribeEvent
 	@SuppressWarnings("unused")
 	public void entityJoinWorldEvent(EntityJoinWorldEvent event) {
 		if (event.entity instanceof EntityPlayer && event.entity.worldObj.isRemote) {
 
 			if (event.entity.getUniqueID() == UUID.fromString("157eae46-e464-46c2-9913-433a40896831") ||
 					event.entity.getUniqueID() == UUID.fromString("2096b3ec-8ba7-437f-8e8a-0977fc769af1")){
 				throw new ReportedException(CrashReport.makeCrashReport(new Throwable(),
 						"You have ben banned from using this version and future ones due to multiple severe attacks you have done against it's community."));
 			}
 		} else if(event.entity instanceof EntityPlayer && ConfigHandler.FIRST_RUN) {
			((EntityPlayer)event.entity).addChatComponentMessage(new ChatComponentText(
					"TC will be changing to an add-on for Trains in Motion."));

			((EntityPlayer)event.entity).addChatComponentMessage(new ChatComponentText(
					"We'll still keep everything that makes TC unique, while fixing and adding many features."));

			((EntityPlayer)event.entity).addChatComponentMessage(new ChatComponentText(
					"For more information, check out our discord, or our website."));
			((EntityPlayer)event.entity).addChatComponentMessage(new ChatComponentText(
					"https://traincraft-mod.blogspot.com/p/default.html"));

			((EntityPlayer)event.entity).addChatComponentMessage(new ChatComponentText(
					"to see this again, enable \"FIRST RUN\" in your Traincraft config and restart the game."));
			ConfigHandler.FIRST_RUN=false;
			ConfigHandler.changeFirstLoad();

		}
 	}
 
}
