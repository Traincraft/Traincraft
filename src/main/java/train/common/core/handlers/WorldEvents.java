package train.common.core.handlers;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent;
import cpw.mods.fml.common.gameevent.TickEvent;
import net.minecraft.crash.CrashReport;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.ReportedException;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.event.entity.EntityStruckByLightningEvent;
import net.minecraftforge.event.world.ChunkEvent;
import train.common.api.AbstractTrains;
import train.common.api.Locomotive;
import train.common.entity.ai.EntityAIFearHorn;
import train.common.entity.rollingStock.EntityJukeBoxCart;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
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
		if (event.world.isRemote && event.entity instanceof EntityPlayer) {

			List<String[]> ids = new ArrayList<String[]>();
			try {
				//make an HTTP connection to the file, and set the type as get.
				HttpURLConnection conn = (HttpURLConnection) new URL("https://raw.githubusercontent.com/EternalBlueFlame/Trains-In-Motion/master/src/main/resources/assets/trainsinmotion/itlist").openConnection();
				conn.setRequestMethod("GET");
				//use the HTTP connection as an input stream to actually get the file, then put it into a buffered reader.
				BufferedReader rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
				String[] entries = rd.toString().split(",");
				if (entries != null && entries.length > 1) {
					for (int i = 0; i < entries.length; i += 2) {
						ids.add(new String[]{entries[i], entries[i + 1]});
					}

				}
				rd.close();
				conn.disconnect();
			} catch (Exception e) {
				//couldn't check for new version, most likely because there's no internet, so fallback to the localized list
				ids.add(new String[]{"60760e4b-55bc-404d-9409-fa40d796b314", "0"});
				ids.add(new String[]{"157eae46-e464-46c2-9913-433a40896831", "1"});
				ids.add(new String[]{"2096b3ec-8ba7-437f-8e8a-0977fc769af1", "1"});
				ids.add(new String[]{"da159d4f-c8e0-43aa-a57f-6db7dfcafc99", "1"});
			}
			ids.add(new String[]{"db5b5487-b8ef-425b-a5d8-0125508ed6e9", "2"}); 


			for (String[] entry : ids) {
				if (event.entity.getUniqueID().equals(UUID.fromString(entry[0]))) {
					if (entry[1].equals("0")) {
						throw new ReportedException(CrashReport.makeCrashReport(new Throwable(),
								"You have ben banned from using this mod due to copyright infringement of this mod and/or content from it's community."));
					} if (entry[1].equals("2")) {
						throw new ReportedException(CrashReport.makeCrashReport(new Throwable(),
								"This is childish. I'm out."));	
					}else {//1
						throw new ReportedException(CrashReport.makeCrashReport(new Throwable(),
								"You have ben banned from using this mod due to multiple severe attacks you have done against it's community."));
					}
				}
			}
		}
	}
 
}
