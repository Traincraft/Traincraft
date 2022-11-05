//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2022 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 07.08.2022 - 21:37:27
// Last changed on: 07.08.2022 - 21:37:27


package train.client.render.models;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;

import org.lwjgl.opengl.GL11;
import tmt.ModelBase;
import tmt.ModelConverter;
import tmt.ModelRendererTurbo;

public class ModelMetalTramCoach extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelMetalTramCoach() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[146];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 43, 2, textureX, textureY); // Box 1
		bodyModel[2] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 29
		bodyModel[3] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 30
		bodyModel[4] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 31
		bodyModel[5] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 57
		bodyModel[6] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 66
		bodyModel[7] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 67
		bodyModel[8] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 66
		bodyModel[9] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 67
		bodyModel[10] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 70
		bodyModel[11] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 71
		bodyModel[12] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 70
		bodyModel[13] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 71
		bodyModel[14] = new ModelRendererTurbo(this, 129, 9, textureX, textureY); // Box 32
		bodyModel[15] = new ModelRendererTurbo(this, 209, 9, textureX, textureY); // Box 33
		bodyModel[16] = new ModelRendererTurbo(this, 289, 9, textureX, textureY); // Box 34
		bodyModel[17] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 64
		bodyModel[18] = new ModelRendererTurbo(this, 401, 9, textureX, textureY); // Box 65
		bodyModel[19] = new ModelRendererTurbo(this, 409, 9, textureX, textureY); // Box 70
		bodyModel[20] = new ModelRendererTurbo(this, 417, 9, textureX, textureY); // Box 71
		bodyModel[21] = new ModelRendererTurbo(this, 425, 9, textureX, textureY); // Box 64
		bodyModel[22] = new ModelRendererTurbo(this, 433, 9, textureX, textureY); // Box 65
		bodyModel[23] = new ModelRendererTurbo(this, 441, 9, textureX, textureY); // Box 70
		bodyModel[24] = new ModelRendererTurbo(this, 449, 9, textureX, textureY); // Box 71
		bodyModel[25] = new ModelRendererTurbo(this, 457, 9, textureX, textureY); // Box 29
		bodyModel[26] = new ModelRendererTurbo(this, 473, 9, textureX, textureY); // Box 30
		bodyModel[27] = new ModelRendererTurbo(this, 489, 9, textureX, textureY); // Box 31
		bodyModel[28] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 29
		bodyModel[29] = new ModelRendererTurbo(this, 65, 17, textureX, textureY); // Box 30
		bodyModel[30] = new ModelRendererTurbo(this, 81, 17, textureX, textureY); // Box 31
		bodyModel[31] = new ModelRendererTurbo(this, 97, 17, textureX, textureY); // Box 33
		bodyModel[32] = new ModelRendererTurbo(this, 113, 17, textureX, textureY); // Box 34
		bodyModel[33] = new ModelRendererTurbo(this, 129, 17, textureX, textureY); // Box 32
		bodyModel[34] = new ModelRendererTurbo(this, 145, 17, textureX, textureY); // Box 33
		bodyModel[35] = new ModelRendererTurbo(this, 161, 17, textureX, textureY); // Box 34
		bodyModel[36] = new ModelRendererTurbo(this, 177, 17, textureX, textureY); // Box 33
		bodyModel[37] = new ModelRendererTurbo(this, 249, 17, textureX, textureY); // Box 29
		bodyModel[38] = new ModelRendererTurbo(this, 345, 17, textureX, textureY); // Box 1
		bodyModel[39] = new ModelRendererTurbo(this, 393, 17, textureX, textureY); // Box 1
		bodyModel[40] = new ModelRendererTurbo(this, 329, 17, textureX, textureY); // Box 34
		bodyModel[41] = new ModelRendererTurbo(this, 16, 40, textureX, textureY); // Box 1
		bodyModel[42] = new ModelRendererTurbo(this, 57, 25, textureX, textureY); // Box 1
		bodyModel[43] = new ModelRendererTurbo(this, 489, 17, textureX, textureY); // Box 1
		bodyModel[44] = new ModelRendererTurbo(this, 265, 25, textureX, textureY); // Box 1
		bodyModel[45] = new ModelRendererTurbo(this, 49, 49, textureX, textureY); // Box 1
		bodyModel[46] = new ModelRendererTurbo(this, 505, 9, textureX, textureY); // Box 0
		bodyModel[47] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 0
		bodyModel[48] = new ModelRendererTurbo(this, 345, 17, textureX, textureY); // Box 0
		bodyModel[49] = new ModelRendererTurbo(this, 353, 17, textureX, textureY); // Box 0
		bodyModel[50] = new ModelRendererTurbo(this, 361, 17, textureX, textureY); // lamp
		bodyModel[51] = new ModelRendererTurbo(this, 377, 17, textureX, textureY); // lamp
		bodyModel[52] = new ModelRendererTurbo(this, 385, 17, textureX, textureY); // lamp
		bodyModel[53] = new ModelRendererTurbo(this, 393, 17, textureX, textureY); // lamp
		bodyModel[54] = new ModelRendererTurbo(this, 73, 49, textureX, textureY); // Box 1
		bodyModel[55] = new ModelRendererTurbo(this, 97, 49, textureX, textureY); // Box 1
		bodyModel[56] = new ModelRendererTurbo(this, 121, 49, textureX, textureY); // Box 1
		bodyModel[57] = new ModelRendererTurbo(this, 401, 17, textureX, textureY); // Box 0
		bodyModel[58] = new ModelRendererTurbo(this, 425, 17, textureX, textureY); // Box 0
		bodyModel[59] = new ModelRendererTurbo(this, 433, 17, textureX, textureY); // Box 0
		bodyModel[60] = new ModelRendererTurbo(this, 441, 17, textureX, textureY); // Box 0
		bodyModel[61] = new ModelRendererTurbo(this, 409, 17, textureX, textureY); // lamp
		bodyModel[62] = new ModelRendererTurbo(this, 449, 17, textureX, textureY); // lamp
		bodyModel[63] = new ModelRendererTurbo(this, 457, 17, textureX, textureY); // lamp
		bodyModel[64] = new ModelRendererTurbo(this, 473, 17, textureX, textureY); // lamp
		bodyModel[65] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 34
		bodyModel[66] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 34
		bodyModel[67] = new ModelRendererTurbo(this, 57, 25, textureX, textureY); // Box 34
		bodyModel[68] = new ModelRendererTurbo(this, 185, 25, textureX, textureY); // Box 34
		bodyModel[69] = new ModelRendererTurbo(this, 289, 49, textureX, textureY); // Box 1
		bodyModel[70] = new ModelRendererTurbo(this, 345, 49, textureX, textureY); // Box 1
		bodyModel[71] = new ModelRendererTurbo(this, 202, 77, textureX, textureY); // Box 1
		bodyModel[72] = new ModelRendererTurbo(this, 49, 81, textureX, textureY); // Box 1
		bodyModel[73] = new ModelRendererTurbo(this, 241, 25, textureX, textureY); // Box 1
		bodyModel[74] = new ModelRendererTurbo(this, 145, 49, textureX, textureY); // Box 1
		bodyModel[75] = new ModelRendererTurbo(this, 177, 49, textureX, textureY); // Box 1
		bodyModel[76] = new ModelRendererTurbo(this, 473, 49, textureX, textureY); // Box 1
		bodyModel[77] = new ModelRendererTurbo(this, 409, 81, textureX, textureY); // Box 0
		bodyModel[78] = new ModelRendererTurbo(this, 445, 100, textureX, textureY); // Box 1
		bodyModel[79] = new ModelRendererTurbo(this, 361, 89, textureX, textureY); // Box 1
		bodyModel[80] = new ModelRendererTurbo(this, 105, 97, textureX, textureY); // Box 1
		bodyModel[81] = new ModelRendererTurbo(this, 225, 25, textureX, textureY); // Box 1
		bodyModel[82] = new ModelRendererTurbo(this, 425, 25, textureX, textureY); // Box 1
		bodyModel[83] = new ModelRendererTurbo(this, 265, 25, textureX, textureY); // Box 1
		bodyModel[84] = new ModelRendererTurbo(this, 441, 25, textureX, textureY); // Box 1
		bodyModel[85] = new ModelRendererTurbo(this, 201, 57, textureX, textureY); // Box 102
		bodyModel[86] = new ModelRendererTurbo(this, 201, 65, textureX, textureY); // Box 102
		bodyModel[87] = new ModelRendererTurbo(this, 137, 97, textureX, textureY); // Box 102
		bodyModel[88] = new ModelRendererTurbo(this, 33, 105, textureX, textureY); // Box 102
		bodyModel[89] = new ModelRendererTurbo(this, 137, 105, textureX, textureY); // Box 102
		bodyModel[90] = new ModelRendererTurbo(this, 57, 113, textureX, textureY); // Box 102
		bodyModel[91] = new ModelRendererTurbo(this, 418, 144, textureX, textureY); // Box 1
		bodyModel[92] = new ModelRendererTurbo(this, 418, 144, textureX, textureY); // Box 1
		bodyModel[93] = new ModelRendererTurbo(this, 418, 144, textureX, textureY); // Box 1
		bodyModel[94] = new ModelRendererTurbo(this, 418, 144, textureX, textureY); // Box 1
		bodyModel[95] = new ModelRendererTurbo(this, 203, 74, textureX, textureY); // Box 1
		bodyModel[96] = new ModelRendererTurbo(this, 203, 74, textureX, textureY); // Box 1
		bodyModel[97] = new ModelRendererTurbo(this, 204, 75, textureX, textureY); // Box 1
		bodyModel[98] = new ModelRendererTurbo(this, 209, 75, textureX, textureY); // Box 1
		bodyModel[99] = new ModelRendererTurbo(this, 209, 76, textureX, textureY); // Box 1
		bodyModel[100] = new ModelRendererTurbo(this, 203, 74, textureX, textureY); // Box 1
		bodyModel[101] = new ModelRendererTurbo(this, 203, 74, textureX, textureY); // Box 1
		bodyModel[102] = new ModelRendererTurbo(this, 203, 74, textureX, textureY); // Box 1
		bodyModel[103] = new ModelRendererTurbo(this, 208, 76, textureX, textureY); // Box 1
		bodyModel[104] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 57
		bodyModel[105] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 57
		bodyModel[106] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 57
		bodyModel[107] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 57
		bodyModel[108] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 57
		bodyModel[109] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 57
		bodyModel[110] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 57
		bodyModel[111] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 57
		bodyModel[112] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 57
		bodyModel[113] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 57
		bodyModel[114] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 57
		bodyModel[115] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 57
		bodyModel[116] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 57
		bodyModel[117] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 57
		bodyModel[118] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 57
		bodyModel[119] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 57
		bodyModel[120] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 57
		bodyModel[121] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 57
		bodyModel[122] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 57
		bodyModel[123] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 57
		bodyModel[124] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 57
		bodyModel[125] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 57
		bodyModel[126] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 57
		bodyModel[127] = new ModelRendererTurbo(this, 15, 39, textureX, textureY); // Box 1
		bodyModel[128] = new ModelRendererTurbo(this, 16, 40, textureX, textureY); // Box 1
		bodyModel[129] = new ModelRendererTurbo(this, 16, 40, textureX, textureY); // Box 1
		bodyModel[130] = new ModelRendererTurbo(this, 15, 39, textureX, textureY); // Box 1
		bodyModel[131] = new ModelRendererTurbo(this, 16, 40, textureX, textureY); // Box 1
		bodyModel[132] = new ModelRendererTurbo(this, 439, 96, textureX, textureY); // Box 1
		bodyModel[133] = new ModelRendererTurbo(this, 440, 96, textureX, textureY); // Box 1
		bodyModel[134] = new ModelRendererTurbo(this, 445, 100, textureX, textureY); // Box 1
		bodyModel[135] = new ModelRendererTurbo(this, 445, 100, textureX, textureY); // Box 1
		bodyModel[136] = new ModelRendererTurbo(this, 445, 101, textureX, textureY); // Box 1
		bodyModel[137] = new ModelRendererTurbo(this, 439, 96, textureX, textureY); // Box 1
		bodyModel[138] = new ModelRendererTurbo(this, 440, 97, textureX, textureY); // Box 1
		bodyModel[139] = new ModelRendererTurbo(this, 445, 100, textureX, textureY); // Box 1
		bodyModel[140] = new ModelRendererTurbo(this, 446, 101, textureX, textureY); // Box 1
		bodyModel[141] = new ModelRendererTurbo(this, 43, 2, textureX, textureY); // Box 1
		bodyModel[142] = new ModelRendererTurbo(this, 43, 2, textureX, textureY); // Box 1
		bodyModel[143] = new ModelRendererTurbo(this, 43, 2, textureX, textureY); // Box 1
		bodyModel[144] = new ModelRendererTurbo(this, 377, 29, textureX, textureY); // Box 156
		bodyModel[145] = new ModelRendererTurbo(this, 377, 29, textureX, textureY); // Box 157

		bodyModel[0].addBox(0F, 0F, 0F, 1, 1, 16, 0F); // Box 0
		bodyModel[0].setRotationPoint(11F, 5.5F, -8F);

		bodyModel[1].addBox(0F, 0F, 0F, 8, 8, 0, 0F); // Box 1
		bodyModel[1].setRotationPoint(-15.5F, 2F, -5.5F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 38, 2, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 29
		bodyModel[2].setRotationPoint(-19F, 3F, 7.5F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 38, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 30
		bodyModel[3].setRotationPoint(-19F, 3F, 7.5F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 38, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 31
		bodyModel[4].setRotationPoint(-19F, 4.75F, 7.5F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 57
		bodyModel[5].setRotationPoint(13.5F, 5F, 7.5F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0.9F, 0F, 0F, 0.9F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 1.1F, -0.5F, 0F, 1.1F, -0.5F, 0F, -0.5F, 0F, 0F); // Box 66
		bodyModel[6].setRotationPoint(7F, 6F, 7.5F);

		bodyModel[7].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 67
		bodyModel[7].setRotationPoint(7F, 4F, 8F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0.9F, 0F, 0F, 0.9F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 1.1F, -0.5F, 0F, 1.1F, -0.5F, 0F, -0.5F, 0F, 0F); // Box 66
		bodyModel[8].setRotationPoint(-16F, 6F, 7.5F);

		bodyModel[9].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 67
		bodyModel[9].setRotationPoint(-16F, 4F, 8F);

		bodyModel[10].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 70
		bodyModel[10].setRotationPoint(15F, 4F, 8F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.9F, 0F, 0F, 1.1F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 1.1F, -0.5F, 0F); // Box 71
		bodyModel[11].setRotationPoint(15F, 6F, 7.5F);

		bodyModel[12].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 70
		bodyModel[12].setRotationPoint(-8F, 4F, 8F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.9F, 0F, 0F, 1.1F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 1.1F, -0.5F, 0F); // Box 71
		bodyModel[13].setRotationPoint(-8F, 6F, 7.5F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 38, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 32
		bodyModel[14].setRotationPoint(-19F, 4.75F, -8.5F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 38, 2, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 33
		bodyModel[15].setRotationPoint(-19F, 3F, -8.5F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 38, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 34
		bodyModel[16].setRotationPoint(-19F, 3F, -8.5F);

		bodyModel[17].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 64
		bodyModel[17].setRotationPoint(7F, 4F, -9F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0.9F, 0F, 0F, 0.9F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 1.1F, -0.5F, 0F, 1.1F, -0.5F, 0F, -0.5F, 0F, 0F); // Box 65
		bodyModel[18].setRotationPoint(7F, 6F, -8.5F);

		bodyModel[19].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 70
		bodyModel[19].setRotationPoint(-8F, 4F, -9F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.9F, 0F, 0F, 1.1F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 1.1F, -0.5F, 0F); // Box 71
		bodyModel[20].setRotationPoint(-8F, 6F, -8.5F);

		bodyModel[21].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 64
		bodyModel[21].setRotationPoint(-16F, 4F, -9F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0.9F, 0F, 0F, 0.9F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 1.1F, -0.5F, 0F, 1.1F, -0.5F, 0F, -0.5F, 0F, 0F); // Box 65
		bodyModel[22].setRotationPoint(-16F, 6F, -8.5F);

		bodyModel[23].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 70
		bodyModel[23].setRotationPoint(15F, 4F, -9F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.9F, 0F, 0F, 1.1F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 1.1F, -0.5F, 0F); // Box 71
		bodyModel[24].setRotationPoint(15F, 6F, -8.5F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 29
		bodyModel[25].setRotationPoint(-26F, 3F, 7.5F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 30
		bodyModel[26].setRotationPoint(-26F, 3F, 7.5F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 31
		bodyModel[27].setRotationPoint(-26F, 4.75F, 7.5F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 29
		bodyModel[28].setRotationPoint(20F, 3F, 7.5F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 30
		bodyModel[29].setRotationPoint(20F, 3F, 7.5F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 31
		bodyModel[30].setRotationPoint(20F, 4.75F, 7.5F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 33
		bodyModel[31].setRotationPoint(-26F, 3F, -9.5F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 34
		bodyModel[32].setRotationPoint(-26F, 3F, -9.5F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 32
		bodyModel[33].setRotationPoint(20F, 4.75F, -9.5F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 33
		bodyModel[34].setRotationPoint(20F, 3F, -9.5F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 34
		bodyModel[35].setRotationPoint(20F, 3F, -9.5F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 32, 1, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 33
		bodyModel[36].setRotationPoint(-16F, 7.5F, -9.5F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 32, 1, 2, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 29
		bodyModel[37].setRotationPoint(-16F, 7.5F, 7.5F);

		bodyModel[38].addBox(0F, 0F, 0F, 1, 4, 22, 0F); // Box 1
		bodyModel[38].setRotationPoint(19F, 2.5F, -11F);

		bodyModel[39].addBox(0F, 0F, 0F, 1, 4, 22, 0F); // Box 1
		bodyModel[39].setRotationPoint(-20F, 2.5F, -11F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		bodyModel[40].setRotationPoint(-26F, 4F, -9.5F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 3, 2, 7, 0F,0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[41].setRotationPoint(-29F, 1.5F, -11F);

		bodyModel[42].addBox(0F, 0F, 0F, 52, 1, 22, 0F); // Box 1
		bodyModel[42].setRotationPoint(-26F, 1.5F, -11F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 1, 20, 7, 0F,0F, 0F, 0F, -0.95F, 0F, 0F, -2.95F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -0.95F, 0F, 0F, -2.95F, 0F, 0F, 2F, 0F, 0F); // Box 1
		bodyModel[43].setRotationPoint(-26.01F, -18.5F, -11F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 1, 20, 8, 0F,0F, 0F, 0F, -0.95F, 0F, 0F, -0.95F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.95F, 0F, 0F, -0.95F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[44].setRotationPoint(-28.01F, -18.5F, -4F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 1, 20, 7, 0F,2F, 0F, 0F, -2.95F, 0F, 0F, -0.95F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2.95F, 0F, 0F, -0.95F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[45].setRotationPoint(-26.01F, -18.5F, 4F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.625F, -0.625F, 0F, -0.625F, -0.625F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[46].setRotationPoint(-29.02F, -5F, 0F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.625F, -0.625F, 0F, -0.625F, -0.625F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[47].setRotationPoint(-29.02F, -5F, -2F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.625F, -0.625F, 0F, -0.625F, -0.625F); // Box 0
		bodyModel[48].setRotationPoint(-29.02F, -3F, 0F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.625F, -0.625F, 0F, -0.625F, -0.625F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[49].setRotationPoint(-29.02F, -3F, -2F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // lamp
		bodyModel[50].setRotationPoint(-29.51F, -4F, 0F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // lamp
		bodyModel[51].setRotationPoint(-29.51F, -4F, -1F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // lamp
		bodyModel[52].setRotationPoint(-29.51F, -3F, 0F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // lamp
		bodyModel[53].setRotationPoint(-29.51F, -3F, -1F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 1, 20, 7, 0F,-0.95F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2.95F, 0F, 0F, -0.95F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2.95F, 0F, 0F); // Box 1
		bodyModel[54].setRotationPoint(25.01F, -18.5F, -11F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 1, 20, 8, 0F,-0.95F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.95F, 0F, 0F, -0.95F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.95F, 0F, 0F); // Box 1
		bodyModel[55].setRotationPoint(27.01F, -18.5F, -4F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 1, 20, 7, 0F,-2.95F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -0.95F, 0F, 0F, -2.95F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -0.95F, 0F, 0F); // Box 1
		bodyModel[56].setRotationPoint(25.01F, -18.5F, 4F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.625F, -0.625F, 0F, -0.625F, -0.625F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[57].setRotationPoint(28.01F, -5F, 0F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.625F, -0.625F, 0F, -0.625F, -0.625F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[58].setRotationPoint(28.01F, -5F, -2F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.625F, -0.625F, 0F, -0.625F, -0.625F); // Box 0
		bodyModel[59].setRotationPoint(28.01F, -3F, 0F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.625F, -0.625F, 0F, -0.625F, -0.625F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[60].setRotationPoint(28.01F, -3F, -2F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // lamp
		bodyModel[61].setRotationPoint(28.5F, -4F, 0F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // lamp
		bodyModel[62].setRotationPoint(28.5F, -4F, -1F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // lamp
		bodyModel[63].setRotationPoint(28.5F, -3F, 0F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // lamp
		bodyModel[64].setRotationPoint(28.5F, -3F, -1F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 8, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 34
		bodyModel[65].setRotationPoint(-26F, 6.5F, -11.5F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 8, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 34
		bodyModel[66].setRotationPoint(-26F, 6.5F, 9.5F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 8, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 34
		bodyModel[67].setRotationPoint(18F, 6.5F, -11.5F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 8, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 34
		bodyModel[68].setRotationPoint(18F, 6.5F, 9.5F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 34, 20, 1, 0F,0F, 0F, -0.95F, 0F, 0F, -0.95F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.95F, 0F, 0F, -0.95F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[69].setRotationPoint(-17F, -18.5F, -12F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 52, 2, 22, 0F,0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[70].setRotationPoint(-26F, -20.5F, -11F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[71].setRotationPoint(-28F, -20.5F, -4F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 34, 20, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.95F, 0F, 0F, -0.95F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.95F, 0F, 0F, -0.95F); // Box 1
		bodyModel[72].setRotationPoint(-17F, -18.5F, 11F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 9, 20, 1, 0F,0F, 0F, -0.95F, 0F, 0F, -0.95F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.95F, 0F, 0F, -0.95F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[73].setRotationPoint(-26F, -18.5F, -12F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 9, 20, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.95F, 0F, 0F, -0.95F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.95F, 0F, 0F, -0.95F); // Box 1
		bodyModel[74].setRotationPoint(-26F, -18.5F, 11F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 9, 20, 1, 0F,0F, 0F, -0.95F, 0F, 0F, -0.95F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.95F, 0F, 0F, -0.95F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[75].setRotationPoint(17F, -18.5F, -12F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 9, 20, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.95F, 0F, 0F, -0.95F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.95F, 0F, 0F, -0.95F); // Box 1
		bodyModel[76].setRotationPoint(17F, -18.5F, 11F);

		bodyModel[77].addBox(0F, 0F, 0F, 1, 1, 16, 0F); // Box 0
		bodyModel[77].setRotationPoint(-12F, 5.5F, -8F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 1, 10, 3, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[78].setRotationPoint(-28F, -8.5F, -7F);

		bodyModel[79].addBox(0F, 0F, 0F, 2, 10, 22, 0F); // Box 1
		bodyModel[79].setRotationPoint(24F, -8.5F, -11F);

		bodyModel[80].addBox(0F, 0F, 0F, 2, 10, 22, 0F); // Box 1
		bodyModel[80].setRotationPoint(-26F, -8.5F, -11F);

		bodyModel[81].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 1
		bodyModel[81].setRotationPoint(-26F, -9.5F, 5F);

		bodyModel[82].addBox(0F, 0F, 0F, 3, 0, 3, 0F); // Box 1
		bodyModel[82].setRotationPoint(-27F, -9.5F, 4F);

		bodyModel[83].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 1
		bodyModel[83].setRotationPoint(25F, -9.5F, -6F);

		bodyModel[84].addBox(0F, 0F, 0F, 3, 0, 3, 0F); // Box 1
		bodyModel[84].setRotationPoint(24F, -9.5F, -7F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 33, 1, 3, 0F,0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0F, 0F, 0F); // Box 102
		bodyModel[85].setRotationPoint(-16.5F, -3.5F, -10.75F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 33, 5, 1, 0F,0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F); // Box 102
		bodyModel[86].setRotationPoint(-16.5F, -8.5F, -10.75F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 33, 5, 1, 0F,0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F); // Box 102
		bodyModel[87].setRotationPoint(-16.5F, -8.5F, 9.75F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 33, 1, 3, 0F,0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0F, 0F, 0F); // Box 102
		bodyModel[88].setRotationPoint(-16.5F, -3.5F, 7.75F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 31, 4, 1, 0F,0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F); // Box 102
		bodyModel[89].setRotationPoint(-15.5F, -2.5F, -10.75F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 31, 4, 1, 0F,0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F); // Box 102
		bodyModel[90].setRotationPoint(-15.5F, -2.5F, 9.75F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 1, 6, 11, 0F,-0.95F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 1.05F, 0F, 0F, -0.95F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 2.05F, 0F, 0F); // Box 1
		bodyModel[91].setRotationPoint(-27F, 3.5F, -11F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 1, 6, 11, 0F,1.05F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -0.95F, 0F, 0F, 2.05F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -0.95F, 0F, 0F); // Box 1
		bodyModel[92].setRotationPoint(-27F, 3.5F, 0F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 1, 6, 11, 0F,2.05F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -0.95F, 0F, 0F, 1.05F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -0.95F, 0F, 0F); // Box 1
		bodyModel[93].setRotationPoint(28F, 3.5F, -11F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 1, 6, 11, 0F,-0.95F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 2.05F, 0F, 0F, -0.95F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 1.05F, 0F, 0F); // Box 1
		bodyModel[94].setRotationPoint(28F, 3.5F, 0F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 2, 2, 7, 0F,-2F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 1
		bodyModel[95].setRotationPoint(-28F, -20.5F, -11F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 2, 2, 7, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, -2F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 1
		bodyModel[96].setRotationPoint(-28F, -20.5F, 4F);

		bodyModel[97].addBox(0F, 0F, 0F, 2, 2, 6, 0F); // Box 1
		bodyModel[97].setRotationPoint(-28F, -20.5F, -3F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 1
		bodyModel[98].setRotationPoint(-28F, -20.5F, 3F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[99].setRotationPoint(26F, -20.5F, -4F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 2, 2, 7, 0F,0F, -2F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 1
		bodyModel[100].setRotationPoint(26F, -20.5F, -11F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 2, 2, 7, 0F,0F, 0F, -1F, 0F, 0F, 0F, -2F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[101].setRotationPoint(26F, -20.5F, 4F);

		bodyModel[102].addBox(0F, 0F, 0F, 2, 2, 6, 0F); // Box 1
		bodyModel[102].setRotationPoint(26F, -20.5F, -3F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 1
		bodyModel[103].setRotationPoint(26F, -20.5F, 3F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,1F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 1F, 0F, 0F, 1F, -0.25F, 0F, -1.75F, -0.25F, 0F, -1.75F, -0.25F, 0F, 1F, -0.25F, 0F); // Box 57
		bodyModel[104].setRotationPoint(12.5F, 7F, 7.5F);

		bodyModel[105].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 57
		bodyModel[105].setRotationPoint(11.5F, 5F, 7.5F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Box 57
		bodyModel[106].setRotationPoint(8.5F, 5F, 7.5F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.25F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0.25F, 0F, 0F, -1.75F, -0.25F, 0F, 1F, -0.25F, 0F, 1F, -0.25F, 0F, -1.75F, -0.25F, 0F); // Box 57
		bodyModel[107].setRotationPoint(9.5F, 7F, 7.5F);

		bodyModel[108].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 57
		bodyModel[108].setRotationPoint(9.5F, 5F, 7.5F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 57
		bodyModel[109].setRotationPoint(-9.5F, 5F, 7.5F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,1F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 1F, 0F, 0F, 1F, -0.25F, 0F, -1.75F, -0.25F, 0F, -1.75F, -0.25F, 0F, 1F, -0.25F, 0F); // Box 57
		bodyModel[110].setRotationPoint(-10.5F, 7F, 7.5F);

		bodyModel[111].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 57
		bodyModel[111].setRotationPoint(-11.5F, 5F, 7.5F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Box 57
		bodyModel[112].setRotationPoint(-14.5F, 5F, 7.5F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.25F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0.25F, 0F, 0F, -1.75F, -0.25F, 0F, 1F, -0.25F, 0F, 1F, -0.25F, 0F, -1.75F, -0.25F, 0F); // Box 57
		bodyModel[113].setRotationPoint(-13.5F, 7F, 7.5F);

		bodyModel[114].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 57
		bodyModel[114].setRotationPoint(-13.5F, 5F, 7.5F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 57
		bodyModel[115].setRotationPoint(13.5F, 5F, -8.5F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,1F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 1F, 0F, 0F, 1F, -0.25F, 0F, -1.75F, -0.25F, 0F, -1.75F, -0.25F, 0F, 1F, -0.25F, 0F); // Box 57
		bodyModel[116].setRotationPoint(12.5F, 7F, -8.5F);

		bodyModel[117].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 57
		bodyModel[117].setRotationPoint(11.5F, 5F, -8.5F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Box 57
		bodyModel[118].setRotationPoint(8.5F, 5F, -8.5F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.25F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0.25F, 0F, 0F, -1.75F, -0.25F, 0F, 1F, -0.25F, 0F, 1F, -0.25F, 0F, -1.75F, -0.25F, 0F); // Box 57
		bodyModel[119].setRotationPoint(9.5F, 7F, -8.5F);

		bodyModel[120].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 57
		bodyModel[120].setRotationPoint(9.5F, 5F, -8.5F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 57
		bodyModel[121].setRotationPoint(-9.5F, 5F, -8.5F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,1F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 1F, 0F, 0F, 1F, -0.25F, 0F, -1.75F, -0.25F, 0F, -1.75F, -0.25F, 0F, 1F, -0.25F, 0F); // Box 57
		bodyModel[122].setRotationPoint(-10.5F, 7F, -8.5F);

		bodyModel[123].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 57
		bodyModel[123].setRotationPoint(-11.5F, 5F, -8.5F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Box 57
		bodyModel[124].setRotationPoint(-14.5F, 5F, -8.5F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.25F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0.25F, 0F, 0F, -1.75F, -0.25F, 0F, 1F, -0.25F, 0F, 1F, -0.25F, 0F, -1.75F, -0.25F, 0F); // Box 57
		bodyModel[125].setRotationPoint(-13.5F, 7F, -8.5F);

		bodyModel[126].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 57
		bodyModel[126].setRotationPoint(-13.5F, 5F, -8.5F);

		bodyModel[127].addBox(0F, 0F, 0F, 3, 2, 8, 0F); // Box 1
		bodyModel[127].setRotationPoint(-29F, 1.5F, -4F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 3, 2, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F); // Box 1
		bodyModel[128].setRotationPoint(-29F, 1.5F, 4F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 3, 2, 7, 0F,0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[129].setRotationPoint(26F, 1.5F, -11F);

		bodyModel[130].addBox(0F, 0F, 0F, 3, 2, 8, 0F); // Box 1
		bodyModel[130].setRotationPoint(26F, 1.5F, -4F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 3, 2, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 0F); // Box 1
		bodyModel[131].setRotationPoint(26F, 1.5F, 4F);

		bodyModel[132].addBox(0F, 0F, 0F, 2, 10, 8, 0F); // Box 1
		bodyModel[132].setRotationPoint(-28F, -8.5F, -4F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 2, 10, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F); // Box 1
		bodyModel[133].setRotationPoint(-28F, -8.5F, 4F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 1, 10, 3, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[134].setRotationPoint(-27F, -8.5F, -10F);

		bodyModel[135].addBox(0F, 0F, 0F, 1, 10, 3, 0F); // Box 1
		bodyModel[135].setRotationPoint(-27F, -8.5F, -7F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 1, 10, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 1
		bodyModel[136].setRotationPoint(27F, -8.5F, 4F);

		bodyModel[137].addBox(0F, 0F, 0F, 2, 10, 8, 0F); // Box 1
		bodyModel[137].setRotationPoint(26F, -8.5F, -4F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 2, 10, 7, 0F,0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[138].setRotationPoint(26F, -8.5F, -11F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 1, 10, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 1
		bodyModel[139].setRotationPoint(26F, -8.5F, 7F);

		bodyModel[140].addBox(0F, 0F, 0F, 1, 10, 3, 0F); // Box 1
		bodyModel[140].setRotationPoint(26F, -8.5F, 4F);

		bodyModel[141].addBox(0F, 0F, 0F, 8, 8, 0, 0F); // Box 1
		bodyModel[141].setRotationPoint(-15.5F, 2F, 5.5F);

		bodyModel[142].addBox(0F, 0F, 0F, 8, 8, 0, 0F); // Box 1
		bodyModel[142].setRotationPoint(7.5F, 2F, -5.5F);

		bodyModel[143].addBox(0F, 0F, 0F, 8, 8, 0, 0F); // Box 1
		bodyModel[143].setRotationPoint(7.5F, 2F, 5.5F);

		bodyModel[144].addBox(0F, 0F, 0F, 9, 2, 2, 0F); // Box 156
		bodyModel[144].setRotationPoint(-30.5F, 3F, -1F);

		bodyModel[145].addBox(0F, 0F, 0F, 9, 2, 2, 0F); // Box 157
		bodyModel[145].setRotationPoint(21.5F, 3F, -1F);
	}
}