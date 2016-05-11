/*******************************************************************************
 * Copyright (c) 2014 Mrbrutal. All rights reserved.
 * 
 * @name Traincraft
 * @author Mrbrutal
 ******************************************************************************/

package src.train.client.render.models.blocks;

import java.io.IOException;

import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelBase;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.AdvancedModelLoader;
import net.minecraftforge.client.model.IModelCustom;
import net.minecraftforge.client.model.ModelFormatException;

import org.lwjgl.opengl.GL11;

import src.train.common.library.Info;
import src.train.common.tile.TileBridgePillar;
import cpw.mods.fml.client.FMLClientHandler;

public class ModelBridgePillar extends ModelBase {
	private IModelCustom bridgePillar;

	public ModelBridgePillar() {
		bridgePillar = new AdvancedModelLoader().loadModel(new ResourceLocation(Info.modelPrefix + "bridge_block.obj"));
	}
	
	public void render() {
		bridgePillar.renderAll();
	}
	
	public void render(TileBridgePillar pillar, double x, double y, double z) {
		GL11.glPushMatrix();

		GL11.glTranslatef((float) x + 0.5f, (float) y, (float) z + 0.5f);

		FMLClientHandler.instance().getClient().renderEngine.bindTexture(new ResourceLocation(Info.resourceLocation, Info.modelTexPrefix + "track_slope.png"));
		GL11.glColor3f(1, 1, 1);
		int facing = pillar.getWorldObj().getBlockMetadata((int) pillar.xCoord, (int) pillar.yCoord, (int) pillar.zCoord);
		if(facing == 2){
			GL11.glRotatef(90, 0, 1, 0);
		}
		if(facing == 0){
			GL11.glRotatef(90, 0, 1, 0);
		}
		render();
		GL11.glPopMatrix();
	}
}
