//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2023 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 10.09.2022 - 08:37:04
// Last changed on: 10.09.2022 - 08:37:04

package train.client.render.models; //Path where the model is located


import fexcraft.tmt.slim.ModelConverter;
import fexcraft.tmt.slim.ModelRendererTurbo;

public class ModelBR1_Tender extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelBR1_Tender() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[143];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 0
		bodyModel[2] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 2
		bodyModel[3] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 0
		bodyModel[4] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 0
		bodyModel[5] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 2
		bodyModel[6] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 0
		bodyModel[7] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 0
		bodyModel[8] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 2
		bodyModel[9] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 9
		bodyModel[10] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 9
		bodyModel[11] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 9
		bodyModel[12] = new ModelRendererTurbo(this, 345, 9, textureX, textureY); // Box 9
		bodyModel[13] = new ModelRendererTurbo(this, 377, 9, textureX, textureY); // Box 9
		bodyModel[14] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 9
		bodyModel[15] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 9
		bodyModel[16] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 9
		bodyModel[17] = new ModelRendererTurbo(this, 337, 17, textureX, textureY); // Box 9
		bodyModel[18] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 2
		bodyModel[19] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 2
		bodyModel[20] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 2
		bodyModel[21] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 9
		bodyModel[22] = new ModelRendererTurbo(this, 457, 9, textureX, textureY); // Box 9
		bodyModel[23] = new ModelRendererTurbo(this, 481, 9, textureX, textureY); // Box 9
		bodyModel[24] = new ModelRendererTurbo(this, 449, 17, textureX, textureY); // Box 9
		bodyModel[25] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Box 9
		bodyModel[26] = new ModelRendererTurbo(this, 481, 17, textureX, textureY); // Box 9
		bodyModel[27] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 9
		bodyModel[28] = new ModelRendererTurbo(this, 81, 9, textureX, textureY); // Box 9
		bodyModel[29] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 2
		bodyModel[30] = new ModelRendererTurbo(this, 105, 9, textureX, textureY); // Box 2
		bodyModel[31] = new ModelRendererTurbo(this, 113, 9, textureX, textureY); // Box 2
		bodyModel[32] = new ModelRendererTurbo(this, 201, 9, textureX, textureY); // Box 9
		bodyModel[33] = new ModelRendererTurbo(this, 153, 25, textureX, textureY); // Box 33
		bodyModel[34] = new ModelRendererTurbo(this, 209, 9, textureX, textureY); // Box 9
		bodyModel[35] = new ModelRendererTurbo(this, 225, 9, textureX, textureY); // Box 35
		bodyModel[36] = new ModelRendererTurbo(this, 321, 9, textureX, textureY); // Box 35
		bodyModel[37] = new ModelRendererTurbo(this, 177, 25, textureX, textureY); // Box 35
		bodyModel[38] = new ModelRendererTurbo(this, 193, 25, textureX, textureY); // Box 35
		bodyModel[39] = new ModelRendererTurbo(this, 209, 25, textureX, textureY); // Box 35
		bodyModel[40] = new ModelRendererTurbo(this, 225, 25, textureX, textureY); // Box 35
		bodyModel[41] = new ModelRendererTurbo(this, 241, 25, textureX, textureY); // Box 41
		bodyModel[42] = new ModelRendererTurbo(this, 505, 17, textureX, textureY); // Box 41
		bodyModel[43] = new ModelRendererTurbo(this, 265, 25, textureX, textureY); // Box 41
		bodyModel[44] = new ModelRendererTurbo(this, 273, 25, textureX, textureY); // Box 41
		bodyModel[45] = new ModelRendererTurbo(this, 297, 25, textureX, textureY); // Box 41
		bodyModel[46] = new ModelRendererTurbo(this, 305, 25, textureX, textureY); // Box 41
		bodyModel[47] = new ModelRendererTurbo(this, 313, 25, textureX, textureY); // Box 41
		bodyModel[48] = new ModelRendererTurbo(this, 337, 25, textureX, textureY); // Box 41
		bodyModel[49] = new ModelRendererTurbo(this, 345, 25, textureX, textureY); // Box 41
		bodyModel[50] = new ModelRendererTurbo(this, 449, 25, textureX, textureY); // Box 35
		bodyModel[51] = new ModelRendererTurbo(this, 465, 25, textureX, textureY); // Box 35
		bodyModel[52] = new ModelRendererTurbo(this, 481, 25, textureX, textureY); // Box 35
		bodyModel[53] = new ModelRendererTurbo(this, 497, 25, textureX, textureY); // Box 35
		bodyModel[54] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 35
		bodyModel[55] = new ModelRendererTurbo(this, 17, 33, textureX, textureY); // Box 35
		bodyModel[56] = new ModelRendererTurbo(this, 33, 33, textureX, textureY); // Box 41
		bodyModel[57] = new ModelRendererTurbo(this, 57, 33, textureX, textureY); // Box 41
		bodyModel[58] = new ModelRendererTurbo(this, 65, 33, textureX, textureY); // Box 41
		bodyModel[59] = new ModelRendererTurbo(this, 73, 33, textureX, textureY); // Box 41
		bodyModel[60] = new ModelRendererTurbo(this, 97, 33, textureX, textureY); // Box 41
		bodyModel[61] = new ModelRendererTurbo(this, 105, 33, textureX, textureY); // Box 41
		bodyModel[62] = new ModelRendererTurbo(this, 113, 33, textureX, textureY); // Box 41
		bodyModel[63] = new ModelRendererTurbo(this, 137, 33, textureX, textureY); // Box 41
		bodyModel[64] = new ModelRendererTurbo(this, 145, 33, textureX, textureY); // Box 41
		bodyModel[65] = new ModelRendererTurbo(this, 193, 41, textureX, textureY); // Box 67
		bodyModel[66] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 67
		bodyModel[67] = new ModelRendererTurbo(this, 177, 33, textureX, textureY); // Box 67
		bodyModel[68] = new ModelRendererTurbo(this, 361, 41, textureX, textureY); // Box 70
		bodyModel[69] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 67
		bodyModel[70] = new ModelRendererTurbo(this, 449, 33, textureX, textureY); // Box 72
		bodyModel[71] = new ModelRendererTurbo(this, 409, 49, textureX, textureY); // Box 70
		bodyModel[72] = new ModelRendererTurbo(this, 265, 33, textureX, textureY); // Box 74
		bodyModel[73] = new ModelRendererTurbo(this, 89, 41, textureX, textureY); // Box 74
		bodyModel[74] = new ModelRendererTurbo(this, 473, 33, textureX, textureY); // Box 70
		bodyModel[75] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 70
		bodyModel[76] = new ModelRendererTurbo(this, 169, 57, textureX, textureY); // Box 70
		bodyModel[77] = new ModelRendererTurbo(this, 345, 65, textureX, textureY); // Box 70
		bodyModel[78] = new ModelRendererTurbo(this, 481, 57, textureX, textureY); // Box 70
		bodyModel[79] = new ModelRendererTurbo(this, 369, 65, textureX, textureY); // Box 67
		bodyModel[80] = new ModelRendererTurbo(this, 425, 57, textureX, textureY); // Box 72
		bodyModel[81] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 72
		bodyModel[82] = new ModelRendererTurbo(this, 153, 33, textureX, textureY); // Box 67
		bodyModel[83] = new ModelRendererTurbo(this, 113, 17, textureX, textureY); // Box 67
		bodyModel[84] = new ModelRendererTurbo(this, 161, 33, textureX, textureY); // Box 67
		bodyModel[85] = new ModelRendererTurbo(this, 321, 33, textureX, textureY); // Box 67
		bodyModel[86] = new ModelRendererTurbo(this, 153, 17, textureX, textureY); // Box 67
		bodyModel[87] = new ModelRendererTurbo(this, 329, 33, textureX, textureY); // Box 67
		bodyModel[88] = new ModelRendererTurbo(this, 337, 33, textureX, textureY); // Box 93
		bodyModel[89] = new ModelRendererTurbo(this, 345, 33, textureX, textureY); // Box 93
		bodyModel[90] = new ModelRendererTurbo(this, 193, 17, textureX, textureY); // Box 93
		bodyModel[91] = new ModelRendererTurbo(this, 449, 33, textureX, textureY); // Box 93
		bodyModel[92] = new ModelRendererTurbo(this, 457, 33, textureX, textureY); // Box 93
		bodyModel[93] = new ModelRendererTurbo(this, 233, 17, textureX, textureY); // Box 93
		bodyModel[94] = new ModelRendererTurbo(this, 473, 33, textureX, textureY); // Box 99
		bodyModel[95] = new ModelRendererTurbo(this, 497, 33, textureX, textureY); // Box 99
		bodyModel[96] = new ModelRendererTurbo(this, 361, 41, textureX, textureY); // Box 99
		bodyModel[97] = new ModelRendererTurbo(this, 409, 41, textureX, textureY); // Box 99
		bodyModel[98] = new ModelRendererTurbo(this, 425, 41, textureX, textureY); // Box 99
		bodyModel[99] = new ModelRendererTurbo(this, 441, 41, textureX, textureY); // Box 99
		bodyModel[100] = new ModelRendererTurbo(this, 273, 17, textureX, textureY); // Box 99
		bodyModel[101] = new ModelRendererTurbo(this, 313, 17, textureX, textureY); // Box 99
		bodyModel[102] = new ModelRendererTurbo(this, 497, 17, textureX, textureY); // Box 99
		bodyModel[103] = new ModelRendererTurbo(this, 145, 41, textureX, textureY); // Box 115
		bodyModel[104] = new ModelRendererTurbo(this, 473, 33, textureX, textureY); // Box 115
		bodyModel[105] = new ModelRendererTurbo(this, 457, 41, textureX, textureY); // Box 110
		bodyModel[106] = new ModelRendererTurbo(this, 473, 41, textureX, textureY); // Box 110
		bodyModel[107] = new ModelRendererTurbo(this, 481, 41, textureX, textureY); // Box 110
		bodyModel[108] = new ModelRendererTurbo(this, 497, 41, textureX, textureY); // Box 110
		bodyModel[109] = new ModelRendererTurbo(this, 505, 41, textureX, textureY); // Box 110
		bodyModel[110] = new ModelRendererTurbo(this, 169, 49, textureX, textureY); // Box 110
		bodyModel[111] = new ModelRendererTurbo(this, 177, 49, textureX, textureY); // Box 110
		bodyModel[112] = new ModelRendererTurbo(this, 185, 49, textureX, textureY); // Box 110
		bodyModel[113] = new ModelRendererTurbo(this, 361, 49, textureX, textureY); // Box 110
		bodyModel[114] = new ModelRendererTurbo(this, 369, 49, textureX, textureY); // Box 110
		bodyModel[115] = new ModelRendererTurbo(this, 409, 49, textureX, textureY); // Box 110
		bodyModel[116] = new ModelRendererTurbo(this, 417, 49, textureX, textureY); // Box 110
		bodyModel[117] = new ModelRendererTurbo(this, 369, 65, textureX, textureY); // Box 123
		bodyModel[118] = new ModelRendererTurbo(this, 433, 49, textureX, textureY); // Box 123
		bodyModel[119] = new ModelRendererTurbo(this, 441, 49, textureX, textureY); // Box 123
		bodyModel[120] = new ModelRendererTurbo(this, 193, 73, textureX, textureY); // Box 33
		bodyModel[121] = new ModelRendererTurbo(this, 233, 73, textureX, textureY); // Box 123
		bodyModel[122] = new ModelRendererTurbo(this, 449, 49, textureX, textureY); // Box 128
		bodyModel[123] = new ModelRendererTurbo(this, 401, 65, textureX, textureY); // Box 72
		bodyModel[124] = new ModelRendererTurbo(this, 249, 73, textureX, textureY); // Box 72
		bodyModel[125] = new ModelRendererTurbo(this, 169, 57, textureX, textureY); // Box 72
		bodyModel[126] = new ModelRendererTurbo(this, 177, 57, textureX, textureY); // Box 72
		bodyModel[127] = new ModelRendererTurbo(this, 433, 57, textureX, textureY); // Box 72
		bodyModel[128] = new ModelRendererTurbo(this, 505, 57, textureX, textureY); // Box 72
		bodyModel[129] = new ModelRendererTurbo(this, 169, 65, textureX, textureY); // Box 72
		bodyModel[130] = new ModelRendererTurbo(this, 497, 33, textureX, textureY); // Box 72
		bodyModel[131] = new ModelRendererTurbo(this, 361, 41, textureX, textureY); // Box 72
		bodyModel[132] = new ModelRendererTurbo(this, 177, 65, textureX, textureY); // Box 72
		bodyModel[133] = new ModelRendererTurbo(this, 505, 65, textureX, textureY); // Box 72
		bodyModel[134] = new ModelRendererTurbo(this, 217, 73, textureX, textureY); // Box 72
		bodyModel[135] = new ModelRendererTurbo(this, 225, 73, textureX, textureY); // Box 72
		bodyModel[136] = new ModelRendererTurbo(this, 257, 73, textureX, textureY); // Box 72
		bodyModel[137] = new ModelRendererTurbo(this, 265, 73, textureX, textureY); // Box 72
		bodyModel[138] = new ModelRendererTurbo(this, 273, 73, textureX, textureY); // Box 146
		bodyModel[139] = new ModelRendererTurbo(this, 289, 73, textureX, textureY); // Box 146
		bodyModel[140] = new ModelRendererTurbo(this, 409, 41, textureX, textureY); // Box 72
		bodyModel[141] = new ModelRendererTurbo(this, 425, 41, textureX, textureY); // Box 72
		bodyModel[142] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 150

		bodyModel[0].addShapeBox(0F, 0F, 0F, 17, 17, 0, 0F,0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, -10F, -10F, 0F, -10F, -10F, 0F, 0F, -10F, 0F); // Box 0
		bodyModel[0].setRotationPoint(-17F, 0F, -6F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 17, 17, 0, 0F,0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, -10F, -10F, 0F, -10F, -10F, 0F, 0F, -10F, 0F); // Box 0
		bodyModel[1].setRotationPoint(-17F, 0F, 6F);

		bodyModel[2].addBox(0F, 0F, 0F, 1, 1, 16, 0F); // Box 2
		bodyModel[2].setRotationPoint(-14F, 3F, -8F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 17, 17, 0, 0F,0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, -10F, -10F, 0F, -10F, -10F, 0F, 0F, -10F, 0F); // Box 0
		bodyModel[3].setRotationPoint(-3F, 0F, -6F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 17, 17, 0, 0F,0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, -10F, -10F, 0F, -10F, -10F, 0F, 0F, -10F, 0F); // Box 0
		bodyModel[4].setRotationPoint(-3F, 0F, 6F);

		bodyModel[5].addBox(0F, 0F, 0F, 1, 1, 16, 0F); // Box 2
		bodyModel[5].setRotationPoint(0F, 3F, -8F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 17, 17, 0, 0F,0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, -10F, -10F, 0F, -10F, -10F, 0F, 0F, -10F, 0F); // Box 0
		bodyModel[6].setRotationPoint(11F, 0F, -6F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 17, 17, 0, 0F,0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, -10F, -10F, 0F, -10F, -10F, 0F, 0F, -10F, 0F); // Box 0
		bodyModel[7].setRotationPoint(11F, 0F, 6F);

		bodyModel[8].addBox(0F, 0F, 0F, 1, 1, 16, 0F); // Box 2
		bodyModel[8].setRotationPoint(14F, 3F, -8F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 40, 3, 1, 0F,0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 9
		bodyModel[9].setRotationPoint(-18F, -1F, -8F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 10, 3, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 9
		bodyModel[10].setRotationPoint(-18F, 1F, -8F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 11, 3, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -0.5F, -3F, 0F, -0.5F); // Box 9
		bodyModel[11].setRotationPoint(-5F, 1F, -8F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 11, 3, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -3F, 0F, -0.5F); // Box 9
		bodyModel[12].setRotationPoint(9F, 1F, -8F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 38, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F); // Box 9
		bodyModel[13].setRotationPoint(-18F, 4F, -8F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 9
		bodyModel[14].setRotationPoint(-3F, 3F, -8F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 9
		bodyModel[15].setRotationPoint(11F, 3F, -8F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 9
		bodyModel[16].setRotationPoint(-13F, 3F, -8F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 44, 1, 20, 0F,0F, 0F, -0.5F, -0.6F, 0F, -0.5F, -0.6F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.8F, -0.5F, -0.6F, -0.8F, -0.5F, -0.6F, -0.8F, -0.5F, 0F, -0.8F, -0.5F); // Box 9
		bodyModel[17].setRotationPoint(-21F, -1F, -10F);

		bodyModel[18].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 2
		bodyModel[18].setRotationPoint(-14.5F, 2.5F, -9F);

		bodyModel[19].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 2
		bodyModel[19].setRotationPoint(-0.5F, 2.5F, -9F);

		bodyModel[20].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 2
		bodyModel[20].setRotationPoint(13.5F, 2.5F, -9F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 40, 3, 1, 0F,0F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.2F, -0.5F, -0.5F, -0.2F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 9
		bodyModel[21].setRotationPoint(-18F, -1F, 7F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 10, 3, 1, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, -3F, 0F, -0.5F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 9
		bodyModel[22].setRotationPoint(-18F, 1F, 7F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 11, 3, 1, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -3F, 0F, -0.5F, -3F, 0F, -0.5F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 9
		bodyModel[23].setRotationPoint(-5F, 1F, 7F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 11, 3, 1, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -3F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 9
		bodyModel[24].setRotationPoint(9F, 1F, 7F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 38, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 9
		bodyModel[25].setRotationPoint(-18F, 4F, 7F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,-0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 9
		bodyModel[26].setRotationPoint(-3F, 3F, 7F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 9
		bodyModel[27].setRotationPoint(11F, 3F, 7F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 9
		bodyModel[28].setRotationPoint(-13F, 3F, 7F);

		bodyModel[29].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 2
		bodyModel[29].setRotationPoint(-14.5F, 2.5F, 8F);

		bodyModel[30].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 2
		bodyModel[30].setRotationPoint(-0.5F, 2.5F, 8F);

		bodyModel[31].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 2
		bodyModel[31].setRotationPoint(13.5F, 2.5F, 8F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -2F, -0.5F); // Box 9
		bodyModel[32].setRotationPoint(-20F, -1F, -8F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 1, 3, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 33
		bodyModel[33].setRotationPoint(-21F, -1F, -8F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 9
		bodyModel[34].setRotationPoint(-20F, -1F, 7F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,-1.5F, -0.5F, -0.05F, -1.5F, -0.5F, -0.05F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1.5F, -0.2F, -0.05F, -1.5F, -0.2F, -0.05F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 35
		bodyModel[35].setRotationPoint(-16F, 2F, -9F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,-1.5F, -0.2F, -0.05F, -1.5F, -0.2F, -0.05F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -1.5F, -0.5F, -0.05F, -1.5F, -0.5F, -0.05F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 35
		bodyModel[36].setRotationPoint(-16F, 4F, -9F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,-1.5F, -0.5F, -0.05F, -1.5F, -0.5F, -0.05F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1.5F, -0.2F, -0.05F, -1.5F, -0.2F, -0.05F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 35
		bodyModel[37].setRotationPoint(-2F, 2F, -9F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,-1.5F, -0.2F, -0.05F, -1.5F, -0.2F, -0.05F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -1.5F, -0.5F, -0.05F, -1.5F, -0.5F, -0.05F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 35
		bodyModel[38].setRotationPoint(-2F, 4F, -9F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,-1.5F, -0.5F, -0.05F, -1.5F, -0.5F, -0.05F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1.5F, -0.2F, -0.05F, -1.5F, -0.2F, -0.05F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 35
		bodyModel[39].setRotationPoint(12F, 2F, -9F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,-1.5F, -0.2F, -0.05F, -1.5F, -0.2F, -0.05F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -1.5F, -0.5F, -0.05F, -1.5F, -0.5F, -0.05F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 35
		bodyModel[40].setRotationPoint(12F, 4F, -9F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 7, 2, 1, 0F,0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -3.2F, 0.5F, -0.4F, -3.2F, 0.5F, -0.4F, -3.2F, 0.5F, 0F, -3.2F, 0.5F, 0F); // Box 41
		bodyModel[41].setRotationPoint(-17F, 0F, -9F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.1F, -0.3F, -0.5F, -0.1F, -0.3F, -0.5F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.3F, -0.3F, -0.5F, -0.3F, -0.3F, -0.5F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 41
		bodyModel[42].setRotationPoint(-17F, 0F, -9F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, 0F, -0.5F, -0.3F, 0F); // Box 41
		bodyModel[43].setRotationPoint(-11F, 0F, -9F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 7, 2, 1, 0F,0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -3.2F, 0.5F, -0.4F, -3.2F, 0.5F, -0.4F, -3.2F, 0.5F, 0F, -3.2F, 0.5F, 0F); // Box 41
		bodyModel[44].setRotationPoint(-3F, 0F, -9F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.1F, -0.3F, -0.5F, -0.1F, -0.3F, -0.5F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.3F, -0.3F, -0.5F, -0.3F, -0.3F, -0.5F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 41
		bodyModel[45].setRotationPoint(-3F, 0F, -9F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, 0F, -0.5F, -0.3F, 0F); // Box 41
		bodyModel[46].setRotationPoint(3F, 0F, -9F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 7, 2, 1, 0F,0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -3.2F, 0.5F, -0.4F, -3.2F, 0.5F, -0.4F, -3.2F, 0.5F, 0F, -3.2F, 0.5F, 0F); // Box 41
		bodyModel[47].setRotationPoint(11F, 0F, -9F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.1F, -0.3F, -0.5F, -0.1F, -0.3F, -0.5F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.3F, -0.3F, -0.5F, -0.3F, -0.3F, -0.5F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 41
		bodyModel[48].setRotationPoint(11F, 0F, -9F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, 0F, -0.5F, -0.3F, 0F); // Box 41
		bodyModel[49].setRotationPoint(17F, 0F, -9F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, -1.5F, -0.5F, -0.05F, -1.5F, -0.5F, -0.05F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -1.5F, -0.2F, -0.05F, -1.5F, -0.2F, -0.05F); // Box 35
		bodyModel[50].setRotationPoint(-16F, 2F, 8F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, -0.2F, 0F, 0F, -0.2F, 0F, -1.5F, -0.2F, -0.05F, -1.5F, -0.2F, -0.05F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1.5F, -0.5F, -0.05F, -1.5F, -0.5F, -0.05F); // Box 35
		bodyModel[51].setRotationPoint(-16F, 4F, 8F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, -1.5F, -0.5F, -0.05F, -1.5F, -0.5F, -0.05F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -1.5F, -0.2F, -0.05F, -1.5F, -0.2F, -0.05F); // Box 35
		bodyModel[52].setRotationPoint(-2F, 2F, 8F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, -0.2F, 0F, 0F, -0.2F, 0F, -1.5F, -0.2F, -0.05F, -1.5F, -0.2F, -0.05F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1.5F, -0.5F, -0.05F, -1.5F, -0.5F, -0.05F); // Box 35
		bodyModel[53].setRotationPoint(-2F, 4F, 8F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, -1.5F, -0.5F, -0.05F, -1.5F, -0.5F, -0.05F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -1.5F, -0.2F, -0.05F, -1.5F, -0.2F, -0.05F); // Box 35
		bodyModel[54].setRotationPoint(12F, 2F, 8F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, -0.2F, 0F, 0F, -0.2F, 0F, -1.5F, -0.2F, -0.05F, -1.5F, -0.2F, -0.05F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1.5F, -0.5F, -0.05F, -1.5F, -0.5F, -0.05F); // Box 35
		bodyModel[55].setRotationPoint(12F, 4F, 8F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 7, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, -3.2F, 0.5F, 0F, -3.2F, 0.5F, 0F, -3.2F, 0.5F, -0.4F, -3.2F, 0.5F, -0.4F); // Box 41
		bodyModel[56].setRotationPoint(-17F, 0F, 8F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 41
		bodyModel[57].setRotationPoint(-17F, 0F, 8F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, -0.3F, -0.5F, -0.1F, -0.3F, -0.5F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -0.3F, -0.5F, -0.3F, -0.3F); // Box 41
		bodyModel[58].setRotationPoint(-11F, 0F, 8F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 7, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, -3.2F, 0.5F, 0F, -3.2F, 0.5F, 0F, -3.2F, 0.5F, -0.4F, -3.2F, 0.5F, -0.4F); // Box 41
		bodyModel[59].setRotationPoint(-3F, 0F, 8F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 41
		bodyModel[60].setRotationPoint(-3F, 0F, 8F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, -0.3F, -0.5F, -0.1F, -0.3F, -0.5F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -0.3F, -0.5F, -0.3F, -0.3F); // Box 41
		bodyModel[61].setRotationPoint(3F, 0F, 8F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 7, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, -3.2F, 0.5F, 0F, -3.2F, 0.5F, 0F, -3.2F, 0.5F, -0.4F, -3.2F, 0.5F, -0.4F); // Box 41
		bodyModel[62].setRotationPoint(11F, 0F, 8F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 41
		bodyModel[63].setRotationPoint(11F, 0F, 8F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, -0.3F, -0.5F, -0.1F, -0.3F, -0.5F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -0.3F, -0.5F, -0.3F, -0.3F); // Box 41
		bodyModel[64].setRotationPoint(17F, 0F, 8F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 80, 26, 1, 0F,0.5F, 0F, -0.5F, -40F, 0F, -0.5F, -40F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, -13.3F, -0.5F, -40F, -13.3F, -0.5F, -40F, -12.8F, 0.5F, 0.5F, -12.8F, 0.5F); // Box 67
		bodyModel[65].setRotationPoint(-18F, -14F, -11F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 80, 26, 1, 0F,0.5F, 0F, 0.5F, -40F, 0F, 0.5F, -40F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, -12.8F, 0.5F, -40F, -12.8F, 0.5F, -40F, -13.3F, -0.5F, 0.5F, -13.3F, -0.5F); // Box 67
		bodyModel[66].setRotationPoint(-18F, -14F, 10F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 40, 2, 3, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 67
		bodyModel[67].setRotationPoint(-18F, -16F, -11F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 13, 2, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 70
		bodyModel[68].setRotationPoint(9F, -16F, -8F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 40, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 67
		bodyModel[69].setRotationPoint(-18F, -16F, 8F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 1, 13, 20, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 72
		bodyModel[70].setRotationPoint(21F, -14F, -10F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 1, 4, 16, 0F,-0.5F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 70
		bodyModel[71].setRotationPoint(9F, -20F, -8F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 26, 4, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 74
		bodyModel[72].setRotationPoint(-16F, -20F, -8F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 26, 4, 1, 0F,0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[73].setRotationPoint(-16F, -20F, 7F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 1, 2, 16, 0F,-0.5F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, -0.5F, -0.5F, -2F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 70
		bodyModel[74].setRotationPoint(9F, -21.75F, -8F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,-0.5F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, -0.5F, 0F, -4F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 70
		bodyModel[75].setRotationPoint(9F, -22.25F, -6F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 3, 4, 16, 0F,-0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 70
		bodyModel[76].setRotationPoint(-19F, -20F, -8F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 3, 2, 16, 0F,-0.5F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, -0.5F, -0.5F, -2F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 70
		bodyModel[77].setRotationPoint(-19F, -21.75F, -8F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 3, 1, 12, 0F,-0.5F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, -0.5F, 0F, -4F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 70
		bodyModel[78].setRotationPoint(-19F, -22.25F, -6F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 1, 2, 22, 0F,-0.5F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, -0.5F, 0F, -3F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 67
		bodyModel[79].setRotationPoint(-19F, -16F, -11F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 1, 13, 20, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 72
		bodyModel[80].setRotationPoint(-19F, -14F, -10F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 1, 3, 20, 0F,-0.8F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.8F, 0F, -0.5F, -0.8F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, -0.8F, -0.3F, -0.5F); // Box 72
		bodyModel[81].setRotationPoint(21F, -1F, -10F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.5F, 0.25F, -0.8F, 0F, 0.25F, -0.8F, 0F, 0.25F, 0.3F, -0.5F, 0.25F, 0.3F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.4F, 0F, -0.5F, -0.4F, 0F); // Box 67
		bodyModel[82].setRotationPoint(-19F, -17F, -11F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,-0.5F, -0.5F, -3F, 0F, -0.5F, -3F, 0F, -1.1F, 0F, -0.5F, -1.1F, 0F, -0.5F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -1.7F, -0.5F, 0F, -1.7F); // Box 67
		bodyModel[83].setRotationPoint(-19F, -20.25F, -11F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.5F, -0.15F, -0.7F, 0F, -0.15F, -0.7F, 0F, 0.15F, 0F, -0.5F, 0.15F, 0F, -0.5F, 0.25F, -0.7F, 0F, 0.25F, -0.7F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 67
		bodyModel[84].setRotationPoint(-19F, -19F, -9F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.5F, 0.25F, 0.3F, 0F, 0.25F, 0.3F, 0F, 0.25F, -0.8F, -0.5F, 0.25F, -0.8F, -0.5F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 67
		bodyModel[85].setRotationPoint(-19F, -17F, 10F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,-0.5F, -1.1F, 0F, 0F, -1.1F, 0F, 0F, -0.5F, -3F, -0.5F, -0.5F, -3F, -0.5F, 0F, -1.7F, 0F, 0F, -1.7F, 0F, 0F, -0.8F, -0.5F, 0F, -0.8F); // Box 67
		bodyModel[86].setRotationPoint(-19F, -20.25F, 8F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.5F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, -0.15F, -0.7F, -0.5F, -0.15F, -0.7F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, -0.7F, -0.5F, 0.25F, -0.7F); // Box 67
		bodyModel[87].setRotationPoint(-19F, -19F, 8F);

		bodyModel[88].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 93
		bodyModel[88].setRotationPoint(22F, 0F, 7F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0.2F, 0.2F, -0.5F, 0.2F, 0.2F, -0.5F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, -0.5F, 0.2F, 0.2F, -0.5F, 0.2F, 0.2F, 0F, 0.2F, 0.2F); // Box 93
		bodyModel[89].setRotationPoint(22F, 0F, 7F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F); // Box 93
		bodyModel[90].setRotationPoint(24F, -1F, 6F);

		bodyModel[91].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 93
		bodyModel[91].setRotationPoint(22F, 0F, -8F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0.2F, 0.2F, -0.5F, 0.2F, 0.2F, -0.5F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, -0.5F, 0.2F, 0.2F, -0.5F, 0.2F, 0.2F, 0F, 0.2F, 0.2F); // Box 93
		bodyModel[92].setRotationPoint(22F, 0F, -8F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F); // Box 93
		bodyModel[93].setRotationPoint(24F, -1F, -9F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 2, 2, 5, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 99
		bodyModel[94].setRotationPoint(12.5F, -18F, -2.5F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 2, 2, 5, 0F,0F, -0.5F, -2F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, -2F, 0F, 0F, -2F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -2F); // Box 99
		bodyModel[95].setRotationPoint(11F, -18F, -2.5F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 2, 2, 5, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -0.5F, 0F, 0F); // Box 99
		bodyModel[96].setRotationPoint(14F, -18F, -2.5F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 99
		bodyModel[97].setRotationPoint(12.5F, -18.5F, -2.5F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,-1F, -0.5F, -2F, -0.5F, -0.5F, -1F, -0.5F, -0.5F, -1F, -1F, -0.5F, -2F, 0F, 0F, -2F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -2F); // Box 99
		bodyModel[98].setRotationPoint(11F, -18.5F, -2.5F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,-0.5F, -0.5F, -1F, -1F, -0.5F, -2F, -1F, -0.5F, -2F, -0.5F, -0.5F, -1F, -0.5F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -0.5F, 0F, 0F); // Box 99
		bodyModel[99].setRotationPoint(14F, -18.5F, -2.5F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 99
		bodyModel[100].setRotationPoint(18.5F, -17F, -1.5F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 99
		bodyModel[101].setRotationPoint(17.5F, -17F, -1.5F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 99
		bodyModel[102].setRotationPoint(19.5F, -17F, -1.5F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.4F, -0.2F, -0.1F, -0.4F, -0.2F, -0.1F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 115
		bodyModel[103].setRotationPoint(22F, 0F, -0.5F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.8F, -0.2F, -0.1F, -0.8F, -0.2F, -0.1F, -0.8F, -0.2F, -0.4F, -0.8F, -0.2F, -0.4F, 0.4F, -0.2F, -0.1F, 0.4F, -0.2F, -0.1F, 0.4F, -0.2F, -0.4F, 0.4F, -0.2F); // Box 115
		bodyModel[104].setRotationPoint(23F, -1F, -0.5F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F,0F, -0.2F, -0.8F, 0F, -0.2F, -0.8F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 110
		bodyModel[105].setRotationPoint(-21F, -1F, -9F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.9F, 0.4F, 0F, -0.9F, 0.4F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 110
		bodyModel[106].setRotationPoint(-21F, 4F, -9F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.9F, 0.4F, 0F, -0.9F, 0.4F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 110
		bodyModel[107].setRotationPoint(-21F, 1F, -9F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F,0F, -0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, -0.8F, -0.2F, 0F, -0.8F, -0.2F, 0F, 0F, 0F, 0F, 0F); // Box 110
		bodyModel[108].setRotationPoint(20F, -1F, -9F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.9F, 0.4F, -0.2F, -0.9F, 0.4F, -0.2F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0.4F, -0.2F, 0F, 0.4F, -0.2F, 0F, 0F, 0F, 0F, 0F); // Box 110
		bodyModel[109].setRotationPoint(20F, 4F, -9F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.9F, 0.4F, -0.2F, -0.9F, 0.4F, -0.2F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0.4F, -0.2F, 0F, 0.4F, -0.2F, 0F, 0F, 0F, 0F, 0F); // Box 110
		bodyModel[110].setRotationPoint(20F, 1F, -9F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F,0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.8F, 0F, -0.2F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F); // Box 110
		bodyModel[111].setRotationPoint(-21F, -1F, 8F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0.4F, 0F, -0.9F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.4F, 0F, 0F, 0.4F); // Box 110
		bodyModel[112].setRotationPoint(-21F, 4F, 8F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0.4F, 0F, -0.9F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.4F, 0F, 0F, 0.4F); // Box 110
		bodyModel[113].setRotationPoint(-21F, 1F, 8F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F,0F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, -0.8F, 0F, -0.2F, -0.8F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -0.8F, 0F, 0F, -0.8F); // Box 110
		bodyModel[114].setRotationPoint(20F, -1F, 8F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.9F, 0F, -0.2F, -0.9F, 0F, -0.2F, -0.9F, 0.4F, 0F, -0.9F, 0.4F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0.4F, 0F, 0F, 0.4F); // Box 110
		bodyModel[115].setRotationPoint(20F, 4F, 8F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.9F, 0F, -0.2F, -0.9F, 0F, -0.2F, -0.9F, 0.4F, 0F, -0.9F, 0.4F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0.4F, 0F, 0F, 0.4F); // Box 110
		bodyModel[116].setRotationPoint(20F, 1F, 8F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F); // Box 123
		bodyModel[117].setRotationPoint(-20F, -6.5F, -3F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,-1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, -1.5F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F); // Box 123
		bodyModel[118].setRotationPoint(-20F, -9.5F, -3F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,-1.5F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 123
		bodyModel[119].setRotationPoint(-20F, -9.5F, 2F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 1, 3, 16, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
		bodyModel[120].setRotationPoint(-19F, -4F, -8F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 1, 13, 6, 0F,-0.35F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.35F, 0F, -0.2F, -0.35F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, -0.35F, -0.5F, -0.2F); // Box 123
		bodyModel[121].setRotationPoint(-19F, -19F, -3F);

		bodyModel[122].addBox(0F, 0F, 0F, 3, 1, 2, 0F); // Box 128
		bodyModel[122].setRotationPoint(-24F, -1F, -1F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 1, 16, 1, 0F,-0.2F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, -0.8F, -0.2F, 0F, -0.8F, -0.2F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, -0.8F, -0.2F, 0F, -0.8F); // Box 72
		bodyModel[123].setRotationPoint(22F, -17F, -6F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 1, 16, 1, 0F,-0.2F, 0F, -0.8F, -0.7F, 0F, -0.8F, -0.7F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -0.8F, -0.7F, 0F, -0.8F, -0.7F, 0F, 0F, -0.2F, 0F, 0F); // Box 72
		bodyModel[124].setRotationPoint(22F, -17F, -5F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.2F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.8F, 0F, -0.7F, -0.8F, 0F, -0.7F, -0.8F, 0F, -0.2F, -0.8F, 0F); // Box 72
		bodyModel[125].setRotationPoint(22F, -3F, -6F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.2F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.8F, 0F, -0.7F, -0.8F, 0F, -0.7F, -0.8F, 0F, -0.2F, -0.8F, 0F); // Box 72
		bodyModel[126].setRotationPoint(22F, -6F, -6F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.2F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.8F, 0F, -0.7F, -0.8F, 0F, -0.7F, -0.8F, 0F, -0.2F, -0.8F, 0F); // Box 72
		bodyModel[127].setRotationPoint(22F, -9F, -6F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.2F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.8F, 0F, -0.7F, -0.8F, 0F, -0.7F, -0.8F, 0F, -0.2F, -0.8F, 0F); // Box 72
		bodyModel[128].setRotationPoint(22F, -12F, -6F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.2F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.8F, 0F, -0.7F, -0.8F, 0F, -0.7F, -0.8F, 0F, -0.2F, -0.8F, 0F); // Box 72
		bodyModel[129].setRotationPoint(22F, -15F, -6F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.7F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -0.8F, -0.7F, 0F, -0.8F, -0.7F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -0.8F, -0.7F, 0F, -0.8F); // Box 72
		bodyModel[130].setRotationPoint(20F, -17F, -6F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.7F, 0F, -0.8F, -0.2F, 0F, -0.8F, -0.2F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, -0.8F, -0.2F, 0F, -0.8F, -0.2F, 0F, 0F, -0.7F, 0F, 0F); // Box 72
		bodyModel[131].setRotationPoint(20F, -17F, -5F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.7F, -1F, -0.8F, -0.7F, 0F, -0.8F, -0.7F, 0F, 0F, -0.7F, -1F, 0F, -0.8F, 0F, -0.8F, -0.7F, -0.85F, -0.8F, -0.7F, -0.85F, 0F, -0.8F, 0F, 0F); // Box 72
		bodyModel[132].setRotationPoint(20F, -18F, -5F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.7F, 0F, -0.8F, -0.7F, -1F, -0.8F, -0.7F, -1F, 0F, -0.7F, 0F, 0F, -0.7F, -0.85F, -0.8F, -0.8F, 0F, -0.8F, -0.8F, 0F, 0F, -0.7F, -0.85F, 0F); // Box 72
		bodyModel[133].setRotationPoint(21F, -18F, -5F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-1.3F, 0F, -0.8F, -0.3F, 0F, -0.8F, -0.3F, 0F, 0F, -1.3F, 0F, 0F, -1.3F, -0.85F, -0.8F, -0.3F, -0.85F, -0.8F, -0.3F, -0.85F, 0F, -1.3F, -0.85F, 0F); // Box 72
		bodyModel[134].setRotationPoint(20F, -18F, -5F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.7F, -1F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, -0.8F, -0.7F, -1F, -0.8F, -0.8F, 0F, 0F, -0.7F, -0.85F, 0F, -0.7F, -0.85F, -0.8F, -0.8F, 0F, -0.8F); // Box 72
		bodyModel[135].setRotationPoint(20F, -18F, -6F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.7F, 0F, 0F, -0.7F, -1F, 0F, -0.7F, -1F, -0.8F, -0.7F, 0F, -0.8F, -0.7F, -0.85F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, -0.8F, -0.7F, -0.85F, -0.8F); // Box 72
		bodyModel[136].setRotationPoint(21F, -18F, -6F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-1.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.8F, -1.3F, 0F, -0.8F, -1.3F, -0.85F, 0F, -0.3F, -0.85F, 0F, -0.3F, -0.85F, -0.8F, -1.3F, -0.85F, -0.8F); // Box 72
		bodyModel[137].setRotationPoint(20F, -18F, -6F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 0.2F, -0.5F, -0.5F, 0.2F, -0.5F, -0.5F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 146
		bodyModel[138].setRotationPoint(18F, -16F, -10F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 0.2F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, -0.5F, 0F, 0.2F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 146
		bodyModel[139].setRotationPoint(18F, -16F, 8F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-1F, -0.2F, -0.3F, 0.1F, -0.2F, -0.3F, 0.1F, -0.2F, 0.3F, -1F, -0.2F, 0.3F, -1F, 0F, -0.3F, 0.1F, 0F, -0.3F, 0.1F, 0F, 0.3F, -1F, 0F, 0.3F); // Box 72
		bodyModel[140].setRotationPoint(21F, -17F, -8F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, -0.3F, -1F, -0.2F, -0.3F, -1F, 0F, 0.3F, 0.1F, 0F, 0.3F, 0.1F, 0F, -0.3F, -1F, 0F, -0.3F); // Box 72
		bodyModel[141].setRotationPoint(21F, -17F, 7F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 26, 1, 16, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 150
		bodyModel[142].setRotationPoint(-16F, -18F, -8F);
	}
}