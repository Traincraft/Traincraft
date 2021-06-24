//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2021 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: ClimaxNew
// Model Creator: Bida
// Created on: 27.10.2020 - 13:21:34
// Last changed on: 27.10.2020 - 13:21:34

package train.client.render.models; //Path where the model is located

import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import tmt.ModelConverter;
import tmt.ModelRendererTurbo;

public class ModelClimaxNew extends ModelConverter //Same as Filename
{
	int textureX = 256;
	int textureY = 256;

	public ModelClimaxNew() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[116];

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
		bodyModel[4] = new ModelRendererTurbo(this, 220, 128, textureX, textureY); // Box 8
		bodyModel[5] = new ModelRendererTurbo(this, 220, 128, textureX, textureY); // Box 9
		bodyModel[6] = new ModelRendererTurbo(this, 219, 229, textureX, textureY); // Box 10
		bodyModel[7] = new ModelRendererTurbo(this, 219, 229, textureX, textureY); // Box 11
		bodyModel[8] = new ModelRendererTurbo(this, 196, 236, textureX, textureY); // Box 12
		bodyModel[9] = new ModelRendererTurbo(this, 40, 27, textureX, textureY); // Box 13
		bodyModel[10] = new ModelRendererTurbo(this, 3, 37, textureX, textureY); // Box 14
		bodyModel[11] = new ModelRendererTurbo(this, 48, 3, textureX, textureY); // Box 15
		bodyModel[12] = new ModelRendererTurbo(this, 3, 13, textureX, textureY); // Box 16
		bodyModel[13] = new ModelRendererTurbo(this, 211, 209, textureX, textureY); // Box 17
		bodyModel[14] = new ModelRendererTurbo(this, 40, 27, textureX, textureY); // Box 18
		bodyModel[15] = new ModelRendererTurbo(this, 48, 3, textureX, textureY); // Box 19
		bodyModel[16] = new ModelRendererTurbo(this, 28, 8, textureX, textureY); // Box 20
		bodyModel[17] = new ModelRendererTurbo(this, 3, 240, textureX, textureY); // Box 21
		bodyModel[18] = new ModelRendererTurbo(this, 3, 13, textureX, textureY); // Box 22
		bodyModel[19] = new ModelRendererTurbo(this, 28, 8, textureX, textureY); // Box 23
		bodyModel[20] = new ModelRendererTurbo(this, 3, 27, textureX, textureY); // Box 24
		bodyModel[21] = new ModelRendererTurbo(this, 213, 152, textureX, textureY); // Box 25 (-13x)
		bodyModel[22] = new ModelRendererTurbo(this, 188, 11, textureX, textureY); // Box 26
		bodyModel[23] = new ModelRendererTurbo(this, 188, 11, textureX, textureY); // Box 27
		bodyModel[24] = new ModelRendererTurbo(this, 203, 11, textureX, textureY); // Box 28
		bodyModel[25] = new ModelRendererTurbo(this, 203, 11, textureX, textureY); // Box 29
		bodyModel[26] = new ModelRendererTurbo(this, 196, 236, textureX, textureY); // Box 30
		bodyModel[27] = new ModelRendererTurbo(this, 213, 184, textureX, textureY); // Box 31
		bodyModel[28] = new ModelRendererTurbo(this, 28, 8, textureX, textureY); // Box 32
		bodyModel[29] = new ModelRendererTurbo(this, 3, 74, textureX, textureY); // Box 33
		bodyModel[30] = new ModelRendererTurbo(this, 3, 13, textureX, textureY); // Box 34
		bodyModel[31] = new ModelRendererTurbo(this, 149, 224, textureX, textureY); // Box 36
		bodyModel[32] = new ModelRendererTurbo(this, 205, 185, textureX, textureY); // Box 38
		bodyModel[33] = new ModelRendererTurbo(this, 129, 223, textureX, textureY); // Box 39
		bodyModel[34] = new ModelRendererTurbo(this, 120, 239, textureX, textureY); // Box 40
		bodyModel[35] = new ModelRendererTurbo(this, 3, 13, textureX, textureY); // Box 41
		bodyModel[36] = new ModelRendererTurbo(this, 129, 189, textureX, textureY); // Box 42
		bodyModel[37] = new ModelRendererTurbo(this, 193, 232, textureX, textureY); // Box 43
		bodyModel[38] = new ModelRendererTurbo(this, 3, 50, textureX, textureY); // Box 44
		bodyModel[39] = new ModelRendererTurbo(this, 213, 121, textureX, textureY); // Box 45
		bodyModel[40] = new ModelRendererTurbo(this, 213, 146, textureX, textureY); // Box 46
		bodyModel[41] = new ModelRendererTurbo(this, 221, 163, textureX, textureY); // Box 47
		bodyModel[42] = new ModelRendererTurbo(this, 214, 163, textureX, textureY); // Box 48
		bodyModel[43] = new ModelRendererTurbo(this, 221, 154, textureX, textureY); // Box 49
		bodyModel[44] = new ModelRendererTurbo(this, 214, 154, textureX, textureY); // Box 50
		bodyModel[45] = new ModelRendererTurbo(this, 213, 149, textureX, textureY); // Box 51
		bodyModel[46] = new ModelRendererTurbo(this, 246, 163, textureX, textureY); // Box 52
		bodyModel[47] = new ModelRendererTurbo(this, 246, 163, textureX, textureY); // Box 53
		bodyModel[48] = new ModelRendererTurbo(this, 236, 163, textureX, textureY); // Box 54
		bodyModel[49] = new ModelRendererTurbo(this, 236, 163, textureX, textureY); // Box 55
		bodyModel[50] = new ModelRendererTurbo(this, 237, 147, textureX, textureY); // Box 56
		bodyModel[51] = new ModelRendererTurbo(this, 211, 209, textureX, textureY); // Box 58
		bodyModel[52] = new ModelRendererTurbo(this, 188, 11, textureX, textureY); // Box 59
		bodyModel[53] = new ModelRendererTurbo(this, 61, 186, textureX, textureY); // Box 60
		bodyModel[54] = new ModelRendererTurbo(this, 1, 214, textureX, textureY); // Box 65
		bodyModel[55] = new ModelRendererTurbo(this, 188, 11, textureX, textureY); // Box 66
		bodyModel[56] = new ModelRendererTurbo(this, 77, 188, textureX, textureY); // Box 69
		bodyModel[57] = new ModelRendererTurbo(this, 94, 187, textureX, textureY, "lamp"); // Box 70 rear light
		bodyModel[58] = new ModelRendererTurbo(this, 58, 173, textureX, textureY); // Box 71
		bodyModel[59] = new ModelRendererTurbo(this, 59, 163, textureX, textureY); // Box 72
		bodyModel[60] = new ModelRendererTurbo(this, 94, 197, textureX, textureY, "lamp"); // Box 73 front light
		bodyModel[61] = new ModelRendererTurbo(this, 3, 37, textureX, textureY); // Box 75
		bodyModel[62] = new ModelRendererTurbo(this, 16, 11, textureX, textureY); // Box 79
		bodyModel[63] = new ModelRendererTurbo(this, 0, 208, textureX, textureY); // Box 80
		bodyModel[64] = new ModelRendererTurbo(this, 16, 11, textureX, textureY); // Box 81
		bodyModel[65] = new ModelRendererTurbo(this, 16, 11, textureX, textureY); // Box 82
		bodyModel[66] = new ModelRendererTurbo(this, 16, 11, textureX, textureY); // Box 83
		bodyModel[67] = new ModelRendererTurbo(this, 110, 184, textureX, textureY); // Box 84
		bodyModel[68] = new ModelRendererTurbo(this, 168, 201, textureX, textureY); // Box 89
		bodyModel[69] = new ModelRendererTurbo(this, 221, 121, textureX, textureY); // Box 94
		bodyModel[70] = new ModelRendererTurbo(this, 221, 121, textureX, textureY); // Box 95
		bodyModel[71] = new ModelRendererTurbo(this, 3, 0, textureX, textureY); // Box 99
		bodyModel[72] = new ModelRendererTurbo(this, 3, 6, textureX, textureY); // Box 101
		bodyModel[73] = new ModelRendererTurbo(this, 4, 67, textureX, textureY); // Box 102
		bodyModel[74] = new ModelRendererTurbo(this, 4, 59, textureX, textureY); // Box 103
		bodyModel[75] = new ModelRendererTurbo(this, 4, 67, textureX, textureY); // Box 104
		bodyModel[76] = new ModelRendererTurbo(this, 4, 59, textureX, textureY); // Box 105
		bodyModel[77] = new ModelRendererTurbo(this, 154, 185, textureX, textureY); // Box 106
		bodyModel[78] = new ModelRendererTurbo(this, 3, 6, textureX, textureY); // Box 99
		bodyModel[79] = new ModelRendererTurbo(this, 65, 154, textureX, textureY); // Box 242
		bodyModel[80] = new ModelRendererTurbo(this, 1, 180, textureX, textureY); // Box 0
		bodyModel[81] = new ModelRendererTurbo(this, 1, 170, textureX, textureY); // Box 1
		bodyModel[82] = new ModelRendererTurbo(this, 1, 150, textureX, textureY); // Box 2
		bodyModel[83] = new ModelRendererTurbo(this, 1, 160, textureX, textureY); // Box 3
		bodyModel[84] = new ModelRendererTurbo(this, 1, 135, textureX, textureY); // Box 57
		bodyModel[85] = new ModelRendererTurbo(this, 1, 190, textureX, textureY); // Box 107
		bodyModel[86] = new ModelRendererTurbo(this, 3, 6, textureX, textureY); // Box 249
		bodyModel[87] = new ModelRendererTurbo(this, 3, 6, textureX, textureY); // Box 250
		bodyModel[88] = new ModelRendererTurbo(this, 101, 197, textureX, textureY); // Box 251
		bodyModel[89] = new ModelRendererTurbo(this, 101, 197, textureX, textureY); // Box 252
		bodyModel[90] = new ModelRendererTurbo(this, 92, 161, textureX, textureY); // Box 253
		bodyModel[91] = new ModelRendererTurbo(this, 92, 161, textureX, textureY); // Box 254
		bodyModel[92] = new ModelRendererTurbo(this, 3, 6, textureX, textureY); // Box 255
		bodyModel[93] = new ModelRendererTurbo(this, 92, 149, textureX, textureY); // Box 256
		bodyModel[94] = new ModelRendererTurbo(this, 70, 148, textureX, textureY); // Box 257
		bodyModel[95] = new ModelRendererTurbo(this, 70, 148, textureX, textureY); // Box 258
		bodyModel[96] = new ModelRendererTurbo(this, 3, 3, textureX, textureY); // Box 259
		bodyModel[97] = new ModelRendererTurbo(this, 3, 3, textureX, textureY); // Box 260
		bodyModel[98] = new ModelRendererTurbo(this, 3, 6, textureX, textureY); // Box 261
		bodyModel[99] = new ModelRendererTurbo(this, 110, 174, textureX, textureY); // Box 262
		bodyModel[100] = new ModelRendererTurbo(this, 3, 6, textureX, textureY); // Box 263
		bodyModel[101] = new ModelRendererTurbo(this, 60, 146, textureX, textureY); // Box 264
		bodyModel[102] = new ModelRendererTurbo(this, 60, 146, textureX, textureY); // Box 265
		bodyModel[103] = new ModelRendererTurbo(this, 3, 6, textureX, textureY); // Box 266
		bodyModel[104] = new ModelRendererTurbo(this, 110, 174, textureX, textureY); // Box 267
		bodyModel[105] = new ModelRendererTurbo(this, 175, 130, textureX, textureY); // Box 268
		bodyModel[106] = new ModelRendererTurbo(this, 3, 74, textureX, textureY); // Box 269
		bodyModel[107] = new ModelRendererTurbo(this, 3, 74, textureX, textureY); // Box 270
		bodyModel[108] = new ModelRendererTurbo(this, 3, 74, textureX, textureY); // Box 271
		bodyModel[109] = new ModelRendererTurbo(this, 3, 78, textureX, textureY); // Box 272
		bodyModel[110] = new ModelRendererTurbo(this, 3, 78, textureX, textureY); // Box 273
		bodyModel[111] = new ModelRendererTurbo(this, 65, 117, textureX, textureY); // Box 277
		bodyModel[112] = new ModelRendererTurbo(this, 67, 132, textureX, textureY); // Box 278
		bodyModel[113] = new ModelRendererTurbo(this, 67, 132, textureX, textureY); // Box 279
		bodyModel[114] = new ModelRendererTurbo(this, 4, 75, textureX, textureY); // Box 137
		bodyModel[115] = new ModelRendererTurbo(this, 4, 75, textureX, textureY); // Box 138

