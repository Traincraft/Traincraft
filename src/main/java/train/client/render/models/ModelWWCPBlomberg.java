//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2021 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 13.06.2020 - 15:44:56
// Last changed on: 13.06.2020 - 15:44:56

package train.client.render.models; //Path where the model is located

import tmt.ModelConverter;
import tmt.ModelRendererTurbo;

public class ModelWWCPBlomberg extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelWWCPBlomberg() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[107];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 4
		bodyModel[1] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 5
		bodyModel[2] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 60
		bodyModel[3] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 66
		bodyModel[4] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 96
		bodyModel[5] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 71
		bodyModel[6] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 73
		bodyModel[7] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 75
		bodyModel[8] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 76
		bodyModel[9] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 77
		bodyModel[10] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 79
		bodyModel[11] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 81
		bodyModel[12] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 82
		bodyModel[13] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 116
		bodyModel[14] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 117
		bodyModel[15] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 122
		bodyModel[16] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 123
		bodyModel[17] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 124
		bodyModel[18] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 80
		bodyModel[19] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 3
		bodyModel[20] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 24
		bodyModel[21] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 25
		bodyModel[22] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 27
		bodyModel[23] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 89
		bodyModel[24] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 91
		bodyModel[25] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 92
		bodyModel[26] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 95
		bodyModel[27] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 66
		bodyModel[28] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 95
		bodyModel[29] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 102
		bodyModel[30] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 103
		bodyModel[31] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 104
		bodyModel[32] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 105
		bodyModel[33] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 109
		bodyModel[34] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 110
		bodyModel[35] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 111
		bodyModel[36] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 112
		bodyModel[37] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 113
		bodyModel[38] = new ModelRendererTurbo(this, 217, 9, textureX, textureY); // Box 114
		bodyModel[39] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 116
		bodyModel[40] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 117
		bodyModel[41] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 121
		bodyModel[42] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 123
		bodyModel[43] = new ModelRendererTurbo(this, 73, 9, textureX, textureY); // Box 126
		bodyModel[44] = new ModelRendererTurbo(this, 169, 9, textureX, textureY); // Box 127
		bodyModel[45] = new ModelRendererTurbo(this, 129, 9, textureX, textureY); // Box 128
		bodyModel[46] = new ModelRendererTurbo(this, 273, 9, textureX, textureY); // Box 60
		bodyModel[47] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 61
		bodyModel[48] = new ModelRendererTurbo(this, 281, 9, textureX, textureY); // Box 62
		bodyModel[49] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 144
		bodyModel[50] = new ModelRendererTurbo(this, 289, 9, textureX, textureY); // Box 145
		bodyModel[51] = new ModelRendererTurbo(this, 297, 9, textureX, textureY); // Box 146
		bodyModel[52] = new ModelRendererTurbo(this, 305, 9, textureX, textureY); // Box 147
		bodyModel[53] = new ModelRendererTurbo(this, 313, 9, textureX, textureY); // Box 148
		bodyModel[54] = new ModelRendererTurbo(this, 321, 9, textureX, textureY); // Box 149
		bodyModel[55] = new ModelRendererTurbo(this, 329, 9, textureX, textureY); // Box 150
		bodyModel[56] = new ModelRendererTurbo(this, 337, 9, textureX, textureY); // Box 151
		bodyModel[57] = new ModelRendererTurbo(this, 345, 9, textureX, textureY); // Box 152
		bodyModel[58] = new ModelRendererTurbo(this, 353, 9, textureX, textureY); // Box 153
		bodyModel[59] = new ModelRendererTurbo(this, 361, 9, textureX, textureY); // Box 154
		bodyModel[60] = new ModelRendererTurbo(this, 369, 9, textureX, textureY); // Box 155
		bodyModel[61] = new ModelRendererTurbo(this, 377, 9, textureX, textureY); // Box 156
		bodyModel[62] = new ModelRendererTurbo(this, 385, 9, textureX, textureY); // Box 161
		bodyModel[63] = new ModelRendererTurbo(this, 393, 9, textureX, textureY); // Box 162
		bodyModel[64] = new ModelRendererTurbo(this, 401, 9, textureX, textureY); // Box 172
		bodyModel[65] = new ModelRendererTurbo(this, 409, 9, textureX, textureY); // Box 173
		bodyModel[66] = new ModelRendererTurbo(this, 457, 9, textureX, textureY); // Box 109
		bodyModel[67] = new ModelRendererTurbo(this, 465, 9, textureX, textureY); // Box 9
		bodyModel[68] = new ModelRendererTurbo(this, 481, 9, textureX, textureY); // Box 39
		bodyModel[69] = new ModelRendererTurbo(this, 497, 9, textureX, textureY); // Box 6
		bodyModel[70] = new ModelRendererTurbo(this, 121, 17, textureX, textureY); // Box 8
		bodyModel[71] = new ModelRendererTurbo(this, 417, 9, textureX, textureY); // Box 116
		bodyModel[72] = new ModelRendererTurbo(this, 441, 9, textureX, textureY); // Box 118
		bodyModel[73] = new ModelRendererTurbo(this, 137, 17, textureX, textureY); // Box 119
		bodyModel[74] = new ModelRendererTurbo(this, 161, 17, textureX, textureY); // Box 120
		bodyModel[75] = new ModelRendererTurbo(this, 169, 17, textureX, textureY); // Box 121
		bodyModel[76] = new ModelRendererTurbo(this, 177, 17, textureX, textureY); // Box 122
		bodyModel[77] = new ModelRendererTurbo(this, 185, 17, textureX, textureY); // Box 123
		bodyModel[78] = new ModelRendererTurbo(this, 193, 17, textureX, textureY); // Box 37
		bodyModel[79] = new ModelRendererTurbo(this, 209, 17, textureX, textureY); // Box 38
		bodyModel[80] = new ModelRendererTurbo(this, 225, 17, textureX, textureY); // Box 66
		bodyModel[81] = new ModelRendererTurbo(this, 241, 17, textureX, textureY); // Box 67
		bodyModel[82] = new ModelRendererTurbo(this, 257, 17, textureX, textureY); // Box 37
		bodyModel[83] = new ModelRendererTurbo(this, 273, 17, textureX, textureY); // Box 37
		bodyModel[84] = new ModelRendererTurbo(this, 289, 17, textureX, textureY); // Box 37
		bodyModel[85] = new ModelRendererTurbo(this, 305, 17, textureX, textureY); // Box 37
		bodyModel[86] = new ModelRendererTurbo(this, 321, 17, textureX, textureY); // Box 37
		bodyModel[87] = new ModelRendererTurbo(this, 337, 17, textureX, textureY); // Box 37
		bodyModel[88] = new ModelRendererTurbo(this, 353, 17, textureX, textureY); // Box 134
		bodyModel[89] = new ModelRendererTurbo(this, 361, 17, textureX, textureY); // Box 135
		bodyModel[90] = new ModelRendererTurbo(this, 377, 17, textureX, textureY); // Box 136
		bodyModel[91] = new ModelRendererTurbo(this, 385, 17, textureX, textureY); // Box 137
		bodyModel[92] = new ModelRendererTurbo(this, 393, 17, textureX, textureY); // Box 138
		bodyModel[93] = new ModelRendererTurbo(this, 417, 17, textureX, textureY); // Box 139
		bodyModel[94] = new ModelRendererTurbo(this, 441, 17, textureX, textureY); // Box 140
		bodyModel[95] = new ModelRendererTurbo(this, 449, 17, textureX, textureY); // Box 141
		bodyModel[96] = new ModelRendererTurbo(this, 457, 17, textureX, textureY); // Box 142
		bodyModel[97] = new ModelRendererTurbo(this, 465, 17, textureX, textureY); // Box 143
		bodyModel[98] = new ModelRendererTurbo(this, 473, 17, textureX, textureY); // Box 105
		bodyModel[99] = new ModelRendererTurbo(this, 449, 9, textureX, textureY); // Box 106
		bodyModel[100] = new ModelRendererTurbo(this, 481, 17, textureX, textureY); // Box 107
		bodyModel[101] = new ModelRendererTurbo(this, 505, 17, textureX, textureY); // Box 108
		bodyModel[102] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 109
		bodyModel[103] = new ModelRendererTurbo(this, 9, 25, textureX, textureY); // Box 110
		bodyModel[104] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 111
		bodyModel[105] = new ModelRendererTurbo(this, 41, 25, textureX, textureY); // Box 112
		bodyModel[106] = new ModelRendererTurbo(this, 49, 25, textureX, textureY); // Box 113

		bodyModel[0].addBox(0F, 0F, 0F, 2, 2, 18, 0F); // Box 4
		bodyModel[0].setRotationPoint(-10F, 5.5F, -9F);

		bodyModel[1].addBox(0F, 0F, 0F, 2, 2, 18, 0F); // Box 5
		bodyModel[1].setRotationPoint(8F, 5.5F, -9F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 60
		bodyModel[2].setRotationPoint(10F, 4F, -8.5F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 66
		bodyModel[3].setRotationPoint(-5.5F, 4F, -7.75F);

		bodyModel[4].addBox(0F, 0F, 0F, 8, 2, 15, 0F); // Box 96
		bodyModel[4].setRotationPoint(-4F, 3.25F, -7.5F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 71
		bodyModel[5].setRotationPoint(-13.5F, 3F, -8.5F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 73
		bodyModel[6].setRotationPoint(-13.5F, 4F, -4.5F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 75
		bodyModel[7].setRotationPoint(-13.5F, 3F, -4.5F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 76
		bodyModel[8].setRotationPoint(-13.5F, 3F, 3.5F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 77
		bodyModel[9].setRotationPoint(12.5F, 3F, -8.5F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 79
		bodyModel[10].setRotationPoint(12.5F, 3F, 3.5F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 81
		bodyModel[11].setRotationPoint(12.5F, 4F, -4.5F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 82
		bodyModel[12].setRotationPoint(12.5F, 3F, -4.5F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 116
		bodyModel[13].setRotationPoint(-13.5F, 3F, 4.5F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 117
		bodyModel[14].setRotationPoint(12.5F, 3F, 4.5F);

		bodyModel[15].addBox(0F, 0F, 0F, 9, 4, 11, 0F); // Box 122
		bodyModel[15].setRotationPoint(-11F, 4F, -5.5F);

		bodyModel[16].addBox(0F, 0F, 0F, 9, 4, 11, 0F); // Box 123
		bodyModel[16].setRotationPoint(2F, 4F, -5.5F);

		bodyModel[17].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 124
		bodyModel[17].setRotationPoint(-2F, 2.5F, -2F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 80
		bodyModel[18].setRotationPoint(-8F, 5F, -8.5F);

		bodyModel[19].addBox(0F, 0F, 0F, 25, 1, 1, 0F); // Box 3
		bodyModel[19].setRotationPoint(-12.5F, 3F, -8.5F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F,-2F, -0.5F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 24
		bodyModel[20].setRotationPoint(-4.5F, 2F, -8.5F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F); // Box 25
		bodyModel[21].setRotationPoint(-6F, 4.5F, -8.5F);

		bodyModel[22].addBox(0F, 0F, 0F, 7, 1, 1, 0F); // Box 27
		bodyModel[22].setRotationPoint(-3.5F, 4F, -8.5F);

		bodyModel[23].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 89
		bodyModel[23].setRotationPoint(-10F, 4F, -8.5F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F,0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 91
		bodyModel[24].setRotationPoint(-12.5F, 7.5F, -8.5F);

		bodyModel[25].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 92
		bodyModel[25].setRotationPoint(6F, 4F, -8.5F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F); // Box 95
		bodyModel[26].setRotationPoint(-5.5F, 7F, -7.75F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 66
		bodyModel[27].setRotationPoint(4.5F, 4F, -7.75F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 95
		bodyModel[28].setRotationPoint(4.5F, 7F, -7.75F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 102
		bodyModel[29].setRotationPoint(-3F, 3F, -9.25F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 103
		bodyModel[30].setRotationPoint(2F, 3F, -9.25F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 104
		bodyModel[31].setRotationPoint(-10F, 5.5F, -9.5F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F); // Box 105
		bodyModel[32].setRotationPoint(-2.75F, 8F, -9.5F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 5, 3, 12, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 109
		bodyModel[33].setRotationPoint(-2.25F, 4.75F, -6F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 110
		bodyModel[34].setRotationPoint(8F, 5.5F, -9.5F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,-1.5F, -0.25F, 0F, -1.5F, -0.25F, 0F, -1.5F, -0.25F, 0F, -1.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 111
		bodyModel[35].setRotationPoint(-12F, 2F, -8.5F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,-1.5F, -0.25F, 0F, -1.5F, -0.25F, 0F, -1.5F, -0.25F, 0F, -1.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 112
		bodyModel[36].setRotationPoint(6F, 2F, -8.5F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 113
		bodyModel[37].setRotationPoint(-12F, 4F, -8.5F);

		bodyModel[38].addBox(0F, 0F, 0F, 25, 1, 1, 0F); // Box 114
		bodyModel[38].setRotationPoint(-12.5F, 3F, 7.5F);

		bodyModel[39].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 116
		bodyModel[39].setRotationPoint(-10F, 4F, 7.5F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 117
		bodyModel[40].setRotationPoint(-12F, 4F, 7.5F);

		bodyModel[41].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 121
		bodyModel[41].setRotationPoint(6F, 4F, 7.5F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 123
		bodyModel[42].setRotationPoint(10F, 4F, 7.5F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,-1.5F, -0.25F, 0F, -1.5F, -0.25F, 0F, -1.5F, -0.25F, 0F, -1.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 126
		bodyModel[43].setRotationPoint(6F, 2F, 7.5F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F,-2F, -0.5F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 127
		bodyModel[44].setRotationPoint(-4.5F, 2F, 7.5F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,-1.5F, -0.25F, 0F, -1.5F, -0.25F, 0F, -1.5F, -0.25F, 0F, -1.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[45].setRotationPoint(-12F, 2F, 7.5F);

		bodyModel[46].addBox(0F, 0F, 0F, 2, 0, 1, 0F); // Box 60
		bodyModel[46].setRotationPoint(6F, 2.5F, 8.5F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 1, 0, 4, 0F,1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F); // Box 61
		bodyModel[47].setRotationPoint(5F, 2.5F, 5.5F);

		bodyModel[48].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 62
		bodyModel[48].setRotationPoint(7.5F, 2.05F, 8.5F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 1, 0, 4, 0F,-1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F); // Box 144
		bodyModel[49].setRotationPoint(-6F, 2.5F, 5.5F);

		bodyModel[50].addBox(0F, 0F, 0F, 2, 0, 1, 0F); // Box 145
		bodyModel[50].setRotationPoint(-8F, 2.5F, 8.5F);

		bodyModel[51].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 146
		bodyModel[51].setRotationPoint(-9.5F, 2.05F, 8.5F);

		bodyModel[52].addBox(0F, 0F, 0F, 2, 0, 1, 0F); // Box 147
		bodyModel[52].setRotationPoint(-8F, 2.5F, -9.5F);

		bodyModel[53].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 148
		bodyModel[53].setRotationPoint(7.5F, 2.05F, -9.5F);

		bodyModel[54].addBox(0F, 0F, 0F, 2, 0, 1, 0F); // Box 149
		bodyModel[54].setRotationPoint(6F, 2.5F, -9.5F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 1, 0, 4, 0F,-1F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 150
		bodyModel[55].setRotationPoint(5F, 2.5F, -9.5F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 1, 0, 4, 0F,0F, 0F, -1F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 151
		bodyModel[56].setRotationPoint(-6F, 2.5F, -9.5F);

		bodyModel[57].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 152
		bodyModel[57].setRotationPoint(-9.5F, 2.05F, -9.5F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 153
		bodyModel[58].setRotationPoint(4.5F, 4F, 6.75F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 154
		bodyModel[59].setRotationPoint(4.5F, 7F, 6.75F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 155
		bodyModel[60].setRotationPoint(-5.5F, 4F, 6.75F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 156
		bodyModel[61].setRotationPoint(-5.5F, 7F, 6.75F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 161
		bodyModel[62].setRotationPoint(-3F, 3F, 8.25F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 162
		bodyModel[63].setRotationPoint(2F, 3F, 8.25F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 172
		bodyModel[64].setRotationPoint(8F, 5.5F, 8.5F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 173
		bodyModel[65].setRotationPoint(-10F, 5.5F, 8.5F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, -1F, -0.5F, 0.5F, -1F); // Box 109
		bodyModel[66].setRotationPoint(-3.25F, 3.5F, -9F);

		bodyModel[67].addBox(-3.5F, -3.5F, 0F, 7, 7, 0, 0F); // Box 9
		bodyModel[67].setRotationPoint(-9F, 6.5F, 5.95F);

		bodyModel[68].addBox(-3.5F, -3.5F, 0F, 7, 7, 0, 0F); // Box 39
		bodyModel[68].setRotationPoint(-9F, 6.5F, -5.95F);

		bodyModel[69].addBox(-3.5F, -3.5F, 0F, 7, 7, 0, 0F); // Box 6
		bodyModel[69].setRotationPoint(9F, 6.5F, 5.95F);

		bodyModel[70].addBox(-3.5F, -3.5F, 0F, 7, 7, 0, 0F); // Box 8
		bodyModel[70].setRotationPoint(9F, 6.5F, -5.95F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F); // Box 116
		bodyModel[71].setRotationPoint(3F, 4.5F, -8.5F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 118
		bodyModel[72].setRotationPoint(-8F, 5F, -8.5F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F,0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 119
		bodyModel[73].setRotationPoint(3.5F, 7.5F, -8.5F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F); // Box 120
		bodyModel[74].setRotationPoint(-13.5F, 4F, -7.25F);

		bodyModel[75].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 121
		bodyModel[75].setRotationPoint(-12.5F, 5.5F, -7.5F);

		bodyModel[76].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 122
		bodyModel[76].setRotationPoint(11.5F, 5.5F, -7.5F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 123
		bodyModel[77].setRotationPoint(12.5F, 4F, -7.25F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 37
		bodyModel[78].setRotationPoint(-2F, 5.5F, -8F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 38
		bodyModel[79].setRotationPoint(-2F, 7F, -8F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 66
		bodyModel[80].setRotationPoint(-2F, 5.5F, 6F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 67
		bodyModel[81].setRotationPoint(-2F, 7F, 6F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F,0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F); // Box 37
		bodyModel[82].setRotationPoint(-2F, 6.6F, -9F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F,0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F); // Box 37
		bodyModel[83].setRotationPoint(-2F, 5.9F, -9F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F,0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.23F, 0F, 0F, -0.23F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.23F, 0F, 0F, -0.23F, 0F); // Box 37
		bodyModel[84].setRotationPoint(-2F, 6.25F, -10F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F,0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F); // Box 37
		bodyModel[85].setRotationPoint(-2F, 6.6F, 6F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F,0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F); // Box 37
		bodyModel[86].setRotationPoint(-2F, 5.9F, 6F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F,0F, -0.23F, 0F, 0F, -0.23F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.23F, 0F, 0F, -0.23F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F); // Box 37
		bodyModel[87].setRotationPoint(-2F, 6.25F, 7F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, -1F, -0.5F, 0.5F, -1F); // Box 134
		bodyModel[88].setRotationPoint(1.75F, 3.5F, -9F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, -1F, -0.5F, -0.5F, -1F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 135
		bodyModel[89].setRotationPoint(-2.75F, 8F, 8.5F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, 0.5F, 0.5F, -0.5F, 0.5F, 0.5F); // Box 136
		bodyModel[90].setRotationPoint(1.75F, 3.5F, 8F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, 0.5F, 0.5F, -0.5F, 0.5F, 0.5F); // Box 137
		bodyModel[91].setRotationPoint(-3.25F, 3.5F, 8F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F,0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 138
		bodyModel[92].setRotationPoint(3.5F, 7.5F, 7.5F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F,0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 139
		bodyModel[93].setRotationPoint(-12.5F, 7.5F, 7.5F);

		bodyModel[94].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 140
		bodyModel[94].setRotationPoint(-12.5F, 5.5F, 6.5F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 141
		bodyModel[95].setRotationPoint(-13.5F, 4F, 6.25F);

		bodyModel[96].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 142
		bodyModel[96].setRotationPoint(11.5F, 5.5F, 6.5F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 143
		bodyModel[97].setRotationPoint(12.5F, 4F, 6.25F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 105
		bodyModel[98].setRotationPoint(6F, 5F, -8.5F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 106
		bodyModel[99].setRotationPoint(6F, 5F, -8.5F);

		bodyModel[100].addBox(0F, 0F, 0F, 7, 1, 1, 0F); // Box 107
		bodyModel[100].setRotationPoint(-3.5F, 4F, 7.5F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 108
		bodyModel[101].setRotationPoint(6F, 5F, 7.5F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 109
		bodyModel[102].setRotationPoint(6F, 5F, 7.5F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F); // Box 110
		bodyModel[103].setRotationPoint(3F, 4.5F, 7.5F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F); // Box 111
		bodyModel[104].setRotationPoint(-6F, 4.5F, 7.5F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 112
		bodyModel[105].setRotationPoint(-8F, 5F, 7.5F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 113
		bodyModel[106].setRotationPoint(-8F, 5F, 7.5F);
	}
}