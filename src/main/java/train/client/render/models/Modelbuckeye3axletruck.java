//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2021 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 21.12.2020 - 12:41:43
// Last changed on: 21.12.2020 - 12:41:43

package train.client.render.models; //Path where the model is located

import tmt.ModelConverter;
import tmt.ModelRendererTurbo;

public class Modelbuckeye3axletruck extends ModelConverter //Same as Filename
{
	int textureX = 128;
	int textureY = 128;

	public Modelbuckeye3axletruck() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[79];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 1
		bodyModel[2] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 3
		bodyModel[3] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 4
		bodyModel[4] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 14
		bodyModel[5] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 16
		bodyModel[6] = new ModelRendererTurbo(this, 73, 9, textureX, textureY); // Box 22
		bodyModel[7] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 104
		bodyModel[8] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 25
		bodyModel[9] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 26
		bodyModel[10] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 27
		bodyModel[11] = new ModelRendererTurbo(this, 97, 9, textureX, textureY); // Box 28
		bodyModel[12] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 31
		bodyModel[13] = new ModelRendererTurbo(this, 9, 9, textureX, textureY); // Box 32
		bodyModel[14] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 36
		bodyModel[15] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Box 39
		bodyModel[16] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 44
		bodyModel[17] = new ModelRendererTurbo(this, 73, 9, textureX, textureY); // Box 45
		bodyModel[18] = new ModelRendererTurbo(this, 113, 9, textureX, textureY); // Box 46
		bodyModel[19] = new ModelRendererTurbo(this, 113, 17, textureX, textureY); // Box 31
		bodyModel[20] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 32
		bodyModel[21] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 33
		bodyModel[22] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 34
		bodyModel[23] = new ModelRendererTurbo(this, 9, 17, textureX, textureY); // Box 35
		bodyModel[24] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Box 36
		bodyModel[25] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 37
		bodyModel[26] = new ModelRendererTurbo(this, 41, 25, textureX, textureY); // Box 38
		bodyModel[27] = new ModelRendererTurbo(this, 41, 17, textureX, textureY); // Box 39
		bodyModel[28] = new ModelRendererTurbo(this, 57, 25, textureX, textureY); // Box 40
		bodyModel[29] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Box 41
		bodyModel[30] = new ModelRendererTurbo(this, 9, 25, textureX, textureY); // Box 42
		bodyModel[31] = new ModelRendererTurbo(this, 121, 25, textureX, textureY); // Box 43
		bodyModel[32] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 44
		bodyModel[33] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Box 45
		bodyModel[34] = new ModelRendererTurbo(this, 33, 33, textureX, textureY); // Box 46
		bodyModel[35] = new ModelRendererTurbo(this, 73, 33, textureX, textureY); // Box 48
		bodyModel[36] = new ModelRendererTurbo(this, 89, 33, textureX, textureY); // Box 49
		bodyModel[37] = new ModelRendererTurbo(this, 97, 33, textureX, textureY); // Box 50
		bodyModel[38] = new ModelRendererTurbo(this, 105, 33, textureX, textureY); // Box 51
		bodyModel[39] = new ModelRendererTurbo(this, 121, 33, textureX, textureY); // Box 52
		bodyModel[40] = new ModelRendererTurbo(this, 57, 41, textureX, textureY); // Box 53
		bodyModel[41] = new ModelRendererTurbo(this, 65, 41, textureX, textureY); // Box 54
		bodyModel[42] = new ModelRendererTurbo(this, 73, 41, textureX, textureY); // Box 55
		bodyModel[43] = new ModelRendererTurbo(this, 97, 41, textureX, textureY); // Box 56
		bodyModel[44] = new ModelRendererTurbo(this, 113, 41, textureX, textureY); // Box 57
		bodyModel[45] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 58
		bodyModel[46] = new ModelRendererTurbo(this, 17, 49, textureX, textureY); // Box 59
		bodyModel[47] = new ModelRendererTurbo(this, 73, 49, textureX, textureY); // Box 60
		bodyModel[48] = new ModelRendererTurbo(this, 25, 49, textureX, textureY); // Box 61
		bodyModel[49] = new ModelRendererTurbo(this, 57, 49, textureX, textureY); // Box 62
		bodyModel[50] = new ModelRendererTurbo(this, 65, 49, textureX, textureY); // Box 63
		bodyModel[51] = new ModelRendererTurbo(this, 89, 49, textureX, textureY); // Box 64
		bodyModel[52] = new ModelRendererTurbo(this, 113, 49, textureX, textureY); // Box 65
		bodyModel[53] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 66
		bodyModel[54] = new ModelRendererTurbo(this, 121, 49, textureX, textureY); // Box 67
		bodyModel[55] = new ModelRendererTurbo(this, 17, 57, textureX, textureY); // Box 68
		bodyModel[56] = new ModelRendererTurbo(this, 25, 57, textureX, textureY); // Box 69
		bodyModel[57] = new ModelRendererTurbo(this, 41, 57, textureX, textureY); // Box 70
		bodyModel[58] = new ModelRendererTurbo(this, 49, 57, textureX, textureY); // Box 71
		bodyModel[59] = new ModelRendererTurbo(this, 65, 57, textureX, textureY); // Box 72
		bodyModel[60] = new ModelRendererTurbo(this, 89, 57, textureX, textureY); // Box 73
		bodyModel[61] = new ModelRendererTurbo(this, 97, 57, textureX, textureY); // Box 74
		bodyModel[62] = new ModelRendererTurbo(this, 113, 57, textureX, textureY); // Box 75
		bodyModel[63] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 76
		bodyModel[64] = new ModelRendererTurbo(this, 17, 65, textureX, textureY); // Box 77
		bodyModel[65] = new ModelRendererTurbo(this, 25, 65, textureX, textureY); // Box 78
		bodyModel[66] = new ModelRendererTurbo(this, 33, 65, textureX, textureY); // Box 79
		bodyModel[67] = new ModelRendererTurbo(this, 41, 65, textureX, textureY); // Box 80
		bodyModel[68] = new ModelRendererTurbo(this, 49, 65, textureX, textureY); // Box 81
		bodyModel[69] = new ModelRendererTurbo(this, 57, 65, textureX, textureY); // Box 82
		bodyModel[70] = new ModelRendererTurbo(this, 65, 65, textureX, textureY); // Box 83
		bodyModel[71] = new ModelRendererTurbo(this, 73, 65, textureX, textureY); // Box 84
		bodyModel[72] = new ModelRendererTurbo(this, 89, 65, textureX, textureY); // Box 85
		bodyModel[73] = new ModelRendererTurbo(this, 105, 65, textureX, textureY); // Box 86
		bodyModel[74] = new ModelRendererTurbo(this, 113, 65, textureX, textureY); // Box 87
		bodyModel[75] = new ModelRendererTurbo(this, 121, 65, textureX, textureY); // Box 88
		bodyModel[76] = new ModelRendererTurbo(this, 17, 73, textureX, textureY); // Box 89
		bodyModel[77] = new ModelRendererTurbo(this, 25, 73, textureX, textureY); // Box 90
		bodyModel[78] = new ModelRendererTurbo(this, 33, 73, textureX, textureY); // Box 91

