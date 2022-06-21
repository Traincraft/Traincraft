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

public class ModelHiAd extends ModelConverter //Same as Filename
{
	int textureX = 128;
	int textureY = 64;

	public ModelHiAd() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[100];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 43, textureX, textureY); // Box 4
		bodyModel[1] = new ModelRendererTurbo(this, 1, 43, textureX, textureY); // Box 5
		bodyModel[2] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 30 wheel
		bodyModel[3] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 46 whee
		bodyModel[4] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 47 wheel
		bodyModel[5] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 48 wheel
		bodyModel[6] = new ModelRendererTurbo(this, 11, 20, textureX, textureY); // Box 51
		bodyModel[7] = new ModelRendererTurbo(this, 18, 31, textureX, textureY); // Box 104 smol bering cab
		bodyModel[8] = new ModelRendererTurbo(this, 18, 27, textureX, textureY); // Box 110 smol bering cab
		bodyModel[9] = new ModelRendererTurbo(this, 18, 35, textureX, textureY); // Box 339 smol bering cab
		bodyModel[10] = new ModelRendererTurbo(this, 18, 39, textureX, textureY); // Box 340 smol bering cab
		bodyModel[11] = new ModelRendererTurbo(this, 0, 14, textureX, textureY); // Box 372
		bodyModel[12] = new ModelRendererTurbo(this, 10, 23, textureX, textureY); // Box 117
		bodyModel[13] = new ModelRendererTurbo(this, 1, 23, textureX, textureY); // Box 111
		bodyModel[14] = new ModelRendererTurbo(this, 0, 28, textureX, textureY); // Box 124
		bodyModel[15] = new ModelRendererTurbo(this, 1, 23, textureX, textureY); // Box 157
		bodyModel[16] = new ModelRendererTurbo(this, 10, 23, textureX, textureY); // Box 158
		bodyModel[17] = new ModelRendererTurbo(this, 2, 20, textureX, textureY); // Box 123
		bodyModel[18] = new ModelRendererTurbo(this, 2, 20, textureX, textureY); // Box 124
		bodyModel[19] = new ModelRendererTurbo(this, 11, 20, textureX, textureY); // Box 125
		bodyModel[20] = new ModelRendererTurbo(this, 9, 28, textureX, textureY); // Box 152
		bodyModel[21] = new ModelRendererTurbo(this, 58, 1, textureX, textureY); // Box 333
		bodyModel[22] = new ModelRendererTurbo(this, 38, 6, textureX, textureY); // Box 133
		bodyModel[23] = new ModelRendererTurbo(this, 38, 2, textureX, textureY); // Box 346
		bodyModel[24] = new ModelRendererTurbo(this, 47, 2, textureX, textureY); // Box 35
		bodyModel[25] = new ModelRendererTurbo(this, 45, 6, textureX, textureY); // Box 36
		bodyModel[26] = new ModelRendererTurbo(this, 78, 61, textureX, textureY); // Box 130
		bodyModel[27] = new ModelRendererTurbo(this, 78, 52, textureX, textureY); // Box 119
		bodyModel[28] = new ModelRendererTurbo(this, 78, 57, textureX, textureY); // Box 120
		bodyModel[29] = new ModelRendererTurbo(this, 97, 61, textureX, textureY); // Box 134
		bodyModel[30] = new ModelRendererTurbo(this, 111, 57, textureX, textureY); // Box 138
		bodyModel[31] = new ModelRendererTurbo(this, 111, 52, textureX, textureY); // Box 139
		bodyModel[32] = new ModelRendererTurbo(this, 71, 2, textureX, textureY); // Box 45
		bodyModel[33] = new ModelRendererTurbo(this, 77, 6, textureX, textureY); // Box 46
		bodyModel[34] = new ModelRendererTurbo(this, 82, 2, textureX, textureY); // Box 47
		bodyModel[35] = new ModelRendererTurbo(this, 84, 6, textureX, textureY); // Box 48
		bodyModel[36] = new ModelRendererTurbo(this, 62, 18, textureX, textureY); // Box 149
		bodyModel[37] = new ModelRendererTurbo(this, 53, 26, textureX, textureY); // Box 51
		bodyModel[38] = new ModelRendererTurbo(this, 62, 18, textureX, textureY); // Box 52
		bodyModel[39] = new ModelRendererTurbo(this, 32, 19, textureX, textureY); // Box 53
		bodyModel[40] = new ModelRendererTurbo(this, 53, 6, textureX, textureY); // Box 55
		bodyModel[41] = new ModelRendererTurbo(this, 67, 26, textureX, textureY); // Box 56
		bodyModel[42] = new ModelRendererTurbo(this, 67, 20, textureX, textureY); // Box 57
		bodyModel[43] = new ModelRendererTurbo(this, 67, 17, textureX, textureY); // Box 58
		bodyModel[44] = new ModelRendererTurbo(this, 44, 45, textureX, textureY); // Box 59
		bodyModel[45] = new ModelRendererTurbo(this, 44, 45, textureX, textureY); // Box 60
		bodyModel[46] = new ModelRendererTurbo(this, 3, 28, textureX, textureY); // Box 61
		bodyModel[47] = new ModelRendererTurbo(this, 33, 5, textureX, textureY); // Box 63
		bodyModel[48] = new ModelRendererTurbo(this, 31, 2, textureX, textureY); // Box 65
		bodyModel[49] = new ModelRendererTurbo(this, 3, 28, textureX, textureY); // Box 66
		bodyModel[50] = new ModelRendererTurbo(this, 9, 28, textureX, textureY); // Box 67
		bodyModel[51] = new ModelRendererTurbo(this, 0, 28, textureX, textureY); // Box 68
		bodyModel[52] = new ModelRendererTurbo(this, 106, 57, textureX, textureY); // Box 74
		bodyModel[53] = new ModelRendererTurbo(this, 83, 52, textureX, textureY); // Box 75
		bodyModel[54] = new ModelRendererTurbo(this, 83, 57, textureX, textureY); // Box 76
		bodyModel[55] = new ModelRendererTurbo(this, 106, 52, textureX, textureY); // Box 77
		bodyModel[56] = new ModelRendererTurbo(this, 24, 45, textureX, textureY); // Box 346
		bodyModel[57] = new ModelRendererTurbo(this, 24, 45, textureX, textureY); // Box 369
		bodyModel[58] = new ModelRendererTurbo(this, 47, 21, textureX, textureY); // Box 80
		bodyModel[59] = new ModelRendererTurbo(this, 62, 45, textureX, textureY); // Box 81
		bodyModel[60] = new ModelRendererTurbo(this, 62, 45, textureX, textureY); // Box 82
		bodyModel[61] = new ModelRendererTurbo(this, 91, 5, textureX, textureY); // Box 83
		bodyModel[62] = new ModelRendererTurbo(this, 91, 2, textureX, textureY); // Box 84
		bodyModel[63] = new ModelRendererTurbo(this, 53, 34, textureX, textureY); // Box 85
		bodyModel[64] = new ModelRendererTurbo(this, 47, 21, textureX, textureY); // Box 86
		bodyModel[65] = new ModelRendererTurbo(this, 58, 29, textureX, textureY); // Box 87
		bodyModel[66] = new ModelRendererTurbo(this, 47, 30, textureX, textureY); // Box 88
		bodyModel[67] = new ModelRendererTurbo(this, 71, 30, textureX, textureY); // Box 89
		bodyModel[68] = new ModelRendererTurbo(this, 45, 34, textureX, textureY); // Box 90
		bodyModel[69] = new ModelRendererTurbo(this, 38, 30, textureX, textureY); // Box 91
		bodyModel[70] = new ModelRendererTurbo(this, 38, 34, textureX, textureY); // Box 92
		bodyModel[71] = new ModelRendererTurbo(this, 33, 33, textureX, textureY); // Box 93
		bodyModel[72] = new ModelRendererTurbo(this, 31, 30, textureX, textureY); // Box 94
		bodyModel[73] = new ModelRendererTurbo(this, 78, 34, textureX, textureY); // Box 95
		bodyModel[74] = new ModelRendererTurbo(this, 85, 34, textureX, textureY); // Box 96
		bodyModel[75] = new ModelRendererTurbo(this, 82, 30, textureX, textureY); // Box 97
		bodyModel[76] = new ModelRendererTurbo(this, 91, 33, textureX, textureY); // Box 98
		bodyModel[77] = new ModelRendererTurbo(this, 91, 30, textureX, textureY); // Box 99
		bodyModel[78] = new ModelRendererTurbo(this, 67, 26, textureX, textureY); // Box 100
		bodyModel[79] = new ModelRendererTurbo(this, 62, 18, textureX, textureY); // Box 101
		bodyModel[80] = new ModelRendererTurbo(this, 53, 26, textureX, textureY); // Box 102
		bodyModel[81] = new ModelRendererTurbo(this, 62, 18, textureX, textureY); // Box 103
		bodyModel[82] = new ModelRendererTurbo(this, 67, 20, textureX, textureY); // Box 104
		bodyModel[83] = new ModelRendererTurbo(this, 67, 17, textureX, textureY); // Box 105
		bodyModel[84] = new ModelRendererTurbo(this, 78, 61, textureX, textureY); // Box 106
		bodyModel[85] = new ModelRendererTurbo(this, 78, 52, textureX, textureY); // Box 107
		bodyModel[86] = new ModelRendererTurbo(this, 78, 57, textureX, textureY); // Box 108
		bodyModel[87] = new ModelRendererTurbo(this, 83, 57, textureX, textureY); // Box 109
		bodyModel[88] = new ModelRendererTurbo(this, 83, 52, textureX, textureY); // Box 110
		bodyModel[89] = new ModelRendererTurbo(this, 106, 57, textureX, textureY); // Box 111
		bodyModel[90] = new ModelRendererTurbo(this, 97, 61, textureX, textureY); // Box 112
		bodyModel[91] = new ModelRendererTurbo(this, 111, 57, textureX, textureY); // Box 113
		bodyModel[92] = new ModelRendererTurbo(this, 111, 52, textureX, textureY); // Box 114
		bodyModel[93] = new ModelRendererTurbo(this, 106, 52, textureX, textureY); // Box 115
		bodyModel[94] = new ModelRendererTurbo(this, 3, 28, textureX, textureY); // Box 116
		bodyModel[95] = new ModelRendererTurbo(this, 0, 28, textureX, textureY); // Box 117
		bodyModel[96] = new ModelRendererTurbo(this, 0, 28, textureX, textureY); // Box 118
		bodyModel[97] = new ModelRendererTurbo(this, 3, 28, textureX, textureY); // Box 119
		bodyModel[98] = new ModelRendererTurbo(this, 9, 28, textureX, textureY); // Box 120
		bodyModel[99] = new ModelRendererTurbo(this, 9, 28, textureX, textureY); // Box 121

		bodyModel[0].addBox(0F, 0F, 0F, 2, 2, 18, 0F); // Box 4
		bodyModel[0].setRotationPoint(-9F, 6F, -9F);

		bodyModel[1].addBox(0F, 0F, 0F, 2, 2, 18, 0F); // Box 5
		bodyModel[1].setRotationPoint(7F, 6F, -9F);

		bodyModel[2].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 30 wheel
		bodyModel[2].setRotationPoint(8F, 7F, 5.5F);

		bodyModel[3].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 46 whee
		bodyModel[3].setRotationPoint(-8F, 7F, 5.5F);

		bodyModel[4].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 47 wheel
		bodyModel[4].setRotationPoint(-8F, 7F, -5.5F);

		bodyModel[5].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 48 wheel
		bodyModel[5].setRotationPoint(8F, 7F, -5.5F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 51
		bodyModel[6].setRotationPoint(-10F, 3.4F, -9F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 104 smol bering cab
		bodyModel[7].setRotationPoint(-9F, 6F, -9.5F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 110 smol bering cab
		bodyModel[8].setRotationPoint(7F, 6F, -9.5F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 339 smol bering cab
		bodyModel[9].setRotationPoint(7F, 6F, 8.5F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 340 smol bering cab
		bodyModel[10].setRotationPoint(-9F, 6F, 8.5F);

		bodyModel[11].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 372
		bodyModel[11].setRotationPoint(-2F, 3F, -2F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F); // Box 117
		bodyModel[12].setRotationPoint(-10F, 3F, 9.5F);
		bodyModel[12].rotateAngleX = -0.78539816F;

		bodyModel[13].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F); // Box 111
		bodyModel[13].setRotationPoint(8F, 3F, 9.5F);
		bodyModel[13].rotateAngleX = -0.78539816F;

		bodyModel[14].addShapeBox(0F, 0F, 0F, 2, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 124
		bodyModel[14].setRotationPoint(6F, 3.8F, 9.25F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F); // Box 157
		bodyModel[15].setRotationPoint(8F, 3F, -9.5F);
		bodyModel[15].rotateAngleX = -0.78539816F;

		bodyModel[16].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F); // Box 158
		bodyModel[16].setRotationPoint(-10F, 3F, -9.5F);
		bodyModel[16].rotateAngleX = -0.78539816F;

		bodyModel[17].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 123
		bodyModel[17].setRotationPoint(8F, 3.4F, -9F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 124
		bodyModel[18].setRotationPoint(8F, 3.4F, 8F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 125
		bodyModel[19].setRotationPoint(-10F, 3.4F, 8F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 152
		bodyModel[20].setRotationPoint(5F, 3F, 7.5F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Box 333
		bodyModel[21].setRotationPoint(-2.5F, 5F, 7.5F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, 0F, 0F, 0F); // Box 133
		bodyModel[22].setRotationPoint(9F, 5.5F, 7.5F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 346
		bodyModel[23].setRotationPoint(7F, 4F, 7.5F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, 0.5F, 0F, 0.5F, 2F, 0F, 0.5F, 2F, 0F, 0F, 0.5F, 0F, -1F, 0F, 0F, 0.5F, -1.5F, 0F, 0.5F, -1.5F, 0F, -1F, 0F, 0F); // Box 35
		bodyModel[24].setRotationPoint(2.5F, 6F, 7.5F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.5F, -0.65F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.65F, 0F, -1.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.25F, 0F, 0F); // Box 36
		bodyModel[25].setRotationPoint(5F, 6.5F, 7.5F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 130
		bodyModel[26].setRotationPoint(-11F, 8F, 7.25F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 119
		bodyModel[27].setRotationPoint(-12F, 4F, 7F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F); // Box 120
		bodyModel[28].setRotationPoint(-11.5F, 7F, 7F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 134
		bodyModel[29].setRotationPoint(3F, 8F, 7.25F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 138
		bodyModel[30].setRotationPoint(10.5F, 7F, 7F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F); // Box 139
		bodyModel[31].setRotationPoint(11F, 4F, 7F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0.5F, 2F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.5F, 2F, 0F, 0.5F, -1.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, -1.5F, 0F); // Box 45
		bodyModel[32].setRotationPoint(-6.5F, 6F, 7.5F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, -0.5F, -0.65F, 0F, -0.5F, -0.65F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, 0F, 0F, 0F); // Box 46
		bodyModel[33].setRotationPoint(-7F, 6.5F, 7.5F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 47
		bodyModel[34].setRotationPoint(-10F, 4F, 7.5F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.25F, 0F, 0F); // Box 48
		bodyModel[35].setRotationPoint(-11F, 5.5F, 7.5F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,0.1F, -1F, 0.1F, 0.1F, -1.25F, 0.1F, 0.1F, -1.25F, 0.1F, 0.1F, -1F, 0.1F, 0.1F, -4.5F, 0.1F, 0.1F, -4.25F, 0.1F, 0.1F, -4.25F, 0.1F, 0.1F, -4.5F, 0.1F); // Box 149
		bodyModel[36].setRotationPoint(-1.25F, 3.25F, 8.75F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 51
		bodyModel[37].setRotationPoint(-1.5F, 7F, 8.5F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,0.1F, -1F, 0.1F, 0.1F, -1.25F, 0.1F, 0.1F, -1.25F, 0.1F, 0.1F, -1F, 0.1F, 0.1F, -4.5F, 0.1F, 0.1F, -4.25F, 0.1F, 0.1F, -4.25F, 0.1F, 0.1F, -4.5F, 0.1F); // Box 52
		bodyModel[38].setRotationPoint(0.25F, 3.25F, 8.75F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 3, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 53
		bodyModel[39].setRotationPoint(-1.5F, 4F, -2F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 3, 2, 8, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 55
		bodyModel[40].setRotationPoint(-1.5F, 3F, 2F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 56
		bodyModel[41].setRotationPoint(-2.5F, 7F, 8.5F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 57
		bodyModel[42].setRotationPoint(-2.5F, 3.5F, 8.5F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 58
		bodyModel[43].setRotationPoint(-2.5F, 3.75F, 8.5F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 1, 3, 15, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 59
		bodyModel[44].setRotationPoint(-2.5F, 5F, -7.5F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 1, 3, 15, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 60
		bodyModel[45].setRotationPoint(1.5F, 5F, -7.5F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 1, 0, 3, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 61
		bodyModel[46].setRotationPoint(5.25F, 3.8F, 7F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 63
		bodyModel[47].setRotationPoint(10F, 4.5F, 7.5F);

		bodyModel[48].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 65
		bodyModel[48].setRotationPoint(10F, 4F, 7.5F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 1, 0, 3, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Box 66
		bodyModel[49].setRotationPoint(-6.25F, 3.8F, 7F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 67
		bodyModel[50].setRotationPoint(-7F, 3F, 7.5F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 2, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 68
		bodyModel[51].setRotationPoint(-8F, 3.8F, 9.25F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 74
		bodyModel[52].setRotationPoint(3.5F, 7F, 7F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 75
		bodyModel[53].setRotationPoint(-5F, 4F, 7F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F); // Box 76
		bodyModel[54].setRotationPoint(-4.5F, 7F, 7F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F); // Box 77
		bodyModel[55].setRotationPoint(4F, 4F, 7F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 7, 4, 10, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 346
		bodyModel[56].setRotationPoint(-9.5F, 5F, -5F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 7, 4, 10, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 369
		bodyModel[57].setRotationPoint(2.5F, 5F, -5F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 5, 2, 2, 0F,0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 80
		bodyModel[58].setRotationPoint(-1F, 2F, 7F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 81
		bodyModel[59].setRotationPoint(-2.5F, 3.5F, -2.5F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 82
		bodyModel[60].setRotationPoint(1.5F, 3.5F, -2.5F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 83
		bodyModel[61].setRotationPoint(-11F, 4.5F, 7.5F);

		bodyModel[62].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 84
		bodyModel[62].setRotationPoint(-12F, 4F, 7.5F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 3, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 85
		bodyModel[63].setRotationPoint(-1.5F, 3F, -10F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 5, 2, 2, 0F,0F, 0F, -1F, -3F, 0F, -1F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 86
		bodyModel[64].setRotationPoint(-1F, 2F, -9F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Box 87
		bodyModel[65].setRotationPoint(-2.5F, 5F, -8.5F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0.5F, 2F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.5F, 2F, 0F, 0.5F, -1.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, -1.5F, 0F); // Box 88
		bodyModel[66].setRotationPoint(-6.5F, 6F, -8.5F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, 0.5F, 0F, 0.5F, 2F, 0F, 0.5F, 2F, 0F, 0F, 0.5F, 0F, -1F, 0F, 0F, 0.5F, -1.5F, 0F, 0.5F, -1.5F, 0F, -1F, 0F, 0F); // Box 89
		bodyModel[67].setRotationPoint(2.5F, 6F, -8.5F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, -0.5F, -0.65F, 0F, -0.5F, -0.65F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, 0F, 0F, 0F); // Box 90
		bodyModel[68].setRotationPoint(-7F, 6.5F, -8.5F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 91
		bodyModel[69].setRotationPoint(-10F, 4F, -8.5F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.25F, 0F, 0F); // Box 92
		bodyModel[70].setRotationPoint(-11F, 5.5F, -8.5F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 93
		bodyModel[71].setRotationPoint(-11F, 4.5F, -8.5F);

		bodyModel[72].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 94
		bodyModel[72].setRotationPoint(-12F, 4F, -8.5F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.5F, -0.65F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.65F, 0F, -1.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.25F, 0F, 0F); // Box 95
		bodyModel[73].setRotationPoint(5F, 6.5F, -8.5F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, 0F, 0F, 0F); // Box 96
		bodyModel[74].setRotationPoint(9F, 5.5F, -8.5F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 97
		bodyModel[75].setRotationPoint(7F, 4F, -8.5F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 98
		bodyModel[76].setRotationPoint(10F, 4.5F, -8.5F);

		bodyModel[77].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 99
		bodyModel[77].setRotationPoint(10F, 4F, -8.5F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 100
		bodyModel[78].setRotationPoint(1.5F, 7F, -9.5F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,0.1F, -1.25F, 0.1F, 0.1F, -1F, 0.1F, 0.1F, -1F, 0.1F, 0.1F, -1.25F, 0.1F, 0.1F, -4.25F, 0.1F, 0.1F, -4.5F, 0.1F, 0.1F, -4.5F, 0.1F, 0.1F, -4.25F, 0.1F); // Box 101
		bodyModel[79].setRotationPoint(-1.25F, 3.25F, -9.75F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 102
		bodyModel[80].setRotationPoint(-1.5F, 7F, -9.5F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,0.1F, -1.25F, 0.1F, 0.1F, -1F, 0.1F, 0.1F, -1F, 0.1F, 0.1F, -1.25F, 0.1F, 0.1F, -4.25F, 0.1F, 0.1F, -4.5F, 0.1F, 0.1F, -4.5F, 0.1F, 0.1F, -4.25F, 0.1F); // Box 103
		bodyModel[81].setRotationPoint(0.25F, 3.25F, -9.75F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 104
		bodyModel[82].setRotationPoint(1.5F, 3.5F, -9.5F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 105
		bodyModel[83].setRotationPoint(1.5F, 3.75F, -9.5F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 106
		bodyModel[84].setRotationPoint(-11F, 8F, -8.25F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F); // Box 107
		bodyModel[85].setRotationPoint(-12F, 4F, -8F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F); // Box 108
		bodyModel[86].setRotationPoint(-11.5F, 7F, -8F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F); // Box 109
		bodyModel[87].setRotationPoint(-4.5F, 7F, -8F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F); // Box 110
		bodyModel[88].setRotationPoint(-5F, 4F, -8F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 111
		bodyModel[89].setRotationPoint(3.5F, 7F, -8F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 112
		bodyModel[90].setRotationPoint(3F, 8F, -8.25F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 113
		bodyModel[91].setRotationPoint(10.5F, 7F, -8F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F); // Box 114
		bodyModel[92].setRotationPoint(11F, 4F, -8F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F); // Box 115
		bodyModel[93].setRotationPoint(4F, 4F, -8F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 1, 0, 3, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Box 116
		bodyModel[94].setRotationPoint(-6.25F, 3.8F, -10F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 2, 0, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 117
		bodyModel[95].setRotationPoint(-8F, 3.8F, -10.25F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 2, 0, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 118
		bodyModel[96].setRotationPoint(6F, 3.8F, -10.25F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 1, 0, 3, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 119
		bodyModel[97].setRotationPoint(5.25F, 3.8F, -10F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 120
		bodyModel[98].setRotationPoint(5F, 3F, -8.5F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 121
		bodyModel[99].setRotationPoint(-7F, 3F, -8.5F);
	}
}