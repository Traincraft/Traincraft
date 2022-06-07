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

public class ModelBR_MK3_Coach extends ModelBase
{
	int textureX = 512;
	int textureY = 512;

	public ModelBR_MK3_Coach()
	{
		br_mk3_coachModel = new ModelRendererTurbo[271];
		br_mk3_coachModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // 01
		br_mk3_coachModel[1] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // 02
		br_mk3_coachModel[2] = new ModelRendererTurbo(this, 209, 9, textureX, textureY); // 03
		br_mk3_coachModel[3] = new ModelRendererTurbo(this, 233, 17, textureX, textureY); // 04
		br_mk3_coachModel[4] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // 05
		br_mk3_coachModel[5] = new ModelRendererTurbo(this, 193, 33, textureX, textureY); // 06
		br_mk3_coachModel[6] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // 07
		br_mk3_coachModel[7] = new ModelRendererTurbo(this, 185, 41, textureX, textureY); // 08
		br_mk3_coachModel[8] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // 09
		br_mk3_coachModel[9] = new ModelRendererTurbo(this, 185, 49, textureX, textureY); // 10
		br_mk3_coachModel[10] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // 11
		br_mk3_coachModel[11] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // 12
		br_mk3_coachModel[12] = new ModelRendererTurbo(this, 457, 9, textureX, textureY); // 13
		br_mk3_coachModel[13] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // 14
		br_mk3_coachModel[14] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // 15
		br_mk3_coachModel[15] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // 16
		br_mk3_coachModel[16] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // 17
		br_mk3_coachModel[17] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // 18
		br_mk3_coachModel[18] = new ModelRendererTurbo(this, 377, 33, textureX, textureY); // 19
		br_mk3_coachModel[19] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // 20
		br_mk3_coachModel[20] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // 21
		br_mk3_coachModel[21] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // 22
		br_mk3_coachModel[22] = new ModelRendererTurbo(this, 505, 17, textureX, textureY); // 23
		br_mk3_coachModel[23] = new ModelRendererTurbo(this, 385, 33, textureX, textureY); // 24
		br_mk3_coachModel[24] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // 25
		br_mk3_coachModel[25] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // 26
		br_mk3_coachModel[26] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // 27
		br_mk3_coachModel[27] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // 28
		br_mk3_coachModel[28] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // 29
		br_mk3_coachModel[29] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // 30
		br_mk3_coachModel[30] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // 31
		br_mk3_coachModel[31] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // 32
		br_mk3_coachModel[32] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // 33
		br_mk3_coachModel[33] = new ModelRendererTurbo(this, 401, 9, textureX, textureY); // 34
		br_mk3_coachModel[34] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // 35
		br_mk3_coachModel[35] = new ModelRendererTurbo(this, 433, 9, textureX, textureY); // 36
		br_mk3_coachModel[36] = new ModelRendererTurbo(this, 209, 17, textureX, textureY); // 37
		br_mk3_coachModel[37] = new ModelRendererTurbo(this, 425, 33, textureX, textureY); // 38
		br_mk3_coachModel[38] = new ModelRendererTurbo(this, 457, 49, textureX, textureY); // 39
		br_mk3_coachModel[39] = new ModelRendererTurbo(this, 409, 9, textureX, textureY); // 40
		br_mk3_coachModel[40] = new ModelRendererTurbo(this, 489, 17, textureX, textureY); // 41
		br_mk3_coachModel[41] = new ModelRendererTurbo(this, 409, 33, textureX, textureY); // 42
		br_mk3_coachModel[42] = new ModelRendererTurbo(this, 425, 33, textureX, textureY); // 43
		br_mk3_coachModel[43] = new ModelRendererTurbo(this, 193, 25, textureX, textureY); // 44
		br_mk3_coachModel[44] = new ModelRendererTurbo(this, 369, 57, textureX, textureY); // 45
		br_mk3_coachModel[45] = new ModelRendererTurbo(this, 441, 33, textureX, textureY); // 46
		br_mk3_coachModel[46] = new ModelRendererTurbo(this, 505, 41, textureX, textureY); // 47
		br_mk3_coachModel[47] = new ModelRendererTurbo(this, 401, 57, textureX, textureY); // 48
		br_mk3_coachModel[48] = new ModelRendererTurbo(this, 473, 49, textureX, textureY); // 49
		br_mk3_coachModel[49] = new ModelRendererTurbo(this, 489, 49, textureX, textureY); // 50
		br_mk3_coachModel[50] = new ModelRendererTurbo(this, 201, 65, textureX, textureY); // 51
		br_mk3_coachModel[51] = new ModelRendererTurbo(this, 217, 17, textureX, textureY); // 52
		br_mk3_coachModel[52] = new ModelRendererTurbo(this, 225, 17, textureX, textureY); // 53
		br_mk3_coachModel[53] = new ModelRendererTurbo(this, 425, 17, textureX, textureY); // 54
		br_mk3_coachModel[54] = new ModelRendererTurbo(this, 433, 17, textureX, textureY); // 55
		br_mk3_coachModel[55] = new ModelRendererTurbo(this, 457, 17, textureX, textureY); // 56
		br_mk3_coachModel[56] = new ModelRendererTurbo(this, 465, 17, textureX, textureY); // 57
		br_mk3_coachModel[57] = new ModelRendererTurbo(this, 497, 17, textureX, textureY); // 58
		br_mk3_coachModel[58] = new ModelRendererTurbo(this, 201, 25, textureX, textureY); // 59
		br_mk3_coachModel[59] = new ModelRendererTurbo(this, 209, 25, textureX, textureY); // 60
		br_mk3_coachModel[60] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // 61
		br_mk3_coachModel[61] = new ModelRendererTurbo(this, 225, 25, textureX, textureY); // 62
		br_mk3_coachModel[62] = new ModelRendererTurbo(this, 473, 25, textureX, textureY); // 63
		br_mk3_coachModel[63] = new ModelRendererTurbo(this, 489, 25, textureX, textureY); // 64
		br_mk3_coachModel[64] = new ModelRendererTurbo(this, 425, 49, textureX, textureY); // 65
		br_mk3_coachModel[65] = new ModelRendererTurbo(this, 457, 49, textureX, textureY); // 66
		br_mk3_coachModel[66] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // 67
		br_mk3_coachModel[67] = new ModelRendererTurbo(this, 409, 49, textureX, textureY); // 68
		br_mk3_coachModel[68] = new ModelRendererTurbo(this, 17, 57, textureX, textureY); // 69
		br_mk3_coachModel[69] = new ModelRendererTurbo(this, 33, 57, textureX, textureY); // 70
		br_mk3_coachModel[70] = new ModelRendererTurbo(this, 49, 57, textureX, textureY); // 71
		br_mk3_coachModel[71] = new ModelRendererTurbo(this, 65, 57, textureX, textureY); // 72
		br_mk3_coachModel[72] = new ModelRendererTurbo(this, 89, 57, textureX, textureY); // 73
		br_mk3_coachModel[73] = new ModelRendererTurbo(this, 209, 65, textureX, textureY); // 74
		br_mk3_coachModel[74] = new ModelRendererTurbo(this, 249, 65, textureX, textureY); // 75
		br_mk3_coachModel[75] = new ModelRendererTurbo(this, 409, 33, textureX, textureY); // 76
		br_mk3_coachModel[76] = new ModelRendererTurbo(this, 425, 33, textureX, textureY); // 77
		br_mk3_coachModel[77] = new ModelRendererTurbo(this, 377, 41, textureX, textureY); // 78
		br_mk3_coachModel[78] = new ModelRendererTurbo(this, 377, 49, textureX, textureY); // 79
		br_mk3_coachModel[79] = new ModelRendererTurbo(this, 113, 57, textureX, textureY); // 80
		br_mk3_coachModel[80] = new ModelRendererTurbo(this, 129, 57, textureX, textureY); // 81
		br_mk3_coachModel[81] = new ModelRendererTurbo(this, 145, 57, textureX, textureY); // 82
		br_mk3_coachModel[82] = new ModelRendererTurbo(this, 161, 57, textureX, textureY); // 83
		br_mk3_coachModel[83] = new ModelRendererTurbo(this, 497, 49, textureX, textureY); // 84
		br_mk3_coachModel[84] = new ModelRendererTurbo(this, 177, 57, textureX, textureY); // 85
		br_mk3_coachModel[85] = new ModelRendererTurbo(this, 193, 65, textureX, textureY); // 86
		br_mk3_coachModel[86] = new ModelRendererTurbo(this, 233, 65, textureX, textureY); // 87
		br_mk3_coachModel[87] = new ModelRendererTurbo(this, 249, 65, textureX, textureY); // 88
		br_mk3_coachModel[88] = new ModelRendererTurbo(this, 273, 65, textureX, textureY); // 89
		br_mk3_coachModel[89] = new ModelRendererTurbo(this, 273, 65, textureX, textureY); // 90
		br_mk3_coachModel[90] = new ModelRendererTurbo(this, 305, 65, textureX, textureY); // 91
		br_mk3_coachModel[91] = new ModelRendererTurbo(this, 329, 65, textureX, textureY); // 92
		br_mk3_coachModel[92] = new ModelRendererTurbo(this, 401, 57, textureX, textureY); // 93
		br_mk3_coachModel[93] = new ModelRendererTurbo(this, 417, 57, textureX, textureY); // 94
		br_mk3_coachModel[94] = new ModelRendererTurbo(this, 497, 57, textureX, textureY); // 95
		br_mk3_coachModel[95] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // 96
		br_mk3_coachModel[96] = new ModelRendererTurbo(this, 217, 65, textureX, textureY); // 97
		br_mk3_coachModel[97] = new ModelRendererTurbo(this, 297, 65, textureX, textureY); // 98
		br_mk3_coachModel[98] = new ModelRendererTurbo(this, 369, 65, textureX, textureY); // 99
		br_mk3_coachModel[99] = new ModelRendererTurbo(this, 425, 65, textureX, textureY); // 100
		br_mk3_coachModel[100] = new ModelRendererTurbo(this, 441, 65, textureX, textureY); // 101
		br_mk3_coachModel[101] = new ModelRendererTurbo(this, 313, 65, textureX, textureY); // 102
		br_mk3_coachModel[102] = new ModelRendererTurbo(this, 457, 65, textureX, textureY); // 103
		br_mk3_coachModel[103] = new ModelRendererTurbo(this, 497, 65, textureX, textureY); // 104
		br_mk3_coachModel[104] = new ModelRendererTurbo(this, 233, 73, textureX, textureY); // 105
		br_mk3_coachModel[105] = new ModelRendererTurbo(this, 465, 65, textureX, textureY); // 106
		br_mk3_coachModel[106] = new ModelRendererTurbo(this, 249, 73, textureX, textureY); // 107
		br_mk3_coachModel[107] = new ModelRendererTurbo(this, 329, 73, textureX, textureY); // 108
		br_mk3_coachModel[108] = new ModelRendererTurbo(this, 257, 73, textureX, textureY); // 109
		br_mk3_coachModel[109] = new ModelRendererTurbo(this, 273, 73, textureX, textureY); // 110
		br_mk3_coachModel[110] = new ModelRendererTurbo(this, 281, 73, textureX, textureY); // 111
		br_mk3_coachModel[111] = new ModelRendererTurbo(this, 297, 73, textureX, textureY); // 112
		br_mk3_coachModel[112] = new ModelRendererTurbo(this, 313, 73, textureX, textureY); // 113
		br_mk3_coachModel[113] = new ModelRendererTurbo(this, 329, 73, textureX, textureY); // 114
		br_mk3_coachModel[114] = new ModelRendererTurbo(this, 353, 73, textureX, textureY); // 115
		br_mk3_coachModel[115] = new ModelRendererTurbo(this, 337, 73, textureX, textureY); // 116
		br_mk3_coachModel[116] = new ModelRendererTurbo(this, 417, 73, textureX, textureY); // 117
		br_mk3_coachModel[117] = new ModelRendererTurbo(this, 433, 73, textureX, textureY); // 118
		br_mk3_coachModel[118] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // 119
		br_mk3_coachModel[119] = new ModelRendererTurbo(this, 17, 81, textureX, textureY); // 120
		br_mk3_coachModel[120] = new ModelRendererTurbo(this, 369, 73, textureX, textureY); // 121
		br_mk3_coachModel[121] = new ModelRendererTurbo(this, 401, 73, textureX, textureY); // 122
		br_mk3_coachModel[122] = new ModelRendererTurbo(this, 33, 81, textureX, textureY); // 123
		br_mk3_coachModel[123] = new ModelRendererTurbo(this, 49, 81, textureX, textureY); // 124
		br_mk3_coachModel[124] = new ModelRendererTurbo(this, 65, 81, textureX, textureY); // 125
		br_mk3_coachModel[125] = new ModelRendererTurbo(this, 89, 81, textureX, textureY); // 126
		br_mk3_coachModel[126] = new ModelRendererTurbo(this, 433, 73, textureX, textureY); // 127
		br_mk3_coachModel[127] = new ModelRendererTurbo(this, 97, 81, textureX, textureY); // 128
		br_mk3_coachModel[128] = new ModelRendererTurbo(this, 505, 73, textureX, textureY); // 129
		br_mk3_coachModel[129] = new ModelRendererTurbo(this, 121, 81, textureX, textureY); // 130
		br_mk3_coachModel[130] = new ModelRendererTurbo(this, 129, 81, textureX, textureY); // 131
		br_mk3_coachModel[131] = new ModelRendererTurbo(this, 137, 81, textureX, textureY); // 132
		br_mk3_coachModel[132] = new ModelRendererTurbo(this, 145, 81, textureX, textureY); // 133
		br_mk3_coachModel[133] = new ModelRendererTurbo(this, 161, 81, textureX, textureY); // 134
		br_mk3_coachModel[134] = new ModelRendererTurbo(this, 177, 81, textureX, textureY); // 135
		br_mk3_coachModel[135] = new ModelRendererTurbo(this, 193, 81, textureX, textureY); // 136
		br_mk3_coachModel[136] = new ModelRendererTurbo(this, 289, 81, textureX, textureY); // 137
		br_mk3_coachModel[137] = new ModelRendererTurbo(this, 297, 81, textureX, textureY); // 138
		br_mk3_coachModel[138] = new ModelRendererTurbo(this, 305, 81, textureX, textureY); // 139
		br_mk3_coachModel[139] = new ModelRendererTurbo(this, 321, 81, textureX, textureY); // 140
		br_mk3_coachModel[140] = new ModelRendererTurbo(this, 353, 81, textureX, textureY); // 141
		br_mk3_coachModel[141] = new ModelRendererTurbo(this, 369, 81, textureX, textureY); // 142
		br_mk3_coachModel[142] = new ModelRendererTurbo(this, 369, 81, textureX, textureY); // 143
		br_mk3_coachModel[143] = new ModelRendererTurbo(this, 401, 81, textureX, textureY); // 144
		br_mk3_coachModel[144] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // 145
		br_mk3_coachModel[145] = new ModelRendererTurbo(this, 393, 81, textureX, textureY); // 146
		br_mk3_coachModel[146] = new ModelRendererTurbo(this, 401, 81, textureX, textureY); // 147
		br_mk3_coachModel[147] = new ModelRendererTurbo(this, 425, 81, textureX, textureY); // 148
		br_mk3_coachModel[148] = new ModelRendererTurbo(this, 433, 81, textureX, textureY); // 149
		br_mk3_coachModel[149] = new ModelRendererTurbo(this, 441, 81, textureX, textureY); // 150
		br_mk3_coachModel[150] = new ModelRendererTurbo(this, 41, 89, textureX, textureY); // 151
		br_mk3_coachModel[151] = new ModelRendererTurbo(this, 57, 89, textureX, textureY); // 152
		br_mk3_coachModel[152] = new ModelRendererTurbo(this, 73, 89, textureX, textureY); // 153
		br_mk3_coachModel[153] = new ModelRendererTurbo(this, 89, 89, textureX, textureY); // 154
		br_mk3_coachModel[154] = new ModelRendererTurbo(this, 337, 81, textureX, textureY); // 155
		br_mk3_coachModel[155] = new ModelRendererTurbo(this, 409, 81, textureX, textureY); // 156
		br_mk3_coachModel[156] = new ModelRendererTurbo(this, 121, 89, textureX, textureY); // 157
		br_mk3_coachModel[157] = new ModelRendererTurbo(this, 137, 89, textureX, textureY); // 158
		br_mk3_coachModel[158] = new ModelRendererTurbo(this, 505, 81, textureX, textureY); // 159
		br_mk3_coachModel[159] = new ModelRendererTurbo(this, 105, 89, textureX, textureY); // 160
		br_mk3_coachModel[160] = new ModelRendererTurbo(this, 137, 89, textureX, textureY); // 161
		br_mk3_coachModel[161] = new ModelRendererTurbo(this, 161, 89, textureX, textureY); // 162
		br_mk3_coachModel[162] = new ModelRendererTurbo(this, 169, 89, textureX, textureY); // 163
		br_mk3_coachModel[163] = new ModelRendererTurbo(this, 177, 89, textureX, textureY); // 164
		br_mk3_coachModel[164] = new ModelRendererTurbo(this, 185, 89, textureX, textureY); // 165
		br_mk3_coachModel[165] = new ModelRendererTurbo(this, 201, 89, textureX, textureY); // 166
		br_mk3_coachModel[166] = new ModelRendererTurbo(this, 209, 89, textureX, textureY); // 167
		br_mk3_coachModel[167] = new ModelRendererTurbo(this, 217, 89, textureX, textureY); // 168
		br_mk3_coachModel[168] = new ModelRendererTurbo(this, 233, 89, textureX, textureY); // 169
		br_mk3_coachModel[169] = new ModelRendererTurbo(this, 225, 89, textureX, textureY); // Box 169
		br_mk3_coachModel[170] = new ModelRendererTurbo(this, 321, 89, textureX, textureY); // Box 171
		br_mk3_coachModel[171] = new ModelRendererTurbo(this, 329, 89, textureX, textureY); // Box 171
		br_mk3_coachModel[172] = new ModelRendererTurbo(this, 337, 89, textureX, textureY); // Box 173
		br_mk3_coachModel[173] = new ModelRendererTurbo(this, 345, 89, textureX, textureY); // Box 173
		br_mk3_coachModel[174] = new ModelRendererTurbo(this, 353, 89, textureX, textureY); // Box 171
		br_mk3_coachModel[175] = new ModelRendererTurbo(this, 361, 89, textureX, textureY); // Box 171
		br_mk3_coachModel[176] = new ModelRendererTurbo(this, 369, 89, textureX, textureY); // Box 173
		br_mk3_coachModel[177] = new ModelRendererTurbo(this, 393, 89, textureX, textureY); // Box 173
		br_mk3_coachModel[178] = new ModelRendererTurbo(this, 401, 89, textureX, textureY); // Box 179
		br_mk3_coachModel[179] = new ModelRendererTurbo(this, 425, 89, textureX, textureY); // Box 179
		br_mk3_coachModel[180] = new ModelRendererTurbo(this, 473, 89, textureX, textureY); // Box 179
		br_mk3_coachModel[181] = new ModelRendererTurbo(this, 489, 89, textureX, textureY); // Box 179
		br_mk3_coachModel[182] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 170
		br_mk3_coachModel[183] = new ModelRendererTurbo(this, 49, 97, textureX, textureY); // Box 170
		br_mk3_coachModel[184] = new ModelRendererTurbo(this, 153, 155, textureX, textureY); // Box 170
		br_mk3_coachModel[185] = new ModelRendererTurbo(this, 449, 152, textureX, textureY); // Box 170
		br_mk3_coachModel[186] = new ModelRendererTurbo(this, 33, 97, textureX, textureY); // Box 170
		br_mk3_coachModel[187] = new ModelRendererTurbo(this, 321, 97, textureX, textureY); // Box 170
		br_mk3_coachModel[188] = new ModelRendererTurbo(this, 369, 97, textureX, textureY); // Box 170
		br_mk3_coachModel[189] = new ModelRendererTurbo(this, 424, 141, textureX, textureY); // Box 170
		br_mk3_coachModel[190] = new ModelRendererTurbo(this, 201, 160, textureX, textureY); // Box 170
		br_mk3_coachModel[191] = new ModelRendererTurbo(this, 185, 97, textureX, textureY); // Box 170
		br_mk3_coachModel[192] = new ModelRendererTurbo(this, 353, 97, textureX, textureY); // Box 170
		br_mk3_coachModel[193] = new ModelRendererTurbo(this, 489, 89, textureX, textureY); // Box 170
		br_mk3_coachModel[194] = new ModelRendererTurbo(this, 377, 89, textureX, textureY); // Box 170
		br_mk3_coachModel[195] = new ModelRendererTurbo(this, 505, 89, textureX, textureY); // Box 170
		br_mk3_coachModel[196] = new ModelRendererTurbo(this, 401, 97, textureX, textureY); // Box 170
		br_mk3_coachModel[197] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 170
		br_mk3_coachModel[198] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 170
		br_mk3_coachModel[199] = new ModelRendererTurbo(this, 17, 97, textureX, textureY); // Box 170
		br_mk3_coachModel[200] = new ModelRendererTurbo(this, 81, 105, textureX, textureY); // Box 170
		br_mk3_coachModel[201] = new ModelRendererTurbo(this, 113, 105, textureX, textureY); // Box 170
		br_mk3_coachModel[202] = new ModelRendererTurbo(this, 33, 97, textureX, textureY); // Box 170
		br_mk3_coachModel[203] = new ModelRendererTurbo(this, 41, 97, textureX, textureY); // Box 170
		br_mk3_coachModel[204] = new ModelRendererTurbo(this, 137, 105, textureX, textureY); // Box 170
		br_mk3_coachModel[205] = new ModelRendererTurbo(this, 457, 113, textureX, textureY); // Box 170
		br_mk3_coachModel[206] = new ModelRendererTurbo(this, 57, 97, textureX, textureY); // Box 170
		br_mk3_coachModel[207] = new ModelRendererTurbo(this, 65, 97, textureX, textureY); // Box 170
		br_mk3_coachModel[208] = new ModelRendererTurbo(this, 481, 113, textureX, textureY); // Box 170
		br_mk3_coachModel[209] = new ModelRendererTurbo(this, 97, 121, textureX, textureY); // Box 170
		br_mk3_coachModel[210] = new ModelRendererTurbo(this, 81, 97, textureX, textureY); // Box 170
		br_mk3_coachModel[211] = new ModelRendererTurbo(this, 89, 97, textureX, textureY); // Box 170
		br_mk3_coachModel[212] = new ModelRendererTurbo(this, 129, 121, textureX, textureY); // Box 170
		br_mk3_coachModel[213] = new ModelRendererTurbo(this, 161, 121, textureX, textureY); // Box 170
		br_mk3_coachModel[214] = new ModelRendererTurbo(this, 137, 97, textureX, textureY); // Box 170
		br_mk3_coachModel[215] = new ModelRendererTurbo(this, 145, 97, textureX, textureY); // Box 170
		br_mk3_coachModel[216] = new ModelRendererTurbo(this, 185, 121, textureX, textureY); // Box 170
		br_mk3_coachModel[217] = new ModelRendererTurbo(this, 217, 121, textureX, textureY); // Box 170
		br_mk3_coachModel[218] = new ModelRendererTurbo(this, 161, 97, textureX, textureY); // Box 170
		br_mk3_coachModel[219] = new ModelRendererTurbo(this, 169, 97, textureX, textureY); // Box 170
		br_mk3_coachModel[220] = new ModelRendererTurbo(this, 241, 121, textureX, textureY); // Box 170
		br_mk3_coachModel[221] = new ModelRendererTurbo(this, 273, 121, textureX, textureY); // Box 170
		br_mk3_coachModel[222] = new ModelRendererTurbo(this, 185, 97, textureX, textureY); // Box 170
		br_mk3_coachModel[223] = new ModelRendererTurbo(this, 193, 97, textureX, textureY); // Box 170
		br_mk3_coachModel[224] = new ModelRendererTurbo(this, 297, 121, textureX, textureY); // Box 170
		br_mk3_coachModel[225] = new ModelRendererTurbo(this, 417, 121, textureX, textureY); // Box 170
		br_mk3_coachModel[226] = new ModelRendererTurbo(this, 209, 97, textureX, textureY); // Box 170
		br_mk3_coachModel[227] = new ModelRendererTurbo(this, 225, 97, textureX, textureY); // Box 170
		br_mk3_coachModel[228] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Box 170
		br_mk3_coachModel[229] = new ModelRendererTurbo(this, 33, 129, textureX, textureY); // Box 170
		br_mk3_coachModel[230] = new ModelRendererTurbo(this, 233, 97, textureX, textureY); // Box 170
		br_mk3_coachModel[231] = new ModelRendererTurbo(this, 321, 97, textureX, textureY); // Box 170
		br_mk3_coachModel[232] = new ModelRendererTurbo(this, 321, 129, textureX, textureY); // Box 170
		br_mk3_coachModel[233] = new ModelRendererTurbo(this, 353, 129, textureX, textureY); // Box 170
		br_mk3_coachModel[234] = new ModelRendererTurbo(this, 329, 97, textureX, textureY); // Box 170
		br_mk3_coachModel[235] = new ModelRendererTurbo(this, 337, 97, textureX, textureY); // Box 170
		br_mk3_coachModel[236] = new ModelRendererTurbo(this, 473, 129, textureX, textureY); // Box 170
		br_mk3_coachModel[237] = new ModelRendererTurbo(this, 441, 129, textureX, textureY); // Box 170
		br_mk3_coachModel[238] = new ModelRendererTurbo(this, 353, 97, textureX, textureY); // Box 170
		br_mk3_coachModel[239] = new ModelRendererTurbo(this, 377, 97, textureX, textureY); // Box 170
		br_mk3_coachModel[240] = new ModelRendererTurbo(this, 57, 137, textureX, textureY); // Box 170
		br_mk3_coachModel[241] = new ModelRendererTurbo(this, 113, 137, textureX, textureY); // Box 170
		br_mk3_coachModel[242] = new ModelRendererTurbo(this, 385, 97, textureX, textureY); // Box 170
		br_mk3_coachModel[243] = new ModelRendererTurbo(this, 401, 97, textureX, textureY); // Box 170
		br_mk3_coachModel[244] = new ModelRendererTurbo(this, 137, 137, textureX, textureY); // Box 170
		br_mk3_coachModel[245] = new ModelRendererTurbo(this, 177, 137, textureX, textureY); // Box 170
		br_mk3_coachModel[246] = new ModelRendererTurbo(this, 425, 97, textureX, textureY); // Box 170
		br_mk3_coachModel[247] = new ModelRendererTurbo(this, 433, 97, textureX, textureY); // Box 170
		br_mk3_coachModel[248] = new ModelRendererTurbo(this, 233, 137, textureX, textureY); // Box 170
		br_mk3_coachModel[249] = new ModelRendererTurbo(this, 201, 137, textureX, textureY); // Box 170
		br_mk3_coachModel[250] = new ModelRendererTurbo(this, 449, 97, textureX, textureY); // Box 170
		br_mk3_coachModel[251] = new ModelRendererTurbo(this, 457, 97, textureX, textureY); // Box 170
		br_mk3_coachModel[252] = new ModelRendererTurbo(this, 289, 137, textureX, textureY); // Box 170
		br_mk3_coachModel[253] = new ModelRendererTurbo(this, 377, 137, textureX, textureY); // Box 170
		br_mk3_coachModel[254] = new ModelRendererTurbo(this, 473, 97, textureX, textureY); // Box 170
		br_mk3_coachModel[255] = new ModelRendererTurbo(this, 481, 97, textureX, textureY); // Box 170
		br_mk3_coachModel[256] = new ModelRendererTurbo(this, 233, 159, textureX, textureY); // Box 170
		br_mk3_coachModel[257] = new ModelRendererTurbo(this, 233, 169, textureX, textureY); // Box 170
		br_mk3_coachModel[258] = new ModelRendererTurbo(this, 225, 179, textureX, textureY); // Box 170
		br_mk3_coachModel[259] = new ModelRendererTurbo(this, 225, 188, textureX, textureY); // Box 170
		br_mk3_coachModel[260] = new ModelRendererTurbo(this, 225, 179, textureX, textureY); // Box 170
		br_mk3_coachModel[261] = new ModelRendererTurbo(this, 225, 188, textureX, textureY); // Box 170
		br_mk3_coachModel[262] = new ModelRendererTurbo(this, 337, 181, textureX, textureY); // Box 170
		br_mk3_coachModel[263] = new ModelRendererTurbo(this, 469, 152, textureX, textureY); // Box 170
		br_mk3_coachModel[264] = new ModelRendererTurbo(this, 461, 162, textureX, textureY); // Box 170
		br_mk3_coachModel[265] = new ModelRendererTurbo(this, 174, 157, textureX, textureY); // Box 170
		br_mk3_coachModel[266] = new ModelRendererTurbo(this, 153, 169, textureX, textureY); // Box 170
		br_mk3_coachModel[267] = new ModelRendererTurbo(this, 424, 159, textureX, textureY); // Box 170
		br_mk3_coachModel[268] = new ModelRendererTurbo(this, 404, 152, textureX, textureY); // Box 170
		br_mk3_coachModel[269] = new ModelRendererTurbo(this, 201, 175, textureX, textureY); // Box 170
		br_mk3_coachModel[270] = new ModelRendererTurbo(this, 201, 193, textureX, textureY); // Box 170

		br_mk3_coachModel[0].addShapeBox(0F, 0F, 0F, 92, 1, 20, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0.4F, 0F, -0.5F, 0.4F, 0F, -0.5F, 0.4F, 0F, -0.5F, 0.4F); // 01
		br_mk3_coachModel[0].setRotationPoint(-48F, 0F, -10F);

		br_mk3_coachModel[1].addShapeBox(0F, 0F, 0F, 92, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F); // 02
		br_mk3_coachModel[1].setRotationPoint(-48F, -3F, -11F);

		br_mk3_coachModel[2].addShapeBox(0F, 0F, 0F, 92, 4, 1, 0F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // 03
		br_mk3_coachModel[2].setRotationPoint(-48F, -3F, 10F);

		br_mk3_coachModel[3].addShapeBox(0F, 0F, 0F, 92, 14, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0F, 0F, -0.9F); // 04
		br_mk3_coachModel[3].setRotationPoint(-48F, -17F, -11F);

		br_mk3_coachModel[4].addShapeBox(0F, 0F, 0F, 92, 14, 1, 0F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F, 0F); // 05
		br_mk3_coachModel[4].setRotationPoint(-48F, -17F, 10F);

		br_mk3_coachModel[5].addShapeBox(0F, 0F, 0F, 92, 1, 1, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0F, 0F, -0.9F); // 06
		br_mk3_coachModel[5].setRotationPoint(-48F, -18F, -11F);

		br_mk3_coachModel[6].addShapeBox(0F, 0F, 0F, 92, 1, 1, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F, 0F); // 07
		br_mk3_coachModel[6].setRotationPoint(-48F, -18F, 10F);

		br_mk3_coachModel[7].addShapeBox(0F, 0F, 0F, 92, 2, 3, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, -3F, 0F, 0.1F, -3F); // 08
		br_mk3_coachModel[7].setRotationPoint(-48F, -20F, -10F);

		br_mk3_coachModel[8].addShapeBox(0F, 0F, 0F, 92, 2, 3, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0.1F, -3F, 0F, 0.1F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // 09
		br_mk3_coachModel[8].setRotationPoint(-48F, -20F, 7F);

		br_mk3_coachModel[9].addShapeBox(0F, 0F, 0F, 92, 2, 7, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, -7F, 0F, 0.1F, -7F); // 10
		br_mk3_coachModel[9].setRotationPoint(-48F, -22F, -7F);

		br_mk3_coachModel[10].addShapeBox(0F, 0F, 0F, 92, 2, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0.1F, -7F, 0F, 0.1F, -7F, 0F, 0F, 0F, 0F, 0F, 0F); // 11
		br_mk3_coachModel[10].setRotationPoint(-48F, -22F, 0F);

		br_mk3_coachModel[11].addShapeBox(0F, 0F, 0F, 1, 4, 22, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -0.5F); // 12
		br_mk3_coachModel[11].setRotationPoint(44F, -3F, -11F);

		br_mk3_coachModel[12].addShapeBox(0F, 0F, 0F, 1, 14, 22, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F); // 13
		br_mk3_coachModel[12].setRotationPoint(44F, -17F, -11F);

		br_mk3_coachModel[13].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F, 0F, -2F, -1F, 0F, -3F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // 14
		br_mk3_coachModel[13].setRotationPoint(44F, -20F, -11F);

		br_mk3_coachModel[14].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -3F, -0.5F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F); // 15
		br_mk3_coachModel[14].setRotationPoint(44F, -20F, 7F);

		br_mk3_coachModel[15].addShapeBox(0F, 0F, 0F, 1, 5, 6, 0F, 0F, -2F, 0F, -1F, -2F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // 16
		br_mk3_coachModel[15].setRotationPoint(44F, -22F, -7F);

		br_mk3_coachModel[16].addShapeBox(0F, 0F, 0F, 1, 5, 6, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // 17
		br_mk3_coachModel[16].setRotationPoint(44F, -22F, 1F);

		br_mk3_coachModel[17].addShapeBox(0F, 0F, 0F, 1, 5, 2, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // 18
		br_mk3_coachModel[17].setRotationPoint(44F, -22F, -1F);

		br_mk3_coachModel[18].addShapeBox(0F, 0F, 0F, 2, 2, 20, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -0.5F, 0F, -1F); // 19
		br_mk3_coachModel[18].setRotationPoint(43F, 0F, -10F);

		br_mk3_coachModel[19].addShapeBox(0F, 0F, 0F, 1, 18, 1, 0F, 0.4F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // 20
		br_mk3_coachModel[19].setRotationPoint(45F, -18F, -5F);

		br_mk3_coachModel[20].addShapeBox(0F, 0F, 0F, 1, 18, 1, 0F, 0.4F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // 21
		br_mk3_coachModel[20].setRotationPoint(45F, -18F, 4F);

		br_mk3_coachModel[21].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F, 0.6F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.6F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // 22
		br_mk3_coachModel[21].setRotationPoint(45F, -19F, -4F);

		br_mk3_coachModel[22].addShapeBox(0F, 0F, 0F, 1, 18, 1, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F); // 23
		br_mk3_coachModel[22].setRotationPoint(45F, -18F, -5F);

		br_mk3_coachModel[23].addShapeBox(0F, 0F, 0F, 1, 18, 1, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // 24
		br_mk3_coachModel[23].setRotationPoint(45F, -18F, 4F);

		br_mk3_coachModel[24].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // 25
		br_mk3_coachModel[24].setRotationPoint(45F, 0F, -4F);

		br_mk3_coachModel[25].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.75F, 0F, -1F, -0.75F, 0F, 0F, 0F, 0F, 0F); // 26
		br_mk3_coachModel[25].setRotationPoint(45F, 0F, -5F);

		br_mk3_coachModel[26].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -1F, 0F, 0F, -1F); // 27
		br_mk3_coachModel[26].setRotationPoint(45F, 0F, 4F);

		br_mk3_coachModel[27].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0.5F, 0F, -1F, 0.5F, 0F, 0F, 0F, 0F, 0F); // 28
		br_mk3_coachModel[27].setRotationPoint(45F, 0F, -5F);

		br_mk3_coachModel[28].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -1F, 0F, 0F, -1F); // 29
		br_mk3_coachModel[28].setRotationPoint(45F, 0F, 4F);

		br_mk3_coachModel[29].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.5F, 0F, -1F, -0.75F, 0F, -1F, -0.75F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0.5F, 0F, 0F); // 30
		br_mk3_coachModel[29].setRotationPoint(45F, -19F, -5F);

		br_mk3_coachModel[30].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.5F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -1F, 0.5F, 0F, -1F, 0.5F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0.5F, 0F, 0F); // 31
		br_mk3_coachModel[30].setRotationPoint(45F, -19F, 4F);

		br_mk3_coachModel[31].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -1F, 0.5F, 0F, -1F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F); // 32
		br_mk3_coachModel[31].setRotationPoint(45F, -19F, -5F);

		br_mk3_coachModel[32].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // 33
		br_mk3_coachModel[32].setRotationPoint(45F, -19F, 4F);

		br_mk3_coachModel[33].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, -0.8F, 0.5F, 0F, -0.8F, 0.5F, 0F, -0.8F, -0.5F, 0F, -0.8F, -0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F); // 34
		br_mk3_coachModel[33].setRotationPoint(44F, 1F, 0F);

