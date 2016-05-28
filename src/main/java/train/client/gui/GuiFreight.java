package train.client.gui;

import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import train.common.api.AbstractTrains;
import train.common.api.Freight;
import train.common.inventory.InventoryFreight;
import train.common.library.Info;

import java.util.List;

public class GuiFreight extends GuiContainer {

	private Freight freight;
	private int inventoryRows;
	private EntityPlayer player;

	private float yaw;
	private float roll;
	private boolean rollDown;
	private GuiButton buttonLock;

	public GuiFreight(EntityPlayer player, InventoryPlayer inventoryplayer, Entity entityminecart) {
		super(new InventoryFreight(inventoryplayer, (Freight) entityminecart));
		freight = (Freight) entityminecart;
		this.player = player;
		inventoryRows = 0;
		char c = '\336';
		int i = c - 108;
		inventoryRows = (freight.getSizeInventory() / 9);
		ySize = i + inventoryRows * 18;
	}

	@Override
	public void initGui() {
		super.initGui();
		buttonList.clear();
		int var1 = (this.width - xSize) / 2;
		int var2 = (this.height - ySize) / 2;
		if (!((AbstractTrains) freight).locked) {
			this.buttonList.add(this.buttonLock = new GuiButton(3, var1 + 124, var2 - 10, 51, 10, "Unlocked"));
		}
		else {
			this.buttonList.add(this.buttonLock = new GuiButton(3, var1 + 130, var2 - 10, 43, 10, "Locked"));
		}
	}

	@Override
	protected void actionPerformed(GuiButton guibutton) {
		if (guibutton.id == 3) {
			if (player != null && player instanceof EntityPlayer && player.getCommandSenderName().toLowerCase().equals(((AbstractTrains) freight).trainOwner.toLowerCase())) {
				if ((!((AbstractTrains) freight).locked)) {
					AxisAlignedBB box = ((Freight) freight).boundingBox.expand(5, 5, 5);
					List lis3 = ((Freight) freight).worldObj.getEntitiesWithinAABBExcludingEntity(freight, box);
					if (lis3 != null && lis3.size() > 0) {
						for (int j1 = 0; j1 < lis3.size(); j1++) {
							Entity entity = (Entity) lis3.get(j1);
							if (entity instanceof EntityPlayer) {
								((AbstractTrains) freight).sendTrainLockedPacket((EntityPlayer) entity, true);
							}
						}
					}

					((AbstractTrains) freight).locked = true;
					guibutton.displayString = "Locked";
					this.initGui();
				}
				else {
					AxisAlignedBB box = ((Freight) freight).boundingBox.expand(5, 5, 5);
					List lis3 = ((Freight) freight).worldObj.getEntitiesWithinAABBExcludingEntity(freight, box);
					if (lis3 != null && lis3.size() > 0) {
						for (int j1 = 0; j1 < lis3.size(); j1++) {
							Entity entity = (Entity) lis3.get(j1);
							if (entity instanceof EntityPlayer) {
								((AbstractTrains) freight).sendTrainLockedPacket((EntityPlayer) entity, false);
							}
						}
					}
					((AbstractTrains) freight).locked = false;
					guibutton.displayString = "UnLocked";
					this.initGui();
				}
			}
			else if (player != null && player instanceof EntityPlayer) {
				player.addChatMessage(new ChatComponentText("You are not the owner"));
			}
		}
	}

	@Override
	protected void drawCreativeTabHoveringText(String str, int t, int g) {
		int j = (width - xSize) / 2;
		int k = (height - ySize) / 2;

		String state = "";
		if (((AbstractTrains) freight).locked)
			state = "Locked";
		if (!((AbstractTrains) freight).locked)
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
		fontRendererObj.drawStringWithShadow("the GUI and destroy it.", startX, startY + 20, -1);
		fontRendererObj.drawStringWithShadow("Current state: " + state, startX, startY + 30, -1);
		fontRendererObj.drawStringWithShadow("Owner: " + ((AbstractTrains) freight).trainOwner.trim(), startX, startY + 40, -1);
	}

	public boolean intersectsWith(int mouseX, int mouseY) {
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
		
		fontRendererObj.drawString(((IInventory) freight).getInventoryName(), 60, 6, 0x404040);
		fontRendererObj.drawString("Inventory", 8, (ySize - 96) + 2, 0x404040);
		
		GL11.glEnable(GL11.GL_LIGHTING);
		GL11.glEnable(GL11.GL_DEPTH_TEST);
		
		if (intersectsWith(i, j)) {
			drawCreativeTabHoveringText("When a freight is locked,", i, j);
		}
	}

	@Override
	protected void drawGuiContainerBackgroundLayer(float f, int t, int g) {
		GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
		mc.renderEngine.bindTexture(new ResourceLocation(Info.resourceLocation, Info.guiPrefix + "container.png"));
		int j = (width - xSize) / 2;
		int k = (height - ySize) / 2;

		drawTexturedModalRect(j, k, 0, 0, xSize, inventoryRows * 18 + 17);
		drawTexturedModalRect(j, k + inventoryRows * 18 + 17, 0, 126, xSize, 96);
	}
}