//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2021 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 04.07.2021 - 07:20:07
// Last changed on: 04.07.2021 - 07:20:07

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

public class ModelF7B extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 256;

	public ModelF7B() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[225];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 292, 77, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 274, 160, textureX, textureY); // Box 1
		bodyModel[2] = new ModelRendererTurbo(this, 176, 128, textureX, textureY); // Box 0
		bodyModel[3] = new ModelRendererTurbo(this, 342, 128, textureX, textureY); // Box 0
		bodyModel[4] = new ModelRendererTurbo(this, 290, 158, textureX, textureY); // Box 1
		bodyModel[5] = new ModelRendererTurbo(this, 267, 146, textureX, textureY); // Box 1
		bodyModel[6] = new ModelRendererTurbo(this, 268, 146, textureX, textureY); // Box 1
		bodyModel[7] = new ModelRendererTurbo(this, 290, 146, textureX, textureY); // Box 1
		bodyModel[8] = new ModelRendererTurbo(this, 267, 109, textureX, textureY); // Box 0
		bodyModel[9] = new ModelRendererTurbo(this, 142, 23, textureX, textureY); // Box 0
		bodyModel[10] = new ModelRendererTurbo(this, 140, 15, textureX, textureY); // Box 0
		bodyModel[11] = new ModelRendererTurbo(this, 142, 9, textureX, textureY); // Box 0
		bodyModel[12] = new ModelRendererTurbo(this, 143, 29, textureX, textureY); // Box 0
		bodyModel[13] = new ModelRendererTurbo(this, 143, 4, textureX, textureY); // Box 0
		bodyModel[14] = new ModelRendererTurbo(this, 145, 34, textureX, textureY); // Box 0
		bodyModel[15] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 0
		bodyModel[16] = new ModelRendererTurbo(this, 256, 110, textureX, textureY); // Box 0
		bodyModel[17] = new ModelRendererTurbo(this, 264, 102, textureX, textureY); // Box 0
		bodyModel[18] = new ModelRendererTurbo(this, 261, 118, textureX, textureY); // Box 0
		bodyModel[19] = new ModelRendererTurbo(this, 273, 118, textureX, textureY); // Box 0
		bodyModel[20] = new ModelRendererTurbo(this, 259, 112, textureX, textureY); // Box 0
		bodyModel[21] = new ModelRendererTurbo(this, 273, 112, textureX, textureY); // Box 0
		bodyModel[22] = new ModelRendererTurbo(this, 256, 13, textureX, textureY); // Box 0
		bodyModel[23] = new ModelRendererTurbo(this, 275, 13, textureX, textureY); // Box 0
		bodyModel[24] = new ModelRendererTurbo(this, 288, 15, textureX, textureY); // Box 0
		bodyModel[25] = new ModelRendererTurbo(this, 301, 13, textureX, textureY); // Box 0
		bodyModel[26] = new ModelRendererTurbo(this, 314, 15, textureX, textureY); // Box 0
		bodyModel[27] = new ModelRendererTurbo(this, 315, 202, textureX, textureY); // Box 42
		bodyModel[28] = new ModelRendererTurbo(this, 300, 206, textureX, textureY); // Box 44
		bodyModel[29] = new ModelRendererTurbo(this, 255, 201, textureX, textureY); // Box 45
		bodyModel[30] = new ModelRendererTurbo(this, 255, 178, textureX, textureY); // Box 46
		bodyModel[31] = new ModelRendererTurbo(this, 227, 176, textureX, textureY); // Box 48
		bodyModel[32] = new ModelRendererTurbo(this, 255, 205, textureX, textureY); // Box 50
		bodyModel[33] = new ModelRendererTurbo(this, 319, 181, textureX, textureY); // Box 324
		bodyModel[34] = new ModelRendererTurbo(this, 300, 200, textureX, textureY); // Box 325
		bodyModel[35] = new ModelRendererTurbo(this, 297, 217, textureX, textureY); // Box 123
		bodyModel[36] = new ModelRendererTurbo(this, 288, 217, textureX, textureY); // Box 254
		bodyModel[37] = new ModelRendererTurbo(this, 297, 212, textureX, textureY); // Box 255
		bodyModel[38] = new ModelRendererTurbo(this, 288, 212, textureX, textureY); // Box 136
		bodyModel[39] = new ModelRendererTurbo(this, 324, 212, textureX, textureY); // Box 137
		bodyModel[40] = new ModelRendererTurbo(this, 324, 217, textureX, textureY); // Box 138
		bodyModel[41] = new ModelRendererTurbo(this, 225, 197, textureX, textureY); // Box 139
		bodyModel[42] = new ModelRendererTurbo(this, 324, 207, textureX, textureY); // Box 140
		bodyModel[43] = new ModelRendererTurbo(this, 288, 207, textureX, textureY); // Box 141
		bodyModel[44] = new ModelRendererTurbo(this, 177, 146, textureX, textureY); // Box 152
		bodyModel[45] = new ModelRendererTurbo(this, 177, 146, textureX, textureY); // Box 153
		bodyModel[46] = new ModelRendererTurbo(this, 398, 146, textureX, textureY); // Box 154
		bodyModel[47] = new ModelRendererTurbo(this, 398, 146, textureX, textureY); // Box 155
		bodyModel[48] = new ModelRendererTurbo(this, 167, 151, textureX, textureY); // Box 156
		bodyModel[49] = new ModelRendererTurbo(this, 401, 151, textureX, textureY); // Box 157
		bodyModel[50] = new ModelRendererTurbo(this, 160, 151, textureX, textureY); // Box 160
		bodyModel[51] = new ModelRendererTurbo(this, 410, 151, textureX, textureY); // Box 161
		bodyModel[52] = new ModelRendererTurbo(this, 153, 40, textureX, textureY); // Box 301
		bodyModel[53] = new ModelRendererTurbo(this, 157, 43, textureX, textureY); // Box 302
		bodyModel[54] = new ModelRendererTurbo(this, 188, 147, textureX, textureY); // Box 177
		bodyModel[55] = new ModelRendererTurbo(this, 188, 147, textureX, textureY); // Box 178
		bodyModel[56] = new ModelRendererTurbo(this, 395, 146, textureX, textureY); // Box 179
		bodyModel[57] = new ModelRendererTurbo(this, 395, 146, textureX, textureY); // Box 180
		bodyModel[58] = new ModelRendererTurbo(this, 146, 40, textureX, textureY); // Box 348 commander beacon
		bodyModel[59] = new ModelRendererTurbo(this, 145, 43, textureX, textureY); // Box 349
		bodyModel[60] = new ModelRendererTurbo(this, 256, 21, textureX, textureY); // Box 186
		bodyModel[61] = new ModelRendererTurbo(this, 250, 6, textureX, textureY); // Box 187
		bodyModel[62] = new ModelRendererTurbo(this, 250, 2, textureX, textureY); // Box 188
		bodyModel[63] = new ModelRendererTurbo(this, 236, 151, textureX, textureY); // Box 189
		bodyModel[64] = new ModelRendererTurbo(this, 332, 151, textureX, textureY); // Box 190
		bodyModel[65] = new ModelRendererTurbo(this, 325, 151, textureX, textureY); // Box 191
		bodyModel[66] = new ModelRendererTurbo(this, 245, 151, textureX, textureY); // Box 192
		bodyModel[67] = new ModelRendererTurbo(this, 177, 119, textureX, textureY); // Box 196
		bodyModel[68] = new ModelRendererTurbo(this, 322, 119, textureX, textureY); // Box 197
		bodyModel[69] = new ModelRendererTurbo(this, 191, 147, textureX, textureY); // Box 198
		bodyModel[70] = new ModelRendererTurbo(this, 191, 147, textureX, textureY); // Box 199
		bodyModel[71] = new ModelRendererTurbo(this, 392, 146, textureX, textureY); // Box 200
		bodyModel[72] = new ModelRendererTurbo(this, 392, 146, textureX, textureY); // Box 201
		bodyModel[73] = new ModelRendererTurbo(this, 253, 4, textureX, textureY); // Box 202
		bodyModel[74] = new ModelRendererTurbo(this, 264, 4, textureX, textureY); // Box 203
		bodyModel[75] = new ModelRendererTurbo(this, 413, 60, textureX, textureY); // Box 314
		bodyModel[76] = new ModelRendererTurbo(this, 420, 60, textureX, textureY); // Box 316
		bodyModel[77] = new ModelRendererTurbo(this, 444, 68, textureX, textureY); // Box 131
		bodyModel[78] = new ModelRendererTurbo(this, 447, 70, textureX, textureY); // Box 131
		bodyModel[79] = new ModelRendererTurbo(this, 462, 87, textureX, textureY); // Box 131
		bodyModel[80] = new ModelRendererTurbo(this, 467, 85, textureX, textureY); // Box 131
		bodyModel[81] = new ModelRendererTurbo(this, 476, 87, textureX, textureY); // Box 131
		bodyModel[82] = new ModelRendererTurbo(this, 461, 82, textureX, textureY); // Box 131
		bodyModel[83] = new ModelRendererTurbo(this, 462, 74, textureX, textureY); // Box 131
		bodyModel[84] = new ModelRendererTurbo(this, 273, 2, textureX, textureY); // Box 231
		bodyModel[85] = new ModelRendererTurbo(this, 384, 69, textureX, textureY); // Box 247 headlight rear left
		bodyModel[86] = new ModelRendererTurbo(this, 312, 143, textureX, textureY); // Box 222
		bodyModel[87] = new ModelRendererTurbo(this, 301, 143, textureX, textureY); // Box 223
		bodyModel[88] = new ModelRendererTurbo(this, 270, 201, textureX, textureY); // Box 438
		bodyModel[89] = new ModelRendererTurbo(this, 270, 201, textureX, textureY); // Box 439
		bodyModel[90] = new ModelRendererTurbo(this, 83, 137, textureX, textureY); // Box 336
		bodyModel[91] = new ModelRendererTurbo(this, 87, 132, textureX, textureY); // Box 337 ane 2 beam
		bodyModel[92] = new ModelRendererTurbo(this, 87, 132, textureX, textureY); // Box 338 ane 2 beam
		bodyModel[93] = new ModelRendererTurbo(this, 193, 56, textureX, textureY); // Box 114
		bodyModel[94] = new ModelRendererTurbo(this, 193, 53, textureX, textureY); // Box 74
		bodyModel[95] = new ModelRendererTurbo(this, 193, 59, textureX, textureY); // Box 78
		bodyModel[96] = new ModelRendererTurbo(this, 195, 59, textureX, textureY); // Box 245
		bodyModel[97] = new ModelRendererTurbo(this, 198, 54, textureX, textureY); // Box 257
		bodyModel[98] = new ModelRendererTurbo(this, 294, 99, textureX, textureY); // Box 441
		bodyModel[99] = new ModelRendererTurbo(this, 200, 103, textureX, textureY); // Box 329 door swing left cab
		bodyModel[100] = new ModelRendererTurbo(this, 341, 163, textureX, textureY); // Box 332 door swing right cab
		bodyModel[101] = new ModelRendererTurbo(this, 235, 135, textureX, textureY); // Box 329 door swing left hood
		bodyModel[102] = new ModelRendererTurbo(this, 331, 135, textureX, textureY); // Box 332 door swing right hood
		bodyModel[103] = new ModelRendererTurbo(this, 246, 128, textureX, textureY); // Box 333
		bodyModel[104] = new ModelRendererTurbo(this, 310, 128, textureX, textureY); // Box 334
		bodyModel[105] = new ModelRendererTurbo(this, 331, 128, textureX, textureY); // Box 335
		bodyModel[106] = new ModelRendererTurbo(this, 235, 128, textureX, textureY); // Box 336
		bodyModel[107] = new ModelRendererTurbo(this, 331, 148, textureX, textureY); // Box 337
		bodyModel[108] = new ModelRendererTurbo(this, 235, 148, textureX, textureY); // Box 338
		bodyModel[109] = new ModelRendererTurbo(this, 461, 78, textureX, textureY); // Box 360
		bodyModel[110] = new ModelRendererTurbo(this, 384, 64, textureX, textureY); // Box 418 headlight rear right
		bodyModel[111] = new ModelRendererTurbo(this, 392, 57, textureX, textureY); // Box 443
		bodyModel[112] = new ModelRendererTurbo(this, 397, 57, textureX, textureY); // Box 444
		bodyModel[113] = new ModelRendererTurbo(this, 409, 50, textureX, textureY); // Box 445
		bodyModel[114] = new ModelRendererTurbo(this, 363, 58, textureX, textureY); // Box 128
		bodyModel[115] = new ModelRendererTurbo(this, 371, 56, textureX, textureY); // Box 153
		bodyModel[116] = new ModelRendererTurbo(this, 371, 66, textureX, textureY); // Box 448
		bodyModel[117] = new ModelRendererTurbo(this, 292, 10, textureX, textureY); // Box 82 stack 1
		bodyModel[118] = new ModelRendererTurbo(this, 292, 10, textureX, textureY); // Box 85 stack 2
		bodyModel[119] = new ModelRendererTurbo(this, 402, 57, textureX, textureY); // Box 452 some door that magically vibes in the back
		bodyModel[120] = new ModelRendererTurbo(this, 379, 51, textureX, textureY); // Box 453
		bodyModel[121] = new ModelRendererTurbo(this, 379, 56, textureX, textureY); // Box 454
		bodyModel[122] = new ModelRendererTurbo(this, 360, 65, textureX, textureY); // Box 455
		bodyModel[123] = new ModelRendererTurbo(this, 289, 4, textureX, textureY); // Box 457
		bodyModel[124] = new ModelRendererTurbo(this, 289, 4, textureX, textureY); // Box 458
		bodyModel[125] = new ModelRendererTurbo(this, 94, 137, textureX, textureY); // Box 364 prime base
		bodyModel[126] = new ModelRendererTurbo(this, 94, 133, textureX, textureY); // Box 6 PRIME1-1
		bodyModel[127] = new ModelRendererTurbo(this, 94, 133, textureX, textureY); // Box 7 PRIME1-3
		bodyModel[128] = new ModelRendererTurbo(this, 94, 133, textureX, textureY); // Box 8 PRIME1-2
		bodyModel[129] = new ModelRendererTurbo(this, 94, 133, textureX, textureY); // Box 9 PRIME1-4
		bodyModel[130] = new ModelRendererTurbo(this, 314, 42, textureX, textureY); // Box 464
		bodyModel[131] = new ModelRendererTurbo(this, 161, 49, textureX, textureY); // Box 372
		bodyModel[132] = new ModelRendererTurbo(this, 141, 39, textureX, textureY); // Box 488
		bodyModel[133] = new ModelRendererTurbo(this, 417, 237, textureX, textureY); // Box 0
		bodyModel[134] = new ModelRendererTurbo(this, 417, 222, textureX, textureY); // Box 2
		bodyModel[135] = new ModelRendererTurbo(this, 417, 192, textureX, textureY); // Box 3
		bodyModel[136] = new ModelRendererTurbo(this, 417, 176, textureX, textureY); // Box 4
		bodyModel[137] = new ModelRendererTurbo(this, 425, 169, textureX, textureY); // Box 5
		bodyModel[138] = new ModelRendererTurbo(this, 425, 155, textureX, textureY); // Box 6
		bodyModel[139] = new ModelRendererTurbo(this, 396, 204, textureX, textureY); // Box 10
		bodyModel[140] = new ModelRendererTurbo(this, 407, 204, textureX, textureY); // Box 11
		bodyModel[141] = new ModelRendererTurbo(this, 385, 204, textureX, textureY); // Box 12
		bodyModel[142] = new ModelRendererTurbo(this, 394, 213, textureX, textureY); // Box 13
		bodyModel[143] = new ModelRendererTurbo(this, 381, 189, textureX, textureY); // Box 14
		bodyModel[144] = new ModelRendererTurbo(this, 417, 208, textureX, textureY); // Box 3
		bodyModel[145] = new ModelRendererTurbo(this, 377, 197, textureX, textureY); // Box 9
		bodyModel[146] = new ModelRendererTurbo(this, 397, 187, textureX, textureY); // Box 9
		bodyModel[147] = new ModelRendererTurbo(this, 377, 197, textureX, textureY); // Box 9
		bodyModel[148] = new ModelRendererTurbo(this, 377, 197, textureX, textureY); // Box 9
		bodyModel[149] = new ModelRendererTurbo(this, 377, 197, textureX, textureY); // Box 9
		bodyModel[150] = new ModelRendererTurbo(this, 392, 182, textureX, textureY); // Box 21
		bodyModel[151] = new ModelRendererTurbo(this, 393, 202, textureX, textureY); // Box 0
		bodyModel[152] = new ModelRendererTurbo(this, 393, 202, textureX, textureY); // Box 0
		bodyModel[153] = new ModelRendererTurbo(this, 366, 156, textureX, textureY); // Box 13
		bodyModel[154] = new ModelRendererTurbo(this, 370, 210, textureX, textureY); // Box 10
		bodyModel[155] = new ModelRendererTurbo(this, 370, 210, textureX, textureY); // Box 10
		bodyModel[156] = new ModelRendererTurbo(this, 425, 162, textureX, textureY); // Box 7
		bodyModel[157] = new ModelRendererTurbo(this, 379, 236, textureX, textureY); // Box 110
		bodyModel[158] = new ModelRendererTurbo(this, 369, 230, textureX, textureY); // Box 111
		bodyModel[159] = new ModelRendererTurbo(this, 384, 229, textureX, textureY); // Box 112
		bodyModel[160] = new ModelRendererTurbo(this, 401, 230, textureX, textureY); // Box 113
		bodyModel[161] = new ModelRendererTurbo(this, 401, 249, textureX, textureY); // Box 114
		bodyModel[162] = new ModelRendererTurbo(this, 384, 248, textureX, textureY); // Box 115 it was the best of times, it was the blurst of times
		bodyModel[163] = new ModelRendererTurbo(this, 369, 249, textureX, textureY); // Box 116
		bodyModel[164] = new ModelRendererTurbo(this, 407, 239, textureX, textureY); // Box 522
		bodyModel[165] = new ModelRendererTurbo(this, 374, 222, textureX, textureY); // Box 523
		bodyModel[166] = new ModelRendererTurbo(this, 385, 225, textureX, textureY); // Box 255
		bodyModel[167] = new ModelRendererTurbo(this, 385, 221, textureX, textureY); // Box 256
		bodyModel[168] = new ModelRendererTurbo(this, 274, 160, textureX, textureY); // Box 397
		bodyModel[169] = new ModelRendererTurbo(this, 290, 158, textureX, textureY); // Box 398
		bodyModel[170] = new ModelRendererTurbo(this, 290, 146, textureX, textureY); // Box 399
		bodyModel[171] = new ModelRendererTurbo(this, 268, 146, textureX, textureY); // Box 400
		bodyModel[172] = new ModelRendererTurbo(this, 267, 146, textureX, textureY); // Box 401
		bodyModel[173] = new ModelRendererTurbo(this, 249, 64, textureX, textureY); // Box 402
		bodyModel[174] = new ModelRendererTurbo(this, 238, 66, textureX, textureY); // Box 403
		bodyModel[175] = new ModelRendererTurbo(this, 246, 58, textureX, textureY); // Box 404
		bodyModel[176] = new ModelRendererTurbo(this, 255, 68, textureX, textureY); // Box 405
		bodyModel[177] = new ModelRendererTurbo(this, 255, 74, textureX, textureY); // Box 406
		bodyModel[178] = new ModelRendererTurbo(this, 241, 68, textureX, textureY); // Box 407
		bodyModel[179] = new ModelRendererTurbo(this, 243, 74, textureX, textureY); // Box 408
		bodyModel[180] = new ModelRendererTurbo(this, 413, 60, textureX, textureY); // Box 409
		bodyModel[181] = new ModelRendererTurbo(this, 420, 60, textureX, textureY); // Box 410
		bodyModel[182] = new ModelRendererTurbo(this, 409, 50, textureX, textureY); // Box 411
		bodyModel[183] = new ModelRendererTurbo(this, 371, 66, textureX, textureY); // Box 412
		bodyModel[184] = new ModelRendererTurbo(this, 379, 51, textureX, textureY); // Box 413
		bodyModel[185] = new ModelRendererTurbo(this, 379, 56, textureX, textureY); // Box 414
		bodyModel[186] = new ModelRendererTurbo(this, 363, 58, textureX, textureY); // Box 415
		bodyModel[187] = new ModelRendererTurbo(this, 371, 56, textureX, textureY); // Box 416
		bodyModel[188] = new ModelRendererTurbo(this, 392, 57, textureX, textureY); // Box 417
		bodyModel[189] = new ModelRendererTurbo(this, 397, 57, textureX, textureY); // Box 418
		bodyModel[190] = new ModelRendererTurbo(this, 360, 65, textureX, textureY); // Box 419
		bodyModel[191] = new ModelRendererTurbo(this, 402, 38, textureX, textureY); // Box 420
		bodyModel[192] = new ModelRendererTurbo(this, 211, 100, textureX, textureY); // Box 421
		bodyModel[193] = new ModelRendererTurbo(this, 297, 170, textureX, textureY); // Box 422
		bodyModel[194] = new ModelRendererTurbo(this, 200, 116, textureX, textureY); // Box 423
		bodyModel[195] = new ModelRendererTurbo(this, 200, 96, textureX, textureY); // Box 424
		bodyModel[196] = new ModelRendererTurbo(this, 341, 176, textureX, textureY); // Box 425
		bodyModel[197] = new ModelRendererTurbo(this, 341, 156, textureX, textureY); // Box 426
		bodyModel[198] = new ModelRendererTurbo(this, 177, 100, textureX, textureY); // Box 427
		bodyModel[199] = new ModelRendererTurbo(this, 318, 160, textureX, textureY); // Box 428
		bodyModel[200] = new ModelRendererTurbo(this, 191, 147, textureX, textureY); // Box 429
		bodyModel[201] = new ModelRendererTurbo(this, 191, 147, textureX, textureY); // Box 430
		bodyModel[202] = new ModelRendererTurbo(this, 392, 146, textureX, textureY); // Box 431
		bodyModel[203] = new ModelRendererTurbo(this, 392, 146, textureX, textureY); // Box 432
		bodyModel[204] = new ModelRendererTurbo(this, 312, 143, textureX, textureY); // Box 433
		bodyModel[205] = new ModelRendererTurbo(this, 301, 143, textureX, textureY); // Box 434
		bodyModel[206] = new ModelRendererTurbo(this, 395, 52, textureX, textureY); // Box 435 headlight front left
		bodyModel[207] = new ModelRendererTurbo(this, 395, 47, textureX, textureY); // Box 436 headlight front right
		bodyModel[208] = new ModelRendererTurbo(this, 97, 15, textureX, textureY); // Box 437
		bodyModel[209] = new ModelRendererTurbo(this, 99, 23, textureX, textureY); // Box 438
		bodyModel[210] = new ModelRendererTurbo(this, 100, 29, textureX, textureY); // Box 439
		bodyModel[211] = new ModelRendererTurbo(this, 102, 34, textureX, textureY); // Box 440
		bodyModel[212] = new ModelRendererTurbo(this, 99, 9, textureX, textureY); // Box 441
		bodyModel[213] = new ModelRendererTurbo(this, 100, 4, textureX, textureY); // Box 442
		bodyModel[214] = new ModelRendererTurbo(this, 102, 1, textureX, textureY); // Box 443
		bodyModel[215] = new ModelRendererTurbo(this, 253, 4, textureX, textureY); // Box 444
		bodyModel[216] = new ModelRendererTurbo(this, 264, 4, textureX, textureY); // Box 445
		bodyModel[217] = new ModelRendererTurbo(this, 273, 2, textureX, textureY); // Box 446
		bodyModel[218] = new ModelRendererTurbo(this, 99, 138, textureX, textureY); // Box 447
		bodyModel[219] = new ModelRendererTurbo(this, 104, 135, textureX, textureY); // Box 448
		bodyModel[220] = new ModelRendererTurbo(this, 177, 161, textureX, textureY); // Box 449
		bodyModel[221] = new ModelRendererTurbo(this, 177, 170, textureX, textureY); // Box 450
		bodyModel[222] = new ModelRendererTurbo(this, 354, 99, textureX, textureY); // Box 451
		bodyModel[223] = new ModelRendererTurbo(this, 344, 77, textureX, textureY); // Box 452
		bodyModel[224] = new ModelRendererTurbo(this, 275, 21, textureX, textureY); // Box 398

		bodyModel[0].addBox(0F, 0F, 0F, 57, 1, 20, 0F); // Box 0
		bodyModel[0].setRotationPoint(-25.5F, 0F, -10F);

		bodyModel[1].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 1
		bodyModel[1].setRotationPoint(32.5F, 3F, -1.5F);

		bodyModel[2].addBox(0F, 0F, 0F, 28, 17, 1, 0F); // Box 0
		bodyModel[2].setRotationPoint(-8.5F, -15F, -11F);

		bodyModel[3].addBox(0F, 0F, 0F, 28, 17, 1, 0F); // Box 0
		bodyModel[3].setRotationPoint(-8.5F, -15F, 10F);

		bodyModel[4].addBox(0F, 0F, 0F, 1, 3, 4, 0F); // Box 1
		bodyModel[4].setRotationPoint(31.5F, 3F, -2F);

		bodyModel[5].addBox(0F, 0F, 0F, 1, 2, 20, 0F); // Box 1
		bodyModel[5].setRotationPoint(31.5F, 1F, -10F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 1, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[6].setRotationPoint(31.5F, 3F, -10F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 1, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F); // Box 1
		bodyModel[7].setRotationPoint(31.5F, 3F, 2F);

		bodyModel[8].addBox(0F, 0F, 0F, 1, 16, 20, 0F); // Box 0
		bodyModel[8].setRotationPoint(31.5F, -15F, -10F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 50, 1, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[9].setRotationPoint(-17.5F, -19F, -7F);

		bodyModel[10].addBox(0F, 0F, 0F, 50, 1, 6, 0F); // Box 0
		bodyModel[10].setRotationPoint(-17.5F, -19F, -3F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 50, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 0
		bodyModel[11].setRotationPoint(-17.5F, -19F, 3F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 50, 1, 3, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[12].setRotationPoint(-17.5F, -18F, -10F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 50, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F); // Box 0
		bodyModel[13].setRotationPoint(-17.5F, -18F, 7F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 50, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[14].setRotationPoint(-17.5F, -16F, -11F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 50, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[15].setRotationPoint(-17.5F, -16F, 10F);

		bodyModel[16].addBox(0F, 0F, 0F, 1, 2, 14, 0F); // Box 0
		bodyModel[16].setRotationPoint(31.5F, -17F, -7F);

		bodyModel[17].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Box 0
		bodyModel[17].setRotationPoint(31.5F, -18F, -3F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[18].setRotationPoint(31.5F, -17F, -10F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[19].setRotationPoint(31.5F, -17F, 7F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[20].setRotationPoint(31.5F, -18F, -7F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[21].setRotationPoint(31.5F, -18F, 3F);

		bodyModel[22].addBox(0F, 0F, 0F, 6, 1, 6, 0F); // Box 0
		bodyModel[22].setRotationPoint(-12.5F, -20F, -3F);

		bodyModel[23].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 0
		bodyModel[23].setRotationPoint(-5.5F, -20F, -2F);

		bodyModel[24].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 0
		bodyModel[24].setRotationPoint(0.5F, -20F, -2F);

		bodyModel[25].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 0
		bodyModel[25].setRotationPoint(5.5F, -20F, -2F);

		bodyModel[26].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 0
		bodyModel[26].setRotationPoint(11.5F, -20F, -2F);

		bodyModel[27].addBox(0F, 0F, 0F, 8, 4, 20, 0F); // Box 42
		bodyModel[27].setRotationPoint(-2F, 2F, -10F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 8, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -2F, 0F, -0.25F, -2F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 44
		bodyModel[28].setRotationPoint(-2F, 6F, -10F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 45
		bodyModel[29].setRotationPoint(-6F, 3.5F, -10.5F);

		bodyModel[30].addBox(0F, 0F, 0F, 4, 3, 19, 0F); // Box 46
		bodyModel[30].setRotationPoint(-6F, 3.5F, -9.5F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 4, 1, 19, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, 0.5F, -1F); // Box 48
		bodyModel[31].setRotationPoint(-6F, 6.5F, -9.5F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 50
		bodyModel[32].setRotationPoint(-6F, 3.5F, 9.5F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 8, 3, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 324
		bodyModel[33].setRotationPoint(-2F, 6F, -8F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 8, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -2F, 0F, -0.25F, -2F); // Box 325
		bodyModel[34].setRotationPoint(-2F, 6F, 8F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 12, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 123
		bodyModel[35].setRotationPoint(-6F, 2F, -11F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F); // Box 254
		bodyModel[36].setRotationPoint(-9F, 2F, -11F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 12, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 255
		bodyModel[37].setRotationPoint(-6F, 2F, 10F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F); // Box 136
		bodyModel[38].setRotationPoint(-9F, 2F, 10F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -0.5F, 0F); // Box 137
		bodyModel[39].setRotationPoint(6F, 2F, 10F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -0.5F, 0F); // Box 138
		bodyModel[40].setRotationPoint(6F, 2F, -11F);

		bodyModel[41].addBox(0F, 0F, 0F, 4, 2, 21, 0F); // Box 139
		bodyModel[41].setRotationPoint(-6F, 1.5F, -10.5F);

		bodyModel[42].addBox(0F, 0F, 0F, 3, 3, 1, 0F); // Box 140
		bodyModel[42].setRotationPoint(2F, 2F, -10.5F);

		bodyModel[43].addBox(0F, 0F, 0F, 3, 3, 1, 0F); // Box 141
		bodyModel[43].setRotationPoint(2F, 2F, 9.5F);

		bodyModel[44].addBox(0F, 0F, 0F, 0, 11, 1, 0F); // Box 152
		bodyModel[44].setRotationPoint(-18F, -9F, -11.75F);

		bodyModel[45].addBox(0F, 0F, 0F, 0, 11, 1, 0F); // Box 153
		bodyModel[45].setRotationPoint(-23F, -9F, -11.75F);

		bodyModel[46].addBox(0F, 0F, 0F, 0, 11, 1, 0F); // Box 154
		bodyModel[46].setRotationPoint(-23F, -9F, 10.75F);

		bodyModel[47].addBox(0F, 0F, 0F, 0, 11, 1, 0F); // Box 155
		bodyModel[47].setRotationPoint(-18F, -9F, 10.75F);

		bodyModel[48].addBox(0F, 0F, 0F, 4, 5, 0, 0F); // Box 156
		bodyModel[48].setRotationPoint(-22.5F, 2F, -11F);

		bodyModel[49].addBox(0F, 0F, 0F, 4, 5, 0, 0F); // Box 157
		bodyModel[49].setRotationPoint(-22.5F, 2F, 11F);

		bodyModel[50].addBox(0F, 0F, 0F, 3, 5, 0, 0F); // Box 160
		bodyModel[50].setRotationPoint(-30F, 2F, -11F);

		bodyModel[51].addBox(0F, 0F, 0F, 3, 5, 0, 0F); // Box 161
		bodyModel[51].setRotationPoint(-30F, 2F, 11F);

		bodyModel[52].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 301
		bodyModel[52].setRotationPoint(-31F, -20F, -7F);

		bodyModel[53].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 302
		bodyModel[53].setRotationPoint(-28F, -19F, -7F);

		bodyModel[54].addBox(0F, 0F, 0F, 0, 11, 1, 0F); // Box 177
		bodyModel[54].setRotationPoint(24F, -9F, -11.75F);

		bodyModel[55].addBox(0F, 0F, 0F, 0, 11, 1, 0F); // Box 178
		bodyModel[55].setRotationPoint(19F, -9F, -11.75F);

		bodyModel[56].addBox(0F, 0F, 0F, 0, 11, 1, 0F); // Box 179
		bodyModel[56].setRotationPoint(24F, -9F, 10.75F);

		bodyModel[57].addBox(0F, 0F, 0F, 0, 11, 1, 0F); // Box 180
		bodyModel[57].setRotationPoint(19F, -9F, 10.75F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 348 commander beacon
		bodyModel[58].setRotationPoint(-26F, -20F, -0.5F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0.1F, -0.5F, 0.1F, -0.9F, -0.5F, 0.1F, -0.9F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, 0F, 0.1F, -0.9F, 0F, 0.1F, -0.9F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 349
		bodyModel[59].setRotationPoint(-26F, -20F, -0.5F);

		bodyModel[60].addBox(0F, 0F, 0F, 6, 2, 6, 0F); // Box 186
		bodyModel[60].setRotationPoint(11.35F, -21F, -3F);

		bodyModel[61].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 187
		bodyModel[61].setRotationPoint(27F, -20F, -3F);

		bodyModel[62].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 188
		bodyModel[62].setRotationPoint(29F, -20F, 1F);

		bodyModel[63].addBox(0F, 0F, 0F, 4, 5, 0, 0F); // Box 189
		bodyModel[63].setRotationPoint(19.5F, 2F, -11F);

		bodyModel[64].addBox(0F, 0F, 0F, 4, 5, 0, 0F); // Box 190
		bodyModel[64].setRotationPoint(19.5F, 2F, 11F);

		bodyModel[65].addBox(0F, 0F, 0F, 3, 5, 0, 0F); // Box 191
		bodyModel[65].setRotationPoint(28F, 2F, 11F);

		bodyModel[66].addBox(0F, 0F, 0F, 3, 5, 0, 0F); // Box 192
		bodyModel[66].setRotationPoint(28F, 2F, -11F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 38, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F); // Box 196
		bodyModel[67].setRotationPoint(-7F, -14.5F, -11.25F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 38, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F); // Box 197
		bodyModel[68].setRotationPoint(-7F, -14.5F, 10.25F);

		bodyModel[69].addBox(0F, 0F, 0F, 0, 6, 1, 0F); // Box 198
		bodyModel[69].setRotationPoint(31F, -4F, -11.75F);

		bodyModel[70].addBox(0F, 0F, 0F, 0, 6, 1, 0F); // Box 199
		bodyModel[70].setRotationPoint(28F, -4F, -11.75F);

		bodyModel[71].addBox(0F, 0F, 0F, 0, 6, 1, 0F); // Box 200
		bodyModel[71].setRotationPoint(31F, -4F, 10.75F);

		bodyModel[72].addBox(0F, 0F, 0F, 0, 6, 1, 0F); // Box 201
		bodyModel[72].setRotationPoint(28F, -4F, 10.75F);

		bodyModel[73].addBox(0F, 0F, 0F, 2, 1, 6, 0F); // Box 202
		bodyModel[73].setRotationPoint(32.5F, -19F, -3F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, -1F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -2F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 203
		bodyModel[74].setRotationPoint(32.5F, -19F, -7F);

		bodyModel[75].addBox(0F, 0F, 0F, 2, 15, 1, 0F); // Box 314
		bodyModel[75].setRotationPoint(32.5F, -14F, -4F);

		bodyModel[76].addBox(0F, 0F, 0F, 2, 15, 1, 0F); // Box 316
		bodyModel[76].setRotationPoint(32.5F, -14F, 3F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F); // Box 131
		bodyModel[77].setRotationPoint(-27.5F, -7F, -3F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 2, 5, 2, 0F,-0.2F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0.5F, -0.2F, -0.1F, 0.5F, -0.2F, -0.1F, 0.5F, -0.2F, -0.2F, 0.5F, -0.2F); // Box 131
		bodyModel[78].setRotationPoint(-28F, -5F, -3.5F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 131
		bodyModel[79].setRotationPoint(-28F, -7F, -5F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 1, 7, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 131
		bodyModel[80].setRotationPoint(-29F, -7F, -6F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 131
		bodyModel[81].setRotationPoint(-30F, -7F, -5F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0.15F, -0.75F, -1F, -1F, -0.75F, 0.15F, 0.15F, -0.75F, -1F, -1F, -0.75F, 0.15F, 0.15F, 0F, -1F, -1F, 0F, 0.15F, 0.15F, 0F, -1F, -1F, 0F, 0.15F); // Box 131
		bodyModel[82].setRotationPoint(-29.5F, -9F, -5.5F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.5F, 0F, -1.25F, -1.5F, 0F, 0.25F, -0.25F, 0F, -1.25F, -1.25F, 0F, 0.25F, -0.5F, 0F, -1.25F, -1.5F, 0F, 0.25F, -0.25F, 0F, -1.25F, -1.25F, 0F, 0.25F); // Box 131
		bodyModel[83].setRotationPoint(-31F, -9F, -3.25F);
		bodyModel[83].rotateAngleY = -0.83775804F;

		bodyModel[84].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, -2F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 1F, 0F, 0F, 1F, 0F); // Box 231
		bodyModel[84].setRotationPoint(32.5F, -19F, 3F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 247 headlight rear left
		bodyModel[85].setRotationPoint(32F, -10.5F, -9F);

		bodyModel[86].addBox(0F, 0F, 0F, 0, 5, 5, 0F); // Box 222
		bodyModel[86].setRotationPoint(32.51F, 2F, -10F);

		bodyModel[87].addBox(0F, 0F, 0F, 0, 5, 5, 0F); // Box 223
		bodyModel[87].setRotationPoint(32.51F, 2F, 5F);

		bodyModel[88].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 438
		bodyModel[88].setRotationPoint(18F, 3F, -2F);

		bodyModel[89].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 439
		bodyModel[89].setRotationPoint(-21F, 3F, -2F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 3, 2, 4, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 336
		bodyModel[90].setRotationPoint(-31.5F, -21F, -2F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 337 ane 2 beam
		bodyModel[91].setRotationPoint(-32.25F, -21F, 0F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 338 ane 2 beam
		bodyModel[92].setRotationPoint(-32.25F, -21F, -2F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 114
		bodyModel[93].setRotationPoint(4.5F, -18.5F, 8.7F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[94].setRotationPoint(4.5F, -19.5F, 8.7F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 78
		bodyModel[95].setRotationPoint(4.75F, -18F, 8.95F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 245
		bodyModel[96].setRotationPoint(4.5F, -20.5F, 7.5F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 257
		bodyModel[97].setRotationPoint(4.5F, -19.5F, 6.5F);

		bodyModel[98].addBox(0F, 0F, 0F, 61, 2, 14, 0F); // Box 441
		bodyModel[98].setRotationPoint(-29.5F, 1F, -7F);

		bodyModel[99].addShapeBox(-3.5F, 0F, -0.5F, 4, 11, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 329 door swing left cab
		bodyModel[99].setRotationPoint(-19F, -10F, -10.5F);

		bodyModel[100].addShapeBox(-3.5F, 0F, -0.5F, 4, 11, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 332 door swing right cab
		bodyModel[100].setRotationPoint(-19F, -10F, 10.5F);

		bodyModel[101].addShapeBox(-3.5F, 0F, -0.5F, 4, 11, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 329 door swing left hood
		bodyModel[101].setRotationPoint(23F, -10F, -10.5F);

		bodyModel[102].addShapeBox(-3.5F, 0F, -0.5F, 4, 11, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 332 door swing right hood
		bodyModel[102].setRotationPoint(23F, -10F, 10.5F);

		bodyModel[103].addBox(0F, 0F, 0F, 9, 17, 1, 0F); // Box 333
		bodyModel[103].setRotationPoint(23.5F, -15F, -11F);

		bodyModel[104].addBox(0F, 0F, 0F, 9, 17, 1, 0F); // Box 334
		bodyModel[104].setRotationPoint(23.5F, -15F, 10F);

		bodyModel[105].addBox(0F, 0F, 0F, 4, 5, 1, 0F); // Box 335
		bodyModel[105].setRotationPoint(19.5F, -15F, 10F);

		bodyModel[106].addBox(0F, 0F, 0F, 4, 5, 1, 0F); // Box 336
		bodyModel[106].setRotationPoint(19.5F, -15F, -11F);

		bodyModel[107].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 337
		bodyModel[107].setRotationPoint(19.5F, 1F, 10F);

		bodyModel[108].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 338
		bodyModel[108].setRotationPoint(19.5F, 1F, -11F);

		bodyModel[109].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 360
		bodyModel[109].setRotationPoint(-31F, -6.3F, -5F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 418 headlight rear right
		bodyModel[110].setRotationPoint(32F, -10.5F, 7F);

		bodyModel[111].addBox(0F, 0F, 0F, 1, 17, 1, 0F); // Box 443
		bodyModel[111].setRotationPoint(33.5F, -15F, 4F);

		bodyModel[112].addBox(0F, 0F, 0F, 1, 17, 1, 0F); // Box 444
		bodyModel[112].setRotationPoint(33.5F, -15F, -5F);

		bodyModel[113].addBox(0F, 0F, 0F, 2, 1, 8, 0F); // Box 445
		bodyModel[113].setRotationPoint(32.5F, -15F, -4F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[114].setRotationPoint(33.5F, -16F, -5F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 153
		bodyModel[115].setRotationPoint(33.5F, -16F, 0F);

		bodyModel[116].addBox(0F, 0F, 0F, 2, 1, 8, 0F); // Box 448
		bodyModel[116].setRotationPoint(32.5F, 1F, -4F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F); // Box 82 stack 1
		bodyModel[117].setRotationPoint(-1F, -20.75F, -1F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F); // Box 85 stack 2
		bodyModel[118].setRotationPoint(10F, -20.75F, -1F);

		bodyModel[119].addBox(0F, 0F, 0F, 1, 14, 4, 0F); // Box 452 some door that magically vibes in the back
		bodyModel[119].setRotationPoint(32F, -13F, -2F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 453
		bodyModel[120].setRotationPoint(33.5F, -14F, 0F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 454
		bodyModel[121].setRotationPoint(33.5F, -14F, -3F);

		bodyModel[122].addBox(0F, 0F, 0F, 2, 1, 7, 0F); // Box 455
		bodyModel[122].setRotationPoint(32.5F, 2F, -3.5F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 457
		bodyModel[123].setRotationPoint(-1.5F, -21.75F, -2F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 458
		bodyModel[124].setRotationPoint(9.5F, -21.75F, -2F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 364 prime base
		bodyModel[125].setRotationPoint(-29.5F, -20F, 6F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F); // Box 6 PRIME1-1
		bodyModel[126].setRotationPoint(-29.5F, -20.5F, 6F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F); // Box 7 PRIME1-3
		bodyModel[127].setRotationPoint(-29.5F, -20.5F, 6F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 8 PRIME1-2
		bodyModel[128].setRotationPoint(-29.5F, -20.5F, 6F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 9 PRIME1-4
		bodyModel[129].setRotationPoint(-29.5F, -20.5F, 6F);

		bodyModel[130].addBox(0F, 0F, 0F, 2, 2, 10, 0F); // Box 464
		bodyModel[130].setRotationPoint(-18.5F, -20F, -5F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 372
		bodyModel[131].setRotationPoint(-24.5F, -20F, 0F);

		bodyModel[132].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 488
		bodyModel[132].setRotationPoint(-28F, -22F, -0.5F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 20, 3, 12, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 0
		bodyModel[133].setRotationPoint(-4.5F, -3F, -6F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 20, 2, 12, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F); // Box 2
		bodyModel[134].setRotationPoint(-4.5F, -5F, -6F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 20, 3, 12, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 3
		bodyModel[135].setRotationPoint(-4.5F, -9F, -6F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 20, 3, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 4
		bodyModel[136].setRotationPoint(-4.5F, -12F, -6F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 20, 2, 4, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		bodyModel[137].setRotationPoint(-4.5F, -14F, -6F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 20, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[138].setRotationPoint(-4.5F, -14F, 2F);

		bodyModel[139].addBox(0F, 0F, 0F, 1, 4, 4, 0F); // Box 10
		bodyModel[139].setRotationPoint(-5.5F, -16F, -2F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[140].setRotationPoint(-5.5F, -16F, -6F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		bodyModel[141].setRotationPoint(-5.5F, -16F, 2F);

		bodyModel[142].addBox(0F, 0F, 0F, 1, 9, 6, 0F); // Box 13
		bodyModel[142].setRotationPoint(-5.5F, -12F, -3F);

		bodyModel[143].addBox(0F, 0F, 0F, 2, 4, 3, 0F); // Box 14
		bodyModel[143].setRotationPoint(15.5F, -4F, -5F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 20, 1, 12, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 3
		bodyModel[144].setRotationPoint(-4.5F, -6F, -6F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 8, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 9
		bodyModel[145].setRotationPoint(-3.5F, -16F, -1.5F);

		bodyModel[146].addBox(0F, 0F, 0F, 1, 4, 8, 0F); // Box 9
		bodyModel[146].setRotationPoint(15.5F, -12F, -4F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 8, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 9
		bodyModel[147].setRotationPoint(6.5F, -16F, -1.5F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 8, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 9
		bodyModel[148].setRotationPoint(-3.5F, -15F, -1.5F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 8, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 9
		bodyModel[149].setRotationPoint(6.5F, -15F, -1.5F);

		bodyModel[150].addBox(0F, 0F, 0F, 1, 7, 5, 0F); // Box 21
		bodyModel[150].setRotationPoint(15.5F, -8F, -2F);

		bodyModel[151].addBox(0F, 0F, 0F, 1, 3, 2, 0F); // Box 0
		bodyModel[151].setRotationPoint(-1F, -18F, -1F);

		bodyModel[152].addBox(0F, 0F, 0F, 1, 3, 2, 0F); // Box 0
		bodyModel[152].setRotationPoint(10F, -18F, -1F);

		bodyModel[153].addBox(0F, 0F, 0F, 3, 18, 12, 0F); // Box 13
		bodyModel[153].setRotationPoint(-16.5F, -18F, -6F);

		bodyModel[154].addBox(0F, 0F, 0F, 5, 3, 3, 0F); // Box 10
		bodyModel[154].setRotationPoint(-10.5F, -15F, 3F);

		bodyModel[155].addBox(0F, 0F, 0F, 5, 3, 3, 0F); // Box 10
		bodyModel[155].setRotationPoint(-10.5F, -15F, -6F);

		bodyModel[156].addBox(0F, 0F, 0F, 20, 2, 4, 0F); // Box 7
		bodyModel[156].setRotationPoint(-4.5F, -14F, -2F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 5, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 110
		bodyModel[157].setRotationPoint(-9.5F, -5.5F, -4F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 5, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Box 111
		bodyModel[158].setRotationPoint(-9.5F, -8F, 1.5F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 5, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 112
		bodyModel[159].setRotationPoint(-9.5F, -8F, -1.5F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 5, 3, 2, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 113
		bodyModel[160].setRotationPoint(-9.5F, -8F, -3.5F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 5, 3, 2, 0F,0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 114
		bodyModel[161].setRotationPoint(-9.5F, -3F, -3.5F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 5, 3, 3, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 115 it was the best of times, it was the blurst of times
		bodyModel[162].setRotationPoint(-9.5F, -3F, -1.5F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 5, 3, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 116
		bodyModel[163].setRotationPoint(-9.5F, -3F, 1.5F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 3, 5, 3, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 522
		bodyModel[164].setRotationPoint(-13.5F, -5F, -1.5F);

		bodyModel[165].addBox(0F, 0F, 0F, 2, 3, 3, 0F); // Box 523
		bodyModel[165].setRotationPoint(-9.5F, -11F, -1.5F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 255
		bodyModel[166].setRotationPoint(-7.5F, -9.5F, -1F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 256
		bodyModel[167].setRotationPoint(-7.5F, -10.5F, -1F);

		bodyModel[168].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 397
		bodyModel[168].setRotationPoint(-34.5F, 3F, -1.5F);

		bodyModel[169].addBox(0F, 0F, 0F, 1, 3, 4, 0F); // Box 398
		bodyModel[169].setRotationPoint(-31.5F, 3F, -2F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 1, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F); // Box 399
		bodyModel[170].setRotationPoint(-31.5F, 3F, 2F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 1, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 400
		bodyModel[171].setRotationPoint(-31.5F, 3F, -10F);

		bodyModel[172].addBox(0F, 0F, 0F, 1, 2, 20, 0F); // Box 401
		bodyModel[172].setRotationPoint(-31.5F, 1F, -10F);

		bodyModel[173].addBox(0F, 0F, 0F, 1, 16, 20, 0F); // Box 402
		bodyModel[173].setRotationPoint(-31.5F, -15F, -10F);

		bodyModel[174].addBox(0F, 0F, 0F, 1, 2, 14, 0F); // Box 403
		bodyModel[174].setRotationPoint(-31.5F, -17F, -7F);

		bodyModel[175].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Box 404
		bodyModel[175].setRotationPoint(-31.5F, -18F, -3F);

		bodyModel[176].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 405
		bodyModel[176].setRotationPoint(-31.5F, -18F, -7F);

		bodyModel[177].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 406
		bodyModel[177].setRotationPoint(-31.5F, -17F, -10F);

		bodyModel[178].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 407
		bodyModel[178].setRotationPoint(-31.5F, -18F, 3F);

		bodyModel[179].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 408
		bodyModel[179].setRotationPoint(-31.5F, -17F, 7F);

		bodyModel[180].addBox(0F, 0F, 0F, 2, 15, 1, 0F); // Box 409
		bodyModel[180].setRotationPoint(-33.5F, -14F, -4F);

		bodyModel[181].addBox(0F, 0F, 0F, 2, 15, 1, 0F); // Box 410
		bodyModel[181].setRotationPoint(-33.5F, -14F, 3F);

		bodyModel[182].addBox(0F, 0F, 0F, 2, 1, 8, 0F); // Box 411
		bodyModel[182].setRotationPoint(-33.5F, -15F, -4F);

		bodyModel[183].addBox(0F, 0F, 0F, 2, 1, 8, 0F); // Box 412
		bodyModel[183].setRotationPoint(-33.5F, 1F, -4F);

		bodyModel[184].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 413
		bodyModel[184].setRotationPoint(-33.5F, -14F, 0F);

		bodyModel[185].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 414
		bodyModel[185].setRotationPoint(-33.5F, -14F, -3F);

		bodyModel[186].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 415
		bodyModel[186].setRotationPoint(-33.5F, -16F, -5F);

		bodyModel[187].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 416
		bodyModel[187].setRotationPoint(-33.5F, -16F, 0F);

		bodyModel[188].addBox(0F, 0F, 0F, 1, 17, 1, 0F); // Box 417
		bodyModel[188].setRotationPoint(-33.5F, -15F, 4F);

		bodyModel[189].addBox(0F, 0F, 0F, 1, 17, 1, 0F); // Box 418
		bodyModel[189].setRotationPoint(-33.5F, -15F, -5F);

		bodyModel[190].addBox(0F, 0F, 0F, 2, 1, 7, 0F); // Box 419
		bodyModel[190].setRotationPoint(-33.5F, 2F, -3.5F);

		bodyModel[191].addBox(0F, 0F, 0F, 1, 14, 4, 0F); // Box 420
		bodyModel[191].setRotationPoint(-32F, -13F, -2F);

		bodyModel[192].addBox(0F, 0F, 0F, 9, 17, 1, 0F); // Box 421
		bodyModel[192].setRotationPoint(-31.5F, -15F, -11F);

		bodyModel[193].addBox(0F, 0F, 0F, 9, 17, 1, 0F); // Box 422
		bodyModel[193].setRotationPoint(-31.5F, -15F, 10F);

		bodyModel[194].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 423
		bodyModel[194].setRotationPoint(-22.5F, 1F, -11F);

		bodyModel[195].addBox(0F, 0F, 0F, 4, 5, 1, 0F); // Box 424
		bodyModel[195].setRotationPoint(-22.5F, -15F, -11F);

		bodyModel[196].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 425
		bodyModel[196].setRotationPoint(-22.5F, 1F, 10F);

		bodyModel[197].addBox(0F, 0F, 0F, 4, 5, 1, 0F); // Box 426
		bodyModel[197].setRotationPoint(-22.5F, -15F, 10F);

		bodyModel[198].addBox(0F, 0F, 0F, 10, 17, 1, 0F); // Box 427
		bodyModel[198].setRotationPoint(-18.5F, -15F, -11F);

		bodyModel[199].addBox(0F, 0F, 0F, 10, 17, 1, 0F); // Box 428
		bodyModel[199].setRotationPoint(-18.5F, -15F, 10F);

		bodyModel[200].addBox(0F, 0F, 0F, 0, 6, 1, 0F); // Box 429
		bodyModel[200].setRotationPoint(-30F, -4F, -11.75F);

		bodyModel[201].addBox(0F, 0F, 0F, 0, 6, 1, 0F); // Box 430
		bodyModel[201].setRotationPoint(-27F, -4F, -11.75F);

		bodyModel[202].addBox(0F, 0F, 0F, 0, 6, 1, 0F); // Box 431
		bodyModel[202].setRotationPoint(-30F, -4F, 10.75F);

		bodyModel[203].addBox(0F, 0F, 0F, 0, 6, 1, 0F); // Box 432
		bodyModel[203].setRotationPoint(-27F, -4F, 10.75F);

		bodyModel[204].addBox(0F, 0F, 0F, 0, 5, 5, 0F); // Box 433
		bodyModel[204].setRotationPoint(-31.51F, 2F, -10F);

		bodyModel[205].addBox(0F, 0F, 0F, 0, 5, 5, 0F); // Box 434
		bodyModel[205].setRotationPoint(-31.51F, 2F, 5F);

		bodyModel[206].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 435 headlight front left
		bodyModel[206].setRotationPoint(-32F, -10.5F, -9F);

		bodyModel[207].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 436 headlight front right
		bodyModel[207].setRotationPoint(-32F, -10.5F, 7F);

		bodyModel[208].addBox(0F, 0F, 0F, 14, 1, 6, 0F); // Box 437
		bodyModel[208].setRotationPoint(-31.5F, -19F, -3F);

		bodyModel[209].addShapeBox(0F, 0F, 0F, 14, 1, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 438
		bodyModel[209].setRotationPoint(-31.5F, -19F, -7F);

		bodyModel[210].addShapeBox(0F, 0F, 0F, 14, 1, 3, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 439
		bodyModel[210].setRotationPoint(-31.5F, -18F, -10F);

		bodyModel[211].addShapeBox(0F, 0F, 0F, 14, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 440
		bodyModel[211].setRotationPoint(-31.5F, -16F, -11F);

		bodyModel[212].addShapeBox(0F, 0F, 0F, 14, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 441
		bodyModel[212].setRotationPoint(-31.5F, -19F, 3F);

		bodyModel[213].addShapeBox(0F, 0F, 0F, 14, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F); // Box 442
		bodyModel[213].setRotationPoint(-31.5F, -18F, 7F);

		bodyModel[214].addShapeBox(0F, 0F, 0F, 14, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 443
		bodyModel[214].setRotationPoint(-31.5F, -16F, 10F);

		bodyModel[215].addBox(0F, 0F, 0F, 2, 1, 6, 0F); // Box 444
		bodyModel[215].setRotationPoint(-33.5F, -19F, -3F);

		bodyModel[216].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,-2F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 445
		bodyModel[216].setRotationPoint(-33.5F, -19F, -7F);

		bodyModel[217].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -2F, 1F, 0F); // Box 446
		bodyModel[217].setRotationPoint(-33.5F, -19F, 3F);

		bodyModel[218].addBox(0F, 0F, 0F, 2, 0, 5, 0F); // Box 447
		bodyModel[218].setRotationPoint(-29.5F, -19F, 3F);

		bodyModel[219].addBox(0F, 0F, 0F, 2, 2, 0, 0F); // Box 448
		bodyModel[219].setRotationPoint(-29.5F, -19F, 8F);

		bodyModel[220].addShapeBox(0F, 0F, 0F, 23, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F); // Box 449
		bodyModel[220].setRotationPoint(-30F, -14.5F, -11.25F);

		bodyModel[221].addShapeBox(0F, 0F, 0F, 23, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F); // Box 450
		bodyModel[221].setRotationPoint(-30F, -14.5F, 10.25F);

		bodyModel[222].addBox(0F, 0F, 0F, 1, 2, 14, 0F); // Box 451
		bodyModel[222].setRotationPoint(-30.5F, 1F, -7F);

		bodyModel[223].addBox(0F, 0F, 0F, 5, 1, 20, 0F); // Box 452
		bodyModel[223].setRotationPoint(-30.5F, 0F, -10F);

		bodyModel[224].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 398
		bodyModel[224].setRotationPoint(-12.5F, -20F, -2F);
	}
	ModelBapBlombergB theTrucc = new ModelBapBlombergB();
	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		for (int i = 0; i < 225; i++) {
			if (bodyModel[i].boxName != null && bodyModel[i].boxName.contains("lamp")) {
				Minecraft.getMinecraft().entityRenderer.disableLightmap(1D);
				bodyModel[i].render(f5);
				Minecraft.getMinecraft().entityRenderer.enableLightmap(1D);
			} else {
				bodyModel[i].render(f5);
			}
		}

		if (entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor() == 3||entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor() == 11||entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor() == 1) {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/blombergB_Grey.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.1, 0.16, 0);
			theTrucc.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(2.2, 0, 0);
			theTrucc.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else if (entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor() == 8) {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/blombergb_SPgrey.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.1, 0.16, 0);
			theTrucc.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(2.2, 0, 0);
			theTrucc.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/blombergB_Black.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.1f, 0.16, 0);
			theTrucc.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(2.3, 0, 0);
			theTrucc.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		}

	}
}