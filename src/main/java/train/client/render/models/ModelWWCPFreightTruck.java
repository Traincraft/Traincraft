//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2021 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 15.06.2020 - 09:17:36
// Last changed on: 15.06.2020 - 09:17:36

package train.client.render.models; //Path where the model is located

import tmt.ModelConverter;
import tmt.ModelRendererTurbo;

public class ModelWWCPFreightTruck extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelWWCPFreightTruck() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[69];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 1
		bodyModel[2] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 2
		bodyModel[3] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 1
		bodyModel[4] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 2
		bodyModel[5] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 6
		bodyModel[6] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 21
		bodyModel[7] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 22
		bodyModel[8] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 23
		bodyModel[9] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 28
		bodyModel[10] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 8
		bodyModel[11] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 144
		bodyModel[12] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 6
		bodyModel[13] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 144
		bodyModel[14] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 144
		bodyModel[15] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 25
		bodyModel[16] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 10
		bodyModel[17] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 10
		bodyModel[18] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 18
		bodyModel[19] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 14
		bodyModel[20] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 25
		bodyModel[21] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 61
		bodyModel[22] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 104
		bodyModel[23] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 63
		bodyModel[24] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 64
		bodyModel[25] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 65
		bodyModel[26] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 66
		bodyModel[27] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 67
		bodyModel[28] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 68
		bodyModel[29] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 69
		bodyModel[30] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 70
		bodyModel[31] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 71
		bodyModel[32] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 72
		bodyModel[33] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 73
		bodyModel[34] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 74
		bodyModel[35] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 75
		bodyModel[36] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 76
		bodyModel[37] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 77
		bodyModel[38] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 78
		bodyModel[39] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 79
		bodyModel[40] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 80
		bodyModel[41] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 81
		bodyModel[42] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 82
		bodyModel[43] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 83
		bodyModel[44] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 84
		bodyModel[45] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 85
		bodyModel[46] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 86
		bodyModel[47] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 87
		bodyModel[48] = new ModelRendererTurbo(this, 9, 9, textureX, textureY); // Box 88
		bodyModel[49] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 89
		bodyModel[50] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Box 90
		bodyModel[51] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 91
		bodyModel[52] = new ModelRendererTurbo(this, 65, 9, textureX, textureY); // Box 92
		bodyModel[53] = new ModelRendererTurbo(this, 81, 9, textureX, textureY); // Box 93
		bodyModel[54] = new ModelRendererTurbo(this, 89, 9, textureX, textureY); // Box 94
		bodyModel[55] = new ModelRendererTurbo(this, 97, 9, textureX, textureY); // Box 95
		bodyModel[56] = new ModelRendererTurbo(this, 129, 9, textureX, textureY); // Box 96
		bodyModel[57] = new ModelRendererTurbo(this, 161, 9, textureX, textureY); // Box 97
		bodyModel[58] = new ModelRendererTurbo(this, 177, 9, textureX, textureY); // Box 98
		bodyModel[59] = new ModelRendererTurbo(this, 185, 9, textureX, textureY); // Box 99
		bodyModel[60] = new ModelRendererTurbo(this, 209, 9, textureX, textureY); // Box 100
		bodyModel[61] = new ModelRendererTurbo(this, 217, 9, textureX, textureY); // Box 101
		bodyModel[62] = new ModelRendererTurbo(this, 225, 9, textureX, textureY); // Box 102
		bodyModel[63] = new ModelRendererTurbo(this, 233, 9, textureX, textureY); // Box 103
		bodyModel[64] = new ModelRendererTurbo(this, 241, 9, textureX, textureY); // Box 104
		bodyModel[65] = new ModelRendererTurbo(this, 249, 9, textureX, textureY); // Box 105
		bodyModel[66] = new ModelRendererTurbo(this, 257, 9, textureX, textureY); // Box 106
		bodyModel[67] = new ModelRendererTurbo(this, 273, 9, textureX, textureY); // Box 107
		bodyModel[68] = new ModelRendererTurbo(this, 281, 9, textureX, textureY); // Box 108

		bodyModel[0].addBox(0F, 0F, 0F, 2, 2, 16, 0F); // Box 0
		bodyModel[0].setRotationPoint(-6F, 6F, -8F);

		bodyModel[1].addBox(0F, 0F, 0F, 6, 6, 0, 0F); // Box 1
		bodyModel[1].setRotationPoint(-8F, 4F, -6F);

		bodyModel[2].addBox(0F, 0F, 0F, 6, 6, 0, 0F); // Box 2
		bodyModel[2].setRotationPoint(-8F, 4F, 6F);

		bodyModel[3].addBox(0F, 0F, 0F, 6, 6, 0, 0F); // Box 1
		bodyModel[3].setRotationPoint(3F, 4F, -6F);

		bodyModel[4].addBox(0F, 0F, 0F, 6, 6, 0, 0F); // Box 2
		bodyModel[4].setRotationPoint(3F, 4F, 6F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 3, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[5].setRotationPoint(-1F, 8F, -8F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 21
		bodyModel[6].setRotationPoint(-1F, 4.5F, 4F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		bodyModel[7].setRotationPoint(-1F, 4.5F, -7F);

		bodyModel[8].addBox(0F, 0F, 0F, 3, 2, 8, 0F); // Box 23
		bodyModel[8].setRotationPoint(-1F, 4.5F, -4F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 28
		bodyModel[9].setRotationPoint(-1F, 3.5F, -1.5F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		bodyModel[10].setRotationPoint(-5F, 4F, -8F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 1, 7, 2, 0F,0F, -1F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -1F, 0F, 0F, -4.5F, 0F, 0F, -4.25F, 0F, 0F, -4.25F, 0F, 0F, -4.5F, 0F); // Box 144
		bodyModel[11].setRotationPoint(-1F, 5.25F, -8.5F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 6
		bodyModel[12].setRotationPoint(-1F, 5F, -8F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 1, 7, 2, 0F,0F, -1F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -1F, 0F, 0F, -4.5F, 0F, 0F, -4.25F, 0F, 0F, -4.25F, 0F, 0F, -4.5F, 0F); // Box 144
		bodyModel[13].setRotationPoint(0F, 5.25F, -8.5F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 1, 7, 2, 0F,0F, -1F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -1F, 0F, 0F, -4.5F, 0F, 0F, -4.25F, 0F, 0F, -4.25F, 0F, 0F, -4.5F, 0F); // Box 144
		bodyModel[14].setRotationPoint(1F, 5.25F, -8.5F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Box 25
		bodyModel[15].setRotationPoint(-2F, 5F, -8F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Box 10
		bodyModel[16].setRotationPoint(-8F, 4.5F, -8F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -1F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, -1F, -0.7F, 0F); // Box 10
		bodyModel[17].setRotationPoint(-8F, 5F, -8F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 18
		bodyModel[18].setRotationPoint(-4F, 6F, -8F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -1F, 0F); // Box 14
		bodyModel[19].setRotationPoint(-4F, 6F, -8F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.5F, 0F); // Box 25
		bodyModel[20].setRotationPoint(-2F, 7F, -8F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 61
		bodyModel[21].setRotationPoint(-7F, 4F, -8F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 104
		bodyModel[22].setRotationPoint(-6F, 6F, -8.5F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 63
		bodyModel[23].setRotationPoint(-6F, 5F, -8F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 64
		bodyModel[24].setRotationPoint(6F, 4F, -8F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 65
		bodyModel[25].setRotationPoint(8F, 4.5F, -8F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, -1F, -0.7F, 0F, -1F, -0.7F, 0F, 0F, -0.7F, 0F); // Box 66
		bodyModel[26].setRotationPoint(7F, 5F, -8F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 67
		bodyModel[27].setRotationPoint(5F, 5F, -8F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 68
		bodyModel[28].setRotationPoint(-4F, 5F, -8F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F); // Box 69
		bodyModel[29].setRotationPoint(3F, 5F, -8F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 70
		bodyModel[30].setRotationPoint(-2F, 5F, -8F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 71
		bodyModel[31].setRotationPoint(-1F, 5.5F, -8F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 72
		bodyModel[32].setRotationPoint(-1F, 8F, -9F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 73
		bodyModel[33].setRotationPoint(2F, 5F, -8F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F); // Box 74
		bodyModel[34].setRotationPoint(2F, 5F, -8F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, 0F, 0F); // Box 75
		bodyModel[35].setRotationPoint(2F, 7F, -8F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F); // Box 76
		bodyModel[36].setRotationPoint(2F, 6F, -8F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, -0.35F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.35F, 0F); // Box 77
		bodyModel[37].setRotationPoint(4F, 6F, -8F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 78
		bodyModel[38].setRotationPoint(5F, 6F, -8.5F);

		bodyModel[39].addBox(0F, 0F, 0F, 2, 2, 16, 0F); // Box 79
		bodyModel[39].setRotationPoint(5F, 6F, -8F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F); // Box 80
		bodyModel[40].setRotationPoint(-1F, 5.5F, 7F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 81
		bodyModel[41].setRotationPoint(-1F, 5F, 7F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Box 82
		bodyModel[42].setRotationPoint(-2F, 5F, 7F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 83
		bodyModel[43].setRotationPoint(-2F, 5F, 7F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 84
		bodyModel[44].setRotationPoint(-4F, 5F, 7F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 85
		bodyModel[45].setRotationPoint(2F, 5F, 7F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F); // Box 86
		bodyModel[46].setRotationPoint(2F, 5F, 7F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F); // Box 87
		bodyModel[47].setRotationPoint(3F, 5F, 7F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, -0.35F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.35F, 0F); // Box 88
		bodyModel[48].setRotationPoint(4F, 6F, 7F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F); // Box 89
		bodyModel[49].setRotationPoint(2F, 6F, 7F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, 0F, 0F); // Box 90
		bodyModel[50].setRotationPoint(2F, 7F, 7F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 91
		bodyModel[51].setRotationPoint(-4F, 6F, 7F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -1F, 0F); // Box 92
		bodyModel[52].setRotationPoint(-4F, 6F, 7F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -1F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, -1F, -0.7F, 0F); // Box 93
		bodyModel[53].setRotationPoint(-8F, 5F, 7F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Box 94
		bodyModel[54].setRotationPoint(-8F, 4.5F, 7F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 95
		bodyModel[55].setRotationPoint(-7F, 4F, 7F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 96
		bodyModel[56].setRotationPoint(-5F, 4F, 7F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 97
		bodyModel[57].setRotationPoint(-6F, 5F, 7F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 98
		bodyModel[58].setRotationPoint(6F, 4F, 7F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 99
		bodyModel[59].setRotationPoint(5F, 5F, 7F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, -1F, -0.7F, 0F, -1F, -0.7F, 0F, 0F, -0.7F, 0F); // Box 100
		bodyModel[60].setRotationPoint(7F, 5F, 7F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 101
		bodyModel[61].setRotationPoint(8F, 4.5F, 7F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.5F, 0F); // Box 102
		bodyModel[62].setRotationPoint(-2F, 7F, 7F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 1, 7, 2, 0F,0F, -1F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -1F, 0F, 0F, -4.5F, 0F, 0F, -4.25F, 0F, 0F, -4.25F, 0F, 0F, -4.5F, 0F); // Box 103
		bodyModel[63].setRotationPoint(0F, 5.25F, 6.5F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 1, 7, 2, 0F,0F, -1F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -1F, 0F, 0F, -4.5F, 0F, 0F, -4.25F, 0F, 0F, -4.25F, 0F, 0F, -4.5F, 0F); // Box 104
		bodyModel[64].setRotationPoint(1F, 5.25F, 6.5F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 1, 7, 2, 0F,0F, -1F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -1F, 0F, 0F, -4.5F, 0F, 0F, -4.25F, 0F, 0F, -4.25F, 0F, 0F, -4.5F, 0F); // Box 105
		bodyModel[65].setRotationPoint(-1F, 5.25F, 6.5F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -1F, 0F, -0.25F, -1F); // Box 106
		bodyModel[66].setRotationPoint(-1F, 8F, 8F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 107
		bodyModel[67].setRotationPoint(-6F, 6F, 7.5F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 108
		bodyModel[68].setRotationPoint(5F, 6F, 7.5F);
	}
}