		bodyModel[0].addBox(0F, 0F, 0F, 6, 6, 0, 0F); // Box 4
		bodyModel[0].setRotationPoint(-24F, 11F, 5F);

		bodyModel[1].addBox(0F, 0F, 0F, 17, 5, 1, 0F); // Box 5
		bodyModel[1].setRotationPoint(-25F, 12F, -6F);

		bodyModel[2].addBox(0F, 0F, 0F, 6, 6, 0, 0F); // Box 6
		bodyModel[2].setRotationPoint(-15F, 11F, 5F);

		bodyModel[3].addBox(0F, 0F, 0F, 2, 2, 14, 0F); // Box 7
		bodyModel[3].setRotationPoint(-22F, 13F, -7F);

		bodyModel[4].addBox(0F, 0F, 0F, 4, 1, 2, 0F); // Box 8
		bodyModel[4].setRotationPoint(-14F, 17F, -11F);

		bodyModel[5].addBox(0F, 0F, 0F, 4, 1, 2, 0F); // Box 9
		bodyModel[5].setRotationPoint(-14F, 17F, 9F);

		bodyModel[6].addBox(0F, 0F, 0F, 0, 4, 18, 0F); // Box 10
		bodyModel[6].setRotationPoint(28F, 13F, -9F);

		bodyModel[7].addBox(0F, 0F, 0F, 0, 4, 18, 0F); // Box 11
		bodyModel[7].setRotationPoint(-28F, 13F, -9F);

