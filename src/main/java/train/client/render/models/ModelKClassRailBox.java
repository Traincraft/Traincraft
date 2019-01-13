//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2018 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator:
// Created on:14.12.2018 - 11:22:23
// Last changed on: 14.12.2018 - 11:22:23

package train.client.render.models;

import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import tmt.ModelBase;
import tmt.ModelRendererTurbo;
import tmt.Tessellator;
import train.common.library.Info;

public class ModelKClassRailBox extends ModelBase
{
	int textureX = 512;
	int textureY = 512;

	public ModelKClassRailBox()
	{
		kclassrailboxModel = new ModelRendererTurbo[19];
		kclassrailboxModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		kclassrailboxModel[1] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 1
		kclassrailboxModel[2] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 2
		kclassrailboxModel[3] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 3
		kclassrailboxModel[4] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 4
		kclassrailboxModel[5] = new ModelRendererTurbo(this, 225, 25, textureX, textureY); // Box 5
		kclassrailboxModel[6] = new ModelRendererTurbo(this, 289, 25, textureX, textureY); // Box 6
		kclassrailboxModel[7] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 7
		kclassrailboxModel[8] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 8
		kclassrailboxModel[9] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 9
		kclassrailboxModel[10] = new ModelRendererTurbo(this, 9, 33, textureX, textureY); // Box 10
		kclassrailboxModel[11] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 11
		kclassrailboxModel[12] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 12
		kclassrailboxModel[13] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 14
		kclassrailboxModel[14] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 15
		kclassrailboxModel[15] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 36
		kclassrailboxModel[16] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 38
		kclassrailboxModel[17] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 17
		kclassrailboxModel[18] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 18

		kclassrailboxModel[0].addBox(0F, 0F, 0F, 8, 3, 24, 0F); // Box 0
		kclassrailboxModel[0].setRotationPoint(-3F, -6F, 5F);

		kclassrailboxModel[1].addShapeBox(0F, 0F, 0F, 60, 20, 12, 0F, 0F, 0F, 7F, 0F, 0F, 7F, 0F, 0F, 7F, 0F, 0F, 7F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 1
		kclassrailboxModel[1].setRotationPoint(0F, -26F, 11F);

		kclassrailboxModel[2].addShapeBox(0F, 0F, 0F, 60, 9, 12, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 7F, 0F, 0F, 7F, 0F, 0F, 7F, 0F, 0F, 7F); // Box 2
		kclassrailboxModel[2].setRotationPoint(0F, -35F, 11F);

		kclassrailboxModel[3].addBox(0F, 0F, 0F, 8, 3, 24, 0F); // Box 3
		kclassrailboxModel[3].setRotationPoint(55F, -6F, 5F);

		kclassrailboxModel[4].addBox(0F, 0F, 0F, 8, 1, 24, 0F); // Box 4
		kclassrailboxModel[4].setRotationPoint(26F, -6F, 5F);

		kclassrailboxModel[5].addBox(0F, 0F, 0F, 21, 1, 8, 0F); // Box 5
		kclassrailboxModel[5].setRotationPoint(5F, -6F, 13F);

		kclassrailboxModel[6].addBox(0F, 0F, 0F, 21, 1, 8, 0F); // Box 6
		kclassrailboxModel[6].setRotationPoint(34F, -6F, 13F);

		kclassrailboxModel[7].addShapeBox(0F, 0F, 0F, 1, 29, 1, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 7
		kclassrailboxModel[7].setRotationPoint(-1F, -35F, 11F);

		kclassrailboxModel[8].addShapeBox(0F, 0F, 0F, 1, 29, 1, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		kclassrailboxModel[8].setRotationPoint(-1F, -35F, 22F);

		kclassrailboxModel[9].addShapeBox(0F, 0F, 0F, 1, 29, 1, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 9
		kclassrailboxModel[9].setRotationPoint(60F, -35F, 22F);

		kclassrailboxModel[10].addShapeBox(0F, 0F, 0F, 1, 29, 1, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 10
		kclassrailboxModel[10].setRotationPoint(60F, -35F, 11F);

		kclassrailboxModel[11].addBox(0F, 0F, 0F, 0, 5, 5, 0F); // Box 11
		kclassrailboxModel[11].setRotationPoint(-1.1F, -31F, 9F);

		kclassrailboxModel[12].addBox(0F, 0F, 0F, 0, 5, 5, 0F); // Box 12
		kclassrailboxModel[12].setRotationPoint(61.1F, -31F, 20F);

		kclassrailboxModel[13].addBox(0F, 0F, 0F, 6, 1, 6, 0F); // Box 14
		kclassrailboxModel[13].setRotationPoint(2F, -36F, 14F);

		kclassrailboxModel[14].addBox(0F, 0F, 0F, 6, 1, 6, 0F); // Box 15
		kclassrailboxModel[14].setRotationPoint(52F, -36F, 14F);

		kclassrailboxModel[15].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 36
		kclassrailboxModel[15].setRotationPoint(13F, -5F, 15F);

		kclassrailboxModel[16].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 38
		kclassrailboxModel[16].setRotationPoint(43F, -5F, 15F);

		kclassrailboxModel[17].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 17
		kclassrailboxModel[17].setRotationPoint(-5F, -6F, 16F);

		kclassrailboxModel[18].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 18
		kclassrailboxModel[18].setRotationPoint(63F, -6F, 16F);


	}

	ModelWellcarBogie bogie = new ModelWellcarBogie();
	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		for(int i = 0; i < 19; i++)
		{
			kclassrailboxModel[i].render(f5);
		}

		Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/wellcar_bogie.png"));

		GL11.glPushMatrix();
		GL11.glTranslated(0.85,-0.3,0.7);
		bogie.render(entity,f,f1,f2,f3,f4,f5);

		GL11.glTranslated(1.875,0,0);
		bogie.render(entity,f,f1,f2,f3,f4,f5);
		GL11.glPopMatrix();
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
	{
	}

	public ModelRendererTurbo kclassrailboxModel[];
}