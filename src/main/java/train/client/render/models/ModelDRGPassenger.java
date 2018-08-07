//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2018 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator:
// Created on:28.01.2018 - 00:34:39
// Last changed on: 28.01.2018 - 00:34:39

package train.client.render.models;

import net.minecraft.entity.Entity;
import tmt.ModelBase;
import tmt.ModelRendererTurbo;

public class ModelDRGPassenger extends ModelBase
{
	int textureX = 512;
	int textureY = 256;

	public ModelDRGPassenger()
	{
		drgpassengerModel = new ModelRendererTurbo[536];
		drgpassengerModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		drgpassengerModel[1] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 2
		drgpassengerModel[2] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 3
		drgpassengerModel[3] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 4
		drgpassengerModel[4] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 5
		drgpassengerModel[5] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 21
		drgpassengerModel[6] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 22
		drgpassengerModel[7] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 23
		drgpassengerModel[8] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 26
		drgpassengerModel[9] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 36
		drgpassengerModel[10] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 37
		drgpassengerModel[11] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 38
		drgpassengerModel[12] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 40
		drgpassengerModel[13] = new ModelRendererTurbo(this, 113, 17, textureX, textureY); // Box 54
		drgpassengerModel[14] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 55
		drgpassengerModel[15] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 65
		drgpassengerModel[16] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 67
		drgpassengerModel[17] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 68
		drgpassengerModel[18] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 69
		drgpassengerModel[19] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 70
		drgpassengerModel[20] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 71
		drgpassengerModel[21] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 72
		drgpassengerModel[22] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 73
		drgpassengerModel[23] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 65
		drgpassengerModel[24] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 66
		drgpassengerModel[25] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 68
		drgpassengerModel[26] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 69
		drgpassengerModel[27] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 71
		drgpassengerModel[28] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 72
		drgpassengerModel[29] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 73
		drgpassengerModel[30] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 74
		drgpassengerModel[31] = new ModelRendererTurbo(this, 65, 9, textureX, textureY); // Box 75
		drgpassengerModel[32] = new ModelRendererTurbo(this, 441, 9, textureX, textureY); // Box 76
		drgpassengerModel[33] = new ModelRendererTurbo(this, 457, 9, textureX, textureY); // Box 77
		drgpassengerModel[34] = new ModelRendererTurbo(this, 473, 9, textureX, textureY); // Box 78
		drgpassengerModel[35] = new ModelRendererTurbo(this, 297, 17, textureX, textureY); // Box 79
		drgpassengerModel[36] = new ModelRendererTurbo(this, 497, 9, textureX, textureY); // Box 91
		drgpassengerModel[37] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 94
		drgpassengerModel[38] = new ModelRendererTurbo(this, 369, 17, textureX, textureY); // Box 95
		drgpassengerModel[39] = new ModelRendererTurbo(this, 385, 17, textureX, textureY); // Box 96
		drgpassengerModel[40] = new ModelRendererTurbo(this, 401, 9, textureX, textureY); // Box 97
		drgpassengerModel[41] = new ModelRendererTurbo(this, 321, 17, textureX, textureY); // Box 98
		drgpassengerModel[42] = new ModelRendererTurbo(this, 489, 17, textureX, textureY); // Box 99
		drgpassengerModel[43] = new ModelRendererTurbo(this, 497, 17, textureX, textureY); // Box 100
		drgpassengerModel[44] = new ModelRendererTurbo(this, 505, 17, textureX, textureY); // Box 101
		drgpassengerModel[45] = new ModelRendererTurbo(this, 185, 25, textureX, textureY); // Box 102
		drgpassengerModel[46] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 103
		drgpassengerModel[47] = new ModelRendererTurbo(this, 209, 25, textureX, textureY); // Box 104
		drgpassengerModel[48] = new ModelRendererTurbo(this, 225, 25, textureX, textureY); // Box 108
		drgpassengerModel[49] = new ModelRendererTurbo(this, 241, 25, textureX, textureY); // Box 109
		drgpassengerModel[50] = new ModelRendererTurbo(this, 257, 25, textureX, textureY); // Box 110
		drgpassengerModel[51] = new ModelRendererTurbo(this, 273, 25, textureX, textureY); // Box 111
		drgpassengerModel[52] = new ModelRendererTurbo(this, 329, 25, textureX, textureY); // Box 112
		drgpassengerModel[53] = new ModelRendererTurbo(this, 345, 25, textureX, textureY); // Box 113
		drgpassengerModel[54] = new ModelRendererTurbo(this, 441, 25, textureX, textureY); // Box 114
		drgpassengerModel[55] = new ModelRendererTurbo(this, 457, 25, textureX, textureY); // Box 115
		drgpassengerModel[56] = new ModelRendererTurbo(this, 289, 25, textureX, textureY); // Box 128
		drgpassengerModel[57] = new ModelRendererTurbo(this, 361, 25, textureX, textureY); // Box 129
		drgpassengerModel[58] = new ModelRendererTurbo(this, 473, 25, textureX, textureY); // Box 130
		drgpassengerModel[59] = new ModelRendererTurbo(this, 481, 25, textureX, textureY); // Box 131
		drgpassengerModel[60] = new ModelRendererTurbo(this, 297, 33, textureX, textureY); // Box 132
		drgpassengerModel[61] = new ModelRendererTurbo(this, 305, 33, textureX, textureY); // Box 133
		drgpassengerModel[62] = new ModelRendererTurbo(this, 401, 17, textureX, textureY); // Box 134
		drgpassengerModel[63] = new ModelRendererTurbo(this, 425, 17, textureX, textureY); // Box 135
		drgpassengerModel[64] = new ModelRendererTurbo(this, 313, 33, textureX, textureY); // Box 136
		drgpassengerModel[65] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 137
		drgpassengerModel[66] = new ModelRendererTurbo(this, 385, 33, textureX, textureY); // Box 138
		drgpassengerModel[67] = new ModelRendererTurbo(this, 433, 17, textureX, textureY); // Box 139
		drgpassengerModel[68] = new ModelRendererTurbo(this, 201, 25, textureX, textureY); // Box 140
		drgpassengerModel[69] = new ModelRendererTurbo(this, 233, 41, textureX, textureY); // Box 141
		drgpassengerModel[70] = new ModelRendererTurbo(this, 417, 33, textureX, textureY); // Box 143
		drgpassengerModel[71] = new ModelRendererTurbo(this, 489, 33, textureX, textureY); // Box 145
		drgpassengerModel[72] = new ModelRendererTurbo(this, 353, 9, textureX, textureY); // Box 146
		drgpassengerModel[73] = new ModelRendererTurbo(this, 73, 17, textureX, textureY); // Box 147
		drgpassengerModel[74] = new ModelRendererTurbo(this, 305, 41, textureX, textureY); // Box 158
		drgpassengerModel[75] = new ModelRendererTurbo(this, 265, 25, textureX, textureY); // Box 159
		drgpassengerModel[76] = new ModelRendererTurbo(this, 337, 25, textureX, textureY); // Box 160
		drgpassengerModel[77] = new ModelRendererTurbo(this, 201, 33, textureX, textureY); // Box 171
		drgpassengerModel[78] = new ModelRendererTurbo(this, 465, 17, textureX, textureY); // Box 172
		drgpassengerModel[79] = new ModelRendererTurbo(this, 185, 41, textureX, textureY); // Box 173
		drgpassengerModel[80] = new ModelRendererTurbo(this, 225, 41, textureX, textureY); // Box 174
		drgpassengerModel[81] = new ModelRendererTurbo(this, 265, 41, textureX, textureY); // Box 175
		drgpassengerModel[82] = new ModelRendererTurbo(this, 385, 41, textureX, textureY); // Box 176
		drgpassengerModel[83] = new ModelRendererTurbo(this, 337, 41, textureX, textureY); // Box 177
		drgpassengerModel[84] = new ModelRendererTurbo(this, 361, 41, textureX, textureY); // Box 178
		drgpassengerModel[85] = new ModelRendererTurbo(this, 417, 41, textureX, textureY); // Box 179
		drgpassengerModel[86] = new ModelRendererTurbo(this, 481, 33, textureX, textureY); // Box 180
		drgpassengerModel[87] = new ModelRendererTurbo(this, 233, 33, textureX, textureY); // Box 181
		drgpassengerModel[88] = new ModelRendererTurbo(this, 433, 41, textureX, textureY); // Box 182
		drgpassengerModel[89] = new ModelRendererTurbo(this, 249, 33, textureX, textureY); // Box 183
		drgpassengerModel[90] = new ModelRendererTurbo(this, 361, 41, textureX, textureY); // Box 184
		drgpassengerModel[91] = new ModelRendererTurbo(this, 433, 41, textureX, textureY); // Box 185
		drgpassengerModel[92] = new ModelRendererTurbo(this, 457, 41, textureX, textureY); // Box 186
		drgpassengerModel[93] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 187
		drgpassengerModel[94] = new ModelRendererTurbo(this, 497, 41, textureX, textureY); // Box 188
		drgpassengerModel[95] = new ModelRendererTurbo(this, 209, 49, textureX, textureY); // Box 189
		drgpassengerModel[96] = new ModelRendererTurbo(this, 473, 41, textureX, textureY); // Box 190
		drgpassengerModel[97] = new ModelRendererTurbo(this, 225, 49, textureX, textureY); // Box 191
		drgpassengerModel[98] = new ModelRendererTurbo(this, 265, 49, textureX, textureY); // Box 192
		drgpassengerModel[99] = new ModelRendererTurbo(this, 265, 33, textureX, textureY); // Box 193
		drgpassengerModel[100] = new ModelRendererTurbo(this, 489, 41, textureX, textureY); // Box 194
		drgpassengerModel[101] = new ModelRendererTurbo(this, 337, 33, textureX, textureY); // Box 195
		drgpassengerModel[102] = new ModelRendererTurbo(this, 281, 49, textureX, textureY); // Box 196
		drgpassengerModel[103] = new ModelRendererTurbo(this, 297, 49, textureX, textureY); // Box 197
		drgpassengerModel[104] = new ModelRendererTurbo(this, 337, 49, textureX, textureY); // Box 198
		drgpassengerModel[105] = new ModelRendererTurbo(this, 353, 49, textureX, textureY); // Box 199
		drgpassengerModel[106] = new ModelRendererTurbo(this, 385, 49, textureX, textureY); // Box 200
		drgpassengerModel[107] = new ModelRendererTurbo(this, 457, 49, textureX, textureY); // Box 201
		drgpassengerModel[108] = new ModelRendererTurbo(this, 481, 49, textureX, textureY); // Box 202
		drgpassengerModel[109] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 203
		drgpassengerModel[110] = new ModelRendererTurbo(this, 209, 57, textureX, textureY); // Box 204
		drgpassengerModel[111] = new ModelRendererTurbo(this, 209, 65, textureX, textureY); // Box 205
		drgpassengerModel[112] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 206
		drgpassengerModel[113] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 207
		drgpassengerModel[114] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 208
		drgpassengerModel[115] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 209
		drgpassengerModel[116] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 210
		drgpassengerModel[117] = new ModelRendererTurbo(this, 193, 73, textureX, textureY); // Box 211
		drgpassengerModel[118] = new ModelRendererTurbo(this, 225, 57, textureX, textureY); // Box 148
		drgpassengerModel[119] = new ModelRendererTurbo(this, 409, 65, textureX, textureY); // Box 149
		drgpassengerModel[120] = new ModelRendererTurbo(this, 449, 65, textureX, textureY); // Box 150
		drgpassengerModel[121] = new ModelRendererTurbo(this, 225, 81, textureX, textureY); // Box 163
		drgpassengerModel[122] = new ModelRendererTurbo(this, 267, 81, textureX, textureY); // Box 164
		drgpassengerModel[123] = new ModelRendererTurbo(this, 313, 81, textureX, textureY); // Box 165
		drgpassengerModel[124] = new ModelRendererTurbo(this, 345, 81, textureX, textureY); // Box 166
		drgpassengerModel[125] = new ModelRendererTurbo(this, 377, 81, textureX, textureY); // Box 167
		drgpassengerModel[126] = new ModelRendererTurbo(this, 479, 81, textureX, textureY); // Box 168
		drgpassengerModel[127] = new ModelRendererTurbo(this, 479, 81, textureX, textureY); // Box 169
		drgpassengerModel[128] = new ModelRendererTurbo(this, 169, 89, textureX, textureY); // Box 170
		drgpassengerModel[129] = new ModelRendererTurbo(this, 209, 89, textureX, textureY); // Box 171
		drgpassengerModel[130] = new ModelRendererTurbo(this, 329, 89, textureX, textureY); // Box 172
		drgpassengerModel[131] = new ModelRendererTurbo(this, 361, 81, textureX, textureY); // Box 172
		drgpassengerModel[132] = new ModelRendererTurbo(this, 257, 57, textureX, textureY); // Box 173
		drgpassengerModel[133] = new ModelRendererTurbo(this, 321, 57, textureX, textureY); // Box 174
		drgpassengerModel[134] = new ModelRendererTurbo(this, 353, 57, textureX, textureY); // Box 177
		drgpassengerModel[135] = new ModelRendererTurbo(this, 409, 57, textureX, textureY); // Box 178
		drgpassengerModel[136] = new ModelRendererTurbo(this, 137, 81, textureX, textureY); // Box 179
		drgpassengerModel[137] = new ModelRendererTurbo(this, 393, 89, textureX, textureY); // Box 180
		drgpassengerModel[138] = new ModelRendererTurbo(this, 369, 17, textureX, textureY); // Box 181
		drgpassengerModel[139] = new ModelRendererTurbo(this, 385, 17, textureX, textureY); // Box 182
		drgpassengerModel[140] = new ModelRendererTurbo(this, 401, 17, textureX, textureY); // Box 184
		drgpassengerModel[141] = new ModelRendererTurbo(this, 425, 17, textureX, textureY); // Box 186
		drgpassengerModel[142] = new ModelRendererTurbo(this, 441, 89, textureX, textureY); // Box 185
		drgpassengerModel[143] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 189
		drgpassengerModel[144] = new ModelRendererTurbo(this, 41, 105, textureX, textureY); // Box 190
		drgpassengerModel[145] = new ModelRendererTurbo(this, 233, 105, textureX, textureY); // Box 191
		drgpassengerModel[146] = new ModelRendererTurbo(this, 41, 113, textureX, textureY); // Box 193
		drgpassengerModel[147] = new ModelRendererTurbo(this, 497, 57, textureX, textureY); // Box 196
		drgpassengerModel[148] = new ModelRendererTurbo(this, 441, 65, textureX, textureY); // Box 198
		drgpassengerModel[149] = new ModelRendererTurbo(this, 441, 41, textureX, textureY); // Box 199
		drgpassengerModel[150] = new ModelRendererTurbo(this, 417, 49, textureX, textureY); // Box 200
		drgpassengerModel[151] = new ModelRendererTurbo(this, 385, 57, textureX, textureY); // Box 201
		drgpassengerModel[152] = new ModelRendererTurbo(this, 313, 33, textureX, textureY); // Box 202
		drgpassengerModel[153] = new ModelRendererTurbo(this, 41, 97, textureX, textureY); // Box 198
		drgpassengerModel[154] = new ModelRendererTurbo(this, 81, 97, textureX, textureY); // Box 199
		drgpassengerModel[155] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 214
		drgpassengerModel[156] = new ModelRendererTurbo(this, 465, 49, textureX, textureY); // Box 215
		drgpassengerModel[157] = new ModelRendererTurbo(this, 505, 49, textureX, textureY); // Box 216
		drgpassengerModel[158] = new ModelRendererTurbo(this, 409, 65, textureX, textureY); // Box 217
		drgpassengerModel[159] = new ModelRendererTurbo(this, 505, 33, textureX, textureY); // Box 218
		drgpassengerModel[160] = new ModelRendererTurbo(this, 433, 57, textureX, textureY); // Box 220
		drgpassengerModel[161] = new ModelRendererTurbo(this, 257, 113, textureX, textureY); // Box 221
		drgpassengerModel[162] = new ModelRendererTurbo(this, 457, 65, textureX, textureY); // Box 221
		drgpassengerModel[163] = new ModelRendererTurbo(this, 289, 41, textureX, textureY); // Box 222
		drgpassengerModel[164] = new ModelRendererTurbo(this, 433, 41, textureX, textureY); // Box 223
		drgpassengerModel[165] = new ModelRendererTurbo(this, 473, 41, textureX, textureY); // Box 224
		drgpassengerModel[166] = new ModelRendererTurbo(this, 369, 49, textureX, textureY); // Box 225
		drgpassengerModel[167] = new ModelRendererTurbo(this, 457, 49, textureX, textureY); // Box 226
		drgpassengerModel[168] = new ModelRendererTurbo(this, 9, 57, textureX, textureY); // Box 227
		drgpassengerModel[169] = new ModelRendererTurbo(this, 217, 57, textureX, textureY); // Box 228
		drgpassengerModel[170] = new ModelRendererTurbo(this, 473, 57, textureX, textureY); // Box 229
		drgpassengerModel[171] = new ModelRendererTurbo(this, 209, 81, textureX, textureY); // Box 235
		drgpassengerModel[172] = new ModelRendererTurbo(this, 329, 81, textureX, textureY); // Box 236
		drgpassengerModel[173] = new ModelRendererTurbo(this, 241, 97, textureX, textureY); // Box 237
		drgpassengerModel[174] = new ModelRendererTurbo(this, 273, 97, textureX, textureY); // Box 233
		drgpassengerModel[175] = new ModelRendererTurbo(this, 497, 65, textureX, textureY); // Box 242
		drgpassengerModel[176] = new ModelRendererTurbo(this, 441, 73, textureX, textureY); // Box 243
		drgpassengerModel[177] = new ModelRendererTurbo(this, 497, 73, textureX, textureY); // Box 244
		drgpassengerModel[178] = new ModelRendererTurbo(this, 33, 81, textureX, textureY); // Box 245
		drgpassengerModel[179] = new ModelRendererTurbo(this, 81, 81, textureX, textureY); // Box 256
		drgpassengerModel[180] = new ModelRendererTurbo(this, 169, 81, textureX, textureY); // Box 257
		drgpassengerModel[181] = new ModelRendererTurbo(this, 265, 81, textureX, textureY); // Box 258
		drgpassengerModel[182] = new ModelRendererTurbo(this, 305, 81, textureX, textureY); // Box 259
		drgpassengerModel[183] = new ModelRendererTurbo(this, 481, 65, textureX, textureY); // Box 264
		drgpassengerModel[184] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 265
		drgpassengerModel[185] = new ModelRendererTurbo(this, 497, 81, textureX, textureY); // Box 266
		drgpassengerModel[186] = new ModelRendererTurbo(this, 393, 81, textureX, textureY); // Box 267
		drgpassengerModel[187] = new ModelRendererTurbo(this, 33, 89, textureX, textureY); // Box 268
		drgpassengerModel[188] = new ModelRendererTurbo(this, 481, 73, textureX, textureY); // Box 269
		drgpassengerModel[189] = new ModelRendererTurbo(this, 505, 81, textureX, textureY); // Box 270
		drgpassengerModel[190] = new ModelRendererTurbo(this, 185, 89, textureX, textureY); // Box 271
		drgpassengerModel[191] = new ModelRendererTurbo(this, 81, 89, textureX, textureY); // Box 272
		drgpassengerModel[192] = new ModelRendererTurbo(this, 265, 89, textureX, textureY); // Box 273
		drgpassengerModel[193] = new ModelRendererTurbo(this, 193, 81, textureX, textureY); // Box 274
		drgpassengerModel[194] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 275
		drgpassengerModel[195] = new ModelRendererTurbo(this, 9, 97, textureX, textureY); // Box 276
		drgpassengerModel[196] = new ModelRendererTurbo(this, 305, 89, textureX, textureY); // Box 277
		drgpassengerModel[197] = new ModelRendererTurbo(this, 113, 97, textureX, textureY); // Box 278
		drgpassengerModel[198] = new ModelRendererTurbo(this, 137, 89, textureX, textureY); // Box 279
		drgpassengerModel[199] = new ModelRendererTurbo(this, 417, 97, textureX, textureY); // Box 280
		drgpassengerModel[200] = new ModelRendererTurbo(this, 425, 97, textureX, textureY); // Box 281
		drgpassengerModel[201] = new ModelRendererTurbo(this, 129, 97, textureX, textureY); // Box 282
		drgpassengerModel[202] = new ModelRendererTurbo(this, 153, 97, textureX, textureY); // Box 283
		drgpassengerModel[203] = new ModelRendererTurbo(this, 153, 89, textureX, textureY); // Box 284
		drgpassengerModel[204] = new ModelRendererTurbo(this, 433, 97, textureX, textureY); // Box 285
		drgpassengerModel[205] = new ModelRendererTurbo(this, 497, 97, textureX, textureY); // Box 286
		drgpassengerModel[206] = new ModelRendererTurbo(this, 193, 97, textureX, textureY); // Box 287
		drgpassengerModel[207] = new ModelRendererTurbo(this, 225, 97, textureX, textureY); // Box 288
		drgpassengerModel[208] = new ModelRendererTurbo(this, 169, 89, textureX, textureY); // Box 289
		drgpassengerModel[209] = new ModelRendererTurbo(this, 505, 97, textureX, textureY); // Box 290
		drgpassengerModel[210] = new ModelRendererTurbo(this, 489, 113, textureX, textureY); // Box 291
		drgpassengerModel[211] = new ModelRendererTurbo(this, 305, 97, textureX, textureY); // Box 292
		drgpassengerModel[212] = new ModelRendererTurbo(this, 321, 97, textureX, textureY); // Box 293
		drgpassengerModel[213] = new ModelRendererTurbo(this, 193, 89, textureX, textureY); // Box 294
		drgpassengerModel[214] = new ModelRendererTurbo(this, 497, 113, textureX, textureY); // Box 295
		drgpassengerModel[215] = new ModelRendererTurbo(this, 505, 113, textureX, textureY); // Box 296
		drgpassengerModel[216] = new ModelRendererTurbo(this, 345, 97, textureX, textureY); // Box 297
		drgpassengerModel[217] = new ModelRendererTurbo(this, 361, 97, textureX, textureY); // Box 298
		drgpassengerModel[218] = new ModelRendererTurbo(this, 209, 89, textureX, textureY); // Box 299
		drgpassengerModel[219] = new ModelRendererTurbo(this, 1, 121, textureX, textureY); // Box 300
		drgpassengerModel[220] = new ModelRendererTurbo(this, 9, 121, textureX, textureY); // Box 301
		drgpassengerModel[221] = new ModelRendererTurbo(this, 377, 97, textureX, textureY); // Box 302
		drgpassengerModel[222] = new ModelRendererTurbo(this, 393, 97, textureX, textureY); // Box 303
		drgpassengerModel[223] = new ModelRendererTurbo(this, 225, 89, textureX, textureY); // Box 304
		drgpassengerModel[224] = new ModelRendererTurbo(this, 17, 121, textureX, textureY); // Box 305
		drgpassengerModel[225] = new ModelRendererTurbo(this, 25, 121, textureX, textureY); // Box 306
		drgpassengerModel[226] = new ModelRendererTurbo(this, 441, 97, textureX, textureY); // Box 307
		drgpassengerModel[227] = new ModelRendererTurbo(this, 481, 97, textureX, textureY); // Box 308
		drgpassengerModel[228] = new ModelRendererTurbo(this, 457, 73, textureX, textureY); // Box 313
		drgpassengerModel[229] = new ModelRendererTurbo(this, 105, 81, textureX, textureY); // Box 314
		drgpassengerModel[230] = new ModelRendererTurbo(this, 361, 81, textureX, textureY); // Box 315
		drgpassengerModel[231] = new ModelRendererTurbo(this, 329, 89, textureX, textureY); // Box 316
		drgpassengerModel[232] = new ModelRendererTurbo(this, 345, 89, textureX, textureY); // Box 317
		drgpassengerModel[233] = new ModelRendererTurbo(this, 481, 89, textureX, textureY); // Box 318
		drgpassengerModel[234] = new ModelRendererTurbo(this, 169, 97, textureX, textureY); // Box 319
		drgpassengerModel[235] = new ModelRendererTurbo(this, 209, 97, textureX, textureY); // Box 320
		drgpassengerModel[236] = new ModelRendererTurbo(this, 33, 121, textureX, textureY); // Box 360
		drgpassengerModel[237] = new ModelRendererTurbo(this, 73, 97, textureX, textureY); // Box 361
		drgpassengerModel[238] = new ModelRendererTurbo(this, 41, 121, textureX, textureY); // Box 362
		drgpassengerModel[239] = new ModelRendererTurbo(this, 257, 121, textureX, textureY); // Box 363
		drgpassengerModel[240] = new ModelRendererTurbo(this, 273, 121, textureX, textureY); // Box 364
		drgpassengerModel[241] = new ModelRendererTurbo(this, 281, 121, textureX, textureY); // Box 365
		drgpassengerModel[242] = new ModelRendererTurbo(this, 289, 121, textureX, textureY); // Box 366
		drgpassengerModel[243] = new ModelRendererTurbo(this, 305, 121, textureX, textureY); // Box 367
		drgpassengerModel[244] = new ModelRendererTurbo(this, 321, 121, textureX, textureY); // Box 368
		drgpassengerModel[245] = new ModelRendererTurbo(this, 329, 121, textureX, textureY); // Box 369
		drgpassengerModel[246] = new ModelRendererTurbo(this, 345, 121, textureX, textureY); // Box 370
		drgpassengerModel[247] = new ModelRendererTurbo(this, 353, 121, textureX, textureY); // Box 371
		drgpassengerModel[248] = new ModelRendererTurbo(this, 369, 121, textureX, textureY); // Box 372
		drgpassengerModel[249] = new ModelRendererTurbo(this, 385, 121, textureX, textureY); // Box 373
		drgpassengerModel[250] = new ModelRendererTurbo(this, 393, 121, textureX, textureY); // Box 374
		drgpassengerModel[251] = new ModelRendererTurbo(this, 409, 121, textureX, textureY); // Box 375
		drgpassengerModel[252] = new ModelRendererTurbo(this, 425, 121, textureX, textureY); // Box 376
		drgpassengerModel[253] = new ModelRendererTurbo(this, 441, 121, textureX, textureY); // Box 377
		drgpassengerModel[254] = new ModelRendererTurbo(this, 449, 121, textureX, textureY); // Box 378
		drgpassengerModel[255] = new ModelRendererTurbo(this, 457, 121, textureX, textureY); // Box 379
		drgpassengerModel[256] = new ModelRendererTurbo(this, 473, 121, textureX, textureY); // Box 380
		drgpassengerModel[257] = new ModelRendererTurbo(this, 289, 129, textureX, textureY); // Box 381
		drgpassengerModel[258] = new ModelRendererTurbo(this, 305, 129, textureX, textureY); // Box 382
		drgpassengerModel[259] = new ModelRendererTurbo(this, 481, 121, textureX, textureY); // Box 383
		drgpassengerModel[260] = new ModelRendererTurbo(this, 329, 129, textureX, textureY); // Box 384
		drgpassengerModel[261] = new ModelRendererTurbo(this, 353, 129, textureX, textureY); // Box 385
		drgpassengerModel[262] = new ModelRendererTurbo(this, 361, 129, textureX, textureY); // Box 386
		drgpassengerModel[263] = new ModelRendererTurbo(this, 393, 129, textureX, textureY); // Box 387
		drgpassengerModel[264] = new ModelRendererTurbo(this, 377, 129, textureX, textureY); // Box 388
		drgpassengerModel[265] = new ModelRendererTurbo(this, 409, 129, textureX, textureY); // Box 389
		drgpassengerModel[266] = new ModelRendererTurbo(this, 425, 129, textureX, textureY); // Box 390
		drgpassengerModel[267] = new ModelRendererTurbo(this, 457, 129, textureX, textureY); // Box 391
		drgpassengerModel[268] = new ModelRendererTurbo(this, 489, 129, textureX, textureY); // Box 392
		drgpassengerModel[269] = new ModelRendererTurbo(this, 1, 137, textureX, textureY); // Box 393
		drgpassengerModel[270] = new ModelRendererTurbo(this, 433, 129, textureX, textureY); // Box 394
		drgpassengerModel[271] = new ModelRendererTurbo(this, 505, 129, textureX, textureY); // Box 395
		drgpassengerModel[272] = new ModelRendererTurbo(this, 17, 137, textureX, textureY); // Box 396
		drgpassengerModel[273] = new ModelRendererTurbo(this, 33, 137, textureX, textureY); // Box 397
		drgpassengerModel[274] = new ModelRendererTurbo(this, 49, 137, textureX, textureY); // Box 398
		drgpassengerModel[275] = new ModelRendererTurbo(this, 57, 137, textureX, textureY); // Box 399
		drgpassengerModel[276] = new ModelRendererTurbo(this, 73, 137, textureX, textureY); // Box 400
		drgpassengerModel[277] = new ModelRendererTurbo(this, 81, 137, textureX, textureY); // Box 401
		drgpassengerModel[278] = new ModelRendererTurbo(this, 97, 137, textureX, textureY); // Box 402
		drgpassengerModel[279] = new ModelRendererTurbo(this, 113, 137, textureX, textureY); // Box 403
		drgpassengerModel[280] = new ModelRendererTurbo(this, 121, 137, textureX, textureY); // Box 404
		drgpassengerModel[281] = new ModelRendererTurbo(this, 345, 57, textureX, textureY); // Box 406
		drgpassengerModel[282] = new ModelRendererTurbo(this, 297, 121, textureX, textureY); // Box 407
		drgpassengerModel[283] = new ModelRendererTurbo(this, 137, 137, textureX, textureY); // Box 408
		drgpassengerModel[284] = new ModelRendererTurbo(this, 145, 137, textureX, textureY); // Box 409
		drgpassengerModel[285] = new ModelRendererTurbo(this, 409, 97, textureX, textureY); // Box 410
		drgpassengerModel[286] = new ModelRendererTurbo(this, 153, 137, textureX, textureY); // Box 411
		drgpassengerModel[287] = new ModelRendererTurbo(this, 161, 137, textureX, textureY); // Box 412
		drgpassengerModel[288] = new ModelRendererTurbo(this, 361, 121, textureX, textureY); // Box 413
		drgpassengerModel[289] = new ModelRendererTurbo(this, 169, 137, textureX, textureY); // Box 414
		drgpassengerModel[290] = new ModelRendererTurbo(this, 417, 121, textureX, textureY); // Box 415
		drgpassengerModel[291] = new ModelRendererTurbo(this, 177, 137, textureX, textureY); // Box 416
		drgpassengerModel[292] = new ModelRendererTurbo(this, 185, 137, textureX, textureY); // Box 417
		drgpassengerModel[293] = new ModelRendererTurbo(this, 297, 129, textureX, textureY); // Box 418
		drgpassengerModel[294] = new ModelRendererTurbo(this, 193, 137, textureX, textureY); // Box 419
		drgpassengerModel[295] = new ModelRendererTurbo(this, 465, 129, textureX, textureY); // Box 420
		drgpassengerModel[296] = new ModelRendererTurbo(this, 201, 137, textureX, textureY); // Box 421
		drgpassengerModel[297] = new ModelRendererTurbo(this, 209, 137, textureX, textureY); // Box 422
		drgpassengerModel[298] = new ModelRendererTurbo(this, 217, 137, textureX, textureY); // Box 423
		drgpassengerModel[299] = new ModelRendererTurbo(this, 241, 137, textureX, textureY); // Box 424
		drgpassengerModel[300] = new ModelRendererTurbo(this, 25, 137, textureX, textureY); // Box 425
		drgpassengerModel[301] = new ModelRendererTurbo(this, 249, 137, textureX, textureY); // Box 397
		drgpassengerModel[302] = new ModelRendererTurbo(this, 257, 137, textureX, textureY); // Box 398
		drgpassengerModel[303] = new ModelRendererTurbo(this, 265, 137, textureX, textureY); // Box 362
		drgpassengerModel[304] = new ModelRendererTurbo(this, 297, 137, textureX, textureY); // Box 363
		drgpassengerModel[305] = new ModelRendererTurbo(this, 217, 137, textureX, textureY); // Box 364
		drgpassengerModel[306] = new ModelRendererTurbo(this, 313, 137, textureX, textureY); // Box 365
		drgpassengerModel[307] = new ModelRendererTurbo(this, 233, 137, textureX, textureY); // Box 366
		drgpassengerModel[308] = new ModelRendererTurbo(this, 329, 137, textureX, textureY); // Box 354
		drgpassengerModel[309] = new ModelRendererTurbo(this, 345, 137, textureX, textureY); // Box 355
		drgpassengerModel[310] = new ModelRendererTurbo(this, 361, 137, textureX, textureY); // Box 356
		drgpassengerModel[311] = new ModelRendererTurbo(this, 89, 137, textureX, textureY); // Box 357
		drgpassengerModel[312] = new ModelRendererTurbo(this, 377, 137, textureX, textureY); // Box 358
		drgpassengerModel[313] = new ModelRendererTurbo(this, 1, 153, textureX, textureY); // Box 436
		drgpassengerModel[314] = new ModelRendererTurbo(this, 1, 161, textureX, textureY); // Box 437
		drgpassengerModel[315] = new ModelRendererTurbo(this, 185, 161, textureX, textureY); // Box 438
		drgpassengerModel[316] = new ModelRendererTurbo(this, 1, 169, textureX, textureY); // Box 439
		drgpassengerModel[317] = new ModelRendererTurbo(this, 185, 169, textureX, textureY); // Box 440
		drgpassengerModel[318] = new ModelRendererTurbo(this, 1, 177, textureX, textureY); // Box 441
		drgpassengerModel[319] = new ModelRendererTurbo(this, 225, 105, textureX, textureY); // Box 442
		drgpassengerModel[320] = new ModelRendererTurbo(this, 393, 137, textureX, textureY); // Box 443
		drgpassengerModel[321] = new ModelRendererTurbo(this, 417, 137, textureX, textureY); // Box 444
		drgpassengerModel[322] = new ModelRendererTurbo(this, 473, 137, textureX, textureY); // Box 445
		drgpassengerModel[323] = new ModelRendererTurbo(this, 489, 137, textureX, textureY); // Box 446
		drgpassengerModel[324] = new ModelRendererTurbo(this, 1, 145, textureX, textureY); // Box 447
		drgpassengerModel[325] = new ModelRendererTurbo(this, 17, 145, textureX, textureY); // Box 448
		drgpassengerModel[326] = new ModelRendererTurbo(this, 33, 145, textureX, textureY); // Box 449
		drgpassengerModel[327] = new ModelRendererTurbo(this, 57, 145, textureX, textureY); // Box 450
		drgpassengerModel[328] = new ModelRendererTurbo(this, 81, 145, textureX, textureY); // Box 451
		drgpassengerModel[329] = new ModelRendererTurbo(this, 97, 145, textureX, textureY); // Box 452
		drgpassengerModel[330] = new ModelRendererTurbo(this, 121, 145, textureX, textureY); // Box 454
		drgpassengerModel[331] = new ModelRendererTurbo(this, 153, 145, textureX, textureY); // Box 455
		drgpassengerModel[332] = new ModelRendererTurbo(this, 177, 145, textureX, textureY); // Box 456
		drgpassengerModel[333] = new ModelRendererTurbo(this, 201, 145, textureX, textureY); // Box 457
		drgpassengerModel[334] = new ModelRendererTurbo(this, 233, 145, textureX, textureY); // Box 458
		drgpassengerModel[335] = new ModelRendererTurbo(this, 265, 145, textureX, textureY); // Box 459
		drgpassengerModel[336] = new ModelRendererTurbo(this, 281, 145, textureX, textureY); // Box 460
		drgpassengerModel[337] = new ModelRendererTurbo(this, 297, 145, textureX, textureY); // Box 461
		drgpassengerModel[338] = new ModelRendererTurbo(this, 473, 137, textureX, textureY); // Box 463
		drgpassengerModel[339] = new ModelRendererTurbo(this, 385, 145, textureX, textureY); // Box 464
		drgpassengerModel[340] = new ModelRendererTurbo(this, 417, 145, textureX, textureY); // Box 465
		drgpassengerModel[341] = new ModelRendererTurbo(this, 369, 153, textureX, textureY); // Box 467
		drgpassengerModel[342] = new ModelRendererTurbo(this, 449, 153, textureX, textureY); // Box 468
		drgpassengerModel[343] = new ModelRendererTurbo(this, 465, 153, textureX, textureY); // Box 469
		drgpassengerModel[344] = new ModelRendererTurbo(this, 177, 153, textureX, textureY); // Box 470
		drgpassengerModel[345] = new ModelRendererTurbo(this, 201, 153, textureX, textureY); // Box 471
		drgpassengerModel[346] = new ModelRendererTurbo(this, 225, 153, textureX, textureY); // Box 472
		drgpassengerModel[347] = new ModelRendererTurbo(this, 249, 153, textureX, textureY); // Box 473
		drgpassengerModel[348] = new ModelRendererTurbo(this, 505, 145, textureX, textureY); // Box 474
		drgpassengerModel[349] = new ModelRendererTurbo(this, 433, 161, textureX, textureY); // Box 475
		drgpassengerModel[350] = new ModelRendererTurbo(this, 313, 145, textureX, textureY); // Box 477
		drgpassengerModel[351] = new ModelRendererTurbo(this, 193, 153, textureX, textureY); // Box 477
		drgpassengerModel[352] = new ModelRendererTurbo(this, 9, 145, textureX, textureY); // Box 478
		drgpassengerModel[353] = new ModelRendererTurbo(this, 25, 145, textureX, textureY); // Box 479
		drgpassengerModel[354] = new ModelRendererTurbo(this, 265, 153, textureX, textureY); // Box 481
		drgpassengerModel[355] = new ModelRendererTurbo(this, 89, 145, textureX, textureY); // Box 484
		drgpassengerModel[356] = new ModelRendererTurbo(this, 217, 153, textureX, textureY); // Box 485
		drgpassengerModel[357] = new ModelRendererTurbo(this, 273, 145, textureX, textureY); // Box 486
		drgpassengerModel[358] = new ModelRendererTurbo(this, 289, 153, textureX, textureY); // Box 487
		drgpassengerModel[359] = new ModelRendererTurbo(this, 289, 145, textureX, textureY); // Box 490
		drgpassengerModel[360] = new ModelRendererTurbo(this, 241, 153, textureX, textureY); // Box 491
		drgpassengerModel[361] = new ModelRendererTurbo(this, 305, 145, textureX, textureY); // Box 492
		drgpassengerModel[362] = new ModelRendererTurbo(this, 321, 177, textureX, textureY); // Box 493
		drgpassengerModel[363] = new ModelRendererTurbo(this, 473, 145, textureX, textureY); // Box 496
		drgpassengerModel[364] = new ModelRendererTurbo(this, 313, 153, textureX, textureY); // Box 497
		drgpassengerModel[365] = new ModelRendererTurbo(this, 489, 145, textureX, textureY); // Box 498
		drgpassengerModel[366] = new ModelRendererTurbo(this, 409, 177, textureX, textureY); // Box 499
		drgpassengerModel[367] = new ModelRendererTurbo(this, 377, 153, textureX, textureY); // Box 392
		drgpassengerModel[368] = new ModelRendererTurbo(this, 329, 137, textureX, textureY); // Box 393
		drgpassengerModel[369] = new ModelRendererTurbo(this, 401, 153, textureX, textureY); // Box 394
		drgpassengerModel[370] = new ModelRendererTurbo(this, 401, 137, textureX, textureY); // Box 395
		drgpassengerModel[371] = new ModelRendererTurbo(this, 41, 185, textureX, textureY); // Box 396
		drgpassengerModel[372] = new ModelRendererTurbo(this, 73, 185, textureX, textureY); // Box 397
		drgpassengerModel[373] = new ModelRendererTurbo(this, 457, 137, textureX, textureY); // Box 398
		drgpassengerModel[374] = new ModelRendererTurbo(this, 193, 177, textureX, textureY); // Box 399
		drgpassengerModel[375] = new ModelRendererTurbo(this, 497, 137, textureX, textureY); // Box 400
		drgpassengerModel[376] = new ModelRendererTurbo(this, 241, 177, textureX, textureY); // Box 401
		drgpassengerModel[377] = new ModelRendererTurbo(this, 105, 185, textureX, textureY); // Box 402
		drgpassengerModel[378] = new ModelRendererTurbo(this, 273, 177, textureX, textureY); // Box 403
		drgpassengerModel[379] = new ModelRendererTurbo(this, 41, 145, textureX, textureY); // Box 404
		drgpassengerModel[380] = new ModelRendererTurbo(this, 137, 185, textureX, textureY); // Box 405
		drgpassengerModel[381] = new ModelRendererTurbo(this, 65, 145, textureX, textureY); // Box 406
		drgpassengerModel[382] = new ModelRendererTurbo(this, 153, 185, textureX, textureY); // Box 407
		drgpassengerModel[383] = new ModelRendererTurbo(this, 105, 145, textureX, textureY); // Box 408
		drgpassengerModel[384] = new ModelRendererTurbo(this, 193, 185, textureX, textureY); // Box 409
		drgpassengerModel[385] = new ModelRendererTurbo(this, 241, 185, textureX, textureY); // Box 410
		drgpassengerModel[386] = new ModelRendererTurbo(this, 129, 145, textureX, textureY); // Box 411
		drgpassengerModel[387] = new ModelRendererTurbo(this, 321, 185, textureX, textureY); // Box 412
		drgpassengerModel[388] = new ModelRendererTurbo(this, 321, 145, textureX, textureY); // Box 413
		drgpassengerModel[389] = new ModelRendererTurbo(this, 273, 185, textureX, textureY); // Box 414
		drgpassengerModel[390] = new ModelRendererTurbo(this, 353, 145, textureX, textureY); // Box 415
		drgpassengerModel[391] = new ModelRendererTurbo(this, 361, 185, textureX, textureY); // Box 416
		drgpassengerModel[392] = new ModelRendererTurbo(this, 377, 185, textureX, textureY); // Box 417
		drgpassengerModel[393] = new ModelRendererTurbo(this, 481, 113, textureX, textureY); // Box 418
		drgpassengerModel[394] = new ModelRendererTurbo(this, 441, 161, textureX, textureY); // Box 419
		drgpassengerModel[395] = new ModelRendererTurbo(this, 481, 161, textureX, textureY); // Box 420
		drgpassengerModel[396] = new ModelRendererTurbo(this, 489, 161, textureX, textureY); // Box 421
		drgpassengerModel[397] = new ModelRendererTurbo(this, 209, 177, textureX, textureY); // Box 422
		drgpassengerModel[398] = new ModelRendererTurbo(this, 257, 177, textureX, textureY); // Box 423
		drgpassengerModel[399] = new ModelRendererTurbo(this, 289, 177, textureX, textureY); // Box 424
		drgpassengerModel[400] = new ModelRendererTurbo(this, 441, 177, textureX, textureY); // Box 425
		drgpassengerModel[401] = new ModelRendererTurbo(this, 1, 185, textureX, textureY); // Box 426
		drgpassengerModel[402] = new ModelRendererTurbo(this, 457, 153, textureX, textureY); // Box 427
		drgpassengerModel[403] = new ModelRendererTurbo(this, 417, 145, textureX, textureY); // Box 432
		drgpassengerModel[404] = new ModelRendererTurbo(this, 425, 145, textureX, textureY); // Box 433
		drgpassengerModel[405] = new ModelRendererTurbo(this, 409, 185, textureX, textureY); // Box 434
		drgpassengerModel[406] = new ModelRendererTurbo(this, 353, 153, textureX, textureY); // Box 435
		drgpassengerModel[407] = new ModelRendererTurbo(this, 425, 185, textureX, textureY); // Box 436
		drgpassengerModel[408] = new ModelRendererTurbo(this, 409, 169, textureX, textureY); // Box 437
		drgpassengerModel[409] = new ModelRendererTurbo(this, 449, 185, textureX, textureY); // Box 438
		drgpassengerModel[410] = new ModelRendererTurbo(this, 505, 169, textureX, textureY); // Box 439
		drgpassengerModel[411] = new ModelRendererTurbo(this, 465, 185, textureX, textureY); // Box 440
		drgpassengerModel[412] = new ModelRendererTurbo(this, 370, 189, textureX, textureY); // Box 437
		drgpassengerModel[413] = new ModelRendererTurbo(this, 377, 190, textureX, textureY); // Box 438
		drgpassengerModel[414] = new ModelRendererTurbo(this, 370, 189, textureX, textureY); // Box 439
		drgpassengerModel[415] = new ModelRendererTurbo(this, 361, 81, textureX, textureY); // Box 444
		drgpassengerModel[416] = new ModelRendererTurbo(this, 267, 81, textureX, textureY); // Box 444
		drgpassengerModel[417] = new ModelRendererTurbo(this, 361, 81, textureX, textureY); // Box 445
		drgpassengerModel[418] = new ModelRendererTurbo(this, 225, 81, textureX, textureY); // Box 446
		drgpassengerModel[419] = new ModelRendererTurbo(this, 479, 81, textureX, textureY); // Box 447
		drgpassengerModel[420] = new ModelRendererTurbo(this, 329, 89, textureX, textureY); // Box 448
		drgpassengerModel[421] = new ModelRendererTurbo(this, 209, 89, textureX, textureY); // Box 449
		drgpassengerModel[422] = new ModelRendererTurbo(this, 169, 89, textureX, textureY); // Box 450
		drgpassengerModel[423] = new ModelRendererTurbo(this, 479, 81, textureX, textureY); // Box 451
		drgpassengerModel[424] = new ModelRendererTurbo(this, 377, 81, textureX, textureY); // Box 452
		drgpassengerModel[425] = new ModelRendererTurbo(this, 345, 81, textureX, textureY); // Box 453
		drgpassengerModel[426] = new ModelRendererTurbo(this, 313, 81, textureX, textureY); // Box 454
		drgpassengerModel[427] = new ModelRendererTurbo(this, 257, 177, textureX, textureY); // Box 444
		drgpassengerModel[428] = new ModelRendererTurbo(this, 257, 177, textureX, textureY); // Box 445
		drgpassengerModel[429] = new ModelRendererTurbo(this, 257, 177, textureX, textureY); // Box 446
		drgpassengerModel[430] = new ModelRendererTurbo(this, 257, 177, textureX, textureY); // Box 447
		drgpassengerModel[431] = new ModelRendererTurbo(this, 257, 177, textureX, textureY); // Box 448
		drgpassengerModel[432] = new ModelRendererTurbo(this, 257, 177, textureX, textureY); // Box 449
		drgpassengerModel[433] = new ModelRendererTurbo(this, 257, 177, textureX, textureY); // Box 450
		drgpassengerModel[434] = new ModelRendererTurbo(this, 257, 177, textureX, textureY); // Box 451
		drgpassengerModel[435] = new ModelRendererTurbo(this, 257, 177, textureX, textureY); // Box 452
		drgpassengerModel[436] = new ModelRendererTurbo(this, 257, 177, textureX, textureY); // Box 453
		drgpassengerModel[437] = new ModelRendererTurbo(this, 257, 177, textureX, textureY); // Box 454
		drgpassengerModel[438] = new ModelRendererTurbo(this, 257, 177, textureX, textureY); // Box 455
		drgpassengerModel[439] = new ModelRendererTurbo(this, 257, 177, textureX, textureY); // Box 456
		drgpassengerModel[440] = new ModelRendererTurbo(this, 257, 177, textureX, textureY); // Box 457
		drgpassengerModel[441] = new ModelRendererTurbo(this, 257, 177, textureX, textureY); // Box 458
		drgpassengerModel[442] = new ModelRendererTurbo(this, 257, 177, textureX, textureY); // Box 459
		drgpassengerModel[443] = new ModelRendererTurbo(this, 492, 242, textureX, textureY); // Box 515
		drgpassengerModel[444] = new ModelRendererTurbo(this, 464, 247, textureX, textureY); // Box 517
		drgpassengerModel[445] = new ModelRendererTurbo(this, 492, 246, textureX, textureY); // Box 520
		drgpassengerModel[446] = new ModelRendererTurbo(this, 475, 235, textureX, textureY); // Box 525
		drgpassengerModel[447] = new ModelRendererTurbo(this, 484, 240, textureX, textureY); // Box 527
		drgpassengerModel[448] = new ModelRendererTurbo(this, 484, 237, textureX, textureY); // Box 528
		drgpassengerModel[449] = new ModelRendererTurbo(this, 484, 246, textureX, textureY); // Box 529
		drgpassengerModel[450] = new ModelRendererTurbo(this, 484, 243, textureX, textureY); // Box 530
		drgpassengerModel[451] = new ModelRendererTurbo(this, 475, 235, textureX, textureY); // Box 477
		drgpassengerModel[452] = new ModelRendererTurbo(this, 484, 240, textureX, textureY); // Box 478
		drgpassengerModel[453] = new ModelRendererTurbo(this, 484, 243, textureX, textureY); // Box 479
		drgpassengerModel[454] = new ModelRendererTurbo(this, 484, 246, textureX, textureY); // Box 480
		drgpassengerModel[455] = new ModelRendererTurbo(this, 492, 246, textureX, textureY); // Box 481
		drgpassengerModel[456] = new ModelRendererTurbo(this, 492, 242, textureX, textureY); // Box 482
		drgpassengerModel[457] = new ModelRendererTurbo(this, 464, 247, textureX, textureY); // Box 483
		drgpassengerModel[458] = new ModelRendererTurbo(this, 484, 237, textureX, textureY); // Box 484
		drgpassengerModel[459] = new ModelRendererTurbo(this, 337, 177, textureX, textureY); // Box 509
		drgpassengerModel[460] = new ModelRendererTurbo(this, 337, 177, textureX, textureY); // Box 510
		drgpassengerModel[461] = new ModelRendererTurbo(this, 1, 185, textureX, textureY); // Box 511
		drgpassengerModel[462] = new ModelRendererTurbo(this, 1, 185, textureX, textureY); // Box 512
		drgpassengerModel[463] = new ModelRendererTurbo(this, 337, 177, textureX, textureY); // Box 513
		drgpassengerModel[464] = new ModelRendererTurbo(this, 1, 185, textureX, textureY); // Box 514
		drgpassengerModel[465] = new ModelRendererTurbo(this, 337, 177, textureX, textureY); // Box 515
		drgpassengerModel[466] = new ModelRendererTurbo(this, 337, 177, textureX, textureY); // Box 516
		drgpassengerModel[467] = new ModelRendererTurbo(this, 337, 177, textureX, textureY); // Box 517
		drgpassengerModel[468] = new ModelRendererTurbo(this, 337, 177, textureX, textureY); // Box 518
		drgpassengerModel[469] = new ModelRendererTurbo(this, 337, 177, textureX, textureY); // Box 519
		drgpassengerModel[470] = new ModelRendererTurbo(this, 1, 185, textureX, textureY); // Box 520
		drgpassengerModel[471] = new ModelRendererTurbo(this, 1, 185, textureX, textureY); // Box 521
		drgpassengerModel[472] = new ModelRendererTurbo(this, 1, 185, textureX, textureY); // Box 522
		drgpassengerModel[473] = new ModelRendererTurbo(this, 1, 185, textureX, textureY); // Box 523
		drgpassengerModel[474] = new ModelRendererTurbo(this, 1, 185, textureX, textureY); // Box 524
		drgpassengerModel[475] = new ModelRendererTurbo(this, 1, 185, textureX, textureY); // Box 525
		drgpassengerModel[476] = new ModelRendererTurbo(this, 1, 185, textureX, textureY); // Box 510
		drgpassengerModel[477] = new ModelRendererTurbo(this, 1, 185, textureX, textureY); // Box 511
		drgpassengerModel[478] = new ModelRendererTurbo(this, 1, 185, textureX, textureY); // Box 512
		drgpassengerModel[479] = new ModelRendererTurbo(this, 1, 185, textureX, textureY); // Box 513
		drgpassengerModel[480] = new ModelRendererTurbo(this, 1, 185, textureX, textureY); // Box 514
		drgpassengerModel[481] = new ModelRendererTurbo(this, 1, 185, textureX, textureY); // Box 515
		drgpassengerModel[482] = new ModelRendererTurbo(this, 1, 185, textureX, textureY); // Box 516
		drgpassengerModel[483] = new ModelRendererTurbo(this, 337, 177, textureX, textureY); // Box 517
		drgpassengerModel[484] = new ModelRendererTurbo(this, 337, 177, textureX, textureY); // Box 518
		drgpassengerModel[485] = new ModelRendererTurbo(this, 337, 177, textureX, textureY); // Box 519
		drgpassengerModel[486] = new ModelRendererTurbo(this, 337, 177, textureX, textureY); // Box 520
		drgpassengerModel[487] = new ModelRendererTurbo(this, 337, 177, textureX, textureY); // Box 521
		drgpassengerModel[488] = new ModelRendererTurbo(this, 337, 177, textureX, textureY); // Box 522
		drgpassengerModel[489] = new ModelRendererTurbo(this, 337, 177, textureX, textureY); // Box 523
		drgpassengerModel[490] = new ModelRendererTurbo(this, 1, 185, textureX, textureY); // Box 524
		drgpassengerModel[491] = new ModelRendererTurbo(this, 1, 185, textureX, textureY); // Box 525
		drgpassengerModel[492] = new ModelRendererTurbo(this, 337, 177, textureX, textureY); // Box 526
		drgpassengerModel[493] = new ModelRendererTurbo(this, 1, 185, textureX, textureY); // Box 527
		drgpassengerModel[494] = new ModelRendererTurbo(this, 1, 185, textureX, textureY); // Box 528
		drgpassengerModel[495] = new ModelRendererTurbo(this, 1, 185, textureX, textureY); // Box 529
		drgpassengerModel[496] = new ModelRendererTurbo(this, 1, 185, textureX, textureY); // Box 530
		drgpassengerModel[497] = new ModelRendererTurbo(this, 1, 185, textureX, textureY); // Box 531
		drgpassengerModel[498] = new ModelRendererTurbo(this, 1, 185, textureX, textureY); // Box 532
		drgpassengerModel[499] = new ModelRendererTurbo(this, 1, 185, textureX, textureY); // Box 533
		drgpassengerModel[500] = new ModelRendererTurbo(this, 337, 177, textureX, textureY); // Box 534
		drgpassengerModel[501] = new ModelRendererTurbo(this, 337, 177, textureX, textureY); // Box 535
		drgpassengerModel[502] = new ModelRendererTurbo(this, 337, 177, textureX, textureY); // Box 536
		drgpassengerModel[503] = new ModelRendererTurbo(this, 337, 177, textureX, textureY); // Box 537
		drgpassengerModel[504] = new ModelRendererTurbo(this, 337, 177, textureX, textureY); // Box 538
		drgpassengerModel[505] = new ModelRendererTurbo(this, 337, 177, textureX, textureY); // Box 539
		drgpassengerModel[506] = new ModelRendererTurbo(this, 337, 177, textureX, textureY); // Box 540
		drgpassengerModel[507] = new ModelRendererTurbo(this, 1, 185, textureX, textureY); // Box 541
		drgpassengerModel[508] = new ModelRendererTurbo(this, 1, 185, textureX, textureY); // Box 542
		drgpassengerModel[509] = new ModelRendererTurbo(this, 337, 177, textureX, textureY); // Box 543
		drgpassengerModel[510] = new ModelRendererTurbo(this, 1, 185, textureX, textureY); // Box 544
		drgpassengerModel[511] = new ModelRendererTurbo(this, 1, 185, textureX, textureY); // Box 545
		drgpassengerModel[512] = new ModelRendererTurbo(this, 1, 185, textureX, textureY); // Box 546
		drgpassengerModel[513] = new ModelRendererTurbo(this, 1, 185, textureX, textureY); // Box 547
		drgpassengerModel[514] = new ModelRendererTurbo(this, 1, 185, textureX, textureY); // Box 548
		drgpassengerModel[515] = new ModelRendererTurbo(this, 1, 185, textureX, textureY); // Box 549
		drgpassengerModel[516] = new ModelRendererTurbo(this, 1, 185, textureX, textureY); // Box 550
		drgpassengerModel[517] = new ModelRendererTurbo(this, 337, 177, textureX, textureY); // Box 551
		drgpassengerModel[518] = new ModelRendererTurbo(this, 337, 177, textureX, textureY); // Box 552
		drgpassengerModel[519] = new ModelRendererTurbo(this, 337, 177, textureX, textureY); // Box 553
		drgpassengerModel[520] = new ModelRendererTurbo(this, 337, 177, textureX, textureY); // Box 554
		drgpassengerModel[521] = new ModelRendererTurbo(this, 337, 177, textureX, textureY); // Box 555
		drgpassengerModel[522] = new ModelRendererTurbo(this, 337, 177, textureX, textureY); // Box 556
		drgpassengerModel[523] = new ModelRendererTurbo(this, 337, 177, textureX, textureY); // Box 557
		drgpassengerModel[524] = new ModelRendererTurbo(this, 1, 185, textureX, textureY); // Box 558
		drgpassengerModel[525] = new ModelRendererTurbo(this, 1, 185, textureX, textureY); // Box 559
		drgpassengerModel[526] = new ModelRendererTurbo(this, 337, 177, textureX, textureY); // Box 560
		drgpassengerModel[527] = new ModelRendererTurbo(this, 481, 113, textureX, textureY); // Box 572
		drgpassengerModel[528] = new ModelRendererTurbo(this, 370, 189, textureX, textureY); // Box 573
		drgpassengerModel[529] = new ModelRendererTurbo(this, 345, 137, textureX, textureY); // Box 574
		drgpassengerModel[530] = new ModelRendererTurbo(this, 217, 137, textureX, textureY); // Box 575
		drgpassengerModel[531] = new ModelRendererTurbo(this, 377, 190, textureX, textureY); // Box 576
		drgpassengerModel[532] = new ModelRendererTurbo(this, 361, 137, textureX, textureY); // Box 577
		drgpassengerModel[533] = new ModelRendererTurbo(this, 370, 189, textureX, textureY); // Box 578
		drgpassengerModel[534] = new ModelRendererTurbo(this, 377, 137, textureX, textureY); // Box 579
		drgpassengerModel[535] = new ModelRendererTurbo(this, 433, 137, textureX, textureY); // Box 580

		drgpassengerModel[0].addBox(0F, 0F, 0F, 6, 6, 0, 0F); // Box 0
		drgpassengerModel[0].setRotationPoint(36F, 4F, -5F);

		drgpassengerModel[1].addBox(0F, 0F, 0F, 6, 6, 0, 0F); // Box 2
		drgpassengerModel[1].setRotationPoint(36F, 4F, 5F);

		drgpassengerModel[2].addBox(0F, 0F, 0F, 2, 1, 20, 0F); // Box 3
		drgpassengerModel[2].setRotationPoint(-55F, 2F, -10F);

		drgpassengerModel[3].addBox(0F, 0F, 0F, 6, 6, 0, 0F); // Box 4
		drgpassengerModel[3].setRotationPoint(25F, 4F, 5F);

		drgpassengerModel[4].addBox(0F, 0F, 0F, 6, 6, 0, 0F); // Box 5
		drgpassengerModel[4].setRotationPoint(25F, 4F, -5F);

		drgpassengerModel[5].addBox(0F, 0F, 0F, 1, 10, 6, 0F); // Box 21
		drgpassengerModel[5].setRotationPoint(-45F, -8F, -9F);

		drgpassengerModel[6].addBox(0F, 0F, 0F, 1, 10, 6, 0F); // Box 22
		drgpassengerModel[6].setRotationPoint(-45F, -8F, 3F);

		drgpassengerModel[7].addShapeBox(0F, 0F, 0F, 90, 10, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 23
		drgpassengerModel[7].setRotationPoint(-45F, -8F, 9F);

		drgpassengerModel[8].addShapeBox(0F, 0F, 0F, 4, 9, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 26
		drgpassengerModel[8].setRotationPoint(-45F, -17F, 9F);

		drgpassengerModel[9].addBox(0F, 0F, 0F, 1, 9, 2, 0F); // Box 36
		drgpassengerModel[9].setRotationPoint(-45F, -17F, -5F);

		drgpassengerModel[10].addBox(0F, 0F, 0F, 1, 9, 2, 0F); // Box 37
		drgpassengerModel[10].setRotationPoint(-45F, -17F, 7F);

		drgpassengerModel[11].addBox(0F, 0F, 0F, 1, 9, 2, 0F); // Box 38
		drgpassengerModel[11].setRotationPoint(-45F, -17F, 3F);

		drgpassengerModel[12].addBox(0F, 0F, 0F, 1, 9, 2, 0F); // Box 40
		drgpassengerModel[12].setRotationPoint(-45F, -17F, -9F);

		drgpassengerModel[13].addShapeBox(0F, 0F, 0F, 90, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 54
		drgpassengerModel[13].setRotationPoint(-45F, -20F, 9F);

		drgpassengerModel[14].addBox(0F, 0F, 0F, 1, 3, 18, 0F); // Box 55
		drgpassengerModel[14].setRotationPoint(-45F, -20F, -9F);

		drgpassengerModel[15].addBox(0F, 0F, 0F, 1, 9, 1, 0F); // Box 65
		drgpassengerModel[15].setRotationPoint(-54F, -7F, -10F);

		drgpassengerModel[16].addBox(0F, 0F, 0F, 1, 9, 1, 0F); // Box 67
		drgpassengerModel[16].setRotationPoint(-54F, -7F, -7F);

		drgpassengerModel[17].addBox(0F, 0F, 0F, 1, 9, 1, 0F); // Box 68
		drgpassengerModel[17].setRotationPoint(-54F, -7F, -4F);

		drgpassengerModel[18].addBox(0F, 0F, 0F, 1, 9, 1, 0F); // Box 69
		drgpassengerModel[18].setRotationPoint(-54F, -7F, 3F);

		drgpassengerModel[19].addBox(0F, 0F, 0F, 1, 9, 1, 0F); // Box 70
		drgpassengerModel[19].setRotationPoint(-54F, -7F, 6F);

		drgpassengerModel[20].addBox(0F, 0F, 0F, 1, 9, 1, 0F); // Box 71
		drgpassengerModel[20].setRotationPoint(-54F, -7F, 9F);

		drgpassengerModel[21].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 72
		drgpassengerModel[21].setRotationPoint(-53F, -8F, -3F);
		drgpassengerModel[21].rotateAngleY = -3.14159265F;

		drgpassengerModel[22].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		drgpassengerModel[22].setRotationPoint(-53F, -8F, 10F);
		drgpassengerModel[22].rotateAngleY = -3.14159265F;

		drgpassengerModel[23].addBox(0F, 0F, 0F, 6, 6, 0, 0F); // Box 65
		drgpassengerModel[23].setRotationPoint(-42F, 4F, -5F);

		drgpassengerModel[24].addBox(0F, 0F, 0F, 6, 6, 0, 0F); // Box 66
		drgpassengerModel[24].setRotationPoint(-31F, 4F, -5F);

		drgpassengerModel[25].addBox(0F, 0F, 0F, 6, 6, 0, 0F); // Box 68
		drgpassengerModel[25].setRotationPoint(-42F, 4F, 5F);

		drgpassengerModel[26].addBox(0F, 0F, 0F, 6, 6, 0, 0F); // Box 69
		drgpassengerModel[26].setRotationPoint(-31F, 4F, 5F);

		drgpassengerModel[27].addBox(0F, 0F, 0F, 4, 9, 1, 0F); // Box 71
		drgpassengerModel[27].setRotationPoint(-36F, -17F, 9F);

		drgpassengerModel[28].addBox(0F, 0F, 0F, 4, 9, 1, 0F); // Box 72
		drgpassengerModel[28].setRotationPoint(-27F, -17F, 9F);

		drgpassengerModel[29].addBox(0F, 0F, 0F, 4, 9, 1, 0F); // Box 73
		drgpassengerModel[29].setRotationPoint(-18F, -17F, 9F);

		drgpassengerModel[30].addBox(0F, 0F, 0F, 4, 9, 1, 0F); // Box 74
		drgpassengerModel[30].setRotationPoint(-9F, -17F, 9F);

		drgpassengerModel[31].addBox(0F, 0F, 0F, 4, 9, 1, 0F); // Box 75
		drgpassengerModel[31].setRotationPoint(0F, -17F, 9F);

		drgpassengerModel[32].addBox(0F, 0F, 0F, 4, 9, 1, 0F); // Box 76
		drgpassengerModel[32].setRotationPoint(9F, -17F, 9F);

		drgpassengerModel[33].addBox(0F, 0F, 0F, 4, 9, 1, 0F); // Box 77
		drgpassengerModel[33].setRotationPoint(18F, -17F, 9F);

		drgpassengerModel[34].addBox(0F, 0F, 0F, 4, 9, 1, 0F); // Box 78
		drgpassengerModel[34].setRotationPoint(27F, -17F, 9F);

		drgpassengerModel[35].addShapeBox(0F, 0F, 0F, 9, 9, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 79
		drgpassengerModel[35].setRotationPoint(36F, -17F, 9F);

		drgpassengerModel[36].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Box 91
		drgpassengerModel[36].setRotationPoint(-54F, -6F, -3F);

		drgpassengerModel[37].addShapeBox(0F, 0F, 0F, 90, 10, 1, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 94
		drgpassengerModel[37].setRotationPoint(-45F, -8F, -10F);

		drgpassengerModel[38].addBox(0F, 0F, 0F, 1, 10, 6, 0F); // Box 95
		drgpassengerModel[38].setRotationPoint(44F, -8F, -9F);

		drgpassengerModel[39].addBox(0F, 0F, 0F, 1, 10, 6, 0F); // Box 96
		drgpassengerModel[39].setRotationPoint(44F, -8F, 3F);

		drgpassengerModel[40].addBox(0F, 0F, 0F, 1, 3, 18, 0F); // Box 97
		drgpassengerModel[40].setRotationPoint(44F, -20F, -9F);

		drgpassengerModel[41].addBox(0F, 0F, 0F, 1, 9, 2, 0F); // Box 98
		drgpassengerModel[41].setRotationPoint(44F, -17F, 7F);

		drgpassengerModel[42].addBox(0F, 0F, 0F, 1, 9, 2, 0F); // Box 99
		drgpassengerModel[42].setRotationPoint(44F, -17F, 3F);

		drgpassengerModel[43].addBox(0F, 0F, 0F, 1, 9, 2, 0F); // Box 100
		drgpassengerModel[43].setRotationPoint(44F, -17F, -5F);

		drgpassengerModel[44].addBox(0F, 0F, 0F, 1, 9, 2, 0F); // Box 101
		drgpassengerModel[44].setRotationPoint(44F, -17F, -9F);

		drgpassengerModel[45].addShapeBox(0F, 0F, 0F, 9, 9, 1, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 102
		drgpassengerModel[45].setRotationPoint(36F, -17F, -10F);

		drgpassengerModel[46].addShapeBox(0F, 0F, 0F, 90, 3, 1, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 103
		drgpassengerModel[46].setRotationPoint(-45F, -20F, -10F);

		drgpassengerModel[47].addShapeBox(0F, 0F, 0F, 4, 9, 1, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 104
		drgpassengerModel[47].setRotationPoint(-45F, -17F, -10F);

		drgpassengerModel[48].addBox(0F, 0F, 0F, 4, 9, 1, 0F); // Box 108
		drgpassengerModel[48].setRotationPoint(-36F, -17F, -10F);

		drgpassengerModel[49].addBox(0F, 0F, 0F, 4, 9, 1, 0F); // Box 109
		drgpassengerModel[49].setRotationPoint(-27F, -17F, -10F);

		drgpassengerModel[50].addBox(0F, 0F, 0F, 4, 9, 1, 0F); // Box 110
		drgpassengerModel[50].setRotationPoint(-18F, -17F, -10F);

		drgpassengerModel[51].addBox(0F, 0F, 0F, 4, 9, 1, 0F); // Box 111
		drgpassengerModel[51].setRotationPoint(-9F, -17F, -10F);

		drgpassengerModel[52].addBox(0F, 0F, 0F, 4, 9, 1, 0F); // Box 112
		drgpassengerModel[52].setRotationPoint(0F, -17F, -10F);

		drgpassengerModel[53].addBox(0F, 0F, 0F, 4, 9, 1, 0F); // Box 113
		drgpassengerModel[53].setRotationPoint(9F, -17F, -10F);

		drgpassengerModel[54].addBox(0F, 0F, 0F, 4, 9, 1, 0F); // Box 114
		drgpassengerModel[54].setRotationPoint(18F, -17F, -10F);

		drgpassengerModel[55].addBox(0F, 0F, 0F, 4, 9, 1, 0F); // Box 115
		drgpassengerModel[55].setRotationPoint(27F, -17F, -10F);

		drgpassengerModel[56].addBox(0F, 0F, 0F, 1, 9, 1, 0F); // Box 128
		drgpassengerModel[56].setRotationPoint(53F, -7F, 9F);

		drgpassengerModel[57].addBox(0F, 0F, 0F, 1, 9, 1, 0F); // Box 129
		drgpassengerModel[57].setRotationPoint(53F, -7F, 6F);

		drgpassengerModel[58].addBox(0F, 0F, 0F, 1, 9, 1, 0F); // Box 130
		drgpassengerModel[58].setRotationPoint(53F, -7F, 3F);

		drgpassengerModel[59].addBox(0F, 0F, 0F, 1, 9, 1, 0F); // Box 131
		drgpassengerModel[59].setRotationPoint(53F, -7F, -10F);

		drgpassengerModel[60].addBox(0F, 0F, 0F, 1, 9, 1, 0F); // Box 132
		drgpassengerModel[60].setRotationPoint(53F, -7F, -7F);

		drgpassengerModel[61].addBox(0F, 0F, 0F, 1, 9, 1, 0F); // Box 133
		drgpassengerModel[61].setRotationPoint(53F, -7F, -4F);

		drgpassengerModel[62].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 134
		drgpassengerModel[62].setRotationPoint(54F, -8F, 10F);
		drgpassengerModel[62].rotateAngleY = -3.14159265F;

		drgpassengerModel[63].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 135
		drgpassengerModel[63].setRotationPoint(54F, -8F, -3F);
		drgpassengerModel[63].rotateAngleY = -3.14159265F;

		drgpassengerModel[64].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Box 136
		drgpassengerModel[64].setRotationPoint(53F, -6F, -3F);

		drgpassengerModel[65].addBox(0F, 0F, 0F, 90, 1, 20, 0F); // Box 137
		drgpassengerModel[65].setRotationPoint(-45F, 2F, -10F);

		drgpassengerModel[66].addBox(0F, 0F, 0F, 2, 1, 20, 0F); // Box 138
		drgpassengerModel[66].setRotationPoint(53F, 2F, -10F);

		drgpassengerModel[67].addBox(0F, 0F, 0F, 1, 1, 20, 0F); // Box 139
		drgpassengerModel[67].setRotationPoint(-53F, 2F, -10F);

		drgpassengerModel[68].addBox(0F, 0F, 0F, 1, 1, 20, 0F); // Box 140
		drgpassengerModel[68].setRotationPoint(-46F, 2F, -10F);

		drgpassengerModel[69].addBox(0F, 0F, 0F, 6, 1, 12, 0F); // Box 141
		drgpassengerModel[69].setRotationPoint(-52F, 2F, -6F);

		drgpassengerModel[70].addBox(0F, 0F, 0F, 6, 1, 2, 0F); // Box 143
		drgpassengerModel[70].setRotationPoint(-52F, 4.5F, -8F);

		drgpassengerModel[71].addBox(0F, 0F, 0F, 6, 1, 3, 0F); // Box 145
		drgpassengerModel[71].setRotationPoint(-52F, 7F, -10F);

		drgpassengerModel[72].addBox(0F, 0F, 0F, 1, 3, 5, 0F); // Box 146
		drgpassengerModel[72].setRotationPoint(-53F, 3F, -10F);

		drgpassengerModel[73].addBox(0F, 0F, 0F, 1, 2, 3, 0F); // Box 147
		drgpassengerModel[73].setRotationPoint(-53F, 6F, -10F);

		drgpassengerModel[74].addBox(0F, 0F, 0F, 6, 1, 12, 0F); // Box 158
		drgpassengerModel[74].setRotationPoint(46F, 2F, -6F);

		drgpassengerModel[75].addBox(0F, 0F, 0F, 1, 1, 20, 0F); // Box 159
		drgpassengerModel[75].setRotationPoint(52F, 2F, -10F);

		drgpassengerModel[76].addBox(0F, 0F, 0F, 1, 1, 20, 0F); // Box 160
		drgpassengerModel[76].setRotationPoint(45F, 2F, -10F);

		drgpassengerModel[77].addBox(0F, 0F, 0F, 1, 3, 5, 0F); // Box 171
		drgpassengerModel[77].setRotationPoint(-46F, 3F, -10F);

		drgpassengerModel[78].addBox(0F, 0F, 0F, 1, 2, 3, 0F); // Box 172
		drgpassengerModel[78].setRotationPoint(-46F, 6F, -10F);

		drgpassengerModel[79].addBox(0F, 0F, 0F, 6, 3, 1, 0F); // Box 173
		drgpassengerModel[79].setRotationPoint(-52F, 3F, -6F);

		drgpassengerModel[80].addBox(0F, 0F, 0F, 6, 2, 1, 0F); // Box 174
		drgpassengerModel[80].setRotationPoint(-52F, 5.5F, -8F);

		drgpassengerModel[81].addBox(0F, 0F, 0F, 6, 1, 1, 0F); // Box 175
		drgpassengerModel[81].setRotationPoint(-52F, 5F, -7F);

		drgpassengerModel[82].addBox(0F, 0F, 0F, 6, 3, 1, 0F); // Box 176
		drgpassengerModel[82].setRotationPoint(-52F, 3F, 5F);

		drgpassengerModel[83].addBox(0F, 0F, 0F, 6, 1, 2, 0F); // Box 177
		drgpassengerModel[83].setRotationPoint(-52F, 4.5F, 6F);

		drgpassengerModel[84].addBox(0F, 0F, 0F, 6, 2, 1, 0F); // Box 178
		drgpassengerModel[84].setRotationPoint(-52F, 5.5F, 7F);

		drgpassengerModel[85].addBox(0F, 0F, 0F, 6, 1, 3, 0F); // Box 179
		drgpassengerModel[85].setRotationPoint(-52F, 7F, 7F);

		drgpassengerModel[86].addBox(0F, 0F, 0F, 1, 3, 5, 0F); // Box 180
		drgpassengerModel[86].setRotationPoint(-46F, 3F, 5F);

		drgpassengerModel[87].addBox(0F, 0F, 0F, 1, 2, 3, 0F); // Box 181
		drgpassengerModel[87].setRotationPoint(-46F, 6F, 7F);

		drgpassengerModel[88].addBox(0F, 0F, 0F, 1, 3, 5, 0F); // Box 182
		drgpassengerModel[88].setRotationPoint(-53F, 3F, 5F);

		drgpassengerModel[89].addBox(0F, 0F, 0F, 1, 2, 3, 0F); // Box 183
		drgpassengerModel[89].setRotationPoint(-53F, 6F, 7F);

		drgpassengerModel[90].addBox(0F, 0F, 0F, 1, 1, 20, 0F); // Box 184
		drgpassengerModel[90].setRotationPoint(-55F, 3F, -10F);

		drgpassengerModel[91].addBox(0F, 0F, 0F, 1, 1, 20, 0F); // Box 185
		drgpassengerModel[91].setRotationPoint(54F, 3F, -10F);

		drgpassengerModel[92].addBox(0F, 0F, 0F, 6, 3, 1, 0F); // Box 186
		drgpassengerModel[92].setRotationPoint(46F, 3F, -6F);

		drgpassengerModel[93].addBox(0F, 0F, 0F, 6, 1, 2, 0F); // Box 187
		drgpassengerModel[93].setRotationPoint(46F, 4.5F, -8F);

		drgpassengerModel[94].addBox(0F, 0F, 0F, 6, 2, 1, 0F); // Box 188
		drgpassengerModel[94].setRotationPoint(46F, 5.5F, -8F);

		drgpassengerModel[95].addBox(0F, 0F, 0F, 6, 1, 3, 0F); // Box 189
		drgpassengerModel[95].setRotationPoint(46F, 7F, -10F);

		drgpassengerModel[96].addBox(0F, 0F, 0F, 1, 3, 5, 0F); // Box 190
		drgpassengerModel[96].setRotationPoint(45F, 3F, -10F);

		drgpassengerModel[97].addBox(0F, 0F, 0F, 6, 1, 1, 0F); // Box 191
		drgpassengerModel[97].setRotationPoint(-52F, 5F, 6F);

		drgpassengerModel[98].addBox(0F, 0F, 0F, 6, 1, 1, 0F); // Box 192
		drgpassengerModel[98].setRotationPoint(46F, 5F, -7F);

		drgpassengerModel[99].addBox(0F, 0F, 0F, 1, 2, 3, 0F); // Box 193
		drgpassengerModel[99].setRotationPoint(45F, 6F, -10F);

		drgpassengerModel[100].addBox(0F, 0F, 0F, 1, 3, 5, 0F); // Box 194
		drgpassengerModel[100].setRotationPoint(52F, 3F, -10F);

		drgpassengerModel[101].addBox(0F, 0F, 0F, 1, 2, 3, 0F); // Box 195
		drgpassengerModel[101].setRotationPoint(52F, 6F, -10F);

		drgpassengerModel[102].addBox(0F, 0F, 0F, 6, 3, 1, 0F); // Box 196
		drgpassengerModel[102].setRotationPoint(46F, 3F, 5F);

		drgpassengerModel[103].addBox(0F, 0F, 0F, 6, 1, 1, 0F); // Box 197
		drgpassengerModel[103].setRotationPoint(46F, 5F, 6F);

		drgpassengerModel[104].addBox(0F, 0F, 0F, 6, 2, 1, 0F); // Box 198
		drgpassengerModel[104].setRotationPoint(46F, 5.5F, 7F);

		drgpassengerModel[105].addBox(0F, 0F, 0F, 6, 1, 3, 0F); // Box 199
		drgpassengerModel[105].setRotationPoint(46F, 7F, 7F);

		drgpassengerModel[106].addBox(0F, 0F, 0F, 6, 1, 2, 0F); // Box 200
		drgpassengerModel[106].setRotationPoint(46F, 4.5F, 6F);

		drgpassengerModel[107].addBox(0F, 0F, 0F, 1, 3, 5, 0F); // Box 201
		drgpassengerModel[107].setRotationPoint(45F, 3F, 5F);

		drgpassengerModel[108].addBox(0F, 0F, 0F, 1, 3, 5, 0F); // Box 202
		drgpassengerModel[108].setRotationPoint(52F, 3F, 5F);

		drgpassengerModel[109].addBox(0F, 0F, 0F, 1, 2, 3, 0F); // Box 203
		drgpassengerModel[109].setRotationPoint(52F, 6F, 7F);

		drgpassengerModel[110].addBox(0F, 0F, 0F, 1, 2, 3, 0F); // Box 204
		drgpassengerModel[110].setRotationPoint(45F, 6F, 7F);

		drgpassengerModel[111].addBox(0F, 0F, 0F, 90, 1, 2, 0F); // Box 205
		drgpassengerModel[111].setRotationPoint(-45F, 3F, -10F);

		drgpassengerModel[112].addBox(0F, 0F, 0F, 90, 1, 2, 0F); // Box 206
		drgpassengerModel[112].setRotationPoint(-45F, 3F, 8F);

		drgpassengerModel[113].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 207
		drgpassengerModel[113].setRotationPoint(-54F, 3F, -10F);

		drgpassengerModel[114].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 208
		drgpassengerModel[114].setRotationPoint(-54F, 3F, 9F);

		drgpassengerModel[115].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 209
		drgpassengerModel[115].setRotationPoint(53F, 3F, 9F);

		drgpassengerModel[116].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 210
		drgpassengerModel[116].setRotationPoint(53F, 3F, -10F);

		drgpassengerModel[117].addShapeBox(0F, 0F, 0F, 110, 1, 3, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, -0.05F, 0.05F, 0F, -0.05F, 0.05F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, -0.01F, -0.3F, 0F, -0.01F, -0.3F); // Box 211
		drgpassengerModel[117].setRotationPoint(-55F, -20F, -10.98F);
		drgpassengerModel[117].rotateAngleX = 0.34906585F;

		drgpassengerModel[118].addShapeBox(0F, 0F, 0F, 13, 3, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 148
		drgpassengerModel[118].setRotationPoint(-50F, -24F, -7F);

		drgpassengerModel[119].addShapeBox(0F, 0F, 0F, 5, 3, 14, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 149
		drgpassengerModel[119].setRotationPoint(-55F, -24F, -7F);

		drgpassengerModel[120].addShapeBox(0F, 0F, 0F, 5, 3, 14, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 150
		drgpassengerModel[120].setRotationPoint(50F, -24F, -7F);

		drgpassengerModel[121].addBox(0F, 0F, 0F, 13, 1, 12, 0F); // Box 163
		drgpassengerModel[121].setRotationPoint(-40F, 5F, -6F);

		drgpassengerModel[122].addBox(0F, 0F, 0F, 9, 1, 12, 0F); // Box 164
		drgpassengerModel[122].setRotationPoint(-38F, 7F, -6F);

		drgpassengerModel[123].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 165
		drgpassengerModel[123].setRotationPoint(-40F, 6F, -6F);

		drgpassengerModel[124].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 166
		drgpassengerModel[124].setRotationPoint(-39F, 6F, -6F);

		drgpassengerModel[125].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 167
		drgpassengerModel[125].setRotationPoint(-39F, 7F, -6F);

		drgpassengerModel[126].addBox(0F, 0F, 0F, 2, 1, 12, 0F); // Box 168
		drgpassengerModel[126].setRotationPoint(-37F, 6F, -6F);

		drgpassengerModel[127].addBox(0F, 0F, 0F, 2, 1, 12, 0F); // Box 169
		drgpassengerModel[127].setRotationPoint(-32F, 6F, -6F);

		drgpassengerModel[128].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 170
		drgpassengerModel[128].setRotationPoint(-29F, 7F, -6F);

		drgpassengerModel[129].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 171
		drgpassengerModel[129].setRotationPoint(-29F, 6F, -6F);

		drgpassengerModel[130].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 172
		drgpassengerModel[130].setRotationPoint(-28F, 6F, -6F);

		drgpassengerModel[131].addBox(0F, 0F, 0F, 5, 2, 6, 0F); // Box 172
		drgpassengerModel[131].setRotationPoint(-36F, 3F, -3F);

		drgpassengerModel[132].addShapeBox(0F, 0F, 0F, 29, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 173
		drgpassengerModel[132].setRotationPoint(-15F, 5.9F, -6F);

		drgpassengerModel[133].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 174
		drgpassengerModel[133].setRotationPoint(-25F, 2F, -6F);
		drgpassengerModel[133].rotateAngleZ = -0.36651914F;

		drgpassengerModel[134].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 177
		drgpassengerModel[134].setRotationPoint(24F, 2F, -5.5F);
		drgpassengerModel[134].rotateAngleY = -3.14159265F;
		drgpassengerModel[134].rotateAngleZ = -0.36651914F;

		drgpassengerModel[135].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 178
		drgpassengerModel[135].setRotationPoint(24F, 2F, 6F);
		drgpassengerModel[135].rotateAngleY = -3.14159265F;
		drgpassengerModel[135].rotateAngleZ = -0.36651914F;

		drgpassengerModel[136].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 179
		drgpassengerModel[136].setRotationPoint(-25F, 2F, 5.5F);
		drgpassengerModel[136].rotateAngleZ = -0.36651914F;

		drgpassengerModel[137].addShapeBox(0F, 0F, 0F, 29, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 180
		drgpassengerModel[137].setRotationPoint(-15F, 5.9F, 5.5F);

		drgpassengerModel[138].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 181
		drgpassengerModel[138].setRotationPoint(-15F, 2.4F, -6F);

		drgpassengerModel[139].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 182
		drgpassengerModel[139].setRotationPoint(13.5F, 2.4F, -6F);

		drgpassengerModel[140].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 184
		drgpassengerModel[140].setRotationPoint(-15F, 2.4F, 5.5F);

		drgpassengerModel[141].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 186
		drgpassengerModel[141].setRotationPoint(13.5F, 2.4F, 5.5F);

		drgpassengerModel[142].addBox(0F, 0F, 0F, 10, 1, 16, 0F); // Box 185
		drgpassengerModel[142].setRotationPoint(-55F, -21F, -8.1F);

		drgpassengerModel[143].addBox(0F, 0F, 0F, 10, 1, 16, 0F); // Box 189
		drgpassengerModel[143].setRotationPoint(45F, -21F, -8.1F);

		drgpassengerModel[144].addShapeBox(0F, 0F, 0F, 90, 1, 2, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 190
		drgpassengerModel[144].setRotationPoint(-45F, -21F, -8F);

		drgpassengerModel[145].addShapeBox(0F, 0F, 0F, 90, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 191
		drgpassengerModel[145].setRotationPoint(-45F, -21F, 6F);

		drgpassengerModel[146].addShapeBox(0F, 0F, 0F, 100, 1, 15, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 193
		drgpassengerModel[146].setRotationPoint(-50F, -24.5F, -7.5F);

		drgpassengerModel[147].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F, 0F, -3F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -3F, 0F, -0.7F, 0F, -0.5F, 0F, -2.5F, -0.5F, 0F, -2.5F, 0F, -0.7F, 0F, 0F); // Box 196
		drgpassengerModel[147].setRotationPoint(-55F, -24F, -8F);

		drgpassengerModel[148].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F, 0F, -3F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -3F, 0F, -0.7F, 0F, -0.5F, 0F, -2.5F, -0.5F, 0F, -2.5F, 0F, -0.7F, 0F, 0F); // Box 198
		drgpassengerModel[148].setRotationPoint(-55F, -24F, 6.5F);

		drgpassengerModel[149].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F, 0F, -3F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -3F, 0F, -0.7F, 0F, -0.5F, 0F, -2.5F, -0.5F, 0F, -2.5F, 0F, -0.7F, 0F, 0F); // Box 199
		drgpassengerModel[149].setRotationPoint(55F, -24F, 8F);
		drgpassengerModel[149].rotateAngleY = -3.14159265F;

		drgpassengerModel[150].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F, 0F, -3F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -3F, 0F, -0.7F, 0F, -0.5F, 0F, -2.5F, -0.5F, 0F, -2.5F, 0F, -0.7F, 0F, 0F); // Box 200
		drgpassengerModel[150].setRotationPoint(55F, -24F, -6.5F);
		drgpassengerModel[150].rotateAngleY = -3.14159265F;

		drgpassengerModel[151].addBox(0F, 0F, 0F, 3, 0, 3, 0F); // Box 201
		drgpassengerModel[151].setRotationPoint(52F, -9.01F, -7F);

		drgpassengerModel[152].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 202
		drgpassengerModel[152].setRotationPoint(53.01F, -9F, -6F);

		drgpassengerModel[153].addBox(0F, 0F, 0F, 13, 3, 3, 0F); // Box 198
		drgpassengerModel[153].setRotationPoint(-22F, 3F, -4.5F);

		drgpassengerModel[154].addBox(0F, 0F, 0F, 13, 3, 3, 0F); // Box 199
		drgpassengerModel[154].setRotationPoint(8F, 3F, 2F);

		drgpassengerModel[155].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 214
		drgpassengerModel[155].setRotationPoint(-58F, 4F, -1F);

		drgpassengerModel[156].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 215
		drgpassengerModel[156].setRotationPoint(-54F, 3F, -1F);

		drgpassengerModel[157].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 216
		drgpassengerModel[157].setRotationPoint(53F, 3F, -1F);

		drgpassengerModel[158].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 217
		drgpassengerModel[158].setRotationPoint(54F, 4F, -1F);

		drgpassengerModel[159].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 218
		drgpassengerModel[159].setRotationPoint(-54F, -9F, 5F);

		drgpassengerModel[160].addBox(0F, 0F, 0F, 3, 0, 3, 0F); // Box 220
		drgpassengerModel[160].setRotationPoint(-55F, -9.01F, 4F);

		drgpassengerModel[161].addShapeBox(0F, 0F, 0F, 110, 1, 3, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, -0.05F, 0.05F, 0F, -0.05F, 0.05F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, -0.01F, -0.3F, 0F, -0.01F, -0.3F); // Box 221
		drgpassengerModel[161].setRotationPoint(55F, -20.01F, 10.78F);
		drgpassengerModel[161].rotateAngleX = 0.34906585F;
		drgpassengerModel[161].rotateAngleY = -3.14159265F;

		drgpassengerModel[162].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 221
		drgpassengerModel[162].setRotationPoint(40F, -25F, -9F);

		drgpassengerModel[163].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 222
		drgpassengerModel[163].setRotationPoint(40F, -25F, -10F);

		drgpassengerModel[164].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 223
		drgpassengerModel[164].setRotationPoint(39F, -25F, -10F);

		drgpassengerModel[165].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 224
		drgpassengerModel[165].setRotationPoint(39F, -25F, -9F);

		drgpassengerModel[166].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 225
		drgpassengerModel[166].setRotationPoint(41F, -25F, -9F);

		drgpassengerModel[167].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 226
		drgpassengerModel[167].setRotationPoint(40F, -25F, -8F);

		drgpassengerModel[168].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 227
		drgpassengerModel[168].setRotationPoint(41F, -25F, -10F);

		drgpassengerModel[169].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 228
		drgpassengerModel[169].setRotationPoint(41F, -25F, -8F);

		drgpassengerModel[170].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 229
		drgpassengerModel[170].setRotationPoint(39F, -25F, -8F);

		drgpassengerModel[171].addShapeBox(0F, 0F, 0F, 11, 3, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 235
		drgpassengerModel[171].setRotationPoint(-14F, -24F, -7F);

		drgpassengerModel[172].addShapeBox(0F, 0F, 0F, 11, 3, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 236
		drgpassengerModel[172].setRotationPoint(3F, -24F, -7F);

		drgpassengerModel[173].addShapeBox(0F, 0F, 0F, 11, 3, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 237
		drgpassengerModel[173].setRotationPoint(20F, -24F, -7F);

		drgpassengerModel[174].addShapeBox(0F, 0F, 0F, 13, 3, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 233
		drgpassengerModel[174].setRotationPoint(37F, -24F, -7F);

		drgpassengerModel[175].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 242
		drgpassengerModel[175].setRotationPoint(-20F, -24F, -6.5F);

		drgpassengerModel[176].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 243
		drgpassengerModel[176].setRotationPoint(-3F, -24F, -6.5F);

		drgpassengerModel[177].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 244
		drgpassengerModel[177].setRotationPoint(14F, -24F, -6.5F);

		drgpassengerModel[178].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 245
		drgpassengerModel[178].setRotationPoint(31F, -24F, -6.5F);

		drgpassengerModel[179].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 256
		drgpassengerModel[179].setRotationPoint(-20F, -22F, -6.5F);

		drgpassengerModel[180].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 257
		drgpassengerModel[180].setRotationPoint(-3F, -22F, -6.5F);

		drgpassengerModel[181].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 258
		drgpassengerModel[181].setRotationPoint(14F, -22F, -6.5F);

		drgpassengerModel[182].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 259
		drgpassengerModel[182].setRotationPoint(31F, -22F, -6.5F);

		drgpassengerModel[183].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 264
		drgpassengerModel[183].setRotationPoint(-40.5F, -15.5F, -9.5F);

		drgpassengerModel[184].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 265
		drgpassengerModel[184].setRotationPoint(-41F, -16.5F, -9.5F);

		drgpassengerModel[185].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 266
		drgpassengerModel[185].setRotationPoint(-36.5F, -16.5F, -9.5F);

		drgpassengerModel[186].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 267
		drgpassengerModel[186].setRotationPoint(-41F, -17.5F, -9.5F);

		drgpassengerModel[187].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 268
		drgpassengerModel[187].setRotationPoint(-41F, -9F, -9.5F);

		drgpassengerModel[188].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 269
		drgpassengerModel[188].setRotationPoint(-31.5F, -15.5F, -9.5F);

		drgpassengerModel[189].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 270
		drgpassengerModel[189].setRotationPoint(-32F, -16.5F, -9.5F);

		drgpassengerModel[190].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 271
		drgpassengerModel[190].setRotationPoint(-27.5F, -16.5F, -9.5F);

		drgpassengerModel[191].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 272
		drgpassengerModel[191].setRotationPoint(-32F, -17.5F, -9.5F);

		drgpassengerModel[192].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 273
		drgpassengerModel[192].setRotationPoint(-32F, -9F, -9.5F);

		drgpassengerModel[193].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 274
		drgpassengerModel[193].setRotationPoint(-22.5F, -15.5F, -9.5F);

		drgpassengerModel[194].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 275
		drgpassengerModel[194].setRotationPoint(-23F, -16.5F, -9.5F);

		drgpassengerModel[195].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 276
		drgpassengerModel[195].setRotationPoint(-18.5F, -16.5F, -9.5F);

		drgpassengerModel[196].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 277
		drgpassengerModel[196].setRotationPoint(-23F, -17.5F, -9.5F);

		drgpassengerModel[197].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 278
		drgpassengerModel[197].setRotationPoint(-23F, -9F, -9.5F);

		drgpassengerModel[198].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 279
		drgpassengerModel[198].setRotationPoint(-13.5F, -15.5F, -9.5F);

		drgpassengerModel[199].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 280
		drgpassengerModel[199].setRotationPoint(-14F, -16.5F, -9.5F);

		drgpassengerModel[200].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 281
		drgpassengerModel[200].setRotationPoint(-9.5F, -16.5F, -9.5F);

		drgpassengerModel[201].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 282
		drgpassengerModel[201].setRotationPoint(-14F, -17.5F, -9.5F);

		drgpassengerModel[202].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 283
		drgpassengerModel[202].setRotationPoint(-14F, -9F, -9.5F);

		drgpassengerModel[203].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 284
		drgpassengerModel[203].setRotationPoint(-4.5F, -15.5F, -9.5F);

		drgpassengerModel[204].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 285
		drgpassengerModel[204].setRotationPoint(-5F, -16.5F, -9.5F);

		drgpassengerModel[205].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 286
		drgpassengerModel[205].setRotationPoint(-0.5F, -16.5F, -9.5F);

		drgpassengerModel[206].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 287
		drgpassengerModel[206].setRotationPoint(-5F, -17.5F, -9.5F);

		drgpassengerModel[207].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 288
		drgpassengerModel[207].setRotationPoint(-5F, -9F, -9.5F);

		drgpassengerModel[208].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 289
		drgpassengerModel[208].setRotationPoint(4.5F, -15.5F, -9.5F);

		drgpassengerModel[209].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 290
		drgpassengerModel[209].setRotationPoint(4F, -16.5F, -9.5F);

		drgpassengerModel[210].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 291
		drgpassengerModel[210].setRotationPoint(8.5F, -16.5F, -9.5F);

		drgpassengerModel[211].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 292
		drgpassengerModel[211].setRotationPoint(4F, -17.5F, -9.5F);

		drgpassengerModel[212].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 293
		drgpassengerModel[212].setRotationPoint(4F, -9F, -9.5F);

		drgpassengerModel[213].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 294
		drgpassengerModel[213].setRotationPoint(13.5F, -15.5F, -9.5F);

		drgpassengerModel[214].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 295
		drgpassengerModel[214].setRotationPoint(13F, -16.5F, -9.5F);

		drgpassengerModel[215].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 296
		drgpassengerModel[215].setRotationPoint(17.5F, -16.5F, -9.5F);

		drgpassengerModel[216].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 297
		drgpassengerModel[216].setRotationPoint(13F, -17.5F, -9.5F);

		drgpassengerModel[217].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 298
		drgpassengerModel[217].setRotationPoint(13F, -9F, -9.5F);

		drgpassengerModel[218].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 299
		drgpassengerModel[218].setRotationPoint(22.5F, -15.5F, -9.5F);

		drgpassengerModel[219].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 300
		drgpassengerModel[219].setRotationPoint(22F, -16.5F, -9.5F);

		drgpassengerModel[220].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 301
		drgpassengerModel[220].setRotationPoint(26.5F, -16.5F, -9.5F);

		drgpassengerModel[221].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 302
		drgpassengerModel[221].setRotationPoint(22F, -17.5F, -9.5F);

		drgpassengerModel[222].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 303
		drgpassengerModel[222].setRotationPoint(22F, -9F, -9.5F);

		drgpassengerModel[223].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 304
		drgpassengerModel[223].setRotationPoint(31.5F, -15.5F, -9.5F);

		drgpassengerModel[224].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 305
		drgpassengerModel[224].setRotationPoint(31F, -16.5F, -9.5F);

		drgpassengerModel[225].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 306
		drgpassengerModel[225].setRotationPoint(35.5F, -16.5F, -9.5F);

		drgpassengerModel[226].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 307
		drgpassengerModel[226].setRotationPoint(31F, -17.5F, -9.5F);

		drgpassengerModel[227].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 308
		drgpassengerModel[227].setRotationPoint(31F, -9F, -9.5F);

		drgpassengerModel[228].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 313
		drgpassengerModel[228].setRotationPoint(-20F, -23.5F, -6.5F);

		drgpassengerModel[229].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 314
		drgpassengerModel[229].setRotationPoint(-14.5F, -23.5F, -6.5F);

		drgpassengerModel[230].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 315
		drgpassengerModel[230].setRotationPoint(-3F, -23.5F, -6.5F);

		drgpassengerModel[231].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 316
		drgpassengerModel[231].setRotationPoint(2.5F, -23.5F, -6.5F);

		drgpassengerModel[232].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 317
		drgpassengerModel[232].setRotationPoint(19.5F, -23.5F, -6.5F);

		drgpassengerModel[233].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 318
		drgpassengerModel[233].setRotationPoint(14F, -23.5F, -6.5F);

		drgpassengerModel[234].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 319
		drgpassengerModel[234].setRotationPoint(31F, -23.5F, -6.5F);

		drgpassengerModel[235].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 320
		drgpassengerModel[235].setRotationPoint(36.5F, -23.5F, -6.5F);

		drgpassengerModel[236].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 360
		drgpassengerModel[236].setRotationPoint(-41F, -16.5F, 9F);

		drgpassengerModel[237].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 361
		drgpassengerModel[237].setRotationPoint(-40.5F, -15.5F, 9F);

		drgpassengerModel[238].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 362
		drgpassengerModel[238].setRotationPoint(-41F, -17.5F, 9F);

		drgpassengerModel[239].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 363
		drgpassengerModel[239].setRotationPoint(-41F, -9F, 9F);

		drgpassengerModel[240].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 364
		drgpassengerModel[240].setRotationPoint(-36.5F, -16.5F, 9F);

		drgpassengerModel[241].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 365
		drgpassengerModel[241].setRotationPoint(-32F, -16.5F, 9F);

		drgpassengerModel[242].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 366
		drgpassengerModel[242].setRotationPoint(-31.5F, -15.5F, 9F);

		drgpassengerModel[243].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 367
		drgpassengerModel[243].setRotationPoint(-32F, -17.5F, 9F);

		drgpassengerModel[244].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 368
		drgpassengerModel[244].setRotationPoint(-27.5F, -16.5F, 9F);

		drgpassengerModel[245].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 369
		drgpassengerModel[245].setRotationPoint(-32F, -9F, 9F);

		drgpassengerModel[246].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 370
		drgpassengerModel[246].setRotationPoint(-23F, -16.5F, 9F);

		drgpassengerModel[247].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 371
		drgpassengerModel[247].setRotationPoint(-22.5F, -15.5F, 9F);

		drgpassengerModel[248].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 372
		drgpassengerModel[248].setRotationPoint(-23F, -17.5F, 9F);

		drgpassengerModel[249].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 373
		drgpassengerModel[249].setRotationPoint(-18.5F, -16.5F, 9F);

		drgpassengerModel[250].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 374
		drgpassengerModel[250].setRotationPoint(-23F, -9F, 9F);

		drgpassengerModel[251].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 375
		drgpassengerModel[251].setRotationPoint(-13.5F, -15.5F, 9F);

		drgpassengerModel[252].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 376
		drgpassengerModel[252].setRotationPoint(-14F, -17.5F, 9F);

		drgpassengerModel[253].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 377
		drgpassengerModel[253].setRotationPoint(-14F, -16.5F, 9F);

		drgpassengerModel[254].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 378
		drgpassengerModel[254].setRotationPoint(-9.5F, -16.5F, 9F);

		drgpassengerModel[255].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 379
		drgpassengerModel[255].setRotationPoint(-14F, -9F, 9F);

		drgpassengerModel[256].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 380
		drgpassengerModel[256].setRotationPoint(-5F, -16.5F, 9F);

		drgpassengerModel[257].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 381
		drgpassengerModel[257].setRotationPoint(-4.5F, -15.5F, 9F);

		drgpassengerModel[258].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 382
		drgpassengerModel[258].setRotationPoint(-5F, -9F, 9F);

		drgpassengerModel[259].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 383
		drgpassengerModel[259].setRotationPoint(-0.5F, -16.5F, 9F);

		drgpassengerModel[260].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 384
		drgpassengerModel[260].setRotationPoint(-5F, -17.5F, 9F);

		drgpassengerModel[261].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 385
		drgpassengerModel[261].setRotationPoint(4F, -16.5F, 9F);

		drgpassengerModel[262].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 386
		drgpassengerModel[262].setRotationPoint(4.5F, -15.5F, 9F);

		drgpassengerModel[263].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 387
		drgpassengerModel[263].setRotationPoint(4F, -17.5F, 9F);

		drgpassengerModel[264].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 388
		drgpassengerModel[264].setRotationPoint(8.5F, -16.5F, 9F);

		drgpassengerModel[265].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 389
		drgpassengerModel[265].setRotationPoint(4F, -9F, 9F);

		drgpassengerModel[266].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 390
		drgpassengerModel[266].setRotationPoint(13F, -16.5F, 9F);

		drgpassengerModel[267].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 391
		drgpassengerModel[267].setRotationPoint(13.5F, -15.5F, 9F);

		drgpassengerModel[268].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 392
		drgpassengerModel[268].setRotationPoint(13F, -17.5F, 9F);

		drgpassengerModel[269].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 393
		drgpassengerModel[269].setRotationPoint(13F, -9F, 9F);

		drgpassengerModel[270].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 394
		drgpassengerModel[270].setRotationPoint(17.5F, -16.5F, 9F);

		drgpassengerModel[271].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 395
		drgpassengerModel[271].setRotationPoint(22F, -16.5F, 9F);

		drgpassengerModel[272].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 396
		drgpassengerModel[272].setRotationPoint(22.5F, -15.5F, 9F);

		drgpassengerModel[273].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 397
		drgpassengerModel[273].setRotationPoint(22F, -17.5F, 9F);

		drgpassengerModel[274].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 398
		drgpassengerModel[274].setRotationPoint(26.5F, -16.5F, 9F);

		drgpassengerModel[275].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 399
		drgpassengerModel[275].setRotationPoint(22F, -9F, 9F);

		drgpassengerModel[276].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 400
		drgpassengerModel[276].setRotationPoint(31F, -16.5F, 9F);

		drgpassengerModel[277].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 401
		drgpassengerModel[277].setRotationPoint(31.5F, -15.5F, 9F);

		drgpassengerModel[278].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 402
		drgpassengerModel[278].setRotationPoint(31F, -17.5F, 9F);

		drgpassengerModel[279].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 403
		drgpassengerModel[279].setRotationPoint(35.5F, -16.5F, 9F);

		drgpassengerModel[280].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 404
		drgpassengerModel[280].setRotationPoint(31F, -9F, 9F);

		drgpassengerModel[281].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, -0.5F, -1F, -0.5F, -0.5F, -1F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 406
		drgpassengerModel[281].setRotationPoint(44F, -17.5F, -8F);

		drgpassengerModel[282].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, -0.5F, -1F, -0.5F, -0.5F, -1F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 407
		drgpassengerModel[282].setRotationPoint(44F, -9F, -8F);

		drgpassengerModel[283].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 408
		drgpassengerModel[283].setRotationPoint(44F, -16.5F, -5.5F);

		drgpassengerModel[284].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 409
		drgpassengerModel[284].setRotationPoint(44F, -16.5F, -7F);

		drgpassengerModel[285].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, -0.5F, -1F, -0.5F, -0.5F, -1F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 410
		drgpassengerModel[285].setRotationPoint(44F, -15.5F, -7.5F);

		drgpassengerModel[286].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, -0.5F, -1F, -0.5F, -0.5F, -1F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 411
		drgpassengerModel[286].setRotationPoint(44F, -15.5F, 4.5F);

		drgpassengerModel[287].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 412
		drgpassengerModel[287].setRotationPoint(44F, -16.5F, 5F);

		drgpassengerModel[288].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, -0.5F, -1F, -0.5F, -0.5F, -1F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 413
		drgpassengerModel[288].setRotationPoint(44F, -17.5F, 4F);

		drgpassengerModel[289].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 414
		drgpassengerModel[289].setRotationPoint(44F, -16.5F, 6.5F);

		drgpassengerModel[290].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, -0.5F, -1F, -0.5F, -0.5F, -1F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 415
		drgpassengerModel[290].setRotationPoint(44F, -9F, 4F);

		drgpassengerModel[291].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, -0.5F, -1F, -0.5F, -0.5F, -1F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 416
		drgpassengerModel[291].setRotationPoint(-44.5F, -15.5F, 4.5F);

		drgpassengerModel[292].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 417
		drgpassengerModel[292].setRotationPoint(-44.5F, -16.5F, 5F);

		drgpassengerModel[293].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, -0.5F, -1F, -0.5F, -0.5F, -1F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 418
		drgpassengerModel[293].setRotationPoint(-44.5F, -17.5F, 4F);

		drgpassengerModel[294].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 419
		drgpassengerModel[294].setRotationPoint(-44.5F, -16.5F, 6.5F);

		drgpassengerModel[295].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, -0.5F, -1F, -0.5F, -0.5F, -1F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 420
		drgpassengerModel[295].setRotationPoint(-44.5F, -9F, 4F);

		drgpassengerModel[296].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, -0.5F, -1F, -0.5F, -0.5F, -1F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 421
		drgpassengerModel[296].setRotationPoint(-44.5F, -15.5F, -7.5F);

		drgpassengerModel[297].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 422
		drgpassengerModel[297].setRotationPoint(-44.5F, -16.5F, -7F);

		drgpassengerModel[298].addShapeBox(0F, 0F, -1F, 1, 1, 7, 0F, 0F, -0.5F, -1F, -0.5F, -0.5F, -1F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 423
		drgpassengerModel[298].setRotationPoint(-44.75F, -17.5F, -3F);

		drgpassengerModel[299].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 424
		drgpassengerModel[299].setRotationPoint(-44.5F, -16.5F, -5.5F);

		drgpassengerModel[300].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, -0.5F, -1F, -0.5F, -0.5F, -1F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 425
		drgpassengerModel[300].setRotationPoint(-44.5F, -9F, -8F);

		drgpassengerModel[301].addBox(0F, 0F, 0F, 1, 7, 1, 0F); // Box 397
		drgpassengerModel[301].setRotationPoint(-54F, -5F, -0.5F);

		drgpassengerModel[302].addBox(0F, 0F, 0F, 1, 7, 1, 0F); // Box 398
		drgpassengerModel[302].setRotationPoint(53F, -5F, -0.5F);

		drgpassengerModel[303].addShapeBox(0F, 0F, 0F, 11, 3, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 362
		drgpassengerModel[303].setRotationPoint(-31F, -24F, -7F);

		drgpassengerModel[304].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 363
		drgpassengerModel[304].setRotationPoint(-37F, -22F, -6.5F);

		drgpassengerModel[305].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 364
		drgpassengerModel[305].setRotationPoint(-37F, -23.5F, -6.5F);

		drgpassengerModel[306].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 365
		drgpassengerModel[306].setRotationPoint(-37F, -24F, -6.5F);

		drgpassengerModel[307].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 366
		drgpassengerModel[307].setRotationPoint(-31.5F, -23.5F, -6.5F);

		drgpassengerModel[308].addShapeBox(0F, 8F, -0.5F, 1, 11, 6, 0F, 0F, -0.5F, -1F, -0.5F, -0.5F, -1F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 354
		drgpassengerModel[308].setRotationPoint(-44.75F, -17.5F, -3F);

		drgpassengerModel[309].addShapeBox(0F, 0.5F, 6F, 1, 18, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 355
		drgpassengerModel[309].setRotationPoint(-44.75F, -17F, -3.5F);

		drgpassengerModel[310].addShapeBox(0F, 1F, 0F, 1, 18, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 356
		drgpassengerModel[310].setRotationPoint(-44.75F, -17.5F, -3F);

		drgpassengerModel[311].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, -0.5F, -1F, -0.5F, -0.5F, -1F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 357
		drgpassengerModel[311].setRotationPoint(-44.5F, -17.5F, -8F);

		drgpassengerModel[312].addShapeBox(0F, 18.5F, -1F, 1, 1, 7, 0F, 0F, -0.5F, -1F, -0.5F, -0.5F, -1F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 358
		drgpassengerModel[312].setRotationPoint(-44.75F, -17.5F, -3F);

		drgpassengerModel[313].addShapeBox(0F, 0F, 0F, 88, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 436
		drgpassengerModel[313].setRotationPoint(-44F, -18F, -6.5F);

		drgpassengerModel[314].addShapeBox(0F, 0F, 0F, 88, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 437
		drgpassengerModel[314].setRotationPoint(-44F, -18F, -7.5F);

		drgpassengerModel[315].addShapeBox(0F, 0F, 0F, 88, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 438
		drgpassengerModel[315].setRotationPoint(-44F, -18F, -8.5F);

		drgpassengerModel[316].addShapeBox(0F, 0F, 0F, 88, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 439
		drgpassengerModel[316].setRotationPoint(-44F, -18F, 8F);

		drgpassengerModel[317].addShapeBox(0F, 0F, 0F, 88, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 440
		drgpassengerModel[317].setRotationPoint(-44F, -18F, 7F);

		drgpassengerModel[318].addShapeBox(0F, 0F, 0F, 88, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 441
		drgpassengerModel[318].setRotationPoint(-44F, -18F, 6F);

		drgpassengerModel[319].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F); // Box 442
		drgpassengerModel[319].setRotationPoint(-42F, -17.5F, -9.5F);

		drgpassengerModel[320].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F); // Box 443
		drgpassengerModel[320].setRotationPoint(-34.3F, -17.5F, -9.5F);

		drgpassengerModel[321].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F); // Box 444
		drgpassengerModel[321].setRotationPoint(-25.3F, -17.5F, -9.5F);

		drgpassengerModel[322].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F); // Box 445
		drgpassengerModel[322].setRotationPoint(-16.3F, -17.5F, -9.5F);

		drgpassengerModel[323].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F); // Box 446
		drgpassengerModel[323].setRotationPoint(-7.3F, -17.5F, -9.5F);

		drgpassengerModel[324].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F); // Box 447
		drgpassengerModel[324].setRotationPoint(1.7F, -17.5F, -9.5F);

		drgpassengerModel[325].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F); // Box 448
		drgpassengerModel[325].setRotationPoint(10.7F, -17.5F, -9.5F);

		drgpassengerModel[326].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F); // Box 449
		drgpassengerModel[326].setRotationPoint(19.7F, -17.5F, -9.5F);

		drgpassengerModel[327].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F); // Box 450
		drgpassengerModel[327].setRotationPoint(28.7F, -17.5F, -9.5F);

		drgpassengerModel[328].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F); // Box 451
		drgpassengerModel[328].setRotationPoint(37.7F, -17.5F, -9.5F);

		drgpassengerModel[329].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F); // Box 452
		drgpassengerModel[329].setRotationPoint(-42F, -17.5F, 9.5F);
		drgpassengerModel[329].rotateAngleY = -3.14159265F;

		drgpassengerModel[330].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F); // Box 454
		drgpassengerModel[330].setRotationPoint(-33.7F, -17.5F, 9.5F);
		drgpassengerModel[330].rotateAngleY = -3.14159265F;

		drgpassengerModel[331].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F); // Box 455
		drgpassengerModel[331].setRotationPoint(-24.7F, -17.5F, 9.5F);
		drgpassengerModel[331].rotateAngleY = -3.14159265F;

		drgpassengerModel[332].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F); // Box 456
		drgpassengerModel[332].setRotationPoint(-15.7F, -17.5F, 9.5F);
		drgpassengerModel[332].rotateAngleY = -3.14159265F;

		drgpassengerModel[333].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F); // Box 457
		drgpassengerModel[333].setRotationPoint(-6.7F, -17.5F, 9.5F);
		drgpassengerModel[333].rotateAngleY = -3.14159265F;

		drgpassengerModel[334].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F); // Box 458
		drgpassengerModel[334].setRotationPoint(2.3F, -17.5F, 9.5F);
		drgpassengerModel[334].rotateAngleY = -3.14159265F;

		drgpassengerModel[335].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F); // Box 459
		drgpassengerModel[335].setRotationPoint(11.3F, -17.5F, 9.5F);
		drgpassengerModel[335].rotateAngleY = -3.14159265F;

		drgpassengerModel[336].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F); // Box 460
		drgpassengerModel[336].setRotationPoint(20.3F, -17.5F, 9.5F);
		drgpassengerModel[336].rotateAngleY = -3.14159265F;

		drgpassengerModel[337].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F); // Box 461
		drgpassengerModel[337].setRotationPoint(29.3F, -17.5F, 9.5F);
		drgpassengerModel[337].rotateAngleY = -3.14159265F;

		drgpassengerModel[338].addShapeBox(0F, 0F, 0F, 1, 4, 12, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 463
		drgpassengerModel[338].setRotationPoint(-45F, -24F, -6F);

		drgpassengerModel[339].addShapeBox(0F, 0F, 0F, 1, 4, 12, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 464
		drgpassengerModel[339].setRotationPoint(44F, -24F, -6F);

		drgpassengerModel[340].addBox(0F, 0F, 0F, 1, 22, 5, 0F); // Box 465
		drgpassengerModel[340].setRotationPoint(38F, -20F, 4F);

		drgpassengerModel[341].addBox(0F, 0F, 0F, 1, 22, 5, 0F); // Box 467
		drgpassengerModel[341].setRotationPoint(42F, -20F, 4F);

		drgpassengerModel[342].addBox(0F, 0F, 0F, 1, 22, 5, 0F); // Box 468
		drgpassengerModel[342].setRotationPoint(42F, -20F, -9F);

		drgpassengerModel[343].addBox(0F, 0F, 0F, 1, 22, 5, 0F); // Box 469
		drgpassengerModel[343].setRotationPoint(38F, -20F, -9F);

		drgpassengerModel[344].addBox(0F, 0F, 0F, 3, 1, 5, 0F); // Box 470
		drgpassengerModel[344].setRotationPoint(39F, -20F, 4F);

		drgpassengerModel[345].addBox(0F, 0F, 0F, 3, 1, 5, 0F); // Box 471
		drgpassengerModel[345].setRotationPoint(39F, -20F, -9F);

		drgpassengerModel[346].addBox(0F, 0F, 0F, 3, 1, 5, 0F); // Box 472
		drgpassengerModel[346].setRotationPoint(39F, 1F, -9F);

		drgpassengerModel[347].addBox(0F, 0F, 0F, 3, 1, 5, 0F); // Box 473
		drgpassengerModel[347].setRotationPoint(39F, 1F, 4F);

		drgpassengerModel[348].addBox(0F, 0F, 0F, 3, 20, 0, 0F); // Box 474
		drgpassengerModel[348].setRotationPoint(39F, -19F, 4.1F);

		drgpassengerModel[349].addBox(0F, 0F, 0F, 3, 20, 0, 0F); // Box 475
		drgpassengerModel[349].setRotationPoint(39F, -19F, -4.1F);

		drgpassengerModel[350].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F); // Box 477
		drgpassengerModel[350].setRotationPoint(38.3F, -17.5F, 9.5F);
		drgpassengerModel[350].rotateAngleY = -3.14159265F;

		drgpassengerModel[351].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 477
		drgpassengerModel[351].setRotationPoint(21F, -1F, -5F);

		drgpassengerModel[352].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 478
		drgpassengerModel[352].setRotationPoint(24F, -1F, -5F);

		drgpassengerModel[353].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 479
		drgpassengerModel[353].setRotationPoint(18F, -1F, -5F);

		drgpassengerModel[354].addShapeBox(0F, 0F, 0F, 9, 1, 2, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 481
		drgpassengerModel[354].setRotationPoint(18F, -5.5F, -7F);

		drgpassengerModel[355].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 484
		drgpassengerModel[355].setRotationPoint(6F, -1F, -5F);

		drgpassengerModel[356].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 485
		drgpassengerModel[356].setRotationPoint(3F, -1F, -5F);

		drgpassengerModel[357].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 486
		drgpassengerModel[357].setRotationPoint(0F, -1F, -5F);

		drgpassengerModel[358].addShapeBox(0F, 0F, 0F, 9, 1, 2, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 487
		drgpassengerModel[358].setRotationPoint(0F, -5.5F, -7F);

		drgpassengerModel[359].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 490
		drgpassengerModel[359].setRotationPoint(-12F, -1F, -5F);

		drgpassengerModel[360].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 491
		drgpassengerModel[360].setRotationPoint(-15F, -1F, -5F);

		drgpassengerModel[361].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 492
		drgpassengerModel[361].setRotationPoint(-18F, -1F, -5F);

		drgpassengerModel[362].addShapeBox(0F, 0F, 0F, 9, 1, 2, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 493
		drgpassengerModel[362].setRotationPoint(-18F, -5.5F, -7F);

		drgpassengerModel[363].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 496
		drgpassengerModel[363].setRotationPoint(-30F, -1F, -5F);

		drgpassengerModel[364].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 497
		drgpassengerModel[364].setRotationPoint(-33F, -1F, -5F);

		drgpassengerModel[365].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 498
		drgpassengerModel[365].setRotationPoint(-36F, -1F, -5F);

		drgpassengerModel[366].addShapeBox(0F, 0F, 0F, 9, 1, 2, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 499
		drgpassengerModel[366].setRotationPoint(-36F, -5.5F, -7F);

		drgpassengerModel[367].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 392
		drgpassengerModel[367].setRotationPoint(-3F, -22F, 6F);

		drgpassengerModel[368].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 393
		drgpassengerModel[368].setRotationPoint(-3F, -23.5F, 6F);

		drgpassengerModel[369].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 394
		drgpassengerModel[369].setRotationPoint(-3F, -24F, 6F);

		drgpassengerModel[370].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 395
		drgpassengerModel[370].setRotationPoint(2.5F, -23.5F, 6F);

		drgpassengerModel[371].addShapeBox(0F, 0F, 0F, 11, 3, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 396
		drgpassengerModel[371].setRotationPoint(3F, -24F, 6F);

		drgpassengerModel[372].addShapeBox(0F, 0F, 0F, 11, 3, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 397
		drgpassengerModel[372].setRotationPoint(-14F, -24F, 6F);

		drgpassengerModel[373].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 398
		drgpassengerModel[373].setRotationPoint(-20F, -23.5F, 6F);

		drgpassengerModel[374].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 399
		drgpassengerModel[374].setRotationPoint(-20F, -22F, 6F);

		drgpassengerModel[375].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 400
		drgpassengerModel[375].setRotationPoint(-14.5F, -23.5F, 6F);

		drgpassengerModel[376].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 401
		drgpassengerModel[376].setRotationPoint(-20F, -24F, 6F);

		drgpassengerModel[377].addShapeBox(0F, 0F, 0F, 11, 3, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 402
		drgpassengerModel[377].setRotationPoint(-31F, -24F, 6F);

		drgpassengerModel[378].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 403
		drgpassengerModel[378].setRotationPoint(-37F, -24F, 6F);

		drgpassengerModel[379].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 404
		drgpassengerModel[379].setRotationPoint(-31.5F, -23.5F, 6F);

		drgpassengerModel[380].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 405
		drgpassengerModel[380].setRotationPoint(-37F, -22F, 6F);

		drgpassengerModel[381].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 406
		drgpassengerModel[381].setRotationPoint(-37F, -23.5F, 6F);

		drgpassengerModel[382].addShapeBox(0F, 0F, 0F, 13, 3, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 407
		drgpassengerModel[382].setRotationPoint(-50F, -24F, 6F);

		drgpassengerModel[383].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 408
		drgpassengerModel[383].setRotationPoint(14F, -23.5F, 6F);

		drgpassengerModel[384].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 409
		drgpassengerModel[384].setRotationPoint(14F, -24F, 6F);

		drgpassengerModel[385].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 410
		drgpassengerModel[385].setRotationPoint(14F, -22F, 6F);

		drgpassengerModel[386].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 411
		drgpassengerModel[386].setRotationPoint(19.5F, -23.5F, 6F);

		drgpassengerModel[387].addShapeBox(0F, 0F, 0F, 11, 3, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 412
		drgpassengerModel[387].setRotationPoint(20F, -24F, 6F);

		drgpassengerModel[388].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 413
		drgpassengerModel[388].setRotationPoint(36.5F, -23.5F, 6F);

		drgpassengerModel[389].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 414
		drgpassengerModel[389].setRotationPoint(31F, -24F, 6F);

		drgpassengerModel[390].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 415
		drgpassengerModel[390].setRotationPoint(31F, -23.5F, 6F);

		drgpassengerModel[391].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 416
		drgpassengerModel[391].setRotationPoint(31F, -22F, 6F);

		drgpassengerModel[392].addShapeBox(0F, 0F, 0F, 13, 3, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 417
		drgpassengerModel[392].setRotationPoint(37F, -24F, 6F);

		drgpassengerModel[393].addShapeBox(-0.25F, 9F, 4F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 418
		drgpassengerModel[393].setRotationPoint(-44.75F, -17F, -3F);

		drgpassengerModel[394].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F); // Box 419
		drgpassengerModel[394].setRotationPoint(-46F, -7.5F, 8F);

		drgpassengerModel[395].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F); // Box 420
		drgpassengerModel[395].setRotationPoint(-46F, -7.5F, -8.5F);

		drgpassengerModel[396].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F); // Box 421
		drgpassengerModel[396].setRotationPoint(45.5F, -7.5F, -8.5F);

		drgpassengerModel[397].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F); // Box 422
		drgpassengerModel[397].setRotationPoint(45.5F, -7.5F, 8F);

		drgpassengerModel[398].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 423
		drgpassengerModel[398].setRotationPoint(-39F, -7.5F, -11F);

		drgpassengerModel[399].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 424
		drgpassengerModel[399].setRotationPoint(38.5F, -7.5F, -11F);

		drgpassengerModel[400].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 425
		drgpassengerModel[400].setRotationPoint(-39F, -7.5F, 10.5F);

		drgpassengerModel[401].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 426
		drgpassengerModel[401].setRotationPoint(38.5F, -7.5F, 10.5F);

		drgpassengerModel[402].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -1F, -0.5F, 0F, -1F); // Box 427
		drgpassengerModel[402].setRotationPoint(-35.5F, -23.5F, -1F);

		drgpassengerModel[403].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 432
		drgpassengerModel[403].setRotationPoint(-34.25F, -24F, 0F);

		drgpassengerModel[404].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 433
		drgpassengerModel[404].setRotationPoint(-17.25F, -24F, 0F);

		drgpassengerModel[405].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -1F, -0.5F, 0F, -1F); // Box 434
		drgpassengerModel[405].setRotationPoint(-18.5F, -23.5F, -1F);

		drgpassengerModel[406].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 435
		drgpassengerModel[406].setRotationPoint(-0.25F, -24F, 0F);

		drgpassengerModel[407].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -1F, -0.5F, 0F, -1F); // Box 436
		drgpassengerModel[407].setRotationPoint(-1.5F, -23.5F, -1F);

		drgpassengerModel[408].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 437
		drgpassengerModel[408].setRotationPoint(16.75F, -24F, 0F);

		drgpassengerModel[409].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -1F, -0.5F, 0F, -1F); // Box 438
		drgpassengerModel[409].setRotationPoint(15.5F, -23.5F, -1F);

		drgpassengerModel[410].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 439
		drgpassengerModel[410].setRotationPoint(33.75F, -24F, 0F);

		drgpassengerModel[411].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -1F, -0.5F, 0F, -1F); // Box 440
		drgpassengerModel[411].setRotationPoint(32.5F, -23.5F, -1F);

		drgpassengerModel[412].addShapeBox(0F, 1F, 0.5F, 1, 7, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 437
		drgpassengerModel[412].setRotationPoint(-44.75F, -17F, -3F);

		drgpassengerModel[413].addShapeBox(0F, 0.5F, -0.5F, 1, 1, 6, 0F, 0F, -0.5F, -1F, -0.5F, -0.5F, -1F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 438
		drgpassengerModel[413].setRotationPoint(-44.75F, -17.5F, -3F);

		drgpassengerModel[414].addShapeBox(0F, 1F, 5F, 1, 7, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 439
		drgpassengerModel[414].setRotationPoint(-44.75F, -17F, -3F);

		drgpassengerModel[415].addBox(0F, 0F, 0F, 5, 2, 6, 0F); // Box 444
		drgpassengerModel[415].setRotationPoint(30.5F, 3F, -3F);

		drgpassengerModel[416].addBox(0F, 0F, 0F, 9, 1, 12, 0F); // Box 444
		drgpassengerModel[416].setRotationPoint(29F, 7F, -6F);

		drgpassengerModel[417].addBox(0F, 0F, 0F, 5, 2, 6, 0F); // Box 445
		drgpassengerModel[417].setRotationPoint(31F, 3F, -3F);

		drgpassengerModel[418].addBox(0F, 0F, 0F, 13, 1, 12, 0F); // Box 446
		drgpassengerModel[418].setRotationPoint(27F, 5F, -6F);

		drgpassengerModel[419].addBox(0F, 0F, 0F, 2, 1, 12, 0F); // Box 447
		drgpassengerModel[419].setRotationPoint(35F, 6F, -6F);

		drgpassengerModel[420].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 448
		drgpassengerModel[420].setRotationPoint(39F, 6F, -6F);

		drgpassengerModel[421].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 449
		drgpassengerModel[421].setRotationPoint(38F, 6F, -6F);

		drgpassengerModel[422].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 450
		drgpassengerModel[422].setRotationPoint(38F, 7F, -6F);

		drgpassengerModel[423].addBox(0F, 0F, 0F, 2, 1, 12, 0F); // Box 451
		drgpassengerModel[423].setRotationPoint(30F, 6F, -6F);

		drgpassengerModel[424].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 452
		drgpassengerModel[424].setRotationPoint(28F, 7F, -6F);

		drgpassengerModel[425].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 453
		drgpassengerModel[425].setRotationPoint(28F, 6F, -6F);

		drgpassengerModel[426].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 454
		drgpassengerModel[426].setRotationPoint(27F, 6F, -6F);

		drgpassengerModel[427].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 444
		drgpassengerModel[427].setRotationPoint(-39F, -8F, -10.5F);

		drgpassengerModel[428].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 445
		drgpassengerModel[428].setRotationPoint(-39F, -0.5F, -10.5F);

		drgpassengerModel[429].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 446
		drgpassengerModel[429].setRotationPoint(38.5F, -0.5F, -10.5F);

		drgpassengerModel[430].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 447
		drgpassengerModel[430].setRotationPoint(38.5F, -8F, -10.5F);

		drgpassengerModel[431].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 448
		drgpassengerModel[431].setRotationPoint(38.5F, -0.5F, 10F);

		drgpassengerModel[432].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 449
		drgpassengerModel[432].setRotationPoint(38.5F, -8F, 10F);

		drgpassengerModel[433].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 450
		drgpassengerModel[433].setRotationPoint(-39F, -0.5F, 10F);

		drgpassengerModel[434].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 451
		drgpassengerModel[434].setRotationPoint(-39F, -8F, 10F);

		drgpassengerModel[435].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 452
		drgpassengerModel[435].setRotationPoint(-45.5F, -0.5F, 8F);

		drgpassengerModel[436].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 453
		drgpassengerModel[436].setRotationPoint(-45.5F, -8F, 8F);

		drgpassengerModel[437].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 454
		drgpassengerModel[437].setRotationPoint(-45.5F, -0.5F, -8.5F);

		drgpassengerModel[438].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 455
		drgpassengerModel[438].setRotationPoint(-45.5F, -8F, -8.5F);

		drgpassengerModel[439].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 456
		drgpassengerModel[439].setRotationPoint(45F, -0.5F, -8.5F);

		drgpassengerModel[440].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 457
		drgpassengerModel[440].setRotationPoint(45F, -8F, -8.5F);

		drgpassengerModel[441].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 458
		drgpassengerModel[441].setRotationPoint(45F, -8F, 8F);

		drgpassengerModel[442].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 459
		drgpassengerModel[442].setRotationPoint(45F, -0.5F, 8F);

		drgpassengerModel[443].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 515
		drgpassengerModel[443].setRotationPoint(-57F, 4F, 0.5F);

		drgpassengerModel[444].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.4F, -0.5F, -0.5F, -0.4F, -0.5F, -0.5F, -0.1F, 0F, -0.5F, -0.1F); // Box 517
		drgpassengerModel[444].setRotationPoint(-57F, 6F, 0.6F);

		drgpassengerModel[445].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, -0.5F, -0.5F, 1F, -0.5F, -0.5F, 1F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 520
		drgpassengerModel[445].setRotationPoint(-57F, 3F, 0.5F);

		drgpassengerModel[446].addShapeBox(0F, 1F, 0F, 1, 1, 14, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 525
		drgpassengerModel[446].setRotationPoint(-56.5F, 2F, -7F);

		drgpassengerModel[447].addShapeBox(0F, 1F, 0F, 1, 1, 1, 0F, 0F, -1F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, -1.5F, 0F, -0.5F, 1F, -0.5F, -0.5F, 1F, -0.5F, 0F, -1.5F, 0F, 0F); // Box 527
		drgpassengerModel[447].setRotationPoint(-56.5F, 1F, 6F);

		drgpassengerModel[448].addShapeBox(0F, 1F, 0F, 1, 1, 1, 0F, 0F, -1F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, -1.5F, 0F, -0.5F, 1F, -0.5F, -0.5F, 1F, -0.5F, 0F, -1.5F, 0F, 0F); // Box 528
		drgpassengerModel[448].setRotationPoint(-56.5F, 1F, -7.5F);

		drgpassengerModel[449].addShapeBox(0F, 1F, 0F, 1, 1, 1, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 529
		drgpassengerModel[449].setRotationPoint(-56.5F, 2F, -0.75F);

		drgpassengerModel[450].addShapeBox(0F, 1F, 0F, 1, 1, 1, 0F, 0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 530
		drgpassengerModel[450].setRotationPoint(-55.5F, 1.5F, -0.75F);

		drgpassengerModel[451].addShapeBox(0F, 1F, 0F, 1, 1, 14, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 477
		drgpassengerModel[451].setRotationPoint(56F, 2F, -7F);

		drgpassengerModel[452].addShapeBox(0F, 1F, 0F, 1, 1, 1, 0F, -0.5F, -0.5F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, -0.5F, -0.5F, 0F, 1F, -0.5F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, 0F, 1F, -0.5F, 0F); // Box 478
		drgpassengerModel[452].setRotationPoint(55.5F, 1F, 6F);

		drgpassengerModel[453].addShapeBox(0F, 1F, 0F, 1, 1, 1, 0F, 0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 479
		drgpassengerModel[453].setRotationPoint(55.5F, 1.5F, -0.75F);

		drgpassengerModel[454].addShapeBox(0F, 1F, 0F, 1, 1, 1, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 480
		drgpassengerModel[454].setRotationPoint(56F, 2F, -0.75F);

		drgpassengerModel[455].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 1F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 1F, -0.5F, 0F, 1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 481
		drgpassengerModel[455].setRotationPoint(56F, 3F, 0.5F);

		drgpassengerModel[456].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 482
		drgpassengerModel[456].setRotationPoint(56.5F, 4F, 0.5F);

		drgpassengerModel[457].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.4F, -0.5F, -0.5F, -0.4F, -0.5F, -0.5F, -0.1F, 0F, -0.5F, -0.1F); // Box 483
		drgpassengerModel[457].setRotationPoint(56.5F, 6F, 0.6F);

		drgpassengerModel[458].addShapeBox(0F, 1F, 0F, 1, 1, 1, 0F, -0.5F, -0.5F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, -0.5F, -0.5F, 0F, 1F, -0.5F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, 0F, 1F, -0.5F, 0F); // Box 484
		drgpassengerModel[458].setRotationPoint(55.5F, 1F, -7.5F);

		drgpassengerModel[459].addShapeBox(0F, 0F, 0F, 1, 1, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6.5F, 0F, 0F, -6.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6.5F, 0F, 0F, -6.4F); // Box 509
		drgpassengerModel[459].setRotationPoint(-27.25F, -9.5F, -4F);
		drgpassengerModel[459].rotateAngleX = -1.57079633F;
		drgpassengerModel[459].rotateAngleZ = -0.17453293F;

		drgpassengerModel[460].addBox(-0.5F, 0F, 0F, 0, 8, 14, 0F); // Box 510
		drgpassengerModel[460].setRotationPoint(-26.25F, -9F, -5F);
		drgpassengerModel[460].rotateAngleZ = -0.17453293F;

		drgpassengerModel[461].addBox(0F, 0F, 0F, 8, 0, 14, 0F); // Box 511
		drgpassengerModel[461].setRotationPoint(-36F, -1.5F, -5F);

		drgpassengerModel[462].addShapeBox(0F, 0F, 0F, 1, 1, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5.5F, 0F, 0F, -5.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5.5F, 0F, 0F, -5.5F); // Box 512
		drgpassengerModel[462].setRotationPoint(-36F, -2F, -4F);
		drgpassengerModel[462].rotateAngleY = -1.57079633F;

		drgpassengerModel[463].addShapeBox(0F, 0F, 0F, 1, 1, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6.5F, 0F, 0F, -6.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6.5F, 0F, 0F, -6.4F); // Box 513
		drgpassengerModel[463].setRotationPoint(-27.25F, -9.5F, 9F);
		drgpassengerModel[463].rotateAngleX = -1.57079633F;
		drgpassengerModel[463].rotateAngleZ = -0.17453293F;

		drgpassengerModel[464].addShapeBox(0F, 0F, 0F, 1, 1, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5.5F, 0F, 0F, -5.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5.5F, 0F, 0F, -5.5F); // Box 514
		drgpassengerModel[464].setRotationPoint(-36F, -2F, 9F);
		drgpassengerModel[464].rotateAngleY = -1.57079633F;

		drgpassengerModel[465].addShapeBox(0F, 0F, 0F, 1, 1, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 515
		drgpassengerModel[465].setRotationPoint(-27.25F, -9.5F, -4F);
		drgpassengerModel[465].rotateAngleZ = -0.17453293F;

		drgpassengerModel[466].addShapeBox(0F, 1.5F, 0F, 1, 1, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 516
		drgpassengerModel[466].setRotationPoint(-27.25F, -9.5F, -4F);
		drgpassengerModel[466].rotateAngleZ = -0.17453293F;

		drgpassengerModel[467].addShapeBox(0F, 3F, 0F, 1, 1, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 517
		drgpassengerModel[467].setRotationPoint(-27.25F, -9.5F, -4F);
		drgpassengerModel[467].rotateAngleZ = -0.17453293F;

		drgpassengerModel[468].addShapeBox(0F, 4.5F, 0F, 1, 1, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 518
		drgpassengerModel[468].setRotationPoint(-27.25F, -9.5F, -4F);
		drgpassengerModel[468].rotateAngleZ = -0.17453293F;

		drgpassengerModel[469].addShapeBox(0F, 6F, 0F, 1, 1, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 519
		drgpassengerModel[469].setRotationPoint(-27.25F, -9.5F, -4F);
		drgpassengerModel[469].rotateAngleZ = -0.17453293F;

		drgpassengerModel[470].addShapeBox(0F, 0F, 0F, 1, 1, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 520
		drgpassengerModel[470].setRotationPoint(-28.5F, -2F, -4F);

		drgpassengerModel[471].addShapeBox(0F, 0F, 0F, 1, 1, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 521
		drgpassengerModel[471].setRotationPoint(-30F, -2F, -4F);

		drgpassengerModel[472].addShapeBox(0F, 0F, 0F, 1, 1, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 522
		drgpassengerModel[472].setRotationPoint(-31.5F, -2F, -4F);

		drgpassengerModel[473].addShapeBox(0F, 0F, 0F, 1, 1, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 523
		drgpassengerModel[473].setRotationPoint(-33F, -2F, -4F);

		drgpassengerModel[474].addShapeBox(0F, 0F, 0F, 1, 1, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 524
		drgpassengerModel[474].setRotationPoint(-34.5F, -2F, -4F);

		drgpassengerModel[475].addShapeBox(0F, 0F, 0F, 1, 1, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 525
		drgpassengerModel[475].setRotationPoint(-36F, -2F, -4F);

		drgpassengerModel[476].addShapeBox(0F, 0F, 0F, 1, 1, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 510
		drgpassengerModel[476].setRotationPoint(-18F, -2F, -4F);

		drgpassengerModel[477].addBox(0F, 0F, 0F, 8, 0, 14, 0F); // Box 511
		drgpassengerModel[477].setRotationPoint(-18F, -1.5F, -5F);

		drgpassengerModel[478].addShapeBox(0F, 0F, 0F, 1, 1, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 512
		drgpassengerModel[478].setRotationPoint(-12F, -2F, -4F);

		drgpassengerModel[479].addShapeBox(0F, 0F, 0F, 1, 1, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 513
		drgpassengerModel[479].setRotationPoint(-10.5F, -2F, -4F);

		drgpassengerModel[480].addShapeBox(0F, 0F, 0F, 1, 1, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 514
		drgpassengerModel[480].setRotationPoint(-13.5F, -2F, -4F);

		drgpassengerModel[481].addShapeBox(0F, 0F, 0F, 1, 1, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 515
		drgpassengerModel[481].setRotationPoint(-15F, -2F, -4F);

		drgpassengerModel[482].addShapeBox(0F, 0F, 0F, 1, 1, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 516
		drgpassengerModel[482].setRotationPoint(-16.5F, -2F, -4F);

		drgpassengerModel[483].addBox(-0.5F, 0F, 0F, 0, 8, 14, 0F); // Box 517
		drgpassengerModel[483].setRotationPoint(-8.25F, -9F, -5F);
		drgpassengerModel[483].rotateAngleZ = -0.17453293F;

		drgpassengerModel[484].addShapeBox(0F, 6F, 0F, 1, 1, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 518
		drgpassengerModel[484].setRotationPoint(-9.25F, -9.5F, -4F);
		drgpassengerModel[484].rotateAngleZ = -0.17453293F;

		drgpassengerModel[485].addShapeBox(0F, 4.5F, 0F, 1, 1, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 519
		drgpassengerModel[485].setRotationPoint(-9.25F, -9.5F, -4F);
		drgpassengerModel[485].rotateAngleZ = -0.17453293F;

		drgpassengerModel[486].addShapeBox(0F, 3F, 0F, 1, 1, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 520
		drgpassengerModel[486].setRotationPoint(-9.25F, -9.5F, -4F);
		drgpassengerModel[486].rotateAngleZ = -0.17453293F;

		drgpassengerModel[487].addShapeBox(0F, 1.5F, 0F, 1, 1, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 521
		drgpassengerModel[487].setRotationPoint(-9.25F, -9.5F, -4F);
		drgpassengerModel[487].rotateAngleZ = -0.17453293F;

		drgpassengerModel[488].addShapeBox(0F, 0F, 0F, 1, 1, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 522
		drgpassengerModel[488].setRotationPoint(-9.25F, -9.5F, -4F);
		drgpassengerModel[488].rotateAngleZ = -0.17453293F;

		drgpassengerModel[489].addShapeBox(0F, 0F, 0F, 1, 1, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6.5F, 0F, 0F, -6.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6.5F, 0F, 0F, -6.4F); // Box 523
		drgpassengerModel[489].setRotationPoint(-9.25F, -9.5F, -4F);
		drgpassengerModel[489].rotateAngleX = -1.57079633F;
		drgpassengerModel[489].rotateAngleZ = -0.17453293F;

		drgpassengerModel[490].addShapeBox(0F, 0F, 0F, 1, 1, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5.5F, 0F, 0F, -5.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5.5F, 0F, 0F, -5.5F); // Box 524
		drgpassengerModel[490].setRotationPoint(-18F, -2F, -4F);
		drgpassengerModel[490].rotateAngleY = -1.57079633F;

		drgpassengerModel[491].addShapeBox(0F, 0F, 0F, 1, 1, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5.5F, 0F, 0F, -5.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5.5F, 0F, 0F, -5.5F); // Box 525
		drgpassengerModel[491].setRotationPoint(-18F, -2F, 9F);
		drgpassengerModel[491].rotateAngleY = -1.57079633F;

		drgpassengerModel[492].addShapeBox(0F, 0F, 0F, 1, 1, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6.5F, 0F, 0F, -6.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6.5F, 0F, 0F, -6.4F); // Box 526
		drgpassengerModel[492].setRotationPoint(-9.25F, -9.5F, 9F);
		drgpassengerModel[492].rotateAngleX = -1.57079633F;
		drgpassengerModel[492].rotateAngleZ = -0.17453293F;

		drgpassengerModel[493].addShapeBox(0F, 0F, 0F, 1, 1, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 527
		drgpassengerModel[493].setRotationPoint(0F, -2F, -4F);

		drgpassengerModel[494].addBox(0F, 0F, 0F, 8, 0, 14, 0F); // Box 528
		drgpassengerModel[494].setRotationPoint(0F, -1.5F, -5F);

		drgpassengerModel[495].addShapeBox(0F, 0F, 0F, 1, 1, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 529
		drgpassengerModel[495].setRotationPoint(6F, -2F, -4F);

		drgpassengerModel[496].addShapeBox(0F, 0F, 0F, 1, 1, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 530
		drgpassengerModel[496].setRotationPoint(7.5F, -2F, -4F);

		drgpassengerModel[497].addShapeBox(0F, 0F, 0F, 1, 1, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 531
		drgpassengerModel[497].setRotationPoint(4.5F, -2F, -4F);

		drgpassengerModel[498].addShapeBox(0F, 0F, 0F, 1, 1, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 532
		drgpassengerModel[498].setRotationPoint(3F, -2F, -4F);

		drgpassengerModel[499].addShapeBox(0F, 0F, 0F, 1, 1, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 533
		drgpassengerModel[499].setRotationPoint(1.5F, -2F, -4F);

		drgpassengerModel[500].addBox(-0.5F, 0F, 0F, 0, 8, 14, 0F); // Box 534
		drgpassengerModel[500].setRotationPoint(9.75F, -9F, -5F);
		drgpassengerModel[500].rotateAngleZ = -0.17453293F;

		drgpassengerModel[501].addShapeBox(0F, 6F, 0F, 1, 1, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 535
		drgpassengerModel[501].setRotationPoint(8.75F, -9.5F, -4F);
		drgpassengerModel[501].rotateAngleZ = -0.17453293F;

		drgpassengerModel[502].addShapeBox(0F, 4.5F, 0F, 1, 1, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 536
		drgpassengerModel[502].setRotationPoint(8.75F, -9.5F, -4F);
		drgpassengerModel[502].rotateAngleZ = -0.17453293F;

		drgpassengerModel[503].addShapeBox(0F, 3F, 0F, 1, 1, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 537
		drgpassengerModel[503].setRotationPoint(8.75F, -9.5F, -4F);
		drgpassengerModel[503].rotateAngleZ = -0.17453293F;

		drgpassengerModel[504].addShapeBox(0F, 1.5F, 0F, 1, 1, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 538
		drgpassengerModel[504].setRotationPoint(8.75F, -9.5F, -4F);
		drgpassengerModel[504].rotateAngleZ = -0.17453293F;

		drgpassengerModel[505].addShapeBox(0F, 0F, 0F, 1, 1, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 539
		drgpassengerModel[505].setRotationPoint(8.75F, -9.5F, -4F);
		drgpassengerModel[505].rotateAngleZ = -0.17453293F;

		drgpassengerModel[506].addShapeBox(0F, 0F, 0F, 1, 1, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6.5F, 0F, 0F, -6.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6.5F, 0F, 0F, -6.4F); // Box 540
		drgpassengerModel[506].setRotationPoint(8.75F, -9.5F, -4F);
		drgpassengerModel[506].rotateAngleX = -1.57079633F;
		drgpassengerModel[506].rotateAngleZ = -0.17453293F;

		drgpassengerModel[507].addShapeBox(0F, 0F, 0F, 1, 1, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5.5F, 0F, 0F, -5.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5.5F, 0F, 0F, -5.5F); // Box 541
		drgpassengerModel[507].setRotationPoint(0F, -2F, -4F);
		drgpassengerModel[507].rotateAngleY = -1.57079633F;

		drgpassengerModel[508].addShapeBox(0F, 0F, 0F, 1, 1, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5.5F, 0F, 0F, -5.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5.5F, 0F, 0F, -5.5F); // Box 542
		drgpassengerModel[508].setRotationPoint(0F, -2F, 9F);
		drgpassengerModel[508].rotateAngleY = -1.57079633F;

		drgpassengerModel[509].addShapeBox(0F, 0F, 0F, 1, 1, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6.5F, 0F, 0F, -6.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6.5F, 0F, 0F, -6.4F); // Box 543
		drgpassengerModel[509].setRotationPoint(8.75F, -9.5F, 9F);
		drgpassengerModel[509].rotateAngleX = -1.57079633F;
		drgpassengerModel[509].rotateAngleZ = -0.17453293F;

		drgpassengerModel[510].addShapeBox(0F, 0F, 0F, 1, 1, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 544
		drgpassengerModel[510].setRotationPoint(18F, -2F, -4F);

		drgpassengerModel[511].addBox(0F, 0F, 0F, 8, 0, 14, 0F); // Box 545
		drgpassengerModel[511].setRotationPoint(18F, -1.5F, -5F);

		drgpassengerModel[512].addShapeBox(0F, 0F, 0F, 1, 1, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 546
		drgpassengerModel[512].setRotationPoint(24F, -2F, -4F);

		drgpassengerModel[513].addShapeBox(0F, 0F, 0F, 1, 1, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 547
		drgpassengerModel[513].setRotationPoint(25.5F, -2F, -4F);

		drgpassengerModel[514].addShapeBox(0F, 0F, 0F, 1, 1, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 548
		drgpassengerModel[514].setRotationPoint(22.5F, -2F, -4F);

		drgpassengerModel[515].addShapeBox(0F, 0F, 0F, 1, 1, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 549
		drgpassengerModel[515].setRotationPoint(21F, -2F, -4F);

		drgpassengerModel[516].addShapeBox(0F, 0F, 0F, 1, 1, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 550
		drgpassengerModel[516].setRotationPoint(19.5F, -2F, -4F);

		drgpassengerModel[517].addBox(-0.5F, 0F, 0F, 0, 8, 14, 0F); // Box 551
		drgpassengerModel[517].setRotationPoint(27.75F, -9F, -5F);
		drgpassengerModel[517].rotateAngleZ = -0.17453293F;

		drgpassengerModel[518].addShapeBox(0F, 6F, 0F, 1, 1, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 552
		drgpassengerModel[518].setRotationPoint(26.75F, -9.5F, -4F);
		drgpassengerModel[518].rotateAngleZ = -0.17453293F;

		drgpassengerModel[519].addShapeBox(0F, 4.5F, 0F, 1, 1, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 553
		drgpassengerModel[519].setRotationPoint(26.75F, -9.5F, -4F);
		drgpassengerModel[519].rotateAngleZ = -0.17453293F;

		drgpassengerModel[520].addShapeBox(0F, 3F, 0F, 1, 1, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 554
		drgpassengerModel[520].setRotationPoint(26.75F, -9.5F, -4F);
		drgpassengerModel[520].rotateAngleZ = -0.17453293F;

		drgpassengerModel[521].addShapeBox(0F, 1.5F, 0F, 1, 1, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 555
		drgpassengerModel[521].setRotationPoint(26.75F, -9.5F, -4F);
		drgpassengerModel[521].rotateAngleZ = -0.17453293F;

		drgpassengerModel[522].addShapeBox(0F, 0F, 0F, 1, 1, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 556
		drgpassengerModel[522].setRotationPoint(26.75F, -9.5F, -4F);
		drgpassengerModel[522].rotateAngleZ = -0.17453293F;

		drgpassengerModel[523].addShapeBox(0F, 0F, 0F, 1, 1, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6.5F, 0F, 0F, -6.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6.5F, 0F, 0F, -6.4F); // Box 557
		drgpassengerModel[523].setRotationPoint(26.75F, -9.5F, -4F);
		drgpassengerModel[523].rotateAngleX = -1.57079633F;
		drgpassengerModel[523].rotateAngleZ = -0.17453293F;

		drgpassengerModel[524].addShapeBox(0F, 0F, 0F, 1, 1, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5.5F, 0F, 0F, -5.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5.5F, 0F, 0F, -5.5F); // Box 558
		drgpassengerModel[524].setRotationPoint(18F, -2F, -4F);
		drgpassengerModel[524].rotateAngleY = -1.57079633F;

		drgpassengerModel[525].addShapeBox(0F, 0F, 0F, 1, 1, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5.5F, 0F, 0F, -5.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5.5F, 0F, 0F, -5.5F); // Box 559
		drgpassengerModel[525].setRotationPoint(18F, -2F, 9F);
		drgpassengerModel[525].rotateAngleY = -1.57079633F;

		drgpassengerModel[526].addShapeBox(0F, 0F, 0F, 1, 1, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6.5F, 0F, 0F, -6.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6.5F, 0F, 0F, -6.4F); // Box 560
		drgpassengerModel[526].setRotationPoint(26.75F, -9.5F, 9F);
		drgpassengerModel[526].rotateAngleX = -1.57079633F;
		drgpassengerModel[526].rotateAngleZ = -0.17453293F;

		drgpassengerModel[527].addShapeBox(-0.25F, 9F, 4F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 572
		drgpassengerModel[527].setRotationPoint(44.25F, -17F, -3F);

		drgpassengerModel[528].addShapeBox(0F, 1F, 5F, 1, 7, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 573
		drgpassengerModel[528].setRotationPoint(44.25F, -17F, -3F);

		drgpassengerModel[529].addShapeBox(0F, 0.5F, 6F, 1, 18, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 574
		drgpassengerModel[529].setRotationPoint(44.25F, -17F, -3.5F);

		drgpassengerModel[530].addShapeBox(0F, 0F, -1F, 1, 1, 7, 0F, 0F, -0.5F, -1F, -0.5F, -0.5F, -1F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 575
		drgpassengerModel[530].setRotationPoint(44.25F, -17.5F, -3F);

		drgpassengerModel[531].addShapeBox(0F, 0.5F, -0.5F, 1, 1, 6, 0F, 0F, -0.5F, -1F, -0.5F, -0.5F, -1F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 576
		drgpassengerModel[531].setRotationPoint(44.25F, -17.5F, -3F);

		drgpassengerModel[532].addShapeBox(0F, 1F, 0F, 1, 18, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 577
		drgpassengerModel[532].setRotationPoint(44.25F, -17.5F, -3F);

		drgpassengerModel[533].addShapeBox(0F, 1F, 0.5F, 1, 7, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 578
		drgpassengerModel[533].setRotationPoint(44.25F, -17F, -3F);

		drgpassengerModel[534].addShapeBox(0F, 18.5F, -1F, 1, 1, 7, 0F, 0F, -0.5F, -1F, -0.5F, -0.5F, -1F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 579
		drgpassengerModel[534].setRotationPoint(44.25F, -17.5F, -3F);

		drgpassengerModel[535].addShapeBox(0F, 8F, -0.5F, 1, 11, 6, 0F, 0F, -0.5F, -1F, -0.5F, -0.5F, -1F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 580
		drgpassengerModel[535].setRotationPoint(44.25F, -17.5F, -3F);


		fixRotation(drgpassengerModel, false, true, true);
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		for(int i = 0; i < 536; i++)
		{
			drgpassengerModel[i].render(f5);
		}
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
	{
	}

	public ModelRendererTurbo drgpassengerModel[];
}