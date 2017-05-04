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
import org.lwjgl.opengl.GL11;
import train.common.Traincraft;
import train.common.core.network.PacketSetTrainLockedToClient;
import train.common.core.network.PacketTrackBuilderFollow;
import train.common.core.network.PacketTrackBuilderHeight;
import train.common.entity.rollingStock.EntityTracksBuilder;
import train.common.inventory.InventoryBuilder;
import train.common.library.Info;

import java.util.List;

public class GuiBuilder extends GuiContainer {

	private EntityTracksBuilder builder;
	private int requestedHeight;
	private EntityPlayer player;
	private GuiButton buttonLock;

	public GuiBuilder(EntityPlayer player, InventoryPlayer inventoryplayer, Entity entityminecart) {
		super(new InventoryBuilder(inventoryplayer, (EntityTracksBuilder) entityminecart));
		xSize = 255;
		ySize = 193;
		builder = (EntityTracksBuilder) entityminecart;
		requestedHeight = builder.getPlannedHeight();
		this.player = player;
	}

	@Override
	public void initGui() {
		super.initGui();
		buttonList.clear();
		if ((builder).getFollowTracks() == 1) {
			buttonList.add(new GuiButton(1, ((width - xSize) / 2) + 3, ((height - ySize) / 2) - 20, 80, 20, StatCollector.translateToLocal("builder.follow.name")));
		}
		if ((builder).getFollowTracks() == 0) {
			buttonList.add(new GuiButton(1, ((width - xSize) / 2) + 3, ((height - ySize) / 2) - 20, 80, 20, StatCollector.translateToLocal("builder.remove.name")));
		}
		buttonList.add(new GuiButton(2, ((width - xSize) / 2) + 85, ((height - ySize) / 2) - 40, 30, 20, StatCollector.translateToLocal("builder.up.name")));
		buttonList.add(new GuiButton(3, ((width - xSize) / 2) + 85, ((height - ySize) / 2) - 20, 30, 20, StatCollector.translateToLocal("builder.down.name")));

		int var1 = (this.width - xSize) / 2;
		int var2 = (this.height - ySize) / 2;
		if (!(builder).getTrainLockedFromPacket()) {
			this.buttonList.add(this.buttonLock = new GuiButton(4, var1 + 3, var2 - 30, 51, 10, StatCollector.translateToLocal("train.unlocked.name")));
		}
		else {
			this.buttonList.add(this.buttonLock = new GuiButton(4, var1 + 3, var2 - 30, 43, 10, StatCollector.translateToLocal("train.locked.name")));
		}
	}

	@Override
	protected void drawGuiContainerForegroundLayer(int i, int j) {
		fontRendererObj.drawString("Builder", 4, 8, 0x404040);
		fontRendererObj.drawString("Inventory", 113, 100, 0x404040);
		fontRendererObj.drawString("Doesn't work", 4, 160, 0x404040);
		fontRendererObj.drawString("with new tracks", 4, 170, 0x404040);
		fontRendererObj.drawString("yet", 4, 180, 0x404040);

		fontRendererObj.drawString(StatCollector.translateToLocal("builder.currElev.name") + ": " + (int) builder.currentHeight, 120, -25, 0xFFFFFF);
		fontRendererObj.drawString(StatCollector.translateToLocal("builder.reqElev.name") + ": " + builder.getPlannedHeight(), 120, -10, 0xFFFFFF);
		if (intersectsWith(i, j)) {
			drawCreativeTabHoveringText("When a builder is locked,", i, j);
		}
	}

