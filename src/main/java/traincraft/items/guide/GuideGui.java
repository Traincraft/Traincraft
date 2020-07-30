/*
 * Traincraft
 * Copyright (c) 2011-2020.
 *
 * This file ("GuideGui.java") is part of the Traincraft mod for Minecraft.
 * It is created by all people that are listed with @author below.
 * It is distributed under LGPL-v3.0.
 * You can find the source code at https://github.com/Traincraft/Traincraft
 */

package traincraft.items.guide;

import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;

public class GuideGui extends GuiScreen {
    
    private final EntityPlayerSP player;
    private final EnumHand hand;
    private final BlockPos position;
    
    public GuideGui(EntityPlayerSP player, EnumHand hand, BlockPos position){
        this.player = player;
        this.hand = hand;
        this.position = position;
    }
    
    @Override
    public void drawScreen(int mouseX, int mouseY, float partialTicks){
        this.drawDefaultBackground();
        // Only call when we actually use the minecraft button/label functionality: super.drawScreen(mouseX, mouseY, partialTicks);
    }
}
