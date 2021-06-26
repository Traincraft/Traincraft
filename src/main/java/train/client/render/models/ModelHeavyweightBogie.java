//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2018 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator:
// Created on:07.11.2018 - 22:29:01
// Last changed on: 07.11.2018 - 22:29:01

package train.client.render.models;

import net.minecraft.entity.Entity;
import tmt.ModelBase;
import tmt.ModelRendererTurbo;

public class ModelHeavyweightBogie extends ModelBase
{
	int textureX = 128;
	int textureY = 64;

	public ModelHeavyweightBogie()
	{
		heavyweightbogieModel = new ModelRendererTurbo[15];
		heavyweightbogieModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		heavyweightbogieModel[1] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 1
		heavyweightbogieModel[2] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 2
		heavyweightbogieModel[3] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Box 3
		heavyweightbogieModel[4] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 4
		heavyweightbogieModel[5] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 5
		heavyweightbogieModel[6] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 6
		heavyweightbogieModel[7] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 7
		heavyweightbogieModel[8] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 8
		heavyweightbogieModel[9] = new ModelRendererTurbo(this, 113, 9, textureX, textureY); // Box 9
		heavyweightbogieModel[10] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 11
		heavyweightbogieModel[11] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 12
		heavyweightbogieModel[12] = new ModelRendererTurbo(this, 41, 17, textureX, textureY); // Box 13
		heavyweightbogieModel[13] = new ModelRendererTurbo(this, 49, 25, textureX, textureY); // Box 14
		heavyweightbogieModel[14] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 15

		heavyweightbogieModel[0].addBox(0F, 0F, 0F, 32, 5, 1, 0F); // Box 0
		heavyweightbogieModel[0].setRotationPoint(-16F, 4F, 6F);

		heavyweightbogieModel[1].addBox(0F, 0F, 0F, 32, 5, 1, 0F); // Box 1
		heavyweightbogieModel[1].setRotationPoint(-16F, 4F, -7F);

		heavyweightbogieModel[2].addBox(0F, 0F, 0F, 1, 2, 12, 0F); // Box 2
		heavyweightbogieModel[2].setRotationPoint(-16F, 4F, -6F);

		heavyweightbogieModel[3].addBox(0F, 0F, 0F, 1, 2, 12, 0F); // Box 3
		heavyweightbogieModel[3].setRotationPoint(15F, 4F, -6F);

		heavyweightbogieModel[4].addBox(0F, 0F, 0F, 6, 6, 0, 0F); // Box 4
		heavyweightbogieModel[4].setRotationPoint(-14F, 4F, 6F);

		heavyweightbogieModel[5].addBox(0F, 0F, 0F, 2, 2, 16, 0F); // Box 5
		heavyweightbogieModel[5].setRotationPoint(-12F, 6F, -8F);

		heavyweightbogieModel[6].addBox(0F, 0F, 0F, 2, 2, 16, 0F); // Box 6
		heavyweightbogieModel[6].setRotationPoint(-1F, 6F, -8F);

		heavyweightbogieModel[7].addBox(0F, 0F, 0F, 6, 6, 0, 0F); // Box 7
		heavyweightbogieModel[7].setRotationPoint(-3F, 4F, 6F);

		heavyweightbogieModel[8].addBox(0F, 0F, 0F, 2, 2, 16, 0F); // Box 8
		heavyweightbogieModel[8].setRotationPoint(10F, 6F, -8F);

		heavyweightbogieModel[9].addBox(0F, 0F, 0F, 6, 6, 0, 0F); // Box 9
		heavyweightbogieModel[9].setRotationPoint(8F, 4F, 6F);

		heavyweightbogieModel[10].addBox(0F, 0F, 0F, 6, 6, 0, 0F); // Box 11
		heavyweightbogieModel[10].setRotationPoint(-14F, 4F, -6F);

		heavyweightbogieModel[11].addBox(0F, 0F, 0F, 6, 6, 0, 0F); // Box 12
		heavyweightbogieModel[11].setRotationPoint(-3F, 4F, -6F);

		heavyweightbogieModel[12].addBox(0F, 0F, 0F, 6, 6, 0, 0F); // Box 13
		heavyweightbogieModel[12].setRotationPoint(8F, 4F, -6F);

		heavyweightbogieModel[13].addBox(0F, 0F, 0F, 6, 2, 3, 0F); // Box 14
		heavyweightbogieModel[13].setRotationPoint(-22F, 4F, -1.5F);

		heavyweightbogieModel[14].addBox(0F, 0F, 0F, 30, 2, 12, 0F); // Box 15
		heavyweightbogieModel[14].setRotationPoint(-15F, 3F, -6F);


	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		for(int i = 0; i < 15; i++)
		{
			heavyweightbogieModel[i].render(f5);
		}
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
	{
	}

	public ModelRendererTurbo heavyweightbogieModel[];
}