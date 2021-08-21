//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2021 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 15.04.2019 - 12:23:34
// Last changed on: 15.04.2019 - 12:23:34

package train.client.render.models; //Path where the model is located
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import tmt.ModelConverter;
import tmt.ModelRendererTurbo;

public class ModelOnion extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelOnion() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[99];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 1
		bodyModel[2] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 2
		bodyModel[3] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 3
		bodyModel[4] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 4
		bodyModel[5] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 6
		bodyModel[6] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 7
		bodyModel[7] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 8
		bodyModel[8] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 9
		bodyModel[9] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 10
		bodyModel[10] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 11
		bodyModel[11] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 12
		bodyModel[12] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 13
		bodyModel[13] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 15
		bodyModel[14] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 16
		bodyModel[15] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 17
		bodyModel[16] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 18
		bodyModel[17] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 19
		bodyModel[18] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 20
		bodyModel[19] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 21
		bodyModel[20] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 22
		bodyModel[21] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 23
		bodyModel[22] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 24
		bodyModel[23] = new ModelRendererTurbo(this, 321, 17, textureX, textureY); // Box 27
		bodyModel[24] = new ModelRendererTurbo(this, 369, 17, textureX, textureY); // Box 28
		bodyModel[25] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 29
		bodyModel[26] = new ModelRendererTurbo(this, 425, 17, textureX, textureY); // Box 30
		bodyModel[27] = new ModelRendererTurbo(this, 233, 1, textureX, textureY, "lamp"); // Box 31 lamp
		bodyModel[28] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 32
		bodyModel[29] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 33
		bodyModel[30] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 34
		bodyModel[31] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 35
		bodyModel[32] = new ModelRendererTurbo(this, 9, 9, textureX, textureY); // Box 36
		bodyModel[33] = new ModelRendererTurbo(this, 153, 9, textureX, textureY); // Box 37
		bodyModel[34] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Box 38
		bodyModel[35] = new ModelRendererTurbo(this, 193, 9, textureX, textureY); // Box 39
		bodyModel[36] = new ModelRendererTurbo(this, 233, 9, textureX, textureY); // Box 40
		bodyModel[37] = new ModelRendererTurbo(this, 281, 9, textureX, textureY); // Box 41
		bodyModel[38] = new ModelRendererTurbo(this, 489, 9, textureX, textureY); // Box 42
		bodyModel[39] = new ModelRendererTurbo(this, 177, 17, textureX, textureY); // Box 43
		bodyModel[40] = new ModelRendererTurbo(this, 9, 17, textureX, textureY); // Box 44
		bodyModel[41] = new ModelRendererTurbo(this, 153, 17, textureX, textureY); // Box 45
		bodyModel[42] = new ModelRendererTurbo(this, 457, 17, textureX, textureY); // Box 46
		bodyModel[43] = new ModelRendererTurbo(this, 457, 17, textureX, textureY); // Box 47
		bodyModel[44] = new ModelRendererTurbo(this, 121, 17, textureX, textureY); // Box 58
		bodyModel[45] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Box 59
		bodyModel[46] = new ModelRendererTurbo(this, 169, 25, textureX, textureY); // Box 60
		bodyModel[47] = new ModelRendererTurbo(this, 201, 25, textureX, textureY); // Box 61
		bodyModel[48] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 62
		bodyModel[49] = new ModelRendererTurbo(this, 225, 25, textureX, textureY); // Box 63
		bodyModel[50] = new ModelRendererTurbo(this, 249, 25, textureX, textureY); // Box 65
		bodyModel[51] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 66
		bodyModel[52] = new ModelRendererTurbo(this, 121, 33, textureX, textureY); // Box 67
		bodyModel[53] = new ModelRendererTurbo(this, 145, 33, textureX, textureY); // Box 68
		bodyModel[54] = new ModelRendererTurbo(this, 57, 33, textureX, textureY); // Box 69
		bodyModel[55] = new ModelRendererTurbo(this, 217, 33, textureX, textureY); // Box 70
		bodyModel[56] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 71
		bodyModel[57] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 72
		bodyModel[58] = new ModelRendererTurbo(this, 257, 33, textureX, textureY); // Box 73
		bodyModel[59] = new ModelRendererTurbo(this, 377, 17, textureX, textureY); // Box 74
		bodyModel[60] = new ModelRendererTurbo(this, 113, 25, textureX, textureY); // Box 75
		bodyModel[61] = new ModelRendererTurbo(this, 273, 33, textureX, textureY); // Box 76
		bodyModel[62] = new ModelRendererTurbo(this, 457, 25, textureX, textureY); // Box 78
		bodyModel[63] = new ModelRendererTurbo(this, 489, 25, textureX, textureY); // Box 79
		bodyModel[64] = new ModelRendererTurbo(this, 33, 33, textureX, textureY); // Box 80
		bodyModel[65] = new ModelRendererTurbo(this, 297, 33, textureX, textureY); // Box 81
		bodyModel[66] = new ModelRendererTurbo(this, 289, 41, textureX, textureY); // Box 82
		bodyModel[67] = new ModelRendererTurbo(this, 425, 33, textureX, textureY); // Box 83
		bodyModel[68] = new ModelRendererTurbo(this, 449, 33, textureX, textureY); // Box 84
		bodyModel[69] = new ModelRendererTurbo(this, 345, 41, textureX, textureY); // Box 85
		bodyModel[70] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 86
		bodyModel[71] = new ModelRendererTurbo(this, 385, 41, textureX, textureY); // Box 87
		bodyModel[72] = new ModelRendererTurbo(this, 329, 41, textureX, textureY); // Box 88
		bodyModel[73] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 89
		bodyModel[74] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 90
		bodyModel[75] = new ModelRendererTurbo(this, 377, 25, textureX, textureY); // Box 91
		bodyModel[76] = new ModelRendererTurbo(this, 401, 41, textureX, textureY); // Box 92
		bodyModel[77] = new ModelRendererTurbo(this, 369, 41, textureX, textureY); // Box 93
		bodyModel[78] = new ModelRendererTurbo(this, 169, 9, textureX, textureY); // Box 94
		bodyModel[79] = new ModelRendererTurbo(this, 81, 49, textureX, textureY); // Box 95
		bodyModel[80] = new ModelRendererTurbo(this, 145, 49, textureX, textureY); // Box 96
		bodyModel[81] = new ModelRendererTurbo(this, 433, 41, textureX, textureY); // Box 97
		bodyModel[82] = new ModelRendererTurbo(this, 169, 17, textureX, textureY); // Box 98
		bodyModel[83] = new ModelRendererTurbo(this, 193, 25, textureX, textureY); // Box 99
		bodyModel[84] = new ModelRendererTurbo(this, 249, 41, textureX, textureY); // Box 100
		bodyModel[85] = new ModelRendererTurbo(this, 57, 49, textureX, textureY); // Box 101
		bodyModel[86] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 102
		bodyModel[87] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 103
		bodyModel[88] = new ModelRendererTurbo(this, 177, 49, textureX, textureY); // Box 188
		bodyModel[89] = new ModelRendererTurbo(this, 201, 49, textureX, textureY); // Box 89 smoke
		bodyModel[90] = new ModelRendererTurbo(this, 385, 41, textureX, textureY, "lamp"); // Box 90 glow
		bodyModel[91] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 114
		bodyModel[92] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 74
		bodyModel[93] = new ModelRendererTurbo(this, 137, 9, textureX, textureY); // Box 78
		bodyModel[94] = new ModelRendererTurbo(this, 489, 33, textureX, textureY); // Box 94
		bodyModel[95] = new ModelRendererTurbo(this, 505, 9, textureX, textureY, "lamp"); // Box 95 liveryimg 1
		bodyModel[96] = new ModelRendererTurbo(this, 57, 17, textureX, textureY, "lamp"); // Box 96 liveryimg 1
		bodyModel[97] = new ModelRendererTurbo(this, 33, 41, textureX, textureY); // Box 97 liveryimg 2
		bodyModel[98] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 98 liveryimg 2

		bodyModel[0].addBox(0F, 0F, 0F, 1, 2, 22, 0F); // Box 0
		bodyModel[0].setRotationPoint(-14F, 1.5F, -11F);

		bodyModel[1].addBox(0F, 0F, 0F, 2, 19, 1, 0F); // Box 1
		bodyModel[1].setRotationPoint(-13F, -15.5F, -11F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[2].setRotationPoint(-13F, -18.5F, -11F);

		bodyModel[3].addBox(0F, 0F, 0F, 2, 20, 1, 0F); // Box 3
		bodyModel[3].setRotationPoint(-11F, -18.5F, -11F);

		bodyModel[4].addBox(0F, 0F, 0F, 7, 16, 1, 0F); // Box 4
		bodyModel[4].setRotationPoint(-9F, -18.5F, -11F);

		bodyModel[5].addBox(0F, 0F, 0F, 2, 19, 1, 0F); // Box 6
		bodyModel[5].setRotationPoint(-13F, -15.5F, 10F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 7
		bodyModel[6].setRotationPoint(-13F, -18.5F, 10F);

		bodyModel[7].addBox(0F, 0F, 0F, 2, 20, 1, 0F); // Box 8
		bodyModel[7].setRotationPoint(-11F, -18.5F, 10F);

		bodyModel[8].addBox(0F, 0F, 0F, 7, 16, 1, 0F); // Box 9
		bodyModel[8].setRotationPoint(-9F, -18.5F, 10F);

		bodyModel[9].addBox(0F, 0F, 0F, 3, 1, 20, 0F); // Box 10
		bodyModel[9].setRotationPoint(-13F, 1.5F, -10F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 2, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[10].setRotationPoint(-11F, 1.5F, -11F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 2, 3, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 12
		bodyModel[11].setRotationPoint(-9F, -1.5F, -11F);

		bodyModel[12].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 13
		bodyModel[12].setRotationPoint(-17F, 2.5F, -1.5F);

		bodyModel[13].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 15
		bodyModel[13].setRotationPoint(-6F, 6.5F, -6F);

		bodyModel[14].addBox(0F, 0F, 0F, 2, 2, 13, 0F); // Box 16
		bodyModel[14].setRotationPoint(-7F, 5.5F, -6.5F);

		bodyModel[15].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 17
		bodyModel[15].setRotationPoint(-6F, 6.5F, 6F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 6, 5, 14, 0F,-2F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 18
		bodyModel[16].setRotationPoint(-16F, 2.5F, -7F);

		bodyModel[17].addBox(0F, 0F, 0F, 3, 6, 12, 0F); // Box 19
		bodyModel[17].setRotationPoint(-13F, -4.5F, -6F);

		bodyModel[18].addBox(0F, 0F, 0F, 10, 8, 16, 0F); // Box 20
		bodyModel[18].setRotationPoint(-10F, -13.5F, -8F);

		bodyModel[19].addBox(0F, 0F, 0F, 10, 4, 8, 0F); // Box 21
		bodyModel[19].setRotationPoint(-10F, -17.5F, -4F);

		bodyModel[20].addBox(0F, 0F, 0F, 10, 4, 8, 0F); // Box 22
		bodyModel[20].setRotationPoint(-10F, -5.5F, -4F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 10, 4, 4, 0F,0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 23
		bodyModel[21].setRotationPoint(-10F, -17.5F, -8F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 10, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		bodyModel[22].setRotationPoint(-10F, -17.5F, 4F);

		bodyModel[23].addBox(0F, 0F, 0F, 18, 4, 16, 0F); // Box 27
		bodyModel[23].setRotationPoint(-10F, -1.5F, -8F);

		bodyModel[24].addBox(0F, 0F, 0F, 16, 1, 22, 0F); // Box 28
		bodyModel[24].setRotationPoint(-9F, -2.5F, -11F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 10, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 29
		bodyModel[25].setRotationPoint(-10F, -5.5F, -8F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 10, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F); // Box 30
		bodyModel[26].setRotationPoint(-10F, -5.5F, 4F);

		bodyModel[27].addBox(0F, 0F, 0F, 2, 4, 2, 0F); // Box 31 lamp
		bodyModel[27].setRotationPoint(-12F, -11.5F, -1F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 32
		bodyModel[28].setRotationPoint(-12F, -11F, -3F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 33
		bodyModel[29].setRotationPoint(-12F, -11F, 1F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 3, 3, 2, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		bodyModel[30].setRotationPoint(-13F, -7.5F, -6F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 3, 3, 2, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 35
		bodyModel[31].setRotationPoint(-13F, -7.5F, 4F);

		bodyModel[32].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 36
		bodyModel[32].setRotationPoint(5F, 6.5F, -6F);

		bodyModel[33].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 37
		bodyModel[33].setRotationPoint(5F, 6.5F, 6F);

		bodyModel[34].addBox(0F, 0F, 0F, 2, 2, 15, 0F); // Box 38
		bodyModel[34].setRotationPoint(4F, 5.5F, -7.5F);

		bodyModel[35].addBox(0F, 0F, 0F, 8, 3, 1, 0F); // Box 39
		bodyModel[35].setRotationPoint(1F, 5F, -7F);

		bodyModel[36].addBox(0F, 0F, 0F, 7, 1, 1, 0F); // Box 40
		bodyModel[36].setRotationPoint(1.5F, 4F, -7F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[37].setRotationPoint(-9F, -1.5F, -1F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 2, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 42
		bodyModel[38].setRotationPoint(-11F, 1.5F, 6F);

		bodyModel[39].addBox(0F, 0F, 0F, 3, 1, 5, 0F); // Box 43
		bodyModel[39].setRotationPoint(-14F, 3.5F, -11F);

		bodyModel[40].addBox(0F, 0F, 0F, 2, 1, 4, 0F); // Box 44
		bodyModel[40].setRotationPoint(-13F, 2.5F, -10F);

		bodyModel[41].addBox(0F, 0F, 0F, 2, 1, 4, 0F); // Box 45
		bodyModel[41].setRotationPoint(-13F, 2.5F, 6F);

		bodyModel[42].addBox(0F, 0F, 0F, 3, 1, 5, 0F); // Box 46
		bodyModel[42].setRotationPoint(-14F, 3.5F, 6F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 2, 4, 20, 0F,0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 47
		bodyModel[43].setRotationPoint(-11F, -2.5F, -10F);

		bodyModel[44].addBox(0F, 0F, 0F, 8, 1, 2, 0F); // Box 58
		bodyModel[44].setRotationPoint(2F, -0.5F, -10F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 7, 15, 6, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 59
		bodyModel[45].setRotationPoint(0F, -17.5F, -10F);

		bodyModel[46].addBox(0F, 0F, 0F, 7, 15, 8, 0F); // Box 60
		bodyModel[46].setRotationPoint(0F, -17.5F, -4F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 7, 15, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 61
		bodyModel[47].setRotationPoint(0F, -17.5F, 4F);

		bodyModel[48].addBox(0F, 0F, 0F, 1, 15, 20, 0F); // Box 62
		bodyModel[48].setRotationPoint(7F, -15.5F, -10F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 8, 3, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 63
		bodyModel[49].setRotationPoint(8F, -15.5F, -11F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 8, 3, 1, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 65
		bodyModel[50].setRotationPoint(8F, -15.5F, 10F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 10, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 66
		bodyModel[51].setRotationPoint(8F, -17.5F, 7F);

		bodyModel[52].addBox(0F, 0F, 0F, 9, 12, 1, 0F); // Box 67
		bodyModel[52].setRotationPoint(7F, -12.5F, -11F);

		bodyModel[53].addBox(0F, 0F, 0F, 9, 12, 1, 0F); // Box 68
		bodyModel[53].setRotationPoint(7F, -12.5F, 10F);

		bodyModel[54].addBox(0F, 0F, 0F, 9, 5, 5, 0F); // Box 69
		bodyModel[54].setRotationPoint(-4F, -22.5F, -2.5F);

		bodyModel[55].addBox(0F, 0F, 0F, 10, 1, 14, 0F); // Box 70
		bodyModel[55].setRotationPoint(8F, -17.5F, -7F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 71
		bodyModel[56].setRotationPoint(7F, -15.5F, 10F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 72
		bodyModel[57].setRotationPoint(7F, -15.5F, -11F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 10, 2, 3, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 73
		bodyModel[58].setRotationPoint(8F, -17.5F, -10F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[59].setRotationPoint(7F, -17.5F, -10F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 75
		bodyModel[60].setRotationPoint(7F, -17.5F, 7F);

		bodyModel[61].addBox(0F, 0F, 0F, 1, 2, 14, 0F); // Box 76
		bodyModel[61].setRotationPoint(7F, -17.5F, -7F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 6, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 78
		bodyModel[62].setRotationPoint(10F, -0.5F, -11F);

		bodyModel[63].addBox(0F, 0F, 0F, 8, 1, 2, 0F); // Box 79
		bodyModel[63].setRotationPoint(2F, -0.5F, 8F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 6, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 80
		bodyModel[64].setRotationPoint(10F, -0.5F, 8F);

		bodyModel[65].addBox(0F, 0F, 0F, 4, 3, 3, 0F); // Box 81
		bodyModel[65].setRotationPoint(-8F, -20.5F, -1.5F);

		bodyModel[66].addBox(0F, 0F, 0F, 8, 2, 16, 0F); // Box 82
		bodyModel[66].setRotationPoint(8F, -0.5F, -8F);

		bodyModel[67].addBox(0F, 0F, 0F, 8, 3, 1, 0F); // Box 83
		bodyModel[67].setRotationPoint(1F, 5F, 6F);

		bodyModel[68].addBox(0F, 0F, 0F, 7, 1, 1, 0F); // Box 84
		bodyModel[68].setRotationPoint(1.5F, 4F, 6F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 2, 3, 14, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 85
		bodyModel[69].setRotationPoint(-1F, 5F, -7F);

		bodyModel[70].addBox(0F, 0F, 0F, 6, 1, 3, 0F); // Box 86
		bodyModel[70].setRotationPoint(5F, -18.5F, -1.5F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 2, 3, 14, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 87
		bodyModel[71].setRotationPoint(9F, 5F, -7F);

		bodyModel[72].addBox(0F, 0F, 0F, 7, 3, 6, 0F); // Box 88
		bodyModel[72].setRotationPoint(-8F, 5F, -3F);

		bodyModel[73].addBox(0F, 0F, 0F, 3, 3, 20, 0F); // Box 89
		bodyModel[73].setRotationPoint(-2F, -1.5F, -10F);

		bodyModel[74].addBox(0F, 0F, 0F, 4, 3, 0, 0F); // Box 90
		bodyModel[74].setRotationPoint(1F, -1.5F, -10.01F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 4, 6, 0, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F); // Box 91
		bodyModel[75].setRotationPoint(5F, -1.5F, -10.01F);

		bodyModel[76].addBox(0F, 0F, 0F, 2, 3, 20, 0F); // Box 92
		bodyModel[76].setRotationPoint(9F, 1.5F, -10F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 4, 6, 0, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F); // Box 93
		bodyModel[77].setRotationPoint(5F, -1.5F, 10.01F);

		bodyModel[78].addBox(0F, 0F, 0F, 4, 3, 0, 0F); // Box 94
		bodyModel[78].setRotationPoint(1F, -1.5F, 10.01F);

		bodyModel[79].addBox(0F, 0F, 0F, 22, 3, 8, 0F); // Box 95
		bodyModel[79].setRotationPoint(-11.5F, 2.5F, -4F);

		bodyModel[80].addBox(0F, 0F, 0F, 4, 10, 10, 0F); // Box 96
		bodyModel[80].setRotationPoint(8F, -10.5F, -5F);

		bodyModel[81].addBox(0F, 0F, 0F, 4, 2, 6, 0F); // Box 97
		bodyModel[81].setRotationPoint(8F, -12.5F, -3F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 98
		bodyModel[82].setRotationPoint(8F, -12.5F, -5F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 99
		bodyModel[83].setRotationPoint(8F, -12.5F, 3F);

		bodyModel[84].addBox(0F, 0F, 0F, 1, 1, 20, 0F); // Box 100
		bodyModel[84].setRotationPoint(-9F, -15F, -10F);

		bodyModel[85].addBox(0F, 0F, 0F, 1, 1, 20, 0F); // Box 101
		bodyModel[85].setRotationPoint(-4F, -15F, -10F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 102
		bodyModel[86].setRotationPoint(16F, -15.5F, -11F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 103
		bodyModel[87].setRotationPoint(16F, -15.5F, 10F);

		bodyModel[88].addBox(0F, 0F, 0F, 3, 5, 10, 0F); // Box 188
		bodyModel[88].setRotationPoint(10F, 1F, -5F);

		bodyModel[89].addBox(0F, 0F, 0F, 8, 1, 4, 0F); // Box 89 smoke
		bodyModel[89].setRotationPoint(-3.5F, -22.5F, -2F);

		bodyModel[90].addBox(0F, 0F, 0F, 1, 5, 4, 0F); // Box 90 glow
		bodyModel[90].setRotationPoint(11.5F, -6F, -2F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 114
		bodyModel[91].setRotationPoint(-11F, -19.5F, -0.5F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[92].setRotationPoint(-11F, -20.5F, -0.5F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 78
		bodyModel[93].setRotationPoint(-10.75F, -19F, -0.25F);

		bodyModel[94].addBox(0F, 0F, 0F, 7, 1, 1, 0F); // Box 94
		bodyModel[94].setRotationPoint(-11F, -21.5F, -0.5F);

		bodyModel[95].addBox(0F, 0F, 0F, 0, 1, 3, 0F); // Box 95 liveryimg 1
		bodyModel[95].setRotationPoint(-9F, -18.5F, -4F);
		bodyModel[95].rotateAngleY = 0.6981317F;

		bodyModel[96].addBox(0F, 0F, -3F, 0, 1, 3, 0F); // Box 96 liveryimg 1
		bodyModel[96].setRotationPoint(-9F, -18.5F, 4F);
		bodyModel[96].rotateAngleY = -0.6981317F;

		bodyModel[97].addBox(0F, 0F, 0F, 7, 3, 0, 0F); // Box 97 liveryimg 2
		bodyModel[97].setRotationPoint(8F, -5F, -11.01F);

		bodyModel[98].addBox(0F, 0F, 0F, 7, 3, 0, 0F); // Box 98 liveryimg 2
		bodyModel[98].setRotationPoint(8F, -5F, 11.01F);
	}
	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {

		for (ModelRendererTurbo m : bodyModel) {
			if (m.boxName.equals("lamp")) {
				Minecraft.getMinecraft().entityRenderer.disableLightmap(1D);
			}
			m.render(f5);
			if (m.boxName.equals("lamp")) {
				Minecraft.getMinecraft().entityRenderer.enableLightmap(1D);
			}
		}
	}
}