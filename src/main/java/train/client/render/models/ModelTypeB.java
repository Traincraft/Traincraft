//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 28.08.2019 - 22:53:21
// Last changed on: 28.08.2019 - 22:53:21

package train.client.render.models;

import tmt.ModelConverter;
import tmt.ModelRendererTurbo;

public class ModelTypeB extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelTypeB() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[101];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 4
		bodyModel[1] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 5
		bodyModel[2] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 30
		bodyModel[3] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 52
		bodyModel[4] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 53
		bodyModel[5] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 59
		bodyModel[6] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 60
		bodyModel[7] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 65
		bodyModel[8] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 66
		bodyModel[9] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 67
		bodyModel[10] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 70
		bodyModel[11] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 71
		bodyModel[12] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 72
		bodyModel[13] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 73
		bodyModel[14] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 95
		bodyModel[15] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 96
		bodyModel[16] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 46
		bodyModel[17] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 47
		bodyModel[18] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 48
		bodyModel[19] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 346
		bodyModel[20] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 47
		bodyModel[21] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 48
		bodyModel[22] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 51
		bodyModel[23] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 52
		bodyModel[24] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 53
		bodyModel[25] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 63
		bodyModel[26] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 64
		bodyModel[27] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 69
		bodyModel[28] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 70
		bodyModel[29] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 71
		bodyModel[30] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 72
		bodyModel[31] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 73
		bodyModel[32] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 75
		bodyModel[33] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 76
		bodyModel[34] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 77
		bodyModel[35] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 78
		bodyModel[36] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 79
		bodyModel[37] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 81
		bodyModel[38] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 82
		bodyModel[39] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 85
		bodyModel[40] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 91
		bodyModel[41] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 92
		bodyModel[42] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 93
		bodyModel[43] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 94
		bodyModel[44] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 104
		bodyModel[45] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 110
		bodyModel[46] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 101
		bodyModel[47] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 102
		bodyModel[48] = new ModelRendererTurbo(this, 9, 9, textureX, textureY); // Box 103
		bodyModel[49] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 104
		bodyModel[50] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Box 37
		bodyModel[51] = new ModelRendererTurbo(this, 73, 9, textureX, textureY); // Box 38
		bodyModel[52] = new ModelRendererTurbo(this, 89, 9, textureX, textureY); // Box 37
		bodyModel[53] = new ModelRendererTurbo(this, 105, 9, textureX, textureY); // Box 37
		bodyModel[54] = new ModelRendererTurbo(this, 121, 9, textureX, textureY); // Box 37
		bodyModel[55] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Box 219
		bodyModel[56] = new ModelRendererTurbo(this, 161, 9, textureX, textureY); // Box 220
		bodyModel[57] = new ModelRendererTurbo(this, 169, 9, textureX, textureY); // Box 221
		bodyModel[58] = new ModelRendererTurbo(this, 193, 9, textureX, textureY); // Box 329
		bodyModel[59] = new ModelRendererTurbo(this, 209, 9, textureX, textureY); // Box 330
		bodyModel[60] = new ModelRendererTurbo(this, 137, 9, textureX, textureY); // Box 331
		bodyModel[61] = new ModelRendererTurbo(this, 177, 9, textureX, textureY); // Box 332
		bodyModel[62] = new ModelRendererTurbo(this, 257, 9, textureX, textureY); // Box 333
		bodyModel[63] = new ModelRendererTurbo(this, 241, 9, textureX, textureY); // Box 334
		bodyModel[64] = new ModelRendererTurbo(this, 289, 9, textureX, textureY); // Box 335
		bodyModel[65] = new ModelRendererTurbo(this, 297, 9, textureX, textureY); // Box 336
		bodyModel[66] = new ModelRendererTurbo(this, 313, 9, textureX, textureY); // Box 337
		bodyModel[67] = new ModelRendererTurbo(this, 329, 9, textureX, textureY); // Box 338
		bodyModel[68] = new ModelRendererTurbo(this, 337, 9, textureX, textureY); // Box 339
		bodyModel[69] = new ModelRendererTurbo(this, 345, 9, textureX, textureY); // Box 340
		bodyModel[70] = new ModelRendererTurbo(this, 353, 9, textureX, textureY); // Box 341
		bodyModel[71] = new ModelRendererTurbo(this, 249, 9, textureX, textureY); // Box 342
		bodyModel[72] = new ModelRendererTurbo(this, 377, 9, textureX, textureY); // Box 343
		bodyModel[73] = new ModelRendererTurbo(this, 385, 9, textureX, textureY); // Box 344
		bodyModel[74] = new ModelRendererTurbo(this, 393, 9, textureX, textureY); // Box 345
		bodyModel[75] = new ModelRendererTurbo(this, 417, 9, textureX, textureY); // Box 346
		bodyModel[76] = new ModelRendererTurbo(this, 441, 9, textureX, textureY); // Box 347
		bodyModel[77] = new ModelRendererTurbo(this, 449, 9, textureX, textureY); // Box 348
		bodyModel[78] = new ModelRendererTurbo(this, 457, 9, textureX, textureY); // Box 349
		bodyModel[79] = new ModelRendererTurbo(this, 465, 9, textureX, textureY); // Box 350
		bodyModel[80] = new ModelRendererTurbo(this, 473, 9, textureX, textureY); // Box 351
		bodyModel[81] = new ModelRendererTurbo(this, 497, 9, textureX, textureY); // Box 352
		bodyModel[82] = new ModelRendererTurbo(this, 97, 17, textureX, textureY); // Box 353
		bodyModel[83] = new ModelRendererTurbo(this, 505, 9, textureX, textureY); // Box 354
		bodyModel[84] = new ModelRendererTurbo(this, 113, 17, textureX, textureY); // Box 66
		bodyModel[85] = new ModelRendererTurbo(this, 257, 17, textureX, textureY); // Box 67
		bodyModel[86] = new ModelRendererTurbo(this, 273, 17, textureX, textureY); // Box 37
		bodyModel[87] = new ModelRendererTurbo(this, 289, 17, textureX, textureY); // Box 37
		bodyModel[88] = new ModelRendererTurbo(this, 305, 17, textureX, textureY); // Box 37
		bodyModel[89] = new ModelRendererTurbo(this, 209, 17, textureX, textureY); // Box 365
		bodyModel[90] = new ModelRendererTurbo(this, 321, 17, textureX, textureY); // Box 366
		bodyModel[91] = new ModelRendererTurbo(this, 329, 17, textureX, textureY); // Box 367
		bodyModel[92] = new ModelRendererTurbo(this, 337, 17, textureX, textureY); // Box 368
		bodyModel[93] = new ModelRendererTurbo(this, 337, 17, textureX, textureY); // Box 369
		bodyModel[94] = new ModelRendererTurbo(this, 377, 17, textureX, textureY); // Box 370
		bodyModel[95] = new ModelRendererTurbo(this, 417, 17, textureX, textureY); // Box 371
		bodyModel[96] = new ModelRendererTurbo(this, 361, 17, textureX, textureY); // Box 372
		bodyModel[97] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 175
		bodyModel[98] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 176
		bodyModel[99] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 177
		bodyModel[100] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 178

		bodyModel[0].addBox(0F, 0F, 0F, 2, 2, 18, 0F); // Box 4
		bodyModel[0].setRotationPoint(-9F, 0.5F, -9F);

		bodyModel[1].addBox(0F, 0F, 0F, 2, 2, 18, 0F); // Box 5
		bodyModel[1].setRotationPoint(7F, 0.5F, -9F);

		bodyModel[2].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 30
		bodyModel[2].setRotationPoint(8F, 1.5F, 6F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 52
		bodyModel[3].setRotationPoint(-9F, -1F, -8.75F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 53
		bodyModel[4].setRotationPoint(-7F, 0.5F, -8.75F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 59
		bodyModel[5].setRotationPoint(-11F, 0F, -7.75F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 60
		bodyModel[6].setRotationPoint(9F, 0F, -7.75F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 7, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 65
		bodyModel[7].setRotationPoint(5F, -1.5F, -7.75F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 66
		bodyModel[8].setRotationPoint(-7F, 0F, -7.75F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 67
		bodyModel[9].setRotationPoint(5F, 0F, -7.75F);

		bodyModel[10].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 70
		bodyModel[10].setRotationPoint(-5F, 0F, -8F);

		bodyModel[11].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 71
		bodyModel[11].setRotationPoint(-3.5F, 0F, -8F);

		bodyModel[12].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 72
		bodyModel[12].setRotationPoint(4F, 0F, -8F);

		bodyModel[13].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 73
		bodyModel[13].setRotationPoint(2.5F, 0F, -8F);

		bodyModel[14].addBox(0F, 0F, 0F, 5, 2, 14, 0F); // Box 95
		bodyModel[14].setRotationPoint(-2.5F, 0F, -7F);

		bodyModel[15].addBox(0F, 0F, 0F, 4, 1, 15, 0F); // Box 96
		bodyModel[15].setRotationPoint(-2F, -0.75F, -7.5F);

		bodyModel[16].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 46
		bodyModel[16].setRotationPoint(-8F, 1.5F, 6F);

		bodyModel[17].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 47
		bodyModel[17].setRotationPoint(-8F, 1.5F, -6F);

		bodyModel[18].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 48
		bodyModel[18].setRotationPoint(8F, 1.5F, -6F);

		bodyModel[19].addBox(0F, 0F, 0F, 6, 5, 11, 0F); // Box 346
		bodyModel[19].setRotationPoint(-10.5F, -1.5F, -5.5F);

		bodyModel[20].addBox(0F, 0F, 0F, 11, 2, 1, 0F); // Box 47
		bodyModel[20].setRotationPoint(-5.5F, 2F, -8.75F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -1.5F, 0F); // Box 48
		bodyModel[21].setRotationPoint(-7F, 3F, -8.75F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 51
		bodyModel[22].setRotationPoint(-11F, -2.5F, -8.5F);

		bodyModel[23].addBox(0F, 0F, 0F, 2, 0, 1, 0F); // Box 52
		bodyModel[23].setRotationPoint(-9F, -1.6F, -8.5F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 3, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 0F); // Box 53
		bodyModel[24].setRotationPoint(-7F, -1.6F, -8.5F);

		bodyModel[25].addBox(0F, 0F, 0F, 7, 0, 1, 0F); // Box 63
		bodyModel[25].setRotationPoint(4.5F, 3.01F, -7.5F);

		bodyModel[26].addBox(0F, 0F, 0F, 0, 3, 1, 0F); // Box 64
		bodyModel[26].setRotationPoint(11.5F, 0.01F, -7.5F);

		bodyModel[27].addBox(0F, 0F, 0F, 7, 0, 1, 0F); // Box 69
		bodyModel[27].setRotationPoint(-11.5F, 3.01F, -7.5F);

		bodyModel[28].addBox(0F, 0F, 0F, 0, 3, 1, 0F); // Box 70
		bodyModel[28].setRotationPoint(-11.5F, 0.01F, -7.5F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 71
		bodyModel[29].setRotationPoint(-12F, -1.5F, -6.5F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 72
		bodyModel[30].setRotationPoint(-12F, -1.5F, 3.5F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 73
		bodyModel[31].setRotationPoint(-12F, -0.5F, -3.5F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 75
		bodyModel[32].setRotationPoint(-12F, -1.5F, -3.5F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 76
		bodyModel[33].setRotationPoint(-12F, -1.5F, 2.5F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 77
		bodyModel[34].setRotationPoint(11F, -1.5F, -6.5F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 78
		bodyModel[35].setRotationPoint(11F, -1.5F, 3.5F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 79
		bodyModel[36].setRotationPoint(11F, -1.5F, 2.5F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 81
		bodyModel[37].setRotationPoint(11F, -0.5F, -3.5F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 82
		bodyModel[38].setRotationPoint(11F, -1.5F, -3.5F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 85
		bodyModel[39].setRotationPoint(-9F, -0.5F, -8.75F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F); // Box 91
		bodyModel[40].setRotationPoint(3F, -1.5F, -7.75F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 7, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 92
		bodyModel[41].setRotationPoint(-12F, -1.5F, -7.75F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F); // Box 93
		bodyModel[42].setRotationPoint(-5F, -1.5F, -7.75F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 94
		bodyModel[43].setRotationPoint(-3F, -1.5F, -8.25F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 104
		bodyModel[44].setRotationPoint(-9F, 0.5F, -9.5F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 110
		bodyModel[45].setRotationPoint(7F, 0.5F, -9.5F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0.5F, 0F, 0F); // Box 101
		bodyModel[46].setRotationPoint(6F, 3F, -8.75F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 102
		bodyModel[47].setRotationPoint(6F, 0.5F, -8.75F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 103
		bodyModel[48].setRotationPoint(6F, -0.5F, -8.75F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 104
		bodyModel[49].setRotationPoint(6F, -1F, -8.75F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 37
		bodyModel[50].setRotationPoint(-1.5F, 0F, -8F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 38
		bodyModel[51].setRotationPoint(-1.5F, 1.5F, -8F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F); // Box 37
		bodyModel[52].setRotationPoint(-1.5F, 1.1F, -9F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F); // Box 37
		bodyModel[53].setRotationPoint(-1.5F, 0.4F, -9F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.23F, 0F, 0F, -0.23F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.23F, 0F, 0F, -0.23F, 0F); // Box 37
		bodyModel[54].setRotationPoint(-1.5F, 0.75F, -10F);

		bodyModel[55].addBox(0F, 0F, 0F, 2, 0, 1, 0F); // Box 219
		bodyModel[55].setRotationPoint(7F, -1.6F, -8.5F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 3, 0, 1, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F); // Box 220
		bodyModel[56].setRotationPoint(4F, -1.6F, -8.5F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 221
		bodyModel[57].setRotationPoint(9F, -2.5F, -8.5F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 329
		bodyModel[58].setRotationPoint(6F, -0.5F, 7.75F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 330
		bodyModel[59].setRotationPoint(6F, -1F, 7.75F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 331
		bodyModel[60].setRotationPoint(6F, 0.5F, 7.75F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0.5F, 0F, 0F); // Box 332
		bodyModel[61].setRotationPoint(6F, 3F, 7.75F);

		bodyModel[62].addBox(0F, 0F, 0F, 11, 2, 1, 0F); // Box 333
		bodyModel[62].setRotationPoint(-5.5F, 2F, 7.75F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -1.5F, 0F); // Box 334
		bodyModel[63].setRotationPoint(-7F, 3F, 7.75F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 335
		bodyModel[64].setRotationPoint(-7F, 0.5F, 7.75F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 336
		bodyModel[65].setRotationPoint(-9F, -0.5F, 7.75F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 337
		bodyModel[66].setRotationPoint(-9F, -1F, 7.75F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 338
		bodyModel[67].setRotationPoint(9F, -2.5F, 7.5F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 339
		bodyModel[68].setRotationPoint(7F, 0.5F, 8.5F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 340
		bodyModel[69].setRotationPoint(-9F, 0.5F, 8.5F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 341
		bodyModel[70].setRotationPoint(-11F, -2.5F, 7.5F);

		bodyModel[71].addBox(0F, 0F, 0F, 2, 0, 1, 0F); // Box 342
		bodyModel[71].setRotationPoint(-9F, -1.6F, 7.5F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 3, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 343
		bodyModel[72].setRotationPoint(-7F, -1.6F, 7.5F);

		bodyModel[73].addBox(0F, 0F, 0F, 2, 0, 1, 0F); // Box 344
		bodyModel[73].setRotationPoint(7F, -1.6F, 7.5F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 3, 0, 1, 0F,0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 345
		bodyModel[74].setRotationPoint(4F, -1.6F, 7.5F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 7, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 346
		bodyModel[75].setRotationPoint(5F, -1.5F, 6.75F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 347
		bodyModel[76].setRotationPoint(9F, 0F, 6.75F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 348
		bodyModel[77].setRotationPoint(5F, 0F, 6.75F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 349
		bodyModel[78].setRotationPoint(-7F, 0F, 6.75F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 350
		bodyModel[79].setRotationPoint(-11F, 0F, 6.75F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 7, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 351
		bodyModel[80].setRotationPoint(-12F, -1.5F, 6.75F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F); // Box 352
		bodyModel[81].setRotationPoint(-5F, -1.5F, 6.75F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 353
		bodyModel[82].setRotationPoint(-3F, -1.5F, 7.25F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F); // Box 354
		bodyModel[83].setRotationPoint(3F, -1.5F, 6.75F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 66
		bodyModel[84].setRotationPoint(-1.5F, 0F, 6F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 67
		bodyModel[85].setRotationPoint(-1.5F, 1.5F, 6F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F); // Box 37
		bodyModel[86].setRotationPoint(-1.5F, 1.1F, 6F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F); // Box 37
		bodyModel[87].setRotationPoint(-1.5F, 0.4F, 6F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, -0.23F, 0F, 0F, -0.23F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.23F, 0F, 0F, -0.23F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F); // Box 37
		bodyModel[88].setRotationPoint(-1.5F, 0.75F, 7F);

		bodyModel[89].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 365
		bodyModel[89].setRotationPoint(-3.5F, 0F, 7F);

		bodyModel[90].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 366
		bodyModel[90].setRotationPoint(4F, 0F, 7F);

		bodyModel[91].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 367
		bodyModel[91].setRotationPoint(2.5F, 0F, 7F);

		bodyModel[92].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 368
		bodyModel[92].setRotationPoint(-5F, 0F, 7F);

		bodyModel[93].addBox(0F, 0F, 0F, 6, 5, 11, 0F); // Box 369
		bodyModel[93].setRotationPoint(4.5F, -1.5F, -5.5F);

		bodyModel[94].addBox(0F, 0F, 0F, 3, 4, 13, 0F); // Box 370
		bodyModel[94].setRotationPoint(-4.5F, -0.5F, -6.5F);

		bodyModel[95].addBox(0F, 0F, 0F, 3, 4, 13, 0F); // Box 371
		bodyModel[95].setRotationPoint(1.5F, -0.5F, -6.5F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F); // Box 372
		bodyModel[96].setRotationPoint(-1F, -1.5F, -1F);

		bodyModel[97].addBox(0F, 0F, 0F, 7, 0, 1, 0F); // Box 175
		bodyModel[97].setRotationPoint(-11.5F, 3.01F, 6.5F);

		bodyModel[98].addBox(0F, 0F, 0F, 0, 3, 1, 0F); // Box 176
		bodyModel[98].setRotationPoint(-11.5F, 0.01F, 6.5F);

		bodyModel[99].addBox(0F, 0F, 0F, 7, 0, 1, 0F); // Box 177
		bodyModel[99].setRotationPoint(4.5F, 3.01F, 6.5F);

		bodyModel[100].addBox(0F, 0F, 0F, 0, 3, 1, 0F); // Box 178
		bodyModel[100].setRotationPoint(11.5F, 0.01F, 6.5F);
	}
}