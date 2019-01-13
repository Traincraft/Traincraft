//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2018 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: FOL-m1
// Model Creator:
// Created on:05.12.2018 - 10:46:56
// Last changed on: 05.12.2018 - 10:46:56

package train.client.render.models;

import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import tmt.ModelBase;
import tmt.ModelRendererTurbo;
import tmt.Tessellator;
import train.common.library.Info;

public class ModelFOL_M1 extends ModelBase
{
	int textureX = 512;
	int textureY = 512;

	public ModelFOL_M1()
	{
		fol_m1Model = new ModelRendererTurbo[124];
		fol_m1Model[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		fol_m1Model[1] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 1
		fol_m1Model[2] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 2
		fol_m1Model[3] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 3
		fol_m1Model[4] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 4
		fol_m1Model[5] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 5
		fol_m1Model[6] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 6
		fol_m1Model[7] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 7
		fol_m1Model[8] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 8
		fol_m1Model[9] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 9
		fol_m1Model[10] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 11
		fol_m1Model[11] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 12
		fol_m1Model[12] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 14
		fol_m1Model[13] = new ModelRendererTurbo(this, 281, 17, textureX, textureY); // Box 15
		fol_m1Model[14] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Box 17
		fol_m1Model[15] = new ModelRendererTurbo(this, 81, 17, textureX, textureY); // Box 18
		fol_m1Model[16] = new ModelRendererTurbo(this, 137, 33, textureX, textureY); // Box 19
		fol_m1Model[17] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 20
		fol_m1Model[18] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 23
		fol_m1Model[19] = new ModelRendererTurbo(this, 257, 41, textureX, textureY); // Box 24
		fol_m1Model[20] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 25
		fol_m1Model[21] = new ModelRendererTurbo(this, 353, 41, textureX, textureY); // Box 26
		fol_m1Model[22] = new ModelRendererTurbo(this, 409, 41, textureX, textureY); // Box 27
		fol_m1Model[23] = new ModelRendererTurbo(this, 113, 65, textureX, textureY); // Box 28
		fol_m1Model[24] = new ModelRendererTurbo(this, 41, 57, textureX, textureY); // Box 29
		fol_m1Model[25] = new ModelRendererTurbo(this, 201, 65, textureX, textureY); // Box 30
		fol_m1Model[26] = new ModelRendererTurbo(this, 441, 65, textureX, textureY); // Box 33
		fol_m1Model[27] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 34
		fol_m1Model[28] = new ModelRendererTurbo(this, 257, 81, textureX, textureY); // Box 35
		fol_m1Model[29] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 36
		fol_m1Model[30] = new ModelRendererTurbo(this, 97, 81, textureX, textureY); // Box 37
		fol_m1Model[31] = new ModelRendererTurbo(this, 385, 89, textureX, textureY); // Box 38
		fol_m1Model[32] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 39
		fol_m1Model[33] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 40
		fol_m1Model[34] = new ModelRendererTurbo(this, 113, 17, textureX, textureY); // Box 41
		fol_m1Model[35] = new ModelRendererTurbo(this, 385, 41, textureX, textureY); // Box 42
		fol_m1Model[36] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 43
		fol_m1Model[37] = new ModelRendererTurbo(this, 273, 25, textureX, textureY); // Box 44
		fol_m1Model[38] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 45
		fol_m1Model[39] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 46
		fol_m1Model[40] = new ModelRendererTurbo(this, 113, 33, textureX, textureY); // Box 47
		fol_m1Model[41] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 48
		fol_m1Model[42] = new ModelRendererTurbo(this, 233, 33, textureX, textureY); // Box 44
		fol_m1Model[43] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 44
		fol_m1Model[44] = new ModelRendererTurbo(this, 89, 17, textureX, textureY); // Box 45
		fol_m1Model[45] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 46
		fol_m1Model[46] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 47
		fol_m1Model[47] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 48
		fol_m1Model[48] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 49
		fol_m1Model[49] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 50
		fol_m1Model[50] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 51
		fol_m1Model[51] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 52
		fol_m1Model[52] = new ModelRendererTurbo(this, 265, 33, textureX, textureY); // Box 53
		fol_m1Model[53] = new ModelRendererTurbo(this, 41, 41, textureX, textureY); // Box 54
		fol_m1Model[54] = new ModelRendererTurbo(this, 233, 41, textureX, textureY); // Box 55
		fol_m1Model[55] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 56
		fol_m1Model[56] = new ModelRendererTurbo(this, 449, 9, textureX, textureY); // Box 57
		fol_m1Model[57] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 58
		fol_m1Model[58] = new ModelRendererTurbo(this, 457, 9, textureX, textureY); // Box 59
		fol_m1Model[59] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 60
		fol_m1Model[60] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 61
		fol_m1Model[61] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 62
		fol_m1Model[62] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 63
		fol_m1Model[63] = new ModelRendererTurbo(this, 81, 9, textureX, textureY); // Box 64
		fol_m1Model[64] = new ModelRendererTurbo(this, 465, 9, textureX, textureY); // Box 65
		fol_m1Model[65] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 66
		fol_m1Model[66] = new ModelRendererTurbo(this, 145, 33, textureX, textureY); // Box 67
		fol_m1Model[67] = new ModelRendererTurbo(this, 353, 41, textureX, textureY); // Box 68
		fol_m1Model[68] = new ModelRendererTurbo(this, 505, 9, textureX, textureY); // Box 69
		fol_m1Model[69] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 70
		fol_m1Model[70] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Box 71
		fol_m1Model[71] = new ModelRendererTurbo(this, 441, 41, textureX, textureY); // Box 72
		fol_m1Model[72] = new ModelRendererTurbo(this, 473, 41, textureX, textureY); // Box 73
		fol_m1Model[73] = new ModelRendererTurbo(this, 41, 49, textureX, textureY); // Box 74
		fol_m1Model[74] = new ModelRendererTurbo(this, 65, 17, textureX, textureY); // Box 75
		fol_m1Model[75] = new ModelRendererTurbo(this, 441, 49, textureX, textureY); // Box 80
		fol_m1Model[76] = new ModelRendererTurbo(this, 385, 57, textureX, textureY); // Box 82
		fol_m1Model[77] = new ModelRendererTurbo(this, 113, 17, textureX, textureY); // Box 83
		fol_m1Model[78] = new ModelRendererTurbo(this, 145, 17, textureX, textureY); // Box 84
		fol_m1Model[79] = new ModelRendererTurbo(this, 337, 41, textureX, textureY); // Box 85
		fol_m1Model[80] = new ModelRendererTurbo(this, 385, 9, textureX, textureY); // Box 86
		fol_m1Model[81] = new ModelRendererTurbo(this, 385, 41, textureX, textureY); // Box 87
		fol_m1Model[82] = new ModelRendererTurbo(this, 417, 41, textureX, textureY); // Box 88
		fol_m1Model[83] = new ModelRendererTurbo(this, 481, 49, textureX, textureY); // Box 89
		fol_m1Model[84] = new ModelRendererTurbo(this, 497, 49, textureX, textureY); // Box 90
		fol_m1Model[85] = new ModelRendererTurbo(this, 177, 65, textureX, textureY); // Box 91
		fol_m1Model[86] = new ModelRendererTurbo(this, 505, 17, textureX, textureY); // Box 92
		fol_m1Model[87] = new ModelRendererTurbo(this, 161, 25, textureX, textureY); // Box 93
		fol_m1Model[88] = new ModelRendererTurbo(this, 169, 25, textureX, textureY); // Box 94
		fol_m1Model[89] = new ModelRendererTurbo(this, 233, 25, textureX, textureY); // Box 95
		fol_m1Model[90] = new ModelRendererTurbo(this, 505, 25, textureX, textureY); // Box 96
		fol_m1Model[91] = new ModelRendererTurbo(this, 17, 33, textureX, textureY); // Box 97
		fol_m1Model[92] = new ModelRendererTurbo(this, 441, 57, textureX, textureY); // Box 98
		fol_m1Model[93] = new ModelRendererTurbo(this, 41, 33, textureX, textureY); // Box 99
		fol_m1Model[94] = new ModelRendererTurbo(this, 49, 33, textureX, textureY); // Box 100
		fol_m1Model[95] = new ModelRendererTurbo(this, 505, 33, textureX, textureY); // Box 101
		fol_m1Model[96] = new ModelRendererTurbo(this, 97, 25, textureX, textureY); // Box 102
		fol_m1Model[97] = new ModelRendererTurbo(this, 137, 41, textureX, textureY); // Box 103
		fol_m1Model[98] = new ModelRendererTurbo(this, 17, 41, textureX, textureY); // Box 104
		fol_m1Model[99] = new ModelRendererTurbo(this, 369, 41, textureX, textureY); // Box 105
		fol_m1Model[100] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 106
		fol_m1Model[101] = new ModelRendererTurbo(this, 137, 49, textureX, textureY); // Box 107
		fol_m1Model[102] = new ModelRendererTurbo(this, 73, 73, textureX, textureY); // Box 263
		fol_m1Model[103] = new ModelRendererTurbo(this, 177, 81, textureX, textureY); // Box 265
		fol_m1Model[104] = new ModelRendererTurbo(this, 505, 41, textureX, textureY); // Box 266
		fol_m1Model[105] = new ModelRendererTurbo(this, 73, 49, textureX, textureY); // Box 267
		fol_m1Model[106] = new ModelRendererTurbo(this, 233, 81, textureX, textureY); // Box 268
		fol_m1Model[107] = new ModelRendererTurbo(this, 193, 65, textureX, textureY); // Box 269
		fol_m1Model[108] = new ModelRendererTurbo(this, 233, 65, textureX, textureY); // Box 270
		fol_m1Model[109] = new ModelRendererTurbo(this, 105, 97, textureX, textureY); // Box 271
		fol_m1Model[110] = new ModelRendererTurbo(this, 305, 121, textureX, textureY); // Box 272
		fol_m1Model[111] = new ModelRendererTurbo(this, 193, 73, textureX, textureY); // Box 275
		fol_m1Model[112] = new ModelRendererTurbo(this, 305, 81, textureX, textureY); // Box 305
		fol_m1Model[113] = new ModelRendererTurbo(this, 305, 89, textureX, textureY); // Box 309
		fol_m1Model[114] = new ModelRendererTurbo(this, 233, 49, textureX, textureY); // Box 310
		fol_m1Model[115] = new ModelRendererTurbo(this, 241, 49, textureX, textureY); // Box 311
		fol_m1Model[116] = new ModelRendererTurbo(this, 305, 97, textureX, textureY); // Box 313
		fol_m1Model[117] = new ModelRendererTurbo(this, 345, 97, textureX, textureY); // Box 314
		fol_m1Model[118] = new ModelRendererTurbo(this, 329, 105, textureX, textureY); // Box 316
		fol_m1Model[119] = new ModelRendererTurbo(this, 353, 57, textureX, textureY); // Box 119
		fol_m1Model[120] = new ModelRendererTurbo(this, 489, 65, textureX, textureY); // Box 120
		fol_m1Model[121] = new ModelRendererTurbo(this, 113, 73, textureX, textureY); // Box 121 Fr
		fol_m1Model[122] = new ModelRendererTurbo(this, 489, 73, textureX, textureY); // Box 122 FL
		fol_m1Model[123] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 123 F

		fol_m1Model[0].addBox(0F, 0F, 0F, 13, 2, 22, 0F); // Box 0
		fol_m1Model[0].setRotationPoint(-24F, -24F, 3F);

		fol_m1Model[1].addBox(0F, 0F, 0F, 7, 2, 6, 0F); // Box 1
		fol_m1Model[1].setRotationPoint(-31F, -24F, 11F);

		fol_m1Model[2].addShapeBox(0F, 0F, 0F, 6, 2, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F); // Box 2
		fol_m1Model[2].setRotationPoint(-30F, -24F, 17F);

		fol_m1Model[3].addShapeBox(0F, 0F, 0F, 6, 2, 8, 0F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		fol_m1Model[3].setRotationPoint(-30F, -24F, 3F);

		fol_m1Model[4].addBox(0F, 0F, 0F, 4, 4, 1, 0F); // Box 4
		fol_m1Model[4].setRotationPoint(-15F, -22F, 3F);

		fol_m1Model[5].addBox(0F, 0F, 0F, 13, 18, 1, 0F); // Box 5
		fol_m1Model[5].setRotationPoint(-24F, -18F, 3F);

		fol_m1Model[6].addShapeBox(0F, 0F, 0F, 6, 18, 8, 0F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, -7F, -1F, 0F, 0F, 1F, 0F, -6.5F, 0F, 0F, 0F, 0F, 0F, -7F, -1F, 0F, -0.5F); // Box 6
		fol_m1Model[6].setRotationPoint(-30F, -18F, 3F);

		fol_m1Model[7].addShapeBox(0F, 0F, 0F, 2, 18, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 1F, 0F, 1.5F); // Box 7
		fol_m1Model[7].setRotationPoint(-31F, -18F, 11F);

		fol_m1Model[8].addShapeBox(0F, 0F, 0F, 6, 18, 8, 0F, -1F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, -8F, -1F, 0F, -1.5F, 0F, 0F, -7F, 0F, 0F, 0F, 1F, 0F, -6.5F); // Box 8
		fol_m1Model[8].setRotationPoint(-30F, -18F, 17F);

		fol_m1Model[9].addBox(0F, 0F, 0F, 13, 18, 1, 0F); // Box 9
		fol_m1Model[9].setRotationPoint(-24F, -18F, 24F);

		fol_m1Model[10].addBox(0F, 0F, 0F, 4, 4, 1, 0F); // Box 11
		fol_m1Model[10].setRotationPoint(-15F, -22F, 24F);

		fol_m1Model[11].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 12
		fol_m1Model[11].setRotationPoint(-32F, -15F, 13F);

		fol_m1Model[12].addShapeBox(0F, 0F, 0F, 6, 1, 8, 0F, 2F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 2F, 0F, -6.5F, 2F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 2F, 0F, -6.5F); // Box 14
		fol_m1Model[12].setRotationPoint(-30F, 0F, 17F);

		fol_m1Model[13].addBox(0F, 0F, 0F, 83, 1, 22, 0F); // Box 15
		fol_m1Model[13].setRotationPoint(-24F, 0F, 3F);

		fol_m1Model[14].addShapeBox(0F, 0F, 0F, 6, 1, 15, 0F, 2F, 0F, -6.5F, 0F, 0F, 0F, 0F, 0F, 0.5F, 2F, 0F, 0.5F, 2F, 0F, -6.5F, 0F, 0F, 0F, 0F, 0F, 0.5F, 2F, 0F, 0.5F); // Box 17
		fol_m1Model[14].setRotationPoint(-30F, 0F, 3F);

		fol_m1Model[15].addBox(0F, 0F, 0F, 2, 25, 23, 0F); // Box 18
		fol_m1Model[15].setRotationPoint(-11F, -24.5F, 2.5F);

		fol_m1Model[16].addBox(0F, 0F, 0F, 36, 2, 22, 0F); // Box 19
		fol_m1Model[16].setRotationPoint(-9F, -24F, 3F);

		fol_m1Model[17].addBox(0F, 0F, 0F, 7, 18, 22, 0F); // Box 20
		fol_m1Model[17].setRotationPoint(-9F, -18F, 3F);

		fol_m1Model[18].addBox(0F, 0F, 0F, 20, 4, 5, 0F); // Box 23
		fol_m1Model[18].setRotationPoint(-9F, -22F, 3F);

		fol_m1Model[19].addBox(0F, 0F, 0F, 33, 22, 12, 0F); // Box 24
		fol_m1Model[19].setRotationPoint(-6F, -22F, 8F);

		fol_m1Model[20].addBox(0F, 0F, 0F, 20, 4, 5, 0F); // Box 25
		fol_m1Model[20].setRotationPoint(-9F, -22F, 20F);

		fol_m1Model[21].addBox(0F, 0F, 0F, 2, 25, 23, 0F); // Box 26
		fol_m1Model[21].setRotationPoint(27F, -24.5F, 2.5F);

		fol_m1Model[22].addShapeBox(0F, 0F, 0F, 2, 22, 22, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 27
		fol_m1Model[22].setRotationPoint(29F, -22F, 3F);

		fol_m1Model[23].addBox(0F, 0F, 0F, 18, 2, 22, 0F); // Box 28
		fol_m1Model[23].setRotationPoint(29F, -24F, 3F);

		fol_m1Model[24].addShapeBox(0F, 0F, 0F, 2, 22, 22, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 29
		fol_m1Model[24].setRotationPoint(31F, -22F, 3F);

		fol_m1Model[25].addShapeBox(0F, 0F, 0F, 2, 22, 22, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 30
		fol_m1Model[25].setRotationPoint(33F, -22F, 3F);

		fol_m1Model[26].addBox(0F, 0F, 0F, 12, 22, 22, 0F); // Box 33
		fol_m1Model[26].setRotationPoint(35F, -22F, 3F);

		fol_m1Model[27].addBox(0F, 0F, 0F, 2, 25, 23, 0F); // Box 34
		fol_m1Model[27].setRotationPoint(47F, -24.5F, 2.5F);

		fol_m1Model[28].addBox(0F, 0F, 0F, 10, 22, 22, 0F); // Box 35
		fol_m1Model[28].setRotationPoint(49F, -22F, 3F);

		fol_m1Model[29].addShapeBox(0F, 0F, 0F, 1, 25, 11, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 36
		fol_m1Model[29].setRotationPoint(59F, -24F, 3F);

		fol_m1Model[30].addShapeBox(0F, 0F, 0F, 1, 25, 11, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 37
		fol_m1Model[30].setRotationPoint(59F, -24F, 14F);

		fol_m1Model[31].addBox(0F, 0F, 0F, 10, 2, 22, 0F); // Box 38
		fol_m1Model[31].setRotationPoint(49F, -24F, 3F);

		fol_m1Model[32].addBox(0F, 0F, 0F, 8, 4, 1, 0F); // Box 39
		fol_m1Model[32].setRotationPoint(37F, -20F, 2.5F);

		fol_m1Model[33].addBox(0F, 0F, 0F, 8, 4, 1, 0F); // Box 40
		fol_m1Model[33].setRotationPoint(37F, -20F, 24.5F);

		fol_m1Model[34].addShapeBox(0F, 0F, 0F, 10, 1, 10, 0F, -9F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F); // Box 41
		fol_m1Model[34].setRotationPoint(14F, -25F, 4F);

		fol_m1Model[35].addShapeBox(0F, 0F, 0F, 10, 1, 10, 0F, 0F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F); // Box 42
		fol_m1Model[35].setRotationPoint(14F, -25F, 14F);

		fol_m1Model[36].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F, -2F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -2F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, -1F, 0F); // Box 43
		fol_m1Model[36].setRotationPoint(-1F, -16F, 5F);

		fol_m1Model[37].addShapeBox(0F, 0F, 0F, 12, 3, 1, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 44
		fol_m1Model[37].setRotationPoint(2F, -16F, 5F);

		fol_m1Model[38].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, -1F); // Box 45
		fol_m1Model[38].setRotationPoint(16F, -14F, 5F);

		fol_m1Model[39].addShapeBox(0F, 0F, 0F, 1, 6, 3, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 46
		fol_m1Model[39].setRotationPoint(14F, -22F, 5F);

		fol_m1Model[40].addBox(0F, 0F, 0F, 14, 3, 1, 0F); // Box 47
		fol_m1Model[40].setRotationPoint(2F, -16F, 6F);

		fol_m1Model[41].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 48
		fol_m1Model[41].setRotationPoint(0F, -16F, 6F);

		fol_m1Model[42].addShapeBox(0F, 0F, 0F, 11, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 44
		fol_m1Model[42].setRotationPoint(3F, -16F, 7F);

		fol_m1Model[43].addShapeBox(0F, 0F, 0F, 1, 8, 3, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 44
		fol_m1Model[43].setRotationPoint(16F, -22F, 5F);

		fol_m1Model[44].addBox(0F, 0F, 0F, 1, 6, 3, 0F); // Box 45
		fol_m1Model[44].setRotationPoint(15F, -22F, 5F);

		fol_m1Model[45].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 46
		fol_m1Model[45].setRotationPoint(14F, -16F, 5F);

		fol_m1Model[46].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 47
		fol_m1Model[46].setRotationPoint(15F, -16F, 5F);

		fol_m1Model[47].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 48
		fol_m1Model[47].setRotationPoint(15F, -16F, 7F);

		fol_m1Model[48].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 49
		fol_m1Model[48].setRotationPoint(14F, -16F, 7F);

		fol_m1Model[49].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 50
		fol_m1Model[49].setRotationPoint(2F, -16F, 7F);

		fol_m1Model[50].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 51
		fol_m1Model[50].setRotationPoint(1F, -16F, 5F);

		fol_m1Model[51].addBox(0F, 0F, 0F, 1, 3, 2, 0F); // Box 52
		fol_m1Model[51].setRotationPoint(1F, -16F, 6F);

		fol_m1Model[52].addShapeBox(0F, 0F, 0F, 16, 3, 1, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 53
		fol_m1Model[52].setRotationPoint(2F, -12F, 5F);

		fol_m1Model[53].addBox(0F, 0F, 0F, 18, 3, 1, 0F); // Box 54
		fol_m1Model[53].setRotationPoint(2F, -12F, 6F);

		fol_m1Model[54].addShapeBox(0F, 0F, 0F, 15, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 55
		fol_m1Model[54].setRotationPoint(3F, -12F, 7F);

		fol_m1Model[55].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 56
		fol_m1Model[55].setRotationPoint(1F, -12F, 5F);

		fol_m1Model[56].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 57
		fol_m1Model[56].setRotationPoint(0F, -12F, 6F);

		fol_m1Model[57].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F, -2F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -2F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, -1F, 0F); // Box 58
		fol_m1Model[57].setRotationPoint(-1F, -12F, 5F);

		fol_m1Model[58].addBox(0F, 0F, 0F, 1, 3, 2, 0F); // Box 59
		fol_m1Model[58].setRotationPoint(1F, -12F, 6F);

		fol_m1Model[59].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 60
		fol_m1Model[59].setRotationPoint(2F, -12F, 7F);

		fol_m1Model[60].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 61
		fol_m1Model[60].setRotationPoint(18F, -12F, 5F);

		fol_m1Model[61].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 62
		fol_m1Model[61].setRotationPoint(18F, -12F, 7F);

		fol_m1Model[62].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 63
		fol_m1Model[62].setRotationPoint(19F, -12F, 7F);

		fol_m1Model[63].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, -1F); // Box 64
		fol_m1Model[63].setRotationPoint(20F, -10F, 5F);

		fol_m1Model[64].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 65
		fol_m1Model[64].setRotationPoint(19F, -12F, 5F);

		fol_m1Model[65].addShapeBox(0F, 0F, 0F, 1, 10, 3, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 66
		fol_m1Model[65].setRotationPoint(18F, -22F, 5F);

		fol_m1Model[66].addBox(0F, 0F, 0F, 1, 10, 3, 0F); // Box 67
		fol_m1Model[66].setRotationPoint(19F, -22F, 5F);

		fol_m1Model[67].addShapeBox(0F, 0F, 0F, 1, 12, 3, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 68
		fol_m1Model[67].setRotationPoint(20F, -22F, 5F);

		fol_m1Model[68].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F); // Box 69
		fol_m1Model[68].setRotationPoint(0F, -16F, 22F);

		fol_m1Model[69].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 70
		fol_m1Model[69].setRotationPoint(2F, -16F, 20F);

		fol_m1Model[70].addBox(0F, 0F, 0F, 1, 3, 2, 0F); // Box 71
		fol_m1Model[70].setRotationPoint(1F, -16F, 20F);

		fol_m1Model[71].addBox(0F, 0F, 0F, 14, 3, 1, 0F); // Box 72
		fol_m1Model[71].setRotationPoint(2F, -16F, 21F);

		fol_m1Model[72].addShapeBox(0F, 0F, 0F, 12, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 73
		fol_m1Model[72].setRotationPoint(2F, -16F, 22F);

		fol_m1Model[73].addShapeBox(0F, 0F, 0F, 11, 3, 1, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		fol_m1Model[73].setRotationPoint(3F, -16F, 20F);

		fol_m1Model[74].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 75
		fol_m1Model[74].setRotationPoint(0F, -16F, 20F);

		fol_m1Model[75].addBox(0F, 0F, 0F, 18, 3, 1, 0F); // Box 80
		fol_m1Model[75].setRotationPoint(2F, -12F, 21F);

		fol_m1Model[76].addShapeBox(0F, 0F, 0F, 15, 3, 1, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 82
		fol_m1Model[76].setRotationPoint(3F, -12F, 20F);

		fol_m1Model[77].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 83
		fol_m1Model[77].setRotationPoint(14F, -16F, 20F);

		fol_m1Model[78].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 84
		fol_m1Model[78].setRotationPoint(15F, -16F, 20F);

		fol_m1Model[79].addShapeBox(0F, 0F, 0F, 1, 8, 3, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 85
		fol_m1Model[79].setRotationPoint(16F, -22F, 20F);

		fol_m1Model[80].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, -1F); // Box 86
		fol_m1Model[80].setRotationPoint(16F, -14F, 20F);

		fol_m1Model[81].addShapeBox(0F, 0F, 0F, 1, 6, 3, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 87
		fol_m1Model[81].setRotationPoint(14F, -22F, 20F);

		fol_m1Model[82].addBox(0F, 0F, 0F, 1, 6, 3, 0F); // Box 88
		fol_m1Model[82].setRotationPoint(15F, -22F, 20F);

		fol_m1Model[83].addShapeBox(0F, 0F, 0F, 1, 10, 3, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 89
		fol_m1Model[83].setRotationPoint(18F, -22F, 20F);

		fol_m1Model[84].addBox(0F, 0F, 0F, 1, 10, 3, 0F); // Box 90
		fol_m1Model[84].setRotationPoint(19F, -22F, 20F);

		fol_m1Model[85].addShapeBox(0F, 0F, 0F, 1, 12, 3, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 91
		fol_m1Model[85].setRotationPoint(20F, -22F, 20F);

		fol_m1Model[86].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 92
		fol_m1Model[86].setRotationPoint(19F, -12F, 20F);

		fol_m1Model[87].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 93
		fol_m1Model[87].setRotationPoint(18F, -12F, 20F);

		fol_m1Model[88].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, -1F); // Box 94
		fol_m1Model[88].setRotationPoint(20F, -10F, 20F);

		fol_m1Model[89].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 95
		fol_m1Model[89].setRotationPoint(18F, -12F, 22F);

		fol_m1Model[90].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 96
		fol_m1Model[90].setRotationPoint(19F, -12F, 22F);

		fol_m1Model[91].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 97
		fol_m1Model[91].setRotationPoint(1F, -16F, 22F);

		fol_m1Model[92].addShapeBox(0F, 0F, 0F, 16, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 98
		fol_m1Model[92].setRotationPoint(2F, -12F, 22F);

		fol_m1Model[93].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 99
		fol_m1Model[93].setRotationPoint(14F, -16F, 22F);

		fol_m1Model[94].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 100
		fol_m1Model[94].setRotationPoint(15F, -16F, 22F);

		fol_m1Model[95].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F); // Box 101
		fol_m1Model[95].setRotationPoint(0F, -12F, 22F);

		fol_m1Model[96].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 102
		fol_m1Model[96].setRotationPoint(0F, -12F, 20F);

		fol_m1Model[97].addBox(0F, 0F, 0F, 1, 3, 2, 0F); // Box 103
		fol_m1Model[97].setRotationPoint(1F, -12F, 20F);

		fol_m1Model[98].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 104
		fol_m1Model[98].setRotationPoint(2F, -12F, 20F);

		fol_m1Model[99].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 105
		fol_m1Model[99].setRotationPoint(1F, -12F, 22F);

		fol_m1Model[100].addBox(0F, 0F, 0F, 8, 4, 1, 0F); // Box 106
		fol_m1Model[100].setRotationPoint(50F, -20F, 24.5F);

		fol_m1Model[101].addBox(0F, 0F, 0F, 8, 4, 1, 0F); // Box 107
		fol_m1Model[101].setRotationPoint(50F, -20F, 2.5F);

		fol_m1Model[102].addBox(0F, 0F, 0F, 18, 2, 3, 0F); // Box 263
		fol_m1Model[102].setRotationPoint(-35F, 1F, 12.5F);

		fol_m1Model[103].addBox(0F, 0F, 0F, 14, 2, 2, 0F); // Box 265
		fol_m1Model[103].setRotationPoint(-2F, -4F, 6F);

		fol_m1Model[104].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 266
		fol_m1Model[104].setRotationPoint(12F, -3.5F, 6.5F);

		fol_m1Model[105].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 267
		fol_m1Model[105].setRotationPoint(12F, -3.5F, 20.5F);

		fol_m1Model[106].addBox(0F, 0F, 0F, 14, 2, 2, 0F); // Box 268
		fol_m1Model[106].setRotationPoint(-2F, -4F, 20F);

		fol_m1Model[107].addBox(0F, 0F, 0F, 6, 1, 6, 0F); // Box 269
		fol_m1Model[107].setRotationPoint(19F, -24.5F, 11F);

		fol_m1Model[108].addBox(0F, 0F, 0F, 1, 6, 6, 0F); // Box 270
		fol_m1Model[108].setRotationPoint(-29F, -16F, 11F);

		fol_m1Model[109].addShapeBox(0F, 0F, 0F, 30, 3, 22, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 271
		fol_m1Model[109].setRotationPoint(-1F, 1F, 3F);

		fol_m1Model[110].addShapeBox(0F, 0F, 0F, 30, 2, 22, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 272
		fol_m1Model[110].setRotationPoint(-1F, 4F, 3F);

		fol_m1Model[111].addBox(0F, 0F, 0F, 6, 1, 6, 0F); // Box 275
		fol_m1Model[111].setRotationPoint(-17F, 1F, 10F);

		fol_m1Model[112].addBox(0F, 0F, 0F, 6, 1, 6, 0F); // Box 305
		fol_m1Model[112].setRotationPoint(43F, 1F, 11F);

		fol_m1Model[113].addBox(0F, 0F, 0F, 16, 2, 3, 0F); // Box 309
		fol_m1Model[113].setRotationPoint(49F, 1F, 12.5F);

		fol_m1Model[114].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 310
		fol_m1Model[114].setRotationPoint(-32F, -12F, 13F);

		fol_m1Model[115].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 311
		fol_m1Model[115].setRotationPoint(60.5F, -22F, 13F);

		fol_m1Model[116].addBox(0F, 0F, 0F, 16, 1, 2, 0F); // Box 313
		fol_m1Model[116].setRotationPoint(-23F, -25F, 6F);

		fol_m1Model[117].addBox(0F, 0F, 0F, 16, 1, 2, 0F); // Box 314
		fol_m1Model[117].setRotationPoint(-23F, -25F, 20F);

		fol_m1Model[118].addBox(0F, 0F, 0F, 16, 1, 10, 0F); // Box 316
		fol_m1Model[118].setRotationPoint(41F, -25F, 9F);

		fol_m1Model[119].addBox(0F, 0F, 0F, 9, 4, 1, 0F); // Box 119
		fol_m1Model[119].setRotationPoint(-24F, -22F, 3F);

		fol_m1Model[120].addBox(0F, 0F, 0F, 9, 4, 1, 0F); // Box 120
		fol_m1Model[120].setRotationPoint(-24F, -22F, 24F);

		fol_m1Model[121].addShapeBox(0F, 0F, 0F, 1, 4, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, -1F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, -1F, -6F, 0F, 0F); // Box 121 Fr
		fol_m1Model[121].setRotationPoint(-30F, -22F, 17F);

		fol_m1Model[122].addShapeBox(0F, 0F, 0F, 1, 4, 8, 0F, -1F, 0F, 0F, 0F, 0F, -1F, -5F, 0F, 0F, 5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, -5F, 0F, 0F, 5F, 0F, 0F); // Box 122 FL
		fol_m1Model[122].setRotationPoint(-25F, -22F, 3F);

		fol_m1Model[123].addBox(0F, 0F, 0F, 1, 4, 6, 0F); // Box 123 F
		fol_m1Model[123].setRotationPoint(-30F, -22F, 11F);


	}
	ModelFOL_M1Bogie bogie = new ModelFOL_M1Bogie();

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		for(int i = 0; i < 124; i++)
		{
			fol_m1Model[i].render(f5);
		}

		Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/FOL_M1_Bogie.png"));

		GL11.glPushMatrix();
		GL11.glTranslated(0.05,0,0);
		bogie.render(entity,f,f1,f2,f3,f4,f5);

		GL11.glTranslated(3.65,0,0);
		bogie.render(entity,f,f1,f2,f3,f4,f5);
		GL11.glPopMatrix();


	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
	{
	}

	public ModelRendererTurbo fol_m1Model[];
}