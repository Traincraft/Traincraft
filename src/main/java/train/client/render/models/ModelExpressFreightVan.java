//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2022 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 08.08.2022 - 23:34:31
// Last changed on: 08.08.2022 - 23:34:31

package train.client.render.models;

import tmt.ModelConverter;
import tmt.ModelRendererTurbo;

public class ModelExpressFreightVan extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelExpressFreightVan() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[124];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 64, 2, textureX, textureY); // Box 1
		bodyModel[2] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 29
		bodyModel[3] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 30
		bodyModel[4] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 31
		bodyModel[5] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 66
		bodyModel[6] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 67
		bodyModel[7] = new ModelRendererTurbo(this, 9, 9, textureX, textureY); // Box 66
		bodyModel[8] = new ModelRendererTurbo(this, 121, 9, textureX, textureY); // Box 67
		bodyModel[9] = new ModelRendererTurbo(this, 129, 9, textureX, textureY); // Box 70
		bodyModel[10] = new ModelRendererTurbo(this, 137, 9, textureX, textureY); // Box 71
		bodyModel[11] = new ModelRendererTurbo(this, 145, 9, textureX, textureY); // Box 70
		bodyModel[12] = new ModelRendererTurbo(this, 153, 9, textureX, textureY); // Box 71
		bodyModel[13] = new ModelRendererTurbo(this, 161, 9, textureX, textureY); // Box 32
		bodyModel[14] = new ModelRendererTurbo(this, 273, 9, textureX, textureY); // Box 33
		bodyModel[15] = new ModelRendererTurbo(this, 385, 9, textureX, textureY); // Box 34
		bodyModel[16] = new ModelRendererTurbo(this, 89, 17, textureX, textureY); // Box 64
		bodyModel[17] = new ModelRendererTurbo(this, 97, 17, textureX, textureY); // Box 65
		bodyModel[18] = new ModelRendererTurbo(this, 105, 17, textureX, textureY); // Box 70
		bodyModel[19] = new ModelRendererTurbo(this, 113, 17, textureX, textureY); // Box 71
		bodyModel[20] = new ModelRendererTurbo(this, 121, 17, textureX, textureY); // Box 64
		bodyModel[21] = new ModelRendererTurbo(this, 129, 17, textureX, textureY); // Box 65
		bodyModel[22] = new ModelRendererTurbo(this, 137, 17, textureX, textureY); // Box 70
		bodyModel[23] = new ModelRendererTurbo(this, 145, 17, textureX, textureY); // Box 71
		bodyModel[24] = new ModelRendererTurbo(this, 153, 17, textureX, textureY); // Box 33
		bodyModel[25] = new ModelRendererTurbo(this, 249, 17, textureX, textureY); // Box 29
		bodyModel[26] = new ModelRendererTurbo(this, 321, 17, textureX, textureY); // Box 1
		bodyModel[27] = new ModelRendererTurbo(this, 369, 17, textureX, textureY); // Box 1
		bodyModel[28] = new ModelRendererTurbo(this, 353, 17, textureX, textureY); // Box 0
		bodyModel[29] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 1
		bodyModel[30] = new ModelRendererTurbo(this, 401, 17, textureX, textureY); // Box 0
		bodyModel[31] = new ModelRendererTurbo(this, 409, 17, textureX, textureY); // Box 0
		bodyModel[32] = new ModelRendererTurbo(this, 417, 17, textureX, textureY); // Box 0
		bodyModel[33] = new ModelRendererTurbo(this, 425, 17, textureX, textureY); // Box 0
		bodyModel[34] = new ModelRendererTurbo(this, 433, 17, textureX, textureY); // Box 0
		bodyModel[35] = new ModelRendererTurbo(this, 441, 17, textureX, textureY); // Box 0
		bodyModel[36] = new ModelRendererTurbo(this, 449, 17, textureX, textureY); // Box 0
		bodyModel[37] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 0
		bodyModel[38] = new ModelRendererTurbo(this, 9, 25, textureX, textureY); // Box 0
		bodyModel[39] = new ModelRendererTurbo(this, 137, 25, textureX, textureY); // Box 0
		bodyModel[40] = new ModelRendererTurbo(this, 145, 25, textureX, textureY); // Box 0
		bodyModel[41] = new ModelRendererTurbo(this, 153, 25, textureX, textureY); // Box 0
		bodyModel[42] = new ModelRendererTurbo(this, 161, 25, textureX, textureY); // Box 0
		bodyModel[43] = new ModelRendererTurbo(this, 169, 25, textureX, textureY); // Box 0
		bodyModel[44] = new ModelRendererTurbo(this, 385, 17, textureX, textureY); // Box 0
		bodyModel[45] = new ModelRendererTurbo(this, 209, 25, textureX, textureY); // Box 0
		bodyModel[46] = new ModelRendererTurbo(this, 233, 25, textureX, textureY); // Box 0
		bodyModel[47] = new ModelRendererTurbo(this, 241, 25, textureX, textureY); // Box 0
		bodyModel[48] = new ModelRendererTurbo(this, 249, 25, textureX, textureY); // Box 0
		bodyModel[49] = new ModelRendererTurbo(this, 257, 25, textureX, textureY); // Box 0
		bodyModel[50] = new ModelRendererTurbo(this, 265, 25, textureX, textureY); // Box 0
		bodyModel[51] = new ModelRendererTurbo(this, 273, 25, textureX, textureY); // Box 0
		bodyModel[52] = new ModelRendererTurbo(this, 281, 25, textureX, textureY); // Box 0
		bodyModel[53] = new ModelRendererTurbo(this, 377, 25, textureX, textureY); // Box 0
		bodyModel[54] = new ModelRendererTurbo(this, 401, 25, textureX, textureY); // Box 0
		bodyModel[55] = new ModelRendererTurbo(this, 409, 25, textureX, textureY); // Box 0
		bodyModel[56] = new ModelRendererTurbo(this, 417, 25, textureX, textureY); // Box 0
		bodyModel[57] = new ModelRendererTurbo(this, 425, 25, textureX, textureY); // Box 0
		bodyModel[58] = new ModelRendererTurbo(this, 433, 25, textureX, textureY); // Box 0
		bodyModel[59] = new ModelRendererTurbo(this, 441, 25, textureX, textureY); // Box 0
		bodyModel[60] = new ModelRendererTurbo(this, 17, 25, textureX, textureY); // Box 0
		bodyModel[61] = new ModelRendererTurbo(this, 137, 33, textureX, textureY); // Box 1
		bodyModel[62] = new ModelRendererTurbo(this, 201, 33, textureX, textureY); // Box 1
		bodyModel[63] = new ModelRendererTurbo(this, 233, 33, textureX, textureY); // Box 182
		bodyModel[64] = new ModelRendererTurbo(this, 417, 33, textureX, textureY); // Box 182
		bodyModel[65] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 5
		bodyModel[66] = new ModelRendererTurbo(this, 281, 49, textureX, textureY); // Box 5
		bodyModel[67] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 5
		bodyModel[68] = new ModelRendererTurbo(this, 249, 57, textureX, textureY); // Box 5
		bodyModel[69] = new ModelRendererTurbo(this, 361, 57, textureX, textureY); // Box 5
		bodyModel[70] = new ModelRendererTurbo(this, 249, 65, textureX, textureY); // Box 182
		bodyModel[71] = new ModelRendererTurbo(this, 297, 65, textureX, textureY); // Box 182
		bodyModel[72] = new ModelRendererTurbo(this, 345, 65, textureX, textureY); // Box 102
		bodyModel[73] = new ModelRendererTurbo(this, 377, 65, textureX, textureY); // Box 102
		bodyModel[74] = new ModelRendererTurbo(this, 497, 25, textureX, textureY); // Box 0
		bodyModel[75] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 0
		bodyModel[76] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 0
		bodyModel[77] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 0
		bodyModel[78] = new ModelRendererTurbo(this, 209, 25, textureX, textureY); // Box 0
		bodyModel[79] = new ModelRendererTurbo(this, 209, 25, textureX, textureY); // Box 0
		bodyModel[80] = new ModelRendererTurbo(this, 209, 25, textureX, textureY); // Box 0
		bodyModel[81] = new ModelRendererTurbo(this, 124, 76, textureX, textureY); // Box 5
		bodyModel[82] = new ModelRendererTurbo(this, 111, 63, textureX, textureY); // Box 212
		bodyModel[83] = new ModelRendererTurbo(this, 124, 76, textureX, textureY); // Box 5
		bodyModel[84] = new ModelRendererTurbo(this, 119, 71, textureX, textureY); // Box 212
		bodyModel[85] = new ModelRendererTurbo(this, 123, 76, textureX, textureY); // Box 5
		bodyModel[86] = new ModelRendererTurbo(this, 123, 76, textureX, textureY); // Box 5
		bodyModel[87] = new ModelRendererTurbo(this, 61, 18, textureX, textureY); // Box 57
		bodyModel[88] = new ModelRendererTurbo(this, 58, 18, textureX, textureY); // Box 57
		bodyModel[89] = new ModelRendererTurbo(this, 43, 18, textureX, textureY); // Box 57
		bodyModel[90] = new ModelRendererTurbo(this, 45, 17, textureX, textureY); // Box 57
		bodyModel[91] = new ModelRendererTurbo(this, 58, 18, textureX, textureY); // Box 57
		bodyModel[92] = new ModelRendererTurbo(this, 41, 18, textureX, textureY); // Box 57
		bodyModel[93] = new ModelRendererTurbo(this, 59, 18, textureX, textureY); // Box 57
		bodyModel[94] = new ModelRendererTurbo(this, 59, 18, textureX, textureY); // Box 57
		bodyModel[95] = new ModelRendererTurbo(this, 57, 18, textureX, textureY); // Box 57
		bodyModel[96] = new ModelRendererTurbo(this, 42, 17, textureX, textureY); // Box 57
		bodyModel[97] = new ModelRendererTurbo(this, 59, 18, textureX, textureY); // Box 57
		bodyModel[98] = new ModelRendererTurbo(this, 42, 17, textureX, textureY); // Box 57
		bodyModel[99] = new ModelRendererTurbo(this, 43, 17, textureX, textureY); // Box 57
		bodyModel[100] = new ModelRendererTurbo(this, 61, 18, textureX, textureY); // Box 57
		bodyModel[101] = new ModelRendererTurbo(this, 41, 17, textureX, textureY); // Box 57
		bodyModel[102] = new ModelRendererTurbo(this, 42, 18, textureX, textureY); // Box 57
		bodyModel[103] = new ModelRendererTurbo(this, 43, 18, textureX, textureY); // Box 57
		bodyModel[104] = new ModelRendererTurbo(this, 42, 18, textureX, textureY); // Box 57
		bodyModel[105] = new ModelRendererTurbo(this, 43, 18, textureX, textureY); // Box 57
		bodyModel[106] = new ModelRendererTurbo(this, 43, 17, textureX, textureY); // Box 57
		bodyModel[107] = new ModelRendererTurbo(this, 42, 18, textureX, textureY); // Box 57
		bodyModel[108] = new ModelRendererTurbo(this, 43, 18, textureX, textureY); // Box 57
		bodyModel[109] = new ModelRendererTurbo(this, 44, 19, textureX, textureY); // Box 57
		bodyModel[110] = new ModelRendererTurbo(this, 42, 18, textureX, textureY); // Box 57
		bodyModel[111] = new ModelRendererTurbo(this, 476, 68, textureX, textureY); // Box 5
		bodyModel[112] = new ModelRendererTurbo(this, 463, 55, textureX, textureY); // Box 212
		bodyModel[113] = new ModelRendererTurbo(this, 476, 68, textureX, textureY); // Box 5
		bodyModel[114] = new ModelRendererTurbo(this, 471, 64, textureX, textureY); // Box 212
		bodyModel[115] = new ModelRendererTurbo(this, 475, 68, textureX, textureY); // Box 5
		bodyModel[116] = new ModelRendererTurbo(this, 475, 68, textureX, textureY); // Box 5
		bodyModel[117] = new ModelRendererTurbo(this, 497, 25, textureX, textureY); // Box 0
		bodyModel[118] = new ModelRendererTurbo(this, 497, 25, textureX, textureY); // Box 0
		bodyModel[119] = new ModelRendererTurbo(this, 497, 25, textureX, textureY); // Box 0
		bodyModel[120] = new ModelRendererTurbo(this, 497, 25, textureX, textureY); // Box 0
		bodyModel[121] = new ModelRendererTurbo(this, 64, 2, textureX, textureY); // Box 1
		bodyModel[122] = new ModelRendererTurbo(this, 64, 2, textureX, textureY); // Box 1
		bodyModel[123] = new ModelRendererTurbo(this, 64, 2, textureX, textureY); // Box 1

		bodyModel[0].addBox(0F, 0F, 0F, 1, 1, 16, 0F); // Box 0
		bodyModel[0].setRotationPoint(17F, 4.5F, -8F);

		bodyModel[1].addBox(0F, 0F, 0F, 10, 10, 0, 0F); // Box 1
		bodyModel[1].setRotationPoint(-22.5F, 0F, -6F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 48, 2, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 29
		bodyModel[2].setRotationPoint(-24F, 2F, 7.5F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 48, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 30
		bodyModel[3].setRotationPoint(-24F, 2F, 7.5F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 48, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 31
		bodyModel[4].setRotationPoint(-24F, 3.75F, 7.5F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0.9F, 0F, 0F, 0.9F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 1.1F, -0.5F, 0F, 1.1F, -0.5F, 0F, -0.5F, 0F, 0F); // Box 66
		bodyModel[5].setRotationPoint(13F, 5F, 7.5F);

		bodyModel[6].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 67
		bodyModel[6].setRotationPoint(13F, 3F, 8F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0.9F, 0F, 0F, 0.9F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 1.1F, -0.5F, 0F, 1.1F, -0.5F, 0F, -0.5F, 0F, 0F); // Box 66
		bodyModel[7].setRotationPoint(-22F, 5F, 7.5F);

		bodyModel[8].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 67
		bodyModel[8].setRotationPoint(-22F, 3F, 8F);

		bodyModel[9].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 70
		bodyModel[9].setRotationPoint(21F, 3F, 8F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.9F, 0F, 0F, 1.1F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 1.1F, -0.5F, 0F); // Box 71
		bodyModel[10].setRotationPoint(21F, 5F, 7.5F);

		bodyModel[11].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 70
		bodyModel[11].setRotationPoint(-14F, 3F, 8F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.9F, 0F, 0F, 1.1F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 1.1F, -0.5F, 0F); // Box 71
		bodyModel[12].setRotationPoint(-14F, 5F, 7.5F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 48, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 32
		bodyModel[13].setRotationPoint(-24F, 3.75F, -8.5F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 48, 2, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 33
		bodyModel[14].setRotationPoint(-24F, 2F, -8.5F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 48, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 34
		bodyModel[15].setRotationPoint(-24F, 2F, -8.5F);

		bodyModel[16].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 64
		bodyModel[16].setRotationPoint(13F, 3F, -9F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0.9F, 0F, 0F, 0.9F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 1.1F, -0.5F, 0F, 1.1F, -0.5F, 0F, -0.5F, 0F, 0F); // Box 65
		bodyModel[17].setRotationPoint(13F, 5F, -8.5F);

		bodyModel[18].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 70
		bodyModel[18].setRotationPoint(-14F, 3F, -9F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.9F, 0F, 0F, 1.1F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 1.1F, -0.5F, 0F); // Box 71
		bodyModel[19].setRotationPoint(-14F, 5F, -8.5F);

		bodyModel[20].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 64
		bodyModel[20].setRotationPoint(-22F, 3F, -9F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0.9F, 0F, 0F, 0.9F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 1.1F, -0.5F, 0F, 1.1F, -0.5F, 0F, -0.5F, 0F, 0F); // Box 65
		bodyModel[21].setRotationPoint(-22F, 5F, -8.5F);

		bodyModel[22].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 70
		bodyModel[22].setRotationPoint(21F, 3F, -9F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.9F, 0F, 0F, 1.1F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 1.1F, -0.5F, 0F); // Box 71
		bodyModel[23].setRotationPoint(21F, 5F, -8.5F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 44, 1, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 33
		bodyModel[24].setRotationPoint(-22F, 6.5F, -9.5F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 44, 1, 2, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 29
		bodyModel[25].setRotationPoint(-22F, 6.5F, 7.5F);

		bodyModel[26].addBox(0F, 0F, 0F, 1, 5, 22, 0F); // Box 1
		bodyModel[26].setRotationPoint(-27F, -0.5F, -11F);

		bodyModel[27].addBox(0F, 0F, 0F, 1, 5, 22, 0F); // Box 1
		bodyModel[27].setRotationPoint(26F, -0.5F, -11F);

		bodyModel[28].addBox(0F, 0F, 0F, 1, 1, 16, 0F); // Box 0
		bodyModel[28].setRotationPoint(-18F, 4.5F, -8F);

		bodyModel[29].addBox(0F, 0F, 0F, 54, 1, 22, 0F); // Box 1
		bodyModel[29].setRotationPoint(-27F, -1.5F, -11F);

		bodyModel[30].addBox(0F, 0F, 0F, 2, 3, 1, 0F); // Box 0
		bodyModel[30].setRotationPoint(-29F, 1F, -7.5F);

		bodyModel[31].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 0
		bodyModel[31].setRotationPoint(-29F, 2F, -8.5F);

		bodyModel[32].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 0
		bodyModel[32].setRotationPoint(-29F, 2F, -6.5F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[33].setRotationPoint(-29F, 1F, -8.5F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[34].setRotationPoint(-29F, 1F, -6.5F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[35].setRotationPoint(-29F, 3F, -8.5F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 0
		bodyModel[36].setRotationPoint(-29F, 3F, -6.5F);

		bodyModel[37].addBox(0F, 0F, 0F, 2, 3, 1, 0F); // Box 0
		bodyModel[37].setRotationPoint(-29F, 1F, 6.5F);

		bodyModel[38].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 0
		bodyModel[38].setRotationPoint(-29F, 2F, 5.5F);

		bodyModel[39].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 0
		bodyModel[39].setRotationPoint(-29F, 2F, 7.5F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[40].setRotationPoint(-29F, 1F, 5.5F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[41].setRotationPoint(-29F, 1F, 7.5F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[42].setRotationPoint(-29F, 3F, 5.5F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 0
		bodyModel[43].setRotationPoint(-29F, 3F, 7.5F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[44].setRotationPoint(-28F, 2F, -0.5F);

		bodyModel[45].addBox(0F, 0F, 0F, 1, 6, 6, 0F); // Box 0
		bodyModel[45].setRotationPoint(29F, -0.5F, -10F);

		bodyModel[46].addBox(0F, 0F, 0F, 2, 3, 1, 0F); // Box 0
		bodyModel[46].setRotationPoint(27F, 1F, -7.5F);

		bodyModel[47].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 0
		bodyModel[47].setRotationPoint(27F, 2F, -8.5F);

		bodyModel[48].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 0
		bodyModel[48].setRotationPoint(27F, 2F, -6.5F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[49].setRotationPoint(27F, 1F, -8.5F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[50].setRotationPoint(27F, 1F, -6.5F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[51].setRotationPoint(27F, 3F, -8.5F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 0
		bodyModel[52].setRotationPoint(27F, 3F, -6.5F);

		bodyModel[53].addBox(0F, 0F, 0F, 2, 3, 1, 0F); // Box 0
		bodyModel[53].setRotationPoint(27F, 1F, 6.5F);

		bodyModel[54].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 0
		bodyModel[54].setRotationPoint(27F, 2F, 5.5F);

		bodyModel[55].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 0
		bodyModel[55].setRotationPoint(27F, 2F, 7.5F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[56].setRotationPoint(27F, 1F, 5.5F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[57].setRotationPoint(27F, 1F, 7.5F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[58].setRotationPoint(27F, 3F, 5.5F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 0
		bodyModel[59].setRotationPoint(27F, 3F, 7.5F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[60].setRotationPoint(27F, 2F, -0.5F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 1, 17, 22, 0F,0F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[61].setRotationPoint(-27F, -18.5F, -11F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 1, 17, 22, 0F,-0.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0F, 0F); // Box 1
		bodyModel[62].setRotationPoint(26F, -18.5F, -11F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 20, 17, 1, 0F,-0.1F, 0F, -0.95F, 0F, 0F, -0.95F, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, -0.95F, 0F, 0F, -0.95F, 0F, 0F, 0F, -0.1F, 0F, 0F); // Box 182
		bodyModel[63].setRotationPoint(-27F, -18.5F, 10F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 20, 17, 1, 0F,-0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.95F, -0.1F, 0F, -0.95F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.95F, -0.1F, 0F, -0.95F); // Box 182
		bodyModel[64].setRotationPoint(-27F, -18.5F, -11F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 54, 1, 1, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 3.05F, 0F, 0F, 3.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.95F, 0F, 0F, -0.95F); // Box 5
		bodyModel[65].setRotationPoint(-27F, -21.5F, -8F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 54, 1, 1, 0F,0F, 0F, 3.05F, 0F, 0F, 3.05F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -0.95F, 0F, 0F, -0.95F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		bodyModel[66].setRotationPoint(-27F, -21.5F, 7F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 54, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.95F, 0F, 0F, -0.95F, 0F, 0F, -0.95F, 0F, 0F, -0.95F, 0F); // Box 5
		bodyModel[67].setRotationPoint(-27F, -21.5F, -4F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 54, 2, 1, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 2.05F, 0F, 0F, 2.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.95F, 0F, 0F, -0.95F); // Box 5
		bodyModel[68].setRotationPoint(-27F, -20.5F, -11F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 54, 2, 1, 0F,0F, 0F, 2.05F, 0F, 0F, 2.05F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -0.95F, 0F, 0F, -0.95F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		bodyModel[69].setRotationPoint(-27F, -20.5F, 10F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 20, 17, 1, 0F,0F, 0F, -0.95F, -0.1F, 0F, -0.95F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.95F, -0.1F, 0F, -0.95F, -0.1F, 0F, 0F, 0F, 0F, 0F); // Box 182
		bodyModel[70].setRotationPoint(7F, -18.5F, 10F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 20, 17, 1, 0F,0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, -0.95F, 0F, 0F, -0.95F, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, -0.95F, 0F, 0F, -0.95F); // Box 182
		bodyModel[71].setRotationPoint(7F, -18.5F, -11F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 14, 17, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.05F, 0F, 0F, 0.05F); // Box 102
		bodyModel[72].setRotationPoint(-7F, -18.5F, 10F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 14, 17, 1, 0F,0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 102
		bodyModel[73].setRotationPoint(-7F, -18.5F, -11F);

		bodyModel[74].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 0
		bodyModel[74].setRotationPoint(-18.5F, 4F, -1F);

		bodyModel[75].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 0
		bodyModel[75].setRotationPoint(16.5F, 4F, -1F);

		bodyModel[76].addBox(0F, 0F, 0F, 1, 5, 1, 0F); // Box 0
		bodyModel[76].setRotationPoint(-18F, -0.5F, -0.5F);

		bodyModel[77].addBox(0F, 0F, 0F, 1, 5, 1, 0F); // Box 0
		bodyModel[77].setRotationPoint(17F, -0.5F, -0.5F);

		bodyModel[78].addBox(0F, 0F, 0F, 1, 6, 6, 0F); // Box 0
		bodyModel[78].setRotationPoint(29F, -0.5F, 4F);

		bodyModel[79].addBox(0F, 0F, 0F, 1, 6, 6, 0F); // Box 0
		bodyModel[79].setRotationPoint(-30F, -0.5F, -10F);

		bodyModel[80].addBox(0F, 0F, 0F, 1, 6, 6, 0F); // Box 0
		bodyModel[80].setRotationPoint(-30F, -0.5F, 4F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,-0.975F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -0.975F, 0F, 0F, -0.975F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.975F, 0F, 0F); // Box 5
		bodyModel[81].setRotationPoint(26F, -20.5F, -11F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 1, 2, 16, 0F,-0.975F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.975F, 0F, 0F, -0.975F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.975F, 0F, 0F); // Box 212
		bodyModel[82].setRotationPoint(26F, -20.5F, -8F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,-0.975F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -0.975F, 0F, -3F, -0.975F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.975F, 0F, 0F); // Box 5
		bodyModel[83].setRotationPoint(26F, -20.5F, 8F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,-0.975F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.975F, 0F, 0F, -0.975F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.975F, 0F, 0F); // Box 212
		bodyModel[84].setRotationPoint(26F, -21.5F, -4F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-0.975F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, -0.975F, 0F, 0F, -0.975F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.975F, 0F, 0F); // Box 5
		bodyModel[85].setRotationPoint(26F, -21.5F, -8F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-0.975F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -0.975F, 0F, -4F, -0.975F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.975F, 0F, 0F); // Box 5
		bodyModel[86].setRotationPoint(26F, -21.5F, 4F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 57
		bodyModel[87].setRotationPoint(19.5F, 4F, -8.5F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,1F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 1F, 0F, 0F, 1F, -0.25F, 0F, -1.75F, -0.25F, 0F, -1.75F, -0.25F, 0F, 1F, -0.25F, 0F); // Box 57
		bodyModel[88].setRotationPoint(18.5F, 6F, -8.5F);

		bodyModel[89].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 57
		bodyModel[89].setRotationPoint(17.5F, 4F, -8.5F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Box 57
		bodyModel[90].setRotationPoint(14.5F, 4F, -8.5F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.25F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0.25F, 0F, 0F, -1.75F, -0.25F, 0F, 1F, -0.25F, 0F, 1F, -0.25F, 0F, -1.75F, -0.25F, 0F); // Box 57
		bodyModel[91].setRotationPoint(15.5F, 6F, -8.5F);

		bodyModel[92].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 57
		bodyModel[92].setRotationPoint(15.5F, 4F, -8.5F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 57
		bodyModel[93].setRotationPoint(-15.5F, 4F, -8.5F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,1F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 1F, 0F, 0F, 1F, -0.25F, 0F, -1.75F, -0.25F, 0F, -1.75F, -0.25F, 0F, 1F, -0.25F, 0F); // Box 57
		bodyModel[94].setRotationPoint(-16.5F, 6F, -8.5F);

		bodyModel[95].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 57
		bodyModel[95].setRotationPoint(-17.5F, 4F, -8.5F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Box 57
		bodyModel[96].setRotationPoint(-20.5F, 4F, -8.5F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.25F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0.25F, 0F, 0F, -1.75F, -0.25F, 0F, 1F, -0.25F, 0F, 1F, -0.25F, 0F, -1.75F, -0.25F, 0F); // Box 57
		bodyModel[97].setRotationPoint(-19.5F, 6F, -8.5F);

		bodyModel[98].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 57
		bodyModel[98].setRotationPoint(-19.5F, 4F, -8.5F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 57
		bodyModel[99].setRotationPoint(19.5F, 4F, 7.5F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,1F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 1F, 0F, 0F, 1F, -0.25F, 0F, -1.75F, -0.25F, 0F, -1.75F, -0.25F, 0F, 1F, -0.25F, 0F); // Box 57
		bodyModel[100].setRotationPoint(18.5F, 6F, 7.5F);

		bodyModel[101].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 57
		bodyModel[101].setRotationPoint(17.5F, 4F, 7.5F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Box 57
		bodyModel[102].setRotationPoint(14.5F, 4F, 7.5F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.25F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0.25F, 0F, 0F, -1.75F, -0.25F, 0F, 1F, -0.25F, 0F, 1F, -0.25F, 0F, -1.75F, -0.25F, 0F); // Box 57
		bodyModel[103].setRotationPoint(15.5F, 6F, 7.5F);

		bodyModel[104].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 57
		bodyModel[104].setRotationPoint(15.5F, 4F, 7.5F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 57
		bodyModel[105].setRotationPoint(-15.5F, 4F, 7.5F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,1F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 1F, 0F, 0F, 1F, -0.25F, 0F, -1.75F, -0.25F, 0F, -1.75F, -0.25F, 0F, 1F, -0.25F, 0F); // Box 57
		bodyModel[106].setRotationPoint(-16.5F, 6F, 7.5F);

		bodyModel[107].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 57
		bodyModel[107].setRotationPoint(-17.5F, 4F, 7.5F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Box 57
		bodyModel[108].setRotationPoint(-20.5F, 4F, 7.5F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.25F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0.25F, 0F, 0F, -1.75F, -0.25F, 0F, 1F, -0.25F, 0F, 1F, -0.25F, 0F, -1.75F, -0.25F, 0F); // Box 57
		bodyModel[109].setRotationPoint(-19.5F, 6F, 7.5F);

		bodyModel[110].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 57
		bodyModel[110].setRotationPoint(-19.5F, 4F, 7.5F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, -3F, -0.975F, 0F, -3F, -0.975F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.975F, 0F, 0F, -0.975F, 0F, 0F, 0F, 0F, 0F); // Box 5
		bodyModel[111].setRotationPoint(-27F, -20.5F, -11F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 1, 2, 16, 0F,0F, 0F, 0F, -0.975F, 0F, 0F, -0.975F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.975F, 0F, 0F, -0.975F, 0F, 0F, 0F, 0F, 0F); // Box 212
		bodyModel[112].setRotationPoint(-27F, -20.5F, -8F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, -0.975F, 0F, 0F, -0.975F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -0.975F, 0F, 0F, -0.975F, 0F, 0F, 0F, 0F, 0F); // Box 5
		bodyModel[113].setRotationPoint(-27F, -20.5F, 8F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, 0F, 0F, -0.975F, 0F, 0F, -0.975F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.975F, 0F, 0F, -0.975F, 0F, 0F, 0F, 0F, 0F); // Box 212
		bodyModel[114].setRotationPoint(-27F, -21.5F, -4F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, -4F, -0.975F, 0F, -4F, -0.975F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.975F, 0F, 0F, -0.975F, 0F, 0F, 0F, 0F, 0F); // Box 5
		bodyModel[115].setRotationPoint(-27F, -21.5F, -8F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, -0.975F, 0F, 0F, -0.975F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, -0.975F, 0F, 0F, -0.975F, 0F, 0F, 0F, 0F, 0F); // Box 5
		bodyModel[116].setRotationPoint(-27F, -21.5F, 4F);

		bodyModel[117].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 0
		bodyModel[117].setRotationPoint(-26F, 2F, 7F);

		bodyModel[118].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 0
		bodyModel[118].setRotationPoint(-26F, 2F, -9F);

		bodyModel[119].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 0
		bodyModel[119].setRotationPoint(24F, 2F, 7F);

		bodyModel[120].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 0
		bodyModel[120].setRotationPoint(24F, 2F, -9F);

		bodyModel[121].addBox(0F, 0F, 0F, 10, 10, 0, 0F); // Box 1
		bodyModel[121].setRotationPoint(-22.5F, 0F, 6F);

		bodyModel[122].addBox(0F, 0F, 0F, 10, 10, 0, 0F); // Box 1
		bodyModel[122].setRotationPoint(12.5F, 0F, -6F);

		bodyModel[123].addBox(0F, 0F, 0F, 10, 10, 0, 0F); // Box 1
		bodyModel[123].setRotationPoint(12.5F, 0F, 6F);
	}
}