		bodyModel[8].addBox(0F, 0F, 0F, 2, 1, 18, 0F); // Box 12
		bodyModel[8].setRotationPoint(-30F, 13F, -9F);

		bodyModel[9].addBox(0F, 0F, 0F, 17, 5, 1, 0F); // Box 13
		bodyModel[9].setRotationPoint(-25F, 12F, 5F);

		bodyModel[10].addBox(0F, 0F, 0F, 7, 3, 6, 0F); // Box 14
		bodyModel[10].setRotationPoint(13F, 15F, -3F);

		bodyModel[11].addBox(0F, 0F, 0F, 3, 2, 14, 0F); // Box 15
		bodyModel[11].setRotationPoint(-18F, 15F, -7F);

		bodyModel[12].addBox(0F, 0F, 0F, 1, 2, 10, 0F); // Box 16
		bodyModel[12].setRotationPoint(24F, 15F, -5F);

		bodyModel[13].addBox(0F, 0F, 0F, 2, 5, 20, 0F); // Box 17
		bodyModel[13].setRotationPoint(-26F, 17F, 10F);
		bodyModel[13].rotateAngleY = -3.14159265F;

		bodyModel[14].addBox(0F, 0F, 0F, 17, 5, 1, 0F); // Box 18
		bodyModel[14].setRotationPoint(8F, 12F, 5F);

