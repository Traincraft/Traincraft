/*******************************************************************************
 * Copyright (c) 2013 Mrbrutal. All rights reserved.
 * 
 * @name Traincraft
 * @author Mrbrutal
 ******************************************************************************/

package train.render.models.blocks;

import cpw.mods.fml.client.FMLClientHandler;
import fexcraft.tmt.slim.TextureManager;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelBase;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import net.minecraftforge.client.model.AdvancedModelLoader;
import net.minecraftforge.client.model.IModelCustom;
import org.lwjgl.opengl.GL11;
import train.library.Info;

public class ModelLights extends ModelBase {
	private IModelCustom present;
	
	public ModelLights() {
		present = AdvancedModelLoader.loadModel(new ResourceLocation(Info.modelPrefix + "lights2.obj"));
	}
	
	public void render(String partname) {
		present.renderPart(partname);
	}
	
	public void render(int color, World world) {
		//GL11.glEnable(GL11.GL_LIGHTING);
		GL11.glPushMatrix();
		GL11.glRotatef(90f, 0, 1, 0);
		TextureManager.bindTexture(new ResourceLocation(Info.resourceLocation,Info.modelTexPrefix + "lights3.png"));
		render("Branch_1");
		if(world!=null) {
			Minecraft.getMinecraft().entityRenderer.disableLightmap(1D);
		}
		GL11.glEnable(GL11.GL_BLEND);
		TextureManager.bindTexture(new ResourceLocation(Info.resourceLocation,Info.modelTexPrefix + "lights.png"));
		render("Bulb_1");
		GL11.glColor4f(1.0f, 1.0f, 1.0f, 0.3f);
		render("Plane_1");
		GL11.glDisable(GL11.GL_BLEND);
		GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
		if(world!=null) {
			Minecraft.getMinecraft().entityRenderer.enableLightmap(1D);
		}
		GL11.glPopMatrix();
	}
}