		bodyModel[0].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 0
		bodyModel[0].setRotationPoint(-1F, 4.5F, -1F);

		bodyModel[1].addBox(0F, 0F, 0F, 3, 1, 19, 0F); // Box 1
		bodyModel[1].setRotationPoint(4F, 6F, -9.5F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -0.5F, 0F); // Box 3
		bodyModel[2].setRotationPoint(-13F, 6F, -9F);

		bodyModel[3].addBox(0F, 0F, 0F, 9, 1, 1, 0F); // Box 4
		bodyModel[3].setRotationPoint(0F, 5F, -9F);

		bodyModel[4].addBox(0F, 0F, 0F, 2, 2, 18, 0F); // Box 14
		bodyModel[4].setRotationPoint(-12F, 6F, -9F);

		bodyModel[5].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 16
		bodyModel[5].setRotationPoint(-11F, 7F, -6F);

		bodyModel[6].addBox(0F, 0F, 0F, 2, 2, 18, 0F); // Box 22
		bodyModel[6].setRotationPoint(-1F, 6F, -9F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 104
		bodyModel[7].setRotationPoint(-12F, 6F, -9.5F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 1F, -1F, 0F); // Box 25
		bodyModel[8].setRotationPoint(2F, 6F, -9F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[9].setRotationPoint(4F, 8F, -9F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F); // Box 27
		bodyModel[10].setRotationPoint(7F, 6F, -9F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 3, 12, 2, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -10.5F, -0.25F, 0F, -10.5F, -0.25F, 0F, -10.5F, -0.25F, 0F, -10.5F, -0.25F); // Box 28
		bodyModel[11].setRotationPoint(4F, 7F, -9.5F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 31
		bodyModel[12].setRotationPoint(-1F, 6F, -9.5F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 1F, 0F); // Box 32
		bodyModel[13].setRotationPoint(12F, 6F, -9F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 36
		bodyModel[14].setRotationPoint(-12F, 6F, 8.5F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 39
		bodyModel[15].setRotationPoint(-1F, 6F, 8.5F);

		bodyModel[16].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 44
		bodyModel[16].setRotationPoint(0F, 7F, -6F);

		bodyModel[17].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 45
		bodyModel[17].setRotationPoint(11F, 7F, 6F);

		bodyModel[18].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 46
		bodyModel[18].setRotationPoint(-11F, 7F, 6F);

		bodyModel[19].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 31
		bodyModel[19].setRotationPoint(11F, 7F, -6F);

		bodyModel[20].addBox(0F, 0F, 0F, 2, 2, 18, 0F); // Box 32
		bodyModel[20].setRotationPoint(10F, 6F, -9F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 33
		bodyModel[21].setRotationPoint(10F, 6F, -9.5F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 34
		bodyModel[22].setRotationPoint(9F, 6F, -9F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 35
		bodyModel[23].setRotationPoint(-13F, 5F, -9F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 36
		bodyModel[24].setRotationPoint(-10F, 6F, -9F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 37
		bodyModel[25].setRotationPoint(-9F, 5F, -9F);

		bodyModel[26].addBox(0F, 0F, 0F, 5, 1, 1, 0F); // Box 38
		bodyModel[26].setRotationPoint(-5F, 5F, -8F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 39
		bodyModel[27].setRotationPoint(-9F, 6F, -9F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 3, 12, 2, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -10.5F, -0.25F, 0F, -10.5F, -0.25F, 0F, -10.5F, -0.25F, 0F, -10.5F, -0.25F); // Box 40
		bodyModel[28].setRotationPoint(-7F, 7F, -9.5F);

		bodyModel[29].addBox(0F, 0F, 0F, 3, 1, 19, 0F); // Box 41
		bodyModel[29].setRotationPoint(-7F, 6F, -9.5F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 42
		bodyModel[30].setRotationPoint(-7F, 8F, -9F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -2F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, -2F, 0F, 0F, 2F, 0F, 1F, -1F, -1F, 1F, -1F, 1F, 0F, 2F, 0F); // Box 43
		bodyModel[31].setRotationPoint(-4F, 6F, -9F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F); // Box 44
		bodyModel[32].setRotationPoint(-3F, 5F, -9F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 45
		bodyModel[33].setRotationPoint(-2.5F, 6F, -9F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, -0.5F); // Box 46
		bodyModel[34].setRotationPoint(-2F, 6F, -9F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 48
		bodyModel[35].setRotationPoint(9F, 5F, -9F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, -0.5F); // Box 49
		bodyModel[36].setRotationPoint(-3F, 7.5F, -9F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, 1F, 0F, -0.5F, 0F); // Box 50
		bodyModel[37].setRotationPoint(-1F, 8F, -9F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, -0.5F, -1F, -0.5F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 51
		bodyModel[38].setRotationPoint(0F, 5F, -8F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, -0.5F, -0.5F, 0.5F, 0F, 0F, 0F, 0F); // Box 52
		bodyModel[39].setRotationPoint(1F, 6F, -8F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 53
		bodyModel[40].setRotationPoint(1.5F, 6F, -8F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, -0.5F, -0.5F, -1F, 0F, 0F, 0F, 0F); // Box 54
		bodyModel[41].setRotationPoint(1F, 7.5F, -8F);

		bodyModel[42].addBox(0F, 0F, 0F, 8, 1, 3, 0F); // Box 55
		bodyModel[42].setRotationPoint(-4F, 5F, -1.5F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 56
		bodyModel[43].setRotationPoint(-7F, 5F, -1.5F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 57
		bodyModel[44].setRotationPoint(4F, 5F, -1.5F);

		bodyModel[45].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 58
		bodyModel[45].setRotationPoint(0F, 7F, 6F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 59
		bodyModel[46].setRotationPoint(10F, 6F, 8.5F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 3, 12, 2, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -10.5F, -0.25F, 0F, -10.5F, -0.25F, 0F, -10.5F, -0.25F, 0F, -10.5F, -0.25F); // Box 60
		bodyModel[47].setRotationPoint(4F, 7F, 7.5F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 61
		bodyModel[48].setRotationPoint(4F, 8F, 8F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 1F, -1F, 0F); // Box 62
		bodyModel[49].setRotationPoint(2F, 6F, 8F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F); // Box 63
		bodyModel[50].setRotationPoint(7F, 6F, 8F);

		bodyModel[51].addBox(0F, 0F, 0F, 9, 1, 1, 0F); // Box 64
		bodyModel[51].setRotationPoint(0F, 5F, 8F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -2F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, 2F, 0F, 1F, -1F, 1F, 1F, -1F, -1F, 0F, 2F, 0F); // Box 65
		bodyModel[52].setRotationPoint(-4F, 6F, 8F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 66
		bodyModel[53].setRotationPoint(-7F, 8F, 8F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 67
		bodyModel[54].setRotationPoint(-9F, 6F, 8F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 68
		bodyModel[55].setRotationPoint(9F, 6F, 8F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 69
		bodyModel[56].setRotationPoint(9F, 5F, 8F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 1F, 0F); // Box 70
		bodyModel[57].setRotationPoint(12F, 6F, 8F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.5F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 71
		bodyModel[58].setRotationPoint(-3F, 5F, 8F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 72
		bodyModel[59].setRotationPoint(-10F, 6F, 8F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -0.5F, 0F); // Box 73
		bodyModel[60].setRotationPoint(-13F, 6F, 8F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[61].setRotationPoint(-13F, 5F, 8F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 75
		bodyModel[62].setRotationPoint(-9F, 5F, 8F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 3, 12, 2, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -10.5F, -0.25F, 0F, -10.5F, -0.25F, 0F, -10.5F, -0.25F, 0F, -10.5F, -0.25F); // Box 76
		bodyModel[63].setRotationPoint(-7F, 7F, 7.5F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F); // Box 77
		bodyModel[64].setRotationPoint(-2F, 6F, 8F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 78
		bodyModel[65].setRotationPoint(-2.5F, 6F, 8F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F); // Box 79
		bodyModel[66].setRotationPoint(-3F, 7.5F, 8F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F); // Box 80
		bodyModel[67].setRotationPoint(-1F, 8F, 8F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, -0.5F, 0F, 0F, 0F); // Box 81
		bodyModel[68].setRotationPoint(1F, 7.5F, 7F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 82
		bodyModel[69].setRotationPoint(1.5F, 6F, 7F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, -0.5F, 0F, 0F, 0F); // Box 83
		bodyModel[70].setRotationPoint(1F, 6F, 7F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 0F); // Box 84
		bodyModel[71].setRotationPoint(0F, 5F, 7F);

		bodyModel[72].addBox(0F, 0F, 0F, 5, 1, 1, 0F); // Box 85
		bodyModel[72].setRotationPoint(-5F, 5F, 7F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 86
		bodyModel[73].setRotationPoint(10F, 6F, -10F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 87
		bodyModel[74].setRotationPoint(-1F, 6F, -10F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 88
		bodyModel[75].setRotationPoint(-12F, 6F, -10F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 89
		bodyModel[76].setRotationPoint(-1F, 6F, 9F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 90
		bodyModel[77].setRotationPoint(10F, 6F, 9F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 91
		bodyModel[78].setRotationPoint(-12F, 6F, 9F);
	}
}