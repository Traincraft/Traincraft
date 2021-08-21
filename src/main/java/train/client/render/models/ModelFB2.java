//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 19.06.2020 - 15:44:54
// Last changed on: 19.06.2020 - 15:44:54

package train.client.render.models;

import tmt.ModelConverter;
import tmt.ModelRendererTurbo;

public class ModelFB2 extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelFB2() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[64];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 4
		bodyModel[1] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 5
		bodyModel[2] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 30
		bodyModel[3] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 46
		bodyModel[4] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 47
		bodyModel[5] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 48
		bodyModel[6] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 346
		bodyModel[7] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 51
		bodyModel[8] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 52
		bodyModel[9] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 63
		bodyModel[10] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 64
		bodyModel[11] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 69
		bodyModel[12] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 70
		bodyModel[13] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 104
		bodyModel[14] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 110
		bodyModel[15] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 339
		bodyModel[16] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 340
		bodyModel[17] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 101
		bodyModel[18] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 102
		bodyModel[19] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 104
		bodyModel[20] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 105
		bodyModel[21] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 107
		bodyModel[22] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 108
		bodyModel[23] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 109
		bodyModel[24] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 110
		bodyModel[25] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 111
		bodyModel[26] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 112
		bodyModel[27] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 113
		bodyModel[28] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 114
		bodyModel[29] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 299 lamp
		bodyModel[30] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 116
		bodyModel[31] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 117
		bodyModel[32] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 118
		bodyModel[33] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 151
		bodyModel[34] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 120
		bodyModel[35] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 121
		bodyModel[36] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 122
		bodyModel[37] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 123
		bodyModel[38] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 124
		bodyModel[39] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 125
		bodyModel[40] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 126
		bodyModel[41] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 127
		bodyModel[42] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 128
		bodyModel[43] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 129
		bodyModel[44] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 130
		bodyModel[45] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 131
		bodyModel[46] = new ModelRendererTurbo(this, 9, 9, textureX, textureY); // Box 132
		bodyModel[47] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 133
		bodyModel[48] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Box 134
		bodyModel[49] = new ModelRendererTurbo(this, 105, 9, textureX, textureY); // Box 136
		bodyModel[50] = new ModelRendererTurbo(this, 145, 9, textureX, textureY); // Box 137
		bodyModel[51] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Box 138
		bodyModel[52] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 139
		bodyModel[53] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 53
		bodyModel[54] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 54
		bodyModel[55] = new ModelRendererTurbo(this, 73, 9, textureX, textureY); // Box 55
		bodyModel[56] = new ModelRendererTurbo(this, 129, 9, textureX, textureY); // Box 56
		bodyModel[57] = new ModelRendererTurbo(this, 81, 9, textureX, textureY); // Box 57
		bodyModel[58] = new ModelRendererTurbo(this, 137, 9, textureX, textureY); // Box 58
		bodyModel[59] = new ModelRendererTurbo(this, 153, 9, textureX, textureY); // Box 59
		bodyModel[60] = new ModelRendererTurbo(this, 177, 9, textureX, textureY); // Box 60
		bodyModel[61] = new ModelRendererTurbo(this, 193, 9, textureX, textureY); // Box 61
		bodyModel[62] = new ModelRendererTurbo(this, 201, 9, textureX, textureY); // Box 62
		bodyModel[63] = new ModelRendererTurbo(this, 225, 9, textureX, textureY); // Box 372

		bodyModel[0].addBox(0F, 0F, 0F, 2, 2, 18, 0F); // Box 4
		bodyModel[0].setRotationPoint(-8F, 0.5F, -9F);

		bodyModel[1].addBox(0F, 0F, 0F, 2, 2, 18, 0F); // Box 5
		bodyModel[1].setRotationPoint(6F, 0.5F, -9F);

		bodyModel[2].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 30
		bodyModel[2].setRotationPoint(7F, 1.5F, 6F);

		bodyModel[3].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 46
		bodyModel[3].setRotationPoint(-7F, 1.5F, 6F);

		bodyModel[4].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 47
		bodyModel[4].setRotationPoint(-7F, 1.5F, -6F);

		bodyModel[5].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 48
		bodyModel[5].setRotationPoint(7F, 1.5F, -6F);

		bodyModel[6].addBox(0F, 0F, 0F, 6, 4, 11, 0F); // Box 346
		bodyModel[6].setRotationPoint(-9.5F, -0.5F, -5.5F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 51
		bodyModel[7].setRotationPoint(-8F, -1.75F, -9.5F);

		bodyModel[8].addBox(0F, 0F, 0F, 2, 0, 1, 0F); // Box 52
		bodyModel[8].setRotationPoint(-6F, -0.85F, -9.5F);

		bodyModel[9].addBox(0F, 0F, 0F, 7, 0, 1, 0F); // Box 63
		bodyModel[9].setRotationPoint(3.5F, 3.01F, -8.25F);

		bodyModel[10].addBox(0F, 0F, 0F, 0, 3, 1, 0F); // Box 64
		bodyModel[10].setRotationPoint(10.5F, 0.00999999999999979F, -8.25F);

		bodyModel[11].addBox(0F, 0F, 0F, 7, 0, 1, 0F); // Box 69
		bodyModel[11].setRotationPoint(-10.5F, 3.01F, -8.25F);

		bodyModel[12].addBox(0F, 0F, 0F, 0, 3, 1, 0F); // Box 70
		bodyModel[12].setRotationPoint(-10.5F, 0.00999999999999979F, -8.25F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 104
		bodyModel[13].setRotationPoint(-8F, 0.5F, -9.5F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 110
		bodyModel[14].setRotationPoint(6F, 0.5F, -9.5F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 339
		bodyModel[15].setRotationPoint(6F, 0.5F, 8.5F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 340
		bodyModel[16].setRotationPoint(-8F, 0.5F, 8.5F);

		bodyModel[17].addBox(0F, 0F, 0F, 3, 2, 1, 0F); // Box 101
		bodyModel[17].setRotationPoint(-8.5F, -2F, -8.5F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 102
		bodyModel[18].setRotationPoint(-2.5F, 1F, -8.5F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F); // Box 104
		bodyModel[19].setRotationPoint(2.5F, -2F, -8.5F);

		bodyModel[20].addBox(0F, 0F, 0F, 3, 2, 1, 0F); // Box 105
		bodyModel[20].setRotationPoint(5.5F, -2F, -8.5F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 107
		bodyModel[21].setRotationPoint(-10.5F, -2F, -8.25F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 108
		bodyModel[22].setRotationPoint(9.5F, -2F, -8.25F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 109
		bodyModel[23].setRotationPoint(-10F, 0F, -8.25F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 110
		bodyModel[24].setRotationPoint(-6F, 0F, -8.25F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 111
		bodyModel[25].setRotationPoint(8F, 0F, -8.25F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 112
		bodyModel[26].setRotationPoint(4F, 0F, -8.25F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F); // Box 113
		bodyModel[27].setRotationPoint(-5.5F, -2F, -8.5F);

		bodyModel[28].addBox(0F, 0F, 0F, 5, 1, 3, 0F); // Box 114
		bodyModel[28].setRotationPoint(-2.5F, -2F, -8.5F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 2, 4, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 299 lamp
		bodyModel[29].setRotationPoint(-2.25F, -1.25F, -8.5F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 2, 4, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 116
		bodyModel[30].setRotationPoint(0.25F, -1.25F, -8.5F);

		bodyModel[31].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 117
		bodyModel[31].setRotationPoint(8.5F, -2F, -8.25F);

		bodyModel[32].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 118
		bodyModel[32].setRotationPoint(-9.5F, -2F, -8.25F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 1, 0, 4, 0F,0F, 0F, -1F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 151
		bodyModel[33].setRotationPoint(-4F, -0.85F, -9.5F);

		bodyModel[34].addBox(0F, 0F, 0F, 3, 2, 1, 0F); // Box 120
		bodyModel[34].setRotationPoint(5.5F, -2F, 7.5F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F); // Box 121
		bodyModel[35].setRotationPoint(2.5F, -2F, 7.5F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 122
		bodyModel[36].setRotationPoint(-2.5F, 1F, 7.5F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F); // Box 123
		bodyModel[37].setRotationPoint(-5.5F, -2F, 7.5F);

		bodyModel[38].addBox(0F, 0F, 0F, 3, 2, 1, 0F); // Box 124
		bodyModel[38].setRotationPoint(-8.5F, -2F, 7.5F);

		bodyModel[39].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 125
		bodyModel[39].setRotationPoint(8.5F, -2F, 7.25F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 126
		bodyModel[40].setRotationPoint(9.5F, -2F, 7.25F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 127
		bodyModel[41].setRotationPoint(8F, 0F, 7.25F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 128
		bodyModel[42].setRotationPoint(4F, 0F, 7.25F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 129
		bodyModel[43].setRotationPoint(-6F, 0F, 7.25F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 130
		bodyModel[44].setRotationPoint(-10F, 0F, 7.25F);

		bodyModel[45].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 131
		bodyModel[45].setRotationPoint(-9.5F, -2F, 7.25F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 132
		bodyModel[46].setRotationPoint(-10.5F, -2F, 7.25F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 2, 4, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 133
		bodyModel[47].setRotationPoint(0.25F, -1.25F, 6.5F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 2, 4, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 134
		bodyModel[48].setRotationPoint(-2.25F, -1.25F, 6.5F);

		bodyModel[49].addBox(0F, 0F, 0F, 6, 4, 11, 0F); // Box 136
		bodyModel[49].setRotationPoint(3.5F, -0.5F, -5.5F);

		bodyModel[50].addBox(0F, 0F, 0F, 7, 4, 12, 0F); // Box 137
		bodyModel[50].setRotationPoint(-3.5F, -1F, -6F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 1, 3, 0, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 138
		bodyModel[51].setRotationPoint(6.5F, -2F, -9.25F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 139
		bodyModel[52].setRotationPoint(6F, -2.5F, -9F);

		bodyModel[53].addBox(0F, 0F, 0F, 2, 0, 1, 0F); // Box 53
		bodyModel[53].setRotationPoint(-6F, -0.85F, 8.5F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 1, 0, 4, 0F,-1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F); // Box 54
		bodyModel[54].setRotationPoint(-4F, -0.85F, 5.5F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 55
		bodyModel[55].setRotationPoint(-8F, -1.75F, 8.5F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 1, 3, 0, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 56
		bodyModel[56].setRotationPoint(6.5F, -2F, 9.25F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 57
		bodyModel[57].setRotationPoint(6F, -2.5F, 8F);

		bodyModel[58].addBox(0F, 0F, 0F, 7, 0, 1, 0F); // Box 58
		bodyModel[58].setRotationPoint(3.5F, 3.01F, 7.25F);

		bodyModel[59].addBox(0F, 0F, 0F, 0, 3, 1, 0F); // Box 59
		bodyModel[59].setRotationPoint(10.5F, 0.00999999999999979F, 7.25F);

		bodyModel[60].addBox(0F, 0F, 0F, 7, 0, 1, 0F); // Box 60
		bodyModel[60].setRotationPoint(-10.5F, 3.01F, 7.25F);

		bodyModel[61].addBox(0F, 0F, 0F, 0, 3, 1, 0F); // Box 61
		bodyModel[61].setRotationPoint(-10.5F, 0.00999999999999979F, 7.25F);

		bodyModel[62].addBox(0F, 0F, 0F, 5, 1, 3, 0F); // Box 62
		bodyModel[62].setRotationPoint(-2.5F, -2F, 5.5F);

		bodyModel[63].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 372
		bodyModel[63].setRotationPoint(-1F, -2F, -1F);
	}
}