package train.client.gui;

import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import train.common.Traincraft;
import train.common.api.LiquidManager;
import train.common.api.Tender;
import train.common.core.network.PacketSetTrainLockedToClient;
import train.common.inventory.InventoryTender;
import train.common.library.Info;

import java.util.Collections;
import java.util.List;

public class GuiTender extends GuiContainer {

	private Tender tender;
	private EntityPlayer player;
	private GuiButton buttonLock;

	public GuiTender(EntityPlayer player, InventoryPlayer inventoryplayer, Entity entityminecart) {
		super(new InventoryTender(inventoryplayer, (Tender) entityminecart));
		tender = (Tender) entityminecart;
		this.player = player;
	}

	@Override
	public void initGui() {
		super.initGui();
		buttonList.clear();
		int var1 = (this.width-xSize) / 2;
		int var2 = (this.height-ySize) / 2;
		if (!tender.getTrainLockedFromPacket()) {
			this.buttonList.add(this.buttonLock = new GuiButton(3, var1 + 124, var2 - 10, 51, 10, "Unlocked"));
		}else{
			this.buttonList.add(this.buttonLock = new GuiButton(3, var1 + 130, var2 - 10, 43, 10, "Locked"));
		}
	}
	@Override
	protected void actionPerformed(GuiButton guibutton) {
		if (guibutton.id == 3) {
			if(player!=null && player.getCommandSenderName().toLowerCase().equals(tender.getTrainOwner().toLowerCase())){
				if ((!tender.getTrainLockedFromPacket())) {
					AxisAlignedBB box = tender.boundingBox.expand(5, 5, 5);
					List lis3 = tender.worldObj.getEntitiesWithinAABBExcludingEntity(tender, box);
					if (lis3 != null && lis3.size() > 0) {
						for (Object entity : lis3) {
							if (entity instanceof EntityPlayer) {
								Traincraft.lockChannel
										.sendToServer(new PacketSetTrainLockedToClient(true, tender.getEntityId()));
							}
						}
					}
					tender.locked = true;
					guibutton.displayString = "Locked";
					this.initGui();
				}else{
					AxisAlignedBB box = tender.boundingBox.expand(5, 5, 5);
					List lis3 = tender.worldObj.getEntitiesWithinAABBExcludingEntity(tender, box);
					if (lis3 != null && lis3.size() > 0) {
						for (Object entity : lis3) {
							if (entity instanceof EntityPlayer) {
								Traincraft.lockChannel
										.sendToServer(new PacketSetTrainLockedToClient(false, tender.getEntityId()));
							}
						}
					}
					tender.locked = false;
					guibutton.displayString = "UnLocked";
					this.initGui();
				}
			}else if(player!=null && player instanceof EntityPlayer){
				player.addChatMessage(new ChatComponentText("You are not the owner"));
			}
		}
	}

	@Override
	protected void drawGuiContainerForegroundLayer(int i, int j) {
		GL11.glDisable(GL11.GL_LIGHTING);
		GL11.glDisable(GL11.GL_DEPTH_TEST);

		fontRendererObj.drawString(tender.getCommandSenderName(), 34, 1, 0x000000);
		fontRendererObj.drawString(tender.getCommandSenderName(), 36, 3, 0x000000);
		fontRendererObj.drawString(tender.getCommandSenderName(), 34, 3, 0x000000);
		fontRendererObj.drawString(tender.getCommandSenderName(), 36, 1, 0x000000);

		fontRendererObj.drawString(tender.getCommandSenderName(), 34, 2, 0x000000);
		fontRendererObj.drawString(tender.getCommandSenderName(), 36, 2, 0x000000);
		fontRendererObj.drawString(tender.getCommandSenderName(), 35, 3, 0x000000);
		fontRendererObj.drawString(tender.getCommandSenderName(), 35, 1, 0x000000);
		fontRendererObj.drawString(tender.getCommandSenderName(), 35, 2, 0xd3a900);

		GL11.glEnable(GL11.GL_LIGHTING);
		GL11.glEnable(GL11.GL_DEPTH_TEST);
		
		if (intersectsWith(i, j)) {
			drawCreativeTabHoveringText("When a tender is locked,", i, j);
		}
	}
	
	@Override
	protected void drawCreativeTabHoveringText(String str, int t, int g) {

		//int liqui = (dieselInventory.getLiquidAmount() * 50) / dieselInventory.getTankCapacity();
		String state = "";
		if (tender.getTrainLockedFromPacket()) state = "Locked";
		if (!tender.getTrainLockedFromPacket()) state = "Unlocked";
		
		int textWidth = fontRendererObj.getStringWidth("the GUI, change speed, destroy it.");
		int startX = 90;
		int startY = 5;

		int i4 = 0xf0100010;
		drawGradientRect(startX - 3, startY - 4, startX + textWidth + 3, startY + 8 + 4 + 40, i4, i4);
		drawGradientRect(startX - 4, startY - 3, startX + textWidth + 4, startY + 8 + 3 + 40, i4, i4);
		int colour1 = 0x505000ff;
		int colour2 = (colour1 & 0xfefefe) >> 1 | colour1 & 0xff000000;
		drawGradientRect(startX - 3, startY - 3, startX + textWidth + 3, startY + 8 + 3 + 40, colour1, colour2);
		drawGradientRect(startX - 2, startY - 2, startX + textWidth + 2, startY + 8 + 2 + 40, i4, i4);
		fontRendererObj.drawStringWithShadow(str, startX, startY, -1);
		fontRendererObj.drawStringWithShadow("only its owner can open", startX, startY + 10, -1);
		fontRendererObj.drawStringWithShadow("the GUI and destroy it.", startX, startY + 20, -1);
		fontRendererObj.drawStringWithShadow("Current state: "+state, startX, startY+30, -1);
		fontRendererObj.drawStringWithShadow("Owner: "+tender.getTrainOwner().trim(), startX, startY+40, -1);
	}
	public boolean intersectsWith(int mouseX, int mouseY) {
		//System.out.println(mouseX+" "+mouseY);
		int j = (width - xSize) / 2;
		int k = (height - ySize) / 2;
		return  (mouseX >= j + 124 && mouseX <= j + 174 && mouseY >= k-10 && mouseY <= k);
	}

	@Override
	public void drawScreen(int mouseX, int mouseY, float par3){
		super.drawScreen(mouseX, mouseY,par3);
		int j = (width - xSize) / 2;
		int k = (height - ySize) / 2;
		if (mouseX>j+143 && mouseX<j+161 && mouseY>k+18 && mouseY<k+68){
			drawHoveringText(Collections.singletonList("Water: " + (tender.getWater()) + "mb / " + (tender.getCartTankCapacity()) +"mb"),
					mouseX, mouseY, fontRendererObj);
		}
	}

	@Override
	protected void drawGuiContainerBackgroundLayer(float f, int t, int g) {
		String i = Info.guiPrefix + "gui_tender.png";
		GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
		mc.renderEngine.bindTexture(new ResourceLocation(Info.resourceLocation,i));
		int j = (width - xSize) / 2;
		int k = (height - ySize) / 2;
		drawTexturedModalRect(j, k, 0, 0, xSize, ySize);

		if (tender != null) {
			int load = (tender.getWater());
			int lo = Math.abs(((load * 50) / (tender.getCartTankCapacity())));

			if (tender.getLiquidItemID() == LiquidManager.WATER_FILTER.getFluidID()) {

				drawTexturedModalRect(j + 143, (k + 69) - lo, 190, 69 - lo, 18, lo);
			}
		}
	}
}
