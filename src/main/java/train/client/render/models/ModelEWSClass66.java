//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2017 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator:
// Created on:27.07.2017 - 08:06:28
// Last changed on: 27.07.2017 - 08:06:28

package train.client.render.models;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import tmt.ModelBase;
import tmt.ModelRendererTurbo;
import tmt.Tessellator;
import train.common.library.Info;

public class ModelEWSClass66 extends ModelBase
{
	int textureX = 512;
	int textureY = 512;

	public ModelEWSClass66()
	{
		ewsclass66Model = new ModelRendererTurbo[141];
		ewsclass66Model[0] = new ModelRendererTurbo(this, 36, 57, textureX, textureY); // 02
		ewsclass66Model[1] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // 03
		ewsclass66Model[2] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // 04
		ewsclass66Model[3] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // 05
		ewsclass66Model[4] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // 06
		ewsclass66Model[5] = new ModelRendererTurbo(this, 245, 250, textureX, textureY); // 07
		ewsclass66Model[6] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // 08
		ewsclass66Model[7] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // 09
		ewsclass66Model[8] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // 10
		ewsclass66Model[9] = new ModelRendererTurbo(this, 233, 17, textureX, textureY); // 11
		ewsclass66Model[10] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // 12
		ewsclass66Model[11] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // 13
		ewsclass66Model[12] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // 14
		ewsclass66Model[13] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // 15
		ewsclass66Model[14] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // 16
		ewsclass66Model[15] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // 17
		ewsclass66Model[16] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // 18
		ewsclass66Model[17] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // 19
		ewsclass66Model[18] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // 20
		ewsclass66Model[19] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // 21
		ewsclass66Model[20] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // 22
		ewsclass66Model[21] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // 23
		ewsclass66Model[22] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // 24
		ewsclass66Model[23] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // 25
		ewsclass66Model[24] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // 26
		ewsclass66Model[25] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // 27
		ewsclass66Model[26] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // 28
		ewsclass66Model[27] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // 32
		ewsclass66Model[28] = new ModelRendererTurbo(this, 462, 1, textureX, textureY); // 33
		ewsclass66Model[29] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // 34
		ewsclass66Model[30] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // 35
		ewsclass66Model[31] = new ModelRendererTurbo(this, 153, 17, textureX, textureY); // 36
		ewsclass66Model[32] = new ModelRendererTurbo(this, 97, 9, textureX, textureY); // 37
		ewsclass66Model[33] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // 38
		ewsclass66Model[34] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // 39
		ewsclass66Model[35] = new ModelRendererTurbo(this, 97, 25, textureX, textureY); // 40
		ewsclass66Model[36] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // 41
		ewsclass66Model[37] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // 42
		ewsclass66Model[38] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // 43
		ewsclass66Model[39] = new ModelRendererTurbo(this, 144, 25, textureX, textureY); // 44
		ewsclass66Model[40] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // 45
		ewsclass66Model[41] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // 46
		ewsclass66Model[42] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // 47
		ewsclass66Model[43] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // 48
		ewsclass66Model[44] = new ModelRendererTurbo(this, 281, 25, textureX, textureY); // 49
		ewsclass66Model[45] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // 50
		ewsclass66Model[46] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // 51
		ewsclass66Model[47] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // 53
		ewsclass66Model[48] = new ModelRendererTurbo(this, 377, 9, textureX, textureY); // 54
		ewsclass66Model[49] = new ModelRendererTurbo(this, 73, 17, textureX, textureY); // 55
		ewsclass66Model[50] = new ModelRendererTurbo(this, 65, 9, textureX, textureY); // 56
		ewsclass66Model[51] = new ModelRendererTurbo(this, 377, 25, textureX, textureY); // 57
		ewsclass66Model[52] = new ModelRendererTurbo(this, 425, 25, textureX, textureY); // 58
		ewsclass66Model[53] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // 59
		ewsclass66Model[54] = new ModelRendererTurbo(this, 281, 17, textureX, textureY); // 60
		ewsclass66Model[55] = new ModelRendererTurbo(this, 401, 9, textureX, textureY); // 61
		ewsclass66Model[56] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // 62
		ewsclass66Model[57] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // 63
		ewsclass66Model[58] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // 64
		ewsclass66Model[59] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // 65
		ewsclass66Model[60] = new ModelRendererTurbo(this, 297, 17, textureX, textureY); // 66
		ewsclass66Model[61] = new ModelRendererTurbo(this, 433, 9, textureX, textureY); // 67
		ewsclass66Model[62] = new ModelRendererTurbo(this, 81, 9, textureX, textureY); // 68
		ewsclass66Model[63] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // 69
		ewsclass66Model[64] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // 70
		ewsclass66Model[65] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // 71
		ewsclass66Model[66] = new ModelRendererTurbo(this, 361, 9, textureX, textureY); // 72
		ewsclass66Model[67] = new ModelRendererTurbo(this, 145, 9, textureX, textureY); // 73
		ewsclass66Model[68] = new ModelRendererTurbo(this, 145, 9, textureX, textureY); // 74
		ewsclass66Model[69] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // 75
		ewsclass66Model[70] = new ModelRendererTurbo(this, 193, 9, textureX, textureY); // 76
		ewsclass66Model[71] = new ModelRendererTurbo(this, 209, 9, textureX, textureY); // 77
		ewsclass66Model[72] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // 78
		ewsclass66Model[73] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // 79
		ewsclass66Model[74] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // 80
		ewsclass66Model[75] = new ModelRendererTurbo(this, 154, 137, textureX, textureY); // 81
		ewsclass66Model[76] = new ModelRendererTurbo(this, 217, 9, textureX, textureY); // 82
		ewsclass66Model[77] = new ModelRendererTurbo(this, 225, 9, textureX, textureY); // 83
		ewsclass66Model[78] = new ModelRendererTurbo(this, 473, 17, textureX, textureY); // 84
		ewsclass66Model[79] = new ModelRendererTurbo(this, 161, 9, textureX, textureY); // 85
		ewsclass66Model[80] = new ModelRendererTurbo(this, 169, 9, textureX, textureY); // 86
		ewsclass66Model[81] = new ModelRendererTurbo(this, 233, 17, textureX, textureY); // 87
		ewsclass66Model[82] = new ModelRendererTurbo(this, 249, 17, textureX, textureY); // 88
		ewsclass66Model[83] = new ModelRendererTurbo(this, 505, 9, textureX, textureY); // 89
		ewsclass66Model[84] = new ModelRendererTurbo(this, 345, 25, textureX, textureY); // 90
		ewsclass66Model[85] = new ModelRendererTurbo(this, 257, 25, textureX, textureY); // 91
		ewsclass66Model[86] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // 92
		ewsclass66Model[87] = new ModelRendererTurbo(this, 337, 25, textureX, textureY); // 93
		ewsclass66Model[88] = new ModelRendererTurbo(this, 329, 25, textureX, textureY); // 94
		ewsclass66Model[89] = new ModelRendererTurbo(this, 361, 17, textureX, textureY); // 95
		ewsclass66Model[90] = new ModelRendererTurbo(this, 109, 47, textureX, textureY); // 96
		ewsclass66Model[91] = new ModelRendererTurbo(this, 281, 33, textureX, textureY); // 97
		ewsclass66Model[92] = new ModelRendererTurbo(this, 49, 33, textureX, textureY); // 98
		ewsclass66Model[93] = new ModelRendererTurbo(this, 57, 33, textureX, textureY); // 99
		ewsclass66Model[94] = new ModelRendererTurbo(this, 65, 33, textureX, textureY); // 100
		ewsclass66Model[95] = new ModelRendererTurbo(this, 41, 33, textureX, textureY); // 101
		ewsclass66Model[96] = new ModelRendererTurbo(this, 353, 25, textureX, textureY); // 102
		ewsclass66Model[97] = new ModelRendererTurbo(this, 361, 25, textureX, textureY); // 103
		ewsclass66Model[98] = new ModelRendererTurbo(this, 417, 33, textureX, textureY); // 104
		ewsclass66Model[99] = new ModelRendererTurbo(this, 249, 33, textureX, textureY); // 105
		ewsclass66Model[100] = new ModelRendererTurbo(this, 321, 33, textureX, textureY); // 106
		ewsclass66Model[101] = new ModelRendererTurbo(this, 249, 9, textureX, textureY); // 107
		ewsclass66Model[102] = new ModelRendererTurbo(this, 201, 9, textureX, textureY); // 108
		ewsclass66Model[103] = new ModelRendererTurbo(this, 233, 9, textureX, textureY); // 109
		ewsclass66Model[104] = new ModelRendererTurbo(this, 289, 9, textureX, textureY); // 110
		ewsclass66Model[105] = new ModelRendererTurbo(this, 281, 9, textureX, textureY); // 111
		ewsclass66Model[106] = new ModelRendererTurbo(this, 378, 67, textureX, textureY); // 113
		ewsclass66Model[107] = new ModelRendererTurbo(this, 96, 46, textureX, textureY); // 115
		ewsclass66Model[108] = new ModelRendererTurbo(this, 396, 61, textureX, textureY); // 117
		ewsclass66Model[109] = new ModelRendererTurbo(this, 387, 67, textureX, textureY); // Box 124
		ewsclass66Model[110] = new ModelRendererTurbo(this, 397, 67, textureX, textureY); // Box 125
		ewsclass66Model[111] = new ModelRendererTurbo(this, 401, 61, textureX, textureY); // Box 126
		ewsclass66Model[112] = new ModelRendererTurbo(this, 409, 61, textureX, textureY); // Box 127
		ewsclass66Model[113] = new ModelRendererTurbo(this, 383, 39, textureX, textureY); // Box 129
		ewsclass66Model[114] = new ModelRendererTurbo(this, 378, 61, textureX, textureY); // Box 132
		ewsclass66Model[115] = new ModelRendererTurbo(this, 384, 61, textureX, textureY); // Box 133
		ewsclass66Model[116] = new ModelRendererTurbo(this, 390, 61, textureX, textureY); // Box 134
		ewsclass66Model[117] = new ModelRendererTurbo(this, 142, 38, textureX, textureY); // Box 135
		ewsclass66Model[118] = new ModelRendererTurbo(this, 166, 45, textureX, textureY); // Box 136
		ewsclass66Model[119] = new ModelRendererTurbo(this, 427, 61, textureX, textureY); // Box 137
		ewsclass66Model[120] = new ModelRendererTurbo(this, 427, 69, textureX, textureY); // Box 138
		ewsclass66Model[121] = new ModelRendererTurbo(this, 387, 90, textureX, textureY); // Box 154
		ewsclass66Model[122] = new ModelRendererTurbo(this, 382, 83, textureX, textureY); // Box 155
		ewsclass66Model[123] = new ModelRendererTurbo(this, 386, 41, textureX, textureY); // Box 144
		ewsclass66Model[124] = new ModelRendererTurbo(this, 390, 61, textureX, textureY); // Box 145
		ewsclass66Model[125] = new ModelRendererTurbo(this, 384, 61, textureX, textureY); // Box 146
		ewsclass66Model[126] = new ModelRendererTurbo(this, 378, 61, textureX, textureY); // Box 147
		ewsclass66Model[127] = new ModelRendererTurbo(this, 96, 46, textureX, textureY); // Box 148
		ewsclass66Model[128] = new ModelRendererTurbo(this, 378, 67, textureX, textureY); // Box 149
		ewsclass66Model[129] = new ModelRendererTurbo(this, 396, 61, textureX, textureY); // Box 150
		ewsclass66Model[130] = new ModelRendererTurbo(this, 387, 67, textureX, textureY); // Box 151
		ewsclass66Model[131] = new ModelRendererTurbo(this, 401, 61, textureX, textureY); // Box 152
		ewsclass66Model[132] = new ModelRendererTurbo(this, 397, 67, textureX, textureY); // Box 153
		ewsclass66Model[133] = new ModelRendererTurbo(this, 409, 61, textureX, textureY); // Box 154
		ewsclass66Model[134] = new ModelRendererTurbo(this, 166, 45, textureX, textureY); // Box 155
		ewsclass66Model[135] = new ModelRendererTurbo(this, 142, 38, textureX, textureY); // Box 156
		ewsclass66Model[136] = new ModelRendererTurbo(this, 427, 69, textureX, textureY); // Box 157
		ewsclass66Model[137] = new ModelRendererTurbo(this, 427, 61, textureX, textureY); // Box 158
		ewsclass66Model[138] = new ModelRendererTurbo(this, 387, 90, textureX, textureY); // Box 159
		ewsclass66Model[139] = new ModelRendererTurbo(this, 382, 83, textureX, textureY); // Box 160
		ewsclass66Model[140] = new ModelRendererTurbo(this, 41, 196, textureX, textureY); // Box 143

		ewsclass66Model[0].addShapeBox(0F, 0F, 0F, 1, 20, 108, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -20F, 0F, 0F, -20F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -20F, 0F, 0F, -20F); // 02
		ewsclass66Model[0].setRotationPoint(-10F, -12F, -40F);

		ewsclass66Model[1].addBox(0F, 0F, 0F, 2, 20, 110, 0F); // 03
		ewsclass66Model[1].setRotationPoint(10F, 8F, -51F);
		ewsclass66Model[1].rotateAngleZ = -1.57079633F;

		ewsclass66Model[2].addShapeBox(0F, 0F, 0F, 20, 1, 1, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // 04
		ewsclass66Model[2].setRotationPoint(-10F, -2F, 60F);

		ewsclass66Model[3].addShapeBox(0F, 0F, 0F, 20, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // 05
		ewsclass66Model[3].setRotationPoint(-10F, -12F, 59F);

		ewsclass66Model[4].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // 06
		ewsclass66Model[4].setRotationPoint(-1F, -8F, 60F);

		ewsclass66Model[5].addShapeBox(0F, 0F, 0F, 20, 1, 112, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // 07
		ewsclass66Model[5].setRotationPoint(-10F, -14F, -52F);

		ewsclass66Model[6].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // 08
		ewsclass66Model[6].setRotationPoint(-2.5F, -15F, 60F);

		ewsclass66Model[7].addBox(0F, -1F, 0F, 3, 3, 1, 0F); // 09
		ewsclass66Model[7].setRotationPoint(5F, 5F, 59.7F);
		ewsclass66Model[7].rotateAngleX = -0.20943951F;

		ewsclass66Model[8].addBox(0F, -1F, 0F, 3, 3, 1, 0F); // 10
		ewsclass66Model[8].setRotationPoint(-8F, 5F, 59.7F);
		ewsclass66Model[8].rotateAngleX = -0.20943951F;

		ewsclass66Model[9].addShapeBox(0F, 0F, 0F, 1, 10, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // 11
		ewsclass66Model[9].setRotationPoint(-9F, -2F, 58F);
		ewsclass66Model[9].rotateAngleY = -3.14159265F;

		ewsclass66Model[10].addShapeBox(0F, 0F, 0F, 1, 10, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // 12
		ewsclass66Model[10].setRotationPoint(9F, -2F, 48F);

		ewsclass66Model[11].addShapeBox(0F, 0F, 0F, 1, 4, 11, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // 13
		ewsclass66Model[11].setRotationPoint(9F, -12F, 48F);

		ewsclass66Model[12].addShapeBox(0F, 0F, 0F, 1, 4, 11, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // 14
		ewsclass66Model[12].setRotationPoint(-10F, -12F, 48F);

		ewsclass66Model[13].addShapeBox(0F, 0F, -51F, 1, 4, 11, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // 15
		ewsclass66Model[13].setRotationPoint(9F, -12F, 0F);

		ewsclass66Model[14].addShapeBox(0F, 0F, -51F, 1, 4, 11, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // 16
		ewsclass66Model[14].setRotationPoint(-10F, -12F, 0F);

		ewsclass66Model[15].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // 17
		ewsclass66Model[15].setRotationPoint(-10F, -8F, 52F);

		ewsclass66Model[16].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // 18
		ewsclass66Model[16].setRotationPoint(-10F, -8F, 56F);

		ewsclass66Model[17].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // 19
		ewsclass66Model[17].setRotationPoint(9F, -8F, 52F);

		ewsclass66Model[18].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // 20
		ewsclass66Model[18].setRotationPoint(9F, -8F, 56F);

		ewsclass66Model[19].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // 21
		ewsclass66Model[19].setRotationPoint(-10F, -8F, -44F);

		ewsclass66Model[20].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // 22
		ewsclass66Model[20].setRotationPoint(-10F, -8F, -48F);

		ewsclass66Model[21].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // 23
		ewsclass66Model[21].setRotationPoint(9F, -8F, -44F);

		ewsclass66Model[22].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // 24
		ewsclass66Model[22].setRotationPoint(9F, -8F, -48F);

		ewsclass66Model[23].addShapeBox(0F, 0F, 0F, 2, 13, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // 25
		ewsclass66Model[23].setRotationPoint(-10.5F, -9F, 42F);

		ewsclass66Model[24].addShapeBox(0F, 0F, 0F, 2, 13, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // 26
		ewsclass66Model[24].setRotationPoint(8.5F, -9F, 42F);

		ewsclass66Model[25].addShapeBox(0F, 0F, 0F, 2, 13, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // 27
		ewsclass66Model[25].setRotationPoint(-10.5F, -9F, -39F);

		ewsclass66Model[26].addShapeBox(0F, 0F, 0F, 2, 13, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // 28
		ewsclass66Model[26].setRotationPoint(8.5F, -9F, -39F);

		ewsclass66Model[27].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // 32
		ewsclass66Model[27].setRotationPoint(-0.6F, 2F, 60.4F);
		ewsclass66Model[27].rotateAngleX = -0.20943951F;

		ewsclass66Model[28].addShapeBox(0F, 0F, 0F, 20, 9, 1, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -3F, 0F, 0F, -3F); // 33
		ewsclass66Model[28].setRotationPoint(-10F, -1F, 61F);

		ewsclass66Model[29].addBox(0F, 0F, 0F, 3, 2, 1, 0F); // 34
		ewsclass66Model[29].setRotationPoint(-8F, 2F, 60.4F);
		ewsclass66Model[29].rotateAngleX = -0.20943951F;

		ewsclass66Model[30].addBox(0F, 1F, 0F, 3, 2, 1, 0F); // 35
		ewsclass66Model[30].setRotationPoint(5F, 1F, 60.6F);
		ewsclass66Model[30].rotateAngleX = -0.20943951F;

		ewsclass66Model[31].addShapeBox(0F, 0F, 0F, 18, 8, 40, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -2F, 0F, -3F, -2F, 0F, -3F, -2F, 0F, -3F, -2F, 0F); // 36
		ewsclass66Model[31].setRotationPoint(-10F, 10F, -16F);

		ewsclass66Model[32].addShapeBox(0F, 0F, 0F, 20, 8, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -1F, -2F, 0F, -1F, -2F, 0F); // 37
		ewsclass66Model[32].setRotationPoint(-10F, 10F, -51F);

		ewsclass66Model[33].addShapeBox(0F, 0F, 0F, 20, 8, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F); // 38
		ewsclass66Model[33].setRotationPoint(-10F, 10F, 58F);

		ewsclass66Model[34].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // 39
		ewsclass66Model[34].setRotationPoint(-0.5F, -10F, 60F);

		ewsclass66Model[35].addShapeBox(0F, 0F, 0F, 20, 10, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // 40
		ewsclass66Model[35].setRotationPoint(-10F, -2F, 58F);

		ewsclass66Model[36].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // 41
		ewsclass66Model[36].setRotationPoint(-10F, -8F, 60F);

		ewsclass66Model[37].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // 42
		ewsclass66Model[37].setRotationPoint(8F, -8F, 60F);

		ewsclass66Model[38].addShapeBox(0F, 0F, 0F, 1, 10, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // 43
		ewsclass66Model[38].setRotationPoint(-9F, -2F, -40F);
		ewsclass66Model[38].rotateAngleY = -3.14159265F;

		ewsclass66Model[39].addShapeBox(0F, 0F, 0F, 20, 9, 1, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 2F, 0F, 0F, 2F); // 44
		ewsclass66Model[39].setRotationPoint(-10F, -1F, -54F);

		ewsclass66Model[40].addShapeBox(0F, 0F, 0F, 1, 10, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // 45
		ewsclass66Model[40].setRotationPoint(9F, -2F, -50F);

		ewsclass66Model[41].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F); // 46
		ewsclass66Model[41].setRotationPoint(8F, -8F, -53F);

		ewsclass66Model[42].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F); // 47
		ewsclass66Model[42].setRotationPoint(-1F, -8F, -53F);

		ewsclass66Model[43].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F); // 48
		ewsclass66Model[43].setRotationPoint(-10F, -8F, -53F);

		ewsclass66Model[44].addShapeBox(0F, 0F, 0F, 20, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // 49
		ewsclass66Model[44].setRotationPoint(-10F, -12F, -52F);

		ewsclass66Model[45].addShapeBox(0F, 0F, 0F, 6, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 4F, 1F, 0F, 4F, 1F, 0F); // 50
		ewsclass66Model[45].setRotationPoint(-3F, -15F, -53F);

		ewsclass66Model[46].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // 51
		ewsclass66Model[46].setRotationPoint(-0.5F, -10F, -53F);

		ewsclass66Model[47].addBox(0F, -1F, 0F, 3, 3, 1, 0F); // 53
		ewsclass66Model[47].setRotationPoint(5F, 6F, -51.5F);
		ewsclass66Model[47].rotateAngleX = 0.20943951F;
		ewsclass66Model[47].rotateAngleY = -3.14159265F;
		ewsclass66Model[47].rotateAngleZ = 3.14159265F;

		ewsclass66Model[48].addBox(0F, 1F, 0F, 3, 2, 1, 0F); // 54
		ewsclass66Model[48].setRotationPoint(5F, 1.3F, -53.5F);
		ewsclass66Model[48].rotateAngleX = 0.20943951F;

		ewsclass66Model[49].addBox(0F, -1F, 0F, 3, 3, 1, 0F); // 55
		ewsclass66Model[49].setRotationPoint(-8F, 6F, -51.5F);
		ewsclass66Model[49].rotateAngleX = 0.20943951F;
		ewsclass66Model[49].rotateAngleY = -3.14159265F;
		ewsclass66Model[49].rotateAngleZ = 3.14159265F;

		ewsclass66Model[50].addBox(0F, 0F, 0F, 3, 2, 1, 0F); // 56
		ewsclass66Model[50].setRotationPoint(-8F, 2.3F, -53.3F);
		ewsclass66Model[50].rotateAngleX = 0.20943951F;

		ewsclass66Model[51].addShapeBox(0F, 0F, 0F, 20, 10, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // 57
		ewsclass66Model[51].setRotationPoint(-10F, -2F, -51F);

		ewsclass66Model[52].addShapeBox(0F, 0F, 0F, 20, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F); // 58
		ewsclass66Model[52].setRotationPoint(-10F, -2F, -53F);

		ewsclass66Model[53].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // 59
		ewsclass66Model[53].setRotationPoint(-0.5F, 2F, -53.4F);
		ewsclass66Model[53].rotateAngleX = 0.20943951F;

		ewsclass66Model[54].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // 60
		ewsclass66Model[54].setRotationPoint(4.5F, 10F, 60F);

		ewsclass66Model[55].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // 61
		ewsclass66Model[55].setRotationPoint(-8.5F, 10F, 60F);

		ewsclass66Model[56].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // 62
		ewsclass66Model[56].setRotationPoint(6F, 10.5F, 60F);
		ewsclass66Model[56].rotateAngleY = -1.57079633F;

		ewsclass66Model[57].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // 63
		ewsclass66Model[57].setRotationPoint(-7F, 10.5F, 60F);
		ewsclass66Model[57].rotateAngleY = -1.57079633F;

		ewsclass66Model[58].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // 64
		ewsclass66Model[58].setRotationPoint(6F, 10.5F, -52F);

		ewsclass66Model[59].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // 65
		ewsclass66Model[59].setRotationPoint(-7F, 10.5F, -52F);

		ewsclass66Model[60].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // 66
		ewsclass66Model[60].setRotationPoint(4.5F, 10F, -53F);

		ewsclass66Model[61].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // 67
		ewsclass66Model[61].setRotationPoint(-8.5F, 10F, -53F);

		ewsclass66Model[62].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // 68
		ewsclass66Model[62].setRotationPoint(-1F, 9F, 59F);

		ewsclass66Model[63].addBox(0F, 0F, 0F, 0, 1, 1, 0F); // 69
		ewsclass66Model[63].setRotationPoint(-2.4F, 10F, 59F);
		ewsclass66Model[63].rotateAngleX = 1.57079633F;

		ewsclass66Model[64].addBox(0F, 0F, 4F, 0, 4, 1, 0F); // 70
		ewsclass66Model[64].setRotationPoint(-2.4F, 9F, 56F);

		ewsclass66Model[65].addBox(0F, 0F, 4F, 0, 3, 1, 0F); // 71
		ewsclass66Model[65].setRotationPoint(-2.4F, 13F, 56F);
		ewsclass66Model[65].rotateAngleZ = 1.57079633F;

		ewsclass66Model[66].addBox(0F, 0F, 4F, 0, 1, 2, 0F); // 72
		ewsclass66Model[66].setRotationPoint(0.6F, 12F, 55F);

		ewsclass66Model[67].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // 73
		ewsclass66Model[67].setRotationPoint(4F, 8F, 59.2F);
		ewsclass66Model[67].rotateAngleX = -0.17453293F;

		ewsclass66Model[68].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // 74
		ewsclass66Model[68].setRotationPoint(-7F, 8F, 59.2F);
		ewsclass66Model[68].rotateAngleX = -0.17453293F;

		ewsclass66Model[69].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F); // 75
		ewsclass66Model[69].setRotationPoint(-1F, 9F, 62F);

		ewsclass66Model[70].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // 76
		ewsclass66Model[70].setRotationPoint(0.2F, -14F, 60.5F);

		ewsclass66Model[71].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // 77
		ewsclass66Model[71].setRotationPoint(-1.2F, -14F, 60.5F);

		ewsclass66Model[72].addShapeBox(0F, 0F, 0F, 18, 19, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // 78
		ewsclass66Model[72].setRotationPoint(-9F, -12F, 41F);

		ewsclass66Model[73].addShapeBox(0F, 0F, 0F, 1, 10, 0, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // 79
		ewsclass66Model[73].setRotationPoint(-11F, -8F, 41.5F);

		ewsclass66Model[74].addShapeBox(0F, 0F, 0F, 1, 10, 0, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // 80
		ewsclass66Model[74].setRotationPoint(-11F, -8F, 47.5F);

		ewsclass66Model[75].addBox(0F, 0F, 0F, 18, 2, 108, 0F); // 81
		ewsclass66Model[75].setRotationPoint(-9F, 6F, -50F);

		ewsclass66Model[76].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // 82
		ewsclass66Model[76].setRotationPoint(0.15F, -14F, -53.5F);

		ewsclass66Model[77].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // 83
		ewsclass66Model[77].setRotationPoint(-1.25F, -14F, -53.5F);

		ewsclass66Model[78].addShapeBox(0F, 0F, 0F, 18, 19, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // 84
		ewsclass66Model[78].setRotationPoint(-9F, -12F, -34F);

		ewsclass66Model[79].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // 85
		ewsclass66Model[79].setRotationPoint(4F, 8.2F, -52F);
		ewsclass66Model[79].rotateAngleX = 0.17453293F;

		ewsclass66Model[80].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // 86
		ewsclass66Model[80].setRotationPoint(-7F, 8.2F, -52F);
		ewsclass66Model[80].rotateAngleX = 0.17453293F;

		ewsclass66Model[81].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F); // 87
		ewsclass66Model[81].setRotationPoint(-1F, 9F, -56F);

		ewsclass66Model[82].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // 88
		ewsclass66Model[82].setRotationPoint(-1F, 9F, -52F);

		ewsclass66Model[83].addBox(0F, 0F, 4F, 0, 1, 2, 0F); // 89
		ewsclass66Model[83].setRotationPoint(-0.4F, 12F, -57F);

		ewsclass66Model[84].addBox(0F, 0F, 4F, 0, 3, 1, 0F); // 90
		ewsclass66Model[84].setRotationPoint(-0.4F, 13F, -57F);
		ewsclass66Model[84].rotateAngleZ = 1.57079633F;

		ewsclass66Model[85].addBox(0F, 0F, 4F, 0, 4, 1, 0F); // 91
		ewsclass66Model[85].setRotationPoint(2.6F, 9F, -57F);

		ewsclass66Model[86].addBox(0F, 0F, 0F, 0, 1, 1, 0F); // 92
		ewsclass66Model[86].setRotationPoint(2.6F, 10F, -52F);
		ewsclass66Model[86].rotateAngleX = 1.57079633F;

		ewsclass66Model[87].addBox(0F, 0F, 4F, 0, 3, 1, 0F); // 93
		ewsclass66Model[87].setRotationPoint(-3F, 13.8F, 55F);
		ewsclass66Model[87].rotateAngleZ = 1.57079633F;

		ewsclass66Model[88].addBox(0F, 0F, 4F, 0, 3, 1, 0F); // 94
		ewsclass66Model[88].setRotationPoint(-3F, 13.8F, 55F);
		ewsclass66Model[88].rotateAngleZ = 3.12413936F;

		ewsclass66Model[89].addBox(0F, 0F, 4F, 0, 3, 1, 0F); // 95
		ewsclass66Model[89].setRotationPoint(3F, 13.8F, -47F);
		ewsclass66Model[89].rotateAngleY = -3.14159265F;
		ewsclass66Model[89].rotateAngleZ = 1.57079633F;

		ewsclass66Model[90].addBox(0F, 0F, 4F, 0, 3, 1, 0F); // 96
		ewsclass66Model[90].setRotationPoint(3F, 13.8F, -47F);
		ewsclass66Model[90].rotateAngleY = -3.14159265F;
		ewsclass66Model[90].rotateAngleZ = 3.12413936F;

		ewsclass66Model[91].addShapeBox(0F, 0F, 0F, 12, 1, 12, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // 97
		ewsclass66Model[91].setRotationPoint(-5.5F, -15F, 29F);

		ewsclass66Model[92].addShapeBox(0F, 0F, 0F, 1, 10, 0, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // 98
		ewsclass66Model[92].setRotationPoint(-11F, -8F, -33.5F);

		ewsclass66Model[93].addShapeBox(0F, 0F, 0F, 1, 10, 0, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // 99
		ewsclass66Model[93].setRotationPoint(-11F, -8F, -39.5F);

		ewsclass66Model[94].addShapeBox(0F, 0F, 0F, 1, 10, 0, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // 100
		ewsclass66Model[94].setRotationPoint(10F, -8F, -33.5F);

		ewsclass66Model[95].addShapeBox(0F, 0F, 0F, 1, 10, 0, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // 101
		ewsclass66Model[95].setRotationPoint(10F, -8F, -39.5F);

		ewsclass66Model[96].addShapeBox(0F, 0F, 0F, 1, 10, 0, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // 102
		ewsclass66Model[96].setRotationPoint(10F, -8F, 47.5F);

		ewsclass66Model[97].addShapeBox(0F, 0F, 0F, 1, 10, 0, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // 103
		ewsclass66Model[97].setRotationPoint(10F, -8F, 41.5F);

		ewsclass66Model[98].addShapeBox(0F, 0F, 0F, 12, 2, 8, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // 104
		ewsclass66Model[98].setRotationPoint(-5.5F, -16F, -33F);

		ewsclass66Model[99].addShapeBox(0F, 0F, 0F, 4, 1, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // 105
		ewsclass66Model[99].setRotationPoint(-1.5F, -15F, -25F);

		ewsclass66Model[100].addShapeBox(0F, 0F, 0F, 8, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // 106
		ewsclass66Model[100].setRotationPoint(-3.5F, -15F, -18F);

		ewsclass66Model[101].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // 107
		ewsclass66Model[101].setRotationPoint(-2.5F, -16.7F, -32F);

		ewsclass66Model[102].addBox(0F, 0F, 0F, 0, 1, 1, 0F); // 108
		ewsclass66Model[102].setRotationPoint(1.5F, 6F, 59.7F);
		ewsclass66Model[102].rotateAngleX = 1.57079633F;
		ewsclass66Model[102].rotateAngleZ = -0.78539816F;

		ewsclass66Model[103].addBox(0F, 0F, 0F, 0, 1, 1, 0F); // 109
		ewsclass66Model[103].setRotationPoint(-1.5F, 6F, 59.7F);
		ewsclass66Model[103].rotateAngleX = 1.57079633F;
		ewsclass66Model[103].rotateAngleZ = 0.78539816F;

		ewsclass66Model[104].addBox(0F, 0F, 0F, 0, 1, 1, 0F); // 110
		ewsclass66Model[104].setRotationPoint(1.6F, 6F, -52.7F);
		ewsclass66Model[104].rotateAngleX = 1.57079633F;
		ewsclass66Model[104].rotateAngleZ = -0.78539816F;

		ewsclass66Model[105].addBox(0F, 0F, 0F, 0, 1, 1, 0F); // 111
		ewsclass66Model[105].setRotationPoint(-1.4F, 6F, -52.7F);
		ewsclass66Model[105].rotateAngleX = 1.57079633F;
		ewsclass66Model[105].rotateAngleZ = 0.78539816F;

		ewsclass66Model[106].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // 113
		ewsclass66Model[106].setRotationPoint(-6.5F, -1.25F, 56F);

		ewsclass66Model[107].addBox(0F, 0F, 0F, 18, 8, 1, 0F); // 115
		ewsclass66Model[107].setRotationPoint(-9F, -2F, 57F);

		ewsclass66Model[108].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // 117
		ewsclass66Model[108].setRotationPoint(-6F, -2.25F, 56F);

		ewsclass66Model[109].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 124
		ewsclass66Model[109].setRotationPoint(-4.3F, -1.25F, 56F);

		ewsclass66Model[110].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 125
		ewsclass66Model[110].setRotationPoint(-2.1F, -1.25F, 56F);

		ewsclass66Model[111].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 126
		ewsclass66Model[111].setRotationPoint(-3.8F, -2.25F, 56F);

		ewsclass66Model[112].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 127
		ewsclass66Model[112].setRotationPoint(-1.6F, -2.25F, 56F);

		ewsclass66Model[113].addShapeBox(0F, 0F, 0F, 2, 8, 9, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 129
		ewsclass66Model[113].setRotationPoint(-9F, -2F, 48F);

		ewsclass66Model[114].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 132
		ewsclass66Model[114].setRotationPoint(-7.5F, -2F, 54F);
		ewsclass66Model[114].rotateAngleZ = -0.78539816F;

		ewsclass66Model[115].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 133
		ewsclass66Model[115].setRotationPoint(-7.5F, -2F, 52F);
		ewsclass66Model[115].rotateAngleZ = -0.78539816F;

		ewsclass66Model[116].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 134
		ewsclass66Model[116].setRotationPoint(-7.5F, -2F, 50F);
		ewsclass66Model[116].rotateAngleZ = -0.78539816F;

		ewsclass66Model[117].addBox(0F, 0F, 0F, 9, 8, 1, 0F); // Box 135
		ewsclass66Model[117].setRotationPoint(8F, -2F, 57F);
		ewsclass66Model[117].rotateAngleY = -1.57079633F;

		ewsclass66Model[118].addBox(0F, 0F, 0F, 6, 8, 2, 0F); // Box 136
		ewsclass66Model[118].setRotationPoint(2F, -2F, 55F);

		ewsclass66Model[119].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 137
		ewsclass66Model[119].setRotationPoint(2.5F, -1.25F, 54F);

		ewsclass66Model[120].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 138
		ewsclass66Model[120].setRotationPoint(2.5F, 1F, 54F);

		ewsclass66Model[121].addBox(0F, 0F, 0F, 8, 1, 7, 0F); // Box 154
		ewsclass66Model[121].setRotationPoint(-6F, 5F, 46F);

		ewsclass66Model[122].addBox(0F, 0F, 0F, 8, 1, 9, 0F); // Box 155
		ewsclass66Model[122].setRotationPoint(-6F, 5F, 46F);
		ewsclass66Model[122].rotateAngleX = 1.74532925F;

		ewsclass66Model[123].addShapeBox(0F, 0F, 0F, 2, 8, 9, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 144
		ewsclass66Model[123].setRotationPoint(7F, -2F, -49F);

		ewsclass66Model[124].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 145
		ewsclass66Model[124].setRotationPoint(7.5F, -2F, -47F);
		ewsclass66Model[124].rotateAngleZ = -0.78539816F;

		ewsclass66Model[125].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 146
		ewsclass66Model[125].setRotationPoint(7.5F, -2F, -45F);
		ewsclass66Model[125].rotateAngleZ = -0.78539816F;

		ewsclass66Model[126].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 147
		ewsclass66Model[126].setRotationPoint(7.5F, -2F, -43F);
		ewsclass66Model[126].rotateAngleZ = -0.78539816F;

		ewsclass66Model[127].addBox(0F, 0F, 0F, 18, 8, 1, 0F); // Box 148
		ewsclass66Model[127].setRotationPoint(-9F, -2F, -50F);

		ewsclass66Model[128].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 149
		ewsclass66Model[128].setRotationPoint(0.5F, -1.25F, -49F);

		ewsclass66Model[129].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 150
		ewsclass66Model[129].setRotationPoint(1F, -2.25F, -49F);

		ewsclass66Model[130].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 151
		ewsclass66Model[130].setRotationPoint(2.7F, -1.25F, -49F);

		ewsclass66Model[131].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 152
		ewsclass66Model[131].setRotationPoint(3.2F, -2.25F, -49F);

		ewsclass66Model[132].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 153
		ewsclass66Model[132].setRotationPoint(4.9F, -1.25F, -49F);

		ewsclass66Model[133].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 154
		ewsclass66Model[133].setRotationPoint(5.4F, -2.25F, -49F);

		ewsclass66Model[134].addBox(0F, 0F, 0F, 6, 8, 2, 0F); // Box 155
		ewsclass66Model[134].setRotationPoint(-8F, -2F, -49F);

		ewsclass66Model[135].addBox(0F, 0F, 0F, 9, 8, 1, 0F); // Box 156
		ewsclass66Model[135].setRotationPoint(-9F, -2F, -40F);
		ewsclass66Model[135].rotateAngleY = -1.57079633F;

		ewsclass66Model[136].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 157
		ewsclass66Model[136].setRotationPoint(-6.5F, 1F, -47F);

		ewsclass66Model[137].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 158
		ewsclass66Model[137].setRotationPoint(-6.5F, -1.25F, -47F);

		ewsclass66Model[138].addBox(0F, 0F, 0F, 8, 1, 7, 0F); // Box 159
		ewsclass66Model[138].setRotationPoint(-3F, 5F, -43F);

		ewsclass66Model[139].addBox(0F, 0F, 0F, 8, 1, 9, 0F); // Box 160
		ewsclass66Model[139].setRotationPoint(-3F, 5F, -37F);
		ewsclass66Model[139].rotateAngleX = 1.3962634F;

		ewsclass66Model[140].addShapeBox(0F, 0F, 0F, 1, 20, 108, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -20F, 0F, 0F, -20F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -20F, 0F, 0F, -20F); // Box 143
		ewsclass66Model[140].setRotationPoint(9F, -12F, -40F);

		fixRotation(ewsclass66Model, false, true, true);

	}
	private ModelEWSClass66_Bogie fronttrucks = new ModelEWSClass66_Bogie();
	private ModelEWSClass66_Bogie backtrucks = new ModelEWSClass66_Bogie();

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		for(int i = 0; i < 141; i++)
		{
			if (i==53 || i==46 || i== 27 || i==34 || i==8 || i==7 || i==47 || i==49){
				Minecraft.getMinecraft().entityRenderer.disableLightmap(1D);
			}
			ewsclass66Model[i].render(f5);
			if (i==53 || i==46 || i== 27 || i==34 || i==8 || i==7 || i==47 || i==49){
				Minecraft.getMinecraft().entityRenderer.enableLightmap(1D);
			}
		}

		Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/Class66Bogie.png"));
		GL11.glPushMatrix();
		GL11.glTranslated(0,0.3,-2.6);
		GL11.glScalef(0.8f,0.8f,0.8f);
		fronttrucks.render(entity,f,f1,f2,f3,f4,f5);
		GL11.glPopMatrix();

		GL11.glPushMatrix();
		GL11.glTranslated(0,0.3,2.1);
		GL11.glScalef(0.8f,0.8f,0.8f);
		backtrucks.render(entity,f,f1,f2,f3,f4,f5);
		GL11.glPopMatrix();
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
	{
	}

	public ModelRendererTurbo ewsclass66Model[];
}