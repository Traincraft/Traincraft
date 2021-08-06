//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2021 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 25.07.2021 - 11:41:53
// Last changed on: 25.07.2021 - 11:41:53

package train.client.render.models; //Path where the model is located

import tmt.ModelConverter;
import tmt.ModelRendererTurbo;

import java.util.ArrayList;

public class ModelGarrattFront extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelGarrattFront() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[147];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 1
		bodyModel[1] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 4
		bodyModel[2] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 5
		bodyModel[3] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 6
		bodyModel[4] = new ModelRendererTurbo(this, 65, 33, textureX, textureY); // Box 8
		bodyModel[5] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 9
		bodyModel[6] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 10
		bodyModel[7] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 11
		bodyModel[8] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 12
		bodyModel[9] = new ModelRendererTurbo(this, 417, 9, textureX, textureY); // Box 13
		bodyModel[10] = new ModelRendererTurbo(this, 481, 9, textureX, textureY); // Box 14
		bodyModel[11] = new ModelRendererTurbo(this, 81, 17, textureX, textureY); // Box 15
		bodyModel[12] = new ModelRendererTurbo(this, 337, 17, textureX, textureY); // Box 16
		bodyModel[13] = new ModelRendererTurbo(this, 121, 33, textureX, textureY); // Box 17
		bodyModel[14] = new ModelRendererTurbo(this, 145, 33, textureX, textureY); // Box 18
		bodyModel[15] = new ModelRendererTurbo(this, 177, 33, textureX, textureY); // Box 19
		bodyModel[16] = new ModelRendererTurbo(this, 217, 33, textureX, textureY); // Box 20
		bodyModel[17] = new ModelRendererTurbo(this, 41, 105, textureX, textureY); // Box 111
		bodyModel[18] = new ModelRendererTurbo(this, 185, 81, textureX, textureY); // Box 171
		bodyModel[19] = new ModelRendererTurbo(this, 25, 113, textureX, textureY); // Box 172
		bodyModel[20] = new ModelRendererTurbo(this, 449, 129, textureX, textureY); // Box 173
		bodyModel[21] = new ModelRendererTurbo(this, 473, 129, textureX, textureY); // Box 174
		bodyModel[22] = new ModelRendererTurbo(this, 113, 137, textureX, textureY); // Box 175
		bodyModel[23] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 176
		bodyModel[24] = new ModelRendererTurbo(this, 137, 89, textureX, textureY); // Box 177
		bodyModel[25] = new ModelRendererTurbo(this, 153, 89, textureX, textureY); // Box 178
		bodyModel[26] = new ModelRendererTurbo(this, 321, 137, textureX, textureY); // Box 179
		bodyModel[27] = new ModelRendererTurbo(this, 345, 137, textureX, textureY); // Box 180
		bodyModel[28] = new ModelRendererTurbo(this, 369, 137, textureX, textureY); // Box 181
		bodyModel[29] = new ModelRendererTurbo(this, 393, 137, textureX, textureY); // Box 182
		bodyModel[30] = new ModelRendererTurbo(this, 185, 89, textureX, textureY); // Box 183
		bodyModel[31] = new ModelRendererTurbo(this, 313, 89, textureX, textureY); // Box 184
		bodyModel[32] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 200
		bodyModel[33] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 201
		bodyModel[34] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 202
		bodyModel[35] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 203
		bodyModel[36] = new ModelRendererTurbo(this, 449, 9, textureX, textureY); // Box 204
		bodyModel[37] = new ModelRendererTurbo(this, 441, 17, textureX, textureY); // Box 205
		bodyModel[38] = new ModelRendererTurbo(this, 449, 17, textureX, textureY); // Box 206
		bodyModel[39] = new ModelRendererTurbo(this, 81, 33, textureX, textureY); // Box 207
		bodyModel[40] = new ModelRendererTurbo(this, 257, 33, textureX, textureY); // Box 208
		bodyModel[41] = new ModelRendererTurbo(this, 265, 33, textureX, textureY); // Box 209
		bodyModel[42] = new ModelRendererTurbo(this, 113, 137, textureX, textureY); // Box 168
		bodyModel[43] = new ModelRendererTurbo(this, 457, 57, textureX, textureY); // Box 169
		bodyModel[44] = new ModelRendererTurbo(this, 489, 57, textureX, textureY); // Box 170
		bodyModel[45] = new ModelRendererTurbo(this, 497, 57, textureX, textureY); // Box 171
		bodyModel[46] = new ModelRendererTurbo(this, 489, 137, textureX, textureY); // Box 178
		bodyModel[47] = new ModelRendererTurbo(this, 305, 145, textureX, textureY); // Box 179
		bodyModel[48] = new ModelRendererTurbo(this, 465, 145, textureX, textureY); // Box 180
		bodyModel[49] = new ModelRendererTurbo(this, 161, 153, textureX, textureY); // Box 181
		bodyModel[50] = new ModelRendererTurbo(this, 185, 153, textureX, textureY); // Box 182
		bodyModel[51] = new ModelRendererTurbo(this, 209, 153, textureX, textureY); // Box 187
		bodyModel[52] = new ModelRendererTurbo(this, 233, 153, textureX, textureY); // Box 188
		bodyModel[53] = new ModelRendererTurbo(this, 257, 153, textureX, textureY); // Box 189
		bodyModel[54] = new ModelRendererTurbo(this, 281, 153, textureX, textureY); // Box 190
		bodyModel[55] = new ModelRendererTurbo(this, 321, 153, textureX, textureY); // Box 191
		bodyModel[56] = new ModelRendererTurbo(this, 321, 89, textureX, textureY); // Box 192
		bodyModel[57] = new ModelRendererTurbo(this, 337, 153, textureX, textureY); // Box 194
		bodyModel[58] = new ModelRendererTurbo(this, 233, 57, textureX, textureY); // Box 274
		bodyModel[59] = new ModelRendererTurbo(this, 393, 89, textureX, textureY); // Box 103
		bodyModel[60] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 105
		bodyModel[61] = new ModelRendererTurbo(this, 65, 73, textureX, textureY); // Box 108
		bodyModel[62] = new ModelRendererTurbo(this, 121, 193, textureX, textureY); // Box 109
		bodyModel[63] = new ModelRendererTurbo(this, 193, 65, textureX, textureY); // Box 111
		bodyModel[64] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Box 113
		bodyModel[65] = new ModelRendererTurbo(this, 89, 73, textureX, textureY); // Box 114
		bodyModel[66] = new ModelRendererTurbo(this, 73, 73, textureX, textureY); // Box 326
		bodyModel[67] = new ModelRendererTurbo(this, 233, 73, textureX, textureY); // Box 327
		bodyModel[68] = new ModelRendererTurbo(this, 241, 73, textureX, textureY); // Box 328
		bodyModel[69] = new ModelRendererTurbo(this, 233, 81, textureX, textureY); // Box 329
		bodyModel[70] = new ModelRendererTurbo(this, 417, 73, textureX, textureY); // Box 330
		bodyModel[71] = new ModelRendererTurbo(this, 209, 121, textureX, textureY); // Box 331
		bodyModel[72] = new ModelRendererTurbo(this, 497, 73, textureX, textureY); // Box 332
		bodyModel[73] = new ModelRendererTurbo(this, 41, 105, textureX, textureY); // Box 333
		bodyModel[74] = new ModelRendererTurbo(this, 505, 73, textureX, textureY); // Box 334
		bodyModel[75] = new ModelRendererTurbo(this, 145, 137, textureX, textureY); // Box 335
		bodyModel[76] = new ModelRendererTurbo(this, 209, 81, textureX, textureY); // Box 336
		bodyModel[77] = new ModelRendererTurbo(this, 25, 89, textureX, textureY); // Box 337
		bodyModel[78] = new ModelRendererTurbo(this, 393, 153, textureX, textureY); // Box 339
		bodyModel[79] = new ModelRendererTurbo(this, 417, 137, textureX, textureY); // Box 340
		bodyModel[80] = new ModelRendererTurbo(this, 41, 121, textureX, textureY); // Box 341
		bodyModel[81] = new ModelRendererTurbo(this, 145, 153, textureX, textureY); // Box 342
		bodyModel[82] = new ModelRendererTurbo(this, 329, 169, textureX, textureY); // Box 343
		bodyModel[83] = new ModelRendererTurbo(this, 17, 177, textureX, textureY); // Box 344
		bodyModel[84] = new ModelRendererTurbo(this, 73, 193, textureX, textureY); // Box 345
		bodyModel[85] = new ModelRendererTurbo(this, 361, 169, textureX, textureY); // Box 346
		bodyModel[86] = new ModelRendererTurbo(this, 249, 65, textureX, textureY); // Box 347
		bodyModel[87] = new ModelRendererTurbo(this, 209, 89, textureX, textureY); // Box 348
		bodyModel[88] = new ModelRendererTurbo(this, 281, 177, textureX, textureY); // Box 349
		bodyModel[89] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 350
		bodyModel[90] = new ModelRendererTurbo(this, 353, 65, textureX, textureY); // Box 351
		bodyModel[91] = new ModelRendererTurbo(this, 105, 73, textureX, textureY); // Box 352
		bodyModel[92] = new ModelRendererTurbo(this, 193, 73, textureX, textureY); // Box 353
		bodyModel[93] = new ModelRendererTurbo(this, 25, 97, textureX, textureY); // Box 354
		bodyModel[94] = new ModelRendererTurbo(this, 353, 73, textureX, textureY); // Box 355
		bodyModel[95] = new ModelRendererTurbo(this, 193, 193, textureX, textureY); // Box 357
		bodyModel[96] = new ModelRendererTurbo(this, 249, 73, textureX, textureY); // Box 358
		bodyModel[97] = new ModelRendererTurbo(this, 425, 73, textureX, textureY); // Box 359
		bodyModel[98] = new ModelRendererTurbo(this, 49, 113, textureX, textureY); // Box 360
		bodyModel[99] = new ModelRendererTurbo(this, 217, 81, textureX, textureY); // Box 361
		bodyModel[100] = new ModelRendererTurbo(this, 481, 81, textureX, textureY); // Box 366
		bodyModel[101] = new ModelRendererTurbo(this, 169, 89, textureX, textureY); // Box 367
		bodyModel[102] = new ModelRendererTurbo(this, 217, 89, textureX, textureY); // Box 368
		bodyModel[103] = new ModelRendererTurbo(this, 417, 89, textureX, textureY); // Box 369
		bodyModel[104] = new ModelRendererTurbo(this, 145, 105, textureX, textureY); // Box 370
		bodyModel[105] = new ModelRendererTurbo(this, 345, 105, textureX, textureY); // Box 371
		bodyModel[106] = new ModelRendererTurbo(this, 233, 193, textureX, textureY); // Box 372
		bodyModel[107] = new ModelRendererTurbo(this, 329, 177, textureX, textureY); // Box 373
		bodyModel[108] = new ModelRendererTurbo(this, 497, 113, textureX, textureY); // Box 374
		bodyModel[109] = new ModelRendererTurbo(this, 281, 193, textureX, textureY); // Box 375
		bodyModel[110] = new ModelRendererTurbo(this, 145, 113, textureX, textureY); // Box 376
		bodyModel[111] = new ModelRendererTurbo(this, 33, 129, textureX, textureY); // Box 377
		bodyModel[112] = new ModelRendererTurbo(this, 497, 129, textureX, textureY); // Box 378
		bodyModel[113] = new ModelRendererTurbo(this, 161, 129, textureX, textureY); // Box 379
		bodyModel[114] = new ModelRendererTurbo(this, 505, 129, textureX, textureY); // Box 380
		bodyModel[115] = new ModelRendererTurbo(this, 1, 137, textureX, textureY); // Box 381
		bodyModel[116] = new ModelRendererTurbo(this, 305, 137, textureX, textureY); // Box 382
		bodyModel[117] = new ModelRendererTurbo(this, 9, 137, textureX, textureY); // Box 383
		bodyModel[118] = new ModelRendererTurbo(this, 313, 193, textureX, textureY); // Box 384
		bodyModel[119] = new ModelRendererTurbo(this, 177, 153, textureX, textureY); // Box 385
		bodyModel[120] = new ModelRendererTurbo(this, 441, 137, textureX, textureY); // Box 386
		bodyModel[121] = new ModelRendererTurbo(this, 1, 145, textureX, textureY); // Box 387
		bodyModel[122] = new ModelRendererTurbo(this, 505, 137, textureX, textureY); // Box 388
		bodyModel[123] = new ModelRendererTurbo(this, 145, 145, textureX, textureY); // Box 389
		bodyModel[124] = new ModelRendererTurbo(this, 465, 145, textureX, textureY); // Box 390
		bodyModel[125] = new ModelRendererTurbo(this, 481, 145, textureX, textureY); // Box 391
		bodyModel[126] = new ModelRendererTurbo(this, 129, 153, textureX, textureY); // Box 392
		bodyModel[127] = new ModelRendererTurbo(this, 201, 153, textureX, textureY); // Box 393
		bodyModel[128] = new ModelRendererTurbo(this, 209, 153, textureX, textureY); // Box 394
		bodyModel[129] = new ModelRendererTurbo(this, 353, 193, textureX, textureY); // Box 395
		bodyModel[130] = new ModelRendererTurbo(this, 401, 193, textureX, textureY); // Box 396
		bodyModel[131] = new ModelRendererTurbo(this, 225, 153, textureX, textureY); // Box 397
		bodyModel[132] = new ModelRendererTurbo(this, 233, 153, textureX, textureY); // Box 399
		bodyModel[133] = new ModelRendererTurbo(this, 153, 217, textureX, textureY); // Box 382
		bodyModel[134] = new ModelRendererTurbo(this, 169, 217, textureX, textureY); // Box 383
		bodyModel[135] = new ModelRendererTurbo(this, 193, 217, textureX, textureY); // Box 384
		bodyModel[136] = new ModelRendererTurbo(this, 201, 217, textureX, textureY); // Box 385
		bodyModel[137] = new ModelRendererTurbo(this, 313, 217, textureX, textureY); // Box 386
		bodyModel[138] = new ModelRendererTurbo(this, 377, 217, textureX, textureY); // Box 388
		bodyModel[139] = new ModelRendererTurbo(this, 297, 217, textureX, textureY); // Box 389
		bodyModel[140] = new ModelRendererTurbo(this, 369, 217, textureX, textureY); // Box 390
		bodyModel[141] = new ModelRendererTurbo(this, 153, 225, textureX, textureY); // Box 400
		bodyModel[142] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Light Cube Front
		bodyModel[143] = new ModelRendererTurbo(this, 289, 305, textureX, textureY); // Box 629
		bodyModel[144] = new ModelRendererTurbo(this, 297, 305, textureX, textureY); // Box 630
		bodyModel[145] = new ModelRendererTurbo(this, 305, 305, textureX, textureY); // Box 631
		bodyModel[146] = new ModelRendererTurbo(this, 313, 305, textureX, textureY); // Box 632

		bodyModel[0].addBox(0F, 0F, 0F, 26, 2, 22, 0F); // Box 1
		bodyModel[0].setRotationPoint(-89F, -4F, -11F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 13, 2, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 4
		bodyModel[1].setRotationPoint(-88F, -7F, -11F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 11, 2, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F); // Box 5
		bodyModel[2].setRotationPoint(-86F, -9F, -11F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 9, 1, 22, 0F,0F, 0F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -0.5F, 1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 1.5F, 0F, 0F); // Box 6
		bodyModel[3].setRotationPoint(-84.5F, -10F, -11F);

		bodyModel[4].addBox(0F, 0F, 0F, 14, 1, 22, 0F); // Box 8
		bodyModel[4].setRotationPoint(-89F, -5F, -11F);

		bodyModel[5].addBox(0F, 0F, 0F, 12, 6, 5, 0F); // Box 9
		bodyModel[5].setRotationPoint(-75F, -10F, -11F);

		bodyModel[6].addBox(0F, 0F, 0F, 12, 6, 5, 0F); // Box 10
		bodyModel[6].setRotationPoint(-75F, -10F, 6F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 12, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 11
		bodyModel[7].setRotationPoint(-75F, -11F, 6F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 12, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F); // Box 12
		bodyModel[8].setRotationPoint(-75F, -12F, 6F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 12, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F); // Box 13
		bodyModel[9].setRotationPoint(-75F, -13F, 6F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 12, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		bodyModel[10].setRotationPoint(-75F, -13F, -8F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 12, 1, 3, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		bodyModel[11].setRotationPoint(-75F, -12F, -9F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 12, 1, 4, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 16
		bodyModel[12].setRotationPoint(-75F, -11F, -10F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 3, 1, 16, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, 2.25F, 0F, 1.25F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 2.25F, 0F, 1.25F); // Box 17
		bodyModel[13].setRotationPoint(-78F, -13F, -8F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 5, 1, 18, 0F,-0.25F, 0F, 0.25F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, -0.25F, 0F, 0.25F, 2.25F, 0F, 1F, 0.5F, 0F, 1.5F, 0.5F, 0F, 1.5F, 2.25F, 0F, 1F); // Box 18
		bodyModel[14].setRotationPoint(-80.5F, -12F, -9F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 8, 1, 20, 0F,-0.25F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.25F, 0F, 0F, 1.5F, 0F, 0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 1.5F, 0F, 0.5F); // Box 19
		bodyModel[15].setRotationPoint(-83F, -11F, -10F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 12, 3, 12, 0F,0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 20
		bodyModel[16].setRotationPoint(-75F, -7F, -6F);

		bodyModel[17].addBox(0F, 0F, 0F, 37, 2, 22, 0F); // Box 111
		bodyModel[17].setRotationPoint(-93F, -2F, -11F);

		bodyModel[18].addBox(0F, 0F, 0F, 7, 7, 0, 0F); // Box 171
		bodyModel[18].setRotationPoint(-32.5F, 3F, -6F);

		bodyModel[19].addBox(0F, 0F, 0F, 9, 9, 0, 0F); // Box 172
		bodyModel[19].setRotationPoint(-44F, 1F, -6F);

		bodyModel[20].addBox(0F, 0F, 0F, 9, 9, 0, 0F); // Box 173
		bodyModel[20].setRotationPoint(-55.5F, 1F, -6F);

		bodyModel[21].addBox(0F, 0F, 0F, 9, 9, 0, 0F); // Box 174
		bodyModel[21].setRotationPoint(-66.5F, 1F, -6F);

		bodyModel[22].addBox(0F, 0F, 0F, 9, 9, 0, 0F); // Box 175
		bodyModel[22].setRotationPoint(-77.5F, 1F, -6F);

		bodyModel[23].addBox(0F, 0F, 0F, 7, 7, 0, 0F); // Box 176
		bodyModel[23].setRotationPoint(-86.5F, 3F, -6F);

		bodyModel[24].addBox(0F, 0F, 0F, 7, 7, 0, 0F); // Box 177
		bodyModel[24].setRotationPoint(-101.5F, 3F, -6F);

		bodyModel[25].addBox(0F, 0F, 0F, 7, 7, 0, 0F); // Box 178
		bodyModel[25].setRotationPoint(-32.5F, 3F, 6F);

		bodyModel[26].addBox(0F, 0F, 0F, 9, 9, 0, 0F); // Box 179
		bodyModel[26].setRotationPoint(-44F, 1F, 6F);

		bodyModel[27].addBox(0F, 0F, 0F, 9, 9, 0, 0F); // Box 180
		bodyModel[27].setRotationPoint(-55.5F, 1F, 6F);

		bodyModel[28].addBox(0F, 0F, 0F, 9, 9, 0, 0F); // Box 181
		bodyModel[28].setRotationPoint(-66.5F, 1F, 6F);

		bodyModel[29].addBox(0F, 0F, 0F, 9, 9, 0, 0F); // Box 182
		bodyModel[29].setRotationPoint(-77.5F, 1F, 6F);

		bodyModel[30].addBox(0F, 0F, 0F, 7, 7, 0, 0F); // Box 183
		bodyModel[30].setRotationPoint(-86.5F, 3F, 6F);

		bodyModel[31].addBox(-3.5F, -3.5F, 0F, 7, 7, 0, 0F); // Box 184
		bodyModel[31].setRotationPoint(-98F, 6.5F, 6F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.625F, -0.5F, 0F, -0.625F, -0.5F, 0F, -0.125F, 0.5F, 0F, -0.125F, 0.5F, 0F, 0.5F, -0.125F, 0F, 0.5F, -0.125F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F); // Box 200
		bodyModel[32].setRotationPoint(-87F, -11F, -1.5F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.125F, 0.5F, 0F, -0.125F, 0.5F, 0F, -0.625F, -0.5F, 0F, -0.625F, -0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, -0.125F, 0F, 0.5F, -0.125F); // Box 201
		bodyModel[33].setRotationPoint(-87F, -11F, 0.5F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, -0.125F, 0F, 0.5F, -0.125F, 0F, -0.125F, 0.5F, 0F, -0.125F, 0.5F, 0F, -0.625F, -0.5F, 0F, -0.625F, -0.5F); // Box 202
		bodyModel[34].setRotationPoint(-87F, -9F, 0.5F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.5F, -0.125F, 0F, 0.5F, -0.125F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, -0.625F, -0.5F, 0F, -0.625F, -0.5F, 0F, -0.125F, 0.5F, 0F, -0.125F, 0.5F); // Box 203
		bodyModel[35].setRotationPoint(-87F, -9F, -1.5F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.125F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.875F, -0.75F, 0F, -0.625F, -0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.125F); // Box 204
		bodyModel[36].setRotationPoint(-86F, -11F, 0.5F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.125F, 0F, -0.125F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.875F, -0.75F, 0F, -0.625F, -0.5F); // Box 205
		bodyModel[37].setRotationPoint(-86F, -9F, 0.5F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.5F, -0.125F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, -0.625F, -0.5F, 0F, -0.875F, -0.75F, 0F, -0.5F, 0.5F, 0F, -0.125F, 0.5F); // Box 206
		bodyModel[38].setRotationPoint(-86F, -9F, -1.5F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.625F, -0.5F, 0F, -0.875F, -0.75F, 0F, -0.5F, 0.5F, 0F, -0.125F, 0.5F, 0F, 0.5F, -0.125F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F); // Box 207
		bodyModel[39].setRotationPoint(-86F, -11F, -1.5F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0.5F, 0F, -1.375F, 0.5F, 0F, -1.375F, -0.75F, 0F, -0.875F, -0.75F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F); // Box 208
		bodyModel[40].setRotationPoint(-85F, -11F, 0.5F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.875F, -0.75F, 0F, -1.375F, -0.75F, 0F, -1.375F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F); // Box 209
		bodyModel[41].setRotationPoint(-85F, -11F, -1.5F);

		bodyModel[42].addBox(0F, 0F, 0F, 1, 4, 22, 0F); // Box 168
		bodyModel[42].setRotationPoint(-103.5F, 1F, -11F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 169
		bodyModel[43].setRotationPoint(-103.5F, 5F, -9F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 170
		bodyModel[44].setRotationPoint(-103.5F, 5F, 8F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2.05F, -0.55F, 0F, -3F, -0.55F, 0F, -3F, -0.55F, 0F, 2.05F, -0.55F, 0F); // Box 171
		bodyModel[45].setRotationPoint(-103.5F, 5F, -0.5F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F,1.05F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -0.95F, 0F, 0F, 1.5F, -0.5F, 0F, -2F, -0.5F, 0F, 0F, -0.5F, 0F, -0.95F, -0.5F, 0F); // Box 178
		bodyModel[46].setRotationPoint(-104.5F, 8F, 0F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F,0.55F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, -0.95F, 0F, 0F, 1F, -0.5F, 0F, -1.5F, -0.5F, 0F, 0F, -0.5F, 0F, -0.95F, -0.5F, 0F); // Box 179
		bodyModel[47].setRotationPoint(-104.5F, 7.25F, 0F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F,0.05F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -0.95F, 0F, 0F, 0.5F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, -0.95F, -0.5F, 0F); // Box 180
		bodyModel[48].setRotationPoint(-104.5F, 6.5F, 0F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F,-0.45F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.95F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, -0.95F, -0.5F, 0F); // Box 181
		bodyModel[49].setRotationPoint(-104.5F, 5.75F, 0F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F,-0.95F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.95F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.95F, -0.5F, 0F); // Box 182
		bodyModel[50].setRotationPoint(-104.5F, 5F, 0F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F,-0.95F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.95F, 0F, 0F, -0.95F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 187
		bodyModel[51].setRotationPoint(-104.5F, 5F, -9F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F,-0.95F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.45F, 0F, 0F, -0.95F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 188
		bodyModel[52].setRotationPoint(-104.5F, 5.75F, -9F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F,-0.95F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 0.55F, 0F, 0F, -0.95F, -0.5F, 0F, 0F, -0.5F, 0F, -1.5F, -0.5F, 0F, 1F, -0.5F, 0F); // Box 189
		bodyModel[53].setRotationPoint(-104.5F, 7.25F, -9F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F,-0.95F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0.05F, 0F, 0F, -0.95F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Box 190
		bodyModel[54].setRotationPoint(-104.5F, 6.5F, -9F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F,-0.95F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 1.05F, 0F, 0F, -0.95F, -0.5F, 0F, 0F, -0.5F, 0F, -2F, -0.5F, 0F, 1.5F, -0.5F, 0F); // Box 191
		bodyModel[55].setRotationPoint(-104.5F, 8F, -9F);

		bodyModel[56].addBox(0F, 0F, 0F, 1, 1, 12, 0F); // Box 192
		bodyModel[56].setRotationPoint(-93F, 0F, -6F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 10, 2, 12, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 194
		bodyModel[57].setRotationPoint(-102.5F, 1F, -6F);

		bodyModel[58].addBox(0F, 0F, 0F, 4, 2, 2, 0F); // Box 274
		bodyModel[58].setRotationPoint(-107.5F, 2F, -1F);

		bodyModel[59].addBox(0F, 0F, 0F, 10, 1, 1, 0F); // Box 103
		bodyModel[59].setRotationPoint(-48.5F, 6.75F, -7F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 105
		bodyModel[60].setRotationPoint(-59.5F, 6.75F, -7F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 108
		bodyModel[61].setRotationPoint(-72.5F, 6F, -7F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 31, 1, 1, 0F,0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F); // Box 109
		bodyModel[62].setRotationPoint(-80.5F, 5F, -7.95F);
		bodyModel[62].rotateAngleZ = -0.0567232F;

		bodyModel[63].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, -0.5F, 0F, 0F); // Box 111
		bodyModel[63].setRotationPoint(-83.5F, 5F, -8F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 12, 1, 1, 0F,0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F); // Box 113
		bodyModel[64].setRotationPoint(-89F, 3.5F, -8F);

		bodyModel[65].addBox(0F, 0F, 0F, 6, 1, 1, 0F); // Box 114
		bodyModel[65].setRotationPoint(-89F, 5F, -8F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 326
		bodyModel[66].setRotationPoint(-61.5F, 6F, -7F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 327
		bodyModel[67].setRotationPoint(-50.5F, 6F, -7F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 328
		bodyModel[68].setRotationPoint(-39F, 6F, -7F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 329
		bodyModel[69].setRotationPoint(-70.5F, 6.75F, -7F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 330
		bodyModel[70].setRotationPoint(-39F, 6F, 6F);

		bodyModel[71].addBox(0F, 0F, 0F, 10, 1, 1, 0F); // Box 331
		bodyModel[71].setRotationPoint(-48.5F, 6.75F, 6F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 332
		bodyModel[72].setRotationPoint(-50.5F, 6F, 6F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 333
		bodyModel[73].setRotationPoint(-59.5F, 6.75F, 6F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 334
		bodyModel[74].setRotationPoint(-61.5F, 6F, 6F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 335
		bodyModel[75].setRotationPoint(-70.5F, 6.75F, 6F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 336
		bodyModel[76].setRotationPoint(-72.5F, 6F, 6F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 337
		bodyModel[77].setRotationPoint(-50.5F, 6F, -8F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 7, 4, 4, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, -1F, 0.5F, 0.25F, -1F, 0.5F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 339
		bodyModel[78].setRotationPoint(-94.25F, 3F, -10.5F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 7, 1, 4, 0F,0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 340
		bodyModel[79].setRotationPoint(-94.25F, 2F, -10.5F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 7, 1, 3, 0F,0F, -0.5F, -1F, 0.5F, -0.5F, -1F, 0.5F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 341
		bodyModel[80].setRotationPoint(-94.25F, 1F, -10F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 7, 1, 3, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0.5F, -0.5F, -1F, 0.5F, -0.5F, -1F, 0F, -0.5F, -1F); // Box 342
		bodyModel[81].setRotationPoint(-94.25F, 7.25F, -9.5F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 7, 1, 3, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0.5F, -0.5F, -1F, 0.5F, -0.5F, -1F, 0F, -0.5F, -1F); // Box 343
		bodyModel[82].setRotationPoint(-94.25F, 7.25F, 6.5F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 7, 4, 4, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, -1F, 0F, 0.25F, -1F); // Box 344
		bodyModel[83].setRotationPoint(-94.25F, 3F, 6.5F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 7, 1, 4, 0F,0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 345
		bodyModel[84].setRotationPoint(-94.25F, 2F, 6.5F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 7, 1, 3, 0F,0F, -0.5F, -1F, 0.5F, -0.5F, -1F, 0.5F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 346
		bodyModel[85].setRotationPoint(-94.25F, 1F, 7F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0.125F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0.125F, 0F, -0.5F, 0.125F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0.125F, 0F); // Box 347
		bodyModel[86].setRotationPoint(-83F, 5F, -8F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 348
		bodyModel[87].setRotationPoint(-82F, 4.5F, -8F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 12, 1, 1, 0F,0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F); // Box 349
		bodyModel[88].setRotationPoint(-89F, 6.5F, -8F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F); // Box 350
		bodyModel[89].setRotationPoint(-89F, 2F, -9F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 351
		bodyModel[90].setRotationPoint(-81.5F, 5F, -8.5F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F); // Box 352
		bodyModel[91].setRotationPoint(-81.5F, 6F, -8.5F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F); // Box 353
		bodyModel[92].setRotationPoint(-81.5F, 7F, -8.5F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F); // Box 354
		bodyModel[93].setRotationPoint(-83.5F, 6F, -9F);
		bodyModel[93].rotateAngleZ = -0.36651914F;

		bodyModel[94].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F); // Box 355
		bodyModel[94].setRotationPoint(-85F, 1.5F, -8.75F);
		bodyModel[94].rotateAngleZ = 0.29670597F;

		bodyModel[95].addShapeBox(0F, 0F, 0F, 15, 1, 1, 0F,-0.25F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.55F, -0.25F, 0F, -0.55F, -0.25F, -0.5F, -0.05F, 0F, -0.5F, -0.05F, 0F, -0.5F, -0.55F, -0.25F, -0.5F, -0.55F); // Box 357
		bodyModel[95].setRotationPoint(-84.75F, 1.25F, -8.75F);
		bodyModel[95].rotateAngleZ = -0.05235988F;

		bodyModel[96].addShapeBox(-0.25F, -1F, 0F, 1, 1, 1, 0F,0F, 0F, -0.15F, -0.25F, 0F, -0.15F, -0.25F, 0F, -0.65F, 0F, 0F, -0.65F, 0F, -0.5F, -0.15F, -0.25F, -0.5F, -0.15F, -0.25F, -0.5F, -0.65F, 0F, -0.5F, -0.65F); // Box 358
		bodyModel[96].setRotationPoint(-70.25F, 1.25F, -9F);
		bodyModel[96].rotateAngleZ = -0.01745329F;

		bodyModel[97].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 359
		bodyModel[97].setRotationPoint(-67.75F, 0F, -8.25F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 360
		bodyModel[98].setRotationPoint(-69.75F, 1F, -9.25F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0.25F, -0.6F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, -0.25F, -0.6F); // Box 361
		bodyModel[99].setRotationPoint(-70.75F, 1F, -9.25F);

		bodyModel[100].addShapeBox(-0.25F, -0.5F, 0F, 1, 1, 1, 0F,0F, 0F, -0.15F, -0.25F, 0F, -0.15F, -0.25F, 0F, -0.65F, 0F, 0F, -0.65F, 0.125F, -0.5F, -0.15F, -0.375F, -0.5F, -0.15F, -0.375F, -0.5F, -0.65F, 0.125F, -0.5F, -0.65F); // Box 366
		bodyModel[100].setRotationPoint(-70.25F, 1.25F, -9F);
		bodyModel[100].rotateAngleZ = -0.01745329F;

		bodyModel[101].addShapeBox(-0.25F, 0F, 0F, 1, 1, 1, 0F,0.125F, 0F, -0.15F, -0.375F, 0F, -0.15F, -0.375F, 0F, -0.65F, 0.125F, 0F, -0.65F, 0.375F, -0.5F, -0.15F, -0.625F, -0.5F, -0.15F, -0.625F, -0.5F, -0.65F, 0.375F, -0.5F, -0.65F); // Box 367
		bodyModel[101].setRotationPoint(-70.25F, 1.25F, -9F);
		bodyModel[101].rotateAngleZ = -0.01745329F;

		bodyModel[102].addShapeBox(-0.25F, 0.5F, 0F, 1, 1, 1, 0F,0.375F, 0F, -0.15F, -0.625F, 0F, -0.15F, -0.625F, 0F, -0.65F, 0.375F, 0F, -0.65F, 0.75F, -0.5F, -0.15F, -1F, -0.5F, -0.15F, -1F, -0.5F, -0.65F, 0.75F, -0.5F, -0.65F); // Box 368
		bodyModel[102].setRotationPoint(-70.25F, 1.25F, -9F);
		bodyModel[102].rotateAngleZ = -0.01745329F;

		bodyModel[103].addShapeBox(-0.25F, 1F, 0F, 1, 1, 1, 0F,0.75F, 0F, -0.15F, -1F, 0F, -0.15F, -1F, 0F, -0.65F, 0.75F, 0F, -0.65F, 1.25F, -0.5F, -0.15F, -1.5F, -0.5F, -0.15F, -1.5F, -0.5F, -0.65F, 1.25F, -0.5F, -0.65F); // Box 369
		bodyModel[103].setRotationPoint(-70.25F, 1.25F, -9F);
		bodyModel[103].rotateAngleZ = -0.01745329F;

		bodyModel[104].addShapeBox(-1.5F, 1.5F, 0F, 1, 2, 1, 0F,0F, 0F, -0.15F, -0.25F, 0F, -0.15F, -0.25F, 0F, -0.65F, 0F, 0F, -0.65F, -0.5F, -0.5F, -0.15F, 0F, -0.5F, -0.15F, 0F, -0.5F, -0.65F, -0.5F, -0.5F, -0.65F); // Box 370
		bodyModel[104].setRotationPoint(-70.25F, 1.25F, -9F);
		bodyModel[104].rotateAngleZ = -0.01745329F;

		bodyModel[105].addShapeBox(-1F, 0F, 2F, 2, 3, 1, 0F,-0.75F, 0F, -0.1F, -0.25F, 0F, -0.1F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 371
		bodyModel[105].setRotationPoint(-50.5F, 5F, -11F);
		bodyModel[105].rotateAngleZ = 0.40142573F;

		bodyModel[106].addShapeBox(0F, 0F, -3F, 21, 1, 1, 0F,-0.25F, 0F, -0.05F, 0.5F, 0F, -0.05F, 0.5F, 0F, -0.55F, -0.25F, 0F, -0.55F, -0.25F, -0.5F, -0.05F, 0.5F, -0.5F, -0.05F, 0.5F, -0.5F, -0.55F, -0.25F, -0.5F, -0.55F); // Box 372
		bodyModel[106].setRotationPoint(-71.5F, 3.75F, -6.33F);
		bodyModel[106].rotateAngleZ = -0.05235988F;

		bodyModel[107].addShapeBox(0F, 0F, 0F, 12, 1, 1, 0F,0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F); // Box 373
		bodyModel[107].setRotationPoint(-89F, 6.5F, 7F);

		bodyModel[108].addBox(0F, 0F, 0F, 6, 1, 1, 0F); // Box 374
		bodyModel[108].setRotationPoint(-89F, 5F, 7F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 12, 1, 1, 0F,0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F); // Box 375
		bodyModel[109].setRotationPoint(-89F, 3.5F, 7F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, -0.5F, 0F, 0F); // Box 376
		bodyModel[110].setRotationPoint(-83.5F, 5F, 7F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0.125F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0.125F, 0F, -0.5F, 0.125F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0.125F, 0F); // Box 377
		bodyModel[111].setRotationPoint(-83F, 5F, 7F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 378
		bodyModel[112].setRotationPoint(-82F, 4.5F, 7F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 379
		bodyModel[113].setRotationPoint(-81.5F, 5F, 7.5F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 380
		bodyModel[114].setRotationPoint(-81.5F, 6F, 7.5F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Box 381
		bodyModel[115].setRotationPoint(-81.5F, 7F, 7.5F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Box 382
		bodyModel[116].setRotationPoint(-83.5F, 6F, 8F);
		bodyModel[116].rotateAngleZ = -0.36651914F;

		bodyModel[117].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F); // Box 383
		bodyModel[117].setRotationPoint(-85F, 1.5F, 8.25F);
		bodyModel[117].rotateAngleZ = 0.29670597F;

		bodyModel[118].addShapeBox(0F, 0F, 0F, 15, 1, 1, 0F,-0.25F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.55F, -0.25F, 0F, -0.55F, -0.25F, -0.5F, -0.05F, 0F, -0.5F, -0.05F, 0F, -0.5F, -0.55F, -0.25F, -0.5F, -0.55F); // Box 384
		bodyModel[118].setRotationPoint(-84.75F, 1.25F, 8.25F);
		bodyModel[118].rotateAngleZ = -0.05235988F;

		bodyModel[119].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F); // Box 385
		bodyModel[119].setRotationPoint(-89F, 2F, 8F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.25F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, 0F, -0.25F, 0F); // Box 386
		bodyModel[120].setRotationPoint(-70.75F, 1F, 8.25F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 387
		bodyModel[121].setRotationPoint(-69.75F, 1F, 8.25F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 388
		bodyModel[122].setRotationPoint(-67.75F, 0F, 7.25F);

		bodyModel[123].addShapeBox(-0.25F, -1F, 0F, 1, 1, 1, 0F,0F, 0F, -0.65F, -0.25F, 0F, -0.65F, -0.25F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, -0.5F, -0.65F, -0.25F, -0.5F, -0.65F, -0.25F, -0.5F, -0.15F, 0F, -0.5F, -0.15F); // Box 389
		bodyModel[123].setRotationPoint(-70.25F, 1.25F, 8F);
		bodyModel[123].rotateAngleZ = -0.01745329F;

		bodyModel[124].addShapeBox(-0.25F, -0.5F, 0F, 1, 1, 1, 0F,0F, 0F, -0.65F, -0.25F, 0F, -0.65F, -0.25F, 0F, -0.15F, 0F, 0F, -0.15F, 0.125F, -0.5F, -0.65F, -0.375F, -0.5F, -0.65F, -0.375F, -0.5F, -0.15F, 0.125F, -0.5F, -0.15F); // Box 390
		bodyModel[124].setRotationPoint(-70.25F, 1.25F, 8F);
		bodyModel[124].rotateAngleZ = -0.01745329F;

		bodyModel[125].addShapeBox(-0.25F, 0F, 0F, 1, 1, 1, 0F,0.125F, 0F, -0.65F, -0.375F, 0F, -0.65F, -0.375F, 0F, -0.15F, 0.125F, 0F, -0.15F, 0.375F, -0.5F, -0.65F, -0.625F, -0.5F, -0.65F, -0.625F, -0.5F, -0.15F, 0.375F, -0.5F, -0.15F); // Box 391
		bodyModel[125].setRotationPoint(-70.25F, 1.25F, 8F);
		bodyModel[125].rotateAngleZ = -0.01745329F;

		bodyModel[126].addShapeBox(-0.25F, 0.5F, 0F, 1, 1, 1, 0F,0.375F, 0F, -0.65F, -0.625F, 0F, -0.65F, -0.625F, 0F, -0.15F, 0.375F, 0F, -0.15F, 0.75F, -0.5F, -0.65F, -1F, -0.5F, -0.65F, -1F, -0.5F, -0.15F, 0.75F, -0.5F, -0.15F); // Box 392
		bodyModel[126].setRotationPoint(-70.25F, 1.25F, 8F);
		bodyModel[126].rotateAngleZ = -0.01745329F;

		bodyModel[127].addShapeBox(-0.25F, 1F, 0F, 1, 1, 1, 0F,0.75F, 0F, -0.65F, -1F, 0F, -0.65F, -1F, 0F, -0.15F, 0.75F, 0F, -0.15F, 1.25F, -0.5F, -0.65F, -1.5F, -0.5F, -0.65F, -1.5F, -0.5F, -0.15F, 1.25F, -0.5F, -0.15F); // Box 393
		bodyModel[127].setRotationPoint(-70.25F, 1.25F, 8F);
		bodyModel[127].rotateAngleZ = -0.01745329F;

		bodyModel[128].addShapeBox(-1.5F, 1.5F, 0F, 1, 2, 1, 0F,0F, 0F, -0.65F, -0.25F, 0F, -0.65F, -0.25F, 0F, -0.15F, 0F, 0F, -0.15F, -0.5F, -0.5F, -0.65F, 0F, -0.5F, -0.65F, 0F, -0.5F, -0.15F, -0.5F, -0.5F, -0.15F); // Box 394
		bodyModel[128].setRotationPoint(-70.25F, 1.25F, 8F);
		bodyModel[128].rotateAngleZ = -0.01745329F;

		bodyModel[129].addShapeBox(0F, 0F, 0F, 21, 1, 1, 0F,-0.25F, 0F, -0.05F, 0.5F, 0F, -0.05F, 0.5F, 0F, -0.55F, -0.25F, 0F, -0.55F, -0.25F, -0.5F, -0.05F, 0.5F, -0.5F, -0.05F, 0.5F, -0.5F, -0.55F, -0.25F, -0.5F, -0.55F); // Box 395
		bodyModel[129].setRotationPoint(-71.5F, 3.75F, 8.67F);
		bodyModel[129].rotateAngleZ = -0.05235988F;

		bodyModel[130].addShapeBox(0F, 0F, 0F, 31, 1, 1, 0F,0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F); // Box 396
		bodyModel[130].setRotationPoint(-80.5F, 5F, 6.95F);
		bodyModel[130].rotateAngleZ = -0.0567232F;

		bodyModel[131].addShapeBox(-1F, 0F, 2F, 2, 3, 1, 0F,-0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.1F, -0.75F, 0F, -0.1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, -0.5F, 0F, -0.1F); // Box 397
		bodyModel[131].setRotationPoint(-50.5F, 5F, 5.9F);
		bodyModel[131].rotateAngleZ = 0.40142573F;

		bodyModel[132].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 399
		bodyModel[132].setRotationPoint(-50.5F, 6F, 7F);

		bodyModel[133].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 382
		bodyModel[133].setRotationPoint(-60F, 0F, -1F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 8, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F); // Box 383
		bodyModel[134].setRotationPoint(-58F, 0F, -1F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 384
		bodyModel[135].setRotationPoint(-50F, 0F, -2F);

		bodyModel[136].addBox(0F, 0F, 0F, 40, 6, 12, 0F); // Box 385
		bodyModel[136].setRotationPoint(-76.25F, 2F, -6F);

		bodyModel[137].addBox(0F, 0F, 0F, 18, 3, 12, 0F); // Box 386
		bodyModel[137].setRotationPoint(-99.5F, 5F, -6F);

		bodyModel[138].addBox(0F, 0F, 0F, 3, 3, 12, 0F); // Box 388
		bodyModel[138].setRotationPoint(-30.5F, 5F, -6F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 3, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F); // Box 389
		bodyModel[139].setRotationPoint(-33.5F, 5F, -2F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,-0.2F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, -0.2F, 0F, 0F); // Box 390
		bodyModel[140].setRotationPoint(-37.5F, 5F, -1F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 3, 2, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -1.5F, 0F, 2F, -1.5F, 0F, 2F, -1.5F, 0F, 2F, -1.5F, 0F); // Box 400
		bodyModel[141].setRotationPoint(-55F, -2.5F, -11F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Light Cube Front
		bodyModel[142].setRotationPoint(-87F, -10F, -0.5F);

		bodyModel[143].addShapeBox(0F, 1F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, -0.25F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 629
		bodyModel[143].setRotationPoint(-90.5F, -1F, -1F);

		bodyModel[144].addShapeBox(0F, 1F, 0F, 1, 5, 1, 0F,-0.25F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 630
		bodyModel[144].setRotationPoint(-91.5F, -1F, -1F);

		bodyModel[145].addShapeBox(0F, 1F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.25F); // Box 631
		bodyModel[145].setRotationPoint(-91.5F, -1F, 0F);

		bodyModel[146].addShapeBox(0F, 1F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.25F, 0F, 0F, 0F); // Box 632
		bodyModel[146].setRotationPoint(-90.5F, -1F, 0F);
	}
	public ArrayList<double[]> getSmokePosition() {
		return new ArrayList<double[]>() {
			{
				//add(new double[]{1.33D, 1.45D, 0.0D});
			}
		};
	}
}