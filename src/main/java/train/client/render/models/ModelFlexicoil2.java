//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 20.06.2020 - 23:34:54
// Last changed on: 20.06.2020 - 23:34:54

package train.client.render.models; //Path where the model is located


import tmt.ModelConverter;
import tmt.ModelRendererTurbo;

public class ModelFlexicoil2 extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelFlexicoil2() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[69];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 4
		bodyModel[1] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 5
		bodyModel[2] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 30
		bodyModel[3] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 46
		bodyModel[4] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 47
		bodyModel[5] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 48
		bodyModel[6] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 104
		bodyModel[7] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 110
		bodyModel[8] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 339
		bodyModel[9] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 340
		bodyModel[10] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 10
		bodyModel[11] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 347
		bodyModel[12] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 350
		bodyModel[13] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 13
		bodyModel[14] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 14
		bodyModel[15] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 15
		bodyModel[16] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 16
		bodyModel[17] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 17
		bodyModel[18] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 177
		bodyModel[19] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 178
		bodyModel[20] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 20
		bodyModel[21] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 93
		bodyModel[22] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 22
		bodyModel[23] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 23
		bodyModel[24] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 24
		bodyModel[25] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 27
		bodyModel[26] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 29
		bodyModel[27] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 30
		bodyModel[28] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 31
		bodyModel[29] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 51
		bodyModel[30] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 52
		bodyModel[31] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 53
		bodyModel[32] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 38
		bodyModel[33] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 39
		bodyModel[34] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 40
		bodyModel[35] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 41
		bodyModel[36] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 42
		bodyModel[37] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 43
		bodyModel[38] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 44
		bodyModel[39] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 45
		bodyModel[40] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 46
		bodyModel[41] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 47
		bodyModel[42] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 48
		bodyModel[43] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 49
		bodyModel[44] = new ModelRendererTurbo(this, 9, 9, textureX, textureY); // Box 50
		bodyModel[45] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 51
		bodyModel[46] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 52
		bodyModel[47] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Box 53
		bodyModel[48] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 54
		bodyModel[49] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Box 55
		bodyModel[50] = new ModelRendererTurbo(this, 73, 9, textureX, textureY); // Box 56
		bodyModel[51] = new ModelRendererTurbo(this, 81, 9, textureX, textureY); // Box 57
		bodyModel[52] = new ModelRendererTurbo(this, 89, 9, textureX, textureY); // Box 58
		bodyModel[53] = new ModelRendererTurbo(this, 113, 9, textureX, textureY); // Box 59
		bodyModel[54] = new ModelRendererTurbo(this, 121, 9, textureX, textureY); // Box 60
		bodyModel[55] = new ModelRendererTurbo(this, 129, 9, textureX, textureY); // Box 61
		bodyModel[56] = new ModelRendererTurbo(this, 153, 9, textureX, textureY); // Box 62
		bodyModel[57] = new ModelRendererTurbo(this, 161, 9, textureX, textureY); // Box 63
		bodyModel[58] = new ModelRendererTurbo(this, 177, 9, textureX, textureY); // Box 64
		bodyModel[59] = new ModelRendererTurbo(this, 185, 9, textureX, textureY); // Box 65
		bodyModel[60] = new ModelRendererTurbo(this, 193, 9, textureX, textureY); // Box 66
		bodyModel[61] = new ModelRendererTurbo(this, 201, 9, textureX, textureY); // Box 67
		bodyModel[62] = new ModelRendererTurbo(this, 209, 9, textureX, textureY); // Box 68
		bodyModel[63] = new ModelRendererTurbo(this, 217, 9, textureX, textureY); // Box 69
		bodyModel[64] = new ModelRendererTurbo(this, 265, 9, textureX, textureY); // Box 71
		bodyModel[65] = new ModelRendererTurbo(this, 305, 9, textureX, textureY); // Box 72
		bodyModel[66] = new ModelRendererTurbo(this, 377, 9, textureX, textureY); // Box 74
		bodyModel[67] = new ModelRendererTurbo(this, 297, 9, textureX, textureY); // Box 153
		bodyModel[68] = new ModelRendererTurbo(this, 305, 9, textureX, textureY); // Box 154

		bodyModel[0].addBox(0F, 0F, 0F, 2, 2, 18, 0F); // Box 4
		bodyModel[0].setRotationPoint(-8F, 0.5F, -9F);

		bodyModel[1].addBox(0F, 0F, 0F, 2, 2, 18, 0F); // Box 5
		bodyModel[1].setRotationPoint(6F, 0.5F, -9F);

		bodyModel[2].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 30
		bodyModel[2].setRotationPoint(7F, 1.5F, 6F);

		bodyModel[3].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 46
		bodyModel[3].setRotationPoint(-7F, 1.5F, 6F);

		bodyModel[4].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 47
		bodyModel[4].setRotationPoint(-7F, 1.5F, -6F);

		bodyModel[5].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 48
		bodyModel[5].setRotationPoint(7F, 1.5F, -6F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 104
		bodyModel[6].setRotationPoint(-8F, 0.5F, -9.5F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 110
		bodyModel[7].setRotationPoint(6F, 0.5F, -9.5F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 339
		bodyModel[8].setRotationPoint(6F, 0.5F, 8.5F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 340
		bodyModel[9].setRotationPoint(-8F, 0.5F, 8.5F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 12, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 10
		bodyModel[10].setRotationPoint(-6F, -2F, -8.5F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 347
		bodyModel[11].setRotationPoint(-6F, 0F, -8.25F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 350
		bodyModel[12].setRotationPoint(-10F, 0F, -8.25F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[13].setRotationPoint(8F, 0F, -8.25F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 14
		bodyModel[14].setRotationPoint(4F, 0F, -8.25F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 15
		bodyModel[15].setRotationPoint(-6F, 0F, -8.5F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 16
		bodyModel[16].setRotationPoint(3F, 0F, -8.5F);

		bodyModel[17].addBox(0F, 0F, 0F, 6, 2, 1, 0F); // Box 17
		bodyModel[17].setRotationPoint(-3F, 0F, -8.5F);

		bodyModel[18].addBox(0F, 0F, 0F, 9, 0, 1, 0F); // Box 177
		bodyModel[18].setRotationPoint(-11.5F, 3.01F, -8.25F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 178
		bodyModel[19].setRotationPoint(-11F, 0.01F, -8.25F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 20
		bodyModel[20].setRotationPoint(-2F, 1.5F, -8F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F); // Box 93
		bodyModel[21].setRotationPoint(-8F, -2F, -8F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		bodyModel[22].setRotationPoint(-10F, -2F, -8F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 23
		bodyModel[23].setRotationPoint(8F, -2F, -8F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F); // Box 24
		bodyModel[24].setRotationPoint(6F, -2F, -8.5F);

		bodyModel[25].addBox(0F, 0F, 0F, 9, 0, 1, 0F); // Box 27
		bodyModel[25].setRotationPoint(2.5F, 3.01F, -8.25F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 29
		bodyModel[26].setRotationPoint(-11F, -1.5F, -8F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 30
		bodyModel[27].setRotationPoint(11F, 0.01F, -8.25F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 31
		bodyModel[28].setRotationPoint(10F, -1.5F, -8F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F); // Box 51
		bodyModel[29].setRotationPoint(-10F, -2F, -9.5F);

		bodyModel[30].addBox(0F, 0F, 0F, 2, 0, 1, 0F); // Box 52
		bodyModel[30].setRotationPoint(-8F, -1.1F, -9.5F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 3, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 0F); // Box 53
		bodyModel[31].setRotationPoint(-6F, -1.1F, -9.5F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F); // Box 38
		bodyModel[32].setRotationPoint(8F, -2F, -9.5F);

		bodyModel[33].addBox(0F, 0F, 0F, 2, 0, 1, 0F); // Box 39
		bodyModel[33].setRotationPoint(6F, -1.1F, -9.5F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 3, 0, 1, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F); // Box 40
		bodyModel[34].setRotationPoint(3F, -1.1F, -9.5F);

		bodyModel[35].addBox(0F, 0F, 0F, 0, 2, 1, 0F); // Box 41
		bodyModel[35].setRotationPoint(-3F, 1F, -8.25F);

		bodyModel[36].addBox(0F, 0F, 0F, 0, 2, 1, 0F); // Box 42
		bodyModel[36].setRotationPoint(3F, 1F, -8.25F);

		bodyModel[37].addBox(0F, 0F, 0F, 6, 2, 1, 0F); // Box 43
		bodyModel[37].setRotationPoint(-3F, 0F, 7.5F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 44
		bodyModel[38].setRotationPoint(3F, 0F, 7.5F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 45
		bodyModel[39].setRotationPoint(-6F, 0F, 7.5F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 12, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 46
		bodyModel[40].setRotationPoint(-6F, -2F, 7.5F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F); // Box 47
		bodyModel[41].setRotationPoint(6F, -2F, 7.5F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 48
		bodyModel[42].setRotationPoint(10F, -1.5F, 7F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F); // Box 49
		bodyModel[43].setRotationPoint(-8F, -2F, 7F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 50
		bodyModel[44].setRotationPoint(-10F, -2F, 7F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 51
		bodyModel[45].setRotationPoint(-11F, -1.5F, 7F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 52
		bodyModel[46].setRotationPoint(8F, -2F, 7F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 53
		bodyModel[47].setRotationPoint(-10F, 0F, 7.25F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 54
		bodyModel[48].setRotationPoint(-6F, 0F, 7.25F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 55
		bodyModel[49].setRotationPoint(4F, 0F, 7.25F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 56
		bodyModel[50].setRotationPoint(8F, 0F, 7.25F);

		bodyModel[51].addBox(0F, 0F, 0F, 0, 2, 1, 0F); // Box 57
		bodyModel[51].setRotationPoint(3F, 1F, 7.25F);

		bodyModel[52].addBox(0F, 0F, 0F, 9, 0, 1, 0F); // Box 58
		bodyModel[52].setRotationPoint(2.5F, 3.01F, 7.25F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 59
		bodyModel[53].setRotationPoint(11F, 0.01F, 7.25F);

		bodyModel[54].addBox(0F, 0F, 0F, 0, 2, 1, 0F); // Box 60
		bodyModel[54].setRotationPoint(-3F, 1F, 7.25F);

		bodyModel[55].addBox(0F, 0F, 0F, 9, 0, 1, 0F); // Box 61
		bodyModel[55].setRotationPoint(-11.5F, 3.01F, 7.25F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 62
		bodyModel[56].setRotationPoint(-11F, 0.01F, 7.25F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 63
		bodyModel[57].setRotationPoint(-2F, 1.5F, 7F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 3, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 64
		bodyModel[58].setRotationPoint(-6F, -1.1F, 8.5F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 65
		bodyModel[59].setRotationPoint(8F, -2F, 8.5F);

		bodyModel[60].addBox(0F, 0F, 0F, 2, 0, 1, 0F); // Box 66
		bodyModel[60].setRotationPoint(6F, -1.1F, 8.5F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 3, 0, 1, 0F,0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 67
		bodyModel[61].setRotationPoint(3F, -1.1F, 8.5F);

		bodyModel[62].addBox(0F, 0F, 0F, 2, 0, 1, 0F); // Box 68
		bodyModel[62].setRotationPoint(-8F, -1.1F, 8.5F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 69
		bodyModel[63].setRotationPoint(-10F, -2F, 8.5F);

		bodyModel[64].addBox(0F, 0F, 0F, 7, 4, 11, 0F); // Box 71
		bodyModel[64].setRotationPoint(-10F, -1F, -5.5F);

		bodyModel[65].addBox(0F, 0F, 0F, 7, 4, 11, 0F); // Box 72
		bodyModel[65].setRotationPoint(3F, -1F, -5.5F);

		bodyModel[66].addBox(0F, 0F, 0F, 6, 4, 14, 0F); // Box 74
		bodyModel[66].setRotationPoint(-3F, -1F, -7F);

		bodyModel[67].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 153
		bodyModel[67].setRotationPoint(-3F, -1.5F, -1F);

		bodyModel[68].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 154
		bodyModel[68].setRotationPoint(2F, -1.5F, -1F);
	}
}