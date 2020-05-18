package train.client.gui;


import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.tileentity.TileEntity;
import train.common.Traincraft;
import train.common.mtc.TileInfoTransmitterSpeed;
import train.common.mtc.packets.PacketNextSpeed;
import train.common.mtc.packets.PacketSetSpeed;

import java.awt.event.KeyEvent;

import static org.lwjgl.opengl.GL11.glColor3f;

public class GuiSpeedTransmitter extends GuiScreen {
    TileInfoTransmitterSpeed transmitterBlock;
    private GuiTCTextField speedLimitTextField;
    private GuiTCTextField nextSpeedLimitTextField;
    private GuiTCTextField nextSpeedXTextField;
    private GuiTCTextField nextSpeedYTextField;
    private GuiTCTextField nextSpeedZTextField;

    private GuiButton okayButton;
    public GuiSpeedTransmitter(TileEntity entity) {

        if (entity instanceof TileInfoTransmitterSpeed) {
            transmitterBlock = (TileInfoTransmitterSpeed)entity;
            Block transmitterBlocc = entity.getWorldObj().getBlock(transmitterBlock.xCoord, transmitterBlock.yCoord, transmitterBlock.zCoord);
            System.out.println(entity.getWorldObj().isBlockIndirectlyGettingPowered(transmitterBlock.xCoord, transmitterBlock.yCoord, transmitterBlock.zCoord));
        }
    }

    @Override
    public void initGui() {
        //trainLevel = new GuiTCTextField(fontRendererObj, this.width/2 -5, this.height/2 - 1, 15,10);
        //okayButton = new GuiButton(0,this.width/2 -5, this.height/2 + 10, 25,25, "Okay" );
        //trainLevel.setMaxStringLength(1);
       // trainLevel.setText(theLocomotive.trainLevel);
       //this.buttonList.add(okayButton);
        speedLimitTextField = new GuiTCTextField(fontRendererObj, this.width/2 -30, 69, 27,10);
        speedLimitTextField.setMaxStringLength(3);

        nextSpeedLimitTextField = new GuiTCTextField(fontRendererObj, this.width/2 -7, 89, 27,10);
        nextSpeedLimitTextField.setMaxStringLength(3);

        nextSpeedXTextField = new GuiTCTextField(fontRendererObj, this.width/2 +10, 109, 35,10);

        nextSpeedYTextField = new GuiTCTextField(fontRendererObj, this.width/2 +10, 129, 35,10);

        nextSpeedZTextField = new GuiTCTextField(fontRendererObj, this.width/2 +10, 149, 35,10);

        okayButton = new GuiButton(0,this.width/2 -5, this.height/2 + 45, 30,30, "Okay" );
        speedLimitTextField.setText(Integer.toString(transmitterBlock.setSpeed));
        nextSpeedLimitTextField.setText(Integer.toString(transmitterBlock.nextSpeedLimit));
        nextSpeedXTextField.setText(Double.toString(transmitterBlock.xFromSpeedChange));
        nextSpeedYTextField.setText(Double.toString(transmitterBlock.yFromSpeedChange));
        nextSpeedZTextField.setText(Double.toString(transmitterBlock.zFromSpeedChange));
        this.buttonList.add(okayButton);
    }

    @Override
    public void drawScreen(int mouseX, int mouseY, float partialTicks) {




        drawDefaultBackground();

        this.drawCenteredString(this.fontRendererObj, "Speed Transmitter Setup", this.width / 2, 40, 0xFFFFFFFF);
        glColor3f(1, 1, 1);
        this.drawString( this.fontRendererObj,"Speed Limit: ", this.width/2 -90, 70,  0xFFFFFFFF);
        speedLimitTextField.drawTextBox();
        this.drawString( this.fontRendererObj,"Speed Next Limit: ", this.width/2 -90, 90,  0xFFFFFFFF);
        nextSpeedLimitTextField.drawTextBox();
        this.drawString( this.fontRendererObj,"Speed Next Limit X: ", this.width/2 -90, 110,  0xFFFFFFFF);
        nextSpeedXTextField.drawTextBox();
        this.drawString( this.fontRendererObj,"Speed Next Limit Y: ", this.width/2 -90, 130,  0xFFFFFFFF);
        nextSpeedYTextField.drawTextBox();
        this.drawString( this.fontRendererObj,"Speed Next Limit Z: ", this.width/2 -90, 150,  0xFFFFFFFF);
        nextSpeedZTextField.drawTextBox();

        super.drawScreen(mouseX, mouseY, partialTicks);
    }

