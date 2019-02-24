package train.client.gui;

import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.StatCollector;
import org.lwjgl.opengl.GL11;
import train.common.Traincraft;
import train.common.api.*;
import train.common.core.network.PacketParkingBrake;
import train.common.core.network.PacketSetLocoTurnedOn;
import train.common.core.network.PacketSetTrainLockedToClient;
import train.common.inventory.InventoryLoco;
import train.common.library.Info;

import java.util.Collections;

public class GuiLoco2 extends GuiContainer {


	private String texture = Info.guiPrefix + "customButton.png";
	private int textureX = 0;
	private int textureY = 46;
	private int textureSizeX = 40;
	private int textureSizeY = 13;
	private int buttonPosX = 0;
	private int buttonPosY = 0;
	private GuiButton buttonLock;

	private Locomotive loco;

	public GuiLoco2(InventoryPlayer inventoryplayer, Entity entityminecart) {
		super(new InventoryLoco(inventoryplayer, (Locomotive) entityminecart));
		loco = (Locomotive) entityminecart;
	}

	@Override
	public void initGui() {
		super.initGui();
		buttonList.clear();
		if (!loco.getParkingBrakeFromPacket()) {
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
			buttonPosX = 43;
			buttonPosY = -13;
			buttonList.add(new GuiCustomButton(2, ((width - xSize) / 2) + buttonPosX - 12, ((height - ySize) / 2) + buttonPosY, textureSizeX, textureSizeY, "", texture, textureX, textureY));//Brake: Off
		}
		else {
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
			buttonList.add(new GuiCustomButton(2, ((width - xSize) / 2) + buttonPosX, ((height - ySize) / 2) + buttonPosY, textureSizeX, textureSizeY, "", texture, textureX, textureY));//Brake: On 
		}
		int var1 = (this.width - xSize) / 2;
		int var2 = (this.height - ySize) / 2;
		if (!loco.getTrainLockedFromPacket()) {
			this.buttonList.add(this.buttonLock = new GuiButton(3, var1 + 108, var2 - 10, 67, 10, "Unlocked"));
		}
		else {
			this.buttonList.add(this.buttonLock = new GuiButton(3, var1 + 108, var2 - 10, 67, 10, "Locked"));
		}
		if (!(loco instanceof SteamTrain)) {
			if (loco.isLocoTurnedOn()) {
				this.buttonList.add(this.buttonLock = new GuiButton(4, var1 + 108, var2 - 22, 67, 12, "Stop Engine"));
			}
			else {
				this.buttonList.add(this.buttonLock = new GuiButton(4, var1 + 108, var2 - 22, 67, 12, "Start Engine"));
			}
		}
	}

	@Override
	protected void actionPerformed(GuiButton guibutton) {
		if (guibutton.id == 2) {
			if ((!loco.parkingBrake) && loco.getSpeed() < 10) {
				Traincraft.brakeChannel.sendToServer(new PacketParkingBrake(true, loco.getEntityId()));
				loco.parkingBrake=true;
				loco.isBraking=true;
				guibutton.displayString = "Brake: On";
				this.initGui();
			}
			else if (loco.getSpeed() < 10) {
				Traincraft.brakeChannel.sendToServer(new PacketParkingBrake(false, loco.getEntityId()));
				loco.parkingBrake=false;
				loco.isBraking=false;
				guibutton.displayString = "Brake: Off";
				this.initGui();
			}
		}
		if (guibutton.id == 3) {
			if (loco.riddenByEntity instanceof EntityPlayer && ((EntityPlayer) loco.riddenByEntity).getDisplayName().equals(loco.getTrainOwner())) {
				if ((!loco.getTrainLockedFromPacket())) {
					Traincraft.lockChannel.sendToServer(new PacketSetTrainLockedToClient(true, loco.getEntityId()));
					loco.locked = true;
					guibutton.displayString = "Locked";
					this.initGui();
				}
				else {
					Traincraft.lockChannel.sendToServer(new PacketSetTrainLockedToClient(false, loco.getEntityId()));
					loco.locked = false;
					guibutton.displayString = "UnLocked";
					this.initGui();
				}
			}
			else if (loco.riddenByEntity instanceof EntityPlayer) {
				((EntityPlayer) loco.riddenByEntity).addChatMessage(new ChatComponentText("You are not the owner"));
			}
		}
		if (guibutton.id == 4) {
			if (loco.isLocoTurnedOn()) {
				if(loco.getSpeed() <= 1){
					Traincraft.ignitionChannel.sendToServer(new PacketSetLocoTurnedOn(false));
					loco.isLocoTurnedOn = false;
					guibutton.displayString = "Start Engine";
					/**
					 * We implemented Auto ParkingBrake since Brutal tried to did it in the Locomotive API when you turn off the damn Train
					 */
					Traincraft.brakeChannel.sendToServer(new PacketParkingBrake(true, loco.getEntityId()));
					loco.parkingBrake = true;
					loco.isBraking = true;
					this.initGui();
				}else{
					((EntityPlayer)loco.riddenByEntity).addChatMessage(new ChatComponentText("Stop before turning it Off!"));
				}
			}
			else {
				Traincraft.ignitionChannel.sendToServer(new PacketSetLocoTurnedOn(true));
				loco.isLocoTurnedOn = true;
				guibutton.displayString = "Stop Engine";
			}
		}
	}

