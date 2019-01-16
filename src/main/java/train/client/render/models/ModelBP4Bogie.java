//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2019 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator:
// Created on:14.01.2019 - 10:43:19
// Last changed on: 14.01.2019 - 10:43:19

package train.client.render.models;

import net.minecraft.entity.Entity;
import tmt.ModelBase;
import tmt.ModelRendererTurbo;

public class ModelBP4Bogie extends ModelBase
{
	int textureX = 512;
	int textureY = 512;

	public ModelBP4Bogie()
	{
		bp4bogieModel = new ModelRendererTurbo[27];
		bp4bogieModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 41
		bp4bogieModel[1] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 43
		bp4bogieModel[2] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 44
		bp4bogieModel[3] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 45
		bp4bogieModel[4] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 46
		bp4bogieModel[5] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 47
		bp4bogieModel[6] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 48
		bp4bogieModel[7] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 49
		bp4bogieModel[8] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 50
		bp4bogieModel[9] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 51
		bp4bogieModel[10] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 52
		bp4bogieModel[11] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 53
		bp4bogieModel[12] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 54
		bp4bogieModel[13] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 55
		bp4bogieModel[14] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 56
		bp4bogieModel[15] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 58
		bp4bogieModel[16] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 59
		bp4bogieModel[17] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 60
		bp4bogieModel[18] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 61
		bp4bogieModel[19] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 62
		bp4bogieModel[20] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 63
		bp4bogieModel[21] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 64
		bp4bogieModel[22] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 65
		bp4bogieModel[23] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 66
		bp4bogieModel[24] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 67
		bp4bogieModel[25] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 68
		bp4bogieModel[26] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 69

		bp4bogieModel[0].addBox(0F, 0F, 0F, 1, 1, 14, 0F); // Box 41
		bp4bogieModel[0].setRotationPoint(5F, 1F, 3F);

		bp4bogieModel[1].addBox(0F, 0F, 0F, 16, 4, 10, 0F); // Box 43
		bp4bogieModel[1].setRotationPoint(-8F, -1.5F, 5F);

		bp4bogieModel[2].addBox(0F, 0F, 0F, 1, 1, 14, 0F); // Box 44
		bp4bogieModel[2].setRotationPoint(-6F, 1F, 3F);

		bp4bogieModel[3].addBox(0F, 0F, 0F, 5, 5, 0, 0F); // Box 45
		bp4bogieModel[3].setRotationPoint(-8F, -1F, 4F);

		bp4bogieModel[4].addBox(0F, 0F, 0F, 5, 5, 0, 0F); // Box 46
		bp4bogieModel[4].setRotationPoint(3F, -1F, 4F);

		bp4bogieModel[5].addBox(0F, 0F, 0F, 5, 5, 0, 0F); // Box 47
		bp4bogieModel[5].setRotationPoint(3F, -1F, 16F);

		bp4bogieModel[6].addBox(0F, 0F, 0F, 5, 5, 0, 0F); // Box 48
		bp4bogieModel[6].setRotationPoint(-8F, -1F, 16F);

		bp4bogieModel[7].addShapeBox(0F, 0F, 0F, 16, 2, 1, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		bp4bogieModel[7].setRotationPoint(-8F, -1F, 3F);

		bp4bogieModel[8].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 50
		bp4bogieModel[8].setRotationPoint(-6F, 2F, 3F);

		bp4bogieModel[9].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 51
		bp4bogieModel[9].setRotationPoint(5F, 2F, 3F);

		bp4bogieModel[10].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 52
		bp4bogieModel[10].setRotationPoint(4F, 1F, 3F);

		bp4bogieModel[11].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 53
		bp4bogieModel[11].setRotationPoint(6F, 1F, 3F);

		bp4bogieModel[12].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 54
		bp4bogieModel[12].setRotationPoint(-5F, 1F, 3F);

		bp4bogieModel[13].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 55
		bp4bogieModel[13].setRotationPoint(-7F, 1F, 3F);

		bp4bogieModel[14].addBox(0F, 0F, 0F, 2, 2, 14, 0F); // Box 56
		bp4bogieModel[14].setRotationPoint(-1F, 1F, 3F);

		bp4bogieModel[15].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 58
		bp4bogieModel[15].setRotationPoint(4F, -0.5F, 2.5F);

		bp4bogieModel[16].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 59
		bp4bogieModel[16].setRotationPoint(-6F, -0.5F, 2.5F);

		bp4bogieModel[17].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 60
		bp4bogieModel[17].setRotationPoint(-6F, -0.5F, 17F);

		bp4bogieModel[18].addShapeBox(0F, 0F, 0F, 16, 2, 1, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 61
		bp4bogieModel[18].setRotationPoint(-8F, -1F, 16F);

		bp4bogieModel[19].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 62
		bp4bogieModel[19].setRotationPoint(-7F, 1F, 16F);

		bp4bogieModel[20].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 63
		bp4bogieModel[20].setRotationPoint(-5F, 1F, 16F);

		bp4bogieModel[21].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 64
		bp4bogieModel[21].setRotationPoint(-6F, 2F, 16F);

		bp4bogieModel[22].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 65
		bp4bogieModel[22].setRotationPoint(4F, 1F, 16F);

		bp4bogieModel[23].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 66
		bp4bogieModel[23].setRotationPoint(4F, -0.5F, 17F);

		bp4bogieModel[24].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 67
		bp4bogieModel[24].setRotationPoint(6F, 1F, 16F);

		bp4bogieModel[25].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 68
		bp4bogieModel[25].setRotationPoint(5F, 2F, 16F);

		bp4bogieModel[26].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 69
		bp4bogieModel[26].setRotationPoint(-2F, -2F, 8F);


	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		for(int i = 0; i < 27; i++)
		{
			bp4bogieModel[i].render(f5);
		}
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
	{
	}

	public ModelRendererTurbo bp4bogieModel[];
}