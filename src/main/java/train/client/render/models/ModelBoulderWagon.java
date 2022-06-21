//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: Boulder Wagon Transport
// Model Creator: hariesh
// Created on: 25.08.2017 - 18:48:36
// Last changed on: 25.08.2017 - 18:48:36

package train.client.render.models; //Path where the model is located


import tmt.ModelConverter;
import tmt.ModelRendererTurbo;

public class ModelBoulderWagon extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelBoulderWagon() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[30];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 1
		bodyModel[2] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 2
		bodyModel[3] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 3
		bodyModel[4] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 4
		bodyModel[5] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 5
		bodyModel[6] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 6
		bodyModel[7] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 8
		bodyModel[8] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 9
		bodyModel[9] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 10
		bodyModel[10] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 11
		bodyModel[11] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 12
		bodyModel[12] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 13
		bodyModel[13] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 17
		bodyModel[14] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 18
		bodyModel[15] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 22
		bodyModel[16] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 23
		bodyModel[17] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 26
		bodyModel[18] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 27
		bodyModel[19] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 28
		bodyModel[20] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 29
		bodyModel[21] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 30
		bodyModel[22] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 31
		bodyModel[23] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 32
		bodyModel[24] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 33
		bodyModel[25] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 34
		bodyModel[26] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 35
		bodyModel[27] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 36
		bodyModel[28] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 37
		bodyModel[29] = new ModelRendererTurbo(this, 0, 16, textureX, textureY); // Box 52

		bodyModel[0].addBox(0F, 0F, 0F, 5, 5, 0, 0F); // Box 0
		bodyModel[0].setRotationPoint(-7F, 5F, -6F);

		bodyModel[1].addBox(0F, 0F, 0F, 5, 5, 0, 0F); // Box 1
		bodyModel[1].setRotationPoint(3F, 5F, -6F);

		bodyModel[2].addBox(0F, 0F, 0F, 5, 5, 0, 0F); // Box 2
		bodyModel[2].setRotationPoint(3F, 5F, 6F);

		bodyModel[3].addBox(0F, 0F, 0F, 5, 5, 0, 0F); // Box 3
		bodyModel[3].setRotationPoint(-7F, 5F, 6F);

		bodyModel[4].addBox(0F, 0F, 0F, 1, 1, 12, 0F); // Box 4
		bodyModel[4].setRotationPoint(-5F, 7F, -6F);

		bodyModel[5].addBox(0F, 0F, 0F, 1, 1, 12, 0F); // Box 5
		bodyModel[5].setRotationPoint(5F, 7F, -6F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 3, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 6
		bodyModel[6].setRotationPoint(4F, 4F, -7F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 3, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 8
		bodyModel[7].setRotationPoint(4F, 4F, 6F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 3, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 9
		bodyModel[8].setRotationPoint(-6F, 4F, 6F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 3, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 10
		bodyModel[9].setRotationPoint(-6F, 4F, -7F);

		bodyModel[10].addBox(0F, 0F, 0F, 21, 1, 14, 0F); // Box 11
		bodyModel[10].setRotationPoint(-10F, 3F, -7F);

		bodyModel[11].addBox(0F, 0F, 0F, 1, 5, 1, 0F); // Box 12
		bodyModel[11].setRotationPoint(-10F, -2F, -7F);

		bodyModel[12].addBox(0F, 0F, 0F, 1, 5, 1, 0F); // Box 13
		bodyModel[12].setRotationPoint(10F, -2F, -7F);

		bodyModel[13].addBox(0F, 0F, 0F, 1, 5, 1, 0F); // Box 17
		bodyModel[13].setRotationPoint(10F, -2F, 6F);

		bodyModel[14].addBox(0F, 0F, 0F, 1, 5, 1, 0F); // Box 18
		bodyModel[14].setRotationPoint(-10F, -2F, 6F);

		bodyModel[15].addBox(0F, 0F, 0F, 1, 1, 12, 0F); // Box 22
		bodyModel[15].setRotationPoint(-10F, 0F, -6F);

		bodyModel[16].addBox(0F, 0F, 0F, 1, 1, 12, 0F); // Box 23
		bodyModel[16].setRotationPoint(-10F, -2F, -6F);

		bodyModel[17].addBox(0F, 0F, 0F, 1, 1, 12, 0F); // Box 26
		bodyModel[17].setRotationPoint(10F, -2F, -6F);

		bodyModel[18].addBox(0F, 0F, 0F, 1, 1, 12, 0F); // Box 27
		bodyModel[18].setRotationPoint(10F, 0F, -6F);

		bodyModel[19].addBox(0F, 0F, 0F, 1, 3, 14, 0F); // Box 28
		bodyModel[19].setRotationPoint(-11F, 3F, -7F);

		bodyModel[20].addBox(0F, 0F, 0F, 1, 3, 14, 0F); // Box 29
		bodyModel[20].setRotationPoint(11F, 3F, -7F);

		bodyModel[21].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 30
		bodyModel[21].setRotationPoint(-12F, 4F, -6F);

		bodyModel[22].addBox(0F, 0F, 0F, 1, 3, 3, 0F); // Box 31
		bodyModel[22].setRotationPoint(-13F, 3F, -7F);

		bodyModel[23].addBox(0F, 0F, 0F, 1, 3, 3, 0F); // Box 32
		bodyModel[23].setRotationPoint(-13F, 3F, 4F);

		bodyModel[24].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 33
		bodyModel[24].setRotationPoint(-12F, 4F, 5F);

		bodyModel[25].addBox(0F, 0F, 0F, 1, 3, 3, 0F); // Box 34
		bodyModel[25].setRotationPoint(13F, 3F, 4F);

		bodyModel[26].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 35
		bodyModel[26].setRotationPoint(12F, 4F, 5F);

		bodyModel[27].addBox(0F, 0F, 0F, 1, 3, 3, 0F); // Box 36
		bodyModel[27].setRotationPoint(13F, 3F, -7F);

		bodyModel[28].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 37
		bodyModel[28].setRotationPoint(12F, 4F, -6F);

		bodyModel[29].addBox(0F, 0F, 0F, 16, 16, 16, 0F); // Box 52
		bodyModel[29].setRotationPoint(-7F, -13F, -8F);
	}
}