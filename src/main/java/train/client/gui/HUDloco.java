package train.client.gui;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import org.lwjgl.opengl.GL11;
import train.common.api.DieselTrain;
import train.common.api.Locomotive;
import train.common.api.SteamTrain;
import train.common.library.Info;

public class HUDloco extends GuiScreen {

	private Minecraft game;
	private int windowWidth, windowHeight;

	@SubscribeEvent
	public void onGameRender(RenderGameOverlayEvent.Text event){
		if (game != null && game.thePlayer != null && game.thePlayer.ridingEntity != null && game.thePlayer.ridingEntity instanceof Locomotive && Minecraft.isGuiEnabled() && game.currentScreen == null) {
			renderSkillHUD(event, (Locomotive) game.thePlayer.ridingEntity);
		} else {
			this.game = this.mc = Minecraft.getMinecraft();
			this.fontRendererObj = this.game.fontRenderer;
		}
	}

	public void renderSkillHUD(RenderGameOverlayEvent event, Locomotive rcCar) {
		windowWidth = event.resolution.getScaledWidth();
		windowHeight = event.resolution.getScaledHeight() - 100;
		GL11.glColor4f(255, 255, 255, 255);
		renderBG(rcCar);
		/**
		 * Steam Train have water
		 */
		if (rcCar instanceof SteamTrain) {
			renderWaterBar(rcCar);
		}

		/**
		 * Some loco may not overheat in the future
		 */
		if (rcCar.canOverheat()) {
			renderOverheating(rcCar);
		}
		renderSpeedometer(rcCar);
		renderFuelBar(rcCar);
		renderText(rcCar);
	}

	private void renderBG(Locomotive rcCar) {
		GL11.glEnable(3042);
		GL11.glEnable(32826);
		this.zLevel = -90.0F;
		if (rcCar instanceof SteamTrain) {
			game.renderEngine.bindTexture(new ResourceLocation(Info.resourceLocation,Info.guiPrefix + "loco_hud_steam.png"));
		}
		else {
			game.renderEngine.bindTexture(new ResourceLocation(Info.resourceLocation,Info.guiPrefix + "locohud.png"));
		}
		drawTexturedModalRect(10, windowHeight, 0, 150, 137, 90);
		GL11.glDisable(32826);
		GL11.glDisable(3042);
	}

	private void renderText(Locomotive loco) {
		double speed = loco.getSpeed();

		int h;
		if (loco instanceof SteamTrain) {
			h = 15;
		}
		else {
			h = 13;
		}
		GL11.glEnable(3042 /* GL_BLEND */);
		GL11.glEnable(32826);
		fontRendererObj.drawStringWithShadow("Speed:", 106, windowHeight + 7 + (h), 0xFFFFFF);
		fontRendererObj.drawStringWithShadow("  " + (int) Math.abs(((float) (speed))), 106,
				windowHeight + 18 + (h), 0xFFFFFF);
		fontRendererObj.drawStringWithShadow(" Km/h", 106, windowHeight + 29 + (h), 0xFFFFFF);

		if (loco.canOverheat()) {
			fontRendererObj.drawStringWithShadow("State: " + loco.getState(), 50, windowHeight + 80, 0xFFFFFF);
		}
		GL11.glDisable(32826);
		GL11.glDisable(3042 /* GL_BLEND */);
	}

