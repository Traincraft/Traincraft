//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2021 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 12.08.2021 - 04:26:31
// Last changed on: 12.08.2021 - 04:26:31

package train.client.render.models; //Path where the model is located

import tmt.ModelConverter;
import tmt.ModelRendererTurbo;

import java.util.ArrayList;

public class ModelClass158 extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelClass158() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[235];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // 01
		bodyModel[1] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // 02
		bodyModel[2] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // 03
		bodyModel[3] = new ModelRendererTurbo(this, 193, 25, textureX, textureY); // 04
		bodyModel[4] = new ModelRendererTurbo(this, 193, 33, textureX, textureY); // 05
		bodyModel[5] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // 06
		bodyModel[6] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // 07
		bodyModel[7] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // 08
		bodyModel[8] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // 09
		bodyModel[9] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // 10
		bodyModel[10] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // 11
		bodyModel[11] = new ModelRendererTurbo(this, 193, 41, textureX, textureY); // 12
		bodyModel[12] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // 13
		bodyModel[13] = new ModelRendererTurbo(this, 193, 49, textureX, textureY); // 14
		bodyModel[14] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // 15
		bodyModel[15] = new ModelRendererTurbo(this, 209, 57, textureX, textureY); // 16
		bodyModel[16] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // 17
		bodyModel[17] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // 18
		bodyModel[18] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // 19
		bodyModel[19] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // 20
		bodyModel[20] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // 21
		bodyModel[21] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // 22
		bodyModel[22] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // 23
		bodyModel[23] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // 24
		bodyModel[24] = new ModelRendererTurbo(this, 473, 9, textureX, textureY); // 25
		bodyModel[25] = new ModelRendererTurbo(this, 497, 9, textureX, textureY); // 26
		bodyModel[26] = new ModelRendererTurbo(this, 409, 17, textureX, textureY); // 27
		bodyModel[27] = new ModelRendererTurbo(this, 417, 17, textureX, textureY); // 28
		bodyModel[28] = new ModelRendererTurbo(this, 433, 17, textureX, textureY); // 29
		bodyModel[29] = new ModelRendererTurbo(this, 441, 17, textureX, textureY); // 30
		bodyModel[30] = new ModelRendererTurbo(this, 449, 17, textureX, textureY); // 31
		bodyModel[31] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // 32
		bodyModel[32] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // 33
		bodyModel[33] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // 34
		bodyModel[34] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // 35
		bodyModel[35] = new ModelRendererTurbo(this, 473, 17, textureX, textureY); // 36
		bodyModel[36] = new ModelRendererTurbo(this, 385, 25, textureX, textureY); // 37
		bodyModel[37] = new ModelRendererTurbo(this, 449, 25, textureX, textureY); // 38
		bodyModel[38] = new ModelRendererTurbo(this, 457, 25, textureX, textureY); // 39
		bodyModel[39] = new ModelRendererTurbo(this, 409, 41, textureX, textureY); // 40
		bodyModel[40] = new ModelRendererTurbo(this, 481, 25, textureX, textureY); // 41
		bodyModel[41] = new ModelRendererTurbo(this, 393, 41, textureX, textureY); // 42
		bodyModel[42] = new ModelRendererTurbo(this, 505, 17, textureX, textureY); // 43
		bodyModel[43] = new ModelRendererTurbo(this, 481, 33, textureX, textureY); // 44
		bodyModel[44] = new ModelRendererTurbo(this, 433, 41, textureX, textureY); // 45
		bodyModel[45] = new ModelRendererTurbo(this, 505, 33, textureX, textureY); // 46
		bodyModel[46] = new ModelRendererTurbo(this, 449, 49, textureX, textureY); // 47
		bodyModel[47] = new ModelRendererTurbo(this, 465, 49, textureX, textureY); // 48
		bodyModel[48] = new ModelRendererTurbo(this, 481, 49, textureX, textureY); // 49
		bodyModel[49] = new ModelRendererTurbo(this, 497, 49, textureX, textureY); // 50
		bodyModel[50] = new ModelRendererTurbo(this, 209, 65, textureX, textureY); // 51
		bodyModel[51] = new ModelRendererTurbo(this, 185, 57, textureX, textureY); // 52
		bodyModel[52] = new ModelRendererTurbo(this, 465, 17, textureX, textureY); // 53
		bodyModel[53] = new ModelRendererTurbo(this, 209, 65, textureX, textureY); // 54
		bodyModel[54] = new ModelRendererTurbo(this, 265, 65, textureX, textureY); // 55
		bodyModel[55] = new ModelRendererTurbo(this, 305, 65, textureX, textureY); // 56
		bodyModel[56] = new ModelRendererTurbo(this, 249, 65, textureX, textureY); // 57
		bodyModel[57] = new ModelRendererTurbo(this, 265, 65, textureX, textureY); // 58
		bodyModel[58] = new ModelRendererTurbo(this, 385, 41, textureX, textureY); // 59
		bodyModel[59] = new ModelRendererTurbo(this, 409, 41, textureX, textureY); // 60
		bodyModel[60] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // 61
		bodyModel[61] = new ModelRendererTurbo(this, 465, 25, textureX, textureY); // 62
		bodyModel[62] = new ModelRendererTurbo(this, 337, 65, textureX, textureY); // 63
		bodyModel[63] = new ModelRendererTurbo(this, 361, 65, textureX, textureY); // 64
		bodyModel[64] = new ModelRendererTurbo(this, 369, 65, textureX, textureY); // 65
		bodyModel[65] = new ModelRendererTurbo(this, 409, 65, textureX, textureY); // 66
		bodyModel[66] = new ModelRendererTurbo(this, 305, 65, textureX, textureY); // 67
		bodyModel[67] = new ModelRendererTurbo(this, 393, 65, textureX, textureY); // 68
		bodyModel[68] = new ModelRendererTurbo(this, 409, 65, textureX, textureY); // 69
		bodyModel[69] = new ModelRendererTurbo(this, 441, 65, textureX, textureY); // 70
		bodyModel[70] = new ModelRendererTurbo(this, 441, 65, textureX, textureY); // 71
		bodyModel[71] = new ModelRendererTurbo(this, 473, 65, textureX, textureY); // 72
		bodyModel[72] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // 73
		bodyModel[73] = new ModelRendererTurbo(this, 201, 57, textureX, textureY); // 74
		bodyModel[74] = new ModelRendererTurbo(this, 201, 65, textureX, textureY); // 75
		bodyModel[75] = new ModelRendererTurbo(this, 465, 65, textureX, textureY); // 76
		bodyModel[76] = new ModelRendererTurbo(this, 497, 65, textureX, textureY); // 77
		bodyModel[77] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // 78
		bodyModel[78] = new ModelRendererTurbo(this, 25, 73, textureX, textureY); // 79
		bodyModel[79] = new ModelRendererTurbo(this, 489, 17, textureX, textureY); // 80
		bodyModel[80] = new ModelRendererTurbo(this, 385, 25, textureX, textureY); // 81
		bodyModel[81] = new ModelRendererTurbo(this, 401, 25, textureX, textureY); // 82
		bodyModel[82] = new ModelRendererTurbo(this, 449, 25, textureX, textureY); // 83
		bodyModel[83] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // 84
		bodyModel[84] = new ModelRendererTurbo(this, 417, 17, textureX, textureY); // 85
		bodyModel[85] = new ModelRendererTurbo(this, 449, 17, textureX, textureY); // 86
		bodyModel[86] = new ModelRendererTurbo(this, 481, 25, textureX, textureY); // 87
		bodyModel[87] = new ModelRendererTurbo(this, 481, 33, textureX, textureY); // 88
		bodyModel[88] = new ModelRendererTurbo(this, 497, 33, textureX, textureY); // 89
		bodyModel[89] = new ModelRendererTurbo(this, 433, 41, textureX, textureY); // 90
		bodyModel[90] = new ModelRendererTurbo(this, 449, 41, textureX, textureY); // 91
		bodyModel[91] = new ModelRendererTurbo(this, 41, 73, textureX, textureY); // 92
		bodyModel[92] = new ModelRendererTurbo(this, 57, 73, textureX, textureY); // 93
		bodyModel[93] = new ModelRendererTurbo(this, 73, 73, textureX, textureY); // 94
		bodyModel[94] = new ModelRendererTurbo(this, 89, 73, textureX, textureY); // 95
		bodyModel[95] = new ModelRendererTurbo(this, 105, 73, textureX, textureY); // 96
		bodyModel[96] = new ModelRendererTurbo(this, 121, 73, textureX, textureY); // 97
		bodyModel[97] = new ModelRendererTurbo(this, 161, 73, textureX, textureY); // 98
		bodyModel[98] = new ModelRendererTurbo(this, 417, 49, textureX, textureY); // 99
		bodyModel[99] = new ModelRendererTurbo(this, 305, 73, textureX, textureY); // 100
		bodyModel[100] = new ModelRendererTurbo(this, 465, 49, textureX, textureY); // 101
		bodyModel[101] = new ModelRendererTurbo(this, 369, 73, textureX, textureY); // 102
		bodyModel[102] = new ModelRendererTurbo(this, 393, 73, textureX, textureY); // 103
		bodyModel[103] = new ModelRendererTurbo(this, 409, 73, textureX, textureY); // 104
		bodyModel[104] = new ModelRendererTurbo(this, 441, 73, textureX, textureY); // 105
		bodyModel[105] = new ModelRendererTurbo(this, 161, 73, textureX, textureY); // 106
		bodyModel[106] = new ModelRendererTurbo(this, 33, 81, textureX, textureY); // 107
		bodyModel[107] = new ModelRendererTurbo(this, 49, 81, textureX, textureY); // 108
		bodyModel[108] = new ModelRendererTurbo(this, 185, 73, textureX, textureY); // 109
		bodyModel[109] = new ModelRendererTurbo(this, 465, 73, textureX, textureY); // 110
		bodyModel[110] = new ModelRendererTurbo(this, 497, 73, textureX, textureY); // 111
		bodyModel[111] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // 112
		bodyModel[112] = new ModelRendererTurbo(this, 25, 81, textureX, textureY); // 113
		bodyModel[113] = new ModelRendererTurbo(this, 73, 81, textureX, textureY); // 114
		bodyModel[114] = new ModelRendererTurbo(this, 337, 65, textureX, textureY); // 115
		bodyModel[115] = new ModelRendererTurbo(this, 57, 81, textureX, textureY); // 116
		bodyModel[116] = new ModelRendererTurbo(this, 89, 81, textureX, textureY); // 117
		bodyModel[117] = new ModelRendererTurbo(this, 97, 81, textureX, textureY); // 118
		bodyModel[118] = new ModelRendererTurbo(this, 481, 49, textureX, textureY); // 119
		bodyModel[119] = new ModelRendererTurbo(this, 497, 49, textureX, textureY); // 120
		bodyModel[120] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // 121
		bodyModel[121] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // 122
		bodyModel[122] = new ModelRendererTurbo(this, 481, 65, textureX, textureY); // 123
		bodyModel[123] = new ModelRendererTurbo(this, 201, 73, textureX, textureY); // 124
		bodyModel[124] = new ModelRendererTurbo(this, 481, 73, textureX, textureY); // 125
		bodyModel[125] = new ModelRendererTurbo(this, 41, 81, textureX, textureY); // 126
		bodyModel[126] = new ModelRendererTurbo(this, 105, 81, textureX, textureY); // 127
		bodyModel[127] = new ModelRendererTurbo(this, 121, 81, textureX, textureY); // 128
		bodyModel[128] = new ModelRendererTurbo(this, 137, 81, textureX, textureY); // 129
		bodyModel[129] = new ModelRendererTurbo(this, 153, 81, textureX, textureY); // 130
		bodyModel[130] = new ModelRendererTurbo(this, 185, 81, textureX, textureY); // 131
		bodyModel[131] = new ModelRendererTurbo(this, 441, 81, textureX, textureY); // 132
		bodyModel[132] = new ModelRendererTurbo(this, 353, 81, textureX, textureY); // 133
		bodyModel[133] = new ModelRendererTurbo(this, 169, 81, textureX, textureY); // 134
		bodyModel[134] = new ModelRendererTurbo(this, 481, 81, textureX, textureY); // 135
		bodyModel[135] = new ModelRendererTurbo(this, 201, 81, textureX, textureY); // 136
		bodyModel[136] = new ModelRendererTurbo(this, 489, 81, textureX, textureY); // 137
		bodyModel[137] = new ModelRendererTurbo(this, 89, 89, textureX, textureY); // 138
		bodyModel[138] = new ModelRendererTurbo(this, 113, 89, textureX, textureY); // 139
		bodyModel[139] = new ModelRendererTurbo(this, 137, 89, textureX, textureY); // 140
		bodyModel[140] = new ModelRendererTurbo(this, 393, 41, textureX, textureY); // 141
		bodyModel[141] = new ModelRendererTurbo(this, 81, 81, textureX, textureY); // 142
		bodyModel[142] = new ModelRendererTurbo(this, 129, 81, textureX, textureY); // 143
		bodyModel[143] = new ModelRendererTurbo(this, 193, 81, textureX, textureY); // 144
		bodyModel[144] = new ModelRendererTurbo(this, 345, 81, textureX, textureY); // 145
		bodyModel[145] = new ModelRendererTurbo(this, 161, 89, textureX, textureY); // 146
		bodyModel[146] = new ModelRendererTurbo(this, 177, 89, textureX, textureY); // 147
		bodyModel[147] = new ModelRendererTurbo(this, 185, 89, textureX, textureY); // 148
		bodyModel[148] = new ModelRendererTurbo(this, 209, 81, textureX, textureY); // 149
		bodyModel[149] = new ModelRendererTurbo(this, 409, 81, textureX, textureY); // 150
		bodyModel[150] = new ModelRendererTurbo(this, 321, 89, textureX, textureY); // 151
		bodyModel[151] = new ModelRendererTurbo(this, 361, 89, textureX, textureY); // 152
		bodyModel[152] = new ModelRendererTurbo(this, 369, 89, textureX, textureY); // 153
		bodyModel[153] = new ModelRendererTurbo(this, 417, 81, textureX, textureY); // 154
		bodyModel[154] = new ModelRendererTurbo(this, 505, 81, textureX, textureY); // 155
		bodyModel[155] = new ModelRendererTurbo(this, 377, 89, textureX, textureY); // 156
		bodyModel[156] = new ModelRendererTurbo(this, 73, 89, textureX, textureY); // 157
		bodyModel[157] = new ModelRendererTurbo(this, 57, 89, textureX, textureY); // 158
		bodyModel[158] = new ModelRendererTurbo(this, 41, 89, textureX, textureY); // 159
		bodyModel[159] = new ModelRendererTurbo(this, 105, 89, textureX, textureY); // 160
		bodyModel[160] = new ModelRendererTurbo(this, 385, 89, textureX, textureY); // 161
		bodyModel[161] = new ModelRendererTurbo(this, 417, 89, textureX, textureY); // 162
		bodyModel[162] = new ModelRendererTurbo(this, 425, 89, textureX, textureY); // 163
		bodyModel[163] = new ModelRendererTurbo(this, 457, 81, textureX, textureY); // 164
		bodyModel[164] = new ModelRendererTurbo(this, 185, 89, textureX, textureY); // 165
		bodyModel[165] = new ModelRendererTurbo(this, 321, 89, textureX, textureY); // 166
		bodyModel[166] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // 167
		bodyModel[167] = new ModelRendererTurbo(this, 329, 89, textureX, textureY); // 168
		bodyModel[168] = new ModelRendererTurbo(this, 89, 97, textureX, textureY); // 169
		bodyModel[169] = new ModelRendererTurbo(this, 137, 97, textureX, textureY); // 170
		bodyModel[170] = new ModelRendererTurbo(this, 233, 97, textureX, textureY); // 171
		bodyModel[171] = new ModelRendererTurbo(this, 449, 89, textureX, textureY); // 172
		bodyModel[172] = new ModelRendererTurbo(this, 281, 97, textureX, textureY); // 173
		bodyModel[173] = new ModelRendererTurbo(this, 457, 89, textureX, textureY); // 174
		bodyModel[174] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // 175
		bodyModel[175] = new ModelRendererTurbo(this, 25, 97, textureX, textureY); // 176
		bodyModel[176] = new ModelRendererTurbo(this, 113, 89, textureX, textureY); // 177
		bodyModel[177] = new ModelRendererTurbo(this, 153, 89, textureX, textureY); // 178
		bodyModel[178] = new ModelRendererTurbo(this, 161, 89, textureX, textureY); // 179
		bodyModel[179] = new ModelRendererTurbo(this, 337, 89, textureX, textureY); // 180
		bodyModel[180] = new ModelRendererTurbo(this, 193, 97, textureX, textureY); // 181
		bodyModel[181] = new ModelRendererTurbo(this, 225, 97, textureX, textureY); // 182
		bodyModel[182] = new ModelRendererTurbo(this, 257, 97, textureX, textureY); // 183
		bodyModel[183] = new ModelRendererTurbo(this, 281, 97, textureX, textureY); // 184
		bodyModel[184] = new ModelRendererTurbo(this, 377, 89, textureX, textureY); // 185
		bodyModel[185] = new ModelRendererTurbo(this, 393, 89, textureX, textureY); // 186
		bodyModel[186] = new ModelRendererTurbo(this, 449, 89, textureX, textureY); // 187
		bodyModel[187] = new ModelRendererTurbo(this, 457, 89, textureX, textureY); // 188
		bodyModel[188] = new ModelRendererTurbo(this, 305, 97, textureX, textureY); // 189
		bodyModel[189] = new ModelRendererTurbo(this, 49, 105, textureX, textureY); // 190
		bodyModel[190] = new ModelRendererTurbo(this, 369, 105, textureX, textureY); // 191
		bodyModel[191] = new ModelRendererTurbo(this, 425, 105, textureX, textureY); // 192
		bodyModel[192] = new ModelRendererTurbo(this, 481, 89, textureX, textureY); // 193
		bodyModel[193] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // 194
		bodyModel[194] = new ModelRendererTurbo(this, 9, 97, textureX, textureY); // 195
		bodyModel[195] = new ModelRendererTurbo(this, 17, 97, textureX, textureY); // 196
		bodyModel[196] = new ModelRendererTurbo(this, 81, 105, textureX, textureY); // 197
		bodyModel[197] = new ModelRendererTurbo(this, 329, 113, textureX, textureY); // 198
		bodyModel[198] = new ModelRendererTurbo(this, 393, 113, textureX, textureY); // 199
		bodyModel[199] = new ModelRendererTurbo(this, 1, 121, textureX, textureY); // 200
		bodyModel[200] = new ModelRendererTurbo(this, 25, 97, textureX, textureY); // 201
		bodyModel[201] = new ModelRendererTurbo(this, 33, 97, textureX, textureY); // 202
		bodyModel[202] = new ModelRendererTurbo(this, 41, 97, textureX, textureY); // 203
		bodyModel[203] = new ModelRendererTurbo(this, 193, 97, textureX, textureY); // 204
		bodyModel[204] = new ModelRendererTurbo(this, 25, 121, textureX, textureY); // 205
		bodyModel[205] = new ModelRendererTurbo(this, 57, 121, textureX, textureY); // 206
		bodyModel[206] = new ModelRendererTurbo(this, 129, 121, textureX, textureY); // 207
		bodyModel[207] = new ModelRendererTurbo(this, 153, 121, textureX, textureY); // 208
		bodyModel[208] = new ModelRendererTurbo(this, 217, 97, textureX, textureY); // 209
		bodyModel[209] = new ModelRendererTurbo(this, 225, 97, textureX, textureY); // 210
		bodyModel[210] = new ModelRendererTurbo(this, 249, 97, textureX, textureY); // 211
		bodyModel[211] = new ModelRendererTurbo(this, 257, 97, textureX, textureY); // 212
		bodyModel[212] = new ModelRendererTurbo(this, 225, 121, textureX, textureY); // 213
		bodyModel[213] = new ModelRendererTurbo(this, 257, 121, textureX, textureY); // 214
		bodyModel[214] = new ModelRendererTurbo(this, 353, 121, textureX, textureY); // 215
		bodyModel[215] = new ModelRendererTurbo(this, 441, 121, textureX, textureY); // 216
		bodyModel[216] = new ModelRendererTurbo(this, 265, 97, textureX, textureY); // 217
		bodyModel[217] = new ModelRendererTurbo(this, 273, 97, textureX, textureY); // 218
		bodyModel[218] = new ModelRendererTurbo(this, 281, 97, textureX, textureY); // 219
		bodyModel[219] = new ModelRendererTurbo(this, 289, 97, textureX, textureY); // 220
		bodyModel[220] = new ModelRendererTurbo(this, 305, 113, textureX, textureY); // 221
		bodyModel[221] = new ModelRendererTurbo(this, 113, 105, textureX, textureY); // 222
		bodyModel[222] = new ModelRendererTurbo(this, 425, 105, textureX, textureY); // 223
		bodyModel[223] = new ModelRendererTurbo(this, 9, 105, textureX, textureY); // 224
		bodyModel[224] = new ModelRendererTurbo(this, 393, 113, textureX, textureY); // 225
		bodyModel[225] = new ModelRendererTurbo(this, 1, 121, textureX, textureY); // 226
		bodyModel[226] = new ModelRendererTurbo(this, 345, 105, textureX, textureY); // 227
		bodyModel[227] = new ModelRendererTurbo(this, 65, 121, textureX, textureY); // 228
		bodyModel[228] = new ModelRendererTurbo(this, 33, 105, textureX, textureY); // 229
		bodyModel[229] = new ModelRendererTurbo(this, 153, 121, textureX, textureY); // 230
		bodyModel[230] = new ModelRendererTurbo(this, 305, 97, textureX, textureY); // 232
		bodyModel[231] = new ModelRendererTurbo(this, 353, 97, textureX, textureY); // 233
		bodyModel[232] = new ModelRendererTurbo(this, 505, 97, textureX, textureY); // 234
		bodyModel[233] = new ModelRendererTurbo(this, 377, 97, textureX, textureY); // 235
		bodyModel[234] = new ModelRendererTurbo(this, 393, 41, textureX, textureY); // 141

		bodyModel[0].addShapeBox(-56F, -7F, -11F, 96, 1, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // 01
		bodyModel[0].setRotationPoint(8F, 10F, 1F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 95, 16, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F); // 02
		bodyModel[1].setRotationPoint(-48F, -15F, -11F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 95, 16, 0, 0F,0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F); // 03
		bodyModel[2].setRotationPoint(-48F, -15F, 11F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 95, 3, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.1F, 0F, -0.5F, 0.1F); // 04
		bodyModel[3].setRotationPoint(-48F, 1F, -11F);
		bodyModel[3].rotateAngleX = 0.48869219F;

		bodyModel[4].addShapeBox(0F, 0F, 0F, 95, 3, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F); // 05
		bodyModel[4].setRotationPoint(-48F, 1F, 11F);
		bodyModel[4].rotateAngleX = -0.48869219F;

		bodyModel[5].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // 06
		bodyModel[5].setRotationPoint(-49F, -16F, -11F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // 07
		bodyModel[6].setRotationPoint(-49F, -16F, 10F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 1, 3, 5, 0F,0F, -3F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // 08
		bodyModel[7].setRotationPoint(-49F, -18F, -10F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 1, 3, 5, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // 09
		bodyModel[8].setRotationPoint(-49F, -18F, 5F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 1, 4, 5, 0F,0F, -4F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // 10
		bodyModel[9].setRotationPoint(-49F, -19F, 0F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 1, 4, 5, 0F,0F, -4F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // 11
		bodyModel[10].setRotationPoint(-49F, -19F, -5F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 95, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // 12
		bodyModel[11].setRotationPoint(-48F, -16F, -11F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 95, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // 13
		bodyModel[12].setRotationPoint(-48F, -16F, 10F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 95, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // 14
		bodyModel[13].setRotationPoint(-48F, -18F, 5F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 95, 2, 5, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // 15
		bodyModel[14].setRotationPoint(-48F, -18F, -10F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 95, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // 16
		bodyModel[15].setRotationPoint(-48F, -19F, 0F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 95, 1, 5, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // 17
		bodyModel[16].setRotationPoint(-48F, -19F, -5F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F); // 18
		bodyModel[17].setRotationPoint(-49F, 2F, -10F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // 19
		bodyModel[18].setRotationPoint(-49F, 2F, 3F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // 20
		bodyModel[19].setRotationPoint(-49F, 1F, -11F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // 21
		bodyModel[20].setRotationPoint(-49F, 1F, 9F);

		bodyModel[21].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // 22
		bodyModel[21].setRotationPoint(-49F, 0F, -11F);

		bodyModel[22].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // 23
		bodyModel[22].setRotationPoint(-49F, 0F, 9F);

		bodyModel[23].addBox(0F, 0F, 0F, 1, 11, 1, 0F); // 24
		bodyModel[23].setRotationPoint(-49F, -15F, -11F);

		bodyModel[24].addBox(0F, 0F, 0F, 1, 11, 1, 0F); // 25
		bodyModel[24].setRotationPoint(-49F, -15F, 10F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 1, 17, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // 26
		bodyModel[25].setRotationPoint(-50F, -15F, -4F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 1, 17, 2, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // 27
		bodyModel[26].setRotationPoint(-50F, -15F, 2F);

		bodyModel[27].addBox(0F, 0F, 0F, 1, 17, 6, 0F); // 28
		bodyModel[27].setRotationPoint(-49F, -15F, -3F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 1, 17, 1, 0F,1F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, -0.5F, 1F, 0F, -0.5F); // 29
		bodyModel[28].setRotationPoint(-50F, -15F, -3F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 1, 17, 1, 0F,1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0.5F, 1F, 0F, 0.5F, 1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0.5F, 1F, 0F, 0.5F); // 30
		bodyModel[29].setRotationPoint(-50F, -15F, 2F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F,1F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 1F, 0.5F, -0.5F, 1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 1F, 0F, -0.5F); // 31
		bodyModel[30].setRotationPoint(-50F, -16F, -3F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, -0.5F, 0.5F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // 32
		bodyModel[31].setRotationPoint(-50F, -16F, -4F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.5F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // 33
		bodyModel[32].setRotationPoint(-50F, -16F, 3F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,1F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0.5F, 0.5F, 1F, 0.5F, 0.5F, 1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 1F, 0F, 0.5F); // 34
		bodyModel[33].setRotationPoint(-50F, -16F, -4F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,1F, 0.5F, 0.5F, -0.5F, 0.5F, 0.5F, -0.5F, -0.5F, -0.5F, 1F, -0.5F, -0.5F, 1F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, -0.5F, 1F, 0F, -0.5F); // 35
		bodyModel[34].setRotationPoint(-50F, -16F, 3F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,1F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 1F, -0.5F, -0.5F, 1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 1F, 0F, -0.5F); // 36
		bodyModel[35].setRotationPoint(-50F, 1F, -3F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 4, 4, 7, 0F,0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -2F, 0F, -1.5F, -2F, 0F, 0F, 0F, 0F, 0F); // 37
		bodyModel[36].setRotationPoint(-49F, 3F, -10F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 4, 4, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -1.5F, 0F, 0F, -1.5F); // 38
		bodyModel[37].setRotationPoint(-49F, 3F, 3F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 2, 2, 18, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, -1F, -1F, -1F, -1F, -1F, -1F, -1F, 0F, -1F, -1F); // 39
		bodyModel[38].setRotationPoint(-49F, 7F, -9F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 1, 1, 16, 0F,-1F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -1F, 0F, 0.5F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F); // 40
		bodyModel[39].setRotationPoint(-50F, 7F, -8F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // 41
		bodyModel[40].setRotationPoint(-49F, -15F, -10F);

		bodyModel[41].addBox(0F, 0F, 0F, 1, 4, 8, 0F); // 42
		bodyModel[41].setRotationPoint(-49F, -4F, -11F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F,0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F); // 43
		bodyModel[42].setRotationPoint(-49F, -15F, -4F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // 44
		bodyModel[43].setRotationPoint(-49F, -15F, 4F);

		bodyModel[44].addBox(0F, 0F, 0F, 1, 4, 8, 0F); // 45
		bodyModel[44].setRotationPoint(-49F, -4F, 3F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F); // 46
		bodyModel[45].setRotationPoint(-49F, -15F, 3F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // 47
		bodyModel[46].setRotationPoint(-49F, -6F, -10F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F); // 48
		bodyModel[47].setRotationPoint(-49F, -6F, 4F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // 49
		bodyModel[48].setRotationPoint(-49F, -14F, -10F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F); // 50
		bodyModel[49].setRotationPoint(-49F, -14F, 4F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 1, 4, 6, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // 51
		bodyModel[50].setRotationPoint(-47F, 3F, -3F);

		bodyModel[51].addBox(0F, 0F, 0F, 0, 3, 20, 0F); // 52
		bodyModel[51].setRotationPoint(-48F, 0F, -10F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0F, 0F); // 53
		bodyModel[52].setRotationPoint(-50F, 4F, -7F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 7, 7, 20, 0F,0F, -0.1F, 0.3F, 0F, -0.1F, 0.3F, 0F, -0.1F, 0.3F, 0F, -0.1F, 0.3F, 0F, -1.5F, -2.5F, 0F, -1.5F, -2.5F, 0F, -1.5F, -2.5F, 0F, -1.5F, -2.5F); // 54
		bodyModel[53].setRotationPoint(-21F, 3F, -10F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 8, 7, 20, 0F,0F, -0.1F, 0.3F, 0F, -0.1F, 0.3F, 0F, -0.1F, 0.3F, 0F, -0.1F, 0.3F, 0F, -1.5F, -2.5F, 0F, -1.5F, -2.5F, 0F, -1.5F, -2.5F, 0F, -1.5F, -2.5F); // 55
		bodyModel[54].setRotationPoint(-12F, 3F, -10F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 8, 4, 14, 0F,0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // 56
		bodyModel[55].setRotationPoint(-2F, 3F, -7F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 3, 18, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F); // 57
		bodyModel[56].setRotationPoint(-48F, -15F, -3F);

		bodyModel[57].addShapeBox(0F, 0F, -1F, 3, 18, 1, 0F,0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F); // 58
		bodyModel[57].setRotationPoint(-48F, -15F, 3F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0.5F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, -0.5F, 0.5F, -0.5F, -0.5F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F); // 59
		bodyModel[58].setRotationPoint(-50F, 2F, -1F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F); // 60
		bodyModel[59].setRotationPoint(-50F, 4F, -1F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F); // 61
		bodyModel[60].setRotationPoint(-51F, 3F, 0F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // 62
		bodyModel[61].setRotationPoint(-50F, 3F, -1F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 7, 3, 7, 0F,0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // 63
		bodyModel[62].setRotationPoint(8F, 3F, 0F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 9, 2, 2, 0F,0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // 64
		bodyModel[63].setRotationPoint(8F, 3F, -8F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 3, 4, 16, 0F,0F, -0.1F, 0.5F, 0F, -0.1F, 0.5F, 0F, -0.1F, 0.5F, 0F, -0.1F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // 65
		bodyModel[64].setRotationPoint(18F, 3F, -8F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 3, 1, 20, 0F,0F, -0.05F, 0.25F, 0F, -0.05F, 0.25F, 0F, -0.05F, 0.25F, 0F, -0.05F, 0.25F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // 66
		bodyModel[65].setRotationPoint(-46F, 3F, -10F);

		bodyModel[66].addBox(0F, 0F, 0F, 5, 5, 0, 0F); // 67
		bodyModel[66].setRotationPoint(-42F, 5F, -6F);

		bodyModel[67].addBox(0F, 0F, 0F, 5, 5, 0, 0F); // 68
		bodyModel[67].setRotationPoint(-28F, 5F, -6F);

		bodyModel[68].addBox(0F, 0F, 0F, 5, 5, 0, 0F); // 69
		bodyModel[68].setRotationPoint(-42F, 5F, 6F);

		bodyModel[69].addBox(0F, 0F, 0F, 5, 5, 0, 0F); // 70
		bodyModel[69].setRotationPoint(-28F, 5F, 6F);

		bodyModel[70].addBox(0F, 0F, 0F, 1, 1, 14, 0F); // 71
		bodyModel[70].setRotationPoint(-40F, 7F, -7F);

		bodyModel[71].addBox(0F, 0F, 0F, 1, 1, 14, 0F); // 72
		bodyModel[71].setRotationPoint(-26F, 7F, -7F);

		bodyModel[72].addBox(0F, 0F, 0F, 3, 1, 16, 0F); // 73
		bodyModel[72].setRotationPoint(-34F, 5F, -8F);

		bodyModel[73].addBox(0F, 0F, 0F, 5, 1, 1, 0F); // 74
		bodyModel[73].setRotationPoint(-42F, 5F, -8F);

		bodyModel[74].addBox(0F, 0F, 0F, 5, 1, 1, 0F); // 75
		bodyModel[74].setRotationPoint(-42F, 5F, 7F);

		bodyModel[75].addBox(0F, 0F, 0F, 5, 1, 1, 0F); // 76
		bodyModel[75].setRotationPoint(-28F, 5F, -8F);

		bodyModel[76].addBox(0F, 0F, 0F, 5, 1, 1, 0F); // 77
		bodyModel[76].setRotationPoint(-28F, 5F, 7F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // 78
		bodyModel[77].setRotationPoint(-35F, 7F, -8F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // 79
		bodyModel[78].setRotationPoint(-35F, 7F, 7F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -2F, 0F); // 80
		bodyModel[79].setRotationPoint(-37F, 5F, -8F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -2F, 0F); // 81
		bodyModel[80].setRotationPoint(-37F, 5F, 7F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0.5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0.5F, 0F); // 82
		bodyModel[81].setRotationPoint(-30F, 5F, -8F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0.5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0.5F, 0F); // 83
		bodyModel[82].setRotationPoint(-30F, 5F, 7F);

		bodyModel[83].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // 84
		bodyModel[83].setRotationPoint(-41F, 6F, -8F);

		bodyModel[84].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // 85
		bodyModel[84].setRotationPoint(-39F, 6F, -8F);

		bodyModel[85].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // 86
		bodyModel[85].setRotationPoint(-41F, 6F, 7F);

		bodyModel[86].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // 87
		bodyModel[86].setRotationPoint(-39F, 6F, 7F);

		bodyModel[87].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // 88
		bodyModel[87].setRotationPoint(-27F, 6F, -8F);

		bodyModel[88].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // 89
		bodyModel[88].setRotationPoint(-25F, 6F, -8F);

		bodyModel[89].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // 90
		bodyModel[89].setRotationPoint(-27F, 6F, 7F);

		bodyModel[90].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // 91
		bodyModel[90].setRotationPoint(-25F, 6F, 7F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // 92
		bodyModel[91].setRotationPoint(-34F, 3F, -1F);

		bodyModel[92].addBox(0F, 0F, 0F, 3, 2, 1, 0F); // 93
		bodyModel[92].setRotationPoint(-34F, 4F, -9F);

		bodyModel[93].addBox(0F, 0F, 0F, 3, 2, 1, 0F); // 94
		bodyModel[93].setRotationPoint(-34F, 4F, 8F);

		bodyModel[94].addBox(0F, 0F, 0F, 3, 2, 1, 0F); // 95
		bodyModel[94].setRotationPoint(-34F, 6F, -7F);

		bodyModel[95].addBox(0F, 0F, 0F, 3, 2, 1, 0F); // 96
		bodyModel[95].setRotationPoint(-34F, 6F, 6F);

		bodyModel[96].addBox(0F, 0F, 0F, 15, 1, 2, 0F); // 97
		bodyModel[96].setRotationPoint(-40F, 6F, -1F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, -1.5F, -1.5F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, -1.5F, 0F, 0F, 0F, -1.5F, 0F, -1.5F, 0F, 0F, -1.5F, -1.5F, 0F, 0F, 0F); // 98
		bodyModel[97].setRotationPoint(-35F, 6F, -10F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // 99
		bodyModel[98].setRotationPoint(-31F, 3F, -10F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, -1.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, -1.5F, -1.5F, 0F, 0F, 0F, 0F, -1.5F, -1.5F, 0F, -1.5F, 0F, 0F, 0F, -1.5F); // 100
		bodyModel[99].setRotationPoint(-35F, 6F, 8F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // 101
		bodyModel[100].setRotationPoint(-31F, 3F, 9F);

		bodyModel[101].addBox(0F, 0F, 0F, 5, 5, 0, 0F); // 102
		bodyModel[101].setRotationPoint(23F, 5F, -6F);

		bodyModel[102].addBox(0F, 0F, 0F, 5, 5, 0, 0F); // 103
		bodyModel[102].setRotationPoint(37F, 5F, -6F);

		bodyModel[103].addBox(0F, 0F, 0F, 5, 5, 0, 0F); // 104
		bodyModel[103].setRotationPoint(23F, 5F, 6F);

		bodyModel[104].addBox(0F, 0F, 0F, 5, 5, 0, 0F); // 105
		bodyModel[104].setRotationPoint(37F, 5F, 6F);

		bodyModel[105].addBox(0F, 0F, 0F, 1, 1, 14, 0F); // 106
		bodyModel[105].setRotationPoint(25F, 7F, -7F);

		bodyModel[106].addBox(0F, 0F, 0F, 1, 1, 14, 0F); // 107
		bodyModel[106].setRotationPoint(39F, 7F, -7F);

		bodyModel[107].addBox(0F, 0F, 0F, 3, 1, 16, 0F); // 108
		bodyModel[107].setRotationPoint(31F, 5F, -8F);

		bodyModel[108].addBox(0F, 0F, 0F, 5, 1, 1, 0F); // 109
		bodyModel[108].setRotationPoint(23F, 5F, -8F);

		bodyModel[109].addBox(0F, 0F, 0F, 5, 1, 1, 0F); // 110
		bodyModel[109].setRotationPoint(23F, 5F, 7F);

		bodyModel[110].addBox(0F, 0F, 0F, 5, 1, 1, 0F); // 111
		bodyModel[110].setRotationPoint(37F, 5F, -8F);

		bodyModel[111].addBox(0F, 0F, 0F, 5, 1, 1, 0F); // 112
		bodyModel[111].setRotationPoint(37F, 5F, 7F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // 113
		bodyModel[112].setRotationPoint(30F, 7F, -8F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // 114
		bodyModel[113].setRotationPoint(30F, 7F, 7F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -2F, 0F); // 115
		bodyModel[114].setRotationPoint(28F, 5F, -8F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -2F, 0F); // 116
		bodyModel[115].setRotationPoint(28F, 5F, 7F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0.5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0.5F, 0F); // 117
		bodyModel[116].setRotationPoint(35F, 5F, -8F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0.5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0.5F, 0F); // 118
		bodyModel[117].setRotationPoint(35F, 5F, 7F);

		bodyModel[118].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // 119
		bodyModel[118].setRotationPoint(24F, 6F, -8F);

		bodyModel[119].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // 120
		bodyModel[119].setRotationPoint(26F, 6F, -8F);

		bodyModel[120].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // 121
		bodyModel[120].setRotationPoint(24F, 6F, 7F);

		bodyModel[121].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // 122
		bodyModel[121].setRotationPoint(26F, 6F, 7F);

		bodyModel[122].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // 123
		bodyModel[122].setRotationPoint(38F, 6F, -8F);

		bodyModel[123].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // 124
		bodyModel[123].setRotationPoint(40F, 6F, -8F);

		bodyModel[124].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // 125
		bodyModel[124].setRotationPoint(38F, 6F, 7F);

		bodyModel[125].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // 126
		bodyModel[125].setRotationPoint(40F, 6F, 7F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // 127
		bodyModel[126].setRotationPoint(31F, 3F, -1F);

		bodyModel[127].addBox(0F, 0F, 0F, 3, 2, 1, 0F); // 128
		bodyModel[127].setRotationPoint(31F, 4F, -9F);

		bodyModel[128].addBox(0F, 0F, 0F, 3, 2, 1, 0F); // 129
		bodyModel[128].setRotationPoint(31F, 4F, 8F);

		bodyModel[129].addBox(0F, 0F, 0F, 3, 2, 1, 0F); // 130
		bodyModel[129].setRotationPoint(31F, 6F, -7F);

		bodyModel[130].addBox(0F, 0F, 0F, 3, 2, 1, 0F); // 131
		bodyModel[130].setRotationPoint(31F, 6F, 6F);

		bodyModel[131].addBox(0F, 0F, 0F, 15, 1, 2, 0F); // 132
		bodyModel[131].setRotationPoint(25F, 6F, -1F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, -1.5F, -1.5F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, -1.5F, 0F, 0F, 0F, -1.5F, 0F, -1.5F, 0F, 0F, -1.5F, -1.5F, 0F, 0F, 0F); // 133
		bodyModel[132].setRotationPoint(35F, 6F, 10F);
		bodyModel[132].rotateAngleY = 3.14159265F;

		bodyModel[133].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // 134
		bodyModel[133].setRotationPoint(31F, 3F, 10F);
		bodyModel[133].rotateAngleY = 3.14159265F;

		bodyModel[134].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, -1.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, -1.5F, -1.5F, 0F, 0F, 0F, 0F, -1.5F, -1.5F, 0F, -1.5F, 0F, 0F, 0F, -1.5F); // 135
		bodyModel[134].setRotationPoint(35F, 6F, -8F);
		bodyModel[134].rotateAngleY = 3.14159265F;

		bodyModel[135].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // 136
		bodyModel[135].setRotationPoint(31F, 3F, -9F);
		bodyModel[135].rotateAngleY = 3.14159265F;

		bodyModel[136].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // 137
		bodyModel[136].setRotationPoint(47F, 1F, -11F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // 138
		bodyModel[137].setRotationPoint(47F, 1F, 3F);

		bodyModel[138].addBox(0F, 0F, 0F, 1, 16, 8, 0F); // 139
		bodyModel[138].setRotationPoint(47F, -15F, -11F);

		bodyModel[139].addBox(0F, 0F, 0F, 1, 16, 8, 0F); // 140
		bodyModel[139].setRotationPoint(47F, -15F, 3F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // 141
		bodyModel[140].setRotationPoint(47F, -16F, -11F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 1, 3, 5, 0F,0F, -2F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // 142
		bodyModel[141].setRotationPoint(47F, -18F, -10F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 1, 3, 5, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // 143
		bodyModel[142].setRotationPoint(47F, -18F, 5F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 1, 4, 5, 0F,0F, -1F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // 144
		bodyModel[143].setRotationPoint(47F, -19F, -5F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 1, 4, 5, 0F,0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // 145
		bodyModel[144].setRotationPoint(47F, -19F, 0F);

		bodyModel[145].addBox(0F, 0F, 0F, 1, 18, 6, 0F); // 146
		bodyModel[145].setRotationPoint(47F, -15F, -3F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 1, 17, 2, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F); // 147
		bodyModel[146].setRotationPoint(48F, -15F, -4F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 1, 17, 2, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // 148
		bodyModel[147].setRotationPoint(48F, -15F, 2F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0.5F, -0.5F, -0.5F, 0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F); // 149
		bodyModel[148].setRotationPoint(47F, -16F, -4F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.5F, 0.5F, 0.5F, -0.5F, 0.5F, 0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // 150
		bodyModel[149].setRotationPoint(47F, -16F, 3F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F,1F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 1F, 0.5F, -0.5F, 1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 1F, 0F, -0.5F); // 151
		bodyModel[150].setRotationPoint(48F, -16F, -3F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 1, 17, 1, 0F,1F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 1F, 0F, -0.5F); // 152
		bodyModel[151].setRotationPoint(49F, -15F, -3F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 1, 17, 1, 0F,1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 1F, 0F, 0.5F, 1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 1F, 0F, 0.5F); // 153
		bodyModel[152].setRotationPoint(49F, -15F, 2F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,1F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0.5F, 0.5F, 1F, 0.5F, 0.5F, 1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 1F, 0F, 0.5F); // 154
		bodyModel[153].setRotationPoint(49F, -16F, -4F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,1F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, -0.5F, -0.5F, 1F, -0.5F, -0.5F, 1F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 1F, 0F, -0.5F); // 155
		bodyModel[154].setRotationPoint(49F, -16F, 3F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F,1F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 1F, 0.5F, -0.5F, 1F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 1F, 0.5F, -0.5F); // 156
		bodyModel[155].setRotationPoint(48F, 2F, -3F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0.5F, -0.5F, -0.5F, 0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F); // 157
		bodyModel[156].setRotationPoint(47F, 3F, 4F);
		bodyModel[156].rotateAngleX = -3.14159265F;

		bodyModel[157].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.5F, 0.5F, 0.5F, -0.5F, 0.5F, 0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // 158
		bodyModel[157].setRotationPoint(47F, 3F, -3F);
		bodyModel[157].rotateAngleX = -3.14159265F;

		bodyModel[158].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,1F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0.5F, 0.5F, 1F, 0.5F, 0.5F, 1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 1F, 0F, 0.5F); // 159
		bodyModel[158].setRotationPoint(49F, 3F, 4F);
		bodyModel[158].rotateAngleX = -3.14159265F;

		bodyModel[159].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,1F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, -0.5F, -0.5F, 1F, -0.5F, -0.5F, 1F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 1F, 0F, -0.5F); // 160
		bodyModel[159].setRotationPoint(49F, 3F, -3F);
		bodyModel[159].rotateAngleX = -3.14159265F;

		bodyModel[160].addShapeBox(0F, 0F, 0F, 4, 2, 16, 0F,0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // 161
		bodyModel[160].setRotationPoint(44F, 3F, -8F);

		bodyModel[161].addBox(0F, 0F, 0F, 5, 1, 2, 0F); // 162
		bodyModel[161].setRotationPoint(46F, 5F, -1F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 5, 1, 8, 0F,0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F); // 163
		bodyModel[162].setRotationPoint(-30F, 0F, -11F);

		bodyModel[163].addBox(0F, 0F, 0F, 0, 16, 22, 0F); // 164
		bodyModel[163].setRotationPoint(-42F, -15F, -11F);

		bodyModel[164].addBox(0F, 0F, 0F, 0, 16, 22, 0F); // 165
		bodyModel[164].setRotationPoint(35F, -15F, -11F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 0, 1, 22, 0F,0F, 0F, -1.05F, 0F, 0F, -1.05F, 0F, 0F, -1.05F, 0F, 0F, -1.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F); // 166
		bodyModel[165].setRotationPoint(-42F, -16F, -11F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 0, 2, 20, 0F,0F, 0F, -5.05F, 0F, 0F, -5.05F, 0F, 0F, -5.05F, 0F, 0F, -5.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F); // 167
		bodyModel[166].setRotationPoint(-42F, -18F, -10F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 0, 1, 10, 0F,0F, 0F, -5.05F, 0F, 0F, -5.05F, 0F, 0F, -5.05F, 0F, 0F, -5.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F); // 168
		bodyModel[167].setRotationPoint(-42F, -19F, -5F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 0, 2, 22, 0F,0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -1.05F, 0F, 0F, -1.05F, 0F, 0F, -1.05F, 0F, 0F, -1.05F); // 169
		bodyModel[168].setRotationPoint(-42F, 1F, -11F);

		bodyModel[169].addShapeBox(0F, 0F, 0F, 0, 1, 22, 0F,0F, 0F, -1.05F, 0F, 0F, -1.05F, 0F, 0F, -1.05F, 0F, 0F, -1.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F); // 170
		bodyModel[169].setRotationPoint(35F, -16F, -11F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 0, 2, 20, 0F,0F, 0F, -5.05F, 0F, 0F, -5.05F, 0F, 0F, -5.05F, 0F, 0F, -5.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F); // 171
		bodyModel[170].setRotationPoint(35F, -18F, -10F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 0, 1, 10, 0F,0F, 0F, -5.05F, 0F, 0F, -5.05F, 0F, 0F, -5.05F, 0F, 0F, -5.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F); // 172
		bodyModel[171].setRotationPoint(35F, -19F, -5F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 0, 2, 22, 0F,0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -1.05F, 0F, 0F, -1.05F, 0F, 0F, -1.05F, 0F, 0F, -1.05F); // 173
		bodyModel[172].setRotationPoint(35F, 1F, -11F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 5, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // 174
		bodyModel[173].setRotationPoint(-30F, 0F, 3F);

		bodyModel[174].addShapeBox(0F, 0F, 0F, 0, 9, 8, 0F,0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F); // 175
		bodyModel[174].setRotationPoint(-25F, -9F, -11F);

		bodyModel[175].addShapeBox(0F, 0F, 0F, 0, 9, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // 176
		bodyModel[175].setRotationPoint(-25F, -9F, 3F);

		bodyModel[176].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // 177
		bodyModel[176].setRotationPoint(-27F, 0F, -9F);

		bodyModel[177].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // 178
		bodyModel[177].setRotationPoint(-27F, 0F, -5F);

		bodyModel[178].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // 179
		bodyModel[178].setRotationPoint(-27F, 0F, 4F);

		bodyModel[179].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // 180
		bodyModel[179].setRotationPoint(-27F, 0F, 8F);

		bodyModel[180].addShapeBox(0F, 0F, 0F, 5, 1, 8, 0F,0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F); // 181
		bodyModel[180].setRotationPoint(-19F, 0F, -11F);

		bodyModel[181].addShapeBox(0F, 0F, 0F, 5, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // 182
		bodyModel[181].setRotationPoint(-19F, 0F, 3F);

		bodyModel[182].addShapeBox(0F, 0F, 0F, 0, 9, 8, 0F,0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F); // 183
		bodyModel[182].setRotationPoint(-14F, -9F, -11F);

		bodyModel[183].addShapeBox(0F, 0F, 0F, 0, 9, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // 184
		bodyModel[183].setRotationPoint(-14F, -9F, 3F);

		bodyModel[184].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // 185
		bodyModel[184].setRotationPoint(-16F, 0F, -9F);

		bodyModel[185].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // 186
		bodyModel[185].setRotationPoint(-16F, 0F, -5F);

		bodyModel[186].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // 187
		bodyModel[186].setRotationPoint(-16F, 0F, 4F);

		bodyModel[187].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // 188
		bodyModel[187].setRotationPoint(-16F, 0F, 8F);

		bodyModel[188].addShapeBox(0F, 0F, 0F, 5, 1, 8, 0F,0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F); // 189
		bodyModel[188].setRotationPoint(-8F, 0F, -11F);

		bodyModel[189].addShapeBox(0F, 0F, 0F, 5, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // 190
		bodyModel[189].setRotationPoint(-8F, 0F, 3F);

		bodyModel[190].addShapeBox(0F, 0F, 0F, 0, 9, 8, 0F,0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F); // 191
		bodyModel[190].setRotationPoint(-3F, -9F, -11F);

		bodyModel[191].addShapeBox(0F, 0F, 0F, 0, 9, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // 192
		bodyModel[191].setRotationPoint(-3F, -9F, 3F);

		bodyModel[192].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // 193
		bodyModel[192].setRotationPoint(-5F, 0F, -9F);

		bodyModel[193].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // 194
		bodyModel[193].setRotationPoint(-5F, 0F, -5F);

		bodyModel[194].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // 195
		bodyModel[194].setRotationPoint(-5F, 0F, 4F);

		bodyModel[195].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // 196
		bodyModel[195].setRotationPoint(-5F, 0F, 8F);

		bodyModel[196].addShapeBox(0F, 0F, 0F, 5, 1, 8, 0F,0F, 0F, -0.1F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F); // 197
		bodyModel[196].setRotationPoint(3F, 0F, -11F);

		bodyModel[197].addShapeBox(0F, 0F, 0F, 5, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // 198
		bodyModel[197].setRotationPoint(3F, 0F, 3F);

		bodyModel[198].addShapeBox(0F, 0F, 0F, 0, 9, 8, 0F,0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F); // 199
		bodyModel[198].setRotationPoint(8F, -9F, -11F);

		bodyModel[199].addShapeBox(0F, 0F, 0F, 0, 9, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // 200
		bodyModel[199].setRotationPoint(8F, -9F, 3F);

		bodyModel[200].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // 201
		bodyModel[200].setRotationPoint(6F, 0F, -9F);

		bodyModel[201].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // 202
		bodyModel[201].setRotationPoint(6F, 0F, -5F);

		bodyModel[202].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // 203
		bodyModel[202].setRotationPoint(6F, 0F, 4F);

		bodyModel[203].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // 204
		bodyModel[203].setRotationPoint(6F, 0F, 8F);

		bodyModel[204].addShapeBox(0F, 0F, 0F, 5, 1, 8, 0F,0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F); // 205
		bodyModel[204].setRotationPoint(14F, 0F, -11F);

		bodyModel[205].addShapeBox(0F, 0F, 0F, 5, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // 206
		bodyModel[205].setRotationPoint(14F, 0F, 3F);

		bodyModel[206].addShapeBox(0F, 0F, 0F, 0, 9, 8, 0F,0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F); // 207
		bodyModel[206].setRotationPoint(19F, -9F, -11F);

		bodyModel[207].addShapeBox(0F, 0F, 0F, 0, 9, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // 208
		bodyModel[207].setRotationPoint(19F, -9F, 3F);

		bodyModel[208].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // 209
		bodyModel[208].setRotationPoint(17F, 0F, -9F);

		bodyModel[209].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // 210
		bodyModel[209].setRotationPoint(17F, 0F, -5F);

		bodyModel[210].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // 211
		bodyModel[210].setRotationPoint(17F, 0F, 4F);

		bodyModel[211].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // 212
		bodyModel[211].setRotationPoint(17F, 0F, 8F);

		bodyModel[212].addShapeBox(0F, 0F, 0F, 5, 1, 8, 0F,0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F); // 213
		bodyModel[212].setRotationPoint(25F, 0F, -11F);

		bodyModel[213].addShapeBox(0F, 0F, 0F, 5, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // 214
		bodyModel[213].setRotationPoint(25F, 0F, 3F);

		bodyModel[214].addShapeBox(0F, 0F, 0F, 0, 9, 8, 0F,0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F); // 215
		bodyModel[214].setRotationPoint(30F, -9F, -11F);

		bodyModel[215].addShapeBox(0F, 0F, 0F, 0, 9, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // 216
		bodyModel[215].setRotationPoint(30F, -9F, 3F);

		bodyModel[216].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // 217
		bodyModel[216].setRotationPoint(28F, 0F, -9F);

		bodyModel[217].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // 218
		bodyModel[217].setRotationPoint(28F, 0F, -5F);

		bodyModel[218].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // 219
		bodyModel[218].setRotationPoint(28F, 0F, 4F);

		bodyModel[219].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // 220
		bodyModel[219].setRotationPoint(28F, 0F, 8F);

		bodyModel[220].addBox(0F, 0F, 0F, 0, 16, 22, 0F); // 221
		bodyModel[220].setRotationPoint(-35F, -15F, -11F);

		bodyModel[221].addShapeBox(0F, 0F, 0F, 0, 1, 22, 0F,0F, 0F, -1.05F, 0F, 0F, -1.05F, 0F, 0F, -1.05F, 0F, 0F, -1.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F); // 222
		bodyModel[221].setRotationPoint(-35F, -16F, -11F);

		bodyModel[222].addShapeBox(0F, 0F, 0F, 0, 2, 20, 0F,0F, 0F, -5.05F, 0F, 0F, -5.05F, 0F, 0F, -5.05F, 0F, 0F, -5.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F); // 223
		bodyModel[222].setRotationPoint(-35F, -18F, -10F);

		bodyModel[223].addShapeBox(0F, 0F, 0F, 0, 1, 10, 0F,0F, 0F, -5.05F, 0F, 0F, -5.05F, 0F, 0F, -5.05F, 0F, 0F, -5.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F); // 224
		bodyModel[223].setRotationPoint(-35F, -19F, -5F);

		bodyModel[224].addShapeBox(0F, 0F, 0F, 0, 2, 22, 0F,0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -1.05F, 0F, 0F, -1.05F, 0F, 0F, -1.05F, 0F, 0F, -1.05F); // 225
		bodyModel[224].setRotationPoint(-35F, 1F, -11F);

		bodyModel[225].addBox(0F, 0F, 0F, 0, 16, 22, 0F); // 226
		bodyModel[225].setRotationPoint(42F, -15F, -11F);

		bodyModel[226].addShapeBox(0F, 0F, 0F, 0, 1, 22, 0F,0F, 0F, -1.05F, 0F, 0F, -1.05F, 0F, 0F, -1.05F, 0F, 0F, -1.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F); // 227
		bodyModel[226].setRotationPoint(42F, -16F, -11F);

		bodyModel[227].addShapeBox(0F, 0F, 0F, 0, 2, 20, 0F,0F, 0F, -5.05F, 0F, 0F, -5.05F, 0F, 0F, -5.05F, 0F, 0F, -5.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F); // 228
		bodyModel[227].setRotationPoint(42F, -18F, -10F);

		bodyModel[228].addShapeBox(0F, 0F, 0F, 0, 1, 10, 0F,0F, 0F, -5.05F, 0F, 0F, -5.05F, 0F, 0F, -5.05F, 0F, 0F, -5.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F); // 229
		bodyModel[228].setRotationPoint(42F, -19F, -5F);

		bodyModel[229].addShapeBox(0F, 0F, 0F, 0, 2, 22, 0F,0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -1.05F, 0F, 0F, -1.05F, 0F, 0F, -1.05F, 0F, 0F, -1.05F); // 230
		bodyModel[229].setRotationPoint(42F, 1F, -11F);

		bodyModel[230].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -3F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 2.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2.5F, 0F); // 232
		bodyModel[230].setRotationPoint(-44F, 5F, -8F);

		bodyModel[231].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -0.5F, 0F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2.5F, -0.5F); // 233
		bodyModel[231].setRotationPoint(-44F, 5F, 7F);

		bodyModel[232].addShapeBox(0F, 0F, 0F, 1, 20, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F); // 234
		bodyModel[232].setRotationPoint(48F, -15F, -7F);

		bodyModel[233].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // 235
		bodyModel[233].setRotationPoint(48F, -18F, -7F);

		bodyModel[234].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // 141
		bodyModel[234].setRotationPoint(48F, -16F, 10F);
		bodyModel[234].rotateAngleY = 1.57079633F;
	}
	public ArrayList<double[]> getSmokePosition() {
		return new ArrayList<double[]>() {
			{
				add(new double[]{-1.1D, 1.0D, -0.4D});
			}
		};
	}
}