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
import tmt.ModelBase;
import tmt.ModelRendererTurbo;
import tmt.Tessellator;
import train.common.library.Info;

public class ModelE10DB extends ModelBase
{
	int textureX = 256;
	int textureY = 256;

	public ModelE10DB()
	{
		e10dbModel = new ModelRendererTurbo[135];
		e10dbModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 190
		e10dbModel[1] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 191
		e10dbModel[2] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 192
		e10dbModel[3] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 193
		e10dbModel[4] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 219
		e10dbModel[5] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 220
		e10dbModel[6] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 221
		e10dbModel[7] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 222
		e10dbModel[8] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 184
		e10dbModel[9] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 12
		e10dbModel[10] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 23
		e10dbModel[11] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 25
		e10dbModel[12] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 26
		e10dbModel[13] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 27
		e10dbModel[14] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 30
		e10dbModel[15] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 34
		e10dbModel[16] = new ModelRendererTurbo(this, 121, 1, textureX, textureY, "lamp"); // Box 35
		e10dbModel[17] = new ModelRendererTurbo(this, 129, 1, textureX, textureY, "lamp"); // Box 36
		e10dbModel[18] = new ModelRendererTurbo(this, 137, 1, textureX, textureY, "lamp"); // Box 37
		e10dbModel[19] = new ModelRendererTurbo(this, 145, 1, textureX, textureY, "lamp"); // Box 38
		e10dbModel[20] = new ModelRendererTurbo(this, 153, 57, textureX, textureY); // Box 39
		e10dbModel[21] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Box 41
		e10dbModel[22] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 42
		e10dbModel[23] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 43
		e10dbModel[24] = new ModelRendererTurbo(this, 201, 89, textureX, textureY); // Box 44
		e10dbModel[25] = new ModelRendererTurbo(this, 65, 206, textureX, textureY); // Box 45
		e10dbModel[26] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 54
		e10dbModel[27] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 55
		e10dbModel[28] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 56
		e10dbModel[29] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 57
		e10dbModel[30] = new ModelRendererTurbo(this, 201, 1, textureX, textureY, "lamp"); // Box 58
		e10dbModel[31] = new ModelRendererTurbo(this, 209, 1, textureX, textureY, "lamp"); // Box 59
		e10dbModel[32] = new ModelRendererTurbo(this, 217, 1, textureX, textureY, "lamp"); // Box 60
		e10dbModel[33] = new ModelRendererTurbo(this, 233, 1, textureX, textureY, "lamp"); // Box 61
		e10dbModel[34] = new ModelRendererTurbo(this, 185, 137, textureX, textureY); // Box 50
		e10dbModel[35] = new ModelRendererTurbo(this, 1, 145, textureX, textureY); // Box 51
		e10dbModel[36] = new ModelRendererTurbo(this, 76, 206, textureX, textureY); // Box 53
		e10dbModel[37] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 54
		e10dbModel[38] = new ModelRendererTurbo(this, 105, 169, textureX, textureY); // Box 55
		e10dbModel[39] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 56
		e10dbModel[40] = new ModelRendererTurbo(this, 201, 9, textureX, textureY); // Box 59
		e10dbModel[41] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 60
		e10dbModel[42] = new ModelRendererTurbo(this, 169, 177, textureX, textureY); // Box 65
		e10dbModel[43] = new ModelRendererTurbo(this, 1, 185, textureX, textureY); // Box 66
		e10dbModel[44] = new ModelRendererTurbo(this, 97, 145, textureX, textureY); // Box 0
		e10dbModel[45] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 1
		e10dbModel[46] = new ModelRendererTurbo(this, 217, 41, textureX, textureY); // Box 2
		e10dbModel[47] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 3
		e10dbModel[48] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 4
		e10dbModel[49] = new ModelRendererTurbo(this, 65, 9, textureX, textureY); // Box 5
		e10dbModel[50] = new ModelRendererTurbo(this, 129, 9, textureX, textureY); // Box 6
		e10dbModel[51] = new ModelRendererTurbo(this, 233, 17, textureX, textureY); // Box 7
		e10dbModel[52] = new ModelRendererTurbo(this, 241, 41, textureX, textureY); // Box 8
		e10dbModel[53] = new ModelRendererTurbo(this, 177, 49, textureX, textureY); // Box 9
		e10dbModel[54] = new ModelRendererTurbo(this, 41, 185, textureX, textureY); // Box 0
		e10dbModel[55] = new ModelRendererTurbo(this, 217, 57, textureX, textureY); // Box 2
		e10dbModel[56] = new ModelRendererTurbo(this, 193, 49, textureX, textureY); // Box 10
		e10dbModel[57] = new ModelRendererTurbo(this, 209, 49, textureX, textureY); // Box 11
		e10dbModel[58] = new ModelRendererTurbo(this, 241, 49, textureX, textureY); // Box 14
		e10dbModel[59] = new ModelRendererTurbo(this, 241, 57, textureX, textureY); // Box 15
		e10dbModel[60] = new ModelRendererTurbo(this, 241, 65, textureX, textureY); // Box 10
		e10dbModel[61] = new ModelRendererTurbo(this, 217, 73, textureX, textureY); // Box 11
		e10dbModel[62] = new ModelRendererTurbo(this, 233, 73, textureX, textureY); // Box 12
		e10dbModel[63] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 13
		e10dbModel[64] = new ModelRendererTurbo(this, 41, 145, textureX, textureY); // Box 88
		e10dbModel[65] = new ModelRendererTurbo(this, 249, 73, textureX, textureY); // Box 89
		e10dbModel[66] = new ModelRendererTurbo(this, 17, 81, textureX, textureY); // Box 90
		e10dbModel[67] = new ModelRendererTurbo(this, 201, 81, textureX, textureY); // Box 91
		e10dbModel[68] = new ModelRendererTurbo(this, 233, 81, textureX, textureY); // Box 92
		e10dbModel[69] = new ModelRendererTurbo(this, 241, 81, textureX, textureY); // Box 93
		e10dbModel[70] = new ModelRendererTurbo(this, 185, 113, textureX, textureY); // Box 94
		e10dbModel[71] = new ModelRendererTurbo(this, 193, 113, textureX, textureY); // Box 95
		e10dbModel[72] = new ModelRendererTurbo(this, 225, 129, textureX, textureY); // Box 96
		e10dbModel[73] = new ModelRendererTurbo(this, 233, 129, textureX, textureY); // Box 97
		e10dbModel[74] = new ModelRendererTurbo(this, 201, 89, textureX, textureY); // Box 98
		e10dbModel[75] = new ModelRendererTurbo(this, 201, 97, textureX, textureY); // Box 99
		e10dbModel[76] = new ModelRendererTurbo(this, 233, 105, textureX, textureY); // Box 100
		e10dbModel[77] = new ModelRendererTurbo(this, 201, 129, textureX, textureY); // Box 101
		e10dbModel[78] = new ModelRendererTurbo(this, 185, 137, textureX, textureY); // Box 102
		e10dbModel[79] = new ModelRendererTurbo(this, 1, 145, textureX, textureY); // Box 103
		e10dbModel[80] = new ModelRendererTurbo(this, 1, 153, textureX, textureY); // Box 104
		e10dbModel[81] = new ModelRendererTurbo(this, 225, 153, textureX, textureY); // Box 105
		e10dbModel[82] = new ModelRendererTurbo(this, 1, 161, textureX, textureY); // Box 106
		e10dbModel[83] = new ModelRendererTurbo(this, 41, 161, textureX, textureY); // Box 107
		e10dbModel[84] = new ModelRendererTurbo(this, 65, 161, textureX, textureY); // Box 108
		e10dbModel[85] = new ModelRendererTurbo(this, 121, 193, textureX, textureY); // Box 126
		e10dbModel[86] = new ModelRendererTurbo(this, 169, 217, textureX, textureY); // Box 171
		e10dbModel[87] = new ModelRendererTurbo(this, 209, 177, textureX, textureY); // Box 165
		e10dbModel[88] = new ModelRendererTurbo(this, 105, 193, textureX, textureY); // Box 164
		e10dbModel[89] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 163
		e10dbModel[90] = new ModelRendererTurbo(this, 1, 185, textureX, textureY); // Box 137
		e10dbModel[91] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 139
		e10dbModel[92] = new ModelRendererTurbo(this, 209, 217, textureX, textureY); // Box 140
		e10dbModel[93] = new ModelRendererTurbo(this, 97, 161, textureX, textureY); // Box 128
		e10dbModel[94] = new ModelRendererTurbo(this, 113, 161, textureX, textureY); // Box 129
		e10dbModel[95] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 130
		e10dbModel[96] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 131
		e10dbModel[97] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 132
		e10dbModel[98] = new ModelRendererTurbo(this, 145, 9, textureX, textureY); // Box 133
		e10dbModel[99] = new ModelRendererTurbo(this, 217, 57, textureX, textureY); // Box 134
		e10dbModel[100] = new ModelRendererTurbo(this, 137, 9, textureX, textureY); // Box 135
		e10dbModel[101] = new ModelRendererTurbo(this, 233, 193, textureX, textureY); // Box 136
		e10dbModel[102] = new ModelRendererTurbo(this, 169, 217, textureX, textureY); // Box 137
		e10dbModel[103] = new ModelRendererTurbo(this, 129, 161, textureX, textureY); // Box 138
		e10dbModel[104] = new ModelRendererTurbo(this, 201, 9, textureX, textureY); // Box 140
		e10dbModel[105] = new ModelRendererTurbo(this, 233, 145, textureX, textureY); // Box 142
		e10dbModel[106] = new ModelRendererTurbo(this, 241, 17, textureX, textureY); // Box 143
		e10dbModel[107] = new ModelRendererTurbo(this, 217, 65, textureX, textureY); // Box 144
		e10dbModel[108] = new ModelRendererTurbo(this, 217, 9, textureX, textureY); // Box 145
		e10dbModel[109] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 146
		e10dbModel[110] = new ModelRendererTurbo(this, 209, 193, textureX, textureY); // Box 150
		e10dbModel[111] = new ModelRendererTurbo(this, 17, 25, textureX, textureY); // Box 151
		e10dbModel[112] = new ModelRendererTurbo(this, 225, 81, textureX, textureY); // Box 152
		e10dbModel[113] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 153
		e10dbModel[114] = new ModelRendererTurbo(this, 241, 129, textureX, textureY); // Box 154
		e10dbModel[115] = new ModelRendererTurbo(this, 241, 137, textureX, textureY); // Box 156
		e10dbModel[116] = new ModelRendererTurbo(this, 225, 209, textureX, textureY); // Box 157
		e10dbModel[117] = new ModelRendererTurbo(this, 1, 225, textureX, textureY); // Box 158
		e10dbModel[118] = new ModelRendererTurbo(this, 9, 89, textureX, textureY); // Box 159
		e10dbModel[119] = new ModelRendererTurbo(this, 41, 225, textureX, textureY); // Box 160
		e10dbModel[120] = new ModelRendererTurbo(this, 57, 225, textureX, textureY); // Box 161
		e10dbModel[121] = new ModelRendererTurbo(this, 241, 97, textureX, textureY); // Box 162
		e10dbModel[122] = new ModelRendererTurbo(this, 73, 145, textureX, textureY); // Box 163
		e10dbModel[123] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 164
		e10dbModel[124] = new ModelRendererTurbo(this, 177, 113, textureX, textureY); // Box 165
		e10dbModel[125] = new ModelRendererTurbo(this, 1, 201, textureX, textureY); // Box 166
		e10dbModel[126] = new ModelRendererTurbo(this, 1, 233, textureX, textureY); // Box 167
		e10dbModel[127] = new ModelRendererTurbo(this, 249, 129, textureX, textureY); // Box 168
		e10dbModel[128] = new ModelRendererTurbo(this, 129, 161, textureX, textureY); // Box 170
		e10dbModel[129] = new ModelRendererTurbo(this, 129, 161, textureX, textureY); // Box 171
		e10dbModel[130] = new ModelRendererTurbo(this, 129, 161, textureX, textureY); // Box 172
		e10dbModel[131] = new ModelRendererTurbo(this, 121, 193, textureX, textureY); // Box 173
		e10dbModel[132] = new ModelRendererTurbo(this, 169, 217, textureX, textureY); // Box 135
		e10dbModel[133] = new ModelRendererTurbo(this, 86, 206, textureX, textureY); // Box 136
		e10dbModel[134] = new ModelRendererTurbo(this, 97, 206, textureX, textureY); // Box 137

		e10dbModel[0].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 190
		e10dbModel[0].setRotationPoint(40F, 0F, -8.5F);

		e10dbModel[1].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 191
		e10dbModel[1].setRotationPoint(40F, 0F, 5.5F);

		e10dbModel[2].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 192
		e10dbModel[2].setRotationPoint(37F, 1F, 6.5F);

		e10dbModel[3].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 193
		e10dbModel[3].setRotationPoint(37F, 1F, -7.5F);

		e10dbModel[4].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 219
		e10dbModel[4].setRotationPoint(-54F, 1F, -7.5F);

		e10dbModel[5].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 220
		e10dbModel[5].setRotationPoint(-55F, 0F, -8.5F);

		e10dbModel[6].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 221
		e10dbModel[6].setRotationPoint(-55F, 0F, 5.5F);

		e10dbModel[7].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 222
		e10dbModel[7].setRotationPoint(-54F, 1F, 6.5F);

		e10dbModel[8].addBox(0F, 0F, 0F, 86, 1, 24, 0F); // Box 184
		e10dbModel[8].setRotationPoint(-50F, 4F, -12F);

		e10dbModel[9].addBox(0F, 0F, 0F, 84, 25, 1, 0F); // Box 12
		e10dbModel[9].setRotationPoint(-49F, -21F, -12F);

		e10dbModel[10].addShapeBox(0F, 0F, 0F, 1, 15, 24, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 23
		e10dbModel[10].setRotationPoint(-51F, -10F, -12F);

		e10dbModel[11].addBox(0F, 0F, 0F, 1, 14, 1, 0F); // Box 25
		e10dbModel[11].setRotationPoint(-50F, -10F, -12F);

		e10dbModel[12].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		e10dbModel[12].setRotationPoint(-50F, -21F, -12F);

		e10dbModel[13].addShapeBox(0F, 0F, 0F, 84, 1, 24, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
		e10dbModel[13].setRotationPoint(-49F, -22F, -12F);

		e10dbModel[14].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -0.5F, 0F, -1.5F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 30
		e10dbModel[14].setRotationPoint(-50F, -22F, 4F);

		e10dbModel[15].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, -0.1F, -0.1F, 1F, -0.1F, -0.1F, 1F, -0.1F, -0.1F, -0.5F, -0.1F, -0.1F, -0.5F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, -0.5F, -0.1F, -0.1F); // Box 34
		e10dbModel[15].setRotationPoint(-51.2F, -22.1F, -0.5F);

		e10dbModel[16].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, -0.5F, -0.1F, -0.1F, -0.5F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, -0.5F, -0.1F, -0.1F); // Box 35
		e10dbModel[16].setRotationPoint(-52.25F, -2.8F, -9F);

		e10dbModel[17].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, -0.5F, -0.1F, -0.1F, -0.5F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, -0.5F, -0.1F, -0.1F); // Box 36
		e10dbModel[17].setRotationPoint(-52.25F, -4.5F, -9F);

