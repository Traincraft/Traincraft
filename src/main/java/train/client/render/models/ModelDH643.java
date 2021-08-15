//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2021 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 27.01.2021 - 23:04:07
// Last changed on: 27.01.2021 - 23:04:07

package train.client.render.models; //Path where the model is located

import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import tmt.ModelConverter;
import tmt.ModelRendererTurbo;
import tmt.Tessellator;
import train.common.api.AbstractTrains;
import train.common.library.Info;

import java.util.ArrayList;

public class ModelDH643 extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 256;

	public ModelDH643() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[257];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 2, 137, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 15, 135, textureX, textureY); // Box 2
		bodyModel[2] = new ModelRendererTurbo(this, 2, 220, textureX, textureY); // Box 2
		bodyModel[3] = new ModelRendererTurbo(this, 314, 174, textureX, textureY); // Box 0
		bodyModel[4] = new ModelRendererTurbo(this, 41, 80, textureX, textureY); // Box 4
		bodyModel[5] = new ModelRendererTurbo(this, 175, 118, textureX, textureY); // Box 6
		bodyModel[6] = new ModelRendererTurbo(this, 31, 83, textureX, textureY); // Box 8
		bodyModel[7] = new ModelRendererTurbo(this, 41, 92, textureX, textureY); // Box 13
		bodyModel[8] = new ModelRendererTurbo(this, 42, 90, textureX, textureY); // Box 14
		bodyModel[9] = new ModelRendererTurbo(this, 177, 132, textureX, textureY); // Box 21
		bodyModel[10] = new ModelRendererTurbo(this, 42, 90, textureX, textureY); // Box 86
		bodyModel[11] = new ModelRendererTurbo(this, 41, 95, textureX, textureY); // Box 88
		bodyModel[12] = new ModelRendererTurbo(this, 36, 83, textureX, textureY); // Box 116
		bodyModel[13] = new ModelRendererTurbo(this, 2, 137, textureX, textureY); // Box 26
		bodyModel[14] = new ModelRendererTurbo(this, 15, 135, textureX, textureY); // Box 27
		bodyModel[15] = new ModelRendererTurbo(this, 172, 125, textureX, textureY); // Box 28
		bodyModel[16] = new ModelRendererTurbo(this, 222, 117, textureX, textureY); // Box 48
		bodyModel[17] = new ModelRendererTurbo(this, 221, 124, textureX, textureY); // Box 49
		bodyModel[18] = new ModelRendererTurbo(this, 222, 132, textureX, textureY); // Box 50
		bodyModel[19] = new ModelRendererTurbo(this, 273, 180, textureX, textureY); // Box 52
		bodyModel[20] = new ModelRendererTurbo(this, 233, 170, textureX, textureY); // Box 25
		bodyModel[21] = new ModelRendererTurbo(this, 205, 172, textureX, textureY); // Box 56
		bodyModel[22] = new ModelRendererTurbo(this, 224, 170, textureX, textureY); // Box 26
		bodyModel[23] = new ModelRendererTurbo(this, 192, 170, textureX, textureY); // Box 27
		bodyModel[24] = new ModelRendererTurbo(this, 208, 166, textureX, textureY); // Box 28
		bodyModel[25] = new ModelRendererTurbo(this, 220, 177, textureX, textureY); // Box 63
		bodyModel[26] = new ModelRendererTurbo(this, 204, 177, textureX, textureY); // Box 64
		bodyModel[27] = new ModelRendererTurbo(this, 56, 91, textureX, textureY); // Box 66
		bodyModel[28] = new ModelRendererTurbo(this, 56, 95, textureX, textureY); // Box 67
		bodyModel[29] = new ModelRendererTurbo(this, 14, 116, textureX, textureY); // Box 115
		bodyModel[30] = new ModelRendererTurbo(this, 3, 122, textureX, textureY); // Box 141
		bodyModel[31] = new ModelRendererTurbo(this, 3, 113, textureX, textureY); // Box 141
		bodyModel[32] = new ModelRendererTurbo(this, 269, 126, textureX, textureY); // Box 95
		bodyModel[33] = new ModelRendererTurbo(this, 366, 157, textureX, textureY); // Box 29
		bodyModel[34] = new ModelRendererTurbo(this, 290, 157, textureX, textureY); // Box 32
		bodyModel[35] = new ModelRendererTurbo(this, 438, 145, textureX, textureY); // Box 135
		bodyModel[36] = new ModelRendererTurbo(this, 441, 153, textureX, textureY); // Box 57
		bodyModel[37] = new ModelRendererTurbo(this, 444, 160, textureX, textureY); // Box 58
		bodyModel[38] = new ModelRendererTurbo(this, 41, 85, textureX, textureY); // Box 205
		bodyModel[39] = new ModelRendererTurbo(this, 314, 199, textureX, textureY); // Box 206
		bodyModel[40] = new ModelRendererTurbo(this, 389, 140, textureX, textureY); // Box 406
		bodyModel[41] = new ModelRendererTurbo(this, 392, 85, textureX, textureY); // Box 407
		bodyModel[42] = new ModelRendererTurbo(this, 421, 124, textureX, textureY); // Box 408
		bodyModel[43] = new ModelRendererTurbo(this, 377, 85, textureX, textureY); // Box 409
		bodyModel[44] = new ModelRendererTurbo(this, 472, 153, textureX, textureY); // Box 410
		bodyModel[45] = new ModelRendererTurbo(this, 469, 160, textureX, textureY); // Box 412
		bodyModel[46] = new ModelRendererTurbo(this, 437, 160, textureX, textureY); // Box 413
		bodyModel[47] = new ModelRendererTurbo(this, 472, 138, textureX, textureY); // Box 415
		bodyModel[48] = new ModelRendererTurbo(this, 469, 134, textureX, textureY); // Box 416
		bodyModel[49] = new ModelRendererTurbo(this, 468, 167, textureX, textureY); // Box 428
		bodyModel[50] = new ModelRendererTurbo(this, 279, 154, textureX, textureY); // Box 314 door swing right
		bodyModel[51] = new ModelRendererTurbo(this, 355, 154, textureX, textureY); // Box 315 door swing right
		bodyModel[52] = new ModelRendererTurbo(this, 324, 140, textureX, textureY, "lamp"); // Box 448 headlight front gyralight
		bodyModel[53] = new ModelRendererTurbo(this, 317, 140, textureX, textureY, "lamp"); // Box 449 headlight front gyralight
		bodyModel[54] = new ModelRendererTurbo(this, 48, 66, textureX, textureY); // Box 455
		bodyModel[55] = new ModelRendererTurbo(this, 57, 71, textureX, textureY); // Box 456
		bodyModel[56] = new ModelRendererTurbo(this, 57, 74, textureX, textureY); // Box 457
		bodyModel[57] = new ModelRendererTurbo(this, 48, 71, textureX, textureY); // Box 458
		bodyModel[58] = new ModelRendererTurbo(this, 56, 80, textureX, textureY); // Box 471
		bodyModel[59] = new ModelRendererTurbo(this, 56, 85, textureX, textureY); // Box 472
		bodyModel[60] = new ModelRendererTurbo(this, 63, 91, textureX, textureY); // Box 473
		bodyModel[61] = new ModelRendererTurbo(this, 63, 95, textureX, textureY); // Box 474
		bodyModel[62] = new ModelRendererTurbo(this, 12, 200, textureX, textureY); // Box 497
		bodyModel[63] = new ModelRendererTurbo(this, 421, 95, textureX, textureY); // Box 178
		bodyModel[64] = new ModelRendererTurbo(this, 27, 135, textureX, textureY); // Box 201
		bodyModel[65] = new ModelRendererTurbo(this, 343, 245, textureX, textureY); // Box 224
		bodyModel[66] = new ModelRendererTurbo(this, 347, 235, textureX, textureY); // Box 225
		bodyModel[67] = new ModelRendererTurbo(this, 344, 91, textureX, textureY); // Box 226
		bodyModel[68] = new ModelRendererTurbo(this, 377, 106, textureX, textureY); // Box 228
		bodyModel[69] = new ModelRendererTurbo(this, 344, 105, textureX, textureY); // Box 230
		bodyModel[70] = new ModelRendererTurbo(this, 29, 184, textureX, textureY); // Box 233
		bodyModel[71] = new ModelRendererTurbo(this, 28, 193, textureX, textureY); // Box 234
		bodyModel[72] = new ModelRendererTurbo(this, 28, 176, textureX, textureY); // Box 235
		bodyModel[73] = new ModelRendererTurbo(this, 32, 168, textureX, textureY); // Box 236 exhaust
		bodyModel[74] = new ModelRendererTurbo(this, 214, 162, textureX, textureY); // Box 238
		bodyModel[75] = new ModelRendererTurbo(this, 4, 154, textureX, textureY); // Box 247
		bodyModel[76] = new ModelRendererTurbo(this, 16, 141, textureX, textureY); // Box 557
		bodyModel[77] = new ModelRendererTurbo(this, 122, 171, textureX, textureY); // Box 560
		bodyModel[78] = new ModelRendererTurbo(this, 122, 192, textureX, textureY); // Box 561
		bodyModel[79] = new ModelRendererTurbo(this, 122, 178, textureX, textureY); // Box 562
		bodyModel[80] = new ModelRendererTurbo(this, 385, 106, textureX, textureY); // Box 61
		bodyModel[81] = new ModelRendererTurbo(this, 341, 106, textureX, textureY); // Box 682
		bodyModel[82] = new ModelRendererTurbo(this, 394, 118, textureX, textureY); // Box 688
		bodyModel[83] = new ModelRendererTurbo(this, 397, 120, textureX, textureY); // Box 690
		bodyModel[84] = new ModelRendererTurbo(this, 410, 119, textureX, textureY); // Box 691
		bodyModel[85] = new ModelRendererTurbo(this, 413, 125, textureX, textureY); // Box 693
		bodyModel[86] = new ModelRendererTurbo(this, 381, 145, textureX, textureY); // Box 695
		bodyModel[87] = new ModelRendererTurbo(this, 413, 119, textureX, textureY); // Box 714
		bodyModel[88] = new ModelRendererTurbo(this, 500, 235, textureX, textureY); // Box 722
		bodyModel[89] = new ModelRendererTurbo(this, 381, 138, textureX, textureY); // Box 432
		bodyModel[90] = new ModelRendererTurbo(this, 397, 118, textureX, textureY); // Box 276
		bodyModel[91] = new ModelRendererTurbo(this, 443, 164, textureX, textureY); // Box 278
		bodyModel[92] = new ModelRendererTurbo(this, 324, 135, textureX, textureY, "lamp"); // Box 284 headlight front
		bodyModel[93] = new ModelRendererTurbo(this, 317, 135, textureX, textureY, "lamp"); // Box 285 headlight front
		bodyModel[94] = new ModelRendererTurbo(this, 366, 144, textureX, textureY); // Box 286
		bodyModel[95] = new ModelRendererTurbo(this, 444, 169, textureX, textureY); // box64
		bodyModel[96] = new ModelRendererTurbo(this, 429, 169, textureX, textureY); // box65
		bodyModel[97] = new ModelRendererTurbo(this, 507, 247, textureX, textureY); // Box 275
		bodyModel[98] = new ModelRendererTurbo(this, 343, 237, textureX, textureY); // Box 276
		bodyModel[99] = new ModelRendererTurbo(this, 44, 99, textureX, textureY); // Box 277
		bodyModel[100] = new ModelRendererTurbo(this, 42, 90, textureX, textureY); // Box 278
		bodyModel[101] = new ModelRendererTurbo(this, 44, 99, textureX, textureY); // Box 280
		bodyModel[102] = new ModelRendererTurbo(this, 42, 90, textureX, textureY); // Box 281
		bodyModel[103] = new ModelRendererTurbo(this, 324, 110, textureX, textureY, "lamp"); // Box 117 liveryimg 2
		bodyModel[104] = new ModelRendererTurbo(this, 324, 113, textureX, textureY, "lamp"); // Box 298 liveryimg 2
		bodyModel[105] = new ModelRendererTurbo(this, 41, 92, textureX, textureY); // Box 302
		bodyModel[106] = new ModelRendererTurbo(this, 42, 90, textureX, textureY); // Box 303
		bodyModel[107] = new ModelRendererTurbo(this, 42, 90, textureX, textureY); // Box 305
		bodyModel[108] = new ModelRendererTurbo(this, 44, 99, textureX, textureY); // Box 306
		bodyModel[109] = new ModelRendererTurbo(this, 77, 79, textureX, textureY); // Box 308
		bodyModel[110] = new ModelRendererTurbo(this, 44, 99, textureX, textureY); // Box 310
		bodyModel[111] = new ModelRendererTurbo(this, 42, 90, textureX, textureY); // Box 311
		bodyModel[112] = new ModelRendererTurbo(this, 42, 90, textureX, textureY); // Box 313
		bodyModel[113] = new ModelRendererTurbo(this, 41, 95, textureX, textureY); // Box 315
		bodyModel[114] = new ModelRendererTurbo(this, 72, 79, textureX, textureY); // Box 316
		bodyModel[115] = new ModelRendererTurbo(this, 87, 135, textureX, textureY); // Box 318
		bodyModel[116] = new ModelRendererTurbo(this, 25, 113, textureX, textureY); // Box 324
		bodyModel[117] = new ModelRendererTurbo(this, 25, 122, textureX, textureY); // Box 325
		bodyModel[118] = new ModelRendererTurbo(this, 36, 116, textureX, textureY); // Box 326
		bodyModel[119] = new ModelRendererTurbo(this, 444, 134, textureX, textureY); // Box 129
		bodyModel[120] = new ModelRendererTurbo(this, 443, 130, textureX, textureY); // Box 130
		bodyModel[121] = new ModelRendererTurbo(this, 441, 138, textureX, textureY); // Box 132
		bodyModel[122] = new ModelRendererTurbo(this, 324, 144, textureX, textureY); // Box 405
		bodyModel[123] = new ModelRendererTurbo(this, 437, 134, textureX, textureY); // Box 417
		bodyModel[124] = new ModelRendererTurbo(this, 273, 141, textureX, textureY); // Box 114
		bodyModel[125] = new ModelRendererTurbo(this, 273, 138, textureX, textureY); // Box 74
		bodyModel[126] = new ModelRendererTurbo(this, 273, 144, textureX, textureY); // Box 78
		bodyModel[127] = new ModelRendererTurbo(this, 278, 140, textureX, textureY); // Box 245
		bodyModel[128] = new ModelRendererTurbo(this, 332, 134, textureX, textureY); // Box 319
		bodyModel[129] = new ModelRendererTurbo(this, 332, 140, textureX, textureY); // Box 320
		bodyModel[130] = new ModelRendererTurbo(this, 332, 131, textureX, textureY); // Box 321
		bodyModel[131] = new ModelRendererTurbo(this, 332, 137, textureX, textureY); // Box 322
		bodyModel[132] = new ModelRendererTurbo(this, 278, 203, textureX, textureY); // Box 299
		bodyModel[133] = new ModelRendererTurbo(this, 272, 211, textureX, textureY); // Box 300
		bodyModel[134] = new ModelRendererTurbo(this, 306, 211, textureX, textureY); // Box 302
		bodyModel[135] = new ModelRendererTurbo(this, 10, 206, textureX, textureY); // Box 303
		bodyModel[136] = new ModelRendererTurbo(this, 276, 131, textureX, textureY, "lamp"); // Box 340 headlight rear
		bodyModel[137] = new ModelRendererTurbo(this, 276, 126, textureX, textureY, "lamp"); // Box 341 headlight rear
		bodyModel[138] = new ModelRendererTurbo(this, 284, 132, textureX, textureY); // Box 342
		bodyModel[139] = new ModelRendererTurbo(this, 306, 220, textureX, textureY); // Box 343
		bodyModel[140] = new ModelRendererTurbo(this, 272, 220, textureX, textureY); // Box 344
		bodyModel[141] = new ModelRendererTurbo(this, 167, 192, textureX, textureY, "cull"); // Box 357 stair cull
		bodyModel[142] = new ModelRendererTurbo(this, 167, 192, textureX, textureY, "cull"); // Box 358 stair cull
		bodyModel[143] = new ModelRendererTurbo(this, 154, 192, textureX, textureY, "cull"); // Box 243 stair cull
		bodyModel[144] = new ModelRendererTurbo(this, 154, 192, textureX, textureY, "cull"); // Box 348 stair cull
		bodyModel[145] = new ModelRendererTurbo(this, 413, 127, textureX, textureY); // Box 298
		bodyModel[146] = new ModelRendererTurbo(this, 7, 151, textureX, textureY); // Box 350
		bodyModel[147] = new ModelRendererTurbo(this, 95, 151, textureX, textureY); // Box 351
		bodyModel[148] = new ModelRendererTurbo(this, 28, 156, textureX, textureY); // Box 352
		bodyModel[149] = new ModelRendererTurbo(this, 4, 149, textureX, textureY); // Box 353
		bodyModel[150] = new ModelRendererTurbo(this, 28, 153, textureX, textureY); // Box 354
		bodyModel[151] = new ModelRendererTurbo(this, 116, 154, textureX, textureY); // Box 356
		bodyModel[152] = new ModelRendererTurbo(this, 96, 156, textureX, textureY); // Box 357
		bodyModel[153] = new ModelRendererTurbo(this, 116, 149, textureX, textureY); // Box 358
		bodyModel[154] = new ModelRendererTurbo(this, 96, 153, textureX, textureY); // Box 359
		bodyModel[155] = new ModelRendererTurbo(this, 70, 141, textureX, textureY); // Box 360
		bodyModel[156] = new ModelRendererTurbo(this, 500, 237, textureX, textureY); // Box 361
		bodyModel[157] = new ModelRendererTurbo(this, 313, 154, textureX, textureY); // Box 362
		bodyModel[158] = new ModelRendererTurbo(this, 353, 145, textureX, textureY); // Box 363
		bodyModel[159] = new ModelRendererTurbo(this, 428, 138, textureX, textureY); // Box 364
		bodyModel[160] = new ModelRendererTurbo(this, 428, 153, textureX, textureY); // Box 365
		bodyModel[161] = new ModelRendererTurbo(this, 279, 105, textureX, textureY); // Box 366
		bodyModel[162] = new ModelRendererTurbo(this, 431, 121, textureX, textureY); // Box 367
		bodyModel[163] = new ModelRendererTurbo(this, 353, 137, textureX, textureY); // Box 369
		bodyModel[164] = new ModelRendererTurbo(this, 381, 137, textureX, textureY); // Box 370
		bodyModel[165] = new ModelRendererTurbo(this, 361, 138, textureX, textureY); // Box 371
		bodyModel[166] = new ModelRendererTurbo(this, 317, 130, textureX, textureY, "lamp"); // Box 372 front gyralight red
		bodyModel[167] = new ModelRendererTurbo(this, 324, 130, textureX, textureY); // Box 373
		bodyModel[168] = new ModelRendererTurbo(this, 301, 207, textureX, textureY); // Box 374
		bodyModel[169] = new ModelRendererTurbo(this, 321, 231, textureX, textureY); // Box 375
		bodyModel[170] = new ModelRendererTurbo(this, 447, 117, textureX, textureY); // Box 377
		bodyModel[171] = new ModelRendererTurbo(this, 301, 204, textureX, textureY); // Box 379
		bodyModel[172] = new ModelRendererTurbo(this, 321, 228, textureX, textureY); // Box 380
		bodyModel[173] = new ModelRendererTurbo(this, 122, 185, textureX, textureY); // Box 381
		bodyModel[174] = new ModelRendererTurbo(this, 447, 82, textureX, textureY); // Box 382
		bodyModel[175] = new ModelRendererTurbo(this, 376, 105, textureX, textureY); // Box 387
		bodyModel[176] = new ModelRendererTurbo(this, 376, 120, textureX, textureY); // Box 388
		bodyModel[177] = new ModelRendererTurbo(this, 344, 106, textureX, textureY); // Box 389
		bodyModel[178] = new ModelRendererTurbo(this, 344, 120, textureX, textureY); // Box 390
		bodyModel[179] = new ModelRendererTurbo(this, 344, 107, textureX, textureY); // Box 391
		bodyModel[180] = new ModelRendererTurbo(this, 380, 107, textureX, textureY); // Box 392
		bodyModel[181] = new ModelRendererTurbo(this, 349, 106, textureX, textureY); // Box 393
		bodyModel[182] = new ModelRendererTurbo(this, 344, 122, textureX, textureY); // Box 394
		bodyModel[183] = new ModelRendererTurbo(this, 349, 121, textureX, textureY); // Box 395
		bodyModel[184] = new ModelRendererTurbo(this, 341, 121, textureX, textureY); // Box 396
		bodyModel[185] = new ModelRendererTurbo(this, 380, 122, textureX, textureY); // Box 397
		bodyModel[186] = new ModelRendererTurbo(this, 377, 121, textureX, textureY); // Box 398
		bodyModel[187] = new ModelRendererTurbo(this, 385, 121, textureX, textureY); // Box 399
		bodyModel[188] = new ModelRendererTurbo(this, 294, 209, textureX, textureY); // Box 400
		bodyModel[189] = new ModelRendererTurbo(this, 278, 209, textureX, textureY); // Box 401
		bodyModel[190] = new ModelRendererTurbo(this, 12, 214, textureX, textureY); // Box 402
		bodyModel[191] = new ModelRendererTurbo(this, 84, 168, textureX, textureY); // Box 404 exhaust
		bodyModel[192] = new ModelRendererTurbo(this, 41, 157, textureX, textureY); // Box 405
		bodyModel[193] = new ModelRendererTurbo(this, 48, 154, textureX, textureY); // Box 406
		bodyModel[194] = new ModelRendererTurbo(this, 41, 154, textureX, textureY); // Box 407
		bodyModel[195] = new ModelRendererTurbo(this, 208, 203, textureX, textureY); // Box 280
		bodyModel[196] = new ModelRendererTurbo(this, 212, 212, textureX, textureY); // Box 281
		bodyModel[197] = new ModelRendererTurbo(this, 212, 224, textureX, textureY); // Box 282
		bodyModel[198] = new ModelRendererTurbo(this, 235, 224, textureX, textureY); // Box 283
		bodyModel[199] = new ModelRendererTurbo(this, 235, 212, textureX, textureY); // Box 284
		bodyModel[200] = new ModelRendererTurbo(this, 245, 203, textureX, textureY); // Box 285
		bodyModel[201] = new ModelRendererTurbo(this, 248, 212, textureX, textureY); // Box 414
		bodyModel[202] = new ModelRendererTurbo(this, 203, 212, textureX, textureY); // Box 415
		bodyModel[203] = new ModelRendererTurbo(this, 313, 245, textureX, textureY); // Box 416
		bodyModel[204] = new ModelRendererTurbo(this, 194, 238, textureX, textureY); // Box 422
		bodyModel[205] = new ModelRendererTurbo(this, 194, 238, textureX, textureY); // Box 423
		bodyModel[206] = new ModelRendererTurbo(this, 203, 227, textureX, textureY); // Box 426
		bodyModel[207] = new ModelRendererTurbo(this, 41, 138, textureX, textureY); // Box 427
		bodyModel[208] = new ModelRendererTurbo(this, 79, 138, textureX, textureY); // Box 428
		bodyModel[209] = new ModelRendererTurbo(this, 79, 145, textureX, textureY); // Box 429
		bodyModel[210] = new ModelRendererTurbo(this, 41, 145, textureX, textureY); // Box 430
		bodyModel[211] = new ModelRendererTurbo(this, 66, 193, textureX, textureY); // Box 432
		bodyModel[212] = new ModelRendererTurbo(this, 67, 184, textureX, textureY); // Box 433
		bodyModel[213] = new ModelRendererTurbo(this, 66, 176, textureX, textureY); // Box 434
		bodyModel[214] = new ModelRendererTurbo(this, 313, 245, textureX, textureY); // Box 435
		bodyModel[215] = new ModelRendererTurbo(this, 101, 173, textureX, textureY); // Box 436
		bodyModel[216] = new ModelRendererTurbo(this, 99, 179, textureX, textureY); // Box 437
		bodyModel[217] = new ModelRendererTurbo(this, 101, 187, textureX, textureY); // Box 438
		bodyModel[218] = new ModelRendererTurbo(this, 104, 193, textureX, textureY); // Box 440
		bodyModel[219] = new ModelRendererTurbo(this, 104, 166, textureX, textureY); // Box 441
		bodyModel[220] = new ModelRendererTurbo(this, 16, 166, textureX, textureY); // Box 442
		bodyModel[221] = new ModelRendererTurbo(this, 13, 173, textureX, textureY); // Box 443
		bodyModel[222] = new ModelRendererTurbo(this, 11, 179, textureX, textureY); // Box 444
		bodyModel[223] = new ModelRendererTurbo(this, 13, 187, textureX, textureY); // Box 445
		bodyModel[224] = new ModelRendererTurbo(this, 16, 193, textureX, textureY); // Box 446
		bodyModel[225] = new ModelRendererTurbo(this, 22, 147, textureX, textureY); // Box 447
		bodyModel[226] = new ModelRendererTurbo(this, 15, 147, textureX, textureY); // Box 448
		bodyModel[227] = new ModelRendererTurbo(this, 109, 147, textureX, textureY); // Box 449
		bodyModel[228] = new ModelRendererTurbo(this, 102, 147, textureX, textureY); // Box 450
		bodyModel[229] = new ModelRendererTurbo(this, 48, 61, textureX, textureY); // Box 451
		bodyModel[230] = new ModelRendererTurbo(this, 33, 69, textureX, textureY); // Box 452
		bodyModel[231] = new ModelRendererTurbo(this, 82, 75, textureX, textureY); // Box 453
		bodyModel[232] = new ModelRendererTurbo(this, 63, 66, textureX, textureY); // Box 454
		bodyModel[233] = new ModelRendererTurbo(this, 63, 61, textureX, textureY); // Box 455
		bodyModel[234] = new ModelRendererTurbo(this, 64, 71, textureX, textureY); // Box 456
		bodyModel[235] = new ModelRendererTurbo(this, 64, 74, textureX, textureY); // Box 457
		bodyModel[236] = new ModelRendererTurbo(this, 64, 69, textureX, textureY); // Box 458
		bodyModel[237] = new ModelRendererTurbo(this, 203, 227, textureX, textureY); // Box 461
		bodyModel[238] = new ModelRendererTurbo(this, 194, 227, textureX, textureY); // Box 462
		bodyModel[239] = new ModelRendererTurbo(this, 194, 227, textureX, textureY); // Box 463
		bodyModel[240] = new ModelRendererTurbo(this, 122, 155, textureX, textureY, "cull"); // Box 479 cull
		bodyModel[241] = new ModelRendererTurbo(this, 122, 155, textureX, textureY, "cull"); // Box 465 cull
		bodyModel[242] = new ModelRendererTurbo(this, 474, 163, textureX, textureY); // Box 466
		bodyModel[243] = new ModelRendererTurbo(this, 396, 150, textureX, textureY); // Box 248
		bodyModel[244] = new ModelRendererTurbo(this, 398, 144, textureX, textureY); // Box 249
		bodyModel[245] = new ModelRendererTurbo(this, 136, 158, textureX, textureY); // Box 250
		bodyModel[246] = new ModelRendererTurbo(this, 136, 158, textureX, textureY); // Box 251
		bodyModel[247] = new ModelRendererTurbo(this, 322, 87, textureX, textureY); // Box 252
		bodyModel[248] = new ModelRendererTurbo(this, 305, 87, textureX, textureY); // Box 253
		bodyModel[249] = new ModelRendererTurbo(this, 110, 100, textureX, textureY); // Box 413
		bodyModel[250] = new ModelRendererTurbo(this, 122, 93, textureX, textureY); // Box 86
		bodyModel[251] = new ModelRendererTurbo(this, 107, 94, textureX, textureY); // Box 327
		bodyModel[252] = new ModelRendererTurbo(this, 131, 102, textureX, textureY); // Box 328
		bodyModel[253] = new ModelRendererTurbo(this, 129, 151, textureX, textureY); // Box 1519
		bodyModel[254] = new ModelRendererTurbo(this, 134, 155, textureX, textureY, "lamp"); // Box 1521 marker bullshit stupid
		bodyModel[255] = new ModelRendererTurbo(this, 134, 155, textureX, textureY, "lamp"); // Box 1522 marker bullshit stupid
		bodyModel[256] = new ModelRendererTurbo(this, 134, 151, textureX, textureY); // Box 259

		bodyModel[0].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 0
		bodyModel[0].setRotationPoint(-56F, 3F, -1.5F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[1].setRotationPoint(-53F, 2.5F, -2F);

		bodyModel[2].addBox(0F, 0F, 0F, 81, 20, 14, 0F); // Box 2
		bodyModel[2].setRotationPoint(-32F, -20F, -7F);

		bodyModel[3].addBox(0F, 0F, 0F, 94, 0, 4, 0F); // Box 0
		bodyModel[3].setRotationPoint(-47F, 0F, -11F);

		bodyModel[4].addBox(0F, 0F, 0F, 5, 2, 2, 0F); // Box 4
		bodyModel[4].setRotationPoint(-52F, 0F, -9F);

		bodyModel[5].addBox(0F, 0F, 0F, 0, 7, 20, 0F); // Box 6
		bodyModel[5].setRotationPoint(-52.01F, 0F, -10F);

		bodyModel[6].addBox(0F, 0F, 0F, 0, 8, 2, 0F); // Box 8
		bodyModel[6].setRotationPoint(-48F, 0F, -11F);

		bodyModel[7].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 13
		bodyModel[7].setRotationPoint(-52F, 8F, -11F);

		bodyModel[8].addBox(0F, 0F, 0F, 4, 0, 1, 0F); // Box 14
		bodyModel[8].setRotationPoint(-52F, 5F, -10F);

		bodyModel[9].addBox(0F, 0F, 0F, 0, 1, 18, 0F); // Box 21
		bodyModel[9].setRotationPoint(-52F, 8F, -9F);

		bodyModel[10].addBox(0F, 0F, 0F, 4, 0, 1, 0F); // Box 86
		bodyModel[10].setRotationPoint(-52F, 5F, 9F);

		bodyModel[11].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 88
		bodyModel[11].setRotationPoint(-52F, 8F, 9F);

		bodyModel[12].addBox(0F, 0F, 0F, 0, 8, 2, 0F); // Box 116
		bodyModel[12].setRotationPoint(-48F, 0F, 9F);

		bodyModel[13].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 26
		bodyModel[13].setRotationPoint(53F, 3F, -1.5F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
		bodyModel[14].setRotationPoint(52F, 2.5F, -2F);

		bodyModel[15].addBox(0F, 0F, 0F, 0, 1, 22, 0F); // Box 28
		bodyModel[15].setRotationPoint(-52.01F, 7F, -11F);

		bodyModel[16].addBox(0F, 0F, 0F, 0, 7, 20, 0F); // Box 48
		bodyModel[16].setRotationPoint(52.01F, 0F, -10F);

		bodyModel[17].addBox(0F, 0F, 0F, 0, 1, 22, 0F); // Box 49
		bodyModel[17].setRotationPoint(51.99F, 7F, -11F);

		bodyModel[18].addBox(0F, 0F, 0F, 0, 1, 18, 0F); // Box 50
		bodyModel[18].setRotationPoint(52F, 8F, -9F);

		bodyModel[19].addBox(0F, 0F, 0F, 104, 3, 14, 0F); // Box 52
		bodyModel[19].setRotationPoint(-52F, 0F, -7F);

		bodyModel[20].addBox(0F, 0F, 0F, 5, 13, 14, 0F); // Box 25
		bodyModel[20].setRotationPoint(-49F, -13F, -7F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 1, 13, 12, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 56
		bodyModel[21].setRotationPoint(-50F, -13F, -6F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 5, 1, 5, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[22].setRotationPoint(-49F, -14F, -7F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 5, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
		bodyModel[23].setRotationPoint(-49F, -14F, 2F);

		bodyModel[24].addBox(0F, 0F, 0F, 6, 1, 4, 0F); // Box 28
		bodyModel[24].setRotationPoint(-50F, -14F, -2F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 63
		bodyModel[25].setRotationPoint(-50F, -14F, -7F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 64
		bodyModel[26].setRotationPoint(-50F, -14F, 2F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 66
		bodyModel[27].setRotationPoint(-48F, 0F, -11F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 67
		bodyModel[28].setRotationPoint(-48F, 0F, 9F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 115
		bodyModel[29].setRotationPoint(-50F, 4F, -3F);

		bodyModel[30].addBox(0F, 0F, 0F, 2, 4, 6, 0F); // Box 141
		bodyModel[30].setRotationPoint(-52F, 2F, -3F);

		bodyModel[31].addBox(0F, 0F, 0F, 2, 2, 6, 0F); // Box 141
		bodyModel[31].setRotationPoint(-50F, 2F, -3F);

		bodyModel[32].addBox(0F, 0F, 0F, 12, 5, 22, 0F); // Box 95
		bodyModel[32].setRotationPoint(-44F, -5F, -11F);

		bodyModel[33].addBox(0F, 0F, 0F, 10, 12, 1, 0F); // Box 29
		bodyModel[33].setRotationPoint(-43F, -17F, -11F);

		bodyModel[34].addBox(0F, 0F, 0F, 10, 12, 1, 0F); // Box 32
		bodyModel[34].setRotationPoint(-43F, -17F, 10F);

		bodyModel[35].addBox(0F, 0F, 0F, 12, 1, 6, 0F); // Box 135
		bodyModel[35].setRotationPoint(-44F, -22F, -3F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 10, 1, 5, 0F,0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 57
		bodyModel[36].setRotationPoint(-43F, -22F, -8F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 10, 1, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 58
		bodyModel[37].setRotationPoint(-43F, -20F, -10F);

		bodyModel[38].addBox(0F, 0F, 0F, 5, 2, 2, 0F); // Box 205
		bodyModel[38].setRotationPoint(-52F, 0F, 7F);

		bodyModel[39].addBox(0F, 0F, 0F, 94, 0, 4, 0F); // Box 206
		bodyModel[39].setRotationPoint(-47F, 0F, 7F);

		bodyModel[40].addBox(0F, 0F, 0F, 1, 12, 18, 0F); // Box 406
		bodyModel[40].setRotationPoint(-33F, -17F, -11F);

		bodyModel[41].addBox(0F, 0F, 0F, 1, 2, 20, 0F); // Box 407
		bodyModel[41].setRotationPoint(-33F, -19F, -10F);

		bodyModel[42].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Box 408
		bodyModel[42].setRotationPoint(-33F, -21F, -3F);

		bodyModel[43].addBox(0F, 0F, 0F, 1, 1, 16, 0F); // Box 409
		bodyModel[43].setRotationPoint(-33F, -20F, -8F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 410
		bodyModel[44].setRotationPoint(-33F, -22F, -8F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 412
		bodyModel[45].setRotationPoint(-33F, -20F, -10F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 413
		bodyModel[46].setRotationPoint(-44F, -20F, -10F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 415
		bodyModel[47].setRotationPoint(-33F, -22F, 3F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 416
		bodyModel[48].setRotationPoint(-33F, -20F, 8F);

		bodyModel[49].addBox(0F, 0F, 0F, 1, 2, 3, 0F); // Box 428
		bodyModel[49].setRotationPoint(-44F, -19F, -10F);

		bodyModel[50].addBox(-0.5F, 0F, -3.5F, 1, 12, 4, 0F); // Box 314 door swing right
		bodyModel[50].setRotationPoint(-32.5F, -17F, 10.5F);

		bodyModel[51].addBox(-0.5F, 0F, -0.5F, 1, 12, 4, 0F); // Box 315 door swing right
		bodyModel[51].setRotationPoint(-43.5F, -17F, -10.5F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 448 headlight front gyralight
		bodyModel[52].setRotationPoint(-50.5F, -10F, -2F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 449 headlight front gyralight
		bodyModel[53].setRotationPoint(-50.5F, -10F, 0F);

		bodyModel[54].addBox(0F, 0F, 0F, 2, 1, 3, 0F); // Box 455
		bodyModel[54].setRotationPoint(-54F, 0F, -8F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 456
		bodyModel[55].setRotationPoint(-54F, 0F, -9F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 457
		bodyModel[56].setRotationPoint(-54F, 0F, 8F);

		bodyModel[57].addBox(0F, 0F, 0F, 1, 2, 6, 0F); // Box 458
		bodyModel[57].setRotationPoint(-53F, 0F, -3F);

		bodyModel[58].addBox(0F, 0F, 0F, 5, 2, 2, 0F); // Box 471
		bodyModel[58].setRotationPoint(47F, 0F, 7F);

		bodyModel[59].addBox(0F, 0F, 0F, 5, 2, 2, 0F); // Box 472
		bodyModel[59].setRotationPoint(47F, 0F, -9F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 473
		bodyModel[60].setRotationPoint(47F, 0F, -11F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 474
		bodyModel[61].setRotationPoint(47F, 0F, 9F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 81, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 497
		bodyModel[62].setRotationPoint(-32F, -21F, 3F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 30, 6, 14, 0F,2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 178
		bodyModel[63].setRotationPoint(-15F, 3F, -7F);

		bodyModel[64].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 201
		bodyModel[64].setRotationPoint(-34F, 4F, -2F);

		bodyModel[65].addBox(0F, 0F, 0F, 81, 8, 0, 0F); // Box 224
		bodyModel[65].setRotationPoint(-32F, -8F, -11F);

		bodyModel[66].addBox(0F, 0F, 0F, 76, 8, 0, 0F); // Box 225
		bodyModel[66].setRotationPoint(-27F, -8F, 11F);

		bodyModel[67].addBox(0F, 0F, 0F, 0, 9, 20, 0F); // Box 226
		bodyModel[67].setRotationPoint(-54F, -9F, -10F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 228
		bodyModel[68].setRotationPoint(-52F, -9F, -11F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F,0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 230
		bodyModel[69].setRotationPoint(-54F, -6F, -7F);

		bodyModel[70].addBox(0F, 0F, 0F, 13, 1, 4, 0F); // Box 233
		bodyModel[70].setRotationPoint(-14F, -21.5F, -2F);

		bodyModel[71].addBox(0F, 0F, -5F, 13, 1, 5, 0F); // Box 234
		bodyModel[71].setRotationPoint(-14F, -21.5F, -2F);
		bodyModel[71].rotateAngleX = 0.19198622F;

		bodyModel[72].addBox(0F, 0F, 0F, 13, 1, 5, 0F); // Box 235
		bodyModel[72].setRotationPoint(-14F, -21.5F, 2F);
		bodyModel[72].rotateAngleX = -0.19198622F;

		bodyModel[73].addBox(0F, 0F, 0F, 2, 2, 5, 0F); // Box 236 exhaust
		bodyModel[73].setRotationPoint(-27F, -23F, -2.5F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 238
		bodyModel[74].setRotationPoint(-50F, -14.5F, -1F);

		bodyModel[75].addBox(0F, 0F, 0F, 4, 3, 1, 0F); // Box 247
		bodyModel[75].setRotationPoint(-34F, 0F, 10F);

		bodyModel[76].addBox(0F, 0F, 0F, 2, 3, 20, 0F); // Box 557
		bodyModel[76].setRotationPoint(-33F, 0F, -10F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 12, 3, 3, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F); // Box 560
		bodyModel[77].setRotationPoint(16.5F, 0F, -11F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 12, 3, 3, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F); // Box 561
		bodyModel[78].setRotationPoint(-28.5F, 0F, 8F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 12, 3, 3, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F); // Box 562
		bodyModel[79].setRotationPoint(16.5F, 0F, 8F);

		bodyModel[80].addBox(0F, 0F, 0F, 0, 13, 1, 0F); // Box 61
		bodyModel[80].setRotationPoint(-52F, -8F, 10F);

		bodyModel[81].addBox(0F, 0F, 0F, 0, 13, 1, 0F); // Box 682
		bodyModel[81].setRotationPoint(-52F, -8F, -11F);

		bodyModel[82].addBox(0F, 0F, 0F, 1, 12, 0, 0F); // Box 688
		bodyModel[82].setRotationPoint(-49F, -7F, 11F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 690
		bodyModel[83].setRotationPoint(-47F, -8F, 11F);

		bodyModel[84].addBox(0F, 0F, 0F, 1, 13, 0, 0F); // Box 691
		bodyModel[84].setRotationPoint(-49F, -8F, -11F);

		bodyModel[85].addBox(0F, 0F, 0F, 2, 1, 0, 0F); // Box 693
		bodyModel[85].setRotationPoint(-46F, -13F, -11F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 3F, 0F, 0F); // Box 695
		bodyModel[86].setRotationPoint(-44F, -20F, -7F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 1, 5, 0, 0F,-1F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -1F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F); // Box 714
		bodyModel[87].setRotationPoint(-47F, -13F, -11F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F); // Box 722
		bodyModel[88].setRotationPoint(-31F, -13F, 11F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F); // Box 432
		bodyModel[89].setRotationPoint(-45F, -22F, -3F);

		bodyModel[90].addBox(0F, 0F, 0F, 2, 1, 0, 0F); // Box 276
		bodyModel[90].setRotationPoint(-49F, -8F, 11F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 12, 2, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 278
		bodyModel[91].setRotationPoint(-44F, -19F, -11F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 284 headlight front
		bodyModel[92].setRotationPoint(-47.5F, -20F, -2F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 285 headlight front
		bodyModel[93].setRotationPoint(-47.5F, -20F, 0F);

		bodyModel[94].addBox(0F, 0F, 0F, 3, 4, 4, 0F); // Box 286
		bodyModel[94].setRotationPoint(-47F, -22F, -2F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -1F, 1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // box64
		bodyModel[95].setRotationPoint(-41F, -17F, 11F);
		bodyModel[95].rotateAngleX = 0.26179939F;

		bodyModel[96].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,1F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // box65
		bodyModel[96].setRotationPoint(-41F, -17.25F, -11.97F);
		bodyModel[96].rotateAngleX = -0.26179939F;

		bodyModel[97].addBox(0F, 0F, 0F, 1, 5, 0, 0F); // Box 275
		bodyModel[97].setRotationPoint(48F, 0F, -11F);

		bodyModel[98].addBox(0F, 0F, 0F, 1, 5, 0, 0F); // Box 276
		bodyModel[98].setRotationPoint(48F, 0F, 11F);

		bodyModel[99].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 277
		bodyModel[99].setRotationPoint(-52F, 2F, -9F);

		bodyModel[100].addBox(0F, 0F, 0F, 4, 0, 1, 0F); // Box 278
		bodyModel[100].setRotationPoint(-52F, 2F, -10F);

		bodyModel[101].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 280
		bodyModel[101].setRotationPoint(-52F, 2F, 9F);

		bodyModel[102].addBox(0F, 0F, 0F, 4, 0, 1, 0F); // Box 281
		bodyModel[102].setRotationPoint(-52F, 2F, 9F);

		bodyModel[103].addBox(0F, 0F, 0F, 0, 2, 5, 0F); // Box 117 liveryimg 2
		bodyModel[103].setRotationPoint(-44.3F, -20F, -6.5F);
		bodyModel[103].rotateAngleY = 0.54105207F;

		bodyModel[104].addBox(0F, 0F, -5F, 0, 2, 5, 0F); // Box 298 liveryimg 2
		bodyModel[104].setRotationPoint(-44.3F, -20F, 6.5F);
		bodyModel[104].rotateAngleY = -0.54105207F;

		bodyModel[105].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 302
		bodyModel[105].setRotationPoint(48F, 8F, -11F);

		bodyModel[106].addBox(0F, 0F, 0F, 4, 0, 1, 0F); // Box 303
		bodyModel[106].setRotationPoint(48F, 5F, -10F);

		bodyModel[107].addBox(0F, 0F, 0F, 4, 0, 1, 0F); // Box 305
		bodyModel[107].setRotationPoint(48F, 2F, -10F);

		bodyModel[108].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 306
		bodyModel[108].setRotationPoint(48F, 2F, -9F);

		bodyModel[109].addBox(0F, 0F, 0F, 0, 8, 2, 0F); // Box 308
		bodyModel[109].setRotationPoint(48F, 0F, -11F);

		bodyModel[110].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 310
		bodyModel[110].setRotationPoint(48F, 2F, 9F);

		bodyModel[111].addBox(0F, 0F, 0F, 4, 0, 1, 0F); // Box 311
		bodyModel[111].setRotationPoint(48F, 2F, 9F);

		bodyModel[112].addBox(0F, 0F, 0F, 4, 0, 1, 0F); // Box 313
		bodyModel[112].setRotationPoint(48F, 5F, 9F);

		bodyModel[113].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 315
		bodyModel[113].setRotationPoint(48F, 8F, 9F);

		bodyModel[114].addBox(0F, 0F, 0F, 0, 8, 2, 0F); // Box 316
		bodyModel[114].setRotationPoint(48F, 0F, 9F);

		bodyModel[115].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 318
		bodyModel[115].setRotationPoint(30F, 4F, -2F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 324
		bodyModel[116].setRotationPoint(48F, 4F, -3F);

		bodyModel[117].addBox(0F, 0F, 0F, 2, 4, 6, 0F); // Box 325
		bodyModel[117].setRotationPoint(50F, 2F, -3F);

		bodyModel[118].addBox(0F, 0F, 0F, 2, 2, 6, 0F); // Box 326
		bodyModel[118].setRotationPoint(48F, 2F, -3F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 10, 1, 2, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 129
		bodyModel[119].setRotationPoint(-43F, -20F, 8F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 12, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 130
		bodyModel[120].setRotationPoint(-44F, -19F, 10F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 10, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F); // Box 132
		bodyModel[121].setRotationPoint(-43F, -22F, 3F);

		bodyModel[122].addBox(0F, 0F, 0F, 1, 1, 14, 0F); // Box 405
		bodyModel[122].setRotationPoint(-44F, -19F, -7F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 417
		bodyModel[123].setRotationPoint(-44F, -20F, 8F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 114
		bodyModel[124].setRotationPoint(-45.5F, 4.5F, 9.7F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[125].setRotationPoint(-45.5F, 3.5F, 9.7F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 78
		bodyModel[126].setRotationPoint(-45.25F, 5F, 9.95F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 245
		bodyModel[127].setRotationPoint(-45.5F, 2.5F, 5.5F);

		bodyModel[128].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 319
		bodyModel[128].setRotationPoint(-45F, -24F, -0.5F);

		bodyModel[129].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 320
		bodyModel[129].setRotationPoint(-44.5F, -23F, -0.5F);

		bodyModel[130].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 321
		bodyModel[130].setRotationPoint(-46F, -23.5F, 0.5F);

		bodyModel[131].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 322
		bodyModel[131].setRotationPoint(-46F, -23.5F, -1.5F);

		bodyModel[132].addBox(0F, 0F, 0F, 1, 20, 12, 0F); // Box 299
		bodyModel[132].setRotationPoint(49F, -20F, -6F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 300
		bodyModel[133].setRotationPoint(49F, -20F, -7F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 302
		bodyModel[134].setRotationPoint(49F, -20F, 6F);

		bodyModel[135].addBox(0F, 0F, 0F, 82, 1, 6, 0F); // Box 303
		bodyModel[135].setRotationPoint(-32F, -21F, -3F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 340 headlight rear
		bodyModel[136].setRotationPoint(50F, -20.5F, -1F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 341 headlight rear
		bodyModel[137].setRotationPoint(50F, -18.5F, -1F);

		bodyModel[138].addBox(0F, 0F, 0F, 1, 4, 2, 0F); // Box 342
		bodyModel[138].setRotationPoint(49.5F, -20.5F, -1F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 1, 14, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 343
		bodyModel[139].setRotationPoint(49F, -14F, 6F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 1, 14, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 344
		bodyModel[140].setRotationPoint(49F, -14F, -7F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -2F, 0F); // Box 357 stair cull
		bodyModel[141].setRotationPoint(-32.5F, -4F, 7F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -2F, 0F); // Box 358 stair cull
		bodyModel[142].setRotationPoint(-31F, -2F, 7F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, 0F, 0F, 0F); // Box 243 stair cull
		bodyModel[143].setRotationPoint(-45.5F, -4F, -11F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, 0F, 0F, 0F); // Box 348 stair cull
		bodyModel[144].setRotationPoint(-47F, -2F, -11F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 298
		bodyModel[145].setRotationPoint(-46F, -12F, -11F);

		bodyModel[146].addBox(0F, 0F, 0F, 6, 1, 8, 0F); // Box 350
		bodyModel[146].setRotationPoint(-35F, 3F, -4F);

		bodyModel[147].addBox(0F, 0F, 0F, 6, 1, 8, 0F); // Box 351
		bodyModel[147].setRotationPoint(29F, 3F, -4F);

		bodyModel[148].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 352
		bodyModel[148].setRotationPoint(-33F, 3F, 10F);

		bodyModel[149].addBox(0F, 0F, 0F, 4, 3, 1, 0F); // Box 353
		bodyModel[149].setRotationPoint(-34F, 0F, -11F);

		bodyModel[150].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 354
		bodyModel[150].setRotationPoint(-33F, 3F, -11F);

		bodyModel[151].addBox(0F, 0F, 0F, 4, 3, 1, 0F); // Box 356
		bodyModel[151].setRotationPoint(30F, 0F, 10F);

		bodyModel[152].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 357
		bodyModel[152].setRotationPoint(31F, 3F, 10F);

		bodyModel[153].addBox(0F, 0F, 0F, 4, 3, 1, 0F); // Box 358
		bodyModel[153].setRotationPoint(30F, 0F, -11F);

		bodyModel[154].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 359
		bodyModel[154].setRotationPoint(31F, 3F, -11F);

		bodyModel[155].addBox(0F, 0F, 0F, 2, 3, 20, 0F); // Box 360
		bodyModel[155].setRotationPoint(31F, 0F, -10F);

		bodyModel[156].addBox(0F, 0F, 0F, 1, 1, 0, 0F); // Box 361
		bodyModel[156].setRotationPoint(-32F, -13F, 11F);

		bodyModel[157].addBox(0F, 0F, 0F, 1, 12, 4, 0F); // Box 362
		bodyModel[157].setRotationPoint(-44F, -17F, 7F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,3F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 363
		bodyModel[158].setRotationPoint(-44F, -20F, 2F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 364
		bodyModel[159].setRotationPoint(-44F, -22F, 3F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 365
		bodyModel[160].setRotationPoint(-44F, -22F, -8F);

		bodyModel[161].addBox(0F, 0F, 0F, 1, 1, 16, 0F); // Box 366
		bodyModel[161].setRotationPoint(-44F, -20F, -8F);

		bodyModel[162].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Box 367
		bodyModel[162].setRotationPoint(-44F, -21F, -3F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,3F, 0F, 0F, -1F, 0F, -1F, -1F, -1.2F, 0F, 0F, -1.2F, 0F, 3F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 369
		bodyModel[163].setRotationPoint(-44F, -22F, 2F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, -1.2F, 0F, -1F, -1.2F, 0F, -1F, 0F, -1F, 3F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 3F, 0F, 0F); // Box 370
		bodyModel[164].setRotationPoint(-44F, -22F, -7F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 371
		bodyModel[165].setRotationPoint(-45F, -22F, 2F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 372 front gyralight red
		bodyModel[166].setRotationPoint(-48.5F, -22F, -1F);

		bodyModel[167].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 373
		bodyModel[167].setRotationPoint(-48F, -22F, -1F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 104, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 374
		bodyModel[168].setRotationPoint(-52F, 2F, 7F);

		bodyModel[169].addShapeBox(0F, 0F, 0F, 94, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 375
		bodyModel[169].setRotationPoint(-47F, 0F, 7F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 22, 7, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 2F, 0F, 4F, 2F, 0F); // Box 377
		bodyModel[170].setRotationPoint(-11F, 0F, -11F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 104, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 379
		bodyModel[171].setRotationPoint(-52F, 2F, -8F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 94, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 380
		bodyModel[172].setRotationPoint(-47F, 0F, -8F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 12, 3, 3, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F); // Box 381
		bodyModel[173].setRotationPoint(-28.5F, 0F, -11F);

		bodyModel[174].addShapeBox(0F, 0F, 0F, 22, 7, 4, 0F,4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 2F, 0F, 4F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 382
		bodyModel[174].setRotationPoint(-11F, 0F, 7F);

		bodyModel[175].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F); // Box 387
		bodyModel[175].setRotationPoint(-54F, -6F, 3F);

		bodyModel[176].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F); // Box 388
		bodyModel[176].setRotationPoint(54F, -6F, 3F);

		bodyModel[177].addBox(0F, 0F, 0F, 0, 9, 20, 0F); // Box 389
		bodyModel[177].setRotationPoint(54F, -9F, -10F);

		bodyModel[178].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F,0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 390
		bodyModel[178].setRotationPoint(54F, -6F, -7F);

		bodyModel[179].addBox(0F, 0F, 0F, 2, 1, 0, 0F); // Box 391
		bodyModel[179].setRotationPoint(-54F, -9F, -10F);

		bodyModel[180].addBox(0F, 0F, 0F, 2, 1, 0, 0F); // Box 392
		bodyModel[180].setRotationPoint(-54F, -9F, 10F);

		bodyModel[181].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 393
		bodyModel[181].setRotationPoint(-52F, -9F, 10F);

		bodyModel[182].addBox(0F, 0F, 0F, 2, 1, 0, 0F); // Box 394
		bodyModel[182].setRotationPoint(52F, -9F, -10F);

		bodyModel[183].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 395
		bodyModel[183].setRotationPoint(52F, -9F, -11F);

		bodyModel[184].addBox(0F, 0F, 0F, 0, 13, 1, 0F); // Box 396
		bodyModel[184].setRotationPoint(52F, -8F, -11F);

		bodyModel[185].addBox(0F, 0F, 0F, 2, 1, 0, 0F); // Box 397
		bodyModel[185].setRotationPoint(52F, -9F, 10F);

		bodyModel[186].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 398
		bodyModel[186].setRotationPoint(52F, -9F, 10F);

		bodyModel[187].addBox(0F, 0F, 0F, 0, 13, 1, 0F); // Box 399
		bodyModel[187].setRotationPoint(52F, -8F, 10F);

		bodyModel[188].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 400
		bodyModel[188].setRotationPoint(49F, -21F, 3F);

		bodyModel[189].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, -1F, 0F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 401
		bodyModel[189].setRotationPoint(49F, -21F, -7F);

		bodyModel[190].addShapeBox(0F, 0F, 0F, 81, 1, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 402
		bodyModel[190].setRotationPoint(-32F, -21F, -7F);

		bodyModel[191].addBox(0F, 0F, 0F, 2, 2, 5, 0F); // Box 404 exhaust
		bodyModel[191].setRotationPoint(25F, -23F, -2.5F);

		bodyModel[192].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 405
		bodyModel[192].setRotationPoint(-44F, 1F, 9F);

		bodyModel[193].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 406
		bodyModel[193].setRotationPoint(-37F, 0F, 9F);

		bodyModel[194].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 407
		bodyModel[194].setRotationPoint(-45F, 0F, 9F);

		bodyModel[195].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0.5F, 0F, 0F, -1F, 0F, 0F, 1F, 1F, 0F, -1.5F, 1F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 2F, 0F, 0F, -2.5F, 0F, 0F); // Box 280
		bodyModel[195].setRotationPoint(-55F, 4F, 3F);

		bodyModel[196].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F); // Box 281
		bodyModel[196].setRotationPoint(-55F, 6F, 0F);

		bodyModel[197].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,-1F, 0F, 0F, 0.5F, 0F, 0F, 3F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, -1F, -2.5F, 0F, -1F); // Box 282
		bodyModel[197].setRotationPoint(-56F, 7F, 0F);

		bodyModel[198].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,-3.5F, 0F, 0F, 3F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -2.5F, 0F, -1F, 2F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 283
		bodyModel[198].setRotationPoint(-56F, 7F, -10F);

		bodyModel[199].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,-2.5F, 0F, 0F, 2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 284
		bodyModel[199].setRotationPoint(-55F, 6F, -10F);

		bodyModel[200].addShapeBox(0F, 0F, -2F, 1, 1, 7, 0F,-1.5F, 1F, 0F, 1F, 1F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F); // Box 285
		bodyModel[200].setRotationPoint(-55F, 4F, -8F);

		bodyModel[201].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -0.5F, 1.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 1.5F, 0F, 0F); // Box 414
		bodyModel[201].setRotationPoint(-53F, 5F, -10F);

		bodyModel[202].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,1.5F, 0F, -0.5F, -2F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, 1.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 415
		bodyModel[202].setRotationPoint(-53F, 5F, 2F);

		bodyModel[203].addShapeBox(0F, 0F, 0F, 11, 8, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F); // Box 416
		bodyModel[203].setRotationPoint(-46F, 0F, -11F);
		bodyModel[203].rotateAngleX = 0.83775804F;

		bodyModel[204].addShapeBox(0F, 0F, 0F, 56, 13, 2, 0F,0F, 0F, 0F, -28F, 0F, 0F, -28F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -28F, 0F, 0F, -28F, 0F, 0F, 0F, 0F, 0F); // Box 422
		bodyModel[204].setRotationPoint(-14F, -20F, -8.5F);

		bodyModel[205].addShapeBox(0F, 0F, 0F, 56, 13, 2, 0F,0F, 0F, 0F, -28F, 0F, 0F, -28F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -28F, 0F, 0F, -28F, 0F, 0F, 0F, 0F, 0F); // Box 423
		bodyModel[205].setRotationPoint(-14F, -20F, 6.5F);

		bodyModel[206].addShapeBox(0F, 0F, 0F, 3, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F); // Box 426
		bodyModel[206].setRotationPoint(14F, -20F, 7F);

		bodyModel[207].addBox(0F, 0F, 0F, 2, 3, 3, 0F); // Box 427
		bodyModel[207].setRotationPoint(-16F, 0F, -11F);

		bodyModel[208].addBox(0F, 0F, 0F, 2, 3, 3, 0F); // Box 428
		bodyModel[208].setRotationPoint(14F, 0F, -11F);

		bodyModel[209].addBox(0F, 0F, 0F, 2, 3, 3, 0F); // Box 429
		bodyModel[209].setRotationPoint(14F, 0F, 8F);

		bodyModel[210].addBox(0F, 0F, 0F, 2, 3, 3, 0F); // Box 430
		bodyModel[210].setRotationPoint(-16F, 0F, 8F);

		bodyModel[211].addBox(0F, 0F, -5F, 13, 1, 5, 0F); // Box 432
		bodyModel[211].setRotationPoint(1F, -21.5F, -2F);
		bodyModel[211].rotateAngleX = 0.19198622F;

		bodyModel[212].addBox(0F, 0F, 0F, 13, 1, 4, 0F); // Box 433
		bodyModel[212].setRotationPoint(1F, -21.5F, -2F);

		bodyModel[213].addBox(0F, 0F, 0F, 13, 1, 5, 0F); // Box 434
		bodyModel[213].setRotationPoint(1F, -21.5F, 2F);
		bodyModel[213].rotateAngleX = -0.19198622F;

		bodyModel[214].addShapeBox(0F, 0F, 0F, 11, 8, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F); // Box 435
		bodyModel[214].setRotationPoint(35F, 0F, -11F);
		bodyModel[214].rotateAngleX = 0.83775804F;

		bodyModel[215].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 436
		bodyModel[215].setRotationPoint(28F, -21.5F, 3F);

		bodyModel[216].addBox(0F, 0F, 0F, 4, 1, 6, 0F); // Box 437
		bodyModel[216].setRotationPoint(28F, -21.5F, -3F);

		bodyModel[217].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 438
		bodyModel[217].setRotationPoint(28F, -21.5F, -7F);

		bodyModel[218].addBox(0F, 0F, 0F, 4, 5, 1, 0F); // Box 440
		bodyModel[218].setRotationPoint(28F, -20.5F, -7.25F);

		bodyModel[219].addBox(0F, 0F, 0F, 4, 5, 1, 0F); // Box 441
		bodyModel[219].setRotationPoint(28F, -20.5F, 6.25F);

		bodyModel[220].addBox(0F, 0F, 0F, 4, 5, 1, 0F); // Box 442
		bodyModel[220].setRotationPoint(-32F, -20.5F, 6.25F);

		bodyModel[221].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 443
		bodyModel[221].setRotationPoint(-32F, -21.5F, 3F);

		bodyModel[222].addBox(0F, 0F, 0F, 4, 1, 6, 0F); // Box 444
		bodyModel[222].setRotationPoint(-32F, -21.5F, -3F);

		bodyModel[223].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 445
		bodyModel[223].setRotationPoint(-32F, -21.5F, -7F);

		bodyModel[224].addBox(0F, 0F, 0F, 4, 5, 1, 0F); // Box 446
		bodyModel[224].setRotationPoint(-32F, -20.5F, -7.25F);

		bodyModel[225].addShapeBox(0F, 0F, 0F, 3, 3, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 447
		bodyModel[225].setRotationPoint(-14F, 0F, -11F);

		bodyModel[226].addShapeBox(0F, 0F, 0F, 3, 3, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 448
		bodyModel[226].setRotationPoint(-14F, 0F, 11F);

		bodyModel[227].addShapeBox(0F, 0F, 0F, 3, 3, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 449
		bodyModel[227].setRotationPoint(11F, 0F, 11F);

		bodyModel[228].addShapeBox(0F, 0F, 0F, 3, 3, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 450
		bodyModel[228].setRotationPoint(11F, 0F, -11F);

		bodyModel[229].addBox(0F, 0F, 0F, 2, 1, 3, 0F); // Box 451
		bodyModel[229].setRotationPoint(-54F, 0F, 5F);

		bodyModel[230].addBox(0F, 0F, 0F, 2, 0, 10, 0F); // Box 452
		bodyModel[230].setRotationPoint(-54F, 0F, -5F);

		bodyModel[231].addBox(0F, 0F, 0F, 1, 2, 6, 0F); // Box 453
		bodyModel[231].setRotationPoint(52F, 0F, -3F);

		bodyModel[232].addBox(0F, 0F, 0F, 2, 1, 3, 0F); // Box 454
		bodyModel[232].setRotationPoint(52F, 0F, -8F);

		bodyModel[233].addBox(0F, 0F, 0F, 2, 1, 3, 0F); // Box 455
		bodyModel[233].setRotationPoint(52F, 0F, 5F);

		bodyModel[234].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 456
		bodyModel[234].setRotationPoint(52F, 0F, 8F);

		bodyModel[235].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 457
		bodyModel[235].setRotationPoint(52F, 0F, -9F);

		bodyModel[236].addBox(0F, 0F, 0F, 2, 0, 10, 0F); // Box 458
		bodyModel[236].setRotationPoint(52F, 0F, -5F);

		bodyModel[237].addShapeBox(0F, 0F, 0F, 3, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F); // Box 461
		bodyModel[237].setRotationPoint(14F, -20F, -8F);

		bodyModel[238].addShapeBox(0F, 0F, 0F, 3, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F); // Box 462
		bodyModel[238].setRotationPoint(-17F, -20F, -8F);

		bodyModel[239].addShapeBox(0F, 0F, 0F, 3, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F); // Box 463
		bodyModel[239].setRotationPoint(-17F, -20F, 7F);

		bodyModel[240].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F,0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 479 cull
		bodyModel[240].setRotationPoint(52F, 8F, -9F);

		bodyModel[241].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F,0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 465 cull
		bodyModel[241].setRotationPoint(52F, 8F, 2F);

		bodyModel[242].addBox(0F, 0F, 0F, 1, 2, 3, 0F); // Box 466
		bodyModel[242].setRotationPoint(-44F, -19F, 7F);

		bodyModel[243].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 248
		bodyModel[243].setRotationPoint(-45F, -7F, 8F);

		bodyModel[244].addBox(0F, 0F, 0F, 1, 5, 0, 0F); // Box 249
		bodyModel[244].setRotationPoint(-45F, -5F, 9F);

		bodyModel[245].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F,0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 250
		bodyModel[245].setRotationPoint(-54F, 8F, 2F);

		bodyModel[246].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F,0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 251
		bodyModel[246].setRotationPoint(-54F, 8F, -9F);

		bodyModel[247].addShapeBox(0F, 0F, 0F, 1, 13, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 252
		bodyModel[247].setRotationPoint(-44F, -18F, -7F);

		bodyModel[248].addShapeBox(0F, 0F, 0F, 1, 13, 7, 0F,1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 253
		bodyModel[248].setRotationPoint(-44F, -18F, 0F);

		bodyModel[249].addBox(0F, 0F, 0F, 7, 8, 3, 0F); // Box 413
		bodyModel[249].setRotationPoint(-44F, -13F, -4F);
		bodyModel[249].rotateAngleY = -0.38397244F;

		bodyModel[250].addShapeBox(-1.5F, 0F, 0F, 8, 4, 2, 0F,0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -2F, 0F, -5F, -2F, 0F, -5F, -2F, 0F, 0F, -2F, 0F); // Box 86
		bodyModel[250].setRotationPoint(-42.4F, -15F, -4F);
		bodyModel[250].rotateAngleY = -0.38397244F;

		bodyModel[251].addBox(3F, 0F, 0F, 4, 2, 3, 0F); // Box 327
		bodyModel[251].setRotationPoint(-44F, -15F, -4F);
		bodyModel[251].rotateAngleY = -0.38397244F;

		bodyModel[252].addBox(0F, 0F, 3F, 3, 8, 1, 0F); // Box 328
		bodyModel[252].setRotationPoint(-44F, -13F, -4F);
		bodyModel[252].rotateAngleY = -0.38397244F;

		bodyModel[253].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1519
		bodyModel[253].setRotationPoint(49F, -16F, -7F);

		bodyModel[254].addBox(-0.5F, 0F, -0.5F, 1, 1, 1, 0F); // Box 1521 marker bullshit stupid
		bodyModel[254].setRotationPoint(49.25F, -15.5F, -6.25F);
		bodyModel[254].rotateAngleY = 0.78539816F;

		bodyModel[255].addBox(-0.5F, 0F, -0.5F, 1, 1, 1, 0F); // Box 1522 marker bullshit stupid
		bodyModel[255].setRotationPoint(49.25F, -15.5F, 6.25F);
		bodyModel[255].rotateAngleY = -0.78539816F;

		bodyModel[256].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 259
		bodyModel[256].setRotationPoint(49F, -16F, 6F);
	}
	ModelTrimountTrucc theTruc = new ModelTrimountTrucc();
	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		for (int i = 0; i < 257; i++) {
			if (bodyModel[i].boxName != null && bodyModel[i].boxName.contains("lamp")) {
				Minecraft.getMinecraft().entityRenderer.disableLightmap(1D);
				bodyModel[i].render(f5);
				Minecraft.getMinecraft().entityRenderer.enableLightmap(1D);
			}else if (bodyModel[i].boxName != null && bodyModel[i].boxName.contains("cull")) {
				GL11.glDisable(GL11.GL_CULL_FACE);
				bodyModel[i].render(f5);
				GL11.glEnable(GL11.GL_CULL_FACE);
			} else {
				bodyModel[i].render(f5);
			}
		}
		if (entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor() == 14321){
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/trimount2_Black.png"));
			GL11.glPushMatrix();
			GL11.glRotatef(180, 0, 1, 0);
			GL11.glTranslated(-2.0, -0.03, 0);
			theTruc.render(entity, f, f1, f2, f3, f4, f5);//rear truck

			GL11.glRotatef(180, 0, 1, 0);
			GL11.glTranslated(-4.0, 0, 0);
			theTruc.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/trimount1_Black.png"));
			GL11.glPushMatrix();
			GL11.glRotatef(180, 0, 1, 0);
			GL11.glTranslated(-2.0, -0.03, 0);
			theTruc.render(entity, f, f1, f2, f3, f4, f5);//rear truck

			GL11.glRotatef(180, 0, 1, 0);
			GL11.glTranslated(-4.0, 0, 0);
			theTruc.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		}
	}
	public float[] getTrans() {
		return new float[]{-2F, 0.15F, 0.00F};
	}

	public float[] getRotate() {
		return new float[] { 0F, 180F, 180F };
	}

	public float[] getScale() {
		return null;
	}

	public ArrayList<double[]> getSmokePosition() {
		return new ArrayList<double[]>() {
			{
				add(new double[]{0.4D, 1.4D, 0.0D});
				add(new double[]{3.65D, 1.4D, 0.0D});
			}
		};
	}
}