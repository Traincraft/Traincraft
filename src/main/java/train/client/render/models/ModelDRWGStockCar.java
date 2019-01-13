//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2017 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: D&RGW Stock Car 
// Model Creator: Thomas4peyton
// Created on:05.08.2017 - 12:29:54
// Last changed on: 05.08.2017 - 12:29:54

package train.client.render.models;

import net.minecraft.entity.Entity;
import tmt.ModelBase;
import tmt.ModelRendererTurbo;

public class ModelDRWGStockCar extends ModelBase
{
	int textureX = 256;
	int textureY = 256;

	public ModelDRWGStockCar()
	{
		drwgstockcarModel = new ModelRendererTurbo[34];
		drwgstockcarModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // wheel
		drwgstockcarModel[1] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // wheel
		drwgstockcarModel[2] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 10
		drwgstockcarModel[3] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // wheel
		drwgstockcarModel[4] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // wheel
		drwgstockcarModel[5] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 17
		drwgstockcarModel[6] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // wheel
		drwgstockcarModel[7] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // wheel
		drwgstockcarModel[8] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 21
		drwgstockcarModel[9] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // wheel
		drwgstockcarModel[10] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // wheel
		drwgstockcarModel[11] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 24
		drwgstockcarModel[12] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Wall Right
		drwgstockcarModel[13] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 34
		drwgstockcarModel[14] = new ModelRendererTurbo(this, 105, 9, textureX, textureY); // Box 36
		drwgstockcarModel[15] = new ModelRendererTurbo(this, 113, 9, textureX, textureY); // Walkway
		drwgstockcarModel[16] = new ModelRendererTurbo(this, 113, 17, textureX, textureY); // Box 38
		drwgstockcarModel[17] = new ModelRendererTurbo(this, 121, 17, textureX, textureY); // Box 39
		drwgstockcarModel[18] = new ModelRendererTurbo(this, 161, 17, textureX, textureY); // Box 40
		drwgstockcarModel[19] = new ModelRendererTurbo(this, 201, 25, textureX, textureY); // Box 45
		drwgstockcarModel[20] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Wall Left
		drwgstockcarModel[21] = new ModelRendererTurbo(this, 121, 41, textureX, textureY); // Box 47
		drwgstockcarModel[22] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 51
		drwgstockcarModel[23] = new ModelRendererTurbo(this, 185, 49, textureX, textureY); // End 1
		drwgstockcarModel[24] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 75
		drwgstockcarModel[25] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 76
		drwgstockcarModel[26] = new ModelRendererTurbo(this, 57, 89, textureX, textureY); // Box 77
		drwgstockcarModel[27] = new ModelRendererTurbo(this, 113, 89, textureX, textureY); // Box 78
		drwgstockcarModel[28] = new ModelRendererTurbo(this, 209, 73, textureX, textureY); // Box 79
		drwgstockcarModel[29] = new ModelRendererTurbo(this, 225, 49, textureX, textureY); // Box 80
		drwgstockcarModel[30] = new ModelRendererTurbo(this, 177, 97, textureX, textureY); // Box 81
		drwgstockcarModel[31] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 82
		drwgstockcarModel[32] = new ModelRendererTurbo(this, 41, 113, textureX, textureY); // Box 34
		drwgstockcarModel[33] = new ModelRendererTurbo(this, 41, 129, textureX, textureY); // Box 35

		drwgstockcarModel[0].addBox(0F, 0F, 0F, 6, 6, 1, 0F); // wheel
		drwgstockcarModel[0].setRotationPoint(1F, -6F, -6F);

		drwgstockcarModel[1].addBox(0F, 0F, 0F, 6, 6, 1, 0F); // wheel
		drwgstockcarModel[1].setRotationPoint(-6F, -6F, -6F);

		drwgstockcarModel[2].addBox(0F, 0F, 0F, 9, 2, 1, 0F); // Box 10
		drwgstockcarModel[2].setRotationPoint(-4F, -4F, -7F);

		drwgstockcarModel[3].addBox(0F, 0F, 0F, 6, 6, 1, 0F); // wheel
		drwgstockcarModel[3].setRotationPoint(-6F, -6F, 6F);

		drwgstockcarModel[4].addBox(0F, 0F, 0F, 6, 6, 1, 0F); // wheel
		drwgstockcarModel[4].setRotationPoint(1F, -6F, 6F);

		drwgstockcarModel[5].addBox(0F, 0F, 0F, 9, 2, 1, 0F); // Box 17
		drwgstockcarModel[5].setRotationPoint(-4F, -4F, 7F);

		drwgstockcarModel[6].addBox(0F, 0F, 0F, 6, 6, 1, 0F); // wheel
		drwgstockcarModel[6].setRotationPoint(32F, -6F, -6F);

		drwgstockcarModel[7].addBox(0F, 0F, 0F, 6, 6, 1, 0F); // wheel
		drwgstockcarModel[7].setRotationPoint(25F, -6F, -6F);

		drwgstockcarModel[8].addBox(0F, 0F, 0F, 9, 2, 1, 0F); // Box 21
		drwgstockcarModel[8].setRotationPoint(27F, -4F, -7F);

		drwgstockcarModel[9].addBox(0F, 0F, 0F, 6, 6, 1, 0F); // wheel
		drwgstockcarModel[9].setRotationPoint(25F, -6F, 6F);

		drwgstockcarModel[10].addBox(0F, 0F, 0F, 6, 6, 1, 0F); // wheel
		drwgstockcarModel[10].setRotationPoint(32F, -6F, 6F);

		drwgstockcarModel[11].addBox(0F, 0F, 0F, 9, 2, 1, 0F); // Box 24
		drwgstockcarModel[11].setRotationPoint(27F, -4F, 7F);

		drwgstockcarModel[12].addBox(0F, 0F, 0F, 49, 23, 1, 0F); // Wall Right
		drwgstockcarModel[12].setRotationPoint(-8.5F, -30F, 9F);

		drwgstockcarModel[13].addBox(0F, 0F, 0F, 2, 2, 20, 0F); // Box 34
		drwgstockcarModel[13].setRotationPoint(-8.5F, -5F, -9.5F);
		drwgstockcarModel[13].rotateAngleZ = -1.57079633F;

		drwgstockcarModel[14].addBox(0F, 0F, 0F, 2, 46, 1, 0F); // Box 36
		drwgstockcarModel[14].setRotationPoint(-7F, -5F, 9F);
		drwgstockcarModel[14].rotateAngleZ = -1.57079633F;

		drwgstockcarModel[15].addBox(0F, 0F, 0F, 51, 1, 4, 0F); // Walkway
		drwgstockcarModel[15].setRotationPoint(-9.5F, -31.6F, -1.5F);

		drwgstockcarModel[16].addBox(0F, 0F, 0F, 2, 46, 1, 0F); // Box 38
		drwgstockcarModel[16].setRotationPoint(-7F, -5F, -9F);
		drwgstockcarModel[16].rotateAngleZ = -1.57079633F;

		drwgstockcarModel[17].addBox(0F, 0F, 0F, 1, 1, 17, 0F); // Box 39
		drwgstockcarModel[17].setRotationPoint(39F, -6F, -8F);
		drwgstockcarModel[17].rotateAngleZ = -1.57079633F;

		drwgstockcarModel[18].addBox(0F, 0F, 0F, 1, 23, 17, 0F); // Box 40
		drwgstockcarModel[18].setRotationPoint(39F, -30F, -8F);

		drwgstockcarModel[19].addBox(0F, 0F, 0F, 2, 2, 20, 0F); // Box 45
		drwgstockcarModel[19].setRotationPoint(38.5F, -5F, -9.5F);
		drwgstockcarModel[19].rotateAngleZ = -1.57079633F;

		drwgstockcarModel[20].addBox(0F, 0F, 0F, 49, 23, 1, 0F); // Wall Left
		drwgstockcarModel[20].setRotationPoint(-8.5F, -30F, -9F);

		drwgstockcarModel[21].addBox(0F, 0F, 0F, 1, 23, 17, 0F); // Box 47
		drwgstockcarModel[21].setRotationPoint(-8F, -30F, -8F);

		drwgstockcarModel[22].addBox(0F, 0F, 0F, 50, 1, 1, 0F); // Box 51
		drwgstockcarModel[22].setRotationPoint(-9F, -31F, 0F);

		drwgstockcarModel[23].addBox(0F, 0F, 0F, 1, 23, 17, 0F); // End 1
		drwgstockcarModel[23].setRotationPoint(-8.5F, -7F, 9F);
		drwgstockcarModel[23].rotateAngleX = -3.14159265F;

		drwgstockcarModel[24].addBox(0F, 0F, 0F, 54, 2, 3, 0F); // Box 75
		drwgstockcarModel[24].setRotationPoint(-11.5F, -7F, -1F);

		drwgstockcarModel[25].addBox(0F, 0F, 0F, 15, 4, 11, 0F); // Box 76
		drwgstockcarModel[25].setRotationPoint(-7F, -5F, -5F);

		drwgstockcarModel[26].addBox(0F, 0F, 0F, 15, 4, 11, 0F); // Box 77
		drwgstockcarModel[26].setRotationPoint(24F, -5F, -5F);

		drwgstockcarModel[27].addBox(0F, 0F, 0F, 16, 3, 13, 0F); // Box 78
		drwgstockcarModel[27].setRotationPoint(8F, -5F, -6F);

		drwgstockcarModel[28].addBox(0F, 0F, 0F, 1, 23, 17, 0F); // Box 79
		drwgstockcarModel[28].setRotationPoint(39.5F, -7F, 9F);
		drwgstockcarModel[28].rotateAngleX = 3.14159265F;

		drwgstockcarModel[29].addBox(0F, 0F, 0F, 14, 19, 1, 0F); // Box 80
		drwgstockcarModel[29].setRotationPoint(9.5F, -27F, 10F);

		drwgstockcarModel[30].addBox(0F, 0F, 0F, 14, 19, 1, 0F); // Box 81
		drwgstockcarModel[30].setRotationPoint(9.5F, -27F, -10F);

		drwgstockcarModel[31].addBox(0F, 0F, 0F, 1, 45, 17, 0F); // Box 82
		drwgstockcarModel[31].setRotationPoint(-6F, -6.5F, -8F);
		drwgstockcarModel[31].rotateAngleZ = -1.57079633F;

		drwgstockcarModel[32].addShapeBox(0F, 0F, -9F, 50, 1, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		drwgstockcarModel[32].setRotationPoint(-9F, -31F, 10F);

		drwgstockcarModel[33].addShapeBox(0F, 0F, -9F, 50, 1, 9, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 35
		drwgstockcarModel[33].setRotationPoint(-9F, -31F, 0F);


	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		for(int i = 0; i < 34; i++)
		{
			drwgstockcarModel[i].render(f5);
		}
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
	{
	}

	public ModelRendererTurbo drwgstockcarModel[];
}