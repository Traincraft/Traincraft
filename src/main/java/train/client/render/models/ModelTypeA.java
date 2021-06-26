//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2021 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: typeA
// Model Creator: Bida
// Created on: 20.06.2021 - 08:52:42
// Last changed on: 20.06.2021 - 08:52:42

package train.client.render.models; //Path where the model is located


import tmt.ModelConverter;
import tmt.ModelRendererTurbo;

public class ModelTypeA extends ModelConverter //Same as Filename
{
	int textureX = 128;
	int textureY = 128;

	public ModelTypeA() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[65];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 4
		bodyModel[1] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 5
		bodyModel[2] = new ModelRendererTurbo(this, 113, 9, textureX, textureY); // Box 30 wheel
		bodyModel[3] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 52
		bodyModel[4] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 53
		bodyModel[5] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 56
		bodyModel[6] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 57
		bodyModel[7] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 59
		bodyModel[8] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 60
		bodyModel[9] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 65
		bodyModel[10] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 66
		bodyModel[11] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 67
		bodyModel[12] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 70
		bodyModel[13] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 71
		bodyModel[14] = new ModelRendererTurbo(this, 81, 9, textureX, textureY); // Box 96
		bodyModel[15] = new ModelRendererTurbo(this, 113, 9, textureX, textureY); // Box 46 wheel
		bodyModel[16] = new ModelRendererTurbo(this, 113, 9, textureX, textureY); // Box 47 wheel
		bodyModel[17] = new ModelRendererTurbo(this, 113, 9, textureX, textureY); // Box 48 wheel
		bodyModel[18] = new ModelRendererTurbo(this, 9, 9, textureX, textureY); // Box 48
		bodyModel[19] = new ModelRendererTurbo(this, 89, 9, textureX, textureY); // Box 87
		bodyModel[20] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 88
		bodyModel[21] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 89
		bodyModel[22] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Box 90
		bodyModel[23] = new ModelRendererTurbo(this, 41, 17, textureX, textureY); // Box 91
		bodyModel[24] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Box 92
		bodyModel[25] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 93
		bodyModel[26] = new ModelRendererTurbo(this, 9, 25, textureX, textureY); // Box 94
		bodyModel[27] = new ModelRendererTurbo(this, 17, 25, textureX, textureY); // Box 95
		bodyModel[28] = new ModelRendererTurbo(this, 73, 17, textureX, textureY); // Box 96
		bodyModel[29] = new ModelRendererTurbo(this, 57, 25, textureX, textureY); // Box 97
		bodyModel[30] = new ModelRendererTurbo(this, 65, 25, textureX, textureY); // Box 98
		bodyModel[31] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 99
		bodyModel[32] = new ModelRendererTurbo(this, 17, 33, textureX, textureY); // Box 100
		bodyModel[33] = new ModelRendererTurbo(this, 89, 17, textureX, textureY); // Box 101
		bodyModel[34] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 102
		bodyModel[35] = new ModelRendererTurbo(this, 33, 33, textureX, textureY); // Box 103
		bodyModel[36] = new ModelRendererTurbo(this, 49, 33, textureX, textureY); // Box 104
		bodyModel[37] = new ModelRendererTurbo(this, 57, 33, textureX, textureY); // Box 105
		bodyModel[38] = new ModelRendererTurbo(this, 65, 33, textureX, textureY); // Box 106
		bodyModel[39] = new ModelRendererTurbo(this, 73, 33, textureX, textureY); // Box 107
		bodyModel[40] = new ModelRendererTurbo(this, 89, 33, textureX, textureY); // Box 108
		bodyModel[41] = new ModelRendererTurbo(this, 97, 33, textureX, textureY); // Box 109
		bodyModel[42] = new ModelRendererTurbo(this, 105, 33, textureX, textureY); // Box 110
		bodyModel[43] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 111
		bodyModel[44] = new ModelRendererTurbo(this, 9, 41, textureX, textureY); // Box 112
		bodyModel[45] = new ModelRendererTurbo(this, 17, 41, textureX, textureY); // Box 113
		bodyModel[46] = new ModelRendererTurbo(this, 33, 41, textureX, textureY); // Box 114
		bodyModel[47] = new ModelRendererTurbo(this, 33, 41, textureX, textureY); // Box 122
		bodyModel[48] = new ModelRendererTurbo(this, 81, 41, textureX, textureY); // Box 124
		bodyModel[49] = new ModelRendererTurbo(this, 97, 41, textureX, textureY); // Box 76
		bodyModel[50] = new ModelRendererTurbo(this, 105, 41, textureX, textureY); // Box 77
		bodyModel[51] = new ModelRendererTurbo(this, 113, 41, textureX, textureY); // Box 82
		bodyModel[52] = new ModelRendererTurbo(this, 121, 41, textureX, textureY); // Box 83
		bodyModel[53] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 84
		bodyModel[54] = new ModelRendererTurbo(this, 9, 49, textureX, textureY); // Box 47
		bodyModel[55] = new ModelRendererTurbo(this, 121, 25, textureX, textureY); // Box 71
		bodyModel[56] = new ModelRendererTurbo(this, 81, 49, textureX, textureY); // Box 73
		bodyModel[57] = new ModelRendererTurbo(this, 97, 49, textureX, textureY); // Box 116
		bodyModel[58] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 91
		bodyModel[59] = new ModelRendererTurbo(this, 105, 49, textureX, textureY); // Box 92
		bodyModel[60] = new ModelRendererTurbo(this, 113, 49, textureX, textureY); // Box 93
		bodyModel[61] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 84
		bodyModel[62] = new ModelRendererTurbo(this, 17, 57, textureX, textureY); // Box 85
		bodyModel[63] = new ModelRendererTurbo(this, 33, 57, textureX, textureY); // Box 125
		bodyModel[64] = new ModelRendererTurbo(this, 49, 57, textureX, textureY); // Box 126

