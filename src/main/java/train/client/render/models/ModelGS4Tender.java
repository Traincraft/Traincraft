//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2018 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator:
// Created on:04.09.2017 - 12:12:33
// Last changed on: 04.09.2017 - 12:12:33

package train.client.render.models;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import tmt.ModelBase;
import tmt.ModelRendererTurbo;
import tmt.Tessellator;
import train.common.library.Info;

public class ModelGS4Tender extends ModelBase
{
	int textureX = 512;
	int textureY = 64;

	public ModelGS4Tender()
	{
		gs4tenderModel = new ModelRendererTurbo[19];
		gs4tenderModel[0] = new ModelRendererTurbo(this, 1, 4, textureX, textureY); // Box 01
		gs4tenderModel[1] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 04
		gs4tenderModel[2] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 05
		gs4tenderModel[3] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 11
		gs4tenderModel[4] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 24
		gs4tenderModel[5] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 26
		gs4tenderModel[6] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 27
		gs4tenderModel[7] = new ModelRendererTurbo(this, 217, 33, textureX, textureY); // Box 28
		gs4tenderModel[8] = new ModelRendererTurbo(this, 313, 33, textureX, textureY); // Box 29
		gs4tenderModel[9] = new ModelRendererTurbo(this, 193, 9, textureX, textureY); // Box 31
		gs4tenderModel[10] = new ModelRendererTurbo(this, 353, 9, textureX, textureY); // Box 32
		gs4tenderModel[11] = new ModelRendererTurbo(this, 217, 9, textureX, textureY); // Box 33
		gs4tenderModel[12] = new ModelRendererTurbo(this, 457, 9, textureX, textureY); // Box 34
		gs4tenderModel[13] = new ModelRendererTurbo(this, 481, 9, textureX, textureY); // Box 35 NOCULL
		gs4tenderModel[14] = new ModelRendererTurbo(this, 497, 9, textureX, textureY); // Box 36 NOCULL
		gs4tenderModel[15] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 15
		gs4tenderModel[16] = new ModelRendererTurbo(this, 353, 15, textureX, textureY); // Box 16
		gs4tenderModel[17] = new ModelRendererTurbo(this, 14, 2, textureX, textureY, "lamp"); // Box 24
		gs4tenderModel[18] = new ModelRendererTurbo(this, 217, 43, textureX, textureY); // Box 21

		gs4tenderModel[0].addBox(0F, 0F, 0F, 80, 25, 22, 0F); // Box 01
		gs4tenderModel[0].setRotationPoint(-41F, -20F, -12F);

		gs4tenderModel[1].addShapeBox(0F, 0F, 0F, 53, 2, 22, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 04
		gs4tenderModel[1].setRotationPoint(-14F, -22F, -12F);

		gs4tenderModel[2].addBox(0F, 0F, 0F, 1, 4, 4, 0F); // Box 05
		gs4tenderModel[2].setRotationPoint(39F, -13F, -3F);

		gs4tenderModel[3].addBox(0F, 0F, 0F, 20, 3, 1, 0F); // Box 11
		gs4tenderModel[3].setRotationPoint(-11F, 5F, 9F);

		gs4tenderModel[4].addShapeBox(0F, 0F, 0F, 27, 4, 22, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		gs4tenderModel[4].setRotationPoint(-41F, -24F, -12F);

		gs4tenderModel[5].addBox(0F, 0F, 0F, 19, 1, 1, 0F); // Box 26
		gs4tenderModel[5].setRotationPoint(-33F, -25F, -12F);

		gs4tenderModel[6].addBox(0F, 0F, 0F, 19, 1, 1, 0F); // Box 27
		gs4tenderModel[6].setRotationPoint(-33F, -25F, 9F);

		gs4tenderModel[7].addBox(0F, 0F, 0F, 46, 5, 1, 0F); // Box 28
		gs4tenderModel[7].setRotationPoint(-14F, -26F, 6F);

		gs4tenderModel[8].addBox(0F, 0F, 0F, 46, 5, 1, 0F); // Box 29
		gs4tenderModel[8].setRotationPoint(-14F, -26F, -9F);

		gs4tenderModel[9].addBox(0F, 0F, 0F, 5, 1, 10, 0F); // Box 31
		gs4tenderModel[9].setRotationPoint(-42F, -22.5F, -6F);

		gs4tenderModel[10].addBox(0F, 0F, 0F, 20, 3, 1, 0F); // Box 32
		gs4tenderModel[10].setRotationPoint(-11F, 5F, -12F);

		gs4tenderModel[11].addBox(0F, 0F, 0F, 6, 4, 1, 0F); // Box 33
		gs4tenderModel[11].setRotationPoint(-38F, -25F, -6F);
		gs4tenderModel[11].rotateAngleZ = 0.43633231F;

		gs4tenderModel[12].addBox(0F, 0F, 0F, 6, 4, 1, 0F); // Box 34
		gs4tenderModel[12].setRotationPoint(-38F, -25F, 3F);
		gs4tenderModel[12].rotateAngleZ = 0.43633231F;

		gs4tenderModel[13].addBox(0F, 0F, 0F, 4, 28, 1, 0F); // Box 35 NOCULL
		gs4tenderModel[13].setRotationPoint(34.05F, -20F, 10.05F);

		gs4tenderModel[14].addBox(0F, 0F, 0F, 4, 28, 1, 0F); // Box 36 NOCULL
		gs4tenderModel[14].setRotationPoint(34F, -20F, -13F);

		gs4tenderModel[15].addBox(0F, 0F, 0F, 4, 3, 4, 0F); // Box 15
		gs4tenderModel[15].setRotationPoint(-21F, -27F, -3F);

		gs4tenderModel[16].addBox(0F, 0F, 0F, 4, 5, 2, 0F); // Box 16
		gs4tenderModel[16].setRotationPoint(-11F, -27F, 1F);

		gs4tenderModel[17].addBox(0F, 0F, 0F, 0, 3, 3, 0F); // Box 24
		gs4tenderModel[17].setRotationPoint(40.05F, -12.5F, -2.5F);

		gs4tenderModel[18].addShapeBox(0F, 0F, 0F, 53, 2, 16, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 21
		gs4tenderModel[18].setRotationPoint(-14F, -24F, -9F);


	}

	ModelGS4TenderBogie bogie1 = new ModelGS4TenderBogie();

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		for(int i = 0; i < 19; i++)
		{

			if(gs4tenderModel[i].boxName!= null && gs4tenderModel[i].boxName.equals("lamp")){
				Minecraft.getMinecraft().entityRenderer.disableLightmap(1D);
				gs4tenderModel[i].render(f5);
				Minecraft.getMinecraft().entityRenderer.enableLightmap(1D);

			} else {
				gs4tenderModel[i].render(f5);
			}
		}


		Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/GS4_tender_bogie.png"));
		GL11.glPushMatrix();
		GL11.glTranslated(-1.8,0.0,-0.1);
		bogie1.render(entity,f,f1,f2,f3,f4,f5);
		GL11.glPopMatrix();

		GL11.glPushMatrix();
		GL11.glTranslated(1.7,0.0,-0.1);
		GL11.glRotated(180,0,1,0);
		bogie1.render(entity,f,f1,f2,f3,f4,f5);
		GL11.glPopMatrix();
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
	{
	}

	public ModelRendererTurbo gs4tenderModel[];
}