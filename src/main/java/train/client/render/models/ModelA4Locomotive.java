//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2017 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator:
// Created on:23.10.2017 - 15:58:25
// Last changed on: 23.10.2017 - 15:58:25

package train.client.render.models;

import net.minecraft.entity.Entity;
import tmt.ModelBase;
import tmt.ModelRendererTurbo;

public class ModelA4Locomotive extends ModelBase
{
	int textureX = 512;
	int textureY = 512;

	public ModelA4Locomotive()
	{
		a4locomotiveModel = new ModelRendererTurbo[439];
		a4locomotiveModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		a4locomotiveModel[1] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 1
		a4locomotiveModel[2] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 2
		a4locomotiveModel[3] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 4
		a4locomotiveModel[4] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 5
		a4locomotiveModel[5] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 6
		a4locomotiveModel[6] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 7
		a4locomotiveModel[7] = new ModelRendererTurbo(this, 289, 25, textureX, textureY); // Box 8
		a4locomotiveModel[8] = new ModelRendererTurbo(this, 385, 25, textureX, textureY); // Box 9
		a4locomotiveModel[9] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 10
		a4locomotiveModel[10] = new ModelRendererTurbo(this, 97, 49, textureX, textureY); // Box 11
		a4locomotiveModel[11] = new ModelRendererTurbo(this, 145, 49, textureX, textureY); // Box 12
		a4locomotiveModel[12] = new ModelRendererTurbo(this, 57, 73, textureX, textureY); // Box 13
		a4locomotiveModel[13] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 14
		a4locomotiveModel[14] = new ModelRendererTurbo(this, 481, 17, textureX, textureY); // Box 15
		a4locomotiveModel[15] = new ModelRendererTurbo(this, 481, 33, textureX, textureY); // Box 16
		a4locomotiveModel[16] = new ModelRendererTurbo(this, 193, 49, textureX, textureY); // Box 17
		a4locomotiveModel[17] = new ModelRendererTurbo(this, 225, 49, textureX, textureY); // Box 18
		a4locomotiveModel[18] = new ModelRendererTurbo(this, 257, 49, textureX, textureY); // Box 19
		a4locomotiveModel[19] = new ModelRendererTurbo(this, 481, 49, textureX, textureY); // Box 20
		a4locomotiveModel[20] = new ModelRendererTurbo(this, 233, 65, textureX, textureY); // Box 21
		a4locomotiveModel[21] = new ModelRendererTurbo(this, 265, 65, textureX, textureY); // Box 22
		a4locomotiveModel[22] = new ModelRendererTurbo(this, 473, 65, textureX, textureY); // Box 23
		a4locomotiveModel[23] = new ModelRendererTurbo(this, 281, 73, textureX, textureY); // Box 25
		a4locomotiveModel[24] = new ModelRendererTurbo(this, 193, 65, textureX, textureY); // Box 26
		a4locomotiveModel[25] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 27
		a4locomotiveModel[26] = new ModelRendererTurbo(this, 305, 73, textureX, textureY); // Box 28
		a4locomotiveModel[27] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 29
		a4locomotiveModel[28] = new ModelRendererTurbo(this, 481, 9, textureX, textureY); // Box 30
		a4locomotiveModel[29] = new ModelRendererTurbo(this, 497, 9, textureX, textureY); // Box 31
		a4locomotiveModel[30] = new ModelRendererTurbo(this, 505, 9, textureX, textureY); // Box 32
		a4locomotiveModel[31] = new ModelRendererTurbo(this, 217, 65, textureX, textureY); // Box 33
		a4locomotiveModel[32] = new ModelRendererTurbo(this, 481, 17, textureX, textureY); // Box 34
		a4locomotiveModel[33] = new ModelRendererTurbo(this, 337, 73, textureX, textureY); // Box 35
		a4locomotiveModel[34] = new ModelRendererTurbo(this, 497, 17, textureX, textureY); // Box 36
		a4locomotiveModel[35] = new ModelRendererTurbo(this, 481, 33, textureX, textureY); // Box 38
		a4locomotiveModel[36] = new ModelRendererTurbo(this, 497, 33, textureX, textureY); // Box 39
		a4locomotiveModel[37] = new ModelRendererTurbo(this, 217, 57, textureX, textureY); // Box 40
		a4locomotiveModel[38] = new ModelRendererTurbo(this, 249, 57, textureX, textureY); // Box 41
		a4locomotiveModel[39] = new ModelRendererTurbo(this, 497, 65, textureX, textureY); // Box 42
		a4locomotiveModel[40] = new ModelRendererTurbo(this, 257, 65, textureX, textureY); // Box 43
		a4locomotiveModel[41] = new ModelRendererTurbo(this, 361, 73, textureX, textureY); // Box 44
		a4locomotiveModel[42] = new ModelRendererTurbo(this, 393, 73, textureX, textureY); // Box 45
		a4locomotiveModel[43] = new ModelRendererTurbo(this, 417, 73, textureX, textureY); // Box 46
		a4locomotiveModel[44] = new ModelRendererTurbo(this, 505, 17, textureX, textureY); // Box 47
		a4locomotiveModel[45] = new ModelRendererTurbo(this, 481, 25, textureX, textureY); // Box 48
		a4locomotiveModel[46] = new ModelRendererTurbo(this, 497, 25, textureX, textureY); // Box 49
		a4locomotiveModel[47] = new ModelRendererTurbo(this, 505, 33, textureX, textureY); // Box 50
		a4locomotiveModel[48] = new ModelRendererTurbo(this, 481, 41, textureX, textureY); // Box 51
		a4locomotiveModel[49] = new ModelRendererTurbo(this, 497, 41, textureX, textureY); // Box 52
		a4locomotiveModel[50] = new ModelRendererTurbo(this, 505, 41, textureX, textureY); // Box 53
		a4locomotiveModel[51] = new ModelRendererTurbo(this, 433, 73, textureX, textureY); // Box 54
		a4locomotiveModel[52] = new ModelRendererTurbo(this, 233, 81, textureX, textureY); // Box 55
		a4locomotiveModel[53] = new ModelRendererTurbo(this, 329, 73, textureX, textureY); // Box 56
		a4locomotiveModel[54] = new ModelRendererTurbo(this, 353, 73, textureX, textureY); // Box 57
		a4locomotiveModel[55] = new ModelRendererTurbo(this, 385, 73, textureX, textureY); // Box 58
		a4locomotiveModel[56] = new ModelRendererTurbo(this, 457, 73, textureX, textureY); // Box 59
		a4locomotiveModel[57] = new ModelRendererTurbo(this, 257, 81, textureX, textureY); // Box 60
		a4locomotiveModel[58] = new ModelRendererTurbo(this, 305, 81, textureX, textureY); // Box 61
		a4locomotiveModel[59] = new ModelRendererTurbo(this, 329, 81, textureX, textureY); // Box 62
		a4locomotiveModel[60] = new ModelRendererTurbo(this, 345, 81, textureX, textureY); // Box 63
		a4locomotiveModel[61] = new ModelRendererTurbo(this, 377, 81, textureX, textureY); // Box 64
		a4locomotiveModel[62] = new ModelRendererTurbo(this, 409, 81, textureX, textureY); // Box 65
		a4locomotiveModel[63] = new ModelRendererTurbo(this, 273, 81, textureX, textureY); // Box 66
		a4locomotiveModel[64] = new ModelRendererTurbo(this, 425, 81, textureX, textureY); // Box 67
		a4locomotiveModel[65] = new ModelRendererTurbo(this, 457, 81, textureX, textureY); // Box 68
		a4locomotiveModel[66] = new ModelRendererTurbo(this, 472, 116, textureX, textureY); // Box 69
		a4locomotiveModel[67] = new ModelRendererTurbo(this, 329, 89, textureX, textureY); // Box 70
		a4locomotiveModel[68] = new ModelRendererTurbo(this, 257, 89, textureX, textureY); // Box 71
		a4locomotiveModel[69] = new ModelRendererTurbo(this, 289, 89, textureX, textureY); // Box 72
		a4locomotiveModel[70] = new ModelRendererTurbo(this, 361, 89, textureX, textureY); // Box 73
		a4locomotiveModel[71] = new ModelRendererTurbo(this, 497, 89, textureX, textureY); // Box 74
		a4locomotiveModel[72] = new ModelRendererTurbo(this, 465, 89, textureX, textureY); // Box 76
		a4locomotiveModel[73] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 77
		a4locomotiveModel[74] = new ModelRendererTurbo(this, 17, 97, textureX, textureY); // Box 79
		a4locomotiveModel[75] = new ModelRendererTurbo(this, 33, 97, textureX, textureY); // Box 80
		a4locomotiveModel[76] = new ModelRendererTurbo(this, 65, 97, textureX, textureY); // Box 82
		a4locomotiveModel[77] = new ModelRendererTurbo(this, 81, 97, textureX, textureY); // Box 83
		a4locomotiveModel[78] = new ModelRendererTurbo(this, 233, 97, textureX, textureY); // Box 84
		a4locomotiveModel[79] = new ModelRendererTurbo(this, 249, 97, textureX, textureY); // Box 85
		a4locomotiveModel[80] = new ModelRendererTurbo(this, 353, 97, textureX, textureY); // Box 89
		a4locomotiveModel[81] = new ModelRendererTurbo(this, 456, 96, textureX, textureY); // Box 86
		a4locomotiveModel[82] = new ModelRendererTurbo(this, 489, 97, textureX, textureY); // Box 88
		a4locomotiveModel[83] = new ModelRendererTurbo(this, 33, 105, textureX, textureY); // Box 89
		a4locomotiveModel[84] = new ModelRendererTurbo(this, 281, 65, textureX, textureY); // Box 90
		a4locomotiveModel[85] = new ModelRendererTurbo(this, 505, 73, textureX, textureY); // Box 91
		a4locomotiveModel[86] = new ModelRendererTurbo(this, 505, 81, textureX, textureY); // Box 92
		a4locomotiveModel[87] = new ModelRendererTurbo(this, 233, 105, textureX, textureY); // Box 93
		a4locomotiveModel[88] = new ModelRendererTurbo(this, 273, 105, textureX, textureY); // Box 94
		a4locomotiveModel[89] = new ModelRendererTurbo(this, 57, 105, textureX, textureY); // Box 95
		a4locomotiveModel[90] = new ModelRendererTurbo(this, 217, 49, textureX, textureY); // Box 96
		a4locomotiveModel[91] = new ModelRendererTurbo(this, 313, 105, textureX, textureY); // Box 97
		a4locomotiveModel[92] = new ModelRendererTurbo(this, 369, 105, textureX, textureY); // Box 100
		a4locomotiveModel[93] = new ModelRendererTurbo(this, 441, 105, textureX, textureY); // Box 101
		a4locomotiveModel[94] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 102
		a4locomotiveModel[95] = new ModelRendererTurbo(this, 91, 362, textureX, textureY); // Box 103
		a4locomotiveModel[96] = new ModelRendererTurbo(this, 17, 113, textureX, textureY); // Box 107
		a4locomotiveModel[97] = new ModelRendererTurbo(this, 297, 113, textureX, textureY); // Box 109
		a4locomotiveModel[98] = new ModelRendererTurbo(this, 329, 113, textureX, textureY); // Box 110
		a4locomotiveModel[99] = new ModelRendererTurbo(this, 40, 121, textureX, textureY); // Box 111
		a4locomotiveModel[100] = new ModelRendererTurbo(this, 281, 57, textureX, textureY); // Box 112
		a4locomotiveModel[101] = new ModelRendererTurbo(this, 505, 57, textureX, textureY); // Box 113
		a4locomotiveModel[102] = new ModelRendererTurbo(this, 40, 121, textureX, textureY); // Box 114
		a4locomotiveModel[103] = new ModelRendererTurbo(this, 433, 105, textureX, textureY); // Box 116
		a4locomotiveModel[104] = new ModelRendererTurbo(this, 465, 105, textureX, textureY); // Box 117
		a4locomotiveModel[105] = new ModelRendererTurbo(this, 497, 105, textureX, textureY); // Box 118
		a4locomotiveModel[106] = new ModelRendererTurbo(this, 33, 113, textureX, textureY); // Box 119
		a4locomotiveModel[107] = new ModelRendererTurbo(this, 121, 129, textureX, textureY); // Box 123
		a4locomotiveModel[108] = new ModelRendererTurbo(this, 369, 121, textureX, textureY); // Box 124
		a4locomotiveModel[109] = new ModelRendererTurbo(this, 368, 129, textureX, textureY); // Box 126
		a4locomotiveModel[110] = new ModelRendererTurbo(this, 438, 295, textureX, textureY); // Box 127
		a4locomotiveModel[111] = new ModelRendererTurbo(this, 362, 304, textureX, textureY); // Box 129
		a4locomotiveModel[112] = new ModelRendererTurbo(this, 157, 346, textureX, textureY); // Box 130
		a4locomotiveModel[113] = new ModelRendererTurbo(this, 412, 315, textureX, textureY); // Box 131
		a4locomotiveModel[114] = new ModelRendererTurbo(this, 51, 354, textureX, textureY); // Box 132
		a4locomotiveModel[115] = new ModelRendererTurbo(this, 0, 357, textureX, textureY); // Box 133
		a4locomotiveModel[116] = new ModelRendererTurbo(this, 361, 153, textureX, textureY); // Box 134
		a4locomotiveModel[117] = new ModelRendererTurbo(this, 1, 169, textureX, textureY); // Box 135
		a4locomotiveModel[118] = new ModelRendererTurbo(this, 81, 137, textureX, textureY); // Box 137
		a4locomotiveModel[119] = new ModelRendererTurbo(this, 321, 113, textureX, textureY); // Box 138
		a4locomotiveModel[120] = new ModelRendererTurbo(this, 201, 121, textureX, textureY); // Box 139
		a4locomotiveModel[121] = new ModelRendererTurbo(this, 225, 121, textureX, textureY); // Box 140
		a4locomotiveModel[122] = new ModelRendererTurbo(this, 369, 145, textureX, textureY); // Box 142
		a4locomotiveModel[123] = new ModelRendererTurbo(this, 1, 121, textureX, textureY); // Box 144
		a4locomotiveModel[124] = new ModelRendererTurbo(this, 209, 300, textureX, textureY); // Box 145
		a4locomotiveModel[125] = new ModelRendererTurbo(this, 51, 354, textureX, textureY); // Box 150
		a4locomotiveModel[126] = new ModelRendererTurbo(this, 0, 357, textureX, textureY); // Box 151
		a4locomotiveModel[127] = new ModelRendererTurbo(this, 216, 98, textureX, textureY); // Box 152
		a4locomotiveModel[128] = new ModelRendererTurbo(this, 105, 137, textureX, textureY); // Box 153
		a4locomotiveModel[129] = new ModelRendererTurbo(this, 393, 145, textureX, textureY); // Box 154
		a4locomotiveModel[130] = new ModelRendererTurbo(this, 409, 145, textureX, textureY); // Box 155
		a4locomotiveModel[131] = new ModelRendererTurbo(this, 81, 153, textureX, textureY); // Box 156
		a4locomotiveModel[132] = new ModelRendererTurbo(this, 321, 161, textureX, textureY); // Box 157
		a4locomotiveModel[133] = new ModelRendererTurbo(this, 432, 144, textureX, textureY); // Box 158
		a4locomotiveModel[134] = new ModelRendererTurbo(this, 345, 169, textureX, textureY); // Box 159
		a4locomotiveModel[135] = new ModelRendererTurbo(this, 1, 161, textureX, textureY); // Box 160
		a4locomotiveModel[136] = new ModelRendererTurbo(this, 241, 169, textureX, textureY); // Box 161
		a4locomotiveModel[137] = new ModelRendererTurbo(this, 321, 177, textureX, textureY); // Box 163
		a4locomotiveModel[138] = new ModelRendererTurbo(this, 417, 177, textureX, textureY); // Box 164
		a4locomotiveModel[139] = new ModelRendererTurbo(this, 241, 185, textureX, textureY); // Box 165
		a4locomotiveModel[140] = new ModelRendererTurbo(this, 329, 185, textureX, textureY); // Box 166
		a4locomotiveModel[141] = new ModelRendererTurbo(this, 105, 153, textureX, textureY); // Box 167
		a4locomotiveModel[142] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 157
		a4locomotiveModel[143] = new ModelRendererTurbo(this, 361, 113, textureX, textureY); // Box 158
		a4locomotiveModel[144] = new ModelRendererTurbo(this, 249, 49, textureX, textureY); // Box 159
		a4locomotiveModel[145] = new ModelRendererTurbo(this, 281, 49, textureX, textureY); // Box 160
		a4locomotiveModel[146] = new ModelRendererTurbo(this, 1, 193, textureX, textureY); // Box 161
		a4locomotiveModel[147] = new ModelRendererTurbo(this, 505, 49, textureX, textureY); // Box 163
		a4locomotiveModel[148] = new ModelRendererTurbo(this, 193, 65, textureX, textureY); // Box 164
		a4locomotiveModel[149] = new ModelRendererTurbo(this, 265, 65, textureX, textureY); // Box 165
		a4locomotiveModel[150] = new ModelRendererTurbo(this, 505, 65, textureX, textureY); // Box 166
		a4locomotiveModel[151] = new ModelRendererTurbo(this, 465, 73, textureX, textureY); // Box 167
		a4locomotiveModel[152] = new ModelRendererTurbo(this, 233, 81, textureX, textureY); // Box 168
		a4locomotiveModel[153] = new ModelRendererTurbo(this, 265, 81, textureX, textureY); // Box 169
		a4locomotiveModel[154] = new ModelRendererTurbo(this, 305, 81, textureX, textureY); // Box 170
		a4locomotiveModel[155] = new ModelRendererTurbo(this, 337, 81, textureX, textureY); // Box 171
		a4locomotiveModel[156] = new ModelRendererTurbo(this, 25, 97, textureX, textureY); // Box 172
		a4locomotiveModel[157] = new ModelRendererTurbo(this, 81, 105, textureX, textureY); // Box 173
		a4locomotiveModel[158] = new ModelRendererTurbo(this, 441, 169, textureX, textureY); // Box 174
		a4locomotiveModel[159] = new ModelRendererTurbo(this, 241, 193, textureX, textureY); // Box 175
		a4locomotiveModel[160] = new ModelRendererTurbo(this, 441, 113, textureX, textureY); // Box 176
		a4locomotiveModel[161] = new ModelRendererTurbo(this, 105, 161, textureX, textureY); // Box 178
		a4locomotiveModel[162] = new ModelRendererTurbo(this, 81, 137, textureX, textureY); // Box 179
		a4locomotiveModel[163] = new ModelRendererTurbo(this, 345, 161, textureX, textureY); // Box 180
		a4locomotiveModel[164] = new ModelRendererTurbo(this, 131, 299, textureX, textureY); // Box 182
		a4locomotiveModel[165] = new ModelRendererTurbo(this, 465, 113, textureX, textureY); // Box 183
		a4locomotiveModel[166] = new ModelRendererTurbo(this, 505, 113, textureX, textureY); // Box 184
		a4locomotiveModel[167] = new ModelRendererTurbo(this, 465, 121, textureX, textureY); // Box 185
		a4locomotiveModel[168] = new ModelRendererTurbo(this, 505, 121, textureX, textureY); // Box 186
		a4locomotiveModel[169] = new ModelRendererTurbo(this, 33, 129, textureX, textureY); // Box 187
		a4locomotiveModel[170] = new ModelRendererTurbo(this, 273, 129, textureX, textureY); // Box 188
		a4locomotiveModel[171] = new ModelRendererTurbo(this, 121, 137, textureX, textureY); // Box 189
		a4locomotiveModel[172] = new ModelRendererTurbo(this, 273, 137, textureX, textureY); // Box 190
		a4locomotiveModel[173] = new ModelRendererTurbo(this, 81, 145, textureX, textureY); // Box 191
		a4locomotiveModel[174] = new ModelRendererTurbo(this, 465, 185, textureX, textureY); // Box 192
		a4locomotiveModel[175] = new ModelRendererTurbo(this, 1, 201, textureX, textureY); // Box 193
		a4locomotiveModel[176] = new ModelRendererTurbo(this, 465, 169, textureX, textureY); // Box 194
		a4locomotiveModel[177] = new ModelRendererTurbo(this, 361, 193, textureX, textureY); // Box 195
		a4locomotiveModel[178] = new ModelRendererTurbo(this, 137, 193, textureX, textureY); // Box 196
		a4locomotiveModel[179] = new ModelRendererTurbo(this, 1, 169, textureX, textureY); // Box 197
		a4locomotiveModel[180] = new ModelRendererTurbo(this, 137, 169, textureX, textureY); // Box 198
		a4locomotiveModel[181] = new ModelRendererTurbo(this, 145, 169, textureX, textureY); // Box 199
		a4locomotiveModel[182] = new ModelRendererTurbo(this, 73, 201, textureX, textureY); // Box 200
		a4locomotiveModel[183] = new ModelRendererTurbo(this, 265, 177, textureX, textureY); // Box 201
		a4locomotiveModel[184] = new ModelRendererTurbo(this, 409, 193, textureX, textureY); // Box 202
		a4locomotiveModel[185] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Box 203
		a4locomotiveModel[186] = new ModelRendererTurbo(this, 449, 145, textureX, textureY); // Box 204
		a4locomotiveModel[187] = new ModelRendererTurbo(this, 33, 161, textureX, textureY); // Box 205
		a4locomotiveModel[188] = new ModelRendererTurbo(this, 273, 169, textureX, textureY); // Box 206
		a4locomotiveModel[189] = new ModelRendererTurbo(this, 321, 161, textureX, textureY); // Box 208
		a4locomotiveModel[190] = new ModelRendererTurbo(this, 465, 193, textureX, textureY); // Box 209
		a4locomotiveModel[191] = new ModelRendererTurbo(this, 153, 201, textureX, textureY); // Box 207
		a4locomotiveModel[192] = new ModelRendererTurbo(this, 217, 201, textureX, textureY); // Box 208
		a4locomotiveModel[193] = new ModelRendererTurbo(this, 273, 201, textureX, textureY); // Box 209
		a4locomotiveModel[194] = new ModelRendererTurbo(this, 481, 193, textureX, textureY); // Box 210
		a4locomotiveModel[195] = new ModelRendererTurbo(this, 345, 201, textureX, textureY); // Box 211
		a4locomotiveModel[196] = new ModelRendererTurbo(this, 153, 209, textureX, textureY); // Box 212
		a4locomotiveModel[197] = new ModelRendererTurbo(this, 353, 209, textureX, textureY); // Box 213
		a4locomotiveModel[198] = new ModelRendererTurbo(this, 465, 201, textureX, textureY); // Box 214
		a4locomotiveModel[199] = new ModelRendererTurbo(this, 489, 201, textureX, textureY); // Box 215
		a4locomotiveModel[200] = new ModelRendererTurbo(this, 73, 209, textureX, textureY); // Box 216
		a4locomotiveModel[201] = new ModelRendererTurbo(this, 105, 209, textureX, textureY); // Box 217
		a4locomotiveModel[202] = new ModelRendererTurbo(this, 121, 209, textureX, textureY); // Box 218
		a4locomotiveModel[203] = new ModelRendererTurbo(this, 217, 209, textureX, textureY); // Box 219
		a4locomotiveModel[204] = new ModelRendererTurbo(this, 505, 185, textureX, textureY); // Box 221
		a4locomotiveModel[205] = new ModelRendererTurbo(this, 489, 169, textureX, textureY); // Box 222
		a4locomotiveModel[206] = new ModelRendererTurbo(this, 1, 201, textureX, textureY); // Box 223
		a4locomotiveModel[207] = new ModelRendererTurbo(this, 457, 185, textureX, textureY); // Box 224
		a4locomotiveModel[208] = new ModelRendererTurbo(this, 210, 217, textureX, textureY); // Box 226
		a4locomotiveModel[209] = new ModelRendererTurbo(this, 201, 217, textureX, textureY); // Box 227
		a4locomotiveModel[210] = new ModelRendererTurbo(this, 265, 217, textureX, textureY); // Box 228
		a4locomotiveModel[211] = new ModelRendererTurbo(this, 238, 206, textureX, textureY); // Box 230
		a4locomotiveModel[212] = new ModelRendererTurbo(this, 497, 193, textureX, textureY); // Box 232
		a4locomotiveModel[213] = new ModelRendererTurbo(this, 289, 217, textureX, textureY); // Box 233
		a4locomotiveModel[214] = new ModelRendererTurbo(this, 305, 217, textureX, textureY); // Box 234
		a4locomotiveModel[215] = new ModelRendererTurbo(this, 481, 201, textureX, textureY); // Box 235
		a4locomotiveModel[216] = new ModelRendererTurbo(this, 1, 209, textureX, textureY); // Box 236
		a4locomotiveModel[217] = new ModelRendererTurbo(this, 465, 201, textureX, textureY); // Box 237
		a4locomotiveModel[218] = new ModelRendererTurbo(this, 321, 217, textureX, textureY); // Box 238
		a4locomotiveModel[219] = new ModelRendererTurbo(this, 505, 201, textureX, textureY); // Box 239
		a4locomotiveModel[220] = new ModelRendererTurbo(this, 73, 209, textureX, textureY); // Box 240
		a4locomotiveModel[221] = new ModelRendererTurbo(this, 97, 209, textureX, textureY); // Box 241
		a4locomotiveModel[222] = new ModelRendererTurbo(this, 233, 209, textureX, textureY); // Box 242
		a4locomotiveModel[223] = new ModelRendererTurbo(this, 417, 209, textureX, textureY); // Box 243
		a4locomotiveModel[224] = new ModelRendererTurbo(this, 441, 217, textureX, textureY); // Box 244
		a4locomotiveModel[225] = new ModelRendererTurbo(this, 449, 217, textureX, textureY); // Box 245
		a4locomotiveModel[226] = new ModelRendererTurbo(this, 457, 217, textureX, textureY); // Box 246
		a4locomotiveModel[227] = new ModelRendererTurbo(this, 465, 217, textureX, textureY); // Box 247
		a4locomotiveModel[228] = new ModelRendererTurbo(this, 481, 217, textureX, textureY); // Box 248
		a4locomotiveModel[229] = new ModelRendererTurbo(this, 489, 217, textureX, textureY); // Box 249
		a4locomotiveModel[230] = new ModelRendererTurbo(this, 497, 217, textureX, textureY); // Box 250
		a4locomotiveModel[231] = new ModelRendererTurbo(this, 1, 225, textureX, textureY); // Box 251
		a4locomotiveModel[232] = new ModelRendererTurbo(this, 25, 225, textureX, textureY); // Box 252
		a4locomotiveModel[233] = new ModelRendererTurbo(this, 73, 225, textureX, textureY); // Box 253
		a4locomotiveModel[234] = new ModelRendererTurbo(this, 289, 225, textureX, textureY); // Box 254
		a4locomotiveModel[235] = new ModelRendererTurbo(this, 329, 225, textureX, textureY); // Box 255
		a4locomotiveModel[236] = new ModelRendererTurbo(this, 505, 217, textureX, textureY); // Box 256
		a4locomotiveModel[237] = new ModelRendererTurbo(this, 345, 225, textureX, textureY); // Box 257
		a4locomotiveModel[238] = new ModelRendererTurbo(this, 97, 225, textureX, textureY); // Box 258
		a4locomotiveModel[239] = new ModelRendererTurbo(this, 409, 225, textureX, textureY); // Box 259
		a4locomotiveModel[240] = new ModelRendererTurbo(this, 417, 225, textureX, textureY); // Box 260
		a4locomotiveModel[241] = new ModelRendererTurbo(this, 433, 225, textureX, textureY); // Box 261
		a4locomotiveModel[242] = new ModelRendererTurbo(this, 449, 225, textureX, textureY); // Box 262
		a4locomotiveModel[243] = new ModelRendererTurbo(this, 457, 225, textureX, textureY); // Box 263
		a4locomotiveModel[244] = new ModelRendererTurbo(this, 438, 295, textureX, textureY); // Box 264
		a4locomotiveModel[245] = new ModelRendererTurbo(this, 131, 299, textureX, textureY); // Box 265
		a4locomotiveModel[246] = new ModelRendererTurbo(this, 1, 233, textureX, textureY); // Box 266
		a4locomotiveModel[247] = new ModelRendererTurbo(this, 143, 230, textureX, textureY); // Box 267
		a4locomotiveModel[248] = new ModelRendererTurbo(this, 497, 225, textureX, textureY); // Box 268
		a4locomotiveModel[249] = new ModelRendererTurbo(this, 73, 233, textureX, textureY); // Box 269
		a4locomotiveModel[250] = new ModelRendererTurbo(this, 489, 225, textureX, textureY); // Box 270
		a4locomotiveModel[251] = new ModelRendererTurbo(this, 225, 233, textureX, textureY); // Box 271
		a4locomotiveModel[252] = new ModelRendererTurbo(this, 89, 233, textureX, textureY); // Box 272
		a4locomotiveModel[253] = new ModelRendererTurbo(this, 254, 206, textureX, textureY); // Box 277
		a4locomotiveModel[254] = new ModelRendererTurbo(this, 289, 233, textureX, textureY); // Box 270
		a4locomotiveModel[255] = new ModelRendererTurbo(this, 345, 233, textureX, textureY); // Box 271
		a4locomotiveModel[256] = new ModelRendererTurbo(this, 401, 233, textureX, textureY); // Box 272
		a4locomotiveModel[257] = new ModelRendererTurbo(this, 25, 241, textureX, textureY); // Box 273
		a4locomotiveModel[258] = new ModelRendererTurbo(this, 73, 233, textureX, textureY); // Box 274
		a4locomotiveModel[259] = new ModelRendererTurbo(this, 313, 233, textureX, textureY); // Box 275
		a4locomotiveModel[260] = new ModelRendererTurbo(this, 393, 233, textureX, textureY); // Box 276
		a4locomotiveModel[261] = new ModelRendererTurbo(this, 441, 233, textureX, textureY); // Box 277
		a4locomotiveModel[262] = new ModelRendererTurbo(this, 497, 233, textureX, textureY); // Box 278
		a4locomotiveModel[263] = new ModelRendererTurbo(this, 105, 233, textureX, textureY); // Box 279
		a4locomotiveModel[264] = new ModelRendererTurbo(this, 137, 233, textureX, textureY); // Box 280
		a4locomotiveModel[265] = new ModelRendererTurbo(this, 145, 241, textureX, textureY); // Box 281
		a4locomotiveModel[266] = new ModelRendererTurbo(this, 153, 241, textureX, textureY); // Box 282
		a4locomotiveModel[267] = new ModelRendererTurbo(this, 241, 233, textureX, textureY); // Box 286
		a4locomotiveModel[268] = new ModelRendererTurbo(this, 73, 241, textureX, textureY); // Box 287
		a4locomotiveModel[269] = new ModelRendererTurbo(this, 161, 241, textureX, textureY); // Box 288
		a4locomotiveModel[270] = new ModelRendererTurbo(this, 177, 241, textureX, textureY); // Box 289
		a4locomotiveModel[271] = new ModelRendererTurbo(this, 193, 241, textureX, textureY); // Box 290
		a4locomotiveModel[272] = new ModelRendererTurbo(this, 209, 241, textureX, textureY); // Box 257
		a4locomotiveModel[273] = new ModelRendererTurbo(this, 97, 241, textureX, textureY); // Box 268
		a4locomotiveModel[274] = new ModelRendererTurbo(this, 225, 241, textureX, textureY); // Box 269
		a4locomotiveModel[275] = new ModelRendererTurbo(this, 233, 241, textureX, textureY); // Box 270
		a4locomotiveModel[276] = new ModelRendererTurbo(this, 241, 241, textureX, textureY); // Box 271
		a4locomotiveModel[277] = new ModelRendererTurbo(this, 249, 241, textureX, textureY); // Box 272
		a4locomotiveModel[278] = new ModelRendererTurbo(this, 145, 249, textureX, textureY); // Box 302
		a4locomotiveModel[279] = new ModelRendererTurbo(this, 257, 241, textureX, textureY); // Box 303
		a4locomotiveModel[280] = new ModelRendererTurbo(this, 265, 241, textureX, textureY); // Box 304
		a4locomotiveModel[281] = new ModelRendererTurbo(this, 273, 241, textureX, textureY); // Box 305
		a4locomotiveModel[282] = new ModelRendererTurbo(this, 281, 241, textureX, textureY); // Box 306
		a4locomotiveModel[283] = new ModelRendererTurbo(this, 185, 249, textureX, textureY); // Box 307
		a4locomotiveModel[284] = new ModelRendererTurbo(this, 321, 241, textureX, textureY); // Box 308
		a4locomotiveModel[285] = new ModelRendererTurbo(this, 393, 241, textureX, textureY); // Box 309
		a4locomotiveModel[286] = new ModelRendererTurbo(this, 401, 241, textureX, textureY); // Box 310
		a4locomotiveModel[287] = new ModelRendererTurbo(this, 409, 241, textureX, textureY); // Box 311
		a4locomotiveModel[288] = new ModelRendererTurbo(this, 241, 249, textureX, textureY); // Box 312
		a4locomotiveModel[289] = new ModelRendererTurbo(this, 1, 257, textureX, textureY); // Box 313
		a4locomotiveModel[290] = new ModelRendererTurbo(this, 441, 241, textureX, textureY); // Box 314
		a4locomotiveModel[291] = new ModelRendererTurbo(this, 25, 105, textureX, textureY); // Box 315
		a4locomotiveModel[292] = new ModelRendererTurbo(this, 433, 217, textureX, textureY); // Box 316
		a4locomotiveModel[293] = new ModelRendererTurbo(this, 449, 241, textureX, textureY); // Box 317
		a4locomotiveModel[294] = new ModelRendererTurbo(this, 497, 241, textureX, textureY); // Box 314
		a4locomotiveModel[295] = new ModelRendererTurbo(this, 345, 249, textureX, textureY); // Box 315
		a4locomotiveModel[296] = new ModelRendererTurbo(this, 145, 257, textureX, textureY); // Box 316
		a4locomotiveModel[297] = new ModelRendererTurbo(this, 505, 241, textureX, textureY); // Box 317
		a4locomotiveModel[298] = new ModelRendererTurbo(this, 1, 249, textureX, textureY); // Box 318
		a4locomotiveModel[299] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 319
		a4locomotiveModel[300] = new ModelRendererTurbo(this, 209, 249, textureX, textureY); // Box 320
		a4locomotiveModel[301] = new ModelRendererTurbo(this, 9, 249, textureX, textureY); // Box 321
		a4locomotiveModel[302] = new ModelRendererTurbo(this, 377, 249, textureX, textureY); // Box 322
		a4locomotiveModel[303] = new ModelRendererTurbo(this, 385, 249, textureX, textureY); // Box 323
		a4locomotiveModel[304] = new ModelRendererTurbo(this, 489, 17, textureX, textureY); // Box 324
		a4locomotiveModel[305] = new ModelRendererTurbo(this, 449, 105, textureX, textureY); // Box 325
		a4locomotiveModel[306] = new ModelRendererTurbo(this, 177, 257, textureX, textureY); // Box 326
		a4locomotiveModel[307] = new ModelRendererTurbo(this, 497, 249, textureX, textureY); // Box 327
		a4locomotiveModel[308] = new ModelRendererTurbo(this, 505, 249, textureX, textureY); // Box 328
		a4locomotiveModel[309] = new ModelRendererTurbo(this, 217, 257, textureX, textureY); // Box 329
		a4locomotiveModel[310] = new ModelRendererTurbo(this, 489, 9, textureX, textureY); // Box 330
		a4locomotiveModel[311] = new ModelRendererTurbo(this, 233, 257, textureX, textureY); // Box 331
		a4locomotiveModel[312] = new ModelRendererTurbo(this, 345, 257, textureX, textureY); // Box 332
		a4locomotiveModel[313] = new ModelRendererTurbo(this, 385, 257, textureX, textureY); // Box 333
		a4locomotiveModel[314] = new ModelRendererTurbo(this, 393, 257, textureX, textureY); // Box 334
		a4locomotiveModel[315] = new ModelRendererTurbo(this, 401, 257, textureX, textureY); // Box 335
		a4locomotiveModel[316] = new ModelRendererTurbo(this, 481, 33, textureX, textureY); // Box 336
		a4locomotiveModel[317] = new ModelRendererTurbo(this, 417, 257, textureX, textureY); // Box 337
		a4locomotiveModel[318] = new ModelRendererTurbo(this, 505, 257, textureX, textureY); // Box 338
		a4locomotiveModel[319] = new ModelRendererTurbo(this, 105, 265, textureX, textureY); // Box 339
		a4locomotiveModel[320] = new ModelRendererTurbo(this, 377, 233, textureX, textureY); // Box 340
		a4locomotiveModel[321] = new ModelRendererTurbo(this, 105, 265, textureX, textureY); // Box 341
		a4locomotiveModel[322] = new ModelRendererTurbo(this, 129, 265, textureX, textureY); // Box 342
		a4locomotiveModel[323] = new ModelRendererTurbo(this, 145, 265, textureX, textureY); // Box 343
		a4locomotiveModel[324] = new ModelRendererTurbo(this, 161, 265, textureX, textureY); // Box 344
		a4locomotiveModel[325] = new ModelRendererTurbo(this, 177, 265, textureX, textureY); // Box 345
		a4locomotiveModel[326] = new ModelRendererTurbo(this, 193, 265, textureX, textureY); // Box 346
		a4locomotiveModel[327] = new ModelRendererTurbo(this, 241, 265, textureX, textureY); // Box 347
		a4locomotiveModel[328] = new ModelRendererTurbo(this, 257, 265, textureX, textureY); // Box 348
		a4locomotiveModel[329] = new ModelRendererTurbo(this, 265, 265, textureX, textureY); // Box 350
		a4locomotiveModel[330] = new ModelRendererTurbo(this, 273, 265, textureX, textureY); // Box 351
		a4locomotiveModel[331] = new ModelRendererTurbo(this, 281, 265, textureX, textureY); // Box 352
		a4locomotiveModel[332] = new ModelRendererTurbo(this, 289, 265, textureX, textureY); // Box 353
		a4locomotiveModel[333] = new ModelRendererTurbo(this, 297, 265, textureX, textureY); // Box 354
		a4locomotiveModel[334] = new ModelRendererTurbo(this, 129, 129, textureX, textureY); // Box 355
		a4locomotiveModel[335] = new ModelRendererTurbo(this, 305, 265, textureX, textureY); // Box 356
		a4locomotiveModel[336] = new ModelRendererTurbo(this, 377, 265, textureX, textureY); // Box 357
		a4locomotiveModel[337] = new ModelRendererTurbo(this, 385, 265, textureX, textureY); // Box 358
		a4locomotiveModel[338] = new ModelRendererTurbo(this, 393, 265, textureX, textureY); // Box 359
		a4locomotiveModel[339] = new ModelRendererTurbo(this, 433, 265, textureX, textureY); // Box 360
		a4locomotiveModel[340] = new ModelRendererTurbo(this, 441, 265, textureX, textureY); // Box 361
		a4locomotiveModel[341] = new ModelRendererTurbo(this, 449, 265, textureX, textureY); // Box 362
		a4locomotiveModel[342] = new ModelRendererTurbo(this, 1, 273, textureX, textureY); // Box 363
		a4locomotiveModel[343] = new ModelRendererTurbo(this, 489, 265, textureX, textureY); // Box 364
		a4locomotiveModel[344] = new ModelRendererTurbo(this, 497, 265, textureX, textureY); // Box 365
		a4locomotiveModel[345] = new ModelRendererTurbo(this, 505, 265, textureX, textureY); // Box 366
		a4locomotiveModel[346] = new ModelRendererTurbo(this, 489, 33, textureX, textureY); // Box 367
		a4locomotiveModel[347] = new ModelRendererTurbo(this, 41, 273, textureX, textureY); // Box 368
		a4locomotiveModel[348] = new ModelRendererTurbo(this, 49, 273, textureX, textureY); // Box 369
		a4locomotiveModel[349] = new ModelRendererTurbo(this, 497, 33, textureX, textureY); // Box 370
		a4locomotiveModel[350] = new ModelRendererTurbo(this, 65, 273, textureX, textureY); // Box 371
		a4locomotiveModel[351] = new ModelRendererTurbo(this, 137, 273, textureX, textureY); // Box 372
		a4locomotiveModel[352] = new ModelRendererTurbo(this, 73, 273, textureX, textureY); // Box 373
		a4locomotiveModel[353] = new ModelRendererTurbo(this, 81, 273, textureX, textureY); // Box 374
		a4locomotiveModel[354] = new ModelRendererTurbo(this, 89, 273, textureX, textureY); // Box 375
		a4locomotiveModel[355] = new ModelRendererTurbo(this, 9, 169, textureX, textureY); // Box 376
		a4locomotiveModel[356] = new ModelRendererTurbo(this, 489, 41, textureX, textureY); // Box 377
		a4locomotiveModel[357] = new ModelRendererTurbo(this, 105, 273, textureX, textureY); // Box 378
		a4locomotiveModel[358] = new ModelRendererTurbo(this, 225, 273, textureX, textureY); // Box 379
		a4locomotiveModel[359] = new ModelRendererTurbo(this, 257, 273, textureX, textureY); // Box 380
		a4locomotiveModel[360] = new ModelRendererTurbo(this, 129, 273, textureX, textureY); // Box 381
		a4locomotiveModel[361] = new ModelRendererTurbo(this, 289, 273, textureX, textureY); // Box 382
		a4locomotiveModel[362] = new ModelRendererTurbo(this, 329, 273, textureX, textureY); // Box 383
		a4locomotiveModel[363] = new ModelRendererTurbo(this, 337, 273, textureX, textureY); // Box 384
		a4locomotiveModel[364] = new ModelRendererTurbo(this, 361, 273, textureX, textureY); // Box 385
		a4locomotiveModel[365] = new ModelRendererTurbo(this, 369, 273, textureX, textureY); // Box 386
		a4locomotiveModel[366] = new ModelRendererTurbo(this, 377, 273, textureX, textureY); // Box 387
		a4locomotiveModel[367] = new ModelRendererTurbo(this, 401, 273, textureX, textureY); // Box 120
		a4locomotiveModel[368] = new ModelRendererTurbo(this, 409, 273, textureX, textureY); // Box 121
		a4locomotiveModel[369] = new ModelRendererTurbo(this, 417, 273, textureX, textureY); // Box 122
		a4locomotiveModel[370] = new ModelRendererTurbo(this, 425, 273, textureX, textureY); // Box 125
		a4locomotiveModel[371] = new ModelRendererTurbo(this, 441, 273, textureX, textureY); // Box 127
		a4locomotiveModel[372] = new ModelRendererTurbo(this, 449, 273, textureX, textureY); // Box 128
		a4locomotiveModel[373] = new ModelRendererTurbo(this, 473, 273, textureX, textureY); // Box 130
		a4locomotiveModel[374] = new ModelRendererTurbo(this, 481, 273, textureX, textureY); // Box 396
		a4locomotiveModel[375] = new ModelRendererTurbo(this, 489, 273, textureX, textureY); // Box 397
		a4locomotiveModel[376] = new ModelRendererTurbo(this, 497, 273, textureX, textureY); // Box 398
		a4locomotiveModel[377] = new ModelRendererTurbo(this, 1, 281, textureX, textureY); // Box 399
		a4locomotiveModel[378] = new ModelRendererTurbo(this, 9, 281, textureX, textureY); // Box 400
		a4locomotiveModel[379] = new ModelRendererTurbo(this, 33, 281, textureX, textureY); // Box 401
		a4locomotiveModel[380] = new ModelRendererTurbo(this, 41, 281, textureX, textureY); // Box 402
		a4locomotiveModel[381] = new ModelRendererTurbo(this, 49, 281, textureX, textureY); // Box 403
		a4locomotiveModel[382] = new ModelRendererTurbo(this, 57, 281, textureX, textureY); // Box 404
		a4locomotiveModel[383] = new ModelRendererTurbo(this, 65, 281, textureX, textureY); // Box 406
		a4locomotiveModel[384] = new ModelRendererTurbo(this, 73, 281, textureX, textureY); // Box 407
		a4locomotiveModel[385] = new ModelRendererTurbo(this, 81, 281, textureX, textureY); // Box 408
		a4locomotiveModel[386] = new ModelRendererTurbo(this, 89, 281, textureX, textureY); // Box 409
		a4locomotiveModel[387] = new ModelRendererTurbo(this, 97, 281, textureX, textureY); // Box 410
		a4locomotiveModel[388] = new ModelRendererTurbo(this, 105, 281, textureX, textureY); // Box 411
		a4locomotiveModel[389] = new ModelRendererTurbo(this, 113, 281, textureX, textureY); // Box 412
		a4locomotiveModel[390] = new ModelRendererTurbo(this, 121, 281, textureX, textureY); // Box 413
		a4locomotiveModel[391] = new ModelRendererTurbo(this, 129, 281, textureX, textureY); // Box 416
		a4locomotiveModel[392] = new ModelRendererTurbo(this, 137, 281, textureX, textureY); // Box 417
		a4locomotiveModel[393] = new ModelRendererTurbo(this, 145, 281, textureX, textureY); // Box 418
		a4locomotiveModel[394] = new ModelRendererTurbo(this, 153, 281, textureX, textureY); // Box 419
		a4locomotiveModel[395] = new ModelRendererTurbo(this, 441, 225, textureX, textureY); // Box 420
		a4locomotiveModel[396] = new ModelRendererTurbo(this, 65, 249, textureX, textureY); // Box 421
		a4locomotiveModel[397] = new ModelRendererTurbo(this, 161, 281, textureX, textureY); // Box 422
		a4locomotiveModel[398] = new ModelRendererTurbo(this, 169, 281, textureX, textureY); // Box 423
		a4locomotiveModel[399] = new ModelRendererTurbo(this, 177, 281, textureX, textureY); // Box 424
		a4locomotiveModel[400] = new ModelRendererTurbo(this, 185, 281, textureX, textureY); // Box 425
		a4locomotiveModel[401] = new ModelRendererTurbo(this, 193, 281, textureX, textureY); // Box 426
		a4locomotiveModel[402] = new ModelRendererTurbo(this, 201, 281, textureX, textureY); // Box 427
		a4locomotiveModel[403] = new ModelRendererTurbo(this, 209, 281, textureX, textureY); // Box 428
		a4locomotiveModel[404] = new ModelRendererTurbo(this, 217, 281, textureX, textureY); // Box 429
		a4locomotiveModel[405] = new ModelRendererTurbo(this, 225, 281, textureX, textureY); // Box 430
		a4locomotiveModel[406] = new ModelRendererTurbo(this, 233, 281, textureX, textureY); // Box 432
		a4locomotiveModel[407] = new ModelRendererTurbo(this, 241, 281, textureX, textureY); // Box 434
		a4locomotiveModel[408] = new ModelRendererTurbo(this, 249, 281, textureX, textureY); // Box 207
		a4locomotiveModel[409] = new ModelRendererTurbo(this, 257, 281, textureX, textureY); // Box 209
		a4locomotiveModel[410] = new ModelRendererTurbo(this, 265, 281, textureX, textureY); // Box 210
		a4locomotiveModel[411] = new ModelRendererTurbo(this, 273, 281, textureX, textureY); // Box 438
		a4locomotiveModel[412] = new ModelRendererTurbo(this, 281, 281, textureX, textureY); // Box 439
		a4locomotiveModel[413] = new ModelRendererTurbo(this, 289, 281, textureX, textureY); // Box 440
		a4locomotiveModel[414] = new ModelRendererTurbo(this, 297, 281, textureX, textureY); // Box 441
		a4locomotiveModel[415] = new ModelRendererTurbo(this, 305, 281, textureX, textureY); // Box 442
		a4locomotiveModel[416] = new ModelRendererTurbo(this, 313, 281, textureX, textureY); // Box 443
		a4locomotiveModel[417] = new ModelRendererTurbo(this, 321, 281, textureX, textureY); // Box 444
		a4locomotiveModel[418] = new ModelRendererTurbo(this, 329, 281, textureX, textureY); // Box 445
		a4locomotiveModel[419] = new ModelRendererTurbo(this, 337, 281, textureX, textureY); // Box 446
		a4locomotiveModel[420] = new ModelRendererTurbo(this, 345, 281, textureX, textureY); // Box 447
		a4locomotiveModel[421] = new ModelRendererTurbo(this, 353, 281, textureX, textureY); // Box 448
		a4locomotiveModel[422] = new ModelRendererTurbo(this, 361, 281, textureX, textureY); // Box 449
		a4locomotiveModel[423] = new ModelRendererTurbo(this, 369, 281, textureX, textureY); // Box 450
		a4locomotiveModel[424] = new ModelRendererTurbo(this, 385, 281, textureX, textureY); // Box 451
		a4locomotiveModel[425] = new ModelRendererTurbo(this, 369, 281, textureX, textureY); // Box 452
		a4locomotiveModel[426] = new ModelRendererTurbo(this, 385, 281, textureX, textureY); // Box 453
		a4locomotiveModel[427] = new ModelRendererTurbo(this, 417, 281, textureX, textureY); // Box 454
		a4locomotiveModel[428] = new ModelRendererTurbo(this, 2, 300, textureX, textureY); // Box 444
		a4locomotiveModel[429] = new ModelRendererTurbo(this, 233, 241, textureX, textureY); // Box 444
		a4locomotiveModel[430] = new ModelRendererTurbo(this, 225, 241, textureX, textureY); // Box 445
		a4locomotiveModel[431] = new ModelRendererTurbo(this, 97, 241, textureX, textureY); // Box 446
		a4locomotiveModel[432] = new ModelRendererTurbo(this, 241, 241, textureX, textureY); // Box 447
		a4locomotiveModel[433] = new ModelRendererTurbo(this, 249, 241, textureX, textureY); // Box 448
		a4locomotiveModel[434] = new ModelRendererTurbo(this, 327, 289, textureX, textureY); // Box 451
		a4locomotiveModel[435] = new ModelRendererTurbo(this, 332, 289, textureX, textureY); // Box 452
		a4locomotiveModel[436] = new ModelRendererTurbo(this, 342, 289, textureX, textureY); // Box 453
		a4locomotiveModel[437] = new ModelRendererTurbo(this, 337, 289, textureX, textureY); // Box 454
		a4locomotiveModel[438] = new ModelRendererTurbo(this, 265, 113, textureX, textureY); // Box 108

		a4locomotiveModel[0].addShapeBox(0F, 0F, 0F, 45, 45, 0, 0F, 0F, 0F, 0F, -30F, 0F, 0F, -30F, 0F, 0F, 0F, 0F, 0F, 0F, -30F, 0F, -30F, -30F, 0F, -30F, -30F, 0F, 0F, -30F, 0F); // Box 0
		a4locomotiveModel[0].setRotationPoint(-20F, -5F, 6.01F);

		a4locomotiveModel[1].addShapeBox(0F, 0F, 0F, 45, 45, 0, 0F, 0F, 0F, 0F, -30F, 0F, 0F, -30F, 0F, 0F, 0F, 0F, 0F, 0F, -30F, 0F, -30F, -30F, 0F, -30F, -30F, 0F, 0F, -30F, 0F); // Box 1
		a4locomotiveModel[1].setRotationPoint(0F, -5F, 6.01F);

		a4locomotiveModel[2].addShapeBox(0F, 0F, 0F, 45, 45, 0, 0F, 0F, 0F, 0F, -30F, 0F, 0F, -30F, 0F, 0F, 0F, 0F, 0F, 0F, -30F, 0F, -30F, -30F, 0F, -30F, -30F, 0F, 0F, -30F, 0F); // Box 2
		a4locomotiveModel[2].setRotationPoint(20F, -5F, 6.01F);

		a4locomotiveModel[3].addShapeBox(0F, 0F, 0F, 21, 21, 0, 0F, 0F, 0F, 0F, -14F, 0F, 0F, -14F, 0F, 0F, 0F, 0F, 0F, 0F, -14F, 0F, -14F, -14F, 0F, -14F, -14F, 0F, 0F, -14F, 0F); // Box 4
		a4locomotiveModel[3].setRotationPoint(-45F, 3F, 6.01F);

		a4locomotiveModel[4].addShapeBox(0F, 0F, 0F, 21, 21, 0, 0F, 0F, 0F, 0F, -14F, 0F, 0F, -14F, 0F, 0F, 0F, 0F, 0F, 0F, -14F, 0F, -14F, -14F, 0F, -14F, -14F, 0F, 0F, -14F, 0F); // Box 5
		a4locomotiveModel[4].setRotationPoint(-31F, 3F, 6.01F);

		a4locomotiveModel[5].addShapeBox(0F, 0F, 0F, 21, 21, 0, 0F, 0F, 0F, 0F, -14F, 0F, 0F, -14F, 0F, 0F, 0F, 0F, 0F, 0F, -14F, 0F, -14F, -14F, 0F, -14F, -14F, 0F, 0F, -14F, 0F); // Box 6
		a4locomotiveModel[5].setRotationPoint(-31F, 3F, -6.01F);

		a4locomotiveModel[6].addShapeBox(0F, 0F, 0F, 21, 21, 0, 0F, 0F, 0F, 0F, -14F, 0F, 0F, -14F, 0F, 0F, 0F, 0F, 0F, 0F, -14F, 0F, -14F, -14F, 0F, -14F, -14F, 0F, 0F, -14F, 0F); // Box 7
		a4locomotiveModel[6].setRotationPoint(-45F, 3F, -6.01F);

		a4locomotiveModel[7].addShapeBox(0F, 0F, 0F, 45, 45, 0, 0F, 0F, 0F, 0F, -30F, 0F, 0F, -30F, 0F, 0F, 0F, 0F, 0F, 0F, -30F, 0F, -30F, -30F, 0F, -30F, -30F, 0F, 0F, -30F, 0F); // Box 8
		a4locomotiveModel[7].setRotationPoint(-20F, -5F, -6.01F);

		a4locomotiveModel[8].addShapeBox(0F, 0F, 0F, 45, 45, 0, 0F, 0F, 0F, 0F, -30F, 0F, 0F, -30F, 0F, 0F, 0F, 0F, 0F, 0F, -30F, 0F, -30F, -30F, 0F, -30F, -30F, 0F, 0F, -30F, 0F); // Box 9
		a4locomotiveModel[8].setRotationPoint(0F, -5F, -6.01F);

		a4locomotiveModel[9].addShapeBox(0F, 0F, 0F, 45, 45, 0, 0F, 0F, 0F, 0F, -30F, 0F, 0F, -30F, 0F, 0F, 0F, 0F, 0F, 0F, -30F, 0F, -30F, -30F, 0F, -30F, -30F, 0F, 0F, -30F, 0F); // Box 10
		a4locomotiveModel[9].setRotationPoint(20F, -5F, -6.01F);

		a4locomotiveModel[10].addShapeBox(0F, 0F, 0F, 21, 21, 0, 0F, 0F, 0F, 0F, -14F, 0F, 0F, -14F, 0F, 0F, 0F, 0F, 0F, 0F, -14F, 0F, -14F, -14F, 0F, -14F, -14F, 0F, 0F, -14F, 0F); // Box 11
		a4locomotiveModel[10].setRotationPoint(50F, 3F, 5.99F);

		a4locomotiveModel[11].addShapeBox(0F, 0F, 0F, 21, 21, 0, 0F, 0F, 0F, 0F, -14F, 0F, 0F, -14F, 0F, 0F, 0F, 0F, 0F, 0F, -14F, 0F, -14F, -14F, 0F, -14F, -14F, 0F, 0F, -14F, 0F); // Box 12
		a4locomotiveModel[11].setRotationPoint(50F, 3F, -5.99F);

		a4locomotiveModel[12].addShapeBox(0F, 0F, 0F, 69, 6, 36, 0F, 0F, 0F, 0F, -46F, 0F, 0F, -46F, 0F, -24F, 0F, 0F, -24F, 0F, -4F, 0F, -46F, -4F, 0F, -46F, -4F, -24F, 0F, -4F, -24F); // Box 13
		a4locomotiveModel[12].setRotationPoint(-46F, 7F, -6F);

		a4locomotiveModel[13].addBox(0F, 0F, 0F, 1, 1, 12, 0F); // Box 14
		a4locomotiveModel[13].setRotationPoint(-42F, 6F, -6F);

		a4locomotiveModel[14].addBox(0F, 0F, 0F, 1, 1, 12, 0F); // Box 15
		a4locomotiveModel[14].setRotationPoint(-28F, 6F, -6F);

		a4locomotiveModel[15].addBox(0F, 0F, 0F, 1, 1, 12, 0F); // Box 16
		a4locomotiveModel[15].setRotationPoint(53F, 6F, -6F);

		a4locomotiveModel[16].addShapeBox(0F, 0F, 0F, 9, 6, 3, 0F, -1F, -0.5F, 0F, -7F, -0.5F, 0F, -7F, -0.5F, -2F, -1F, -0.5F, -2F, 0F, -4F, 0F, -6F, -4F, 0F, -6F, -4F, -2F, 0F, -4F, -2F); // Box 17
		a4locomotiveModel[16].setRotationPoint(-29F, 5F, 5F);

		a4locomotiveModel[17].addShapeBox(0F, 0F, 0F, 9, 6, 3, 0F, -1F, -0.5F, 0F, -7F, -0.5F, 0F, -7F, -0.5F, -2F, -1F, -0.5F, -2F, 0F, -4F, 0F, -6F, -4F, 0F, -6F, -4F, -2F, 0F, -4F, -2F); // Box 18
		a4locomotiveModel[17].setRotationPoint(-29F, 5F, -6F);

		a4locomotiveModel[18].addShapeBox(0F, 0F, 0F, 9, 6, 3, 0F, -1F, -0.5F, 0F, -7F, -0.5F, 0F, -7F, -0.5F, -2F, -1F, -0.5F, -2F, 0F, -4F, 0F, -6F, -4F, 0F, -6F, -4F, -2F, 0F, -4F, -2F); // Box 19
		a4locomotiveModel[18].setRotationPoint(-43F, 5F, -6F);

		a4locomotiveModel[19].addShapeBox(0F, 0F, 0F, 9, 6, 3, 0F, -1F, -0.5F, 0F, -7F, -0.5F, 0F, -7F, -0.5F, -2F, -1F, -0.5F, -2F, 0F, -4F, 0F, -6F, -4F, 0F, -6F, -4F, -2F, 0F, -4F, -2F); // Box 20
		a4locomotiveModel[19].setRotationPoint(-43F, 5F, 5F);

		a4locomotiveModel[20].addBox(0F, 0F, 0F, 7, 1, 7, 0F); // Box 21
		a4locomotiveModel[20].setRotationPoint(-38F, 6F, -3.5F);

		a4locomotiveModel[21].addBox(0F, 0F, 0F, 5, 3, 5, 0F); // Box 22
		a4locomotiveModel[21].setRotationPoint(-37F, 3F, -2.5F);

		a4locomotiveModel[22].addBox(0F, 0F, 0F, 7, 1, 7, 0F); // Box 23
		a4locomotiveModel[22].setRotationPoint(-38F, 2F, -3.5F);

		a4locomotiveModel[23].addBox(0F, 0F, 0F, 6, 6, 5, 0F); // Box 25
		a4locomotiveModel[23].setRotationPoint(-38F, -3F, 5F);

		a4locomotiveModel[24].addShapeBox(0F, 0F, 0F, 6, 2, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 26
		a4locomotiveModel[24].setRotationPoint(-38F, 3F, 5F);

		a4locomotiveModel[25].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 27
		a4locomotiveModel[25].setRotationPoint(-38F, 5F, 7.25F);

		a4locomotiveModel[26].addShapeBox(0F, 0F, 0F, 12, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 28
		a4locomotiveModel[26].setRotationPoint(-45F, 7F, 7.25F);

		a4locomotiveModel[27].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 29
		a4locomotiveModel[27].setRotationPoint(-33F, 5.5F, 7.25F);

		a4locomotiveModel[28].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 30
		a4locomotiveModel[28].setRotationPoint(-35F, 5.5F, 7.25F);

		a4locomotiveModel[29].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, -0.5F, 0F, -0.5F, -0.5F); // Box 31
		a4locomotiveModel[29].setRotationPoint(-33F, 7F, 7.25F);

		a4locomotiveModel[30].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, -0.5F, 0F, -0.5F, -0.5F); // Box 32
		a4locomotiveModel[30].setRotationPoint(-35F, 6.5F, 7.25F);

		a4locomotiveModel[31].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 33
		a4locomotiveModel[31].setRotationPoint(-45F, 6.5F, 7.25F);

		a4locomotiveModel[32].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, -0.5F, 0F, -0.5F, -0.5F); // Box 34
		a4locomotiveModel[32].setRotationPoint(-37F, 6F, 7.25F);

