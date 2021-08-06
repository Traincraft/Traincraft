//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 05.06.2020 - 23:19:45
// Last changed on: 05.06.2020 - 23:19:45

package train.client.render.models; //Path where the model is located


import tmt.ModelConverter;
import tmt.ModelRendererTurbo;

public class ModelFlexicoil_C1 extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelFlexicoil_C1() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[94];

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
		bodyModel[9] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 27
		bodyModel[10] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 29
		bodyModel[11] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 30
		bodyModel[12] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 31
		bodyModel[13] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 32
		bodyModel[14] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 33
		bodyModel[15] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 173
		bodyModel[16] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 22
		bodyModel[17] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 23
		bodyModel[18] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 66
		bodyModel[19] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 95
		bodyModel[20] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 66
		bodyModel[21] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 95
		bodyModel[22] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 23
		bodyModel[23] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 24
		bodyModel[24] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 25
		bodyModel[25] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 26
		bodyModel[26] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 27
		bodyModel[27] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 28
		bodyModel[28] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 29
		bodyModel[29] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 30
		bodyModel[30] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 31
		bodyModel[31] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 32
		bodyModel[32] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 33
		bodyModel[33] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 34
		bodyModel[34] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 35
		bodyModel[35] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 36
		bodyModel[36] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 37
		bodyModel[37] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 38
		bodyModel[38] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 69
		bodyModel[39] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 147
		bodyModel[40] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 151
		bodyModel[41] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 152
		bodyModel[42] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 43
		bodyModel[43] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 44
		bodyModel[44] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 45
		bodyModel[45] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 46
		bodyModel[46] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 47
		bodyModel[47] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 48
		bodyModel[48] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 49
		bodyModel[49] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 50
		bodyModel[50] = new ModelRendererTurbo(this, 161, 9, textureX, textureY); // Box 51
		bodyModel[51] = new ModelRendererTurbo(this, 201, 9, textureX, textureY); // Box 52
		bodyModel[52] = new ModelRendererTurbo(this, 241, 9, textureX, textureY); // Box 53
		bodyModel[53] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Box 54
		bodyModel[54] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Box 55
		bodyModel[55] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 56
		bodyModel[56] = new ModelRendererTurbo(this, 73, 9, textureX, textureY); // Box 57
		bodyModel[57] = new ModelRendererTurbo(this, 89, 9, textureX, textureY); // Box 58
		bodyModel[58] = new ModelRendererTurbo(this, 97, 9, textureX, textureY); // Box 59
		bodyModel[59] = new ModelRendererTurbo(this, 113, 9, textureX, textureY); // Box 60
		bodyModel[60] = new ModelRendererTurbo(this, 137, 9, textureX, textureY); // Box 61
		bodyModel[61] = new ModelRendererTurbo(this, 145, 9, textureX, textureY); // Box 62
		bodyModel[62] = new ModelRendererTurbo(this, 153, 9, textureX, textureY); // Box 63
		bodyModel[63] = new ModelRendererTurbo(this, 161, 9, textureX, textureY); // Box 64
		bodyModel[64] = new ModelRendererTurbo(this, 193, 9, textureX, textureY); // Box 65
		bodyModel[65] = new ModelRendererTurbo(this, 201, 9, textureX, textureY); // Box 66
		bodyModel[66] = new ModelRendererTurbo(this, 233, 9, textureX, textureY); // Box 67
		bodyModel[67] = new ModelRendererTurbo(this, 241, 9, textureX, textureY); // Box 68
		bodyModel[68] = new ModelRendererTurbo(this, 265, 9, textureX, textureY); // Box 69
		bodyModel[69] = new ModelRendererTurbo(this, 273, 9, textureX, textureY); // Box 70
		bodyModel[70] = new ModelRendererTurbo(this, 281, 9, textureX, textureY); // Box 71
		bodyModel[71] = new ModelRendererTurbo(this, 289, 9, textureX, textureY); // Box 72
		bodyModel[72] = new ModelRendererTurbo(this, 297, 9, textureX, textureY); // Box 73
		bodyModel[73] = new ModelRendererTurbo(this, 305, 9, textureX, textureY); // Box 74
		bodyModel[74] = new ModelRendererTurbo(this, 313, 9, textureX, textureY); // Box 75
		bodyModel[75] = new ModelRendererTurbo(this, 321, 9, textureX, textureY); // Box 76
		bodyModel[76] = new ModelRendererTurbo(this, 329, 9, textureX, textureY); // Box 77
		bodyModel[77] = new ModelRendererTurbo(this, 337, 9, textureX, textureY); // Box 78
		bodyModel[78] = new ModelRendererTurbo(this, 345, 9, textureX, textureY); // Box 79
		bodyModel[79] = new ModelRendererTurbo(this, 353, 9, textureX, textureY); // Box 80
		bodyModel[80] = new ModelRendererTurbo(this, 361, 9, textureX, textureY); // Box 81
		bodyModel[81] = new ModelRendererTurbo(this, 369, 9, textureX, textureY); // Box 82
		bodyModel[82] = new ModelRendererTurbo(this, 377, 9, textureX, textureY); // Box 83
		bodyModel[83] = new ModelRendererTurbo(this, 393, 9, textureX, textureY); // Box 84
		bodyModel[84] = new ModelRendererTurbo(this, 409, 9, textureX, textureY); // Box 85
		bodyModel[85] = new ModelRendererTurbo(this, 417, 9, textureX, textureY); // Box 86
		bodyModel[86] = new ModelRendererTurbo(this, 425, 9, textureX, textureY); // Box 87
		bodyModel[87] = new ModelRendererTurbo(this, 433, 9, textureX, textureY); // Box 88
		bodyModel[88] = new ModelRendererTurbo(this, 441, 9, textureX, textureY); // Box 89
		bodyModel[89] = new ModelRendererTurbo(this, 449, 9, textureX, textureY); // Box 90
		bodyModel[90] = new ModelRendererTurbo(this, 457, 9, textureX, textureY); // Box 91
		bodyModel[91] = new ModelRendererTurbo(this, 465, 9, textureX, textureY); // Box 92
		bodyModel[92] = new ModelRendererTurbo(this, 473, 9, textureX, textureY); // Box 93
		bodyModel[93] = new ModelRendererTurbo(this, 265, 17, textureX, textureY); // Box 94

		bodyModel[0].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 0
		bodyModel[0].setRotationPoint(-8F, 6.5F, -6F);

		bodyModel[1].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 1
		bodyModel[1].setRotationPoint(1F, 6.5F, -6F);

		bodyModel[2].addBox(0F, 0F, 0F, 2, 2, 18, 0F); // Box 4
		bodyModel[2].setRotationPoint(-9F, 5.5F, -9F);

		bodyModel[3].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 3
		bodyModel[3].setRotationPoint(-8F, 6.5F, 6F);

		bodyModel[4].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 4
		bodyModel[4].setRotationPoint(1F, 6.5F, 6F);

		bodyModel[5].addBox(0F, 0F, 0F, 2, 2, 18, 0F); // Box 5
		bodyModel[5].setRotationPoint(0F, 5.5F, -9F);

		bodyModel[6].addBox(0F, 0F, 0F, 2, 2, 18, 0F); // Box 9
		bodyModel[6].setRotationPoint(9F, 5.5F, -9F);

		bodyModel[7].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 10
		bodyModel[7].setRotationPoint(10F, 6.5F, -6F);

		bodyModel[8].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 11
		bodyModel[8].setRotationPoint(10F, 6.5F, 6F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 27
		bodyModel[9].setRotationPoint(-11F, 5F, -9F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 29
		bodyModel[10].setRotationPoint(-7F, 5F, -9F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 30
		bodyModel[11].setRotationPoint(2F, 5F, -9F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 31
		bodyModel[12].setRotationPoint(-2F, 5F, -9F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 32
		bodyModel[13].setRotationPoint(7F, 5F, -9F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 33
		bodyModel[14].setRotationPoint(11F, 5F, -9F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 173
		bodyModel[15].setRotationPoint(-9F, 5.5F, -9.5F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 22
		bodyModel[16].setRotationPoint(0F, 5.5F, -9.5F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 23
		bodyModel[17].setRotationPoint(9F, 5.5F, -9.5F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 66
		bodyModel[18].setRotationPoint(-11.5F, 4.5F, -8F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F); // Box 95
		bodyModel[19].setRotationPoint(-11.5F, 6.5F, -8F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 66
		bodyModel[20].setRotationPoint(-5.5F, 3.5F, -8F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 95
		bodyModel[21].setRotationPoint(-5.5F, 6.5F, -8F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 23
		bodyModel[22].setRotationPoint(-2.5F, 3.5F, -8F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F); // Box 24
		bodyModel[23].setRotationPoint(-2.5F, 6.5F, -8F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 25
		bodyModel[24].setRotationPoint(3.5F, 3.5F, -8F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 26
		bodyModel[25].setRotationPoint(3.5F, 6.5F, -8F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 27
		bodyModel[26].setRotationPoint(6.5F, 3.5F, -8F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F); // Box 28
		bodyModel[27].setRotationPoint(6.5F, 6.5F, -8F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 29
		bodyModel[28].setRotationPoint(12.5F, 4.5F, -8F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 30
		bodyModel[29].setRotationPoint(12.5F, 6.5F, -8F);

		bodyModel[30].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 31
		bodyModel[30].setRotationPoint(-11F, 4F, -9F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 32
		bodyModel[31].setRotationPoint(-9F, 4F, -9F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 33
		bodyModel[32].setRotationPoint(7F, 4F, -9F);

		bodyModel[33].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 34
		bodyModel[33].setRotationPoint(11F, 4F, -9F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 35
		bodyModel[34].setRotationPoint(-1F, 4F, -9F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 36
		bodyModel[35].setRotationPoint(1F, 4F, -9F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 37
		bodyModel[36].setRotationPoint(-5F, 4F, -9F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[37].setRotationPoint(3F, 4F, -9F);

		bodyModel[38].addBox(0F, 0F, 0F, 24, 0, 1, 0F); // Box 69
		bodyModel[38].setRotationPoint(-11F, 8F, -8.5F);

		bodyModel[39].addBox(0F, 0F, 0F, 2, 0, 1, 0F); // Box 147
		bodyModel[39].setRotationPoint(-8F, 4F, -9.5F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 1, 0, 2, 0F,0F, 0F, -1F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 151
		bodyModel[40].setRotationPoint(-6F, 4F, -9.5F);

		bodyModel[41].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 152
		bodyModel[41].setRotationPoint(-9.5F, 3.55F, -9.5F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 1, 0, 2, 0F,-1F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 43
		bodyModel[42].setRotationPoint(-2F, 4F, -9.5F);

		bodyModel[43].addBox(0F, 0F, 0F, 1, 0, 1, 0F); // Box 44
		bodyModel[43].setRotationPoint(-1F, 4F, -9.5F);

		bodyModel[44].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 45
		bodyModel[44].setRotationPoint(0F, 3.55F, -9.5F);

		bodyModel[45].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 46
		bodyModel[45].setRotationPoint(9.5F, 3.55F, -9.5F);

		bodyModel[46].addBox(0F, 0F, 0F, 2, 0, 1, 0F); // Box 47
		bodyModel[46].setRotationPoint(8F, 4F, -9.5F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 1, 0, 2, 0F,-1F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 48
		bodyModel[47].setRotationPoint(7F, 4F, -9.5F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 49
		bodyModel[48].setRotationPoint(-5.5F, 3.5F, -7.5F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 50
		bodyModel[49].setRotationPoint(3.5F, 3.5F, -7.5F);

		bodyModel[50].addBox(0F, 0F, 0F, 8, 4, 10, 0F); // Box 51
		bodyModel[50].setRotationPoint(-10F, 4F, -5F);

		bodyModel[51].addBox(0F, 0F, 0F, 8, 4, 10, 0F); // Box 52
		bodyModel[51].setRotationPoint(4F, 4F, -5F);

		bodyModel[52].addBox(0F, 0F, 0F, 6, 5, 10, 0F); // Box 53
		bodyModel[52].setRotationPoint(-2F, 3F, -5F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 54
		bodyModel[53].setRotationPoint(3F, 4F, 8F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 55
		bodyModel[54].setRotationPoint(7F, 4F, 8F);

		bodyModel[55].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 56
		bodyModel[55].setRotationPoint(11F, 4F, 8F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 57
		bodyModel[56].setRotationPoint(1F, 4F, 8F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 58
		bodyModel[57].setRotationPoint(-1F, 4F, 8F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 59
		bodyModel[58].setRotationPoint(-5F, 4F, 8F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 60
		bodyModel[59].setRotationPoint(-9F, 4F, 8F);

		bodyModel[60].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 61
		bodyModel[60].setRotationPoint(-11F, 4F, 8F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 62
		bodyModel[61].setRotationPoint(2F, 5F, 8F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F); // Box 63
		bodyModel[62].setRotationPoint(-2F, 5F, 8F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 64
		bodyModel[63].setRotationPoint(-7F, 5F, 8F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F); // Box 65
		bodyModel[64].setRotationPoint(-11F, 5F, 8F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F); // Box 66
		bodyModel[65].setRotationPoint(7F, 5F, 8F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 67
		bodyModel[66].setRotationPoint(11F, 5F, 8F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 68
		bodyModel[67].setRotationPoint(0F, 5.5F, 8.5F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 69
		bodyModel[68].setRotationPoint(-9F, 5.5F, 8.5F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 70
		bodyModel[69].setRotationPoint(9F, 5.5F, 8.5F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 71
		bodyModel[70].setRotationPoint(-11.5F, 4.5F, 7F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 72
		bodyModel[71].setRotationPoint(-11.5F, 6.5F, 7F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		bodyModel[72].setRotationPoint(-5.5F, 3.5F, 7F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 74
		bodyModel[73].setRotationPoint(-5.5F, 6.5F, 7F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 75
		bodyModel[74].setRotationPoint(-2.5F, 3.5F, 7F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 76
		bodyModel[75].setRotationPoint(-2.5F, 6.5F, 7F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 77
		bodyModel[76].setRotationPoint(3.5F, 6.5F, 7F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 78
		bodyModel[77].setRotationPoint(3.5F, 3.5F, 7F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 79
		bodyModel[78].setRotationPoint(6.5F, 3.5F, 7F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 80
		bodyModel[79].setRotationPoint(6.5F, 6.5F, 7F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 81
		bodyModel[80].setRotationPoint(12.5F, 6.5F, 7F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 82
		bodyModel[81].setRotationPoint(12.5F, 4.5F, 7F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 83
		bodyModel[82].setRotationPoint(-5.5F, 3.5F, 6.5F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 84
		bodyModel[83].setRotationPoint(3.5F, 3.5F, 6.5F);

		bodyModel[84].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 85
		bodyModel[84].setRotationPoint(9.5F, 3.55F, 8.5F);

		bodyModel[85].addBox(0F, 0F, 0F, 2, 0, 1, 0F); // Box 86
		bodyModel[85].setRotationPoint(8F, 4F, 8.5F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 1, 0, 2, 0F,1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F); // Box 87
		bodyModel[86].setRotationPoint(7F, 4F, 7.5F);

		bodyModel[87].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 88
		bodyModel[87].setRotationPoint(0F, 3.55F, 8.5F);

		bodyModel[88].addBox(0F, 0F, 0F, 1, 0, 1, 0F); // Box 89
		bodyModel[88].setRotationPoint(-1F, 4F, 8.5F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 1, 0, 2, 0F,1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F); // Box 90
		bodyModel[89].setRotationPoint(-2F, 4F, 7.5F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 1, 0, 2, 0F,-1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F); // Box 91
		bodyModel[90].setRotationPoint(-6F, 4F, 7.5F);

		bodyModel[91].addBox(0F, 0F, 0F, 2, 0, 1, 0F); // Box 92
		bodyModel[91].setRotationPoint(-8F, 4F, 8.5F);

		bodyModel[92].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 93
		bodyModel[92].setRotationPoint(-9.5F, 3.55F, 8.5F);

		bodyModel[93].addBox(0F, 0F, 0F, 24, 0, 1, 0F); // Box 94
		bodyModel[93].setRotationPoint(-11F, 8F, 7.5F);
	}

}