		bodyModel[15].addBox(0F, 0F, 0F, 3, 2, 14, 0F); // Box 19
		bodyModel[15].setRotationPoint(15F, 15F, -7F);

		bodyModel[16].addBox(0F, 0F, 0F, 2, 2, 14, 0F); // Box 20
		bodyModel[16].setRotationPoint(11F, 13F, -7F);

		bodyModel[17].addBox(0F, 0F, 0F, 52, 3, 12, 0F); // Box 21
		bodyModel[17].setRotationPoint(-26F, 18F, -6F);

		bodyModel[18].addBox(0F, 0F, 0F, 1, 2, 10, 0F); // Box 22
		bodyModel[18].setRotationPoint(-25F, 15F, -5F);

		bodyModel[19].addBox(0F, 0F, 0F, 2, 2, 14, 0F); // Box 23
		bodyModel[19].setRotationPoint(20F, 13F, -7F);

		bodyModel[20].addBox(0F, 0F, 0F, 17, 5, 1, 0F); // Box 24
		bodyModel[20].setRotationPoint(8F, 12F, -6F);

		bodyModel[21].addBox(0F, 0F, 0F, 1, 11, 20, 0F); // Box 25 (-13x)
		bodyModel[21].setRotationPoint(1F, 22F, -10F);

		bodyModel[22].addBox(0F, 0F, 0F, 6, 6, 0, 0F); // Box 26
		bodyModel[22].setRotationPoint(9F, 11F, -5F);

		bodyModel[23].addBox(0F, 0F, 0F, 6, 6, 0, 0F); // Box 27
		bodyModel[23].setRotationPoint(18F, 11F, -5F);

		bodyModel[24].addBox(0F, 0F, 0F, 6, 6, 0, 0F); // Box 28
		bodyModel[24].setRotationPoint(18F, 11F, 5F);

		bodyModel[25].addBox(0F, 0F, 0F, 6, 6, 0, 0F); // Box 29
		bodyModel[25].setRotationPoint(9F, 11F, 5F);

		bodyModel[26].addBox(0F, 0F, 0F, 2, 1, 18, 0F); // Box 30
		bodyModel[26].setRotationPoint(28F, 13F, -9F);

		bodyModel[27].addBox(0F, -1F, 0F, 1, 3, 20, 0F); // Box 31
		bodyModel[27].setRotationPoint(-17F, 29F, -10F);

		bodyModel[28].addBox(0F, 0F, 0F, 2, 2, 14, 0F); // Box 32
		bodyModel[28].setRotationPoint(-13F, 13F, -7F);

		bodyModel[29].addBox(0F, 0F, 0F, 0, 1, 6, 0F); // Box 33
		bodyModel[29].setRotationPoint(2F, 21F, -11F);

		bodyModel[30].addBox(0F, 0F, 0F, 1, 2, 10, 0F); // Box 34
		bodyModel[30].setRotationPoint(8F, 15F, -5F);

		bodyModel[31].addBox(0F, 0F, 0F, 11, 6, 20, 0F); // Box 36
		bodyModel[31].setRotationPoint(-26F, 22F, -10F);

		bodyModel[32].addBox(0F, 0F, 0F, 12, 10, 1, 0F); // Box 38
		bodyModel[32].setRotationPoint(-10F, 22F, -11F);

		bodyModel[33].addBox(0F, 0F, 0F, 13, 10, 1, 0F); // Box 39
		bodyModel[33].setRotationPoint(-27F, 22F, -11F);

		bodyModel[34].addBox(0F, 0F, 0F, 13, 10, 1, 0F); // Box 40
		bodyModel[34].setRotationPoint(-27F, 22F, 10F);

