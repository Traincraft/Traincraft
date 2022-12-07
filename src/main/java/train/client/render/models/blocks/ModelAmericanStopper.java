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

public class ModelAmericanStopper extends ModelBase {

    private IModelCustom track;

    public ModelAmericanStopper(float scale) {

        track =  AdvancedModelLoader.loadModel(new ResourceLocation(Info.modelPrefix + "american_bumper.obj"));


    }

    public void render(float f5, int meta) {
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



        GL11.glPushMatrix();
        GL11.glTranslatef(0, 0, 0);
        GL11.glRotatef(90, 0, 1, 0);
        tmt.Tessellator
                .bindTexture(new ResourceLocation(Info.resourceLocation, Info.modelTexPrefix + "american_stopper.png"));
        GL11.glColor4f(1, 1, 1, 1);
        track.renderAll();
        GL11.glPopMatrix();
    }


    public void render2(float f5) {

        GL11.glRotatef(90, 0, 1, 0);
        tmt.Tessellator
                .bindTexture(new ResourceLocation(Info.resourceLocation, Info.modelTexPrefix + "american_stopper.png"));
        GL11.glColor4f(1, 1, 1, 1);
        track.renderAll();
    }
}
