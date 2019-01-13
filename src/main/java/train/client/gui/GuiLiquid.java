package train.client.gui;

import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.StatCollector;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidRegistry;
import org.lwjgl.opengl.GL11;
import train.client.core.helpers.FluidRenderHelper;
import train.common.Traincraft;
import train.common.api.AbstractTrains;
import train.common.api.LiquidTank;
import train.common.core.network.PacketSetTrainLockedToClient;
import train.common.inventory.InventoryLiquid;
import train.common.library.Info;

import java.util.List;

public class GuiLiquid extends GuiContainer {

	private LiquidTank liquid;
	private EntityPlayer player;
	
	public GuiLiquid(EntityPlayer player, InventoryPlayer inventoryplayer, Entity entityminecart) {
		super(new InventoryLiquid(inventoryplayer, (LiquidTank) entityminecart));
		liquid = (LiquidTank) entityminecart;
		this.player = player;
	}

	@Override
	public void drawScreen(int t, int g, float par3) {
		drawGuiContainerBackgroundLayer(par3, t, g);
		super.drawScreen(t, g, par3);

		if (intersectsWith(t, g)) {
			if (liquid.getLiquidName()!= null && !liquid.getLiquidName().equals("")) {
				drawCreativeTabHoveringText(StatCollector.translateToLocal(liquid.getLiquidName()) + ": " + liquid.getAmount() + "mb/" + liquid.getCapacity() + "mb", t, g);
			} else {
				drawCreativeTabHoveringText( "0mb/" + liquid.getCapacity() + "mb", t, g);
			}
		}


	}