		e10dbModel[18].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, -0.5F, -0.1F, -0.1F, -0.5F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, -0.5F, -0.1F, -0.1F); // Box 37
		e10dbModel[18].setRotationPoint(-52.25F, -2.8F, 8F);

		e10dbModel[19].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, -0.5F, -0.1F, -0.1F, -0.5F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, -0.5F, -0.1F, -0.1F); // Box 38
		e10dbModel[19].setRotationPoint(-52.25F, -4.5F, 8F);

		e10dbModel[20].addBox(0F, 0F, 0F, 19, 2, 21, 0F); // Box 39
		e10dbModel[20].setRotationPoint(-17F, 5F, -11F);

		e10dbModel[21].addBox(0F, 0F, 0F, 84, 25, 1, 0F); // Box 41
		e10dbModel[21].setRotationPoint(35F, -21F, 12F);
		e10dbModel[21].rotateAngleY = -3.14159265F;

		e10dbModel[22].addBox(0F, 0F, 0F, 1, 14, 1, 0F); // Box 42
		e10dbModel[22].setRotationPoint(-50F, -10F, 11F);

		e10dbModel[23].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
		e10dbModel[23].setRotationPoint(-50F, -21F, 11F);

		e10dbModel[24].addShapeBox(0F, 0F, 0F, 1, 15, 24, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 44
		e10dbModel[24].setRotationPoint(37F, -10F, 12F);
		e10dbModel[24].rotateAngleY = -3.14159265F;

		e10dbModel[25].addShapeBox(0F, 0F, 0F, 2, 11, 2, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, 0F); // Box 45
		e10dbModel[25].setRotationPoint(35F, -21F, 10F);

		e10dbModel[26].addBox(0F, 0F, 0F, 1, 14, 1, 0F); // Box 54
		e10dbModel[26].setRotationPoint(35F, -10F, 11F);

		e10dbModel[27].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 55
		e10dbModel[27].setRotationPoint(36F, -21F, 12F);
		e10dbModel[27].rotateAngleY = -3.14159265F;

		e10dbModel[28].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 56
		e10dbModel[28].setRotationPoint(36F, -21F, -11F);
		e10dbModel[28].rotateAngleY = -3.14159265F;

		e10dbModel[29].addBox(0F, 0F, 0F, 1, 14, 1, 0F); // Box 57
		e10dbModel[29].setRotationPoint(35F, -10F, -12F);

		e10dbModel[30].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, -0.5F, -0.1F, -0.1F, -0.5F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, -0.5F, -0.1F, -0.1F); // Box 58
		e10dbModel[30].setRotationPoint(38.25F, -2.8F, 9F);
		e10dbModel[30].rotateAngleY = -3.14159265F;

		e10dbModel[31].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, -0.5F, -0.1F, -0.1F, -0.5F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, -0.5F, -0.1F, -0.1F); // Box 59
		e10dbModel[31].setRotationPoint(38.25F, -4.5F, 9F);
		e10dbModel[31].rotateAngleY = -3.14159265F;

		e10dbModel[32].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, -0.5F, -0.1F, -0.1F, -0.5F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, -0.5F, -0.1F, -0.1F); // Box 60
		e10dbModel[32].setRotationPoint(38.25F, -4.5F, -8F);
		e10dbModel[32].rotateAngleY = -3.14159265F;

		e10dbModel[33].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, -0.5F, -0.1F, -0.1F, -0.5F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, -0.5F, -0.1F, -0.1F); // Box 61
		e10dbModel[33].setRotationPoint(38.25F, -2.8F, -8F);
		e10dbModel[33].rotateAngleY = -3.14159265F;

		e10dbModel[34].addShapeBox(0F, 0F, 0F, 7, 11, 22, 0F, 0F, 0F, -7F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, -7F, 1F, 0F, -7F, -7F, 0F, 0F, -7F, 0F, 0F, 1F, 0F, -7F); // Box 50
		e10dbModel[34].setRotationPoint(-51F, -21F, -11F);

		e10dbModel[35].addShapeBox(0F, 0F, 0F, 7, 15, 22, 0F, 1F, 0F, -7F, -7F, 0F, 0F, -7F, 0F, 0F, 1F, 0F, -7F, 1F, 0F, -7F, -7F, 0F, 0F, -7F, 0F, 0F, 1F, 0F, -7F); // Box 51
		e10dbModel[35].setRotationPoint(-51F, -10F, -11F);

		e10dbModel[36].addShapeBox(0F, 0F, 0F, 2, 11, 2, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F); // Box 53
		e10dbModel[36].setRotationPoint(-51F, -21F, -12F);

		e10dbModel[37].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F, -0.5F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 54
		e10dbModel[37].setRotationPoint(-50F, -22F, -12F);

		e10dbModel[38].addShapeBox(0F, 0F, 0F, 24, 3, 16, 0F, -1F, -1F, -1F, -1F, -1F, -1F, -1F, -1F, -1F, -1F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 55
		e10dbModel[38].setRotationPoint(-27F, -25F, -8F);

		e10dbModel[39].addShapeBox(-1F, 0F, 0F, 2, 1, 8, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 56
		e10dbModel[39].setRotationPoint(-50F, -22F, -4F);

		e10dbModel[40].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F, -0.5F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 59
		e10dbModel[40].setRotationPoint(36F, -22F, 12F);
		e10dbModel[40].rotateAngleY = -3.14159265F;

		e10dbModel[41].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -0.5F, 0F, -1.5F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 60
		e10dbModel[41].setRotationPoint(36F, -22F, -4F);
		e10dbModel[41].rotateAngleY = -3.14159265F;

		e10dbModel[42].addShapeBox(0F, 0F, 0F, 7, 11, 22, 0F, 0F, 0F, -7F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, -7F, 1F, 0F, -7F, -7F, 0F, 0F, -7F, 0F, 0F, 1F, 0F, -7F); // Box 65
		e10dbModel[42].setRotationPoint(37F, -21F, 11F);
		e10dbModel[42].rotateAngleY = -3.14159265F;

		e10dbModel[43].addShapeBox(0F, 0F, 0F, 7, 15, 22, 0F, 1F, 0F, -7F, -7F, 0F, 0F, -7F, 0F, 0F, 1F, 0F, -7F, 1F, 0F, -7F, -7F, 0F, 0F, -7F, 0F, 0F, 1F, 0F, -7F); // Box 66
		e10dbModel[43].setRotationPoint(37F, -10F, 11F);
		e10dbModel[43].rotateAngleY = -3.14159265F;

		e10dbModel[44].addBox(0F, 0F, 0F, 14, 1, 12, 0F); // Box 0
		e10dbModel[44].setRotationPoint(-45F, -23F, -6F);

		e10dbModel[45].addBox(0F, 0F, 0F, 5, 1, 0, 0F); // Box 1
		e10dbModel[45].setRotationPoint(-46F, -24F, -6F);

		e10dbModel[46].addBox(0F, 0F, 0F, 2, 1, 12, 0F); // Box 2
		e10dbModel[46].setRotationPoint(-39F, -24.9F, -6F);

		e10dbModel[47].addBox(0F, 0F, 0F, 5, 1, 0, 0F); // Box 3
		e10dbModel[47].setRotationPoint(-35F, -24F, -6F);

		e10dbModel[48].addBox(0F, 0F, 0F, 5, 1, 0, 0F); // Box 4
		e10dbModel[48].setRotationPoint(-35F, -24F, 6F);

		e10dbModel[49].addBox(0F, 0F, 0F, 5, 1, 0, 0F); // Box 5
		e10dbModel[49].setRotationPoint(-46F, -24F, 6F);

		e10dbModel[50].addShapeBox(0F, 0F, 0F, 5, 1, 0, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		e10dbModel[50].setRotationPoint(-44F, -25F, -6F);

		e10dbModel[51].addShapeBox(0F, 0F, 0F, 5, 1, 0, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 7
		e10dbModel[51].setRotationPoint(-37F, -25F, -6F);

		e10dbModel[52].addShapeBox(0F, 0F, 0F, 5, 1, 0, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		e10dbModel[52].setRotationPoint(-37F, -25F, 6F);

		e10dbModel[53].addShapeBox(0F, 0F, 0F, 5, 1, 0, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 9
		e10dbModel[53].setRotationPoint(-44F, -25F, 6F);

		e10dbModel[54].addBox(0F, 0F, 0F, 14, 1, 12, 0F); // Box 0
		e10dbModel[54].setRotationPoint(17F, -23F, -6F);

		e10dbModel[55].addBox(0F, 0F, 0F, 2, 1, 12, 0F); // Box 2
		e10dbModel[55].setRotationPoint(23F, -33.9F, -6F);

		e10dbModel[56].addShapeBox(0F, 0F, 0F, 7, 1, 0, 0F, 0F, 4.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 4.5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F); // Box 10
		e10dbModel[56].setRotationPoint(25F, -29F, -6F);

		e10dbModel[57].addShapeBox(0F, 0F, 0F, 6, 1, 0, 0F, 0F, -1F, 0F, 0F, 4.5F, 0F, 0F, 4.5F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, -4.5F, 0F, 0F, -4.5F, 0F, -1F, 0F, 0F); // Box 11
		e10dbModel[57].setRotationPoint(26F, -24F, -6F);

		e10dbModel[58].addShapeBox(0F, 0F, 0F, 6, 1, 0, 0F, 0F, -1F, 0F, 0F, 4.5F, 0F, 0F, 4.5F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, -4.5F, 0F, 0F, -4.5F, 0F, -1F, 0F, 0F); // Box 14
		e10dbModel[58].setRotationPoint(22F, -24F, -6F);
		e10dbModel[58].rotateAngleY = -3.14159265F;

		e10dbModel[59].addShapeBox(0F, 0F, 0F, 7, 1, 0, 0F, 0F, 4.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 4.5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F); // Box 15
		e10dbModel[59].setRotationPoint(23F, -29F, 6F);
		e10dbModel[59].rotateAngleY = -3.14159265F;

		e10dbModel[60].addShapeBox(0F, 0F, 0F, 6, 1, 0, 0F, 0F, -1F, 0F, 0F, 4.5F, 0F, 0F, 4.5F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, -4.5F, 0F, 0F, -4.5F, 0F, -1F, 0F, 0F); // Box 10
		e10dbModel[60].setRotationPoint(22F, -24F, 6F);
		e10dbModel[60].rotateAngleY = -3.14159265F;

		e10dbModel[61].addShapeBox(0F, 0F, 0F, 6, 1, 0, 0F, 0F, -1F, 0F, 0F, 4.5F, 0F, 0F, 4.5F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, -4.5F, 0F, 0F, -4.5F, 0F, -1F, 0F, 0F); // Box 11
		e10dbModel[61].setRotationPoint(26F, -24F, 6F);

		e10dbModel[62].addShapeBox(0F, 0F, 0F, 7, 1, 0, 0F, 0F, 4.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 4.5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F); // Box 12
		e10dbModel[62].setRotationPoint(25F, -29F, 6F);

		e10dbModel[63].addShapeBox(0F, 0F, 0F, 7, 1, 0, 0F, 0F, 4.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 4.5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F); // Box 13
		e10dbModel[63].setRotationPoint(23F, -29F, -6F);
		e10dbModel[63].rotateAngleY = -3.14159265F;

		e10dbModel[64].addShapeBox(0F, 0F, 0F, 7, 3, 12, 0F, -1F, -1F, -1F, -1F, -1F, -1F, -1F, -1F, -1F, -1F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 88
		e10dbModel[64].setRotationPoint(2F, -25F, -6F);

		e10dbModel[65].addBox(0F, 0F, 0F, 0, 16, 1, 0F); // Box 89
		e10dbModel[65].setRotationPoint(26F, -15F, 12F);

		e10dbModel[66].addBox(0F, 0F, 0F, 0, 16, 1, 0F); // Box 90
		e10dbModel[66].setRotationPoint(19F, -15F, -13F);

		e10dbModel[67].addShapeBox(0F, 0F, 0F, 7, 4, 1, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 91
		e10dbModel[67].setRotationPoint(-31F, -19F, -13F);

		e10dbModel[68].addShapeBox(0F, 0F, 0F, 0, 16, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 92
		e10dbModel[68].setRotationPoint(-40F, -15F, -13F);

		e10dbModel[69].addBox(0F, 0F, 0F, 0, 16, 1, 0F); // Box 93
		e10dbModel[69].setRotationPoint(-33F, -15F, -13F);

		e10dbModel[70].addBox(0F, 0F, 0F, 0, 16, 1, 0F); // Box 94
		e10dbModel[70].setRotationPoint(-40F, -15F, 12F);

		e10dbModel[71].addBox(0F, 0F, 0F, 0, 16, 1, 0F); // Box 95
		e10dbModel[71].setRotationPoint(-33F, -15F, 12F);

		e10dbModel[72].addBox(0F, 0F, 0F, 0, 16, 1, 0F); // Box 96
		e10dbModel[72].setRotationPoint(19F, -15F, 12F);

		e10dbModel[73].addBox(0F, 0F, 0F, 0, 16, 1, 0F); // Box 97
		e10dbModel[73].setRotationPoint(26F, -15F, -13F);

		e10dbModel[74].addShapeBox(0F, 0F, 0F, 7, 4, 1, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 98
		e10dbModel[74].setRotationPoint(10F, -19F, -13F);

		e10dbModel[75].addShapeBox(0F, 0F, 0F, 7, 4, 1, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 99
		e10dbModel[75].setRotationPoint(2F, -19F, -13F);

		e10dbModel[76].addShapeBox(0F, 0F, 0F, 7, 4, 1, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 100
		e10dbModel[76].setRotationPoint(-23F, -19F, -13F);

		e10dbModel[77].addShapeBox(0F, 0F, 0F, 7, 4, 1, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 101
		e10dbModel[77].setRotationPoint(-15F, -19F, -13F);

		e10dbModel[78].addShapeBox(0F, 0F, 0F, 7, 4, 1, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 102
		e10dbModel[78].setRotationPoint(-6F, -19F, -13F);

		e10dbModel[79].addShapeBox(0F, 0F, 0F, 7, 4, 1, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 103
		e10dbModel[79].setRotationPoint(17F, -19F, 13F);
		e10dbModel[79].rotateAngleY = -3.14159265F;

		e10dbModel[80].addShapeBox(0F, 0F, 0F, 7, 4, 1, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 104
		e10dbModel[80].setRotationPoint(9F, -19F, 13F);
		e10dbModel[80].rotateAngleY = -3.14159265F;

		e10dbModel[81].addShapeBox(0F, 0F, 0F, 7, 4, 1, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 105
		e10dbModel[81].setRotationPoint(1F, -19F, 13F);
		e10dbModel[81].rotateAngleY = -3.14159265F;

		e10dbModel[82].addShapeBox(0F, 0F, 0F, 7, 4, 1, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 106
		e10dbModel[82].setRotationPoint(-8F, -19F, 13F);
		e10dbModel[82].rotateAngleY = -3.14159265F;

		e10dbModel[83].addShapeBox(0F, 0F, 0F, 7, 4, 1, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 107
		e10dbModel[83].setRotationPoint(-16F, -19F, 13F);
		e10dbModel[83].rotateAngleY = -3.14159265F;

		e10dbModel[84].addShapeBox(0F, 0F, 0F, 7, 4, 1, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 108
		e10dbModel[84].setRotationPoint(-24F, -19F, 13F);
		e10dbModel[84].rotateAngleY = -3.14159265F;

		e10dbModel[85].addBox(0F, 0F, 0F, 1, 25, 22, 0F); // Box 126
		e10dbModel[85].setRotationPoint(17F, -21F, -11F);

		e10dbModel[86].addBox(0F, 0F, 0F, 8, 1, 22, 0F); // Box 171
		e10dbModel[86].setRotationPoint(-50F, -7F, -11F);

		e10dbModel[87].addShapeBox(0F, 0F, 0F, 1, 3, 9, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F); // Box 165
		e10dbModel[87].setRotationPoint(-50F, -10F, 2F);

		e10dbModel[88].addBox(0F, 0F, 0F, 8, 3, 9, 0F); // Box 164
		e10dbModel[88].setRotationPoint(-50F, -10F, -11F);

		e10dbModel[89].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F, 0.2F, 0F, 0F, 2.25F, 0F, 0F, -0.75F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F); // Box 163
		e10dbModel[89].setRotationPoint(-49.8F, -10F, -2F);

		e10dbModel[90].addShapeBox(0F, 0F, 0F, 1, 3, 9, 0F, 0.1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.1F, 0F, 0F); // Box 137
		e10dbModel[90].setRotationPoint(35.9F, -10F, -2F);
		e10dbModel[90].rotateAngleY = -3.14159265F;

		e10dbModel[91].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F, 0.3F, 0F, 0F, 2.2F, 0F, 0F, -0.75F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F); // Box 139
		e10dbModel[91].setRotationPoint(35.7F, -10F, 2F);
		e10dbModel[91].rotateAngleY = -3.14159265F;

		e10dbModel[92].addBox(0F, 0F, 0F, 8, 3, 9, 0F); // Box 140
		e10dbModel[92].setRotationPoint(28F, -10F, 2F);

		e10dbModel[93].addShapeBox(0F, 0F, 0F, 7, 0, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		e10dbModel[93].setRotationPoint(-50F, -11F, -13F);

		e10dbModel[94].addShapeBox(0F, 0F, 0F, 7, 0, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 129
		e10dbModel[94].setRotationPoint(-43F, -11F, 13F);
		e10dbModel[94].rotateAngleY = -3.14159265F;

		e10dbModel[95].addShapeBox(0F, 0F, 0F, 2, 0, 1, 0F, -0.5F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, 0.1F, -1.1F, 0F, 1F, -0.5F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, 0.1F, -1.1F, 0F, 1F); // Box 130
		e10dbModel[95].setRotationPoint(-52F, -11F, -13F);

		e10dbModel[96].addShapeBox(0F, 0F, 0F, 2, 0, 7, 0F, -1.5F, 0F, 0F, 0.1F, 0F, 0F, -0.9F, 0F, 0F, -0.6F, 0F, 0F, -1.5F, 0F, 0F, 0.1F, 0F, 0F, -0.9F, 0F, 0F, -0.6F, 0F, 0F); // Box 131
		e10dbModel[96].setRotationPoint(-53F, -11F, -11F);

		e10dbModel[97].addShapeBox(0F, 0F, 0F, 2, 0, 1, 0F, -0.5F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, 0.1F, -1.1F, 0F, 1F, -0.5F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, 0.1F, -1.1F, 0F, 1F); // Box 132
		e10dbModel[97].setRotationPoint(-52F, -2F, -13F);

		e10dbModel[98].addShapeBox(0F, 0F, 0F, 2, 0, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 133
		e10dbModel[98].setRotationPoint(-50F, -2F, -13F);

		e10dbModel[99].addShapeBox(0F, 0F, 0F, 2, 0, 2, 0F, -1.5F, 0F, 0F, 0.1F, 0F, 0F, -0.25F, 0F, 0F, -1.25F, 0F, 0F, -1.5F, 0F, 0F, 0.1F, 0F, 0F, -0.25F, 0F, 0F, -1.25F, 0F, 0F); // Box 134
		e10dbModel[99].setRotationPoint(-53F, -2F, -11F);

		e10dbModel[100].addShapeBox(0F, 0F, 0F, 2, 0, 4, 0F, -1.15F, 0F, 0F, -0.4F, 0F, 0F, -1F, 0F, 0F, -0.6F, 0F, 0F, -1.15F, 0F, 0F, -0.4F, 0F, 0F, -1F, 0F, 0F, -0.6F, 0F, 0F); // Box 135
		e10dbModel[100].setRotationPoint(-53F, -2F, -8F);

		e10dbModel[101].addShapeBox(0F, 0F, 0F, 1, 0, 8, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F); // Box 136
		e10dbModel[101].setRotationPoint(-53F, -2F, -4F);

		e10dbModel[102].addShapeBox(0F, 0F, 0F, 1, 0, 8, 0F, -0.6F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, -0.6F, 0F, 0F); // Box 137
		e10dbModel[102].setRotationPoint(-53F, -11F, -4F);

		e10dbModel[103].addShapeBox(0F, 0F, 0F, 7, 4, 1, 0F, -0.7F, -0.5F, 0F, -0.7F, -0.5F, 0F, -0.7F, -0.5F, 0F, -0.7F, -0.5F, 0F, -0.7F, -0.5F, 0F, -0.7F, -0.5F, 0F, -0.7F, -0.5F, 0F, -0.7F, -0.5F, 0F); // Box 138
		e10dbModel[103].setRotationPoint(-40F, 2F, -13F);

		e10dbModel[104].addShapeBox(0F, 0F, 0F, 1, 0, 2, 0F, -0.5F, 0F, 0F, 0.1F, 0F, 0F, 1F, 0F, -1.1F, -2F, 0F, -0.5F, -0.5F, 0F, 0F, 0.1F, 0F, 0F, 1F, 0F, -1.1F, -2F, 0F, -0.5F); // Box 140
		e10dbModel[104].setRotationPoint(-52F, -11F, 11F);

		e10dbModel[105].addShapeBox(0F, 0F, 0F, 2, 0, 7, 0F, -1.5F, 0F, 0F, 0.1F, 0F, 0F, -0.9F, 0F, 0F, -0.6F, 0F, 0F, -1.5F, 0F, 0F, 0.1F, 0F, 0F, -0.9F, 0F, 0F, -0.6F, 0F, 0F); // Box 142
		e10dbModel[105].setRotationPoint(-53F, -11F, 11F);
		e10dbModel[105].rotateAngleX = 3.14159265F;

		e10dbModel[106].addShapeBox(0F, 0F, 0F, 2, 0, 4, 0F, -1.15F, 0F, 0F, -0.4F, 0F, 0F, -1F, 0F, 0F, -0.6F, 0F, 0F, -1.15F, 0F, 0F, -0.4F, 0F, 0F, -1F, 0F, 0F, -0.6F, 0F, 0F); // Box 143
		e10dbModel[106].setRotationPoint(-53F, -2F, 8F);
		e10dbModel[106].rotateAngleX = 3.14159265F;

		e10dbModel[107].addShapeBox(0F, 0F, 0F, 2, 0, 2, 0F, -1.5F, 0F, 0F, 0.1F, 0F, 0F, -0.25F, 0F, 0F, -1.25F, 0F, 0F, -1.5F, 0F, 0F, 0.1F, 0F, 0F, -0.25F, 0F, 0F, -1.25F, 0F, 0F); // Box 144
		e10dbModel[107].setRotationPoint(-53F, -2F, 11F);
		e10dbModel[107].rotateAngleX = 3.14159265F;

		e10dbModel[108].addShapeBox(0F, 0F, 0F, 2, 0, 1, 0F, -0.5F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, 0.1F, -1.1F, 0F, 1F, -0.5F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, 0.1F, -1.1F, 0F, 1F); // Box 145
		e10dbModel[108].setRotationPoint(-52F, -2F, 13F);
		e10dbModel[108].rotateAngleX = 3.14159265F;

		e10dbModel[109].addShapeBox(0F, 0F, 0F, 2, 0, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 146
		e10dbModel[109].setRotationPoint(-48F, -2F, 13F);
		e10dbModel[109].rotateAngleY = -3.14159265F;

		e10dbModel[110].addShapeBox(0F, 0F, 0F, 7, 0, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 150
		e10dbModel[110].setRotationPoint(36F, -11F, 13F);
		e10dbModel[110].rotateAngleY = -3.14159265F;

		e10dbModel[111].addShapeBox(0F, 0F, 0F, 2, 0, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 151
		e10dbModel[111].setRotationPoint(36F, -2F, 13F);
		e10dbModel[111].rotateAngleY = -3.14159265F;

		e10dbModel[112].addShapeBox(0F, 0F, 0F, 1, 0, 2, 0F, -0.5F, 0F, 0F, 0.1F, 0F, 0F, 1F, 0F, -1.1F, -2F, 0F, -0.5F, -0.5F, 0F, 0F, 0.1F, 0F, 0F, 1F, 0F, -1.1F, -2F, 0F, -0.5F); // Box 152
		e10dbModel[112].setRotationPoint(38F, -11F, 11F);
		e10dbModel[112].rotateAngleZ = 3.14159265F;

		e10dbModel[113].addShapeBox(0F, 0F, 0F, 1, 0, 2, 0F, 1F, 0F, -1.1F, -2F, 0F, -0.5F, -0.5F, 0F, 0F, 0.1F, 0F, 0F, 1F, 0F, -1.1F, -2F, 0F, -0.5F, -0.5F, 0F, 0F, 0.1F, 0F, 0F); // Box 153
		e10dbModel[113].setRotationPoint(37F, -2F, 13F);
		e10dbModel[113].rotateAngleX = 3.14159265F;

		e10dbModel[114].addShapeBox(0F, 0F, 0F, 2, 0, 2, 0F, -1.5F, 0F, 0F, 0.1F, 0F, 0F, -0.25F, 0F, 0F, -1.25F, 0F, 0F, -1.5F, 0F, 0F, 0.1F, 0F, 0F, -0.25F, 0F, 0F, -1.25F, 0F, 0F); // Box 154
		e10dbModel[114].setRotationPoint(39F, -2F, -11F);
		e10dbModel[114].rotateAngleX = 3.14159265F;
		e10dbModel[114].rotateAngleY = -3.14159265F;

		e10dbModel[115].addShapeBox(0F, 0F, 0F, 2, 0, 2, 0F, -1.5F, 0F, 0F, 0.1F, 0F, 0F, -0.25F, 0F, 0F, -1.25F, 0F, 0F, -1.5F, 0F, 0F, 0.1F, 0F, 0F, -0.25F, 0F, 0F, -1.25F, 0F, 0F); // Box 156
		e10dbModel[115].setRotationPoint(39F, -2F, 11F);
		e10dbModel[115].rotateAngleY = -3.14159265F;

		e10dbModel[116].addShapeBox(0F, 0F, 0F, 2, 0, 7, 0F, -1.5F, 0F, 0F, 0.1F, 0F, 0F, -0.9F, 0F, 0F, -0.6F, 0F, 0F, -1.5F, 0F, 0F, 0.1F, 0F, 0F, -0.9F, 0F, 0F, -0.6F, 0F, 0F); // Box 157
		e10dbModel[116].setRotationPoint(39F, -11F, 11F);
		e10dbModel[116].rotateAngleY = -3.14159265F;

		e10dbModel[117].addShapeBox(0F, 0F, 0F, 2, 0, 7, 0F, -1.5F, 0F, 0F, 0.1F, 0F, 0F, -0.9F, 0F, 0F, -0.6F, 0F, 0F, -1.5F, 0F, 0F, 0.1F, 0F, 0F, -0.9F, 0F, 0F, -0.6F, 0F, 0F); // Box 158
		e10dbModel[117].setRotationPoint(39F, -11F, -11F);
		e10dbModel[117].rotateAngleX = 3.14159265F;
		e10dbModel[117].rotateAngleY = -3.14159265F;

		e10dbModel[118].addShapeBox(0F, 0F, 0F, 1, 0, 2, 0F, -0.5F, 0F, 0F, 0.1F, 0F, 0F, 1F, 0F, -1.1F, -2F, 0F, -0.5F, -0.5F, 0F, 0F, 0.1F, 0F, 0F, 1F, 0F, -1.1F, -2F, 0F, -0.5F); // Box 159
		e10dbModel[118].setRotationPoint(38F, -11F, -11F);
		e10dbModel[118].rotateAngleY = -3.14159265F;

		e10dbModel[119].addShapeBox(0F, 0F, 0F, 1, 0, 8, 0F, -0.6F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, -0.6F, 0F, 0F); // Box 160
		e10dbModel[119].setRotationPoint(39F, -11F, 4F);
		e10dbModel[119].rotateAngleY = -3.14159265F;

		e10dbModel[120].addShapeBox(0F, 0F, 0F, 1, 0, 8, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F); // Box 161
		e10dbModel[120].setRotationPoint(39F, -2F, 4F);
		e10dbModel[120].rotateAngleY = -3.14159265F;

		e10dbModel[121].addShapeBox(0F, 0F, 0F, 2, 0, 4, 0F, -1.15F, 0F, 0F, -0.4F, 0F, 0F, -1F, 0F, 0F, -0.6F, 0F, 0F, -1.15F, 0F, 0F, -0.4F, 0F, 0F, -1F, 0F, 0F, -0.6F, 0F, 0F); // Box 162
		e10dbModel[121].setRotationPoint(39F, -2F, 8F);
		e10dbModel[121].rotateAngleY = -3.14159265F;

		e10dbModel[122].addShapeBox(0F, 0F, 0F, 2, 0, 4, 0F, -1.15F, 0F, 0F, -0.4F, 0F, 0F, -1F, 0F, 0F, -0.6F, 0F, 0F, -1.15F, 0F, 0F, -0.4F, 0F, 0F, -1F, 0F, 0F, -0.6F, 0F, 0F); // Box 163
		e10dbModel[122].setRotationPoint(39F, -2F, -8F);
		e10dbModel[122].rotateAngleX = 3.14159265F;
		e10dbModel[122].rotateAngleY = -3.14159265F;

		e10dbModel[123].addShapeBox(0F, 0F, 0F, 1, 0, 2, 0F, 1F, 0F, -1.1F, -2F, 0F, -0.5F, -0.5F, 0F, 0F, 0.1F, 0F, 0F, 1F, 0F, -1.1F, -2F, 0F, -0.5F, -0.5F, 0F, 0F, 0.1F, 0F, 0F); // Box 164
		e10dbModel[123].setRotationPoint(37F, -2F, -13F);

		e10dbModel[124].addShapeBox(0F, 0F, 0F, 2, 0, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 165
		e10dbModel[124].setRotationPoint(34F, -2F, -13F);

		e10dbModel[125].addShapeBox(0F, 0F, 0F, 7, 0, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 166
		e10dbModel[125].setRotationPoint(29F, -11F, -13F);

		e10dbModel[126].addShapeBox(-1F, 0F, 0F, 2, 1, 8, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 167
		e10dbModel[126].setRotationPoint(36F, -22F, 4F);
		e10dbModel[126].rotateAngleY = -3.14159265F;

		e10dbModel[127].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, -0.1F, -0.1F, 1F, -0.1F, -0.1F, 1F, -0.1F, -0.1F, -0.5F, -0.1F, -0.1F, -0.5F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, -0.5F, -0.1F, -0.1F); // Box 168
		e10dbModel[127].setRotationPoint(37.2F, -22.1F, 0.5F);
		e10dbModel[127].rotateAngleY = -3.14159265F;

		e10dbModel[128].addShapeBox(0F, 0F, 0F, 7, 4, 1, 0F, -0.7F, -0.5F, 0F, -0.7F, -0.5F, 0F, -0.7F, -0.5F, 0F, -0.7F, -0.5F, 0F, -0.7F, -0.5F, 0F, -0.7F, -0.5F, 0F, -0.7F, -0.5F, 0F, -0.7F, -0.5F, 0F); // Box 170
		e10dbModel[128].setRotationPoint(19F, 2F, -13F);

		e10dbModel[129].addShapeBox(0F, 0F, 0F, 7, 4, 1, 0F, -0.7F, -0.5F, 0F, -0.7F, -0.5F, 0F, -0.7F, -0.5F, 0F, -0.7F, -0.5F, 0F, -0.7F, -0.5F, 0F, -0.7F, -0.5F, 0F, -0.7F, -0.5F, 0F, -0.7F, -0.5F, 0F); // Box 171
		e10dbModel[129].setRotationPoint(26F, 2F, 13F);
		e10dbModel[129].rotateAngleY = -3.14159265F;

		e10dbModel[130].addShapeBox(0F, 0F, 0F, 7, 4, 1, 0F, -0.7F, -0.5F, 0F, -0.7F, -0.5F, 0F, -0.7F, -0.5F, 0F, -0.7F, -0.5F, 0F, -0.7F, -0.5F, 0F, -0.7F, -0.5F, 0F, -0.7F, -0.5F, 0F, -0.7F, -0.5F, 0F); // Box 172
		e10dbModel[130].setRotationPoint(-33F, 2F, 13F);
		e10dbModel[130].rotateAngleY = -3.14159265F;

		e10dbModel[131].addBox(0F, 0F, 0F, 1, 25, 22, 0F); // Box 173
		e10dbModel[131].setRotationPoint(-31F, -21F, 11F);
		e10dbModel[131].rotateAngleY = -3.14159265F;

		e10dbModel[132].addBox(0F, 0F, 0F, 8, 1, 22, 0F); // Box 135
		e10dbModel[132].setRotationPoint(36F, -7F, 11F);
		e10dbModel[132].rotateAngleY = -3.14159265F;

		e10dbModel[133].addShapeBox(0F, 0F, 0F, 2, 11, 2, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F); // Box 136
		e10dbModel[133].setRotationPoint(35F, -21F, -12F);

		e10dbModel[134].addShapeBox(0F, 0F, 0F, 2, 11, 2, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 137
		e10dbModel[134].setRotationPoint(-51F, -21F, 10F);


	}

	private ModelDeiticBogie trucks = new ModelDeiticBogie();
	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		for(int i = 0; i < 135; i++)
		{
			if(e10dbModel[i].boxName!= null && e10dbModel[i].boxName.equals("lamp")){
				Minecraft.getMinecraft().entityRenderer.disableLightmap(1D);
				e10dbModel[i].render(f5);
				Minecraft.getMinecraft().entityRenderer.enableLightmap(1D);

			} else {
				e10dbModel[i].render(f5);
			}
		}

		Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/Class85_Bogie.png"));
		GL11.glPushMatrix();
		GL11.glTranslated(-2.6,-0.05,0);
		GL11.glScalef(0.8f,0.8f,0.8f);
		GL11.glRotated(90f,0,1,0);
		trucks.render(entity,f,f1,f2,f3,f4,f5);
		GL11.glPopMatrix();

		GL11.glPushMatrix();
		GL11.glTranslated(1,-0.05,0);
		GL11.glScalef(0.8f,0.8f,0.8f);
		GL11.glRotated(90f,0,1,0);
		trucks.render(entity,f,f1,f2,f3,f4,f5);
		GL11.glPopMatrix();
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
	{
	}

	public ModelRendererTurbo e10dbModel[];
}