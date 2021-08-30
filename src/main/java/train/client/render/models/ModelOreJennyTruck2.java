//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2021 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: BarberS2
// Model Creator: Bidahochi
// Created on: 01.08.2021 - 22:09:46
// Last changed on: 01.08.2021 - 22:09:46

package train.client.render.models; //Path where the model is located


import tmt.ModelConverter;
import tmt.ModelRendererTurbo;

public class ModelOreJennyTruck2 extends ModelConverter//Same as Filename
{
	int textureX = 128;
	int textureY = 64;

	public ModelOreJennyTruck2() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[88];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 14
		bodyModel[1] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 16 wheel
		bodyModel[2] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 22
		bodyModel[3] = new ModelRendererTurbo(this, 1, 21, textureX, textureY); // Box 104 cap
		bodyModel[4] = new ModelRendererTurbo(this, 1, 21, textureX, textureY); // Box 31 cap
		bodyModel[5] = new ModelRendererTurbo(this, 1, 21, textureX, textureY); // Box 36 cap
		bodyModel[6] = new ModelRendererTurbo(this, 1, 21, textureX, textureY); // Box 39 cap
		bodyModel[7] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 44 wheel
		bodyModel[8] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 45 wheel
		bodyModel[9] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 46 wheel
		bodyModel[10] = new ModelRendererTurbo(this, 76, 16, textureX, textureY); // Box 6
		bodyModel[11] = new ModelRendererTurbo(this, 23, 1, textureX, textureY); // Box 144
		bodyModel[12] = new ModelRendererTurbo(this, 23, 1, textureX, textureY); // Box 144
		bodyModel[13] = new ModelRendererTurbo(this, 53, 15, textureX, textureY); // Box 18
		bodyModel[14] = new ModelRendererTurbo(this, 53, 12, textureX, textureY); // Box 63
		bodyModel[15] = new ModelRendererTurbo(this, 76, 12, textureX, textureY); // Box 71
		bodyModel[16] = new ModelRendererTurbo(this, 78, 20, textureX, textureY); // Box 72
		bodyModel[17] = new ModelRendererTurbo(this, 23, 1, textureX, textureY); // Box 62
		bodyModel[18] = new ModelRendererTurbo(this, 23, 1, textureX, textureY); // Box 63
		bodyModel[19] = new ModelRendererTurbo(this, 54, 1, textureX, textureY); // Box 22
		bodyModel[20] = new ModelRendererTurbo(this, 23, 4, textureX, textureY); // Box 23
		bodyModel[21] = new ModelRendererTurbo(this, 1, 8, textureX, textureY); // Box 28
		bodyModel[22] = new ModelRendererTurbo(this, 76, 8, textureX, textureY); // Box 78
		bodyModel[23] = new ModelRendererTurbo(this, 68, 12, textureX, textureY); // Box 81
		bodyModel[24] = new ModelRendererTurbo(this, 63, 12, textureX, textureY); // Box 95
		bodyModel[25] = new ModelRendererTurbo(this, 64, 15, textureX, textureY); // Box 96
		bodyModel[26] = new ModelRendererTurbo(this, 96, 15, textureX, textureY); // Box 97
		bodyModel[27] = new ModelRendererTurbo(this, 97, 12, textureX, textureY); // Box 98
		bodyModel[28] = new ModelRendererTurbo(this, 67, 8, textureX, textureY); // Box 89
		bodyModel[29] = new ModelRendererTurbo(this, 103, 12, textureX, textureY); // Box 93
		bodyModel[30] = new ModelRendererTurbo(this, 101, 15, textureX, textureY); // Box 94
		bodyModel[31] = new ModelRendererTurbo(this, 90, 12, textureX, textureY); // Box 97
		bodyModel[32] = new ModelRendererTurbo(this, 90, 16, textureX, textureY); // Box 103
		bodyModel[33] = new ModelRendererTurbo(this, 68, 16, textureX, textureY); // Box 104
		bodyModel[34] = new ModelRendererTurbo(this, 76, 26, textureX, textureY); // Box 112
		bodyModel[35] = new ModelRendererTurbo(this, 89, 26, textureX, textureY); // Box 113
		bodyModel[36] = new ModelRendererTurbo(this, 68, 30, textureX, textureY); // Box 120
		bodyModel[37] = new ModelRendererTurbo(this, 68, 34, textureX, textureY); // Box 121
		bodyModel[38] = new ModelRendererTurbo(this, 90, 30, textureX, textureY); // Box 122
		bodyModel[39] = new ModelRendererTurbo(this, 90, 34, textureX, textureY); // Box 123
		bodyModel[40] = new ModelRendererTurbo(this, 101, 33, textureX, textureY); // Box 124
		bodyModel[41] = new ModelRendererTurbo(this, 76, 34, textureX, textureY); // Box 125
		bodyModel[42] = new ModelRendererTurbo(this, 53, 33, textureX, textureY); // Box 126
		bodyModel[43] = new ModelRendererTurbo(this, 53, 30, textureX, textureY); // Box 127
		bodyModel[44] = new ModelRendererTurbo(this, 103, 30, textureX, textureY); // Box 128
		bodyModel[45] = new ModelRendererTurbo(this, 63, 30, textureX, textureY); // Box 129
		bodyModel[46] = new ModelRendererTurbo(this, 64, 33, textureX, textureY); // Box 130
		bodyModel[47] = new ModelRendererTurbo(this, 97, 30, textureX, textureY); // Box 131
		bodyModel[48] = new ModelRendererTurbo(this, 96, 33, textureX, textureY); // Box 132
		bodyModel[49] = new ModelRendererTurbo(this, 78, 38, textureX, textureY); // Box 133
		bodyModel[50] = new ModelRendererTurbo(this, 23, 1, textureX, textureY); // Box 135
		bodyModel[51] = new ModelRendererTurbo(this, 23, 1, textureX, textureY); // Box 136
		bodyModel[52] = new ModelRendererTurbo(this, 23, 1, textureX, textureY); // Box 139
		bodyModel[53] = new ModelRendererTurbo(this, 23, 1, textureX, textureY); // Box 140
		bodyModel[54] = new ModelRendererTurbo(this, 2, 13, textureX, textureY); // Box 141
		bodyModel[55] = new ModelRendererTurbo(this, 2, 13, textureX, textureY); // Box 142
		bodyModel[56] = new ModelRendererTurbo(this, 76, 30, textureX, textureY); // Box 88
		bodyModel[57] = new ModelRendererTurbo(this, 39, 1, textureX, textureY); // Box 89
		bodyModel[58] = new ModelRendererTurbo(this, 89, 8, textureX, textureY); // Box 91
		bodyModel[59] = new ModelRendererTurbo(this, 105, 9, textureX, textureY); // Box 92
		bodyModel[60] = new ModelRendererTurbo(this, 112, 9, textureX, textureY); // Box 89
		bodyModel[61] = new ModelRendererTurbo(this, 112, 16, textureX, textureY); // Box 91
		bodyModel[62] = new ModelRendererTurbo(this, 112, 12, textureX, textureY); // Box 99
		bodyModel[63] = new ModelRendererTurbo(this, 112, 12, textureX, textureY); // Box 100
		bodyModel[64] = new ModelRendererTurbo(this, 117, 9, textureX, textureY); // Box 89
		bodyModel[65] = new ModelRendererTurbo(this, 53, 27, textureX, textureY); // Box 103
		bodyModel[66] = new ModelRendererTurbo(this, 43, 27, textureX, textureY); // Box 108
		bodyModel[67] = new ModelRendererTurbo(this, 67, 26, textureX, textureY); // Box 109
		bodyModel[68] = new ModelRendererTurbo(this, 53, 9, textureX, textureY); // Box 92
		bodyModel[69] = new ModelRendererTurbo(this, 105, 27, textureX, textureY); // Box 103
		bodyModel[70] = new ModelRendererTurbo(this, 48, 9, textureX, textureY); // Box 61
		bodyModel[71] = new ModelRendererTurbo(this, 48, 16, textureX, textureY); // Box 93
		bodyModel[72] = new ModelRendererTurbo(this, 48, 12, textureX, textureY); // Box 94
		bodyModel[73] = new ModelRendererTurbo(this, 48, 12, textureX, textureY); // Box 88
		bodyModel[74] = new ModelRendererTurbo(this, 112, 27, textureX, textureY); // Box 116
		bodyModel[75] = new ModelRendererTurbo(this, 112, 34, textureX, textureY); // Box 117
		bodyModel[76] = new ModelRendererTurbo(this, 112, 30, textureX, textureY); // Box 118
		bodyModel[77] = new ModelRendererTurbo(this, 112, 30, textureX, textureY); // Box 119
		bodyModel[78] = new ModelRendererTurbo(this, 43, 9, textureX, textureY); // Box 89
		bodyModel[79] = new ModelRendererTurbo(this, 117, 27, textureX, textureY); // Box 108
		bodyModel[80] = new ModelRendererTurbo(this, 31, 21, textureX, textureY); // Box 91
		bodyModel[81] = new ModelRendererTurbo(this, 24, 21, textureX, textureY); // Box 91
		bodyModel[82] = new ModelRendererTurbo(this, 10, 21, textureX, textureY); // Box 42
		bodyModel[83] = new ModelRendererTurbo(this, 17, 21, textureX, textureY); // Box 43
		bodyModel[84] = new ModelRendererTurbo(this, 48, 34, textureX, textureY); // Box 106
		bodyModel[85] = new ModelRendererTurbo(this, 48, 30, textureX, textureY); // Box 107
		bodyModel[86] = new ModelRendererTurbo(this, 48, 27, textureX, textureY); // Box 108
		bodyModel[87] = new ModelRendererTurbo(this, 48, 30, textureX, textureY); // Box 109

