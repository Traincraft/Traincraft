//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2021 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 31.10.2020 - 20:10:30
// Last changed on: 31.10.2020 - 20:10:30

package train.client.render.models; //Path where the model is located

import tmt.ModelConverter;
import tmt.ModelRendererTurbo;

public class ModelKrauttTrucc extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelKrauttTrucc() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[148];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Wheel
		bodyModel[1] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Wheel
		bodyModel[2] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Wheel
		bodyModel[3] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 4
		bodyModel[4] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 27
		bodyModel[5] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 28
		bodyModel[6] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 28
		bodyModel[7] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 28
		bodyModel[8] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 28
		bodyModel[9] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 28
		bodyModel[10] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 28
		bodyModel[11] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 28
		bodyModel[12] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 28
		bodyModel[13] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 28
		bodyModel[14] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 28
		bodyModel[15] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 28
		bodyModel[16] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 28
		bodyModel[17] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 28
		bodyModel[18] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 28
		bodyModel[19] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 28
		bodyModel[20] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 28
		bodyModel[21] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 28
		bodyModel[22] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 28
		bodyModel[23] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 28
		bodyModel[24] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 28
		bodyModel[25] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 28
		bodyModel[26] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 28
		bodyModel[27] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 28
		bodyModel[28] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 28
		bodyModel[29] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 28
		bodyModel[30] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 28
		bodyModel[31] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 28
		bodyModel[32] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 28
		bodyModel[33] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 28
		bodyModel[34] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 28
		bodyModel[35] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 28
		bodyModel[36] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 28
		bodyModel[37] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 28
		bodyModel[38] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 28
		bodyModel[39] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 28
		bodyModel[40] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 28
		bodyModel[41] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 28
		bodyModel[42] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 28
		bodyModel[43] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 28
		bodyModel[44] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 28
		bodyModel[45] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 28
		bodyModel[46] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 130
		bodyModel[47] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 28
		bodyModel[48] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 28
		bodyModel[49] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 28
		bodyModel[50] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 28
		bodyModel[51] = new ModelRendererTurbo(this, 9, 9, textureX, textureY); // Box 130
		bodyModel[52] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 130
		bodyModel[53] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 173
		bodyModel[54] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 22
		bodyModel[55] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Box 23
		bodyModel[56] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Box 28
		bodyModel[57] = new ModelRendererTurbo(this, 65, 9, textureX, textureY); // Box 28
		bodyModel[58] = new ModelRendererTurbo(this, 73, 9, textureX, textureY); // Box 28
		bodyModel[59] = new ModelRendererTurbo(this, 97, 9, textureX, textureY); // Box 28
		bodyModel[60] = new ModelRendererTurbo(this, 105, 9, textureX, textureY); // Box 28
		bodyModel[61] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 28
		bodyModel[62] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 558
		bodyModel[63] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 28
		bodyModel[64] = new ModelRendererTurbo(this, 113, 9, textureX, textureY); // Box 28
		bodyModel[65] = new ModelRendererTurbo(this, 121, 9, textureX, textureY); // Box 28
		bodyModel[66] = new ModelRendererTurbo(this, 137, 9, textureX, textureY); // Box 28
		bodyModel[67] = new ModelRendererTurbo(this, 153, 9, textureX, textureY); // Box 558
		bodyModel[68] = new ModelRendererTurbo(this, 169, 9, textureX, textureY); // Box 28
		bodyModel[69] = new ModelRendererTurbo(this, 185, 9, textureX, textureY); // Box 28
		bodyModel[70] = new ModelRendererTurbo(this, 241, 9, textureX, textureY); // Wheel
		bodyModel[71] = new ModelRendererTurbo(this, 257, 9, textureX, textureY); // Wheel
		bodyModel[72] = new ModelRendererTurbo(this, 273, 9, textureX, textureY); // Wheel
		bodyModel[73] = new ModelRendererTurbo(this, 289, 9, textureX, textureY); // Box 428
		bodyModel[74] = new ModelRendererTurbo(this, 345, 9, textureX, textureY); // Box 429
		bodyModel[75] = new ModelRendererTurbo(this, 353, 9, textureX, textureY); // Box 430
		bodyModel[76] = new ModelRendererTurbo(this, 145, 9, textureX, textureY); // Box 431
		bodyModel[77] = new ModelRendererTurbo(this, 361, 9, textureX, textureY); // Box 432
		bodyModel[78] = new ModelRendererTurbo(this, 369, 9, textureX, textureY); // Box 433
		bodyModel[79] = new ModelRendererTurbo(this, 161, 9, textureX, textureY); // Box 434
		bodyModel[80] = new ModelRendererTurbo(this, 377, 9, textureX, textureY); // Box 435
		bodyModel[81] = new ModelRendererTurbo(this, 385, 9, textureX, textureY); // Box 436
		bodyModel[82] = new ModelRendererTurbo(this, 177, 9, textureX, textureY); // Box 437
		bodyModel[83] = new ModelRendererTurbo(this, 393, 9, textureX, textureY); // Box 439
		bodyModel[84] = new ModelRendererTurbo(this, 401, 9, textureX, textureY); // Box 440
		bodyModel[85] = new ModelRendererTurbo(this, 409, 9, textureX, textureY); // Box 443
		bodyModel[86] = new ModelRendererTurbo(this, 417, 9, textureX, textureY); // Box 444
		bodyModel[87] = new ModelRendererTurbo(this, 425, 9, textureX, textureY); // Box 445
		bodyModel[88] = new ModelRendererTurbo(this, 433, 9, textureX, textureY); // Box 446
		bodyModel[89] = new ModelRendererTurbo(this, 449, 9, textureX, textureY); // Box 449
		bodyModel[90] = new ModelRendererTurbo(this, 473, 9, textureX, textureY); // Box 450
		bodyModel[91] = new ModelRendererTurbo(this, 481, 9, textureX, textureY); // Box 451
		bodyModel[92] = new ModelRendererTurbo(this, 497, 9, textureX, textureY); // Box 452
		bodyModel[93] = new ModelRendererTurbo(this, 505, 9, textureX, textureY); // Box 453
		bodyModel[94] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 454
		bodyModel[95] = new ModelRendererTurbo(this, 9, 17, textureX, textureY); // Box 455
		bodyModel[96] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 505
		bodyModel[97] = new ModelRendererTurbo(this, 161, 17, textureX, textureY); // Box 526
		bodyModel[98] = new ModelRendererTurbo(this, 169, 17, textureX, textureY); // Box 527
		bodyModel[99] = new ModelRendererTurbo(this, 177, 17, textureX, textureY); // Box 528
		bodyModel[100] = new ModelRendererTurbo(this, 185, 17, textureX, textureY); // Box 530
		bodyModel[101] = new ModelRendererTurbo(this, 193, 17, textureX, textureY); // Box 531
		bodyModel[102] = new ModelRendererTurbo(this, 201, 17, textureX, textureY); // Box 532
		bodyModel[103] = new ModelRendererTurbo(this, 209, 17, textureX, textureY); // Box 537
		bodyModel[104] = new ModelRendererTurbo(this, 217, 17, textureX, textureY); // Box 538
		bodyModel[105] = new ModelRendererTurbo(this, 225, 17, textureX, textureY); // Box 544
		bodyModel[106] = new ModelRendererTurbo(this, 233, 17, textureX, textureY); // Box 545
		bodyModel[107] = new ModelRendererTurbo(this, 241, 17, textureX, textureY); // Box 551
		bodyModel[108] = new ModelRendererTurbo(this, 257, 17, textureX, textureY); // Box 442
		bodyModel[109] = new ModelRendererTurbo(this, 273, 17, textureX, textureY); // Box 442
		bodyModel[110] = new ModelRendererTurbo(this, 289, 17, textureX, textureY); // Box 442
		bodyModel[111] = new ModelRendererTurbo(this, 305, 17, textureX, textureY); // Box 442
		bodyModel[112] = new ModelRendererTurbo(this, 321, 17, textureX, textureY); // Box 260
		bodyModel[113] = new ModelRendererTurbo(this, 329, 17, textureX, textureY); // Box 261
		bodyModel[114] = new ModelRendererTurbo(this, 337, 17, textureX, textureY); // Box 263
		bodyModel[115] = new ModelRendererTurbo(this, 345, 17, textureX, textureY); // Box 264
		bodyModel[116] = new ModelRendererTurbo(this, 353, 17, textureX, textureY); // Box 265
		bodyModel[117] = new ModelRendererTurbo(this, 361, 17, textureX, textureY); // Box 130
		bodyModel[118] = new ModelRendererTurbo(this, 369, 17, textureX, textureY); // Box 264
		bodyModel[119] = new ModelRendererTurbo(this, 377, 17, textureX, textureY); // Box 268
		bodyModel[120] = new ModelRendererTurbo(this, 385, 17, textureX, textureY); // Box 269
		bodyModel[121] = new ModelRendererTurbo(this, 393, 17, textureX, textureY); // Box 270
		bodyModel[122] = new ModelRendererTurbo(this, 401, 17, textureX, textureY); // Box 271
		bodyModel[123] = new ModelRendererTurbo(this, 409, 17, textureX, textureY); // Box 505
		bodyModel[124] = new ModelRendererTurbo(this, 417, 17, textureX, textureY); // Box 273
		bodyModel[125] = new ModelRendererTurbo(this, 425, 17, textureX, textureY); // Box 274
		bodyModel[126] = new ModelRendererTurbo(this, 433, 17, textureX, textureY); // Box 275
		bodyModel[127] = new ModelRendererTurbo(this, 441, 17, textureX, textureY); // Box 276
		bodyModel[128] = new ModelRendererTurbo(this, 449, 17, textureX, textureY); // Box 277
		bodyModel[129] = new ModelRendererTurbo(this, 457, 17, textureX, textureY); // Box 278
		bodyModel[130] = new ModelRendererTurbo(this, 465, 17, textureX, textureY); // Box 279
		bodyModel[131] = new ModelRendererTurbo(this, 473, 17, textureX, textureY); // Box 280
		bodyModel[132] = new ModelRendererTurbo(this, 481, 17, textureX, textureY); // Box 281
		bodyModel[133] = new ModelRendererTurbo(this, 497, 17, textureX, textureY); // Box 282
		bodyModel[134] = new ModelRendererTurbo(this, 505, 17, textureX, textureY); // Box 283
		bodyModel[135] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 284
		bodyModel[136] = new ModelRendererTurbo(this, 9, 25, textureX, textureY); // Box 285
		bodyModel[137] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 286
		bodyModel[138] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 287
		bodyModel[139] = new ModelRendererTurbo(this, 41, 25, textureX, textureY); // Box 288
		bodyModel[140] = new ModelRendererTurbo(this, 49, 25, textureX, textureY); // Box 289
		bodyModel[141] = new ModelRendererTurbo(this, 57, 25, textureX, textureY); // Box 290
		bodyModel[142] = new ModelRendererTurbo(this, 65, 25, textureX, textureY); // Box 291
		bodyModel[143] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 292
		bodyModel[144] = new ModelRendererTurbo(this, 81, 25, textureX, textureY); // Box 293
		bodyModel[145] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Box 294
		bodyModel[146] = new ModelRendererTurbo(this, 97, 25, textureX, textureY); // Box 295
		bodyModel[147] = new ModelRendererTurbo(this, 105, 25, textureX, textureY); // Box 296

		bodyModel[0].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Wheel
		bodyModel[0].setRotationPoint(-8F, 7F, -6F);

		bodyModel[1].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Wheel
		bodyModel[1].setRotationPoint(0F, 7F, -6F);

		bodyModel[2].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Wheel
		bodyModel[2].setRotationPoint(8F, 7F, -6F);

		bodyModel[3].addBox(0F, 0F, 0F, 2, 2, 17, 0F); // Box 4
		bodyModel[3].setRotationPoint(-9F, 6F, -8.5F);

		bodyModel[4].addBox(0F, 0F, 0F, 2, 2, 17, 0F); // Box 27
		bodyModel[4].setRotationPoint(-1F, 6F, -8.5F);

		bodyModel[5].addBox(0F, 0F, 0F, 2, 2, 17, 0F); // Box 28
		bodyModel[5].setRotationPoint(7F, 6F, -8.5F);

		bodyModel[6].addBox(0F, 0F, 0F, 24, 2, 1, 0F); // Box 28
		bodyModel[6].setRotationPoint(-12F, 3.5F, -8F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 28
		bodyModel[7].setRotationPoint(1F, 5.5F, -8F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Box 28
		bodyModel[8].setRotationPoint(-2F, 5.5F, -8F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 28
		bodyModel[9].setRotationPoint(-1F, 8F, -8F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 28
		bodyModel[10].setRotationPoint(9F, 5.5F, -8F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Box 28
		bodyModel[11].setRotationPoint(6F, 5.5F, -8F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 28
		bodyModel[12].setRotationPoint(7F, 8F, -8F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 28
		bodyModel[13].setRotationPoint(-7F, 5.5F, -8F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Box 28
		bodyModel[14].setRotationPoint(-10F, 5.5F, -8F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 28
		bodyModel[15].setRotationPoint(-9F, 8F, -8F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 28
		bodyModel[16].setRotationPoint(-2F, 3F, -8.5F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F); // Box 28
		bodyModel[17].setRotationPoint(-6F, 7F, -8.25F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 28
		bodyModel[18].setRotationPoint(-6.75F, 5F, -8.25F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.5F, 0F, 0F, 0.5F, -0.75F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0.5F, -0.75F, -0.25F, 0.5F); // Box 28
		bodyModel[19].setRotationPoint(-6.75F, 7F, -8.25F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Box 28
		bodyModel[20].setRotationPoint(-8.75F, 5.5F, -8.25F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 28
		bodyModel[21].setRotationPoint(-7.5F, 4.5F, -8.25F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Box 28
		bodyModel[22].setRotationPoint(-6.75F, 4.5F, -8.25F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -2F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0.5F, 0F, -2F, 0.5F); // Box 28
		bodyModel[23].setRotationPoint(-7F, 5.5F, -8.25F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -1F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0.5F, 0F, -1F, 0.5F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 28
		bodyModel[24].setRotationPoint(-8.75F, 4.5F, -8.25F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F,0F, -2.325F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, -2.325F, 0.5F, 0F, -0.05F, 0F, -0.5F, -3.05F, 0F, -0.5F, -3.05F, 0.5F, 0F, -0.05F, 0.5F); // Box 28
		bodyModel[25].setRotationPoint(-3.5F, 4.55F, -8.25F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0.125F, 0F, -0.5F, 0.125F, 0.5F, 0F, 0F, 0.5F, 0F, -0.25F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0.5F, 0F, -0.25F, 0.5F); // Box 28
		bodyModel[26].setRotationPoint(-4F, 7F, -8.25F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0.5F, 0F, 0F, 0.5F, 0F, -0.55F, 0F, 0F, -0.55F, 0F, 0F, -0.55F, 0.5F, 0F, -0.55F, 0.5F); // Box 28
		bodyModel[27].setRotationPoint(-1F, 4.55F, -8.25F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.45F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -0.45F, 0.5F, 0F, -0.55F, 0F, 0F, -0.55F, 0F, 0F, -0.55F, 0.5F, 0F, -0.55F, 0.5F); // Box 28
		bodyModel[28].setRotationPoint(0F, 4.55F, -8.25F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F,0F, 0F, 0F, -0.5F, -2.325F, 0F, -0.5F, -2.325F, 0.5F, 0F, 0F, 0.5F, 0F, -3.05F, 0F, -0.5F, -0.05F, 0F, -0.5F, -0.05F, 0.5F, 0F, -3.05F, 0.5F); // Box 28
		bodyModel[29].setRotationPoint(1F, 4.55F, -8.25F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.5F, 0.125F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, 0.125F, 0.5F, -0.5F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0.5F, -0.5F, -0.5F, 0.5F); // Box 28
		bodyModel[30].setRotationPoint(3F, 7F, -8.25F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F); // Box 28
		bodyModel[31].setRotationPoint(4F, 7F, -8.25F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0.5F, -0.25F, -0.25F, 0.5F); // Box 28
		bodyModel[32].setRotationPoint(5.75F, 7F, -8.25F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-1F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.5F, -1F, 0F, 0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0.5F); // Box 28
		bodyModel[33].setRotationPoint(5F, 5F, -8.25F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.75F, 0F, 0.5F, -0.75F, -0.5F, 0F, 0F, -2F, 0F, 0F, -2F, 0.5F, -0.75F, -0.5F, 0.5F); // Box 28
		bodyModel[34].setRotationPoint(6F, 5.5F, -8.25F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 28
		bodyModel[35].setRotationPoint(6.75F, 4.5F, -8.25F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.25F, -0.5F, 0.5F, -0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F, -0.25F, -0.5F, 0.5F); // Box 28
		bodyModel[36].setRotationPoint(5.75F, 4.5F, -8.25F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, -0.75F, -1F, 0F, -0.75F, -1F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 28
		bodyModel[37].setRotationPoint(7.5F, 4.5F, -8.25F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Box 28
		bodyModel[38].setRotationPoint(7.5F, 5.5F, -8.25F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F); // Box 28
		bodyModel[39].setRotationPoint(5.25F, 5.5F, -8F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F); // Box 28
		bodyModel[40].setRotationPoint(4F, 5.5F, -8F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, -0.5F, 0F, -0.75F, -0.5F); // Box 28
		bodyModel[41].setRotationPoint(3.25F, 5.5F, -7.75F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F); // Box 28
		bodyModel[42].setRotationPoint(-5.5F, 5F, -8.5F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, -0.75F, 0F, -0.25F, -0.75F); // Box 28
		bodyModel[43].setRotationPoint(-5.75F, 5F, -8.75F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 28
		bodyModel[44].setRotationPoint(-5.5F, 5.75F, -9.25F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 28
		bodyModel[45].setRotationPoint(-12F, 3F, -8F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 1, 0, 2, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, 0F, 0F); // Box 130
		bodyModel[46].setRotationPoint(-7F, 3F, -9F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 28
		bodyModel[47].setRotationPoint(9F, 3F, -8F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0.5F, -0.5F, -0.5F); // Box 28
		bodyModel[48].setRotationPoint(4.5F, 5F, -8.5F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, -0.75F, 0F, -0.25F, -0.75F); // Box 28
		bodyModel[49].setRotationPoint(4.5F, 5F, -8.75F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 28
		bodyModel[50].setRotationPoint(4.75F, 5.75F, -9.25F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 2, 6, 0, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.5F, -3.25F, 0F, -1F, -3.25F, 0F, -1F, -3.25F, 0F, 0.5F, -3.25F, 0F); // Box 130
		bodyModel[51].setRotationPoint(5.25F, 3F, -9F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 1, 0, 2, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0.25F, 0F, 0F); // Box 130
		bodyModel[52].setRotationPoint(6F, 3F, -9F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 173
		bodyModel[53].setRotationPoint(-9F, 6F, -9F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 22
		bodyModel[54].setRotationPoint(-1F, 6F, -9F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 23
		bodyModel[55].setRotationPoint(7F, 6F, -9F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F); // Box 28
		bodyModel[56].setRotationPoint(-5F, 5.5F, -8F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F); // Box 28
		bodyModel[57].setRotationPoint(-6.25F, 5.5F, -8F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, -0.5F, 0F, -0.75F, -0.5F); // Box 28
		bodyModel[58].setRotationPoint(-3.75F, 5.5F, -7.75F);

		bodyModel[59].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 28
		bodyModel[59].setRotationPoint(-12F, 3.5F, -7F);

		bodyModel[60].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 28
		bodyModel[60].setRotationPoint(-12F, 3.5F, 5F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 1, 5, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 28
		bodyModel[61].setRotationPoint(-12F, 3.5F, -5F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 1, 5, 3, 0F,0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -3F, 0F, 0F, -3F, 0F); // Box 558
		bodyModel[62].setRotationPoint(-12F, 3.5F, 2F);

		bodyModel[63].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 28
		bodyModel[63].setRotationPoint(-12F, 6F, -2F);

		bodyModel[64].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 28
		bodyModel[64].setRotationPoint(11F, 3.5F, -7F);

		bodyModel[65].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 28
		bodyModel[65].setRotationPoint(11F, 3.5F, 5F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 1, 5, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 28
		bodyModel[66].setRotationPoint(11F, 3.5F, -5F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 1, 5, 3, 0F,0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -3F, 0F, 0F, -3F, 0F); // Box 558
		bodyModel[67].setRotationPoint(11F, 3.5F, 2F);

		bodyModel[68].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 28
		bodyModel[68].setRotationPoint(11F, 6F, -2F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 24, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 28
		bodyModel[69].setRotationPoint(-12F, 3.5F, -1.25F);

		bodyModel[70].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Wheel
		bodyModel[70].setRotationPoint(0F, 7F, 6F);

		bodyModel[71].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Wheel
		bodyModel[71].setRotationPoint(8F, 7F, 6F);

		bodyModel[72].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Wheel
		bodyModel[72].setRotationPoint(-8F, 7F, 6F);

		bodyModel[73].addBox(0F, 0F, 0F, 24, 2, 1, 0F); // Box 428
		bodyModel[73].setRotationPoint(-12F, 3.5F, 7F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 429
		bodyModel[74].setRotationPoint(1F, 5.5F, 7F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Box 430
		bodyModel[75].setRotationPoint(-2F, 5.5F, 7F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 431
		bodyModel[76].setRotationPoint(-1F, 8F, 7F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 432
		bodyModel[77].setRotationPoint(9F, 5.5F, 7F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Box 433
		bodyModel[78].setRotationPoint(6F, 5.5F, 7F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 434
		bodyModel[79].setRotationPoint(7F, 8F, 7F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 435
		bodyModel[80].setRotationPoint(-7F, 5.5F, 7F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Box 436
		bodyModel[81].setRotationPoint(-10F, 5.5F, 7F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 437
		bodyModel[82].setRotationPoint(-9F, 8F, 7F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F); // Box 439
		bodyModel[83].setRotationPoint(-3F, 3F, 7F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F); // Box 440
		bodyModel[84].setRotationPoint(2F, 3F, 7F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, 0.5F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 443
		bodyModel[85].setRotationPoint(-5.5F, 5F, 7.5F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.75F, -0.75F, -0.25F, -0.75F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 444
		bodyModel[86].setRotationPoint(-5.75F, 5F, 7.75F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 445
		bodyModel[87].setRotationPoint(-5.5F, 5.75F, 8.25F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 446
		bodyModel[88].setRotationPoint(-12F, 3F, 7F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 449
		bodyModel[89].setRotationPoint(9F, 3F, 7F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 450
		bodyModel[90].setRotationPoint(4.5F, 5F, 7.5F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.75F, -0.75F, -0.25F, -0.75F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 451
		bodyModel[91].setRotationPoint(4.5F, 5F, 7.75F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 452
		bodyModel[92].setRotationPoint(4.75F, 5.75F, 8.25F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 453
		bodyModel[93].setRotationPoint(-9F, 6F, 8F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 454
		bodyModel[94].setRotationPoint(-1F, 6F, 8F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 455
		bodyModel[95].setRotationPoint(7F, 6F, 8F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Box 505
		bodyModel[96].setRotationPoint(-1F, 5F, -8.25F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F); // Box 526
		bodyModel[97].setRotationPoint(-5F, 5.5F, 7F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F); // Box 527
		bodyModel[98].setRotationPoint(-6.25F, 5.5F, 7F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 528
		bodyModel[99].setRotationPoint(-3.75F, 5.5F, 6.75F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F); // Box 530
		bodyModel[100].setRotationPoint(5.25F, 5.5F, 7F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F); // Box 531
		bodyModel[101].setRotationPoint(4F, 5.5F, 7F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 532
		bodyModel[102].setRotationPoint(3.25F, 5.5F, 6.75F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 1, 0, 2, 0F,-0.5F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 537
		bodyModel[103].setRotationPoint(-7F, 3F, 7F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 3, 0, 1, 0F,0F, 0F, -0.5F, -0.55F, 0F, -0.5F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.55F, 0F, -0.5F, -0.7F, 0F, 0F, 0F, 0F, 0F); // Box 538
		bodyModel[104].setRotationPoint(-9F, 3F, 6.75F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 1, 0, 2, 0F,0.25F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Box 544
		bodyModel[105].setRotationPoint(6F, 3F, 7F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 3, 0, 1, 0F,0.15F, 0F, -0.5F, -0.7F, 0F, -0.5F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0.15F, 0F, -0.5F, -0.7F, 0F, -0.5F, -0.7F, 0F, 0F, 0F, 0F, 0F); // Box 545
		bodyModel[106].setRotationPoint(6.7F, 3F, 6.75F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 551
		bodyModel[107].setRotationPoint(-2F, 3F, 6.5F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F); // Box 442
		bodyModel[108].setRotationPoint(-12F, 3.17F, 9F);
		bodyModel[108].rotateAngleX = -0.78539816F;

		bodyModel[109].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F); // Box 442
		bodyModel[109].setRotationPoint(9F, 3.17F, 9F);
		bodyModel[109].rotateAngleX = -0.78539816F;

		bodyModel[110].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F); // Box 442
		bodyModel[110].setRotationPoint(-12F, 3.17F, -9F);
		bodyModel[110].rotateAngleX = -0.78539816F;

		bodyModel[111].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F); // Box 442
		bodyModel[111].setRotationPoint(9F, 3.17F, -9F);
		bodyModel[111].rotateAngleX = -0.78539816F;

		bodyModel[112].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 260
		bodyModel[112].setRotationPoint(-3F, 3F, -8F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 261
		bodyModel[113].setRotationPoint(2F, 3F, -8F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 3, 0, 1, 0F,0F, 0F, 0F, -0.7F, 0F, 0F, -0.55F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.55F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 263
		bodyModel[114].setRotationPoint(-9F, 3F, -7.75F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-0.7F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.7F, 0F, 0F, -0.575F, -0.54F, 0F, -0.05F, -0.54F, 0F, -0.05F, -0.54F, 0F, -0.575F, -0.54F, 0F); // Box 264
		bodyModel[115].setRotationPoint(6.05F, 3.92F, -9F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 3, 0, 1, 0F,0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, -0.5F, 0.15F, 0F, -0.5F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, -0.5F, 0.15F, 0F, -0.5F); // Box 265
		bodyModel[116].setRotationPoint(6.7F, 3F, -7.75F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 2, 6, 0, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -1F, -3.25F, 0F, 0.5F, -3.25F, 0F, 0.5F, -3.25F, 0F, -1F, -3.25F, 0F); // Box 130
		bodyModel[117].setRotationPoint(-7.25F, 3F, -9F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-0.05F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, -0.54F, 0F, -0.575F, -0.54F, 0F, -0.575F, -0.54F, 0F, -0.05F, -0.54F, 0F); // Box 264
		bodyModel[118].setRotationPoint(-9.05F, 3.92F, -9F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 2, 6, 0, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.5F, -3.25F, 0F, -1F, -3.25F, 0F, -1F, -3.25F, 0F, 0.5F, -3.25F, 0F); // Box 268
		bodyModel[119].setRotationPoint(5.25F, 3F, 9F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-0.7F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.7F, 0F, 0F, -0.575F, -0.54F, 0F, -0.05F, -0.54F, 0F, -0.05F, -0.54F, 0F, -0.575F, -0.54F, 0F); // Box 269
		bodyModel[120].setRotationPoint(6.05F, 3.92F, 9F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 2, 6, 0, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -1F, -3.25F, 0F, 0.5F, -3.25F, 0F, 0.5F, -3.25F, 0F, -1F, -3.25F, 0F); // Box 270
		bodyModel[121].setRotationPoint(-7.25F, 3F, 9F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-0.05F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, -0.54F, 0F, -0.575F, -0.54F, 0F, -0.575F, -0.54F, 0F, -0.05F, -0.54F, 0F); // Box 271
		bodyModel[122].setRotationPoint(-9.05F, 3.92F, 9F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0.125F, 0F, 0F, -0.875F, 0F, 0F, -0.875F, 0F, 0.5F, 0.125F, 0F, 0.5F, 0.125F, -0.5F, 0F, -0.875F, -0.5F, 0F, -0.875F, -0.5F, 0.5F, 0.125F, -0.5F, 0.5F); // Box 505
		bodyModel[123].setRotationPoint(-0.5F, 5.5F, -8.25F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 273
		bodyModel[124].setRotationPoint(-6F, 7F, 7.25F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0.5F, -1.25F, 0F, 0.5F, -1.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 274
		bodyModel[125].setRotationPoint(-6.75F, 5F, 7.25F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0F, -0.75F, -0.25F, 0F); // Box 275
		bodyModel[126].setRotationPoint(-6.75F, 7F, 7.25F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0.5F, -0.75F, 0F, 0.5F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, -0.75F, -0.5F, 0.5F, -0.75F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 276
		bodyModel[127].setRotationPoint(-8.75F, 5.5F, 7.25F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 277
		bodyModel[128].setRotationPoint(-7.5F, 4.5F, 7.25F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0.5F, -0.25F, -0.5F, 0.5F, -0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, -0.25F, -0.5F, 0.5F, -0.25F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 278
		bodyModel[129].setRotationPoint(-6.75F, 4.5F, 7.25F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0.5F, -0.75F, 0F, 0.5F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0.5F, -0.75F, -0.5F, 0.5F, -0.75F, -0.5F, 0F, 0F, -2F, 0F); // Box 279
		bodyModel[130].setRotationPoint(-7F, 5.5F, 7.25F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -1F, 0.5F, -0.75F, 0F, 0.5F, -0.75F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0.5F, -0.75F, 0F, 0.5F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 280
		bodyModel[131].setRotationPoint(-8.75F, 4.5F, 7.25F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F,0F, -2.325F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, 0F, -2.325F, 0F, 0F, -0.05F, 0.5F, -0.5F, -3.05F, 0.5F, -0.5F, -3.05F, 0F, 0F, -0.05F, 0F); // Box 281
		bodyModel[132].setRotationPoint(-3.5F, 4.55F, 7.25F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0.5F, -0.5F, 0.125F, 0.5F, -0.5F, 0.125F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0.5F, -0.5F, -0.5F, 0.5F, -0.5F, -0.5F, 0F, 0F, -0.25F, 0F); // Box 282
		bodyModel[133].setRotationPoint(-4F, 7F, 7.25F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0.5F, 0F, -0.45F, 0.5F, 0F, -0.45F, 0F, 0F, 0F, 0F, 0F, -0.55F, 0.5F, 0F, -0.55F, 0.5F, 0F, -0.55F, 0F, 0F, -0.55F, 0F); // Box 283
		bodyModel[134].setRotationPoint(-1F, 4.55F, 7.25F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.45F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -0.45F, 0F, 0F, -0.55F, 0.5F, 0F, -0.55F, 0.5F, 0F, -0.55F, 0F, 0F, -0.55F, 0F); // Box 284
		bodyModel[135].setRotationPoint(0F, 4.55F, 7.25F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F,0F, 0F, 0.5F, -0.5F, -2.325F, 0.5F, -0.5F, -2.325F, 0F, 0F, 0F, 0F, 0F, -3.05F, 0.5F, -0.5F, -0.05F, 0.5F, -0.5F, -0.05F, 0F, 0F, -3.05F, 0F); // Box 285
		bodyModel[136].setRotationPoint(1F, 4.55F, 7.25F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.5F, 0.125F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, 0.125F, 0F, -0.5F, -0.5F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0F, -0.5F, -0.5F, 0F); // Box 286
		bodyModel[137].setRotationPoint(3F, 7F, 7.25F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 287
		bodyModel[138].setRotationPoint(4F, 7F, 7.25F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.25F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0.5F, -0.75F, -0.25F, 0.5F, -0.75F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 288
		bodyModel[139].setRotationPoint(5.75F, 7F, 7.25F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-1F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0F, -1F, 0F, 0F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 289
		bodyModel[140].setRotationPoint(5F, 5F, 7.25F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.75F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, 0.5F, 0F, -2F, 0.5F, 0F, -2F, 0F, -0.75F, -0.5F, 0F); // Box 290
		bodyModel[141].setRotationPoint(6F, 5.5F, 7.25F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 291
		bodyModel[142].setRotationPoint(6.75F, 4.5F, 7.25F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Box 292
		bodyModel[143].setRotationPoint(5.75F, 4.5F, 7.25F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0.5F, -0.75F, -1F, 0.5F, -0.75F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.75F, 0F, 0.5F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 293
		bodyModel[144].setRotationPoint(7.5F, 4.5F, 7.25F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0.5F, -0.75F, 0F, 0.5F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, -0.75F, -0.5F, 0.5F, -0.75F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 294
		bodyModel[145].setRotationPoint(7.5F, 5.5F, 7.25F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 295
		bodyModel[146].setRotationPoint(-1F, 5F, 7.25F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0.125F, 0F, 0.5F, -0.875F, 0F, 0.5F, -0.875F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, -0.5F, 0.5F, -0.875F, -0.5F, 0.5F, -0.875F, -0.5F, 0F, 0.125F, -0.5F, 0F); // Box 296
		bodyModel[147].setRotationPoint(-0.5F, 5.5F, 7.25F);
	}
}