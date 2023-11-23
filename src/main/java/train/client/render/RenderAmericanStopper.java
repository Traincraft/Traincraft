/*******************************************************************************
 * Copyright (c) 2012 Mrbrutal. All rights reserved.
 *
 * @name TrainCraft
 * @author Mrbrutal
 ******************************************************************************/

package train.client.render;

import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import train.client.render.models.blocks.ModelAmericanStopper;
import train.common.library.Info;
import train.common.tile.TileAmericanStopper;

public class RenderAmericanStopper extends TileEntitySpecialRenderer {

    private static final ModelAmericanStopper modelAmericanStopper = new ModelAmericanStopper(1.0F / 16.0F);
    private static final ResourceLocation texture = new ResourceLocation(Info.resourceLocation, Info.modelTexPrefix + "buffer.png");

    public RenderAmericanStopper() {
    }

    public void render(TileEntity var1, double x, double y, double z) {
        GL11.glPushMatrix();

        GL11.glTranslated(x, y, z);
        tmt.Tessellator.bindTexture(texture);

        GL11.glTranslatef(0.5F, 0.0F, 0.5F);
        modelAmericanStopper.render(0.0625F, ((TileAmericanStopper) var1).getFacing());

        GL11.glPopMatrix();
    }

    @Override
    public void renderTileEntityAt(TileEntity var1, double var2, double var4, double var6, float var8) {
        render(var1, var2, var4, var6);
    }
}
