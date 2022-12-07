//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2021 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: BlombergB
// Model Creator: Bida
// Created on: 09.04.2020 - 17:29:51
// Last changed on: 09.04.2020 - 17:29:51

package train.client.render.models; //Path where the model is located

import tmt.ModelConverter;
import tmt.ModelRendererTurbo;

public class ModelBlombergBnew extends ModelConverter //Same as Filename
{
	int textureX = 128;
	int textureY = 64;

	public ModelBlombergBnew() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[116];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 4
		bodyModel[1] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 5
		bodyModel[2] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 30 wheel
		bodyModel[3] = new ModelRendererTurbo(this, 39, 28, textureX, textureY); // Box 60
		bodyModel[4] = new ModelRendererTurbo(this, 1, 47, textureX, textureY); // Box 96
		bodyModel[5] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 46 wheel
		bodyModel[6] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 47 wheel
		bodyModel[7] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 48 wheel
		bodyModel[8] = new ModelRendererTurbo(this, 67, 34, textureX, textureY); // Box 63
		bodyModel[9] = new ModelRendererTurbo(this, 67, 34, textureX, textureY); // Box 69
		bodyModel[10] = new ModelRendererTurbo(this, 71, 46, textureX, textureY); // Box 71
		bodyModel[11] = new ModelRendererTurbo(this, 55, 45, textureX, textureY); // Box 73
		bodyModel[12] = new ModelRendererTurbo(this, 69, 46, textureX, textureY); // Box 75
		bodyModel[13] = new ModelRendererTurbo(this, 61, 46, textureX, textureY); // Box 76
		bodyModel[14] = new ModelRendererTurbo(this, 55, 51, textureX, textureY); // Box 77
		bodyModel[15] = new ModelRendererTurbo(this, 69, 51, textureX, textureY); // Box 79
		bodyModel[16] = new ModelRendererTurbo(this, 55, 45, textureX, textureY); // Box 81
		bodyModel[17] = new ModelRendererTurbo(this, 61, 51, textureX, textureY); // Box 82
		bodyModel[18] = new ModelRendererTurbo(this, 55, 46, textureX, textureY); // Box 116
		bodyModel[19] = new ModelRendererTurbo(this, 71, 51, textureX, textureY); // Box 117
		bodyModel[20] = new ModelRendererTurbo(this, 29, 47, textureX, textureY); // Box 122
		bodyModel[21] = new ModelRendererTurbo(this, 29, 47, textureX, textureY); // Box 123
		bodyModel[22] = new ModelRendererTurbo(this, 111, 52, textureX, textureY); // Box 124
		bodyModel[23] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 3
		bodyModel[24] = new ModelRendererTurbo(this, 16, 22, textureX, textureY); // Box 24
		bodyModel[25] = new ModelRendererTurbo(this, 17, 31, textureX, textureY); // Box 27
		bodyModel[26] = new ModelRendererTurbo(this, 8, 8, textureX, textureY); // Box 104
		bodyModel[27] = new ModelRendererTurbo(this, 1, 8, textureX, textureY); // Box 110
		bodyModel[28] = new ModelRendererTurbo(this, 1, 22, textureX, textureY); // Box 111
		bodyModel[29] = new ModelRendererTurbo(this, 31, 22, textureX, textureY); // Box 112
		bodyModel[30] = new ModelRendererTurbo(this, 1, 28, textureX, textureY); // Box 113
		bodyModel[31] = new ModelRendererTurbo(this, 49, 25, textureX, textureY); // Box 114
		bodyModel[32] = new ModelRendererTurbo(this, 80, 28, textureX, textureY); // Box 116
		bodyModel[33] = new ModelRendererTurbo(this, 87, 28, textureX, textureY); // Box 117
		bodyModel[34] = new ModelRendererTurbo(this, 65, 31, textureX, textureY); // Box 119
		bodyModel[35] = new ModelRendererTurbo(this, 56, 28, textureX, textureY); // Box 121
		bodyModel[36] = new ModelRendererTurbo(this, 49, 28, textureX, textureY); // Box 123
		bodyModel[37] = new ModelRendererTurbo(this, 67, 34, textureX, textureY); // Box 124
		bodyModel[38] = new ModelRendererTurbo(this, 67, 34, textureX, textureY); // Box 125
		bodyModel[39] = new ModelRendererTurbo(this, 49, 22, textureX, textureY); // Box 126
		bodyModel[40] = new ModelRendererTurbo(this, 64, 22, textureX, textureY); // Box 127
		bodyModel[41] = new ModelRendererTurbo(this, 79, 22, textureX, textureY); // Box 128
		bodyModel[42] = new ModelRendererTurbo(this, 86, 8, textureX, textureY); // Box 130
		bodyModel[43] = new ModelRendererTurbo(this, 96, 1, textureX, textureY); // Box 153
		bodyModel[44] = new ModelRendererTurbo(this, 91, 1, textureX, textureY); // Box 155
		bodyModel[45] = new ModelRendererTurbo(this, 91, 1, textureX, textureY); // Box 156
		bodyModel[46] = new ModelRendererTurbo(this, 76, 2, textureX, textureY); // Box 161
		bodyModel[47] = new ModelRendererTurbo(this, 76, 2, textureX, textureY); // Box 162
		bodyModel[48] = new ModelRendererTurbo(this, 1, 12, textureX, textureY); // Box 172
		bodyModel[49] = new ModelRendererTurbo(this, 8, 12, textureX, textureY); // Box 173
		bodyModel[50] = new ModelRendererTurbo(this, 68, 5, textureX, textureY); // Box 66
		bodyModel[51] = new ModelRendererTurbo(this, 54, 12, textureX, textureY); // Box 67
		bodyModel[52] = new ModelRendererTurbo(this, 67, 10, textureX, textureY); // Box 37
		bodyModel[53] = new ModelRendererTurbo(this, 67, 10, textureX, textureY); // Box 37
		bodyModel[54] = new ModelRendererTurbo(this, 67, 10, textureX, textureY); // Box 37
		bodyModel[55] = new ModelRendererTurbo(this, 68, 48, textureX, textureY); // Box 109
		bodyModel[56] = new ModelRendererTurbo(this, 34, 2, textureX, textureY); // Box 105
		bodyModel[57] = new ModelRendererTurbo(this, 63, 2, textureX, textureY); // Box 135
		bodyModel[58] = new ModelRendererTurbo(this, 63, 6, textureX, textureY); // Box 136
		bodyModel[59] = new ModelRendererTurbo(this, 63, 6, textureX, textureY); // Box 137
		bodyModel[60] = new ModelRendererTurbo(this, 8, 31, textureX, textureY); // Box 80
		bodyModel[61] = new ModelRendererTurbo(this, 15, 28, textureX, textureY); // Box 25
		bodyModel[62] = new ModelRendererTurbo(this, 25, 28, textureX, textureY); // Box 116
		bodyModel[63] = new ModelRendererTurbo(this, 32, 31, textureX, textureY); // Box 105
		bodyModel[64] = new ModelRendererTurbo(this, 56, 31, textureX, textureY); // Box 108
		bodyModel[65] = new ModelRendererTurbo(this, 63, 28, textureX, textureY); // Box 110
		bodyModel[66] = new ModelRendererTurbo(this, 73, 28, textureX, textureY); // Box 111
		bodyModel[67] = new ModelRendererTurbo(this, 80, 31, textureX, textureY); // Box 113
		bodyModel[68] = new ModelRendererTurbo(this, 20, 42, textureX, textureY); // Box 117
		bodyModel[69] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 109
		bodyModel[70] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 110
		bodyModel[71] = new ModelRendererTurbo(this, 20, 37, textureX, textureY); // Box 111
		bodyModel[72] = new ModelRendererTurbo(this, 101, 1, textureX, textureY); // Box 112
		bodyModel[73] = new ModelRendererTurbo(this, 101, 1, textureX, textureY); // Box 113
		bodyModel[74] = new ModelRendererTurbo(this, 86, 6, textureX, textureY); // Box 114
		bodyModel[75] = new ModelRendererTurbo(this, 87, 34, textureX, textureY); // Box 116
		bodyModel[76] = new ModelRendererTurbo(this, 25, 42, textureX, textureY); // Box 117
		bodyModel[77] = new ModelRendererTurbo(this, 31, 44, textureX, textureY); // Box 118
		bodyModel[78] = new ModelRendererTurbo(this, 86, 1, textureX, textureY); // Box 119
		bodyModel[79] = new ModelRendererTurbo(this, 86, 1, textureX, textureY); // Box 120
		bodyModel[80] = new ModelRendererTurbo(this, 96, 1, textureX, textureY); // Box 121
		bodyModel[81] = new ModelRendererTurbo(this, 49, 34, textureX, textureY); // Box 122
		bodyModel[82] = new ModelRendererTurbo(this, 25, 37, textureX, textureY); // Box 123
		bodyModel[83] = new ModelRendererTurbo(this, 31, 39, textureX, textureY); // Box 124
		bodyModel[84] = new ModelRendererTurbo(this, 91, 47, textureX, textureY); // Box 125
		bodyModel[85] = new ModelRendererTurbo(this, 24, 10, textureX, textureY); // Box 126
		bodyModel[86] = new ModelRendererTurbo(this, 24, 10, textureX, textureY); // Box 127
		bodyModel[87] = new ModelRendererTurbo(this, 24, 10, textureX, textureY); // Box 128
		bodyModel[88] = new ModelRendererTurbo(this, 37, 12, textureX, textureY); // Box 129
		bodyModel[89] = new ModelRendererTurbo(this, 40, 6, textureX, textureY); // Box 130
		bodyModel[90] = new ModelRendererTurbo(this, 40, 6, textureX, textureY); // Box 131
		bodyModel[91] = new ModelRendererTurbo(this, 25, 5, textureX, textureY); // Box 132
		bodyModel[92] = new ModelRendererTurbo(this, 45, 9, textureX, textureY); // Box 133
		bodyModel[93] = new ModelRendererTurbo(this, 45, 9, textureX, textureY); // Box 134
		bodyModel[94] = new ModelRendererTurbo(this, 32, 28, textureX, textureY); // Box 135
		bodyModel[95] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 136
		bodyModel[96] = new ModelRendererTurbo(this, 39, 34, textureX, textureY); // Box 137
		bodyModel[97] = new ModelRendererTurbo(this, 8, 28, textureX, textureY); // Box 138
		bodyModel[98] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 139
		bodyModel[99] = new ModelRendererTurbo(this, 1, 34, textureX, textureY); // Box 140
		bodyModel[100] = new ModelRendererTurbo(this, 96, 1, textureX, textureY); // Box 141
		bodyModel[101] = new ModelRendererTurbo(this, 96, 1, textureX, textureY); // Box 142
		bodyModel[102] = new ModelRendererTurbo(this, 86, 6, textureX, textureY); // Box 143
		bodyModel[103] = new ModelRendererTurbo(this, 101, 1, textureX, textureY); // Box 144
		bodyModel[104] = new ModelRendererTurbo(this, 101, 1, textureX, textureY); // Box 145
		bodyModel[105] = new ModelRendererTurbo(this, 86, 8, textureX, textureY); // Box 146
		bodyModel[106] = new ModelRendererTurbo(this, 91, 1, textureX, textureY); // Box 147
		bodyModel[107] = new ModelRendererTurbo(this, 91, 1, textureX, textureY); // Box 148
		bodyModel[108] = new ModelRendererTurbo(this, 86, 1, textureX, textureY); // Box 149
		bodyModel[109] = new ModelRendererTurbo(this, 86, 1, textureX, textureY); // Box 150
		bodyModel[110] = new ModelRendererTurbo(this, 7, 43, textureX, textureY); // Box 153
		bodyModel[111] = new ModelRendererTurbo(this, 13, 45, textureX, textureY); // Box 154
		bodyModel[112] = new ModelRendererTurbo(this, 13, 40, textureX, textureY); // Box 155
		bodyModel[113] = new ModelRendererTurbo(this, 7, 38, textureX, textureY); // Box 156
		bodyModel[114] = new ModelRendererTurbo(this, 2, 43, textureX, textureY); // Box 157
		bodyModel[115] = new ModelRendererTurbo(this, 2, 38, textureX, textureY); // Box 158

