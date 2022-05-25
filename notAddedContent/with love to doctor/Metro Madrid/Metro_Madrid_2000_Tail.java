//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2022 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator:
// Created on:20.05.2022 - 20:57:41
// Last changed on: 20.05.2022 - 20:57:41

package com.flansmod.client.model.YourPackage;

import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.Entity;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelYourClassName extends ModelBase
{
	int textureX = 512;
	int textureY = 256;

	public ModelYourClassName()
	{
		yourclassnameModel = new ModelRendererTurbo[346];
		yourclassnameModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 44
		yourclassnameModel[1] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 171
		yourclassnameModel[2] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 277
		yourclassnameModel[3] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 278
		yourclassnameModel[4] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 32
		yourclassnameModel[5] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 33
		yourclassnameModel[6] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 174
		yourclassnameModel[7] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 175
		yourclassnameModel[8] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 182
		yourclassnameModel[9] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 183
		yourclassnameModel[10] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 184
		yourclassnameModel[11] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 185
		yourclassnameModel[12] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 93
		yourclassnameModel[13] = new ModelRendererTurbo(this, 233, 17, textureX, textureY); // Box 170
		yourclassnameModel[14] = new ModelRendererTurbo(this, 281, 17, textureX, textureY); // Box 171
		yourclassnameModel[15] = new ModelRendererTurbo(this, 305, 17, textureX, textureY); // Box 183
		yourclassnameModel[16] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 184
		yourclassnameModel[17] = new ModelRendererTurbo(this, 264, 17, textureX, textureY); // Box 201
		yourclassnameModel[18] = new ModelRendererTurbo(this, 368, 1, textureX, textureY); // Box 202
		yourclassnameModel[19] = new ModelRendererTurbo(this, 305, 25, textureX, textureY); // Box 210
		yourclassnameModel[20] = new ModelRendererTurbo(this, 129, 17, textureX, textureY); // Box 229
		yourclassnameModel[21] = new ModelRendererTurbo(this, 425, 17, textureX, textureY); // Box 230
		yourclassnameModel[22] = new ModelRendererTurbo(this, 449, 17, textureX, textureY); // Box 231
		yourclassnameModel[23] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 292
		yourclassnameModel[24] = new ModelRendererTurbo(this, 129, 9, textureX, textureY); // Box 293
		yourclassnameModel[25] = new ModelRendererTurbo(this, 137, 9, textureX, textureY); // Box 294
		yourclassnameModel[26] = new ModelRendererTurbo(this, 193, 9, textureX, textureY); // Box 295
		yourclassnameModel[27] = new ModelRendererTurbo(this, 153, 9, textureX, textureY); // Box 296
		yourclassnameModel[28] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 407
		yourclassnameModel[29] = new ModelRendererTurbo(this, 481, 17, textureX, textureY); // Box 411
		yourclassnameModel[30] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 235
		yourclassnameModel[31] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 236
		yourclassnameModel[32] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 238
		yourclassnameModel[33] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 37
		yourclassnameModel[34] = new ModelRendererTurbo(this, 177, 9, textureX, textureY); // Box 418
		yourclassnameModel[35] = new ModelRendererTurbo(this, 161, 9, textureX, textureY); // Box 419
		yourclassnameModel[36] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 421
		yourclassnameModel[37] = new ModelRendererTurbo(this, 217, 9, textureX, textureY); // Box 275
		yourclassnameModel[38] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 281
		yourclassnameModel[39] = new ModelRendererTurbo(this, 497, 17, textureX, textureY); // Box 292
		yourclassnameModel[40] = new ModelRendererTurbo(this, 9, 33, textureX, textureY); // Box 293
		yourclassnameModel[41] = new ModelRendererTurbo(this, 41, 33, textureX, textureY); // Box 294
		yourclassnameModel[42] = new ModelRendererTurbo(this, 57, 33, textureX, textureY); // Box 295
		yourclassnameModel[43] = new ModelRendererTurbo(this, 73, 33, textureX, textureY); // Box 296
		yourclassnameModel[44] = new ModelRendererTurbo(this, 73, 33, textureX, textureY); // Box 297
		yourclassnameModel[45] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 298
		yourclassnameModel[46] = new ModelRendererTurbo(this, 409, 9, textureX, textureY); // Box 299
		yourclassnameModel[47] = new ModelRendererTurbo(this, 129, 25, textureX, textureY); // Box 300
		yourclassnameModel[48] = new ModelRendererTurbo(this, 105, 33, textureX, textureY); // Box 305
		yourclassnameModel[49] = new ModelRendererTurbo(this, 169, 33, textureX, textureY); // Box 306
		yourclassnameModel[50] = new ModelRendererTurbo(this, 465, 25, textureX, textureY); // Box 307
		yourclassnameModel[51] = new ModelRendererTurbo(this, 185, 33, textureX, textureY); // Box 308
		yourclassnameModel[52] = new ModelRendererTurbo(this, 201, 33, textureX, textureY); // Box 309
		yourclassnameModel[53] = new ModelRendererTurbo(this, 201, 33, textureX, textureY); // Box 310
		yourclassnameModel[54] = new ModelRendererTurbo(this, 297, 33, textureX, textureY); // Box 311
		yourclassnameModel[55] = new ModelRendererTurbo(this, 233, 33, textureX, textureY); // Box 312
		yourclassnameModel[56] = new ModelRendererTurbo(this, 329, 33, textureX, textureY); // Box 313
		yourclassnameModel[57] = new ModelRendererTurbo(this, 345, 33, textureX, textureY); // Box 314
		yourclassnameModel[58] = new ModelRendererTurbo(this, 369, 33, textureX, textureY); // Box 315
		yourclassnameModel[59] = new ModelRendererTurbo(this, 361, 33, textureX, textureY); // Box 316
		yourclassnameModel[60] = new ModelRendererTurbo(this, 393, 33, textureX, textureY); // Box 317
		yourclassnameModel[61] = new ModelRendererTurbo(this, 385, 33, textureX, textureY); // Box 318
		yourclassnameModel[62] = new ModelRendererTurbo(this, 401, 41, textureX, textureY); // Box 319
		yourclassnameModel[63] = new ModelRendererTurbo(this, 121, 33, textureX, textureY); // Box 320
		yourclassnameModel[64] = new ModelRendererTurbo(this, 289, 17, textureX, textureY); // Box 321
		yourclassnameModel[65] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 332
		yourclassnameModel[66] = new ModelRendererTurbo(this, 449, 34, textureX, textureY); // Box 333
		yourclassnameModel[67] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 334
		yourclassnameModel[68] = new ModelRendererTurbo(this, 489, 33, textureX, textureY); // Box 360
		yourclassnameModel[69] = new ModelRendererTurbo(this, 129, 49, textureX, textureY); // Box 369
		yourclassnameModel[70] = new ModelRendererTurbo(this, 73, 41, textureX, textureY); // Box 386
		yourclassnameModel[71] = new ModelRendererTurbo(this, 152, 49, textureX, textureY); // Box 387
		yourclassnameModel[72] = new ModelRendererTurbo(this, 201, 41, textureX, textureY); // Box 388
		yourclassnameModel[73] = new ModelRendererTurbo(this, 49, 49, textureX, textureY); // Box 394
		yourclassnameModel[74] = new ModelRendererTurbo(this, 233, 49, textureX, textureY); // Box 395
		yourclassnameModel[75] = new ModelRendererTurbo(this, 441, 49, textureX, textureY); // Box 396
		yourclassnameModel[76] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 405
		yourclassnameModel[77] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 406
		yourclassnameModel[78] = new ModelRendererTurbo(this, 89, 33, textureX, textureY); // Box 407
		yourclassnameModel[79] = new ModelRendererTurbo(this, 81, 57, textureX, textureY); // Box 421
		yourclassnameModel[80] = new ModelRendererTurbo(this, 441, 9, textureX, textureY); // Box 422
		yourclassnameModel[81] = new ModelRendererTurbo(this, 273, 57, textureX, textureY); // Box 423
		yourclassnameModel[82] = new ModelRendererTurbo(this, 313, 57, textureX, textureY); // Box 424
		yourclassnameModel[83] = new ModelRendererTurbo(this, 217, 25, textureX, textureY); // Box 425
		yourclassnameModel[84] = new ModelRendererTurbo(this, 217, 33, textureX, textureY); // Box 428
		yourclassnameModel[85] = new ModelRendererTurbo(this, 145, 9, textureX, textureY); // Box 429
		yourclassnameModel[86] = new ModelRendererTurbo(this, 249, 17, textureX, textureY); // Box 430
		yourclassnameModel[87] = new ModelRendererTurbo(this, 345, 57, textureX, textureY); // Box 443
		yourclassnameModel[88] = new ModelRendererTurbo(this, 49, 65, textureX, textureY); // Box 444
		yourclassnameModel[89] = new ModelRendererTurbo(this, 345, 33, textureX, textureY); // Box 445
		yourclassnameModel[90] = new ModelRendererTurbo(this, 89, 65, textureX, textureY); // Box 446
		yourclassnameModel[91] = new ModelRendererTurbo(this, 409, 33, textureX, textureY); // Box 447
		yourclassnameModel[92] = new ModelRendererTurbo(this, 449, 17, textureX, textureY); // Box 219
		yourclassnameModel[93] = new ModelRendererTurbo(this, 473, 17, textureX, textureY); // Box 220
		yourclassnameModel[94] = new ModelRendererTurbo(this, 169, 65, textureX, textureY); // Box 219
		yourclassnameModel[95] = new ModelRendererTurbo(this, 177, 49, textureX, textureY); // Box 221
		yourclassnameModel[96] = new ModelRendererTurbo(this, 505, 33, textureX, textureY); // Box 223
		yourclassnameModel[97] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 225
		yourclassnameModel[98] = new ModelRendererTurbo(this, 377, 57, textureX, textureY); // Box 226
		yourclassnameModel[99] = new ModelRendererTurbo(this, 201, 65, textureX, textureY); // Box 227
		yourclassnameModel[100] = new ModelRendererTurbo(this, 193, 49, textureX, textureY); // Box 231
		yourclassnameModel[101] = new ModelRendererTurbo(this, 393, 49, textureX, textureY); // Box 232
		yourclassnameModel[102] = new ModelRendererTurbo(this, 505, 49, textureX, textureY); // Box 234
		yourclassnameModel[103] = new ModelRendererTurbo(this, 217, 65, textureX, textureY); // Box 235
		yourclassnameModel[104] = new ModelRendererTurbo(this, 41, 41, textureX, textureY); // Box 236
		yourclassnameModel[105] = new ModelRendererTurbo(this, 481, 17, textureX, textureY); // Box 237
		yourclassnameModel[106] = new ModelRendererTurbo(this, 313, 33, textureX, textureY); // Box 238
		yourclassnameModel[107] = new ModelRendererTurbo(this, 105, 33, textureX, textureY); // Box 239
		yourclassnameModel[108] = new ModelRendererTurbo(this, 169, 33, textureX, textureY); // Box 240
		yourclassnameModel[109] = new ModelRendererTurbo(this, 401, 33, textureX, textureY); // Box 241
		yourclassnameModel[110] = new ModelRendererTurbo(this, 249, 33, textureX, textureY); // Box 242
		yourclassnameModel[111] = new ModelRendererTurbo(this, 273, 49, textureX, textureY); // Box 243
		yourclassnameModel[112] = new ModelRendererTurbo(this, 265, 33, textureX, textureY); // Box 244
		yourclassnameModel[113] = new ModelRendererTurbo(this, 273, 33, textureX, textureY); // Box 245
		yourclassnameModel[114] = new ModelRendererTurbo(this, 281, 65, textureX, textureY); // Box 246
		yourclassnameModel[115] = new ModelRendererTurbo(this, 289, 65, textureX, textureY); // Box 247
		yourclassnameModel[116] = new ModelRendererTurbo(this, 305, 65, textureX, textureY); // Box 248
		yourclassnameModel[117] = new ModelRendererTurbo(this, 321, 65, textureX, textureY); // Box 249
		yourclassnameModel[118] = new ModelRendererTurbo(this, 337, 65, textureX, textureY); // Box 250
		yourclassnameModel[119] = new ModelRendererTurbo(this, 353, 65, textureX, textureY); // Box 251
		yourclassnameModel[120] = new ModelRendererTurbo(this, 393, 65, textureX, textureY); // Box 252
		yourclassnameModel[121] = new ModelRendererTurbo(this, 281, 49, textureX, textureY); // Box 253
		yourclassnameModel[122] = new ModelRendererTurbo(this, 489, 58, textureX, textureY); // Box 254
		yourclassnameModel[123] = new ModelRendererTurbo(this, 409, 65, textureX, textureY); // Box 255
		yourclassnameModel[124] = new ModelRendererTurbo(this, 273, 57, textureX, textureY); // Box 256
		yourclassnameModel[125] = new ModelRendererTurbo(this, 401, 49, textureX, textureY); // Box 257
		yourclassnameModel[126] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 258
		yourclassnameModel[127] = new ModelRendererTurbo(this, 433, 49, textureX, textureY); // Box 259
		yourclassnameModel[128] = new ModelRendererTurbo(this, 113, 57, textureX, textureY); // Box 260
		yourclassnameModel[129] = new ModelRendererTurbo(this, 345, 33, textureX, textureY); // Box 261
		yourclassnameModel[130] = new ModelRendererTurbo(this, 449, 49, textureX, textureY); // Box 262
		yourclassnameModel[131] = new ModelRendererTurbo(this, 361, 33, textureX, textureY); // Box 263
		yourclassnameModel[132] = new ModelRendererTurbo(this, 9, 57, textureX, textureY); // Box 264
		yourclassnameModel[133] = new ModelRendererTurbo(this, 385, 33, textureX, textureY); // Box 265
		yourclassnameModel[134] = new ModelRendererTurbo(this, 481, 41, textureX, textureY); // Box 266
		yourclassnameModel[135] = new ModelRendererTurbo(this, 49, 65, textureX, textureY); // Box 267
		yourclassnameModel[136] = new ModelRendererTurbo(this, 369, 65, textureX, textureY); // Box 268
		yourclassnameModel[137] = new ModelRendererTurbo(this, 409, 33, textureX, textureY); // Box 269
		yourclassnameModel[138] = new ModelRendererTurbo(this, 41, 57, textureX, textureY); // Box 270
		yourclassnameModel[139] = new ModelRendererTurbo(this, 89, 49, textureX, textureY); // Box 271
		yourclassnameModel[140] = new ModelRendererTurbo(this, 73, 66, textureX, textureY); // Box 272
		yourclassnameModel[141] = new ModelRendererTurbo(this, 417, 33, textureX, textureY); // Box 273
		yourclassnameModel[142] = new ModelRendererTurbo(this, 465, 33, textureX, textureY); // Box 274
		yourclassnameModel[143] = new ModelRendererTurbo(this, 97, 73, textureX, textureY); // Box 275
		yourclassnameModel[144] = new ModelRendererTurbo(this, 233, 73, textureX, textureY); // Box 276
		yourclassnameModel[145] = new ModelRendererTurbo(this, 89, 65, textureX, textureY); // Box 277
		yourclassnameModel[146] = new ModelRendererTurbo(this, 473, 33, textureX, textureY); // Box 278
		yourclassnameModel[147] = new ModelRendererTurbo(this, 481, 65, textureX, textureY); // Box 279
		yourclassnameModel[148] = new ModelRendererTurbo(this, 105, 49, textureX, textureY); // Box 280
		yourclassnameModel[149] = new ModelRendererTurbo(this, 481, 33, textureX, textureY); // Box 281
		yourclassnameModel[150] = new ModelRendererTurbo(this, 353, 66, textureX, textureY); // Box 282
		yourclassnameModel[151] = new ModelRendererTurbo(this, 489, 33, textureX, textureY); // Box 283
		yourclassnameModel[152] = new ModelRendererTurbo(this, 409, 73, textureX, textureY); // Box 284
		yourclassnameModel[153] = new ModelRendererTurbo(this, 441, 73, textureX, textureY); // Box 288
		yourclassnameModel[154] = new ModelRendererTurbo(this, 377, 73, textureX, textureY); // Box 290
		yourclassnameModel[155] = new ModelRendererTurbo(this, 489, 73, textureX, textureY); // Box 291
		yourclassnameModel[156] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 292
		yourclassnameModel[157] = new ModelRendererTurbo(this, 385, 73, textureX, textureY); // Box 295
		yourclassnameModel[158] = new ModelRendererTurbo(this, 17, 81, textureX, textureY); // Box 296
		yourclassnameModel[159] = new ModelRendererTurbo(this, 473, 73, textureX, textureY); // Box 297
		yourclassnameModel[160] = new ModelRendererTurbo(this, 49, 81, textureX, textureY); // Box 299
		yourclassnameModel[161] = new ModelRendererTurbo(this, 65, 81, textureX, textureY); // Box 300
		yourclassnameModel[162] = new ModelRendererTurbo(this, 505, 73, textureX, textureY); // Box 302
		yourclassnameModel[163] = new ModelRendererTurbo(this, 81, 81, textureX, textureY); // Box 303
		yourclassnameModel[164] = new ModelRendererTurbo(this, 89, 81, textureX, textureY); // Box 306
		yourclassnameModel[165] = new ModelRendererTurbo(this, 417, 81, textureX, textureY); // Box 1
		yourclassnameModel[166] = new ModelRendererTurbo(this, 289, 65, textureX, textureY); // Box 4
		yourclassnameModel[167] = new ModelRendererTurbo(this, 321, 65, textureX, textureY); // Box 5
		yourclassnameModel[168] = new ModelRendererTurbo(this, 233, 49, textureX, textureY); // Box 13
		yourclassnameModel[169] = new ModelRendererTurbo(this, 297, 49, textureX, textureY); // Box 14
		yourclassnameModel[170] = new ModelRendererTurbo(this, 113, 81, textureX, textureY); // Box 16
		yourclassnameModel[171] = new ModelRendererTurbo(this, 49, 41, textureX, textureY); // Box 28
		yourclassnameModel[172] = new ModelRendererTurbo(this, 113, 81, textureX, textureY); // Box 35
		yourclassnameModel[173] = new ModelRendererTurbo(this, 409, 41, textureX, textureY); // Box 39
		yourclassnameModel[174] = new ModelRendererTurbo(this, 113, 49, textureX, textureY); // Box 41
		yourclassnameModel[175] = new ModelRendererTurbo(this, 329, 49, textureX, textureY); // Box 45
		yourclassnameModel[176] = new ModelRendererTurbo(this, 305, 57, textureX, textureY); // Box 46
		yourclassnameModel[177] = new ModelRendererTurbo(this, 137, 81, textureX, textureY); // Box 47
		yourclassnameModel[178] = new ModelRendererTurbo(this, 489, 57, textureX, textureY); // Box 49
		yourclassnameModel[179] = new ModelRendererTurbo(this, 233, 73, textureX, textureY); // Box 56
		yourclassnameModel[180] = new ModelRendererTurbo(this, 393, 73, textureX, textureY); // Box 57
		yourclassnameModel[181] = new ModelRendererTurbo(this, 161, 65, textureX, textureY); // Box 58
		yourclassnameModel[182] = new ModelRendererTurbo(this, 217, 65, textureX, textureY); // Box 59
		yourclassnameModel[183] = new ModelRendererTurbo(this, 409, 49, textureX, textureY); // Box 60
		yourclassnameModel[184] = new ModelRendererTurbo(this, 489, 65, textureX, textureY); // Box 61
		yourclassnameModel[185] = new ModelRendererTurbo(this, 289, 49, textureX, textureY); // Box 62
		yourclassnameModel[186] = new ModelRendererTurbo(this, 441, 49, textureX, textureY); // Box 63
		yourclassnameModel[187] = new ModelRendererTurbo(this, 153, 81, textureX, textureY); // Box 41
		yourclassnameModel[188] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 42
		yourclassnameModel[189] = new ModelRendererTurbo(this, 169, 81, textureX, textureY); // Box 43
		yourclassnameModel[190] = new ModelRendererTurbo(this, 81, 65, textureX, textureY); // Box 44
		yourclassnameModel[191] = new ModelRendererTurbo(this, 473, 65, textureX, textureY); // Box 45
		yourclassnameModel[192] = new ModelRendererTurbo(this, 185, 81, textureX, textureY); // Box 45
		yourclassnameModel[193] = new ModelRendererTurbo(this, 201, 81, textureX, textureY); // Box 46
		yourclassnameModel[194] = new ModelRendererTurbo(this, 257, 81, textureX, textureY); // Box 43
		yourclassnameModel[195] = new ModelRendererTurbo(this, 265, 81, textureX, textureY); // Box 44
		yourclassnameModel[196] = new ModelRendererTurbo(this, 281, 81, textureX, textureY); // Box 45
		yourclassnameModel[197] = new ModelRendererTurbo(this, 65, 73, textureX, textureY); // Box 46
		yourclassnameModel[198] = new ModelRendererTurbo(this, 297, 81, textureX, textureY); // Box 47
		yourclassnameModel[199] = new ModelRendererTurbo(this, 305, 81, textureX, textureY); // Box 48
		yourclassnameModel[200] = new ModelRendererTurbo(this, 121, 57, textureX, textureY); // Box 53
		yourclassnameModel[201] = new ModelRendererTurbo(this, 505, 65, textureX, textureY); // Box 54
		yourclassnameModel[202] = new ModelRendererTurbo(this, 417, 81, textureX, textureY); // Box 57
		yourclassnameModel[203] = new ModelRendererTurbo(this, 417, 81, textureX, textureY); // Box 58
		yourclassnameModel[204] = new ModelRendererTurbo(this, 417, 81, textureX, textureY); // Box 59
		yourclassnameModel[205] = new ModelRendererTurbo(this, 89, 73, textureX, textureY); // Box 58
		yourclassnameModel[206] = new ModelRendererTurbo(this, 105, 73, textureX, textureY); // Box 59
		yourclassnameModel[207] = new ModelRendererTurbo(this, 369, 73, textureX, textureY); // Box 60
		yourclassnameModel[208] = new ModelRendererTurbo(this, 433, 81, textureX, textureY); // Box 61
		yourclassnameModel[209] = new ModelRendererTurbo(this, 481, 81, textureX, textureY); // Box 62
		yourclassnameModel[210] = new ModelRendererTurbo(this, 97, 89, textureX, textureY); // Box 63
		yourclassnameModel[211] = new ModelRendererTurbo(this, 105, 89, textureX, textureY); // Box 64
		yourclassnameModel[212] = new ModelRendererTurbo(this, 113, 89, textureX, textureY); // Box 65
		yourclassnameModel[213] = new ModelRendererTurbo(this, 121, 89, textureX, textureY); // Box 66
		yourclassnameModel[214] = new ModelRendererTurbo(this, 145, 89, textureX, textureY); // Box 362
		yourclassnameModel[215] = new ModelRendererTurbo(this, 185, 89, textureX, textureY); // Box 363
		yourclassnameModel[216] = new ModelRendererTurbo(this, 217, 89, textureX, textureY); // Box 364
		yourclassnameModel[217] = new ModelRendererTurbo(this, 137, 89, textureX, textureY); // Box 367
		yourclassnameModel[218] = new ModelRendererTurbo(this, 233, 89, textureX, textureY); // Box 368
		yourclassnameModel[219] = new ModelRendererTurbo(this, 177, 89, textureX, textureY); // Box 369
		yourclassnameModel[220] = new ModelRendererTurbo(this, 249, 89, textureX, textureY); // Box 370
		yourclassnameModel[221] = new ModelRendererTurbo(this, 265, 89, textureX, textureY); // Box 371
		yourclassnameModel[222] = new ModelRendererTurbo(this, 281, 89, textureX, textureY); // Box 372
		yourclassnameModel[223] = new ModelRendererTurbo(this, 297, 89, textureX, textureY); // Box 373
		yourclassnameModel[224] = new ModelRendererTurbo(this, 313, 89, textureX, textureY); // Box 374
		yourclassnameModel[225] = new ModelRendererTurbo(this, 329, 89, textureX, textureY); // Box 375
		yourclassnameModel[226] = new ModelRendererTurbo(this, 345, 89, textureX, textureY); // Box 376
		yourclassnameModel[227] = new ModelRendererTurbo(this, 361, 89, textureX, textureY); // Box 377
		yourclassnameModel[228] = new ModelRendererTurbo(this, 377, 89, textureX, textureY); // Box 378
		yourclassnameModel[229] = new ModelRendererTurbo(this, 393, 89, textureX, textureY); // Box 379
		yourclassnameModel[230] = new ModelRendererTurbo(this, 409, 89, textureX, textureY); // Box 380
		yourclassnameModel[231] = new ModelRendererTurbo(this, 425, 89, textureX, textureY); // Box 381
		yourclassnameModel[232] = new ModelRendererTurbo(this, 441, 89, textureX, textureY); // Box 382
		yourclassnameModel[233] = new ModelRendererTurbo(this, 457, 89, textureX, textureY); // Box 383
		yourclassnameModel[234] = new ModelRendererTurbo(this, 473, 89, textureX, textureY); // Box 384
		yourclassnameModel[235] = new ModelRendererTurbo(this, 489, 89, textureX, textureY); // Box 385
		yourclassnameModel[236] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 386
		yourclassnameModel[237] = new ModelRendererTurbo(this, 17, 97, textureX, textureY); // Box 387
		yourclassnameModel[238] = new ModelRendererTurbo(this, 33, 97, textureX, textureY); // Box 388
		yourclassnameModel[239] = new ModelRendererTurbo(this, 49, 97, textureX, textureY); // Box 389
		yourclassnameModel[240] = new ModelRendererTurbo(this, 65, 97, textureX, textureY); // Box 397
		yourclassnameModel[241] = new ModelRendererTurbo(this, 97, 97, textureX, textureY); // Box 398
		yourclassnameModel[242] = new ModelRendererTurbo(this, 345, 97, textureX, textureY); // Box 399
		yourclassnameModel[243] = new ModelRendererTurbo(this, 129, 105, textureX, textureY); // Box 400
		yourclassnameModel[244] = new ModelRendererTurbo(this, 265, 97, textureX, textureY); // Box 401
		yourclassnameModel[245] = new ModelRendererTurbo(this, 209, 89, textureX, textureY); // Lamp 2
		yourclassnameModel[246] = new ModelRendererTurbo(this, 505, 89, textureX, textureY); // Box 223
		yourclassnameModel[247] = new ModelRendererTurbo(this, 129, 97, textureX, textureY); // Box 83
		yourclassnameModel[248] = new ModelRendererTurbo(this, 297, 97, textureX, textureY); // Box 52
		yourclassnameModel[249] = new ModelRendererTurbo(this, 393, 97, textureX, textureY); // Box 413
		yourclassnameModel[250] = new ModelRendererTurbo(this, 137, 97, textureX, textureY); // Lamp 4
		yourclassnameModel[251] = new ModelRendererTurbo(this, 265, 97, textureX, textureY); // Box 415
		yourclassnameModel[252] = new ModelRendererTurbo(this, 297, 105, textureX, textureY); // Box 424
		yourclassnameModel[253] = new ModelRendererTurbo(this, 305, 104, textureX, textureY); // Box 425
		yourclassnameModel[254] = new ModelRendererTurbo(this, 162, 82, textureX, textureY); // Box 426
		yourclassnameModel[255] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 466
		yourclassnameModel[256] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 467
		yourclassnameModel[257] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 468
		yourclassnameModel[258] = new ModelRendererTurbo(this, 233, 9, textureX, textureY); // Box 469
		yourclassnameModel[259] = new ModelRendererTurbo(this, 161, 17, textureX, textureY); // Box 470
		yourclassnameModel[260] = new ModelRendererTurbo(this, 433, 17, textureX, textureY); // Box 473
		yourclassnameModel[261] = new ModelRendererTurbo(this, 129, 25, textureX, textureY); // Box 287
		yourclassnameModel[262] = new ModelRendererTurbo(this, 433, 25, textureX, textureY); // Box 288
		yourclassnameModel[263] = new ModelRendererTurbo(this, 153, 33, textureX, textureY); // Box 289
		yourclassnameModel[264] = new ModelRendererTurbo(this, 161, 33, textureX, textureY); // Box 290
		yourclassnameModel[265] = new ModelRendererTurbo(this, 41, 41, textureX, textureY); // Box 291
		yourclassnameModel[266] = new ModelRendererTurbo(this, 217, 49, textureX, textureY); // Box 292
		yourclassnameModel[267] = new ModelRendererTurbo(this, 297, 49, textureX, textureY); // Box 289
		yourclassnameModel[268] = new ModelRendererTurbo(this, 409, 41, textureX, textureY); // Box 290
		yourclassnameModel[269] = new ModelRendererTurbo(this, 105, 73, textureX, textureY); // Box 291
		yourclassnameModel[270] = new ModelRendererTurbo(this, 369, 73, textureX, textureY); // Box 292
		yourclassnameModel[271] = new ModelRendererTurbo(this, 265, 81, textureX, textureY); // Box 293
		yourclassnameModel[272] = new ModelRendererTurbo(this, 201, 81, textureX, textureY); // Box 294
		yourclassnameModel[273] = new ModelRendererTurbo(this, 113, 81, textureX, textureY); // Box 295
		yourclassnameModel[274] = new ModelRendererTurbo(this, 441, 49, textureX, textureY); // Box 296
		yourclassnameModel[275] = new ModelRendererTurbo(this, 409, 49, textureX, textureY); // Box 297
		yourclassnameModel[276] = new ModelRendererTurbo(this, 161, 65, textureX, textureY); // Box 298
		yourclassnameModel[277] = new ModelRendererTurbo(this, 113, 81, textureX, textureY); // Box 299
		yourclassnameModel[278] = new ModelRendererTurbo(this, 169, 81, textureX, textureY); // Box 300
		yourclassnameModel[279] = new ModelRendererTurbo(this, 81, 65, textureX, textureY); // Box 301
		yourclassnameModel[280] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 302
		yourclassnameModel[281] = new ModelRendererTurbo(this, 89, 73, textureX, textureY); // Box 303
		yourclassnameModel[282] = new ModelRendererTurbo(this, 49, 41, textureX, textureY); // Box 304
		yourclassnameModel[283] = new ModelRendererTurbo(this, 233, 49, textureX, textureY); // Box 305
		yourclassnameModel[284] = new ModelRendererTurbo(this, 113, 49, textureX, textureY); // Box 306
		yourclassnameModel[285] = new ModelRendererTurbo(this, 417, 81, textureX, textureY); // Box 307
		yourclassnameModel[286] = new ModelRendererTurbo(this, 185, 81, textureX, textureY); // Box 308
		yourclassnameModel[287] = new ModelRendererTurbo(this, 393, 73, textureX, textureY); // Box 309
		yourclassnameModel[288] = new ModelRendererTurbo(this, 233, 73, textureX, textureY); // Box 310
		yourclassnameModel[289] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 311
		yourclassnameModel[290] = new ModelRendererTurbo(this, 153, 81, textureX, textureY); // Box 312
		yourclassnameModel[291] = new ModelRendererTurbo(this, 417, 81, textureX, textureY); // Box 313
		yourclassnameModel[292] = new ModelRendererTurbo(this, 417, 81, textureX, textureY); // Box 314
		yourclassnameModel[293] = new ModelRendererTurbo(this, 473, 65, textureX, textureY); // Box 315
		yourclassnameModel[294] = new ModelRendererTurbo(this, 481, 81, textureX, textureY); // Box 316
		yourclassnameModel[295] = new ModelRendererTurbo(this, 137, 81, textureX, textureY); // Box 317
		yourclassnameModel[296] = new ModelRendererTurbo(this, 289, 49, textureX, textureY); // Box 318
		yourclassnameModel[297] = new ModelRendererTurbo(this, 489, 65, textureX, textureY); // Box 319
		yourclassnameModel[298] = new ModelRendererTurbo(this, 217, 65, textureX, textureY); // Box 320
		yourclassnameModel[299] = new ModelRendererTurbo(this, 329, 49, textureX, textureY); // Box 321
		yourclassnameModel[300] = new ModelRendererTurbo(this, 305, 57, textureX, textureY); // Box 322
		yourclassnameModel[301] = new ModelRendererTurbo(this, 97, 89, textureX, textureY); // Box 323
		yourclassnameModel[302] = new ModelRendererTurbo(this, 105, 89, textureX, textureY); // Box 324
		yourclassnameModel[303] = new ModelRendererTurbo(this, 417, 81, textureX, textureY); // Box 325
		yourclassnameModel[304] = new ModelRendererTurbo(this, 321, 65, textureX, textureY); // Box 326
		yourclassnameModel[305] = new ModelRendererTurbo(this, 433, 81, textureX, textureY); // Box 327
		yourclassnameModel[306] = new ModelRendererTurbo(this, 113, 89, textureX, textureY); // Box 328
		yourclassnameModel[307] = new ModelRendererTurbo(this, 289, 65, textureX, textureY); // Box 329
		yourclassnameModel[308] = new ModelRendererTurbo(this, 489, 57, textureX, textureY); // Box 330
		yourclassnameModel[309] = new ModelRendererTurbo(this, 281, 81, textureX, textureY); // Box 333
		yourclassnameModel[310] = new ModelRendererTurbo(this, 113, 89, textureX, textureY); // Box 334
		yourclassnameModel[311] = new ModelRendererTurbo(this, 49, 49, textureX, textureY); // Box 335
		yourclassnameModel[312] = new ModelRendererTurbo(this, 147, 112, textureX, textureY); // Box 336
		yourclassnameModel[313] = new ModelRendererTurbo(this, 185, 89, textureX, textureY); // Box 337
		yourclassnameModel[314] = new ModelRendererTurbo(this, 209, 89, textureX, textureY); // Lamp 1
		yourclassnameModel[315] = new ModelRendererTurbo(this, 297, 105, textureX, textureY); // Box 339
		yourclassnameModel[316] = new ModelRendererTurbo(this, 505, 89, textureX, textureY); // Box 340
		yourclassnameModel[317] = new ModelRendererTurbo(this, 297, 97, textureX, textureY); // Box 341
		yourclassnameModel[318] = new ModelRendererTurbo(this, 265, 97, textureX, textureY); // Box 342
		yourclassnameModel[319] = new ModelRendererTurbo(this, 393, 97, textureX, textureY); // Box 343
		yourclassnameModel[320] = new ModelRendererTurbo(this, 137, 97, textureX, textureY); // Lamp3
		yourclassnameModel[321] = new ModelRendererTurbo(this, 129, 97, textureX, textureY); // Box 345
		yourclassnameModel[322] = new ModelRendererTurbo(this, 1, 137, textureX, textureY); // Box 332
		yourclassnameModel[323] = new ModelRendererTurbo(this, 13, 137, textureX, textureY); // Box 333
		yourclassnameModel[324] = new ModelRendererTurbo(this, 419, 99, textureX, textureY); // Box 173
		yourclassnameModel[325] = new ModelRendererTurbo(this, 473, 33, textureX, textureY); // Box 335
		yourclassnameModel[326] = new ModelRendererTurbo(this, 419, 99, textureX, textureY); // Box 336
		yourclassnameModel[327] = new ModelRendererTurbo(this, 473, 33, textureX, textureY); // Box 337
		yourclassnameModel[328] = new ModelRendererTurbo(this, 419, 99, textureX, textureY); // Box 338
		yourclassnameModel[329] = new ModelRendererTurbo(this, 419, 99, textureX, textureY); // Box 339
		yourclassnameModel[330] = new ModelRendererTurbo(this, 419, 99, textureX, textureY); // Box 340
		yourclassnameModel[331] = new ModelRendererTurbo(this, 419, 99, textureX, textureY); // Box 341
		yourclassnameModel[332] = new ModelRendererTurbo(this, 419, 99, textureX, textureY); // Box 342
		yourclassnameModel[333] = new ModelRendererTurbo(this, 419, 99, textureX, textureY); // Box 343
		yourclassnameModel[334] = new ModelRendererTurbo(this, 419, 99, textureX, textureY); // Box 344
		yourclassnameModel[335] = new ModelRendererTurbo(this, 473, 33, textureX, textureY); // Box 345
		yourclassnameModel[336] = new ModelRendererTurbo(this, 419, 99, textureX, textureY); // Box 346
		yourclassnameModel[337] = new ModelRendererTurbo(this, 419, 99, textureX, textureY); // Box 347
		yourclassnameModel[338] = new ModelRendererTurbo(this, 473, 33, textureX, textureY); // Box 348
		yourclassnameModel[339] = new ModelRendererTurbo(this, 419, 99, textureX, textureY); // Box 349
		yourclassnameModel[340] = new ModelRendererTurbo(this, 419, 99, textureX, textureY); // Box 350
		yourclassnameModel[341] = new ModelRendererTurbo(this, 419, 99, textureX, textureY); // Box 351
		yourclassnameModel[342] = new ModelRendererTurbo(this, 419, 99, textureX, textureY); // Box 352
		yourclassnameModel[343] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 353
		yourclassnameModel[344] = new ModelRendererTurbo(this, 1, 111, textureX, textureY); // Box 353
		yourclassnameModel[345] = new ModelRendererTurbo(this, 1, 111, textureX, textureY); // Box 354

		yourclassnameModel[0].addShapeBox(0F, 0F, 0F, 53, 1, 20, 0F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -2.25F, 0F, 0F, -2.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F); // Box 44
		yourclassnameModel[0].setRotationPoint(-27.5F, 4F, -10.5F);

		yourclassnameModel[1].addShapeBox(0F, 0F, 0F, 1, 8, 18, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 171
		yourclassnameModel[1].setRotationPoint(-24F, -4F, -9.5F);

		yourclassnameModel[2].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 277
		yourclassnameModel[2].setRotationPoint(-28.5F, -1F, -6.5F);

		yourclassnameModel[3].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 278
		yourclassnameModel[3].setRotationPoint(-28.5F, -1F, -3.5F);

		yourclassnameModel[4].addBox(0F, 0F, 0F, 6, 1, 2, 0F); // Box 32
		yourclassnameModel[4].setRotationPoint(-35F, 6.5F, -1F);

		yourclassnameModel[5].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 33
		yourclassnameModel[5].setRotationPoint(-36F, 6F, -2F);

		yourclassnameModel[6].addBox(0F, 0F, 0F, 3, 1, 6, 0F); // Box 174
		yourclassnameModel[6].setRotationPoint(-32.8F, -3F, -7F);

		yourclassnameModel[7].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F, -0.5F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 175
		yourclassnameModel[7].setRotationPoint(-33.1F, -5F, -7F);

		yourclassnameModel[8].addShapeBox(0F, 0F, 0F, 1, 5, 2, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 182
		yourclassnameModel[8].setRotationPoint(-26F, -6F, -5.5F);

		yourclassnameModel[9].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 183
		yourclassnameModel[9].setRotationPoint(-26.5F, -5F, -3.5F);

		yourclassnameModel[10].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F); // Box 184
		yourclassnameModel[10].setRotationPoint(-26.5F, -5F, -6.5F);

		yourclassnameModel[11].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 185
		yourclassnameModel[11].setRotationPoint(-28.5F, -1F, -6.5F);

		yourclassnameModel[12].addShapeBox(0F, 0F, 0F, 62, 1, 10, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 1F, 1F, 0F, 1F); // Box 93
		yourclassnameModel[12].setRotationPoint(-31.5F, -16.75F, -4.75F);

		yourclassnameModel[13].addShapeBox(0F, 0F, 0F, 2, 7, 20, 0F, -0.5F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, -0.4F, -2.3F, 0F, 0F, -1.25F, 0F, 0F, -0.25F, -0.5F, -0.4F, -1.3F); // Box 170
		yourclassnameModel[13].setRotationPoint(-34.5F, -4F, -10.5F);

		yourclassnameModel[14].addShapeBox(0F, 0F, 0F, 2, 11, 13, 0F, -0.5F, 0F, -1.75F, 0F, 0F, -0.75F, 0F, 0F, -1.5F, -0.5F, 0F, -1.5F, -0.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1.5F, -0.5F, 0F, -1.5F); // Box 171
		yourclassnameModel[14].setRotationPoint(-34.5F, -15F, -9.5F);

		yourclassnameModel[15].addShapeBox(0F, 0F, 0F, 62, 2, 2, 0F, 1F, -0.7F, 1.25F, 0F, -0.7F, 1.25F, 0F, -0.25F, 0.5F, 1F, -0.25F, 0.5F, 1F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 1F, 0F, -1.5F); // Box 183
		yourclassnameModel[15].setRotationPoint(-31.5F, -17F, -7.25F);

		yourclassnameModel[16].addShapeBox(0F, 0F, 0F, 62, 2, 2, 0F, 1F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.7F, 1.25F, 1F, -0.7F, 1.25F, 1F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 1F, 0F, 1.5F); // Box 184
		yourclassnameModel[16].setRotationPoint(-31.5F, -17F, 5.25F);

		yourclassnameModel[17].addShapeBox(0F, 0F, 0F, 11, 11, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F); // Box 201
		yourclassnameModel[17].setRotationPoint(-32.5F, -15F, 7.75F);

		yourclassnameModel[18].addShapeBox(0F, 0F, 0F, 6, 8, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 202
		yourclassnameModel[18].setRotationPoint(-27.5F, -4F, 8.5F);

		yourclassnameModel[19].addShapeBox(0F, 0F, 0F, 63, 2, 2, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 210
		yourclassnameModel[19].setRotationPoint(-32.5F, -16F, -7.75F);

		yourclassnameModel[20].addShapeBox(0F, 0F, 0F, 1, 10, 18, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 229
		yourclassnameModel[20].setRotationPoint(-24F, -14F, -9.5F);

		yourclassnameModel[21].addShapeBox(0F, 0F, 0F, 1, 2, 16, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 230
		yourclassnameModel[21].setRotationPoint(-24F, -16F, -9F);

		yourclassnameModel[22].addBox(0F, 0F, 0F, 5, 2, 8, 0F); // Box 231
		yourclassnameModel[22].setRotationPoint(-29.5F, -18.5F, -4F);

		yourclassnameModel[23].addShapeBox(0F, 0F, 0F, 3, 8, 1, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 292
		yourclassnameModel[23].setRotationPoint(-11F, -4F, -8.5F);

		yourclassnameModel[24].addShapeBox(0F, 0F, 0F, 1, 10, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 293
		yourclassnameModel[24].setRotationPoint(-24F, -14F, -8F);

		yourclassnameModel[25].addBox(0F, 0F, 0F, 1, 8, 1, 0F); // Box 294
		yourclassnameModel[25].setRotationPoint(-24F, -4F, -9F);

		yourclassnameModel[26].addShapeBox(0F, 0F, 0F, 1, 10, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 295
		yourclassnameModel[26].setRotationPoint(-24F, -14F, 7F);

		yourclassnameModel[27].addBox(0F, 0F, 0F, 1, 8, 1, 0F); // Box 296
		yourclassnameModel[27].setRotationPoint(-24F, -4F, 8F);

		yourclassnameModel[28].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 407
		yourclassnameModel[28].setRotationPoint(-22.5F, 5F, -1.5F);

		yourclassnameModel[29].addShapeBox(0F, 0F, 0F, 2, 11, 4, 0F, -0.5F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -0.75F, -0.5F, 0F, -1.75F, -0.5F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, -0.5F, 0F, -1F); // Box 411
		yourclassnameModel[29].setRotationPoint(-34.5F, -15F, 5.5F);

		yourclassnameModel[30].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.15F, 0F, -0.35F, -0.45F, 0F, -0.35F, -0.45F, 0F, 0F, -0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 235
		yourclassnameModel[30].setRotationPoint(-30F, -3F, -8F);

		yourclassnameModel[31].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.35F, -0.45F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, -0.35F, -0.45F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 236
		yourclassnameModel[31].setRotationPoint(-31F, -3F, -8F);

		yourclassnameModel[32].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F); // Box 238
		yourclassnameModel[32].setRotationPoint(-30.5F, -3.8F, -8F);

		yourclassnameModel[33].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 37
		yourclassnameModel[33].setRotationPoint(-30.5F, -4.6F, -8F);

		yourclassnameModel[34].addShapeBox(0F, 0F, 0F, 3, 6, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0F, 0F); // Box 418
		yourclassnameModel[34].setRotationPoint(-31.5F, -2F, -8.5F);

		yourclassnameModel[35].addBox(0F, 0F, 0F, 3, 6, 1, 0F); // Box 419
		yourclassnameModel[35].setRotationPoint(-32.5F, -2F, -1F);

		yourclassnameModel[36].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 421
		yourclassnameModel[36].setRotationPoint(-27.5F, 0F, -5F);

		yourclassnameModel[37].addShapeBox(0F, 0F, 0F, 3, 10, 1, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 275
		yourclassnameModel[37].setRotationPoint(-10.99F, -14F, -8F);

		yourclassnameModel[38].addShapeBox(0F, 0F, 0F, 9, 8, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 281
		yourclassnameModel[38].setRotationPoint(16.5F, -4F, 8.5F);

		yourclassnameModel[39].addShapeBox(0F, 0F, 0F, 5, 8, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, -1F, -0.25F); // Box 292
		yourclassnameModel[39].setRotationPoint(-32.5F, -4F, 8.5F);

		yourclassnameModel[40].addShapeBox(0F, 0F, 0F, 5, 1, 17, 0F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 293
		yourclassnameModel[40].setRotationPoint(-32.5F, 4F, -9F);

		yourclassnameModel[41].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 294
		yourclassnameModel[41].setRotationPoint(-32.5F, 3F, 7.5F);

		yourclassnameModel[42].addShapeBox(0F, 0F, 0F, 5, 8, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, -1F, 0.25F); // Box 295
		yourclassnameModel[42].setRotationPoint(-32.5F, -4F, -9.5F);

		yourclassnameModel[43].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F, 0F, 0F, 0.75F, 0F, -1F, 0.75F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 296
		yourclassnameModel[43].setRotationPoint(-32.5F, 3F, -8.5F);

		yourclassnameModel[44].addShapeBox(0F, 0F, 0F, 2, 2, 20, 0F, -0.5F, 0.4F, -2.3F, 0F, 0F, -1.25F, 0F, 0F, -0.25F, -0.5F, 0.4F, -1.3F, -0.5F, -0.25F, -3.25F, 0F, 0F, -2.25F, 0F, 0F, -1.25F, -0.5F, -0.225F, -2.25F); // Box 297
		yourclassnameModel[44].setRotationPoint(-34.5F, 3F, -10.5F);

		yourclassnameModel[45].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 1F, -0.5F, 0F); // Box 298
		yourclassnameModel[45].setRotationPoint(-34.5F, 4.5F, -7F);

		yourclassnameModel[46].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 299
		yourclassnameModel[46].setRotationPoint(-34.5F, 4.5F, 3F);

		yourclassnameModel[47].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F, 1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 1F, -0.5F, 0F); // Box 300
		yourclassnameModel[47].setRotationPoint(-34.5F, 4.5F, -4F);

		yourclassnameModel[48].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F, -0.9F, -0.25F, -1.25F, 0F, -0.25F, -1.25F, 0F, -0.7F, -1F, -0.9F, -0.7F, -1F, 0.5F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -0.75F, 0.5F, 0F, -1.75F); // Box 305
		yourclassnameModel[48].setRotationPoint(-33.5F, -17F, 3.5F);

		yourclassnameModel[49].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F, -0.9F, -0.7F, -1F, 0F, -0.7F, -1F, 0F, -0.25F, -1.25F, -0.9F, -0.25F, -1.25F, 0.5F, 0F, -1.75F, 0F, 0F, -0.75F, 0F, 0F, -1.25F, 0.5F, 0F, -1.25F); // Box 306
		yourclassnameModel[49].setRotationPoint(-33.5F, -17F, -9.5F);

		yourclassnameModel[50].addShapeBox(0F, 0F, 0F, 1, 2, 11, 0F, -0.9F, -0.25F, -1.25F, 0F, -0.25F, -1.25F, 0F, -0.25F, -0.25F, -0.9F, -0.25F, -0.25F, 0.5F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -0.25F, 0.5F, 0F, -0.25F); // Box 307
		yourclassnameModel[50].setRotationPoint(-33.5F, -17F, -6F);

		yourclassnameModel[51].addShapeBox(0F, 0F, 0F, 5, 8, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, -0.5F, 0.25F, 0F, -1F, -0.25F, 0F, 0F, -0.25F); // Box 308
		yourclassnameModel[51].setRotationPoint(25.5F, -4F, 8.5F);

		yourclassnameModel[52].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0.75F, 0F, -1F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 309
		yourclassnameModel[52].setRotationPoint(25.5F, 3F, 7.5F);

		yourclassnameModel[53].addShapeBox(0F, 0F, 0F, 2, 7, 20, 0F, 0F, 0F, -1F, -0.5F, 0F, -2.5F, -0.5F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, -1.25F, -0.5F, -0.25F, -2.8F, -0.5F, -0.25F, -1.8F, 0F, 0F, -0.25F); // Box 310
		yourclassnameModel[53].setRotationPoint(30.5F, -4F, -10.5F);

		yourclassnameModel[54].addShapeBox(0F, 0F, 0F, 2, 2, 20, 0F, 0F, 0F, -1.25F, -0.5F, 0.25F, -2.8F, -0.5F, 0.25F, -1.8F, 0F, 0F, -0.25F, 0F, 0F, -2.25F, -0.5F, -0.5F, -3.5F, -0.5F, -0.5F, -2.5F, 0F, 0F, -1.25F); // Box 311
		yourclassnameModel[54].setRotationPoint(30.5F, 3F, -10.5F);

		yourclassnameModel[55].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F, 0F, -1F, 0.75F, 0F, 0F, 0.75F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 312
		yourclassnameModel[55].setRotationPoint(25.5F, 3F, -8.5F);

		yourclassnameModel[56].addShapeBox(0F, 0F, 0F, 5, 8, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -1F, -0.25F, 0F, -0.5F, 0.25F, 0F, 0F, 0.25F); // Box 313
		yourclassnameModel[56].setRotationPoint(25.5F, -4F, -9.5F);

		yourclassnameModel[57].addShapeBox(0F, 0F, 0F, 2, 11, 9, 0F, 0F, 0F, -0.75F, -0.5F, 0F, -2.25F, -0.5F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -0.5F, 0F, -1.5F, -0.5F, 0F, -2F, 0F, 0F, -2F); // Box 314
		yourclassnameModel[57].setRotationPoint(30.5F, -15F, -9.5F);

		yourclassnameModel[58].addShapeBox(0F, 0F, 0F, 2, 11, 9, 0F, 0F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F, -2.25F, 0F, 0F, -0.75F, 0F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F, -1.5F, 0F, 0F, 0F); // Box 315
		yourclassnameModel[58].setRotationPoint(30.5F, -15F, 0.5F);

		yourclassnameModel[59].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F, 0F, -0.25F, -1.25F, -0.9F, -0.25F, -1.25F, -0.9F, -0.7F, -1F, 0F, -0.7F, -1F, 0F, 0F, -1.25F, 0.5F, 0F, -1.25F, 0.5F, 0F, -2.25F, 0F, 0F, -0.75F); // Box 316
		yourclassnameModel[59].setRotationPoint(30.5F, -17F, 3.5F);

		yourclassnameModel[60].addShapeBox(0F, 0F, 0F, 1, 2, 11, 0F, 0F, -0.25F, -1.25F, -0.9F, -0.25F, -1.25F, -0.9F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, -1.25F, 0.5F, 0F, -1.25F, 0.5F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 317
		yourclassnameModel[60].setRotationPoint(30.5F, -17F, -6F);

		yourclassnameModel[61].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F, 0F, -0.7F, -1F, -0.9F, -0.7F, -1F, -0.9F, -0.25F, -1.25F, 0F, -0.25F, -1.25F, 0F, 0F, -0.75F, 0.5F, 0F, -2.25F, 0.5F, 0F, -1.25F, 0F, 0F, -1.25F); // Box 318
		yourclassnameModel[61].setRotationPoint(30.5F, -17F, -9.5F);

		yourclassnameModel[62].addShapeBox(0F, 0F, 0F, 5, 1, 17, 0F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 319
		yourclassnameModel[62].setRotationPoint(25.5F, 4F, -9F);

		yourclassnameModel[63].addBox(0F, 0F, 0F, 1, 18, 1, 0F); // Box 320
		yourclassnameModel[63].setRotationPoint(32F, -14F, 3F);

		yourclassnameModel[64].addBox(0F, 0F, 0F, 1, 8, 1, 0F); // Box 321
		yourclassnameModel[64].setRotationPoint(32F, -4F, -4F);

		yourclassnameModel[65].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F, 0F, 1F, -2F, 0F, 1F, -2F, 0F, 1F, 2F, 0F, 1F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 332
		yourclassnameModel[65].setRotationPoint(-8.5F, -15.4F, 4.5F);

		yourclassnameModel[66].addShapeBox(0F, 0F, 0F, 0, 1, 10, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 333
		yourclassnameModel[66].setRotationPoint(-8.5F, -14.4F, -5F);

		yourclassnameModel[67].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F, 0F, 1F, 2F, 0F, 1F, 2F, 0F, 1F, -2F, 0F, 1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 334
		yourclassnameModel[67].setRotationPoint(-8.5F, -15.4F, -5.5F);

		yourclassnameModel[68].addShapeBox(0F, 0F, 0F, 1, 11, 6, 0F, 0F, 0F, -1F, 0.5F, 0F, -1F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0.5F, 0F, -1F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 360
		yourclassnameModel[68].setRotationPoint(-34F, -15F, 1F);

		yourclassnameModel[69].addShapeBox(0F, 0F, 0F, 9, 8, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 369
		yourclassnameModel[69].setRotationPoint(16.5F, -4F, -9.5F);

		yourclassnameModel[70].addShapeBox(0F, 0F, 0F, 6, 8, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 386
		yourclassnameModel[70].setRotationPoint(-15.5F, -4F, -9.5F);

		yourclassnameModel[71].addShapeBox(0F, 0F, 0F, 11, 11, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 387
		yourclassnameModel[71].setRotationPoint(-32.5F, -15F, -8.75F);

		yourclassnameModel[72].addShapeBox(0F, 0F, 0F, 6, 8, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 388
		yourclassnameModel[72].setRotationPoint(-27.5F, -4F, -9.5F);

		yourclassnameModel[73].addShapeBox(0F, 0F, 0F, 5, 5, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 394
		yourclassnameModel[73].setRotationPoint(-10.5F, 5F, 0F);

		yourclassnameModel[74].addShapeBox(0F, 0F, 0F, 9, 3, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 395
		yourclassnameModel[74].setRotationPoint(-3F, -19.5F, -7F);

		yourclassnameModel[75].addBox(0F, 0F, 0F, 16, 3, 12, 0F); // Box 396
		yourclassnameModel[75].setRotationPoint(-19.5F, -19F, -6F);

		yourclassnameModel[76].addBox(0F, 0F, 0F, 11, 3, 12, 0F); // Box 405
		yourclassnameModel[76].setRotationPoint(6.5F, -19F, -6F);

		yourclassnameModel[77].addShapeBox(0F, 0F, 0F, 1, 10, 0, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 406
		yourclassnameModel[77].setRotationPoint(-35F, -8F, 2.5F);

		yourclassnameModel[78].addShapeBox(0F, 0F, 0F, 1, 10, 0, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 407
		yourclassnameModel[78].setRotationPoint(-35F, -8F, 8F);

		yourclassnameModel[79].addBox(0F, 0F, 0F, 12, 3, 2, 0F); // Box 421
		yourclassnameModel[79].setRotationPoint(-8.5F, 1F, 6.5F);

		yourclassnameModel[80].addShapeBox(0F, -3F, 0F, 1, 2, 3, 0F, 0F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 422
		yourclassnameModel[80].setRotationPoint(3F, 0.7F, 4.5F);
		yourclassnameModel[80].rotateAngleX = -0.06981317F;

		yourclassnameModel[81].addShapeBox(0F, 0F, 0F, 12, 1, 4, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 423
		yourclassnameModel[81].setRotationPoint(-8.5F, 0F, 4.5F);

		yourclassnameModel[82].addShapeBox(0F, 0F, 0F, 12, 4, 1, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 424
		yourclassnameModel[82].setRotationPoint(-8.5F, -4F, 7.5F);

		yourclassnameModel[83].addShapeBox(0F, -3F, 0F, 1, 2, 3, 0F, 0F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 425
		yourclassnameModel[83].setRotationPoint(-8.5F, 0.7F, 4.5F);
		yourclassnameModel[83].rotateAngleX = -0.06981317F;

		yourclassnameModel[84].addShapeBox(0F, 0F, 0F, 0, 9, 1, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, -0.5F, 0F, 1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 428
		yourclassnameModel[84].setRotationPoint(3.25F, -11F, 4F);

		yourclassnameModel[85].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 1F, -1F, 0F, 1F, -1F, 0F, 1F, 0.5F, 0F, 1F, 0.5F); // Box 429
		yourclassnameModel[85].setRotationPoint(3.25F, -2F, 4F);

		yourclassnameModel[86].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F, 0F, 1F, -1.5F, 0F, 1F, -1.5F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 430
		yourclassnameModel[86].setRotationPoint(3.25F, -14F, 4F);

		yourclassnameModel[87].addBox(0F, 0F, 0F, 12, 3, 2, 0F); // Box 443
		yourclassnameModel[87].setRotationPoint(-8.5F, 1F, -8.5F);

		yourclassnameModel[88].addShapeBox(0F, 0F, 0F, 12, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 444
		yourclassnameModel[88].setRotationPoint(-8.5F, 0F, -8.5F);

		yourclassnameModel[89].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 445
		yourclassnameModel[89].setRotationPoint(3F, -2.1F, -7.7F);
		yourclassnameModel[89].rotateAngleX = 0.06981317F;

		yourclassnameModel[90].addShapeBox(0F, 0F, 0F, 12, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 446
		yourclassnameModel[90].setRotationPoint(-8.5F, -4F, -8.5F);

		yourclassnameModel[91].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 447
		yourclassnameModel[91].setRotationPoint(-8.5F, -2.1F, -7.7F);
		yourclassnameModel[91].rotateAngleX = 0.06981317F;

		yourclassnameModel[92].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F, 0F, 1F, -2F, 0F, 1F, -2F, 0F, 1F, 2F, 0F, 1F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 219
		yourclassnameModel[92].setRotationPoint(4F, -15.4F, 4.5F);

		yourclassnameModel[93].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F, 0F, 1F, 2F, 0F, 1F, 2F, 0F, 1F, -2F, 0F, 1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 220
		yourclassnameModel[93].setRotationPoint(4F, -15.4F, -5.5F);

		yourclassnameModel[94].addShapeBox(0F, 0F, 0F, 14, 8, 1, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 219
		yourclassnameModel[94].setRotationPoint(-9.5F, -4F, -9.25F);

		yourclassnameModel[95].addShapeBox(0F, 0F, 0F, 6, 8, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 221
		yourclassnameModel[95].setRotationPoint(-21.5F, -4F, -9.5F);

		yourclassnameModel[96].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 223
		yourclassnameModel[96].setRotationPoint(-3F, -15F, -8.75F);

		yourclassnameModel[97].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.75F, 0.5F, 0F, 0.75F, 0.5F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 225
		yourclassnameModel[97].setRotationPoint(3F, -15F, -8.75F);

		yourclassnameModel[98].addShapeBox(0F, 0F, 0F, 6, 8, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 226
		yourclassnameModel[98].setRotationPoint(10.5F, -4F, -9.5F);

		yourclassnameModel[99].addShapeBox(0F, 0F, 0F, 6, 8, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 227
		yourclassnameModel[99].setRotationPoint(4.5F, -4F, -9.5F);

		yourclassnameModel[100].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.75F, 0.5F, 0F, 0.75F, 0.5F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 231
		yourclassnameModel[100].setRotationPoint(29F, -15F, -8.75F);

		yourclassnameModel[101].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 232
		yourclassnameModel[101].setRotationPoint(23F, -15F, -8.75F);

		yourclassnameModel[102].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.75F, 0.5F, 0F, 0.75F, 0.5F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 234
		yourclassnameModel[102].setRotationPoint(16.5F, -15F, -8.75F);

		yourclassnameModel[103].addShapeBox(0F, 0F, 0F, 2, 11, 5, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 235
		yourclassnameModel[103].setRotationPoint(30.5F, -15F, -2.5F);

		yourclassnameModel[104].addShapeBox(0F, -3F, 0F, 1, 2, 3, 0F, 0F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 236
		yourclassnameModel[104].setRotationPoint(-3F, 0.7F, 4.5F);
		yourclassnameModel[104].rotateAngleX = -0.06981317F;

		yourclassnameModel[105].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 1F, -1F, 0F, 1F, -1F, 0F, 1F, 0.5F, 0F, 1F, 0.5F); // Box 237
		yourclassnameModel[105].setRotationPoint(-8.25F, -2F, 4F);

		yourclassnameModel[106].addShapeBox(0F, 0F, 0F, 0, 9, 1, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, -0.5F, 0F, 1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 238
		yourclassnameModel[106].setRotationPoint(-8.25F, -11F, 4F);

		yourclassnameModel[107].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F, 0F, 1F, -1.5F, 0F, 1F, -1.5F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 239
		yourclassnameModel[107].setRotationPoint(-8.25F, -14F, 4F);

		yourclassnameModel[108].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0.5F, 0F, 1F, 0.5F, 0F, 1F, -1F, 0F, 1F, -1F); // Box 240
		yourclassnameModel[108].setRotationPoint(3.25F, -2F, -5F);

		yourclassnameModel[109].addShapeBox(0F, 0F, 0F, 0, 9, 1, 0F, 0F, 1F, -0.5F, 0F, 1F, -0.5F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 241
		yourclassnameModel[109].setRotationPoint(3.25F, -11F, -5F);

		yourclassnameModel[110].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0.5F, 0F, 1F, 0.5F, 0F, 1F, -1F, 0F, 1F, -1F); // Box 242
		yourclassnameModel[110].setRotationPoint(-8.25F, -2F, -5F);

		yourclassnameModel[111].addShapeBox(0F, 0F, 0F, 0, 9, 1, 0F, 0F, 1F, -0.5F, 0F, 1F, -0.5F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 243
		yourclassnameModel[111].setRotationPoint(-8.25F, -11F, -5F);

		yourclassnameModel[112].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F, -1.5F, 0F, 1F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 244
		yourclassnameModel[112].setRotationPoint(-8.25F, -14F, -5F);

		yourclassnameModel[113].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F, -1.5F, 0F, 1F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 245
		yourclassnameModel[113].setRotationPoint(3.25F, -14F, -5F);

		yourclassnameModel[114].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.75F, 0.5F, 0F, 0.75F, 0.5F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 246
		yourclassnameModel[114].setRotationPoint(-9.5F, -15F, -8.75F);

		yourclassnameModel[115].addShapeBox(0F, 0F, 0F, 3, 8, 1, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 247
		yourclassnameModel[115].setRotationPoint(-23.5F, -4F, -8.5F);

		yourclassnameModel[116].addShapeBox(0F, 0F, 0F, 3, 10, 1, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 248
		yourclassnameModel[116].setRotationPoint(-23.49F, -14F, -8F);

		yourclassnameModel[117].addShapeBox(0F, 0F, 0F, 3, 8, 1, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 249
		yourclassnameModel[117].setRotationPoint(2.5F, -4F, -8.5F);

		yourclassnameModel[118].addShapeBox(0F, 0F, 0F, 3, 10, 1, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 250
		yourclassnameModel[118].setRotationPoint(2.51F, -14F, -8F);

		yourclassnameModel[119].addShapeBox(0F, 0F, 0F, 3, 8, 1, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 251
		yourclassnameModel[119].setRotationPoint(15F, -4F, -8.5F);

		yourclassnameModel[120].addShapeBox(0F, 0F, 0F, 3, 10, 1, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 252
		yourclassnameModel[120].setRotationPoint(15.01F, -14F, -8F);

		yourclassnameModel[121].addShapeBox(0F, -3F, 0F, 1, 2, 3, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 253
		yourclassnameModel[121].setRotationPoint(-3F, 0.9F, -7.5F);
		yourclassnameModel[121].rotateAngleX = 0.06981317F;

		yourclassnameModel[122].addShapeBox(0F, 0F, 0F, 0, 1, 10, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 254
		yourclassnameModel[122].setRotationPoint(4F, -14.4F, -5F);

		yourclassnameModel[123].addBox(0F, 0F, 0F, 12, 3, 2, 0F); // Box 255
		yourclassnameModel[123].setRotationPoint(18F, 1F, 6.5F);

		yourclassnameModel[124].addShapeBox(0F, 0F, 0F, 12, 1, 4, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 256
		yourclassnameModel[124].setRotationPoint(18F, 0F, 4.5F);

		yourclassnameModel[125].addShapeBox(0F, -3F, 0F, 1, 2, 3, 0F, 0F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 257
		yourclassnameModel[125].setRotationPoint(18F, 0.7F, 4.5F);
		yourclassnameModel[125].rotateAngleX = -0.06981317F;

		yourclassnameModel[126].addShapeBox(0F, 0F, 0F, 12, 4, 1, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 258
		yourclassnameModel[126].setRotationPoint(18F, -4F, 7.5F);

		yourclassnameModel[127].addShapeBox(0F, -3F, 0F, 1, 2, 3, 0F, 0F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 259
		yourclassnameModel[127].setRotationPoint(23.5F, 0.7F, 4.5F);
		yourclassnameModel[127].rotateAngleX = -0.06981317F;

		yourclassnameModel[128].addShapeBox(0F, -3F, 0F, 1, 2, 3, 0F, 0F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 260
		yourclassnameModel[128].setRotationPoint(29.5F, 0.7F, 4.5F);
		yourclassnameModel[128].rotateAngleX = -0.06981317F;

		yourclassnameModel[129].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 1F, -1F, 0F, 1F, -1F, 0F, 1F, 0.5F, 0F, 1F, 0.5F); // Box 261
		yourclassnameModel[129].setRotationPoint(29.75F, -2F, 4F);

		yourclassnameModel[130].addShapeBox(0F, 0F, 0F, 0, 9, 1, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, -0.5F, 0F, 1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 262
		yourclassnameModel[130].setRotationPoint(29.75F, -11F, 4F);

		yourclassnameModel[131].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 1F, -1F, 0F, 1F, -1F, 0F, 1F, 0.5F, 0F, 1F, 0.5F); // Box 263
		yourclassnameModel[131].setRotationPoint(18.25F, -2F, 4F);

		yourclassnameModel[132].addShapeBox(0F, 0F, 0F, 0, 9, 1, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, -0.5F, 0F, 1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 264
		yourclassnameModel[132].setRotationPoint(18.25F, -11F, 4F);

		yourclassnameModel[133].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F, 0F, 1F, -1.5F, 0F, 1F, -1.5F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 265
		yourclassnameModel[133].setRotationPoint(18.25F, -14F, 4F);

		yourclassnameModel[134].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F, 0F, 1F, -1.5F, 0F, 1F, -1.5F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 266
		yourclassnameModel[134].setRotationPoint(29.75F, -14F, 4F);

		yourclassnameModel[135].addShapeBox(0F, 0F, 0F, 12, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 267
		yourclassnameModel[135].setRotationPoint(18F, 0F, -8.5F);

		yourclassnameModel[136].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 268
		yourclassnameModel[136].setRotationPoint(29.5F, -2.1F, -7.7F);
		yourclassnameModel[136].rotateAngleX = 0.06981317F;

		yourclassnameModel[137].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0.5F, 0F, 1F, 0.5F, 0F, 1F, -1F, 0F, 1F, -1F); // Box 269
		yourclassnameModel[137].setRotationPoint(29.75F, -2F, -5F);

		yourclassnameModel[138].addShapeBox(0F, 0F, 0F, 0, 9, 1, 0F, 0F, 1F, -0.5F, 0F, 1F, -0.5F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 270
		yourclassnameModel[138].setRotationPoint(29.75F, -11F, -5F);

		yourclassnameModel[139].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F, -1.5F, 0F, 1F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 271
		yourclassnameModel[139].setRotationPoint(29.75F, -14F, -5F);

		yourclassnameModel[140].addShapeBox(0F, 0F, 0F, 0, 1, 10, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 272
		yourclassnameModel[140].setRotationPoint(30F, -14.4F, -5F);

		yourclassnameModel[141].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F, 0F, 1F, 2F, 0F, 1F, 2F, 0F, 1F, -2F, 0F, 1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 273
		yourclassnameModel[141].setRotationPoint(30F, -15.4F, -5.5F);

		yourclassnameModel[142].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F, 0F, 1F, -2F, 0F, 1F, -2F, 0F, 1F, 2F, 0F, 1F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 274
		yourclassnameModel[142].setRotationPoint(30F, -15.4F, 4.5F);

		yourclassnameModel[143].addShapeBox(0F, -3F, 0F, 1, 2, 3, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 275
		yourclassnameModel[143].setRotationPoint(23.5F, 0.9F, -7.5F);
		yourclassnameModel[143].rotateAngleX = 0.05235988F;

		yourclassnameModel[144].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 276
		yourclassnameModel[144].setRotationPoint(18F, -2.1F, -7.7F);
		yourclassnameModel[144].rotateAngleX = 0.06981317F;

		yourclassnameModel[145].addShapeBox(0F, 0F, 0F, 12, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 277
		yourclassnameModel[145].setRotationPoint(18F, -4F, -8.5F);

		yourclassnameModel[146].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0.5F, 0F, 1F, 0.5F, 0F, 1F, -1F, 0F, 1F, -1F); // Box 278
		yourclassnameModel[146].setRotationPoint(18.25F, -2F, -5F);

		yourclassnameModel[147].addShapeBox(0F, 0F, 0F, 0, 9, 1, 0F, 0F, 1F, -0.5F, 0F, 1F, -0.5F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 279
		yourclassnameModel[147].setRotationPoint(18.25F, -11F, -5F);

		yourclassnameModel[148].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F, -1.5F, 0F, 1F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 280
		yourclassnameModel[148].setRotationPoint(18.25F, -14F, -5F);

		yourclassnameModel[149].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F, 0F, 1F, 2F, 0F, 1F, 2F, 0F, 1F, -2F, 0F, 1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 281
		yourclassnameModel[149].setRotationPoint(17.5F, -15.4F, -5.5F);

		yourclassnameModel[150].addShapeBox(0F, 0F, 0F, 0, 1, 10, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 282
		yourclassnameModel[150].setRotationPoint(17.5F, -14.4F, -5F);

		yourclassnameModel[151].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F, 0F, 1F, -2F, 0F, 1F, -2F, 0F, 1F, 2F, 0F, 1F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 283
		yourclassnameModel[151].setRotationPoint(17.5F, -15.4F, 4.5F);

		yourclassnameModel[152].addBox(0F, 0F, 0F, 12, 3, 2, 0F); // Box 284
		yourclassnameModel[152].setRotationPoint(18F, 1F, -8.5F);

		yourclassnameModel[153].addShapeBox(0F, 0F, 0F, 14, 8, 1, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 288
		yourclassnameModel[153].setRotationPoint(-9.5F, -4F, 8.25F);

		yourclassnameModel[154].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0.5F, 0F, -0.75F, 0.5F, 0F, 0.75F, 0F, 0F, 0.75F); // Box 290
		yourclassnameModel[154].setRotationPoint(-9.5F, -15F, 7.75F);

		yourclassnameModel[155].addShapeBox(0F, 0F, 0F, 6, 8, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 291
		yourclassnameModel[155].setRotationPoint(-15.5F, -4F, 8.5F);

		yourclassnameModel[156].addShapeBox(0F, 0F, 0F, 6, 8, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 292
		yourclassnameModel[156].setRotationPoint(-21.5F, -4F, 8.5F);

		yourclassnameModel[157].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F); // Box 295
		yourclassnameModel[157].setRotationPoint(-3F, -15F, 7.75F);

		yourclassnameModel[158].addShapeBox(0F, 0F, 0F, 11, 11, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, 0.75F, 0F, 0F, 0.75F); // Box 296
		yourclassnameModel[158].setRotationPoint(-8F, -15F, 7.75F);

		yourclassnameModel[159].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0.5F, 0F, -0.75F, 0.5F, 0F, 0.75F, 0F, 0F, 0.75F); // Box 297
		yourclassnameModel[159].setRotationPoint(3F, -15F, 7.75F);

		yourclassnameModel[160].addShapeBox(0F, 0F, 0F, 6, 8, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 299
		yourclassnameModel[160].setRotationPoint(4.5F, -4F, 8.5F);

		yourclassnameModel[161].addShapeBox(0F, 0F, 0F, 6, 8, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 300
		yourclassnameModel[161].setRotationPoint(10.5F, -4F, 8.5F);

		yourclassnameModel[162].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0.5F, 0F, -0.75F, 0.5F, 0F, 0.75F, 0F, 0F, 0.75F); // Box 302
		yourclassnameModel[162].setRotationPoint(16.5F, -15F, 7.75F);

		yourclassnameModel[163].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F); // Box 303
		yourclassnameModel[163].setRotationPoint(23F, -15F, 7.75F);

		yourclassnameModel[164].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0.5F, 0F, -0.75F, 0.5F, 0F, 0.75F, 0F, 0F, 0.75F); // Box 306
		yourclassnameModel[164].setRotationPoint(29F, -15F, 7.75F);

		yourclassnameModel[165].addBox(-2.5F, -2.5F, 0F, 5, 5, 0, 0F); // Box 1
		yourclassnameModel[165].setRotationPoint(-27.25F, 8F, 5F);

		yourclassnameModel[166].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 4
		yourclassnameModel[166].setRotationPoint(-15.25F, 7.5F, -6F);

		yourclassnameModel[167].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 5
		yourclassnameModel[167].setRotationPoint(-27.75F, 7.5F, -6F);

		yourclassnameModel[168].addBox(0F, 0F, 0F, 3, 2, 1, 0F); // Box 13
		yourclassnameModel[168].setRotationPoint(-16.5F, 5F, 6F);

		yourclassnameModel[169].addBox(0F, 0F, 0F, 3, 2, 1, 0F); // Box 14
		yourclassnameModel[169].setRotationPoint(-28.5F, 5F, 6F);

		yourclassnameModel[170].addShapeBox(0F, -1F, 0F, 3, 3, 1, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 16
		yourclassnameModel[170].setRotationPoint(-22.5F, 6.5F, 6F);

		yourclassnameModel[171].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F); // Box 28
		yourclassnameModel[171].setRotationPoint(-15.75F, 7.5F, 6.2F);

		yourclassnameModel[172].addShapeBox(0F, 0F, 0F, 3, 1, 14, 0F, 0F, 0F, 1.5F, 0F, 0F, 1F, 0F, 0F, 1.5F, 0F, 0F, 1F, 0F, 0F, 1.5F, 0F, 0F, 1F, 0F, 0F, 1.5F, 0F, 0F, 1F); // Box 35
		yourclassnameModel[172].setRotationPoint(-22.5F, 4.5F, -7F);

		yourclassnameModel[173].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39
		yourclassnameModel[173].setRotationPoint(-28.5F, 7.5F, 6F);

		yourclassnameModel[174].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		yourclassnameModel[174].setRotationPoint(-14.5F, 7.5F, 6F);

		yourclassnameModel[175].addBox(0F, 0F, 0F, 3, 2, 1, 0F); // Box 45
		yourclassnameModel[175].setRotationPoint(-28.5F, 5F, -7F);

		yourclassnameModel[176].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 1F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 1F, 0F, 0F); // Box 46
		yourclassnameModel[176].setRotationPoint(-24.5F, 5F, -7F);

		yourclassnameModel[177].addShapeBox(0F, -1F, 0F, 3, 3, 1, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 47
		yourclassnameModel[177].setRotationPoint(-22.5F, 6.5F, -7F);

		yourclassnameModel[178].addBox(0F, 0F, 0F, 3, 2, 1, 0F); // Box 49
		yourclassnameModel[178].setRotationPoint(-16.5F, 5F, -7F);

		yourclassnameModel[179].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 56
		yourclassnameModel[179].setRotationPoint(-22.5F, 7F, -5F);

		yourclassnameModel[180].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 57
		yourclassnameModel[180].setRotationPoint(-20.5F, 7F, -5F);

		yourclassnameModel[181].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 58
		yourclassnameModel[181].setRotationPoint(-19.5F, 4.5F, 7.5F);

		yourclassnameModel[182].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 59
		yourclassnameModel[182].setRotationPoint(-23.5F, 4.5F, -8.5F);

		yourclassnameModel[183].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, -0.4F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.4F, -0.2F, 0F, 0F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 0F, -0.2F); // Box 60
		yourclassnameModel[183].setRotationPoint(-22.5F, 6.5F, 7.5F);

		yourclassnameModel[184].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, -0.2F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -0.2F, -0.2F); // Box 61
		yourclassnameModel[184].setRotationPoint(-22.5F, 6.5F, -8.5F);

		yourclassnameModel[185].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 62
		yourclassnameModel[185].setRotationPoint(-19.5F, 6.75F, -8F);

		yourclassnameModel[186].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F); // Box 63
		yourclassnameModel[186].setRotationPoint(-23.5F, 6.75F, 7F);

		yourclassnameModel[187].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 41
		yourclassnameModel[187].setRotationPoint(-22F, 5.5F, -7F);

		yourclassnameModel[188].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 1F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 1F, 0F, 0F); // Box 42
		yourclassnameModel[188].setRotationPoint(-24.5F, 5F, 6F);

		yourclassnameModel[189].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 43
		yourclassnameModel[189].setRotationPoint(-22F, 5.5F, 5F);

		yourclassnameModel[190].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, -1.5F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 1.5F, 0F); // Box 44
		yourclassnameModel[190].setRotationPoint(-19.5F, 5F, 6F);

		yourclassnameModel[191].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, -1.5F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 1.5F, 0F); // Box 45
		yourclassnameModel[191].setRotationPoint(-19.5F, 5F, -7F);

		yourclassnameModel[192].addShapeBox(0F, -1F, 0F, 3, 3, 1, 0F, 2F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 2F, 0F, 0F); // Box 45
		yourclassnameModel[192].setRotationPoint(-17.5F, 7F, 3F);

		yourclassnameModel[193].addShapeBox(0F, -1F, 0F, 3, 3, 1, 0F, 2F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 2F, 0F, 0F); // Box 46
		yourclassnameModel[193].setRotationPoint(-25.5F, 7F, -2F);

		yourclassnameModel[194].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
		yourclassnameModel[194].setRotationPoint(-30.5F, 5F, 4.5F);

		yourclassnameModel[195].addShapeBox(0F, -1F, 0F, 3, 3, 1, 0F, 2F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 2F, 0F, 0F); // Box 44
		yourclassnameModel[195].setRotationPoint(-26.5F, 7F, 2F);

		yourclassnameModel[196].addShapeBox(0F, -1F, 0F, 3, 3, 1, 0F, 2F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 2F, 0F, 0F); // Box 45
		yourclassnameModel[196].setRotationPoint(-16.5F, 7F, -2F);

		yourclassnameModel[197].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -1F, 0.5F, 0F, -1F, 0.5F, 0F, -1F, 0.5F, 0.5F, -1F, 0.5F); // Box 46
		yourclassnameModel[197].setRotationPoint(-30.5F, 8F, 4.5F);

		yourclassnameModel[198].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -1F, 0.5F, 0F, -1F, 0.5F, 0F, -1F, 0.5F, 0.5F, -1F, 0.5F); // Box 47
		yourclassnameModel[198].setRotationPoint(-30.5F, 8F, -5.5F);

		yourclassnameModel[199].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 48
		yourclassnameModel[199].setRotationPoint(-30.5F, 5F, -5.5F);

		yourclassnameModel[200].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 53
		yourclassnameModel[200].setRotationPoint(-29.5F, 5F, 5F);

		yourclassnameModel[201].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F); // Box 54
		yourclassnameModel[201].setRotationPoint(-29.5F, 5F, -6F);

		yourclassnameModel[202].addBox(-2.5F, -2.5F, 0F, 5, 5, 0, 0F); // Box 57
		yourclassnameModel[202].setRotationPoint(-27.25F, 8F, -5F);

		yourclassnameModel[203].addBox(-2.5F, -2.5F, 0F, 5, 5, 0, 0F); // Box 58
		yourclassnameModel[203].setRotationPoint(-14.75F, 8F, -5F);

		yourclassnameModel[204].addBox(-2.5F, -2.5F, 0F, 5, 5, 0, 0F); // Box 59
		yourclassnameModel[204].setRotationPoint(-14.75F, 8F, 5F);

		yourclassnameModel[205].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F); // Box 58
		yourclassnameModel[205].setRotationPoint(-17.75F, 7.5F, 6F);

		yourclassnameModel[206].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F); // Box 59
		yourclassnameModel[206].setRotationPoint(-28.25F, 7.5F, 6.2F);

		yourclassnameModel[207].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 60
		yourclassnameModel[207].setRotationPoint(-26.25F, 7.5F, 6F);

		yourclassnameModel[208].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F); // Box 61
		yourclassnameModel[208].setRotationPoint(-15.75F, 7.5F, -7.2F);

		yourclassnameModel[209].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F); // Box 62
		yourclassnameModel[209].setRotationPoint(-17.75F, 7.5F, -7F);

		yourclassnameModel[210].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 63
		yourclassnameModel[210].setRotationPoint(-26.25F, 7.5F, -7F);

		yourclassnameModel[211].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F); // Box 64
		yourclassnameModel[211].setRotationPoint(-28.25F, 7.5F, -7.2F);

		yourclassnameModel[212].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 65
		yourclassnameModel[212].setRotationPoint(-14.5F, 7.5F, -7F);

		yourclassnameModel[213].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 66
		yourclassnameModel[213].setRotationPoint(-28.5F, 7.5F, -7F);

		yourclassnameModel[214].addShapeBox(0F, 0F, 0F, 9, 5, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 362
		yourclassnameModel[214].setRotationPoint(-5F, 5F, -0.5F);

		yourclassnameModel[215].addShapeBox(0F, 0F, 0F, 4, 5, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 363
		yourclassnameModel[215].setRotationPoint(5.5F, 5F, 0F);

		yourclassnameModel[216].addShapeBox(0F, 0F, 0F, 6, 10, 1, 0F, 0F, 0F, 0.06F, 0F, 0F, 0.06F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 364
		yourclassnameModel[216].setRotationPoint(-15.5F, -14F, -8.75F);

		yourclassnameModel[217].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.06F, 0F, 0F, 0.06F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 367
		yourclassnameModel[217].setRotationPoint(-15.5F, -15F, -8.75F);

		yourclassnameModel[218].addShapeBox(0F, 0F, 0F, 6, 10, 1, 0F, 0F, 0F, 0.06F, 0F, 0F, 0.06F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 368
		yourclassnameModel[218].setRotationPoint(-21.5F, -14F, -8.75F);

		yourclassnameModel[219].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.06F, 0F, 0F, 0.06F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 369
		yourclassnameModel[219].setRotationPoint(-21.5F, -15F, -8.75F);

		yourclassnameModel[220].addShapeBox(0F, 0F, 0F, 6, 10, 1, 0F, 0F, 0F, 0.06F, 0F, 0F, 0.06F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 370
		yourclassnameModel[220].setRotationPoint(4.5F, -14F, -8.75F);

		yourclassnameModel[221].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.06F, 0F, 0F, 0.06F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 371
		yourclassnameModel[221].setRotationPoint(4.5F, -15F, -8.75F);

		yourclassnameModel[222].addShapeBox(0F, 0F, 0F, 6, 10, 1, 0F, 0F, 0F, 0.06F, 0F, 0F, 0.06F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 372
		yourclassnameModel[222].setRotationPoint(10.5F, -14F, -8.75F);

		yourclassnameModel[223].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.06F, 0F, 0F, 0.06F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 373
		yourclassnameModel[223].setRotationPoint(10.5F, -15F, -8.75F);

		yourclassnameModel[224].addShapeBox(0F, 0F, 0F, 6, 10, 1, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0.06F, 0F, 0F, 0.06F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F); // Box 374
		yourclassnameModel[224].setRotationPoint(-21.5F, -14F, 7.75F);

		yourclassnameModel[225].addShapeBox(0F, 0F, 0F, 6, 10, 1, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0.06F, 0F, 0F, 0.06F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F); // Box 375
		yourclassnameModel[225].setRotationPoint(-15.5F, -14F, 7.75F);

		yourclassnameModel[226].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.06F, 0F, 0F, 0.06F); // Box 376
		yourclassnameModel[226].setRotationPoint(-15.5F, -15F, 7.75F);

		yourclassnameModel[227].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.06F, 0F, 0F, 0.06F); // Box 377
		yourclassnameModel[227].setRotationPoint(-21.5F, -15F, 7.75F);

		yourclassnameModel[228].addShapeBox(0F, 0F, 0F, 6, 10, 1, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0.06F, 0F, 0F, 0.06F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F); // Box 378
		yourclassnameModel[228].setRotationPoint(4.5F, -14F, 7.75F);

		yourclassnameModel[229].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.06F, 0F, 0F, 0.06F); // Box 379
		yourclassnameModel[229].setRotationPoint(4.5F, -15F, 7.75F);

		yourclassnameModel[230].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.06F, 0F, 0F, 0.06F); // Box 380
		yourclassnameModel[230].setRotationPoint(10.5F, -15F, 7.75F);

		yourclassnameModel[231].addShapeBox(0F, 0F, 0F, 6, 10, 1, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0.06F, 0F, 0F, 0.06F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F); // Box 381
		yourclassnameModel[231].setRotationPoint(10.5F, -14F, 7.75F);

		yourclassnameModel[232].addShapeBox(0F, 0F, 0F, 3, 8, 1, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 382
		yourclassnameModel[232].setRotationPoint(15F, -4F, 7.5F);

		yourclassnameModel[233].addShapeBox(0F, 0F, 0F, 3, 10, 1, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F); // Box 383
		yourclassnameModel[233].setRotationPoint(15.01F, -14F, 7F);

		yourclassnameModel[234].addShapeBox(0F, 0F, 0F, 3, 10, 1, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F); // Box 384
		yourclassnameModel[234].setRotationPoint(2.51F, -14F, 7F);

		yourclassnameModel[235].addShapeBox(0F, 0F, 0F, 3, 8, 1, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 385
		yourclassnameModel[235].setRotationPoint(2.5F, -4F, 7.5F);

		yourclassnameModel[236].addShapeBox(0F, 0F, 0F, 3, 10, 1, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F); // Box 386
		yourclassnameModel[236].setRotationPoint(-10.99F, -14F, 7F);

		yourclassnameModel[237].addShapeBox(0F, 0F, 0F, 3, 8, 1, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 387
		yourclassnameModel[237].setRotationPoint(-11F, -4F, 7.5F);

		yourclassnameModel[238].addShapeBox(0F, 0F, 0F, 3, 8, 1, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 388
		yourclassnameModel[238].setRotationPoint(-23.5F, -4F, 7.5F);

		yourclassnameModel[239].addShapeBox(0F, 0F, 0F, 3, 10, 1, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F); // Box 389
		yourclassnameModel[239].setRotationPoint(-23.49F, -14F, 7F);

		yourclassnameModel[240].addShapeBox(0F, 0F, 0F, 11, 11, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, 0.75F, 0F, 0F, 0.75F); // Box 397
		yourclassnameModel[240].setRotationPoint(18F, -15F, 7.75F);

		yourclassnameModel[241].addShapeBox(0F, 0F, 0F, 11, 11, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, -1.25F, 0F, 0F, -1.25F); // Box 398
		yourclassnameModel[241].setRotationPoint(18F, -15F, -8.75F);

		yourclassnameModel[242].addShapeBox(0F, 0F, 0F, 11, 11, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, -1.25F, 0F, 0F, -1.25F); // Box 399
		yourclassnameModel[242].setRotationPoint(-8F, -15F, -8.75F);

		yourclassnameModel[243].addShapeBox(0F, 0F, 0F, 63, 2, 2, 0F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 400
		yourclassnameModel[243].setRotationPoint(-32.5F, -16F, 5.75F);

		yourclassnameModel[244].addShapeBox(0F, 0F, 0F, 2, 11, 7, 0F, 0F, 0F, -0.75F, -1F, 0F, -2.25F, -1F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -1F, 0F, -1.5F, -1F, 0F, -2F, 0F, 0F, -2F); // Box 401
		yourclassnameModel[244].setRotationPoint(32F, -15F, -8F);

		yourclassnameModel[245].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, 0F, 0F, -0.1F, 0F); // Lamp 2
		yourclassnameModel[245].setRotationPoint(-34.2F, 3.1F, -5.3F);

		yourclassnameModel[246].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, -0.75F, -0.5F, 0F, -0.45F, -0.25F, 0F, -0.45F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.7F, -0.5F, 0F, -0.7F, -0.25F, 0F, -0.7F, -0.25F, 0F, -0.7F, -0.25F); // Box 223
		yourclassnameModel[246].setRotationPoint(-34.2F, 2F, -6.1F);

		yourclassnameModel[247].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, -0.75F, -0.25F, 0F, -0.45F, -0.25F, 0F, -0.45F, -0.25F, 0F, -0.95F, -0.5F, 0F, -0.6F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.85F, -0.5F); // Box 83
		yourclassnameModel[247].setRotationPoint(-34.2F, 2F, -4.5F);

		yourclassnameModel[248].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, -0.8F, -0.45F, 0F, -0.5F, -0.45F, 0F, -0.5F, -0.05F, 0F, -0.8F, -0.05F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.05F, 0F, 0F, -0.05F); // Box 52
		yourclassnameModel[248].setRotationPoint(-34.2F, 1.95F, -7.2F);

		yourclassnameModel[249].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, -0.8F, -0.45F, 0F, -0.5F, -0.45F, 0F, -0.5F, -0.05F, 0F, -0.8F, -0.05F); // Box 413
		yourclassnameModel[249].setRotationPoint(-34.2F, 4.15F, -7.2F);

		yourclassnameModel[250].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, 0F, 0F, -0.1F, 0F); // Lamp 4
		yourclassnameModel[250].setRotationPoint(-34.2F, 3.1F, -6.7F);

		yourclassnameModel[251].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, -0.95F, -0.5F, 0F, -0.45F, -0.25F, 0F, -0.45F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.85F, -0.5F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.6F, -0.25F); // Box 415
		yourclassnameModel[251].setRotationPoint(-34.2F, 2F, -7.5F);

		yourclassnameModel[252].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 1.65F, 0F, 0.2F, 1.65F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 1.65F, 0F, 0.2F, 1.65F); // Box 424
		yourclassnameModel[252].setRotationPoint(-34.1F, 3.02F, -6.8F);

		yourclassnameModel[253].addBox(0F, 0F, 0F, 6, 1, 1, 0F); // Box 425
		yourclassnameModel[253].setRotationPoint(27.5F, 6F, -1F);

		yourclassnameModel[254].addBox(0F, 0F, 0F, 1, 2, 3, 0F); // Box 426
		yourclassnameModel[254].setRotationPoint(33.5F, 6F, -2F);

		yourclassnameModel[255].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F, 0F, 0F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, 0F, 0F, -2F, 0.5F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -2F, 0.5F, 0F); // Box 466
		yourclassnameModel[255].setRotationPoint(28F, 7.75F, 0.9F);

		yourclassnameModel[256].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 467
		yourclassnameModel[256].setRotationPoint(30F, 8.75F, 0.9F);

		yourclassnameModel[257].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 468
		yourclassnameModel[257].setRotationPoint(30F, 8.75F, -1.9F);

		yourclassnameModel[258].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F, 0F, 0F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, 0F, 0F, -2F, 0.5F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -2F, 0.5F, 0F); // Box 469
		yourclassnameModel[258].setRotationPoint(28F, 7.75F, -1.9F);

		yourclassnameModel[259].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F, -0.5F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.25F, 0F, 1F, 0F, 0F, -2F, 0.5F, 0F, -2F, 0.5F, 0F, 1F, 0F, 0F); // Box 470
		yourclassnameModel[259].setRotationPoint(33F, 7.75F, 0.9F);

		yourclassnameModel[260].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F, -0.5F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.25F, 0F, 1F, 0F, 0F, -2F, 0.5F, 0F, -2F, 0.5F, 0F, 1F, 0F, 0F); // Box 473
		yourclassnameModel[260].setRotationPoint(33F, 7.75F, -1.9F);

		yourclassnameModel[261].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 287
		yourclassnameModel[261].setRotationPoint(-33.5F, 8.75F, 1.9F);

		yourclassnameModel[262].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F, 0F, 0F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, 0F, 0F, -2F, 0.5F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -2F, 0.5F, 0F); // Box 288
		yourclassnameModel[262].setRotationPoint(-35.5F, 7.75F, -1.9F);

		yourclassnameModel[263].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F, 0F, 0F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, 0F, 0F, -2F, 0.5F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -2F, 0.5F, 0F); // Box 289
		yourclassnameModel[263].setRotationPoint(-35.5F, 7.75F, 1.9F);

		yourclassnameModel[264].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 290
		yourclassnameModel[264].setRotationPoint(-33.5F, 8.75F, -1.9F);

		yourclassnameModel[265].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F, -0.5F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.25F, 0F, 1F, 0F, 0F, -2F, 0.5F, 0F, -2F, 0.5F, 0F, 1F, 0F, 0F); // Box 291
		yourclassnameModel[265].setRotationPoint(-30.5F, 7.75F, -1.9F);

		yourclassnameModel[266].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F, -0.5F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.25F, 0F, 1F, 0F, 0F, -2F, 0.5F, 0F, -2F, 0.5F, 0F, 1F, 0F, 0F); // Box 292
		yourclassnameModel[266].setRotationPoint(-30.5F, 7.75F, 1.9F);

		yourclassnameModel[267].addBox(0F, 0F, 0F, 3, 2, 1, 0F); // Box 289
		yourclassnameModel[267].setRotationPoint(12.5F, 5F, 6F);

		yourclassnameModel[268].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 290
		yourclassnameModel[268].setRotationPoint(12.5F, 7.5F, 6F);

		yourclassnameModel[269].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F); // Box 291
		yourclassnameModel[269].setRotationPoint(12.75F, 7.5F, 6.2F);

		yourclassnameModel[270].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 292
		yourclassnameModel[270].setRotationPoint(14.75F, 7.5F, 6F);

		yourclassnameModel[271].addShapeBox(0F, -1F, 0F, 3, 3, 1, 0F, 2F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 2F, 0F, 0F); // Box 293
		yourclassnameModel[271].setRotationPoint(14.5F, 7F, 2F);

		yourclassnameModel[272].addShapeBox(0F, -1F, 0F, 3, 3, 1, 0F, 2F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 2F, 0F, 0F); // Box 294
		yourclassnameModel[272].setRotationPoint(15.5F, 7F, -2F);

		yourclassnameModel[273].addShapeBox(0F, -1F, 0F, 3, 3, 1, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 295
		yourclassnameModel[273].setRotationPoint(18.5F, 6.5F, 6F);

		yourclassnameModel[274].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F); // Box 296
		yourclassnameModel[274].setRotationPoint(17.5F, 6.75F, 7F);

		yourclassnameModel[275].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, -0.4F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.4F, -0.2F, 0F, 0F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 0F, -0.2F); // Box 297
		yourclassnameModel[275].setRotationPoint(18.5F, 6.5F, 7.5F);

		yourclassnameModel[276].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 298
		yourclassnameModel[276].setRotationPoint(21.5F, 4.5F, 7.5F);

		yourclassnameModel[277].addShapeBox(0F, 0F, 0F, 3, 1, 14, 0F, 0F, 0F, 1.5F, 0F, 0F, 1F, 0F, 0F, 1.5F, 0F, 0F, 1F, 0F, 0F, 1.5F, 0F, 0F, 1F, 0F, 0F, 1.5F, 0F, 0F, 1F); // Box 299
		yourclassnameModel[277].setRotationPoint(18.5F, 4.5F, -7F);

		yourclassnameModel[278].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 300
		yourclassnameModel[278].setRotationPoint(19F, 5.5F, 5F);

		yourclassnameModel[279].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, -1.5F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 1.5F, 0F); // Box 301
		yourclassnameModel[279].setRotationPoint(21.5F, 5F, 6F);

		yourclassnameModel[280].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 1F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 1F, 0F, 0F); // Box 302
		yourclassnameModel[280].setRotationPoint(16.5F, 5F, 6F);

		yourclassnameModel[281].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F); // Box 303
		yourclassnameModel[281].setRotationPoint(23.25F, 7.5F, 6F);

		yourclassnameModel[282].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F); // Box 304
		yourclassnameModel[282].setRotationPoint(25.25F, 7.5F, 6.2F);

		yourclassnameModel[283].addBox(0F, 0F, 0F, 3, 2, 1, 0F); // Box 305
		yourclassnameModel[283].setRotationPoint(24.5F, 5F, 6F);

		yourclassnameModel[284].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 306
		yourclassnameModel[284].setRotationPoint(26.5F, 7.5F, 6F);

		yourclassnameModel[285].addBox(-2.5F, -2.5F, 0F, 5, 5, 0, 0F); // Box 307
		yourclassnameModel[285].setRotationPoint(26.25F, 8F, 5F);

		yourclassnameModel[286].addShapeBox(0F, -1F, 0F, 3, 3, 1, 0F, 2F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 2F, 0F, 0F); // Box 308
		yourclassnameModel[286].setRotationPoint(23.5F, 7F, 3F);

		yourclassnameModel[287].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 309
		yourclassnameModel[287].setRotationPoint(20.5F, 7F, -5F);

		yourclassnameModel[288].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 310
		yourclassnameModel[288].setRotationPoint(18.5F, 7F, -5F);

		yourclassnameModel[289].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 311
		yourclassnameModel[289].setRotationPoint(18.5F, 5F, -1.5F);

		yourclassnameModel[290].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 312
		yourclassnameModel[290].setRotationPoint(19F, 5.5F, -7F);

		yourclassnameModel[291].addBox(-2.5F, -2.5F, 0F, 5, 5, 0, 0F); // Box 313
		yourclassnameModel[291].setRotationPoint(13.75F, 8F, 5F);

		yourclassnameModel[292].addBox(-2.5F, -2.5F, 0F, 5, 5, 0, 0F); // Box 314
		yourclassnameModel[292].setRotationPoint(26.25F, 8F, -5F);

		yourclassnameModel[293].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, -1.5F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 1.5F, 0F); // Box 315
		yourclassnameModel[293].setRotationPoint(21.5F, 5F, -7F);

		yourclassnameModel[294].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F); // Box 316
		yourclassnameModel[294].setRotationPoint(23.25F, 7.5F, -7F);

		yourclassnameModel[295].addShapeBox(0F, -1F, 0F, 3, 3, 1, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 317
		yourclassnameModel[295].setRotationPoint(18.5F, 6.5F, -7F);

		yourclassnameModel[296].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 318
		yourclassnameModel[296].setRotationPoint(21.5F, 6.75F, -8F);

		yourclassnameModel[297].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, -0.2F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -0.2F, -0.2F); // Box 319
		yourclassnameModel[297].setRotationPoint(18.5F, 6.5F, -8.5F);

		yourclassnameModel[298].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 320
		yourclassnameModel[298].setRotationPoint(17.5F, 4.5F, -8.5F);

		yourclassnameModel[299].addBox(0F, 0F, 0F, 3, 2, 1, 0F); // Box 321
		yourclassnameModel[299].setRotationPoint(12.5F, 5F, -7F);

		yourclassnameModel[300].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 1F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 1F, 0F, 0F); // Box 322
		yourclassnameModel[300].setRotationPoint(16.5F, 5F, -7F);

		yourclassnameModel[301].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 323
		yourclassnameModel[301].setRotationPoint(14.75F, 7.5F, -7F);

		yourclassnameModel[302].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F); // Box 324
		yourclassnameModel[302].setRotationPoint(12.75F, 7.5F, -7.2F);

		yourclassnameModel[303].addBox(-2.5F, -2.5F, 0F, 5, 5, 0, 0F); // Box 325
		yourclassnameModel[303].setRotationPoint(13.75F, 8F, -5F);

		yourclassnameModel[304].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 326
		yourclassnameModel[304].setRotationPoint(13.25F, 7.5F, -6F);

		yourclassnameModel[305].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F); // Box 327
		yourclassnameModel[305].setRotationPoint(25.25F, 7.5F, -7.2F);

		yourclassnameModel[306].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 328
		yourclassnameModel[306].setRotationPoint(26.5F, 7.5F, -7F);

		yourclassnameModel[307].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 329
		yourclassnameModel[307].setRotationPoint(25.75F, 7.5F, -6F);

		yourclassnameModel[308].addBox(0F, 0F, 0F, 3, 2, 1, 0F); // Box 330
		yourclassnameModel[308].setRotationPoint(24.5F, 5F, -7F);

		yourclassnameModel[309].addShapeBox(0F, -1F, 0F, 3, 3, 1, 0F, 2F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 2F, 0F, 0F); // Box 333
		yourclassnameModel[309].setRotationPoint(24.5F, 7F, -2F);

		yourclassnameModel[310].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 334
		yourclassnameModel[310].setRotationPoint(12.5F, 7.5F, -7F);

		yourclassnameModel[311].addShapeBox(0F, 0F, 0F, 5, 5, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 335
		yourclassnameModel[311].setRotationPoint(-10.5F, 5F, -8F);

		yourclassnameModel[312].addShapeBox(0F, 0F, 0F, 9, 5, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 336
		yourclassnameModel[312].setRotationPoint(-5F, 5F, -7.5F);

		yourclassnameModel[313].addShapeBox(0F, 0F, 0F, 4, 5, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 337
		yourclassnameModel[313].setRotationPoint(5.5F, 5F, -8F);

		yourclassnameModel[314].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, 0F, 0F, -0.1F, 0F); // Lamp 1
		yourclassnameModel[314].setRotationPoint(-34.2F, 3.1F, 4.2F);

		yourclassnameModel[315].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 1.65F, 0F, 0.2F, 1.65F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 1.65F, 0F, 0.2F, 1.65F); // Box 339
		yourclassnameModel[315].setRotationPoint(-34.1F, 3.02F, 4.2F);

		yourclassnameModel[316].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, -0.75F, -0.5F, 0F, -0.45F, -0.25F, 0F, -0.45F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.7F, -0.5F, 0F, -0.7F, -0.25F, 0F, -0.7F, -0.25F, 0F, -0.7F, -0.25F); // Box 340
		yourclassnameModel[316].setRotationPoint(-34.2F, 2F, 4.9F);

		yourclassnameModel[317].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, -0.8F, -0.45F, 0F, -0.5F, -0.45F, 0F, -0.5F, -0.05F, 0F, -0.8F, -0.05F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.05F, 0F, 0F, -0.05F); // Box 341
		yourclassnameModel[317].setRotationPoint(-34.2F, 1.95F, 3.8F);

		yourclassnameModel[318].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, -0.95F, -0.5F, 0F, -0.45F, -0.25F, 0F, -0.45F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.85F, -0.5F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.6F, -0.25F); // Box 342
		yourclassnameModel[318].setRotationPoint(-34.2F, 2F, 3.5F);

		yourclassnameModel[319].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, -0.8F, -0.45F, 0F, -0.5F, -0.45F, 0F, -0.5F, -0.05F, 0F, -0.8F, -0.05F); // Box 343
		yourclassnameModel[319].setRotationPoint(-34.2F, 4.15F, 3.8F);

		yourclassnameModel[320].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, 0F, 0F, -0.1F, 0F); // Lamp3
		yourclassnameModel[320].setRotationPoint(-34.2F, 3.1F, 5.7F);

		yourclassnameModel[321].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, -0.75F, -0.25F, 0F, -0.45F, -0.25F, 0F, -0.45F, -0.25F, 0F, -0.95F, -0.5F, 0F, -0.6F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.85F, -0.5F); // Box 345
		yourclassnameModel[321].setRotationPoint(-34.2F, 2F, 6.5F);

		yourclassnameModel[322].addShapeBox(0F, 0F, 0F, 12, 14, 1, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, -9F, 0F, -0.3F, -9F, -9F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, -9F, -9F, 0F); // Box 332
		yourclassnameModel[322].setRotationPoint(-34F, -9F, 8.5F);

		yourclassnameModel[323].addShapeBox(0F, 0F, 0F, 12, 14, 1, 0F, -9F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, -9F, 0F, 0F, -9F, -9F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, -9F, -9F, 0F); // Box 333
		yourclassnameModel[323].setRotationPoint(-34F, -9F, -9.5F);

		yourclassnameModel[324].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, -0.7F, 0F, -0.5F, -0.7F, 0F, -0.5F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 173
		yourclassnameModel[324].setRotationPoint(23.5F, -3.1F, -7.05F);

		yourclassnameModel[325].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0.5F, 0F, 1F, 0.5F, 0F, 1F, -1F, 0F, 1F, -1F); // Box 335
		yourclassnameModel[325].setRotationPoint(23.75F, -2.1F, -5F);

		yourclassnameModel[326].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, -0.7F, 0F, -0.5F, -0.7F, 0F, -0.5F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 336
		yourclassnameModel[326].setRotationPoint(-3F, -3.1F, -7.05F);

		yourclassnameModel[327].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0.5F, 0F, 1F, 0.5F, 0F, 1F, -1F, 0F, 1F, -1F); // Box 337
		yourclassnameModel[327].setRotationPoint(-2.75F, -2.1F, -5F);

		yourclassnameModel[328].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, -0.7F, 0F, -0.5F, -0.7F, 0F, -0.5F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 338
		yourclassnameModel[328].setRotationPoint(-3F, -3.1F, -7.05F);

		yourclassnameModel[329].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, -0.7F, 0F, -0.5F, -0.7F, 0F, -0.5F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 339
		yourclassnameModel[329].setRotationPoint(-3F, -3.1F, -7.05F);

		yourclassnameModel[330].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, -0.7F, 0F, -0.5F, -0.7F, 0F, -0.5F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 340
		yourclassnameModel[330].setRotationPoint(-3F, -3.1F, -7.05F);

		yourclassnameModel[331].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, -0.7F, 0F, -0.5F, -0.7F, 0F, -0.5F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 341
		yourclassnameModel[331].setRotationPoint(-8.5F, -3.1F, -7.5F);

		yourclassnameModel[332].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, -0.7F, 0F, -0.5F, -0.7F, 0F, -0.5F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 342
		yourclassnameModel[332].setRotationPoint(3F, -3.1F, -7.5F);

		yourclassnameModel[333].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, -0.7F, 0F, -0.5F, -0.7F, 0F, -0.5F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 343
		yourclassnameModel[333].setRotationPoint(18F, -3.1F, -7.5F);

		yourclassnameModel[334].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, -0.7F, 0F, -0.5F, -0.7F, 0F, -0.5F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 344
		yourclassnameModel[334].setRotationPoint(29.5F, -3.1F, -7.5F);

		yourclassnameModel[335].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 1F, -1F, 0F, 1F, -1F, 0F, 1F, 0.5F, 0F, 1F, 0.5F); // Box 345
		yourclassnameModel[335].setRotationPoint(-2.75F, -2.1F, 4F);

		yourclassnameModel[336].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, -0.7F, 0F, -0.5F, -0.7F, 0F, -0.5F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 346
		yourclassnameModel[336].setRotationPoint(-3F, -3.1F, 3.95F);

		yourclassnameModel[337].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, -0.7F, 0F, -0.5F, -0.7F, 0F, -0.5F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 347
		yourclassnameModel[337].setRotationPoint(23.5F, -3.1F, 3.95F);

		yourclassnameModel[338].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 1F, -1F, 0F, 1F, -1F, 0F, 1F, 0.5F, 0F, 1F, 0.5F); // Box 348
		yourclassnameModel[338].setRotationPoint(23.75F, -2.1F, 4F);

		yourclassnameModel[339].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, -0.7F, 0F, -0.5F, -0.7F, 0F, -0.5F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 349
		yourclassnameModel[339].setRotationPoint(29.5F, -3.1F, 4.5F);

		yourclassnameModel[340].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, -0.7F, 0F, -0.5F, -0.7F, 0F, -0.5F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 350
		yourclassnameModel[340].setRotationPoint(18F, -3.1F, 4.5F);

		yourclassnameModel[341].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, -0.7F, 0F, -0.5F, -0.7F, 0F, -0.5F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 351
		yourclassnameModel[341].setRotationPoint(3F, -3.1F, 4.5F);

		yourclassnameModel[342].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, -0.7F, 0F, -0.5F, -0.7F, 0F, -0.5F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 352
		yourclassnameModel[342].setRotationPoint(-8.5F, -3.1F, 4.5F);

		yourclassnameModel[343].addBox(0F, 0F, 0F, 11, 3, 12, 0F); // Box 353
		yourclassnameModel[343].setRotationPoint(17.5F, -19F, -6F);

		yourclassnameModel[344].addShapeBox(0F, 0F, 0F, 2, 11, 1, 0F, -0.6F, 0F, -1.75F, 0F, 0F, -0.75F, 0F, 0F, 0.5F, -0.6F, 0F, 1.2F, -0.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0.5F); // Box 353
		yourclassnameModel[344].setRotationPoint(-34.51F, -15F, -9.55F);

		yourclassnameModel[345].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F, -0.6F, 0F, -1F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.6F, 0F, 0.5F, -0.55F, 0F, -1.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, -0.555F, 0F, 0.75F); // Box 354
		yourclassnameModel[345].setRotationPoint(-34.51F, -4F, -9.55F);


	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		for(int i = 0; i < 346; i++)
		{
			yourclassnameModel[i].render(f5);
		}
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
	{
	}

	public ModelRendererTurbo yourclassnameModel[];
}