//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2021 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 25.07.2021 - 11:49:07
// Last changed on: 25.07.2021 - 11:49:07

package train.client.render.models; //Path where the model is located

import tmt.ModelConverter;
import tmt.ModelRendererTurbo;

import java.util.ArrayList;

public class ModelGarrattBack extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelGarrattBack() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[148];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 249, 33, textureX, textureY); // Box 21
		bodyModel[1] = new ModelRendererTurbo(this, 369, 33, textureX, textureY); // Box 22
		bodyModel[2] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 23
		bodyModel[3] = new ModelRendererTurbo(this, 89, 57, textureX, textureY); // Box 24
		bodyModel[4] = new ModelRendererTurbo(this, 177, 57, textureX, textureY); // Box 25
		bodyModel[5] = new ModelRendererTurbo(this, 441, 41, textureX, textureY); // Box 26
		bodyModel[6] = new ModelRendererTurbo(this, 233, 65, textureX, textureY); // Box 27
		bodyModel[7] = new ModelRendererTurbo(this, 65, 57, textureX, textureY); // Box 32
		bodyModel[8] = new ModelRendererTurbo(this, 153, 57, textureX, textureY); // Box 33
		bodyModel[9] = new ModelRendererTurbo(this, 49, 33, textureX, textureY); // Box 38
		bodyModel[10] = new ModelRendererTurbo(this, 289, 65, textureX, textureY); // Box 39
		bodyModel[11] = new ModelRendererTurbo(this, 337, 65, textureX, textureY); // Box 40
		bodyModel[12] = new ModelRendererTurbo(this, 353, 33, textureX, textureY); // Box 41
		bodyModel[13] = new ModelRendererTurbo(this, 145, 33, textureX, textureY); // Box 124
		bodyModel[14] = new ModelRendererTurbo(this, 177, 33, textureX, textureY); // Box 125
		bodyModel[15] = new ModelRendererTurbo(this, 489, 33, textureX, textureY); // Box 126
		bodyModel[16] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 127
		bodyModel[17] = new ModelRendererTurbo(this, 441, 41, textureX, textureY); // Box 128
		bodyModel[18] = new ModelRendererTurbo(this, 121, 41, textureX, textureY); // Box 129
		bodyModel[19] = new ModelRendererTurbo(this, 233, 65, textureX, textureY); // Box 163
		bodyModel[20] = new ModelRendererTurbo(this, 369, 65, textureX, textureY); // Box 164
		bodyModel[21] = new ModelRendererTurbo(this, 457, 65, textureX, textureY); // Box 165
		bodyModel[22] = new ModelRendererTurbo(this, 489, 81, textureX, textureY); // Box 166
		bodyModel[23] = new ModelRendererTurbo(this, 489, 97, textureX, textureY); // Box 167
		bodyModel[24] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Box 168
		bodyModel[25] = new ModelRendererTurbo(this, 497, 65, textureX, textureY); // Box 169
		bodyModel[26] = new ModelRendererTurbo(this, 369, 73, textureX, textureY); // Box 170
		bodyModel[27] = new ModelRendererTurbo(this, 217, 41, textureX, textureY); // Box 212
		bodyModel[28] = new ModelRendererTurbo(this, 257, 41, textureX, textureY); // Box 213
		bodyModel[29] = new ModelRendererTurbo(this, 265, 41, textureX, textureY); // Box 214
		bodyModel[30] = new ModelRendererTurbo(this, 49, 49, textureX, textureY); // Box 215
		bodyModel[31] = new ModelRendererTurbo(this, 57, 49, textureX, textureY); // Box 216
		bodyModel[32] = new ModelRendererTurbo(this, 65, 49, textureX, textureY); // Box 217
		bodyModel[33] = new ModelRendererTurbo(this, 73, 49, textureX, textureY); // Box 218
		bodyModel[34] = new ModelRendererTurbo(this, 81, 49, textureX, textureY); // Box 219
		bodyModel[35] = new ModelRendererTurbo(this, 217, 49, textureX, textureY); // Box 220
		bodyModel[36] = new ModelRendererTurbo(this, 225, 49, textureX, textureY); // Box 221
		bodyModel[37] = new ModelRendererTurbo(this, 233, 49, textureX, textureY); // Box 222
		bodyModel[38] = new ModelRendererTurbo(this, 241, 49, textureX, textureY); // Box 223
		bodyModel[39] = new ModelRendererTurbo(this, 361, 153, textureX, textureY); // Box 219
		bodyModel[40] = new ModelRendererTurbo(this, 1, 161, textureX, textureY); // Box 228
		bodyModel[41] = new ModelRendererTurbo(this, 49, 161, textureX, textureY); // Box 229
		bodyModel[42] = new ModelRendererTurbo(this, 505, 57, textureX, textureY); // Box 230
		bodyModel[43] = new ModelRendererTurbo(this, 481, 153, textureX, textureY); // Box 231
		bodyModel[44] = new ModelRendererTurbo(this, 89, 161, textureX, textureY); // Box 232
		bodyModel[45] = new ModelRendererTurbo(this, 297, 161, textureX, textureY); // Box 233
		bodyModel[46] = new ModelRendererTurbo(this, 105, 169, textureX, textureY); // Box 234
		bodyModel[47] = new ModelRendererTurbo(this, 129, 169, textureX, textureY); // Box 235
		bodyModel[48] = new ModelRendererTurbo(this, 153, 169, textureX, textureY); // Box 236
		bodyModel[49] = new ModelRendererTurbo(this, 177, 169, textureX, textureY); // Box 237
		bodyModel[50] = new ModelRendererTurbo(this, 201, 169, textureX, textureY); // Box 238
		bodyModel[51] = new ModelRendererTurbo(this, 225, 169, textureX, textureY); // Box 239
		bodyModel[52] = new ModelRendererTurbo(this, 249, 169, textureX, textureY); // Box 240
		bodyModel[53] = new ModelRendererTurbo(this, 17, 65, textureX, textureY); // Box 241
		bodyModel[54] = new ModelRendererTurbo(this, 105, 65, textureX, textureY); // Box 242
		bodyModel[55] = new ModelRendererTurbo(this, 417, 65, textureX, textureY); // Box 275
		bodyModel[56] = new ModelRendererTurbo(this, 465, 193, textureX, textureY); // Box 400
		bodyModel[57] = new ModelRendererTurbo(this, 489, 193, textureX, textureY); // Box 401
		bodyModel[58] = new ModelRendererTurbo(this, 1, 201, textureX, textureY); // Box 402
		bodyModel[59] = new ModelRendererTurbo(this, 25, 201, textureX, textureY); // Box 403
		bodyModel[60] = new ModelRendererTurbo(this, 73, 201, textureX, textureY); // Box 404
		bodyModel[61] = new ModelRendererTurbo(this, 121, 201, textureX, textureY); // Box 405
		bodyModel[62] = new ModelRendererTurbo(this, 145, 201, textureX, textureY); // Box 406
		bodyModel[63] = new ModelRendererTurbo(this, 169, 201, textureX, textureY); // Box 407
		bodyModel[64] = new ModelRendererTurbo(this, 249, 153, textureX, textureY); // Box 304
		bodyModel[65] = new ModelRendererTurbo(this, 193, 201, textureX, textureY); // Box 305
		bodyModel[66] = new ModelRendererTurbo(this, 257, 153, textureX, textureY); // Box 306
		bodyModel[67] = new ModelRendererTurbo(this, 217, 201, textureX, textureY); // Box 307
		bodyModel[68] = new ModelRendererTurbo(this, 273, 153, textureX, textureY); // Box 308
		bodyModel[69] = new ModelRendererTurbo(this, 241, 201, textureX, textureY); // Box 309
		bodyModel[70] = new ModelRendererTurbo(this, 281, 153, textureX, textureY); // Box 310
		bodyModel[71] = new ModelRendererTurbo(this, 297, 153, textureX, textureY); // Box 311
		bodyModel[72] = new ModelRendererTurbo(this, 265, 201, textureX, textureY); // Box 312
		bodyModel[73] = new ModelRendererTurbo(this, 337, 153, textureX, textureY); // Box 313
		bodyModel[74] = new ModelRendererTurbo(this, 497, 153, textureX, textureY); // Box 314
		bodyModel[75] = new ModelRendererTurbo(this, 289, 201, textureX, textureY); // Box 315
		bodyModel[76] = new ModelRendererTurbo(this, 505, 153, textureX, textureY); // Box 316
		bodyModel[77] = new ModelRendererTurbo(this, 313, 201, textureX, textureY); // Box 317
		bodyModel[78] = new ModelRendererTurbo(this, 1, 161, textureX, textureY); // Box 318
		bodyModel[79] = new ModelRendererTurbo(this, 41, 161, textureX, textureY); // Box 319
		bodyModel[80] = new ModelRendererTurbo(this, 337, 201, textureX, textureY); // Box 320
		bodyModel[81] = new ModelRendererTurbo(this, 377, 153, textureX, textureY); // Box 321
		bodyModel[82] = new ModelRendererTurbo(this, 41, 169, textureX, textureY); // Box 322
		bodyModel[83] = new ModelRendererTurbo(this, 49, 161, textureX, textureY); // Box 323
		bodyModel[84] = new ModelRendererTurbo(this, 89, 161, textureX, textureY); // Box 324
		bodyModel[85] = new ModelRendererTurbo(this, 105, 161, textureX, textureY); // Box 325
		bodyModel[86] = new ModelRendererTurbo(this, 313, 161, textureX, textureY); // Box 326
		bodyModel[87] = new ModelRendererTurbo(this, 377, 161, textureX, textureY); // Box 327
		bodyModel[88] = new ModelRendererTurbo(this, 121, 169, textureX, textureY); // Box 330
		bodyModel[89] = new ModelRendererTurbo(this, 385, 201, textureX, textureY); // Box 333
		bodyModel[90] = new ModelRendererTurbo(this, 1, 209, textureX, textureY); // Box 334
		bodyModel[91] = new ModelRendererTurbo(this, 505, 161, textureX, textureY); // Box 335
		bodyModel[92] = new ModelRendererTurbo(this, 1, 169, textureX, textureY); // Box 336
		bodyModel[93] = new ModelRendererTurbo(this, 145, 169, textureX, textureY); // Box 337
		bodyModel[94] = new ModelRendererTurbo(this, 153, 169, textureX, textureY); // Box 338
		bodyModel[95] = new ModelRendererTurbo(this, 169, 169, textureX, textureY); // Box 339
		bodyModel[96] = new ModelRendererTurbo(this, 177, 169, textureX, textureY); // Box 340
		bodyModel[97] = new ModelRendererTurbo(this, 193, 169, textureX, textureY); // Box 341
		bodyModel[98] = new ModelRendererTurbo(this, 217, 169, textureX, textureY); // Box 342
		bodyModel[99] = new ModelRendererTurbo(this, 225, 169, textureX, textureY); // Box 343
		bodyModel[100] = new ModelRendererTurbo(this, 409, 201, textureX, textureY); // Box 344
		bodyModel[101] = new ModelRendererTurbo(this, 433, 201, textureX, textureY); // Box 345
		bodyModel[102] = new ModelRendererTurbo(this, 73, 209, textureX, textureY); // Box 346
		bodyModel[103] = new ModelRendererTurbo(this, 241, 169, textureX, textureY); // Box 349
		bodyModel[104] = new ModelRendererTurbo(this, 265, 169, textureX, textureY); // Box 350
		bodyModel[105] = new ModelRendererTurbo(this, 145, 209, textureX, textureY); // Box 351
		bodyModel[106] = new ModelRendererTurbo(this, 177, 209, textureX, textureY); // Box 352
		bodyModel[107] = new ModelRendererTurbo(this, 249, 209, textureX, textureY); // Box 353
		bodyModel[108] = new ModelRendererTurbo(this, 281, 169, textureX, textureY); // Box 354
		bodyModel[109] = new ModelRendererTurbo(this, 289, 169, textureX, textureY); // Box 355
		bodyModel[110] = new ModelRendererTurbo(this, 393, 169, textureX, textureY); // Box 356
		bodyModel[111] = new ModelRendererTurbo(this, 497, 169, textureX, textureY); // Box 357
		bodyModel[112] = new ModelRendererTurbo(this, 1, 177, textureX, textureY); // Box 358
		bodyModel[113] = new ModelRendererTurbo(this, 481, 169, textureX, textureY); // Box 359
		bodyModel[114] = new ModelRendererTurbo(this, 97, 177, textureX, textureY); // Box 360
		bodyModel[115] = new ModelRendererTurbo(this, 313, 177, textureX, textureY); // Box 361
		bodyModel[116] = new ModelRendererTurbo(this, 473, 177, textureX, textureY); // Box 362
		bodyModel[117] = new ModelRendererTurbo(this, 497, 177, textureX, textureY); // Box 363
		bodyModel[118] = new ModelRendererTurbo(this, 281, 209, textureX, textureY); // Box 364
		bodyModel[119] = new ModelRendererTurbo(this, 321, 209, textureX, textureY); // Box 365
		bodyModel[120] = new ModelRendererTurbo(this, 481, 177, textureX, textureY); // Box 366
		bodyModel[121] = new ModelRendererTurbo(this, 1, 185, textureX, textureY); // Box 367
		bodyModel[122] = new ModelRendererTurbo(this, 49, 185, textureX, textureY); // Box 368
		bodyModel[123] = new ModelRendererTurbo(this, 57, 185, textureX, textureY); // Box 369
		bodyModel[124] = new ModelRendererTurbo(this, 505, 185, textureX, textureY); // Box 370
		bodyModel[125] = new ModelRendererTurbo(this, 97, 193, textureX, textureY); // Box 371
		bodyModel[126] = new ModelRendererTurbo(this, 105, 193, textureX, textureY); // Box 372
		bodyModel[127] = new ModelRendererTurbo(this, 49, 201, textureX, textureY); // Box 373
		bodyModel[128] = new ModelRendererTurbo(this, 57, 201, textureX, textureY); // Box 374
		bodyModel[129] = new ModelRendererTurbo(this, 97, 201, textureX, textureY); // Box 375
		bodyModel[130] = new ModelRendererTurbo(this, 105, 201, textureX, textureY); // Box 376
		bodyModel[131] = new ModelRendererTurbo(this, 449, 217, textureX, textureY); // Box 391
		bodyModel[132] = new ModelRendererTurbo(this, 465, 217, textureX, textureY); // Box 392
		bodyModel[133] = new ModelRendererTurbo(this, 473, 217, textureX, textureY); // Box 393
		bodyModel[134] = new ModelRendererTurbo(this, 1, 225, textureX, textureY); // Box 394
		bodyModel[135] = new ModelRendererTurbo(this, 113, 225, textureX, textureY); // Box 395
		bodyModel[136] = new ModelRendererTurbo(this, 97, 225, textureX, textureY); // Box 397
		bodyModel[137] = new ModelRendererTurbo(this, 313, 217, textureX, textureY); // Box 398
		bodyModel[138] = new ModelRendererTurbo(this, 497, 217, textureX, textureY); // Box 399
		bodyModel[139] = new ModelRendererTurbo(this, 297, 233, textureX, textureY); // Box 419
		bodyModel[140] = new ModelRendererTurbo(this, 49, 249, textureX, textureY); // Box 427
		bodyModel[141] = new ModelRendererTurbo(this, 97, 265, textureX, textureY); // Box 435
		bodyModel[142] = new ModelRendererTurbo(this, 449, 265, textureX, textureY); // Box 436
		bodyModel[143] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Light Cube Rear
		bodyModel[144] = new ModelRendererTurbo(this, 193, 305, textureX, textureY); // Box 924
		bodyModel[145] = new ModelRendererTurbo(this, 265, 305, textureX, textureY); // Box 925
		bodyModel[146] = new ModelRendererTurbo(this, 273, 305, textureX, textureY); // Box 926
		bodyModel[147] = new ModelRendererTurbo(this, 281, 305, textureX, textureY); // Box 927

		bodyModel[0].addBox(0F, 0F, 0F, 37, 4, 22, 0F); // Box 21
		bodyModel[0].setRotationPoint(57F, -4F, -11F);

		bodyModel[1].addBox(0F, 0F, 0F, 21, 4, 22, 0F); // Box 22
		bodyModel[1].setRotationPoint(73F, -8F, -11F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 18, 2, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 23
		bodyModel[2].setRotationPoint(73F, -13F, -11F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 20, 3, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 24
		bodyModel[3].setRotationPoint(73F, -11F, -11F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 16, 1, 22, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 25
		bodyModel[4].setRotationPoint(73.5F, -14F, -11F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 12, 1, 22, 0F,0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 2.25F, 0F, 0F, 2.25F, 0F, 0F, 0.5F, 0F, 0F); // Box 26
		bodyModel[5].setRotationPoint(73.5F, -16F, -11F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 15, 1, 22, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F); // Box 27
		bodyModel[6].setRotationPoint(73F, -15F, -11F);

		bodyModel[7].addBox(0F, 0F, 0F, 16, 12, 3, 0F); // Box 32
		bodyModel[7].setRotationPoint(57F, -16F, 8F);

		bodyModel[8].addBox(0F, 0F, 0F, 16, 12, 3, 0F); // Box 33
		bodyModel[8].setRotationPoint(57F, -16F, -11F);

		bodyModel[9].addBox(0F, 0F, 0F, 14, 10, 3, 0F); // Box 38
		bodyModel[9].setRotationPoint(43F, -16F, -11F);

		bodyModel[10].addBox(0F, 0F, 0F, 17, 3, 16, 0F); // Box 39
		bodyModel[10].setRotationPoint(43F, -9F, -8F);

		bodyModel[11].addBox(0F, 0F, 0F, 3, 10, 22, 0F); // Box 40
		bodyModel[11].setRotationPoint(40F, -16F, -11F);

		bodyModel[12].addBox(0F, 0F, 0F, 14, 10, 3, 0F); // Box 41
		bodyModel[12].setRotationPoint(43F, -16F, 8F);

		bodyModel[13].addBox(0F, 0F, 0F, 7, 7, 0, 0F); // Box 124
		bodyModel[13].setRotationPoint(80.5F, 3F, -6F);

		bodyModel[14].addBox(0F, 0F, 0F, 9, 9, 0, 0F); // Box 125
		bodyModel[14].setRotationPoint(69.5F, 1F, -6F);

		bodyModel[15].addBox(0F, 0F, 0F, 9, 9, 0, 0F); // Box 126
		bodyModel[15].setRotationPoint(58.5F, 1F, -6F);

		bodyModel[16].addBox(0F, 0F, 0F, 9, 9, 0, 0F); // Box 127
		bodyModel[16].setRotationPoint(47.5F, 1F, -6F);

		bodyModel[17].addBox(0F, 0F, 0F, 9, 9, 0, 0F); // Box 128
		bodyModel[17].setRotationPoint(36F, 1F, -6F);

		bodyModel[18].addBox(0F, 0F, 0F, 7, 7, 0, 0F); // Box 129
		bodyModel[18].setRotationPoint(26.5F, 3F, -6F);

		bodyModel[19].addBox(0F, 0F, 0F, 7, 7, 0, 0F); // Box 163
		bodyModel[19].setRotationPoint(95.5F, 3F, -6F);

		bodyModel[20].addBox(0F, 0F, 0F, 7, 7, 0, 0F); // Box 164
		bodyModel[20].setRotationPoint(26.5F, 3F, 6F);

		bodyModel[21].addBox(0F, 0F, 0F, 9, 9, 0, 0F); // Box 165
		bodyModel[21].setRotationPoint(36F, 1F, 6F);

		bodyModel[22].addBox(0F, 0F, 0F, 9, 9, 0, 0F); // Box 166
		bodyModel[22].setRotationPoint(47.5F, 1F, 6F);

		bodyModel[23].addBox(0F, 0F, 0F, 9, 9, 0, 0F); // Box 167
		bodyModel[23].setRotationPoint(58.5F, 1F, 6F);

		bodyModel[24].addBox(0F, 0F, 0F, 9, 9, 0, 0F); // Box 168
		bodyModel[24].setRotationPoint(69.5F, 1F, 6F);

		bodyModel[25].addBox(0F, 0F, 0F, 7, 7, 0, 0F); // Box 169
		bodyModel[25].setRotationPoint(80.5F, 3F, 6F);

		bodyModel[26].addBox(0F, 0F, 0F, 7, 7, 0, 0F); // Box 170
		bodyModel[26].setRotationPoint(95.5F, 3F, 6F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, -0.875F, -0.75F, 0F, -0.875F, -0.75F, 0F, -0.5F, 0.5F, 0F, -0.875F, 0.5F); // Box 212
		bodyModel[27].setRotationPoint(89F, -13.5F, -1.5F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, -0.875F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.875F, -0.75F, 0F, -0.875F, -0.75F); // Box 213
		bodyModel[28].setRotationPoint(89F, -13.5F, 0.5F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1.375F, -0.75F, 0F, -0.875F, -0.75F, 0F, -0.5F, 0.5F, 0F, -1.375F, 0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F); // Box 214
		bodyModel[29].setRotationPoint(89F, -15.5F, -1.5F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1.375F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.875F, -0.75F, 0F, -1.375F, -0.75F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F); // Box 215
		bodyModel[30].setRotationPoint(89F, -15.5F, 0.5F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0.5F, 0F, -0.125F, 0.5F, 0F, -0.625F, -0.5F, 0F, -0.875F, -0.75F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, -0.125F, 0F, 0.5F, -0.5F); // Box 216
		bodyModel[31].setRotationPoint(90F, -15.5F, 0.5F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.875F, -0.75F, 0F, -0.625F, -0.5F, 0F, -0.125F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.125F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F); // Box 217
		bodyModel[32].setRotationPoint(90F, -15.5F, -1.5F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, -0.125F, 0F, 0.5F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.125F, 0.5F, 0F, -0.625F, -0.5F, 0F, -0.875F, -0.75F); // Box 218
		bodyModel[33].setRotationPoint(90F, -13.5F, 0.5F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.5F, -0.5F, 0F, 0.5F, -0.125F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, -0.875F, -0.75F, 0F, -0.625F, -0.5F, 0F, -0.125F, 0.5F, 0F, -0.5F, 0.5F); // Box 219
		bodyModel[34].setRotationPoint(90F, -13.5F, -1.5F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.5F, -0.125F, 0F, 0.5F, -0.125F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, -0.625F, -0.5F, 0F, -0.625F, -0.5F, 0F, -0.125F, 0.5F, 0F, -0.125F, 0.5F); // Box 220
		bodyModel[35].setRotationPoint(91F, -13.5F, -1.5F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.625F, -0.5F, 0F, -0.625F, -0.5F, 0F, -0.125F, 0.5F, 0F, -0.125F, 0.5F, 0F, 0.5F, -0.125F, 0F, 0.5F, -0.125F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F); // Box 221
		bodyModel[36].setRotationPoint(91F, -15.5F, -1.5F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.125F, 0.5F, 0F, -0.125F, 0.5F, 0F, -0.625F, -0.5F, 0F, -0.625F, -0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, -0.125F, 0F, 0.5F, -0.125F); // Box 222
		bodyModel[37].setRotationPoint(91F, -15.5F, 0.5F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, -0.125F, 0F, 0.5F, -0.125F, 0F, -0.125F, 0.5F, 0F, -0.125F, 0.5F, 0F, -0.625F, -0.5F, 0F, -0.625F, -0.5F); // Box 223
		bodyModel[38].setRotationPoint(91F, -13.5F, 0.5F);

		bodyModel[39].addBox(0F, 0F, 0F, 1, 4, 22, 0F); // Box 219
		bodyModel[39].setRotationPoint(103.5F, 1F, -11F);

		bodyModel[40].addBox(0F, 0F, 0F, 10, 2, 12, 0F); // Box 228
		bodyModel[40].setRotationPoint(94F, 1F, -6F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 10, 5, 12, 0F,0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 229
		bodyModel[41].setRotationPoint(94F, -2F, -6F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Box 230
		bodyModel[42].setRotationPoint(103.5F, 5F, 8F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, -0.95F, 0F, 0F, -0.95F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.95F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 231
		bodyModel[43].setRotationPoint(104.5F, 5F, 0F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F,-0.5F, 0F, 0F, -0.45F, 0F, 0F, -0.95F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, -0.95F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 232
		bodyModel[44].setRotationPoint(104.5F, 5.75F, 0F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F,-1F, 0F, 0F, 0.05F, 0F, 0F, -0.95F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, 0.5F, -0.5F, 0F, -0.95F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 233
		bodyModel[45].setRotationPoint(104.5F, 6.5F, 0F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F,-1.5F, 0F, 0F, 0.55F, 0F, 0F, -0.95F, 0F, 0F, 0F, 0F, 0F, -1.5F, -0.5F, 0F, 1F, -0.5F, 0F, -0.95F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 234
		bodyModel[46].setRotationPoint(104.5F, 7.25F, 0F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F,-2F, 0F, 0F, 1.05F, 0F, 0F, -0.95F, 0F, 0F, 0F, 0F, 0F, -2F, -0.5F, 0F, 1.5F, -0.5F, 0F, -0.95F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 235
		bodyModel[47].setRotationPoint(104.5F, 8F, 0F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, -0.95F, 0F, 0F, 1.05F, 0F, 0F, -2F, 0F, 0F, 0F, -0.5F, 0F, -0.95F, -0.5F, 0F, 1.5F, -0.5F, 0F, -2F, -0.5F, 0F); // Box 236
		bodyModel[48].setRotationPoint(104.5F, 8F, -9F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, -0.95F, 0F, 0F, 0.55F, 0F, 0F, -1.5F, 0F, 0F, 0F, -0.5F, 0F, -0.95F, -0.5F, 0F, 1F, -0.5F, 0F, -1.5F, -0.5F, 0F); // Box 237
		bodyModel[49].setRotationPoint(104.5F, 7.25F, -9F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, -0.95F, 0F, 0F, 0.05F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, -0.95F, -0.5F, 0F, 0.5F, -0.5F, 0F, -1F, -0.5F, 0F); // Box 238
		bodyModel[50].setRotationPoint(104.5F, 6.5F, -9F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, -0.95F, 0F, 0F, -0.45F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, -0.95F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 239
		bodyModel[51].setRotationPoint(104.5F, 5.75F, -9F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, -0.95F, 0F, 0F, -0.95F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.95F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 240
		bodyModel[52].setRotationPoint(104.5F, 5F, -9F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -0.55F, 0F, 2.05F, -0.55F, 0F, 2.05F, -0.55F, 0F, -3F, -0.55F, 0F); // Box 241
		bodyModel[53].setRotationPoint(103.5F, 5F, -0.5F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Box 242
		bodyModel[54].setRotationPoint(103.5F, 5F, -9F);

		bodyModel[55].addBox(0F, 0F, 0F, 4, 2, 2, 0F); // Box 275
		bodyModel[55].setRotationPoint(104.5F, 2F, -1F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 7, 4, 4, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0.25F, -1F, 0F, 0.25F, -1F, 0F, 0.25F, 0F, 0.5F, 0.25F, 0F); // Box 400
		bodyModel[56].setRotationPoint(88.25F, 3F, -10.5F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 7, 1, 3, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0.5F, -0.5F, -1F); // Box 401
		bodyModel[57].setRotationPoint(88.25F, 7.25F, -9.5F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 7, 1, 4, 0F,0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 402
		bodyModel[58].setRotationPoint(88.25F, 2F, -10.5F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 7, 1, 3, 0F,0.5F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0.5F, -0.5F, -1F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 403
		bodyModel[59].setRotationPoint(88.25F, 1F, -10F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 7, 1, 3, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0.5F, -0.5F, -1F); // Box 404
		bodyModel[60].setRotationPoint(88.25F, 7.25F, 6.5F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 7, 4, 4, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -1F, 0.5F, 0.25F, -1F); // Box 405
		bodyModel[61].setRotationPoint(88.25F, 3F, 6.5F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 7, 1, 4, 0F,0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 406
		bodyModel[62].setRotationPoint(88.25F, 2F, 6.5F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 7, 1, 3, 0F,0.5F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0.5F, -0.5F, -1F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 407
		bodyModel[63].setRotationPoint(88.25F, 1F, 7F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 304
		bodyModel[64].setRotationPoint(37.5F, 6F, -7F);

		bodyModel[65].addBox(0F, 0F, 0F, 10, 1, 1, 0F); // Box 305
		bodyModel[65].setRotationPoint(39F, 6.75F, -7F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 306
		bodyModel[66].setRotationPoint(49F, 6F, -7F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 307
		bodyModel[67].setRotationPoint(51F, 6.75F, -7F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 308
		bodyModel[68].setRotationPoint(60F, 6F, -7F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 309
		bodyModel[69].setRotationPoint(62F, 6.75F, -7F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 310
		bodyModel[70].setRotationPoint(71F, 6F, -7F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 311
		bodyModel[71].setRotationPoint(37.5F, 6F, 6F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 312
		bodyModel[72].setRotationPoint(62F, 6.75F, 6F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 313
		bodyModel[73].setRotationPoint(71F, 6F, 6F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 314
		bodyModel[74].setRotationPoint(60F, 6F, 6F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 315
		bodyModel[75].setRotationPoint(51F, 6.75F, 6F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 316
		bodyModel[76].setRotationPoint(49F, 6F, 6F);

		bodyModel[77].addBox(0F, 0F, 0F, 10, 1, 1, 0F); // Box 317
		bodyModel[77].setRotationPoint(39F, 6.75F, 6F);

		bodyModel[78].addShapeBox(-1F, 0F, 2F, 2, 3, 1, 0F,-0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.1F, -0.75F, 0F, -0.1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, -0.5F, 0F, -0.1F); // Box 318
		bodyModel[78].setRotationPoint(50.5F, 5F, 5.9F);
		bodyModel[78].rotateAngleZ = -0.40142573F;

		bodyModel[79].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 319
		bodyModel[79].setRotationPoint(48.5F, 6F, 7F);

		bodyModel[80].addShapeBox(-21.5F, 0F, 0F, 21, 1, 1, 0F,-0.25F, 0F, -0.05F, 0.5F, 0F, -0.05F, 0.5F, 0F, -0.55F, -0.25F, 0F, -0.55F, -0.25F, -0.5F, -0.05F, 0.5F, -0.5F, -0.05F, 0.5F, -0.5F, -0.55F, -0.25F, -0.5F, -0.55F); // Box 320
		bodyModel[80].setRotationPoint(71.5F, 3.75F, 8.67F);
		bodyModel[80].rotateAngleZ = 0.05235988F;

		bodyModel[81].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.5F, 0F, -0.5F, 0.125F, 0F, -0.5F, 0.125F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0.125F, 0F, -0.5F, 0.125F, 0F, 0F, 0.5F, 0F); // Box 321
		bodyModel[81].setRotationPoint(82.75F, 5F, 7F);

		bodyModel[82].addBox(0F, 0F, 0F, 6, 1, 1, 0F); // Box 322
		bodyModel[82].setRotationPoint(83.75F, 5F, 7F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.125F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0.125F, 0F); // Box 323
		bodyModel[83].setRotationPoint(83.25F, 5F, 7F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 324
		bodyModel[84].setRotationPoint(80.75F, 4.5F, 7F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 325
		bodyModel[85].setRotationPoint(81.25F, 6F, 7.5F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Box 326
		bodyModel[86].setRotationPoint(81.25F, 7F, 7.5F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 327
		bodyModel[87].setRotationPoint(81.25F, 5F, 7.5F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F); // Box 330
		bodyModel[88].setRotationPoint(83.75F, 2F, 8F);

		bodyModel[89].addShapeBox(-15F, 0F, 0F, 15, 1, 1, 0F,-0.25F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.55F, -0.25F, 0F, -0.55F, -0.25F, -0.5F, -0.05F, 0F, -0.5F, -0.05F, 0F, -0.5F, -0.55F, -0.25F, -0.5F, -0.55F); // Box 333
		bodyModel[89].setRotationPoint(85.5F, 1.25F, 8.25F);
		bodyModel[89].rotateAngleZ = 0.05235988F;

		bodyModel[90].addShapeBox(-31F, 0F, 0F, 31, 1, 1, 0F,0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F); // Box 334
		bodyModel[90].setRotationPoint(80.75F, 5F, 6.95F);
		bodyModel[90].rotateAngleZ = 0.05934119F;

		bodyModel[91].addShapeBox(-0.25F, -1F, 0F, 1, 1, 1, 0F,-0.25F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.65F, -0.25F, 0F, -0.65F, -0.25F, -0.5F, -0.15F, 0F, -0.5F, -0.15F, 0F, -0.5F, -0.65F, -0.25F, -0.5F, -0.65F); // Box 335
		bodyModel[91].setRotationPoint(70F, 1.25F, 8.5F);
		bodyModel[91].rotateAngleZ = -0.01745329F;

		bodyModel[92].addShapeBox(-0.25F, -0.5F, 0F, 1, 1, 1, 0F,-0.25F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.65F, -0.25F, 0F, -0.65F, -0.375F, -0.5F, -0.15F, 0.125F, -0.5F, -0.15F, 0.125F, -0.5F, -0.65F, -0.375F, -0.5F, -0.65F); // Box 336
		bodyModel[92].setRotationPoint(70F, 1.25F, 8.5F);
		bodyModel[92].rotateAngleZ = -0.01745329F;

		bodyModel[93].addShapeBox(-0.25F, 0F, 0F, 1, 1, 1, 0F,-0.375F, 0F, -0.15F, 0.125F, 0F, -0.15F, 0.125F, 0F, -0.65F, -0.375F, 0F, -0.65F, -0.625F, -0.5F, -0.15F, 0.375F, -0.5F, -0.15F, 0.375F, -0.5F, -0.65F, -0.625F, -0.5F, -0.65F); // Box 337
		bodyModel[93].setRotationPoint(70F, 1.25F, 8.5F);
		bodyModel[93].rotateAngleZ = -0.01745329F;

		bodyModel[94].addShapeBox(-0.25F, 0.5F, 0F, 1, 1, 1, 0F,-0.625F, 0F, -0.15F, 0.375F, 0F, -0.15F, 0.375F, 0F, -0.65F, -0.625F, 0F, -0.65F, -1F, -0.5F, -0.15F, 0.75F, -0.5F, -0.15F, 0.75F, -0.5F, -0.65F, -1F, -0.5F, -0.65F); // Box 338
		bodyModel[94].setRotationPoint(70F, 1.25F, 8.5F);
		bodyModel[94].rotateAngleZ = -0.01745329F;

		bodyModel[95].addShapeBox(-0.25F, 1F, 0F, 1, 1, 1, 0F,-1F, 0F, -0.15F, 0.75F, 0F, -0.15F, 0.75F, 0F, -0.65F, -1F, 0F, -0.65F, -1.5F, -0.5F, -0.15F, 1.25F, -0.5F, -0.15F, 1.25F, -0.5F, -0.65F, -1.5F, -0.5F, -0.65F); // Box 339
		bodyModel[95].setRotationPoint(70F, 1.25F, 8.5F);
		bodyModel[95].rotateAngleZ = -0.01745329F;

		bodyModel[96].addShapeBox(1F, 1.5F, 0F, 1, 2, 1, 0F,-0.25F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.65F, -0.25F, 0F, -0.65F, 0F, -0.5F, -0.15F, -0.5F, -0.5F, -0.15F, -0.5F, -0.5F, -0.65F, 0F, -0.5F, -0.65F); // Box 340
		bodyModel[96].setRotationPoint(70F, 1.25F, 8.5F);
		bodyModel[96].rotateAngleZ = -0.01745329F;

		bodyModel[97].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 341
		bodyModel[97].setRotationPoint(67.5F, 1F, 8.25F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.6F, 0F, 0.25F, -0.6F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, -0.25F, -0.6F, 0F, -0.25F, 0F, 0F, 0F, 0F); // Box 342
		bodyModel[98].setRotationPoint(70.5F, 1F, 8.25F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 343
		bodyModel[99].setRotationPoint(67.5F, 0F, 7.75F);

		bodyModel[100].addBox(0F, 0F, 0F, 3, 2, 16, 0F); // Box 344
		bodyModel[100].setRotationPoint(57F, -6F, -8F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 12, 1, 1, 0F,0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F); // Box 345
		bodyModel[101].setRotationPoint(77.5F, 6.5F, 7F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 12, 1, 1, 0F,0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F); // Box 346
		bodyModel[102].setRotationPoint(77.5F, 3.5F, 7F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Box 349
		bodyModel[103].setRotationPoint(81.25F, 7.15F, 8F);
		bodyModel[103].rotateAngleZ = 0.36651914F;

		bodyModel[104].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F); // Box 350
		bodyModel[104].setRotationPoint(85F, 1.2F, 8.25F);
		bodyModel[104].rotateAngleZ = -0.29670597F;

		bodyModel[105].addShapeBox(0F, 0F, 0F, 12, 1, 1, 0F,0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F); // Box 351
		bodyModel[105].setRotationPoint(77.5F, 3.5F, -8F);

		bodyModel[106].addShapeBox(-31F, 0F, 0F, 31, 1, 1, 0F,0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F); // Box 352
		bodyModel[106].setRotationPoint(80.75F, 5F, -8.05F);
		bodyModel[106].rotateAngleZ = 0.05934119F;

		bodyModel[107].addShapeBox(0F, 0F, 0F, 12, 1, 1, 0F,0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F); // Box 353
		bodyModel[107].setRotationPoint(77.5F, 6.5F, -8F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 354
		bodyModel[108].setRotationPoint(80.75F, 4.5F, -8F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.5F, 0F, -0.5F, 0.125F, 0F, -0.5F, 0.125F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0.125F, 0F, -0.5F, 0.125F, 0F, 0F, 0.5F, 0F); // Box 355
		bodyModel[109].setRotationPoint(82.75F, 5F, -8F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.125F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0.125F, 0F); // Box 356
		bodyModel[110].setRotationPoint(83.25F, 5F, -8F);

		bodyModel[111].addBox(0F, 0F, 0F, 6, 1, 1, 0F); // Box 357
		bodyModel[111].setRotationPoint(83.75F, 5F, -8F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,-0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Box 358
		bodyModel[112].setRotationPoint(85F, 1.2F, -9.25F);
		bodyModel[112].rotateAngleZ = -0.29670597F;

		bodyModel[113].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F); // Box 359
		bodyModel[113].setRotationPoint(81.25F, 7.15F, -9F);
		bodyModel[113].rotateAngleZ = 0.36651914F;

		bodyModel[114].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F); // Box 360
		bodyModel[114].setRotationPoint(81.25F, 7F, -8.5F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F); // Box 361
		bodyModel[115].setRotationPoint(81.25F, 6F, -8.5F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 362
		bodyModel[116].setRotationPoint(81.25F, 5F, -8.5F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F); // Box 363
		bodyModel[117].setRotationPoint(83.75F, 2F, -9.05F);

		bodyModel[118].addShapeBox(-15F, 0F, 0F, 15, 1, 1, 0F,-0.25F, 0F, -0.55F, 0F, 0F, -0.55F, 0F, 0F, -0.05F, -0.25F, 0F, -0.05F, -0.25F, -0.5F, -0.55F, 0F, -0.5F, -0.55F, 0F, -0.5F, -0.05F, -0.25F, -0.5F, -0.05F); // Box 364
		bodyModel[118].setRotationPoint(85.5F, 1.25F, -9.25F);
		bodyModel[118].rotateAngleZ = 0.05235988F;

		bodyModel[119].addShapeBox(-21.5F, 0F, 0F, 21, 1, 1, 0F,-0.25F, 0F, -0.05F, 0.5F, 0F, -0.05F, 0.5F, 0F, -0.55F, -0.25F, 0F, -0.55F, -0.25F, -0.5F, -0.05F, 0.5F, -0.5F, -0.05F, 0.5F, -0.5F, -0.55F, -0.25F, -0.5F, -0.55F); // Box 365
		bodyModel[119].setRotationPoint(71.5F, 3.75F, -9.38F);
		bodyModel[119].rotateAngleZ = 0.05235988F;

		bodyModel[120].addShapeBox(1F, 1.5F, 0F, 1, 2, 1, 0F,-0.25F, 0F, -0.65F, 0F, 0F, -0.65F, 0F, 0F, -0.15F, -0.25F, 0F, -0.15F, 0F, -0.5F, -0.65F, -0.5F, -0.5F, -0.65F, -0.5F, -0.5F, -0.15F, 0F, -0.5F, -0.15F); // Box 366
		bodyModel[120].setRotationPoint(70F, 1.25F, -9.55F);
		bodyModel[120].rotateAngleZ = -0.01745329F;

		bodyModel[121].addShapeBox(-0.25F, 1F, 0F, 1, 1, 1, 0F,-1F, 0F, -0.65F, 0.75F, 0F, -0.65F, 0.75F, 0F, -0.15F, -1F, 0F, -0.15F, -1.5F, -0.5F, -0.65F, 1.25F, -0.5F, -0.65F, 1.25F, -0.5F, -0.15F, -1.5F, -0.5F, -0.15F); // Box 367
		bodyModel[121].setRotationPoint(70F, 1.25F, -9.55F);
		bodyModel[121].rotateAngleZ = -0.01745329F;

		bodyModel[122].addShapeBox(-0.25F, 0.5F, 0F, 1, 1, 1, 0F,-0.625F, 0F, -0.65F, 0.375F, 0F, -0.65F, 0.375F, 0F, -0.15F, -0.625F, 0F, -0.15F, -1F, -0.5F, -0.65F, 0.75F, -0.5F, -0.65F, 0.75F, -0.5F, -0.15F, -1F, -0.5F, -0.15F); // Box 368
		bodyModel[122].setRotationPoint(70F, 1.25F, -9.55F);
		bodyModel[122].rotateAngleZ = -0.01745329F;

		bodyModel[123].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.6F, 0F, 0F, -0.6F); // Box 369
		bodyModel[123].setRotationPoint(70.5F, 1F, -9.3F);

		bodyModel[124].addShapeBox(-0.25F, -0.5F, 0F, 1, 1, 1, 0F,-0.25F, 0F, -0.65F, 0F, 0F, -0.65F, 0F, 0F, -0.15F, -0.25F, 0F, -0.15F, -0.375F, -0.5F, -0.65F, 0.125F, -0.5F, -0.65F, 0.125F, -0.5F, -0.15F, -0.375F, -0.5F, -0.15F); // Box 370
		bodyModel[124].setRotationPoint(70F, 1.25F, -9.55F);
		bodyModel[124].rotateAngleZ = -0.01745329F;

		bodyModel[125].addShapeBox(-0.25F, -1F, 0F, 1, 1, 1, 0F,-0.25F, 0F, -0.65F, 0F, 0F, -0.65F, 0F, 0F, -0.15F, -0.25F, 0F, -0.15F, -0.25F, -0.5F, -0.65F, 0F, -0.5F, -0.65F, 0F, -0.5F, -0.15F, -0.25F, -0.5F, -0.15F); // Box 371
		bodyModel[125].setRotationPoint(70F, 1.25F, -9.55F);
		bodyModel[125].rotateAngleZ = -0.01745329F;

		bodyModel[126].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 372
		bodyModel[126].setRotationPoint(67.5F, 1F, -9.3F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 373
		bodyModel[127].setRotationPoint(67.5F, 0F, -8.8F);

		bodyModel[128].addShapeBox(-0.25F, 0F, 0F, 1, 1, 1, 0F,-0.375F, 0F, -0.65F, 0.125F, 0F, -0.65F, 0.125F, 0F, -0.15F, -0.375F, 0F, -0.15F, -0.625F, -0.5F, -0.65F, 0.375F, -0.5F, -0.65F, 0.375F, -0.5F, -0.15F, -0.625F, -0.5F, -0.15F); // Box 374
		bodyModel[128].setRotationPoint(70F, 1.25F, -9.55F);
		bodyModel[128].rotateAngleZ = -0.01745329F;

		bodyModel[129].addShapeBox(-1F, 0F, 0F, 2, 3, 1, 0F,-0.75F, 0F, -0.1F, -0.25F, 0F, -0.1F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 375
		bodyModel[129].setRotationPoint(50.5F, 5F, -9F);
		bodyModel[129].rotateAngleZ = -0.40142573F;

		bodyModel[130].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 376
		bodyModel[130].setRotationPoint(48.5F, 6F, -8F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 3, 2, 4, 0F,0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F); // Box 391
		bodyModel[131].setRotationPoint(31.5F, 5F, -2F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 0F, 1F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 1F); // Box 392
		bodyModel[132].setRotationPoint(34.5F, 5F, -1F);
		bodyModel[132].rotateAngleY = 0.01745329F;

		bodyModel[133].addBox(0F, 0F, 0F, 3, 3, 12, 0F); // Box 393
		bodyModel[133].setRotationPoint(28.5F, 5F, -6F);

		bodyModel[134].addBox(0F, 0F, 0F, 40, 6, 12, 0F); // Box 394
		bodyModel[134].setRotationPoint(37.25F, 2F, -6F);

		bodyModel[135].addBox(0F, 0F, 0F, 18, 3, 12, 0F); // Box 395
		bodyModel[135].setRotationPoint(82.5F, 5F, -6F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 10, 2, 2, 0F,0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F); // Box 397
		bodyModel[136].setRotationPoint(48F, 0F, -1F);

		bodyModel[137].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 398
		bodyModel[137].setRotationPoint(58F, 0F, -1F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 399
		bodyModel[138].setRotationPoint(46F, 0F, -2F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 13, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 2F, 0F, 2F); // Box 419
		bodyModel[139].setRotationPoint(45F, -18F, -6F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 11, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 2F, 0F, 2F); // Box 427
		bodyModel[140].setRotationPoint(47F, -19F, -4F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 11, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 2F, 0F, 2F, 2F, 0F, 2F, 0F, 0F, 2F); // Box 435
		bodyModel[141].setRotationPoint(58F, -19F, -4F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 13, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 2F, 0F, 2F, 2F, 0F, 2F, 0F, 0F, 2F); // Box 436
		bodyModel[142].setRotationPoint(58F, -18F, -6F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Light Cube Rear
		bodyModel[143].setRotationPoint(92F, -14.4F, -0.5F);

		bodyModel[144].addShapeBox(0F, 1F, 0F, 1, 5, 1, 0F,-0.25F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 924
		bodyModel[144].setRotationPoint(90.5F, -1F, -1F);

		bodyModel[145].addShapeBox(0F, 1F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.25F); // Box 925
		bodyModel[145].setRotationPoint(90.5F, -1F, 0F);

		bodyModel[146].addShapeBox(0F, 1F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, -0.25F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 926
		bodyModel[146].setRotationPoint(91.5F, -1F, -1F);

		bodyModel[147].addShapeBox(0F, 1F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.25F, 0F, 0F, 0F); // Box 927
		bodyModel[147].setRotationPoint(91.5F, -1F, 0F);
	}
	public ArrayList<double[]> getSmokePosition() {
		return new ArrayList<double[]>() {
			{
				//add(new double[]{1.33D, 1.45D, 0.0D});
			}
		};
	}
}