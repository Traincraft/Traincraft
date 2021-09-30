//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2021 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 09.08.2021 - 17:20:03
// Last changed on: 09.08.2021 - 17:20:03

package train.client.render.renderSwitch.models; //Path where the model is located

import tmt.ModelConverter;
import tmt.ModelRendererTurbo;

public class ModelspeedSign extends ModelConverter //Same as Filename
{
	int textureX = 128;
	int textureY = 128;

	public ModelspeedSign() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[13];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 12
		bodyModel[1] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 20
		bodyModel[2] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 23
		bodyModel[3] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 24
		bodyModel[4] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 25
		bodyModel[5] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 26
		bodyModel[6] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 27
		bodyModel[7] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 28
		bodyModel[8] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 34
		bodyModel[9] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 10
		bodyModel[10] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 19
		bodyModel[11] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 20
		bodyModel[12] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Box 21

		bodyModel[0].addBox(0F, 0F, 0F, 1, 24, 1, 0F); // Box 12
		bodyModel[0].setRotationPoint(-0.24F, -14F, -0.5F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 1, 9, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 20
		bodyModel[1].setRotationPoint(-0.74F, -14F, -1.5F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 23
		bodyModel[2].setRotationPoint(-0.74F, -11F, -4.5F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 24
		bodyModel[3].setRotationPoint(-0.74F, -11F, 1.5F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 25
		bodyModel[4].setRotationPoint(-0.74F, -14F, 1.5F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -0.5F, -3F, 0F); // Box 26
		bodyModel[5].setRotationPoint(-1.24F, -8F, 1.5F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 27
		bodyModel[6].setRotationPoint(-1.24F, -8F, -4.5F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, -3F, 0F, -0.5F, -3F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 28
		bodyModel[7].setRotationPoint(-0.74F, -14F, -4.5F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 0, 25, 35, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -28F, 0F, 0F, -28F, 0F, -20F, 0F, 0F, -20F, 0F, 0F, -20F, -28F, 0F, -20F, -28F); // Box 34
		bodyModel[8].setRotationPoint(-0.75F, -12.75F, -3.5F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 0, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 10
		bodyModel[9].setRotationPoint(-0.75F, -14F, 1.5F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 0, 3, 3, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F); // Box 19
		bodyModel[10].setRotationPoint(-0.75F, -8F, 1.5F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 0, 3, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 20
		bodyModel[11].setRotationPoint(-0.75F, -8F, -4.5F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 0, 3, 3, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 21
		bodyModel[12].setRotationPoint(-0.75F, -14F, -4.5F);
	}
}