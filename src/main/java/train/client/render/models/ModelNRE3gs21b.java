//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 19.12.2020 - 00:03:35
// Last changed on: 19.12.2020 - 00:03:35

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

public class ModelNRE3gs21b extends ModelConverter //Same as Filename
{
	int textureX = 256;
	int textureY = 256;

	public ModelNRE3gs21b() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[313];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 1
		bodyModel[1] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 114
		bodyModel[2] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 163
		bodyModel[3] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 166
		bodyModel[4] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 168
		bodyModel[5] = new ModelRendererTurbo(this, 161, 25, textureX, textureY); // Box 169
		bodyModel[6] = new ModelRendererTurbo(this, 217, 9, textureX, textureY); // Box 3
		bodyModel[7] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 246
		bodyModel[8] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 247
		bodyModel[9] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 266
		bodyModel[10] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 271
		bodyModel[11] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 272
		bodyModel[12] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 273
		bodyModel[13] = new ModelRendererTurbo(this, 169, 9, textureX, textureY); // Box 274
		bodyModel[14] = new ModelRendererTurbo(this, 185, 9, textureX, textureY); // Box 275
		bodyModel[15] = new ModelRendererTurbo(this, 217, 9, textureX, textureY); // Box 276
		bodyModel[16] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 3
		bodyModel[17] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 246
		bodyModel[18] = new ModelRendererTurbo(this, 201, 9, textureX, textureY); // Box 247
		bodyModel[19] = new ModelRendererTurbo(this, 193, 25, textureX, textureY); // Box 266
		bodyModel[20] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 4
		bodyModel[21] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Box 4
		bodyModel[22] = new ModelRendererTurbo(this, 177, 9, textureX, textureY); // Box 261
		bodyModel[23] = new ModelRendererTurbo(this, 193, 25, textureX, textureY); // Box 31
		bodyModel[24] = new ModelRendererTurbo(this, 241, 9, textureX, textureY); // box64
		bodyModel[25] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // box65
		bodyModel[26] = new ModelRendererTurbo(this, 49, 33, textureX, textureY); // Box 44
		bodyModel[27] = new ModelRendererTurbo(this, 65, 33, textureX, textureY); // Box 45
		bodyModel[28] = new ModelRendererTurbo(this, 89, 33, textureX, textureY); // Box 56
		bodyModel[29] = new ModelRendererTurbo(this, 49, 33, textureX, textureY); // Box 61
		bodyModel[30] = new ModelRendererTurbo(this, 113, 33, textureX, textureY); // Box 63
		bodyModel[31] = new ModelRendererTurbo(this, 121, 33, textureX, textureY); // Box 4
		bodyModel[32] = new ModelRendererTurbo(this, 137, 33, textureX, textureY); // Box 5
		bodyModel[33] = new ModelRendererTurbo(this, 153, 33, textureX, textureY); // Box 61
		bodyModel[34] = new ModelRendererTurbo(this, 161, 33, textureX, textureY); // Box 63
		bodyModel[35] = new ModelRendererTurbo(this, 41, 49, textureX, textureY); // Box 86
		bodyModel[36] = new ModelRendererTurbo(this, 81, 49, textureX, textureY); // Box 87
		bodyModel[37] = new ModelRendererTurbo(this, 121, 49, textureX, textureY); // Box 255
		bodyModel[38] = new ModelRendererTurbo(this, 161, 49, textureX, textureY); // Box 256
		bodyModel[39] = new ModelRendererTurbo(this, 41, 57, textureX, textureY); // Box 38R
		bodyModel[40] = new ModelRendererTurbo(this, 137, 57, textureX, textureY); // Box 176
		bodyModel[41] = new ModelRendererTurbo(this, 169, 33, textureX, textureY); // Box 178
		bodyModel[42] = new ModelRendererTurbo(this, 177, 25, textureX, textureY); // Box 243
		bodyModel[43] = new ModelRendererTurbo(this, 57, 41, textureX, textureY); // Box 244
		bodyModel[44] = new ModelRendererTurbo(this, 121, 41, textureX, textureY); // Box 249
		bodyModel[45] = new ModelRendererTurbo(this, 233, 41, textureX, textureY); // Box 250
		bodyModel[46] = new ModelRendererTurbo(this, 184, 231, textureX, textureY, "lamp"); // Box 247 lamp rear
		bodyModel[47] = new ModelRendererTurbo(this, 184, 231, textureX, textureY, "lamp"); // Box 248 lamp rear
		bodyModel[48] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 144
		bodyModel[49] = new ModelRendererTurbo(this, 25, 57, textureX, textureY); // Box 145
		bodyModel[50] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 61
		bodyModel[51] = new ModelRendererTurbo(this, 241, 41, textureX, textureY); // Box 81
		bodyModel[52] = new ModelRendererTurbo(this, 129, 41, textureX, textureY); // Box 81
		bodyModel[53] = new ModelRendererTurbo(this, 217, 25, textureX, textureY); // Box 174
		bodyModel[54] = new ModelRendererTurbo(this, 137, 41, textureX, textureY); // Box 191
		bodyModel[55] = new ModelRendererTurbo(this, 105, 41, textureX, textureY); // Box 2
		bodyModel[56] = new ModelRendererTurbo(this, 145, 41, textureX, textureY); // Box 2
		bodyModel[57] = new ModelRendererTurbo(this, 201, 17, textureX, textureY); // Box 114
		bodyModel[58] = new ModelRendererTurbo(this, 201, 25, textureX, textureY); // Box 74
		bodyModel[59] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 78
		bodyModel[60] = new ModelRendererTurbo(this, 233, 57, textureX, textureY); // Box 9
		bodyModel[61] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 10
		bodyModel[62] = new ModelRendererTurbo(this, 41, 73, textureX, textureY); // Box 15
		bodyModel[63] = new ModelRendererTurbo(this, 81, 73, textureX, textureY); // Box 21
		bodyModel[64] = new ModelRendererTurbo(this, 121, 73, textureX, textureY); // Box 201
		bodyModel[65] = new ModelRendererTurbo(this, 121, 73, textureX, textureY); // Box 314 door swing right
		bodyModel[66] = new ModelRendererTurbo(this, 169, 73, textureX, textureY); // Box 315 door swing right
		bodyModel[67] = new ModelRendererTurbo(this, 169, 81, textureX, textureY); // Box 489
		bodyModel[68] = new ModelRendererTurbo(this, 185, 73, textureX, textureY); // Box 278
		bodyModel[69] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 281
		bodyModel[70] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 288
		bodyModel[71] = new ModelRendererTurbo(this, 65, 105, textureX, textureY); // Box 315
		bodyModel[72] = new ModelRendererTurbo(this, 113, 105, textureX, textureY); // Box 316
		bodyModel[73] = new ModelRendererTurbo(this, 65, 73, textureX, textureY); // Box 303
		bodyModel[74] = new ModelRendererTurbo(this, 225, 25, textureX, textureY); // Box 293
		bodyModel[75] = new ModelRendererTurbo(this, 201, 49, textureX, textureY); // Box 11
		bodyModel[76] = new ModelRendererTurbo(this, 145, 105, textureX, textureY); // Box 211
		bodyModel[77] = new ModelRendererTurbo(this, 65, 113, textureX, textureY); // Box 219
		bodyModel[78] = new ModelRendererTurbo(this, 97, 113, textureX, textureY); // Box 220
		bodyModel[79] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 221
		bodyModel[80] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Box 19
		bodyModel[81] = new ModelRendererTurbo(this, 81, 33, textureX, textureY); // Box 334
		bodyModel[82] = new ModelRendererTurbo(this, 233, 73, textureX, textureY); // Box 305
		bodyModel[83] = new ModelRendererTurbo(this, 233, 89, textureX, textureY); // Box 86
		bodyModel[84] = new ModelRendererTurbo(this, 169, 113, textureX, textureY); // Box 87
		bodyModel[85] = new ModelRendererTurbo(this, 217, 49, textureX, textureY); // Box 86
		bodyModel[86] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 510
		bodyModel[87] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 511
		bodyModel[88] = new ModelRendererTurbo(this, 193, 25, textureX, textureY); // Box 512
		bodyModel[89] = new ModelRendererTurbo(this, 65, 33, textureX, textureY); // Box 513
		bodyModel[90] = new ModelRendererTurbo(this, 193, 33, textureX, textureY, "cull"); // Box 479 cull
		bodyModel[91] = new ModelRendererTurbo(this, 25, 65, textureX, textureY, "cull"); // Box 339 cull
		bodyModel[92] = new ModelRendererTurbo(this, 249, 41, textureX, textureY); // Box 350
		bodyModel[93] = new ModelRendererTurbo(this, 249, 49, textureX, textureY); // Box 351
		bodyModel[94] = new ModelRendererTurbo(this, 177, 113, textureX, textureY); // Box 408
		bodyModel[95] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Box 409
		bodyModel[96] = new ModelRendererTurbo(this, 33, 137, textureX, textureY); // Box 515
		bodyModel[97] = new ModelRendererTurbo(this, 89, 73, textureX, textureY); // Box 516
		bodyModel[98] = new ModelRendererTurbo(this, 105, 73, textureX, textureY); // Box 517
		bodyModel[99] = new ModelRendererTurbo(this, 113, 73, textureX, textureY); // Box 518
		bodyModel[100] = new ModelRendererTurbo(this, 137, 73, textureX, textureY); // Box 519
		bodyModel[101] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 409
		bodyModel[102] = new ModelRendererTurbo(this, 191, 231, textureX, textureY, "lamp"); // Box 412 Headlight F
		bodyModel[103] = new ModelRendererTurbo(this, 191, 231, textureX, textureY, "lamp"); // Box 413 Headlight F
		bodyModel[104] = new ModelRendererTurbo(this, 81, 81, textureX, textureY); // Box 414
		bodyModel[105] = new ModelRendererTurbo(this, 105, 81, textureX, textureY); // Box 415
		bodyModel[106] = new ModelRendererTurbo(this, 17, 97, textureX, textureY); // Box 416
		bodyModel[107] = new ModelRendererTurbo(this, 209, 113, textureX, textureY); // Box 417
		bodyModel[108] = new ModelRendererTurbo(this, 65, 113, textureX, textureY); // Box 418
		bodyModel[109] = new ModelRendererTurbo(this, 129, 89, textureX, textureY); // Box 419
		bodyModel[110] = new ModelRendererTurbo(this, 217, 129, textureX, textureY); // Box 420
		bodyModel[111] = new ModelRendererTurbo(this, 177, 89, textureX, textureY); // Box 421
		bodyModel[112] = new ModelRendererTurbo(this, 89, 113, textureX, textureY); // Box 422
		bodyModel[113] = new ModelRendererTurbo(this, 241, 113, textureX, textureY); // Box 423
		bodyModel[114] = new ModelRendererTurbo(this, 193, 9, textureX, textureY, "lamp"); // Box 424 liverimg 2
		bodyModel[115] = new ModelRendererTurbo(this, 249, 17, textureX, textureY, "lamp"); // Box 425 liveryimg 2
		bodyModel[116] = new ModelRendererTurbo(this, 41, 145, textureX, textureY); // Box 426
		bodyModel[117] = new ModelRendererTurbo(this, 33, 89, textureX, textureY); // Box 428
		bodyModel[118] = new ModelRendererTurbo(this, 209, 129, textureX, textureY); // Box 429
		bodyModel[119] = new ModelRendererTurbo(this, 49, 81, textureX, textureY); // Box 430
		bodyModel[120] = new ModelRendererTurbo(this, 81, 33, textureX, textureY); // Box 363
		bodyModel[121] = new ModelRendererTurbo(this, 209, 121, textureX, textureY); // Box 433
		bodyModel[122] = new ModelRendererTurbo(this, 169, 137, textureX, textureY); // Box 434
		bodyModel[123] = new ModelRendererTurbo(this, 105, 113, textureX, textureY); // Box 435
		bodyModel[124] = new ModelRendererTurbo(this, 89, 33, textureX, textureY); // Box 436
		bodyModel[125] = new ModelRendererTurbo(this, 121, 33, textureX, textureY); // Box 437
		bodyModel[126] = new ModelRendererTurbo(this, 241, 121, textureX, textureY); // Box 438
		bodyModel[127] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Box 439
		bodyModel[128] = new ModelRendererTurbo(this, 137, 113, textureX, textureY); // Box 441
		bodyModel[129] = new ModelRendererTurbo(this, 89, 121, textureX, textureY); // Box 444
		bodyModel[130] = new ModelRendererTurbo(this, 1, 153, textureX, textureY); // Box 445
		bodyModel[131] = new ModelRendererTurbo(this, 193, 145, textureX, textureY); // Box 43
		bodyModel[132] = new ModelRendererTurbo(this, 209, 49, textureX, textureY); // Box 43
		bodyModel[133] = new ModelRendererTurbo(this, 41, 129, textureX, textureY); // Box 43
		bodyModel[134] = new ModelRendererTurbo(this, 41, 129, textureX, textureY); // Box 43
		bodyModel[135] = new ModelRendererTurbo(this, 177, 73, textureX, textureY); // Box 450
		bodyModel[136] = new ModelRendererTurbo(this, 193, 137, textureX, textureY); // Box 451
		bodyModel[137] = new ModelRendererTurbo(this, 9, 97, textureX, textureY); // Box 143 sandcap
		bodyModel[138] = new ModelRendererTurbo(this, 177, 153, textureX, textureY); // Box 453
		bodyModel[139] = new ModelRendererTurbo(this, 233, 25, textureX, textureY); // Box 455
		bodyModel[140] = new ModelRendererTurbo(this, 137, 81, textureX, textureY); // Box 456
		bodyModel[141] = new ModelRendererTurbo(this, 241, 25, textureX, textureY); // Box 457
		bodyModel[142] = new ModelRendererTurbo(this, 185, 81, textureX, textureY); // Box 458
		bodyModel[143] = new ModelRendererTurbo(this, 193, 113, textureX, textureY); // Box 459
		bodyModel[144] = new ModelRendererTurbo(this, 233, 113, textureX, textureY); // Box 460
		bodyModel[145] = new ModelRendererTurbo(this, 233, 41, textureX, textureY); // Box 461
		bodyModel[146] = new ModelRendererTurbo(this, 225, 121, textureX, textureY); // Box 462
		bodyModel[147] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 463
		bodyModel[148] = new ModelRendererTurbo(this, 9, 129, textureX, textureY); // Box 464
		bodyModel[149] = new ModelRendererTurbo(this, 17, 49, textureX, textureY); // Box 465
		bodyModel[150] = new ModelRendererTurbo(this, 209, 137, textureX, textureY); // Box 466
		bodyModel[151] = new ModelRendererTurbo(this, 185, 113, textureX, textureY); // Box 467
		bodyModel[152] = new ModelRendererTurbo(this, 249, 25, textureX, textureY); // Box 469
		bodyModel[153] = new ModelRendererTurbo(this, 25, 49, textureX, textureY); // Box 470
		bodyModel[154] = new ModelRendererTurbo(this, 33, 49, textureX, textureY); // Box 471
		bodyModel[155] = new ModelRendererTurbo(this, 24, 153, textureX, textureY); // Box 472
		bodyModel[156] = new ModelRendererTurbo(this, 65, 73, textureX, textureY); // Box 473
		bodyModel[157] = new ModelRendererTurbo(this, 33, 129, textureX, textureY); // Box 474
		bodyModel[158] = new ModelRendererTurbo(this, 49, 129, textureX, textureY); // Box 475
		bodyModel[159] = new ModelRendererTurbo(this, 225, 153, textureX, textureY); // Box 476
		bodyModel[160] = new ModelRendererTurbo(this, 217, 169, textureX, textureY); // Box 477
		bodyModel[161] = new ModelRendererTurbo(this, 25, 177, textureX, textureY); // Box 478
		bodyModel[162] = new ModelRendererTurbo(this, 161, 161, textureX, textureY); // Box 479
		bodyModel[163] = new ModelRendererTurbo(this, 17, 137, textureX, textureY); // Box 480
		bodyModel[164] = new ModelRendererTurbo(this, 137, 33, textureX, textureY); // Box 481
		bodyModel[165] = new ModelRendererTurbo(this, 193, 33, textureX, textureY); // Box 482
		bodyModel[166] = new ModelRendererTurbo(this, 225, 137, textureX, textureY); // Box 483
		bodyModel[167] = new ModelRendererTurbo(this, 145, 41, textureX, textureY); // Box 484
		bodyModel[168] = new ModelRendererTurbo(this, 201, 49, textureX, textureY); // Box 485
		bodyModel[169] = new ModelRendererTurbo(this, 161, 145, textureX, textureY); // Box 487
		bodyModel[170] = new ModelRendererTurbo(this, 1, 153, textureX, textureY); // Box 490
		bodyModel[171] = new ModelRendererTurbo(this, 241, 161, textureX, textureY); // Box 498
		bodyModel[172] = new ModelRendererTurbo(this, 65, 177, textureX, textureY); // Box 501
		bodyModel[173] = new ModelRendererTurbo(this, 73, 177, textureX, textureY); // Box 502
		bodyModel[174] = new ModelRendererTurbo(this, 225, 169, textureX, textureY); // Box 503
		bodyModel[175] = new ModelRendererTurbo(this, 81, 177, textureX, textureY); // Box 504
		bodyModel[176] = new ModelRendererTurbo(this, 169, 145, textureX, textureY); // Box 505
		bodyModel[177] = new ModelRendererTurbo(this, 97, 177, textureX, textureY); // Box 506
		bodyModel[178] = new ModelRendererTurbo(this, 113, 177, textureX, textureY); // Box 507
		bodyModel[179] = new ModelRendererTurbo(this, 121, 177, textureX, textureY); // Box 508
		bodyModel[180] = new ModelRendererTurbo(this, 137, 177, textureX, textureY); // Box 509
		bodyModel[181] = new ModelRendererTurbo(this, 153, 177, textureX, textureY); // Box 510
		bodyModel[182] = new ModelRendererTurbo(this, 25, 97, textureX, textureY); // Box 511 sandcap
		bodyModel[183] = new ModelRendererTurbo(this, 49, 177, textureX, textureY); // Box 512
		bodyModel[184] = new ModelRendererTurbo(this, 1, 201, textureX, textureY); // Box 513
		bodyModel[185] = new ModelRendererTurbo(this, 185, 177, textureX, textureY); // Box 514
		bodyModel[186] = new ModelRendererTurbo(this, 137, 121, textureX, textureY); // Box 516
		bodyModel[187] = new ModelRendererTurbo(this, 81, 73, textureX, textureY); // Box 517
		bodyModel[188] = new ModelRendererTurbo(this, 25, 65, textureX, textureY); // Box 518
		bodyModel[189] = new ModelRendererTurbo(this, 121, 129, textureX, textureY); // Box 519
		bodyModel[190] = new ModelRendererTurbo(this, 153, 41, textureX, textureY); // Box 520
		bodyModel[191] = new ModelRendererTurbo(this, 209, 177, textureX, textureY); // Box 522
		bodyModel[192] = new ModelRendererTurbo(this, 9, 113, textureX, textureY); // Box 523
		bodyModel[193] = new ModelRendererTurbo(this, 1, 185, textureX, textureY); // Box 524
		bodyModel[194] = new ModelRendererTurbo(this, 137, 129, textureX, textureY); // Box 525
		bodyModel[195] = new ModelRendererTurbo(this, 153, 129, textureX, textureY); // Box 526
		bodyModel[196] = new ModelRendererTurbo(this, 161, 161, textureX, textureY); // Box 527
		bodyModel[197] = new ModelRendererTurbo(this, 129, 73, textureX, textureY); // Box 516
		bodyModel[198] = new ModelRendererTurbo(this, 249, 73, textureX, textureY); // Box 516
		bodyModel[199] = new ModelRendererTurbo(this, 1, 185, textureX, textureY); // Box 230
		bodyModel[200] = new ModelRendererTurbo(this, 9, 145, textureX, textureY); // Box 231
		bodyModel[201] = new ModelRendererTurbo(this, 73, 113, textureX, textureY); // Box 233
		bodyModel[202] = new ModelRendererTurbo(this, 41, 145, textureX, textureY); // Box 234
		bodyModel[203] = new ModelRendererTurbo(this, 121, 73, textureX, textureY); // Box 235
		bodyModel[204] = new ModelRendererTurbo(this, 41, 153, textureX, textureY); // Box 236 remove this if noselight
		bodyModel[205] = new ModelRendererTurbo(this, 207, 231, textureX, textureY, "lamp"); // Box 412 Headlight F Nose
		bodyModel[206] = new ModelRendererTurbo(this, 207, 231, textureX, textureY, "lamp"); // Box 412 Headlight F Nose
		bodyModel[207] = new ModelRendererTurbo(this, 161, 185, textureX, textureY); // Box 239 nose light frame
		bodyModel[208] = new ModelRendererTurbo(this, 177, 185, textureX, textureY); // Box 240
		bodyModel[209] = new ModelRendererTurbo(this, 249, 121, textureX, textureY); // Box 241
		bodyModel[210] = new ModelRendererTurbo(this, 217, 137, textureX, textureY); // Box 242
		bodyModel[211] = new ModelRendererTurbo(this, 225, 153, textureX, textureY); // Box 243 nose light sand hatch cover
		bodyModel[212] = new ModelRendererTurbo(this, 217, 169, textureX, textureY); // Box 244 nose light sand hatch cover
		bodyModel[213] = new ModelRendererTurbo(this, 201, 137, textureX, textureY); // Box 249
		bodyModel[214] = new ModelRendererTurbo(this, 161, 145, textureX, textureY); // Box 250
		bodyModel[215] = new ModelRendererTurbo(this, 129, 193, textureX, textureY); // Box 251
		bodyModel[216] = new ModelRendererTurbo(this, 169, 73, textureX, textureY); // Box 252
		bodyModel[217] = new ModelRendererTurbo(this, 233, 73, textureX, textureY); // Box 253
		bodyModel[218] = new ModelRendererTurbo(this, 105, 81, textureX, textureY); // Box 254
		bodyModel[219] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 255
		bodyModel[220] = new ModelRendererTurbo(this, 1, 193, textureX, textureY); // Box 256
		bodyModel[221] = new ModelRendererTurbo(this, 25, 193, textureX, textureY); // Box 257
		bodyModel[222] = new ModelRendererTurbo(this, 41, 193, textureX, textureY); // Box 258
		bodyModel[223] = new ModelRendererTurbo(this, 25, 185, textureX, textureY); // Box 261
		bodyModel[224] = new ModelRendererTurbo(this, 57, 193, textureX, textureY); // Box 262
		bodyModel[225] = new ModelRendererTurbo(this, 73, 193, textureX, textureY); // Box 263
		bodyModel[226] = new ModelRendererTurbo(this, 105, 193, textureX, textureY); // Box 264
		bodyModel[227] = new ModelRendererTurbo(this, 185, 193, textureX, textureY); // Box 265
		bodyModel[228] = new ModelRendererTurbo(this, 209, 193, textureX, textureY); // Box 266
		bodyModel[229] = new ModelRendererTurbo(this, 169, 153, textureX, textureY); // Box 267
		bodyModel[230] = new ModelRendererTurbo(this, 89, 177, textureX, textureY); // Box 268
		bodyModel[231] = new ModelRendererTurbo(this, 235, 231, textureX, textureY, "lamp"); // Box 269 lamp ditchlight rear
		bodyModel[232] = new ModelRendererTurbo(this, 235, 231, textureX, textureY, "lamp"); // Box 270 lamp ditchlight rear
		bodyModel[233] = new ModelRendererTurbo(this, 129, 177, textureX, textureY); // Box 271
		bodyModel[234] = new ModelRendererTurbo(this, 241, 177, textureX, textureY); // Box 272
		bodyModel[235] = new ModelRendererTurbo(this, 228, 231, textureX, textureY, "lamp"); // Box 273 lamp ditchlight front
		bodyModel[236] = new ModelRendererTurbo(this, 228, 231, textureX, textureY, "lamp"); // Box 274 lamp ditchlight front
		bodyModel[237] = new ModelRendererTurbo(this, 185, 153, textureX, textureY); // Box 294
		bodyModel[238] = new ModelRendererTurbo(this, 185, 185, textureX, textureY); // Box 295
		bodyModel[239] = new ModelRendererTurbo(this, 249, 161, textureX, textureY); // Box 296
		bodyModel[240] = new ModelRendererTurbo(this, 89, 113, textureX, textureY); // Box 297
		bodyModel[241] = new ModelRendererTurbo(this, 105, 177, textureX, textureY); // Box 279
		bodyModel[242] = new ModelRendererTurbo(this, 129, 201, textureX, textureY); // Box 280
		bodyModel[243] = new ModelRendererTurbo(this, 193, 193, textureX, textureY); // Box 281
		bodyModel[244] = new ModelRendererTurbo(this, 169, 201, textureX, textureY); // Box 282
		bodyModel[245] = new ModelRendererTurbo(this, 209, 201, textureX, textureY); // Box 283
		bodyModel[246] = new ModelRendererTurbo(this, 233, 201, textureX, textureY); // Box 284
		bodyModel[247] = new ModelRendererTurbo(this, 185, 209, textureX, textureY); // Box 285
		bodyModel[248] = new ModelRendererTurbo(this, 1, 217, textureX, textureY); // Box 286
		bodyModel[249] = new ModelRendererTurbo(this, 25, 217, textureX, textureY); // Box 287
		bodyModel[250] = new ModelRendererTurbo(this, 49, 217, textureX, textureY); // Box 288
		bodyModel[251] = new ModelRendererTurbo(this, 73, 217, textureX, textureY); // Box 289
		bodyModel[252] = new ModelRendererTurbo(this, 89, 217, textureX, textureY); // Box 290
		bodyModel[253] = new ModelRendererTurbo(this, 113, 217, textureX, textureY); // Box 291
		bodyModel[254] = new ModelRendererTurbo(this, 65, 193, textureX, textureY); // Box 292
		bodyModel[255] = new ModelRendererTurbo(this, 145, 177, textureX, textureY); // Box 293
		bodyModel[256] = new ModelRendererTurbo(this, 153, 113, textureX, textureY); // Box 294
		bodyModel[257] = new ModelRendererTurbo(this, 169, 201, textureX, textureY); // Box 295
		bodyModel[258] = new ModelRendererTurbo(this, 201, 217, textureX, textureY); // Box 361
		bodyModel[259] = new ModelRendererTurbo(this, 89, 193, textureX, textureY); // Box 362
		bodyModel[260] = new ModelRendererTurbo(this, 129, 193, textureX, textureY); // Box 363
		bodyModel[261] = new ModelRendererTurbo(this, 185, 201, textureX, textureY); // Box 299
		bodyModel[262] = new ModelRendererTurbo(this, 225, 201, textureX, textureY); // Box 300
		bodyModel[263] = new ModelRendererTurbo(this, 225, 217, textureX, textureY); // Box 301
		bodyModel[264] = new ModelRendererTurbo(this, 233, 145, textureX, textureY); // Box 372
		bodyModel[265] = new ModelRendererTurbo(this, 97, 217, textureX, textureY); // Box 307
		bodyModel[266] = new ModelRendererTurbo(this, 233, 201, textureX, textureY); // Box 364 prime base
		bodyModel[267] = new ModelRendererTurbo(this, 198, 232, textureX, textureY, "lamp"); // Box 6 PRIME1-1
		bodyModel[268] = new ModelRendererTurbo(this, 198, 232, textureX, textureY, "lamp"); // Box 7 PRIME1-3
		bodyModel[269] = new ModelRendererTurbo(this, 198, 232, textureX, textureY, "lamp"); // Box 8 PRIME1-2
		bodyModel[270] = new ModelRendererTurbo(this, 198, 232, textureX, textureY, "lamp"); // Box 9 PRIME1-4
		bodyModel[271] = new ModelRendererTurbo(this, 249, 201, textureX, textureY); // Box 313
		bodyModel[272] = new ModelRendererTurbo(this, 201, 209, textureX, textureY); // Box 314
		bodyModel[273] = new ModelRendererTurbo(this, 214, 230, textureX, textureY); // Box 78
		bodyModel[274] = new ModelRendererTurbo(this, 214, 230, textureX, textureY); // Box 188
		bodyModel[275] = new ModelRendererTurbo(this, 221, 231, textureX, textureY, "lamp"); // Box 189 ditchlight front
		bodyModel[276] = new ModelRendererTurbo(this, 221, 231, textureX, textureY, "lamp"); // Box 190 ditchlight front
		bodyModel[277] = new ModelRendererTurbo(this, 242, 230, textureX, textureY); // Box 239
		bodyModel[278] = new ModelRendererTurbo(this, 249, 231, textureX, textureY, "lamp"); // Box 240 ditchlight rear
		bodyModel[279] = new ModelRendererTurbo(this, 249, 231, textureX, textureY, "lamp"); // Box 241 ditchlight rear
		bodyModel[280] = new ModelRendererTurbo(this, 242, 230, textureX, textureY); // Box 242
		bodyModel[281] = new ModelRendererTurbo(this, 177, 224, textureX, textureY, "cull"); // Box 369 cull
		bodyModel[282] = new ModelRendererTurbo(this, 241, 145, textureX, textureY); // Box 372
		bodyModel[283] = new ModelRendererTurbo(this, 49, 41, textureX, textureY, "lamp"); // Box 424 liverimg 2
		bodyModel[284] = new ModelRendererTurbo(this, 49, 41, textureX, textureY, "lamp"); // Box 425 liveryimg 2
		bodyModel[285] = new ModelRendererTurbo(this, 193, 225, textureX, textureY); // Box 327
		bodyModel[286] = new ModelRendererTurbo(this, 209, 225, textureX, textureY); // Box 328
		bodyModel[287] = new ModelRendererTurbo(this, 217, 225, textureX, textureY); // Box 329
		bodyModel[288] = new ModelRendererTurbo(this, 89, 121, textureX, textureY); // Box 330
		bodyModel[289] = new ModelRendererTurbo(this, 225, 225, textureX, textureY); // Box 364 prime base
		bodyModel[290] = new ModelRendererTurbo(this, 241, 225, textureX, textureY, "lamp"); // Box 6 PRIME2-1
		bodyModel[291] = new ModelRendererTurbo(this, 241, 225, textureX, textureY, "lamp"); // Box 7 PRIME2-3
		bodyModel[292] = new ModelRendererTurbo(this, 241, 225, textureX, textureY, "lamp"); // Box 8 PRIME2-2
		bodyModel[293] = new ModelRendererTurbo(this, 241, 225, textureX, textureY, "lamp"); // Box 9 PRIME2-4
		bodyModel[294] = new ModelRendererTurbo(this, 225, 121, textureX, textureY); // Box 336
		bodyModel[295] = new ModelRendererTurbo(this, 233, 41, textureX, textureY); // Box 337
		bodyModel[296] = new ModelRendererTurbo(this, 233, 113, textureX, textureY); // Box 338
		bodyModel[297] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 339
		bodyModel[298] = new ModelRendererTurbo(this, 9, 129, textureX, textureY); // Box 340
		bodyModel[299] = new ModelRendererTurbo(this, 17, 49, textureX, textureY); // Box 341
		bodyModel[300] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 342
		bodyModel[301] = new ModelRendererTurbo(this, 169, 9, textureX, textureY); // Box 343
		bodyModel[302] = new ModelRendererTurbo(this, 217, 9, textureX, textureY); // Box 344
		bodyModel[303] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 345
		bodyModel[304] = new ModelRendererTurbo(this, 185, 9, textureX, textureY); // Box 346
		bodyModel[305] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 347
		bodyModel[306] = new ModelRendererTurbo(this, 137, 221, textureX, textureY); // Box 348
		bodyModel[307] = new ModelRendererTurbo(this, 161, 221, textureX, textureY, "lamp"); // Box 162 commander beacon
		bodyModel[308] = new ModelRendererTurbo(this, 160, 225, textureX, textureY); // Box 165
		bodyModel[309] = new ModelRendererTurbo(this, 169, 221, textureX, textureY, "lamp"); // Box 404 commander beacon
		bodyModel[310] = new ModelRendererTurbo(this, 168, 225, textureX, textureY); // Box 405
		bodyModel[311] = new ModelRendererTurbo(this, 209, 131, textureX, textureY); // Box 353
		bodyModel[312] = new ModelRendererTurbo(this, 41, 129, textureX, textureY); // Box 355