		bodyModel[0].addBox(0F, 0F, 0F, 2, 2, 19, 0F); // Box 4
		bodyModel[0].setRotationPoint(-8F, 6F, -9.5F);

		bodyModel[1].addBox(0F, 0F, 0F, 2, 2, 19, 0F); // Box 5
		bodyModel[1].setRotationPoint(6F, 6F, -9.5F);

		bodyModel[2].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 30 wheel
		bodyModel[2].setRotationPoint(7F, 7F, 6F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 52
		bodyModel[3].setRotationPoint(-8F, 5F, -9F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 53
		bodyModel[4].setRotationPoint(-6F, 6F, -9F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 56
		bodyModel[5].setRotationPoint(5F, 5F, -9F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 57
		bodyModel[6].setRotationPoint(-7.5F, 4F, -8.5F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 59
		bodyModel[7].setRotationPoint(-10F, 5.5F, -8.5F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 60
		bodyModel[8].setRotationPoint(8F, 5.5F, -8.5F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 15, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 65
		bodyModel[9].setRotationPoint(-7.5F, 4.5F, -8.5F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 66
		bodyModel[10].setRotationPoint(-6F, 6.5F, -8.5F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 67
		bodyModel[11].setRotationPoint(4F, 6.5F, -8.5F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 70
		bodyModel[12].setRotationPoint(-4F, 6.5F, -8.5F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 71
		bodyModel[13].setRotationPoint(-1F, 6.5F, -8.5F);

		bodyModel[14].addBox(0F, 0F, 0F, 5, 2, 15, 0F); // Box 96
		bodyModel[14].setRotationPoint(-2.5F, 4.75F, -7.5F);

		bodyModel[15].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 46 wheel
		bodyModel[15].setRotationPoint(-7F, 7F, 6F);

		bodyModel[16].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 47 wheel
		bodyModel[16].setRotationPoint(-7F, 7F, -6F);

		bodyModel[17].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 48 wheel
		bodyModel[17].setRotationPoint(7F, 7F, -6F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 48
		bodyModel[18].setRotationPoint(-6F, 7F, -9F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 87
		bodyModel[19].setRotationPoint(3F, 6.5F, -8.5F);

		bodyModel[20].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 88
		bodyModel[20].setRotationPoint(-10.5F, 4.5F, -8.5F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 89
		bodyModel[21].setRotationPoint(-9.5F, 3.5F, -8.5F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 90
		bodyModel[22].setRotationPoint(7.5F, 3.5F, -8.5F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 91
		bodyModel[23].setRotationPoint(4.5F, 4F, -8.5F);

		bodyModel[24].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 92
		bodyModel[24].setRotationPoint(7.5F, 4.5F, -8.5F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 93
		bodyModel[25].setRotationPoint(5F, 7F, -9F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Box 94
		bodyModel[26].setRotationPoint(5F, 6F, -9F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 15, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 95
		bodyModel[27].setRotationPoint(-7.5F, 4.5F, 7.5F);

		bodyModel[28].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 96
		bodyModel[28].setRotationPoint(-10.5F, 4.5F, 7.5F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 97
		bodyModel[29].setRotationPoint(-10F, 5.5F, 7.5F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 98
		bodyModel[30].setRotationPoint(8F, 5.5F, 7.5F);

		bodyModel[31].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 99
		bodyModel[31].setRotationPoint(7.5F, 4.5F, 7.5F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 100
		bodyModel[32].setRotationPoint(4.5F, 4F, 7.5F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 101
		bodyModel[33].setRotationPoint(7.5F, 3.5F, 7.5F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 102
		bodyModel[34].setRotationPoint(-9.5F, 3.5F, 7.5F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 103
		bodyModel[35].setRotationPoint(-7.5F, 4F, 7.5F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 104
		bodyModel[36].setRotationPoint(-4F, 6.5F, 7.5F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 105
		bodyModel[37].setRotationPoint(-1F, 6.5F, 7.5F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 106
		bodyModel[38].setRotationPoint(3F, 6.5F, 7.5F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 107
		bodyModel[39].setRotationPoint(5F, 5F, 8F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Box 108
		bodyModel[40].setRotationPoint(5F, 6F, 8F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 109
		bodyModel[41].setRotationPoint(5F, 7F, 8F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 10, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 110
		bodyModel[42].setRotationPoint(-5F, 7.5F, 8.5F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 111
		bodyModel[43].setRotationPoint(-6F, 7F, 8F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 112
		bodyModel[44].setRotationPoint(-6F, 6F, 8F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 113
		bodyModel[45].setRotationPoint(-8F, 5F, 8F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 114
		bodyModel[46].setRotationPoint(-8F, 6F, 9F);

		bodyModel[47].addBox(0F, 0F, 0F, 18, 3, 10, 0F); // Box 122
		bodyModel[47].setRotationPoint(-9F, 5.5F, -5F);

		bodyModel[48].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 124
		bodyModel[48].setRotationPoint(-2F, 4.5F, -2F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 76
		bodyModel[49].setRotationPoint(-6F, 6.5F, 7.5F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 77
		bodyModel[50].setRotationPoint(4F, 6.5F, 7.5F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 82
		bodyModel[51].setRotationPoint(6F, 6F, 9F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 83
		bodyModel[52].setRotationPoint(6F, 6F, -10F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 84
		bodyModel[53].setRotationPoint(-8F, 6F, -10F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 10, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 47
		bodyModel[54].setRotationPoint(-5F, 7.5F, -9F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 71
		bodyModel[55].setRotationPoint(-10.5F, 4.5F, -7.5F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 73
		bodyModel[56].setRotationPoint(-10.5F, 5.5F, -5.5F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 116
		bodyModel[57].setRotationPoint(-10.5F, 4.5F, 5.5F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 91
		bodyModel[58].setRotationPoint(9.5F, 5.5F, -5.5F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 92
		bodyModel[59].setRotationPoint(9.5F, 4.5F, -7.5F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 93
		bodyModel[60].setRotationPoint(9.5F, 4.5F, 5.5F);

		bodyModel[61].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 84
		bodyModel[61].setRotationPoint(-1.5F, 4F, -8.25F);

		bodyModel[62].addBox(0F, 0F, 0F, 6, 1, 0, 0F); // Box 85
		bodyModel[62].setRotationPoint(-3F, 4.5F, -7.75F);

		bodyModel[63].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 125
		bodyModel[63].setRotationPoint(-1.5F, 4F, 7.25F);

		bodyModel[64].addBox(0F, 0F, 0F, 6, 1, 0, 0F); // Box 126
		bodyModel[64].setRotationPoint(-3F, 4.5F, 7.75F);
	}
}