		bodyModel[0].addBox(0F, 0F, 0F, 2, 2, 17, 0F); // Box 14
		bodyModel[0].setRotationPoint(-5.5F, 6F, -8.5F);

		bodyModel[1].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 16 wheel
		bodyModel[1].setRotationPoint(-4.5F, 7F, -5.5F);

		bodyModel[2].addBox(0F, 0F, 0F, 2, 2, 17, 0F); // Box 22
		bodyModel[2].setRotationPoint(3.5F, 6F, -8.5F);

		bodyModel[3].addShapeBox(-1F, -1F, 0F, 2, 2, 1, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 104 cap
		bodyModel[3].setRotationPoint(-4.5F, 7F, -9F);

		bodyModel[4].addShapeBox(-1F, -1F, 0F, 2, 2, 1, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 31 cap
		bodyModel[4].setRotationPoint(4.5F, 7F, -9F);

		bodyModel[5].addShapeBox(-1F, -1F, 0F, 2, 2, 1, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 36 cap
		bodyModel[5].setRotationPoint(-4.5F, 7F, 8F);

		bodyModel[6].addShapeBox(-1F, -1F, 0F, 2, 2, 1, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 39 cap
		bodyModel[6].setRotationPoint(4.5F, 7F, 8F);

		bodyModel[7].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 44 wheel
		bodyModel[7].setRotationPoint(4.5F, 7F, -5.5F);

		bodyModel[8].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 45 wheel
		bodyModel[8].setRotationPoint(4.5F, 7F, 5.5F);

		bodyModel[9].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 46 wheel
		bodyModel[9].setRotationPoint(-4.5F, 7F, 5.5F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[10].setRotationPoint(-1.5F, 8F, -8.25F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, -1F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -1F, 0F, 0F, -4.5F, 0F, 0F, -4.25F, 0F, 0F, -4.25F, 0F, 0F, -4.5F, 0F); // Box 144
		bodyModel[11].setRotationPoint(-1F, 5F, -8.74F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, -1F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -1F, 0F, 0F, -4.5F, 0F, 0F, -4.25F, 0F, 0F, -4.25F, 0F, 0F, -4.5F, 0F); // Box 144
		bodyModel[12].setRotationPoint(0.1F, 5F, -8.74F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, 0.25F, 0F, -2F, 0.5F, 0F, -2F, -0.25F, -1F, 0F, -0.5F, 0F, -1F, 0.17F, 0F, 2F, 0.5F, 0F, 2F, -0.25F, 0F, -1F, -0.5F); // Box 18
		bodyModel[13].setRotationPoint(-3.5F, 6F, -8F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 63
		bodyModel[14].setRotationPoint(-5.5F, 5F, -8F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F); // Box 71
		bodyModel[15].setRotationPoint(-1.5F, 5.75F, -8.75F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, -0.15F, 0F, 0F, -0.15F); // Box 72
		bodyModel[16].setRotationPoint(-1.5F, 8F, -9.35F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, -1.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1.25F, 0F, 0F, -4.25F, 0F, 0F, -4.5F, 0F, 0F, -4.5F, 0F, 0F, -4.25F, 0F); // Box 62
		bodyModel[17].setRotationPoint(0.1F, 5F, -7.49F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, -1.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1.25F, 0F, 0F, -4.25F, 0F, 0F, -4.5F, 0F, 0F, -4.5F, 0F, 0F, -4.25F, 0F); // Box 63
		bodyModel[18].setRotationPoint(-1F, 5F, -7.49F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 3, 3, 3, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.25F, -0.25F, 0F, -2.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		bodyModel[19].setRotationPoint(-1.5F, 5.75F, -6.5F);

		bodyModel[20].addBox(0F, 0F, 0F, 3, 3, 7, 0F); // Box 23
		bodyModel[20].setRotationPoint(-1.5F, 5.75F, -3.5F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 28
		bodyModel[21].setRotationPoint(-1.5F, 4.75F, -1.5F);

		bodyModel[22].addBox(0F, 0F, 0F, 3, 1, 2, 0F); // Box 78
		bodyModel[22].setRotationPoint(-1.5F, 4.5F, -8.5F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.5F, 0F, 0.15F, 0F, 0F, 0.25F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.15F, 0F, 0F, 0.25F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 81
		bodyModel[23].setRotationPoint(-2.5F, 5.5F, -8.25F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 95
		bodyModel[24].setRotationPoint(-3.5F, 6F, -8F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 96
		bodyModel[25].setRotationPoint(-3.5F, 7F, -8F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0.25F, 0F); // Box 97
		bodyModel[26].setRotationPoint(2.5F, 7F, -8F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 98
		bodyModel[27].setRotationPoint(2.5F, 6F, -8F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 89
		bodyModel[28].setRotationPoint(-3.5F, 4.5F, -8.5F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.5F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 93
		bodyModel[29].setRotationPoint(2.5F, 5F, -8F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -2F, 0.5F, -1F, 0F, 0.25F, -1F, 0F, -0.5F, 0F, -2F, -0.25F, 0F, 2F, 0.5F, 0F, -1F, 0.17F, 0F, -1F, -0.5F, 0F, 2F, -0.25F); // Box 94
		bodyModel[30].setRotationPoint(1.5F, 6F, -8F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0.25F, -0.5F, 0F, 0.15F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, -0.5F, 0F, 0.15F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 97
		bodyModel[31].setRotationPoint(1.5F, 5.5F, -8.25F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.25F, 0.25F, -0.5F, -0.25F, 0.15F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.75F, 0.25F, -0.5F, -0.25F, 0.15F, -0.5F, -0.25F, 0F, 0F, 0.75F, 0F); // Box 103
		bodyModel[32].setRotationPoint(1.5F, 6.25F, -8.25F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.5F, -0.25F, 0.15F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0.15F, 0F, 0.75F, 0.25F, 0F, 0.75F, 0F, -0.5F, -0.25F, 0F); // Box 104
		bodyModel[33].setRotationPoint(-2.5F, 6.25F, -8.25F);

		bodyModel[34].addBox(0F, 0F, 0F, 3, 1, 2, 0F); // Box 112
		bodyModel[34].setRotationPoint(-1.5F, 4.5F, 6.5F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F); // Box 113
		bodyModel[35].setRotationPoint(-3.5F, 4.5F, 6.5F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.15F, 0F, 0F, 0.25F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.15F, 0F, 0F, 0.25F); // Box 120
		bodyModel[36].setRotationPoint(1.5F, 5.5F, 6.25F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0.15F, 0F, -0.25F, 0.25F, 0F, 0.75F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0.15F, 0F, 0.75F, 0.25F); // Box 121
		bodyModel[37].setRotationPoint(1.5F, 6.25F, 6.25F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, -0.5F, 0F, 0.15F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, -0.5F, 0F, 0.15F); // Box 122
		bodyModel[38].setRotationPoint(-2.5F, 5.5F, 6.25F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0.25F, -0.5F, -0.25F, 0.15F, -0.5F, -0.25F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0.25F, -0.5F, -0.25F, 0.15F); // Box 123
		bodyModel[39].setRotationPoint(-2.5F, 6.25F, 6.25F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -0.5F, 0F, -2F, -0.25F, 0F, -2F, 0.5F, -1F, 0F, 0.25F, 0F, -1F, -0.5F, 0F, 2F, -0.25F, 0F, 2F, 0.5F, 0F, -1F, 0.17F); // Box 124
		bodyModel[40].setRotationPoint(-3.5F, 6F, 6F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 125
		bodyModel[41].setRotationPoint(-1.5F, 8F, 6.25F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -2F, -0.25F, -1F, 0F, -0.5F, -1F, 0F, 0.25F, 0F, -2F, 0.5F, 0F, 2F, -0.25F, 0F, -1F, -0.5F, 0F, -1F, 0.17F, 0F, 2F, 0.5F); // Box 126
		bodyModel[42].setRotationPoint(1.5F, 6F, 6F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0.25F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0.25F); // Box 127
		bodyModel[43].setRotationPoint(2.5F, 5F, 7F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.25F, 0F, 0F, 0F); // Box 128
		bodyModel[44].setRotationPoint(-5.5F, 5F, 7F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 129
		bodyModel[45].setRotationPoint(2.5F, 6F, 7F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0.25F, 0F); // Box 130
		bodyModel[46].setRotationPoint(2.5F, 7F, 7F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 131
		bodyModel[47].setRotationPoint(-3.5F, 6F, 7F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 132
		bodyModel[48].setRotationPoint(-3.5F, 7F, 7F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F); // Box 133
		bodyModel[49].setRotationPoint(-1.5F, 8F, 8.35F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, -1F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -1F, 0F, 0F, -4.5F, 0F, 0F, -4.25F, 0F, 0F, -4.25F, 0F, 0F, -4.5F, 0F); // Box 135
		bodyModel[50].setRotationPoint(-1F, 5F, 6.49F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, -1F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -1F, 0F, 0F, -4.5F, 0F, 0F, -4.25F, 0F, 0F, -4.25F, 0F, 0F, -4.5F, 0F); // Box 136
		bodyModel[51].setRotationPoint(0.1F, 5F, 6.49F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, -1.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1.25F, 0F, 0F, -4.25F, 0F, 0F, -4.5F, 0F, 0F, -4.5F, 0F, 0F, -4.25F, 0F); // Box 139
		bodyModel[52].setRotationPoint(-1F, 5F, 7.73999999999999F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, -1.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1.25F, 0F, 0F, -4.25F, 0F, 0F, -4.5F, 0F, 0F, -4.5F, 0F, 0F, -4.25F, 0F); // Box 140
		bodyModel[53].setRotationPoint(0.1F, 5F, 7.73999999999999F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 141
		bodyModel[54].setRotationPoint(-1.5F, 4.75F, -5.5F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 142
		bodyModel[55].setRotationPoint(-1.5F, 4.75F, 3.5F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 88
		bodyModel[56].setRotationPoint(-1.5F, 5.75F, 6.75F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 3, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.25F, -0.25F, 0F, -2.25F, -0.25F); // Box 89
		bodyModel[57].setRotationPoint(-1.5F, 5.75F, 3.5F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, -0.325F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.325F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 91
		bodyModel[58].setRotationPoint(1.5F, 4.5F, -8.5F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.25F, 0.175F, 0F, -0.25F, 0F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, 0.25F, 0.175F, 0F, 0.25F, 0F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.5F); // Box 92
		bodyModel[59].setRotationPoint(3.5F, 4.25F, -8F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, -0.25F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.25F, 0F, 0.5F); // Box 89
		bodyModel[60].setRotationPoint(6.25F, 4.5F, -8F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, -0.5F, -0.7F, 0F, -0.5F, -0.7F, 0F, 0F, -0.7F, 0F); // Box 91
		bodyModel[61].setRotationPoint(5.5F, 5.5F, -7.75F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.75F, 0F, -0.5F, -0.75F); // Box 99
		bodyModel[62].setRotationPoint(5.5F, 5.5F, -8F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.75F, 0.25F, 0F, -0.75F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.75F, -0.25F, -0.5F, -0.75F, -0.25F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 100
		bodyModel[63].setRotationPoint(5.5F, 5.5F, -7.5F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 89
		bodyModel[64].setRotationPoint(5.5F, 4.5F, -8F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0.175F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0.175F); // Box 103
		bodyModel[65].setRotationPoint(3.5F, 4.25F, 7F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 108
		bodyModel[66].setRotationPoint(5.5F, 4.5F, 7F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.325F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.325F, 0F, 0F, 0F); // Box 109
		bodyModel[67].setRotationPoint(1.5F, 4.5F, 6.5F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0.175F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0.175F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.5F); // Box 92
		bodyModel[68].setRotationPoint(-5.5F, 4.25F, -8F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.175F, 0F, -0.25F, 0F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.175F, 0F, 0.25F, 0F); // Box 103
		bodyModel[69].setRotationPoint(-5.5F, 4.25F, 7F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0.5F, 0F, -1F, 0.5F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 61
		bodyModel[70].setRotationPoint(-6.75F, 4.5F, -8F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, -0.5F, -0.7F, 0F); // Box 93
		bodyModel[71].setRotationPoint(-6.5F, 5.5F, -7.75F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0.25F, 0F, -0.75F, -0.25F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.75F, -0.25F, -0.5F, -0.75F); // Box 94
		bodyModel[72].setRotationPoint(-6.5F, 5.5F, -8F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0.25F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F); // Box 88
		bodyModel[73].setRotationPoint(-6.5F, 5.5F, -7.5F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, 0.5F, -0.75F, -0.25F, 0.5F, -0.75F, -0.25F, 0F, 0F, -1F, 0F, 0F, 0F, 0.5F, -0.75F, 0F, 0.5F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 116
		bodyModel[74].setRotationPoint(-6.75F, 4.5F, 7F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, -0.5F, -0.7F, 0F); // Box 117
		bodyModel[75].setRotationPoint(-6.5F, 5.5F, 6.75F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0.25F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F); // Box 118
		bodyModel[76].setRotationPoint(-6.5F, 5.5F, 7F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0.25F, 0F, -0.75F, -0.25F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.75F, -0.25F, -0.5F, -0.75F); // Box 119
		bodyModel[77].setRotationPoint(-6.5F, 5.5F, 6.5F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -0.25F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 89
		bodyModel[78].setRotationPoint(-6.5F, 4.5F, -8F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.25F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 108
		bodyModel[79].setRotationPoint(-6.5F, 4.5F, 7F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 91
		bodyModel[80].setRotationPoint(-5.5F, 6F, 8F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 91
		bodyModel[81].setRotationPoint(3.5F, 6F, 8F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 42
		bodyModel[82].setRotationPoint(-5.5F, 6F, -9F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 43
		bodyModel[83].setRotationPoint(3.5F, 6F, -9F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, -0.5F, -0.7F, 0F, -0.5F, -0.7F, 0F, 0F, -0.7F, 0F); // Box 106
		bodyModel[84].setRotationPoint(5.5F, 5.5F, 6.75F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.75F, 0.25F, 0F, -0.75F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.75F, -0.25F, -0.5F, -0.75F, -0.25F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 107
		bodyModel[85].setRotationPoint(5.5F, 5.5F, 7F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, -0.25F, 0.5F, -0.5F, -1F, 0.5F, -0.5F, -1F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, -0.25F, 0F, 0F); // Box 108
		bodyModel[86].setRotationPoint(6.25F, 4.5F, 7F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.75F, 0F, -0.5F, -0.75F); // Box 109
		bodyModel[87].setRotationPoint(5.5F, 5.5F, 6.5F);
	}
}