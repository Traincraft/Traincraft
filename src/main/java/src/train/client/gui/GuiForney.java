package src.train.client.gui;

import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;


import src.train.common.api.AbstractTrains;
import src.train.common.api.LiquidManager;
import src.train.common.api.Locomotive;
import src.train.common.api.SteamTrain;
import src.train.common.core.network.PacketKeyPress;
import src.train.common.inventory.InventoryForney;
import src.train.common.inventory.InventoryLoco;
import src.train.common.library.Info;

public class GuiForney extends GuiContainer {


	private String texture = Info.guiPrefix + "customButton.png";
	private int textureX = 0;
	private int textureY = 46;
	private int textureSizeX = 40;
	private int textureSizeY = 13;
	private int buttonPosX = 0;
	private int buttonPosY = 0;

	private float yaw;
	private float roll;
	private boolean rollDown;
	private GuiButton buttonLock;

	private Locomotive loco;
	private InventoryLoco invLoco;

	public GuiForney(InventoryPlayer inventoryplayer, Entity entityminecart) {
		super(new InventoryForney(inventoryplayer, (Locomotive) entityminecart));
		loco = (Locomotive) entityminecart;
	}

	@Override
	public void initGui() {
		super.initGui();
		buttonList.clear();
		if (!((Locomotive) loco).parkingBrake) {
			if (loco instanceof SteamTrain) {
				textureX = 41;
				textureY = 13;
				textureSizeX = 40;
				textureSizeY = 13;
			}
			else {
				textureX = 126;
				textureY = 13;
				textureSizeX = 43;
				textureSizeY = 13;
			}
			buttonPosX = 33;
			buttonPosY = -13;
			buttonList.add(new GuiCustomButton(2, ((width - xSize) / 2) + buttonPosX, ((height - ySize) / 2) + buttonPosY, textureSizeX, textureSizeY, "", texture, textureX, textureY));// Brake: Off
		}
		else if (((Locomotive) loco).parkingBrake) {
			if (loco instanceof SteamTrain) {
				textureX = 0;
				textureY = 13;
				textureSizeX = 40;
				textureSizeY = 13;
			}
			else {
				textureX = 82;
				textureY = 13;
				textureSizeX = 43;
				textureSizeY = 13;
			}
			buttonPosX = 0;
			buttonPosY = -13;
			buttonList.add(new GuiCustomButton(2, ((width - xSize) / 2) + buttonPosX, ((height - ySize) / 2) + buttonPosY, textureSizeX, textureSizeY, "", texture, textureX, textureY));// Brake: On
		}
		int var1 = (this.width - xSize) / 2;
		int var2 = (this.height - ySize) / 2;
		if (!((Locomotive) loco).locked) {
			this.buttonList.add(this.buttonLock = new GuiButton(3, var1 + 124, var2 - 10, 51, 10, "Unlocked"));
		}
		else {
			this.buttonList.add(this.buttonLock = new GuiButton(3, var1 + 130, var2 - 10, 43, 10, "Locked"));
		}
	}

