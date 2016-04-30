package src.train.client.core.handlers;

import java.util.EnumSet;

import cpw.mods.fml.common.gameevent.TickEvent;
import org.lwjgl.Sys;

import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.AbstractClientPlayer;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.renderer.IImageBuffer;
import net.minecraft.client.renderer.ThreadDownloadImageData;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.StringUtils;
import src.train.client.core.helpers.CapesHelper;
import src.train.client.gui.HUDloco;
import src.train.common.Traincraft;
import src.train.common.api.Locomotive;
import src.train.common.core.TrainModCore;
import src.train.common.library.BlockIDs;
import src.train.common.library.Info;
import cpw.mods.fml.common.FMLLog;
import cpw.mods.fml.common.ITickHandler;

public class ClientTickHandler implements ITickHandler {
	private static final Minecraft mc = Minecraft.getMinecraft();
	private static boolean isHidden = false;
	private HUDloco locoHUD = new HUDloco(Traincraft.proxy.getClientInstance());

	@Override
	public void tickStart(EnumSet<TickEvent.Type> type, Object... tickData) {
		if(type.equals(EnumSet.of(TickEvent.Type.CLIENT))) {
    		if(mc.theWorld != null && mc != null && mc.theWorld.playerEntities != null) {
    			for (int i = 0; i < mc.theWorld.playerEntities.size(); i++) {
    				AbstractClientPlayer player = (AbstractClientPlayer)mc.theWorld.playerEntities.get(i);
    				CapesHelper user = CapesHelper.users.get(player.getDisplayName());
    				if(user == null ) {
    					user = new CapesHelper(player.getDisplayName());
    					CapesHelper.users.put(player.getDisplayName(), user);
    					user.setDaemon(true);
    					user.setName("Cape for " + player.getDisplayName());
    					user.start();
    				}else if((user.isLoaded) && (user.MCCape)) {
    					player.downloadImageCape = user.getCurrentImage();
    					player.locationCape = user.getCurrentRL();
    				}
    			}
    		}
    		if(!isHidden) {
    			if(mc.theWorld != null && mc != null && mc.theWorld.playerEntities != null) {
    				Traincraft.proxy.doNEICheck(BlockIDs.tcRail.blockID);
        			Traincraft.proxy.doNEICheck(BlockIDs.tcRailGag.blockID);
    				isHidden = true;
    			}
    		}
		}
	}

	@Override
	public void tickEnd(EnumSet<TickEvent.Type> type, Object... tickData) {
		if(type.equals(EnumSet.of(TickEvent.Type.RENDER))) {
			onRenderTick();
		}
	}

	@Override
	public EnumSet<TickEvent.Type> ticks() {
		return EnumSet.of(TickEvent.Type.RENDER, TickEvent.Type.CLIENT);
	}

	@Override
	public String getLabel() {
		return "TC tick handler";
	}

	public void onRenderTick() {
		if (mc.thePlayer != null && mc.thePlayer.ridingEntity != null && mc.thePlayer.ridingEntity instanceof Locomotive && mc.isGuiEnabled() && mc.currentScreen == null) {
			locoHUD.renderSkillHUD((Locomotive) mc.thePlayer.ridingEntity);
		}
		//return;
	}
	
	public static ResourceLocation capeStaticRL(String username) {
		return new ResourceLocation("cloaks/" + StringUtils.stripControlCodes(username));
	}
 
	public static ResourceLocation capeAnimatedRL(String username, int frameNumber) {
		return new ResourceLocation("cloaks/" + StringUtils.stripControlCodes(username) + "/" + frameNumber);
	}
 
	public static ThreadDownloadImageData dlImage(ResourceLocation rl, String url) {
		return EntityPlayerSP.getDownloadImage(rl, url, (ResourceLocation)null, (IImageBuffer)null);
	}	
}