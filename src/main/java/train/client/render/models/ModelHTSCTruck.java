//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 06.08.2020 - 08:19:24
// Last changed on: 06.08.2020 - 08:19:24

package train.client.render.models; //Path where the model is located


import tmt.ModelConverter;
import tmt.ModelRendererTurbo;

public class ModelHTSCTruck extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelHTSCTruck() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[87];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 1
		bodyModel[2] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 4
		bodyModel[3] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 3
		bodyModel[4] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 4
		bodyModel[5] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 5
		bodyModel[6] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 9
		bodyModel[7] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 10
		bodyModel[8] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 11
		bodyModel[9] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 173
		bodyModel[10] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 22
		bodyModel[11] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 23
		bodyModel[12] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 68
		bodyModel[13] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 69
		bodyModel[14] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 70
		bodyModel[15] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 124
		bodyModel[16] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 151
		bodyModel[17] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 152
		bodyModel[18] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 153
		bodyModel[19] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 154
		bodyModel[20] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 155
		bodyModel[21] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 24
		bodyModel[22] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 26
		bodyModel[23] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 27
		bodyModel[24] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 28
		bodyModel[25] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 29
		bodyModel[26] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 30
		bodyModel[27] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 27
		bodyModel[28] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 29
		bodyModel[29] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 30
		bodyModel[30] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 31
		bodyModel[31] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 32
		bodyModel[32] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 33
		bodyModel[33] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 142
		bodyModel[34] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 145
		bodyModel[35] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 146
		bodyModel[36] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 40
		bodyModel[37] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 41
		bodyModel[38] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 136
		bodyModel[39] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 140
		bodyModel[40] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 141
		bodyModel[41] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 45
		bodyModel[42] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 46
		bodyModel[43] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 47
		bodyModel[44] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 48
		bodyModel[45] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 50
		bodyModel[46] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 147
		bodyModel[47] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 52
		bodyModel[48] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 53
		bodyModel[49] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 159
		bodyModel[50] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 55
		bodyModel[51] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 56
		bodyModel[52] = new ModelRendererTurbo(this, 185, 9, textureX, textureY); // Box 51
		bodyModel[53] = new ModelRendererTurbo(this, 233, 9, textureX, textureY); // Box 52
		bodyModel[54] = new ModelRendererTurbo(this, 273, 9, textureX, textureY); // Box 53
		bodyModel[55] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Box 61
		bodyModel[56] = new ModelRendererTurbo(this, 65, 9, textureX, textureY); // Box 62
		bodyModel[57] = new ModelRendererTurbo(this, 89, 9, textureX, textureY); // Box 63
		bodyModel[58] = new ModelRendererTurbo(this, 113, 9, textureX, textureY); // Box 64
		bodyModel[59] = new ModelRendererTurbo(this, 137, 9, textureX, textureY); // Box 65
		bodyModel[60] = new ModelRendererTurbo(this, 145, 9, textureX, textureY); // Box 66
		bodyModel[61] = new ModelRendererTurbo(this, 9, 9, textureX, textureY); // Box 67
		bodyModel[62] = new ModelRendererTurbo(this, 161, 9, textureX, textureY); // Box 68
		bodyModel[63] = new ModelRendererTurbo(this, 217, 9, textureX, textureY); // Box 69
		bodyModel[64] = new ModelRendererTurbo(this, 225, 9, textureX, textureY); // Box 70
		bodyModel[65] = new ModelRendererTurbo(this, 233, 9, textureX, textureY); // Box 71
		bodyModel[66] = new ModelRendererTurbo(this, 265, 9, textureX, textureY); // Box 72
		bodyModel[67] = new ModelRendererTurbo(this, 273, 9, textureX, textureY); // Box 73
		bodyModel[68] = new ModelRendererTurbo(this, 297, 9, textureX, textureY); // Box 74
		bodyModel[69] = new ModelRendererTurbo(this, 305, 9, textureX, textureY); // Box 75
		bodyModel[70] = new ModelRendererTurbo(this, 313, 9, textureX, textureY); // Box 76
		bodyModel[71] = new ModelRendererTurbo(this, 321, 9, textureX, textureY); // Box 77
		bodyModel[72] = new ModelRendererTurbo(this, 329, 9, textureX, textureY); // Box 78
		bodyModel[73] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Box 79
		bodyModel[74] = new ModelRendererTurbo(this, 105, 9, textureX, textureY); // Box 80
		bodyModel[75] = new ModelRendererTurbo(this, 345, 9, textureX, textureY); // Box 81
		bodyModel[76] = new ModelRendererTurbo(this, 361, 9, textureX, textureY); // Box 82
		bodyModel[77] = new ModelRendererTurbo(this, 369, 9, textureX, textureY); // Box 83
		bodyModel[78] = new ModelRendererTurbo(this, 377, 9, textureX, textureY); // Box 84
		bodyModel[79] = new ModelRendererTurbo(this, 169, 9, textureX, textureY); // Box 85
		bodyModel[80] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 86
		bodyModel[81] = new ModelRendererTurbo(this, 185, 9, textureX, textureY); // Box 87
		bodyModel[82] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 88
		bodyModel[83] = new ModelRendererTurbo(this, 385, 9, textureX, textureY); // Box 89
		bodyModel[84] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 84
		bodyModel[85] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 85
		bodyModel[86] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 86

		bodyModel[0].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 0
		bodyModel[0].setRotationPoint(-11F, 7F, -6F);

		bodyModel[1].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 1
		bodyModel[1].setRotationPoint(-1.5F, 7F, -6F);

		bodyModel[2].addBox(0F, 0F, 0F, 2, 2, 18, 0F); // Box 4
		bodyModel[2].setRotationPoint(-12F, 6F, -9F);

		bodyModel[3].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 3
		bodyModel[3].setRotationPoint(-11F, 7F, 6F);

		bodyModel[4].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 4
		bodyModel[4].setRotationPoint(-1.5F, 7F, 6F);

		bodyModel[5].addBox(0F, 0F, 0F, 2, 2, 18, 0F); // Box 5
		bodyModel[5].setRotationPoint(-2.5F, 6F, -9F);

		bodyModel[6].addBox(0F, 0F, 0F, 2, 2, 18, 0F); // Box 9
		bodyModel[6].setRotationPoint(7F, 6F, -9F);

		bodyModel[7].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 10
		bodyModel[7].setRotationPoint(8F, 7F, -6F);

		bodyModel[8].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 11
		bodyModel[8].setRotationPoint(8F, 7F, 6F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 173
		bodyModel[9].setRotationPoint(-12F, 6F, -9.5F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 22
		bodyModel[10].setRotationPoint(-2.5F, 6F, -9.5F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 23
		bodyModel[11].setRotationPoint(7F, 6F, -9.5F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 68
		bodyModel[12].setRotationPoint(-2.5F, 6F, 8.5F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 69
		bodyModel[13].setRotationPoint(-12F, 6F, 8.5F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 70
		bodyModel[14].setRotationPoint(7F, 6F, 8.5F);

		bodyModel[15].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 124
		bodyModel[15].setRotationPoint(10F, 4F, -9F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 151
		bodyModel[16].setRotationPoint(12F, 4F, -9F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 152
		bodyModel[17].setRotationPoint(12F, 4F, 7F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 153
		bodyModel[18].setRotationPoint(12F, 4F, -7F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 154
		bodyModel[19].setRotationPoint(12F, 4F, 5F);

		bodyModel[20].addBox(0F, 0F, 0F, 1, 2, 10, 0F); // Box 155
		bodyModel[20].setRotationPoint(12F, 5F, -5F);

		bodyModel[21].addBox(0F, 0F, 0F, 4, 2, 2, 0F); // Box 24
		bodyModel[21].setRotationPoint(6F, 3.5F, -9F);

		bodyModel[22].addBox(0F, 0F, 0F, 6, 2, 2, 0F); // Box 26
		bodyModel[22].setRotationPoint(0F, 4F, -9F);

		bodyModel[23].addBox(0F, 0F, 0F, 3, 2, 2, 0F); // Box 27
		bodyModel[23].setRotationPoint(-3F, 3.5F, -9F);

		bodyModel[24].addBox(0F, 0F, 0F, 6, 2, 2, 0F); // Box 28
		bodyModel[24].setRotationPoint(-9F, 4F, -9F);

		bodyModel[25].addBox(0F, 0F, 0F, 4, 2, 2, 0F); // Box 29
		bodyModel[25].setRotationPoint(-13F, 3.5F, -9F);

		bodyModel[26].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 30
		bodyModel[26].setRotationPoint(-14F, 4F, -9F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 27
		bodyModel[27].setRotationPoint(-14F, 5F, -9F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 29
		bodyModel[28].setRotationPoint(-10F, 5F, -9F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 30
		bodyModel[29].setRotationPoint(-0.5F, 5F, -9F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 31
		bodyModel[30].setRotationPoint(-4.5F, 5F, -9F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 32
		bodyModel[31].setRotationPoint(5F, 5F, -9F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 33
		bodyModel[32].setRotationPoint(9F, 5F, -9F);

		bodyModel[33].addBox(0F, 0F, 0F, 4, 0, 1, 0F); // Box 142
		bodyModel[33].setRotationPoint(-13F, 8.01F, -8.5F);

		bodyModel[34].addBox(0F, 0F, 0F, 4, 0, 1, 0F); // Box 145
		bodyModel[34].setRotationPoint(-3.5F, 8.01F, -8.5F);

		bodyModel[35].addBox(0F, 0F, 0F, 4, 0, 1, 0F); // Box 146
		bodyModel[35].setRotationPoint(6F, 8.01F, -8.5F);

		bodyModel[36].addBox(0F, 0F, 0F, 3, 2, 1, 0F); // Box 40
		bodyModel[36].setRotationPoint(1.75F, 6F, -8F);

		bodyModel[37].addBox(0F, 0F, 0F, 3, 2, 1, 0F); // Box 41
		bodyModel[37].setRotationPoint(-7.75F, 6F, -8F);

		bodyModel[38].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 136
		bodyModel[38].setRotationPoint(-12F, 3.5F, -10F);

		bodyModel[39].addBox(0F, 0F, 0F, 2, 0, 1, 0F); // Box 140
		bodyModel[39].setRotationPoint(-10F, 3.95F, -10F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 1, 0, 2, 0F,0F, 0F, -1F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 141
		bodyModel[40].setRotationPoint(-8F, 3.95F, -10F);

		bodyModel[41].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 45
		bodyModel[41].setRotationPoint(-2.5F, 3.5F, -10F);

		bodyModel[42].addBox(0F, 0F, 0F, 2, 0, 1, 0F); // Box 46
		bodyModel[42].setRotationPoint(-0.5F, 3.95F, -10F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 1, 0, 2, 0F,0F, 0F, -1F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 47
		bodyModel[43].setRotationPoint(1.5F, 3.95F, -10F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 48
		bodyModel[44].setRotationPoint(2F, 3F, -9F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 50
		bodyModel[45].setRotationPoint(-7F, 3F, -9F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 147
		bodyModel[46].setRotationPoint(-12F, 5F, -8.5F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 52
		bodyModel[47].setRotationPoint(7F, 5F, -8.5F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 53
		bodyModel[48].setRotationPoint(-2.5F, 5F, -8.5F);

		bodyModel[49].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 159
		bodyModel[49].setRotationPoint(-8.25F, 8F, -8.01F);

		bodyModel[50].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 55
		bodyModel[50].setRotationPoint(1.25F, 8F, -8.01F);

		bodyModel[51].addBox(0F, 0F, 0F, 1, 3, 0, 0F); // Box 56
		bodyModel[51].setRotationPoint(-3F, 4.5F, -9.01F);
		bodyModel[51].rotateAngleX = -0.15707963F;

		bodyModel[52].addBox(0F, 0F, 0F, 10, 4, 10, 0F); // Box 51
		bodyModel[52].setRotationPoint(-13F, 4F, -5F);

		bodyModel[53].addBox(0F, 0F, 0F, 8, 4, 10, 0F); // Box 52
		bodyModel[53].setRotationPoint(3F, 4F, -5F);

		bodyModel[54].addBox(0F, 0F, 0F, 6, 5, 10, 0F); // Box 53
		bodyModel[54].setRotationPoint(-3F, 3F, -5F);

		bodyModel[55].addBox(0F, 0F, 0F, 6, 2, 2, 0F); // Box 61
		bodyModel[55].setRotationPoint(0F, 4F, 7F);

		bodyModel[56].addBox(0F, 0F, 0F, 3, 2, 2, 0F); // Box 62
		bodyModel[56].setRotationPoint(-3F, 3.5F, 7F);

		bodyModel[57].addBox(0F, 0F, 0F, 6, 2, 2, 0F); // Box 63
		bodyModel[57].setRotationPoint(-9F, 4F, 7F);

		bodyModel[58].addBox(0F, 0F, 0F, 4, 2, 2, 0F); // Box 64
		bodyModel[58].setRotationPoint(-13F, 3.5F, 7F);

		bodyModel[59].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 65
		bodyModel[59].setRotationPoint(-14F, 4F, 8F);

		bodyModel[60].addBox(0F, 0F, 0F, 4, 2, 2, 0F); // Box 66
		bodyModel[60].setRotationPoint(6F, 3.5F, 7F);

		bodyModel[61].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 67
		bodyModel[61].setRotationPoint(10F, 4F, 7F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 68
		bodyModel[62].setRotationPoint(-0.5F, 5F, 8F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 69
		bodyModel[63].setRotationPoint(-2.5F, 5F, 7.5F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F); // Box 70
		bodyModel[64].setRotationPoint(-4.5F, 5F, 8F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 71
		bodyModel[65].setRotationPoint(-10F, 5F, 8F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 72
		bodyModel[66].setRotationPoint(-12F, 5F, 7.5F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F); // Box 73
		bodyModel[67].setRotationPoint(-14F, 5F, 8F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F); // Box 74
		bodyModel[68].setRotationPoint(5F, 5F, 8F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 75
		bodyModel[69].setRotationPoint(7F, 5F, 7.5F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 76
		bodyModel[70].setRotationPoint(9F, 5F, 8F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 77
		bodyModel[71].setRotationPoint(2F, 3F, 8F);

		bodyModel[72].addBox(0F, 0F, 0F, 3, 2, 1, 0F); // Box 78
		bodyModel[72].setRotationPoint(1.75F, 6F, 7F);

		bodyModel[73].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 79
		bodyModel[73].setRotationPoint(1.25F, 8F, 8.01F);

		bodyModel[74].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 80
		bodyModel[74].setRotationPoint(-8.25F, 8F, 8.01F);

		bodyModel[75].addBox(0F, 0F, 0F, 3, 2, 1, 0F); // Box 81
		bodyModel[75].setRotationPoint(-7.75F, 6F, 7F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 82
		bodyModel[76].setRotationPoint(-7F, 3F, 8F);

		bodyModel[77].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 83
		bodyModel[77].setRotationPoint(-2.5F, 3.5F, 9F);

		bodyModel[78].addBox(0F, 0F, 0F, 1, 3, 0, 0F); // Box 84
		bodyModel[78].setRotationPoint(-3F, 4.5F, 9.01F);
		bodyModel[78].rotateAngleX = 0.15707963F;

		bodyModel[79].addBox(0F, 0F, 0F, 2, 0, 1, 0F); // Box 85
		bodyModel[79].setRotationPoint(-0.5F, 3.95F, 9F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 1, 0, 2, 0F,-1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F); // Box 86
		bodyModel[80].setRotationPoint(1.5F, 3.95F, 8F);

		bodyModel[81].addBox(0F, 0F, 0F, 2, 0, 1, 0F); // Box 87
		bodyModel[81].setRotationPoint(-10F, 3.95F, 9F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 1, 0, 2, 0F,-1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F); // Box 88
		bodyModel[82].setRotationPoint(-8F, 3.95F, 8F);

		bodyModel[83].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 89
		bodyModel[83].setRotationPoint(-12F, 3.5F, 9F);

		bodyModel[84].addBox(0F, 0F, 0F, 4, 0, 1, 0F); // Box 84
		bodyModel[84].setRotationPoint(-13F, 8.01F, 7.5F);

		bodyModel[85].addBox(0F, 0F, 0F, 4, 0, 1, 0F); // Box 85
		bodyModel[85].setRotationPoint(-3.5F, 8.01F, 7.5F);

		bodyModel[86].addBox(0F, 0F, 0F, 4, 0, 1, 0F); // Box 86
		bodyModel[86].setRotationPoint(6F, 8.01F, 7.5F);
	}
}