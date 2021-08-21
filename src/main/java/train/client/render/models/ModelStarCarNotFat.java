//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2021 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 18.01.2019 - 17:00:48
// Last changed on: 18.01.2019 - 17:00:48

package train.client.render.models; //Path where the model is located

import tmt.ModelConverter;
import tmt.ModelRendererTurbo;

public class ModelStarCarNotFat extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelStarCarNotFat() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[122];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 5
		bodyModel[1] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 16
		bodyModel[2] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 17
		bodyModel[3] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 21
		bodyModel[4] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 393
		bodyModel[5] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 394
		bodyModel[6] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 395
		bodyModel[7] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 7
		bodyModel[8] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 8
		bodyModel[9] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 9
		bodyModel[10] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 10
		bodyModel[11] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 21
		bodyModel[12] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 23
		bodyModel[13] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 25
		bodyModel[14] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 26
		bodyModel[15] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 28
		bodyModel[16] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 29
		bodyModel[17] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 30
		bodyModel[18] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 32
		bodyModel[19] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 33
		bodyModel[20] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 34
		bodyModel[21] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 35
		bodyModel[22] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 36
		bodyModel[23] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 37
		bodyModel[24] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 38
		bodyModel[25] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 39
		bodyModel[26] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 40
		bodyModel[27] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 41
		bodyModel[28] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 42
		bodyModel[29] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 43
		bodyModel[30] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 44
		bodyModel[31] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 45
		bodyModel[32] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 48
		bodyModel[33] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 53
		bodyModel[34] = new ModelRendererTurbo(this, 9, 9, textureX, textureY); // Box 54
		bodyModel[35] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 55
		bodyModel[36] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 56
		bodyModel[37] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 57
		bodyModel[38] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Box 59
		bodyModel[39] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 60
		bodyModel[40] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Box 61
		bodyModel[41] = new ModelRendererTurbo(this, 65, 9, textureX, textureY); // Box 62
		bodyModel[42] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 63
		bodyModel[43] = new ModelRendererTurbo(this, 9, 17, textureX, textureY); // Box 64
		bodyModel[44] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 65
		bodyModel[45] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 68
		bodyModel[46] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Box 69
		bodyModel[47] = new ModelRendererTurbo(this, 41, 17, textureX, textureY); // Box 70
		bodyModel[48] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 71
		bodyModel[49] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Box 72
		bodyModel[50] = new ModelRendererTurbo(this, 377, 17, textureX, textureY); // Box 73
		bodyModel[51] = new ModelRendererTurbo(this, 65, 17, textureX, textureY); // Box 74
		bodyModel[52] = new ModelRendererTurbo(this, 161, 17, textureX, textureY); // Box 75
		bodyModel[53] = new ModelRendererTurbo(this, 385, 17, textureX, textureY); // Box 78
		bodyModel[54] = new ModelRendererTurbo(this, 169, 17, textureX, textureY); // Box 79
		bodyModel[55] = new ModelRendererTurbo(this, 177, 17, textureX, textureY); // Box 80
		bodyModel[56] = new ModelRendererTurbo(this, 393, 17, textureX, textureY); // Box 81
		bodyModel[57] = new ModelRendererTurbo(this, 185, 17, textureX, textureY); // Box 82
		bodyModel[58] = new ModelRendererTurbo(this, 193, 17, textureX, textureY); // Box 83
		bodyModel[59] = new ModelRendererTurbo(this, 201, 17, textureX, textureY); // Box 86
		bodyModel[60] = new ModelRendererTurbo(this, 217, 17, textureX, textureY); // Box 87
		bodyModel[61] = new ModelRendererTurbo(this, 401, 17, textureX, textureY); // Box 88
		bodyModel[62] = new ModelRendererTurbo(this, 329, 17, textureX, textureY); // Box 89
		bodyModel[63] = new ModelRendererTurbo(this, 225, 17, textureX, textureY); // Box 90
		bodyModel[64] = new ModelRendererTurbo(this, 233, 17, textureX, textureY); // Box 91
		bodyModel[65] = new ModelRendererTurbo(this, 241, 17, textureX, textureY); // Box 92
		bodyModel[66] = new ModelRendererTurbo(this, 417, 17, textureX, textureY); // Box 93
		bodyModel[67] = new ModelRendererTurbo(this, 361, 17, textureX, textureY); // Box 94
		bodyModel[68] = new ModelRendererTurbo(this, 433, 17, textureX, textureY); // Box 95
		bodyModel[69] = new ModelRendererTurbo(this, 457, 17, textureX, textureY); // Box 96
		bodyModel[70] = new ModelRendererTurbo(this, 481, 17, textureX, textureY); // Box 97
		bodyModel[71] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 98
		bodyModel[72] = new ModelRendererTurbo(this, 177, 25, textureX, textureY); // Box 99
		bodyModel[73] = new ModelRendererTurbo(this, 201, 25, textureX, textureY); // Box 100
		bodyModel[74] = new ModelRendererTurbo(this, 329, 25, textureX, textureY); // Box 101
		bodyModel[75] = new ModelRendererTurbo(this, 353, 25, textureX, textureY); // Box 102
		bodyModel[76] = new ModelRendererTurbo(this, 401, 25, textureX, textureY); // Box 103
		bodyModel[77] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Box 104
		bodyModel[78] = new ModelRendererTurbo(this, 33, 33, textureX, textureY); // Box 105
		bodyModel[79] = new ModelRendererTurbo(this, 81, 33, textureX, textureY); // Box 106
		bodyModel[80] = new ModelRendererTurbo(this, 257, 17, textureX, textureY); // Box 107
		bodyModel[81] = new ModelRendererTurbo(this, 305, 17, textureX, textureY); // Box 108
		bodyModel[82] = new ModelRendererTurbo(this, 65, 33, textureX, textureY); // Box 109
		bodyModel[83] = new ModelRendererTurbo(this, 113, 33, textureX, textureY); // Box 110
		bodyModel[84] = new ModelRendererTurbo(this, 145, 33, textureX, textureY); // Box 111
		bodyModel[85] = new ModelRendererTurbo(this, 425, 33, textureX, textureY); // Box 112
		bodyModel[86] = new ModelRendererTurbo(this, 505, 17, textureX, textureY); // Box 114
		bodyModel[87] = new ModelRendererTurbo(this, 225, 25, textureX, textureY); // Box 115
		bodyModel[88] = new ModelRendererTurbo(this, 49, 33, textureX, textureY); // Box 116
		bodyModel[89] = new ModelRendererTurbo(this, 97, 33, textureX, textureY); // Box 117
		bodyModel[90] = new ModelRendererTurbo(this, 169, 33, textureX, textureY); // Box 118
		bodyModel[91] = new ModelRendererTurbo(this, 121, 33, textureX, textureY); // Box 48
		bodyModel[92] = new ModelRendererTurbo(this, 377, 33, textureX, textureY); // Box 101
		bodyModel[93] = new ModelRendererTurbo(this, 345, 17, textureX, textureY); // Box 102
		bodyModel[94] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 103
		bodyModel[95] = new ModelRendererTurbo(this, 41, 25, textureX, textureY); // Box 104
		bodyModel[96] = new ModelRendererTurbo(this, 369, 33, textureX, textureY); // Box 105
		bodyModel[97] = new ModelRendererTurbo(this, 433, 33, textureX, textureY); // Box 106
		bodyModel[98] = new ModelRendererTurbo(this, 457, 33, textureX, textureY); // Box 107
		bodyModel[99] = new ModelRendererTurbo(this, 473, 33, textureX, textureY); // Box 108
		bodyModel[100] = new ModelRendererTurbo(this, 489, 33, textureX, textureY); // Box 109
		bodyModel[101] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 110
		bodyModel[102] = new ModelRendererTurbo(this, 65, 41, textureX, textureY); // Box 111
		bodyModel[103] = new ModelRendererTurbo(this, 81, 41, textureX, textureY); // Box 112
		bodyModel[104] = new ModelRendererTurbo(this, 289, 17, textureX, textureY); // Box 113
		bodyModel[105] = new ModelRendererTurbo(this, 425, 25, textureX, textureY); // Box 114
		bodyModel[106] = new ModelRendererTurbo(this, 393, 33, textureX, textureY); // Box 115
		bodyModel[107] = new ModelRendererTurbo(this, 113, 41, textureX, textureY); // Box 116
		bodyModel[108] = new ModelRendererTurbo(this, 505, 33, textureX, textureY); // Box 117
		bodyModel[109] = new ModelRendererTurbo(this, 145, 41, textureX, textureY); // Box 118
		bodyModel[110] = new ModelRendererTurbo(this, 177, 41, textureX, textureY); // Box 119
		bodyModel[111] = new ModelRendererTurbo(this, 17, 41, textureX, textureY); // Box 120
		bodyModel[112] = new ModelRendererTurbo(this, 193, 41, textureX, textureY); // Box 121
		bodyModel[113] = new ModelRendererTurbo(this, 209, 41, textureX, textureY); // Box 122
		bodyModel[114] = new ModelRendererTurbo(this, 129, 41, textureX, textureY); // Box 123
		bodyModel[115] = new ModelRendererTurbo(this, 225, 41, textureX, textureY); // Box 124
		bodyModel[116] = new ModelRendererTurbo(this, 241, 41, textureX, textureY); // Box 9
		bodyModel[117] = new ModelRendererTurbo(this, 257, 41, textureX, textureY); // Box 39
		bodyModel[118] = new ModelRendererTurbo(this, 273, 41, textureX, textureY); // Box 124
		bodyModel[119] = new ModelRendererTurbo(this, 289, 41, textureX, textureY); // Box 125
		bodyModel[120] = new ModelRendererTurbo(this, 305, 41, textureX, textureY); // Box 126
		bodyModel[121] = new ModelRendererTurbo(this, 321, 41, textureX, textureY); // Box 127

		bodyModel[0].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 5
		bodyModel[0].setRotationPoint(-25F, 0F, -9F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 16
		bodyModel[1].setRotationPoint(-25F, 0F, 6F);

		bodyModel[2].addShapeBox(0F, -1F, -1F, 3, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 17
		bodyModel[2].setRotationPoint(-24F, 1.5F, 7.5F);
		bodyModel[2].rotateAngleX = 0.78539816F;

		bodyModel[3].addShapeBox(0F, -1F, -1F, 3, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 21
		bodyModel[3].setRotationPoint(-24F, 1.5F, -7.5F);
		bodyModel[3].rotateAngleX = 0.78539816F;

		bodyModel[4].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,1F, 0F, 0F, 1.25F, 0F, 0F, 1.25F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 393
		bodyModel[4].setRotationPoint(-23F, 2F, -0.5F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 394
		bodyModel[5].setRotationPoint(-24F, 1F, -0.5F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 1.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1.25F, 0F, 0F); // Box 395
		bodyModel[6].setRotationPoint(-21F, 1F, -0.5F);

		bodyModel[7].addBox(0F, -1F, -1F, 42, 2, 22, 0F); // Box 7
		bodyModel[7].setRotationPoint(-21F, 1.5F, -10F);

		bodyModel[8].addBox(0F, -1F, -1F, 1, 1, 22, 0F); // Box 8
		bodyModel[8].setRotationPoint(-21F, 0.5F, -10F);

		bodyModel[9].addBox(0F, -1F, -1F, 1, 12, 1, 0F); // Box 9
		bodyModel[9].setRotationPoint(-21F, -11.5F, -10F);

		bodyModel[10].addBox(0F, -1F, -1F, 1, 12, 1, 0F); // Box 10
		bodyModel[10].setRotationPoint(-21F, -11.5F, 11F);

		bodyModel[11].addBox(0F, -1F, -1F, 1, 13, 20, 0F); // Box 21
		bodyModel[11].setRotationPoint(-20F, -11.5F, -9F);

		bodyModel[12].addBox(0F, -1F, -1F, 1, 12, 1, 0F); // Box 23
		bodyModel[12].setRotationPoint(20F, -11.5F, -10F);

		bodyModel[13].addBox(0F, -1F, -1F, 1, 13, 20, 0F); // Box 25
		bodyModel[13].setRotationPoint(19F, -11.5F, -9F);

		bodyModel[14].addBox(0F, -1F, -1F, 1, 1, 22, 0F); // Box 26
		bodyModel[14].setRotationPoint(20F, 0.5F, -10F);

		bodyModel[15].addShapeBox(0F, -1F, -1F, 1, 12, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 28
		bodyModel[15].setRotationPoint(20F, -11.5F, 5.5F);

		bodyModel[16].addBox(0F, -1F, -1F, 1, 12, 1, 0F); // Box 29
		bodyModel[16].setRotationPoint(20F, -11.5F, 11F);

		bodyModel[17].addBox(0F, -1F, -1F, 10, 12, 1, 0F); // Box 30
		bodyModel[17].setRotationPoint(-19F, -10.5F, -9F);

		bodyModel[18].addBox(0F, -1F, -1F, 10, 12, 1, 0F); // Box 32
		bodyModel[18].setRotationPoint(9F, -10.5F, -9F);

		bodyModel[19].addBox(0F, -1F, -1F, 4, 12, 1, 0F); // Box 33
		bodyModel[19].setRotationPoint(5F, -10.5F, -9F);

		bodyModel[20].addBox(-4F, -1F, -1F, 4, 12, 1, 0F); // Box 34
		bodyModel[20].setRotationPoint(-5F, -10.5F, -9F);

		bodyModel[21].addBox(0F, -1F, -1F, 10, 12, 1, 0F); // Box 35
		bodyModel[21].setRotationPoint(-5F, -10.5F, -9F);

		bodyModel[22].addBox(-4F, -1F, -1F, 4, 12, 1, 0F); // Box 36
		bodyModel[22].setRotationPoint(-5F, -10.5F, 10F);

		bodyModel[23].addBox(0F, -1F, -1F, 10, 12, 1, 0F); // Box 37
		bodyModel[23].setRotationPoint(-19F, -10.5F, 10F);

		bodyModel[24].addBox(0F, -1F, -1F, 10, 12, 1, 0F); // Box 38
		bodyModel[24].setRotationPoint(-5F, -10.5F, 10F);

		bodyModel[25].addBox(0F, -1F, -1F, 4, 12, 1, 0F); // Box 39
		bodyModel[25].setRotationPoint(5F, -10.5F, 10F);

		bodyModel[26].addBox(0F, -1F, -1F, 10, 12, 1, 0F); // Box 40
		bodyModel[26].setRotationPoint(9F, -10.5F, 10F);

		bodyModel[27].addBox(0F, -1F, -1F, 1, 13, 1, 0F); // Box 41
		bodyModel[27].setRotationPoint(-10F, -11.5F, -10F);

		bodyModel[28].addBox(0F, -1F, -1F, 1, 13, 1, 0F); // Box 42
		bodyModel[28].setRotationPoint(-5F, -11.5F, -10F);

		bodyModel[29].addBox(0F, -1F, -1F, 1, 13, 1, 0F); // Box 43
		bodyModel[29].setRotationPoint(4F, -11.5F, -10F);

		bodyModel[30].addBox(0F, -1F, -1F, 1, 13, 1, 0F); // Box 44
		bodyModel[30].setRotationPoint(9F, -11.5F, -10F);

		bodyModel[31].addShapeBox(0F, -1F, -1F, 10, 12, 1, 0F,0F, 0F, -0.5F, 0F, -11F, -0.5F, 0F, -11F, 0F, 0F, 0F, 0F, 0F, -11F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -11F, 0F); // Box 45
		bodyModel[31].setRotationPoint(10F, -10.5F, -10F);

		bodyModel[32].addShapeBox(0F, -1F, -1F, 10, 12, 1, 0F,0F, -11F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -11F, 0F, 0F, 0F, -0.5F, 0F, -11F, -0.5F, 0F, -11F, 0F, 0F, 0F, 0F); // Box 48
		bodyModel[32].setRotationPoint(-20F, -10.5F, -9.99F);

		bodyModel[33].addShapeBox(0F, -1F, -1F, 1, 3, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 53
		bodyModel[33].setRotationPoint(-10F, -1.5F, -11F);

		bodyModel[34].addShapeBox(0F, -1F, -1F, 1, 3, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 54
		bodyModel[34].setRotationPoint(-5F, -1.5F, -11F);

		bodyModel[35].addShapeBox(0F, -1F, -1F, 1, 3, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 55
		bodyModel[35].setRotationPoint(4F, -1.5F, -11F);

		bodyModel[36].addShapeBox(0F, -1F, -1F, 1, 3, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 56
		bodyModel[36].setRotationPoint(9F, -1.5F, -11F);

		bodyModel[37].addShapeBox(0F, -1F, -1F, 1, 3, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 57
		bodyModel[37].setRotationPoint(20F, -1.5F, -11F);

		bodyModel[38].addShapeBox(0F, -1F, -1F, 1, 3, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 59
		bodyModel[38].setRotationPoint(-21F, -1.5F, -11F);

		bodyModel[39].addBox(0F, -1F, -1F, 1, 1, 1, 0F); // Box 60
		bodyModel[39].setRotationPoint(-21F, 1.5F, -11F);

		bodyModel[40].addBox(0F, -1F, -1F, 1, 1, 1, 0F); // Box 61
		bodyModel[40].setRotationPoint(-10F, 1.5F, -11F);

		bodyModel[41].addBox(0F, -1F, -1F, 1, 1, 1, 0F); // Box 62
		bodyModel[41].setRotationPoint(-5F, 1.5F, -11F);

		bodyModel[42].addBox(0F, -1F, -1F, 1, 1, 1, 0F); // Box 63
		bodyModel[42].setRotationPoint(4F, 1.5F, -11F);

		bodyModel[43].addBox(0F, -1F, -1F, 1, 1, 1, 0F); // Box 64
		bodyModel[43].setRotationPoint(9F, 1.5F, -11F);

		bodyModel[44].addBox(0F, -1F, -1F, 1, 1, 1, 0F); // Box 65
		bodyModel[44].setRotationPoint(20F, 1.5F, -11F);

		bodyModel[45].addBox(0F, -1F, -1F, 1, 13, 1, 0F); // Box 68
		bodyModel[45].setRotationPoint(9F, -11.5F, 11F);

		bodyModel[46].addShapeBox(0F, -1F, -1F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 69
		bodyModel[46].setRotationPoint(9F, -1.5F, 12F);

		bodyModel[47].addBox(0F, -1F, -1F, 1, 1, 1, 0F); // Box 70
		bodyModel[47].setRotationPoint(9F, 1.5F, 12F);

		bodyModel[48].addShapeBox(0F, -1F, -1F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 71
		bodyModel[48].setRotationPoint(20F, -1.5F, 12F);

		bodyModel[49].addBox(0F, -1F, -1F, 1, 1, 1, 0F); // Box 72
		bodyModel[49].setRotationPoint(20F, 1.5F, 12F);

		bodyModel[50].addBox(0F, -1F, -1F, 1, 13, 1, 0F); // Box 73
		bodyModel[50].setRotationPoint(4F, -11.5F, 11F);

		bodyModel[51].addShapeBox(0F, -1F, -1F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[51].setRotationPoint(4F, -1.5F, 12F);

		bodyModel[52].addBox(0F, -1F, -1F, 1, 1, 1, 0F); // Box 75
		bodyModel[52].setRotationPoint(4F, 1.5F, 12F);

		bodyModel[53].addBox(0F, -1F, -1F, 1, 13, 1, 0F); // Box 78
		bodyModel[53].setRotationPoint(-5F, -11.5F, 11F);

		bodyModel[54].addShapeBox(0F, -1F, -1F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 79
		bodyModel[54].setRotationPoint(-5F, -1.5F, 12F);

		bodyModel[55].addBox(0F, -1F, -1F, 1, 1, 1, 0F); // Box 80
		bodyModel[55].setRotationPoint(-5F, 1.5F, 12F);

		bodyModel[56].addBox(0F, -1F, -1F, 1, 13, 1, 0F); // Box 81
		bodyModel[56].setRotationPoint(-10F, -11.5F, 11F);

		bodyModel[57].addShapeBox(0F, -1F, -1F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 82
		bodyModel[57].setRotationPoint(-10F, -1.5F, 12F);

		bodyModel[58].addBox(0F, -1F, -1F, 1, 1, 1, 0F); // Box 83
		bodyModel[58].setRotationPoint(-10F, 1.5F, 12F);

		bodyModel[59].addShapeBox(0F, -1F, -1F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 86
		bodyModel[59].setRotationPoint(-21F, -1.5F, 12F);

		bodyModel[60].addBox(0F, -1F, -1F, 1, 1, 1, 0F); // Box 87
		bodyModel[60].setRotationPoint(-21F, 1.5F, 12F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 88
		bodyModel[61].setRotationPoint(24F, 0F, -9F);

		bodyModel[62].addShapeBox(0F, -1F, -1F, 3, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 89
		bodyModel[62].setRotationPoint(21F, 1.5F, -7.5F);
		bodyModel[62].rotateAngleX = 0.78539816F;

		bodyModel[63].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 90
		bodyModel[63].setRotationPoint(23F, 1F, -0.5F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,1.25F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 91
		bodyModel[64].setRotationPoint(22F, 2F, -0.5F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1.25F, 0F, 0F, 1.25F, 0F, 0F, -1F, 0F, 0F); // Box 92
		bodyModel[65].setRotationPoint(19.75F, 1F, -0.5F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 93
		bodyModel[66].setRotationPoint(24F, 0F, 6F);

		bodyModel[67].addShapeBox(0F, -1F, -1F, 3, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 94
		bodyModel[67].setRotationPoint(21F, 1.5F, 7.5F);
		bodyModel[67].rotateAngleX = 0.78539816F;

		bodyModel[68].addShapeBox(0F, -1F, -1F, 10, 12, 1, 0F,0F, 0F, -0.5F, 0F, -11F, -0.5F, 0F, -11F, 0F, 0F, 0F, 0F, 0F, -11F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -11F, 0F); // Box 95
		bodyModel[68].setRotationPoint(-20F, -10.5F, -10F);

		bodyModel[69].addShapeBox(0F, -1F, -1F, 10, 12, 1, 0F,0F, -11F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -11F, 0F, 0F, 0F, -0.5F, 0F, -11F, -0.5F, 0F, -11F, 0F, 0F, 0F, 0F); // Box 96
		bodyModel[69].setRotationPoint(10F, -10.5F, -9.99F);

		bodyModel[70].addShapeBox(0F, -1F, -1F, 8, 12, 1, 0F,0F, -11F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -11F, 0F, 0F, 0F, -0.5F, 0F, -11F, -0.5F, 0F, -11F, 0F, 0F, 0F, 0F); // Box 97
		bodyModel[70].setRotationPoint(-4F, -10.5F, -9.99F);

		bodyModel[71].addShapeBox(0F, -1F, -1F, 8, 12, 1, 0F,0F, 0F, -0.5F, 0F, -11F, -0.5F, 0F, -11F, 0F, 0F, 0F, 0F, 0F, -11F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -11F, 0F); // Box 98
		bodyModel[71].setRotationPoint(-4F, -10.5F, -10F);

		bodyModel[72].addShapeBox(0F, -1F, -1F, 10, 12, 1, 0F,0F, -11F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -11F, -0.5F, 0F, 0F, 0F, 0F, -11F, 0F, 0F, -11F, -0.5F, 0F, 0F, -0.5F); // Box 99
		bodyModel[72].setRotationPoint(-20F, -10.5F, 11.01F);

		bodyModel[73].addShapeBox(0F, -1F, -1F, 10, 12, 1, 0F,0F, 0F, 0F, 0F, -11F, 0F, 0F, -11F, -0.5F, 0F, 0F, -0.5F, 0F, -11F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -11F, -0.5F); // Box 100
		bodyModel[73].setRotationPoint(-20F, -10.5F, 11F);

		bodyModel[74].addShapeBox(0F, -1F, -1F, 8, 12, 1, 0F,0F, 0F, 0F, 0F, -11F, 0F, 0F, -11F, -0.5F, 0F, 0F, -0.5F, 0F, -11F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -11F, -0.5F); // Box 101
		bodyModel[74].setRotationPoint(-4F, -10.5F, 11F);

		bodyModel[75].addShapeBox(0F, -1F, -1F, 8, 12, 1, 0F,0F, -11F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -11F, -0.5F, 0F, 0F, 0F, 0F, -11F, 0F, 0F, -11F, -0.5F, 0F, 0F, -0.5F); // Box 102
		bodyModel[75].setRotationPoint(-4F, -10.5F, 11.01F);

		bodyModel[76].addShapeBox(0F, -1F, -1F, 10, 12, 1, 0F,0F, -11F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -11F, -0.5F, 0F, 0F, 0F, 0F, -11F, 0F, 0F, -11F, -0.5F, 0F, 0F, -0.5F); // Box 103
		bodyModel[76].setRotationPoint(10F, -10.5F, 11.01F);

		bodyModel[77].addShapeBox(0F, -1F, -1F, 10, 12, 1, 0F,0F, 0F, 0F, 0F, -11F, 0F, 0F, -11F, -0.5F, 0F, 0F, -0.5F, 0F, -11F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -11F, -0.5F); // Box 104
		bodyModel[77].setRotationPoint(10F, -10.5F, 11F);

		bodyModel[78].addBox(0F, -1F, -1F, 1, 1, 22, 0F); // Box 105
		bodyModel[78].setRotationPoint(-21F, -12.5F, -10F);

		bodyModel[79].addBox(0F, -1F, -1F, 1, 1, 22, 0F); // Box 106
		bodyModel[79].setRotationPoint(20F, -12.5F, -10F);

		bodyModel[80].addBox(0F, -1F, -1F, 11, 1, 1, 0F); // Box 107
		bodyModel[80].setRotationPoint(-20F, -12.5F, -10F);

		bodyModel[81].addBox(0F, -1F, -1F, 10, 1, 1, 0F); // Box 108
		bodyModel[81].setRotationPoint(-5F, -12.5F, -10F);

		bodyModel[82].addBox(0F, -1F, -1F, 11, 1, 1, 0F); // Box 109
		bodyModel[82].setRotationPoint(9F, -12.5F, -10F);

		bodyModel[83].addBox(0F, -1F, -1F, 11, 1, 1, 0F); // Box 110
		bodyModel[83].setRotationPoint(9F, -12.5F, 11F);

		bodyModel[84].addBox(0F, -1F, -1F, 10, 1, 1, 0F); // Box 111
		bodyModel[84].setRotationPoint(-5F, -12.5F, 11F);

		bodyModel[85].addBox(0F, -1F, -1F, 11, 1, 1, 0F); // Box 112
		bodyModel[85].setRotationPoint(-20F, -12.5F, 11F);

		bodyModel[86].addShapeBox(0F, -1F, -1F, 1, 12, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 114
		bodyModel[86].setRotationPoint(20F, -11.5F, 0.5F);

		bodyModel[87].addShapeBox(0F, -1F, -1F, 1, 12, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 115
		bodyModel[87].setRotationPoint(20F, -11.5F, -4.5F);

		bodyModel[88].addShapeBox(0F, -1F, -1F, 1, 12, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 116
		bodyModel[88].setRotationPoint(-21F, -11.5F, -4.5F);

		bodyModel[89].addShapeBox(0F, -1F, -1F, 1, 12, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 117
		bodyModel[89].setRotationPoint(-21F, -11.5F, 0.5F);

		bodyModel[90].addShapeBox(0F, -1F, -1F, 1, 12, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 118
		bodyModel[90].setRotationPoint(-21F, -11.5F, 5.5F);

		bodyModel[91].addBox(-0.5F, -0.5F, 0F, 1, 1, 18, 0F); // Box 48
		bodyModel[91].setRotationPoint(14F, 6F, -9F);

		bodyModel[92].addShapeBox(0F, -1F, -1F, 1, 12, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 101
		bodyModel[92].setRotationPoint(-21F, -11.5F, 0.5F);

		bodyModel[93].addBox(0F, -1F, -1F, 1, 3, 1, 0F); // Box 102
		bodyModel[93].setRotationPoint(-13.5F, 3.5F, 0.5F);

		bodyModel[94].addBox(0F, -1F, -1F, 1, 3, 1, 0F); // Box 103
		bodyModel[94].setRotationPoint(-0.5F, 3.5F, 0.5F);

		bodyModel[95].addBox(0F, -1F, -1F, 1, 3, 1, 0F); // Box 104
		bodyModel[95].setRotationPoint(13.5F, 3.5F, 0.5F);

		bodyModel[96].addBox(-0.5F, -0.5F, 0F, 1, 1, 18, 0F); // Box 105
		bodyModel[96].setRotationPoint(0F, 6F, -9F);

		bodyModel[97].addBox(-0.5F, -0.5F, 0F, 1, 1, 18, 0F); // Box 106
		bodyModel[97].setRotationPoint(-13F, 6F, -9F);

		bodyModel[98].addShapeBox(-0.5F, -0.5F, 0F, 5, 4, 1, 0F,0F, -3F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 107
		bodyModel[98].setRotationPoint(15F, 3F, -9F);

		bodyModel[99].addShapeBox(-0.5F, -0.5F, 0F, 5, 4, 1, 0F,0F, -3F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 108
		bodyModel[99].setRotationPoint(1F, 3F, -9F);

		bodyModel[100].addShapeBox(-0.5F, -0.5F, 0F, 5, 4, 1, 0F,0F, -3F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 109
		bodyModel[100].setRotationPoint(-12F, 3F, -9F);

		bodyModel[101].addShapeBox(-0.5F, -0.5F, 0F, 5, 4, 1, 0F,-1F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -1F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F); // Box 110
		bodyModel[101].setRotationPoint(-18F, 3F, -9F);

		bodyModel[102].addShapeBox(-0.5F, -0.5F, 0F, 5, 4, 1, 0F,-1F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -1F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F); // Box 111
		bodyModel[102].setRotationPoint(-5F, 3F, -9F);

		bodyModel[103].addShapeBox(-0.5F, -0.5F, 0F, 5, 4, 1, 0F,-1F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -1F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F); // Box 112
		bodyModel[103].setRotationPoint(9F, 3F, -9F);

		bodyModel[104].addBox(-0.5F, -0.5F, 0F, 1, 2, 1, 0F); // Box 113
		bodyModel[104].setRotationPoint(14F, 4F, -9F);

		bodyModel[105].addBox(-0.5F, -0.5F, 0F, 1, 2, 1, 0F); // Box 114
		bodyModel[105].setRotationPoint(0F, 4F, -9F);

		bodyModel[106].addBox(-0.5F, -0.5F, 0F, 1, 2, 1, 0F); // Box 115
		bodyModel[106].setRotationPoint(-13F, 4F, -9F);

		bodyModel[107].addShapeBox(-0.5F, -0.5F, 0F, 5, 4, 1, 0F,-1F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -1F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F); // Box 116
		bodyModel[107].setRotationPoint(-18F, 3F, 8F);

		bodyModel[108].addBox(-0.5F, -0.5F, 0F, 1, 2, 1, 0F); // Box 117
		bodyModel[108].setRotationPoint(-13F, 4F, 8F);

		bodyModel[109].addShapeBox(-0.5F, -0.5F, 0F, 5, 4, 1, 0F,0F, -3F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 118
		bodyModel[109].setRotationPoint(-12F, 3F, 8F);

		bodyModel[110].addShapeBox(-0.5F, -0.5F, 0F, 5, 4, 1, 0F,-1F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -1F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F); // Box 119
		bodyModel[110].setRotationPoint(-5F, 3F, 8F);

		bodyModel[111].addBox(-0.5F, -0.5F, 0F, 1, 2, 1, 0F); // Box 120
		bodyModel[111].setRotationPoint(0F, 4F, 8F);

		bodyModel[112].addShapeBox(-0.5F, -0.5F, 0F, 5, 4, 1, 0F,0F, -3F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 121
		bodyModel[112].setRotationPoint(1F, 3F, 8F);

		bodyModel[113].addShapeBox(-0.5F, -0.5F, 0F, 5, 4, 1, 0F,-1F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -1F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F); // Box 122
		bodyModel[113].setRotationPoint(9F, 3F, 8F);

		bodyModel[114].addBox(-0.5F, -0.5F, 0F, 1, 2, 1, 0F); // Box 123
		bodyModel[114].setRotationPoint(14F, 4F, 8F);

		bodyModel[115].addShapeBox(-0.5F, -0.5F, 0F, 5, 4, 1, 0F,0F, -3F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 124
		bodyModel[115].setRotationPoint(15F, 3F, 8F);

		bodyModel[116].addBox(-3.5F, -3.5F, 0F, 7, 7, 0, 0F); // Box 9
		bodyModel[116].setRotationPoint(14F, 6F, 6F);

		bodyModel[117].addBox(-3.5F, -3.5F, 0F, 7, 7, 0, 0F); // Box 39
		bodyModel[117].setRotationPoint(14F, 6F, -6F);

		bodyModel[118].addBox(-3.5F, -3.5F, 0F, 7, 7, 0, 0F); // Box 124
		bodyModel[118].setRotationPoint(0F, 6F, -6F);

		bodyModel[119].addBox(-3.5F, -3.5F, 0F, 7, 7, 0, 0F); // Box 125
		bodyModel[119].setRotationPoint(0F, 6F, 6F);

		bodyModel[120].addBox(-3.5F, -3.5F, 0F, 7, 7, 0, 0F); // Box 126
		bodyModel[120].setRotationPoint(-13F, 6F, -6F);

		bodyModel[121].addBox(-3.5F, -3.5F, 0F, 7, 7, 0, 0F); // Box 127
		bodyModel[121].setRotationPoint(-13F, 6F, 6F);
	}
}