	@Override
	protected void actionPerformed(GuiButton guibutton) {
		if (guibutton.id == 2) {
			if ((!((Locomotive) loco).getParkingBrakeFromPacket()) && ((Locomotive) loco).getSpeed() < 10) {
				((Locomotive) loco).sendParkingBrakePacket(true);
				((Locomotive) loco).parkingBrake = true;
				guibutton.displayString = "Brake: On";
				this.initGui();
			}
			else if (((Locomotive) loco).getSpeed() < 10) {
				((Locomotive) loco).sendParkingBrakePacket(false);
				((Locomotive) loco).parkingBrake = false;
				guibutton.displayString = "Brake: Off";
				this.initGui();
			}
		}
		if (guibutton.id == 3) {
			//System.out.println("1 "+((AbstractTrains) loco).trainOwner);
			//System.out.println("2 "+((EntityPlayer)((AbstractTrains) loco).riddenByEntity).username);
			//System.out.println(((EntityPlayer)((AbstractTrains) loco).riddenByEntity).username.equalsIgnoreCase(((AbstractTrains) loco).trainOwner.trim()));

			if (((AbstractTrains) loco).riddenByEntity != null && ((AbstractTrains) loco).riddenByEntity instanceof EntityPlayer && ((EntityPlayer) ((AbstractTrains) loco).riddenByEntity).getDisplayName().toLowerCase().equals(((AbstractTrains) loco).trainOwner.toLowerCase())) {
				if ((!((AbstractTrains) loco).locked)) {
					((AbstractTrains) loco).sendTrainLockedPacket((EntityPlayer) ((AbstractTrains) loco).riddenByEntity, true);
					((AbstractTrains) loco).locked = true;
					guibutton.displayString = "Locked";
					this.initGui();
				}
				else {
					((AbstractTrains) loco).sendTrainLockedPacket((EntityPlayer) ((AbstractTrains) loco).riddenByEntity, false);
					((AbstractTrains) loco).locked = false;
					guibutton.displayString = "UnLocked";
					this.initGui();
				}
			}
			else if (((AbstractTrains) loco).riddenByEntity != null && ((AbstractTrains) loco).riddenByEntity instanceof EntityPlayer) {
				((EntityPlayer) ((AbstractTrains) loco).riddenByEntity).addChatMessage(new ChatComponentText("You are not the owner"));
			}
		}
	}

	@Override
	protected void drawCreativeTabHoveringText(String str, int t, int g) {
		int j = (width - xSize) / 2;
		int k = (height - ySize) / 2;

		//int liqui = (dieselInventory.getLiquidAmount() * 50) / dieselInventory.getTankCapacity();
		String state = "";
		if (((Locomotive) loco).locked)
			state = "Locked";
		if (!((Locomotive) loco).locked)
			state = "Unlocked";

		int textWidth = fontRendererObj.getStringWidth("the GUI, change speed, destroy it.");
		int startX = 90;
		int startY = 5;

		int i4 = 0xf0100010;
		int h = 8;
		int w = textWidth;
		drawGradientRect(startX - 3, startY - 4, startX + textWidth + 3, startY + 8 + 4 + 40, i4, i4);
		drawGradientRect(startX - 4, startY - 3, startX + textWidth + 4, startY + 8 + 3 + 40, i4, i4);
		int colour1 = 0x505000ff;
		int colour2 = (colour1 & 0xfefefe) >> 1 | colour1 & 0xff000000;
		drawGradientRect(startX - 3, startY - 3, startX + textWidth + 3, startY + 8 + 3 + 40, colour1, colour2);
		drawGradientRect(startX - 2, startY - 2, startX + textWidth + 2, startY + 8 + 2 + 40, i4, i4);
		fontRendererObj.drawStringWithShadow(str, startX, startY, -1);
		fontRendererObj.drawStringWithShadow("only its owner can open", startX, startY + 10, -1);
		fontRendererObj.drawStringWithShadow("the GUI, change speed, destroy it.", startX, startY + 20, -1);
		fontRendererObj.drawStringWithShadow("Current state: " + state, startX, startY + 30, -1);
		fontRendererObj.drawStringWithShadow("Owner: " + ((AbstractTrains) loco).trainOwner.trim(), startX, startY + 40, -1);
	}

	public boolean intersectsWith(int mouseX, int mouseY) {
		//System.out.println(mouseX+" "+mouseY);
		int j = (width - xSize) / 2;
		int k = (height - ySize) / 2;
		if (mouseX >= j + 124 && mouseX <= j + 174 && mouseY >= k - 10 && mouseY <= k) {
			return true;
		}
		return false;
	}

