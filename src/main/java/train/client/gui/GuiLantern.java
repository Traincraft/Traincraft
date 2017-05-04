package train.client.gui;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.GuiTextField;
import net.minecraft.entity.player.EntityPlayer;
import org.lwjgl.input.Keyboard;
import train.common.Traincraft;
import train.common.core.network.PacketLantern;
import train.common.tile.TileLantern;

@SideOnly(Side.CLIENT)
public class GuiLantern extends GuiScreen {
	/** The player editing the gui */
	private final EntityPlayer editingPlayer;

	/** Text field containing the color. */
	private GuiTextField colorTextField;

	/** the block being edited. */
	private final TileLantern lanternBlock;
	private GuiButton doneBtn;
	private GuiButton cancelBtn;

	public GuiLantern(EntityPlayer par1EntityPlayer, TileLantern tile) {
		this.editingPlayer = par1EntityPlayer;
		lanternBlock = tile;
	}
	/**
	 * Adds the buttons (and other controls) to the screen in question.
	 */
	@Override
	public void initGui() {
		this.buttonList.clear();
		Keyboard.enableRepeatEvents(true);
		this.buttonList.add(this.doneBtn = new GuiButton(0, this.width / 2 - 100, this.height / 4 + 96 + 12, "Done"));
		this.buttonList.add(this.cancelBtn = new GuiButton(1, this.width / 2 - 100, this.height / 4 + 120 + 12, "Cancel"));
		this.colorTextField = new GuiTextField(this.fontRendererObj, this.width / 2 - 150, 60, 300, 20);
		this.colorTextField.setMaxStringLength(32767);
		this.colorTextField.setFocused(true);
		this.colorTextField.setText(this.lanternBlock.getColor());
		this.doneBtn.enabled = this.colorTextField.getText().trim().length() > 0;
	}
	
	/**
	 * Fired when a control is clicked. This is the equivalent of ActionListener.actionPerformed(ActionEvent e).
	 */
	@Override
	protected void actionPerformed(GuiButton par1GuiButton) {
		if (par1GuiButton.enabled) {
			if (par1GuiButton.id == 1) {
				this.mc.displayGuiScreen((GuiScreen)null);
			}
			if (par1GuiButton.id == 0) {
				String colorString = this.colorTextField.getText().replaceFirst("^#","");//removes #
				if(colorString.length()==6){
					colorString = colorString.substring(0, 6);//remove additionnal characters
					if(colorString.length()==6 &&tryParse(colorString)!=null){//if parse is possible (if string can be converted to an int)
						int color = tryParse(colorString);//parse the string as a 16 int	
						Traincraft.modChannel.sendToServer(new PacketLantern(color, lanternBlock.xCoord,
								lanternBlock.yCoord, lanternBlock.zCoord));
						Minecraft.getMinecraft().renderGlobal.markBlockForRenderUpdate(lanternBlock.xCoord, lanternBlock.yCoord, lanternBlock.zCoord); //TODO marks block as dirty, but it's only actually re-renders when chunk is loaded, but we need the re-render after it has been changed.
					}
				}
				this.mc.displayGuiScreen((GuiScreen)null);
			}
		}
	}
	
	/**
	 * Tries to convert string to a specific int
	 * if string is not correct format (hex) then return null
	 * @param text
	 * @return
	 */
	public static Integer tryParse(String text) {
		try {
			return new Integer(Integer.parseInt(text, 16));
		} catch (NumberFormatException e) {
			return null;
		}
	}
	
	/**
	 * Fired when a key is typed. This is the equivalent of KeyListener.keyTyped(KeyEvent e).
	 */
	@Override
	protected void keyTyped(char par1, int par2) {
		this.colorTextField.textboxKeyTyped(par1, par2);
		this.doneBtn.enabled = this.colorTextField.getText().trim().length() > 0;

		if (par2 != 28 && par1 != 13) {
			if (par2 == 1) {
				this.actionPerformed(this.cancelBtn);
			}
		}
		else {
			this.actionPerformed(this.doneBtn);
		}
	}
	
	/**
	 * Called when the mouse is clicked.
	 */
	@Override
	protected void mouseClicked(int par1, int par2, int par3) {
		super.mouseClicked(par1, par2, par3);
		this.colorTextField.mouseClicked(par1, par2, par3);
	}
	
	/**
	 * Draws the screen and all the components in it.
	 */
	@Override
	public void drawScreen(int par1, int par2, float par3) {
		this.drawDefaultBackground();
		this.colorTextField.drawTextBox();
		super.drawScreen(par1, par2, par3);
	}
	
	@Override
	public void onGuiClosed() {
		super.onGuiClosed();
		Keyboard.enableRepeatEvents(false);
	}
	
	@Override
	public boolean doesGuiPauseGame() {
		return false;
	}
}