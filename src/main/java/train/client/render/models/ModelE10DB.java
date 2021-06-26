//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2018 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator:
// Created on:13.09.2017 - 13:26:59
// Last changed on: 13.09.2017 - 13:26:59

package train.client.render.models;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import tmt.ModelConverter;
import tmt.ModelRendererTurbo;
import tmt.Tessellator;
import train.common.library.Info;

public class ModelE10DB extends ModelConverter
{
	int textureX = 512;
	int textureY = 256;

	public ModelE10DB()
	{
		bodyModel = new ModelRendererTurbo[157];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 2
		bodyModel[1] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 3
		bodyModel[2] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 4
		bodyModel[3] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 5
		bodyModel[4] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 6
		bodyModel[5] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 7
		bodyModel[6] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 8
		bodyModel[7] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 9
		bodyModel[8] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 10
		bodyModel[9] = new ModelRendererTurbo(this, 17, 166, textureX, textureY); // Box 13
		bodyModel[10] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 14
		bodyModel[11] = new ModelRendererTurbo(this, 25, 1, textureX, textureY, "lamp"); // FrontTopYellow
		bodyModel[12] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 16
		bodyModel[13] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 17
		bodyModel[14] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 24
		bodyModel[15] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 25
		bodyModel[16] = new ModelRendererTurbo(this, 20, 197, textureX, textureY); // Box 23
		bodyModel[17] = new ModelRendererTurbo(this, 217, 17, textureX, textureY); // Box 2
		bodyModel[18] = new ModelRendererTurbo(this, 481, 17, textureX, textureY); // Box 3
		bodyModel[19] = new ModelRendererTurbo(this, 177, 25, textureX, textureY); // Box 4
		bodyModel[20] = new ModelRendererTurbo(this, 113, 9, textureX, textureY); // Box 5
		bodyModel[21] = new ModelRendererTurbo(this, 241, 25, textureX, textureY); // Box 6
		bodyModel[22] = new ModelRendererTurbo(this, 265, 33, textureX, textureY); // Box 7
		bodyModel[23] = new ModelRendererTurbo(this, 297, 33, textureX, textureY); // Box 8
		bodyModel[24] = new ModelRendererTurbo(this, 265, 17, textureX, textureY); // Box 9
		bodyModel[25] = new ModelRendererTurbo(this, 337, 33, textureX, textureY); // Box 10
		bodyModel[26] = new ModelRendererTurbo(this, 353, 33, textureX, textureY); // Box 14
		bodyModel[27] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 15
		bodyModel[28] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 16
		bodyModel[29] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 17
		bodyModel[30] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 21
		bodyModel[31] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 22
		bodyModel[32] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 23
		bodyModel[33] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 25
		bodyModel[34] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 49
		bodyModel[35] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 51
		bodyModel[36] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 52
		bodyModel[37] = new ModelRendererTurbo(this, 281, 9, textureX, textureY); // Box 53
		bodyModel[38] = new ModelRendererTurbo(this, 385, 33, textureX, textureY); // Box 54
		bodyModel[39] = new ModelRendererTurbo(this, 457, 9, textureX, textureY); // Box 55
		bodyModel[40] = new ModelRendererTurbo(this, 401, 33, textureX, textureY); // Box 56
		bodyModel[41] = new ModelRendererTurbo(this, 238, 167, textureX, textureY); // Box 57
		bodyModel[42] = new ModelRendererTurbo(this, 254, 136, textureX, textureY); // Box 58
		bodyModel[43] = new ModelRendererTurbo(this, 497, 9, textureX, textureY); // Box 59
		bodyModel[44] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 60
		bodyModel[45] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 61
		bodyModel[46] = new ModelRendererTurbo(this, 97, 17, textureX, textureY); // Box 62
		bodyModel[47] = new ModelRendererTurbo(this, 241, 17, textureX, textureY); // Box 63
		bodyModel[48] = new ModelRendererTurbo(this, 201, 25, textureX, textureY); // Box 64
		bodyModel[49] = new ModelRendererTurbo(this, 289, 33, textureX, textureY); // Box 65
		bodyModel[50] = new ModelRendererTurbo(this, 321, 33, textureX, textureY); // Box 66
		bodyModel[51] = new ModelRendererTurbo(this, 417, 33, textureX, textureY); // Box 67
		bodyModel[52] = new ModelRendererTurbo(this, 297, 9, textureX, textureY); // Box 68
		bodyModel[53] = new ModelRendererTurbo(this, 473, 9, textureX, textureY); // Box 69
		bodyModel[54] = new ModelRendererTurbo(this, 17, 25, textureX, textureY); // Box 70
		bodyModel[55] = new ModelRendererTurbo(this, 473, 25, textureX, textureY); // Box 71
		bodyModel[56] = new ModelRendererTurbo(this, 433, 33, textureX, textureY); // Box 72
		bodyModel[57] = new ModelRendererTurbo(this, 441, 33, textureX, textureY); // Box 73
		bodyModel[58] = new ModelRendererTurbo(this, 449, 33, textureX, textureY); // Box 74
		bodyModel[59] = new ModelRendererTurbo(this, 457, 33, textureX, textureY); // Box 75
		bodyModel[60] = new ModelRendererTurbo(this, 265, 57, textureX, textureY); // Box 0
		bodyModel[61] = new ModelRendererTurbo(this, 361, 57, textureX, textureY); // Box 96
		bodyModel[62] = new ModelRendererTurbo(this, 385, 57, textureX, textureY); // Box 97
		bodyModel[63] = new ModelRendererTurbo(this, 441, 57, textureX, textureY); // Box 98
		bodyModel[64] = new ModelRendererTurbo(this, 465, 57, textureX, textureY); // Box 99
		bodyModel[65] = new ModelRendererTurbo(this, 489, 57, textureX, textureY); // Box 100
		bodyModel[66] = new ModelRendererTurbo(this, 241, 65, textureX, textureY); // Box 101
		bodyModel[67] = new ModelRendererTurbo(this, 321, 65, textureX, textureY); // Box 102
		bodyModel[68] = new ModelRendererTurbo(this, 345, 65, textureX, textureY); // Box 103
		bodyModel[69] = new ModelRendererTurbo(this, 369, 65, textureX, textureY); // Box 104
		bodyModel[70] = new ModelRendererTurbo(this, 393, 65, textureX, textureY); // Box 105
		bodyModel[71] = new ModelRendererTurbo(this, 417, 65, textureX, textureY); // Box 106
		bodyModel[72] = new ModelRendererTurbo(this, 441, 65, textureX, textureY); // Box 107
		bodyModel[73] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 55
		bodyModel[74] = new ModelRendererTurbo(this, 449, 65, textureX, textureY); // Box 88
		bodyModel[75] = new ModelRendererTurbo(this, 505, 17, textureX, textureY, "lamp"); // Box 116
		bodyModel[76] = new ModelRendererTurbo(this, 121, 73, textureX, textureY); // Box 118
		bodyModel[77] = new ModelRendererTurbo(this, 225, 41, textureX, textureY); // Box 119
		bodyModel[78] = new ModelRendererTurbo(this, 177, 25, textureX, textureY); // Box 120
		bodyModel[79] = new ModelRendererTurbo(this, 481, 65, textureX, textureY); // Box 121
		bodyModel[80] = new ModelRendererTurbo(this, 241, 49, textureX, textureY); // Box 122
		bodyModel[81] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 123
		bodyModel[82] = new ModelRendererTurbo(this, 121, 73, textureX, textureY); // Box 118
		bodyModel[83] = new ModelRendererTurbo(this, 97, 73, textureX, textureY); // Box 119
		bodyModel[84] = new ModelRendererTurbo(this, 114, 73, textureX, textureY); // Box 120
		bodyModel[85] = new ModelRendererTurbo(this, 113, 73, textureX, textureY); // Box 121
		bodyModel[86] = new ModelRendererTurbo(this, 153, 73, textureX, textureY); // Box 122
		bodyModel[87] = new ModelRendererTurbo(this, 169, 73, textureX, textureY); // Box 123
		bodyModel[88] = new ModelRendererTurbo(this, 177, 73, textureX, textureY); // Box 130
		bodyModel[89] = new ModelRendererTurbo(this, 233, 73, textureX, textureY); // Box 163
		bodyModel[90] = new ModelRendererTurbo(this, 497, 65, textureX, textureY); // Box 164
		bodyModel[91] = new ModelRendererTurbo(this, 257, 73, textureX, textureY); // Box 165
		bodyModel[92] = new ModelRendererTurbo(this, 289, 73, textureX, textureY); // Box 9
		bodyModel[93] = new ModelRendererTurbo(this, 313, 73, textureX, textureY); // Box 163
		bodyModel[94] = new ModelRendererTurbo(this, 177, 73, textureX, textureY); // Box 164
		bodyModel[95] = new ModelRendererTurbo(this, 369, 73, textureX, textureY); // Box 9
		bodyModel[96] = new ModelRendererTurbo(this, 393, 65, textureX, textureY); // Box 142
		bodyModel[97] = new ModelRendererTurbo(this, 233, 73, textureX, textureY); // Box 143
		bodyModel[98] = new ModelRendererTurbo(this, 441, 81, textureX, textureY); // Box 144
		bodyModel[99] = new ModelRendererTurbo(this, 465, 33, textureX, textureY); // Box 132
		bodyModel[100] = new ModelRendererTurbo(this, 257, 73, textureX, textureY); // Box 133
		bodyModel[101] = new ModelRendererTurbo(this, 329, 73, textureX, textureY, "lamp"); // Box 134
		bodyModel[102] = new ModelRendererTurbo(this, 337, 73, textureX, textureY, "lamp"); // FrontLeftYellow
		bodyModel[103] = new ModelRendererTurbo(this, 361, 73, textureX, textureY); // Box 136
		bodyModel[104] = new ModelRendererTurbo(this, 369, 73, textureX, textureY); // Box 137
		bodyModel[105] = new ModelRendererTurbo(this, 385, 73, textureX, textureY, "lamp"); // FrontRightYellow
		bodyModel[106] = new ModelRendererTurbo(this, 30, 104, textureX, textureY); // Box 132
		bodyModel[107] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 134
		bodyModel[108] = new ModelRendererTurbo(this, 2, 95, textureX, textureY); // Box 135
		bodyModel[109] = new ModelRendererTurbo(this, 2, 95, textureX, textureY); // Box 136
		bodyModel[110] = new ModelRendererTurbo(this, 265, 104, textureX, textureY); // Box 199
		bodyModel[111] = new ModelRendererTurbo(this, 337, 73, textureX, textureY); // Box 136
		bodyModel[112] = new ModelRendererTurbo(this, 79, 153, textureX, textureY); // Box 137
		bodyModel[113] = new ModelRendererTurbo(this, 56, 143, textureX, textureY); // Box 139
		bodyModel[114] = new ModelRendererTurbo(this, 25, 231, textureX, textureY); // Box 143
		bodyModel[115] = new ModelRendererTurbo(this, 25, 231, textureX, textureY); // Box 144
		bodyModel[116] = new ModelRendererTurbo(this, 25, 231, textureX, textureY); // Box 145
		bodyModel[117] = new ModelRendererTurbo(this, 25, 231, textureX, textureY); // Box 146
		bodyModel[118] = new ModelRendererTurbo(this, 369, 33, textureX, textureY); // Box 151
		bodyModel[119] = new ModelRendererTurbo(this, 241, 49, textureX, textureY); // pantotop
		bodyModel[120] = new ModelRendererTurbo(this, 312, 57, textureX, textureY); // pantoarm
		bodyModel[121] = new ModelRendererTurbo(this, 312, 57, textureX, textureY); // pantoarm
		bodyModel[122] = new ModelRendererTurbo(this, 312, 57, textureX, textureY); // pantoarm
		bodyModel[123] = new ModelRendererTurbo(this, 312, 57, textureX, textureY); // pantoarm
		bodyModel[124] = new ModelRendererTurbo(this, 312, 57, textureX, textureY); // Box 10
		bodyModel[125] = new ModelRendererTurbo(this, 312, 57, textureX, textureY); // Box 11
		bodyModel[126] = new ModelRendererTurbo(this, 312, 57, textureX, textureY); // Box 12
		bodyModel[127] = new ModelRendererTurbo(this, 312, 57, textureX, textureY); // Box 13
		bodyModel[128] = new ModelRendererTurbo(this, 81, 33, textureX, textureY); // Box 175
		bodyModel[129] = new ModelRendererTurbo(this, 25, 231, textureX, textureY); // Box 180
		bodyModel[130] = new ModelRendererTurbo(this, 25, 231, textureX, textureY); // Box 181
		bodyModel[131] = new ModelRendererTurbo(this, 25, 231, textureX, textureY); // Box 182
		bodyModel[132] = new ModelRendererTurbo(this, 25, 231, textureX, textureY); // Box 183
		bodyModel[133] = new ModelRendererTurbo(this, 31, 36, textureX, textureY); // Box 184
		bodyModel[134] = new ModelRendererTurbo(this, 339, 103, textureX, textureY); // Box 185
		bodyModel[135] = new ModelRendererTurbo(this, 44, 25, textureX, textureY); // Box 149
		bodyModel[136] = new ModelRendererTurbo(this, 67, 26, textureX, textureY); // Box 150
		bodyModel[137] = new ModelRendererTurbo(this, 67, 26, textureX, textureY); // Box 151
		bodyModel[138] = new ModelRendererTurbo(this, 44, 25, textureX, textureY); // Box 152
		bodyModel[139] = new ModelRendererTurbo(this, 26, 30, textureX, textureY); // Box 153
		bodyModel[140] = new ModelRendererTurbo(this, 26, 30, textureX, textureY); // Box 154
		bodyModel[141] = new ModelRendererTurbo(this, 25, 231, textureX, textureY); // Box 152
		bodyModel[142] = new ModelRendererTurbo(this, 25, 231, textureX, textureY); // Box 153
		bodyModel[143] = new ModelRendererTurbo(this, 25, 231, textureX, textureY); // Box 154
		bodyModel[144] = new ModelRendererTurbo(this, 25, 231, textureX, textureY); // Box 155
		bodyModel[145] = new ModelRendererTurbo(this, 265, 57, textureX, textureY); // Box 155
		bodyModel[146] = new ModelRendererTurbo(this, 312, 57, textureX, textureY); // Box 156
		bodyModel[147] = new ModelRendererTurbo(this, 241, 49, textureX, textureY); // Box 157
		bodyModel[148] = new ModelRendererTurbo(this, 312, 57, textureX, textureY); // Box 158
		bodyModel[149] = new ModelRendererTurbo(this, 312, 57, textureX, textureY); // Box 159
		bodyModel[150] = new ModelRendererTurbo(this, 312, 57, textureX, textureY); // Box 160
		bodyModel[151] = new ModelRendererTurbo(this, 312, 57, textureX, textureY); // Box 161
		bodyModel[152] = new ModelRendererTurbo(this, 312, 57, textureX, textureY); // Box 162
		bodyModel[153] = new ModelRendererTurbo(this, 312, 57, textureX, textureY); // Box 163
		bodyModel[154] = new ModelRendererTurbo(this, 312, 57, textureX, textureY); // Box 164
		bodyModel[155] = new ModelRendererTurbo(this, 466, 100, textureX, textureY); // Box 181
		bodyModel[156] = new ModelRendererTurbo(this, 466, 99, textureX, textureY); // Box 182

		bodyModel[0].addShapeBox(0F, 0F, 0F, 4, 5, 11, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F); // Box 2
		bodyModel[0].setRotationPoint(45F, -6F, 0F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 4, 7, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F); // Box 3
		bodyModel[1].setRotationPoint(45F, -13F, 0F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 4, 8, 11, 0F,0F, 0F, 0F, -1.5F, 0F, 0F, -2.6F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, -1F, 0F, 0F, 0F); // Box 4
		bodyModel[2].setRotationPoint(45F, -21F, 0F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 2, 2, 11, 0F,0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, 0F); // Box 5
		bodyModel[3].setRotationPoint(45F, -23F, 0F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 4, 5, 11, 0F,0F, 0F, 0F, -1F, 0F, -1F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[4].setRotationPoint(45F, -6F, -11F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 4, 7, 11, 0F,0F, 0F, 0F, -1.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 7
		bodyModel[5].setRotationPoint(45F, -13F, -11F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 5, 8, 11, 0F,0F, 0F, 0F, -3.5F, 0F, -1F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 8
		bodyModel[6].setRotationPoint(45F, -21F, -11F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 2, 2, 11, 0F,0F, 0F, -1F, -2F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 9
		bodyModel[7].setRotationPoint(45F, -23F, -11F);

		bodyModel[8].addBox(0F, 0F, 0F, 4, 21, 1, 0F); // Box 10
		bodyModel[8].setRotationPoint(41F, -21F, 10F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 84, 2, 22, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[9].setRotationPoint(-39F, -23F, -11F);

		bodyModel[10].addBox(0F, 0F, 0F, 4, 21, 1, 0F); // Box 14
		bodyModel[10].setRotationPoint(41F, -21F, -11F);

		bodyModel[11].addBox(-4F, 0F, 0F, 4, 2, 2, 0F); // FrontTopYellow
		bodyModel[11].setRotationPoint(47.5F, -23.3F, -1F);

		bodyModel[12].addBox(0F, 0F, 0F, 1, 4, 2, 0F); // Box 16
		bodyModel[12].setRotationPoint(47.9F, -10F, 6F);

		bodyModel[13].addBox(0F, 0F, 0F, 1, 4, 2, 0F); // Box 17
		bodyModel[13].setRotationPoint(47.9F, -10F, -8F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 9, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -3F, 0F); // Box 24
		bodyModel[14].setRotationPoint(36F, 2F, 10F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 9, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -3F, 0F); // Box 25
		bodyModel[15].setRotationPoint(36F, 2F, -11F);

		bodyModel[16].addBox(0F, 0F, 0F, 84, 1, 20, 0F); // Box 23
		bodyModel[16].setRotationPoint(-39F, -1F, -10F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 4, 5, 11, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F); // Box 2
		bodyModel[17].setRotationPoint(-39F, -6F, 0F);
		bodyModel[17].rotateAngleY = -3.14159265F;

		bodyModel[18].addShapeBox(0F, 0F, 0F, 4, 7, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F); // Box 3
		bodyModel[18].setRotationPoint(-39F, -13F, 0F);
		bodyModel[18].rotateAngleY = -3.14159265F;

		bodyModel[19].addShapeBox(0F, 0F, 0F, 4, 8, 11, 0F,0F, 0F, 0F, -1.5F, 0F, 0F, -2.6F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, -1F, 0F, 0F, 0F); // Box 4
		bodyModel[19].setRotationPoint(-39F, -21F, 0F);
		bodyModel[19].rotateAngleY = -3.14159265F;

		bodyModel[20].addShapeBox(0F, 0F, 0F, 2, 2, 11, 0F,0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, 0F); // Box 5
		bodyModel[20].setRotationPoint(-39F, -23F, 0F);
		bodyModel[20].rotateAngleY = -3.14159265F;

		bodyModel[21].addShapeBox(0F, 0F, 0F, 4, 5, 11, 0F,0F, 0F, 0F, -1F, 0F, -1F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[21].setRotationPoint(-39F, -6F, 11F);
		bodyModel[21].rotateAngleY = -3.14159265F;

		bodyModel[22].addShapeBox(0F, 0F, 0F, 4, 7, 11, 0F,0F, 0F, 0F, -1.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 7
		bodyModel[22].setRotationPoint(-39F, -13F, 11F);
		bodyModel[22].rotateAngleY = -3.14159265F;

		bodyModel[23].addShapeBox(0F, 0F, 0F, 5, 8, 11, 0F,0F, 0F, 0F, -3.5F, 0F, -1F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 8
		bodyModel[23].setRotationPoint(-39F, -21F, 11F);
		bodyModel[23].rotateAngleY = -3.14159265F;

		bodyModel[24].addShapeBox(0F, 0F, 0F, 2, 2, 11, 0F,0F, 0F, -1F, -2F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 9
		bodyModel[24].setRotationPoint(-39F, -23F, 11F);
		bodyModel[24].rotateAngleY = -3.14159265F;

		bodyModel[25].addBox(0F, 0F, 0F, 4, 21, 1, 0F); // Box 10
		bodyModel[25].setRotationPoint(-35F, -21F, -10F);
		bodyModel[25].rotateAngleY = -3.14159265F;

		bodyModel[26].addBox(0F, 0F, 0F, 4, 21, 1, 0F); // Box 14
		bodyModel[26].setRotationPoint(-35F, -21F, 11F);
		bodyModel[26].rotateAngleY = -3.14159265F;

		bodyModel[27].addBox(-4F, 0F, 0F, 4, 2, 2, 0F); // Box 15
		bodyModel[27].setRotationPoint(-41.5F, -23.3F, 1F);
		bodyModel[27].rotateAngleY = -3.14159265F;

		bodyModel[28].addBox(0F, 0F, 0F, 1, 4, 2, 0F); // Box 16
		bodyModel[28].setRotationPoint(-41.9F, -10F, 8F);
		bodyModel[28].rotateAngleY = -3.14159265F;

		bodyModel[29].addBox(0F, 0F, 0F, 1, 4, 2, 0F); // Box 17
		bodyModel[29].setRotationPoint(-41.9F, -10F, -6F);
		bodyModel[29].rotateAngleY = -3.14159265F;

		bodyModel[30].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 21
		bodyModel[30].setRotationPoint(-46F, -1F, 10F);
		bodyModel[30].rotateAngleY = -3.14159265F;

		bodyModel[31].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 22
		bodyModel[31].setRotationPoint(-44F, 0F, 9F);
		bodyModel[31].rotateAngleY = -3.14159265F;

		bodyModel[32].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 23
		bodyModel[32].setRotationPoint(-44F, 0F, -8F);
		bodyModel[32].rotateAngleY = -3.14159265F;

		bodyModel[33].addShapeBox(0F, 0F, 0F, 9, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -3F, 0F); // Box 25
		bodyModel[33].setRotationPoint(-30F, 2F, -10F);
		bodyModel[33].rotateAngleY = -3.14159265F;

		bodyModel[34].addBox(0F, 0F, 0F, 5, 17, 1, 0F); // Box 49
		bodyModel[34].setRotationPoint(36F, -21F, 10F);

		bodyModel[35].addBox(0F, 0F, 0F, 5, 4, 1, 0F); // Box 51
		bodyModel[35].setRotationPoint(36F, -4F, 10F);

		bodyModel[36].addBox(0F, 0F, 0F, 5, 4, 1, 0F); // Box 52
		bodyModel[36].setRotationPoint(36F, -4F, -11F);

		bodyModel[37].addBox(0F, 0F, 0F, 5, 4, 1, 0F); // Box 53
		bodyModel[37].setRotationPoint(-35F, -4F, -11F);

		bodyModel[38].addBox(-4F, 0F, 0F, 5, 17, 1, 0F); // Box 54
		bodyModel[38].setRotationPoint(-31F, -21F, -11F);

		bodyModel[39].addBox(0F, 0F, 0F, 5, 4, 1, 0F); // Box 55
		bodyModel[39].setRotationPoint(-35F, -4F, 10F);

		bodyModel[40].addBox(-5F, 0F, -1F, 5, 17, 1, 0F); // Box 56
		bodyModel[40].setRotationPoint(-30F, -21F, 11F);

		bodyModel[41].addBox(0F, 0F, 0F, 66, 21, 1, 0F); // Box 57
		bodyModel[41].setRotationPoint(-30F, -21F, -11F);

		bodyModel[42].addBox(0F, 0F, 0F, 66, 21, 1, 0F); // Box 58
		bodyModel[42].setRotationPoint(-30F, -21F, 10F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 59
		bodyModel[43].setRotationPoint(-46F, -1F, -7F);
		bodyModel[43].rotateAngleY = -3.14159265F;

		bodyModel[44].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 60
		bodyModel[44].setRotationPoint(52F, 0F, 9F);
		bodyModel[44].rotateAngleY = -3.14159265F;

		bodyModel[45].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 61
		bodyModel[45].setRotationPoint(52F, 0F, -8F);
		bodyModel[45].rotateAngleY = -3.14159265F;

		bodyModel[46].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 62
		bodyModel[46].setRotationPoint(52F, -1F, -10F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 63
		bodyModel[47].setRotationPoint(52F, -1F, 7F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 5, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 64
		bodyModel[48].setRotationPoint(-35F, -4F, 11F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 5, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 65
		bodyModel[49].setRotationPoint(36F, -4F, 11F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 5, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 66
		bodyModel[50].setRotationPoint(41F, -4F, -11F);
		bodyModel[50].rotateAngleY = -3.14159265F;

		bodyModel[51].addShapeBox(0F, 0F, 0F, 5, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 67
		bodyModel[51].setRotationPoint(-30F, -4F, -11F);
		bodyModel[51].rotateAngleY = -3.14159265F;

		bodyModel[52].addBox(0F, 0F, 0F, 0, 10, 1, 0F); // Box 68
		bodyModel[52].setRotationPoint(-35F, -15F, -12F);

		bodyModel[53].addBox(0F, 0F, 0F, 0, 10, 1, 0F); // Box 69
		bodyModel[53].setRotationPoint(-30F, -15F, -12F);

		bodyModel[54].addBox(0F, 0F, 0F, 0, 10, 1, 0F); // Box 70
		bodyModel[54].setRotationPoint(36F, -15F, -12F);

		bodyModel[55].addBox(0F, 0F, 0F, 0, 10, 1, 0F); // Box 71
		bodyModel[55].setRotationPoint(41F, -15F, -12F);

		bodyModel[56].addBox(0F, 0F, 0F, 0, 10, 1, 0F); // Box 72
		bodyModel[56].setRotationPoint(-35F, -15F, 11F);

		bodyModel[57].addBox(0F, 0F, 0F, 0, 10, 1, 0F); // Box 73
		bodyModel[57].setRotationPoint(-30F, -15F, 11F);

		bodyModel[58].addBox(0F, 0F, 0F, 0, 10, 1, 0F); // Box 74
		bodyModel[58].setRotationPoint(36F, -15F, 11F);

		bodyModel[59].addBox(0F, 0F, 0F, 0, 10, 1, 0F); // Box 75
		bodyModel[59].setRotationPoint(41F, -15F, 11F);

		bodyModel[60].addBox(0F, 0F, 0F, 14, 1, 12, 0F); // Box 0
		bodyModel[60].setRotationPoint(-35F, -24F, -6F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 7, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 96
		bodyModel[61].setRotationPoint(-10F, -20F, 11F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 7, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 97
		bodyModel[62].setRotationPoint(27F, -20F, 11F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 7, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 98
		bodyModel[63].setRotationPoint(-19F, -20F, 11F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 7, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 99
		bodyModel[64].setRotationPoint(18F, -20F, 11F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 7, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 100
		bodyModel[65].setRotationPoint(-28F, -20F, 11F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 7, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 101
		bodyModel[66].setRotationPoint(9F, -20F, 11F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 7, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 102
		bodyModel[67].setRotationPoint(34F, -20F, -11F);
		bodyModel[67].rotateAngleY = -3.14159265F;

		bodyModel[68].addShapeBox(0F, 0F, 0F, 7, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 103
		bodyModel[68].setRotationPoint(25F, -20F, -11F);
		bodyModel[68].rotateAngleY = -3.14159265F;

		bodyModel[69].addShapeBox(0F, 0F, 0F, 7, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 104
		bodyModel[69].setRotationPoint(16F, -20F, -11F);
		bodyModel[69].rotateAngleY = -3.14159265F;

		bodyModel[70].addShapeBox(0F, 0F, 0F, 7, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 105
		bodyModel[70].setRotationPoint(-3F, -20F, -11F);
		bodyModel[70].rotateAngleY = -3.14159265F;

		bodyModel[71].addShapeBox(0F, 0F, 0F, 7, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 106
		bodyModel[71].setRotationPoint(-12F, -20F, -11F);
		bodyModel[71].rotateAngleY = -3.14159265F;

		bodyModel[72].addShapeBox(0F, 0F, 0F, 7, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 107
		bodyModel[72].setRotationPoint(-21F, -20F, -11F);
		bodyModel[72].rotateAngleY = -3.14159265F;

		bodyModel[73].addShapeBox(0F, 0F, 0F, 29, 3, 16, 0F,-1F, -1F, -1F, -1F, -1F, -1F, -1F, -1F, -1F, -1F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 55
		bodyModel[73].setRotationPoint(-5F, -26F, -8F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 7, 3, 12, 0F,-1F, -1F, -1F, -1F, -1F, -1F, -1F, -1F, -1F, -1F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 88
		bodyModel[74].setRotationPoint(-15F, -26F, -6F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F); // Box 116
		bodyModel[75].setRotationPoint(-43.1F, -10F, -8F);

		bodyModel[76].addBox(0F, 0F, 0F, 4, 1, 20, 0F); // Box 118
		bodyModel[76].setRotationPoint(41F, -11F, -10F);

		bodyModel[77].addBox(0F, 0F, 0F, 4, 2, 5, 0F); // Box 119
		bodyModel[77].setRotationPoint(41F, -13F, 5F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 120
		bodyModel[78].setRotationPoint(41F, -13F, 3F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 6, 2, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 121
		bodyModel[79].setRotationPoint(43F, -13F, 3F);
		bodyModel[79].rotateAngleY = -1.57079633F;

		bodyModel[80].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 122
		bodyModel[80].setRotationPoint(43F, -13F, 3F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,-1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 123
		bodyModel[81].setRotationPoint(43F, -13F, 3F);

		bodyModel[82].addBox(0F, 0F, 0F, 4, 1, 20, 0F); // Box 118
		bodyModel[82].setRotationPoint(-35F, -12F, 10F);
		bodyModel[82].rotateAngleY = -3.14159265F;

		bodyModel[83].addBox(0F, 0F, 0F, 4, 2, 5, 0F); // Box 119
		bodyModel[83].setRotationPoint(-35F, -14F, -5F);
		bodyModel[83].rotateAngleY = -3.14159265F;

		bodyModel[84].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 120
		bodyModel[84].setRotationPoint(-35F, -14F, -3F);
		bodyModel[84].rotateAngleY = -3.14159265F;

		bodyModel[85].addShapeBox(0F, 0F, 0F, 6, 2, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 121
		bodyModel[85].setRotationPoint(-37F, -14F, -3F);
		bodyModel[85].rotateAngleY = -4.71238898F;

		bodyModel[86].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 122
		bodyModel[86].setRotationPoint(-37F, -14F, -3F);
		bodyModel[86].rotateAngleY = -3.14159265F;

		bodyModel[87].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,-1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 123
		bodyModel[87].setRotationPoint(-37F, -14F, -3F);
		bodyModel[87].rotateAngleY = -3.14159265F;

		bodyModel[88].addShapeBox(0F, 0F, 0F, 4, 5, 18, 0F,1F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, 1F, 1F, 0F, 2F, 1F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, 1F, 1F, 0F, 2F); // Box 130
		bodyModel[88].setRotationPoint(46F, -1F, -9F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 1, 10, 8, 0F,-1.5F, 0F, 0F, 1.5F, -0.2F, 0F, 1.5F, -0.2F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 163
		bodyModel[89].setRotationPoint(31F, -16F, 2F);
		bodyModel[89].rotateAngleY = -3.14159265F;

		bodyModel[90].addBox(0F, 0F, 0F, 1, 2, 6, 0F); // Box 164
		bodyModel[90].setRotationPoint(30F, -16.2F, 1F);
		bodyModel[90].rotateAngleY = -3.14159265F;

		bodyModel[91].addShapeBox(0F, 0F, 0F, 5, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 165
		bodyModel[91].setRotationPoint(35F, -6F, 2F);
		bodyModel[91].rotateAngleY = -3.14159265F;

		bodyModel[92].addShapeBox(0F, 0F, 0F, 3, 4, 8, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 9
		bodyModel[92].setRotationPoint(34.5F, -5F, 2F);
		bodyModel[92].rotateAngleY = -3.14159265F;

		bodyModel[93].addShapeBox(0F, 0F, 0F, 1, 10, 8, 0F,-1.5F, 0F, 0F, 1.5F, -0.2F, 0F, 1.5F, -0.2F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 163
		bodyModel[93].setRotationPoint(-26F, -16F, -2F);
		bodyModel[93].rotateAngleY = -6.28318531F;

		bodyModel[94].addBox(0F, 0F, 0F, 1, 2, 6, 0F); // Box 164
		bodyModel[94].setRotationPoint(-25F, -16.2F, -1F);
		bodyModel[94].rotateAngleY = -6.28318531F;

		bodyModel[95].addShapeBox(0F, 0F, 0F, 3, 4, 8, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 9
		bodyModel[95].setRotationPoint(-29.5F, -5F, -2F);
		bodyModel[95].rotateAngleY = -6.28318531F;

		bodyModel[96].addBox(0F, 0F, 0F, 1, 20, 20, 0F); // Box 142
		bodyModel[96].setRotationPoint(-21F, -21F, -10F);

		bodyModel[97].addBox(0F, 0F, 0F, 1, 20, 20, 0F); // Box 143
		bodyModel[97].setRotationPoint(25F, -21F, -10F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 4, 5, 18, 0F,0F, 0F, 1F, 1F, 0F, 2F, 1F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, 1F, 1F, 0F, 2F, 1F, 0F, 2F, 0F, 0F, 1F); // Box 144
		bodyModel[98].setRotationPoint(-44F, -1F, -9F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F); // Box 132
		bodyModel[99].setRotationPoint(-43.1F, -8F, -8F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F); // Box 133
		bodyModel[100].setRotationPoint(-43.1F, -8F, 6F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F); // Box 134
		bodyModel[101].setRotationPoint(-43.1F, -10F, 6F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F); // FrontLeftYellow
		bodyModel[102].setRotationPoint(48.1F, -8F, 6F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F); // Box 136
		bodyModel[103].setRotationPoint(48.1F, -10F, 6F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F); // Box 137
		bodyModel[104].setRotationPoint(48.1F, -10F, -8F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F); // FrontRightYellow
		bodyModel[105].setRotationPoint(48.1F, -8F, -8F);

		bodyModel[106].addBox(0F, 0F, 0F, 84, 1, 22, 0F); // Box 132
		bodyModel[106].setRotationPoint(-39F, 0F, -11F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 9, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -3F, 0F); // Box 134
		bodyModel[107].setRotationPoint(-30F, 2F, 11F);
		bodyModel[107].rotateAngleY = -3.14159265F;

		bodyModel[108].addBox(0F, 0F, 0F, 3, 1, 2, 0F); // Box 135
		bodyModel[108].setRotationPoint(28F, 1F, -1F);

		bodyModel[109].addBox(0F, 0F, 0F, 3, 1, 2, 0F); // Box 136
		bodyModel[109].setRotationPoint(-22F, 1F, 1F);
		bodyModel[109].rotateAngleY = -3.14159265F;

		bodyModel[110].addBox(0F, 0F, 0F, 20, 5, 18, 0F); // Box 199
		bodyModel[110].setRotationPoint(-7F, 1F, -9F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 5, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 136
		bodyModel[111].setRotationPoint(-30F, -6F, -2F);
		bodyModel[111].rotateAngleY = -6.28318531F;

		bodyModel[112].addBox(0F, 0F, 0F, 84, 1, 1, 0F); // Box 137
		bodyModel[112].setRotationPoint(-39F, 1F, -11F);

		bodyModel[113].addBox(0F, 0F, 0F, 84, 1, 1, 0F); // Box 139
		bodyModel[113].setRotationPoint(-39F, 1F, 10F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F,0F, -0.25F, 0F, -1.35F, -0.25F, 0F, -0.45F, -0.25F, 0F, -0.85F, -0.25F, 0F, 0F, -0.25F, 0F, -1.35F, -0.25F, 0F, -0.45F, -0.25F, 0F, -0.85F, -0.25F, 0F); // Box 143
		bodyModel[114].setRotationPoint(50F, -6.5F, 0F);
		bodyModel[114].rotateAngleX = -3.14159265F;
		bodyModel[114].rotateAngleY = -3.14159265F;

		bodyModel[115].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F,0F, -0.25F, 0F, -1.35F, -0.25F, 0F, -0.45F, -0.25F, 0F, -0.85F, -0.25F, 0F, 0F, -0.25F, 0F, -1.35F, -0.25F, 0F, -0.45F, -0.25F, 0F, -0.85F, -0.25F, 0F); // Box 144
		bodyModel[115].setRotationPoint(50F, -7.5F, 0F);
		bodyModel[115].rotateAngleY = -3.14159265F;

		bodyModel[116].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,-0.2F, -0.25F, 0F, -1.15F, -0.25F, 0F, -0.85F, -0.25F, -1F, -0.6F, -0.25F, -0.6F, -0.2F, -0.25F, 0F, -1.15F, -0.25F, 0F, -0.85F, -0.25F, -1F, -0.6F, -0.25F, -0.6F); // Box 145
		bodyModel[116].setRotationPoint(49F, -7.5F, -8F);
		bodyModel[116].rotateAngleY = -3.14159265F;

		bodyModel[117].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,-0.2F, -0.25F, 0F, -1.15F, -0.25F, 0F, -0.85F, -0.25F, -1F, -0.6F, -0.25F, -0.6F, -0.2F, -0.25F, 0F, -1.15F, -0.25F, 0F, -0.85F, -0.25F, -1F, -0.6F, -0.25F, -0.6F); // Box 146
		bodyModel[117].setRotationPoint(49F, -6.5F, 8F);
		bodyModel[117].rotateAngleX = 3.14159265F;
		bodyModel[117].rotateAngleY = -3.14159265F;

		bodyModel[118].addBox(0F, 0F, 0F, 5, 17, 1, 0F); // Box 151
		bodyModel[118].setRotationPoint(36F, -21F, -11F);

		bodyModel[119].addBox(0F, -8F, 0F, 2, 1, 12, 0F); // pantotop
		bodyModel[119].setRotationPoint(-29F, -26F, -6F);

		bodyModel[120].addBox(-8F, 0F, 0F, 8, 1, 1, 0F); // pantoarm
		bodyModel[120].setRotationPoint(-29F, -24.1F, -5F);
		bodyModel[120].rotateAngleZ = -0.6981317F;

		bodyModel[121].addShapeBox(-8F, -1F, 0F, 8, 1, 1, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // pantoarm
		bodyModel[121].setRotationPoint(-28F, -33F, -5F);
		bodyModel[121].rotateAngleZ = 0.62831853F;

		bodyModel[122].addShapeBox(-8F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // pantoarm
		bodyModel[122].setRotationPoint(-28F, -33F, -5F);
		bodyModel[122].rotateAngleZ = 2.51327412F;

		bodyModel[123].addBox(-8F, -1F, 0F, 8, 1, 1, 0F); // pantoarm
		bodyModel[123].setRotationPoint(-27F, -24.1F, -5F);
		bodyModel[123].rotateAngleZ = -2.44346095F;

		bodyModel[124].addBox(-8F, 0F, 0F, 8, 1, 1, 0F); // Box 10
		bodyModel[124].setRotationPoint(-29F, -24.1F, 4F);
		bodyModel[124].rotateAngleZ = -0.6981317F;

		bodyModel[125].addShapeBox(-8F, -1F, 0F, 8, 1, 1, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 11
		bodyModel[125].setRotationPoint(-28F, -33F, 4F);
		bodyModel[125].rotateAngleZ = 0.62831853F;

		bodyModel[126].addShapeBox(-8F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 12
		bodyModel[126].setRotationPoint(-28F, -33F, 4F);
		bodyModel[126].rotateAngleZ = 2.51327412F;

		bodyModel[127].addBox(-8F, -1F, 0F, 8, 1, 1, 0F); // Box 13
		bodyModel[127].setRotationPoint(-27F, -24.1F, 4F);
		bodyModel[127].rotateAngleZ = -2.44346095F;

		bodyModel[128].addBox(0F, 0F, 0F, 31, 20, 10, 0F); // Box 175
		bodyModel[128].setRotationPoint(-20F, -21F, -5F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F,-0.85F, -0.25F, 0F, -0.45F, -0.25F, 0F, -1.35F, -0.25F, 0F, 0F, -0.25F, 0F, -0.85F, -0.25F, 0F, -0.45F, -0.25F, 0F, -1.35F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 180
		bodyModel[129].setRotationPoint(-42.5F, -6.5F, 0F);
		bodyModel[129].rotateAngleX = -3.14159265F;
		bodyModel[129].rotateAngleY = -3.14159265F;

		bodyModel[130].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,-0.6F, -0.25F, -1F, -0.85F, -0.25F, -1F, -1.1F, -0.25F, 0.4F, -0.2F, -0.25F, 0F, -0.6F, -0.25F, -1F, -0.85F, -0.25F, -1F, -1.1F, -0.25F, 0.4F, -0.2F, -0.25F, 0F); // Box 181
		bodyModel[130].setRotationPoint(-41.5F, -7.5F, -7F);
		bodyModel[130].rotateAngleY = -3.14159265F;

		bodyModel[131].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F,-0.85F, -0.25F, 0F, -0.45F, -0.25F, 0F, -1.35F, -0.25F, 0F, 0F, -0.25F, 0F, -0.85F, -0.25F, 0F, -0.45F, -0.25F, 0F, -1.35F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 182
		bodyModel[131].setRotationPoint(-42.5F, -7.5F, 0F);
		bodyModel[131].rotateAngleY = -3.14159265F;

		bodyModel[132].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,-0.6F, -0.25F, -1F, -0.85F, -0.25F, -1F, -1.1F, -0.25F, 0.4F, -0.2F, -0.25F, 0F, -0.6F, -0.25F, -1F, -0.85F, -0.25F, -1F, -1.1F, -0.25F, 0.4F, -0.2F, -0.25F, 0F); // Box 183
		bodyModel[132].setRotationPoint(-41.5F, -6.5F, 7F);
		bodyModel[132].rotateAngleX = 3.14159265F;
		bodyModel[132].rotateAngleY = -3.14159265F;

		bodyModel[133].addBox(0F, 0F, 0F, 7, 20, 10, 0F); // Box 184
		bodyModel[133].setRotationPoint(17F, -21F, -5F);

		bodyModel[134].addBox(0F, 0F, 0F, 6, 2, 10, 0F); // Box 185
		bodyModel[134].setRotationPoint(11F, -21F, -5F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 149
		bodyModel[135].setRotationPoint(48.9F, -9F, -3F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 150
		bodyModel[136].setRotationPoint(48.25F, -12.99F, -2F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 151
		bodyModel[137].setRotationPoint(-43.25F, -12.99F, -2F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 152
		bodyModel[138].setRotationPoint(-43.9F, -9F, -3F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 153
		bodyModel[139].setRotationPoint(0F, -2F, -11.5F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 154
		bodyModel[140].setRotationPoint(0F, -2F, 10.5F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,1F, -0.25F, 0.6F, 0.4F, -0.25F, -0.6F, 0F, -0.25F, -2F, 1F, -0.25F, -2.5F, 1F, -0.25F, 0.6F, 0.4F, -0.25F, -0.6F, 0F, -0.25F, -2F, 1F, -0.25F, -2.5F); // Box 152
		bodyModel[141].setRotationPoint(46F, -7.5F, -11F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,1F, -0.25F, -2.5F, 0F, -0.25F, -2F, 0.4F, -0.25F, -0.6F, 1F, -0.25F, 0.6F, 1F, -0.25F, -2.5F, 0F, -0.25F, -2F, 0.4F, -0.25F, -0.6F, 1F, -0.25F, 0.6F); // Box 153
		bodyModel[142].setRotationPoint(46F, -7.5F, 8F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, -0.25F, -2F, 1F, -0.25F, -2.5F, 1F, -0.25F, 0.6F, 0.4F, -0.25F, -0.6F, 0F, -0.25F, -2F, 1F, -0.25F, -2.5F, 1F, -0.25F, 0.6F, 0.4F, -0.25F, -0.6F); // Box 154
		bodyModel[143].setRotationPoint(-42F, -7.5F, 8F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0.4F, -0.25F, -0.6F, 1F, -0.25F, 0.6F, 1F, -0.25F, -2.5F, 0F, -0.25F, -2F, 0.4F, -0.25F, -0.6F, 1F, -0.25F, 0.6F, 1F, -0.25F, -2.5F, 0F, -0.25F, -2F); // Box 155
		bodyModel[144].setRotationPoint(-42F, -7.5F, -11F);

		bodyModel[145].addBox(0F, 0F, 0F, 14, 1, 12, 0F); // Box 155
		bodyModel[145].setRotationPoint(27F, -24F, -6F);

		bodyModel[146].addShapeBox(-8F, -1F, 0F, 8, 1, 1, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 156
		bodyModel[146].setRotationPoint(34F, -33F, 4F);
		bodyModel[146].rotateAngleZ = 0.62831853F;

		bodyModel[147].addBox(0F, -8F, 0F, 2, 1, 12, 0F); // Box 157
		bodyModel[147].setRotationPoint(33F, -26F, -6F);

		bodyModel[148].addShapeBox(-8F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 158
		bodyModel[148].setRotationPoint(34F, -33F, 4F);
		bodyModel[148].rotateAngleZ = 2.51327412F;

		bodyModel[149].addBox(-8F, -1F, 0F, 8, 1, 1, 0F); // Box 159
		bodyModel[149].setRotationPoint(35F, -24.1F, 4F);
		bodyModel[149].rotateAngleZ = -2.44346095F;

		bodyModel[150].addBox(-8F, 0F, 0F, 8, 1, 1, 0F); // Box 160
		bodyModel[150].setRotationPoint(33F, -24.1F, 4F);
		bodyModel[150].rotateAngleZ = -0.6981317F;

		bodyModel[151].addBox(-8F, 0F, 0F, 8, 1, 1, 0F); // Box 161
		bodyModel[151].setRotationPoint(33F, -24.1F, -5F);
		bodyModel[151].rotateAngleZ = -0.6981317F;

		bodyModel[152].addShapeBox(-8F, -1F, 0F, 8, 1, 1, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 162
		bodyModel[152].setRotationPoint(34F, -33F, -5F);
		bodyModel[152].rotateAngleZ = 0.62831853F;

		bodyModel[153].addBox(-8F, -1F, 0F, 8, 1, 1, 0F); // Box 163
		bodyModel[153].setRotationPoint(35F, -24.1F, -5F);
		bodyModel[153].rotateAngleZ = -2.44346095F;

		bodyModel[154].addShapeBox(-8F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 164
		bodyModel[154].setRotationPoint(34F, -33F, -5F);
		bodyModel[154].rotateAngleZ = 2.51327412F;

		bodyModel[155].addBox(0F, 0F, 0F, 4, 2, 2, 0F); // Box 181
		bodyModel[155].setRotationPoint(50F, 2F, -1F);

		bodyModel[156].addBox(0F, 0F, 0F, 4, 2, 2, 0F); // Box 182
		bodyModel[156].setRotationPoint(-48F, 2F, -1F);
	}

	private ModelE10Bogie trucks = new ModelE10Bogie();
	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		for (ModelRendererTurbo mrt : bodyModel) {
			if (mrt.boxName.equals("lamp")) {
				Minecraft.getMinecraft().entityRenderer.disableLightmap(1D);
				mrt.render(f5, false);
				Minecraft.getMinecraft().entityRenderer.enableLightmap(1D);
			} else {
				mrt.render(f5, false);
			}
		}

		Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/e10_Bogie.png"));
		GL11.glPushMatrix();
		GL11.glTranslated(-1.6,0.15,-0.375);
		trucks.render(entity,f,f1,f2,f3,f4,f5);

		GL11.glTranslated(3.3,0,0);
		trucks.render(entity,f,f1,f2,f3,f4,f5);
		GL11.glPopMatrix();
	}

}