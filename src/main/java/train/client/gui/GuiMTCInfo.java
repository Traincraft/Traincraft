package train.client.gui;


import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.Entity;
import train.client.gui.GuiTCTextField;
import train.common.Traincraft;
import train.common.api.Locomotive;
import train.common.mtc.packets.PacketMTCLevelUpdate;

import static org.lwjgl.opengl.GL11.glColor3f;

public class GuiMTCInfo extends GuiScreen {
       Locomotive theLocomotive;
       private GuiTCTextField trainLevel;
       private GuiButton okayButton;
    public GuiMTCInfo(Entity entity) {

        if (entity instanceof Locomotive) {

          theLocomotive = (Locomotive)entity;
      }
    }

    @Override
    public void initGui() {

        trainLevel = new GuiTCTextField(fontRendererObj, this.width/2 -5, this.height/2 - 1, 15,10);
        okayButton = new GuiButton(0,this.width/2 -5, this.height/2 + 10, 25,25, "Okay" );
        trainLevel.setMaxStringLength(1);
        trainLevel.setText(theLocomotive.trainLevel);
        this.buttonList.add(okayButton);

    }

    @Override
    public void drawScreen(int mouseX, int mouseY, float partialTicks) {




         drawDefaultBackground();

        this.drawCenteredString(this.fontRendererObj, "TrainAdditions Config", this.width / 2, 40, 0xFFFFFFFF);
        glColor3f(1, 1, 1);
        this.drawString( this.fontRendererObj,"Train Level: ", this.width/2 -70, this.height/2,  0xFFFFFFFF);

     trainLevel.drawTextBox();
        super.drawScreen(mouseX, mouseY, partialTicks);
    }

    @Override
    @SideOnly(Side.CLIENT)
    protected void actionPerformed(GuiButton button) {
        if (button.id == 0) {
            if (trainLevel.getText() != null && isInteger(trainLevel.getText())) {
               // System.out.println(trainLevel.getText());

                theLocomotive.trainLevel = trainLevel.getText();
                Traincraft.mtlChannel.sendToServer(new PacketMTCLevelUpdate(theLocomotive.getEntityId(), Integer.parseInt(trainLevel.getText())));
                mc.thePlayer.closeScreen();
                //update
            }
        }
    }
    @Override
    public void updateScreen() {
        super.updateScreen();
        trainLevel.updateCursorCounter();


    }
    @Override
    protected void keyTyped(char par1, int par2) {
        trainLevel.textboxKeyTyped(par1, par2);
        if (par2 == 1 || par2 == mc.gameSettings.keyBindBack.getKeyCode()) {
            if (!trainLevel.isFocused()) {
                mc.thePlayer.closeScreen();
            }
        }

    }

    @Override
    protected void mouseClicked(int par1, int par2, int par3) {
        trainLevel.mouseClicked(par1, par2, par3);
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