	@Override
	public void initGui() {
		super.initGui();
		buttonList.clear();
		int var1 = (this.width-xSize) / 2;
		int var2 = (this.height-ySize) / 2;
		if (!liquid.getTrainLockedFromPacket()) {
			this.buttonList.add(new GuiButton(3, var1 + 124, var2 - 10, 51, 10, "Unlocked"));
		}else{
			this.buttonList.add(new GuiButton(3, var1 + 130, var2 - 10, 43, 10, "Locked"));
		}
	}
	@Override
	protected void actionPerformed(GuiButton guibutton) {
		if (guibutton.id == 3) {
			if(player!=null && player.getCommandSenderName().toLowerCase().equals(((AbstractTrains) liquid).getTrainOwner().toLowerCase())){
				if ((!liquid.getTrainLockedFromPacket())){
					AxisAlignedBB box = liquid.boundingBox.expand(5, 5, 5);
					List lis3 = liquid.worldObj.getEntitiesWithinAABBExcludingEntity(liquid, box);
					if (lis3 != null && lis3.size() > 0) {
						for (Object entity : lis3) {
							if (entity instanceof EntityPlayer) {
								Traincraft.lockChannel
										.sendToServer(new PacketSetTrainLockedToClient(true, liquid.getEntityId()));
							}
						}
					}
					liquid.locked = true;
					guibutton.displayString = "Locked";
					this.initGui();
				}else{
					AxisAlignedBB box = liquid.boundingBox.expand(5, 5, 5);
					List lis3 = liquid.worldObj.getEntitiesWithinAABBExcludingEntity(liquid, box);
					if (lis3 != null && lis3.size() > 0) {
						for (Object entity : lis3) {
							if (entity instanceof EntityPlayer) {
								Traincraft.lockChannel
										.sendToServer(new PacketSetTrainLockedToClient(false, liquid.getEntityId()));
							}
						}
					}
					liquid.locked = false;
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

		fontRendererObj.drawString(liquid.getCommandSenderName(), 65, 1, 0x000000);
		fontRendererObj.drawString(liquid.getCommandSenderName(), 65, 3, 0x000000);
		fontRendererObj.drawString(liquid.getCommandSenderName(), 63, 1, 0x000000);
		fontRendererObj.drawString(liquid.getCommandSenderName(), 63, 3, 0x000000);

		fontRendererObj.drawString(liquid.getCommandSenderName(), 65, 2, 0x000000);
		fontRendererObj.drawString(liquid.getCommandSenderName(), 63, 2, 0x000000);
		fontRendererObj.drawString(liquid.getCommandSenderName(), 64, 1, 0x000000);
		fontRendererObj.drawString(liquid.getCommandSenderName(), 64, 3, 0x000000);
		fontRendererObj.drawString(liquid.getCommandSenderName(), 64, 2, 0xd3a900);

		GL11.glEnable(GL11.GL_LIGHTING);
		GL11.glEnable(GL11.GL_DEPTH_TEST);
		if (intersectsWithLockButton(i, j)) {
			drawCreativeTabHoveringTextLockButton("When a tank cart is locked,", i, j);
		}
	}

	protected void drawCreativeTabHoveringTextLockButton(String str, int t, int g) {

		//int liqui = (dieselInventory.getLiquidAmount() * 50) / dieselInventory.getTankCapacity();
		String state = "";
		if(liquid.getTrainLockedFromPacket()){
			state="Locked";
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
		fontRendererObj.drawStringWithShadow("the GUI and destroy it.", startX, startY + 20, -1);
		fontRendererObj.drawStringWithShadow("Current state: "+state, startX, startY+30, -1);
		fontRendererObj.drawStringWithShadow("Owner: "+(liquid).getTrainOwner().trim(), startX, startY+40, -1);
	}
	public boolean intersectsWithLockButton(int mouseX, int mouseY) {
		//System.out.println(mouseX+" "+mouseY);
		int j = (width - xSize) / 2;
		int k = (height - ySize) / 2;
		return (mouseX >= j + 124 && mouseX <= j + 174 && mouseY >= k-10 && mouseY <= k);
	}

	@Override
	protected void drawGuiContainerBackgroundLayer(float f, int t, int g) {
		GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
		mc.renderEngine.bindTexture(new ResourceLocation(Info.resourceLocation,Info.guiPrefix + "gui_liquid.png"));
		int j = (width - xSize) / 2;
		int k = (height - ySize) / 2;
		drawTexturedModalRect(j, k, 0, 0, xSize, ySize);


		int l = (liquid.getAmount() * 50) / liquid.getCapacity();

		Fluid theLiquid = FluidRegistry.getFluid(liquid.getLiquidItemID());
		/** Don't render anything if the cart is empty */
		if (theLiquid != null) {
			/** Protection against missing rendering icon, to avoid NPE */
			if (theLiquid.getIcon() == null)
				return;
			/** Get the texture sheet of the liquid */
			//mc.renderEngine.func_110577_a(new ResourceLocation(Info.resourceLocation,Info.guiPrefix + "empty.png"));
			mc.renderEngine.bindTexture(FluidRenderHelper.getFluidSheet(theLiquid));
			//func_110628_a(FluidRenderHelper.getFluidSheet(new FluidStack(theLiquid,1)));
			/** Drawing 16*16 icons side by side, extending them gives bad results */
			for (int col = 0; col < 66 / 16; col++) {
				for (int row = 0; row <= (l) / 16; row++) {
					//System.out.println(ItemIDs.bogie.item.getIconFromDamage(0));
					drawTexturedModelRectFromIcon(j + 58 + col * 16, k + 52 + -row * 16,FluidRenderHelper.getFluidTexture(theLiquid,false), 16, 16);
				}
			}
			/** Bind again to render a black overlay. The icon is rendered in 16*16 square and therefore not adapted to a 50 pixels high tank */
			mc.renderEngine.bindTexture(new ResourceLocation(Info.resourceLocation,Info.guiPrefix + "gui_liquid.png"));
			/** Drawing black overlay over the liquid */
			drawTexturedModalRect(j + 58, (k + 1), 4, 168, 64, 50 - l + 15);
		}
		/** Drawing the red scale over the liquid */
		drawTexturedModalRect(j + 58, (k + 67 - 50), 72, 167, 64, 50);
	}

	public boolean intersectsWith(int mouseX, int mouseY) {
		int j = (width - xSize) / 2;
		int k = (height - ySize) / 2;
		return (mouseX >= j + 57 && mouseX <= j + 123 && mouseY >= k + 16 && mouseY <= k + 68);
	}
}