		br_mk3_coachModel[34].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F, 0.1F, -0.4F, 0.7F, 0F, -0.4F, 0.7F, 0F, -0.4F, -0.3F, 0.1F, -0.4F, -0.3F, 0.1F, 0.8F, 0.7F, 0F, 0.8F, 0.7F, 0F, 0.8F, -0.3F, 0.1F, 0.8F, -0.3F); // 35
		br_mk3_coachModel[34].setRotationPoint(47F, 1F, 0F);

		br_mk3_coachModel[35].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F, -0.5F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F); // 36
		br_mk3_coachModel[35].setRotationPoint(47F, 1F, 0F);

		br_mk3_coachModel[36].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.2F, 0.25F, -0.5F, -0.2F, 0.25F, -0.5F, -0.2F, -0.75F, 0F, -0.2F, -0.75F, 0F, -0.3F, 0.25F, -0.5F, -0.3F, 0.25F, -0.5F, -0.3F, -0.75F, 0F, -0.3F, -0.75F); // 37
		br_mk3_coachModel[36].setRotationPoint(47F, 2F, 0F);

		br_mk3_coachModel[37].addShapeBox(0F, 0F, 0F, 1, 4, 22, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -0.5F); // 38
		br_mk3_coachModel[37].setRotationPoint(-48F, -3F, 11F);
		br_mk3_coachModel[37].rotateAngleY = -3.14159265F;

		br_mk3_coachModel[38].addShapeBox(0F, 0F, 0F, 1, 14, 22, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F); // 39
		br_mk3_coachModel[38].setRotationPoint(-48F, -17F, 11F);
		br_mk3_coachModel[38].rotateAngleY = -3.14159265F;

		br_mk3_coachModel[39].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F, 0F, -2F, -1F, 0F, -3F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // 40
		br_mk3_coachModel[39].setRotationPoint(-48F, -20F, 11F);
		br_mk3_coachModel[39].rotateAngleY = -3.14159265F;

		br_mk3_coachModel[40].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -3F, -0.5F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F); // 41
		br_mk3_coachModel[40].setRotationPoint(-48F, -20F, -7F);
		br_mk3_coachModel[40].rotateAngleY = -3.14159265F;

		br_mk3_coachModel[41].addShapeBox(0F, 0F, 0F, 1, 5, 6, 0F, 0F, -2F, 0F, -1F, -2F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // 42
		br_mk3_coachModel[41].setRotationPoint(-48F, -22F, 7F);
		br_mk3_coachModel[41].rotateAngleY = -3.14159265F;

		br_mk3_coachModel[42].addShapeBox(0F, 0F, 0F, 1, 5, 6, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // 43
		br_mk3_coachModel[42].setRotationPoint(-48F, -22F, -1F);
		br_mk3_coachModel[42].rotateAngleY = -3.14159265F;

		br_mk3_coachModel[43].addShapeBox(0F, 0F, 0F, 1, 5, 2, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // 44
		br_mk3_coachModel[43].setRotationPoint(-48F, -22F, 1F);
		br_mk3_coachModel[43].rotateAngleY = -3.14159265F;

		br_mk3_coachModel[44].addShapeBox(0F, 0F, 0F, 2, 2, 20, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -0.5F, 0F, -1F); // 45
		br_mk3_coachModel[44].setRotationPoint(-47F, 0F, 10F);
		br_mk3_coachModel[44].rotateAngleY = -3.14159265F;

		br_mk3_coachModel[45].addShapeBox(0F, 0F, 0F, 1, 18, 1, 0F, 0.4F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // 46
		br_mk3_coachModel[45].setRotationPoint(-49F, -18F, 5F);
		br_mk3_coachModel[45].rotateAngleY = -3.14159265F;

		br_mk3_coachModel[46].addShapeBox(0F, 0F, 0F, 1, 18, 1, 0F, 0.4F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // 47
		br_mk3_coachModel[46].setRotationPoint(-49F, -18F, -4F);
		br_mk3_coachModel[46].rotateAngleY = -3.14159265F;

		br_mk3_coachModel[47].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F, 0.6F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.6F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // 48
		br_mk3_coachModel[47].setRotationPoint(-49F, -19F, 4F);
		br_mk3_coachModel[47].rotateAngleY = -3.14159265F;

		br_mk3_coachModel[48].addShapeBox(0F, 0F, 0F, 1, 18, 1, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F); // 49
		br_mk3_coachModel[48].setRotationPoint(-49F, -18F, 5F);
		br_mk3_coachModel[48].rotateAngleY = -3.14159265F;

		br_mk3_coachModel[49].addShapeBox(0F, 0F, 0F, 1, 18, 1, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // 50
		br_mk3_coachModel[49].setRotationPoint(-49F, -18F, -4F);
		br_mk3_coachModel[49].rotateAngleY = -3.14159265F;

		br_mk3_coachModel[50].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // 51
		br_mk3_coachModel[50].setRotationPoint(-49F, 0F, 4F);
		br_mk3_coachModel[50].rotateAngleY = -3.14159265F;

		br_mk3_coachModel[51].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.75F, 0F, -1F, -0.75F, 0F, 0F, 0F, 0F, 0F); // 52
		br_mk3_coachModel[51].setRotationPoint(-49F, 0F, 5F);
		br_mk3_coachModel[51].rotateAngleY = -3.14159265F;

		br_mk3_coachModel[52].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -1F, 0F, 0F, -1F); // 53
		br_mk3_coachModel[52].setRotationPoint(-49F, 0F, -4F);
		br_mk3_coachModel[52].rotateAngleY = -3.14159265F;

		br_mk3_coachModel[53].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0.5F, 0F, -1F, 0.5F, 0F, 0F, 0F, 0F, 0F); // 54
		br_mk3_coachModel[53].setRotationPoint(-49F, 0F, 5F);
		br_mk3_coachModel[53].rotateAngleY = -3.14159265F;

		br_mk3_coachModel[54].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -1F, 0F, 0F, -1F); // 55
		br_mk3_coachModel[54].setRotationPoint(-49F, 0F, -4F);
		br_mk3_coachModel[54].rotateAngleY = -3.14159265F;

		br_mk3_coachModel[55].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.5F, 0F, -1F, -0.75F, 0F, -1F, -0.75F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0.5F, 0F, 0F); // 56
		br_mk3_coachModel[55].setRotationPoint(-49F, -19F, 5F);
		br_mk3_coachModel[55].rotateAngleY = -3.14159265F;

		br_mk3_coachModel[56].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.5F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -1F, 0.5F, 0F, -1F, 0.5F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0.5F, 0F, 0F); // 57
		br_mk3_coachModel[56].setRotationPoint(-49F, -19F, -4F);
		br_mk3_coachModel[56].rotateAngleY = -3.14159265F;

		br_mk3_coachModel[57].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -1F, 0.5F, 0F, -1F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F); // 58
		br_mk3_coachModel[57].setRotationPoint(-49F, -19F, 5F);
		br_mk3_coachModel[57].rotateAngleY = -3.14159265F;

		br_mk3_coachModel[58].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // 59
		br_mk3_coachModel[58].setRotationPoint(-49F, -19F, -4F);
		br_mk3_coachModel[58].rotateAngleY = -3.14159265F;

		br_mk3_coachModel[59].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, -0.8F, 0.5F, 0F, -0.8F, 0.5F, 0F, -0.8F, -0.5F, 0F, -0.8F, -0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F); // 60
		br_mk3_coachModel[59].setRotationPoint(-48F, 1F, 0F);
		br_mk3_coachModel[59].rotateAngleY = -3.14159265F;

		br_mk3_coachModel[60].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F, 0.1F, -0.4F, 0.7F, 0F, -0.4F, 0.7F, 0F, -0.4F, -0.3F, 0.1F, -0.4F, -0.3F, 0.1F, 0.8F, 0.7F, 0F, 0.8F, 0.7F, 0F, 0.8F, -0.3F, 0.1F, 0.8F, -0.3F); // 61
		br_mk3_coachModel[60].setRotationPoint(-51F, 1F, 0F);
		br_mk3_coachModel[60].rotateAngleY = -3.14159265F;

		br_mk3_coachModel[61].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F, -0.5F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F); // 62
		br_mk3_coachModel[61].setRotationPoint(-51F, 1F, 0F);
		br_mk3_coachModel[61].rotateAngleY = -3.14159265F;

		br_mk3_coachModel[62].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.2F, 0.25F, -0.5F, -0.2F, 0.25F, -0.5F, -0.2F, -0.75F, 0F, -0.2F, -0.75F, 0F, -0.3F, 0.25F, -0.5F, -0.3F, 0.25F, -0.5F, -0.3F, -0.75F, 0F, -0.3F, -0.75F); // 63
		br_mk3_coachModel[62].setRotationPoint(-51F, 2F, 0F);
		br_mk3_coachModel[62].rotateAngleY = -3.14159265F;

		br_mk3_coachModel[63].addBox(0F, 0F, 0F, 5, 5, 0, 0F); // 64
		br_mk3_coachModel[63].setRotationPoint(-41F, 2F, -6F);

		br_mk3_coachModel[64].addBox(0F, 0F, 0F, 5, 5, 0, 0F); // 65
		br_mk3_coachModel[64].setRotationPoint(-41F, 2F, 6F);

		br_mk3_coachModel[65].addBox(0F, 0F, 0F, 5, 5, 0, 0F); // 66
		br_mk3_coachModel[65].setRotationPoint(-27F, 2F, -6F);

		br_mk3_coachModel[66].addBox(0F, 0F, 0F, 5, 5, 0, 0F); // 67
		br_mk3_coachModel[66].setRotationPoint(-27F, 2F, 6F);

		br_mk3_coachModel[67].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 1F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 1F, 0F, 0F, 1F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 1F, 0.2F, 0F); // 68
		br_mk3_coachModel[67].setRotationPoint(-41F, 2F, -8F);

		br_mk3_coachModel[68].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 1F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 1F, 0F, 0F, 1F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 1F, 0.2F, 0F); // 69
		br_mk3_coachModel[68].setRotationPoint(-41F, 2F, 7F);

		br_mk3_coachModel[69].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, 0.2F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 1F, 0.2F, 0F, 1F, 0.2F, 0F, 0F, 0.2F, 0F); // 70
		br_mk3_coachModel[69].setRotationPoint(-27F, 2F, -8F);

		br_mk3_coachModel[70].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, 0.2F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 1F, 0.2F, 0F, 1F, 0.2F, 0F, 0F, 0.2F, 0F); // 71
		br_mk3_coachModel[70].setRotationPoint(-27F, 2F, 7F);

		br_mk3_coachModel[71].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F); // 72
		br_mk3_coachModel[71].setRotationPoint(-36F, 2F, -8F);

		br_mk3_coachModel[72].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F); // 73
		br_mk3_coachModel[72].setRotationPoint(-36F, 2F, 7F);

		br_mk3_coachModel[73].addShapeBox(0F, 0F, 0F, 1, 1, 16, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // 74
		br_mk3_coachModel[73].setRotationPoint(-39F, 4F, -8F);

		br_mk3_coachModel[74].addShapeBox(0F, 0F, 0F, 1, 1, 16, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // 75
		br_mk3_coachModel[74].setRotationPoint(-25F, 4F, -8F);

		br_mk3_coachModel[75].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0F, -0.2F); // 76
		br_mk3_coachModel[75].setRotationPoint(-42F, 3F, -8F);

		br_mk3_coachModel[76].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0F, -0.2F); // 77
		br_mk3_coachModel[76].setRotationPoint(-42F, 3F, 7F);

		br_mk3_coachModel[77].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.5F, 0F, -0.2F); // 78
		br_mk3_coachModel[77].setRotationPoint(-22F, 3F, -8F);

		br_mk3_coachModel[78].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.5F, 0F, -0.2F); // 79
		br_mk3_coachModel[78].setRotationPoint(-22F, 3F, 7F);

		br_mk3_coachModel[79].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.5F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, -0.5F, -0.5F, -0.2F); // 80
		br_mk3_coachModel[79].setRotationPoint(-42F, 5F, -8F);

		br_mk3_coachModel[80].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.5F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, -0.5F, -0.5F, -0.2F); // 81
		br_mk3_coachModel[80].setRotationPoint(-42F, 5F, 7F);

		br_mk3_coachModel[81].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -0.5F, -0.2F, -0.5F, -0.5F, -0.2F, -0.5F, -0.5F, -0.2F, 0F, -0.5F, -0.2F); // 82
		br_mk3_coachModel[81].setRotationPoint(-25F, 5F, -8F);

		br_mk3_coachModel[82].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -0.5F, -0.2F, -0.5F, -0.5F, -0.2F, -0.5F, -0.5F, -0.2F, 0F, -0.5F, -0.2F); // 83
		br_mk3_coachModel[82].setRotationPoint(-25F, 5F, 7F);

		br_mk3_coachModel[83].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -0.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F); // 84
		br_mk3_coachModel[83].setRotationPoint(-41F, 3F, -8F);

		br_mk3_coachModel[84].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -0.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F); // 85
		br_mk3_coachModel[84].setRotationPoint(-24F, 3F, -8F);

		br_mk3_coachModel[85].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 0F, -0.2F, 0F, 0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, 0.5F, -0.2F); // 86
		br_mk3_coachModel[85].setRotationPoint(-38F, 4F, -8F);

		br_mk3_coachModel[86].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, -0.2F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, -0.5F, -0.2F); // 87
		br_mk3_coachModel[86].setRotationPoint(-28F, 4F, -8F);

		br_mk3_coachModel[87].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 0F, -0.2F, 0F, 0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, 0.5F, -0.2F); // 88
		br_mk3_coachModel[87].setRotationPoint(-38F, 4F, 7F);

		br_mk3_coachModel[88].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, -0.2F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, -0.5F, -0.2F); // 89
		br_mk3_coachModel[88].setRotationPoint(-28F, 4F, 7F);

		br_mk3_coachModel[89].addShapeBox(0F, 0F, 0F, 1, 1, 14, 0F, 0F, -0.5F, 0.2F, -0.5F, -0.5F, 0.2F, -0.5F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, 0F, 0.2F, -0.5F, 0F, 0.2F, -0.5F, 0F, 0.2F, 0F, 0F, 0.2F); // 90
		br_mk3_coachModel[89].setRotationPoint(-42F, 4F, -7F);

		br_mk3_coachModel[90].addShapeBox(0F, 0F, 0F, 1, 1, 14, 0F, -0.5F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, -0.5F, -0.5F, 0.2F, -0.5F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, -0.5F, 0F, 0.2F); // 91
		br_mk3_coachModel[90].setRotationPoint(-22F, 4F, -7F);

		br_mk3_coachModel[91].addBox(0F, 0F, 0F, 15, 1, 2, 0F); // 92
		br_mk3_coachModel[91].setRotationPoint(-39F, 3F, -1F);

		br_mk3_coachModel[92].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F, 0.5F, -0.1F, 0F, 0.5F, -0.1F, 0F, 0.5F, -0.1F, 0F, 0.5F, -0.1F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // 93
		br_mk3_coachModel[92].setRotationPoint(-32F, 0F, -1F);

		br_mk3_coachModel[93].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, 0F); // 94
		br_mk3_coachModel[93].setRotationPoint(-36F, 3F, -8F);

		br_mk3_coachModel[94].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, 0F); // 95
		br_mk3_coachModel[94].setRotationPoint(-29F, 3F, -8F);

		br_mk3_coachModel[95].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, 0F); // 96
		br_mk3_coachModel[95].setRotationPoint(-36F, 3F, 7F);

		br_mk3_coachModel[96].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, 0F); // 97
		br_mk3_coachModel[96].setRotationPoint(-29F, 3F, 7F);

		br_mk3_coachModel[97].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, 0.5F, 0.5F, -0.7F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0.5F, 0.5F, -0.7F, 0.5F, -0.5F, -0.7F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0.5F, -0.5F, -0.7F); // 98
		br_mk3_coachModel[97].setRotationPoint(-33F, 4F, -8F);

		br_mk3_coachModel[98].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, -0.5F, 0.5F, 0F, 0.5F, 0.5F, -0.7F, 0.5F, 0.5F, -0.7F, -0.5F, 0.5F, 0F, -0.5F, -0.5F, 0F, 0.5F, -0.5F, -0.7F, 0.5F, -0.5F, -0.7F, -0.5F, -0.5F, 0F); // 99
		br_mk3_coachModel[98].setRotationPoint(-32F, 4F, -8F);

		br_mk3_coachModel[99].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, 0.5F, 0.5F, -0.7F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0.5F, 0.5F, -0.7F, 0.5F, -0.5F, -0.7F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0.5F, -0.5F, -0.7F); // 100
		br_mk3_coachModel[99].setRotationPoint(-33F, 4F, 6F);

		br_mk3_coachModel[100].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, -0.5F, 0.5F, 0F, 0.5F, 0.5F, -0.7F, 0.5F, 0.5F, -0.7F, -0.5F, 0.5F, 0F, -0.5F, -0.5F, 0F, 0.5F, -0.5F, -0.7F, 0.5F, -0.5F, -0.7F, -0.5F, -0.5F, 0F); // 101
		br_mk3_coachModel[100].setRotationPoint(-32F, 4F, 6F);

		br_mk3_coachModel[101].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // 102
		br_mk3_coachModel[101].setRotationPoint(-32F, 3F, -8F);

		br_mk3_coachModel[102].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F); // 103
		br_mk3_coachModel[102].setRotationPoint(-32F, 3F, 7F);

		br_mk3_coachModel[103].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, 0.2F, 0.5F, 0F, 0.2F, 0.5F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // 104
		br_mk3_coachModel[103].setRotationPoint(-34F, 5F, -7F);

		br_mk3_coachModel[104].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0.5F, 0F, 0.2F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // 105
		br_mk3_coachModel[104].setRotationPoint(-34F, 5F, 6F);

		br_mk3_coachModel[105].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -0.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F); // 106
		br_mk3_coachModel[105].setRotationPoint(-41F, 3F, 7F);

		br_mk3_coachModel[106].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -0.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F); // 107
		br_mk3_coachModel[106].setRotationPoint(-24F, 3F, 7F);

		br_mk3_coachModel[107].addBox(0F, 0F, 0F, 1, 1, 14, 0F); // 108
		br_mk3_coachModel[107].setRotationPoint(-32F, 2F, -7F);

		br_mk3_coachModel[108].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F); // 109
		br_mk3_coachModel[108].setRotationPoint(-32F, 3F, -6F);

		br_mk3_coachModel[109].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // 110
		br_mk3_coachModel[109].setRotationPoint(-32F, 3F, 5F);

		br_mk3_coachModel[110].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // 111
		br_mk3_coachModel[110].setRotationPoint(-28F, 3F, -9F);

		br_mk3_coachModel[111].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F, 0F, -1.3F, -1F, 0.9F, -0.8F, -0.3F, 0.9F, -0.8F, -0.5F, 0F, -1.3F, 0.2F, 0F, -0.5F, -1F, 0.9F, -1F, -0.3F, 0.9F, -1F, -0.5F, 0F, -0.5F, 0.2F); // 112
		br_mk3_coachModel[111].setRotationPoint(-31F, 3F, -9F);

		br_mk3_coachModel[112].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.6F, 0F, -0.8F, -0.1F, 0F, -0.8F, -0.1F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -0.3F, -0.1F, 0F, -0.3F, -0.1F, 0F, -0.5F, -0.6F, 0F, -0.5F); // 113
		br_mk3_coachModel[112].setRotationPoint(-28F, 3F, -9F);

		br_mk3_coachModel[113].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // 114
		br_mk3_coachModel[113].setRotationPoint(-27F, 3F, 9F);
		br_mk3_coachModel[113].rotateAngleY = -3.14159265F;

		br_mk3_coachModel[114].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F, 0F, -0.8F, -0.3F, 0.9F, -1.3F, -1F, 0.9F, -1.3F, 0.2F, 0F, -0.8F, -0.5F, 0F, -1F, -0.3F, 0.9F, -0.5F, -1F, 0.9F, -0.5F, 0.2F, 0F, -1F, -0.5F); // 115
		br_mk3_coachModel[114].setRotationPoint(-27F, 3F, 9F);
		br_mk3_coachModel[114].rotateAngleY = -3.14159265F;

		br_mk3_coachModel[115].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.1F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, -0.3F, -0.6F, 0F, -0.3F, -0.6F, 0F, -0.5F, -0.1F, 0F, -0.5F); // 116
		br_mk3_coachModel[115].setRotationPoint(-27F, 3F, 9F);
		br_mk3_coachModel[115].rotateAngleY = -3.14159265F;

		br_mk3_coachModel[116].addBox(0F, 0F, 0F, 5, 5, 0, 0F); // 117
		br_mk3_coachModel[116].setRotationPoint(18F, 2F, -6F);

		br_mk3_coachModel[117].addBox(0F, 0F, 0F, 5, 5, 0, 0F); // 118
		br_mk3_coachModel[117].setRotationPoint(18F, 2F, 6F);

		br_mk3_coachModel[118].addBox(0F, 0F, 0F, 5, 5, 0, 0F); // 119
		br_mk3_coachModel[118].setRotationPoint(32F, 2F, -6F);

		br_mk3_coachModel[119].addBox(0F, 0F, 0F, 5, 5, 0, 0F); // 120
		br_mk3_coachModel[119].setRotationPoint(32F, 2F, 6F);

		br_mk3_coachModel[120].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 1F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 1F, 0F, 0F, 1F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 1F, 0.2F, 0F); // 121
		br_mk3_coachModel[120].setRotationPoint(18F, 2F, -8F);

		br_mk3_coachModel[121].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 1F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 1F, 0F, 0F, 1F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 1F, 0.2F, 0F); // 122
		br_mk3_coachModel[121].setRotationPoint(18F, 2F, 7F);

		br_mk3_coachModel[122].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, 0.2F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 1F, 0.2F, 0F, 1F, 0.2F, 0F, 0F, 0.2F, 0F); // 123
		br_mk3_coachModel[122].setRotationPoint(32F, 2F, -8F);

		br_mk3_coachModel[123].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, 0.2F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 1F, 0.2F, 0F, 1F, 0.2F, 0F, 0F, 0.2F, 0F); // 124
		br_mk3_coachModel[123].setRotationPoint(32F, 2F, 7F);

		br_mk3_coachModel[124].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F); // 125
		br_mk3_coachModel[124].setRotationPoint(23F, 2F, -8F);

		br_mk3_coachModel[125].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F); // 126
		br_mk3_coachModel[125].setRotationPoint(23F, 2F, 7F);

		br_mk3_coachModel[126].addShapeBox(0F, 0F, 0F, 1, 1, 16, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // 127
		br_mk3_coachModel[126].setRotationPoint(20F, 4F, -8F);

		br_mk3_coachModel[127].addShapeBox(0F, 0F, 0F, 1, 1, 16, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // 128
		br_mk3_coachModel[127].setRotationPoint(34F, 4F, -8F);

		br_mk3_coachModel[128].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0F, -0.2F); // 129
		br_mk3_coachModel[128].setRotationPoint(17F, 3F, -8F);

		br_mk3_coachModel[129].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0F, -0.2F); // 130
		br_mk3_coachModel[129].setRotationPoint(17F, 3F, 7F);

		br_mk3_coachModel[130].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.5F, 0F, -0.2F); // 131
		br_mk3_coachModel[130].setRotationPoint(37F, 3F, -8F);

		br_mk3_coachModel[131].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.5F, 0F, -0.2F); // 132
		br_mk3_coachModel[131].setRotationPoint(37F, 3F, 7F);

		br_mk3_coachModel[132].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.5F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, -0.5F, -0.5F, -0.2F); // 133
		br_mk3_coachModel[132].setRotationPoint(17F, 5F, -8F);

		br_mk3_coachModel[133].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.5F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, -0.5F, -0.5F, -0.2F); // 134
		br_mk3_coachModel[133].setRotationPoint(17F, 5F, 7F);

		br_mk3_coachModel[134].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -0.5F, -0.2F, -0.5F, -0.5F, -0.2F, -0.5F, -0.5F, -0.2F, 0F, -0.5F, -0.2F); // 135
		br_mk3_coachModel[134].setRotationPoint(34F, 5F, -8F);

		br_mk3_coachModel[135].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -0.5F, -0.2F, -0.5F, -0.5F, -0.2F, -0.5F, -0.5F, -0.2F, 0F, -0.5F, -0.2F); // 136
		br_mk3_coachModel[135].setRotationPoint(34F, 5F, 7F);

		br_mk3_coachModel[136].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -0.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F); // 137
		br_mk3_coachModel[136].setRotationPoint(18F, 3F, -8F);

		br_mk3_coachModel[137].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -0.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F); // 138
		br_mk3_coachModel[137].setRotationPoint(35F, 3F, -8F);

		br_mk3_coachModel[138].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 0F, -0.2F, 0F, 0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, 0.5F, -0.2F); // 139
		br_mk3_coachModel[138].setRotationPoint(21F, 4F, -8F);

		br_mk3_coachModel[139].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, -0.2F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, -0.5F, -0.2F); // 140
		br_mk3_coachModel[139].setRotationPoint(31F, 4F, -8F);

		br_mk3_coachModel[140].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 0F, -0.2F, 0F, 0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, 0.5F, -0.2F); // 141
		br_mk3_coachModel[140].setRotationPoint(21F, 4F, 7F);

		br_mk3_coachModel[141].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, -0.2F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, -0.5F, -0.2F); // 142
		br_mk3_coachModel[141].setRotationPoint(31F, 4F, 7F);

		br_mk3_coachModel[142].addShapeBox(0F, 0F, 0F, 1, 1, 14, 0F, 0F, -0.5F, 0.2F, -0.5F, -0.5F, 0.2F, -0.5F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, 0F, 0.2F, -0.5F, 0F, 0.2F, -0.5F, 0F, 0.2F, 0F, 0F, 0.2F); // 143
		br_mk3_coachModel[142].setRotationPoint(17F, 4F, -7F);

		br_mk3_coachModel[143].addShapeBox(0F, 0F, 0F, 1, 1, 14, 0F, -0.5F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, -0.5F, -0.5F, 0.2F, -0.5F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, -0.5F, 0F, 0.2F); // 144
		br_mk3_coachModel[143].setRotationPoint(37F, 4F, -7F);

		br_mk3_coachModel[144].addBox(0F, 0F, 0F, 15, 1, 2, 0F); // 145
		br_mk3_coachModel[144].setRotationPoint(20F, 3F, -1F);

		br_mk3_coachModel[145].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F, 0.5F, -0.1F, 0F, 0.5F, -0.1F, 0F, 0.5F, -0.1F, 0F, 0.5F, -0.1F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // 146
		br_mk3_coachModel[145].setRotationPoint(27F, 0F, -1F);

		br_mk3_coachModel[146].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, 0F); // 147
		br_mk3_coachModel[146].setRotationPoint(22F, 3F, -8F);

		br_mk3_coachModel[147].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, 0F); // 148
		br_mk3_coachModel[147].setRotationPoint(30F, 3F, -8F);

		br_mk3_coachModel[148].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, 0F); // 149
		br_mk3_coachModel[148].setRotationPoint(23F, 3F, 7F);

		br_mk3_coachModel[149].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, 0F); // 150
		br_mk3_coachModel[149].setRotationPoint(30F, 3F, 7F);

		br_mk3_coachModel[150].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, 0.5F, 0.5F, -0.7F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0.5F, 0.5F, -0.7F, 0.5F, -0.5F, -0.7F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0.5F, -0.5F, -0.7F); // 151
		br_mk3_coachModel[150].setRotationPoint(26F, 4F, -8F);

		br_mk3_coachModel[151].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, -0.5F, 0.5F, 0F, 0.5F, 0.5F, -0.7F, 0.5F, 0.5F, -0.7F, -0.5F, 0.5F, 0F, -0.5F, -0.5F, 0F, 0.5F, -0.5F, -0.7F, 0.5F, -0.5F, -0.7F, -0.5F, -0.5F, 0F); // 152
		br_mk3_coachModel[151].setRotationPoint(27F, 4F, -8F);

		br_mk3_coachModel[152].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, 0.5F, 0.5F, -0.7F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0.5F, 0.5F, -0.7F, 0.5F, -0.5F, -0.7F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0.5F, -0.5F, -0.7F); // 153
		br_mk3_coachModel[152].setRotationPoint(26F, 4F, 6F);

		br_mk3_coachModel[153].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, -0.5F, 0.5F, 0F, 0.5F, 0.5F, -0.7F, 0.5F, 0.5F, -0.7F, -0.5F, 0.5F, 0F, -0.5F, -0.5F, 0F, 0.5F, -0.5F, -0.7F, 0.5F, -0.5F, -0.7F, -0.5F, -0.5F, 0F); // 154
		br_mk3_coachModel[153].setRotationPoint(27F, 4F, 6F);

		br_mk3_coachModel[154].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // 155
		br_mk3_coachModel[154].setRotationPoint(27F, 3F, -8F);

		br_mk3_coachModel[155].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F); // 156
		br_mk3_coachModel[155].setRotationPoint(27F, 3F, 7F);

		br_mk3_coachModel[156].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, 0.2F, 0.5F, 0F, 0.2F, 0.5F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // 157
		br_mk3_coachModel[156].setRotationPoint(25F, 5F, -7F);

		br_mk3_coachModel[157].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0.5F, 0F, 0.2F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // 158
		br_mk3_coachModel[157].setRotationPoint(25F, 5F, 6F);

		br_mk3_coachModel[158].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -0.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F); // 159
		br_mk3_coachModel[158].setRotationPoint(18F, 3F, 7F);

		br_mk3_coachModel[159].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -0.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F); // 160
		br_mk3_coachModel[159].setRotationPoint(35F, 3F, 7F);

		br_mk3_coachModel[160].addBox(0F, 0F, 0F, 1, 1, 14, 0F); // 161
		br_mk3_coachModel[160].setRotationPoint(27F, 2F, -7F);

		br_mk3_coachModel[161].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F); // 162
		br_mk3_coachModel[161].setRotationPoint(27F, 3F, -6F);

		br_mk3_coachModel[162].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // 163
		br_mk3_coachModel[162].setRotationPoint(27F, 3F, 5F);

		br_mk3_coachModel[163].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // 164
		br_mk3_coachModel[163].setRotationPoint(24F, 3F, 9F);
		br_mk3_coachModel[163].rotateAngleY = -3.14159265F;

		br_mk3_coachModel[164].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F, 0F, -1.3F, -1F, 0.9F, -0.8F, -0.3F, 0.9F, -0.8F, -0.5F, 0F, -1.3F, 0.2F, 0F, -0.5F, -1F, 0.9F, -1F, -0.3F, 0.9F, -1F, -0.5F, 0F, -0.5F, 0.2F); // 165
		br_mk3_coachModel[164].setRotationPoint(27F, 3F, 9F);
		br_mk3_coachModel[164].rotateAngleY = -3.14159265F;

		br_mk3_coachModel[165].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.6F, 0F, -0.8F, -0.1F, 0F, -0.8F, -0.1F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -0.3F, -0.1F, 0F, -0.3F, -0.1F, 0F, -0.5F, -0.6F, 0F, -0.5F); // 166
		br_mk3_coachModel[165].setRotationPoint(24F, 3F, 9F);
		br_mk3_coachModel[165].rotateAngleY = -3.14159265F;

		br_mk3_coachModel[166].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // 167
		br_mk3_coachModel[166].setRotationPoint(23F, 3F, -9F);

		br_mk3_coachModel[167].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F, 0F, -0.8F, -0.3F, 0.9F, -1.3F, -1F, 0.9F, -1.3F, 0.2F, 0F, -0.8F, -0.5F, 0F, -1F, -0.3F, 0.9F, -0.5F, -1F, 0.9F, -0.5F, 0.2F, 0F, -1F, -0.5F); // 168
		br_mk3_coachModel[167].setRotationPoint(23F, 3F, -9F);

		br_mk3_coachModel[168].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.1F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, -0.3F, -0.6F, 0F, -0.3F, -0.6F, 0F, -0.5F, -0.1F, 0F, -0.5F); // 169
		br_mk3_coachModel[168].setRotationPoint(23F, 3F, -9F);

		br_mk3_coachModel[169].addShapeBox(0F, 0F, 0F, 36, 5, 20, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, -1F, 0F, -2F, -1F, 0F, -2F, -1F, 0F, -2F, -1F, 0F, -2F); // Box 169
		br_mk3_coachModel[169].setRotationPoint(-20F, 0F, -10F);

		br_mk3_coachModel[170].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, 0F, -0.1F, -0.5F, -0.8F, -0.1F, -0.5F, -0.8F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, -0.8F, -0.8F, 0F, -0.8F, -0.8F, 0F, 0F, 0F, 0F, 0F); // Box 171
		br_mk3_coachModel[170].setRotationPoint(-45F, 0F, -9F);

		br_mk3_coachModel[171].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, -0.8F, -0.1F, -0.5F, 0F, -0.1F, -0.5F, 0F, -0.1F, 0F, -0.8F, -0.1F, 0F, -0.8F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, -0.8F, 0F, 0F); // Box 171
		br_mk3_coachModel[171].setRotationPoint(-44F, 0F, -9F);

		br_mk3_coachModel[172].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 173
		br_mk3_coachModel[172].setRotationPoint(-45F, 4F, -9F);

		br_mk3_coachModel[173].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, -0.6F, -0.7F, 0F, -0.6F, -0.7F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 173
		br_mk3_coachModel[173].setRotationPoint(-45F, 2F, -9F);

		br_mk3_coachModel[174].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, 0F, -0.1F, -0.5F, -0.8F, -0.1F, -0.5F, -0.8F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, -0.8F, -0.8F, 0F, -0.8F, -0.8F, 0F, 0F, 0F, 0F, 0F); // Box 171
		br_mk3_coachModel[174].setRotationPoint(41F, 0F, 9F);
		br_mk3_coachModel[174].rotateAngleY = -3.14159265F;

		br_mk3_coachModel[175].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, -0.8F, -0.1F, -0.5F, 0F, -0.1F, -0.5F, 0F, -0.1F, 0F, -0.8F, -0.1F, 0F, -0.8F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, -0.8F, 0F, 0F); // Box 171
		br_mk3_coachModel[175].setRotationPoint(40F, 0F, 9F);
		br_mk3_coachModel[175].rotateAngleY = -3.14159265F;

		br_mk3_coachModel[176].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 173
		br_mk3_coachModel[176].setRotationPoint(41F, 4F, 9F);
		br_mk3_coachModel[176].rotateAngleY = -3.14159265F;

		br_mk3_coachModel[177].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, -0.6F, -0.7F, 0F, -0.6F, -0.7F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 173
		br_mk3_coachModel[177].setRotationPoint(41F, 2F, 9F);
		br_mk3_coachModel[177].rotateAngleY = -3.14159265F;

		br_mk3_coachModel[178].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F, -0.5F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.2F, 0.5F, 0F, -0.2F, 0.5F, 0F, -0.2F, -0.5F, -0.5F, -0.2F, -0.5F); // Box 179
		br_mk3_coachModel[178].setRotationPoint(-48F, 1F, 8F);

		br_mk3_coachModel[179].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, -1.3F, 0.2F, 0F, 0.7F, 0.2F, 0F, 0.7F, -1F, 0F, -1.3F, -1F, 0F, -0.5F, 0.2F, 0F, -2.5F, 0.2F, 0F, -2.5F, -1F, 0F, -0.5F, -1F); // Box 179
		br_mk3_coachModel[179].setRotationPoint(-45F, 1F, 8F);

		br_mk3_coachModel[180].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F, -0.5F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.2F, 0.5F, 0F, -0.2F, 0.5F, 0F, -0.2F, -0.5F, -0.5F, -0.2F, -0.5F); // Box 179
		br_mk3_coachModel[180].setRotationPoint(44F, 1F, -8F);
		br_mk3_coachModel[180].rotateAngleY = -3.14159265F;

		br_mk3_coachModel[181].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, -1.3F, 0.2F, 0F, 0.7F, 0.2F, 0F, 0.7F, -1F, 0F, -1.3F, -1F, 0F, -0.5F, 0.2F, 0F, -2.5F, 0.2F, 0F, -2.5F, -1F, 0F, -0.5F, -1F); // Box 179
		br_mk3_coachModel[181].setRotationPoint(41F, 1F, -8F);
		br_mk3_coachModel[181].rotateAngleY = -3.14159265F;

		br_mk3_coachModel[182].addShapeBox(0F, 0F, 0F, 1, 3, 22, 0F, 0F, 0F, -0.1F, -0.8F, 0F, -0.1F, -0.8F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.5F, -0.8F, 0F, -0.5F, -0.8F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 170
		br_mk3_coachModel[182].setRotationPoint(-42F, -3F, -11F);

		br_mk3_coachModel[183].addShapeBox(0F, 0F, 0F, 1, 14, 22, 0F, 0F, 0F, -0.1F, -0.8F, 0F, -0.1F, -0.8F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, -0.8F, 0F, -0.1F, -0.8F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 170
		br_mk3_coachModel[183].setRotationPoint(-42F, -17F, -11F);

		br_mk3_coachModel[184].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F, 0F, 0F, -1.1F, -0.8F, 0F, -1.1F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, -0.8F, 0F, -0.1F, -0.8F, 0F, 0F, 0F, 0F, 0F); // Box 170
		br_mk3_coachModel[184].setRotationPoint(-42F, -18F, -11F);

		br_mk3_coachModel[185].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F, 0F, 0F, -3.1F, -0.8F, 0F, -3.1F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, -0.8F, 0F, -0.1F, -0.8F, 0F, 0F, 0F, 0F, 0F); // Box 170
		br_mk3_coachModel[185].setRotationPoint(-42F, -20F, -10F);

		br_mk3_coachModel[186].addShapeBox(0F, 0F, 0F, 1, 2, 14, 0F, 0F, -0.05F, -6.1F, -0.8F, -0.05F, -6.1F, -0.8F, -0.05F, -6.1F, 0F, -0.05F, -6.1F, 0F, 0F, -0.1F, -0.8F, 0F, -0.1F, -0.8F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 170
		br_mk3_coachModel[186].setRotationPoint(-42F, -22F, -7F);

		br_mk3_coachModel[187].addShapeBox(0F, 0F, 0F, 1, 3, 22, 0F, -0.8F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, -0.8F, 0F, -0.1F, -0.8F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.8F, 0F, -0.5F); // Box 170
		br_mk3_coachModel[187].setRotationPoint(37F, -3F, -11F);

		br_mk3_coachModel[188].addShapeBox(0F, 0F, 0F, 1, 14, 22, 0F, -0.8F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, -0.8F, 0F, -0.1F, -0.8F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, -0.8F, 0F, -0.1F); // Box 170
		br_mk3_coachModel[188].setRotationPoint(37F, -17F, -11F);

		br_mk3_coachModel[189].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F, -0.8F, 0F, -1.1F, 0F, 0F, -1.1F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, -0.8F, 0F, 0F); // Box 170
		br_mk3_coachModel[189].setRotationPoint(37F, -18F, -11F);

		br_mk3_coachModel[190].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F, -0.8F, 0F, -3.1F, 0F, 0F, -3.1F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, -0.8F, 0F, 0F); // Box 170
		br_mk3_coachModel[190].setRotationPoint(37F, -20F, -10F);

		br_mk3_coachModel[191].addShapeBox(0F, 0F, 0F, 1, 2, 14, 0F, -0.8F, -0.05F, -6.1F, 0F, -0.05F, -6.1F, 0F, -0.05F, -6.1F, -0.8F, -0.05F, -6.1F, -0.8F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, -0.8F, 0F, -0.1F); // Box 170
		br_mk3_coachModel[191].setRotationPoint(37F, -22F, -7F);

		br_mk3_coachModel[192].addShapeBox(0F, 0F, 0F, 4, 1, 8, 0F, 0F, 0F, -0.3F, 0.1F, 0F, -0.3F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 170
		br_mk3_coachModel[192].setRotationPoint(-38F, -4F, -11F);

		br_mk3_coachModel[193].addShapeBox(0F, 0F, 0F, 1, 8, 8, 0F, -1F, 0F, -0.3F, 0.5F, 0F, -0.3F, 0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 170
		br_mk3_coachModel[193].setRotationPoint(-34F, -11F, -11F);

		br_mk3_coachModel[194].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 170
		br_mk3_coachModel[194].setRotationPoint(-36F, -3F, -9F);

		br_mk3_coachModel[195].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 170
		br_mk3_coachModel[195].setRotationPoint(-36F, -3F, -6F);

		br_mk3_coachModel[196].addShapeBox(0F, 0F, 0F, 4, 1, 8, 0F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 170
		br_mk3_coachModel[196].setRotationPoint(-38F, -4F, 3F);

		br_mk3_coachModel[197].addShapeBox(0F, 0F, 0F, 1, 8, 8, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.3F, -1F, 0F, -0.3F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 170
		br_mk3_coachModel[197].setRotationPoint(-34F, -11F, 3F);

		br_mk3_coachModel[198].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 170
		br_mk3_coachModel[198].setRotationPoint(-36F, -3F, 5F);

		br_mk3_coachModel[199].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 170
		br_mk3_coachModel[199].setRotationPoint(-36F, -3F, 8F);

		br_mk3_coachModel[200].addShapeBox(0F, 0F, 0F, 4, 1, 8, 0F, 0F, 0F, -0.3F, 0.1F, 0F, -0.3F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 170
		br_mk3_coachModel[200].setRotationPoint(-29F, -4F, -11F);

		br_mk3_coachModel[201].addShapeBox(0F, 0F, 0F, 1, 8, 8, 0F, -1F, 0F, -0.3F, 0.5F, 0F, -0.3F, 0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 170
		br_mk3_coachModel[201].setRotationPoint(-25F, -11F, -11F);

		br_mk3_coachModel[202].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 170
		br_mk3_coachModel[202].setRotationPoint(-27F, -3F, -9F);

		br_mk3_coachModel[203].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 170
		br_mk3_coachModel[203].setRotationPoint(-27F, -3F, -6F);

		br_mk3_coachModel[204].addShapeBox(0F, 0F, 0F, 4, 1, 8, 0F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 170
		br_mk3_coachModel[204].setRotationPoint(-29F, -4F, 3F);

		br_mk3_coachModel[205].addShapeBox(0F, 0F, 0F, 1, 8, 8, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.3F, -1F, 0F, -0.3F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 170
		br_mk3_coachModel[205].setRotationPoint(-25F, -11F, 3F);

		br_mk3_coachModel[206].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 170
		br_mk3_coachModel[206].setRotationPoint(-27F, -3F, 5F);

		br_mk3_coachModel[207].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 170
		br_mk3_coachModel[207].setRotationPoint(-27F, -3F, 8F);

		br_mk3_coachModel[208].addShapeBox(0F, 0F, 0F, 4, 1, 8, 0F, 0F, 0F, -0.3F, 0.1F, 0F, -0.3F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 170
		br_mk3_coachModel[208].setRotationPoint(-20F, -4F, -11F);

		br_mk3_coachModel[209].addShapeBox(0F, 0F, 0F, 1, 8, 8, 0F, -1F, 0F, -0.3F, 0.5F, 0F, -0.3F, 0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 170
		br_mk3_coachModel[209].setRotationPoint(-16F, -11F, -11F);

		br_mk3_coachModel[210].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 170
		br_mk3_coachModel[210].setRotationPoint(-18F, -3F, -9F);

		br_mk3_coachModel[211].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 170
		br_mk3_coachModel[211].setRotationPoint(-18F, -3F, -6F);

		br_mk3_coachModel[212].addShapeBox(0F, 0F, 0F, 4, 1, 8, 0F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 170
		br_mk3_coachModel[212].setRotationPoint(-20F, -4F, 3F);

		br_mk3_coachModel[213].addShapeBox(0F, 0F, 0F, 1, 8, 8, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.3F, -1F, 0F, -0.3F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 170
		br_mk3_coachModel[213].setRotationPoint(-16F, -11F, 3F);

		br_mk3_coachModel[214].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 170
		br_mk3_coachModel[214].setRotationPoint(-18F, -3F, 5F);

		br_mk3_coachModel[215].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 170
		br_mk3_coachModel[215].setRotationPoint(-18F, -3F, 8F);

		br_mk3_coachModel[216].addShapeBox(0F, 0F, 0F, 4, 1, 8, 0F, 0F, 0F, -0.3F, 0.1F, 0F, -0.3F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 170
		br_mk3_coachModel[216].setRotationPoint(-11F, -4F, -11F);

		br_mk3_coachModel[217].addShapeBox(0F, 0F, 0F, 1, 8, 8, 0F, -1F, 0F, -0.3F, 0.5F, 0F, -0.3F, 0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 170
		br_mk3_coachModel[217].setRotationPoint(-7F, -11F, -11F);

		br_mk3_coachModel[218].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 170
		br_mk3_coachModel[218].setRotationPoint(-9F, -3F, -9F);

		br_mk3_coachModel[219].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 170
		br_mk3_coachModel[219].setRotationPoint(-9F, -3F, -6F);

		br_mk3_coachModel[220].addShapeBox(0F, 0F, 0F, 4, 1, 8, 0F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 170
		br_mk3_coachModel[220].setRotationPoint(-11F, -4F, 3F);

		br_mk3_coachModel[221].addShapeBox(0F, 0F, 0F, 1, 8, 8, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.3F, -1F, 0F, -0.3F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 170
		br_mk3_coachModel[221].setRotationPoint(-7F, -11F, 3F);

		br_mk3_coachModel[222].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 170
		br_mk3_coachModel[222].setRotationPoint(-9F, -3F, 5F);

		br_mk3_coachModel[223].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 170
		br_mk3_coachModel[223].setRotationPoint(-9F, -3F, 8F);

		br_mk3_coachModel[224].addShapeBox(0F, 0F, 0F, 4, 1, 8, 0F, 0F, 0F, -0.3F, 0.1F, 0F, -0.3F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 170
		br_mk3_coachModel[224].setRotationPoint(0F, -4F, -11F);

		br_mk3_coachModel[225].addShapeBox(0F, 0F, 0F, 1, 8, 8, 0F, -1F, 0F, -0.3F, 0.5F, 0F, -0.3F, 0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 170
		br_mk3_coachModel[225].setRotationPoint(4F, -11F, -11F);

		br_mk3_coachModel[226].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 170
		br_mk3_coachModel[226].setRotationPoint(2F, -3F, -9F);

		br_mk3_coachModel[227].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 170
		br_mk3_coachModel[227].setRotationPoint(2F, -3F, -6F);

		br_mk3_coachModel[228].addShapeBox(0F, 0F, 0F, 4, 1, 8, 0F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 170
		br_mk3_coachModel[228].setRotationPoint(0F, -4F, 3F);

		br_mk3_coachModel[229].addShapeBox(0F, 0F, 0F, 1, 8, 8, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.3F, -1F, 0F, -0.3F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 170
		br_mk3_coachModel[229].setRotationPoint(4F, -11F, 3F);

		br_mk3_coachModel[230].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 170
		br_mk3_coachModel[230].setRotationPoint(2F, -3F, 5F);

		br_mk3_coachModel[231].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 170
		br_mk3_coachModel[231].setRotationPoint(2F, -3F, 8F);

		br_mk3_coachModel[232].addShapeBox(0F, 0F, 0F, 4, 1, 8, 0F, 0F, 0F, -0.3F, 0.1F, 0F, -0.3F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 170
		br_mk3_coachModel[232].setRotationPoint(9F, -4F, -11F);

		br_mk3_coachModel[233].addShapeBox(0F, 0F, 0F, 1, 8, 8, 0F, -1F, 0F, -0.3F, 0.5F, 0F, -0.3F, 0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 170
		br_mk3_coachModel[233].setRotationPoint(13F, -11F, -11F);

		br_mk3_coachModel[234].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 170
		br_mk3_coachModel[234].setRotationPoint(11F, -3F, -9F);

		br_mk3_coachModel[235].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 170
		br_mk3_coachModel[235].setRotationPoint(11F, -3F, -6F);

		br_mk3_coachModel[236].addShapeBox(0F, 0F, 0F, 4, 1, 8, 0F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 170
		br_mk3_coachModel[236].setRotationPoint(9F, -4F, 3F);

		br_mk3_coachModel[237].addShapeBox(0F, 0F, 0F, 1, 8, 8, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.3F, -1F, 0F, -0.3F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 170
		br_mk3_coachModel[237].setRotationPoint(13F, -11F, 3F);

		br_mk3_coachModel[238].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 170
		br_mk3_coachModel[238].setRotationPoint(11F, -3F, 5F);

		br_mk3_coachModel[239].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 170
		br_mk3_coachModel[239].setRotationPoint(11F, -3F, 8F);

		br_mk3_coachModel[240].addShapeBox(0F, 0F, 0F, 4, 1, 8, 0F, 0F, 0F, -0.3F, 0.1F, 0F, -0.3F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 170
		br_mk3_coachModel[240].setRotationPoint(18F, -4F, -11F);

		br_mk3_coachModel[241].addShapeBox(0F, 0F, 0F, 1, 8, 8, 0F, -1F, 0F, -0.3F, 0.5F, 0F, -0.3F, 0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 170
		br_mk3_coachModel[241].setRotationPoint(22F, -11F, -11F);

		br_mk3_coachModel[242].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 170
		br_mk3_coachModel[242].setRotationPoint(20F, -3F, -9F);

		br_mk3_coachModel[243].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 170
		br_mk3_coachModel[243].setRotationPoint(20F, -3F, -6F);

		br_mk3_coachModel[244].addShapeBox(0F, 0F, 0F, 4, 1, 8, 0F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 170
		br_mk3_coachModel[244].setRotationPoint(18F, -4F, 3F);

		br_mk3_coachModel[245].addShapeBox(0F, 0F, 0F, 1, 8, 8, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.3F, -1F, 0F, -0.3F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 170
		br_mk3_coachModel[245].setRotationPoint(22F, -11F, 3F);

		br_mk3_coachModel[246].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 170
		br_mk3_coachModel[246].setRotationPoint(20F, -3F, 5F);

		br_mk3_coachModel[247].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 170
		br_mk3_coachModel[247].setRotationPoint(20F, -3F, 8F);

		br_mk3_coachModel[248].addShapeBox(0F, 0F, 0F, 4, 1, 8, 0F, 0F, 0F, -0.3F, 0.1F, 0F, -0.3F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 170
		br_mk3_coachModel[248].setRotationPoint(27F, -4F, -11F);

		br_mk3_coachModel[249].addShapeBox(0F, 0F, 0F, 1, 8, 8, 0F, -1F, 0F, -0.3F, 0.5F, 0F, -0.3F, 0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 170
		br_mk3_coachModel[249].setRotationPoint(31F, -11F, -11F);

		br_mk3_coachModel[250].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 170
		br_mk3_coachModel[250].setRotationPoint(29F, -3F, -9F);

		br_mk3_coachModel[251].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 170
		br_mk3_coachModel[251].setRotationPoint(29F, -3F, -6F);

		br_mk3_coachModel[252].addShapeBox(0F, 0F, 0F, 4, 1, 8, 0F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 170
		br_mk3_coachModel[252].setRotationPoint(27F, -4F, 3F);

		br_mk3_coachModel[253].addShapeBox(0F, 0F, 0F, 1, 8, 8, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.3F, -1F, 0F, -0.3F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 170
		br_mk3_coachModel[253].setRotationPoint(31F, -11F, 3F);

		br_mk3_coachModel[254].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 170
		br_mk3_coachModel[254].setRotationPoint(29F, -3F, 5F);

		br_mk3_coachModel[255].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 170
		br_mk3_coachModel[255].setRotationPoint(29F, -3F, 8F);

		br_mk3_coachModel[256].addShapeBox(0F, 0F, 0F, 80, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.05F, 0F, 0F, -0.05F); // Box 170
		br_mk3_coachModel[256].setRotationPoint(-42F, -16F, 8F);

		br_mk3_coachModel[257].addShapeBox(0F, 0F, 0F, 80, 1, 3, 0F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 170
		br_mk3_coachModel[257].setRotationPoint(-42F, -16F, -11F);

		br_mk3_coachModel[258].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F, -0.8F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, -0.8F, 0F, 0F); // Box 170
		br_mk3_coachModel[258].setRotationPoint(-4F, -3F, -11F);

		br_mk3_coachModel[259].addShapeBox(0F, 0F, 0F, 1, 14, 4, 0F, -0.8F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 2.9F, 0F, -0.8F, 2.9F, 0F, -0.8F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, -0.8F, 0F, 0F); // Box 170
		br_mk3_coachModel[259].setRotationPoint(-4F, -17F, -11F);

		br_mk3_coachModel[260].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, -0.8F, 0F, -0.1F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F); // Box 170
		br_mk3_coachModel[260].setRotationPoint(-4F, -3F, 7F);

		br_mk3_coachModel[261].addShapeBox(0F, 0F, 0F, 1, 14, 4, 0F, -0.8F, 2.9F, 0F, 0F, 2.9F, 0F, 0F, 0F, -0.1F, -0.8F, 0F, -0.1F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, -0.8F, 0F, -0.1F); // Box 170
		br_mk3_coachModel[261].setRotationPoint(-4F, -17F, 7F);

		br_mk3_coachModel[262].addShapeBox(0F, 0F, 0F, 80, 1, 10, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 170
		br_mk3_coachModel[262].setRotationPoint(-42F, -21F, -5F);

		br_mk3_coachModel[263].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 2.9F, 0F, 0F, 2.9F); // Box 170
		br_mk3_coachModel[263].setRotationPoint(-42F, -20F, 4F);

		br_mk3_coachModel[264].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F); // Box 170
		br_mk3_coachModel[264].setRotationPoint(-42F, -20F, -4F);

		br_mk3_coachModel[265].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, -1.1F, 0F, 0F, -1.1F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 170
		br_mk3_coachModel[265].setRotationPoint(-42F, -18F, 4F);

		br_mk3_coachModel[266].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F); // Box 170
		br_mk3_coachModel[266].setRotationPoint(-42F, -18F, -4F);

		br_mk3_coachModel[267].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.1F, -0.8F, 0F, -1.1F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, -0.8F, 0F, -0.1F); // Box 170
		br_mk3_coachModel[267].setRotationPoint(37F, -18F, 4F);

		br_mk3_coachModel[268].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F); // Box 170
		br_mk3_coachModel[268].setRotationPoint(37F, -18F, -4F);

		br_mk3_coachModel[269].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F); // Box 170
		br_mk3_coachModel[269].setRotationPoint(37F, -20F, -4F);

		br_mk3_coachModel[270].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.1F, -0.8F, 0F, -3.1F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, -0.8F, 0F, -0.1F); // Box 170
		br_mk3_coachModel[270].setRotationPoint(37F, -20F, 4F);


	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		for(int i = 0; i < 271; i++)
		{
			br_mk3_coachModel[i].render(f5);
		}
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
	{
	}

	public ModelRendererTurbo br_mk3_coachModel[];
}