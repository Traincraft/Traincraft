//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2018 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: Bamboo Train Engine
// Model Creator: Ondar
// Created on: 27.07.2018 - 12:18:35
// Last changed on: 27.07.2018 - 12:18:35

package train.client.render.models; //Path where the model is located


import tmt.ModelConverter;
import tmt.ModelRendererTurbo;

public class ModelBambooTrainEngine extends ModelConverter //Same as Filename
{
	int textureX = 256;
	int textureY = 256;

	public ModelBambooTrainEngine() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[58];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 1
		bodyModel[1] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 2
		bodyModel[2] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 3
		bodyModel[3] = new ModelRendererTurbo(this, 97, 9, textureX, textureY); // Box 4
		bodyModel[4] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 5
		bodyModel[5] = new ModelRendererTurbo(this, 97, 17, textureX, textureY); // Box 6
		bodyModel[6] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 7
		bodyModel[7] = new ModelRendererTurbo(this, 97, 25, textureX, textureY); // Box 8
		bodyModel[8] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 9
		bodyModel[9] = new ModelRendererTurbo(this, 97, 33, textureX, textureY); // Box 10
		bodyModel[10] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 16
		bodyModel[11] = new ModelRendererTurbo(this, 177, 33, textureX, textureY); // Box 17
		bodyModel[12] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 18
		bodyModel[13] = new ModelRendererTurbo(this, 97, 49, textureX, textureY); // Box 19
		bodyModel[14] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 20
		bodyModel[15] = new ModelRendererTurbo(this, 57, 57, textureX, textureY); // Box 21
		bodyModel[16] = new ModelRendererTurbo(this, 89, 65, textureX, textureY); // Box 22
		bodyModel[17] = new ModelRendererTurbo(this, 89, 73, textureX, textureY); // Box 23
		bodyModel[18] = new ModelRendererTurbo(this, 209, 33, textureX, textureY); // Box 24
		bodyModel[19] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 25
		bodyModel[20] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 26
		bodyModel[21] = new ModelRendererTurbo(this, 33, 57, textureX, textureY); // Box 27
		bodyModel[22] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 28
		bodyModel[23] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 29
		bodyModel[24] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 30
		bodyModel[25] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 31
		bodyModel[26] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 32
		bodyModel[27] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 33
		bodyModel[28] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 34
		bodyModel[29] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 35
		bodyModel[30] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 36
		bodyModel[31] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 37
		bodyModel[32] = new ModelRendererTurbo(this, 225, 57, textureX, textureY); // Box 38
		bodyModel[33] = new ModelRendererTurbo(this, 241, 9, textureX, textureY); // Box 39
		bodyModel[34] = new ModelRendererTurbo(this, 193, 17, textureX, textureY); // Box 40
		bodyModel[35] = new ModelRendererTurbo(this, 225, 17, textureX, textureY); // Box 41
		bodyModel[36] = new ModelRendererTurbo(this, 185, 65, textureX, textureY); // Box 42
		bodyModel[37] = new ModelRendererTurbo(this, 241, 17, textureX, textureY); // Box 43
		bodyModel[38] = new ModelRendererTurbo(this, 222, 24, textureX, textureY); // Box 41
		bodyModel[39] = new ModelRendererTurbo(this, 222, 24, textureX, textureY); // Box 42
		bodyModel[40] = new ModelRendererTurbo(this, 222, 24, textureX, textureY); // Box 43
		bodyModel[41] = new ModelRendererTurbo(this, 222, 24, textureX, textureY); // Box 44
		bodyModel[42] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 11
		bodyModel[43] = new ModelRendererTurbo(this, 81, 41, textureX, textureY); // Box 15
		bodyModel[44] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 41
		bodyModel[45] = new ModelRendererTurbo(this, 233, 33, textureX, textureY); // Box 42
		bodyModel[46] = new ModelRendererTurbo(this, 193, 9, textureX, textureY); // Box 43
		bodyModel[47] = new ModelRendererTurbo(this, 225, 9, textureX, textureY); // Box 44
		bodyModel[48] = new ModelRendererTurbo(this, 209, 9, textureX, textureY); // Box 45
		bodyModel[49] = new ModelRendererTurbo(this, 242, 2, textureX, textureY); // Box 46
		bodyModel[50] = new ModelRendererTurbo(this, 193, 33, textureX, textureY); // Box 48
		bodyModel[51] = new ModelRendererTurbo(this, 193, 33, textureX, textureY); // Box 49
		bodyModel[52] = new ModelRendererTurbo(this, 205, 22, textureX, textureY); // Box 55
		bodyModel[53] = new ModelRendererTurbo(this, 209, 17, textureX, textureY); // Box 47
		bodyModel[54] = new ModelRendererTurbo(this, 209, 17, textureX, textureY); // Box 49
		bodyModel[55] = new ModelRendererTurbo(this, 209, 14, textureX, textureY); // Box 50
		bodyModel[56] = new ModelRendererTurbo(this, 209, 14, textureX, textureY); // Box 51
		bodyModel[57] = new ModelRendererTurbo(this, 192, 39, textureX, textureY); // Box 60

