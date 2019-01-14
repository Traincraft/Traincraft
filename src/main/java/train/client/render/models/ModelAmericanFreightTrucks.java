//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2019 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: genericamericantruck
// Model Creator:
// Created on:28.11.2018 - 19:44:47
// Last changed on: 28.11.2018 - 19:44:47

package train.client.render.models;

import net.minecraft.entity.Entity;
import tmt.ModelBase;
import tmt.ModelRendererTurbo;

public class ModelAmericanFreightTrucks extends ModelBase
{
	int textureX = 512;
	int textureY = 32;

	public ModelAmericanFreightTrucks()
	{
		americanfreighttrucksModel = new ModelRendererTurbo[20];
		americanfreighttrucksModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		americanfreighttrucksModel[1] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 1
		americanfreighttrucksModel[2] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 2
		americanfreighttrucksModel[3] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 3
		americanfreighttrucksModel[4] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 4
		americanfreighttrucksModel[5] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 5
		americanfreighttrucksModel[6] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 6
		americanfreighttrucksModel[7] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 7
		americanfreighttrucksModel[8] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 8
		americanfreighttrucksModel[9] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 9
		americanfreighttrucksModel[10] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 10
		americanfreighttrucksModel[11] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 11
		americanfreighttrucksModel[12] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 12
		americanfreighttrucksModel[13] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 13
		americanfreighttrucksModel[14] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 14
		americanfreighttrucksModel[15] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 15
		americanfreighttrucksModel[16] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 16
		americanfreighttrucksModel[17] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 18
		americanfreighttrucksModel[18] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 19
		americanfreighttrucksModel[19] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 20

		americanfreighttrucksModel[0].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 0
		americanfreighttrucksModel[0].setRotationPoint(0F, -4F, 5F);

		americanfreighttrucksModel[1].addBox(0F, 0F, 0F, 2, 2, 12, 0F); // Box 1
		americanfreighttrucksModel[1].setRotationPoint(0F, -2F, 0F);

		americanfreighttrucksModel[2].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, -1F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 2
		americanfreighttrucksModel[2].setRotationPoint(-3F, -3F, -1F);

		americanfreighttrucksModel[3].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 3
		americanfreighttrucksModel[3].setRotationPoint(-5F, -3F, -1F);

		americanfreighttrucksModel[4].addBox(0F, 0F, 0F, 10, 1, 1, 0F); // Box 4
		americanfreighttrucksModel[4].setRotationPoint(-4F, -3F, -1F);

		americanfreighttrucksModel[5].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 5
		americanfreighttrucksModel[5].setRotationPoint(7F, -3F, 0F);
		americanfreighttrucksModel[5].rotateAngleY = -3.14159265F;

		americanfreighttrucksModel[6].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, -1F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 6
		americanfreighttrucksModel[6].setRotationPoint(5F, -3F, 0F);
		americanfreighttrucksModel[6].rotateAngleY = -3.14159265F;

		americanfreighttrucksModel[7].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 7
		americanfreighttrucksModel[7].setRotationPoint(0F, -2F, -1F);

		americanfreighttrucksModel[8].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 8
		americanfreighttrucksModel[8].setRotationPoint(0F, -2F, 12F);

		americanfreighttrucksModel[9].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, -1F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 9
		americanfreighttrucksModel[9].setRotationPoint(-3F, -3F, 12F);

		americanfreighttrucksModel[10].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 10
		americanfreighttrucksModel[10].setRotationPoint(-5F, -3F, 12F);

		americanfreighttrucksModel[11].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, -1F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 11
		americanfreighttrucksModel[11].setRotationPoint(5F, -3F, 13F);
		americanfreighttrucksModel[11].rotateAngleY = -3.14159265F;

		americanfreighttrucksModel[12].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 12
		americanfreighttrucksModel[12].setRotationPoint(7F, -3F, 13F);
		americanfreighttrucksModel[12].rotateAngleY = -3.14159265F;

		americanfreighttrucksModel[13].addBox(0F, 0F, 0F, 10, 1, 1, 0F); // Box 13
		americanfreighttrucksModel[13].setRotationPoint(-4F, -3F, 12F);

		americanfreighttrucksModel[14].addBox(0F, 0F, 0F, 1, 1, 14, 0F); // Box 14
		americanfreighttrucksModel[14].setRotationPoint(-4F, -2F, -1F);

		americanfreighttrucksModel[15].addBox(0F, 0F, 0F, 1, 1, 14, 0F); // Box 15
		americanfreighttrucksModel[15].setRotationPoint(5F, -2F, -1F);

		americanfreighttrucksModel[16].addBox(0F, 0F, 0F, 5, 5, 0, 0F); // Box 16
		americanfreighttrucksModel[16].setRotationPoint(-6F, -4F, 0F);

		americanfreighttrucksModel[17].addBox(0F, 0F, 0F, 5, 5, 0, 0F); // Box 18
		americanfreighttrucksModel[17].setRotationPoint(3F, -4F, 0F);

		americanfreighttrucksModel[18].addBox(0F, 0F, 0F, 5, 5, 0, 0F); // Box 19
		americanfreighttrucksModel[18].setRotationPoint(3F, -4F, 12F);

		americanfreighttrucksModel[19].addBox(0F, 0F, 0F, 5, 5, 0, 0F); // Box 20
		americanfreighttrucksModel[19].setRotationPoint(-6F, -4F, 12F);


	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		for(int i = 0; i < 20; i++)
		{
			americanfreighttrucksModel[i].render(f5);
		}
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
	{
	}

	public ModelRendererTurbo americanfreighttrucksModel[];
}