   @Override
    @SideOnly(Side.CLIENT)
    protected void actionPerformed(GuiButton button) {
        if (button.id == 0) {
            TileInfoTransmitterSpeed its = (TileInfoTransmitterSpeed)transmitterBlock.getWorldObj().getTileEntity(transmitterBlock.xCoord,transmitterBlock.yCoord,transmitterBlock.zCoord);
            its.setSpeed =Integer.parseInt(speedLimitTextField.getText());
            Traincraft.itsChannel.sendToServer(new PacketSetSpeed(Integer.parseInt(speedLimitTextField.getText()), its.xCoord, its.yCoord, its.zCoord, 0));
            its.nextUpdateSpeed(Integer.parseInt(nextSpeedLimitTextField.getText()), Double.parseDouble(nextSpeedXTextField.getText()),   Double.parseDouble(nextSpeedYTextField.getText()),  Double.parseDouble(nextSpeedZTextField.getText()));
            Traincraft.itnsChannel.sendToAll(new PacketNextSpeed( Integer.parseInt(nextSpeedLimitTextField.getText()), its.xCoord, its.yCoord, its.zCoord, Double.parseDouble(nextSpeedXTextField.getText()),   Double.parseDouble(nextSpeedYTextField.getText()),  Double.parseDouble(nextSpeedZTextField.getText()), 0));
        }
        mc.thePlayer.closeScreen();
    }
    @Override
    public void updateScreen() {
        super.updateScreen();
        if (speedLimitTextField.isFocused()) {speedLimitTextField.updateCursorCounter();}
        if (nextSpeedLimitTextField.isFocused()) {nextSpeedLimitTextField.updateCursorCounter();}
        if (nextSpeedXTextField.isFocused()) {nextSpeedXTextField.updateCursorCounter();}
        if (nextSpeedYTextField.isFocused()) {nextSpeedYTextField.updateCursorCounter();}
        if (nextSpeedZTextField.isFocused()) {nextSpeedZTextField.updateCursorCounter();}

    }
    @Override
    protected void keyTyped(char par1, int par2) {

        if (Character.isDigit(par1) ||  par1 == KeyEvent.VK_BACK_SPACE || par1 == KeyEvent.VK_PERIOD)  {
            if (speedLimitTextField.isFocused()) { speedLimitTextField.textboxKeyTyped(par1, par2); }
            if (nextSpeedLimitTextField.isFocused()) { nextSpeedLimitTextField.textboxKeyTyped(par1, par2); }
            if (nextSpeedXTextField.isFocused()) { nextSpeedXTextField.textboxKeyTyped(par1, par2); }
            if (nextSpeedYTextField.isFocused()) { nextSpeedYTextField.textboxKeyTyped(par1, par2); }
            if (nextSpeedZTextField.isFocused()) { nextSpeedZTextField.textboxKeyTyped(par1, par2); }
        }

        if (par2 == 1 || par2 == mc.gameSettings.keyBindBack.getKeyCode()) {
            if (! speedLimitTextField.isFocused()) {
                mc.thePlayer.closeScreen();
            }

        }

    }





    @Override
    protected void mouseClicked(int par1, int par2, int par3) {
        speedLimitTextField.mouseClicked(par1, par2, par3);
        nextSpeedLimitTextField.mouseClicked(par1, par2, par3);
        nextSpeedXTextField.mouseClicked(par1, par2, par3);
        nextSpeedYTextField.mouseClicked(par1, par2, par3);
        nextSpeedZTextField.mouseClicked(par1, par2, par3);
        super.mouseClicked(par1, par2, par3);
    }
    @Override
    public boolean doesGuiPauseGame() {
        return false;
    }
    public static boolean isInteger(String s) {
        try {
            Integer.parseInt(s);
        } catch(NumberFormatException e) {
            return false;
        } catch(NullPointerException e) {
            return false;
        }
        // only got here if we didn't return false
        return true;
    }

}

