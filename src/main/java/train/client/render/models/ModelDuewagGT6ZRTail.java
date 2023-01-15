//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2023 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 18.06.2022 - 13:56:48
// Last changed on: 18.06.2022 - 13:56:48

package train.client.render.models; //Path where the model is located

import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import org.lwjgl.opengl.GL11;
import tmt.ModelConverter;
import tmt.ModelRendererTurbo;
import train.common.api.Locomotive;

public class ModelDuewagGT6ZRTail extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 256;

	public ModelDuewagGT6ZRTail() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[208];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 9
		bodyModel[1] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 62
		bodyModel[2] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 63
		bodyModel[3] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 65
		bodyModel[4] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 66
		bodyModel[5] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 67
		bodyModel[6] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 76
		bodyModel[7] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 79
		bodyModel[8] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 80
		bodyModel[9] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 81
		bodyModel[10] = new ModelRendererTurbo(this, 249, 9, textureX, textureY); // Box 140
		bodyModel[11] = new ModelRendererTurbo(this, 233, 17, textureX, textureY); // Box 142
		bodyModel[12] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 145
		bodyModel[13] = new ModelRendererTurbo(this, 345, 9, textureX, textureY); // Box 154
		bodyModel[14] = new ModelRendererTurbo(this, 377, 9, textureX, textureY); // Box 165
		bodyModel[15] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 184
		bodyModel[16] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 185
		bodyModel[17] = new ModelRendererTurbo(this, 217, 17, textureX, textureY); // Box 186
		bodyModel[18] = new ModelRendererTurbo(this, 9, 25, textureX, textureY); // Box 82
		bodyModel[19] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 58
		bodyModel[20] = new ModelRendererTurbo(this, 17, 25, textureX, textureY); // Box 86
		bodyModel[21] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Box 179
		bodyModel[22] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 180
		bodyModel[23] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 181
		bodyModel[24] = new ModelRendererTurbo(this, 377, 9, textureX, textureY); // Box 182
		bodyModel[25] = new ModelRendererTurbo(this, 457, 9, textureX, textureY); // Box 183
		bodyModel[26] = new ModelRendererTurbo(this, 41, 23, textureX, textureY); // Box 161
		bodyModel[27] = new ModelRendererTurbo(this, 57, 25, textureX, textureY); // Box 139
		bodyModel[28] = new ModelRendererTurbo(this, 233, 25, textureX, textureY); // Box 141
		bodyModel[29] = new ModelRendererTurbo(this, 169, 25, textureX, textureY); // Box 156
		bodyModel[30] = new ModelRendererTurbo(this, 425, 25, textureX, textureY); // Box 294
		bodyModel[31] = new ModelRendererTurbo(this, 65, 33, textureX, textureY); // Box 306
		bodyModel[32] = new ModelRendererTurbo(this, 201, 33, textureX, textureY); // Box 0
		bodyModel[33] = new ModelRendererTurbo(this, 441, 25, textureX, textureY); // Box 4
		bodyModel[34] = new ModelRendererTurbo(this, 481, 25, textureX, textureY); // Box 5
		bodyModel[35] = new ModelRendererTurbo(this, 265, 33, textureX, textureY); // Box 6
		bodyModel[36] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 294
		bodyModel[37] = new ModelRendererTurbo(this, 281, 33, textureX, textureY); // Box 170
		bodyModel[38] = new ModelRendererTurbo(this, 305, 33, textureX, textureY); // Box 92
		bodyModel[39] = new ModelRendererTurbo(this, 313, 33, textureX, textureY); // Box 93
		bodyModel[40] = new ModelRendererTurbo(this, 321, 33, textureX, textureY); // Box 94
		bodyModel[41] = new ModelRendererTurbo(this, 328, 33, textureX, textureY); // Box 95
		bodyModel[42] = new ModelRendererTurbo(this, 345, 17, textureX, textureY); // Box 96
		bodyModel[43] = new ModelRendererTurbo(this, 377, 17, textureX, textureY); // Box 97
		bodyModel[44] = new ModelRendererTurbo(this, 337, 33, textureX, textureY); // Box 98
		bodyModel[45] = new ModelRendererTurbo(this, 369, 33, textureX, textureY); // Box 99
		bodyModel[46] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 100
		bodyModel[47] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 103
		bodyModel[48] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 104
		bodyModel[49] = new ModelRendererTurbo(this, 385, 33, textureX, textureY); // Box 105
		bodyModel[50] = new ModelRendererTurbo(this, 409, 33, textureX, textureY); // Box 106
		bodyModel[51] = new ModelRendererTurbo(this, 41, 41, textureX, textureY); // Box 107
		bodyModel[52] = new ModelRendererTurbo(this, 425, 33, textureX, textureY); // Box 109
		bodyModel[53] = new ModelRendererTurbo(this, 481, 33, textureX, textureY); // Box 110
		bodyModel[54] = new ModelRendererTurbo(this, 81, 41, textureX, textureY); // Box 111
		bodyModel[55] = new ModelRendererTurbo(this, 114, 41, textureX, textureY); // Box 112
		bodyModel[56] = new ModelRendererTurbo(this, 385, 41, textureX, textureY); // Box 113
		bodyModel[57] = new ModelRendererTurbo(this, 97, 41, textureX, textureY); // Box 116
		bodyModel[58] = new ModelRendererTurbo(this, 457, 49, textureX, textureY); // Box 117
		bodyModel[59] = new ModelRendererTurbo(this, 113, 57, textureX, textureY); // Box 118
		bodyModel[60] = new ModelRendererTurbo(this, 49, 49, textureX, textureY); // Box 120
		bodyModel[61] = new ModelRendererTurbo(this, 57, 49, textureX, textureY); // Box 121
		bodyModel[62] = new ModelRendererTurbo(this, 65, 49, textureX, textureY); // Box 122
		bodyModel[63] = new ModelRendererTurbo(this, 73, 49, textureX, textureY); // Box 123
		bodyModel[64] = new ModelRendererTurbo(this, 201, 81, textureX, textureY); // Box 171
		bodyModel[65] = new ModelRendererTurbo(this, 489, 9, textureX, textureY); // Box 173
		bodyModel[66] = new ModelRendererTurbo(this, 41, 25, textureX, textureY); // Box 176
		bodyModel[67] = new ModelRendererTurbo(this, 289, 81, textureX, textureY); // Box 179
		bodyModel[68] = new ModelRendererTurbo(this, 393, 81, textureX, textureY); // Box 180
		bodyModel[69] = new ModelRendererTurbo(this, 433, 81, textureX, textureY); // Box 181
		bodyModel[70] = new ModelRendererTurbo(this, 273, 81, textureX, textureY); // Box 182
		bodyModel[71] = new ModelRendererTurbo(this, 241, 65, textureX, textureY); // Box 184
		bodyModel[72] = new ModelRendererTurbo(this, 337, 33, textureX, textureY); // Box 185
		bodyModel[73] = new ModelRendererTurbo(this, 497, 33, textureX, textureY); // Box 186
		bodyModel[74] = new ModelRendererTurbo(this, 273, 57, textureX, textureY); // Box 226
		bodyModel[75] = new ModelRendererTurbo(this, 169, 81, textureX, textureY); // Box 227
		bodyModel[76] = new ModelRendererTurbo(this, 297, 33, textureX, textureY); // Box 228
		bodyModel[77] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 195
		bodyModel[78] = new ModelRendererTurbo(this, 73, 89, textureX, textureY); // Box 196
		bodyModel[79] = new ModelRendererTurbo(this, 113, 89, textureX, textureY); // Box 197
		bodyModel[80] = new ModelRendererTurbo(this, 361, 41, textureX, textureY); // Box 207
		bodyModel[81] = new ModelRendererTurbo(this, 169, 89, textureX, textureY); // Box 208
		bodyModel[82] = new ModelRendererTurbo(this, 337, 57, textureX, textureY); // Box 209
		bodyModel[83] = new ModelRendererTurbo(this, 225, 97, textureX, textureY); // Box 385
		bodyModel[84] = new ModelRendererTurbo(this, 329, 97, textureX, textureY); // Box 386
		bodyModel[85] = new ModelRendererTurbo(this, 361, 97, textureX, textureY); // Box 388
		bodyModel[86] = new ModelRendererTurbo(this, 33, 73, textureX, textureY); // Box 389
		bodyModel[87] = new ModelRendererTurbo(this, 361, 57, textureX, textureY); // Box 390
		bodyModel[88] = new ModelRendererTurbo(this, 345, 97, textureX, textureY); // Box 391
		bodyModel[89] = new ModelRendererTurbo(this, 225, 25, textureX, textureY); // Box 392
		bodyModel[90] = new ModelRendererTurbo(this, 81, 49, textureX, textureY); // Box 393
		bodyModel[91] = new ModelRendererTurbo(this, 121, 49, textureX, textureY); // Box 394
		bodyModel[92] = new ModelRendererTurbo(this, 345, 73, textureX, textureY); // Box 399
		bodyModel[93] = new ModelRendererTurbo(this, 465, 97, textureX, textureY); // Box 400
		bodyModel[94] = new ModelRendererTurbo(this, 41, 97, textureX, textureY); // Box 401
		bodyModel[95] = new ModelRendererTurbo(this, 241, 65, textureX, textureY); // Box 405
		bodyModel[96] = new ModelRendererTurbo(this, 425, 57, textureX, textureY); // Box 406
		bodyModel[97] = new ModelRendererTurbo(this, 73, 73, textureX, textureY); // Box 407
		bodyModel[98] = new ModelRendererTurbo(this, 377, 97, textureX, textureY); // Box 408
		bodyModel[99] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 409
		bodyModel[100] = new ModelRendererTurbo(this, 481, 97, textureX, textureY); // Box 410
		bodyModel[101] = new ModelRendererTurbo(this, 33, 81, textureX, textureY); // Box 414
		bodyModel[102] = new ModelRendererTurbo(this, 89, 105, textureX, textureY); // Box 419
		bodyModel[103] = new ModelRendererTurbo(this, 97, 65, textureX, textureY); // Box 420
		bodyModel[104] = new ModelRendererTurbo(this, 137, 73, textureX, textureY); // Box 421
		bodyModel[105] = new ModelRendererTurbo(this, 505, 73, textureX, textureY); // Box 422
		bodyModel[106] = new ModelRendererTurbo(this, 145, 105, textureX, textureY); // Box 426
		bodyModel[107] = new ModelRendererTurbo(this, 161, 105, textureX, textureY); // Box 427
		bodyModel[108] = new ModelRendererTurbo(this, 177, 105, textureX, textureY); // Box 431
		bodyModel[109] = new ModelRendererTurbo(this, 73, 81, textureX, textureY); // Box 432
		bodyModel[110] = new ModelRendererTurbo(this, 113, 65, textureX, textureY); // Box 433
		bodyModel[111] = new ModelRendererTurbo(this, 201, 81, textureX, textureY); // Box 434
		bodyModel[112] = new ModelRendererTurbo(this, 257, 81, textureX, textureY); // Box 435
		bodyModel[113] = new ModelRendererTurbo(this, 273, 81, textureX, textureY); // Box 436
		bodyModel[114] = new ModelRendererTurbo(this, 89, 105, textureX, textureY); // Box 24
		bodyModel[115] = new ModelRendererTurbo(this, 249, 105, textureX, textureY); // Box 457
		bodyModel[116] = new ModelRendererTurbo(this, 177, 105, textureX, textureY); // Box 458
		bodyModel[117] = new ModelRendererTurbo(this, 289, 105, textureX, textureY); // Box 461
		bodyModel[118] = new ModelRendererTurbo(this, 401, 105, textureX, textureY); // Box 64
		bodyModel[119] = new ModelRendererTurbo(this, 369, 81, textureX, textureY); // Box 237
		bodyModel[120] = new ModelRendererTurbo(this, 241, 9, textureX, textureY); // Box 275
		bodyModel[121] = new ModelRendererTurbo(this, 417, 9, textureX, textureY); // Box 276
		bodyModel[122] = new ModelRendererTurbo(this, 345, 33, textureX, textureY); // Box 279
		bodyModel[123] = new ModelRendererTurbo(this, 121, 41, textureX, textureY); // Box 280
		bodyModel[124] = new ModelRendererTurbo(this, 73, 89, textureX, textureY); // Box 318
		bodyModel[125] = new ModelRendererTurbo(this, 361, 89, textureX, textureY); // Box 319
		bodyModel[126] = new ModelRendererTurbo(this, 113, 89, textureX, textureY); // Box 320
		bodyModel[127] = new ModelRendererTurbo(this, 297, 33, textureX, textureY); // Box 322
		bodyModel[128] = new ModelRendererTurbo(this, 273, 57, textureX, textureY); // Box 323
		bodyModel[129] = new ModelRendererTurbo(this, 169, 81, textureX, textureY); // Box 324
		bodyModel[130] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 325
		bodyModel[131] = new ModelRendererTurbo(this, 297, 33, textureX, textureY); // Box 326
		bodyModel[132] = new ModelRendererTurbo(this, 273, 57, textureX, textureY); // Box 327
		bodyModel[133] = new ModelRendererTurbo(this, 169, 81, textureX, textureY); // Box 328
		bodyModel[134] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 329
		bodyModel[135] = new ModelRendererTurbo(this, 297, 33, textureX, textureY); // Box 330
		bodyModel[136] = new ModelRendererTurbo(this, 273, 57, textureX, textureY); // Box 331
		bodyModel[137] = new ModelRendererTurbo(this, 169, 81, textureX, textureY); // Box 332
		bodyModel[138] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 333
		bodyModel[139] = new ModelRendererTurbo(this, 297, 33, textureX, textureY); // Box 334
		bodyModel[140] = new ModelRendererTurbo(this, 273, 57, textureX, textureY); // Box 335
		bodyModel[141] = new ModelRendererTurbo(this, 169, 81, textureX, textureY); // Box 336
		bodyModel[142] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 337
		bodyModel[143] = new ModelRendererTurbo(this, 297, 33, textureX, textureY); // Box 338
		bodyModel[144] = new ModelRendererTurbo(this, 169, 81, textureX, textureY); // Box 339
		bodyModel[145] = new ModelRendererTurbo(this, 273, 57, textureX, textureY); // Box 340
		bodyModel[146] = new ModelRendererTurbo(this, 169, 81, textureX, textureY); // Box 341
		bodyModel[147] = new ModelRendererTurbo(this, 273, 57, textureX, textureY); // Box 342
		bodyModel[148] = new ModelRendererTurbo(this, 297, 33, textureX, textureY); // Box 343
		bodyModel[149] = new ModelRendererTurbo(this, 169, 81, textureX, textureY); // Box 344
		bodyModel[150] = new ModelRendererTurbo(this, 297, 33, textureX, textureY); // Box 345
		bodyModel[151] = new ModelRendererTurbo(this, 273, 57, textureX, textureY); // Box 346
		bodyModel[152] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 347
		bodyModel[153] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 348
		bodyModel[154] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 349
		bodyModel[155] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 376
		bodyModel[156] = new ModelRendererTurbo(this, 313, 57, textureX, textureY); // Box 379
		bodyModel[157] = new ModelRendererTurbo(this, 375, 96, textureX, textureY); // Box 380
		bodyModel[158] = new ModelRendererTurbo(this, 476, 100, textureX, textureY); // Box 325
		bodyModel[159] = new ModelRendererTurbo(this, 495, 101, textureX, textureY); // Box 326
		bodyModel[160] = new ModelRendererTurbo(this, 223, 92, textureX, textureY); // Box 328
		bodyModel[161] = new ModelRendererTurbo(this, 495, 115, textureX, textureY); // Box 333
		bodyModel[162] = new ModelRendererTurbo(this, 457, 62, textureX, textureY); // Box 333
		bodyModel[163] = new ModelRendererTurbo(this, 169, 38, textureX, textureY); // Box 336
		bodyModel[164] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Sta_Light_1
		bodyModel[165] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Sta_Light_2
		bodyModel[166] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Sta_Light_4
		bodyModel[167] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Sta_Light_3
		bodyModel[168] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 381
		bodyModel[169] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 382
		bodyModel[170] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 383
		bodyModel[171] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 384
		bodyModel[172] = new ModelRendererTurbo(this, 41, 5, textureX, textureY); // Box 385
		bodyModel[173] = new ModelRendererTurbo(this, 41, 5, textureX, textureY); // Box 386
		bodyModel[174] = new ModelRendererTurbo(this, 41, 5, textureX, textureY); // Box 387
		bodyModel[175] = new ModelRendererTurbo(this, 41, 5, textureX, textureY); // Box 388
		bodyModel[176] = new ModelRendererTurbo(this, 49, 5, textureX, textureY); // Box 389
		bodyModel[177] = new ModelRendererTurbo(this, 49, 5, textureX, textureY); // Box 390
		bodyModel[178] = new ModelRendererTurbo(this, 49, 5, textureX, textureY); // Box 391
		bodyModel[179] = new ModelRendererTurbo(this, 49, 5, textureX, textureY); // Box 392
		bodyModel[180] = new ModelRendererTurbo(this, 198, 65, textureX, textureY); // Box 361
		bodyModel[181] = new ModelRendererTurbo(this, 198, 76, textureX, textureY); // Box 362
		bodyModel[182] = new ModelRendererTurbo(this, 198, 52, textureX, textureY); // Box 363
		bodyModel[183] = new ModelRendererTurbo(this, 170, 76, textureX, textureY); // Box 364
		bodyModel[184] = new ModelRendererTurbo(this, 170, 65, textureX, textureY); // Box 365
		bodyModel[185] = new ModelRendererTurbo(this, 170, 52, textureX, textureY); // Box 366
		bodyModel[186] = new ModelRendererTurbo(this, 6, 54, textureX, textureY); // Box 367
		bodyModel[187] = new ModelRendererTurbo(this, 414, 65, textureX, textureY); // Box 61
		bodyModel[188] = new ModelRendererTurbo(this, 389, 65, textureX, textureY); // Box 88
		bodyModel[189] = new ModelRendererTurbo(this, 389, 58, textureX, textureY); // Box 172
		bodyModel[190] = new ModelRendererTurbo(this, 396, 58, textureX, textureY); // Box 176
		bodyModel[191] = new ModelRendererTurbo(this, 405, 58, textureX, textureY); // Box 404
		bodyModel[192] = new ModelRendererTurbo(this, 414, 58, textureX, textureY); // Box 405
		bodyModel[193] = new ModelRendererTurbo(this, 297, 33, textureX, textureY); // Box 406
		bodyModel[194] = new ModelRendererTurbo(this, 273, 57, textureX, textureY); // Box 407
		bodyModel[195] = new ModelRendererTurbo(this, 169, 81, textureX, textureY); // Box 408
		bodyModel[196] = new ModelRendererTurbo(this, 297, 33, textureX, textureY); // Box 409
		bodyModel[197] = new ModelRendererTurbo(this, 273, 57, textureX, textureY); // Box 410
		bodyModel[198] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 411
		bodyModel[199] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 412
		bodyModel[200] = new ModelRendererTurbo(this, 169, 81, textureX, textureY); // Box 413
		bodyModel[201] = new ModelRendererTurbo(this, 273, 57, textureX, textureY); // Box 414
		bodyModel[202] = new ModelRendererTurbo(this, 297, 33, textureX, textureY); // Box 415
		bodyModel[203] = new ModelRendererTurbo(this, 273, 57, textureX, textureY); // Box 416
		bodyModel[204] = new ModelRendererTurbo(this, 169, 81, textureX, textureY); // Box 417
		bodyModel[205] = new ModelRendererTurbo(this, 297, 33, textureX, textureY); // Box 418
		bodyModel[206] = new ModelRendererTurbo(this, 169, 81, textureX, textureY); // Box 419
		bodyModel[207] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 420

		bodyModel[0].addShapeBox(0F, 0F, 0F, 4, 1, 16, 0F,2F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 1F, 2F, 0F, 0F, 2F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 1F, 2F, 0F, 0F); // Box 9
		bodyModel[0].setRotationPoint(-17.5F, 4F, -8F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 43, 1, 17, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 62
		bodyModel[1].setRotationPoint(-13.5F, -19F, -8F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 5, 2, 19, 0F,0F, 0F, -2.3F, 0F, 0F, -0.25F, 0F, 0F, -1F, 0F, 0F, -3.3F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -2.5F); // Box 63
		bodyModel[2].setRotationPoint(-23.5F, -18F, -9F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 2, 2, 15, 0F,0F, 0F, -1F, 0F, 0.5F, -0.5F, 0F, 0.5F, -1.5F, 0F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -1.5F); // Box 65
		bodyModel[3].setRotationPoint(-25.5F, -18F, -7F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 1, 2, 13, 0F,0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.5F, -2F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -1.5F); // Box 66
		bodyModel[4].setRotationPoint(-26.5F, -18F, -6F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,-0.35F, -0.7F, -1F, 0F, 0.5F, 0F, 0F, 0.5F, -1F, -0.35F, -0.7F, -2F, -0.3F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, -0.3F, 0F, -2F); // Box 67
		bodyModel[5].setRotationPoint(-27.5F, -17F, -5F);

		bodyModel[6].addShapeBox(0F, 0F, -0.5F, 2, 20, 1, 0F,0F, 1F, -0.25F, 0.5F, 1F, -0.25F, 0.5F, 1F, -0.25F, 0F, 1F, -0.25F, 0F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 76
		bodyModel[6].setRotationPoint(7.5F, -14F, 9.5F);

		bodyModel[7].addShapeBox(-2F, 0F, -0.5F, 2, 20, 1, 0F,0.5F, 1F, -0.25F, 0F, 1F, -0.25F, 0F, 1F, -0.25F, 0.5F, 1F, -0.25F, 0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0.5F, 0F, -0.25F); // Box 79
		bodyModel[7].setRotationPoint(17.5F, -14F, 9.5F);

		bodyModel[8].addShapeBox(-2F, 0F, -0.5F, 2, 20, 1, 0F,0.5F, 1F, -0.25F, 0F, 1F, -0.25F, 0F, 1F, -0.25F, 0.5F, 1F, -0.25F, 0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0.5F, 0F, -0.25F); // Box 80
		bodyModel[8].setRotationPoint(15F, -14F, 9.5F);

		bodyModel[9].addShapeBox(0F, 0F, -0.5F, 2, 20, 1, 0F,0F, 1F, -0.25F, 0.5F, 1F, -0.25F, 0.5F, 1F, -0.25F, 0F, 1F, -0.25F, 0F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 81
		bodyModel[9].setRotationPoint(10F, -14F, 9.5F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 43, 2, 2, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 140
		bodyModel[10].setRotationPoint(-13.5F, -18F, 8F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 43, 2, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 142
		bodyModel[11].setRotationPoint(-13.5F, -18F, -10F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 5, 1, 17, 0F,0F, -0.5F, -1.5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.5F, -2.5F, 0F, 0F, -1.3F, 0F, 0F, 0.75F, 0F, 0F, 0F, 0F, 0F, -2.3F); // Box 145
		bodyModel[12].setRotationPoint(-23.5F, -19F, -8F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 5, 2, 19, 0F,0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -0.5F); // Box 154
		bodyModel[13].setRotationPoint(-18.5F, -18F, -9F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 5, 1, 17, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.75F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 165
		bodyModel[14].setRotationPoint(-18.5F, -19F, -8F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 2, 21, 1, 0F,0F, 1F, 0.5F, 0F, 1F, -0.5F, 0F, 1F, 0.5F, 0F, 1F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F); // Box 184
		bodyModel[15].setRotationPoint(-25.5F, -15F, 6F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 1, 20, 2, 0F,0F, 1F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 1F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 185
		bodyModel[16].setRotationPoint(-26.5F, -15F, 4.5F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 1, 1, 13, 0F,-0.5F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -2F, -0.5F, 0F, -3F, -0.5F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -2F, -0.5F, 0F, -3F); // Box 186
		bodyModel[17].setRotationPoint(-28.5F, 4F, -6F);

		bodyModel[18].addShapeBox(0F, 0F, -0.5F, 2, 20, 1, 0F,0F, 1F, 0.25F, 0.5F, 1F, -0.75F, 0.5F, 1F, 0.25F, 0F, 1F, -0.75F, 0F, 0F, 0.25F, 0.5F, 0F, -0.75F, 0.5F, 0F, 0.25F, 0F, 0F, -0.75F); // Box 82
		bodyModel[18].setRotationPoint(-23.5F, -14F, 7.5F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 5, 1, 3, 0F,0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F); // Box 58
		bodyModel[19].setRotationPoint(-23.5F, -16F, 5.5F);

		bodyModel[20].addShapeBox(0F, 0F, -0.5F, 2, 20, 1, 0F,0F, 1F, 0F, 0.5F, 1F, -1F, 0.5F, 1F, 0.5F, 0F, 1F, -0.5F, 0F, 0F, 0F, 0.5F, 0F, -1F, 0.5F, 0F, 0.5F, 0F, 0F, -0.5F); // Box 86
		bodyModel[20].setRotationPoint(-21F, -14F, 8.25F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 5, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0F); // Box 179
		bodyModel[21].setRotationPoint(-18.5F, -16F, 6.5F);

		bodyModel[22].addShapeBox(0F, 0F, -0.5F, 2, 20, 1, 0F,0F, 1F, -0.5F, 0.5F, 1F, -0.75F, 0.5F, 1F, 0.25F, 0F, 1F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.75F, 0.5F, 0F, 0.25F, 0F, 0F, 0F); // Box 180
		bodyModel[22].setRotationPoint(-18.5F, -14F, 8.75F);

		bodyModel[23].addShapeBox(0F, 0F, -0.5F, 2, 20, 1, 0F,0F, 1F, -0.5F, 0.5F, 1F, -0.75F, 0.5F, 1F, 0.25F, 0F, 1F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.75F, 0.5F, 0F, 0.25F, 0F, 0F, 0F); // Box 181
		bodyModel[23].setRotationPoint(-16F, -14F, 9F);

		bodyModel[24].addShapeBox(0F, 1F, 0F, 5, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0F); // Box 182
		bodyModel[24].setRotationPoint(-18.5F, 5F, 6.5F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 5, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F); // Box 183
		bodyModel[25].setRotationPoint(-23.5F, 6F, 5.5F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 1, 3, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 161
		bodyModel[26].setRotationPoint(-26.5F, -16F, -5F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 43, 1, 1, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 139
		bodyModel[27].setRotationPoint(-13.5F, -16F, 9F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 43, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 141
		bodyModel[28].setRotationPoint(-13.5F, -16F, -10F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 21, 11, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 156
		bodyModel[29].setRotationPoint(-13.5F, -14.5F, 9F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 10, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 294
		bodyModel[30].setRotationPoint(7.5F, -18F, 6F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 37, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 306
		bodyModel[31].setRotationPoint(-10.5F, -18F, -1F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 21, 1, 17, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 0
		bodyModel[32].setRotationPoint(-13.5F, 4F, -9F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 10, 3, 13, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[33].setRotationPoint(7.5F, 4F, -6F);

		bodyModel[34].addBox(0F, 0F, 0F, 10, 1, 3, 0F); // Box 5
		bodyModel[34].setRotationPoint(7.5F, 6F, 7.1F);

		bodyModel[35].addBox(0F, 0F, 0F, 10, 1, 1, 0F); // Box 6
		bodyModel[35].setRotationPoint(7.5F, 4F, 7F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -1F, 0F, 2F, -1F, 0F, 0F, 0F, 0F); // Box 294
		bodyModel[36].setRotationPoint(-27.19F, -19F, -1.5F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 1, 9, 9, 0F,0F, 0F, -6F, 0F, -0.3F, -6F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, -6F, -6F, 0F, -6F, -6F, 0F, -6F, 0F, 0F, -6F, 0F); // Box 170
		bodyModel[37].setRotationPoint(-27.2F, -19F, -7.5F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 2, 21, 1, 0F,0F, 1F, -0.5F, 0F, 1F, 0.5F, 0F, 1F, -0.5F, 0F, 1F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F); // Box 92
		bodyModel[38].setRotationPoint(-25.5F, -15F, -7F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 1, 20, 2, 0F,0F, 1F, -1F, 0F, 1F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 93
		bodyModel[39].setRotationPoint(-26.5F, -15F, -6.5F);

		bodyModel[40].addShapeBox(0F, 0F, -0.5F, 2, 20, 1, 0F,0F, 1F, 0F, 0.5F, 1F, 0.25F, 0.5F, 1F, -0.75F, 0F, 1F, -0.5F, 0F, 0F, 0F, 0.5F, 0F, 0.25F, 0.5F, 0F, -0.75F, 0F, 0F, -0.5F); // Box 94
		bodyModel[40].setRotationPoint(-16F, -14F, -9F);

		bodyModel[41].addShapeBox(0F, 0F, -0.5F, 3, 20, 1, 0F,0F, 1F, -0.2F, 0.5F, 1F, 0.25F, 0.5F, 1F, -0.75F, 0F, 1F, -0.2F, 0F, 0F, -0.2F, 0.5F, 0F, 0.25F, 0.5F, 0F, -0.75F, 0F, 0F, -0.2F); // Box 95
		bodyModel[41].setRotationPoint(-19.5F, -14F, -8.75F);

		bodyModel[42].addShapeBox(0F, 1F, 0F, 6, 1, 3, 0F,0F, 0F, -0.4F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 96
		bodyModel[42].setRotationPoint(-19.5F, 5F, -9.5F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 5, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 97
		bodyModel[43].setRotationPoint(-18.5F, -16F, -9.5F);

		bodyModel[44].addBox(0F, 0F, 0F, 1, 2, 14, 0F); // Box 98
		bodyModel[44].setRotationPoint(-20.5F, 5F, -8F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 4, 21, 1, 0F,0F, 1F, -1.5F, 0F, 1F, 0.1F, 0F, 1F, -0.1F, 0F, 1F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, 0.1F, 0F, 0F, -0.1F, 0F, 0F, 1.5F); // Box 99
		bodyModel[45].setRotationPoint(-23.5F, -15F, -9F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -0.2F, 0.3F, 0F, -0.2F, -0.7F); // Box 100
		bodyModel[46].setRotationPoint(-25.5F, 6F, 6F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, -0.2F, -0.7F, 0F, -0.2F, 0.3F, 0F, 0F, -0.5F, 0F, 0F, 0.5F); // Box 103
		bodyModel[47].setRotationPoint(-25.5F, 6F, -7F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, -1.5F, 0F, 0F, 0.1F, 0F, 0F, -0.1F, 0F, 0F, 1.5F, 0F, -0.2F, -1.7F, 0F, -0.2F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 1.5F); // Box 104
		bodyModel[48].setRotationPoint(-23.5F, 6F, -9F);

		bodyModel[49].addBox(0F, 0F, 0F, 10, 1, 1, 0F); // Box 105
		bodyModel[49].setRotationPoint(7.5F, 4F, -8F);

		bodyModel[50].addBox(0F, 0F, 0F, 10, 1, 3, 0F); // Box 106
		bodyModel[50].setRotationPoint(7.5F, 6F, -10.1F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 21, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 107
		bodyModel[51].setRotationPoint(-13.5F, 6F, 9.1F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 2, 9, 11, 0F,-0.9F, 0.5F, -1.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.9F, 0.5F, -1.5F, -0.9F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0F, -1.5F); // Box 109
		bodyModel[52].setRotationPoint(-28.5F, -4F, -5.5F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 2, 1, 11, 0F,-1.2F, -0.5F, -2F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0.5F, -1.2F, -0.5F, -1F, -1.2F, -0.15F, -2F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, -1.2F, -0.15F, -1F); // Box 110
		bodyModel[53].setRotationPoint(-28.5F, -14F, -6F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 2, 8, 11, 0F,-1.2F, 0.15F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1.2F, 0.15F, -1.5F, -0.9F, 0.5F, -1.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.9F, 0.5F, -1.5F); // Box 111
		bodyModel[54].setRotationPoint(-28.5F, -13F, -5.5F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 4, 1, 13, 0F,0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, 0F); // Box 112
		bodyModel[55].setRotationPoint(-23.5F, 4F, -7F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 3, 2, 14, 0F,3F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 3F, 0F, -1F, 3F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 3F, 0F, -1F); // Box 113
		bodyModel[56].setRotationPoint(-16.5F, 5F, -6.5F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 10, 3, 3, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 116
		bodyModel[57].setRotationPoint(7.5F, -18F, -9F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 21, 11, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.1F, 0F, 0.5F, 0.1F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 117
		bodyModel[58].setRotationPoint(-13.5F, -15F, -10F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 21, 1, 1, 0F,0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 118
		bodyModel[59].setRotationPoint(-13.5F, 6F, -10.1F);

		bodyModel[60].addShapeBox(-2F, 0F, -0.5F, 2, 20, 1, 0F,0.5F, 1F, -0.25F, 0F, 1F, -0.25F, 0F, 1F, -0.25F, 0.5F, 1F, -0.25F, 0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0.5F, 0F, -0.25F); // Box 120
		bodyModel[60].setRotationPoint(17.5F, -14F, -9.5F);

		bodyModel[61].addShapeBox(-2F, 0F, -0.5F, 2, 20, 1, 0F,0.5F, 1F, -0.25F, 0F, 1F, -0.25F, 0F, 1F, -0.25F, 0.5F, 1F, -0.25F, 0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0.5F, 0F, -0.25F); // Box 121
		bodyModel[61].setRotationPoint(15F, -14F, -9.5F);

		bodyModel[62].addShapeBox(0F, 0F, -0.5F, 2, 20, 1, 0F,0F, 1F, -0.25F, 0.5F, 1F, -0.25F, 0.5F, 1F, -0.25F, 0F, 1F, -0.25F, 0F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 122
		bodyModel[62].setRotationPoint(7.5F, -14F, -9.5F);

		bodyModel[63].addShapeBox(0F, 0F, -0.5F, 2, 20, 1, 0F,0F, 1F, -0.25F, 0.5F, 1F, -0.25F, 0.5F, 1F, -0.25F, 0F, 1F, -0.25F, 0F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 123
		bodyModel[63].setRotationPoint(10F, -14F, -9.5F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 3, 1, 10, 0F,0F, 0F, -0.5F, 0F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, 0.5F); // Box 171
		bodyModel[64].setRotationPoint(-26.5F, 4F, -5.5F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, -0.5F); // Box 173
		bodyModel[65].setRotationPoint(-23.5F, 5F, 5F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, -0.2F); // Box 176
		bodyModel[66].setRotationPoint(-24.5F, 4.9F, 5F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 1, 2, 17, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 179
		bodyModel[67].setRotationPoint(17.5F, 5F, -8.5F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 1, 2, 17, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 180
		bodyModel[68].setRotationPoint(6.5F, 5F, -8.5F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 1, 2, 17, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 181
		bodyModel[69].setRotationPoint(-13.5F, 5F, -8F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 7, 7, 5, 0F,0F, 0F, -4F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 182
		bodyModel[70].setRotationPoint(-26.5F, -3F, -8.5F);

		bodyModel[71].addBox(0F, 0F, 0F, 2, 2, 6, 0F); // Box 184
		bodyModel[71].setRotationPoint(-26.5F, -3.5F, -3.5F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 1, 8, 3, 0F,-1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F); // Box 185
		bodyModel[72].setRotationPoint(-24.5F, -3.5F, 3F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 2, 7, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 186
		bodyModel[73].setRotationPoint(-26.5F, -3F, 2.5F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 1, 5, 4, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 226
		bodyModel[74].setRotationPoint(5.5F, -5F, -8.5F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 227
		bodyModel[75].setRotationPoint(2.5F, 0F, -8.5F);

		bodyModel[76].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 228
		bodyModel[76].setRotationPoint(4.75F, 0.5F, -6F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 0, 13, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 195
		bodyModel[77].setRotationPoint(6.25F, -18F, -5.5F);

		bodyModel[78].addBox(0F, 0F, 0F, 0, 22, 4, 0F); // Box 196
		bodyModel[78].setRotationPoint(17.6F, -17F, -8.5F);

		bodyModel[79].addBox(0F, 0F, 0F, 0, 22, 4, 0F); // Box 197
		bodyModel[79].setRotationPoint(17.5F, -17F, 4.5F);

		bodyModel[80].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 207
		bodyModel[80].setRotationPoint(-22.25F, 0.5F, -1F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 208
		bodyModel[81].setRotationPoint(-23.5F, 0F, -2.5F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 209
		bodyModel[82].setRotationPoint(-20.5F, -4F, -2.5F);

		bodyModel[83].addBox(0F, 0F, 0F, 3, 3, 6, 0F); // Box 385
		bodyModel[83].setRotationPoint(-1F, 6F, -3F);

		bodyModel[84].addBox(0F, 0F, 0F, 8, 3, 4, 0F); // Box 386
		bodyModel[84].setRotationPoint(-9F, 6F, -2F);

		bodyModel[85].addBox(0F, 0F, 0F, 3, 3, 6, 0F); // Box 388
		bodyModel[85].setRotationPoint(-12F, 6F, -3F);

		bodyModel[86].addBox(0F, 0F, 0F, 5, 5, 0, 0F); // Box 389
		bodyModel[86].setRotationPoint(-2.15F, 5F, -5F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0.2F, 0.2F, -0.5F, 0.2F, 0.2F, -0.5F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, -0.5F, 0.2F, 0.2F, -0.5F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F); // Box 390
		bodyModel[87].setRotationPoint(-0.65F, 6.5F, -6F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 391
		bodyModel[88].setRotationPoint(-0.15F, 7F, -5F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.8F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, 0F, -0.8F, 0F, 0F); // Box 392
		bodyModel[89].setRotationPoint(1.05F, 6.15F, -6.5F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 393
		bodyModel[90].setRotationPoint(-1.65F, 8.75F, -6.5F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.8F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, 0F, -0.8F, 0F, 0F); // Box 394
		bodyModel[91].setRotationPoint(-2.35F, 6.15F, -6.5F);

		bodyModel[92].addBox(0F, 0F, 0F, 5, 3, 1, 0F); // Box 399
		bodyModel[92].setRotationPoint(-7.5F, 6.5F, -5F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 400
		bodyModel[93].setRotationPoint(-7F, 6F, -4F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,-0.6F, 0.1F, 0F, 0.7F, 0.1F, 0F, 0.7F, 0.1F, 0F, -0.6F, 0.1F, 0F, -0.6F, -0.2F, 0F, 0.7F, -0.2F, 0F, 0.7F, -0.2F, 0F, -0.6F, -0.2F, 0F); // Box 401
		bodyModel[94].setRotationPoint(-9.2F, 8.25F, -6.5F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.8F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, 0F, -0.8F, 0F, 0F); // Box 405
		bodyModel[95].setRotationPoint(-9.8F, 6.15F, -6.5F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 406
		bodyModel[96].setRotationPoint(-12.5F, 8.75F, -6.5F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0.2F, 0.2F, -0.5F, 0.2F, 0.2F, -0.5F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, -0.5F, 0.2F, 0.2F, -0.5F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F); // Box 407
		bodyModel[97].setRotationPoint(-11.5F, 6.5F, -6F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 408
		bodyModel[98].setRotationPoint(-11F, 7F, -5F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.8F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, 0F, -0.8F, 0F, 0F); // Box 409
		bodyModel[99].setRotationPoint(-13.2F, 6.15F, -6.5F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,-0.6F, 0.1F, 0F, 0.7F, 0.1F, 0F, 0.7F, 0.1F, 0F, -0.6F, 0.1F, 0F, -0.6F, -0.2F, 0F, 0.7F, -0.2F, 0F, 0.7F, -0.2F, 0F, -0.6F, -0.2F, 0F); // Box 410
		bodyModel[100].setRotationPoint(-9.2F, 8.25F, 5.5F);

		bodyModel[101].addBox(0F, 0F, 0F, 5, 3, 1, 0F); // Box 414
		bodyModel[101].setRotationPoint(-7.5F, 6.5F, 4F);

		bodyModel[102].addBox(0F, 0F, 0F, 5, 5, 0, 0F); // Box 419
		bodyModel[102].setRotationPoint(-2.15F, 5F, 5F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 420
		bodyModel[103].setRotationPoint(-1.65F, 8.75F, 5F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0.2F, 0.2F, -0.5F, 0.2F, 0.2F, -0.5F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, -0.5F, 0.2F, 0.2F, -0.5F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F); // Box 421
		bodyModel[104].setRotationPoint(-0.65F, 6.5F, 4.5F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.8F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, 0F, -0.8F, 0F, 0F); // Box 422
		bodyModel[105].setRotationPoint(1.05F, 6.15F, 5F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 426
		bodyModel[106].setRotationPoint(-4F, 6F, -4F);

		bodyModel[107].addBox(0F, 0F, 0F, 5, 5, 0, 0F); // Box 427
		bodyModel[107].setRotationPoint(-13F, 5F, -5F);

		bodyModel[108].addBox(0F, 0F, 0F, 5, 5, 0, 0F); // Box 431
		bodyModel[108].setRotationPoint(-13F, 5F, 5F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0.2F, 0.2F, -0.5F, 0.2F, 0.2F, -0.5F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, -0.5F, 0.2F, 0.2F, -0.5F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F); // Box 432
		bodyModel[109].setRotationPoint(-11.5F, 6.5F, 4.5F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 433
		bodyModel[110].setRotationPoint(-12.5F, 8.75F, 5F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.8F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, 0F, -0.8F, 0F, 0F); // Box 434
		bodyModel[111].setRotationPoint(-9.8F, 6.15F, 5F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.8F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, 0F, -0.8F, 0F, 0F); // Box 435
		bodyModel[112].setRotationPoint(-13.2F, 6.15F, 5F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.8F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, 0F, -0.8F, 0F, 0F); // Box 436
		bodyModel[113].setRotationPoint(-2.35F, 6.15F, 5F);

		bodyModel[114].addBox(0F, 0F, 0F, 1, 1, 14, 0F); // Box 24
		bodyModel[114].setRotationPoint(4F, 8.5F, -7F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 18, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Box 457
		bodyModel[115].setRotationPoint(-14F, 8.5F, -8F);

		bodyModel[116].addBox(0F, 0F, 0F, 1, 1, 14, 0F); // Box 458
		bodyModel[116].setRotationPoint(-15F, 8.5F, -7F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 18, 1, 1, 0F,1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 461
		bodyModel[117].setRotationPoint(-14F, 8.5F, 7F);

		bodyModel[118].addBox(0F, 0F, 0F, 8, 1, 1, 0F); // Box 64
		bodyModel[118].setRotationPoint(-28F, 6.5F, -0.5F);

		bodyModel[119].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 237
		bodyModel[119].setRotationPoint(-29F, 6F, -1F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 275
		bodyModel[120].setRotationPoint(-27.5F, 2.5F, 4F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 276
		bodyModel[121].setRotationPoint(-27.5F, 2.5F, -5.25F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0.5F); // Box 279
		bodyModel[122].setRotationPoint(-27.5F, 4F, -5.5F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, -0.5F); // Box 280
		bodyModel[123].setRotationPoint(-27.5F, 4F, 4.5F);

		bodyModel[124].addBox(0F, 0F, 0F, 0, 22, 4, 0F); // Box 318
		bodyModel[124].setRotationPoint(-13.4F, -17F, -8.5F);

		bodyModel[125].addBox(0F, 0F, 0F, 19, 0, 3, 0F); // Box 319
		bodyModel[125].setRotationPoint(-12F, -14.5F, -8.5F);

		bodyModel[126].addBox(0F, 0F, 0F, 19, 0, 3, 0F); // Box 320
		bodyModel[126].setRotationPoint(-13.1F, -14.5F, 6F);

		bodyModel[127].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 322
		bodyModel[127].setRotationPoint(-1.25F, 0.5F, -6F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 1, 5, 4, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 323
		bodyModel[128].setRotationPoint(-0.5F, -5F, -8.5F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 324
		bodyModel[129].setRotationPoint(-3.5F, 0F, -8.5F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 0, 13, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 325
		bodyModel[130].setRotationPoint(0.25F, -18F, -5.5F);

		bodyModel[131].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 326
		bodyModel[131].setRotationPoint(-6.25F, 0.5F, -6F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 1, 5, 4, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 327
		bodyModel[132].setRotationPoint(-5.5F, -5F, -8.5F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 328
		bodyModel[133].setRotationPoint(-8.5F, 0F, -8.5F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 0, 13, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 329
		bodyModel[134].setRotationPoint(-4.75F, -18F, -5.5F);

		bodyModel[135].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 330
		bodyModel[135].setRotationPoint(-10.25F, 0.5F, -6F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 1, 5, 4, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 331
		bodyModel[136].setRotationPoint(-9.5F, -5F, -8.5F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 332
		bodyModel[137].setRotationPoint(-12.5F, 0F, -8.5F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 0, 13, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 333
		bodyModel[138].setRotationPoint(-8.75F, -18F, -5.5F);

		bodyModel[139].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 334
		bodyModel[139].setRotationPoint(-10.25F, 0.5F, 5F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 1, 5, 4, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 335
		bodyModel[140].setRotationPoint(-9.5F, -5F, 4.5F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 336
		bodyModel[141].setRotationPoint(-12.5F, 0F, 4.5F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 0, 13, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 337
		bodyModel[142].setRotationPoint(-8.75F, -18F, 4.5F);

		bodyModel[143].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 338
		bodyModel[143].setRotationPoint(-6.25F, 0.5F, 5F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 339
		bodyModel[144].setRotationPoint(-8.5F, 0F, 4.5F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 1, 5, 4, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 340
		bodyModel[145].setRotationPoint(-5.5F, -5F, 4.5F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 341
		bodyModel[146].setRotationPoint(-3.5F, 0F, 4.5F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 1, 5, 4, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 342
		bodyModel[147].setRotationPoint(-0.5F, -5F, 4.5F);

		bodyModel[148].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 343
		bodyModel[148].setRotationPoint(-1.25F, 0.5F, 5F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 344
		bodyModel[149].setRotationPoint(2.5F, 0F, 4.5F);

		bodyModel[150].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 345
		bodyModel[150].setRotationPoint(4.75F, 0.5F, 5F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 1, 5, 4, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 346
		bodyModel[151].setRotationPoint(5.5F, -5F, 4.5F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 0, 13, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 347
		bodyModel[152].setRotationPoint(-4.75F, -18F, 4.5F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 0, 13, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 348
		bodyModel[153].setRotationPoint(0.25F, -18F, 4.5F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 0, 13, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 349
		bodyModel[154].setRotationPoint(6.25F, -18F, 4.5F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 0, 13, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 376
		bodyModel[155].setRotationPoint(22.25F, -18F, 4F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 379
		bodyModel[156].setRotationPoint(-20F, -6F, -2.5F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0.1F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.4F, 0F, 0F, 0.1F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.4F); // Box 380
		bodyModel[157].setRotationPoint(-19.5F, -16F, -9F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 2, 1, 11, 0F,-1.3F, -0.5F, -2F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0.5F, -1.3F, -0.5F, -1F, -1.3F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, -1.3F, 0F, -1F); // Box 325
		bodyModel[158].setRotationPoint(-28.5F, -16.5F, -6F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,-1.3F, 0F, -2.5F, 0F, 0F, -1F, 0F, 0F, 0.5F, -1.3F, 0F, 0.5F, -1.2F, 0F, -2.5F, 0F, 0F, -1F, 0F, 0F, 0.5F, -1.2F, 0F, 0.5F); // Box 326
		bodyModel[159].setRotationPoint(-28.5F, -15.5F, -6.5F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 1, 6, 22, 0F,0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, -13.5F, 0F, 0F, -13.7F, 0F, -4F, -0.2F, 0F, -4F, 0F, 0F, -4F, -13.5F, 0F, -4F, -13.7F); // Box 328
		bodyModel[160].setRotationPoint(-27.1F, -15.5F, -4.25F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,-1.3F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, -1.3F, 0F, -2.5F, -1.2F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, -1.2F, 0F, -2.5F); // Box 333
		bodyModel[161].setRotationPoint(-28.5F, -15.5F, 4.5F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 21, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0.5F, 0.1F, 0F, 0.5F, 0.1F, 0F, 0.5F, 0.1F, 0F, 0.5F, 0.1F); // Box 333
		bodyModel[162].setRotationPoint(-13.5F, -3.5F, -10.1F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 21, 9, 1, 0F,0F, 0.5F, 0.1F, 0F, 0.5F, 0.1F, 0F, 0.5F, 0.1F, 0F, 0.5F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F); // Box 336
		bodyModel[163].setRotationPoint(-13.5F, -3F, 9.1F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, 0.1F, -0.125F, 0F, 0.1F, -0.125F, 0F, -0.125F, 0.1F, 0F, -0.125F, 0.1F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F); // Sta_Light_1
		bodyModel[164].setRotationPoint(-27.8F, -1.25F, -0.88F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.1F, -0.125F, 0F, 0.1F, -0.125F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, 0.1F, 0F, -0.125F, 0.1F); // Sta_Light_2
		bodyModel[165].setRotationPoint(-27.8F, -1.25F, -0.129999999999999F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, 0.1F, 0F, -0.125F, 0.1F, 0F, 0.1F, -0.125F, 0F, -0.15F, -0.125F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F); // Sta_Light_4
		bodyModel[166].setRotationPoint(-27.8F, -0.5F, -0.129999999999999F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.125F, 0.1F, 0F, -0.125F, 0.1F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, 0.1F, -0.125F, 0F, 0.1F, -0.125F); // Sta_Light_3
		bodyModel[167].setRotationPoint(-27.8F, -0.5F, -0.88F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.125F, 0.1F, 0F, -0.125F, 0.1F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, 0.1F, -0.125F, 0F, 0.1F, -0.125F); // Box 381
		bodyModel[168].setRotationPoint(-27.8F, 1.75F, -0.88F);

		bodyModel[169].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, 0.1F, 0F, -0.125F, 0.1F, 0F, 0.1F, -0.125F, 0F, -0.15F, -0.125F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F); // Box 382
		bodyModel[169].setRotationPoint(-27.8F, 1.75F, -0.129999999999999F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.1F, -0.125F, 0F, 0.1F, -0.125F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, 0.1F, 0F, -0.125F, 0.1F); // Box 383
		bodyModel[170].setRotationPoint(-27.8F, 1F, -0.129999999999999F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, 0.1F, -0.125F, 0F, 0.1F, -0.125F, 0F, -0.125F, 0.1F, 0F, -0.125F, 0.1F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F); // Box 384
		bodyModel[171].setRotationPoint(-27.8F, 1F, -0.88F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.125F, 0.1F, 0F, -0.125F, 0.1F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, 0.1F, -0.125F, 0F, 0.1F, -0.125F); // Box 385
		bodyModel[172].setRotationPoint(-27.8F, 0.75F, 0.5F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, 0.1F, 0F, -0.125F, 0.1F, 0F, 0.1F, -0.125F, 0F, -0.15F, -0.125F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F); // Box 386
		bodyModel[173].setRotationPoint(-27.8F, 0.75F, 1.25F);

		bodyModel[174].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.1F, -0.125F, 0F, 0.1F, -0.125F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, 0.1F, 0F, -0.125F, 0.1F); // Box 387
		bodyModel[174].setRotationPoint(-27.8F, 0F, 1.25F);

		bodyModel[175].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, 0.1F, -0.125F, 0F, 0.1F, -0.125F, 0F, -0.125F, 0.1F, 0F, -0.125F, 0.1F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F); // Box 388
		bodyModel[175].setRotationPoint(-27.8F, 0F, 0.5F);

		bodyModel[176].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.125F, 0.1F, 0F, -0.125F, 0.1F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, 0.1F, -0.125F, 0F, 0.1F, -0.125F); // Box 389
		bodyModel[176].setRotationPoint(-27.8F, 0.75F, -2.25F);

		bodyModel[177].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, 0.1F, 0F, -0.125F, 0.1F, 0F, 0.1F, -0.125F, 0F, -0.15F, -0.125F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F); // Box 390
		bodyModel[177].setRotationPoint(-27.8F, 0.75F, -1.5F);

		bodyModel[178].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.1F, -0.125F, 0F, 0.1F, -0.125F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, 0.1F, 0F, -0.125F, 0.1F); // Box 391
		bodyModel[178].setRotationPoint(-27.8F, 0F, -1.5F);

		bodyModel[179].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, 0.1F, -0.125F, 0F, 0.1F, -0.125F, 0F, -0.125F, 0.1F, 0F, -0.125F, 0.1F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F); // Box 392
		bodyModel[179].setRotationPoint(-27.8F, 0F, -2.25F);

		bodyModel[180].addShapeBox(0F, 0F, 0F, 12, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0.5F, 0.1F, 0F, 0.5F, 0.1F, 0F, 0.5F, 0.1F, 0F, 0.5F, 0.1F); // Box 361
		bodyModel[180].setRotationPoint(17.5F, -3.5F, -10.1F);

		bodyModel[181].addShapeBox(0F, 0F, 0F, 12, 1, 1, 0F,0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 362
		bodyModel[181].setRotationPoint(17.5F, 6F, -10.1F);

		bodyModel[182].addShapeBox(0F, 0F, 0F, 12, 11, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.1F, 0F, 0.5F, 0.1F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 363
		bodyModel[182].setRotationPoint(17.5F, -15F, -10F);

		bodyModel[183].addShapeBox(0F, 0F, 0F, 12, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 364
		bodyModel[183].setRotationPoint(17.5F, 6F, 9.1F);

		bodyModel[184].addShapeBox(0F, 0F, 0F, 12, 9, 1, 0F,0F, 0.5F, 0.1F, 0F, 0.5F, 0.1F, 0F, 0.5F, 0.1F, 0F, 0.5F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F); // Box 365
		bodyModel[184].setRotationPoint(17.5F, -3F, 9.1F);

		bodyModel[185].addShapeBox(0F, 0F, 0F, 12, 11, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 366
		bodyModel[185].setRotationPoint(17.5F, -14.5F, 9F);

		bodyModel[186].addShapeBox(0F, 0F, 0F, 12, 1, 17, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 367
		bodyModel[186].setRotationPoint(17.5F, 4F, -9F);

		bodyModel[187].addBox(0F, 0F, 0F, 1, 19, 2, 0F); // Box 61
		bodyModel[187].setRotationPoint(28.5F, -15F, 7F);

		bodyModel[188].addBox(0F, 0F, 0F, 1, 19, 2, 0F); // Box 88
		bodyModel[188].setRotationPoint(28.5F, -15F, -9F);

		bodyModel[189].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,0F, -3F, 1F, 0F, -3F, 1F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 172
		bodyModel[189].setRotationPoint(28.5F, -19F, 7F);

		bodyModel[190].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 2.5F, 0F, 0F, 2.5F, 0F, -1F, 3F, 0F, -1F, 3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 176
		bodyModel[190].setRotationPoint(28.5F, -18F, 3F);

		bodyModel[191].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 2.5F, 0F, 0F, 2.5F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 3F, 0F, -1F, 3F); // Box 404
		bodyModel[191].setRotationPoint(28.5F, -18F, -6F);

		bodyModel[192].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -3F, 1F, 0F, -3F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 405
		bodyModel[192].setRotationPoint(28.5F, -19F, -9F);

		bodyModel[193].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 406
		bodyModel[193].setRotationPoint(20.75F, 0.5F, -6F);

		bodyModel[194].addShapeBox(0F, 0F, 0F, 1, 5, 4, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 407
		bodyModel[194].setRotationPoint(21.5F, -5F, -8.5F);

		bodyModel[195].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 408
		bodyModel[195].setRotationPoint(23.5F, 0F, -8.5F);

		bodyModel[196].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 409
		bodyModel[196].setRotationPoint(25.75F, 0.5F, -6F);

		bodyModel[197].addShapeBox(0F, 0F, 0F, 1, 5, 4, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 410
		bodyModel[197].setRotationPoint(26.5F, -5F, -8.5F);

		bodyModel[198].addShapeBox(0F, 0F, 0F, 0, 13, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 411
		bodyModel[198].setRotationPoint(22.25F, -18F, -5.5F);

		bodyModel[199].addShapeBox(0F, 0F, 0F, 0, 13, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 412
		bodyModel[199].setRotationPoint(27.25F, -18F, -5.5F);

		bodyModel[200].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 413
		bodyModel[200].setRotationPoint(18.5F, 0F, 4.5F);

		bodyModel[201].addShapeBox(0F, 0F, 0F, 1, 5, 4, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 414
		bodyModel[201].setRotationPoint(21.5F, -5F, 4.5F);

		bodyModel[202].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 415
		bodyModel[202].setRotationPoint(20.75F, 0.5F, 5F);

		bodyModel[203].addShapeBox(0F, 0F, 0F, 1, 5, 4, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 416
		bodyModel[203].setRotationPoint(26.5F, -5F, 4.5F);

		bodyModel[204].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 417
		bodyModel[204].setRotationPoint(23.5F, 0F, 4.5F);

		bodyModel[205].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 418
		bodyModel[205].setRotationPoint(25.75F, 0.5F, 5F);

		bodyModel[206].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 419
		bodyModel[206].setRotationPoint(18.5F, 0F, -8.5F);

		bodyModel[207].addShapeBox(0F, 0F, 0F, 0, 13, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 420
		bodyModel[207].setRotationPoint(27.25F, -18F, 4F);
	}
}