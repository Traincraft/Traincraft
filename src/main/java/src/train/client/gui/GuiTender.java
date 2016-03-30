package src.train.client.gui;

import java.util.List;

import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;

import src.train.common.api.AbstractTrains;
import src.train.common.api.LiquidManager;
import src.train.common.api.Tender;
import src.train.common.inventory.InventoryTender;
import src.train.common.library.Info;

public class GuiTender extends GuiContainer {

	private Tender tender;
	private float yaw;
	private float roll;
	private boolean rollDown;
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
		if (!((AbstractTrains) tender).locked) {
			this.buttonList.add(this.buttonLock = new GuiButton(3, var1 + 124, var2 - 10, 51, 10, "Unlocked"));
		}else{
			this.buttonList.add(this.buttonLock = new GuiButton(3, var1 + 130, var2 - 10, 43, 10, "Locked"));
		}
	}
	@Override
	protected void actionPerformed(GuiButton guibutton) {
		if (guibutton.id == 3) {
			if(player!=null && player instanceof EntityPlayer && player.username.toLowerCase().equals(((AbstractTrains) tender).trainOwner.toLowerCase())){
				if ((!((AbstractTrains) tender).locked)){
					AxisAlignedBB box = ((Tender) tender).boundingBox.expand(5, 5, 5);
					List lis3 = ((Tender) tender).worldObj.getEntitiesWithinAABBExcludingEntity(tender, box);
					if (lis3 != null && lis3.size() > 0) {
						for (int j1 = 0; j1 < lis3.size(); j1++) {
							Entity entity = (Entity) lis3.get(j1);
							if (entity instanceof EntityPlayer) {
								((AbstractTrains) tender).sendTrainLockedPacket((EntityPlayer) entity,true);
							}
						}
					}
					((AbstractTrains) tender).locked=true;
					guibutton.displayString = "Locked";
					this.initGui();
				}else{
					AxisAlignedBB box = ((Tender) tender).boundingBox.expand(5, 5, 5);
					List lis3 = ((Tender) tender).worldObj.getEntitiesWithinAABBExcludingEntity(tender, box);
					if (lis3 != null && lis3.size() > 0) {
						for (int j1 = 0; j1 < lis3.size(); j1++) {
							Entity entity = (Entity) lis3.get(j1);
							if (entity instanceof EntityPlayer) {
								((AbstractTrains) tender).sendTrainLockedPacket((EntityPlayer) entity,false);
							}
						}
					}
					((AbstractTrains) tender).locked=false;
					guibutton.displayString = "UnLocked";
					this.initGui();
				}
			}else if(player!=null && player instanceof EntityPlayer){
				player.addChatMessage("You are not the owner");
			}
		}
	}

	@Override
	protected void drawGuiContainerForegroundLayer(int i, int j) {
		GL11.glDisable(GL11.GL_LIGHTING);
		GL11.glDisable(GL11.GL_DEPTH_TEST);

		fontRenderer.drawString(((IInventory) tender).getInvName(), 34, 1, 0x000000);
		fontRenderer.drawString(((IInventory) tender).getInvName(), 36, 3, 0x000000);
		fontRenderer.drawString(((IInventory) tender).getInvName(), 34, 3, 0x000000);
		fontRenderer.drawString(((IInventory) tender).getInvName(), 36, 1, 0x000000);

		fontRenderer.drawString(((IInventory) tender).getInvName(), 34, 2, 0x000000);
		fontRenderer.drawString(((IInventory) tender).getInvName(), 36, 2, 0x000000);
		fontRenderer.drawString(((IInventory) tender).getInvName(), 35, 3, 0x000000);
		fontRenderer.drawString(((IInventory) tender).getInvName(), 35, 1, 0x000000);
		fontRenderer.drawString(((IInventory) tender).getInvName(), 35, 2, 0xd3a900);

		GL11.glEnable(GL11.GL_LIGHTING);
		GL11.glEnable(GL11.GL_DEPTH_TEST);
		
		if (intersectsWith(i, j)) {
			drawCreativeTabHoveringText("When a tender is locked,", i, j);
		}
	}
	
	@Override
	protected void drawCreativeTabHoveringText(String str, int t, int g) {
		int j = (width - xSize) / 2;
		int k = (height - ySize) / 2;

		//int liqui = (dieselInventory.getLiquidAmount() * 50) / dieselInventory.getTankCapacity();
		String state = "";
		if(((AbstractTrains) tender).locked)state="Locked";
		if(!((AbstractTrains) tender).locked)state="Unlocked";
		
		int textWidth = fontRenderer.getStringWidth("the GUI, change speed, destroy it.");
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
		fontRenderer.drawStringWithShadow(str, startX, startY, -1);
		fontRenderer.drawStringWithShadow("only its owner can open", startX, startY + 10, -1);
		fontRenderer.drawStringWithShadow("the GUI and destroy it.", startX, startY + 20, -1);
		fontRenderer.drawStringWithShadow("Current state: "+state, startX, startY+30, -1);
		fontRenderer.drawStringWithShadow("Owner: "+((AbstractTrains) tender).trainOwner.trim(), startX, startY+40, -1);
	}
	public boolean intersectsWith(int mouseX, int mouseY) {
		//System.out.println(mouseX+" "+mouseY);
		int j = (width - xSize) / 2;
		int k = (height - ySize) / 2;
		if (mouseX >= j + 124 && mouseX <= j + 174 && mouseY >= k-10 && mouseY <= k) {
			return true;
		}
		return false;
	}

	@Override
	protected void drawGuiContainerBackgroundLayer(float f, int t, int g) {
		String i = Info.guiPrefix + "gui_tender.png";
		GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
		mc.renderEngine.bindTexture(new ResourceLocation(Info.resourceLocation,i));
		int j = (width - xSize) / 2;
		int k = (height - ySize) / 2;
		drawTexturedModalRect(j, k, 0, 0, xSize, ySize);

		if (tender instanceof Tender) {
			int load = (((Tender) tender).getWater());
			int lo = Math.abs(((load * 50) / (((Tender) tender).getCartTankCapacity())));

			if (((Tender) tender).getLiquidItemID() == LiquidManager.WATER_FILTER.fluidID) {

				drawTexturedModalRect(j + 143, (k + 69) - lo, 190, 69 - lo, 18, lo);
			}
		}
	}
}
