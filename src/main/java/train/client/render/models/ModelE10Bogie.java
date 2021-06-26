//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2018 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 21.02.2018 - 18:37:29
// Last changed on: 21.02.2018 - 18:37:29

package train.client.render.models; //Path where the model is located


import tmt.ModelConverter;
import tmt.ModelRendererTurbo;

public class ModelE10Bogie extends ModelConverter //Same as Filename
{
	int textureX = 256;
	int textureY = 32;

	public ModelE10Bogie() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[24];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 5
		bodyModel[1] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 15
		bodyModel[2] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 15
		bodyModel[3] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 13
		bodyModel[4] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 14
		bodyModel[5] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 24
		bodyModel[6] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 25
		bodyModel[7] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 26
		bodyModel[8] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 27
		bodyModel[9] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 28
		bodyModel[10] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 33
		bodyModel[11] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 34
		bodyModel[12] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 35
		bodyModel[13] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 36
		bodyModel[14] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 30
		bodyModel[15] = new ModelRendererTurbo(this, 121, 17, textureX, textureY); // Box 31
		bodyModel[16] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 32
		bodyModel[17] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 33
		bodyModel[18] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 34
		bodyModel[19] = new ModelRendererTurbo(this, 113, 9, textureX, textureY); // Box 35
		bodyModel[20] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Box 32
		bodyModel[21] = new ModelRendererTurbo(this, 161, 17, textureX, textureY); // Box 33
		bodyModel[22] = new ModelRendererTurbo(this, 177, 17, textureX, textureY); // Box 34
		bodyModel[23] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 32

		bodyModel[0].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		bodyModel[0].setRotationPoint(0F, 5F, -2F);

		bodyModel[1].addBox(0F, 0F, 0F, 9, 2, 14, 0F); // Box 15
		bodyModel[1].setRotationPoint(-2F, 1F, -1F);

		bodyModel[2].addShapeBox(-3.5F, -3.5F, 0F, 7, 7, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		bodyModel[2].setRotationPoint(11.5F, 3.5F, 11.98F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[3].setRotationPoint(5F, 5F, 14F);
		bodyModel[3].rotateAngleY = -3.14159265F;

		bodyModel[4].addShapeBox(0F, 0F, 0F, 10, 2, 14, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		bodyModel[4].setRotationPoint(-12F, 1F, -1F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		bodyModel[5].setRotationPoint(-12F, 3F, 0F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25
		bodyModel[6].setRotationPoint(16F, 3F, 0F);

		bodyModel[7].addBox(0F, 0F, 0F, 1, 1, 14, 0F); // Box 26
		bodyModel[7].setRotationPoint(11F, 3F, -1F);

		bodyModel[8].addBox(0F, 0F, 0F, 1, 1, 14, 0F); // Box 27
		bodyModel[8].setRotationPoint(-7F, 3F, -1F);

		bodyModel[9].addBox(0F, 0F, 0F, 3, 2, 2, 0F); // Box 28
		bodyModel[9].setRotationPoint(1F, -1F, 5F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
		bodyModel[10].setRotationPoint(10F, 3F, -1F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		bodyModel[11].setRotationPoint(-8F, 3F, -1F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 35
		bodyModel[12].setRotationPoint(-5F, 3F, 13F);
		bodyModel[12].rotateAngleY = -3.14159265F;

		bodyModel[13].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 36
		bodyModel[13].setRotationPoint(13F, 3F, 13F);
		bodyModel[13].rotateAngleY = -3.14159265F;

		bodyModel[14].addShapeBox(0F, 0F, 0F, 15, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 30
		bodyModel[14].setRotationPoint(-5F, 3F, 12F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 15, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 31
		bodyModel[15].setRotationPoint(-5F, 3F, -1F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 32
		bodyModel[16].setRotationPoint(13F, 3F, 12F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 33
		bodyModel[17].setRotationPoint(13F, 3F, -1F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 34
		bodyModel[18].setRotationPoint(-8F, 3F, 0F);
		bodyModel[18].rotateAngleY = -3.14159265F;

		bodyModel[19].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 35
		bodyModel[19].setRotationPoint(-8F, 3F, 13F);
		bodyModel[19].rotateAngleY = -3.14159265F;

		bodyModel[20].addShapeBox(-3.5F, -3.5F, 0F, 7, 7, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 32
		bodyModel[20].setRotationPoint(-6.5F, 3.5F, 11.98F);

		bodyModel[21].addShapeBox(-3.5F, -3.5F, 0F, 7, 7, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
		bodyModel[21].setRotationPoint(11.5F, 3.5F, 0.02F);

		bodyModel[22].addShapeBox(-3.5F, -3.5F, 0F, 7, 7, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		bodyModel[22].setRotationPoint(-6.5F, 3.5F, 0.02F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 10, 2, 14, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 32
		bodyModel[23].setRotationPoint(7F, 1F, -1F);
	}
}