package src.train.client.gui;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;

import src.train.common.api.DieselTrain;
import src.train.common.api.Locomotive;
import src.train.common.api.SteamTrain;
import src.train.common.library.Info;

public class HUDloco extends GuiScreen {

	private Minecraft game;
	private int windowWidth, wave = 0, windowHeight;
	private int sizeX = 137;
	private int sizeY = 90;
	private int j;
	private int k;

	public HUDloco(Minecraft game) {
		this.game = game;
		fontRendererObj = Minecraft.getMinecraft().fontRenderer;
	}

	public void renderSkillHUD(Locomotive rcCar) {
		windowWidth = new ScaledResolution(game, game.displayWidth, game.displayHeight).getScaledWidth();
		windowHeight = new ScaledResolution(game, game.displayWidth, game.displayHeight).getScaledHeight();
		j = (windowWidth - sizeX) / 2;
		k = (windowHeight - sizeY) / 2;
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
		GL11.glEnable(3042 /* GL_BLEND */);
		GL11.glEnable(32826);
		this.zLevel = -90.0F;
		RenderHelper.enableStandardItemLighting();
		RenderHelper.disableStandardItemLighting();
		GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
		if (rcCar instanceof SteamTrain) {
			game.renderEngine.bindTexture(new ResourceLocation(Info.resourceLocation,Info.guiPrefix + "loco_hud_steam.png"));
		}
		else {
			game.renderEngine.bindTexture(new ResourceLocation(Info.resourceLocation,Info.guiPrefix + "locohud.png"));
		}

		drawTexturedModalRect(0, (windowHeight / 2) - 0, 0, 150, 137, 90);

		GL11.glDisable(32826);
		GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
		GL11.glDisable(3042 /* GL_BLEND */);
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
		GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
		fontRendererObj.drawStringWithShadow("Speed:", 96, (windowHeight / 2) + 7 + (h), 0xFFFFFF);
		fontRendererObj.drawStringWithShadow("  " + ((int) Math.abs(((float) (speed)))) + "", 96, (windowHeight / 2) + 18 + (h), 0xFFFFFF);
		fontRendererObj.drawStringWithShadow(" " + "Km/h", 96, (windowHeight / 2) + 29 + (h), 0xFFFFFF);

		if (loco.canOverheat()) {
			fontRendererObj.drawStringWithShadow("State: " + ((Locomotive) loco).getState(), 40, (windowHeight / 2) + 80, 0xFFFFFF);
		}
		GL11.glDisable(32826);
		GL11.glDisable(3042 /* GL_BLEND */);
		GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
	}

	private void renderFuelBar(Locomotive loco) {
		GL11.glEnable(3042 /* GL_BLEND */);
		GL11.glEnable(32826);
		GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
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
		 * because it's a black bar that is rendered that hides the color bar the black bar is rendered from top to bottom
		 */
		int t = 70 - l;

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
		 */
		if (!(loco instanceof SteamTrain)) {
			drawTexturedModalRect(18, (windowHeight / 2) + 11, 148, 150 + l, 7, t);// l max = 70
		}
		else {
			drawTexturedModalRect(24, (windowHeight / 2) + 17, 154, 170 + l, 9, t);// l max = 70
		}
		// fontRendererObj.drawStringWithShadow("Fuel:", 4, (windowHeight/2)+1, 0xFFFFFF);
		GL11.glDisable(32826);
		GL11.glDisable(3042 /* GL_BLEND */);
		GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
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
		int t = 49 - l_Scaled;

		GL11.glEnable(3042 /* GL_BLEND */);
		GL11.glEnable(32826);
		GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
		drawTexturedModalRect(60, (windowHeight / 2) + 17, 190, 169 + l_Scaled, 6, t);// l max = 49
		GL11.glDisable(32826);
		GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
		GL11.glDisable(3042 /* GL_BLEND */);
		if (l <= 1 && loco.getIsFuelled()) {
			this.drawGradientRect(0, 0, windowWidth, windowHeight, 1615855616, -1602211792);
		}
	}

	private void renderSpeedometer(Locomotive loco) {
		double speed = loco.getSpeed();
		GL11.glEnable(3042);
		GL11.glEnable(32826);
		GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);

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
			drawTexturedModalRect(65, (windowHeight / 2) + 37 - ((int) speedScaled) + (20), 163, 150, 30, 5);// l max = 70
		}
		else {
			drawTexturedModalRect(74, (windowHeight / 2) + 37 - ((int) speedScaled) + (20), 177, 149, 16, 8);// l max = 70
		}
		GL11.glDisable(32826);
		GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
		GL11.glDisable(3042);
	}

	private void renderOverheating(Locomotive loco) {
		double overheatLevel = loco.getOverheatLevel();
		if (overheatLevel > loco.getOverheatTime() + 30) {
			overheatLevel = loco.getOverheatTime() + 30;
		}
		// fontRendererObj.drawStringWithShadow("Heat:", 33, (windowHeight/2)+1, 0xFFFFFF);
		GL11.glEnable(3042 /* GL_BLEND */);
		GL11.glEnable(32826);
		GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);

		/**
		 * Steam Train have different HUD
		 */
		if (loco instanceof SteamTrain) {
			game.renderEngine.bindTexture(new ResourceLocation(Info.resourceLocation,Info.guiPrefix + "loco_hud_steam.png"));
		}
		else {
			game.renderEngine.bindTexture(new ResourceLocation(Info.resourceLocation,Info.guiPrefix + "locohud.png"));
		}

		double overheatScaled = Math.abs((overheatLevel * 49) / (loco.getOverheatTime() + 30));
		if (overheatScaled > 49) {
			overheatScaled = 49;
		}
		int t = (int) (49 - overheatScaled);
		/**
		 * Things are slightly different in Steam HUD render overheat arrow black bar for steam train
		 */
		if (!(loco instanceof SteamTrain)) {
			drawTexturedModalRect(48, (windowHeight / 2) + 37 - ((int) overheatScaled) + (20), 169, 158, 23, 5);//

		}
		else {
			drawTexturedModalRect(46, (windowHeight / 2) + 17, 176, (int) (169 + overheatScaled), 5, t);// l max = 49
		}
		GL11.glDisable(32826);
		GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
		GL11.glDisable(3042 /* GL_BLEND */);
	}
	
	@Override
	public void onGuiClosed() {}
}
