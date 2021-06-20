//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 21.06.2020 - 05:37:16
// Last changed on: 21.06.2020 - 05:37:16

package train.client.render.models; //Path where the model is located


import tmt.ModelConverter;
import tmt.ModelRendererTurbo;

public class ModelLUpassenger extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelLUpassenger() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[122];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 49, 67, textureX, textureY); // Box 2
		bodyModel[2] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 5
		bodyModel[3] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 10
		bodyModel[4] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 12
		bodyModel[5] = new ModelRendererTurbo(this, 121, 9, textureX, textureY); // Box 15
		bodyModel[6] = new ModelRendererTurbo(this, 225, 9, textureX, textureY); // Box 19
		bodyModel[7] = new ModelRendererTurbo(this, 329, 9, textureX, textureY); // Box 20
		bodyModel[8] = new ModelRendererTurbo(this, 145, 17, textureX, textureY); // Box 21
		bodyModel[9] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 22
		bodyModel[10] = new ModelRendererTurbo(this, 249, 17, textureX, textureY); // Box 23
		bodyModel[11] = new ModelRendererTurbo(this, 433, 9, textureX, textureY); // Box 24
		bodyModel[12] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 27
		bodyModel[13] = new ModelRendererTurbo(this, 345, 17, textureX, textureY); // Box 31
		bodyModel[14] = new ModelRendererTurbo(this, 425, 17, textureX, textureY); // Box 27
		bodyModel[15] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 28
		bodyModel[16] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 30
		bodyModel[17] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 31
		bodyModel[18] = new ModelRendererTurbo(this, 122, 58, textureX, textureY); // Box 32
		bodyModel[19] = new ModelRendererTurbo(this, 121, 17, textureX, textureY); // Box 33
		bodyModel[20] = new ModelRendererTurbo(this, 361, 17, textureX, textureY); // Box 35
		bodyModel[21] = new ModelRendererTurbo(this, 385, 17, textureX, textureY); // Box 36
		bodyModel[22] = new ModelRendererTurbo(this, 49, 25, textureX, textureY); // Box 37
		bodyModel[23] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 38
		bodyModel[24] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 39
		bodyModel[25] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 40
		bodyModel[26] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 41
		bodyModel[27] = new ModelRendererTurbo(this, 97, 25, textureX, textureY); // Box 42
		bodyModel[28] = new ModelRendererTurbo(this, 145, 25, textureX, textureY); // Box 43
		bodyModel[29] = new ModelRendererTurbo(this, 177, 25, textureX, textureY); // Box 46
		bodyModel[30] = new ModelRendererTurbo(this, 481, 17, textureX, textureY); // Box 47
		bodyModel[31] = new ModelRendererTurbo(this, 217, 25, textureX, textureY); // Box 43
		bodyModel[32] = new ModelRendererTurbo(this, 249, 25, textureX, textureY); // Box 46
		bodyModel[33] = new ModelRendererTurbo(this, 281, 25, textureX, textureY); // Box 47
		bodyModel[34] = new ModelRendererTurbo(this, 305, 25, textureX, textureY); // Box 54
		bodyModel[35] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 61
		bodyModel[36] = new ModelRendererTurbo(this, 321, 25, textureX, textureY); // Box 62
		bodyModel[37] = new ModelRendererTurbo(this, 433, 25, textureX, textureY); // Box 63
		bodyModel[38] = new ModelRendererTurbo(this, 401, 17, textureX, textureY); // Box 64
		bodyModel[39] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 65
		bodyModel[40] = new ModelRendererTurbo(this, 361, 25, textureX, textureY); // Box 66
		bodyModel[41] = new ModelRendererTurbo(this, 385, 25, textureX, textureY); // Box 67
		bodyModel[42] = new ModelRendererTurbo(this, 17, 33, textureX, textureY); // Box 68
		bodyModel[43] = new ModelRendererTurbo(this, 65, 33, textureX, textureY); // Box 69
		bodyModel[44] = new ModelRendererTurbo(this, 137, 17, textureX, textureY); // Box 70
		bodyModel[45] = new ModelRendererTurbo(this, 321, 25, textureX, textureY); // Box 71
		bodyModel[46] = new ModelRendererTurbo(this, 81, 33, textureX, textureY); // Box 72
		bodyModel[47] = new ModelRendererTurbo(this, 129, 33, textureX, textureY); // Box 73
		bodyModel[48] = new ModelRendererTurbo(this, 337, 25, textureX, textureY); // Box 74
		bodyModel[49] = new ModelRendererTurbo(this, 473, 17, textureX, textureY); // Box 75
		bodyModel[50] = new ModelRendererTurbo(this, 177, 33, textureX, textureY); // Box 76
		bodyModel[51] = new ModelRendererTurbo(this, 225, 33, textureX, textureY); // Box 77
		bodyModel[52] = new ModelRendererTurbo(this, 17, 41, textureX, textureY); // Box 78
		bodyModel[53] = new ModelRendererTurbo(this, 65, 41, textureX, textureY); // Box 79
		bodyModel[54] = new ModelRendererTurbo(this, 273, 33, textureX, textureY); // Box 80
		bodyModel[55] = new ModelRendererTurbo(this, 113, 41, textureX, textureY); // Box 81
		bodyModel[56] = new ModelRendererTurbo(this, 137, 41, textureX, textureY); // Box 82
		bodyModel[57] = new ModelRendererTurbo(this, 177, 41, textureX, textureY); // Box 83
		bodyModel[58] = new ModelRendererTurbo(this, 209, 41, textureX, textureY); // Box 84
		bodyModel[59] = new ModelRendererTurbo(this, 241, 41, textureX, textureY); // Box 85
		bodyModel[60] = new ModelRendererTurbo(this, 505, 25, textureX, textureY); // Box 87
		bodyModel[61] = new ModelRendererTurbo(this, 425, 25, textureX, textureY); // Box 88
		bodyModel[62] = new ModelRendererTurbo(this, 449, 25, textureX, textureY); // Box 89
		bodyModel[63] = new ModelRendererTurbo(this, 273, 41, textureX, textureY); // Box 90
		bodyModel[64] = new ModelRendererTurbo(this, 281, 41, textureX, textureY); // Box 91
		bodyModel[65] = new ModelRendererTurbo(this, 289, 41, textureX, textureY); // Box 92
		bodyModel[66] = new ModelRendererTurbo(this, 321, 41, textureX, textureY); // Box 93
		bodyModel[67] = new ModelRendererTurbo(this, 329, 41, textureX, textureY); // Box 94
		bodyModel[68] = new ModelRendererTurbo(this, 345, 41, textureX, textureY); // Box 95
		bodyModel[69] = new ModelRendererTurbo(this, 353, 41, textureX, textureY); // Box 88
		bodyModel[70] = new ModelRendererTurbo(this, 401, 41, textureX, textureY); // Box 90
		bodyModel[71] = new ModelRendererTurbo(this, 425, 41, textureX, textureY); // Box 91
		bodyModel[72] = new ModelRendererTurbo(this, 449, 41, textureX, textureY); // Box 92
		bodyModel[73] = new ModelRendererTurbo(this, 473, 41, textureX, textureY); // Box 93
		bodyModel[74] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 94
		bodyModel[75] = new ModelRendererTurbo(this, 42, 34, textureX, textureY); // Box 97
		bodyModel[76] = new ModelRendererTurbo(this, 369, 41, textureX, textureY); // Box 106
		bodyModel[77] = new ModelRendererTurbo(this, 393, 41, textureX, textureY); // Box 107
		bodyModel[78] = new ModelRendererTurbo(this, 417, 41, textureX, textureY); // Box 108
		bodyModel[79] = new ModelRendererTurbo(this, 441, 41, textureX, textureY); // Box 109
		bodyModel[80] = new ModelRendererTurbo(this, 465, 41, textureX, textureY); // Box 110
		bodyModel[81] = new ModelRendererTurbo(this, 473, 41, textureX, textureY); // Box 111
		bodyModel[82] = new ModelRendererTurbo(this, 489, 41, textureX, textureY); // Box 112
		bodyModel[83] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 113
		bodyModel[84] = new ModelRendererTurbo(this, 17, 49, textureX, textureY); // Box 115
		bodyModel[85] = new ModelRendererTurbo(this, 154, 34, textureX, textureY); // Box 116
		bodyModel[86] = new ModelRendererTurbo(this, 89, 49, textureX, textureY); // Box 117
		bodyModel[87] = new ModelRendererTurbo(this, 25, 49, textureX, textureY); // Box 118
		bodyModel[88] = new ModelRendererTurbo(this, 105, 49, textureX, textureY); // Box 119
		bodyModel[89] = new ModelRendererTurbo(this, 250, 34, textureX, textureY); // Box 120
		bodyModel[90] = new ModelRendererTurbo(this, 121, 49, textureX, textureY); // Box 121
		bodyModel[91] = new ModelRendererTurbo(this, 129, 49, textureX, textureY); // Box 123
		bodyModel[92] = new ModelRendererTurbo(this, 137, 49, textureX, textureY); // Box 124
		bodyModel[93] = new ModelRendererTurbo(this, 218, 42, textureX, textureY); // Box 125
		bodyModel[94] = new ModelRendererTurbo(this, 201, 49, textureX, textureY); // Box 126
		bodyModel[95] = new ModelRendererTurbo(this, 209, 49, textureX, textureY); // Box 127
		bodyModel[96] = new ModelRendererTurbo(this, 297, 49, textureX, textureY); // Box 128
		bodyModel[97] = new ModelRendererTurbo(this, 313, 49, textureX, textureY); // Box 129
		bodyModel[98] = new ModelRendererTurbo(this, 329, 49, textureX, textureY); // Box 130
		bodyModel[99] = new ModelRendererTurbo(this, 225, 49, textureX, textureY); // Box 131
		bodyModel[100] = new ModelRendererTurbo(this, 497, 49, textureX, textureY); // Box 133
		bodyModel[101] = new ModelRendererTurbo(this, 241, 49, textureX, textureY); // Box 134
		bodyModel[102] = new ModelRendererTurbo(this, 49, 57, textureX, textureY); // Box 135
		bodyModel[103] = new ModelRendererTurbo(this, 65, 57, textureX, textureY); // Box 136
		bodyModel[104] = new ModelRendererTurbo(this, 345, 49, textureX, textureY); // Box 137
		bodyModel[105] = new ModelRendererTurbo(this, 81, 57, textureX, textureY); // Box 138
		bodyModel[106] = new ModelRendererTurbo(this, 89, 57, textureX, textureY); // Box 139
		bodyModel[107] = new ModelRendererTurbo(this, 97, 57, textureX, textureY); // Box 140
		bodyModel[108] = new ModelRendererTurbo(this, 105, 57, textureX, textureY); // Box 141
		bodyModel[109] = new ModelRendererTurbo(this, 113, 57, textureX, textureY); // Box 142
		bodyModel[110] = new ModelRendererTurbo(this, 473, 41, textureX, textureY); // Box 143
		bodyModel[111] = new ModelRendererTurbo(this, 473, 41, textureX, textureY); // Box 144
		bodyModel[112] = new ModelRendererTurbo(this, 174, 57, textureX, textureY); // Box 146
		bodyModel[113] = new ModelRendererTurbo(this, 155, 57, textureX, textureY); // Box 151
		bodyModel[114] = new ModelRendererTurbo(this, 135, 57, textureX, textureY); // Box 153
		bodyModel[115] = new ModelRendererTurbo(this, 1, 62, textureX, textureY); // Box 154
		bodyModel[116] = new ModelRendererTurbo(this, 1, 62, textureX, textureY); // Box 155
		bodyModel[117] = new ModelRendererTurbo(this, 206, 63, textureX, textureY); // Box 156
		bodyModel[118] = new ModelRendererTurbo(this, 191, 63, textureX, textureY); // Box 157
		bodyModel[119] = new ModelRendererTurbo(this, 225, 33, textureX, textureY); // Box 122
		bodyModel[120] = new ModelRendererTurbo(this, 321, 25, textureX, textureY); // Box 123
		bodyModel[121] = new ModelRendererTurbo(this, 433, 25, textureX, textureY); // Box 124

		bodyModel[0].addBox(0F, 0F, 0F, 48, 1, 22, 0F); // Box 0
		bodyModel[0].setRotationPoint(-24F, 4F, -11F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 5, 4, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[1].setRotationPoint(5F, 5F, -8F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 48, 4, 3, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, -2.4F, 0F, 0F, -2.4F); // Box 5
		bodyModel[2].setRotationPoint(-24F, -11F, -10F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 48, 1, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 10
		bodyModel[3].setRotationPoint(-24F, -12F, -8F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 48, 2, 3, 0F,0F, 0.4F, -4F, 0F, 0.4F, -4F, 0F, -0.6F, 1F, 0F, -0.6F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 12
		bodyModel[4].setRotationPoint(-24F, -14F, -7F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 48, 1, 3, 0F,0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		bodyModel[5].setRotationPoint(-24F, -15F, -3F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 48, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F); // Box 19
		bodyModel[6].setRotationPoint(-24F, -15F, 0F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 48, 2, 3, 0F,0F, -0.6F, 1F, 0F, -0.6F, 1F, 0F, 0.4F, -4F, 0F, 0.4F, -4F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 20
		bodyModel[7].setRotationPoint(-24F, -14F, 4F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 48, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2.4F, 0F, 0F, -2.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F); // Box 21
		bodyModel[8].setRotationPoint(-24F, -11F, 7F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 19, 3, 1, 0F,0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		bodyModel[9].setRotationPoint(-24F, -7F, 10F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 48, 1, 1, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 23
		bodyModel[10].setRotationPoint(-24F, -12F, 7F);

		bodyModel[11].addBox(0F, 0F, 0F, 20, 5, 1, 0F); // Box 24
		bodyModel[11].setRotationPoint(-24F, -1F, 10F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 1, 3, 12, 0F,0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
		bodyModel[12].setRotationPoint(-24F, -15F, -6F);

		bodyModel[13].addShapeBox(0F, 0F, 2F, 1, 16, 6, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 31
		bodyModel[13].setRotationPoint(-24F, -12F, -5F);

		bodyModel[14].addBox(0F, 0F, 0F, 19, 3, 1, 0F); // Box 27
		bodyModel[14].setRotationPoint(-24F, -4F, 10F);

		bodyModel[15].addBox(0F, 0F, 0F, 19, 3, 1, 0F); // Box 28
		bodyModel[15].setRotationPoint(5F, -4F, 10F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 4, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 30
		bodyModel[16].setRotationPoint(-4F, -4F, 11F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, -1.1F, 0F, 0F, -1.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 31
		bodyModel[17].setRotationPoint(-4F, -7F, 11F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 4, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 32
		bodyModel[18].setRotationPoint(0F, -4F, 11F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, -1.1F, 0F, 0F, -1.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 33
		bodyModel[19].setRotationPoint(0F, -7F, 11F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 4, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -2.4F, 0F, 0F, -2.4F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 35
		bodyModel[20].setRotationPoint(0F, -11F, 8F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 4, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -2.4F, 0F, 0F, -2.4F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 36
		bodyModel[21].setRotationPoint(-4F, -11F, 8F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 19, 3, 1, 0F,0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 37
		bodyModel[22].setRotationPoint(5F, -7F, 10F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[23].setRotationPoint(4F, -7F, 10F);

		bodyModel[24].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 39
		bodyModel[24].setRotationPoint(4F, -4F, 10F);

		bodyModel[25].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 40
		bodyModel[25].setRotationPoint(-5F, -4F, 10F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[26].setRotationPoint(-5F, -7F, 10F);

		bodyModel[27].addBox(0F, 0F, 0F, 20, 5, 1, 0F); // Box 42
		bodyModel[27].setRotationPoint(4F, -1F, 10F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 12, 5, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
		bodyModel[28].setRotationPoint(-16F, -1F, 9F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 12, 1, 4, 0F,0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.5F, 0F, -0.6F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 46
		bodyModel[29].setRotationPoint(-16F, 1F, 6F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 12, 1, 1, 0F,0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 47
		bodyModel[30].setRotationPoint(-16F, 1F, 5F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 12, 5, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
		bodyModel[31].setRotationPoint(4F, -1F, 9F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 12, 1, 4, 0F,0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.5F, 0F, -0.6F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 46
		bodyModel[32].setRotationPoint(4F, 1F, 6F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 12, 1, 1, 0F,0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 47
		bodyModel[33].setRotationPoint(4F, 1F, 5F);

		bodyModel[34].addShapeBox(0F, 0F, 2F, 1, 16, 6, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 54
		bodyModel[34].setRotationPoint(23F, -12F, -5F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 1, 3, 12, 0F,0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 61
		bodyModel[35].setRotationPoint(23F, -15F, -6F);

		bodyModel[36].addBox(0F, 0F, 0F, 1, 7, 7, 0F); // Box 62
		bodyModel[36].setRotationPoint(-23F, -3F, 3F);

		bodyModel[37].addBox(0F, 0F, 0F, 1, 7, 7, 0F); // Box 63
		bodyModel[37].setRotationPoint(-23F, -3F, -10F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 4, 9, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 64
		bodyModel[38].setRotationPoint(-4F, -4F, -12F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 4, 9, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 65
		bodyModel[39].setRotationPoint(0F, -4F, -12F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, 0F, -1.1F, 0F, 0F, -1.1F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 66
		bodyModel[40].setRotationPoint(0F, -7F, -12F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, 0F, -1.1F, 0F, 0F, -1.1F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 67
		bodyModel[41].setRotationPoint(-4F, -7F, -12F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 4, 4, 3, 0F,0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -2.4F, 0F, 0F, -2.4F); // Box 68
		bodyModel[42].setRotationPoint(0F, -11F, -11F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 4, 4, 3, 0F,0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -2.4F, 0F, 0F, -2.4F); // Box 69
		bodyModel[43].setRotationPoint(-4F, -11F, -11F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 70
		bodyModel[44].setRotationPoint(4F, -7F, -11F);

		bodyModel[45].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 71
		bodyModel[45].setRotationPoint(4F, -4F, -11F);

		bodyModel[46].addBox(0F, 0F, 0F, 20, 5, 1, 0F); // Box 72
		bodyModel[46].setRotationPoint(4F, -1F, -11F);

		bodyModel[47].addBox(0F, 0F, 0F, 20, 5, 1, 0F); // Box 73
		bodyModel[47].setRotationPoint(-24F, -1F, -11F);

		bodyModel[48].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 74
		bodyModel[48].setRotationPoint(-5F, -4F, -11F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 75
		bodyModel[49].setRotationPoint(-5F, -7F, -11F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 19, 3, 1, 0F,0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 76
		bodyModel[50].setRotationPoint(-24F, -7F, -11F);

		bodyModel[51].addBox(0F, 0F, 0F, 19, 3, 1, 0F); // Box 77
		bodyModel[51].setRotationPoint(-24F, -4F, -11F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 19, 3, 1, 0F,0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 78
		bodyModel[52].setRotationPoint(5F, -7F, -11F);

		bodyModel[53].addBox(0F, 0F, 0F, 19, 3, 1, 0F); // Box 79
		bodyModel[53].setRotationPoint(5F, -4F, -11F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 12, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 80
		bodyModel[54].setRotationPoint(-16F, -1F, -10F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 12, 1, 1, 0F,0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 81
		bodyModel[55].setRotationPoint(-16F, 1F, -6F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 12, 1, 4, 0F,0F, -0.6F, -0.5F, 0F, -0.6F, -0.5F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 82
		bodyModel[56].setRotationPoint(-16F, 1F, -10F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 12, 1, 4, 0F,0F, -0.6F, -0.5F, 0F, -0.6F, -0.5F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 83
		bodyModel[57].setRotationPoint(4F, 1F, -10F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 12, 1, 1, 0F,0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 84
		bodyModel[58].setRotationPoint(4F, 1F, -6F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 12, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 85
		bodyModel[59].setRotationPoint(4F, -1F, -10F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 1, 18, 1, 0F,-0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 87
		bodyModel[60].setRotationPoint(-1F, -14F, 0F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 5, 4, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 88
		bodyModel[61].setRotationPoint(16F, 5F, -8F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F,0F, -0.5F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 89
		bodyModel[62].setRotationPoint(21F, 5F, -8F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, -0.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 90
		bodyModel[63].setRotationPoint(10F, 5F, -8F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 91
		bodyModel[64].setRotationPoint(15F, 5F, -8F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 4, 3, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 92
		bodyModel[65].setRotationPoint(11F, 6F, -8F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F,-2F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -2F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 93
		bodyModel[66].setRotationPoint(3F, 5F, -8F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 5, 5, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 94
		bodyModel[67].setRotationPoint(16F, 5F, -7F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 5, 5, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 95
		bodyModel[68].setRotationPoint(5F, 5F, -7F);

		bodyModel[69].addBox(0F, 0F, 0F, 1, 8, 7, 0F); // Box 88
		bodyModel[69].setRotationPoint(-24F, -4F, -10F);

		bodyModel[70].addBox(0F, 0F, 0F, 1, 8, 7, 0F); // Box 90
		bodyModel[70].setRotationPoint(-24F, -4F, 3F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 1, 5, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.8F, 0F, 0F, -3.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 91
		bodyModel[71].setRotationPoint(-24F, -12F, -3289655F);

		bodyModel[72].addBox(0F, 0F, 0F, 1, 8, 7, 0F); // Box 92
		bodyModel[72].setRotationPoint(23F, -4F, 3F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 1, 5, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.8F, 0F, 0F, -3.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 93
		bodyModel[73].setRotationPoint(23F, -12F, 3F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 1, 5, 7, 0F,0F, 0F, -3.8F, 0F, 0F, -3.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 94
		bodyModel[74].setRotationPoint(23F, -12F, -10F);

		bodyModel[75].addBox(0F, 0F, 0F, 1, 1, 18, 0F); // Box 97
		bodyModel[75].setRotationPoint(7F, 7F, -9F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 4, 3, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 106
		bodyModel[76].setRotationPoint(11F, 6F, 6F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 5, 5, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 107
		bodyModel[77].setRotationPoint(5F, 5F, 5F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 5, 5, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 108
		bodyModel[78].setRotationPoint(16F, 5F, 5F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 5, 4, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 109
		bodyModel[79].setRotationPoint(16F, 5F, 7F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 110
		bodyModel[80].setRotationPoint(15F, 5F, 7F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, -0.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 111
		bodyModel[81].setRotationPoint(10F, 5F, 7F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 5, 4, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 112
		bodyModel[82].setRotationPoint(5F, 5F, 7F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F,-2F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -2F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 113
		bodyModel[83].setRotationPoint(3F, 5F, 7F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F,0F, -0.5F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 115
		bodyModel[84].setRotationPoint(21F, 5F, 7F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 116
		bodyModel[85].setRotationPoint(18F, 7F, -9F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 4, 3, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 117
		bodyModel[86].setRotationPoint(-15F, 6F, -8F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F,-2F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -2F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 118
		bodyModel[87].setRotationPoint(-23F, 5F, 7F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 5, 4, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 119
		bodyModel[88].setRotationPoint(-21F, 5F, -8F);

		bodyModel[89].addBox(0F, 0F, 0F, 1, 1, 18, 0F); // Box 120
		bodyModel[89].setRotationPoint(-19F, 7F, -9F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, -0.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 121
		bodyModel[90].setRotationPoint(-16F, 5F, -8F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 123
		bodyModel[91].setRotationPoint(-11F, 5F, -8F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 5, 4, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 124
		bodyModel[92].setRotationPoint(-10F, 5F, -8F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 125
		bodyModel[93].setRotationPoint(-8F, 7F, -9F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F,0F, -0.5F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 126
		bodyModel[94].setRotationPoint(-5F, 5F, -8F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 5, 5, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 127
		bodyModel[95].setRotationPoint(-10F, 5F, -7F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 5, 5, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[96].setRotationPoint(-21F, 5F, -7F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 5, 4, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 129
		bodyModel[97].setRotationPoint(-21F, 5F, 7F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 4, 3, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 130
		bodyModel[98].setRotationPoint(-15F, 6F, 6F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, -0.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 131
		bodyModel[99].setRotationPoint(-16F, 5F, 7F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 5, 4, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 133
		bodyModel[100].setRotationPoint(-10F, 5F, 7F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 134
		bodyModel[101].setRotationPoint(-11F, 5F, 7F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 5, 5, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 135
		bodyModel[102].setRotationPoint(-10F, 5F, 5F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 5, 5, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 136
		bodyModel[103].setRotationPoint(-21F, 5F, 5F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F,0F, -0.5F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 137
		bodyModel[104].setRotationPoint(-5F, 5F, 7F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F,-2F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -2F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 138
		bodyModel[105].setRotationPoint(-23F, 5F, -8F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 139
		bodyModel[106].setRotationPoint(12F, 4F, 6F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 140
		bodyModel[107].setRotationPoint(12F, 4F, -7F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 141
		bodyModel[108].setRotationPoint(-14F, 4F, -7F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 142
		bodyModel[109].setRotationPoint(-14F, 4F, 6F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 1, 5, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.8F, 0F, 0F, -3.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 143
		bodyModel[110].setRotationPoint(-24F, -12F, 3F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 1, 5, 7, 0F,0F, 0F, -3.8F, 0F, 0F, -3.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 144
		bodyModel[111].setRotationPoint(-24F, -12F, -10F);

		bodyModel[112].addBox(0F, 0F, 0F, 1, 3, 7, 0F); // Box 146
		bodyModel[112].setRotationPoint(-24F, -7F, 3F);

		bodyModel[113].addBox(0F, 0F, 0F, 1, 3, 7, 0F); // Box 151
		bodyModel[113].setRotationPoint(-24F, -7F, -10F);

		bodyModel[114].addBox(0F, 0F, 0F, 1, 8, 7, 0F); // Box 153
		bodyModel[114].setRotationPoint(23F, -4F, -10F);

		bodyModel[115].addBox(0F, 0F, 0F, 1, 3, 7, 0F); // Box 154
		bodyModel[115].setRotationPoint(23F, -7F, -10F);

		bodyModel[116].addBox(0F, 0F, 0F, 1, 3, 7, 0F); // Box 155
		bodyModel[116].setRotationPoint(23F, -7F, 3F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 6, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 156
		bodyModel[117].setRotationPoint(-27F, 5F, -1.5F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 4, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 157
		bodyModel[118].setRotationPoint(22F, 5F, -1.5F);

		bodyModel[119].addBox(0F, 0F, 0F, 19, 3, 1, 0F); // Box 122
		bodyModel[119].setRotationPoint(-24F, -4F, -11F);

		bodyModel[120].addBox(0F, 0F, 0F, 1, 7, 7, 0F); // Box 123
		bodyModel[120].setRotationPoint(22F, -3F, 3F);

		bodyModel[121].addBox(0F, 0F, 0F, 1, 7, 7, 0F); // Box 124
		bodyModel[121].setRotationPoint(22F, -3F, -10F);
	}
}