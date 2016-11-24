/*
 * This file ("TestVecRenderer.java") is part of the Traincraft mod for Minecraft.
 * It is created by all persons that are listed with @author below.
 * It is distributed under the Traincraft License (https://github.com/Traincraft/Traincraft/blob/master/LICENSE.md)
 * You can find the source code at https://github.com/Traincraft/Traincraft
 *
 * © 2011-2016
 */

package si.meansoft.traincraft.client.renderer;

import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.VertexBuffer;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import si.meansoft.traincraft.tile.TileEntityWindmill;

/**
 * @author canitzp
 */
public class TestVecRenderer extends TileEntitySpecialRenderer<TileEntityWindmill>{

    @Override
    public void renderTileEntityAt(TileEntityWindmill te, double x, double y, double z, float partialTicks, int destroyStage){
        VertexBuffer buffer = Tessellator.getInstance().getBuffer();
        //GlStateManager.pushAttrib();
        GlStateManager.pushMatrix();
        GlStateManager.disableTexture2D();
        GlStateManager.disableBlend();
        //GlStateManager.color(1, 1, 1);
        //GlStateManager.glLineWidth(1.0F);
        buffer.begin(1, DefaultVertexFormats.POSITION_COLOR);
        buffer.pos(x, y, z).color(0.5F, 0.5F, 0.5F, 1F).endVertex();
        buffer.pos(x, y + 5, z).color(0.5F, 0.5F, 0.5F, 1F).endVertex();
        buffer.pos(x, y, z + 5).color(0.5F, 0.5F, 0.5F, 1F).endVertex();
        buffer.pos(x + 5, y + 5, z - 5).color(0.5F, 0.5F, 0.5F, 1F).endVertex();
        Tessellator.getInstance().draw();
        GlStateManager.enableBlend();
        GlStateManager.enableTexture2D();
        GlStateManager.popMatrix();
        //GlStateManager.popAttrib();
    }

}