		bodyModel[0].addShapeBox(0F, 0F, 0F, 46, 1, 1, 0F,0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[0].setRotationPoint(-23F, 1F, 11.5F);
		bodyModel[0].rotateAngleY = -0.01745329F;

		bodyModel[1].addShapeBox(0F, 0F, 0F, 46, 1, 1, 0F,0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[1].setRotationPoint(-23F, 1F, 9.7F);
		bodyModel[1].rotateAngleY = -0.03490659F;

		bodyModel[2].addShapeBox(0F, 0F, 0F, 46, 1, 1, 0F,0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		bodyModel[2].setRotationPoint(-23F, 1F, 6.9F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 46, 1, 1, 0F,0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[3].setRotationPoint(-23F, 1F, 4.3F);
		bodyModel[3].rotateAngleY = 0.01745329F;

		bodyModel[4].addShapeBox(0F, 0F, 0F, 46, 1, 1, 0F,0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		bodyModel[4].setRotationPoint(-23F, 1F, 3.1F);
		bodyModel[4].rotateAngleY = -0.00349066F;

		bodyModel[5].addShapeBox(0F, 0F, 0F, 46, 1, 1, 0F,0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[5].setRotationPoint(-23F, 1F, -3.8F);
		bodyModel[5].rotateAngleY = -0.02356194F;

		bodyModel[6].addShapeBox(0F, 0F, 0F, 46, 1, 1, 0F,0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 7
		bodyModel[6].setRotationPoint(-23F, 1F, -6.5F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 46, 1, 1, 0F,0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		bodyModel[7].setRotationPoint(-23F, 1F, -7.9F);
		bodyModel[7].rotateAngleY = -0.01308997F;

		bodyModel[8].addShapeBox(0F, 0F, 0F, 46, 1, 1, 0F,0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 9
		bodyModel[8].setRotationPoint(-23F, 1F, -9.5F);
		bodyModel[8].rotateAngleY = -0.00872665F;

		bodyModel[9].addShapeBox(0F, 0F, 2F, 46, 1, 1, 0F,0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 10
		bodyModel[9].setRotationPoint(-23F, 1F, -14.6F);
		bodyModel[9].rotateAngleY = 0.03054326F;

		bodyModel[10].addBox(0F, 0F, 0F, 1, 1, 26, 0F); // Box 16
		bodyModel[10].setRotationPoint(22F, 2F, -13F);

		bodyModel[11].addBox(0F, 0F, 0F, 1, 1, 26, 0F); // Box 17
		bodyModel[11].setRotationPoint(-23F, 2F, -13F);

		bodyModel[12].addBox(0F, 0F, 0F, 44, 1, 1, 0F); // Box 18
		bodyModel[12].setRotationPoint(-22F, 2F, 12F);

		bodyModel[13].addBox(0F, 0F, 0F, 44, 1, 1, 0F); // Box 19
		bodyModel[13].setRotationPoint(-22F, 2F, -13F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 1, 1, 26, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F); // Box 20
		bodyModel[14].setRotationPoint(-23F, 3F, -13F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 1, 1, 26, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F); // Box 21
		bodyModel[15].setRotationPoint(22F, 3F, -13F);

		bodyModel[16].addBox(0F, 0F, 0F, 49, 1, 1, 0F); // Box 22
		bodyModel[16].setRotationPoint(-24.5F, 3F, -5F);

		bodyModel[17].addBox(0F, 0F, 0F, 49, 1, 1, 0F); // Box 23
		bodyModel[17].setRotationPoint(-24.5F, 3F, 4F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 1, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F); // Box 24
		bodyModel[18].setRotationPoint(23F, -2F, -8F);

		bodyModel[19].addBox(0F, 0F, 0F, 1, 5, 1, 0F); // Box 25
		bodyModel[19].setRotationPoint(23F, -1F, -4F);

		bodyModel[20].addBox(0F, 0F, 0F, 1, 5, 1, 0F); // Box 26
		bodyModel[20].setRotationPoint(23F, -1F, 3F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 1, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F); // Box 27
		bodyModel[21].setRotationPoint(-24F, -2F, -8F);

		bodyModel[22].addBox(0F, 0F, 0F, 1, 5, 1, 0F); // Box 28
		bodyModel[22].setRotationPoint(-24F, -1F, 3F);

		bodyModel[23].addBox(0F, 0F, 0F, 1, 5, 1, 0F); // Box 29
		bodyModel[23].setRotationPoint(-24F, -1F, -4F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, 1F, 0F); // Box 30
		bodyModel[24].setRotationPoint(16F, 4F, 4F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -1F, 1F, 0F); // Box 31
		bodyModel[25].setRotationPoint(14F, 4F, 4F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -1F, 1F, 0F); // Box 32
		bodyModel[26].setRotationPoint(14F, 4F, -5F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, 1F, 0F); // Box 33
		bodyModel[27].setRotationPoint(16F, 4F, -5F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, 1F, 0F); // Box 34
		bodyModel[28].setRotationPoint(-15F, 4F, 4F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -1F, 1F, 0F); // Box 35
		bodyModel[29].setRotationPoint(-17F, 4F, 4F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, 1F, 0F); // Box 36
		bodyModel[30].setRotationPoint(-15F, 4F, -5F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -1F, 1F, 0F); // Box 37
		bodyModel[31].setRotationPoint(-17F, 4F, -5F);

		bodyModel[32].addBox(0F, 0F, 0F, 1, 1, 12, 0F); // Box 38
		bodyModel[32].setRotationPoint(-16F, 5F, -6F);

		bodyModel[33].addBox(0F, 0F, 0F, 5, 5, 0, 0F); // Box 39
		bodyModel[33].setRotationPoint(-18F, 3F, 6F);

		bodyModel[34].addBox(0F, 0F, 0F, 5, 5, 0, 0F); // Box 40
		bodyModel[34].setRotationPoint(-18F, 3F, -6F);

		bodyModel[35].addBox(0F, 0F, 0F, 5, 5, 0, 0F); // Box 41
		bodyModel[35].setRotationPoint(13F, 3F, -6F);

		bodyModel[36].addBox(0F, 0F, 0F, 1, 1, 12, 0F); // Box 42
		bodyModel[36].setRotationPoint(15F, 5F, -6F);

		bodyModel[37].addBox(0F, 0F, 0F, 5, 5, 0, 0F); // Box 43
		bodyModel[37].setRotationPoint(13F, 3F, 6F);

		bodyModel[38].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 41
		bodyModel[38].setRotationPoint(15F, 4F, 4F);

		bodyModel[39].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 42
		bodyModel[39].setRotationPoint(15F, 4F, -5F);

		bodyModel[40].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 43
		bodyModel[40].setRotationPoint(-16F, 4F, 4F);

		bodyModel[41].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 44
		bodyModel[41].setRotationPoint(-16F, 4F, -5F);

		bodyModel[42].addShapeBox(0F, 0F, -1F, 37, 1, 2, 0F,0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[42].setRotationPoint(-14F, 1F, -1.4F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 37, 1, 2, 0F,0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		bodyModel[43].setRotationPoint(-14F, 1F, 0.6F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F); // Box 41
		bodyModel[44].setRotationPoint(-14F, 1.38F, -4F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F); // Box 42
		bodyModel[45].setRotationPoint(-17.45F, 1.38F, -4F);

		bodyModel[46].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 43
		bodyModel[46].setRotationPoint(-16.7F, -0.64F, -1F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 44
		bodyModel[47].setRotationPoint(-16.7F, -1.64F, -1F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 45
		bodyModel[48].setRotationPoint(-16.2F, -2.64F, -0.5F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 46
		bodyModel[49].setRotationPoint(-16.2F, -3.14F, -0.5F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 0, 5, 1, 0F,-0.01F, 0F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0.16F, 0F, 0F, 0.16F, 0F, 0F, 0.16F, 0F, 0F, 0.16F, 0F); // Box 48
		bodyModel[50].setRotationPoint(-16.01F, 0.86F, -2F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 0, 5, 1, 0F,0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0.01F, 0F, 0F, 0F, 0.16F, 0F, 0F, 0.16F, 0F, 0F, 0.16F, 0F, 0F, 0.16F, 0F); // Box 49
		bodyModel[51].setRotationPoint(-14.99F, 0.86F, -2F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 55
		bodyModel[52].setRotationPoint(-16.2F, -2.64F, -0.5F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.125F, -0.125F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.125F, -0.125F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 47
		bodyModel[53].setRotationPoint(-16F, 0.36F, -2F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 49
		bodyModel[54].setRotationPoint(-16F, 0.36F, -2F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.5F, 0F, 0F); // Box 50
		bodyModel[55].setRotationPoint(-16F, 0.36F, -2F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, -0.125F, -0.125F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.125F, -0.125F, 0F); // Box 51
		bodyModel[56].setRotationPoint(-16F, 0.36F, -2F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 1, 0, 1, 0F,0.01F, 0F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, 0F); // Box 60
		bodyModel[57].setRotationPoint(-16F, 6.01F, -2F);
	}
}