	private void renderFuelBar(Locomotive loco) {
		GL11.glEnable(3042 /* GL_BLEND */);
		GL11.glEnable(32826);
		int l;
		/**
		 * So that the content of the tank is renderer and not the fuel currently burned
		 */
		if (loco instanceof DieselTrain) {
			l = ((((DieselTrain) loco).getDiesel()));

			l = Math.abs(((l * 70) / (((DieselTrain) loco).getCartTankCapacity())));
		}
		else {
			l = loco.getFuelDiv(70);//scaled on 70 pixels 
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
		if (loco instanceof SteamTrain) {
			game.renderEngine.bindTexture(new ResourceLocation(Info.resourceLocation,Info.guiPrefix + "loco_hud_steam.png"));
		}
		else {
			game.renderEngine.bindTexture(new ResourceLocation(Info.resourceLocation,Info.guiPrefix + "locohud.png"));
		}
		/**
		 * Things are slightly different in Steam HUD
		 * because it's a black bar that is rendered that hides the color bar the black bar is rendered from top to bottom
		 */
		if (!(loco instanceof SteamTrain)) {
			drawTexturedModalRect(28, windowHeight + 11, 148, 150 + l, 7, 70 - l);// l max = 70
		}
		else {
			drawTexturedModalRect(34, windowHeight + 17, 154, 170 + l, 9, 70 - l);// l max = 70
		}
		// fontRendererObj.drawStringWithShadow("Fuel:", 4, (windowHeight/2)+1, 0xFFFFFF);
		GL11.glDisable(32826);
		GL11.glDisable(3042 /* GL_BLEND */);
	}

	private void renderWaterBar(Locomotive loco) {
		int l = ((SteamTrain) loco).getWater();
		int l_Scaled = Math.abs((l * 49) / ((SteamTrain) loco).getCartTankCapacity());
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
		if (l <= 1 && loco.getIsFuelled()) {
			this.drawGradientRect(0, 0, windowWidth, windowHeight + 100, 1615855616, -1602211792);
		}
	}

	private void renderSpeedometer(Locomotive loco) {
		double speed = loco.getSpeed();
		GL11.glEnable(3042);
		GL11.glEnable(32826);

		/**
		 * SteamTrain have different HUD
		 */
		if (loco instanceof SteamTrain) {
			game.renderEngine.bindTexture(new ResourceLocation(Info.resourceLocation,Info.guiPrefix + "loco_hud_steam.png"));
		}
		else {
			game.renderEngine.bindTexture(new ResourceLocation(Info.resourceLocation,Info.guiPrefix + "locohud.png"));
		}
		/**
		 * Scale the speed so that it doesn't go higher than 49 pixels
		 */
		double speedScaled = Math.abs((speed * 49) / 280);
		if (speedScaled > 49) {
			speedScaled = 49;
		}
		/**
		 * Things are slightly different in Steam HUD
		 */
		if (!(loco instanceof SteamTrain)) {
			drawTexturedModalRect(75, windowHeight + 37 - ((int) speedScaled) + (20), 163, 150, 30, 5);
		}
		else {
			drawTexturedModalRect(84, windowHeight + 37 - ((int) speedScaled) + (20), 177, 149, 16, 8);
		}
		GL11.glDisable(32826);
		GL11.glDisable(3042);
	}

	private void renderOverheating(Locomotive loco) {
		int overheatLevel = loco.getOverheatLevel();
		if (overheatLevel > loco.getOverheatTime() + 30) {
			overheatLevel = loco.getOverheatTime() + 30;
		}
		// fontRendererObj.drawStringWithShadow("Heat:", 33, (windowHeight/2)+1, 0xFFFFFF);
		GL11.glEnable(3042 /* GL_BLEND */);
		GL11.glEnable(32826);

		/**
		 * Steam Train have different HUD
		 */
		if (loco instanceof SteamTrain) {
			game.renderEngine.bindTexture(new ResourceLocation(Info.resourceLocation,Info.guiPrefix + "loco_hud_steam.png"));
		}
		else {
			game.renderEngine.bindTexture(new ResourceLocation(Info.resourceLocation,Info.guiPrefix + "locohud.png"));
		}

		int overheatScaled = Math.abs((overheatLevel * 49) / (loco.getOverheatTime() + 30));
		if (overheatScaled > 49) {
			overheatScaled = 49;
		}
		/**
		 * Things are slightly different in Steam HUD render overheat arrow black bar for steam train
		 */
		if (!(loco instanceof SteamTrain)) {
			drawTexturedModalRect(58, windowHeight + 37 - ( overheatScaled) + (20), 169, 158, 23, 5);
		}
		else {
			drawTexturedModalRect(56, windowHeight + 17, 176, (169 + overheatScaled), 5, 49 - overheatScaled);
		}
		GL11.glDisable(32826);
		GL11.glDisable(3042 /* GL_BLEND */);
	}

}