	@Override
	protected void drawCreativeTabHoveringText(String str, int t, int g) {

		//int liqui = (dieselInventory.getLiquidAmount() * 50) / dieselInventory.getTankCapacity();
		String state = "";
		if (loco.getTrainLockedFromPacket()){
			state = "Locked";
		} else {
			state = "Unlocked";
		}

		int textWidth = fontRendererObj.getStringWidth("the GUI, change speed, destroy it.");
		int startX = 90;
		int startY = 5;

		int i4 = 0xf0100010;
		drawGradientRect(startX - 3, startY - 4, startX + textWidth + 3, startY + 52, i4, i4);
		drawGradientRect(startX - 4, startY - 3, startX + textWidth + 4, startY + 51, i4, i4);
		int colour1 = 0x505000ff;
		int colour2 = (colour1 & 0xfefefe) >> 1 | colour1 & 0xff000000;
		drawGradientRect(startX - 3, startY - 3, startX + textWidth + 3, startY + 51, colour1, colour2);
		drawGradientRect(startX - 2, startY - 2, startX + textWidth + 2, startY + 50, i4, i4);
		fontRendererObj.drawStringWithShadow(str, startX, startY, -1);
		fontRendererObj.drawStringWithShadow("only its owner can open", startX, startY + 10, -1);
		fontRendererObj.drawStringWithShadow("the GUI, change speed, destroy it.", startX, startY + 20, -1);
		fontRendererObj.drawStringWithShadow("Current state: " + state, startX, startY + 30, -1);
		fontRendererObj.drawStringWithShadow("Owner: " + loco.getTrainOwner().trim(), startX,
				startY + 40, -1);
	}

	public boolean intersectsWith(int mouseX, int mouseY) {
		//System.out.println(mouseX+" "+mouseY);
		int j = (width - xSize) / 2;
		int k = (height - ySize) / 2;
		return (mouseX >= j + 124 && mouseX <= j + 174 && mouseY >= k - 10 && mouseY <= k);
	}

	@Override
	protected void drawGuiContainerForegroundLayer(int i, int j) {
		GL11.glDisable(GL11.GL_LIGHTING);
		GL11.glDisable(GL11.GL_DEPTH_TEST);

		fontRendererObj.drawString(loco.getInventoryName(), 39, 7, 0x000000);
		fontRendererObj.drawString(loco.getInventoryName(), 41, 5, 0x000000);
		fontRendererObj.drawString(loco.getInventoryName(), 39, 5, 0x000000);
		fontRendererObj.drawString(loco.getInventoryName(), 41, 7, 0x000000);

		fontRendererObj.drawString(loco.getInventoryName(), 39, 6, 0x000000);
		fontRendererObj.drawString(loco.getInventoryName(), 41, 6, 0x000000);
		fontRendererObj.drawString(loco.getInventoryName(), 40, 7, 0x000000);
		fontRendererObj.drawString(loco.getInventoryName(), 40, 5, 0x000000);
		fontRendererObj.drawString(loco.getInventoryName(), 40, 6, 0xd3a900);

		GL11.glEnable(GL11.GL_LIGHTING);
		GL11.glEnable(GL11.GL_DEPTH_TEST);

		if (intersectsWith(i, j)) {
			drawCreativeTabHoveringText("When a locomotive is locked,", i, j);
		}
	}

	@Override
	public void drawScreen(int mouseX, int mouseY, float par3){
		super.drawScreen(mouseX, mouseY,par3);
		if(loco instanceof SteamTrain){
			int j = (width - xSize) / 2;
			int k = (height - ySize) / 2;
			if (mouseX>j+143 && mouseX<j+161 && mouseY>k+18 && mouseY<k+68){
				drawHoveringText(Collections.singletonList("Water: " + (((SteamTrain) loco).getWater()) + "mb / " + (((SteamTrain) loco).getCartTankCapacity()) +"mb"),
						mouseX, mouseY, fontRendererObj);
			}
		} else 	if(loco instanceof DieselTrain){
			int j = (width - xSize) / 2;
			int k = (height - ySize) / 2;
			if (mouseX>j+143 && mouseX<j+161 && mouseY>k+18 && mouseY<k+68){
				if (((DieselTrain) loco).getDiesel()!=0){
					drawHoveringText(Collections.singletonList(StatCollector.translateToLocal("fluid.tc:"+((DieselTrain) loco).getLiquidName()) + " " +
									((DieselTrain) loco).getDiesel() +"mb / " + (((DieselTrain) loco).getCartTankCapacity()) + "mb"),
							mouseX, mouseY, fontRendererObj);
				}else {
					drawHoveringText(Collections.singletonList("Fuel: " +
									"0mb / " + (((DieselTrain) loco).getCartTankCapacity()) + "mb"),
							mouseX, mouseY, fontRendererObj);
				}
			}
		}
	}

