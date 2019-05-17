//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2019 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: PanzerI
// Model Creator: AobaKuma
// Created on: 21.06.2018 - 18:15:27
// Last changed on: 21.06.2018 - 18:15:27

package train.client.render.models; //Path where the model is located

import tmt.Coord2D;
import tmt.ModelConverter;
import tmt.ModelRendererTurbo;
import tmt.Shape2D;


public class ModelPanzerI extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelPanzerI() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[213];
		turretModel = new ModelRendererTurbo[28];
		barrelModel = new ModelRendererTurbo[6];
		leftTrackWheelModels = new ModelRendererTurbo[11];
		rightTrackWheelModels = new ModelRendererTurbo[11];
		trailerModel = new ModelRendererTurbo[3];

		initbodyModel_1();
		initturretModel_1();
		initbarrelModel_1();
		initleftTrackWheelModels_1();
		initrightTrackWheelModels_1();
		inittrailerModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 1
		bodyModel[2] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 2
		bodyModel[3] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 3
		bodyModel[4] = new ModelRendererTurbo(this, 249, 41, textureX, textureY); // Box 4
		bodyModel[5] = new ModelRendererTurbo(this, 321, 41, textureX, textureY); // Box 5
		bodyModel[6] = new ModelRendererTurbo(this, 417, 41, textureX, textureY); // Box 6
		bodyModel[7] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 7
		bodyModel[8] = new ModelRendererTurbo(this, 81, 49, textureX, textureY); // Box 8
		bodyModel[9] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 9
		bodyModel[10] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 10
		bodyModel[11] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 11
		bodyModel[12] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 12
		bodyModel[13] = new ModelRendererTurbo(this, 153, 81, textureX, textureY); // Box 13
		bodyModel[14] = new ModelRendererTurbo(this, 321, 81, textureX, textureY); // Box 14
		bodyModel[15] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 15
		bodyModel[16] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 16
		bodyModel[17] = new ModelRendererTurbo(this, 281, 9, textureX, textureY); // Box 17
		bodyModel[18] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 18
		bodyModel[19] = new ModelRendererTurbo(this, 449, 9, textureX, textureY); // Box 19
		bodyModel[20] = new ModelRendererTurbo(this, 473, 9, textureX, textureY); // Box 20
		bodyModel[21] = new ModelRendererTurbo(this, 121, 9, textureX, textureY); // Box 21
		bodyModel[22] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 22
		bodyModel[23] = new ModelRendererTurbo(this, 81, 17, textureX, textureY); // Box 26
		bodyModel[24] = new ModelRendererTurbo(this, 105, 17, textureX, textureY); // Box 29
		bodyModel[25] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 31
		bodyModel[26] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 67
		bodyModel[27] = new ModelRendererTurbo(this, 289, 41, textureX, textureY); // Box 68
		bodyModel[28] = new ModelRendererTurbo(this, 417, 41, textureX, textureY); // Box 69
		bodyModel[29] = new ModelRendererTurbo(this, 193, 49, textureX, textureY); // Box 70
		bodyModel[30] = new ModelRendererTurbo(this, 233, 49, textureX, textureY); // Box 71
		bodyModel[31] = new ModelRendererTurbo(this, 49, 49, textureX, textureY); // Box 72
		bodyModel[32] = new ModelRendererTurbo(this, 89, 49, textureX, textureY); // Box 73
		bodyModel[33] = new ModelRendererTurbo(this, 161, 49, textureX, textureY); // Box 74
		bodyModel[34] = new ModelRendererTurbo(this, 193, 57, textureX, textureY); // Box 75
		bodyModel[35] = new ModelRendererTurbo(this, 41, 81, textureX, textureY); // Box 76
		bodyModel[36] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 77
		bodyModel[37] = new ModelRendererTurbo(this, 449, 9, textureX, textureY); // Box 78
		bodyModel[38] = new ModelRendererTurbo(this, 465, 9, textureX, textureY); // Box 79
		bodyModel[39] = new ModelRendererTurbo(this, 473, 9, textureX, textureY); // Box 80
		bodyModel[40] = new ModelRendererTurbo(this, 465, 57, textureX, textureY); // Box 81
		bodyModel[41] = new ModelRendererTurbo(this, 345, 17, textureX, textureY); // Box 82
		bodyModel[42] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 83
		bodyModel[43] = new ModelRendererTurbo(this, 129, 65, textureX, textureY); // Box 84
		bodyModel[44] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 85
		bodyModel[45] = new ModelRendererTurbo(this, 81, 17, textureX, textureY); // Box 86
		bodyModel[46] = new ModelRendererTurbo(this, 417, 57, textureX, textureY); // Box 87
		bodyModel[47] = new ModelRendererTurbo(this, 489, 65, textureX, textureY); // Box 88
		bodyModel[48] = new ModelRendererTurbo(this, 209, 57, textureX, textureY); // Box 89
		bodyModel[49] = new ModelRendererTurbo(this, 497, 57, textureX, textureY); // Box 90
		bodyModel[50] = new ModelRendererTurbo(this, 89, 89, textureX, textureY); // Box 91
		bodyModel[51] = new ModelRendererTurbo(this, 97, 33, textureX, textureY); // Box 92
		bodyModel[52] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 93
		bodyModel[53] = new ModelRendererTurbo(this, 393, 41, textureX, textureY); // Box 94
		bodyModel[54] = new ModelRendererTurbo(this, 433, 41, textureX, textureY); // Box 95
		bodyModel[55] = new ModelRendererTurbo(this, 17, 49, textureX, textureY); // Box 96
		bodyModel[56] = new ModelRendererTurbo(this, 369, 17, textureX, textureY); // Box 97
		bodyModel[57] = new ModelRendererTurbo(this, 129, 25, textureX, textureY); // Box 98
		bodyModel[58] = new ModelRendererTurbo(this, 289, 25, textureX, textureY); // Box 99
		bodyModel[59] = new ModelRendererTurbo(this, 369, 25, textureX, textureY); // Box 100
		bodyModel[60] = new ModelRendererTurbo(this, 385, 25, textureX, textureY); // Box 101
		bodyModel[61] = new ModelRendererTurbo(this, 449, 25, textureX, textureY); // Box 102
		bodyModel[62] = new ModelRendererTurbo(this, 465, 25, textureX, textureY); // Box 103
		bodyModel[63] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 104
		bodyModel[64] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 105
		bodyModel[65] = new ModelRendererTurbo(this, 129, 49, textureX, textureY); // Box 106
		bodyModel[66] = new ModelRendererTurbo(this, 433, 49, textureX, textureY); // Box 107
		bodyModel[67] = new ModelRendererTurbo(this, 153, 49, textureX, textureY); // Box 108
		bodyModel[68] = new ModelRendererTurbo(this, 337, 57, textureX, textureY); // Box 109
		bodyModel[69] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 110
		bodyModel[70] = new ModelRendererTurbo(this, 393, 49, textureX, textureY); // Box 112
		bodyModel[71] = new ModelRendererTurbo(this, 17, 65, textureX, textureY); // Box 113
		bodyModel[72] = new ModelRendererTurbo(this, 497, 17, textureX, textureY); // Box 114
		bodyModel[73] = new ModelRendererTurbo(this, 497, 33, textureX, textureY); // Box 115
		bodyModel[74] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 116
		bodyModel[75] = new ModelRendererTurbo(this, 417, 73, textureX, textureY); // Box 117
		bodyModel[76] = new ModelRendererTurbo(this, 209, 73, textureX, textureY); // Box 118
		bodyModel[77] = new ModelRendererTurbo(this, 225, 73, textureX, textureY); // Box 119
		bodyModel[78] = new ModelRendererTurbo(this, 505, 65, textureX, textureY); // Box 120
		bodyModel[79] = new ModelRendererTurbo(this, 241, 73, textureX, textureY); // Box 121
		bodyModel[80] = new ModelRendererTurbo(this, 313, 81, textureX, textureY); // Box 122
		bodyModel[81] = new ModelRendererTurbo(this, 497, 81, textureX, textureY); // Box 123
		bodyModel[82] = new ModelRendererTurbo(this, 481, 73, textureX, textureY); // Box 124
		bodyModel[83] = new ModelRendererTurbo(this, 113, 89, textureX, textureY); // Box 125
		bodyModel[84] = new ModelRendererTurbo(this, 129, 89, textureX, textureY); // Box 126
		bodyModel[85] = new ModelRendererTurbo(this, 497, 89, textureX, textureY); // Box 127
		bodyModel[86] = new ModelRendererTurbo(this, 41, 81, textureX, textureY); // Box 128
		bodyModel[87] = new ModelRendererTurbo(this, 65, 97, textureX, textureY); // Box 129
		bodyModel[88] = new ModelRendererTurbo(this, 89, 89, textureX, textureY); // Box 131
		bodyModel[89] = new ModelRendererTurbo(this, 177, 97, textureX, textureY); // Box 132
		bodyModel[90] = new ModelRendererTurbo(this, 225, 97, textureX, textureY); // Box 135
		bodyModel[91] = new ModelRendererTurbo(this, 241, 97, textureX, textureY); // Box 136
		bodyModel[92] = new ModelRendererTurbo(this, 249, 65, textureX, textureY); // Box 137
		bodyModel[93] = new ModelRendererTurbo(this, 289, 41, textureX, textureY); // Box 138
		bodyModel[94] = new ModelRendererTurbo(this, 417, 41, textureX, textureY); // Box 139
		bodyModel[95] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 140
		bodyModel[96] = new ModelRendererTurbo(this, 233, 49, textureX, textureY); // Box 141
		bodyModel[97] = new ModelRendererTurbo(this, 49, 65, textureX, textureY); // Box 142
		bodyModel[98] = new ModelRendererTurbo(this, 465, 65, textureX, textureY); // Box 143
		bodyModel[99] = new ModelRendererTurbo(this, 129, 57, textureX, textureY); // Box 144
		bodyModel[100] = new ModelRendererTurbo(this, 57, 65, textureX, textureY); // Box 145
		bodyModel[101] = new ModelRendererTurbo(this, 89, 65, textureX, textureY); // Box 146
		bodyModel[102] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 147
		bodyModel[103] = new ModelRendererTurbo(this, 153, 57, textureX, textureY); // Box 148
		bodyModel[104] = new ModelRendererTurbo(this, 9, 65, textureX, textureY); // Box 149
		bodyModel[105] = new ModelRendererTurbo(this, 129, 73, textureX, textureY); // Box 150
		bodyModel[106] = new ModelRendererTurbo(this, 97, 65, textureX, textureY); // Box 151
		bodyModel[107] = new ModelRendererTurbo(this, 161, 65, textureX, textureY); // Box 152
		bodyModel[108] = new ModelRendererTurbo(this, 169, 65, textureX, textureY); // Box 153
		bodyModel[109] = new ModelRendererTurbo(this, 73, 81, textureX, textureY); // Box 154
		bodyModel[110] = new ModelRendererTurbo(this, 145, 89, textureX, textureY); // Box 155
		bodyModel[111] = new ModelRendererTurbo(this, 153, 81, textureX, textureY); // Box 156
		bodyModel[112] = new ModelRendererTurbo(this, 257, 97, textureX, textureY); // Box 157
		bodyModel[113] = new ModelRendererTurbo(this, 481, 81, textureX, textureY); // Box 158
		bodyModel[114] = new ModelRendererTurbo(this, 273, 97, textureX, textureY); // Box 159
		bodyModel[115] = new ModelRendererTurbo(this, 41, 89, textureX, textureY); // Box 160
		bodyModel[116] = new ModelRendererTurbo(this, 289, 97, textureX, textureY); // Box 161
		bodyModel[117] = new ModelRendererTurbo(this, 353, 97, textureX, textureY); // Box 162
		bodyModel[118] = new ModelRendererTurbo(this, 369, 97, textureX, textureY); // Box 163
		bodyModel[119] = new ModelRendererTurbo(this, 385, 97, textureX, textureY); // Box 164
		bodyModel[120] = new ModelRendererTurbo(this, 393, 97, textureX, textureY); // Box 165
		bodyModel[121] = new ModelRendererTurbo(this, 401, 97, textureX, textureY); // Box 166
		bodyModel[122] = new ModelRendererTurbo(this, 417, 97, textureX, textureY); // Box 167
		bodyModel[123] = new ModelRendererTurbo(this, 433, 97, textureX, textureY); // Box 168
		bodyModel[124] = new ModelRendererTurbo(this, 441, 97, textureX, textureY); // Box 169
		bodyModel[125] = new ModelRendererTurbo(this, 457, 97, textureX, textureY); // Box 170
		bodyModel[126] = new ModelRendererTurbo(this, 161, 105, textureX, textureY); // Box 171
		bodyModel[127] = new ModelRendererTurbo(this, 177, 105, textureX, textureY); // Box 172
		bodyModel[128] = new ModelRendererTurbo(this, 185, 105, textureX, textureY); // Box 173
		bodyModel[129] = new ModelRendererTurbo(this, 201, 105, textureX, textureY); // Box 174
		bodyModel[130] = new ModelRendererTurbo(this, 217, 105, textureX, textureY); // Box 175
		bodyModel[131] = new ModelRendererTurbo(this, 233, 105, textureX, textureY); // Box 176
		bodyModel[132] = new ModelRendererTurbo(this, 249, 105, textureX, textureY); // Box 177
		bodyModel[133] = new ModelRendererTurbo(this, 265, 105, textureX, textureY); // Box 178
		bodyModel[134] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 179
		bodyModel[135] = new ModelRendererTurbo(this, 73, 89, textureX, textureY); // Box 180
		bodyModel[136] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 181
		bodyModel[137] = new ModelRendererTurbo(this, 9, 97, textureX, textureY); // Box 182
		bodyModel[138] = new ModelRendererTurbo(this, 41, 97, textureX, textureY); // Box 183
		bodyModel[139] = new ModelRendererTurbo(this, 297, 105, textureX, textureY); // Box 184
		bodyModel[140] = new ModelRendererTurbo(this, 49, 97, textureX, textureY); // Box 185
		bodyModel[141] = new ModelRendererTurbo(this, 57, 97, textureX, textureY); // Box 186
		bodyModel[142] = new ModelRendererTurbo(this, 89, 97, textureX, textureY); // Box 187
		bodyModel[143] = new ModelRendererTurbo(this, 329, 105, textureX, textureY); // Box 188
		bodyModel[144] = new ModelRendererTurbo(this, 113, 97, textureX, textureY); // Box 189
		bodyModel[145] = new ModelRendererTurbo(this, 121, 97, textureX, textureY); // Box 190
		bodyModel[146] = new ModelRendererTurbo(this, 361, 105, textureX, textureY); // Box 191
		bodyModel[147] = new ModelRendererTurbo(this, 65, 105, textureX, textureY); // Box 192
		bodyModel[148] = new ModelRendererTurbo(this, 73, 105, textureX, textureY); // Box 193
		bodyModel[149] = new ModelRendererTurbo(this, 385, 105, textureX, textureY); // Box 194
		bodyModel[150] = new ModelRendererTurbo(this, 409, 105, textureX, textureY); // Box 195
		bodyModel[151] = new ModelRendererTurbo(this, 433, 105, textureX, textureY); // Box 196
		bodyModel[152] = new ModelRendererTurbo(this, 457, 105, textureX, textureY); // Box 197
		bodyModel[153] = new ModelRendererTurbo(this, 481, 105, textureX, textureY); // Box 219
		bodyModel[154] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Box 220
		bodyModel[155] = new ModelRendererTurbo(this, 25, 113, textureX, textureY); // Box 221
		bodyModel[156] = new ModelRendererTurbo(this, 49, 113, textureX, textureY); // Box 222
		bodyModel[157] = new ModelRendererTurbo(this, 105, 113, textureX, textureY); // Box 223
		bodyModel[158] = new ModelRendererTurbo(this, 129, 113, textureX, textureY); // Box 224
		bodyModel[159] = new ModelRendererTurbo(this, 153, 113, textureX, textureY); // Box 225
		bodyModel[160] = new ModelRendererTurbo(this, 177, 113, textureX, textureY); // Box 226
		bodyModel[161] = new ModelRendererTurbo(this, 201, 113, textureX, textureY); // Box 227
		bodyModel[162] = new ModelRendererTurbo(this, 217, 113, textureX, textureY); // Box 228
		bodyModel[163] = new ModelRendererTurbo(this, 505, 105, textureX, textureY); // Box 229
		bodyModel[164] = new ModelRendererTurbo(this, 233, 113, textureX, textureY); // Box 230
		bodyModel[165] = new ModelRendererTurbo(this, 401, 105, textureX, textureY); // Box 231
		bodyModel[166] = new ModelRendererTurbo(this, 425, 105, textureX, textureY); // Box 232
		bodyModel[167] = new ModelRendererTurbo(this, 449, 105, textureX, textureY); // Box 233
		bodyModel[168] = new ModelRendererTurbo(this, 473, 105, textureX, textureY); // Box 234
		bodyModel[169] = new ModelRendererTurbo(this, 497, 105, textureX, textureY); // Box 235
		bodyModel[170] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Box 236
		bodyModel[171] = new ModelRendererTurbo(this, 17, 113, textureX, textureY); // Box 237
		bodyModel[172] = new ModelRendererTurbo(this, 25, 113, textureX, textureY); // Box 238
		bodyModel[173] = new ModelRendererTurbo(this, 41, 113, textureX, textureY); // Box 239
		bodyModel[174] = new ModelRendererTurbo(this, 49, 113, textureX, textureY); // Box 240
		bodyModel[175] = new ModelRendererTurbo(this, 121, 113, textureX, textureY); // Box 241
		bodyModel[176] = new ModelRendererTurbo(this, 129, 113, textureX, textureY); // Box 242
		bodyModel[177] = new ModelRendererTurbo(this, 241, 113, textureX, textureY); // Box 243
		bodyModel[178] = new ModelRendererTurbo(this, 257, 113, textureX, textureY); // Box 244
		bodyModel[179] = new ModelRendererTurbo(this, 305, 113, textureX, textureY); // Box 245
		bodyModel[180] = new ModelRendererTurbo(this, 145, 113, textureX, textureY); // Box 246
		bodyModel[181] = new ModelRendererTurbo(this, 169, 113, textureX, textureY); // Box 247
		bodyModel[182] = new ModelRendererTurbo(this, 257, 113, textureX, textureY); // Box 248
		bodyModel[183] = new ModelRendererTurbo(this, 329, 113, textureX, textureY); // Box 249
		bodyModel[184] = new ModelRendererTurbo(this, 345, 113, textureX, textureY); // Box 250
		bodyModel[185] = new ModelRendererTurbo(this, 361, 113, textureX, textureY); // Box 251
		bodyModel[186] = new ModelRendererTurbo(this, 65, 121, textureX, textureY); // Box 252
		bodyModel[187] = new ModelRendererTurbo(this, 233, 121, textureX, textureY); // Box 253
		bodyModel[188] = new ModelRendererTurbo(this, 313, 121, textureX, textureY); // Box 254
		bodyModel[189] = new ModelRendererTurbo(this, 337, 121, textureX, textureY); // Box 255
		bodyModel[190] = new ModelRendererTurbo(this, 497, 113, textureX, textureY); // Box 256
		bodyModel[191] = new ModelRendererTurbo(this, 361, 121, textureX, textureY); // Box 257
		bodyModel[192] = new ModelRendererTurbo(this, 385, 121, textureX, textureY); // Box 258
		bodyModel[193] = new ModelRendererTurbo(this, 89, 121, textureX, textureY); // Box 259
		bodyModel[194] = new ModelRendererTurbo(this, 177, 113, textureX, textureY); // Box 260
		bodyModel[195] = new ModelRendererTurbo(this, 409, 121, textureX, textureY); // Box 261
		bodyModel[196] = new ModelRendererTurbo(this, 433, 121, textureX, textureY); // Box 262
		bodyModel[197] = new ModelRendererTurbo(this, 153, 113, textureX, textureY); // Box 263
		bodyModel[198] = new ModelRendererTurbo(this, 377, 113, textureX, textureY); // Box 265
		bodyModel[199] = new ModelRendererTurbo(this, 401, 113, textureX, textureY); // Box 266
		bodyModel[200] = new ModelRendererTurbo(this, 425, 113, textureX, textureY); // Box 267
		bodyModel[201] = new ModelRendererTurbo(this, 449, 113, textureX, textureY); // Box 268
		bodyModel[202] = new ModelRendererTurbo(this, 305, 113, textureX, textureY); // Box 269
		bodyModel[203] = new ModelRendererTurbo(this, 169, 65, textureX, textureY); // Box 266
		bodyModel[204] = new ModelRendererTurbo(this, 73, 81, textureX, textureY); // Box 267
		bodyModel[205] = new ModelRendererTurbo(this, 145, 89, textureX, textureY); // Box 268
		bodyModel[206] = new ModelRendererTurbo(this, 153, 81, textureX, textureY); // Box 269
		bodyModel[207] = new ModelRendererTurbo(this, 257, 97, textureX, textureY); // Box 270
		bodyModel[208] = new ModelRendererTurbo(this, 481, 81, textureX, textureY); // Box 271
		bodyModel[209] = new ModelRendererTurbo(this, 273, 97, textureX, textureY); // Box 272
		bodyModel[210] = new ModelRendererTurbo(this, 41, 89, textureX, textureY); // Box 273
		bodyModel[211] = new ModelRendererTurbo(this, 377, 9, textureX, textureY); // Box 274
		bodyModel[212] = new ModelRendererTurbo(this, 273, 97, textureX, textureY); // Box 278

		bodyModel[0].addShapeBox(0F, 0F, 0F, 16, 14, 28, 0F,0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[0].setRotationPoint(24F, -10F, -9.5F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 53, 14, 28, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[1].setRotationPoint(-29F, -10F, -9.5F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 14, 8, 28, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -5F, 0F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, -5F, 0F, 0F); // Box 2
		bodyModel[2].setRotationPoint(-43F, -10F, -9.5F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 22, 4, 28, 0F,0F, 0F, -0.75F, 0F, 1.5F, -0.75F, 0F, 1.5F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		bodyModel[3].setRotationPoint(-41F, -14F, -9.5F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 5, 8, 28, 0F,0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[4].setRotationPoint(-19F, -18F, -9.5F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 21, 8, 26, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		bodyModel[5].setRotationPoint(-14F, -18F, -8.5F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 9, 3, 28, 0F,0.5F, 0.5F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 3F); // Box 6
		bodyModel[6].setRotationPoint(15F, -13F, -9.5F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 8, 3, 28, 0F,0F, 0.5F, 4.75F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0.5F, 4.75F, 0F, 0F, 6F, -0.5F, 0F, 3F, -0.5F, 0F, 3F, 0F, 0F, 6F); // Box 7
		bodyModel[7].setRotationPoint(7F, -13F, -9.5F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 8, 4, 28, 0F,0F, 0F, 2.5F, -2F, 0F, -0.5F, -2F, 0F, -0.5F, 0F, 0F, 2.5F, 0F, 0.5F, 4.75F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0.5F, 4.75F); // Box 8
		bodyModel[8].setRotationPoint(7F, -18F, -9.5F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 7, 8, 4, 0F,0F, 0F, -4F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 0F, 2F, 0F, 0F); // Box 9
		bodyModel[9].setRotationPoint(-14F, -18F, -12.5F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 14, 8, 4, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 10
		bodyModel[10].setRotationPoint(-7F, -18F, -12.5F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 7, 8, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -4F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 2F, 0F, -3F); // Box 11
		bodyModel[11].setRotationPoint(-14F, -18F, 17.5F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 14, 8, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F); // Box 12
		bodyModel[12].setRotationPoint(-7F, -18F, 17.5F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 76, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[13].setRotationPoint(-38F, -10F, -16.5F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 76, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		bodyModel[14].setRotationPoint(-38F, -10F, 18.5F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 4, 1, 6, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		bodyModel[15].setRotationPoint(-42F, -10F, -15.5F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 4, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 16
		bodyModel[16].setRotationPoint(-42F, -10F, 18.5F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 3, 1, 7, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		bodyModel[17].setRotationPoint(-47F, -3F, -16.5F);
		bodyModel[17].rotateAngleZ = 0.9424778F;

		bodyModel[18].addShapeBox(3F, 0F, 0F, 1, 1, 7, 0F,0F, 0F, 0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 18
		bodyModel[18].setRotationPoint(-47F, -3F, -16.5F);
		bodyModel[18].rotateAngleZ = 0.9424778F;

		bodyModel[19].addShapeBox(4.5F, 0F, 0F, 4, 1, 7, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 19
		bodyModel[19].setRotationPoint(-47F, -3F, -16.5F);
		bodyModel[19].rotateAngleZ = 0.9424778F;

		bodyModel[20].addShapeBox(0F, 0F, 0F, 3, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 20
		bodyModel[20].setRotationPoint(-47F, -3F, 18.5F);
		bodyModel[20].rotateAngleZ = 0.9424778F;

		bodyModel[21].addShapeBox(3F, 0F, 0F, 1, 1, 7, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0F, 0F, 0.5F); // Box 21
		bodyModel[21].setRotationPoint(-47F, -3F, 18.5F);
		bodyModel[21].rotateAngleZ = 0.9424778F;

		bodyModel[22].addShapeBox(4.5F, 0F, 0F, 4, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 22
		bodyModel[22].setRotationPoint(-47F, -3F, 18.5F);
		bodyModel[22].rotateAngleZ = 0.9424778F;

		bodyModel[23].addShapeBox(0F, 0F, 0F, 4, 1, 7, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[23].setRotationPoint(38F, -10F, -16.5F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 4, 1, 7, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 29
		bodyModel[24].setRotationPoint(38F, -10F, 18.5F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, 0F, 0F); // Box 31
		bodyModel[25].setRotationPoint(42F, -9F, 18.5F);

		bodyModel[26].addShapeBox(0F, 0.5F, 0F, 1, 3, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 67
		bodyModel[26].setRotationPoint(13F, -17F, 8.5F);
		bodyModel[26].rotateAngleZ = 0.34906585F;

		bodyModel[27].addShapeBox(0F, 0.5F, 0.5F, 1, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 68
		bodyModel[27].setRotationPoint(13F, -17F, 17.5F);
		bodyModel[27].rotateAngleY = 1.06465084F;
		bodyModel[27].rotateAngleZ = 0.27925268F;

		bodyModel[28].addShapeBox(-0.5F, 0.5F, -6.5F, 1, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 69
		bodyModel[28].setRotationPoint(13F, -17F, -9.5F);
		bodyModel[28].rotateAngleY = -1.06465084F;
		bodyModel[28].rotateAngleZ = 0.27925268F;

		bodyModel[29].addShapeBox(0F, 0F, -0.5F, 13, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 70
		bodyModel[29].setRotationPoint(-6.5F, -12F, 23.5F);
		bodyModel[29].rotateAngleX = 0.41887902F;

		bodyModel[30].addShapeBox(0F, -7F, -0.5F, 13, 7, 6, 0F,0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, -2.25F, -0.5F, 0F, -2.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 71
		bodyModel[30].setRotationPoint(-6.5F, -12F, 18.5F);
		bodyModel[30].rotateAngleX = 0.41887902F;

		bodyModel[31].addShapeBox(0F, 0F, 0F, 3, 9, 4, 0F,0F, 0F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, 0F, 0F, 2F, 5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 5F, 0F, 2F); // Box 72
		bodyModel[31].setRotationPoint(40F, -5F, -9.5F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 2, 7, 4, 0F,0F, 0F, 0F, -2F, -3F, 0F, -2F, -3F, -1F, 0F, 0F, 0F, 4F, 0F, 0F, -3F, -2F, 0F, -3F, -2F, -1F, 4F, 0F, 0F); // Box 73
		bodyModel[32].setRotationPoint(42F, -3F, -9.5F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 3, 9, 4, 0F,0F, 0F, 2F, -1F, -2F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 5F, 0F, 2F, -5F, 0F, 0F, -5F, 0F, 0F, 5F, 0F, 0F); // Box 74
		bodyModel[33].setRotationPoint(40F, -5F, 14.5F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 2, 7, 4, 0F,0F, 0F, 0F, -2F, -3F, -1F, -2F, -3F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, -3F, -2F, -1F, -3F, -2F, 0F, 4F, 0F, 0F); // Box 75
		bodyModel[34].setRotationPoint(42F, -3F, 14.5F);

		bodyModel[35].addFlexTrapezoid(-3.25F, 0F, 0F, 6, 1, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, ModelRendererTurbo.MR_TOP); // Box 76
		bodyModel[35].setRotationPoint(35F, -7F, -1.5F);
		bodyModel[35].rotateAngleZ = -0.29670597F;

		bodyModel[36].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 77
		bodyModel[36].setRotationPoint(40F, -6F, 10.5F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 78
		bodyModel[37].setRotationPoint(39F, -7F, 10.5F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 79
		bodyModel[38].setRotationPoint(40F, -6F, -2.5F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 80
		bodyModel[39].setRotationPoint(39F, -7F, -2.5F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 13, 5, 1, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -5F, 0F, 0F, -1F, 0F, 0F, -1F, -0.75F, 0F, -5F, -0.75F); // Box 81
		bodyModel[40].setRotationPoint(27F, -9F, -9.5F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 3, 5, 1, 0F,2F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, -0.75F, 2F, 0F, -0.75F, 0F, -1F, 0F, -1F, 1F, 0F, -1F, 1F, -0.75F, 0F, -1F, -0.75F); // Box 82
		bodyModel[41].setRotationPoint(40F, -9F, -9.5F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 1F, -0.75F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 83
		bodyModel[42].setRotationPoint(42F, -7F, -9.5F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 13, 5, 1, 0F,0F, 0F, -0.75F, -2F, 0F, -0.75F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, -0.75F, 0F, -1F, -0.75F, 0F, -1F, 0F, 0F, -5F, 0F); // Box 84
		bodyModel[43].setRotationPoint(27F, -9F, 17.5F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 3, 5, 1, 0F,2F, 0F, -0.75F, -1F, -1F, -0.75F, -1F, -1F, 0F, 2F, 0F, 0F, 0F, -1F, -0.75F, -1F, 1F, -0.75F, -1F, 1F, 0F, 0F, -1F, 0F); // Box 85
		bodyModel[44].setRotationPoint(40F, -9F, 17.5F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 1F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, -0.75F, -1F, 0F, -0.75F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 86
		bodyModel[45].setRotationPoint(42F, -7F, 17.5F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 6, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 87
		bodyModel[46].setRotationPoint(-23F, -12F, 19.5F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 2, 5, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 88
		bodyModel[47].setRotationPoint(-43F, -13F, 8.5F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 5, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 89
		bodyModel[48].setRotationPoint(-43.5F, -12.5F, 9.5F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 5, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 90
		bodyModel[49].setRotationPoint(-43.5F, -12.5F, 14.5F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 3, 5, 12, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 91
		bodyModel[50].setRotationPoint(-44F, -14F, -8.75F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 1, 2, 12, 0F,-0.5F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -0.5F, 0F, 0F); // Box 92
		bodyModel[51].setRotationPoint(-45F, -13F, -8.75F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -0.5F, 0F, 0F); // Box 93
		bodyModel[52].setRotationPoint(-45F, -13F, 3.75F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 3, 5, 2, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 94
		bodyModel[53].setRotationPoint(-44F, -14F, 3.75F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.5F, 0F, 0F, 0.5F, 0F, 1F, 0F, -0.5F, -1.5F, -1F, -0.5F, -0.5F, 0F, 0F, 0F, 1F, 0F, 1F, 0.5F, -0.5F, -1.5F, -0.5F, -0.5F); // Box 95
		bodyModel[54].setRotationPoint(-45F, -13F, 5.75F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 3, 5, 2, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, -1F, -1F, -0.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, -1F, -1.5F, -0.5F); // Box 96
		bodyModel[55].setRotationPoint(-44F, -14F, 5.75F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 97
		bodyModel[56].setRotationPoint(-44F, -12.5F, -9.75F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 98
		bodyModel[57].setRotationPoint(-44F, -11.5F, -9.75F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 99
		bodyModel[58].setRotationPoint(-44F, -13.5F, -9.75F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 100
		bodyModel[59].setRotationPoint(-44F, -13.5F, 3.25F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 101
		bodyModel[60].setRotationPoint(-44F, -12.5F, 3.25F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 102
		bodyModel[61].setRotationPoint(-44F, -11.5F, 3.25F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 103
		bodyModel[62].setRotationPoint(-43F, -12.5F, -11.75F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F); // Box 104
		bodyModel[63].setRotationPoint(-43F, -12.5F, -12.75F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 105
		bodyModel[64].setRotationPoint(37F, -12.5F, -14F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.25F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, -0.25F); // Box 106
		bodyModel[65].setRotationPoint(36F, -12.5F, -14F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 107
		bodyModel[66].setRotationPoint(36.5F, -11F, -14.5F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 108
		bodyModel[67].setRotationPoint(37F, -12.5F, 21F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.25F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, -0.25F); // Box 109
		bodyModel[68].setRotationPoint(36F, -12.5F, 21F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 110
		bodyModel[69].setRotationPoint(36.5F, -11F, 20.5F);

		bodyModel[70].addShapeBox(0F, 0F, -0.5F, 1, 1, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 112
		bodyModel[70].setRotationPoint(-4.5F, -19F, 14.5F);

		bodyModel[71].addShapeBox(0F, 0F, -0.5F, 1, 1, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 113
		bodyModel[71].setRotationPoint(3.5F, -19F, 14.5F);

		bodyModel[72].addShapeBox(0F, 0F, -0.5F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, 0.25F, 0F, -0.75F, 0.25F); // Box 114
		bodyModel[72].setRotationPoint(3.5F, -15F, 22.5F);

		bodyModel[73].addShapeBox(0F, 0F, -0.5F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, 0.25F, 0F, -0.75F, 0.25F); // Box 115
		bodyModel[73].setRotationPoint(-4.5F, -15F, 22.5F);

		bodyModel[74].addShapeBox(-1F, 0.5F, 0.5F, 1, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 116
		bodyModel[74].setRotationPoint(-13F, -17F, 17.5F);
		bodyModel[74].rotateAngleY = -1.06465084F;
		bodyModel[74].rotateAngleZ = -0.27925268F;

		bodyModel[75].addShapeBox(0F, 0F, 0F, 29, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 117
		bodyModel[75].setRotationPoint(-21.5F, 1.5F, 25.5F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 118
		bodyModel[76].setRotationPoint(-24.5F, 1.5F, 23F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 119
		bodyModel[77].setRotationPoint(-19.5F, 1.5F, 23F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 120
		bodyModel[78].setRotationPoint(-20.5F, 0.5F, 23F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 121
		bodyModel[79].setRotationPoint(-20.5F, 0.5F, 19F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 122
		bodyModel[80].setRotationPoint(-24.5F, 1.5F, 19F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 123
		bodyModel[81].setRotationPoint(-19.5F, 1.5F, 19F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 124
		bodyModel[82].setRotationPoint(5.5F, 0.5F, 19F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 125
		bodyModel[83].setRotationPoint(1.5F, 1.5F, 19F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 126
		bodyModel[84].setRotationPoint(6.5F, 1.5F, 19F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 127
		bodyModel[85].setRotationPoint(6.5F, 1.5F, 23F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[86].setRotationPoint(5.5F, 0.5F, 23F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 129
		bodyModel[87].setRotationPoint(1.5F, 1.5F, 23F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F); // Box 131
		bodyModel[88].setRotationPoint(10.5F, 1.5F, 24F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F); // Box 132
		bodyModel[89].setRotationPoint(10.5F, 1.5F, 19F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F); // Box 135
		bodyModel[90].setRotationPoint(-28.5F, 1.5F, 24F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F); // Box 136
		bodyModel[91].setRotationPoint(-28.5F, 1.5F, 19F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 12, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 137
		bodyModel[92].setRotationPoint(-24.5F, 3.5F, 24F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0.25F, 0.25F, -0.5F, 0.25F, 0.25F, -0.5F, 0.25F, 0.25F, 0F, 0.25F, 0.25F); // Box 138
		bodyModel[93].setRotationPoint(-24.5F, 3.5F, 24F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 139
		bodyModel[94].setRotationPoint(-21.5F, 3.5F, 24F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0.5F, 0.25F, -0.5F, 0.5F, 0.25F, -0.5F, 0.5F, 0.25F, 0F, 0.5F, 0.25F); // Box 140
		bodyModel[95].setRotationPoint(-17.5F, 3.5F, 24F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 141
		bodyModel[96].setRotationPoint(-21.5F, 3.5F, 19F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0.25F, 0.25F, -0.5F, 0.25F, 0.25F, -0.5F, 0.25F, 0.25F, 0F, 0.25F, 0.25F); // Box 142
		bodyModel[97].setRotationPoint(-24.5F, 3.5F, 19F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 12, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 143
		bodyModel[98].setRotationPoint(-24.5F, 3.5F, 19F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0.5F, 0.25F, -0.5F, 0.5F, 0.25F, -0.5F, 0.5F, 0.25F, 0F, 0.5F, 0.25F); // Box 144
		bodyModel[99].setRotationPoint(-17.5F, 3.5F, 19F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F); // Box 145
		bodyModel[100].setRotationPoint(2.5F, 3.5F, 24F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, -0.5F, 0.25F, 0.25F); // Box 146
		bodyModel[101].setRotationPoint(6.5F, 3.5F, 24F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 12, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 147
		bodyModel[102].setRotationPoint(-1.5F, 3.5F, 24F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, -0.5F, 0.5F, 0.25F); // Box 148
		bodyModel[103].setRotationPoint(-0.5F, 3.5F, 24F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, -0.5F, 0.5F, 0.25F); // Box 149
		bodyModel[104].setRotationPoint(-0.5F, 3.5F, 19F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 12, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 150
		bodyModel[105].setRotationPoint(-1.5F, 3.5F, 19F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F); // Box 151
		bodyModel[106].setRotationPoint(2.5F, 3.5F, 19F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, -0.5F, 0.25F, 0.25F); // Box 152
		bodyModel[107].setRotationPoint(6.5F, 3.5F, 19F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 153
		bodyModel[108].setRotationPoint(-20F, -5.5F, 18F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 154
		bodyModel[109].setRotationPoint(-20F, -5.5F, 19F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 155
		bodyModel[110].setRotationPoint(-8.5F, -5.5F, 19F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 156
		bodyModel[111].setRotationPoint(-8.5F, -5.5F, 18F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 157
		bodyModel[112].setRotationPoint(4.5F, -5.5F, 19F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 158
		bodyModel[113].setRotationPoint(4.5F, -5.5F, 18F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 159
		bodyModel[114].setRotationPoint(18F, -5.5F, 19F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 160
		bodyModel[115].setRotationPoint(18F, -5.5F, 18F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 29, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 161
		bodyModel[116].setRotationPoint(-21.5F, 1.5F, -17.5F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 162
		bodyModel[117].setRotationPoint(-24.5F, 1.5F, -16F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 163
		bodyModel[118].setRotationPoint(-19.5F, 1.5F, -16F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 164
		bodyModel[119].setRotationPoint(-20.5F, 0.5F, -16F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 165
		bodyModel[120].setRotationPoint(-20.5F, 0.5F, -12F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 166
		bodyModel[121].setRotationPoint(-24.5F, 1.5F, -12F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 167
		bodyModel[122].setRotationPoint(-19.5F, 1.5F, -12F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[123].setRotationPoint(5.5F, 0.5F, -12F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 169
		bodyModel[124].setRotationPoint(1.5F, 1.5F, -12F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 170
		bodyModel[125].setRotationPoint(6.5F, 1.5F, -12F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 171
		bodyModel[126].setRotationPoint(6.5F, 1.5F, -16F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 172
		bodyModel[127].setRotationPoint(5.5F, 0.5F, -16F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 173
		bodyModel[128].setRotationPoint(1.5F, 1.5F, -16F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F); // Box 174
		bodyModel[129].setRotationPoint(10.5F, 1.5F, -16F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F); // Box 175
		bodyModel[130].setRotationPoint(10.5F, 1.5F, -11F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F); // Box 176
		bodyModel[131].setRotationPoint(-28.5F, 1.5F, -16F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F); // Box 177
		bodyModel[132].setRotationPoint(-28.5F, 1.5F, -11F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 12, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 178
		bodyModel[133].setRotationPoint(-24.5F, 3.5F, -16F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0.25F, 0.25F, -0.5F, 0.25F, 0.25F, -0.5F, 0.25F, 0.25F, 0F, 0.25F, 0.25F); // Box 179
		bodyModel[134].setRotationPoint(-24.5F, 3.5F, -16F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 180
		bodyModel[135].setRotationPoint(-21.5F, 3.5F, -16F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0.5F, 0.25F, -0.5F, 0.5F, 0.25F, -0.5F, 0.5F, 0.25F, 0F, 0.5F, 0.25F); // Box 181
		bodyModel[136].setRotationPoint(-17.5F, 3.5F, -16F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 182
		bodyModel[137].setRotationPoint(-21.5F, 3.5F, -11F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0.25F, 0.25F, -0.5F, 0.25F, 0.25F, -0.5F, 0.25F, 0.25F, 0F, 0.25F, 0.25F); // Box 183
		bodyModel[138].setRotationPoint(-24.5F, 3.5F, -11F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 12, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 184
		bodyModel[139].setRotationPoint(-24.5F, 3.5F, -11F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0.5F, 0.25F, -0.5F, 0.5F, 0.25F, -0.5F, 0.5F, 0.25F, 0F, 0.5F, 0.25F); // Box 185
		bodyModel[140].setRotationPoint(-17.5F, 3.5F, -11F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F); // Box 186
		bodyModel[141].setRotationPoint(2.5F, 3.5F, -16F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, -0.5F, 0.25F, 0.25F); // Box 187
		bodyModel[142].setRotationPoint(6.5F, 3.5F, -16F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 12, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 188
		bodyModel[143].setRotationPoint(-1.5F, 3.5F, -16F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, -0.5F, 0.5F, 0.25F); // Box 189
		bodyModel[144].setRotationPoint(-0.5F, 3.5F, -16F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, -0.5F, 0.5F, 0.25F); // Box 190
		bodyModel[145].setRotationPoint(-0.5F, 3.5F, -11F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 12, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 191
		bodyModel[146].setRotationPoint(-1.5F, 3.5F, -11F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F); // Box 192
		bodyModel[147].setRotationPoint(2.5F, 3.5F, -11F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, -0.5F, 0.25F, 0.25F); // Box 193
		bodyModel[148].setRotationPoint(6.5F, 3.5F, -11F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 194
		bodyModel[149].setRotationPoint(-20.5F, 2F, 18.5F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 195
		bodyModel[150].setRotationPoint(5.5F, 2F, 18.5F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 196
		bodyModel[151].setRotationPoint(-20.5F, 2F, -16.5F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 197
		bodyModel[152].setRotationPoint(5.5F, 2F, -16.5F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 219
		bodyModel[153].setRotationPoint(12.5F, 4F, 18.5F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 220
		bodyModel[154].setRotationPoint(12.5F, 4F, -16.5F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 221
		bodyModel[155].setRotationPoint(-27.5F, 4F, 18.5F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 222
		bodyModel[156].setRotationPoint(-27.5F, 4F, -16.5F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 223
		bodyModel[157].setRotationPoint(-13.5F, 3F, 18.5F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 224
		bodyModel[158].setRotationPoint(-13.5F, 3F, -16.5F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 225
		bodyModel[159].setRotationPoint(-1.5F, 3F, 18.5F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 226
		bodyModel[160].setRotationPoint(-1.5F, 3F, -16.5F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 2, 7, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 227
		bodyModel[161].setRotationPoint(21.5F, -4F, 18.5F);
		bodyModel[161].rotateAngleZ = 0.31415927F;

		bodyModel[162].addShapeBox(0F, 0F, 0F, 2, 7, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 228
		bodyModel[162].setRotationPoint(21.5F, -4F, -11.5F);
		bodyModel[162].rotateAngleZ = 0.31415927F;

		bodyModel[163].addShapeBox(-2F, 2F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 229
		bodyModel[163].setRotationPoint(21.5F, -4F, -11.5F);
		bodyModel[163].rotateAngleZ = 0.31415927F;

		bodyModel[164].addShapeBox(-2F, 2F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 230
		bodyModel[164].setRotationPoint(21.5F, -4F, 19.5F);
		bodyModel[164].rotateAngleZ = 0.31415927F;

		bodyModel[165].addShapeBox(-5F, 1F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 231
		bodyModel[165].setRotationPoint(21.5F, -4F, 19.5F);
		bodyModel[165].rotateAngleZ = 0.31415927F;

		bodyModel[166].addShapeBox(-5F, 1F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 232
		bodyModel[166].setRotationPoint(21.5F, -4F, -11.5F);
		bodyModel[166].rotateAngleZ = 0.31415927F;

		bodyModel[167].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 233
		bodyModel[167].setRotationPoint(15.5F, -2F, -10.5F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 234
		bodyModel[168].setRotationPoint(15.5F, -2F, 18.5F);

		bodyModel[169].addShapeBox(3F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 235
		bodyModel[169].setRotationPoint(-32F, -15F, -5.5F);
		bodyModel[169].rotateAngleZ = 0.08726646F;

		bodyModel[170].addShapeBox(6.5F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 236
		bodyModel[170].setRotationPoint(-32F, -15F, -5.5F);
		bodyModel[170].rotateAngleZ = 0.08726646F;

		bodyModel[171].addShapeBox(8.5F, 0F, 1F, 1, 1, 1, 0F,0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.75F, 0F, 0F, 0.75F); // Box 237
		bodyModel[171].setRotationPoint(-32F, -15F, -5.5F);
		bodyModel[171].rotateAngleZ = 0.08726646F;

		bodyModel[172].addShapeBox(0F, 0F, 1F, 1, 1, 1, 0F,0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.75F, 0F, 0F, 0.75F); // Box 238
		bodyModel[172].setRotationPoint(-32F, -15F, -5.5F);
		bodyModel[172].rotateAngleZ = 0.08726646F;

		bodyModel[173].addShapeBox(0F, 0F, 12F, 1, 1, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 239
		bodyModel[173].setRotationPoint(-32F, -15F, -5.5F);
		bodyModel[173].rotateAngleZ = 0.08726646F;

		bodyModel[174].addShapeBox(8.5F, 0F, 12F, 1, 1, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 240
		bodyModel[174].setRotationPoint(-32F, -15F, -5.5F);
		bodyModel[174].rotateAngleZ = 0.08726646F;

		bodyModel[175].addShapeBox(-5.5F, 0F, 13F, 1, 1, 1, 0F,0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.75F, 0F, 0F, 0.75F); // Box 241
		bodyModel[175].setRotationPoint(-32F, -15F, -5.5F);
		bodyModel[175].rotateAngleZ = 0.08726646F;

		bodyModel[176].addShapeBox(-2F, 0F, 13F, 1, 1, 1, 0F,0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.75F, 0F, 0F, 0.75F); // Box 242
		bodyModel[176].setRotationPoint(-32F, -15F, -5.5F);
		bodyModel[176].rotateAngleZ = 0.08726646F;

		bodyModel[177].addShapeBox(-0.75F, 0F, -3F, 6, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 243
		bodyModel[177].setRotationPoint(-29F, -15F, -5.5F);
		bodyModel[177].rotateAngleZ = 0.06981317F;

		bodyModel[178].addShapeBox(-5.75F, 0F, 2F, 15, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 244
		bodyModel[178].setRotationPoint(-29F, -15F, -5.5F);
		bodyModel[178].rotateAngleZ = 0.06981317F;

		bodyModel[179].addShapeBox(-9.75F, 0F, 14F, 7, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 245
		bodyModel[179].setRotationPoint(-29F, -15F, -5.5F);
		bodyModel[179].rotateAngleZ = 0.06981317F;

		bodyModel[180].addShapeBox(7.5F, 0F, 19F, 1, 1, 1, 0F,-0.25F, 0.25F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.25F, 0.25F, 0F, 0.5F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.5F, 0F, 0F); // Box 246
		bodyModel[180].setRotationPoint(-32F, -15F, -5.5F);
		bodyModel[180].rotateAngleZ = 0.08726646F;

		bodyModel[181].addShapeBox(5.25F, 0F, 19F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 247
		bodyModel[181].setRotationPoint(-29F, -15F, -5.5F);
		bodyModel[181].rotateAngleZ = 0.06981317F;

		bodyModel[182].addShapeBox(5.25F, 0F, 20F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 248
		bodyModel[182].setRotationPoint(-29F, -15F, -5.5F);
		bodyModel[182].rotateAngleZ = 0.06981317F;

		bodyModel[183].addShapeBox(5.25F, 0F, 18F, 3, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 249
		bodyModel[183].setRotationPoint(-29F, -15F, -5.5F);
		bodyModel[183].rotateAngleZ = 0.06981317F;

		bodyModel[184].addShapeBox(0F, 0F, 0F, 5, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 250
		bodyModel[184].setRotationPoint(-43F, -9F, -9.5F);

		bodyModel[185].addShapeBox(0F, 0F, 0F, 5, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 251
		bodyModel[185].setRotationPoint(-43F, -9F, 17.5F);

		bodyModel[186].addShapeBox(0F, 0F, 0F, 9, 5, 1, 0F,0F, 0F, 0F, 2.5F, 0F, 0F, 2.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 2.5F, 2F, 0F, 2.5F, 2F, 0F, -0.5F, 0F, 0F); // Box 252
		bodyModel[186].setRotationPoint(-41F, -3F, 17.5F);

		bodyModel[187].addShapeBox(0F, 0F, 0F, 9, 5, 1, 0F,0F, 0F, 0F, 2.5F, 0F, 0F, 2.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 2.5F, 2F, 0F, 2.5F, 2F, 0F, -0.5F, 0F, 0F); // Box 253
		bodyModel[187].setRotationPoint(-41F, -3F, -9.5F);

		bodyModel[188].addShapeBox(0F, 0F, 0F, 8, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 254
		bodyModel[188].setRotationPoint(-40.5F, 0F, -8.5F);

		bodyModel[189].addShapeBox(0F, 0F, 0F, 8, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 255
		bodyModel[189].setRotationPoint(-40.5F, 1F, -8.5F);

		bodyModel[190].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,-1F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F); // Box 256
		bodyModel[190].setRotationPoint(-40.5F, -1F, -8.5F);

		bodyModel[191].addShapeBox(0F, 0F, 0F, 8, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 257
		bodyModel[191].setRotationPoint(-40.5F, 0F, 14.5F);

		bodyModel[192].addShapeBox(0F, 0F, 0F, 8, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 258
		bodyModel[192].setRotationPoint(-40.5F, 1F, 14.5F);

		bodyModel[193].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,-1F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F); // Box 259
		bodyModel[193].setRotationPoint(-40.5F, -1F, 14.5F);

		bodyModel[194].addShapeBox(0F, 0F, 0F, 1, 1, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 260
		bodyModel[194].setRotationPoint(-37.5F, 0F, -5.5F);

		bodyModel[195].addShapeBox(0F, 0F, 0F, 5, 1, 6, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 261
		bodyModel[195].setRotationPoint(-40.5F, -1F, 1.5F);

		bodyModel[196].addShapeBox(0F, 0F, 0F, 5, 1, 6, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 262
		bodyModel[196].setRotationPoint(-40.5F, -3F, 1.5F);

		bodyModel[197].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 263
		bodyModel[197].setRotationPoint(-40F, -2F, 4F);

		bodyModel[198].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 265
		bodyModel[198].setRotationPoint(-40.5F, 0F, -12.5F);

		bodyModel[199].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 266
		bodyModel[199].setRotationPoint(-40.5F, 0F, 18.5F);

		bodyModel[200].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 267
		bodyModel[200].setRotationPoint(35F, -9F, -8.5F);

		bodyModel[201].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.25F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, -0.25F); // Box 268
		bodyModel[201].setRotationPoint(34F, -9F, -8.5F);

		bodyModel[202].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 269
		bodyModel[202].setRotationPoint(34.5F, -9.5F, -9F);

		bodyModel[203].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 266
		bodyModel[203].setRotationPoint(-20F, -5.5F, -10F);

		bodyModel[204].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,-0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 267
		bodyModel[204].setRotationPoint(-20F, -5.5F, -12F);

		bodyModel[205].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,-0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 268
		bodyModel[205].setRotationPoint(-8.5F, -5.5F, -12F);

		bodyModel[206].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 269
		bodyModel[206].setRotationPoint(-8.5F, -5.5F, -10F);

		bodyModel[207].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,-0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 270
		bodyModel[207].setRotationPoint(4.5F, -5.5F, -12F);

		bodyModel[208].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 271
		bodyModel[208].setRotationPoint(4.5F, -5.5F, -10F);

		bodyModel[209].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,-0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 272
		bodyModel[209].setRotationPoint(18F, -5.5F, -12F);

		bodyModel[210].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 273
		bodyModel[210].setRotationPoint(18F, -5.5F, -10F);

		bodyModel[211].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, 0F, 0F); // Box 274
		bodyModel[211].setRotationPoint(42F, -9F, -16.5F);

		bodyModel[212].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,-0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 278
		bodyModel[212].setRotationPoint(27.5F, 9.5F, 22F);
	}

	private void initturretModel_1()
	{
		turretModel[0] = new ModelRendererTurbo(this, 465, 25, textureX, textureY); // Box 32
		turretModel[1] = new ModelRendererTurbo(this, 289, 41, textureX, textureY); // Box 33
		turretModel[2] = new ModelRendererTurbo(this, 393, 41, textureX, textureY); // Box 34
		turretModel[3] = new ModelRendererTurbo(this, 321, 41, textureX, textureY); // Box 35
		turretModel[4] = new ModelRendererTurbo(this, 161, 49, textureX, textureY); // Box 36
		turretModel[5] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 37
		turretModel[6] = new ModelRendererTurbo(this, 49, 49, textureX, textureY); // Box 38
		turretModel[7] = new ModelRendererTurbo(this, 65, 89, textureX, textureY); // Box 39
		turretModel[8] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 40
		turretModel[9] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 41
		turretModel[10] = new ModelRendererTurbo(this, 265, 17, textureX, textureY); // Box 49
		turretModel[11] = new ModelRendererTurbo(this, 465, 9, textureX, textureY); // Box 50
		turretModel[12] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 51
		turretModel[13] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 52
		turretModel[14] = new ModelRendererTurbo(this, 297, 9, textureX, textureY); // Box 53
		turretModel[15] = new ModelRendererTurbo(this, 97, 17, textureX, textureY); // Box 54
		turretModel[16] = new ModelRendererTurbo(this, 345, 17, textureX, textureY); // Box 55
		turretModel[17] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 56
		turretModel[18] = new ModelRendererTurbo(this, 353, 25, textureX, textureY); // Box 57
		turretModel[19] = new ModelRendererTurbo(this, 129, 49, textureX, textureY); // Box 58
		turretModel[20] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 59
		turretModel[21] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 60
		turretModel[22] = new ModelRendererTurbo(this, 497, 17, textureX, textureY); // Box 61
		turretModel[23] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 62
		turretModel[24] = new ModelRendererTurbo(this, 361, 17, textureX, textureY); // Box 63
		turretModel[25] = new ModelRendererTurbo(this, 465, 33, textureX, textureY); // Box 64
		turretModel[26] = new ModelRendererTurbo(this, 473, 25, textureX, textureY); // Box 65
		turretModel[27] = new ModelRendererTurbo(this, 497, 33, textureX, textureY); // Box 66

		turretModel[0].addShapeBox(0F, 0F, 0F, 2, 9, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.5F, 1.5F, 0F, 0.5F, 1.5F, 0F, 0.5F, 2F, 0F, 0.5F, 2F); // Box 32
		turretModel[0].setRotationPoint(-3F, -27.5F, -10F);

		turretModel[1].addShapeBox(0F, 0F, 0F, 4, 9, 16, 0F,-0.5F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2.5F, -0.5F, 0F, 0.5F, 0F, 0.5F, 2F, 0F, 0.5F, 3.5F, 0F, 0.5F, 4F, 0F, 0.5F, 2.5F); // Box 33
		turretModel[1].setRotationPoint(-7F, -27.5F, -8F);

		turretModel[2].addShapeBox(0F, 0F, 0F, 2, 9, 12, 0F,0F, 0F, 0F, 0.5F, 0F, 2F, 0.5F, 0F, 2.5F, 0F, 0F, 0.5F, 0F, 0.5F, 2.5F, 0F, 0.5F, 4F, 0F, 0.5F, 4.5F, 0F, 0.5F, 3F); // Box 34
		turretModel[2].setRotationPoint(-9F, -27.5F, -6F);

		turretModel[3].addShapeBox(0F, 0F, 0F, 6, 9, 4, 0F,0F, 0F, 0F, -4F, 0F, 4F, -4F, 0F, 4.5F, 0F, 0F, 0.5F, 1.5F, 0.5F, 1F, -4F, 0.5F, 6.5F, -4F, 0.5F, 7F, 1.5F, 0.5F, 1.5F); // Box 35
		turretModel[3].setRotationPoint(-11F, -27.5F, -2F);

		turretModel[4].addShapeBox(0F, 0F, 0F, 3, 9, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.5F, 1.5F, 0F, 0.5F, 1.5F, 0F, 0.5F, 2F, 0F, 0.5F, 2F); // Box 36
		turretModel[4].setRotationPoint(-1F, -27.5F, -10F);

		turretModel[5].addShapeBox(0F, 0F, 0F, 8, 9, 20, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0.5F, 1.5F, 1F, -4.5F, 1F, 1F, -4.5F, 1.5F, 0F, 0.5F, 2F); // Box 37
		turretModel[5].setRotationPoint(2F, -27.5F, -10F);

		turretModel[6].addShapeBox(0F, 0F, 0F, 9, 5, 20, 0F,0F, -5F, 1.5F, 0F, 0F, 1F, 0F, 0F, 1.5F, 0F, -5F, 2F, 0F, 0F, 1.5F, 1.5F, 0F, -1F, 1.5F, 0F, -0.5F, 0F, 0F, 2F); // Box 38
		turretModel[6].setRotationPoint(2F, -23F, -10F);

		turretModel[7].addShapeBox(0F, 0F, 0F, 1, 6, 20, 0F,0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F); // Box 39
		turretModel[7].setRotationPoint(10F, -26F, -9.5F);
		turretModel[7].rotateAngleZ = 0.27925268F;

		turretModel[8].addShapeBox(1F, 1F, 0F, 1, 4, 2, 0F,0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F); // Box 40
		turretModel[8].setRotationPoint(10F, -26F, -9.5F);
		turretModel[8].rotateAngleZ = 0.27925268F;

		turretModel[9].addShapeBox(1F, 1F, 0F, 1, 4, 2, 0F,0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F); // Box 41
		turretModel[9].setRotationPoint(10F, -26F, 8F);
		turretModel[9].rotateAngleZ = 0.27925268F;

		turretModel[10].addShapeBox(0F, 0F, 0F, 3, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		turretModel[10].setRotationPoint(1.25F, -28F, -6.5F);

		turretModel[11].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 50
		turretModel[11].setRotationPoint(4.25F, -28F, -6.5F);

		turretModel[12].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 51
		turretModel[12].setRotationPoint(0.25F, -28F, -6.5F);

		turretModel[13].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 52
		turretModel[13].setRotationPoint(1.25F, -30F, -4.5F);

		turretModel[14].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 53
		turretModel[14].setRotationPoint(1.25F, -30F, -3.5F);

		turretModel[15].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 54
		turretModel[15].setRotationPoint(1.25F, -30F, -5.5F);

		turretModel[16].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 55
		turretModel[16].setRotationPoint(-9.75F, -28F, -5.5F);

		turretModel[17].addShapeBox(0F, 0F, 0F, 2, 1, 11, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 56
		turretModel[17].setRotationPoint(-8.75F, -28F, -6.5F);

		turretModel[18].addShapeBox(0F, 0F, 0F, 1, 1, 13, 0F,0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F); // Box 57
		turretModel[18].setRotationPoint(-2.75F, -28F, -7.5F);

		turretModel[19].addShapeBox(0F, 0F, 0F, 4, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 58
		turretModel[19].setRotationPoint(-6.75F, -28F, -6.5F);

		turretModel[20].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 59
		turretModel[20].setRotationPoint(-2.75F, -28.25F, -4F);

		turretModel[21].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 60
		turretModel[21].setRotationPoint(-2.75F, -28.25F, 1F);

		turretModel[22].addShapeBox(0F, 0F, 0F, 1, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 61
		turretModel[22].setRotationPoint(-11.75F, -24F, -2.75F);
		turretModel[22].rotateAngleZ = -0.17453293F;

		turretModel[23].addShapeBox(-1F, 1F, 1F, 1, 2, 4, 0F,-0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F); // Box 62
		turretModel[23].setRotationPoint(-11.75F, -24F, -2.75F);
		turretModel[23].rotateAngleZ = -0.17453293F;

		turretModel[24].addShapeBox(-1F, 1F, 1F, 1, 2, 4, 0F,-0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F); // Box 63
		turretModel[24].setRotationPoint(-8.75F, -24F, 8.25F);
		turretModel[24].rotateAngleY = -1.06465084F;
		turretModel[24].rotateAngleZ = -0.17453293F;

		turretModel[25].addShapeBox(0F, 0F, 0F, 1, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 64
		turretModel[25].setRotationPoint(-8.75F, -24F, 8.25F);
		turretModel[25].rotateAngleY = -1.06465084F;
		turretModel[25].rotateAngleZ = -0.17453293F;

		turretModel[26].addShapeBox(-1F, 1F, -5F, 1, 2, 4, 0F,-0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F); // Box 65
		turretModel[26].setRotationPoint(-8.75F, -24F, -7.75F);
		turretModel[26].rotateAngleY = 1.06465084F;
		turretModel[26].rotateAngleZ = -0.17453293F;

		turretModel[27].addShapeBox(0F, 0F, -6F, 1, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 66
		turretModel[27].setRotationPoint(-8.75F, -24F, -7.75F);
		turretModel[27].rotateAngleY = 1.06465084F;
		turretModel[27].rotateAngleZ = -0.17453293F;
	}

	private void initbarrelModel_1()
	{
		barrelModel[0] = new ModelRendererTurbo(this, 209, 49, textureX, textureY); // Box 42
		barrelModel[1] = new ModelRendererTurbo(this, 473, 81, textureX, textureY); // Box 43
		barrelModel[2] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 44
		barrelModel[3] = new ModelRendererTurbo(this, 249, 17, textureX, textureY); // Box 45
		barrelModel[4] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 282
		barrelModel[5] = new ModelRendererTurbo(this, 249, 17, textureX, textureY); // Box 283

		barrelModel[0].addShapeBox(-1F, -2F, 0F, 2, 4, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 42
		barrelModel[0].setRotationPoint(10.5F, -23.25F, -7.75F);

		barrelModel[1].addShapeBox(1F, -2F, 0F, 1, 4, 16, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 43
		barrelModel[1].setRotationPoint(10.5F, -23.25F, -7.75F);

		barrelModel[2].addShapeBox(1F, -2F, 0F, 1, 2, 8, 0F,0F, 0.25F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 44
		barrelModel[2].setRotationPoint(10.5F, -23.25F, -7.75F);

		barrelModel[3].addShapeBox(2F, -0.5F, 1F, 9, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 45
		barrelModel[3].setRotationPoint(10.5F, -23.25F, -6.75F);

		barrelModel[4].addShapeBox(1F, -2F, 0F, 1, 2, 8, 0F,0F, 0.25F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 282
		barrelModel[4].setRotationPoint(10.5F, -23.25F, 0.25F);

		barrelModel[5].addShapeBox(2F, -0.5F, 1F, 9, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 283
		barrelModel[5].setRotationPoint(10.5F, -23.25F, 4.25F);
	}

	private void initleftTrackWheelModels_1()
	{
		leftTrackWheelModels[0] = new ModelRendererTurbo(this, 1, 26, textureX, textureY); // Shape 1
		leftTrackWheelModels[1] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Shape 198
		leftTrackWheelModels[2] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Shape 199
		leftTrackWheelModels[3] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Shape 200
		leftTrackWheelModels[4] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Shape 201
		leftTrackWheelModels[5] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Shape 202
		leftTrackWheelModels[6] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Shape 203
		leftTrackWheelModels[7] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Shape 204
		leftTrackWheelModels[8] = new ModelRendererTurbo(this, 1, 26, textureX, textureY); // Shape 205
		leftTrackWheelModels[9] = new ModelRendererTurbo(this, 1, 26, textureX, textureY); // Shape 206
		leftTrackWheelModels[10] = new ModelRendererTurbo(this, 1, 26, textureX, textureY); // Shape 207

		leftTrackWheelModels[0].addShape3D(2F, -2F, 0F, new Shape2D(new Coord2D[] { new Coord2D(1, 0, 1, 0), new Coord2D(3, 0, 3, 0), new Coord2D(4, 1, 4, 1), new Coord2D(4, 3, 4, 3), new Coord2D(3, 4, 3, 4), new Coord2D(1, 4, 1, 4), new Coord2D(0, 3, 0, 3), new Coord2D(0, 1, 0, 1) }), 2, 4, 4, 16, 2, ModelRendererTurbo.MR_FRONT, new float[] {2 ,2 ,2 ,2 ,2 ,2 ,2 ,2}); // Shape 1
		leftTrackWheelModels[0].setRotationPoint(19F, -5F, 23F);

		leftTrackWheelModels[1].addShape3D(5.5F, -5.5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(8, 0, 8, 0), new Coord2D(11, 3, 11, 3), new Coord2D(11, 8, 11, 8), new Coord2D(8, 11, 8, 11), new Coord2D(3, 11, 3, 11), new Coord2D(0, 8, 0, 8), new Coord2D(0, 3, 0, 3) }), 2, 11, 11, 40, 2, ModelRendererTurbo.MR_FRONT, new float[] {5 ,5 ,5 ,5 ,5 ,5 ,5 ,5}); // Shape 198
		leftTrackWheelModels[1].setRotationPoint(13F, 4F, 23F);

		leftTrackWheelModels[2].addShape3D(5.5F, -5.5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(8, 0, 8, 0), new Coord2D(11, 3, 11, 3), new Coord2D(11, 8, 11, 8), new Coord2D(8, 11, 8, 11), new Coord2D(3, 11, 3, 11), new Coord2D(0, 8, 0, 8), new Coord2D(0, 3, 0, 3) }), 2, 11, 11, 40, 2, ModelRendererTurbo.MR_FRONT, new float[] {5 ,5 ,5 ,5 ,5 ,5 ,5 ,5}); // Shape 199
		leftTrackWheelModels[2].setRotationPoint(-1F, 4F, 23F);

		leftTrackWheelModels[3].addShape3D(5.5F, -5.5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(8, 0, 8, 0), new Coord2D(11, 3, 11, 3), new Coord2D(11, 8, 11, 8), new Coord2D(8, 11, 8, 11), new Coord2D(3, 11, 3, 11), new Coord2D(0, 8, 0, 8), new Coord2D(0, 3, 0, 3) }), 2, 11, 11, 40, 2, ModelRendererTurbo.MR_FRONT, new float[] {5 ,5 ,5 ,5 ,5 ,5 ,5 ,5}); // Shape 200
		leftTrackWheelModels[3].setRotationPoint(-13F, 4F, 23F);

		leftTrackWheelModels[4].addShape3D(5.5F, -5.5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(8, 0, 8, 0), new Coord2D(11, 3, 11, 3), new Coord2D(11, 8, 11, 8), new Coord2D(8, 11, 8, 11), new Coord2D(3, 11, 3, 11), new Coord2D(0, 8, 0, 8), new Coord2D(0, 3, 0, 3) }), 2, 11, 11, 40, 2, ModelRendererTurbo.MR_FRONT, new float[] {5 ,5 ,5 ,5 ,5 ,5 ,5 ,5}); // Shape 201
		leftTrackWheelModels[4].setRotationPoint(-27F, 4F, 23F);

		leftTrackWheelModels[5].addShape3D(5.5F, -5.5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(8, 0, 8, 0), new Coord2D(11, 3, 11, 3), new Coord2D(11, 8, 11, 8), new Coord2D(8, 11, 8, 11), new Coord2D(3, 11, 3, 11), new Coord2D(0, 8, 0, 8), new Coord2D(0, 3, 0, 3) }), 2, 11, 11, 40, 2, ModelRendererTurbo.MR_FRONT, new float[] {5 ,5 ,5 ,5 ,5 ,5 ,5 ,5}); // Shape 202
		leftTrackWheelModels[5].setRotationPoint(37F, -1F, 23.5F);

		leftTrackWheelModels[6].addShape3D(5.5F, -5.5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(8, 0, 8, 0), new Coord2D(11, 3, 11, 3), new Coord2D(11, 8, 11, 8), new Coord2D(8, 11, 8, 11), new Coord2D(3, 11, 3, 11), new Coord2D(0, 8, 0, 8), new Coord2D(0, 3, 0, 3) }), 2, 11, 11, 40, 2, ModelRendererTurbo.MR_FRONT, new float[] {5 ,5 ,5 ,5 ,5 ,5 ,5 ,5}); // Shape 203
		leftTrackWheelModels[6].setRotationPoint(25F, 4F, 23F);

		leftTrackWheelModels[7].addShape3D(5.5F, -5.5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(8, 0, 8, 0), new Coord2D(11, 3, 11, 3), new Coord2D(11, 8, 11, 8), new Coord2D(8, 11, 8, 11), new Coord2D(3, 11, 3, 11), new Coord2D(0, 8, 0, 8), new Coord2D(0, 3, 0, 3) }), 2, 11, 11, 40, 2, ModelRendererTurbo.MR_FRONT, new float[] {5 ,5 ,5 ,5 ,5 ,5 ,5 ,5}); // Shape 204
		leftTrackWheelModels[7].setRotationPoint(-39.5F, 1F, 23F);

		leftTrackWheelModels[8].addShape3D(2F, -2F, 0F, new Shape2D(new Coord2D[] { new Coord2D(1, 0, 1, 0), new Coord2D(3, 0, 3, 0), new Coord2D(4, 1, 4, 1), new Coord2D(4, 3, 4, 3), new Coord2D(3, 4, 3, 4), new Coord2D(1, 4, 1, 4), new Coord2D(0, 3, 0, 3), new Coord2D(0, 1, 0, 1) }), 2, 4, 4, 16, 2, ModelRendererTurbo.MR_FRONT, new float[] {2 ,2 ,2 ,2 ,2 ,2 ,2 ,2}); // Shape 205
		leftTrackWheelModels[8].setRotationPoint(6F, -5F, 23F);

		leftTrackWheelModels[9].addShape3D(2F, -2F, 0F, new Shape2D(new Coord2D[] { new Coord2D(1, 0, 1, 0), new Coord2D(3, 0, 3, 0), new Coord2D(4, 1, 4, 1), new Coord2D(4, 3, 4, 3), new Coord2D(3, 4, 3, 4), new Coord2D(1, 4, 1, 4), new Coord2D(0, 3, 0, 3), new Coord2D(0, 1, 0, 1) }), 2, 4, 4, 16, 2, ModelRendererTurbo.MR_FRONT, new float[] {2 ,2 ,2 ,2 ,2 ,2 ,2 ,2}); // Shape 206
		leftTrackWheelModels[9].setRotationPoint(-7.5F, -4.5F, 23F);

		leftTrackWheelModels[10].addShape3D(2F, -2F, 0F, new Shape2D(new Coord2D[] { new Coord2D(1, 0, 1, 0), new Coord2D(3, 0, 3, 0), new Coord2D(4, 1, 4, 1), new Coord2D(4, 3, 4, 3), new Coord2D(3, 4, 3, 4), new Coord2D(1, 4, 1, 4), new Coord2D(0, 3, 0, 3), new Coord2D(0, 1, 0, 1) }), 2, 4, 4, 16, 2, ModelRendererTurbo.MR_FRONT, new float[] {2 ,2 ,2 ,2 ,2 ,2 ,2 ,2}); // Shape 207
		leftTrackWheelModels[10].setRotationPoint(-18.5F, -4.5F, 23F);
	}

	private void initrightTrackWheelModels_1()
	{
		rightTrackWheelModels[0] = new ModelRendererTurbo(this, 1, 26, textureX, textureY); // Shape 208
		rightTrackWheelModels[1] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Shape 209
		rightTrackWheelModels[2] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Shape 210
		rightTrackWheelModels[3] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Shape 211
		rightTrackWheelModels[4] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Shape 212
		rightTrackWheelModels[5] = new ModelRendererTurbo(this, 1, 26, textureX, textureY); // Shape 213
		rightTrackWheelModels[6] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Shape 214
		rightTrackWheelModels[7] = new ModelRendererTurbo(this, 1, 26, textureX, textureY); // Shape 215
		rightTrackWheelModels[8] = new ModelRendererTurbo(this, 1, 26, textureX, textureY); // Shape 216
		rightTrackWheelModels[9] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Shape 217
		rightTrackWheelModels[10] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Shape 218

		rightTrackWheelModels[0].addShape3D(2F, -2F, 0F, new Shape2D(new Coord2D[] { new Coord2D(1, 0, 1, 0), new Coord2D(3, 0, 3, 0), new Coord2D(4, 1, 4, 1), new Coord2D(4, 3, 4, 3), new Coord2D(3, 4, 3, 4), new Coord2D(1, 4, 1, 4), new Coord2D(0, 3, 0, 3), new Coord2D(0, 1, 0, 1) }), 2, 4, 4, 16, 2, ModelRendererTurbo.MR_FRONT, new float[] {2 ,2 ,2 ,2 ,2 ,2 ,2 ,2}); // Shape 208
		rightTrackWheelModels[0].setRotationPoint(-18.5F, -4.5F, -12F);

		rightTrackWheelModels[1].addShape3D(5.5F, -5.5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(8, 0, 8, 0), new Coord2D(11, 3, 11, 3), new Coord2D(11, 8, 11, 8), new Coord2D(8, 11, 8, 11), new Coord2D(3, 11, 3, 11), new Coord2D(0, 8, 0, 8), new Coord2D(0, 3, 0, 3) }), 2, 11, 11, 40, 2, ModelRendererTurbo.MR_FRONT, new float[] {5 ,5 ,5 ,5 ,5 ,5 ,5 ,5}); // Shape 209
		rightTrackWheelModels[1].setRotationPoint(-39.5F, 1F, -12F);

		rightTrackWheelModels[2].addShape3D(5.5F, -5.5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(8, 0, 8, 0), new Coord2D(11, 3, 11, 3), new Coord2D(11, 8, 11, 8), new Coord2D(8, 11, 8, 11), new Coord2D(3, 11, 3, 11), new Coord2D(0, 8, 0, 8), new Coord2D(0, 3, 0, 3) }), 2, 11, 11, 40, 2, ModelRendererTurbo.MR_FRONT, new float[] {5 ,5 ,5 ,5 ,5 ,5 ,5 ,5}); // Shape 210
		rightTrackWheelModels[2].setRotationPoint(-27F, 4F, -12F);

		rightTrackWheelModels[3].addShape3D(5.5F, -5.5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(8, 0, 8, 0), new Coord2D(11, 3, 11, 3), new Coord2D(11, 8, 11, 8), new Coord2D(8, 11, 8, 11), new Coord2D(3, 11, 3, 11), new Coord2D(0, 8, 0, 8), new Coord2D(0, 3, 0, 3) }), 2, 11, 11, 40, 2, ModelRendererTurbo.MR_FRONT, new float[] {5 ,5 ,5 ,5 ,5 ,5 ,5 ,5}); // Shape 211
		rightTrackWheelModels[3].setRotationPoint(-13F, 4F, -12F);

		rightTrackWheelModels[4].addShape3D(5.5F, -5.5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(8, 0, 8, 0), new Coord2D(11, 3, 11, 3), new Coord2D(11, 8, 11, 8), new Coord2D(8, 11, 8, 11), new Coord2D(3, 11, 3, 11), new Coord2D(0, 8, 0, 8), new Coord2D(0, 3, 0, 3) }), 2, 11, 11, 40, 2, ModelRendererTurbo.MR_FRONT, new float[] {5 ,5 ,5 ,5 ,5 ,5 ,5 ,5}); // Shape 212
		rightTrackWheelModels[4].setRotationPoint(-1F, 4F, -12F);

		rightTrackWheelModels[5].addShape3D(2F, -2F, 0F, new Shape2D(new Coord2D[] { new Coord2D(1, 0, 1, 0), new Coord2D(3, 0, 3, 0), new Coord2D(4, 1, 4, 1), new Coord2D(4, 3, 4, 3), new Coord2D(3, 4, 3, 4), new Coord2D(1, 4, 1, 4), new Coord2D(0, 3, 0, 3), new Coord2D(0, 1, 0, 1) }), 2, 4, 4, 16, 2, ModelRendererTurbo.MR_FRONT, new float[] {2 ,2 ,2 ,2 ,2 ,2 ,2 ,2}); // Shape 213
		rightTrackWheelModels[5].setRotationPoint(-7.5F, -4.5F, -12F);

		rightTrackWheelModels[6].addShape3D(5.5F, -5.5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(8, 0, 8, 0), new Coord2D(11, 3, 11, 3), new Coord2D(11, 8, 11, 8), new Coord2D(8, 11, 8, 11), new Coord2D(3, 11, 3, 11), new Coord2D(0, 8, 0, 8), new Coord2D(0, 3, 0, 3) }), 2, 11, 11, 40, 2, ModelRendererTurbo.MR_FRONT, new float[] {5 ,5 ,5 ,5 ,5 ,5 ,5 ,5}); // Shape 214
		rightTrackWheelModels[6].setRotationPoint(13F, 4F, -12F);

		rightTrackWheelModels[7].addShape3D(2F, -2F, 0F, new Shape2D(new Coord2D[] { new Coord2D(1, 0, 1, 0), new Coord2D(3, 0, 3, 0), new Coord2D(4, 1, 4, 1), new Coord2D(4, 3, 4, 3), new Coord2D(3, 4, 3, 4), new Coord2D(1, 4, 1, 4), new Coord2D(0, 3, 0, 3), new Coord2D(0, 1, 0, 1) }), 2, 4, 4, 16, 2, ModelRendererTurbo.MR_FRONT, new float[] {2 ,2 ,2 ,2 ,2 ,2 ,2 ,2}); // Shape 215
		rightTrackWheelModels[7].setRotationPoint(6F, -5F, -12F);

		rightTrackWheelModels[8].addShape3D(2F, -2F, 0F, new Shape2D(new Coord2D[] { new Coord2D(1, 0, 1, 0), new Coord2D(3, 0, 3, 0), new Coord2D(4, 1, 4, 1), new Coord2D(4, 3, 4, 3), new Coord2D(3, 4, 3, 4), new Coord2D(1, 4, 1, 4), new Coord2D(0, 3, 0, 3), new Coord2D(0, 1, 0, 1) }), 2, 4, 4, 16, 2, ModelRendererTurbo.MR_FRONT, new float[] {2 ,2 ,2 ,2 ,2 ,2 ,2 ,2}); // Shape 216
		rightTrackWheelModels[8].setRotationPoint(19F, -5F, -12F);

		rightTrackWheelModels[9].addShape3D(5.5F, -5.5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(8, 0, 8, 0), new Coord2D(11, 3, 11, 3), new Coord2D(11, 8, 11, 8), new Coord2D(8, 11, 8, 11), new Coord2D(3, 11, 3, 11), new Coord2D(0, 8, 0, 8), new Coord2D(0, 3, 0, 3) }), 2, 11, 11, 40, 2, ModelRendererTurbo.MR_FRONT, new float[] {5 ,5 ,5 ,5 ,5 ,5 ,5 ,5}); // Shape 217
		rightTrackWheelModels[9].setRotationPoint(25F, 4F, -12F);

		rightTrackWheelModels[10].addShape3D(5.5F, -5.5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(8, 0, 8, 0), new Coord2D(11, 3, 11, 3), new Coord2D(11, 8, 11, 8), new Coord2D(8, 11, 8, 11), new Coord2D(3, 11, 3, 11), new Coord2D(0, 8, 0, 8), new Coord2D(0, 3, 0, 3) }), 2, 11, 11, 40, 2, ModelRendererTurbo.MR_FRONT, new float[] {5 ,5 ,5 ,5 ,5 ,5 ,5 ,5}); // Shape 218
		rightTrackWheelModels[10].setRotationPoint(37F, -1F, -12.5F);
	}

	private void inittrailerModel_1()
	{
		trailerModel[0] = new ModelRendererTurbo(this, 483, 117, textureX, textureY); // Box 28
		trailerModel[1] = new ModelRendererTurbo(this, 481, 117, textureX, textureY); // Box 275
		trailerModel[2] = new ModelRendererTurbo(this, 481, 117, textureX, textureY); // Box 276

		trailerModel[0].addShapeBox(-1F, -0.5F, -3F, 2, 1, 6, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 28
		trailerModel[0].setRotationPoint(-2F, 0F, 4.5F);

		trailerModel[1].addShapeBox(0F, -0.5F, -2.5F, 2, 1, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F); // Box 275
		trailerModel[1].setRotationPoint(-2F, 0F, 4.5F);

		trailerModel[2].addShapeBox(0F, -0.5F, 0.5F, 2, 1, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F); // Box 276
		trailerModel[2].setRotationPoint(-2F, 0F, 4.5F);
	}
}