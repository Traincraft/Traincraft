//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2021 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 18.01.2019 - 17:00:48
// Last changed on: 18.01.2019 - 17:00:48

package train.client.render.models; //Path where the model is located

import tmt.ModelConverter;
import tmt.ModelRendererTurbo;

public class ModelStarCarFat extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelStarCarFat() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[137];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 5
		bodyModel[1] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 16
		bodyModel[2] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 17
		bodyModel[3] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 21
		bodyModel[4] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 393
		bodyModel[5] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 394
		bodyModel[6] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 395
		bodyModel[7] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 7
		bodyModel[8] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 30
		bodyModel[9] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 88
		bodyModel[10] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 89
		bodyModel[11] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 90
		bodyModel[12] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 91
		bodyModel[13] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 92
		bodyModel[14] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 93
		bodyModel[15] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 94
		bodyModel[16] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 48
		bodyModel[17] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 102
		bodyModel[18] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 103
		bodyModel[19] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 104
		bodyModel[20] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 105
		bodyModel[21] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 106
		bodyModel[22] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 107
		bodyModel[23] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 108
		bodyModel[24] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 109
		bodyModel[25] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 110
		bodyModel[26] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 111
		bodyModel[27] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 112
		bodyModel[28] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 113
		bodyModel[29] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 114
		bodyModel[30] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 115
		bodyModel[31] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 116
		bodyModel[32] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 117
		bodyModel[33] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 118
		bodyModel[34] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 119
		bodyModel[35] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 120
		bodyModel[36] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 121
		bodyModel[37] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 122
		bodyModel[38] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 123
		bodyModel[39] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 124
		bodyModel[40] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 9
		bodyModel[41] = new ModelRendererTurbo(this, 201, 9, textureX, textureY); // Box 39
		bodyModel[42] = new ModelRendererTurbo(this, 217, 9, textureX, textureY); // Box 124
		bodyModel[43] = new ModelRendererTurbo(this, 233, 9, textureX, textureY); // Box 125
		bodyModel[44] = new ModelRendererTurbo(this, 265, 9, textureX, textureY); // Box 126
		bodyModel[45] = new ModelRendererTurbo(this, 281, 9, textureX, textureY); // Box 127
		bodyModel[46] = new ModelRendererTurbo(this, 65, 9, textureX, textureY); // Box 131
		bodyModel[47] = new ModelRendererTurbo(this, 369, 9, textureX, textureY); // Box 141
		bodyModel[48] = new ModelRendererTurbo(this, 313, 9, textureX, textureY); // Box 142
		bodyModel[49] = new ModelRendererTurbo(this, 329, 9, textureX, textureY); // Box 143
		bodyModel[50] = new ModelRendererTurbo(this, 377, 9, textureX, textureY); // Box 144
		bodyModel[51] = new ModelRendererTurbo(this, 353, 9, textureX, textureY); // Box 145
		bodyModel[52] = new ModelRendererTurbo(this, 401, 9, textureX, textureY); // Box 146
		bodyModel[53] = new ModelRendererTurbo(this, 409, 9, textureX, textureY); // Box 147
		bodyModel[54] = new ModelRendererTurbo(this, 425, 9, textureX, textureY); // Box 150
		bodyModel[55] = new ModelRendererTurbo(this, 433, 9, textureX, textureY); // Box 151
		bodyModel[56] = new ModelRendererTurbo(this, 449, 9, textureX, textureY); // Box 152
		bodyModel[57] = new ModelRendererTurbo(this, 465, 9, textureX, textureY); // Box 154
		bodyModel[58] = new ModelRendererTurbo(this, 481, 9, textureX, textureY); // Box 155
		bodyModel[59] = new ModelRendererTurbo(this, 497, 9, textureX, textureY); // Box 156
		bodyModel[60] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 158
		bodyModel[61] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 159
		bodyModel[62] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Box 160
		bodyModel[63] = new ModelRendererTurbo(this, 41, 17, textureX, textureY); // Box 161
		bodyModel[64] = new ModelRendererTurbo(this, 185, 17, textureX, textureY); // Box 162
		bodyModel[65] = new ModelRendererTurbo(this, 209, 17, textureX, textureY); // Box 163
		bodyModel[66] = new ModelRendererTurbo(this, 409, 17, textureX, textureY); // Box 164
		bodyModel[67] = new ModelRendererTurbo(this, 433, 17, textureX, textureY); // Box 168
		bodyModel[68] = new ModelRendererTurbo(this, 449, 17, textureX, textureY); // Box 169
		bodyModel[69] = new ModelRendererTurbo(this, 465, 17, textureX, textureY); // Box 170
		bodyModel[70] = new ModelRendererTurbo(this, 481, 17, textureX, textureY); // Box 171
		bodyModel[71] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 172
		bodyModel[72] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 173
		bodyModel[73] = new ModelRendererTurbo(this, 233, 25, textureX, textureY); // Box 174
		bodyModel[74] = new ModelRendererTurbo(this, 249, 25, textureX, textureY); // Box 175
		bodyModel[75] = new ModelRendererTurbo(this, 273, 25, textureX, textureY); // Box 176
		bodyModel[76] = new ModelRendererTurbo(this, 41, 25, textureX, textureY); // Box 177
		bodyModel[77] = new ModelRendererTurbo(this, 289, 25, textureX, textureY); // Box 178
		bodyModel[78] = new ModelRendererTurbo(this, 305, 25, textureX, textureY); // Box 179
		bodyModel[79] = new ModelRendererTurbo(this, 321, 25, textureX, textureY); // Box 180
		bodyModel[80] = new ModelRendererTurbo(this, 337, 25, textureX, textureY); // Box 181
		bodyModel[81] = new ModelRendererTurbo(this, 353, 25, textureX, textureY); // Box 182
		bodyModel[82] = new ModelRendererTurbo(this, 369, 25, textureX, textureY); // Box 183
		bodyModel[83] = new ModelRendererTurbo(this, 377, 25, textureX, textureY); // Box 184
		bodyModel[84] = new ModelRendererTurbo(this, 393, 25, textureX, textureY); // Box 185
		bodyModel[85] = new ModelRendererTurbo(this, 425, 25, textureX, textureY); // Box 186
		bodyModel[86] = new ModelRendererTurbo(this, 449, 25, textureX, textureY); // Box 187
		bodyModel[87] = new ModelRendererTurbo(this, 457, 25, textureX, textureY); // Box 188
		bodyModel[88] = new ModelRendererTurbo(this, 473, 25, textureX, textureY); // Box 189
		bodyModel[89] = new ModelRendererTurbo(this, 489, 25, textureX, textureY); // Box 190
		bodyModel[90] = new ModelRendererTurbo(this, 49, 33, textureX, textureY); // Box 191
		bodyModel[91] = new ModelRendererTurbo(this, 65, 33, textureX, textureY); // Box 192
		bodyModel[92] = new ModelRendererTurbo(this, 81, 33, textureX, textureY); // Box 193
		bodyModel[93] = new ModelRendererTurbo(this, 105, 33, textureX, textureY); // Box 194
		bodyModel[94] = new ModelRendererTurbo(this, 505, 25, textureX, textureY); // Box 195
		bodyModel[95] = new ModelRendererTurbo(this, 121, 33, textureX, textureY); // Box 196
		bodyModel[96] = new ModelRendererTurbo(this, 137, 33, textureX, textureY); // Box 197
		bodyModel[97] = new ModelRendererTurbo(this, 153, 33, textureX, textureY); // Box 198
		bodyModel[98] = new ModelRendererTurbo(this, 169, 33, textureX, textureY); // Box 199
		bodyModel[99] = new ModelRendererTurbo(this, 185, 33, textureX, textureY); // Box 200
		bodyModel[100] = new ModelRendererTurbo(this, 201, 33, textureX, textureY); // Box 201
		bodyModel[101] = new ModelRendererTurbo(this, 33, 33, textureX, textureY); // Box 202
		bodyModel[102] = new ModelRendererTurbo(this, 217, 33, textureX, textureY); // Box 203
		bodyModel[103] = new ModelRendererTurbo(this, 401, 17, textureX, textureY); // Box 206
		bodyModel[104] = new ModelRendererTurbo(this, 193, 41, textureX, textureY); // Box 112
		bodyModel[105] = new ModelRendererTurbo(this, 49, 49, textureX, textureY); // Box 113
		bodyModel[106] = new ModelRendererTurbo(this, 169, 57, textureX, textureY); // Box 114
		bodyModel[107] = new ModelRendererTurbo(this, 345, 25, textureX, textureY); // Box 115
		bodyModel[108] = new ModelRendererTurbo(this, 449, 25, textureX, textureY); // Box 116
		bodyModel[109] = new ModelRendererTurbo(this, 289, 57, textureX, textureY); // Standard Seat
		bodyModel[110] = new ModelRendererTurbo(this, 33, 65, textureX, textureY); // Standard Seat
		bodyModel[111] = new ModelRendererTurbo(this, 81, 65, textureX, textureY); // Standard Seat
		bodyModel[112] = new ModelRendererTurbo(this, 129, 65, textureX, textureY); // Standard Seat
		bodyModel[113] = new ModelRendererTurbo(this, 377, 65, textureX, textureY); // Box 119
		bodyModel[114] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 120
		bodyModel[115] = new ModelRendererTurbo(this, 161, 73, textureX, textureY); // Box 121
		bodyModel[116] = new ModelRendererTurbo(this, 209, 73, textureX, textureY); // Box 122
		bodyModel[117] = new ModelRendererTurbo(this, 321, 33, textureX, textureY); // Box 123
		bodyModel[118] = new ModelRendererTurbo(this, 329, 33, textureX, textureY); // Box 130
		bodyModel[119] = new ModelRendererTurbo(this, 497, 33, textureX, textureY); // Box 131
		bodyModel[120] = new ModelRendererTurbo(this, 337, 41, textureX, textureY); // Box 136
		bodyModel[121] = new ModelRendererTurbo(this, 393, 41, textureX, textureY); // Box 137
		bodyModel[122] = new ModelRendererTurbo(this, 425, 49, textureX, textureY); // Box 139
		bodyModel[123] = new ModelRendererTurbo(this, 313, 57, textureX, textureY); // Box 140
		bodyModel[124] = new ModelRendererTurbo(this, 105, 65, textureX, textureY); // Box 141
		bodyModel[125] = new ModelRendererTurbo(this, 233, 73, textureX, textureY); // Box 142
		bodyModel[126] = new ModelRendererTurbo(this, 505, 41, textureX, textureY); // Box 143
		bodyModel[127] = new ModelRendererTurbo(this, 401, 65, textureX, textureY); // Box 144
		bodyModel[128] = new ModelRendererTurbo(this, 497, 57, textureX, textureY); // Box 145
		bodyModel[129] = new ModelRendererTurbo(this, 505, 65, textureX, textureY); // Box 146
		bodyModel[130] = new ModelRendererTurbo(this, 265, 73, textureX, textureY); // Box 147
		bodyModel[131] = new ModelRendererTurbo(this, 337, 73, textureX, textureY); // Box 148
		bodyModel[132] = new ModelRendererTurbo(this, 449, 73, textureX, textureY); // Box 149
		bodyModel[133] = new ModelRendererTurbo(this, 457, 73, textureX, textureY); // Box 150
		bodyModel[134] = new ModelRendererTurbo(this, 353, 33, textureX, textureY); // Box 151
		bodyModel[135] = new ModelRendererTurbo(this, 377, 33, textureX, textureY); // Box 152
		bodyModel[136] = new ModelRendererTurbo(this, 457, 33, textureX, textureY); // Box 153

		bodyModel[0].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 5
		bodyModel[0].setRotationPoint(-32F, 0F, -9F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 16
		bodyModel[1].setRotationPoint(-32F, 0F, 6F);

		bodyModel[2].addShapeBox(0F, -1F, -1F, 3, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 17
		bodyModel[2].setRotationPoint(-31F, 1.5F, 7.5F);
		bodyModel[2].rotateAngleX = 0.78539816F;

		bodyModel[3].addShapeBox(0F, -1F, -1F, 3, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 21
		bodyModel[3].setRotationPoint(-31F, 1.5F, -7.5F);
		bodyModel[3].rotateAngleX = 0.78539816F;

		bodyModel[4].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,1F, 0F, 0F, 1.25F, 0F, 0F, 1.25F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 393
		bodyModel[4].setRotationPoint(-30F, 2F, -0.5F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 394
		bodyModel[5].setRotationPoint(-31F, 1F, -0.5F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 1.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1.25F, 0F, 0F); // Box 395
		bodyModel[6].setRotationPoint(-28F, 1F, -0.5F);

		bodyModel[7].addBox(0F, -1F, -1F, 56, 2, 22, 0F); // Box 7
		bodyModel[7].setRotationPoint(-28F, 1.5F, -10F);

		bodyModel[8].addBox(0F, -1F, -1F, 5, 10, 1, 0F); // Box 30
		bodyModel[8].setRotationPoint(-27F, -8.5F, -10F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 88
		bodyModel[9].setRotationPoint(31F, 0F, -9F);

		bodyModel[10].addShapeBox(0F, -1F, -1F, 3, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 89
		bodyModel[10].setRotationPoint(28F, 1.5F, -7.5F);
		bodyModel[10].rotateAngleX = 0.78539816F;

		bodyModel[11].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 90
		bodyModel[11].setRotationPoint(30F, 1F, -0.5F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,1.25F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 91
		bodyModel[12].setRotationPoint(29F, 2F, -0.5F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1.25F, 0F, 0F, 1.25F, 0F, 0F, -1F, 0F, 0F); // Box 92
		bodyModel[13].setRotationPoint(26.75F, 1F, -0.5F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 93
		bodyModel[14].setRotationPoint(31F, 0F, 6F);

		bodyModel[15].addShapeBox(0F, -1F, -1F, 3, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 94
		bodyModel[15].setRotationPoint(28F, 1.5F, 7.5F);
		bodyModel[15].rotateAngleX = 0.78539816F;

		bodyModel[16].addBox(-0.5F, -0.5F, 0F, 1, 1, 18, 0F); // Box 48
		bodyModel[16].setRotationPoint(20F, 6F, -9F);

		bodyModel[17].addBox(0F, -1F, -1F, 1, 3, 1, 0F); // Box 102
		bodyModel[17].setRotationPoint(-20.5F, 3.5F, 0.5F);

		bodyModel[18].addBox(0F, -1F, -1F, 1, 3, 1, 0F); // Box 103
		bodyModel[18].setRotationPoint(-0.5F, 3.5F, 0.5F);

		bodyModel[19].addBox(0F, -1F, -1F, 1, 3, 1, 0F); // Box 104
		bodyModel[19].setRotationPoint(19.5F, 3.5F, 0.5F);

		bodyModel[20].addBox(-0.5F, -0.5F, 0F, 1, 1, 18, 0F); // Box 105
		bodyModel[20].setRotationPoint(0F, 6F, -9F);

		bodyModel[21].addBox(-0.5F, -0.5F, 0F, 1, 1, 18, 0F); // Box 106
		bodyModel[21].setRotationPoint(-20F, 6F, -9F);

		bodyModel[22].addShapeBox(-0.5F, -0.5F, 0F, 5, 4, 1, 0F,0F, -3F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 107
		bodyModel[22].setRotationPoint(21F, 3F, -9F);

		bodyModel[23].addShapeBox(-0.5F, -0.5F, 0F, 5, 4, 1, 0F,0F, -3F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 108
		bodyModel[23].setRotationPoint(1F, 3F, -9F);

		bodyModel[24].addShapeBox(-0.5F, -0.5F, 0F, 5, 4, 1, 0F,0F, -3F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 109
		bodyModel[24].setRotationPoint(-19F, 3F, -9F);

		bodyModel[25].addShapeBox(-0.5F, -0.5F, 0F, 5, 4, 1, 0F,-1F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -1F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F); // Box 110
		bodyModel[25].setRotationPoint(-25F, 3F, -9F);

		bodyModel[26].addShapeBox(-0.5F, -0.5F, 0F, 5, 4, 1, 0F,-1F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -1F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F); // Box 111
		bodyModel[26].setRotationPoint(-5F, 3F, -9F);

		bodyModel[27].addShapeBox(-0.5F, -0.5F, 0F, 5, 4, 1, 0F,-1F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -1F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F); // Box 112
		bodyModel[27].setRotationPoint(15F, 3F, -9F);

		bodyModel[28].addBox(-0.5F, -0.5F, 0F, 1, 2, 1, 0F); // Box 113
		bodyModel[28].setRotationPoint(20F, 4F, -9F);

		bodyModel[29].addBox(-0.5F, -0.5F, 0F, 1, 2, 1, 0F); // Box 114
		bodyModel[29].setRotationPoint(0F, 4F, -9F);

		bodyModel[30].addBox(-0.5F, -0.5F, 0F, 1, 2, 1, 0F); // Box 115
		bodyModel[30].setRotationPoint(-20F, 4F, -9F);

		bodyModel[31].addShapeBox(-0.5F, -0.5F, 0F, 5, 4, 1, 0F,-1F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -1F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F); // Box 116
		bodyModel[31].setRotationPoint(-25F, 3F, 8F);

		bodyModel[32].addBox(-0.5F, -0.5F, 0F, 1, 2, 1, 0F); // Box 117
		bodyModel[32].setRotationPoint(-20F, 4F, 8F);

		bodyModel[33].addShapeBox(-0.5F, -0.5F, 0F, 5, 4, 1, 0F,0F, -3F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 118
		bodyModel[33].setRotationPoint(-19F, 3F, 8F);

		bodyModel[34].addShapeBox(-0.5F, -0.5F, 0F, 5, 4, 1, 0F,-1F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -1F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F); // Box 119
		bodyModel[34].setRotationPoint(-5F, 3F, 8F);

		bodyModel[35].addBox(-0.5F, -0.5F, 0F, 1, 2, 1, 0F); // Box 120
		bodyModel[35].setRotationPoint(0F, 4F, 8F);

		bodyModel[36].addShapeBox(-0.5F, -0.5F, 0F, 5, 4, 1, 0F,0F, -3F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 121
		bodyModel[36].setRotationPoint(1F, 3F, 8F);

		bodyModel[37].addShapeBox(-0.5F, -0.5F, 0F, 5, 4, 1, 0F,-1F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -1F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F); // Box 122
		bodyModel[37].setRotationPoint(15F, 3F, 8F);

		bodyModel[38].addBox(-0.5F, -0.5F, 0F, 1, 2, 1, 0F); // Box 123
		bodyModel[38].setRotationPoint(20F, 4F, 8F);

		bodyModel[39].addShapeBox(-0.5F, -0.5F, 0F, 5, 4, 1, 0F,0F, -3F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 124
		bodyModel[39].setRotationPoint(21F, 3F, 8F);

		bodyModel[40].addBox(-3.5F, -3.5F, 0F, 7, 7, 0, 0F); // Box 9
		bodyModel[40].setRotationPoint(20F, 6F, 6F);

		bodyModel[41].addBox(-3.5F, -3.5F, 0F, 7, 7, 0, 0F); // Box 39
		bodyModel[41].setRotationPoint(20F, 6F, -6F);

		bodyModel[42].addBox(-3.5F, -3.5F, 0F, 7, 7, 0, 0F); // Box 124
		bodyModel[42].setRotationPoint(0F, 6F, -6F);

		bodyModel[43].addBox(-3.5F, -3.5F, 0F, 7, 7, 0, 0F); // Box 125
		bodyModel[43].setRotationPoint(0F, 6F, 6F);

		bodyModel[44].addBox(-3.5F, -3.5F, 0F, 7, 7, 0, 0F); // Box 126
		bodyModel[44].setRotationPoint(-20F, 6F, -6F);

		bodyModel[45].addBox(-3.5F, -3.5F, 0F, 7, 7, 0, 0F); // Box 127
		bodyModel[45].setRotationPoint(-20F, 6F, 6F);

		bodyModel[46].addBox(0F, -1F, -1F, 1, 10, 1, 0F); // Box 131
		bodyModel[46].setRotationPoint(-0.5F, -18.5F, -10F);

		bodyModel[47].addBox(0F, -1F, -1F, 1, 10, 1, 0F); // Box 141
		bodyModel[47].setRotationPoint(26F, -18.5F, -10F);

		bodyModel[48].addShapeBox(0F, -1F, -1F, 4, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 142
		bodyModel[48].setRotationPoint(22F, -18.5F, -10F);

		bodyModel[49].addShapeBox(0F, -1F, -1F, 4, 2, 1, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 143
		bodyModel[49].setRotationPoint(22F, -10.5F, -10F);

		bodyModel[50].addBox(-4F, -1F, -1F, 10, 10, 1, 0F); // Box 144
		bodyModel[50].setRotationPoint(-14F, -8.5F, -10F);

		bodyModel[51].addShapeBox(0F, -1F, -1F, 4, 2, 1, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 145
		bodyModel[51].setRotationPoint(-26F, -10.5F, -10F);

		bodyModel[52].addBox(0F, -1F, -1F, 1, 10, 1, 0F); // Box 146
		bodyModel[52].setRotationPoint(-27F, -18.5F, -10F);

		bodyModel[53].addShapeBox(0F, -1F, -1F, 4, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 147
		bodyModel[53].setRotationPoint(-26F, -18.5F, -10F);

		bodyModel[54].addBox(0F, -1F, -1F, 1, 10, 1, 0F); // Box 150
		bodyModel[54].setRotationPoint(-13.5F, -18.5F, -10F);

		bodyModel[55].addShapeBox(0F, -1F, -1F, 5, 2, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -2F, 0F); // Box 151
		bodyModel[55].setRotationPoint(-18.5F, -18.5F, -10F);

		bodyModel[56].addShapeBox(0F, -1F, -1F, 5, 2, 1, 0F,-0.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -2F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 152
		bodyModel[56].setRotationPoint(-18.5F, -10.5F, -10F);

		bodyModel[57].addShapeBox(0F, -1F, -1F, 5, 2, 1, 0F,0F, 0F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 154
		bodyModel[57].setRotationPoint(-12.5F, -10.5F, -10F);

		bodyModel[58].addShapeBox(0F, -1F, -1F, 5, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, 0F, 0F, 0F); // Box 155
		bodyModel[58].setRotationPoint(-12.5F, -18.5F, -10F);

		bodyModel[59].addBox(0F, -1F, -1F, 5, 10, 1, 0F); // Box 156
		bodyModel[59].setRotationPoint(22F, -8.5F, -10F);

		bodyModel[60].addShapeBox(0F, -1F, -1F, 5, 2, 1, 0F,0F, 0F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 158
		bodyModel[60].setRotationPoint(13.5F, -10.5F, -10F);

		bodyModel[61].addShapeBox(0F, -1F, -1F, 5, 2, 1, 0F,-0.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -2F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 159
		bodyModel[61].setRotationPoint(7.5F, -10.5F, -10F);

		bodyModel[62].addBox(0F, -1F, -1F, 1, 10, 1, 0F); // Box 160
		bodyModel[62].setRotationPoint(12.5F, -18.5F, -10F);

		bodyModel[63].addShapeBox(0F, -1F, -1F, 5, 2, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -2F, 0F); // Box 161
		bodyModel[63].setRotationPoint(7.5F, -18.5F, -10F);

		bodyModel[64].addShapeBox(0F, -1F, -1F, 5, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, 0F, 0F, 0F); // Box 162
		bodyModel[64].setRotationPoint(13.5F, -18.5F, -10F);

		bodyModel[65].addBox(-4F, -1F, -1F, 10, 10, 1, 0F); // Box 163
		bodyModel[65].setRotationPoint(12F, -8.5F, -10F);

		bodyModel[66].addBox(-4F, 0F, 0F, 4, 10, 1, 0F); // Box 164
		bodyModel[66].setRotationPoint(22F, -9.5F, -11F);

		bodyModel[67].addShapeBox(0F, -1F, -1F, 4, 2, 1, 0F,0F, 0F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[67].setRotationPoint(0.5F, -10.5F, -10F);

		bodyModel[68].addShapeBox(0F, -1F, -1F, 4, 2, 1, 0F,-0.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -2F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 169
		bodyModel[68].setRotationPoint(-4.5F, -10.5F, -10F);

		bodyModel[69].addShapeBox(0F, -1F, -1F, 4, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, 0F, 0F, 0F); // Box 170
		bodyModel[69].setRotationPoint(0.5F, -18.5F, -10F);

		bodyModel[70].addShapeBox(0F, -1F, -1F, 4, 2, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -2F, 0F); // Box 171
		bodyModel[70].setRotationPoint(-4.5F, -18.5F, -10F);

		bodyModel[71].addBox(-4F, -1F, -1F, 8, 10, 1, 0F); // Box 172
		bodyModel[71].setRotationPoint(0F, -8.5F, -10F);

		bodyModel[72].addShapeBox(0F, -1F, -1F, 1, 20, 22, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 173
		bodyModel[72].setRotationPoint(27F, -18.5F, -10F);

		bodyModel[73].addBox(-4F, 0F, -1F, 4, 10, 1, 0F); // Box 174
		bodyModel[73].setRotationPoint(22F, -9.5F, 11F);

		bodyModel[74].addBox(-4F, -1F, -1F, 10, 10, 1, 0F); // Box 175
		bodyModel[74].setRotationPoint(12F, -8.5F, 11F);

		bodyModel[75].addShapeBox(0F, -1F, -1F, 5, 2, 1, 0F,0F, 0F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 176
		bodyModel[75].setRotationPoint(13.5F, -10.5F, 11F);

		bodyModel[76].addBox(0F, -1F, -1F, 1, 10, 1, 0F); // Box 177
		bodyModel[76].setRotationPoint(12.5F, -18.5F, 11F);

		bodyModel[77].addShapeBox(0F, -1F, -1F, 5, 2, 1, 0F,-0.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -2F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 178
		bodyModel[77].setRotationPoint(7.5F, -10.5F, 11F);

		bodyModel[78].addShapeBox(0F, -1F, -1F, 5, 2, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -2F, 0F); // Box 179
		bodyModel[78].setRotationPoint(7.5F, -18.5F, 11F);

		bodyModel[79].addShapeBox(0F, -1F, -1F, 5, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, 0F, 0F, 0F); // Box 180
		bodyModel[79].setRotationPoint(13.5F, -18.5F, 11F);

		bodyModel[80].addBox(0F, -1F, -1F, 5, 10, 1, 0F); // Box 181
		bodyModel[80].setRotationPoint(22F, -8.5F, 11F);

		bodyModel[81].addShapeBox(0F, -1F, -1F, 4, 2, 1, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 182
		bodyModel[81].setRotationPoint(22F, -10.5F, 11F);

		bodyModel[82].addBox(0F, -1F, -1F, 1, 10, 1, 0F); // Box 183
		bodyModel[82].setRotationPoint(26F, -18.5F, 11F);

		bodyModel[83].addShapeBox(0F, -1F, -1F, 4, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 184
		bodyModel[83].setRotationPoint(22F, -18.5F, 11F);

		bodyModel[84].addBox(-4F, 0F, -1F, 4, 10, 1, 0F); // Box 185
		bodyModel[84].setRotationPoint(8F, -9.5F, 11F);

		bodyModel[85].addBox(-4F, -1F, -1F, 8, 10, 1, 0F); // Box 186
		bodyModel[85].setRotationPoint(0F, -8.5F, 11F);

		bodyModel[86].addBox(0F, -1F, -1F, 1, 10, 1, 0F); // Box 187
		bodyModel[86].setRotationPoint(-0.5F, -18.5F, 11F);

		bodyModel[87].addShapeBox(0F, -1F, -1F, 4, 2, 1, 0F,0F, 0F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 188
		bodyModel[87].setRotationPoint(0.5F, -10.5F, 11F);

		bodyModel[88].addShapeBox(0F, -1F, -1F, 4, 2, 1, 0F,-0.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -2F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 189
		bodyModel[88].setRotationPoint(-4.5F, -10.5F, 11F);

		bodyModel[89].addShapeBox(0F, -1F, -1F, 4, 2, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -2F, 0F); // Box 190
		bodyModel[89].setRotationPoint(-4.5F, -18.5F, 11F);

		bodyModel[90].addShapeBox(0F, -1F, -1F, 4, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, 0F, 0F, 0F); // Box 191
		bodyModel[90].setRotationPoint(0.5F, -18.5F, 11F);

		bodyModel[91].addBox(-4F, 0F, -1F, 4, 10, 1, 0F); // Box 192
		bodyModel[91].setRotationPoint(-4F, -9.5F, 11F);

		bodyModel[92].addBox(-4F, -1F, -1F, 10, 10, 1, 0F); // Box 193
		bodyModel[92].setRotationPoint(-14F, -8.5F, 11F);

		bodyModel[93].addShapeBox(0F, -1F, -1F, 5, 2, 1, 0F,0F, 0F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 194
		bodyModel[93].setRotationPoint(-12.5F, -10.5F, 11F);

		bodyModel[94].addBox(0F, -1F, -1F, 1, 10, 1, 0F); // Box 195
		bodyModel[94].setRotationPoint(-13.5F, -18.5F, 11F);

		bodyModel[95].addShapeBox(0F, -1F, -1F, 5, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, 0F, 0F, 0F); // Box 196
		bodyModel[95].setRotationPoint(-12.5F, -18.5F, 11F);

		bodyModel[96].addShapeBox(0F, -1F, -1F, 5, 2, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -2F, 0F); // Box 197
		bodyModel[96].setRotationPoint(-18.5F, -18.5F, 11F);

		bodyModel[97].addShapeBox(0F, -1F, -1F, 5, 2, 1, 0F,-0.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -2F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 198
		bodyModel[97].setRotationPoint(-18.5F, -10.5F, 11F);

		bodyModel[98].addBox(-4F, 0F, -1F, 4, 10, 1, 0F); // Box 199
		bodyModel[98].setRotationPoint(-18F, -9.5F, 11F);

		bodyModel[99].addBox(0F, -1F, -1F, 5, 10, 1, 0F); // Box 200
		bodyModel[99].setRotationPoint(-27F, -8.5F, 11F);

		bodyModel[100].addShapeBox(0F, -1F, -1F, 4, 2, 1, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 201
		bodyModel[100].setRotationPoint(-26F, -10.5F, 11F);

		bodyModel[101].addBox(0F, -1F, -1F, 1, 10, 1, 0F); // Box 202
		bodyModel[101].setRotationPoint(-27F, -18.5F, 11F);

		bodyModel[102].addShapeBox(0F, -1F, -1F, 4, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 203
		bodyModel[102].setRotationPoint(-26F, -18.5F, 11F);

		bodyModel[103].addBox(0F, -1F, -1F, 1, 20, 20, 0F); // Box 206
		bodyModel[103].setRotationPoint(12.5F, -18.5F, -9F);

		bodyModel[104].addShapeBox(0F, -1F, -1F, 56, 1, 7, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 112
		bodyModel[104].setRotationPoint(-28F, -19.5F, -10F);

		bodyModel[105].addShapeBox(0F, -1F, -1F, 56, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 113
		bodyModel[105].setRotationPoint(-28F, -19.5F, 5F);

		bodyModel[106].addBox(0F, -1F, -1F, 56, 1, 8, 0F); // Box 114
		bodyModel[106].setRotationPoint(-28F, -19.5F, -3F);

		bodyModel[107].addBox(0F, -1F, -1F, 1, 20, 20, 0F); // Box 115
		bodyModel[107].setRotationPoint(-0.5F, -18.5F, -9F);

		bodyModel[108].addBox(0F, -1F, -1F, 1, 20, 20, 0F); // Box 116
		bodyModel[108].setRotationPoint(-13.5F, -18.5F, -9F);

		bodyModel[109].addBox(0F, 0F, 0F, 5, 1, 16, 0F); // Standard Seat
		bodyModel[109].setRotationPoint(21F, -3F, -8F);

		bodyModel[110].addBox(0F, 0F, 0F, 6, 1, 16, 0F); // Standard Seat
		bodyModel[110].setRotationPoint(26F, -2F, -8F);
		bodyModel[110].rotateAngleZ = 1.57079633F;

		bodyModel[111].addBox(0F, 0F, 0F, 5, 1, 16, 0F); // Standard Seat
		bodyModel[111].setRotationPoint(-6.5F, -3F, -8F);

		bodyModel[112].addBox(0F, 0F, 0F, 6, 1, 16, 0F); // Standard Seat
		bodyModel[112].setRotationPoint(-1.5F, -2F, -8F);
		bodyModel[112].rotateAngleZ = 1.57079633F;

		bodyModel[113].addBox(0F, 0F, 0F, 5, 1, 16, 0F); // Box 119
		bodyModel[113].setRotationPoint(1.5F, -3F, -8F);

		bodyModel[114].addBox(0F, 0F, 0F, 6, 1, 16, 0F); // Box 120
		bodyModel[114].setRotationPoint(0.5F, -2F, -8F);
		bodyModel[114].rotateAngleZ = 1.57079633F;

		bodyModel[115].addBox(0F, 0F, 0F, 6, 1, 16, 0F); // Box 121
		bodyModel[115].setRotationPoint(-27F, -2F, -8F);
		bodyModel[115].rotateAngleZ = 1.57079633F;

		bodyModel[116].addBox(0F, 0F, 0F, 5, 1, 16, 0F); // Box 122
		bodyModel[116].setRotationPoint(-26F, -3F, -8F);

		bodyModel[117].addShapeBox(0F, -1F, -1F, 1, 20, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 123
		bodyModel[117].setRotationPoint(27.5F, -18.5F, -10F);

		bodyModel[118].addShapeBox(0F, -1F, -1F, 1, 20, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 130
		bodyModel[118].setRotationPoint(27.5F, -18.5F, 11F);

		bodyModel[119].addShapeBox(0F, -1F, -1F, 1, 20, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 131
		bodyModel[119].setRotationPoint(27.5F, -18.5F, -5F);

		bodyModel[120].addShapeBox(0F, -1F, -1F, 1, 20, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 136
		bodyModel[120].setRotationPoint(27.5F, -18.5F, 0.5F);

		bodyModel[121].addShapeBox(0F, -1F, -1F, 1, 20, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 137
		bodyModel[121].setRotationPoint(27.5F, -18.5F, 6F);

		bodyModel[122].addShapeBox(0F, -1F, -1F, 1, 1, 20, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 139
		bodyModel[122].setRotationPoint(27.49F, -3.5F, -9F);

		bodyModel[123].addShapeBox(0F, -1F, -1F, 1, 1, 20, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 140
		bodyModel[123].setRotationPoint(27.49F, -14.5F, -9F);

		bodyModel[124].addShapeBox(0F, -1F, -1F, 1, 1, 20, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 141
		bodyModel[124].setRotationPoint(27.49F, -9F, -9F);

		bodyModel[125].addShapeBox(0F, -1F, -1F, 1, 20, 22, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 142
		bodyModel[125].setRotationPoint(-27.5F, -18.5F, -10F);

		bodyModel[126].addShapeBox(0F, -1F, -1F, 1, 20, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 143
		bodyModel[126].setRotationPoint(-28.5F, -18.5F, 6F);

		bodyModel[127].addShapeBox(0F, -1F, -1F, 1, 1, 20, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 144
		bodyModel[127].setRotationPoint(-28.51F, -14.5F, -9F);

		bodyModel[128].addShapeBox(0F, -1F, -1F, 1, 20, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 145
		bodyModel[128].setRotationPoint(-28.5F, -18.5F, 0.5F);

		bodyModel[129].addShapeBox(0F, -1F, -1F, 1, 20, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 146
		bodyModel[129].setRotationPoint(-28.5F, -18.5F, -5F);

		bodyModel[130].addShapeBox(0F, -1F, -1F, 1, 1, 20, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 147
		bodyModel[130].setRotationPoint(-28.51F, -9F, -9F);

		bodyModel[131].addShapeBox(0F, -1F, -1F, 1, 1, 20, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 148
		bodyModel[131].setRotationPoint(-28.51F, -3.5F, -9F);

		bodyModel[132].addShapeBox(0F, -1F, -1F, 1, 20, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 149
		bodyModel[132].setRotationPoint(-28.5F, -18.5F, 11F);

		bodyModel[133].addShapeBox(0F, -1F, -1F, 1, 20, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 150
		bodyModel[133].setRotationPoint(-28.5F, -18.5F, -10F);

		bodyModel[134].addBox(-4F, 0F, 0F, 4, 10, 1, 0F); // Box 151
		bodyModel[134].setRotationPoint(8F, -9.5F, -11F);

		bodyModel[135].addBox(-4F, 0F, 0F, 4, 10, 1, 0F); // Box 152
		bodyModel[135].setRotationPoint(-4F, -9.5F, -11F);

		bodyModel[136].addBox(-4F, 0F, 0F, 4, 10, 1, 0F); // Box 153
		bodyModel[136].setRotationPoint(-18F, -9.5F, -11F);
	}
}