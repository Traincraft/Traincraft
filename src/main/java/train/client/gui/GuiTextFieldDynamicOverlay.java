package train.client.gui;

import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.GuiTextField;

import java.awt.*;

public class GuiTextFieldDynamicOverlay extends GuiTextField {
    private final int drawXPosition;
    private final int drawYPosition;
    private final int GUI_ANCHOR_Y_BOTTOM;
    private final int GUI_ANCHOR_X_RIGHT;
    private final String prefix;
    private final int[] inactiveColors = new int[]{ new Color(22, 22, 22).getRGB(), new Color(142, 142, 142).getRGB(), new Color(166, 166, 166).getRGB() };
    private final int[] activeColors = new int[]{ new Color(0, 130, 13).getRGB(), new Color(0, 89, 7).getRGB(), new Color(166, 166, 166).getRGB() };
    public GuiTextFieldDynamicOverlay(FontRenderer p_i1032_1_, int p_i1032_2_, int p_i1032_3_, int p_i1032_4_, int p_i1032_5_, String prefix) {
        super(p_i1032_1_, p_i1032_2_, p_i1032_3_, p_i1032_4_, p_i1032_5_);
        drawXPosition = xPosition - 8;
        drawYPosition = yPosition - 7;
        GUI_ANCHOR_Y_BOTTOM = yPosition + height;
        GUI_ANCHOR_X_RIGHT = xPosition + width + 6;
        this.prefix = prefix;
    }

    @Override
    public void drawTextBox() {
        int[] colorsList;
        if (!isFocused())
            colorsList = inactiveColors;
        else
            colorsList = activeColors;
        drawRect(drawXPosition + 2, drawYPosition, GUI_ANCHOR_X_RIGHT - 2, GUI_ANCHOR_Y_BOTTOM, colorsList[0]);
        drawRect(drawXPosition, drawYPosition + 2, GUI_ANCHOR_X_RIGHT, GUI_ANCHOR_Y_BOTTOM - 2, colorsList[0]);
        drawRect(drawXPosition + 1, drawYPosition + 1, GUI_ANCHOR_X_RIGHT - 1, GUI_ANCHOR_Y_BOTTOM - 1, colorsList[0]);
        drawRect(drawXPosition + 1, drawYPosition + 2, drawXPosition + 1, GUI_ANCHOR_Y_BOTTOM - 2, colorsList[1]);
        drawRect(drawXPosition + 2, GUI_ANCHOR_Y_BOTTOM - 1, GUI_ANCHOR_X_RIGHT - 2, GUI_ANCHOR_Y_BOTTOM - 1, colorsList[1]);
        drawRect(drawXPosition + 2, drawYPosition + 1, GUI_ANCHOR_X_RIGHT - 2, GUI_ANCHOR_Y_BOTTOM - 2, colorsList[2]);
        drawRect(drawXPosition + 2, drawYPosition + 2, GUI_ANCHOR_X_RIGHT - 1, GUI_ANCHOR_Y_BOTTOM - 2, colorsList[2]);
        if (prefix != null) {
            String string = getText();
            setText("#" + getText());
            super.drawTextBox();
            setText(string);
        } else {
            super.drawTextBox();
        }
    }
}