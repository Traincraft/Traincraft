package train.entity.gui;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import ebf.tim.TrainsInMotion;
import ebf.tim.entities.EntityTrainCore;
import ebf.tim.utility.FuelHandler;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import org.lwjgl.opengl.GL11;
import train.library.Info;

public class HUDloco extends GuiScreen {

	private Minecraft game;
	private int windowWidth, windowHeight;

	@SubscribeEvent
	public void onGameRender(RenderGameOverlayEvent.Text event){
		if (game != null && game.thePlayer != null && game.thePlayer.ridingEntity instanceof EntityTrainCore && Minecraft.isGuiEnabled() && game.currentScreen == null) {
			renderSkillHUD(event, (EntityTrainCore) game.thePlayer.ridingEntity);
		} else {
			this.game = this.mc = Minecraft.getMinecraft();
			this.fontRendererObj = this.game.fontRenderer;
		}
	}

	public void renderSkillHUD(RenderGameOverlayEvent event, EntityTrainCore rcCar) {
		windowWidth = event.resolution.getScaledWidth();
		windowHeight = event.resolution.getScaledHeight() - 100;
		GL11.glColor4f(255, 255, 255, 255);
		renderBG(rcCar);
		/**
		 * Steam Train have water
		 */
		if (rcCar.getTypes().contains(TrainsInMotion.transportTypes.STEAM)) {
			renderWaterBar(rcCar);
			renderOverheating(rcCar);
		}
		renderSpeedometer(rcCar);
		renderFuelBar(rcCar);
		renderText(rcCar);
	}

	private void renderBG(EntityTrainCore rcCar) {
		GL11.glEnable(3042);
		GL11.glEnable(32826);
		this.zLevel = -90.0F;
		if (rcCar.getTypes().contains(TrainsInMotion.transportTypes.STEAM)) {
			game.renderEngine.bindTexture(new ResourceLocation(Info.resourceLocation,Info.guiPrefix + "loco_hud_steam.png"));
		}
		else {
			game.renderEngine.bindTexture(new ResourceLocation(Info.resourceLocation,Info.guiPrefix + "locohud.png"));
		}
		drawTexturedModalRect(10, windowHeight, 0, 150, 137, 90);
		GL11.glDisable(32826);
		GL11.glDisable(3042);
	}

	private void renderText(EntityTrainCore loco) {
		double speed =(Math.abs(loco.motionX)+Math.abs(loco.motionZ))*0.05;//*0.05 same as /20 and not prone to error on speed 0

		int h;
		if (loco.getTypes().contains(TrainsInMotion.transportTypes.STEAM)) {
			h = 15;
		}
		else {
			h = 13;
		}
		GL11.glEnable(3042 /* GL_BLEND */);
		GL11.glEnable(32826);
		fontRendererObj.drawStringWithShadow("Speed:", 106, windowHeight + 7 + (h), 0xFFFFFF);
		fontRendererObj.drawStringWithShadow("  " + Math.floor(speed*0.27777777777), 106,
				windowHeight + 18 + (h), 0xFFFFFF);
		fontRendererObj.drawStringWithShadow(" Km/h", 106, windowHeight + 29 + (h), 0xFFFFFF);

		if (loco.getTypes().contains(TrainsInMotion.transportTypes.STEAM)) {
			fontRendererObj.drawStringWithShadow("State: " + getState(loco.fuelHandler), 50, windowHeight + 80, 0xFFFFFF);
		}
		GL11.glDisable(32826);
		GL11.glDisable(3042 /* GL_BLEND */);
	}

	private String getState(FuelHandler fuel){
		if(fuel.burnHeat<70){
			return "cold";
		} else if (fuel.burnHeat<100){
			return "warm";
		} else if(fuel.burnHeat<300){
			return "hot";
		} else {
			return "very hot";
		}
	}

	private void renderFuelBar(EntityTrainCore loco) {
		GL11.glEnable(3042 /* GL_BLEND */);
		GL11.glEnable(32826);
		int l;
		/**
		 * So that the content of the tank is renderer and not the fuel currently burned
		 */
		if (loco.getTypes().contains(TrainsInMotion.transportTypes.DIESEL)) {
			l = loco.getTankInfo(null)[0]!=null?loco.getTankInfo(null)[0].fluid.amount:1;
			l = Math.abs(((l * 70) / ( loco.getTankCapacity()[0])));
		}
		else {
			l = loco.getTankInfo(null)[0]!=null?loco.getTankInfo(null)[0].fluid.amount:1;
			l= ((l * 70) / 1200);//scaled on 70 pixels
		}
		if (l > 70) {
			l = 70;// to fit the 70 pixels bar
		}
		if (l < 0) {
			l = 0;
		}

		/**
		 * Steam Train have different HUD
		 */
		if (loco.getTypes().contains(TrainsInMotion.transportTypes.STEAM)) {
			game.renderEngine.bindTexture(new ResourceLocation(Info.resourceLocation,Info.guiPrefix + "loco_hud_steam.png"));
		}
		else {
			game.renderEngine.bindTexture(new ResourceLocation(Info.resourceLocation,Info.guiPrefix + "locohud.png"));
		}
		/**
		 * Things are slightly different in Steam HUD
		 * because it's a black bar that is rendered that hides the color bar the black bar is rendered from top to bottom
		 */
		if (!(loco.getTypes().contains(TrainsInMotion.transportTypes.STEAM))) {
			drawTexturedModalRect(28, windowHeight + 11, 148, 150 + l, 7, 70 - l);// l max = 70
		}
		else {
			drawTexturedModalRect(34, windowHeight + 17, 154, 170 + l, 9, 70 - l);// l max = 70
		}
		// fontRendererObj.drawStringWithShadow("Fuel:", 4, (windowHeight/2)+1, 0xFFFFFF);
		GL11.glDisable(32826);
		GL11.glDisable(3042 /* GL_BLEND */);
	}

