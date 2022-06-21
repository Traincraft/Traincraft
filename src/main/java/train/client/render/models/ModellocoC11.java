//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2021 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 29.05.2021 - 23:09:07
// Last changed on: 29.05.2021 - 23:09:07

package train.client.render.models; //Path where the model is located

import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import tmt.ModelConverter;
import tmt.ModelRendererTurbo;
import tmt.Tessellator;
import train.common.library.Info;

public class ModellocoC11 extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModellocoC11() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[393];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 10
		bodyModel[1] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 104
		bodyModel[2] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 106
		bodyModel[3] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 107
		bodyModel[4] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 109
		bodyModel[5] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 11
		bodyModel[6] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 115
		bodyModel[7] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 116
		bodyModel[8] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 116
		bodyModel[9] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 117
		bodyModel[10] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 118
		bodyModel[11] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 118
		bodyModel[12] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 119
		bodyModel[13] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 119
		bodyModel[14] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 120
		bodyModel[15] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 121
		bodyModel[16] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 121
		bodyModel[17] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 123
		bodyModel[18] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 124
		bodyModel[19] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 125
		bodyModel[20] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 127
		bodyModel[21] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 130
		bodyModel[22] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 131
		bodyModel[23] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 138
		bodyModel[24] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 139
		bodyModel[25] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 140
		bodyModel[26] = new ModelRendererTurbo(this, 473, 9, textureX, textureY); // Box 141
		bodyModel[27] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 141
		bodyModel[28] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Box 149
		bodyModel[29] = new ModelRendererTurbo(this, 65, 9, textureX, textureY); // Box 150
		bodyModel[30] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 153
		bodyModel[31] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 154
		bodyModel[32] = new ModelRendererTurbo(this, 81, 9, textureX, textureY); // Box 155
		bodyModel[33] = new ModelRendererTurbo(this, 137, 9, textureX, textureY); // Box 156
		bodyModel[34] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Box 157
		bodyModel[35] = new ModelRendererTurbo(this, 241, 9, textureX, textureY); // Box 158
		bodyModel[36] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 161
		bodyModel[37] = new ModelRendererTurbo(this, 177, 9, textureX, textureY); // Box 164
		bodyModel[38] = new ModelRendererTurbo(this, 137, 17, textureX, textureY); // Box 165
		bodyModel[39] = new ModelRendererTurbo(this, 145, 17, textureX, textureY); // Box 19
		bodyModel[40] = new ModelRendererTurbo(this, 177, 25, textureX, textureY); // Box 199
		bodyModel[41] = new ModelRendererTurbo(this, 289, 25, textureX, textureY); // Box 200
		bodyModel[42] = new ModelRendererTurbo(this, 217, 25, textureX, textureY); // Box 201
		bodyModel[43] = new ModelRendererTurbo(this, 329, 25, textureX, textureY); // Box 201
		bodyModel[44] = new ModelRendererTurbo(this, 369, 25, textureX, textureY); // Box 202
		bodyModel[45] = new ModelRendererTurbo(this, 393, 25, textureX, textureY); // Box 202
		bodyModel[46] = new ModelRendererTurbo(this, 449, 17, textureX, textureY); // Box 203
		bodyModel[47] = new ModelRendererTurbo(this, 121, 25, textureX, textureY); // Box 207
		bodyModel[48] = new ModelRendererTurbo(this, 417, 25, textureX, textureY); // Box 208
		bodyModel[49] = new ModelRendererTurbo(this, 201, 25, textureX, textureY); // Box 210
		bodyModel[50] = new ModelRendererTurbo(this, 473, 25, textureX, textureY); // Box 211
		bodyModel[51] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 214
		bodyModel[52] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 215
		bodyModel[53] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 216
		bodyModel[54] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 217
		bodyModel[55] = new ModelRendererTurbo(this, 169, 17, textureX, textureY); // Box 218
		bodyModel[56] = new ModelRendererTurbo(this, 177, 17, textureX, textureY); // Box 219
		bodyModel[57] = new ModelRendererTurbo(this, 433, 1, textureX, textureY, "lamp"); // headlight box l
		bodyModel[58] = new ModelRendererTurbo(this, 113, 17, textureX, textureY); // Box 230
		bodyModel[59] = new ModelRendererTurbo(this, 89, 17, textureX, textureY); // Box 231
		bodyModel[60] = new ModelRendererTurbo(this, 97, 9, textureX, textureY, "lamp"); // headlight box c
		bodyModel[61] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 238
		bodyModel[62] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 239
		bodyModel[63] = new ModelRendererTurbo(this, 201, 17, textureX, textureY); // Box 240
		bodyModel[64] = new ModelRendererTurbo(this, 417, 9, textureX, textureY); // Box 241
		bodyModel[65] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 242
		bodyModel[66] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 243
		bodyModel[67] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 244
		bodyModel[68] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 245
		bodyModel[69] = new ModelRendererTurbo(this, 377, 17, textureX, textureY); // Box 246
		bodyModel[70] = new ModelRendererTurbo(this, 209, 17, textureX, textureY); // Box 247
		bodyModel[71] = new ModelRendererTurbo(this, 497, 25, textureX, textureY); // Box 248
		bodyModel[72] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 249
		bodyModel[73] = new ModelRendererTurbo(this, 65, 9, textureX, textureY); // Box 251
		bodyModel[74] = new ModelRendererTurbo(this, 505, 9, textureX, textureY); // Box 252
		bodyModel[75] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 253
		bodyModel[76] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 254
		bodyModel[77] = new ModelRendererTurbo(this, 393, 17, textureX, textureY); // Box 255
		bodyModel[78] = new ModelRendererTurbo(this, 217, 25, textureX, textureY); // Box 257
		bodyModel[79] = new ModelRendererTurbo(this, 289, 17, textureX, textureY); // Box 258
		bodyModel[80] = new ModelRendererTurbo(this, 433, 9, textureX, textureY); // Box 260
		bodyModel[81] = new ModelRendererTurbo(this, 449, 9, textureX, textureY); // Box 261
		bodyModel[82] = new ModelRendererTurbo(this, 241, 17, textureX, textureY); // Box 266
		bodyModel[83] = new ModelRendererTurbo(this, 225, 17, textureX, textureY); // Box 267
		bodyModel[84] = new ModelRendererTurbo(this, 297, 17, textureX, textureY); // Box 267
		bodyModel[85] = new ModelRendererTurbo(this, 305, 17, textureX, textureY); // Box 268
		bodyModel[86] = new ModelRendererTurbo(this, 433, 17, textureX, textureY); // Box 268
		bodyModel[87] = new ModelRendererTurbo(this, 89, 33, textureX, textureY); // Box 269
		bodyModel[88] = new ModelRendererTurbo(this, 345, 17, textureX, textureY); // Box 269
		bodyModel[89] = new ModelRendererTurbo(this, 385, 17, textureX, textureY); // Box 270
		bodyModel[90] = new ModelRendererTurbo(this, 65, 25, textureX, textureY); // Box 275
		bodyModel[91] = new ModelRendererTurbo(this, 81, 9, textureX, textureY); // Box 276
		bodyModel[92] = new ModelRendererTurbo(this, 137, 9, textureX, textureY); // Box 277
		bodyModel[93] = new ModelRendererTurbo(this, 169, 17, textureX, textureY); // Box 278
		bodyModel[94] = new ModelRendererTurbo(this, 497, 25, textureX, textureY); // Box 284
		bodyModel[95] = new ModelRendererTurbo(this, 81, 17, textureX, textureY); // Box 285
		bodyModel[96] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 285
		bodyModel[97] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 286
		bodyModel[98] = new ModelRendererTurbo(this, 457, 9, textureX, textureY); // Box 287
		bodyModel[99] = new ModelRendererTurbo(this, 473, 9, textureX, textureY); // Box 288
		bodyModel[100] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Box 293
		bodyModel[101] = new ModelRendererTurbo(this, 145, 33, textureX, textureY); // Box 296
		bodyModel[102] = new ModelRendererTurbo(this, 401, 17, textureX, textureY); // Box 297
		bodyModel[103] = new ModelRendererTurbo(this, 81, 33, textureX, textureY); // Box 298
		bodyModel[104] = new ModelRendererTurbo(this, 465, 17, textureX, textureY); // Box 299
		bodyModel[105] = new ModelRendererTurbo(this, 169, 33, textureX, textureY); // Box 300
		bodyModel[106] = new ModelRendererTurbo(this, 177, 33, textureX, textureY); // Box 302
		bodyModel[107] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Box 310
		bodyModel[108] = new ModelRendererTurbo(this, 81, 25, textureX, textureY); // Box 312
		bodyModel[109] = new ModelRendererTurbo(this, 105, 9, textureX, textureY); // Box 321
		bodyModel[110] = new ModelRendererTurbo(this, 177, 9, textureX, textureY); // Box 322
		bodyModel[111] = new ModelRendererTurbo(this, 313, 9, textureX, textureY); // Box 323
		bodyModel[112] = new ModelRendererTurbo(this, 425, 9, textureX, textureY); // Box 324
		bodyModel[113] = new ModelRendererTurbo(this, 137, 17, textureX, textureY); // Box 325
		bodyModel[114] = new ModelRendererTurbo(this, 177, 17, textureX, textureY); // Box 326
		bodyModel[115] = new ModelRendererTurbo(this, 185, 17, textureX, textureY); // Box 327
		bodyModel[116] = new ModelRendererTurbo(this, 449, 17, textureX, textureY); // Box 328
		bodyModel[117] = new ModelRendererTurbo(this, 201, 17, textureX, textureY); // Box 330
		bodyModel[118] = new ModelRendererTurbo(this, 233, 17, textureX, textureY); // Box 331
		bodyModel[119] = new ModelRendererTurbo(this, 241, 25, textureX, textureY); // Box 332
		bodyModel[120] = new ModelRendererTurbo(this, 249, 25, textureX, textureY); // Box 333
		bodyModel[121] = new ModelRendererTurbo(this, 313, 17, textureX, textureY); // Box 333
		bodyModel[122] = new ModelRendererTurbo(this, 225, 33, textureX, textureY); // Box 334
		bodyModel[123] = new ModelRendererTurbo(this, 289, 33, textureX, textureY); // Box 334
		bodyModel[124] = new ModelRendererTurbo(this, 265, 25, textureX, textureY); // Box 334
		bodyModel[125] = new ModelRendererTurbo(this, 353, 17, textureX, textureY); // Box 334
		bodyModel[126] = new ModelRendererTurbo(this, 313, 33, textureX, textureY); // Box 335
		bodyModel[127] = new ModelRendererTurbo(this, 361, 25, textureX, textureY, "lamp"); // rear lantern c
		bodyModel[128] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Box 337
		bodyModel[129] = new ModelRendererTurbo(this, 273, 25, textureX, textureY); // Box 338
		bodyModel[130] = new ModelRendererTurbo(this, 369, 33, textureX, textureY); // Box 339
		bodyModel[131] = new ModelRendererTurbo(this, 441, 25, textureX, textureY); // Box 339
		bodyModel[132] = new ModelRendererTurbo(this, 369, 33, textureX, textureY); // Box 340
		bodyModel[133] = new ModelRendererTurbo(this, 385, 33, textureX, textureY); // Box 340
		bodyModel[134] = new ModelRendererTurbo(this, 401, 33, textureX, textureY); // Box 341
		bodyModel[135] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 341
		bodyModel[136] = new ModelRendererTurbo(this, 417, 33, textureX, textureY); // Box 342
		bodyModel[137] = new ModelRendererTurbo(this, 449, 33, textureX, textureY); // Box 342
		bodyModel[138] = new ModelRendererTurbo(this, 473, 33, textureX, textureY); // Box 343
		bodyModel[139] = new ModelRendererTurbo(this, 65, 41, textureX, textureY); // Box 343
		bodyModel[140] = new ModelRendererTurbo(this, 81, 41, textureX, textureY); // Box 344
		bodyModel[141] = new ModelRendererTurbo(this, 81, 41, textureX, textureY); // Box 344
		bodyModel[142] = new ModelRendererTurbo(this, 113, 41, textureX, textureY); // Box 345
		bodyModel[143] = new ModelRendererTurbo(this, 129, 41, textureX, textureY); // Box 345
		bodyModel[144] = new ModelRendererTurbo(this, 153, 41, textureX, textureY); // Box 345
		bodyModel[145] = new ModelRendererTurbo(this, 177, 41, textureX, textureY); // Box 346
		bodyModel[146] = new ModelRendererTurbo(this, 185, 41, textureX, textureY); // Box 346
		bodyModel[147] = new ModelRendererTurbo(this, 249, 41, textureX, textureY); // Box 346
		bodyModel[148] = new ModelRendererTurbo(this, 305, 41, textureX, textureY); // Box 347
		bodyModel[149] = new ModelRendererTurbo(this, 193, 33, textureX, textureY); // Box 347
		bodyModel[150] = new ModelRendererTurbo(this, 129, 25, textureX, textureY); // Box 347
		bodyModel[151] = new ModelRendererTurbo(this, 409, 41, textureX, textureY); // Box 348
		bodyModel[152] = new ModelRendererTurbo(this, 329, 25, textureX, textureY); // Box 348
		bodyModel[153] = new ModelRendererTurbo(this, 489, 41, textureX, textureY); // Box 348
		bodyModel[154] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 349
		bodyModel[155] = new ModelRendererTurbo(this, 361, 41, textureX, textureY); // Box 350
		bodyModel[156] = new ModelRendererTurbo(this, 25, 49, textureX, textureY); // Box 350
		bodyModel[157] = new ModelRendererTurbo(this, 201, 41, textureX, textureY); // Box 351
		bodyModel[158] = new ModelRendererTurbo(this, 49, 49, textureX, textureY); // Box 351
		bodyModel[159] = new ModelRendererTurbo(this, 129, 49, textureX, textureY); // Box 351
		bodyModel[160] = new ModelRendererTurbo(this, 169, 49, textureX, textureY); // Box 352
		bodyModel[161] = new ModelRendererTurbo(this, 201, 49, textureX, textureY); // Box 352
		bodyModel[162] = new ModelRendererTurbo(this, 433, 33, textureX, textureY); // Box 352
		bodyModel[163] = new ModelRendererTurbo(this, 273, 41, textureX, textureY); // Box 352
		bodyModel[164] = new ModelRendererTurbo(this, 217, 49, textureX, textureY); // Box 353
		bodyModel[165] = new ModelRendererTurbo(this, 281, 49, textureX, textureY); // Box 353
		bodyModel[166] = new ModelRendererTurbo(this, 321, 49, textureX, textureY); // Box 354
		bodyModel[167] = new ModelRendererTurbo(this, 465, 33, textureX, textureY); // Box 358
		bodyModel[168] = new ModelRendererTurbo(this, 281, 25, textureX, textureY); // Box 360
		bodyModel[169] = new ModelRendererTurbo(this, 449, 33, textureX, textureY); // Box 361
		bodyModel[170] = new ModelRendererTurbo(this, 321, 41, textureX, textureY); // Box 362
		bodyModel[171] = new ModelRendererTurbo(this, 401, 41, textureX, textureY); // Box 363
		bodyModel[172] = new ModelRendererTurbo(this, 345, 57, textureX, textureY); // Box 363
		bodyModel[173] = new ModelRendererTurbo(this, 321, 25, textureX, textureY); // Box 364
		bodyModel[174] = new ModelRendererTurbo(this, 425, 41, textureX, textureY); // Box 364
		bodyModel[175] = new ModelRendererTurbo(this, 17, 49, textureX, textureY); // Box 365
		bodyModel[176] = new ModelRendererTurbo(this, 89, 49, textureX, textureY); // Box 365
		bodyModel[177] = new ModelRendererTurbo(this, 377, 41, textureX, textureY); // Box 367
		bodyModel[178] = new ModelRendererTurbo(this, 337, 49, textureX, textureY); // Box 368
		bodyModel[179] = new ModelRendererTurbo(this, 41, 49, textureX, textureY); // Box 368
		bodyModel[180] = new ModelRendererTurbo(this, 433, 49, textureX, textureY); // Box 368
		bodyModel[181] = new ModelRendererTurbo(this, 297, 49, textureX, textureY); // Box 369
		bodyModel[182] = new ModelRendererTurbo(this, 465, 49, textureX, textureY); // Box 370
		bodyModel[183] = new ModelRendererTurbo(this, 401, 49, textureX, textureY); // Box 371
		bodyModel[184] = new ModelRendererTurbo(this, 489, 33, textureX, textureY); // Box 371
		bodyModel[185] = new ModelRendererTurbo(this, 113, 41, textureX, textureY); // Box 372
		bodyModel[186] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 373
		bodyModel[187] = new ModelRendererTurbo(this, 145, 49, textureX, textureY); // Box 374
		bodyModel[188] = new ModelRendererTurbo(this, 153, 57, textureX, textureY); // Box 374
		bodyModel[189] = new ModelRendererTurbo(this, 241, 49, textureX, textureY); // Box 375
		bodyModel[190] = new ModelRendererTurbo(this, 481, 49, textureX, textureY); // Box 375
		bodyModel[191] = new ModelRendererTurbo(this, 281, 49, textureX, textureY); // Box 376
		bodyModel[192] = new ModelRendererTurbo(this, 441, 57, textureX, textureY); // Box 376
		bodyModel[193] = new ModelRendererTurbo(this, 73, 57, textureX, textureY); // Box 377
		bodyModel[194] = new ModelRendererTurbo(this, 193, 57, textureX, textureY); // Box 382
		bodyModel[195] = new ModelRendererTurbo(this, 241, 57, textureX, textureY); // Box 383
		bodyModel[196] = new ModelRendererTurbo(this, 305, 57, textureX, textureY); // Box 384
		bodyModel[197] = new ModelRendererTurbo(this, 81, 57, textureX, textureY); // Box 386
		bodyModel[198] = new ModelRendererTurbo(this, 113, 57, textureX, textureY); // Box 390
		bodyModel[199] = new ModelRendererTurbo(this, 497, 57, textureX, textureY); // Box 391
		bodyModel[200] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 392
		bodyModel[201] = new ModelRendererTurbo(this, 313, 57, textureX, textureY); // Box 393
		bodyModel[202] = new ModelRendererTurbo(this, 137, 65, textureX, textureY); // Box 394
		bodyModel[203] = new ModelRendererTurbo(this, 473, 57, textureX, textureY); // Box 395
		bodyModel[204] = new ModelRendererTurbo(this, 217, 65, textureX, textureY); // Box 396
		bodyModel[205] = new ModelRendererTurbo(this, 17, 65, textureX, textureY); // Box 397
		bodyModel[206] = new ModelRendererTurbo(this, 73, 65, textureX, textureY); // Box 398
		bodyModel[207] = new ModelRendererTurbo(this, 313, 65, textureX, textureY); // Box 399
		bodyModel[208] = new ModelRendererTurbo(this, 329, 65, textureX, textureY); // Box 400
		bodyModel[209] = new ModelRendererTurbo(this, 337, 65, textureX, textureY); // Box 401
		bodyModel[210] = new ModelRendererTurbo(this, 345, 65, textureX, textureY); // Box 402
		bodyModel[211] = new ModelRendererTurbo(this, 441, 25, textureX, textureY); // Box 402
		bodyModel[212] = new ModelRendererTurbo(this, 353, 65, textureX, textureY); // Box 403
		bodyModel[213] = new ModelRendererTurbo(this, 361, 65, textureX, textureY); // Box 403
		bodyModel[214] = new ModelRendererTurbo(this, 361, 65, textureX, textureY); // Box 403
		bodyModel[215] = new ModelRendererTurbo(this, 409, 65, textureX, textureY); // Box 404
		bodyModel[216] = new ModelRendererTurbo(this, 401, 65, textureX, textureY); // Box 404
		bodyModel[217] = new ModelRendererTurbo(this, 145, 41, textureX, textureY); // Box 404
		bodyModel[218] = new ModelRendererTurbo(this, 321, 33, textureX, textureY); // Box 405
		bodyModel[219] = new ModelRendererTurbo(this, 441, 65, textureX, textureY); // Box 405
		bodyModel[220] = new ModelRendererTurbo(this, 449, 65, textureX, textureY); // Box 405
		bodyModel[221] = new ModelRendererTurbo(this, 481, 65, textureX, textureY); // Box 406
		bodyModel[222] = new ModelRendererTurbo(this, 489, 65, textureX, textureY); // Box 406
		bodyModel[223] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 406
		bodyModel[224] = new ModelRendererTurbo(this, 33, 73, textureX, textureY); // Box 407
		bodyModel[225] = new ModelRendererTurbo(this, 497, 65, textureX, textureY); // Box 407
		bodyModel[226] = new ModelRendererTurbo(this, 377, 41, textureX, textureY); // Box 407
		bodyModel[227] = new ModelRendererTurbo(this, 505, 65, textureX, textureY); // Box 408
		bodyModel[228] = new ModelRendererTurbo(this, 57, 73, textureX, textureY); // Box 409
		bodyModel[229] = new ModelRendererTurbo(this, 81, 73, textureX, textureY); // Box 409
		bodyModel[230] = new ModelRendererTurbo(this, 89, 73, textureX, textureY); // Box 410
		bodyModel[231] = new ModelRendererTurbo(this, 113, 73, textureX, textureY); // Box 410
		bodyModel[232] = new ModelRendererTurbo(this, 89, 73, textureX, textureY); // Box 410
		bodyModel[233] = new ModelRendererTurbo(this, 129, 73, textureX, textureY); // Box 411
		bodyModel[234] = new ModelRendererTurbo(this, 145, 73, textureX, textureY); // Box 411
		bodyModel[235] = new ModelRendererTurbo(this, 161, 73, textureX, textureY); // Box 412
		bodyModel[236] = new ModelRendererTurbo(this, 473, 17, textureX, textureY); // Box 412
		bodyModel[237] = new ModelRendererTurbo(this, 505, 17, textureX, textureY); // Box 413
		bodyModel[238] = new ModelRendererTurbo(this, 177, 73, textureX, textureY); // Box 413
		bodyModel[239] = new ModelRendererTurbo(this, 193, 73, textureX, textureY); // Box 414
		bodyModel[240] = new ModelRendererTurbo(this, 201, 73, textureX, textureY); // Box 414
		bodyModel[241] = new ModelRendererTurbo(this, 217, 73, textureX, textureY); // Box 415
		bodyModel[242] = new ModelRendererTurbo(this, 233, 73, textureX, textureY); // Box 416
		bodyModel[243] = new ModelRendererTurbo(this, 249, 73, textureX, textureY, "lamp"); // rear lantern l
		bodyModel[244] = new ModelRendererTurbo(this, 257, 73, textureX, textureY); // Box 417
		bodyModel[245] = new ModelRendererTurbo(this, 265, 73, textureX, textureY); // Box 418
		bodyModel[246] = new ModelRendererTurbo(this, 281, 73, textureX, textureY, "lamp"); // rear lantern r
		bodyModel[247] = new ModelRendererTurbo(this, 289, 73, textureX, textureY); // Box 419
		bodyModel[248] = new ModelRendererTurbo(this, 305, 73, textureX, textureY); // Box 420
		bodyModel[249] = new ModelRendererTurbo(this, 321, 73, textureX, textureY); // Box 420
		bodyModel[250] = new ModelRendererTurbo(this, 337, 73, textureX, textureY); // Box 421
		bodyModel[251] = new ModelRendererTurbo(this, 433, 73, textureX, textureY); // Box 421
		bodyModel[252] = new ModelRendererTurbo(this, 481, 73, textureX, textureY); // Box 422
		bodyModel[253] = new ModelRendererTurbo(this, 33, 81, textureX, textureY); // Box 422
		bodyModel[254] = new ModelRendererTurbo(this, 401, 73, textureX, textureY); // Box 423
		bodyModel[255] = new ModelRendererTurbo(this, 121, 81, textureX, textureY); // Box 423
		bodyModel[256] = new ModelRendererTurbo(this, 201, 73, textureX, textureY); // Box 423
		bodyModel[257] = new ModelRendererTurbo(this, 185, 41, textureX, textureY); // Box 424
		bodyModel[258] = new ModelRendererTurbo(this, 153, 81, textureX, textureY); // Box 424
		bodyModel[259] = new ModelRendererTurbo(this, 169, 81, textureX, textureY); // Box 425
		bodyModel[260] = new ModelRendererTurbo(this, 265, 81, textureX, textureY); // Box 425
		bodyModel[261] = new ModelRendererTurbo(this, 209, 41, textureX, textureY); // Box 425
		bodyModel[262] = new ModelRendererTurbo(this, 233, 81, textureX, textureY); // Box 426
		bodyModel[263] = new ModelRendererTurbo(this, 97, 41, textureX, textureY); // Box 426
		bodyModel[264] = new ModelRendererTurbo(this, 49, 81, textureX, textureY); // Box 426
		bodyModel[265] = new ModelRendererTurbo(this, 505, 73, textureX, textureY); // Box 427
		bodyModel[266] = new ModelRendererTurbo(this, 185, 81, textureX, textureY); // Box 427
		bodyModel[267] = new ModelRendererTurbo(this, 297, 81, textureX, textureY); // Box 428
		bodyModel[268] = new ModelRendererTurbo(this, 313, 81, textureX, textureY); // Box 429
		bodyModel[269] = new ModelRendererTurbo(this, 489, 57, textureX, textureY); // Box 430
		bodyModel[270] = new ModelRendererTurbo(this, 57, 73, textureX, textureY); // Box 431
		bodyModel[271] = new ModelRendererTurbo(this, 505, 41, textureX, textureY); // Box 432
		bodyModel[272] = new ModelRendererTurbo(this, 161, 81, textureX, textureY); // Box 432
		bodyModel[273] = new ModelRendererTurbo(this, 337, 49, textureX, textureY); // Box 433
		bodyModel[274] = new ModelRendererTurbo(this, 233, 49, textureX, textureY); // Box 433
		bodyModel[275] = new ModelRendererTurbo(this, 49, 81, textureX, textureY); // Box 434
		bodyModel[276] = new ModelRendererTurbo(this, 337, 81, textureX, textureY); // Box 434
		bodyModel[277] = new ModelRendererTurbo(this, 345, 81, textureX, textureY); // Box 434
		bodyModel[278] = new ModelRendererTurbo(this, 473, 65, textureX, textureY); // Box 435
		bodyModel[279] = new ModelRendererTurbo(this, 361, 81, textureX, textureY); // Box 435
		bodyModel[280] = new ModelRendererTurbo(this, 329, 73, textureX, textureY); // Box 435
		bodyModel[281] = new ModelRendererTurbo(this, 393, 81, textureX, textureY); // Box 436
		bodyModel[282] = new ModelRendererTurbo(this, 417, 81, textureX, textureY); // Box 436
		bodyModel[283] = new ModelRendererTurbo(this, 457, 81, textureX, textureY); // Box 436
		bodyModel[284] = new ModelRendererTurbo(this, 465, 81, textureX, textureY); // Box 437
		bodyModel[285] = new ModelRendererTurbo(this, 473, 81, textureX, textureY); // Box 437
		bodyModel[286] = new ModelRendererTurbo(this, 481, 81, textureX, textureY); // Box 438
		bodyModel[287] = new ModelRendererTurbo(this, 217, 81, textureX, textureY); // Box 438
		bodyModel[288] = new ModelRendererTurbo(this, 489, 81, textureX, textureY); // Box 439
		bodyModel[289] = new ModelRendererTurbo(this, 497, 81, textureX, textureY); // Box 439
		bodyModel[290] = new ModelRendererTurbo(this, 201, 81, textureX, textureY); // Box 440
		bodyModel[291] = new ModelRendererTurbo(this, 505, 81, textureX, textureY); // Box 440
		bodyModel[292] = new ModelRendererTurbo(this, 41, 81, textureX, textureY); // Box 441
		bodyModel[293] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 441
		bodyModel[294] = new ModelRendererTurbo(this, 17, 89, textureX, textureY); // Box 442
		bodyModel[295] = new ModelRendererTurbo(this, 65, 89, textureX, textureY); // Box 443
		bodyModel[296] = new ModelRendererTurbo(this, 249, 81, textureX, textureY); // Box 443
		bodyModel[297] = new ModelRendererTurbo(this, 25, 89, textureX, textureY); // Box 444
		bodyModel[298] = new ModelRendererTurbo(this, 89, 89, textureX, textureY); // Box 444
		bodyModel[299] = new ModelRendererTurbo(this, 97, 89, textureX, textureY); // Box 445
		bodyModel[300] = new ModelRendererTurbo(this, 105, 89, textureX, textureY); // Box 445
		bodyModel[301] = new ModelRendererTurbo(this, 201, 89, textureX, textureY); // Box 446
		bodyModel[302] = new ModelRendererTurbo(this, 129, 89, textureX, textureY); // Box 446
		bodyModel[303] = new ModelRendererTurbo(this, 425, 81, textureX, textureY); // Box 447
		bodyModel[304] = new ModelRendererTurbo(this, 233, 89, textureX, textureY); // Box 447
		bodyModel[305] = new ModelRendererTurbo(this, 137, 89, textureX, textureY); // Box 448
		bodyModel[306] = new ModelRendererTurbo(this, 145, 89, textureX, textureY); // Box 449
		bodyModel[307] = new ModelRendererTurbo(this, 249, 89, textureX, textureY); // Box 45
		bodyModel[308] = new ModelRendererTurbo(this, 321, 89, textureX, textureY); // Box 451
		bodyModel[309] = new ModelRendererTurbo(this, 329, 89, textureX, textureY); // Box 452
		bodyModel[310] = new ModelRendererTurbo(this, 361, 89, textureX, textureY); // Box 453
		bodyModel[311] = new ModelRendererTurbo(this, 393, 89, textureX, textureY); // Box 453
		bodyModel[312] = new ModelRendererTurbo(this, 449, 89, textureX, textureY); // Box 454
		bodyModel[313] = new ModelRendererTurbo(this, 409, 89, textureX, textureY); // Box 454
		bodyModel[314] = new ModelRendererTurbo(this, 481, 89, textureX, textureY); // Box 455
		bodyModel[315] = new ModelRendererTurbo(this, 385, 89, textureX, textureY); // Box 455
		bodyModel[316] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 456
		bodyModel[317] = new ModelRendererTurbo(this, 25, 97, textureX, textureY); // Box 456
		bodyModel[318] = new ModelRendererTurbo(this, 41, 97, textureX, textureY); // Box 457
		bodyModel[319] = new ModelRendererTurbo(this, 57, 97, textureX, textureY); // Box 457
		bodyModel[320] = new ModelRendererTurbo(this, 97, 97, textureX, textureY); // Box 458
		bodyModel[321] = new ModelRendererTurbo(this, 121, 97, textureX, textureY); // Box 458
		bodyModel[322] = new ModelRendererTurbo(this, 129, 97, textureX, textureY); // Box 459
		bodyModel[323] = new ModelRendererTurbo(this, 161, 97, textureX, textureY); // Box 459
		bodyModel[324] = new ModelRendererTurbo(this, 177, 97, textureX, textureY); // Box 46
		bodyModel[325] = new ModelRendererTurbo(this, 377, 17, textureX, textureY); // Box 460
		bodyModel[326] = new ModelRendererTurbo(this, 241, 97, textureX, textureY); // Box 460
		bodyModel[327] = new ModelRendererTurbo(this, 249, 97, textureX, textureY); // Box 461
		bodyModel[328] = new ModelRendererTurbo(this, 449, 17, textureX, textureY); // Box 461
		bodyModel[329] = new ModelRendererTurbo(this, 257, 97, textureX, textureY); // Box 462
		bodyModel[330] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 462
		bodyModel[331] = new ModelRendererTurbo(this, 265, 97, textureX, textureY); // Box 463
		bodyModel[332] = new ModelRendererTurbo(this, 17, 25, textureX, textureY); // Box 463
		bodyModel[333] = new ModelRendererTurbo(this, 393, 41, textureX, textureY); // Box 464
		bodyModel[334] = new ModelRendererTurbo(this, 289, 97, textureX, textureY); // Box 464
		bodyModel[335] = new ModelRendererTurbo(this, 305, 89, textureX, textureY); // Box 465
		bodyModel[336] = new ModelRendererTurbo(this, 465, 41, textureX, textureY); // Box 465
		bodyModel[337] = new ModelRendererTurbo(this, 393, 97, textureX, textureY, "lamp"); // headlight box r
		bodyModel[338] = new ModelRendererTurbo(this, 233, 97, textureX, textureY); // Box 466
		bodyModel[339] = new ModelRendererTurbo(this, 321, 97, textureX, textureY); // Box 467
		bodyModel[340] = new ModelRendererTurbo(this, 409, 97, textureX, textureY); // Box 467
		bodyModel[341] = new ModelRendererTurbo(this, 145, 25, textureX, textureY); // Box 468
		bodyModel[342] = new ModelRendererTurbo(this, 417, 97, textureX, textureY); // Box 468
		bodyModel[343] = new ModelRendererTurbo(this, 169, 25, textureX, textureY); // Box 469
		bodyModel[344] = new ModelRendererTurbo(this, 425, 97, textureX, textureY); // Box 469
		bodyModel[345] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 47
		bodyModel[346] = new ModelRendererTurbo(this, 481, 97, textureX, textureY); // Box 470
		bodyModel[347] = new ModelRendererTurbo(this, 489, 97, textureX, textureY); // Box 470
		bodyModel[348] = new ModelRendererTurbo(this, 497, 97, textureX, textureY); // Box 471
		bodyModel[349] = new ModelRendererTurbo(this, 505, 97, textureX, textureY); // Box 471
		bodyModel[350] = new ModelRendererTurbo(this, 449, 25, textureX, textureY); // Box 472
		bodyModel[351] = new ModelRendererTurbo(this, 65, 105, textureX, textureY); // Box 472
		bodyModel[352] = new ModelRendererTurbo(this, 81, 105, textureX, textureY); // Box 473
		bodyModel[353] = new ModelRendererTurbo(this, 201, 33, textureX, textureY); // Box 473
		bodyModel[354] = new ModelRendererTurbo(this, 97, 105, textureX, textureY); // Box 48
		bodyModel[355] = new ModelRendererTurbo(this, 161, 105, textureX, textureY); // Box 49
		bodyModel[356] = new ModelRendererTurbo(this, 225, 105, textureX, textureY); // Box 50
		bodyModel[357] = new ModelRendererTurbo(this, 289, 105, textureX, textureY); // Box 51
		bodyModel[358] = new ModelRendererTurbo(this, 353, 105, textureX, textureY); // Box 56
		bodyModel[359] = new ModelRendererTurbo(this, 377, 105, textureX, textureY); // Box 6
		bodyModel[360] = new ModelRendererTurbo(this, 401, 105, textureX, textureY); // Box 62
		bodyModel[361] = new ModelRendererTurbo(this, 417, 105, textureX, textureY); // Box 64
		bodyModel[362] = new ModelRendererTurbo(this, 433, 105, textureX, textureY); // Box 65
		bodyModel[363] = new ModelRendererTurbo(this, 457, 105, textureX, textureY); // Box 67
		bodyModel[364] = new ModelRendererTurbo(this, 49, 113, textureX, textureY); // Box 69
		bodyModel[365] = new ModelRendererTurbo(this, 81, 113, textureX, textureY); // Box 69
		bodyModel[366] = new ModelRendererTurbo(this, 465, 105, textureX, textureY); // Box 73
		bodyModel[367] = new ModelRendererTurbo(this, 121, 113, textureX, textureY); // Box 74
		bodyModel[368] = new ModelRendererTurbo(this, 145, 113, textureX, textureY); // Box 77
		bodyModel[369] = new ModelRendererTurbo(this, 185, 113, textureX, textureY); // Box 79
		bodyModel[370] = new ModelRendererTurbo(this, 81, 121, textureX, textureY); // Box 8
		bodyModel[371] = new ModelRendererTurbo(this, 393, 113, textureX, textureY); // Box 80
		bodyModel[372] = new ModelRendererTurbo(this, 193, 89, textureX, textureY); // Box 81
		bodyModel[373] = new ModelRendererTurbo(this, 145, 121, textureX, textureY); // Box 9
		bodyModel[374] = new ModelRendererTurbo(this, 225, 89, textureX, textureY); // Box 92
		bodyModel[375] = new ModelRendererTurbo(this, 497, 105, textureX, textureY); // Box 93
		bodyModel[376] = new ModelRendererTurbo(this, 209, 121, textureX, textureY); // Box 94
		bodyModel[377] = new ModelRendererTurbo(this, 209, 113, textureX, textureY); // Box 95
		bodyModel[378] = new ModelRendererTurbo(this, 233, 121, textureX, textureY); // Box 419
		bodyModel[379] = new ModelRendererTurbo(this, 257, 121, textureX, textureY); // Box 420
		bodyModel[380] = new ModelRendererTurbo(this, 137, 113, textureX, textureY); // Box 421
		bodyModel[381] = new ModelRendererTurbo(this, 281, 121, textureX, textureY); // Box 422
		bodyModel[382] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 423
		bodyModel[383] = new ModelRendererTurbo(this, 337, 113, textureX, textureY); // Box 424
		bodyModel[384] = new ModelRendererTurbo(this, 305, 121, textureX, textureY); // Box 425
		bodyModel[385] = new ModelRendererTurbo(this, 377, 33, textureX, textureY); // Box 426
		bodyModel[386] = new ModelRendererTurbo(this, 345, 113, textureX, textureY); // Box 387
		bodyModel[387] = new ModelRendererTurbo(this, 153, 105, textureX, textureY); // Box 388
		bodyModel[388] = new ModelRendererTurbo(this, 217, 105, textureX, textureY); // Box 389
		bodyModel[389] = new ModelRendererTurbo(this, 369, 113, textureX, textureY); // Box 390
		bodyModel[390] = new ModelRendererTurbo(this, 497, 113, textureX, textureY); // Box 391
		bodyModel[391] = new ModelRendererTurbo(this, 105, 121, textureX, textureY); // Box 392
		bodyModel[392] = new ModelRendererTurbo(this, 169, 121, textureX, textureY); // Box 393

		bodyModel[0].addBox(0F, 0F, 0F, 11, 11, 0, 0F); // Box 10
		bodyModel[0].setRotationPoint(4F, -1F, 5.05F);

		bodyModel[1].addBox(0F, 0F, 0F, 3, 4, 3, 0F); // Box 104
		bodyModel[1].setRotationPoint(-25F, -19.5F, -1.5F);

		bodyModel[2].addBox(0F, 0F, 0F, 4, 2, 3, 0F); // Box 106
		bodyModel[2].setRotationPoint(-17F, -17.5F, -1.5F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 3, 2, 4, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 107
		bodyModel[3].setRotationPoint(-6F, -17.5F, -2F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 16, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 109
		bodyModel[4].setRotationPoint(8F, -17F, -11F);

		bodyModel[5].addBox(0F, 0F, 0F, 11, 11, 0, 0F); // Box 11
		bodyModel[5].setRotationPoint(4F, -1F, -5.05F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 1, 1, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 115
		bodyModel[6].setRotationPoint(8F, -17F, -10F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 116
		bodyModel[7].setRotationPoint(8F, -18F, -10F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 16, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 116
		bodyModel[8].setRotationPoint(8F, -17F, 10F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 1, 1, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 117
		bodyModel[9].setRotationPoint(18F, -2F, -11F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 4, 14, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 118
		bodyModel[10].setRotationPoint(19F, -15F, -11F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 118
		bodyModel[11].setRotationPoint(8F, -19F, -4F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 119
		bodyModel[12].setRotationPoint(23F, -19F, -4F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 1, 15, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 119
		bodyModel[13].setRotationPoint(23F, -16F, -11F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 10, 14, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 120
		bodyModel[14].setRotationPoint(9F, -16F, 10F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 10, 1, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 121
		bodyModel[15].setRotationPoint(9F, -3F, -10F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 1, 1, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 121
		bodyModel[16].setRotationPoint(23F, -17F, -10F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 123
		bodyModel[17].setRotationPoint(19F, -16F, -11F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 6, 1, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 124
		bodyModel[18].setRotationPoint(18F, -1F, -11F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 14, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 125
		bodyModel[19].setRotationPoint(9F, -19F, -4F);

		bodyModel[20].addBox(0F, 0F, 0F, 1, 2, 20, 0F); // Box 127
		bodyModel[20].setRotationPoint(-36F, 2F, -10F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 130
		bodyModel[21].setRotationPoint(-27F, 5F, -5F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 131
		bodyModel[22].setRotationPoint(-24F, 5F, -5F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 4, 14, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 138
		bodyModel[23].setRotationPoint(19F, -15F, 10F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 139
		bodyModel[24].setRotationPoint(19F, -16F, 10F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 10, 11, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 140
		bodyModel[25].setRotationPoint(24F, -11F, -11F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 8, 5, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 141
		bodyModel[26].setRotationPoint(0F, -6.5F, -5F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 10, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 141
		bodyModel[27].setRotationPoint(24F, -17F, -6F);

		bodyModel[28].addBox(0F, 0F, 0F, 1, 4, 20, 0F); // Box 149
		bodyModel[28].setRotationPoint(34F, 0F, -10F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 150
		bodyModel[29].setRotationPoint(34F, 4F, -4F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 153
		bodyModel[30].setRotationPoint(23F, -18F, -10F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 154
		bodyModel[31].setRotationPoint(8F, -18F, 4F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 155
		bodyModel[32].setRotationPoint(23F, -18F, 4F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 14, 1, 6, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 156
		bodyModel[33].setRotationPoint(9F, -19F, -10F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 14, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F); // Box 157
		bodyModel[34].setRotationPoint(9F, -19F, 4F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 1, 11, 20, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 158
		bodyModel[35].setRotationPoint(34F, -11F, -10F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 1, 6, 10, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 161
		bodyModel[36].setRotationPoint(34F, -17F, -5F);

		bodyModel[37].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 164
		bodyModel[37].setRotationPoint(-39F, 2.5F, -1.5F);

		bodyModel[38].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 165
		bodyModel[38].setRotationPoint(35F, 2.5F, -1.5F);

		bodyModel[39].addBox(0F, 0F, 0F, 3, 3, 10, 0F); // Box 19
		bodyModel[39].setRotationPoint(8F, 3F, -5F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 13, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F); // Box 199
		bodyModel[40].setRotationPoint(20F, 0.5F, -9F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 13, 3, 3, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 200
		bodyModel[41].setRotationPoint(20F, 0.5F, 6F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 7, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 201
		bodyModel[42].setRotationPoint(24F, -17F, -6F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 10, 11, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 201
		bodyModel[43].setRotationPoint(24F, -11F, 5F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 10, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 202
		bodyModel[44].setRotationPoint(24F, -17F, 5F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 7, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 202
		bodyModel[45].setRotationPoint(24F, -17F, 5F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 1, 3, 10, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 203
		bodyModel[46].setRotationPoint(31F, -17F, -5F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 4, 3, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 207
		bodyModel[47].setRotationPoint(31F, -14F, -6F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 10, 6, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 208
		bodyModel[48].setRotationPoint(24F, -17F, -6F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 1, 5, 10, 0F,0F, 0F, 1F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 210
		bodyModel[49].setRotationPoint(34F, -16F, -5F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 10, 6, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 211
		bodyModel[50].setRotationPoint(24F, -17F, 5F);

		bodyModel[51].addBox(0F, 0F, 0F, 1, 1, 0, 0F); // Box 214
		bodyModel[51].setRotationPoint(-27F, -14F, -9.5F);

		bodyModel[52].addBox(0F, 0F, 0F, 1, 1, 0, 0F); // Box 215
		bodyModel[52].setRotationPoint(-24F, -14F, -9.5F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 216
		bodyModel[53].setRotationPoint(-27F, -15F, -8.5F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 217
		bodyModel[54].setRotationPoint(-24F, -15F, -8.5F);

		bodyModel[55].addBox(0F, 0F, 0F, 1, 0, 5, 0F); // Box 218
		bodyModel[55].setRotationPoint(-27F, -15F, -8.5F);

		bodyModel[56].addBox(0F, 0F, 0F, 1, 0, 5, 0F); // Box 219
		bodyModel[56].setRotationPoint(-24F, -15F, -8.5F);

		bodyModel[57].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // headlight box l
		bodyModel[57].setRotationPoint(-27.5F, -17F, -7.5F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 10, 2, 1, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -2F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 230
		bodyModel[58].setRotationPoint(-32F, -12F, -10F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,-1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 231
		bodyModel[59].setRotationPoint(-30F, -13F, -10F);

		bodyModel[60].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // headlight box c
		bodyModel[60].setRotationPoint(-28F, -17.5F, -1F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 238
		bodyModel[61].setRotationPoint(-35F, -2F, -3F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 239
		bodyModel[62].setRotationPoint(-35F, -2F, 2F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 240
		bodyModel[63].setRotationPoint(-35F, -2F, -2F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 0, 6, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 241
		bodyModel[64].setRotationPoint(-34.5F, -8F, -2.5F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 242
		bodyModel[65].setRotationPoint(-30F, -4F, -3.5F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 243
		bodyModel[66].setRotationPoint(-30F, -4F, 2.5F);

		bodyModel[67].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 244
		bodyModel[67].setRotationPoint(1F, -18F, -1F);

		bodyModel[68].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 245
		bodyModel[68].setRotationPoint(3F, -18F, -1F);

		bodyModel[69].addBox(0F, 0F, 0F, 2, 2, 3, 0F); // Box 246
		bodyModel[69].setRotationPoint(6F, -18F, -2.5F);

		bodyModel[70].addBox(0F, 0F, 0F, 5, 3, 0, 0F); // Box 247
		bodyModel[70].setRotationPoint(3F, -19F, 1.5F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 0, 6, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 248
		bodyModel[71].setRotationPoint(-33F, -8F, -2.5F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 249
		bodyModel[72].setRotationPoint(-35F, -1F, 4F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 251
		bodyModel[73].setRotationPoint(-35F, -1F, -5F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 252
		bodyModel[74].setRotationPoint(-28F, -17.5F, 1.25F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 1, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 253
		bodyModel[75].setRotationPoint(-29F, -3F, -9F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 1, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 254
		bodyModel[76].setRotationPoint(-31F, -1F, -9F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 255
		bodyModel[77].setRotationPoint(-5.5F, 6F, -7F);

		bodyModel[78].addBox(0F, -2F, 0F, 0, 2, 17, 0F); // Box 257
		bodyModel[78].setRotationPoint(-37F, 2.5F, -8.5F);
		bodyModel[78].rotateAngleZ = -0.40142573F;

		bodyModel[79].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 258
		bodyModel[79].setRotationPoint(-35F, 2F, -9.5F);

		bodyModel[80].addBox(0F, 0F, 0F, 2, 0, 1, 0F); // Box 260
		bodyModel[80].setRotationPoint(-35F, 4.5F, -10.5F);

		bodyModel[81].addBox(0F, 0F, 0F, 2, 0, 1, 0F); // Box 261
		bodyModel[81].setRotationPoint(-35F, 7F, -10.5F);

		bodyModel[82].addBox(0F, 0F, 0F, 8, 1, 1, 0F); // Box 266
		bodyModel[82].setRotationPoint(-23F, 2F, -7.5F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 1, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 267
		bodyModel[83].setRotationPoint(-13F, -6F, -10F);

		bodyModel[84].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 267
		bodyModel[84].setRotationPoint(-19.5F, 3F, -7.5F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 1, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 268
		bodyModel[85].setRotationPoint(-13F, -8F, -8.5F);

		bodyModel[86].addBox(0F, 0F, 0F, 6, 1, 1, 0F); // Box 268
		bodyModel[86].setRotationPoint(-25.5F, 4F, -7.5F);

		bodyModel[87].addShapeBox(0F, -0.5F, 0F, 15, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 269
		bodyModel[87].setRotationPoint(-19F, 4F, -8F);
		bodyModel[87].rotateAngleZ = -0.19198622F;

		bodyModel[88].addShapeBox(0F, 0F, 0F, 1, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 269
		bodyModel[88].setRotationPoint(-13F, -6F, 8F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 1, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 270
		bodyModel[89].setRotationPoint(-13F, -8F, 6.5F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 275
		bodyModel[90].setRotationPoint(-20F, -1F, -5F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 276
		bodyModel[91].setRotationPoint(-20F, -2F, -4F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 277
		bodyModel[92].setRotationPoint(-14F, -2F, -4F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 278
		bodyModel[93].setRotationPoint(-17F, -1F, -4F);

		bodyModel[94].addBox(0F, 0F, 0F, 6, 3, 1, 0F); // Box 284
		bodyModel[94].setRotationPoint(12F, -2F, -11F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 2, 0, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 285
		bodyModel[95].setRotationPoint(6F, -16F, -10F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 285
		bodyModel[96].setRotationPoint(18.5F, 0F, -10.5F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 286
		bodyModel[97].setRotationPoint(21.5F, 0F, -10.5F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 3, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 287
		bodyModel[98].setRotationPoint(18.5F, 3F, -10.5F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 3, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 288
		bodyModel[99].setRotationPoint(18.5F, 6F, -10.5F);

		bodyModel[100].addBox(0F, 0F, 0F, 6, 3, 1, 0F); // Box 293
		bodyModel[100].setRotationPoint(12F, -2F, 10F);

		bodyModel[101].addBox(0F, 0F, 0F, 12, 3, 0, 0F); // Box 296
		bodyModel[101].setRotationPoint(3F, 0F, 8F);

		bodyModel[102].addBox(0F, 0F, 0F, 5, 1, 0, 0F); // Box 297
		bodyModel[102].setRotationPoint(15F, 2F, 8F);

		bodyModel[103].addBox(0F, 0F, 0F, 1, 1, 4, 0F); // Box 298
		bodyModel[103].setRotationPoint(-13F, -16.5F, -2F);

		bodyModel[104].addBox(0F, 0F, 0F, 3, 4, 0, 0F); // Box 299
		bodyModel[104].setRotationPoint(-11F, -12.5F, -6.5F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 3, 0, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F); // Box 300
		bodyModel[105].setRotationPoint(-11F, -12.5F, -6.5F);

		bodyModel[106].addBox(0F, 0F, 0F, 3, 1, 5, 0F); // Box 302
		bodyModel[106].setRotationPoint(-11F, -16.5F, -2.5F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F); // Box 310
		bodyModel[107].setRotationPoint(6F, -16F, -10F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 2, 0, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 312
		bodyModel[108].setRotationPoint(6F, -16F, 7F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 321
		bodyModel[109].setRotationPoint(7F, -16F, -10F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 322
		bodyModel[110].setRotationPoint(7F, -16F, -7F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F); // Box 323
		bodyModel[111].setRotationPoint(6F, -16F, -7F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F); // Box 324
		bodyModel[112].setRotationPoint(6F, -16F, 10F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 325
		bodyModel[113].setRotationPoint(7F, -16F, 10F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 326
		bodyModel[114].setRotationPoint(7F, -16F, 7F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F); // Box 327
		bodyModel[115].setRotationPoint(6F, -16F, 7F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 1, 0, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 328
		bodyModel[116].setRotationPoint(24F, -16F, -10F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 330
		bodyModel[117].setRotationPoint(24F, -16F, -10F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 331
		bodyModel[118].setRotationPoint(24F, -16F, -7F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 1, 0, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 332
		bodyModel[119].setRotationPoint(24F, -16F, 7F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 1F, -0.5F); // Box 333
		bodyModel[120].setRotationPoint(-22F, -2F, -7F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 333
		bodyModel[121].setRotationPoint(24F, -16F, 10F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,0F, -1.5F, 0.5F, 0F, -1.5F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 334
		bodyModel[122].setRotationPoint(-26F, -6F, 4.5F);

		bodyModel[123].addBox(0F, 0F, 0F, 11, 11, 0, 0F); // Box 334
		bodyModel[123].setRotationPoint(-22F, -1F, -5.05F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 334
		bodyModel[124].setRotationPoint(-22F, -2F, -9F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 334
		bodyModel[125].setRotationPoint(24F, -16F, 7F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 335
		bodyModel[126].setRotationPoint(34F, -15F, -2F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F); // rear lantern c
		bodyModel[127].setRotationPoint(35F, -14.5F, -1.25F);

		bodyModel[128].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 337
		bodyModel[128].setRotationPoint(35F, -2F, -8F);

		bodyModel[129].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 338
		bodyModel[129].setRotationPoint(35F, -2F, 7F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 339
		bodyModel[130].setRotationPoint(-35F, 2F, 3F);

		bodyModel[131].addBox(0F, 0F, 0F, 0, 15, 3, 0F); // Box 339
		bodyModel[131].setRotationPoint(35.5F, -15F, -6F);

		bodyModel[132].addBox(0F, -2F, 0F, 0, 2, 16, 0F); // Box 340
		bodyModel[132].setRotationPoint(35F, 3F, -8F);
		bodyModel[132].rotateAngleZ = -0.40142573F;

		bodyModel[133].addShapeBox(0F, 0F, 0F, 3, 6, 3, 0F,0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 340
		bodyModel[133].setRotationPoint(-2F, -12.5F, -6.5F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 3, 3, 3, 0F,0F, -3F, 0F, 0F, -2.5F, 0.5F, 0F, 0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 341
		bodyModel[134].setRotationPoint(-2F, -15.5F, -6F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 30, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 341
		bodyModel[135].setRotationPoint(-31F, 1F, 3F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 3, 3, 3, 0F,0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -2.5F, 0.5F, 0F, 0.5F, -0.5F, 0F, 0F, 0F); // Box 342
		bodyModel[136].setRotationPoint(-2F, -6.5F, -6F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 2, 2, 8, 0F,-1F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 3F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 3F, 0F, 0F); // Box 342
		bodyModel[137].setRotationPoint(-34.5F, 6.5F, -8F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 3, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0F); // Box 343
		bodyModel[138].setRotationPoint(-2F, -5F, -3F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F,-2F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -5F, 0F, 0F, 3F, 0F, 0F); // Box 343
		bodyModel[139].setRotationPoint(-35.5F, 8.5F, -8F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 3, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, 0F, -2.5F, 0.5F, 0F, -3F, 0F); // Box 344
		bodyModel[140].setRotationPoint(-2F, -6.5F, 3F);

		bodyModel[141].addBox(0F, 0F, 0F, 5, 4, 20, 0F); // Box 344
		bodyModel[141].setRotationPoint(-27F, -3F, -10F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -5F, 0F, 0F, 3F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 2F, 0F, 0F); // Box 345
		bodyModel[142].setRotationPoint(-35.5F, 5.5F, -8F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 5, 1, 3, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 345
		bodyModel[143].setRotationPoint(-27F, 6F, -8.5F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 7, 9, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 345
		bodyModel[144].setRotationPoint(1F, -16F, 3.5F);

		bodyModel[145].addBox(0F, 0F, 0F, 1, 3, 3, 0F); // Box 346
		bodyModel[145].setRotationPoint(-28F, 3F, -9F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 2, 2, 8, 0F,3F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 3F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 346
		bodyModel[146].setRotationPoint(-34.5F, 6.5F, 0F);

		bodyModel[147].addBox(0F, 0F, 0F, 7, 10, 7, 0F); // Box 346
		bodyModel[147].setRotationPoint(1F, -16F, -3.5F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F,2F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 3F, 0F, 0F, -5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 347
		bodyModel[148].setRotationPoint(-35.5F, 8.5F, 0F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F); // Box 347
		bodyModel[149].setRotationPoint(-28F, -0.5F, -9.5F);

		bodyModel[150].addBox(0F, 0F, 0F, 1, 5, 0, 0F); // Box 347
		bodyModel[150].setRotationPoint(33F, 3F, -4.05F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F,3F, 0F, 0F, -5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 2F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 348
		bodyModel[151].setRotationPoint(-35.5F, 5.5F, 0F);

		bodyModel[152].addBox(0F, 0F, 0F, 1, 5, 0, 0F); // Box 348
		bodyModel[152].setRotationPoint(33F, 3F, 4.05F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 5, 5, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 348
		bodyModel[153].setRotationPoint(-27F, 1F, -10F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 2, 2, 8, 0F,0F, 0F, 0F, -1F, 0F, 0F, 3F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 3F, 0F, 0F, -4F, 0F, 0F); // Box 349
		bodyModel[154].setRotationPoint(32.5F, 6.5F, -8F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 5, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 350
		bodyModel[155].setRotationPoint(-27F, 6F, 5.5F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 3F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, -4F, 0F, 0F); // Box 350
		bodyModel[156].setRotationPoint(32.5F, 5.5F, -8F);

		bodyModel[157].addBox(0F, 0F, 0F, 1, 3, 3, 0F); // Box 351
		bodyModel[157].setRotationPoint(-28F, 3F, 6F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 1, 15, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 351
		bodyModel[158].setRotationPoint(23F, -16F, 3F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F,0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, -4F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 3F, 0F, 0F, -5F, 0F, 0F); // Box 351
		bodyModel[159].setRotationPoint(32.5F, 8.5F, -8F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F,-4F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 3F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 352
		bodyModel[160].setRotationPoint(32.5F, 8.5F, 0F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 1, 10, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 352
		bodyModel[161].setRotationPoint(23F, -16F, -3F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 352
		bodyModel[162].setRotationPoint(-28F, -0.5F, 7.5F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 2, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 352
		bodyModel[163].setRotationPoint(-29F, 3F, 3F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 5, 5, 4, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 353
		bodyModel[164].setRotationPoint(-27F, 1F, 6F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 2, 2, 8, 0F,-4F, 0F, 0F, 3F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 3F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 353
		bodyModel[165].setRotationPoint(32.5F, 6.5F, 0F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F,-5F, 0F, 0F, 3F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -4F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 354
		bodyModel[166].setRotationPoint(32.5F, 5.5F, 0F);

		bodyModel[167].addBox(0F, 0F, 0F, 4, 2, 2, 0F); // Box 358
		bodyModel[167].setRotationPoint(-18F, -6F, -9F);

		bodyModel[168].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 360
		bodyModel[168].setRotationPoint(-5F, -18F, 2F);

		bodyModel[169].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 361
		bodyModel[169].setRotationPoint(-13F, -6F, 6F);

		bodyModel[170].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 362
		bodyModel[170].setRotationPoint(-16F, -6F, 6F);

		bodyModel[171].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 363
		bodyModel[171].setRotationPoint(-22F, -7F, 6.5F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 43, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 363
		bodyModel[172].setRotationPoint(-27F, 6F, 3F);

		bodyModel[173].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 364
		bodyModel[173].setRotationPoint(-21.5F, -5F, 7F);

		bodyModel[174].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 364
		bodyModel[174].setRotationPoint(15F, -6.5F, -10F);

		bodyModel[175].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, -1.5F, 0.5F, 0F, -1.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 365
		bodyModel[175].setRotationPoint(-26F, -6F, -6.5F);

		bodyModel[176].addShapeBox(0F, 0F, 0F, 1, 5, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 365
		bodyModel[176].setRotationPoint(18F, -11.5F, -10F);

		bodyModel[177].addBox(0F, 0F, 0F, 0, 2, 5, 0F); // Box 367
		bodyModel[177].setRotationPoint(-8F, -18.5F, -2.5F);

		bodyModel[178].addShapeBox(0F, 0F, 0F, 10, 1, 5, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 368
		bodyModel[178].setRotationPoint(9F, -20F, -2.5F);

		bodyModel[179].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 368
		bodyModel[179].setRotationPoint(16F, -5.5F, -10F);

		bodyModel[180].addShapeBox(0F, 0F, 0F, 10, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 368
		bodyModel[180].setRotationPoint(6F, 1F, 3F);

		bodyModel[181].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 369
		bodyModel[181].setRotationPoint(4F, 2F, 3F);

		bodyModel[182].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 370
		bodyModel[182].setRotationPoint(0F, 2F, 3F);

		bodyModel[183].addShapeBox(0F, 0F, -1.5F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 371
		bodyModel[183].setRotationPoint(12F, -10.5F, -6.5F);

		bodyModel[184].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 371
		bodyModel[184].setRotationPoint(-1F, 2F, 3F);

		bodyModel[185].addBox(0F, 0F, 0F, 1, 3, 2, 0F); // Box 372
		bodyModel[185].setRotationPoint(7F, 3F, 3F);

		bodyModel[186].addBox(0F, 0F, 0F, 1, 3, 2, 0F); // Box 373
		bodyModel[186].setRotationPoint(11F, 3F, 3F);

		bodyModel[187].addBox(0F, 0F, 0F, 1, 3, 2, 0F); // Box 374
		bodyModel[187].setRotationPoint(-3F, 3F, 3F);

		bodyModel[188].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 374
		bodyModel[188].setRotationPoint(-25.5F, -19.5F, -2F);

		bodyModel[189].addBox(0F, 0F, 0F, 1, 3, 2, 0F); // Box 375
		bodyModel[189].setRotationPoint(-7F, 3F, 3F);

		bodyModel[190].addShapeBox(0F, 0F, 0F, 1, 5, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 375
		bodyModel[190].setRotationPoint(22F, -7.5F, -9F);

		bodyModel[191].addBox(0F, 0F, 0F, 1, 3, 2, 0F); // Box 376
		bodyModel[191].setRotationPoint(-15F, 3F, 3F);

		bodyModel[192].addBox(0F, 0F, 0F, 12, 2, 0, 0F); // Box 376
		bodyModel[192].setRotationPoint(-4F, -18F, 3F);

		bodyModel[193].addBox(0F, 0F, 0F, 1, 3, 2, 0F); // Box 377
		bodyModel[193].setRotationPoint(-19F, 3F, 3F);

		bodyModel[194].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 382
		bodyModel[194].setRotationPoint(-11F, 3F, 3F);

		bodyModel[195].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 383
		bodyModel[195].setRotationPoint(0F, 4F, 3F);

		bodyModel[196].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 384
		bodyModel[196].setRotationPoint(3F, 4F, 3F);

		bodyModel[197].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 386
		bodyModel[197].setRotationPoint(-33F, 2F, 3F);

		bodyModel[198].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 390
		bodyModel[198].setRotationPoint(7F, 8F, 3F);

		bodyModel[199].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 391
		bodyModel[199].setRotationPoint(-7F, 8F, 3F);

		bodyModel[200].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 392
		bodyModel[200].setRotationPoint(-20F, 8F, 3F);

		bodyModel[201].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 393
		bodyModel[201].setRotationPoint(-35F, 2F, -5F);

		bodyModel[202].addShapeBox(0F, 0F, 0F, 30, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 394
		bodyModel[202].setRotationPoint(-31F, 1F, -5F);

		bodyModel[203].addShapeBox(0F, 0F, 0F, 2, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 395
		bodyModel[203].setRotationPoint(-29F, 3F, -5F);

		bodyModel[204].addShapeBox(0F, 0F, 0F, 43, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 396
		bodyModel[204].setRotationPoint(-27F, 6F, -5F);

		bodyModel[205].addShapeBox(0F, 0F, 0F, 10, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 397
		bodyModel[205].setRotationPoint(6F, 1F, -5F);

		bodyModel[206].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 398
		bodyModel[206].setRotationPoint(4F, 2F, -5F);

		bodyModel[207].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 399
		bodyModel[207].setRotationPoint(0F, 2F, -5F);

		bodyModel[208].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 400
		bodyModel[208].setRotationPoint(-1F, 2F, -5F);

		bodyModel[209].addBox(0F, 0F, 0F, 1, 3, 2, 0F); // Box 401
		bodyModel[209].setRotationPoint(7F, 3F, -5F);

		bodyModel[210].addBox(0F, 0F, 0F, 1, 3, 2, 0F); // Box 402
		bodyModel[210].setRotationPoint(11F, 3F, -5F);

		bodyModel[211].addBox(0F, 0F, 0F, 1, 0, 2, 0F); // Box 402
		bodyModel[211].setRotationPoint(35.5F, 5.5F, -10F);

		bodyModel[212].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 403
		bodyModel[212].setRotationPoint(35F, 3F, -9F);

		bodyModel[213].addBox(0F, 0F, 0F, 1, 3, 2, 0F); // Box 403
		bodyModel[213].setRotationPoint(-3F, 3F, -5F);

		bodyModel[214].addShapeBox(0F, 0F, 0F, 11, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 403
		bodyModel[214].setRotationPoint(24F, -1F, -5F);

		bodyModel[215].addShapeBox(0F, 0F, 0F, 11, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 404
		bodyModel[215].setRotationPoint(-11F, -9F, -11F);

		bodyModel[216].addBox(0F, 0F, 0F, 1, 3, 2, 0F); // Box 404
		bodyModel[216].setRotationPoint(-7F, 3F, -5F);

		bodyModel[217].addBox(0F, 0F, 0F, 2, 0, 2, 0F); // Box 404
		bodyModel[217].setRotationPoint(34.5F, 8F, -10F);

		bodyModel[218].addBox(0F, 0F, 0F, 1, 0, 2, 0F); // Box 405
		bodyModel[218].setRotationPoint(35.5F, 5.5F, 8F);

		bodyModel[219].addBox(0F, 0F, 0F, 1, 3, 2, 0F); // Box 405
		bodyModel[219].setRotationPoint(-15F, 3F, -5F);

		bodyModel[220].addShapeBox(0F, 0F, 0F, 8, 10, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 405
		bodyModel[220].setRotationPoint(0F, -10F, -11F);

		bodyModel[221].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 406
		bodyModel[221].setRotationPoint(35F, 3F, 8F);

		bodyModel[222].addBox(0F, 0F, 0F, 1, 3, 2, 0F); // Box 406
		bodyModel[222].setRotationPoint(-19F, 3F, -5F);

		bodyModel[223].addShapeBox(0F, 0F, 0F, 12, 10, 3, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -1F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 406
		bodyModel[223].setRotationPoint(-12F, -10F, -10F);

		bodyModel[224].addShapeBox(0F, 0F, 0F, 12, 1, 1, 0F,-1F, -0.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 407
		bodyModel[224].setRotationPoint(-12F, -10F, -11F);

		bodyModel[225].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 407
		bodyModel[225].setRotationPoint(-11F, 3F, -5F);

		bodyModel[226].addBox(0F, 0F, 0F, 2, 0, 2, 0F); // Box 407
		bodyModel[226].setRotationPoint(34.5F, 8F, 8F);

		bodyModel[227].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 408
		bodyModel[227].setRotationPoint(0F, 4F, -5F);

		bodyModel[228].addBox(0F, 0F, 0F, 3, 3, 10, 0F); // Box 409
		bodyModel[228].setRotationPoint(-6F, 3F, -5F);

		bodyModel[229].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 409
		bodyModel[229].setRotationPoint(3F, 4F, -5F);

		bodyModel[230].addBox(0F, 0F, 0F, 3, 3, 10, 0F); // Box 410
		bodyModel[230].setRotationPoint(-18F, 3F, -5F);

		bodyModel[231].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 410
		bodyModel[231].setRotationPoint(1F, -11F, 7.5F);

		bodyModel[232].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 410
		bodyModel[232].setRotationPoint(-33F, 2F, -5F);

		bodyModel[233].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 411
		bodyModel[233].setRotationPoint(1F, -11F, -10.5F);

		bodyModel[234].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 411
		bodyModel[234].setRotationPoint(7F, 8F, -5F);

		bodyModel[235].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 412
		bodyModel[235].setRotationPoint(-7F, 8F, -5F);

		bodyModel[236].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 412
		bodyModel[236].setRotationPoint(19F, -20F, -2.5F);

		bodyModel[237].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 413
		bodyModel[237].setRotationPoint(19F, -20F, 2.5F);

		bodyModel[238].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 413
		bodyModel[238].setRotationPoint(-19F, 8F, -5F);

		bodyModel[239].addShapeBox(0F, 0F, 0F, 1, 7, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 414
		bodyModel[239].setRotationPoint(16F, 1F, -5F);

		bodyModel[240].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 414
		bodyModel[240].setRotationPoint(8F, -2F, -11F);

		bodyModel[241].addShapeBox(0F, 0F, 0F, 4, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 415
		bodyModel[241].setRotationPoint(17F, 1F, -5F);

		bodyModel[242].addShapeBox(0F, 0F, 0F, 4, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 416
		bodyModel[242].setRotationPoint(17F, 1F, 3F);

		bodyModel[243].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F); // rear lantern l
		bodyModel[243].setRotationPoint(35F, -10F, -9.25F);

		bodyModel[244].addShapeBox(0F, 0F, 0F, 1, 7, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 417
		bodyModel[244].setRotationPoint(16F, 1F, 3F);

		bodyModel[245].addShapeBox(0F, 0F, 0F, 4, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 418
		bodyModel[245].setRotationPoint(21F, 1F, -5F);

		bodyModel[246].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // rear lantern r
		bodyModel[246].setRotationPoint(35F, -10F, 7.25F);

		bodyModel[247].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 419
		bodyModel[247].setRotationPoint(8F, -2F, 10F);

		bodyModel[248].addShapeBox(0F, 0F, 0F, 4, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 420
		bodyModel[248].setRotationPoint(21F, 1F, 3F);

		bodyModel[249].addShapeBox(0F, 0F, 0F, 2, 9, 3, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 420
		bodyModel[249].setRotationPoint(9F, -16F, -6.5F);

		bodyModel[250].addShapeBox(0F, 0F, 0F, 9, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 421
		bodyModel[250].setRotationPoint(25F, 1F, -5F);

		bodyModel[251].addBox(0F, 0F, 0F, 2, 9, 7, 0F); // Box 421
		bodyModel[251].setRotationPoint(9F, -16F, -3.5F);

		bodyModel[252].addShapeBox(0F, 0F, 0F, 9, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 422
		bodyModel[252].setRotationPoint(25F, 1F, 3F);

		bodyModel[253].addShapeBox(0F, 0F, 0F, 2, 9, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 422
		bodyModel[253].setRotationPoint(9F, -16F, 3.5F);

		bodyModel[254].addShapeBox(0F, 0F, 0F, 0, 7, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 423
		bodyModel[254].setRotationPoint(-33F, -6F, 6F);

		bodyModel[255].addShapeBox(0F, 0F, 0F, 15, 1, 2, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 423
		bodyModel[255].setRotationPoint(19F, 0F, -5F);

		bodyModel[256].addShapeBox(0F, 0F, 0F, 2, 4, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 423
		bodyModel[256].setRotationPoint(9F, -7F, -5.5F);

		bodyModel[257].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 424
		bodyModel[257].setRotationPoint(9F, -7F, -6.5F);

		bodyModel[258].addShapeBox(0F, 0F, 0F, 0, 7, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 424
		bodyModel[258].setRotationPoint(-33F, -6F, -10F);

		bodyModel[259].addShapeBox(0F, 0F, 0F, 0, 6, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 425
		bodyModel[259].setRotationPoint(35.05F, -6F, -2.5F);

		bodyModel[260].addShapeBox(0F, 0F, 0F, 15, 1, 2, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 425
		bodyModel[260].setRotationPoint(19F, 0F, 3F);

		bodyModel[261].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 425
		bodyModel[261].setRotationPoint(9F, -7F, 5.5F);

		bodyModel[262].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 426
		bodyModel[262].setRotationPoint(15F, -6.5F, 6F);

		bodyModel[263].addBox(0F, 0F, 0F, 1, 5, 0, 0F); // Box 426
		bodyModel[263].setRotationPoint(-35F, 3F, 4.05F);

		bodyModel[264].addShapeBox(0F, 0F, 0F, 0, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 426
		bodyModel[264].setRotationPoint(-28.5F, -14F, -3F);

		bodyModel[265].addBox(0F, 0F, 0F, 1, 5, 0, 0F); // Box 427
		bodyModel[265].setRotationPoint(-35F, 3F, -4.05F);

		bodyModel[266].addShapeBox(0F, 0F, 0F, 1, 5, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 427
		bodyModel[266].setRotationPoint(18F, -11.5F, 6F);

		bodyModel[267].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 428
		bodyModel[267].setRotationPoint(16F, -5.5F, 6F);

		bodyModel[268].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 429
		bodyModel[268].setRotationPoint(11F, -10F, -7F);

		bodyModel[269].addShapeBox(0F, 0.5F, -7F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 430
		bodyModel[269].setRotationPoint(11F, -13F, 4F);
		bodyModel[269].rotateAngleX = 0.36651914F;

		bodyModel[270].addShapeBox(0F, 0.5F, -3F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 431
		bodyModel[270].setRotationPoint(11F, -13F, 4F);
		bodyModel[270].rotateAngleX = 0.36651914F;

		bodyModel[271].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 432
		bodyModel[271].setRotationPoint(11F, -15F, -3F);

		bodyModel[272].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -0.5F, -2F, 0F, -0.5F); // Box 432
		bodyModel[272].setRotationPoint(-20F, -1F, 4F);

		bodyModel[273].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 433
		bodyModel[273].setRotationPoint(-20F, -2F, 3F);

		bodyModel[274].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 433
		bodyModel[274].setRotationPoint(11F, -15F, 2F);

		bodyModel[275].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 434
		bodyModel[275].setRotationPoint(-14F, -2F, 3F);

		bodyModel[276].addShapeBox(-0.5F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 434
		bodyModel[276].setRotationPoint(-4.5F, 4F, -9F);

		bodyModel[277].addShapeBox(0F, 0F, 0F, 2, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 434
		bodyModel[277].setRotationPoint(12F, -8F, 3F);

		bodyModel[278].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 435
		bodyModel[278].setRotationPoint(-17F, -1F, 3F);

		bodyModel[279].addShapeBox(0F, -0.5F, 0F, 11, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 435
		bodyModel[279].setRotationPoint(-14.5F, 2F, -9F);
		bodyModel[279].rotateAngleZ = -0.2443461F;

		bodyModel[280].addShapeBox(-0.5F, 0F, -0.5F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 435
		bodyModel[280].setRotationPoint(13F, -9F, 4F);

		bodyModel[281].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 436
		bodyModel[281].setRotationPoint(-13.5F, 3F, -4F);

		bodyModel[282].addShapeBox(-0.5F, 0F, -1.5F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 436
		bodyModel[282].setRotationPoint(13F, -10F, 4F);

		bodyModel[283].addShapeBox(-0.5F, -2F, 0F, 1, 5, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 436
		bodyModel[283].setRotationPoint(-13.5F, -0.5F, -9F);
		bodyModel[283].rotateAngleZ = -0.17453293F;

		bodyModel[284].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 437
		bodyModel[284].setRotationPoint(10F, -18F, -3F);

		bodyModel[285].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 437
		bodyModel[285].setRotationPoint(-8.5F, 3F, -4F);

		bodyModel[286].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 438
		bodyModel[286].setRotationPoint(10F, -18F, 1.5F);

		bodyModel[287].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -0.5F, -2F, 0F, -0.5F); // Box 438
		bodyModel[287].setRotationPoint(-13.5F, 4F, -3F);

		bodyModel[288].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 439
		bodyModel[288].setRotationPoint(10F, -18F, -1.5F);

		bodyModel[289].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 439
		bodyModel[289].setRotationPoint(-13.5F, 3F, 3F);

		bodyModel[290].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 440
		bodyModel[290].setRotationPoint(-30.5F, 4F, -8F);

		bodyModel[291].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 440
		bodyModel[291].setRotationPoint(-8.5F, 3F, 3F);

		bodyModel[292].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 441
		bodyModel[292].setRotationPoint(-29F, 0.25F, -8.75F);

		bodyModel[293].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 441
		bodyModel[293].setRotationPoint(-13.5F, 4F, 2F);

		bodyModel[294].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 442
		bodyModel[294].setRotationPoint(-2F, -2F, -4F);

		bodyModel[295].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 443
		bodyModel[295].setRotationPoint(-8F, -1F, -5F);

		bodyModel[296].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 443
		bodyModel[296].setRotationPoint(-17.5F, 6F, -6F);

		bodyModel[297].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 444
		bodyModel[297].setRotationPoint(-5F, -1F, -4F);

		bodyModel[298].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 444
		bodyModel[298].setRotationPoint(8.5F, 6F, -6F);

		bodyModel[299].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 445
		bodyModel[299].setRotationPoint(-8F, -2F, -4F);

		bodyModel[300].addBox(0F, 0F, 0F, 10, 1, 1, 0F); // Box 445
		bodyModel[300].setRotationPoint(-15.5F, 6.5F, -6F);

		bodyModel[301].addBox(0F, 0F, 0F, 12, 1, 1, 0F); // Box 446
		bodyModel[301].setRotationPoint(-3.5F, 6.5F, -6F);

		bodyModel[302].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 446
		bodyModel[302].setRotationPoint(-2F, -2F, 3F);

		bodyModel[303].addShapeBox(0F, -0.5F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 447
		bodyModel[303].setRotationPoint(-14F, -1F, -9F);

		bodyModel[304].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -0.5F, -2F, 0F, -0.5F); // Box 447
		bodyModel[304].setRotationPoint(-8F, -1F, 4F);

		bodyModel[305].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 448
		bodyModel[305].setRotationPoint(-5F, -1F, 3F);

		bodyModel[306].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 449
		bodyModel[306].setRotationPoint(-8F, -2F, 3F);

		bodyModel[307].addShapeBox(0F, 0F, 0F, 26, 3, 3, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 45
		bodyModel[307].setRotationPoint(-28F, -15.5F, -6F);

		bodyModel[308].addShapeBox(-0.5F, -3F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 451
		bodyModel[308].setRotationPoint(-20.5F, 2F, -8F);
		bodyModel[308].rotateAngleZ = 0.12217305F;

		bodyModel[309].addShapeBox(0F, 0F, 0F, 11, 9, 1, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 452
		bodyModel[309].setRotationPoint(-11F, -9F, 10F);

		bodyModel[310].addShapeBox(0F, 0F, 0F, 8, 10, 4, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 453
		bodyModel[310].setRotationPoint(0F, -10F, 7F);

		bodyModel[311].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 453
		bodyModel[311].setRotationPoint(-5.5F, 6F, 5F);

		bodyModel[312].addShapeBox(0F, 0F, 0F, 12, 10, 3, 0F,0F, -1F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 454
		bodyModel[312].setRotationPoint(-12F, -10F, 7F);

		bodyModel[313].addBox(0F, 0F, 0F, 8, 1, 1, 0F); // Box 454
		bodyModel[313].setRotationPoint(-23F, 2F, 6.5F);

		bodyModel[314].addShapeBox(0F, 0F, 0F, 12, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 455
		bodyModel[314].setRotationPoint(-12F, -10F, 10F);

		bodyModel[315].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 455
		bodyModel[315].setRotationPoint(-19.5F, 3F, 6.5F);

		bodyModel[316].addShapeBox(0F, 0F, 0F, 10, 6, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 456
		bodyModel[316].setRotationPoint(-32F, -10F, 9F);

		bodyModel[317].addBox(0F, 0F, 0F, 6, 1, 1, 0F); // Box 456
		bodyModel[317].setRotationPoint(-25.5F, 4F, 6.5F);

		bodyModel[318].addShapeBox(0F, 0F, 0F, 5, 5, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -5F, -0.5F, 0F, -5F, 0F, 0F, 0F, 0F); // Box 457
		bodyModel[318].setRotationPoint(-32F, -4F, 9F);

		bodyModel[319].addShapeBox(0F, -0.5F, 0F, 15, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 457
		bodyModel[319].setRotationPoint(-19F, 4F, 7F);
		bodyModel[319].rotateAngleZ = -0.19198622F;

		bodyModel[320].addShapeBox(0F, 0F, 0F, 10, 2, 1, 0F,-2F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 458
		bodyModel[320].setRotationPoint(-32F, -12F, 9F);

		bodyModel[321].addShapeBox(-0.5F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 458
		bodyModel[321].setRotationPoint(-4.5F, 4F, 8F);

		bodyModel[322].addShapeBox(0F, -0.5F, 0F, 11, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 459
		bodyModel[322].setRotationPoint(-14.5F, 2F, 8F);
		bodyModel[322].rotateAngleZ = -0.2443461F;

		bodyModel[323].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 459
		bodyModel[323].setRotationPoint(-30F, -13F, 9F);

		bodyModel[324].addShapeBox(0F, 0F, 0F, 26, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 46
		bodyModel[324].setRotationPoint(-28F, -15.5F, 3F);

		bodyModel[325].addBox(0F, 0F, 0F, 1, 1, 0, 0F); // Box 460
		bodyModel[325].setRotationPoint(-27F, -14F, 9.5F);

		bodyModel[326].addShapeBox(-0.5F, -2F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 460
		bodyModel[326].setRotationPoint(-13.5F, -0.5F, 8F);
		bodyModel[326].rotateAngleZ = -0.17453293F;

		bodyModel[327].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 461
		bodyModel[327].setRotationPoint(-17.5F, 6F, 5F);

		bodyModel[328].addBox(0F, 0F, 0F, 1, 1, 0, 0F); // Box 461
		bodyModel[328].setRotationPoint(-24F, -14F, 9.5F);

		bodyModel[329].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 462
		bodyModel[329].setRotationPoint(8.5F, 6F, 5F);

		bodyModel[330].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 462
		bodyModel[330].setRotationPoint(-27F, -15F, 8.5F);

		bodyModel[331].addBox(0F, 0F, 0F, 10, 1, 1, 0F); // Box 463
		bodyModel[331].setRotationPoint(-15.5F, 6.5F, 5F);

		bodyModel[332].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 463
		bodyModel[332].setRotationPoint(-24F, -15F, 8.5F);

		bodyModel[333].addBox(0F, 0F, 0F, 1, 0, 5, 0F); // Box 464
		bodyModel[333].setRotationPoint(-27F, -15F, 3.5F);

		bodyModel[334].addBox(0F, 0F, 0F, 12, 1, 1, 0F); // Box 464
		bodyModel[334].setRotationPoint(-3.5F, 6.5F, 5F);

		bodyModel[335].addShapeBox(0F, -0.5F, 0F, 2, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 465
		bodyModel[335].setRotationPoint(-14F, -1F, 8F);

		bodyModel[336].addBox(0F, 0F, 0F, 1, 0, 5, 0F); // Box 465
		bodyModel[336].setRotationPoint(-24F, -15F, 3.5F);

		bodyModel[337].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // headlight box r
		bodyModel[337].setRotationPoint(-27.5F, -17F, 5.5F);

		bodyModel[338].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 466
		bodyModel[338].setRotationPoint(-22F, -2F, 6F);

		bodyModel[339].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 467
		bodyModel[339].setRotationPoint(-35F, 2F, 8.5F);

		bodyModel[340].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 1F, -0.5F); // Box 467
		bodyModel[340].setRotationPoint(-22F, -2F, 8F);

		bodyModel[341].addBox(0F, 0F, 0F, 2, 0, 1, 0F); // Box 468
		bodyModel[341].setRotationPoint(-35F, 4.5F, 9.5F);

		bodyModel[342].addShapeBox(-0.5F, -3F, 0F, 1, 6, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 468
		bodyModel[342].setRotationPoint(-20.5F, 2F, 7F);
		bodyModel[342].rotateAngleZ = 0.12217305F;

		bodyModel[343].addBox(0F, 0F, 0F, 2, 0, 1, 0F); // Box 469
		bodyModel[343].setRotationPoint(-35F, 7F, 9.5F);

		bodyModel[344].addShapeBox(0F, -0.5F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 469
		bodyModel[344].setRotationPoint(-21F, -1.5F, 7F);
		bodyModel[344].rotateAngleZ = -0.05235988F;

		bodyModel[345].addBox(0F, 0F, 0F, 26, 12, 6, 0F); // Box 47
		bodyModel[345].setRotationPoint(-28F, -15.5F, -3F);

		bodyModel[346].addShapeBox(0F, 0F, 0F, 1, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 470
		bodyModel[346].setRotationPoint(-29F, -3F, 7F);

		bodyModel[347].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 470
		bodyModel[347].setRotationPoint(18.5F, 0F, 9.5F);

		bodyModel[348].addShapeBox(0F, 0F, 0F, 1, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 471
		bodyModel[348].setRotationPoint(-31F, -1F, 7F);

		bodyModel[349].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 471
		bodyModel[349].setRotationPoint(21.5F, 0F, 9.5F);

		bodyModel[350].addShapeBox(0F, 0F, 0F, 3, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 472
		bodyModel[350].setRotationPoint(18.5F, 3F, 9.5F);

		bodyModel[351].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 472
		bodyModel[351].setRotationPoint(28F, -12F, 7F);

		bodyModel[352].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 473
		bodyModel[352].setRotationPoint(28F, -12F, -10F);

		bodyModel[353].addShapeBox(0F, 0F, 0F, 3, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 473
		bodyModel[353].setRotationPoint(18.5F, 6F, 9.5F);

		bodyModel[354].addShapeBox(0F, 0F, 0F, 26, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 48
		bodyModel[354].setRotationPoint(-28F, -6.5F, -6F);

		bodyModel[355].addShapeBox(0F, 0F, 0F, 26, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F); // Box 49
		bodyModel[355].setRotationPoint(-28F, -6.5F, 3F);

		bodyModel[356].addBox(0F, 0F, 0F, 26, 6, 3, 0F); // Box 50
		bodyModel[356].setRotationPoint(-28F, -12.5F, -6F);

		bodyModel[357].addBox(0F, 0F, 0F, 26, 6, 3, 0F); // Box 51
		bodyModel[357].setRotationPoint(-28F, -12.5F, 3F);

		bodyModel[358].addShapeBox(0F, 0F, 0F, 7, 9, 3, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 56
		bodyModel[358].setRotationPoint(1F, -16F, -6.5F);

		bodyModel[359].addBox(0F, 0F, 0F, 11, 11, 0, 0F); // Box 6
		bodyModel[359].setRotationPoint(-22F, -1F, 5.05F);

		bodyModel[360].addShapeBox(0F, 0F, 0F, 3, 3, 3, 0F,0F, 0F, 0F, 0F, 0.5F, -0.5F, 0F, -2.5F, 0.5F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, 0F, 0F); // Box 62
		bodyModel[360].setRotationPoint(-2F, -15.5F, 3F);

		bodyModel[361].addShapeBox(0F, 0F, 0F, 3, 6, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.5F); // Box 64
		bodyModel[361].setRotationPoint(-2F, -12.5F, 3.5F);

		bodyModel[362].addShapeBox(0F, 0F, 0F, 3, 2, 6, 0F,0F, -0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 65
		bodyModel[362].setRotationPoint(-2F, -16F, -3F);

		bodyModel[363].addShapeBox(0F, 0F, 0F, 10, 14, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 67
		bodyModel[363].setRotationPoint(9F, -16F, -11F);

		bodyModel[364].addBox(0F, 0F, 0F, 4, 1, 20, 0F); // Box 69
		bodyModel[364].setRotationPoint(-36F, 1F, -10F);

		bodyModel[365].addBox(0F, 0F, 0F, 15, 1, 4, 0F); // Box 69
		bodyModel[365].setRotationPoint(-27F, -4F, -10F);

		bodyModel[366].addShapeBox(0F, 0F, 0F, 1, 14, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		bodyModel[366].setRotationPoint(8F, -16F, -11F);

		bodyModel[367].addShapeBox(0F, 0F, 0F, 5, 6, 5, 0F,0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[367].setRotationPoint(-32F, -4F, -10F);

		bodyModel[368].addBox(0F, 0F, 0F, 15, 1, 4, 0F); // Box 77
		bodyModel[368].setRotationPoint(-27F, -4F, 6F);

		bodyModel[369].addShapeBox(0F, 0F, 0F, 5, 6, 5, 0F,0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F); // Box 79
		bodyModel[369].setRotationPoint(-32F, -4F, 5F);

		bodyModel[370].addBox(0F, 0F, 0F, 11, 11, 0, 0F); // Box 8
		bodyModel[370].setRotationPoint(-10F, -1F, 5.05F);

		bodyModel[371].addShapeBox(0F, 0F, 0F, 4, 3, 10, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F); // Box 80
		bodyModel[371].setRotationPoint(-33F, -2F, -5F);

		bodyModel[372].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 81
		bodyModel[372].setRotationPoint(-29F, -4F, -5F);

		bodyModel[373].addBox(0F, 0F, 0F, 11, 11, 0, 0F); // Box 9
		bodyModel[373].setRotationPoint(-10F, -1F, -5.05F);

		bodyModel[374].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 92
		bodyModel[374].setRotationPoint(-29F, -4F, 2F);

		bodyModel[375].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 93
		bodyModel[375].setRotationPoint(-29F, -3F, -2F);

		bodyModel[376].addShapeBox(0F, 0F, 0F, 10, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 94
		bodyModel[376].setRotationPoint(-32F, -10F, -10F);

		bodyModel[377].addShapeBox(0F, 0F, 0F, 5, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, -0.5F, 0F, 0F, -0.5F); // Box 95
		bodyModel[377].setRotationPoint(-32F, -4F, -10F);

		bodyModel[378].addShapeBox(0F, 0F, 0F, 10, 8, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 419
		bodyModel[378].setRotationPoint(9F, -16F, -10.5F);

		bodyModel[379].addShapeBox(0F, 0F, 0F, 10, 8, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 420
		bodyModel[379].setRotationPoint(9F, -16F, 10.5F);

		bodyModel[380].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 421
		bodyModel[380].setRotationPoint(-22F, -3F, 6.5F);

		bodyModel[381].addShapeBox(0F, -0.5F, 0F, 8, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 422
		bodyModel[381].setRotationPoint(-21F, -1.5F, -8F);
		bodyModel[381].rotateAngleZ = -0.05235988F;

		bodyModel[382].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 423
		bodyModel[382].setRotationPoint(-22F, -17.5F, -1F);

		bodyModel[383].addShapeBox(0F, 0F, 0F, 0, 12, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 424
		bodyModel[383].setRotationPoint(-28.05F, -15.5F, -6F);

		bodyModel[384].addBox(0F, 0F, 0F, 12, 3, 0, 0F); // Box 425
		bodyModel[384].setRotationPoint(3F, 0F, -8F);

		bodyModel[385].addBox(0F, 0F, 0F, 5, 1, 0, 0F); // Box 426
		bodyModel[385].setRotationPoint(15F, 2F, -8F);

		bodyModel[386].addShapeBox(0F, 0F, 0F, 1, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 387
		bodyModel[386].setRotationPoint(11F, -8F, -2.5F);

		bodyModel[387].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 388
		bodyModel[387].setRotationPoint(-30.5F, 4F, 7F);

		bodyModel[388].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 389
		bodyModel[388].setRotationPoint(-29F, 0.25F, 7.75F);

		bodyModel[389].addShapeBox(0F, 0F, 0F, 0, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 390
		bodyModel[389].setRotationPoint(35.5F, -11F, -3F);

		bodyModel[390].addShapeBox(0F, 0F, 0F, 6, 3, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 391
		bodyModel[390].setRotationPoint(-4.5F, -7F, -11.05F);

		bodyModel[391].addShapeBox(0F, 0F, 0F, 6, 3, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 392
		bodyModel[391].setRotationPoint(-4.5F, -7F, 11.05F);

		bodyModel[392].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 393
		bodyModel[392].setRotationPoint(-36F, 4F, -4F);
	}
	ModellocoC11truckFront frontTruck = new ModellocoC11truckFront();
	ModellocoC11truckRear rearTruck = new ModellocoC11truckRear();

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{

		for(ModelRendererTurbo m :bodyModel)
		{
			if(m.boxName.equals("lamp")){
				Minecraft.getMinecraft().entityRenderer.disableLightmap(1D);
			}
			m.render(f5);
			if(m.boxName.equals("lamp")){
				Minecraft.getMinecraft().entityRenderer.enableLightmap(1D);
			}
		}



		Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/locoC11truckFront.png"));

		GL11.glPushMatrix();
		GL11.glScalef(1f,1f,1f);
		GL11.glTranslatef(-1.6f, -0.0f,0.0f);
		frontTruck.render(entity, f, f1, f2, f3, f4, f5);
		GL11.glPopMatrix();

		Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/locoC11truckRear.png"));

		GL11.glPushMatrix();
		GL11.glTranslatef(1.5f, 0f,0);
		rearTruck.render(entity, f, f1, f2, f3, f4, f5);
		GL11.glPopMatrix();
	}
}