	@Override
	protected void actionPerformed(GuiButton guibutton) {
		if (guibutton.id == 1) {
			if ((builder).getFollowTracks() == 1) {
				sendFollow(0, builder.getEntityId());
				guibutton.displayString = StatCollector.translateToLocal("builder.remove.name");
			}
			else {
				sendFollow(1, builder.getEntityId());
				guibutton.displayString = StatCollector.translateToLocal("builder.follow.name");
			}
		}
		if (guibutton.id == 2) {
			sendPacket(1, builder.getEntityId());
		}
		if (guibutton.id == 3) {
			sendPacket(-1, builder.getEntityId());
		}

		if (guibutton.id == 4) {
			if (player != null && player.getCommandSenderName().toLowerCase().equals((builder).getTrainOwner().toLowerCase())) {
				if ((!(builder).getTrainLockedFromPacket())) {
					AxisAlignedBB box = (builder).boundingBox.expand(5, 5, 5);
					List<?> lis3 = (builder).worldObj.getEntitiesWithinAABBExcludingEntity(builder, box);
					if (lis3 != null && lis3.size() > 0) {
						for (Object entity : lis3) {
							if (entity instanceof EntityPlayer) {
								Traincraft.lockChannel.sendToServer(new PacketSetTrainLockedToClient(true, ((EntityPlayer)entity).getEntityId()));
							}
						}
					}

					(builder).locked = true;
					guibutton.displayString = StatCollector.translateToLocal("train.locked.name");
					this.initGui();
				}
				else {
					AxisAlignedBB box = (builder).boundingBox.expand(5, 5, 5);
					List<?> lis3 = (builder).worldObj.getEntitiesWithinAABBExcludingEntity(builder, box);
					if (lis3 != null && lis3.size() > 0) {
						for (Object entity : lis3) {
							if (entity instanceof EntityPlayer) {
								Traincraft.lockChannel.sendToServer(new PacketSetTrainLockedToClient(false, ((EntityPlayer)entity).getEntityId()));
							}
						}
					}
					(builder).locked = false;
					guibutton.displayString = StatCollector.translateToLocal("train.unlocked.name");
					this.initGui();
				}
			}
			else if (player != null && player instanceof EntityPlayer) {
				player.addChatMessage(new ChatComponentText(StatCollector.translateToLocal("train.owner.name")));
			}
		}
	}

	@Override
	protected void drawCreativeTabHoveringText(String str, int t, int g) {
		String state = "";
		if ((builder).getTrainLockedFromPacket())
			state = "Locked";
		if (!(builder).getTrainLockedFromPacket())
			state = "Unlocked";

		int textWidth = fontRendererObj.getStringWidth("the GUI, change speed, destroy it.");
		int startX = 10;
		int startY = -10;

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
		fontRendererObj.drawStringWithShadow("Current state: " + state, startX, startY + 30, -1);
		fontRendererObj.drawStringWithShadow("Owner: " + (builder).getTrainOwner().trim(), startX, startY + 40, -1);
	}

	public boolean intersectsWith(int mouseX, int mouseY) {
		int j = (width - xSize) / 2;
		int k = (height - ySize) / 2;
		return (mouseX >= j + 3 && mouseX <= j + 55 && mouseY >= k - 30 && mouseY <= k - 20);
	}

	private void sendPacket(int packet, int packetID) {
		AxisAlignedBB box = (builder).boundingBox.expand(5, 5, 5);
		List<?> lis3 = (builder).worldObj.getEntitiesWithinAABBExcludingEntity(builder, box);
		if (lis3 != null && lis3.size() > 0) {
			for (Object entity : lis3) {
				if (entity instanceof EntityPlayer) {
					Traincraft.builderChannel.sendToServer(new PacketTrackBuilderHeight(packet, packetID));
				}
			}
		}
	}
	
	private void sendFollow(int packet, int packetID) {
		AxisAlignedBB box = (builder).boundingBox.expand(5, 5, 5);
		List<?> lis3 = (builder).worldObj.getEntitiesWithinAABBExcludingEntity(builder, box);
		if (lis3 != null && lis3.size() > 0) {
			for (Object entity : lis3) {
				if (entity instanceof EntityPlayer) {
					Traincraft.builderChannel.sendToServer(new PacketTrackBuilderFollow(packet, packetID));
				}
			}
		}
	}

	@Override
	protected void drawGuiContainerBackgroundLayer(float f, int t, int g) {
		GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
		mc.renderEngine.bindTexture(new ResourceLocation(Info.resourceLocation, Info.guiPrefix + "gui_builder2.png"));
		int j = ((width - xSize) / 2);
		int k = (height - ySize) / 2;
		drawTexturedModalRect(j, k, 0, 0, xSize, ySize);
		if (builder.getFuel() > 0) {
			int l = builder.scaleMaxFuel(12);
			drawTexturedModalRect(j + 8, (k + 36 + 12) - l, 0, 250 - l, 14, l + 2);
		}
		for (int i1 = builder.numBuilderSlots; i1 < 5; i1++) {
			drawTexturedModalRect(j + 105 + 18 * i1, k + 6, 14, 166, 18, 18);
		}
		for (int j1 = builder.numBuilderSlots1; j1 < 5; j1++) {
			drawTexturedModalRect(j + 105 + 18 * j1, k + 24, 14, 166, 18, 18);//
		}
		for (int k1 = builder.numBuilderSlots2; k1 < 5; k1++) {
			drawTexturedModalRect(j + 105 + 18 * k1, k + 42, 14, 166, 18, 18);
		}
		for (int k1 = builder.numBuilderSlots3; k1 < 5; k1++) {
			drawTexturedModalRect(j + 105 + 18 * k1, k + 60, 14, 166, 18, 18);
		}
	}
}