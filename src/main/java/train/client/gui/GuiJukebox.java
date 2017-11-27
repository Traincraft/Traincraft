package train.client.gui;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.input.Keyboard;
import org.lwjgl.opengl.GL11;
import train.common.Traincraft;
import train.common.api.AbstractTrains;
import train.common.core.network.PacketSetJukeboxStreamingUrl;
import train.common.core.network.PacketSetTrainLockedToClient;
import train.common.entity.rollingStock.EntityJukeBoxCart;
import train.common.library.Info;

import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

public class GuiJukebox extends GuiScreen {

	private GuiTCTextField streamTextBox;
	private EntityJukeBoxCart jukebox;
	private EntityPlayer player;
	public boolean exists = true;
	private GuiButton buttonLock;
	private int gui_width;
	private int gui_height;
	private int gui_inner_width;
	private int gui_inner_height;
	private int anim = 0;
	private String infoText;
	
	public GuiJukebox(EntityPlayer player, EntityJukeBoxCart jukebox) {
		this.jukebox = jukebox;
		this.player = player;
		gui_width = 352;
		gui_height = 120;
		gui_inner_width = gui_width - 40;
		gui_inner_height = 20;
		infoText = "Paste the link below. (Only .m3u and .pls radio streams)";
	}

	@Override
	public void initGui() {
		buttonList.clear();
		buttonList.add(new GuiButton(0, this.width / 2 - 45, this.height / 2 + 30, 90, 20, "Play/Pause"));
		buttonList.add(new GuiButton(1, this.width / 2 - 45 - 120, this.height / 2 + 30, 90, 20, "Paste"));
		buttonList.add(new GuiButton(2, this.width / 2 - 45 + 120, this.height / 2 + 30, 90, 20, "Clear"));
		buttonList.add(new GuiButton(4, this.width / 2 - 70, this.height / 2 + 30, 20, 20, "+"));
		buttonList.add(new GuiButton(5, this.width / 2 + 50, this.height / 2 + 30, 20, 20, "-"));
		streamTextBox = new GuiTCTextField(this.fontRendererObj, this.width / 2 - (gui_width) / 2 + 10, this.height / 2 - gui_height / 2 + 50, gui_width - 16, 16);
		streamTextBox.setMaxStringLength(1000);
		streamTextBox.setText(this.jukebox.streamURL);
		//Localizations
		Keyboard.enableRepeatEvents(true);
		int var1 = (this.width - gui_width) / 2;
		int var2 = (this.height - gui_height) / 2;
		if (!((AbstractTrains) jukebox).locked) {
			this.buttonList.add(this.buttonLock = new GuiButton(3, var1 + gui_width - 350, var2 - 10, 51, 10, "Unlocked"));
		}
		else {
			this.buttonList.add(this.buttonLock = new GuiButton(3, var1 + gui_width - 350, var2 - 10, 43, 10, "Locked"));
		}
	}

	@Override
	public void onGuiClosed() {
		Keyboard.enableRepeatEvents(false);
	}

