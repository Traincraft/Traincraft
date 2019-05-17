//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2019 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: FT17
// Model Creator: AobaKuma
// Created on: 12.11.2016 - 17:21:28
// Last changed on: 12.11.2016 - 17:21:28

package train.client.render.models; //Path where the model is located

import tmt.Coord2D;
import tmt.ModelConverter;
import tmt.ModelRendererTurbo;
import tmt.Shape2D;


public class ModelFT17 extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelFT17() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[123];
		turretModel = new ModelRendererTurbo[5];
		barrelModel = new ModelRendererTurbo[3];
		leftTrackWheelModels = new ModelRendererTurbo[17];
		rightTrackWheelModels = new ModelRendererTurbo[17];
		leftTrackModel = new ModelRendererTurbo[31];
		rightTrackModel = new ModelRendererTurbo[31];

		initbodyModel_1();
		initturretModel_1();
		initbarrelModel_1();
		initleftTrackWheelModels_1();
		initrightTrackWheelModels_1();
		initleftTrackModel_1();
		initrightTrackModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 4, 110, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 1
		bodyModel[2] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 2
		bodyModel[3] = new ModelRendererTurbo(this, 419, 89, textureX, textureY); // Box 3
		bodyModel[4] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 4
		bodyModel[5] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 5
		bodyModel[6] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 6
		bodyModel[7] = new ModelRendererTurbo(this, 41, 2, textureX, textureY); // Box 7
		bodyModel[8] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 8
		bodyModel[9] = new ModelRendererTurbo(this, 46, 10, textureX, textureY); // Box 9
		bodyModel[10] = new ModelRendererTurbo(this, 212, 62, textureX, textureY); // Box 10
		bodyModel[11] = new ModelRendererTurbo(this, 187, 62, textureX, textureY); // Box 11
		bodyModel[12] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 13
		bodyModel[13] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 14
		bodyModel[14] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 15
		bodyModel[15] = new ModelRendererTurbo(this, 449, 17, textureX, textureY); // Box 16
		bodyModel[16] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 17
		bodyModel[17] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 18
		bodyModel[18] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 19
		bodyModel[19] = new ModelRendererTurbo(this, 337, 33, textureX, textureY); // Box 20
		bodyModel[20] = new ModelRendererTurbo(this, 337, 9, textureX, textureY); // Box 21
		bodyModel[21] = new ModelRendererTurbo(this, 265, 33, textureX, textureY); // Box 22
		bodyModel[22] = new ModelRendererTurbo(this, 221, 3, textureX, textureY); // Box 23
		bodyModel[23] = new ModelRendererTurbo(this, 385, 33, textureX, textureY); // Box 24
		bodyModel[24] = new ModelRendererTurbo(this, 425, 33, textureX, textureY); // Box 25
		bodyModel[25] = new ModelRendererTurbo(this, 457, 33, textureX, textureY); // Box 28
		bodyModel[26] = new ModelRendererTurbo(this, 201, 41, textureX, textureY); // Box 29
		bodyModel[27] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 31
		bodyModel[28] = new ModelRendererTurbo(this, 65, 49, textureX, textureY); // Box 32
		bodyModel[29] = new ModelRendererTurbo(this, 217, 41, textureX, textureY); // Box 33
		bodyModel[30] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 34
		bodyModel[31] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 35
		bodyModel[32] = new ModelRendererTurbo(this, 225, 49, textureX, textureY); // Box 36
		bodyModel[33] = new ModelRendererTurbo(this, 297, 41, textureX, textureY); // Box 37
		bodyModel[34] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 38
		bodyModel[35] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 39
		bodyModel[36] = new ModelRendererTurbo(this, 81, 9, textureX, textureY); // Box 40
		bodyModel[37] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 41
		bodyModel[38] = new ModelRendererTurbo(this, 313, 49, textureX, textureY); // Box 42
		bodyModel[39] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 43
		bodyModel[40] = new ModelRendererTurbo(this, 497, 17, textureX, textureY); // Box 45
		bodyModel[41] = new ModelRendererTurbo(this, 145, 41, textureX, textureY); // Box 46
		bodyModel[42] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 47
		bodyModel[43] = new ModelRendererTurbo(this, 129, 17, textureX, textureY); // Box 48
		bodyModel[44] = new ModelRendererTurbo(this, 161, 9, textureX, textureY); // Box 49
		bodyModel[45] = new ModelRendererTurbo(this, 217, 9, textureX, textureY); // Box 50
		bodyModel[46] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 51
		bodyModel[47] = new ModelRendererTurbo(this, 249, 9, textureX, textureY); // Box 54
		bodyModel[48] = new ModelRendererTurbo(this, 289, 9, textureX, textureY); // Box 59
		bodyModel[49] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 60
		bodyModel[50] = new ModelRendererTurbo(this, 321, 41, textureX, textureY); // Box 61
		bodyModel[51] = new ModelRendererTurbo(this, 505, 33, textureX, textureY); // Box 62
		bodyModel[52] = new ModelRendererTurbo(this, 153, 17, textureX, textureY); // Box 63
		bodyModel[53] = new ModelRendererTurbo(this, 81, 17, textureX, textureY); // Box 65
		bodyModel[54] = new ModelRendererTurbo(this, 473, 9, textureX, textureY); // Box 66
		bodyModel[55] = new ModelRendererTurbo(this, 417, 33, textureX, textureY); // Box 67
		bodyModel[56] = new ModelRendererTurbo(this, 30, 23, textureX, textureY); // Box 68
		bodyModel[57] = new ModelRendererTurbo(this, 30, 23, textureX, textureY); // Box 69
		bodyModel[58] = new ModelRendererTurbo(this, 30, 23, textureX, textureY); // Box 70
		bodyModel[59] = new ModelRendererTurbo(this, 30, 23, textureX, textureY); // Box 71
		bodyModel[60] = new ModelRendererTurbo(this, 354, 82, textureX, textureY); // Box 72
		bodyModel[61] = new ModelRendererTurbo(this, 90, 57, textureX, textureY); // Box 73
		bodyModel[62] = new ModelRendererTurbo(this, 199, 97, textureX, textureY); // Box 74
		bodyModel[63] = new ModelRendererTurbo(this, 30, 23, textureX, textureY); // Box 75
		bodyModel[64] = new ModelRendererTurbo(this, 385, 25, textureX, textureY); // Box 76
		bodyModel[65] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 71
		bodyModel[66] = new ModelRendererTurbo(this, 65, 49, textureX, textureY); // Box 72
		bodyModel[67] = new ModelRendererTurbo(this, 32, 65, textureX, textureY); // Box 73
		bodyModel[68] = new ModelRendererTurbo(this, 88, 55, textureX, textureY); // Box 74
		bodyModel[69] = new ModelRendererTurbo(this, 84, 62, textureX, textureY); // Box 75
		bodyModel[70] = new ModelRendererTurbo(this, 65, 111, textureX, textureY); // Box 76
		bodyModel[71] = new ModelRendererTurbo(this, 45, 31, textureX, textureY); // Box 77
		bodyModel[72] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 78
		bodyModel[73] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 79
		bodyModel[74] = new ModelRendererTurbo(this, 81, 9, textureX, textureY); // Box 80
		bodyModel[75] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 81
		bodyModel[76] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 82
		bodyModel[77] = new ModelRendererTurbo(this, 21, 34, textureX, textureY); // Box 83
		bodyModel[78] = new ModelRendererTurbo(this, 34, 33, textureX, textureY); // Box 84
		bodyModel[79] = new ModelRendererTurbo(this, 21, 9, textureX, textureY); // Box 85
		bodyModel[80] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 86
		bodyModel[81] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 87
		bodyModel[82] = new ModelRendererTurbo(this, 8, 21, textureX, textureY); // Box 88
		bodyModel[83] = new ModelRendererTurbo(this, 58, 40, textureX, textureY); // Box 89
		bodyModel[84] = new ModelRendererTurbo(this, 1, 28, textureX, textureY); // Box 90
		bodyModel[85] = new ModelRendererTurbo(this, 70, 90, textureX, textureY); // Box 91
		bodyModel[86] = new ModelRendererTurbo(this, 21, 34, textureX, textureY); // Box 94
		bodyModel[87] = new ModelRendererTurbo(this, 67, 104, textureX, textureY); // Box 95
		bodyModel[88] = new ModelRendererTurbo(this, 58, 40, textureX, textureY); // Box 96
		bodyModel[89] = new ModelRendererTurbo(this, 1, 28, textureX, textureY); // Box 97
		bodyModel[90] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 98
		bodyModel[91] = new ModelRendererTurbo(this, 8, 21, textureX, textureY); // Box 99
		bodyModel[92] = new ModelRendererTurbo(this, 7, 33, textureX, textureY); // Box 100
		bodyModel[93] = new ModelRendererTurbo(this, 30, 23, textureX, textureY); // Box 101
		bodyModel[94] = new ModelRendererTurbo(this, 30, 23, textureX, textureY); // Box 102
		bodyModel[95] = new ModelRendererTurbo(this, 30, 23, textureX, textureY); // Box 103
		bodyModel[96] = new ModelRendererTurbo(this, 30, 23, textureX, textureY); // Box 104
		bodyModel[97] = new ModelRendererTurbo(this, 30, 23, textureX, textureY); // Box 105
		bodyModel[98] = new ModelRendererTurbo(this, 30, 23, textureX, textureY); // Box 109
		bodyModel[99] = new ModelRendererTurbo(this, 32, 10, textureX, textureY); // Box 110
		bodyModel[100] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 145
		bodyModel[101] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 146
		bodyModel[102] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 147
		bodyModel[103] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 149
		bodyModel[104] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 159
		bodyModel[105] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 160
		bodyModel[106] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 161
		bodyModel[107] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 162
		bodyModel[108] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 191
		bodyModel[109] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 192
		bodyModel[110] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 193
		bodyModel[111] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 194
		bodyModel[112] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 195
		bodyModel[113] = new ModelRendererTurbo(this, 210, 1, textureX, textureY); // Box 196
		bodyModel[114] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 197
		bodyModel[115] = new ModelRendererTurbo(this, 410, 80, textureX, textureY); // Box 198
		bodyModel[116] = new ModelRendererTurbo(this, 224, 7, textureX, textureY); // Box 199
		bodyModel[117] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 200
		bodyModel[118] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 201
		bodyModel[119] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 202
		bodyModel[120] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 203
		bodyModel[121] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 204
		bodyModel[122] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 206

		bodyModel[0].addBox(0F, 0F, 0F, 15, 21, 19, 0F); // Box 0
		bodyModel[0].setRotationPoint(-9F, -17F, -9.5F);

		bodyModel[1].addBox(0F, 0F, 0F, 18, 21, 19, 0F); // Box 1
		bodyModel[1].setRotationPoint(-27F, -17F, -9.5F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 6, 21, 19, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[2].setRotationPoint(-33F, -17F, -9.5F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 7, 19, 19, 0F,0F, -2F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F); // Box 3
		bodyModel[3].setRotationPoint(-40F, -15F, -9.5F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 4, 17, 7, 0F,0F, -1F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, -1F, 0F, 0F, -3F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, -3F, 0F); // Box 4
		bodyModel[4].setRotationPoint(-44F, -13F, -3.5F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 7, 15, 17, 0F,0F, 0F, 1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 1F); // Box 5
		bodyModel[5].setRotationPoint(6F, -11F, -8.5F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 3, 6, 18, 0F,0F, 0F, 0.5F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F); // Box 6
		bodyModel[6].setRotationPoint(6F, -17F, -9F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 5, 6, 1, 0F,2F, 0F, 0F, -2F, 0F, -5F, -3F, 0F, 4F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, -1F, 0F, 4F, 0F, 0F, 0F); // Box 7
		bodyModel[7].setRotationPoint(9F, -17F, -9F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 14, 15, 10, 0F,0F, 0F, 3F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F); // Box 8
		bodyModel[8].setRotationPoint(13F, -11F, -5F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 3, 11, 7, 0F,0F, 0F, 1.5F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, -3F, 0F, 1.5F, -3F, 0F, 1.5F, 0F, 0F, 1.5F); // Box 9
		bodyModel[9].setRotationPoint(27F, -7F, -3.5F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 7, 6, 8, 0F,0F, 0F, 5F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 10
		bodyModel[10].setRotationPoint(7F, -17F, -4F);

		bodyModel[11].addShapeBox(0F, 0F, -7F, 5, 6, 1, 0F,2F, 0F, 0F, -3F, 0F, 4F, -2F, 0F, -5F, 2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 4F, 0F, 0F, -5F, 0F, 0F, 0F); // Box 11
		bodyModel[11].setRotationPoint(9F, -17F, 15F);

		bodyModel[12].addBox(0F, 0F, 0F, 6, 4, 7, 0F); // Box 13
		bodyModel[12].setRotationPoint(-27F, -20F, -3.5F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 14, 2, 7, 0F,0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 14
		bodyModel[13].setRotationPoint(-41F, -15F, -3.5F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 3, 1, 7, 0F,0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 15
		bodyModel[14].setRotationPoint(-44F, -13F, -3.5F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 17, 2, 6, 0F,0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 16
		bodyModel[15].setRotationPoint(-27F, -19F, -9.5F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 6, 2, 6, 0F,0F, -2F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F); // Box 17
		bodyModel[16].setRotationPoint(-33F, -19F, -9.5F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 7, 2, 6, 0F,0F, -2F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F); // Box 18
		bodyModel[17].setRotationPoint(-40F, -17F, -9.5F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 19
		bodyModel[18].setRotationPoint(-44F, -13F, -5.5F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 17, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 20
		bodyModel[19].setRotationPoint(-27F, -19F, 3.5F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 6, 2, 6, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, -2F, -6F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F); // Box 21
		bodyModel[20].setRotationPoint(-33F, -19F, 3.5F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 7, 2, 6, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, -2F, -6F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -4F); // Box 22
		bodyModel[21].setRotationPoint(-40F, -17F, 3.5F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 23
		bodyModel[22].setRotationPoint(-44F, -13F, 3.5F);

		bodyModel[23].addBox(0F, 0F, 0F, 11, 2, 7, 0F); // Box 24
		bodyModel[23].setRotationPoint(-21F, -19F, -3.5F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 6, 1, 7, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25
		bodyModel[24].setRotationPoint(-27F, -21F, -3.5F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 14, 1, 7, 0F,0F, -5F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -5F, -2F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F); // Box 28
		bodyModel[25].setRotationPoint(-41F, -21F, -3.5F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 3, 1, 7, 0F,0F, -5F, -2F, 0F, -3F, -2F, 0F, -3F, -2F, 0F, -5F, -2F, 0F, 5F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 5F, 0F); // Box 29
		bodyModel[26].setRotationPoint(-44F, -19F, -3.5F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 28, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 31
		bodyModel[27].setRotationPoint(-19F, 1F, -15.5F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 31, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 32
		bodyModel[28].setRotationPoint(-19F, 6F, -15.5F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 20, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
		bodyModel[29].setRotationPoint(9F, 1F, -15.5F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 7, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		bodyModel[30].setRotationPoint(12F, 6F, -15.5F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 10, 2, 1, 0F,0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 35
		bodyModel[31].setRotationPoint(19F, 6F, -15.5F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 41, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 36
		bodyModel[32].setRotationPoint(-22F, 1F, -14.5F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 10, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 37
		bodyModel[33].setRotationPoint(19F, 1F, -14.5F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 3, 6, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[34].setRotationPoint(-25F, 1F, -14.5F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 3, 5, 1, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F); // Box 39
		bodyModel[35].setRotationPoint(-28F, 2F, -14.5F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 3, 5, 1, 0F,0F, 0F, 0F, 2F, -3F, 0F, 2F, -3F, 0F, 0F, 0F, 0F, 3F, -2F, 0F, -1F, 2.5F, 0F, -1F, 2.5F, 0F, 3F, -2F, 0F); // Box 40
		bodyModel[36].setRotationPoint(-30F, -1F, -14.5F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -3F, 0F, 1F, -3F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[37].setRotationPoint(-33F, 0F, -14.5F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 37, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 42
		bodyModel[38].setRotationPoint(-24F, -4.5F, -14.5F);
		bodyModel[38].rotateAngleZ = 0.10471976F;

		bodyModel[39].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
		bodyModel[39].setRotationPoint(12F, -9F, -14.5F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 1, 9, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 45
		bodyModel[40].setRotationPoint(9F, -7F, -14.5F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 1, 9, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 46
		bodyModel[41].setRotationPoint(11F, -7F, -14.5F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 47
		bodyModel[42].setRotationPoint(6F, -1.5F, -12.5F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 48
		bodyModel[43].setRotationPoint(14F, -1.5F, -14.5F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		bodyModel[44].setRotationPoint(12F, -3F, -14.5F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 3, 6, 1, 0F,0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 50
		bodyModel[45].setRotationPoint(-23F, -4F, -14.5F);

		bodyModel[46].addBox(0F, 0F, 0F, 1, 6, 1, 0F); // Box 51
		bodyModel[46].setRotationPoint(-24F, -4F, -14.5F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 3, 6, 21, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 54
		bodyModel[47].setRotationPoint(-25F, 1F, -10.5F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 59
		bodyModel[48].setRotationPoint(12F, -9F, -10.5F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 37, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 60
		bodyModel[49].setRotationPoint(-24F, -4.5F, -10.5F);
		bodyModel[49].rotateAngleZ = 0.10471976F;

		bodyModel[50].addShapeBox(0F, 0F, 0F, 3, 6, 1, 0F,0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 61
		bodyModel[50].setRotationPoint(-23F, -4F, -10.5F);

		bodyModel[51].addBox(0F, 0F, 0F, 1, 6, 1, 0F); // Box 62
		bodyModel[51].setRotationPoint(-24F, -4F, -10.5F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 63
		bodyModel[52].setRotationPoint(14F, -1.5F, -10.5F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 65
		bodyModel[53].setRotationPoint(12F, -3F, -10.5F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 66
		bodyModel[54].setRotationPoint(16F, -3F, -14.5F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 67
		bodyModel[55].setRotationPoint(12F, -8F, -13.5F);

		bodyModel[56].addTrapezoid(0F, 0F, 0F, 3, 1, 3, 0F, -0.50F, ModelRendererTurbo.MR_BOTTOM); // Box 68
		bodyModel[56].setRotationPoint(12F, -7F, -13.5F);

		bodyModel[57].addTrapezoid(0F, 0F, 0F, 3, 1, 3, 0F, -0.50F, ModelRendererTurbo.MR_BOTTOM); // Box 69
		bodyModel[57].setRotationPoint(12F, -6F, -13.5F);

		bodyModel[58].addTrapezoid(0F, 0F, 0F, 3, 1, 3, 0F, -0.50F, ModelRendererTurbo.MR_BOTTOM); // Box 70
		bodyModel[58].setRotationPoint(12F, -5F, -13.5F);

		bodyModel[59].addTrapezoid(0F, 0F, 0F, 3, 1, 3, 0F, -0.50F, ModelRendererTurbo.MR_BOTTOM); // Box 71
		bodyModel[59].setRotationPoint(12F, -4F, -13.5F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 3, 5, 21, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F); // Box 72
		bodyModel[60].setRotationPoint(-28F, 2F, -10.5F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 3, 5, 21, 0F,0F, 0F, 0F, 2F, -3F, 0F, 2F, -3F, 0F, 0F, 0F, 0F, 3F, -2F, 0F, -1F, 2.5F, 0F, -1F, 2.5F, 0F, 3F, -2F, 0F); // Box 73
		bodyModel[61].setRotationPoint(-30F, -1F, -10.5F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 2, 2, 21, 0F,0F, 0F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -3F, 0F, 1F, -3F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[62].setRotationPoint(-33F, 0F, -10.5F);

		bodyModel[63].addTrapezoid(0F, 0F, 0F, 3, 1, 3, 0F, -0.50F, ModelRendererTurbo.MR_BOTTOM); // Box 75
		bodyModel[63].setRotationPoint(12F, -3F, -13.5F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 76
		bodyModel[64].setRotationPoint(14F, -1.5F, -13.5F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 28, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 71
		bodyModel[65].setRotationPoint(-19F, 1F, 14.5F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 31, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 72
		bodyModel[66].setRotationPoint(-19F, 6F, 14.5F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 20, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		bodyModel[67].setRotationPoint(9F, 1F, 14.5F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 7, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[68].setRotationPoint(12F, 6F, 14.5F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 10, 2, 1, 0F,0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 75
		bodyModel[69].setRotationPoint(19F, 6F, 14.5F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 41, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 76
		bodyModel[70].setRotationPoint(-22F, 1F, 13.5F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 10, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 77
		bodyModel[71].setRotationPoint(19F, 1F, 13.5F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 3, 6, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 78
		bodyModel[72].setRotationPoint(-25F, 1F, 13.5F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 3, 5, 1, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F); // Box 79
		bodyModel[73].setRotationPoint(-28F, 2F, 13.5F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 3, 5, 1, 0F,0F, 0F, 0F, 2F, -3F, 0F, 2F, -3F, 0F, 0F, 0F, 0F, 3F, -2F, 0F, -1F, 2.5F, 0F, -1F, 2.5F, 0F, 3F, -2F, 0F); // Box 80
		bodyModel[74].setRotationPoint(-30F, -1F, 13.5F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -3F, 0F, 1F, -3F, 0F, 0F, 0F, 0F); // Box 81
		bodyModel[75].setRotationPoint(-33F, 0F, 13.5F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 37, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 82
		bodyModel[76].setRotationPoint(-24F, -4.5F, 13.5F);
		bodyModel[76].rotateAngleZ = 0.10471976F;

		bodyModel[77].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 83
		bodyModel[77].setRotationPoint(12F, -9F, 13.5F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 1, 9, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 84
		bodyModel[78].setRotationPoint(9F, -7F, 10.5F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 1, 9, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 85
		bodyModel[79].setRotationPoint(11F, -7F, 10.5F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 86
		bodyModel[80].setRotationPoint(6F, -1.5F, 11.5F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 87
		bodyModel[81].setRotationPoint(14F, -1.5F, 13.5F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 88
		bodyModel[82].setRotationPoint(12F, -3F, 13.5F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 3, 6, 1, 0F,0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 89
		bodyModel[83].setRotationPoint(-23F, -4F, 13.5F);

		bodyModel[84].addBox(0F, 0F, 0F, 1, 6, 1, 0F); // Box 90
		bodyModel[84].setRotationPoint(-24F, -4F, 13.5F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 41, 6, 4, 0F,0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 91
		bodyModel[85].setRotationPoint(-22F, 1F, 9.5F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 94
		bodyModel[86].setRotationPoint(12F, -9F, 9.5F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 37, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 95
		bodyModel[87].setRotationPoint(-24F, -4.5F, 9.5F);
		bodyModel[87].rotateAngleZ = 0.10471976F;

		bodyModel[88].addShapeBox(0F, 0F, 0F, 3, 6, 1, 0F,0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 96
		bodyModel[88].setRotationPoint(-23F, -4F, 9.5F);

		bodyModel[89].addBox(0F, 0F, 0F, 1, 6, 1, 0F); // Box 97
		bodyModel[89].setRotationPoint(-24F, -4F, 9.5F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 98
		bodyModel[90].setRotationPoint(14F, -1.5F, 9.5F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 99
		bodyModel[91].setRotationPoint(12F, -3F, 9.5F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 100
		bodyModel[92].setRotationPoint(16F, -3F, 10.5F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 101
		bodyModel[93].setRotationPoint(12F, -8F, 10.5F);

		bodyModel[94].addTrapezoid(0F, 0F, 0F, 3, 1, 3, 0F, -0.50F, ModelRendererTurbo.MR_BOTTOM); // Box 102
		bodyModel[94].setRotationPoint(12F, -7F, 10.5F);

		bodyModel[95].addTrapezoid(0F, 0F, 0F, 3, 1, 3, 0F, -0.50F, ModelRendererTurbo.MR_BOTTOM); // Box 103
		bodyModel[95].setRotationPoint(12F, -6F, 10.5F);

		bodyModel[96].addTrapezoid(0F, 0F, 0F, 3, 1, 3, 0F, -0.50F, ModelRendererTurbo.MR_BOTTOM); // Box 104
		bodyModel[96].setRotationPoint(12F, -5F, 10.5F);

		bodyModel[97].addTrapezoid(0F, 0F, 0F, 3, 1, 3, 0F, -0.50F, ModelRendererTurbo.MR_BOTTOM); // Box 105
		bodyModel[97].setRotationPoint(12F, -4F, 10.5F);

		bodyModel[98].addTrapezoid(0F, 0F, 0F, 3, 1, 3, 0F, -0.50F, ModelRendererTurbo.MR_BOTTOM); // Box 109
		bodyModel[98].setRotationPoint(12F, -3F, 10.5F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 110
		bodyModel[99].setRotationPoint(14F, -1.5F, 10.5F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 11, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 145
		bodyModel[100].setRotationPoint(7F, 7F, -14.5F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 7, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 146
		bodyModel[101].setRotationPoint(-4F, 7F, -14.5F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 7, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 147
		bodyModel[102].setRotationPoint(-14F, 7F, -14.5F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 7, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 149
		bodyModel[103].setRotationPoint(-24F, 7F, -14.5F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 11, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 159
		bodyModel[104].setRotationPoint(7F, 7F, 13.5F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 7, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 160
		bodyModel[105].setRotationPoint(-4F, 7F, 13.5F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 7, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 161
		bodyModel[106].setRotationPoint(-14F, 7F, 13.5F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 7, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 162
		bodyModel[107].setRotationPoint(-24F, 7F, 13.5F);

		bodyModel[108].addBox(0F, 0F, 0F, 14, 1, 1, 0F); // Box 191
		bodyModel[108].setRotationPoint(-57F, -9F, 1.5F);
		bodyModel[108].rotateAngleZ = 0.13962634F;

		bodyModel[109].addBox(0F, 0F, 0F, 14, 1, 1, 0F); // Box 192
		bodyModel[109].setRotationPoint(-57F, -9F, -3.5F);
		bodyModel[109].rotateAngleZ = 0.13962634F;

		bodyModel[110].addBox(0F, 0F, 0F, 9, 1, 1, 0F); // Box 193
		bodyModel[110].setRotationPoint(-50F, -3F, -3.5F);
		bodyModel[110].rotateAngleZ = 0.85521133F;

		bodyModel[111].addBox(0F, 0F, 0F, 9, 1, 1, 0F); // Box 194
		bodyModel[111].setRotationPoint(-50F, -3F, 1.5F);
		bodyModel[111].rotateAngleZ = 0.85521133F;

		bodyModel[112].addBox(0F, 0F, -0.5F, 8, 1, 1, 0F); // Box 195
		bodyModel[112].setRotationPoint(-55F, -9F, 2F);
		bodyModel[112].rotateAngleY = -0.6981317F;
		bodyModel[112].rotateAngleZ = 0.12217305F;

		bodyModel[113].addBox(0F, 0F, -0.5F, 8, 1, 1, 0F); // Box 196
		bodyModel[113].setRotationPoint(-55F, -9F, -3F);
		bodyModel[113].rotateAngleY = 0.6981317F;
		bodyModel[113].rotateAngleZ = 0.12217305F;

		bodyModel[114].addBox(8F, 0F, -5F, 1, 1, 6, 0F); // Box 197
		bodyModel[114].setRotationPoint(-57F, -9F, 1.5F);
		bodyModel[114].rotateAngleZ = 0.13962634F;

		bodyModel[115].addBox(-1F, -4F, 0F, 1, 16, 10, 0F); // Box 198
		bodyModel[115].setRotationPoint(-50F, -3F, -5.5F);
		bodyModel[115].rotateAngleZ = 1.04719755F;

		bodyModel[116].addBox(-1F, -4F, 0F, 1, 7, 10, 0F); // Box 199
		bodyModel[116].setRotationPoint(-55F, -7F, -5.5F);
		bodyModel[116].rotateAngleZ = 0.68067841F;

		bodyModel[117].addShapeBox(7F, -2F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 200
		bodyModel[117].setRotationPoint(-50F, -3F, 1.5F);
		bodyModel[117].rotateAngleZ = 0.82030475F;

		bodyModel[118].addShapeBox(7F, -2F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 201
		bodyModel[118].setRotationPoint(-50F, -3F, -3.5F);
		bodyModel[118].rotateAngleZ = 0.82030475F;

		bodyModel[119].addBox(-2F, 0F, 0F, 3, 1, 1, 0F); // Box 202
		bodyModel[119].setRotationPoint(-50F, -4F, 1.5F);

		bodyModel[120].addBox(-2F, 0F, 0F, 3, 1, 1, 0F); // Box 203
		bodyModel[120].setRotationPoint(-50F, -4F, -3.5F);

		bodyModel[121].addShapeBox(-2F, 0F, 0F, 3, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 204
		bodyModel[121].setRotationPoint(-55F, -9F, -3.5F);

		bodyModel[122].addShapeBox(-2F, 0F, 5F, 3, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 206
		bodyModel[122].setRotationPoint(-55F, -9F, -3.5F);
	}

	private void initturretModel_1()
	{
		turretModel[0] = new ModelRendererTurbo(this, 204, 78, textureX, textureY); // Box 184
		turretModel[1] = new ModelRendererTurbo(this, 168, 86, textureX, textureY); // Box 185
		turretModel[2] = new ModelRendererTurbo(this, 163, 70, textureX, textureY); // Box 186
		turretModel[3] = new ModelRendererTurbo(this, 163, 70, textureX, textureY); // Box 187
		turretModel[4] = new ModelRendererTurbo(this, 202, 55, textureX, textureY); // Box 186

		turretModel[0].addShapeBox(0F, 0F, 0F, 16, 9, 8, 0F,0.5F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 1F, 0F, 2F, 0F, 0F, 2.5F, 0F, 0F, 2.5F, 0F, 0F, 2F, 0F, 0F); // Box 184
		turretModel[0].setRotationPoint(-7F, -26F, -4F);

		turretModel[1].addShapeBox(0F, 0F, 0F, 12, 2, 10, 0F,-1F, -0.5F, 3F, -2.5F, -0.5F, 3F, -2.5F, -0.5F, 3F, -1F, -0.5F, 3F, 2F, -1F, -1F, 2.5F, 0F, -1F, 2.5F, 0F, -1F, 2F, -1F, -1F); // Box 185
		turretModel[1].setRotationPoint(-5.5F, -28F, -5F);

		turretModel[2].addShapeBox(0F, 0F, 0F, 16, 9, 6, 0F,-2.5F, 1.5F, -2F, -5F, 1.5F, -2F, 0F, 0F, 0F, 0.5F, 1F, 0F, -1F, 0F, 0F, -2.5F, 0F, 0F, 2.5F, 0F, 0F, 2F, 0F, 0F); // Box 186
		turretModel[2].setRotationPoint(-7F, -26F, -10F);

		turretModel[3].addShapeBox(0F, 0F, 0F, 16, 9, 6, 0F,0.5F, 1F, 0F, 0F, 0F, 0F, -5F, 1.5F, -2F, -2.5F, 1.5F, -2F, 2F, 0F, 0F, 2.5F, 0F, 0F, -2.5F, 0F, 0F, -1F, 0F, 0F); // Box 187
		turretModel[3].setRotationPoint(-7F, -26F, 4F);

		turretModel[4].addShapeBox(0F, 0F, 0F, 1, 7, 6, 0F,0.5F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 1F, 0F, 2F, 0F, 0F, 2.5F, 0F, 0F, 2.5F, 0F, 0F, 2F, 0F, 0F); // Box 186
		turretModel[4].setRotationPoint(9F, -25F, -3F);
	}

	private void initbarrelModel_1()
	{
		barrelModel[0] = new ModelRendererTurbo(this, 152, 64, textureX, textureY); // Box 187
		barrelModel[1] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 189
		barrelModel[2] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 190

		barrelModel[0].addBox(0F, -2F, -2F, 3, 6, 4, 0F); // Box 187
		barrelModel[0].setRotationPoint(9F, -22.5F, 0F);

		barrelModel[1].addBox(3F, 1.1F, -0.5F, 13, 1, 1, 0F); // Box 189
		barrelModel[1].setRotationPoint(9F, -22.5F, 0F);

		barrelModel[2].addBox(3F, 2.5F, -0.5F, 7, 1, 1, 0F); // Box 190
		barrelModel[2].setRotationPoint(9F, -22.5F, 0F);
	}

	private void initleftTrackWheelModels_1()
	{
		leftTrackWheelModels[0] = new ModelRendererTurbo(this, 1, 83, textureX, textureY); // Shape 69
		leftTrackWheelModels[1] = new ModelRendererTurbo(this, 2, 64, textureX, textureY); // Shape 70
		leftTrackWheelModels[2] = new ModelRendererTurbo(this, 22, 26, textureX, textureY); // Shape 163
		leftTrackWheelModels[3] = new ModelRendererTurbo(this, 22, 26, textureX, textureY); // Shape 164
		leftTrackWheelModels[4] = new ModelRendererTurbo(this, 22, 27, textureX, textureY); // Shape 165
		leftTrackWheelModels[5] = new ModelRendererTurbo(this, 22, 26, textureX, textureY); // Shape 166
		leftTrackWheelModels[6] = new ModelRendererTurbo(this, 22, 26, textureX, textureY); // Shape 167
		leftTrackWheelModels[7] = new ModelRendererTurbo(this, 22, 26, textureX, textureY); // Shape 168
		leftTrackWheelModels[8] = new ModelRendererTurbo(this, 22, 26, textureX, textureY); // Shape 169
		leftTrackWheelModels[9] = new ModelRendererTurbo(this, 22, 26, textureX, textureY); // Shape 170
		leftTrackWheelModels[10] = new ModelRendererTurbo(this, 22, 26, textureX, textureY); // Shape 171
		leftTrackWheelModels[11] = new ModelRendererTurbo(this, 22, 26, textureX, textureY); // Shape 178
		leftTrackWheelModels[12] = new ModelRendererTurbo(this, 22, 26, textureX, textureY); // Shape 179
		leftTrackWheelModels[13] = new ModelRendererTurbo(this, 22, 26, textureX, textureY); // Shape 180
		leftTrackWheelModels[14] = new ModelRendererTurbo(this, 22, 26, textureX, textureY); // Shape 181
		leftTrackWheelModels[15] = new ModelRendererTurbo(this, 22, 26, textureX, textureY); // Shape 182
		leftTrackWheelModels[16] = new ModelRendererTurbo(this, 22, 26, textureX, textureY); // Shape 183

		leftTrackWheelModels[0].addShape3D(9F, -9F, -1F, new Shape2D(new Coord2D[] { new Coord2D(6, 0, 6, 0), new Coord2D(12, 0, 12, 0), new Coord2D(18, 6, 18, 6), new Coord2D(18, 12, 18, 12), new Coord2D(12, 18, 12, 18), new Coord2D(6, 18, 6, 18), new Coord2D(0, 12, 0, 12), new Coord2D(0, 6, 0, 6) }), 3, 18, 18, 60, 3, ModelRendererTurbo.MR_FRONT, new float[] {9 ,6 ,9 ,6 ,9 ,6 ,9 ,6}); // Shape 69
		leftTrackWheelModels[0].setRotationPoint(22F, -0.25F, 12.5F);

		leftTrackWheelModels[1].addShape3D(6F, -6F, -2F, new Shape2D(new Coord2D[] { new Coord2D(4, 0, 4, 0), new Coord2D(8, 0, 8, 0), new Coord2D(12, 4, 12, 4), new Coord2D(12, 8, 12, 8), new Coord2D(8, 12, 8, 12), new Coord2D(4, 12, 4, 12), new Coord2D(0, 8, 0, 8), new Coord2D(0, 4, 0, 4) }), 3, 12, 12, 40, 3, ModelRendererTurbo.MR_FRONT, new float[] {6 ,4 ,6 ,4 ,6 ,4 ,6 ,4}); // Shape 70
		leftTrackWheelModels[1].setRotationPoint(-30F, 1.5F, 11.5F);

		leftTrackWheelModels[2].addShape3D(1.5F, -1.5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(1, 0, 1, 0), new Coord2D(2, 0, 2, 0), new Coord2D(3, 1, 3, 1), new Coord2D(3, 2, 3, 2), new Coord2D(2, 3, 2, 3), new Coord2D(1, 3, 1, 3), new Coord2D(0, 2, 0, 2), new Coord2D(0, 1, 0, 1) }), 1, 3, 3, 12, 1, ModelRendererTurbo.MR_FRONT, new float[] {2 ,1 ,2 ,1 ,2 ,1 ,2 ,1}); // Shape 163
		leftTrackWheelModels[2].setRotationPoint(-17F, 8F, 14F);

		leftTrackWheelModels[3].addShape3D(1.5F, -1.5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(1, 0, 1, 0), new Coord2D(2, 0, 2, 0), new Coord2D(3, 1, 3, 1), new Coord2D(3, 2, 3, 2), new Coord2D(2, 3, 2, 3), new Coord2D(1, 3, 1, 3), new Coord2D(0, 2, 0, 2), new Coord2D(0, 1, 0, 1) }), 1, 3, 3, 12, 1, ModelRendererTurbo.MR_FRONT, new float[] {2 ,1 ,2 ,1 ,2 ,1 ,2 ,1}); // Shape 164
		leftTrackWheelModels[3].setRotationPoint(-22.5F, 8F, 14F);

		leftTrackWheelModels[4].addShape3D(1.5F, -1.5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(1, 0, 1, 0), new Coord2D(2, 0, 2, 0), new Coord2D(3, 1, 3, 1), new Coord2D(3, 2, 3, 2), new Coord2D(2, 3, 2, 3), new Coord2D(1, 3, 1, 3), new Coord2D(0, 2, 0, 2), new Coord2D(0, 1, 0, 1) }), 1, 3, 3, 12, 1, ModelRendererTurbo.MR_FRONT, new float[] {2 ,1 ,2 ,1 ,2 ,1 ,2 ,1}); // Shape 165
		leftTrackWheelModels[4].setRotationPoint(-12.5F, 8F, 14F);

		leftTrackWheelModels[5].addShape3D(1.5F, -1.5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(1, 0, 1, 0), new Coord2D(2, 0, 2, 0), new Coord2D(3, 1, 3, 1), new Coord2D(3, 2, 3, 2), new Coord2D(2, 3, 2, 3), new Coord2D(1, 3, 1, 3), new Coord2D(0, 2, 0, 2), new Coord2D(0, 1, 0, 1) }), 1, 3, 3, 12, 1, ModelRendererTurbo.MR_FRONT, new float[] {2 ,1 ,2 ,1 ,2 ,1 ,2 ,1}); // Shape 166
		leftTrackWheelModels[5].setRotationPoint(-7F, 8F, 14F);

		leftTrackWheelModels[6].addShape3D(1.5F, -1.5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(1, 0, 1, 0), new Coord2D(2, 0, 2, 0), new Coord2D(3, 1, 3, 1), new Coord2D(3, 2, 3, 2), new Coord2D(2, 3, 2, 3), new Coord2D(1, 3, 1, 3), new Coord2D(0, 2, 0, 2), new Coord2D(0, 1, 0, 1) }), 1, 3, 3, 12, 1, ModelRendererTurbo.MR_FRONT, new float[] {2 ,1 ,2 ,1 ,2 ,1 ,2 ,1}); // Shape 167
		leftTrackWheelModels[6].setRotationPoint(-2.5F, 8F, 14F);

		leftTrackWheelModels[7].addShape3D(1.5F, -1.5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(1, 0, 1, 0), new Coord2D(2, 0, 2, 0), new Coord2D(3, 1, 3, 1), new Coord2D(3, 2, 3, 2), new Coord2D(2, 3, 2, 3), new Coord2D(1, 3, 1, 3), new Coord2D(0, 2, 0, 2), new Coord2D(0, 1, 0, 1) }), 1, 3, 3, 12, 1, ModelRendererTurbo.MR_FRONT, new float[] {2 ,1 ,2 ,1 ,2 ,1 ,2 ,1}); // Shape 168
		leftTrackWheelModels[7].setRotationPoint(3F, 8F, 14F);

		leftTrackWheelModels[8].addShape3D(1.5F, -1.5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(1, 0, 1, 0), new Coord2D(2, 0, 2, 0), new Coord2D(3, 1, 3, 1), new Coord2D(3, 2, 3, 2), new Coord2D(2, 3, 2, 3), new Coord2D(1, 3, 1, 3), new Coord2D(0, 2, 0, 2), new Coord2D(0, 1, 0, 1) }), 1, 3, 3, 12, 1, ModelRendererTurbo.MR_FRONT, new float[] {2 ,1 ,2 ,1 ,2 ,1 ,2 ,1}); // Shape 169
		leftTrackWheelModels[8].setRotationPoint(7F, 8F, 14F);

		leftTrackWheelModels[9].addShape3D(1.5F, -1.5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(1, 0, 1, 0), new Coord2D(2, 0, 2, 0), new Coord2D(3, 1, 3, 1), new Coord2D(3, 2, 3, 2), new Coord2D(2, 3, 2, 3), new Coord2D(1, 3, 1, 3), new Coord2D(0, 2, 0, 2), new Coord2D(0, 1, 0, 1) }), 1, 3, 3, 12, 1, ModelRendererTurbo.MR_FRONT, new float[] {2 ,1 ,2 ,1 ,2 ,1 ,2 ,1}); // Shape 170
		leftTrackWheelModels[9].setRotationPoint(12.5F, 8F, 14F);

		leftTrackWheelModels[10].addShape3D(1.5F, -1.5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(1, 0, 1, 0), new Coord2D(2, 0, 2, 0), new Coord2D(3, 1, 3, 1), new Coord2D(3, 2, 3, 2), new Coord2D(2, 3, 2, 3), new Coord2D(1, 3, 1, 3), new Coord2D(0, 2, 0, 2), new Coord2D(0, 1, 0, 1) }), 1, 3, 3, 12, 1, ModelRendererTurbo.MR_FRONT, new float[] {2 ,1 ,2 ,1 ,2 ,1 ,2 ,1}); // Shape 171
		leftTrackWheelModels[10].setRotationPoint(18.5F, 8F, 14F);

		leftTrackWheelModels[11].addShape3D(1.5F, -1.5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(1, 0, 1, 0), new Coord2D(2, 0, 2, 0), new Coord2D(3, 1, 3, 1), new Coord2D(3, 2, 3, 2), new Coord2D(2, 3, 2, 3), new Coord2D(1, 3, 1, 3), new Coord2D(0, 2, 0, 2), new Coord2D(0, 1, 0, 1) }), 3, 3, 3, 12, 3, ModelRendererTurbo.MR_FRONT, new float[] {2 ,1 ,2 ,1 ,2 ,1 ,2 ,1}); // Shape 178
		leftTrackWheelModels[11].setRotationPoint(-8F, -5.5F, 13.5F);

		leftTrackWheelModels[12].addShape3D(1.5F, -1.5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(1, 0, 1, 0), new Coord2D(2, 0, 2, 0), new Coord2D(3, 1, 3, 1), new Coord2D(3, 2, 3, 2), new Coord2D(2, 3, 2, 3), new Coord2D(1, 3, 1, 3), new Coord2D(0, 2, 0, 2), new Coord2D(0, 1, 0, 1) }), 3, 3, 3, 12, 3, ModelRendererTurbo.MR_FRONT, new float[] {2 ,1 ,2 ,1 ,2 ,1 ,2 ,1}); // Shape 179
		leftTrackWheelModels[12].setRotationPoint(-16F, -4.5F, 13.5F);

		leftTrackWheelModels[13].addShape3D(1.5F, -1.5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(1, 0, 1, 0), new Coord2D(2, 0, 2, 0), new Coord2D(3, 1, 3, 1), new Coord2D(3, 2, 3, 2), new Coord2D(2, 3, 2, 3), new Coord2D(1, 3, 1, 3), new Coord2D(0, 2, 0, 2), new Coord2D(0, 1, 0, 1) }), 3, 3, 3, 12, 3, ModelRendererTurbo.MR_FRONT, new float[] {2 ,1 ,2 ,1 ,2 ,1 ,2 ,1}); // Shape 180
		leftTrackWheelModels[13].setRotationPoint(-23.5F, -3.5F, 13.5F);

		leftTrackWheelModels[14].addShape3D(1.5F, -1.5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(1, 0, 1, 0), new Coord2D(2, 0, 2, 0), new Coord2D(3, 1, 3, 1), new Coord2D(3, 2, 3, 2), new Coord2D(2, 3, 2, 3), new Coord2D(1, 3, 1, 3), new Coord2D(0, 2, 0, 2), new Coord2D(0, 1, 0, 1) }), 3, 3, 3, 12, 3, ModelRendererTurbo.MR_FRONT, new float[] {2 ,1 ,2 ,1 ,2 ,1 ,2 ,1}); // Shape 181
		leftTrackWheelModels[14].setRotationPoint(0F, -6.5F, 13.5F);

		leftTrackWheelModels[15].addShape3D(1.5F, -1.5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(1, 0, 1, 0), new Coord2D(2, 0, 2, 0), new Coord2D(3, 1, 3, 1), new Coord2D(3, 2, 3, 2), new Coord2D(2, 3, 2, 3), new Coord2D(1, 3, 1, 3), new Coord2D(0, 2, 0, 2), new Coord2D(0, 1, 0, 1) }), 3, 3, 3, 12, 3, ModelRendererTurbo.MR_FRONT, new float[] {2 ,1 ,2 ,1 ,2 ,1 ,2 ,1}); // Shape 182
		leftTrackWheelModels[15].setRotationPoint(16.5F, -8.5F, 13.5F);

		leftTrackWheelModels[16].addShape3D(1.5F, -1.5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(1, 0, 1, 0), new Coord2D(2, 0, 2, 0), new Coord2D(3, 1, 3, 1), new Coord2D(3, 2, 3, 2), new Coord2D(2, 3, 2, 3), new Coord2D(1, 3, 1, 3), new Coord2D(0, 2, 0, 2), new Coord2D(0, 1, 0, 1) }), 3, 3, 3, 12, 3, ModelRendererTurbo.MR_FRONT, new float[] {2 ,1 ,2 ,1 ,2 ,1 ,2 ,1}); // Shape 183
		leftTrackWheelModels[16].setRotationPoint(7.5F, -7.5F, 13.5F);
	}

	private void initrightTrackWheelModels_1()
	{
		rightTrackWheelModels[0] = new ModelRendererTurbo(this, 1, 83, textureX, textureY); // Shape 149
		rightTrackWheelModels[1] = new ModelRendererTurbo(this, 2, 64, textureX, textureY); // Shape 152
		rightTrackWheelModels[2] = new ModelRendererTurbo(this, 22, 26, textureX, textureY); // Shape 150
		rightTrackWheelModels[3] = new ModelRendererTurbo(this, 22, 26, textureX, textureY); // Shape 151
		rightTrackWheelModels[4] = new ModelRendererTurbo(this, 22, 26, textureX, textureY); // Shape 152
		rightTrackWheelModels[5] = new ModelRendererTurbo(this, 22, 26, textureX, textureY); // Shape 153
		rightTrackWheelModels[6] = new ModelRendererTurbo(this, 22, 26, textureX, textureY); // Shape 154
		rightTrackWheelModels[7] = new ModelRendererTurbo(this, 22, 26, textureX, textureY); // Shape 155
		rightTrackWheelModels[8] = new ModelRendererTurbo(this, 22, 26, textureX, textureY); // Shape 156
		rightTrackWheelModels[9] = new ModelRendererTurbo(this, 22, 26, textureX, textureY); // Shape 157
		rightTrackWheelModels[10] = new ModelRendererTurbo(this, 22, 26, textureX, textureY); // Shape 158
		rightTrackWheelModels[11] = new ModelRendererTurbo(this, 22, 26, textureX, textureY); // Shape 172
		rightTrackWheelModels[12] = new ModelRendererTurbo(this, 22, 26, textureX, textureY); // Shape 173
		rightTrackWheelModels[13] = new ModelRendererTurbo(this, 22, 26, textureX, textureY); // Shape 174
		rightTrackWheelModels[14] = new ModelRendererTurbo(this, 22, 26, textureX, textureY); // Shape 175
		rightTrackWheelModels[15] = new ModelRendererTurbo(this, 22, 26, textureX, textureY); // Shape 176
		rightTrackWheelModels[16] = new ModelRendererTurbo(this, 22, 26, textureX, textureY); // Shape 177

		rightTrackWheelModels[0].addShape3D(9F, -9F, -1F, new Shape2D(new Coord2D[] { new Coord2D(6, 0, 6, 0), new Coord2D(12, 0, 12, 0), new Coord2D(18, 6, 18, 6), new Coord2D(18, 12, 18, 12), new Coord2D(12, 18, 12, 18), new Coord2D(6, 18, 6, 18), new Coord2D(0, 12, 0, 12), new Coord2D(0, 6, 0, 6) }), 3, 18, 18, 60, 3, ModelRendererTurbo.MR_FRONT, new float[] {9 ,6 ,9 ,6 ,9 ,6 ,9 ,6}); // Shape 149
		rightTrackWheelModels[0].setRotationPoint(22F, -0.25F, -11.5F);

		rightTrackWheelModels[1].addShape3D(6F, -6F, 0F, new Shape2D(new Coord2D[] { new Coord2D(4, 0, 4, 0), new Coord2D(8, 0, 8, 0), new Coord2D(12, 4, 12, 4), new Coord2D(12, 8, 12, 8), new Coord2D(8, 12, 8, 12), new Coord2D(4, 12, 4, 12), new Coord2D(0, 8, 0, 8), new Coord2D(0, 4, 0, 4) }), 3, 12, 12, 40, 3, ModelRendererTurbo.MR_FRONT, new float[] {6 ,4 ,6 ,4 ,6 ,4 ,6 ,4}); // Shape 152
		rightTrackWheelModels[1].setRotationPoint(-30F, 1.5F, -10.5F);

		rightTrackWheelModels[2].addShape3D(1.5F, -1.5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(1, 0, 1, 0), new Coord2D(2, 0, 2, 0), new Coord2D(3, 1, 3, 1), new Coord2D(3, 2, 3, 2), new Coord2D(2, 3, 2, 3), new Coord2D(1, 3, 1, 3), new Coord2D(0, 2, 0, 2), new Coord2D(0, 1, 0, 1) }), 1, 3, 3, 12, 1, ModelRendererTurbo.MR_FRONT, new float[] {2 ,1 ,2 ,1 ,2 ,1 ,2 ,1}); // Shape 150
		rightTrackWheelModels[2].setRotationPoint(-17F, 8F, -13F);

		rightTrackWheelModels[3].addShape3D(1.5F, -1.5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(1, 0, 1, 0), new Coord2D(2, 0, 2, 0), new Coord2D(3, 1, 3, 1), new Coord2D(3, 2, 3, 2), new Coord2D(2, 3, 2, 3), new Coord2D(1, 3, 1, 3), new Coord2D(0, 2, 0, 2), new Coord2D(0, 1, 0, 1) }), 1, 3, 3, 12, 1, ModelRendererTurbo.MR_FRONT, new float[] {2 ,1 ,2 ,1 ,2 ,1 ,2 ,1}); // Shape 151
		rightTrackWheelModels[3].setRotationPoint(-22.5F, 8F, -13F);

		rightTrackWheelModels[4].addShape3D(1.5F, -1.5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(1, 0, 1, 0), new Coord2D(2, 0, 2, 0), new Coord2D(3, 1, 3, 1), new Coord2D(3, 2, 3, 2), new Coord2D(2, 3, 2, 3), new Coord2D(1, 3, 1, 3), new Coord2D(0, 2, 0, 2), new Coord2D(0, 1, 0, 1) }), 1, 3, 3, 12, 1, ModelRendererTurbo.MR_FRONT, new float[] {2 ,1 ,2 ,1 ,2 ,1 ,2 ,1}); // Shape 152
		rightTrackWheelModels[4].setRotationPoint(-12.5F, 8F, -13F);

		rightTrackWheelModels[5].addShape3D(1.5F, -1.5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(1, 0, 1, 0), new Coord2D(2, 0, 2, 0), new Coord2D(3, 1, 3, 1), new Coord2D(3, 2, 3, 2), new Coord2D(2, 3, 2, 3), new Coord2D(1, 3, 1, 3), new Coord2D(0, 2, 0, 2), new Coord2D(0, 1, 0, 1) }), 1, 3, 3, 12, 1, ModelRendererTurbo.MR_FRONT, new float[] {2 ,1 ,2 ,1 ,2 ,1 ,2 ,1}); // Shape 153
		rightTrackWheelModels[5].setRotationPoint(-7F, 8F, -13F);

		rightTrackWheelModels[6].addShape3D(1.5F, -1.5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(1, 0, 1, 0), new Coord2D(2, 0, 2, 0), new Coord2D(3, 1, 3, 1), new Coord2D(3, 2, 3, 2), new Coord2D(2, 3, 2, 3), new Coord2D(1, 3, 1, 3), new Coord2D(0, 2, 0, 2), new Coord2D(0, 1, 0, 1) }), 1, 3, 3, 12, 1, ModelRendererTurbo.MR_FRONT, new float[] {2 ,1 ,2 ,1 ,2 ,1 ,2 ,1}); // Shape 154
		rightTrackWheelModels[6].setRotationPoint(-2.5F, 8F, -13F);

		rightTrackWheelModels[7].addShape3D(1.5F, -1.5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(1, 0, 1, 0), new Coord2D(2, 0, 2, 0), new Coord2D(3, 1, 3, 1), new Coord2D(3, 2, 3, 2), new Coord2D(2, 3, 2, 3), new Coord2D(1, 3, 1, 3), new Coord2D(0, 2, 0, 2), new Coord2D(0, 1, 0, 1) }), 1, 3, 3, 12, 1, ModelRendererTurbo.MR_FRONT, new float[] {2 ,1 ,2 ,1 ,2 ,1 ,2 ,1}); // Shape 155
		rightTrackWheelModels[7].setRotationPoint(3F, 8F, -13F);

		rightTrackWheelModels[8].addShape3D(1.5F, -1.5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(1, 0, 1, 0), new Coord2D(2, 0, 2, 0), new Coord2D(3, 1, 3, 1), new Coord2D(3, 2, 3, 2), new Coord2D(2, 3, 2, 3), new Coord2D(1, 3, 1, 3), new Coord2D(0, 2, 0, 2), new Coord2D(0, 1, 0, 1) }), 1, 3, 3, 12, 1, ModelRendererTurbo.MR_FRONT, new float[] {2 ,1 ,2 ,1 ,2 ,1 ,2 ,1}); // Shape 156
		rightTrackWheelModels[8].setRotationPoint(7F, 8F, -13F);

		rightTrackWheelModels[9].addShape3D(1.5F, -1.5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(1, 0, 1, 0), new Coord2D(2, 0, 2, 0), new Coord2D(3, 1, 3, 1), new Coord2D(3, 2, 3, 2), new Coord2D(2, 3, 2, 3), new Coord2D(1, 3, 1, 3), new Coord2D(0, 2, 0, 2), new Coord2D(0, 1, 0, 1) }), 1, 3, 3, 12, 1, ModelRendererTurbo.MR_FRONT, new float[] {2 ,1 ,2 ,1 ,2 ,1 ,2 ,1}); // Shape 157
		rightTrackWheelModels[9].setRotationPoint(12.5F, 8F, -13F);

		rightTrackWheelModels[10].addShape3D(1.5F, -1.5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(1, 0, 1, 0), new Coord2D(2, 0, 2, 0), new Coord2D(3, 1, 3, 1), new Coord2D(3, 2, 3, 2), new Coord2D(2, 3, 2, 3), new Coord2D(1, 3, 1, 3), new Coord2D(0, 2, 0, 2), new Coord2D(0, 1, 0, 1) }), 1, 3, 3, 12, 1, ModelRendererTurbo.MR_FRONT, new float[] {2 ,1 ,2 ,1 ,2 ,1 ,2 ,1}); // Shape 158
		rightTrackWheelModels[10].setRotationPoint(18.5F, 8F, -13F);

		rightTrackWheelModels[11].addShape3D(1.5F, -1.5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(1, 0, 1, 0), new Coord2D(2, 0, 2, 0), new Coord2D(3, 1, 3, 1), new Coord2D(3, 2, 3, 2), new Coord2D(2, 3, 2, 3), new Coord2D(1, 3, 1, 3), new Coord2D(0, 2, 0, 2), new Coord2D(0, 1, 0, 1) }), 3, 3, 3, 12, 3, ModelRendererTurbo.MR_FRONT, new float[] {2 ,1 ,2 ,1 ,2 ,1 ,2 ,1}); // Shape 172
		rightTrackWheelModels[11].setRotationPoint(-8F, -5.5F, -10.5F);

		rightTrackWheelModels[12].addShape3D(1.5F, -1.5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(1, 0, 1, 0), new Coord2D(2, 0, 2, 0), new Coord2D(3, 1, 3, 1), new Coord2D(3, 2, 3, 2), new Coord2D(2, 3, 2, 3), new Coord2D(1, 3, 1, 3), new Coord2D(0, 2, 0, 2), new Coord2D(0, 1, 0, 1) }), 3, 3, 3, 12, 3, ModelRendererTurbo.MR_FRONT, new float[] {2 ,1 ,2 ,1 ,2 ,1 ,2 ,1}); // Shape 173
		rightTrackWheelModels[12].setRotationPoint(-16F, -4.5F, -10.5F);

		rightTrackWheelModels[13].addShape3D(1.5F, -1.5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(1, 0, 1, 0), new Coord2D(2, 0, 2, 0), new Coord2D(3, 1, 3, 1), new Coord2D(3, 2, 3, 2), new Coord2D(2, 3, 2, 3), new Coord2D(1, 3, 1, 3), new Coord2D(0, 2, 0, 2), new Coord2D(0, 1, 0, 1) }), 3, 3, 3, 12, 3, ModelRendererTurbo.MR_FRONT, new float[] {2 ,1 ,2 ,1 ,2 ,1 ,2 ,1}); // Shape 174
		rightTrackWheelModels[13].setRotationPoint(-23.5F, -3.5F, -10.5F);

		rightTrackWheelModels[14].addShape3D(1.5F, -1.5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(1, 0, 1, 0), new Coord2D(2, 0, 2, 0), new Coord2D(3, 1, 3, 1), new Coord2D(3, 2, 3, 2), new Coord2D(2, 3, 2, 3), new Coord2D(1, 3, 1, 3), new Coord2D(0, 2, 0, 2), new Coord2D(0, 1, 0, 1) }), 3, 3, 3, 12, 3, ModelRendererTurbo.MR_FRONT, new float[] {2 ,1 ,2 ,1 ,2 ,1 ,2 ,1}); // Shape 175
		rightTrackWheelModels[14].setRotationPoint(0F, -6.5F, -10.5F);

		rightTrackWheelModels[15].addShape3D(1.5F, -1.5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(1, 0, 1, 0), new Coord2D(2, 0, 2, 0), new Coord2D(3, 1, 3, 1), new Coord2D(3, 2, 3, 2), new Coord2D(2, 3, 2, 3), new Coord2D(1, 3, 1, 3), new Coord2D(0, 2, 0, 2), new Coord2D(0, 1, 0, 1) }), 3, 3, 3, 12, 3, ModelRendererTurbo.MR_FRONT, new float[] {2 ,1 ,2 ,1 ,2 ,1 ,2 ,1}); // Shape 176
		rightTrackWheelModels[15].setRotationPoint(16.5F, -8.5F, -10.5F);

		rightTrackWheelModels[16].addShape3D(1.5F, -1.5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(1, 0, 1, 0), new Coord2D(2, 0, 2, 0), new Coord2D(3, 1, 3, 1), new Coord2D(3, 2, 3, 2), new Coord2D(2, 3, 2, 3), new Coord2D(1, 3, 1, 3), new Coord2D(0, 2, 0, 2), new Coord2D(0, 1, 0, 1) }), 3, 3, 3, 12, 3, ModelRendererTurbo.MR_FRONT, new float[] {2 ,1 ,2 ,1 ,2 ,1 ,2 ,1}); // Shape 177
		rightTrackWheelModels[16].setRotationPoint(7.5F, -7.5F, -10.5F);
	}

	private void initleftTrackModel_1()
	{
		leftTrackModel[0] = new ModelRendererTurbo(this, 2, 42, textureX, textureY); // Box 228
		leftTrackModel[1] = new ModelRendererTurbo(this, 2, 42, textureX, textureY); // Box 229
		leftTrackModel[2] = new ModelRendererTurbo(this, 2, 42, textureX, textureY); // Box 230
		leftTrackModel[3] = new ModelRendererTurbo(this, 2, 42, textureX, textureY); // Box 231
		leftTrackModel[4] = new ModelRendererTurbo(this, 2, 42, textureX, textureY); // Box 232
		leftTrackModel[5] = new ModelRendererTurbo(this, 2, 42, textureX, textureY); // Box 233
		leftTrackModel[6] = new ModelRendererTurbo(this, 2, 42, textureX, textureY); // Box 234
		leftTrackModel[7] = new ModelRendererTurbo(this, 2, 42, textureX, textureY); // Box 235
		leftTrackModel[8] = new ModelRendererTurbo(this, 2, 42, textureX, textureY); // Box 236
		leftTrackModel[9] = new ModelRendererTurbo(this, 2, 42, textureX, textureY); // Box 237
		leftTrackModel[10] = new ModelRendererTurbo(this, 2, 42, textureX, textureY); // Box 238
		leftTrackModel[11] = new ModelRendererTurbo(this, 2, 42, textureX, textureY); // Box 239
		leftTrackModel[12] = new ModelRendererTurbo(this, 2, 42, textureX, textureY); // Box 240
		leftTrackModel[13] = new ModelRendererTurbo(this, 2, 42, textureX, textureY); // Box 241
		leftTrackModel[14] = new ModelRendererTurbo(this, 2, 42, textureX, textureY); // Box 242
		leftTrackModel[15] = new ModelRendererTurbo(this, 2, 42, textureX, textureY); // Box 243
		leftTrackModel[16] = new ModelRendererTurbo(this, 2, 42, textureX, textureY); // Box 244
		leftTrackModel[17] = new ModelRendererTurbo(this, 2, 42, textureX, textureY); // Box 245
		leftTrackModel[18] = new ModelRendererTurbo(this, 2, 42, textureX, textureY); // Box 246
		leftTrackModel[19] = new ModelRendererTurbo(this, 2, 42, textureX, textureY); // Box 247
		leftTrackModel[20] = new ModelRendererTurbo(this, 2, 42, textureX, textureY); // Box 248
		leftTrackModel[21] = new ModelRendererTurbo(this, 2, 42, textureX, textureY); // Box 249
		leftTrackModel[22] = new ModelRendererTurbo(this, 2, 42, textureX, textureY); // Box 250
		leftTrackModel[23] = new ModelRendererTurbo(this, 2, 42, textureX, textureY); // Box 251
		leftTrackModel[24] = new ModelRendererTurbo(this, 2, 42, textureX, textureY); // Box 252
		leftTrackModel[25] = new ModelRendererTurbo(this, 2, 42, textureX, textureY); // Box 253
		leftTrackModel[26] = new ModelRendererTurbo(this, 2, 42, textureX, textureY); // Box 254
		leftTrackModel[27] = new ModelRendererTurbo(this, 2, 42, textureX, textureY); // Box 255
		leftTrackModel[28] = new ModelRendererTurbo(this, 2, 42, textureX, textureY); // Box 256
		leftTrackModel[29] = new ModelRendererTurbo(this, 2, 42, textureX, textureY); // Box 257
		leftTrackModel[30] = new ModelRendererTurbo(this, 2, 42, textureX, textureY); // Box 258

		leftTrackModel[0].addShapeBox(0F, -0.5F, 0F, 5, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 228
		leftTrackModel[0].setRotationPoint(13F, -10F, 10F);

		leftTrackModel[1].addShapeBox(0F, -0.5F, 0F, 5, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 229
		leftTrackModel[1].setRotationPoint(18F, -10F, 10F);
		leftTrackModel[1].rotateAngleZ = -0.05235988F;

		leftTrackModel[2].addShapeBox(0F, -0.5F, 0F, 5, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 230
		leftTrackModel[2].setRotationPoint(23F, -9.5F, 10F);
		leftTrackModel[2].rotateAngleZ = -0.41887902F;

		leftTrackModel[3].addShapeBox(0F, 0F, 0F, 5, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 231
		leftTrackModel[3].setRotationPoint(28F, -8F, 10F);
		leftTrackModel[3].rotateAngleZ = -0.78539816F;

		leftTrackModel[4].addShapeBox(0F, 0F, 0F, 5, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 232
		leftTrackModel[4].setRotationPoint(32F, 1F, 10F);
		leftTrackModel[4].rotateAngleZ = -2.16420827F;

		leftTrackModel[5].addShapeBox(0F, 0F, 0F, 5, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 233
		leftTrackModel[5].setRotationPoint(29F, 5F, 10F);
		leftTrackModel[5].rotateAngleZ = -2.32128791F;

		leftTrackModel[6].addShapeBox(0.2F, -1F, 0F, 5, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 234
		leftTrackModel[6].setRotationPoint(25F, 8F, 10F);
		leftTrackModel[6].rotateAngleZ = -2.82743339F;

		leftTrackModel[7].addShapeBox(0F, 0F, 0F, 5, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 235
		leftTrackModel[7].setRotationPoint(20F, 10.5F, 10F);
		leftTrackModel[7].rotateAngleZ = 3.14159265F;

		leftTrackModel[8].addShapeBox(0F, 0F, 0F, 5, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 236
		leftTrackModel[8].setRotationPoint(15F, 10.5F, 10F);
		leftTrackModel[8].rotateAngleZ = 3.14159265F;

		leftTrackModel[9].addShapeBox(0F, 0F, 0F, 5, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 237
		leftTrackModel[9].setRotationPoint(10F, 10.5F, 10F);
		leftTrackModel[9].rotateAngleZ = 3.14159265F;

		leftTrackModel[10].addShapeBox(0F, 0F, 0F, 5, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 238
		leftTrackModel[10].setRotationPoint(-5F, 10.5F, 10F);
		leftTrackModel[10].rotateAngleZ = 3.14159265F;

		leftTrackModel[11].addShapeBox(0F, 0F, 0F, 5, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 239
		leftTrackModel[11].setRotationPoint(0F, 10.5F, 10F);
		leftTrackModel[11].rotateAngleZ = 3.14159265F;

		leftTrackModel[12].addShapeBox(0F, 0F, 0F, 5, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 240
		leftTrackModel[12].setRotationPoint(5F, 10.5F, 10F);
		leftTrackModel[12].rotateAngleZ = 3.14159265F;

		leftTrackModel[13].addShapeBox(0F, 0F, 0F, 5, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 241
		leftTrackModel[13].setRotationPoint(-15F, 10.5F, 10F);
		leftTrackModel[13].rotateAngleZ = 3.14159265F;

		leftTrackModel[14].addShapeBox(0F, 0F, 0F, 5, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 242
		leftTrackModel[14].setRotationPoint(-10F, 10.5F, 10F);
		leftTrackModel[14].rotateAngleZ = 3.14159265F;

		leftTrackModel[15].addShapeBox(0F, 0F, 0F, 5, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 243
		leftTrackModel[15].setRotationPoint(-33.5F, 7F, 10F);
		leftTrackModel[15].rotateAngleZ = 2.3387412F;

		leftTrackModel[16].addShapeBox(0F, 0F, 0F, 5, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 244
		leftTrackModel[16].setRotationPoint(-37F, 3F, 10F);
		leftTrackModel[16].rotateAngleZ = 1.51843645F;

		leftTrackModel[17].addShapeBox(0F, 0F, 0F, 5, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 245
		leftTrackModel[17].setRotationPoint(-36F, -2F, 10F);
		leftTrackModel[17].rotateAngleZ = 0.59341195F;

		leftTrackModel[18].addShapeBox(0F, 0F, 0F, 5, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 246
		leftTrackModel[18].setRotationPoint(-32F, -5F, 10F);
		leftTrackModel[18].rotateAngleZ = 0.12217305F;

		leftTrackModel[19].addShapeBox(0F, 0F, 0F, 5, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 247
		leftTrackModel[19].setRotationPoint(32F, -4F, 10F);
		leftTrackModel[19].rotateAngleZ = -1.57079633F;

		leftTrackModel[20].addShapeBox(5F, -0.5F, 0F, 5, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 248
		leftTrackModel[20].setRotationPoint(-31.5F, -4.5F, 10F);
		leftTrackModel[20].rotateAngleZ = 0.12217305F;

		leftTrackModel[21].addShapeBox(15F, -0.5F, 0F, 5, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 249
		leftTrackModel[21].setRotationPoint(-31.5F, -4.5F, 10F);
		leftTrackModel[21].rotateAngleZ = 0.12217305F;

		leftTrackModel[22].addShapeBox(10F, -0.5F, 0F, 5, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 250
		leftTrackModel[22].setRotationPoint(-31.5F, -4.5F, 10F);
		leftTrackModel[22].rotateAngleZ = 0.12217305F;

		leftTrackModel[23].addShapeBox(35F, -0.5F, 0F, 5, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 251
		leftTrackModel[23].setRotationPoint(-31.5F, -4.5F, 10F);
		leftTrackModel[23].rotateAngleZ = 0.12217305F;

		leftTrackModel[24].addShapeBox(30F, -0.5F, 0F, 5, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 252
		leftTrackModel[24].setRotationPoint(-31.5F, -4.5F, 10F);
		leftTrackModel[24].rotateAngleZ = 0.12217305F;

		leftTrackModel[25].addShapeBox(25F, -0.5F, 0F, 5, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 253
		leftTrackModel[25].setRotationPoint(-31.5F, -4.5F, 10F);
		leftTrackModel[25].rotateAngleZ = 0.12217305F;

		leftTrackModel[26].addShapeBox(20F, -0.5F, 0F, 5, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 254
		leftTrackModel[26].setRotationPoint(-31.5F, -4.5F, 10F);
		leftTrackModel[26].rotateAngleZ = 0.12217305F;

		leftTrackModel[27].addShapeBox(40F, -0.5F, 0F, 5, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 255
		leftTrackModel[27].setRotationPoint(-31.5F, -4.5F, 10F);
		leftTrackModel[27].rotateAngleZ = 0.12217305F;

		leftTrackModel[28].addShapeBox(0F, -0.5F, 0F, 5, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 256
		leftTrackModel[28].setRotationPoint(-19.5F, 10F, 10F);
		leftTrackModel[28].rotateAngleZ = 2.89724656F;

		leftTrackModel[29].addShapeBox(5F, -0.5F, 0F, 5, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 257
		leftTrackModel[29].setRotationPoint(-19.5F, 10F, 10F);
		leftTrackModel[29].rotateAngleZ = 2.89724656F;

		leftTrackModel[30].addShapeBox(10F, -0.5F, 0F, 5, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 258
		leftTrackModel[30].setRotationPoint(-19.5F, 10F, 10F);
		leftTrackModel[30].rotateAngleZ = 2.89724656F;
	}

	private void initrightTrackModel_1()
	{
		rightTrackModel[0] = new ModelRendererTurbo(this, 2, 42, textureX, textureY); // Box 111
		rightTrackModel[1] = new ModelRendererTurbo(this, 2, 42, textureX, textureY); // Box 113
		rightTrackModel[2] = new ModelRendererTurbo(this, 2, 42, textureX, textureY); // Box 114
		rightTrackModel[3] = new ModelRendererTurbo(this, 2, 42, textureX, textureY); // Box 116
		rightTrackModel[4] = new ModelRendererTurbo(this, 2, 42, textureX, textureY); // Box 118
		rightTrackModel[5] = new ModelRendererTurbo(this, 2, 42, textureX, textureY); // Box 119
		rightTrackModel[6] = new ModelRendererTurbo(this, 2, 42, textureX, textureY); // Box 120
		rightTrackModel[7] = new ModelRendererTurbo(this, 2, 42, textureX, textureY); // Box 122
		rightTrackModel[8] = new ModelRendererTurbo(this, 2, 42, textureX, textureY); // Box 123
		rightTrackModel[9] = new ModelRendererTurbo(this, 2, 42, textureX, textureY); // Box 124
		rightTrackModel[10] = new ModelRendererTurbo(this, 2, 42, textureX, textureY); // Box 125
		rightTrackModel[11] = new ModelRendererTurbo(this, 2, 42, textureX, textureY); // Box 126
		rightTrackModel[12] = new ModelRendererTurbo(this, 2, 42, textureX, textureY); // Box 127
		rightTrackModel[13] = new ModelRendererTurbo(this, 2, 42, textureX, textureY); // Box 128
		rightTrackModel[14] = new ModelRendererTurbo(this, 2, 42, textureX, textureY); // Box 129
		rightTrackModel[15] = new ModelRendererTurbo(this, 2, 42, textureX, textureY); // Box 132
		rightTrackModel[16] = new ModelRendererTurbo(this, 2, 42, textureX, textureY); // Box 133
		rightTrackModel[17] = new ModelRendererTurbo(this, 2, 42, textureX, textureY); // Box 134
		rightTrackModel[18] = new ModelRendererTurbo(this, 2, 42, textureX, textureY); // Box 135
		rightTrackModel[19] = new ModelRendererTurbo(this, 2, 42, textureX, textureY); // Box 227
		rightTrackModel[20] = new ModelRendererTurbo(this, 2, 42, textureX, textureY); // Box 218
		rightTrackModel[21] = new ModelRendererTurbo(this, 2, 42, textureX, textureY); // Box 219
		rightTrackModel[22] = new ModelRendererTurbo(this, 2, 42, textureX, textureY); // Box 220
		rightTrackModel[23] = new ModelRendererTurbo(this, 2, 42, textureX, textureY); // Box 221
		rightTrackModel[24] = new ModelRendererTurbo(this, 2, 42, textureX, textureY); // Box 222
		rightTrackModel[25] = new ModelRendererTurbo(this, 2, 42, textureX, textureY); // Box 223
		rightTrackModel[26] = new ModelRendererTurbo(this, 2, 42, textureX, textureY); // Box 224
		rightTrackModel[27] = new ModelRendererTurbo(this, 2, 42, textureX, textureY); // Box 225
		rightTrackModel[28] = new ModelRendererTurbo(this, 2, 42, textureX, textureY); // Box 226
		rightTrackModel[29] = new ModelRendererTurbo(this, 2, 42, textureX, textureY); // Box 228
		rightTrackModel[30] = new ModelRendererTurbo(this, 2, 42, textureX, textureY); // Box 229

		rightTrackModel[0].addShapeBox(0F, -0.5F, 0F, 5, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 111
		rightTrackModel[0].setRotationPoint(13F, -10F, -16F);

		rightTrackModel[1].addShapeBox(0F, -0.5F, 0F, 5, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 113
		rightTrackModel[1].setRotationPoint(18F, -10F, -16F);
		rightTrackModel[1].rotateAngleZ = -0.05235988F;

		rightTrackModel[2].addShapeBox(0F, 0F, 0F, 5, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 114
		rightTrackModel[2].setRotationPoint(23F, -10F, -16F);
		rightTrackModel[2].rotateAngleZ = -0.41887902F;

		rightTrackModel[3].addShapeBox(0F, 0F, 0F, 5, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 116
		rightTrackModel[3].setRotationPoint(28F, -8F, -16F);
		rightTrackModel[3].rotateAngleZ = -0.78539816F;

		rightTrackModel[4].addShapeBox(0F, 0F, 0F, 5, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 118
		rightTrackModel[4].setRotationPoint(32F, 1F, -16F);
		rightTrackModel[4].rotateAngleZ = -2.16420827F;

		rightTrackModel[5].addShapeBox(0F, 0F, 0F, 5, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 119
		rightTrackModel[5].setRotationPoint(29F, 5F, -16F);
		rightTrackModel[5].rotateAngleZ = -2.32128791F;

		rightTrackModel[6].addShapeBox(0.2F, 0F, 0F, 5, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 120
		rightTrackModel[6].setRotationPoint(25F, 9F, -16F);
		rightTrackModel[6].rotateAngleZ = -2.82743339F;

		rightTrackModel[7].addShapeBox(0F, 0F, 0F, 5, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 122
		rightTrackModel[7].setRotationPoint(20F, 10.5F, -16F);
		rightTrackModel[7].rotateAngleZ = 3.14159265F;

		rightTrackModel[8].addShapeBox(0F, 0F, 0F, 5, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 123
		rightTrackModel[8].setRotationPoint(15F, 10.5F, -16F);
		rightTrackModel[8].rotateAngleZ = 3.14159265F;

		rightTrackModel[9].addShapeBox(0F, 0F, 0F, 5, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 124
		rightTrackModel[9].setRotationPoint(10F, 10.5F, -16F);
		rightTrackModel[9].rotateAngleZ = 3.14159265F;

		rightTrackModel[10].addShapeBox(0F, 0F, 0F, 5, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 125
		rightTrackModel[10].setRotationPoint(-5F, 10.5F, -16F);
		rightTrackModel[10].rotateAngleZ = 3.14159265F;

		rightTrackModel[11].addShapeBox(0F, 0F, 0F, 5, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 126
		rightTrackModel[11].setRotationPoint(0F, 10.5F, -16F);
		rightTrackModel[11].rotateAngleZ = 3.14159265F;

		rightTrackModel[12].addShapeBox(0F, 0F, 0F, 5, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 127
		rightTrackModel[12].setRotationPoint(5F, 10.5F, -16F);
		rightTrackModel[12].rotateAngleZ = 3.14159265F;

		rightTrackModel[13].addShapeBox(0F, 0F, 0F, 5, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		rightTrackModel[13].setRotationPoint(-15F, 10.5F, -16F);
		rightTrackModel[13].rotateAngleZ = 3.14159265F;

		rightTrackModel[14].addShapeBox(0F, 0F, 0F, 5, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 129
		rightTrackModel[14].setRotationPoint(-10F, 10.5F, -16F);
		rightTrackModel[14].rotateAngleZ = 3.14159265F;

		rightTrackModel[15].addShapeBox(0F, 0F, 0F, 5, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 132
		rightTrackModel[15].setRotationPoint(-33.5F, 7F, -16F);
		rightTrackModel[15].rotateAngleZ = 2.3387412F;

		rightTrackModel[16].addShapeBox(0F, 0F, 0F, 5, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 133
		rightTrackModel[16].setRotationPoint(-37F, 3F, -16F);
		rightTrackModel[16].rotateAngleZ = 1.51843645F;

		rightTrackModel[17].addShapeBox(0F, 0F, 0F, 5, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 134
		rightTrackModel[17].setRotationPoint(-36F, -2F, -16F);
		rightTrackModel[17].rotateAngleZ = 0.59341195F;

		rightTrackModel[18].addShapeBox(0F, 0F, 0F, 5, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 135
		rightTrackModel[18].setRotationPoint(-31F, -5F, -16F);
		rightTrackModel[18].rotateAngleZ = 0.12217305F;

		rightTrackModel[19].addShapeBox(0F, 0F, 0F, 5, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 227
		rightTrackModel[19].setRotationPoint(32F, -4F, -16F);
		rightTrackModel[19].rotateAngleZ = -1.57079633F;

		rightTrackModel[20].addShapeBox(5F, -0.5F, 0F, 5, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 218
		rightTrackModel[20].setRotationPoint(-31.5F, -4.5F, -16F);
		rightTrackModel[20].rotateAngleZ = 0.12217305F;

		rightTrackModel[21].addShapeBox(15F, -0.5F, 0F, 5, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 219
		rightTrackModel[21].setRotationPoint(-31.5F, -4.5F, -16F);
		rightTrackModel[21].rotateAngleZ = 0.12217305F;

		rightTrackModel[22].addShapeBox(10F, -0.5F, 0F, 5, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 220
		rightTrackModel[22].setRotationPoint(-31.5F, -4.5F, -16F);
		rightTrackModel[22].rotateAngleZ = 0.12217305F;

		rightTrackModel[23].addShapeBox(35F, -0.5F, 0F, 5, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 221
		rightTrackModel[23].setRotationPoint(-31.5F, -4.5F, -16F);
		rightTrackModel[23].rotateAngleZ = 0.12217305F;

		rightTrackModel[24].addShapeBox(30F, -0.5F, 0F, 5, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 222
		rightTrackModel[24].setRotationPoint(-31.5F, -4.5F, -16F);
		rightTrackModel[24].rotateAngleZ = 0.12217305F;

		rightTrackModel[25].addShapeBox(25F, -0.5F, 0F, 5, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 223
		rightTrackModel[25].setRotationPoint(-31.5F, -4.5F, -16F);
		rightTrackModel[25].rotateAngleZ = 0.12217305F;

		rightTrackModel[26].addShapeBox(20F, -0.5F, 0F, 5, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 224
		rightTrackModel[26].setRotationPoint(-31.5F, -4.5F, -16F);
		rightTrackModel[26].rotateAngleZ = 0.12217305F;

		rightTrackModel[27].addShapeBox(40F, -0.5F, 0F, 5, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 225
		rightTrackModel[27].setRotationPoint(-31.5F, -4.5F, -16F);
		rightTrackModel[27].rotateAngleZ = 0.12217305F;

		rightTrackModel[28].addShapeBox(0F, -0.5F, 0F, 5, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 226
		rightTrackModel[28].setRotationPoint(-19.5F, 10F, -16F);
		rightTrackModel[28].rotateAngleZ = 2.89724656F;

		rightTrackModel[29].addShapeBox(5F, -0.5F, 0F, 5, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 228
		rightTrackModel[29].setRotationPoint(-19.5F, 10F, -16F);
		rightTrackModel[29].rotateAngleZ = 2.89724656F;

		rightTrackModel[30].addShapeBox(10F, -0.5F, 0F, 5, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 229
		rightTrackModel[30].setRotationPoint(-19.5F, 10F, -16F);
		rightTrackModel[30].rotateAngleZ = 2.89724656F;
	}
}