		bodyModel[35].addBox(0F, 0F, 0F, 1, 2, 10, 0F); // Box 41
		bodyModel[35].setRotationPoint(-9F, 15F, -5F);

		bodyModel[36].addBox(0F, 0F, 0F, 1, 10, 20, 0F); // Box 42
		bodyModel[36].setRotationPoint(-27F, 22F, -10F);

		bodyModel[37].addBox(0F, -1F, 0F, 3, 4, 6, 0F); // Box 43
		bodyModel[37].setRotationPoint(-24F, 29F, -3F);

		bodyModel[38].addBox(0F, 0F, 0F, 18, 2, 6, 0F); // Box 44
		bodyModel[38].setRotationPoint(-15F, 42F, -3F);

		bodyModel[39].addBox(0F, 0F, 0F, 1, 3, 20, 0F); // Box 45
		bodyModel[39].setRotationPoint(1F, 39F, -10F);

		bodyModel[40].addBox(0F, 0F, 0F, 12, 1, 1, 0F); // Box 46
		bodyModel[40].setRotationPoint(-10F, 38F, 10F);

		bodyModel[41].addBox(0F, 0F, 0F, 4, 6, 1, 0F); // Box 47
		bodyModel[41].setRotationPoint(-2F, 32F, 10F);

		bodyModel[42].addBox(0F, 0F, 0F, 2, 6, 1, 0F); // Box 48
		bodyModel[42].setRotationPoint(-10F, 32F, 10F);

		bodyModel[43].addBox(0F, 0F, 0F, 4, 6, 1, 0F); // Box 49
		bodyModel[43].setRotationPoint(-2F, 32F, -11F);

		bodyModel[44].addBox(0F, 0F, 0F, 2, 6, 1, 0F); // Box 50
		bodyModel[44].setRotationPoint(-10F, 32F, -11F);

		bodyModel[45].addBox(0F, 0F, 0F, 12, 1, 1, 0F); // Box 51
		bodyModel[45].setRotationPoint(-10F, 38F, -11F);

		bodyModel[46].addBox(0F, 0F, 0F, 1, 6, 1, 0F); // Box 52
		bodyModel[46].setRotationPoint(1F, 33F, -10F);

		bodyModel[47].addBox(0F, 0F, 0F, 1, 6, 1, 0F); // Box 53
		bodyModel[47].setRotationPoint(1F, 33F, 9F);

		bodyModel[48].addBox(0F, 0F, 0F, 1, 6, 1, 0F); // Box 54
		bodyModel[48].setRotationPoint(1F, 33F, -5F);

		bodyModel[49].addBox(0F, 0F, 0F, 1, 6, 1, 0F); // Box 55
		bodyModel[49].setRotationPoint(1F, 33F, 4F);

		bodyModel[50].addBox(0F, 0F, 0F, 1, 2, 8, 0F); // Box 56
		bodyModel[50].setRotationPoint(1F, 33F, -4F);

		bodyModel[51].addBox(0F, 0F, 0F, 2, 5, 20, 0F); // Box 58
		bodyModel[51].setRotationPoint(26F, 17F, -10F);

		bodyModel[52].addBox(0F, 0F, 0F, 6, 6, 0, 0F); // Box 59
		bodyModel[52].setRotationPoint(-15F, 11F, -5F);

		bodyModel[53].addBox(0F, 0F, 0F, 1, 6, 6, 0F); // Box 60
		bodyModel[53].setRotationPoint(22F, 26F, -3F);

		bodyModel[54].addBox(0F, 0F, 0F, 52, 1, 22, 0F); // Box 65
		bodyModel[54].setRotationPoint(-26F, 21F, -11F);

		bodyModel[55].addBox(0F, 0F, 0F, 6, 6, 0, 0F); // Box 66
		bodyModel[55].setRotationPoint(-24F, 11F, -5F);

		bodyModel[56].addBox(0F, 0F, -2F, 4, 14, 4, 0F); // Box 69
		bodyModel[56].setRotationPoint(20F, 44F, 0F);
		bodyModel[56].rotateAngleZ = -3.14159265F;

		bodyModel[57].addBox(0F, -1F, 0F, 3, 4, 4, 0F); // Box 70 rear light
		bodyModel[57].setRotationPoint(-25.5F, 32F, 2F);
		bodyModel[57].rotateAngleY = -3.14159265F;

		bodyModel[58].addBox(0F, 0F, 0F, 6, 4, 6, 0F); // Box 71
		bodyModel[58].setRotationPoint(6F, 33F, -3F);

		bodyModel[59].addBox(0F, 0F, 0F, 4, 4, 4, 0F); // Box 72
		bodyModel[59].setRotationPoint(7F, 35F, -2F);