	@Override
	protected void drawGuiContainerForegroundLayer(int i, int j) {
		GL11.glDisable(GL11.GL_LIGHTING);
		GL11.glDisable(GL11.GL_DEPTH_TEST);

		fontRendererObj.drawString(loco.getInventoryName(), 37, 3, 0x000000);
		fontRendererObj.drawString(loco.getInventoryName(), 39, 1, 0x000000);
		fontRendererObj.drawString(loco.getInventoryName(), 37, 1, 0x000000);
		fontRendererObj.drawString(loco.getInventoryName(), 39, 3, 0x000000);

		fontRendererObj.drawString(loco.getInventoryName(), 38, 3, 0x000000);
		fontRendererObj.drawString(loco.getInventoryName(), 38, 1, 0x000000);
		fontRendererObj.drawString(loco.getInventoryName(), 37, 2, 0x000000);
		fontRendererObj.drawString(loco.getInventoryName(), 39, 2, 0x000000);
		fontRendererObj.drawString(loco.getInventoryName(), 38, 2, 0xd3a900);

		GL11.glEnable(GL11.GL_LIGHTING);
		GL11.glEnable(GL11.GL_DEPTH_TEST);
		if (intersectsWith(i, j)) {
			drawCreativeTabHoveringText("When a locomotive is locked,", i, j);
		}
	}

	@Override
	protected void drawGuiContainerBackgroundLayer(float f, int t, int g) {
		GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
		mc.renderEngine.bindTexture(new ResourceLocation(Info.resourceLocation, Info.guiPrefix + "gui_forney.png"));
		int j = (width - xSize) / 2;
		int k = (height - ySize) / 2;
		drawTexturedModalRect(j, k, 0, 0, xSize, ySize);

		if (loco.getIsFuelled()) {
			int l = loco.getFuelDiv(12);
			drawTexturedModalRect(j + 8, (k + 30) - l, 176, 12 - l, 14, l + 2);
		}

		if (loco instanceof SteamTrain) {

			int load = (((SteamTrain) loco).getWater());
			int lo = Math.abs(((load * 50) / (((SteamTrain) loco).getCartTankCapacity())));

			if (((SteamTrain) loco).getLiquidItemID() == LiquidManager.WATER_FILTER.getFluidID()) {
				drawTexturedModalRect(j + 143, (k + 68) - lo, 190, 69 - lo, 18, lo + 1);
			}
		}
		fontRendererObj.drawStringWithShadow("Carts pulled: " + loco.getCurrentNumCartsPulled(), 1, 10, 0xFFFFFF);
		fontRendererObj.drawStringWithShadow("Mass pulled: " + loco.getCurrentMassPulled(), 1, 20, 0xFFFFFF);
		fontRendererObj.drawStringWithShadow("Speed reduction: " + loco.getCurrentSpeedSlowDown(), 1, 30, 0xFFFFFF);
		fontRendererObj.drawStringWithShadow("Accel reduction: " + loco.getCurrentAccelSlowDown(), 1, 40, 0xFFFFFF);
		fontRendererObj.drawStringWithShadow("Brake reduction: " + loco.getCurrentBrakeSlowDown(), 1, 50, 0xFFFFFF);
		fontRendererObj.drawStringWithShadow("Fuel consumption: 1 every " + loco.getFuelConsumption() + " ticks", 1, 60, 0xFFFFFF);
		fontRendererObj.drawStringWithShadow("Fuel: " + loco.getFuel(), 1, 70, 0xFFFFFF);
		fontRendererObj.drawStringWithShadow("Power: " + loco.getPower() + " Mhp", 1, 80, 0xFFFFFF);
		fontRendererObj.drawStringWithShadow("State: " + loco.getState(), 1, 90, 0xFFFFFF);
		fontRendererObj.drawStringWithShadow("Heat level: " + loco.getOverheatLevel(), 1, 100, 0xFFFFFF);
		fontRendererObj.drawStringWithShadow("Maximum Speed: " + (loco.getCustomSpeedGUI()), 1, 110, 0xFFFFFF);
	}
}