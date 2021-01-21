/*******************************************************************************
 * Copyright (c) 2014 Mrbrutal. All rights reserved.
 * 
 * @name Traincraft
 * @author Mrbrutal
 ******************************************************************************/

package train.render.models.blocks;

import fexcraft.tmt.slim.Tessellator;
import net.minecraft.client.model.ModelBase;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.AdvancedModelLoader;
import net.minecraftforge.client.model.IModelCustom;
import org.lwjgl.opengl.GL11;
import train.library.Info;

public class ModelBridgePillar extends ModelBase {
	private IModelCustom bridgePillar;

	public ModelBridgePillar() {
		bridgePillar = AdvancedModelLoader.loadModel(new ResourceLocation(Info.modelPrefix + "bridge_block.obj"));
	}
	
	public void render() {
		bridgePillar.renderAll();
	}
	
	public void render(TileEntity pillar, double x, double y, double z) {
		if(pillar.getWorldObj()==null){
			GL11.glTranslated( x,  y+0.5,  z);
			GL11.glRotatef(180,0,0,1);
		} else {
			GL11.glTranslated( x + 0.5,  y,  z + 0.5);
		}

		Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, Info.modelTexPrefix + "track_slope.png"));
		/*int facing = pillar.getWorldObj().getBlockMetadata(pillar.xCoord, pillar.yCoord, pillar.zCoord);
		if(facing == 2 || facing==0){
			GL11.glRotatef(90, 0, 1, 0);
		}*/
		render();
	}
}
