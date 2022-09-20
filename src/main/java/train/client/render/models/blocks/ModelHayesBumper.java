/*******************************************************************************
 * Copyright (c) 2012 Mrbrutal. All rights reserved.
 *
 * @name TrainCraft
 * @author Mrbrutal
 ******************************************************************************/

package train.client.render.models.blocks;

import cpw.mods.fml.client.FMLClientHandler;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.AdvancedModelLoader;
import net.minecraftforge.client.model.IModelCustom;
import org.lwjgl.opengl.GL11;
import tmt.ModelBase;
import train.client.render.CustomModelRenderer;
import train.common.library.Info;
import train.common.tile.TileTCRail;

public class ModelHayesBumper extends ModelBase {

    private IModelCustom track;
    private IModelCustom modelHayesBumper;

    public ModelHayesBumper() {
        track =  AdvancedModelLoader.loadModel(new ResourceLocation(Info.modelPrefix + "track_normal.obj"));
        modelHayesBumper = AdvancedModelLoader.loadModel(new ResourceLocation(Info.modelPrefix + "track_hayes_bumper.obj"));
    }

    public void renderHayesBumper(int meta) {
        if (meta != -1) {
            switch (meta) {
                case 0:
                    GL11.glRotatef(90.0F, 0.0F, 1.0F, 0.0F);
                case 1:
                    GL11.glRotatef(90.0F, 0.0F, 1.0F, 0.0F);
                case 2:
                    GL11.glRotatef(90.0F, 0.0F, 1.0F, 0.0F);
                case 3:
                    GL11.glRotatef(90.0F, 0.0F, 1.0F, 0.0F);
            }
        }
        modelHayesBumper.renderAll();
    }

    public void render(String type, TileTCRail tcRail, double x, double y, double z) {
        int facing = tcRail.getWorldObj().getBlockMetadata(tcRail.xCoord, tcRail.yCoord, tcRail.zCoord);
        render( type, facing, x, y, z, 1, 1, 1, 1);
    }

    public void render(String type, int facing, double x, double y, double z, float r, float g, float b, float a) {
        // Push a blank matrix onto the stack
        GL11.glPushMatrix();

        // Move the object into the correct position on the block (because the OBJ's origin is the center of the object)
        GL11.glTranslatef((float) x + 0.5f, (float) y, (float) z + 0.5f);

        // Bind the texture, so that OpenGL properly textures our block.
        FMLClientHandler.instance().getClient().renderEngine.bindTexture(new ResourceLocation(Info.resourceLocation, Info.modelTexPrefix + "HayesBumper.png"));
        this.renderHayesBumper(facing);
        // Pop this matrix from the stack.
        track.renderAll();
        modelHayesBumper.renderAll();
        GL11.glPopMatrix();
    }
}