		bodyModel[0].addBox(0F, 0F, 0F, 70, 1, 4, 0F); // Box 1
		bodyModel[0].setRotationPoint(-36F, 0F, -11F);

		bodyModel[1].addBox(0F, 0F, 0F, 74, 3, 14, 0F); // Box 114
		bodyModel[1].setRotationPoint(-38F, 0F, -7F);

		bodyModel[2].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 163
		bodyModel[2].setRotationPoint(-26F, 3F, -2F);

		bodyModel[3].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 166
		bodyModel[3].setRotationPoint(21F, 3F, -2F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 2, 1, 21, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 168
		bodyModel[4].setRotationPoint(-26F, 2F, -10.5F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 2, 1, 21, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 169
		bodyModel[5].setRotationPoint(22F, 2F, -10.5F);

		bodyModel[6].addBox(0F, 0F, 0F, 0, 8, 18, 0F); // Box 3
		bodyModel[6].setRotationPoint(-41.01F, 0F, -9F);

		bodyModel[7].addBox(0F, 0F, 0F, 0, 6, 1, 0F); // Box 246
		bodyModel[7].setRotationPoint(-41F, 2F, -10F);

		bodyModel[8].addBox(0F, 0F, 0F, 0, 6, 1, 0F); // Box 247
		bodyModel[8].setRotationPoint(-41F, 2F, 9F);

		bodyModel[9].addBox(0F, 0F, 0F, 3, 2, 14, 0F); // Box 266
		bodyModel[9].setRotationPoint(-41F, 0F, -7F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 3, 0, 1, 0F,0F, 0F, 0F, 0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 271
		bodyModel[10].setRotationPoint(-41F, 0F, -8F);

		bodyModel[11].addBox(0F, 0F, 0F, 5, 0, 2, 0F); // Box 272
		bodyModel[11].setRotationPoint(-41F, 7F, -11F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -0.65F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.65F, 0F, 0F, 0F, 0F, 0F); // Box 273
		bodyModel[12].setRotationPoint(-41F, 5F, -10F);

		bodyModel[13].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 274
		bodyModel[13].setRotationPoint(-41F, 2F, -9F);

		bodyModel[14].addBox(0F, 0F, 0F, 5, 1, 0, 0F); // Box 275
		bodyModel[14].setRotationPoint(-41F, 6F, -9F);

		bodyModel[15].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 276
		bodyModel[15].setRotationPoint(-41F, 4F, -8F);

		bodyModel[16].addBox(0F, 0F, 0F, 0, 8, 18, 0F); // Box 3
		bodyModel[16].setRotationPoint(39.01F, 0F, -9F);

		bodyModel[17].addBox(0F, 0F, 0F, 0, 6, 1, 0F); // Box 246
		bodyModel[17].setRotationPoint(39.02F, 2F, -10F);

		bodyModel[18].addBox(0F, 0F, 0F, 0, 6, 1, 0F); // Box 247
		bodyModel[18].setRotationPoint(39.02F, 2F, 9F);

		bodyModel[19].addBox(0F, 0F, 0F, 3, 2, 14, 0F); // Box 266
		bodyModel[19].setRotationPoint(36F, 0F, -7F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 5, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[20].setRotationPoint(-41F, 2F, -3F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 5, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); // Box 4
		bodyModel[21].setRotationPoint(34F, 2F, -3F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 2, 5, 3, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 261
		bodyModel[22].setRotationPoint(-38F, 0F, -10F);

		bodyModel[23].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 31
		bodyModel[23].setRotationPoint(37F, -16F, -2F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F,1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -1F, 1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // box64
		bodyModel[24].setRotationPoint(-26F, -20F, 11F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F,1F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // box65
		bodyModel[25].setRotationPoint(-26F, -20F, -12F);

		bodyModel[26].addBox(0F, 0F, 0F, 2, 0, 5, 0F); // Box 44
		bodyModel[26].setRotationPoint(-34F, -2F, -11F);

		bodyModel[27].addBox(0F, 0F, 0F, 5, 6, 5, 0F); // Box 45
		bodyModel[27].setRotationPoint(-34F, -6F, 6F);

		bodyModel[28].addBox(0F, 0F, 0F, 3, 6, 5, 0F); // Box 56
		bodyModel[28].setRotationPoint(-32F, -6F, -11F);

		bodyModel[29].addBox(0F, 0F, 0F, 0, 7, 1, 0F); // Box 61
		bodyModel[29].setRotationPoint(-41F, -2F, 10F);

		bodyModel[30].addBox(0F, 0F, 0F, 0, 7, 1, 0F); // Box 63
		bodyModel[30].setRotationPoint(-41F, -2F, -11F);

		bodyModel[31].addBox(0F, 0F, 0F, 4, 2, 3, 0F); // Box 4
		bodyModel[31].setRotationPoint(-45F, 3F, -1.5F);

		bodyModel[32].addBox(0F, 0F, 0F, 4, 2, 3, 0F); // Box 5
		bodyModel[32].setRotationPoint(39F, 3F, -1.5F);

		bodyModel[33].addBox(0F, 0F, 0F, 0, 7, 1, 0F); // Box 61
		bodyModel[33].setRotationPoint(39.02F, -2F, 10F);

		bodyModel[34].addBox(0F, 0F, 0F, 0, 7, 1, 0F); // Box 63
		bodyModel[34].setRotationPoint(39.02F, -2F, -11F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 16, 1, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 86
		bodyModel[35].setRotationPoint(-8F, 0.5F, 9F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 16, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 87
		bodyModel[36].setRotationPoint(-8F, 1.5F, 9F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 16, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 255
		bodyModel[37].setRotationPoint(-8F, 1.5F, -11F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 16, 1, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 256
		bodyModel[38].setRotationPoint(-8F, 0.5F, -11F);

		bodyModel[39].addBox(0F, 0F, 0F, 47, 8, 0, 0F); // Box 38R
		bodyModel[39].setRotationPoint(-12F, -8F, 11.01F);

		bodyModel[40].addBox(0F, 0F, 0F, 47, 8, 0, 0F); // Box 176
		bodyModel[40].setRotationPoint(-12F, -8F, -11.01F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 2, 6, 0, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 178
		bodyModel[41].setRotationPoint(-34F, -6F, -11F);

		bodyModel[42].addBox(0F, 0F, 0F, 0, 11, 2, 0F); // Box 243
		bodyModel[42].setRotationPoint(35F, -8F, 9F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 244
		bodyModel[43].setRotationPoint(35F, -7F, 10.5F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 249
		bodyModel[44].setRotationPoint(35F, -7F, -11.5F);

		bodyModel[45].addBox(0F, 0F, 0F, 0, 11, 2, 0F); // Box 250
		bodyModel[45].setRotationPoint(35F, -8F, -11F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 247 lamp rear
		bodyModel[46].setRotationPoint(37.25F, -16F, -2F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 248 lamp rear
		bodyModel[47].setRotationPoint(37.25F, -16F, 0F);

		bodyModel[48].addBox(0F, 0F, 0F, 0, 1, 1, 0F); // Box 144
		bodyModel[48].setRotationPoint(-41F, -8F, -8F);

		bodyModel[49].addBox(0F, 0F, 0F, 0, 8, 14, 0F); // Box 145
		bodyModel[49].setRotationPoint(-43F, -8F, -7F);

		bodyModel[50].addBox(0F, 0F, 0F, 2, 1, 0, 0F); // Box 61
		bodyModel[50].setRotationPoint(-37F, -8F, -11F);

		bodyModel[51].addBox(0F, 0F, 0F, 0, 13, 2, 0F); // Box 81
		bodyModel[51].setRotationPoint(-37F, -8F, -11F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 81
		bodyModel[52].setRotationPoint(-37F, -6F, -11.5F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F); // Box 174
		bodyModel[53].setRotationPoint(-35F, -8F, -11F);

		bodyModel[54].addBox(0F, 0F, 0F, 1, 7, 0, 0F); // Box 191
		bodyModel[54].setRotationPoint(-36F, -7F, -11F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[55].setRotationPoint(-42F, 2.5F, -2F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[56].setRotationPoint(39F, 2.5F, -2F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 114
		bodyModel[57].setRotationPoint(-15F, 2F, -10.5F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[58].setRotationPoint(-15F, 1F, -10.5F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 78
		bodyModel[59].setRotationPoint(-14.75F, 2.5F, -10.25F);

		bodyModel[60].addBox(0F, 0F, 0F, 10, 14, 1, 0F); // Box 9
		bodyModel[60].setRotationPoint(-29F, -20F, 10F);

		bodyModel[61].addBox(0F, 0F, 0F, 10, 14, 1, 0F); // Box 10
		bodyModel[61].setRotationPoint(-28F, -20F, -11F);

		bodyModel[62].addBox(0F, 0F, 0F, 1, 14, 17, 0F); // Box 15
		bodyModel[62].setRotationPoint(-29F, -20F, -7F);

		bodyModel[63].addBox(0F, 0F, 0F, 1, 14, 17, 0F); // Box 21
		bodyModel[63].setRotationPoint(-19F, -20F, -10F);

		bodyModel[64].addBox(0F, 0F, 0F, 11, 6, 22, 0F); // Box 201
		bodyModel[64].setRotationPoint(-29F, -6F, -11F);

		bodyModel[65].addBox(-0.5F, 0F, -3.5F, 1, 14, 4, 0F); // Box 314 door swing right
		bodyModel[65].setRotationPoint(-18.5F, -20F, 10.5F);

		bodyModel[66].addBox(-0.5F, 0F, -0.5F, 1, 14, 4, 0F); // Box 315 door swing right
		bodyModel[66].setRotationPoint(-28.5F, -20F, -10.5F);

		bodyModel[67].addBox(0F, 0F, 0F, 19, 3, 22, 0F); // Box 489
		bodyModel[67].setRotationPoint(-8F, 3F, -11F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 19, 1, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 278
		bodyModel[68].setRotationPoint(-8F, 2F, -11F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 19, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 281
		bodyModel[69].setRotationPoint(-8F, 6F, -11F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 19, 3, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 288
		bodyModel[70].setRotationPoint(-8F, 6F, -9F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 19, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 315
		bodyModel[71].setRotationPoint(-8F, 2F, 7F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 19, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 316
		bodyModel[72].setRotationPoint(-8F, 6F, 9F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 303
		bodyModel[73].setRotationPoint(-44F, 0F, -7F);

		bodyModel[74].addBox(0F, 0F, 0F, 3, 1, 0, 0F); // Box 293
		bodyModel[74].setRotationPoint(-32F, -13F, -11F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[75].setRotationPoint(-29F, -22F, -11F);

		bodyModel[76].addBox(0F, 0F, 0F, 1, 2, 14, 0F); // Box 211
		bodyModel[76].setRotationPoint(-29F, -22F, -7F);

		bodyModel[77].addBox(0F, 0F, 0F, 1, 2, 14, 0F); // Box 219
		bodyModel[77].setRotationPoint(-19F, -22F, -7F);

		bodyModel[78].addBox(0F, 0F, 0F, 9, 1, 14, 0F); // Box 220
		bodyModel[78].setRotationPoint(-28F, -22F, -7F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 9, 2, 4, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 221
		bodyModel[79].setRotationPoint(-28F, -22F, -11F);

		bodyModel[80].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 19
		bodyModel[80].setRotationPoint(9F, 2F, -11.5F);
		bodyModel[80].rotateAngleX = 0.87266463F;

		bodyModel[81].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 334
		bodyModel[81].setRotationPoint(9F, 3.5F, 8.75F);
		bodyModel[81].rotateAngleX = 0.87266463F;

		bodyModel[82].addBox(0F, 0F, 0F, 5, 6, 5, 0F); // Box 305
		bodyModel[82].setRotationPoint(-18F, -6F, -11F);

		bodyModel[83].addBox(0F, 0F, 0F, 7, 8, 3, 0F); // Box 86
		bodyModel[83].setRotationPoint(-28.1F, -14F, -5F);
		bodyModel[83].rotateAngleY = -0.38397244F;

		bodyModel[84].addBox(0F, 0F, 0F, 1, 9, 10, 0F); // Box 87
		bodyModel[84].setRotationPoint(-28F, -15F, -4F);

		bodyModel[85].addBox(0F, 0F, 0F, 5, 2, 2, 0F); // Box 86
		bodyModel[85].setRotationPoint(-27F, -16F, -5F);
		bodyModel[85].rotateAngleY = -0.38397244F;

		bodyModel[86].addBox(0F, 0F, 0F, 0, 1, 1, 0F); // Box 510
		bodyModel[86].setRotationPoint(-41F, 6F, -11F);

		bodyModel[87].addBox(0F, 0F, 0F, 0, 1, 1, 0F); // Box 511
		bodyModel[87].setRotationPoint(-41F, 6F, 10F);

		bodyModel[88].addBox(0F, 0F, 0F, 0, 1, 1, 0F); // Box 512
		bodyModel[88].setRotationPoint(39F, 6F, 10F);

		bodyModel[89].addBox(0F, 0F, 0F, 0, 1, 1, 0F); // Box 513
		bodyModel[89].setRotationPoint(39F, 6F, -11F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 479 cull
		bodyModel[90].setRotationPoint(39F, 8F, -2F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 339 cull
		bodyModel[91].setRotationPoint(-43F, 8F, -2F);

		bodyModel[92].addBox(0F, 0F, 0F, 0, 4, 1, 0F); // Box 350
		bodyModel[92].setRotationPoint(-26.01F, -18F, -12F);

		bodyModel[93].addBox(0F, 0F, 0F, 0, 4, 1, 0F); // Box 351
		bodyModel[93].setRotationPoint(-26.01F, -18F, 11F);

		bodyModel[94].addBox(0F, 0F, 0F, 3, 1, 21, 0F); // Box 408
		bodyModel[94].setRotationPoint(21.5F, 1F, -10.5F);

		bodyModel[95].addBox(0F, 0F, 0F, 3, 1, 21, 0F); // Box 409
		bodyModel[95].setRotationPoint(-26.5F, 1F, -10.5F);

		bodyModel[96].addBox(0F, 0F, 0F, 70, 1, 4, 0F); // Box 515
		bodyModel[96].setRotationPoint(-36F, 0F, 7F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, -2F, 2F, 0F, -2F, 2F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 516
		bodyModel[97].setRotationPoint(-41.01F, -8F, -10F);
		bodyModel[97].rotateAngleY = -3.14159265F;

		bodyModel[98].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, -2F, 2F, 0F, -2F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 517
		bodyModel[98].setRotationPoint(-41.01F, -8F, 11F);
		bodyModel[98].rotateAngleY = -3.14159265F;

		bodyModel[99].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, -2F, 2F, 0F, -2F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 518
		bodyModel[99].setRotationPoint(39.01F, -8F, 11F);
		bodyModel[99].rotateAngleY = -3.14159265F;

		bodyModel[100].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, -2F, 2F, 0F, -2F, 2F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 519
		bodyModel[100].setRotationPoint(39.01F, -8F, -10F);
		bodyModel[100].rotateAngleY = -3.14159265F;

		bodyModel[101].addBox(0F, 0F, 0F, 1, 14, 4, 0F); // Box 409
		bodyModel[101].setRotationPoint(-38F, -14F, -5F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 412 Headlight F
		bodyModel[102].setRotationPoint(-31.75F, -22F, -2F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 413 Headlight F
		bodyModel[103].setRotationPoint(-31.75F, -22F, 0F);

		bodyModel[104].addBox(0F, 0F, 0F, 2, 2, 4, 0F); // Box 414
		bodyModel[104].setRotationPoint(-31F, -22F, -2F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 415
		bodyModel[105].setRotationPoint(-19F, -22F, -11F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 416
		bodyModel[106].setRotationPoint(-19F, -22F, 7F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 9, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 417
		bodyModel[107].setRotationPoint(-28F, -22F, 7F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 418
		bodyModel[108].setRotationPoint(-29F, -22F, 7F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 2, 0, 4, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 419
		bodyModel[109].setRotationPoint(-31F, -20F, -11F);

		bodyModel[110].addBox(0F, 0F, 0F, 2, 0, 14, 0F); // Box 420
		bodyModel[110].setRotationPoint(-31F, -22F, -7F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 2, 0, 4, 0F,0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 421
		bodyModel[111].setRotationPoint(-31F, -20F, 7F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 2, 2, 5, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 422
		bodyModel[112].setRotationPoint(-31F, -22F, -7F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 2, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 423
		bodyModel[113].setRotationPoint(-31F, -22F, 2F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 0, 2, 3, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 424 liverimg 2
		bodyModel[114].setRotationPoint(-30.25F, -22F, -6F);
		bodyModel[114].rotateAngleY = 0.19198622F;

		bodyModel[115].addShapeBox(0F, 0F, -3F, 0, 2, 3, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 425 liveryimg 2
		bodyModel[115].setRotationPoint(-30.25F, -22F, 6F);
		bodyModel[115].rotateAngleY = -0.19198622F;

		bodyModel[116].addBox(0F, 0F, 0F, 53, 15, 12, 0F); // Box 426
		bodyModel[116].setRotationPoint(-18F, -15F, -6F);

		bodyModel[117].addBox(0F, 0F, 0F, 0, 7, 2, 0F); // Box 428
		bodyModel[117].setRotationPoint(-36F, 0F, -11F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 0, 1, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 429
		bodyModel[118].setRotationPoint(-41.01F, 8F, -9F);

		bodyModel[119].addBox(0F, 0F, 0F, 2, 8, 0, 0F); // Box 430
		bodyModel[119].setRotationPoint(-43F, -8F, -7F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 363
		bodyModel[120].setRotationPoint(-41F, -7F, -8F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 433
		bodyModel[121].setRotationPoint(-44F, 0F, 0F);

		bodyModel[122].addBox(0F, 0F, 0F, 2, 1, 14, 0F); // Box 434
		bodyModel[122].setRotationPoint(-43F, 0F, -7F);

		bodyModel[123].addBox(0F, 0F, 0F, 2, 8, 0, 0F); // Box 435
		bodyModel[123].setRotationPoint(-43F, -8F, 7F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 436
		bodyModel[124].setRotationPoint(-41F, -7F, 7F);

		bodyModel[125].addBox(0F, 0F, 0F, 0, 1, 1, 0F); // Box 437
		bodyModel[125].setRotationPoint(-41F, -8F, 7F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 1, 14, 4, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 438
		bodyModel[126].setRotationPoint(-39F, -14F, -5F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 1, 14, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 439
		bodyModel[127].setRotationPoint(-39F, -14F, 1F);

		bodyModel[128].addBox(0F, 0F, 0F, 2, 0, 5, 0F); // Box 441
		bodyModel[128].setRotationPoint(-33.5F, -4F, -11F);

		bodyModel[129].addBox(0F, 0F, 0F, 2, 0, 5, 0F); // Box 444
		bodyModel[129].setRotationPoint(-34.5F, -3F, 6F);

		bodyModel[130].addBox(0F, 0F, 0F, 5, 14, 12, 0F); // Box 445
		bodyModel[130].setRotationPoint(-34F, -14F, -6F);

		bodyModel[131].addBox(0F, 0F, 0F, 2, 14, 10, 0F); // Box 43
		bodyModel[131].setRotationPoint(-36F, -14F, -5F);

		bodyModel[132].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 43
		bodyModel[132].setRotationPoint(-36F, -14F, -6F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
		bodyModel[133].setRotationPoint(-35.5F, -8.5F, -6F);

		bodyModel[134].addBox(0F, 0F, 0F, 0, 7, 1, 0F); // Box 43
		bodyModel[134].setRotationPoint(-35F, -6.5F, -6F);

		bodyModel[135].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 450
		bodyModel[135].setRotationPoint(-39F, -14F, -1F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 2, 9, 2, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 451
		bodyModel[136].setRotationPoint(-39F, -9F, -1F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 143 sandcap
		bodyModel[137].setRotationPoint(-39F, -9.5F, -1F);
		bodyModel[137].rotateAngleZ = 0.43633231F;

		bodyModel[138].addBox(0F, 0F, 0F, 1, 14, 4, 0F); // Box 453
		bodyModel[138].setRotationPoint(-38F, -14F, 1F);

		bodyModel[139].addBox(0F, 0F, 0F, 2, 1, 0, 0F); // Box 455
		bodyModel[139].setRotationPoint(-37F, -8F, 11F);

		bodyModel[140].addBox(0F, 0F, 0F, 1, 7, 0, 0F); // Box 456
		bodyModel[140].setRotationPoint(-36F, -7F, 11F);

		bodyModel[141].addBox(0F, 0F, 0F, 3, 1, 0, 0F); // Box 457
		bodyModel[141].setRotationPoint(-32F, -13F, 11F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 458
		bodyModel[142].setRotationPoint(-37F, -6F, 10.5F);

		bodyModel[143].addBox(0F, 0F, 0F, 0, 13, 2, 0F); // Box 459
		bodyModel[143].setRotationPoint(-37F, -8F, 9F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, -0.65F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.65F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 460
		bodyModel[144].setRotationPoint(-41F, 5F, 8F);

		bodyModel[145].addBox(0F, 0F, 0F, 5, 1, 0, 0F); // Box 461
		bodyModel[145].setRotationPoint(-41F, 6F, 9F);

		bodyModel[146].addBox(0F, 0F, 0F, 5, 0, 2, 0F); // Box 462
		bodyModel[146].setRotationPoint(-41F, 7F, 9F);

		bodyModel[147].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 463
		bodyModel[147].setRotationPoint(-41F, 4F, 8F);

		bodyModel[148].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 464
		bodyModel[148].setRotationPoint(-41F, 2F, 7F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 3, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.35F, 0F, 0F, 0F, 0F, 0F); // Box 465
		bodyModel[149].setRotationPoint(-41F, 0F, 7F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 2, 5, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 466
		bodyModel[150].setRotationPoint(-38F, 0F, 7F);

		bodyModel[151].addBox(0F, 0F, 0F, 0, 7, 2, 0F); // Box 467
		bodyModel[151].setRotationPoint(-36F, 0F, 9F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F); // Box 469
		bodyModel[152].setRotationPoint(-35F, -8F, 11F);

		bodyModel[153].addBox(0F, 0F, 0F, 3, 1, 0, 0F); // Box 470
		bodyModel[153].setRotationPoint(-18F, -13F, -11F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F); // Box 471
		bodyModel[154].setRotationPoint(-15F, -8F, -11F);

		bodyModel[155].addBox(0F, 0F, 0F, 3, 6, 5, 0F); // Box 472
		bodyModel[155].setRotationPoint(-18F, -6F, 6F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 2, 6, 0, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 473
		bodyModel[156].setRotationPoint(-15F, -6F, 11F);

		bodyModel[157].addBox(0F, 0F, 0F, 2, 0, 5, 0F); // Box 474
		bodyModel[157].setRotationPoint(-15F, -2F, 6F);

		bodyModel[158].addBox(0F, 0F, 0F, 2, 0, 5, 0F); // Box 475
		bodyModel[158].setRotationPoint(-15.5F, -4F, 6F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 476
		bodyModel[159].setRotationPoint(41F, 0F, 0F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 477
		bodyModel[160].setRotationPoint(41F, 0F, -7F);

		bodyModel[161].addBox(0F, 0F, 0F, 2, 1, 14, 0F); // Box 478
		bodyModel[161].setRotationPoint(39F, 0F, -7F);

		bodyModel[162].addBox(0F, 0F, 0F, 0, 8, 14, 0F); // Box 479
		bodyModel[162].setRotationPoint(41F, -8F, -7F);

		bodyModel[163].addBox(0F, 0F, 0F, 2, 8, 0, 0F); // Box 480
		bodyModel[163].setRotationPoint(39F, -8F, 7F);

		bodyModel[164].addBox(0F, 0F, 0F, 0, 1, 1, 0F); // Box 481
		bodyModel[164].setRotationPoint(39F, -8F, 7F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 482
		bodyModel[165].setRotationPoint(39F, -7F, 7F);

		bodyModel[166].addBox(0F, 0F, 0F, 2, 8, 0, 0F); // Box 483
		bodyModel[166].setRotationPoint(39F, -8F, -7F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 484
		bodyModel[167].setRotationPoint(39F, -7F, -8F);

		bodyModel[168].addBox(0F, 0F, 0F, 0, 1, 1, 0F); // Box 485
		bodyModel[168].setRotationPoint(39F, -8F, -8F);

		bodyModel[169].addBox(0F, 0F, 0F, 0, 7, 2, 0F); // Box 487
		bodyModel[169].setRotationPoint(34F, 0F, 9F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 2, 5, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 490
		bodyModel[170].setRotationPoint(34F, 0F, 7F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 2, 5, 3, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 498
		bodyModel[171].setRotationPoint(34F, 0F, -10F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 1, 14, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 501
		bodyModel[172].setRotationPoint(-38F, -14F, -6F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 1, 14, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 502
		bodyModel[173].setRotationPoint(-38F, -14F, 5F);

		bodyModel[174].addBox(0F, 0F, 0F, 1, 14, 12, 0F); // Box 503
		bodyModel[174].setRotationPoint(-37F, -14F, -6F);

		bodyModel[175].addShapeBox(0F, 0F, 0F, 1, 14, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 504
		bodyModel[175].setRotationPoint(36F, -14F, 1F);

		bodyModel[176].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 505
		bodyModel[176].setRotationPoint(35F, -14F, -1F);

		bodyModel[177].addShapeBox(0F, 0F, 0F, 1, 14, 4, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 506
		bodyModel[177].setRotationPoint(36F, -14F, -5F);

		bodyModel[178].addShapeBox(0F, 0F, 0F, 1, 14, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 507
		bodyModel[178].setRotationPoint(35F, -14F, -6F);

		bodyModel[179].addBox(0F, 0F, 0F, 1, 14, 4, 0F); // Box 508
		bodyModel[179].setRotationPoint(35F, -14F, -5F);

		bodyModel[180].addBox(0F, 0F, 0F, 1, 14, 4, 0F); // Box 509
		bodyModel[180].setRotationPoint(35F, -14F, 1F);

		bodyModel[181].addShapeBox(0F, 0F, 0F, 1, 14, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 510
		bodyModel[181].setRotationPoint(35F, -14F, 5F);

		bodyModel[182].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 511 sandcap
		bodyModel[182].setRotationPoint(37F, -9.5F, -1F);
		bodyModel[182].rotateAngleZ = -0.43633231F;

		bodyModel[183].addShapeBox(0F, 0F, 0F, 2, 9, 2, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 512
		bodyModel[183].setRotationPoint(35F, -9F, -1F);

		bodyModel[184].addShapeBox(0F, 0F, 0F, 55, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 513
		bodyModel[184].setRotationPoint(-18F, -16F, -5F);

		bodyModel[185].addBox(0F, 0F, 0F, 2, 1, 12, 0F); // Box 514
		bodyModel[185].setRotationPoint(35F, -15F, -6F);

		bodyModel[186].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 516
		bodyModel[186].setRotationPoint(37F, -15F, -6F);

		bodyModel[187].addShapeBox(0F, 0F, 0F, 1, 0, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 1F, 0F, -0.25F, 1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F, -0.25F, -1F, 0F); // Box 517
		bodyModel[187].setRotationPoint(37F, -15F, -6F);

		bodyModel[188].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 518
		bodyModel[188].setRotationPoint(37F, -15F, -6F);

		bodyModel[189].addBox(0F, 0F, 0F, 1, 0, 4, 0F); // Box 519
		bodyModel[189].setRotationPoint(38F, -16F, -2F);

		bodyModel[190].addShapeBox(0F, 0F, 0F, 1, 0, 3, 0F,0.75F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.75F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 520
		bodyModel[190].setRotationPoint(38F, -16F, -5F);

		bodyModel[191].addBox(0F, 0F, 0F, 0, 7, 2, 0F); // Box 522
		bodyModel[191].setRotationPoint(34F, 0F, -11F);

		bodyModel[192].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 523
		bodyModel[192].setRotationPoint(37F, -16F, -5F);

		bodyModel[193].addBox(0F, 0F, 0F, 2, 0, 14, 0F); // Box 524
		bodyModel[193].setRotationPoint(-18F, -22F, -7F);

		bodyModel[194].addShapeBox(0F, 0F, 0F, 2, 0, 4, 0F,0F, 0F, 0F, -2F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 525
		bodyModel[194].setRotationPoint(-18F, -20F, -11F);

		bodyModel[195].addShapeBox(0F, 0F, 0F, 2, 0, 4, 0F,0F, 2F, 0F, 0F, 2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 526
		bodyModel[195].setRotationPoint(-18F, -20F, 7F);

		bodyModel[196].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 527
		bodyModel[196].setRotationPoint(-18F, -22F, -6F);

		bodyModel[197].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, 0F, -1F, -1F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 516
		bodyModel[197].setRotationPoint(37F, -16F, -6F);

		bodyModel[198].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 516
		bodyModel[198].setRotationPoint(37F, -16F, 5F);

		bodyModel[199].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 230
		bodyModel[199].setRotationPoint(37F, -15F, 2F);

		bodyModel[200].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 231
		bodyModel[200].setRotationPoint(37F, -16F, 2F);

		bodyModel[201].addShapeBox(0F, 0F, 0F, 1, 0, 1, 0F,-0.25F, 1F, 0F, 0F, 1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.25F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 233
		bodyModel[201].setRotationPoint(37F, -15F, 5F);

		bodyModel[202].addShapeBox(0F, 0F, 0F, 1, 0, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0.75F, 0F, 0F); // Box 234
		bodyModel[202].setRotationPoint(38F, -16F, 2F);

		bodyModel[203].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 235
		bodyModel[203].setRotationPoint(37F, -15F, 6F);

		bodyModel[204].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 236 remove this if noselight
		bodyModel[204].setRotationPoint(-39F, -13F, -1F);

		bodyModel[205].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 412 Headlight F Nose
		bodyModel[205].setRotationPoint(-39.5F, -13F, -1F);

		bodyModel[206].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 412 Headlight F Nose
		bodyModel[206].setRotationPoint(-39.5F, -11F, -1F);

		bodyModel[207].addBox(0F, 0F, 0F, 2, 4, 2, 0F); // Box 239 nose light frame
		bodyModel[207].setRotationPoint(-38.5F, -13F, -1F);

		bodyModel[208].addBox(0F, 0F, 0F, 2, 10, 1, 0F); // Box 240
		bodyModel[208].setRotationPoint(-36F, -10F, 5F);

		bodyModel[209].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 241
		bodyModel[209].setRotationPoint(-36F, -14F, 5F);

		bodyModel[210].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 242
		bodyModel[210].setRotationPoint(-36F, -10F, -6F);

		bodyModel[211].addBox(0F, 0F, 0F, 2, 3, 1, 0F); // Box 243 nose light sand hatch cover
		bodyModel[211].setRotationPoint(-36F, -13F, -6F);

		bodyModel[212].addBox(0F, 0F, 0F, 2, 3, 1, 0F); // Box 244 nose light sand hatch cover
		bodyModel[212].setRotationPoint(-36F, -13F, 5F);

		bodyModel[213].addBox(0F, 0F, 0F, 3, 1, 0, 0F); // Box 249
		bodyModel[213].setRotationPoint(-18F, -13F, 11F);

		bodyModel[214].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F); // Box 250
		bodyModel[214].setRotationPoint(-15F, -8F, 11F);

		bodyModel[215].addBox(0F, 0F, 0F, 5, 4, 22, 0F); // Box 251
		bodyModel[215].setRotationPoint(-13F, 4F, -11F);

		bodyModel[216].addBox(0F, 0F, 0F, 1, 3, 0, 0F); // Box 252
		bodyModel[216].setRotationPoint(-13F, 1F, -11F);

		bodyModel[217].addBox(0F, 0F, 0F, 1, 3, 0, 0F); // Box 253
		bodyModel[217].setRotationPoint(-9F, 1F, -11F);

		bodyModel[218].addBox(0F, 0F, 0F, 1, 3, 0, 0F); // Box 254
		bodyModel[218].setRotationPoint(-9F, 1F, 11F);

		bodyModel[219].addBox(0F, 0F, 0F, 1, 3, 0, 0F); // Box 255
		bodyModel[219].setRotationPoint(-13F, 1F, 11F);

		bodyModel[220].addBox(0F, 0F, 0F, 2, 5, 2, 0F); // Box 256
		bodyModel[220].setRotationPoint(-9F, -21.5F, -1F);

		bodyModel[221].addBox(0F, 0F, 0F, 2, 5, 2, 0F); // Box 257
		bodyModel[221].setRotationPoint(21F, -21.5F, -1F);

		bodyModel[222].addBox(0F, 0F, 0F, 2, 5, 2, 0F); // Box 258
		bodyModel[222].setRotationPoint(6F, -21.5F, -1F);

		bodyModel[223].addBox(0F, 0F, 0F, 2, 1, 3, 0F); // Box 261
		bodyModel[223].setRotationPoint(-9F, -16.5F, -1.5F);

		bodyModel[224].addBox(0F, 0F, 0F, 2, 1, 3, 0F); // Box 262
		bodyModel[224].setRotationPoint(6F, -16.5F, -1.5F);

		bodyModel[225].addBox(0F, 0F, 0F, 2, 1, 3, 0F); // Box 263
		bodyModel[225].setRotationPoint(21F, -16.5F, -1.5F);

		bodyModel[226].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 264
		bodyModel[226].setRotationPoint(-6.5F, -16.5F, -2F);

		bodyModel[227].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 265
		bodyModel[227].setRotationPoint(8.5F, -16.5F, -2F);

		bodyModel[228].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 266
		bodyModel[228].setRotationPoint(23.5F, -16.5F, -2F);

		bodyModel[229].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 267
		bodyModel[229].setRotationPoint(38.5F, 1F, -6F);

		bodyModel[230].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 268
		bodyModel[230].setRotationPoint(38.5F, 1F, 4F);

		bodyModel[231].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 269 lamp ditchlight rear
		bodyModel[231].setRotationPoint(39.75F, 1F, -6F);

		bodyModel[232].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 270 lamp ditchlight rear
		bodyModel[232].setRotationPoint(39.75F, 1F, 4F);

		bodyModel[233].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 271
		bodyModel[233].setRotationPoint(-42.5F, 1F, -6F);

		bodyModel[234].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 272
		bodyModel[234].setRotationPoint(-42.5F, 1F, 4F);

		bodyModel[235].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 273 lamp ditchlight front
		bodyModel[235].setRotationPoint(-42.75F, 1F, 4F);

		bodyModel[236].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 274 lamp ditchlight front
		bodyModel[236].setRotationPoint(-42.75F, 1F, -6F);

		bodyModel[237].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 294
		bodyModel[237].setRotationPoint(36F, -17.5F, 0.5F);

		bodyModel[238].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 295
		bodyModel[238].setRotationPoint(36F, -17.5F, -0.5F);

		bodyModel[239].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 296
		bodyModel[239].setRotationPoint(36F, -17.5F, -1.5F);

		bodyModel[240].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 297
		bodyModel[240].setRotationPoint(36F, -16.5F, -0.5F);

		bodyModel[241].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F); // Box 279
		bodyModel[241].setRotationPoint(-34F, -12F, 5.75F);

		bodyModel[242].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0.5F, 0F, 0F, -1F, 0F, 0F, 1F, 1F, 0F, -1.5F, 1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F); // Box 280
		bodyModel[242].setRotationPoint(-44F, 5F, 2F);

		bodyModel[243].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F); // Box 281
		bodyModel[243].setRotationPoint(-44F, 6F, 0F);

		bodyModel[244].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,-1F, 0F, 0F, 0.5F, 0F, 0F, 3F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, -1F, -2.5F, 0F, -1F); // Box 282
		bodyModel[244].setRotationPoint(-45F, 7F, 0F);

		bodyModel[245].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,-3.5F, 0F, 0F, 3F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -2.5F, 0F, -1F, 2F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 283
		bodyModel[245].setRotationPoint(-45F, 7F, -10F);

		bodyModel[246].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,-2.5F, 0F, 0F, 2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 284
		bodyModel[246].setRotationPoint(-44F, 6F, -10F);

		bodyModel[247].addShapeBox(0F, 0F, -2F, 1, 1, 8, 0F,-1.5F, 1F, 0F, 1F, 1F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 285
		bodyModel[247].setRotationPoint(-44F, 5F, -8F);

		bodyModel[248].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F); // Box 286
		bodyModel[248].setRotationPoint(41F, 6F, 0F);

		bodyModel[249].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,0.5F, 0F, 0F, -1F, 0F, 0F, -3.5F, 0F, 0F, 3F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, -1F, 2F, 0F, -1F); // Box 287
		bodyModel[249].setRotationPoint(42F, 7F, 0F);

		bodyModel[250].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,3F, 0F, 0F, -3.5F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 2F, 0F, -1F, -2.5F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 288
		bodyModel[250].setRotationPoint(42F, 7F, -10F);

		bodyModel[251].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,2F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 289
		bodyModel[251].setRotationPoint(41F, 6F, -10F);

		bodyModel[252].addShapeBox(0F, 0F, -2F, 1, 1, 8, 0F,1F, 1F, 0F, -1.5F, 1F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 290
		bodyModel[252].setRotationPoint(41F, 5F, -8F);

		bodyModel[253].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,-1F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 1F, 0F, 1F, 1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F); // Box 291
		bodyModel[253].setRotationPoint(41F, 5F, 2F);

		bodyModel[254].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 292
		bodyModel[254].setRotationPoint(-31F, -23.5F, -0.5F);

		bodyModel[255].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 293
		bodyModel[255].setRotationPoint(-30F, -23.5F, -1.5F);

		bodyModel[256].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 294
		bodyModel[256].setRotationPoint(-29F, -22.5F, -0.5F);

		bodyModel[257].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 295
		bodyModel[257].setRotationPoint(-30F, -23.5F, 0.5F);

		bodyModel[258].addBox(0F, 0F, 0F, 6, 2, 4, 0F); // Box 361
		bodyModel[258].setRotationPoint(-25.5F, -23.5F, -5F);

		bodyModel[259].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 362
		bodyModel[259].setRotationPoint(-26.5F, -23.5F, -5F);

		bodyModel[260].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 363
		bodyModel[260].setRotationPoint(-26.5F, -22.5F, -5F);

		bodyModel[261].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 299
		bodyModel[261].setRotationPoint(-26.5F, -22.5F, 1F);

		bodyModel[262].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 300
		bodyModel[262].setRotationPoint(-26.5F, -23.5F, 1F);

		bodyModel[263].addBox(0F, 0F, 0F, 6, 2, 4, 0F); // Box 301
		bodyModel[263].setRotationPoint(-25.5F, -23.5F, 1F);

		bodyModel[264].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 372
		bodyModel[264].setRotationPoint(-30.5F, -23F, 6F);

		bodyModel[265].addShapeBox(0F, 0F, 0F, 1, 0, 12, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 307
		bodyModel[265].setRotationPoint(-32F, -22F, -6F);

		bodyModel[266].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 364 prime base
		bodyModel[266].setRotationPoint(-19.5F, -23F, 5F);

		bodyModel[267].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F); // Box 6 PRIME1-1
		bodyModel[267].setRotationPoint(-19.5F, -23.1F, 5F);

		bodyModel[268].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F); // Box 7 PRIME1-3
		bodyModel[268].setRotationPoint(-19.5F, -23.1F, 5F);

		bodyModel[269].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 8 PRIME1-2
		bodyModel[269].setRotationPoint(-19.5F, -23.1F, 5F);

		bodyModel[270].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 9 PRIME1-4
		bodyModel[270].setRotationPoint(-19.5F, -23.1F, 5F);

		bodyModel[271].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 313
		bodyModel[271].setRotationPoint(36F, -18.5F, 0F);

		bodyModel[272].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 314
		bodyModel[272].setRotationPoint(36F, -18.5F, -1F);

		bodyModel[273].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 78
		bodyModel[273].setRotationPoint(-43F, -3F, 4.5F);

		bodyModel[274].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 188
		bodyModel[274].setRotationPoint(-43F, -3F, -6.5F);

		bodyModel[275].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 189 ditchlight front
		bodyModel[275].setRotationPoint(-43.25F, -3F, 4.5F);

		bodyModel[276].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 190 ditchlight front
		bodyModel[276].setRotationPoint(-43.25F, -3F, -6.5F);

		bodyModel[277].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 239
		bodyModel[277].setRotationPoint(40F, -3F, -6.5F);

		bodyModel[278].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 240 ditchlight rear
		bodyModel[278].setRotationPoint(40.25F, -3F, -6.5F);

		bodyModel[279].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 241 ditchlight rear
		bodyModel[279].setRotationPoint(40.25F, -3F, 4.5F);

		bodyModel[280].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 242
		bodyModel[280].setRotationPoint(40F, -3F, 4.5F);

		bodyModel[281].addBox(0F, 0F, 0F, 4, 2, 4, 0F); // Box 369 cull
		bodyModel[281].setRotationPoint(-27.5F, -24F, -6F);

		bodyModel[282].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 372
		bodyModel[282].setRotationPoint(-27.5F, -25F, -4F);

		bodyModel[283].addShapeBox(0F, 0F, 0F, 0, 2, 3, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 424 liverimg 2
		bodyModel[283].setRotationPoint(38.03F, -16F, 2F);
		bodyModel[283].rotateAngleY = 0.2443461F;

		bodyModel[284].addShapeBox(0F, 0F, -3F, 0, 2, 3, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 425 liveryimg 2
		bodyModel[284].setRotationPoint(38.03F, -16F, -2F);
		bodyModel[284].rotateAngleY = -0.2443461F;

		bodyModel[285].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 327
		bodyModel[285].setRotationPoint(-26F, -23F, 8.5F);

		bodyModel[286].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 328
		bodyModel[286].setRotationPoint(-25F, -23F, 7.5F);

		bodyModel[287].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 329
		bodyModel[287].setRotationPoint(-24F, -23F, 9.5F);

		bodyModel[288].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 330
		bodyModel[288].setRotationPoint(-24F, -22F, 8.5F);

		bodyModel[289].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 364 prime base
		bodyModel[289].setRotationPoint(-30.5F, -23F, -1F);

		bodyModel[290].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F); // Box 6 PRIME2-1
		bodyModel[290].setRotationPoint(-30.5F, -23.5F, -1F);

		bodyModel[291].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F); // Box 7 PRIME2-3
		bodyModel[291].setRotationPoint(-30.5F, -23.5F, -1F);

		bodyModel[292].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 8 PRIME2-2
		bodyModel[292].setRotationPoint(-30.5F, -23.5F, -1F);

		bodyModel[293].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 9 PRIME2-4
		bodyModel[293].setRotationPoint(-30.5F, -23.5F, -1F);

		bodyModel[294].addBox(0F, 0F, 0F, 5, 0, 2, 0F); // Box 336
		bodyModel[294].setRotationPoint(34F, 7F, 9F);

		bodyModel[295].addBox(0F, 0F, 0F, 5, 1, 0, 0F); // Box 337
		bodyModel[295].setRotationPoint(34F, 6F, 9F);

		bodyModel[296].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,-0.65F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.65F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 338
		bodyModel[296].setRotationPoint(35F, 5F, 8F);

		bodyModel[297].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 339
		bodyModel[297].setRotationPoint(35F, 4F, 8F);

		bodyModel[298].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 340
		bodyModel[298].setRotationPoint(35F, 2F, 7F);

		bodyModel[299].addShapeBox(0F, 0F, 0F, 3, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.35F, 0F, 0F); // Box 341
		bodyModel[299].setRotationPoint(36F, 0F, 7F);

		bodyModel[300].addShapeBox(0F, 0F, 0F, 3, 0, 1, 0F,0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 342
		bodyModel[300].setRotationPoint(36F, 0F, -8F);

		bodyModel[301].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 343
		bodyModel[301].setRotationPoint(35F, 2F, -9F);

		bodyModel[302].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 344
		bodyModel[302].setRotationPoint(35F, 4F, -8F);

		bodyModel[303].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.65F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.65F, 0F, 0F); // Box 345
		bodyModel[303].setRotationPoint(35F, 5F, -10F);

		bodyModel[304].addBox(0F, 0F, 0F, 5, 1, 0, 0F); // Box 346
		bodyModel[304].setRotationPoint(34F, 6F, -9F);

		bodyModel[305].addBox(0F, 0F, 0F, 5, 0, 2, 0F); // Box 347
		bodyModel[305].setRotationPoint(34F, 7F, -11F);

		bodyModel[306].addBox(0F, 0F, 0F, 2, 3, 2, 0F); // Box 348
		bodyModel[306].setRotationPoint(-39F, -12F, -1F);

		bodyModel[307].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 162 commander beacon
		bodyModel[307].setRotationPoint(-26.97F, -24F, -7F);

		bodyModel[308].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0.3F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, 0.3F, -0.5F, 0.1F, 0.3F, 0F, 0.1F, -1F, 0F, 0.1F, -1F, 0F, 0.1F, 0.3F, 0F, 0.1F); // Box 165
		bodyModel[308].setRotationPoint(-26.82F, -23F, -7F);

		bodyModel[309].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 404 commander beacon
		bodyModel[309].setRotationPoint(-26.97F, -24F, 6F);

		bodyModel[310].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0.3F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, 0.3F, -0.5F, 0.1F, 0.3F, 0F, 0.1F, -1F, 0F, 0.1F, -1F, 0F, 0.1F, 0.3F, 0F, 0.1F); // Box 405
		bodyModel[310].setRotationPoint(-26.82F, -23F, 6F);

		bodyModel[311].addShapeBox(0F, 0F, 0F, 0, 1, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 353
		bodyModel[311].setRotationPoint(39.01F, 8F, -9F);

		bodyModel[312].addBox(0F, 0F, 0F, 2, 0, 5, 0F); // Box 355
		bodyModel[312].setRotationPoint(-14.5F, -4F, -11F);
	}
	ModelBapBlombergB theTrucks2 = new ModelBapBlombergB();
	ModelTypeB theTrucks3 = new ModelTypeB();

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		for (int i = 0; i < 313; i++) {
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

		if (entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor() == 2346||entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor() == 2341||entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor() == 154325341||entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor() == 3457||entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor() == 3458||entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor() == 3455) {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/blombergB_Grey.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.55, 0.15, 0);
			theTrucks2.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(3, 0, 0);
			theTrucks2.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else if (entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor() == 11) {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/blombergB_spooki_up_trash.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.55, 0.15, 0);
			theTrucks2.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(3, 0, 0);
			theTrucks2.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();

		} else if (entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor() == 13454||entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor() == 15345) {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/typeb_Black.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.55, 0.3, 0);
			theTrucks3.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(3.05, 0, 0);
			theTrucks3.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/blombergB_Black.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.55, 0.15, 0);
			theTrucks2.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(3, 0, 0);
			theTrucks2.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		}
	}
}