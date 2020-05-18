//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2017 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator:
// Created on:10.08.2017 - 22:48:51
// Last changed on: 10.08.2017 - 22:48:51

package train.client.render.models;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import tmt.ModelBase;
import tmt.ModelRendererTurbo;
import tmt.Tessellator;
import train.common.library.Info;

public class ModelClass85 extends ModelBase
{
	int textureX = 512;
	int textureY = 256;

	public ModelClass85()
	{
		class85Model = new ModelRendererTurbo[193];
		class85Model[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // 01
		class85Model[1] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // 02
		class85Model[2] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // 03
		class85Model[3] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // 04
		class85Model[4] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // 05
		class85Model[5] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // 06
		class85Model[6] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // 07
		class85Model[7] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // 08
		class85Model[8] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // 09
		class85Model[9] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // 10
		class85Model[10] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // 11
		class85Model[11] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // 12
		class85Model[12] = new ModelRendererTurbo(this, 288, 0, textureX, textureY); // 13
		class85Model[13] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // 14
		class85Model[14] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // 15
		class85Model[15] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // 16
		class85Model[16] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // 17
		class85Model[17] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // 18
		class85Model[18] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // 19
		class85Model[19] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // 20
		class85Model[20] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // 21
		class85Model[21] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // 22
		class85Model[22] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // 23
		class85Model[23] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // 24
		class85Model[24] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // 25
		class85Model[25] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // 26
		class85Model[26] = new ModelRendererTurbo(this, 417, 9, textureX, textureY); // 27
		class85Model[27] = new ModelRendererTurbo(this, 81, 17, textureX, textureY); // 28
		class85Model[28] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // 29
		class85Model[29] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // 30
		class85Model[30] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // 31
		class85Model[31] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // 32
		class85Model[32] = new ModelRendererTurbo(this, 177, 9, textureX, textureY); // 33
		class85Model[33] = new ModelRendererTurbo(this, 345, 9, textureX, textureY); // 34
		class85Model[34] = new ModelRendererTurbo(this, 201, 9, textureX, textureY); // 35
		class85Model[35] = new ModelRendererTurbo(this, 209, 9, textureX, textureY); // 36
		class85Model[36] = new ModelRendererTurbo(this, 3, 99, textureX, textureY); // 37
		class85Model[37] = new ModelRendererTurbo(this, 369, 9, textureX, textureY); // 38
		class85Model[38] = new ModelRendererTurbo(this, 465, 9, textureX, textureY); // 39
		class85Model[39] = new ModelRendererTurbo(this, 489, 9, textureX, textureY); // 42
		class85Model[40] = new ModelRendererTurbo(this, 497, 9, textureX, textureY); // 43
		class85Model[41] = new ModelRendererTurbo(this, 225, 17, textureX, textureY); // 44
		class85Model[42] = new ModelRendererTurbo(this, 505, 9, textureX, textureY); // 45
		class85Model[43] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // 46
		class85Model[44] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // 47
		class85Model[45] = new ModelRendererTurbo(this, 177, 17, textureX, textureY); // 48
		class85Model[46] = new ModelRendererTurbo(this, 193, 17, textureX, textureY); // 49
		class85Model[47] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // 50
		class85Model[48] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // 51
		class85Model[49] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // 52
		class85Model[50] = new ModelRendererTurbo(this, 201, 17, textureX, textureY); // 53
		class85Model[51] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // 54
		class85Model[52] = new ModelRendererTurbo(this, 417, 9, textureX, textureY); // 55
		class85Model[53] = new ModelRendererTurbo(this, 209, 17, textureX, textureY); // 56
		class85Model[54] = new ModelRendererTurbo(this, 273, 17, textureX, textureY); // 57
		class85Model[55] = new ModelRendererTurbo(this, 281, 17, textureX, textureY); // 58
		class85Model[56] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // 59
		class85Model[57] = new ModelRendererTurbo(this, 289, 17, textureX, textureY); // 60
		class85Model[58] = new ModelRendererTurbo(this, 129, 9, textureX, textureY); // 61
		class85Model[59] = new ModelRendererTurbo(this, 297, 17, textureX, textureY); // 62
		class85Model[60] = new ModelRendererTurbo(this, 145, 9, textureX, textureY); // 63
		class85Model[61] = new ModelRendererTurbo(this, 297, 17, textureX, textureY); // 64
		class85Model[62] = new ModelRendererTurbo(this, 305, 17, textureX, textureY); // 65
		class85Model[63] = new ModelRendererTurbo(this, 313, 17, textureX, textureY); // 66
		class85Model[64] = new ModelRendererTurbo(this, 321, 17, textureX, textureY); // 67
		class85Model[65] = new ModelRendererTurbo(this, 345, 17, textureX, textureY); // 68
		class85Model[66] = new ModelRendererTurbo(this, 353, 17, textureX, textureY); // 69
		class85Model[67] = new ModelRendererTurbo(this, 417, 17, textureX, textureY); // 70
		class85Model[68] = new ModelRendererTurbo(this, 145, 97, textureX, textureY); // 71
		class85Model[69] = new ModelRendererTurbo(this, 305, 97, textureX, textureY); // 72
		class85Model[70] = new ModelRendererTurbo(this, 369, 105, textureX, textureY); // 73
		class85Model[71] = new ModelRendererTurbo(this, 361, 17, textureX, textureY); // 74
		class85Model[72] = new ModelRendererTurbo(this, 473, 17, textureX, textureY); // 75
		class85Model[73] = new ModelRendererTurbo(this, 369, 17, textureX, textureY); // 76
		class85Model[74] = new ModelRendererTurbo(this, 417, 17, textureX, textureY); // 77
		class85Model[75] = new ModelRendererTurbo(this, 497, 17, textureX, textureY); // 78
		class85Model[76] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // 79
		class85Model[77] = new ModelRendererTurbo(this, 505, 17, textureX, textureY); // 80
		class85Model[78] = new ModelRendererTurbo(this, 17, 25, textureX, textureY); // 81
		class85Model[79] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // 82
		class85Model[80] = new ModelRendererTurbo(this, 153, 9, textureX, textureY); // 83
		class85Model[81] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // 84
		class85Model[82] = new ModelRendererTurbo(this, 169, 9, textureX, textureY); // 85
		class85Model[83] = new ModelRendererTurbo(this, 305, 17, textureX, textureY); // 86
		class85Model[84] = new ModelRendererTurbo(this, 41, 25, textureX, textureY); // 87
		class85Model[85] = new ModelRendererTurbo(this, 49, 25, textureX, textureY); // 88
		class85Model[86] = new ModelRendererTurbo(this, 57, 25, textureX, textureY); // 89
		class85Model[87] = new ModelRendererTurbo(this, 65, 25, textureX, textureY); // 90
		class85Model[88] = new ModelRendererTurbo(this, 273, 9, textureX, textureY); // 91
		class85Model[89] = new ModelRendererTurbo(this, 81, 25, textureX, textureY); // 92
		class85Model[90] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // 93
		class85Model[91] = new ModelRendererTurbo(this, 329, 9, textureX, textureY); // 94
		class85Model[92] = new ModelRendererTurbo(this, 97, 25, textureX, textureY); // 95
		class85Model[93] = new ModelRendererTurbo(this, 105, 25, textureX, textureY); // 96
		class85Model[94] = new ModelRendererTurbo(this, 337, 9, textureX, textureY); // 97
		class85Model[95] = new ModelRendererTurbo(this, 153, 25, textureX, textureY); // 98
		class85Model[96] = new ModelRendererTurbo(this, 273, 17, textureX, textureY); // 99
		class85Model[97] = new ModelRendererTurbo(this, 313, 17, textureX, textureY); // 100
		class85Model[98] = new ModelRendererTurbo(this, 161, 25, textureX, textureY); // 101
		class85Model[99] = new ModelRendererTurbo(this, 169, 25, textureX, textureY); // 102
		class85Model[100] = new ModelRendererTurbo(this, 177, 25, textureX, textureY); // 103
		class85Model[101] = new ModelRendererTurbo(this, 185, 25, textureX, textureY); // 104
		class85Model[102] = new ModelRendererTurbo(this, 225, 25, textureX, textureY); // 105
		class85Model[103] = new ModelRendererTurbo(this, 249, 25, textureX, textureY); // 106
		class85Model[104] = new ModelRendererTurbo(this, 273, 25, textureX, textureY); // 107
		class85Model[105] = new ModelRendererTurbo(this, 201, 25, textureX, textureY); // 108
		class85Model[106] = new ModelRendererTurbo(this, 209, 25, textureX, textureY); // 109
		class85Model[107] = new ModelRendererTurbo(this, 297, 25, textureX, textureY); // 110
		class85Model[108] = new ModelRendererTurbo(this, 305, 25, textureX, textureY); // 111
		class85Model[109] = new ModelRendererTurbo(this, 313, 25, textureX, textureY); // 112
		class85Model[110] = new ModelRendererTurbo(this, 321, 25, textureX, textureY); // 113
		class85Model[111] = new ModelRendererTurbo(this, 329, 25, textureX, textureY); // 114
		class85Model[112] = new ModelRendererTurbo(this, 337, 25, textureX, textureY); // 115
		class85Model[113] = new ModelRendererTurbo(this, 17, 25, textureX, textureY); // 116
		class85Model[114] = new ModelRendererTurbo(this, 489, 25, textureX, textureY); // 117
		class85Model[115] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // 118
		class85Model[116] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // 119
		class85Model[117] = new ModelRendererTurbo(this, 201, 9, textureX, textureY); // 120
		class85Model[118] = new ModelRendererTurbo(this, 497, 25, textureX, textureY); // 121
		class85Model[119] = new ModelRendererTurbo(this, 505, 25, textureX, textureY); // 122
		class85Model[120] = new ModelRendererTurbo(this, 281, 17, textureX, textureY); // 123
		class85Model[121] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // 124
		class85Model[122] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // 125
		class85Model[123] = new ModelRendererTurbo(this, 17, 33, textureX, textureY); // 126
		class85Model[124] = new ModelRendererTurbo(this, 41, 33, textureX, textureY); // 127
		class85Model[125] = new ModelRendererTurbo(this, 17, 33, textureX, textureY); // 128
		class85Model[126] = new ModelRendererTurbo(this, 473, 25, textureX, textureY); // 129
		class85Model[127] = new ModelRendererTurbo(this, 33, 33, textureX, textureY); // 130
		class85Model[128] = new ModelRendererTurbo(this, 81, 33, textureX, textureY); // 131
		class85Model[129] = new ModelRendererTurbo(this, 57, 33, textureX, textureY); // 132
		class85Model[130] = new ModelRendererTurbo(this, 97, 33, textureX, textureY); // 133
		class85Model[131] = new ModelRendererTurbo(this, 65, 33, textureX, textureY); // 134
		class85Model[132] = new ModelRendererTurbo(this, 81, 33, textureX, textureY); // 135
		class85Model[133] = new ModelRendererTurbo(this, 113, 33, textureX, textureY); // 136
		class85Model[134] = new ModelRendererTurbo(this, 49, 25, textureX, textureY); // 137
		class85Model[135] = new ModelRendererTurbo(this, 57, 25, textureX, textureY); // 138
		class85Model[136] = new ModelRendererTurbo(this, 201, 33, textureX, textureY); // 143
		class85Model[137] = new ModelRendererTurbo(this, 209, 33, textureX, textureY); // 144
		class85Model[138] = new ModelRendererTurbo(this, 225, 33, textureX, textureY); // 145
		class85Model[139] = new ModelRendererTurbo(this, 233, 33, textureX, textureY); // 146
		class85Model[140] = new ModelRendererTurbo(this, 241, 33, textureX, textureY); // 147
		class85Model[141] = new ModelRendererTurbo(this, 249, 33, textureX, textureY); // 148
		class85Model[142] = new ModelRendererTurbo(this, 257, 33, textureX, textureY); // 149
		class85Model[143] = new ModelRendererTurbo(this, 265, 33, textureX, textureY); // 150
		class85Model[144] = new ModelRendererTurbo(this, 81, 33, textureX, textureY); // 151
		class85Model[145] = new ModelRendererTurbo(this, 273, 33, textureX, textureY); // 152
		class85Model[146] = new ModelRendererTurbo(this, 305, 33, textureX, textureY); // 153
		class85Model[147] = new ModelRendererTurbo(this, 337, 33, textureX, textureY); // 154
		class85Model[148] = new ModelRendererTurbo(this, 417, 33, textureX, textureY); // 155
		class85Model[149] = new ModelRendererTurbo(this, 465, 33, textureX, textureY); // 157
		class85Model[150] = new ModelRendererTurbo(this, 33, 41, textureX, textureY); // 158
		class85Model[151] = new ModelRendererTurbo(this, 10, 147, textureX, textureY); // 160
		class85Model[152] = new ModelRendererTurbo(this, 225, 49, textureX, textureY); // 164
		class85Model[153] = new ModelRendererTurbo(this, 273, 49, textureX, textureY); // 165
		class85Model[154] = new ModelRendererTurbo(this, 321, 49, textureX, textureY); // 166
		class85Model[155] = new ModelRendererTurbo(this, 81, 49, textureX, textureY); // Box 181
		class85Model[156] = new ModelRendererTurbo(this, 417, 49, textureX, textureY); // Box 182
		class85Model[157] = new ModelRendererTurbo(this, 305, 33, textureX, textureY); // Box 184
		class85Model[158] = new ModelRendererTurbo(this, 329, 33, textureX, textureY); // Box 185
		class85Model[159] = new ModelRendererTurbo(this, 337, 33, textureX, textureY); // Box 186
		class85Model[160] = new ModelRendererTurbo(this, 361, 33, textureX, textureY); // Box 187
		class85Model[161] = new ModelRendererTurbo(this, 129, 33, textureX, textureY); // Box 188
		class85Model[162] = new ModelRendererTurbo(this, 145, 33, textureX, textureY); // Box 189
		class85Model[163] = new ModelRendererTurbo(this, 185, 33, textureX, textureY); // Box 190
		class85Model[164] = new ModelRendererTurbo(this, 369, 33, textureX, textureY); // Box 191
		class85Model[165] = new ModelRendererTurbo(this, 417, 33, textureX, textureY); // Box 192
		class85Model[166] = new ModelRendererTurbo(this, 441, 33, textureX, textureY); // Box 193
		class85Model[167] = new ModelRendererTurbo(this, 465, 33, textureX, textureY); // Box 194
		class85Model[168] = new ModelRendererTurbo(this, 489, 33, textureX, textureY); // Box 195
		class85Model[169] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 196
		class85Model[170] = new ModelRendererTurbo(this, 9, 41, textureX, textureY); // Box 197
		class85Model[171] = new ModelRendererTurbo(this, 57, 41, textureX, textureY); // Box 198
		class85Model[172] = new ModelRendererTurbo(this, 65, 41, textureX, textureY); // Box 199
		class85Model[173] = new ModelRendererTurbo(this, 177, 41, textureX, textureY); // Box 200
		class85Model[174] = new ModelRendererTurbo(this, 369, 41, textureX, textureY); // Box 201
		class85Model[175] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 202
		class85Model[176] = new ModelRendererTurbo(this, 81, 49, textureX, textureY); // Box 203
		class85Model[177] = new ModelRendererTurbo(this, 65, 49, textureX, textureY); // Box 204
		class85Model[178] = new ModelRendererTurbo(this, 177, 49, textureX, textureY); // Box 205
		class85Model[179] = new ModelRendererTurbo(this, 201, 49, textureX, textureY); // Box 206
		class85Model[180] = new ModelRendererTurbo(this, 209, 49, textureX, textureY); // Box 207
		class85Model[181] = new ModelRendererTurbo(this, 449, 49, textureX, textureY); // Box 208
		class85Model[182] = new ModelRendererTurbo(this, 321, 57, textureX, textureY); // Box 209
		class85Model[183] = new ModelRendererTurbo(this, 449, 57, textureX, textureY); // Box 210
		class85Model[184] = new ModelRendererTurbo(this, 61, 135, textureX, textureY); // Box 192
		class85Model[185] = new ModelRendererTurbo(this, 44, 135, textureX, textureY); // Box 193
		class85Model[186] = new ModelRendererTurbo(this, 27, 135, textureX, textureY); // Box 194
		class85Model[187] = new ModelRendererTurbo(this, 10, 135, textureX, textureY); // Box 195
		class85Model[188] = new ModelRendererTurbo(this, 61, 123, textureX, textureY); // Box 196
		class85Model[189] = new ModelRendererTurbo(this, 44, 123, textureX, textureY); // Box 197
		class85Model[190] = new ModelRendererTurbo(this, 27, 123, textureX, textureY); // Box 198
		class85Model[191] = new ModelRendererTurbo(this, 10, 123, textureX, textureY); // Box 199
		class85Model[192] = new ModelRendererTurbo(this, 232, 170, textureX, textureY); // Box 200

		class85Model[0].addBox(0F, 0F, 0F, 1, 21, 70, 0F); // 01
		class85Model[0].setRotationPoint(-11F, -13F, -28F);

		class85Model[1].addShapeBox(0F, 0F, 0F, 1, 12, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // 02
		class85Model[1].setRotationPoint(-11F, -4F, 42F);

		class85Model[2].addShapeBox(0F, 0F, 0F, 1, 12, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // 03
		class85Model[2].setRotationPoint(-11F, -4F, -38F);

		class85Model[3].addShapeBox(0F, 0F, 0F, 20, 12, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // 04
		class85Model[3].setRotationPoint(-10F, -4F, 51F);

		class85Model[4].addShapeBox(0F, 0F, 0F, 1, 12, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // 05
		class85Model[4].setRotationPoint(10F, -4F, 42F);

		class85Model[5].addShapeBox(0F, 0F, 0F, 1, 21, 70, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // 06
		class85Model[5].setRotationPoint(10F, -13F, -28F);

		class85Model[6].addShapeBox(0F, 0F, 0F, 1, 12, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // 07
		class85Model[6].setRotationPoint(10F, -4F, -38F);

		class85Model[7].addShapeBox(0F, 0F, 0F, 20, 12, 2, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // 08
		class85Model[7].setRotationPoint(-10F, -4F, -39F);

		class85Model[8].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // 09
		class85Model[8].setRotationPoint(-11F, -10F, 51F);

		class85Model[9].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // 10
		class85Model[9].setRotationPoint(9F, -10F, 51F);

		class85Model[10].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // 11
		class85Model[10].setRotationPoint(2.5F, -10F, 51F);

		class85Model[11].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // 12
		class85Model[11].setRotationPoint(-3.5F, -10F, 51F);

		class85Model[12].addBox(0F, 0F, 0F, 20, 1, 88, 0F); // 13
		class85Model[12].setRotationPoint(-10F, 6F, -37F);

		class85Model[13].addShapeBox(0F, 0F, 0F, 22, 2, 10, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // 14
		class85Model[13].setRotationPoint(-11F, -15F, -31F);

		class85Model[14].addShapeBox(0F, 0F, 0F, 22, 1, 3, 0F, -1F, 1F, 3F, -1F, 1F, 3F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 1F, 0F, 0F, 1F, 0F); // 15
		class85Model[14].setRotationPoint(-11F, -14F, 48F);

		class85Model[15].addShapeBox(0F, 0F, 0F, 22, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // 16
		class85Model[15].setRotationPoint(-11F, -12F, 50F);

		class85Model[16].addBox(0F, 0F, 0F, 8, 3, 1, 0F); // 17
		class85Model[16].setRotationPoint(-11F, -13F, 50F);
		class85Model[16].rotateAngleY = -1.57079633F;

		class85Model[17].addBox(0F, 0F, 0F, 8, 3, 1, 0F); // 18
		class85Model[17].setRotationPoint(10F, -13F, 50F);
		class85Model[17].rotateAngleY = -1.57079633F;

		class85Model[18].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // 19
		class85Model[18].setRotationPoint(-11F, -10F, 46F);

		class85Model[19].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // 20
		class85Model[19].setRotationPoint(10F, -10F, 46F);

		class85Model[20].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // 21
		class85Model[20].setRotationPoint(10F, -10F, -33F);

		class85Model[21].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // 22
		class85Model[21].setRotationPoint(-11F, -10F, -33F);

		class85Model[22].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // 23
		class85Model[22].setRotationPoint(9F, -10F, -38F);

		class85Model[23].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // 24
		class85Model[23].setRotationPoint(2.5F, -10F, -38F);

		class85Model[24].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // 25
		class85Model[24].setRotationPoint(-3.5F, -10F, -38F);

		class85Model[25].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // 26
		class85Model[25].setRotationPoint(-11F, -10F, -38F);

		class85Model[26].addShapeBox(0F, 0F, 0F, 22, 1, 3, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 1F, 3F, -1F, 1F, 3F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 3F, 0F, 0F, 3F); // 27
		class85Model[26].setRotationPoint(-11F, -14F, -37F);

		class85Model[27].addShapeBox(0F, 0F, 0F, 22, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // 28
		class85Model[27].setRotationPoint(-11F, -12F, -37F);

		class85Model[28].addBox(0F, 0F, 0F, 8, 3, 1, 0F); // 29
		class85Model[28].setRotationPoint(10F, -13F, -28F);
		class85Model[28].rotateAngleY = -1.57079633F;

		class85Model[29].addBox(0F, 0F, 0F, 8, 3, 1, 0F); // 30
		class85Model[29].setRotationPoint(-11F, -13F, -28F);
		class85Model[29].rotateAngleY = -1.57079633F;

		class85Model[30].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // 31
		class85Model[30].setRotationPoint(2F, -1F, 52F);

		class85Model[31].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // 32
		class85Model[31].setRotationPoint(-3F, -1F, 52F);

		class85Model[32].addBox(0F, 0F, 0F, 10, 3, 1, 0F); // 33
		class85Model[32].setRotationPoint(-5F, -2F, 51.5F);
		class85Model[32].rotateAngleX = 0.08726646F;

		class85Model[33].addBox(0F, 0F, 0F, 10, 3, 1, 0F); // 34
		class85Model[33].setRotationPoint(-5F, -2F, -38.5F);
		class85Model[33].rotateAngleX = -0.08726646F;

		class85Model[34].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // 35
		class85Model[34].setRotationPoint(2F, -1F, -39F);
		class85Model[34].rotateAngleX = -0.08726646F;

		class85Model[35].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // 36
		class85Model[35].setRotationPoint(-3F, -1F, -39F);
		class85Model[35].rotateAngleX = -0.08726646F;

		class85Model[36].addShapeBox(0F, 0F, 0F, 22, 1, 90, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // 37
		class85Model[36].setRotationPoint(-11F, 8F, -38F);

		class85Model[37].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // 38
		class85Model[37].setRotationPoint(7F, 6F, 52F);
		class85Model[37].rotateAngleX = 0.08726646F;

		class85Model[38].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // 39
		class85Model[38].setRotationPoint(-8F, 6F, 52F);
		class85Model[38].rotateAngleX = 0.08726646F;

		class85Model[39].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // 42
		class85Model[39].setRotationPoint(7F, 6F, -39F);
		class85Model[39].rotateAngleX = -0.08726646F;

		class85Model[40].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // 43
		class85Model[40].setRotationPoint(-8F, 6F, -39F);
		class85Model[40].rotateAngleX = -0.08726646F;

		class85Model[41].addShapeBox(0F, 0F, 0F, 22, 4, 1, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // 44
		class85Model[41].setRotationPoint(-11F, 8F, 52F);

		class85Model[42].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // 45
		class85Model[42].setRotationPoint(7F, 10F, 53F);

		class85Model[43].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // 46
		class85Model[43].setRotationPoint(-8F, 10F, 53F);

		class85Model[44].addBox(0F, 0F, 0F, 3, 3, 1, 0F); // 47
		class85Model[44].setRotationPoint(6F, 9F, 54F);

		class85Model[45].addBox(0F, 0F, 0F, 3, 3, 1, 0F); // 48
		class85Model[45].setRotationPoint(-9F, 9F, 54F);

		class85Model[46].addBox(0F, 0F, 0F, 1, 3, 0, 0F); // 49
		class85Model[46].setRotationPoint(-0.5F, 10F, 53.5F);

		class85Model[47].addBox(0F, 0F, 0F, 1, 0, 1, 0F); // 50
		class85Model[47].setRotationPoint(-0.5F, 10F, 53F);

		class85Model[48].addBox(0F, 0F, 0F, 0, 1, 1, 0F); // 51
		class85Model[48].setRotationPoint(0F, 11F, 52.75F);

		class85Model[49].addBox(0F, 0F, 0F, 1, 0, 1, 0F); // 52
		class85Model[49].setRotationPoint(-2.5F, 10F, 53F);

		class85Model[50].addBox(0F, 0F, 0F, 0, 3, 1, 0F); // 53
		class85Model[50].setRotationPoint(-2.5F, 10F, 53F);

		class85Model[51].addBox(0F, 0F, 0F, 1, 1, 0, 0F); // 54
		class85Model[51].setRotationPoint(-3.5F, 12F, 54F);

		class85Model[52].addBox(0F, 0F, 0F, 0, 1, 1, 0F); // 55
		class85Model[52].setRotationPoint(-3.5F, 12F, 53F);

		class85Model[53].addBox(0F, 0F, 0F, 0, 1, 1, 0F); // 56
		class85Model[53].setRotationPoint(-3.5F, 12F, 52F);

		class85Model[54].addBox(0F, 0F, 0F, 0, 2, 1, 0F); // 57
		class85Model[54].setRotationPoint(2F, 10F, 52.75F);

		class85Model[55].addBox(0F, 0F, 0F, 0, 2, 1, 0F); // 58
		class85Model[55].setRotationPoint(2.3F, 10F, 52.75F);

		class85Model[56].addBox(0F, 0F, 0F, 1, 0, 1, 0F); // 59
		class85Model[56].setRotationPoint(3.85F, 12F, 52F);

		class85Model[57].addBox(0F, 0F, 0F, 1, 0, 2, 0F); // 60
		class85Model[57].setRotationPoint(3.85F, 12F, 53F);

		class85Model[58].addBox(0F, 0F, 0F, 1, 0, 1, 0F); // 61
		class85Model[58].setRotationPoint(2.85F, 12F, 54F);

		class85Model[59].addBox(0F, 0F, 0F, 0, 1, 1, 0F); // 62
		class85Model[59].setRotationPoint(2.85F, 12F, 54F);

		class85Model[60].addBox(0F, 0F, 0F, 1, 0, 1, 0F); // 63
		class85Model[60].setRotationPoint(1.85F, 13F, 54F);

		class85Model[61].addBox(0F, 0F, 0F, 1, 0, 3, 0F); // 64
		class85Model[61].setRotationPoint(0.85F, 13F, 52F);

		class85Model[62].addBox(0F, 0F, 0F, 0, 1, 1, 0F); // 65
		class85Model[62].setRotationPoint(4F, 10F, 53F);

		class85Model[63].addBox(0F, 0F, 0F, 0, 1, 1, 0F); // 66
		class85Model[63].setRotationPoint(-4.5F, 10F, 53F);

		class85Model[64].addBox(0F, 0F, 0F, 11, 0, 1, 0F); // 67
		class85Model[64].setRotationPoint(-5.5F, -3F, 51.5F);

		class85Model[65].addBox(0F, 0F, 0F, 0, 7, 1, 0F); // 68
		class85Model[65].setRotationPoint(9.5F, -2F, 51.5F);
		class85Model[65].rotateAngleX = 0.08726646F;

		class85Model[66].addBox(0F, 0F, 0F, 0, 7, 1, 0F); // 69
		class85Model[66].setRotationPoint(-9.5F, -2F, 51.5F);
		class85Model[66].rotateAngleX = 0.08726646F;

		class85Model[67].addShapeBox(0F, 0F, 0F, 22, 2, 10, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // 70
		class85Model[67].setRotationPoint(-11F, -15F, 35F);

		class85Model[68].addShapeBox(0F, 0F, 0F, 22, 1, 56, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // 71
		class85Model[68].setRotationPoint(-11F, -14F, -21F);

		class85Model[69].addShapeBox(0F, 0F, 0F, 1, 1, 56, 0F, 0F, 0F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // 72
		class85Model[69].setRotationPoint(10F, -14F, -21F);

		class85Model[70].addShapeBox(0F, 0F, 0F, 1, 1, 56, 0F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // 73
		class85Model[70].setRotationPoint(-11F, -14F, -21F);

		class85Model[71].addBox(0F, 0F, 0F, 0, 7, 1, 0F); // 74
		class85Model[71].setRotationPoint(9.5F, -2F, -38.5F);
		class85Model[71].rotateAngleX = -0.08726646F;

		class85Model[72].addBox(0F, 0F, 0F, 11, 0, 1, 0F); // 75
		class85Model[72].setRotationPoint(-5.5F, -3F, -38.5F);
		class85Model[72].rotateAngleX = -0.17453293F;

		class85Model[73].addBox(0F, 0F, 0F, 0, 7, 1, 0F); // 76
		class85Model[73].setRotationPoint(-9.5F, -2F, -38.5F);
		class85Model[73].rotateAngleX = -0.08726646F;

		class85Model[74].addBox(0F, 0F, 0F, 3, 3, 1, 0F); // 77
		class85Model[74].setRotationPoint(-9F, 9F, -41F);

		class85Model[75].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // 78
		class85Model[75].setRotationPoint(-8F, 10F, -40F);

		class85Model[76].addBox(0F, 0F, 0F, 3, 3, 1, 0F); // 79
		class85Model[76].setRotationPoint(6F, 9F, -41F);

		class85Model[77].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // 80
		class85Model[77].setRotationPoint(7F, 10F, -40F);

		class85Model[78].addBox(0F, 0F, 0F, 0, 1, 1, 0F); // 81
		class85Model[78].setRotationPoint(-4F, 10F, -40F);

		class85Model[79].addBox(0F, 0F, 0F, 1, 0, 2, 0F); // 82
		class85Model[79].setRotationPoint(-4.85F, 12F, -41F);

		class85Model[80].addBox(0F, 0F, 0F, 1, 0, 1, 0F); // 83
		class85Model[80].setRotationPoint(-3.85F, 12F, -41F);

		class85Model[81].addBox(0F, 0F, 0F, 0, 1, 1, 0F); // 84
		class85Model[81].setRotationPoint(-2.85F, 12F, -41F);

		class85Model[82].addBox(0F, 0F, 0F, 1, 0, 1, 0F); // 85
		class85Model[82].setRotationPoint(-2.85F, 13F, -41F);

		class85Model[83].addBox(0F, 0F, 0F, 1, 0, 3, 0F); // 86
		class85Model[83].setRotationPoint(-1.85F, 13F, -41F);

		class85Model[84].addBox(0F, 0F, 0F, 0, 2, 1, 0F); // 87
		class85Model[84].setRotationPoint(-2.3F, 10F, -39.75F);

		class85Model[85].addBox(0F, 0F, 0F, 0, 2, 1, 0F); // 88
		class85Model[85].setRotationPoint(-2F, 10F, -39.75F);

		class85Model[86].addBox(0F, 0F, 0F, 1, 3, 0, 0F); // 89
		class85Model[86].setRotationPoint(-0.5F, 10F, -39.5F);

		class85Model[87].addBox(0F, 0F, 0F, 0, 1, 1, 0F); // 90
		class85Model[87].setRotationPoint(0F, 11F, -39.75F);

		class85Model[88].addBox(0F, 0F, 0F, 1, 0, 1, 0F); // 91
		class85Model[88].setRotationPoint(-0.5F, 10F, -40F);

		class85Model[89].addBox(0F, 0F, 0F, 0, 1, 1, 0F); // 92
		class85Model[89].setRotationPoint(3.5F, 12F, -39F);

		class85Model[90].addBox(0F, 0F, 0F, 0, 1, 1, 0F); // 93
		class85Model[90].setRotationPoint(3.5F, 12F, -40F);

		class85Model[91].addBox(0F, 0F, 0F, 1, 1, 0, 0F); // 94
		class85Model[91].setRotationPoint(2.5F, 12F, -40F);

		class85Model[92].addBox(0F, 0F, 0F, 0, 3, 1, 0F); // 95
		class85Model[92].setRotationPoint(2.5F, 10F, -40F);

		class85Model[93].addShapeBox(0F, 0F, 0F, 22, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // 96
		class85Model[93].setRotationPoint(-11F, 8F, -39F);

		class85Model[94].addBox(0F, 0F, 0F, 1, 0, 1, 0F); // 97
		class85Model[94].setRotationPoint(1.5F, 10F, -40F);

		class85Model[95].addBox(0F, 0F, 0F, 0, 1, 1, 0F); // 98
		class85Model[95].setRotationPoint(4.5F, 10F, -40F);

		class85Model[96].addBox(0F, 0F, 0F, 1, 1, 4, 0F); // 99
		class85Model[96].setRotationPoint(-1.5F, -15F, 24F);

		class85Model[97].addBox(0F, 0F, 0F, 1, 1, 4, 0F); // 100
		class85Model[97].setRotationPoint(0.5F, -15F, 24F);

		class85Model[98].addBox(0F, 0F, 0F, 1, 12, 1, 0F); // 101
		class85Model[98].setRotationPoint(-0.5F, -17F, 16F);
		class85Model[98].rotateAngleX = 1.30899694F;

		class85Model[99].addBox(0F, 0F, 0F, 1, 13, 1, 0F); // 102
		class85Model[99].setRotationPoint(0.5F, -18F, 17F);
		class85Model[99].rotateAngleX = 2.00712864F;
		class85Model[99].rotateAngleY = -0.26179939F;

		class85Model[100].addBox(0F, 0F, 0F, 1, 13, 1, 0F); // 103
		class85Model[100].setRotationPoint(-1.5F, -18F, 17F);
		class85Model[100].rotateAngleX = 2.00712864F;
		class85Model[100].rotateAngleY = 0.26179939F;

		class85Model[101].addBox(0F, 0F, 0F, 4, 2, 2, 0F); // 104
		class85Model[101].setRotationPoint(-2F, -19F, 16F);

		class85Model[102].addBox(0F, 0F, 0F, 10, 1, 1, 0F); // 105
		class85Model[102].setRotationPoint(-5F, -24.5F, 27.5F);

		class85Model[103].addBox(0F, 0F, 0F, 10, 1, 0, 0F); // 106
		class85Model[103].setRotationPoint(-5F, -24.5F, 29F);

		class85Model[104].addBox(0F, 0F, 0F, 10, 1, 1, 0F); // 107
		class85Model[104].setRotationPoint(-5F, -24.5F, 29.5F);

		class85Model[105].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // 108
		class85Model[105].setRotationPoint(-5F, -24.5F, 28.5F);

		class85Model[106].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // 109
		class85Model[106].setRotationPoint(4F, -24.5F, 28.5F);

		class85Model[107].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // 110
		class85Model[107].setRotationPoint(-5F, -23.5F, 28.5F);

		class85Model[108].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F); // 111
		class85Model[108].setRotationPoint(-5F, -23.5F, 27.5F);

		class85Model[109].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // 112
		class85Model[109].setRotationPoint(5F, -23.5F, 28.5F);

		class85Model[110].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F); // 113
		class85Model[110].setRotationPoint(5F, -23.5F, 27.5F);

		class85Model[111].addBox(0F, 0F, 0F, 0, 1, 1, 0F); // 114
		class85Model[111].setRotationPoint(-2F, -24.5F, 28.5F);

		class85Model[112].addBox(0F, 0F, 0F, 0, 1, 1, 0F); // 115
		class85Model[112].setRotationPoint(2F, -24.5F, 28.5F);

		class85Model[113].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // 116
		class85Model[113].setRotationPoint(0.5F, -15F, 32F);

		class85Model[114].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // 117
		class85Model[114].setRotationPoint(-7.5F, -15F, 31F);

		class85Model[115].addBox(0F, 0F, 0F, 1, 1, 5, 0F); // 118
		class85Model[115].setRotationPoint(-4.2F, -16F, 28F);
		class85Model[115].rotateAngleY = 0.78539816F;

		class85Model[116].addBox(0F, 0F, 0F, 1, 1, 4, 0F); // 119
		class85Model[116].setRotationPoint(-4.5F, -16F, 24.7F);

		class85Model[117].addBox(0F, 0F, 0F, 1, 1, 5, 0F); // 120
		class85Model[117].setRotationPoint(-7.7F, -16F, 22F);
		class85Model[117].rotateAngleY = -0.78539816F;

		class85Model[118].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // 121
		class85Model[118].setRotationPoint(-7.5F, -15F, 21.5F);

		class85Model[119].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // 122
		class85Model[119].setRotationPoint(-7.5F, -15F, 15.5F);

		class85Model[120].addBox(0F, 0F, 0F, 1, 0, 7, 0F); // 123
		class85Model[120].setRotationPoint(-7.5F, -15F, 15.5F);

		class85Model[121].addBox(0F, 0F, 0F, 1, 0, 7, 0F); // 124
		class85Model[121].setRotationPoint(-7.5F, -15F, 8.5F);

		class85Model[122].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // 125
		class85Model[122].setRotationPoint(-7.5F, -15F, 8.5F);

		class85Model[123].addBox(0F, 0F, 0F, 2, 2, 7, 0F); // 126
		class85Model[123].setRotationPoint(5.5F, -16F, 16F);

		class85Model[124].addBox(0F, 0F, 0F, 1, 0, 7, 0F); // 127
		class85Model[124].setRotationPoint(-7.5F, -15F, 1.5F);

		class85Model[125].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // 128
		class85Model[125].setRotationPoint(-7.5F, -15F, 1.5F);

		class85Model[126].addBox(0F, 0F, 0F, 1, 0, 10, 0F); // 129
		class85Model[126].setRotationPoint(-7.5F, -15F, 2.25F);
		class85Model[126].rotateAngleY = -0.95993109F;

		class85Model[127].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // 130
		class85Model[127].setRotationPoint(0.5F, -16F, 7F);

		class85Model[128].addBox(0F, 0F, 0F, 1, 0, 7, 0F); // 131
		class85Model[128].setRotationPoint(-7.5F, -15F, -5.5F);

		class85Model[129].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // 132
		class85Model[129].setRotationPoint(-7.5F, -15F, -5.5F);

		class85Model[130].addBox(0F, 0F, 0F, 5, 0, 1, 0F); // 133
		class85Model[130].setRotationPoint(-6.5F, -15F, -5.5F);

		class85Model[131].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // 134
		class85Model[131].setRotationPoint(-2.5F, -15F, -5.5F);

		class85Model[132].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // 135
		class85Model[132].setRotationPoint(-0.5F, -15F, -2.5F);

		class85Model[133].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // 136
		class85Model[133].setRotationPoint(0.5F, -15F, 0.5F);

		class85Model[134].addBox(0F, 0F, 0F, 1, 0, 4, 0F); // 137
		class85Model[134].setRotationPoint(-0.5F, -15F, -2.3F);
		class85Model[134].rotateAngleY = -0.26179939F;

		class85Model[135].addBox(0F, 0F, 0F, 0, 1, 4, 0F); // 138
		class85Model[135].setRotationPoint(1F, -15F, 28F);

		class85Model[136].addBox(0F, 0F, 0F, 1, 14, 0, 0F); // 143
		class85Model[136].setRotationPoint(-12F, -10F, 41F);

		class85Model[137].addBox(0F, 0F, 0F, 1, 14, 0, 0F); // 144
		class85Model[137].setRotationPoint(-12F, -10F, 34F);

		class85Model[138].addBox(0F, 0F, 0F, 1, 14, 0, 0F); // 145
		class85Model[138].setRotationPoint(11F, -10F, 41F);

		class85Model[139].addBox(0F, 0F, 0F, 1, 14, 0, 0F); // 146
		class85Model[139].setRotationPoint(11F, -10F, 34F);

		class85Model[140].addBox(0F, 0F, 0F, 1, 14, 0, 0F); // 147
		class85Model[140].setRotationPoint(-12F, -10F, -20F);

		class85Model[141].addBox(0F, 0F, 0F, 1, 14, 0, 0F); // 148
		class85Model[141].setRotationPoint(-12F, -10F, -27F);

		class85Model[142].addBox(0F, 0F, 0F, 1, 14, 0, 0F); // 149
		class85Model[142].setRotationPoint(11F, -10F, -27F);

		class85Model[143].addBox(0F, 0F, 0F, 1, 14, 0, 0F); // 150
		class85Model[143].setRotationPoint(11F, -10F, -20F);

		class85Model[144].addBox(0F, 0F, 0F, 3, 2, 10, 0F); // 151
		class85Model[144].setRotationPoint(-1.5F, -16F, -21F);

		class85Model[145].addBox(0F, 0F, 0F, 3, 2, 10, 0F); // 152
		class85Model[145].setRotationPoint(-5F, -16F, -21F);

		class85Model[146].addBox(0F, 0F, 0F, 3, 2, 10, 0F); // 153
		class85Model[146].setRotationPoint(2F, -16F, -21F);

		class85Model[147].addShapeBox(0F, 0F, 0F, 5, 8, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // 154
		class85Model[147].setRotationPoint(-10F, 8F, -1F);

		class85Model[148].addShapeBox(0F, 0F, 0F, 5, 8, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // 155
		class85Model[148].setRotationPoint(-10F, 8F, 9F);

		class85Model[149].addShapeBox(0F, 0F, 0F, 5, 8, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // 157
		class85Model[149].setRotationPoint(4F, 8F, -1F);

		class85Model[150].addShapeBox(0F, 0F, 0F, 5, 8, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // 158
		class85Model[150].setRotationPoint(4F, 8F, 9F);

		class85Model[151].addShapeBox(0F, 0F, 0F, 15, 6, 20, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // 160
		class85Model[151].setRotationPoint(-8F, 9F, -2.5F);

		class85Model[152].addBox(0F, 0F, 0F, 20, 19, 1, 0F); // 164
		class85Model[152].setRotationPoint(-10F, -13F, 32F);

		class85Model[153].addBox(0F, 0F, 0F, 20, 19, 1, 0F); // 165
		class85Model[153].setRotationPoint(-10F, -13F, -20F);

		class85Model[154].addBox(0F, 0F, 0F, 20, 1, 3, 0F); // 166
		class85Model[154].setRotationPoint(-10F, -1.5F, 48F);

		class85Model[155].addBox(0F, 0F, 0F, 10, 1, 9, 0F); // Box 181
		class85Model[155].setRotationPoint(-5F, 5F, 38F);

		class85Model[156].addBox(0F, 0F, 0F, 10, 1, 9, 0F); // Box 182
		class85Model[156].setRotationPoint(-5F, 5F, 38F);
		class85Model[156].rotateAngleX = 1.74532925F;

		class85Model[157].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 184
		class85Model[157].setRotationPoint(-9F, -3.75F, 50F);

		class85Model[158].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 185
		class85Model[158].setRotationPoint(-6.5F, -3.75F, 50F);

		class85Model[159].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 186
		class85Model[159].setRotationPoint(-4F, -3.75F, 50F);

		class85Model[160].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 187
		class85Model[160].setRotationPoint(-1.5F, -3.75F, 50F);

		class85Model[161].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 188
		class85Model[161].setRotationPoint(1.5F, -3.5F, 49F);

		class85Model[162].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 189
		class85Model[162].setRotationPoint(3.5F, -3.5F, 49F);

		class85Model[163].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 190
		class85Model[163].setRotationPoint(5.5F, -2.5F, 49F);

		class85Model[164].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 191
		class85Model[164].setRotationPoint(7.5F, -2.5F, 49F);

		class85Model[165].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 192
		class85Model[165].setRotationPoint(-8.5F, -1.6F, 48.5F);

		class85Model[166].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 193
		class85Model[166].setRotationPoint(-6F, -1.6F, 48.5F);

		class85Model[167].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 194
		class85Model[167].setRotationPoint(-3.5F, -1.6F, 48.5F);

		class85Model[168].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 195
		class85Model[168].setRotationPoint(-1F, -1.6F, 48.5F);

		class85Model[169].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 196
		class85Model[169].setRotationPoint(0F, -1.6F, -35.5F);

		class85Model[170].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 197
		class85Model[170].setRotationPoint(2.5F, -1.6F, -35.5F);

		class85Model[171].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 198
		class85Model[171].setRotationPoint(5F, -1.6F, -35.5F);

		class85Model[172].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 199
		class85Model[172].setRotationPoint(7.5F, -1.6F, -35.5F);

		class85Model[173].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 200
		class85Model[173].setRotationPoint(7F, -3.75F, -37F);

		class85Model[174].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 201
		class85Model[174].setRotationPoint(4.5F, -3.75F, -37F);

		class85Model[175].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 202
		class85Model[175].setRotationPoint(2F, -3.75F, -37F);

		class85Model[176].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 203
		class85Model[176].setRotationPoint(-0.5F, -3.75F, -37F);

		class85Model[177].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 204
		class85Model[177].setRotationPoint(-2.5F, -3.5F, -36F);

		class85Model[178].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 205
		class85Model[178].setRotationPoint(-4.5F, -3.5F, -36F);

		class85Model[179].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 206
		class85Model[179].setRotationPoint(-6.5F, -2.5F, -36F);

		class85Model[180].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 207
		class85Model[180].setRotationPoint(-8.5F, -2.5F, -36F);

		class85Model[181].addBox(0F, 0F, 0F, 20, 1, 3, 0F); // Box 208
		class85Model[181].setRotationPoint(-10F, -1.5F, -37F);

		class85Model[182].addBox(0F, 0F, 0F, 10, 1, 9, 0F); // Box 209
		class85Model[182].setRotationPoint(5F, 5F, -25F);
		class85Model[182].rotateAngleY = -3.14159265F;

		class85Model[183].addBox(0F, 0F, 0F, 10, 1, 9, 0F); // Box 210
		class85Model[183].setRotationPoint(5F, 5F, -25F);
		class85Model[183].rotateAngleX = 1.74532925F;
		class85Model[183].rotateAngleY = -3.14159265F;

		class85Model[184].addBox(0F, 0F, 0F, 1, 5, 6, 0F); // Box 192
		class85Model[184].setRotationPoint(10.5F, -10F, -19F);

		class85Model[185].addBox(0F, 0F, 0F, 1, 5, 6, 0F); // Box 193
		class85Model[185].setRotationPoint(10.5F, -10F, -12.5F);

		class85Model[186].addBox(0F, 0F, 0F, 1, 5, 6, 0F); // Box 194
		class85Model[186].setRotationPoint(10.5F, -10F, -6F);

		class85Model[187].addBox(0F, 0F, 0F, 1, 5, 6, 0F); // Box 195
		class85Model[187].setRotationPoint(10.5F, -10F, 0.5F);

		class85Model[188].addBox(0F, 0F, 0F, 1, 5, 6, 0F); // Box 196
		class85Model[188].setRotationPoint(10.5F, -10F, 8F);

		class85Model[189].addBox(0F, 0F, 0F, 1, 5, 6, 0F); // Box 197
		class85Model[189].setRotationPoint(10.5F, -10F, 14.5F);

		class85Model[190].addBox(0F, 0F, 0F, 1, 5, 6, 0F); // Box 198
		class85Model[190].setRotationPoint(10.5F, -10F, 21F);

		class85Model[191].addBox(0F, 0F, 0F, 1, 5, 6, 0F); // Box 199
		class85Model[191].setRotationPoint(10.5F, -10F, 27.5F);

		class85Model[192].addBox(0F, 0F, 0F, 16, 16, 51, 0F); // Box 200
		class85Model[192].setRotationPoint(-8.5F, -10F, -19F);

		fixRotation(class85Model, false, true, true);


	}
	private ModelDeiticBogie fronttrucks = new ModelDeiticBogie();
	private ModelDeiticBogie backtrucks = new ModelDeiticBogie();

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		for(int i = 0; i < 193; i++)
		{
			if (i==30 || i==31 || i==37 || i== 38 || i==39 || i==40 || i==35 || i ==34){
				Minecraft.getMinecraft().entityRenderer.disableLightmap(1D);
			}
			class85Model[i].render(f5);
			if (i==30 || i==31 || i==37 || i== 38 || i==39 || i==40 || i==35 || i ==34){
				Minecraft.getMinecraft().entityRenderer.enableLightmap(1D);
			}
		}

		Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/Class85_Bogie.png"));
		GL11.glPushMatrix();
		GL11.glTranslated(0,0.1,-1.8);
		GL11.glScalef(0.8f,1f,1f);
		fronttrucks.render(entity,f,f1,f2,f3,f4,f5);
		GL11.glPopMatrix();

		GL11.glPushMatrix();
		GL11.glTranslated(0,0.1,1.7);
		GL11.glScalef(0.8f,1f,1f);
		backtrucks.render(entity,f,f1,f2,f3,f4,f5);
		GL11.glPopMatrix();
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
	{
	}

	public ModelRendererTurbo class85Model[];
}