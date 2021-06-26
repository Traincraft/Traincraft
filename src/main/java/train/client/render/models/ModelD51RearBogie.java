//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2018 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 01.10.2018 - 18:39:46
// Last changed on: 01.10.2018 - 18:39:46

package train.client.render.models; //Path where the model is located


import tmt.ModelConverter;
import tmt.ModelRendererTurbo;

public class ModelD51RearBogie extends ModelConverter //Same as Filename
{
	int textureX = 64;
	int textureY = 64;

	public ModelD51RearBogie() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[15];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box005
		bodyModel[1] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box043
		bodyModel[2] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box044
		bodyModel[3] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box065
		bodyModel[4] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Box068
		bodyModel[5] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box069
		bodyModel[6] = new ModelRendererTurbo(this, 9, 17, textureX, textureY); // Box070
		bodyModel[7] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box071
		bodyModel[8] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box072
		bodyModel[9] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Box073
		bodyModel[10] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box075
		bodyModel[11] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box076
		bodyModel[12] = new ModelRendererTurbo(this, 25, 41, textureX, textureY); // Box077
		bodyModel[13] = new ModelRendererTurbo(this, 41, 41, textureX, textureY); // Box078
		bodyModel[14] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 203

		bodyModel[0].addBox(0F, 0F, 0F, 2, 2, 12, 0F); // Box005
		bodyModel[0].setRotationPoint(-7F, 5F, -6F);

		bodyModel[1].addBox(0F, 0F, 0F, 8, 8, 0, 0F); // Box043
		bodyModel[1].setRotationPoint(-10F, 2F, -6F);

		bodyModel[2].addBox(0F, 0F, 0F, 8, 8, 0, 0F); // Box044
		bodyModel[2].setRotationPoint(-10F, 2F, 6F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 16, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box065
		bodyModel[3].setRotationPoint(-14F, 5F, 6F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box068
		bodyModel[4].setRotationPoint(-10F, 4F, 6F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box069
		bodyModel[5].setRotationPoint(-7F, 5F, 6F);

		bodyModel[6].addBox(0F, 0F, 0F, 1, 2, 12, 0F); // Box070
		bodyModel[6].setRotationPoint(1F, 5F, -6F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 16, 2, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box071
		bodyModel[7].setRotationPoint(-14F, 5F, -7F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box072
		bodyModel[8].setRotationPoint(-10F, 4F, -7F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 12, 2, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box073
		bodyModel[9].setRotationPoint(-12F, 7F, -7F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box075
		bodyModel[10].setRotationPoint(-7F, 5F, -7F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 8, 2, 1, 0F,0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box076
		bodyModel[11].setRotationPoint(-22F, 5F, 6F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 8, 2, 1, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F); // Box077
		bodyModel[12].setRotationPoint(-22F, 5F, -7F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 1, 3, 8, 0F,1F, 0F, -2F, 0F, -1F, 0F, 0F, -1F, 0F, 1F, 0F, -2F, 1F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, -2F); // Box078
		bodyModel[13].setRotationPoint(-23F, 4F, -4F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 12, 2, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 203
		bodyModel[14].setRotationPoint(-12F, 7F, 6F);
	}
}