		a4locomotiveModel[33].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 35
		a4locomotiveModel[33].setRotationPoint(-45F, 6F, 7.25F);

		a4locomotiveModel[34].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 36
		a4locomotiveModel[34].setRotationPoint(-37F, 5.5F, 7.25F);

		a4locomotiveModel[35].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 38
		a4locomotiveModel[35].setRotationPoint(-32F, 1F, 6F);

		a4locomotiveModel[36].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 39
		a4locomotiveModel[36].setRotationPoint(-32F, 0F, 6F);

		a4locomotiveModel[37].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, -1F); // Box 40
		a4locomotiveModel[37].setRotationPoint(-32F, 3F, 6F);

		a4locomotiveModel[38].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, -1F); // Box 41
		a4locomotiveModel[38].setRotationPoint(-38.5F, 3F, 6F);

		a4locomotiveModel[39].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 42
		a4locomotiveModel[39].setRotationPoint(-38.5F, 1F, 6F);

		a4locomotiveModel[40].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 43
		a4locomotiveModel[40].setRotationPoint(-38.5F, 0F, 6F);

		a4locomotiveModel[41].addShapeBox(0F, 0F, 0F, 12, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 44
		a4locomotiveModel[41].setRotationPoint(-45F, 7F, -7.75F);

		a4locomotiveModel[42].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 45
		a4locomotiveModel[42].setRotationPoint(-45F, 6.5F, -7.75F);

		a4locomotiveModel[43].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 46
		a4locomotiveModel[43].setRotationPoint(-45F, 6F, -7.75F);

		a4locomotiveModel[44].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, -0.5F, 0F, -0.5F, -0.5F); // Box 47
		a4locomotiveModel[44].setRotationPoint(-37F, 6F, -7.75F);

		a4locomotiveModel[45].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 48
		a4locomotiveModel[45].setRotationPoint(-37F, 5.5F, -7.75F);

		a4locomotiveModel[46].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 49
		a4locomotiveModel[46].setRotationPoint(-38F, 5F, -7.75F);

		a4locomotiveModel[47].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, -0.5F, 0F, -0.5F, -0.5F); // Box 50
		a4locomotiveModel[47].setRotationPoint(-35F, 6.5F, -7.75F);

		a4locomotiveModel[48].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 51
		a4locomotiveModel[48].setRotationPoint(-35F, 5.5F, -7.75F);

		a4locomotiveModel[49].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, -0.5F, 0F, -0.5F, -0.5F); // Box 52
		a4locomotiveModel[49].setRotationPoint(-33F, 7F, -7.75F);

		a4locomotiveModel[50].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 53
		a4locomotiveModel[50].setRotationPoint(-33F, 5.5F, -7.75F);

		a4locomotiveModel[51].addShapeBox(0F, 0F, 0F, 6, 2, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 54
		a4locomotiveModel[51].setRotationPoint(-38F, 3F, -10F);

		a4locomotiveModel[52].addShapeBox(0F, 0F, 0F, 6, 4, 5, 0F, 0F, 0F, -1F, 0F, 1F, -1F, 0F, 1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 55
		a4locomotiveModel[52].setRotationPoint(-38F, -7F, -10F);

		a4locomotiveModel[53].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, -1F); // Box 56
		a4locomotiveModel[53].setRotationPoint(-32F, 3F, -9F);

		a4locomotiveModel[54].addShapeBox(0F, -1F, 0F, 1, 2, 3, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 57
		a4locomotiveModel[54].setRotationPoint(-32F, 2F, -9F);

		a4locomotiveModel[55].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 58
		a4locomotiveModel[55].setRotationPoint(-32F, 0F, -9F);

		a4locomotiveModel[56].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, -1F); // Box 59
		a4locomotiveModel[56].setRotationPoint(-38.5F, 3F, -9F);

		a4locomotiveModel[57].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 60
		a4locomotiveModel[57].setRotationPoint(-38.5F, 1F, -9F);

		a4locomotiveModel[58].addBox(0F, 0F, 0F, 6, 6, 5, 0F); // Box 61
		a4locomotiveModel[58].setRotationPoint(-38F, -3F, -10F);

		a4locomotiveModel[59].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 62
		a4locomotiveModel[59].setRotationPoint(-38.5F, 0F, -9F);

		a4locomotiveModel[60].addShapeBox(0F, 0F, 0F, 10, 2, 2, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 63
		a4locomotiveModel[60].setRotationPoint(-48F, 3F, 8F);

		a4locomotiveModel[61].addShapeBox(0F, 0F, 0F, 10, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 64
		a4locomotiveModel[61].setRotationPoint(-48F, 3F, -10F);

		a4locomotiveModel[62].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -2F, -1F); // Box 65
		a4locomotiveModel[62].setRotationPoint(-50F, 3F, -10F);

		a4locomotiveModel[63].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 66
		a4locomotiveModel[63].setRotationPoint(-51F, -1F, -10F);

		a4locomotiveModel[64].addBox(0F, 0F, 0F, 12, 4, 1, 0F); // Box 67
		a4locomotiveModel[64].setRotationPoint(-50F, -1F, -10F);

		a4locomotiveModel[65].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, 0F, -2F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 68
		a4locomotiveModel[65].setRotationPoint(-50F, -3F, -10F);

		a4locomotiveModel[66].addShapeBox(0F, 0F, 0F, 10, 2, 6, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 4F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, -4F, 0F, -2F, -4F); // Box 69
		a4locomotiveModel[66].setRotationPoint(-48F, -3F, -10F);

		a4locomotiveModel[67].addShapeBox(0F, 0F, 0F, 10, 4, 2, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 70
		a4locomotiveModel[67].setRotationPoint(-48F, -7F, -8F);

		a4locomotiveModel[68].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, 0F, -2F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 71
		a4locomotiveModel[68].setRotationPoint(-50F, -3F, -8F);

		a4locomotiveModel[69].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 72
		a4locomotiveModel[69].setRotationPoint(-50F, 3F, -8F);

		a4locomotiveModel[70].addBox(0F, 0F, 0F, 49, 5, 1, 0F); // Box 73
		a4locomotiveModel[70].setRotationPoint(-32F, -3F, -10F);

		a4locomotiveModel[71].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, -2F, -1F, 0F, 0F, 0F); // Box 74
		a4locomotiveModel[71].setRotationPoint(-32F, 3F, -10F);

		a4locomotiveModel[72].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 76
		a4locomotiveModel[72].setRotationPoint(-50F, -3F, 8F);

		a4locomotiveModel[73].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 77
		a4locomotiveModel[73].setRotationPoint(-50F, -3F, 6F);

		a4locomotiveModel[74].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 79
		a4locomotiveModel[74].setRotationPoint(-51F, -1F, 6F);

		a4locomotiveModel[75].addBox(0F, 0F, 0F, 12, 4, 1, 0F); // Box 80
		a4locomotiveModel[75].setRotationPoint(-50F, -1F, 9F);

		a4locomotiveModel[76].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -2F, 0F); // Box 82
		a4locomotiveModel[76].setRotationPoint(-50F, 3F, 8F);

		a4locomotiveModel[77].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 1F); // Box 83
		a4locomotiveModel[77].setRotationPoint(-50F, 3F, 6F);

		a4locomotiveModel[78].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -1F, 0F, -2F, 0F, 0F, 0F, -1F); // Box 84
		a4locomotiveModel[78].setRotationPoint(-32F, 3F, 8F);

		a4locomotiveModel[79].addBox(0F, 0F, 0F, 49, 5, 1, 0F); // Box 85
		a4locomotiveModel[79].setRotationPoint(-32F, -3F, 9F);

		a4locomotiveModel[80].addBox(0F, 0F, 0F, 48, 2, 1, 0F); // Box 89
		a4locomotiveModel[80].setRotationPoint(17F, 0F, -10F);

		a4locomotiveModel[81].addShapeBox(0F, 0F, 0F, 5, 5, 3, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 86
		a4locomotiveModel[81].setRotationPoint(-32F, -8F, -10F);

		a4locomotiveModel[82].addBox(0F, 0F, 0F, 10, 1, 1, 0F); // Box 88
		a4locomotiveModel[82].setRotationPoint(-48F, 4F, -8F);

		a4locomotiveModel[83].addBox(0F, 0F, 0F, 10, 1, 1, 0F); // Box 89
		a4locomotiveModel[83].setRotationPoint(-48F, 4F, 7F);

		a4locomotiveModel[84].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 90
		a4locomotiveModel[84].setRotationPoint(-13.5F, 4F, -7F);

		a4locomotiveModel[85].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 91
		a4locomotiveModel[85].setRotationPoint(6.5F, 4F, -7F);

		a4locomotiveModel[86].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 92
		a4locomotiveModel[86].setRotationPoint(26.5F, 4F, -7F);

		a4locomotiveModel[87].addBox(0F, 0F, 0F, 18, 1, 1, 0F); // Box 93
		a4locomotiveModel[87].setRotationPoint(8.5F, 4.5F, -7F);

		a4locomotiveModel[88].addBox(0F, 0F, 0F, 18, 1, 1, 0F); // Box 94
		a4locomotiveModel[88].setRotationPoint(-11.5F, 4.5F, -7F);

		a4locomotiveModel[89].addBox(0F, 0F, 0F, 8, 1, 1, 0F); // Box 95
		a4locomotiveModel[89].setRotationPoint(-32F, 2F, -8F);

		a4locomotiveModel[90].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 96
		a4locomotiveModel[90].setRotationPoint(7F, 4.5F, -8F);

		a4locomotiveModel[91].addShapeBox(0F, 0F, 0F, 31, 3, 1, 0F, 0F, 0.5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F); // Box 97
		a4locomotiveModel[91].setRotationPoint(-24F, 2.5F, -8F);

		a4locomotiveModel[92].addBox(0F, 0F, 0F, 25, 5, 10, 0F); // Box 100
		a4locomotiveModel[92].setRotationPoint(-48F, -3F, -5F);

		a4locomotiveModel[93].addShapeBox(0F, 0F, 0F, 2, 2, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 101
		a4locomotiveModel[93].setRotationPoint(-50F, 3F, -6F);

		a4locomotiveModel[94].addShapeBox(0F, 0F, 0F, 1, 6, 8, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 102
		a4locomotiveModel[94].setRotationPoint(-51F, -3F, -4F);

		a4locomotiveModel[95].addShapeBox(0F, 0F, 0F, 12, 12, 8, 0F, -5F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, -12F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F); // Box 103
		a4locomotiveModel[95].setRotationPoint(-55F, -15F, -4F);

		a4locomotiveModel[96].addShapeBox(0F, 0F, 0F, 3, 3, 8, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 107
		a4locomotiveModel[96].setRotationPoint(-43F, -18F, -4F);

		a4locomotiveModel[97].addShapeBox(0F, 0F, 0F, 5, 3, 8, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 109
		a4locomotiveModel[97].setRotationPoint(-36F, -24F, -4F);

		a4locomotiveModel[98].addShapeBox(0F, 0F, 0F, 8, 3, 8, 0F, 0F, -3F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 110
		a4locomotiveModel[98].setRotationPoint(-31F, -27F, -4F);

		a4locomotiveModel[99].addShapeBox(0F, 0F, 0F, 12, 12, 2, 0F, -7F, -12F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -5F, -12F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F); // Box 111
		a4locomotiveModel[99].setRotationPoint(-55F, -15F, -6F);

		a4locomotiveModel[100].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F, 0F, -1F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 112
		a4locomotiveModel[100].setRotationPoint(-51F, -1F, -6F);

		a4locomotiveModel[101].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 113
		a4locomotiveModel[101].setRotationPoint(-51F, -1F, 4F);

		a4locomotiveModel[102].addShapeBox(0F, 0F, 0F, 12, 12, 2, 0F, -5F, -12F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -7F, -12F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F); // Box 114
		a4locomotiveModel[102].setRotationPoint(-55F, -15F, 4F);

		a4locomotiveModel[103].addShapeBox(0F, 0F, 0F, 3, 3, 2, 0F, -2F, -3F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 116
		a4locomotiveModel[103].setRotationPoint(-43F, -18F, -6F);

		a4locomotiveModel[104].addShapeBox(0F, 0F, 0F, 4, 3, 2, 0F, -2F, -3F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -2F, 0F, 0F, 2F, 0F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 117
		a4locomotiveModel[104].setRotationPoint(-40F, -21F, -6F);

		a4locomotiveModel[105].addShapeBox(0F, 0F, 0F, 5, 3, 2, 0F, -2F, -3F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -2F, 0F, 0F, 2.1F, 0F, 0.35F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 118
		a4locomotiveModel[105].setRotationPoint(-36F, -24F, -6F);

		a4locomotiveModel[106].addShapeBox(0F, 0F, 0F, 8, 3, 2, 0F, -2F, -3F, 0F, 0F, -2F, 0F, 0F, 0F, 1F, 0F, -3F, 0F, -2F, 0F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 119
		a4locomotiveModel[106].setRotationPoint(-31F, -27F, -6F);

		a4locomotiveModel[107].addShapeBox(0F, 0F, 0F, 66, 22, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 123
		a4locomotiveModel[107].setRotationPoint(-23F, -25F, -6F);

		a4locomotiveModel[108].addShapeBox(0F, 0F, 0F, 44, 5, 2, 0F, 0F, 0F, -1F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 124
		a4locomotiveModel[108].setRotationPoint(-27F, -8F, -10F);

		a4locomotiveModel[109].addShapeBox(0F, 0F, 0F, 41, 5, 2, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 126
		a4locomotiveModel[109].setRotationPoint(17F, -5F, -10F);

		a4locomotiveModel[110].addShapeBox(0F, 0F, 0F, 12, 26, 23, 0F, 0F, -22F, -21F, 0F, -23F, -19F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -23F, 0F, -3F, -21F, 0F, -3F, -1F, 0F, -4F, -1F); // Box 127
		a4locomotiveModel[110].setRotationPoint(17F, -25F, -29F);

		a4locomotiveModel[111].addShapeBox(0F, 0F, 0F, 6, 17, 0, 0F, 0F, 0F, -2F, 0F, 0F, -1.9F, 0F, 0F, 14.1F, 0F, 0F, 14F, 0F, 0F, -0.3F, 0F, 0F, -0.2F, 0F, 0F, 15.7F, 0F, 0F, 15.7F); // Box 129
		a4locomotiveModel[111].setRotationPoint(-29F, -24F, -8F);

		a4locomotiveModel[112].addShapeBox(0F, 0F, 0F, 5, 14, 0, 0F, 0F, 0F, -2F, 0F, 0F, -1.7F, 0F, 0F, 14.3F, 0F, 0F, 14F, 0F, 0F, -0.05F, 0F, 0F, -0.3F, 0F, 0F, 15.7F, 0F, 0F, 15.75F); // Box 130
		a4locomotiveModel[112].setRotationPoint(-34F, -21F, -8F);

		a4locomotiveModel[113].addShapeBox(0F, 0F, 0F, 4, 11, 0, 0F, 0F, 0F, -2.1F, 0F, 0F, -1.55F, 0F, 0F, 14.4F, 0F, 0F, 14F, 0F, 0.1F, -0.35F, 0F, 0F, -0.05F, 0F, 0F, 15.75F, 0F, 0.1F, 15.7F); // Box 131
		a4locomotiveModel[113].setRotationPoint(-38F, -18F, -8F);

		a4locomotiveModel[114].addShapeBox(0F, 0F, 0F, 3, 13, 14, 0F, 0F, -14F, 0F, 0F, -13F, 0F, 0F, 0F, -12F, 0F, -3F, -12F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -13F, 0F, 0F, -13F); // Box 132
		a4locomotiveModel[114].setRotationPoint(-41F, -18F, -8F);

		a4locomotiveModel[115].addShapeBox(0F, 0F, 0F, 8, 12, 13, 0F, -0.4F, -13F, -2F, 0F, -11F, 0F, 0F, 0F, -11F, -0.4F, -13F, -11F, -0.4F, 1F, -2F, 0F, 0F, 0F, 0F, 0F, -12F, -0.4F, 1F, -11F); // Box 133
		a4locomotiveModel[115].setRotationPoint(-49F, -15F, -8F);

		a4locomotiveModel[116].addShapeBox(0F, 0F, 0F, 61, 3, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 3F, 0F, -1F, 3F, 0F, -1F, 3F, 0F, -1F, 3F); // Box 134
		a4locomotiveModel[116].setRotationPoint(-23F, -27F, -3F);

		a4locomotiveModel[117].addBox(0F, 0F, 0F, 60, 8, 12, 0F); // Box 135
		a4locomotiveModel[117].setRotationPoint(-23F, -3F, -6F);

		a4locomotiveModel[118].addShapeBox(0F, 0F, 0F, 4, 3, 12, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -3F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -1F); // Box 137
		a4locomotiveModel[118].setRotationPoint(-27F, 2F, -6F);

		a4locomotiveModel[119].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -2F, -1F, 0F, -2F, -1F, 0F, 0F, -1F, 0F); // Box 138
		a4locomotiveModel[119].setRotationPoint(-32F, 2F, -10F);

		a4locomotiveModel[120].addBox(0F, 0F, 0F, 7, 6, 1, 0F); // Box 139
		a4locomotiveModel[120].setRotationPoint(-33F, -28F, -0.5F);

		a4locomotiveModel[121].addShapeBox(0F, 0F, 0F, 7, 6, 1, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 140
		a4locomotiveModel[121].setRotationPoint(-33F, -28F, -1.5F);

		a4locomotiveModel[122].addShapeBox(0F, 0F, 0F, 7, 6, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 142
		a4locomotiveModel[122].setRotationPoint(-33F, -28F, 0.5F);

		a4locomotiveModel[123].addShapeBox(0F, 0F, 0F, 3, 3, 3, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 144
		a4locomotiveModel[123].setRotationPoint(-26F, -28F, -1.5F);

		a4locomotiveModel[124].addShapeBox(0F, 0F, 0F, 40, 22, 22, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -22F, -20F, 0F, -20F, -20F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -20F, 0F, 0F, -20F); // Box 145
		a4locomotiveModel[124].setRotationPoint(-23F, -25F, 6F);

		a4locomotiveModel[125].addShapeBox(0F, 0F, 0F, 3, 13, 14, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -13F, -12F, 0F, -14F, -12F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -12F, 0F, 1F, -12F); // Box 150
		a4locomotiveModel[125].setRotationPoint(-41F, -18F, 6F);

		a4locomotiveModel[126].addShapeBox(0F, 0F, 0F, 8, 12, 13, 0F, -0.4F, -13F, 0F, 0F, 0F, 0F, 0F, -11F, -11F, -0.4F, -13F, -12F, -0.4F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, -0.4F, 1F, -12F); // Box 151
		a4locomotiveModel[126].setRotationPoint(-49F, -15F, 6F);

		a4locomotiveModel[127].addShapeBox(0F, 0F, 0F, 3, 3, 2, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 152
		a4locomotiveModel[127].setRotationPoint(-43F, -18F, 4F);

		a4locomotiveModel[128].addShapeBox(0F, 0F, 0F, 4, 3, 2, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0.4F, -2F, 0F, 0F); // Box 153
		a4locomotiveModel[128].setRotationPoint(-40F, -21F, 4F);

		a4locomotiveModel[129].addShapeBox(0F, 0F, 0F, 5, 3, 2, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0.3F, -2F, 0F, 0F); // Box 154
		a4locomotiveModel[129].setRotationPoint(-36F, -24F, 4F);

		a4locomotiveModel[130].addShapeBox(0F, 0F, 0F, 8, 3, 2, 0F, 0F, -3F, 0F, 0F, 0F, 1F, 0F, -2F, 0F, -2F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, -2F, 0F, 0F); // Box 155
		a4locomotiveModel[130].setRotationPoint(-31F, -27F, 4F);

		a4locomotiveModel[131].addShapeBox(0F, 0F, 0F, 7, 6, 2, 0F, 0F, -4F, -1F, 0F, 0F, -1F, 0F, -4F, 0F, 0F, -6F, 0F, 0F, -2F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 156
		a4locomotiveModel[131].setRotationPoint(-48F, -7F, 5F);

		a4locomotiveModel[132].addShapeBox(0F, 0F, 0F, 6, 4, 5, 0F, 0F, 0F, -1F, 0F, 1F, -1F, 0F, 1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 157
		a4locomotiveModel[132].setRotationPoint(-38F, -7F, 5F);

		a4locomotiveModel[133].addShapeBox(0F, 0F, 0F, 5, 5, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 158
		a4locomotiveModel[133].setRotationPoint(-32F, -8F, 7F);

		a4locomotiveModel[134].addShapeBox(0F, 0F, 0F, 44, 5, 2, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 159
		a4locomotiveModel[134].setRotationPoint(-27F, -8F, 8F);

		a4locomotiveModel[135].addShapeBox(0F, 0F, 0F, 10, 4, 2, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 160
		a4locomotiveModel[135].setRotationPoint(-48F, -7F, 6F);

		a4locomotiveModel[136].addShapeBox(0F, 0F, 0F, 10, 6, 2, 0F, 0F, -4F, -1F, 0F, 0F, -1F, 0F, -4F, 0F, 0F, -6F, 0F, 0F, -2F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 161
		a4locomotiveModel[136].setRotationPoint(-48F, -7F, 8F);

		a4locomotiveModel[137].addShapeBox(0F, 0F, 0F, 44, 3, 2, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 163
		a4locomotiveModel[137].setRotationPoint(-27F, -8F, 6F);

		a4locomotiveModel[138].addShapeBox(0F, 0F, 0F, 44, 3, 2, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 164
		a4locomotiveModel[138].setRotationPoint(-27F, -8F, -8F);

		a4locomotiveModel[139].addShapeBox(0F, 0F, 0F, 41, 5, 1, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 165
		a4locomotiveModel[139].setRotationPoint(17F, -5F, 9F);

		a4locomotiveModel[140].addBox(0F, 0F, 0F, 48, 2, 1, 0F); // Box 166
		a4locomotiveModel[140].setRotationPoint(17F, 0F, 9F);

		a4locomotiveModel[141].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -2F, -1F, 0F, -2F, -1F, 0F, 0F, -1F, 0F); // Box 167
		a4locomotiveModel[141].setRotationPoint(-32F, 2F, 9F);

		a4locomotiveModel[142].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 157
		a4locomotiveModel[142].setRotationPoint(-51F, -3F, 4F);

		a4locomotiveModel[143].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F, 0F, -3F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 158
		a4locomotiveModel[143].setRotationPoint(-51F, -3F, -6F);

		a4locomotiveModel[144].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 159
		a4locomotiveModel[144].setRotationPoint(-26F, -18F, -7F);

		a4locomotiveModel[145].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 160
		a4locomotiveModel[145].setRotationPoint(-25.75F, -17.75F, -7.5F);

		a4locomotiveModel[146].addShapeBox(0F, 0F, 0F, 65, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 161
		a4locomotiveModel[146].setRotationPoint(-25.25F, -17.75F, -7.5F);

		a4locomotiveModel[147].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 163
		a4locomotiveModel[147].setRotationPoint(-25.75F, -21.75F, -7F);

		a4locomotiveModel[148].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 164
		a4locomotiveModel[148].setRotationPoint(-18.75F, -21.75F, -7F);

		a4locomotiveModel[149].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 165
		a4locomotiveModel[149].setRotationPoint(-11.75F, -21.75F, -7F);

		a4locomotiveModel[150].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 166
		a4locomotiveModel[150].setRotationPoint(-4.75F, -21.75F, -7F);

		a4locomotiveModel[151].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 167
		a4locomotiveModel[151].setRotationPoint(2.25F, -21.75F, -7F);

		a4locomotiveModel[152].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 168
		a4locomotiveModel[152].setRotationPoint(9.25F, -21.75F, -7F);

		a4locomotiveModel[153].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 169
		a4locomotiveModel[153].setRotationPoint(16.25F, -21.75F, -7F);

		a4locomotiveModel[154].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 170
		a4locomotiveModel[154].setRotationPoint(23.25F, -21.75F, -7F);

		a4locomotiveModel[155].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 171
		a4locomotiveModel[155].setRotationPoint(30.25F, -21.75F, -7F);

		a4locomotiveModel[156].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 172
		a4locomotiveModel[156].setRotationPoint(37.25F, -19.75F, -7.5F);

		a4locomotiveModel[157].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 173
		a4locomotiveModel[157].setRotationPoint(-41F, -13.75F, -7F);

		a4locomotiveModel[158].addBox(0F, 0F, 0F, 10, 2, 1, 0F); // Box 174
		a4locomotiveModel[158].setRotationPoint(-32F, -16F, -7.25F);

		a4locomotiveModel[159].addShapeBox(0F, 0F, 0F, 56, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F); // Box 175
		a4locomotiveModel[159].setRotationPoint(-25.25F, -21.63F, -6.87F);

		a4locomotiveModel[160].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F); // Box 176
		a4locomotiveModel[160].setRotationPoint(-29.25F, -21.63F, -6.87F);

		a4locomotiveModel[161].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, -2F, -0.75F, 0F, -0.75F, 0F, 0F, -2.75F, 0F, 0F, -2.75F, -0.75F, 0F, -0.75F, -0.75F); // Box 178
		a4locomotiveModel[161].setRotationPoint(-34.25F, -21.63F, -6.87F);

		a4locomotiveModel[162].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, -3F, -0.75F, 0F, -0.75F, 0F, 0F, -3.75F, 0F, 0F, -3.75F, -0.75F, 0F, -0.75F, -0.75F); // Box 179
		a4locomotiveModel[162].setRotationPoint(-38.25F, -19.63F, -6.87F);

		a4locomotiveModel[163].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F, -0.5F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.5F, -3F, -0.75F, -0.5F, -0.75F, 0F, 0F, -3.75F, 0F, 0F, -3.75F, -0.75F, -0.5F, -0.75F, -0.75F); // Box 180
		a4locomotiveModel[163].setRotationPoint(-41.25F, -16.63F, -6.87F);

		a4locomotiveModel[164].addShapeBox(0F, 0F, 0F, 13, 22, 23, 0F, 0F, -21.5F, -1.25F, 0F, -23F, -1F, -4F, 0F, -18F, 0F, 0F, -18F, 0F, -0.5F, -1.25F, 0F, 1.05F, -1F, 0F, 0F, -19F, 0F, 0F, -19F); // Box 182
		a4locomotiveModel[164].setRotationPoint(29F, -25F, -11F);

		a4locomotiveModel[165].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 183
		a4locomotiveModel[165].setRotationPoint(-18.75F, -18F, -7.75F);

		a4locomotiveModel[166].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 184
		a4locomotiveModel[166].setRotationPoint(-11.75F, -18F, -7.75F);

		a4locomotiveModel[167].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 185
		a4locomotiveModel[167].setRotationPoint(-4.75F, -18F, -7.75F);

		a4locomotiveModel[168].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 186
		a4locomotiveModel[168].setRotationPoint(2.25F, -18F, -7.75F);

		a4locomotiveModel[169].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 187
		a4locomotiveModel[169].setRotationPoint(9.25F, -18F, -7.75F);

		a4locomotiveModel[170].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 188
		a4locomotiveModel[170].setRotationPoint(16.25F, -18F, -7.75F);

		a4locomotiveModel[171].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 189
		a4locomotiveModel[171].setRotationPoint(23.25F, -18F, -7.75F);

		a4locomotiveModel[172].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 190
		a4locomotiveModel[172].setRotationPoint(30.25F, -18F, -7.75F);

		a4locomotiveModel[173].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 191
		a4locomotiveModel[173].setRotationPoint(37.25F, -18F, -7.75F);

		a4locomotiveModel[174].addShapeBox(0F, 0F, 0F, 15, 6, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.8F, 0F); // Box 192
		a4locomotiveModel[174].setRotationPoint(43F, -6F, -10F);

		a4locomotiveModel[175].addBox(0F, 0F, 0F, 28, 5, 12, 0F); // Box 193
		a4locomotiveModel[175].setRotationPoint(37F, -3F, -6F);

		a4locomotiveModel[176].addShapeBox(0F, 0F, 0F, 7, 6, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 194
		a4locomotiveModel[176].setRotationPoint(58F, -6F, -10F);

		a4locomotiveModel[177].addShapeBox(0F, 0F, 0F, 22, 9, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 195
		a4locomotiveModel[177].setRotationPoint(43F, -15F, -10F);

		a4locomotiveModel[178].addShapeBox(0F, 0F, 0F, 4, 15, 3, 0F, 0F, 0F, -2.9F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0.9F, -3F, 0.1F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, -2F, -3F, 0.1F, -2F); // Box 196
		a4locomotiveModel[178].setRotationPoint(39F, -17F, -10F);

		a4locomotiveModel[179].addShapeBox(0F, 0F, 0F, 2, 7, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 197
		a4locomotiveModel[179].setRotationPoint(43F, -22F, -10F);

		a4locomotiveModel[180].addShapeBox(0F, 0F, 0F, 2, 7, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 198
		a4locomotiveModel[180].setRotationPoint(51F, -22F, -10F);

		a4locomotiveModel[181].addShapeBox(0F, 0F, 0F, 2, 7, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 199
		a4locomotiveModel[181].setRotationPoint(59F, -22F, -10F);

		a4locomotiveModel[182].addShapeBox(0F, 0F, 0F, 28, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 200
		a4locomotiveModel[182].setRotationPoint(43F, -24F, -10F);

		a4locomotiveModel[183].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 201
		a4locomotiveModel[183].setRotationPoint(61F, -17F, -10F);

		a4locomotiveModel[184].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 202
		a4locomotiveModel[184].setRotationPoint(61F, -18F, -10F);

		a4locomotiveModel[185].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 203
		a4locomotiveModel[185].setRotationPoint(61F, -19F, -10F);

		a4locomotiveModel[186].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 204
		a4locomotiveModel[186].setRotationPoint(61F, -22F, -10F);

		a4locomotiveModel[187].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F); // Box 205
		a4locomotiveModel[187].setRotationPoint(30.75F, -21.63F, -6.87F);

		a4locomotiveModel[188].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, 0F, -0.75F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.25F, 0F, 0F, 0F, 0F, -1.75F, -0.75F, 0F, -1.25F, -0.5F, 0F, -1.25F, -0.25F, 0F, -1.75F, 0F); // Box 206
		a4locomotiveModel[188].setRotationPoint(32.75F, -21.63F, -7.62F);

		a4locomotiveModel[189].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.75F, 0F, 0F, -0.75F, 0F, -1.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.75F, 0F, -1.25F, -0.75F); // Box 208
		a4locomotiveModel[189].setRotationPoint(36.75F, -19.91F, -7.35F);

		a4locomotiveModel[190].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, 0F, 0F, -1F, 0F, -1F, -0.75F, 0F, -1F, -1F, 0F, 0F, -0.75F, 0F, -1.75F, -1F, 0F, -0.75F, -0.75F, 0F, -0.75F, -1F, 0F, -1.75F, -0.75F); // Box 209
		a4locomotiveModel[190].setRotationPoint(34.75F, -21.11F, -8.13F);

		a4locomotiveModel[191].addShapeBox(0F, 0F, 0F, 28, 2, 2, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 207
		a4locomotiveModel[191].setRotationPoint(43F, -26F, -10F);

		a4locomotiveModel[192].addShapeBox(0F, 0F, 0F, 28, 1, 3, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 208
		a4locomotiveModel[192].setRotationPoint(43F, -27F, -8F);

		a4locomotiveModel[193].addShapeBox(0F, 0F, 0F, 28, 1, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 209
		a4locomotiveModel[193].setRotationPoint(43F, -27F, -5F);

		a4locomotiveModel[194].addShapeBox(0F, 0F, 0F, 5, 2, 4, 0F, 0F, -1F, -4F, 0F, -2F, 0F, 0F, 0F, -2F, 0F, -1F, 0F, 0F, -1F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 210
		a4locomotiveModel[194].setRotationPoint(38F, -26F, -10F);

		a4locomotiveModel[195].addShapeBox(0F, 0F, 0F, 5, 2, 4, 0F, 0F, -1F, 0F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, -1F, -4F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -4F); // Box 211
		a4locomotiveModel[195].setRotationPoint(38F, -26F, 6F);

		a4locomotiveModel[196].addShapeBox(0F, 0F, 0F, 28, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 212
		a4locomotiveModel[196].setRotationPoint(43F, -27F, 5F);

		a4locomotiveModel[197].addShapeBox(0F, 0F, 0F, 28, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 213
		a4locomotiveModel[197].setRotationPoint(43F, -26F, 8F);

		a4locomotiveModel[198].addShapeBox(0F, 0F, 0F, 5, 3, 5, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -1F, 0F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 214
		a4locomotiveModel[198].setRotationPoint(38F, -27F, 3F);

		a4locomotiveModel[199].addShapeBox(0F, 0F, 0F, 5, 3, 5, 0F, 0F, -2F, -2F, 0F, -1F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 215
		a4locomotiveModel[199].setRotationPoint(38F, -27F, -8F);

		a4locomotiveModel[200].addShapeBox(0F, 0F, 0F, 5, 1, 10, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 216
		a4locomotiveModel[200].setRotationPoint(38F, -27F, -5F);

		a4locomotiveModel[201].addShapeBox(0F, 0F, 0F, 5, 22, 1, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 217
		a4locomotiveModel[201].setRotationPoint(37F, -25F, -7F);

		a4locomotiveModel[202].addShapeBox(0F, 0F, 0F, 5, 22, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 218
		a4locomotiveModel[202].setRotationPoint(37F, -25F, 6F);

		a4locomotiveModel[203].addShapeBox(0F, 0F, 0F, 5, 3, 4, 0F, 0F, 0F, -4F, 0F, -1F, 0F, 0F, -1F, -3F, 0F, 0F, 0F, 0F, -3F, -4F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -3F, 0F); // Box 219
		a4locomotiveModel[203].setRotationPoint(38F, -25F, -10F);

		a4locomotiveModel[204].addShapeBox(0F, 0F, 0F, 1, 6, 2, 0F, -0.5F, -0.7F, -0.4F, 0F, -1F, 0F, 0F, -1F, -1F, -0.5F, -0.7F, -0.7F, -0.5F, 0F, -0.35F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -0.65F); // Box 221
		a4locomotiveModel[204].setRotationPoint(42F, -23F, -10F);

		a4locomotiveModel[205].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F, 0.1F, 0F, -1.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0.15F, 0F, 0F, -0.4F, 0F, -0.6F, 0F, 0F, -0.15F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 222
		a4locomotiveModel[205].setRotationPoint(39F, -20F, -8F);

		a4locomotiveModel[206].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, -0.5F, 0F, -1.5F, -1F, 0F, -1F, -1F, 0F, 0F, -0.6F, 0F, 0F, -0.9F, 0F, -1.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 223
		a4locomotiveModel[206].setRotationPoint(38F, -22F, -8F);

		a4locomotiveModel[207].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, -1F, 0F, -0.6F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 224
		a4locomotiveModel[207].setRotationPoint(38F, -25F, -7F);

		a4locomotiveModel[208].addBox(0F, 0F, 0F, 28, 5, 3, 0F); // Box 226
		a4locomotiveModel[208].setRotationPoint(37F, -3F, -9F);

		a4locomotiveModel[209].addBox(0F, 0F, 0F, 28, 5, 3, 0F); // Box 227
		a4locomotiveModel[209].setRotationPoint(37F, -3F, 6F);

		a4locomotiveModel[210].addShapeBox(0F, 0F, 0F, 8, 5, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -1F); // Box 228
		a4locomotiveModel[210].setRotationPoint(29F, -3F, -9F);

		a4locomotiveModel[211].addShapeBox(0F, 0F, 0F, 4, 7, 3, 0F, 0F, 0F, -3.25F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0.25F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 230
		a4locomotiveModel[211].setRotationPoint(39F, -24F, -9.95F);

		a4locomotiveModel[212].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 232
		a4locomotiveModel[212].setRotationPoint(-41F, -13.75F, 6F);

		a4locomotiveModel[213].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F, 0F, -3F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -0.75F, -0.75F, 0F, -3.75F, -0.75F, 0F, -3.75F, 0F, 0F, -0.75F, 0F); // Box 233
		a4locomotiveModel[213].setRotationPoint(-38.25F, -19.63F, 5.87F);

		a4locomotiveModel[214].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F, -0.5F, -3F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, -0.5F, -3F, 0F, -0.5F, -0.75F, -0.75F, 0F, -3.75F, -0.75F, 0F, -3.75F, 0F, -0.5F, -0.75F, 0F); // Box 234
		a4locomotiveModel[214].setRotationPoint(-41.25F, -16.63F, 5.87F);

		a4locomotiveModel[215].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F, 0F, -2F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -0.75F, -0.75F, 0F, -2.75F, -0.75F, 0F, -2.75F, 0F, 0F, -0.75F, 0F); // Box 235
		a4locomotiveModel[215].setRotationPoint(-34.25F, -21.63F, 5.87F);

		a4locomotiveModel[216].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 236
		a4locomotiveModel[216].setRotationPoint(-29.25F, -21.63F, 5.87F);

		a4locomotiveModel[217].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 237
		a4locomotiveModel[217].setRotationPoint(-25.75F, -21.75F, 6F);

		a4locomotiveModel[218].addShapeBox(0F, 0F, 0F, 56, 1, 1, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 238
		a4locomotiveModel[218].setRotationPoint(-25.25F, -21.63F, 5.87F);

		a4locomotiveModel[219].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 239
		a4locomotiveModel[219].setRotationPoint(-18.75F, -21.75F, 6F);

		a4locomotiveModel[220].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 240
		a4locomotiveModel[220].setRotationPoint(-11.75F, -21.75F, 6F);

		a4locomotiveModel[221].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 241
		a4locomotiveModel[221].setRotationPoint(-4.75F, -21.75F, 6F);

		a4locomotiveModel[222].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 242
		a4locomotiveModel[222].setRotationPoint(2.25F, -21.75F, 6F);

		a4locomotiveModel[223].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 243
		a4locomotiveModel[223].setRotationPoint(9.25F, -21.75F, 6F);

		a4locomotiveModel[224].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 244
		a4locomotiveModel[224].setRotationPoint(16.25F, -21.75F, 6F);

		a4locomotiveModel[225].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 245
		a4locomotiveModel[225].setRotationPoint(37.25F, -19.75F, 6.5F);

		a4locomotiveModel[226].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -1.25F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, 0F, 0F, -1.25F, 0F); // Box 246
		a4locomotiveModel[226].setRotationPoint(36.75F, -19.91F, 6.35F);

		a4locomotiveModel[227].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, 0F, 0F, -0.75F, 0F, -1F, -1F, 0F, -1F, -0.75F, 0F, 0F, -1F, 0F, -1.75F, -0.75F, 0F, -0.75F, -1F, 0F, -0.75F, -0.75F, 0F, -1.75F, -1F); // Box 247
		a4locomotiveModel[227].setRotationPoint(34.75F, -21.14F, 6.1F);

		a4locomotiveModel[228].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.5F, 0F, 0F, -0.75F, 0F, -1.75F, 0F, 0F, -1.25F, -0.25F, 0F, -1.25F, -0.5F, 0F, -1.75F, -0.75F); // Box 248
		a4locomotiveModel[228].setRotationPoint(32.75F, -21.63F, 6.6F);

		a4locomotiveModel[229].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 249
		a4locomotiveModel[229].setRotationPoint(30.75F, -21.63F, 5.87F);

		a4locomotiveModel[230].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 250
		a4locomotiveModel[230].setRotationPoint(30.25F, -21.75F, 6F);

		a4locomotiveModel[231].addBox(0F, 0F, 0F, 10, 2, 1, 0F); // Box 251
		a4locomotiveModel[231].setRotationPoint(-32F, -16F, 6.25F);

		a4locomotiveModel[232].addShapeBox(0F, 0F, 0F, 22, 9, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 252
		a4locomotiveModel[232].setRotationPoint(43F, -15F, 9F);

		a4locomotiveModel[233].addShapeBox(0F, 0F, 0F, 7, 6, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 253
		a4locomotiveModel[233].setRotationPoint(58F, -6F, 9F);

		a4locomotiveModel[234].addShapeBox(0F, 0F, 0F, 15, 6, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.8F, 0F); // Box 254
		a4locomotiveModel[234].setRotationPoint(43F, -6F, 9F);

		a4locomotiveModel[235].addShapeBox(0F, 0F, 0F, 4, 15, 3, 0F, 0F, 0F, 0.9F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2.9F, -3F, 0.1F, -2F, 0F, 0.2F, -2F, 0F, 0.2F, 0F, -3F, 0.1F, 0F); // Box 255
		a4locomotiveModel[235].setRotationPoint(39F, -17F, 7F);

		a4locomotiveModel[236].addShapeBox(0F, 0F, 0F, 2, 7, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 256
		a4locomotiveModel[236].setRotationPoint(43F, -22F, 9F);

		a4locomotiveModel[237].addShapeBox(0F, 0F, 0F, 28, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 257
		a4locomotiveModel[237].setRotationPoint(43F, -24F, 9F);

		a4locomotiveModel[238].addShapeBox(0F, 0F, 0F, 2, 7, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 258
		a4locomotiveModel[238].setRotationPoint(51F, -22F, 9F);

		a4locomotiveModel[239].addShapeBox(0F, 0F, 0F, 2, 7, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 259
		a4locomotiveModel[239].setRotationPoint(59F, -22F, 9F);

		a4locomotiveModel[240].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 260
		a4locomotiveModel[240].setRotationPoint(61F, -17F, 9F);

		a4locomotiveModel[241].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 261
		a4locomotiveModel[241].setRotationPoint(61F, -18F, 9F);

		a4locomotiveModel[242].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 262
		a4locomotiveModel[242].setRotationPoint(61F, -19F, 9F);

		a4locomotiveModel[243].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 263
		a4locomotiveModel[243].setRotationPoint(61F, -22F, 9F);

		a4locomotiveModel[244].addShapeBox(0F, 0F, 0F, 12, 26, 23, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -23F, -19F, 0F, -22F, -21F, 0F, -4F, -1F, 0F, -3F, -1F, 0F, -3F, -21F, 0F, -4F, -23F); // Box 264
		a4locomotiveModel[244].setRotationPoint(17F, -25F, 6F);

		a4locomotiveModel[245].addShapeBox(0F, 0F, 0F, 13, 22, 23, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, -23F, -19F, 0F, -21.5F, -19.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 1.05F, -19F, 0F, -0.5F, -19.25F); // Box 265
		a4locomotiveModel[245].setRotationPoint(29F, -25F, 6F);

		a4locomotiveModel[246].addShapeBox(0F, 0F, 0F, 8, 5, 3, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F); // Box 266
		a4locomotiveModel[246].setRotationPoint(29F, -3F, 6F);

		a4locomotiveModel[247].addShapeBox(0F, 0F, 0F, 41, 5, 1, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F); // Box 267
		a4locomotiveModel[247].setRotationPoint(17F, -5F, 8F);

		a4locomotiveModel[248].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F, 0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0F, -1.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.15F, -0.4F, 0F, -0.6F); // Box 268
		a4locomotiveModel[248].setRotationPoint(39F, -20F, 6F);

		a4locomotiveModel[249].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, -0.6F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, -0.5F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0F, -1.1F); // Box 269
		a4locomotiveModel[249].setRotationPoint(38F, -22F, 6F);

		a4locomotiveModel[250].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, -0.2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F); // Box 270
		a4locomotiveModel[250].setRotationPoint(38F, -25F, 6F);

		a4locomotiveModel[251].addShapeBox(0F, 0F, 0F, 5, 3, 4, 0F, 0F, 0F, 0F, 0F, -1F, -3F, 0F, -1F, 0F, 0F, 0F, -4F, 0F, -3F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -3F, -4F); // Box 271
		a4locomotiveModel[251].setRotationPoint(38F, -25F, 6F);

		a4locomotiveModel[252].addShapeBox(0F, 0F, 0F, 1, 6, 2, 0F, -0.5F, -0.7F, -0.7F, 0F, -1F, -1F, 0F, -1F, 0F, -0.5F, -0.7F, -0.4F, -0.5F, 0F, -0.65F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, -0.35F); // Box 272
		a4locomotiveModel[252].setRotationPoint(42F, -23F, 8F);

		a4locomotiveModel[253].addShapeBox(0F, 0F, 0F, 4, 7, 3, 0F, 0F, 0F, 0.25F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3.25F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 277
		a4locomotiveModel[253].setRotationPoint(39F, -24F, 6.95F);

		a4locomotiveModel[254].addShapeBox(0F, 0F, 0F, 5, 1, 10, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 270
		a4locomotiveModel[254].setRotationPoint(38F, -26F, -5F);

		a4locomotiveModel[255].addBox(0F, 0F, 0F, 19, 6, 2, 0F); // Box 271
		a4locomotiveModel[255].setRotationPoint(46F, 2F, -8F);

		a4locomotiveModel[256].addShapeBox(0F, 0F, 0F, 9, 6, 16, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -3F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -2F); // Box 272
		a4locomotiveModel[256].setRotationPoint(37F, 2F, -8F);

		a4locomotiveModel[257].addBox(0F, 0F, 0F, 19, 6, 2, 0F); // Box 273
		a4locomotiveModel[257].setRotationPoint(46F, 2F, 6F);

		a4locomotiveModel[258].addBox(0F, 0F, 0F, 1, 6, 12, 0F); // Box 274
		a4locomotiveModel[258].setRotationPoint(64F, 2F, -6F);

		a4locomotiveModel[259].addBox(0F, 0F, 0F, 6, 7, 0, 0F); // Box 275
		a4locomotiveModel[259].setRotationPoint(53F, -22F, -9.5F);

		a4locomotiveModel[260].addBox(0F, 0F, 0F, 6, 7, 0, 0F); // Box 276
		a4locomotiveModel[260].setRotationPoint(45F, -22F, -9.5F);

		a4locomotiveModel[261].addBox(0F, 0F, 0F, 6, 7, 0, 0F); // Box 277
		a4locomotiveModel[261].setRotationPoint(45F, -22F, 9.5F);

		a4locomotiveModel[262].addBox(0F, 0F, 0F, 6, 7, 0, 0F); // Box 278
		a4locomotiveModel[262].setRotationPoint(53F, -22F, 9.5F);

		a4locomotiveModel[263].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 279
		a4locomotiveModel[263].setRotationPoint(-52F, 0.5F, -8F);

		a4locomotiveModel[264].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 280
		a4locomotiveModel[264].setRotationPoint(-52.5F, -0.5F, -8F);

		a4locomotiveModel[265].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 281
		a4locomotiveModel[265].setRotationPoint(-52.5F, -0.5F, -9F);

		a4locomotiveModel[266].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F); // Box 282
		a4locomotiveModel[266].setRotationPoint(-52.5F, -0.5F, -7F);

		a4locomotiveModel[267].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 286
		a4locomotiveModel[267].setRotationPoint(-52F, 0.5F, 7F);

		a4locomotiveModel[268].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 287
		a4locomotiveModel[268].setRotationPoint(62F, 4F, -10F);

		a4locomotiveModel[269].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 288
		a4locomotiveModel[269].setRotationPoint(62F, 8F, -10F);

		a4locomotiveModel[270].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 289
		a4locomotiveModel[270].setRotationPoint(62F, 8F, 6F);

		a4locomotiveModel[271].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 290
		a4locomotiveModel[271].setRotationPoint(62F, 4F, 8F);

		a4locomotiveModel[272].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 257
		a4locomotiveModel[272].setRotationPoint(65F, -2F, -1F);

		a4locomotiveModel[273].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F); // Box 268
		a4locomotiveModel[273].setRotationPoint(63F, -2.5F, 10.5F);

		a4locomotiveModel[274].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 269
		a4locomotiveModel[274].setRotationPoint(63F, -2.5F, 10F);

		a4locomotiveModel[275].addShapeBox(0F, 0F, 0F, 1, 13, 1, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 270
		a4locomotiveModel[275].setRotationPoint(63F, -15F, 10F);

		a4locomotiveModel[276].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 271
		a4locomotiveModel[276].setRotationPoint(63F, -15.5F, 10.5F);

		a4locomotiveModel[277].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 272
		a4locomotiveModel[277].setRotationPoint(63F, -15.5F, 10F);

		a4locomotiveModel[278].addShapeBox(0F, 0F, 0F, 15, 1, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 302
		a4locomotiveModel[278].setRotationPoint(45.5F, -14.5F, -11.5F);

		a4locomotiveModel[279].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 303
		a4locomotiveModel[279].setRotationPoint(45F, -14.5F, -10.5F);

		a4locomotiveModel[280].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 304
		a4locomotiveModel[280].setRotationPoint(45F, -14.5F, -11.5F);

		a4locomotiveModel[281].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F); // Box 305
		a4locomotiveModel[281].setRotationPoint(60F, -14.5F, -10.5F);

		a4locomotiveModel[282].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 306
		a4locomotiveModel[282].setRotationPoint(60F, -14.5F, -11.5F);

		a4locomotiveModel[283].addShapeBox(0F, 0F, 0F, 15, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 307
		a4locomotiveModel[283].setRotationPoint(45.5F, -14.5F, 10.5F);

		a4locomotiveModel[284].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F); // Box 308
		a4locomotiveModel[284].setRotationPoint(60F, -14.5F, 10.5F);

		a4locomotiveModel[285].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 309
		a4locomotiveModel[285].setRotationPoint(60F, -14.5F, 9.5F);

		a4locomotiveModel[286].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F); // Box 310
		a4locomotiveModel[286].setRotationPoint(45F, -14.5F, 10.5F);

		a4locomotiveModel[287].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 311
		a4locomotiveModel[287].setRotationPoint(45F, -14.5F, 9.5F);

		a4locomotiveModel[288].addShapeBox(0F, 0F, 0F, 48, 12, 0, 0F, 0F, 0F, 0F, -32F, 0F, 0F, -32F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, -32F, -8F, 0F, -32F, -8F, 0F, 0F, -8F, 0F); // Box 312
		a4locomotiveModel[288].setRotationPoint(45F, -13F, -10.01F);

		a4locomotiveModel[289].addShapeBox(0F, 0F, 0F, 48, 12, 0, 0F, 0F, 0F, 0F, -32F, 0F, 0F, -32F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, -32F, -8F, 0F, -32F, -8F, 0F, 0F, -8F, 0F); // Box 313
		a4locomotiveModel[289].setRotationPoint(45F, -13F, 10.01F);

		a4locomotiveModel[290].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 314
		a4locomotiveModel[290].setRotationPoint(70F, -24F, -9F);
		a4locomotiveModel[290].rotateAngleX = -0.01745329F;

		a4locomotiveModel[291].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 315
		a4locomotiveModel[291].setRotationPoint(70F, -26F, -8F);
		a4locomotiveModel[291].rotateAngleX = -0.01745329F;

		a4locomotiveModel[292].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 316
		a4locomotiveModel[292].setRotationPoint(70F, -26F, 5F);
		a4locomotiveModel[292].rotateAngleX = -0.01745329F;

		a4locomotiveModel[293].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 317
		a4locomotiveModel[293].setRotationPoint(70F, -24F, 8F);
		a4locomotiveModel[293].rotateAngleX = -0.01745329F;

		a4locomotiveModel[294].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 314
		a4locomotiveModel[294].setRotationPoint(-32F, 0.5F, -8F);

		a4locomotiveModel[295].addShapeBox(0F, 0F, 0F, 12, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 315
		a4locomotiveModel[295].setRotationPoint(-30F, 0.5F, -8F);

		a4locomotiveModel[296].addShapeBox(0F, 0F, 0F, 12, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 316
		a4locomotiveModel[296].setRotationPoint(-30F, 1.25F, -8F);

		a4locomotiveModel[297].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 317
		a4locomotiveModel[297].setRotationPoint(-18F, 0.5F, -8F);

		a4locomotiveModel[298].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 318
		a4locomotiveModel[298].setRotationPoint(-25F, 0.75F, -8F);

		a4locomotiveModel[299].addBox(0F, 0F, 0F, 1, 3, 0, 0F); // Box 319
		a4locomotiveModel[299].setRotationPoint(-24.5F, 0.75F, -8F);

		a4locomotiveModel[300].addShapeBox(0F, 0F, 0F, 2, 2, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 320
		a4locomotiveModel[300].setRotationPoint(-48F, 3F, -7F);

		a4locomotiveModel[301].addBox(0F, 0F, 0F, 7, 1, 1, 0F); // Box 321
		a4locomotiveModel[301].setRotationPoint(-32F, -2F, -8.5F);

		a4locomotiveModel[302].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 322
		a4locomotiveModel[302].setRotationPoint(-32F, -2.5F, -9F);

		a4locomotiveModel[303].addShapeBox(0F, 0F, 0F, 4, 2, 0, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 323
		a4locomotiveModel[303].setRotationPoint(-27.5F, 2.75F, -8F);

		a4locomotiveModel[304].addBox(0F, 0F, 0F, 1, 8, 0, 0F); // Box 324
		a4locomotiveModel[304].setRotationPoint(-27.5F, -3.25F, -8F);

		a4locomotiveModel[305].addBox(0F, 0F, 0F, 1, 4, 0, 0F); // Box 325
		a4locomotiveModel[305].setRotationPoint(7F, 1.5F, -8F);

		a4locomotiveModel[306].addBox(0F, 0F, 0F, 17, 1, 0, 0F); // Box 326
		a4locomotiveModel[306].setRotationPoint(-9F, 1.5F, -8F);

		a4locomotiveModel[307].addShapeBox(0F, 0F, 0F, 2, 2, 0, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 327
		a4locomotiveModel[307].setRotationPoint(-10F, 0.5F, -8F);

		a4locomotiveModel[308].addShapeBox(0F, 0F, 0F, 3, 3, 0, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, -0.5F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 328
		a4locomotiveModel[308].setRotationPoint(-10F, -2F, -8F);

		a4locomotiveModel[309].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 329
		a4locomotiveModel[309].setRotationPoint(-8.5F, -2F, -8.5F);

		a4locomotiveModel[310].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 330
		a4locomotiveModel[310].setRotationPoint(-8F, -4F, -8F);

		a4locomotiveModel[311].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, -1F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -1F, 0F, -0.25F, 0F, -1F, -0.25F, -2F, 0F, -0.25F, -2F, 0F, -0.25F, 0F, -1F, -0.25F); // Box 331
		a4locomotiveModel[311].setRotationPoint(-7.5F, -3F, -8.5F);

		a4locomotiveModel[312].addShapeBox(0F, 0F, 0F, 19, 2, 0, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 332
		a4locomotiveModel[312].setRotationPoint(-27.5F, -3F, -8F);

		a4locomotiveModel[313].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 333
		a4locomotiveModel[313].setRotationPoint(-23F, -3F, -8.5F);

		a4locomotiveModel[314].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 334
		a4locomotiveModel[314].setRotationPoint(-1F, -3F, -8.5F);

		a4locomotiveModel[315].addBox(0F, 0F, 0F, 6, 1, 0, 0F); // Box 335
		a4locomotiveModel[315].setRotationPoint(-8F, -2F, -8F);

		a4locomotiveModel[316].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 336
		a4locomotiveModel[316].setRotationPoint(-3F, -3F, -8F);

		a4locomotiveModel[317].addShapeBox(0F, 0F, 0F, 41, 5, 1, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, -0.5F, 0F, 0F, -0.5F, 0F, -4.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -4.5F, -0.5F); // Box 337
		a4locomotiveModel[317].setRotationPoint(-3F, -3F, -8.25F);

		a4locomotiveModel[318].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 338
		a4locomotiveModel[318].setRotationPoint(17F, -3F, -8.5F);

		a4locomotiveModel[319].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 339
		a4locomotiveModel[319].setRotationPoint(33F, -0.5F, -8.5F);

		a4locomotiveModel[320].addShapeBox(0F, 0F, 0F, 1, 2, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 340
		a4locomotiveModel[320].setRotationPoint(-48F, 7F, -6F);

		a4locomotiveModel[321].addShapeBox(0F, 0F, 0F, 2, 2, 12, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 341
		a4locomotiveModel[321].setRotationPoint(-48F, 5F, -6F);

		a4locomotiveModel[322].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 342
		a4locomotiveModel[322].setRotationPoint(-49F, 6F, -6.5F);

		a4locomotiveModel[323].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 343
		a4locomotiveModel[323].setRotationPoint(-49F, 7F, -6.5F);

		a4locomotiveModel[324].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 344
		a4locomotiveModel[324].setRotationPoint(-49F, 6.5F, -6.5F);

		a4locomotiveModel[325].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 345
		a4locomotiveModel[325].setRotationPoint(-49F, 6.5F, 6F);

		a4locomotiveModel[326].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 346
		a4locomotiveModel[326].setRotationPoint(-49F, 7F, 6F);

		a4locomotiveModel[327].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 347
		a4locomotiveModel[327].setRotationPoint(-49F, 6F, 6F);

		a4locomotiveModel[328].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.75F, 0F, 0F, -1.25F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.75F, 0F, -0.5F, -1.25F); // Box 348
		a4locomotiveModel[328].setRotationPoint(-45.5F, 6F, 6.5F);

		a4locomotiveModel[329].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.75F, 0F, 0F, -1.25F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.75F, 0F, -0.5F, -1.25F); // Box 350
		a4locomotiveModel[329].setRotationPoint(-45.5F, 6.5F, 6.5F);

		a4locomotiveModel[330].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.75F, 0F, 0F, -1.25F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.75F, 0F, -0.5F, -1.25F); // Box 351
		a4locomotiveModel[330].setRotationPoint(-45.5F, 7F, 6.5F);

		a4locomotiveModel[331].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, -1.25F, -0.5F, 0F, -0.75F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1.25F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 352
		a4locomotiveModel[331].setRotationPoint(-45.5F, 7F, -8.5F);

		a4locomotiveModel[332].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, -1.25F, -0.5F, 0F, -0.75F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1.25F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 353
		a4locomotiveModel[332].setRotationPoint(-45.5F, 6.5F, -8.5F);

		a4locomotiveModel[333].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, -1.25F, -0.5F, 0F, -0.75F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1.25F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 354
		a4locomotiveModel[333].setRotationPoint(-45.5F, 6F, -8.5F);

		a4locomotiveModel[334].addBox(0F, 0F, 0F, 1, 4, 0, 0F); // Box 355
		a4locomotiveModel[334].setRotationPoint(7F, -0.5F, 8.01F);

		a4locomotiveModel[335].addShapeBox(0F, 0F, 0F, 31, 3, 1, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0.5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0.5F, 0F); // Box 356
		a4locomotiveModel[335].setRotationPoint(-24F, -0.5F, 7F);

		a4locomotiveModel[336].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 357
		a4locomotiveModel[336].setRotationPoint(7F, -0.5F, 7F);

		a4locomotiveModel[337].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 358
		a4locomotiveModel[337].setRotationPoint(6.5F, -1F, 6F);

		a4locomotiveModel[338].addBox(0F, 0F, 0F, 18, 1, 1, 0F); // Box 359
		a4locomotiveModel[338].setRotationPoint(8.5F, -0.5F, 6F);

		a4locomotiveModel[339].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 360
		a4locomotiveModel[339].setRotationPoint(26.5F, -1F, 6F);

		a4locomotiveModel[340].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 361
		a4locomotiveModel[340].setRotationPoint(-13.5F, -1F, 6F);

		a4locomotiveModel[341].addBox(0F, 0F, 0F, 18, 1, 1, 0F); // Box 362
		a4locomotiveModel[341].setRotationPoint(-11.5F, -0.5F, 6F);

		a4locomotiveModel[342].addShapeBox(0F, 0F, 0F, 17, 2, 0, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 363
		a4locomotiveModel[342].setRotationPoint(-9F, 1.5F, 8F);

		a4locomotiveModel[343].addShapeBox(0F, 0F, 0F, 2, 2, 0, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 364
		a4locomotiveModel[343].setRotationPoint(-10F, 0.5F, 8.01F);

		a4locomotiveModel[344].addShapeBox(0F, 0F, 0F, 3, 3, 0, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, -0.5F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 365
		a4locomotiveModel[344].setRotationPoint(-10F, -2F, 8.01F);

		a4locomotiveModel[345].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 366
		a4locomotiveModel[345].setRotationPoint(-8.5F, -2F, 7.5F);

		a4locomotiveModel[346].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 367
		a4locomotiveModel[346].setRotationPoint(-8F, -4F, 8F);

		a4locomotiveModel[347].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, -1F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -1F, 0F, -0.25F, 0F, -1F, -0.25F, -2F, 0F, -0.25F, -2F, 0F, -0.25F, 0F, -1F, -0.25F); // Box 368
		a4locomotiveModel[347].setRotationPoint(-7.5F, -3F, 7.5F);

		a4locomotiveModel[348].addBox(0F, 0F, 0F, 6, 1, 0, 0F); // Box 369
		a4locomotiveModel[348].setRotationPoint(-8F, -2F, 8F);

		a4locomotiveModel[349].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 370
		a4locomotiveModel[349].setRotationPoint(-3F, -3F, 8.01F);

		a4locomotiveModel[350].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 371
		a4locomotiveModel[350].setRotationPoint(-1F, -3F, 7.5F);

		a4locomotiveModel[351].addShapeBox(0F, 0F, 0F, 41, 5, 1, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, -0.5F, 0F, 0F, -0.5F, 0F, -4.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -4.5F, -0.5F); // Box 372
		a4locomotiveModel[351].setRotationPoint(-3F, -3F, 7.75F);

		a4locomotiveModel[352].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 373
		a4locomotiveModel[352].setRotationPoint(17F, -3F, 7.5F);

		a4locomotiveModel[353].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 374
		a4locomotiveModel[353].setRotationPoint(33F, -0.5F, 7.5F);

		a4locomotiveModel[354].addShapeBox(0F, 0F, 0F, 4, 2, 0, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 375
		a4locomotiveModel[354].setRotationPoint(-27.5F, 2.75F, 8.02F);

		a4locomotiveModel[355].addBox(0F, 0F, 0F, 1, 8, 0, 0F); // Box 376
		a4locomotiveModel[355].setRotationPoint(-27.5F, -3.25F, 8.01F);

		a4locomotiveModel[356].addBox(0F, 0F, 0F, 1, 3, 0, 0F); // Box 377
		a4locomotiveModel[356].setRotationPoint(-24.5F, 0.75F, 8.01F);

		a4locomotiveModel[357].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 378
		a4locomotiveModel[357].setRotationPoint(-25F, 0.75F, 7F);

		a4locomotiveModel[358].addShapeBox(0F, 0F, 0F, 12, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 379
		a4locomotiveModel[358].setRotationPoint(-30F, 0.5F, 7F);

		a4locomotiveModel[359].addShapeBox(0F, 0F, 0F, 12, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 380
		a4locomotiveModel[359].setRotationPoint(-30F, 1.25F, 7F);

		a4locomotiveModel[360].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 381
		a4locomotiveModel[360].setRotationPoint(-18F, 0.5F, 7F);

		a4locomotiveModel[361].addShapeBox(0F, 0F, 0F, 19, 2, 0, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 382
		a4locomotiveModel[361].setRotationPoint(-27.5F, -3F, 8F);

		a4locomotiveModel[362].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 383
		a4locomotiveModel[362].setRotationPoint(-23F, -3F, 7.5F);

		a4locomotiveModel[363].addBox(0F, 0F, 0F, 7, 1, 1, 0F); // Box 384
		a4locomotiveModel[363].setRotationPoint(-32F, -2F, 7.5F);

		a4locomotiveModel[364].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 385
		a4locomotiveModel[364].setRotationPoint(-32F, 0.5F, 7F);

		a4locomotiveModel[365].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 386
		a4locomotiveModel[365].setRotationPoint(-32F, -2.5F, 7F);

		a4locomotiveModel[366].addBox(0F, 0F, 0F, 8, 1, 1, 0F); // Box 387
		a4locomotiveModel[366].setRotationPoint(-32F, 2F, 7F);

		a4locomotiveModel[367].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 120
		a4locomotiveModel[367].setRotationPoint(49F, 1.5F, 7.5F);

		a4locomotiveModel[368].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 121
		a4locomotiveModel[368].setRotationPoint(57.5F, 1.5F, 7.5F);

		a4locomotiveModel[369].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Box 122
		a4locomotiveModel[369].setRotationPoint(56.75F, 7.5F, 8F);

		a4locomotiveModel[370].addShapeBox(0F, 0F, 0F, 5, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 125
		a4locomotiveModel[370].setRotationPoint(51F, 4F, 8F);

		a4locomotiveModel[371].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 127
		a4locomotiveModel[371].setRotationPoint(53F, 2F, 8F);

		a4locomotiveModel[372].addShapeBox(0F, 0F, 0F, 9, 2, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -0.5F, -4F, 0F, -0.5F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 128
		a4locomotiveModel[372].setRotationPoint(49F, 2F, 7.5F);

		a4locomotiveModel[373].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Box 130
		a4locomotiveModel[373].setRotationPoint(48.25F, 7.5F, 8F);

		a4locomotiveModel[374].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Box 396
		a4locomotiveModel[374].setRotationPoint(48.25F, 7.5F, -9F);

		a4locomotiveModel[375].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 397
		a4locomotiveModel[375].setRotationPoint(57.5F, 1.5F, -8.5F);

		a4locomotiveModel[376].addShapeBox(0F, 0F, 0F, 5, 4, 1, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 398
		a4locomotiveModel[376].setRotationPoint(51F, 4F, -9F);

		a4locomotiveModel[377].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 399
		a4locomotiveModel[377].setRotationPoint(53F, 2F, -9F);

		a4locomotiveModel[378].addShapeBox(0F, 0F, 0F, 9, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -0.5F, -4F, 0F, -0.5F); // Box 400
		a4locomotiveModel[378].setRotationPoint(49F, 2F, -8.5F);

		a4locomotiveModel[379].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Box 401
		a4locomotiveModel[379].setRotationPoint(56.75F, 7.5F, -9F);

		a4locomotiveModel[380].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 402
		a4locomotiveModel[380].setRotationPoint(49F, 1.5F, -8.5F);

		a4locomotiveModel[381].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 403
		a4locomotiveModel[381].setRotationPoint(-34F, -25F, -0.25F);

		a4locomotiveModel[382].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 404
		a4locomotiveModel[382].setRotationPoint(-33.88F, -23F, -0.13F);

		a4locomotiveModel[383].addShapeBox(0F, 0F, 0F, 1, 10, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 406
		a4locomotiveModel[383].setRotationPoint(43F, -13F, -4.5F);

		a4locomotiveModel[384].addShapeBox(0F, 0F, 0F, 1, 10, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 407
		a4locomotiveModel[384].setRotationPoint(43F, -13F, -4F);

		a4locomotiveModel[385].addShapeBox(0F, 0F, 0F, 1, 10, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 408
		a4locomotiveModel[385].setRotationPoint(43F, -13F, -5F);

		a4locomotiveModel[386].addShapeBox(0F, 0F, 0F, 1, 10, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 409
		a4locomotiveModel[386].setRotationPoint(43F, -13F, 3.5F);

		a4locomotiveModel[387].addShapeBox(0F, 0F, 0F, 1, 12, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 410
		a4locomotiveModel[387].setRotationPoint(43F, -13F, 4F);

		a4locomotiveModel[388].addShapeBox(0F, 0F, 0F, 1, 12, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 411
		a4locomotiveModel[388].setRotationPoint(43F, -13F, 4.5F);

		a4locomotiveModel[389].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 412
		a4locomotiveModel[389].setRotationPoint(43F, -22F, -2F);

		a4locomotiveModel[390].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 413
		a4locomotiveModel[390].setRotationPoint(43F, -22F, 1F);

		a4locomotiveModel[391].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 416
		a4locomotiveModel[391].setRotationPoint(43F, -18F, -4F);

		a4locomotiveModel[392].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 417
		a4locomotiveModel[392].setRotationPoint(43F, -18F, 2F);

		a4locomotiveModel[393].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 418
		a4locomotiveModel[393].setRotationPoint(43F, -19F, -1.75F);

		a4locomotiveModel[394].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 419
		a4locomotiveModel[394].setRotationPoint(43F, -19F, 1.25F);

		a4locomotiveModel[395].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F, 0F, 0F, -2.25F, -0.5F, 0F, -2.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -2.5F, 0F, 0F, -2.5F); // Box 420
		a4locomotiveModel[395].setRotationPoint(43F, -16F, -4F);

		a4locomotiveModel[396].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -2.25F, 0F, 0F, -2.25F, 0F, 0F, -2.5F, -0.5F, 0F, -2.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 421
		a4locomotiveModel[396].setRotationPoint(43F, -16F, 1F);

		a4locomotiveModel[397].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, 0F, 0F, -1.5F, -0.5F, 0F, -1.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1.5F, 0F, 0F, -1.5F); // Box 422
		a4locomotiveModel[397].setRotationPoint(43F, -15F, -5F);

		a4locomotiveModel[398].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, 0F, 0F, -1.5F, -0.5F, 0F, -1.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1.5F, 0F, 0F, -1.5F); // Box 423
		a4locomotiveModel[398].setRotationPoint(43F, -15F, -4.5F);

		a4locomotiveModel[399].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 424
		a4locomotiveModel[399].setRotationPoint(43F, -16F, -3.5F);

		a4locomotiveModel[400].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 425
		a4locomotiveModel[400].setRotationPoint(43F, -16F, -3F);

		a4locomotiveModel[401].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 426
		a4locomotiveModel[401].setRotationPoint(43F, -16F, 2.5F);

		a4locomotiveModel[402].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, -0.5F, 0F, -1.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 427
		a4locomotiveModel[402].setRotationPoint(43F, -15F, 3F);

		a4locomotiveModel[403].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, -0.5F, 0F, -1.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 428
		a4locomotiveModel[403].setRotationPoint(43F, -15F, 2.5F);

		a4locomotiveModel[404].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 429
		a4locomotiveModel[404].setRotationPoint(43F, -16F, 2F);

		a4locomotiveModel[405].addShapeBox(0F, 0F, 0F, 1, 9, 2, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 430
		a4locomotiveModel[405].setRotationPoint(45F, -12F, -7F);

		a4locomotiveModel[406].addShapeBox(0F, 0F, 0F, 1, 9, 2, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F); // Box 432
		a4locomotiveModel[406].setRotationPoint(45.5F, -12F, -7F);

		a4locomotiveModel[407].addShapeBox(0F, 0F, 0F, 1, 9, 2, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F); // Box 434
		a4locomotiveModel[407].setRotationPoint(44F, -12F, -7F);

		a4locomotiveModel[408].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 207
		a4locomotiveModel[408].setRotationPoint(45F, -13F, -6.25F);

		a4locomotiveModel[409].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 209
		a4locomotiveModel[409].setRotationPoint(45F, -13.5F, -6.25F);

		a4locomotiveModel[410].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 210
		a4locomotiveModel[410].setRotationPoint(45F, -14F, -4.75F);

		a4locomotiveModel[411].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 438
		a4locomotiveModel[411].setRotationPoint(43.5F, -17.25F, -3.25F);

		a4locomotiveModel[412].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 439
		a4locomotiveModel[412].setRotationPoint(44F, -17.75F, -3.25F);

		a4locomotiveModel[413].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 440
		a4locomotiveModel[413].setRotationPoint(44F, -17.75F, -3.75F);

		a4locomotiveModel[414].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -1F, 0F, 0F, -1F, 0F); // Box 441
		a4locomotiveModel[414].setRotationPoint(44F, -17.75F, -3.25F);

		a4locomotiveModel[415].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -1F, 0F, 0F, -1F, 0F); // Box 442
		a4locomotiveModel[415].setRotationPoint(44F, -17.75F, 2.75F);

		a4locomotiveModel[416].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 443
		a4locomotiveModel[416].setRotationPoint(44F, -17.75F, 2.75F);

		a4locomotiveModel[417].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 444
		a4locomotiveModel[417].setRotationPoint(44F, -17.75F, 2.25F);

		a4locomotiveModel[418].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 445
		a4locomotiveModel[418].setRotationPoint(43.5F, -17.25F, 2.75F);

		a4locomotiveModel[419].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 446
		a4locomotiveModel[419].setRotationPoint(43F, -9F, -3F);

		a4locomotiveModel[420].addShapeBox(0F, 0F, 0F, 1, 5, 2, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 447
		a4locomotiveModel[420].setRotationPoint(43F, -10F, -2F);

		a4locomotiveModel[421].addShapeBox(0F, 0F, 0F, 1, 5, 2, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 448
		a4locomotiveModel[421].setRotationPoint(43F, -10F, 0F);

		a4locomotiveModel[422].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 449
		a4locomotiveModel[422].setRotationPoint(43F, -9F, 2F);

		a4locomotiveModel[423].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 450
		a4locomotiveModel[423].setRotationPoint(43F, -10.5F, -3F);

		a4locomotiveModel[424].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 451
		a4locomotiveModel[424].setRotationPoint(43F, -5F, -3F);

		a4locomotiveModel[425].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F); // Box 452
		a4locomotiveModel[425].setRotationPoint(-52.5F, -0.5F, 8F);

		a4locomotiveModel[426].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 453
		a4locomotiveModel[426].setRotationPoint(-52.5F, -0.5F, 7F);

		a4locomotiveModel[427].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 454
		a4locomotiveModel[427].setRotationPoint(-52.5F, -0.5F, 6F);

		a4locomotiveModel[428].addShapeBox(0F, 0F, 0F, 40, 22, 22, 0F, 0F, -20F, 0F, 0F, -22F, 0F, 0F, 0F, -20F, 0F, 0F, -20F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -21F, 0F, 0F, -21F); // Box 444
		a4locomotiveModel[428].setRotationPoint(-23F, -25F, -8F);

		a4locomotiveModel[429].addShapeBox(0F, 0F, 0F, 1, 13, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 444
		a4locomotiveModel[429].setRotationPoint(63F, -15F, -11F);

		a4locomotiveModel[430].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 445
		a4locomotiveModel[430].setRotationPoint(63F, -2.5F, -11F);

		a4locomotiveModel[431].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 446
		a4locomotiveModel[431].setRotationPoint(63F, -2.5F, -11.5F);

		a4locomotiveModel[432].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 447
		a4locomotiveModel[432].setRotationPoint(63F, -15.5F, -11.5F);

		a4locomotiveModel[433].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 448
		a4locomotiveModel[433].setRotationPoint(63F, -15.5F, -11F);

		a4locomotiveModel[434].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 451
		a4locomotiveModel[434].setRotationPoint(43F, -6F, -3F);

		a4locomotiveModel[435].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 452
		a4locomotiveModel[435].setRotationPoint(43F, -10F, -3F);

		a4locomotiveModel[436].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F); // Box 453
		a4locomotiveModel[436].setRotationPoint(43F, -6F, 2F);

		a4locomotiveModel[437].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 454
		a4locomotiveModel[437].setRotationPoint(43F, -10F, 2F);

		a4locomotiveModel[438].addShapeBox(0F, 0F, 0F, 4, 3, 8, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 108
		a4locomotiveModel[438].setRotationPoint(-40F, -21F, -4F);


	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		for(int i = 0; i < 439; i++)
		{
			a4locomotiveModel[i].render(f5);
		}
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
	{
	}

	public ModelRendererTurbo a4locomotiveModel[];
}