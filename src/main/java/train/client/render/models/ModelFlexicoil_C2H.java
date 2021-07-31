//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 13.06.2020 - 11:01:35
// Last changed on: 13.06.2020 - 11:01:35

package train.client.render.models; //Path where the model is located


import tmt.ModelConverter;
import tmt.ModelRendererTurbo;

public class ModelFlexicoil_C2H extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelFlexicoil_C2H() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[95];

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
		bodyModel[18] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 51
		bodyModel[19] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 52
		bodyModel[20] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 53
		bodyModel[21] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 62
		bodyModel[22] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 63
		bodyModel[23] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 64
		bodyModel[24] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 65
		bodyModel[25] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 66
		bodyModel[26] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 67
		bodyModel[27] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 68
		bodyModel[28] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 69
		bodyModel[29] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 70
		bodyModel[30] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 85
		bodyModel[31] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 86
		bodyModel[32] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 87
		bodyModel[33] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 91
		bodyModel[34] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 92
		bodyModel[35] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 93
		bodyModel[36] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 94
		bodyModel[37] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 100
		bodyModel[38] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 101
		bodyModel[39] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 104
		bodyModel[40] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 105
		bodyModel[41] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 106
		bodyModel[42] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 107
		bodyModel[43] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 108
		bodyModel[44] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 109
		bodyModel[45] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 110
		bodyModel[46] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 112
		bodyModel[47] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Box 115
		bodyModel[48] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Box 116
		bodyModel[49] = new ModelRendererTurbo(this, 89, 9, textureX, textureY); // Box 117
		bodyModel[50] = new ModelRendererTurbo(this, 105, 9, textureX, textureY); // Box 118
		bodyModel[51] = new ModelRendererTurbo(this, 73, 9, textureX, textureY); // Box 119
		bodyModel[52] = new ModelRendererTurbo(this, 121, 9, textureX, textureY); // Box 120
		bodyModel[53] = new ModelRendererTurbo(this, 137, 9, textureX, textureY); // Box 121
		bodyModel[54] = new ModelRendererTurbo(this, 145, 9, textureX, textureY); // Box 122
		bodyModel[55] = new ModelRendererTurbo(this, 161, 9, textureX, textureY); // Box 123
		bodyModel[56] = new ModelRendererTurbo(this, 169, 9, textureX, textureY); // Box 124
		bodyModel[57] = new ModelRendererTurbo(this, 321, 9, textureX, textureY); // Box 125
		bodyModel[58] = new ModelRendererTurbo(this, 337, 9, textureX, textureY); // Box 126
		bodyModel[59] = new ModelRendererTurbo(this, 353, 9, textureX, textureY); // Box 127
		bodyModel[60] = new ModelRendererTurbo(this, 369, 9, textureX, textureY); // Box 128
		bodyModel[61] = new ModelRendererTurbo(this, 177, 9, textureX, textureY); // Box 129
		bodyModel[62] = new ModelRendererTurbo(this, 385, 9, textureX, textureY); // Box 130
		bodyModel[63] = new ModelRendererTurbo(this, 401, 9, textureX, textureY); // Box 131
		bodyModel[64] = new ModelRendererTurbo(this, 417, 9, textureX, textureY); // Box 132
		bodyModel[65] = new ModelRendererTurbo(this, 433, 9, textureX, textureY); // Box 133
		bodyModel[66] = new ModelRendererTurbo(this, 441, 9, textureX, textureY); // Box 135
		bodyModel[67] = new ModelRendererTurbo(this, 449, 9, textureX, textureY); // Box 136
		bodyModel[68] = new ModelRendererTurbo(this, 457, 9, textureX, textureY); // Box 137
		bodyModel[69] = new ModelRendererTurbo(this, 185, 9, textureX, textureY); // Box 138
		bodyModel[70] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 139
		bodyModel[71] = new ModelRendererTurbo(this, 217, 9, textureX, textureY); // Box 140
		bodyModel[72] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 141
		bodyModel[73] = new ModelRendererTurbo(this, 225, 9, textureX, textureY); // Box 142
		bodyModel[74] = new ModelRendererTurbo(this, 265, 9, textureX, textureY); // Box 143
		bodyModel[75] = new ModelRendererTurbo(this, 305, 9, textureX, textureY); // Box 144
		bodyModel[76] = new ModelRendererTurbo(this, 465, 9, textureX, textureY); // Box 145
		bodyModel[77] = new ModelRendererTurbo(this, 481, 9, textureX, textureY); // Box 146
		bodyModel[78] = new ModelRendererTurbo(this, 497, 9, textureX, textureY); // Box 147
		bodyModel[79] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 148
		bodyModel[80] = new ModelRendererTurbo(this, 161, 17, textureX, textureY); // Box 149
		bodyModel[81] = new ModelRendererTurbo(this, 177, 17, textureX, textureY); // Box 150
		bodyModel[82] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 151
		bodyModel[83] = new ModelRendererTurbo(this, 473, 9, textureX, textureY); // Box 152
		bodyModel[84] = new ModelRendererTurbo(this, 489, 9, textureX, textureY); // Box 153
		bodyModel[85] = new ModelRendererTurbo(this, 185, 17, textureX, textureY); // Box 154
		bodyModel[86] = new ModelRendererTurbo(this, 337, 9, textureX, textureY); // Box 155
		bodyModel[87] = new ModelRendererTurbo(this, 281, 9, textureX, textureY); // Box 156
		bodyModel[88] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 157
		bodyModel[89] = new ModelRendererTurbo(this, 41, 17, textureX, textureY); // Box 158
		bodyModel[90] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Box 159
		bodyModel[91] = new ModelRendererTurbo(this, 193, 17, textureX, textureY); // Box 160
		bodyModel[92] = new ModelRendererTurbo(this, 209, 17, textureX, textureY); // Box 161
		bodyModel[93] = new ModelRendererTurbo(this, 225, 17, textureX, textureY); // Box 162
		bodyModel[94] = new ModelRendererTurbo(this, 241, 17, textureX, textureY); // Box 163

		bodyModel[0].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 0
		bodyModel[0].setRotationPoint(-8F, 6.5F, -6F);

		bodyModel[1].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 1
		bodyModel[1].setRotationPoint(3F, 6.5F, -6F);

		bodyModel[2].addBox(0F, 0F, 0F, 2, 2, 18, 0F); // Box 4
		bodyModel[2].setRotationPoint(-9F, 5.5F, -9F);

		bodyModel[3].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 3
		bodyModel[3].setRotationPoint(-8F, 6.5F, 6F);

		bodyModel[4].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 4
		bodyModel[4].setRotationPoint(3F, 6.5F, 6F);

		bodyModel[5].addBox(0F, 0F, 0F, 2, 2, 18, 0F); // Box 5
		bodyModel[5].setRotationPoint(2F, 5.5F, -9F);

		bodyModel[6].addBox(0F, 0F, 0F, 2, 2, 18, 0F); // Box 9
		bodyModel[6].setRotationPoint(13F, 5.5F, -9F);

		bodyModel[7].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 10
		bodyModel[7].setRotationPoint(14F, 6.5F, -6F);

		bodyModel[8].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 11
		bodyModel[8].setRotationPoint(14F, 6.5F, 6F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 27
		bodyModel[9].setRotationPoint(-11F, 5F, -9F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 29
		bodyModel[10].setRotationPoint(-7F, 5F, -9F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 30
		bodyModel[11].setRotationPoint(4F, 5F, -9F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 31
		bodyModel[12].setRotationPoint(0F, 5F, -9F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 32
		bodyModel[13].setRotationPoint(11F, 5F, -9F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 33
		bodyModel[14].setRotationPoint(15F, 5F, -9F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 173
		bodyModel[15].setRotationPoint(-9F, 5.5F, -9.5F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 22
		bodyModel[16].setRotationPoint(2F, 5.5F, -9.5F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 23
		bodyModel[17].setRotationPoint(13F, 5.5F, -9.5F);

		bodyModel[18].addBox(0F, 0F, 0F, 10, 4, 10, 0F); // Box 51
		bodyModel[18].setRotationPoint(-10F, 4F, -5F);

		bodyModel[19].addBox(0F, 0F, 0F, 10, 4, 10, 0F); // Box 52
		bodyModel[19].setRotationPoint(6F, 4F, -5F);

		bodyModel[20].addBox(0F, 0F, 0F, 6, 5, 10, 0F); // Box 53
		bodyModel[20].setRotationPoint(0F, 3F, -5F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 62
		bodyModel[21].setRotationPoint(4F, 5F, 8F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F); // Box 63
		bodyModel[22].setRotationPoint(0F, 5F, 8F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 64
		bodyModel[23].setRotationPoint(-7F, 5F, 8F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F); // Box 65
		bodyModel[24].setRotationPoint(-11F, 5F, 8F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F); // Box 66
		bodyModel[25].setRotationPoint(11F, 5F, 8F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 67
		bodyModel[26].setRotationPoint(15F, 5F, 8F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 68
		bodyModel[27].setRotationPoint(2F, 5.5F, 8.5F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 69
		bodyModel[28].setRotationPoint(-9F, 5.5F, 8.5F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 70
		bodyModel[29].setRotationPoint(13F, 5.5F, 8.5F);

		bodyModel[30].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 85
		bodyModel[30].setRotationPoint(13F, 3.05F, 9F);

		bodyModel[31].addBox(0F, 0F, 0F, 1, 0, 1, 0F); // Box 86
		bodyModel[31].setRotationPoint(12F, 3.5F, 9F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 1, 0, 2, 0F,1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F); // Box 87
		bodyModel[32].setRotationPoint(11F, 3.5F, 8F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 1, 0, 2, 0F,-1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F); // Box 91
		bodyModel[33].setRotationPoint(-6F, 3.5F, 8F);

		bodyModel[34].addBox(0F, 0F, 0F, 1, 0, 1, 0F); // Box 92
		bodyModel[34].setRotationPoint(-7F, 3.45F, 9F);

		bodyModel[35].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 93
		bodyModel[35].setRotationPoint(-9F, 3.05F, 9F);

		bodyModel[36].addBox(0F, 0F, 0F, 4, 0, 1, 0F); // Box 94
		bodyModel[36].setRotationPoint(-10F, 8F, 7.5F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 1.5F, 0F); // Box 100
		bodyModel[37].setRotationPoint(0F, 3.5F, 8F);

		bodyModel[38].addBox(0F, 0F, 0F, 5, 2, 1, 0F); // Box 101
		bodyModel[38].setRotationPoint(-5F, 4F, 8F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 104
		bodyModel[39].setRotationPoint(-11F, 4F, 7.5F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 105
		bodyModel[40].setRotationPoint(0F, 4F, 7.5F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 106
		bodyModel[41].setRotationPoint(11F, 4F, 7.5F);

		bodyModel[42].addBox(0F, 0F, 0F, 4, 0, 1, 0F); // Box 107
		bodyModel[42].setRotationPoint(1F, 8F, 7.5F);

		bodyModel[43].addBox(0F, 0F, 0F, 4, 0, 1, 0F); // Box 108
		bodyModel[43].setRotationPoint(12F, 8F, 7.5F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F); // Box 109
		bodyModel[44].setRotationPoint(-8F, 3.5F, 8F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F); // Box 110
		bodyModel[45].setRotationPoint(11F, 3.5F, 8F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F); // Box 112
		bodyModel[46].setRotationPoint(-11F, 3.5F, 8F);

		bodyModel[47].addBox(0F, 0F, 0F, 7, 1, 0, 0F); // Box 115
		bodyModel[47].setRotationPoint(-6F, 6.5F, 8F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.5F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, -0.5F, 0F, 0F); // Box 116
		bodyModel[48].setRotationPoint(3F, 3.5F, 8F);

		bodyModel[49].addBox(0F, 0F, 0F, 5, 2, 1, 0F); // Box 117
		bodyModel[49].setRotationPoint(6F, 4F, 8F);

		bodyModel[50].addBox(0F, 0F, 0F, 7, 1, 0, 0F); // Box 118
		bodyModel[50].setRotationPoint(5F, 6.5F, 8F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 119
		bodyModel[51].setRotationPoint(-9F, 2.5F, 8F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 120
		bodyModel[52].setRotationPoint(2.5F, 2.5F, 8F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 1, 3, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 121
		bodyModel[53].setRotationPoint(2.5F, 3.5F, 9F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F); // Box 122
		bodyModel[54].setRotationPoint(14F, 3.5F, 8F);

		bodyModel[55].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 123
		bodyModel[55].setRotationPoint(17F, 4F, 8F);

		bodyModel[56].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 124
		bodyModel[56].setRotationPoint(17F, 4F, -9F);

		bodyModel[57].addBox(0F, 0F, 0F, 5, 2, 1, 0F); // Box 125
		bodyModel[57].setRotationPoint(6F, 4F, -9F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F); // Box 126
		bodyModel[58].setRotationPoint(14F, 3.5F, -9F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F); // Box 127
		bodyModel[59].setRotationPoint(11F, 3.5F, -9F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.5F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, -0.5F, 0F, 0F); // Box 128
		bodyModel[60].setRotationPoint(3F, 3.5F, -9F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 129
		bodyModel[61].setRotationPoint(2.5F, 2.5F, -9F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 1.5F, 0F); // Box 130
		bodyModel[62].setRotationPoint(0F, 3.5F, -9F);

		bodyModel[63].addBox(0F, 0F, 0F, 5, 2, 1, 0F); // Box 131
		bodyModel[63].setRotationPoint(-5F, 4F, -9F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F); // Box 132
		bodyModel[64].setRotationPoint(-8F, 3.5F, -9F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F); // Box 133
		bodyModel[65].setRotationPoint(-11F, 3.5F, -9F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 135
		bodyModel[66].setRotationPoint(-9F, 2.5F, -9F);

		bodyModel[67].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 136
		bodyModel[67].setRotationPoint(-9F, 3.05F, -10F);

		bodyModel[68].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 137
		bodyModel[68].setRotationPoint(13F, 3.05F, -10F);

		bodyModel[69].addBox(0F, 0F, 0F, 1, 0, 1, 0F); // Box 138
		bodyModel[69].setRotationPoint(12F, 3.5F, -10F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 1, 0, 2, 0F,-1F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 139
		bodyModel[70].setRotationPoint(11F, 3.5F, -10F);

		bodyModel[71].addBox(0F, 0F, 0F, 1, 0, 1, 0F); // Box 140
		bodyModel[71].setRotationPoint(-7F, 3.5F, -10F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 1, 0, 2, 0F,0F, 0F, -1F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 141
		bodyModel[72].setRotationPoint(-6F, 3.5F, -10F);

		bodyModel[73].addBox(0F, 0F, 0F, 4, 0, 1, 0F); // Box 142
		bodyModel[73].setRotationPoint(-10F, 8F, -8.5F);

		bodyModel[74].addBox(0F, 0F, 0F, 7, 1, 0, 0F); // Box 143
		bodyModel[74].setRotationPoint(5F, 6.5F, -8F);

		bodyModel[75].addBox(0F, 0F, 0F, 7, 1, 0, 0F); // Box 144
		bodyModel[75].setRotationPoint(-6F, 6.5F, -8F);

		bodyModel[76].addBox(0F, 0F, 0F, 4, 0, 1, 0F); // Box 145
		bodyModel[76].setRotationPoint(1F, 8F, -8.5F);

		bodyModel[77].addBox(0F, 0F, 0F, 4, 0, 1, 0F); // Box 146
		bodyModel[77].setRotationPoint(12F, 8F, -8.5F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 147
		bodyModel[78].setRotationPoint(0F, 4F, -8.5F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 148
		bodyModel[79].setRotationPoint(-11F, 4F, -8.5F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 149
		bodyModel[80].setRotationPoint(11F, 4F, -8.5F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 1, 3, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 150
		bodyModel[81].setRotationPoint(2.5F, 3.5F, -9F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 151
		bodyModel[82].setRotationPoint(19F, 4F, -9F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 152
		bodyModel[83].setRotationPoint(19F, 4F, 7F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 153
		bodyModel[84].setRotationPoint(19F, 4F, -7F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 154
		bodyModel[85].setRotationPoint(19F, 4F, 5F);

		bodyModel[86].addBox(0F, 0F, 0F, 1, 2, 10, 0F); // Box 155
		bodyModel[86].setRotationPoint(19F, 5F, -5F);

		bodyModel[87].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 156
		bodyModel[87].setRotationPoint(-5F, 7.5F, 8F);

		bodyModel[88].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 157
		bodyModel[88].setRotationPoint(7F, 7.5F, 8F);

		bodyModel[89].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 158
		bodyModel[89].setRotationPoint(7F, 7.5F, -8F);

		bodyModel[90].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 159
		bodyModel[90].setRotationPoint(-5F, 7.5F, -8F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 160
		bodyModel[91].setRotationPoint(-5F, 3F, -9F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 161
		bodyModel[92].setRotationPoint(-5F, 3F, 8F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 162
		bodyModel[93].setRotationPoint(8F, 3F, -9F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 163
		bodyModel[94].setRotationPoint(8F, 3F, 8F);
	}
}