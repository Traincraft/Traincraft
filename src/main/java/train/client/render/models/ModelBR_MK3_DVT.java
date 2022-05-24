//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2022 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator:
// Created on:14.10.2021 - 00:55:19
// Last changed on: 14.10.2021 - 00:55:19

package train.client.render.models;

import net.minecraft.entity.Entity;
import tmt.ModelBase;
import tmt.ModelRendererTurbo;



public class ModelBR_MK3_DVT extends ModelBase
{
	int textureX = 512;
	int textureY = 512;

	public ModelBR_MK3_DVT()
	{
		br_mk3_dvtModel = new ModelRendererTurbo[200];
		br_mk3_dvtModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // 01
		br_mk3_dvtModel[1] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // 02
		br_mk3_dvtModel[2] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // 03
		br_mk3_dvtModel[3] = new ModelRendererTurbo(this, 193, 9, textureX, textureY); // 04
		br_mk3_dvtModel[4] = new ModelRendererTurbo(this, 353, 9, textureX, textureY); // 05
		br_mk3_dvtModel[5] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // 06
		br_mk3_dvtModel[6] = new ModelRendererTurbo(this, 153, 25, textureX, textureY); // 07
		br_mk3_dvtModel[7] = new ModelRendererTurbo(this, 297, 25, textureX, textureY); // 08
		br_mk3_dvtModel[8] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // 09
		br_mk3_dvtModel[9] = new ModelRendererTurbo(this, 145, 33, textureX, textureY); // 10
		br_mk3_dvtModel[10] = new ModelRendererTurbo(this, 305, 33, textureX, textureY); // 11
		br_mk3_dvtModel[11] = new ModelRendererTurbo(this, 441, 25, textureX, textureY); // 12
		br_mk3_dvtModel[12] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // 13
		br_mk3_dvtModel[13] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // 14
		br_mk3_dvtModel[14] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // 15
		br_mk3_dvtModel[15] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // 16
		br_mk3_dvtModel[16] = new ModelRendererTurbo(this, 177, 9, textureX, textureY); // 17
		br_mk3_dvtModel[17] = new ModelRendererTurbo(this, 449, 25, textureX, textureY); // 18
		br_mk3_dvtModel[18] = new ModelRendererTurbo(this, 49, 41, textureX, textureY); // 19
		br_mk3_dvtModel[19] = new ModelRendererTurbo(this, 473, 25, textureX, textureY); // 20
		br_mk3_dvtModel[20] = new ModelRendererTurbo(this, 481, 25, textureX, textureY); // 21
		br_mk3_dvtModel[21] = new ModelRendererTurbo(this, 489, 25, textureX, textureY); // 22
		br_mk3_dvtModel[22] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // 23
		br_mk3_dvtModel[23] = new ModelRendererTurbo(this, 9, 41, textureX, textureY); // 24
		br_mk3_dvtModel[24] = new ModelRendererTurbo(this, 33, 41, textureX, textureY); // 25
		br_mk3_dvtModel[25] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // 26
		br_mk3_dvtModel[26] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // 27
		br_mk3_dvtModel[27] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // 28
		br_mk3_dvtModel[28] = new ModelRendererTurbo(this, 177, 9, textureX, textureY); // 29
		br_mk3_dvtModel[29] = new ModelRendererTurbo(this, 457, 25, textureX, textureY); // 30
		br_mk3_dvtModel[30] = new ModelRendererTurbo(this, 489, 25, textureX, textureY); // 31
		br_mk3_dvtModel[31] = new ModelRendererTurbo(this, 505, 25, textureX, textureY); // 32
		br_mk3_dvtModel[32] = new ModelRendererTurbo(this, 297, 33, textureX, textureY); // 33
		br_mk3_dvtModel[33] = new ModelRendererTurbo(this, 49, 41, textureX, textureY); // 34
		br_mk3_dvtModel[34] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // 35
		br_mk3_dvtModel[35] = new ModelRendererTurbo(this, 305, 33, textureX, textureY); // 36
		br_mk3_dvtModel[36] = new ModelRendererTurbo(this, 457, 33, textureX, textureY); // 37
		br_mk3_dvtModel[37] = new ModelRendererTurbo(this, 81, 41, textureX, textureY); // 38
		br_mk3_dvtModel[38] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // 39
		br_mk3_dvtModel[39] = new ModelRendererTurbo(this, 17, 41, textureX, textureY); // 40
		br_mk3_dvtModel[40] = new ModelRendererTurbo(this, 33, 41, textureX, textureY); // 41
		br_mk3_dvtModel[41] = new ModelRendererTurbo(this, 97, 41, textureX, textureY); // 42
		br_mk3_dvtModel[42] = new ModelRendererTurbo(this, 113, 41, textureX, textureY); // 43
		br_mk3_dvtModel[43] = new ModelRendererTurbo(this, 129, 41, textureX, textureY); // 44
		br_mk3_dvtModel[44] = new ModelRendererTurbo(this, 489, 41, textureX, textureY); // 45
		br_mk3_dvtModel[45] = new ModelRendererTurbo(this, 81, 49, textureX, textureY); // 46
		br_mk3_dvtModel[46] = new ModelRendererTurbo(this, 97, 49, textureX, textureY); // 47
		br_mk3_dvtModel[47] = new ModelRendererTurbo(this, 97, 49, textureX, textureY); // 48
		br_mk3_dvtModel[48] = new ModelRendererTurbo(this, 137, 49, textureX, textureY); // 49
		br_mk3_dvtModel[49] = new ModelRendererTurbo(this, 57, 49, textureX, textureY); // 50
		br_mk3_dvtModel[50] = new ModelRendererTurbo(this, 121, 49, textureX, textureY); // 51
		br_mk3_dvtModel[51] = new ModelRendererTurbo(this, 137, 49, textureX, textureY); // 52
		br_mk3_dvtModel[52] = new ModelRendererTurbo(this, 161, 49, textureX, textureY); // 53
		br_mk3_dvtModel[53] = new ModelRendererTurbo(this, 505, 41, textureX, textureY); // 54
		br_mk3_dvtModel[54] = new ModelRendererTurbo(this, 17, 49, textureX, textureY); // 55
		br_mk3_dvtModel[55] = new ModelRendererTurbo(this, 177, 49, textureX, textureY); // 56
		br_mk3_dvtModel[56] = new ModelRendererTurbo(this, 217, 49, textureX, textureY); // 57
		br_mk3_dvtModel[57] = new ModelRendererTurbo(this, 225, 49, textureX, textureY); // 58
		br_mk3_dvtModel[58] = new ModelRendererTurbo(this, 241, 49, textureX, textureY); // 59
		br_mk3_dvtModel[59] = new ModelRendererTurbo(this, 257, 49, textureX, textureY); // 60
		br_mk3_dvtModel[60] = new ModelRendererTurbo(this, 273, 49, textureX, textureY); // 61
		br_mk3_dvtModel[61] = new ModelRendererTurbo(this, 289, 49, textureX, textureY); // 62
		br_mk3_dvtModel[62] = new ModelRendererTurbo(this, 297, 49, textureX, textureY); // 63
		br_mk3_dvtModel[63] = new ModelRendererTurbo(this, 305, 49, textureX, textureY); // 64
		br_mk3_dvtModel[64] = new ModelRendererTurbo(this, 313, 49, textureX, textureY); // 65
		br_mk3_dvtModel[65] = new ModelRendererTurbo(this, 305, 49, textureX, textureY); // 66
		br_mk3_dvtModel[66] = new ModelRendererTurbo(this, 329, 49, textureX, textureY); // 67
		br_mk3_dvtModel[67] = new ModelRendererTurbo(this, 337, 49, textureX, textureY); // 68
		br_mk3_dvtModel[68] = new ModelRendererTurbo(this, 353, 49, textureX, textureY); // 69
		br_mk3_dvtModel[69] = new ModelRendererTurbo(this, 361, 49, textureX, textureY); // 70
		br_mk3_dvtModel[70] = new ModelRendererTurbo(this, 377, 49, textureX, textureY); // 71
		br_mk3_dvtModel[71] = new ModelRendererTurbo(this, 153, 57, textureX, textureY); // 72
		br_mk3_dvtModel[72] = new ModelRendererTurbo(this, 377, 49, textureX, textureY); // 73
		br_mk3_dvtModel[73] = new ModelRendererTurbo(this, 401, 49, textureX, textureY); // 74
		br_mk3_dvtModel[74] = new ModelRendererTurbo(this, 409, 49, textureX, textureY); // 75
		br_mk3_dvtModel[75] = new ModelRendererTurbo(this, 417, 49, textureX, textureY); // 76
		br_mk3_dvtModel[76] = new ModelRendererTurbo(this, 425, 49, textureX, textureY); // 77
		br_mk3_dvtModel[77] = new ModelRendererTurbo(this, 489, 49, textureX, textureY); // 78
		br_mk3_dvtModel[78] = new ModelRendererTurbo(this, 433, 49, textureX, textureY); // 79
		br_mk3_dvtModel[79] = new ModelRendererTurbo(this, 257, 57, textureX, textureY); // 80
		br_mk3_dvtModel[80] = new ModelRendererTurbo(this, 321, 57, textureX, textureY); // 81
		br_mk3_dvtModel[81] = new ModelRendererTurbo(this, 385, 57, textureX, textureY); // 82
		br_mk3_dvtModel[82] = new ModelRendererTurbo(this, 113, 49, textureX, textureY); // 83
		br_mk3_dvtModel[83] = new ModelRendererTurbo(this, 233, 57, textureX, textureY); // 84
		br_mk3_dvtModel[84] = new ModelRendererTurbo(this, 33, 57, textureX, textureY); // 85
		br_mk3_dvtModel[85] = new ModelRendererTurbo(this, 81, 57, textureX, textureY); // 86
		br_mk3_dvtModel[86] = new ModelRendererTurbo(this, 505, 49, textureX, textureY); // 87
		br_mk3_dvtModel[87] = new ModelRendererTurbo(this, 17, 57, textureX, textureY); // 88
		br_mk3_dvtModel[88] = new ModelRendererTurbo(this, 57, 57, textureX, textureY); // 89
		br_mk3_dvtModel[89] = new ModelRendererTurbo(this, 97, 57, textureX, textureY); // 90
		br_mk3_dvtModel[90] = new ModelRendererTurbo(this, 105, 57, textureX, textureY); // 91
		br_mk3_dvtModel[91] = new ModelRendererTurbo(this, 257, 57, textureX, textureY); // 92
		br_mk3_dvtModel[92] = new ModelRendererTurbo(this, 137, 57, textureX, textureY); // 93
		br_mk3_dvtModel[93] = new ModelRendererTurbo(this, 289, 57, textureX, textureY); // 94
		br_mk3_dvtModel[94] = new ModelRendererTurbo(this, 353, 57, textureX, textureY); // 95
		br_mk3_dvtModel[95] = new ModelRendererTurbo(this, 121, 57, textureX, textureY); // 96
		br_mk3_dvtModel[96] = new ModelRendererTurbo(this, 161, 57, textureX, textureY); // 97
		br_mk3_dvtModel[97] = new ModelRendererTurbo(this, 233, 57, textureX, textureY); // 98
		br_mk3_dvtModel[98] = new ModelRendererTurbo(this, 329, 57, textureX, textureY); // 99
		br_mk3_dvtModel[99] = new ModelRendererTurbo(this, 417, 57, textureX, textureY); // 100
		br_mk3_dvtModel[100] = new ModelRendererTurbo(this, 433, 57, textureX, textureY); // 101
		br_mk3_dvtModel[101] = new ModelRendererTurbo(this, 449, 57, textureX, textureY); // 102
		br_mk3_dvtModel[102] = new ModelRendererTurbo(this, 465, 57, textureX, textureY); // 103
		br_mk3_dvtModel[103] = new ModelRendererTurbo(this, 481, 57, textureX, textureY); // 104
		br_mk3_dvtModel[104] = new ModelRendererTurbo(this, 497, 57, textureX, textureY); // 105
		br_mk3_dvtModel[105] = new ModelRendererTurbo(this, 33, 65, textureX, textureY); // 106
		br_mk3_dvtModel[106] = new ModelRendererTurbo(this, 73, 65, textureX, textureY); // 107
		br_mk3_dvtModel[107] = new ModelRendererTurbo(this, 57, 65, textureX, textureY); // 108
		br_mk3_dvtModel[108] = new ModelRendererTurbo(this, 73, 65, textureX, textureY); // 109
		br_mk3_dvtModel[109] = new ModelRendererTurbo(this, 233, 65, textureX, textureY); // 110
		br_mk3_dvtModel[110] = new ModelRendererTurbo(this, 257, 65, textureX, textureY); // 111
		br_mk3_dvtModel[111] = new ModelRendererTurbo(this, 241, 57, textureX, textureY); // 112
		br_mk3_dvtModel[112] = new ModelRendererTurbo(this, 313, 57, textureX, textureY); // 113
		br_mk3_dvtModel[113] = new ModelRendererTurbo(this, 289, 65, textureX, textureY); // 114
		br_mk3_dvtModel[114] = new ModelRendererTurbo(this, 329, 65, textureX, textureY); // 115
		br_mk3_dvtModel[115] = new ModelRendererTurbo(this, 353, 65, textureX, textureY); // 116
		br_mk3_dvtModel[116] = new ModelRendererTurbo(this, 369, 65, textureX, textureY); // 117
		br_mk3_dvtModel[117] = new ModelRendererTurbo(this, 385, 65, textureX, textureY); // 118
		br_mk3_dvtModel[118] = new ModelRendererTurbo(this, 417, 65, textureX, textureY); // 119
		br_mk3_dvtModel[119] = new ModelRendererTurbo(this, 337, 57, textureX, textureY); // 120
		br_mk3_dvtModel[120] = new ModelRendererTurbo(this, 401, 57, textureX, textureY); // 121
		br_mk3_dvtModel[121] = new ModelRendererTurbo(this, 273, 65, textureX, textureY); // 122
		br_mk3_dvtModel[122] = new ModelRendererTurbo(this, 337, 65, textureX, textureY); // 123
		br_mk3_dvtModel[123] = new ModelRendererTurbo(this, 433, 65, textureX, textureY); // 124
		br_mk3_dvtModel[124] = new ModelRendererTurbo(this, 401, 65, textureX, textureY); // 125
		br_mk3_dvtModel[125] = new ModelRendererTurbo(this, 433, 65, textureX, textureY); // 126
		br_mk3_dvtModel[126] = new ModelRendererTurbo(this, 457, 65, textureX, textureY); // 127
		br_mk3_dvtModel[127] = new ModelRendererTurbo(this, 465, 65, textureX, textureY); // 128
		br_mk3_dvtModel[128] = new ModelRendererTurbo(this, 481, 65, textureX, textureY); // 129
		br_mk3_dvtModel[129] = new ModelRendererTurbo(this, 489, 65, textureX, textureY); // 130
		br_mk3_dvtModel[130] = new ModelRendererTurbo(this, 57, 73, textureX, textureY); // 131
		br_mk3_dvtModel[131] = new ModelRendererTurbo(this, 73, 73, textureX, textureY); // 132
		br_mk3_dvtModel[132] = new ModelRendererTurbo(this, 81, 73, textureX, textureY); // 133
		br_mk3_dvtModel[133] = new ModelRendererTurbo(this, 97, 73, textureX, textureY); // 134
		br_mk3_dvtModel[134] = new ModelRendererTurbo(this, 105, 73, textureX, textureY); // 135
		br_mk3_dvtModel[135] = new ModelRendererTurbo(this, 113, 73, textureX, textureY); // 136
		br_mk3_dvtModel[136] = new ModelRendererTurbo(this, 121, 73, textureX, textureY); // 137
		br_mk3_dvtModel[137] = new ModelRendererTurbo(this, 145, 73, textureX, textureY); // 138
		br_mk3_dvtModel[138] = new ModelRendererTurbo(this, 289, 73, textureX, textureY); // 139
		br_mk3_dvtModel[139] = new ModelRendererTurbo(this, 313, 73, textureX, textureY); // 140
		br_mk3_dvtModel[140] = new ModelRendererTurbo(this, 449, 73, textureX, textureY); // 141
		br_mk3_dvtModel[141] = new ModelRendererTurbo(this, 89, 81, textureX, textureY); // 142
		br_mk3_dvtModel[142] = new ModelRendererTurbo(this, 353, 73, textureX, textureY); // 143
		br_mk3_dvtModel[143] = new ModelRendererTurbo(this, 377, 73, textureX, textureY); // 144
		br_mk3_dvtModel[144] = new ModelRendererTurbo(this, 417, 73, textureX, textureY); // 145
		br_mk3_dvtModel[145] = new ModelRendererTurbo(this, 489, 73, textureX, textureY); // 146
		br_mk3_dvtModel[146] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // 147
		br_mk3_dvtModel[147] = new ModelRendererTurbo(this, 369, 81, textureX, textureY); // 148
		br_mk3_dvtModel[148] = new ModelRendererTurbo(this, 401, 81, textureX, textureY); // 149
		br_mk3_dvtModel[149] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // 150
		br_mk3_dvtModel[150] = new ModelRendererTurbo(this, 409, 81, textureX, textureY); // 151
		br_mk3_dvtModel[151] = new ModelRendererTurbo(this, 289, 81, textureX, textureY); // 152
		br_mk3_dvtModel[152] = new ModelRendererTurbo(this, 9, 89, textureX, textureY); // 153
		br_mk3_dvtModel[153] = new ModelRendererTurbo(this, 129, 89, textureX, textureY); // 154
		br_mk3_dvtModel[154] = new ModelRendererTurbo(this, 129, 81, textureX, textureY); // 155
		br_mk3_dvtModel[155] = new ModelRendererTurbo(this, 449, 81, textureX, textureY); // 156
		br_mk3_dvtModel[156] = new ModelRendererTurbo(this, 489, 81, textureX, textureY); // 157
		br_mk3_dvtModel[157] = new ModelRendererTurbo(this, 41, 89, textureX, textureY); // 158
		br_mk3_dvtModel[158] = new ModelRendererTurbo(this, 65, 89, textureX, textureY); // 159
		br_mk3_dvtModel[159] = new ModelRendererTurbo(this, 89, 89, textureX, textureY); // 160
		br_mk3_dvtModel[160] = new ModelRendererTurbo(this, 129, 89, textureX, textureY); // 161
		br_mk3_dvtModel[161] = new ModelRendererTurbo(this, 169, 89, textureX, textureY); // 162
		br_mk3_dvtModel[162] = new ModelRendererTurbo(this, 185, 89, textureX, textureY); // 163
		br_mk3_dvtModel[163] = new ModelRendererTurbo(this, 185, 89, textureX, textureY); // 164
		br_mk3_dvtModel[164] = new ModelRendererTurbo(this, 217, 89, textureX, textureY); // 165
		br_mk3_dvtModel[165] = new ModelRendererTurbo(this, 233, 89, textureX, textureY); // 166
		br_mk3_dvtModel[166] = new ModelRendererTurbo(this, 241, 89, textureX, textureY); // 167
		br_mk3_dvtModel[167] = new ModelRendererTurbo(this, 265, 89, textureX, textureY); // 168
		br_mk3_dvtModel[168] = new ModelRendererTurbo(this, 145, 25, textureX, textureY); // 169
		br_mk3_dvtModel[169] = new ModelRendererTurbo(this, 161, 73, textureX, textureY); // 170
		br_mk3_dvtModel[170] = new ModelRendererTurbo(this, 265, 73, textureX, textureY); // 171
		br_mk3_dvtModel[171] = new ModelRendererTurbo(this, 457, 73, textureX, textureY); // 172
		br_mk3_dvtModel[172] = new ModelRendererTurbo(this, 57, 41, textureX, textureY); // 173
		br_mk3_dvtModel[173] = new ModelRendererTurbo(this, 49, 49, textureX, textureY); // 174
		br_mk3_dvtModel[174] = new ModelRendererTurbo(this, 337, 73, textureX, textureY); // 175
		br_mk3_dvtModel[175] = new ModelRendererTurbo(this, 401, 73, textureX, textureY); // 176
		br_mk3_dvtModel[176] = new ModelRendererTurbo(this, 257, 89, textureX, textureY); // 177
		br_mk3_dvtModel[177] = new ModelRendererTurbo(this, 441, 73, textureX, textureY); // 178
		br_mk3_dvtModel[178] = new ModelRendererTurbo(this, 281, 89, textureX, textureY); // 179
		br_mk3_dvtModel[179] = new ModelRendererTurbo(this, 297, 89, textureX, textureY); // 180
		br_mk3_dvtModel[180] = new ModelRendererTurbo(this, 65, 65, textureX, textureY); // 181
		br_mk3_dvtModel[181] = new ModelRendererTurbo(this, 137, 73, textureX, textureY); // 182
		br_mk3_dvtModel[182] = new ModelRendererTurbo(this, 361, 89, textureX, textureY); // 183
		br_mk3_dvtModel[183] = new ModelRendererTurbo(this, 377, 89, textureX, textureY); // 184
		br_mk3_dvtModel[184] = new ModelRendererTurbo(this, 169, 97, textureX, textureY); // 185
		br_mk3_dvtModel[185] = new ModelRendererTurbo(this, 449, 89, textureX, textureY); // 186
		br_mk3_dvtModel[186] = new ModelRendererTurbo(this, 217, 97, textureX, textureY); // 187
		br_mk3_dvtModel[187] = new ModelRendererTurbo(this, 337, 97, textureX, textureY); // 188
		br_mk3_dvtModel[188] = new ModelRendererTurbo(this, 393, 97, textureX, textureY); // 189
		br_mk3_dvtModel[189] = new ModelRendererTurbo(this, 457, 97, textureX, textureY); // 190
		br_mk3_dvtModel[190] = new ModelRendererTurbo(this, 481, 97, textureX, textureY); // 191
		br_mk3_dvtModel[191] = new ModelRendererTurbo(this, 289, 89, textureX, textureY); // 192
		br_mk3_dvtModel[192] = new ModelRendererTurbo(this, 185, 97, textureX, textureY); // 193
		br_mk3_dvtModel[193] = new ModelRendererTurbo(this, 57, 105, textureX, textureY); // 194
		br_mk3_dvtModel[194] = new ModelRendererTurbo(this, 73, 105, textureX, textureY); // 195
		br_mk3_dvtModel[195] = new ModelRendererTurbo(this, 473, 97, textureX, textureY); // 196
		br_mk3_dvtModel[196] = new ModelRendererTurbo(this, 89, 105, textureX, textureY); // 197
		br_mk3_dvtModel[197] = new ModelRendererTurbo(this, 145, 81, textureX, textureY); // 192
		br_mk3_dvtModel[198] = new ModelRendererTurbo(this, 489, 81, textureX, textureY); // 192
		br_mk3_dvtModel[199] = new ModelRendererTurbo(this, 41, 89, textureX, textureY); // 192

		br_mk3_dvtModel[0].addShapeBox(0F, 0F, 0F, 75, 1, 20, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0.4F, 0F, -0.5F, 0.4F, 0F, -0.5F, 0.4F, 0F, -0.5F, 0.4F); // 01
		br_mk3_dvtModel[0].setRotationPoint(-41F, 0F, -10F);

		br_mk3_dvtModel[1].addShapeBox(0F, 0F, 0F, 75, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F); // 02
		br_mk3_dvtModel[1].setRotationPoint(-41F, -3F, -11F);

		br_mk3_dvtModel[2].addShapeBox(0F, 0F, 0F, 75, 4, 1, 0F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // 03
		br_mk3_dvtModel[2].setRotationPoint(-41F, -3F, 10F);

		br_mk3_dvtModel[3].addShapeBox(0F, 0F, 0F, 75, 14, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0F, 0F, -0.9F); // 04
		br_mk3_dvtModel[3].setRotationPoint(-41F, -17F, -11F);

		br_mk3_dvtModel[4].addShapeBox(0F, 0F, 0F, 75, 14, 1, 0F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F, 0F); // 05
		br_mk3_dvtModel[4].setRotationPoint(-41F, -17F, 10F);

		br_mk3_dvtModel[5].addShapeBox(0F, 0F, 0F, 71, 1, 1, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0F, 0F, -0.9F); // 06
		br_mk3_dvtModel[5].setRotationPoint(-37F, -18F, -11F);

		br_mk3_dvtModel[6].addShapeBox(0F, 0F, 0F, 71, 1, 1, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F, 0F); // 07
		br_mk3_dvtModel[6].setRotationPoint(-37F, -18F, 10F);

		br_mk3_dvtModel[7].addShapeBox(0F, 0F, 0F, 71, 2, 3, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, -3F, 0F, 0.1F, -3F); // 08
		br_mk3_dvtModel[7].setRotationPoint(-37F, -20F, -10F);

		br_mk3_dvtModel[8].addShapeBox(0F, 0F, 0F, 71, 2, 3, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0.1F, -3F, 0F, 0.1F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // 09
		br_mk3_dvtModel[8].setRotationPoint(-37F, -20F, 7F);

		br_mk3_dvtModel[9].addShapeBox(0F, 0F, 0F, 71, 2, 7, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, -7F, 0F, 0.1F, -7F); // 10
		br_mk3_dvtModel[9].setRotationPoint(-37F, -22F, -7F);

		br_mk3_dvtModel[10].addShapeBox(0F, 0F, 0F, 71, 2, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0.1F, -7F, 0F, 0.1F, -7F, 0F, 0F, 0F, 0F, 0F, 0F); // 11
		br_mk3_dvtModel[10].setRotationPoint(-37F, -22F, 0F);

		br_mk3_dvtModel[11].addShapeBox(0F, 0F, 0F, 1, 4, 22, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -0.5F); // 12
		br_mk3_dvtModel[11].setRotationPoint(34F, -3F, -11F);

		br_mk3_dvtModel[12].addShapeBox(0F, 0F, 0F, 1, 14, 22, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F); // 13
		br_mk3_dvtModel[12].setRotationPoint(34F, -17F, -11F);

		br_mk3_dvtModel[13].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F, 0F, -2F, -1F, 0F, -3F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // 14
		br_mk3_dvtModel[13].setRotationPoint(34F, -20F, -11F);

		br_mk3_dvtModel[14].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -3F, -0.5F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F); // 15
		br_mk3_dvtModel[14].setRotationPoint(34F, -20F, 7F);

		br_mk3_dvtModel[15].addShapeBox(0F, 0F, 0F, 1, 5, 6, 0F, 0F, -2F, 0F, -1F, -2F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // 16
		br_mk3_dvtModel[15].setRotationPoint(34F, -22F, -7F);

		br_mk3_dvtModel[16].addShapeBox(0F, 0F, 0F, 1, 5, 6, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // 17
		br_mk3_dvtModel[16].setRotationPoint(34F, -22F, 1F);

		br_mk3_dvtModel[17].addShapeBox(0F, 0F, 0F, 1, 5, 2, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // 18
		br_mk3_dvtModel[17].setRotationPoint(34F, -22F, -1F);

		br_mk3_dvtModel[18].addShapeBox(0F, 0F, 0F, 2, 2, 20, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -0.5F, 0F, -1F); // 19
		br_mk3_dvtModel[18].setRotationPoint(33F, 0F, -10F);

		br_mk3_dvtModel[19].addShapeBox(0F, 0F, 0F, 1, 18, 1, 0F, 0.4F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // 20
		br_mk3_dvtModel[19].setRotationPoint(35F, -18F, -5F);

		br_mk3_dvtModel[20].addShapeBox(0F, 0F, 0F, 1, 18, 1, 0F, 0.4F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // 21
		br_mk3_dvtModel[20].setRotationPoint(35F, -18F, 4F);

		br_mk3_dvtModel[21].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F, 0.6F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.6F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // 22
		br_mk3_dvtModel[21].setRotationPoint(35F, -19F, -4F);

		br_mk3_dvtModel[22].addShapeBox(0F, 0F, 0F, 1, 18, 1, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F); // 23
		br_mk3_dvtModel[22].setRotationPoint(35F, -18F, -5F);

		br_mk3_dvtModel[23].addShapeBox(0F, 0F, 0F, 1, 18, 1, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // 24
		br_mk3_dvtModel[23].setRotationPoint(35F, -18F, 4F);

		br_mk3_dvtModel[24].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // 25
		br_mk3_dvtModel[24].setRotationPoint(35F, 0F, -4F);

		br_mk3_dvtModel[25].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.75F, 0F, -1F, -0.75F, 0F, 0F, 0F, 0F, 0F); // 26
		br_mk3_dvtModel[25].setRotationPoint(35F, 0F, -5F);

		br_mk3_dvtModel[26].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -1F, 0F, 0F, -1F); // 27
		br_mk3_dvtModel[26].setRotationPoint(35F, 0F, 4F);

		br_mk3_dvtModel[27].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0.5F, 0F, -1F, 0.5F, 0F, 0F, 0F, 0F, 0F); // 28
		br_mk3_dvtModel[27].setRotationPoint(35F, 0F, -5F);

		br_mk3_dvtModel[28].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -1F, 0F, 0F, -1F); // 29
		br_mk3_dvtModel[28].setRotationPoint(35F, 0F, 4F);

		br_mk3_dvtModel[29].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.5F, 0F, -1F, -0.75F, 0F, -1F, -0.75F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0.5F, 0F, 0F); // 30
		br_mk3_dvtModel[29].setRotationPoint(35F, -19F, -5F);

		br_mk3_dvtModel[30].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.5F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -1F, 0.5F, 0F, -1F, 0.5F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0.5F, 0F, 0F); // 31
		br_mk3_dvtModel[30].setRotationPoint(35F, -19F, 4F);

		br_mk3_dvtModel[31].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -1F, 0.5F, 0F, -1F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F); // 32
		br_mk3_dvtModel[31].setRotationPoint(35F, -19F, -5F);

		br_mk3_dvtModel[32].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // 33
		br_mk3_dvtModel[32].setRotationPoint(35F, -19F, 4F);

		br_mk3_dvtModel[33].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, -0.8F, 0.5F, 0F, -0.8F, 0.5F, 0F, -0.8F, -0.5F, 0F, -0.8F, -0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F); // 34
		br_mk3_dvtModel[33].setRotationPoint(34F, 1F, 0F);

