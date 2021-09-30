//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2021 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 11.11.2018 - 13:33:34
// Last changed on: 11.11.2018 - 13:33:34

package train.client.render.renderSwitch.models; //Path where the model is located

import tmt.ModelConverter;
import tmt.ModelRendererTurbo;

public class ModeloverheadWire extends ModelConverter //Same as Filename
{
	int textureX = 256;
	int textureY = 128;

	public ModeloverheadWire() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[19];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 1
		bodyModel[1] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 2
		bodyModel[2] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 3
		bodyModel[3] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 4
		bodyModel[4] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 5
		bodyModel[5] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 6
		bodyModel[6] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 7
		bodyModel[7] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 8
		bodyModel[8] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 9
		bodyModel[9] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 10
		bodyModel[10] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 11
		bodyModel[11] = new ModelRendererTurbo(this, 21, 23, textureX, textureY); // Box 12
		bodyModel[12] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 13
		bodyModel[13] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 14
		bodyModel[14] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 15
		bodyModel[15] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 16
		bodyModel[16] = new ModelRendererTurbo(this, 16, 18, textureX, textureY); // Box 15
		bodyModel[17] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 18
		bodyModel[18] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 19

		bodyModel[0].addBox(0F, 0F, 0F, 2, 51, 1, 0F); // Box 1
		bodyModel[0].setRotationPoint(-1F, -42F, -2F);

		bodyModel[1].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 2
		bodyModel[1].setRotationPoint(-1F, 1F, -1F);

		bodyModel[2].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 3
		bodyModel[2].setRotationPoint(-1F, -5F, -1F);

		bodyModel[3].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 4
		bodyModel[3].setRotationPoint(-1F, -11F, -1F);

		bodyModel[4].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 5
		bodyModel[4].setRotationPoint(-1F, -17F, -1F);

		bodyModel[5].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 6
		bodyModel[5].setRotationPoint(-1F, -23F, -1F);

		bodyModel[6].addBox(0F, 0F, 0F, 2, 9, 2, 0F); // Box 7
		bodyModel[6].setRotationPoint(-1F, -42F, -1F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 1, 1, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 1F, 0F, -9F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 9F, 1F, 0F, 9F, 1F); // Box 8
		bodyModel[7].setRotationPoint(-0.5F, -38F, -16F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 1, 2, 11, 0F,0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 9
		bodyModel[8].setRotationPoint(-0.5F, -39F, -25F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,0F, -3.5F, -1F, 0F, -3.5F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 3F, -1F, 0F, 3F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 10
		bodyModel[9].setRotationPoint(-0.5F, -39F, -29F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 2.85F, 0F, 0F, 2.85F, 0F, 0F, 3.5F, -4F, 0F, 3.5F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F); // Box 11
		bodyModel[10].setRotationPoint(-0.5F, -32F, -29F);

		bodyModel[11].addBox(0F, -1F, 0F, 1, 1, 7, 0F); // Box 12
		bodyModel[11].setRotationPoint(-0.5F, -31F, -28F);

		bodyModel[12].addBox(0F, 0F, 0F, 2, 2, 3, 0F); // Box 13
		bodyModel[12].setRotationPoint(-1F, -41.5F, -22F);

		bodyModel[13].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 14
		bodyModel[13].setRotationPoint(-0.5F, -41F, -19F);

		bodyModel[14].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 15
		bodyModel[14].setRotationPoint(-0.5F, -41F, -23F);

		bodyModel[15].addBox(0F, 0F, 0F, 4, 2, 8, 0F); // Box 16
		bodyModel[15].setRotationPoint(-2F, 8F, -4F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,-0.8F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 4F, -0.8F, -0.8F, 4F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, -0.8F, 0F, 4F); // Box 15
		bodyModel[16].setRotationPoint(-1F, -38.5F, -18F);

		bodyModel[17].addBox(0F, 0F, 0F, 2, 51, 1, 0F); // Box 18
		bodyModel[17].setRotationPoint(-1F, -42F, 1F);

		bodyModel[18].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 19
		bodyModel[18].setRotationPoint(-1F, -29F, -1F);
	}
	/*
	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		for(int i = 0; i < 19; i++)
		{
			bodyModel[i].render(f5);
		}
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
	{
	}

	public ModelRendererTurbo bodyModel[];

	 */
}
