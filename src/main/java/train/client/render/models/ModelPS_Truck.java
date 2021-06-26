//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2021 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 08.05.2021 - 23:09:26
// Last changed on: 08.05.2021 - 23:09:26

package train.client.render.models; //Path where the model is located


import tmt.ModelConverter;
import tmt.ModelRendererTurbo;

public class ModelPS_Truck extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelPS_Truck() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[122];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 2 wheel
		bodyModel[1] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 2 wheel
		bodyModel[2] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 79
		bodyModel[3] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 79
		bodyModel[4] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 380
		bodyModel[5] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 381
		bodyModel[6] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 2 wheel
		bodyModel[7] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 79 axle
		bodyModel[8] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 79 axle
		bodyModel[9] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 17
		bodyModel[10] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 79
		bodyModel[11] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 79
		bodyModel[12] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 17
		bodyModel[13] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 17
		bodyModel[14] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 17
		bodyModel[15] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 79
		bodyModel[16] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 17
		bodyModel[17] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 17
		bodyModel[18] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 17
		bodyModel[19] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 17
		bodyModel[20] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 17
		bodyModel[21] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 17
		bodyModel[22] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 17
		bodyModel[23] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 17
		bodyModel[24] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 17
		bodyModel[25] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 144
		bodyModel[26] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 144
		bodyModel[27] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 144
		bodyModel[28] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 144
		bodyModel[29] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 144
		bodyModel[30] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 144
		bodyModel[31] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 17
		bodyModel[32] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 17
		bodyModel[33] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 17
		bodyModel[34] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 144
		bodyModel[35] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 144
		bodyModel[36] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 17
		bodyModel[37] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 161
		bodyModel[38] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 17
		bodyModel[39] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 17
		bodyModel[40] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 17
		bodyModel[41] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 17
		bodyModel[42] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 17
		bodyModel[43] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 17
		bodyModel[44] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 17
		bodyModel[45] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 537
		bodyModel[46] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 538
		bodyModel[47] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 442
		bodyModel[48] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 442
		bodyModel[49] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 442
		bodyModel[50] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 538
		bodyModel[51] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 537
		bodyModel[52] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 79
		bodyModel[53] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 79
		bodyModel[54] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 79
		bodyModel[55] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 79
		bodyModel[56] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 2
		bodyModel[57] = new ModelRendererTurbo(this, 65, 9, textureX, textureY); // Box 79
		bodyModel[58] = new ModelRendererTurbo(this, 89, 9, textureX, textureY); // Box 79
		bodyModel[59] = new ModelRendererTurbo(this, 97, 9, textureX, textureY); // Box 79
		bodyModel[60] = new ModelRendererTurbo(this, 121, 9, textureX, textureY); // Box 79
		bodyModel[61] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 79
		bodyModel[62] = new ModelRendererTurbo(this, 73, 9, textureX, textureY); // Box 79
		bodyModel[63] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 79
		bodyModel[64] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 526
		bodyModel[65] = new ModelRendererTurbo(this, 105, 9, textureX, textureY); // Box 527
		bodyModel[66] = new ModelRendererTurbo(this, 129, 9, textureX, textureY); // Box 2 wheel
		bodyModel[67] = new ModelRendererTurbo(this, 145, 9, textureX, textureY); // Box 79
		bodyModel[68] = new ModelRendererTurbo(this, 161, 9, textureX, textureY); // Box 79
		bodyModel[69] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 79
		bodyModel[70] = new ModelRendererTurbo(this, 169, 9, textureX, textureY); // Box 526
		bodyModel[71] = new ModelRendererTurbo(this, 185, 9, textureX, textureY); // Box 527
		bodyModel[72] = new ModelRendererTurbo(this, 193, 9, textureX, textureY); // Box 72
		bodyModel[73] = new ModelRendererTurbo(this, 209, 9, textureX, textureY); // Box 73
		bodyModel[74] = new ModelRendererTurbo(this, 225, 9, textureX, textureY); // Box 74
		bodyModel[75] = new ModelRendererTurbo(this, 265, 9, textureX, textureY); // Box 75
		bodyModel[76] = new ModelRendererTurbo(this, 281, 9, textureX, textureY); // Box 76
		bodyModel[77] = new ModelRendererTurbo(this, 305, 9, textureX, textureY); // Box 77
		bodyModel[78] = new ModelRendererTurbo(this, 321, 9, textureX, textureY); // Box 78
		bodyModel[79] = new ModelRendererTurbo(this, 353, 9, textureX, textureY); // Box 79
		bodyModel[80] = new ModelRendererTurbo(this, 361, 9, textureX, textureY); // Box 80
		bodyModel[81] = new ModelRendererTurbo(this, 377, 10, textureX, textureY); // Box 81
		bodyModel[82] = new ModelRendererTurbo(this, 385, 10, textureX, textureY); // Box 82
		bodyModel[83] = new ModelRendererTurbo(this, 417, 9, textureX, textureY); // Box 83
		bodyModel[84] = new ModelRendererTurbo(this, 425, 9, textureX, textureY); // Box 84
		bodyModel[85] = new ModelRendererTurbo(this, 433, 9, textureX, textureY); // Box 85
		bodyModel[86] = new ModelRendererTurbo(this, 441, 9, textureX, textureY); // Box 86
		bodyModel[87] = new ModelRendererTurbo(this, 153, 9, textureX, textureY); // Box 87
		bodyModel[88] = new ModelRendererTurbo(this, 177, 9, textureX, textureY); // Box 88
		bodyModel[89] = new ModelRendererTurbo(this, 449, 9, textureX, textureY); // Box 89
		bodyModel[90] = new ModelRendererTurbo(this, 473, 9, textureX, textureY); // Box 90
		bodyModel[91] = new ModelRendererTurbo(this, 481, 9, textureX, textureY); // Box 91
		bodyModel[92] = new ModelRendererTurbo(this, 489, 9, textureX, textureY); // Box 92
		bodyModel[93] = new ModelRendererTurbo(this, 497, 9, textureX, textureY); // Box 93
		bodyModel[94] = new ModelRendererTurbo(this, 505, 9, textureX, textureY); // Box 94
		bodyModel[95] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 95
		bodyModel[96] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Box 96
		bodyModel[97] = new ModelRendererTurbo(this, 41, 17, textureX, textureY); // Box 97
		bodyModel[98] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 98
		bodyModel[99] = new ModelRendererTurbo(this, 65, 17, textureX, textureY); // Box 99
		bodyModel[100] = new ModelRendererTurbo(this, 81, 17, textureX, textureY); // Box 100
		bodyModel[101] = new ModelRendererTurbo(this, 89, 17, textureX, textureY); // Box 101
		bodyModel[102] = new ModelRendererTurbo(this, 97, 17, textureX, textureY); // Box 103
		bodyModel[103] = new ModelRendererTurbo(this, 105, 17, textureX, textureY); // Box 104
		bodyModel[104] = new ModelRendererTurbo(this, 113, 17, textureX, textureY); // Box 105
		bodyModel[105] = new ModelRendererTurbo(this, 129, 17, textureX, textureY); // Box 106
		bodyModel[106] = new ModelRendererTurbo(this, 137, 17, textureX, textureY); // Box 107
		bodyModel[107] = new ModelRendererTurbo(this, 145, 17, textureX, textureY); // Box 108
		bodyModel[108] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Box 109
		bodyModel[109] = new ModelRendererTurbo(this, 145, 9, textureX, textureY); // Box 110
		bodyModel[110] = new ModelRendererTurbo(this, 169, 9, textureX, textureY); // Box 111
		bodyModel[111] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Box 112
		bodyModel[112] = new ModelRendererTurbo(this, 153, 17, textureX, textureY); // Box 113
		bodyModel[113] = new ModelRendererTurbo(this, 161, 17, textureX, textureY); // Box 114
		bodyModel[114] = new ModelRendererTurbo(this, 169, 17, textureX, textureY); // Box 115
		bodyModel[115] = new ModelRendererTurbo(this, 201, 9, textureX, textureY); // Box 117
		bodyModel[116] = new ModelRendererTurbo(this, 217, 9, textureX, textureY); // Box 121
		bodyModel[117] = new ModelRendererTurbo(this, 177, 17, textureX, textureY); // Box 537
		bodyModel[118] = new ModelRendererTurbo(this, 185, 17, textureX, textureY); // Box 537
		bodyModel[119] = new ModelRendererTurbo(this, 193, 17, textureX, textureY); // Box 442
		bodyModel[120] = new ModelRendererTurbo(this, 201, 17, textureX, textureY); // Box 442
		bodyModel[121] = new ModelRendererTurbo(this, 209, 17, textureX, textureY); // Box 442

		bodyModel[0].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 2 wheel
		bodyModel[0].setRotationPoint(-6.5F, 7F, -6F);

		bodyModel[1].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 2 wheel
		bodyModel[1].setRotationPoint(6.5F, 7F, -6F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 79
		bodyModel[2].setRotationPoint(5.75F, 6.25F, 8.5F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 79
		bodyModel[3].setRotationPoint(-7.25F, 6.25F, 8.5F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 380
		bodyModel[4].setRotationPoint(5.75F, 6.25F, -9.5F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 381
		bodyModel[5].setRotationPoint(-7.25F, 6.25F, -9.5F);

		bodyModel[6].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 2 wheel
		bodyModel[6].setRotationPoint(-6.5F, 7F, 6F);

		bodyModel[7].addBox(-1F, -1F, 0F, 2, 2, 13, 0F); // Box 79 axle
		bodyModel[7].setRotationPoint(-6.5F, 7F, -6.5F);

		bodyModel[8].addBox(-1F, -1F, 0F, 2, 2, 13, 0F); // Box 79 axle
		bodyModel[8].setRotationPoint(6.5F, 7F, -6.5F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F); // Box 17
		bodyModel[9].setRotationPoint(7.25F, 5.25F, 6.75F);

		bodyModel[10].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 79
		bodyModel[10].setRotationPoint(5.5F, 6F, 6.5F);

		bodyModel[11].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 79
		bodyModel[11].setRotationPoint(-7.5F, 6F, 6.5F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F); // Box 17
		bodyModel[12].setRotationPoint(4.75F, 5.25F, 6.75F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F); // Box 17
		bodyModel[13].setRotationPoint(-5.75F, 5.25F, 6.75F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F); // Box 17
		bodyModel[14].setRotationPoint(-8.25F, 5.25F, 6.75F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 17, 1, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 79
		bodyModel[15].setRotationPoint(-8.25F, 4.25F, 6.75F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 17
		bodyModel[16].setRotationPoint(5.5F, 5.5F, 7F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 17
		bodyModel[17].setRotationPoint(-7F, 5.5F, 7F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		bodyModel[18].setRotationPoint(-4F, 7.75F, 7F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 17
		bodyModel[19].setRotationPoint(4F, 7.75F, 7F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 17
		bodyModel[20].setRotationPoint(3.75F, 7.25F, 7F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.55F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.55F, 0F, 0F, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 17
		bodyModel[21].setRotationPoint(4.25F, 5.5F, 7F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 17
		bodyModel[22].setRotationPoint(-5F, 7.75F, 7F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 17
		bodyModel[23].setRotationPoint(-5F, 7.25F, 7F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.25F, 0F, 0F, -0.55F, 0F, 0F, -0.55F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 17
		bodyModel[24].setRotationPoint(-5.25F, 5.5F, 7F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 1, 7, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -4.5F, 0F, 0F, -4.5F, 0F, 0F, -4.5F, -0.5F, 0F, -4.5F, -0.5F); // Box 144
		bodyModel[25].setRotationPoint(-3.75F, 4.75F, 6.75F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 1, 7, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -4.5F, 0F, 0F, -4.5F, 0F, 0F, -4.5F, -0.5F, 0F, -4.5F, -0.5F); // Box 144
		bodyModel[26].setRotationPoint(2.75F, 4.75F, 6.75F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, -0.25F, 0F, -0.75F); // Box 144
		bodyModel[27].setRotationPoint(1.5F, 7.25F, 6.75F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, -0.25F, 0F, -0.75F); // Box 144
		bodyModel[28].setRotationPoint(-3.75F, 7.25F, 6.75F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 1, 7, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -4.5F, 0F, 0F, -4.5F, 0F, 0F, -4.5F, -0.5F, 0F, -4.5F, -0.5F); // Box 144
		bodyModel[29].setRotationPoint(1.5F, 4.75F, 6.75F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 1, 7, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -4.5F, 0F, 0F, -4.5F, 0F, 0F, -4.5F, -0.5F, 0F, -4.5F, -0.5F); // Box 144
		bodyModel[30].setRotationPoint(-2.5F, 4.75F, 6.75F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, -0.5F, 0F, -0.75F, -0.5F); // Box 17
		bodyModel[31].setRotationPoint(-0.25F, 5.25F, 8.25F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 17
		bodyModel[32].setRotationPoint(-5.2F, 5.25F, 8.25F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 3, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 17
		bodyModel[33].setRotationPoint(-1.5F, 5.25F, -7.75F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5.5F, 0F, 0F, -5.5F, 0F, 0F, -5.5F, 0F, 0F, -5.5F, 0F); // Box 144
		bodyModel[34].setRotationPoint(0.149999999999999F, 5.75F, 6.75F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5.5F, 0F, 0F, -5.5F, 0F, 0F, -5.5F, 0F, 0F, -5.5F, 0F); // Box 144
		bodyModel[35].setRotationPoint(-1.15F, 5.75F, 6.75F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 17
		bodyModel[36].setRotationPoint(-1.5F, 7.25F, 6.75F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 161
		bodyModel[37].setRotationPoint(-0.25F, 4.5F, 8F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		bodyModel[38].setRotationPoint(-4.95F, 5.25F, 8.75F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, 0F, 0.01F, -0.5F, 0F, 0.01F, -0.5F); // Box 17
		bodyModel[39].setRotationPoint(-0.5F, 6.5F, 8.25F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, 0F, 0.01F, -0.5F, 0F, 0.01F, -0.5F); // Box 17
		bodyModel[40].setRotationPoint(0.5F, 6.5F, 8.25F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 1, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, 0F, 0.01F, -0.5F, 0F, 0.01F, -0.5F); // Box 17
		bodyModel[41].setRotationPoint(-0.5F, 7.51F, 8.25F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 17
		bodyModel[42].setRotationPoint(-0.5F, 5.25F, 7.75F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 17
		bodyModel[43].setRotationPoint(0.5F, 5.25F, 7.75F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.56F, 0F, 0F, -0.56F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.56F, 0F, 0F, -0.56F, 0F, 0F, 0F, 0F, 0F); // Box 17
		bodyModel[44].setRotationPoint(-0.950000000000003F, 5.25F, 8.25F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 1, 0, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.39F, -0.25F, 0F, -0.39F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.39F, -0.25F, 0F, -0.39F); // Box 537
		bodyModel[45].setRotationPoint(-2.5F, 3.75F, 7.25F);
		bodyModel[45].rotateAngleX = -0.44942228F;

		bodyModel[46].addShapeBox(0F, 0F, 0F, 2, 0, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 538
		bodyModel[46].setRotationPoint(-2.25F, 4.45F, 8.2F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 442
		bodyModel[47].setRotationPoint(0.5F, 3.75F, 8.96F);
		bodyModel[47].rotateAngleX = -0.78539816F;

		bodyModel[48].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 442
		bodyModel[48].setRotationPoint(-0.25F, 4.1F, 8.96F);
		bodyModel[48].rotateAngleX = -0.78539816F;

		bodyModel[49].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 442
		bodyModel[49].setRotationPoint(4.75F, 4.1F, 8.96F);
		bodyModel[49].rotateAngleX = -0.78539816F;

		bodyModel[50].addShapeBox(0F, 0F, 0F, 3, 0, 1, 0F,0F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 538
		bodyModel[50].setRotationPoint(2.5F, 4.45F, 8.2F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 1, 0, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.39F, -0.25F, 0F, -0.39F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.39F, -0.25F, 0F, -0.39F); // Box 537
		bodyModel[51].setRotationPoint(2.5F, 3.75F, 7.25F);
		bodyModel[51].rotateAngleX = -0.44942228F;

		bodyModel[52].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 79
		bodyModel[52].setRotationPoint(-8.25F, 3.75F, 6.75F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 79
		bodyModel[53].setRotationPoint(-5.75F, 3.75F, 6.75F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 79
		bodyModel[54].setRotationPoint(5.75F, 3.75F, 6.75F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.75F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F); // Box 79
		bodyModel[55].setRotationPoint(3.75F, 3.75F, 6.75F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 2
		bodyModel[56].setRotationPoint(-1F, 4.5F, -1F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, -0.5F, 0F, 0F, -0.5F); // Box 79
		bodyModel[57].setRotationPoint(-8.75F, 3.75F, 6.75F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F); // Box 79
		bodyModel[58].setRotationPoint(-9.75F, 3.75F, 6.75F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0.5F, -0.5F); // Box 79
		bodyModel[59].setRotationPoint(7.75F, 3.75F, 6.75F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 79
		bodyModel[60].setRotationPoint(8.75F, 3.75F, 6.75F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 79
		bodyModel[61].setRotationPoint(-9.25F, 3.75F, 4.25F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F); // Box 79
		bodyModel[62].setRotationPoint(-9.25F, 4.75F, 4.25F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 79
		bodyModel[63].setRotationPoint(-9.25F, 5.75F, -4.25F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 526
		bodyModel[64].setRotationPoint(-9.25F, 3.75F, -7.25F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 527
		bodyModel[65].setRotationPoint(-9.25F, 4.75F, -5.25F);

		bodyModel[66].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 2 wheel
		bodyModel[66].setRotationPoint(6.5F, 7F, 6F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 79
		bodyModel[67].setRotationPoint(8.75F, 3.75F, 4.25F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F); // Box 79
		bodyModel[68].setRotationPoint(8.75F, 4.75F, 4.25F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 79
		bodyModel[69].setRotationPoint(8.75F, 5.75F, -4.25F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 526
		bodyModel[70].setRotationPoint(8.75F, 3.75F, -7.25F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 527
		bodyModel[71].setRotationPoint(8.75F, 4.75F, -5.25F);

		bodyModel[72].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 72
		bodyModel[72].setRotationPoint(5.5F, 6F, -8.5F);

		bodyModel[73].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 73
		bodyModel[73].setRotationPoint(-7.5F, 6F, -8.5F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 17, 1, 2, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[74].setRotationPoint(-8.25F, 4.25F, -8.75F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 75
		bodyModel[75].setRotationPoint(-8.25F, 3.75F, -8.75F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 76
		bodyModel[76].setRotationPoint(-5.75F, 3.75F, -8.75F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 77
		bodyModel[77].setRotationPoint(5.75F, 3.75F, -8.75F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.75F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F); // Box 78
		bodyModel[78].setRotationPoint(3.75F, 3.75F, -8.75F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0.5F, -0.5F, -0.5F, 0.5F, 0F, 0F, 0F, 0F); // Box 79
		bodyModel[79].setRotationPoint(-8.75F, 3.75F, -8.75F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 80
		bodyModel[80].setRotationPoint(-9.75F, 3.75F, -8.75F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0.5F, 0F); // Box 81
		bodyModel[81].setRotationPoint(7.75F, 3.75F, -8.75F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -0.5F, -1F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 82
		bodyModel[82].setRotationPoint(8.75F, 3.75F, -8.75F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,-0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 83
		bodyModel[83].setRotationPoint(7.25F, 5.25F, -8.75F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.5F, -0.25F, 0F); // Box 84
		bodyModel[84].setRotationPoint(4.75F, 5.25F, -8.75F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,-0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 85
		bodyModel[85].setRotationPoint(-5.75F, 5.25F, -8.75F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.5F, -0.25F, 0F); // Box 86
		bodyModel[86].setRotationPoint(-8.25F, 5.25F, -8.75F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 87
		bodyModel[87].setRotationPoint(5.5F, 5.5F, -8F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 88
		bodyModel[88].setRotationPoint(-7F, 5.5F, -8F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 89
		bodyModel[89].setRotationPoint(-4F, 7.75F, -8F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 90
		bodyModel[90].setRotationPoint(4F, 7.75F, -8F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 91
		bodyModel[91].setRotationPoint(3.75F, 7.25F, -8F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.55F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.55F, 0F, 0F, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 92
		bodyModel[92].setRotationPoint(4.25F, 5.5F, -8F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 93
		bodyModel[93].setRotationPoint(-5F, 7.75F, -8F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 94
		bodyModel[94].setRotationPoint(-5F, 7.25F, -8F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.25F, 0F, 0F, -0.55F, 0F, 0F, -0.55F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 95
		bodyModel[95].setRotationPoint(-5.25F, 5.5F, -8F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 1, 7, 2, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -4.5F, -0.5F, 0F, -4.5F, -0.5F, 0F, -4.5F, 0F, 0F, -4.5F, 0F); // Box 96
		bodyModel[96].setRotationPoint(-3.75F, 4.75F, -8.75F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 1, 7, 2, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -4.5F, -0.5F, 0F, -4.5F, -0.5F, 0F, -4.5F, 0F, 0F, -4.5F, 0F); // Box 97
		bodyModel[97].setRotationPoint(2.75F, 4.75F, -8.75F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 98
		bodyModel[98].setRotationPoint(1.5F, 7.25F, -8.75F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 99
		bodyModel[99].setRotationPoint(-3.75F, 7.25F, -8.75F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 1, 7, 2, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -4.5F, -0.5F, 0F, -4.5F, -0.5F, 0F, -4.5F, 0F, 0F, -4.5F, 0F); // Box 100
		bodyModel[100].setRotationPoint(1.5F, 4.75F, -8.75F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 1, 7, 2, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -4.5F, -0.5F, 0F, -4.5F, -0.5F, 0F, -4.5F, 0F, 0F, -4.5F, 0F); // Box 101
		bodyModel[101].setRotationPoint(-2.5F, 4.75F, -8.75F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5.5F, 0F, 0F, -5.5F, 0F, 0F, -5.5F, 0F, 0F, -5.5F, 0F); // Box 103
		bodyModel[102].setRotationPoint(0.149999999999999F, 5.75F, -7.75F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5.5F, 0F, 0F, -5.5F, 0F, 0F, -5.5F, 0F, 0F, -5.5F, 0F); // Box 104
		bodyModel[103].setRotationPoint(-1.15F, 5.75F, -7.75F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 105
		bodyModel[104].setRotationPoint(-1.5F, 7.25F, -7.75F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 106
		bodyModel[105].setRotationPoint(-0.25F, 5.25F, -9.25F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 107
		bodyModel[106].setRotationPoint(-5.2F, 5.25F, -9.25F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 108
		bodyModel[107].setRotationPoint(-0.25F, 4.5F, -9F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 109
		bodyModel[108].setRotationPoint(-4.95F, 5.25F, -8.75F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.01F, -0.5F, 0F, 0.01F, -0.5F, 0F, 0.01F, 0F, 0F, 0.01F, 0F); // Box 110
		bodyModel[109].setRotationPoint(-0.5F, 6.5F, -9.25F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.01F, -0.5F, 0F, 0.01F, -0.5F, 0F, 0.01F, 0F, 0F, 0.01F, 0F); // Box 111
		bodyModel[110].setRotationPoint(0.5F, 6.5F, -9.25F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 1, 0, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.01F, -0.5F, 0F, 0.01F, -0.5F, 0F, 0.01F, 0F, 0F, 0.01F, 0F); // Box 112
		bodyModel[111].setRotationPoint(-0.5F, 7.51F, -9.25F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 113
		bodyModel[112].setRotationPoint(-0.5F, 5.25F, -8.75F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 114
		bodyModel[113].setRotationPoint(0.5F, 5.25F, -8.75F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.56F, 0F, 0F, -0.56F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.56F, 0F, 0F, -0.56F, 0F, 0F, 0F, 0F, 0F); // Box 115
		bodyModel[114].setRotationPoint(-0.950000000000003F, 5.25F, -9.25F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 2, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 117
		bodyModel[115].setRotationPoint(-2.25F, 4.45F, -9.2F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 3, 0, 1, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 121
		bodyModel[116].setRotationPoint(2.5F, 4.45F, -9.2F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 1, 0, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.39F, -0.25F, 0F, -0.39F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.39F, -0.25F, 0F, -0.39F); // Box 537
		bodyModel[117].setRotationPoint(-2.5F, 3.75F, -7.25F);
		bodyModel[117].rotateAngleX = -2.69217037F;

		bodyModel[118].addShapeBox(0F, 0F, 0F, 1, 0, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.39F, -0.25F, 0F, -0.39F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.39F, -0.25F, 0F, -0.39F); // Box 537
		bodyModel[118].setRotationPoint(2.5F, 3.75F, -7.25F);
		bodyModel[118].rotateAngleX = -2.69217037F;

		bodyModel[119].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 442
		bodyModel[119].setRotationPoint(0.5F, 3.75F, -8.95F);
		bodyModel[119].rotateAngleX = -0.78539816F;

		bodyModel[120].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 442
		bodyModel[120].setRotationPoint(-0.25F, 4.1F, -8.95F);
		bodyModel[120].rotateAngleX = -0.78539816F;

		bodyModel[121].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 442
		bodyModel[121].setRotationPoint(4.75F, 4.1F, -8.95F);
		bodyModel[121].rotateAngleX = -0.78539816F;
	}
}