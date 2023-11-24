//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2021 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 31.10.2020 - 20:10:30
// Last changed on: 31.10.2020 - 20:10:30

package train.client.render.models; //Path where the model is located

import fexcraft.tmt.slim.ModelConverter;
import fexcraft.tmt.slim.ModelRendererTurbo;

public class ModelTypeBnew extends ModelConverter //Same as Filename
{
	int textureX = 128;
	int textureY = 64;

	public ModelTypeBnew() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[123];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 43, textureX, textureY); // Box 4
		bodyModel[1] = new ModelRendererTurbo(this, 1, 43, textureX, textureY); // Box 5
		bodyModel[2] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 30 wheel
		bodyModel[3] = new ModelRendererTurbo(this, 59, 5, textureX, textureY); // Box 52
		bodyModel[4] = new ModelRendererTurbo(this, 64, 11, textureX, textureY); // Box 53
		bodyModel[5] = new ModelRendererTurbo(this, 19, 1, textureX, textureY); // Box 65
		bodyModel[6] = new ModelRendererTurbo(this, 68, 5, textureX, textureY); // Box 66
		bodyModel[7] = new ModelRendererTurbo(this, 26, 5, textureX, textureY); // Box 67
		bodyModel[8] = new ModelRendererTurbo(this, 43, 47, textureX, textureY); // Box 95
		bodyModel[9] = new ModelRendererTurbo(this, 85, 46, textureX, textureY); // Box 96
		bodyModel[10] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 46 whee
		bodyModel[11] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 47 wheel
		bodyModel[12] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 48 wheel
		bodyModel[13] = new ModelRendererTurbo(this, 24, 46, textureX, textureY); // Box 346
		bodyModel[14] = new ModelRendererTurbo(this, 37, 11, textureX, textureY); // Box 47
		bodyModel[15] = new ModelRendererTurbo(this, 67, 13, textureX, textureY); // Box 48
		bodyModel[16] = new ModelRendererTurbo(this, 11, 20, textureX, textureY); // Box 51
		bodyModel[17] = new ModelRendererTurbo(this, 34, 36, textureX, textureY); // Box 71
		bodyModel[18] = new ModelRendererTurbo(this, 50, 36, textureX, textureY); // Box 72
		bodyModel[19] = new ModelRendererTurbo(this, 36, 32, textureX, textureY); // Box 73
		bodyModel[20] = new ModelRendererTurbo(this, 40, 36, textureX, textureY); // Box 75
		bodyModel[21] = new ModelRendererTurbo(this, 48, 36, textureX, textureY); // Box 76
		bodyModel[22] = new ModelRendererTurbo(this, 59, 8, textureX, textureY); // Box 85
		bodyModel[23] = new ModelRendererTurbo(this, 36, 1, textureX, textureY); // Box 91
		bodyModel[24] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 92
		bodyModel[25] = new ModelRendererTurbo(this, 58, 1, textureX, textureY); // Box 93
		bodyModel[26] = new ModelRendererTurbo(this, 43, 1, textureX, textureY); // Box 94
		bodyModel[27] = new ModelRendererTurbo(this, 18, 31, textureX, textureY); // Box 104 smol bering cab
		bodyModel[28] = new ModelRendererTurbo(this, 18, 27, textureX, textureY); // Box 110 smol bering cab
		bodyModel[29] = new ModelRendererTurbo(this, 27, 13, textureX, textureY); // Box 101
		bodyModel[30] = new ModelRendererTurbo(this, 32, 11, textureX, textureY); // Box 102
		bodyModel[31] = new ModelRendererTurbo(this, 33, 8, textureX, textureY); // Box 103
		bodyModel[32] = new ModelRendererTurbo(this, 33, 5, textureX, textureY); // Box 104
		bodyModel[33] = new ModelRendererTurbo(this, 5, 38, textureX, textureY); // Box 37
		bodyModel[34] = new ModelRendererTurbo(this, 5, 57, textureX, textureY); // Box 38
		bodyModel[35] = new ModelRendererTurbo(this, 4, 52, textureX, textureY); // Box 37
		bodyModel[36] = new ModelRendererTurbo(this, 4, 42, textureX, textureY); // Box 37
		bodyModel[37] = new ModelRendererTurbo(this, 4, 47, textureX, textureY); // Box 37
		bodyModel[38] = new ModelRendererTurbo(this, 12, 11, textureX, textureY); // Box 221
		bodyModel[39] = new ModelRendererTurbo(this, 33, 8, textureX, textureY); // Box 329
		bodyModel[40] = new ModelRendererTurbo(this, 33, 5, textureX, textureY); // Box 330
		bodyModel[41] = new ModelRendererTurbo(this, 32, 11, textureX, textureY); // Box 331
		bodyModel[42] = new ModelRendererTurbo(this, 27, 13, textureX, textureY); // Box 332
		bodyModel[43] = new ModelRendererTurbo(this, 37, 11, textureX, textureY); // Box 333
		bodyModel[44] = new ModelRendererTurbo(this, 67, 13, textureX, textureY); // Box 334
		bodyModel[45] = new ModelRendererTurbo(this, 64, 11, textureX, textureY); // Box 335
		bodyModel[46] = new ModelRendererTurbo(this, 59, 8, textureX, textureY); // Box 336
		bodyModel[47] = new ModelRendererTurbo(this, 59, 5, textureX, textureY); // Box 337
		bodyModel[48] = new ModelRendererTurbo(this, 18, 35, textureX, textureY); // Box 339 smol bering cab
		bodyModel[49] = new ModelRendererTurbo(this, 18, 39, textureX, textureY); // Box 340 smol bering cab
		bodyModel[50] = new ModelRendererTurbo(this, 19, 1, textureX, textureY); // Box 346
		bodyModel[51] = new ModelRendererTurbo(this, 26, 5, textureX, textureY); // Box 348
		bodyModel[52] = new ModelRendererTurbo(this, 68, 5, textureX, textureY); // Box 349
		bodyModel[53] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 351
		bodyModel[54] = new ModelRendererTurbo(this, 58, 1, textureX, textureY); // Box 352
		bodyModel[55] = new ModelRendererTurbo(this, 43, 1, textureX, textureY); // Box 353
		bodyModel[56] = new ModelRendererTurbo(this, 36, 1, textureX, textureY); // Box 354
		bodyModel[57] = new ModelRendererTurbo(this, 5, 38, textureX, textureY); // Box 66
		bodyModel[58] = new ModelRendererTurbo(this, 5, 57, textureX, textureY); // Box 67
		bodyModel[59] = new ModelRendererTurbo(this, 4, 52, textureX, textureY); // Box 37
		bodyModel[60] = new ModelRendererTurbo(this, 4, 42, textureX, textureY); // Box 37
		bodyModel[61] = new ModelRendererTurbo(this, 4, 47, textureX, textureY); // Box 37
		bodyModel[62] = new ModelRendererTurbo(this, 24, 46, textureX, textureY); // Box 369
		bodyModel[63] = new ModelRendererTurbo(this, 68, 43, textureX, textureY); // Box 370
		bodyModel[64] = new ModelRendererTurbo(this, 68, 43, textureX, textureY); // Box 371
		bodyModel[65] = new ModelRendererTurbo(this, 0, 14, textureX, textureY); // Box 372
		bodyModel[66] = new ModelRendererTurbo(this, 10, 23, textureX, textureY); // Box 117
		bodyModel[67] = new ModelRendererTurbo(this, 1, 23, textureX, textureY); // Box 111
		bodyModel[68] = new ModelRendererTurbo(this, 2, 28, textureX, textureY); // Box 117
		bodyModel[69] = new ModelRendererTurbo(this, 0, 28, textureX, textureY); // Box 118
		bodyModel[70] = new ModelRendererTurbo(this, 2, 28, textureX, textureY); // Box 123
		bodyModel[71] = new ModelRendererTurbo(this, 0, 28, textureX, textureY); // Box 124
		bodyModel[72] = new ModelRendererTurbo(this, 2, 28, textureX, textureY); // Box 153
		bodyModel[73] = new ModelRendererTurbo(this, 0, 28, textureX, textureY); // Box 154
		bodyModel[74] = new ModelRendererTurbo(this, 0, 28, textureX, textureY); // Box 155
		bodyModel[75] = new ModelRendererTurbo(this, 2, 28, textureX, textureY); // Box 156
		bodyModel[76] = new ModelRendererTurbo(this, 1, 23, textureX, textureY); // Box 157
		bodyModel[77] = new ModelRendererTurbo(this, 10, 23, textureX, textureY); // Box 158
		bodyModel[78] = new ModelRendererTurbo(this, 84, 10, textureX, textureY); // Box 130
		bodyModel[79] = new ModelRendererTurbo(this, 84, 1, textureX, textureY); // Box 119
		bodyModel[80] = new ModelRendererTurbo(this, 84, 6, textureX, textureY); // Box 120
		bodyModel[81] = new ModelRendererTurbo(this, 84, 1, textureX, textureY); // Box 149
		bodyModel[82] = new ModelRendererTurbo(this, 84, 6, textureX, textureY); // Box 150
		bodyModel[83] = new ModelRendererTurbo(this, 75, 5, textureX, textureY); // Box 119
		bodyModel[84] = new ModelRendererTurbo(this, 84, 10, textureX, textureY); // Box 120
		bodyModel[85] = new ModelRendererTurbo(this, 1, 8, textureX, textureY); // Box 121
		bodyModel[86] = new ModelRendererTurbo(this, 1, 8, textureX, textureY); // Box 122
		bodyModel[87] = new ModelRendererTurbo(this, 2, 20, textureX, textureY); // Box 123
		bodyModel[88] = new ModelRendererTurbo(this, 2, 20, textureX, textureY); // Box 124
		bodyModel[89] = new ModelRendererTurbo(this, 11, 20, textureX, textureY); // Box 125
		bodyModel[90] = new ModelRendererTurbo(this, 25, 31, textureX, textureY); // Box 126 frick bearing
		bodyModel[91] = new ModelRendererTurbo(this, 25, 27, textureX, textureY); // Box 126 frick bearing
		bodyModel[92] = new ModelRendererTurbo(this, 25, 39, textureX, textureY); // Box 126 frick bearing
		bodyModel[93] = new ModelRendererTurbo(this, 25, 35, textureX, textureY); // Box 126 frick bearing
		bodyModel[94] = new ModelRendererTurbo(this, 14, 1, textureX, textureY); // Box 138
		bodyModel[95] = new ModelRendererTurbo(this, 75, 5, textureX, textureY); // Box 131
		bodyModel[96] = new ModelRendererTurbo(this, 19, 5, textureX, textureY); // Box 132
		bodyModel[97] = new ModelRendererTurbo(this, 19, 5, textureX, textureY); // Box 133
		bodyModel[98] = new ModelRendererTurbo(this, 97, 10, textureX, textureY); // Box 134
		bodyModel[99] = new ModelRendererTurbo(this, 97, 10, textureX, textureY); // Box 135
		bodyModel[100] = new ModelRendererTurbo(this, 106, 6, textureX, textureY); // Box 136
		bodyModel[101] = new ModelRendererTurbo(this, 106, 1, textureX, textureY); // Box 137
		bodyModel[102] = new ModelRendererTurbo(this, 106, 6, textureX, textureY); // Box 138
		bodyModel[103] = new ModelRendererTurbo(this, 106, 1, textureX, textureY); // Box 139
		bodyModel[104] = new ModelRendererTurbo(this, 14, 1, textureX, textureY); // Box 140
		bodyModel[105] = new ModelRendererTurbo(this, 12, 11, textureX, textureY); // Box 141
		bodyModel[106] = new ModelRendererTurbo(this, 14, 1, textureX, textureY); // Box 142
		bodyModel[107] = new ModelRendererTurbo(this, 14, 1, textureX, textureY); // Box 143
		bodyModel[108] = new ModelRendererTurbo(this, 12, 11, textureX, textureY); // Box 144
		bodyModel[109] = new ModelRendererTurbo(this, 12, 11, textureX, textureY); // Box 145
		bodyModel[110] = new ModelRendererTurbo(this, 14, 1, textureX, textureY); // Box 146
		bodyModel[111] = new ModelRendererTurbo(this, 14, 1, textureX, textureY); // Box 147
		bodyModel[112] = new ModelRendererTurbo(this, 14, 1, textureX, textureY); // Box 148
		bodyModel[113] = new ModelRendererTurbo(this, 14, 1, textureX, textureY); // Box 149
		bodyModel[114] = new ModelRendererTurbo(this, 9, 28, textureX, textureY); // Box 24
		bodyModel[115] = new ModelRendererTurbo(this, 9, 28, textureX, textureY); // Box 151
		bodyModel[116] = new ModelRendererTurbo(this, 9, 28, textureX, textureY); // Box 152
		bodyModel[117] = new ModelRendererTurbo(this, 9, 28, textureX, textureY); // Box 153
		bodyModel[118] = new ModelRendererTurbo(this, 36, 32, textureX, textureY); // Box 154
		bodyModel[119] = new ModelRendererTurbo(this, 48, 36, textureX, textureY); // Box 155
		bodyModel[120] = new ModelRendererTurbo(this, 50, 36, textureX, textureY); // Box 156
		bodyModel[121] = new ModelRendererTurbo(this, 40, 36, textureX, textureY); // Box 157
		bodyModel[122] = new ModelRendererTurbo(this, 34, 36, textureX, textureY); // Box 158

		bodyModel[0].addBox(0F, 0F, 0F, 2, 2, 18, 0F); // Box 4
		bodyModel[0].setRotationPoint(-9F, 6F, -9F);

		bodyModel[1].addBox(0F, 0F, 0F, 2, 2, 18, 0F); // Box 5
		bodyModel[1].setRotationPoint(7F, 6F, -9F);

		bodyModel[2].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 30 wheel
		bodyModel[2].setRotationPoint(8F, 7F, 5.5F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 52
		bodyModel[3].setRotationPoint(-9F, 4.5F, -8.75F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 53
		bodyModel[4].setRotationPoint(-7F, 6F, -8.75F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 7, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 65
		bodyModel[5].setRotationPoint(5F, 4F, -8.25F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 66
		bodyModel[6].setRotationPoint(-7F, 5.5F, -8.25F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 67
		bodyModel[7].setRotationPoint(5F, 5.5F, -8.25F);

		bodyModel[8].addBox(0F, 0F, 0F, 5, 2, 14, 0F); // Box 95
		bodyModel[8].setRotationPoint(-2.5F, 5.5F, -7F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 4, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 96
		bodyModel[9].setRotationPoint(-2F, 4.5F, -8F);

		bodyModel[10].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 46 whee
		bodyModel[10].setRotationPoint(-8F, 7F, 5.5F);

		bodyModel[11].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 47 wheel
		bodyModel[11].setRotationPoint(-8F, 7F, -5.5F);

		bodyModel[12].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 48 wheel
		bodyModel[12].setRotationPoint(8F, 7F, -5.5F);

		bodyModel[13].addBox(0F, 0F, 0F, 6, 4, 10, 0F); // Box 346
		bodyModel[13].setRotationPoint(-10.5F, 5F, -5F);

		bodyModel[14].addBox(0F, 0F, 0F, 11, 2, 2, 0F); // Box 47
		bodyModel[14].setRotationPoint(-5.5F, 7.5F, -8.75F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -1.5F, 0F); // Box 48
		bodyModel[15].setRotationPoint(-7F, 8.5F, -8.75F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 51
		bodyModel[16].setRotationPoint(-10F, 3.4F, -9F);

		bodyModel[17].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 71
		bodyModel[17].setRotationPoint(-12F, 4F, -7.25F);

		bodyModel[18].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 72
		bodyModel[18].setRotationPoint(-12F, 4F, 4.25F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1.5F, 0F, 0F, -1.5F); // Box 73
		bodyModel[19].setRotationPoint(-12F, 5F, -4.25F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 75
		bodyModel[20].setRotationPoint(-12F, 4F, -4.25F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 76
		bodyModel[21].setRotationPoint(-12F, 4F, 3.25F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 85
		bodyModel[22].setRotationPoint(-9F, 5F, -8.75F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F); // Box 91
		bodyModel[23].setRotationPoint(3F, 4F, -8.25F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 7, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 92
		bodyModel[24].setRotationPoint(-12F, 4F, -8.25F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F); // Box 93
		bodyModel[25].setRotationPoint(-5F, 4F, -8.25F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 94
		bodyModel[26].setRotationPoint(-3F, 4F, -8.75F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 104 smol bering cab
		bodyModel[27].setRotationPoint(-9F, 6F, -9.5F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 110 smol bering cab
		bodyModel[28].setRotationPoint(7F, 6F, -9.5F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0.5F, 0F, 0F); // Box 101
		bodyModel[29].setRotationPoint(6F, 8.5F, -8.75F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 102
		bodyModel[30].setRotationPoint(6F, 6F, -8.75F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 103
		bodyModel[31].setRotationPoint(6F, 5F, -8.75F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 104
		bodyModel[32].setRotationPoint(6F, 4.5F, -8.75F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 37
		bodyModel[33].setRotationPoint(-1.5F, 5.5F, -8F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 38
		bodyModel[34].setRotationPoint(-1.5F, 7F, -8F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F); // Box 37
		bodyModel[35].setRotationPoint(-1.5F, 6.6F, -9F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F); // Box 37
		bodyModel[36].setRotationPoint(-1.5F, 5.9F, -9F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.23F, 0F, 0F, -0.23F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.23F, 0F, 0F, -0.23F, 0F); // Box 37
		bodyModel[37].setRotationPoint(-1.5F, 6.25F, -10F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 221
		bodyModel[38].setRotationPoint(-5.5F, 5F, -8.7F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 329
		bodyModel[39].setRotationPoint(6F, 5F, 7.75F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 330
		bodyModel[40].setRotationPoint(6F, 4.5F, 7.75F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 331
		bodyModel[41].setRotationPoint(6F, 6F, 7.75F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0.5F, 0F, 0F); // Box 332
		bodyModel[42].setRotationPoint(6F, 8.5F, 6.75F);

		bodyModel[43].addBox(0F, 0F, 0F, 11, 2, 2, 0F); // Box 333
		bodyModel[43].setRotationPoint(-5.5F, 7.5F, 6.75F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -1.5F, 0F); // Box 334
		bodyModel[44].setRotationPoint(-7F, 8.5F, 6.75F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 335
		bodyModel[45].setRotationPoint(-7F, 6F, 7.75F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 336
		bodyModel[46].setRotationPoint(-9F, 5F, 7.75F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 337
		bodyModel[47].setRotationPoint(-9F, 4.5F, 7.75F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 339 smol bering cab
		bodyModel[48].setRotationPoint(7F, 6F, 8.5F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 340 smol bering cab
		bodyModel[49].setRotationPoint(-9F, 6F, 8.5F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 7, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 346
		bodyModel[50].setRotationPoint(5F, 4F, 7.25F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 348
		bodyModel[51].setRotationPoint(5F, 5.5F, 7.25F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 349
		bodyModel[52].setRotationPoint(-7F, 5.5F, 7.25F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 7, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 351
		bodyModel[53].setRotationPoint(-12F, 4F, 7.25F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F); // Box 352
		bodyModel[54].setRotationPoint(-5F, 4F, 7.25F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 353
		bodyModel[55].setRotationPoint(-3F, 4F, 7.75F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F); // Box 354
		bodyModel[56].setRotationPoint(3F, 4F, 7.25F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 66
		bodyModel[57].setRotationPoint(-1.5F, 5.5F, 6F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 67
		bodyModel[58].setRotationPoint(-1.5F, 7F, 6F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F); // Box 37
		bodyModel[59].setRotationPoint(-1.5F, 6.6F, 6F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F); // Box 37
		bodyModel[60].setRotationPoint(-1.5F, 5.9F, 6F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, -0.23F, 0F, 0F, -0.23F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.23F, 0F, 0F, -0.23F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F); // Box 37
		bodyModel[61].setRotationPoint(-1.5F, 6.25F, 7F);

		bodyModel[62].addBox(0F, 0F, 0F, 6, 4, 10, 0F); // Box 369
		bodyModel[62].setRotationPoint(4.5F, 5F, -5F);

		bodyModel[63].addBox(0F, 0F, 0F, 3, 4, 13, 0F); // Box 370
		bodyModel[63].setRotationPoint(-4.5F, 5F, -6.5F);

		bodyModel[64].addBox(0F, 0F, 0F, 3, 4, 13, 0F); // Box 371
		bodyModel[64].setRotationPoint(1.5F, 5F, -6.5F);

		bodyModel[65].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 372
		bodyModel[65].setRotationPoint(-2F, 3.5F, -2F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F); // Box 117
		bodyModel[66].setRotationPoint(-10F, 3F, 9.5F);
		bodyModel[66].rotateAngleX = -0.78539816F;

		bodyModel[67].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F); // Box 111
		bodyModel[67].setRotationPoint(8F, 3F, 9.5F);
		bodyModel[67].rotateAngleX = -0.78539816F;

		bodyModel[68].addShapeBox(0F, 0F, 0F, 1, 0, 4, 0F,-1F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, -0.25F, 0.25F, 0F, -1F, -1F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, -0.25F, 0.25F, 0F, -1F); // Box 117
		bodyModel[68].setRotationPoint(-6F, 3.8F, 6.25F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 2, 0, 1, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 118
		bodyModel[69].setRotationPoint(-8F, 3.8F, 9.25F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 1, 0, 4, 0F,0.5F, 0F, 0F, -1F, 0F, 0F, 0.25F, 0F, -1F, -1F, 0F, -0.25F, 0.5F, 0F, 0F, -1F, 0F, 0F, 0.25F, 0F, -1F, -1F, 0F, -0.25F); // Box 123
		bodyModel[70].setRotationPoint(5F, 3.8F, 6.25F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 2, 0, 1, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 124
		bodyModel[71].setRotationPoint(6F, 3.8F, 9.25F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 1, 0, 4, 0F,-1F, 0F, -0.25F, 0.25F, 0F, -1F, -1F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, -0.25F, 0.25F, 0F, -1F, -1F, 0F, 0F, 0.5F, 0F, 0F); // Box 153
		bodyModel[72].setRotationPoint(5F, 3.8F, -10.25F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 2, 0, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Box 154
		bodyModel[73].setRotationPoint(6F, 3.8F, -10.25F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 2, 0, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 155
		bodyModel[74].setRotationPoint(-8F, 3.8F, -10.25F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 1, 0, 4, 0F,0.25F, 0F, -1F, -1F, 0F, -0.25F, 0.5F, 0F, 0F, -1F, 0F, 0F, 0.25F, 0F, -1F, -1F, 0F, -0.25F, 0.5F, 0F, 0F, -1F, 0F, 0F); // Box 156
		bodyModel[75].setRotationPoint(-6F, 3.8F, -10.25F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F); // Box 157
		bodyModel[76].setRotationPoint(8F, 3F, -9.5F);
		bodyModel[76].rotateAngleX = -0.78539816F;

		bodyModel[77].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F); // Box 158
		bodyModel[77].setRotationPoint(-10F, 3F, -9.5F);
		bodyModel[77].rotateAngleX = -0.78539816F;

		bodyModel[78].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 130
		bodyModel[78].setRotationPoint(-11F, 8F, 7.25F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 119
		bodyModel[79].setRotationPoint(-12F, 4F, 7F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F); // Box 120
		bodyModel[80].setRotationPoint(-11.5F, 7F, 7F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F); // Box 149
		bodyModel[81].setRotationPoint(-12F, 4F, -8F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F); // Box 150
		bodyModel[82].setRotationPoint(-11.5F, 7F, -8F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.25F, 0F, 0F); // Box 119
		bodyModel[83].setRotationPoint(-11F, 5.5F, 7.25F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 120
		bodyModel[84].setRotationPoint(-11F, 8F, -8.25F);

		bodyModel[85].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 121
		bodyModel[85].setRotationPoint(-1.5F, 3.5F, -6F);

		bodyModel[86].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 122
		bodyModel[86].setRotationPoint(-1.5F, 3.5F, 5F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 123
		bodyModel[87].setRotationPoint(8F, 3.4F, -9F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 124
		bodyModel[88].setRotationPoint(8F, 3.4F, 8F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 125
		bodyModel[89].setRotationPoint(-10F, 3.4F, 8F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 126 frick bearing
		bodyModel[90].setRotationPoint(-9F, 6F, -9.5F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 126 frick bearing
		bodyModel[91].setRotationPoint(7F, 6F, -9.5F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 126 frick bearing
		bodyModel[92].setRotationPoint(-9F, 6F, 8.5F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 126 frick bearing
		bodyModel[93].setRotationPoint(7F, 6F, 8.5F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0.1F, -1F, 0.1F, 0.1F, -1.25F, 0.1F, 0.1F, -1.25F, 0.1F, 0.1F, -1F, 0.1F, 0.1F, -4.5F, 0.1F, 0.1F, -4.25F, 0.1F, 0.1F, -4.25F, 0.1F, 0.1F, -4.5F, 0.1F); // Box 138
		bodyModel[94].setRotationPoint(-5.25F, 4.25F, -8.25F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.25F, 0F, 0F); // Box 131
		bodyModel[95].setRotationPoint(-11F, 5.5F, -8.25F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, 0F, 0F, 0F); // Box 132
		bodyModel[96].setRotationPoint(9F, 5.5F, -8.25F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, 0F, 0F, 0F); // Box 133
		bodyModel[97].setRotationPoint(9F, 5.5F, 7.25F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 134
		bodyModel[98].setRotationPoint(6F, 8F, 7.25F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 135
		bodyModel[99].setRotationPoint(6F, 8F, -8.25F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 136
		bodyModel[100].setRotationPoint(10.5F, 7F, -8F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F); // Box 137
		bodyModel[101].setRotationPoint(11F, 4F, -8F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 138
		bodyModel[102].setRotationPoint(10.5F, 7F, 7F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F); // Box 139
		bodyModel[103].setRotationPoint(11F, 4F, 7F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0.1F, -1.25F, 0.1F, 0.1F, -1F, 0.1F, 0.1F, -1F, 0.1F, 0.1F, -1.25F, 0.1F, 0.1F, -4.25F, 0.1F, 0.1F, -4.5F, 0.1F, 0.1F, -4.5F, 0.1F, 0.1F, -4.25F, 0.1F); // Box 140
		bodyModel[104].setRotationPoint(-3.75F, 4.25F, -8.25F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 141
		bodyModel[105].setRotationPoint(2.5F, 5F, -8.7F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0.1F, -1.25F, 0.1F, 0.1F, -1F, 0.1F, 0.1F, -1F, 0.1F, 0.1F, -1.25F, 0.1F, 0.1F, -4.25F, 0.1F, 0.1F, -4.5F, 0.1F, 0.1F, -4.5F, 0.1F, 0.1F, -4.25F, 0.1F); // Box 142
		bodyModel[106].setRotationPoint(2.75F, 4.25F, -8.25F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0.1F, -1F, 0.1F, 0.1F, -1.25F, 0.1F, 0.1F, -1.25F, 0.1F, 0.1F, -1F, 0.1F, 0.1F, -4.5F, 0.1F, 0.1F, -4.25F, 0.1F, 0.1F, -4.25F, 0.1F, 0.1F, -4.5F, 0.1F); // Box 143
		bodyModel[107].setRotationPoint(4.25F, 4.25F, -8.25F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 144
		bodyModel[108].setRotationPoint(-5.5F, 5F, 7.7F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 145
		bodyModel[109].setRotationPoint(2.5F, 5F, 7.7F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0.1F, -1.25F, 0.1F, 0.1F, -1F, 0.1F, 0.1F, -1F, 0.1F, 0.1F, -1.25F, 0.1F, 0.1F, -4.25F, 0.1F, 0.1F, -4.5F, 0.1F, 0.1F, -4.5F, 0.1F, 0.1F, -4.25F, 0.1F); // Box 146
		bodyModel[110].setRotationPoint(4.25F, 4.25F, 7.25F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0.1F, -1F, 0.1F, 0.1F, -1.25F, 0.1F, 0.1F, -1.25F, 0.1F, 0.1F, -1F, 0.1F, 0.1F, -4.5F, 0.1F, 0.1F, -4.25F, 0.1F, 0.1F, -4.25F, 0.1F, 0.1F, -4.5F, 0.1F); // Box 147
		bodyModel[111].setRotationPoint(2.75F, 4.25F, 7.25F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0.1F, -1.25F, 0.1F, 0.1F, -1F, 0.1F, 0.1F, -1F, 0.1F, 0.1F, -1.25F, 0.1F, 0.1F, -4.25F, 0.1F, 0.1F, -4.5F, 0.1F, 0.1F, -4.5F, 0.1F, 0.1F, -4.25F, 0.1F); // Box 148
		bodyModel[112].setRotationPoint(-5.25F, 4.25F, 7.25F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0.1F, -1F, 0.1F, 0.1F, -1.25F, 0.1F, 0.1F, -1.25F, 0.1F, 0.1F, -1F, 0.1F, 0.1F, -4.5F, 0.1F, 0.1F, -4.25F, 0.1F, 0.1F, -4.25F, 0.1F, 0.1F, -4.5F, 0.1F); // Box 149
		bodyModel[113].setRotationPoint(-3.75F, 4.25F, 7.25F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 24
		bodyModel[114].setRotationPoint(-6.25F, 3F, -8.25F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 151
		bodyModel[115].setRotationPoint(5.25F, 3F, -8.25F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 152
		bodyModel[116].setRotationPoint(5.25F, 3F, 7.25F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 153
		bodyModel[117].setRotationPoint(-6.25F, 3F, 7.25F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1.5F, 0F, 0F, -1.5F); // Box 154
		bodyModel[118].setRotationPoint(11F, 5F, -4.25F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 155
		bodyModel[119].setRotationPoint(11F, 4F, 3.25F);

		bodyModel[120].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 156
		bodyModel[120].setRotationPoint(11F, 4F, 4.25F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 157
		bodyModel[121].setRotationPoint(11F, 4F, -4.25F);

		bodyModel[122].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 158
		bodyModel[122].setRotationPoint(11F, 4F, -7.25F);
	}
}