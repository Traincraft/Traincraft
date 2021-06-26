//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2021 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 03.08.2020 - 13:35:58
// Last changed on: 03.08.2020 - 13:35:58

package train.client.render.models; //Path where the model is located

import tmt.ModelConverter;
import tmt.ModelRendererTurbo;

public class ModelDstockPassenger extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 128;

	public ModelDstockPassenger() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[120];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 1
		bodyModel[2] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 4
		bodyModel[3] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 5
		bodyModel[4] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 6
		bodyModel[5] = new ModelRendererTurbo(this, 241, 72, textureX, textureY); // Box 9
		bodyModel[6] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 10
		bodyModel[7] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 11
		bodyModel[8] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 12
		bodyModel[9] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 14
		bodyModel[10] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 15
		bodyModel[11] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 16
		bodyModel[12] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 17
		bodyModel[13] = new ModelRendererTurbo(this, 408, 1, textureX, textureY); // Box 18
		bodyModel[14] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 20
		bodyModel[15] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 21
		bodyModel[16] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 22
		bodyModel[17] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 24
		bodyModel[18] = new ModelRendererTurbo(this, 37, 74, textureX, textureY); // Box 26
		bodyModel[19] = new ModelRendererTurbo(this, 37, 77, textureX, textureY); // Box 27
		bodyModel[20] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 28
		bodyModel[21] = new ModelRendererTurbo(this, 193, 9, textureX, textureY); // Box 29
		bodyModel[22] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 31
		bodyModel[23] = new ModelRendererTurbo(this, 217, 17, textureX, textureY); // Box 32
		bodyModel[24] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 33
		bodyModel[25] = new ModelRendererTurbo(this, 49, 41, textureX, textureY); // Box 35
		bodyModel[26] = new ModelRendererTurbo(this, 177, 41, textureX, textureY); // Box 36
		bodyModel[27] = new ModelRendererTurbo(this, 289, 41, textureX, textureY); // Box 37
		bodyModel[28] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 39
		bodyModel[29] = new ModelRendererTurbo(this, 177, 49, textureX, textureY); // Box 40
		bodyModel[30] = new ModelRendererTurbo(this, 289, 49, textureX, textureY); // Box 41
		bodyModel[31] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 44
		bodyModel[32] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 45
		bodyModel[33] = new ModelRendererTurbo(this, 257, 9, textureX, textureY); // Box 46
		bodyModel[34] = new ModelRendererTurbo(this, 137, 25, textureX, textureY); // Box 47
		bodyModel[35] = new ModelRendererTurbo(this, 241, 25, textureX, textureY); // Box 48
		bodyModel[36] = new ModelRendererTurbo(this, 465, 17, textureX, textureY); // Box 49
		bodyModel[37] = new ModelRendererTurbo(this, 489, 17, textureX, textureY); // Box 50
		bodyModel[38] = new ModelRendererTurbo(this, 177, 25, textureX, textureY); // Box 53
		bodyModel[39] = new ModelRendererTurbo(this, 137, 33, textureX, textureY); // Box 54
		bodyModel[40] = new ModelRendererTurbo(this, 441, 25, textureX, textureY); // Box 55
		bodyModel[41] = new ModelRendererTurbo(this, 457, 25, textureX, textureY); // Box 56
		bodyModel[42] = new ModelRendererTurbo(this, 257, 33, textureX, textureY); // Box 57
		bodyModel[43] = new ModelRendererTurbo(this, 185, 33, textureX, textureY); // Box 58
		bodyModel[44] = new ModelRendererTurbo(this, 465, 33, textureX, textureY); // Box 59
		bodyModel[45] = new ModelRendererTurbo(this, 449, 41, textureX, textureY); // Box 62
		bodyModel[46] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 63
		bodyModel[47] = new ModelRendererTurbo(this, 33, 49, textureX, textureY); // Box 64
		bodyModel[48] = new ModelRendererTurbo(this, 487, 41, textureX, textureY); // Box 66
		bodyModel[49] = new ModelRendererTurbo(this, 400, 49, textureX, textureY); // Box 67
		bodyModel[50] = new ModelRendererTurbo(this, 425, 49, textureX, textureY); // Box 68
		bodyModel[51] = new ModelRendererTurbo(this, 433, 17, textureX, textureY); // Box 72
		bodyModel[52] = new ModelRendererTurbo(this, 169, 33, textureX, textureY); // Box 73
		bodyModel[53] = new ModelRendererTurbo(this, 457, 49, textureX, textureY); // Box 74
		bodyModel[54] = new ModelRendererTurbo(this, 473, 49, textureX, textureY); // Box 75
		bodyModel[55] = new ModelRendererTurbo(this, 489, 49, textureX, textureY); // Box 77
		bodyModel[56] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 78
		bodyModel[57] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 79
		bodyModel[58] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 80
		bodyModel[59] = new ModelRendererTurbo(this, 505, 17, textureX, textureY); // Box 81
		bodyModel[60] = new ModelRendererTurbo(this, 377, 25, textureX, textureY); // Box 82
		bodyModel[61] = new ModelRendererTurbo(this, 505, 49, textureX, textureY); // Box 83
		bodyModel[62] = new ModelRendererTurbo(this, 17, 57, textureX, textureY); // Box 84
		bodyModel[63] = new ModelRendererTurbo(this, 25, 57, textureX, textureY); // Box 85
		bodyModel[64] = new ModelRendererTurbo(this, 33, 57, textureX, textureY); // Box 86
		bodyModel[65] = new ModelRendererTurbo(this, 193, 57, textureX, textureY); // Box 0
		bodyModel[66] = new ModelRendererTurbo(this, 209, 57, textureX, textureY); // Box 1
		bodyModel[67] = new ModelRendererTurbo(this, 225, 57, textureX, textureY); // Box 2
		bodyModel[68] = new ModelRendererTurbo(this, 241, 57, textureX, textureY); // Box 3
		bodyModel[69] = new ModelRendererTurbo(this, 441, 49, textureX, textureY); // Box 4
		bodyModel[70] = new ModelRendererTurbo(this, 473, 49, textureX, textureY); // Box 5
		bodyModel[71] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 81
		bodyModel[72] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 82
		bodyModel[73] = new ModelRendererTurbo(this, 41, 41, textureX, textureY); // Box 83
		bodyModel[74] = new ModelRendererTurbo(this, 449, 25, textureX, textureY); // Box 84
		bodyModel[75] = new ModelRendererTurbo(this, 497, 33, textureX, textureY); // Box 85
		bodyModel[76] = new ModelRendererTurbo(this, 257, 57, textureX, textureY); // Box 86
		bodyModel[77] = new ModelRendererTurbo(this, 281, 57, textureX, textureY); // Box 87
		bodyModel[78] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 88
		bodyModel[79] = new ModelRendererTurbo(this, 9, 9, textureX, textureY); // Box 89
		bodyModel[80] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 90
		bodyModel[81] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 91
		bodyModel[82] = new ModelRendererTurbo(this, 305, 57, textureX, textureY); // Box 92
		bodyModel[83] = new ModelRendererTurbo(this, 329, 57, textureX, textureY); // Box 93
		bodyModel[84] = new ModelRendererTurbo(this, 265, 9, textureX, textureY); // Box 94
		bodyModel[85] = new ModelRendererTurbo(this, 193, 57, textureX, textureY); // Box 95
		bodyModel[86] = new ModelRendererTurbo(this, 353, 57, textureX, textureY); // Box 96
		bodyModel[87] = new ModelRendererTurbo(this, 369, 57, textureX, textureY); // Box 97
		bodyModel[88] = new ModelRendererTurbo(this, 393, 57, textureX, textureY); // Box 98
		bodyModel[89] = new ModelRendererTurbo(this, 409, 57, textureX, textureY); // Box 99
		bodyModel[90] = new ModelRendererTurbo(this, 497, 17, textureX, textureY); // Box 100
		bodyModel[91] = new ModelRendererTurbo(this, 41, 65, textureX, textureY); // Box 101
		bodyModel[92] = new ModelRendererTurbo(this, 185, 25, textureX, textureY); // Box 102
		bodyModel[93] = new ModelRendererTurbo(this, 225, 57, textureX, textureY); // Box 103
		bodyModel[94] = new ModelRendererTurbo(this, 425, 57, textureX, textureY); // Box 104
		bodyModel[95] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 105
		bodyModel[96] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 106
		bodyModel[97] = new ModelRendererTurbo(this, 369, 33, textureX, textureY); // Box 107
		bodyModel[98] = new ModelRendererTurbo(this, 257, 9, textureX, textureY); // Box 108
		bodyModel[99] = new ModelRendererTurbo(this, 65, 65, textureX, textureY); // Box 109
		bodyModel[100] = new ModelRendererTurbo(this, 81, 65, textureX, textureY); // Box 110
		bodyModel[101] = new ModelRendererTurbo(this, 113, 65, textureX, textureY); // Box 111
		bodyModel[102] = new ModelRendererTurbo(this, 137, 65, textureX, textureY); // Box 112
		bodyModel[103] = new ModelRendererTurbo(this, 161, 65, textureX, textureY); // Box 113
		bodyModel[104] = new ModelRendererTurbo(this, 281, 65, textureX, textureY); // Box 114
		bodyModel[105] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 115
		bodyModel[106] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 116
		bodyModel[107] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 117
		bodyModel[108] = new ModelRendererTurbo(this, 217, 72, textureX, textureY); // Box 118
		bodyModel[109] = new ModelRendererTurbo(this, 193, 72, textureX, textureY); // Box 119
		bodyModel[110] = new ModelRendererTurbo(this, 257, 72, textureX, textureY); // Box 120
		bodyModel[111] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 121
		bodyModel[112] = new ModelRendererTurbo(this, 137, 33, textureX, textureY); // Box 121
		bodyModel[113] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 122
		bodyModel[114] = new ModelRendererTurbo(this, 433, 17, textureX, textureY); // Box 123
		bodyModel[115] = new ModelRendererTurbo(this, 487, 41, textureX, textureY); // Box 124
		bodyModel[116] = new ModelRendererTurbo(this, 257, 33, textureX, textureY); // Box 119
		bodyModel[117] = new ModelRendererTurbo(this, 185, 33, textureX, textureY); // Box 120
		bodyModel[118] = new ModelRendererTurbo(this, 169, 33, textureX, textureY); // Box 121
		bodyModel[119] = new ModelRendererTurbo(this, 400, 49, textureX, textureY); // Box 122

		bodyModel[0].addShapeBox(0F, 0F, 0F, 54, 1, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[0].setRotationPoint(-26F, 4F, -10F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 13, 18, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[1].setRotationPoint(-27F, -14F, -11F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 13, 18, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[2].setRotationPoint(-27F, -14F, 10F);

		bodyModel[3].addBox(0F, 0F, 0F, 1, 17, 7, 0F); // Box 5
		bodyModel[3].setRotationPoint(-27F, -13F, 3F);

		bodyModel[4].addBox(0F, 0F, 0F, 1, 17, 7, 0F); // Box 6
		bodyModel[4].setRotationPoint(-27F, -13F, -10F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 1, 17, 6, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 9
		bodyModel[5].setRotationPoint(26.75F, -13F, -3F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 1, 1, 19, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F); // Box 10
		bodyModel[6].setRotationPoint(-27F, -14F, -9.5F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[7].setRotationPoint(-27.5F, 4.2F, -8F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		bodyModel[8].setRotationPoint(-27.5F, 4.2F, 5F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 8, 18, 1, 0F,0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		bodyModel[9].setRotationPoint(-14F, -14F, -11F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 8, 18, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 15
		bodyModel[10].setRotationPoint(-14F, -14F, 9.25F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 13, 18, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 16
		bodyModel[11].setRotationPoint(-6F, -14F, 10F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 8, 18, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 17
		bodyModel[12].setRotationPoint(7F, -14F, 9.25F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 13, 18, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 18
		bodyModel[13].setRotationPoint(15F, -14F, 10F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 13, 18, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 20
		bodyModel[14].setRotationPoint(-6F, -14F, -11F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 8, 18, 1, 0F,0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 21
		bodyModel[15].setRotationPoint(7F, -14F, -11F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 13, 18, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		bodyModel[16].setRotationPoint(15F, -14F, -11F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, -2F, -0.25F, 0F, -2F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		bodyModel[17].setRotationPoint(-27F, -17F, -10.5F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 53, 1, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[18].setRotationPoint(-26F, -15F, -10.5F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 53, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
		bodyModel[19].setRotationPoint(-26F, -15F, 9.5F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -2F, -0.25F, 0F, -2F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 28
		bodyModel[20].setRotationPoint(-27F, -17F, 8.5F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 1, 3, 17, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 29
		bodyModel[21].setRotationPoint(-27F, -17F, -8.5F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, -2F, -0.25F, 0F, -2F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 31
		bodyModel[22].setRotationPoint(27F, -17F, -10.5F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 1, 3, 17, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 32
		bodyModel[23].setRotationPoint(27F, -17F, -8.5F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -2F, -0.25F, 0F, -2F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
		bodyModel[24].setRotationPoint(27F, -17F, 8.5F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 55, 1, 17, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 35
		bodyModel[25].setRotationPoint(-27F, -18F, -8.5F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 53, 3, 1, 0F,0F, -0.5F, 2F, 0F, -0.5F, 2F, 0F, -0.5F, -1.75F, 0F, -0.5F, -1.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 36
		bodyModel[26].setRotationPoint(-26F, -17F, 9.25F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 53, 3, 1, 0F,0F, -0.5F, -1.75F, 0F, -0.5F, -1.75F, 0F, -0.5F, 2F, 0F, -0.5F, 2F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 37
		bodyModel[27].setRotationPoint(-26F, -17F, -10.25F);

		bodyModel[28].addBox(0F, 0F, 0F, 1, 2, 7, 0F); // Box 39
		bodyModel[28].setRotationPoint(-27F, 4F, -3.5F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 53, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F); // Box 40
		bodyModel[29].setRotationPoint(-26F, 4F, -11F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 53, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F); // Box 41
		bodyModel[30].setRotationPoint(-26F, 4F, 10F);

		bodyModel[31].addBox(0F, 0F, 0F, 1, 3, 5, 0F); // Box 44
		bodyModel[31].setRotationPoint(6F, -2F, 5F);

		bodyModel[32].addBox(0F, 0F, 0F, 1, 3, 5, 0F); // Box 45
		bodyModel[32].setRotationPoint(6F, -2F, -10F);

		bodyModel[33].addBox(0F, 0F, 0F, 1, 3, 5, 0F); // Box 46
		bodyModel[33].setRotationPoint(-6F, -2F, -10F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 13, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 47
		bodyModel[34].setRotationPoint(-6F, 1F, -10F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 13, 3, 3, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 48
		bodyModel[35].setRotationPoint(-6F, 1F, 7F);

		bodyModel[36].addBox(0F, 0F, 0F, 1, 3, 5, 0F); // Box 49
		bodyModel[36].setRotationPoint(-6F, -2F, 5F);

		bodyModel[37].addBox(0F, 0F, 0F, 1, 3, 5, 0F); // Box 50
		bodyModel[37].setRotationPoint(-15F, -2F, -10F);

		bodyModel[38].addBox(0F, 0F, 0F, 1, 3, 5, 0F); // Box 53
		bodyModel[38].setRotationPoint(-15F, -2F, 5F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 11, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 54
		bodyModel[39].setRotationPoint(15F, 1F, -10F);

		bodyModel[40].addBox(0F, 0F, 0F, 1, 3, 5, 0F); // Box 55
		bodyModel[40].setRotationPoint(15F, -2F, -10F);

		bodyModel[41].addBox(0F, 0F, 0F, 1, 3, 5, 0F); // Box 56
		bodyModel[41].setRotationPoint(15F, -2F, 5F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 11, 3, 3, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 57
		bodyModel[42].setRotationPoint(15F, 1F, 7F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 11, 1, 5, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 58
		bodyModel[43].setRotationPoint(16F, 0F, 5F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 11, 1, 5, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 59
		bodyModel[44].setRotationPoint(-5F, 0F, 5F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 11, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 62
		bodyModel[45].setRotationPoint(-5F, 0F, -10F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 11, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 63
		bodyModel[46].setRotationPoint(16F, 0F, -10F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 11, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 64
		bodyModel[47].setRotationPoint(-5F, -4F, -10F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 11, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 66
		bodyModel[48].setRotationPoint(16F, -4F, -10F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 11, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 67
		bodyModel[49].setRotationPoint(16F, -4F, 9F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 11, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 68
		bodyModel[50].setRotationPoint(-5F, -4F, 9F);

		bodyModel[51].addBox(0F, 0F, -4F, 0, 1, 4, 0F); // Box 72
		bodyModel[51].setRotationPoint(21.5F, -3F, -5F);
		bodyModel[51].rotateAngleX = 0.10471976F;

		bodyModel[52].addBox(0F, 0F, 0F, 0, 1, 4, 0F); // Box 73
		bodyModel[52].setRotationPoint(21.5F, -3F, 5F);
		bodyModel[52].rotateAngleX = -0.08726646F;

		bodyModel[53].addBox(0F, 0F, -4F, 0, 1, 4, 0F); // Box 74
		bodyModel[53].setRotationPoint(2.5F, -3F, -5F);
		bodyModel[53].rotateAngleX = 0.10471976F;

		bodyModel[54].addBox(0F, 0F, -4F, 0, 1, 4, 0F); // Box 75
		bodyModel[54].setRotationPoint(-1.5F, -3F, -5F);
		bodyModel[54].rotateAngleX = 0.10471976F;

		bodyModel[55].addBox(0F, 0F, 0F, 0, 1, 4, 0F); // Box 77
		bodyModel[55].setRotationPoint(2.5F, -3F, 5F);
		bodyModel[55].rotateAngleX = -0.08726646F;

		bodyModel[56].addBox(0F, 0F, 0F, 0, 1, 4, 0F); // Box 78
		bodyModel[56].setRotationPoint(-1.5F, -3F, 5F);
		bodyModel[56].rotateAngleX = -0.08726646F;

		bodyModel[57].addShapeBox(0F, 0F, 0F, 0, 14, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 79
		bodyModel[57].setRotationPoint(-5.5F, -16F, 4.5F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 0, 14, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 80
		bodyModel[58].setRotationPoint(6.5F, -16F, 4.5F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 0, 14, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 81
		bodyModel[59].setRotationPoint(6.5F, -16F, -6F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 0, 14, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 82
		bodyModel[60].setRotationPoint(-5.5F, -16F, -6F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 0, 14, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 83
		bodyModel[61].setRotationPoint(-14.5F, -16F, -6F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 0, 14, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 84
		bodyModel[62].setRotationPoint(-14.5F, -16F, 4.5F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 0, 14, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 85
		bodyModel[63].setRotationPoint(15.5F, -16F, 4.5F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 0, 14, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 86
		bodyModel[64].setRotationPoint(15.5F, -16F, -6F);

		bodyModel[65].addBox(0F, 0F, 0F, 5, 5, 0, 0F); // Box 0
		bodyModel[65].setRotationPoint(-14.75F, 5F, 5F);

		bodyModel[66].addBox(0F, 0F, 0F, 5, 5, 0, 0F); // Box 1
		bodyModel[66].setRotationPoint(-25.25F, 5F, 5F);

		bodyModel[67].addBox(0F, 0F, 0F, 5, 5, 0, 0F); // Box 2
		bodyModel[67].setRotationPoint(-14.75F, 5F, -5F);

		bodyModel[68].addBox(0F, 0F, 0F, 5, 5, 0, 0F); // Box 3
		bodyModel[68].setRotationPoint(-25.25F, 5F, -5F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 4
		bodyModel[69].setRotationPoint(-12.75F, 7F, -6F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 5
		bodyModel[70].setRotationPoint(-23.25F, 7F, -6F);

		bodyModel[71].addBox(0F, 0F, 0F, 2, 3, 1, 0F); // Box 81
		bodyModel[71].setRotationPoint(-14F, 6F, 6F);

		bodyModel[72].addBox(0F, 0F, 0F, 2, 3, 1, 0F); // Box 82
		bodyModel[72].setRotationPoint(-23F, 6F, 6F);

		bodyModel[73].addBox(0F, 0F, 0F, 9, 3, 1, 0F); // Box 83
		bodyModel[73].setRotationPoint(-22F, 6F, 7F);

		bodyModel[74].addBox(0F, 0F, 0F, 3, 3, 1, 0F); // Box 84
		bodyModel[74].setRotationPoint(-24.25F, 6F, 2F);

		bodyModel[75].addBox(0F, 0F, 0F, 3, 3, 1, 0F); // Box 85
		bodyModel[75].setRotationPoint(-13.75F, 6F, -2F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 7, 3, 5, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 86
		bodyModel[76].setRotationPoint(-21.25F, 6F, -2F);

		bodyModel[77].addBox(0F, 0F, 0F, 9, 3, 1, 0F); // Box 87
		bodyModel[77].setRotationPoint(-22F, 6F, -8F);

		bodyModel[78].addBox(0F, 0F, 0F, 2, 3, 1, 0F); // Box 88
		bodyModel[78].setRotationPoint(-23F, 6F, -7F);

		bodyModel[79].addBox(0F, 0F, 0F, 2, 3, 1, 0F); // Box 89
		bodyModel[79].setRotationPoint(-14F, 6F, -7F);

		bodyModel[80].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 90
		bodyModel[80].setRotationPoint(-19F, 5F, -7F);

		bodyModel[81].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 91
		bodyModel[81].setRotationPoint(-16F, 5F, 6F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 4, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 92
		bodyModel[82].setRotationPoint(-7F, 5F, -9F);

		bodyModel[83].addBox(0F, 0F, 0F, 9, 3, 1, 0F); // Box 93
		bodyModel[83].setRotationPoint(15F, 6F, -8F);

		bodyModel[84].addBox(0F, 0F, 0F, 2, 3, 1, 0F); // Box 94
		bodyModel[84].setRotationPoint(14F, 6F, -7F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 95
		bodyModel[85].setRotationPoint(13.75F, 7F, -6F);

		bodyModel[86].addBox(0F, 0F, 0F, 5, 5, 0, 0F); // Box 96
		bodyModel[86].setRotationPoint(11.75F, 5F, -5F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 7, 3, 5, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 97
		bodyModel[87].setRotationPoint(15.75F, 6F, -2F);

		bodyModel[88].addBox(0F, 0F, 0F, 3, 3, 1, 0F); // Box 98
		bodyModel[88].setRotationPoint(12.75F, 6F, 2F);

		bodyModel[89].addBox(0F, 0F, 0F, 5, 5, 0, 0F); // Box 99
		bodyModel[89].setRotationPoint(11.75F, 5F, 5F);

		bodyModel[90].addBox(0F, 0F, 0F, 2, 3, 1, 0F); // Box 100
		bodyModel[90].setRotationPoint(14F, 6F, 6F);

		bodyModel[91].addBox(0F, 0F, 0F, 9, 3, 1, 0F); // Box 101
		bodyModel[91].setRotationPoint(15F, 6F, 7F);

		bodyModel[92].addBox(0F, 0F, 0F, 2, 3, 1, 0F); // Box 102
		bodyModel[92].setRotationPoint(23F, 6F, 6F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 103
		bodyModel[93].setRotationPoint(24.25F, 7F, -6F);

		bodyModel[94].addBox(0F, 0F, 0F, 5, 5, 0, 0F); // Box 104
		bodyModel[94].setRotationPoint(22.25F, 5F, 5F);

		bodyModel[95].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 105
		bodyModel[95].setRotationPoint(21F, 5F, 6F);

		bodyModel[96].addBox(0F, 0F, 0F, 3, 3, 1, 0F); // Box 106
		bodyModel[96].setRotationPoint(23.25F, 6F, -2F);

		bodyModel[97].addBox(0F, 0F, 0F, 2, 3, 1, 0F); // Box 107
		bodyModel[97].setRotationPoint(23F, 6F, -7F);

		bodyModel[98].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 108
		bodyModel[98].setRotationPoint(18F, 5F, -7F);

		bodyModel[99].addBox(0F, 0F, 0F, 5, 5, 0, 0F); // Box 109
		bodyModel[99].setRotationPoint(22.25F, 5F, -5F);

		bodyModel[100].addBox(0F, 0F, 0F, 11, 4, 4, 0F); // Box 110
		bodyModel[100].setRotationPoint(-2.5F, 5F, -9F);

		bodyModel[101].addBox(0F, 0F, 0F, 7, 2, 2, 0F); // Box 111
		bodyModel[101].setRotationPoint(-28F, 6F, -1F);

		bodyModel[102].addBox(0F, 0F, 0F, 7, 2, 2, 0F); // Box 112
		bodyModel[102].setRotationPoint(23F, 6F, -1F);

		bodyModel[103].addBox(0F, 0F, 0F, 11, 4, 4, 0F); // Box 113
		bodyModel[103].setRotationPoint(-7.5F, 5F, 5F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 4, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 114
		bodyModel[104].setRotationPoint(4F, 5F, 5F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 115
		bodyModel[105].setRotationPoint(27.5F, 4.2F, -8F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 116
		bodyModel[106].setRotationPoint(27.5F, 4.2F, 5F);

		bodyModel[107].addBox(0F, 0F, 0F, 1, 2, 7, 0F); // Box 117
		bodyModel[107].setRotationPoint(28F, 4F, -3.5F);

		bodyModel[108].addBox(0F, 0F, 0F, 1, 17, 7, 0F); // Box 118
		bodyModel[108].setRotationPoint(27F, -13F, -10F);

		bodyModel[109].addBox(0F, 0F, 0F, 1, 17, 7, 0F); // Box 119
		bodyModel[109].setRotationPoint(27F, -13F, 3F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 1, 1, 19, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F); // Box 120
		bodyModel[110].setRotationPoint(27F, -14F, -9.5F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 1, 17, 6, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 121
		bodyModel[111].setRotationPoint(-27.25F, -13F, -3F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 11, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 121
		bodyModel[112].setRotationPoint(-26F, 1F, -10F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 11, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 122
		bodyModel[113].setRotationPoint(-26F, 0F, -10F);

		bodyModel[114].addBox(0F, 0F, -4F, 0, 1, 4, 0F); // Box 123
		bodyModel[114].setRotationPoint(-20.5F, -3F, -5F);
		bodyModel[114].rotateAngleX = 0.10471976F;

		bodyModel[115].addShapeBox(0F, 0F, 0F, 11, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 124
		bodyModel[115].setRotationPoint(-26F, -4F, -10F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 11, 3, 3, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 119
		bodyModel[116].setRotationPoint(-26F, 1F, 7F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 11, 1, 5, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 120
		bodyModel[117].setRotationPoint(-26F, 0F, 5F);

		bodyModel[118].addBox(0F, 0F, 0F, 0, 1, 4, 0F); // Box 121
		bodyModel[118].setRotationPoint(-20.5F, -3F, 5F);
		bodyModel[118].rotateAngleX = -0.08726646F;

		bodyModel[119].addShapeBox(0F, 0F, 0F, 11, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 122
		bodyModel[119].setRotationPoint(-26F, -4F, 9F);
	}
}