	@Override
	protected void drawGuiContainerBackgroundLayer(float f, int t, int g) {
		String i = Info.guiPrefix + "gui_loco.png";

		if (loco instanceof ElectricTrain) {
			i = Info.guiPrefix + "gui_tram.png";
		}
		if (loco instanceof SteamTrain) {
			i = Info.guiPrefix + "gui_loco_steam.png";
		}
		if (loco instanceof DieselTrain) {
			i = Info.guiPrefix + "gui_loco_diesel.png";
		}

		GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
		mc.renderEngine.bindTexture(new ResourceLocation(Info.resourceLocation, i));
		int j = (width - xSize) / 2;
		int k = (height - ySize) / 2;
		drawTexturedModalRect(j, k, 0, 0, xSize, ySize);

		if (loco instanceof SteamTrain) {
			int load = (((SteamTrain) loco).getWater());
			int lo = Math.abs(((load * 50) / (((SteamTrain) loco).getCartTankCapacity())));

			if (((SteamTrain) loco).getLiquidItemID() == LiquidManager.WATER_FILTER.getFluidID()) {
				drawTexturedModalRect(j + 143, (k + 68) - lo, 190, 69 - lo, 18, lo + 1);
			}
			if (loco.getIsFuelled()) {
				int l = loco.getFuelDiv(12);
				drawTexturedModalRect(j + 8, (k + 36 + 12) - l, 176, 12 - l, 14, l + 2);
			}
		}
		else if (loco instanceof DieselTrain) {
			int load = (((DieselTrain) loco).getDiesel());
			int lo2 = Math.abs(((load * 50) / (((DieselTrain) loco).getCartTankCapacity())));
			drawTexturedModalRect(j + 143, (k + 68) - lo2, 192, 120 - lo2, 18, lo2);
			if (loco.getIsFuelled()) {
				int l = loco.getFuelDiv(12);
				drawTexturedModalRect(j + 10, (k + 36 + 13) - l, 178, 12 - l, 14, l + 2);
			}
		}
		else {
			for (int i1 = loco.numCargoSlots; i1 < 5; i1++) {
				drawTexturedModalRect(j + 79 + 18 * i1, k + 17, 190, 0, 18, 18);
			}
			for (int j1 = loco.numCargoSlots1; j1 < 5; j1++) {
				drawTexturedModalRect(j + 79 + 18 * j1, k + 35, 190, 0, 18, 18);
			}
			for (int k1 = loco.numCargoSlots2; k1 < 5; k1++) {
				drawTexturedModalRect(j + 79 + 18 * k1, k + 53, 190, 0, 18, 18);
			}
			if (loco.getIsFuelled()) {
				int l = loco.getFuelDiv(12);
				drawTexturedModalRect(j + 8, (k + 36 + 12) - l, 176, 12 - l, 14, l + 2);
			}
		}

		fontRendererObj.drawStringWithShadow("Carts pulled: " + loco.getCurrentNumCartsPulled(), 1, 10, 0xFFFFFF);
		fontRendererObj.drawStringWithShadow("Mass pulled: " + loco.getCurrentMassPulled(), 1, 20, 0xFFFFFF);
		fontRendererObj.drawStringWithShadow("Speed reduction: " + loco.getCurrentSpeedSlowDown() + " km/h", 1, 30, 0xFFFFFF);
		fontRendererObj.drawStringWithShadow("Accel reduction: " + loco.getCurrentAccelSlowDown(), 1, 40, 0xFFFFFF);
		fontRendererObj.drawStringWithShadow("Brake reduction: " + loco.getCurrentBrakeSlowDown(), 1, 50, 0xFFFFFF);
		fontRendererObj.drawStringWithShadow("Fuel consumption: " + ((loco.getFuelConsumption() *0.2)+"").substring(0,Math.min(((loco.getFuelConsumption() *0.2)+"").length(),4))+ " mB/s", 1,
				60, 0xFFFFFF);
		fontRendererObj.drawStringWithShadow("Fuel: " + loco.getFuel(), 1, 70, 0xFFFFFF);
		fontRendererObj.drawStringWithShadow("Power: " + loco.getPower() + " Mhp", 1, 80, 0xFFFFFF);
		fontRendererObj.drawStringWithShadow("State: " + loco.getState(), 1, 90, 0xFFFFFF);
		fontRendererObj.drawStringWithShadow("Heat level: " + loco.getOverheatLevel(), 1, 100, 0xFFFFFF);
		fontRendererObj.drawStringWithShadow("Maximum Speed: " + (loco.getCustomSpeedGUI()) + " km/h" + " ("+(loco.getCustomSpeedGUI()+loco.getCurrentSpeedSlowDown())+")", 1, 110, 0xFFFFFF);
		fontRendererObj.drawStringWithShadow("Destination: " + (loco.getDestinationGUI()), 1, 120, 0xFFFFFF);
	}
}