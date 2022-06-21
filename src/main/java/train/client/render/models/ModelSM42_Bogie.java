//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2021 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 27.08.2018 - 15:59:37
// Last changed on: 27.08.2018 - 15:59:37

package train.client.render.models; //Path where the model is located

import tmt.ModelConverter;
import tmt.ModelRendererTurbo;

public class ModelSM42_Bogie extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelSM42_Bogie() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[124];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 559
		bodyModel[1] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 560
		bodyModel[2] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 559
		bodyModel[3] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 559
		bodyModel[4] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 559
		bodyModel[5] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 564
		bodyModel[6] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 564
		bodyModel[7] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 564
		bodyModel[8] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 564
		bodyModel[9] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 564
		bodyModel[10] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 564
		bodyModel[11] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 564
		bodyModel[12] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 564
		bodyModel[13] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 564
		bodyModel[14] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 564
		bodyModel[15] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 564
		bodyModel[16] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 564
		bodyModel[17] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 564
		bodyModel[18] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 564
		bodyModel[19] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 582
		bodyModel[20] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 564
		bodyModel[21] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 582
		bodyModel[22] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 564
		bodyModel[23] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 564
		bodyModel[24] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 588
		bodyModel[25] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 588
		bodyModel[26] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 590
		bodyModel[27] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 590
		bodyModel[28] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 590
		bodyModel[29] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 590
		bodyModel[30] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 590
		bodyModel[31] = new ModelRendererTurbo(this, 121, 9, textureX, textureY); // Box 590
		bodyModel[32] = new ModelRendererTurbo(this, 169, 9, textureX, textureY); // Box 590
		bodyModel[33] = new ModelRendererTurbo(this, 185, 9, textureX, textureY); // Box 590
		bodyModel[34] = new ModelRendererTurbo(this, 201, 9, textureX, textureY); // Box 590
		bodyModel[35] = new ModelRendererTurbo(this, 217, 9, textureX, textureY); // Box 590
		bodyModel[36] = new ModelRendererTurbo(this, 233, 9, textureX, textureY); // Box 590
		bodyModel[37] = new ModelRendererTurbo(this, 249, 9, textureX, textureY); // Box 590
		bodyModel[38] = new ModelRendererTurbo(this, 265, 9, textureX, textureY); // Box 590
		bodyModel[39] = new ModelRendererTurbo(this, 281, 9, textureX, textureY); // Box 590
		bodyModel[40] = new ModelRendererTurbo(this, 297, 9, textureX, textureY); // Box 590
		bodyModel[41] = new ModelRendererTurbo(this, 313, 9, textureX, textureY); // Box 590
		bodyModel[42] = new ModelRendererTurbo(this, 329, 9, textureX, textureY); // Box 590
		bodyModel[43] = new ModelRendererTurbo(this, 345, 9, textureX, textureY); // Box 590
		bodyModel[44] = new ModelRendererTurbo(this, 361, 9, textureX, textureY); // Box 590
		bodyModel[45] = new ModelRendererTurbo(this, 377, 9, textureX, textureY); // Box 590
		bodyModel[46] = new ModelRendererTurbo(this, 393, 9, textureX, textureY); // Box 590
		bodyModel[47] = new ModelRendererTurbo(this, 409, 9, textureX, textureY); // Box 590
		bodyModel[48] = new ModelRendererTurbo(this, 425, 9, textureX, textureY); // Box 590
		bodyModel[49] = new ModelRendererTurbo(this, 441, 9, textureX, textureY); // Box 590
		bodyModel[50] = new ModelRendererTurbo(this, 441, 9, textureX, textureY); // Box 657
		bodyModel[51] = new ModelRendererTurbo(this, 465, 9, textureX, textureY); // Box 657
		bodyModel[52] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 564
		bodyModel[53] = new ModelRendererTurbo(this, 489, 9, textureX, textureY); // Box 590
		bodyModel[54] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 590
		bodyModel[55] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 590
		bodyModel[56] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Box 590
		bodyModel[57] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 590
		bodyModel[58] = new ModelRendererTurbo(this, 505, 9, textureX, textureY); // Box 564
		bodyModel[59] = new ModelRendererTurbo(this, 65, 17, textureX, textureY); // Box 590
		bodyModel[60] = new ModelRendererTurbo(this, 81, 17, textureX, textureY); // Box 590
		bodyModel[61] = new ModelRendererTurbo(this, 97, 17, textureX, textureY); // Box 590
		bodyModel[62] = new ModelRendererTurbo(this, 113, 17, textureX, textureY); // Box 590
		bodyModel[63] = new ModelRendererTurbo(this, 129, 17, textureX, textureY); // Box 590
		bodyModel[64] = new ModelRendererTurbo(this, 145, 17, textureX, textureY); // Box 657
		bodyModel[65] = new ModelRendererTurbo(this, 169, 17, textureX, textureY); // Box 564
		bodyModel[66] = new ModelRendererTurbo(this, 177, 17, textureX, textureY); // Box 590
		bodyModel[67] = new ModelRendererTurbo(this, 193, 17, textureX, textureY); // Box 590
		bodyModel[68] = new ModelRendererTurbo(this, 209, 17, textureX, textureY); // Box 590
		bodyModel[69] = new ModelRendererTurbo(this, 225, 17, textureX, textureY); // Box 590
		bodyModel[70] = new ModelRendererTurbo(this, 241, 17, textureX, textureY); // Box 590
		bodyModel[71] = new ModelRendererTurbo(this, 257, 17, textureX, textureY); // Box 564
		bodyModel[72] = new ModelRendererTurbo(this, 265, 17, textureX, textureY); // Box 590
		bodyModel[73] = new ModelRendererTurbo(this, 281, 17, textureX, textureY); // Box 590
		bodyModel[74] = new ModelRendererTurbo(this, 297, 17, textureX, textureY); // Box 590
		bodyModel[75] = new ModelRendererTurbo(this, 313, 17, textureX, textureY); // Box 590
		bodyModel[76] = new ModelRendererTurbo(this, 329, 17, textureX, textureY); // Box 590
		bodyModel[77] = new ModelRendererTurbo(this, 345, 17, textureX, textureY); // Box 590
		bodyModel[78] = new ModelRendererTurbo(this, 361, 17, textureX, textureY); // Box 564
		bodyModel[79] = new ModelRendererTurbo(this, 393, 17, textureX, textureY); // Box 564
		bodyModel[80] = new ModelRendererTurbo(this, 409, 17, textureX, textureY); // Box 564
		bodyModel[81] = new ModelRendererTurbo(this, 425, 17, textureX, textureY); // Box 564
		bodyModel[82] = new ModelRendererTurbo(this, 441, 17, textureX, textureY); // Box 564
		bodyModel[83] = new ModelRendererTurbo(this, 465, 17, textureX, textureY); // Box 564
		bodyModel[84] = new ModelRendererTurbo(this, 153, 9, textureX, textureY); // Box 564
		bodyModel[85] = new ModelRendererTurbo(this, 473, 17, textureX, textureY); // Box 564
		bodyModel[86] = new ModelRendererTurbo(this, 489, 17, textureX, textureY); // Box 564
		bodyModel[87] = new ModelRendererTurbo(this, 497, 17, textureX, textureY); // Box 564
		bodyModel[88] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 564
		bodyModel[89] = new ModelRendererTurbo(this, 17, 25, textureX, textureY); // Box 564
		bodyModel[90] = new ModelRendererTurbo(this, 505, 17, textureX, textureY); // Box 564
		bodyModel[91] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 564
		bodyModel[92] = new ModelRendererTurbo(this, 41, 25, textureX, textureY); // Box 564
		bodyModel[93] = new ModelRendererTurbo(this, 49, 25, textureX, textureY); // Box 590
		bodyModel[94] = new ModelRendererTurbo(this, 65, 25, textureX, textureY); // Box 590
		bodyModel[95] = new ModelRendererTurbo(this, 81, 25, textureX, textureY); // Box 590
		bodyModel[96] = new ModelRendererTurbo(this, 97, 25, textureX, textureY); // Box 590
		bodyModel[97] = new ModelRendererTurbo(this, 113, 25, textureX, textureY); // Box 590
		bodyModel[98] = new ModelRendererTurbo(this, 129, 25, textureX, textureY); // Box 590
		bodyModel[99] = new ModelRendererTurbo(this, 145, 25, textureX, textureY); // Box 590
		bodyModel[100] = new ModelRendererTurbo(this, 161, 25, textureX, textureY); // Box 590
		bodyModel[101] = new ModelRendererTurbo(this, 177, 25, textureX, textureY); // Box 590
		bodyModel[102] = new ModelRendererTurbo(this, 193, 25, textureX, textureY); // Box 590
		bodyModel[103] = new ModelRendererTurbo(this, 209, 25, textureX, textureY); // Box 590
		bodyModel[104] = new ModelRendererTurbo(this, 225, 25, textureX, textureY); // Box 590
		bodyModel[105] = new ModelRendererTurbo(this, 241, 25, textureX, textureY); // Box 590
		bodyModel[106] = new ModelRendererTurbo(this, 257, 25, textureX, textureY); // Box 590
		bodyModel[107] = new ModelRendererTurbo(this, 273, 25, textureX, textureY); // Box 590
		bodyModel[108] = new ModelRendererTurbo(this, 289, 25, textureX, textureY); // Box 590
		bodyModel[109] = new ModelRendererTurbo(this, 305, 25, textureX, textureY); // Box 590
		bodyModel[110] = new ModelRendererTurbo(this, 321, 25, textureX, textureY); // Box 590
		bodyModel[111] = new ModelRendererTurbo(this, 337, 25, textureX, textureY); // Box 590
		bodyModel[112] = new ModelRendererTurbo(this, 353, 25, textureX, textureY); // Box 590
		bodyModel[113] = new ModelRendererTurbo(this, 369, 25, textureX, textureY); // Box 590
		bodyModel[114] = new ModelRendererTurbo(this, 385, 25, textureX, textureY); // Box 590
		bodyModel[115] = new ModelRendererTurbo(this, 401, 25, textureX, textureY); // Box 590
		bodyModel[116] = new ModelRendererTurbo(this, 417, 25, textureX, textureY); // Box 590
		bodyModel[117] = new ModelRendererTurbo(this, 433, 25, textureX, textureY); // Box 582
		bodyModel[118] = new ModelRendererTurbo(this, 449, 25, textureX, textureY); // Box 582
		bodyModel[119] = new ModelRendererTurbo(this, 465, 25, textureX, textureY); // Box 564
		bodyModel[120] = new ModelRendererTurbo(this, 481, 25, textureX, textureY); // Box 564
		bodyModel[121] = new ModelRendererTurbo(this, 497, 25, textureX, textureY); // Box 590
		bodyModel[122] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 590
		bodyModel[123] = new ModelRendererTurbo(this, 17, 33, textureX, textureY); // Box 590

		bodyModel[0].addBox(0F, 0F, 0F, 8, 8, 0, 0F); // Box 559
		bodyModel[0].setRotationPoint(-12.5F, 1F, -5.01F);

		bodyModel[1].addBox(0F, 0F, 0F, 27, 4, 10, 0F); // Box 560
		bodyModel[1].setRotationPoint(-13.5F, 2F, -5F);

		bodyModel[2].addBox(0F, 0F, 0F, 8, 8, 0, 0F); // Box 559
		bodyModel[2].setRotationPoint(4.5F, 1F, -5.01F);

		bodyModel[3].addBox(0F, 0F, 0F, 8, 8, 0, 0F); // Box 559
		bodyModel[3].setRotationPoint(-12.5F, 1F, 5.01F);

		bodyModel[4].addBox(0F, 0F, 0F, 8, 8, 0, 0F); // Box 559
		bodyModel[4].setRotationPoint(4.5F, 1F, 5.01F);

		bodyModel[5].addBox(0F, 0F, 0F, 13, 2, 2, 0F); // Box 564
		bodyModel[5].setRotationPoint(-6.5F, 2F, -7F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 564
		bodyModel[6].setRotationPoint(-10.5F, 2F, -7F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 564
		bodyModel[7].setRotationPoint(6.5F, 2F, -7F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 564
		bodyModel[8].setRotationPoint(-9F, 4.5F, -6.5F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F); // Box 564
		bodyModel[9].setRotationPoint(-8F, 7F, -6.5F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F); // Box 564
		bodyModel[10].setRotationPoint(-12F, 7F, -6.5F);

		bodyModel[11].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 564
		bodyModel[11].setRotationPoint(-12F, 4F, -6.5F);

		bodyModel[12].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 564
		bodyModel[12].setRotationPoint(-6F, 4F, -6.5F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 564
		bodyModel[13].setRotationPoint(10.5F, 2F, -7F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 564
		bodyModel[14].setRotationPoint(-13.5F, 2F, -7F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F); // Box 564
		bodyModel[15].setRotationPoint(9F, 7F, -6.5F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F); // Box 564
		bodyModel[16].setRotationPoint(5F, 7F, -6.5F);

		bodyModel[17].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 564
		bodyModel[17].setRotationPoint(5F, 4F, -6.5F);

		bodyModel[18].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 564
		bodyModel[18].setRotationPoint(11F, 4F, -6.5F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 582
		bodyModel[19].setRotationPoint(-10F, 5.5F, -8F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 564
		bodyModel[20].setRotationPoint(-10F, 4.5F, 6F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 582
		bodyModel[21].setRotationPoint(7F, 5.5F, -8F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 564
		bodyModel[22].setRotationPoint(7F, 4.5F, 6F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 564
		bodyModel[23].setRotationPoint(8F, 4.5F, -6.5F);

		bodyModel[24].addBox(0F, 0F, 0F, 1, 1, 11, 0F); // Box 588
		bodyModel[24].setRotationPoint(-9F, 4.5F, -5.5F);

		bodyModel[25].addBox(0F, 0F, 0F, 1, 1, 11, 0F); // Box 588
		bodyModel[25].setRotationPoint(8F, 4.5F, -5.5F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F); // Box 590
		bodyModel[26].setRotationPoint(-12.5F, 6.5F, -7F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.125F, 0F, -0.125F, -0.125F, -0.25F, -0.125F, -0.125F, -0.25F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.25F, -0.125F, -0.125F, -0.25F, -0.125F, -0.125F, -0.5F, -0.125F); // Box 590
		bodyModel[27].setRotationPoint(-12.5F, 5.75F, -7F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.125F, 0F, -0.125F, -0.125F, -0.25F, -0.125F, -0.125F, -0.25F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.25F, -0.125F, -0.125F, -0.25F, -0.125F, -0.125F, -0.5F, -0.125F); // Box 590
		bodyModel[28].setRotationPoint(-12.5F, 5.2F, -7F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.125F, 0F, -0.125F, -0.125F, -0.25F, -0.125F, -0.125F, -0.25F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.25F, -0.125F, -0.125F, -0.25F, -0.125F, -0.125F, -0.5F, -0.125F); // Box 590
		bodyModel[29].setRotationPoint(-12.5F, 4.65F, -7F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.125F, 0F, -0.125F, -0.125F, -0.25F, -0.125F, -0.125F, -0.25F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.25F, -0.125F, -0.125F, -0.25F, -0.125F, -0.125F, -0.5F, -0.125F); // Box 590
		bodyModel[30].setRotationPoint(-12.5F, 4.1F, -7F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F); // Box 590
		bodyModel[31].setRotationPoint(-12.5F, 3.6F, -7F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F); // Box 590
		bodyModel[32].setRotationPoint(-6.5F, 6.5F, -7F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.125F, 0F, -0.125F, -0.125F, -0.25F, -0.125F, -0.125F, -0.25F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.25F, -0.125F, -0.125F, -0.25F, -0.125F, -0.125F, -0.5F, -0.125F); // Box 590
		bodyModel[33].setRotationPoint(-6.5F, 5.75F, -7F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.125F, 0F, -0.125F, -0.125F, -0.25F, -0.125F, -0.125F, -0.25F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.25F, -0.125F, -0.125F, -0.25F, -0.125F, -0.125F, -0.5F, -0.125F); // Box 590
		bodyModel[34].setRotationPoint(-6.5F, 5.2F, -7F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.125F, 0F, -0.125F, -0.125F, -0.25F, -0.125F, -0.125F, -0.25F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.25F, -0.125F, -0.125F, -0.25F, -0.125F, -0.125F, -0.5F, -0.125F); // Box 590
		bodyModel[35].setRotationPoint(-6.5F, 4.65F, -7F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.125F, 0F, -0.125F, -0.125F, -0.25F, -0.125F, -0.125F, -0.25F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.25F, -0.125F, -0.125F, -0.25F, -0.125F, -0.125F, -0.5F, -0.125F); // Box 590
		bodyModel[36].setRotationPoint(-6.5F, 4.1F, -7F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F); // Box 590
		bodyModel[37].setRotationPoint(-6.5F, 3.6F, -7F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F); // Box 590
		bodyModel[38].setRotationPoint(4.5F, 6.5F, -7F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.125F, 0F, -0.125F, -0.125F, -0.25F, -0.125F, -0.125F, -0.25F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.25F, -0.125F, -0.125F, -0.25F, -0.125F, -0.125F, -0.5F, -0.125F); // Box 590
		bodyModel[39].setRotationPoint(4.5F, 5.75F, -7F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.125F, 0F, -0.125F, -0.125F, -0.25F, -0.125F, -0.125F, -0.25F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.25F, -0.125F, -0.125F, -0.25F, -0.125F, -0.125F, -0.5F, -0.125F); // Box 590
		bodyModel[40].setRotationPoint(4.5F, 5.2F, -7F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.125F, 0F, -0.125F, -0.125F, -0.25F, -0.125F, -0.125F, -0.25F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.25F, -0.125F, -0.125F, -0.25F, -0.125F, -0.125F, -0.5F, -0.125F); // Box 590
		bodyModel[41].setRotationPoint(4.5F, 4.65F, -7F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.125F, 0F, -0.125F, -0.125F, -0.25F, -0.125F, -0.125F, -0.25F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.25F, -0.125F, -0.125F, -0.25F, -0.125F, -0.125F, -0.5F, -0.125F); // Box 590
		bodyModel[42].setRotationPoint(4.5F, 4.1F, -7F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F); // Box 590
		bodyModel[43].setRotationPoint(4.5F, 3.6F, -7F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F); // Box 590
		bodyModel[44].setRotationPoint(10.5F, 6.5F, -7F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.125F, 0F, -0.125F, -0.125F, -0.25F, -0.125F, -0.125F, -0.25F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.25F, -0.125F, -0.125F, -0.25F, -0.125F, -0.125F, -0.5F, -0.125F); // Box 590
		bodyModel[45].setRotationPoint(10.5F, 5.75F, -7F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.125F, 0F, -0.125F, -0.125F, -0.25F, -0.125F, -0.125F, -0.25F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.25F, -0.125F, -0.125F, -0.25F, -0.125F, -0.125F, -0.5F, -0.125F); // Box 590
		bodyModel[46].setRotationPoint(10.5F, 5.2F, -7F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.125F, 0F, -0.125F, -0.125F, -0.25F, -0.125F, -0.125F, -0.25F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.25F, -0.125F, -0.125F, -0.25F, -0.125F, -0.125F, -0.5F, -0.125F); // Box 590
		bodyModel[47].setRotationPoint(10.5F, 4.65F, -7F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.125F, 0F, -0.125F, -0.125F, -0.25F, -0.125F, -0.125F, -0.25F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.25F, -0.125F, -0.125F, -0.25F, -0.125F, -0.125F, -0.5F, -0.125F); // Box 590
		bodyModel[48].setRotationPoint(10.5F, 4.1F, -7F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F); // Box 590
		bodyModel[49].setRotationPoint(10.5F, 3.6F, -7F);

		bodyModel[50].addBox(0F, 0F, 0F, 2, 1, 14, 0F); // Box 657
		bodyModel[50].setRotationPoint(-1F, 6F, -7F);

		bodyModel[51].addBox(0F, 0F, 0F, 6, 1, 2, 0F); // Box 657
		bodyModel[51].setRotationPoint(-3F, 6F, -9F);

		bodyModel[52].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 564
		bodyModel[52].setRotationPoint(-2.5F, 2.75F, -8.5F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.125F, 0F, -0.125F, -0.125F, -0.25F, -0.125F, -0.125F, -0.25F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.25F, -0.125F, -0.125F, -0.25F, -0.125F, -0.125F, -0.5F, -0.125F); // Box 590
		bodyModel[53].setRotationPoint(-3F, 4.5F, -9F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.125F, 0F, -0.125F, -0.125F, -0.25F, -0.125F, -0.125F, -0.25F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.25F, -0.125F, -0.125F, -0.25F, -0.125F, -0.125F, -0.5F, -0.125F); // Box 590
		bodyModel[54].setRotationPoint(-3F, 3.95F, -9F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.125F, 0F, -0.125F, -0.125F, -0.25F, -0.125F, -0.125F, -0.25F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.25F, -0.125F, -0.125F, -0.25F, -0.125F, -0.125F, -0.5F, -0.125F); // Box 590
		bodyModel[55].setRotationPoint(-3F, 3.4F, -9F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.125F, 0F, -0.125F, -0.125F, -0.25F, -0.125F, -0.125F, -0.25F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.25F, -0.125F, -0.125F, -0.25F, -0.125F, -0.125F, -0.5F, -0.125F); // Box 590
		bodyModel[56].setRotationPoint(-3F, 2.85F, -9F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F); // Box 590
		bodyModel[57].setRotationPoint(-3F, 1.85F, -9F);

		bodyModel[58].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 564
		bodyModel[58].setRotationPoint(1.5F, 2.75F, -8.5F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.125F, 0F, -0.125F, -0.125F, -0.25F, -0.125F, -0.125F, -0.25F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.25F, -0.125F, -0.125F, -0.25F, -0.125F, -0.125F, -0.5F, -0.125F); // Box 590
		bodyModel[59].setRotationPoint(1F, 4.5F, -9F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.125F, 0F, -0.125F, -0.125F, -0.25F, -0.125F, -0.125F, -0.25F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.25F, -0.125F, -0.125F, -0.25F, -0.125F, -0.125F, -0.5F, -0.125F); // Box 590
		bodyModel[60].setRotationPoint(1F, 3.95F, -9F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.125F, 0F, -0.125F, -0.125F, -0.25F, -0.125F, -0.125F, -0.25F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.25F, -0.125F, -0.125F, -0.25F, -0.125F, -0.125F, -0.5F, -0.125F); // Box 590
		bodyModel[61].setRotationPoint(1F, 3.4F, -9F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.125F, 0F, -0.125F, -0.125F, -0.25F, -0.125F, -0.125F, -0.25F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.25F, -0.125F, -0.125F, -0.25F, -0.125F, -0.125F, -0.5F, -0.125F); // Box 590
		bodyModel[62].setRotationPoint(1F, 2.85F, -9F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F); // Box 590
		bodyModel[63].setRotationPoint(1F, 1.85F, -9F);

		bodyModel[64].addBox(0F, 0F, 0F, 6, 1, 2, 0F); // Box 657
		bodyModel[64].setRotationPoint(-3F, 6F, 7F);

		bodyModel[65].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 564
		bodyModel[65].setRotationPoint(-2.5F, 2.75F, 7.5F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.125F, 0F, -0.125F, -0.125F, -0.25F, -0.125F, -0.125F, -0.25F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.25F, -0.125F, -0.125F, -0.25F, -0.125F, -0.125F, -0.5F, -0.125F); // Box 590
		bodyModel[66].setRotationPoint(-3F, 4.5F, 7F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.125F, 0F, -0.125F, -0.125F, -0.25F, -0.125F, -0.125F, -0.25F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.25F, -0.125F, -0.125F, -0.25F, -0.125F, -0.125F, -0.5F, -0.125F); // Box 590
		bodyModel[67].setRotationPoint(-3F, 3.95F, 7F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.125F, 0F, -0.125F, -0.125F, -0.25F, -0.125F, -0.125F, -0.25F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.25F, -0.125F, -0.125F, -0.25F, -0.125F, -0.125F, -0.5F, -0.125F); // Box 590
		bodyModel[68].setRotationPoint(-3F, 3.4F, 7F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.125F, 0F, -0.125F, -0.125F, -0.25F, -0.125F, -0.125F, -0.25F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.25F, -0.125F, -0.125F, -0.25F, -0.125F, -0.125F, -0.5F, -0.125F); // Box 590
		bodyModel[69].setRotationPoint(-3F, 2.85F, 7F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F); // Box 590
		bodyModel[70].setRotationPoint(-3F, 1.85F, 7F);

		bodyModel[71].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 564
		bodyModel[71].setRotationPoint(1.5F, 2.75F, 7.5F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, -0.25F, -0.125F, -0.125F, -0.25F, -0.125F, -0.125F, -0.25F, -0.125F, -0.125F, -0.25F, -0.125F); // Box 590
		bodyModel[72].setRotationPoint(1F, 5.25F, 7F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.125F, 0F, -0.125F, -0.125F, -0.25F, -0.125F, -0.125F, -0.25F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.25F, -0.125F, -0.125F, -0.25F, -0.125F, -0.125F, -0.5F, -0.125F); // Box 590
		bodyModel[73].setRotationPoint(1F, 4.5F, 7F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.125F, 0F, -0.125F, -0.125F, -0.25F, -0.125F, -0.125F, -0.25F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.25F, -0.125F, -0.125F, -0.25F, -0.125F, -0.125F, -0.5F, -0.125F); // Box 590
		bodyModel[74].setRotationPoint(1F, 3.95F, 7F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.125F, 0F, -0.125F, -0.125F, -0.25F, -0.125F, -0.125F, -0.25F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.25F, -0.125F, -0.125F, -0.25F, -0.125F, -0.125F, -0.5F, -0.125F); // Box 590
		bodyModel[75].setRotationPoint(1F, 3.4F, 7F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.125F, 0F, -0.125F, -0.125F, -0.25F, -0.125F, -0.125F, -0.25F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.25F, -0.125F, -0.125F, -0.25F, -0.125F, -0.125F, -0.5F, -0.125F); // Box 590
		bodyModel[76].setRotationPoint(1F, 2.85F, 7F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F); // Box 590
		bodyModel[77].setRotationPoint(1F, 1.85F, 7F);

		bodyModel[78].addBox(0F, 0F, 0F, 13, 2, 2, 0F); // Box 564
		bodyModel[78].setRotationPoint(-6.5F, 2F, 5F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 564
		bodyModel[79].setRotationPoint(-10.5F, 2F, 5F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 564
		bodyModel[80].setRotationPoint(6.5F, 2F, 5F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 564
		bodyModel[81].setRotationPoint(10.5F, 2F, 5F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 564
		bodyModel[82].setRotationPoint(-13.5F, 2F, 5F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 564
		bodyModel[83].setRotationPoint(-9F, 4.5F, 5.5F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F); // Box 564
		bodyModel[84].setRotationPoint(-8F, 7F, 5.5F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F); // Box 564
		bodyModel[85].setRotationPoint(-12F, 7F, 5.5F);

		bodyModel[86].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 564
		bodyModel[86].setRotationPoint(-12F, 4F, 5.5F);

		bodyModel[87].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 564
		bodyModel[87].setRotationPoint(-6F, 4F, 5.5F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F); // Box 564
		bodyModel[88].setRotationPoint(9F, 7F, 5.5F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F); // Box 564
		bodyModel[89].setRotationPoint(5F, 7F, 5.5F);

		bodyModel[90].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 564
		bodyModel[90].setRotationPoint(5F, 4F, 5.5F);

		bodyModel[91].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 564
		bodyModel[91].setRotationPoint(11F, 4F, 5.5F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 564
		bodyModel[92].setRotationPoint(8F, 4.5F, 5.5F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F); // Box 590
		bodyModel[93].setRotationPoint(-12.5F, 6.5F, 5F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.125F, 0F, -0.125F, -0.125F, -0.25F, -0.125F, -0.125F, -0.25F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.25F, -0.125F, -0.125F, -0.25F, -0.125F, -0.125F, -0.5F, -0.125F); // Box 590
		bodyModel[94].setRotationPoint(-12.5F, 5.75F, 5F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.125F, 0F, -0.125F, -0.125F, -0.25F, -0.125F, -0.125F, -0.25F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.25F, -0.125F, -0.125F, -0.25F, -0.125F, -0.125F, -0.5F, -0.125F); // Box 590
		bodyModel[95].setRotationPoint(-12.5F, 5.2F, 5F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.125F, 0F, -0.125F, -0.125F, -0.25F, -0.125F, -0.125F, -0.25F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.25F, -0.125F, -0.125F, -0.25F, -0.125F, -0.125F, -0.5F, -0.125F); // Box 590
		bodyModel[96].setRotationPoint(-12.5F, 4.65F, 5F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.125F, 0F, -0.125F, -0.125F, -0.25F, -0.125F, -0.125F, -0.25F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.25F, -0.125F, -0.125F, -0.25F, -0.125F, -0.125F, -0.5F, -0.125F); // Box 590
		bodyModel[97].setRotationPoint(-12.5F, 4.1F, 5F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F); // Box 590
		bodyModel[98].setRotationPoint(-12.5F, 3.6F, 5F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F); // Box 590
		bodyModel[99].setRotationPoint(-6.5F, 6.5F, 5F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.125F, 0F, -0.125F, -0.125F, -0.25F, -0.125F, -0.125F, -0.25F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.25F, -0.125F, -0.125F, -0.25F, -0.125F, -0.125F, -0.5F, -0.125F); // Box 590
		bodyModel[100].setRotationPoint(-6.5F, 5.75F, 5F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.125F, 0F, -0.125F, -0.125F, -0.25F, -0.125F, -0.125F, -0.25F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.25F, -0.125F, -0.125F, -0.25F, -0.125F, -0.125F, -0.5F, -0.125F); // Box 590
		bodyModel[101].setRotationPoint(-6.5F, 5.2F, 5F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.125F, 0F, -0.125F, -0.125F, -0.25F, -0.125F, -0.125F, -0.25F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.25F, -0.125F, -0.125F, -0.25F, -0.125F, -0.125F, -0.5F, -0.125F); // Box 590
		bodyModel[102].setRotationPoint(-6.5F, 4.65F, 5F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.125F, 0F, -0.125F, -0.125F, -0.25F, -0.125F, -0.125F, -0.25F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.25F, -0.125F, -0.125F, -0.25F, -0.125F, -0.125F, -0.5F, -0.125F); // Box 590
		bodyModel[103].setRotationPoint(-6.5F, 4.1F, 5F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F); // Box 590
		bodyModel[104].setRotationPoint(-6.5F, 3.6F, 5F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F); // Box 590
		bodyModel[105].setRotationPoint(4.5F, 6.5F, 5F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.125F, 0F, -0.125F, -0.125F, -0.25F, -0.125F, -0.125F, -0.25F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.25F, -0.125F, -0.125F, -0.25F, -0.125F, -0.125F, -0.5F, -0.125F); // Box 590
		bodyModel[106].setRotationPoint(4.5F, 5.75F, 5F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.125F, 0F, -0.125F, -0.125F, -0.25F, -0.125F, -0.125F, -0.25F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.25F, -0.125F, -0.125F, -0.25F, -0.125F, -0.125F, -0.5F, -0.125F); // Box 590
		bodyModel[107].setRotationPoint(4.5F, 5.2F, 5F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.125F, 0F, -0.125F, -0.125F, -0.25F, -0.125F, -0.125F, -0.25F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.25F, -0.125F, -0.125F, -0.25F, -0.125F, -0.125F, -0.5F, -0.125F); // Box 590
		bodyModel[108].setRotationPoint(4.5F, 4.65F, 5F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.125F, 0F, -0.125F, -0.125F, -0.25F, -0.125F, -0.125F, -0.25F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.25F, -0.125F, -0.125F, -0.25F, -0.125F, -0.125F, -0.5F, -0.125F); // Box 590
		bodyModel[109].setRotationPoint(4.5F, 4.1F, 5F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F); // Box 590
		bodyModel[110].setRotationPoint(4.5F, 3.6F, 5F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F); // Box 590
		bodyModel[111].setRotationPoint(10.5F, 6.5F, 5F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.125F, 0F, -0.125F, -0.125F, -0.25F, -0.125F, -0.125F, -0.25F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.25F, -0.125F, -0.125F, -0.25F, -0.125F, -0.125F, -0.5F, -0.125F); // Box 590
		bodyModel[112].setRotationPoint(10.5F, 5.75F, 5F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.125F, 0F, -0.125F, -0.125F, -0.25F, -0.125F, -0.125F, -0.25F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.25F, -0.125F, -0.125F, -0.25F, -0.125F, -0.125F, -0.5F, -0.125F); // Box 590
		bodyModel[113].setRotationPoint(10.5F, 5.2F, 5F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.125F, 0F, -0.125F, -0.125F, -0.25F, -0.125F, -0.125F, -0.25F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.25F, -0.125F, -0.125F, -0.25F, -0.125F, -0.125F, -0.5F, -0.125F); // Box 590
		bodyModel[114].setRotationPoint(10.5F, 4.65F, 5F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.125F, 0F, -0.125F, -0.125F, -0.25F, -0.125F, -0.125F, -0.25F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.25F, -0.125F, -0.125F, -0.25F, -0.125F, -0.125F, -0.5F, -0.125F); // Box 590
		bodyModel[115].setRotationPoint(10.5F, 4.1F, 5F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F); // Box 590
		bodyModel[116].setRotationPoint(10.5F, 3.6F, 5F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 582
		bodyModel[117].setRotationPoint(-10F, 5.5F, 6F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 582
		bodyModel[118].setRotationPoint(7F, 5.5F, 6F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 564
		bodyModel[119].setRotationPoint(-10F, 4.5F, -8F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 564
		bodyModel[120].setRotationPoint(7F, 4.5F, -8F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, -0.25F, -0.125F, -0.125F, -0.25F, -0.125F, -0.125F, -0.25F, -0.125F, -0.125F, -0.25F, -0.125F); // Box 590
		bodyModel[121].setRotationPoint(-3F, 5.25F, 7F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, -0.25F, -0.125F, -0.125F, -0.25F, -0.125F, -0.125F, -0.25F, -0.125F, -0.125F, -0.25F, -0.125F); // Box 590
		bodyModel[122].setRotationPoint(1F, 5.25F, -9F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, -0.25F, -0.125F, -0.125F, -0.25F, -0.125F, -0.125F, -0.25F, -0.125F, -0.125F, -0.25F, -0.125F); // Box 590
		bodyModel[123].setRotationPoint(-3F, 5.25F, -9F);
	}
}