	private void renderWaterBar(EntityTrainCore loco) {
		int l = loco.getTankInfo(null)[0]!=null?loco.getTankInfo(null)[0].fluid.amount:0;
		int l_Scaled = Math.abs((l * 49) / loco.getTankCapacity()[0]);
		if (l_Scaled > 49) {
			l_Scaled = 49;// to fit the 49 pixels bar
		}
		if (l_Scaled < 0) {
			l_Scaled = 0;
		}
		/**
		 * because it's a black bar that is rendered that hides the color bar the black bar is rendered from top to bottom
		 */
		GL11.glEnable(3042 /* GL_BLEND */);
		GL11.glEnable(32826);
		drawTexturedModalRect(70, windowHeight + 17, 190, 169 + l_Scaled, 6, 49 - l_Scaled);// l max = 49
		GL11.glDisable(32826);
		GL11.glDisable(3042 /* GL_BLEND */);
		/* this is for the red overlay if you don't put water into steam trains */
		if (l <= 1 && loco.fuelHandler.burnHeat>0) {
			this.drawGradientRect(0, 0, windowWidth, windowHeight + 100, 1615855616, -1602211792);
		}
	}

	private void renderSpeedometer(EntityTrainCore loco) {
		double speed =(Math.abs(loco.motionX)+Math.abs(loco.motionZ))*0.05;//*0.05 same as /20 and not prone to error on speed 0
		GL11.glEnable(3042);
		GL11.glEnable(32826);

		/**
		 * SteamTrain have different HUD
		 */
		if (loco.getTypes().contains(TrainsInMotion.transportTypes.STEAM)) {
			game.renderEngine.bindTexture(new ResourceLocation(Info.resourceLocation,Info.guiPrefix + "loco_hud_steam.png"));
		}
		else {
			game.renderEngine.bindTexture(new ResourceLocation(Info.resourceLocation,Info.guiPrefix + "locohud.png"));
		}
		/**
		 * Scale the speed so that it doesn't go higher than 49 pixels
		 */
		double speedScaled = Math.abs((Math.floor(speed*0.27777777777) * 49) / 280);
		if (speedScaled > 49) {
			speedScaled = 49;
		}
		/**
		 * Things are slightly different in Steam HUD
		 */
		if (!(loco.getTypes().contains(TrainsInMotion.transportTypes.STEAM))) {
			drawTexturedModalRect(75, windowHeight + 37 - ((int) speedScaled) + (20), 163, 150, 30, 5);
		}
		else {
			drawTexturedModalRect(84, windowHeight + 37 - ((int) speedScaled) + (20), 177, 149, 16, 8);
		}
		GL11.glDisable(32826);
		GL11.glDisable(3042);
	}

	private void renderOverheating(EntityTrainCore loco) {
		int overheatLevel = loco.fuelHandler.burnHeat;
		if (overheatLevel > 70) {
			overheatLevel += 30;
		}
		// fontRendererObj.drawStringWithShadow("Heat:", 33, (windowHeight/2)+1, 0xFFFFFF);
		GL11.glEnable(3042 /* GL_BLEND */);
		GL11.glEnable(32826);

		/**
		 * Steam Train have different HUD
		 */
		if (loco.getTypes().contains(TrainsInMotion.transportTypes.STEAM)) {
			game.renderEngine.bindTexture(new ResourceLocation(Info.resourceLocation,Info.guiPrefix + "loco_hud_steam.png"));
		}
		else {
			game.renderEngine.bindTexture(new ResourceLocation(Info.resourceLocation,Info.guiPrefix + "locohud.png"));
		}

		int overheatScaled = Math.abs((overheatLevel * 49) / (130));
		if (overheatScaled > 49) {
			overheatScaled = 49;
		}
		/**
		 * Things are slightly different in Steam HUD render overheat arrow black bar for steam train
		 */
		if (!(loco.getTypes().contains(TrainsInMotion.transportTypes.STEAM))) {
			drawTexturedModalRect(58, windowHeight + 37 - ( overheatScaled) + (20), 169, 158, 23, 5);
		}
		else {
			drawTexturedModalRect(56, windowHeight + 17, 176, (169 + overheatScaled), 5, 49 - overheatScaled);
		}
		GL11.glDisable(32826);
		GL11.glDisable(3042 /* GL_BLEND */);
	}

}
