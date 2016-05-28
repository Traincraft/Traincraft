/*******************************************************************************
 * Copyright (c) 2013 Mrbrutal. All rights reserved.
 * 
 * @name Traincraft
 * @author Mrbrutal
 ******************************************************************************/

package train.client.render.models.blocks;

import cpw.mods.fml.client.FMLClientHandler;
import net.minecraft.client.model.ModelBase;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.AdvancedModelLoader;
import net.minecraftforge.client.model.IModelCustom;
import org.lwjgl.opengl.GL11;
import train.common.library.Info;

public class ModelPresent extends ModelBase {
	private IModelCustom present;
	
	public ModelPresent() {
		present = new AdvancedModelLoader().loadModel(new ResourceLocation(Info.modelPrefix + "present.obj"));
	}
	
	public void render() {
		present.renderAll();
	}

	public void render(int color) {
		GL11.glDisable(GL11.GL_LIGHTING);
		GL11.glPushMatrix();
		GL11.glScalef(0.4f, 0.4f, 0.4f);
		FMLClientHandler.instance().getClient().renderEngine.bindTexture(new ResourceLocation(Info.resourceLocation,Info.modelTexPrefix + "present2.png"));
		float f1 = 1.0F;
		float f2 = (float) (color >> 16 & 255) / 255.0F;
		float f3 = (float) (color >> 8 & 255) / 255.0F;
		float f4 = (float) (color & 255) / 255.0F;
		GL11.glColor4f(f1 * f2, f1 * f3, f1 * f4, 1.0F);
		render();
		GL11.glEnable(GL11.GL_LIGHTING);
		FMLClientHandler.instance().getClient().renderEngine.bindTexture(new ResourceLocation(Info.resourceLocation,Info.modelTexPrefix + "present3.png"));
		GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
		render();
		GL11.glPopMatrix();
	}
}
