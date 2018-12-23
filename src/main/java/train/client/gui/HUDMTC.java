package train.client.gui;


import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Gui;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.Vec3;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import train.common.api.Locomotive;
import train.common.api.SteamTrain;
import train.common.library.Info;

import static train.common.adminbook.GUIAdminBook.drawTexturedRect;

public class HUDMTC extends GuiScreen {

	private Minecraft game;
	private int windowWidth, windowHeight;

//test15
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

		if (rcCar.mtcStatus == 1) {
			/**
			 * Steam Train have water
			 */
			String mtcStatus = "";
			if (rcCar.mtcStatus == 0) {
				mtcStatus = "Inactive";
			}

			if (rcCar.mtcStatus == 1) {
				mtcStatus = "Active";
			}
			if (rcCar.mtcStatus == 2) {
				mtcStatus = "Ending Soon";
			}
			if (rcCar.mtcStatus == 3) {

				mtcStatus = "Ended";
			}
			int width = this.game.fontRenderer.getStringWidth("Speed Limit: " + rcCar.speedLimit + " km/h");

			int width2 = this.game.fontRenderer.getStringWidth("");
			int height = this.game.fontRenderer.FONT_HEIGHT;
			int padding = 2;
			int margin = 4;
			int xPos = 0 + margin;
			int yPos = 0 + margin;
			Gui.drawRect(xPos, yPos, xPos + width + padding * 2 + 70, yPos + height + padding + padding + 35, 0xAA000000);

			if (rcCar.atoStatus == 1) {
				this.drawString(this.game.fontRenderer, "Speed Limit: " + rcCar.speedLimit + " km/h" + ", ATO on", xPos + 4, yPos, 14737632);
			} else {
				this.drawString(this.game.fontRenderer, "Speed Limit: " + rcCar.speedLimit + " km/h", xPos + 4, yPos, 14737632);
			}
			this.drawString(this.game.fontRenderer, "Next Speed Limit: " + rcCar.nextSpeedLimit + " km/h", xPos + 4, yPos + 10, 14737632);
			rcCar.distanceFromStopPoint = rcCar.getDistance(rcCar.xFromStopPoint, rcCar.yFromStopPoint, rcCar.zFromStopPoint);
			rcCar.distanceFromSpeedChange = rcCar.getDistance(rcCar.xSpeedLimitChange, rcCar.ySpeedLimitChange,rcCar.zSpeedLimitChange);

			if (rcCar.xFromStopPoint != 0 && rcCar.yFromStopPoint != 0 && rcCar.zFromStopPoint != 0) {
				this.drawString(this.game.fontRenderer, "Distance from stop: " + Math.floor(rcCar.distanceFromStopPoint * 100) / 100, xPos + 4, yPos + 19, 0xFFFFFFFF);
			}
			if (rcCar.xSpeedLimitChange != 0 && rcCar.ySpeedLimitChange != 0 && rcCar.zSpeedLimitChange != 0) {
				this.drawString(this.game.fontRenderer, "Distance to speed change: " + Math.floor(rcCar.distanceFromSpeedChange * 100) / 100, xPos + 4, yPos + 28, 0xFFFFFFFF);

			}







			if (rcCar.speedLimit < rcCar.getSpeed() && !rcCar.overspeedOveridePressed) {
				drawTexturedRect(new ResourceLocation(Info.resourceLocation, Info.guiPrefix + "mtcspeeding.png"), 30, 40, 0, 0, 64, 64, 64, 64, 0.25);
			} else if (rcCar.overspeedOveridePressed) {
				drawTexturedRect(new ResourceLocation(Info.resourceLocation, Info.guiPrefix + "mtcspeedingoverride.png"), 30, 40, 0, 0, 64, 64, 64, 64, 0.25);
			}

			//hey

		}
		if (rcCar.mtcOverridePressed) {
			drawTexturedRect(new ResourceLocation(Info.resourceLocation, Info.guiPrefix + "mtcdisable.png"), 12, 40, 0, 0, 64, 64, 64, 64, 0.25);
		} else if (rcCar.mtcStatus == 1 | rcCar.mtcStatus == 2){
			drawTexturedRect(new ResourceLocation(Info.resourceLocation, Info.guiPrefix + "mtcicon.png"), 12, 40, 0, 0, 64, 64, 64, 64, 0.25);
		}

	}

	public static void drawTexturedRect(ResourceLocation texture, double x, double y, int u, int v, int width, int height, int imageWidth, int imageHeight, double scale) {
		Minecraft.getMinecraft().renderEngine.bindTexture(texture);
		double minU = (double)u / (double)imageWidth;
		double maxU = (double)(u + width) / (double)imageWidth;
		double minV = (double)v / (double)imageHeight;
		double maxV = (double)(v + height) / (double)imageHeight;
		Tessellator tessellator = Tessellator.instance;
		tessellator.startDrawingQuads();
		tessellator.addVertexWithUV(x + scale*(double)width, y + scale*(double)height, 0, maxU, maxV);
		tessellator.addVertexWithUV(x + scale*(double)width, y, 0, maxU, minV);
		tessellator.addVertexWithUV(x, y, 0, minU, minV);
		tessellator.addVertexWithUV(x, y + scale*(double)height, 0, minU, maxV);
		tessellator.draw();
	}
}
