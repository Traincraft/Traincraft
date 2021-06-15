//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2019 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: CharB1
// Model Creator: AobaKuma
// Created on: 02.07.2017 - 11:23:38
// Last changed on: 02.07.2017 - 11:23:38

package train.client.render.models; //Path where the model is located

import tmt.Coord2D;
import tmt.ModelConverter;
import tmt.ModelRendererTurbo;
import tmt.Shape2D;

public class ModelCharB1 extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelCharB1() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[154];
		turretModel = new ModelRendererTurbo[27];
		barrelModel = new ModelRendererTurbo[6];
		leftTrackWheelModels = new ModelRendererTurbo[2];
		rightTrackWheelModels = new ModelRendererTurbo[2];
		leftTrackModel = new ModelRendererTurbo[75];
		rightTrackModel = new ModelRendererTurbo[75];

		initbodyModel_1();
		initturretModel_1();
		initbarrelModel_1();
		initleftTrackWheelModels_1();
		initrightTrackWheelModels_1();
		initleftTrackModel_1();
		initrightTrackModel_1();


		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1() {
		bodyModel[0] = new ModelRendererTurbo(this, 152, 144, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 2
		bodyModel[2] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 3
		bodyModel[3] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 4
		bodyModel[4] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 5
		bodyModel[5] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 6
		bodyModel[6] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 7
		bodyModel[7] = new ModelRendererTurbo(this, 46, 2, textureX, textureY); // Box 8
		bodyModel[8] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 9
		bodyModel[9] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 10
		bodyModel[10] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 11
		bodyModel[11] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 12
		bodyModel[12] = new ModelRendererTurbo(this, 145, 17, textureX, textureY); // Box 13
		bodyModel[13] = new ModelRendererTurbo(this, 38, 18, textureX, textureY); // Box 14
		bodyModel[14] = new ModelRendererTurbo(this, 265, 9, textureX, textureY); // Box 15
		bodyModel[15] = new ModelRendererTurbo(this, 289, 17, textureX, textureY); // Box 16
		bodyModel[16] = new ModelRendererTurbo(this, 193, 17, textureX, textureY); // Box 17
		bodyModel[17] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 18
		bodyModel[18] = new ModelRendererTurbo(this, 401, 17, textureX, textureY); // Box 19
		bodyModel[19] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 24
		bodyModel[20] = new ModelRendererTurbo(this, 433, 17, textureX, textureY); // Box 25
		bodyModel[21] = new ModelRendererTurbo(this, 225, 25, textureX, textureY); // Box 26
		bodyModel[22] = new ModelRendererTurbo(this, 305, 33, textureX, textureY); // Box 27
		bodyModel[23] = new ModelRendererTurbo(this, 169, 33, textureX, textureY); // Box 28
		bodyModel[24] = new ModelRendererTurbo(this, 377, 33, textureX, textureY); // Box 29
		bodyModel[25] = new ModelRendererTurbo(this, 169, 57, textureX, textureY); // Box 30
		bodyModel[26] = new ModelRendererTurbo(this, 257, 41, textureX, textureY); // Box 31
		bodyModel[27] = new ModelRendererTurbo(this, 177, 49, textureX, textureY); // Box 32
		bodyModel[28] = new ModelRendererTurbo(this, 337, 65, textureX, textureY); // Box 33
		bodyModel[29] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 34
		bodyModel[30] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 35
		bodyModel[31] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 36
		bodyModel[32] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 37
		bodyModel[33] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 38
		bodyModel[34] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 39
		bodyModel[35] = new ModelRendererTurbo(this, 145, 33, textureX, textureY); // Box 40
		bodyModel[36] = new ModelRendererTurbo(this, 481, 17, textureX, textureY); // Box 41
		bodyModel[37] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 42
		bodyModel[38] = new ModelRendererTurbo(this, 209, 33, textureX, textureY); // Box 65
		bodyModel[39] = new ModelRendererTurbo(this, 273, 33, textureX, textureY); // Box 74
		bodyModel[40] = new ModelRendererTurbo(this, 385, 73, textureX, textureY); // Box 75
		bodyModel[41] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 76
		bodyModel[42] = new ModelRendererTurbo(this, 385, 65, textureX, textureY); // Box 77
		bodyModel[43] = new ModelRendererTurbo(this, 473, 73, textureX, textureY); // Box 82
		bodyModel[44] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 83
		bodyModel[45] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 84
		bodyModel[46] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 85
		bodyModel[47] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 86
		bodyModel[48] = new ModelRendererTurbo(this, 57, 81, textureX, textureY); // Box 87
		bodyModel[49] = new ModelRendererTurbo(this, 249, 17, textureX, textureY); // Box 88
		bodyModel[50] = new ModelRendererTurbo(this, 393, 17, textureX, textureY); // Box 89
		bodyModel[51] = new ModelRendererTurbo(this, 209, 113, textureX, textureY); // Box 116
		bodyModel[52] = new ModelRendererTurbo(this, 113, 113, textureX, textureY); // Box 117
		bodyModel[53] = new ModelRendererTurbo(this, 273, 113, textureX, textureY); // Box 118
		bodyModel[54] = new ModelRendererTurbo(this, 481, 33, textureX, textureY); // Box 119
		bodyModel[55] = new ModelRendererTurbo(this, 273, 25, textureX, textureY); // Box 120
		bodyModel[56] = new ModelRendererTurbo(this, 505, 9, textureX, textureY); // Box 121
		bodyModel[57] = new ModelRendererTurbo(this, 193, 17, textureX, textureY); // Box 122
		bodyModel[58] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 123
		bodyModel[59] = new ModelRendererTurbo(this, 41, 81, textureX, textureY); // Box 124
		bodyModel[60] = new ModelRendererTurbo(this, 481, 97, textureX, textureY); // Box 125
		bodyModel[61] = new ModelRendererTurbo(this, 49, 105, textureX, textureY); // Box 126
		bodyModel[62] = new ModelRendererTurbo(this, 17, 25, textureX, textureY); // Box 127
		bodyModel[63] = new ModelRendererTurbo(this, 209, 33, textureX, textureY); // Box 128
		bodyModel[64] = new ModelRendererTurbo(this, 233, 33, textureX, textureY); // Box 129
		bodyModel[65] = new ModelRendererTurbo(this, 353, 33, textureX, textureY); // Box 130
		bodyModel[66] = new ModelRendererTurbo(this, 377, 33, textureX, textureY); // Box 131
		bodyModel[67] = new ModelRendererTurbo(this, 281, 25, textureX, textureY); // Box 132
		bodyModel[68] = new ModelRendererTurbo(this, 393, 25, textureX, textureY); // Box 133
		bodyModel[69] = new ModelRendererTurbo(this, 321, 33, textureX, textureY); // Box 134
		bodyModel[70] = new ModelRendererTurbo(this, 505, 41, textureX, textureY); // Box 135
		bodyModel[71] = new ModelRendererTurbo(this, 441, 105, textureX, textureY); // Box 136
		bodyModel[72] = new ModelRendererTurbo(this, 305, 113, textureX, textureY); // Box 137
		bodyModel[73] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 138
		bodyModel[74] = new ModelRendererTurbo(this, 441, 33, textureX, textureY); // Box 139
		bodyModel[75] = new ModelRendererTurbo(this, 145, 41, textureX, textureY); // Box 140
		bodyModel[76] = new ModelRendererTurbo(this, 273, 41, textureX, textureY); // Box 141
		bodyModel[77] = new ModelRendererTurbo(this, 225, 81, textureX, textureY); // Box 142
		bodyModel[78] = new ModelRendererTurbo(this, 417, 81, textureX, textureY); // Box 143
		bodyModel[79] = new ModelRendererTurbo(this, 329, 113, textureX, textureY); // Box 144
		bodyModel[80] = new ModelRendererTurbo(this, 361, 113, textureX, textureY); // Box 145
		bodyModel[81] = new ModelRendererTurbo(this, 1, 121, textureX, textureY); // Box 159
		bodyModel[82] = new ModelRendererTurbo(this, 425, 121, textureX, textureY); // Box 160
		bodyModel[83] = new ModelRendererTurbo(this, 81, 113, textureX, textureY); // Box 161
		bodyModel[84] = new ModelRendererTurbo(this, 161, 121, textureX, textureY); // Box 162
		bodyModel[85] = new ModelRendererTurbo(this, 465, 113, textureX, textureY); // Box 173
		bodyModel[86] = new ModelRendererTurbo(this, 1, 137, textureX, textureY); // Box 174
		bodyModel[87] = new ModelRendererTurbo(this, 49, 137, textureX, textureY); // Box 175
		bodyModel[88] = new ModelRendererTurbo(this, 97, 137, textureX, textureY); // Box 176
		bodyModel[89] = new ModelRendererTurbo(this, 185, 137, textureX, textureY); // Box 177
		bodyModel[90] = new ModelRendererTurbo(this, 233, 137, textureX, textureY); // Box 178
		bodyModel[91] = new ModelRendererTurbo(this, 281, 137, textureX, textureY); // Box 179
		bodyModel[92] = new ModelRendererTurbo(this, 401, 137, textureX, textureY); // Box 180
		bodyModel[93] = new ModelRendererTurbo(this, 449, 137, textureX, textureY); // Box 181
		bodyModel[94] = new ModelRendererTurbo(this, 1, 145, textureX, textureY); // Box 182
		bodyModel[95] = new ModelRendererTurbo(this, 329, 129, textureX, textureY); // Box 183
		bodyModel[96] = new ModelRendererTurbo(this, 353, 49, textureX, textureY); // Box 184
		bodyModel[97] = new ModelRendererTurbo(this, 17, 41, textureX, textureY); // Box 185
		bodyModel[98] = new ModelRendererTurbo(this, 209, 41, textureX, textureY); // Box 186
		bodyModel[99] = new ModelRendererTurbo(this, 57, 121, textureX, textureY); // Box 187
		bodyModel[100] = new ModelRendererTurbo(this, 209, 73, textureX, textureY); // Box 188
		bodyModel[101] = new ModelRendererTurbo(this, 152, 144, textureX, textureY); // Box 182
		bodyModel[102] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 183
		bodyModel[103] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 184
		bodyModel[104] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 185
		bodyModel[105] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 186
		bodyModel[106] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 187
		bodyModel[107] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 188
		bodyModel[108] = new ModelRendererTurbo(this, 46, 2, textureX, textureY); // Box 189
		bodyModel[109] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 190
		bodyModel[110] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 191
		bodyModel[111] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 192
		bodyModel[112] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 193
		bodyModel[113] = new ModelRendererTurbo(this, 145, 17, textureX, textureY); // Box 194
		bodyModel[114] = new ModelRendererTurbo(this, 38, 18, textureX, textureY); // Box 195
		bodyModel[115] = new ModelRendererTurbo(this, 265, 9, textureX, textureY); // Box 196
		bodyModel[116] = new ModelRendererTurbo(this, 289, 17, textureX, textureY); // Box 197
		bodyModel[117] = new ModelRendererTurbo(this, 193, 17, textureX, textureY); // Box 198
		bodyModel[118] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 199
		bodyModel[119] = new ModelRendererTurbo(this, 401, 17, textureX, textureY); // Box 200
		bodyModel[120] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 201
		bodyModel[121] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 202
		bodyModel[122] = new ModelRendererTurbo(this, 145, 33, textureX, textureY); // Box 203
		bodyModel[123] = new ModelRendererTurbo(this, 481, 17, textureX, textureY); // Box 204
		bodyModel[124] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 205
		bodyModel[125] = new ModelRendererTurbo(this, 209, 33, textureX, textureY); // Box 206
		bodyModel[126] = new ModelRendererTurbo(this, 273, 33, textureX, textureY); // Box 207
		bodyModel[127] = new ModelRendererTurbo(this, 385, 73, textureX, textureY); // Box 208
		bodyModel[128] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 209
		bodyModel[129] = new ModelRendererTurbo(this, 385, 65, textureX, textureY); // Box 210
		bodyModel[130] = new ModelRendererTurbo(this, 1, 121, textureX, textureY); // Box 211
		bodyModel[131] = new ModelRendererTurbo(this, 425, 121, textureX, textureY); // Box 212
		bodyModel[132] = new ModelRendererTurbo(this, 81, 113, textureX, textureY); // Box 213
		bodyModel[133] = new ModelRendererTurbo(this, 0, 186, textureX, textureY); // field_78114_d
		bodyModel[134] = new ModelRendererTurbo(this, 40, 202, textureX, textureY); // field_78112_f
		bodyModel[135] = new ModelRendererTurbo(this, 0, 202, textureX, textureY); // field_78124_i
		bodyModel[136] = new ModelRendererTurbo(this, 16, 202, textureX, textureY); // field_78115_e
		bodyModel[137] = new ModelRendererTurbo(this, 40, 202, textureX, textureY); // field_78113_g
		bodyModel[138] = new ModelRendererTurbo(this, 0, 202, textureX, textureY); // field_78123_h
		bodyModel[139] = new ModelRendererTurbo(this, 465, 113, textureX, textureY); // Box 214
		bodyModel[140] = new ModelRendererTurbo(this, 1, 137, textureX, textureY); // Box 215
		bodyModel[141] = new ModelRendererTurbo(this, 49, 137, textureX, textureY); // Box 216
		bodyModel[142] = new ModelRendererTurbo(this, 97, 137, textureX, textureY); // Box 217
		bodyModel[143] = new ModelRendererTurbo(this, 185, 137, textureX, textureY); // Box 218
		bodyModel[144] = new ModelRendererTurbo(this, 233, 137, textureX, textureY); // Box 219
		bodyModel[145] = new ModelRendererTurbo(this, 281, 137, textureX, textureY); // Box 220
		bodyModel[146] = new ModelRendererTurbo(this, 401, 137, textureX, textureY); // Box 221
		bodyModel[147] = new ModelRendererTurbo(this, 449, 137, textureX, textureY); // Box 222
		bodyModel[148] = new ModelRendererTurbo(this, 1, 145, textureX, textureY); // Box 223
		bodyModel[149] = new ModelRendererTurbo(this, 161, 121, textureX, textureY); // Box 224
		bodyModel[150] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 225
		bodyModel[151] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 226
		bodyModel[152] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 227
		bodyModel[153] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 228

		bodyModel[0].addBox(0F, 0F, 0F, 12, 11, 9, 0F); // Box 0
		bodyModel[0].setRotationPoint(-49F, -8F, -23F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 16, 14, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[1].setRotationPoint(-14F, -11F, -23F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 13, 12, 9, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		bodyModel[2].setRotationPoint(2F, -9F, -23F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 13, 10, 1, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[3].setRotationPoint(15F, -7F, -23F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 16, 1, 9, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		bodyModel[4].setRotationPoint(-14F, -12F, -23F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 7, 4, 9, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[5].setRotationPoint(-49F, -12F, -23F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 5, 4, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 7
		bodyModel[6].setRotationPoint(-42F, -12F, -23F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 4, 6, 1, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		bodyModel[7].setRotationPoint(28F, -7F, -23F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 4, 6, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 9
		bodyModel[8].setRotationPoint(28F, -1F, -23F);

		bodyModel[9].addBox(0F, 0F, 0F, 19, 4, 9, 0F); // Box 10
		bodyModel[9].setRotationPoint(-51F, 3F, -23F);

		bodyModel[10].addBox(0F, 0F, 0F, 20, 4, 9, 0F); // Box 11
		bodyModel[10].setRotationPoint(-32F, 3F, -23F);

		bodyModel[11].addBox(0F, 0F, 0F, 20, 4, 9, 0F); // Box 12
		bodyModel[11].setRotationPoint(-12F, 3F, -23F);

		bodyModel[12].addBox(0F, 0F, 0F, 17, 4, 9, 0F); // Box 13
		bodyModel[12].setRotationPoint(8F, 3F, -23F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 14
		bodyModel[13].setRotationPoint(25F, 3F, -23F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 3, 4, 9, 0F, 0.5F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -3F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 15
		bodyModel[14].setRotationPoint(-54F, 3F, -23F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 46, 1, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 16
		bodyModel[15].setRotationPoint(-46F, -16F, -21F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 21, 1, 7, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 17
		bodyModel[16].setRotationPoint(-67F, -12F, -21F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 3, 1, 7, 0F, 0.5F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -0.5F, 0F); // Box 18
		bodyModel[17].setRotationPoint(-70F, -9F, -21F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 21, 1, 7, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F); // Box 19
		bodyModel[18].setRotationPoint(0F, -16F, -21F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 57, 23, 25, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		bodyModel[19].setRotationPoint(-46F, -16F, -14F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 10, 23, 25, 0F, 0F, -4F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F); // Box 25
		bodyModel[20].setRotationPoint(-67F, -16F, -14F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 11, 25, 25, 0F, 0F, -4F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[21].setRotationPoint(-57F, -18F, -14F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 10, 23, 25, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
		bodyModel[22].setRotationPoint(11F, -16F, -14F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 10, 5, 13, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 28
		bodyModel[23].setRotationPoint(11F, -16F, -2F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 13, 18, 13, 0F, 0F, 0F, 0F, -2F, -10F, 0F, -2F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F); // Box 29
		bodyModel[24].setRotationPoint(21F, -11F, -2F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 5, 18, 12, 0F, 0F, 0F, 0F, 0F, -4.5F, 0F, 0F, -4.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 30
		bodyModel[25].setRotationPoint(21F, -11F, -14F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 3, 1, 41, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 31
		bodyModel[26].setRotationPoint(28F, -1F, -22F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 3, 1, 41, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 32
		bodyModel[27].setRotationPoint(28F, -2F, -22F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 3, 1, 41, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 33
		bodyModel[28].setRotationPoint(28F, 0F, -22F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 34
		bodyModel[29].setRotationPoint(30F, -2F, -13F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 35
		bodyModel[30].setRotationPoint(30F, -2F, -11F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 36
		bodyModel[31].setRotationPoint(30F, -2F, 9F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 37
		bodyModel[32].setRotationPoint(30F, -2F, 7F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 4, 6, 1, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[33].setRotationPoint(28F, -7F, -14F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 39
		bodyModel[34].setRotationPoint(25F, 3F, -14F);

		bodyModel[35].addBox(0F, 0F, 0F, 17, 4, 1, 0F); // Box 40
		bodyModel[35].setRotationPoint(8F, 3F, -14F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 13, 10, 1, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[36].setRotationPoint(15F, -7F, -14F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 4, 6, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 42
		bodyModel[37].setRotationPoint(28F, -1F, -14F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 6, 0, 8, 0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 65
		bodyModel[38].setRotationPoint(15F, -7F, -22F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 21, 1, 2, 0F, 0F, -1F, 0F, 0F, -4F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 4F, 0F, 0F, 3F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[39].setRotationPoint(0F, -16F, -23F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 46, 1, 2, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 75
		bodyModel[40].setRotationPoint(-46F, -16F, -23F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F, 0.5F, -1F, 0F, 0F, 2F, 0F, 0F, 3F, 0F, 0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, -2F, 0F, 0F, -3F, 0F, 0F, -0.5F, 0F); // Box 76
		bodyModel[41].setRotationPoint(-70F, -9F, -23F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 21, 1, 2, 0F, 0F, -1F, 0F, 0F, 3F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -3F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 77
		bodyModel[42].setRotationPoint(-67F, -12F, -23F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 8, 1, 11, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 82
		bodyModel[43].setRotationPoint(11F, -17F, -1F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 83
		bodyModel[44].setRotationPoint(18.5F, -17.5F, 0F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 84
		bodyModel[45].setRotationPoint(18.5F, -17.5F, 8F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 2, 4, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, -1F, 0F, 1F, -1F, 0F, -1F, 0F, 0F); // Box 85
		bodyModel[46].setRotationPoint(18.5F, -16.5F, 1F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 21, 4, 4, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 86
		bodyModel[47].setRotationPoint(-67F, -16F, 13F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 21, 4, 4, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 87
		bodyModel[48].setRotationPoint(-67F, -16F, -20F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 88
		bodyModel[49].setRotationPoint(-71F, -15F, -19F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 89
		bodyModel[50].setRotationPoint(-71F, -15F, 14F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 10, 1, 18, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 116
		bodyModel[51].setRotationPoint(-6F, -17F, -9F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 4, 1, 18, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F); // Box 117
		bodyModel[52].setRotationPoint(4F, -17F, -9F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 4, 1, 18, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F); // Box 118
		bodyModel[53].setRotationPoint(-10F, -17F, -9F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 13, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 119
		bodyModel[54].setRotationPoint(-34F, -20F, 6F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 120
		bodyModel[55].setRotationPoint(-21F, -20F, 6F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 121
		bodyModel[56].setRotationPoint(-32F, -19F, 6F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 122
		bodyModel[57].setRotationPoint(-25.5F, -19F, 6F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 123
		bodyModel[58].setRotationPoint(-20F, -19F, 6F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 124
		bodyModel[59].setRotationPoint(-26.5F, -22F, -8F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, -5F, 0F, -7F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, 5F, 0F, -7F, 5F, 0F); // Box 125
		bodyModel[60].setRotationPoint(-26.5F, -22F, 4F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F, -7F, -5F, 0F, 7F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 5F, 0F, 7F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 126
		bodyModel[61].setRotationPoint(-26.5F, -22F, -20F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 127
		bodyModel[62].setRotationPoint(-26.5F, -21F, -8F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[63].setRotationPoint(-26.5F, -21F, 3F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 2, 4, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 129
		bodyModel[64].setRotationPoint(-39F, -20F, 5F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 130
		bodyModel[65].setRotationPoint(-37F, -20F, 5F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 131
		bodyModel[66].setRotationPoint(-40F, -20F, 5F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 132
		bodyModel[67].setRotationPoint(-39.5F, -22F, 5.5F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 133
		bodyModel[68].setRotationPoint(-38.5F, -22F, 5.5F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 134
		bodyModel[69].setRotationPoint(-37.5F, -22F, 5.5F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 1, 12, 1, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 135
		bodyModel[70].setRotationPoint(-38.5F, -34F, 6.5F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 3, 3, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 136
		bodyModel[71].setRotationPoint(-44F, -19F, 1F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 3, 3, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 137
		bodyModel[72].setRotationPoint(-45F, -19F, -16F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 3, 3, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 138
		bodyModel[73].setRotationPoint(-45F, -19F, -4F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 5, 3, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 139
		bodyModel[74].setRotationPoint(-46F, -19F, 13F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 4, 3, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 140
		bodyModel[75].setRotationPoint(-46F, -19F, -19F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 7, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 0F, 1F, 0F, 0F); // Box 141
		bodyModel[76].setRotationPoint(-34F, -17F, -1F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 7, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 0F, 1F, 0F, 0F); // Box 142
		bodyModel[77].setRotationPoint(-24F, -17F, -1F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 4, 1, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 143
		bodyModel[78].setRotationPoint(-24.5F, -16.5F, -11.5F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 4, 1, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 1F, 0F, 1F); // Box 144
		bodyModel[79].setRotationPoint(-41.5F, -17F, -11.5F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 9, 25, 9, 0F, 0F, -4F, 0F, 0F, -2.25F, 0F, 0F, -2.25F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 145
		bodyModel[80].setRotationPoint(-55F, -19F, -12F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 23, 2, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 159
		bodyModel[81].setRotationPoint(-37F, -12F, -23F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 23, 2, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 160
		bodyModel[82].setRotationPoint(-37F, 1F, -23F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 2, 11, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 161
		bodyModel[83].setRotationPoint(-37F, -10F, -23F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 2, 11, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 162
		bodyModel[84].setRotationPoint(-16F, -10F, -23F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 19, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 173
		bodyModel[85].setRotationPoint(-35F, -1F, -23F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 19, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 174
		bodyModel[86].setRotationPoint(-35F, 0F, -23F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 19, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 175
		bodyModel[87].setRotationPoint(-35F, -2F, -23F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 19, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 176
		bodyModel[88].setRotationPoint(-35F, -3F, -23F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 19, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 177
		bodyModel[89].setRotationPoint(-35F, -4F, -23F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 19, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 178
		bodyModel[90].setRotationPoint(-35F, -5F, -23F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 19, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 179
		bodyModel[91].setRotationPoint(-35F, -6F, -23F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 19, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 180
		bodyModel[92].setRotationPoint(-35F, -7F, -23F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 19, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 181
		bodyModel[93].setRotationPoint(-35F, -8F, -23F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 19, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 182
		bodyModel[94].setRotationPoint(-35F, -9F, -23F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 183
		bodyModel[95].setRotationPoint(-35F, -16.5F, -16F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 184
		bodyModel[96].setRotationPoint(-36F, -17F, -7F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 185
		bodyModel[97].setRotationPoint(-36F, -16.5F, -17F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 186
		bodyModel[98].setRotationPoint(-36F, -17F, -4F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 1, 1, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 187
		bodyModel[99].setRotationPoint(-32F, -16.5F, -17F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 188
		bodyModel[100].setRotationPoint(-31F, -16.5F, -4F);

		bodyModel[101].addBox(0F, 0F, 0F, 12, 11, 9, 0F); // Box 182
		bodyModel[101].setRotationPoint(-49F, -8F, 11F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 16, 14, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 183
		bodyModel[102].setRotationPoint(-14F, -11F, 11F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 13, 12, 9, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 184
		bodyModel[103].setRotationPoint(2F, -9F, 11F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 13, 10, 1, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 185
		bodyModel[104].setRotationPoint(15F, -7F, 19F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 16, 1, 9, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 186
		bodyModel[105].setRotationPoint(-14F, -12F, 11F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 7, 4, 9, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 187
		bodyModel[106].setRotationPoint(-49F, -12F, 11F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 5, 4, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 188
		bodyModel[107].setRotationPoint(-42F, -12F, 11F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 4, 6, 1, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 189
		bodyModel[108].setRotationPoint(28F, -7F, 19F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 4, 6, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 190
		bodyModel[109].setRotationPoint(28F, -1F, 19F);

		bodyModel[110].addBox(0F, 0F, 0F, 19, 4, 9, 0F); // Box 191
		bodyModel[110].setRotationPoint(-51F, 3F, 11F);

		bodyModel[111].addBox(0F, 0F, 0F, 20, 4, 9, 0F); // Box 192
		bodyModel[111].setRotationPoint(-32F, 3F, 11F);

		bodyModel[112].addBox(0F, 0F, 0F, 20, 4, 9, 0F); // Box 193
		bodyModel[112].setRotationPoint(-12F, 3F, 11F);

		bodyModel[113].addBox(0F, 0F, 0F, 17, 4, 9, 0F); // Box 194
		bodyModel[113].setRotationPoint(8F, 3F, 11F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 195
		bodyModel[114].setRotationPoint(25F, 3F, 19F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 3, 4, 9, 0F, 0.5F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -3F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 196
		bodyModel[115].setRotationPoint(-54F, 3F, 11F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 46, 1, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 197
		bodyModel[116].setRotationPoint(-46F, -16F, 11F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 21, 1, 7, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 198
		bodyModel[117].setRotationPoint(-67F, -12F, 11F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 3, 1, 7, 0F, 0.5F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -0.5F, 0F); // Box 199
		bodyModel[118].setRotationPoint(-70F, -9F, 11F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 21, 1, 7, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F); // Box 200
		bodyModel[119].setRotationPoint(0F, -16F, 11F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 4, 6, 1, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 201
		bodyModel[120].setRotationPoint(28F, -7F, 10F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 202
		bodyModel[121].setRotationPoint(25F, 3F, 10F);

		bodyModel[122].addBox(0F, 0F, 0F, 17, 4, 1, 0F); // Box 203
		bodyModel[122].setRotationPoint(8F, 3F, 10F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 13, 10, 1, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 204
		bodyModel[123].setRotationPoint(15F, -7F, 10F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 4, 6, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 205
		bodyModel[124].setRotationPoint(28F, -1F, 10F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 6, 0, 8, 0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 206
		bodyModel[125].setRotationPoint(15F, -7F, 11F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 21, 1, 2, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -4F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 4F, 0F, 0F, 1F, 0F); // Box 207
		bodyModel[126].setRotationPoint(0F, -16F, 18F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 46, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 208
		bodyModel[127].setRotationPoint(-46F, -16F, 18F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F, 0.5F, 0F, 0F, 0F, 3F, 0F, 0F, 2F, 0F, 0.5F, -1F, 0F, 0F, -0.5F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, 0.5F, 0F); // Box 209
		bodyModel[128].setRotationPoint(-70F, -9F, 18F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 21, 1, 2, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 3F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -3F, 0F, 0F, 1F, 0F); // Box 210
		bodyModel[129].setRotationPoint(-67F, -12F, 18F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 23, 2, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 211
		bodyModel[130].setRotationPoint(-37F, -12F, 11F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 23, 2, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 212
		bodyModel[131].setRotationPoint(-37F, 1F, 11F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 2, 11, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 213
		bodyModel[132].setRotationPoint(-37F, -10F, 11F);

		bodyModel[133].addBox(-4F, -8F, -4F, 8, 8, 8, 0F); // field_78114_d
		bodyModel[133].setRotationPoint(-14F, -3F, 13F);
		bodyModel[133].rotateAngleY = -3.14159265F;
		bodyModel[133].rotateAngleZ = -1.57079633F;

		bodyModel[134].addBox(-3F, -2F, -2F, 4, 12, 4, 0F); // field_78112_f
		bodyModel[134].setRotationPoint(-33F, -3F, 16F);
		bodyModel[134].rotateAngleZ = 1.67551608F;

		bodyModel[135].addBox(-2F, 0F, -2F, 4, 12, 4, 0F); // field_78124_i
		bodyModel[135].setRotationPoint(-32.1000000238419F, -9F, 15.1000000014901F);
		bodyModel[135].rotateAngleY = -0.1F;
		bodyModel[135].rotateAngleZ = 0.1F;

		bodyModel[136].addBox(-4F, 0F, -2F, 8, 12, 4, 0F); // field_78115_e
		bodyModel[136].setRotationPoint(-23F, -3F, 12F);
		bodyModel[136].rotateAngleZ = -1.57079633F;

		bodyModel[137].addBox(-1F, -2F, -2F, 4, 12, 4, 0F); // field_78113_g
		bodyModel[137].setRotationPoint(-29F, -7F, 15F);
		bodyModel[137].rotateAngleY = -0.2F;
		bodyModel[137].rotateAngleZ = 0.2F;

		bodyModel[138].addBox(-2F, 0F, -2F, 4, 12, 4, 0F); // field_78123_h
		bodyModel[138].setRotationPoint(-34.9F, 2F, 16.1F);
		bodyModel[138].rotateAngleZ = 1.67551608F;

		bodyModel[139].addShapeBox(0F, 0F, 0F, 19, 1, 2, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 214
		bodyModel[139].setRotationPoint(-35F, -1F, 18F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 19, 1, 2, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 215
		bodyModel[140].setRotationPoint(-35F, 0F, 18F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 19, 1, 2, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 216
		bodyModel[141].setRotationPoint(-35F, -2F, 18F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 19, 1, 2, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 217
		bodyModel[142].setRotationPoint(-35F, -3F, 18F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 19, 1, 2, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 218
		bodyModel[143].setRotationPoint(-35F, -4F, 18F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 19, 1, 2, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 219
		bodyModel[144].setRotationPoint(-35F, -5F, 18F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 19, 1, 2, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 220
		bodyModel[145].setRotationPoint(-35F, -6F, 18F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 19, 1, 2, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 221
		bodyModel[146].setRotationPoint(-35F, -7F, 18F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 19, 1, 2, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 222
		bodyModel[147].setRotationPoint(-35F, -8F, 18F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 19, 1, 2, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 223
		bodyModel[148].setRotationPoint(-35F, -9F, 18F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 2, 11, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 224
		bodyModel[149].setRotationPoint(-16F, -10F, 11F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 225
		bodyModel[150].setRotationPoint(-70F, -2F, -13F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 226
		bodyModel[151].setRotationPoint(-70F, -2F, -11F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 227
		bodyModel[152].setRotationPoint(-70F, -2F, 7F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 228
		bodyModel[153].setRotationPoint(-70F, -2F, 9F);
	}

	private void initturretModel_1() {
		turretModel[0] = new ModelRendererTurbo(this, 105, 81, textureX, textureY); // Box 92
		turretModel[1] = new ModelRendererTurbo(this, 353, 33, textureX, textureY); // Box 93
		turretModel[2] = new ModelRendererTurbo(this, 145, 81, textureX, textureY); // Box 94
		turretModel[3] = new ModelRendererTurbo(this, 385, 81, textureX, textureY); // Box 95
		turretModel[4] = new ModelRendererTurbo(this, 433, 81, textureX, textureY); // Box 96
		turretModel[5] = new ModelRendererTurbo(this, 257, 89, textureX, textureY); // Box 97
		turretModel[6] = new ModelRendererTurbo(this, 417, 33, textureX, textureY); // Box 98
		turretModel[7] = new ModelRendererTurbo(this, 273, 89, textureX, textureY); // Box 99
		turretModel[8] = new ModelRendererTurbo(this, 305, 89, textureX, textureY); // Box 100
		turretModel[9] = new ModelRendererTurbo(this, 305, 41, textureX, textureY); // Box 101
		turretModel[10] = new ModelRendererTurbo(this, 465, 89, textureX, textureY); // Box 102
		turretModel[11] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 103
		turretModel[12] = new ModelRendererTurbo(this, 33, 97, textureX, textureY); // Box 104
		turretModel[13] = new ModelRendererTurbo(this, 345, 89, textureX, textureY); // Box 105
		turretModel[14] = new ModelRendererTurbo(this, 65, 97, textureX, textureY); // Box 106
		turretModel[15] = new ModelRendererTurbo(this, 97, 97, textureX, textureY); // Box 107
		turretModel[16] = new ModelRendererTurbo(this, 129, 97, textureX, textureY); // Box 108
		turretModel[17] = new ModelRendererTurbo(this, 145, 97, textureX, textureY); // Box 109
		turretModel[18] = new ModelRendererTurbo(this, 193, 57, textureX, textureY); // Box 110
		turretModel[19] = new ModelRendererTurbo(this, 177, 97, textureX, textureY); // Box 111
		turretModel[20] = new ModelRendererTurbo(this, 225, 97, textureX, textureY); // Box 112
		turretModel[21] = new ModelRendererTurbo(this, 417, 97, textureX, textureY); // Box 113
		turretModel[22] = new ModelRendererTurbo(this, 177, 113, textureX, textureY); // Box 114
		turretModel[23] = new ModelRendererTurbo(this, 249, 105, textureX, textureY); // Box 115
		turretModel[24] = new ModelRendererTurbo(this, 169, 57, textureX, textureY); // Box 152
		turretModel[25] = new ModelRendererTurbo(this, 385, 81, textureX, textureY); // Box 153
		turretModel[26] = new ModelRendererTurbo(this, 401, 113, textureX, textureY); // Box 155

		turretModel[0].addShapeBox(0F, 0F, 0F, 13, 1, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 92
		turretModel[0].setRotationPoint(-9F, -20F, -11F);

		turretModel[1].addShapeBox(0F, 0F, 0F, 6, 1, 11, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 93
		turretModel[1].setRotationPoint(-15F, -20F, -11F);

		turretModel[2].addShapeBox(0F, 0F, 0F, 6, 1, 11, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F); // Box 94
		turretModel[2].setRotationPoint(-15F, -20F, 0F);

		turretModel[3].addShapeBox(0F, 0F, 0F, 9, 1, 13, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 95
		turretModel[3].setRotationPoint(-9F, -20F, -2F);

		turretModel[4].addShapeBox(0F, 0F, 0F, 4, 1, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 2F); // Box 96
		turretModel[4].setRotationPoint(0F, -20F, -2F);

		turretModel[5].addShapeBox(0F, 0F, 0F, 5, 1, 11, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F); // Box 97
		turretModel[5].setRotationPoint(4F, -20F, -2F);

		turretModel[6].addShapeBox(0F, 0F, 0F, 5, 1, 7, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 98
		turretModel[6].setRotationPoint(4F, -20F, -9F);

		turretModel[7].addShapeBox(0F, 0F, 0F, 3, 1, 18, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F); // Box 99
		turretModel[7].setRotationPoint(9F, -20F, -9F);

		turretModel[8].addShapeBox(0F, 0F, 0F, 11, 9, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 100
		turretModel[8].setRotationPoint(-7F, -29F, -7F);

		turretModel[9].addShapeBox(0F, 0F, 0F, 4, 9, 7, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F); // Box 101
		turretModel[9].setRotationPoint(-11F, -29F, -7F);

		turretModel[10].addShapeBox(0F, 0F, 0F, 5, 9, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 3F); // Box 102
		turretModel[10].setRotationPoint(-11F, -29F, 0F);

		turretModel[11].addShapeBox(0F, 0F, 0F, 6, 9, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 3F, 0F, 3F); // Box 103
		turretModel[11].setRotationPoint(-6F, -29F, 0F);

		turretModel[12].addShapeBox(0F, 0F, 0F, 4, 9, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 4F); // Box 104
		turretModel[12].setRotationPoint(0F, -29F, 0F);

		turretModel[13].addShapeBox(0F, 0F, 0F, 5, 9, 7, 0F, 0F, 0F, 0F, 0F, -2F, -1F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 105
		turretModel[13].setRotationPoint(4F, -29F, -7F);

		turretModel[14].addShapeBox(0F, 0F, 0F, 5, 9, 7, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 4F); // Box 106
		turretModel[14].setRotationPoint(4F, -29F, 0F);

		turretModel[15].addShapeBox(0F, 0F, 0F, 3, 7, 12, 0F, 0F, 0F, 0F, 0F, -2F, -3F, 0F, -2F, -3F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 3F); // Box 107
		turretModel[15].setRotationPoint(9F, -27F, -6F);

		turretModel[16].addShapeBox(0F, 0F, 0F, 5, 2, 11, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F); // Box 108
		turretModel[16].setRotationPoint(4F, -19F, -2F);

		turretModel[17].addShapeBox(0F, 0F, 0F, 3, 2, 18, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -6F, -1F, 0F, -6F, 0F, 0F, -1F); // Box 109
		turretModel[17].setRotationPoint(9F, -19F, -9F);

		turretModel[18].addShapeBox(0F, 0F, 0F, 5, 2, 7, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 110
		turretModel[18].setRotationPoint(4F, -19F, -9F);

		turretModel[19].addShapeBox(0F, 0F, 0F, 13, 2, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 111
		turretModel[19].setRotationPoint(-9F, -19F, -11F);

		turretModel[20].addShapeBox(0F, 0F, 0F, 6, 2, 11, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 112
		turretModel[20].setRotationPoint(-15F, -19F, -11F);

		turretModel[21].addShapeBox(0F, 0F, 0F, 6, 2, 11, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -6F, 0F, -1F); // Box 113
		turretModel[21].setRotationPoint(-15F, -19F, 0F);

		turretModel[22].addShapeBox(0F, 0F, 0F, 9, 2, 13, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 114
		turretModel[22].setRotationPoint(-9F, -19F, -2F);

		turretModel[23].addShapeBox(0F, 0F, 0F, 4, 2, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 115
		turretModel[23].setRotationPoint(0F, -19F, -2F);

		turretModel[24].addShapeBox(2F, -3F, -2F, 1, 6, 4, 0F, 0F, 0F, 0F, 0F, -2.5F, -1.5F, 0F, -2.5F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, -1.5F, 0F, -2.5F, -1.5F, 0F, 0F, 0F); // Box 152
		turretModel[24].setRotationPoint(10F, -22F, 3F);

		turretModel[25].addShapeBox(2F, -3F, -2F, 2, 6, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 153
		turretModel[25].setRotationPoint(8F, -22F, 3F);

		turretModel[26].addShapeBox(0F, 0F, 0F, 7, 2, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 155
		turretModel[26].setRotationPoint(-4F, -31F, -7F);
	}

	private void initbarrelModel_1() {
		barrelModel[0] = new ModelRendererTurbo(this, 457, 81, textureX, textureY); // Box 146
		barrelModel[1] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 147
		barrelModel[2] = new ModelRendererTurbo(this, 321, 41, textureX, textureY); // Box 149
		barrelModel[3] = new ModelRendererTurbo(this, 385, 97, textureX, textureY); // Box 150
		barrelModel[4] = new ModelRendererTurbo(this, 417, 33, textureX, textureY); // Box 151
		barrelModel[5] = new ModelRendererTurbo(this, 161, 41, textureX, textureY); // Box 154

		barrelModel[0].addShapeBox(2F, -3F, -2F, 2, 5, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F); // Box 146
		barrelModel[0].setRotationPoint(10F, -22F, -3F);

		barrelModel[1].addShapeBox(0F, -5F, -2F, 1, 2, 5, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, -2F, 1F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 1F, 0F); // Box 147
		barrelModel[1].setRotationPoint(10F, -22F, -3F);

		barrelModel[2].addShapeBox(4F, -1.5F, -2F, 1, 3, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 149
		barrelModel[2].setRotationPoint(10F, -22F, -2F);

		barrelModel[3].addShapeBox(5F, -1F, -2F, 12, 2, 2, 0F, 0F, 0F, 0F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, 0F, 0F); // Box 150
		barrelModel[3].setRotationPoint(10F, -22F, -1.5F);

		barrelModel[4].addShapeBox(17F, -1F, -2F, 1, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 151
		barrelModel[4].setRotationPoint(10F, -22F, -1.5F);

		barrelModel[5].addShapeBox(-1F, -0.5F, -0.5F, 5, 1, 1, 0F, 0F, 0F, 0F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, 0F, 0F); // Box 154
		barrelModel[5].setRotationPoint(13F, -22F, 3F);
	}

	private void initleftTrackWheelModels_1() {
		leftTrackWheelModels[0] = new ModelRendererTurbo(this, 88, 163, textureX, textureY); // Shape 180
		leftTrackWheelModels[1] = new ModelRendererTurbo(this, 27, 161, textureX, textureY); // Shape 181

		leftTrackWheelModels[0].addShape3D(6F, -6F, -5F, new Shape2D(new Coord2D[]{new Coord2D(3, 0, 3, 0), new Coord2D(9, 0, 9, 0), new Coord2D(12, 3, 12, 3), new Coord2D(12, 9, 12, 9), new Coord2D(9, 12, 9, 12), new Coord2D(3, 12, 3, 12), new Coord2D(0, 9, 0, 9), new Coord2D(0, 3, 0, 3)}), 6, 12, 12, 44, 6, ModelRendererTurbo.MR_FRONT, new float[]{5, 6, 5, 6, 5, 6, 5, 6}); // Shape 180
		leftTrackWheelModels[0].setRotationPoint(29F, -1F, 13F);

		leftTrackWheelModels[1].addShape3D(7F, -7F, -5F, new Shape2D(new Coord2D[]{new Coord2D(3, 0, 3, 0), new Coord2D(11, 0, 11, 0), new Coord2D(14, 3, 14, 3), new Coord2D(14, 11, 14, 11), new Coord2D(11, 14, 11, 14), new Coord2D(3, 14, 3, 14), new Coord2D(0, 11, 0, 11), new Coord2D(0, 3, 0, 3)}), 6, 14, 14, 52, 6, ModelRendererTurbo.MR_FRONT, new float[]{5, 8, 5, 8, 5, 8, 5, 8}); // Shape 181
		leftTrackWheelModels[1].setRotationPoint(-60F, -1F, 13F);
	}

	private void initrightTrackWheelModels_1() {
		rightTrackWheelModels[0] = new ModelRendererTurbo(this, 88, 163, textureX, textureY); // Shape 7
		rightTrackWheelModels[1] = new ModelRendererTurbo(this, 27, 161, textureX, textureY); // Shape 67

		rightTrackWheelModels[0].addShape3D(6F, -6F, -5F, new Shape2D(new Coord2D[]{new Coord2D(3, 0, 3, 0), new Coord2D(9, 0, 9, 0), new Coord2D(12, 3, 12, 3), new Coord2D(12, 9, 12, 9), new Coord2D(9, 12, 9, 12), new Coord2D(3, 12, 3, 12), new Coord2D(0, 9, 0, 9), new Coord2D(0, 3, 0, 3)}), 6, 12, 12, 44, 6, ModelRendererTurbo.MR_FRONT, new float[]{5, 6, 5, 6, 5, 6, 5, 6}); // Shape 7
		rightTrackWheelModels[0].setRotationPoint(29F, -1F, -20F);

		rightTrackWheelModels[1].addShape3D(7F, -7F, -5F, new Shape2D(new Coord2D[]{new Coord2D(3, 0, 3, 0), new Coord2D(11, 0, 11, 0), new Coord2D(14, 3, 14, 3), new Coord2D(14, 11, 14, 11), new Coord2D(11, 14, 11, 14), new Coord2D(3, 14, 3, 14), new Coord2D(0, 11, 0, 11), new Coord2D(0, 3, 0, 3)}), 6, 14, 14, 52, 6, ModelRendererTurbo.MR_FRONT, new float[]{5, 8, 5, 8, 5, 8, 5, 8}); // Shape 67
		rightTrackWheelModels[1].setRotationPoint(-60F, -1F, -20F);
	}

	private void initleftTrackModel_1() {
		leftTrackModel[0] = new ModelRendererTurbo(this, 58, 188, textureX, textureY); // Box 305
		leftTrackModel[1] = new ModelRendererTurbo(this, 58, 188, textureX, textureY); // Box 306
		leftTrackModel[2] = new ModelRendererTurbo(this, 58, 188, textureX, textureY); // Box 307
		leftTrackModel[3] = new ModelRendererTurbo(this, 58, 188, textureX, textureY); // Box 308
		leftTrackModel[4] = new ModelRendererTurbo(this, 58, 188, textureX, textureY); // Box 309
		leftTrackModel[5] = new ModelRendererTurbo(this, 58, 188, textureX, textureY); // Box 310
		leftTrackModel[6] = new ModelRendererTurbo(this, 58, 188, textureX, textureY); // Box 311
		leftTrackModel[7] = new ModelRendererTurbo(this, 58, 188, textureX, textureY); // Box 312
		leftTrackModel[8] = new ModelRendererTurbo(this, 58, 188, textureX, textureY); // Box 313
		leftTrackModel[9] = new ModelRendererTurbo(this, 58, 188, textureX, textureY); // Box 314
		leftTrackModel[10] = new ModelRendererTurbo(this, 58, 188, textureX, textureY); // Box 315
		leftTrackModel[11] = new ModelRendererTurbo(this, 58, 188, textureX, textureY); // Box 316
		leftTrackModel[12] = new ModelRendererTurbo(this, 58, 188, textureX, textureY); // Box 317
		leftTrackModel[13] = new ModelRendererTurbo(this, 58, 188, textureX, textureY); // Box 318
		leftTrackModel[14] = new ModelRendererTurbo(this, 58, 188, textureX, textureY); // Box 319
		leftTrackModel[15] = new ModelRendererTurbo(this, 58, 188, textureX, textureY); // Box 320
		leftTrackModel[16] = new ModelRendererTurbo(this, 58, 188, textureX, textureY); // Box 321
		leftTrackModel[17] = new ModelRendererTurbo(this, 58, 188, textureX, textureY); // Box 322
		leftTrackModel[18] = new ModelRendererTurbo(this, 58, 188, textureX, textureY); // Box 323
		leftTrackModel[19] = new ModelRendererTurbo(this, 58, 188, textureX, textureY); // Box 324
		leftTrackModel[20] = new ModelRendererTurbo(this, 58, 188, textureX, textureY); // Box 325
		leftTrackModel[21] = new ModelRendererTurbo(this, 58, 188, textureX, textureY); // Box 326
		leftTrackModel[22] = new ModelRendererTurbo(this, 58, 188, textureX, textureY); // Box 327
		leftTrackModel[23] = new ModelRendererTurbo(this, 58, 188, textureX, textureY); // Box 328
		leftTrackModel[24] = new ModelRendererTurbo(this, 58, 188, textureX, textureY); // Box 329
		leftTrackModel[25] = new ModelRendererTurbo(this, 58, 188, textureX, textureY); // Box 330
		leftTrackModel[26] = new ModelRendererTurbo(this, 58, 188, textureX, textureY); // Box 331
		leftTrackModel[27] = new ModelRendererTurbo(this, 58, 188, textureX, textureY); // Box 332
		leftTrackModel[28] = new ModelRendererTurbo(this, 58, 188, textureX, textureY); // Box 333
		leftTrackModel[29] = new ModelRendererTurbo(this, 58, 188, textureX, textureY); // Box 334
		leftTrackModel[30] = new ModelRendererTurbo(this, 58, 188, textureX, textureY); // Box 335
		leftTrackModel[31] = new ModelRendererTurbo(this, 58, 188, textureX, textureY); // Box 336
		leftTrackModel[32] = new ModelRendererTurbo(this, 58, 188, textureX, textureY); // Box 337
		leftTrackModel[33] = new ModelRendererTurbo(this, 58, 188, textureX, textureY); // Box 338
		leftTrackModel[34] = new ModelRendererTurbo(this, 58, 188, textureX, textureY); // Box 339
		leftTrackModel[35] = new ModelRendererTurbo(this, 58, 188, textureX, textureY); // Box 340
		leftTrackModel[36] = new ModelRendererTurbo(this, 58, 188, textureX, textureY); // Box 341
		leftTrackModel[37] = new ModelRendererTurbo(this, 58, 188, textureX, textureY); // Box 342
		leftTrackModel[38] = new ModelRendererTurbo(this, 58, 188, textureX, textureY); // Box 343
		leftTrackModel[39] = new ModelRendererTurbo(this, 58, 188, textureX, textureY); // Box 344
		leftTrackModel[40] = new ModelRendererTurbo(this, 58, 188, textureX, textureY); // Box 345
		leftTrackModel[41] = new ModelRendererTurbo(this, 58, 188, textureX, textureY); // Box 346
		leftTrackModel[42] = new ModelRendererTurbo(this, 58, 188, textureX, textureY); // Box 347
		leftTrackModel[43] = new ModelRendererTurbo(this, 58, 188, textureX, textureY); // Box 348
		leftTrackModel[44] = new ModelRendererTurbo(this, 58, 188, textureX, textureY); // Box 349
		leftTrackModel[45] = new ModelRendererTurbo(this, 58, 188, textureX, textureY); // Box 350
		leftTrackModel[46] = new ModelRendererTurbo(this, 58, 188, textureX, textureY); // Box 351
		leftTrackModel[47] = new ModelRendererTurbo(this, 58, 188, textureX, textureY); // Box 352
		leftTrackModel[48] = new ModelRendererTurbo(this, 58, 188, textureX, textureY); // Box 353
		leftTrackModel[49] = new ModelRendererTurbo(this, 58, 188, textureX, textureY); // Box 354
		leftTrackModel[50] = new ModelRendererTurbo(this, 58, 188, textureX, textureY); // Box 355
		leftTrackModel[51] = new ModelRendererTurbo(this, 58, 188, textureX, textureY); // Box 356
		leftTrackModel[52] = new ModelRendererTurbo(this, 58, 188, textureX, textureY); // Box 357
		leftTrackModel[53] = new ModelRendererTurbo(this, 58, 188, textureX, textureY); // Box 358
		leftTrackModel[54] = new ModelRendererTurbo(this, 58, 188, textureX, textureY); // Box 359
		leftTrackModel[55] = new ModelRendererTurbo(this, 58, 188, textureX, textureY); // Box 360
		leftTrackModel[56] = new ModelRendererTurbo(this, 58, 188, textureX, textureY); // Box 361
		leftTrackModel[57] = new ModelRendererTurbo(this, 58, 188, textureX, textureY); // Box 362
		leftTrackModel[58] = new ModelRendererTurbo(this, 58, 188, textureX, textureY); // Box 363
		leftTrackModel[59] = new ModelRendererTurbo(this, 58, 188, textureX, textureY); // Box 364
		leftTrackModel[60] = new ModelRendererTurbo(this, 58, 188, textureX, textureY); // Box 365
		leftTrackModel[61] = new ModelRendererTurbo(this, 58, 188, textureX, textureY); // Box 366
		leftTrackModel[62] = new ModelRendererTurbo(this, 58, 188, textureX, textureY); // Box 367
		leftTrackModel[63] = new ModelRendererTurbo(this, 58, 188, textureX, textureY); // Box 368
		leftTrackModel[64] = new ModelRendererTurbo(this, 58, 188, textureX, textureY); // Box 369
		leftTrackModel[65] = new ModelRendererTurbo(this, 58, 188, textureX, textureY); // Box 370
		leftTrackModel[66] = new ModelRendererTurbo(this, 58, 188, textureX, textureY); // Box 371
		leftTrackModel[67] = new ModelRendererTurbo(this, 58, 188, textureX, textureY); // Box 372
		leftTrackModel[68] = new ModelRendererTurbo(this, 58, 188, textureX, textureY); // Box 373
		leftTrackModel[69] = new ModelRendererTurbo(this, 58, 188, textureX, textureY); // Box 374
		leftTrackModel[70] = new ModelRendererTurbo(this, 58, 188, textureX, textureY); // Box 375
		leftTrackModel[71] = new ModelRendererTurbo(this, 58, 188, textureX, textureY); // Box 376
		leftTrackModel[72] = new ModelRendererTurbo(this, 58, 188, textureX, textureY); // Box 377
		leftTrackModel[73] = new ModelRendererTurbo(this, 58, 188, textureX, textureY); // Box 378
		leftTrackModel[74] = new ModelRendererTurbo(this, 58, 188, textureX, textureY); // Box 379

		leftTrackModel[0].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 305
		leftTrackModel[0].setRotationPoint(-14F, -13F, 11F);

		leftTrackModel[1].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 306
		leftTrackModel[1].setRotationPoint(-11F, -13F, 11F);

		leftTrackModel[2].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 307
		leftTrackModel[2].setRotationPoint(-8F, -13F, 11F);

		leftTrackModel[3].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 308
		leftTrackModel[3].setRotationPoint(-5F, -13F, 11F);

		leftTrackModel[4].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 309
		leftTrackModel[4].setRotationPoint(-2F, -13F, 11F);
		leftTrackModel[4].rotateAngleZ = -0.15707963F;

		leftTrackModel[5].addShapeBox(3F, 0F, 0F, 3, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 310
		leftTrackModel[5].setRotationPoint(-2F, -13F, 11F);
		leftTrackModel[5].rotateAngleZ = -0.15707963F;

		leftTrackModel[6].addShapeBox(6F, 0F, 0F, 3, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 311
		leftTrackModel[6].setRotationPoint(-2F, -13F, 11F);
		leftTrackModel[6].rotateAngleZ = -0.15707963F;

		leftTrackModel[7].addShapeBox(9F, 0F, 0F, 3, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 312
		leftTrackModel[7].setRotationPoint(-2F, -13F, 11F);
		leftTrackModel[7].rotateAngleZ = -0.15707963F;

		leftTrackModel[8].addShapeBox(21F, 0F, 0F, 3, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 313
		leftTrackModel[8].setRotationPoint(-2F, -13F, 11F);
		leftTrackModel[8].rotateAngleZ = -0.15707963F;

		leftTrackModel[9].addShapeBox(15F, 0F, 0F, 3, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 314
		leftTrackModel[9].setRotationPoint(-2F, -13F, 11F);
		leftTrackModel[9].rotateAngleZ = -0.15707963F;

		leftTrackModel[10].addShapeBox(18F, 0F, 0F, 3, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 315
		leftTrackModel[10].setRotationPoint(-2F, -13F, 11F);
		leftTrackModel[10].rotateAngleZ = -0.15707963F;

		leftTrackModel[11].addShapeBox(12F, 0F, 0F, 3, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 316
		leftTrackModel[11].setRotationPoint(-2F, -13F, 11F);
		leftTrackModel[11].rotateAngleZ = -0.15707963F;

		leftTrackModel[12].addShapeBox(27F, 0F, 0F, 3, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 317
		leftTrackModel[12].setRotationPoint(-2F, -13F, 11F);
		leftTrackModel[12].rotateAngleZ = -0.15707963F;

		leftTrackModel[13].addShapeBox(30F, 0F, 0F, 3, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 318
		leftTrackModel[13].setRotationPoint(-2F, -13F, 11F);
		leftTrackModel[13].rotateAngleZ = -0.15707963F;

		leftTrackModel[14].addShapeBox(24F, 0F, 0F, 3, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 319
		leftTrackModel[14].setRotationPoint(-2F, -13F, 11F);
		leftTrackModel[14].rotateAngleZ = -0.15707963F;

		leftTrackModel[15].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 320
		leftTrackModel[15].setRotationPoint(30.5F, -8F, 11F);
		leftTrackModel[15].rotateAngleZ = -0.2443461F;

		leftTrackModel[16].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 321
		leftTrackModel[16].setRotationPoint(33.5F, -7F, 11F);
		leftTrackModel[16].rotateAngleZ = -0.6981317F;

		leftTrackModel[17].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 322
		leftTrackModel[17].setRotationPoint(36F, -4.5F, 11F);
		leftTrackModel[17].rotateAngleZ = -1.46607657F;

		leftTrackModel[18].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 323
		leftTrackModel[18].setRotationPoint(36F, -1.5F, 11F);
		leftTrackModel[18].rotateAngleZ = -1.60570291F;

		leftTrackModel[19].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 324
		leftTrackModel[19].setRotationPoint(36F, 1.5F, 11F);
		leftTrackModel[19].rotateAngleZ = -2.21656815F;

		leftTrackModel[20].addShapeBox(2.5F, 0F, 0F, 3, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 325
		leftTrackModel[20].setRotationPoint(36F, 2.5F, 11F);
		leftTrackModel[20].rotateAngleZ = -2.51327412F;

		leftTrackModel[21].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 326
		leftTrackModel[21].setRotationPoint(31.5F, 5.5F, 11F);
		leftTrackModel[21].rotateAngleZ = -2.75762022F;

		leftTrackModel[22].addShapeBox(3F, 0F, 0F, 3, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 327
		leftTrackModel[22].setRotationPoint(31.5F, 5.5F, 11F);
		leftTrackModel[22].rotateAngleZ = -2.75762022F;

		leftTrackModel[23].addShapeBox(3F, 0F, 0F, 3, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 328
		leftTrackModel[23].setRotationPoint(25.5F, 8F, 11F);
		leftTrackModel[23].rotateAngleZ = -3.14159265F;

		leftTrackModel[24].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 329
		leftTrackModel[24].setRotationPoint(25.5F, 8F, 11F);
		leftTrackModel[24].rotateAngleZ = -3.14159265F;

		leftTrackModel[25].addShapeBox(9F, 0F, 0F, 3, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 330
		leftTrackModel[25].setRotationPoint(25.5F, 8F, 11F);
		leftTrackModel[25].rotateAngleZ = -3.14159265F;

		leftTrackModel[26].addShapeBox(6F, 0F, 0F, 3, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 331
		leftTrackModel[26].setRotationPoint(25.5F, 8F, 11F);
		leftTrackModel[26].rotateAngleZ = -3.14159265F;

		leftTrackModel[27].addShapeBox(21F, 0F, 0F, 3, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 332
		leftTrackModel[27].setRotationPoint(25.5F, 8F, 11F);
		leftTrackModel[27].rotateAngleZ = -3.14159265F;

		leftTrackModel[28].addShapeBox(18F, 0F, 0F, 3, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 333
		leftTrackModel[28].setRotationPoint(25.5F, 8F, 11F);
		leftTrackModel[28].rotateAngleZ = -3.14159265F;

		leftTrackModel[29].addShapeBox(12F, 0F, 0F, 3, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 334
		leftTrackModel[29].setRotationPoint(25.5F, 8F, 11F);
		leftTrackModel[29].rotateAngleZ = -3.14159265F;

		leftTrackModel[30].addShapeBox(15F, 0F, 0F, 3, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 335
		leftTrackModel[30].setRotationPoint(25.5F, 8F, 11F);
		leftTrackModel[30].rotateAngleZ = -3.14159265F;

		leftTrackModel[31].addShapeBox(45F, 0F, 0F, 3, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 336
		leftTrackModel[31].setRotationPoint(25.5F, 8F, 11F);
		leftTrackModel[31].rotateAngleZ = -3.14159265F;

		leftTrackModel[32].addShapeBox(42F, 0F, 0F, 3, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 337
		leftTrackModel[32].setRotationPoint(25.5F, 8F, 11F);
		leftTrackModel[32].rotateAngleZ = -3.14159265F;

		leftTrackModel[33].addShapeBox(36F, 0F, 0F, 3, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 338
		leftTrackModel[33].setRotationPoint(25.5F, 8F, 11F);
		leftTrackModel[33].rotateAngleZ = -3.14159265F;

		leftTrackModel[34].addShapeBox(39F, 0F, 0F, 3, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 339
		leftTrackModel[34].setRotationPoint(25.5F, 8F, 11F);
		leftTrackModel[34].rotateAngleZ = -3.14159265F;

		leftTrackModel[35].addShapeBox(33F, 0F, 0F, 3, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 340
		leftTrackModel[35].setRotationPoint(25.5F, 8F, 11F);
		leftTrackModel[35].rotateAngleZ = -3.14159265F;

		leftTrackModel[36].addShapeBox(30F, 0F, 0F, 3, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 341
		leftTrackModel[36].setRotationPoint(25.5F, 8F, 11F);
		leftTrackModel[36].rotateAngleZ = -3.14159265F;

		leftTrackModel[37].addShapeBox(27F, 0F, 0F, 3, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 342
		leftTrackModel[37].setRotationPoint(25.5F, 8F, 11F);
		leftTrackModel[37].rotateAngleZ = -3.14159265F;

		leftTrackModel[38].addShapeBox(24F, 0F, 0F, 3, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 343
		leftTrackModel[38].setRotationPoint(25.5F, 8F, 11F);
		leftTrackModel[38].rotateAngleZ = -3.14159265F;

		leftTrackModel[39].addShapeBox(69F, 0F, 0F, 3, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 344
		leftTrackModel[39].setRotationPoint(25.5F, 8F, 11F);
		leftTrackModel[39].rotateAngleZ = -3.14159265F;

		leftTrackModel[40].addShapeBox(66F, 0F, 0F, 3, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 345
		leftTrackModel[40].setRotationPoint(25.5F, 8F, 11F);
		leftTrackModel[40].rotateAngleZ = -3.14159265F;

		leftTrackModel[41].addShapeBox(60F, 0F, 0F, 3, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 346
		leftTrackModel[41].setRotationPoint(25.5F, 8F, 11F);
		leftTrackModel[41].rotateAngleZ = -3.14159265F;

		leftTrackModel[42].addShapeBox(63F, 0F, 0F, 3, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 347
		leftTrackModel[42].setRotationPoint(25.5F, 8F, 11F);
		leftTrackModel[42].rotateAngleZ = -3.14159265F;

		leftTrackModel[43].addShapeBox(57F, 0F, 0F, 3, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 348
		leftTrackModel[43].setRotationPoint(25.5F, 8F, 11F);
		leftTrackModel[43].rotateAngleZ = -3.14159265F;

		leftTrackModel[44].addShapeBox(54F, 0F, 0F, 3, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 349
		leftTrackModel[44].setRotationPoint(25.5F, 8F, 11F);
		leftTrackModel[44].rotateAngleZ = -3.14159265F;

		leftTrackModel[45].addShapeBox(51F, 0F, 0F, 3, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 350
		leftTrackModel[45].setRotationPoint(25.5F, 8F, 11F);
		leftTrackModel[45].rotateAngleZ = -3.14159265F;

		leftTrackModel[46].addShapeBox(48F, 0F, 0F, 3, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 351
		leftTrackModel[46].setRotationPoint(25.5F, 8F, 11F);
		leftTrackModel[46].rotateAngleZ = -3.14159265F;

		leftTrackModel[47].addShapeBox(72F, 0F, 0F, 3, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 352
		leftTrackModel[47].setRotationPoint(25.5F, 8F, 11F);
		leftTrackModel[47].rotateAngleZ = -3.14159265F;

		leftTrackModel[48].addShapeBox(75F, 0F, 0F, 3, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 353
		leftTrackModel[48].setRotationPoint(25.5F, 8F, 11F);
		leftTrackModel[48].rotateAngleZ = -3.14159265F;

		leftTrackModel[49].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 354
		leftTrackModel[49].setRotationPoint(-52.5F, 8F, 11F);
		leftTrackModel[49].rotateAngleZ = -3.22885912F;

		leftTrackModel[50].addShapeBox(3F, 0F, 0F, 3, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 355
		leftTrackModel[50].setRotationPoint(-52.5F, 8F, 11F);
		leftTrackModel[50].rotateAngleZ = -3.22885912F;

		leftTrackModel[51].addShapeBox(6F, 0F, 0F, 3, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 356
		leftTrackModel[51].setRotationPoint(-52.5F, 8F, 11F);
		leftTrackModel[51].rotateAngleZ = -3.22885912F;

		leftTrackModel[52].addShapeBox(9F, 0F, 0F, 3, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 357
		leftTrackModel[52].setRotationPoint(-52.5F, 8F, 11F);
		leftTrackModel[52].rotateAngleZ = -3.22885912F;

		leftTrackModel[53].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 358
		leftTrackModel[53].setRotationPoint(-65F, 7F, 11F);
		leftTrackModel[53].rotateAngleZ = -3.89208423F;

		leftTrackModel[54].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 359
		leftTrackModel[54].setRotationPoint(-67.5F, 4.5F, 11F);
		leftTrackModel[54].rotateAngleZ = -4.34586984F;

		leftTrackModel[55].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 360
		leftTrackModel[55].setRotationPoint(-68.5F, 1.5F, 11F);
		leftTrackModel[55].rotateAngleZ = -4.59021593F;

		leftTrackModel[56].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 361
		leftTrackModel[56].setRotationPoint(-68.5F, -1.5F, 11F);
		leftTrackModel[56].rotateAngleZ = -4.78220215F;

		leftTrackModel[57].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 362
		leftTrackModel[57].setRotationPoint(-68F, -5F, 11F);
		leftTrackModel[57].rotateAngleZ = -5.32325422F;

		leftTrackModel[58].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 363
		leftTrackModel[58].setRotationPoint(-65.5F, -8F, 11F);
		leftTrackModel[58].rotateAngleZ = -6.0737458F;

		leftTrackModel[59].addShapeBox(3F, 0F, 0F, 3, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 364
		leftTrackModel[59].setRotationPoint(-65.5F, -8F, 11F);
		leftTrackModel[59].rotateAngleZ = -6.0737458F;

		leftTrackModel[60].addShapeBox(6F, 0F, 0F, 3, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 365
		leftTrackModel[60].setRotationPoint(-65.5F, -8F, 11F);
		leftTrackModel[60].rotateAngleZ = -6.0737458F;

		leftTrackModel[61].addShapeBox(9F, 0F, 0F, 3, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 366
		leftTrackModel[61].setRotationPoint(-65.5F, -8F, 11F);
		leftTrackModel[61].rotateAngleZ = -6.0737458F;

		leftTrackModel[62].addShapeBox(21F, 0F, 0F, 3, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 367
		leftTrackModel[62].setRotationPoint(-65.5F, -8F, 11F);
		leftTrackModel[62].rotateAngleZ = -6.0737458F;

		leftTrackModel[63].addShapeBox(18F, 0F, 0F, 3, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 368
		leftTrackModel[63].setRotationPoint(-65.5F, -8F, 11F);
		leftTrackModel[63].rotateAngleZ = -6.0737458F;

		leftTrackModel[64].addShapeBox(15F, 0F, 0F, 3, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 369
		leftTrackModel[64].setRotationPoint(-65.5F, -8F, 11F);
		leftTrackModel[64].rotateAngleZ = -6.0737458F;

		leftTrackModel[65].addShapeBox(12F, 0F, 0F, 3, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 370
		leftTrackModel[65].setRotationPoint(-65.5F, -8F, 11F);
		leftTrackModel[65].rotateAngleZ = -6.0737458F;

		leftTrackModel[66].addShapeBox(-12F, 0F, 0F, 3, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 371
		leftTrackModel[66].setRotationPoint(-5F, -13F, 11F);

		leftTrackModel[67].addShapeBox(-12F, 0F, 0F, 3, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 372
		leftTrackModel[67].setRotationPoint(-8F, -13F, 11F);

		leftTrackModel[68].addShapeBox(-12F, 0F, 0F, 3, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 373
		leftTrackModel[68].setRotationPoint(-11F, -13F, 11F);

		leftTrackModel[69].addShapeBox(-12F, 0F, 0F, 3, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 374
		leftTrackModel[69].setRotationPoint(-14F, -13F, 11F);

		leftTrackModel[70].addShapeBox(-24F, 0F, 0F, 3, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 375
		leftTrackModel[70].setRotationPoint(-5F, -13F, 11F);

		leftTrackModel[71].addShapeBox(-24F, 0F, 0F, 3, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 376
		leftTrackModel[71].setRotationPoint(-8F, -13F, 11F);

		leftTrackModel[72].addShapeBox(-24F, 0F, 0F, 3, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 377
		leftTrackModel[72].setRotationPoint(-11F, -13F, 11F);

		leftTrackModel[73].addShapeBox(-24F, 0F, 0F, 3, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 378
		leftTrackModel[73].setRotationPoint(-14F, -13F, 11F);

		leftTrackModel[74].addShapeBox(-27.5F, 0F, 0F, 3, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 379
		leftTrackModel[74].setRotationPoint(-14F, -13F, 11F);
	}

	private void initrightTrackModel_1() {
		rightTrackModel[0] = new ModelRendererTurbo(this, 58, 188, textureX, textureY); // Box 229
		rightTrackModel[1] = new ModelRendererTurbo(this, 58, 188, textureX, textureY); // Box 230
		rightTrackModel[2] = new ModelRendererTurbo(this, 58, 188, textureX, textureY); // Box 231
		rightTrackModel[3] = new ModelRendererTurbo(this, 58, 188, textureX, textureY); // Box 232
		rightTrackModel[4] = new ModelRendererTurbo(this, 58, 188, textureX, textureY); // Box 233
		rightTrackModel[5] = new ModelRendererTurbo(this, 58, 188, textureX, textureY); // Box 234
		rightTrackModel[6] = new ModelRendererTurbo(this, 58, 188, textureX, textureY); // Box 235
		rightTrackModel[7] = new ModelRendererTurbo(this, 58, 188, textureX, textureY); // Box 236
		rightTrackModel[8] = new ModelRendererTurbo(this, 58, 188, textureX, textureY); // Box 237
		rightTrackModel[9] = new ModelRendererTurbo(this, 58, 188, textureX, textureY); // Box 238
		rightTrackModel[10] = new ModelRendererTurbo(this, 58, 188, textureX, textureY); // Box 239
		rightTrackModel[11] = new ModelRendererTurbo(this, 58, 188, textureX, textureY); // Box 240
		rightTrackModel[12] = new ModelRendererTurbo(this, 58, 188, textureX, textureY); // Box 241
		rightTrackModel[13] = new ModelRendererTurbo(this, 58, 188, textureX, textureY); // Box 242
		rightTrackModel[14] = new ModelRendererTurbo(this, 58, 188, textureX, textureY); // Box 243
		rightTrackModel[15] = new ModelRendererTurbo(this, 58, 188, textureX, textureY); // Box 244
		rightTrackModel[16] = new ModelRendererTurbo(this, 58, 188, textureX, textureY); // Box 245
		rightTrackModel[17] = new ModelRendererTurbo(this, 58, 188, textureX, textureY); // Box 246
		rightTrackModel[18] = new ModelRendererTurbo(this, 58, 188, textureX, textureY); // Box 247
		rightTrackModel[19] = new ModelRendererTurbo(this, 58, 188, textureX, textureY); // Box 248
		rightTrackModel[20] = new ModelRendererTurbo(this, 58, 188, textureX, textureY); // Box 249
		rightTrackModel[21] = new ModelRendererTurbo(this, 58, 188, textureX, textureY); // Box 250
		rightTrackModel[22] = new ModelRendererTurbo(this, 58, 188, textureX, textureY); // Box 251
		rightTrackModel[23] = new ModelRendererTurbo(this, 58, 188, textureX, textureY); // Box 252
		rightTrackModel[24] = new ModelRendererTurbo(this, 58, 188, textureX, textureY); // Box 253
		rightTrackModel[25] = new ModelRendererTurbo(this, 58, 188, textureX, textureY); // Box 254
		rightTrackModel[26] = new ModelRendererTurbo(this, 58, 188, textureX, textureY); // Box 255
		rightTrackModel[27] = new ModelRendererTurbo(this, 58, 188, textureX, textureY); // Box 256
		rightTrackModel[28] = new ModelRendererTurbo(this, 58, 188, textureX, textureY); // Box 257
		rightTrackModel[29] = new ModelRendererTurbo(this, 58, 188, textureX, textureY); // Box 258
		rightTrackModel[30] = new ModelRendererTurbo(this, 58, 188, textureX, textureY); // Box 259
		rightTrackModel[31] = new ModelRendererTurbo(this, 58, 188, textureX, textureY); // Box 260
		rightTrackModel[32] = new ModelRendererTurbo(this, 58, 188, textureX, textureY); // Box 261
		rightTrackModel[33] = new ModelRendererTurbo(this, 58, 188, textureX, textureY); // Box 262
		rightTrackModel[34] = new ModelRendererTurbo(this, 58, 188, textureX, textureY); // Box 263
		rightTrackModel[35] = new ModelRendererTurbo(this, 58, 188, textureX, textureY); // Box 264
		rightTrackModel[36] = new ModelRendererTurbo(this, 58, 188, textureX, textureY); // Box 265
		rightTrackModel[37] = new ModelRendererTurbo(this, 58, 188, textureX, textureY); // Box 266
		rightTrackModel[38] = new ModelRendererTurbo(this, 58, 188, textureX, textureY); // Box 267
		rightTrackModel[39] = new ModelRendererTurbo(this, 58, 188, textureX, textureY); // Box 268
		rightTrackModel[40] = new ModelRendererTurbo(this, 58, 188, textureX, textureY); // Box 269
		rightTrackModel[41] = new ModelRendererTurbo(this, 58, 188, textureX, textureY); // Box 270
		rightTrackModel[42] = new ModelRendererTurbo(this, 58, 188, textureX, textureY); // Box 271
		rightTrackModel[43] = new ModelRendererTurbo(this, 58, 188, textureX, textureY); // Box 272
		rightTrackModel[44] = new ModelRendererTurbo(this, 58, 188, textureX, textureY); // Box 273
		rightTrackModel[45] = new ModelRendererTurbo(this, 58, 188, textureX, textureY); // Box 274
		rightTrackModel[46] = new ModelRendererTurbo(this, 58, 188, textureX, textureY); // Box 275
		rightTrackModel[47] = new ModelRendererTurbo(this, 58, 188, textureX, textureY); // Box 276
		rightTrackModel[48] = new ModelRendererTurbo(this, 58, 188, textureX, textureY); // Box 277
		rightTrackModel[49] = new ModelRendererTurbo(this, 58, 188, textureX, textureY); // Box 279
		rightTrackModel[50] = new ModelRendererTurbo(this, 58, 188, textureX, textureY); // Box 280
		rightTrackModel[51] = new ModelRendererTurbo(this, 58, 188, textureX, textureY); // Box 281
		rightTrackModel[52] = new ModelRendererTurbo(this, 58, 188, textureX, textureY); // Box 282
		rightTrackModel[53] = new ModelRendererTurbo(this, 58, 188, textureX, textureY); // Box 283
		rightTrackModel[54] = new ModelRendererTurbo(this, 58, 188, textureX, textureY); // Box 284
		rightTrackModel[55] = new ModelRendererTurbo(this, 58, 188, textureX, textureY); // Box 285
		rightTrackModel[56] = new ModelRendererTurbo(this, 58, 188, textureX, textureY); // Box 286
		rightTrackModel[57] = new ModelRendererTurbo(this, 58, 188, textureX, textureY); // Box 287
		rightTrackModel[58] = new ModelRendererTurbo(this, 58, 188, textureX, textureY); // Box 288
		rightTrackModel[59] = new ModelRendererTurbo(this, 58, 188, textureX, textureY); // Box 289
		rightTrackModel[60] = new ModelRendererTurbo(this, 58, 188, textureX, textureY); // Box 290
		rightTrackModel[61] = new ModelRendererTurbo(this, 58, 188, textureX, textureY); // Box 291
		rightTrackModel[62] = new ModelRendererTurbo(this, 58, 188, textureX, textureY); // Box 292
		rightTrackModel[63] = new ModelRendererTurbo(this, 58, 188, textureX, textureY); // Box 293
		rightTrackModel[64] = new ModelRendererTurbo(this, 58, 188, textureX, textureY); // Box 294
		rightTrackModel[65] = new ModelRendererTurbo(this, 58, 188, textureX, textureY); // Box 295
		rightTrackModel[66] = new ModelRendererTurbo(this, 58, 188, textureX, textureY); // Box 296
		rightTrackModel[67] = new ModelRendererTurbo(this, 58, 188, textureX, textureY); // Box 297
		rightTrackModel[68] = new ModelRendererTurbo(this, 58, 188, textureX, textureY); // Box 298
		rightTrackModel[69] = new ModelRendererTurbo(this, 58, 188, textureX, textureY); // Box 299
		rightTrackModel[70] = new ModelRendererTurbo(this, 58, 188, textureX, textureY); // Box 300
		rightTrackModel[71] = new ModelRendererTurbo(this, 58, 188, textureX, textureY); // Box 301
		rightTrackModel[72] = new ModelRendererTurbo(this, 58, 188, textureX, textureY); // Box 302
		rightTrackModel[73] = new ModelRendererTurbo(this, 58, 188, textureX, textureY); // Box 303
		rightTrackModel[74] = new ModelRendererTurbo(this, 58, 188, textureX, textureY); // Box 304

		rightTrackModel[0].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 229
		rightTrackModel[0].setRotationPoint(-14F, -13F, -22F);

		rightTrackModel[1].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 230
		rightTrackModel[1].setRotationPoint(-11F, -13F, -22F);

		rightTrackModel[2].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 231
		rightTrackModel[2].setRotationPoint(-8F, -13F, -22F);

		rightTrackModel[3].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 232
		rightTrackModel[3].setRotationPoint(-5F, -13F, -22F);

		rightTrackModel[4].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 233
		rightTrackModel[4].setRotationPoint(-2F, -13F, -22F);
		rightTrackModel[4].rotateAngleZ = -0.15707963F;

		rightTrackModel[5].addShapeBox(3F, 0F, 0F, 3, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 234
		rightTrackModel[5].setRotationPoint(-2F, -13F, -22F);
		rightTrackModel[5].rotateAngleZ = -0.15707963F;

		rightTrackModel[6].addShapeBox(6F, 0F, 0F, 3, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 235
		rightTrackModel[6].setRotationPoint(-2F, -13F, -22F);
		rightTrackModel[6].rotateAngleZ = -0.15707963F;

		rightTrackModel[7].addShapeBox(9F, 0F, 0F, 3, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 236
		rightTrackModel[7].setRotationPoint(-2F, -13F, -22F);
		rightTrackModel[7].rotateAngleZ = -0.15707963F;

		rightTrackModel[8].addShapeBox(21F, 0F, 0F, 3, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 237
		rightTrackModel[8].setRotationPoint(-2F, -13F, -22F);
		rightTrackModel[8].rotateAngleZ = -0.15707963F;

		rightTrackModel[9].addShapeBox(15F, 0F, 0F, 3, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 238
		rightTrackModel[9].setRotationPoint(-2F, -13F, -22F);
		rightTrackModel[9].rotateAngleZ = -0.15707963F;

		rightTrackModel[10].addShapeBox(18F, 0F, 0F, 3, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 239
		rightTrackModel[10].setRotationPoint(-2F, -13F, -22F);
		rightTrackModel[10].rotateAngleZ = -0.15707963F;

		rightTrackModel[11].addShapeBox(12F, 0F, 0F, 3, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 240
		rightTrackModel[11].setRotationPoint(-2F, -13F, -22F);
		rightTrackModel[11].rotateAngleZ = -0.15707963F;

		rightTrackModel[12].addShapeBox(27F, 0F, 0F, 3, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 241
		rightTrackModel[12].setRotationPoint(-2F, -13F, -22F);
		rightTrackModel[12].rotateAngleZ = -0.15707963F;

		rightTrackModel[13].addShapeBox(30F, 0F, 0F, 3, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 242
		rightTrackModel[13].setRotationPoint(-2F, -13F, -22F);
		rightTrackModel[13].rotateAngleZ = -0.15707963F;

		rightTrackModel[14].addShapeBox(24F, 0F, 0F, 3, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 243
		rightTrackModel[14].setRotationPoint(-2F, -13F, -22F);
		rightTrackModel[14].rotateAngleZ = -0.15707963F;

		rightTrackModel[15].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 244
		rightTrackModel[15].setRotationPoint(30.5F, -8F, -22F);
		rightTrackModel[15].rotateAngleZ = -0.2443461F;

		rightTrackModel[16].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 245
		rightTrackModel[16].setRotationPoint(33.5F, -7F, -22F);
		rightTrackModel[16].rotateAngleZ = -0.6981317F;

		rightTrackModel[17].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 246
		rightTrackModel[17].setRotationPoint(36F, -4.5F, -22F);
		rightTrackModel[17].rotateAngleZ = -1.46607657F;

		rightTrackModel[18].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 247
		rightTrackModel[18].setRotationPoint(36F, -1.5F, -22F);
		rightTrackModel[18].rotateAngleZ = -1.60570291F;

		rightTrackModel[19].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 248
		rightTrackModel[19].setRotationPoint(36F, 1.5F, -22F);
		rightTrackModel[19].rotateAngleZ = -2.21656815F;

		rightTrackModel[20].addShapeBox(2.5F, 0F, 0F, 3, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 249
		rightTrackModel[20].setRotationPoint(36F, 2.5F, -22F);
		rightTrackModel[20].rotateAngleZ = -2.51327412F;

		rightTrackModel[21].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 250
		rightTrackModel[21].setRotationPoint(31.5F, 5.5F, -22F);
		rightTrackModel[21].rotateAngleZ = -2.75762022F;

		rightTrackModel[22].addShapeBox(3F, 0F, 0F, 3, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 251
		rightTrackModel[22].setRotationPoint(31.5F, 5.5F, -22F);
		rightTrackModel[22].rotateAngleZ = -2.75762022F;

		rightTrackModel[23].addShapeBox(3F, 0F, 0F, 3, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 252
		rightTrackModel[23].setRotationPoint(25.5F, 8F, -22F);
		rightTrackModel[23].rotateAngleZ = -3.14159265F;

		rightTrackModel[24].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 253
		rightTrackModel[24].setRotationPoint(25.5F, 8F, -22F);
		rightTrackModel[24].rotateAngleZ = -3.14159265F;

		rightTrackModel[25].addShapeBox(9F, 0F, 0F, 3, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 254
		rightTrackModel[25].setRotationPoint(25.5F, 8F, -22F);
		rightTrackModel[25].rotateAngleZ = -3.14159265F;

		rightTrackModel[26].addShapeBox(6F, 0F, 0F, 3, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 255
		rightTrackModel[26].setRotationPoint(25.5F, 8F, -22F);
		rightTrackModel[26].rotateAngleZ = -3.14159265F;

		rightTrackModel[27].addShapeBox(21F, 0F, 0F, 3, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 256
		rightTrackModel[27].setRotationPoint(25.5F, 8F, -22F);
		rightTrackModel[27].rotateAngleZ = -3.14159265F;

		rightTrackModel[28].addShapeBox(18F, 0F, 0F, 3, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 257
		rightTrackModel[28].setRotationPoint(25.5F, 8F, -22F);
		rightTrackModel[28].rotateAngleZ = -3.14159265F;

		rightTrackModel[29].addShapeBox(12F, 0F, 0F, 3, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 258
		rightTrackModel[29].setRotationPoint(25.5F, 8F, -22F);
		rightTrackModel[29].rotateAngleZ = -3.14159265F;

		rightTrackModel[30].addShapeBox(15F, 0F, 0F, 3, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 259
		rightTrackModel[30].setRotationPoint(25.5F, 8F, -22F);
		rightTrackModel[30].rotateAngleZ = -3.14159265F;

		rightTrackModel[31].addShapeBox(45F, 0F, 0F, 3, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 260
		rightTrackModel[31].setRotationPoint(25.5F, 8F, -22F);
		rightTrackModel[31].rotateAngleZ = -3.14159265F;

		rightTrackModel[32].addShapeBox(42F, 0F, 0F, 3, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 261
		rightTrackModel[32].setRotationPoint(25.5F, 8F, -22F);
		rightTrackModel[32].rotateAngleZ = -3.14159265F;

		rightTrackModel[33].addShapeBox(36F, 0F, 0F, 3, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 262
		rightTrackModel[33].setRotationPoint(25.5F, 8F, -22F);
		rightTrackModel[33].rotateAngleZ = -3.14159265F;

		rightTrackModel[34].addShapeBox(39F, 0F, 0F, 3, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 263
		rightTrackModel[34].setRotationPoint(25.5F, 8F, -22F);
		rightTrackModel[34].rotateAngleZ = -3.14159265F;

		rightTrackModel[35].addShapeBox(33F, 0F, 0F, 3, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 264
		rightTrackModel[35].setRotationPoint(25.5F, 8F, -22F);
		rightTrackModel[35].rotateAngleZ = -3.14159265F;

		rightTrackModel[36].addShapeBox(30F, 0F, 0F, 3, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 265
		rightTrackModel[36].setRotationPoint(25.5F, 8F, -22F);
		rightTrackModel[36].rotateAngleZ = -3.14159265F;

		rightTrackModel[37].addShapeBox(27F, 0F, 0F, 3, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 266
		rightTrackModel[37].setRotationPoint(25.5F, 8F, -22F);
		rightTrackModel[37].rotateAngleZ = -3.14159265F;

		rightTrackModel[38].addShapeBox(24F, 0F, 0F, 3, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 267
		rightTrackModel[38].setRotationPoint(25.5F, 8F, -22F);
		rightTrackModel[38].rotateAngleZ = -3.14159265F;

		rightTrackModel[39].addShapeBox(69F, 0F, 0F, 3, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 268
		rightTrackModel[39].setRotationPoint(25.5F, 8F, -22F);
		rightTrackModel[39].rotateAngleZ = -3.14159265F;

		rightTrackModel[40].addShapeBox(66F, 0F, 0F, 3, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 269
		rightTrackModel[40].setRotationPoint(25.5F, 8F, -22F);
		rightTrackModel[40].rotateAngleZ = -3.14159265F;

		rightTrackModel[41].addShapeBox(60F, 0F, 0F, 3, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 270
		rightTrackModel[41].setRotationPoint(25.5F, 8F, -22F);
		rightTrackModel[41].rotateAngleZ = -3.14159265F;

		rightTrackModel[42].addShapeBox(63F, 0F, 0F, 3, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 271
		rightTrackModel[42].setRotationPoint(25.5F, 8F, -22F);
		rightTrackModel[42].rotateAngleZ = -3.14159265F;

		rightTrackModel[43].addShapeBox(57F, 0F, 0F, 3, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 272
		rightTrackModel[43].setRotationPoint(25.5F, 8F, -22F);
		rightTrackModel[43].rotateAngleZ = -3.14159265F;

		rightTrackModel[44].addShapeBox(54F, 0F, 0F, 3, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 273
		rightTrackModel[44].setRotationPoint(25.5F, 8F, -22F);
		rightTrackModel[44].rotateAngleZ = -3.14159265F;

		rightTrackModel[45].addShapeBox(51F, 0F, 0F, 3, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 274
		rightTrackModel[45].setRotationPoint(25.5F, 8F, -22F);
		rightTrackModel[45].rotateAngleZ = -3.14159265F;

		rightTrackModel[46].addShapeBox(48F, 0F, 0F, 3, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 275
		rightTrackModel[46].setRotationPoint(25.5F, 8F, -22F);
		rightTrackModel[46].rotateAngleZ = -3.14159265F;

		rightTrackModel[47].addShapeBox(72F, 0F, 0F, 3, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 276
		rightTrackModel[47].setRotationPoint(25.5F, 8F, -22F);
		rightTrackModel[47].rotateAngleZ = -3.14159265F;

		rightTrackModel[48].addShapeBox(75F, 0F, 0F, 3, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 277
		rightTrackModel[48].setRotationPoint(25.5F, 8F, -22F);
		rightTrackModel[48].rotateAngleZ = -3.14159265F;

		rightTrackModel[49].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 279
		rightTrackModel[49].setRotationPoint(-52.5F, 8F, -22F);
		rightTrackModel[49].rotateAngleZ = -3.22885912F;

		rightTrackModel[50].addShapeBox(3F, 0F, 0F, 3, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 280
		rightTrackModel[50].setRotationPoint(-52.5F, 8F, -22F);
		rightTrackModel[50].rotateAngleZ = -3.22885912F;

		rightTrackModel[51].addShapeBox(6F, 0F, 0F, 3, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 281
		rightTrackModel[51].setRotationPoint(-52.5F, 8F, -22F);
		rightTrackModel[51].rotateAngleZ = -3.22885912F;

		rightTrackModel[52].addShapeBox(9F, 0F, 0F, 3, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 282
		rightTrackModel[52].setRotationPoint(-52.5F, 8F, -22F);
		rightTrackModel[52].rotateAngleZ = -3.22885912F;

		rightTrackModel[53].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 283
		rightTrackModel[53].setRotationPoint(-65F, 7F, -22F);
		rightTrackModel[53].rotateAngleZ = -3.89208423F;

		rightTrackModel[54].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 284
		rightTrackModel[54].setRotationPoint(-67.5F, 4.5F, -22F);
		rightTrackModel[54].rotateAngleZ = -4.34586984F;

		rightTrackModel[55].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 285
		rightTrackModel[55].setRotationPoint(-68.5F, 1.5F, -22F);
		rightTrackModel[55].rotateAngleZ = -4.59021593F;

		rightTrackModel[56].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 286
		rightTrackModel[56].setRotationPoint(-68.5F, -1.5F, -22F);
		rightTrackModel[56].rotateAngleZ = -4.78220215F;

		rightTrackModel[57].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 287
		rightTrackModel[57].setRotationPoint(-68F, -5F, -22F);
		rightTrackModel[57].rotateAngleZ = -5.32325422F;

		rightTrackModel[58].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 288
		rightTrackModel[58].setRotationPoint(-65.5F, -8F, -22F);
		rightTrackModel[58].rotateAngleZ = -6.0737458F;

		rightTrackModel[59].addShapeBox(3F, 0F, 0F, 3, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 289
		rightTrackModel[59].setRotationPoint(-65.5F, -8F, -22F);
		rightTrackModel[59].rotateAngleZ = -6.0737458F;

		rightTrackModel[60].addShapeBox(6F, 0F, 0F, 3, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 290
		rightTrackModel[60].setRotationPoint(-65.5F, -8F, -22F);
		rightTrackModel[60].rotateAngleZ = -6.0737458F;

		rightTrackModel[61].addShapeBox(9F, 0F, 0F, 3, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 291
		rightTrackModel[61].setRotationPoint(-65.5F, -8F, -22F);
		rightTrackModel[61].rotateAngleZ = -6.0737458F;

		rightTrackModel[62].addShapeBox(21F, 0F, 0F, 3, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 292
		rightTrackModel[62].setRotationPoint(-65.5F, -8F, -22F);
		rightTrackModel[62].rotateAngleZ = -6.0737458F;

		rightTrackModel[63].addShapeBox(18F, 0F, 0F, 3, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 293
		rightTrackModel[63].setRotationPoint(-65.5F, -8F, -22F);
		rightTrackModel[63].rotateAngleZ = -6.0737458F;

		rightTrackModel[64].addShapeBox(15F, 0F, 0F, 3, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 294
		rightTrackModel[64].setRotationPoint(-65.5F, -8F, -22F);
		rightTrackModel[64].rotateAngleZ = -6.0737458F;

		rightTrackModel[65].addShapeBox(12F, 0F, 0F, 3, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 295
		rightTrackModel[65].setRotationPoint(-65.5F, -8F, -22F);
		rightTrackModel[65].rotateAngleZ = -6.0737458F;

		rightTrackModel[66].addShapeBox(-12F, 0F, 0F, 3, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 296
		rightTrackModel[66].setRotationPoint(-5F, -13F, -22F);

		rightTrackModel[67].addShapeBox(-12F, 0F, 0F, 3, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 297
		rightTrackModel[67].setRotationPoint(-8F, -13F, -22F);

		rightTrackModel[68].addShapeBox(-12F, 0F, 0F, 3, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 298
		rightTrackModel[68].setRotationPoint(-11F, -13F, -22F);

		rightTrackModel[69].addShapeBox(-12F, 0F, 0F, 3, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 299
		rightTrackModel[69].setRotationPoint(-14F, -13F, -22F);

		rightTrackModel[70].addShapeBox(-24F, 0F, 0F, 3, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 300
		rightTrackModel[70].setRotationPoint(-5F, -13F, -22F);

		rightTrackModel[71].addShapeBox(-24F, 0F, 0F, 3, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 301
		rightTrackModel[71].setRotationPoint(-8F, -13F, -22F);

		rightTrackModel[72].addShapeBox(-24F, 0F, 0F, 3, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 302
		rightTrackModel[72].setRotationPoint(-11F, -13F, -22F);

		rightTrackModel[73].addShapeBox(-24F, 0F, 0F, 3, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 303
		rightTrackModel[73].setRotationPoint(-14F, -13F, -22F);

		rightTrackModel[74].addShapeBox(-27.5F, 0F, 0F, 3, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 304
		rightTrackModel[74].setRotationPoint(-14F, -13F, -22F);
	}
}