	@Override
	public void drawScreen(int par1, int par2, float par3) {
		int var5 = (this.width) / 2 - gui_width / 2;
		int var6 = (this.height) / 2 - gui_height / 2;
		int var7 = (this.width) / 2 + gui_width / 2;
		int var8 = (this.height) / 2 + gui_height / 2;

		drawRect(var5 + 2, var6 + 2, var7 + 2, var8 + 2, 0xffc6c6c6);
		GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
		mc.renderEngine.bindTexture(new ResourceLocation(Info.resourceLocation, Info.guiPrefix + "gui_jukebox.png"));

		drawSquareCorners(2, 2, var5, var6, var7, var8, 0, 0);
		drawSquareCorners(-6, -20, var5, var6 + 26, var7, var8 - gui_height / 2 + 26, 10, 0);
		drawSquareSides(gui_width, gui_height, 2, 2, var5, var6, var7, var8, 0, 0);
		drawSquareSides(gui_width - 16, 16, 2, 2, var5 + 8, var6 + 22 + 26, var7 - 8, var8 - gui_height / 2 - 32 + 36, 10, 0);

		drawTexturedModalRect(var5 + 6, var6 + 6, 20, 0, 7, 10);
		drawTexturedModalRect(var5 + 13, var6 + 6, 0 + anim / 100, 12, (28 * (gui_width / 28)) / 2, 10);
		drawTexturedModalRect(var5 + 13 + (28 * (gui_width / 28)) / 2, var6 + 6, 0 + anim / 100, 12, (28 * (gui_width / 28)) / 2, 10);
		if (jukebox.isPlaying) {
			anim += 10;
			if (anim == 2800) {
				anim = 0;
			}
		}

		//fontRenderer.drawString("Date: " + Calendar.getInstance().get(Calendar.MONTH) + " " + Calendar.getInstance().get(Calendar.DATE), var5 - gui_width / 2, var6 - 30, 0xffffffff);
		
		if((Minecraft.getMinecraft().thePlayer != null) && ((jukebox).player != null) && (!(jukebox).isInvalid)) {
			fontRendererObj.drawString("Volume: " + (int) Math.ceil(jukebox.volume * 100), width / 2 - 26, height / 2 + 18, 0xff0e0e0e);
		}
		else {
			fontRendererObj.drawString("Volume: 0", width / 2 - 26, height / 2 + 18, 0xff0e0e0e);
		}

		setText(0xff0e0e0e);
		super.drawScreen(par1, par2, par3);
		streamTextBox.drawTextBox();
		if (intersectsWith(par1, par2)) {
			drawCreativeTabHoveringText("When a jukebox is locked,", par1, par2);
		}
	}

	private void setText(int color) {
		fontRendererObj.drawString(infoText, this.width / 2 - gui_width / 2 + 10, this.height / 2 - 30, color);
	}

	public void drawSquareCorners(int x, int y, int x0y0, int x1y0, int x0y1, int x1y1, int u, int v) {
		mc.renderEngine.bindTexture(new ResourceLocation(Info.resourceLocation, Info.guiPrefix + "gui_jukebox.png"));
		drawTexturedModalRect(x0y0 - x, x1y0 - y, u, v, 4, 4);
		drawTexturedModalRect(x0y1 + x, x1y0 - y, u + 5, v, 4, 4);
		drawTexturedModalRect(x0y0 - x, x1y1 + y, u, v + 5, 4, 4);
		drawTexturedModalRect(x0y1 + x, x1y1 + y, u + 5, v + 5, 4, 4);
	}

	public void drawSquareSides(int width, int height, int x, int y, int x0y0, int x1y0, int x0y1, int x1y1, int u, int v) {
		mc.renderEngine.bindTexture(new ResourceLocation(Info.resourceLocation, Info.guiPrefix + "gui_jukebox.png"));
		int sides = width >= height ? width : height;
		for (int i = 0; i < sides; i++) {
			if (width > height) {
				if (i < height) {
					drawTexturedModalRect(x0y0 - x, x1y0 + y + i, u, v + 4, 4, 1);
					drawTexturedModalRect(x0y1 + x, x1y0 + y + i, u + 5, v + 4, 4, 1);
				}
				drawTexturedModalRect(x0y0 + x + i, x1y0 - y, u + 4, v, 1, 4);
				drawTexturedModalRect(x0y0 + x + i, x1y1 + y, u + 4, v + 5, 1, 4);
			}
			else {
				if (i < width) {
					drawTexturedModalRect(x0y0 + x + i, x1y0 - y, u + 4, v, 1, 4);
					drawTexturedModalRect(x0y0 + x + i, x1y1 + y, u + 4, v + 5, 1, 4);
				}
				drawTexturedModalRect(x0y0 - x, x1y0 + y + i, u, v + 4, 4, 1);
				drawTexturedModalRect(x0y1 + x, x1y0 + y + i, u + 5, v + 4, 4, 1);
			}
		}
	}

	@Override
	public void updateScreen() {
		streamTextBox.updateCursorCounter();
		if (jukebox.isInvalid) {
			mc.displayGuiScreen((GuiScreen) null);
			mc.setIngameFocus();
		}
		super.updateScreen();
	}

