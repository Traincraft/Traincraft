//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2021 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 24.07.2020 - 12:25:08
// Last changed on: 24.07.2020 - 12:25:08

package train.client.render.models; //Path where the model is located

import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import tmt.ModelConverter;
import tmt.ModelRendererTurbo;

public class ModelVertiBoi2 extends ModelConverter //Same as Filename
{
	int textureX = 256;
	int textureY = 256;

	public ModelVertiBoi2() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[134];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 203, 11, textureX, textureY); // Box 4
		bodyModel[1] = new ModelRendererTurbo(this, 3, 27, textureX, textureY); // Box 5
		bodyModel[2] = new ModelRendererTurbo(this, 203, 11, textureX, textureY); // Box 6
		bodyModel[3] = new ModelRendererTurbo(this, 28, 8, textureX, textureY); // Box 7
		bodyModel[4] = new ModelRendererTurbo(this, 219, 229, textureX, textureY); // Box 10
		bodyModel[5] = new ModelRendererTurbo(this, 219, 229, textureX, textureY); // Box 11
		bodyModel[6] = new ModelRendererTurbo(this, 196, 236, textureX, textureY); // Box 12
		bodyModel[7] = new ModelRendererTurbo(this, 40, 27, textureX, textureY); // Box 13
		bodyModel[8] = new ModelRendererTurbo(this, 3, 37, textureX, textureY); // Box 14
		bodyModel[9] = new ModelRendererTurbo(this, 48, 3, textureX, textureY); // Box 15
		bodyModel[10] = new ModelRendererTurbo(this, 3, 13, textureX, textureY); // Box 16
		bodyModel[11] = new ModelRendererTurbo(this, 211, 209, textureX, textureY); // Box 17
		bodyModel[12] = new ModelRendererTurbo(this, 40, 27, textureX, textureY); // Box 18
		bodyModel[13] = new ModelRendererTurbo(this, 48, 3, textureX, textureY); // Box 19
		bodyModel[14] = new ModelRendererTurbo(this, 28, 8, textureX, textureY); // Box 20
		bodyModel[15] = new ModelRendererTurbo(this, 1, 238, textureX, textureY); // Box 21
		bodyModel[16] = new ModelRendererTurbo(this, 3, 13, textureX, textureY); // Box 22
		bodyModel[17] = new ModelRendererTurbo(this, 28, 8, textureX, textureY); // Box 23
		bodyModel[18] = new ModelRendererTurbo(this, 3, 27, textureX, textureY); // Box 24
		bodyModel[19] = new ModelRendererTurbo(this, 188, 11, textureX, textureY); // Box 26
		bodyModel[20] = new ModelRendererTurbo(this, 188, 11, textureX, textureY); // Box 27
		bodyModel[21] = new ModelRendererTurbo(this, 203, 11, textureX, textureY); // Box 28
		bodyModel[22] = new ModelRendererTurbo(this, 203, 11, textureX, textureY); // Box 29
		bodyModel[23] = new ModelRendererTurbo(this, 196, 236, textureX, textureY); // Box 30
		bodyModel[24] = new ModelRendererTurbo(this, 28, 8, textureX, textureY); // Box 32
		bodyModel[25] = new ModelRendererTurbo(this, 3, 13, textureX, textureY); // Box 34
		bodyModel[26] = new ModelRendererTurbo(this, 155, 159, textureX, textureY); // Box 35
		bodyModel[27] = new ModelRendererTurbo(this, 3, 13, textureX, textureY); // Box 41
		bodyModel[28] = new ModelRendererTurbo(this, 3, 50, textureX, textureY); // Box 44
		bodyModel[29] = new ModelRendererTurbo(this, 211, 209, textureX, textureY); // Box 58
		bodyModel[30] = new ModelRendererTurbo(this, 188, 11, textureX, textureY); // Box 59
		bodyModel[31] = new ModelRendererTurbo(this, 1, 214, textureX, textureY); // Box 65
		bodyModel[32] = new ModelRendererTurbo(this, 188, 11, textureX, textureY); // Box 66
		bodyModel[33] = new ModelRendererTurbo(this, 130, 152, textureX, textureY); // Box 67
		bodyModel[34] = new ModelRendererTurbo(this, 166, 151, textureX, textureY); // Box 74
		bodyModel[35] = new ModelRendererTurbo(this, 3, 37, textureX, textureY); // Box 75
		bodyModel[36] = new ModelRendererTurbo(this, 156, 151, textureX, textureY); // Box 76
		bodyModel[37] = new ModelRendererTurbo(this, 177, 153, textureX, textureY); // Box 77
		bodyModel[38] = new ModelRendererTurbo(this, 189, 153, textureX, textureY); // Box 78
		bodyModel[39] = new ModelRendererTurbo(this, 16, 11, textureX, textureY); // Box 79
		bodyModel[40] = new ModelRendererTurbo(this, 0, 208, textureX, textureY); // Box 80
		bodyModel[41] = new ModelRendererTurbo(this, 16, 11, textureX, textureY); // Box 81
		bodyModel[42] = new ModelRendererTurbo(this, 16, 11, textureX, textureY); // Box 82
		bodyModel[43] = new ModelRendererTurbo(this, 16, 11, textureX, textureY); // Box 83
		bodyModel[44] = new ModelRendererTurbo(this, 189, 142, textureX, textureY); // Box 90
		bodyModel[45] = new ModelRendererTurbo(this, 189, 142, textureX, textureY); // Box 91
		bodyModel[46] = new ModelRendererTurbo(this, 175, 142, textureX, textureY); // Box 92
		bodyModel[47] = new ModelRendererTurbo(this, 175, 142, textureX, textureY); // Box 93
		bodyModel[48] = new ModelRendererTurbo(this, 189, 164, textureX, textureY); // Box 96
		bodyModel[49] = new ModelRendererTurbo(this, 184, 164, textureX, textureY); // Box 97
		bodyModel[50] = new ModelRendererTurbo(this, 136, 147, textureX, textureY); // Box 98
		bodyModel[51] = new ModelRendererTurbo(this, 3, 6, textureX, textureY); // Box 99
		bodyModel[52] = new ModelRendererTurbo(this, 157, 147, textureX, textureY); // Box 100
		bodyModel[53] = new ModelRendererTurbo(this, 3, 6, textureX, textureY); // Box 101
		bodyModel[54] = new ModelRendererTurbo(this, 4, 67, textureX, textureY); // Box 102
		bodyModel[55] = new ModelRendererTurbo(this, 4, 59, textureX, textureY); // Box 103
		bodyModel[56] = new ModelRendererTurbo(this, 4, 67, textureX, textureY); // Box 104
		bodyModel[57] = new ModelRendererTurbo(this, 4, 59, textureX, textureY); // Box 105
		bodyModel[58] = new ModelRendererTurbo(this, 90, 25, textureX, textureY); // Box 134
		bodyModel[59] = new ModelRendererTurbo(this, 104, 39, textureX, textureY); // Box 135
		bodyModel[60] = new ModelRendererTurbo(this, 118, 39, textureX, textureY); // Box 137
		bodyModel[61] = new ModelRendererTurbo(this, 132, 39, textureX, textureY); // Box 140
		bodyModel[62] = new ModelRendererTurbo(this, 146, 39, textureX, textureY); // Box 141
		bodyModel[63] = new ModelRendererTurbo(this, 160, 39, textureX, textureY); // Box 142
		bodyModel[64] = new ModelRendererTurbo(this, 188, 39, textureX, textureY); // Box 143
		bodyModel[65] = new ModelRendererTurbo(this, 202, 39, textureX, textureY); // Box 144
		bodyModel[66] = new ModelRendererTurbo(this, 111, 68, textureX, textureY); // Box 167
		bodyModel[67] = new ModelRendererTurbo(this, 167, 68, textureX, textureY); // Box 168
		bodyModel[68] = new ModelRendererTurbo(this, 209, 68, textureX, textureY); // Box 169
		bodyModel[69] = new ModelRendererTurbo(this, 195, 68, textureX, textureY); // Box 170
		bodyModel[70] = new ModelRendererTurbo(this, 181, 68, textureX, textureY); // Box 171
		bodyModel[71] = new ModelRendererTurbo(this, 125, 68, textureX, textureY); // Box 172
		bodyModel[72] = new ModelRendererTurbo(this, 139, 68, textureX, textureY); // Box 173
		bodyModel[73] = new ModelRendererTurbo(this, 150, 190, textureX, textureY); // Box 179
		bodyModel[74] = new ModelRendererTurbo(this, 174, 39, textureX, textureY); // Box 323
		bodyModel[75] = new ModelRendererTurbo(this, 153, 68, textureX, textureY); // Box 324
		bodyModel[76] = new ModelRendererTurbo(this, 64, 113, textureX, textureY); // Box 86
		bodyModel[77] = new ModelRendererTurbo(this, 38, 84, textureX, textureY); // Box 88
		bodyModel[78] = new ModelRendererTurbo(this, 2, 84, textureX, textureY); // Box 89
		bodyModel[79] = new ModelRendererTurbo(this, 74, 71, textureX, textureY); // Box 90
		bodyModel[80] = new ModelRendererTurbo(this, 91, 70, textureX, textureY); // Box 92
		bodyModel[81] = new ModelRendererTurbo(this, 97, 70, textureX, textureY); // Box 93
		bodyModel[82] = new ModelRendererTurbo(this, 73, 65, textureX, textureY); // Box 94
		bodyModel[83] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Box 95
		bodyModel[84] = new ModelRendererTurbo(this, 106, 69, textureX, textureY); // Box 96
		bodyModel[85] = new ModelRendererTurbo(this, 73, 9, textureX, textureY); // Box 97
		bodyModel[86] = new ModelRendererTurbo(this, 112, 82, textureX, textureY); // Box 98
		bodyModel[87] = new ModelRendererTurbo(this, 112, 86, textureX, textureY); // Box 99
		bodyModel[88] = new ModelRendererTurbo(this, 103, 69, textureX, textureY); // Box 115
		bodyModel[89] = new ModelRendererTurbo(this, 112, 88, textureX, textureY); // Box 116
		bodyModel[90] = new ModelRendererTurbo(this, 112, 82, textureX, textureY); // Box 117
		bodyModel[91] = new ModelRendererTurbo(this, 112, 80, textureX, textureY); // Box 118
		bodyModel[92] = new ModelRendererTurbo(this, 112, 84, textureX, textureY); // Box 119
		bodyModel[93] = new ModelRendererTurbo(this, 100, 70, textureX, textureY); // Box 120
		bodyModel[94] = new ModelRendererTurbo(this, 129, 65, textureX, textureY); // Box 121
		bodyModel[95] = new ModelRendererTurbo(this, 94, 70, textureX, textureY); // Box 122
		bodyModel[96] = new ModelRendererTurbo(this, 94, 187, textureX, textureY, "lamp"); // Box 70 lamp
		bodyModel[97] = new ModelRendererTurbo(this, 94, 197, textureX, textureY, "lamp"); // Box 73 lamp
		bodyModel[98] = new ModelRendererTurbo(this, 143, 88, textureX, textureY); // Box 347
		bodyModel[99] = new ModelRendererTurbo(this, 119, 79, textureX, textureY); // Box 46
		bodyModel[100] = new ModelRendererTurbo(this, 119, 83, textureX, textureY); // Box 51
		bodyModel[101] = new ModelRendererTurbo(this, 138, 88, textureX, textureY); // Box 350
		bodyModel[102] = new ModelRendererTurbo(this, 133, 88, textureX, textureY); // Box 351
		bodyModel[103] = new ModelRendererTurbo(this, 128, 88, textureX, textureY); // Box 352
		bodyModel[104] = new ModelRendererTurbo(this, 123, 88, textureX, textureY); // Box 353
		bodyModel[105] = new ModelRendererTurbo(this, 118, 88, textureX, textureY); // Box 354
		bodyModel[106] = new ModelRendererTurbo(this, 75, 72, textureX, textureY); // Box 356
		bodyModel[107] = new ModelRendererTurbo(this, 159, 79, textureX, textureY); // Box 357
		bodyModel[108] = new ModelRendererTurbo(this, 159, 79, textureX, textureY); // Box 358
		bodyModel[109] = new ModelRendererTurbo(this, 58, 72, textureX, textureY); // Box 359
		bodyModel[110] = new ModelRendererTurbo(this, 56, 60, textureX, textureY); // Box 360
		bodyModel[111] = new ModelRendererTurbo(this, 131, 34, textureX, textureY); // Box 361
		bodyModel[112] = new ModelRendererTurbo(this, 114, 34, textureX, textureY); // Box 362
		bodyModel[113] = new ModelRendererTurbo(this, 160, 34, textureX, textureY); // Box 363
		bodyModel[114] = new ModelRendererTurbo(this, 105, 34, textureX, textureY); // Box 364
		bodyModel[115] = new ModelRendererTurbo(this, 125, 11, textureX, textureY); // Box 196
		bodyModel[116] = new ModelRendererTurbo(this, 125, 18, textureX, textureY); // Box 197
		bodyModel[117] = new ModelRendererTurbo(this, 160, 4, textureX, textureY); // Box 198
		bodyModel[118] = new ModelRendererTurbo(this, 123, 4, textureX, textureY); // Box 199
		bodyModel[119] = new ModelRendererTurbo(this, 86, 11, textureX, textureY); // Box 200
		bodyModel[120] = new ModelRendererTurbo(this, 175, 25, textureX, textureY); // Box 201
		bodyModel[121] = new ModelRendererTurbo(this, 138, 25, textureX, textureY); // Box 202
		bodyModel[122] = new ModelRendererTurbo(this, 103, 25, textureX, textureY); // Box 203
		bodyModel[123] = new ModelRendererTurbo(this, 193, 4, textureX, textureY); // Box 204
		bodyModel[124] = new ModelRendererTurbo(this, 86, 4, textureX, textureY); // Box 205
		bodyModel[125] = new ModelRendererTurbo(this, 86, 18, textureX, textureY); // Box 206
		bodyModel[126] = new ModelRendererTurbo(this, 74, 45, textureX, textureY); // Box 174
		bodyModel[127] = new ModelRendererTurbo(this, 84, 54, textureX, textureY); // Box 184
		bodyModel[128] = new ModelRendererTurbo(this, 106, 83, textureX, textureY); // Box 185
		bodyModel[129] = new ModelRendererTurbo(this, 106, 86, textureX, textureY); // Box 379
		bodyModel[130] = new ModelRendererTurbo(this, 96, 82, textureX, textureY); // Box 380
		bodyModel[131] = new ModelRendererTurbo(this, 101, 228, textureX, textureY); // Box 381
		bodyModel[132] = new ModelRendererTurbo(this, 101, 228, textureX, textureY); // Box 382
		bodyModel[133] = new ModelRendererTurbo(this, 79, 236, textureX, textureY); // Box 383

		bodyModel[0].addBox(0F, 0F, 0F, 6, 6, 0, 0F); // Box 4
		bodyModel[0].setRotationPoint(-24F, 11F, 5F);

		bodyModel[1].addBox(0F, 0F, 0F, 17, 5, 1, 0F); // Box 5
		bodyModel[1].setRotationPoint(-25F, 12F, -6F);

		bodyModel[2].addBox(0F, 0F, 0F, 6, 6, 0, 0F); // Box 6
		bodyModel[2].setRotationPoint(-15F, 11F, 5F);

		bodyModel[3].addBox(0F, 0F, 0F, 2, 2, 14, 0F); // Box 7
		bodyModel[3].setRotationPoint(-22F, 13F, -7F);

		bodyModel[4].addBox(0F, 0F, 0F, 0, 4, 18, 0F); // Box 10
		bodyModel[4].setRotationPoint(28F, 13F, -9F);

		bodyModel[5].addBox(0F, 0F, 0F, 0, 4, 18, 0F); // Box 11
		bodyModel[5].setRotationPoint(-28F, 13F, -9F);

		bodyModel[6].addBox(0F, 0F, 0F, 2, 1, 18, 0F); // Box 12
		bodyModel[6].setRotationPoint(-30F, 13F, -9F);

		bodyModel[7].addBox(0F, 0F, 0F, 17, 5, 1, 0F); // Box 13
		bodyModel[7].setRotationPoint(-25F, 12F, 5F);

		bodyModel[8].addBox(0F, 0F, 0F, 7, 3, 6, 0F); // Box 14
		bodyModel[8].setRotationPoint(13F, 15F, -3F);

		bodyModel[9].addBox(0F, 0F, 0F, 3, 3, 14, 0F); // Box 15
		bodyModel[9].setRotationPoint(-18F, 14F, -7F);

		bodyModel[10].addBox(0F, 0F, 0F, 1, 2, 10, 0F); // Box 16
		bodyModel[10].setRotationPoint(24F, 15F, -5F);

		bodyModel[11].addBox(0F, 0F, 0F, 2, 5, 20, 0F); // Box 17
		bodyModel[11].setRotationPoint(-26F, 17F, 10F);
		bodyModel[11].rotateAngleY = -3.14159265F;

		bodyModel[12].addBox(0F, 0F, 0F, 17, 5, 1, 0F); // Box 18
		bodyModel[12].setRotationPoint(8F, 12F, 5F);

		bodyModel[13].addBox(0F, 0F, 0F, 3, 3, 14, 0F); // Box 19
		bodyModel[13].setRotationPoint(15F, 14F, -7F);

		bodyModel[14].addBox(0F, 0F, 0F, 2, 2, 14, 0F); // Box 20
		bodyModel[14].setRotationPoint(11F, 13F, -7F);

		bodyModel[15].addBox(0F, 0F, 0F, 52, 3, 14, 0F); // Box 21
		bodyModel[15].setRotationPoint(26F, 18F, 9F);
		bodyModel[15].rotateAngleY = -3.14159265F;

		bodyModel[16].addBox(0F, 0F, 0F, 1, 2, 10, 0F); // Box 22
		bodyModel[16].setRotationPoint(-25F, 15F, -5F);

		bodyModel[17].addBox(0F, 0F, 0F, 2, 2, 14, 0F); // Box 23
		bodyModel[17].setRotationPoint(20F, 13F, -7F);

		bodyModel[18].addBox(0F, 0F, 0F, 17, 5, 1, 0F); // Box 24
		bodyModel[18].setRotationPoint(8F, 12F, -6F);

		bodyModel[19].addBox(0F, 0F, 0F, 6, 6, 0, 0F); // Box 26
		bodyModel[19].setRotationPoint(9F, 11F, -5F);

		bodyModel[20].addBox(0F, 0F, 0F, 6, 6, 0, 0F); // Box 27
		bodyModel[20].setRotationPoint(18F, 11F, -5F);

		bodyModel[21].addBox(0F, 0F, 0F, 6, 6, 0, 0F); // Box 28
		bodyModel[21].setRotationPoint(18F, 11F, 5F);

		bodyModel[22].addBox(0F, 0F, 0F, 6, 6, 0, 0F); // Box 29
		bodyModel[22].setRotationPoint(9F, 11F, 5F);

		bodyModel[23].addBox(0F, 0F, 0F, 2, 1, 18, 0F); // Box 30
		bodyModel[23].setRotationPoint(28F, 13F, -9F);

		bodyModel[24].addBox(0F, 0F, 0F, 2, 2, 14, 0F); // Box 32
		bodyModel[24].setRotationPoint(-13F, 13F, -7F);

		bodyModel[25].addBox(0F, 0F, 0F, 1, 2, 10, 0F); // Box 34
		bodyModel[25].setRotationPoint(8F, 15F, -5F);

		bodyModel[26].addBox(0F, 0F, 0F, 6, 6, 4, 0F); // Box 35
		bodyModel[26].setRotationPoint(2F, 22F, -6F);
		bodyModel[26].rotateAngleY = -3.14159265F;

		bodyModel[27].addBox(0F, 0F, 0F, 1, 2, 10, 0F); // Box 41
		bodyModel[27].setRotationPoint(-9F, 15F, -5F);

		bodyModel[28].addBox(0F, 0F, 0F, 18, 2, 6, 0F); // Box 44
		bodyModel[28].setRotationPoint(-9F, 44F, -3F);

		bodyModel[29].addBox(0F, 0F, 0F, 2, 5, 20, 0F); // Box 58
		bodyModel[29].setRotationPoint(26F, 17F, -10F);

		bodyModel[30].addBox(0F, 0F, 0F, 6, 6, 0, 0F); // Box 59
		bodyModel[30].setRotationPoint(-15F, 11F, -5F);

		bodyModel[31].addBox(0F, 0F, 0F, 52, 1, 22, 0F); // Box 65
		bodyModel[31].setRotationPoint(26F, 21F, 11F);
		bodyModel[31].rotateAngleY = -3.14159265F;

		bodyModel[32].addBox(0F, 0F, 0F, 6, 6, 0, 0F); // Box 66
		bodyModel[32].setRotationPoint(-24F, 11F, -5F);

		bodyModel[33].addBox(0F, 0F, 0F, 10, 4, 2, 0F); // Box 67
		bodyModel[33].setRotationPoint(4F, 24F, -7F);
		bodyModel[33].rotateAngleY = -3.14159265F;

		bodyModel[34].addBox(0F, 0F, 0F, 2, 4, 2, 0F); // Box 74
		bodyModel[34].setRotationPoint(0F, 18F, -9F);

		bodyModel[35].addBox(0F, 0F, 0F, 7, 3, 6, 0F); // Box 75
		bodyModel[35].setRotationPoint(-20F, 15F, -3F);

		bodyModel[36].addBox(0F, 0F, 0F, 2, 4, 2, 0F); // Box 76
		bodyModel[36].setRotationPoint(-4F, 18F, -9F);

		bodyModel[37].addBox(0F, 0F, 0F, 1, 6, 4, 0F); // Box 77
		bodyModel[37].setRotationPoint(2F, 13F, -10F);

		bodyModel[38].addBox(0F, 0F, 0F, 1, 6, 4, 0F); // Box 78
		bodyModel[38].setRotationPoint(-5F, 13F, -10F);

		bodyModel[39].addBox(0F, 0F, 0F, 2, 4, 4, 0F); // Box 79
		bodyModel[39].setRotationPoint(9F, 12F, -9F);

		bodyModel[40].addBox(0F, 0F, 0F, 60, 3, 2, 0F); // Box 80
		bodyModel[40].setRotationPoint(-30F, 17F, -1F);

		bodyModel[41].addBox(1F, 0F, 0F, 2, 4, 4, 0F); // Box 81
		bodyModel[41].setRotationPoint(17F, 12F, -9F);

		bodyModel[42].addBox(0F, 0F, 0F, 2, 4, 4, 0F); // Box 82
		bodyModel[42].setRotationPoint(-11F, 12F, -9F);

		bodyModel[43].addBox(0F, 0F, 0F, 2, 4, 4, 0F); // Box 83
		bodyModel[43].setRotationPoint(-20F, 12F, -9F);

		bodyModel[44].addBox(0F, -1F, 0F, 1, 5, 3, 0F); // Box 90
		bodyModel[44].setRotationPoint(1F, 12F, -8F);
		bodyModel[44].rotateAngleX = -0.78539816F;

		bodyModel[45].addBox(0F, -1F, 0F, 1, 5, 3, 0F); // Box 91
		bodyModel[45].setRotationPoint(-1F, 12F, -8F);
		bodyModel[45].rotateAngleX = -0.78539816F;

		bodyModel[46].addBox(0F, -1F, 0F, 1, 3, 5, 0F); // Box 92
		bodyModel[46].setRotationPoint(-2F, 12F, -9F);
		bodyModel[46].rotateAngleX = -0.78539816F;

		bodyModel[47].addBox(0F, -1F, 0F, 1, 3, 5, 0F); // Box 93
		bodyModel[47].setRotationPoint(-4F, 12F, -9F);
		bodyModel[47].rotateAngleX = -0.78539816F;

		bodyModel[48].addBox(0F, 0F, 0F, 1, 6, 1, 0F); // Box 96
		bodyModel[48].setRotationPoint(0F, 13F, -7F);
		bodyModel[48].rotateAngleX = -0.27925268F;

		bodyModel[49].addBox(0F, 0F, 0F, 1, 6, 1, 0F); // Box 97
		bodyModel[49].setRotationPoint(-2F, 13F, -9F);
		bodyModel[49].rotateAngleX = -0.27925268F;
		bodyModel[49].rotateAngleY = -3.14159265F;

		bodyModel[50].addBox(0F, 0F, -1F, 9, 1, 1, 0F); // Box 98
		bodyModel[50].setRotationPoint(2F, 14F, -8F);
		bodyModel[50].rotateAngleX = -0.78539816F;
		bodyModel[50].rotateAngleY = 0.15707963F;

		bodyModel[51].addBox(2F, 0F, -1F, 9, 1, 1, 0F); // Box 99
		bodyModel[51].setRotationPoint(8F, 14F, -7F);
		bodyModel[51].rotateAngleX = -0.78539816F;

		bodyModel[52].addBox(-7F, 0F, -1F, 7, 1, 1, 0F); // Box 100
		bodyModel[52].setRotationPoint(-3F, 14F, -8F);
		bodyModel[52].rotateAngleX = -0.78539816F;
		bodyModel[52].rotateAngleY = 6.00393263F;

		bodyModel[53].addBox(-31F, 0F, -1F, 9, 1, 1, 0F); // Box 101
		bodyModel[53].setRotationPoint(12F, 14F, -7F);
		bodyModel[53].rotateAngleX = -0.78539816F;

		bodyModel[54].addBox(0F, -1F, 0F, 18, 2, 5, 0F); // Box 102
		bodyModel[54].setRotationPoint(-9F, 41F, -11F);
		bodyModel[54].rotateAngleX = -0.71558499F;

		bodyModel[55].addBox(0F, -2F, 0F, 18, 2, 5, 0F); // Box 103
		bodyModel[55].setRotationPoint(9F, 46F, -3F);
		bodyModel[55].rotateAngleX = -6.09119909F;
		bodyModel[55].rotateAngleY = -3.14159265F;

		bodyModel[56].addBox(0F, -1F, 0F, 18, 2, 5, 0F); // Box 104
		bodyModel[56].setRotationPoint(9F, 41F, 11F);
		bodyModel[56].rotateAngleX = -0.71558499F;
		bodyModel[56].rotateAngleY = -3.14159265F;

		bodyModel[57].addBox(0F, -2F, 0F, 18, 2, 5, 0F); // Box 105
		bodyModel[57].setRotationPoint(-9F, 46F, 3F);
		bodyModel[57].rotateAngleX = -6.09119909F;

		bodyModel[58].addBox(0F, 0F, 0F, 3, 36, 3, 0F); // Box 134
		bodyModel[58].setRotationPoint(-4F, 13F, 0F);

		bodyModel[59].addBox(0F, 0F, 0F, 3, 23, 3, 0F); // Box 135
		bodyModel[59].setRotationPoint(-1F, 13F, 0F);

		bodyModel[60].addBox(0F, 0F, 0F, 3, 23, 3, 0F); // Box 137
		bodyModel[60].setRotationPoint(-4F, 13F, 3F);

		bodyModel[61].addBox(0F, 0F, 0F, 3, 23, 3, 0F); // Box 140
		bodyModel[61].setRotationPoint(-4F, 13F, -3F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 3, 23, 3, 0F,0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 141
		bodyModel[62].setRotationPoint(-1F, 13F, -3F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 3, 23, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 142
		bodyModel[63].setRotationPoint(-1F, 13F, 3F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 3, 23, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 143
		bodyModel[64].setRotationPoint(-7F, 13F, 3F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 3, 23, 3, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 144
		bodyModel[65].setRotationPoint(-7F, 13F, -3F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 3, 6, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 167
		bodyModel[66].setRotationPoint(-1F, 36F, 0F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 3, 6, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[67].setRotationPoint(-4F, 36F, -3F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 3, 6, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 169
		bodyModel[68].setRotationPoint(-4F, 36F, 3F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 3, 6, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -3F, 0F, -3F); // Box 170
		bodyModel[69].setRotationPoint(-7F, 36F, 3F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 3, 6, 3, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 171
		bodyModel[70].setRotationPoint(-7F, 36F, -3F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 3, 6, 3, 0F,0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -3F, 0F, -3F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 172
		bodyModel[71].setRotationPoint(-1F, 36F, -3F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 3, 6, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -3F, 0F, 0F, -3F); // Box 173
		bodyModel[72].setRotationPoint(-1F, 36F, 3F);

		bodyModel[73].addBox(0F, 0F, 0F, 2, 6, 5, 0F); // Box 179
		bodyModel[73].setRotationPoint(1F, 22F, -1F);

		bodyModel[74].addBox(0F, 0F, 0F, 3, 23, 3, 0F); // Box 323
		bodyModel[74].setRotationPoint(-7F, 13F, 0F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 3, 6, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 324
		bodyModel[75].setRotationPoint(-7F, 36F, 0F);

		bodyModel[76].addBox(0F, 0F, 0F, 16, 11, 16, 0F); // Box 86
		bodyModel[76].setRotationPoint(-24F, 22F, -8F);

		bodyModel[77].addBox(0F, 0F, 0F, 16, 11, 1, 0F); // Box 88
		bodyModel[77].setRotationPoint(10F, 22F, -8F);

		bodyModel[78].addBox(0F, 0F, 0F, 16, 11, 1, 0F); // Box 89
		bodyModel[78].setRotationPoint(10F, 22F, 7F);

		bodyModel[79].addBox(0F, 0F, 0F, 1, 11, 14, 0F); // Box 90
		bodyModel[79].setRotationPoint(25F, 22F, -7F);

		bodyModel[80].addBox(0F, 0F, 0F, 1, 11, 0, 0F); // Box 92
		bodyModel[80].setRotationPoint(12F, 22F, -8.01F);

		bodyModel[81].addBox(0F, 0F, 0F, 1, 11, 0, 0F); // Box 93
		bodyModel[81].setRotationPoint(23F, 22F, -8.01F);

		bodyModel[82].addBox(0F, 0F, 0F, 15, 1, 0, 0F); // Box 94
		bodyModel[82].setRotationPoint(12F, 32F, -8.01F);
		bodyModel[82].rotateAngleZ = 0.71558499F;

		bodyModel[83].addBox(0F, 0F, 0F, 2, 1, 0, 0F); // Box 95
		bodyModel[83].setRotationPoint(24F, 23F, -8.01F);

		bodyModel[84].addBox(0F, 0F, 0F, 0, 11, 1, 0F); // Box 96
		bodyModel[84].setRotationPoint(26.01F, 22F, -6F);

		bodyModel[85].addBox(0F, 0F, 0F, 2, 1, 0, 0F); // Box 97
		bodyModel[85].setRotationPoint(24F, 31F, -8.01F);

		bodyModel[86].addBox(0F, 0F, 0F, 0, 1, 2, 0F); // Box 98
		bodyModel[86].setRotationPoint(26.01F, 31F, -8F);

		bodyModel[87].addBox(0F, 0F, 0F, 0, 1, 2, 0F); // Box 99
		bodyModel[87].setRotationPoint(26.01F, 23F, -8F);

		bodyModel[88].addBox(0F, 0F, 0F, 0, 11, 1, 0F); // Box 115
		bodyModel[88].setRotationPoint(26.01F, 22F, 5F);

		bodyModel[89].addBox(0F, 0F, 0F, 0, 1, 2, 0F); // Box 116
		bodyModel[89].setRotationPoint(26.01F, 23F, 6F);

		bodyModel[90].addBox(0F, 0F, 0F, 2, 1, 0, 0F); // Box 117
		bodyModel[90].setRotationPoint(24F, 23F, 8.01F);

		bodyModel[91].addBox(0F, 0F, 0F, 2, 1, 0, 0F); // Box 118
		bodyModel[91].setRotationPoint(24F, 31F, 8.01F);

		bodyModel[92].addBox(0F, 0F, 0F, 0, 1, 2, 0F); // Box 119
		bodyModel[92].setRotationPoint(26.01F, 31F, 6F);

		bodyModel[93].addBox(0F, 0F, 0F, 1, 11, 0, 0F); // Box 120
		bodyModel[93].setRotationPoint(23F, 22F, 8.01F);

		bodyModel[94].addBox(0F, 0F, 0F, 15, 1, 0, 0F); // Box 121
		bodyModel[94].setRotationPoint(12F, 32F, 8.01F);
		bodyModel[94].rotateAngleZ = 0.71558499F;

		bodyModel[95].addBox(0F, 0F, 0F, 1, 11, 0, 0F); // Box 122
		bodyModel[95].setRotationPoint(12F, 22F, 8.01F);

		bodyModel[96].addBox(0F, -1F, 0F, 3, 4, 4, 0F); // Box 70 lamp
		bodyModel[96].setRotationPoint(-20F, 34F, 2F);
		bodyModel[96].rotateAngleY = -3.14159265F;

		bodyModel[97].addBox(0F, 0F, 0F, 3, 4, 4, 0F); // Box 73 lamp
		bodyModel[97].setRotationPoint(24F, 32F, -2F);

		bodyModel[98].addBox(0F, 0F, 0F, 1, 18, 1, 0F); // Box 347
		bodyModel[98].setRotationPoint(8F, 22F, -10F);

		bodyModel[99].addBox(0F, 0F, 0F, 18, 2, 1, 0F); // Box 46
		bodyModel[99].setRotationPoint(-9F, 40F, 9F);

		bodyModel[100].addBox(0F, 0F, 0F, 18, 2, 1, 0F); // Box 51
		bodyModel[100].setRotationPoint(-9F, 40F, -10F);

		bodyModel[101].addBox(0F, 0F, 0F, 1, 18, 1, 0F); // Box 350
		bodyModel[101].setRotationPoint(-9F, 22F, -10F);

		bodyModel[102].addBox(0F, 0F, 0F, 1, 18, 1, 0F); // Box 351
		bodyModel[102].setRotationPoint(-9F, 22F, 9F);

		bodyModel[103].addBox(0F, 0F, 0F, 1, 18, 1, 0F); // Box 352
		bodyModel[103].setRotationPoint(8F, 22F, 9F);

		bodyModel[104].addBox(0F, 0F, 0F, 1, 18, 1, 0F); // Box 353
		bodyModel[104].setRotationPoint(-7F, 22F, -10F);

		bodyModel[105].addBox(0F, 0F, 0F, 1, 18, 1, 0F); // Box 354
		bodyModel[105].setRotationPoint(-7F, 22F, 9F);

		bodyModel[106].addBox(0F, 0F, 0F, 3, 3, 3, 0F); // Box 356
		bodyModel[106].setRotationPoint(-16F, 33F, -1.5F);

		bodyModel[107].addBox(0F, 0F, 0F, 5, 7, 0, 0F); // Box 357
		bodyModel[107].setRotationPoint(4F, 14F, -11F);

		bodyModel[108].addBox(0F, 0F, 0F, 5, 7, 0, 0F); // Box 358
		bodyModel[108].setRotationPoint(4F, 14F, 11F);

		bodyModel[109].addBox(0F, 0F, 0F, 4, 3, 8, 0F); // Box 359
		bodyModel[109].setRotationPoint(-28F, 22F, -4F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 4, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 360
		bodyModel[110].setRotationPoint(-28F, 25F, -4F);

		bodyModel[111].addBox(0F, 0F, 0F, 13, 1, 1, 0F); // Box 361
		bodyModel[111].setRotationPoint(-19F, 26F, -9F);

		bodyModel[112].addBox(0F, 0F, 0F, 7, 1, 1, 0F); // Box 362
		bodyModel[112].setRotationPoint(-19F, 23F, -9F);

		bodyModel[113].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 363
		bodyModel[113].setRotationPoint(-9F, 24F, -9F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 364
		bodyModel[114].setRotationPoint(-12F, 23F, -9F);

		bodyModel[115].addBox(0F, 0F, 0F, 15, 3, 3, 0F); // Box 196
		bodyModel[115].setRotationPoint(10F, 28F, 4F);

		bodyModel[116].addBox(0F, 0F, 0F, 16, 3, 3, 0F); // Box 197
		bodyModel[116].setRotationPoint(9F, 28F, 1F);

		bodyModel[117].addBox(0F, 0F, 0F, 13, 3, 3, 0F); // Box 198
		bodyModel[117].setRotationPoint(12F, 28F, -2F);

		bodyModel[118].addBox(0F, 0F, 0F, 15, 3, 3, 0F); // Box 199
		bodyModel[118].setRotationPoint(10F, 28F, -6F);

		bodyModel[119].addBox(0F, 0F, 0F, 16, 3, 3, 0F); // Box 200
		bodyModel[119].setRotationPoint(9F, 25F, -7F);

		bodyModel[120].addBox(0F, 0F, 0F, 15, 3, 3, 0F); // Box 201
		bodyModel[120].setRotationPoint(10F, 25F, -4F);

		bodyModel[121].addBox(0F, 0F, 0F, 15, 3, 3, 0F); // Box 202
		bodyModel[121].setRotationPoint(10F, 25F, 0F);

		bodyModel[122].addBox(0F, 0F, 0F, 14, 3, 3, 0F); // Box 203
		bodyModel[122].setRotationPoint(11F, 25F, 4F);

		bodyModel[123].addBox(0F, 0F, 0F, 16, 3, 3, 0F); // Box 204
		bodyModel[123].setRotationPoint(9F, 22F, 3F);

		bodyModel[124].addBox(0F, 0F, 0F, 15, 3, 3, 0F); // Box 205
		bodyModel[124].setRotationPoint(10F, 22F, -1F);

		bodyModel[125].addBox(0F, 0F, 0F, 16, 3, 3, 0F); // Box 206
		bodyModel[125].setRotationPoint(9F, 22F, -5F);

		bodyModel[126].addBox(0F, 0F, 0F, 6, 6, 1, 0F); // Box 174
		bodyModel[126].setRotationPoint(-4F, 22F, -6F);

		bodyModel[127].addBox(0F, 0F, 0F, 1, 9, 1, 0F); // Box 184
		bodyModel[127].setRotationPoint(-3F, 26F, -5F);

		bodyModel[128].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 185
		bodyModel[128].setRotationPoint(-3F, 34F, -4F);

		bodyModel[129].addBox(0F, 0F, 0F, 1, 9, 1, 0F); // Box 379
		bodyModel[129].setRotationPoint(1F, 39F, -0.5F);

		bodyModel[130].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 380
		bodyModel[130].setRotationPoint(-1F, 38F, -0.5F);

		bodyModel[131].addBox(0F, 0F, 0F, 0, 1, 8, 0F); // Box 381
		bodyModel[131].setRotationPoint(4F, 21F, -11F);

		bodyModel[132].addBox(0F, 0F, 0F, 0, 1, 8, 0F); // Box 382
		bodyModel[132].setRotationPoint(-6F, 21F, -11F);

		bodyModel[133].addBox(0F, 0F, 0F, 10, 1, 0, 0F); // Box 383
		bodyModel[133].setRotationPoint(-6F, 21F, -5F);
	}
	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {

		for (ModelRendererTurbo m : bodyModel) {
			if (m.boxName.equals("lamp")) {
				Minecraft.getMinecraft().entityRenderer.disableLightmap(1D);
			}
			m.render(f5);
			if (m.boxName.equals("lamp")) {
				Minecraft.getMinecraft().entityRenderer.enableLightmap(1D);
			}
		}
	}
}