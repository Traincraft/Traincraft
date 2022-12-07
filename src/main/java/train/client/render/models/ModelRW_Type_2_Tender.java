//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2022 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 07.09.2022 - 21:18:44
// Last changed on: 07.09.2022 - 21:18:44

package train.client.render.models; //Path where the model is located


import tmt.ModelConverter;
import tmt.ModelRendererTurbo;

public class ModelRW_Type_2_Tender extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelRW_Type_2_Tender() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[96];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 6, 112, textureX, textureY); // Box 1
		bodyModel[1] = new ModelRendererTurbo(this, 69, 217, textureX, textureY); // Box 0
		bodyModel[2] = new ModelRendererTurbo(this, 69, 217, textureX, textureY); // Box 0
		bodyModel[3] = new ModelRendererTurbo(this, 69, 217, textureX, textureY); // Box 0
		bodyModel[4] = new ModelRendererTurbo(this, 11, 122, textureX, textureY); // Box 1
		bodyModel[5] = new ModelRendererTurbo(this, 11, 122, textureX, textureY); // Box 1
		bodyModel[6] = new ModelRendererTurbo(this, 6, 137, textureX, textureY); // Box 1
		bodyModel[7] = new ModelRendererTurbo(this, 63, 148, textureX, textureY); // Box 121
		bodyModel[8] = new ModelRendererTurbo(this, 63, 148, textureX, textureY); // Box 122
		bodyModel[9] = new ModelRendererTurbo(this, 63, 148, textureX, textureY); // Box 123
		bodyModel[10] = new ModelRendererTurbo(this, 10, 142, textureX, textureY); // Box 123
		bodyModel[11] = new ModelRendererTurbo(this, 56, 146, textureX, textureY); // Box 123
		bodyModel[12] = new ModelRendererTurbo(this, 56, 146, textureX, textureY); // Box 123
		bodyModel[13] = new ModelRendererTurbo(this, 56, 144, textureX, textureY); // Box 123
		bodyModel[14] = new ModelRendererTurbo(this, 56, 146, textureX, textureY); // Box 123
		bodyModel[15] = new ModelRendererTurbo(this, 56, 144, textureX, textureY); // Box 123
		bodyModel[16] = new ModelRendererTurbo(this, 56, 144, textureX, textureY); // Box 123
		bodyModel[17] = new ModelRendererTurbo(this, 56, 144, textureX, textureY); // Box 123
		bodyModel[18] = new ModelRendererTurbo(this, 56, 144, textureX, textureY); // Box 123
		bodyModel[19] = new ModelRendererTurbo(this, 56, 144, textureX, textureY); // Box 123
		bodyModel[20] = new ModelRendererTurbo(this, 56, 144, textureX, textureY); // Box 123
		bodyModel[21] = new ModelRendererTurbo(this, 56, 144, textureX, textureY); // Box 123
		bodyModel[22] = new ModelRendererTurbo(this, 56, 144, textureX, textureY); // Box 123
		bodyModel[23] = new ModelRendererTurbo(this, 56, 144, textureX, textureY); // Box 123
		bodyModel[24] = new ModelRendererTurbo(this, 56, 144, textureX, textureY); // Box 123
		bodyModel[25] = new ModelRendererTurbo(this, 10, 142, textureX, textureY); // Box 123
		bodyModel[26] = new ModelRendererTurbo(this, 53, 152, textureX, textureY); // Box 1
		bodyModel[27] = new ModelRendererTurbo(this, 50, 239, textureX, textureY); // Box 1
		bodyModel[28] = new ModelRendererTurbo(this, 284, 211, textureX, textureY); // Box 113
		bodyModel[29] = new ModelRendererTurbo(this, 284, 211, textureX, textureY); // Box 113
		bodyModel[30] = new ModelRendererTurbo(this, 284, 211, textureX, textureY); // Box 113
		bodyModel[31] = new ModelRendererTurbo(this, 337, 195, textureX, textureY); // Box 113
		bodyModel[32] = new ModelRendererTurbo(this, 327, 191, textureX, textureY); // Box 113
		bodyModel[33] = new ModelRendererTurbo(this, 132, 169, textureX, textureY); // Box 42
		bodyModel[34] = new ModelRendererTurbo(this, 57, 188, textureX, textureY); // Box 42
		bodyModel[35] = new ModelRendererTurbo(this, 374, 131, textureX, textureY); // Box 42
		bodyModel[36] = new ModelRendererTurbo(this, 345, 184, textureX, textureY); // Box 113
		bodyModel[37] = new ModelRendererTurbo(this, 27, 214, textureX, textureY); // Box 113
		bodyModel[38] = new ModelRendererTurbo(this, 187, 198, textureX, textureY); // Box 42
		bodyModel[39] = new ModelRendererTurbo(this, 418, 142, textureX, textureY); // Box 1
		bodyModel[40] = new ModelRendererTurbo(this, 137, 174, textureX, textureY); // Box 1
		bodyModel[41] = new ModelRendererTurbo(this, 284, 211, textureX, textureY); // Box 113
		bodyModel[42] = new ModelRendererTurbo(this, 284, 211, textureX, textureY); // Box 113
		bodyModel[43] = new ModelRendererTurbo(this, 284, 211, textureX, textureY); // Box 113
		bodyModel[44] = new ModelRendererTurbo(this, 284, 211, textureX, textureY); // Box 113
		bodyModel[45] = new ModelRendererTurbo(this, 284, 211, textureX, textureY); // Box 113
		bodyModel[46] = new ModelRendererTurbo(this, 284, 211, textureX, textureY); // Box 113
		bodyModel[47] = new ModelRendererTurbo(this, 315, 191, textureX, textureY); // Box 113
		bodyModel[48] = new ModelRendererTurbo(this, 37, 214, textureX, textureY); // Box 113
		bodyModel[49] = new ModelRendererTurbo(this, 365, 143, textureX, textureY); // Box 1
		bodyModel[50] = new ModelRendererTurbo(this, 284, 211, textureX, textureY); // Box 113
		bodyModel[51] = new ModelRendererTurbo(this, 284, 211, textureX, textureY); // Box 113
		bodyModel[52] = new ModelRendererTurbo(this, 284, 211, textureX, textureY); // Box 113
		bodyModel[53] = new ModelRendererTurbo(this, 284, 211, textureX, textureY); // Box 113
		bodyModel[54] = new ModelRendererTurbo(this, 284, 211, textureX, textureY); // Box 113
		bodyModel[55] = new ModelRendererTurbo(this, 284, 211, textureX, textureY); // Box 113
		bodyModel[56] = new ModelRendererTurbo(this, 304, 192, textureX, textureY); // Box 113
		bodyModel[57] = new ModelRendererTurbo(this, 32, 214, textureX, textureY); // Box 113
		bodyModel[58] = new ModelRendererTurbo(this, 317, 137, textureX, textureY); // Box 1
		bodyModel[59] = new ModelRendererTurbo(this, 284, 211, textureX, textureY); // Box 113
		bodyModel[60] = new ModelRendererTurbo(this, 284, 211, textureX, textureY); // Box 113
		bodyModel[61] = new ModelRendererTurbo(this, 284, 211, textureX, textureY); // Box 113
		bodyModel[62] = new ModelRendererTurbo(this, 102, 101, textureX, textureY); // Box 1
		bodyModel[63] = new ModelRendererTurbo(this, 152, 201, textureX, textureY); // Box 59
		bodyModel[64] = new ModelRendererTurbo(this, 33, 199, textureX, textureY); // Box 59
		bodyModel[65] = new ModelRendererTurbo(this, 356, 168, textureX, textureY); // Box 5
		bodyModel[66] = new ModelRendererTurbo(this, 356, 168, textureX, textureY); // Box 5
		bodyModel[67] = new ModelRendererTurbo(this, 129, 135, textureX, textureY); // Box 127
		bodyModel[68] = new ModelRendererTurbo(this, 227, 135, textureX, textureY); // Box 5
		bodyModel[69] = new ModelRendererTurbo(this, 48, 218, textureX, textureY); // Box 119
		bodyModel[70] = new ModelRendererTurbo(this, 164, 227, textureX, textureY); // Box 119
		bodyModel[71] = new ModelRendererTurbo(this, 58, 216, textureX, textureY); // Box 119
		bodyModel[72] = new ModelRendererTurbo(this, 430, 180, textureX, textureY); // Box 119
		bodyModel[73] = new ModelRendererTurbo(this, 409, 166, textureX, textureY); // Box 119
		bodyModel[74] = new ModelRendererTurbo(this, 402, 149, textureX, textureY); // Box 119
		bodyModel[75] = new ModelRendererTurbo(this, 179, 185, textureX, textureY); // Box 119
		bodyModel[76] = new ModelRendererTurbo(this, 105, 213, textureX, textureY); // Box 108
		bodyModel[77] = new ModelRendererTurbo(this, 164, 204, textureX, textureY); // Box 108
		bodyModel[78] = new ModelRendererTurbo(this, 40, 184, textureX, textureY); // Box 108
		bodyModel[79] = new ModelRendererTurbo(this, 61, 199, textureX, textureY); // Box 108
		bodyModel[80] = new ModelRendererTurbo(this, 83, 204, textureX, textureY); // Box 108
		bodyModel[81] = new ModelRendererTurbo(this, 131, 207, textureX, textureY); // Box 108
		bodyModel[82] = new ModelRendererTurbo(this, 128, 217, textureX, textureY); // Box 108
		bodyModel[83] = new ModelRendererTurbo(this, 187, 192, textureX, textureY); // Box 5
		bodyModel[84] = new ModelRendererTurbo(this, 256, 218, textureX, textureY); // Box 119
		bodyModel[85] = new ModelRendererTurbo(this, 289, 141, textureX, textureY); // Box 5
		bodyModel[86] = new ModelRendererTurbo(this, 56, 173, textureX, textureY); // Box 5
		bodyModel[87] = new ModelRendererTurbo(this, 168, 179, textureX, textureY); // Box 119
		bodyModel[88] = new ModelRendererTurbo(this, 425, 33, textureX, textureY); // Box 101
		bodyModel[89] = new ModelRendererTurbo(this, 265, 9, textureX, textureY); // Box 102
		bodyModel[90] = new ModelRendererTurbo(this, 505, 17, textureX, textureY); // Box 103
		bodyModel[91] = new ModelRendererTurbo(this, 441, 17, textureX, textureY); // Box 111
		bodyModel[92] = new ModelRendererTurbo(this, 11, 122, textureX, textureY); // Box 1
		bodyModel[93] = new ModelRendererTurbo(this, 11, 122, textureX, textureY); // Box 1
		bodyModel[94] = new ModelRendererTurbo(this, 11, 122, textureX, textureY); // Box 1
		bodyModel[95] = new ModelRendererTurbo(this, 11, 122, textureX, textureY); // Box 1

		bodyModel[0].addBox(0F, 0F, 0F, 36, 1, 22, 0F); // Box 1
		bodyModel[0].setRotationPoint(-18F, -0.5F, -11F);

		bodyModel[1].addBox(0F, 0F, 0F, 1, 1, 13, 0F); // Box 0
		bodyModel[1].setRotationPoint(-11.5F, 5.5F, -6.5F);

		bodyModel[2].addBox(0F, 0F, 0F, 1, 1, 13, 0F); // Box 0
		bodyModel[2].setRotationPoint(-0.5F, 5.5F, -6.5F);

		bodyModel[3].addBox(0F, 0F, 0F, 1, 1, 13, 0F); // Box 0
		bodyModel[3].setRotationPoint(10.5F, 5.5F, -6.5F);

		bodyModel[4].addBox(0F, 0F, 0F, 8, 8, 0, 0F); // Box 1
		bodyModel[4].setRotationPoint(-15F, 2F, -6F);

		bodyModel[5].addBox(0F, 0F, 0F, 8, 8, 0, 0F); // Box 1
		bodyModel[5].setRotationPoint(-15F, 2F, 6F);

		bodyModel[6].addBox(0F, 0F, 0F, 1, 4, 22, 0F); // Box 1
		bodyModel[6].setRotationPoint(17F, 0.5F, -11F);

		bodyModel[7].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 121
		bodyModel[7].setRotationPoint(20F, 0F, -1F);

		bodyModel[8].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 122
		bodyModel[8].setRotationPoint(19F, 1F, -1F);

		bodyModel[9].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 123
		bodyModel[9].setRotationPoint(18F, 0F, -1F);

		bodyModel[10].addBox(0F, 0F, 0F, 1, 6, 6, 0F); // Box 123
		bodyModel[10].setRotationPoint(20F, -1.5F, -10.5F);

		bodyModel[11].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 123
		bodyModel[11].setRotationPoint(18F, 1F, -7F);

		bodyModel[12].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 123
		bodyModel[12].setRotationPoint(18F, 1F, -9F);

		bodyModel[13].addBox(0F, 0F, 0F, 2, 3, 1, 0F); // Box 123
		bodyModel[13].setRotationPoint(18F, 0F, -8F);

		bodyModel[14].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 123
		bodyModel[14].setRotationPoint(18F, 1F, 8F);

		bodyModel[15].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 123
		bodyModel[15].setRotationPoint(18F, 1F, 6F);

		bodyModel[16].addBox(0F, 0F, 0F, 2, 3, 1, 0F); // Box 123
		bodyModel[16].setRotationPoint(18F, 0F, 7F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 123
		bodyModel[17].setRotationPoint(18F, 0F, 8F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 123
		bodyModel[18].setRotationPoint(18F, 2F, 6F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 123
		bodyModel[19].setRotationPoint(18F, 2F, 8F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 123
		bodyModel[20].setRotationPoint(18F, 0F, 6F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 123
		bodyModel[21].setRotationPoint(18F, 0F, -7F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 123
		bodyModel[22].setRotationPoint(18F, 2F, -9F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 123
		bodyModel[23].setRotationPoint(18F, 2F, -7F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 123
		bodyModel[24].setRotationPoint(18F, 0F, -9F);

		bodyModel[25].addBox(0F, 0F, 0F, 1, 6, 6, 0F); // Box 123
		bodyModel[25].setRotationPoint(20F, -1.5F, 4.5F);

		bodyModel[26].addBox(0F, 0F, 0F, 36, 10, 1, 0F); // Box 1
		bodyModel[26].setRotationPoint(-18F, -10.5F, -11F);

		bodyModel[27].addBox(0F, 0F, 0F, 36, 10, 1, 0F); // Box 1
		bodyModel[27].setRotationPoint(-18F, -10.5F, 10F);

		bodyModel[28].addBox(0F, 0F, 0F, 1, 6, 1, 0F); // Box 113
		bodyModel[28].setRotationPoint(-11.5F, 0.5F, 6.5F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 113
		bodyModel[29].setRotationPoint(-11.5F, 0.5F, 6.5F);

		bodyModel[30].addBox(0F, 0F, 0F, 1, 6, 1, 0F); // Box 113
		bodyModel[30].setRotationPoint(-11.5F, 0.5F, -7.5F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 113
		bodyModel[31].setRotationPoint(-17.5F, 0.5F, 7F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 113
		bodyModel[32].setRotationPoint(-6F, 0.5F, 7F);

		bodyModel[33].addBox(0F, 0F, 0F, 35, 1, 2, 0F); // Box 42
		bodyModel[33].setRotationPoint(-17.5F, 7.5F, 7.95F);

		bodyModel[34].addBox(0F, 0F, 0F, 34, 1, 1, 0F); // Box 42
		bodyModel[34].setRotationPoint(-16.5F, 6.5F, 6.45F);

		bodyModel[35].addBox(0F, 0F, 0F, 34, 1, 1, 0F); // Box 42
		bodyModel[35].setRotationPoint(-16.5F, 6.5F, -7.55F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 113
		bodyModel[36].setRotationPoint(-17.5F, 0.5F, -8.5F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 113
		bodyModel[37].setRotationPoint(-6F, 0.5F, -8.5F);

		bodyModel[38].addBox(0F, 0F, 0F, 35, 1, 2, 0F); // Box 42
		bodyModel[38].setRotationPoint(-17.5F, 7.5F, -10.05F);

		bodyModel[39].addBox(0F, 0F, 0F, 1, 1, 17, 0F); // Box 1
		bodyModel[39].setRotationPoint(-6F, 6.5F, -8.75F);

		bodyModel[40].addBox(0F, 0F, 0F, 1, 1, 17, 0F); // Box 1
		bodyModel[40].setRotationPoint(-17.5F, 6.5F, -8.75F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,-5F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 113
		bodyModel[41].setRotationPoint(-11.5F, 0.5F, 6.5F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 113
		bodyModel[42].setRotationPoint(-11.5F, 0.5F, -7.5F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,-5F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 113
		bodyModel[43].setRotationPoint(-11.5F, 0.5F, -7.5F);

		bodyModel[44].addBox(0F, 0F, 0F, 1, 6, 1, 0F); // Box 113
		bodyModel[44].setRotationPoint(-0.5F, 0.5F, 6.5F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 113
		bodyModel[45].setRotationPoint(-0.5F, 0.5F, 6.5F);

		bodyModel[46].addBox(0F, 0F, 0F, 1, 6, 1, 0F); // Box 113
		bodyModel[46].setRotationPoint(-0.5F, 0.5F, -7.5F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 113
		bodyModel[47].setRotationPoint(5.5F, 0.5F, 7F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 113
		bodyModel[48].setRotationPoint(5.5F, 0.5F, -8.5F);

		bodyModel[49].addBox(0F, 0F, 0F, 1, 1, 17, 0F); // Box 1
		bodyModel[49].setRotationPoint(5.5F, 6.5F, -8.75F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,-5F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 113
		bodyModel[50].setRotationPoint(-0.5F, 0.5F, 6.5F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 113
		bodyModel[51].setRotationPoint(-0.5F, 0.5F, -7.5F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,-5F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 113
		bodyModel[52].setRotationPoint(-0.5F, 0.5F, -7.5F);

		bodyModel[53].addBox(0F, 0F, 0F, 1, 6, 1, 0F); // Box 113
		bodyModel[53].setRotationPoint(10.5F, 0.5F, 6.5F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 113
		bodyModel[54].setRotationPoint(10.5F, 0.5F, 6.5F);

		bodyModel[55].addBox(0F, 0F, 0F, 1, 6, 1, 0F); // Box 113
		bodyModel[55].setRotationPoint(10.5F, 0.5F, -7.5F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 113
		bodyModel[56].setRotationPoint(16.5F, 0.5F, 7F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 113
		bodyModel[57].setRotationPoint(16.5F, 0.5F, -8.5F);

		bodyModel[58].addBox(0F, 0F, 0F, 1, 1, 17, 0F); // Box 1
		bodyModel[58].setRotationPoint(16.5F, 6.5F, -8.75F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,-5F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 113
		bodyModel[59].setRotationPoint(10.5F, 0.5F, 6.5F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 113
		bodyModel[60].setRotationPoint(10.5F, 0.5F, -7.5F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,-5F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 113
		bodyModel[61].setRotationPoint(10.5F, 0.5F, -7.5F);

		bodyModel[62].addBox(0F, 0F, 0F, 1, 10, 20, 0F); // Box 1
		bodyModel[62].setRotationPoint(17F, -10.5F, -10F);

		bodyModel[63].addBox(0F, 0F, 0F, 2, 3, 2, 0F); // Box 59
		bodyModel[63].setRotationPoint(-17F, 0.5F, -1F);

		bodyModel[64].addBox(0F, 0F, 0F, 6, 1, 2, 0F); // Box 59
		bodyModel[64].setRotationPoint(-23F, 2.5F, -1F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 8, 4, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.05F, 0F, 0F, 0.05F); // Box 5
		bodyModel[65].setRotationPoint(-23F, 0F, 3F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 8, 4, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.05F, 0F, 0F, 0.05F); // Box 5
		bodyModel[66].setRotationPoint(-23F, 0F, -3F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 26, 9, 20, 0F,-8F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 127
		bodyModel[67].setRotationPoint(-17F, -10F, -10F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 8, 10, 20, 0F,0F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, 0F, 0F, 0F); // Box 5
		bodyModel[68].setRotationPoint(9F, -10.5F, -10F);

		bodyModel[69].addBox(0F, 0F, 0F, 1, 2, 3, 0F); // Box 119
		bodyModel[69].setRotationPoint(15.5F, -12F, 7F);

		bodyModel[70].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 119
		bodyModel[70].setRotationPoint(16.5F, -12F, 8F);

		bodyModel[71].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 119
		bodyModel[71].setRotationPoint(14.5F, -12F, 8F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.25F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 119
		bodyModel[72].setRotationPoint(14.5F, -12F, 7F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -0.25F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 119
		bodyModel[73].setRotationPoint(16.5F, -12F, 7F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.25F); // Box 119
		bodyModel[74].setRotationPoint(14.5F, -12F, 9F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.25F, 0F, 0F, 0F); // Box 119
		bodyModel[75].setRotationPoint(16.5F, -12F, 9F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 108
		bodyModel[76].setRotationPoint(10F, -13F, -5.5F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 108
		bodyModel[77].setRotationPoint(10F, -13F, -9.5F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 108
		bodyModel[78].setRotationPoint(14F, -13F, -5.5F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 108
		bodyModel[79].setRotationPoint(14F, -13F, -9.5F);

		bodyModel[80].addBox(0F, 0F, 0F, 2, 3, 2, 0F); // Box 108
		bodyModel[80].setRotationPoint(12F, -13F, -5.5F);

		bodyModel[81].addBox(0F, 0F, 0F, 6, 3, 2, 0F); // Box 108
		bodyModel[81].setRotationPoint(10F, -13F, -7.5F);

		bodyModel[82].addBox(0F, 0F, 0F, 2, 3, 2, 0F); // Box 108
		bodyModel[82].setRotationPoint(12F, -13F, -9.5F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 36, 3, 1, 0F,-4F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, -4F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		bodyModel[83].setRotationPoint(-18F, -13.5F, -11F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 119
		bodyModel[84].setRotationPoint(18F, -13.5F, -12F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 1, 3, 22, 0F,-1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		bodyModel[85].setRotationPoint(17F, -13.5F, -11F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 36, 3, 1, 0F,-4F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, -4F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		bodyModel[86].setRotationPoint(-18F, -13.5F, 10F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F); // Box 119
		bodyModel[87].setRotationPoint(18F, -13.5F, 11F);

		bodyModel[88].addBox(0F, 0F, 0F, 2, 3, 2, 0F); // Box 101
		bodyModel[88].setRotationPoint(19F, -16.5F, -1.5F);

		bodyModel[89].addBox(0F, 0F, 0F, 0, 2, 1, 0F); // Box 102
		bodyModel[89].setRotationPoint(18.5F, -15.5F, -1F);

		bodyModel[90].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 103
		bodyModel[90].setRotationPoint(18F, -16.5F, -1.5F);

		bodyModel[91].addBox(0F, 0F, 0F, 0, 2, 1, 0F); // Box 111
		bodyModel[91].setRotationPoint(20F, -18.5F, -1F);

		bodyModel[92].addBox(0F, 0F, 0F, 8, 8, 0, 0F); // Box 1
		bodyModel[92].setRotationPoint(-4F, 2F, -6F);

		bodyModel[93].addBox(0F, 0F, 0F, 8, 8, 0, 0F); // Box 1
		bodyModel[93].setRotationPoint(-4F, 2F, 6F);

		bodyModel[94].addBox(0F, 0F, 0F, 8, 8, 0, 0F); // Box 1
		bodyModel[94].setRotationPoint(7F, 2F, -6F);

		bodyModel[95].addBox(0F, 0F, 0F, 8, 8, 0, 0F); // Box 1
		bodyModel[95].setRotationPoint(7F, 2F, 6F);
	}
}