		bodyModel[60].addBox(0F, 0F, 0F, 3, 4, 4, 0F); // Box 73 front light
		bodyModel[60].setRotationPoint(22F, 34F, -2F);

		bodyModel[61].addBox(0F, 0F, 0F, 7, 3, 6, 0F); // Box 75
		bodyModel[61].setRotationPoint(-20F, 15F, -3F);

		bodyModel[62].addBox(0F, 0F, 0F, 2, 4, 4, 0F); // Box 79
		bodyModel[62].setRotationPoint(9F, 12F, -2F);

		bodyModel[63].addBox(0F, 0F, 0F, 60, 3, 2, 0F); // Box 80
		bodyModel[63].setRotationPoint(-30F, 17F, -1F);

		bodyModel[64].addBox(1F, 0F, 0F, 2, 4, 4, 0F); // Box 81
		bodyModel[64].setRotationPoint(17F, 12F, -2F);

		bodyModel[65].addBox(0F, 0F, 0F, 2, 4, 4, 0F); // Box 82
		bodyModel[65].setRotationPoint(-11F, 12F, -2F);

		bodyModel[66].addBox(0F, 0F, 0F, 2, 4, 4, 0F); // Box 83
		bodyModel[66].setRotationPoint(-20F, 12F, -2F);

		bodyModel[67].addBox(0F, 0F, 0F, 8, 11, 10, 0F); // Box 84
		bodyModel[67].setRotationPoint(-2F, 16F, -5F);

		bodyModel[68].addBox(-8F, 0F, 0F, 10, 1, 20, 0F); // Box 89
		bodyModel[68].setRotationPoint(-19F, 29F, -10F);
		bodyModel[68].rotateAngleZ = 0.08726646F;

		bodyModel[69].addBox(0F, -4F, 0F, 4, 5, 1, 0F); // Box 94
		bodyModel[69].setRotationPoint(-14F, 21F, -9F);
		bodyModel[69].rotateAngleX = -6.17846555F;

		bodyModel[70].addBox(0F, -4F, 0F, 4, 5, 1, 0F); // Box 95
		bodyModel[70].setRotationPoint(-10F, 21F, 9F);
		bodyModel[70].rotateAngleX = -6.17846555F;
		bodyModel[70].rotateAngleY = -3.14159265F;

		bodyModel[71].addBox(0F, -0.5F, -0.5F, 12, 1, 1, 0F); // Box 99
		bodyModel[71].setRotationPoint(0F, 15F, -6F);
		bodyModel[71].rotateAngleX = -0.78539816F;
		bodyModel[71].rotateAngleY = 1.57079633F;

		bodyModel[72].addBox(-31F, -0.5F, -0.5F, 9, 1, 1, 0F); // Box 101
		bodyModel[72].setRotationPoint(12F, 14F, 0F);
		bodyModel[72].rotateAngleX = -0.78539816F;

		bodyModel[73].addBox(0F, -1F, 0F, 18, 2, 5, 0F); // Box 102
		bodyModel[73].setRotationPoint(-15F, 39F, -11F);
		bodyModel[73].rotateAngleX = -0.71558499F;

		bodyModel[74].addBox(0F, -2F, 0F, 18, 2, 5, 0F); // Box 103
		bodyModel[74].setRotationPoint(3F, 44F, -3F);
		bodyModel[74].rotateAngleX = -6.09119909F;
		bodyModel[74].rotateAngleY = -3.14159265F;

		bodyModel[75].addBox(0F, -1F, 0F, 18, 2, 5, 0F); // Box 104
		bodyModel[75].setRotationPoint(3F, 39F, 11F);
		bodyModel[75].rotateAngleX = -0.71558499F;
		bodyModel[75].rotateAngleY = -3.14159265F;

		bodyModel[76].addBox(0F, -2F, 0F, 18, 2, 5, 0F); // Box 105
		bodyModel[76].setRotationPoint(-15F, 44F, 3F);
		bodyModel[76].rotateAngleX = -6.09119909F;

		bodyModel[77].addBox(0F, 0F, 0F, 3, 12, 10, 0F); // Box 106
		bodyModel[77].setRotationPoint(-5F, 22F, -5F);

		bodyModel[78].addBox(2F, -0.5F, -0.5F, 9, 1, 1, 0F); // Box 99
		bodyModel[78].setRotationPoint(8F, 14F, 0F);
		bodyModel[78].rotateAngleX = -0.78539816F;

		bodyModel[79].addBox(0F, 0F, 0F, 6, 4, 4, 0F); // Box 242
		bodyModel[79].setRotationPoint(20F, 22F, -3F);
		bodyModel[79].rotateAngleY = 1.57079633F;

		bodyModel[80].addBox(0F, 0F, 0F, 24, 4, 4, 0F); // Box 0
		bodyModel[80].setRotationPoint(-2F, 27F, -5F);
		bodyModel[80].rotateAngleX = -5.49778714F;

