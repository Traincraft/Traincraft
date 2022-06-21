//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2021 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 20.07.2021 - 23:26:45
// Last changed on: 20.07.2021 - 23:26:45

package train.client.render.models; //Path where the model is located

import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import tmt.ModelConverter;
import tmt.ModelRendererTurbo;

public class ModelILMA extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelILMA() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[87];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 1
		bodyModel[2] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 2
		bodyModel[3] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 3
		bodyModel[4] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 4
		bodyModel[5] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 5
		bodyModel[6] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 6
		bodyModel[7] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 7
		bodyModel[8] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 8
		bodyModel[9] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 9
		bodyModel[10] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 10
		bodyModel[11] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 18
		bodyModel[12] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 19
		bodyModel[13] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 20
		bodyModel[14] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 21
		bodyModel[15] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 22
		bodyModel[16] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 23
		bodyModel[17] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 24
		bodyModel[18] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 25
		bodyModel[19] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 26
		bodyModel[20] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 27
		bodyModel[21] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 28
		bodyModel[22] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 30
		bodyModel[23] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 32
		bodyModel[24] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 33
		bodyModel[25] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 34
		bodyModel[26] = new ModelRendererTurbo(this, 241, 9, textureX, textureY); // Box 35
		bodyModel[27] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 37
		bodyModel[28] = new ModelRendererTurbo(this, 273, 9, textureX, textureY); // Box 38
		bodyModel[29] = new ModelRendererTurbo(this, 289, 9, textureX, textureY); // Box 39
		bodyModel[30] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 40
		bodyModel[31] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 43
		bodyModel[32] = new ModelRendererTurbo(this, 121, 9, textureX, textureY); // Box 44
		bodyModel[33] = new ModelRendererTurbo(this, 137, 9, textureX, textureY); // Box 45
		bodyModel[34] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 46
		bodyModel[35] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 47
		bodyModel[36] = new ModelRendererTurbo(this, 153, 9, textureX, textureY); // Box 48
		bodyModel[37] = new ModelRendererTurbo(this, 169, 9, textureX, textureY); // Box 49
		bodyModel[38] = new ModelRendererTurbo(this, 177, 9, textureX, textureY); // Box 50
		bodyModel[39] = new ModelRendererTurbo(this, 201, 9, textureX, textureY); // Box 51
		bodyModel[40] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 52
		bodyModel[41] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 53
		bodyModel[42] = new ModelRendererTurbo(this, 217, 9, textureX, textureY); // Box 54
		bodyModel[43] = new ModelRendererTurbo(this, 225, 9, textureX, textureY); // Box 55
		bodyModel[44] = new ModelRendererTurbo(this, 233, 9, textureX, textureY); // Box 56
		bodyModel[45] = new ModelRendererTurbo(this, 265, 9, textureX, textureY); // Box 57
		bodyModel[46] = new ModelRendererTurbo(this, 369, 9, textureX, textureY); // Box 61
		bodyModel[47] = new ModelRendererTurbo(this, 417, 9, textureX, textureY); // Box 62
		bodyModel[48] = new ModelRendererTurbo(this, 465, 9, textureX, textureY); // Box 12
		bodyModel[49] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 13
		bodyModel[50] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 16
		bodyModel[51] = new ModelRendererTurbo(this, 33, 33, textureX, textureY); // Box 17
		bodyModel[52] = new ModelRendererTurbo(this, 105, 33, textureX, textureY); // Box 18
		bodyModel[53] = new ModelRendererTurbo(this, 177, 33, textureX, textureY); // Box 19
		bodyModel[54] = new ModelRendererTurbo(this, 241, 33, textureX, textureY); // Box 20
		bodyModel[55] = new ModelRendererTurbo(this, 401, 25, textureX, textureY); // Box 77
		bodyModel[56] = new ModelRendererTurbo(this, 305, 33, textureX, textureY); // Box 78
		bodyModel[57] = new ModelRendererTurbo(this, 329, 33, textureX, textureY); // Box 79
		bodyModel[58] = new ModelRendererTurbo(this, 353, 33, textureX, textureY); // Box 81
		bodyModel[59] = new ModelRendererTurbo(this, 49, 41, textureX, textureY); // Box 82
		bodyModel[60] = new ModelRendererTurbo(this, 81, 41, textureX, textureY); // Box 83
		bodyModel[61] = new ModelRendererTurbo(this, 113, 41, textureX, textureY); // Box 84
		bodyModel[62] = new ModelRendererTurbo(this, 281, 9, textureX, textureY); // Box 85
		bodyModel[63] = new ModelRendererTurbo(this, 297, 9, textureX, textureY); // Box 86
		bodyModel[64] = new ModelRendererTurbo(this, 353, 9, textureX, textureY); // Box 87
		bodyModel[65] = new ModelRendererTurbo(this, 361, 9, textureX, textureY); // Box 88
		bodyModel[66] = new ModelRendererTurbo(this, 401, 9, textureX, textureY); // Box 89
		bodyModel[67] = new ModelRendererTurbo(this, 489, 9, textureX, textureY); // Box 90
		bodyModel[68] = new ModelRendererTurbo(this, 121, 17, textureX, textureY); // Box 91
		bodyModel[69] = new ModelRendererTurbo(this, 169, 17, textureX, textureY); // Box 92
		bodyModel[70] = new ModelRendererTurbo(this, 145, 41, textureX, textureY); // Box 93
		bodyModel[71] = new ModelRendererTurbo(this, 369, 9, textureX, textureY); // Box 94
		bodyModel[72] = new ModelRendererTurbo(this, 401, 9, textureX, textureY); // Box 95
		bodyModel[73] = new ModelRendererTurbo(this, 417, 9, textureX, textureY); // Box 96
		bodyModel[74] = new ModelRendererTurbo(this, 449, 9, textureX, textureY); // Box 98
		bodyModel[75] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 99
		bodyModel[76] = new ModelRendererTurbo(this, 473, 9, textureX, textureY); // Box 100
		bodyModel[77] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 101
		bodyModel[78] = new ModelRendererTurbo(this, 145, 17, textureX, textureY); // Box 102
		bodyModel[79] = new ModelRendererTurbo(this, 193, 17, textureX, textureY); // Box 103
		bodyModel[80] = new ModelRendererTurbo(this, 433, 25, textureX, textureY); // Box 104
		bodyModel[81] = new ModelRendererTurbo(this, 217, 17, textureX, textureY); // Box 105
		bodyModel[82] = new ModelRendererTurbo(this, 273, 17, textureX, textureY); // Box 106
		bodyModel[83] = new ModelRendererTurbo(this, 177, 41, textureX, textureY); // Box 107
		bodyModel[84] = new ModelRendererTurbo(this, 209, 41, textureX, textureY); // Box 108
		bodyModel[85] = new ModelRendererTurbo(this, 240, 51, textureX, textureY, "lamp"); // Light01
		bodyModel[86] = new ModelRendererTurbo(this, 240, 45, textureX, textureY, "lamp"); // Light01

		bodyModel[0].addBox(0F, 0F, 0F, 48, 1, 20, 0F); // Box 0
		bodyModel[0].setRotationPoint(-24F, 2F, -10F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 1, 4, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 1
		bodyModel[1].setRotationPoint(-24F, 3F, -10F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 1, 4, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 2
		bodyModel[2].setRotationPoint(23F, 3F, -10F);

		bodyModel[3].addBox(0F, 0F, 0F, 36, 5, 1, 0F); // Box 3
		bodyModel[3].setRotationPoint(-18F, 3F, -8F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 5, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 4
		bodyModel[4].setRotationPoint(-23F, 3F, -8F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 5, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 5
		bodyModel[5].setRotationPoint(18F, 3F, -8F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 5, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[6].setRotationPoint(18F, 3F, 7F);

		bodyModel[7].addBox(0F, 0F, 0F, 36, 5, 1, 0F); // Box 7
		bodyModel[7].setRotationPoint(-18F, 3F, 7F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 5, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 8
		bodyModel[8].setRotationPoint(-23F, 3F, 7F);

		bodyModel[9].addBox(0F, 0F, 0F, 4, 4, 10, 0F); // Box 9
		bodyModel[9].setRotationPoint(-15F, 5F, -5F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 10
		bodyModel[10].setRotationPoint(-15F, 3F, -9F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 18
		bodyModel[11].setRotationPoint(-12F, 3F, -9F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 19
		bodyModel[12].setRotationPoint(14F, 3F, -9F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 20
		bodyModel[13].setRotationPoint(11F, 3F, -9F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 21
		bodyModel[14].setRotationPoint(-15F, 3F, 8F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 22
		bodyModel[15].setRotationPoint(-12F, 3F, 8F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 23
		bodyModel[16].setRotationPoint(11F, 3F, 8F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 24
		bodyModel[17].setRotationPoint(14F, 3F, 8F);

		bodyModel[18].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 25
		bodyModel[18].setRotationPoint(-14F, 6F, -9F);

		bodyModel[19].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 26
		bodyModel[19].setRotationPoint(12F, 6F, -9F);

		bodyModel[20].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 27
		bodyModel[20].setRotationPoint(12F, 6F, 8F);

		bodyModel[21].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 28
		bodyModel[21].setRotationPoint(-14F, 6F, 8F);

		bodyModel[22].addBox(0F, 0F, 0F, 2, 2, 14, 0F); // Box 30
		bodyModel[22].setRotationPoint(-14F, 6F, -7F);

		bodyModel[23].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 32
		bodyModel[23].setRotationPoint(-16F, 5F, -4F);

		bodyModel[24].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 33
		bodyModel[24].setRotationPoint(-16F, 5F, 3F);

		bodyModel[25].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 34
		bodyModel[25].setRotationPoint(15F, 5F, -4F);

		bodyModel[26].addBox(0F, 0F, 0F, 4, 4, 10, 0F); // Box 35
		bodyModel[26].setRotationPoint(11F, 5F, -5F);

		bodyModel[27].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 37
		bodyModel[27].setRotationPoint(15F, 5F, 3F);

		bodyModel[28].addBox(0F, 0F, 0F, 2, 2, 14, 0F); // Box 38
		bodyModel[28].setRotationPoint(12F, 6F, -7F);

		bodyModel[29].addBox(0F, 0F, 0F, 20, 5, 18, 0F); // Box 39
		bodyModel[29].setRotationPoint(-10F, 3F, -9F);

		bodyModel[30].addBox(0F, 0F, 0F, 6, 6, 0, 0F); // Box 40
		bodyModel[30].setRotationPoint(-16F, 4F, 6F);

		bodyModel[31].addBox(0F, 0F, 0F, 6, 6, 0, 0F); // Box 43
		bodyModel[31].setRotationPoint(-16F, 4F, -6F);

		bodyModel[32].addBox(0F, 0F, 0F, 6, 6, 0, 0F); // Box 44
		bodyModel[32].setRotationPoint(10F, 4F, 6F);

		bodyModel[33].addBox(0F, 0F, 0F, 6, 6, 0, 0F); // Box 45
		bodyModel[33].setRotationPoint(10F, 4F, -6F);

		bodyModel[34].addBox(0F, 0F, 0F, 0, 6, 1, 0F); // Box 46
		bodyModel[34].setRotationPoint(5F, 3F, 9F);

		bodyModel[35].addBox(0F, 0F, 0F, 0, 6, 1, 0F); // Box 47
		bodyModel[35].setRotationPoint(8F, 3F, 9F);

		bodyModel[36].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 48
		bodyModel[36].setRotationPoint(5F, 8F, 9F);

		bodyModel[37].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 49
		bodyModel[37].setRotationPoint(5F, 6F, 9F);

		bodyModel[38].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 50
		bodyModel[38].setRotationPoint(5F, 4F, 9F);

		bodyModel[39].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 51
		bodyModel[39].setRotationPoint(5F, 4F, -10F);

		bodyModel[40].addBox(0F, 0F, 0F, 0, 6, 1, 0F); // Box 52
		bodyModel[40].setRotationPoint(8F, 3F, -10F);

		bodyModel[41].addBox(0F, 0F, 0F, 0, 6, 1, 0F); // Box 53
		bodyModel[41].setRotationPoint(5F, 3F, -10F);

		bodyModel[42].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 54
		bodyModel[42].setRotationPoint(5F, 6F, -10F);

		bodyModel[43].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 55
		bodyModel[43].setRotationPoint(5F, 8F, -10F);

		bodyModel[44].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 56
		bodyModel[44].setRotationPoint(-27F, 5F, -1.5F);

		bodyModel[45].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 57
		bodyModel[45].setRotationPoint(24F, 5F, -1.5F);

		bodyModel[46].addBox(0F, 0F, 0F, 9, 8, 12, 0F); // Box 61
		bodyModel[46].setRotationPoint(15F, -6F, -6F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 9, 2, 12, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 62
		bodyModel[47].setRotationPoint(15F, -8F, -6F);

		bodyModel[48].addBox(0F, 0F, 0F, 1, 17, 20, 0F); // Box 12
		bodyModel[48].setRotationPoint(-15F, -15F, -10F);

		bodyModel[49].addBox(0F, 0F, 0F, 2, 17, 20, 0F); // Box 13
		bodyModel[49].setRotationPoint(-1F, -15F, -10F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 30, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 16
		bodyModel[50].setRotationPoint(-15F, -17F, 7F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 30, 3, 4, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		bodyModel[51].setRotationPoint(-15F, -18F, 3F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 30, 3, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 18
		bodyModel[52].setRotationPoint(-15F, -18F, -7F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 30, 2, 3, 0F,0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 19
		bodyModel[53].setRotationPoint(-15F, -17F, -10F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 30, 3, 6, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 20
		bodyModel[54].setRotationPoint(-15F, -18F, -3F);

		bodyModel[55].addBox(0F, 0F, 0F, 9, 8, 12, 0F); // Box 77
		bodyModel[55].setRotationPoint(-24F, -6F, -6F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 9, 2, 12, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 78
		bodyModel[56].setRotationPoint(-24F, -8F, -6F);

		bodyModel[57].addBox(0F, 0F, 0F, 1, 17, 20, 0F); // Box 79
		bodyModel[57].setRotationPoint(14F, -15F, -10F);

		bodyModel[58].addBox(0F, 0F, 0F, 13, 17, 1, 0F); // Box 81
		bodyModel[58].setRotationPoint(-14F, -15F, -10F);

		bodyModel[59].addBox(0F, 0F, 0F, 13, 17, 1, 0F); // Box 82
		bodyModel[59].setRotationPoint(-14F, -15F, 9F);

		bodyModel[60].addBox(0F, 0F, 0F, 13, 17, 1, 0F); // Box 83
		bodyModel[60].setRotationPoint(1F, -15F, 9F);

		bodyModel[61].addBox(0F, 0F, 0F, 13, 17, 1, 0F); // Box 84
		bodyModel[61].setRotationPoint(1F, -15F, -10F);

		bodyModel[62].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 85
		bodyModel[62].setRotationPoint(-6F, -19F, -5F);

		bodyModel[63].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 86
		bodyModel[63].setRotationPoint(-6F, -19F, 4F);

		bodyModel[64].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 87
		bodyModel[64].setRotationPoint(5F, -19F, 4F);

		bodyModel[65].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 88
		bodyModel[65].setRotationPoint(5F, -19F, -5F);

		bodyModel[66].addBox(0F, 0F, 0F, 1, 1, 10, 0F); // Box 89
		bodyModel[66].setRotationPoint(5F, -20F, -5F);

		bodyModel[67].addBox(0F, 0F, 0F, 1, 1, 10, 0F); // Box 90
		bodyModel[67].setRotationPoint(-6F, -20F, -5F);

		bodyModel[68].addBox(0F, 0F, 0F, 10, 1, 1, 0F); // Box 91
		bodyModel[68].setRotationPoint(-5F, -20F, -4F);

		bodyModel[69].addBox(0F, 0F, 0F, 10, 1, 1, 0F); // Box 92
		bodyModel[69].setRotationPoint(-5F, -20F, 3F);

		bodyModel[70].addBox(0F, 0F, 0F, 2, 1, 12, 0F); // Box 93
		bodyModel[70].setRotationPoint(-1F, -29F, -6F);

		bodyModel[71].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 94
		bodyModel[71].setRotationPoint(-1F, -28F, -4F);

		bodyModel[72].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 95
		bodyModel[72].setRotationPoint(-1F, -28F, 3F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 5, 3, 0, 0F,0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); // Box 96
		bodyModel[73].setRotationPoint(0F, -27F, 4F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 5, 3, 0, 0F,-4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Box 98
		bodyModel[74].setRotationPoint(0F, -23F, 4F);

		bodyModel[75].addBox(0F, 0F, 0F, 1, 1, 8, 0F); // Box 99
		bodyModel[75].setRotationPoint(4F, -24F, -4F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 5, 3, 0, 0F,0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); // Box 100
		bodyModel[76].setRotationPoint(0F, -27F, -4F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 5, 3, 0, 0F,-4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Box 101
		bodyModel[77].setRotationPoint(0F, -23F, -4F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 5, 3, 0, 0F,-4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Box 102
		bodyModel[78].setRotationPoint(-5F, -27F, 4F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 5, 3, 0, 0F,0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); // Box 103
		bodyModel[79].setRotationPoint(-5F, -23F, 4F);

		bodyModel[80].addBox(0F, 0F, 0F, 1, 1, 8, 0F); // Box 104
		bodyModel[80].setRotationPoint(-5F, -24F, -4F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 5, 3, 0, 0F,-4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Box 105
		bodyModel[81].setRotationPoint(-5F, -27F, -4F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 5, 3, 0, 0F,0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); // Box 106
		bodyModel[82].setRotationPoint(-5F, -23F, -4F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 3, 2, 12, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 107
		bodyModel[83].setRotationPoint(-14F, -6F, -6F);

		bodyModel[84].addBox(0F, 0F, 0F, 3, 6, 12, 0F); // Box 108
		bodyModel[84].setRotationPoint(-14F, -4F, -6F);

		bodyModel[85].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Light01
		bodyModel[85].setRotationPoint(-16F, -17F, -1F);

		bodyModel[86].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Light01
		bodyModel[86].setRotationPoint(15F, -17F, -1F);
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
	public float[] getTrans() {
		return new float[]{-0.5F, 0.155F, 0F};
	}
}