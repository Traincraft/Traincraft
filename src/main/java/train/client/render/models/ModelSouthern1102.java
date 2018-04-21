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

public class ModelSouthern1102 extends ModelBase
{
	int textureX = 512;
	int textureY = 128;

	public ModelSouthern1102()
	{
		southern1102Model = new ModelRendererTurbo[446];
		southern1102Model[0] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 6
		southern1102Model[1] = new ModelRendererTurbo(this, 146, 1, textureX, textureY); // Box 10
		southern1102Model[2] = new ModelRendererTurbo(this, 156, 1, textureX, textureY); // Box 11
		southern1102Model[3] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 25
		southern1102Model[4] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 26
		southern1102Model[5] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 22
		southern1102Model[6] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 23
		southern1102Model[7] = new ModelRendererTurbo(this, 505, 17, textureX, textureY); // Box 24
		southern1102Model[8] = new ModelRendererTurbo(this, 146, 9, textureX, textureY); // Box 25
		southern1102Model[9] = new ModelRendererTurbo(this, 154, 9, textureX, textureY); // Box 26
		southern1102Model[10] = new ModelRendererTurbo(this, 33, 33, textureX, textureY); // Box 27
		southern1102Model[11] = new ModelRendererTurbo(this, 89, 33, textureX, textureY); // Box 28
		southern1102Model[12] = new ModelRendererTurbo(this, 129, 33, textureX, textureY); // Box 29
		southern1102Model[13] = new ModelRendererTurbo(this, 169, 33, textureX, textureY); // Box 30
		southern1102Model[14] = new ModelRendererTurbo(this, 209, 33, textureX, textureY); // Box 31
		southern1102Model[15] = new ModelRendererTurbo(this, 497, 25, textureX, textureY); // Box 32
		southern1102Model[16] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 33
		southern1102Model[17] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Box 34
		southern1102Model[18] = new ModelRendererTurbo(this, 9, 33, textureX, textureY); // Box 35
		southern1102Model[19] = new ModelRendererTurbo(this, 33, 33, textureX, textureY); // Box 36
		southern1102Model[20] = new ModelRendererTurbo(this, 41, 33, textureX, textureY); // Box 37
		southern1102Model[21] = new ModelRendererTurbo(this, 249, 33, textureX, textureY); // Box 38
		southern1102Model[22] = new ModelRendererTurbo(this, 257, 33, textureX, textureY); // Box 39
		southern1102Model[23] = new ModelRendererTurbo(this, 409, 33, textureX, textureY); // Box 45
		southern1102Model[24] = new ModelRendererTurbo(this, 457, 33, textureX, textureY); // Box 46
		southern1102Model[25] = new ModelRendererTurbo(this, 161, 41, textureX, textureY); // Box 47
		southern1102Model[26] = new ModelRendererTurbo(this, 292, 41, textureX, textureY); // Box 48
		southern1102Model[27] = new ModelRendererTurbo(this, 353, 41, textureX, textureY); // Box 49
		southern1102Model[28] = new ModelRendererTurbo(this, 401, 41, textureX, textureY); // Box 50
		southern1102Model[29] = new ModelRendererTurbo(this, 425, 41, textureX, textureY); // Box 54
		southern1102Model[30] = new ModelRendererTurbo(this, 137, 49, textureX, textureY); // Box 59
		southern1102Model[31] = new ModelRendererTurbo(this, 193, 52, textureX, textureY); // Box 60
		southern1102Model[32] = new ModelRendererTurbo(this, 265, 49, textureX, textureY); // Box 62
		southern1102Model[33] = new ModelRendererTurbo(this, 49, 33, textureX, textureY); // Box 65
		southern1102Model[34] = new ModelRendererTurbo(this, 113, 49, textureX, textureY); // Box 66
		southern1102Model[35] = new ModelRendererTurbo(this, 121, 57, textureX, textureY); // Box 71
		southern1102Model[36] = new ModelRendererTurbo(this, 65, 57, textureX, textureY); // Box 74
		southern1102Model[37] = new ModelRendererTurbo(this, 233, 65, textureX, textureY); // Box 85
		southern1102Model[38] = new ModelRendererTurbo(this, 121, 17, textureX, textureY); // Box 86
		southern1102Model[39] = new ModelRendererTurbo(this, 305, 65, textureX, textureY); // Box 87
		southern1102Model[40] = new ModelRendererTurbo(this, 36, 49, textureX, textureY); // Box 88
		southern1102Model[41] = new ModelRendererTurbo(this, 89, 49, textureX, textureY); // Box 89
		southern1102Model[42] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 90
		southern1102Model[43] = new ModelRendererTurbo(this, 401, 57, textureX, textureY); // Box 91
		southern1102Model[44] = new ModelRendererTurbo(this, 361, 65, textureX, textureY); // Box 92
		southern1102Model[45] = new ModelRendererTurbo(this, 397, 62, textureX, textureY); // Box 93
		southern1102Model[46] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 94
		southern1102Model[47] = new ModelRendererTurbo(this, 257, 49, textureX, textureY); // Box 95
		southern1102Model[48] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 96
		southern1102Model[49] = new ModelRendererTurbo(this, 473, 57, textureX, textureY); // Box 97
		southern1102Model[50] = new ModelRendererTurbo(this, 209, 65, textureX, textureY); // Box 100
		southern1102Model[51] = new ModelRendererTurbo(this, 449, 33, textureX, textureY); // Box 104
		southern1102Model[52] = new ModelRendererTurbo(this, 169, 57, textureX, textureY); // Box 105
		southern1102Model[53] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 106
		southern1102Model[54] = new ModelRendererTurbo(this, 369, 17, textureX, textureY); // Box 107
		southern1102Model[55] = new ModelRendererTurbo(this, 265, 33, textureX, textureY); // Box 108
		southern1102Model[56] = new ModelRendererTurbo(this, 289, 33, textureX, textureY); // Box 109
		southern1102Model[57] = new ModelRendererTurbo(this, 353, 33, textureX, textureY); // Box 110
		southern1102Model[58] = new ModelRendererTurbo(this, 409, 33, textureX, textureY); // Box 111
		southern1102Model[59] = new ModelRendererTurbo(this, 145, 73, textureX, textureY); // Box 114
		southern1102Model[60] = new ModelRendererTurbo(this, 113, 65, textureX, textureY); // Box 118
		southern1102Model[61] = new ModelRendererTurbo(this, 57, 73, textureX, textureY); // Box 119
		southern1102Model[62] = new ModelRendererTurbo(this, 145, 73, textureX, textureY); // Box 120
		southern1102Model[63] = new ModelRendererTurbo(this, 385, 41, textureX, textureY); // Box 127
		southern1102Model[64] = new ModelRendererTurbo(this, 441, 73, textureX, textureY); // Box 132
		southern1102Model[65] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 133
		southern1102Model[66] = new ModelRendererTurbo(this, 33, 81, textureX, textureY); // Box 132
		southern1102Model[67] = new ModelRendererTurbo(this, 81, 81, textureX, textureY); // Box 133
		southern1102Model[68] = new ModelRendererTurbo(this, 481, 73, textureX, textureY); // Box 135
		southern1102Model[69] = new ModelRendererTurbo(this, 353, 33, textureX, textureY); // Box 131
		southern1102Model[70] = new ModelRendererTurbo(this, 362, 16, textureX, textureY); // Box 196
		southern1102Model[71] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 199
		southern1102Model[72] = new ModelRendererTurbo(this, 176, 2, textureX, textureY); // Box 197
		southern1102Model[73] = new ModelRendererTurbo(this, 219, 97, textureX, textureY); // Box 196
		southern1102Model[74] = new ModelRendererTurbo(this, 359, 93, textureX, textureY); // Box 198
		southern1102Model[75] = new ModelRendererTurbo(this, 362, 7, textureX, textureY); // Box 200
		southern1102Model[76] = new ModelRendererTurbo(this, 169, 22, textureX, textureY); // Box 197
		southern1102Model[77] = new ModelRendererTurbo(this, 45, 22, textureX, textureY); // Box 198
		southern1102Model[78] = new ModelRendererTurbo(this, 168, 77, textureX, textureY); // Box 191
		southern1102Model[79] = new ModelRendererTurbo(this, 409, 33, textureX, textureY); // Box 194
		southern1102Model[80] = new ModelRendererTurbo(this, 196, 51, textureX, textureY); // Box 195
		southern1102Model[81] = new ModelRendererTurbo(this, 192, 54, textureX, textureY); // Box 196
		southern1102Model[82] = new ModelRendererTurbo(this, 197, 54, textureX, textureY); // Box 197
		southern1102Model[83] = new ModelRendererTurbo(this, 190, 50, textureX, textureY); // Box 198
		southern1102Model[84] = new ModelRendererTurbo(this, 194, 55, textureX, textureY); // Box 199
		southern1102Model[85] = new ModelRendererTurbo(this, 194, 54, textureX, textureY); // Box 200
		southern1102Model[86] = new ModelRendererTurbo(this, 187, 54, textureX, textureY); // Box 201
		southern1102Model[87] = new ModelRendererTurbo(this, 193, 55, textureX, textureY); // Box 202
		southern1102Model[88] = new ModelRendererTurbo(this, 197, 55, textureX, textureY); // Box 203
		southern1102Model[89] = new ModelRendererTurbo(this, 196, 50, textureX, textureY); // Box 204
		southern1102Model[90] = new ModelRendererTurbo(this, 196, 56, textureX, textureY); // Box 205
		southern1102Model[91] = new ModelRendererTurbo(this, 202, 56, textureX, textureY); // Box 206
		southern1102Model[92] = new ModelRendererTurbo(this, 194, 55, textureX, textureY); // Box 207
		southern1102Model[93] = new ModelRendererTurbo(this, 194, 53, textureX, textureY); // Box 208
		southern1102Model[94] = new ModelRendererTurbo(this, 202, 57, textureX, textureY); // Box 209
		southern1102Model[95] = new ModelRendererTurbo(this, 193, 52, textureX, textureY); // Box 212
		southern1102Model[96] = new ModelRendererTurbo(this, 197, 54, textureX, textureY); // Box 213
		southern1102Model[97] = new ModelRendererTurbo(this, 190, 50, textureX, textureY); // Box 214
		southern1102Model[98] = new ModelRendererTurbo(this, 196, 50, textureX, textureY); // Box 215
		southern1102Model[99] = new ModelRendererTurbo(this, 194, 53, textureX, textureY); // Box 216
		southern1102Model[100] = new ModelRendererTurbo(this, 196, 51, textureX, textureY); // Box 217
		southern1102Model[101] = new ModelRendererTurbo(this, 187, 54, textureX, textureY); // Box 218
		southern1102Model[102] = new ModelRendererTurbo(this, 192, 54, textureX, textureY); // Box 219
		southern1102Model[103] = new ModelRendererTurbo(this, 193, 55, textureX, textureY); // Box 220
		southern1102Model[104] = new ModelRendererTurbo(this, 194, 55, textureX, textureY); // Box 221
		southern1102Model[105] = new ModelRendererTurbo(this, 194, 54, textureX, textureY); // Box 222
		southern1102Model[106] = new ModelRendererTurbo(this, 197, 55, textureX, textureY); // Box 223
		southern1102Model[107] = new ModelRendererTurbo(this, 196, 56, textureX, textureY); // Box 224
		southern1102Model[108] = new ModelRendererTurbo(this, 202, 56, textureX, textureY); // Box 225
		southern1102Model[109] = new ModelRendererTurbo(this, 202, 57, textureX, textureY); // Box 226
		southern1102Model[110] = new ModelRendererTurbo(this, 194, 55, textureX, textureY); // Box 227
		southern1102Model[111] = new ModelRendererTurbo(this, 197, 54, textureX, textureY); // Box 228
		southern1102Model[112] = new ModelRendererTurbo(this, 197, 54, textureX, textureY); // Box 229
		southern1102Model[113] = new ModelRendererTurbo(this, 197, 54, textureX, textureY); // Box 230
		southern1102Model[114] = new ModelRendererTurbo(this, 197, 54, textureX, textureY); // Box 231
		southern1102Model[115] = new ModelRendererTurbo(this, 197, 54, textureX, textureY); // Box 232
		southern1102Model[116] = new ModelRendererTurbo(this, 197, 54, textureX, textureY); // Box 233
		southern1102Model[117] = new ModelRendererTurbo(this, 145, 73, textureX, textureY); // Box 235
		southern1102Model[118] = new ModelRendererTurbo(this, 145, 73, textureX, textureY); // Box 236
		southern1102Model[119] = new ModelRendererTurbo(this, 145, 73, textureX, textureY); // Box 237
		southern1102Model[120] = new ModelRendererTurbo(this, 145, 73, textureX, textureY); // Box 238
		southern1102Model[121] = new ModelRendererTurbo(this, 145, 73, textureX, textureY); // Box 239
		southern1102Model[122] = new ModelRendererTurbo(this, 145, 73, textureX, textureY); // Box 240
		southern1102Model[123] = new ModelRendererTurbo(this, 145, 73, textureX, textureY); // Box 241
		southern1102Model[124] = new ModelRendererTurbo(this, 145, 73, textureX, textureY); // Box 242
		southern1102Model[125] = new ModelRendererTurbo(this, 145, 73, textureX, textureY); // Box 243
		southern1102Model[126] = new ModelRendererTurbo(this, 145, 73, textureX, textureY); // Box 244
		southern1102Model[127] = new ModelRendererTurbo(this, 145, 73, textureX, textureY); // Box 245
		southern1102Model[128] = new ModelRendererTurbo(this, 145, 73, textureX, textureY); // Box 246
		southern1102Model[129] = new ModelRendererTurbo(this, 145, 73, textureX, textureY); // Box 247
		southern1102Model[130] = new ModelRendererTurbo(this, 145, 73, textureX, textureY); // Box 248
		southern1102Model[131] = new ModelRendererTurbo(this, 145, 73, textureX, textureY); // Box 249
		southern1102Model[132] = new ModelRendererTurbo(this, 145, 73, textureX, textureY); // Box 250
		southern1102Model[133] = new ModelRendererTurbo(this, 145, 73, textureX, textureY); // Box 252
		southern1102Model[134] = new ModelRendererTurbo(this, 145, 73, textureX, textureY); // Box 253
		southern1102Model[135] = new ModelRendererTurbo(this, 145, 73, textureX, textureY); // Box 254
		southern1102Model[136] = new ModelRendererTurbo(this, 145, 73, textureX, textureY); // Box 256
		southern1102Model[137] = new ModelRendererTurbo(this, 145, 73, textureX, textureY); // Box 257
		southern1102Model[138] = new ModelRendererTurbo(this, 145, 73, textureX, textureY); // Box 258
		southern1102Model[139] = new ModelRendererTurbo(this, 145, 73, textureX, textureY); // Box 259
		southern1102Model[140] = new ModelRendererTurbo(this, 309, 84, textureX, textureY); // Box 250
		southern1102Model[141] = new ModelRendererTurbo(this, 309, 84, textureX, textureY); // Box 251
		southern1102Model[142] = new ModelRendererTurbo(this, 317, 89, textureX, textureY); // Box 252
		southern1102Model[143] = new ModelRendererTurbo(this, 309, 88, textureX, textureY); // Box 254
		southern1102Model[144] = new ModelRendererTurbo(this, 317, 89, textureX, textureY); // Box 256
		southern1102Model[145] = new ModelRendererTurbo(this, 309, 88, textureX, textureY); // Box 257
		southern1102Model[146] = new ModelRendererTurbo(this, 149, 110, textureX, textureY); // Box 272
		southern1102Model[147] = new ModelRendererTurbo(this, 149, 100, textureX, textureY); // Box 273
		southern1102Model[148] = new ModelRendererTurbo(this, 142, 101, textureX, textureY); // Box 275
		southern1102Model[149] = new ModelRendererTurbo(this, 142, 111, textureX, textureY); // Box 276
		southern1102Model[150] = new ModelRendererTurbo(this, 161, 101, textureX, textureY); // Box 277
		southern1102Model[151] = new ModelRendererTurbo(this, 161, 110, textureX, textureY); // Box 278
		southern1102Model[152] = new ModelRendererTurbo(this, 156, 110, textureX, textureY); // Box 279
		southern1102Model[153] = new ModelRendererTurbo(this, 156, 101, textureX, textureY); // Box 280
		southern1102Model[154] = new ModelRendererTurbo(this, 309, 84, textureX, textureY); // Box 292
		southern1102Model[155] = new ModelRendererTurbo(this, 309, 84, textureX, textureY); // Box 295
		southern1102Model[156] = new ModelRendererTurbo(this, 309, 84, textureX, textureY); // Box 296
		southern1102Model[157] = new ModelRendererTurbo(this, 309, 84, textureX, textureY); // Box 303
		southern1102Model[158] = new ModelRendererTurbo(this, 309, 84, textureX, textureY); // Box 305
		southern1102Model[159] = new ModelRendererTurbo(this, 309, 84, textureX, textureY); // Box 314
		southern1102Model[160] = new ModelRendererTurbo(this, 304, 72, textureX, textureY); // Box 325
		southern1102Model[161] = new ModelRendererTurbo(this, 304, 72, textureX, textureY); // Box 326
		southern1102Model[162] = new ModelRendererTurbo(this, 304, 72, textureX, textureY); // Box 327
		southern1102Model[163] = new ModelRendererTurbo(this, 304, 72, textureX, textureY); // Box 328
		southern1102Model[164] = new ModelRendererTurbo(this, 317, 89, textureX, textureY); // Box 332
		southern1102Model[165] = new ModelRendererTurbo(this, 317, 89, textureX, textureY); // Box 334
		southern1102Model[166] = new ModelRendererTurbo(this, 317, 89, textureX, textureY); // Box 335
		southern1102Model[167] = new ModelRendererTurbo(this, 309, 88, textureX, textureY); // Box 336
		southern1102Model[168] = new ModelRendererTurbo(this, 385, 41, textureX, textureY); // Box 337
		southern1102Model[169] = new ModelRendererTurbo(this, 309, 84, textureX, textureY); // Box 327
		southern1102Model[170] = new ModelRendererTurbo(this, 309, 88, textureX, textureY); // Box 328
		southern1102Model[171] = new ModelRendererTurbo(this, 309, 84, textureX, textureY); // Box 333
		southern1102Model[172] = new ModelRendererTurbo(this, 309, 84, textureX, textureY); // Box 334
		southern1102Model[173] = new ModelRendererTurbo(this, 309, 84, textureX, textureY); // Box 335
		southern1102Model[174] = new ModelRendererTurbo(this, 309, 88, textureX, textureY); // Box 339
		southern1102Model[175] = new ModelRendererTurbo(this, 309, 88, textureX, textureY); // Box 340
		southern1102Model[176] = new ModelRendererTurbo(this, 309, 84, textureX, textureY); // Box 341
		southern1102Model[177] = new ModelRendererTurbo(this, 309, 88, textureX, textureY); // Box 342
		southern1102Model[178] = new ModelRendererTurbo(this, 194, 103, textureX, textureY, "lamp"); // Box 356
		southern1102Model[179] = new ModelRendererTurbo(this, 194, 103, textureX, textureY); // Box 357
		southern1102Model[180] = new ModelRendererTurbo(this, 194, 103, textureX, textureY); // Box 359
		southern1102Model[181] = new ModelRendererTurbo(this, 194, 103, textureX, textureY); // Box 361
		southern1102Model[182] = new ModelRendererTurbo(this, 194, 103, textureX, textureY); // Box 362
		southern1102Model[183] = new ModelRendererTurbo(this, 194, 103, textureX, textureY); // Box 363
		southern1102Model[184] = new ModelRendererTurbo(this, 194, 103, textureX, textureY); // Box 364
		southern1102Model[185] = new ModelRendererTurbo(this, 137, 90, textureX, textureY); // Box 365
		southern1102Model[186] = new ModelRendererTurbo(this, 317, 89, textureX, textureY); // Box 366
		southern1102Model[187] = new ModelRendererTurbo(this, 204, 98, textureX, textureY); // Box 367
		southern1102Model[188] = new ModelRendererTurbo(this, 204, 98, textureX, textureY); // Box 368
		southern1102Model[189] = new ModelRendererTurbo(this, 194, 103, textureX, textureY); // Box 360
		southern1102Model[190] = new ModelRendererTurbo(this, 171, 98, textureX, textureY); // Box 362
		southern1102Model[191] = new ModelRendererTurbo(this, 171, 98, textureX, textureY); // Box 365
		southern1102Model[192] = new ModelRendererTurbo(this, 218, 111, textureX, textureY); // Box 396
		southern1102Model[193] = new ModelRendererTurbo(this, 176, 120, textureX, textureY); // Box 405
		southern1102Model[194] = new ModelRendererTurbo(this, 176, 120, textureX, textureY); // Box 378
		southern1102Model[195] = new ModelRendererTurbo(this, 176, 120, textureX, textureY); // Box 379
		southern1102Model[196] = new ModelRendererTurbo(this, 176, 120, textureX, textureY); // Box 380
		southern1102Model[197] = new ModelRendererTurbo(this, 176, 120, textureX, textureY); // Box 381
		southern1102Model[198] = new ModelRendererTurbo(this, 176, 120, textureX, textureY); // Box 382
		southern1102Model[199] = new ModelRendererTurbo(this, 176, 120, textureX, textureY); // Box 383
		southern1102Model[200] = new ModelRendererTurbo(this, 176, 120, textureX, textureY); // Box 384
		southern1102Model[201] = new ModelRendererTurbo(this, 347, 91, textureX, textureY); // Box 396
		southern1102Model[202] = new ModelRendererTurbo(this, 182, 103, textureX, textureY); // Box 390
		southern1102Model[203] = new ModelRendererTurbo(this, 182, 109, textureX, textureY); // Box 391
		southern1102Model[204] = new ModelRendererTurbo(this, 182, 109, textureX, textureY); // Box 397
		southern1102Model[205] = new ModelRendererTurbo(this, 182, 112, textureX, textureY); // Box 398
		southern1102Model[206] = new ModelRendererTurbo(this, 182, 112, textureX, textureY); // Box 401
		southern1102Model[207] = new ModelRendererTurbo(this, 182, 112, textureX, textureY); // Box 402
		southern1102Model[208] = new ModelRendererTurbo(this, 182, 112, textureX, textureY); // Box 403
		southern1102Model[209] = new ModelRendererTurbo(this, 385, 41, textureX, textureY); // Box 404
		southern1102Model[210] = new ModelRendererTurbo(this, 385, 41, textureX, textureY); // Box 405
		southern1102Model[211] = new ModelRendererTurbo(this, 176, 120, textureX, textureY); // Box 409
		southern1102Model[212] = new ModelRendererTurbo(this, 176, 120, textureX, textureY); // Box 411
		southern1102Model[213] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 402
		southern1102Model[214] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 403
		southern1102Model[215] = new ModelRendererTurbo(this, 110, 1, textureX, textureY); // Box 406
		southern1102Model[216] = new ModelRendererTurbo(this, 110, 1, textureX, textureY); // Box 407
		southern1102Model[217] = new ModelRendererTurbo(this, 110, 1, textureX, textureY); // Box 408
		southern1102Model[218] = new ModelRendererTurbo(this, 154, 9, textureX, textureY); // Box 333
		southern1102Model[219] = new ModelRendererTurbo(this, 154, 9, textureX, textureY); // Box 335
		southern1102Model[220] = new ModelRendererTurbo(this, 24, 14, textureX, textureY); // Box 331
		southern1102Model[221] = new ModelRendererTurbo(this, 24, 14, textureX, textureY); // Box 332
		southern1102Model[222] = new ModelRendererTurbo(this, 24, 14, textureX, textureY); // Box 333
		southern1102Model[223] = new ModelRendererTurbo(this, 337, 73, textureX, textureY); // Box 334
		southern1102Model[224] = new ModelRendererTurbo(this, 306, 8, textureX, textureY); // Box 335
		southern1102Model[225] = new ModelRendererTurbo(this, 330, 12, textureX, textureY); // Box 338
		southern1102Model[226] = new ModelRendererTurbo(this, 330, 12, textureX, textureY); // Box 339
		southern1102Model[227] = new ModelRendererTurbo(this, 337, 9, textureX, textureY); // Box 340
		southern1102Model[228] = new ModelRendererTurbo(this, 24, 14, textureX, textureY); // Box 338
		southern1102Model[229] = new ModelRendererTurbo(this, 121, 57, textureX, textureY); // Box 341
		southern1102Model[230] = new ModelRendererTurbo(this, 121, 57, textureX, textureY); // Box 343
		southern1102Model[231] = new ModelRendererTurbo(this, 121, 57, textureX, textureY); // Box 345
		southern1102Model[232] = new ModelRendererTurbo(this, 121, 57, textureX, textureY); // Box 341
		southern1102Model[233] = new ModelRendererTurbo(this, 121, 57, textureX, textureY); // Box 342
		southern1102Model[234] = new ModelRendererTurbo(this, 121, 57, textureX, textureY); // Box 343
		southern1102Model[235] = new ModelRendererTurbo(this, 241, 54, textureX, textureY); // Box 342
		southern1102Model[236] = new ModelRendererTurbo(this, 385, 41, textureX, textureY); // Box 343
		southern1102Model[237] = new ModelRendererTurbo(this, 385, 41, textureX, textureY); // Box 344
		southern1102Model[238] = new ModelRendererTurbo(this, 385, 41, textureX, textureY); // Box 345
		southern1102Model[239] = new ModelRendererTurbo(this, 385, 41, textureX, textureY); // Box 346
		southern1102Model[240] = new ModelRendererTurbo(this, 385, 41, textureX, textureY); // Box 347
		southern1102Model[241] = new ModelRendererTurbo(this, 385, 41, textureX, textureY); // Box 348
		southern1102Model[242] = new ModelRendererTurbo(this, 385, 41, textureX, textureY); // Box 349
		southern1102Model[243] = new ModelRendererTurbo(this, 385, 41, textureX, textureY); // Box 350
		southern1102Model[244] = new ModelRendererTurbo(this, 385, 41, textureX, textureY); // Box 351
		southern1102Model[245] = new ModelRendererTurbo(this, 385, 41, textureX, textureY); // Box 352
		southern1102Model[246] = new ModelRendererTurbo(this, 337, 73, textureX, textureY); // Box 353
		southern1102Model[247] = new ModelRendererTurbo(this, 385, 41, textureX, textureY); // Box 354
		southern1102Model[248] = new ModelRendererTurbo(this, 385, 41, textureX, textureY); // Box 355
		southern1102Model[249] = new ModelRendererTurbo(this, 385, 41, textureX, textureY); // Box 356
		southern1102Model[250] = new ModelRendererTurbo(this, 385, 41, textureX, textureY); // Box 357
		southern1102Model[251] = new ModelRendererTurbo(this, 385, 41, textureX, textureY); // Box 358
		southern1102Model[252] = new ModelRendererTurbo(this, 385, 41, textureX, textureY); // Box 359
		southern1102Model[253] = new ModelRendererTurbo(this, 385, 41, textureX, textureY); // Box 360
		southern1102Model[254] = new ModelRendererTurbo(this, 385, 41, textureX, textureY); // Box 361
		southern1102Model[255] = new ModelRendererTurbo(this, 385, 41, textureX, textureY); // Box 362
		southern1102Model[256] = new ModelRendererTurbo(this, 460, 46, textureX, textureY); // Box 363
		southern1102Model[257] = new ModelRendererTurbo(this, 485, 43, textureX, textureY); // Box 367
		southern1102Model[258] = new ModelRendererTurbo(this, 485, 43, textureX, textureY); // Box 368
		southern1102Model[259] = new ModelRendererTurbo(this, 485, 43, textureX, textureY); // Box 369
		southern1102Model[260] = new ModelRendererTurbo(this, 483, 43, textureX, textureY); // Box 370
		southern1102Model[261] = new ModelRendererTurbo(this, 485, 43, textureX, textureY); // Box 371
		southern1102Model[262] = new ModelRendererTurbo(this, 485, 43, textureX, textureY); // Box 372
		southern1102Model[263] = new ModelRendererTurbo(this, 485, 43, textureX, textureY); // Box 373
		southern1102Model[264] = new ModelRendererTurbo(this, 485, 43, textureX, textureY); // Box 376
		southern1102Model[265] = new ModelRendererTurbo(this, 485, 43, textureX, textureY); // Box 377
		southern1102Model[266] = new ModelRendererTurbo(this, 485, 43, textureX, textureY); // Box 378
		southern1102Model[267] = new ModelRendererTurbo(this, 483, 43, textureX, textureY); // Box 379
		southern1102Model[268] = new ModelRendererTurbo(this, 485, 43, textureX, textureY); // Box 380
		southern1102Model[269] = new ModelRendererTurbo(this, 485, 43, textureX, textureY); // Box 381
		southern1102Model[270] = new ModelRendererTurbo(this, 485, 43, textureX, textureY); // Box 382
		southern1102Model[271] = new ModelRendererTurbo(this, 485, 43, textureX, textureY); // Box 403
		southern1102Model[272] = new ModelRendererTurbo(this, 483, 43, textureX, textureY); // Box 404
		southern1102Model[273] = new ModelRendererTurbo(this, 485, 43, textureX, textureY); // Box 405
		southern1102Model[274] = new ModelRendererTurbo(this, 485, 43, textureX, textureY); // Box 406
		southern1102Model[275] = new ModelRendererTurbo(this, 485, 43, textureX, textureY); // Box 407
		southern1102Model[276] = new ModelRendererTurbo(this, 485, 43, textureX, textureY); // Box 408
		southern1102Model[277] = new ModelRendererTurbo(this, 485, 43, textureX, textureY); // Box 409
		southern1102Model[278] = new ModelRendererTurbo(this, 485, 43, textureX, textureY); // Box 410
		southern1102Model[279] = new ModelRendererTurbo(this, 483, 43, textureX, textureY); // Box 411
		southern1102Model[280] = new ModelRendererTurbo(this, 485, 43, textureX, textureY); // Box 412
		southern1102Model[281] = new ModelRendererTurbo(this, 485, 43, textureX, textureY); // Box 413
		southern1102Model[282] = new ModelRendererTurbo(this, 485, 43, textureX, textureY); // Box 414
		southern1102Model[283] = new ModelRendererTurbo(this, 485, 43, textureX, textureY); // Box 415
		southern1102Model[284] = new ModelRendererTurbo(this, 322, 24, textureX, textureY); // Box 429
		southern1102Model[285] = new ModelRendererTurbo(this, 322, 24, textureX, textureY); // Box 431
		southern1102Model[286] = new ModelRendererTurbo(this, 293, 24, textureX, textureY); // Box 432
		southern1102Model[287] = new ModelRendererTurbo(this, 322, 24, textureX, textureY); // Box 408
		southern1102Model[288] = new ModelRendererTurbo(this, 293, 24, textureX, textureY); // Box 409
		southern1102Model[289] = new ModelRendererTurbo(this, 322, 24, textureX, textureY); // Box 410
		southern1102Model[290] = new ModelRendererTurbo(this, 392, 45, textureX, textureY); // Box 411
		southern1102Model[291] = new ModelRendererTurbo(this, 393, 46, textureX, textureY); // Box 412
		southern1102Model[292] = new ModelRendererTurbo(this, 393, 46, textureX, textureY); // Box 415
		southern1102Model[293] = new ModelRendererTurbo(this, 392, 45, textureX, textureY); // Box 416
		southern1102Model[294] = new ModelRendererTurbo(this, 145, 73, textureX, textureY); // Box 417
		southern1102Model[295] = new ModelRendererTurbo(this, 390, 43, textureX, textureY); // Box 419
		southern1102Model[296] = new ModelRendererTurbo(this, 390, 43, textureX, textureY); // Box 421
		southern1102Model[297] = new ModelRendererTurbo(this, 67, 3, textureX, textureY); // Box 422
		southern1102Model[298] = new ModelRendererTurbo(this, 65, 9, textureX, textureY); // Box 424
		southern1102Model[299] = new ModelRendererTurbo(this, 89, 9, textureX, textureY); // Box 426
		southern1102Model[300] = new ModelRendererTurbo(this, 335, 12, textureX, textureY); // Box 427
		southern1102Model[301] = new ModelRendererTurbo(this, 335, 12, textureX, textureY); // Box 428
		southern1102Model[302] = new ModelRendererTurbo(this, 335, 12, textureX, textureY); // Box 429
		southern1102Model[303] = new ModelRendererTurbo(this, 335, 12, textureX, textureY); // Box 430
		southern1102Model[304] = new ModelRendererTurbo(this, 335, 12, textureX, textureY); // Box 431
		southern1102Model[305] = new ModelRendererTurbo(this, 342, 100, textureX, textureY); // Box 432
		southern1102Model[306] = new ModelRendererTurbo(this, 342, 100, textureX, textureY); // Box 433
		southern1102Model[307] = new ModelRendererTurbo(this, 370, 107, textureX, textureY); // Box 434
		southern1102Model[308] = new ModelRendererTurbo(this, 390, 104, textureX, textureY); // Box 435
		southern1102Model[309] = new ModelRendererTurbo(this, 389, 110, textureX, textureY); // Box 436
		southern1102Model[310] = new ModelRendererTurbo(this, 395, 104, textureX, textureY); // Box 437
		southern1102Model[311] = new ModelRendererTurbo(this, 381, 110, textureX, textureY); // Box 438
		southern1102Model[312] = new ModelRendererTurbo(this, 396, 110, textureX, textureY); // Box 439
		southern1102Model[313] = new ModelRendererTurbo(this, 382, 106, textureX, textureY); // Box 440
		southern1102Model[314] = new ModelRendererTurbo(this, 360, 104, textureX, textureY); // Box 441
		southern1102Model[315] = new ModelRendererTurbo(this, 360, 104, textureX, textureY); // Box 442
		southern1102Model[316] = new ModelRendererTurbo(this, 360, 106, textureX, textureY); // Box 443
		southern1102Model[317] = new ModelRendererTurbo(this, 360, 106, textureX, textureY); // Box 444
		southern1102Model[318] = new ModelRendererTurbo(this, 357, 103, textureX, textureY); // Box 445
		southern1102Model[319] = new ModelRendererTurbo(this, 368, 104, textureX, textureY); // Box 446
		southern1102Model[320] = new ModelRendererTurbo(this, 368, 104, textureX, textureY); // Box 447
		southern1102Model[321] = new ModelRendererTurbo(this, 368, 104, textureX, textureY); // Box 449
		southern1102Model[322] = new ModelRendererTurbo(this, 402, 105, textureX, textureY); // Box 450
		southern1102Model[323] = new ModelRendererTurbo(this, 402, 105, textureX, textureY); // Box 451
		southern1102Model[324] = new ModelRendererTurbo(this, 402, 105, textureX, textureY); // Box 452
		southern1102Model[325] = new ModelRendererTurbo(this, 341, 97, textureX, textureY, "lamp"); // Box 453
		southern1102Model[326] = new ModelRendererTurbo(this, 390, 113, textureX, textureY); // Box 454
		southern1102Model[327] = new ModelRendererTurbo(this, 390, 113, textureX, textureY); // Box 455
		southern1102Model[328] = new ModelRendererTurbo(this, 32, 2, textureX, textureY); // Box 439
		southern1102Model[329] = new ModelRendererTurbo(this, 38, 5, textureX, textureY); // Box 446
		southern1102Model[330] = new ModelRendererTurbo(this, 38, 5, textureX, textureY); // Box 447
		southern1102Model[331] = new ModelRendererTurbo(this, 38, 5, textureX, textureY); // Box 450
		southern1102Model[332] = new ModelRendererTurbo(this, 38, 5, textureX, textureY); // Box 452
		southern1102Model[333] = new ModelRendererTurbo(this, 38, 5, textureX, textureY); // Box 453
		southern1102Model[334] = new ModelRendererTurbo(this, 32, 2, textureX, textureY); // Box 454
		southern1102Model[335] = new ModelRendererTurbo(this, 38, 5, textureX, textureY); // Box 455
		southern1102Model[336] = new ModelRendererTurbo(this, 233, 68, textureX, textureY); // Box 468
		southern1102Model[337] = new ModelRendererTurbo(this, 233, 68, textureX, textureY); // Box 469
		southern1102Model[338] = new ModelRendererTurbo(this, 310, 68, textureX, textureY); // Box 470
		southern1102Model[339] = new ModelRendererTurbo(this, 310, 68, textureX, textureY); // Box 471
		southern1102Model[340] = new ModelRendererTurbo(this, 233, 71, textureX, textureY); // Box 474
		southern1102Model[341] = new ModelRendererTurbo(this, 233, 71, textureX, textureY); // Box 476
		southern1102Model[342] = new ModelRendererTurbo(this, 238, 70, textureX, textureY); // Box 478
		southern1102Model[343] = new ModelRendererTurbo(this, 121, 17, textureX, textureY); // Box 479
		southern1102Model[344] = new ModelRendererTurbo(this, 121, 17, textureX, textureY); // Box 480
		southern1102Model[345] = new ModelRendererTurbo(this, 233, 71, textureX, textureY); // Box 481
		southern1102Model[346] = new ModelRendererTurbo(this, 233, 68, textureX, textureY); // Box 482
		southern1102Model[347] = new ModelRendererTurbo(this, 233, 68, textureX, textureY); // Box 483
		southern1102Model[348] = new ModelRendererTurbo(this, 310, 68, textureX, textureY); // Box 484
		southern1102Model[349] = new ModelRendererTurbo(this, 310, 68, textureX, textureY); // Box 485
		southern1102Model[350] = new ModelRendererTurbo(this, 121, 17, textureX, textureY); // Box 486
		southern1102Model[351] = new ModelRendererTurbo(this, 121, 17, textureX, textureY); // Box 487
		southern1102Model[352] = new ModelRendererTurbo(this, 233, 71, textureX, textureY); // Box 488
		southern1102Model[353] = new ModelRendererTurbo(this, 233, 71, textureX, textureY); // Box 489
		southern1102Model[354] = new ModelRendererTurbo(this, 233, 71, textureX, textureY); // Box 490
		southern1102Model[355] = new ModelRendererTurbo(this, 238, 70, textureX, textureY); // Box 491
		southern1102Model[356] = new ModelRendererTurbo(this, 121, 19, textureX, textureY); // Box 492
		southern1102Model[357] = new ModelRendererTurbo(this, 121, 19, textureX, textureY); // Box 493
		southern1102Model[358] = new ModelRendererTurbo(this, 121, 19, textureX, textureY); // Box 494
		southern1102Model[359] = new ModelRendererTurbo(this, 121, 19, textureX, textureY); // Box 495
		southern1102Model[360] = new ModelRendererTurbo(this, 121, 19, textureX, textureY); // Box 496
		southern1102Model[361] = new ModelRendererTurbo(this, 38, 5, textureX, textureY); // Box 497
		southern1102Model[362] = new ModelRendererTurbo(this, 233, 71, textureX, textureY); // Box 495
		southern1102Model[363] = new ModelRendererTurbo(this, 483, 43, textureX, textureY); // Box 496
		southern1102Model[364] = new ModelRendererTurbo(this, 304, 72, textureX, textureY); // Box 497
		southern1102Model[365] = new ModelRendererTurbo(this, 304, 72, textureX, textureY); // Box 498
		southern1102Model[366] = new ModelRendererTurbo(this, 309, 84, textureX, textureY); // Box 499
		southern1102Model[367] = new ModelRendererTurbo(this, 304, 72, textureX, textureY); // Box 500
		southern1102Model[368] = new ModelRendererTurbo(this, 304, 72, textureX, textureY); // Box 501
		southern1102Model[369] = new ModelRendererTurbo(this, 483, 43, textureX, textureY); // Box 502
		southern1102Model[370] = new ModelRendererTurbo(this, 146, 1, textureX, textureY); // Box 498
		southern1102Model[371] = new ModelRendererTurbo(this, 156, 1, textureX, textureY); // Box 499
		southern1102Model[372] = new ModelRendererTurbo(this, 114, 110, textureX, textureY); // Box 519
		southern1102Model[373] = new ModelRendererTurbo(this, 122, 118, textureX, textureY); // Box 520
		southern1102Model[374] = new ModelRendererTurbo(this, 122, 118, textureX, textureY); // Box 521
		southern1102Model[375] = new ModelRendererTurbo(this, 118, 114, textureX, textureY); // Box 522
		southern1102Model[376] = new ModelRendererTurbo(this, 114, 110, textureX, textureY); // Box 523
		southern1102Model[377] = new ModelRendererTurbo(this, 114, 110, textureX, textureY); // Box 524
		southern1102Model[378] = new ModelRendererTurbo(this, 118, 114, textureX, textureY); // Box 525
		southern1102Model[379] = new ModelRendererTurbo(this, 122, 118, textureX, textureY); // Box 526
		southern1102Model[380] = new ModelRendererTurbo(this, 122, 118, textureX, textureY); // Box 527
		southern1102Model[381] = new ModelRendererTurbo(this, 217, 111, textureX, textureY); // Box 528
		southern1102Model[382] = new ModelRendererTurbo(this, 225, 119, textureX, textureY); // Box 529
		southern1102Model[383] = new ModelRendererTurbo(this, 225, 119, textureX, textureY); // Box 530
		southern1102Model[384] = new ModelRendererTurbo(this, 221, 115, textureX, textureY); // Box 531
		southern1102Model[385] = new ModelRendererTurbo(this, 217, 111, textureX, textureY); // Box 532
		southern1102Model[386] = new ModelRendererTurbo(this, 225, 119, textureX, textureY); // Box 533
		southern1102Model[387] = new ModelRendererTurbo(this, 225, 119, textureX, textureY); // Box 534
		southern1102Model[388] = new ModelRendererTurbo(this, 221, 115, textureX, textureY); // Box 535
		southern1102Model[389] = new ModelRendererTurbo(this, 217, 111, textureX, textureY); // Box 536
		southern1102Model[390] = new ModelRendererTurbo(this, 485, 43, textureX, textureY); // Box 537
		southern1102Model[391] = new ModelRendererTurbo(this, 292, 41, textureX, textureY); // Box 496
		southern1102Model[392] = new ModelRendererTurbo(this, 409, 33, textureX, textureY); // Box 497
		southern1102Model[393] = new ModelRendererTurbo(this, 295, 33, textureX, textureY); // Box 498
		southern1102Model[394] = new ModelRendererTurbo(this, 295, 33, textureX, textureY); // Box 499
		southern1102Model[395] = new ModelRendererTurbo(this, 309, 84, textureX, textureY); // Box 505
		southern1102Model[396] = new ModelRendererTurbo(this, 32, 2, textureX, textureY); // Box 500
		southern1102Model[397] = new ModelRendererTurbo(this, 38, 5, textureX, textureY); // Box 501
		southern1102Model[398] = new ModelRendererTurbo(this, 38, 5, textureX, textureY); // Box 502
		southern1102Model[399] = new ModelRendererTurbo(this, 38, 5, textureX, textureY); // Box 503
		southern1102Model[400] = new ModelRendererTurbo(this, 38, 5, textureX, textureY); // Box 504
		southern1102Model[401] = new ModelRendererTurbo(this, 32, 2, textureX, textureY); // Box 505
		southern1102Model[402] = new ModelRendererTurbo(this, 38, 5, textureX, textureY); // Box 506
		southern1102Model[403] = new ModelRendererTurbo(this, 38, 5, textureX, textureY); // Box 507
		southern1102Model[404] = new ModelRendererTurbo(this, 309, 84, textureX, textureY); // Box 438
		southern1102Model[405] = new ModelRendererTurbo(this, 309, 88, textureX, textureY); // Box 440
		southern1102Model[406] = new ModelRendererTurbo(this, 309, 84, textureX, textureY); // Box 441
		southern1102Model[407] = new ModelRendererTurbo(this, 481, 73, textureX, textureY); // Box 443
		southern1102Model[408] = new ModelRendererTurbo(this, 309, 88, textureX, textureY); // Box 446
		southern1102Model[409] = new ModelRendererTurbo(this, 309, 88, textureX, textureY); // Box 447
		southern1102Model[410] = new ModelRendererTurbo(this, 309, 84, textureX, textureY); // Box 448
		southern1102Model[411] = new ModelRendererTurbo(this, 309, 84, textureX, textureY); // Box 449
		southern1102Model[412] = new ModelRendererTurbo(this, 309, 84, textureX, textureY); // Box 450
		southern1102Model[413] = new ModelRendererTurbo(this, 309, 88, textureX, textureY); // Box 451
		southern1102Model[414] = new ModelRendererTurbo(this, 24, 14, textureX, textureY); // Box 452
		southern1102Model[415] = new ModelRendererTurbo(this, 309, 84, textureX, textureY); // Box 444
		southern1102Model[416] = new ModelRendererTurbo(this, 337, 73, textureX, textureY); // Box 445
		southern1102Model[417] = new ModelRendererTurbo(this, 337, 73, textureX, textureY); // Box 446
		southern1102Model[418] = new ModelRendererTurbo(this, 337, 73, textureX, textureY); // Box 447
		southern1102Model[419] = new ModelRendererTurbo(this, 337, 73, textureX, textureY); // Box 449
		southern1102Model[420] = new ModelRendererTurbo(this, 241, 54, textureX, textureY); // Box 438
		southern1102Model[421] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 439
		southern1102Model[422] = new ModelRendererTurbo(this, 169, 33, textureX, textureY); // Box 440
		southern1102Model[423] = new ModelRendererTurbo(this, 169, 33, textureX, textureY); // Box 441
		southern1102Model[424] = new ModelRendererTurbo(this, 335, 12, textureX, textureY); // Box 429
		southern1102Model[425] = new ModelRendererTurbo(this, 335, 12, textureX, textureY); // Box 430
		southern1102Model[426] = new ModelRendererTurbo(this, 335, 12, textureX, textureY); // Box 431
		southern1102Model[427] = new ModelRendererTurbo(this, 335, 12, textureX, textureY); // Box 433
		southern1102Model[428] = new ModelRendererTurbo(this, 335, 12, textureX, textureY); // Box 434
		southern1102Model[429] = new ModelRendererTurbo(this, 335, 12, textureX, textureY); // Box 435
		southern1102Model[430] = new ModelRendererTurbo(this, 194, 111, textureX, textureY, "lamp"); // Box 436
		southern1102Model[431] = new ModelRendererTurbo(this, 194, 111, textureX, textureY, "lamp"); // Box 437
		southern1102Model[432] = new ModelRendererTurbo(this, 302, 7, textureX, textureY); // Box 435
		southern1102Model[433] = new ModelRendererTurbo(this, 276, 16, textureX, textureY); // Box 436
		southern1102Model[434] = new ModelRendererTurbo(this, 276, 35, textureX, textureY); // Box 437
		southern1102Model[435] = new ModelRendererTurbo(this, 289, 7, textureX, textureY); // Box 438
		southern1102Model[436] = new ModelRendererTurbo(this, 263, 7, textureX, textureY); // Box 439
		southern1102Model[437] = new ModelRendererTurbo(this, 276, 7, textureX, textureY); // Box 440
		southern1102Model[438] = new ModelRendererTurbo(this, 276, 26, textureX, textureY); // Box 441
		southern1102Model[439] = new ModelRendererTurbo(this, 392, 45, textureX, textureY); // Box 441
		southern1102Model[440] = new ModelRendererTurbo(this, 393, 46, textureX, textureY); // Box 442
		southern1102Model[441] = new ModelRendererTurbo(this, 393, 46, textureX, textureY); // Box 443
		southern1102Model[442] = new ModelRendererTurbo(this, 390, 43, textureX, textureY); // Box 446
		southern1102Model[443] = new ModelRendererTurbo(this, 390, 43, textureX, textureY); // Box 447
		southern1102Model[444] = new ModelRendererTurbo(this, 396, 40, textureX, textureY); // Box 446
		southern1102Model[445] = new ModelRendererTurbo(this, 396, 40, textureX, textureY); // Box 447

		southern1102Model[0].addBox(0F, 0F, 0F, 11, 11, 0, 0F); // Box 6
		southern1102Model[0].setRotationPoint(-17F, -1F, -5.01F);

		southern1102Model[1].addBox(1F, 0F, 0F, 6, 6, 0, 0F); // Box 10
		southern1102Model[1].setRotationPoint(-69F, 4F, -5.01F);

		southern1102Model[2].addBox(0F, 0F, 0F, 6, 6, 0, 0F); // Box 11
		southern1102Model[2].setRotationPoint(-68F, 4F, 5.01F);

		southern1102Model[3].addShapeBox(0F, 0F, 0F, 1, 20, 16, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25
		southern1102Model[3].setRotationPoint(-9F, -21F, -8F);

		southern1102Model[4].addBox(0F, 0F, 0F, 1, 19, 1, 0F); // Box 26
		southern1102Model[4].setRotationPoint(-9F, -20F, -10F);

		southern1102Model[5].addBox(0F, 0F, 0F, 1, 19, 1, 0F); // Box 22
		southern1102Model[5].setRotationPoint(-9F, -20F, 9F);

		southern1102Model[6].addBox(0F, 0F, 0F, 1, 10, 1, 0F); // Box 23
		southern1102Model[6].setRotationPoint(-9F, -11F, 8F);

		southern1102Model[7].addBox(0F, 0F, 0F, 1, 10, 1, 0F); // Box 24
		southern1102Model[7].setRotationPoint(-9F, -11F, -9F);

		southern1102Model[8].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 25
		southern1102Model[8].setRotationPoint(-9F, -21F, 8F);

		southern1102Model[9].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 26
		southern1102Model[9].setRotationPoint(-9F, -21F, -9F);

		southern1102Model[10].addShapeBox(0F, 0F, 0F, 16, 1, 20, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
		southern1102Model[10].setRotationPoint(-8F, -2F, -10F);

		southern1102Model[11].addShapeBox(0F, 0F, 0F, 15, 9, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 28
		southern1102Model[11].setRotationPoint(-8F, -11F, -10F);

		southern1102Model[12].addShapeBox(0F, 0F, 0F, 15, 9, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 29
		southern1102Model[12].setRotationPoint(-8F, -11F, 9F);

		southern1102Model[13].addBox(0F, 0F, 0F, 18, 2, 1, 0F); // Box 30
		southern1102Model[13].setRotationPoint(-8F, -20F, -10F);

		southern1102Model[14].addBox(0F, 0F, 0F, 18, 2, 1, 0F); // Box 31
		southern1102Model[14].setRotationPoint(-8F, -20F, 9F);

		southern1102Model[15].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, -0.5F, 0.13F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 32
		southern1102Model[15].setRotationPoint(6F, -17F, 9F);

		southern1102Model[16].addBox(0F, 0F, 0F, 2, 7, 1, 0F); // Box 33
		southern1102Model[16].setRotationPoint(4F, -18F, 9F);

		southern1102Model[17].addBox(0F, 0F, 0F, 2, 7, 1, 0F); // Box 34
		southern1102Model[17].setRotationPoint(-8F, -18F, 9F);

		southern1102Model[18].addBox(0F, 0F, 0F, 2, 7, 1, 0F); // Box 35
		southern1102Model[18].setRotationPoint(-2F, -18F, -10F);

		southern1102Model[19].addBox(0F, 0F, 0F, 2, 7, 1, 0F); // Box 36
		southern1102Model[19].setRotationPoint(-8F, -18F, -10F);

		southern1102Model[20].addBox(0F, 0F, 0F, 2, 7, 1, 0F); // Box 37
		southern1102Model[20].setRotationPoint(-2F, -18F, 9F);

		southern1102Model[21].addBox(0F, 0F, 0F, 2, 7, 1, 0F); // Box 38
		southern1102Model[21].setRotationPoint(4F, -18F, -10F);

		southern1102Model[22].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F, 0F, 0F, 0F, -0.5F, 0.13F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39
		southern1102Model[22].setRotationPoint(6F, -17F, -10F);

		southern1102Model[23].addBox(0F, -1F, 0F, 16, 1, 5, 0F); // Box 45
		southern1102Model[23].setRotationPoint(-25F, -1F, 5F);

		southern1102Model[24].addBox(0F, -1F, -6F, 14, 1, 5, 0F); // Box 46
		southern1102Model[24].setRotationPoint(-23F, -1F, -4F);

		southern1102Model[25].addBox(0F, -1F, 0F, 26, 1, 5, 0F); // Box 47
		southern1102Model[25].setRotationPoint(-51F, -4F, 5F);

		southern1102Model[26].addBox(0F, -1F, 0F, 18, 1, 5, 0F); // Box 48
		southern1102Model[26].setRotationPoint(-51F, -4F, -10F);

		southern1102Model[27].addBox(0F, -1F, 0F, 11, 1, 5, 0F); // Box 49
		southern1102Model[27].setRotationPoint(-62F, -1F, -10F);

		southern1102Model[28].addBox(0F, -1F, 0F, 11, 1, 5, 0F); // Box 50
		southern1102Model[28].setRotationPoint(-62F, -1F, 5F);

		southern1102Model[29].addBox(0F, -1F, 0F, 7, 1, 16, 0F); // Box 54
		southern1102Model[29].setRotationPoint(-69F, 4F, -8F);

		southern1102Model[30].addBox(0F, -1F, 0F, 22, 2, 2, 0F); // Box 59
		southern1102Model[30].setRotationPoint(-49F, -3F, 7F);

		southern1102Model[31].addBox(0F, 0F, 0F, 2, 4, 1, 0F); // Box 60
		southern1102Model[31].setRotationPoint(-42F, -20F, -3F);

		southern1102Model[32].addBox(0F, 0F, 0F, 53, 2, 8, 0F); // Box 62
		southern1102Model[32].setRotationPoint(-61F, 2F, -4F);

		southern1102Model[33].addBox(0F, -1F, 0F, 1, 12, 0, 0F); // Box 65
		southern1102Model[33].setRotationPoint(-61F, -5F, -6F);
		southern1102Model[33].rotateAngleY = 3.14159265F;
		southern1102Model[33].rotateAngleZ = 0.61086524F;

		southern1102Model[34].addBox(0F, -1F, 0F, 1, 12, 0, 0F); // Box 66
		southern1102Model[34].setRotationPoint(-61F, -5F, 6F);
		southern1102Model[34].rotateAngleY = 3.14159265F;
		southern1102Model[34].rotateAngleZ = 0.61086524F;

		southern1102Model[35].addBox(0F, 0F, 0F, 21, 7, 1, 0F); // Box 71
		southern1102Model[35].setRotationPoint(11F, -22.65F, -3.63F);
		southern1102Model[35].rotateAngleX = -1.57079633F;
		southern1102Model[35].rotateAngleY = -3.14159265F;

		southern1102Model[36].addBox(0F, 0F, 0F, 13, 5, 14, 0F); // Box 74
		southern1102Model[36].setRotationPoint(-8F, -1F, -7F);
		southern1102Model[36].rotateAngleZ = 0.05235988F;

		southern1102Model[37].addBox(0F, -1F, 0F, 28, 1, 1, 0F); // Box 85
		southern1102Model[37].setRotationPoint(-37F, 7F, -6F);

		southern1102Model[38].addBox(0F, -1F, 0F, 5, 1, 1, 0F); // Box 86
		southern1102Model[38].setRotationPoint(-53F, 5F, -7F);

		southern1102Model[39].addBox(0F, -1F, 0F, 23, 1, 1, 0F); // Box 87
		southern1102Model[39].setRotationPoint(-47F, 4.84F, -7F);
		southern1102Model[39].rotateAngleZ = -0.09075712F;

		southern1102Model[40].addBox(0F, -1F, 0F, 7, 1, 1, 0F); // Box 88
		southern1102Model[40].setRotationPoint(-53F, 6.4F, -8F);

		southern1102Model[41].addBox(0F, -1F, 0F, 7, 1, 1, 0F); // Box 89
		southern1102Model[41].setRotationPoint(-53F, 3.4F, -8F);

		southern1102Model[42].addBox(0F, -1F, 0F, 1, 3, 1, 0F); // Box 90
		southern1102Model[42].setRotationPoint(-48F, 4F, -7F);

		southern1102Model[43].addBox(0F, -1F, 0F, 7, 1, 1, 0F); // Box 91
		southern1102Model[43].setRotationPoint(-53F, 3.4F, 7F);

		southern1102Model[44].addBox(0F, -1F, 0F, 7, 1, 1, 0F); // Box 92
		southern1102Model[44].setRotationPoint(-53F, 6.4F, 7F);

		southern1102Model[45].addBox(0F, 0F, 0F, 26, 1, 1, 0F); // Box 93
		southern1102Model[45].setRotationPoint(-40F, 2F, 5F);

		southern1102Model[46].addBox(0F, -1F, 0F, 23, 1, 1, 0F); // Box 94
		southern1102Model[46].setRotationPoint(-51F, 4.84F, 6F);
		southern1102Model[46].rotateAngleZ = 0.07853982F;

		southern1102Model[47].addBox(0F, -1F, 0F, 6, 1, 1, 0F); // Box 95
		southern1102Model[47].setRotationPoint(-58F, 5F, 6F);

		southern1102Model[48].addBox(0F, -1F, 0F, 1, 3, 1, 0F); // Box 96
		southern1102Model[48].setRotationPoint(-52F, 4F, 6F);

		southern1102Model[49].addBox(0F, -1F, 0F, 1, 4, 1, 0F); // Box 97
		southern1102Model[49].setRotationPoint(-69F, 5F, -6.75F);

		southern1102Model[50].addBox(0F, -1F, 0F, 1, 4, 1, 0F); // Box 100
		southern1102Model[50].setRotationPoint(-69F, 5F, 5.75F);

		southern1102Model[51].addBox(-1F, -1F, 0F, 4, 1, 2, 0F); // Box 104
		southern1102Model[51].setRotationPoint(-71F, 6F, -1F);

		southern1102Model[52].addBox(0F, 0F, 0F, 2, 2, 4, 0F); // Box 105
		southern1102Model[52].setRotationPoint(-13F, -19.5F, -2F);

		southern1102Model[53].addBox(0F, 0F, 0F, 0, 1, 1, 0F); // Box 106
		southern1102Model[53].setRotationPoint(-13F, -17.5F, -2F);

		southern1102Model[54].addBox(0F, 0F, 0F, 0, 1, 1, 0F); // Box 107
		southern1102Model[54].setRotationPoint(-13F, -17.5F, 1F);

		southern1102Model[55].addBox(0F, 0F, 0F, 0, 1, 1, 0F); // Box 108
		southern1102Model[55].setRotationPoint(-11F, -17.5F, 1F);

		southern1102Model[56].addBox(0F, 0F, 0F, 0, 1, 1, 0F); // Box 109
		southern1102Model[56].setRotationPoint(-11F, -17.5F, -2F);

		southern1102Model[57].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 110
		southern1102Model[57].setRotationPoint(-13F, -20.5F, -2F);

		southern1102Model[58].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 111
		southern1102Model[58].setRotationPoint(-19F, -19F, 0F);

		southern1102Model[59].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 114
		southern1102Model[59].setRotationPoint(-51F, -20F, -0.5F);

		southern1102Model[60].addBox(0F, -1F, 0F, 1, 5, 1, 0F); // Box 118
		southern1102Model[60].setRotationPoint(-47F, -1.6F, 7F);

		southern1102Model[61].addBox(0F, -1F, 0F, 1, 5, 1, 0F); // Box 119
		southern1102Model[61].setRotationPoint(-47F, -1.6F, -8F);

		southern1102Model[62].addBox(0F, -1F, 0F, 1, 1, 14, 0F); // Box 120
		southern1102Model[62].setRotationPoint(-47F, -1.6F, -7F);

		southern1102Model[63].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 127
		southern1102Model[63].setRotationPoint(-63.01F, -14.45F, -7.45F);

		southern1102Model[64].addBox(0F, 0F, 0F, 11, 5, 15, 0F); // Box 132
		southern1102Model[64].setRotationPoint(-20F, -7F, -7.5F);

		southern1102Model[65].addBox(0F, -1F, 0F, 14, 2, 2, 0F); // Box 133
		southern1102Model[65].setRotationPoint(-50F, -3F, -9F);

		southern1102Model[66].addBox(0F, 0F, 0F, 12, 4, 8, 0F); // Box 132
		southern1102Model[66].setRotationPoint(-20F, -2F, -4F);

		southern1102Model[67].addBox(0F, 0F, 0F, 8, 6, 8, 0F); // Box 133
		southern1102Model[67].setRotationPoint(-61.5F, -4F, -4F);

		southern1102Model[68].addBox(0F, -1F, 0F, 8, 2, 2, 0F); // Box 135
		southern1102Model[68].setRotationPoint(-24F, 0F, 7F);

		southern1102Model[69].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 131
		southern1102Model[69].setRotationPoint(-12.4F, -21.33F, -2F);
		southern1102Model[69].rotateAngleZ = -0.62831853F;

		southern1102Model[70].addShapeBox(0F, 0F, 0F, 26, 2, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 1.5F, 0F, 0.5F, 1.5F, 0F, 0.5F, 1.5F, 0F, 0.5F, 1.5F); // Box 196
		southern1102Model[70].setRotationPoint(-64F, -15F, -5F);

		southern1102Model[71].addShapeBox(0F, 0F, 0F, 26, 2, 14, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 199
		southern1102Model[71].setRotationPoint(-64F, -12.5F, -7F);

		southern1102Model[72].addShapeBox(0F, 0F, 0F, 26, 2, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 197
		southern1102Model[72].setRotationPoint(-64F, -8.5F, -7F);

		southern1102Model[73].addShapeBox(0F, 0F, 0F, 26, 2, 10, 0F, 0F, 0.5F, 1.5F, 0F, 0.5F, 1.5F, 0F, 0.5F, 1.5F, 0F, 0.5F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 196
		southern1102Model[73].setRotationPoint(-64F, -6F, -5F);

		southern1102Model[74].addShapeBox(0F, -1F, 0F, 26, 2, 6, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 198
		southern1102Model[74].setRotationPoint(-64F, -3F, -3F);

		southern1102Model[75].addShapeBox(0F, 0F, 0F, 26, 2, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -2.5F, 0F, -1.5F, -2.5F, 0F, -1.5F, -2.5F, 0F, -1.5F, -2.5F); // Box 200
		southern1102Model[75].setRotationPoint(-64F, -3F, -3F);

		southern1102Model[76].addShapeBox(0F, 0F, 0F, 26, 2, 6, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 197
		southern1102Model[76].setRotationPoint(-64F, -17F, -3F);

		southern1102Model[77].addShapeBox(0F, 0F, 0F, 26, 2, 6, 0F, 0F, -1.5F, -2.5F, 0F, -1.5F, -2.5F, 0F, -1.5F, -2.5F, 0F, -1.5F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 198
		southern1102Model[77].setRotationPoint(-64F, -18F, -3F);

		southern1102Model[78].addShapeBox(0F, 0F, 0F, 26, 2, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 191
		southern1102Model[78].setRotationPoint(-64F, -10.5F, -7F);

		southern1102Model[79].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 194
		southern1102Model[79].setRotationPoint(-17.5F, -18.4F, -1.5F);

		southern1102Model[80].addBox(0F, 0F, 0F, 2, 4, 1, 0F); // Box 195
		southern1102Model[80].setRotationPoint(-42F, -20F, 2F);

		southern1102Model[81].addBox(0F, 0F, 0F, 1, 4, 2, 0F); // Box 196
		southern1102Model[81].setRotationPoint(-39F, -20F, -1F);

		southern1102Model[82].addBox(0F, 0F, 0F, 1, 4, 2, 0F); // Box 197
		southern1102Model[82].setRotationPoint(-44F, -20F, -1F);

		southern1102Model[83].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 1F); // Box 198
		southern1102Model[83].setRotationPoint(-44F, -20F, -3F);

		southern1102Model[84].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 199
		southern1102Model[84].setRotationPoint(-42F, -21F, -3F);

		southern1102Model[85].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -1F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 1F); // Box 200
		southern1102Model[85].setRotationPoint(-44F, -21F, -3F);

		southern1102Model[86].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F, 1F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 201
		southern1102Model[86].setRotationPoint(-39F, -20F, -3F);

		southern1102Model[87].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 1F, 0F, -1F, -2F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 202
		southern1102Model[87].setRotationPoint(-39F, -21F, -3F);

		southern1102Model[88].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 203
		southern1102Model[88].setRotationPoint(-44F, -21F, -1F);

		southern1102Model[89].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 204
		southern1102Model[89].setRotationPoint(-44F, -20F, 2F);

		southern1102Model[90].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -2F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 205
		southern1102Model[90].setRotationPoint(-44F, -21F, 2F);

		southern1102Model[91].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 206
		southern1102Model[91].setRotationPoint(-42F, -21F, 2F);

		southern1102Model[92].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 207
		southern1102Model[92].setRotationPoint(-39F, -21F, -1F);

		southern1102Model[93].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, -1F); // Box 208
		southern1102Model[93].setRotationPoint(-39F, -20F, 1F);

		southern1102Model[94].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, -1F, 1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, -1F); // Box 209
		southern1102Model[94].setRotationPoint(-39F, -21F, 1F);

		southern1102Model[95].addBox(0F, 0F, 0F, 2, 5, 1, 0F); // Box 212
		southern1102Model[95].setRotationPoint(-28F, -21F, -3F);

		southern1102Model[96].addBox(0F, 0F, 0F, 1, 4, 2, 0F); // Box 213
		southern1102Model[96].setRotationPoint(-30F, -21F, -1F);

		southern1102Model[97].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 1F); // Box 214
		southern1102Model[97].setRotationPoint(-30F, -21F, -3F);

		southern1102Model[98].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 215
		southern1102Model[98].setRotationPoint(-30F, -21F, 2F);

		southern1102Model[99].addShapeBox(0F, 0F, 0F, 1, 5, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, -1F); // Box 216
		southern1102Model[99].setRotationPoint(-25F, -21F, 1F);

		southern1102Model[100].addBox(0F, 0F, 0F, 2, 5, 1, 0F); // Box 217
		southern1102Model[100].setRotationPoint(-28F, -21F, 2F);

		southern1102Model[101].addShapeBox(0F, 0F, 0F, 1, 5, 2, 0F, 1F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 218
		southern1102Model[101].setRotationPoint(-25F, -21F, -3F);

		southern1102Model[102].addBox(0F, 0F, 0F, 1, 4, 2, 0F); // Box 219
		southern1102Model[102].setRotationPoint(-25F, -21F, -1F);

		southern1102Model[103].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 1F, 0F, -1F, -2F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 220
		southern1102Model[103].setRotationPoint(-25F, -22F, -3F);

		southern1102Model[104].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 221
		southern1102Model[104].setRotationPoint(-28F, -22F, -3F);

		southern1102Model[105].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -1F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 1F); // Box 222
		southern1102Model[105].setRotationPoint(-30F, -22F, -3F);

		southern1102Model[106].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 223
		southern1102Model[106].setRotationPoint(-30F, -22F, -1F);

		southern1102Model[107].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -2F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 224
		southern1102Model[107].setRotationPoint(-30F, -22F, 2F);

		southern1102Model[108].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 225
		southern1102Model[108].setRotationPoint(-28F, -22F, 2F);

		southern1102Model[109].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, -1F, 1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, -1F); // Box 226
		southern1102Model[109].setRotationPoint(-25F, -22F, 1F);

		southern1102Model[110].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 227
		southern1102Model[110].setRotationPoint(-25F, -22F, -1F);

		southern1102Model[111].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 228
		southern1102Model[111].setRotationPoint(-43F, -21F, -1F);

		southern1102Model[112].addBox(0F, 0F, 0F, 2, 1, 4, 0F); // Box 229
		southern1102Model[112].setRotationPoint(-42F, -21F, -2F);

		southern1102Model[113].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 230
		southern1102Model[113].setRotationPoint(-40F, -21F, -1F);

		southern1102Model[114].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 231
		southern1102Model[114].setRotationPoint(-29F, -22F, -1F);

		southern1102Model[115].addBox(0F, 0F, 0F, 2, 1, 4, 0F); // Box 232
		southern1102Model[115].setRotationPoint(-28F, -22F, -2F);

		southern1102Model[116].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 233
		southern1102Model[116].setRotationPoint(-26F, -22F, -1F);

		southern1102Model[117].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 235
		southern1102Model[117].setRotationPoint(-50F, -20F, 0.5F);

		southern1102Model[118].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 236
		southern1102Model[118].setRotationPoint(-50F, -20F, -1.5F);

		southern1102Model[119].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 237
		southern1102Model[119].setRotationPoint(-49F, -20F, -0.5F);

		southern1102Model[120].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 238
		southern1102Model[120].setRotationPoint(-51F, -21F, -0.5F);

		southern1102Model[121].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 239
		southern1102Model[121].setRotationPoint(-49F, -21F, -0.5F);

		southern1102Model[122].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 240
		southern1102Model[122].setRotationPoint(-50F, -21F, -1.5F);

		southern1102Model[123].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 241
		southern1102Model[123].setRotationPoint(-51F, -20F, -1.5F);

		southern1102Model[124].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 242
		southern1102Model[124].setRotationPoint(-51F, -21F, -1.5F);

		southern1102Model[125].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 243
		southern1102Model[125].setRotationPoint(-49F, -21F, -1.5F);

		southern1102Model[126].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 244
		southern1102Model[126].setRotationPoint(-49F, -20F, -1.5F);

		southern1102Model[127].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 245
		southern1102Model[127].setRotationPoint(-49F, -20F, 0.5F);

		southern1102Model[128].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 246
		southern1102Model[128].setRotationPoint(-51F, -20F, 0.5F);

		southern1102Model[129].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 247
		southern1102Model[129].setRotationPoint(-49F, -21F, 0.5F);

		southern1102Model[130].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 248
		southern1102Model[130].setRotationPoint(-51F, -21F, 0.5F);

		southern1102Model[131].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 249
		southern1102Model[131].setRotationPoint(-50F, -21F, 0.5F);

		southern1102Model[132].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 250
		southern1102Model[132].setRotationPoint(-51.5F, -19F, -1F);

		southern1102Model[133].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 252
		southern1102Model[133].setRotationPoint(-51.5F, -19F, -2F);

		southern1102Model[134].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 253
		southern1102Model[134].setRotationPoint(-51.5F, -19F, 1F);

		southern1102Model[135].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 254
		southern1102Model[135].setRotationPoint(-48.5F, -19F, 1F);

		southern1102Model[136].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 256
		southern1102Model[136].setRotationPoint(-48.5F, -19F, -1F);

		southern1102Model[137].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 257
		southern1102Model[137].setRotationPoint(-48.5F, -19F, -2F);

		southern1102Model[138].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 258
		southern1102Model[138].setRotationPoint(-50.5F, -19F, -1F);
		southern1102Model[138].rotateAngleY = -1.57079633F;

		southern1102Model[139].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 259
		southern1102Model[139].setRotationPoint(-50.5F, -19F, 2F);
		southern1102Model[139].rotateAngleY = -1.57079633F;

		southern1102Model[140].addShapeBox(0F, 0F, 0F, 14, 1, 1, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 250
		southern1102Model[140].setRotationPoint(-50F, -4.5F, -10.4F);

		southern1102Model[141].addShapeBox(0F, 0F, 0F, 14, 1, 1, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 251
		southern1102Model[141].setRotationPoint(-50F, -3.5F, -10.4F);

		southern1102Model[142].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 252
		southern1102Model[142].setRotationPoint(-51F, -4F, -10.4F);

		southern1102Model[143].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 254
		southern1102Model[143].setRotationPoint(-51F, -4F, -9.9F);

		southern1102Model[144].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, -0.5F, -0.5F, -1F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 256
		southern1102Model[144].setRotationPoint(-37F, -4F, -10.4F);

		southern1102Model[145].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 257
		southern1102Model[145].setRotationPoint(-36F, -4F, -9.9F);

		southern1102Model[146].addBox(0F, 0F, 0F, 1, 8, 2, 0F); // Box 272
		southern1102Model[146].setRotationPoint(-60F, -23F, -1F);

		southern1102Model[147].addBox(0F, 0F, 0F, 1, 8, 2, 0F); // Box 273
		southern1102Model[147].setRotationPoint(-57F, -23F, -1F);

		southern1102Model[148].addBox(0F, 0F, 0F, 2, 8, 1, 0F); // Box 275
		southern1102Model[148].setRotationPoint(-59F, -23F, -2F);

		southern1102Model[149].addBox(0F, 0F, 0F, 2, 8, 1, 0F); // Box 276
		southern1102Model[149].setRotationPoint(-59F, -23F, 1F);

		southern1102Model[150].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 277
		southern1102Model[150].setRotationPoint(-60F, -23F, -2F);

		southern1102Model[151].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 278
		southern1102Model[151].setRotationPoint(-60F, -23F, 1F);

		southern1102Model[152].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 279
		southern1102Model[152].setRotationPoint(-57F, -23F, 1F);

		southern1102Model[153].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 280
		southern1102Model[153].setRotationPoint(-57F, -23F, -2F);

		southern1102Model[154].addShapeBox(0F, 0F, 0F, 16, 1, 1, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 292
		southern1102Model[154].setRotationPoint(-25F, -3F, -9.4F);

		southern1102Model[155].addShapeBox(0F, 0F, 0F, 27, 1, 1, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 295
		southern1102Model[155].setRotationPoint(-36F, -10.5F, -9.4F);

		southern1102Model[156].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 296
		southern1102Model[156].setRotationPoint(-36F, -10F, -9.4F);

		southern1102Model[157].addShapeBox(0F, 0F, 0F, 22, 1, 1, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 303
		southern1102Model[157].setRotationPoint(-49F, -4.5F, 8.6F);

		southern1102Model[158].addShapeBox(0F, 0F, 0F, 22, 1, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 305
		southern1102Model[158].setRotationPoint(-49F, -3F, 8.6F);

		southern1102Model[159].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 314
		southern1102Model[159].setRotationPoint(-26F, -5F, -9F);

		southern1102Model[160].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, -1F, -0.5F, -0.5F, -1F, -0.5F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 325
		southern1102Model[160].setRotationPoint(-25F, -6F, -8.5F);

		southern1102Model[161].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, -1F, -0.5F, -0.5F, -1F, -0.5F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 326
		southern1102Model[161].setRotationPoint(-26.5F, -6F, -8.5F);

		southern1102Model[162].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, -1F, -0.5F, -0.5F, -1F, -0.5F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 327
		southern1102Model[162].setRotationPoint(-25F, -6F, -10F);

		southern1102Model[163].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, -1F, -0.5F, -0.5F, -1F, -0.5F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 328
		southern1102Model[163].setRotationPoint(-26.5F, -6F, -10F);

		southern1102Model[164].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 332
		southern1102Model[164].setRotationPoint(-50F, -4F, 8.6F);

		southern1102Model[165].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -1F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -1F); // Box 334
		southern1102Model[165].setRotationPoint(-50.5F, -4F, 7.1F);

		southern1102Model[166].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 335
		southern1102Model[166].setRotationPoint(-28F, -4F, 8.6F);

		southern1102Model[167].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 336
		southern1102Model[167].setRotationPoint(-51.5F, -7.5F, 6.9F);

		southern1102Model[168].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 337
		southern1102Model[168].setRotationPoint(-51.75F, -8F, 6.9F);

		southern1102Model[169].addShapeBox(0F, 0F, 0F, 40, 1, 1, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 327
		southern1102Model[169].setRotationPoint(-51.5F, -6F, 6.9F);

		southern1102Model[170].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 328
		southern1102Model[170].setRotationPoint(-27F, -4F, 6.1F);

		southern1102Model[171].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, -0.5F, -0.5F, -0.5F, -1F, -0.5F, -0.5F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 333
		southern1102Model[171].setRotationPoint(-26.5F, -4F, 6.6F);

		southern1102Model[172].addShapeBox(0F, 2F, 0F, 4, 1, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 334
		southern1102Model[172].setRotationPoint(-26.5F, -2F, 6.59999999999999F);

		southern1102Model[173].addShapeBox(0F, 0F, 0F, 16, 1, 1, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 335
		southern1102Model[173].setRotationPoint(-16F, 0F, 7.59999999999999F);

		southern1102Model[174].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 339
		southern1102Model[174].setRotationPoint(-12F, -13F, 8.1F);

		southern1102Model[175].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 340
		southern1102Model[175].setRotationPoint(-12F, -10.5F, 7.6F);

		southern1102Model[176].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 341
		southern1102Model[176].setRotationPoint(-12F, -14F, 5.6F);

		southern1102Model[177].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 342
		southern1102Model[177].setRotationPoint(-12F, -9F, 7.6F);

		southern1102Model[178].addBox(0F, 0F, 0F, 3, 4, 2, 0F); // Box 356
		southern1102Model[178].setRotationPoint(-67F, -20F, -1F);

		southern1102Model[179].addBox(0F, 0F, 0F, 3, 2, 1, 0F); // Box 357
		southern1102Model[179].setRotationPoint(-67F, -19F, -2F);

		southern1102Model[180].addBox(0F, 0F, 0F, 3, 2, 1, 0F); // Box 359
		southern1102Model[180].setRotationPoint(-67F, -19F, 1F);

		southern1102Model[181].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 361
		southern1102Model[181].setRotationPoint(-67F, -20F, -2F);

		southern1102Model[182].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 362
		southern1102Model[182].setRotationPoint(-67F, -20F, 1F);

		southern1102Model[183].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 363
		southern1102Model[183].setRotationPoint(-67F, -17F, 1F);

		southern1102Model[184].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 364
		southern1102Model[184].setRotationPoint(-67F, -17F, -2F);

		southern1102Model[185].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 365
		southern1102Model[185].setRotationPoint(-59F, -23F, -1F);

		southern1102Model[186].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 366
		southern1102Model[186].setRotationPoint(-50F, -4F, 6.6F);

		southern1102Model[187].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 367
		southern1102Model[187].setRotationPoint(-67F, -16.5F, -1.9F);

		southern1102Model[188].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 368
		southern1102Model[188].setRotationPoint(-67F, -16.5F, 0.399999999999999F);

		southern1102Model[189].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, -1F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 360
		southern1102Model[189].setRotationPoint(-68F, -20F, -1F);

		southern1102Model[190].addShapeBox(0F, 0F, 0F, 1, 10, 1, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 362
		southern1102Model[190].setRotationPoint(5F, -13.5F, 9.5F);

		southern1102Model[191].addShapeBox(0F, 0F, 0F, 1, 10, 1, 0F, 0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 365
		southern1102Model[191].setRotationPoint(5F, -13.5F, -10.5F);

		southern1102Model[192].addBox(0F, -1F, 0F, 0, 3, 3, 0F); // Box 396
		southern1102Model[192].setRotationPoint(-64.02F, -10F, -1.5F);

		southern1102Model[193].addShapeBox(0F, -1F, 0F, 1, 1, 1, 0F, 0F, -0.2F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, -0.2F); // Box 405
		southern1102Model[193].setRotationPoint(-64.3F, -11F, -5F);

		southern1102Model[194].addShapeBox(0F, -1F, 0F, 1, 1, 1, 0F, 0F, -0.2F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, -0.2F); // Box 378
		southern1102Model[194].setRotationPoint(-64.3F, -7F, -5F);

		southern1102Model[195].addShapeBox(0F, -1F, 0F, 1, 1, 1, 0F, 0F, -0.2F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, -0.2F); // Box 379
		southern1102Model[195].setRotationPoint(-64.3F, -5F, -3F);

		southern1102Model[196].addShapeBox(0F, -1F, 0F, 1, 1, 1, 0F, 0F, -0.2F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, -0.2F); // Box 380
		southern1102Model[196].setRotationPoint(-64.3F, -5F, 2F);

		southern1102Model[197].addShapeBox(0F, -1F, 0F, 1, 1, 1, 0F, 0F, -0.2F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, -0.2F); // Box 381
		southern1102Model[197].setRotationPoint(-64.3F, -7F, 4F);

		southern1102Model[198].addShapeBox(0F, -1F, 0F, 1, 1, 1, 0F, 0F, -0.2F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, -0.2F); // Box 382
		southern1102Model[198].setRotationPoint(-64.3F, -11F, 4F);

		southern1102Model[199].addShapeBox(0F, -1F, 0F, 1, 1, 1, 0F, 0F, -0.2F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, -0.2F); // Box 383
		southern1102Model[199].setRotationPoint(-64.3F, -13F, 2F);

		southern1102Model[200].addShapeBox(0F, -1F, 0F, 1, 1, 1, 0F, 0F, -0.2F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, -0.2F); // Box 384
		southern1102Model[200].setRotationPoint(-64.3F, -13F, -3F);

		southern1102Model[201].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 396
		southern1102Model[201].setRotationPoint(-66F, -16.7F, -1.75F);

		southern1102Model[202].addBox(0F, -1F, 0F, 0, 7, 4, 0F); // Box 390
		southern1102Model[202].setRotationPoint(-64.01F, -12F, -2F);

		southern1102Model[203].addBox(0F, -1F, 0F, 0, 3, 2, 0F); // Box 391
		southern1102Model[203].setRotationPoint(-64.01F, -10F, 2F);

		southern1102Model[204].addBox(0F, -1F, 0F, 0, 3, 2, 0F); // Box 397
		southern1102Model[204].setRotationPoint(-64.01F, -10F, -4F);

		southern1102Model[205].addShapeBox(0F, -1F, 0F, 0, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 398
		southern1102Model[205].setRotationPoint(-64.01F, -12F, 2F);

		southern1102Model[206].addShapeBox(0F, -1F, 0F, 0, 2, 2, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 401
		southern1102Model[206].setRotationPoint(-64.01F, -12F, -4F);

		southern1102Model[207].addShapeBox(0F, -1F, 0F, 0, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 402
		southern1102Model[207].setRotationPoint(-64.01F, -7F, -4F);

		southern1102Model[208].addShapeBox(0F, -1F, 0F, 0, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 403
		southern1102Model[208].setRotationPoint(-64.01F, -7F, 2F);

		southern1102Model[209].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 404
		southern1102Model[209].setRotationPoint(-64.1F, -11F, -5.5F);

		southern1102Model[210].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 405
		southern1102Model[210].setRotationPoint(-64.1F, -9.5F, -5.5F);

		southern1102Model[211].addShapeBox(0F, -1F, 0F, 1, 1, 1, 0F, 0F, -0.2F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, -0.2F); // Box 409
		southern1102Model[211].setRotationPoint(-64.3F, -4.5F, -0.5F);

		southern1102Model[212].addShapeBox(0F, -1F, 0F, 1, 1, 1, 0F, 0F, -0.2F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, -0.2F); // Box 411
		southern1102Model[212].setRotationPoint(-64.3F, -13.5F, -0.5F);

		southern1102Model[213].addBox(0F, 0F, 0F, 11, 11, 0, 0F); // Box 402
		southern1102Model[213].setRotationPoint(-31F, -1F, -5.01F);

		southern1102Model[214].addBox(0F, 0F, 0F, 11, 11, 0, 0F); // Box 403
		southern1102Model[214].setRotationPoint(-44F, -1F, -5.01F);

		southern1102Model[215].addBox(0F, 0F, 0F, 11, 11, 0, 0F); // Box 406
		southern1102Model[215].setRotationPoint(-44F, -1F, 5.01F);

		southern1102Model[216].addBox(0F, 0F, 0F, 11, 11, 0, 0F); // Box 407
		southern1102Model[216].setRotationPoint(-31F, -1F, 5.01F);

		southern1102Model[217].addBox(0F, 0F, 0F, 11, 11, 0, 0F); // Box 408
		southern1102Model[217].setRotationPoint(-17F, -1F, 5.01F);

		southern1102Model[218].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 333
		southern1102Model[218].setRotationPoint(-9F, -21F, -10F);

		southern1102Model[219].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 335
		southern1102Model[219].setRotationPoint(-9F, -21F, 9F);

		southern1102Model[220].addBox(0F, 0F, 0F, 1, 1, 10, 0F); // Box 331
		southern1102Model[220].setRotationPoint(-38F, 4F, -5F);

		southern1102Model[221].addBox(0F, 0F, 0F, 1, 1, 10, 0F); // Box 332
		southern1102Model[221].setRotationPoint(-26F, 4F, -5F);

		southern1102Model[222].addBox(0F, 0F, 0F, 1, 1, 10, 0F); // Box 333
		southern1102Model[222].setRotationPoint(-12F, 4F, -5F);

		southern1102Model[223].addShapeBox(0F, 0F, 0F, 25, 1, 1, 0F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 334
		southern1102Model[223].setRotationPoint(-63F, -14.5F, -7.5F);

		southern1102Model[224].addShapeBox(0F, 0F, 0F, 1, 1, 14, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 335
		southern1102Model[224].setRotationPoint(-62.5F, 1F, -7F);

		southern1102Model[225].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 338
		southern1102Model[225].setRotationPoint(-62.5F, 1.5F, 6F);

		southern1102Model[226].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 339
		southern1102Model[226].setRotationPoint(-62.5F, 1.5F, -7.5F);

		southern1102Model[227].addShapeBox(0F, 0F, 0F, 1, 1, 13, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 340
		southern1102Model[227].setRotationPoint(-62.5F, 1.7F, -6.5F);

		southern1102Model[228].addBox(0F, 0F, 0F, 1, 1, 10, 0F); // Box 338
		southern1102Model[228].setRotationPoint(-65.5F, 6.5F, -5F);

		southern1102Model[229].addShapeBox(0F, 0F, 0F, 21, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.12F, -0.01F, 0F, -0.12F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F); // Box 341
		southern1102Model[229].setRotationPoint(11F, -22.65F, 3.37F);
		southern1102Model[229].rotateAngleX = -1.44862328F;
		southern1102Model[229].rotateAngleY = -3.14159265F;

		southern1102Model[230].addShapeBox(0F, 0F, 0F, 21, 3, 1, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.33F, -0.07F, 0F, -0.33F, -0.07F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F); // Box 343
		southern1102Model[230].setRotationPoint(11F, -22.29F, 6.34F);
		southern1102Model[230].rotateAngleX = -1.11701072F;
		southern1102Model[230].rotateAngleY = -3.14159265F;

		southern1102Model[231].addShapeBox(0F, 0F, 0F, 21, 3, 1, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.33F, -0.06F, 0F, -0.33F, -0.06F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F); // Box 345
		southern1102Model[231].setRotationPoint(11F, -20.98F, 9.03F);
		southern1102Model[231].rotateAngleX = -0.78539816F;
		southern1102Model[231].rotateAngleY = -3.14159265F;

		southern1102Model[232].addShapeBox(0F, 0F, 0F, 21, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.12F, -0.01F, 0F, -0.12F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F); // Box 341
		southern1102Model[232].setRotationPoint(-10F, -22.65F, -3.63F);
		southern1102Model[232].rotateAngleX = -1.44862328F;

		southern1102Model[233].addShapeBox(0F, 0F, 0F, 21, 3, 1, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.33F, -0.07F, 0F, -0.33F, -0.07F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F); // Box 342
		southern1102Model[233].setRotationPoint(-10F, -22.29F, -6.6F);
		southern1102Model[233].rotateAngleX = -1.11701072F;

		southern1102Model[234].addShapeBox(0F, 0F, 0F, 21, 3, 1, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.33F, -0.06F, 0F, -0.33F, -0.06F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F); // Box 343
		southern1102Model[234].setRotationPoint(-10F, -20.98F, -9.29F);
		southern1102Model[234].rotateAngleX = -0.78539816F;

		southern1102Model[235].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 342
		southern1102Model[235].setRotationPoint(-57F, 4F, -1F);

		southern1102Model[236].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 343
		southern1102Model[236].setRotationPoint(-50.51F, -14.45F, -7.45F);

		southern1102Model[237].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 344
		southern1102Model[237].setRotationPoint(-38.51F, -14.45F, -7.45F);

		southern1102Model[238].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 345
		southern1102Model[238].setRotationPoint(-26.51F, -14.45F, -8.45F);

		southern1102Model[239].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 346
		southern1102Model[239].setRotationPoint(-14.51F, -14.45F, -8.45F);

		southern1102Model[240].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, -0.6F, -0.5F, -0.7F, -0.6F, -0.5F, -0.7F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.1F, -0.5F, -0.7F, -0.1F, -0.5F, -0.7F, -0.1F, 0F, 0F, -0.1F, 0F); // Box 347
		southern1102Model[240].setRotationPoint(-62.93F, -14.45F, -7.4F);

		southern1102Model[241].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, -0.6F, -0.5F, -0.7F, -0.6F, -0.5F, -0.7F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.1F, -0.5F, -0.7F, -0.1F, -0.5F, -0.7F, -0.1F, 0F, 0F, -0.1F, 0F); // Box 348
		southern1102Model[241].setRotationPoint(-50.41F, -14.45F, -7.4F);

		southern1102Model[242].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, -0.6F, -0.5F, -0.7F, -0.6F, -0.5F, -0.7F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.1F, -0.5F, -0.7F, -0.1F, -0.5F, -0.7F, -0.1F, 0F, 0F, -0.1F, 0F); // Box 349
		southern1102Model[242].setRotationPoint(-38.41F, -14.45F, -7.4F);

		southern1102Model[243].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, -0.6F, -0.5F, -0.7F, -0.6F, -0.5F, -0.7F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.1F, -0.5F, -0.7F, -0.1F, -0.5F, -0.7F, -0.1F, 0F, 0F, -0.1F, 0F); // Box 350
		southern1102Model[243].setRotationPoint(-26.41F, -14.45F, -8.4F);

		southern1102Model[244].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, -0.6F, -0.5F, -0.7F, -0.6F, -0.5F, -0.7F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.1F, -0.5F, -0.7F, -0.1F, -0.5F, -0.7F, -0.1F, 0F, 0F, -0.1F, 0F); // Box 351
		southern1102Model[244].setRotationPoint(-14.41F, -14.45F, -8.4F);

		southern1102Model[245].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 352
		southern1102Model[245].setRotationPoint(-14.51F, -14.45F, 6.9F);

		southern1102Model[246].addShapeBox(0F, 0F, 0F, 25, 1, 1, 0F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 353
		southern1102Model[246].setRotationPoint(-63F, -14.5F, 5.85F);

		southern1102Model[247].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 354
		southern1102Model[247].setRotationPoint(-26.51F, -14.45F, 6.9F);

		southern1102Model[248].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 355
		southern1102Model[248].setRotationPoint(-38.51F, -14.45F, 5.9F);

		southern1102Model[249].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 356
		southern1102Model[249].setRotationPoint(-50.51F, -14.45F, 5.9F);

		southern1102Model[250].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 357
		southern1102Model[250].setRotationPoint(-63.01F, -14.45F, 5.9F);

		southern1102Model[251].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, -0.6F, -0.5F, -0.7F, -0.6F, -0.5F, -0.7F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.1F, -0.5F, -0.7F, -0.1F, -0.5F, -0.7F, -0.1F, 0F, 0F, -0.1F, 0F); // Box 358
		southern1102Model[251].setRotationPoint(-62.93F, -14.45F, 4.6F);

		southern1102Model[252].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, -0.6F, -0.5F, -0.7F, -0.6F, -0.5F, -0.7F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.1F, -0.5F, -0.7F, -0.1F, -0.5F, -0.7F, -0.1F, 0F, 0F, -0.1F, 0F); // Box 359
		southern1102Model[252].setRotationPoint(-50.41F, -14.45F, 4.6F);

		southern1102Model[253].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, -0.6F, -0.5F, -0.7F, -0.6F, -0.5F, -0.7F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.1F, -0.5F, -0.7F, -0.1F, -0.5F, -0.7F, -0.1F, 0F, 0F, -0.1F, 0F); // Box 360
		southern1102Model[253].setRotationPoint(-38.41F, -14.45F, 4.6F);

		southern1102Model[254].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, -0.6F, -0.5F, -0.7F, -0.6F, -0.5F, -0.7F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.1F, -0.5F, -0.7F, -0.1F, -0.5F, -0.7F, -0.1F, 0F, 0F, -0.1F, 0F); // Box 361
		southern1102Model[254].setRotationPoint(-26.41F, -14.45F, 5.6F);

		southern1102Model[255].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, -0.6F, -0.5F, -0.7F, -0.6F, -0.5F, -0.7F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.1F, -0.5F, -0.7F, -0.1F, -0.5F, -0.7F, -0.1F, 0F, 0F, -0.1F, 0F); // Box 362
		southern1102Model[255].setRotationPoint(-14.41F, -14.45F, 5.6F);

		southern1102Model[256].addShapeBox(-1F, -1F, 0F, 1, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 363
		southern1102Model[256].setRotationPoint(-67F, 5F, -1F);

		southern1102Model[257].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 367
		southern1102Model[257].setRotationPoint(-31F, -7F, -10F);

		southern1102Model[258].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 368
		southern1102Model[258].setRotationPoint(-30F, -7F, -10F);

		southern1102Model[259].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 369
		southern1102Model[259].setRotationPoint(-29F, -7F, -10F);

		southern1102Model[260].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 370
		southern1102Model[260].setRotationPoint(-31F, -7F, -9F);

		southern1102Model[261].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 371
		southern1102Model[261].setRotationPoint(-29F, -7F, -8F);

		southern1102Model[262].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 372
		southern1102Model[262].setRotationPoint(-30F, -7F, -8F);

		southern1102Model[263].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 373
		southern1102Model[263].setRotationPoint(-31F, -7F, -8F);

		southern1102Model[264].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 376
		southern1102Model[264].setRotationPoint(-31F, -3F, -10F);

		southern1102Model[265].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 377
		southern1102Model[265].setRotationPoint(-30F, -3F, -10F);

		southern1102Model[266].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 378
		southern1102Model[266].setRotationPoint(-29F, -3F, -10F);

		southern1102Model[267].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 379
		southern1102Model[267].setRotationPoint(-31F, -3F, -9F);

		southern1102Model[268].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 380
		southern1102Model[268].setRotationPoint(-30F, -3F, -8F);

		southern1102Model[269].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 381
		southern1102Model[269].setRotationPoint(-31F, -3F, -8F);

		southern1102Model[270].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 382
		southern1102Model[270].setRotationPoint(-29F, -3F, -8F);

		southern1102Model[271].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 403
		southern1102Model[271].setRotationPoint(-27F, -3F, -10F);

		southern1102Model[272].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 404
		southern1102Model[272].setRotationPoint(-26F, -3F, -9F);

		southern1102Model[273].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 405
		southern1102Model[273].setRotationPoint(-27F, -3F, -8F);

		southern1102Model[274].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 406
		southern1102Model[274].setRotationPoint(-26F, -3F, -8F);

		southern1102Model[275].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 407
		southern1102Model[275].setRotationPoint(-25F, -3F, -8F);

		southern1102Model[276].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 408
		southern1102Model[276].setRotationPoint(-25F, -3F, -10F);

		southern1102Model[277].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 409
		southern1102Model[277].setRotationPoint(-26F, -7F, -10F);

		southern1102Model[278].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 410
		southern1102Model[278].setRotationPoint(-27F, -7F, -10F);

		southern1102Model[279].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 411
		southern1102Model[279].setRotationPoint(-26F, -7F, -9F);

		southern1102Model[280].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 412
		southern1102Model[280].setRotationPoint(-27F, -7F, -8F);

		southern1102Model[281].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 413
		southern1102Model[281].setRotationPoint(-26F, -7F, -8F);

		southern1102Model[282].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 414
		southern1102Model[282].setRotationPoint(-25F, -7F, -8F);

		southern1102Model[283].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 415
		southern1102Model[283].setRotationPoint(-25F, -7F, -10F);

		southern1102Model[284].addShapeBox(0F, 0F, 0F, 9, 5, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 1F, 0F, -4F, 1F, 0F, -4F, 1F, 0F, -4F, 1F); // Box 429
		southern1102Model[284].setRotationPoint(-62F, 2F, -8F);

		southern1102Model[285].addShapeBox(0F, 0F, 0F, 9, 5, 3, 0F, 0F, -4F, 1F, 0F, -4F, 1F, 0F, -4F, 1F, 0F, -4F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 431
		southern1102Model[285].setRotationPoint(-62F, 2F, -8F);

		southern1102Model[286].addBox(0F, 0F, 0F, 9, 3, 5, 0F); // Box 432
		southern1102Model[286].setRotationPoint(-62F, 3F, -9F);

		southern1102Model[287].addShapeBox(0F, 0F, 0F, 9, 5, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 1F, 0F, -4F, 1F, 0F, -4F, 1F, 0F, -4F, 1F); // Box 408
		southern1102Model[287].setRotationPoint(-62F, 2F, 5F);

		southern1102Model[288].addBox(0F, 0F, 0F, 9, 3, 5, 0F); // Box 409
		southern1102Model[288].setRotationPoint(-62F, 3F, 4F);

		southern1102Model[289].addShapeBox(0F, 0F, 0F, 9, 5, 3, 0F, 0F, -4F, 1F, 0F, -4F, 1F, 0F, -4F, 1F, 0F, -4F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 410
		southern1102Model[289].setRotationPoint(-62F, 2F, 5F);

		southern1102Model[290].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, -0.6F, -0.5F, -0.7F, -0.6F, -0.5F, -0.7F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.1F, -0.5F, -0.7F, -0.1F, -0.5F, -0.7F, -0.1F, 0F, 0F, -0.1F, 0F); // Box 411
		southern1102Model[290].setRotationPoint(-49.65F, -20.5F, 0.399999999999999F);

		southern1102Model[291].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 412
		southern1102Model[291].setRotationPoint(-49.75F, -20.5F, 1.7F);

		southern1102Model[292].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 415
		southern1102Model[292].setRotationPoint(-49.75F, -20.5F, -3.1F);

		southern1102Model[293].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, -0.6F, -0.5F, -0.7F, -0.6F, -0.5F, -0.7F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.1F, -0.5F, -0.7F, -0.1F, -0.5F, -0.7F, -0.1F, 0F, 0F, -0.1F, 0F); // Box 416
		southern1102Model[293].setRotationPoint(-49.65F, -20.5F, -3.05F);

		southern1102Model[294].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 417
		southern1102Model[294].setRotationPoint(-50F, -21F, -0.5F);

		southern1102Model[295].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, -0.6F, -0.5F, -0.7F, -0.6F, -0.5F, -0.7F, -0.6F, 0.5F, 0F, -0.6F, 0.5F, 0F, -0.1F, -0.5F, -0.7F, -0.1F, -0.5F, -0.7F, -0.1F, 0.5F, 0F, -0.1F, 0.5F); // Box 419
		southern1102Model[295].setRotationPoint(-49.65F, -20F, -1.6F);
		southern1102Model[295].rotateAngleX = -1.57079633F;

		southern1102Model[296].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, -0.6F, -0.5F, -0.7F, -0.6F, -0.5F, -0.7F, -0.6F, 0.5F, 0F, -0.6F, 0.5F, 0F, -0.1F, -0.5F, -0.7F, -0.1F, -0.5F, -0.7F, -0.1F, 0.5F, 0F, -0.1F, 0.5F); // Box 421
		southern1102Model[296].setRotationPoint(-49.65F, -20F, 3.2F);
		southern1102Model[296].rotateAngleX = -1.57079633F;

		southern1102Model[297].addBox(-1F, -1F, 0F, 2, 1, 14, 0F); // Box 422
		southern1102Model[297].setRotationPoint(-69F, 9F, -7F);

		southern1102Model[298].addShapeBox(-1F, -1F, 0F, 1, 1, 5, 0F, 0.1F, 0F, 0F, 0F, 0F, -2.3F, -0.05F, 0F, -0.5F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, -2.3F, 0F, 0F, -0.5F, 0F, 0F, 0F); // Box 424
		southern1102Model[298].setRotationPoint(-69F, 9F, -4.05F);
		southern1102Model[298].rotateAngleY = 0.43633231F;

		southern1102Model[299].addShapeBox(-1F, -1F, 0F, 1, 1, 5, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.5F, 0F, 0F, -2.2F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.5F, 0F, 0F, -2.2F, 0F, 0F, 0F); // Box 426
		southern1102Model[299].setRotationPoint(-71.18F, 9F, -0.45F);
		southern1102Model[299].rotateAngleY = -0.43633231F;

		southern1102Model[300].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, -0.4F, -0.5F, -0.5F, -0.4F, -0.5F, -0.5F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.15F, -0.5F, -0.5F, -0.15F, -0.5F, -0.5F, -0.15F, 0F, 0F, -0.15F, 0F); // Box 427
		southern1102Model[300].setRotationPoint(-69.5F, 5F, 0.75F);
		southern1102Model[300].rotateAngleY = -3.14159265F;
		southern1102Model[300].rotateAngleZ = 0.52359878F;

		southern1102Model[301].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 428
		southern1102Model[301].setRotationPoint(-68.5F, 4F, -0.25F);
		southern1102Model[301].rotateAngleY = -3.14159265F;
		southern1102Model[301].rotateAngleZ = 0.4712389F;

		southern1102Model[302].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 429
		southern1102Model[302].setRotationPoint(-68.5F, 4F, 1.75F);
		southern1102Model[302].rotateAngleY = -3.14159265F;
		southern1102Model[302].rotateAngleZ = 0.4712389F;

		southern1102Model[303].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 430
		southern1102Model[303].setRotationPoint(-68.2F, 4F, -1.25F);
		southern1102Model[303].rotateAngleY = -3.14159265F;
		southern1102Model[303].rotateAngleZ = 0.41887902F;

		southern1102Model[304].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 431
		southern1102Model[304].setRotationPoint(-68.2F, 4F, 2.75F);
		southern1102Model[304].rotateAngleY = -3.14159265F;
		southern1102Model[304].rotateAngleZ = 0.41887902F;

		southern1102Model[305].addBox(0F, 0F, 0F, 1, 10, 12, 0F); // Box 432
		southern1102Model[305].setRotationPoint(-8F, -12F, -6F);

		southern1102Model[306].addShapeBox(0F, 0F, 0F, 1, 4, 12, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 433
		southern1102Model[306].setRotationPoint(-8F, -16F, -6F);

		southern1102Model[307].addBox(0F, 0F, 0F, 1, 1, 8, 0F); // Box 434
		southern1102Model[307].setRotationPoint(-7.5F, -12F, -1F);
		southern1102Model[307].rotateAngleX = -0.03490659F;
		southern1102Model[307].rotateAngleY = -0.13962634F;

		southern1102Model[308].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 435
		southern1102Model[308].setRotationPoint(-6.5F, -7F, 8F);
		southern1102Model[308].rotateAngleZ = -0.17453293F;

		southern1102Model[309].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 436
		southern1102Model[309].setRotationPoint(-8F, -3F, 8F);

		southern1102Model[310].addBox(0F, 0F, 0F, 1, 3, 2, 0F); // Box 437
		southern1102Model[310].setRotationPoint(-7.5F, -5F, 4F);

		southern1102Model[311].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 438
		southern1102Model[311].setRotationPoint(-7.5F, -6F, 4F);
		southern1102Model[311].rotateAngleY = -0.15707963F;

		southern1102Model[312].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 439
		southern1102Model[312].setRotationPoint(-7.5F, -8F, 3.02F);
		southern1102Model[312].rotateAngleY = -0.31415927F;

		southern1102Model[313].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 440
		southern1102Model[313].setRotationPoint(-7.5F, -7F, 3.01F);

		southern1102Model[314].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 441
		southern1102Model[314].setRotationPoint(-7.5F, -5F, -3F);

		southern1102Model[315].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 442
		southern1102Model[315].setRotationPoint(-7.5F, -5F, 2F);

		southern1102Model[316].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 443
		southern1102Model[316].setRotationPoint(-7.5F, -6F, -3F);

		southern1102Model[317].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 444
		southern1102Model[317].setRotationPoint(-7.5F, -6F, 2F);

		southern1102Model[318].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 445
		southern1102Model[318].setRotationPoint(-7.5F, -7F, -2F);

		southern1102Model[319].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 446
		southern1102Model[319].setRotationPoint(-7.5F, -15.5F, -3F);

		southern1102Model[320].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 447
		southern1102Model[320].setRotationPoint(-7.5F, -14.99F, 0F);

		southern1102Model[321].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 449
		southern1102Model[321].setRotationPoint(-7.5F, -11.5F, -5F);

		southern1102Model[322].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 450
		southern1102Model[322].setRotationPoint(-8.5F, -9F, -8F);

		southern1102Model[323].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 451
		southern1102Model[323].setRotationPoint(-8.5F, -6F, -9F);

		southern1102Model[324].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 452
		southern1102Model[324].setRotationPoint(-8.5F, -19F, -5F);

		southern1102Model[325].addBox(0F, 0F, 0F, 1, 4, 4, 0F); // Box 453
		southern1102Model[325].setRotationPoint(-7.7F, -6F, -2F);

		southern1102Model[326].addBox(0F, 0F, 0F, 1, 5, 1, 0F); // Box 454
		southern1102Model[326].setRotationPoint(-7.5F, -22F, 3F);

		southern1102Model[327].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 455
		southern1102Model[327].setRotationPoint(-7.5F, -22F, 1F);

		southern1102Model[328].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F); // Box 439
		southern1102Model[328].setRotationPoint(-30.5F, -1.25F, -4.05F);

		southern1102Model[329].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 446
		southern1102Model[329].setRotationPoint(-29.5F, -1.5F, -4.06F);

		southern1102Model[330].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 447
		southern1102Model[330].setRotationPoint(-22.5F, -1.5F, -4.06F);

		southern1102Model[331].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 450
		southern1102Model[331].setRotationPoint(-26F, -1.35F, -4.06F);

		southern1102Model[332].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 452
		southern1102Model[332].setRotationPoint(-29.5F, -1.5F, 3.06F);

		southern1102Model[333].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 453
		southern1102Model[333].setRotationPoint(-22.5F, -1.5F, 3.06F);

		southern1102Model[334].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F); // Box 454
		southern1102Model[334].setRotationPoint(-30.5F, -1.25F, 3.05F);

		southern1102Model[335].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 455
		southern1102Model[335].setRotationPoint(-26F, -1.35F, 3.06F);

		southern1102Model[336].addShapeBox(0F, -1F, 0F, 26, 1, 1, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 468
		southern1102Model[336].setRotationPoint(-36F, 7F, -7F);

		southern1102Model[337].addShapeBox(0F, -1F, 0F, 26, 1, 1, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 469
		southern1102Model[337].setRotationPoint(-36F, 7.75F, -7F);

		southern1102Model[338].addShapeBox(0F, -1F, 0F, 23, 1, 1, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 470
		southern1102Model[338].setRotationPoint(-47F, 4.84F, -8F);
		southern1102Model[338].rotateAngleZ = -0.09075712F;

		southern1102Model[339].addShapeBox(0F, -1F, 0F, 23, 1, 1, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 471
		southern1102Model[339].setRotationPoint(-47F, 5.59F, -8F);
		southern1102Model[339].rotateAngleZ = -0.09075712F;

		southern1102Model[340].addShapeBox(0F, -1F, 0F, 1, 1, 1, 0F, 0F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.2F, 0F, 0.1F, 0.2F, 0F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.2F, 0F, 0.1F, 0.2F); // Box 474
		southern1102Model[340].setRotationPoint(-10F, 7F, -6.2F);

		southern1102Model[341].addShapeBox(0F, -1F, 0F, 1, 1, 1, 0F, 0F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.2F, 0F, 0.1F, 0.2F, 0F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.2F, 0F, 0.1F, 0.2F); // Box 476
		southern1102Model[341].setRotationPoint(-37.01F, 7F, -6.2F);

		southern1102Model[342].addShapeBox(0F, -1F, 0F, 1, 1, 2, 0F, 0F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.2F, 0F, 0.1F, 0.2F, 0F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.2F, 0F, 0.1F, 0.2F); // Box 478
		southern1102Model[342].setRotationPoint(-24F, 7F, -7.2F);

		southern1102Model[343].addShapeBox(0F, -1F, 0F, 5, 1, 1, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 479
		southern1102Model[343].setRotationPoint(-53F, 5.75F, -8F);

		southern1102Model[344].addShapeBox(0F, -1F, 0F, 5, 1, 1, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 480
		southern1102Model[344].setRotationPoint(-53F, 4.75F, -8F);

		southern1102Model[345].addShapeBox(0F, -1F, 0F, 1, 1, 1, 0F, 0.1F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.2F, 0.1F, 0.1F, 0.2F, 0.1F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.2F, 0.1F, 0.1F, 0.2F); // Box 481
		southern1102Model[345].setRotationPoint(-47.9F, 4.85F, -7.2F);

		southern1102Model[346].addShapeBox(0F, -1F, 0F, 26, 1, 1, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 482
		southern1102Model[346].setRotationPoint(-40F, 3F, 5.25F);

		southern1102Model[347].addShapeBox(0F, -1F, 0F, 26, 1, 1, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 483
		southern1102Model[347].setRotationPoint(-40F, 3.75F, 5.25F);

		southern1102Model[348].addShapeBox(0F, -1F, 0F, 23, 1, 1, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 484
		southern1102Model[348].setRotationPoint(-51F, 5.59F, 6.25F);
		southern1102Model[348].rotateAngleZ = 0.07853982F;

		southern1102Model[349].addShapeBox(0F, -1F, 0F, 23, 1, 1, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 485
		southern1102Model[349].setRotationPoint(-51F, 4.84F, 6.25F);
		southern1102Model[349].rotateAngleZ = 0.07853982F;

		southern1102Model[350].addShapeBox(0F, -1F, 0F, 5, 1, 1, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 486
		southern1102Model[350].setRotationPoint(-57F, 5.75F, 6.25F);

		southern1102Model[351].addShapeBox(0F, -1F, 0F, 5, 1, 1, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 487
		southern1102Model[351].setRotationPoint(-57F, 4.75F, 6.25F);

		southern1102Model[352].addShapeBox(0F, -1F, 0F, 1, 1, 1, 0F, 0.1F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.2F, 0.1F, 0.1F, 0.2F, 0.1F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.2F, 0.1F, 0.1F, 0.2F); // Box 488
		southern1102Model[352].setRotationPoint(-51.9F, 4.85F, 6.1F);

		southern1102Model[353].addShapeBox(0F, -1F, 0F, 1, 1, 1, 0F, 0F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.2F, 0F, 0.1F, 0.2F, 0F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.2F, 0F, 0.1F, 0.2F); // Box 489
		southern1102Model[353].setRotationPoint(-41F, 3F, 5.1F);

		southern1102Model[354].addShapeBox(0F, -1F, 0F, 1, 1, 1, 0F, 0F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.2F, 0F, 0.1F, 0.2F, 0F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.2F, 0F, 0.1F, 0.2F); // Box 490
		southern1102Model[354].setRotationPoint(-14F, 3F, 5.1F);

		southern1102Model[355].addShapeBox(0F, -1F, 0F, 1, 1, 2, 0F, 0F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.2F, 0F, 0.1F, 0.2F, 0F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.2F, 0F, 0.1F, 0.2F); // Box 491
		southern1102Model[355].setRotationPoint(-28.18F, 3F, 5.1F);

		southern1102Model[356].addShapeBox(0F, -1F, 0F, 10, 1, 1, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 492
		southern1102Model[356].setRotationPoint(-54F, 1.5F, -7.5F);

		southern1102Model[357].addShapeBox(0F, -1F, 0F, 10, 1, 1, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 493
		southern1102Model[357].setRotationPoint(-54F, 1.5F, 5.5F);

		southern1102Model[358].addShapeBox(0F, -1F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 494
		southern1102Model[358].setRotationPoint(-44.4F, 1.9F, -7.51F);
		southern1102Model[358].rotateAngleZ = 0.61086524F;

		southern1102Model[359].addShapeBox(0F, -1F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 495
		southern1102Model[359].setRotationPoint(-44.4F, 1.9F, 5.51000000000001F);
		southern1102Model[359].rotateAngleZ = 0.61086524F;

		southern1102Model[360].addShapeBox(0F, -1F, 0F, 13, 1, 1, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 496
		southern1102Model[360].setRotationPoint(-45.7F, 2F, 6.3F);
		southern1102Model[360].rotateAngleY = -1.57079633F;

		southern1102Model[361].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 497
		southern1102Model[361].setRotationPoint(-45.5F, 0F, -0.5F);

		southern1102Model[362].addShapeBox(0F, -1F, 0F, 1, 1, 1, 0F, 0.1F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.2F, 0.1F, 0.1F, 0.2F, 0.1F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.2F, 0.1F, 0.1F, 0.2F); // Box 495
		southern1102Model[362].setRotationPoint(-52F, 3F, 5.1F);

		southern1102Model[363].addBox(0F, 0F, 0F, 3, 2, 1, 0F); // Box 496
		southern1102Model[363].setRotationPoint(-29F, -3F, -9F);

		southern1102Model[364].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, -1F, -0.5F, -0.5F, -1F, -0.5F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 497
		southern1102Model[364].setRotationPoint(-30.5F, -6F, -10F);

		southern1102Model[365].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, -1F, -0.5F, -0.5F, -1F, -0.5F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 498
		southern1102Model[365].setRotationPoint(-30.5F, -6F, -8.5F);

		southern1102Model[366].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 499
		southern1102Model[366].setRotationPoint(-30F, -5F, -9F);

		southern1102Model[367].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, -1F, -0.5F, -0.5F, -1F, -0.5F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 500
		southern1102Model[367].setRotationPoint(-29F, -6F, -8.5F);

		southern1102Model[368].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, -1F, -0.5F, -0.5F, -1F, -0.5F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 501
		southern1102Model[368].setRotationPoint(-29F, -6F, -10F);

		southern1102Model[369].addBox(0F, 0F, 0F, 3, 2, 1, 0F); // Box 502
		southern1102Model[369].setRotationPoint(-29F, -7F, -9F);

		southern1102Model[370].addBox(1F, 0F, 0F, 6, 6, 0, 0F); // Box 498
		southern1102Model[370].setRotationPoint(-54F, 4F, -5.01F);

		southern1102Model[371].addBox(0F, 0F, 0F, 6, 6, 0, 0F); // Box 499
		southern1102Model[371].setRotationPoint(-53F, 4F, 5.01F);

		southern1102Model[372].addShapeBox(0F, 0F, 0F, 5, 2, 14, 0F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 519
		southern1102Model[372].setRotationPoint(-38F, -12.5F, -7F);

		southern1102Model[373].addShapeBox(0F, -1F, 0F, 5, 2, 6, 0F, 0F, 0F, 2F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 2F, 0F, -1F, 0F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, -1F, 0F); // Box 520
		southern1102Model[373].setRotationPoint(-38F, -3F, -3F);

		southern1102Model[374].addShapeBox(0F, 0F, 0F, 5, 2, 6, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -1.5F, -2.5F, 0F, -1.5F, -1.5F, 0F, -1.5F, -1.5F, 0F, -1.5F, -2.5F); // Box 521
		southern1102Model[374].setRotationPoint(-38F, -3F, -3F);

		southern1102Model[375].addShapeBox(0F, 0F, 0F, 5, 2, 10, 0F, 0F, 0.5F, 1.5F, 0F, 0.5F, 2.5F, 0F, 0.5F, 2.5F, 0F, 0.5F, 1.5F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 522
		southern1102Model[375].setRotationPoint(-38F, -6F, -5F);

		southern1102Model[376].addShapeBox(0F, 0F, 0F, 5, 2, 14, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F); // Box 523
		southern1102Model[376].setRotationPoint(-38F, -8.5F, -7F);

		southern1102Model[377].addShapeBox(0F, 0F, 0F, 5, 2, 14, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 524
		southern1102Model[377].setRotationPoint(-38F, -10.5F, -7F);

		southern1102Model[378].addShapeBox(0F, 0F, 0F, 5, 2, 10, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0.5F, 1.5F, 0F, 0.5F, 2.5F, 0F, 0.5F, 2.5F, 0F, 0.5F, 1.5F); // Box 525
		southern1102Model[378].setRotationPoint(-38F, -15F, -5F);

		southern1102Model[379].addShapeBox(0F, 0F, 0F, 5, 2, 6, 0F, 0F, -1F, 0F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, -1F, 0F, 0F, 0F, 2F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 2F); // Box 526
		southern1102Model[379].setRotationPoint(-38F, -17F, -3F);

		southern1102Model[380].addShapeBox(0F, 0F, 0F, 5, 2, 6, 0F, 0F, -1.5F, -2.5F, 0F, -1F, -1.5F, 0F, -1F, -1.5F, 0F, -1.5F, -2.5F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 527
		southern1102Model[380].setRotationPoint(-38F, -18F, -3F);

		southern1102Model[381].addShapeBox(0F, 0F, 0F, 24, 2, 14, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 528
		southern1102Model[381].setRotationPoint(-33F, -10.5F, -7F);

		southern1102Model[382].addShapeBox(0F, 0F, 0F, 24, 2, 6, 0F, 0F, -1F, -1.5F, 0F, -1F, -1.5F, 0F, -1F, -1.5F, 0F, -1F, -1.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 529
		southern1102Model[382].setRotationPoint(-33F, -18F, -3F);

		southern1102Model[383].addShapeBox(0F, 0F, 0F, 24, 2, 6, 0F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F); // Box 530
		southern1102Model[383].setRotationPoint(-33F, -17F, -3F);

		southern1102Model[384].addShapeBox(0F, 0F, 0F, 24, 2, 10, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0.5F, 2.5F, 0F, 0.5F, 2.5F, 0F, 0.5F, 2.5F, 0F, 0.5F, 2.5F); // Box 531
		southern1102Model[384].setRotationPoint(-33F, -15F, -5F);

		southern1102Model[385].addShapeBox(0F, 0F, 0F, 24, 2, 14, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 532
		southern1102Model[385].setRotationPoint(-33F, -12.5F, -7F);

		southern1102Model[386].addShapeBox(0F, 0F, 0F, 24, 2, 6, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -1.5F, -1.5F, 0F, -1.5F, -1.5F, 0F, -1.5F, -1.5F, 0F, -1.5F, -1.5F); // Box 533
		southern1102Model[386].setRotationPoint(-33F, -3F, -3F);

		southern1102Model[387].addShapeBox(0F, -1F, 0F, 24, 2, 6, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, -1F, 1F); // Box 534
		southern1102Model[387].setRotationPoint(-33F, -3F, -3F);

		southern1102Model[388].addShapeBox(0F, 0F, 0F, 24, 2, 10, 0F, 0F, 0.5F, 2.5F, 0F, 0.5F, 2.5F, 0F, 0.5F, 2.5F, 0F, 0.5F, 2.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 535
		southern1102Model[388].setRotationPoint(-33F, -6F, -5F);

		southern1102Model[389].addShapeBox(0F, 0F, 0F, 24, 2, 14, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 536
		southern1102Model[389].setRotationPoint(-33F, -8.5F, -7F);

		southern1102Model[390].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 537
		southern1102Model[390].setRotationPoint(-26F, -3F, -10F);

		southern1102Model[391].addBox(0F, -1F, 0F, 9, 1, 5, 0F); // Box 496
		southern1102Model[391].setRotationPoint(-32F, -7F, -10F);

		southern1102Model[392].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 497
		southern1102Model[392].setRotationPoint(-20.5F, -18.4F, -1.5F);

		southern1102Model[393].addBox(0F, 0F, 0F, 7, 2, 3, 0F); // Box 498
		southern1102Model[393].setRotationPoint(-61F, 0F, -8F);

		southern1102Model[394].addBox(0F, 0F, 0F, 7, 2, 3, 0F); // Box 499
		southern1102Model[394].setRotationPoint(-61F, 0F, 5F);

		southern1102Model[395].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, -0.5F, -0.5F, -0.5F, -1F, -0.5F, -0.5F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 505
		southern1102Model[395].setRotationPoint(-25.5F, -4F, -8.4F);

		southern1102Model[396].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F); // Box 500
		southern1102Model[396].setRotationPoint(-43.5F, -1.25F, -4.05F);

		southern1102Model[397].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 501
		southern1102Model[397].setRotationPoint(-35.5F, -1.5F, -4.06F);

		southern1102Model[398].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 502
		southern1102Model[398].setRotationPoint(-39F, -1.35F, -4.06F);

		southern1102Model[399].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 503
		southern1102Model[399].setRotationPoint(-42.5F, -1.5F, -4.06F);

		southern1102Model[400].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 504
		southern1102Model[400].setRotationPoint(-35.5F, -1.5F, 3.06F);

		southern1102Model[401].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F); // Box 505
		southern1102Model[401].setRotationPoint(-43.5F, -1.25F, 3.05F);

		southern1102Model[402].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 506
		southern1102Model[402].setRotationPoint(-39F, -1.35F, 3.06F);

		southern1102Model[403].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 507
		southern1102Model[403].setRotationPoint(-42.5F, -1.5F, 3.06F);

		southern1102Model[404].addShapeBox(0F, 0F, 0F, 16, 1, 1, 0F, 0F, -0.5F, 0F, 1F, -0.5F, 0F, 1F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 438
		southern1102Model[404].setRotationPoint(-16.5F, -1.5F, 7.59999999999999F);

		southern1102Model[405].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, -0.5F, -0.5F, 0.8F, 0F, -0.5F, 0.8F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0.8F, 0F, 0F, 0.8F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 440
		southern1102Model[405].setRotationPoint(-11F, -14F, 7.9F);
		southern1102Model[405].rotateAngleY = -1.57079633F;

		southern1102Model[406].addShapeBox(0F, 0F, 0F, 16, 1, 1, 0F, 0F, -0.5F, 0F, 1F, -0.5F, 0F, 1F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 441
		southern1102Model[406].setRotationPoint(-16.5F, -0.800000000000001F, 7.59999999999999F);

		southern1102Model[407].addBox(0F, -1F, 0F, 8, 2, 2, 0F); // Box 443
		southern1102Model[407].setRotationPoint(-24F, 0F, -9.19999999999999F);

		southern1102Model[408].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, -1.2F, 0F, 0F, -1.2F); // Box 446
		southern1102Model[408].setRotationPoint(-12F, -8F, 8.1F);

		southern1102Model[409].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, -0.5F, -0.5F, -0.5F, -1F, -0.5F, -0.5F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 447
		southern1102Model[409].setRotationPoint(0.5F, -1.5F, 7.1F);

		southern1102Model[410].addShapeBox(0F, 0F, 0F, 16, 1, 1, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 448
		southern1102Model[410].setRotationPoint(-16F, 0F, -8.6F);

		southern1102Model[411].addShapeBox(0F, 0F, 0F, 16, 1, 1, 0F, 0F, -0.5F, 0F, 1F, -0.5F, 0F, 1F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 449
		southern1102Model[411].setRotationPoint(-16.5F, -0.800000000000001F, -8.6F);

		southern1102Model[412].addShapeBox(0F, 0F, 0F, 16, 1, 1, 0F, 0F, -0.5F, 0F, 1F, -0.5F, 0F, 1F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 450
		southern1102Model[412].setRotationPoint(-16.5F, -1.5F, -8.6F);

		southern1102Model[413].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, -0.5F, -0.5F, -0.5F, -1F, -0.5F, -0.5F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 451
		southern1102Model[413].setRotationPoint(0.5F, -1.5F, -9.09999999999999F);

		southern1102Model[414].addBox(0F, 0F, 0F, 1, 1, 10, 0F); // Box 452
		southern1102Model[414].setRotationPoint(-50.5F, 6.5F, -5F);

		southern1102Model[415].addShapeBox(0F, 2F, 0F, 4, 1, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 444
		southern1102Model[415].setRotationPoint(-25.5F, -2F, -8.4F);

		southern1102Model[416].addShapeBox(0F, 0F, 0F, 17, 1, 1, 0F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 445
		southern1102Model[416].setRotationPoint(-26F, -14.5F, -8.5F);

		southern1102Model[417].addShapeBox(0F, 0F, 0F, 12, 1, 1, 0F, 0.05F, -0.6F, -0.6F, 0F, -0.6F, -0.65F, 0F, -0.6F, 0.05F, 0.1F, -0.6F, 0F, 0.05F, 0F, -0.6F, 0F, 0F, -0.65F, 0F, 0F, 0.05F, 0.1F, 0F, 0F); // Box 446
		southern1102Model[417].setRotationPoint(-38F, -14.5F, -7.5F);
		southern1102Model[417].rotateAngleY = -0.08726646F;

		southern1102Model[418].addShapeBox(0F, 0F, 0F, 17, 1, 1, 0F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 447
		southern1102Model[418].setRotationPoint(-26F, -14.5F, 6.85F);

		southern1102Model[419].addShapeBox(0.1F, 0F, 0F, 12, 1, 1, 0F, 0.05F, -0.6F, -0.6F, 0F, -0.6F, -0.55F, 0.05F, -0.6F, -0.05F, 0F, -0.6F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.55F, 0.05F, 0F, -0.05F, 0F, 0F, 0F); // Box 449
		southern1102Model[419].setRotationPoint(-38F, -14.5F, 5.85F);
		southern1102Model[419].rotateAngleY = 0.08726646F;

		southern1102Model[420].addBox(0F, 0F, 0F, 17, 2, 6, 0F); // Box 438
		southern1102Model[420].setRotationPoint(-66F, 5F, -3F);

		southern1102Model[421].addShapeBox(0F, 0F, 0F, 1, 1, 16, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.1F, -1F, 0F, -0.1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F); // Box 439
		southern1102Model[421].setRotationPoint(-9F, -22F, -8F);

		southern1102Model[422].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 440
		southern1102Model[422].setRotationPoint(6F, -18F, -10F);

		southern1102Model[423].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 441
		southern1102Model[423].setRotationPoint(6F, -18F, 9F);

		southern1102Model[424].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 429
		southern1102Model[424].setRotationPoint(-68.2F, 4F, -2.25F);
		southern1102Model[424].rotateAngleY = -3.14159265F;
		southern1102Model[424].rotateAngleZ = 0.26179939F;

		southern1102Model[425].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 430
		southern1102Model[425].setRotationPoint(-68.2F, 4F, -3.25F);
		southern1102Model[425].rotateAngleY = -3.14159265F;
		southern1102Model[425].rotateAngleZ = 0.13962634F;

		southern1102Model[426].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 431
		southern1102Model[426].setRotationPoint(-68.2F, 4F, -4.25F);
		southern1102Model[426].rotateAngleY = -3.14159265F;

		southern1102Model[427].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 433
		southern1102Model[427].setRotationPoint(-68.2F, 4F, 4.75F);
		southern1102Model[427].rotateAngleY = -3.14159265F;
		southern1102Model[427].rotateAngleZ = 0.13962634F;

		southern1102Model[428].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 434
		southern1102Model[428].setRotationPoint(-68.2F, 4F, 5.75F);
		southern1102Model[428].rotateAngleY = -3.14159265F;

		southern1102Model[429].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 435
		southern1102Model[429].setRotationPoint(-68.2F, 4F, 3.75F);
		southern1102Model[429].rotateAngleY = -3.14159265F;
		southern1102Model[429].rotateAngleZ = 0.26179939F;

		southern1102Model[430].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 436
		southern1102Model[430].setRotationPoint(-65F, -15F, -6F);

		southern1102Model[431].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 437
		southern1102Model[431].setRotationPoint(-65F, -15F, 5F);

		southern1102Model[432].addBox(0F, -1F, 0F, 1, 3, 5, 0F); // Box 435
		southern1102Model[432].setRotationPoint(-52F, -4F, -10F);

		southern1102Model[433].addBox(0F, -1F, 0F, 1, 4, 5, 0F); // Box 436
		southern1102Model[433].setRotationPoint(-33F, -7F, -10F);

		southern1102Model[434].addBox(0F, -1F, 0F, 1, 6, 5, 0F); // Box 437
		southern1102Model[434].setRotationPoint(-23F, -7F, -10F);

		southern1102Model[435].addBox(0F, -1F, 0F, 1, 3, 5, 0F); // Box 438
		southern1102Model[435].setRotationPoint(-52F, -4F, 5F);

		southern1102Model[436].addBox(0F, -1F, 0F, 1, 3, 5, 0F); // Box 439
		southern1102Model[436].setRotationPoint(-26F, -3F, 5F);

		southern1102Model[437].addBox(0F, -1F, 0F, 1, 3, 5, 0F); // Box 440
		southern1102Model[437].setRotationPoint(-63F, -1F, -10F);

		southern1102Model[438].addBox(0F, -1F, 0F, 1, 3, 5, 0F); // Box 441
		southern1102Model[438].setRotationPoint(-63F, -1F, 5F);

		southern1102Model[439].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, 0F, -0.6F, -0.5F, -0.7F, -0.6F, -0.5F, -0.7F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.1F, -0.5F, -0.7F, -0.1F, -0.5F, -0.7F, -0.1F, 0F, 0F, -0.1F, 0F); // Box 441
		southern1102Model[439].setRotationPoint(-49.65F, -18F, -2.6F);

		southern1102Model[440].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 442
		southern1102Model[440].setRotationPoint(-49.75F, -18F, 1.7F);

		southern1102Model[441].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 443
		southern1102Model[441].setRotationPoint(-49.75F, -18F, -3.1F);

		southern1102Model[442].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, -0.6F, -0.5F, -0.7F, -0.6F, -0.5F, -0.7F, -0.6F, 0.5F, 0F, -0.6F, 0.5F, 0F, -0.1F, -0.5F, -0.7F, -0.1F, -0.5F, -0.7F, -0.1F, 0.5F, 0F, -0.1F, 0.5F); // Box 446
		southern1102Model[442].setRotationPoint(-49.65F, -17.6F, -0.25F);
		southern1102Model[442].rotateAngleX = -1.57079633F;

		southern1102Model[443].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, -0.6F, -0.5F, -0.7F, -0.6F, -0.5F, -0.7F, -0.6F, 0.5F, 0F, -0.6F, 0.5F, 0F, -0.1F, -0.5F, -0.7F, -0.1F, -0.5F, -0.7F, -0.1F, 0.5F, 0F, -0.1F, 0.5F); // Box 447
		southern1102Model[443].setRotationPoint(-49.65F, -17.6F, 1.75F);
		southern1102Model[443].rotateAngleX = -1.57079633F;

		southern1102Model[444].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 446
		southern1102Model[444].setRotationPoint(-64.1F, -9.5F, 3.5F);

		southern1102Model[445].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 447
		southern1102Model[445].setRotationPoint(-64.1F, -11F, 3.5F);

		fixRotation(southern1102Model, false, true, true);
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		for(int i = 0; i < 446; i++)
		{
			if(southern1102Model[i].boxName!= null && southern1102Model[i].boxName.equals("lamp")){
				Minecraft.getMinecraft().entityRenderer.disableLightmap(1D);
				southern1102Model[i].render(f5);
				Minecraft.getMinecraft().entityRenderer.enableLightmap(1D);

			} else {
				southern1102Model[i].render(f5);
			}
		}
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
	{
	}

	public ModelRendererTurbo southern1102Model[];
}