		bodyModel[81].addBox(0F, 0F, 0F, 24, 4, 4, 0F); // Box 1
		bodyModel[81].setRotationPoint(-2F, 31F, -5F);
		bodyModel[81].rotateAngleX = -5.49778714F;

		bodyModel[82].addBox(0F, 0F, 0F, 24, 4, 4, 0F); // Box 2
		bodyModel[82].setRotationPoint(22F, 27F, 5F);
		bodyModel[82].rotateAngleX = -5.49778714F;
		bodyModel[82].rotateAngleY = -3.14159265F;

		bodyModel[83].addBox(0F, 0F, 0F, 24, 4, 4, 0F); // Box 3
		bodyModel[83].setRotationPoint(22F, 31F, 5F);
		bodyModel[83].rotateAngleX = -5.49778714F;
		bodyModel[83].rotateAngleY = -3.14159265F;

		bodyModel[84].addBox(0F, 0F, 0F, 24, 10, 4, 0F); // Box 57
		bodyModel[84].setRotationPoint(-2F, 24F, -2F);

		bodyModel[85].addBox(0F, 0F, 0F, 24, 4, 10, 0F); // Box 107
		bodyModel[85].setRotationPoint(-2F, 27F, -5F);

		bodyModel[86].addBox(0F, -0.5F, -0.5F, 9, 1, 1, 0F); // Box 249
		bodyModel[86].setRotationPoint(1F, 14F, 0F);
		bodyModel[86].rotateAngleX = -0.78539816F;

		bodyModel[87].addBox(-13F, -0.5F, -0.5F, 9, 1, 1, 0F); // Box 250
		bodyModel[87].setRotationPoint(3F, 14F, 0F);
		bodyModel[87].rotateAngleX = -0.78539816F;

		bodyModel[88].addBox(1F, 1F, 0F, 2, 4, 0, 0F); // Box 251
		bodyModel[88].setRotationPoint(19F, 34F, -1.5F);
		bodyModel[88].rotateAngleZ = 1.02974426F;

		bodyModel[89].addBox(1F, 1F, 0F, 2, 4, 0, 0F); // Box 252
		bodyModel[89].setRotationPoint(19F, 34F, 1.5F);
		bodyModel[89].rotateAngleZ = 1.02974426F;

		bodyModel[90].addBox(0F, -1.5F, -1.5F, 7, 3, 3, 0F); // Box 253
		bodyModel[90].setRotationPoint(17F, 27F, 7.5F);
		bodyModel[90].rotateAngleX = 0.78539816F;
		bodyModel[90].rotateAngleY = -3.14159265F;
		bodyModel[90].rotateAngleZ = 0.52359878F;

		bodyModel[91].addBox(0F, -1.5F, -1.5F, 7, 3, 3, 0F); // Box 254
		bodyModel[91].setRotationPoint(17F, 27F, -7.5F);
		bodyModel[91].rotateAngleX = 0.78539816F;
		bodyModel[91].rotateAngleY = -3.14159265F;
		bodyModel[91].rotateAngleZ = 0.52359878F;

		bodyModel[92].addBox(-4F, -0.5F, -0.5F, 9, 1, 1, 0F); // Box 255
		bodyModel[92].setRotationPoint(11F, 23.5F, 7.5F);
		bodyModel[92].rotateAngleX = -0.78539816F;
		bodyModel[92].rotateAngleZ = 2.61799388F;

		bodyModel[93].addBox(0F, 0F, 0F, 4, 4, 6, 0F); // Box 256
		bodyModel[93].setRotationPoint(2F, 16F, -3F);
		bodyModel[93].rotateAngleZ = -3.14159265F;

		bodyModel[94].addBox(-2F, -2F, 0F, 4, 4, 1, 0F); // Box 257
		bodyModel[94].setRotationPoint(0F, 15F, -7F);
		bodyModel[94].rotateAngleZ = -0.78539816F;

		bodyModel[95].addBox(-2F, -2F, 0F, 4, 4, 1, 0F); // Box 258
		bodyModel[95].setRotationPoint(0F, 15F, 6F);
		bodyModel[95].rotateAngleZ = -0.78539816F;

		bodyModel[96].addBox(0F, -0.5F, -0.5F, 10, 1, 1, 0F); // Box 259
		bodyModel[96].setRotationPoint(7F, 21.25F, 7.5F);
		bodyModel[96].rotateAngleX = -0.78539816F;
		bodyModel[96].rotateAngleZ = 2.28638132F;

		bodyModel[97].addBox(0F, -0.5F, -0.5F, 10, 1, 1, 0F); // Box 260
		bodyModel[97].setRotationPoint(7F, 21.25F, -7.5F);
		bodyModel[97].rotateAngleX = -0.78539816F;
		bodyModel[97].rotateAngleZ = 2.28638132F;

