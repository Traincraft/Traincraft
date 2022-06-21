//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2022 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 10.11.2021 - 21:18:24
// Last changed on: 10.11.2021 - 21:18:24
/*
package train.client.render.models; //Path where the model is located

import tmt.ModelConverter;
import tmt.ModelRendererTurbo;
import tmt.Coord2D;
import tmt.Shape2D;

public class ModelFreight7Plank extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelFreight7Plank() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[126];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 35, 198, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 5
		bodyModel[2] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 8
		bodyModel[3] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 9
		bodyModel[4] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 10
		bodyModel[5] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 11
		bodyModel[6] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 12
		bodyModel[7] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 13
		bodyModel[8] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 14
		bodyModel[9] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 15
		bodyModel[10] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 16
		bodyModel[11] = new ModelRendererTurbo(this, 113, 9, textureX, textureY); // Box 21
		bodyModel[12] = new ModelRendererTurbo(this, 145, 9, textureX, textureY); // Box 22
		bodyModel[13] = new ModelRendererTurbo(this, 177, 9, textureX, textureY); // Box 23
		bodyModel[14] = new ModelRendererTurbo(this, 225, 9, textureX, textureY); // Box 24
		bodyModel[15] = new ModelRendererTurbo(this, 273, 9, textureX, textureY); // Box 25
		bodyModel[16] = new ModelRendererTurbo(this, 305, 9, textureX, textureY); // Box 26
		bodyModel[17] = new ModelRendererTurbo(this, 337, 9, textureX, textureY); // Box 27
		bodyModel[18] = new ModelRendererTurbo(this, 369, 9, textureX, textureY); // Box 28
		bodyModel[19] = new ModelRendererTurbo(this, 401, 9, textureX, textureY); // Box 29
		bodyModel[20] = new ModelRendererTurbo(this, 433, 9, textureX, textureY); // Box 30
		bodyModel[21] = new ModelRendererTurbo(this, 465, 9, textureX, textureY); // Box 31
		bodyModel[22] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 34
		bodyModel[23] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 36
		bodyModel[24] = new ModelRendererTurbo(this, 113, 17, textureX, textureY); // Box 38
		bodyModel[25] = new ModelRendererTurbo(this, 145, 17, textureX, textureY); // Box 39
		bodyModel[26] = new ModelRendererTurbo(this, 177, 17, textureX, textureY); // Box 40
		bodyModel[27] = new ModelRendererTurbo(this, 209, 17, textureX, textureY); // Box 41
		bodyModel[28] = new ModelRendererTurbo(this, 241, 17, textureX, textureY); // Box 42
		bodyModel[29] = new ModelRendererTurbo(this, 273, 17, textureX, textureY); // Box 43
		bodyModel[30] = new ModelRendererTurbo(this, 305, 17, textureX, textureY); // Box 44
		bodyModel[31] = new ModelRendererTurbo(this, 337, 17, textureX, textureY); // Box 45
		bodyModel[32] = new ModelRendererTurbo(this, 369, 17, textureX, textureY); // Box 46
		bodyModel[33] = new ModelRendererTurbo(this, 401, 17, textureX, textureY); // Box 47
		bodyModel[34] = new ModelRendererTurbo(this, 433, 17, textureX, textureY); // Box 48
		bodyModel[35] = new ModelRendererTurbo(this, 465, 17, textureX, textureY); // Box 49
		bodyModel[36] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 50
		bodyModel[37] = new ModelRendererTurbo(this, 145, 17, textureX, textureY); // Box 51
		bodyModel[38] = new ModelRendererTurbo(this, 65, 25, textureX, textureY); // Box 52
		bodyModel[39] = new ModelRendererTurbo(this, 114, 25, textureX, textureY); // Box 53
		bodyModel[40] = new ModelRendererTurbo(this, 161, 25, textureX, textureY); // Box 54
		bodyModel[41] = new ModelRendererTurbo(this, 209, 25, textureX, textureY); // Box 55
		bodyModel[42] = new ModelRendererTurbo(this, 257, 25, textureX, textureY); // Box 56
		bodyModel[43] = new ModelRendererTurbo(this, 305, 25, textureX, textureY); // Box 57
		bodyModel[44] = new ModelRendererTurbo(this, 353, 25, textureX, textureY); // Box 58
		bodyModel[45] = new ModelRendererTurbo(this, 401, 25, textureX, textureY); // Box 61
		bodyModel[46] = new ModelRendererTurbo(this, 425, 25, textureX, textureY); // Box 62
		bodyModel[47] = new ModelRendererTurbo(this, 449, 25, textureX, textureY); // Box 63
		bodyModel[48] = new ModelRendererTurbo(this, 473, 25, textureX, textureY); // Box 64
		bodyModel[49] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 65
		bodyModel[50] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Box 66
		bodyModel[51] = new ModelRendererTurbo(this, 49, 33, textureX, textureY); // Box 67
		bodyModel[52] = new ModelRendererTurbo(this, 73, 33, textureX, textureY); // Box 68
		bodyModel[53] = new ModelRendererTurbo(this, 97, 33, textureX, textureY); // Box 69
		bodyModel[54] = new ModelRendererTurbo(this, 121, 33, textureX, textureY); // Box 70
		bodyModel[55] = new ModelRendererTurbo(this, 193, 33, textureX, textureY); // Box 71
		bodyModel[56] = new ModelRendererTurbo(this, 169, 33, textureX, textureY); // Box 72
		bodyModel[57] = new ModelRendererTurbo(this, 193, 33, textureX, textureY); // Box 73
		bodyModel[58] = new ModelRendererTurbo(this, 217, 33, textureX, textureY); // Box 74
		bodyModel[59] = new ModelRendererTurbo(this, 497, 9, textureX, textureY); // Box 76
		bodyModel[60] = new ModelRendererTurbo(this, 505, 9, textureX, textureY); // Box 77
		bodyModel[61] = new ModelRendererTurbo(this, 241, 33, textureX, textureY); // Box 78
		bodyModel[62] = new ModelRendererTurbo(this, 249, 33, textureX, textureY); // Box 79
		bodyModel[63] = new ModelRendererTurbo(this, 257, 33, textureX, textureY); // Box 80
		bodyModel[64] = new ModelRendererTurbo(this, 265, 33, textureX, textureY); // Box 82
		bodyModel[65] = new ModelRendererTurbo(this, 273, 33, textureX, textureY); // Box 83
		bodyModel[66] = new ModelRendererTurbo(this, 281, 33, textureX, textureY); // Box 85
		bodyModel[67] = new ModelRendererTurbo(this, 289, 33, textureX, textureY); // Box 86
		bodyModel[68] = new ModelRendererTurbo(this, 297, 33, textureX, textureY); // Box 87
		bodyModel[69] = new ModelRendererTurbo(this, 305, 33, textureX, textureY); // Box 90
		bodyModel[70] = new ModelRendererTurbo(this, 313, 33, textureX, textureY); // Box 91
		bodyModel[71] = new ModelRendererTurbo(this, 321, 33, textureX, textureY); // Box 92
		bodyModel[72] = new ModelRendererTurbo(this, 329, 33, textureX, textureY); // Box 93
		bodyModel[73] = new ModelRendererTurbo(this, 337, 33, textureX, textureY); // Box 94
		bodyModel[74] = new ModelRendererTurbo(this, 345, 33, textureX, textureY); // Box 95
		bodyModel[75] = new ModelRendererTurbo(this, 353, 33, textureX, textureY); // Box 96
		bodyModel[76] = new ModelRendererTurbo(this, 401, 33, textureX, textureY); // Box 97
		bodyModel[77] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 98
		bodyModel[78] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 99
		bodyModel[79] = new ModelRendererTurbo(this, 449, 33, textureX, textureY); // Box 100
		bodyModel[80] = new ModelRendererTurbo(this, 457, 33, textureX, textureY); // Box 101
		bodyModel[81] = new ModelRendererTurbo(this, 465, 33, textureX, textureY); // Box 102
		bodyModel[82] = new ModelRendererTurbo(this, 473, 33, textureX, textureY); // Box 103
		bodyModel[83] = new ModelRendererTurbo(this, 481, 33, textureX, textureY); // Box 104
		bodyModel[84] = new ModelRendererTurbo(this, 489, 33, textureX, textureY); // Box 105
		bodyModel[85] = new ModelRendererTurbo(this, 497, 33, textureX, textureY); // Box 106
		bodyModel[86] = new ModelRendererTurbo(this, 505, 33, textureX, textureY); // Box 107
		bodyModel[87] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 108
		bodyModel[88] = new ModelRendererTurbo(this, 9, 41, textureX, textureY); // Box 109
		bodyModel[89] = new ModelRendererTurbo(this, 17, 41, textureX, textureY); // Box 110
		bodyModel[90] = new ModelRendererTurbo(this, 25, 41, textureX, textureY); // Box 111
		bodyModel[91] = new ModelRendererTurbo(this, 33, 41, textureX, textureY); // Box 112
		bodyModel[92] = new ModelRendererTurbo(this, 41, 41, textureX, textureY); // Box 113
		bodyModel[93] = new ModelRendererTurbo(this, 49, 41, textureX, textureY); // Box 114
		bodyModel[94] = new ModelRendererTurbo(this, 57, 41, textureX, textureY); // Box 115
		bodyModel[95] = new ModelRendererTurbo(this, 65, 41, textureX, textureY); // Box 116
		bodyModel[96] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 117
		bodyModel[97] = new ModelRendererTurbo(this, 73, 41, textureX, textureY); // Box 118
		bodyModel[98] = new ModelRendererTurbo(this, 81, 41, textureX, textureY); // Box 119
		bodyModel[99] = new ModelRendererTurbo(this, 89, 41, textureX, textureY); // Box 120
		bodyModel[100] = new ModelRendererTurbo(this, 121, 41, textureX, textureY); // Box 121
		bodyModel[101] = new ModelRendererTurbo(this, 153, 41, textureX, textureY); // Box 122
		bodyModel[102] = new ModelRendererTurbo(this, 201, 41, textureX, textureY); // Box 123
		bodyModel[103] = new ModelRendererTurbo(this, 353, 41, textureX, textureY); // Box 103
		bodyModel[104] = new ModelRendererTurbo(this, 401, 41, textureX, textureY); // Box 104
		bodyModel[105] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 105
		bodyModel[106] = new ModelRendererTurbo(this, 385, 33, textureX, textureY); // Box 106
		bodyModel[107] = new ModelRendererTurbo(this, 209, 41, textureX, textureY); // Box 107
		bodyModel[108] = new ModelRendererTurbo(this, 449, 41, textureX, textureY); // Box 108
		bodyModel[109] = new ModelRendererTurbo(this, 33, 49, textureX, textureY); // Box 109
		bodyModel[110] = new ModelRendererTurbo(this, 89, 49, textureX, textureY); // Box 110
		bodyModel[111] = new ModelRendererTurbo(this, 113, 49, textureX, textureY); // Shape 112
		bodyModel[112] = new ModelRendererTurbo(this, 129, 49, textureX, textureY); // Shape 113
		bodyModel[113] = new ModelRendererTurbo(this, 145, 49, textureX, textureY); // Shape 114
		bodyModel[114] = new ModelRendererTurbo(this, 161, 49, textureX, textureY); // Shape 115
		bodyModel[115] = new ModelRendererTurbo(this, 180, 49, textureX, textureY); // Shape 116
		bodyModel[116] = new ModelRendererTurbo(this, 305, 49, textureX, textureY); // Shape 117
		bodyModel[117] = new ModelRendererTurbo(this, 353, 49, textureX, textureY); // Shape 118
		bodyModel[118] = new ModelRendererTurbo(this, 377, 49, textureX, textureY); // Shape 119
		bodyModel[119] = new ModelRendererTurbo(this, 34, 52, textureX, textureY); // Box 121
		bodyModel[120] = new ModelRendererTurbo(this, 34, 52, textureX, textureY); // Box 122
		bodyModel[121] = new ModelRendererTurbo(this, 90, 52, textureX, textureY); // Box 123
		bodyModel[122] = new ModelRendererTurbo(this, 35, 52, textureX, textureY); // Box 124
		bodyModel[123] = new ModelRendererTurbo(this, 35, 52, textureX, textureY); // Box 125
		bodyModel[124] = new ModelRendererTurbo(this, 34, 52, textureX, textureY); // Box 126
		bodyModel[125] = new ModelRendererTurbo(this, 40, 200, textureX, textureY); // Box 127

		bodyModel[0].addBox(0F, 0F, 0F, 42, 1, 22, 0F); // Box 0
		bodyModel[0].setRotationPoint(0F, -3F, -13F);

		bodyModel[1].addBox(0F, 0F, 0F, 14, 2, 1, 0F); // Box 5
		bodyModel[1].setRotationPoint(1F, -7.25F, 8F);

		bodyModel[2].addBox(0F, 0F, 0F, 20, 2, 1, 0F); // Box 8
		bodyModel[2].setRotationPoint(0F, -5F, 8F);
		bodyModel[2].rotateAngleY = -1.57079633F;

		bodyModel[3].addBox(0F, 0F, 0F, 14, 2, 1, 0F); // Box 9
		bodyModel[3].setRotationPoint(1F, -5F, 8F);

		bodyModel[4].addBox(0F, 0F, 0F, 20, 2, 1, 0F); // Box 10
		bodyModel[4].setRotationPoint(0F, -7.25F, 8F);
		bodyModel[4].rotateAngleY = -1.57079633F;

		bodyModel[5].addBox(0F, 0F, 0F, 20, 2, 1, 0F); // Box 11
		bodyModel[5].setRotationPoint(0F, -9.5F, 8F);
		bodyModel[5].rotateAngleY = -1.57079633F;

		bodyModel[6].addBox(0F, 0F, 0F, 14, 2, 1, 0F); // Box 12
		bodyModel[6].setRotationPoint(1F, -9.5F, 8F);

		bodyModel[7].addBox(0F, 0F, 0F, 20, 2, 1, 0F); // Box 13
		bodyModel[7].setRotationPoint(0F, -14F, 8F);
		bodyModel[7].rotateAngleY = -1.57079633F;

		bodyModel[8].addBox(0F, 0F, 0F, 14, 2, 1, 0F); // Box 14
		bodyModel[8].setRotationPoint(1F, -14F, 8F);

		bodyModel[9].addBox(0F, 0F, 0F, 14, 2, 1, 0F); // Box 15
		bodyModel[9].setRotationPoint(1F, -11.75F, 8F);

		bodyModel[10].addBox(0F, 0F, 0F, 20, 2, 1, 0F); // Box 16
		bodyModel[10].setRotationPoint(0F, -11.75F, 8F);
		bodyModel[10].rotateAngleY = -1.57079633F;

		bodyModel[11].addBox(0F, 0F, 0F, 14, 2, 1, 0F); // Box 21
		bodyModel[11].setRotationPoint(1F, -18.5F, 8F);

		bodyModel[12].addBox(0F, 0F, 0F, 14, 2, 1, 0F); // Box 22
		bodyModel[12].setRotationPoint(1F, -16.25F, 8F);

		bodyModel[13].addBox(0F, 0F, 0F, 20, 2, 1, 0F); // Box 23
		bodyModel[13].setRotationPoint(0F, -18.5F, 8F);
		bodyModel[13].rotateAngleY = -1.57079633F;

		bodyModel[14].addBox(0F, 0F, 0F, 20, 2, 1, 0F); // Box 24
		bodyModel[14].setRotationPoint(0F, -16.25F, 8F);
		bodyModel[14].rotateAngleY = -1.57079633F;

		bodyModel[15].addBox(0F, 0F, 0F, 14, 2, 1, 0F); // Box 25
		bodyModel[15].setRotationPoint(1F, -18.5F, -13F);

		bodyModel[16].addBox(0F, 0F, 0F, 14, 2, 1, 0F); // Box 26
		bodyModel[16].setRotationPoint(1F, -16.25F, -13F);

		bodyModel[17].addBox(0F, 0F, 0F, 14, 2, 1, 0F); // Box 27
		bodyModel[17].setRotationPoint(1F, -14F, -13F);

		bodyModel[18].addBox(0F, 0F, 0F, 14, 2, 1, 0F); // Box 28
		bodyModel[18].setRotationPoint(1F, -9.5F, -13F);

		bodyModel[19].addBox(0F, 0F, 0F, 14, 2, 1, 0F); // Box 29
		bodyModel[19].setRotationPoint(1F, -11.75F, -13F);

		bodyModel[20].addBox(0F, 0F, 0F, 14, 2, 1, 0F); // Box 30
		bodyModel[20].setRotationPoint(1F, -7.25F, -13F);

		bodyModel[21].addBox(0F, 0F, 0F, 14, 2, 1, 0F); // Box 31
		bodyModel[21].setRotationPoint(1F, -5F, -13F);

		bodyModel[22].addBox(0F, 0F, 0F, 1, 16, 2, 0F); // Box 34
		bodyModel[22].setRotationPoint(41F, -19F, 7.25F);

		bodyModel[23].addBox(0F, 0F, 0F, 1, 16, 2, 0F); // Box 36
		bodyModel[23].setRotationPoint(26F, -19F, 7.25F);

		bodyModel[24].addBox(0F, 0F, 0F, 14, 2, 1, 0F); // Box 38
		bodyModel[24].setRotationPoint(27F, -18.5F, 8F);

		bodyModel[25].addBox(0F, 0F, 0F, 14, 2, 1, 0F); // Box 39
		bodyModel[25].setRotationPoint(27F, -16.25F, 8F);

		bodyModel[26].addBox(0F, 0F, 0F, 14, 2, 1, 0F); // Box 40
		bodyModel[26].setRotationPoint(27F, -14F, 8F);

		bodyModel[27].addBox(0F, 0F, 0F, 14, 2, 1, 0F); // Box 41
		bodyModel[27].setRotationPoint(27F, -11.75F, 8F);

		bodyModel[28].addBox(0F, 0F, 0F, 14, 2, 1, 0F); // Box 42
		bodyModel[28].setRotationPoint(27F, -9.5F, 8F);

		bodyModel[29].addBox(0F, 0F, 0F, 14, 2, 1, 0F); // Box 43
		bodyModel[29].setRotationPoint(27F, -7.25F, 8F);

		bodyModel[30].addBox(0F, 0F, 0F, 14, 2, 1, 0F); // Box 44
		bodyModel[30].setRotationPoint(27F, -5F, 8F);

		bodyModel[31].addBox(0F, 0F, 0F, 14, 2, 1, 0F); // Box 45
		bodyModel[31].setRotationPoint(27F, -18.5F, -13F);

		bodyModel[32].addBox(0F, 0F, 0F, 14, 2, 1, 0F); // Box 46
		bodyModel[32].setRotationPoint(27F, -14F, -13F);

		bodyModel[33].addBox(0F, 0F, 0F, 14, 2, 1, 0F); // Box 47
		bodyModel[33].setRotationPoint(27F, -16.25F, -13F);

		bodyModel[34].addBox(0F, 0F, 0F, 14, 2, 1, 0F); // Box 48
		bodyModel[34].setRotationPoint(27F, -11.75F, -13F);

		bodyModel[35].addBox(0F, 0F, 0F, 14, 2, 1, 0F); // Box 49
		bodyModel[35].setRotationPoint(27F, -9.5F, -13F);

		bodyModel[36].addBox(0F, 0F, 0F, 14, 2, 1, 0F); // Box 50
		bodyModel[36].setRotationPoint(27F, -7.25F, -13F);

		bodyModel[37].addBox(0F, 0F, 0F, 14, 2, 1, 0F); // Box 51
		bodyModel[37].setRotationPoint(27F, -5F, -13F);

		bodyModel[38].addBox(0F, 0F, 0F, 20, 2, 1, 0F); // Box 52
		bodyModel[38].setRotationPoint(41F, -18.5F, 8F);
		bodyModel[38].rotateAngleY = -1.57079633F;

		bodyModel[39].addBox(0F, 0F, 0F, 20, 2, 1, 0F); // Box 53
		bodyModel[39].setRotationPoint(41F, -16.25F, 8F);
		bodyModel[39].rotateAngleY = -1.57079633F;

		bodyModel[40].addBox(0F, 0F, 0F, 20, 2, 1, 0F); // Box 54
		bodyModel[40].setRotationPoint(41F, -14F, 8F);
		bodyModel[40].rotateAngleY = -1.57079633F;

		bodyModel[41].addBox(0F, 0F, 0F, 20, 2, 1, 0F); // Box 55
		bodyModel[41].setRotationPoint(41F, -11.75F, 8F);
		bodyModel[41].rotateAngleY = -1.57079633F;

		bodyModel[42].addBox(0F, 0F, 0F, 20, 2, 1, 0F); // Box 56
		bodyModel[42].setRotationPoint(41F, -9.5F, 8F);
		bodyModel[42].rotateAngleY = -1.57079633F;

		bodyModel[43].addBox(0F, 0F, 0F, 20, 2, 1, 0F); // Box 57
		bodyModel[43].setRotationPoint(41F, -7.25F, 8F);
		bodyModel[43].rotateAngleY = -1.57079633F;

		bodyModel[44].addBox(0F, 0F, 0F, 20, 2, 1, 0F); // Box 58
		bodyModel[44].setRotationPoint(41F, -5F, 8F);
		bodyModel[44].rotateAngleY = -1.57079633F;

		bodyModel[45].addBox(0F, 0F, 0F, 10, 2, 1, 0F); // Box 61
		bodyModel[45].setRotationPoint(16F, -18.5F, 8F);

		bodyModel[46].addBox(0F, 0F, 0F, 10, 2, 1, 0F); // Box 62
		bodyModel[46].setRotationPoint(16F, -16.25F, 8F);

		bodyModel[47].addBox(0F, 0F, 0F, 10, 2, 1, 0F); // Box 63
		bodyModel[47].setRotationPoint(16F, -14F, 8F);

		bodyModel[48].addBox(0F, 0F, 0F, 10, 2, 1, 0F); // Box 64
		bodyModel[48].setRotationPoint(16F, -7.25F, 8F);

		bodyModel[49].addBox(0F, 0F, 0F, 10, 2, 1, 0F); // Box 65
		bodyModel[49].setRotationPoint(16F, -5F, 8F);

		bodyModel[50].addBox(0F, 0F, 0F, 10, 2, 1, 0F); // Box 66
		bodyModel[50].setRotationPoint(16F, -9.5F, 8F);

		bodyModel[51].addBox(0F, 0F, 0F, 10, 2, 1, 0F); // Box 67
		bodyModel[51].setRotationPoint(16F, -11.75F, 8F);

		bodyModel[52].addBox(0F, 0F, 0F, 10, 2, 1, 0F); // Box 68
		bodyModel[52].setRotationPoint(16F, -18.5F, -13F);

		bodyModel[53].addBox(0F, 0F, 0F, 10, 2, 1, 0F); // Box 69
		bodyModel[53].setRotationPoint(16F, -16.25F, -13F);

		bodyModel[54].addBox(0F, 0F, 0F, 10, 2, 1, 0F); // Box 70
		bodyModel[54].setRotationPoint(16F, -14F, -13F);

		bodyModel[55].addBox(0F, 0F, 0F, 10, 2, 1, 0F); // Box 71
		bodyModel[55].setRotationPoint(16F, -11.75F, -13F);

		bodyModel[56].addBox(0F, 0F, 0F, 10, 2, 1, 0F); // Box 72
		bodyModel[56].setRotationPoint(16F, -9.5F, -13F);

		bodyModel[57].addBox(0F, 0F, 0F, 10, 2, 1, 0F); // Box 73
		bodyModel[57].setRotationPoint(16F, -7.25F, -13F);

		bodyModel[58].addBox(0F, 0F, 0F, 10, 2, 1, 0F); // Box 74
		bodyModel[58].setRotationPoint(16F, -5F, -13F);

		bodyModel[59].addBox(0F, 0F, 0F, 1, 21, 2, 0F); // Box 76
		bodyModel[59].setRotationPoint(41F, -19F, 7.25F);
		bodyModel[59].rotateAngleZ = -0.78539816F;

		bodyModel[60].addBox(0F, 0F, 0F, 1, 16, 2, 0F); // Box 77
		bodyModel[60].setRotationPoint(41F, -19F, -13.25F);

		bodyModel[61].addBox(0F, 0F, 0F, 1, 21, 2, 0F); // Box 78
		bodyModel[61].setRotationPoint(41F, -19F, -13.25F);
		bodyModel[61].rotateAngleZ = -0.78539816F;

		bodyModel[62].addBox(0F, 0F, 0F, 1, 16, 2, 0F); // Box 79
		bodyModel[62].setRotationPoint(26F, -19F, -13.25F);

		bodyModel[63].addBox(0F, 0F, 0F, 1, 16, 2, 0F); // Box 80
		bodyModel[63].setRotationPoint(15F, -19F, -13.25F);

		bodyModel[64].addBox(0F, 0F, 0F, 1, 16, 2, 0F); // Box 82
		bodyModel[64].setRotationPoint(-0.25F, -19F, -13.25F);

		bodyModel[65].addBox(0F, 0F, 0F, 1, 16, 2, 0F); // Box 83
		bodyModel[65].setRotationPoint(-0.25F, -19F, 7.25F);

		bodyModel[66].addBox(0F, 0F, 0F, 1, 16, 2, 0F); // Box 85
		bodyModel[66].setRotationPoint(15F, -19F, 7.25F);

		bodyModel[67].addBox(0F, 0F, 0F, 1, 21, 2, 0F); // Box 86
		bodyModel[67].setRotationPoint(0F, -18F, -13.25F);
		bodyModel[67].rotateAngleZ = 0.78539816F;

		bodyModel[68].addBox(0F, 0F, 0F, 1, 21, 2, 0F); // Box 87
		bodyModel[68].setRotationPoint(0F, -18F, 7.25F);
		bodyModel[68].rotateAngleZ = 0.78539816F;

		bodyModel[69].addBox(0F, 0F, 0F, 1, 8, 2, 0F); // Box 90
		bodyModel[69].setRotationPoint(18F, -11F, 7.25F);

		bodyModel[70].addBox(0F, 0F, 0F, 1, 8, 2, 0F); // Box 91
		bodyModel[70].setRotationPoint(18F, -11F, -13.25F);

		bodyModel[71].addBox(0F, 0F, 0F, 1, 8, 2, 0F); // Box 92
		bodyModel[71].setRotationPoint(23F, -11F, 7.25F);

		bodyModel[72].addBox(0F, 0F, 0F, 1, 8, 2, 0F); // Box 93
		bodyModel[72].setRotationPoint(23F, -11F, -13.25F);

		bodyModel[73].addBox(0F, 0F, 0F, 1, 16, 2, 0F); // Box 94
		bodyModel[73].setRotationPoint(-0.75F, -19F, -1.5F);
		bodyModel[73].rotateAngleY = -1.57079633F;

		bodyModel[74].addBox(0F, 0F, 0F, 1, 16, 2, 0F); // Box 95
		bodyModel[74].setRotationPoint(40.75F, -19F, -1.5F);
		bodyModel[74].rotateAngleY = -1.57079633F;

		bodyModel[75].addBox(0F, 0F, 0F, 20, 3, 1, 0F); // Box 96
		bodyModel[75].setRotationPoint(41.5F, -8F, 8F);
		bodyModel[75].rotateAngleY = -1.57079633F;

		bodyModel[76].addBox(0F, 0F, 0F, 20, 3, 1, 0F); // Box 97
		bodyModel[76].setRotationPoint(-0.45F, -8F, 8F);
		bodyModel[76].rotateAngleY = -1.57079633F;

		bodyModel[77].addBox(0F, 0F, 0F, 1, 5, 1, 0F); // Box 98
		bodyModel[77].setRotationPoint(20.5F, -2F, 5.25F);

		bodyModel[78].addBox(0F, 0F, 0F, 1, 5, 1, 0F); // Box 99
		bodyModel[78].setRotationPoint(20.5F, -2F, -10.25F);

		bodyModel[79].addBox(0F, 0F, 0F, 1, 5, 1, 0F); // Box 100
		bodyModel[79].setRotationPoint(18.5F, -2F, -10.25F);
		bodyModel[79].rotateAngleZ = 0.43633231F;

		bodyModel[80].addBox(0F, 0F, 0F, 1, 5, 1, 0F); // Box 101
		bodyModel[80].setRotationPoint(18.5F, -2F, 5.25F);
		bodyModel[80].rotateAngleZ = 0.43633231F;

		bodyModel[81].addBox(0F, 0F, 0F, 1, 5, 1, 0F); // Box 102
		bodyModel[81].setRotationPoint(22.75F, -2.25F, -10.25F);
		bodyModel[81].rotateAngleZ = -0.43633231F;

		bodyModel[82].addBox(0F, 0F, 0F, 1, 5, 1, 0F); // Box 103
		bodyModel[82].setRotationPoint(22.75F, -2.25F, 5.25F);
		bodyModel[82].rotateAngleZ = -0.43633231F;

		bodyModel[83].addBox(0F, 0F, 0F, 1, 10, 2, 0F); // Box 104
		bodyModel[83].setRotationPoint(0F, -3F, -11.25F);
		bodyModel[83].rotateAngleZ = 0.78539816F;

		bodyModel[84].addBox(0F, 0F, 0F, 1, 10, 2, 0F); // Box 105
		bodyModel[84].setRotationPoint(0F, -3F, 5.25F);
		bodyModel[84].rotateAngleZ = 0.78539816F;

		bodyModel[85].addBox(0F, 0F, 0F, 1, 11, 2, 0F); // Box 106
		bodyModel[85].setRotationPoint(15F, -4F, -11.25F);
		bodyModel[85].rotateAngleZ = -0.78539816F;

		bodyModel[86].addBox(0F, 0F, 0F, 1, 11, 2, 0F); // Box 107
		bodyModel[86].setRotationPoint(15F, -4F, 5.25F);
		bodyModel[86].rotateAngleZ = -0.78539816F;

		bodyModel[87].addBox(0F, 0F, 0F, 1, 11, 2, 0F); // Box 108
		bodyModel[87].setRotationPoint(41F, -4F, -11.25F);
		bodyModel[87].rotateAngleZ = -0.78539816F;

		bodyModel[88].addBox(0F, 0F, 0F, 1, 11, 2, 0F); // Box 109
		bodyModel[88].setRotationPoint(41F, -4F, 5.25F);
		bodyModel[88].rotateAngleZ = -0.78539816F;

		bodyModel[89].addBox(0F, 0F, 0F, 1, 10, 2, 0F); // Box 110
		bodyModel[89].setRotationPoint(26F, -3F, -11.25F);
		bodyModel[89].rotateAngleZ = 0.78539816F;

		bodyModel[90].addBox(0F, 0F, 0F, 1, 10, 2, 0F); // Box 111
		bodyModel[90].setRotationPoint(26F, -3F, 5.25F);
		bodyModel[90].rotateAngleZ = 0.78539816F;

		bodyModel[91].addBox(0F, 0F, 0F, 1, 6, 1, 0F); // Box 112
		bodyModel[91].setRotationPoint(7F, -2F, 5.25F);

		bodyModel[92].addBox(0F, 0F, 0F, 1, 6, 1, 0F); // Box 113
		bodyModel[92].setRotationPoint(7F, -2F, -10.25F);

		bodyModel[93].addBox(0F, 0F, 0F, 1, 6, 1, 0F); // Box 114
		bodyModel[93].setRotationPoint(33F, -2F, 5.25F);

		bodyModel[94].addBox(0F, 0F, 0F, 1, 6, 1, 0F); // Box 115
		bodyModel[94].setRotationPoint(33F, -2F, -10.25F);

		bodyModel[95].addBox(0F, 0F, 0F, 1, 12, 1, 0F); // Box 116
		bodyModel[95].setRotationPoint(18.5F, 1F, 5.25F);
		bodyModel[95].rotateAngleZ = -1.37881011F;

		bodyModel[96].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 117
		bodyModel[96].setRotationPoint(17.5F, -2F, 5.25F);

		bodyModel[97].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 118
		bodyModel[97].setRotationPoint(23.5F, -2F, -10.75F);

		bodyModel[98].addBox(0F, 0F, 0F, 1, 12, 1, 0F); // Box 119
		bodyModel[98].setRotationPoint(23.5F, 2F, -10.75F);
		bodyModel[98].rotateAngleZ = 1.36135682F;

		bodyModel[99].addBox(0F, 0F, 0F, 13, 1, 1, 0F); // Box 120
		bodyModel[99].setRotationPoint(21F, 2F, 5F);
		bodyModel[99].rotateAngleZ = -0.08726646F;

		bodyModel[100].addBox(0F, 0F, 0F, 13, 1, 1, 0F); // Box 121
		bodyModel[100].setRotationPoint(8F, 3F, -10F);
		bodyModel[100].rotateAngleZ = 0.08726646F;

		bodyModel[101].addBox(0F, 0F, 0F, 20, 1, 1, 0F); // Box 122
		bodyModel[101].setRotationPoint(8F, 4F, -10F);

		bodyModel[102].addBox(0F, 0F, 0F, 1, 6, 1, 0F); // Box 123
		bodyModel[102].setRotationPoint(26.5F, -2F, -10.75F);

		bodyModel[103].addBox(0F, 0F, 0F, 20, 2, 1, 0F); // Box 103
		bodyModel[103].setRotationPoint(41F, -2F, 8F);
		bodyModel[103].rotateAngleY = -1.57079633F;

		bodyModel[104].addBox(0F, 0F, 0F, 20, 2, 1, 0F); // Box 104
		bodyModel[104].setRotationPoint(0F, -2F, 8F);
		bodyModel[104].rotateAngleY = -1.57079633F;

		bodyModel[105].addBox(0F, 0F, 0F, 1, 1, 12, 0F); // Box 105
		bodyModel[105].setRotationPoint(7F, 3F, -8F);

		bodyModel[106].addBox(0F, 0F, 0F, 1, 1, 12, 0F); // Box 106
		bodyModel[106].setRotationPoint(33F, 3F, -8F);

		bodyModel[107].addBox(0F, 0F, 0F, 7, 7, 1, 0F); // Box 107
		bodyModel[107].setRotationPoint(4F, 0F, -9F);

		bodyModel[108].addBox(0F, 0F, 0F, 7, 7, 1, 0F); // Box 108
		bodyModel[108].setRotationPoint(4F, 0F, 4F);

		bodyModel[109].addBox(0F, 0F, 0F, 7, 7, 1, 0F); // Box 109
		bodyModel[109].setRotationPoint(30F, 0F, 4F);

		bodyModel[110].addBox(0F, 0F, 0F, 7, 7, 1, 0F); // Box 110
		bodyModel[110].setRotationPoint(30F, 0F, -9F);

		bodyModel[111].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(6, 0, 6, 0), new Coord2D(7, 1, 7, 1), new Coord2D(7, 2, 7, 2), new Coord2D(6, 3, 6, 3), new Coord2D(5, 3, 5, 3), new Coord2D(4, 2, 4, 2), new Coord2D(4, 1, 4, 1), new Coord2D(5, 0, 5, 0) }), 2, 3, 3, 12, 2, ModelRendererTurbo.MR_FRONT, new float[] {1 ,2 ,1 ,2 ,1 ,2 ,1 ,2}); // Shape 112
		bodyModel[111].setRotationPoint(0F, 0F, -15F);
		bodyModel[111].rotateAngleY = -1.57079633F;

		bodyModel[112].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(6, 0, 6, 0), new Coord2D(7, 1, 7, 1), new Coord2D(7, 2, 7, 2), new Coord2D(6, 3, 6, 3), new Coord2D(5, 3, 5, 3), new Coord2D(4, 2, 4, 2), new Coord2D(4, 1, 4, 1), new Coord2D(5, 0, 5, 0) }), 2, 3, 3, 12, 2, ModelRendererTurbo.MR_FRONT, new float[] {1 ,2 ,1 ,2 ,1 ,2 ,1 ,2}); // Shape 113
		bodyModel[112].setRotationPoint(0F, 0F, 0F);
		bodyModel[112].rotateAngleY = -1.57079633F;

		bodyModel[113].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(6, 0, 6, 0), new Coord2D(7, 1, 7, 1), new Coord2D(7, 2, 7, 2), new Coord2D(6, 3, 6, 3), new Coord2D(5, 3, 5, 3), new Coord2D(4, 2, 4, 2), new Coord2D(4, 1, 4, 1), new Coord2D(5, 0, 5, 0) }), 2, 3, 3, 12, 2, ModelRendererTurbo.MR_FRONT, new float[] {1 ,2 ,1 ,2 ,1 ,2 ,1 ,2}); // Shape 114
		bodyModel[113].setRotationPoint(44F, 0F, 0F);
		bodyModel[113].rotateAngleY = -1.57079633F;

		bodyModel[114].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(6, 0, 6, 0), new Coord2D(7, 1, 7, 1), new Coord2D(7, 2, 7, 2), new Coord2D(6, 3, 6, 3), new Coord2D(5, 3, 5, 3), new Coord2D(4, 2, 4, 2), new Coord2D(4, 1, 4, 1), new Coord2D(5, 0, 5, 0) }), 2, 3, 3, 12, 2, ModelRendererTurbo.MR_FRONT, new float[] {1 ,2 ,1 ,2 ,1 ,2 ,1 ,2}); // Shape 115
		bodyModel[114].setRotationPoint(44F, 0F, -15F);
		bodyModel[114].rotateAngleY = -1.57079633F;

		bodyModel[115].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(6, 0, 6, 0), new Coord2D(8, 2, 8, 2), new Coord2D(8, 4, 8, 4), new Coord2D(6, 6, 6, 6), new Coord2D(4, 6, 4, 6), new Coord2D(2, 4, 2, 4), new Coord2D(2, 2, 2, 2), new Coord2D(4, 0, 4, 0) }), 1, 8, 6, 20, 1, ModelRendererTurbo.MR_FRONT, new float[] {2 ,3 ,2 ,3 ,2 ,3 ,2 ,3}); // Shape 116
		bodyModel[115].setRotationPoint(-2F, 1.5F, -14.5F);
		bodyModel[115].rotateAngleY = -1.57079633F;

		bodyModel[116].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(6, 0, 6, 0), new Coord2D(8, 2, 8, 2), new Coord2D(8, 4, 8, 4), new Coord2D(6, 6, 6, 6), new Coord2D(4, 6, 4, 6), new Coord2D(2, 4, 2, 4), new Coord2D(2, 2, 2, 2), new Coord2D(4, 0, 4, 0) }), 1, 8, 6, 20, 1, ModelRendererTurbo.MR_FRONT, new float[] {2 ,3 ,2 ,3 ,2 ,3 ,2 ,3}); // Shape 117
		bodyModel[116].setRotationPoint(-2F, 1.5F, 0.5F);
		bodyModel[116].rotateAngleY = -1.57079633F;

		bodyModel[117].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(6, 0, 6, 0), new Coord2D(8, 2, 8, 2), new Coord2D(8, 4, 8, 4), new Coord2D(6, 6, 6, 6), new Coord2D(4, 6, 4, 6), new Coord2D(2, 4, 2, 4), new Coord2D(2, 2, 2, 2), new Coord2D(4, 0, 4, 0) }), 1, 8, 6, 20, 1, ModelRendererTurbo.MR_FRONT, new float[] {2 ,3 ,2 ,3 ,2 ,3 ,2 ,3}); // Shape 118
		bodyModel[117].setRotationPoint(45F, 1.5F, 0.5F);
		bodyModel[117].rotateAngleY = -1.57079633F;

		bodyModel[118].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(6, 0, 6, 0), new Coord2D(8, 2, 8, 2), new Coord2D(8, 4, 8, 4), new Coord2D(6, 6, 6, 6), new Coord2D(4, 6, 4, 6), new Coord2D(2, 4, 2, 4), new Coord2D(2, 2, 2, 2), new Coord2D(4, 0, 4, 0) }), 1, 8, 6, 20, 1, ModelRendererTurbo.MR_FRONT, new float[] {2 ,3 ,2 ,3 ,2 ,3 ,2 ,3}); // Shape 119
		bodyModel[118].setRotationPoint(45F, 1.5F, -14.5F);
		bodyModel[118].rotateAngleY = -1.57079633F;

		bodyModel[119].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 121
		bodyModel[119].setRotationPoint(-1F, -3F, -3F);

		bodyModel[120].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 122
		bodyModel[120].setRotationPoint(-2F, -2F, -3F);

		bodyModel[121].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 123
		bodyModel[121].setRotationPoint(-3F, -3F, -3F);

		bodyModel[122].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 124
		bodyModel[122].setRotationPoint(42F, -3F, -3F);

		bodyModel[123].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 125
		bodyModel[123].setRotationPoint(44F, -3F, -3F);

		bodyModel[124].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 126
		bodyModel[124].setRotationPoint(43F, -2F, -3F);

		bodyModel[125].addBox(0F, 0F, 0F, 40, 1, 20, 0F); // Box 127
		bodyModel[125].setRotationPoint(1F, -4F, -12F);
	}
}
*/