		bodyModel[0].addBox(0F, 0F, 0F, 2, 2, 18, 0F); // Box 4
		bodyModel[0].setRotationPoint(-8F, 6F, -9F);

		bodyModel[1].addBox(0F, 0F, 0F, 2, 2, 18, 0F); // Box 5
		bodyModel[1].setRotationPoint(6F, 6F, -9F);

		bodyModel[2].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 30 wheel
		bodyModel[2].setRotationPoint(7F, 7F, 6F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 60
		bodyModel[3].setRotationPoint(8F, 5F, -8.5F);

		bodyModel[4].addBox(0F, 0F, 0F, 6, 1, 15, 0F); // Box 96
		bodyModel[4].setRotationPoint(-3F, 4.5F, -7.5F);

		bodyModel[5].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 46 wheel
		bodyModel[5].setRotationPoint(-7F, 7F, 6F);

		bodyModel[6].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 47 wheel
		bodyModel[6].setRotationPoint(-7F, 7F, -6F);

		bodyModel[7].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 48 wheel
		bodyModel[7].setRotationPoint(7F, 7F, -6F);

		bodyModel[8].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 63
		bodyModel[8].setRotationPoint(5.5F, 9.01F, -8.5F);

		bodyModel[9].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 69
		bodyModel[9].setRotationPoint(-8.5F, 9.01F, -8.5F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 71
		bodyModel[10].setRotationPoint(-11.5F, 4F, -8.5F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -0.5F, 0F, -1F); // Box 73
		bodyModel[11].setRotationPoint(-11.5F, 5F, -5.5F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 75
		bodyModel[12].setRotationPoint(-11.5F, 4F, -5.5F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 76
		bodyModel[13].setRotationPoint(-11.5F, 4F, 4.5F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 77
		bodyModel[14].setRotationPoint(10.5F, 4F, -8.5F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 79
		bodyModel[15].setRotationPoint(10.5F, 4F, 4.5F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, -1F); // Box 81
		bodyModel[16].setRotationPoint(10.5F, 5F, -5.5F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 82
		bodyModel[17].setRotationPoint(10.5F, 4F, -5.5F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F); // Box 116
		bodyModel[18].setRotationPoint(-11.5F, 4F, 5.5F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, 0F); // Box 117
		bodyModel[19].setRotationPoint(10.5F, 4F, 5.5F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 7, 3, 11, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 122
		bodyModel[20].setRotationPoint(-9F, 5.5F, -5.5F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 7, 3, 11, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 123
		bodyModel[21].setRotationPoint(2F, 5.5F, -5.5F);

		bodyModel[22].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 124
		bodyModel[22].setRotationPoint(-2F, 4F, -2F);

		bodyModel[23].addBox(0F, 0F, 0F, 21, 1, 1, 0F); // Box 3
		bodyModel[23].setRotationPoint(-10.5F, 4F, -8.5F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,-1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 24
		bodyModel[24].setRotationPoint(-3F, 3F, -8.5F);

		bodyModel[25].addBox(0F, 0F, 0F, 5, 1, 1, 0F); // Box 27
		bodyModel[25].setRotationPoint(-2.5F, 5F, -8.5F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 104
		bodyModel[26].setRotationPoint(-8F, 6F, -9.5F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 110
		bodyModel[27].setRotationPoint(6F, 6F, -9.5F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,-1.5F, -0.25F, 0F, -1.5F, -0.25F, 0F, -1.5F, -0.25F, 0F, -1.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 111
		bodyModel[28].setRotationPoint(-10F, 3F, -8.5F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,-1.5F, -0.25F, 0F, -1.5F, -0.25F, 0F, -1.5F, -0.25F, 0F, -1.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 112
		bodyModel[29].setRotationPoint(4F, 3F, -8.5F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 113
		bodyModel[30].setRotationPoint(-10F, 5F, -8.5F);

		bodyModel[31].addBox(0F, 0F, 0F, 21, 1, 1, 0F); // Box 114
		bodyModel[31].setRotationPoint(-10.5F, 4F, 7.5F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 116
		bodyModel[32].setRotationPoint(-6F, 5F, 7.5F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 117
		bodyModel[33].setRotationPoint(-10F, 5F, 7.5F);

		bodyModel[34].addBox(0F, 0F, 0F, 5, 1, 1, 0F); // Box 119
		bodyModel[34].setRotationPoint(-2.5F, 5F, 7.5F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 121
		bodyModel[35].setRotationPoint(4F, 5F, 7.5F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 123
		bodyModel[36].setRotationPoint(8F, 5F, 7.5F);

		bodyModel[37].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 124
		bodyModel[37].setRotationPoint(5.5F, 9.01F, 7.5F);

		bodyModel[38].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 125
		bodyModel[38].setRotationPoint(-8.5F, 9.01F, 7.5F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,-1.5F, -0.25F, 0F, -1.5F, -0.25F, 0F, -1.5F, -0.25F, 0F, -1.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 126
		bodyModel[39].setRotationPoint(4F, 3F, 7.5F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,-1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 127
		bodyModel[40].setRotationPoint(-3F, 3F, 7.5F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,-1.5F, -0.25F, 0F, -1.5F, -0.25F, 0F, -1.5F, -0.25F, 0F, -1.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[41].setRotationPoint(-10F, 3F, 7.5F);

		bodyModel[42].addBox(0F, 0F, 0F, 8, 1, 0, 0F); // Box 130
		bodyModel[42].setRotationPoint(-10F, 8F, 7.25F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 153
		bodyModel[43].setRotationPoint(2.5F, 4.5F, 7F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 155
		bodyModel[44].setRotationPoint(-3.5F, 4.5F, 7F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, -0.5F, 0.5F, -0.5F, -0.5F); // Box 156
		bodyModel[45].setRotationPoint(-3.5F, 7.5F, 7F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 161
		bodyModel[46].setRotationPoint(-2.5F, 3.75F, 7.75F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 162
		bodyModel[47].setRotationPoint(1.5F, 3.75F, 7.75F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 172
		bodyModel[48].setRotationPoint(6F, 6F, 8.5F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 173
		bodyModel[49].setRotationPoint(-8F, 6F, 8.5F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 66
		bodyModel[50].setRotationPoint(-2F, 6F, 6F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0.75F, 0F, -0.25F, 0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 67
		bodyModel[51].setRotationPoint(-2F, 7.5F, 5.5F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, -0.45F, 0F, 0F, -0.45F, 0F, -0.5F, -0.35F, 0F, -0.5F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, -0.5F, -0.35F, 0F, -0.5F, -0.35F, 0F); // Box 37
		bodyModel[52].setRotationPoint(-2F, 7.1F, 6F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, -0.35F, 0F, 0F, -0.35F, 0F, -0.5F, -0.35F, 0F, -0.5F, -0.35F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, -0.5F, -0.35F, 0F, -0.5F, -0.35F, 0F); // Box 37
		bodyModel[53].setRotationPoint(-2F, 6.4F, 6F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, -0.23F, 0F, 0F, -0.23F, 0F, -0.5F, -0.35F, 0F, -0.5F, -0.35F, 0F, 0F, -0.23F, 0F, 0F, -0.23F, 0F, -0.5F, -0.35F, 0F, -0.5F, -0.35F, 0F); // Box 37
		bodyModel[54].setRotationPoint(-2F, 6.75F, 7F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 5, 3, 12, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 109
		bodyModel[55].setRotationPoint(-2.25F, 5.25F, -6F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F); // Box 105
		bodyModel[56].setRotationPoint(-2.25F, 8.5F, -9.5F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, -1F, -0.5F, -0.5F, -1F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 135
		bodyModel[57].setRotationPoint(-2.25F, 8.5F, 8.5F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, 0.5F, 0.5F, -0.5F, 0.5F, 0.5F); // Box 136
		bodyModel[58].setRotationPoint(1.25F, 4F, 8F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, 0.5F, 0.5F, -0.5F, 0.5F, 0.5F); // Box 137
		bodyModel[59].setRotationPoint(-2.75F, 4F, 8F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 80
		bodyModel[60].setRotationPoint(-6F, 6F, -8.5F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F); // Box 25
		bodyModel[61].setRotationPoint(-4F, 5.5F, -8.5F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F); // Box 116
		bodyModel[62].setRotationPoint(2F, 5.5F, -8.5F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 105
		bodyModel[63].setRotationPoint(4F, 6F, -8.5F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 108
		bodyModel[64].setRotationPoint(4F, 6F, 7.5F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F); // Box 110
		bodyModel[65].setRotationPoint(2F, 5.5F, 7.5F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F); // Box 111
		bodyModel[66].setRotationPoint(-4F, 5.5F, 7.5F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 113
		bodyModel[67].setRotationPoint(-6F, 6F, 7.5F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F); // Box 117
		bodyModel[68].setRotationPoint(-7F, 3F, 9.5F);
		bodyModel[68].rotateAngleX = -0.78539816F;

		bodyModel[69].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.15F, 0F, -0.25F, -0.15F, 0F, -0.25F, -0.15F, 0F, -0.5F, -0.15F, 0F, -0.5F, -0.15F, 0F, -0.25F, -0.15F, 0F, -0.25F, -0.15F, 0F, -0.5F, -0.15F, 0F, -0.5F); // Box 109
		bodyModel[69].setRotationPoint(-8F, 5F, 7.25F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.15F, -0.25F, -0.25F, -0.15F, -0.25F, -0.25F, -0.15F, -0.25F, -0.5F, -0.15F, -0.25F, -0.5F, -0.15F, 0F, -0.25F, -0.15F, 0F, -0.25F, -0.15F, 0F, -0.5F, -0.15F, 0F, -0.5F); // Box 110
		bodyModel[70].setRotationPoint(6F, 5F, 7.25F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F); // Box 111
		bodyModel[71].setRotationPoint(5F, 3F, 9.5F);
		bodyModel[71].rotateAngleX = -0.78539816F;

		bodyModel[72].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 112
		bodyModel[72].setRotationPoint(9.5F, 7.5F, 7F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F); // Box 113
		bodyModel[73].setRotationPoint(10F, 4.5F, 7F);

		bodyModel[74].addBox(0F, 0F, 0F, 8, 1, 0, 0F); // Box 114
		bodyModel[74].setRotationPoint(2F, 8F, 7.25F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 116
		bodyModel[75].setRotationPoint(-8F, 3.25F, 8.5F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 1, 0, 4, 0F,-1F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, -0.25F, 0.25F, 0F, -1F, -1F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, -0.25F, 0.25F, 0F, -1F); // Box 117
		bodyModel[76].setRotationPoint(-4F, 3.8F, 6.25F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 2, 0, 1, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 118
		bodyModel[77].setRotationPoint(-6F, 3.8F, 9.25F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 119
		bodyModel[78].setRotationPoint(-11F, 4.5F, 7F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F); // Box 120
		bodyModel[79].setRotationPoint(-10.5F, 7.5F, 7F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, -0.5F, -1F, -0.5F, -0.5F); // Box 121
		bodyModel[80].setRotationPoint(2.5F, 7.5F, 7F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 122
		bodyModel[81].setRotationPoint(6F, 3.25F, 8.5F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 1, 0, 4, 0F,0.5F, 0F, 0F, -1F, 0F, 0F, 0.25F, 0F, -1F, -1F, 0F, -0.25F, 0.5F, 0F, 0F, -1F, 0F, 0F, 0.25F, 0F, -1F, -1F, 0F, -0.25F); // Box 123
		bodyModel[82].setRotationPoint(3F, 3.8F, 6.25F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 2, 0, 1, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 124
		bodyModel[83].setRotationPoint(4F, 3.8F, 9.25F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 4, 1, 11, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 125
		bodyModel[84].setRotationPoint(-2F, 8.25F, -5.5F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,-0.5F, -0.35F, 0F, -0.5F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, -0.5F, -0.35F, 0F, -0.5F, -0.35F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F); // Box 126
		bodyModel[85].setRotationPoint(-2F, 6.4F, -10F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,-0.5F, -0.35F, 0F, -0.5F, -0.35F, 0F, 0F, -0.23F, 0F, 0F, -0.23F, 0F, -0.5F, -0.35F, 0F, -0.5F, -0.35F, 0F, 0F, -0.23F, 0F, 0F, -0.23F, 0F); // Box 127
		bodyModel[86].setRotationPoint(-2F, 6.75F, -11F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,-0.5F, -0.35F, 0F, -0.5F, -0.35F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, -0.5F, -0.35F, 0F, -0.5F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F); // Box 128
		bodyModel[87].setRotationPoint(-2F, 7.1F, -10F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,-0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0.75F, 0F, -0.25F, 0.75F, 0F); // Box 129
		bodyModel[88].setRotationPoint(-2F, 7.5F, -9.5F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, -1F, -0.5F, 0.5F, -1F); // Box 130
		bodyModel[89].setRotationPoint(1.25F, 4F, -9F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, -1F, -0.5F, 0.5F, -1F); // Box 131
		bodyModel[90].setRotationPoint(-2.75F, 4F, -9F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 132
		bodyModel[91].setRotationPoint(-2F, 6F, -9F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 133
		bodyModel[92].setRotationPoint(-2.5F, 3.75F, -8.75F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 134
		bodyModel[93].setRotationPoint(1.5F, 3.75F, -8.75F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 135
		bodyModel[94].setRotationPoint(4F, 5F, -8.5F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.15F, -0.25F, -0.5F, -0.15F, -0.25F, -0.5F, -0.15F, -0.25F, -0.25F, -0.15F, -0.25F, -0.25F, -0.15F, 0F, -0.5F, -0.15F, 0F, -0.5F, -0.15F, 0F, -0.25F, -0.15F, 0F, -0.25F); // Box 136
		bodyModel[95].setRotationPoint(6F, 5F, -9.25F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.25F, 0F, 0F, 0.25F, 0F, 0F); // Box 137
		bodyModel[96].setRotationPoint(6F, 3.25F, -9.5F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 138
		bodyModel[97].setRotationPoint(-6F, 5F, -8.5F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.15F, 0F, -0.5F, -0.15F, 0F, -0.5F, -0.15F, 0F, -0.25F, -0.15F, 0F, -0.25F, -0.15F, 0F, -0.5F, -0.15F, 0F, -0.5F, -0.15F, 0F, -0.25F, -0.15F, 0F, -0.25F); // Box 139
		bodyModel[98].setRotationPoint(-8F, 5F, -9.25F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.25F, 0F, 0F, 0.25F, 0F, 0F); // Box 140
		bodyModel[99].setRotationPoint(-8F, 3.25F, -9.5F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, -0.5F, 0.5F, -0.5F, -0.5F, 0.5F, -0.5F, 0F, -1F, -0.5F, 0F); // Box 141
		bodyModel[100].setRotationPoint(2.5F, 7.5F, -8F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 142
		bodyModel[101].setRotationPoint(2.5F, 4.5F, -8F);

		bodyModel[102].addBox(0F, 0F, 0F, 8, 1, 0, 0F); // Box 143
		bodyModel[102].setRotationPoint(2F, 8F, -7.25F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 144
		bodyModel[103].setRotationPoint(9.5F, 7.5F, -8F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F); // Box 145
		bodyModel[104].setRotationPoint(10F, 4.5F, -8F);

		bodyModel[105].addBox(0F, 0F, 0F, 8, 1, 0, 0F); // Box 146
		bodyModel[105].setRotationPoint(-10F, 8F, -7.25F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 147
		bodyModel[106].setRotationPoint(-3.5F, 4.5F, -8F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, -0.5F, -1F, -0.5F, -0.5F, -1F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Box 148
		bodyModel[107].setRotationPoint(-3.5F, 7.5F, -8F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F); // Box 149
		bodyModel[108].setRotationPoint(-11F, 4.5F, -8F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F); // Box 150
		bodyModel[109].setRotationPoint(-10.5F, 7.5F, -8F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 1, 0, 4, 0F,-1F, 0F, -0.25F, 0.25F, 0F, -1F, -1F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, -0.25F, 0.25F, 0F, -1F, -1F, 0F, 0F, 0.5F, 0F, 0F); // Box 153
		bodyModel[110].setRotationPoint(3F, 3.8F, -10.25F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 2, 0, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Box 154
		bodyModel[111].setRotationPoint(4F, 3.8F, -10.25F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 2, 0, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 155
		bodyModel[112].setRotationPoint(-6F, 3.8F, -10.25F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 1, 0, 4, 0F,0.25F, 0F, -1F, -1F, 0F, -0.25F, 0.5F, 0F, 0F, -1F, 0F, 0F, 0.25F, 0F, -1F, -1F, 0F, -0.25F, 0.5F, 0F, 0F, -1F, 0F, 0F); // Box 156
		bodyModel[113].setRotationPoint(-4F, 3.8F, -10.25F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F); // Box 157
		bodyModel[114].setRotationPoint(5F, 3F, -9.5F);
		bodyModel[114].rotateAngleX = -0.78539816F;

		bodyModel[115].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F); // Box 158
		bodyModel[115].setRotationPoint(-7F, 3F, -9.5F);
		bodyModel[115].rotateAngleX = -0.78539816F;
	}
}