		br_mk3_dvtModel[34].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F, 0.1F, -0.4F, 0.7F, 0F, -0.4F, 0.7F, 0F, -0.4F, -0.3F, 0.1F, -0.4F, -0.3F, 0.1F, 0.8F, 0.7F, 0F, 0.8F, 0.7F, 0F, 0.8F, -0.3F, 0.1F, 0.8F, -0.3F); // 35
		br_mk3_dvtModel[34].setRotationPoint(37F, 1F, 0F);

		br_mk3_dvtModel[35].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F, -0.5F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F); // 36
		br_mk3_dvtModel[35].setRotationPoint(37F, 1F, 0F);

		br_mk3_dvtModel[36].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.2F, 0.25F, -0.5F, -0.2F, 0.25F, -0.5F, -0.2F, -0.75F, 0F, -0.2F, -0.75F, 0F, -0.3F, 0.25F, -0.5F, -0.3F, 0.25F, -0.5F, -0.3F, -0.75F, 0F, -0.3F, -0.75F); // 37
		br_mk3_dvtModel[36].setRotationPoint(37F, 2F, 0F);

		br_mk3_dvtModel[37].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, -0.8F, 0.5F, 0F, -0.8F, 0.5F, 0F, -0.8F, -0.5F, 0F, -0.8F, -0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F); // 38
		br_mk3_dvtModel[37].setRotationPoint(-50F, 0F, 0F);
		br_mk3_dvtModel[37].rotateAngleY = -3.14159265F;

		br_mk3_dvtModel[38].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F, 0.1F, -0.4F, 0.7F, 0F, -0.4F, 0.7F, 0F, -0.4F, -0.3F, 0.1F, -0.4F, -0.3F, 0.1F, 0.8F, 0.7F, 0F, 0.8F, 0.7F, 0F, 0.8F, -0.3F, 0.1F, 0.8F, -0.3F); // 39
		br_mk3_dvtModel[38].setRotationPoint(-53F, 0F, 0F);
		br_mk3_dvtModel[38].rotateAngleY = -3.14159265F;

		br_mk3_dvtModel[39].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F, -0.5F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F); // 40
		br_mk3_dvtModel[39].setRotationPoint(-53F, 0F, 0F);
		br_mk3_dvtModel[39].rotateAngleY = -3.14159265F;

		br_mk3_dvtModel[40].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.2F, 0.25F, -0.5F, -0.2F, 0.25F, -0.5F, -0.2F, -0.75F, 0F, -0.2F, -0.75F, 0F, -0.3F, 0.25F, -0.5F, -0.3F, 0.25F, -0.5F, -0.3F, -0.75F, 0F, -0.3F, -0.75F); // 41
		br_mk3_dvtModel[40].setRotationPoint(-53F, 1F, 0F);
		br_mk3_dvtModel[40].rotateAngleY = -3.14159265F;

		br_mk3_dvtModel[41].addBox(0F, 0F, 0F, 5, 5, 0, 0F); // 42
		br_mk3_dvtModel[41].setRotationPoint(-41F, 2F, -6F);

		br_mk3_dvtModel[42].addBox(0F, 0F, 0F, 5, 5, 0, 0F); // 43
		br_mk3_dvtModel[42].setRotationPoint(-41F, 2F, 6F);

		br_mk3_dvtModel[43].addBox(0F, 0F, 0F, 5, 5, 0, 0F); // 44
		br_mk3_dvtModel[43].setRotationPoint(-27F, 2F, -6F);

		br_mk3_dvtModel[44].addBox(0F, 0F, 0F, 5, 5, 0, 0F); // 45
		br_mk3_dvtModel[44].setRotationPoint(-27F, 2F, 6F);

		br_mk3_dvtModel[45].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0.2F, 0F, 1F, 0.2F, 0F, 1F, 0.2F, 0F, 0.5F, 0.2F, 0F); // 46
		br_mk3_dvtModel[45].setRotationPoint(-41F, 2F, -8F);

		br_mk3_dvtModel[46].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0.2F, 0F, 1F, 0.2F, 0F, 1F, 0.2F, 0F, 0.5F, 0.2F, 0F); // 47
		br_mk3_dvtModel[46].setRotationPoint(-41F, 2F, 7F);

		br_mk3_dvtModel[47].addShapeBox(0F, 0F, 0F, 1, 1, 16, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // 48
		br_mk3_dvtModel[47].setRotationPoint(-39F, 4F, -8F);

		br_mk3_dvtModel[48].addShapeBox(0F, 0F, 0F, 1, 1, 16, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // 49
		br_mk3_dvtModel[48].setRotationPoint(-25F, 4F, -8F);

		br_mk3_dvtModel[49].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, -0.5F, 0F, -0.2F, 0.5F, 0F, -0.2F, 0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, -1F, -0.7F, -0.2F, 0F, -0.7F, -0.2F, 0F, -0.7F, -0.2F, -1F, -0.7F, -0.2F); // 50
		br_mk3_dvtModel[49].setRotationPoint(-41F, 5F, -8F);

		br_mk3_dvtModel[50].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, -0.5F, 0F, -0.2F, 0.5F, 0F, -0.2F, 0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, -1F, -0.7F, -0.2F, 0F, -0.7F, -0.2F, 0F, -0.7F, -0.2F, -1F, -0.7F, -0.2F); // 51
		br_mk3_dvtModel[50].setRotationPoint(-41F, 5F, 7F);

		br_mk3_dvtModel[51].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0.5F, 0F, -0.2F, 0F, -0.7F, -0.2F, -1F, -0.7F, -0.2F, -1F, -0.7F, -0.2F, 0F, -0.7F, -0.2F); // 52
		br_mk3_dvtModel[51].setRotationPoint(-26F, 5F, -8F);

		br_mk3_dvtModel[52].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0.5F, 0F, -0.2F, 0F, -0.7F, -0.2F, -1F, -0.7F, -0.2F, -1F, -0.7F, -0.2F, 0F, -0.7F, -0.2F); // 53
		br_mk3_dvtModel[52].setRotationPoint(-26F, 5F, 7F);

		br_mk3_dvtModel[53].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -0.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F); // 54
		br_mk3_dvtModel[53].setRotationPoint(-41F, 3F, -8F);

		br_mk3_dvtModel[54].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -0.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F); // 55
		br_mk3_dvtModel[54].setRotationPoint(-24F, 3F, -8F);

		br_mk3_dvtModel[55].addBox(0F, 0F, 0F, 15, 1, 2, 0F); // 56
		br_mk3_dvtModel[55].setRotationPoint(-39F, 3F, -1F);

		br_mk3_dvtModel[56].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F, 0.5F, -0.1F, 0F, 0.5F, -0.1F, 0F, 0.5F, -0.1F, 0F, 0.5F, -0.1F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // 57
		br_mk3_dvtModel[56].setRotationPoint(-32F, 0F, -1F);

		br_mk3_dvtModel[57].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, 0.5F, 0.5F, -0.7F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0.5F, 0.5F, -0.7F, 0.5F, -0.5F, -0.7F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0.5F, -0.5F, -0.7F); // 58
		br_mk3_dvtModel[57].setRotationPoint(-33F, 2F, -9F);

		br_mk3_dvtModel[58].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, -0.5F, 0.5F, 0F, 0.5F, 0.5F, -0.7F, 0.5F, 0.5F, -0.7F, -0.5F, 0.5F, 0F, -0.5F, -0.5F, 0F, 0.5F, -0.5F, -0.7F, 0.5F, -0.5F, -0.7F, -0.5F, -0.5F, 0F); // 59
		br_mk3_dvtModel[58].setRotationPoint(-32F, 2F, -9F);

		br_mk3_dvtModel[59].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, 0.5F, 0.5F, -0.7F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0.5F, 0.5F, -0.7F, 0.5F, -0.5F, -0.7F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0.5F, -0.5F, -0.7F); // 60
		br_mk3_dvtModel[59].setRotationPoint(-33F, 2F, 7F);

		br_mk3_dvtModel[60].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, -0.5F, 0.5F, 0F, 0.5F, 0.5F, -0.7F, 0.5F, 0.5F, -0.7F, -0.5F, 0.5F, 0F, -0.5F, -0.5F, 0F, 0.5F, -0.5F, -0.7F, 0.5F, -0.5F, -0.7F, -0.5F, -0.5F, 0F); // 61
		br_mk3_dvtModel[60].setRotationPoint(-32F, 2F, 7F);

		br_mk3_dvtModel[61].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // 62
		br_mk3_dvtModel[61].setRotationPoint(-32F, 3F, -8F);

		br_mk3_dvtModel[62].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F); // 63
		br_mk3_dvtModel[62].setRotationPoint(-32F, 3F, 7F);

		br_mk3_dvtModel[63].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -0.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F); // 64
		br_mk3_dvtModel[63].setRotationPoint(-41F, 3F, 7F);

		br_mk3_dvtModel[64].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -0.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F); // 65
		br_mk3_dvtModel[64].setRotationPoint(-24F, 3F, 7F);

		br_mk3_dvtModel[65].addBox(0F, 0F, 0F, 1, 1, 14, 0F); // 66
		br_mk3_dvtModel[65].setRotationPoint(-32F, 3F, -7F);

		br_mk3_dvtModel[66].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // 67
		br_mk3_dvtModel[66].setRotationPoint(-31F, 0F, -10F);

		br_mk3_dvtModel[67].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F, 0F, -1.3F, -1F, 0.9F, -0.8F, -0.3F, 0.9F, -0.8F, -0.5F, 0F, -1.3F, 0.2F, 0F, -0.5F, -1F, 0.9F, -1F, -0.3F, 0.9F, -1F, -0.5F, 0F, -0.5F, 0.2F); // 68
		br_mk3_dvtModel[67].setRotationPoint(-34F, 3F, -9F);

		br_mk3_dvtModel[68].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, -0.6F, 0F, -1.8F, -0.1F, 0F, -1.8F, -0.1F, 0F, 1F, -0.6F, 0F, 1F, -0.6F, 0F, -0.3F, -0.1F, 0F, -0.3F, -0.1F, 0F, -0.3F, -0.6F, 0F, -0.3F); // 69
		br_mk3_dvtModel[68].setRotationPoint(-31F, 1F, 8F);

		br_mk3_dvtModel[69].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F, 0F, -0.8F, -0.3F, 0.9F, -1.3F, -1F, 0.9F, -1.3F, 0.2F, 0F, -0.8F, -0.5F, 0F, -1F, -0.3F, 0.9F, -0.5F, -1F, 0.9F, -0.5F, 0.2F, 0F, -1F, -0.5F); // 70
		br_mk3_dvtModel[69].setRotationPoint(-30F, 3F, 9F);
		br_mk3_dvtModel[69].rotateAngleY = -3.14159265F;

		br_mk3_dvtModel[70].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, -0.1F, 0F, -1.8F, -0.6F, 0F, -1.8F, -0.6F, 0F, 1F, -0.1F, 0F, 1F, -0.1F, 0F, -0.3F, -0.6F, 0F, -0.3F, -0.6F, 0F, -0.3F, -0.1F, 0F, -0.3F); // 71
		br_mk3_dvtModel[70].setRotationPoint(-30F, 1F, -8F);
		br_mk3_dvtModel[70].rotateAngleY = -3.14159265F;

		br_mk3_dvtModel[71].addShapeBox(0F, 0F, 0F, 28, 5, 20, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, -1F, 0F, -2F, -1F, 0F, -2F, -1F, 0F, -2F, -1F, 0F, -2F); // 72
		br_mk3_dvtModel[71].setRotationPoint(-21F, 0F, -10F);

		br_mk3_dvtModel[72].addShapeBox(0F, 0F, 0F, 5, 5, 6, 0F, 0.2F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0.1F, -5F, 0F, 0.2F, 0F, 0F, -4F, 0F, 0F, -5F, 0F, 0F, 0.1F, 0F, 0F); // 73
		br_mk3_dvtModel[72].setRotationPoint(-42F, -22F, 1F);

		br_mk3_dvtModel[73].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, 0F, -0.1F, -0.5F, -0.8F, -0.1F, -0.5F, -0.8F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, -0.8F, -0.8F, 0F, -0.8F, -0.8F, 0F, 0F, 0F, 0F, 0F); // 74
		br_mk3_dvtModel[73].setRotationPoint(31F, 0F, 9F);
		br_mk3_dvtModel[73].rotateAngleY = -3.14159265F;

		br_mk3_dvtModel[74].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, -0.8F, -0.1F, -0.5F, 0F, -0.1F, -0.5F, 0F, -0.1F, 0F, -0.8F, -0.1F, 0F, -0.8F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, -0.8F, 0F, 0F); // 75
		br_mk3_dvtModel[74].setRotationPoint(30F, 0F, 9F);
		br_mk3_dvtModel[74].rotateAngleY = -3.14159265F;

		br_mk3_dvtModel[75].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F); // 76
		br_mk3_dvtModel[75].setRotationPoint(31F, 4F, 9F);
		br_mk3_dvtModel[75].rotateAngleY = -3.14159265F;

		br_mk3_dvtModel[76].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, -0.6F, -0.7F, 0F, -0.6F, -0.7F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F); // 77
		br_mk3_dvtModel[76].setRotationPoint(31F, 2F, 9F);
		br_mk3_dvtModel[76].rotateAngleY = -3.14159265F;

		br_mk3_dvtModel[77].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F, -0.5F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.2F, 0.5F, 0F, -0.2F, 0.5F, 0F, -0.2F, -0.5F, -0.5F, -0.2F, -0.5F); // 78
		br_mk3_dvtModel[77].setRotationPoint(34F, 1F, -8F);
		br_mk3_dvtModel[77].rotateAngleY = -3.14159265F;

		br_mk3_dvtModel[78].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, -1.3F, 0.2F, 0F, 0.7F, 0.2F, 0F, 0.7F, -1F, 0F, -1.3F, -1F, 0F, -0.5F, 0.2F, 0F, -2.5F, 0.2F, 0F, -2.5F, -1F, 0F, -0.5F, -1F); // 79
		br_mk3_dvtModel[78].setRotationPoint(31F, 1F, -8F);
		br_mk3_dvtModel[78].rotateAngleY = -3.14159265F;

		br_mk3_dvtModel[79].addShapeBox(0F, 0F, 0F, 1, 3, 22, 0F, 0F, 0F, -0.1F, -0.8F, 0F, -0.1F, -0.8F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.5F, -0.8F, 0F, -0.5F, -0.8F, 0F, -0.5F, 0F, 0F, -0.5F); // 80
		br_mk3_dvtModel[79].setRotationPoint(-34F, -3F, -11F);

		br_mk3_dvtModel[80].addShapeBox(0F, 0F, 0F, 1, 14, 22, 0F, 0F, 0F, -0.1F, -0.8F, 0F, -0.1F, -0.8F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, -0.8F, 0F, -0.1F, -0.8F, 0F, -0.1F, 0F, 0F, -0.1F); // 81
		br_mk3_dvtModel[80].setRotationPoint(-34F, -17F, -11F);

		br_mk3_dvtModel[81].addShapeBox(0F, 0F, 0F, 1, 1, 22, 0F, 0F, 0F, -1.1F, -0.8F, 0F, -1.1F, -0.8F, 0F, -1.1F, 0F, 0F, -1.1F, 0F, 0F, -0.1F, -0.8F, 0F, -0.1F, -0.8F, 0F, -0.1F, 0F, 0F, -0.1F); // 82
		br_mk3_dvtModel[81].setRotationPoint(-34F, -18F, -11F);

		br_mk3_dvtModel[82].addShapeBox(0F, 0F, 0F, 1, 2, 20, 0F, 0F, 0F, -3.1F, -0.8F, 0F, -3.1F, -0.8F, 0F, -3.1F, 0F, 0F, -3.1F, 0F, 0F, -0.1F, -0.8F, 0F, -0.1F, -0.8F, 0F, -0.1F, 0F, 0F, -0.1F); // 83
		br_mk3_dvtModel[82].setRotationPoint(-34F, -20F, -10F);

		br_mk3_dvtModel[83].addShapeBox(0F, 0F, 0F, 1, 2, 14, 0F, 0F, -0.05F, -6.1F, -0.8F, -0.05F, -6.1F, -0.8F, -0.05F, -6.1F, 0F, -0.05F, -6.1F, 0F, 0F, -0.1F, -0.8F, 0F, -0.1F, -0.8F, 0F, -0.1F, 0F, 0F, -0.1F); // 84
		br_mk3_dvtModel[83].setRotationPoint(-34F, -22F, -7F);

		br_mk3_dvtModel[84].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F, 0.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, -1F, 0.7F, 0F, -1F, 0.7F, 0F, -1F, 0.7F, 0F, -1F, 0.7F, 0F); // 85
		br_mk3_dvtModel[84].setRotationPoint(-35F, 3F, -8F);

		br_mk3_dvtModel[85].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 1F, 0.2F, 0F, 0.5F, 0.2F, 0F, 0.5F, 0.2F, 0F, 1F, 0.2F, 0F); // 86
		br_mk3_dvtModel[85].setRotationPoint(-28F, 2F, -8F);

		br_mk3_dvtModel[86].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -0.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F); // 87
		br_mk3_dvtModel[86].setRotationPoint(-38F, 3F, -8F);

		br_mk3_dvtModel[87].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -0.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F); // 88
		br_mk3_dvtModel[87].setRotationPoint(-38F, 3F, 7F);

		br_mk3_dvtModel[88].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -0.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F); // 89
		br_mk3_dvtModel[88].setRotationPoint(-27F, 3F, -8F);

		br_mk3_dvtModel[89].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -0.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F); // 90
		br_mk3_dvtModel[89].setRotationPoint(-27F, 3F, 7F);

		br_mk3_dvtModel[90].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // 91
		br_mk3_dvtModel[90].setRotationPoint(-31F, 0F, 9F);

		br_mk3_dvtModel[91].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F, 0.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, -1F, 0.7F, 0F, -1F, 0.7F, 0F, -1F, 0.7F, 0F, -1F, 0.7F, 0F); // 92
		br_mk3_dvtModel[91].setRotationPoint(-35F, 3F, 7F);

		br_mk3_dvtModel[92].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 1F, 0.2F, 0F, 0.5F, 0.2F, 0F, 0.5F, 0.2F, 0F, 1F, 0.2F, 0F); // 93
		br_mk3_dvtModel[92].setRotationPoint(-28F, 2F, 7F);

		br_mk3_dvtModel[93].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, -0.7F, -0.5F, 1F, -0.7F, -0.5F, 1F, -0.7F, -0.2F, 0F, -0.7F, -0.2F); // 94
		br_mk3_dvtModel[93].setRotationPoint(-37F, 5F, -8F);

		br_mk3_dvtModel[94].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F, -0.5F, 0F, -0.2F, 0.5F, 0F, -0.2F, 0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.7F, -0.2F, 1F, -0.7F, -0.2F, 1F, -0.7F, -0.5F, 0F, -0.7F, -0.5F); // 95
		br_mk3_dvtModel[94].setRotationPoint(-37F, 5F, 7F);

		br_mk3_dvtModel[95].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, -0.5F, -0.5F, -0.8F, -0.5F, -1.2F, -0.8F, -0.5F, -1.2F, 0F, -0.5F, -0.5F, 0F, 1F, 0F, -0.8F, -1.8F, 0F, -0.8F, -1.8F, 0F, 0F, 1F, 0F, 0F); // 96
		br_mk3_dvtModel[95].setRotationPoint(-42F, 2F, -7F);

		br_mk3_dvtModel[96].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, -0.4F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0.2F, 0F, 0F, 0.2F, 0F, -0.4F, 0.2F, 0F, -0.5F, 0.2F, 0F); // 97
		br_mk3_dvtModel[96].setRotationPoint(-42F, 2F, -8F);

		br_mk3_dvtModel[97].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, -0.5F, -0.5F, -1F, -0.5F, -1.2F, -1F, -0.5F, -1.2F, 0.2F, -0.5F, -0.5F, 0.2F, 1F, 0F, -1F, -1.8F, 0F, -1F, -1.8F, 0F, 0.2F, 1F, 0F, 0.2F); // 98
		br_mk3_dvtModel[97].setRotationPoint(-42F, 2F, 5F);

		br_mk3_dvtModel[98].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, -0.5F, -0.5F, 0F, -0.4F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0.2F, 0F, -0.4F, 0.2F, 0F, 0F, 0.2F, 0F, -0.5F, 0.2F, 0F); // 99
		br_mk3_dvtModel[98].setRotationPoint(-42F, 2F, 6F);

		br_mk3_dvtModel[99].addBox(0F, 0F, 0F, 5, 5, 0, 0F); // 100
		br_mk3_dvtModel[99].setRotationPoint(8F, 2F, -6F);

		br_mk3_dvtModel[100].addBox(0F, 0F, 0F, 5, 5, 0, 0F); // 101
		br_mk3_dvtModel[100].setRotationPoint(8F, 2F, 6F);

		br_mk3_dvtModel[101].addBox(0F, 0F, 0F, 5, 5, 0, 0F); // 102
		br_mk3_dvtModel[101].setRotationPoint(22F, 2F, -6F);

		br_mk3_dvtModel[102].addBox(0F, 0F, 0F, 5, 5, 0, 0F); // 103
		br_mk3_dvtModel[102].setRotationPoint(22F, 2F, 6F);

		br_mk3_dvtModel[103].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0.2F, 0F, 1F, 0.2F, 0F, 1F, 0.2F, 0F, 0.5F, 0.2F, 0F); // 104
		br_mk3_dvtModel[103].setRotationPoint(8F, 2F, -8F);

		br_mk3_dvtModel[104].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0.2F, 0F, 1F, 0.2F, 0F, 1F, 0.2F, 0F, 0.5F, 0.2F, 0F); // 105
		br_mk3_dvtModel[104].setRotationPoint(8F, 2F, 7F);

		br_mk3_dvtModel[105].addShapeBox(0F, 0F, 0F, 1, 1, 16, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // 106
		br_mk3_dvtModel[105].setRotationPoint(10F, 4F, -8F);

		br_mk3_dvtModel[106].addShapeBox(0F, 0F, 0F, 1, 1, 16, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // 107
		br_mk3_dvtModel[106].setRotationPoint(24F, 4F, -8F);

		br_mk3_dvtModel[107].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, -0.5F, 0F, -0.2F, 0.5F, 0F, -0.2F, 0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, -1F, -0.7F, -0.2F, 0F, -0.7F, -0.2F, 0F, -0.7F, -0.2F, -1F, -0.7F, -0.2F); // 108
		br_mk3_dvtModel[107].setRotationPoint(8F, 5F, -8F);

		br_mk3_dvtModel[108].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, -0.5F, 0F, -0.2F, 0.5F, 0F, -0.2F, 0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, -1F, -0.7F, -0.2F, 0F, -0.7F, -0.2F, 0F, -0.7F, -0.2F, -1F, -0.7F, -0.2F); // 109
		br_mk3_dvtModel[108].setRotationPoint(8F, 5F, 7F);

		br_mk3_dvtModel[109].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0.5F, 0F, -0.2F, 0F, -0.7F, -0.2F, -1F, -0.7F, -0.2F, -1F, -0.7F, -0.2F, 0F, -0.7F, -0.2F); // 110
		br_mk3_dvtModel[109].setRotationPoint(23F, 5F, -8F);

		br_mk3_dvtModel[110].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0.5F, 0F, -0.2F, 0F, -0.7F, -0.2F, -1F, -0.7F, -0.2F, -1F, -0.7F, -0.2F, 0F, -0.7F, -0.2F); // 111
		br_mk3_dvtModel[110].setRotationPoint(23F, 5F, 7F);

		br_mk3_dvtModel[111].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -0.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F); // 112
		br_mk3_dvtModel[111].setRotationPoint(8F, 3F, -8F);

		br_mk3_dvtModel[112].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -0.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F); // 113
		br_mk3_dvtModel[112].setRotationPoint(25F, 3F, -8F);

		br_mk3_dvtModel[113].addBox(0F, 0F, 0F, 15, 1, 2, 0F); // 114
		br_mk3_dvtModel[113].setRotationPoint(10F, 3F, -1F);

		br_mk3_dvtModel[114].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F, 0.5F, -0.1F, 0F, 0.5F, -0.1F, 0F, 0.5F, -0.1F, 0F, 0.5F, -0.1F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // 115
		br_mk3_dvtModel[114].setRotationPoint(17F, 0F, -1F);

		br_mk3_dvtModel[115].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, 0.5F, 0.5F, -0.7F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0.5F, 0.5F, -0.7F, 0.5F, -0.5F, -0.7F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0.5F, -0.5F, -0.7F); // 116
		br_mk3_dvtModel[115].setRotationPoint(16F, 2F, -9F);

		br_mk3_dvtModel[116].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, -0.5F, 0.5F, 0F, 0.5F, 0.5F, -0.7F, 0.5F, 0.5F, -0.7F, -0.5F, 0.5F, 0F, -0.5F, -0.5F, 0F, 0.5F, -0.5F, -0.7F, 0.5F, -0.5F, -0.7F, -0.5F, -0.5F, 0F); // 117
		br_mk3_dvtModel[116].setRotationPoint(17F, 2F, -9F);

		br_mk3_dvtModel[117].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, 0.5F, 0.5F, -0.7F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0.5F, 0.5F, -0.7F, 0.5F, -0.5F, -0.7F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0.5F, -0.5F, -0.7F); // 118
		br_mk3_dvtModel[117].setRotationPoint(16F, 2F, 7F);

		br_mk3_dvtModel[118].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, -0.5F, 0.5F, 0F, 0.5F, 0.5F, -0.7F, 0.5F, 0.5F, -0.7F, -0.5F, 0.5F, 0F, -0.5F, -0.5F, 0F, 0.5F, -0.5F, -0.7F, 0.5F, -0.5F, -0.7F, -0.5F, -0.5F, 0F); // 119
		br_mk3_dvtModel[118].setRotationPoint(17F, 2F, 7F);

		br_mk3_dvtModel[119].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // 120
		br_mk3_dvtModel[119].setRotationPoint(17F, 3F, -8F);

		br_mk3_dvtModel[120].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F); // 121
		br_mk3_dvtModel[120].setRotationPoint(17F, 3F, 7F);

		br_mk3_dvtModel[121].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -0.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F); // 122
		br_mk3_dvtModel[121].setRotationPoint(8F, 3F, 7F);

		br_mk3_dvtModel[122].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -0.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F); // 123
		br_mk3_dvtModel[122].setRotationPoint(25F, 3F, 7F);

		br_mk3_dvtModel[123].addBox(0F, 0F, 0F, 1, 1, 14, 0F); // 124
		br_mk3_dvtModel[123].setRotationPoint(17F, 3F, -7F);

		br_mk3_dvtModel[124].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // 125
		br_mk3_dvtModel[124].setRotationPoint(16F, 0F, 10F);
		br_mk3_dvtModel[124].rotateAngleY = -3.14159265F;

		br_mk3_dvtModel[125].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F, 0F, -1.3F, -1F, 0.9F, -0.8F, -0.3F, 0.9F, -0.8F, -0.5F, 0F, -1.3F, 0.2F, 0F, -0.5F, -1F, 0.9F, -1F, -0.3F, 0.9F, -1F, -0.5F, 0F, -0.5F, 0.2F); // 126
		br_mk3_dvtModel[125].setRotationPoint(19F, 3F, 9F);
		br_mk3_dvtModel[125].rotateAngleY = -3.14159265F;

		br_mk3_dvtModel[126].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, -0.6F, 0F, -1.8F, -0.1F, 0F, -1.8F, -0.1F, 0F, 1F, -0.6F, 0F, 1F, -0.6F, 0F, -0.3F, -0.1F, 0F, -0.3F, -0.1F, 0F, -0.3F, -0.6F, 0F, -0.3F); // 127
		br_mk3_dvtModel[126].setRotationPoint(16F, 1F, -8F);
		br_mk3_dvtModel[126].rotateAngleY = 3.14159265F;

		br_mk3_dvtModel[127].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F, 0F, -0.8F, -0.3F, 0.9F, -1.3F, -1F, 0.9F, -1.3F, 0.2F, 0F, -0.8F, -0.5F, 0F, -1F, -0.3F, 0.9F, -0.5F, -1F, 0.9F, -0.5F, 0.2F, 0F, -1F, -0.5F); // 128
		br_mk3_dvtModel[127].setRotationPoint(15F, 3F, -9F);

		br_mk3_dvtModel[128].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, -0.1F, 0F, -1.8F, -0.6F, 0F, -1.8F, -0.6F, 0F, 1F, -0.1F, 0F, 1F, -0.1F, 0F, -0.3F, -0.6F, 0F, -0.3F, -0.6F, 0F, -0.3F, -0.1F, 0F, -0.3F); // 129
		br_mk3_dvtModel[128].setRotationPoint(15F, 1F, 8F);
		br_mk3_dvtModel[128].rotateAngleY = -6.28318531F;

		br_mk3_dvtModel[129].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F, 0.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, -1F, 0.7F, 0F, -1F, 0.7F, 0F, -1F, 0.7F, 0F, -1F, 0.7F, 0F); // 130
		br_mk3_dvtModel[129].setRotationPoint(14F, 3F, -8F);

		br_mk3_dvtModel[130].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 1F, 0.2F, 0F, 0.5F, 0.2F, 0F, 0.5F, 0.2F, 0F, 1F, 0.2F, 0F); // 131
		br_mk3_dvtModel[130].setRotationPoint(21F, 2F, -8F);

		br_mk3_dvtModel[131].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -0.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F); // 132
		br_mk3_dvtModel[131].setRotationPoint(11F, 3F, -8F);

		br_mk3_dvtModel[132].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -0.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F); // 133
		br_mk3_dvtModel[132].setRotationPoint(11F, 3F, 7F);

		br_mk3_dvtModel[133].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -0.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F); // 134
		br_mk3_dvtModel[133].setRotationPoint(22F, 3F, -8F);

		br_mk3_dvtModel[134].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -0.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F); // 135
		br_mk3_dvtModel[134].setRotationPoint(22F, 3F, 7F);

		br_mk3_dvtModel[135].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // 136
		br_mk3_dvtModel[135].setRotationPoint(16F, 0F, -9F);
		br_mk3_dvtModel[135].rotateAngleY = 3.14159265F;

		br_mk3_dvtModel[136].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F, 0.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, -1F, 0.7F, 0F, -1F, 0.7F, 0F, -1F, 0.7F, 0F, -1F, 0.7F, 0F); // 137
		br_mk3_dvtModel[136].setRotationPoint(14F, 3F, 7F);

		br_mk3_dvtModel[137].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 1F, 0.2F, 0F, 0.5F, 0.2F, 0F, 0.5F, 0.2F, 0F, 1F, 0.2F, 0F); // 138
		br_mk3_dvtModel[137].setRotationPoint(21F, 2F, 7F);

		br_mk3_dvtModel[138].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, -0.7F, -0.5F, 1F, -0.7F, -0.5F, 1F, -0.7F, -0.2F, 0F, -0.7F, -0.2F); // 139
		br_mk3_dvtModel[138].setRotationPoint(12F, 5F, -8F);

		br_mk3_dvtModel[139].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F, -0.5F, 0F, -0.2F, 0.5F, 0F, -0.2F, 0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.7F, -0.2F, 1F, -0.7F, -0.2F, 1F, -0.7F, -0.5F, 0F, -0.7F, -0.5F); // 140
		br_mk3_dvtModel[139].setRotationPoint(12F, 5F, 7F);

		br_mk3_dvtModel[140].addShapeBox(0F, 0F, 0F, 7, 2, 20, 0F, 0F, -0.5F, -0.4F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.4F, 0F, -0.5F, -0.4F, 1F, 0F, -0.5F, -1.5F, 0F, -0.1F, -1.5F, 0F, -0.1F, 1F, 0F, -0.5F); // 141
		br_mk3_dvtModel[140].setRotationPoint(-48F, 0F, -10F);

		br_mk3_dvtModel[141].addShapeBox(0F, 0F, 0F, 7, 1, 20, 0F, 0F, 0F, -0.5F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0.4F, 0F, -0.5F, 0.4F, 0F, -0.5F, -0.5F); // 142
		br_mk3_dvtModel[141].setRotationPoint(-48F, 0F, -10F);

		br_mk3_dvtModel[142].addShapeBox(0F, 0F, 0F, 7, 4, 1, 0F, 3.05F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -0.9F, 3.05F, 0F, 0.1F, 0F, -0.5F, -1.4F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.4F, 0F, -0.5F, 0.5F); // 143
		br_mk3_dvtModel[142].setRotationPoint(-48F, -3F, -11F);

		br_mk3_dvtModel[143].addShapeBox(0F, 0F, 0F, 7, 4, 1, 0F, 3.05F, 0F, 0.1F, 0F, 0F, -0.9F, 0F, 0F, 0F, 3.05F, 0F, -1F, 0F, -0.5F, 0.5F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.5F, 0F, -0.5F, -1.4F); // 144
		br_mk3_dvtModel[143].setRotationPoint(-48F, -3F, 10F);

		br_mk3_dvtModel[144].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F, 1F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F, -0.9F, 1F, 0F, 0F, 0.05F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0.05F, 0F, 0.1F); // 145
		br_mk3_dvtModel[144].setRotationPoint(-51F, -4F, -11F);

		br_mk3_dvtModel[145].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F, 1F, 0F, 0F, 0F, 0F, -0.9F, 0F, 0F, 0F, 1F, 0F, -0.9F, 0.05F, 0F, 0.1F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0.05F, 0F, -1F); // 146
		br_mk3_dvtModel[145].setRotationPoint(-51F, -4F, 10F);

		br_mk3_dvtModel[146].addShapeBox(0F, 0F, 0F, 11, 2, 1, 0F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0F, 0F, 0F); // 147
		br_mk3_dvtModel[146].setRotationPoint(-52F, -6F, -11F);

		br_mk3_dvtModel[147].addShapeBox(0F, 0F, 0F, 11, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F, -0.9F); // 148
		br_mk3_dvtModel[147].setRotationPoint(-52F, -6F, 10F);

		br_mk3_dvtModel[148].addShapeBox(0F, 0F, 0F, 11, 11, 1, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, -10F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0F, 0F, 0F); // 149
		br_mk3_dvtModel[148].setRotationPoint(-52F, -17F, -11F);

		br_mk3_dvtModel[149].addShapeBox(0F, 0F, 0F, 11, 11, 1, 0F, -10F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F, -0.9F); // 150
		br_mk3_dvtModel[149].setRotationPoint(-52F, -17F, 10F);

		br_mk3_dvtModel[150].addShapeBox(0F, 0F, 0F, 6, 2, 20, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.85F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, -1.85F, 0F, -0.2F); // 151
		br_mk3_dvtModel[150].setRotationPoint(-52F, -4F, -10F);

		br_mk3_dvtModel[151].addShapeBox(0F, 0F, 0F, 4, 4, 19, 0F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.4F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.8F); // 152
		br_mk3_dvtModel[151].setRotationPoint(-50F, -2F, -9F);

		br_mk3_dvtModel[152].addBox(0F, 0F, 0F, 2, 2, 20, 0F); // 153
		br_mk3_dvtModel[152].setRotationPoint(-52F, -6F, -10F);

		br_mk3_dvtModel[153].addShapeBox(0F, 0F, 0F, 6, 6, 20, 0F, -5F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, -5F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F); // 154
		br_mk3_dvtModel[153].setRotationPoint(-52F, -12F, -10F);

		br_mk3_dvtModel[154].addShapeBox(0F, 0F, 0F, 5, 3, 4, 0F, 0F, -3F, 0F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, -3F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, -4F); // 155
		br_mk3_dvtModel[154].setRotationPoint(-42F, -20F, -11F);

		br_mk3_dvtModel[155].addShapeBox(0F, 0F, 0F, 5, 3, 4, 0F, 0F, -3F, 0F, -5F, -3F, 0F, 0F, 0F, 0F, 0.1F, -3F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -4F, 0F, 0F, 0.1F, 0F, 0F); // 156
		br_mk3_dvtModel[155].setRotationPoint(-42F, -20F, -11F);

		br_mk3_dvtModel[156].addShapeBox(0F, 0F, 0F, 5, 5, 6, 0F, 0.1F, -5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0.1F, -5F, -6F, 0.1F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0.1F, 0F, -6F); // 157
		br_mk3_dvtModel[156].setRotationPoint(-42F, -22F, -7F);

		br_mk3_dvtModel[157].addShapeBox(0F, 0F, 0F, 5, 5, 6, 0F, 0.1F, -5F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0.2F, -5F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -4F, 0F, 0F, 0.2F, 0F, 0F); // 158
		br_mk3_dvtModel[157].setRotationPoint(-42F, -22F, -7F);

		br_mk3_dvtModel[158].addShapeBox(0F, 0F, 0F, 5, 5, 6, 0F, 0.1F, -5F, -6F, 0F, 0F, 0F, 0F, -2F, 0F, 0.1F, -5F, 0F, 0.1F, 0F, -6F, -4F, 0F, 0F, -4F, 0F, 0F, 0.1F, 0F, 0F); // 159
		br_mk3_dvtModel[158].setRotationPoint(-42F, -22F, 1F);

		br_mk3_dvtModel[159].addShapeBox(0F, 0F, 0F, 5, 5, 4, 0F, 0.1F, -5F, 0F, 0F, -2F, 0F, 0F, -2F, -4F, 0F, -5F, 0F, 0.1F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -4F, 0F, 0F, 0F); // 160
		br_mk3_dvtModel[159].setRotationPoint(-42F, -22F, 7F);

		br_mk3_dvtModel[160].addShapeBox(0F, 0F, 0F, 5, 3, 4, 0F, 0F, -3F, -4F, 0F, 0F, 0F, 0F, -2F, -1F, 0F, -3F, 0F, 0F, 0F, -4F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // 161
		br_mk3_dvtModel[160].setRotationPoint(-42F, -20F, 7F);

		br_mk3_dvtModel[161].addShapeBox(0F, 0F, 0F, 5, 5, 2, 0F, 0.2F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, -5F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // 162
		br_mk3_dvtModel[161].setRotationPoint(-42F, -22F, -1F);

		br_mk3_dvtModel[162].addShapeBox(0F, 0F, 0F, 1, 1, 22, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0.5F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0.5F, -0.5F, -0.1F); // 163
		br_mk3_dvtModel[162].setRotationPoint(-42F, -17F, -11F);

		br_mk3_dvtModel[163].addShapeBox(0F, 0F, 0F, 5, 6, 1, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, -5F, 0F, -0.1F, 0F, -0.5F, 0.5F, -4F, -0.5F, 0.5F, -4F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // 164
		br_mk3_dvtModel[163].setRotationPoint(-47F, -17F, 10F);

		br_mk3_dvtModel[164].addShapeBox(0F, 0F, 0F, 5, 6, 1, 0F, -5F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, -0.5F, -0.55F, -4F, -0.5F, -0.6F, -4F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // 165
		br_mk3_dvtModel[164].setRotationPoint(-47F, -17F, -11F);

		br_mk3_dvtModel[165].addShapeBox(0F, 0F, 0F, 5, 6, 2, 0F, -5F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -5F, 0F, -0.6F, 0F, -0.5F, -0.6F, -4.5F, -0.5F, -0.6F, -4.5F, -0.5F, -0.6F, 0F, -0.5F, -0.6F); // 166
		br_mk3_dvtModel[165].setRotationPoint(-47F, -17F, -1F);

		br_mk3_dvtModel[166].addShapeBox(0F, 0F, 0F, 1, 3, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0.4F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0.5F, 0.4F, 0F); // 167
		br_mk3_dvtModel[166].setRotationPoint(-47F, 2F, -9F);

		br_mk3_dvtModel[167].addShapeBox(0F, 0F, 0F, 1, 3, 9, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0.4F, -1F); // 168
		br_mk3_dvtModel[167].setRotationPoint(-47F, 2F, 0F);

		br_mk3_dvtModel[168].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // 169
		br_mk3_dvtModel[168].setRotationPoint(-51F, -1F, -2F);

		br_mk3_dvtModel[169].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0.4F, 0F, -0.8F, -1F, 0F, -0.8F, -1F, 0F, 0.2F, 0.4F, 0F, 0.2F, 0.4F, 0F, -0.8F, -1F, 0F, -0.8F, -1F, 0F, 0.2F, 0.4F, 0F, 0.2F); // 170
		br_mk3_dvtModel[169].setRotationPoint(-52F, 1F, -1F);

		br_mk3_dvtModel[170].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // 171
		br_mk3_dvtModel[170].setRotationPoint(-53F, 0F, -8F);

		br_mk3_dvtModel[171].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // 172
		br_mk3_dvtModel[171].setRotationPoint(-53F, 0F, 7F);

		br_mk3_dvtModel[172].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F, -0.8F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.8F, 0.5F, 0F, -0.8F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, -0.8F, -1.5F, 0F); // 173
		br_mk3_dvtModel[172].setRotationPoint(-54F, 0F, -9F);

		br_mk3_dvtModel[173].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F, -0.8F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.8F, 0.5F, 0F, -0.8F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, -0.8F, -1.5F, 0F); // 174
		br_mk3_dvtModel[173].setRotationPoint(-54F, 0F, 6F);

		br_mk3_dvtModel[174].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // 175
		br_mk3_dvtModel[174].setRotationPoint(-51F, 0F, -4F);

		br_mk3_dvtModel[175].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // 176
		br_mk3_dvtModel[175].setRotationPoint(-51F, 0F, 3F);

		br_mk3_dvtModel[176].addShapeBox(0F, 0F, 0F, 4, 4, 2, 0F, -0.5F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.5F, 0F, -0.2F); // 177
		br_mk3_dvtModel[176].setRotationPoint(-50F, -2F, -10F);

		br_mk3_dvtModel[177].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0.1F, -0.2F, -0.7F, 0F, -0.2F, -0.7F, 0F, -0.2F, 0.3F, 0.1F, -0.2F, 0.3F, 0.1F, -0.5F, -0.7F, 0F, -0.5F, -0.7F, 0F, -0.5F, 0.3F, 0.1F, -0.5F, 0.3F); // 178
		br_mk3_dvtModel[177].setRotationPoint(-50F, -2F, -10F);

		br_mk3_dvtModel[178].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F); // 179
		br_mk3_dvtModel[178].setRotationPoint(35F, 0F, -8F);

		br_mk3_dvtModel[179].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F); // 180
		br_mk3_dvtModel[179].setRotationPoint(35F, 0F, 7F);

		br_mk3_dvtModel[180].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F, -1.3F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1.3F, 0F, 0F, -1.3F, -1F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, -1.3F, -1F, 0F); // 181
		br_mk3_dvtModel[180].setRotationPoint(39F, 0F, -6F);
		br_mk3_dvtModel[180].rotateAngleY = -3.14159265F;

		br_mk3_dvtModel[181].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F, -1.3F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1.3F, 0F, 0F, -1.3F, -1F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, -1.3F, -1F, 0F); // 182
		br_mk3_dvtModel[181].setRotationPoint(39F, 0F, 9F);
		br_mk3_dvtModel[181].rotateAngleY = -3.14159265F;

		br_mk3_dvtModel[182].addShapeBox(0F, 0F, 0F, 2, 3, 11, 0F, 0F, 0F, -0.4F, -1.5F, 0F, -0.4F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, 0F, 0F, 0F, 0F); // 183
		br_mk3_dvtModel[182].setRotationPoint(-46F, -11F, -11F);

		br_mk3_dvtModel[183].addShapeBox(0F, 0F, 0F, 2, 3, 4, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // 184
		br_mk3_dvtModel[183].setRotationPoint(-46F, -11F, 0F);

		br_mk3_dvtModel[184].addShapeBox(0F, 0F, 0F, 2, 3, 7, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.5F); // 185
		br_mk3_dvtModel[184].setRotationPoint(-46F, -11F, 4F);

		br_mk3_dvtModel[185].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F, 0F, 0F, -0.45F, 0F, 0F, -0.05F, 0F, 0F, -0.7F, 0F, 0F, -0.5F, 0F, 0F, -0.55F, 0F, 0F, -0.05F, 0F, 0F, 0F, 0F, 0F, 0F); // 186
		br_mk3_dvtModel[185].setRotationPoint(-46F, -10F, -11F);

		br_mk3_dvtModel[186].addShapeBox(0F, 0F, 0F, 6, 8, 2, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.05F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // 187
		br_mk3_dvtModel[186].setRotationPoint(-46F, -8F, -11F);

		br_mk3_dvtModel[187].addShapeBox(0F, 0F, 0F, 6, 8, 4, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // 188
		br_mk3_dvtModel[187].setRotationPoint(-46F, -8F, 0F);

		br_mk3_dvtModel[188].addShapeBox(0F, 0F, 0F, 6, 8, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.05F, 0F, 0F, -0.5F, -0.5F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, -0.45F, -0.5F, 0F, -1.05F); // 189
		br_mk3_dvtModel[188].setRotationPoint(-46F, -8F, 10F);

		br_mk3_dvtModel[189].addShapeBox(0F, 0F, 0F, 2, 7, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F); // 190
		br_mk3_dvtModel[189].setRotationPoint(-46F, -8F, -9F);

		br_mk3_dvtModel[190].addShapeBox(0F, 0F, 0F, 2, 7, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F); // 191
		br_mk3_dvtModel[190].setRotationPoint(-46F, -8F, 3F);

		br_mk3_dvtModel[191].addBox(0F, 0F, 0F, 1, 6, 4, 0F); // 192
		br_mk3_dvtModel[191].setRotationPoint(-41F, -6F, -7F);

		br_mk3_dvtModel[192].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // 193
		br_mk3_dvtModel[192].setRotationPoint(-43F, -7F, -7F);

		br_mk3_dvtModel[193].addShapeBox(0F, 0F, 0F, 2, 6, 4, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // 194
		br_mk3_dvtModel[193].setRotationPoint(-40F, -12F, -7F);

		br_mk3_dvtModel[194].addBox(0F, 0F, 0F, 1, 6, 4, 0F); // 195
		br_mk3_dvtModel[194].setRotationPoint(-41F, -6F, 5F);

		br_mk3_dvtModel[195].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // 196
		br_mk3_dvtModel[195].setRotationPoint(-43F, -7F, 5F);

		br_mk3_dvtModel[196].addShapeBox(0F, 0F, 0F, 2, 5, 4, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // 197
		br_mk3_dvtModel[196].setRotationPoint(-40F, -11F, 5F);

		br_mk3_dvtModel[197].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -0.5F, -0.4F, -0.3F, -1.1F, -0.4F, -0.3F, -1.1F, -0.4F, -0.3F, -0.5F, -0.4F, -0.3F, 0F, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, -0.3F, 0F, 0F, -0.3F); // 192
		br_mk3_dvtModel[197].setRotationPoint(-43F, -9F, -10F);

		br_mk3_dvtModel[198].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.6F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.6F, 0F, -0.4F, -0.6F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.6F, 0F, -0.4F); // 192
		br_mk3_dvtModel[198].setRotationPoint(-43F, -9F, -10F);

		br_mk3_dvtModel[199].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.6F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.6F, 0F, -0.4F, -0.6F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.6F, 0F, -0.4F); // 192
		br_mk3_dvtModel[199].setRotationPoint(-43F, -9F, 0F);


	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		for(int i = 0; i < 200; i++)
		{
			br_mk3_dvtModel[i].render(f5);
		}
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
	{
	}

	public ModelRendererTurbo br_mk3_dvtModel[];
}