	public void customStop() {
		jukebox.stopStream();
	}

	@Override
	protected void keyTyped(char par1, int par2) {
		streamTextBox.textboxKeyTyped(par1, par2);
		if (par1 == 28) {
			actionPerformed((GuiButton) buttonList.get(1));
		}
		if (par2 == 1 || par2 == mc.gameSettings.keyBindInventory.getKeyCode()) {
			if (!streamTextBox.isFocused()) {
				mc.thePlayer.closeScreen();
			}
		}
		super.keyTyped(par1, par2);
	}

	@Override
	protected void mouseClicked(int par1, int par2, int par3) {
		streamTextBox.mouseClicked(par1, par2, par3);
		super.mouseClicked(par1, par2, par3);
	}

	@Override
	@SideOnly(Side.CLIENT)
	protected void actionPerformed(GuiButton button) {
		if (button.id == 0) {
			if (streamTextBox.getText() != null && streamTextBox.getText().length() > 0) {
				if ((!jukebox.isPlaying())) {
					if (this.streamTextBox.getText().toLowerCase().contains(".m3u")) {
						this.jukebox.streamURL = takeFirstEntryFromM3U(this.streamTextBox.getText());
					}
					else if (this.streamTextBox.getText().toLowerCase().contains(".pls")) {
						this.jukebox.streamURL = parsePls(this.streamTextBox.getText());
					}
					else {
						this.jukebox.streamURL = this.streamTextBox.getText();
					}
					Traincraft.modChannel.sendToServer(new PacketSetJukeboxStreamingUrl(this.jukebox, this.jukebox.streamURL, true));
					jukebox.startStream();
				}
				else {
					Traincraft.modChannel.sendToServer(new PacketSetJukeboxStreamingUrl(this.jukebox, this.jukebox.streamURL, false));
					jukebox.stopStream();
				}
			}
			else if (jukebox.isPlaying){
				Traincraft.modChannel.sendToServer(new PacketSetJukeboxStreamingUrl(this.jukebox, this.jukebox.streamURL, false));
				jukebox.stopStream();
			}
		}

		if (button.id == 1) {
			Toolkit toolkit = Toolkit.getDefaultToolkit();
			Clipboard clipboard = toolkit.getSystemClipboard();
			try {
				String result = (String) clipboard.getData(DataFlavor.stringFlavor);
				streamTextBox.setText(result);
			} catch (Exception e) {}
		}

		if (button.id == 2) {
			streamTextBox.setText("");
			streamTextBox.setFocused(true);
		}

		if (button.id == 4) {
			if((Minecraft.getMinecraft().thePlayer != null) && (jukebox.player != null) && (!jukebox.isInvalid)){
				if(jukebox.volume<1.0f) {
    				jukebox.volume += 0.1f;
				}
			}
		}

		if (button.id == 5) {
			if((Minecraft.getMinecraft().thePlayer != null) && (jukebox.player != null) && (!jukebox.isInvalid)){
				if(jukebox.volume>0.0f) {
					jukebox.volume -= 0.1f;
				}
			}
		}

		if (button.id == 3) {
			if (player != null && player instanceof EntityPlayer && player.getDisplayName().equals(((AbstractTrains) jukebox).getTrainOwner())) {
				if ((!((AbstractTrains) jukebox).locked)) {
					AxisAlignedBB box = jukebox.boundingBox.expand(5, 5, 5);
					List lis3 = jukebox.worldObj.getEntitiesWithinAABBExcludingEntity(jukebox, box);
					if (lis3 != null && lis3.size() > 0) {
						for (int j1 = 0; j1 < lis3.size(); j1++) {
							Entity entity = (Entity) lis3.get(j1);
							if (entity instanceof EntityPlayer) {
								Traincraft.lockChannel.sendToServer(new PacketSetTrainLockedToClient(true, this.jukebox.getEntityId()));
							}
						}
					}
					((AbstractTrains) jukebox).locked = true;
					button.displayString = "Locked";
					this.initGui();
				}
				else {
					AxisAlignedBB box = jukebox.boundingBox.expand(5, 5, 5);
					List lis3 = jukebox.worldObj.getEntitiesWithinAABBExcludingEntity(jukebox, box);
					if (lis3 != null && lis3.size() > 0) {
						for (int j1 = 0; j1 < lis3.size(); j1++) {
							Entity entity = (Entity) lis3.get(j1);
							if (entity instanceof EntityPlayer) {
								Traincraft.lockChannel.sendToServer(new PacketSetTrainLockedToClient(true, this.jukebox.getEntityId()));
							}
						}
					}
					((AbstractTrains) jukebox).locked = false;
					button.displayString = "UnLocked";
					this.initGui();
				}
			}
			else if (player != null && player instanceof EntityPlayer) {
				player.addChatMessage(new ChatComponentText("You are not the owner"));
			}
		}
	}

