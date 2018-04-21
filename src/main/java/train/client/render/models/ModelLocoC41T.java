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

public class ModelLocoC41T extends ModelBase
{
	int textureX = 512;
	int textureY = 128;

	public ModelLocoC41T()
	{
		lococ41tModel = new ModelRendererTurbo[454];
		lococ41tModel[0] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 6
		lococ41tModel[1] = new ModelRendererTurbo(this, 146, 1, textureX, textureY); // Box 10
		lococ41tModel[2] = new ModelRendererTurbo(this, 162, 1, textureX, textureY); // Box 11
		lococ41tModel[3] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 25
		lococ41tModel[4] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 26
		lococ41tModel[5] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 22
		lococ41tModel[6] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 23
		lococ41tModel[7] = new ModelRendererTurbo(this, 505, 17, textureX, textureY); // Box 24
		lococ41tModel[8] = new ModelRendererTurbo(this, 146, 9, textureX, textureY); // Box 25
		lococ41tModel[9] = new ModelRendererTurbo(this, 154, 9, textureX, textureY); // Box 26
		lococ41tModel[10] = new ModelRendererTurbo(this, 33, 33, textureX, textureY); // Box 27
		lococ41tModel[11] = new ModelRendererTurbo(this, 89, 33, textureX, textureY); // Box 28
		lococ41tModel[12] = new ModelRendererTurbo(this, 129, 33, textureX, textureY); // Box 29
		lococ41tModel[13] = new ModelRendererTurbo(this, 169, 33, textureX, textureY); // Box 30
		lococ41tModel[14] = new ModelRendererTurbo(this, 209, 33, textureX, textureY); // Box 31
		lococ41tModel[15] = new ModelRendererTurbo(this, 497, 25, textureX, textureY); // Box 32
		lococ41tModel[16] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 33
		lococ41tModel[17] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Box 34
		lococ41tModel[18] = new ModelRendererTurbo(this, 9, 33, textureX, textureY); // Box 35
		lococ41tModel[19] = new ModelRendererTurbo(this, 33, 33, textureX, textureY); // Box 36
		lococ41tModel[20] = new ModelRendererTurbo(this, 41, 33, textureX, textureY); // Box 37
		lococ41tModel[21] = new ModelRendererTurbo(this, 249, 33, textureX, textureY); // Box 38
		lococ41tModel[22] = new ModelRendererTurbo(this, 257, 33, textureX, textureY); // Box 39
		lococ41tModel[23] = new ModelRendererTurbo(this, 409, 33, textureX, textureY); // Box 45
		lococ41tModel[24] = new ModelRendererTurbo(this, 457, 33, textureX, textureY); // Box 46
		lococ41tModel[25] = new ModelRendererTurbo(this, 161, 41, textureX, textureY); // Box 47
		lococ41tModel[26] = new ModelRendererTurbo(this, 289, 41, textureX, textureY); // Box 48
		lococ41tModel[27] = new ModelRendererTurbo(this, 353, 41, textureX, textureY); // Box 49
		lococ41tModel[28] = new ModelRendererTurbo(this, 401, 41, textureX, textureY); // Box 50
		lococ41tModel[29] = new ModelRendererTurbo(this, 425, 41, textureX, textureY); // Box 54
		lococ41tModel[30] = new ModelRendererTurbo(this, 143, 49, textureX, textureY); // Box 59
		lococ41tModel[31] = new ModelRendererTurbo(this, 193, 52, textureX, textureY); // Box 60
		lococ41tModel[32] = new ModelRendererTurbo(this, 265, 49, textureX, textureY); // Box 62
		lococ41tModel[33] = new ModelRendererTurbo(this, 162, 9, textureX, textureY); // Box 63
		lococ41tModel[34] = new ModelRendererTurbo(this, 241, 41, textureX, textureY); // Box 64
		lococ41tModel[35] = new ModelRendererTurbo(this, 49, 33, textureX, textureY); // Box 65
		lococ41tModel[36] = new ModelRendererTurbo(this, 113, 49, textureX, textureY); // Box 66
		lococ41tModel[37] = new ModelRendererTurbo(this, 121, 57, textureX, textureY); // Box 71
		lococ41tModel[38] = new ModelRendererTurbo(this, 65, 57, textureX, textureY); // Box 74
		lococ41tModel[39] = new ModelRendererTurbo(this, 233, 65, textureX, textureY); // Box 85
		lococ41tModel[40] = new ModelRendererTurbo(this, 121, 17, textureX, textureY); // Box 86
		lococ41tModel[41] = new ModelRendererTurbo(this, 305, 65, textureX, textureY); // Box 87
		lococ41tModel[42] = new ModelRendererTurbo(this, 33, 49, textureX, textureY); // Box 88
		lococ41tModel[43] = new ModelRendererTurbo(this, 89, 49, textureX, textureY); // Box 89
		lococ41tModel[44] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 90
		lococ41tModel[45] = new ModelRendererTurbo(this, 401, 57, textureX, textureY); // Box 91
		lococ41tModel[46] = new ModelRendererTurbo(this, 361, 65, textureX, textureY); // Box 92
		lococ41tModel[47] = new ModelRendererTurbo(this, 397, 62, textureX, textureY); // Box 93
		lococ41tModel[48] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 94
		lococ41tModel[49] = new ModelRendererTurbo(this, 257, 49, textureX, textureY); // Box 95
		lococ41tModel[50] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 96
		lococ41tModel[51] = new ModelRendererTurbo(this, 473, 57, textureX, textureY); // Box 97
		lococ41tModel[52] = new ModelRendererTurbo(this, 65, 9, textureX, textureY); // Box 98
		lococ41tModel[53] = new ModelRendererTurbo(this, 89, 9, textureX, textureY); // Box 99
		lococ41tModel[54] = new ModelRendererTurbo(this, 209, 65, textureX, textureY); // Box 100
		lococ41tModel[55] = new ModelRendererTurbo(this, 201, 33, textureX, textureY); // Box 102
		lococ41tModel[56] = new ModelRendererTurbo(this, 449, 33, textureX, textureY); // Box 104
		lococ41tModel[57] = new ModelRendererTurbo(this, 169, 57, textureX, textureY); // Box 105
		lococ41tModel[58] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 106
		lococ41tModel[59] = new ModelRendererTurbo(this, 369, 17, textureX, textureY); // Box 107
		lococ41tModel[60] = new ModelRendererTurbo(this, 265, 33, textureX, textureY); // Box 108
		lococ41tModel[61] = new ModelRendererTurbo(this, 289, 33, textureX, textureY); // Box 109
		lococ41tModel[62] = new ModelRendererTurbo(this, 353, 33, textureX, textureY); // Box 110
		lococ41tModel[63] = new ModelRendererTurbo(this, 409, 33, textureX, textureY); // Box 111
		lococ41tModel[64] = new ModelRendererTurbo(this, 113, 65, textureX, textureY); // Box 118
		lococ41tModel[65] = new ModelRendererTurbo(this, 57, 73, textureX, textureY); // Box 119
		lococ41tModel[66] = new ModelRendererTurbo(this, 145, 73, textureX, textureY); // Box 120
		lococ41tModel[67] = new ModelRendererTurbo(this, 441, 73, textureX, textureY); // Box 132
		lococ41tModel[68] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 133
		lococ41tModel[69] = new ModelRendererTurbo(this, 33, 81, textureX, textureY); // Box 132
		lococ41tModel[70] = new ModelRendererTurbo(this, 81, 81, textureX, textureY); // Box 133
		lococ41tModel[71] = new ModelRendererTurbo(this, 481, 73, textureX, textureY); // Box 135
		lococ41tModel[72] = new ModelRendererTurbo(this, 353, 33, textureX, textureY); // Box 131
		lococ41tModel[73] = new ModelRendererTurbo(this, 362, 16, textureX, textureY); // Box 196
		lococ41tModel[74] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 199
		lococ41tModel[75] = new ModelRendererTurbo(this, 168, 77, textureX, textureY); // Box 197
		lococ41tModel[76] = new ModelRendererTurbo(this, 219, 97, textureX, textureY); // Box 196
		lococ41tModel[77] = new ModelRendererTurbo(this, 359, 93, textureX, textureY); // Box 198
		lococ41tModel[78] = new ModelRendererTurbo(this, 362, 7, textureX, textureY); // Box 200
		lococ41tModel[79] = new ModelRendererTurbo(this, 169, 22, textureX, textureY); // Box 197
		lococ41tModel[80] = new ModelRendererTurbo(this, 45, 22, textureX, textureY); // Box 198
		lococ41tModel[81] = new ModelRendererTurbo(this, 176, 2, textureX, textureY); // Box 191
		lococ41tModel[82] = new ModelRendererTurbo(this, 196, 51, textureX, textureY); // Box 195
		lococ41tModel[83] = new ModelRendererTurbo(this, 192, 54, textureX, textureY); // Box 196
		lococ41tModel[84] = new ModelRendererTurbo(this, 197, 54, textureX, textureY); // Box 197
		lococ41tModel[85] = new ModelRendererTurbo(this, 190, 50, textureX, textureY); // Box 198
		lococ41tModel[86] = new ModelRendererTurbo(this, 194, 55, textureX, textureY); // Box 199
		lococ41tModel[87] = new ModelRendererTurbo(this, 194, 54, textureX, textureY); // Box 200
		lococ41tModel[88] = new ModelRendererTurbo(this, 187, 54, textureX, textureY); // Box 201
		lococ41tModel[89] = new ModelRendererTurbo(this, 193, 55, textureX, textureY); // Box 202
		lococ41tModel[90] = new ModelRendererTurbo(this, 197, 55, textureX, textureY); // Box 203
		lococ41tModel[91] = new ModelRendererTurbo(this, 196, 50, textureX, textureY); // Box 204
		lococ41tModel[92] = new ModelRendererTurbo(this, 196, 56, textureX, textureY); // Box 205
		lococ41tModel[93] = new ModelRendererTurbo(this, 202, 56, textureX, textureY); // Box 206
		lococ41tModel[94] = new ModelRendererTurbo(this, 194, 55, textureX, textureY); // Box 207
		lococ41tModel[95] = new ModelRendererTurbo(this, 194, 53, textureX, textureY); // Box 208
		lococ41tModel[96] = new ModelRendererTurbo(this, 202, 57, textureX, textureY); // Box 209
		lococ41tModel[97] = new ModelRendererTurbo(this, 193, 52, textureX, textureY); // Box 212
		lococ41tModel[98] = new ModelRendererTurbo(this, 197, 54, textureX, textureY); // Box 213
		lococ41tModel[99] = new ModelRendererTurbo(this, 190, 50, textureX, textureY); // Box 214
		lococ41tModel[100] = new ModelRendererTurbo(this, 196, 50, textureX, textureY); // Box 215
		lococ41tModel[101] = new ModelRendererTurbo(this, 194, 53, textureX, textureY); // Box 216
		lococ41tModel[102] = new ModelRendererTurbo(this, 196, 51, textureX, textureY); // Box 217
		lococ41tModel[103] = new ModelRendererTurbo(this, 187, 54, textureX, textureY); // Box 218
		lococ41tModel[104] = new ModelRendererTurbo(this, 192, 54, textureX, textureY); // Box 219
		lococ41tModel[105] = new ModelRendererTurbo(this, 193, 55, textureX, textureY); // Box 220
		lococ41tModel[106] = new ModelRendererTurbo(this, 194, 55, textureX, textureY); // Box 221
		lococ41tModel[107] = new ModelRendererTurbo(this, 194, 54, textureX, textureY); // Box 222
		lococ41tModel[108] = new ModelRendererTurbo(this, 197, 55, textureX, textureY); // Box 223
		lococ41tModel[109] = new ModelRendererTurbo(this, 196, 56, textureX, textureY); // Box 224
		lococ41tModel[110] = new ModelRendererTurbo(this, 202, 56, textureX, textureY); // Box 225
		lococ41tModel[111] = new ModelRendererTurbo(this, 202, 57, textureX, textureY); // Box 226
		lococ41tModel[112] = new ModelRendererTurbo(this, 194, 55, textureX, textureY); // Box 227
		lococ41tModel[113] = new ModelRendererTurbo(this, 197, 54, textureX, textureY); // Box 228
		lococ41tModel[114] = new ModelRendererTurbo(this, 197, 54, textureX, textureY); // Box 229
		lococ41tModel[115] = new ModelRendererTurbo(this, 197, 54, textureX, textureY); // Box 230
		lococ41tModel[116] = new ModelRendererTurbo(this, 197, 54, textureX, textureY); // Box 231
		lococ41tModel[117] = new ModelRendererTurbo(this, 197, 54, textureX, textureY); // Box 232
		lococ41tModel[118] = new ModelRendererTurbo(this, 197, 54, textureX, textureY); // Box 233
		lococ41tModel[119] = new ModelRendererTurbo(this, 309, 84, textureX, textureY); // Box 250
		lococ41tModel[120] = new ModelRendererTurbo(this, 309, 84, textureX, textureY); // Box 251
		lococ41tModel[121] = new ModelRendererTurbo(this, 317, 89, textureX, textureY); // Box 252
		lococ41tModel[122] = new ModelRendererTurbo(this, 309, 88, textureX, textureY); // Box 254
		lococ41tModel[123] = new ModelRendererTurbo(this, 317, 89, textureX, textureY); // Box 256
		lococ41tModel[124] = new ModelRendererTurbo(this, 309, 88, textureX, textureY); // Box 257
		lococ41tModel[125] = new ModelRendererTurbo(this, 192, 54, textureX, textureY); // Box 261
		lococ41tModel[126] = new ModelRendererTurbo(this, 196, 50, textureX, textureY); // Box 263
		lococ41tModel[127] = new ModelRendererTurbo(this, 192, 54, textureX, textureY); // Box 264
		lococ41tModel[128] = new ModelRendererTurbo(this, 192, 54, textureX, textureY); // Box 265
		lococ41tModel[129] = new ModelRendererTurbo(this, 192, 54, textureX, textureY); // Box 266
		lococ41tModel[130] = new ModelRendererTurbo(this, 196, 50, textureX, textureY); // Box 267
		lococ41tModel[131] = new ModelRendererTurbo(this, 196, 50, textureX, textureY); // Box 268
		lococ41tModel[132] = new ModelRendererTurbo(this, 196, 50, textureX, textureY); // Box 269
		lococ41tModel[133] = new ModelRendererTurbo(this, 192, 54, textureX, textureY); // Box 270
		lococ41tModel[134] = new ModelRendererTurbo(this, 196, 50, textureX, textureY); // Box 271
		lococ41tModel[135] = new ModelRendererTurbo(this, 192, 54, textureX, textureY); // Box 272
		lococ41tModel[136] = new ModelRendererTurbo(this, 196, 50, textureX, textureY); // Box 273
		lococ41tModel[137] = new ModelRendererTurbo(this, 192, 54, textureX, textureY); // Box 274
		lococ41tModel[138] = new ModelRendererTurbo(this, 196, 50, textureX, textureY); // Box 275
		lococ41tModel[139] = new ModelRendererTurbo(this, 196, 50, textureX, textureY); // Box 276
		lococ41tModel[140] = new ModelRendererTurbo(this, 192, 54, textureX, textureY); // Box 277
		lococ41tModel[141] = new ModelRendererTurbo(this, 149, 110, textureX, textureY); // Box 272
		lococ41tModel[142] = new ModelRendererTurbo(this, 149, 100, textureX, textureY); // Box 273
		lococ41tModel[143] = new ModelRendererTurbo(this, 142, 111, textureX, textureY); // Box 275
		lococ41tModel[144] = new ModelRendererTurbo(this, 142, 101, textureX, textureY); // Box 276
		lococ41tModel[145] = new ModelRendererTurbo(this, 161, 101, textureX, textureY); // Box 277
		lococ41tModel[146] = new ModelRendererTurbo(this, 156, 101, textureX, textureY); // Box 278
		lococ41tModel[147] = new ModelRendererTurbo(this, 156, 110, textureX, textureY); // Box 279
		lococ41tModel[148] = new ModelRendererTurbo(this, 161, 110, textureX, textureY); // Box 280
		lococ41tModel[149] = new ModelRendererTurbo(this, 309, 88, textureX, textureY); // Box 279
		lococ41tModel[150] = new ModelRendererTurbo(this, 309, 88, textureX, textureY); // Box 280
		lococ41tModel[151] = new ModelRendererTurbo(this, 309, 88, textureX, textureY); // Box 281
		lococ41tModel[152] = new ModelRendererTurbo(this, 309, 88, textureX, textureY); // Box 282
		lococ41tModel[153] = new ModelRendererTurbo(this, 309, 88, textureX, textureY); // Box 285
		lococ41tModel[154] = new ModelRendererTurbo(this, 309, 88, textureX, textureY); // Box 286
		lococ41tModel[155] = new ModelRendererTurbo(this, 309, 88, textureX, textureY); // Box 287
		lococ41tModel[156] = new ModelRendererTurbo(this, 309, 88, textureX, textureY); // Box 288
		lococ41tModel[157] = new ModelRendererTurbo(this, 309, 88, textureX, textureY); // Box 290
		lococ41tModel[158] = new ModelRendererTurbo(this, 309, 84, textureX, textureY); // Box 292
		lococ41tModel[159] = new ModelRendererTurbo(this, 309, 84, textureX, textureY); // Box 293
		lococ41tModel[160] = new ModelRendererTurbo(this, 309, 84, textureX, textureY); // Box 295
		lococ41tModel[161] = new ModelRendererTurbo(this, 309, 84, textureX, textureY); // Box 296
		lococ41tModel[162] = new ModelRendererTurbo(this, 317, 89, textureX, textureY); // Box 297
		lococ41tModel[163] = new ModelRendererTurbo(this, 309, 88, textureX, textureY); // Box 299
		lococ41tModel[164] = new ModelRendererTurbo(this, 309, 88, textureX, textureY); // Box 300
		lococ41tModel[165] = new ModelRendererTurbo(this, 317, 89, textureX, textureY); // Box 301
		lococ41tModel[166] = new ModelRendererTurbo(this, 317, 89, textureX, textureY); // Box 308
		lococ41tModel[167] = new ModelRendererTurbo(this, 304, 72, textureX, textureY); // Box 325
		lococ41tModel[168] = new ModelRendererTurbo(this, 309, 88, textureX, textureY); // Box 329
		lococ41tModel[169] = new ModelRendererTurbo(this, 385, 41, textureX, textureY); // Box 330
		lococ41tModel[170] = new ModelRendererTurbo(this, 309, 88, textureX, textureY); // Box 333
		lococ41tModel[171] = new ModelRendererTurbo(this, 309, 88, textureX, textureY); // Box 336
		lococ41tModel[172] = new ModelRendererTurbo(this, 385, 41, textureX, textureY); // Box 337
		lococ41tModel[173] = new ModelRendererTurbo(this, 309, 84, textureX, textureY); // Box 327
		lococ41tModel[174] = new ModelRendererTurbo(this, 309, 84, textureX, textureY); // Box 329
		lococ41tModel[175] = new ModelRendererTurbo(this, 309, 84, textureX, textureY); // Box 333
		lococ41tModel[176] = new ModelRendererTurbo(this, 309, 84, textureX, textureY); // Box 334
		lococ41tModel[177] = new ModelRendererTurbo(this, 309, 84, textureX, textureY); // Box 335
		lococ41tModel[178] = new ModelRendererTurbo(this, 309, 84, textureX, textureY); // Box 336
		lococ41tModel[179] = new ModelRendererTurbo(this, 309, 88, textureX, textureY); // Box 339
		lococ41tModel[180] = new ModelRendererTurbo(this, 309, 88, textureX, textureY); // Box 340
		lococ41tModel[181] = new ModelRendererTurbo(this, 309, 84, textureX, textureY); // Box 341
		lococ41tModel[182] = new ModelRendererTurbo(this, 309, 88, textureX, textureY); // Box 342
		lococ41tModel[183] = new ModelRendererTurbo(this, 309, 84, textureX, textureY); // Box 343
		lococ41tModel[184] = new ModelRendererTurbo(this, 309, 84, textureX, textureY); // Box 344
		lococ41tModel[185] = new ModelRendererTurbo(this, 309, 84, textureX, textureY); // Box 345
		lococ41tModel[186] = new ModelRendererTurbo(this, 309, 84, textureX, textureY); // Box 346
		lococ41tModel[187] = new ModelRendererTurbo(this, 165, 122, textureX, textureY); // Box 347
		lococ41tModel[188] = new ModelRendererTurbo(this, 160, 122, textureX, textureY); // Box 348
		lococ41tModel[189] = new ModelRendererTurbo(this, 207, 117, textureX, textureY); // Box 349
		lococ41tModel[190] = new ModelRendererTurbo(this, 202, 117, textureX, textureY); // Box 350
		lococ41tModel[191] = new ModelRendererTurbo(this, 192, 118, textureX, textureY); // Box 351
		lococ41tModel[192] = new ModelRendererTurbo(this, 183, 118, textureX, textureY); // Box 352
		lococ41tModel[193] = new ModelRendererTurbo(this, 141, 121, textureX, textureY); // Box 353
		lococ41tModel[194] = new ModelRendererTurbo(this, 150, 121, textureX, textureY); // Box 354
		lococ41tModel[195] = new ModelRendererTurbo(this, 194, 103, textureX, textureY, "lamp"); // Box 356
		lococ41tModel[196] = new ModelRendererTurbo(this, 196, 103, textureX, textureY); // Box 357
		lococ41tModel[197] = new ModelRendererTurbo(this, 195, 103, textureX, textureY); // Box 359
		lococ41tModel[198] = new ModelRendererTurbo(this, 195, 104, textureX, textureY); // Box 361
		lococ41tModel[199] = new ModelRendererTurbo(this, 195, 104, textureX, textureY); // Box 362
		lococ41tModel[200] = new ModelRendererTurbo(this, 195, 104, textureX, textureY); // Box 363
		lococ41tModel[201] = new ModelRendererTurbo(this, 195, 103, textureX, textureY); // Box 364
		lococ41tModel[202] = new ModelRendererTurbo(this, 137, 90, textureX, textureY); // Box 365
		lococ41tModel[203] = new ModelRendererTurbo(this, 204, 98, textureX, textureY); // Box 367
		lococ41tModel[204] = new ModelRendererTurbo(this, 204, 98, textureX, textureY); // Box 368
		lococ41tModel[205] = new ModelRendererTurbo(this, 195, 103, textureX, textureY); // Box 360
		lococ41tModel[206] = new ModelRendererTurbo(this, 171, 98, textureX, textureY); // Box 362
		lococ41tModel[207] = new ModelRendererTurbo(this, 171, 98, textureX, textureY); // Box 365
		lococ41tModel[208] = new ModelRendererTurbo(this, 218, 111, textureX, textureY); // Box 396
		lococ41tModel[209] = new ModelRendererTurbo(this, 176, 120, textureX, textureY); // Box 405
		lococ41tModel[210] = new ModelRendererTurbo(this, 176, 120, textureX, textureY); // Box 378
		lococ41tModel[211] = new ModelRendererTurbo(this, 176, 120, textureX, textureY); // Box 379
		lococ41tModel[212] = new ModelRendererTurbo(this, 176, 120, textureX, textureY); // Box 380
		lococ41tModel[213] = new ModelRendererTurbo(this, 176, 120, textureX, textureY); // Box 381
		lococ41tModel[214] = new ModelRendererTurbo(this, 176, 120, textureX, textureY); // Box 382
		lococ41tModel[215] = new ModelRendererTurbo(this, 176, 120, textureX, textureY); // Box 383
		lococ41tModel[216] = new ModelRendererTurbo(this, 176, 120, textureX, textureY); // Box 384
		lococ41tModel[217] = new ModelRendererTurbo(this, 347, 91, textureX, textureY); // Box 396
		lococ41tModel[218] = new ModelRendererTurbo(this, 182, 103, textureX, textureY); // Box 390
		lococ41tModel[219] = new ModelRendererTurbo(this, 182, 109, textureX, textureY); // Box 391
		lococ41tModel[220] = new ModelRendererTurbo(this, 182, 109, textureX, textureY); // Box 397
		lococ41tModel[221] = new ModelRendererTurbo(this, 182, 112, textureX, textureY); // Box 398
		lococ41tModel[222] = new ModelRendererTurbo(this, 182, 112, textureX, textureY); // Box 401
		lococ41tModel[223] = new ModelRendererTurbo(this, 182, 112, textureX, textureY); // Box 402
		lococ41tModel[224] = new ModelRendererTurbo(this, 182, 112, textureX, textureY); // Box 403
		lococ41tModel[225] = new ModelRendererTurbo(this, 385, 41, textureX, textureY); // Box 404
		lococ41tModel[226] = new ModelRendererTurbo(this, 385, 41, textureX, textureY); // Box 405
		lococ41tModel[227] = new ModelRendererTurbo(this, 176, 120, textureX, textureY); // Box 406
		lococ41tModel[228] = new ModelRendererTurbo(this, 176, 120, textureX, textureY); // Box 407
		lococ41tModel[229] = new ModelRendererTurbo(this, 176, 120, textureX, textureY); // Box 408
		lococ41tModel[230] = new ModelRendererTurbo(this, 176, 120, textureX, textureY); // Box 409
		lococ41tModel[231] = new ModelRendererTurbo(this, 176, 120, textureX, textureY); // Box 411
		lococ41tModel[232] = new ModelRendererTurbo(this, 176, 120, textureX, textureY); // Box 412
		lococ41tModel[233] = new ModelRendererTurbo(this, 176, 120, textureX, textureY); // Box 413
		lococ41tModel[234] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 402
		lococ41tModel[235] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 403
		lococ41tModel[236] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 404
		lococ41tModel[237] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 405
		lococ41tModel[238] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 406
		lococ41tModel[239] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 407
		lococ41tModel[240] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 408
		lococ41tModel[241] = new ModelRendererTurbo(this, 240, 112, textureX, textureY); // Box 326
		lococ41tModel[242] = new ModelRendererTurbo(this, 240, 112, textureX, textureY); // Box 328
		lococ41tModel[243] = new ModelRendererTurbo(this, 317, 89, textureX, textureY); // Box 329
		lococ41tModel[244] = new ModelRendererTurbo(this, 309, 88, textureX, textureY); // Box 330
		lococ41tModel[245] = new ModelRendererTurbo(this, 104, 109, textureX, textureY); // Box 332
		lococ41tModel[246] = new ModelRendererTurbo(this, 104, 109, textureX, textureY); // Box 333
		lococ41tModel[247] = new ModelRendererTurbo(this, 464, 94, textureX, textureY); // Box 336
		lococ41tModel[248] = new ModelRendererTurbo(this, 171, 98, textureX, textureY); // Box 304
		lococ41tModel[249] = new ModelRendererTurbo(this, 171, 98, textureX, textureY); // Box 305
		lococ41tModel[250] = new ModelRendererTurbo(this, 309, 84, textureX, textureY); // Box 306
		lococ41tModel[251] = new ModelRendererTurbo(this, 385, 33, textureX, textureY); // Box 307
		lococ41tModel[252] = new ModelRendererTurbo(this, 385, 33, textureX, textureY); // Box 308
		lococ41tModel[253] = new ModelRendererTurbo(this, 385, 33, textureX, textureY); // Box 309
		lococ41tModel[254] = new ModelRendererTurbo(this, 385, 33, textureX, textureY); // Box 310
		lococ41tModel[255] = new ModelRendererTurbo(this, 449, 33, textureX, textureY); // Box 312
		lococ41tModel[256] = new ModelRendererTurbo(this, 171, 98, textureX, textureY); // Box 313
		lococ41tModel[257] = new ModelRendererTurbo(this, 171, 98, textureX, textureY); // Box 314
		lococ41tModel[258] = new ModelRendererTurbo(this, 409, 33, textureX, textureY); // Box 314
		lococ41tModel[259] = new ModelRendererTurbo(this, 154, 10, textureX, textureY); // Box 315
		lococ41tModel[260] = new ModelRendererTurbo(this, 154, 11, textureX, textureY); // Box 316
		lococ41tModel[261] = new ModelRendererTurbo(this, 155, 10, textureX, textureY); // Box 317
		lococ41tModel[262] = new ModelRendererTurbo(this, 154, 9, textureX, textureY); // Box 318
		lococ41tModel[263] = new ModelRendererTurbo(this, 24, 14, textureX, textureY); // Box 319
		lococ41tModel[264] = new ModelRendererTurbo(this, 24, 14, textureX, textureY); // Box 323
		lococ41tModel[265] = new ModelRendererTurbo(this, 24, 14, textureX, textureY); // Box 325
		lococ41tModel[266] = new ModelRendererTurbo(this, 24, 14, textureX, textureY); // Box 327
		lococ41tModel[267] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 329
		lococ41tModel[268] = new ModelRendererTurbo(this, 309, 88, textureX, textureY); // Box 331
		lococ41tModel[269] = new ModelRendererTurbo(this, 309, 88, textureX, textureY); // Box 332
		lococ41tModel[270] = new ModelRendererTurbo(this, 306, 8, textureX, textureY); // Box 333
		lococ41tModel[271] = new ModelRendererTurbo(this, 330, 12, textureX, textureY); // Box 335
		lococ41tModel[272] = new ModelRendererTurbo(this, 330, 12, textureX, textureY); // Box 336
		lococ41tModel[273] = new ModelRendererTurbo(this, 307, 9, textureX, textureY); // Box 337
		lococ41tModel[274] = new ModelRendererTurbo(this, 24, 14, textureX, textureY); // Box 333
		lococ41tModel[275] = new ModelRendererTurbo(this, 209, 33, textureX, textureY); // Box 334
		lococ41tModel[276] = new ModelRendererTurbo(this, 169, 33, textureX, textureY); // Box 335
		lococ41tModel[277] = new ModelRendererTurbo(this, 121, 57, textureX, textureY); // Box 336
		lococ41tModel[278] = new ModelRendererTurbo(this, 121, 57, textureX, textureY); // Box 338
		lococ41tModel[279] = new ModelRendererTurbo(this, 121, 57, textureX, textureY); // Box 339
		lococ41tModel[280] = new ModelRendererTurbo(this, 121, 57, textureX, textureY); // Box 340
		lococ41tModel[281] = new ModelRendererTurbo(this, 121, 57, textureX, textureY); // Box 341
		lococ41tModel[282] = new ModelRendererTurbo(this, 121, 57, textureX, textureY); // Box 342
		lococ41tModel[283] = new ModelRendererTurbo(this, 265, 49, textureX, textureY); // Box 336
		lococ41tModel[284] = new ModelRendererTurbo(this, 233, 53, textureX, textureY); // Box 337
		lococ41tModel[285] = new ModelRendererTurbo(this, 239, 55, textureX, textureY); // Box 338
		lococ41tModel[286] = new ModelRendererTurbo(this, 121, 41, textureX, textureY); // Box 337
		lococ41tModel[287] = new ModelRendererTurbo(this, 121, 41, textureX, textureY); // Box 338
		lococ41tModel[288] = new ModelRendererTurbo(this, 145, 73, textureX, textureY); // Box 114
		lococ41tModel[289] = new ModelRendererTurbo(this, 385, 41, textureX, textureY); // Box 127
		lococ41tModel[290] = new ModelRendererTurbo(this, 145, 73, textureX, textureY); // Box 235
		lococ41tModel[291] = new ModelRendererTurbo(this, 145, 73, textureX, textureY); // Box 236
		lococ41tModel[292] = new ModelRendererTurbo(this, 145, 73, textureX, textureY); // Box 237
		lococ41tModel[293] = new ModelRendererTurbo(this, 145, 73, textureX, textureY); // Box 238
		lococ41tModel[294] = new ModelRendererTurbo(this, 145, 73, textureX, textureY); // Box 239
		lococ41tModel[295] = new ModelRendererTurbo(this, 145, 73, textureX, textureY); // Box 240
		lococ41tModel[296] = new ModelRendererTurbo(this, 145, 73, textureX, textureY); // Box 241
		lococ41tModel[297] = new ModelRendererTurbo(this, 145, 73, textureX, textureY); // Box 242
		lococ41tModel[298] = new ModelRendererTurbo(this, 145, 73, textureX, textureY); // Box 243
		lococ41tModel[299] = new ModelRendererTurbo(this, 145, 73, textureX, textureY); // Box 244
		lococ41tModel[300] = new ModelRendererTurbo(this, 145, 73, textureX, textureY); // Box 245
		lococ41tModel[301] = new ModelRendererTurbo(this, 145, 73, textureX, textureY); // Box 246
		lococ41tModel[302] = new ModelRendererTurbo(this, 145, 73, textureX, textureY); // Box 247
		lococ41tModel[303] = new ModelRendererTurbo(this, 145, 73, textureX, textureY); // Box 248
		lococ41tModel[304] = new ModelRendererTurbo(this, 145, 73, textureX, textureY); // Box 249
		lococ41tModel[305] = new ModelRendererTurbo(this, 145, 73, textureX, textureY); // Box 250
		lococ41tModel[306] = new ModelRendererTurbo(this, 145, 73, textureX, textureY); // Box 252
		lococ41tModel[307] = new ModelRendererTurbo(this, 145, 73, textureX, textureY); // Box 253
		lococ41tModel[308] = new ModelRendererTurbo(this, 145, 73, textureX, textureY); // Box 254
		lococ41tModel[309] = new ModelRendererTurbo(this, 145, 73, textureX, textureY); // Box 256
		lococ41tModel[310] = new ModelRendererTurbo(this, 145, 73, textureX, textureY); // Box 257
		lococ41tModel[311] = new ModelRendererTurbo(this, 145, 73, textureX, textureY); // Box 258
		lococ41tModel[312] = new ModelRendererTurbo(this, 145, 73, textureX, textureY); // Box 259
		lococ41tModel[313] = new ModelRendererTurbo(this, 337, 73, textureX, textureY); // Box 334
		lococ41tModel[314] = new ModelRendererTurbo(this, 385, 41, textureX, textureY); // Box 343
		lococ41tModel[315] = new ModelRendererTurbo(this, 385, 41, textureX, textureY); // Box 344
		lococ41tModel[316] = new ModelRendererTurbo(this, 385, 41, textureX, textureY); // Box 345
		lococ41tModel[317] = new ModelRendererTurbo(this, 385, 41, textureX, textureY); // Box 346
		lococ41tModel[318] = new ModelRendererTurbo(this, 385, 41, textureX, textureY); // Box 347
		lococ41tModel[319] = new ModelRendererTurbo(this, 385, 41, textureX, textureY); // Box 348
		lococ41tModel[320] = new ModelRendererTurbo(this, 385, 41, textureX, textureY); // Box 349
		lococ41tModel[321] = new ModelRendererTurbo(this, 385, 41, textureX, textureY); // Box 350
		lococ41tModel[322] = new ModelRendererTurbo(this, 385, 41, textureX, textureY); // Box 351
		lococ41tModel[323] = new ModelRendererTurbo(this, 385, 41, textureX, textureY); // Box 352
		lococ41tModel[324] = new ModelRendererTurbo(this, 337, 73, textureX, textureY); // Box 353
		lococ41tModel[325] = new ModelRendererTurbo(this, 385, 41, textureX, textureY); // Box 354
		lococ41tModel[326] = new ModelRendererTurbo(this, 385, 41, textureX, textureY); // Box 355
		lococ41tModel[327] = new ModelRendererTurbo(this, 385, 41, textureX, textureY); // Box 356
		lococ41tModel[328] = new ModelRendererTurbo(this, 385, 41, textureX, textureY); // Box 357
		lococ41tModel[329] = new ModelRendererTurbo(this, 385, 41, textureX, textureY); // Box 358
		lococ41tModel[330] = new ModelRendererTurbo(this, 385, 41, textureX, textureY); // Box 359
		lococ41tModel[331] = new ModelRendererTurbo(this, 385, 41, textureX, textureY); // Box 360
		lococ41tModel[332] = new ModelRendererTurbo(this, 385, 41, textureX, textureY); // Box 361
		lococ41tModel[333] = new ModelRendererTurbo(this, 385, 41, textureX, textureY); // Box 362
		lococ41tModel[334] = new ModelRendererTurbo(this, 460, 46, textureX, textureY); // Box 363
		lococ41tModel[335] = new ModelRendererTurbo(this, 485, 43, textureX, textureY); // Box 383
		lococ41tModel[336] = new ModelRendererTurbo(this, 485, 43, textureX, textureY); // Box 384
		lococ41tModel[337] = new ModelRendererTurbo(this, 485, 43, textureX, textureY); // Box 385
		lococ41tModel[338] = new ModelRendererTurbo(this, 483, 43, textureX, textureY); // Box 386
		lococ41tModel[339] = new ModelRendererTurbo(this, 485, 43, textureX, textureY); // Box 387
		lococ41tModel[340] = new ModelRendererTurbo(this, 485, 43, textureX, textureY); // Box 388
		lococ41tModel[341] = new ModelRendererTurbo(this, 485, 43, textureX, textureY); // Box 389
		lococ41tModel[342] = new ModelRendererTurbo(this, 304, 72, textureX, textureY); // Box 390
		lococ41tModel[343] = new ModelRendererTurbo(this, 304, 72, textureX, textureY); // Box 391
		lococ41tModel[344] = new ModelRendererTurbo(this, 309, 84, textureX, textureY); // Box 392
		lococ41tModel[345] = new ModelRendererTurbo(this, 304, 72, textureX, textureY); // Box 393
		lococ41tModel[346] = new ModelRendererTurbo(this, 304, 72, textureX, textureY); // Box 394
		lococ41tModel[347] = new ModelRendererTurbo(this, 483, 43, textureX, textureY); // Box 395
		lococ41tModel[348] = new ModelRendererTurbo(this, 485, 43, textureX, textureY); // Box 396
		lococ41tModel[349] = new ModelRendererTurbo(this, 485, 43, textureX, textureY); // Box 397
		lococ41tModel[350] = new ModelRendererTurbo(this, 485, 43, textureX, textureY); // Box 398
		lococ41tModel[351] = new ModelRendererTurbo(this, 485, 43, textureX, textureY); // Box 399
		lococ41tModel[352] = new ModelRendererTurbo(this, 485, 43, textureX, textureY); // Box 400
		lococ41tModel[353] = new ModelRendererTurbo(this, 485, 43, textureX, textureY); // Box 401
		lococ41tModel[354] = new ModelRendererTurbo(this, 322, 24, textureX, textureY); // Box 429
		lococ41tModel[355] = new ModelRendererTurbo(this, 322, 24, textureX, textureY); // Box 431
		lococ41tModel[356] = new ModelRendererTurbo(this, 293, 24, textureX, textureY); // Box 432
		lococ41tModel[357] = new ModelRendererTurbo(this, 348, 2, textureX, textureY); // Box 435
		lococ41tModel[358] = new ModelRendererTurbo(this, 348, 2, textureX, textureY); // Box 406
		lococ41tModel[359] = new ModelRendererTurbo(this, 322, 24, textureX, textureY); // Box 408
		lococ41tModel[360] = new ModelRendererTurbo(this, 293, 24, textureX, textureY); // Box 409
		lococ41tModel[361] = new ModelRendererTurbo(this, 322, 24, textureX, textureY); // Box 410
		lococ41tModel[362] = new ModelRendererTurbo(this, 392, 45, textureX, textureY); // Box 411
		lococ41tModel[363] = new ModelRendererTurbo(this, 393, 46, textureX, textureY); // Box 412
		lococ41tModel[364] = new ModelRendererTurbo(this, 393, 46, textureX, textureY); // Box 415
		lococ41tModel[365] = new ModelRendererTurbo(this, 392, 45, textureX, textureY); // Box 416
		lococ41tModel[366] = new ModelRendererTurbo(this, 145, 73, textureX, textureY); // Box 417
		lococ41tModel[367] = new ModelRendererTurbo(this, 390, 43, textureX, textureY); // Box 419
		lococ41tModel[368] = new ModelRendererTurbo(this, 390, 43, textureX, textureY); // Box 421
		lococ41tModel[369] = new ModelRendererTurbo(this, 342, 100, textureX, textureY); // Box 432
		lococ41tModel[370] = new ModelRendererTurbo(this, 342, 100, textureX, textureY); // Box 433
		lococ41tModel[371] = new ModelRendererTurbo(this, 370, 107, textureX, textureY); // Box 434
		lococ41tModel[372] = new ModelRendererTurbo(this, 390, 104, textureX, textureY); // Box 435
		lococ41tModel[373] = new ModelRendererTurbo(this, 389, 110, textureX, textureY); // Box 436
		lococ41tModel[374] = new ModelRendererTurbo(this, 395, 104, textureX, textureY); // Box 437
		lococ41tModel[375] = new ModelRendererTurbo(this, 381, 110, textureX, textureY); // Box 438
		lococ41tModel[376] = new ModelRendererTurbo(this, 396, 110, textureX, textureY); // Box 439
		lococ41tModel[377] = new ModelRendererTurbo(this, 382, 106, textureX, textureY); // Box 440
		lococ41tModel[378] = new ModelRendererTurbo(this, 360, 104, textureX, textureY); // Box 441
		lococ41tModel[379] = new ModelRendererTurbo(this, 360, 104, textureX, textureY); // Box 442
		lococ41tModel[380] = new ModelRendererTurbo(this, 360, 106, textureX, textureY); // Box 443
		lococ41tModel[381] = new ModelRendererTurbo(this, 360, 106, textureX, textureY); // Box 444
		lococ41tModel[382] = new ModelRendererTurbo(this, 357, 103, textureX, textureY); // Box 445
		lococ41tModel[383] = new ModelRendererTurbo(this, 368, 104, textureX, textureY); // Box 446
		lococ41tModel[384] = new ModelRendererTurbo(this, 368, 104, textureX, textureY); // Box 447
		lococ41tModel[385] = new ModelRendererTurbo(this, 368, 104, textureX, textureY); // Box 449
		lococ41tModel[386] = new ModelRendererTurbo(this, 402, 105, textureX, textureY); // Box 450
		lococ41tModel[387] = new ModelRendererTurbo(this, 402, 105, textureX, textureY); // Box 451
		lococ41tModel[388] = new ModelRendererTurbo(this, 402, 105, textureX, textureY); // Box 452
		lococ41tModel[389] = new ModelRendererTurbo(this, 341, 97, textureX, textureY, "lamp"); // Box 453
		lococ41tModel[390] = new ModelRendererTurbo(this, 390, 113, textureX, textureY); // Box 454
		lococ41tModel[391] = new ModelRendererTurbo(this, 390, 113, textureX, textureY); // Box 455
		lococ41tModel[392] = new ModelRendererTurbo(this, 32, 2, textureX, textureY); // Box 437
		lococ41tModel[393] = new ModelRendererTurbo(this, 38, 5, textureX, textureY); // Box 440
		lococ41tModel[394] = new ModelRendererTurbo(this, 38, 5, textureX, textureY); // Box 441
		lococ41tModel[395] = new ModelRendererTurbo(this, 38, 5, textureX, textureY); // Box 448
		lococ41tModel[396] = new ModelRendererTurbo(this, 38, 5, textureX, textureY); // Box 460
		lococ41tModel[397] = new ModelRendererTurbo(this, 32, 2, textureX, textureY); // Box 461
		lococ41tModel[398] = new ModelRendererTurbo(this, 38, 5, textureX, textureY); // Box 462
		lococ41tModel[399] = new ModelRendererTurbo(this, 38, 5, textureX, textureY); // Box 463
		lococ41tModel[400] = new ModelRendererTurbo(this, 32, 2, textureX, textureY); // Box 392
		lococ41tModel[401] = new ModelRendererTurbo(this, 38, 5, textureX, textureY); // Box 393
		lococ41tModel[402] = new ModelRendererTurbo(this, 38, 5, textureX, textureY); // Box 394
		lococ41tModel[403] = new ModelRendererTurbo(this, 38, 5, textureX, textureY); // Box 395
		lococ41tModel[404] = new ModelRendererTurbo(this, 38, 5, textureX, textureY); // Box 396
		lococ41tModel[405] = new ModelRendererTurbo(this, 32, 2, textureX, textureY); // Box 397
		lococ41tModel[406] = new ModelRendererTurbo(this, 38, 5, textureX, textureY); // Box 398
		lococ41tModel[407] = new ModelRendererTurbo(this, 38, 5, textureX, textureY); // Box 399
		lococ41tModel[408] = new ModelRendererTurbo(this, 32, 2, textureX, textureY); // Box 400
		lococ41tModel[409] = new ModelRendererTurbo(this, 38, 5, textureX, textureY); // Box 401
		lococ41tModel[410] = new ModelRendererTurbo(this, 38, 5, textureX, textureY); // Box 402
		lococ41tModel[411] = new ModelRendererTurbo(this, 38, 5, textureX, textureY); // Box 403
		lococ41tModel[412] = new ModelRendererTurbo(this, 38, 5, textureX, textureY); // Box 404
		lococ41tModel[413] = new ModelRendererTurbo(this, 32, 2, textureX, textureY); // Box 405
		lococ41tModel[414] = new ModelRendererTurbo(this, 38, 5, textureX, textureY); // Box 406
		lococ41tModel[415] = new ModelRendererTurbo(this, 38, 5, textureX, textureY); // Box 407
		lococ41tModel[416] = new ModelRendererTurbo(this, 32, 2, textureX, textureY); // Box 408
		lococ41tModel[417] = new ModelRendererTurbo(this, 38, 5, textureX, textureY); // Box 409
		lococ41tModel[418] = new ModelRendererTurbo(this, 38, 5, textureX, textureY); // Box 410
		lococ41tModel[419] = new ModelRendererTurbo(this, 38, 5, textureX, textureY); // Box 411
		lococ41tModel[420] = new ModelRendererTurbo(this, 38, 5, textureX, textureY); // Box 412
		lococ41tModel[421] = new ModelRendererTurbo(this, 32, 2, textureX, textureY); // Box 413
		lococ41tModel[422] = new ModelRendererTurbo(this, 38, 5, textureX, textureY); // Box 414
		lococ41tModel[423] = new ModelRendererTurbo(this, 38, 5, textureX, textureY); // Box 415
		lococ41tModel[424] = new ModelRendererTurbo(this, 385, 41, textureX, textureY); // Box 424
		lococ41tModel[425] = new ModelRendererTurbo(this, 385, 41, textureX, textureY); // Box 425
		lococ41tModel[426] = new ModelRendererTurbo(this, 233, 68, textureX, textureY); // Box 468
		lococ41tModel[427] = new ModelRendererTurbo(this, 233, 68, textureX, textureY); // Box 469
		lococ41tModel[428] = new ModelRendererTurbo(this, 310, 68, textureX, textureY); // Box 470
		lococ41tModel[429] = new ModelRendererTurbo(this, 310, 68, textureX, textureY); // Box 471
		lococ41tModel[430] = new ModelRendererTurbo(this, 233, 71, textureX, textureY); // Box 474
		lococ41tModel[431] = new ModelRendererTurbo(this, 233, 71, textureX, textureY); // Box 476
		lococ41tModel[432] = new ModelRendererTurbo(this, 238, 70, textureX, textureY); // Box 478
		lococ41tModel[433] = new ModelRendererTurbo(this, 121, 17, textureX, textureY); // Box 479
		lococ41tModel[434] = new ModelRendererTurbo(this, 121, 17, textureX, textureY); // Box 480
		lococ41tModel[435] = new ModelRendererTurbo(this, 233, 71, textureX, textureY); // Box 481
		lococ41tModel[436] = new ModelRendererTurbo(this, 233, 68, textureX, textureY); // Box 482
		lococ41tModel[437] = new ModelRendererTurbo(this, 233, 68, textureX, textureY); // Box 483
		lococ41tModel[438] = new ModelRendererTurbo(this, 310, 68, textureX, textureY); // Box 484
		lococ41tModel[439] = new ModelRendererTurbo(this, 310, 68, textureX, textureY); // Box 485
		lococ41tModel[440] = new ModelRendererTurbo(this, 121, 17, textureX, textureY); // Box 486
		lococ41tModel[441] = new ModelRendererTurbo(this, 121, 17, textureX, textureY); // Box 487
		lococ41tModel[442] = new ModelRendererTurbo(this, 233, 71, textureX, textureY); // Box 488
		lococ41tModel[443] = new ModelRendererTurbo(this, 233, 71, textureX, textureY); // Box 489
		lococ41tModel[444] = new ModelRendererTurbo(this, 233, 71, textureX, textureY); // Box 490
		lococ41tModel[445] = new ModelRendererTurbo(this, 238, 70, textureX, textureY); // Box 491
		lococ41tModel[446] = new ModelRendererTurbo(this, 121, 19, textureX, textureY); // Box 492
		lococ41tModel[447] = new ModelRendererTurbo(this, 121, 19, textureX, textureY); // Box 493
		lococ41tModel[448] = new ModelRendererTurbo(this, 121, 19, textureX, textureY); // Box 494
		lococ41tModel[449] = new ModelRendererTurbo(this, 121, 19, textureX, textureY); // Box 495
		lococ41tModel[450] = new ModelRendererTurbo(this, 121, 19, textureX, textureY); // Box 496
		lococ41tModel[451] = new ModelRendererTurbo(this, 38, 5, textureX, textureY); // Box 497
		lococ41tModel[452] = new ModelRendererTurbo(this, 233, 71, textureX, textureY); // Box 452
		lococ41tModel[453] = new ModelRendererTurbo(this, 233, 71, textureX, textureY); // Box 453

		lococ41tModel[0].addBox(0F, 0F, 0F, 11, 11, 0, 0F); // Box 6
		lococ41tModel[0].setRotationPoint(-20F, -1F, -5.01F);

		lococ41tModel[1].addBox(1F, 0F, 0F, 6, 6, 0, 0F); // Box 10
		lococ41tModel[1].setRotationPoint(-71F, 4F, -5.01F);

		lococ41tModel[2].addBox(0F, 0F, 0F, 6, 6, 0, 0F); // Box 11
		lococ41tModel[2].setRotationPoint(-70F, 4F, 5.01F);

		lococ41tModel[3].addBox(0F, 0F, 0F, 1, 21, 14, 0F); // Box 25
		lococ41tModel[3].setRotationPoint(-10F, -22F, -7F);

		lococ41tModel[4].addBox(0F, 0F, 0F, 1, 19, 1, 0F); // Box 26
		lococ41tModel[4].setRotationPoint(-10F, -20F, -10F);

		lococ41tModel[5].addBox(0F, 0F, 0F, 1, 19, 1, 0F); // Box 22
		lococ41tModel[5].setRotationPoint(-10F, -20F, 9F);

		lococ41tModel[6].addBox(0F, 0F, 0F, 1, 10, 2, 0F); // Box 23
		lococ41tModel[6].setRotationPoint(-10F, -11F, 7F);

		lococ41tModel[7].addBox(0F, 0F, 0F, 1, 10, 2, 0F); // Box 24
		lococ41tModel[7].setRotationPoint(-10F, -11F, -9F);

		lococ41tModel[8].addBox(0F, 0F, 0F, 1, 3, 2, 0F); // Box 25
		lococ41tModel[8].setRotationPoint(-10F, -21F, 7F);

		lococ41tModel[9].addBox(0F, 0F, 0F, 1, 3, 2, 0F); // Box 26
		lococ41tModel[9].setRotationPoint(-10F, -21F, -9F);

		lococ41tModel[10].addShapeBox(0F, 0F, 0F, 16, 1, 20, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
		lococ41tModel[10].setRotationPoint(-9F, -2F, -10F);

		lococ41tModel[11].addShapeBox(0F, 0F, 0F, 15, 9, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 28
		lococ41tModel[11].setRotationPoint(-9F, -11F, -10F);

		lococ41tModel[12].addShapeBox(0F, 0F, 0F, 15, 9, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 29
		lococ41tModel[12].setRotationPoint(-9F, -11F, 9F);

		lococ41tModel[13].addBox(0F, 0F, 0F, 16, 2, 1, 0F); // Box 30
		lococ41tModel[13].setRotationPoint(-9F, -20F, -10F);

		lococ41tModel[14].addBox(0F, 0F, 0F, 16, 2, 1, 0F); // Box 31
		lococ41tModel[14].setRotationPoint(-9F, -20F, 9F);

		lococ41tModel[15].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 32
		lococ41tModel[15].setRotationPoint(5F, -18F, 9F);

		lococ41tModel[16].addBox(0F, 0F, 0F, 2, 7, 1, 0F); // Box 33
		lococ41tModel[16].setRotationPoint(3F, -18F, 9F);

		lococ41tModel[17].addBox(0F, 0F, 0F, 2, 7, 1, 0F); // Box 34
		lococ41tModel[17].setRotationPoint(-9F, -18F, 9F);

		lococ41tModel[18].addBox(0F, 0F, 0F, 1, 7, 1, 0F); // Box 35
		lococ41tModel[18].setRotationPoint(-2F, -18F, 9F);

		lococ41tModel[19].addBox(0F, 0F, 0F, 2, 7, 1, 0F); // Box 36
		lococ41tModel[19].setRotationPoint(-9F, -18F, -10F);

		lococ41tModel[20].addBox(0F, 0F, 0F, 1, 7, 1, 0F); // Box 37
		lococ41tModel[20].setRotationPoint(-2F, -18F, -10F);

		lococ41tModel[21].addBox(0F, 0F, 0F, 2, 7, 1, 0F); // Box 38
		lococ41tModel[21].setRotationPoint(3F, -18F, -10F);

		lococ41tModel[22].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39
		lococ41tModel[22].setRotationPoint(5F, -18F, -10F);

		lococ41tModel[23].addBox(0F, -1F, 0F, 16, 1, 5, 0F); // Box 45
		lococ41tModel[23].setRotationPoint(-26F, -1F, 5F);

		lococ41tModel[24].addBox(0F, -1F, -6F, 12, 1, 5, 0F); // Box 46
		lococ41tModel[24].setRotationPoint(-22F, -1F, -4F);

		lococ41tModel[25].addBox(0F, -1F, 0F, 10, 1, 5, 0F); // Box 47
		lococ41tModel[25].setRotationPoint(-52F, -4F, 5F);

		lococ41tModel[26].addBox(0F, -1F, 0F, 10, 1, 5, 0F); // Box 48
		lococ41tModel[26].setRotationPoint(-52F, -4F, -10F);

		lococ41tModel[27].addShapeBox(0F, -1F, 0F, 12, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 49
		lococ41tModel[27].setRotationPoint(-64F, -1F, -10F);

		lococ41tModel[28].addShapeBox(0F, -1F, 0F, 12, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 50
		lococ41tModel[28].setRotationPoint(-64F, -1F, 5F);

		lococ41tModel[29].addBox(0F, -1F, 0F, 9, 1, 16, 0F); // Box 54
		lococ41tModel[29].setRotationPoint(-72F, 4F, -8F);

		lococ41tModel[30].addBox(0F, -1F, 0F, 15, 2, 2, 0F); // Box 59
		lococ41tModel[30].setRotationPoint(-43.5F, -17.5F, -1F);

		lococ41tModel[31].addBox(0F, 0F, 0F, 2, 4, 1, 0F); // Box 60
		lococ41tModel[31].setRotationPoint(-49F, -20F, -3F);

		lococ41tModel[32].addBox(0F, 0F, 0F, 53, 2, 8, 0F); // Box 62
		lococ41tModel[32].setRotationPoint(-62F, 2F, -4F);

		lococ41tModel[33].addBox(0F, -1F, 0F, 1, 6, 1, 0F); // Box 63
		lococ41tModel[33].setRotationPoint(-73F, 4F, -8F);

		lococ41tModel[34].addBox(0F, -1F, 0F, 1, 6, 1, 0F); // Box 64
		lococ41tModel[34].setRotationPoint(-73F, 4F, 7F);

		lococ41tModel[35].addBox(0F, -1F, 0F, 1, 12, 0, 0F); // Box 65
		lococ41tModel[35].setRotationPoint(-62F, -5F, -6F);
		lococ41tModel[35].rotateAngleY = 3.14159265F;
		lococ41tModel[35].rotateAngleZ = 0.61086524F;

		lococ41tModel[36].addBox(0F, -1F, 0F, 1, 12, 0, 0F); // Box 66
		lococ41tModel[36].setRotationPoint(-62F, -5F, 6F);
		lococ41tModel[36].rotateAngleY = 3.14159265F;
		lococ41tModel[36].rotateAngleZ = 0.61086524F;

		lococ41tModel[37].addBox(0F, 0F, 0F, 21, 9, 1, 0F); // Box 71
		lococ41tModel[37].setRotationPoint(10F, -22.65F, -4.63F);
		lococ41tModel[37].rotateAngleX = -1.57079633F;
		lococ41tModel[37].rotateAngleY = -3.14159265F;

		lococ41tModel[38].addBox(0F, 0F, 0F, 13, 5, 14, 0F); // Box 74
		lococ41tModel[38].setRotationPoint(-9F, -1F, -7F);
		lococ41tModel[38].rotateAngleZ = 0.05235988F;

		lococ41tModel[39].addBox(0F, -1F, 0F, 37, 1, 1, 0F); // Box 85
		lococ41tModel[39].setRotationPoint(-49F, 7F, -6F);

		lococ41tModel[40].addBox(0F, -1F, 0F, 5, 1, 1, 0F); // Box 86
		lococ41tModel[40].setRotationPoint(-54F, 5F, -7F);

		lococ41tModel[41].addBox(0F, -1F, 0F, 23, 1, 1, 0F); // Box 87
		lococ41tModel[41].setRotationPoint(-48F, 4.84F, -7F);
		lococ41tModel[41].rotateAngleZ = -0.09250245F;

		lococ41tModel[42].addBox(0F, -1F, 0F, 7, 1, 1, 0F); // Box 88
		lococ41tModel[42].setRotationPoint(-54F, 6.4F, -8F);

		lococ41tModel[43].addBox(0F, -1F, 0F, 7, 1, 1, 0F); // Box 89
		lococ41tModel[43].setRotationPoint(-54F, 3.4F, -8F);

		lococ41tModel[44].addBox(0F, -1F, 0F, 1, 3, 1, 0F); // Box 90
		lococ41tModel[44].setRotationPoint(-49F, 4F, -7F);

		lococ41tModel[45].addBox(0F, -1F, 0F, 7, 1, 1, 0F); // Box 91
		lococ41tModel[45].setRotationPoint(-54F, 3.4F, 7F);

		lococ41tModel[46].addBox(0F, -1F, 0F, 7, 1, 1, 0F); // Box 92
		lococ41tModel[46].setRotationPoint(-54F, 6.4F, 7F);

		lococ41tModel[47].addBox(0F, 0F, 0F, 37, 1, 1, 0F); // Box 93
		lococ41tModel[47].setRotationPoint(-53F, 2F, 5F);

		lococ41tModel[48].addBox(0F, -1F, 0F, 23, 1, 1, 0F); // Box 94
		lococ41tModel[48].setRotationPoint(-52F, 4.84F, 6F);
		lococ41tModel[48].rotateAngleZ = 0.08290314F;

		lococ41tModel[49].addBox(0F, -1F, 0F, 6, 1, 1, 0F); // Box 95
		lococ41tModel[49].setRotationPoint(-58F, 5F, 6F);

		lococ41tModel[50].addBox(0F, -1F, 0F, 1, 3, 1, 0F); // Box 96
		lococ41tModel[50].setRotationPoint(-53F, 4F, 6F);

		lococ41tModel[51].addBox(0F, -1F, 0F, 1, 5, 6, 0F); // Box 97
		lococ41tModel[51].setRotationPoint(-72F, 5F, -8F);

		lococ41tModel[52].addBox(-1F, -1F, 0F, 1, 1, 5, 0F); // Box 98
		lococ41tModel[52].setRotationPoint(-72F, 9F, -7F);

		lococ41tModel[53].addBox(-1F, -1F, 0F, 1, 1, 5, 0F); // Box 99
		lococ41tModel[53].setRotationPoint(-72F, 9F, 2F);

		lococ41tModel[54].addBox(0F, -1F, 0F, 1, 5, 6, 0F); // Box 100
		lococ41tModel[54].setRotationPoint(-72F, 5F, 2F);

		lococ41tModel[55].addBox(-1F, -1F, 0F, 1, 1, 4, 0F); // Box 102
		lococ41tModel[55].setRotationPoint(-71F, 5F, -2F);

		lococ41tModel[56].addBox(-1F, -1F, 0F, 4, 1, 2, 0F); // Box 104
		lococ41tModel[56].setRotationPoint(-74F, 6F, -1F);

		lococ41tModel[57].addBox(0F, 0F, 0F, 2, 2, 4, 0F); // Box 105
		lococ41tModel[57].setRotationPoint(-14F, -19F, -2F);

		lococ41tModel[58].addBox(0F, 0F, 0F, 0, 1, 1, 0F); // Box 106
		lococ41tModel[58].setRotationPoint(-14F, -17F, -2F);

		lococ41tModel[59].addBox(0F, 0F, 0F, 0, 1, 1, 0F); // Box 107
		lococ41tModel[59].setRotationPoint(-14F, -17F, 1F);

		lococ41tModel[60].addBox(0F, 0F, 0F, 0, 1, 1, 0F); // Box 108
		lococ41tModel[60].setRotationPoint(-12F, -17F, 1F);

		lococ41tModel[61].addBox(0F, 0F, 0F, 0, 1, 1, 0F); // Box 109
		lococ41tModel[61].setRotationPoint(-12F, -17F, -2F);

		lococ41tModel[62].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 110
		lococ41tModel[62].setRotationPoint(-14F, -21F, -2F);

		lococ41tModel[63].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 111
		lococ41tModel[63].setRotationPoint(-21F, -21F, -1F);

		lococ41tModel[64].addBox(0F, -1F, 0F, 1, 5, 1, 0F); // Box 118
		lococ41tModel[64].setRotationPoint(-48F, -1.6F, 7F);

		lococ41tModel[65].addBox(0F, -1F, 0F, 1, 5, 1, 0F); // Box 119
		lococ41tModel[65].setRotationPoint(-48F, -1.6F, -8F);

		lococ41tModel[66].addBox(0F, -1F, 0F, 1, 1, 14, 0F); // Box 120
		lococ41tModel[66].setRotationPoint(-48F, -1.6F, -7F);

		lococ41tModel[67].addBox(0F, 0F, 0F, 11, 5, 13, 0F); // Box 132
		lococ41tModel[67].setRotationPoint(-21F, -7F, -6.5F);

		lococ41tModel[68].addBox(0F, -1F, 0F, 7, 2, 2, 0F); // Box 133
		lococ41tModel[68].setRotationPoint(-51F, -3F, -9F);

		lococ41tModel[69].addBox(0F, 0F, 0F, 12, 4, 8, 0F); // Box 132
		lococ41tModel[69].setRotationPoint(-21F, -2F, -4F);

		lococ41tModel[70].addBox(0F, 0F, 0F, 8, 6, 8, 0F); // Box 133
		lococ41tModel[70].setRotationPoint(-62F, -4F, -4F);

		lococ41tModel[71].addBox(0F, -1F, 0F, 8, 2, 2, 0F); // Box 135
		lococ41tModel[71].setRotationPoint(-25F, 0F, 7F);

		lococ41tModel[72].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 131
		lococ41tModel[72].setRotationPoint(-13.4F, -21.83F, -2F);
		lococ41tModel[72].rotateAngleZ = -0.62831853F;

		lococ41tModel[73].addShapeBox(0F, 0F, 0F, 55, 2, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 1.5F, 0F, 0.5F, 1.5F, 0F, 0.5F, 1.5F, 0F, 0.5F, 1.5F); // Box 196
		lococ41tModel[73].setRotationPoint(-65F, -15F, -5F);

		lococ41tModel[74].addShapeBox(0F, 0F, 0F, 55, 2, 14, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 199
		lococ41tModel[74].setRotationPoint(-65F, -12.5F, -7F);

		lococ41tModel[75].addShapeBox(0F, 0F, 0F, 55, 2, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 197
		lococ41tModel[75].setRotationPoint(-65F, -8.5F, -7F);

		lococ41tModel[76].addShapeBox(0F, 0F, 0F, 55, 2, 10, 0F, 0F, 0.5F, 1.5F, 0F, 0.5F, 1.5F, 0F, 0.5F, 1.5F, 0F, 0.5F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 196
		lococ41tModel[76].setRotationPoint(-65F, -6F, -5F);

		lococ41tModel[77].addShapeBox(0F, 0F, 0F, 55, 2, 6, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 198
		lococ41tModel[77].setRotationPoint(-65F, -4F, -3F);

		lococ41tModel[78].addShapeBox(0F, 0F, 0F, 55, 2, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -2.5F, 0F, -1.5F, -2.5F, 0F, -1.5F, -2.5F, 0F, -1.5F, -2.5F); // Box 200
		lococ41tModel[78].setRotationPoint(-65F, -3F, -3F);

		lococ41tModel[79].addShapeBox(0F, 0F, 0F, 55, 2, 6, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 197
		lococ41tModel[79].setRotationPoint(-65F, -17F, -3F);

		lococ41tModel[80].addShapeBox(0F, 0F, 0F, 55, 2, 6, 0F, 0F, -1.5F, -2.5F, 0F, -1.5F, -2.5F, 0F, -1.5F, -2.5F, 0F, -1.5F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 198
		lococ41tModel[80].setRotationPoint(-65F, -18F, -3F);

		lococ41tModel[81].addShapeBox(0F, 0F, 0F, 55, 2, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 191
		lococ41tModel[81].setRotationPoint(-65F, -10.5F, -7F);

		lococ41tModel[82].addBox(0F, 0F, 0F, 2, 4, 1, 0F); // Box 195
		lococ41tModel[82].setRotationPoint(-49F, -20F, 2F);

		lococ41tModel[83].addBox(0F, 0F, 0F, 1, 4, 2, 0F); // Box 196
		lococ41tModel[83].setRotationPoint(-46F, -20F, -1F);

		lococ41tModel[84].addBox(0F, 0F, 0F, 1, 4, 2, 0F); // Box 197
		lococ41tModel[84].setRotationPoint(-51F, -20F, -1F);

		lococ41tModel[85].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 1F); // Box 198
		lococ41tModel[85].setRotationPoint(-51F, -20F, -3F);

		lococ41tModel[86].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 199
		lococ41tModel[86].setRotationPoint(-49F, -21F, -3F);

		lococ41tModel[87].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -1F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 1F); // Box 200
		lococ41tModel[87].setRotationPoint(-51F, -21F, -3F);

		lococ41tModel[88].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F, 1F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 201
		lococ41tModel[88].setRotationPoint(-46F, -20F, -3F);

		lococ41tModel[89].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 1F, 0F, -1F, -2F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 202
		lococ41tModel[89].setRotationPoint(-46F, -21F, -3F);

		lococ41tModel[90].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 203
		lococ41tModel[90].setRotationPoint(-51F, -21F, -1F);

		lococ41tModel[91].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 204
		lococ41tModel[91].setRotationPoint(-51F, -20F, 2F);

		lococ41tModel[92].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -2F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 205
		lococ41tModel[92].setRotationPoint(-51F, -21F, 2F);

		lococ41tModel[93].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 206
		lococ41tModel[93].setRotationPoint(-49F, -21F, 2F);

		lococ41tModel[94].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 207
		lococ41tModel[94].setRotationPoint(-46F, -21F, -1F);

		lococ41tModel[95].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, -1F); // Box 208
		lococ41tModel[95].setRotationPoint(-46F, -20F, 1F);

		lococ41tModel[96].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, -1F, 1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, -1F); // Box 209
		lococ41tModel[96].setRotationPoint(-46F, -21F, 1F);

		lococ41tModel[97].addBox(0F, 0F, 0F, 2, 4, 1, 0F); // Box 212
		lococ41tModel[97].setRotationPoint(-25F, -20F, -3F);

		lococ41tModel[98].addBox(0F, 0F, 0F, 1, 4, 2, 0F); // Box 213
		lococ41tModel[98].setRotationPoint(-27F, -20F, -1F);

		lococ41tModel[99].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 1F); // Box 214
		lococ41tModel[99].setRotationPoint(-27F, -20F, -3F);

		lococ41tModel[100].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 215
		lococ41tModel[100].setRotationPoint(-27F, -20F, 2F);

		lococ41tModel[101].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, -1F); // Box 216
		lococ41tModel[101].setRotationPoint(-22F, -20F, 1F);

		lococ41tModel[102].addBox(0F, 0F, 0F, 2, 4, 1, 0F); // Box 217
		lococ41tModel[102].setRotationPoint(-25F, -20F, 2F);

		lococ41tModel[103].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F, 1F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 218
		lococ41tModel[103].setRotationPoint(-22F, -20F, -3F);

		lococ41tModel[104].addBox(0F, 0F, 0F, 1, 4, 2, 0F); // Box 219
		lococ41tModel[104].setRotationPoint(-22F, -20F, -1F);

		lococ41tModel[105].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 1F, 0F, -1F, -2F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 220
		lococ41tModel[105].setRotationPoint(-22F, -21F, -3F);

		lococ41tModel[106].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 221
		lococ41tModel[106].setRotationPoint(-25F, -21F, -3F);

		lococ41tModel[107].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -1F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 1F); // Box 222
		lococ41tModel[107].setRotationPoint(-27F, -21F, -3F);

		lococ41tModel[108].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 223
		lococ41tModel[108].setRotationPoint(-27F, -21F, -1F);

		lococ41tModel[109].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -2F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 224
		lococ41tModel[109].setRotationPoint(-27F, -21F, 2F);

		lococ41tModel[110].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 225
		lococ41tModel[110].setRotationPoint(-25F, -21F, 2F);

		lococ41tModel[111].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, -1F, 1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, -1F); // Box 226
		lococ41tModel[111].setRotationPoint(-22F, -21F, 1F);

		lococ41tModel[112].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 227
		lococ41tModel[112].setRotationPoint(-22F, -21F, -1F);

		lococ41tModel[113].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 228
		lococ41tModel[113].setRotationPoint(-50F, -21F, -1F);

		lococ41tModel[114].addBox(0F, 0F, 0F, 2, 1, 4, 0F); // Box 229
		lococ41tModel[114].setRotationPoint(-49F, -21F, -2F);

		lococ41tModel[115].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 230
		lococ41tModel[115].setRotationPoint(-47F, -21F, -1F);

		lococ41tModel[116].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 231
		lococ41tModel[116].setRotationPoint(-26F, -21F, -1F);

		lococ41tModel[117].addBox(0F, 0F, 0F, 2, 1, 4, 0F); // Box 232
		lococ41tModel[117].setRotationPoint(-25F, -21F, -2F);

		lococ41tModel[118].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 233
		lococ41tModel[118].setRotationPoint(-23F, -21F, -1F);

		lococ41tModel[119].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 250
		lococ41tModel[119].setRotationPoint(-51F, -4.5F, -10.4F);

		lococ41tModel[120].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 251
		lococ41tModel[120].setRotationPoint(-51F, -3.5F, -10.4F);

		lococ41tModel[121].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 252
		lococ41tModel[121].setRotationPoint(-52F, -4F, -10.4F);

		lococ41tModel[122].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 254
		lococ41tModel[122].setRotationPoint(-52F, -4F, -9.9F);

		lococ41tModel[123].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, -0.5F, -0.5F, -1F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 256
		lococ41tModel[123].setRotationPoint(-38F, -4F, -10.4F);

		lococ41tModel[124].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 257
		lococ41tModel[124].setRotationPoint(-37F, -4F, -9.9F);

		lococ41tModel[125].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 261
		lococ41tModel[125].setRotationPoint(-51.5F, -17F, -1.5F);

		lococ41tModel[126].addShapeBox(-0.5F, 0F, 0F, 2, 2, 1, 0F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 263
		lococ41tModel[126].setRotationPoint(-51F, -17F, 2.5F);

		lococ41tModel[127].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 264
		lococ41tModel[127].setRotationPoint(-45.5F, -17F, -1.5F);

		lococ41tModel[128].addBox(0F, 0F, 0F, 3, 2, 1, 0F); // Box 265
		lococ41tModel[128].setRotationPoint(-49.5F, -17F, 2.5F);

		lococ41tModel[129].addBox(0F, 0F, 0F, 3, 2, 1, 0F); // Box 266
		lococ41tModel[129].setRotationPoint(-49.5F, -17F, -3.5F);

		lococ41tModel[130].addShapeBox(-0.5F, 0F, 0F, 2, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -1F, 0F, 1F, 0F, 0F, 0F); // Box 267
		lococ41tModel[130].setRotationPoint(-46F, -17F, -3.5F);

		lococ41tModel[131].addShapeBox(-0.5F, 0F, 0F, 2, 2, 1, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 1F); // Box 268
		lococ41tModel[131].setRotationPoint(-51F, -17F, -3.5F);

		lococ41tModel[132].addShapeBox(-0.5F, 0F, 0F, 2, 2, 1, 0F, 0F, 0F, 0F, -1F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 269
		lococ41tModel[132].setRotationPoint(-46F, -17F, 2.5F);

		lococ41tModel[133].addBox(0F, 0F, 0F, 3, 2, 1, 0F); // Box 270
		lococ41tModel[133].setRotationPoint(-25.5F, -17F, -3.5F);

		lococ41tModel[134].addShapeBox(-0.5F, 0F, 0F, 2, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -1F, 0F, 1F, 0F, 0F, 0F); // Box 271
		lococ41tModel[134].setRotationPoint(-22F, -17F, -3.5F);

		lococ41tModel[135].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 272
		lococ41tModel[135].setRotationPoint(-21.5F, -17F, -1.5F);

		lococ41tModel[136].addShapeBox(-0.5F, 0F, 0F, 2, 2, 1, 0F, 0F, 0F, 0F, -1F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 273
		lococ41tModel[136].setRotationPoint(-22F, -17F, 2.5F);

		lococ41tModel[137].addBox(0F, 0F, 0F, 3, 2, 1, 0F); // Box 274
		lococ41tModel[137].setRotationPoint(-25.5F, -17F, 2.5F);

		lococ41tModel[138].addShapeBox(-0.5F, 0F, 0F, 2, 2, 1, 0F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 275
		lococ41tModel[138].setRotationPoint(-27F, -17F, 2.5F);

		lococ41tModel[139].addShapeBox(-0.5F, 0F, 0F, 2, 2, 1, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 1F); // Box 276
		lococ41tModel[139].setRotationPoint(-27F, -17F, -3.5F);

		lococ41tModel[140].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 277
		lococ41tModel[140].setRotationPoint(-27.5F, -17F, -1.5F);

		lococ41tModel[141].addBox(0F, 0F, 0F, 1, 7, 2, 0F); // Box 272
		lococ41tModel[141].setRotationPoint(-61F, -23F, -1F);

		lococ41tModel[142].addBox(0F, 0F, 0F, 1, 7, 2, 0F); // Box 273
		lococ41tModel[142].setRotationPoint(-58F, -23F, -1F);

		lococ41tModel[143].addBox(0F, 0F, 0F, 2, 7, 1, 0F); // Box 275
		lococ41tModel[143].setRotationPoint(-60F, -23F, -2F);

		lococ41tModel[144].addBox(0F, 0F, 0F, 2, 7, 1, 0F); // Box 276
		lococ41tModel[144].setRotationPoint(-60F, -23F, 1F);

		lococ41tModel[145].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 277
		lococ41tModel[145].setRotationPoint(-61F, -23F, -2F);

		lococ41tModel[146].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 278
		lococ41tModel[146].setRotationPoint(-61F, -23F, 1F);

		lococ41tModel[147].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 279
		lococ41tModel[147].setRotationPoint(-58F, -23F, 1F);

		lococ41tModel[148].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 280
		lococ41tModel[148].setRotationPoint(-58F, -23F, -2F);

		lococ41tModel[149].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 279
		lococ41tModel[149].setRotationPoint(-50.5F, -7F, -7.9F);

		lococ41tModel[150].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 280
		lococ41tModel[150].setRotationPoint(-50.5F, -10.5F, -7.9F);

		lococ41tModel[151].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, -0.1F, -1F, -0.5F, -0.1F, -1F, -0.5F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 281
		lococ41tModel[151].setRotationPoint(-50.5F, -13F, -7.9F);

		lococ41tModel[152].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, -0.1F, -2F, -0.5F, -0.1F, -2F, -0.5F, -0.5F, 1.5F, 0F, -0.5F, 1.5F, 0F, -0.4F, -0.5F, -0.5F, -0.4F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 282
		lococ41tModel[152].setRotationPoint(-50.5F, -15.5F, -7.4F);

		lococ41tModel[153].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, -2F, 0.5F, -0.5F, -2F, 0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 1.5F, 0F, -0.5F, 1.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 285
		lococ41tModel[153].setRotationPoint(-50.5F, -17.38F, -4.9F);

		lococ41tModel[154].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 286
		lococ41tModel[154].setRotationPoint(-50.5F, -10.5F, 6.4F);

		lococ41tModel[155].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, -0.5F, 0.5F, -0.5F, -0.5F, 0.5F, -0.5F, -0.1F, -1F, 0F, -0.1F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 287
		lococ41tModel[155].setRotationPoint(-50.5F, -13F, 6.9F);

		lococ41tModel[156].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, -0.5F, 1.5F, -0.5F, -0.5F, 1.5F, -0.5F, -0.1F, -2F, 0F, -0.1F, -2F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.4F, -0.5F, 0F, -0.4F, -0.5F); // Box 288
		lococ41tModel[156].setRotationPoint(-50.5F, -15.5F, 6.4F);

		lococ41tModel[157].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -2F, 0.5F, 0F, -2F, 0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 1.5F, 0F, 0F, 1.5F, 0F); // Box 290
		lococ41tModel[157].setRotationPoint(-50.5F, -17.38F, 1.9F);

		lococ41tModel[158].addShapeBox(0F, 0F, 0F, 15, 1, 1, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 292
		lococ41tModel[158].setRotationPoint(-24.5F, -9.5F, -8.4F);

		lococ41tModel[159].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 293
		lococ41tModel[159].setRotationPoint(-24.5F, -9F, -8.4F);

		lococ41tModel[160].addShapeBox(0F, 0F, 0F, 22, 1, 1, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 295
		lococ41tModel[160].setRotationPoint(-36F, -10.5F, -8.4F);

		lococ41tModel[161].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 296
		lococ41tModel[161].setRotationPoint(-36F, -10F, -8.4F);

		lococ41tModel[162].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 297
		lococ41tModel[162].setRotationPoint(-37F, -4F, -8.4F);

		lococ41tModel[163].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, -0.1F, -1.5F, -0.5F, -0.1F, -1.5F, -0.5F, -0.5F, 0.9F, 0F, -0.5F, 0.9F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 299
		lococ41tModel[163].setRotationPoint(-14.5F, -13F, -8.37F);

		lococ41tModel[164].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, -0.6F, -2F, -0.5F, -0.1F, -2F, -0.5F, -0.5F, 1.5F, 0F, -1F, 1.5F, 0F, -0.4F, -0.5F, -0.5F, -0.4F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 300
		lococ41tModel[164].setRotationPoint(-14.5F, -15.5F, -7.4F);

		lococ41tModel[165].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.9F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 301
		lococ41tModel[165].setRotationPoint(-14F, -15.9F, -5.9F);

		lococ41tModel[166].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 308
		lococ41tModel[166].setRotationPoint(-36F, -4F, -8.4F);

		lococ41tModel[167].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, -1F, -0.5F, -0.5F, -1F, -0.5F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 325
		lococ41tModel[167].setRotationPoint(-27.5F, -7F, -8F);

		lococ41tModel[168].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 329
		lococ41tModel[168].setRotationPoint(-43.5F, -7F, -7.9F);

		lococ41tModel[169].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 330
		lococ41tModel[169].setRotationPoint(-43.75F, -7.5F, -7.9F);

		lococ41tModel[170].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 333
		lococ41tModel[170].setRotationPoint(-50.5F, -7F, 6.4F);

		lococ41tModel[171].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 336
		lococ41tModel[171].setRotationPoint(-43.5F, -7F, 6.6F);

		lococ41tModel[172].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 337
		lococ41tModel[172].setRotationPoint(-43.75F, -7.5F, 6.6F);

		lococ41tModel[173].addShapeBox(0F, 0F, 0F, 31, 1, 1, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 327
		lococ41tModel[173].setRotationPoint(-43.5F, -6F, 6.6F);

		lococ41tModel[174].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 329
		lococ41tModel[174].setRotationPoint(-13F, -14.5F, 5.6F);

		lococ41tModel[175].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, -0.5F, -0.5F, -0.5F, -1F, -0.5F, -0.5F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 333
		lococ41tModel[175].setRotationPoint(-27.5F, -4F, 6.6F);

		lococ41tModel[176].addShapeBox(0F, 2F, 0F, 4, 1, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 334
		lococ41tModel[176].setRotationPoint(-27.5F, -2F, 6.6F);

		lococ41tModel[177].addShapeBox(0F, 0F, 0F, 16, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 335
		lococ41tModel[177].setRotationPoint(-17.5F, -0.5F, 7.6F);

		lococ41tModel[178].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 336
		lococ41tModel[178].setRotationPoint(-13F, -8.5F, 6.6F);

		lococ41tModel[179].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 339
		lococ41tModel[179].setRotationPoint(-13F, -13F, 7.1F);

		lococ41tModel[180].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 340
		lococ41tModel[180].setRotationPoint(-13F, -10.5F, 6.6F);

		lococ41tModel[181].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 341
		lococ41tModel[181].setRotationPoint(-13F, -14F, 5.6F);

		lococ41tModel[182].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 342
		lococ41tModel[182].setRotationPoint(-13F, -9F, 6.6F);

		lococ41tModel[183].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, -0.5F, -0.5F, -0.5F, -1F, -0.5F, -0.5F, -1F, 0F, 0F, -0.5F, 0F, -1F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, -1F, 0F, 0F); // Box 343
		lococ41tModel[183].setRotationPoint(-1.5F, -0.5F, 7.1F);

		lococ41tModel[184].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, -0.5F, -0.5F, -0.5F, -1F, -0.5F, -0.5F, -1F, 0F, 0F, -0.5F, 0F, -1F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, -1F, 0F, 0F); // Box 344
		lococ41tModel[184].setRotationPoint(-1.5F, -0.5F, -8.6F);

		lococ41tModel[185].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 345
		lococ41tModel[185].setRotationPoint(-6.5F, -0.5F, -8.1F);

		lococ41tModel[186].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 346
		lococ41tModel[186].setRotationPoint(-6.5F, -2F, -8.6F);

		lococ41tModel[187].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 347
		lococ41tModel[187].setRotationPoint(-61.5F, -17F, -2.5F);

		lococ41tModel[188].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 348
		lococ41tModel[188].setRotationPoint(-57.5F, -17F, 1.5F);

		lococ41tModel[189].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 349
		lococ41tModel[189].setRotationPoint(-57.5F, -17F, -2.5F);

		lococ41tModel[190].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 350
		lococ41tModel[190].setRotationPoint(-61.5F, -17F, 1.5F);

		lococ41tModel[191].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 351
		lococ41tModel[191].setRotationPoint(-60.5F, -17F, -2.5F);

		lococ41tModel[192].addBox(0F, 0F, 0F, 3, 2, 1, 0F); // Box 352
		lococ41tModel[192].setRotationPoint(-60.5F, -17F, 1.5F);

		lococ41tModel[193].addBox(0F, 0F, 0F, 1, 2, 3, 0F); // Box 353
		lococ41tModel[193].setRotationPoint(-61.5F, -17F, -1.5F);

		lococ41tModel[194].addBox(0F, 0F, 0F, 1, 2, 3, 0F); // Box 354
		lococ41tModel[194].setRotationPoint(-57.5F, -17F, -1.5F);

		lococ41tModel[195].addBox(0F, 0F, 0F, 2, 4, 2, 0F); // Box 356
		lococ41tModel[195].setRotationPoint(-68F, -20F, -1F);

		lococ41tModel[196].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 357
		lococ41tModel[196].setRotationPoint(-68F, -19F, -2F);

		lococ41tModel[197].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 359
		lococ41tModel[197].setRotationPoint(-68F, -19F, 1F);

		lococ41tModel[198].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 361
		lococ41tModel[198].setRotationPoint(-68F, -20F, -2F);

		lococ41tModel[199].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 362
		lococ41tModel[199].setRotationPoint(-68F, -20F, 1F);

		lococ41tModel[200].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 363
		lococ41tModel[200].setRotationPoint(-68F, -17F, 1F);

		lococ41tModel[201].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 364
		lococ41tModel[201].setRotationPoint(-68F, -17F, -2F);

		lococ41tModel[202].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 365
		lococ41tModel[202].setRotationPoint(-60F, -23F, -1F);

		lococ41tModel[203].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 367
		lococ41tModel[203].setRotationPoint(-68F, -16.5F, -1.9F);

		lococ41tModel[204].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 368
		lococ41tModel[204].setRotationPoint(-68F, -16.5F, 0.4F);

		lococ41tModel[205].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, -1F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 360
		lococ41tModel[205].setRotationPoint(-69F, -20F, -1F);

		lococ41tModel[206].addShapeBox(0F, 0F, 0F, 1, 10, 1, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 362
		lococ41tModel[206].setRotationPoint(4.5F, -13.5F, 9.5F);

		lococ41tModel[207].addShapeBox(0F, 0F, 0F, 1, 10, 1, 0F, 0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 365
		lococ41tModel[207].setRotationPoint(4.5F, -13.5F, -10.5F);

		lococ41tModel[208].addBox(0F, -1F, 0F, 0, 3, 6, 0F); // Box 396
		lococ41tModel[208].setRotationPoint(-65.02F, -11F, -3F);

		lococ41tModel[209].addShapeBox(0F, -1F, 0F, 1, 1, 1, 0F, 0F, -0.2F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, -0.2F); // Box 405
		lococ41tModel[209].setRotationPoint(-65.3F, -11F, -5F);

		lococ41tModel[210].addShapeBox(0F, -1F, 0F, 1, 1, 1, 0F, 0F, -0.2F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, -0.2F); // Box 378
		lococ41tModel[210].setRotationPoint(-65.3F, -7F, -5F);

		lococ41tModel[211].addShapeBox(0F, -1F, 0F, 1, 1, 1, 0F, 0F, -0.2F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, -0.2F); // Box 379
		lococ41tModel[211].setRotationPoint(-65.3F, -4F, -2.5F);

		lococ41tModel[212].addShapeBox(0F, -1F, 0F, 1, 1, 1, 0F, 0F, -0.2F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, -0.2F); // Box 380
		lococ41tModel[212].setRotationPoint(-65.3F, -4F, 1.5F);

		lococ41tModel[213].addShapeBox(0F, -1F, 0F, 1, 1, 1, 0F, 0F, -0.2F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, -0.2F); // Box 381
		lococ41tModel[213].setRotationPoint(-65.3F, -7F, 4F);

		lococ41tModel[214].addShapeBox(0F, -1F, 0F, 1, 1, 1, 0F, 0F, -0.2F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, -0.2F); // Box 382
		lococ41tModel[214].setRotationPoint(-65.3F, -11F, 4F);

		lococ41tModel[215].addShapeBox(0F, -1F, 0F, 1, 1, 1, 0F, 0F, -0.2F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, -0.2F); // Box 383
		lococ41tModel[215].setRotationPoint(-65.3F, -14F, 1.5F);

		lococ41tModel[216].addShapeBox(0F, -1F, 0F, 1, 1, 1, 0F, 0F, -0.2F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, -0.2F); // Box 384
		lococ41tModel[216].setRotationPoint(-65.3F, -14F, -2.5F);

		lococ41tModel[217].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 396
		lococ41tModel[217].setRotationPoint(-67F, -16.7F, -1.75F);

		lococ41tModel[218].addBox(0F, -1F, 0F, 0, 9, 4, 0F); // Box 390
		lococ41tModel[218].setRotationPoint(-65.01F, -13F, -2F);

		lococ41tModel[219].addBox(0F, -1F, 0F, 0, 5, 2, 0F); // Box 391
		lococ41tModel[219].setRotationPoint(-65.01F, -11F, 2F);

		lococ41tModel[220].addBox(0F, -1F, 0F, 0, 5, 2, 0F); // Box 397
		lococ41tModel[220].setRotationPoint(-65.01F, -11F, -4F);

		lococ41tModel[221].addShapeBox(0F, -1F, 0F, 0, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 398
		lococ41tModel[221].setRotationPoint(-65.01F, -13F, 2F);

		lococ41tModel[222].addShapeBox(0F, -1F, 0F, 0, 2, 2, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 401
		lococ41tModel[222].setRotationPoint(-65.01F, -13F, -4F);

		lococ41tModel[223].addShapeBox(0F, -1F, 0F, 0, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 402
		lococ41tModel[223].setRotationPoint(-65.01F, -6F, -4F);

		lococ41tModel[224].addShapeBox(0F, -1F, 0F, 0, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 403
		lococ41tModel[224].setRotationPoint(-65.01F, -6F, 2F);

		lococ41tModel[225].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 404
		lococ41tModel[225].setRotationPoint(-65.1F, -11F, -5.5F);

		lococ41tModel[226].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 405
		lococ41tModel[226].setRotationPoint(-65.1F, -9.5F, -5.5F);

		lococ41tModel[227].addShapeBox(0F, -1F, 0F, 1, 1, 1, 0F, 0F, -0.2F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, -0.2F); // Box 406
		lococ41tModel[227].setRotationPoint(-65.3F, -9F, 4.3F);

		lococ41tModel[228].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.2F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, -0.2F); // Box 407
		lococ41tModel[228].setRotationPoint(-65.3F, -6.1F, 3.1F);

		lococ41tModel[229].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.2F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, -0.2F); // Box 408
		lococ41tModel[229].setRotationPoint(-65.3F, -6.1F, -4.1F);

		lococ41tModel[230].addShapeBox(0F, -1F, 0F, 1, 1, 1, 0F, 0F, -0.2F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, -0.2F); // Box 409
		lococ41tModel[230].setRotationPoint(-65.3F, -3.5F, -0.5F);

		lococ41tModel[231].addShapeBox(0F, -1F, 0F, 1, 1, 1, 0F, 0F, -0.2F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, -0.2F); // Box 411
		lococ41tModel[231].setRotationPoint(-65.3F, -14.5F, -0.5F);

		lococ41tModel[232].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.2F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, -0.2F); // Box 412
		lococ41tModel[232].setRotationPoint(-65.3F, -14.1F, -4.1F);

		lococ41tModel[233].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.2F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, -0.2F); // Box 413
		lococ41tModel[233].setRotationPoint(-65.3F, -14.1F, 3.1F);

		lococ41tModel[234].addBox(0F, 0F, 0F, 11, 11, 0, 0F); // Box 402
		lococ41tModel[234].setRotationPoint(-32F, -1F, -5.01F);

		lococ41tModel[235].addBox(0F, 0F, 0F, 11, 11, 0, 0F); // Box 403
		lococ41tModel[235].setRotationPoint(-44F, -1F, -5.01F);

		lococ41tModel[236].addBox(0F, 0F, 0F, 11, 11, 0, 0F); // Box 404
		lococ41tModel[236].setRotationPoint(-56F, -1F, -5.01F);

		lococ41tModel[237].addBox(0F, 0F, 0F, 11, 11, 0, 0F); // Box 405
		lococ41tModel[237].setRotationPoint(-56F, -1F, 5.01F);

		lococ41tModel[238].addBox(0F, 0F, 0F, 11, 11, 0, 0F); // Box 406
		lococ41tModel[238].setRotationPoint(-44F, -1F, 5.01F);

		lococ41tModel[239].addBox(0F, 0F, 0F, 11, 11, 0, 0F); // Box 407
		lococ41tModel[239].setRotationPoint(-32F, -1F, 5.01F);

		lococ41tModel[240].addBox(0F, 0F, 0F, 11, 11, 0, 0F); // Box 408
		lococ41tModel[240].setRotationPoint(-20F, -1F, 5.01F);

		lococ41tModel[241].addBox(0F, 0F, 0F, 16, 10, 3, 0F); // Box 326
		lococ41tModel[241].setRotationPoint(-42F, -11F, 7F);

		lococ41tModel[242].addBox(0F, 0F, 0F, 16, 10, 3, 0F); // Box 328
		lococ41tModel[242].setRotationPoint(-42F, -11F, -10F);

		lococ41tModel[243].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 329
		lococ41tModel[243].setRotationPoint(-45F, -4F, -10.4F);

		lococ41tModel[244].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 330
		lococ41tModel[244].setRotationPoint(-43.5F, -4F, -9.9F);

		lococ41tModel[245].addBox(0F, 0F, 0F, 7, 2, 1, 0F); // Box 332
		lococ41tModel[245].setRotationPoint(-62F, 2F, -5F);

		lococ41tModel[246].addBox(0F, 0F, 0F, 7, 2, 1, 0F); // Box 333
		lococ41tModel[246].setRotationPoint(-62F, 2F, 4F);

		lococ41tModel[247].addShapeBox(0F, 0F, 0F, 3, 11, 20, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 336
		lococ41tModel[247].setRotationPoint(7F, -12F, -10F);

		lococ41tModel[248].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 304
		lococ41tModel[248].setRotationPoint(7.5F, -11.5F, 9.5F);

		lococ41tModel[249].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F, 0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 305
		lococ41tModel[249].setRotationPoint(7.5F, -11.5F, -10.4F);

		lococ41tModel[250].addShapeBox(0F, 0F, 0F, 22, 1, 1, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 306
		lococ41tModel[250].setRotationPoint(-47.5F, -17.5F, -0.75F);

		lococ41tModel[251].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 307
		lococ41tModel[251].setRotationPoint(-42F, -17.5F, 0.5F);

		lococ41tModel[252].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 308
		lococ41tModel[252].setRotationPoint(-31F, -17.5F, 0.5F);

		lococ41tModel[253].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 309
		lococ41tModel[253].setRotationPoint(-42F, -17.5F, -2F);

		lococ41tModel[254].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 310
		lococ41tModel[254].setRotationPoint(-31F, -17.5F, -2F);

		lococ41tModel[255].addBox(-1F, -1F, 0F, 4, 1, 2, 0F); // Box 312
		lococ41tModel[255].setRotationPoint(5F, 1F, -1F);

		lococ41tModel[256].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F); // Box 313
		lococ41tModel[256].setRotationPoint(9.5F, -11.5F, -8.4F);

		lococ41tModel[257].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F); // Box 314
		lococ41tModel[257].setRotationPoint(9.5F, -11.5F, 7.6F);

		lococ41tModel[258].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 314
		lococ41tModel[258].setRotationPoint(-21F, -19F, -1F);

		lococ41tModel[259].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 315
		lococ41tModel[259].setRotationPoint(-10F, -22F, -9F);

		lococ41tModel[260].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 316
		lococ41tModel[260].setRotationPoint(-10F, -21F, -10F);

		lococ41tModel[261].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 317
		lococ41tModel[261].setRotationPoint(-10F, -21F, 9F);

		lococ41tModel[262].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 318
		lococ41tModel[262].setRotationPoint(-10F, -22F, 7F);

		lococ41tModel[263].addBox(0F, 0F, 0F, 1, 1, 10, 0F); // Box 319
		lococ41tModel[263].setRotationPoint(-51F, 4F, -5F);

		lococ41tModel[264].addBox(0F, 0F, 0F, 1, 1, 10, 0F); // Box 323
		lococ41tModel[264].setRotationPoint(-39F, 4F, -5F);

		lococ41tModel[265].addBox(0F, 0F, 0F, 1, 1, 10, 0F); // Box 325
		lococ41tModel[265].setRotationPoint(-27F, 4F, -5F);

		lococ41tModel[266].addBox(0F, 0F, 0F, 1, 1, 10, 0F); // Box 327
		lococ41tModel[266].setRotationPoint(-15F, 4F, -5F);

		lococ41tModel[267].addBox(0F, -1F, 0F, 7, 2, 2, 0F); // Box 329
		lococ41tModel[267].setRotationPoint(-51F, -3F, 7F);

		lococ41tModel[268].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F); // Box 331
		lococ41tModel[268].setRotationPoint(-51.5F, -5F, 7.25F);

		lococ41tModel[269].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F); // Box 332
		lococ41tModel[269].setRotationPoint(-44.5F, -5F, 7.25F);

		lococ41tModel[270].addShapeBox(0F, 0F, 0F, 1, 1, 14, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 333
		lococ41tModel[270].setRotationPoint(-71.5F, 1F, -7F);

		lococ41tModel[271].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 335
		lococ41tModel[271].setRotationPoint(-71.5F, 1.5F, 6F);

		lococ41tModel[272].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 336
		lococ41tModel[272].setRotationPoint(-71.5F, 1.5F, -7.5F);

		lococ41tModel[273].addShapeBox(0F, 0F, 0F, 1, 1, 13, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 337
		lococ41tModel[273].setRotationPoint(-71.5F, 1.7F, -6.5F);

		lococ41tModel[274].addBox(0F, 0F, 0F, 1, 1, 10, 0F); // Box 333
		lococ41tModel[274].setRotationPoint(-67.5F, 6.5F, -5F);

		lococ41tModel[275].addShapeBox(0F, 0F, 0F, 16, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 334
		lococ41tModel[275].setRotationPoint(-9F, -21F, 9F);

		lococ41tModel[276].addShapeBox(0F, 0F, 0F, 16, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 335
		lococ41tModel[276].setRotationPoint(-9F, -21F, -10F);

		lococ41tModel[277].addShapeBox(0F, 0F, 0F, 21, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.12F, -0.01F, 0F, -0.12F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F); // Box 336
		lococ41tModel[277].setRotationPoint(10F, -22.65F, 4.37F);
		lococ41tModel[277].rotateAngleX = -1.44862328F;
		lococ41tModel[277].rotateAngleY = -3.14159265F;

		lococ41tModel[278].addShapeBox(0F, 0F, 0F, 21, 3, 1, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.33F, -0.07F, 0F, -0.33F, -0.07F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F); // Box 338
		lococ41tModel[278].setRotationPoint(10F, -22.29F, 7.34F);
		lococ41tModel[278].rotateAngleX = -1.11701072F;
		lococ41tModel[278].rotateAngleY = -3.14159265F;

		lococ41tModel[279].addShapeBox(0F, 0F, 0F, 21, 3, 1, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.33F, -0.06F, 0F, -0.33F, -0.06F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F); // Box 339
		lococ41tModel[279].setRotationPoint(10F, -20.98F, 10.03F);
		lococ41tModel[279].rotateAngleX = -0.78539816F;
		lococ41tModel[279].rotateAngleY = -3.14159265F;

		lococ41tModel[280].addShapeBox(0F, 0F, 0F, 21, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.12F, -0.01F, 0F, -0.12F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F); // Box 340
		lococ41tModel[280].setRotationPoint(-11F, -22.65F, -4.63F);
		lococ41tModel[280].rotateAngleX = -1.44862328F;

		lococ41tModel[281].addShapeBox(0F, 0F, 0F, 21, 3, 1, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.33F, -0.07F, 0F, -0.33F, -0.07F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F); // Box 341
		lococ41tModel[281].setRotationPoint(-11F, -22.29F, -7.6F);
		lococ41tModel[281].rotateAngleX = -1.11701072F;

		lococ41tModel[282].addShapeBox(0F, 0F, 0F, 21, 3, 1, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.33F, -0.06F, 0F, -0.33F, -0.06F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F); // Box 342
		lococ41tModel[282].setRotationPoint(-11F, -20.98F, -10.29F);
		lococ41tModel[282].rotateAngleX = -0.78539816F;

		lococ41tModel[283].addBox(0F, 0F, 0F, 8, 2, 8, 0F); // Box 336
		lococ41tModel[283].setRotationPoint(-62F, 2F, -4F);

		lococ41tModel[284].addShapeBox(0F, 0F, 0F, 8, 2, 6, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 337
		lococ41tModel[284].setRotationPoint(-68F, 5F, -3F);

		lococ41tModel[285].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 338
		lococ41tModel[285].setRotationPoint(-62F, 4F, -1F);

		lococ41tModel[286].addShapeBox(0F, -1F, 0F, 1, 3, 5, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 337
		lococ41tModel[286].setRotationPoint(-53F, -4F, 5F);

		lococ41tModel[287].addShapeBox(0F, -1F, 0F, 1, 3, 5, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 338
		lococ41tModel[287].setRotationPoint(-53F, -4F, -10F);

		lococ41tModel[288].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 114
		lococ41tModel[288].setRotationPoint(-65.25F, -19F, -0.5F);

		lococ41tModel[289].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 127
		lococ41tModel[289].setRotationPoint(-64.01F, -14.45F, -7.45F);

		lococ41tModel[290].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 235
		lococ41tModel[290].setRotationPoint(-64.25F, -19F, 0.5F);

		lococ41tModel[291].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 236
		lococ41tModel[291].setRotationPoint(-64.25F, -19F, -1.5F);

		lococ41tModel[292].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 237
		lococ41tModel[292].setRotationPoint(-63.25F, -19F, -0.5F);

		lococ41tModel[293].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 238
		lococ41tModel[293].setRotationPoint(-65.25F, -20F, -0.5F);

		lococ41tModel[294].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 239
		lococ41tModel[294].setRotationPoint(-63.25F, -20F, -0.5F);

		lococ41tModel[295].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 240
		lococ41tModel[295].setRotationPoint(-64.25F, -20F, -1.5F);

		lococ41tModel[296].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 241
		lococ41tModel[296].setRotationPoint(-65.25F, -19F, -1.5F);

		lococ41tModel[297].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 242
		lococ41tModel[297].setRotationPoint(-65.25F, -20F, -1.5F);

		lococ41tModel[298].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 243
		lococ41tModel[298].setRotationPoint(-63.25F, -20F, -1.5F);

		lococ41tModel[299].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 244
		lococ41tModel[299].setRotationPoint(-63.25F, -19F, -1.5F);

		lococ41tModel[300].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 245
		lococ41tModel[300].setRotationPoint(-63.25F, -19F, 0.5F);

		lococ41tModel[301].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 246
		lococ41tModel[301].setRotationPoint(-65.25F, -19F, 0.5F);

		lococ41tModel[302].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 247
		lococ41tModel[302].setRotationPoint(-63.25F, -20F, 0.5F);

		lococ41tModel[303].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 248
		lococ41tModel[303].setRotationPoint(-65.25F, -20F, 0.5F);

		lococ41tModel[304].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 249
		lococ41tModel[304].setRotationPoint(-64.25F, -20F, 0.5F);

		lococ41tModel[305].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 250
		lococ41tModel[305].setRotationPoint(-65.75F, -18F, -1F);

		lococ41tModel[306].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 252
		lococ41tModel[306].setRotationPoint(-65.75F, -18F, -2F);

		lococ41tModel[307].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 253
		lococ41tModel[307].setRotationPoint(-65.75F, -18F, 1F);

		lococ41tModel[308].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 254
		lococ41tModel[308].setRotationPoint(-62.75F, -18F, 1F);

		lococ41tModel[309].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 256
		lococ41tModel[309].setRotationPoint(-62.75F, -18F, -1F);

		lococ41tModel[310].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 257
		lococ41tModel[310].setRotationPoint(-62.75F, -18F, -2F);

		lococ41tModel[311].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 258
		lococ41tModel[311].setRotationPoint(-64.75F, -18F, -1F);
		lococ41tModel[311].rotateAngleY = -1.57079633F;

		lococ41tModel[312].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 259
		lococ41tModel[312].setRotationPoint(-64.75F, -18F, 2F);
		lococ41tModel[312].rotateAngleY = -1.57079633F;

		lococ41tModel[313].addShapeBox(0F, 0F, 0F, 54, 1, 1, 0F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 334
		lococ41tModel[313].setRotationPoint(-64F, -14.5F, -7.5F);

		lococ41tModel[314].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 343
		lococ41tModel[314].setRotationPoint(-51.51F, -14.45F, -7.45F);

		lococ41tModel[315].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 344
		lococ41tModel[315].setRotationPoint(-39.51F, -14.45F, -7.45F);

		lococ41tModel[316].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 345
		lococ41tModel[316].setRotationPoint(-27.51F, -14.45F, -7.45F);

		lococ41tModel[317].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 346
		lococ41tModel[317].setRotationPoint(-15.51F, -14.45F, -7.45F);

		lococ41tModel[318].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, -0.6F, -0.5F, -0.7F, -0.6F, -0.5F, -0.7F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.1F, -0.5F, -0.7F, -0.1F, -0.5F, -0.7F, -0.1F, 0F, 0F, -0.1F, 0F); // Box 347
		lococ41tModel[318].setRotationPoint(-63.93F, -14.45F, -7.4F);

		lococ41tModel[319].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, -0.6F, -0.5F, -0.7F, -0.6F, -0.5F, -0.7F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.1F, -0.5F, -0.7F, -0.1F, -0.5F, -0.7F, -0.1F, 0F, 0F, -0.1F, 0F); // Box 348
		lococ41tModel[319].setRotationPoint(-51.41F, -14.45F, -7.4F);

		lococ41tModel[320].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, -0.6F, -0.5F, -0.7F, -0.6F, -0.5F, -0.7F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.1F, -0.5F, -0.7F, -0.1F, -0.5F, -0.7F, -0.1F, 0F, 0F, -0.1F, 0F); // Box 349
		lococ41tModel[320].setRotationPoint(-39.41F, -14.45F, -7.4F);

		lococ41tModel[321].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, -0.6F, -0.5F, -0.7F, -0.6F, -0.5F, -0.7F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.1F, -0.5F, -0.7F, -0.1F, -0.5F, -0.7F, -0.1F, 0F, 0F, -0.1F, 0F); // Box 350
		lococ41tModel[321].setRotationPoint(-27.41F, -14.45F, -7.4F);

		lococ41tModel[322].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, -0.6F, -0.5F, -0.7F, -0.6F, -0.5F, -0.7F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.1F, -0.5F, -0.7F, -0.1F, -0.5F, -0.7F, -0.1F, 0F, 0F, -0.1F, 0F); // Box 351
		lococ41tModel[322].setRotationPoint(-15.41F, -14.45F, -7.4F);

		lococ41tModel[323].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 352
		lococ41tModel[323].setRotationPoint(-15.51F, -14.45F, 5.9F);

		lococ41tModel[324].addShapeBox(0F, 0F, 0F, 54, 1, 1, 0F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 353
		lococ41tModel[324].setRotationPoint(-64F, -14.5F, 5.85F);

		lococ41tModel[325].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 354
		lococ41tModel[325].setRotationPoint(-27.51F, -14.45F, 5.9F);

		lococ41tModel[326].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 355
		lococ41tModel[326].setRotationPoint(-39.51F, -14.45F, 5.9F);

		lococ41tModel[327].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 356
		lococ41tModel[327].setRotationPoint(-51.51F, -14.45F, 5.9F);

		lococ41tModel[328].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 357
		lococ41tModel[328].setRotationPoint(-64.01F, -14.45F, 5.9F);

		lococ41tModel[329].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, -0.6F, -0.5F, -0.7F, -0.6F, -0.5F, -0.7F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.1F, -0.5F, -0.7F, -0.1F, -0.5F, -0.7F, -0.1F, 0F, 0F, -0.1F, 0F); // Box 358
		lococ41tModel[329].setRotationPoint(-63.93F, -14.45F, 4.6F);

		lococ41tModel[330].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, -0.6F, -0.5F, -0.7F, -0.6F, -0.5F, -0.7F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.1F, -0.5F, -0.7F, -0.1F, -0.5F, -0.7F, -0.1F, 0F, 0F, -0.1F, 0F); // Box 359
		lococ41tModel[330].setRotationPoint(-51.41F, -14.45F, 4.6F);

		lococ41tModel[331].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, -0.6F, -0.5F, -0.7F, -0.6F, -0.5F, -0.7F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.1F, -0.5F, -0.7F, -0.1F, -0.5F, -0.7F, -0.1F, 0F, 0F, -0.1F, 0F); // Box 360
		lococ41tModel[331].setRotationPoint(-39.41F, -14.45F, 4.6F);

		lococ41tModel[332].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, -0.6F, -0.5F, -0.7F, -0.6F, -0.5F, -0.7F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.1F, -0.5F, -0.7F, -0.1F, -0.5F, -0.7F, -0.1F, 0F, 0F, -0.1F, 0F); // Box 361
		lococ41tModel[332].setRotationPoint(-27.41F, -14.45F, 4.6F);

		lococ41tModel[333].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, -0.6F, -0.5F, -0.7F, -0.6F, -0.5F, -0.7F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.1F, -0.5F, -0.7F, -0.1F, -0.5F, -0.7F, -0.1F, 0F, 0F, -0.1F, 0F); // Box 362
		lococ41tModel[333].setRotationPoint(-15.41F, -14.45F, 4.6F);

		lococ41tModel[334].addShapeBox(-1F, -1F, 0F, 1, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 363
		lococ41tModel[334].setRotationPoint(-70F, 5F, -1F);

		lococ41tModel[335].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 383
		lococ41tModel[335].setRotationPoint(-24.5F, -7F, -8F);

		lococ41tModel[336].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 384
		lococ41tModel[336].setRotationPoint(-25.5F, -7F, -8F);

		lococ41tModel[337].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 385
		lococ41tModel[337].setRotationPoint(-23.5F, -7F, -8F);

		lococ41tModel[338].addBox(0F, 0F, 0F, 3, 2, 1, 0F); // Box 386
		lococ41tModel[338].setRotationPoint(-25.5F, -7F, -9F);

		lococ41tModel[339].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 387
		lococ41tModel[339].setRotationPoint(-23.5F, -7F, -10F);

		lococ41tModel[340].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 388
		lococ41tModel[340].setRotationPoint(-24.5F, -7F, -10F);

		lococ41tModel[341].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 389
		lococ41tModel[341].setRotationPoint(-25.5F, -7F, -10F);

		lococ41tModel[342].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, -1F, -0.5F, -0.5F, -1F, -0.5F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 390
		lococ41tModel[342].setRotationPoint(-25F, -6F, -10F);

		lococ41tModel[343].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, -1F, -0.5F, -0.5F, -1F, -0.5F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 391
		lococ41tModel[343].setRotationPoint(-23.5F, -6F, -10F);

		lococ41tModel[344].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 392
		lococ41tModel[344].setRotationPoint(-24.5F, -5F, -9F);

		lococ41tModel[345].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, -1F, -0.5F, -0.5F, -1F, -0.5F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 393
		lococ41tModel[345].setRotationPoint(-25F, -6F, -8.5F);

		lococ41tModel[346].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, -1F, -0.5F, -0.5F, -1F, -0.5F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 394
		lococ41tModel[346].setRotationPoint(-23.5F, -6F, -8.5F);

		lococ41tModel[347].addBox(0F, 0F, 0F, 3, 2, 1, 0F); // Box 395
		lococ41tModel[347].setRotationPoint(-25.5F, -4F, -9F);

		lococ41tModel[348].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 396
		lococ41tModel[348].setRotationPoint(-24.5F, -4F, -10F);

		lococ41tModel[349].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 397
		lococ41tModel[349].setRotationPoint(-23.5F, -4F, -10F);

		lococ41tModel[350].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 398
		lococ41tModel[350].setRotationPoint(-25.5F, -4F, -10F);

		lococ41tModel[351].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 399
		lococ41tModel[351].setRotationPoint(-25.5F, -4F, -8F);

		lococ41tModel[352].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 400
		lococ41tModel[352].setRotationPoint(-24.5F, -4F, -8F);

		lococ41tModel[353].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 401
		lococ41tModel[353].setRotationPoint(-23.5F, -4F, -8F);

		lococ41tModel[354].addShapeBox(0F, 0F, 0F, 9, 5, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 1F, 0F, -4F, 1F, 0F, -4F, 1F, 0F, -4F, 1F); // Box 429
		lococ41tModel[354].setRotationPoint(-63F, 2F, -8F);

		lococ41tModel[355].addShapeBox(0F, 0F, 0F, 9, 5, 3, 0F, 0F, -4F, 1F, 0F, -4F, 1F, 0F, -4F, 1F, 0F, -4F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 431
		lococ41tModel[355].setRotationPoint(-63F, 2F, -8F);

		lococ41tModel[356].addBox(0F, 0F, 0F, 9, 3, 5, 0F); // Box 432
		lococ41tModel[356].setRotationPoint(-63F, 3F, -9F);

		lococ41tModel[357].addBox(0F, 0F, 0F, 7, 2, 3, 0F); // Box 435
		lococ41tModel[357].setRotationPoint(-62F, 0F, -8F);

		lococ41tModel[358].addBox(0F, 0F, 0F, 7, 2, 3, 0F); // Box 406
		lococ41tModel[358].setRotationPoint(-62F, 0F, 5F);

		lococ41tModel[359].addShapeBox(0F, 0F, 0F, 9, 5, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 1F, 0F, -4F, 1F, 0F, -4F, 1F, 0F, -4F, 1F); // Box 408
		lococ41tModel[359].setRotationPoint(-63F, 2F, 5F);

		lococ41tModel[360].addBox(0F, 0F, 0F, 9, 3, 5, 0F); // Box 409
		lococ41tModel[360].setRotationPoint(-63F, 3F, 4F);

		lococ41tModel[361].addShapeBox(0F, 0F, 0F, 9, 5, 3, 0F, 0F, -4F, 1F, 0F, -4F, 1F, 0F, -4F, 1F, 0F, -4F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 410
		lococ41tModel[361].setRotationPoint(-63F, 2F, 5F);

		lococ41tModel[362].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, -0.6F, -0.5F, -0.7F, -0.6F, -0.5F, -0.7F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.1F, -0.5F, -0.7F, -0.1F, -0.5F, -0.7F, -0.1F, 0F, 0F, -0.1F, 0F); // Box 411
		lococ41tModel[362].setRotationPoint(-63.9F, -19.5F, 0.4F);

		lococ41tModel[363].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 412
		lococ41tModel[363].setRotationPoint(-64F, -19.5F, 1.7F);

		lococ41tModel[364].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 415
		lococ41tModel[364].setRotationPoint(-64F, -19.5F, -3.1F);

		lococ41tModel[365].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, -0.6F, -0.5F, -0.7F, -0.6F, -0.5F, -0.7F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.1F, -0.5F, -0.7F, -0.1F, -0.5F, -0.7F, -0.1F, 0F, 0F, -0.1F, 0F); // Box 416
		lococ41tModel[365].setRotationPoint(-63.9F, -19.5F, -3.05F);

		lococ41tModel[366].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 417
		lococ41tModel[366].setRotationPoint(-64.25F, -20F, -0.5F);

		lococ41tModel[367].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, -0.6F, -0.5F, -0.7F, -0.6F, -0.5F, -0.7F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.1F, -0.5F, -0.7F, -0.1F, -0.5F, -0.7F, -0.1F, 0F, 0F, -0.1F, 0F); // Box 419
		lococ41tModel[367].setRotationPoint(-63.9F, -19F, -1.6F);
		lococ41tModel[367].rotateAngleX = -1.57079633F;

		lococ41tModel[368].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, -0.6F, -0.5F, -0.7F, -0.6F, -0.5F, -0.7F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.1F, -0.5F, -0.7F, -0.1F, -0.5F, -0.7F, -0.1F, 0F, 0F, -0.1F, 0F); // Box 421
		lococ41tModel[368].setRotationPoint(-63.9F, -19F, 3.2F);
		lococ41tModel[368].rotateAngleX = -1.57079633F;

		lococ41tModel[369].addBox(0F, 0F, 0F, 1, 10, 12, 0F); // Box 432
		lococ41tModel[369].setRotationPoint(-9F, -12F, -6F);

		lococ41tModel[370].addShapeBox(0F, 0F, 0F, 1, 4, 12, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 433
		lococ41tModel[370].setRotationPoint(-9F, -16F, -6F);

		lococ41tModel[371].addBox(0F, 0F, 0F, 1, 1, 8, 0F); // Box 434
		lococ41tModel[371].setRotationPoint(-8.5F, -12F, -1F);
		lococ41tModel[371].rotateAngleX = -0.03490659F;
		lococ41tModel[371].rotateAngleY = -0.13962634F;

		lococ41tModel[372].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 435
		lococ41tModel[372].setRotationPoint(-7.5F, -7F, 8F);
		lococ41tModel[372].rotateAngleZ = -0.17453293F;

		lococ41tModel[373].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 436
		lococ41tModel[373].setRotationPoint(-9F, -3F, 8F);

		lococ41tModel[374].addBox(0F, 0F, 0F, 1, 3, 2, 0F); // Box 437
		lococ41tModel[374].setRotationPoint(-8.5F, -5F, 4F);

		lococ41tModel[375].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 438
		lococ41tModel[375].setRotationPoint(-8.5F, -6F, 4F);
		lococ41tModel[375].rotateAngleY = -0.15707963F;

		lococ41tModel[376].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 439
		lococ41tModel[376].setRotationPoint(-8.5F, -8F, 3.02F);
		lococ41tModel[376].rotateAngleY = -0.31415927F;

		lococ41tModel[377].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 440
		lococ41tModel[377].setRotationPoint(-8.5F, -7F, 3.01F);

		lococ41tModel[378].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 441
		lococ41tModel[378].setRotationPoint(-8.5F, -5F, -3F);

		lococ41tModel[379].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 442
		lococ41tModel[379].setRotationPoint(-8.5F, -5F, 2F);

		lococ41tModel[380].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 443
		lococ41tModel[380].setRotationPoint(-8.5F, -6F, -3F);

		lococ41tModel[381].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 444
		lococ41tModel[381].setRotationPoint(-8.5F, -6F, 2F);

		lococ41tModel[382].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 445
		lococ41tModel[382].setRotationPoint(-8.5F, -7F, -2F);

		lococ41tModel[383].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 446
		lococ41tModel[383].setRotationPoint(-8.5F, -15.5F, -3F);

		lococ41tModel[384].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 447
		lococ41tModel[384].setRotationPoint(-8.5F, -14.99F, 0F);

		lococ41tModel[385].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 449
		lococ41tModel[385].setRotationPoint(-8.5F, -11.5F, -5F);

		lococ41tModel[386].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 450
		lococ41tModel[386].setRotationPoint(-9.5F, -9F, -8F);

		lococ41tModel[387].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 451
		lococ41tModel[387].setRotationPoint(-9.5F, -6F, -9F);

		lococ41tModel[388].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 452
		lococ41tModel[388].setRotationPoint(-9.5F, -19F, -5F);

		lococ41tModel[389].addBox(0F, 0F, 0F, 1, 4, 4, 0F); // Box 453
		lococ41tModel[389].setRotationPoint(-8.7F, -6F, -2F);

		lococ41tModel[390].addBox(0F, 0F, 0F, 1, 5, 1, 0F); // Box 454
		lococ41tModel[390].setRotationPoint(-8.5F, -22F, 3F);

		lococ41tModel[391].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 455
		lococ41tModel[391].setRotationPoint(-8.5F, -22F, 1F);

		lococ41tModel[392].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F); // Box 437
		lococ41tModel[392].setRotationPoint(-43.5F, -1.25F, -4.05F);

		lococ41tModel[393].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 440
		lococ41tModel[393].setRotationPoint(-42.5F, -1.5F, -4.06F);

		lococ41tModel[394].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 441
		lococ41tModel[394].setRotationPoint(-35.5F, -1.5F, -4.06F);

		lococ41tModel[395].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 448
		lococ41tModel[395].setRotationPoint(-39F, -1.35F, -4.06F);

		lococ41tModel[396].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 460
		lococ41tModel[396].setRotationPoint(-35.5F, -1.5F, 3.06F);

		lococ41tModel[397].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F); // Box 461
		lococ41tModel[397].setRotationPoint(-43.5F, -1.25F, 3.05F);

		lococ41tModel[398].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 462
		lococ41tModel[398].setRotationPoint(-39F, -1.35F, 3.06F);

		lococ41tModel[399].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 463
		lococ41tModel[399].setRotationPoint(-42.5F, -1.5F, 3.06F);

		lococ41tModel[400].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F); // Box 392
		lococ41tModel[400].setRotationPoint(-55.5F, -1.25F, -4.05F);

		lococ41tModel[401].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 393
		lococ41tModel[401].setRotationPoint(-54.5F, -1.5F, -4.06F);

		lococ41tModel[402].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 394
		lococ41tModel[402].setRotationPoint(-51F, -1.35F, -4.06F);

		lococ41tModel[403].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 395
		lococ41tModel[403].setRotationPoint(-47.5F, -1.5F, -4.06F);

		lococ41tModel[404].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 396
		lococ41tModel[404].setRotationPoint(-54.5F, -1.5F, 3.06F);

		lococ41tModel[405].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F); // Box 397
		lococ41tModel[405].setRotationPoint(-55.5F, -1.25F, 3.05F);

		lococ41tModel[406].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 398
		lococ41tModel[406].setRotationPoint(-51F, -1.35F, 3.06F);

		lococ41tModel[407].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 399
		lococ41tModel[407].setRotationPoint(-47.5F, -1.5F, 3.06F);

		lococ41tModel[408].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F); // Box 400
		lococ41tModel[408].setRotationPoint(-31.5F, -1.25F, -4.05F);

		lococ41tModel[409].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 401
		lococ41tModel[409].setRotationPoint(-30.5F, -1.5F, -4.06F);

		lococ41tModel[410].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 402
		lococ41tModel[410].setRotationPoint(-27F, -1.35F, -4.06F);

		lococ41tModel[411].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 403
		lococ41tModel[411].setRotationPoint(-23.5F, -1.5F, -4.06F);

		lococ41tModel[412].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 404
		lococ41tModel[412].setRotationPoint(-30.5F, -1.5F, 3.06F);

		lococ41tModel[413].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F); // Box 405
		lococ41tModel[413].setRotationPoint(-31.5F, -1.25F, 3.05F);

		lococ41tModel[414].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 406
		lococ41tModel[414].setRotationPoint(-27F, -1.35F, 3.06F);

		lococ41tModel[415].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 407
		lococ41tModel[415].setRotationPoint(-23.5F, -1.5F, 3.06F);

		lococ41tModel[416].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F); // Box 408
		lococ41tModel[416].setRotationPoint(-19.5F, -1.25F, -4.05F);

		lococ41tModel[417].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 409
		lococ41tModel[417].setRotationPoint(-18.5F, -1.5F, -4.06F);

		lococ41tModel[418].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 410
		lococ41tModel[418].setRotationPoint(-15F, -1.35F, -4.06F);

		lococ41tModel[419].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 411
		lococ41tModel[419].setRotationPoint(-11.5F, -1.5F, -4.06F);

		lococ41tModel[420].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 412
		lococ41tModel[420].setRotationPoint(-18.5F, -1.5F, 3.06F);

		lococ41tModel[421].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F); // Box 413
		lococ41tModel[421].setRotationPoint(-19.5F, -1.25F, 3.05F);

		lococ41tModel[422].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 414
		lococ41tModel[422].setRotationPoint(-15F, -1.35F, 3.06F);

		lococ41tModel[423].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 415
		lococ41tModel[423].setRotationPoint(-11.5F, -1.5F, 3.06F);

		lococ41tModel[424].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 424
		lococ41tModel[424].setRotationPoint(-40.75F, -11.25F, -8.9F);

		lococ41tModel[425].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 425
		lococ41tModel[425].setRotationPoint(-40.75F, -11.25F, 8.1F);

		lococ41tModel[426].addShapeBox(0F, -1F, 0F, 37, 1, 1, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 468
		lococ41tModel[426].setRotationPoint(-49F, 7F, -7F);

		lococ41tModel[427].addShapeBox(0F, -1F, 0F, 37, 1, 1, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 469
		lococ41tModel[427].setRotationPoint(-49F, 7.75F, -7F);

		lococ41tModel[428].addShapeBox(0F, -1F, 0F, 23, 1, 1, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 470
		lococ41tModel[428].setRotationPoint(-48F, 4.84F, -8F);
		lococ41tModel[428].rotateAngleZ = -0.09250245F;

		lococ41tModel[429].addShapeBox(0F, -1F, 0F, 23, 1, 1, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 471
		lococ41tModel[429].setRotationPoint(-48F, 5.59F, -8F);
		lococ41tModel[429].rotateAngleZ = -0.09250245F;

		lococ41tModel[430].addShapeBox(0F, -1F, 0F, 1, 1, 1, 0F, 0F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.2F, 0F, 0.1F, 0.2F, 0F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.2F, 0F, 0.1F, 0.2F); // Box 474
		lococ41tModel[430].setRotationPoint(-13F, 7F, -6.2F);

		lococ41tModel[431].addShapeBox(0F, -1F, 0F, 1, 1, 1, 0F, 0F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.2F, 0F, 0.1F, 0.2F, 0F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.2F, 0F, 0.1F, 0.2F); // Box 476
		lococ41tModel[431].setRotationPoint(-37F, 7F, -6.2F);

		lococ41tModel[432].addShapeBox(0F, -1F, 0F, 1, 1, 2, 0F, 0F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.2F, 0F, 0.1F, 0.2F, 0F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.2F, 0F, 0.1F, 0.2F); // Box 478
		lococ41tModel[432].setRotationPoint(-25F, 7F, -7.2F);

		lococ41tModel[433].addShapeBox(0F, -1F, 0F, 5, 1, 1, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 479
		lococ41tModel[433].setRotationPoint(-54F, 5.75F, -8F);

		lococ41tModel[434].addShapeBox(0F, -1F, 0F, 5, 1, 1, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 480
		lococ41tModel[434].setRotationPoint(-54F, 4.75F, -8F);

		lococ41tModel[435].addShapeBox(0F, -1F, 0F, 1, 1, 1, 0F, 0.1F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.2F, 0.1F, 0.1F, 0.2F, 0.1F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.2F, 0.1F, 0.1F, 0.2F); // Box 481
		lococ41tModel[435].setRotationPoint(-48.9F, 4.85F, -7.2F);

		lococ41tModel[436].addShapeBox(0F, -1F, 0F, 37, 1, 1, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 482
		lococ41tModel[436].setRotationPoint(-53F, 3F, 5.25F);

		lococ41tModel[437].addShapeBox(0F, -1F, 0F, 37, 1, 1, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 483
		lococ41tModel[437].setRotationPoint(-53F, 3.75F, 5.25F);

		lococ41tModel[438].addShapeBox(0F, -1F, 0F, 23, 1, 1, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 484
		lococ41tModel[438].setRotationPoint(-52F, 5.59F, 6.25F);
		lococ41tModel[438].rotateAngleZ = 0.08290314F;

		lococ41tModel[439].addShapeBox(0F, -1F, 0F, 23, 1, 1, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 485
		lococ41tModel[439].setRotationPoint(-52F, 4.84F, 6.25F);
		lococ41tModel[439].rotateAngleZ = 0.08290314F;

		lococ41tModel[440].addShapeBox(0F, -1F, 0F, 5, 1, 1, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 486
		lococ41tModel[440].setRotationPoint(-58F, 5.75F, 6.25F);

		lococ41tModel[441].addShapeBox(0F, -1F, 0F, 5, 1, 1, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 487
		lococ41tModel[441].setRotationPoint(-58F, 4.75F, 6.25F);

		lococ41tModel[442].addShapeBox(0F, -1F, 0F, 1, 1, 1, 0F, 0.1F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.2F, 0.1F, 0.1F, 0.2F, 0.1F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.2F, 0.1F, 0.1F, 0.2F); // Box 488
		lococ41tModel[442].setRotationPoint(-52.9F, 4.85F, 6.1F);

		lococ41tModel[443].addShapeBox(0F, -1F, 0F, 1, 1, 1, 0F, 0F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.2F, 0F, 0.1F, 0.2F, 0F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.2F, 0F, 0.1F, 0.2F); // Box 489
		lococ41tModel[443].setRotationPoint(-41F, 3F, 5.1F);

		lococ41tModel[444].addShapeBox(0F, -1F, 0F, 1, 1, 1, 0F, 0F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.2F, 0F, 0.1F, 0.2F, 0F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.2F, 0F, 0.1F, 0.2F); // Box 490
		lococ41tModel[444].setRotationPoint(-17F, 3F, 5.1F);

		lococ41tModel[445].addShapeBox(0F, -1F, 0F, 1, 1, 2, 0F, 0F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.2F, 0F, 0.1F, 0.2F, 0F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.2F, 0F, 0.1F, 0.2F); // Box 491
		lococ41tModel[445].setRotationPoint(-29.18F, 3F, 5.1F);

		lococ41tModel[446].addShapeBox(0F, -1F, 0F, 23, 1, 1, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 492
		lococ41tModel[446].setRotationPoint(-55F, 1.5F, -7.5F);

		lococ41tModel[447].addShapeBox(0F, -1F, 0F, 23, 1, 1, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 493
		lococ41tModel[447].setRotationPoint(-55F, 1.5F, 5.5F);

		lococ41tModel[448].addShapeBox(0F, -1F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 494
		lococ41tModel[448].setRotationPoint(-32.4F, 1.9F, -7.51F);
		lococ41tModel[448].rotateAngleZ = 0.61086524F;

		lococ41tModel[449].addShapeBox(0F, -1F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 495
		lococ41tModel[449].setRotationPoint(-32.4F, 1.9F, 5.51F);
		lococ41tModel[449].rotateAngleZ = 0.61086524F;

		lococ41tModel[450].addShapeBox(0F, -1F, 0F, 13, 1, 1, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 496
		lococ41tModel[450].setRotationPoint(-33.7F, 2F, 6.3F);
		lococ41tModel[450].rotateAngleY = -1.57079633F;

		lococ41tModel[451].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 497
		lococ41tModel[451].setRotationPoint(-33.5F, 0F, -0.5F);

		lococ41tModel[452].addShapeBox(0F, -1F, 0F, 1, 1, 1, 0F, 0F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.2F, 0F, 0.1F, 0.2F, 0F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.2F, 0F, 0.1F, 0.2F); // Box 452
		lococ41tModel[452].setRotationPoint(-49.01F, 7F, -6.2F);

		lococ41tModel[453].addShapeBox(0F, -1F, 0F, 1, 1, 1, 0F, 0F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.2F, 0F, 0.1F, 0.2F, 0F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.2F, 0F, 0.1F, 0.2F); // Box 453
		lococ41tModel[453].setRotationPoint(-53.01F, 3F, 5.1F);

		fixRotation(lococ41tModel, false, true, true);
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		for(int i = 0; i < 454; i++)
		{
			if(lococ41tModel[i].boxName!= null && lococ41tModel[i].boxName.equals("lamp")){
				Minecraft.getMinecraft().entityRenderer.disableLightmap(1D);
				lococ41tModel[i].render(f5);
				Minecraft.getMinecraft().entityRenderer.enableLightmap(1D);

			} else {
				lococ41tModel[i].render(f5);
			}
		}
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
	{
	}

	public ModelRendererTurbo lococ41tModel[];
}