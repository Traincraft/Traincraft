//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2021 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 27.12.2020 - 20:02:59
// Last changed on: 27.12.2020 - 20:02:59

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

public class ModelGP38dash9W extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelGP38dash9W() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[345];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 1
		bodyModel[1] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 114
		bodyModel[2] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 163
		bodyModel[3] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 166
		bodyModel[4] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 168
		bodyModel[5] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 169
		bodyModel[6] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 246
		bodyModel[7] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 274
		bodyModel[8] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 3
		bodyModel[9] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 246
		bodyModel[10] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 247
		bodyModel[11] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 164
		bodyModel[12] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 259
		bodyModel[13] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 261
		bodyModel[14] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 262
		bodyModel[15] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 263
		bodyModel[16] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 264
		bodyModel[17] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 265
		bodyModel[18] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Box 266
		bodyModel[19] = new ModelRendererTurbo(this, 65, 9, textureX, textureY); // Box 4
		bodyModel[20] = new ModelRendererTurbo(this, 65, 25, textureX, textureY); // Box 19
		bodyModel[21] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Box 31
		bodyModel[22] = new ModelRendererTurbo(this, 345, 17, textureX, textureY); // Box 40
		bodyModel[23] = new ModelRendererTurbo(this, 201, 25, textureX, textureY); // Box 41
		bodyModel[24] = new ModelRendererTurbo(this, 89, 9, textureX, textureY, "lamp"); // Box 115 liveryimg 2
		bodyModel[25] = new ModelRendererTurbo(this, 105, 9, textureX, textureY, "lamp"); // Box 116 liveryimg 2
		bodyModel[26] = new ModelRendererTurbo(this, 121, 9, textureX, textureY); // Box 98
		bodyModel[27] = new ModelRendererTurbo(this, 137, 9, textureX, textureY); // Box 5
		bodyModel[28] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 61
		bodyModel[29] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 63
		bodyModel[30] = new ModelRendererTurbo(this, 121, 9, textureX, textureY); // Box 80
		bodyModel[31] = new ModelRendererTurbo(this, 153, 9, textureX, textureY); // Box 81
		bodyModel[32] = new ModelRendererTurbo(this, 337, 9, textureX, textureY); // Box 86
		bodyModel[33] = new ModelRendererTurbo(this, 441, 9, textureX, textureY); // Box 87
		bodyModel[34] = new ModelRendererTurbo(this, 217, 25, textureX, textureY); // Box 255
		bodyModel[35] = new ModelRendererTurbo(this, 265, 25, textureX, textureY); // Box 256
		bodyModel[36] = new ModelRendererTurbo(this, 225, 33, textureX, textureY); // Box 38R
		bodyModel[37] = new ModelRendererTurbo(this, 369, 25, textureX, textureY); // Box 176
		bodyModel[38] = new ModelRendererTurbo(this, 393, 9, textureX, textureY); // Box 179
		bodyModel[39] = new ModelRendererTurbo(this, 497, 9, textureX, textureY); // Box 243
		bodyModel[40] = new ModelRendererTurbo(this, 393, 9, textureX, textureY); // Box 244
		bodyModel[41] = new ModelRendererTurbo(this, 409, 9, textureX, textureY); // Box 249
		bodyModel[42] = new ModelRendererTurbo(this, 505, 17, textureX, textureY); // Box 250
		bodyModel[43] = new ModelRendererTurbo(this, 89, 9, textureX, textureY); // Box 239
		bodyModel[44] = new ModelRendererTurbo(this, 97, 9, textureX, textureY, "lamp"); // Box 240 ditchlight rear
		bodyModel[45] = new ModelRendererTurbo(this, 105, 9, textureX, textureY, "lamp"); // Box 241 ditchlight rear
		bodyModel[46] = new ModelRendererTurbo(this, 113, 9, textureX, textureY); // Box 242
		bodyModel[47] = new ModelRendererTurbo(this, 161, 9, textureX, textureY, "lamp"); // Box 247 lamp rear
		bodyModel[48] = new ModelRendererTurbo(this, 417, 9, textureX, textureY, "lamp"); // Box 248 lamp rear
		bodyModel[49] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 234
		bodyModel[50] = new ModelRendererTurbo(this, 481, 9, textureX, textureY); // Box 236
		bodyModel[51] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Box 237
		bodyModel[52] = new ModelRendererTurbo(this, 425, 25, textureX, textureY); // Box 4
		bodyModel[53] = new ModelRendererTurbo(this, 321, 25, textureX, textureY); // Box 4
		bodyModel[54] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 4
		bodyModel[55] = new ModelRendererTurbo(this, 449, 33, textureX, textureY); // Box 4
		bodyModel[56] = new ModelRendererTurbo(this, 489, 25, textureX, textureY); // Box 4
		bodyModel[57] = new ModelRendererTurbo(this, 25, 41, textureX, textureY); // Box 4
		bodyModel[58] = new ModelRendererTurbo(this, 89, 17, textureX, textureY); // Box 2
		bodyModel[59] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 114
		bodyModel[60] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 74
		bodyModel[61] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 78
		bodyModel[62] = new ModelRendererTurbo(this, 345, 41, textureX, textureY); // Box 489
		bodyModel[63] = new ModelRendererTurbo(this, 401, 41, textureX, textureY); // Box 278
		bodyModel[64] = new ModelRendererTurbo(this, 225, 49, textureX, textureY); // Box 281
		bodyModel[65] = new ModelRendererTurbo(this, 249, 49, textureX, textureY); // Box 288
		bodyModel[66] = new ModelRendererTurbo(this, 473, 41, textureX, textureY); // Box 315
		bodyModel[67] = new ModelRendererTurbo(this, 305, 49, textureX, textureY); // Box 316
		bodyModel[68] = new ModelRendererTurbo(this, 401, 49, textureX, textureY); // Box 273
		bodyModel[69] = new ModelRendererTurbo(this, 129, 17, textureX, textureY); // Box 285
		bodyModel[70] = new ModelRendererTurbo(this, 321, 41, textureX, textureY); // Box 286
		bodyModel[71] = new ModelRendererTurbo(this, 433, 49, textureX, textureY); // Box 264
		bodyModel[72] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 276
		bodyModel[73] = new ModelRendererTurbo(this, 337, 49, textureX, textureY); // Box 277
		bodyModel[74] = new ModelRendererTurbo(this, 49, 33, textureX, textureY); // Box 297
		bodyModel[75] = new ModelRendererTurbo(this, 465, 49, textureX, textureY); // Box 299
		bodyModel[76] = new ModelRendererTurbo(this, 489, 49, textureX, textureY); // Box 272
		bodyModel[77] = new ModelRendererTurbo(this, 25, 57, textureX, textureY); // Box 273
		bodyModel[78] = new ModelRendererTurbo(this, 105, 17, textureX, textureY); // Box 274
		bodyModel[79] = new ModelRendererTurbo(this, 193, 25, textureX, textureY); // Box 275
		bodyModel[80] = new ModelRendererTurbo(this, 41, 57, textureX, textureY); // Box 278
		bodyModel[81] = new ModelRendererTurbo(this, 201, 57, textureX, textureY); // Box 101
		bodyModel[82] = new ModelRendererTurbo(this, 313, 25, textureX, textureY); // Box 104
		bodyModel[83] = new ModelRendererTurbo(this, 473, 33, textureX, textureY); // Box 105
		bodyModel[84] = new ModelRendererTurbo(this, 225, 57, textureX, textureY); // Box 284
		bodyModel[85] = new ModelRendererTurbo(this, 49, 41, textureX, textureY); // Box 285
		bodyModel[86] = new ModelRendererTurbo(this, 401, 49, textureX, textureY); // Box 286
		bodyModel[87] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 302
		bodyModel[88] = new ModelRendererTurbo(this, 321, 57, textureX, textureY); // Box 303
		bodyModel[89] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 304
		bodyModel[90] = new ModelRendererTurbo(this, 241, 57, textureX, textureY); // Box 268 anticlimber
		bodyModel[91] = new ModelRendererTurbo(this, 305, 57, textureX, textureY); // Box 269anticlimber
		bodyModel[92] = new ModelRendererTurbo(this, 153, 17, textureX, textureY); // Box 379
		bodyModel[93] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 380
		bodyModel[94] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 381
		bodyModel[95] = new ModelRendererTurbo(this, 361, 17, textureX, textureY); // Box 369
		bodyModel[96] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 370
		bodyModel[97] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 371
		bodyModel[98] = new ModelRendererTurbo(this, 481, 9, textureX, textureY); // Box 372
		bodyModel[99] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 373
		bodyModel[100] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 374
		bodyModel[101] = new ModelRendererTurbo(this, 481, 57, textureX, textureY); // Box 308
		bodyModel[102] = new ModelRendererTurbo(this, 257, 25, textureX, textureY); // Box 309
		bodyModel[103] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 310
		bodyModel[104] = new ModelRendererTurbo(this, 449, 25, textureX, textureY); // Box 311
		bodyModel[105] = new ModelRendererTurbo(this, 65, 9, textureX, textureY); // Box 19
		bodyModel[106] = new ModelRendererTurbo(this, 393, 17, textureX, textureY); // Box 334
		bodyModel[107] = new ModelRendererTurbo(this, 465, 57, textureX, textureY); // Box 243
		bodyModel[108] = new ModelRendererTurbo(this, 9, 9, textureX, textureY); // Box 244
		bodyModel[109] = new ModelRendererTurbo(this, 169, 9, textureX, textureY); // Box 245
		bodyModel[110] = new ModelRendererTurbo(this, 409, 17, textureX, textureY); // Box 254
		bodyModel[111] = new ModelRendererTurbo(this, 417, 17, textureX, textureY); // Box 255
		bodyModel[112] = new ModelRendererTurbo(this, 441, 17, textureX, textureY, "lamp"); // Box 256 ditchlight rear
		bodyModel[113] = new ModelRendererTurbo(this, 449, 17, textureX, textureY, "lamp"); // Box 257 ditchlight rear
		bodyModel[114] = new ModelRendererTurbo(this, 33, 65, textureX, textureY); // Box 36
		bodyModel[115] = new ModelRendererTurbo(this, 121, 65, textureX, textureY); // Box 271
		bodyModel[116] = new ModelRendererTurbo(this, 145, 65, textureX, textureY); // Box 272
		bodyModel[117] = new ModelRendererTurbo(this, 377, 9, textureX, textureY); // Box 313
		bodyModel[118] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 314
		bodyModel[119] = new ModelRendererTurbo(this, 489, 9, textureX, textureY); // Box 315
		bodyModel[120] = new ModelRendererTurbo(this, 169, 65, textureX, textureY); // Box 316
		bodyModel[121] = new ModelRendererTurbo(this, 41, 17, textureX, textureY); // Box 327
		bodyModel[122] = new ModelRendererTurbo(this, 97, 17, textureX, textureY); // Box 328
		bodyModel[123] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 329
		bodyModel[124] = new ModelRendererTurbo(this, 377, 17, textureX, textureY); // Box 330
		bodyModel[125] = new ModelRendererTurbo(this, 209, 65, textureX, textureY); // Box 270
		bodyModel[126] = new ModelRendererTurbo(this, 433, 49, textureX, textureY); // Box 271
		bodyModel[127] = new ModelRendererTurbo(this, 257, 57, textureX, textureY); // Box 272
		bodyModel[128] = new ModelRendererTurbo(this, 425, 17, textureX, textureY); // Box 273
		bodyModel[129] = new ModelRendererTurbo(this, 401, 57, textureX, textureY); // Box 274
		bodyModel[130] = new ModelRendererTurbo(this, 361, 17, textureX, textureY); // Box 303
		bodyModel[131] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 304
		bodyModel[132] = new ModelRendererTurbo(this, 225, 65, textureX, textureY); // Box 305
		bodyModel[133] = new ModelRendererTurbo(this, 497, 9, textureX, textureY); // Box 306
		bodyModel[134] = new ModelRendererTurbo(this, 401, 17, textureX, textureY); // Box 307
		bodyModel[135] = new ModelRendererTurbo(this, 193, 25, textureX, textureY); // Box 114
		bodyModel[136] = new ModelRendererTurbo(this, 337, 25, textureX, textureY); // Box 74
		bodyModel[137] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Box 78
		bodyModel[138] = new ModelRendererTurbo(this, 193, 33, textureX, textureY); // Box 245
		bodyModel[139] = new ModelRendererTurbo(this, 321, 57, textureX, textureY); // Box 338
		bodyModel[140] = new ModelRendererTurbo(this, 433, 57, textureX, textureY); // Box 339
		bodyModel[141] = new ModelRendererTurbo(this, 465, 57, textureX, textureY); // Box 340
		bodyModel[142] = new ModelRendererTurbo(this, 73, 33, textureX, textureY); // Box 341
		bodyModel[143] = new ModelRendererTurbo(this, 441, 41, textureX, textureY, "cull"); // Box 352 cull
		bodyModel[144] = new ModelRendererTurbo(this, 57, 49, textureX, textureY, "cull"); // Box 353 cull
		bodyModel[145] = new ModelRendererTurbo(this, 305, 57, textureX, textureY, "lamp"); // Box 354 ditchlight rear
		bodyModel[146] = new ModelRendererTurbo(this, 425, 65, textureX, textureY, "lamp"); // Box 355 ditchlight rear
		bodyModel[147] = new ModelRendererTurbo(this, 505, 57, textureX, textureY); // Box 359
		bodyModel[148] = new ModelRendererTurbo(this, 1, 49, textureX, textureY, "lamp"); // Box 360 commander beacon
		bodyModel[149] = new ModelRendererTurbo(this, 417, 65, textureX, textureY); // Box 361
		bodyModel[150] = new ModelRendererTurbo(this, 449, 65, textureX, textureY); // Box 365
		bodyModel[151] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 366
		bodyModel[152] = new ModelRendererTurbo(this, 489, 65, textureX, textureY); // Box 367
		bodyModel[153] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 368
		bodyModel[154] = new ModelRendererTurbo(this, 33, 73, textureX, textureY); // Box 369
		bodyModel[155] = new ModelRendererTurbo(this, 361, 49, textureX, textureY, "lamp"); // Box 475 commander beacon
		bodyModel[156] = new ModelRendererTurbo(this, 25, 65, textureX, textureY); // Box 476
		bodyModel[157] = new ModelRendererTurbo(this, 57, 73, textureX, textureY); // Box 477 extra stacc
		bodyModel[158] = new ModelRendererTurbo(this, 73, 73, textureX, textureY); // Box 478 extra stacc
		bodyModel[159] = new ModelRendererTurbo(this, 89, 73, textureX, textureY); // Box 479 extra stacc
		bodyModel[160] = new ModelRendererTurbo(this, 105, 73, textureX, textureY); // Box 480 extra stacc
		bodyModel[161] = new ModelRendererTurbo(this, 137, 73, textureX, textureY); // Box 196 winterization hatch
		bodyModel[162] = new ModelRendererTurbo(this, 241, 73, textureX, textureY); // Box 86
		bodyModel[163] = new ModelRendererTurbo(this, 193, 73, textureX, textureY); // Box 87
		bodyModel[164] = new ModelRendererTurbo(this, 265, 73, textureX, textureY); // Box 86
		bodyModel[165] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 510
		bodyModel[166] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 511
		bodyModel[167] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 512
		bodyModel[168] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 513
		bodyModel[169] = new ModelRendererTurbo(this, 49, 73, textureX, textureY); // Box 351 sandcap
		bodyModel[170] = new ModelRendererTurbo(this, 161, 73, textureX, textureY); // Box 364 prime base
		bodyModel[171] = new ModelRendererTurbo(this, 281, 73, textureX, textureY, "lamp"); // Box 6 PRIME1-1
		bodyModel[172] = new ModelRendererTurbo(this, 297, 73, textureX, textureY, "lamp"); // Box 7 PRIME1-3
		bodyModel[173] = new ModelRendererTurbo(this, 313, 73, textureX, textureY, "lamp"); // Box 8 PRIME1-2
		bodyModel[174] = new ModelRendererTurbo(this, 329, 73, textureX, textureY, "lamp"); // Box 9 PRIME1-4
		bodyModel[175] = new ModelRendererTurbo(this, 345, 73, textureX, textureY); // Box 361
		bodyModel[176] = new ModelRendererTurbo(this, 353, 73, textureX, textureY); // Box 362
		bodyModel[177] = new ModelRendererTurbo(this, 113, 65, textureX, textureY); // Box 363
		bodyModel[178] = new ModelRendererTurbo(this, 505, 65, textureX, textureY); // Box 364
		bodyModel[179] = new ModelRendererTurbo(this, 361, 73, textureX, textureY); // Box 365 extra stacc
		bodyModel[180] = new ModelRendererTurbo(this, 377, 73, textureX, textureY); // Box 366 extra stacc
		bodyModel[181] = new ModelRendererTurbo(this, 377, 73, textureX, textureY); // Box 367
		bodyModel[182] = new ModelRendererTurbo(this, 457, 73, textureX, textureY); // Box 368
		bodyModel[183] = new ModelRendererTurbo(this, 409, 73, textureX, textureY); // Box 369
		bodyModel[184] = new ModelRendererTurbo(this, 449, 73, textureX, textureY); // Box 370
		bodyModel[185] = new ModelRendererTurbo(this, 489, 73, textureX, textureY); // Box 371
		bodyModel[186] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 372
		bodyModel[187] = new ModelRendererTurbo(this, 361, 57, textureX, textureY, "lamp"); // Box 376 glow
		bodyModel[188] = new ModelRendererTurbo(this, 433, 65, textureX, textureY, "lamp"); // Box 377 glow
		bodyModel[189] = new ModelRendererTurbo(this, 425, 73, textureX, textureY, "cull"); // Box 378 cull
		bodyModel[190] = new ModelRendererTurbo(this, 457, 73, textureX, textureY, "cull"); // Box 453 cull
		bodyModel[191] = new ModelRendererTurbo(this, 33, 81, textureX, textureY); // Box 454
		bodyModel[192] = new ModelRendererTurbo(this, 33, 81, textureX, textureY, "cull"); // Box 455 cull
		bodyModel[193] = new ModelRendererTurbo(this, 65, 81, textureX, textureY, "cull"); // Box 479 cull
		bodyModel[194] = new ModelRendererTurbo(this, 121, 81, textureX, textureY, "cull"); // Box 339 cull
		bodyModel[195] = new ModelRendererTurbo(this, 73, 81, textureX, textureY); // Box 448
		bodyModel[196] = new ModelRendererTurbo(this, 161, 81, textureX, textureY); // Box 449
		bodyModel[197] = new ModelRendererTurbo(this, 217, 81, textureX, textureY); // Box 395
		bodyModel[198] = new ModelRendererTurbo(this, 257, 81, textureX, textureY); // Box 396
		bodyModel[199] = new ModelRendererTurbo(this, 281, 81, textureX, textureY); // Box 397
		bodyModel[200] = new ModelRendererTurbo(this, 305, 81, textureX, textureY); // Box 398
		bodyModel[201] = new ModelRendererTurbo(this, 505, 73, textureX, textureY); // Box 399
		bodyModel[202] = new ModelRendererTurbo(this, 177, 81, textureX, textureY); // Box 400
		bodyModel[203] = new ModelRendererTurbo(this, 313, 81, textureX, textureY); // Box 408
		bodyModel[204] = new ModelRendererTurbo(this, 41, 89, textureX, textureY); // Box 409
		bodyModel[205] = new ModelRendererTurbo(this, 73, 97, textureX, textureY); // Box 515
		bodyModel[206] = new ModelRendererTurbo(this, 393, 73, textureX, textureY); // Box 518
		bodyModel[207] = new ModelRendererTurbo(this, 433, 73, textureX, textureY); // Box 519
		bodyModel[208] = new ModelRendererTurbo(this, 273, 81, textureX, textureY); // Box 399
		bodyModel[209] = new ModelRendererTurbo(this, 457, 17, textureX, textureY); // Box 400
		bodyModel[210] = new ModelRendererTurbo(this, 297, 81, textureX, textureY); // Box 401
		bodyModel[211] = new ModelRendererTurbo(this, 473, 17, textureX, textureY); // Box 402
		bodyModel[212] = new ModelRendererTurbo(this, 321, 81, textureX, textureY); // Box 403
		bodyModel[213] = new ModelRendererTurbo(this, 305, 25, textureX, textureY); // Box 404
		bodyModel[214] = new ModelRendererTurbo(this, 345, 81, textureX, textureY); // Box 405
		bodyModel[215] = new ModelRendererTurbo(this, 449, 33, textureX, textureY); // Box 406
		bodyModel[216] = new ModelRendererTurbo(this, 361, 81, textureX, textureY); // Box 407
		bodyModel[217] = new ModelRendererTurbo(this, 377, 81, textureX, textureY); // Box 408
		bodyModel[218] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 409
		bodyModel[219] = new ModelRendererTurbo(this, 25, 41, textureX, textureY); // Box 410
		bodyModel[220] = new ModelRendererTurbo(this, 185, 81, textureX, textureY); // Box 403
		bodyModel[221] = new ModelRendererTurbo(this, 217, 81, textureX, textureY); // Box 404
		bodyModel[222] = new ModelRendererTurbo(this, 409, 81, textureX, textureY); // Box 405
		bodyModel[223] = new ModelRendererTurbo(this, 233, 81, textureX, textureY); // Box 406
		bodyModel[224] = new ModelRendererTurbo(this, 289, 73, textureX, textureY); // Box 164
		bodyModel[225] = new ModelRendererTurbo(this, 225, 89, textureX, textureY); // Box 3
		bodyModel[226] = new ModelRendererTurbo(this, 393, 81, textureX, textureY); // Box 247
		bodyModel[227] = new ModelRendererTurbo(this, 305, 73, textureX, textureY); // Box 259
		bodyModel[228] = new ModelRendererTurbo(this, 321, 73, textureX, textureY); // Box 262
		bodyModel[229] = new ModelRendererTurbo(this, 233, 89, textureX, textureY); // Box 263
		bodyModel[230] = new ModelRendererTurbo(this, 353, 81, textureX, textureY); // Box 264
		bodyModel[231] = new ModelRendererTurbo(this, 369, 81, textureX, textureY); // Box 265
		bodyModel[232] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 266
		bodyModel[233] = new ModelRendererTurbo(this, 449, 41, textureX, textureY); // Box 271
		bodyModel[234] = new ModelRendererTurbo(this, 425, 81, textureX, textureY); // Box 272
		bodyModel[235] = new ModelRendererTurbo(this, 489, 81, textureX, textureY); // Box 273
		bodyModel[236] = new ModelRendererTurbo(this, 97, 89, textureX, textureY); // Box 274
		bodyModel[237] = new ModelRendererTurbo(this, 25, 49, textureX, textureY); // Box 275
		bodyModel[238] = new ModelRendererTurbo(this, 49, 49, textureX, textureY); // Box 276
		bodyModel[239] = new ModelRendererTurbo(this, 465, 65, textureX, textureY); // Box 271
		bodyModel[240] = new ModelRendererTurbo(this, 113, 89, textureX, textureY); // Box 272
		bodyModel[241] = new ModelRendererTurbo(this, 129, 89, textureX, textureY); // Box 273
		bodyModel[242] = new ModelRendererTurbo(this, 481, 65, textureX, textureY); // Box 275
		bodyModel[243] = new ModelRendererTurbo(this, 337, 73, textureX, textureY); // Box 276
		bodyModel[244] = new ModelRendererTurbo(this, 25, 97, textureX, textureY); // Box 4
		bodyModel[245] = new ModelRendererTurbo(this, 417, 81, textureX, textureY); // Box 261
		bodyModel[246] = new ModelRendererTurbo(this, 505, 81, textureX, textureY); // Box 61
		bodyModel[247] = new ModelRendererTurbo(this, 241, 89, textureX, textureY); // Box 63
		bodyModel[248] = new ModelRendererTurbo(this, 137, 89, textureX, textureY); // Box 4
		bodyModel[249] = new ModelRendererTurbo(this, 449, 81, textureX, textureY); // Box 78
		bodyModel[250] = new ModelRendererTurbo(this, 153, 89, textureX, textureY); // Box 188
		bodyModel[251] = new ModelRendererTurbo(this, 185, 89, textureX, textureY, "lamp"); // Box 189 ditchlight front
		bodyModel[252] = new ModelRendererTurbo(this, 345, 89, textureX, textureY, "lamp"); // Box 190 ditchlight front
		bodyModel[253] = new ModelRendererTurbo(this, 105, 89, textureX, textureY); // Box 80
		bodyModel[254] = new ModelRendererTurbo(this, 329, 89, textureX, textureY); // Box 144
		bodyModel[255] = new ModelRendererTurbo(this, 497, 89, textureX, textureY); // Box 145
		bodyModel[256] = new ModelRendererTurbo(this, 121, 89, textureX, textureY); // Box 147
		bodyModel[257] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 148
		bodyModel[258] = new ModelRendererTurbo(this, 265, 97, textureX, textureY); // Box 4
		bodyModel[259] = new ModelRendererTurbo(this, 289, 97, textureX, textureY); // Box 4
		bodyModel[260] = new ModelRendererTurbo(this, 353, 97, textureX, textureY); // Box 4
		bodyModel[261] = new ModelRendererTurbo(this, 425, 97, textureX, textureY); // Box 4
		bodyModel[262] = new ModelRendererTurbo(this, 449, 97, textureX, textureY); // Box 4
		bodyModel[263] = new ModelRendererTurbo(this, 465, 97, textureX, textureY); // Box 4
		bodyModel[264] = new ModelRendererTurbo(this, 361, 89, textureX, textureY); // Box 2
		bodyModel[265] = new ModelRendererTurbo(this, 385, 89, textureX, textureY); // Box 250
		bodyModel[266] = new ModelRendererTurbo(this, 409, 89, textureX, textureY, "lamp"); // Box 251 ditchlight front
		bodyModel[267] = new ModelRendererTurbo(this, 257, 97, textureX, textureY, "lamp"); // Box 252 ditchlight front
		bodyModel[268] = new ModelRendererTurbo(this, 265, 97, textureX, textureY); // Box 253
		bodyModel[269] = new ModelRendererTurbo(this, 289, 97, textureX, textureY, "cull"); // Box 348 cull
		bodyModel[270] = new ModelRendererTurbo(this, 305, 97, textureX, textureY, "lamp"); // Box 349 ditchlight front
		bodyModel[271] = new ModelRendererTurbo(this, 313, 97, textureX, textureY, "lamp"); // Box 350 ditchlight front
		bodyModel[272] = new ModelRendererTurbo(this, 321, 97, textureX, textureY, "cull"); // Box 351 cull
		bodyModel[273] = new ModelRendererTurbo(this, 97, 105, textureX, textureY, "cull"); // Box 450 cull
		bodyModel[274] = new ModelRendererTurbo(this, 121, 105, textureX, textureY, "cull"); // Box 451 cull
		bodyModel[275] = new ModelRendererTurbo(this, 121, 105, textureX, textureY); // Box 452
		bodyModel[276] = new ModelRendererTurbo(this, 153, 105, textureX, textureY); // Box 446
		bodyModel[277] = new ModelRendererTurbo(this, 177, 105, textureX, textureY); // Box 447
		bodyModel[278] = new ModelRendererTurbo(this, 449, 97, textureX, textureY); // Box 401
		bodyModel[279] = new ModelRendererTurbo(this, 345, 97, textureX, textureY); // Box 402
		bodyModel[280] = new ModelRendererTurbo(this, 9, 97, textureX, textureY); // Box 516
		bodyModel[281] = new ModelRendererTurbo(this, 465, 97, textureX, textureY); // Box 517
		bodyModel[282] = new ModelRendererTurbo(this, 201, 105, textureX, textureY); // Box 72
		bodyModel[283] = new ModelRendererTurbo(this, 313, 105, textureX, textureY); // Box 190
		bodyModel[284] = new ModelRendererTurbo(this, 361, 105, textureX, textureY); // Box 316
		bodyModel[285] = new ModelRendererTurbo(this, 169, 105, textureX, textureY); // Box 11
		bodyModel[286] = new ModelRendererTurbo(this, 25, 113, textureX, textureY); // Box 211
		bodyModel[287] = new ModelRendererTurbo(this, 113, 105, textureX, textureY); // Box 48 lamp
		bodyModel[288] = new ModelRendererTurbo(this, 337, 105, textureX, textureY); // Box 43
		bodyModel[289] = new ModelRendererTurbo(this, 489, 105, textureX, textureY); // Box 44
		bodyModel[290] = new ModelRendererTurbo(this, 417, 65, textureX, textureY, "lamp"); // Box 117 liveryimg 2 glow
		bodyModel[291] = new ModelRendererTurbo(this, 217, 73, textureX, textureY, "lamp"); // Box 118 liveryimg 2 glow
		bodyModel[292] = new ModelRendererTurbo(this, 353, 97, textureX, textureY, "lamp"); // Box 186 lamp
		bodyModel[293] = new ModelRendererTurbo(this, 489, 97, textureX, textureY, "lamp"); // Box 187 lamp
		bodyModel[294] = new ModelRendererTurbo(this, 249, 113, textureX, textureY); // Box 220
		bodyModel[295] = new ModelRendererTurbo(this, 49, 113, textureX, textureY); // Box 221
		bodyModel[296] = new ModelRendererTurbo(this, 417, 113, textureX, textureY); // Box 222
		bodyModel[297] = new ModelRendererTurbo(this, 81, 113, textureX, textureY); // Box 224
		bodyModel[298] = new ModelRendererTurbo(this, 105, 113, textureX, textureY); // Box 42
		bodyModel[299] = new ModelRendererTurbo(this, 209, 113, textureX, textureY); // Box 45
		bodyModel[300] = new ModelRendererTurbo(this, 289, 113, textureX, textureY); // Box 42
		bodyModel[301] = new ModelRendererTurbo(this, 353, 113, textureX, textureY); // Box 42
		bodyModel[302] = new ModelRendererTurbo(this, 89, 73, textureX, textureY, "lamp"); // Box 176 glow
		bodyModel[303] = new ModelRendererTurbo(this, 105, 73, textureX, textureY, "lamp"); // Box 176 glow
		bodyModel[304] = new ModelRendererTurbo(this, 433, 113, textureX, textureY); // Box 345
		bodyModel[305] = new ModelRendererTurbo(this, 377, 73, textureX, textureY, "lamp"); // Box 410 glow
		bodyModel[306] = new ModelRendererTurbo(this, 33, 81, textureX, textureY); // Box 350
		bodyModel[307] = new ModelRendererTurbo(this, 393, 89, textureX, textureY, "lamp"); // Box 340 glow
		bodyModel[308] = new ModelRendererTurbo(this, 49, 105, textureX, textureY); // Box 341
		bodyModel[309] = new ModelRendererTurbo(this, 473, 113, textureX, textureY); // Engieer side door
		bodyModel[310] = new ModelRendererTurbo(this, 305, 113, textureX, textureY); // Box 72
		bodyModel[311] = new ModelRendererTurbo(this, 1, 121, textureX, textureY); // Fireman side door
		bodyModel[312] = new ModelRendererTurbo(this, 313, 105, textureX, textureY); // Box 72
		bodyModel[313] = new ModelRendererTurbo(this, 73, 105, textureX, textureY); // Box 42
		bodyModel[314] = new ModelRendererTurbo(this, 81, 105, textureX, textureY); // Box 42
		bodyModel[315] = new ModelRendererTurbo(this, 137, 113, textureX, textureY); // Box 87
		bodyModel[316] = new ModelRendererTurbo(this, 49, 121, textureX, textureY); // Box 345
		bodyModel[317] = new ModelRendererTurbo(this, 169, 121, textureX, textureY); // Box 42
		bodyModel[318] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Box 87
		bodyModel[319] = new ModelRendererTurbo(this, 81, 121, textureX, textureY); // Box 45
		bodyModel[320] = new ModelRendererTurbo(this, 489, 121, textureX, textureY); // Box 45
		bodyModel[321] = new ModelRendererTurbo(this, 193, 129, textureX, textureY); // Box 345
		bodyModel[322] = new ModelRendererTurbo(this, 25, 97, textureX, textureY); // Box 318
		bodyModel[323] = new ModelRendererTurbo(this, 9, 105, textureX, textureY); // Box 318
		bodyModel[324] = new ModelRendererTurbo(this, 97, 129, textureX, textureY); // Front door
		bodyModel[325] = new ModelRendererTurbo(this, 369, 113, textureX, textureY); // Box 72
		bodyModel[326] = new ModelRendererTurbo(this, 441, 121, textureX, textureY); // Box 72
		bodyModel[327] = new ModelRendererTurbo(this, 241, 129, textureX, textureY); // Box 72
		bodyModel[328] = new ModelRendererTurbo(this, 257, 129, textureX, textureY); // Box 72
		bodyModel[329] = new ModelRendererTurbo(this, 17, 121, textureX, textureY); // Box 384
		bodyModel[330] = new ModelRendererTurbo(this, 417, 105, textureX, textureY); // Box 385
		bodyModel[331] = new ModelRendererTurbo(this, 505, 105, textureX, textureY); // Box 386
		bodyModel[332] = new ModelRendererTurbo(this, 49, 121, textureX, textureY); // Box 354
		bodyModel[333] = new ModelRendererTurbo(this, 97, 121, textureX, textureY); // Box 355
		bodyModel[334] = new ModelRendererTurbo(this, 153, 121, textureX, textureY); // Box 356
		bodyModel[335] = new ModelRendererTurbo(this, 257, 129, textureX, textureY); // Box 348
		bodyModel[336] = new ModelRendererTurbo(this, 505, 113, textureX, textureY); // Box 42
		bodyModel[337] = new ModelRendererTurbo(this, 193, 121, textureX, textureY); // Box 42
		bodyModel[338] = new ModelRendererTurbo(this, 281, 129, textureX, textureY); // Box 42
		bodyModel[339] = new ModelRendererTurbo(this, 97, 105, textureX, textureY); // Box 350
		bodyModel[340] = new ModelRendererTurbo(this, 17, 129, textureX, textureY); // Box 210
		bodyModel[341] = new ModelRendererTurbo(this, 129, 129, textureX, textureY); // Box 223
		bodyModel[342] = new ModelRendererTurbo(this, 233, 97, textureX, textureY, "lamp"); // Box 176 lamp
		bodyModel[343] = new ModelRendererTurbo(this, 161, 105, textureX, textureY, "lamp"); // Box 177 lamp
		bodyModel[344] = new ModelRendererTurbo(this, 449, 113, textureX, textureY); // Light mount

		bodyModel[0].addBox(0F, 0F, 0F, 79, 1, 4, 0F); // Box 1
		bodyModel[0].setRotationPoint(-39F, 0F, -11F);

		bodyModel[1].addBox(0F, 0F, 0F, 80, 3, 14, 0F); // Box 114
		bodyModel[1].setRotationPoint(-39F, 0F, -7F);

		bodyModel[2].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 163
		bodyModel[2].setRotationPoint(-27F, 3F, -2F);

		bodyModel[3].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 166
		bodyModel[3].setRotationPoint(27F, 3F, -2F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 2, 1, 21, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 168
		bodyModel[4].setRotationPoint(-26F, 2F, -10.5F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 2, 1, 21, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 169
		bodyModel[5].setRotationPoint(28F, 2F, -10.5F);

		bodyModel[6].addBox(0F, 0F, 0F, 0, 6, 1, 0F); // Box 246
		bodyModel[6].setRotationPoint(-44F, 2F, -10F);

		bodyModel[7].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 274
		bodyModel[7].setRotationPoint(-44F, 2F, 7F);

		bodyModel[8].addBox(0F, 0F, 0F, 0, 9, 18, 0F); // Box 3
		bodyModel[8].setRotationPoint(45.01F, 0F, -9F);

		bodyModel[9].addBox(0F, 0F, 0F, 0, 6, 1, 0F); // Box 246
		bodyModel[9].setRotationPoint(45.02F, 2F, -10F);

		bodyModel[10].addBox(0F, 0F, 0F, 0, 6, 1, 0F); // Box 247
		bodyModel[10].setRotationPoint(45.02F, 2F, 9F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 164
		bodyModel[11].setRotationPoint(40F, 1F, -11F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,-1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 259
		bodyModel[12].setRotationPoint(40F, 1F, 7F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 261
		bodyModel[13].setRotationPoint(40F, 0F, -11F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 262
		bodyModel[14].setRotationPoint(40F, 0F, 7F);

		bodyModel[15].addBox(0F, 0F, 0F, 2, 3, 14, 0F); // Box 263
		bodyModel[15].setRotationPoint(40F, 0F, -7F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -2F, -1F, 0F, -2F); // Box 264
		bodyModel[16].setRotationPoint(40F, 3F, -11F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,-1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 265
		bodyModel[17].setRotationPoint(40F, 3F, 7F);

		bodyModel[18].addBox(0F, 0F, 0F, 3, 2, 14, 0F); // Box 266
		bodyModel[18].setRotationPoint(42F, 0F, -7F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 5, 6, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); // Box 4
		bodyModel[19].setRotationPoint(40F, 2F, -3F);

		bodyModel[20].addBox(0F, 0F, 0F, 53, 21, 14, 0F); // Box 19
		bodyModel[20].setRotationPoint(-12F, -21F, -7F);

		bodyModel[21].addBox(0F, 0F, 0F, 2, 2, 4, 0F); // Box 31
		bodyModel[21].setRotationPoint(42.25F, -18F, -2F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 3, 21, 7, 0F,0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		bodyModel[22].setRotationPoint(41F, -21F, -7F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 3, 21, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[23].setRotationPoint(41F, -21F, 0F);

		bodyModel[24].addBox(0F, 0F, 0F, 0, 2, 5, 0F); // Box 115 liveryimg 2
		bodyModel[24].setRotationPoint(41.45F, -15.5F, -6F);
		bodyModel[24].rotateAngleY = -0.41887902F;

		bodyModel[25].addBox(0F, 0F, -5F, 0, 2, 5, 0F); // Box 116 liveryimg 2
		bodyModel[25].setRotationPoint(41.45F, -15.5F, 6F);
		bodyModel[25].rotateAngleY = 0.41887902F;

		bodyModel[26].addBox(0F, 0F, 0F, 2, 0, 6, 0F); // Box 98
		bodyModel[26].setRotationPoint(-47F, 0F, -3F);

		bodyModel[27].addBox(0F, 0F, 0F, 4, 2, 3, 0F); // Box 5
		bodyModel[27].setRotationPoint(45F, 3F, -1.5F);

		bodyModel[28].addBox(0F, 0F, 0F, 0, 7, 1, 0F); // Box 61
		bodyModel[28].setRotationPoint(45.02F, -2F, 10F);

		bodyModel[29].addBox(0F, 0F, 0F, 0, 7, 1, 0F); // Box 63
		bodyModel[29].setRotationPoint(45.02F, -2F, -11F);

		bodyModel[30].addBox(0F, 0F, 0F, 0, 8, 1, 0F); // Box 80
		bodyModel[30].setRotationPoint(45.02F, -8F, -8F);

		bodyModel[31].addBox(0F, 0F, 0F, 0, 8, 1, 0F); // Box 81
		bodyModel[31].setRotationPoint(45.02F, -8F, 7F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 18, 1, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 86
		bodyModel[32].setRotationPoint(2F, 0.5F, 9F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 18, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 87
		bodyModel[33].setRotationPoint(2F, 1.5F, 9F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 18, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 255
		bodyModel[34].setRotationPoint(2F, 1.5F, -11F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 18, 1, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 256
		bodyModel[35].setRotationPoint(2F, 0.5F, -11F);

		bodyModel[36].addBox(0F, 0F, 0F, 47, 8, 0, 0F); // Box 38R
		bodyModel[36].setRotationPoint(-6F, -8F, 11.01F);

		bodyModel[37].addBox(0F, 0F, 0F, 32, 8, 0, 0F); // Box 176
		bodyModel[37].setRotationPoint(-9F, -10F, -11.01F);

		bodyModel[38].addBox(0F, 0F, 0F, 2, 0, 6, 0F); // Box 179
		bodyModel[38].setRotationPoint(46F, 0F, -3F);

		bodyModel[39].addBox(0F, 0F, 0F, 0, 11, 2, 0F); // Box 243
		bodyModel[39].setRotationPoint(41F, -8F, 9F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 244
		bodyModel[40].setRotationPoint(41F, -7F, 10.5F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 249
		bodyModel[41].setRotationPoint(41F, -7F, -11.5F);

		bodyModel[42].addBox(0F, 0F, 0F, 0, 11, 2, 0F); // Box 250
		bodyModel[42].setRotationPoint(41F, -8F, -11F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 239
		bodyModel[43].setRotationPoint(44.5F, -2F, -6.5F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 240 ditchlight rear
		bodyModel[44].setRotationPoint(44.75F, -2F, -6.5F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 241 ditchlight rear
		bodyModel[45].setRotationPoint(44.75F, -2F, 4.5F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 242
		bodyModel[46].setRotationPoint(44.5F, -2F, 4.5F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 247 lamp rear
		bodyModel[47].setRotationPoint(43.5F, -18F, -2F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 248 lamp rear
		bodyModel[48].setRotationPoint(43.5F, -18F, 0F);

		bodyModel[49].addBox(0F, 0F, 0F, 0, 8, 6, 0F); // Box 234
		bodyModel[49].setRotationPoint(46F, -8F, -3F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 236
		bodyModel[50].setRotationPoint(45F, -8F, -7F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F,-1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 237
		bodyModel[51].setRotationPoint(45F, -8F, 3F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 3, 1, 10, 0F,-2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[52].setRotationPoint(45F, 6F, 0F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F,-3F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 1F, 0F, -1F, 1F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[53].setRotationPoint(45F, 5F, 2F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 3, 2, 10, 0F,-2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, 1F, 0F, 0F, -1.5F, 0F, -1F, -1F, 0F, -1F); // Box 4
		bodyModel[54].setRotationPoint(45F, 7F, 0F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 3, 1, 10, 0F,0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F); // Box 4
		bodyModel[55].setRotationPoint(45F, 6F, -10F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F,-0.5F, 1F, 0F, -2F, 1F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0.5F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, -1.5F, 0F, 0F); // Box 4
		bodyModel[56].setRotationPoint(45.5F, 5F, -10F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 3, 2, 10, 0F,0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -1F, 0F, -1F, -1.5F, 0F, -1F, 1F, 0F, 0F, -3.5F, 0F, 0F); // Box 4
		bodyModel[57].setRotationPoint(45F, 7F, -10F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[58].setRotationPoint(45F, 2.5F, -2F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 114
		bodyModel[59].setRotationPoint(-8F, 2F, -10.5F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[60].setRotationPoint(-8F, 1F, -10.5F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 78
		bodyModel[61].setRotationPoint(-7.75F, 2.5F, -10.25F);

		bodyModel[62].addBox(0F, 0F, 0F, 15, 3, 22, 0F); // Box 489
		bodyModel[62].setRotationPoint(-2F, 3F, -11F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 15, 1, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 278
		bodyModel[63].setRotationPoint(-2F, 2F, -11F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 15, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 281
		bodyModel[64].setRotationPoint(-2F, 6F, -11F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 15, 3, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 288
		bodyModel[65].setRotationPoint(-2F, 6F, -9F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 15, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 315
		bodyModel[66].setRotationPoint(-2F, 2F, 7F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 15, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 316
		bodyModel[67].setRotationPoint(-2F, 6F, 9F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 7, 1, 12, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 273
		bodyModel[68].setRotationPoint(-11F, -22F, -6F);

		bodyModel[69].addBox(0F, 0F, 0F, 8, 5, 1, 0F); // Box 285
		bodyModel[69].setRotationPoint(-11F, -20.5F, -7.5F);

		bodyModel[70].addBox(0F, 0F, 0F, 8, 5, 1, 0F); // Box 286
		bodyModel[70].setRotationPoint(-11F, -20.5F, 6.5F);

		bodyModel[71].addBox(0F, 0F, 0F, 6, 1, 14, 0F); // Box 264
		bodyModel[71].setRotationPoint(-3F, -22F, -7F);

		bodyModel[72].addBox(0F, 0F, 0F, 6, 2, 6, 0F); // Box 276
		bodyModel[72].setRotationPoint(32F, -22.5F, -3F);

		bodyModel[73].addBox(0F, 0F, 0F, 6, 2, 6, 0F); // Box 277
		bodyModel[73].setRotationPoint(24F, -22.5F, -3F);

		bodyModel[74].addBox(0F, 0F, 0F, 9, 4, 1, 0F); // Box 297
		bodyModel[74].setRotationPoint(31F, -19.5F, -7.5F);

		bodyModel[75].addBox(0F, 0F, 0F, 9, 4, 1, 0F); // Box 299
		bodyModel[75].setRotationPoint(31F, -19.5F, 6.5F);

		bodyModel[76].addBox(0F, 0F, 0F, 9, 4, 1, 0F); // Box 272
		bodyModel[76].setRotationPoint(21.5F, -19.5F, -7.5F);

		bodyModel[77].addBox(0F, 0F, 0F, 9, 4, 1, 0F); // Box 273
		bodyModel[77].setRotationPoint(21.5F, -19.5F, 6.5F);

		bodyModel[78].addBox(0F, 0F, 0F, 2, 1, 5, 0F); // Box 274
		bodyModel[78].setRotationPoint(4.5F, -22F, -2.5F);

		bodyModel[79].addBox(0F, 0F, 0F, 2, 1, 5, 0F); // Box 275
		bodyModel[79].setRotationPoint(17.5F, -22F, -2.5F);

		bodyModel[80].addBox(0F, 0F, 0F, 6, 1, 6, 0F); // Box 278
		bodyModel[80].setRotationPoint(9F, -22F, -3F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 9, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 101
		bodyModel[81].setRotationPoint(8F, -21F, 7F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 3, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, -2F, 0F, 0F, -1F); // Box 104
		bodyModel[82].setRotationPoint(17F, -21F, 7F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 5, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.7F, -1.75F); // Box 105
		bodyModel[83].setRotationPoint(3F, -21F, 7F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 9, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 284
		bodyModel[84].setRotationPoint(8F, -21F, -9F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 5, 3, 2, 0F,0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, -1.75F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.7F, 0F); // Box 285
		bodyModel[85].setRotationPoint(3F, -21F, -9F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 3, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1.5F, -2F, 0F, -1.5F, 0F, 0F, 0F, 0F); // Box 286
		bodyModel[86].setRotationPoint(17F, -21F, -9F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F); // Box 302
		bodyModel[87].setRotationPoint(-45F, 0F, 5F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 303
		bodyModel[88].setRotationPoint(-45F, 0F, -5F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 304
		bodyModel[89].setRotationPoint(-45F, 0F, -6F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 268 anticlimber
		bodyModel[90].setRotationPoint(-46F, 0F, -7F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 269anticlimber
		bodyModel[91].setRotationPoint(-46F, 0F, 0F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 379
		bodyModel[92].setRotationPoint(18.5F, -22.5F, -7F);

		bodyModel[93].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 380
		bodyModel[93].setRotationPoint(17.5F, -23.5F, -6.75F);

		bodyModel[94].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 381
		bodyModel[94].setRotationPoint(16.5F, -23.5F, -5.25F);

		bodyModel[95].addBox(0F, 0F, 0F, 4, 0, 4, 0F); // Box 369
		bodyModel[95].setRotationPoint(-12.5F, -23F, 2F);

		bodyModel[96].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 370
		bodyModel[96].setRotationPoint(-12.5F, -23F, 2F);

		bodyModel[97].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 371
		bodyModel[97].setRotationPoint(-12.5F, -23F, 6F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 372
		bodyModel[98].setRotationPoint(-12.5F, -24F, 4F);

		bodyModel[99].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 373
		bodyModel[99].setRotationPoint(-9.5F, -23F, 6F);

		bodyModel[100].addBox(0F, 0F, 0F, 1, 1, 0, 0F); // Box 374
		bodyModel[100].setRotationPoint(-9.5F, -23F, 2F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 9, 3, 4, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 308
		bodyModel[101].setRotationPoint(-12F, -21F, -11F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 309
		bodyModel[102].setRotationPoint(-3F, -21F, -11F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 9, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 310
		bodyModel[103].setRotationPoint(-12F, -21F, 7F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 311
		bodyModel[104].setRotationPoint(-3F, -21F, 7F);

		bodyModel[105].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 19
		bodyModel[105].setRotationPoint(-1F, 2F, -11.5F);
		bodyModel[105].rotateAngleX = 0.87266463F;

		bodyModel[106].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 334
		bodyModel[106].setRotationPoint(-1F, 3.5F, 8.75F);
		bodyModel[106].rotateAngleX = 0.87266463F;

		bodyModel[107].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 243
		bodyModel[107].setRotationPoint(45F, 0F, -5F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 244
		bodyModel[108].setRotationPoint(45F, 0F, -6F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, 0F, -1F, 0F); // Box 245
		bodyModel[109].setRotationPoint(45F, 0F, 5F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 254
		bodyModel[110].setRotationPoint(44.5F, 0F, 6F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 255
		bodyModel[111].setRotationPoint(44.5F, 0F, -8F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 256 ditchlight rear
		bodyModel[112].setRotationPoint(44.75F, 0F, -8F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 257 ditchlight rear
		bodyModel[113].setRotationPoint(44.75F, 0F, 6F);

		bodyModel[114].addBox(0F, 0F, 0F, 37, 2, 4, 0F); // Box 36
		bodyModel[114].setRotationPoint(-12F, -2F, -11F);

		bodyModel[115].addBox(0F, 0F, 0F, 8, 11, 2, 0F); // Box 271
		bodyModel[115].setRotationPoint(-10F, -13F, -9F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 8, 2, 2, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 272
		bodyModel[116].setRotationPoint(-10F, -15F, -9F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 313
		bodyModel[117].setRotationPoint(-11F, -12F, -11F);

		bodyModel[118].addBox(0F, 0F, 0F, 1, 1, 0, 0F); // Box 314
		bodyModel[118].setRotationPoint(-12F, -12F, -11F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 315
		bodyModel[119].setRotationPoint(23F, -10F, -11F);

		bodyModel[120].addBox(0F, 0F, 0F, 16, 8, 0, 0F); // Box 316
		bodyModel[120].setRotationPoint(25F, -8F, -11F);

		bodyModel[121].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 327
		bodyModel[121].setRotationPoint(22F, -22.5F, -5.5F);

		bodyModel[122].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 328
		bodyModel[122].setRotationPoint(23F, -22.25F, -4.5F);

		bodyModel[123].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 329
		bodyModel[123].setRotationPoint(22.5F, -22.25F, -6.5F);

		bodyModel[124].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 330
		bodyModel[124].setRotationPoint(24.5F, -21.5F, -5.5F);

		bodyModel[125].addBox(0F, 0F, 0F, 2, 8, 4, 0F); // Box 270
		bodyModel[125].setRotationPoint(-12F, -10F, -10.5F);

		bodyModel[126].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 271
		bodyModel[126].setRotationPoint(20.5F, -23.25F, 0.5F);

		bodyModel[127].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 272
		bodyModel[127].setRotationPoint(20F, -23.25F, -1.5F);

		bodyModel[128].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 273
		bodyModel[128].setRotationPoint(22F, -22.5F, -0.5F);

		bodyModel[129].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 274
		bodyModel[129].setRotationPoint(19.5F, -23.5F, -0.5F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 1, 4, 0, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 303
		bodyModel[130].setRotationPoint(-8F, -4F, 11F);

		bodyModel[131].addBox(0F, 0F, 0F, 1, 0, 4, 0F); // Box 304
		bodyModel[131].setRotationPoint(-8F, -2F, 7F);

		bodyModel[132].addBox(0F, 0F, 0F, 4, 4, 4, 0F); // Box 305
		bodyModel[132].setRotationPoint(-12F, -4F, 7F);

		bodyModel[133].addBox(0F, 0F, 0F, 2, 1, 0, 0F); // Box 306
		bodyModel[133].setRotationPoint(-12F, -12F, 11F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F); // Box 307
		bodyModel[134].setRotationPoint(-10F, -12F, 11F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 114
		bodyModel[135].setRotationPoint(5.5F, -19F, -8.7F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[136].setRotationPoint(5.5F, -20F, -8.7F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 78
		bodyModel[137].setRotationPoint(5.75F, -18.5F, -8.45F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 245
		bodyModel[138].setRotationPoint(5.5F, -21F, -8.5F);

		bodyModel[139].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 338
		bodyModel[139].setRotationPoint(-8F, -24.25F, -1.5F);

		bodyModel[140].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 339
		bodyModel[140].setRotationPoint(-8.5F, -24.5F, -0.5F);

		bodyModel[141].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 340
		bodyModel[141].setRotationPoint(-7.5F, -24.25F, 0.5F);

		bodyModel[142].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 341
		bodyModel[142].setRotationPoint(-6F, -23.5F, -0.5F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 352 cull
		bodyModel[143].setRotationPoint(44.5F, 1F, -5.5F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 353 cull
		bodyModel[144].setRotationPoint(44.5F, 1F, 3.5F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 354 ditchlight rear
		bodyModel[145].setRotationPoint(44.75F, 1F, 3.5F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 355 ditchlight rear
		bodyModel[146].setRotationPoint(44.75F, 1F, -5.5F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0.3F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, 0.3F, -0.5F, 0.1F, 0.3F, 0F, 0.1F, -1F, 0F, 0.1F, -1F, 0F, 0.1F, 0.3F, 0F, 0.1F); // Box 359
		bodyModel[147].setRotationPoint(20.68F, -22F, 6.5F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 360 commander beacon
		bodyModel[148].setRotationPoint(20.53F, -23F, 6.5F);

		bodyModel[149].addBox(0F, 0F, 0F, 4, 3, 22, 0F); // Box 361
		bodyModel[149].setRotationPoint(-6F, 3F, -11F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 4, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 365
		bodyModel[150].setRotationPoint(-6F, 6F, -11F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 4, 3, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 366
		bodyModel[151].setRotationPoint(-6F, 6F, -9F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 4, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 367
		bodyModel[152].setRotationPoint(-6F, 6F, 9F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 368
		bodyModel[153].setRotationPoint(-6F, 2F, -11F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 369
		bodyModel[154].setRotationPoint(-6F, 2F, 7F);

		bodyModel[155].addShapeBox(0F, -1F, -1F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 475 commander beacon
		bodyModel[155].setRotationPoint(38.5F, -22F, 0.5F);

		bodyModel[156].addShapeBox(0F, 0F, -1F, 2, 1, 1, 0F,0.3F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, 0.3F, -0.5F, 0.1F, 0.3F, 0F, 0.1F, -1F, 0F, 0.1F, -1F, 0F, 0.1F, 0.3F, 0F, 0.1F); // Box 476
		bodyModel[156].setRotationPoint(38.65F, -22F, 0.5F);

		bodyModel[157].addBox(0F, 0F, 0F, 2, 2, 5, 0F); // Box 477 extra stacc
		bodyModel[157].setRotationPoint(17.5F, -24F, -2.5F);

		bodyModel[158].addBox(0F, 0F, 0F, 2, 2, 5, 0F); // Box 478 extra stacc
		bodyModel[158].setRotationPoint(4.5F, -24F, -2.5F);

		bodyModel[159].addBox(0F, 0F, 0F, 2, 3, 5, 0F); // Box 479 extra stacc
		bodyModel[159].setRotationPoint(13.5F, -24F, -2.5F);

		bodyModel[160].addBox(0F, 0F, 0F, 2, 3, 5, 0F); // Box 480 extra stacc
		bodyModel[160].setRotationPoint(8.5F, -24F, -2.5F);

		bodyModel[161].addBox(0F, 0F, 0F, 8, 3, 7, 0F); // Box 196 winterization hatch
		bodyModel[161].setRotationPoint(23F, -23.5F, -3.5F);

		bodyModel[162].addBox(0F, 0F, 0F, 7, 8, 3, 0F); // Box 86
		bodyModel[162].setRotationPoint(-27.1F, -12F, -5F);
		bodyModel[162].rotateAngleY = -0.38397244F;

		bodyModel[163].addBox(0F, 0F, 0F, 1, 9, 10, 0F); // Box 87
		bodyModel[163].setRotationPoint(-27F, -13F, -4F);

		bodyModel[164].addBox(0F, 0F, 0F, 5, 2, 2, 0F); // Box 86
		bodyModel[164].setRotationPoint(-26F, -14F, -5F);
		bodyModel[164].rotateAngleY = -0.38397244F;

		bodyModel[165].addBox(0F, 0F, 0F, 0, 1, 1, 0F); // Box 510
		bodyModel[165].setRotationPoint(-44F, 6F, -11F);

		bodyModel[166].addBox(0F, 0F, 0F, 0, 1, 1, 0F); // Box 511
		bodyModel[166].setRotationPoint(-44F, 6F, 10F);

		bodyModel[167].addBox(0F, 0F, 0F, 0, 1, 1, 0F); // Box 512
		bodyModel[167].setRotationPoint(45F, 6F, 10F);

		bodyModel[168].addBox(0F, 0F, 0F, 0, 1, 1, 0F); // Box 513
		bodyModel[168].setRotationPoint(45F, 6F, -11F);

		bodyModel[169].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 351 sandcap
		bodyModel[169].setRotationPoint(40.5F, -21.5F, -1F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 364 prime base
		bodyModel[170].setRotationPoint(-23.5F, -22F, -1F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F); // Box 6 PRIME1-1
		bodyModel[171].setRotationPoint(-23.5F, -22.5F, -1F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F); // Box 7 PRIME1-3
		bodyModel[172].setRotationPoint(-23.5F, -22.5F, -1F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 8 PRIME1-2
		bodyModel[173].setRotationPoint(-23.5F, -22.5F, -1F);

		bodyModel[174].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 9 PRIME1-4
		bodyModel[174].setRotationPoint(-23.5F, -22.5F, -1F);

		bodyModel[175].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 361
		bodyModel[175].setRotationPoint(31F, -22.5F, -6.5F);

		bodyModel[176].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 362
		bodyModel[176].setRotationPoint(29F, -23.5F, -4.5F);

		bodyModel[177].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 363
		bodyModel[177].setRotationPoint(30F, -23.5F, -6.5F);

		bodyModel[178].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 364
		bodyModel[178].setRotationPoint(31F, -23.5F, -5.5F);

		bodyModel[179].addBox(0F, 0F, 0F, 2, 1, 5, 0F); // Box 365 extra stacc
		bodyModel[179].setRotationPoint(7F, -22F, -2.5F);

		bodyModel[180].addBox(0F, 0F, 0F, 2, 1, 5, 0F); // Box 366 extra stacc
		bodyModel[180].setRotationPoint(15F, -22F, -2.5F);

		bodyModel[181].addBox(0F, 0F, 0F, 4, 3, 22, 0F); // Box 367
		bodyModel[181].setRotationPoint(13F, 3F, -11F);

		bodyModel[182].addShapeBox(0F, 0F, 0F, 4, 3, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 368
		bodyModel[182].setRotationPoint(13F, 6F, -9F);

		bodyModel[183].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 369
		bodyModel[183].setRotationPoint(13F, 2F, -11F);

		bodyModel[184].addShapeBox(0F, 0F, 0F, 4, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 370
		bodyModel[184].setRotationPoint(13F, 6F, -11F);

		bodyModel[185].addShapeBox(0F, 0F, 0F, 4, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 371
		bodyModel[185].setRotationPoint(13F, 6F, 9F);

		bodyModel[186].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 372
		bodyModel[186].setRotationPoint(13F, 2F, 7F);

		bodyModel[187].addBox(-1F, 0F, 0F, 1, 1, 1, 0F); // Box 376 glow
		bodyModel[187].setRotationPoint(42.1F, -13F, 5.5F);
		bodyModel[187].rotateAngleY = 0.43633231F;

		bodyModel[188].addBox(-1F, 0F, -1F, 1, 1, 1, 0F); // Box 377 glow
		bodyModel[188].setRotationPoint(42.1F, -13F, -5.5F);
		bodyModel[188].rotateAngleY = -0.43633231F;

		bodyModel[189].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 378 cull
		bodyModel[189].setRotationPoint(20F, -21F, 7F);

		bodyModel[190].addBox(0F, 0F, 0F, 2, 2, 6, 0F); // Box 453 cull
		bodyModel[190].setRotationPoint(45F, 7F, 3F);

		bodyModel[191].addBox(0F, 0F, 0F, 3, 0, 18, 0F); // Box 454
		bodyModel[191].setRotationPoint(45F, 9F, -9F);

		bodyModel[192].addBox(0F, 0F, 0F, 2, 2, 6, 0F); // Box 455 cull
		bodyModel[192].setRotationPoint(45F, 7F, -9F);

		bodyModel[193].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 479 cull
		bodyModel[193].setRotationPoint(45F, 8F, -2F);

		bodyModel[194].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 339 cull
		bodyModel[194].setRotationPoint(-46F, 8F, -2F);

		bodyModel[195].addShapeBox(0F, 0F, 0F, 3, 2, 8, 0F,-0.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F); // Box 448
		bodyModel[195].setRotationPoint(-47F, 4F, 2F);

		bodyModel[196].addShapeBox(0F, 0F, 0F, 3, 2, 8, 0F,-2.5F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F); // Box 449
		bodyModel[196].setRotationPoint(-47F, 4F, -10F);

		bodyModel[197].addShapeBox(0F, 0F, 0F, 3, 2, 8, 0F,-2F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F); // Box 395
		bodyModel[197].setRotationPoint(45F, 4F, 2F);

		bodyModel[198].addShapeBox(0F, 0F, 0F, 3, 2, 8, 0F,0F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F); // Box 396
		bodyModel[198].setRotationPoint(45F, 4F, -10F);

		bodyModel[199].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F,-0.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0.5F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, -1.5F, 0F, 0F); // Box 397
		bodyModel[199].setRotationPoint(45.5F, 3F, -10F);

		bodyModel[200].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F,-3F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F); // Box 398
		bodyModel[200].setRotationPoint(45F, 3F, 2F);

		bodyModel[201].addShapeBox(0F, 0F, 0F, 1, 5, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 399
		bodyModel[201].setRotationPoint(45F, -5F, 3F);

		bodyModel[202].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F); // Box 400
		bodyModel[202].setRotationPoint(45.5F, -4.5F, 3F);

		bodyModel[203].addBox(0F, 0F, 0F, 3, 1, 21, 0F); // Box 408
		bodyModel[203].setRotationPoint(27.5F, 1F, -10.5F);

		bodyModel[204].addBox(0F, 0F, 0F, 3, 1, 21, 0F); // Box 409
		bodyModel[204].setRotationPoint(-26.5F, 1F, -10.5F);

		bodyModel[205].addBox(0F, 0F, 0F, 79, 1, 4, 0F); // Box 515
		bodyModel[205].setRotationPoint(-39F, 0F, 7F);

		bodyModel[206].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, -2F, 2F, 0F, -2F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 518
		bodyModel[206].setRotationPoint(45.01F, -8F, 11F);
		bodyModel[206].rotateAngleY = -3.14159265F;

		bodyModel[207].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, -2F, 2F, 0F, -2F, 2F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 519
		bodyModel[207].setRotationPoint(45.01F, -8F, -10F);
		bodyModel[207].rotateAngleY = -3.14159265F;

		bodyModel[208].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 399
		bodyModel[208].setRotationPoint(41F, 7F, -11F);

		bodyModel[209].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 400
		bodyModel[209].setRotationPoint(41F, 6F, -9F);

		bodyModel[210].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 401
		bodyModel[210].setRotationPoint(41F, 4F, -10F);

		bodyModel[211].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 402
		bodyModel[211].setRotationPoint(41F, 3F, -8F);

		bodyModel[212].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 403
		bodyModel[212].setRotationPoint(41F, 2F, -9F);

		bodyModel[213].addShapeBox(0F, 0F, 0F, 3, 0, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 404
		bodyModel[213].setRotationPoint(42F, 0F, -8F);

		bodyModel[214].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 405
		bodyModel[214].setRotationPoint(41F, 7F, 9F);

		bodyModel[215].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 406
		bodyModel[215].setRotationPoint(41F, 6F, 9F);

		bodyModel[216].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.6F, 0F, 0F); // Box 407
		bodyModel[216].setRotationPoint(41F, 4F, 8F);

		bodyModel[217].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 408
		bodyModel[217].setRotationPoint(41F, 2F, 7F);

		bodyModel[218].addShapeBox(0F, 0F, 0F, 3, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 409
		bodyModel[218].setRotationPoint(42F, 0F, 7F);

		bodyModel[219].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 410
		bodyModel[219].setRotationPoint(41F, 3F, 8F);

		bodyModel[220].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 403
		bodyModel[220].setRotationPoint(40F, -22.5F, -5F);

		bodyModel[221].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 404
		bodyModel[221].setRotationPoint(40F, -23.5F, -4.5F);

		bodyModel[222].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 405
		bodyModel[222].setRotationPoint(38F, -23.5F, -3.5F);

		bodyModel[223].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 406
		bodyModel[223].setRotationPoint(39F, -23.5F, -5.5F);

		bodyModel[224].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,-1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 164
		bodyModel[224].setRotationPoint(-40F, 1F, -11F);

		bodyModel[225].addBox(0F, 0F, 0F, 0, 9, 18, 0F); // Box 3
		bodyModel[225].setRotationPoint(-44.01F, 0F, -9F);

		bodyModel[226].addBox(0F, 0F, 0F, 0, 6, 1, 0F); // Box 247
		bodyModel[226].setRotationPoint(-44F, 2F, 9F);

		bodyModel[227].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 259
		bodyModel[227].setRotationPoint(-40F, 1F, 7F);

		bodyModel[228].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 262
		bodyModel[228].setRotationPoint(-40F, 0F, 7F);

		bodyModel[229].addBox(0F, 0F, 0F, 2, 3, 14, 0F); // Box 263
		bodyModel[229].setRotationPoint(-41F, 0F, -7F);

		bodyModel[230].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,-1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, -2F); // Box 264
		bodyModel[230].setRotationPoint(-40F, 3F, -11F);

		bodyModel[231].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -2F, -1F, 0F, -2F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 265
		bodyModel[231].setRotationPoint(-40F, 3F, 7F);

		bodyModel[232].addBox(0F, 0F, 0F, 3, 2, 14, 0F); // Box 266
		bodyModel[232].setRotationPoint(-44F, 0F, -7F);

		bodyModel[233].addShapeBox(0F, 0F, 0F, 3, 0, 1, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 271
		bodyModel[233].setRotationPoint(-44F, 0F, -8F);

		bodyModel[234].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 272
		bodyModel[234].setRotationPoint(-44F, 7F, -11F);

		bodyModel[235].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, 0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 273
		bodyModel[235].setRotationPoint(-44F, 4F, -10F);

		bodyModel[236].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 274
		bodyModel[236].setRotationPoint(-44F, 2F, -9F);

		bodyModel[237].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 275
		bodyModel[237].setRotationPoint(-44F, 6F, -9F);

		bodyModel[238].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 276
		bodyModel[238].setRotationPoint(-44F, 3F, -8F);

		bodyModel[239].addShapeBox(0F, 0F, 0F, 3, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 271
		bodyModel[239].setRotationPoint(-44F, 0F, 7F);

		bodyModel[240].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 272
		bodyModel[240].setRotationPoint(-44F, 7F, 9F);

		bodyModel[241].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.6F, 0F, 0F, 0F, 0F, 0F); // Box 273
		bodyModel[241].setRotationPoint(-44F, 4F, 8F);

		bodyModel[242].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 275
		bodyModel[242].setRotationPoint(-44F, 6F, 9F);

		bodyModel[243].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 276
		bodyModel[243].setRotationPoint(-44F, 3F, 8F);

		bodyModel[244].addShapeBox(0F, 0F, 0F, 5, 6, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[244].setRotationPoint(-44F, 2F, -3F);

		bodyModel[245].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 261
		bodyModel[245].setRotationPoint(-40F, 0F, -11F);

		bodyModel[246].addBox(0F, 0F, 0F, 0, 7, 1, 0F); // Box 61
		bodyModel[246].setRotationPoint(-44F, -2F, 10F);

		bodyModel[247].addBox(0F, 0F, 0F, 0, 7, 1, 0F); // Box 63
		bodyModel[247].setRotationPoint(-44F, -2F, -11F);

		bodyModel[248].addBox(0F, 0F, 0F, 4, 2, 3, 0F); // Box 4
		bodyModel[248].setRotationPoint(-48F, 3F, -1.5F);

		bodyModel[249].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 78
		bodyModel[249].setRotationPoint(-44.5F, -2F, 4.5F);

		bodyModel[250].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 188
		bodyModel[250].setRotationPoint(-44.5F, -2F, -6.5F);

		bodyModel[251].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 189 ditchlight front
		bodyModel[251].setRotationPoint(-44.75F, -2F, 4.5F);

		bodyModel[252].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 190 ditchlight front
		bodyModel[252].setRotationPoint(-44.75F, -2F, -6.5F);

		bodyModel[253].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 80
		bodyModel[253].setRotationPoint(-44F, -8F, -7F);

		bodyModel[254].addBox(0F, 0F, 0F, 0, 8, 1, 0F); // Box 144
		bodyModel[254].setRotationPoint(-44F, -8F, -8F);

		bodyModel[255].addBox(0F, 0F, 0F, 0, 8, 6, 0F); // Box 145
		bodyModel[255].setRotationPoint(-45F, -8F, -3F);

		bodyModel[256].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F,1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 147
		bodyModel[256].setRotationPoint(-44F, -8F, 3F);

		bodyModel[257].addBox(0F, 0F, 0F, 0, 8, 1, 0F); // Box 148
		bodyModel[257].setRotationPoint(-44F, -8F, 7F);

		bodyModel[258].addShapeBox(0F, 0F, 0F, 3, 1, 10, 0F,0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F); // Box 4
		bodyModel[258].setRotationPoint(-47F, 6F, 0F);

		bodyModel[259].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F,0.5F, 0F, 0F, -3F, 0F, 0F, -1F, 1F, 0F, -1.5F, 1F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F); // Box 4
		bodyModel[259].setRotationPoint(-47F, 5F, 2F);

		bodyModel[260].addShapeBox(0F, 0F, 0F, 3, 2, 10, 0F,0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 1F, 0F, 0F, -3.5F, 0F, 0F, -1F, 0F, -1F, -1.5F, 0F, -1F); // Box 4
		bodyModel[260].setRotationPoint(-47F, 7F, 0F);

		bodyModel[261].addShapeBox(0F, 0F, 0F, 3, 1, 10, 0F,-2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[261].setRotationPoint(-47F, 6F, -10F);

		bodyModel[262].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F,-2F, 1F, 0F, -0.5F, 1F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 0F, 0F, -1F, 0F, 0F); // Box 4
		bodyModel[262].setRotationPoint(-47.5F, 5F, -10F);

		bodyModel[263].addShapeBox(0F, 0F, 0F, 3, 2, 10, 0F,-2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, -1F, -1F, 0F, -1F, -3.5F, 0F, 0F, 1F, 0F, 0F); // Box 4
		bodyModel[263].setRotationPoint(-47F, 7F, -10F);

		bodyModel[264].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[264].setRotationPoint(-45F, 2.5F, -2F);

		bodyModel[265].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 250
		bodyModel[265].setRotationPoint(-44.5F, 0F, 6F);

		bodyModel[266].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 251 ditchlight front
		bodyModel[266].setRotationPoint(-44.75F, 0F, 6F);

		bodyModel[267].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 252 ditchlight front
		bodyModel[267].setRotationPoint(-44.75F, 0F, -8F);

		bodyModel[268].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 253
		bodyModel[268].setRotationPoint(-44.5F, 0F, -8F);

		bodyModel[269].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 348 cull
		bodyModel[269].setRotationPoint(-44.5F, 1F, -5.5F);

		bodyModel[270].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 349 ditchlight front
		bodyModel[270].setRotationPoint(-44.75F, 1F, -5.5F);

		bodyModel[271].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 350 ditchlight front
		bodyModel[271].setRotationPoint(-44.75F, 1F, 3.5F);

		bodyModel[272].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 351 cull
		bodyModel[272].setRotationPoint(-44.5F, 1F, 3.5F);

		bodyModel[273].addBox(0F, 0F, 0F, 2, 2, 6, 0F); // Box 450 cull
		bodyModel[273].setRotationPoint(-46F, 7F, -9F);

		bodyModel[274].addBox(0F, 0F, 0F, 2, 2, 6, 0F); // Box 451 cull
		bodyModel[274].setRotationPoint(-46F, 7F, 3F);

		bodyModel[275].addBox(0F, 0F, 0F, 3, 0, 18, 0F); // Box 452
		bodyModel[275].setRotationPoint(-47F, 9F, -9F);

		bodyModel[276].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F,-2F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 0F, 0F, -1F, 0F, 0F); // Box 446
		bodyModel[276].setRotationPoint(-47.5F, 3F, -10F);

		bodyModel[277].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F,0.5F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F); // Box 447
		bodyModel[277].setRotationPoint(-47F, 3F, 2F);

		bodyModel[278].addShapeBox(0F, 0F, 0F, 1, 5, 2, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 401
		bodyModel[278].setRotationPoint(-45F, -5F, -5F);

		bodyModel[279].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 402
		bodyModel[279].setRotationPoint(-45.5F, -4.5F, -5F);

		bodyModel[280].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, -2F, 2F, 0F, -2F, 2F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 516
		bodyModel[280].setRotationPoint(-44.01F, -8F, -10F);
		bodyModel[280].rotateAngleY = -3.14159265F;

		bodyModel[281].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, -2F, 2F, 0F, -2F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 517
		bodyModel[281].setRotationPoint(-44.01F, -8F, 11F);
		bodyModel[281].rotateAngleY = -3.14159265F;

		bodyModel[282].addBox(0F, 0F, 0F, 7, 14, 1, 0F); // Box 72
		bodyModel[282].setRotationPoint(-24F, -18F, 10F);

		bodyModel[283].addBox(0F, 0F, 0F, 7, 14, 1, 0F); // Box 190
		bodyModel[283].setRotationPoint(-24F, -18F, -11F);

		bodyModel[284].addBox(0F, 0F, 0F, 15, 4, 22, 0F); // Box 316
		bodyModel[284].setRotationPoint(-27F, -4F, -11F);

		bodyModel[285].addShapeBox(0F, 0F, 0F, 3, 3, 4, 0F,-2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -0.905F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.905F, 0F, 0F); // Box 11
		bodyModel[285].setRotationPoint(-27F, -21F, -11F);

		bodyModel[286].addBox(0F, 0F, 0F, 2, 3, 14, 0F); // Box 211
		bodyModel[286].setRotationPoint(-26F, -21F, -7F);

		bodyModel[287].addBox(0F, 0F, 0F, 2, 3, 2, 0F); // Box 48 lamp
		bodyModel[287].setRotationPoint(-28F, -21F, -1F);

		bodyModel[288].addShapeBox(0F, 0F, 0F, 2, 3, 6, 0F,-1.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.275F, 0F, 0F, -1.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.275F, 0F, 0F); // Box 43
		bodyModel[288].setRotationPoint(-28F, -21F, -7F);

		bodyModel[289].addShapeBox(0F, 0F, 0F, 2, 3, 6, 0F,-0.275F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.9F, 0F, 0F, -0.275F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.9F, 0F, 0F); // Box 44
		bodyModel[289].setRotationPoint(-28F, -21F, 1F);

		bodyModel[290].addBox(0F, 0F, 0F, 0, 2, 5, 0F); // Box 117 liveryimg 2 glow
		bodyModel[290].setRotationPoint(-26.1F, -20.5F, -7F);
		bodyModel[290].rotateAngleY = 0.27925268F;

		bodyModel[291].addBox(0F, 0F, -5F, 0, 2, 5, 0F); // Box 118 liveryimg 2 glow
		bodyModel[291].setRotationPoint(-26.1F, -20.5F, 7F);
		bodyModel[291].rotateAngleY = -0.27925268F;

		bodyModel[292].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F); // Box 186 lamp
		bodyModel[292].setRotationPoint(-28.5F, -21.25F, -1F);

		bodyModel[293].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F); // Box 187 lamp
		bodyModel[293].setRotationPoint(-28.5F, -19.75F, -1F);

		bodyModel[294].addBox(0F, 0F, 0F, 12, 1, 14, 0F); // Box 220
		bodyModel[294].setRotationPoint(-24F, -21F, -7F);

		bodyModel[295].addShapeBox(0F, 0F, 0F, 11, 3, 4, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 221
		bodyModel[295].setRotationPoint(-24F, -21F, -11F);

		bodyModel[296].addShapeBox(0F, 0F, 0F, 11, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 222
		bodyModel[296].setRotationPoint(-24F, -21F, 7F);

		bodyModel[297].addShapeBox(0F, 0F, 0F, 3, 3, 4, 0F,-0.905F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -2F, -3F, 0F, -0.905F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 224
		bodyModel[297].setRotationPoint(-27F, -21F, 7F);

		bodyModel[298].addShapeBox(0F, 0F, 0F, 3, 10, 9, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 42
		bodyModel[298].setRotationPoint(-38F, -10F, -11F);

		bodyModel[299].addShapeBox(0F, 0F, 0F, 3, 10, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 45
		bodyModel[299].setRotationPoint(-38F, -10F, 2F);

		bodyModel[300].addShapeBox(0F, 0F, 0F, 2, 3, 5, 0F,-0.335F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -2F, -3F, 0F, -0.335F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 42
		bodyModel[300].setRotationPoint(-37F, -13F, 6F);

		bodyModel[301].addShapeBox(0F, 0F, 0F, 2, 3, 5, 0F,-2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -0.335F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.335F, 0F, 0F); // Box 42
		bodyModel[301].setRotationPoint(-37F, -13F, -11F);

		bodyModel[302].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 176 glow
		bodyModel[302].setRotationPoint(-26.25F, -19.5F, 7.5F);
		bodyModel[302].rotateAngleY = -0.2443461F;

		bodyModel[303].addBox(0F, 0F, -1F, 1, 1, 1, 0F); // Box 176 glow
		bodyModel[303].setRotationPoint(-26.25F, -19.5F, -7.5F);
		bodyModel[303].rotateAngleY = 0.2443461F;

		bodyModel[304].addBox(0F, 0F, 0F, 8, 10, 22, 0F); // Box 345
		bodyModel[304].setRotationPoint(-35F, -10F, -11F);

		bodyModel[305].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 410 glow
		bodyModel[305].setRotationPoint(-26.5F, -22F, -0.5F);

		bodyModel[306].addBox(0F, 0F, 0F, 0, 4, 1, 0F); // Box 350
		bodyModel[306].setRotationPoint(-24F, -16F, -12F);

		bodyModel[307].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 340 glow
		bodyModel[307].setRotationPoint(-23.5F, -23F, -4.5F);

		bodyModel[308].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0.3F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, 0.3F, -0.5F, 0.1F, 0.3F, 0F, 0.1F, -1F, 0F, 0.1F, -1F, 0F, 0.1F, 0.3F, 0F, 0.1F); // Box 341
		bodyModel[308].setRotationPoint(-23.32F, -22F, -4.5F);

		bodyModel[309].addBox(0F, 0F, 0F, 4, 14, 1, 0F); // Engieer side door
		bodyModel[309].setRotationPoint(-17F, -18F, 10F);

		bodyModel[310].addBox(0F, 0F, 0F, 1, 14, 1, 0F); // Box 72
		bodyModel[310].setRotationPoint(-13F, -18F, 10F);

		bodyModel[311].addBox(0F, 0F, 0F, 4, 14, 1, 0F); // Fireman side door
		bodyModel[311].setRotationPoint(-17F, -18F, -11F);

		bodyModel[312].addBox(0F, 0F, 0F, 1, 14, 21, 0F); // Box 72
		bodyModel[312].setRotationPoint(-13F, -18F, -11F);

		bodyModel[313].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 42
		bodyModel[313].setRotationPoint(-38.5F, -13F, 0F);

		bodyModel[314].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 42
		bodyModel[314].setRotationPoint(-38.5F, -13F, -2F);

		bodyModel[315].addShapeBox(0F, 0F, 0F, 1, 8, 11, 0F,3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, -6F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F); // Box 87
		bodyModel[315].setRotationPoint(-25F, -18F, 0F);

		bodyModel[316].addBox(0F, 0F, 0F, 8, 3, 12, 0F); // Box 345
		bodyModel[316].setRotationPoint(-35F, -13F, -6F);

		bodyModel[317].addShapeBox(0F, 0F, 0F, 8, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 42
		bodyModel[317].setRotationPoint(-35F, -13F, 6F);

		bodyModel[318].addShapeBox(0F, 0F, 0F, 1, 8, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, -6F, 0F, 0F, 6F, 0F, 0F); // Box 87
		bodyModel[318].setRotationPoint(-25F, -18F, -11F);

		bodyModel[319].addShapeBox(0F, 0F, 0F, 3, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.335F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.335F, 0F, 0F); // Box 45
		bodyModel[319].setRotationPoint(-38F, -13F, 2F);

		bodyModel[320].addShapeBox(0F, 0F, 0F, 3, 3, 4, 0F,-1.335F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.335F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 45
		bodyModel[320].setRotationPoint(-38F, -13F, -6F);

		bodyModel[321].addShapeBox(0F, 0F, 0F, 3, 2, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 345
		bodyModel[321].setRotationPoint(-37.5F, -13F, -2F);

		bodyModel[322].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 318
		bodyModel[322].setRotationPoint(-35F, -13.25F, 6.5F);
		bodyModel[322].rotateAngleX = -0.54105207F;

		bodyModel[323].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 318
		bodyModel[323].setRotationPoint(-35F, -12.65F, -7.5F);
		bodyModel[323].rotateAngleX = 0.54105207F;

		bodyModel[324].addBox(0F, 0F, 0F, 1, 10, 4, 0F); // Front door
		bodyModel[324].setRotationPoint(-38F, -11F, -2F);

		bodyModel[325].addBox(0F, 0F, 0F, 3, 6, 1, 0F); // Box 72
		bodyModel[325].setRotationPoint(-27F, -10F, 10F);

		bodyModel[326].addBox(0F, 0F, 0F, 3, 6, 1, 0F); // Box 72
		bodyModel[326].setRotationPoint(-27F, -10F, -11F);

		bodyModel[327].addShapeBox(0F, 0F, 0F, 3, 8, 1, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 72
		bodyModel[327].setRotationPoint(-27F, -18F, -11F);

		bodyModel[328].addShapeBox(0F, 0F, 0F, 3, 8, 1, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 72
		bodyModel[328].setRotationPoint(-27F, -18F, 10F);

		bodyModel[329].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 384
		bodyModel[329].setRotationPoint(-23F, -22.5F, -1.5F);

		bodyModel[330].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 385
		bodyModel[330].setRotationPoint(-21.5F, -22.5F, -0.5F);

		bodyModel[331].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 386
		bodyModel[331].setRotationPoint(-22.25F, -22.5F, 0.5F);

		bodyModel[332].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 354
		bodyModel[332].setRotationPoint(-29.5F, -22.5F, -0.5F);

		bodyModel[333].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 355
		bodyModel[333].setRotationPoint(-27.5F, -22.25F, 0.5F);

		bodyModel[334].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 356
		bodyModel[334].setRotationPoint(-28.5F, -22.25F, -1.5F);

		bodyModel[335].addBox(0F, 0F, 0F, 5, 2, 10, 0F); // Box 348
		bodyModel[335].setRotationPoint(-20.5F, -23F, -5F);

		bodyModel[336].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 42
		bodyModel[336].setRotationPoint(-38.5F, -1F, 0F);

		bodyModel[337].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 42
		bodyModel[337].setRotationPoint(-38.5F, -1F, -2F);

		bodyModel[338].addShapeBox(0F, 0F, 0F, 8, 3, 5, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 42
		bodyModel[338].setRotationPoint(-35F, -13F, -11F);

		bodyModel[339].addBox(0F, 0F, 0F, 0, 4, 1, 0F); // Box 350
		bodyModel[339].setRotationPoint(-24F, -16F, 11F);

		bodyModel[340].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 210
		bodyModel[340].setRotationPoint(-13F, -21F, -11F);

		bodyModel[341].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 223
		bodyModel[341].setRotationPoint(-13F, -21F, 7F);

		bodyModel[342].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 176 lamp
		bodyModel[342].setRotationPoint(-38.5F, -10.25F, -0.75F);

		bodyModel[343].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 177 lamp
		bodyModel[343].setRotationPoint(-38.5F, -8.5F, -0.75F);

		bodyModel[344].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Light mount
		bodyModel[344].setRotationPoint(-38.25F, -10.6F, -1F);
	}
	ModelBapBlombergB theTrucc = new ModelBapBlombergB();
	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		for (int i = 0; i < 345; i++) {
			if (bodyModel[i].boxName != null && bodyModel[i].boxName.contains("Lamp")) {
				Minecraft.getMinecraft().entityRenderer.disableLightmap(1D);
				bodyModel[i].render(f5);
				Minecraft.getMinecraft().entityRenderer.enableLightmap(1D);
			} else if (bodyModel[i].boxName != null && bodyModel[i].boxName.contains("cull")) {
				GL11.glDisable(GL11.GL_CULL_FACE);
				bodyModel[i].render(f5);
				GL11.glEnable(GL11.GL_CULL_FACE);
			} else {
				bodyModel[i].render(f5);
			}
		}

		if (entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor() == 3456) {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/blombergB_Grey.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.5, 0.15, 0);
			theTrucc.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(3, 0, 0);
			theTrucc.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/blombergB_Black.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.55, 0.15, 0);
			theTrucc.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(3.35, 0, 0);
			theTrucc.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		}
	}
	public ArrayList<double[]> getSmokePosition() {
		return new ArrayList<double[]>() {
			{
				add(new double[]{1.15D, 1.45D, 0.0D});
				add(new double[]{0.9D, 1.45D, 0.0D});
				add(new double[]{0.6D, 1.45D, 0.0D});
				add(new double[]{0.35D, 1.45D, 0.0D});
			}
		};
	}
}