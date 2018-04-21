//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2018 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator:
// Created on:02.09.2017 - 19:22:23
// Last changed on: 02.09.2017 - 19:22:23

package train.client.render.models;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import tmt.ModelBase;
import tmt.ModelRendererTurbo;

public class ModelLocoC41 extends ModelBase
{
	int textureX = 512;
	int textureY = 128;

	public ModelLocoC41()
	{
		lococ41Model = new ModelRendererTurbo[498];
		lococ41Model[0] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 6
		lococ41Model[1] = new ModelRendererTurbo(this, 146, 1, textureX, textureY); // Box 10
		lococ41Model[2] = new ModelRendererTurbo(this, 162, 1, textureX, textureY); // Box 11
		lococ41Model[3] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 25
		lococ41Model[4] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 26
		lococ41Model[5] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 22
		lococ41Model[6] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 23
		lococ41Model[7] = new ModelRendererTurbo(this, 505, 17, textureX, textureY); // Box 24
		lococ41Model[8] = new ModelRendererTurbo(this, 146, 9, textureX, textureY); // Box 25
		lococ41Model[9] = new ModelRendererTurbo(this, 154, 9, textureX, textureY); // Box 26
		lococ41Model[10] = new ModelRendererTurbo(this, 33, 33, textureX, textureY); // Box 27
		lococ41Model[11] = new ModelRendererTurbo(this, 89, 33, textureX, textureY); // Box 28
		lococ41Model[12] = new ModelRendererTurbo(this, 129, 33, textureX, textureY); // Box 29
		lococ41Model[13] = new ModelRendererTurbo(this, 169, 33, textureX, textureY); // Box 30
		lococ41Model[14] = new ModelRendererTurbo(this, 209, 33, textureX, textureY); // Box 31
		lococ41Model[15] = new ModelRendererTurbo(this, 497, 25, textureX, textureY); // Box 32
		lococ41Model[16] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 33
		lococ41Model[17] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Box 34
		lococ41Model[18] = new ModelRendererTurbo(this, 9, 33, textureX, textureY); // Box 35
		lococ41Model[19] = new ModelRendererTurbo(this, 33, 33, textureX, textureY); // Box 36
		lococ41Model[20] = new ModelRendererTurbo(this, 41, 33, textureX, textureY); // Box 37
		lococ41Model[21] = new ModelRendererTurbo(this, 249, 33, textureX, textureY); // Box 38
		lococ41Model[22] = new ModelRendererTurbo(this, 257, 33, textureX, textureY); // Box 39
		lococ41Model[23] = new ModelRendererTurbo(this, 409, 33, textureX, textureY); // Box 45
		lococ41Model[24] = new ModelRendererTurbo(this, 457, 33, textureX, textureY); // Box 46
		lococ41Model[25] = new ModelRendererTurbo(this, 161, 41, textureX, textureY); // Box 47
		lococ41Model[26] = new ModelRendererTurbo(this, 289, 41, textureX, textureY); // Box 48
		lococ41Model[27] = new ModelRendererTurbo(this, 353, 41, textureX, textureY); // Box 49
		lococ41Model[28] = new ModelRendererTurbo(this, 401, 41, textureX, textureY); // Box 50
		lococ41Model[29] = new ModelRendererTurbo(this, 497, 33, textureX, textureY); // Box 52
		lococ41Model[30] = new ModelRendererTurbo(this, 121, 41, textureX, textureY); // Box 53
		lococ41Model[31] = new ModelRendererTurbo(this, 425, 41, textureX, textureY); // Box 54
		lococ41Model[32] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 55
		lococ41Model[33] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Box 56
		lococ41Model[34] = new ModelRendererTurbo(this, 137, 49, textureX, textureY); // Box 59
		lococ41Model[35] = new ModelRendererTurbo(this, 193, 52, textureX, textureY); // Box 60
		lococ41Model[36] = new ModelRendererTurbo(this, 265, 49, textureX, textureY); // Box 62
		lococ41Model[37] = new ModelRendererTurbo(this, 162, 9, textureX, textureY); // Box 63
		lococ41Model[38] = new ModelRendererTurbo(this, 241, 41, textureX, textureY); // Box 64
		lococ41Model[39] = new ModelRendererTurbo(this, 49, 33, textureX, textureY); // Box 65
		lococ41Model[40] = new ModelRendererTurbo(this, 113, 49, textureX, textureY); // Box 66
		lococ41Model[41] = new ModelRendererTurbo(this, 121, 57, textureX, textureY); // Box 71
		lococ41Model[42] = new ModelRendererTurbo(this, 65, 57, textureX, textureY); // Box 74
		lococ41Model[43] = new ModelRendererTurbo(this, 233, 65, textureX, textureY); // Box 85
		lococ41Model[44] = new ModelRendererTurbo(this, 121, 17, textureX, textureY); // Box 86
		lococ41Model[45] = new ModelRendererTurbo(this, 305, 65, textureX, textureY); // Box 87
		lococ41Model[46] = new ModelRendererTurbo(this, 33, 49, textureX, textureY); // Box 88
		lococ41Model[47] = new ModelRendererTurbo(this, 89, 49, textureX, textureY); // Box 89
		lococ41Model[48] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 90
		lococ41Model[49] = new ModelRendererTurbo(this, 401, 57, textureX, textureY); // Box 91
		lococ41Model[50] = new ModelRendererTurbo(this, 361, 65, textureX, textureY); // Box 92
		lococ41Model[51] = new ModelRendererTurbo(this, 397, 62, textureX, textureY); // Box 93
		lococ41Model[52] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 94
		lococ41Model[53] = new ModelRendererTurbo(this, 257, 49, textureX, textureY); // Box 95
		lococ41Model[54] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 96
		lococ41Model[55] = new ModelRendererTurbo(this, 473, 57, textureX, textureY); // Box 97
		lococ41Model[56] = new ModelRendererTurbo(this, 89, 9, textureX, textureY); // Box 99
		lococ41Model[57] = new ModelRendererTurbo(this, 209, 65, textureX, textureY); // Box 100
		lococ41Model[58] = new ModelRendererTurbo(this, 201, 33, textureX, textureY); // Box 102
		lococ41Model[59] = new ModelRendererTurbo(this, 449, 33, textureX, textureY); // Box 104
		lococ41Model[60] = new ModelRendererTurbo(this, 169, 57, textureX, textureY); // Box 105
		lococ41Model[61] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 106
		lococ41Model[62] = new ModelRendererTurbo(this, 369, 17, textureX, textureY); // Box 107
		lococ41Model[63] = new ModelRendererTurbo(this, 265, 33, textureX, textureY); // Box 108
		lococ41Model[64] = new ModelRendererTurbo(this, 289, 33, textureX, textureY); // Box 109
		lococ41Model[65] = new ModelRendererTurbo(this, 353, 33, textureX, textureY); // Box 110
		lococ41Model[66] = new ModelRendererTurbo(this, 409, 33, textureX, textureY); // Box 111
		lococ41Model[67] = new ModelRendererTurbo(this, 145, 73, textureX, textureY); // Box 114
		lococ41Model[68] = new ModelRendererTurbo(this, 113, 65, textureX, textureY); // Box 118
		lococ41Model[69] = new ModelRendererTurbo(this, 57, 73, textureX, textureY); // Box 119
		lococ41Model[70] = new ModelRendererTurbo(this, 145, 73, textureX, textureY); // Box 120
		lococ41Model[71] = new ModelRendererTurbo(this, 385, 41, textureX, textureY); // Box 127
		lococ41Model[72] = new ModelRendererTurbo(this, 441, 73, textureX, textureY); // Box 132
		lococ41Model[73] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 133
		lococ41Model[74] = new ModelRendererTurbo(this, 33, 81, textureX, textureY); // Box 132
		lococ41Model[75] = new ModelRendererTurbo(this, 81, 81, textureX, textureY); // Box 133
		lococ41Model[76] = new ModelRendererTurbo(this, 481, 73, textureX, textureY); // Box 135
		lococ41Model[77] = new ModelRendererTurbo(this, 353, 33, textureX, textureY); // Box 131
		lococ41Model[78] = new ModelRendererTurbo(this, 362, 16, textureX, textureY); // Box 196
		lococ41Model[79] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 199
		lococ41Model[80] = new ModelRendererTurbo(this, 176, 2, textureX, textureY); // Box 197
		lococ41Model[81] = new ModelRendererTurbo(this, 219, 97, textureX, textureY); // Box 196
		lococ41Model[82] = new ModelRendererTurbo(this, 359, 93, textureX, textureY); // Box 198
		lococ41Model[83] = new ModelRendererTurbo(this, 362, 7, textureX, textureY); // Box 200
		lococ41Model[84] = new ModelRendererTurbo(this, 169, 22, textureX, textureY); // Box 197
		lococ41Model[85] = new ModelRendererTurbo(this, 45, 22, textureX, textureY); // Box 198
		lococ41Model[86] = new ModelRendererTurbo(this, 168, 77, textureX, textureY); // Box 191
		lococ41Model[87] = new ModelRendererTurbo(this, 409, 33, textureX, textureY); // Box 194
		lococ41Model[88] = new ModelRendererTurbo(this, 196, 51, textureX, textureY); // Box 195
		lococ41Model[89] = new ModelRendererTurbo(this, 192, 54, textureX, textureY); // Box 196
		lococ41Model[90] = new ModelRendererTurbo(this, 197, 54, textureX, textureY); // Box 197
		lococ41Model[91] = new ModelRendererTurbo(this, 190, 50, textureX, textureY); // Box 198
		lococ41Model[92] = new ModelRendererTurbo(this, 194, 55, textureX, textureY); // Box 199
		lococ41Model[93] = new ModelRendererTurbo(this, 194, 54, textureX, textureY); // Box 200
		lococ41Model[94] = new ModelRendererTurbo(this, 187, 54, textureX, textureY); // Box 201
		lococ41Model[95] = new ModelRendererTurbo(this, 193, 55, textureX, textureY); // Box 202
		lococ41Model[96] = new ModelRendererTurbo(this, 197, 55, textureX, textureY); // Box 203
		lococ41Model[97] = new ModelRendererTurbo(this, 196, 50, textureX, textureY); // Box 204
		lococ41Model[98] = new ModelRendererTurbo(this, 196, 56, textureX, textureY); // Box 205
		lococ41Model[99] = new ModelRendererTurbo(this, 202, 56, textureX, textureY); // Box 206
		lococ41Model[100] = new ModelRendererTurbo(this, 194, 55, textureX, textureY); // Box 207
		lococ41Model[101] = new ModelRendererTurbo(this, 194, 53, textureX, textureY); // Box 208
		lococ41Model[102] = new ModelRendererTurbo(this, 202, 57, textureX, textureY); // Box 209
		lococ41Model[103] = new ModelRendererTurbo(this, 193, 52, textureX, textureY); // Box 212
		lococ41Model[104] = new ModelRendererTurbo(this, 197, 54, textureX, textureY); // Box 213
		lococ41Model[105] = new ModelRendererTurbo(this, 190, 50, textureX, textureY); // Box 214
		lococ41Model[106] = new ModelRendererTurbo(this, 196, 50, textureX, textureY); // Box 215
		lococ41Model[107] = new ModelRendererTurbo(this, 194, 53, textureX, textureY); // Box 216
		lococ41Model[108] = new ModelRendererTurbo(this, 196, 51, textureX, textureY); // Box 217
		lococ41Model[109] = new ModelRendererTurbo(this, 187, 54, textureX, textureY); // Box 218
		lococ41Model[110] = new ModelRendererTurbo(this, 192, 54, textureX, textureY); // Box 219
		lococ41Model[111] = new ModelRendererTurbo(this, 193, 55, textureX, textureY); // Box 220
		lococ41Model[112] = new ModelRendererTurbo(this, 194, 55, textureX, textureY); // Box 221
		lococ41Model[113] = new ModelRendererTurbo(this, 194, 54, textureX, textureY); // Box 222
		lococ41Model[114] = new ModelRendererTurbo(this, 197, 55, textureX, textureY); // Box 223
		lococ41Model[115] = new ModelRendererTurbo(this, 196, 56, textureX, textureY); // Box 224
		lococ41Model[116] = new ModelRendererTurbo(this, 202, 56, textureX, textureY); // Box 225
		lococ41Model[117] = new ModelRendererTurbo(this, 202, 57, textureX, textureY); // Box 226
		lococ41Model[118] = new ModelRendererTurbo(this, 194, 55, textureX, textureY); // Box 227
		lococ41Model[119] = new ModelRendererTurbo(this, 197, 54, textureX, textureY); // Box 228
		lococ41Model[120] = new ModelRendererTurbo(this, 197, 54, textureX, textureY); // Box 229
		lococ41Model[121] = new ModelRendererTurbo(this, 197, 54, textureX, textureY); // Box 230
		lococ41Model[122] = new ModelRendererTurbo(this, 197, 54, textureX, textureY); // Box 231
		lococ41Model[123] = new ModelRendererTurbo(this, 197, 54, textureX, textureY); // Box 232
		lococ41Model[124] = new ModelRendererTurbo(this, 197, 54, textureX, textureY); // Box 233
		lococ41Model[125] = new ModelRendererTurbo(this, 145, 73, textureX, textureY); // Box 235
		lococ41Model[126] = new ModelRendererTurbo(this, 145, 73, textureX, textureY); // Box 236
		lococ41Model[127] = new ModelRendererTurbo(this, 145, 73, textureX, textureY); // Box 237
		lococ41Model[128] = new ModelRendererTurbo(this, 145, 73, textureX, textureY); // Box 238
		lococ41Model[129] = new ModelRendererTurbo(this, 145, 73, textureX, textureY); // Box 239
		lococ41Model[130] = new ModelRendererTurbo(this, 145, 73, textureX, textureY); // Box 240
		lococ41Model[131] = new ModelRendererTurbo(this, 145, 73, textureX, textureY); // Box 241
		lococ41Model[132] = new ModelRendererTurbo(this, 145, 73, textureX, textureY); // Box 242
		lococ41Model[133] = new ModelRendererTurbo(this, 145, 73, textureX, textureY); // Box 243
		lococ41Model[134] = new ModelRendererTurbo(this, 145, 73, textureX, textureY); // Box 244
		lococ41Model[135] = new ModelRendererTurbo(this, 145, 73, textureX, textureY); // Box 245
		lococ41Model[136] = new ModelRendererTurbo(this, 145, 73, textureX, textureY); // Box 246
		lococ41Model[137] = new ModelRendererTurbo(this, 145, 73, textureX, textureY); // Box 247
		lococ41Model[138] = new ModelRendererTurbo(this, 145, 73, textureX, textureY); // Box 248
		lococ41Model[139] = new ModelRendererTurbo(this, 145, 73, textureX, textureY); // Box 249
		lococ41Model[140] = new ModelRendererTurbo(this, 145, 73, textureX, textureY); // Box 250
		lococ41Model[141] = new ModelRendererTurbo(this, 145, 73, textureX, textureY); // Box 252
		lococ41Model[142] = new ModelRendererTurbo(this, 145, 73, textureX, textureY); // Box 253
		lococ41Model[143] = new ModelRendererTurbo(this, 145, 73, textureX, textureY); // Box 254
		lococ41Model[144] = new ModelRendererTurbo(this, 145, 73, textureX, textureY); // Box 256
		lococ41Model[145] = new ModelRendererTurbo(this, 145, 73, textureX, textureY); // Box 257
		lococ41Model[146] = new ModelRendererTurbo(this, 145, 73, textureX, textureY); // Box 258
		lococ41Model[147] = new ModelRendererTurbo(this, 145, 73, textureX, textureY); // Box 259
		lococ41Model[148] = new ModelRendererTurbo(this, 309, 84, textureX, textureY); // Box 250
		lococ41Model[149] = new ModelRendererTurbo(this, 309, 84, textureX, textureY); // Box 251
		lococ41Model[150] = new ModelRendererTurbo(this, 317, 89, textureX, textureY); // Box 252
		lococ41Model[151] = new ModelRendererTurbo(this, 309, 88, textureX, textureY); // Box 254
		lococ41Model[152] = new ModelRendererTurbo(this, 317, 89, textureX, textureY); // Box 256
		lococ41Model[153] = new ModelRendererTurbo(this, 309, 88, textureX, textureY); // Box 257
		lococ41Model[154] = new ModelRendererTurbo(this, 192, 54, textureX, textureY); // Box 261
		lococ41Model[155] = new ModelRendererTurbo(this, 196, 50, textureX, textureY); // Box 263
		lococ41Model[156] = new ModelRendererTurbo(this, 192, 54, textureX, textureY); // Box 264
		lococ41Model[157] = new ModelRendererTurbo(this, 192, 54, textureX, textureY); // Box 265
		lococ41Model[158] = new ModelRendererTurbo(this, 192, 54, textureX, textureY); // Box 266
		lococ41Model[159] = new ModelRendererTurbo(this, 196, 50, textureX, textureY); // Box 267
		lococ41Model[160] = new ModelRendererTurbo(this, 196, 50, textureX, textureY); // Box 268
		lococ41Model[161] = new ModelRendererTurbo(this, 196, 50, textureX, textureY); // Box 269
		lococ41Model[162] = new ModelRendererTurbo(this, 192, 54, textureX, textureY); // Box 270
		lococ41Model[163] = new ModelRendererTurbo(this, 196, 50, textureX, textureY); // Box 271
		lococ41Model[164] = new ModelRendererTurbo(this, 192, 54, textureX, textureY); // Box 272
		lococ41Model[165] = new ModelRendererTurbo(this, 196, 50, textureX, textureY); // Box 273
		lococ41Model[166] = new ModelRendererTurbo(this, 192, 54, textureX, textureY); // Box 274
		lococ41Model[167] = new ModelRendererTurbo(this, 196, 50, textureX, textureY); // Box 275
		lococ41Model[168] = new ModelRendererTurbo(this, 196, 50, textureX, textureY); // Box 276
		lococ41Model[169] = new ModelRendererTurbo(this, 192, 54, textureX, textureY); // Box 277
		lococ41Model[170] = new ModelRendererTurbo(this, 149, 110, textureX, textureY); // Box 272
		lococ41Model[171] = new ModelRendererTurbo(this, 149, 100, textureX, textureY); // Box 273
		lococ41Model[172] = new ModelRendererTurbo(this, 142, 101, textureX, textureY); // Box 275
		lococ41Model[173] = new ModelRendererTurbo(this, 142, 111, textureX, textureY); // Box 276
		lococ41Model[174] = new ModelRendererTurbo(this, 161, 101, textureX, textureY); // Box 277
		lococ41Model[175] = new ModelRendererTurbo(this, 161, 110, textureX, textureY); // Box 278
		lococ41Model[176] = new ModelRendererTurbo(this, 156, 110, textureX, textureY); // Box 279
		lococ41Model[177] = new ModelRendererTurbo(this, 156, 101, textureX, textureY); // Box 280
		lococ41Model[178] = new ModelRendererTurbo(this, 309, 88, textureX, textureY); // Box 279
		lococ41Model[179] = new ModelRendererTurbo(this, 309, 88, textureX, textureY); // Box 280
		lococ41Model[180] = new ModelRendererTurbo(this, 309, 88, textureX, textureY); // Box 281
		lococ41Model[181] = new ModelRendererTurbo(this, 309, 88, textureX, textureY); // Box 282
		lococ41Model[182] = new ModelRendererTurbo(this, 309, 88, textureX, textureY); // Box 285
		lococ41Model[183] = new ModelRendererTurbo(this, 309, 88, textureX, textureY); // Box 286
		lococ41Model[184] = new ModelRendererTurbo(this, 309, 88, textureX, textureY); // Box 287
		lococ41Model[185] = new ModelRendererTurbo(this, 309, 88, textureX, textureY); // Box 288
		lococ41Model[186] = new ModelRendererTurbo(this, 309, 88, textureX, textureY); // Box 290
		lococ41Model[187] = new ModelRendererTurbo(this, 309, 84, textureX, textureY); // Box 292
		lococ41Model[188] = new ModelRendererTurbo(this, 309, 84, textureX, textureY); // Box 293
		lococ41Model[189] = new ModelRendererTurbo(this, 309, 84, textureX, textureY); // Box 295
		lococ41Model[190] = new ModelRendererTurbo(this, 309, 84, textureX, textureY); // Box 296
		lococ41Model[191] = new ModelRendererTurbo(this, 317, 89, textureX, textureY); // Box 297
		lococ41Model[192] = new ModelRendererTurbo(this, 309, 88, textureX, textureY); // Box 299
		lococ41Model[193] = new ModelRendererTurbo(this, 309, 88, textureX, textureY); // Box 300
		lococ41Model[194] = new ModelRendererTurbo(this, 317, 89, textureX, textureY); // Box 301
		lococ41Model[195] = new ModelRendererTurbo(this, 309, 84, textureX, textureY); // Box 303
		lococ41Model[196] = new ModelRendererTurbo(this, 309, 84, textureX, textureY); // Box 305
		lococ41Model[197] = new ModelRendererTurbo(this, 317, 89, textureX, textureY); // Box 308
		lococ41Model[198] = new ModelRendererTurbo(this, 309, 84, textureX, textureY); // Box 314
		lococ41Model[199] = new ModelRendererTurbo(this, 304, 72, textureX, textureY); // Box 325
		lococ41Model[200] = new ModelRendererTurbo(this, 304, 72, textureX, textureY); // Box 326
		lococ41Model[201] = new ModelRendererTurbo(this, 304, 72, textureX, textureY); // Box 327
		lococ41Model[202] = new ModelRendererTurbo(this, 304, 72, textureX, textureY); // Box 328
		lococ41Model[203] = new ModelRendererTurbo(this, 309, 88, textureX, textureY); // Box 329
		lococ41Model[204] = new ModelRendererTurbo(this, 385, 41, textureX, textureY); // Box 330
		lococ41Model[205] = new ModelRendererTurbo(this, 317, 89, textureX, textureY); // Box 332
		lococ41Model[206] = new ModelRendererTurbo(this, 309, 88, textureX, textureY); // Box 333
		lococ41Model[207] = new ModelRendererTurbo(this, 317, 89, textureX, textureY); // Box 334
		lococ41Model[208] = new ModelRendererTurbo(this, 317, 89, textureX, textureY); // Box 335
		lococ41Model[209] = new ModelRendererTurbo(this, 309, 88, textureX, textureY); // Box 336
		lococ41Model[210] = new ModelRendererTurbo(this, 385, 41, textureX, textureY); // Box 337
		lococ41Model[211] = new ModelRendererTurbo(this, 309, 84, textureX, textureY); // Box 327
		lococ41Model[212] = new ModelRendererTurbo(this, 309, 88, textureX, textureY); // Box 328
		lococ41Model[213] = new ModelRendererTurbo(this, 309, 84, textureX, textureY); // Box 329
		lococ41Model[214] = new ModelRendererTurbo(this, 309, 84, textureX, textureY); // Box 333
		lococ41Model[215] = new ModelRendererTurbo(this, 309, 84, textureX, textureY); // Box 334
		lococ41Model[216] = new ModelRendererTurbo(this, 309, 84, textureX, textureY); // Box 335
		lococ41Model[217] = new ModelRendererTurbo(this, 309, 84, textureX, textureY); // Box 336
		lococ41Model[218] = new ModelRendererTurbo(this, 309, 88, textureX, textureY); // Box 339
		lococ41Model[219] = new ModelRendererTurbo(this, 309, 88, textureX, textureY); // Box 340
		lococ41Model[220] = new ModelRendererTurbo(this, 309, 84, textureX, textureY); // Box 341
		lococ41Model[221] = new ModelRendererTurbo(this, 309, 88, textureX, textureY); // Box 342
		lococ41Model[222] = new ModelRendererTurbo(this, 309, 84, textureX, textureY); // Box 343
		lococ41Model[223] = new ModelRendererTurbo(this, 309, 84, textureX, textureY); // Box 344
		lococ41Model[224] = new ModelRendererTurbo(this, 309, 84, textureX, textureY); // Box 345
		lococ41Model[225] = new ModelRendererTurbo(this, 309, 84, textureX, textureY); // Box 346
		lococ41Model[226] = new ModelRendererTurbo(this, 207, 117, textureX, textureY); // Box 347
		lococ41Model[227] = new ModelRendererTurbo(this, 160, 122, textureX, textureY); // Box 348
		lococ41Model[228] = new ModelRendererTurbo(this, 165, 122, textureX, textureY); // Box 349
		lococ41Model[229] = new ModelRendererTurbo(this, 202, 117, textureX, textureY); // Box 350
		lococ41Model[230] = new ModelRendererTurbo(this, 192, 118, textureX, textureY); // Box 351
		lococ41Model[231] = new ModelRendererTurbo(this, 183, 118, textureX, textureY); // Box 352
		lococ41Model[232] = new ModelRendererTurbo(this, 141, 121, textureX, textureY); // Box 353
		lococ41Model[233] = new ModelRendererTurbo(this, 150, 121, textureX, textureY); // Box 354
		lococ41Model[234] = new ModelRendererTurbo(this, 194, 103, textureX, textureY, "lamp"); // Box 356
		lococ41Model[235] = new ModelRendererTurbo(this, 194, 103, textureX, textureY); // Box 357
		lococ41Model[236] = new ModelRendererTurbo(this, 194, 103, textureX, textureY); // Box 358
		lococ41Model[237] = new ModelRendererTurbo(this, 194, 103, textureX, textureY); // Box 359
		lococ41Model[238] = new ModelRendererTurbo(this, 194, 103, textureX, textureY); // Box 360
		lococ41Model[239] = new ModelRendererTurbo(this, 194, 103, textureX, textureY); // Box 361
		lococ41Model[240] = new ModelRendererTurbo(this, 194, 103, textureX, textureY); // Box 362
		lococ41Model[241] = new ModelRendererTurbo(this, 194, 103, textureX, textureY); // Box 363
		lococ41Model[242] = new ModelRendererTurbo(this, 194, 103, textureX, textureY); // Box 364
		lococ41Model[243] = new ModelRendererTurbo(this, 137, 90, textureX, textureY); // Box 365
		lococ41Model[244] = new ModelRendererTurbo(this, 317, 89, textureX, textureY); // Box 366
		lococ41Model[245] = new ModelRendererTurbo(this, 204, 98, textureX, textureY); // Box 367
		lococ41Model[246] = new ModelRendererTurbo(this, 204, 98, textureX, textureY); // Box 368
		lococ41Model[247] = new ModelRendererTurbo(this, 194, 103, textureX, textureY); // Box 360
		lococ41Model[248] = new ModelRendererTurbo(this, 171, 98, textureX, textureY); // Box 362
		lococ41Model[249] = new ModelRendererTurbo(this, 171, 98, textureX, textureY); // Box 365
		lococ41Model[250] = new ModelRendererTurbo(this, 218, 111, textureX, textureY); // Box 396
		lococ41Model[251] = new ModelRendererTurbo(this, 176, 120, textureX, textureY); // Box 405
		lococ41Model[252] = new ModelRendererTurbo(this, 176, 120, textureX, textureY); // Box 378
		lococ41Model[253] = new ModelRendererTurbo(this, 176, 120, textureX, textureY); // Box 379
		lococ41Model[254] = new ModelRendererTurbo(this, 176, 120, textureX, textureY); // Box 380
		lococ41Model[255] = new ModelRendererTurbo(this, 176, 120, textureX, textureY); // Box 381
		lococ41Model[256] = new ModelRendererTurbo(this, 176, 120, textureX, textureY); // Box 382
		lococ41Model[257] = new ModelRendererTurbo(this, 176, 120, textureX, textureY); // Box 383
		lococ41Model[258] = new ModelRendererTurbo(this, 176, 120, textureX, textureY); // Box 384
		lococ41Model[259] = new ModelRendererTurbo(this, 347, 91, textureX, textureY); // Box 396
		lococ41Model[260] = new ModelRendererTurbo(this, 182, 103, textureX, textureY); // Box 390
		lococ41Model[261] = new ModelRendererTurbo(this, 182, 109, textureX, textureY); // Box 391
		lococ41Model[262] = new ModelRendererTurbo(this, 182, 109, textureX, textureY); // Box 397
		lococ41Model[263] = new ModelRendererTurbo(this, 182, 112, textureX, textureY); // Box 398
		lococ41Model[264] = new ModelRendererTurbo(this, 182, 112, textureX, textureY); // Box 401
		lococ41Model[265] = new ModelRendererTurbo(this, 182, 112, textureX, textureY); // Box 402
		lococ41Model[266] = new ModelRendererTurbo(this, 182, 112, textureX, textureY); // Box 403
		lococ41Model[267] = new ModelRendererTurbo(this, 385, 41, textureX, textureY); // Box 404
		lococ41Model[268] = new ModelRendererTurbo(this, 385, 41, textureX, textureY); // Box 405
		lococ41Model[269] = new ModelRendererTurbo(this, 176, 120, textureX, textureY); // Box 406
		lococ41Model[270] = new ModelRendererTurbo(this, 176, 120, textureX, textureY); // Box 407
		lococ41Model[271] = new ModelRendererTurbo(this, 176, 120, textureX, textureY); // Box 408
		lococ41Model[272] = new ModelRendererTurbo(this, 176, 120, textureX, textureY); // Box 409
		lococ41Model[273] = new ModelRendererTurbo(this, 176, 120, textureX, textureY); // Box 411
		lococ41Model[274] = new ModelRendererTurbo(this, 176, 120, textureX, textureY); // Box 412
		lococ41Model[275] = new ModelRendererTurbo(this, 176, 120, textureX, textureY); // Box 413
		lococ41Model[276] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 402
		lococ41Model[277] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 403
		lococ41Model[278] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 404
		lococ41Model[279] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 405
		lococ41Model[280] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 406
		lococ41Model[281] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 407
		lococ41Model[282] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 408
		lococ41Model[283] = new ModelRendererTurbo(this, 154, 9, textureX, textureY); // Box 331
		lococ41Model[284] = new ModelRendererTurbo(this, 154, 9, textureX, textureY); // Box 333
		lococ41Model[285] = new ModelRendererTurbo(this, 154, 9, textureX, textureY); // Box 334
		lococ41Model[286] = new ModelRendererTurbo(this, 154, 9, textureX, textureY); // Box 335
		lococ41Model[287] = new ModelRendererTurbo(this, 24, 14, textureX, textureY); // Box 330
		lococ41Model[288] = new ModelRendererTurbo(this, 24, 14, textureX, textureY); // Box 331
		lococ41Model[289] = new ModelRendererTurbo(this, 24, 14, textureX, textureY); // Box 332
		lococ41Model[290] = new ModelRendererTurbo(this, 24, 14, textureX, textureY); // Box 333
		lococ41Model[291] = new ModelRendererTurbo(this, 337, 73, textureX, textureY); // Box 334
		lococ41Model[292] = new ModelRendererTurbo(this, 306, 8, textureX, textureY); // Box 335
		lococ41Model[293] = new ModelRendererTurbo(this, 330, 12, textureX, textureY); // Box 338
		lococ41Model[294] = new ModelRendererTurbo(this, 330, 12, textureX, textureY); // Box 339
		lococ41Model[295] = new ModelRendererTurbo(this, 337, 9, textureX, textureY); // Box 340
		lococ41Model[296] = new ModelRendererTurbo(this, 24, 14, textureX, textureY); // Box 338
		lococ41Model[297] = new ModelRendererTurbo(this, 169, 33, textureX, textureY); // Box 339
		lococ41Model[298] = new ModelRendererTurbo(this, 209, 33, textureX, textureY); // Box 340
		lococ41Model[299] = new ModelRendererTurbo(this, 121, 57, textureX, textureY); // Box 341
		lococ41Model[300] = new ModelRendererTurbo(this, 121, 57, textureX, textureY); // Box 343
		lococ41Model[301] = new ModelRendererTurbo(this, 121, 57, textureX, textureY); // Box 345
		lococ41Model[302] = new ModelRendererTurbo(this, 121, 57, textureX, textureY); // Box 341
		lococ41Model[303] = new ModelRendererTurbo(this, 121, 57, textureX, textureY); // Box 342
		lococ41Model[304] = new ModelRendererTurbo(this, 121, 57, textureX, textureY); // Box 343
		lococ41Model[305] = new ModelRendererTurbo(this, 233, 52, textureX, textureY); // Box 341
		lococ41Model[306] = new ModelRendererTurbo(this, 241, 54, textureX, textureY); // Box 342
		lococ41Model[307] = new ModelRendererTurbo(this, 385, 41, textureX, textureY); // Box 343
		lococ41Model[308] = new ModelRendererTurbo(this, 385, 41, textureX, textureY); // Box 344
		lococ41Model[309] = new ModelRendererTurbo(this, 385, 41, textureX, textureY); // Box 345
		lococ41Model[310] = new ModelRendererTurbo(this, 385, 41, textureX, textureY); // Box 346
		lococ41Model[311] = new ModelRendererTurbo(this, 385, 41, textureX, textureY); // Box 347
		lococ41Model[312] = new ModelRendererTurbo(this, 385, 41, textureX, textureY); // Box 348
		lococ41Model[313] = new ModelRendererTurbo(this, 385, 41, textureX, textureY); // Box 349
		lococ41Model[314] = new ModelRendererTurbo(this, 385, 41, textureX, textureY); // Box 350
		lococ41Model[315] = new ModelRendererTurbo(this, 385, 41, textureX, textureY); // Box 351
		lococ41Model[316] = new ModelRendererTurbo(this, 385, 41, textureX, textureY); // Box 352
		lococ41Model[317] = new ModelRendererTurbo(this, 337, 73, textureX, textureY); // Box 353
		lococ41Model[318] = new ModelRendererTurbo(this, 385, 41, textureX, textureY); // Box 354
		lococ41Model[319] = new ModelRendererTurbo(this, 385, 41, textureX, textureY); // Box 355
		lococ41Model[320] = new ModelRendererTurbo(this, 385, 41, textureX, textureY); // Box 356
		lococ41Model[321] = new ModelRendererTurbo(this, 385, 41, textureX, textureY); // Box 357
		lococ41Model[322] = new ModelRendererTurbo(this, 385, 41, textureX, textureY); // Box 358
		lococ41Model[323] = new ModelRendererTurbo(this, 385, 41, textureX, textureY); // Box 359
		lococ41Model[324] = new ModelRendererTurbo(this, 385, 41, textureX, textureY); // Box 360
		lococ41Model[325] = new ModelRendererTurbo(this, 385, 41, textureX, textureY); // Box 361
		lococ41Model[326] = new ModelRendererTurbo(this, 385, 41, textureX, textureY); // Box 362
		lococ41Model[327] = new ModelRendererTurbo(this, 460, 46, textureX, textureY); // Box 363
		lococ41Model[328] = new ModelRendererTurbo(this, 485, 43, textureX, textureY); // Box 367
		lococ41Model[329] = new ModelRendererTurbo(this, 485, 43, textureX, textureY); // Box 368
		lococ41Model[330] = new ModelRendererTurbo(this, 485, 43, textureX, textureY); // Box 369
		lococ41Model[331] = new ModelRendererTurbo(this, 483, 43, textureX, textureY); // Box 370
		lococ41Model[332] = new ModelRendererTurbo(this, 485, 43, textureX, textureY); // Box 371
		lococ41Model[333] = new ModelRendererTurbo(this, 485, 43, textureX, textureY); // Box 372
		lococ41Model[334] = new ModelRendererTurbo(this, 485, 43, textureX, textureY); // Box 373
		lococ41Model[335] = new ModelRendererTurbo(this, 485, 43, textureX, textureY); // Box 376
		lococ41Model[336] = new ModelRendererTurbo(this, 485, 43, textureX, textureY); // Box 377
		lococ41Model[337] = new ModelRendererTurbo(this, 485, 43, textureX, textureY); // Box 378
		lococ41Model[338] = new ModelRendererTurbo(this, 483, 43, textureX, textureY); // Box 379
		lococ41Model[339] = new ModelRendererTurbo(this, 485, 43, textureX, textureY); // Box 380
		lococ41Model[340] = new ModelRendererTurbo(this, 485, 43, textureX, textureY); // Box 381
		lococ41Model[341] = new ModelRendererTurbo(this, 485, 43, textureX, textureY); // Box 382
		lococ41Model[342] = new ModelRendererTurbo(this, 485, 43, textureX, textureY); // Box 383
		lococ41Model[343] = new ModelRendererTurbo(this, 485, 43, textureX, textureY); // Box 384
		lococ41Model[344] = new ModelRendererTurbo(this, 485, 43, textureX, textureY); // Box 385
		lococ41Model[345] = new ModelRendererTurbo(this, 483, 43, textureX, textureY); // Box 386
		lococ41Model[346] = new ModelRendererTurbo(this, 485, 43, textureX, textureY); // Box 387
		lococ41Model[347] = new ModelRendererTurbo(this, 485, 43, textureX, textureY); // Box 388
		lococ41Model[348] = new ModelRendererTurbo(this, 485, 43, textureX, textureY); // Box 389
		lococ41Model[349] = new ModelRendererTurbo(this, 304, 72, textureX, textureY); // Box 390
		lococ41Model[350] = new ModelRendererTurbo(this, 304, 72, textureX, textureY); // Box 391
		lococ41Model[351] = new ModelRendererTurbo(this, 309, 84, textureX, textureY); // Box 392
		lococ41Model[352] = new ModelRendererTurbo(this, 304, 72, textureX, textureY); // Box 393
		lococ41Model[353] = new ModelRendererTurbo(this, 304, 72, textureX, textureY); // Box 394
		lococ41Model[354] = new ModelRendererTurbo(this, 483, 43, textureX, textureY); // Box 395
		lococ41Model[355] = new ModelRendererTurbo(this, 485, 43, textureX, textureY); // Box 396
		lococ41Model[356] = new ModelRendererTurbo(this, 485, 43, textureX, textureY); // Box 397
		lococ41Model[357] = new ModelRendererTurbo(this, 485, 43, textureX, textureY); // Box 398
		lococ41Model[358] = new ModelRendererTurbo(this, 485, 43, textureX, textureY); // Box 399
		lococ41Model[359] = new ModelRendererTurbo(this, 485, 43, textureX, textureY); // Box 400
		lococ41Model[360] = new ModelRendererTurbo(this, 485, 43, textureX, textureY); // Box 401
		lococ41Model[361] = new ModelRendererTurbo(this, 485, 43, textureX, textureY); // Box 402
		lococ41Model[362] = new ModelRendererTurbo(this, 485, 43, textureX, textureY); // Box 403
		lococ41Model[363] = new ModelRendererTurbo(this, 483, 43, textureX, textureY); // Box 404
		lococ41Model[364] = new ModelRendererTurbo(this, 485, 43, textureX, textureY); // Box 405
		lococ41Model[365] = new ModelRendererTurbo(this, 485, 43, textureX, textureY); // Box 406
		lococ41Model[366] = new ModelRendererTurbo(this, 485, 43, textureX, textureY); // Box 407
		lococ41Model[367] = new ModelRendererTurbo(this, 485, 43, textureX, textureY); // Box 408
		lococ41Model[368] = new ModelRendererTurbo(this, 485, 43, textureX, textureY); // Box 409
		lococ41Model[369] = new ModelRendererTurbo(this, 485, 43, textureX, textureY); // Box 410
		lococ41Model[370] = new ModelRendererTurbo(this, 483, 43, textureX, textureY); // Box 411
		lococ41Model[371] = new ModelRendererTurbo(this, 485, 43, textureX, textureY); // Box 412
		lococ41Model[372] = new ModelRendererTurbo(this, 485, 43, textureX, textureY); // Box 413
		lococ41Model[373] = new ModelRendererTurbo(this, 485, 43, textureX, textureY); // Box 414
		lococ41Model[374] = new ModelRendererTurbo(this, 485, 43, textureX, textureY); // Box 415
		lococ41Model[375] = new ModelRendererTurbo(this, 397, 35, textureX, textureY); // Box 417
		lococ41Model[376] = new ModelRendererTurbo(this, 395, 33, textureX, textureY); // Box 421
		lococ41Model[377] = new ModelRendererTurbo(this, 397, 35, textureX, textureY); // Box 423
		lococ41Model[378] = new ModelRendererTurbo(this, 395, 33, textureX, textureY); // Box 424
		lococ41Model[379] = new ModelRendererTurbo(this, 397, 35, textureX, textureY); // Box 425
		lococ41Model[380] = new ModelRendererTurbo(this, 397, 35, textureX, textureY); // Box 426
		lococ41Model[381] = new ModelRendererTurbo(this, 322, 24, textureX, textureY); // Box 429
		lococ41Model[382] = new ModelRendererTurbo(this, 322, 24, textureX, textureY); // Box 431
		lococ41Model[383] = new ModelRendererTurbo(this, 293, 24, textureX, textureY); // Box 432
		lococ41Model[384] = new ModelRendererTurbo(this, 326, 3, textureX, textureY); // Box 433
		lococ41Model[385] = new ModelRendererTurbo(this, 326, 3, textureX, textureY); // Box 434
		lococ41Model[386] = new ModelRendererTurbo(this, 301, 3, textureX, textureY); // Box 435
		lococ41Model[387] = new ModelRendererTurbo(this, 326, 3, textureX, textureY); // Box 405
		lococ41Model[388] = new ModelRendererTurbo(this, 301, 3, textureX, textureY); // Box 406
		lococ41Model[389] = new ModelRendererTurbo(this, 326, 3, textureX, textureY); // Box 407
		lococ41Model[390] = new ModelRendererTurbo(this, 322, 24, textureX, textureY); // Box 408
		lococ41Model[391] = new ModelRendererTurbo(this, 293, 24, textureX, textureY); // Box 409
		lococ41Model[392] = new ModelRendererTurbo(this, 322, 24, textureX, textureY); // Box 410
		lococ41Model[393] = new ModelRendererTurbo(this, 392, 45, textureX, textureY); // Box 411
		lococ41Model[394] = new ModelRendererTurbo(this, 393, 46, textureX, textureY); // Box 412
		lococ41Model[395] = new ModelRendererTurbo(this, 393, 46, textureX, textureY); // Box 415
		lococ41Model[396] = new ModelRendererTurbo(this, 392, 45, textureX, textureY); // Box 416
		lococ41Model[397] = new ModelRendererTurbo(this, 145, 73, textureX, textureY); // Box 417
		lococ41Model[398] = new ModelRendererTurbo(this, 390, 43, textureX, textureY); // Box 419
		lococ41Model[399] = new ModelRendererTurbo(this, 390, 43, textureX, textureY); // Box 421
		lococ41Model[400] = new ModelRendererTurbo(this, 65, 9, textureX, textureY); // Box 422
		lococ41Model[401] = new ModelRendererTurbo(this, 65, 9, textureX, textureY); // Box 424
		lococ41Model[402] = new ModelRendererTurbo(this, 89, 9, textureX, textureY); // Box 426
		lococ41Model[403] = new ModelRendererTurbo(this, 335, 12, textureX, textureY); // Box 427
		lococ41Model[404] = new ModelRendererTurbo(this, 335, 12, textureX, textureY); // Box 428
		lococ41Model[405] = new ModelRendererTurbo(this, 335, 12, textureX, textureY); // Box 429
		lococ41Model[406] = new ModelRendererTurbo(this, 335, 12, textureX, textureY); // Box 430
		lococ41Model[407] = new ModelRendererTurbo(this, 335, 12, textureX, textureY); // Box 431
		lococ41Model[408] = new ModelRendererTurbo(this, 342, 100, textureX, textureY); // Box 432
		lococ41Model[409] = new ModelRendererTurbo(this, 342, 100, textureX, textureY); // Box 433
		lococ41Model[410] = new ModelRendererTurbo(this, 370, 107, textureX, textureY); // Box 434
		lococ41Model[411] = new ModelRendererTurbo(this, 390, 104, textureX, textureY); // Box 435
		lococ41Model[412] = new ModelRendererTurbo(this, 389, 110, textureX, textureY); // Box 436
		lococ41Model[413] = new ModelRendererTurbo(this, 395, 104, textureX, textureY); // Box 437
		lococ41Model[414] = new ModelRendererTurbo(this, 381, 110, textureX, textureY); // Box 438
		lococ41Model[415] = new ModelRendererTurbo(this, 396, 110, textureX, textureY); // Box 439
		lococ41Model[416] = new ModelRendererTurbo(this, 382, 106, textureX, textureY); // Box 440
		lococ41Model[417] = new ModelRendererTurbo(this, 360, 104, textureX, textureY); // Box 441
		lococ41Model[418] = new ModelRendererTurbo(this, 360, 104, textureX, textureY); // Box 442
		lococ41Model[419] = new ModelRendererTurbo(this, 360, 106, textureX, textureY); // Box 443
		lococ41Model[420] = new ModelRendererTurbo(this, 360, 106, textureX, textureY); // Box 444
		lococ41Model[421] = new ModelRendererTurbo(this, 357, 103, textureX, textureY); // Box 445
		lococ41Model[422] = new ModelRendererTurbo(this, 368, 104, textureX, textureY); // Box 446
		lococ41Model[423] = new ModelRendererTurbo(this, 368, 104, textureX, textureY); // Box 447
		lococ41Model[424] = new ModelRendererTurbo(this, 368, 104, textureX, textureY); // Box 449
		lococ41Model[425] = new ModelRendererTurbo(this, 402, 105, textureX, textureY); // Box 450
		lococ41Model[426] = new ModelRendererTurbo(this, 402, 105, textureX, textureY); // Box 451
		lococ41Model[427] = new ModelRendererTurbo(this, 402, 105, textureX, textureY); // Box 452
		lococ41Model[428] = new ModelRendererTurbo(this, 341, 97, textureX, textureY, "lamp"); // Box 453
		lococ41Model[429] = new ModelRendererTurbo(this, 390, 113, textureX, textureY); // Box 454
		lococ41Model[430] = new ModelRendererTurbo(this, 390, 113, textureX, textureY); // Box 455
		lococ41Model[431] = new ModelRendererTurbo(this, 32, 2, textureX, textureY); // Box 436
		lococ41Model[432] = new ModelRendererTurbo(this, 32, 2, textureX, textureY); // Box 437
		lococ41Model[433] = new ModelRendererTurbo(this, 32, 2, textureX, textureY); // Box 438
		lococ41Model[434] = new ModelRendererTurbo(this, 32, 2, textureX, textureY); // Box 439
		lococ41Model[435] = new ModelRendererTurbo(this, 38, 5, textureX, textureY); // Box 440
		lococ41Model[436] = new ModelRendererTurbo(this, 38, 5, textureX, textureY); // Box 441
		lococ41Model[437] = new ModelRendererTurbo(this, 38, 5, textureX, textureY); // Box 442
		lococ41Model[438] = new ModelRendererTurbo(this, 38, 5, textureX, textureY); // Box 443
		lococ41Model[439] = new ModelRendererTurbo(this, 38, 5, textureX, textureY); // Box 444
		lococ41Model[440] = new ModelRendererTurbo(this, 38, 5, textureX, textureY); // Box 445
		lococ41Model[441] = new ModelRendererTurbo(this, 38, 5, textureX, textureY); // Box 446
		lococ41Model[442] = new ModelRendererTurbo(this, 38, 5, textureX, textureY); // Box 447
		lococ41Model[443] = new ModelRendererTurbo(this, 38, 5, textureX, textureY); // Box 448
		lococ41Model[444] = new ModelRendererTurbo(this, 38, 5, textureX, textureY); // Box 449
		lococ41Model[445] = new ModelRendererTurbo(this, 38, 5, textureX, textureY); // Box 450
		lococ41Model[446] = new ModelRendererTurbo(this, 38, 5, textureX, textureY); // Box 451
		lococ41Model[447] = new ModelRendererTurbo(this, 38, 5, textureX, textureY); // Box 452
		lococ41Model[448] = new ModelRendererTurbo(this, 38, 5, textureX, textureY); // Box 453
		lococ41Model[449] = new ModelRendererTurbo(this, 32, 2, textureX, textureY); // Box 454
		lococ41Model[450] = new ModelRendererTurbo(this, 38, 5, textureX, textureY); // Box 455
		lococ41Model[451] = new ModelRendererTurbo(this, 38, 5, textureX, textureY); // Box 456
		lococ41Model[452] = new ModelRendererTurbo(this, 32, 2, textureX, textureY); // Box 457
		lococ41Model[453] = new ModelRendererTurbo(this, 38, 5, textureX, textureY); // Box 458
		lococ41Model[454] = new ModelRendererTurbo(this, 38, 5, textureX, textureY); // Box 459
		lococ41Model[455] = new ModelRendererTurbo(this, 38, 5, textureX, textureY); // Box 460
		lococ41Model[456] = new ModelRendererTurbo(this, 32, 2, textureX, textureY); // Box 461
		lococ41Model[457] = new ModelRendererTurbo(this, 38, 5, textureX, textureY); // Box 462
		lococ41Model[458] = new ModelRendererTurbo(this, 38, 5, textureX, textureY); // Box 463
		lococ41Model[459] = new ModelRendererTurbo(this, 38, 5, textureX, textureY); // Box 464
		lococ41Model[460] = new ModelRendererTurbo(this, 32, 2, textureX, textureY); // Box 465
		lococ41Model[461] = new ModelRendererTurbo(this, 38, 5, textureX, textureY); // Box 466
		lococ41Model[462] = new ModelRendererTurbo(this, 38, 5, textureX, textureY); // Box 467
		lococ41Model[463] = new ModelRendererTurbo(this, 233, 68, textureX, textureY); // Box 468
		lococ41Model[464] = new ModelRendererTurbo(this, 233, 68, textureX, textureY); // Box 469
		lococ41Model[465] = new ModelRendererTurbo(this, 310, 68, textureX, textureY); // Box 470
		lococ41Model[466] = new ModelRendererTurbo(this, 310, 68, textureX, textureY); // Box 471
		lococ41Model[467] = new ModelRendererTurbo(this, 233, 71, textureX, textureY); // Box 474
		lococ41Model[468] = new ModelRendererTurbo(this, 233, 71, textureX, textureY); // Box 476
		lococ41Model[469] = new ModelRendererTurbo(this, 233, 71, textureX, textureY); // Box 477
		lococ41Model[470] = new ModelRendererTurbo(this, 238, 70, textureX, textureY); // Box 478
		lococ41Model[471] = new ModelRendererTurbo(this, 121, 17, textureX, textureY); // Box 479
		lococ41Model[472] = new ModelRendererTurbo(this, 121, 17, textureX, textureY); // Box 480
		lococ41Model[473] = new ModelRendererTurbo(this, 233, 71, textureX, textureY); // Box 481
		lococ41Model[474] = new ModelRendererTurbo(this, 233, 68, textureX, textureY); // Box 482
		lococ41Model[475] = new ModelRendererTurbo(this, 233, 68, textureX, textureY); // Box 483
		lococ41Model[476] = new ModelRendererTurbo(this, 310, 68, textureX, textureY); // Box 484
		lococ41Model[477] = new ModelRendererTurbo(this, 310, 68, textureX, textureY); // Box 485
		lococ41Model[478] = new ModelRendererTurbo(this, 121, 17, textureX, textureY); // Box 486
		lococ41Model[479] = new ModelRendererTurbo(this, 121, 17, textureX, textureY); // Box 487
		lococ41Model[480] = new ModelRendererTurbo(this, 233, 71, textureX, textureY); // Box 488
		lococ41Model[481] = new ModelRendererTurbo(this, 233, 71, textureX, textureY); // Box 489
		lococ41Model[482] = new ModelRendererTurbo(this, 233, 71, textureX, textureY); // Box 490
		lococ41Model[483] = new ModelRendererTurbo(this, 238, 70, textureX, textureY); // Box 491
		lococ41Model[484] = new ModelRendererTurbo(this, 121, 19, textureX, textureY); // Box 492
		lococ41Model[485] = new ModelRendererTurbo(this, 121, 19, textureX, textureY); // Box 493
		lococ41Model[486] = new ModelRendererTurbo(this, 121, 19, textureX, textureY); // Box 494
		lococ41Model[487] = new ModelRendererTurbo(this, 121, 19, textureX, textureY); // Box 495
		lococ41Model[488] = new ModelRendererTurbo(this, 121, 19, textureX, textureY); // Box 496
		lococ41Model[489] = new ModelRendererTurbo(this, 38, 5, textureX, textureY); // Box 497
		lococ41Model[490] = new ModelRendererTurbo(this, 233, 71, textureX, textureY); // Box 495
		lococ41Model[491] = new ModelRendererTurbo(this, 483, 43, textureX, textureY); // Box 496
		lococ41Model[492] = new ModelRendererTurbo(this, 304, 72, textureX, textureY); // Box 497
		lococ41Model[493] = new ModelRendererTurbo(this, 304, 72, textureX, textureY); // Box 498
		lococ41Model[494] = new ModelRendererTurbo(this, 309, 84, textureX, textureY); // Box 499
		lococ41Model[495] = new ModelRendererTurbo(this, 304, 72, textureX, textureY); // Box 500
		lococ41Model[496] = new ModelRendererTurbo(this, 304, 72, textureX, textureY); // Box 501
		lococ41Model[497] = new ModelRendererTurbo(this, 483, 43, textureX, textureY); // Box 502

		lococ41Model[0].addBox(0F, 0F, 0F, 11, 11, 0, 0F); // Box 6
		lococ41Model[0].setRotationPoint(-20F, -1F, -5.01F);

		lococ41Model[1].addBox(1F, 0F, 0F, 6, 6, 0, 0F); // Box 10
		lococ41Model[1].setRotationPoint(-71F, 4F, -5.01F);

		lococ41Model[2].addBox(0F, 0F, 0F, 6, 6, 0, 0F); // Box 11
		lococ41Model[2].setRotationPoint(-70F, 4F, 5.01F);

		lococ41Model[3].addBox(0F, 0F, 0F, 1, 21, 14, 0F); // Box 25
		lococ41Model[3].setRotationPoint(-10F, -22F, -7F);

		lococ41Model[4].addBox(0F, 0F, 0F, 1, 19, 1, 0F); // Box 26
		lococ41Model[4].setRotationPoint(-10F, -20F, -10F);

		lococ41Model[5].addBox(0F, 0F, 0F, 1, 19, 1, 0F); // Box 22
		lococ41Model[5].setRotationPoint(-10F, -20F, 9F);

		lococ41Model[6].addBox(0F, 0F, 0F, 1, 10, 2, 0F); // Box 23
		lococ41Model[6].setRotationPoint(-10F, -11F, 7F);

		lococ41Model[7].addBox(0F, 0F, 0F, 1, 10, 2, 0F); // Box 24
		lococ41Model[7].setRotationPoint(-10F, -11F, -9F);

		lococ41Model[8].addBox(0F, 0F, 0F, 1, 3, 2, 0F); // Box 25
		lococ41Model[8].setRotationPoint(-10F, -21F, 7F);

		lococ41Model[9].addBox(0F, 0F, 0F, 1, 3, 2, 0F); // Box 26
		lococ41Model[9].setRotationPoint(-10F, -21F, -9F);

		lococ41Model[10].addShapeBox(0F, 0F, 0F, 16, 1, 20, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
		lococ41Model[10].setRotationPoint(-9F, -2F, -10F);

		lococ41Model[11].addShapeBox(0F, 0F, 0F, 15, 9, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 28
		lococ41Model[11].setRotationPoint(-9F, -11F, -10F);

		lococ41Model[12].addShapeBox(0F, 0F, 0F, 15, 9, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 29
		lococ41Model[12].setRotationPoint(-9F, -11F, 9F);

		lococ41Model[13].addBox(0F, 0F, 0F, 16, 2, 1, 0F); // Box 30
		lococ41Model[13].setRotationPoint(-9F, -20F, -10F);

		lococ41Model[14].addBox(0F, 0F, 0F, 16, 2, 1, 0F); // Box 31
		lococ41Model[14].setRotationPoint(-9F, -20F, 9F);

		lococ41Model[15].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 32
		lococ41Model[15].setRotationPoint(5F, -18F, 9F);

		lococ41Model[16].addBox(0F, 0F, 0F, 2, 7, 1, 0F); // Box 33
		lococ41Model[16].setRotationPoint(3F, -18F, 9F);

		lococ41Model[17].addBox(0F, 0F, 0F, 2, 7, 1, 0F); // Box 34
		lococ41Model[17].setRotationPoint(-9F, -18F, 9F);

		lococ41Model[18].addBox(0F, 0F, 0F, 1, 7, 1, 0F); // Box 35
		lococ41Model[18].setRotationPoint(-2F, -18F, 9F);

		lococ41Model[19].addBox(0F, 0F, 0F, 2, 7, 1, 0F); // Box 36
		lococ41Model[19].setRotationPoint(-9F, -18F, -10F);

		lococ41Model[20].addBox(0F, 0F, 0F, 1, 7, 1, 0F); // Box 37
		lococ41Model[20].setRotationPoint(-2F, -18F, -10F);

		lococ41Model[21].addBox(0F, 0F, 0F, 2, 7, 1, 0F); // Box 38
		lococ41Model[21].setRotationPoint(3F, -18F, -10F);

		lococ41Model[22].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39
		lococ41Model[22].setRotationPoint(5F, -18F, -10F);

		lococ41Model[23].addBox(0F, -1F, 0F, 16, 1, 5, 0F); // Box 45
		lococ41Model[23].setRotationPoint(-26F, -1F, 5F);

		lococ41Model[24].addBox(0F, -1F, -6F, 12, 1, 5, 0F); // Box 46
		lococ41Model[24].setRotationPoint(-22F, -1F, -4F);

		lococ41Model[25].addBox(0F, -1F, 0F, 24, 1, 5, 0F); // Box 47
		lococ41Model[25].setRotationPoint(-51F, -4F, 5F);

		lococ41Model[26].addBox(0F, -1F, 0F, 16, 1, 5, 0F); // Box 48
		lococ41Model[26].setRotationPoint(-52F, -4F, -10F);

		lococ41Model[27].addBox(0F, -1F, 0F, 12, 1, 5, 0F); // Box 49
		lococ41Model[27].setRotationPoint(-64F, -1F, -10F);

		lococ41Model[28].addBox(0F, -1F, 0F, 12, 1, 5, 0F); // Box 50
		lococ41Model[28].setRotationPoint(-64F, -1F, 5F);

		lococ41Model[29].addShapeBox(0F, -1F, 0F, 1, 3, 5, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 52
		lococ41Model[29].setRotationPoint(-65F, 0F, -10F);

		lococ41Model[30].addShapeBox(0F, -1F, 0F, 1, 3, 5, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 53
		lococ41Model[30].setRotationPoint(-65F, 0F, 5F);

		lococ41Model[31].addBox(0F, -1F, 0F, 9, 1, 16, 0F); // Box 54
		lococ41Model[31].setRotationPoint(-72F, 4F, -8F);

		lococ41Model[32].addBox(0F, -1F, 0F, 2, 1, 5, 0F); // Box 55
		lococ41Model[32].setRotationPoint(-66F, 3F, -10F);

		lococ41Model[33].addBox(0F, -1F, 0F, 2, 1, 5, 0F); // Box 56
		lococ41Model[33].setRotationPoint(-66F, 3F, 5F);

		lococ41Model[34].addBox(0F, -1F, 0F, 22, 2, 2, 0F); // Box 59
		lococ41Model[34].setRotationPoint(-50F, -3F, 7F);

		lococ41Model[35].addBox(0F, 0F, 0F, 2, 4, 1, 0F); // Box 60
		lococ41Model[35].setRotationPoint(-49F, -20F, -3F);

		lococ41Model[36].addBox(0F, 0F, 0F, 53, 2, 8, 0F); // Box 62
		lococ41Model[36].setRotationPoint(-62F, 2F, -4F);

		lococ41Model[37].addBox(0F, -1F, 0F, 1, 6, 1, 0F); // Box 63
		lococ41Model[37].setRotationPoint(-73F, 4F, -8F);

		lococ41Model[38].addBox(0F, -1F, 0F, 1, 6, 1, 0F); // Box 64
		lococ41Model[38].setRotationPoint(-73F, 4F, 7F);

		lococ41Model[39].addBox(0F, -1F, 0F, 1, 12, 0, 0F); // Box 65
		lococ41Model[39].setRotationPoint(-62F, -5F, -6F);
		lococ41Model[39].rotateAngleY = 3.14159265F;
		lococ41Model[39].rotateAngleZ = 0.61086524F;

		lococ41Model[40].addBox(0F, -1F, 0F, 1, 12, 0, 0F); // Box 66
		lococ41Model[40].setRotationPoint(-62F, -5F, 6F);
		lococ41Model[40].rotateAngleY = 3.14159265F;
		lococ41Model[40].rotateAngleZ = 0.61086524F;

		lococ41Model[41].addBox(0F, 0F, 0F, 21, 9, 1, 0F); // Box 71
		lococ41Model[41].setRotationPoint(10F, -22.65F, -4.63F);
		lococ41Model[41].rotateAngleX = -1.57079633F;
		lococ41Model[41].rotateAngleY = -3.14159265F;

		lococ41Model[42].addBox(0F, 0F, 0F, 13, 5, 14, 0F); // Box 74
		lococ41Model[42].setRotationPoint(-9F, -1F, -7F);
		lococ41Model[42].rotateAngleZ = 0.05235988F;

		lococ41Model[43].addBox(0F, -1F, 0F, 37, 1, 1, 0F); // Box 85
		lococ41Model[43].setRotationPoint(-49F, 7F, -6F);

		lococ41Model[44].addBox(0F, -1F, 0F, 5, 1, 1, 0F); // Box 86
		lococ41Model[44].setRotationPoint(-54F, 5F, -7F);

		lococ41Model[45].addBox(0F, -1F, 0F, 23, 1, 1, 0F); // Box 87
		lococ41Model[45].setRotationPoint(-48F, 4.84F, -7F);
		lococ41Model[45].rotateAngleZ = -0.09075712F;

		lococ41Model[46].addBox(0F, -1F, 0F, 7, 1, 1, 0F); // Box 88
		lococ41Model[46].setRotationPoint(-54F, 6.4F, -8F);

		lococ41Model[47].addBox(0F, -1F, 0F, 7, 1, 1, 0F); // Box 89
		lococ41Model[47].setRotationPoint(-54F, 3.4F, -8F);

		lococ41Model[48].addBox(0F, -1F, 0F, 1, 3, 1, 0F); // Box 90
		lococ41Model[48].setRotationPoint(-49F, 4F, -7F);

		lococ41Model[49].addBox(0F, -1F, 0F, 7, 1, 1, 0F); // Box 91
		lococ41Model[49].setRotationPoint(-54F, 3.4F, 7F);

		lococ41Model[50].addBox(0F, -1F, 0F, 7, 1, 1, 0F); // Box 92
		lococ41Model[50].setRotationPoint(-54F, 6.4F, 7F);

		lococ41Model[51].addBox(0F, 0F, 0F, 37, 1, 1, 0F); // Box 93
		lococ41Model[51].setRotationPoint(-53F, 2F, 5F);

		lococ41Model[52].addBox(0F, -1F, 0F, 23, 1, 1, 0F); // Box 94
		lococ41Model[52].setRotationPoint(-52F, 4.84F, 6F);
		lococ41Model[52].rotateAngleZ = 0.07853982F;

		lococ41Model[53].addBox(0F, -1F, 0F, 6, 1, 1, 0F); // Box 95
		lococ41Model[53].setRotationPoint(-59F, 5F, 6F);

		lococ41Model[54].addBox(0F, -1F, 0F, 1, 3, 1, 0F); // Box 96
		lococ41Model[54].setRotationPoint(-53F, 4F, 6F);

		lococ41Model[55].addBox(0F, -1F, 0F, 1, 5, 6, 0F); // Box 97
		lococ41Model[55].setRotationPoint(-72F, 5F, -8F);

		lococ41Model[56].addBox(-1F, -1F, 0F, 1, 1, 5, 0F); // Box 99
		lococ41Model[56].setRotationPoint(-72F, 9F, 2F);

		lococ41Model[57].addBox(0F, -1F, 0F, 1, 5, 6, 0F); // Box 100
		lococ41Model[57].setRotationPoint(-72F, 5F, 2F);

		lococ41Model[58].addBox(-1F, -1F, 0F, 1, 1, 4, 0F); // Box 102
		lococ41Model[58].setRotationPoint(-71F, 5F, -2F);

		lococ41Model[59].addBox(-1F, -1F, 0F, 4, 1, 2, 0F); // Box 104
		lococ41Model[59].setRotationPoint(-74F, 6F, -1F);

		lococ41Model[60].addBox(0F, 0F, 0F, 2, 2, 4, 0F); // Box 105
		lococ41Model[60].setRotationPoint(-14F, -19F, -2F);

		lococ41Model[61].addBox(0F, 0F, 0F, 0, 1, 1, 0F); // Box 106
		lococ41Model[61].setRotationPoint(-14F, -17F, -2F);

		lococ41Model[62].addBox(0F, 0F, 0F, 0, 1, 1, 0F); // Box 107
		lococ41Model[62].setRotationPoint(-14F, -17F, 1F);

		lococ41Model[63].addBox(0F, 0F, 0F, 0, 1, 1, 0F); // Box 108
		lococ41Model[63].setRotationPoint(-12F, -17F, 1F);

		lococ41Model[64].addBox(0F, 0F, 0F, 0, 1, 1, 0F); // Box 109
		lococ41Model[64].setRotationPoint(-12F, -17F, -2F);

		lococ41Model[65].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 110
		lococ41Model[65].setRotationPoint(-14F, -21F, -2F);

		lococ41Model[66].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 111
		lococ41Model[66].setRotationPoint(-19F, -18F, -1F);

		lococ41Model[67].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 114
		lococ41Model[67].setRotationPoint(-37F, -19F, -0.5F);

		lococ41Model[68].addBox(0F, -1F, 0F, 1, 5, 1, 0F); // Box 118
		lococ41Model[68].setRotationPoint(-48F, -1.6F, 7F);

		lococ41Model[69].addBox(0F, -1F, 0F, 1, 5, 1, 0F); // Box 119
		lococ41Model[69].setRotationPoint(-48F, -1.6F, -8F);

		lococ41Model[70].addBox(0F, -1F, 0F, 1, 1, 14, 0F); // Box 120
		lococ41Model[70].setRotationPoint(-48F, -1.6F, -7F);

		lococ41Model[71].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 127
		lococ41Model[71].setRotationPoint(-64.01F, -14.45F, -7.45F);

		lococ41Model[72].addBox(0F, 0F, 0F, 11, 5, 13, 0F); // Box 132
		lococ41Model[72].setRotationPoint(-21F, -7F, -6.5F);

		lococ41Model[73].addBox(0F, -1F, 0F, 14, 2, 2, 0F); // Box 133
		lococ41Model[73].setRotationPoint(-51F, -3F, -9F);

		lococ41Model[74].addBox(0F, 0F, 0F, 12, 4, 8, 0F); // Box 132
		lococ41Model[74].setRotationPoint(-21F, -2F, -4F);

		lococ41Model[75].addBox(0F, 0F, 0F, 8, 6, 8, 0F); // Box 133
		lococ41Model[75].setRotationPoint(-62F, -4F, -4F);

		lococ41Model[76].addBox(0F, -1F, 0F, 8, 2, 2, 0F); // Box 135
		lococ41Model[76].setRotationPoint(-25F, 0F, 7F);

		lococ41Model[77].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 131
		lococ41Model[77].setRotationPoint(-13.4F, -21.83F, -2F);
		lococ41Model[77].rotateAngleZ = -0.62831853F;

		lococ41Model[78].addShapeBox(0F, 0F, 0F, 55, 2, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 1.5F, 0F, 0.5F, 1.5F, 0F, 0.5F, 1.5F, 0F, 0.5F, 1.5F); // Box 196
		lococ41Model[78].setRotationPoint(-65F, -15F, -5F);

		lococ41Model[79].addShapeBox(0F, 0F, 0F, 55, 2, 14, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 199
		lococ41Model[79].setRotationPoint(-65F, -12.5F, -7F);

		lococ41Model[80].addShapeBox(0F, 0F, 0F, 55, 2, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 197
		lococ41Model[80].setRotationPoint(-65F, -8.5F, -7F);

		lococ41Model[81].addShapeBox(0F, 0F, 0F, 55, 2, 10, 0F, 0F, 0.5F, 1.5F, 0F, 0.5F, 1.5F, 0F, 0.5F, 1.5F, 0F, 0.5F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 196
		lococ41Model[81].setRotationPoint(-65F, -6F, -5F);

		lococ41Model[82].addShapeBox(0F, -1F, 0F, 55, 2, 6, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 198
		lococ41Model[82].setRotationPoint(-65F, -3F, -3F);

		lococ41Model[83].addShapeBox(0F, 0F, 0F, 55, 2, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -2.5F, 0F, -1.5F, -2.5F, 0F, -1.5F, -2.5F, 0F, -1.5F, -2.5F); // Box 200
		lococ41Model[83].setRotationPoint(-65F, -3F, -3F);

		lococ41Model[84].addShapeBox(0F, 0F, 0F, 55, 2, 6, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 197
		lococ41Model[84].setRotationPoint(-65F, -17F, -3F);

		lococ41Model[85].addShapeBox(0F, 0F, 0F, 55, 2, 6, 0F, 0F, -1.5F, -2.5F, 0F, -1.5F, -2.5F, 0F, -1.5F, -2.5F, 0F, -1.5F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 198
		lococ41Model[85].setRotationPoint(-65F, -18F, -3F);

		lococ41Model[86].addShapeBox(0F, 0F, 0F, 55, 2, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 191
		lococ41Model[86].setRotationPoint(-65F, -10.5F, -7F);

		lococ41Model[87].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 194
		lococ41Model[87].setRotationPoint(-18.5F, -17.8F, -2.5F);

		lococ41Model[88].addBox(0F, 0F, 0F, 2, 4, 1, 0F); // Box 195
		lococ41Model[88].setRotationPoint(-49F, -20F, 2F);

		lococ41Model[89].addBox(0F, 0F, 0F, 1, 4, 2, 0F); // Box 196
		lococ41Model[89].setRotationPoint(-46F, -20F, -1F);

		lococ41Model[90].addBox(0F, 0F, 0F, 1, 4, 2, 0F); // Box 197
		lococ41Model[90].setRotationPoint(-51F, -20F, -1F);

		lococ41Model[91].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 1F); // Box 198
		lococ41Model[91].setRotationPoint(-51F, -20F, -3F);

		lococ41Model[92].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 199
		lococ41Model[92].setRotationPoint(-49F, -21F, -3F);

		lococ41Model[93].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -1F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 1F); // Box 200
		lococ41Model[93].setRotationPoint(-51F, -21F, -3F);

		lococ41Model[94].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F, 1F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 201
		lococ41Model[94].setRotationPoint(-46F, -20F, -3F);

		lococ41Model[95].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 1F, 0F, -1F, -2F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 202
		lococ41Model[95].setRotationPoint(-46F, -21F, -3F);

		lococ41Model[96].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 203
		lococ41Model[96].setRotationPoint(-51F, -21F, -1F);

		lococ41Model[97].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 204
		lococ41Model[97].setRotationPoint(-51F, -20F, 2F);

		lococ41Model[98].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -2F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 205
		lococ41Model[98].setRotationPoint(-51F, -21F, 2F);

		lococ41Model[99].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 206
		lococ41Model[99].setRotationPoint(-49F, -21F, 2F);

		lococ41Model[100].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 207
		lococ41Model[100].setRotationPoint(-46F, -21F, -1F);

		lococ41Model[101].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, -1F); // Box 208
		lococ41Model[101].setRotationPoint(-46F, -20F, 1F);

		lococ41Model[102].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, -1F, 1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, -1F); // Box 209
		lococ41Model[102].setRotationPoint(-46F, -21F, 1F);

		lococ41Model[103].addBox(0F, 0F, 0F, 2, 4, 1, 0F); // Box 212
		lococ41Model[103].setRotationPoint(-25F, -20F, -3F);

		lococ41Model[104].addBox(0F, 0F, 0F, 1, 4, 2, 0F); // Box 213
		lococ41Model[104].setRotationPoint(-27F, -20F, -1F);

		lococ41Model[105].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 1F); // Box 214
		lococ41Model[105].setRotationPoint(-27F, -20F, -3F);

		lococ41Model[106].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 215
		lococ41Model[106].setRotationPoint(-27F, -20F, 2F);

		lococ41Model[107].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, -1F); // Box 216
		lococ41Model[107].setRotationPoint(-22F, -20F, 1F);

		lococ41Model[108].addBox(0F, 0F, 0F, 2, 4, 1, 0F); // Box 217
		lococ41Model[108].setRotationPoint(-25F, -20F, 2F);

		lococ41Model[109].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F, 1F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 218
		lococ41Model[109].setRotationPoint(-22F, -20F, -3F);

		lococ41Model[110].addBox(0F, 0F, 0F, 1, 4, 2, 0F); // Box 219
		lococ41Model[110].setRotationPoint(-22F, -20F, -1F);

		lococ41Model[111].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 1F, 0F, -1F, -2F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 220
		lococ41Model[111].setRotationPoint(-22F, -21F, -3F);

		lococ41Model[112].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 221
		lococ41Model[112].setRotationPoint(-25F, -21F, -3F);

		lococ41Model[113].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -1F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 1F); // Box 222
		lococ41Model[113].setRotationPoint(-27F, -21F, -3F);

		lococ41Model[114].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 223
		lococ41Model[114].setRotationPoint(-27F, -21F, -1F);

		lococ41Model[115].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -2F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 224
		lococ41Model[115].setRotationPoint(-27F, -21F, 2F);

		lococ41Model[116].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 225
		lococ41Model[116].setRotationPoint(-25F, -21F, 2F);

		lococ41Model[117].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, -1F, 1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, -1F); // Box 226
		lococ41Model[117].setRotationPoint(-22F, -21F, 1F);

		lococ41Model[118].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 227
		lococ41Model[118].setRotationPoint(-22F, -21F, -1F);

		lococ41Model[119].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 228
		lococ41Model[119].setRotationPoint(-50F, -21F, -1F);

		lococ41Model[120].addBox(0F, 0F, 0F, 2, 1, 4, 0F); // Box 229
		lococ41Model[120].setRotationPoint(-49F, -21F, -2F);

		lococ41Model[121].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 230
		lococ41Model[121].setRotationPoint(-47F, -21F, -1F);

		lococ41Model[122].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 231
		lococ41Model[122].setRotationPoint(-26F, -21F, -1F);

		lococ41Model[123].addBox(0F, 0F, 0F, 2, 1, 4, 0F); // Box 232
		lococ41Model[123].setRotationPoint(-25F, -21F, -2F);

		lococ41Model[124].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 233
		lococ41Model[124].setRotationPoint(-23F, -21F, -1F);

		lococ41Model[125].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 235
		lococ41Model[125].setRotationPoint(-36F, -19F, 0.5F);

		lococ41Model[126].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 236
		lococ41Model[126].setRotationPoint(-36F, -19F, -1.5F);

		lococ41Model[127].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 237
		lococ41Model[127].setRotationPoint(-35F, -19F, -0.5F);

		lococ41Model[128].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 238
		lococ41Model[128].setRotationPoint(-37F, -20F, -0.5F);

		lococ41Model[129].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 239
		lococ41Model[129].setRotationPoint(-35F, -20F, -0.5F);

		lococ41Model[130].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 240
		lococ41Model[130].setRotationPoint(-36F, -20F, -1.5F);

		lococ41Model[131].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 241
		lococ41Model[131].setRotationPoint(-37F, -19F, -1.5F);

		lococ41Model[132].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 242
		lococ41Model[132].setRotationPoint(-37F, -20F, -1.5F);

		lococ41Model[133].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 243
		lococ41Model[133].setRotationPoint(-35F, -20F, -1.5F);

		lococ41Model[134].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 244
		lococ41Model[134].setRotationPoint(-35F, -19F, -1.5F);

		lococ41Model[135].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 245
		lococ41Model[135].setRotationPoint(-35F, -19F, 0.5F);

		lococ41Model[136].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 246
		lococ41Model[136].setRotationPoint(-37F, -19F, 0.5F);

		lococ41Model[137].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 247
		lococ41Model[137].setRotationPoint(-35F, -20F, 0.5F);

		lococ41Model[138].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 248
		lococ41Model[138].setRotationPoint(-37F, -20F, 0.5F);

		lococ41Model[139].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 249
		lococ41Model[139].setRotationPoint(-36F, -20F, 0.5F);

		lococ41Model[140].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 250
		lococ41Model[140].setRotationPoint(-37.5F, -18F, -1F);

		lococ41Model[141].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 252
		lococ41Model[141].setRotationPoint(-37.5F, -18F, -2F);

		lococ41Model[142].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 253
		lococ41Model[142].setRotationPoint(-37.5F, -18F, 1F);

		lococ41Model[143].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 254
		lococ41Model[143].setRotationPoint(-34.5F, -18F, 1F);

		lococ41Model[144].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 256
		lococ41Model[144].setRotationPoint(-34.5F, -18F, -1F);

		lococ41Model[145].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 257
		lococ41Model[145].setRotationPoint(-34.5F, -18F, -2F);

		lococ41Model[146].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 258
		lococ41Model[146].setRotationPoint(-36.5F, -18F, -1F);
		lococ41Model[146].rotateAngleY = -1.57079633F;

		lococ41Model[147].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 259
		lococ41Model[147].setRotationPoint(-36.5F, -18F, 2F);
		lococ41Model[147].rotateAngleY = -1.57079633F;

		lococ41Model[148].addShapeBox(0F, 0F, 0F, 14, 1, 1, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 250
		lococ41Model[148].setRotationPoint(-51F, -4.5F, -10.4F);

		lococ41Model[149].addShapeBox(0F, 0F, 0F, 14, 1, 1, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 251
		lococ41Model[149].setRotationPoint(-51F, -3.5F, -10.4F);

		lococ41Model[150].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 252
		lococ41Model[150].setRotationPoint(-52F, -4F, -10.4F);

		lococ41Model[151].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 254
		lococ41Model[151].setRotationPoint(-52F, -4F, -9.9F);

		lococ41Model[152].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, -0.5F, -0.5F, -1F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 256
		lococ41Model[152].setRotationPoint(-38F, -4F, -10.4F);

		lococ41Model[153].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 257
		lococ41Model[153].setRotationPoint(-37F, -4F, -9.9F);

		lococ41Model[154].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 261
		lococ41Model[154].setRotationPoint(-51.5F, -17F, -1.5F);

		lococ41Model[155].addShapeBox(-0.5F, 0F, 0F, 2, 2, 1, 0F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 263
		lococ41Model[155].setRotationPoint(-51F, -17F, 2.5F);

		lococ41Model[156].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 264
		lococ41Model[156].setRotationPoint(-45.5F, -17F, -1.5F);

		lococ41Model[157].addBox(0F, 0F, 0F, 3, 2, 1, 0F); // Box 265
		lococ41Model[157].setRotationPoint(-49.5F, -17F, 2.5F);

		lococ41Model[158].addBox(0F, 0F, 0F, 3, 2, 1, 0F); // Box 266
		lococ41Model[158].setRotationPoint(-49.5F, -17F, -3.5F);

		lococ41Model[159].addShapeBox(-0.5F, 0F, 0F, 2, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -1F, 0F, 1F, 0F, 0F, 0F); // Box 267
		lococ41Model[159].setRotationPoint(-46F, -17F, -3.5F);

		lococ41Model[160].addShapeBox(-0.5F, 0F, 0F, 2, 2, 1, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 1F); // Box 268
		lococ41Model[160].setRotationPoint(-51F, -17F, -3.5F);

		lococ41Model[161].addShapeBox(-0.5F, 0F, 0F, 2, 2, 1, 0F, 0F, 0F, 0F, -1F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 269
		lococ41Model[161].setRotationPoint(-46F, -17F, 2.5F);

		lococ41Model[162].addBox(0F, 0F, 0F, 3, 2, 1, 0F); // Box 270
		lococ41Model[162].setRotationPoint(-25.5F, -17F, -3.5F);

		lococ41Model[163].addShapeBox(-0.5F, 0F, 0F, 2, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -1F, 0F, 1F, 0F, 0F, 0F); // Box 271
		lococ41Model[163].setRotationPoint(-22F, -17F, -3.5F);

		lococ41Model[164].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 272
		lococ41Model[164].setRotationPoint(-21.5F, -17F, -1.5F);

		lococ41Model[165].addShapeBox(-0.5F, 0F, 0F, 2, 2, 1, 0F, 0F, 0F, 0F, -1F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 273
		lococ41Model[165].setRotationPoint(-22F, -17F, 2.5F);

		lococ41Model[166].addBox(0F, 0F, 0F, 3, 2, 1, 0F); // Box 274
		lococ41Model[166].setRotationPoint(-25.5F, -17F, 2.5F);

		lococ41Model[167].addShapeBox(-0.5F, 0F, 0F, 2, 2, 1, 0F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 275
		lococ41Model[167].setRotationPoint(-27F, -17F, 2.5F);

		lococ41Model[168].addShapeBox(-0.5F, 0F, 0F, 2, 2, 1, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 1F); // Box 276
		lococ41Model[168].setRotationPoint(-27F, -17F, -3.5F);

		lococ41Model[169].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 277
		lococ41Model[169].setRotationPoint(-27.5F, -17F, -1.5F);

		lococ41Model[170].addBox(0F, 0F, 0F, 1, 7, 2, 0F); // Box 272
		lococ41Model[170].setRotationPoint(-61F, -23F, -1F);

		lococ41Model[171].addBox(0F, 0F, 0F, 1, 7, 2, 0F); // Box 273
		lococ41Model[171].setRotationPoint(-58F, -23F, -1F);

		lococ41Model[172].addBox(0F, 0F, 0F, 2, 7, 1, 0F); // Box 275
		lococ41Model[172].setRotationPoint(-60F, -23F, -2F);

		lococ41Model[173].addBox(0F, 0F, 0F, 2, 7, 1, 0F); // Box 276
		lococ41Model[173].setRotationPoint(-60F, -23F, 1F);

		lococ41Model[174].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 277
		lococ41Model[174].setRotationPoint(-61F, -23F, -2F);

		lococ41Model[175].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 278
		lococ41Model[175].setRotationPoint(-61F, -23F, 1F);

		lococ41Model[176].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 279
		lococ41Model[176].setRotationPoint(-58F, -23F, 1F);

		lococ41Model[177].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 280
		lococ41Model[177].setRotationPoint(-58F, -23F, -2F);

		lococ41Model[178].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 279
		lococ41Model[178].setRotationPoint(-50.5F, -7F, -7.9F);

		lococ41Model[179].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 280
		lococ41Model[179].setRotationPoint(-50.5F, -10.5F, -7.9F);

		lococ41Model[180].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, -0.1F, -1F, -0.5F, -0.1F, -1F, -0.5F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 281
		lococ41Model[180].setRotationPoint(-50.5F, -13F, -7.9F);

		lococ41Model[181].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, -0.1F, -2F, -0.5F, -0.1F, -2F, -0.5F, -0.5F, 1.5F, 0F, -0.5F, 1.5F, 0F, -0.4F, -0.5F, -0.5F, -0.4F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 282
		lococ41Model[181].setRotationPoint(-50.5F, -15.5F, -7.4F);

		lococ41Model[182].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, -2F, 0.5F, -0.5F, -2F, 0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 1.5F, 0F, -0.5F, 1.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 285
		lococ41Model[182].setRotationPoint(-50.5F, -17.38F, -4.9F);

		lococ41Model[183].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 286
		lococ41Model[183].setRotationPoint(-50.5F, -10.5F, 6.4F);

		lococ41Model[184].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, -0.5F, 0.5F, -0.5F, -0.5F, 0.5F, -0.5F, -0.1F, -1F, 0F, -0.1F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 287
		lococ41Model[184].setRotationPoint(-50.5F, -13F, 6.9F);

		lococ41Model[185].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, -0.5F, 1.5F, -0.5F, -0.5F, 1.5F, -0.5F, -0.1F, -2F, 0F, -0.1F, -2F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.4F, -0.5F, 0F, -0.4F, -0.5F); // Box 288
		lococ41Model[185].setRotationPoint(-50.5F, -15.5F, 6.4F);

		lococ41Model[186].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -2F, 0.5F, 0F, -2F, 0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 1.5F, 0F, 0F, 1.5F, 0F); // Box 290
		lococ41Model[186].setRotationPoint(-50.5F, -17.38F, 1.9F);

		lococ41Model[187].addShapeBox(0F, 0F, 0F, 15, 1, 1, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 292
		lococ41Model[187].setRotationPoint(-25F, -9.5F, -8.4F);

		lococ41Model[188].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 293
		lococ41Model[188].setRotationPoint(-25F, -9F, -8.4F);

		lococ41Model[189].addShapeBox(0F, 0F, 0F, 22, 1, 1, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 295
		lococ41Model[189].setRotationPoint(-36F, -10.5F, -8.4F);

		lococ41Model[190].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 296
		lococ41Model[190].setRotationPoint(-36F, -10F, -8.4F);

		lococ41Model[191].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 297
		lococ41Model[191].setRotationPoint(-37F, -4F, -8.4F);

		lococ41Model[192].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, -0.1F, -1.5F, -0.5F, -0.1F, -1.5F, -0.5F, -0.5F, 0.9F, 0F, -0.5F, 0.9F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 299
		lococ41Model[192].setRotationPoint(-14.5F, -13F, -8.37F);

		lococ41Model[193].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, -0.6F, -2F, -0.5F, -0.1F, -2F, -0.5F, -0.5F, 1.5F, 0F, -1F, 1.5F, 0F, -0.4F, -0.5F, -0.5F, -0.4F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 300
		lococ41Model[193].setRotationPoint(-14.5F, -15.5F, -7.4F);

		lococ41Model[194].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.9F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 301
		lococ41Model[194].setRotationPoint(-14F, -15.9F, -5.9F);

		lococ41Model[195].addShapeBox(0F, 0F, 0F, 22, 1, 1, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 303
		lococ41Model[195].setRotationPoint(-50F, -4.5F, 8.6F);

		lococ41Model[196].addShapeBox(0F, 0F, 0F, 22, 1, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 305
		lococ41Model[196].setRotationPoint(-50F, -3F, 8.6F);

		lococ41Model[197].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 308
		lococ41Model[197].setRotationPoint(-36F, -4F, -8.4F);

		lococ41Model[198].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 314
		lococ41Model[198].setRotationPoint(-29F, -6F, -9F);

		lococ41Model[199].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, -1F, -0.5F, -0.5F, -1F, -0.5F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 325
		lococ41Model[199].setRotationPoint(-28F, -7F, -8.5F);

		lococ41Model[200].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, -1F, -0.5F, -0.5F, -1F, -0.5F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 326
		lococ41Model[200].setRotationPoint(-29.5F, -7F, -8.5F);

		lococ41Model[201].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, -1F, -0.5F, -0.5F, -1F, -0.5F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 327
		lococ41Model[201].setRotationPoint(-28F, -7F, -10F);

		lococ41Model[202].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, -1F, -0.5F, -0.5F, -1F, -0.5F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 328
		lococ41Model[202].setRotationPoint(-29.5F, -7F, -10F);

		lococ41Model[203].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 329
		lococ41Model[203].setRotationPoint(-43.5F, -7F, -7.9F);

		lococ41Model[204].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 330
		lococ41Model[204].setRotationPoint(-43.75F, -7.5F, -7.9F);

		lococ41Model[205].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 332
		lococ41Model[205].setRotationPoint(-51F, -4F, 8.6F);

		lococ41Model[206].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 333
		lococ41Model[206].setRotationPoint(-50.5F, -7F, 6.4F);

		lococ41Model[207].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -1F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -1F); // Box 334
		lococ41Model[207].setRotationPoint(-51.5F, -4F, 7.1F);

		lococ41Model[208].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 335
		lococ41Model[208].setRotationPoint(-29F, -4F, 8.6F);

		lococ41Model[209].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 336
		lococ41Model[209].setRotationPoint(-43.5F, -7F, 6.6F);

		lococ41Model[210].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 337
		lococ41Model[210].setRotationPoint(-43.75F, -7.5F, 6.6F);

		lococ41Model[211].addShapeBox(0F, 0F, 0F, 31, 1, 1, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 327
		lococ41Model[211].setRotationPoint(-43.5F, -6F, 6.6F);

		lococ41Model[212].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 328
		lococ41Model[212].setRotationPoint(-28F, -4F, 6.1F);

		lococ41Model[213].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 329
		lococ41Model[213].setRotationPoint(-13F, -14.5F, 5.6F);

		lococ41Model[214].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, -0.5F, -0.5F, -0.5F, -1F, -0.5F, -0.5F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 333
		lococ41Model[214].setRotationPoint(-27.5F, -4F, 6.6F);

		lococ41Model[215].addShapeBox(0F, 2F, 0F, 4, 1, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 334
		lococ41Model[215].setRotationPoint(-27.5F, -2F, 6.6F);

		lococ41Model[216].addShapeBox(0F, 0F, 0F, 16, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 335
		lococ41Model[216].setRotationPoint(-17.5F, -0.5F, 7.6F);

		lococ41Model[217].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 336
		lococ41Model[217].setRotationPoint(-13F, -8.5F, 6.6F);

		lococ41Model[218].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 339
		lococ41Model[218].setRotationPoint(-13F, -13F, 7.1F);

		lococ41Model[219].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 340
		lococ41Model[219].setRotationPoint(-13F, -10.5F, 6.6F);

		lococ41Model[220].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 341
		lococ41Model[220].setRotationPoint(-13F, -14F, 5.6F);

		lococ41Model[221].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 342
		lococ41Model[221].setRotationPoint(-13F, -9F, 6.6F);

		lococ41Model[222].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, -0.5F, -0.5F, -0.5F, -1F, -0.5F, -0.5F, -1F, 0F, 0F, -0.5F, 0F, -1F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, -1F, 0F, 0F); // Box 343
		lococ41Model[222].setRotationPoint(-1.5F, -0.5F, 7.1F);

		lococ41Model[223].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, -0.5F, -0.5F, -0.5F, -1F, -0.5F, -0.5F, -1F, 0F, 0F, -0.5F, 0F, -1F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, -1F, 0F, 0F); // Box 344
		lococ41Model[223].setRotationPoint(-1.5F, -0.5F, -8.6F);

		lococ41Model[224].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 345
		lococ41Model[224].setRotationPoint(-6.5F, -0.5F, -8.1F);

		lococ41Model[225].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 346
		lococ41Model[225].setRotationPoint(-6.5F, -2F, -8.6F);

		lococ41Model[226].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 347
		lococ41Model[226].setRotationPoint(-61.5F, -17F, -2.5F);

		lococ41Model[227].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 348
		lococ41Model[227].setRotationPoint(-57.5F, -17F, 1.5F);

		lococ41Model[228].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 349
		lococ41Model[228].setRotationPoint(-57.5F, -17F, -2.5F);

		lococ41Model[229].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 350
		lococ41Model[229].setRotationPoint(-61.5F, -17F, 1.5F);

		lococ41Model[230].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 351
		lococ41Model[230].setRotationPoint(-60.5F, -17F, -2.5F);

		lococ41Model[231].addBox(0F, 0F, 0F, 3, 2, 1, 0F); // Box 352
		lococ41Model[231].setRotationPoint(-60.5F, -17F, 1.5F);

		lococ41Model[232].addBox(0F, 0F, 0F, 1, 2, 3, 0F); // Box 353
		lococ41Model[232].setRotationPoint(-61.5F, -17F, -1.5F);

		lococ41Model[233].addBox(0F, 0F, 0F, 1, 2, 3, 0F); // Box 354
		lococ41Model[233].setRotationPoint(-57.5F, -17F, -1.5F);

		lococ41Model[234].addBox(0F, 0F, 0F, 4, 4, 2, 0F); // Box 356
		lococ41Model[234].setRotationPoint(-69F, -20F, -1F);

		lococ41Model[235].addBox(0F, 0F, 0F, 4, 2, 1, 0F); // Box 357
		lococ41Model[235].setRotationPoint(-69F, -19F, -2F);

		lococ41Model[236].addBox(0F, 0F, 0F, 4, 2, 1, 0F); // Box 358
		lococ41Model[236].setRotationPoint(-69F, -19F, -2F);

		lococ41Model[237].addBox(0F, 0F, 0F, 4, 2, 1, 0F); // Box 359
		lococ41Model[237].setRotationPoint(-69F, -19F, 1F);

		lococ41Model[238].addBox(0F, 0F, 0F, 4, 2, 1, 0F); // Box 360
		lococ41Model[238].setRotationPoint(-69F, -19F, 1F);

		lococ41Model[239].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 361
		lococ41Model[239].setRotationPoint(-69F, -20F, -2F);

		lococ41Model[240].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 362
		lococ41Model[240].setRotationPoint(-69F, -20F, 1F);

		lococ41Model[241].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 363
		lococ41Model[241].setRotationPoint(-69F, -17F, 1F);

		lococ41Model[242].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 364
		lococ41Model[242].setRotationPoint(-69F, -17F, -2F);

		lococ41Model[243].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 365
		lococ41Model[243].setRotationPoint(-60F, -23F, -1F);

		lococ41Model[244].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 366
		lococ41Model[244].setRotationPoint(-51F, -4F, 6.6F);

		lococ41Model[245].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 367
		lococ41Model[245].setRotationPoint(-68F, -16.5F, -1.9F);

		lococ41Model[246].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 368
		lococ41Model[246].setRotationPoint(-68F, -16.5F, 0.4F);

		lococ41Model[247].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, -1F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 360
		lococ41Model[247].setRotationPoint(-70F, -20F, -1F);

		lococ41Model[248].addShapeBox(0F, 0F, 0F, 1, 10, 1, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 362
		lococ41Model[248].setRotationPoint(4.5F, -13.5F, 9.5F);

		lococ41Model[249].addShapeBox(0F, 0F, 0F, 1, 10, 1, 0F, 0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 365
		lococ41Model[249].setRotationPoint(4.5F, -13.5F, -10.5F);

		lococ41Model[250].addBox(0F, -1F, 0F, 0, 3, 6, 0F); // Box 396
		lococ41Model[250].setRotationPoint(-65.02F, -11F, -3F);

		lococ41Model[251].addShapeBox(0F, -1F, 0F, 1, 1, 1, 0F, 0F, -0.2F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, -0.2F); // Box 405
		lococ41Model[251].setRotationPoint(-65.3F, -11F, -5F);

		lococ41Model[252].addShapeBox(0F, -1F, 0F, 1, 1, 1, 0F, 0F, -0.2F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, -0.2F); // Box 378
		lococ41Model[252].setRotationPoint(-65.3F, -7F, -5F);

		lococ41Model[253].addShapeBox(0F, -1F, 0F, 1, 1, 1, 0F, 0F, -0.2F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, -0.2F); // Box 379
		lococ41Model[253].setRotationPoint(-65.3F, -4F, -2.5F);

		lococ41Model[254].addShapeBox(0F, -1F, 0F, 1, 1, 1, 0F, 0F, -0.2F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, -0.2F); // Box 380
		lococ41Model[254].setRotationPoint(-65.3F, -4F, 1.5F);

		lococ41Model[255].addShapeBox(0F, -1F, 0F, 1, 1, 1, 0F, 0F, -0.2F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, -0.2F); // Box 381
		lococ41Model[255].setRotationPoint(-65.3F, -7F, 4F);

		lococ41Model[256].addShapeBox(0F, -1F, 0F, 1, 1, 1, 0F, 0F, -0.2F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, -0.2F); // Box 382
		lococ41Model[256].setRotationPoint(-65.3F, -11F, 4F);

		lococ41Model[257].addShapeBox(0F, -1F, 0F, 1, 1, 1, 0F, 0F, -0.2F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, -0.2F); // Box 383
		lococ41Model[257].setRotationPoint(-65.3F, -14F, 1.5F);

		lococ41Model[258].addShapeBox(0F, -1F, 0F, 1, 1, 1, 0F, 0F, -0.2F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, -0.2F); // Box 384
		lococ41Model[258].setRotationPoint(-65.3F, -14F, -2.5F);

		lococ41Model[259].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 396
		lococ41Model[259].setRotationPoint(-67F, -16.7F, -1.75F);

		lococ41Model[260].addBox(0F, -1F, 0F, 0, 9, 4, 0F); // Box 390
		lococ41Model[260].setRotationPoint(-65.01F, -13F, -2F);

		lococ41Model[261].addBox(0F, -1F, 0F, 0, 5, 2, 0F); // Box 391
		lococ41Model[261].setRotationPoint(-65.01F, -11F, 2F);

		lococ41Model[262].addBox(0F, -1F, 0F, 0, 5, 2, 0F); // Box 397
		lococ41Model[262].setRotationPoint(-65.01F, -11F, -4F);

		lococ41Model[263].addShapeBox(0F, -1F, 0F, 0, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 398
		lococ41Model[263].setRotationPoint(-65.01F, -13F, 2F);

		lococ41Model[264].addShapeBox(0F, -1F, 0F, 0, 2, 2, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 401
		lococ41Model[264].setRotationPoint(-65.01F, -13F, -4F);

		lococ41Model[265].addShapeBox(0F, -1F, 0F, 0, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 402
		lococ41Model[265].setRotationPoint(-65.01F, -6F, -4F);

		lococ41Model[266].addShapeBox(0F, -1F, 0F, 0, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 403
		lococ41Model[266].setRotationPoint(-65.01F, -6F, 2F);

		lococ41Model[267].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 404
		lococ41Model[267].setRotationPoint(-65.1F, -11F, -5.5F);

		lococ41Model[268].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 405
		lococ41Model[268].setRotationPoint(-65.1F, -9.5F, -5.5F);

		lococ41Model[269].addShapeBox(0F, -1F, 0F, 1, 1, 1, 0F, 0F, -0.2F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, -0.2F); // Box 406
		lococ41Model[269].setRotationPoint(-65.3F, -9F, 4.3F);

		lococ41Model[270].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.2F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, -0.2F); // Box 407
		lococ41Model[270].setRotationPoint(-65.3F, -6.1F, 3.1F);

		lococ41Model[271].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.2F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, -0.2F); // Box 408
		lococ41Model[271].setRotationPoint(-65.3F, -6.1F, -4.1F);

		lococ41Model[272].addShapeBox(0F, -1F, 0F, 1, 1, 1, 0F, 0F, -0.2F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, -0.2F); // Box 409
		lococ41Model[272].setRotationPoint(-65.3F, -3.5F, -0.5F);

		lococ41Model[273].addShapeBox(0F, -1F, 0F, 1, 1, 1, 0F, 0F, -0.2F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, -0.2F); // Box 411
		lococ41Model[273].setRotationPoint(-65.3F, -14.5F, -0.5F);

		lococ41Model[274].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.2F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, -0.2F); // Box 412
		lococ41Model[274].setRotationPoint(-65.3F, -14.1F, -4.1F);

		lococ41Model[275].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.2F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, -0.2F); // Box 413
		lococ41Model[275].setRotationPoint(-65.3F, -14.1F, 3.1F);

		lococ41Model[276].addBox(0F, 0F, 0F, 11, 11, 0, 0F); // Box 402
		lococ41Model[276].setRotationPoint(-32F, -1F, -5.01F);

		lococ41Model[277].addBox(0F, 0F, 0F, 11, 11, 0, 0F); // Box 403
		lococ41Model[277].setRotationPoint(-44F, -1F, -5.01F);

		lococ41Model[278].addBox(0F, 0F, 0F, 11, 11, 0, 0F); // Box 404
		lococ41Model[278].setRotationPoint(-56F, -1F, -5.01F);

		lococ41Model[279].addBox(0F, 0F, 0F, 11, 11, 0, 0F); // Box 405
		lococ41Model[279].setRotationPoint(-56F, -1F, 5.01F);

		lococ41Model[280].addBox(0F, 0F, 0F, 11, 11, 0, 0F); // Box 406
		lococ41Model[280].setRotationPoint(-44F, -1F, 5.01F);

		lococ41Model[281].addBox(0F, 0F, 0F, 11, 11, 0, 0F); // Box 407
		lococ41Model[281].setRotationPoint(-32F, -1F, 5.01F);

		lococ41Model[282].addBox(0F, 0F, 0F, 11, 11, 0, 0F); // Box 408
		lococ41Model[282].setRotationPoint(-20F, -1F, 5.01F);

		lococ41Model[283].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 331
		lococ41Model[283].setRotationPoint(-10F, -22F, -9F);

		lococ41Model[284].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 333
		lococ41Model[284].setRotationPoint(-10F, -21F, -10F);

		lococ41Model[285].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 334
		lococ41Model[285].setRotationPoint(-10F, -22F, 7F);

		lococ41Model[286].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 335
		lococ41Model[286].setRotationPoint(-10F, -21F, 9F);

		lococ41Model[287].addBox(0F, 0F, 0F, 1, 1, 10, 0F); // Box 330
		lococ41Model[287].setRotationPoint(-51F, 4F, -5F);

		lococ41Model[288].addBox(0F, 0F, 0F, 1, 1, 10, 0F); // Box 331
		lococ41Model[288].setRotationPoint(-39F, 4F, -5F);

		lococ41Model[289].addBox(0F, 0F, 0F, 1, 1, 10, 0F); // Box 332
		lococ41Model[289].setRotationPoint(-27F, 4F, -5F);

		lococ41Model[290].addBox(0F, 0F, 0F, 1, 1, 10, 0F); // Box 333
		lococ41Model[290].setRotationPoint(-15F, 4F, -5F);

		lococ41Model[291].addShapeBox(0F, 0F, 0F, 54, 1, 1, 0F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 334
		lococ41Model[291].setRotationPoint(-64F, -14.5F, -7.5F);

		lococ41Model[292].addShapeBox(0F, 0F, 0F, 1, 1, 14, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 335
		lococ41Model[292].setRotationPoint(-71.5F, 1F, -7F);

		lococ41Model[293].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 338
		lococ41Model[293].setRotationPoint(-71.5F, 1.5F, 6F);

		lococ41Model[294].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 339
		lococ41Model[294].setRotationPoint(-71.5F, 1.5F, -7.5F);

		lococ41Model[295].addShapeBox(0F, 0F, 0F, 1, 1, 13, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 340
		lococ41Model[295].setRotationPoint(-71.5F, 1.7F, -6.5F);

		lococ41Model[296].addBox(0F, 0F, 0F, 1, 1, 10, 0F); // Box 338
		lococ41Model[296].setRotationPoint(-67.5F, 6.5F, -5F);

		lococ41Model[297].addShapeBox(0F, 0F, 0F, 16, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 339
		lococ41Model[297].setRotationPoint(-9F, -21F, -10F);

		lococ41Model[298].addShapeBox(0F, 0F, 0F, 16, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 340
		lococ41Model[298].setRotationPoint(-9F, -21F, 9F);

		lococ41Model[299].addShapeBox(0F, 0F, 0F, 21, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.12F, -0.01F, 0F, -0.12F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F); // Box 341
		lococ41Model[299].setRotationPoint(10F, -22.65F, 4.37F);
		lococ41Model[299].rotateAngleX = -1.44862328F;
		lococ41Model[299].rotateAngleY = -3.14159265F;

		lococ41Model[300].addShapeBox(0F, 0F, 0F, 21, 3, 1, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.33F, -0.07F, 0F, -0.33F, -0.07F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F); // Box 343
		lococ41Model[300].setRotationPoint(10F, -22.29F, 7.34F);
		lococ41Model[300].rotateAngleX = -1.11701072F;
		lococ41Model[300].rotateAngleY = -3.14159265F;

		lococ41Model[301].addShapeBox(0F, 0F, 0F, 21, 3, 1, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.33F, -0.06F, 0F, -0.33F, -0.06F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F); // Box 345
		lococ41Model[301].setRotationPoint(10F, -20.98F, 10.03F);
		lococ41Model[301].rotateAngleX = -0.78539816F;
		lococ41Model[301].rotateAngleY = -3.14159265F;

		lococ41Model[302].addShapeBox(0F, 0F, 0F, 21, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.12F, -0.01F, 0F, -0.12F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F); // Box 341
		lococ41Model[302].setRotationPoint(-11F, -22.65F, -4.63F);
		lococ41Model[302].rotateAngleX = -1.44862328F;

		lococ41Model[303].addShapeBox(0F, 0F, 0F, 21, 3, 1, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.33F, -0.07F, 0F, -0.33F, -0.07F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F); // Box 342
		lococ41Model[303].setRotationPoint(-11F, -22.29F, -7.6F);
		lococ41Model[303].rotateAngleX = -1.11701072F;

		lococ41Model[304].addShapeBox(0F, 0F, 0F, 21, 3, 1, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.33F, -0.06F, 0F, -0.33F, -0.06F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F); // Box 343
		lococ41Model[304].setRotationPoint(-11F, -20.98F, -10.29F);
		lococ41Model[304].rotateAngleX = -0.78539816F;

		lococ41Model[305].addShapeBox(0F, 0F, 0F, 8, 2, 6, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 341
		lococ41Model[305].setRotationPoint(-68F, 5F, -3F);

		lococ41Model[306].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 342
		lococ41Model[306].setRotationPoint(-62F, 4F, -1F);

		lococ41Model[307].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 343
		lococ41Model[307].setRotationPoint(-51.51F, -14.45F, -7.45F);

		lococ41Model[308].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 344
		lococ41Model[308].setRotationPoint(-39.51F, -14.45F, -7.45F);

		lococ41Model[309].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 345
		lococ41Model[309].setRotationPoint(-27.51F, -14.45F, -7.45F);

		lococ41Model[310].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 346
		lococ41Model[310].setRotationPoint(-15.51F, -14.45F, -7.45F);

		lococ41Model[311].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, -0.6F, -0.5F, -0.7F, -0.6F, -0.5F, -0.7F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.1F, -0.5F, -0.7F, -0.1F, -0.5F, -0.7F, -0.1F, 0F, 0F, -0.1F, 0F); // Box 347
		lococ41Model[311].setRotationPoint(-63.93F, -14.45F, -7.4F);

		lococ41Model[312].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, -0.6F, -0.5F, -0.7F, -0.6F, -0.5F, -0.7F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.1F, -0.5F, -0.7F, -0.1F, -0.5F, -0.7F, -0.1F, 0F, 0F, -0.1F, 0F); // Box 348
		lococ41Model[312].setRotationPoint(-51.41F, -14.45F, -7.4F);

		lococ41Model[313].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, -0.6F, -0.5F, -0.7F, -0.6F, -0.5F, -0.7F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.1F, -0.5F, -0.7F, -0.1F, -0.5F, -0.7F, -0.1F, 0F, 0F, -0.1F, 0F); // Box 349
		lococ41Model[313].setRotationPoint(-39.41F, -14.45F, -7.4F);

		lococ41Model[314].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, -0.6F, -0.5F, -0.7F, -0.6F, -0.5F, -0.7F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.1F, -0.5F, -0.7F, -0.1F, -0.5F, -0.7F, -0.1F, 0F, 0F, -0.1F, 0F); // Box 350
		lococ41Model[314].setRotationPoint(-27.41F, -14.45F, -7.4F);

		lococ41Model[315].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, -0.6F, -0.5F, -0.7F, -0.6F, -0.5F, -0.7F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.1F, -0.5F, -0.7F, -0.1F, -0.5F, -0.7F, -0.1F, 0F, 0F, -0.1F, 0F); // Box 351
		lococ41Model[315].setRotationPoint(-15.41F, -14.45F, -7.4F);

		lococ41Model[316].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 352
		lococ41Model[316].setRotationPoint(-15.51F, -14.45F, 5.9F);

		lococ41Model[317].addShapeBox(0F, 0F, 0F, 54, 1, 1, 0F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 353
		lococ41Model[317].setRotationPoint(-64F, -14.5F, 5.85F);

		lococ41Model[318].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 354
		lococ41Model[318].setRotationPoint(-27.51F, -14.45F, 5.9F);

		lococ41Model[319].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 355
		lococ41Model[319].setRotationPoint(-39.51F, -14.45F, 5.9F);

		lococ41Model[320].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 356
		lococ41Model[320].setRotationPoint(-51.51F, -14.45F, 5.9F);

		lococ41Model[321].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 357
		lococ41Model[321].setRotationPoint(-64.01F, -14.45F, 5.9F);

		lococ41Model[322].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, -0.6F, -0.5F, -0.7F, -0.6F, -0.5F, -0.7F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.1F, -0.5F, -0.7F, -0.1F, -0.5F, -0.7F, -0.1F, 0F, 0F, -0.1F, 0F); // Box 358
		lococ41Model[322].setRotationPoint(-63.93F, -14.45F, 4.6F);

		lococ41Model[323].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, -0.6F, -0.5F, -0.7F, -0.6F, -0.5F, -0.7F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.1F, -0.5F, -0.7F, -0.1F, -0.5F, -0.7F, -0.1F, 0F, 0F, -0.1F, 0F); // Box 359
		lococ41Model[323].setRotationPoint(-51.41F, -14.45F, 4.6F);

		lococ41Model[324].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, -0.6F, -0.5F, -0.7F, -0.6F, -0.5F, -0.7F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.1F, -0.5F, -0.7F, -0.1F, -0.5F, -0.7F, -0.1F, 0F, 0F, -0.1F, 0F); // Box 360
		lococ41Model[324].setRotationPoint(-39.41F, -14.45F, 4.6F);

		lococ41Model[325].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, -0.6F, -0.5F, -0.7F, -0.6F, -0.5F, -0.7F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.1F, -0.5F, -0.7F, -0.1F, -0.5F, -0.7F, -0.1F, 0F, 0F, -0.1F, 0F); // Box 361
		lococ41Model[325].setRotationPoint(-27.41F, -14.45F, 4.6F);

		lococ41Model[326].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, -0.6F, -0.5F, -0.7F, -0.6F, -0.5F, -0.7F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.1F, -0.5F, -0.7F, -0.1F, -0.5F, -0.7F, -0.1F, 0F, 0F, -0.1F, 0F); // Box 362
		lococ41Model[326].setRotationPoint(-15.41F, -14.45F, 4.6F);

		lococ41Model[327].addShapeBox(-1F, -1F, 0F, 1, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 363
		lococ41Model[327].setRotationPoint(-70F, 5F, -1F);

		lococ41Model[328].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 367
		lococ41Model[328].setRotationPoint(-34F, -8F, -10F);

		lococ41Model[329].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 368
		lococ41Model[329].setRotationPoint(-33F, -8F, -10F);

		lococ41Model[330].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 369
		lococ41Model[330].setRotationPoint(-32F, -8F, -10F);

		lococ41Model[331].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 370
		lococ41Model[331].setRotationPoint(-34F, -8F, -9F);

		lococ41Model[332].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 371
		lococ41Model[332].setRotationPoint(-32F, -8F, -8F);

		lococ41Model[333].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 372
		lococ41Model[333].setRotationPoint(-33F, -8F, -8F);

		lococ41Model[334].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 373
		lococ41Model[334].setRotationPoint(-34F, -8F, -8F);

		lococ41Model[335].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 376
		lococ41Model[335].setRotationPoint(-34F, -4F, -10F);

		lococ41Model[336].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 377
		lococ41Model[336].setRotationPoint(-33F, -4F, -10F);

		lococ41Model[337].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 378
		lococ41Model[337].setRotationPoint(-32F, -4F, -10F);

		lococ41Model[338].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 379
		lococ41Model[338].setRotationPoint(-34F, -4F, -9F);

		lococ41Model[339].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 380
		lococ41Model[339].setRotationPoint(-33F, -4F, -8F);

		lococ41Model[340].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 381
		lococ41Model[340].setRotationPoint(-34F, -4F, -8F);

		lococ41Model[341].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 382
		lococ41Model[341].setRotationPoint(-32F, -4F, -8F);

		lococ41Model[342].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 383
		lococ41Model[342].setRotationPoint(-25F, -7F, -8F);

		lococ41Model[343].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 384
		lococ41Model[343].setRotationPoint(-26F, -7F, -8F);

		lococ41Model[344].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 385
		lococ41Model[344].setRotationPoint(-24F, -7F, -8F);

		lococ41Model[345].addBox(0F, 0F, 0F, 3, 2, 1, 0F); // Box 386
		lococ41Model[345].setRotationPoint(-26F, -7F, -9F);

		lococ41Model[346].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 387
		lococ41Model[346].setRotationPoint(-24F, -7F, -10F);

		lococ41Model[347].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 388
		lococ41Model[347].setRotationPoint(-25F, -7F, -10F);

		lococ41Model[348].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 389
		lococ41Model[348].setRotationPoint(-26F, -7F, -10F);

		lococ41Model[349].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, -1F, -0.5F, -0.5F, -1F, -0.5F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 390
		lococ41Model[349].setRotationPoint(-25.5F, -6F, -10F);

		lococ41Model[350].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, -1F, -0.5F, -0.5F, -1F, -0.5F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 391
		lococ41Model[350].setRotationPoint(-24F, -6F, -10F);

		lococ41Model[351].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 392
		lococ41Model[351].setRotationPoint(-25F, -5F, -9F);

		lococ41Model[352].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, -1F, -0.5F, -0.5F, -1F, -0.5F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 393
		lococ41Model[352].setRotationPoint(-25.5F, -6F, -8.5F);

		lococ41Model[353].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, -1F, -0.5F, -0.5F, -1F, -0.5F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 394
		lococ41Model[353].setRotationPoint(-24F, -6F, -8.5F);

		lococ41Model[354].addBox(0F, 0F, 0F, 3, 2, 1, 0F); // Box 395
		lococ41Model[354].setRotationPoint(-26F, -4F, -9F);

		lococ41Model[355].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 396
		lococ41Model[355].setRotationPoint(-25F, -4F, -10F);

		lococ41Model[356].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 397
		lococ41Model[356].setRotationPoint(-24F, -4F, -10F);

		lococ41Model[357].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 398
		lococ41Model[357].setRotationPoint(-26F, -4F, -10F);

		lococ41Model[358].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 399
		lococ41Model[358].setRotationPoint(-26F, -4F, -8F);

		lococ41Model[359].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 400
		lococ41Model[359].setRotationPoint(-25F, -4F, -8F);

		lococ41Model[360].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 401
		lococ41Model[360].setRotationPoint(-24F, -4F, -8F);

		lococ41Model[361].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 402
		lococ41Model[361].setRotationPoint(-29F, -4F, -10F);

		lococ41Model[362].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 403
		lococ41Model[362].setRotationPoint(-30F, -4F, -10F);

		lococ41Model[363].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 404
		lococ41Model[363].setRotationPoint(-29F, -4F, -9F);

		lococ41Model[364].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 405
		lococ41Model[364].setRotationPoint(-30F, -4F, -8F);

		lococ41Model[365].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 406
		lococ41Model[365].setRotationPoint(-29F, -4F, -8F);

		lococ41Model[366].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 407
		lococ41Model[366].setRotationPoint(-28F, -4F, -8F);

		lococ41Model[367].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 408
		lococ41Model[367].setRotationPoint(-28F, -4F, -10F);

		lococ41Model[368].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 409
		lococ41Model[368].setRotationPoint(-29F, -8F, -10F);

		lococ41Model[369].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 410
		lococ41Model[369].setRotationPoint(-30F, -8F, -10F);

		lococ41Model[370].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 411
		lococ41Model[370].setRotationPoint(-29F, -8F, -9F);

		lococ41Model[371].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 412
		lococ41Model[371].setRotationPoint(-30F, -8F, -8F);

		lococ41Model[372].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 413
		lococ41Model[372].setRotationPoint(-29F, -8F, -8F);

		lococ41Model[373].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 414
		lococ41Model[373].setRotationPoint(-28F, -8F, -8F);

		lococ41Model[374].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 415
		lococ41Model[374].setRotationPoint(-28F, -8F, -10F);

		lococ41Model[375].addShapeBox(0F, -1F, 0F, 1, 6, 1, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 1F); // Box 417
		lococ41Model[375].setRotationPoint(-61F, -4.5F, -5.8F);
		lococ41Model[375].rotateAngleX = -0.43633231F;

		lococ41Model[376].addBox(0F, -1F, 0F, 1, 6, 3, 0F); // Box 421
		lococ41Model[376].setRotationPoint(-60F, -4.5F, -5.8F);
		lococ41Model[376].rotateAngleX = -0.43633231F;

		lococ41Model[377].addShapeBox(0F, -1F, 0F, 1, 6, 1, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 2F); // Box 423
		lococ41Model[377].setRotationPoint(-59F, -4.5F, -5.8F);
		lococ41Model[377].rotateAngleX = -0.43633231F;

		lococ41Model[378].addBox(0F, -1F, 0F, 1, 6, 3, 0F); // Box 424
		lococ41Model[378].setRotationPoint(-59F, -4.5F, 5.8F);
		lococ41Model[378].rotateAngleX = -0.43633231F;
		lococ41Model[378].rotateAngleY = -3.14159265F;

		lococ41Model[379].addShapeBox(0F, -1F, 0F, 1, 6, 1, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 1F); // Box 425
		lococ41Model[379].setRotationPoint(-58F, -4.5F, 5.8F);
		lococ41Model[379].rotateAngleX = -0.43633231F;
		lococ41Model[379].rotateAngleY = -3.14159265F;

		lococ41Model[380].addShapeBox(0F, -1F, 0F, 1, 6, 1, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 2F); // Box 426
		lococ41Model[380].setRotationPoint(-60F, -4.5F, 5.8F);
		lococ41Model[380].rotateAngleX = -0.43633231F;
		lococ41Model[380].rotateAngleY = -3.14159265F;

		lococ41Model[381].addShapeBox(0F, 0F, 0F, 9, 5, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 1F, 0F, -4F, 1F, 0F, -4F, 1F, 0F, -4F, 1F); // Box 429
		lococ41Model[381].setRotationPoint(-63F, 2F, -8F);

		lococ41Model[382].addShapeBox(0F, 0F, 0F, 9, 5, 3, 0F, 0F, -4F, 1F, 0F, -4F, 1F, 0F, -4F, 1F, 0F, -4F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 431
		lococ41Model[382].setRotationPoint(-63F, 2F, -8F);

		lococ41Model[383].addBox(0F, 0F, 0F, 9, 3, 5, 0F); // Box 432
		lococ41Model[383].setRotationPoint(-63F, 3F, -9F);

		lococ41Model[384].addShapeBox(0F, 0F, 0F, 9, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 1F, 0F, -4F, 1F, 0F, -4F, 1F, 0F, -4F, 1F); // Box 433
		lococ41Model[384].setRotationPoint(-63F, -1F, -7F);

		lococ41Model[385].addShapeBox(0F, 0F, 0F, 9, 5, 1, 0F, 0F, -4F, 1F, 0F, -4F, 1F, 0F, -4F, 1F, 0F, -4F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 434
		lococ41Model[385].setRotationPoint(-63F, -3F, -7F);

		lococ41Model[386].addBox(0F, 0F, 0F, 9, 1, 3, 0F); // Box 435
		lococ41Model[386].setRotationPoint(-63F, 0F, -8F);

		lococ41Model[387].addShapeBox(0F, 0F, 0F, 9, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 1F, 0F, -4F, 1F, 0F, -4F, 1F, 0F, -4F, 1F); // Box 405
		lococ41Model[387].setRotationPoint(-63F, -1F, 6F);

		lococ41Model[388].addBox(0F, 0F, 0F, 9, 1, 3, 0F); // Box 406
		lococ41Model[388].setRotationPoint(-63F, 0F, 5F);

		lococ41Model[389].addShapeBox(0F, 0F, 0F, 9, 5, 1, 0F, 0F, -4F, 1F, 0F, -4F, 1F, 0F, -4F, 1F, 0F, -4F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 407
		lococ41Model[389].setRotationPoint(-63F, -3F, 6F);

		lococ41Model[390].addShapeBox(0F, 0F, 0F, 9, 5, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 1F, 0F, -4F, 1F, 0F, -4F, 1F, 0F, -4F, 1F); // Box 408
		lococ41Model[390].setRotationPoint(-63F, 2F, 5F);

		lococ41Model[391].addBox(0F, 0F, 0F, 9, 3, 5, 0F); // Box 409
		lococ41Model[391].setRotationPoint(-63F, 3F, 4F);

		lococ41Model[392].addShapeBox(0F, 0F, 0F, 9, 5, 3, 0F, 0F, -4F, 1F, 0F, -4F, 1F, 0F, -4F, 1F, 0F, -4F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 410
		lococ41Model[392].setRotationPoint(-63F, 2F, 5F);

		lococ41Model[393].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, -0.6F, -0.5F, -0.7F, -0.6F, -0.5F, -0.7F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.1F, -0.5F, -0.7F, -0.1F, -0.5F, -0.7F, -0.1F, 0F, 0F, -0.1F, 0F); // Box 411
		lococ41Model[393].setRotationPoint(-35.65F, -19.5F, 0.4F);

		lococ41Model[394].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 412
		lococ41Model[394].setRotationPoint(-35.75F, -19.5F, 1.7F);

		lococ41Model[395].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 415
		lococ41Model[395].setRotationPoint(-35.75F, -19.5F, -3.1F);

		lococ41Model[396].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, -0.6F, -0.5F, -0.7F, -0.6F, -0.5F, -0.7F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.1F, -0.5F, -0.7F, -0.1F, -0.5F, -0.7F, -0.1F, 0F, 0F, -0.1F, 0F); // Box 416
		lococ41Model[396].setRotationPoint(-35.65F, -19.5F, -3.05F);

		lococ41Model[397].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 417
		lococ41Model[397].setRotationPoint(-36F, -20F, -0.5F);

		lococ41Model[398].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, -0.6F, -0.5F, -0.7F, -0.6F, -0.5F, -0.7F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.1F, -0.5F, -0.7F, -0.1F, -0.5F, -0.7F, -0.1F, 0F, 0F, -0.1F, 0F); // Box 419
		lococ41Model[398].setRotationPoint(-35.65F, -19F, -1.6F);
		lococ41Model[398].rotateAngleX = -1.57079633F;

		lococ41Model[399].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, -0.6F, -0.5F, -0.7F, -0.6F, -0.5F, -0.7F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.1F, -0.5F, -0.7F, -0.1F, -0.5F, -0.7F, -0.1F, 0F, 0F, -0.1F, 0F); // Box 421
		lococ41Model[399].setRotationPoint(-35.65F, -19F, 3.2F);
		lococ41Model[399].rotateAngleX = -1.57079633F;

		lococ41Model[400].addBox(-1F, -1F, 0F, 1, 1, 5, 0F); // Box 422
		lococ41Model[400].setRotationPoint(-72F, 9F, -7F);

		lococ41Model[401].addShapeBox(-1F, -1F, 0F, 1, 1, 5, 0F, 0.1F, 0F, 0F, 0F, 0F, -2.3F, -0.05F, 0F, -0.5F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, -2.3F, 0F, 0F, -0.5F, 0F, 0F, 0F); // Box 424
		lococ41Model[401].setRotationPoint(-72F, 9F, -4.05F);
		lococ41Model[401].rotateAngleY = 0.43633231F;

		lococ41Model[402].addShapeBox(-1F, -1F, 0F, 1, 1, 5, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.5F, 0F, 0F, -2.2F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.5F, 0F, 0F, -2.2F, 0F, 0F, 0F); // Box 426
		lococ41Model[402].setRotationPoint(-74.18F, 9F, -0.45F);
		lococ41Model[402].rotateAngleY = -0.43633231F;

		lococ41Model[403].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 427
		lococ41Model[403].setRotationPoint(-72.5F, 5.5F, 0.75F);
		lococ41Model[403].rotateAngleY = -3.14159265F;
		lococ41Model[403].rotateAngleZ = 0.52359878F;

		lococ41Model[404].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 428
		lococ41Model[404].setRotationPoint(-71.5F, 4.5F, -0.25F);
		lococ41Model[404].rotateAngleY = -3.14159265F;
		lococ41Model[404].rotateAngleZ = 0.4712389F;

		lococ41Model[405].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 429
		lococ41Model[405].setRotationPoint(-71.5F, 4.5F, 1.75F);
		lococ41Model[405].rotateAngleY = -3.14159265F;
		lococ41Model[405].rotateAngleZ = 0.4712389F;

		lococ41Model[406].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 430
		lococ41Model[406].setRotationPoint(-71.2F, 4.5F, -1.25F);
		lococ41Model[406].rotateAngleY = -3.14159265F;
		lococ41Model[406].rotateAngleZ = 0.43633231F;

		lococ41Model[407].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 431
		lococ41Model[407].setRotationPoint(-71.2F, 4.5F, 2.75F);
		lococ41Model[407].rotateAngleY = -3.14159265F;
		lococ41Model[407].rotateAngleZ = 0.43633231F;

		lococ41Model[408].addBox(0F, 0F, 0F, 1, 10, 12, 0F); // Box 432
		lococ41Model[408].setRotationPoint(-9F, -12F, -6F);

		lococ41Model[409].addShapeBox(0F, 0F, 0F, 1, 4, 12, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 433
		lococ41Model[409].setRotationPoint(-9F, -16F, -6F);

		lococ41Model[410].addBox(0F, 0F, 0F, 1, 1, 8, 0F); // Box 434
		lococ41Model[410].setRotationPoint(-8.5F, -12F, -1F);
		lococ41Model[410].rotateAngleX = -0.03490659F;
		lococ41Model[410].rotateAngleY = -0.13962634F;

		lococ41Model[411].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 435
		lococ41Model[411].setRotationPoint(-7.5F, -7F, 8F);
		lococ41Model[411].rotateAngleZ = -0.17453293F;

		lococ41Model[412].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 436
		lococ41Model[412].setRotationPoint(-9F, -3F, 8F);

		lococ41Model[413].addBox(0F, 0F, 0F, 1, 3, 2, 0F); // Box 437
		lococ41Model[413].setRotationPoint(-8.5F, -5F, 4F);

		lococ41Model[414].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 438
		lococ41Model[414].setRotationPoint(-8.5F, -6F, 4F);
		lococ41Model[414].rotateAngleY = -0.15707963F;

		lococ41Model[415].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 439
		lococ41Model[415].setRotationPoint(-8.5F, -8F, 3.02F);
		lococ41Model[415].rotateAngleY = -0.31415927F;

		lococ41Model[416].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 440
		lococ41Model[416].setRotationPoint(-8.5F, -7F, 3.01F);

		lococ41Model[417].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 441
		lococ41Model[417].setRotationPoint(-8.5F, -5F, -3F);

		lococ41Model[418].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 442
		lococ41Model[418].setRotationPoint(-8.5F, -5F, 2F);

		lococ41Model[419].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 443
		lococ41Model[419].setRotationPoint(-8.5F, -6F, -3F);

		lococ41Model[420].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 444
		lococ41Model[420].setRotationPoint(-8.5F, -6F, 2F);

		lococ41Model[421].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 445
		lococ41Model[421].setRotationPoint(-8.5F, -7F, -2F);

		lococ41Model[422].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 446
		lococ41Model[422].setRotationPoint(-8.5F, -15.5F, -3F);

		lococ41Model[423].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 447
		lococ41Model[423].setRotationPoint(-8.5F, -14.99F, 0F);

		lococ41Model[424].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 449
		lococ41Model[424].setRotationPoint(-8.5F, -11.5F, -5F);

		lococ41Model[425].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 450
		lococ41Model[425].setRotationPoint(-9.5F, -9F, -8F);

		lococ41Model[426].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 451
		lococ41Model[426].setRotationPoint(-9.5F, -6F, -9F);

		lococ41Model[427].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 452
		lococ41Model[427].setRotationPoint(-9.5F, -19F, -5F);

		lococ41Model[428].addBox(0F, 0F, 0F, 1, 4, 4, 0F); // Box 453
		lococ41Model[428].setRotationPoint(-8.7F, -6F, -2F);

		lococ41Model[429].addBox(0F, 0F, 0F, 1, 5, 1, 0F); // Box 454
		lococ41Model[429].setRotationPoint(-8.5F, -22F, 3F);

		lococ41Model[430].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 455
		lococ41Model[430].setRotationPoint(-8.5F, -22F, 1F);

		lococ41Model[431].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F); // Box 436
		lococ41Model[431].setRotationPoint(-55.5F, -1.25F, -4.05F);

		lococ41Model[432].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F); // Box 437
		lococ41Model[432].setRotationPoint(-43.5F, -1.25F, -4.05F);

		lococ41Model[433].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F); // Box 438
		lococ41Model[433].setRotationPoint(-31.5F, -1.25F, -4.05F);

		lococ41Model[434].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F); // Box 439
		lococ41Model[434].setRotationPoint(-19.5F, -1.25F, -4.05F);

		lococ41Model[435].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 440
		lococ41Model[435].setRotationPoint(-42.5F, -1.5F, -4.06F);

		lococ41Model[436].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 441
		lococ41Model[436].setRotationPoint(-35.5F, -1.5F, -4.06F);

		lococ41Model[437].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 442
		lococ41Model[437].setRotationPoint(-47.5F, -1.5F, -4.06F);

		lococ41Model[438].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 443
		lococ41Model[438].setRotationPoint(-54.5F, -1.5F, -4.06F);

		lococ41Model[439].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 444
		lococ41Model[439].setRotationPoint(-30.5F, -1.5F, -4.06F);

		lococ41Model[440].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 445
		lococ41Model[440].setRotationPoint(-23.5F, -1.5F, -4.06F);

		lococ41Model[441].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 446
		lococ41Model[441].setRotationPoint(-18.5F, -1.5F, -4.06F);

		lococ41Model[442].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 447
		lococ41Model[442].setRotationPoint(-11.5F, -1.5F, -4.06F);

		lococ41Model[443].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 448
		lococ41Model[443].setRotationPoint(-39F, -1.35F, -4.06F);

		lococ41Model[444].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 449
		lococ41Model[444].setRotationPoint(-27F, -1.35F, -4.06F);

		lococ41Model[445].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 450
		lococ41Model[445].setRotationPoint(-15F, -1.35F, -4.06F);

		lococ41Model[446].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 451
		lococ41Model[446].setRotationPoint(-51F, -1.35F, -4.06F);

		lococ41Model[447].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 452
		lococ41Model[447].setRotationPoint(-18.5F, -1.5F, 3.06F);

		lococ41Model[448].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 453
		lococ41Model[448].setRotationPoint(-11.5F, -1.5F, 3.06F);

		lococ41Model[449].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F); // Box 454
		lococ41Model[449].setRotationPoint(-19.5F, -1.25F, 3.05F);

		lococ41Model[450].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 455
		lococ41Model[450].setRotationPoint(-15F, -1.35F, 3.06F);

		lococ41Model[451].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 456
		lococ41Model[451].setRotationPoint(-23.5F, -1.5F, 3.06F);

		lococ41Model[452].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F); // Box 457
		lococ41Model[452].setRotationPoint(-31.5F, -1.25F, 3.05F);

		lococ41Model[453].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 458
		lococ41Model[453].setRotationPoint(-27F, -1.35F, 3.06F);

		lococ41Model[454].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 459
		lococ41Model[454].setRotationPoint(-30.5F, -1.5F, 3.06F);

		lococ41Model[455].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 460
		lococ41Model[455].setRotationPoint(-35.5F, -1.5F, 3.06F);

		lococ41Model[456].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F); // Box 461
		lococ41Model[456].setRotationPoint(-43.5F, -1.25F, 3.05F);

		lococ41Model[457].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 462
		lococ41Model[457].setRotationPoint(-39F, -1.35F, 3.06F);

		lococ41Model[458].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 463
		lococ41Model[458].setRotationPoint(-42.5F, -1.5F, 3.06F);

		lococ41Model[459].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 464
		lococ41Model[459].setRotationPoint(-47.5F, -1.5F, 3.06F);

		lococ41Model[460].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F); // Box 465
		lococ41Model[460].setRotationPoint(-55.5F, -1.25F, 3.05F);

		lococ41Model[461].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 466
		lococ41Model[461].setRotationPoint(-51F, -1.35F, 3.06F);

		lococ41Model[462].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 467
		lococ41Model[462].setRotationPoint(-54.5F, -1.5F, 3.06F);

		lococ41Model[463].addShapeBox(0F, -1F, 0F, 37, 1, 1, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 468
		lococ41Model[463].setRotationPoint(-49F, 7F, -7F);

		lococ41Model[464].addShapeBox(0F, -1F, 0F, 37, 1, 1, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 469
		lococ41Model[464].setRotationPoint(-49F, 7.75F, -7F);

		lococ41Model[465].addShapeBox(0F, -1F, 0F, 23, 1, 1, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 470
		lococ41Model[465].setRotationPoint(-48F, 4.84F, -8F);
		lococ41Model[465].rotateAngleZ = -0.09075712F;

		lococ41Model[466].addShapeBox(0F, -1F, 0F, 23, 1, 1, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 471
		lococ41Model[466].setRotationPoint(-48F, 5.59F, -8F);
		lococ41Model[466].rotateAngleZ = -0.09075712F;

		lococ41Model[467].addShapeBox(0F, -1F, 0F, 1, 1, 1, 0F, 0F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.2F, 0F, 0.1F, 0.2F, 0F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.2F, 0F, 0.1F, 0.2F); // Box 474
		lococ41Model[467].setRotationPoint(-13F, 7F, -6.2F);

		lococ41Model[468].addShapeBox(0F, -1F, 0F, 1, 1, 1, 0F, 0F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.2F, 0F, 0.1F, 0.2F, 0F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.2F, 0F, 0.1F, 0.2F); // Box 476
		lococ41Model[468].setRotationPoint(-37F, 7F, -6.2F);

		lococ41Model[469].addShapeBox(0F, -1F, 0F, 1, 1, 1, 0F, 0.1F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.2F, 0.1F, 0.1F, 0.2F, 0.1F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.2F, 0.1F, 0.1F, 0.2F); // Box 477
		lococ41Model[469].setRotationPoint(-49F, 7F, -6.2F);

		lococ41Model[470].addShapeBox(0F, -1F, 0F, 1, 1, 2, 0F, 0F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.2F, 0F, 0.1F, 0.2F, 0F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.2F, 0F, 0.1F, 0.2F); // Box 478
		lococ41Model[470].setRotationPoint(-25F, 7F, -7.2F);

		lococ41Model[471].addShapeBox(0F, -1F, 0F, 5, 1, 1, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 479
		lococ41Model[471].setRotationPoint(-54F, 5.75F, -8F);

		lococ41Model[472].addShapeBox(0F, -1F, 0F, 5, 1, 1, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 480
		lococ41Model[472].setRotationPoint(-54F, 4.75F, -8F);

		lococ41Model[473].addShapeBox(0F, -1F, 0F, 1, 1, 1, 0F, 0.1F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.2F, 0.1F, 0.1F, 0.2F, 0.1F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.2F, 0.1F, 0.1F, 0.2F); // Box 481
		lococ41Model[473].setRotationPoint(-48.9F, 4.85F, -7.2F);

		lococ41Model[474].addShapeBox(0F, -1F, 0F, 37, 1, 1, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 482
		lococ41Model[474].setRotationPoint(-53F, 3F, 5.25F);

		lococ41Model[475].addShapeBox(0F, -1F, 0F, 37, 1, 1, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 483
		lococ41Model[475].setRotationPoint(-53F, 3.75F, 5.25F);

		lococ41Model[476].addShapeBox(0F, -1F, 0F, 23, 1, 1, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 484
		lococ41Model[476].setRotationPoint(-52F, 5.59F, 6.25F);
		lococ41Model[476].rotateAngleZ = 0.07853982F;

		lococ41Model[477].addShapeBox(0F, -1F, 0F, 23, 1, 1, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 485
		lococ41Model[477].setRotationPoint(-52F, 4.84F, 6.25F);
		lococ41Model[477].rotateAngleZ = 0.07853982F;

		lococ41Model[478].addShapeBox(0F, -1F, 0F, 5, 1, 1, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 486
		lococ41Model[478].setRotationPoint(-58F, 5.75F, 6.25F);

		lococ41Model[479].addShapeBox(0F, -1F, 0F, 5, 1, 1, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 487
		lococ41Model[479].setRotationPoint(-58F, 4.75F, 6.25F);

		lococ41Model[480].addShapeBox(0F, -1F, 0F, 1, 1, 1, 0F, 0.1F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.2F, 0.1F, 0.1F, 0.2F, 0.1F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.2F, 0.1F, 0.1F, 0.2F); // Box 488
		lococ41Model[480].setRotationPoint(-52.9F, 4.85F, 6.1F);

		lococ41Model[481].addShapeBox(0F, -1F, 0F, 1, 1, 1, 0F, 0F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.2F, 0F, 0.1F, 0.2F, 0F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.2F, 0F, 0.1F, 0.2F); // Box 489
		lococ41Model[481].setRotationPoint(-41F, 3F, 5.1F);

		lococ41Model[482].addShapeBox(0F, -1F, 0F, 1, 1, 1, 0F, 0F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.2F, 0F, 0.1F, 0.2F, 0F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.2F, 0F, 0.1F, 0.2F); // Box 490
		lococ41Model[482].setRotationPoint(-17F, 3F, 5.1F);

		lococ41Model[483].addShapeBox(0F, -1F, 0F, 1, 1, 2, 0F, 0F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.2F, 0F, 0.1F, 0.2F, 0F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.2F, 0F, 0.1F, 0.2F); // Box 491
		lococ41Model[483].setRotationPoint(-29.18F, 3F, 5.1F);

		lococ41Model[484].addShapeBox(0F, -1F, 0F, 22, 1, 1, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 492
		lococ41Model[484].setRotationPoint(-54F, 1.5F, -7.5F);

		lococ41Model[485].addShapeBox(0F, -1F, 0F, 22, 1, 1, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 493
		lococ41Model[485].setRotationPoint(-54F, 1.5F, 5.5F);

		lococ41Model[486].addShapeBox(0F, -1F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 494
		lococ41Model[486].setRotationPoint(-32.4F, 1.9F, -7.51F);
		lococ41Model[486].rotateAngleZ = 0.61086524F;

		lococ41Model[487].addShapeBox(0F, -1F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 495
		lococ41Model[487].setRotationPoint(-32.4F, 1.9F, 5.51F);
		lococ41Model[487].rotateAngleZ = 0.61086524F;

		lococ41Model[488].addShapeBox(0F, -1F, 0F, 13, 1, 1, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 496
		lococ41Model[488].setRotationPoint(-33.7F, 2F, 6.3F);
		lococ41Model[488].rotateAngleY = -1.57079633F;

		lococ41Model[489].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 497
		lococ41Model[489].setRotationPoint(-33.5F, 0F, -0.5F);

		lococ41Model[490].addShapeBox(0F, -1F, 0F, 1, 1, 1, 0F, 0.1F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.2F, 0.1F, 0.1F, 0.2F, 0.1F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.2F, 0.1F, 0.1F, 0.2F); // Box 495
		lococ41Model[490].setRotationPoint(-53F, 3F, 5.1F);

		lococ41Model[491].addBox(0F, 0F, 0F, 3, 2, 1, 0F); // Box 496
		lococ41Model[491].setRotationPoint(-32F, -4F, -9F);

		lococ41Model[492].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, -1F, -0.5F, -0.5F, -1F, -0.5F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 497
		lococ41Model[492].setRotationPoint(-33.5F, -7F, -10F);

		lococ41Model[493].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, -1F, -0.5F, -0.5F, -1F, -0.5F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 498
		lococ41Model[493].setRotationPoint(-33.5F, -7F, -8.5F);

		lococ41Model[494].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 499
		lococ41Model[494].setRotationPoint(-33F, -6F, -9F);

		lococ41Model[495].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, -1F, -0.5F, -0.5F, -1F, -0.5F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 500
		lococ41Model[495].setRotationPoint(-32F, -7F, -8.5F);

		lococ41Model[496].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, -1F, -0.5F, -0.5F, -1F, -0.5F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 501
		lococ41Model[496].setRotationPoint(-32F, -7F, -10F);

		lococ41Model[497].addBox(0F, 0F, 0F, 3, 2, 1, 0F); // Box 502
		lococ41Model[497].setRotationPoint(-32F, -8F, -9F);
		fixRotation(lococ41Model, false, true, true);

	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		for(int i = 0; i < 498; i++)
		{
			if(lococ41Model[i].boxName!= null && lococ41Model[i].boxName.equals("lamp")){
				Minecraft.getMinecraft().entityRenderer.disableLightmap(1D);
				lococ41Model[i].render(f5);
				Minecraft.getMinecraft().entityRenderer.enableLightmap(1D);

			} else {
				lococ41Model[i].render(f5);
			}
		}
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
	{
	}

	public ModelRendererTurbo lococ41Model[];
}