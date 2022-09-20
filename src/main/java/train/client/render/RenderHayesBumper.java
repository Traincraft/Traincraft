/*******************************************************************************
 * Copyright (c) 2012 Mrbrutal. All rights reserved.
 *
 * @name TrainCraft
 * @author Mrbrutal
 ******************************************************************************/

package train.client.render;

import cpw.mods.fml.client.FMLClientHandler;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import train.client.render.models.blocks.ModelHayesBumper;
import train.common.library.Info;
import train.common.tile.TileHayesBumper;

public class RenderHayesBumper extends TileEntitySpecialRenderer {

    private static final ModelHayesBumper modelHayesBumper = new ModelHayesBumper();
    private static final ResourceLocation texture = new ResourceLocation(Info.resourceLocation,Info.modelTexPrefix + "HayesBumper.png");

    public RenderHayesBumper() {
    }

    public void render(TileEntity var1, double x, double y, double z) {
        GL11.glPushMatrix();

        GL11.glTranslated(x, y, z);
        FMLClientHandler.instance().getClient().renderEngine.bindTexture(texture);

        GL11.glTranslatef(0.5F, 0.0F, 0.5F);
        modelHayesBumper.render();

        GL11.glPopMatrix();
    }

    @Override
    public void renderTileEntityAt(TileEntity var1, double var2, double var4, double var6, float var8) {
        render(var1, var2, var4, var6);
    }
}