	@SideOnly(Side.CLIENT)
	public boolean getState() {
		return this.jukebox.isPlaying();
	}

	@Override
	public boolean doesGuiPauseGame() {
		return false;
	}

	@Override
	protected void drawCreativeTabHoveringText(String str, int t, int g) {
		String state = "";
		if (jukebox.locked)
			state = "Locked";
		else
			state = "Unlocked";

		int textWidth = fontRendererObj.getStringWidth("When a jukebox is unlocked,")+2;

		int i4 = 0xf0100010;
		drawGradientRect(t + 15 - 3, g - 40 - 4, t + textWidth + 3, g + 8 + 4, i4, i4);
		drawGradientRect(t + 15 - 4, g - 40 - 3, t + textWidth + 4, g + 8 + 3, i4, i4);
		int colour1 = 0x505000ff;
		int colour2 = (colour1 & 0xfefefe) >> 1 | colour1 & 0xff000000;
		drawGradientRect(t + 15 - 3, g - 40 - 3, t + textWidth + 3, g + 8 + 3, colour1, colour2);
		drawGradientRect(t + 15 - 2, g - 40 - 2, t + textWidth + 2, g + 8 + 2, i4, i4);
		fontRendererObj.drawStringWithShadow(str, t + 15, g - 40, -1);
		fontRendererObj.drawStringWithShadow("only its owner can open", t + 15, g + 10 - 40, -1);
		fontRendererObj.drawStringWithShadow("the GUI and destroy it.", t + 15, g + 20 - 40, -1);
		fontRendererObj.drawStringWithShadow("Current state: " + state, t + 15, g + 30 - 40, -1);
		fontRendererObj.drawStringWithShadow("Owner: " + jukebox.getTrainOwner(), t + 15, g + 40 - 40, -1);
	}

	public boolean intersectsWith(int mouseX, int mouseY) {
		int j = (width - gui_width) / 2;
		int k = (height - gui_height) / 2;
		if (mouseX >= j + gui_width - 350 && mouseX <= j + gui_width-300 && mouseY >= k - 10 && mouseY <= k) {
			return true;
		}
		return false;
	}

	public String takeFirstEntryFromM3U(String m3uurl) {
		String out = "";
		try {
			URL m3u = new URL(m3uurl);
			URLConnection con = m3u.openConnection();
			BufferedReader i = new BufferedReader(new InputStreamReader(con.getInputStream()));
			String mp3;
			while ((mp3 = i.readLine()) != null) {
				if (!mp3.startsWith("#")) {
					break;
				}
			}
			out = mp3;
		} catch (IOException e) {
			infoText = "Not a valid stream, only .m3u and .pls";
		}
		return out;
	}

	public String parsePls(String plsurl) {
		String out = "";
		try {
			URL pls = new URL(plsurl);
			URLConnection con = pls.openConnection();
			BufferedReader i = new BufferedReader(new InputStreamReader(con.getInputStream()));
			String mp3;
			while ((mp3 = i.readLine()) != null) {
				String f = mp3.trim();
				if (f.contains("http://")) {
					out = f.substring(f.indexOf("http://"));
					break;
				}
			}
		} catch (IOException e) {
			infoText = "Not a valid stream, only .m3u and .pls";
		}
		return out;
	}
}