		bodyModel[98].addBox(-4F, -0.5F, -0.5F, 9, 1, 1, 0F); // Box 261
		bodyModel[98].setRotationPoint(11F, 23.5F, -7.5F);
		bodyModel[98].rotateAngleX = -0.78539816F;
		bodyModel[98].rotateAngleZ = 2.61799388F;

		bodyModel[99].addBox(1.4F, -1.5F, -1.5F, 5, 4, 3, 0F); // Box 262
		bodyModel[99].setRotationPoint(17F, 29F, 7.5F);
		bodyModel[99].rotateAngleY = -3.14159265F;
		bodyModel[99].rotateAngleZ = 0.52359878F;

		bodyModel[100].addBox(-2.05F, -0.5F, -0.5F, 9, 1, 1, 0F); // Box 263
		bodyModel[100].setRotationPoint(11F, 27.5F, 7.5F);
		bodyModel[100].rotateAngleX = -0.78539816F;
		bodyModel[100].rotateAngleZ = 2.61799388F;

		bodyModel[101].addBox(5F, -0.75F, -1F, 2, 5, 2, 0F); // Box 264
		bodyModel[101].setRotationPoint(11F, 27.5F, 7.5F);
		bodyModel[101].rotateAngleZ = 2.61799388F;

		bodyModel[102].addBox(5F, -0.75F, -1F, 2, 5, 2, 0F); // Box 265
		bodyModel[102].setRotationPoint(11F, 27.5F, -7.5F);
		bodyModel[102].rotateAngleZ = 2.61799388F;

		bodyModel[103].addBox(-2.05F, -0.5F, -0.5F, 9, 1, 1, 0F); // Box 266
		bodyModel[103].setRotationPoint(11F, 27.5F, -7.5F);
		bodyModel[103].rotateAngleX = -0.78539816F;
		bodyModel[103].rotateAngleZ = 2.61799388F;

		bodyModel[104].addBox(1.4F, -1.5F, -1.5F, 5, 4, 3, 0F); // Box 267
		bodyModel[104].setRotationPoint(17F, 29F, -7.5F);
		bodyModel[104].rotateAngleY = -3.14159265F;
		bodyModel[104].rotateAngleZ = 0.52359878F;

		bodyModel[105].addBox(0F, 0F, 0F, 12, 10, 1, 0F); // Box 268
		bodyModel[105].setRotationPoint(-10F, 22F, 10F);

		bodyModel[106].addBox(0F, 0F, 0F, 0, 1, 6, 0F); // Box 269
		bodyModel[106].setRotationPoint(2F, 21F, 5F);

		bodyModel[107].addBox(0F, 0F, 0F, 0, 1, 6, 0F); // Box 270
		bodyModel[107].setRotationPoint(15F, 21F, 5F);

		bodyModel[108].addBox(0F, 0F, 0F, 0, 1, 6, 0F); // Box 271
		bodyModel[108].setRotationPoint(15F, 21F, -11F);

		bodyModel[109].addBox(0F, 0F, 0F, 13, 1, 0, 0F); // Box 272
		bodyModel[109].setRotationPoint(2F, 21F, -6F);

		bodyModel[110].addBox(0F, 0F, 0F, 13, 1, 0, 0F); // Box 273
		bodyModel[110].setRotationPoint(2F, 21F, 6F);

		bodyModel[111].addBox(0F, 0F, 0F, 9, 1, 22, 0F); // Box 277
		bodyModel[111].setRotationPoint(2F, 29F, -11F);

		bodyModel[112].addBox(1.4F, -1F, -1.5F, 6, 2, 3, 0F); // Box 278
		bodyModel[112].setRotationPoint(9F, 28F, -7.5F);
		bodyModel[112].rotateAngleY = -3.14159265F;

		bodyModel[113].addBox(1.4F, -1F, -1.5F, 6, 2, 3, 0F); // Box 279
		bodyModel[113].setRotationPoint(9F, 28F, 7.5F);
		bodyModel[113].rotateAngleY = -3.14159265F;

		bodyModel[114].addBox(-0.05F, -0.5F, -0.5F, 10, 1, 1, 0F); // Box 137
		bodyModel[114].setRotationPoint(18.5F, 28.5F, 5F);
		bodyModel[114].rotateAngleX = -0.78539816F;
		bodyModel[114].rotateAngleY = 3.14159265F;
		bodyModel[114].rotateAngleZ = 2.3387412F;

		bodyModel[115].addBox(-0.05F, -0.5F, -0.5F, 10, 1, 1, 0F); // Box 138
		bodyModel[115].setRotationPoint(18.5F, 28.5F, -5F);
		bodyModel[115].rotateAngleX = 2.44346095F;
		bodyModel[115].rotateAngleY = 3.14159265F;
		bodyModel[115].rotateAngleZ = 2.3387412F;
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