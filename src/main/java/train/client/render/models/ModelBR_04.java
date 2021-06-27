//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2021 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 11.11.2018 - 18:25:58
// Last changed on: 11.11.2018 - 18:25:58

package train.client.render.models; //Path where the model is located

import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import tmt.ModelConverter;
import tmt.ModelRendererTurbo;

public class ModelBR_04 extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelBR_04() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[527];

		initbodyModel_1();
		initbodyModel_2();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 2
		bodyModel[2] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 4
		bodyModel[3] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 6
		bodyModel[4] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 15
		bodyModel[5] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 23
		bodyModel[6] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 24
		bodyModel[7] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 25
		bodyModel[8] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 26
		bodyModel[9] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 27
		bodyModel[10] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 28
		bodyModel[11] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 29
		bodyModel[12] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 34
		bodyModel[13] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 35
		bodyModel[14] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 36
		bodyModel[15] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 37
		bodyModel[16] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 38
		bodyModel[17] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 39
		bodyModel[18] = new ModelRendererTurbo(this, 169, 9, textureX, textureY); // Box 41
		bodyModel[19] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 42
		bodyModel[20] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 43
		bodyModel[21] = new ModelRendererTurbo(this, 185, 9, textureX, textureY); // Box 44
		bodyModel[22] = new ModelRendererTurbo(this, 369, 9, textureX, textureY); // Box 45
		bodyModel[23] = new ModelRendererTurbo(this, 193, 9, textureX, textureY); // Box 46
		bodyModel[24] = new ModelRendererTurbo(this, 377, 9, textureX, textureY); // Box 47
		bodyModel[25] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 49
		bodyModel[26] = new ModelRendererTurbo(this, 401, 9, textureX, textureY); // Box 50
		bodyModel[27] = new ModelRendererTurbo(this, 417, 9, textureX, textureY); // Box 51
		bodyModel[28] = new ModelRendererTurbo(this, 433, 9, textureX, textureY); // Box 52
		bodyModel[29] = new ModelRendererTurbo(this, 449, 9, textureX, textureY); // Box 53
		bodyModel[30] = new ModelRendererTurbo(this, 441, 9, textureX, textureY); // Box 54
		bodyModel[31] = new ModelRendererTurbo(this, 473, 9, textureX, textureY); // Box 55
		bodyModel[32] = new ModelRendererTurbo(this, 209, 9, textureX, textureY); // Box 56
		bodyModel[33] = new ModelRendererTurbo(this, 489, 9, textureX, textureY); // Box 57
		bodyModel[34] = new ModelRendererTurbo(this, 417, 17, textureX, textureY); // Box 58
		bodyModel[35] = new ModelRendererTurbo(this, 433, 17, textureX, textureY); // Box 59
		bodyModel[36] = new ModelRendererTurbo(this, 473, 17, textureX, textureY); // Box 60
		bodyModel[37] = new ModelRendererTurbo(this, 489, 17, textureX, textureY); // Box 61
		bodyModel[38] = new ModelRendererTurbo(this, 121, 25, textureX, textureY); // Box 62
		bodyModel[39] = new ModelRendererTurbo(this, 137, 25, textureX, textureY); // Box 63
		bodyModel[40] = new ModelRendererTurbo(this, 153, 25, textureX, textureY); // Box 64
		bodyModel[41] = new ModelRendererTurbo(this, 169, 25, textureX, textureY); // Box 65
		bodyModel[42] = new ModelRendererTurbo(this, 241, 25, textureX, textureY); // Box 66
		bodyModel[43] = new ModelRendererTurbo(this, 257, 25, textureX, textureY); // Box 67
		bodyModel[44] = new ModelRendererTurbo(this, 273, 25, textureX, textureY); // Box 68
		bodyModel[45] = new ModelRendererTurbo(this, 289, 25, textureX, textureY); // Box 69
		bodyModel[46] = new ModelRendererTurbo(this, 305, 25, textureX, textureY); // Box 70
		bodyModel[47] = new ModelRendererTurbo(this, 505, 9, textureX, textureY); // Box 71
		bodyModel[48] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 72
		bodyModel[49] = new ModelRendererTurbo(this, 9, 17, textureX, textureY); // Box 73
		bodyModel[50] = new ModelRendererTurbo(this, 161, 25, textureX, textureY); // Box 74
		bodyModel[51] = new ModelRendererTurbo(this, 169, 17, textureX, textureY); // Box 75
		bodyModel[52] = new ModelRendererTurbo(this, 185, 17, textureX, textureY); // Box 76
		bodyModel[53] = new ModelRendererTurbo(this, 321, 25, textureX, textureY); // Box 77
		bodyModel[54] = new ModelRendererTurbo(this, 337, 25, textureX, textureY); // Box 78
		bodyModel[55] = new ModelRendererTurbo(this, 353, 25, textureX, textureY); // Box 79
		bodyModel[56] = new ModelRendererTurbo(this, 369, 25, textureX, textureY); // Box 80
		bodyModel[57] = new ModelRendererTurbo(this, 401, 25, textureX, textureY); // Box 81
		bodyModel[58] = new ModelRendererTurbo(this, 417, 25, textureX, textureY); // Box 82
		bodyModel[59] = new ModelRendererTurbo(this, 433, 25, textureX, textureY); // Box 83
		bodyModel[60] = new ModelRendererTurbo(this, 489, 25, textureX, textureY); // Box 84
		bodyModel[61] = new ModelRendererTurbo(this, 193, 33, textureX, textureY); // Box 86
		bodyModel[62] = new ModelRendererTurbo(this, 113, 33, textureX, textureY); // Box 87
		bodyModel[63] = new ModelRendererTurbo(this, 129, 33, textureX, textureY); // Box 88
		bodyModel[64] = new ModelRendererTurbo(this, 145, 33, textureX, textureY); // Box 90
		bodyModel[65] = new ModelRendererTurbo(this, 161, 33, textureX, textureY); // Box 91
		bodyModel[66] = new ModelRendererTurbo(this, 201, 17, textureX, textureY); // Box 92
		bodyModel[67] = new ModelRendererTurbo(this, 449, 25, textureX, textureY); // Box 93
		bodyModel[68] = new ModelRendererTurbo(this, 225, 9, textureX, textureY); // Box 94
		bodyModel[69] = new ModelRendererTurbo(this, 409, 9, textureX, textureY); // Box 95
		bodyModel[70] = new ModelRendererTurbo(this, 505, 17, textureX, textureY); // Box 96
		bodyModel[71] = new ModelRendererTurbo(this, 113, 25, textureX, textureY); // Box 97
		bodyModel[72] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 98
		bodyModel[73] = new ModelRendererTurbo(this, 329, 25, textureX, textureY); // Box 100
		bodyModel[74] = new ModelRendererTurbo(this, 385, 25, textureX, textureY); // Box 101
		bodyModel[75] = new ModelRendererTurbo(this, 473, 25, textureX, textureY); // Box 102
		bodyModel[76] = new ModelRendererTurbo(this, 481, 25, textureX, textureY); // Box 103
		bodyModel[77] = new ModelRendererTurbo(this, 505, 25, textureX, textureY); // Box 107
		bodyModel[78] = new ModelRendererTurbo(this, 121, 33, textureX, textureY); // Box 108
		bodyModel[79] = new ModelRendererTurbo(this, 137, 33, textureX, textureY); // Box 109
		bodyModel[80] = new ModelRendererTurbo(this, 177, 33, textureX, textureY); // Box 110
		bodyModel[81] = new ModelRendererTurbo(this, 305, 33, textureX, textureY); // Box 111
		bodyModel[82] = new ModelRendererTurbo(this, 313, 33, textureX, textureY); // Box 112
		bodyModel[83] = new ModelRendererTurbo(this, 337, 33, textureX, textureY); // Box 113
		bodyModel[84] = new ModelRendererTurbo(this, 345, 33, textureX, textureY); // Box 114
		bodyModel[85] = new ModelRendererTurbo(this, 353, 33, textureX, textureY); // Box 115
		bodyModel[86] = new ModelRendererTurbo(this, 361, 33, textureX, textureY); // Box 116
		bodyModel[87] = new ModelRendererTurbo(this, 369, 33, textureX, textureY); // Box 117
		bodyModel[88] = new ModelRendererTurbo(this, 377, 33, textureX, textureY); // Box 118
		bodyModel[89] = new ModelRendererTurbo(this, 385, 33, textureX, textureY); // Box 119
		bodyModel[90] = new ModelRendererTurbo(this, 393, 33, textureX, textureY); // Box 120
		bodyModel[91] = new ModelRendererTurbo(this, 401, 33, textureX, textureY); // Box 121
		bodyModel[92] = new ModelRendererTurbo(this, 409, 33, textureX, textureY); // Box 122
		bodyModel[93] = new ModelRendererTurbo(this, 417, 33, textureX, textureY); // Box 123
		bodyModel[94] = new ModelRendererTurbo(this, 425, 33, textureX, textureY); // Box 124
		bodyModel[95] = new ModelRendererTurbo(this, 433, 33, textureX, textureY); // Box 125
		bodyModel[96] = new ModelRendererTurbo(this, 505, 33, textureX, textureY); // Box 126
		bodyModel[97] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 127
		bodyModel[98] = new ModelRendererTurbo(this, 9, 41, textureX, textureY); // Box 128
		bodyModel[99] = new ModelRendererTurbo(this, 17, 41, textureX, textureY); // Box 129
		bodyModel[100] = new ModelRendererTurbo(this, 25, 41, textureX, textureY); // Box 130
		bodyModel[101] = new ModelRendererTurbo(this, 33, 41, textureX, textureY); // Box 131
		bodyModel[102] = new ModelRendererTurbo(this, 41, 41, textureX, textureY); // Box 132
		bodyModel[103] = new ModelRendererTurbo(this, 49, 41, textureX, textureY); // Box 133
		bodyModel[104] = new ModelRendererTurbo(this, 57, 41, textureX, textureY); // Box 134
		bodyModel[105] = new ModelRendererTurbo(this, 65, 41, textureX, textureY); // Box 135
		bodyModel[106] = new ModelRendererTurbo(this, 73, 41, textureX, textureY); // Box 136
		bodyModel[107] = new ModelRendererTurbo(this, 81, 41, textureX, textureY); // Box 137
		bodyModel[108] = new ModelRendererTurbo(this, 89, 41, textureX, textureY); // Box 138
		bodyModel[109] = new ModelRendererTurbo(this, 97, 41, textureX, textureY); // Box 139
		bodyModel[110] = new ModelRendererTurbo(this, 105, 41, textureX, textureY); // Box 140
		bodyModel[111] = new ModelRendererTurbo(this, 177, 41, textureX, textureY); // Box 141
		bodyModel[112] = new ModelRendererTurbo(this, 313, 41, textureX, textureY); // Box 142
		bodyModel[113] = new ModelRendererTurbo(this, 321, 41, textureX, textureY); // Box 143
		bodyModel[114] = new ModelRendererTurbo(this, 329, 41, textureX, textureY); // Box 144
		bodyModel[115] = new ModelRendererTurbo(this, 337, 41, textureX, textureY); // Box 145
		bodyModel[116] = new ModelRendererTurbo(this, 105, 41, textureX, textureY); // Box 86
		bodyModel[117] = new ModelRendererTurbo(this, 337, 41, textureX, textureY); // Box 93
		bodyModel[118] = new ModelRendererTurbo(this, 353, 41, textureX, textureY); // Box 112
		bodyModel[119] = new ModelRendererTurbo(this, 409, 41, textureX, textureY); // Box 113
		bodyModel[120] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 114
		bodyModel[121] = new ModelRendererTurbo(this, 57, 49, textureX, textureY); // Box 115
		bodyModel[122] = new ModelRendererTurbo(this, 129, 49, textureX, textureY); // Box 116
		bodyModel[123] = new ModelRendererTurbo(this, 177, 49, textureX, textureY); // Box 117
		bodyModel[124] = new ModelRendererTurbo(this, 233, 49, textureX, textureY); // Box 118
		bodyModel[125] = new ModelRendererTurbo(this, 465, 41, textureX, textureY); // Box 126
		bodyModel[126] = new ModelRendererTurbo(this, 473, 41, textureX, textureY); // Box 128
		bodyModel[127] = new ModelRendererTurbo(this, 489, 41, textureX, textureY); // Box 131
		bodyModel[128] = new ModelRendererTurbo(this, 489, 41, textureX, textureY); // Box 134
		bodyModel[129] = new ModelRendererTurbo(this, 105, 49, textureX, textureY); // Box 135
		bodyModel[130] = new ModelRendererTurbo(this, 265, 49, textureX, textureY); // Box 136
		bodyModel[131] = new ModelRendererTurbo(this, 297, 49, textureX, textureY); // Box 154
		bodyModel[132] = new ModelRendererTurbo(this, 313, 49, textureX, textureY); // Box 155
		bodyModel[133] = new ModelRendererTurbo(this, 321, 49, textureX, textureY); // Box 156
		bodyModel[134] = new ModelRendererTurbo(this, 401, 41, textureX, textureY); // Box 157
		bodyModel[135] = new ModelRendererTurbo(this, 361, 49, textureX, textureY); // Box 162
		bodyModel[136] = new ModelRendererTurbo(this, 329, 49, textureX, textureY); // Box 164
		bodyModel[137] = new ModelRendererTurbo(this, 377, 49, textureX, textureY); // Box 166
		bodyModel[138] = new ModelRendererTurbo(this, 49, 49, textureX, textureY); // Box 168
		bodyModel[139] = new ModelRendererTurbo(this, 385, 49, textureX, textureY); // Box 170
		bodyModel[140] = new ModelRendererTurbo(this, 409, 49, textureX, textureY); // Box 171
		bodyModel[141] = new ModelRendererTurbo(this, 505, 41, textureX, textureY); // Box 172
		bodyModel[142] = new ModelRendererTurbo(this, 441, 49, textureX, textureY); // Box 177
		bodyModel[143] = new ModelRendererTurbo(this, 449, 49, textureX, textureY); // Box 214
		bodyModel[144] = new ModelRendererTurbo(this, 473, 41, textureX, textureY); // Box 215
		bodyModel[145] = new ModelRendererTurbo(this, 105, 49, textureX, textureY); // Box 216
		bodyModel[146] = new ModelRendererTurbo(this, 281, 49, textureX, textureY); // Box 217
		bodyModel[147] = new ModelRendererTurbo(this, 457, 49, textureX, textureY); // Box 218
		bodyModel[148] = new ModelRendererTurbo(this, 465, 49, textureX, textureY); // Box 219
		bodyModel[149] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 220
		bodyModel[150] = new ModelRendererTurbo(this, 9, 57, textureX, textureY); // Box 221
		bodyModel[151] = new ModelRendererTurbo(this, 17, 57, textureX, textureY); // Box 222
		bodyModel[152] = new ModelRendererTurbo(this, 25, 57, textureX, textureY); // Box 223
		bodyModel[153] = new ModelRendererTurbo(this, 33, 57, textureX, textureY); // Box 224
		bodyModel[154] = new ModelRendererTurbo(this, 41, 57, textureX, textureY); // Box 225
		bodyModel[155] = new ModelRendererTurbo(this, 49, 57, textureX, textureY); // Box 380
		bodyModel[156] = new ModelRendererTurbo(this, 65, 57, textureX, textureY); // Box 381
		bodyModel[157] = new ModelRendererTurbo(this, 81, 57, textureX, textureY); // Box 383
		bodyModel[158] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 387
		bodyModel[159] = new ModelRendererTurbo(this, 89, 57, textureX, textureY); // Box 219
		bodyModel[160] = new ModelRendererTurbo(this, 153, 57, textureX, textureY); // Box 220
		bodyModel[161] = new ModelRendererTurbo(this, 169, 57, textureX, textureY); // Box 222
		bodyModel[162] = new ModelRendererTurbo(this, 17, 57, textureX, textureY); // Box 225
		bodyModel[163] = new ModelRendererTurbo(this, 177, 57, textureX, textureY); // Box 227
		bodyModel[164] = new ModelRendererTurbo(this, 193, 57, textureX, textureY); // Box 228
		bodyModel[165] = new ModelRendererTurbo(this, 225, 57, textureX, textureY); // Box 229
		bodyModel[166] = new ModelRendererTurbo(this, 129, 57, textureX, textureY); // Box 230
		bodyModel[167] = new ModelRendererTurbo(this, 241, 57, textureX, textureY); // Box 231
		bodyModel[168] = new ModelRendererTurbo(this, 257, 57, textureX, textureY); // Box 232
		bodyModel[169] = new ModelRendererTurbo(this, 273, 57, textureX, textureY); // Box 233
		bodyModel[170] = new ModelRendererTurbo(this, 281, 57, textureX, textureY); // Box 234
		bodyModel[171] = new ModelRendererTurbo(this, 185, 9, textureX, textureY); // Box 235
		bodyModel[172] = new ModelRendererTurbo(this, 313, 33, textureX, textureY); // Box 236
		bodyModel[173] = new ModelRendererTurbo(this, 241, 57, textureX, textureY); // Box 237
		bodyModel[174] = new ModelRendererTurbo(this, 249, 57, textureX, textureY); // Box 238
		bodyModel[175] = new ModelRendererTurbo(this, 385, 57, textureX, textureY); // Box 239
		bodyModel[176] = new ModelRendererTurbo(this, 473, 57, textureX, textureY); // Box 240
		bodyModel[177] = new ModelRendererTurbo(this, 393, 57, textureX, textureY); // Box 241
		bodyModel[178] = new ModelRendererTurbo(this, 401, 57, textureX, textureY); // Box 242
		bodyModel[179] = new ModelRendererTurbo(this, 313, 65, textureX, textureY); // Box 243
		bodyModel[180] = new ModelRendererTurbo(this, 441, 57, textureX, textureY); // Box 244
		bodyModel[181] = new ModelRendererTurbo(this, 457, 57, textureX, textureY); // Box 245
		bodyModel[182] = new ModelRendererTurbo(this, 169, 73, textureX, textureY); // Box 246
		bodyModel[183] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 247
		bodyModel[184] = new ModelRendererTurbo(this, 497, 57, textureX, textureY); // Box 249
		bodyModel[185] = new ModelRendererTurbo(this, 49, 65, textureX, textureY); // Box 250
		bodyModel[186] = new ModelRendererTurbo(this, 89, 81, textureX, textureY); // Box 251
		bodyModel[187] = new ModelRendererTurbo(this, 193, 89, textureX, textureY); // Box 252
		bodyModel[188] = new ModelRendererTurbo(this, 49, 65, textureX, textureY); // Box 256
		bodyModel[189] = new ModelRendererTurbo(this, 457, 65, textureX, textureY); // Box 257
		bodyModel[190] = new ModelRendererTurbo(this, 73, 65, textureX, textureY); // Box 258
		bodyModel[191] = new ModelRendererTurbo(this, 81, 65, textureX, textureY); // Box 259
		bodyModel[192] = new ModelRendererTurbo(this, 313, 65, textureX, textureY); // Box 282
		bodyModel[193] = new ModelRendererTurbo(this, 425, 65, textureX, textureY); // Box 308
		bodyModel[194] = new ModelRendererTurbo(this, 481, 65, textureX, textureY); // Box 345
		bodyModel[195] = new ModelRendererTurbo(this, 497, 65, textureX, textureY); // Box 368
		bodyModel[196] = new ModelRendererTurbo(this, 441, 73, textureX, textureY); // Box 380
		bodyModel[197] = new ModelRendererTurbo(this, 489, 81, textureX, textureY); // Box 393
		bodyModel[198] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 404
		bodyModel[199] = new ModelRendererTurbo(this, 17, 89, textureX, textureY); // Box 416
		bodyModel[200] = new ModelRendererTurbo(this, 33, 89, textureX, textureY); // Box 428
		bodyModel[201] = new ModelRendererTurbo(this, 49, 89, textureX, textureY); // Box 429
		bodyModel[202] = new ModelRendererTurbo(this, 65, 89, textureX, textureY); // Box 430
		bodyModel[203] = new ModelRendererTurbo(this, 81, 89, textureX, textureY); // Box 431
		bodyModel[204] = new ModelRendererTurbo(this, 97, 97, textureX, textureY); // Box 432
		bodyModel[205] = new ModelRendererTurbo(this, 305, 97, textureX, textureY); // Box 433
		bodyModel[206] = new ModelRendererTurbo(this, 401, 97, textureX, textureY); // Box 434
		bodyModel[207] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 435
		bodyModel[208] = new ModelRendererTurbo(this, 193, 105, textureX, textureY); // Box 436
		bodyModel[209] = new ModelRendererTurbo(this, 401, 105, textureX, textureY); // Box 437
		bodyModel[210] = new ModelRendererTurbo(this, 321, 65, textureX, textureY); // Box 438
		bodyModel[211] = new ModelRendererTurbo(this, 169, 65, textureX, textureY); // Box 439
		bodyModel[212] = new ModelRendererTurbo(this, 297, 65, textureX, textureY); // Box 440
		bodyModel[213] = new ModelRendererTurbo(this, 489, 97, textureX, textureY); // Box 441
		bodyModel[214] = new ModelRendererTurbo(this, 281, 105, textureX, textureY); // Box 442
		bodyModel[215] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Box 443
		bodyModel[216] = new ModelRendererTurbo(this, 505, 81, textureX, textureY); // Box 444
		bodyModel[217] = new ModelRendererTurbo(this, 305, 65, textureX, textureY); // Box 445
		bodyModel[218] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 446
		bodyModel[219] = new ModelRendererTurbo(this, 17, 113, textureX, textureY); // Box 447
		bodyModel[220] = new ModelRendererTurbo(this, 9, 73, textureX, textureY); // Box 448
		bodyModel[221] = new ModelRendererTurbo(this, 17, 73, textureX, textureY); // Box 450
		bodyModel[222] = new ModelRendererTurbo(this, 25, 73, textureX, textureY); // Box 451
		bodyModel[223] = new ModelRendererTurbo(this, 33, 73, textureX, textureY); // Box 452
		bodyModel[224] = new ModelRendererTurbo(this, 41, 73, textureX, textureY); // Box 454
		bodyModel[225] = new ModelRendererTurbo(this, 49, 73, textureX, textureY); // Box 455
		bodyModel[226] = new ModelRendererTurbo(this, 457, 73, textureX, textureY); // Box 457
		bodyModel[227] = new ModelRendererTurbo(this, 193, 81, textureX, textureY); // Box 459
		bodyModel[228] = new ModelRendererTurbo(this, 201, 81, textureX, textureY); // Box 460
		bodyModel[229] = new ModelRendererTurbo(this, 105, 113, textureX, textureY); // Box 461
		bodyModel[230] = new ModelRendererTurbo(this, 209, 81, textureX, textureY); // Box 462
		bodyModel[231] = new ModelRendererTurbo(this, 217, 81, textureX, textureY); // Box 463
		bodyModel[232] = new ModelRendererTurbo(this, 225, 81, textureX, textureY); // Box 464
		bodyModel[233] = new ModelRendererTurbo(this, 233, 81, textureX, textureY); // Box 465
		bodyModel[234] = new ModelRendererTurbo(this, 241, 81, textureX, textureY); // Box 466
		bodyModel[235] = new ModelRendererTurbo(this, 249, 81, textureX, textureY); // Box 467
		bodyModel[236] = new ModelRendererTurbo(this, 257, 81, textureX, textureY); // Box 468
		bodyModel[237] = new ModelRendererTurbo(this, 57, 73, textureX, textureY); // Lamp iron Front 1
		bodyModel[238] = new ModelRendererTurbo(this, 465, 73, textureX, textureY); // Lamp iron Front 1
		bodyModel[239] = new ModelRendererTurbo(this, 297, 89, textureX, textureY); // Box 471
		bodyModel[240] = new ModelRendererTurbo(this, 305, 89, textureX, textureY); // Box 472
		bodyModel[241] = new ModelRendererTurbo(this, 441, 89, textureX, textureY); // Box 473
		bodyModel[242] = new ModelRendererTurbo(this, 449, 89, textureX, textureY); // Box 474
		bodyModel[243] = new ModelRendererTurbo(this, 457, 89, textureX, textureY); // Box 475
		bodyModel[244] = new ModelRendererTurbo(this, 465, 89, textureX, textureY); // Box 476
		bodyModel[245] = new ModelRendererTurbo(this, 473, 89, textureX, textureY); // Box 477
		bodyModel[246] = new ModelRendererTurbo(this, 481, 89, textureX, textureY); // Box 478
		bodyModel[247] = new ModelRendererTurbo(this, 505, 97, textureX, textureY); // Box 479
		bodyModel[248] = new ModelRendererTurbo(this, 89, 105, textureX, textureY); // Box 480
		bodyModel[249] = new ModelRendererTurbo(this, 297, 105, textureX, textureY); // Box 481
		bodyModel[250] = new ModelRendererTurbo(this, 505, 105, textureX, textureY); // Box 482
		bodyModel[251] = new ModelRendererTurbo(this, 193, 113, textureX, textureY); // Box 483
		bodyModel[252] = new ModelRendererTurbo(this, 201, 113, textureX, textureY); // Box 484
		bodyModel[253] = new ModelRendererTurbo(this, 209, 113, textureX, textureY); // Box 485
		bodyModel[254] = new ModelRendererTurbo(this, 217, 113, textureX, textureY); // Box 486
		bodyModel[255] = new ModelRendererTurbo(this, 225, 113, textureX, textureY); // Box 487
		bodyModel[256] = new ModelRendererTurbo(this, 233, 113, textureX, textureY); // Box 488
		bodyModel[257] = new ModelRendererTurbo(this, 241, 113, textureX, textureY); // Box 489
		bodyModel[258] = new ModelRendererTurbo(this, 249, 113, textureX, textureY); // Box 490
		bodyModel[259] = new ModelRendererTurbo(this, 257, 113, textureX, textureY); // Box 491
		bodyModel[260] = new ModelRendererTurbo(this, 265, 113, textureX, textureY); // Box 492
		bodyModel[261] = new ModelRendererTurbo(this, 273, 113, textureX, textureY); // Box 493
		bodyModel[262] = new ModelRendererTurbo(this, 297, 113, textureX, textureY); // Box 494
		bodyModel[263] = new ModelRendererTurbo(this, 305, 113, textureX, textureY); // Box 495
		bodyModel[264] = new ModelRendererTurbo(this, 313, 113, textureX, textureY); // Box 496
		bodyModel[265] = new ModelRendererTurbo(this, 321, 113, textureX, textureY); // Box 497
		bodyModel[266] = new ModelRendererTurbo(this, 329, 113, textureX, textureY); // Box 498
		bodyModel[267] = new ModelRendererTurbo(this, 337, 113, textureX, textureY); // Box 499
		bodyModel[268] = new ModelRendererTurbo(this, 345, 113, textureX, textureY); // Box 500
		bodyModel[269] = new ModelRendererTurbo(this, 353, 113, textureX, textureY); // Box 501
		bodyModel[270] = new ModelRendererTurbo(this, 361, 113, textureX, textureY); // Box 502
		bodyModel[271] = new ModelRendererTurbo(this, 369, 113, textureX, textureY); // Box 503
		bodyModel[272] = new ModelRendererTurbo(this, 377, 113, textureX, textureY); // Box 504
		bodyModel[273] = new ModelRendererTurbo(this, 385, 113, textureX, textureY); // Box 505
		bodyModel[274] = new ModelRendererTurbo(this, 393, 113, textureX, textureY); // Box 506
		bodyModel[275] = new ModelRendererTurbo(this, 401, 113, textureX, textureY); // Box 507
		bodyModel[276] = new ModelRendererTurbo(this, 409, 113, textureX, textureY); // Box 508
		bodyModel[277] = new ModelRendererTurbo(this, 417, 113, textureX, textureY); // Box 509
		bodyModel[278] = new ModelRendererTurbo(this, 425, 113, textureX, textureY); // Box 510
		bodyModel[279] = new ModelRendererTurbo(this, 433, 113, textureX, textureY); // Box 511
		bodyModel[280] = new ModelRendererTurbo(this, 441, 113, textureX, textureY); // Box 512
		bodyModel[281] = new ModelRendererTurbo(this, 449, 113, textureX, textureY); // Box 513
		bodyModel[282] = new ModelRendererTurbo(this, 457, 113, textureX, textureY); // Box 514
		bodyModel[283] = new ModelRendererTurbo(this, 465, 113, textureX, textureY); // Box 515
		bodyModel[284] = new ModelRendererTurbo(this, 473, 113, textureX, textureY); // Box 516
		bodyModel[285] = new ModelRendererTurbo(this, 481, 113, textureX, textureY); // Box 522
		bodyModel[286] = new ModelRendererTurbo(this, 489, 113, textureX, textureY); // Box 523
		bodyModel[287] = new ModelRendererTurbo(this, 497, 113, textureX, textureY); // Box 524
		bodyModel[288] = new ModelRendererTurbo(this, 505, 113, textureX, textureY); // Box 525
		bodyModel[289] = new ModelRendererTurbo(this, 17, 121, textureX, textureY); // Box 526
		bodyModel[290] = new ModelRendererTurbo(this, 25, 121, textureX, textureY); // Box 527
		bodyModel[291] = new ModelRendererTurbo(this, 33, 121, textureX, textureY); // Box 528
		bodyModel[292] = new ModelRendererTurbo(this, 41, 121, textureX, textureY); // Box 529
		bodyModel[293] = new ModelRendererTurbo(this, 49, 121, textureX, textureY); // Box 530
		bodyModel[294] = new ModelRendererTurbo(this, 57, 121, textureX, textureY); // Box 531
		bodyModel[295] = new ModelRendererTurbo(this, 65, 121, textureX, textureY); // Box 532
		bodyModel[296] = new ModelRendererTurbo(this, 73, 121, textureX, textureY); // Box 533
		bodyModel[297] = new ModelRendererTurbo(this, 81, 121, textureX, textureY); // Box 534
		bodyModel[298] = new ModelRendererTurbo(this, 89, 121, textureX, textureY); // Box 535
		bodyModel[299] = new ModelRendererTurbo(this, 97, 121, textureX, textureY); // Box 536
		bodyModel[300] = new ModelRendererTurbo(this, 105, 121, textureX, textureY); // Box 537
		bodyModel[301] = new ModelRendererTurbo(this, 113, 121, textureX, textureY); // Box 538
		bodyModel[302] = new ModelRendererTurbo(this, 121, 121, textureX, textureY); // Box 539
		bodyModel[303] = new ModelRendererTurbo(this, 129, 121, textureX, textureY); // Box 540
		bodyModel[304] = new ModelRendererTurbo(this, 137, 121, textureX, textureY); // Box 541
		bodyModel[305] = new ModelRendererTurbo(this, 145, 121, textureX, textureY); // Box 542
		bodyModel[306] = new ModelRendererTurbo(this, 153, 121, textureX, textureY); // Box 543
		bodyModel[307] = new ModelRendererTurbo(this, 161, 121, textureX, textureY); // Box 544
		bodyModel[308] = new ModelRendererTurbo(this, 169, 121, textureX, textureY); // Box 545
		bodyModel[309] = new ModelRendererTurbo(this, 177, 121, textureX, textureY); // Box 546
		bodyModel[310] = new ModelRendererTurbo(this, 185, 121, textureX, textureY); // Box 547
		bodyModel[311] = new ModelRendererTurbo(this, 193, 121, textureX, textureY); // Box 548
		bodyModel[312] = new ModelRendererTurbo(this, 201, 121, textureX, textureY); // Box 549
		bodyModel[313] = new ModelRendererTurbo(this, 209, 121, textureX, textureY); // Box 550
		bodyModel[314] = new ModelRendererTurbo(this, 217, 121, textureX, textureY); // Box 551
		bodyModel[315] = new ModelRendererTurbo(this, 225, 121, textureX, textureY); // Box 552
		bodyModel[316] = new ModelRendererTurbo(this, 233, 121, textureX, textureY); // Box 553
		bodyModel[317] = new ModelRendererTurbo(this, 241, 121, textureX, textureY); // Box 554
		bodyModel[318] = new ModelRendererTurbo(this, 249, 121, textureX, textureY); // Box 555
		bodyModel[319] = new ModelRendererTurbo(this, 257, 121, textureX, textureY); // Box 556
		bodyModel[320] = new ModelRendererTurbo(this, 265, 121, textureX, textureY); // Box 557
		bodyModel[321] = new ModelRendererTurbo(this, 273, 121, textureX, textureY); // Box 558
		bodyModel[322] = new ModelRendererTurbo(this, 281, 121, textureX, textureY); // Box 559
		bodyModel[323] = new ModelRendererTurbo(this, 289, 121, textureX, textureY); // Box 560
		bodyModel[324] = new ModelRendererTurbo(this, 297, 121, textureX, textureY); // Box 561
		bodyModel[325] = new ModelRendererTurbo(this, 305, 121, textureX, textureY); // Lamp iron Front 1
		bodyModel[326] = new ModelRendererTurbo(this, 313, 121, textureX, textureY); // Box 563
		bodyModel[327] = new ModelRendererTurbo(this, 321, 121, textureX, textureY); // Box 564
		bodyModel[328] = new ModelRendererTurbo(this, 329, 121, textureX, textureY); // Box 565
		bodyModel[329] = new ModelRendererTurbo(this, 337, 121, textureX, textureY); // Box 566
		bodyModel[330] = new ModelRendererTurbo(this, 345, 121, textureX, textureY); // Box 567
		bodyModel[331] = new ModelRendererTurbo(this, 353, 121, textureX, textureY); // Box 568
		bodyModel[332] = new ModelRendererTurbo(this, 361, 121, textureX, textureY); // Box 569
		bodyModel[333] = new ModelRendererTurbo(this, 369, 121, textureX, textureY); // Box 570
		bodyModel[334] = new ModelRendererTurbo(this, 377, 121, textureX, textureY); // Lamp iron Back 1
		bodyModel[335] = new ModelRendererTurbo(this, 385, 121, textureX, textureY); // Box 572
		bodyModel[336] = new ModelRendererTurbo(this, 393, 121, textureX, textureY); // Box 573
		bodyModel[337] = new ModelRendererTurbo(this, 401, 121, textureX, textureY); // Lamp iron Back 1
		bodyModel[338] = new ModelRendererTurbo(this, 409, 121, textureX, textureY); // Lamp iron Back 1
		bodyModel[339] = new ModelRendererTurbo(this, 417, 121, textureX, textureY); // Box 576
		bodyModel[340] = new ModelRendererTurbo(this, 425, 121, textureX, textureY); // Box 577
		bodyModel[341] = new ModelRendererTurbo(this, 433, 121, textureX, textureY); // Lamp iron Back 1
		bodyModel[342] = new ModelRendererTurbo(this, 441, 121, textureX, textureY); // Box 579
		bodyModel[343] = new ModelRendererTurbo(this, 1, 121, textureX, textureY); // Box 580
		bodyModel[344] = new ModelRendererTurbo(this, 449, 121, textureX, textureY); // Box 581
		bodyModel[345] = new ModelRendererTurbo(this, 449, 121, textureX, textureY); // Box 582
		bodyModel[346] = new ModelRendererTurbo(this, 465, 121, textureX, textureY); // Box 583
		bodyModel[347] = new ModelRendererTurbo(this, 473, 121, textureX, textureY); // Lamp iron Front 1
		bodyModel[348] = new ModelRendererTurbo(this, 481, 121, textureX, textureY); // Lamp1
		bodyModel[349] = new ModelRendererTurbo(this, 489, 121, textureX, textureY); // Lamp
		bodyModel[350] = new ModelRendererTurbo(this, 497, 121, textureX, textureY); // Lamp
		bodyModel[351] = new ModelRendererTurbo(this, 505, 121, textureX, textureY); // Lamp
		bodyModel[352] = new ModelRendererTurbo(this, 25, 129, textureX, textureY); // Lamp
		bodyModel[353] = new ModelRendererTurbo(this, 33, 129, textureX, textureY); // Box 590
		bodyModel[354] = new ModelRendererTurbo(this, 41, 129, textureX, textureY); // Box 595
		bodyModel[355] = new ModelRendererTurbo(this, 97, 129, textureX, textureY); // Box 596
		bodyModel[356] = new ModelRendererTurbo(this, 329, 33, textureX, textureY); // Box 597
		bodyModel[357] = new ModelRendererTurbo(this, 137, 41, textureX, textureY); // Box 598
		bodyModel[358] = new ModelRendererTurbo(this, 305, 41, textureX, textureY); // Box 599
		bodyModel[359] = new ModelRendererTurbo(this, 489, 73, textureX, textureY); // Box 600
		bodyModel[360] = new ModelRendererTurbo(this, 449, 81, textureX, textureY); // Box 601
		bodyModel[361] = new ModelRendererTurbo(this, 497, 89, textureX, textureY); // Box 602
		bodyModel[362] = new ModelRendererTurbo(this, 153, 129, textureX, textureY); // Box 603
		bodyModel[363] = new ModelRendererTurbo(this, 9, 97, textureX, textureY); // Box 604
		bodyModel[364] = new ModelRendererTurbo(this, 489, 57, textureX, textureY); // Box 605
		bodyModel[365] = new ModelRendererTurbo(this, 497, 105, textureX, textureY); // Box 606
		bodyModel[366] = new ModelRendererTurbo(this, 161, 129, textureX, textureY); // Box 607
		bodyModel[367] = new ModelRendererTurbo(this, 97, 113, textureX, textureY); // Box 608
		bodyModel[368] = new ModelRendererTurbo(this, 249, 65, textureX, textureY); // Box 609
		bodyModel[369] = new ModelRendererTurbo(this, 185, 113, textureX, textureY); // Box 610
		bodyModel[370] = new ModelRendererTurbo(this, 161, 129, textureX, textureY); // Box 112
		bodyModel[371] = new ModelRendererTurbo(this, 169, 129, textureX, textureY); // Box 117
		bodyModel[372] = new ModelRendererTurbo(this, 265, 65, textureX, textureY); // Box 118
		bodyModel[373] = new ModelRendererTurbo(this, 185, 129, textureX, textureY); // Box 119
		bodyModel[374] = new ModelRendererTurbo(this, 193, 129, textureX, textureY); // Box 120
		bodyModel[375] = new ModelRendererTurbo(this, 209, 129, textureX, textureY); // Box 121
		bodyModel[376] = new ModelRendererTurbo(this, 225, 129, textureX, textureY); // Box 197
		bodyModel[377] = new ModelRendererTurbo(this, 233, 129, textureX, textureY); // Box 198
		bodyModel[378] = new ModelRendererTurbo(this, 241, 129, textureX, textureY); // Box 199
		bodyModel[379] = new ModelRendererTurbo(this, 249, 129, textureX, textureY); // Box 129
		bodyModel[380] = new ModelRendererTurbo(this, 257, 129, textureX, textureY); // Box 173
		bodyModel[381] = new ModelRendererTurbo(this, 273, 129, textureX, textureY); // Box 622
		bodyModel[382] = new ModelRendererTurbo(this, 297, 129, textureX, textureY); // Box 623
		bodyModel[383] = new ModelRendererTurbo(this, 321, 129, textureX, textureY); // Box 624
		bodyModel[384] = new ModelRendererTurbo(this, 345, 129, textureX, textureY); // Box 625
		bodyModel[385] = new ModelRendererTurbo(this, 473, 129, textureX, textureY); // Box 626
		bodyModel[386] = new ModelRendererTurbo(this, 1, 137, textureX, textureY); // Box 627
		bodyModel[387] = new ModelRendererTurbo(this, 25, 137, textureX, textureY); // Box 628
		bodyModel[388] = new ModelRendererTurbo(this, 49, 137, textureX, textureY); // Box 629
		bodyModel[389] = new ModelRendererTurbo(this, 433, 129, textureX, textureY, "Lamp"); // Lamp
		bodyModel[390] = new ModelRendererTurbo(this, 441, 129, textureX, textureY); // Box 485
		bodyModel[391] = new ModelRendererTurbo(this, 497, 129, textureX, textureY); // Box 486
		bodyModel[392] = new ModelRendererTurbo(this, 505, 129, textureX, textureY, "Lamp"); // Lamp
		bodyModel[393] = new ModelRendererTurbo(this, 137, 137, textureX, textureY, "Lamp"); // Lamp
		bodyModel[394] = new ModelRendererTurbo(this, 145, 137, textureX, textureY, "Lamp"); // Lamp
		bodyModel[395] = new ModelRendererTurbo(this, 153, 137, textureX, textureY, "Lamp"); // Lamp
		bodyModel[396] = new ModelRendererTurbo(this, 161, 137, textureX, textureY, "Lamp"); // Lamp
		bodyModel[397] = new ModelRendererTurbo(this, 169, 137, textureX, textureY, "Lamp"); // Lamp
		bodyModel[398] = new ModelRendererTurbo(this, 185, 137, textureX, textureY, "Lamp"); // Lamp
		bodyModel[399] = new ModelRendererTurbo(this, 193, 137, textureX, textureY); // Box 494
		bodyModel[400] = new ModelRendererTurbo(this, 201, 137, textureX, textureY); // Box 495
		bodyModel[401] = new ModelRendererTurbo(this, 209, 137, textureX, textureY, "Lamp"); // Lamp
		bodyModel[402] = new ModelRendererTurbo(this, 217, 137, textureX, textureY, "Lamp"); // Lamp
		bodyModel[403] = new ModelRendererTurbo(this, 225, 137, textureX, textureY, "Lamp"); // Lamp
		bodyModel[404] = new ModelRendererTurbo(this, 233, 137, textureX, textureY, "Lamp"); // Lamp
		bodyModel[405] = new ModelRendererTurbo(this, 241, 137, textureX, textureY); // Box 500
		bodyModel[406] = new ModelRendererTurbo(this, 249, 137, textureX, textureY); // Box 501
		bodyModel[407] = new ModelRendererTurbo(this, 257, 137, textureX, textureY, "Lamp"); // Lamp
		bodyModel[408] = new ModelRendererTurbo(this, 265, 137, textureX, textureY, "Lamp"); // Lamp
		bodyModel[409] = new ModelRendererTurbo(this, 345, 137, textureX, textureY, "Lamp"); // Lamp
		bodyModel[410] = new ModelRendererTurbo(this, 353, 137, textureX, textureY, "Lamp"); // Lamp
		bodyModel[411] = new ModelRendererTurbo(this, 361, 137, textureX, textureY); // Box 506
		bodyModel[412] = new ModelRendererTurbo(this, 369, 137, textureX, textureY, "Lamp"); // Box 507
		bodyModel[413] = new ModelRendererTurbo(this, 377, 137, textureX, textureY, "Lamp"); // Lamp
		bodyModel[414] = new ModelRendererTurbo(this, 385, 137, textureX, textureY, "Lamp"); // Lamp
		bodyModel[415] = new ModelRendererTurbo(this, 393, 137, textureX, textureY, "Lamp"); // Lamp
		bodyModel[416] = new ModelRendererTurbo(this, 401, 137, textureX, textureY, "Lamp"); // Lamp
		bodyModel[417] = new ModelRendererTurbo(this, 409, 137, textureX, textureY); // Box 512
		bodyModel[418] = new ModelRendererTurbo(this, 417, 137, textureX, textureY); // Box 513
		bodyModel[419] = new ModelRendererTurbo(this, 425, 137, textureX, textureY, "Lamp"); // Lamp
		bodyModel[420] = new ModelRendererTurbo(this, 433, 137, textureX, textureY, "Lamp"); // Lamp
		bodyModel[421] = new ModelRendererTurbo(this, 441, 137, textureX, textureY, "Lamp"); // Lamp
		bodyModel[422] = new ModelRendererTurbo(this, 449, 137, textureX, textureY, "Lamp"); // Lamp
		bodyModel[423] = new ModelRendererTurbo(this, 457, 137, textureX, textureY); // Box 518
		bodyModel[424] = new ModelRendererTurbo(this, 465, 137, textureX, textureY); // Box 519
		bodyModel[425] = new ModelRendererTurbo(this, 497, 137, textureX, textureY, "Lamp"); // Lamp
		bodyModel[426] = new ModelRendererTurbo(this, 505, 137, textureX, textureY, "Lamp"); // Lamp
		bodyModel[427] = new ModelRendererTurbo(this, 49, 145, textureX, textureY, "Lamp"); // Lamp
		bodyModel[428] = new ModelRendererTurbo(this, 57, 145, textureX, textureY, "Lamp"); // Lamp
		bodyModel[429] = new ModelRendererTurbo(this, 65, 145, textureX, textureY); // Box 524
		bodyModel[430] = new ModelRendererTurbo(this, 73, 145, textureX, textureY); // Box 525
		bodyModel[431] = new ModelRendererTurbo(this, 81, 145, textureX, textureY); // Box 526
		bodyModel[432] = new ModelRendererTurbo(this, 97, 145, textureX, textureY); // Box 527
		bodyModel[433] = new ModelRendererTurbo(this, 105, 145, textureX, textureY); // Box 528
		bodyModel[434] = new ModelRendererTurbo(this, 113, 145, textureX, textureY); // Box 529
		bodyModel[435] = new ModelRendererTurbo(this, 121, 145, textureX, textureY); // Box 530
		bodyModel[436] = new ModelRendererTurbo(this, 129, 145, textureX, textureY); // Box 531
		bodyModel[437] = new ModelRendererTurbo(this, 145, 145, textureX, textureY); // Box 532
		bodyModel[438] = new ModelRendererTurbo(this, 153, 145, textureX, textureY); // Box 533
		bodyModel[439] = new ModelRendererTurbo(this, 201, 145, textureX, textureY); // Box 534
		bodyModel[440] = new ModelRendererTurbo(this, 209, 145, textureX, textureY); // Box 535
		bodyModel[441] = new ModelRendererTurbo(this, 217, 145, textureX, textureY); // Box 614
		bodyModel[442] = new ModelRendererTurbo(this, 225, 145, textureX, textureY); // Box 615
		bodyModel[443] = new ModelRendererTurbo(this, 233, 145, textureX, textureY); // Box 616
		bodyModel[444] = new ModelRendererTurbo(this, 241, 145, textureX, textureY); // Box 617
		bodyModel[445] = new ModelRendererTurbo(this, 249, 145, textureX, textureY); // Box 618
		bodyModel[446] = new ModelRendererTurbo(this, 257, 145, textureX, textureY); // Box 619
		bodyModel[447] = new ModelRendererTurbo(this, 265, 145, textureX, textureY); // Box 620
		bodyModel[448] = new ModelRendererTurbo(this, 273, 145, textureX, textureY); // Box 621
		bodyModel[449] = new ModelRendererTurbo(this, 281, 145, textureX, textureY); // Box 622
		bodyModel[450] = new ModelRendererTurbo(this, 289, 145, textureX, textureY); // Box 623
		bodyModel[451] = new ModelRendererTurbo(this, 297, 145, textureX, textureY); // Box 624
		bodyModel[452] = new ModelRendererTurbo(this, 305, 145, textureX, textureY); // Box 625
		bodyModel[453] = new ModelRendererTurbo(this, 313, 145, textureX, textureY); // Box 626
		bodyModel[454] = new ModelRendererTurbo(this, 321, 145, textureX, textureY); // Box 557
		bodyModel[455] = new ModelRendererTurbo(this, 345, 145, textureX, textureY); // Box 567
		bodyModel[456] = new ModelRendererTurbo(this, 369, 145, textureX, textureY); // Box 558
		bodyModel[457] = new ModelRendererTurbo(this, 1, 153, textureX, textureY); // Box 559
		bodyModel[458] = new ModelRendererTurbo(this, 201, 153, textureX, textureY); // Box 560
		bodyModel[459] = new ModelRendererTurbo(this, 289, 153, textureX, textureY); // Box 561
		bodyModel[460] = new ModelRendererTurbo(this, 377, 153, textureX, textureY); // Box 562
		bodyModel[461] = new ModelRendererTurbo(this, 1, 161, textureX, textureY); // Box 563
		bodyModel[462] = new ModelRendererTurbo(this, 89, 161, textureX, textureY); // Box 564
		bodyModel[463] = new ModelRendererTurbo(this, 177, 161, textureX, textureY); // Box 565
		bodyModel[464] = new ModelRendererTurbo(this, 265, 161, textureX, textureY); // Box 566
		bodyModel[465] = new ModelRendererTurbo(this, 353, 161, textureX, textureY); // Box 567
		bodyModel[466] = new ModelRendererTurbo(this, 1, 169, textureX, textureY); // Box 568
		bodyModel[467] = new ModelRendererTurbo(this, 89, 169, textureX, textureY); // Box 569
		bodyModel[468] = new ModelRendererTurbo(this, 177, 169, textureX, textureY); // Box 570
		bodyModel[469] = new ModelRendererTurbo(this, 265, 169, textureX, textureY); // Box 571
		bodyModel[470] = new ModelRendererTurbo(this, 353, 169, textureX, textureY); // Box 572
		bodyModel[471] = new ModelRendererTurbo(this, 1, 177, textureX, textureY); // Box 573
		bodyModel[472] = new ModelRendererTurbo(this, 89, 177, textureX, textureY); // Box 574
		bodyModel[473] = new ModelRendererTurbo(this, 177, 177, textureX, textureY); // Box 575
		bodyModel[474] = new ModelRendererTurbo(this, 265, 177, textureX, textureY); // Box 576
		bodyModel[475] = new ModelRendererTurbo(this, 353, 177, textureX, textureY); // Box 577
		bodyModel[476] = new ModelRendererTurbo(this, 1, 185, textureX, textureY); // Box 578
		bodyModel[477] = new ModelRendererTurbo(this, 89, 185, textureX, textureY); // Box 579
		bodyModel[478] = new ModelRendererTurbo(this, 281, 105, textureX, textureY); // Box 580
		bodyModel[479] = new ModelRendererTurbo(this, 281, 129, textureX, textureY); // Box 581
		bodyModel[480] = new ModelRendererTurbo(this, 305, 129, textureX, textureY); // Box 582
		bodyModel[481] = new ModelRendererTurbo(this, 329, 129, textureX, textureY); // Box 583
		bodyModel[482] = new ModelRendererTurbo(this, 481, 129, textureX, textureY); // Box 584
		bodyModel[483] = new ModelRendererTurbo(this, 9, 137, textureX, textureY); // Box 585
		bodyModel[484] = new ModelRendererTurbo(this, 33, 137, textureX, textureY); // Box 586
		bodyModel[485] = new ModelRendererTurbo(this, 81, 145, textureX, textureY); // Box 587
		bodyModel[486] = new ModelRendererTurbo(this, 129, 145, textureX, textureY); // Box 588
		bodyModel[487] = new ModelRendererTurbo(this, 185, 145, textureX, textureY); // Box 589
		bodyModel[488] = new ModelRendererTurbo(this, 449, 145, textureX, textureY); // Box 590
		bodyModel[489] = new ModelRendererTurbo(this, 465, 145, textureX, textureY); // Box 591
		bodyModel[490] = new ModelRendererTurbo(this, 481, 145, textureX, textureY); // Box 592
		bodyModel[491] = new ModelRendererTurbo(this, 73, 153, textureX, textureY); // Box 593
		bodyModel[492] = new ModelRendererTurbo(this, 457, 153, textureX, textureY); // Box 594
		bodyModel[493] = new ModelRendererTurbo(this, 473, 153, textureX, textureY); // Box 595
		bodyModel[494] = new ModelRendererTurbo(this, 161, 161, textureX, textureY); // Box 596
		bodyModel[495] = new ModelRendererTurbo(this, 249, 161, textureX, textureY); // Box 597
		bodyModel[496] = new ModelRendererTurbo(this, 337, 161, textureX, textureY); // Box 598
		bodyModel[497] = new ModelRendererTurbo(this, 425, 161, textureX, textureY); // Box 599
		bodyModel[498] = new ModelRendererTurbo(this, 441, 161, textureX, textureY); // Box 600
		bodyModel[499] = new ModelRendererTurbo(this, 465, 161, textureX, textureY); // Box 603

		bodyModel[0].addBox(0F, 0F, 0F, 70, 1, 22, 0F); // Box 0
		bodyModel[0].setRotationPoint(-35F, 0F, -11F);

		bodyModel[1].addBox(0F, 0F, 0F, 1, 2, 22, 0F); // Box 2
		bodyModel[1].setRotationPoint(-35F, 1F, -11F);

		bodyModel[2].addBox(0F, 0F, 0F, 68, 6, 12, 0F); // Box 4
		bodyModel[2].setRotationPoint(-34F, 1F, -6F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 4, 5, 1, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[3].setRotationPoint(-38F, 3F, -9.5F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, -1.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		bodyModel[4].setRotationPoint(-35F, 3F, 10F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 4, 5, 1, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 23
		bodyModel[5].setRotationPoint(-38F, 3F, -11F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 4, 5, 1, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 24
		bodyModel[6].setRotationPoint(-38F, 3F, -8F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 4, 5, 1, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 25
		bodyModel[7].setRotationPoint(-38F, 3F, -6.5F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 4, 5, 1, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[8].setRotationPoint(-38F, 3F, -2F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 4, 5, 1, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 27
		bodyModel[9].setRotationPoint(-38F, 3F, -0.5F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 4, 5, 1, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 28
		bodyModel[10].setRotationPoint(-38F, 3F, -5F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 4, 5, 1, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 29
		bodyModel[11].setRotationPoint(-38F, 3F, -3.5F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 4, 5, 1, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 34
		bodyModel[12].setRotationPoint(-38F, 3F, 2.5F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 4, 5, 1, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 35
		bodyModel[13].setRotationPoint(-38F, 3F, 1F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 4, 5, 1, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 36
		bodyModel[14].setRotationPoint(-38F, 3F, 7F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 4, 5, 1, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 37
		bodyModel[15].setRotationPoint(-38F, 3F, 5.5F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 4, 5, 1, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[16].setRotationPoint(-38F, 3F, 4F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 4, 5, 1, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 39
		bodyModel[17].setRotationPoint(-38F, 3F, 8.5F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 4, 5, 1, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[18].setRotationPoint(-38F, 3F, 10F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, -1.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 42
		bodyModel[19].setRotationPoint(-35F, 3F, -11F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, -2.2F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -2.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
		bodyModel[20].setRotationPoint(-36.5F, 5F, -11F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, -2.2F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -2.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 44
		bodyModel[21].setRotationPoint(-36.5F, 5F, 10F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 2, 1, 22, 0F,-1.1F, -0.6F, 0F, -0.7F, -0.6F, 0F, -0.7F, -0.6F, 0F, -1.1F, -0.6F, 0F, -0.7F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.7F, 0F, 0F); // Box 45
		bodyModel[22].setRotationPoint(-39F, 7F, -11F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,-1.1F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, 0F, -1.1F, -0.6F, 0F, -0.7F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, -0.7F, 0F, 0F); // Box 46
		bodyModel[23].setRotationPoint(-39F, 7F, -12F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,-1.1F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.8F, -1.1F, -0.6F, -0.8F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, -0.7F, 0F, -0.8F); // Box 47
		bodyModel[24].setRotationPoint(-39F, 7F, 11F);

		bodyModel[25].addBox(0F, 0F, 0F, 54, 7, 3, 0F); // Box 49
		bodyModel[25].setRotationPoint(-27F, 1F, -11F);

		bodyModel[26].addBox(0F, 0F, 0F, 2, 7, 3, 0F); // Box 50
		bodyModel[26].setRotationPoint(-34F, 1F, -11F);

		bodyModel[27].addBox(0F, 0F, 0F, 5, 1, 2, 0F); // Box 51
		bodyModel[27].setRotationPoint(-32F, 2.5F, -11F);

		bodyModel[28].addBox(0F, 0F, 0F, 5, 2, 2, 0F); // Box 52
		bodyModel[28].setRotationPoint(-32F, 6F, -11F);

		bodyModel[29].addBox(0F, 0F, 0F, 5, 7, 1, 0F); // Box 53
		bodyModel[29].setRotationPoint(-32F, 1F, -9F);

		bodyModel[30].addBox(0F, 0F, 0F, 1, 2, 22, 0F); // Box 54
		bodyModel[30].setRotationPoint(34F, 1F, -11F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 4, 5, 1, 0F,0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 55
		bodyModel[31].setRotationPoint(34F, 3F, -9.5F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, -1.7F, 0F, 0F, -1.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 56
		bodyModel[32].setRotationPoint(34F, 3F, 10F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 4, 5, 1, 0F,0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 57
		bodyModel[33].setRotationPoint(34F, 3F, -11F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 4, 5, 1, 0F,0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 58
		bodyModel[34].setRotationPoint(34F, 3F, -8F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 4, 5, 1, 0F,0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 59
		bodyModel[35].setRotationPoint(34F, 3F, -6.5F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 4, 5, 1, 0F,0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 60
		bodyModel[36].setRotationPoint(34F, 3F, -2F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 4, 5, 1, 0F,0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 61
		bodyModel[37].setRotationPoint(34F, 3F, -0.5F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 4, 5, 1, 0F,0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 62
		bodyModel[38].setRotationPoint(34F, 3F, -5F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 4, 5, 1, 0F,0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 63
		bodyModel[39].setRotationPoint(34F, 3F, -3.5F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 4, 5, 1, 0F,0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 64
		bodyModel[40].setRotationPoint(34F, 3F, 2.5F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 4, 5, 1, 0F,0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 65
		bodyModel[41].setRotationPoint(34F, 3F, 1F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 4, 5, 1, 0F,0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 66
		bodyModel[42].setRotationPoint(34F, 3F, 7F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 4, 5, 1, 0F,0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 67
		bodyModel[43].setRotationPoint(34F, 3F, 5.5F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 4, 5, 1, 0F,0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 68
		bodyModel[44].setRotationPoint(34F, 3F, 4F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 4, 5, 1, 0F,0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 69
		bodyModel[45].setRotationPoint(34F, 3F, 8.5F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 4, 5, 1, 0F,0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 70
		bodyModel[46].setRotationPoint(34F, 3F, 10F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, -1.7F, 0F, 0F, -1.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 71
		bodyModel[47].setRotationPoint(34F, 3F, -11F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, -0.5F, 0F, 0F, -2.2F, 0F, 0F, -2.2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 72
		bodyModel[48].setRotationPoint(35.5F, 5F, -11F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, -0.5F, 0F, 0F, -2.2F, 0F, 0F, -2.2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		bodyModel[49].setRotationPoint(35.5F, 5F, 10F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 2, 1, 22, 0F,-0.7F, -0.6F, 0F, -1.1F, -0.6F, 0F, -1.1F, -0.6F, 0F, -0.7F, -0.6F, 0F, -1F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -1F, 0F, 0F); // Box 74
		bodyModel[50].setRotationPoint(37F, 7F, -11F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, -0.6F, -0.8F, -1.1F, -0.6F, -0.8F, -1.1F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, -0.8F, -0.7F, 0F, -0.8F, -0.7F, 0F, 0F, 0F, 0F, 0F); // Box 75
		bodyModel[51].setRotationPoint(34F, 7F, -12F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, -0.6F, 0F, -1.1F, -0.6F, 0F, -1.1F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, -0.8F, 0F, 0F, -0.8F); // Box 76
		bodyModel[52].setRotationPoint(34F, 7F, 11F);

		bodyModel[53].addBox(0F, 0F, 0F, 2, 7, 3, 0F); // Box 77
		bodyModel[53].setRotationPoint(32F, 1F, -11F);

		bodyModel[54].addBox(0F, 0F, 0F, 5, 1, 2, 0F); // Box 78
		bodyModel[54].setRotationPoint(-32F, 2.5F, 9F);

		bodyModel[55].addBox(0F, 0F, 0F, 5, 2, 2, 0F); // Box 79
		bodyModel[55].setRotationPoint(-32F, 6F, 9F);

		bodyModel[56].addBox(0F, 0F, 0F, 5, 1, 2, 0F); // Box 80
		bodyModel[56].setRotationPoint(27F, 2.5F, 9F);

		bodyModel[57].addBox(0F, 0F, 0F, 5, 2, 2, 0F); // Box 81
		bodyModel[57].setRotationPoint(27F, 6F, 9F);

		bodyModel[58].addBox(0F, 0F, 0F, 5, 2, 2, 0F); // Box 82
		bodyModel[58].setRotationPoint(27F, 6F, -11F);

		bodyModel[59].addBox(0F, 0F, 0F, 5, 1, 2, 0F); // Box 83
		bodyModel[59].setRotationPoint(27F, 2.5F, -11F);

		bodyModel[60].addBox(0F, 0F, 0F, 5, 7, 1, 0F); // Box 84
		bodyModel[60].setRotationPoint(27F, 1F, -9F);

		bodyModel[61].addBox(0F, 0F, 0F, 54, 7, 3, 0F); // Box 86
		bodyModel[61].setRotationPoint(-27F, 1F, 8F);

		bodyModel[62].addBox(0F, 0F, 0F, 2, 7, 3, 0F); // Box 87
		bodyModel[62].setRotationPoint(-34F, 1F, 8F);

		bodyModel[63].addBox(0F, 0F, 0F, 2, 7, 3, 0F); // Box 88
		bodyModel[63].setRotationPoint(32F, 1F, 8F);

		bodyModel[64].addBox(0F, 0F, 0F, 5, 7, 1, 0F); // Box 90
		bodyModel[64].setRotationPoint(-32F, 1F, 8F);

		bodyModel[65].addBox(0F, 0F, 0F, 5, 7, 1, 0F); // Box 91
		bodyModel[65].setRotationPoint(27F, 1F, 8F);

		bodyModel[66].addBox(0F, 0F, 0F, 4, 2, 2, 0F); // Box 92
		bodyModel[66].setRotationPoint(-39F, 1F, -1F);

		bodyModel[67].addBox(0F, 0F, 0F, 4, 2, 2, 0F); // Box 93
		bodyModel[67].setRotationPoint(35F, 1F, -1F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.5F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.4F, 0F, -0.4F, -0.3F, 0F, 0F, 0F, -0.5F, -0.2F, 0F); // Box 94
		bodyModel[68].setRotationPoint(-37F, 2F, 7F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.5F, -0.5F, -0.4F, 0F, -0.4F, -0.3F, 0F, 0F, 0F, -0.5F, -0.2F, 0F, -0.5F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 95
		bodyModel[69].setRotationPoint(-37F, 1F, 7F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.5F, -0.2F, 0F, 0F, 0F, 0F, 0F, -0.4F, -0.3F, -0.5F, -0.5F, -0.4F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.2F); // Box 96
		bodyModel[70].setRotationPoint(-37F, 1F, 8F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.2F, -0.5F, -0.2F, 0F, 0F, 0F, 0F, 0F, -0.4F, -0.3F, -0.5F, -0.5F, -0.4F); // Box 97
		bodyModel[71].setRotationPoint(-37F, 2F, 8F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.65F, -0.65F, 0F, -0.65F, -0.65F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 98
		bodyModel[72].setRotationPoint(-37.5F, 2F, 7F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.65F, -0.65F, 0F, -0.65F, -0.65F); // Box 100
		bodyModel[73].setRotationPoint(-37.5F, 2F, 8F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.65F, -0.65F, 0F, -0.65F, -0.65F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 101
		bodyModel[74].setRotationPoint(-37.5F, 1F, 8F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.65F, -0.65F, 0F, -0.65F, -0.65F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 102
		bodyModel[75].setRotationPoint(-37.5F, 1F, 7F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, -0.35F, -0.5F, -0.3F, -0.35F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 103
		bodyModel[76].setRotationPoint(-38.5F, 1F, 8F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, -0.3F, -0.35F, 0F, -0.3F, -0.35F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 107
		bodyModel[77].setRotationPoint(-38.5F, 1F, 7F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.3F, -0.35F, 0F, -0.3F, -0.35F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 108
		bodyModel[78].setRotationPoint(-38.5F, 2F, 7F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, -0.35F, -0.5F, -0.3F, -0.35F); // Box 109
		bodyModel[79].setRotationPoint(-38.5F, 2F, 8F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.3F, -0.35F, 0F, -0.3F, -0.35F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 110
		bodyModel[80].setRotationPoint(-38.5F, 2F, -9F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, -0.35F, -0.5F, -0.3F, -0.35F); // Box 111
		bodyModel[81].setRotationPoint(-38.5F, 2F, -8F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.65F, -0.65F, 0F, -0.65F, -0.65F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 112
		bodyModel[82].setRotationPoint(-37.5F, 1F, -8F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, -0.35F, -0.5F, -0.3F, -0.35F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 113
		bodyModel[83].setRotationPoint(-38.5F, 1F, -8F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, -0.3F, -0.35F, 0F, -0.3F, -0.35F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 114
		bodyModel[84].setRotationPoint(-38.5F, 1F, -9F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.65F, -0.65F, 0F, -0.65F, -0.65F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 115
		bodyModel[85].setRotationPoint(-37.5F, 1F, -9F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.5F, -0.5F, -0.4F, 0F, -0.4F, -0.3F, 0F, 0F, 0F, -0.5F, -0.2F, 0F, -0.5F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 116
		bodyModel[86].setRotationPoint(-37F, 1F, -9F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.5F, -0.2F, 0F, 0F, 0F, 0F, 0F, -0.4F, -0.3F, -0.5F, -0.5F, -0.4F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.2F); // Box 117
		bodyModel[87].setRotationPoint(-37F, 1F, -8F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.5F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.4F, 0F, -0.4F, -0.3F, 0F, 0F, 0F, -0.5F, -0.2F, 0F); // Box 118
		bodyModel[88].setRotationPoint(-37F, 2F, -9F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.65F, -0.65F, 0F, -0.65F, -0.65F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 119
		bodyModel[89].setRotationPoint(-37.5F, 2F, -9F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.65F, -0.65F, 0F, -0.65F, -0.65F); // Box 120
		bodyModel[90].setRotationPoint(-37.5F, 2F, -8F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.2F, -0.5F, -0.2F, 0F, 0F, 0F, 0F, 0F, -0.4F, -0.3F, -0.5F, -0.5F, -0.4F); // Box 121
		bodyModel[91].setRotationPoint(-37F, 2F, -8F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.5F, -0.4F, 0F, -0.4F, -0.3F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.2F, 0F, 0F, 0F); // Box 122
		bodyModel[92].setRotationPoint(35F, 1F, 8F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.5F, -0.4F, 0F, -0.4F, -0.3F); // Box 123
		bodyModel[93].setRotationPoint(35F, 2F, 8F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.65F, -0.65F, 0F, -0.65F, -0.65F); // Box 124
		bodyModel[94].setRotationPoint(36.5F, 2F, 8F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.65F, -0.65F, 0F, -0.65F, -0.65F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 125
		bodyModel[95].setRotationPoint(36.5F, 1F, 8F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.3F, -0.35F, 0F, -0.3F, -0.35F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 126
		bodyModel[96].setRotationPoint(37.5F, 1F, 8F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.3F, -0.35F, 0F, -0.3F, -0.35F); // Box 127
		bodyModel[97].setRotationPoint(37.5F, 2F, 8F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, -0.35F, -0.5F, -0.3F, -0.35F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[98].setRotationPoint(37.5F, 2F, 7F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.3F, -0.35F, -0.5F, -0.3F, -0.35F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 129
		bodyModel[99].setRotationPoint(37.5F, 1F, 7F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.4F, -0.3F, -0.5F, -0.5F, -0.4F, -0.5F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.2F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 130
		bodyModel[100].setRotationPoint(35F, 1F, 7F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, -0.2F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, -0.3F, -0.5F, -0.5F, -0.4F, -0.5F, -0.2F, 0F, 0F, 0F, 0F); // Box 131
		bodyModel[101].setRotationPoint(35F, 2F, 7F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.65F, -0.65F, 0F, -0.65F, -0.65F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 132
		bodyModel[102].setRotationPoint(36.5F, 2F, 7F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.65F, -0.65F, 0F, -0.65F, -0.65F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 133
		bodyModel[103].setRotationPoint(36.5F, 1F, 7F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.3F, -0.35F, 0F, -0.3F, -0.35F); // Box 134
		bodyModel[104].setRotationPoint(37.5F, 2F, -8F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.3F, -0.35F, 0F, -0.3F, -0.35F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 135
		bodyModel[105].setRotationPoint(37.5F, 1F, -8F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.3F, -0.35F, -0.5F, -0.3F, -0.35F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 136
		bodyModel[106].setRotationPoint(37.5F, 1F, -9F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, -0.35F, -0.5F, -0.3F, -0.35F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 137
		bodyModel[107].setRotationPoint(37.5F, 2F, -9F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.4F, -0.3F, -0.5F, -0.5F, -0.4F, -0.5F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.2F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 138
		bodyModel[108].setRotationPoint(35F, 1F, -9F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, -0.2F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, -0.3F, -0.5F, -0.5F, -0.4F, -0.5F, -0.2F, 0F, 0F, 0F, 0F); // Box 139
		bodyModel[109].setRotationPoint(35F, 2F, -9F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.65F, -0.65F, 0F, -0.65F, -0.65F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 140
		bodyModel[110].setRotationPoint(36.5F, 2F, -9F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.65F, -0.65F, 0F, -0.65F, -0.65F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 141
		bodyModel[111].setRotationPoint(36.5F, 1F, -9F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.65F, -0.65F, 0F, -0.65F, -0.65F); // Box 142
		bodyModel[112].setRotationPoint(36.5F, 2F, -8F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.65F, -0.65F, 0F, -0.65F, -0.65F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 143
		bodyModel[113].setRotationPoint(36.5F, 1F, -8F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.5F, -0.4F, 0F, -0.4F, -0.3F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.2F, 0F, 0F, 0F); // Box 144
		bodyModel[114].setRotationPoint(35F, 1F, -8F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.5F, -0.4F, 0F, -0.4F, -0.3F); // Box 145
		bodyModel[115].setRotationPoint(35F, 2F, -8F);

		bodyModel[116].addBox(0F, 0F, 0F, 1, 13, 20, 0F); // Box 86
		bodyModel[116].setRotationPoint(34F, -13F, -10F);

		bodyModel[117].addBox(0F, 0F, 0F, 1, 8, 8, 0F); // Box 93
		bodyModel[117].setRotationPoint(34F, -21F, -4F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 22, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 112
		bodyModel[118].setRotationPoint(13F, -21F, 8F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 22, 2, 4, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 113
		bodyModel[119].setRotationPoint(13F, -22F, 4F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 22, 2, 3, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, -1.3F, 0F, 0F, -1.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 114
		bodyModel[120].setRotationPoint(13F, -23F, 1F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 22, 2, 3, 0F,0F, -1.3F, 0F, 0F, -1.3F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 115
		bodyModel[121].setRotationPoint(13F, -23F, -4F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 22, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 116
		bodyModel[122].setRotationPoint(13F, -22F, -1F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 22, 2, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 117
		bodyModel[123].setRotationPoint(13F, -22F, -8F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 22, 1, 3, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 118
		bodyModel[124].setRotationPoint(13F, -21F, -11F);

		bodyModel[125].addBox(0F, 0F, 0F, 1, 6, 1, 0F); // Box 126
		bodyModel[125].setRotationPoint(13F, -20F, 10F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[126].setRotationPoint(13F, -16F, 4F);

		bodyModel[127].addBox(0F, 0F, 0F, 1, 7, 8, 0F); // Box 131
		bodyModel[127].setRotationPoint(13F, -21F, -4F);

		bodyModel[128].addBox(0F, 0F, 0F, 1, 6, 1, 0F); // Box 134
		bodyModel[128].setRotationPoint(13F, -20F, -11F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 135
		bodyModel[129].setRotationPoint(13F, -16F, -10F);

		bodyModel[130].addBox(0F, 0F, 0F, 1, 14, 22, 0F); // Box 136
		bodyModel[130].setRotationPoint(13F, -14F, -11F);

		bodyModel[131].addShapeBox(0F, 7F, 0F, 5, 13, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 154
		bodyModel[131].setRotationPoint(27F, -20F, 9.9F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 155
		bodyModel[132].setRotationPoint(27F, -20F, 9.9F);

		bodyModel[133].addShapeBox(4F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 156
		bodyModel[133].setRotationPoint(27F, -20F, 9.9F);

		bodyModel[134].addShapeBox(1F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 157
		bodyModel[134].setRotationPoint(27F, -20F, 9.9F);

		bodyModel[135].addShapeBox(0F, 7F, 0F, 5, 13, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 162
		bodyModel[135].setRotationPoint(27F, -20F, -11.4F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 164
		bodyModel[136].setRotationPoint(27F, -20F, -11.4F);

		bodyModel[137].addShapeBox(4F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 166
		bodyModel[137].setRotationPoint(27F, -20F, -11.4F);

		bodyModel[138].addShapeBox(1F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[138].setRotationPoint(27F, -20F, -11.4F);

		bodyModel[139].addBox(0F, 0F, 0F, 8, 1, 1, 0F); // Box 170
		bodyModel[139].setRotationPoint(19F, -20F, 10F);

		bodyModel[140].addBox(0F, 0F, 0F, 13, 13, 1, 0F); // Box 171
		bodyModel[140].setRotationPoint(14F, -13F, 10F);

		bodyModel[141].addBox(0F, 0F, 0F, 1, 6, 1, 0F); // Box 172
		bodyModel[141].setRotationPoint(26F, -19F, 10F);

		bodyModel[142].addBox(0F, 0F, 0F, 1, 6, 1, 0F); // Box 177
		bodyModel[142].setRotationPoint(26F, -19F, -11F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 214
		bodyModel[143].setRotationPoint(26.5F, -10.5F, -12F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 215
		bodyModel[144].setRotationPoint(26.5F, -11F, -12F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 216
		bodyModel[145].setRotationPoint(26.5F, -2.5F, -12F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 217
		bodyModel[146].setRotationPoint(32F, -2.5F, -12F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 218
		bodyModel[147].setRotationPoint(32F, -11F, -12F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 219
		bodyModel[148].setRotationPoint(32F, -10.5F, -12F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 220
		bodyModel[149].setRotationPoint(32F, -2.5F, 11F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 221
		bodyModel[150].setRotationPoint(26.5F, -2.5F, 11F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 222
		bodyModel[151].setRotationPoint(26.5F, -11F, 11F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 223
		bodyModel[152].setRotationPoint(32F, -11F, 11F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 224
		bodyModel[153].setRotationPoint(32F, -10.5F, 11F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 225
		bodyModel[154].setRotationPoint(26.5F, -10.5F, 11F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 7, 6, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 380
		bodyModel[155].setRotationPoint(19F, -19F, 10.8F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 7, 6, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 381
		bodyModel[156].setRotationPoint(19F, -19F, -10.8F);

		bodyModel[157].addShapeBox(1F, 1F, 0F, 3, 6, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 383
		bodyModel[157].setRotationPoint(27F, -20F, 10.8F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 0, 6, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 387
		bodyModel[158].setRotationPoint(13.5F, -20F, -10F);

		bodyModel[159].addBox(0F, 0F, 0F, 3, 20, 1, 0F); // Box 219
		bodyModel[159].setRotationPoint(32F, -20F, 10F);

		bodyModel[160].addBox(0F, 0F, 0F, 3, 20, 1, 0F); // Box 220
		bodyModel[160].setRotationPoint(32F, -20F, -11F);

		bodyModel[161].addShapeBox(1F, 1F, 0F, 3, 6, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 222
		bodyModel[161].setRotationPoint(27F, -20F, -10.8F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 0, 6, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 225
		bodyModel[162].setRotationPoint(13.5F, -20F, 4F);

		bodyModel[163].addBox(0F, 0F, 0F, 5, 7, 1, 0F); // Box 227
		bodyModel[163].setRotationPoint(14F, -20F, 10F);

		bodyModel[164].addBox(0F, 0F, 0F, 13, 13, 1, 0F); // Box 228
		bodyModel[164].setRotationPoint(14F, -13F, -11F);

		bodyModel[165].addBox(0F, 0F, 0F, 5, 7, 1, 0F); // Box 229
		bodyModel[165].setRotationPoint(14F, -20F, -11F);

		bodyModel[166].addBox(0F, 0F, 0F, 8, 1, 1, 0F); // Box 230
		bodyModel[166].setRotationPoint(19F, -20F, -11F);

		bodyModel[167].addBox(0F, 0F, 0F, 0, 6, 5, 0F); // Box 231
		bodyModel[167].setRotationPoint(34.5F, -19F, 4F);

		bodyModel[168].addBox(0F, 0F, 0F, 0, 6, 5, 0F); // Box 232
		bodyModel[168].setRotationPoint(34.5F, -19F, -9F);

		bodyModel[169].addBox(0F, 0F, 0F, 1, 7, 1, 0F); // Box 233
		bodyModel[169].setRotationPoint(34F, -20F, -10F);

		bodyModel[170].addBox(0F, 0F, 0F, 1, 7, 1, 0F); // Box 234
		bodyModel[170].setRotationPoint(34F, -20F, 9F);

		bodyModel[171].addBox(0F, 0F, 0F, 1, 1, 5, 0F); // Box 235
		bodyModel[171].setRotationPoint(34F, -20F, 4F);

		bodyModel[172].addBox(0F, 0F, 0F, 1, 1, 5, 0F); // Box 236
		bodyModel[172].setRotationPoint(34F, -20F, -9F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 237
		bodyModel[173].setRotationPoint(26F, -12.5F, -12F);

		bodyModel[174].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 238
		bodyModel[174].setRotationPoint(19.5F, -12.5F, -12F);

		bodyModel[175].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 239
		bodyModel[175].setRotationPoint(18.5F, -12.5F, -12F);

		bodyModel[176].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 240
		bodyModel[176].setRotationPoint(19.5F, -12.5F, 11F);

		bodyModel[177].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 241
		bodyModel[177].setRotationPoint(18.5F, -12.5F, 11F);

		bodyModel[178].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 242
		bodyModel[178].setRotationPoint(26F, -12.5F, 11F);

		bodyModel[179].addBox(0F, 0F, 0F, 46, 14, 14, 0F); // Box 243
		bodyModel[179].setRotationPoint(-33F, -14F, -7F);

		bodyModel[180].addShapeBox(0F, 0F, 0F, 2, 13, 2, 0F,-0.45F, 0F, -0.45F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.45F, 0F, -0.45F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 244
		bodyModel[180].setRotationPoint(-34F, -13F, -9F);

		bodyModel[181].addShapeBox(0F, 0F, 0F, 2, 13, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.45F, 0F, -0.45F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.45F, 0F, -0.45F); // Box 245
		bodyModel[181].setRotationPoint(-34F, -13F, 7F);

		bodyModel[182].addShapeBox(0F, 0F, 0F, 45, 1, 2, 0F,0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 246
		bodyModel[182].setRotationPoint(-32F, -14F, -9F);

		bodyModel[183].addShapeBox(0F, 0F, 0F, 45, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 247
		bodyModel[183].setRotationPoint(-32F, -14F, 7F);

		bodyModel[184].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.5F, -0.45F, -0.9F, 0F, -0.45F, -0.45F, 0F, 0F, 0F, 0F, 0F, 0F, -0.45F, 0F, -0.45F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 249
		bodyModel[184].setRotationPoint(-34F, -14F, -9F);

		bodyModel[185].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.45F, -0.45F, -0.5F, -0.45F, -0.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.45F, 0F, -0.45F); // Box 250
		bodyModel[185].setRotationPoint(-34F, -14F, 7F);

		bodyModel[186].addShapeBox(0F, 0F, 0F, 47, 1, 7, 0F,0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.45F, -2.45F, 0F, -0.45F, -2.45F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 251
		bodyModel[186].setRotationPoint(-34F, -15F, 0F);

		bodyModel[187].addShapeBox(0F, 0F, 0F, 47, 1, 7, 0F,0F, -0.45F, -2.45F, 0F, -0.45F, -2.45F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 252
		bodyModel[187].setRotationPoint(-34F, -15F, -7F);

		bodyModel[188].addBox(0F, 0F, 0F, 1, 1, 14, 0F); // Box 256
		bodyModel[188].setRotationPoint(-34F, -14F, -7F);

		bodyModel[189].addBox(0F, 0F, 0F, 1, 2, 14, 0F); // Box 257
		bodyModel[189].setRotationPoint(-34F, -2F, -7F);

		bodyModel[190].addBox(0F, 0F, 0F, 1, 11, 1, 0F); // Box 258
		bodyModel[190].setRotationPoint(-34F, -13F, -7F);

		bodyModel[191].addBox(0F, 0F, 0F, 1, 11, 1, 0F); // Box 259
		bodyModel[191].setRotationPoint(-34F, -13F, 6F);

		bodyModel[192].addBox(0F, 0F, 0F, 1, 11, 1, 0F); // Box 282
		bodyModel[192].setRotationPoint(-34F, -13F, -0.5F);

		bodyModel[193].addShapeBox(0F, 0F, 0F, 2, 8, 2, 0F,-1.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.1F, -1.45F, 0F, -1.45F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, -0.75F, 0F, -0.85F); // Box 308
		bodyModel[193].setRotationPoint(-29F, -22F, 0F);

		bodyModel[194].addBox(0F, 0F, 0F, 3, 9, 1, 0F); // Box 345
		bodyModel[194].setRotationPoint(-0.5F, -11F, -9F);

		bodyModel[195].addBox(0F, 0F, 0F, 3, 9, 1, 0F); // Box 368
		bodyModel[195].setRotationPoint(-21.5F, -11F, -9F);

		bodyModel[196].addBox(0F, 0F, 0F, 3, 9, 1, 0F); // Box 380
		bodyModel[196].setRotationPoint(-11F, -11F, -9F);

		bodyModel[197].addBox(0F, 0F, 0F, 3, 9, 1, 0F); // Box 393
		bodyModel[197].setRotationPoint(-0.5F, -11F, 8F);

		bodyModel[198].addBox(0F, 0F, 0F, 3, 9, 1, 0F); // Box 404
		bodyModel[198].setRotationPoint(-11F, -11F, 8F);

		bodyModel[199].addBox(0F, 0F, 0F, 3, 9, 1, 0F); // Box 416
		bodyModel[199].setRotationPoint(-21.5F, -11F, 8F);

		bodyModel[200].addBox(0F, 0F, 0F, 3, 13, 1, 0F); // Box 428
		bodyModel[200].setRotationPoint(10F, -13F, 8F);

		bodyModel[201].addBox(0F, 0F, 0F, 3, 13, 1, 0F); // Box 429
		bodyModel[201].setRotationPoint(-32F, -13F, 8F);

		bodyModel[202].addBox(0F, 0F, 0F, 3, 13, 1, 0F); // Box 430
		bodyModel[202].setRotationPoint(-32F, -13F, -9F);

		bodyModel[203].addBox(0F, 0F, 0F, 3, 13, 1, 0F); // Box 431
		bodyModel[203].setRotationPoint(10F, -13F, -9F);

		bodyModel[204].addBox(0F, 0F, 0F, 44, 13, 1, 0F); // Box 432
		bodyModel[204].setRotationPoint(-31F, -13F, -8F);

		bodyModel[205].addBox(0F, 0F, 0F, 44, 13, 1, 0F); // Box 433
		bodyModel[205].setRotationPoint(-31F, -13F, 7F);

		bodyModel[206].addBox(0F, 0F, 0F, 39, 2, 1, 0F); // Box 434
		bodyModel[206].setRotationPoint(-29F, -13F, -9F);

		bodyModel[207].addBox(0F, 0F, 0F, 39, 2, 1, 0F); // Box 435
		bodyModel[207].setRotationPoint(-29F, -2F, -9F);

		bodyModel[208].addBox(0F, 0F, 0F, 39, 2, 1, 0F); // Box 436
		bodyModel[208].setRotationPoint(-29F, -2F, 8F);

		bodyModel[209].addBox(0F, 0F, 0F, 39, 2, 1, 0F); // Box 437
		bodyModel[209].setRotationPoint(-29F, -13F, 8F);

		bodyModel[210].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 438
		bodyModel[210].setRotationPoint(-32F, -10.5F, 9F);

		bodyModel[211].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 439
		bodyModel[211].setRotationPoint(-32F, -11F, 9F);

		bodyModel[212].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 440
		bodyModel[212].setRotationPoint(-32F, -2.5F, 9F);

		bodyModel[213].addShapeBox(0F, 0F, 0F, 2, 8, 2, 0F,-1.45F, 0F, -1.45F, 0F, 0F, -1.1F, 0F, 0F, 0F, -1.1F, 0F, 0F, -0.75F, 0F, -0.85F, 0F, 0F, -0.2F, 0F, 0F, 0F, -0.2F, 0F, 0F); // Box 441
		bodyModel[213].setRotationPoint(-29F, -22F, -2F);

		bodyModel[214].addShapeBox(0F, 0F, 0F, 2, 8, 2, 0F,0F, 0F, -1.1F, -1.45F, 0F, -1.45F, -1.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, -0.75F, 0F, -0.85F, -0.2F, 0F, 0F, 0F, 0F, 0F); // Box 442
		bodyModel[214].setRotationPoint(-27F, -22F, -2F);

		bodyModel[215].addShapeBox(0F, 0F, 0F, 2, 8, 2, 0F,0F, 0F, 0F, -1.1F, 0F, 0F, -1.45F, 0F, -1.45F, 0F, 0F, -1.1F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.75F, 0F, -0.85F, 0F, 0F, -0.2F); // Box 443
		bodyModel[215].setRotationPoint(-27F, -22F, 0F);

		bodyModel[216].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 444
		bodyModel[216].setRotationPoint(-32F, -10.5F, -10F);

		bodyModel[217].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 445
		bodyModel[217].setRotationPoint(-32F, -11F, -10F);

		bodyModel[218].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 446
		bodyModel[218].setRotationPoint(-32F, -2.5F, -10F);

		bodyModel[219].addShapeBox(0F, 0F, 0F, 40, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 447
		bodyModel[219].setRotationPoint(-29F, -15F, -10F);

		bodyModel[220].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1F, -0.5F, -0.5F, -1F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 448
		bodyModel[220].setRotationPoint(-29F, -15F, -10F);

		bodyModel[221].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1F, -0.5F, -0.5F, -1F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 450
		bodyModel[221].setRotationPoint(-21F, -15F, -10F);

		bodyModel[222].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1F, -0.5F, -0.5F, -1F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 451
		bodyModel[222].setRotationPoint(-20F, -15F, -10F);

		bodyModel[223].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1F, -0.5F, -0.5F, -1F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 452
		bodyModel[223].setRotationPoint(-9F, -15F, -10F);

		bodyModel[224].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1F, -0.5F, -0.5F, -1F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 454
		bodyModel[224].setRotationPoint(-10F, -15F, -10F);

		bodyModel[225].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1F, -0.5F, -0.5F, -1F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 455
		bodyModel[225].setRotationPoint(1F, -15F, -10F);

		bodyModel[226].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1F, -0.5F, -0.5F, -1F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 457
		bodyModel[226].setRotationPoint(0F, -15F, -10F);

		bodyModel[227].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -1.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 459
		bodyModel[227].setRotationPoint(10F, -15F, -10F);

		bodyModel[228].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, -0.5F, -1F, -0.5F); // Box 460
		bodyModel[228].setRotationPoint(10F, -15F, 8F);

		bodyModel[229].addShapeBox(0F, 0F, 0F, 40, 1, 1, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 461
		bodyModel[229].setRotationPoint(-29F, -15F, 9F);

		bodyModel[230].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -1.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, -0.5F, 0F, -1F, -0.5F); // Box 462
		bodyModel[230].setRotationPoint(1F, -15F, 8F);

		bodyModel[231].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -1.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, -0.5F, 0F, -1F, -0.5F); // Box 463
		bodyModel[231].setRotationPoint(0F, -15F, 8F);

		bodyModel[232].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -1.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, -0.5F, 0F, -1F, -0.5F); // Box 464
		bodyModel[232].setRotationPoint(-9F, -15F, 8F);

		bodyModel[233].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -1.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, -0.5F, 0F, -1F, -0.5F); // Box 465
		bodyModel[233].setRotationPoint(-10F, -15F, 8F);

		bodyModel[234].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -1.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, -0.5F, 0F, -1F, -0.5F); // Box 466
		bodyModel[234].setRotationPoint(-20F, -15F, 8F);

		bodyModel[235].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -1.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, -0.5F, 0F, -1F, -0.5F); // Box 467
		bodyModel[235].setRotationPoint(-21F, -15F, 8F);

		bodyModel[236].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -1.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, -0.5F, 0F, -1F, -0.5F); // Box 468
		bodyModel[236].setRotationPoint(-29F, -15F, 8F);

		bodyModel[237].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Lamp iron Front 1
		bodyModel[237].setRotationPoint(-35F, -1F, -10F);

		bodyModel[238].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Lamp iron Front 1
		bodyModel[238].setRotationPoint(-35F, -1F, 9F);

		bodyModel[239].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 471
		bodyModel[239].setRotationPoint(-35F, -1F, -3F);

		bodyModel[240].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.7F, -0.65F, 0F, -0.7F, -0.65F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 472
		bodyModel[240].setRotationPoint(-35F, -2F, -3F);

		bodyModel[241].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 473
		bodyModel[241].setRotationPoint(-36F, -2F, -3F);

		bodyModel[242].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.7F, -0.65F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.7F, -0.65F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 474
		bodyModel[242].setRotationPoint(-37F, -2F, -3F);

		bodyModel[243].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1.5F, 0F, -0.5F); // Box 475
		bodyModel[243].setRotationPoint(-37F, -1F, -3F);

		bodyModel[244].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.7F, -0.65F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.7F, -0.65F, -0.5F); // Box 476
		bodyModel[244].setRotationPoint(-36F, 1F, -3F);

		bodyModel[245].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.65F, -0.7F, 0F, -0.65F, -0.7F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 477
		bodyModel[245].setRotationPoint(-30F, -10F, 9.5F);

		bodyModel[246].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.65F, -0.7F, 0F, -0.65F, -0.7F); // Box 478
		bodyModel[246].setRotationPoint(-30F, -8F, 9.5F);

		bodyModel[247].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 479
		bodyModel[247].setRotationPoint(-30F, -9F, 9.5F);

		bodyModel[248].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 480
		bodyModel[248].setRotationPoint(-30F, -10F, 9F);

		bodyModel[249].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 481
		bodyModel[249].setRotationPoint(-30F, -8F, 9F);

		bodyModel[250].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 482
		bodyModel[250].setRotationPoint(-21F, -8F, 9F);

		bodyModel[251].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.65F, -0.7F, 0F, -0.65F, -0.7F); // Box 483
		bodyModel[251].setRotationPoint(-21F, -8F, 9.5F);

		bodyModel[252].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.65F, -0.7F, 0F, -0.65F, -0.7F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 484
		bodyModel[252].setRotationPoint(-21F, -10F, 9.5F);

		bodyModel[253].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 485
		bodyModel[253].setRotationPoint(-21F, -10F, 9F);

		bodyModel[254].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 486
		bodyModel[254].setRotationPoint(-21F, -9F, 9.5F);

		bodyModel[255].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F); // Box 487
		bodyModel[255].setRotationPoint(-20F, -8F, 9F);

		bodyModel[256].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.65F, -0.7F, -0.5F, -0.65F, -0.7F); // Box 488
		bodyModel[256].setRotationPoint(-20F, -8F, 9.5F);

		bodyModel[257].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.65F, -0.7F, -0.5F, -0.65F, -0.7F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 489
		bodyModel[257].setRotationPoint(-20F, -10F, 9.5F);

		bodyModel[258].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 490
		bodyModel[258].setRotationPoint(-20F, -10F, 9F);

		bodyModel[259].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 491
		bodyModel[259].setRotationPoint(-20F, -9F, 9.5F);

		bodyModel[260].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.65F, -0.7F, 0F, -0.65F, -0.7F); // Box 492
		bodyModel[260].setRotationPoint(-10.5F, -8F, 9.5F);

		bodyModel[261].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 493
		bodyModel[261].setRotationPoint(-10.5F, -9F, 9.5F);

		bodyModel[262].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.65F, -0.7F, 0F, -0.65F, -0.7F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 494
		bodyModel[262].setRotationPoint(-10.5F, -10F, 9.5F);

		bodyModel[263].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 495
		bodyModel[263].setRotationPoint(-10.5F, -10F, 9F);

		bodyModel[264].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 496
		bodyModel[264].setRotationPoint(-10.5F, -8F, 9F);

		bodyModel[265].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 497
		bodyModel[265].setRotationPoint(-9.5F, -9F, 9.5F);

		bodyModel[266].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F); // Box 498
		bodyModel[266].setRotationPoint(-9.5F, -8F, 9F);

		bodyModel[267].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.65F, -0.7F, -0.5F, -0.65F, -0.7F); // Box 499
		bodyModel[267].setRotationPoint(-9.5F, -8F, 9.5F);

		bodyModel[268].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.65F, -0.7F, -0.5F, -0.65F, -0.7F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 500
		bodyModel[268].setRotationPoint(-9.5F, -10F, 9.5F);

		bodyModel[269].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 501
		bodyModel[269].setRotationPoint(-9.5F, -10F, 9F);

		bodyModel[270].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.65F, -0.7F, 0F, -0.65F, -0.7F); // Box 502
		bodyModel[270].setRotationPoint(0F, -8F, 9.5F);

		bodyModel[271].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 503
		bodyModel[271].setRotationPoint(0F, -9F, 9.5F);

		bodyModel[272].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.65F, -0.7F, 0F, -0.65F, -0.7F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 504
		bodyModel[272].setRotationPoint(0F, -10F, 9.5F);

		bodyModel[273].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 505
		bodyModel[273].setRotationPoint(0F, -10F, 9F);

		bodyModel[274].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 506
		bodyModel[274].setRotationPoint(0F, -8F, 9F);

		bodyModel[275].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 507
		bodyModel[275].setRotationPoint(1F, -9F, 9.5F);

		bodyModel[276].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F); // Box 508
		bodyModel[276].setRotationPoint(1F, -8F, 9F);

		bodyModel[277].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.65F, -0.7F, -0.5F, -0.65F, -0.7F); // Box 509
		bodyModel[277].setRotationPoint(1F, -8F, 9.5F);

		bodyModel[278].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.65F, -0.7F, -0.5F, -0.65F, -0.7F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 510
		bodyModel[278].setRotationPoint(1F, -10F, 9.5F);

		bodyModel[279].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 511
		bodyModel[279].setRotationPoint(1F, -10F, 9F);

		bodyModel[280].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.65F, -0.7F, -0.5F, -0.65F, -0.7F); // Box 512
		bodyModel[280].setRotationPoint(10F, -8F, 9.5F);

		bodyModel[281].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 513
		bodyModel[281].setRotationPoint(10F, -9F, 9.5F);

		bodyModel[282].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.65F, -0.7F, -0.5F, -0.65F, -0.7F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 514
		bodyModel[282].setRotationPoint(10F, -10F, 9.5F);

		bodyModel[283].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 515
		bodyModel[283].setRotationPoint(10F, -10F, 9F);

		bodyModel[284].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F); // Box 516
		bodyModel[284].setRotationPoint(10F, -8F, 9F);

		bodyModel[285].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 522
		bodyModel[285].setRotationPoint(10F, -9F, -10.5F);

		bodyModel[286].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 523
		bodyModel[286].setRotationPoint(10F, -10F, -10F);

		bodyModel[287].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, -0.65F, -0.7F, 0F, -0.65F, -0.7F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 524
		bodyModel[287].setRotationPoint(10F, -10F, -10.5F);

		bodyModel[288].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.65F, -0.7F, 0F, -0.65F, -0.7F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 525
		bodyModel[288].setRotationPoint(10F, -8F, -10.5F);

		bodyModel[289].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 526
		bodyModel[289].setRotationPoint(10F, -8F, -10F);

		bodyModel[290].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 527
		bodyModel[290].setRotationPoint(1F, -8F, -10F);

		bodyModel[291].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 528
		bodyModel[291].setRotationPoint(1F, -9F, -10.5F);

		bodyModel[292].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.65F, -0.7F, 0F, -0.65F, -0.7F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 529
		bodyModel[292].setRotationPoint(1F, -8F, -10.5F);

		bodyModel[293].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, -0.65F, -0.7F, 0F, -0.65F, -0.7F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 530
		bodyModel[293].setRotationPoint(1F, -10F, -10.5F);

		bodyModel[294].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 531
		bodyModel[294].setRotationPoint(1F, -10F, -10F);

		bodyModel[295].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 532
		bodyModel[295].setRotationPoint(0F, -10F, -10F);

		bodyModel[296].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.65F, -0.7F, -0.5F, -0.65F, -0.7F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 533
		bodyModel[296].setRotationPoint(0F, -10F, -10.5F);

		bodyModel[297].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 534
		bodyModel[297].setRotationPoint(0F, -9F, -10.5F);

		bodyModel[298].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.65F, -0.7F, -0.5F, -0.65F, -0.7F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 535
		bodyModel[298].setRotationPoint(0F, -8F, -10.5F);

		bodyModel[299].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 536
		bodyModel[299].setRotationPoint(0F, -8F, -10F);

		bodyModel[300].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 537
		bodyModel[300].setRotationPoint(-9.5F, -10F, -10F);

		bodyModel[301].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, -0.65F, -0.7F, 0F, -0.65F, -0.7F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 538
		bodyModel[301].setRotationPoint(-9.5F, -10F, -10.5F);

		bodyModel[302].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 539
		bodyModel[302].setRotationPoint(-9.5F, -9F, -10.5F);

		bodyModel[303].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 540
		bodyModel[303].setRotationPoint(-9.5F, -8F, -10F);

		bodyModel[304].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.65F, -0.7F, 0F, -0.65F, -0.7F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 541
		bodyModel[304].setRotationPoint(-9.5F, -8F, -10.5F);

		bodyModel[305].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.65F, -0.7F, -0.5F, -0.65F, -0.7F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 542
		bodyModel[305].setRotationPoint(-10.5F, -8F, -10.5F);

		bodyModel[306].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 543
		bodyModel[306].setRotationPoint(-10.5F, -8F, -10F);

		bodyModel[307].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 544
		bodyModel[307].setRotationPoint(-10.5F, -9F, -10.5F);

		bodyModel[308].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 545
		bodyModel[308].setRotationPoint(-10.5F, -10F, -10F);

		bodyModel[309].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.65F, -0.7F, -0.5F, -0.65F, -0.7F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 546
		bodyModel[309].setRotationPoint(-10.5F, -10F, -10.5F);

		bodyModel[310].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.65F, -0.7F, 0F, -0.65F, -0.7F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 547
		bodyModel[310].setRotationPoint(-20F, -8F, -10.5F);

		bodyModel[311].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 548
		bodyModel[311].setRotationPoint(-20F, -8F, -10F);

		bodyModel[312].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 549
		bodyModel[312].setRotationPoint(-20F, -9F, -10.5F);

		bodyModel[313].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, -0.65F, -0.7F, 0F, -0.65F, -0.7F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 550
		bodyModel[313].setRotationPoint(-20F, -10F, -10.5F);

		bodyModel[314].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 551
		bodyModel[314].setRotationPoint(-20F, -10F, -10F);

		bodyModel[315].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 552
		bodyModel[315].setRotationPoint(-21F, -10F, -10F);

		bodyModel[316].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.65F, -0.7F, -0.5F, -0.65F, -0.7F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 553
		bodyModel[316].setRotationPoint(-21F, -10F, -10.5F);

		bodyModel[317].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 554
		bodyModel[317].setRotationPoint(-21F, -9F, -10.5F);

		bodyModel[318].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.65F, -0.7F, -0.5F, -0.65F, -0.7F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 555
		bodyModel[318].setRotationPoint(-21F, -8F, -10.5F);

		bodyModel[319].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 556
		bodyModel[319].setRotationPoint(-21F, -8F, -10F);

		bodyModel[320].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.65F, -0.7F, -0.5F, -0.65F, -0.7F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 557
		bodyModel[320].setRotationPoint(-30F, -10F, -10.5F);

		bodyModel[321].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 558
		bodyModel[321].setRotationPoint(-30F, -10F, -10F);

		bodyModel[322].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 559
		bodyModel[322].setRotationPoint(-30F, -9F, -10.5F);

		bodyModel[323].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.65F, -0.7F, -0.5F, -0.65F, -0.7F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 560
		bodyModel[323].setRotationPoint(-30F, -8F, -10.5F);

		bodyModel[324].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 561
		bodyModel[324].setRotationPoint(-30F, -8F, -10F);

		bodyModel[325].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.7F, -0.7F, 0F, -0.7F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, -0.7F, 0F, -0.7F, -0.7F, 0F, 0F, 0F, 0F, 0F); // Lamp iron Front 1
		bodyModel[325].setRotationPoint(-33.4F, -16.7F, -0.85F);

		bodyModel[326].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, -0.5F, -0.7F, -0.65F, -0.5F, -0.7F, -0.65F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 563
		bodyModel[326].setRotationPoint(36.5F, -2F, 1F);

		bodyModel[327].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, 0F, 0F, 0F, 0F); // Box 564
		bodyModel[327].setRotationPoint(35.5F, -1F, 1F);

		bodyModel[328].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.7F, -0.65F, -0.5F, -0.7F, -0.65F, 0F, 0F, -0.5F, 0F); // Box 565
		bodyModel[328].setRotationPoint(35.5F, 1F, 1F);

		bodyModel[329].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 566
		bodyModel[329].setRotationPoint(35.5F, -2F, 1F);

		bodyModel[330].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 567
		bodyModel[330].setRotationPoint(34.5F, -1F, 1F);

		bodyModel[331].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.7F, -0.65F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.7F, -0.65F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 568
		bodyModel[331].setRotationPoint(34.5F, -2F, 1F);

		bodyModel[332].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.7F, -0.65F, -0.5F, -0.7F, -0.65F, 0F, 0F, -0.5F, 0F); // Box 569
		bodyModel[332].setRotationPoint(35F, 0F, 1F);

		bodyModel[333].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 570
		bodyModel[333].setRotationPoint(34.5F, 1F, 1F);

		bodyModel[334].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Lamp iron Back 1
		bodyModel[334].setRotationPoint(34.6F, -3F, -9F);

		bodyModel[335].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.3F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, -0.3F, -0.5F, -0.3F); // Box 572
		bodyModel[335].setRotationPoint(34.6F, -2F, -9.2F);

		bodyModel[336].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.3F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, -0.3F, -0.5F, -0.3F); // Box 573
		bodyModel[336].setRotationPoint(34.7F, -2F, 7.3F);

		bodyModel[337].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Lamp iron Back 1
		bodyModel[337].setRotationPoint(34.7F, -3F, 7.5F);

		bodyModel[338].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Lamp iron Back 1
		bodyModel[338].setRotationPoint(34.6F, -3F, -1F);

		bodyModel[339].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.3F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, -0.3F, -0.5F, -0.3F); // Box 576
		bodyModel[339].setRotationPoint(34.6F, -2F, -1.2F);

		bodyModel[340].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.3F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, -0.3F, -0.5F, -0.3F); // Box 577
		bodyModel[340].setRotationPoint(34.6F, -18F, -1.2F);

		bodyModel[341].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Lamp iron Back 1
		bodyModel[341].setRotationPoint(34.6F, -19F, -1F);

		bodyModel[342].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 579
		bodyModel[342].setRotationPoint(35F, -11.5F, -1F);

		bodyModel[343].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 580
		bodyModel[343].setRotationPoint(35F, -11.5F, -9.5F);

		bodyModel[344].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 581
		bodyModel[344].setRotationPoint(35F, -11.5F, -10.5F);

		bodyModel[345].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 582
		bodyModel[345].setRotationPoint(35F, -11.5F, 0F);

		bodyModel[346].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 583
		bodyModel[346].setRotationPoint(35F, -11.5F, 8.5F);

		bodyModel[347].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Lamp iron Front 1
		bodyModel[347].setRotationPoint(-35F, -1F, -0.75F);

		bodyModel[348].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F); // Lamp1
		bodyModel[348].setRotationPoint(35F, -19F, -0.75F);

		bodyModel[349].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.6F, -0.15F, -0.15F, -0.2F, -0.15F, -0.15F, -0.2F, 0F, -0.5F, -0.6F, 0F, -0.5F, -0.6F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, -0.5F, -0.6F, -0.5F, -0.5F); // Lamp
		bodyModel[349].setRotationPoint(35.25F, -19F, -0.75F);

		bodyModel[350].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.6F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, -0.15F, -0.15F, -0.6F, -0.15F, -0.15F, -0.6F, -0.5F, -0.5F, -0.2F, -0.5F, -0.5F, -0.2F, -0.5F, 0F, -0.6F, -0.5F, 0F); // Lamp
		bodyModel[350].setRotationPoint(35.25F, -19F, -0.75F);

		bodyModel[351].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.6F, -0.5F, -0.5F, -0.2F, -0.5F, -0.5F, -0.2F, -0.5F, 0F, -0.6F, -0.5F, 0F, -0.6F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, -0.15F, -0.15F, -0.6F, -0.15F, -0.15F); // Lamp
		bodyModel[351].setRotationPoint(35.25F, -19F, -0.75F);

		bodyModel[352].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.6F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, -0.5F, -0.6F, -0.5F, -0.5F, -0.6F, -0.15F, -0.15F, -0.2F, -0.15F, -0.15F, -0.2F, 0F, -0.5F, -0.6F, 0F, -0.5F); // Lamp
		bodyModel[352].setRotationPoint(35.25F, -19F, -0.75F);

		bodyModel[353].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.8F, -0.1F, -0.3F, -0.8F, -0.1F, -0.3F, -0.8F, -0.1F, 0F, -0.8F, -0.1F, 0F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 590
		bodyModel[353].setRotationPoint(35F, -20F, -0.75F);

		bodyModel[354].addShapeBox(0F, 0F, 0F, 23, 1, 1, 0F,0F, -0.5F, -0.6F, 0F, -0.5F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.6F, 0F, -0.5F, -0.6F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 595
		bodyModel[354].setRotationPoint(12.5F, -20F, -12F);

		bodyModel[355].addShapeBox(0F, 0F, 0F, 23, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.6F, 0F, -0.5F, -0.6F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.6F, 0F, -0.5F, -0.6F); // Box 596
		bodyModel[355].setRotationPoint(12.5F, -20F, 11F);

		bodyModel[356].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, -0.7F, 0F, -0.5F, -0.7F, 0F, -0.5F, 0.2F, 0F, 0F, 0.2F, 0F); // Box 597
		bodyModel[356].setRotationPoint(12.5F, -21F, 8F);

		bodyModel[357].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, -1.4F, 0F, -0.5F, -1.4F, 0F, -0.5F, -0.7F, 0F, 0F, -0.7F, 0F); // Box 598
		bodyModel[357].setRotationPoint(12.5F, -22F, 4F);

		bodyModel[358].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.7F, 0F, -0.5F, -0.7F, 0F, -0.5F, -1.4F, 0F, 0F, -1.4F, 0F); // Box 599
		bodyModel[358].setRotationPoint(12.5F, -22F, -8F);

		bodyModel[359].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, -0.5F, 0.2F, 0F, -0.5F, -0.7F, 0F, 0F, -0.7F, 0F); // Box 600
		bodyModel[359].setRotationPoint(12.5F, -21F, -11F);

		bodyModel[360].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, -1.3F, 0F, -0.5F, -1.3F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, -0.4F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.7F, 0F, 0F, -0.7F, 0F); // Box 601
		bodyModel[360].setRotationPoint(12.5F, -23F, -4F);

		bodyModel[361].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1.3F, 0F, 0F, -1.3F, 0F, 0F, -0.7F, 0F, -0.5F, -0.7F, 0F, -0.5F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 602
		bodyModel[361].setRotationPoint(12.5F, -23F, 1F);

		bodyModel[362].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, -0.5F, -0.7F, 0F, -0.5F, -0.7F, 0F, 0F, -0.7F, 0F); // Box 603
		bodyModel[362].setRotationPoint(12.5F, -22F, -1F);

		bodyModel[363].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0.2F, 0F, -0.5F, 0.2F, 0F); // Box 604
		bodyModel[363].setRotationPoint(34.5F, -21F, 8F);

		bodyModel[364].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,-0.5F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1.4F, 0F, 0F, -1.4F, 0F, 0F, -0.7F, 0F, -0.5F, -0.7F, 0F); // Box 605
		bodyModel[364].setRotationPoint(34.5F, -22F, 4F);

		bodyModel[365].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,-0.5F, -1F, 0F, 0F, -1F, 0F, 0F, -1.3F, 0F, -0.5F, -1.3F, 0F, -0.5F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.4F, 0F, -0.5F, -0.4F, 0F); // Box 606
		bodyModel[365].setRotationPoint(34.5F, -23F, 1F);

		bodyModel[366].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, -0.5F, -0.7F, 0F); // Box 607
		bodyModel[366].setRotationPoint(34.5F, -22F, -1F);

		bodyModel[367].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,-0.5F, -1.3F, 0F, 0F, -1.3F, 0F, 0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.7F, 0F, -0.5F, -0.7F, 0F); // Box 608
		bodyModel[367].setRotationPoint(34.5F, -23F, -4F);

		bodyModel[368].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,-0.5F, -1F, 0F, 0F, -1F, 0F, 0F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -1.4F, 0F, -0.5F, -1.4F, 0F); // Box 609
		bodyModel[368].setRotationPoint(34.5F, -22F, -8F);

		bodyModel[369].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, -0.7F, 0F, -0.5F, -0.7F, 0F); // Box 610
		bodyModel[369].setRotationPoint(34.5F, -21F, -11F);

		bodyModel[370].addBox(0F, 0F, 0F, 3, 10, 14, 0F); // Box 112
		bodyModel[370].setRotationPoint(14F, -10F, -6F);

		bodyModel[371].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 117
		bodyModel[371].setRotationPoint(15F, -11F, 4F);

		bodyModel[372].addBox(0F, 0F, 0F, 1, 1, 4, 0F); // Box 118
		bodyModel[372].setRotationPoint(16F, -12F, 5F);
		bodyModel[372].rotateAngleY = -2.84488668F;

		bodyModel[373].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 119
		bodyModel[373].setRotationPoint(16F, -13F, 1F);

		bodyModel[374].addBox(0F, 0F, 0F, 3, 3, 3, 0F); // Box 120
		bodyModel[374].setRotationPoint(14F, -13F, -6F);

		bodyModel[375].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 121
		bodyModel[375].setRotationPoint(16.5F, -12F, -5F);
		bodyModel[375].rotateAngleY = 0.78539816F;

		bodyModel[376].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 197
		bodyModel[376].setRotationPoint(33F, -21F, -0.5F);

		bodyModel[377].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 198
		bodyModel[377].setRotationPoint(32F, -20F, -0.5F);

		bodyModel[378].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 199
		bodyModel[378].setRotationPoint(31F, -19F, -0.5F);

		bodyModel[379].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 129
		bodyModel[379].setRotationPoint(15F, -12F, 6F);

		bodyModel[380].addBox(0F, 0F, 0F, 3, 1, 3, 0F); // Box 173
		bodyModel[380].setRotationPoint(30F, -18F, -1.5F);

		bodyModel[381].addBox(-4.5F, -4.5F, 0F, 9, 9, 0, 0F); // Box 622
		bodyModel[381].setRotationPoint(-25.5F, 5.5F, -6.2F);

		bodyModel[382].addBox(-4.5F, -4.5F, 0F, 9, 9, 0, 0F); // Box 623
		bodyModel[382].setRotationPoint(-4.5F, 5.5F, -6.2F);

		bodyModel[383].addBox(-4.5F, -4.5F, 0F, 9, 9, 0, 0F); // Box 624
		bodyModel[383].setRotationPoint(16.5F, 5.5F, -6.2F);

		bodyModel[384].addBox(0F, 0F, 0F, 42, 2, 1, 0F); // Box 625
		bodyModel[384].setRotationPoint(-24F, 5F, -7F);

		bodyModel[385].addBox(-4.5F, -4.5F, 0F, 9, 9, 0, 0F); // Box 626
		bodyModel[385].setRotationPoint(-25.5F, 5.5F, 6.2F);

		bodyModel[386].addBox(-4.5F, -4.5F, 0F, 9, 9, 0, 0F); // Box 627
		bodyModel[386].setRotationPoint(-4.5F, 5.5F, 6.2F);

		bodyModel[387].addBox(-4.5F, -4.5F, 0F, 9, 9, 0, 0F); // Box 628
		bodyModel[387].setRotationPoint(16.5F, 5.5F, 6.2F);

		bodyModel[388].addBox(0F, 0F, 0F, 42, 2, 1, 0F); // Box 629
		bodyModel[388].setRotationPoint(-24F, 5F, 6F);

		bodyModel[389].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.6F, -0.5F, -0.5F, -0.2F, -0.5F, -0.5F, -0.2F, -0.5F, 0F, -0.6F, -0.5F, 0F, -0.6F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, -0.15F, -0.15F, -0.6F, -0.15F, -0.15F); // Lamp
		bodyModel[389].setRotationPoint(35.25F, -3F, -0.75F);

		bodyModel[390].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F); // Box 485
		bodyModel[390].setRotationPoint(35F, -3F, -0.75F);

		bodyModel[391].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.8F, -0.1F, -0.3F, -0.8F, -0.1F, -0.3F, -0.8F, -0.1F, 0F, -0.8F, -0.1F, 0F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 486
		bodyModel[391].setRotationPoint(35F, -4F, -0.75F);

		bodyModel[392].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.6F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, -0.15F, -0.15F, -0.6F, -0.15F, -0.15F, -0.6F, -0.5F, -0.5F, -0.2F, -0.5F, -0.5F, -0.2F, -0.5F, 0F, -0.6F, -0.5F, 0F); // Lamp
		bodyModel[392].setRotationPoint(35.25F, -3F, -0.75F);

		bodyModel[393].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.6F, -0.15F, -0.15F, -0.2F, -0.15F, -0.15F, -0.2F, 0F, -0.5F, -0.6F, 0F, -0.5F, -0.6F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, -0.5F, -0.6F, -0.5F, -0.5F); // Lamp
		bodyModel[393].setRotationPoint(35.25F, -3F, -0.75F);

		bodyModel[394].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.6F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, -0.5F, -0.6F, -0.5F, -0.5F, -0.6F, -0.15F, -0.15F, -0.2F, -0.15F, -0.15F, -0.2F, 0F, -0.5F, -0.6F, 0F, -0.5F); // Lamp
		bodyModel[394].setRotationPoint(35.25F, -3F, -0.75F);

		bodyModel[395].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.6F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, -0.15F, -0.15F, -0.6F, -0.15F, -0.15F, -0.6F, -0.5F, -0.5F, -0.2F, -0.5F, -0.5F, -0.2F, -0.5F, 0F, -0.6F, -0.5F, 0F); // Lamp
		bodyModel[395].setRotationPoint(35.25F, -3F, 7.8F);

		bodyModel[396].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.6F, -0.15F, -0.15F, -0.2F, -0.15F, -0.15F, -0.2F, 0F, -0.5F, -0.6F, 0F, -0.5F, -0.6F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, -0.5F, -0.6F, -0.5F, -0.5F); // Lamp
		bodyModel[396].setRotationPoint(35.25F, -3F, 7.8F);

		bodyModel[397].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.6F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, -0.5F, -0.6F, -0.5F, -0.5F, -0.6F, -0.15F, -0.15F, -0.2F, -0.15F, -0.15F, -0.2F, 0F, -0.5F, -0.6F, 0F, -0.5F); // Lamp
		bodyModel[397].setRotationPoint(35.25F, -3F, 7.8F);

		bodyModel[398].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.6F, -0.5F, -0.5F, -0.2F, -0.5F, -0.5F, -0.2F, -0.5F, 0F, -0.6F, -0.5F, 0F, -0.6F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, -0.15F, -0.15F, -0.6F, -0.15F, -0.15F); // Lamp
		bodyModel[398].setRotationPoint(35.25F, -3F, 7.8F);

		bodyModel[399].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F); // Box 494
		bodyModel[399].setRotationPoint(35F, -3F, 7.8F);

		bodyModel[400].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.8F, -0.1F, -0.3F, -0.8F, -0.1F, -0.3F, -0.8F, -0.1F, 0F, -0.8F, -0.1F, 0F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 495
		bodyModel[400].setRotationPoint(35F, -4F, 7.8F);

		bodyModel[401].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.6F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, -0.15F, -0.15F, -0.6F, -0.15F, -0.15F, -0.6F, -0.5F, -0.5F, -0.2F, -0.5F, -0.5F, -0.2F, -0.5F, 0F, -0.6F, -0.5F, 0F); // Lamp
		bodyModel[401].setRotationPoint(35.25F, -3F, -8.7F);

		bodyModel[402].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.6F, -0.15F, -0.15F, -0.2F, -0.15F, -0.15F, -0.2F, 0F, -0.5F, -0.6F, 0F, -0.5F, -0.6F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, -0.5F, -0.6F, -0.5F, -0.5F); // Lamp
		bodyModel[402].setRotationPoint(35.25F, -3F, -8.7F);

		bodyModel[403].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.6F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, -0.5F, -0.6F, -0.5F, -0.5F, -0.6F, -0.15F, -0.15F, -0.2F, -0.15F, -0.15F, -0.2F, 0F, -0.5F, -0.6F, 0F, -0.5F); // Lamp
		bodyModel[403].setRotationPoint(35.25F, -3F, -8.7F);

		bodyModel[404].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.6F, -0.5F, -0.5F, -0.2F, -0.5F, -0.5F, -0.2F, -0.5F, 0F, -0.6F, -0.5F, 0F, -0.6F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, -0.15F, -0.15F, -0.6F, -0.15F, -0.15F); // Lamp
		bodyModel[404].setRotationPoint(35.25F, -3F, -8.7F);

		bodyModel[405].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F); // Box 500
		bodyModel[405].setRotationPoint(35F, -3F, -8.7F);

		bodyModel[406].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.8F, -0.1F, -0.3F, -0.8F, -0.1F, -0.3F, -0.8F, -0.1F, 0F, -0.8F, -0.1F, 0F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 501
		bodyModel[406].setRotationPoint(35F, -4F, -8.7F);

		bodyModel[407].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, -0.15F, -0.15F, -0.6F, -0.15F, -0.15F, -0.6F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, -0.5F, 0F, -0.6F, -0.5F, 0F, -0.6F, -0.5F, -0.5F, -0.2F, -0.5F, -0.5F); // Lamp
		bodyModel[407].setRotationPoint(-35.5F, -1F, -10.3F);

		bodyModel[408].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.5F, -0.6F, 0F, -0.5F, -0.6F, -0.15F, -0.15F, -0.2F, -0.15F, -0.15F, -0.2F, -0.5F, -0.5F, -0.6F, -0.5F, -0.5F, -0.6F, -0.5F, 0F, -0.2F, -0.5F, 0F); // Lamp
		bodyModel[408].setRotationPoint(-35.5F, -1F, -10.3F);

		bodyModel[409].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, -0.5F, -0.5F, -0.6F, -0.5F, -0.5F, -0.6F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, -0.5F, -0.6F, 0F, -0.5F, -0.6F, -0.15F, -0.15F, -0.2F, -0.15F, -0.15F); // Lamp
		bodyModel[409].setRotationPoint(-35.5F, -1F, -10.3F);

		bodyModel[410].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, -0.5F, 0F, -0.6F, -0.5F, 0F, -0.6F, -0.5F, -0.5F, -0.2F, -0.5F, -0.5F, -0.2F, -0.15F, -0.15F, -0.6F, -0.15F, -0.15F, -0.6F, 0F, -0.5F, -0.2F, 0F, -0.5F); // Lamp
		bodyModel[410].setRotationPoint(-35.5F, -1F, -10.3F);

		bodyModel[411].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F); // Box 506
		bodyModel[411].setRotationPoint(-35.25F, -1F, -10.3F);

		bodyModel[412].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, -0.8F, -0.1F, 0F, -0.8F, -0.1F, 0F, -0.8F, -0.1F, -0.3F, -0.8F, -0.1F, -0.3F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, -0.3F, 0F, -0.1F); // Box 507
		bodyModel[412].setRotationPoint(-35.25F, -2F, -10.3F);

		bodyModel[413].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, -0.5F, -0.5F, -0.6F, -0.5F, -0.5F, -0.6F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, -0.5F, -0.6F, 0F, -0.5F, -0.6F, -0.15F, -0.15F, -0.2F, -0.15F, -0.15F); // Lamp
		bodyModel[413].setRotationPoint(-35.5F, -1F, -0.5F);

		bodyModel[414].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, -0.5F, 0F, -0.6F, -0.5F, 0F, -0.6F, -0.5F, -0.5F, -0.2F, -0.5F, -0.5F, -0.2F, -0.15F, -0.15F, -0.6F, -0.15F, -0.15F, -0.6F, 0F, -0.5F, -0.2F, 0F, -0.5F); // Lamp
		bodyModel[414].setRotationPoint(-35.5F, -1F, -0.5F);

		bodyModel[415].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, -0.15F, -0.15F, -0.6F, -0.15F, -0.15F, -0.6F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, -0.5F, 0F, -0.6F, -0.5F, 0F, -0.6F, -0.5F, -0.5F, -0.2F, -0.5F, -0.5F); // Lamp
		bodyModel[415].setRotationPoint(-35.5F, -1F, -0.5F);

		bodyModel[416].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.5F, -0.6F, 0F, -0.5F, -0.6F, -0.15F, -0.15F, -0.2F, -0.15F, -0.15F, -0.2F, -0.5F, -0.5F, -0.6F, -0.5F, -0.5F, -0.6F, -0.5F, 0F, -0.2F, -0.5F, 0F); // Lamp
		bodyModel[416].setRotationPoint(-35.5F, -1F, -0.5F);

		bodyModel[417].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F); // Box 512
		bodyModel[417].setRotationPoint(-35.25F, -1F, -0.5F);

		bodyModel[418].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, -0.8F, -0.1F, 0F, -0.8F, -0.1F, 0F, -0.8F, -0.1F, -0.3F, -0.8F, -0.1F, -0.3F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, -0.3F, 0F, -0.1F); // Box 513
		bodyModel[418].setRotationPoint(-35.25F, -2F, -0.5F);

		bodyModel[419].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, -0.5F, -0.5F, -0.6F, -0.5F, -0.5F, -0.6F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, -0.5F, -0.6F, 0F, -0.5F, -0.6F, -0.15F, -0.15F, -0.2F, -0.15F, -0.15F); // Lamp
		bodyModel[419].setRotationPoint(-35.5F, -1F, 8.8F);

		bodyModel[420].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, -0.5F, 0F, -0.6F, -0.5F, 0F, -0.6F, -0.5F, -0.5F, -0.2F, -0.5F, -0.5F, -0.2F, -0.15F, -0.15F, -0.6F, -0.15F, -0.15F, -0.6F, 0F, -0.5F, -0.2F, 0F, -0.5F); // Lamp
		bodyModel[420].setRotationPoint(-35.5F, -1F, 8.8F);

		bodyModel[421].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, -0.15F, -0.15F, -0.6F, -0.15F, -0.15F, -0.6F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, -0.5F, 0F, -0.6F, -0.5F, 0F, -0.6F, -0.5F, -0.5F, -0.2F, -0.5F, -0.5F); // Lamp
		bodyModel[421].setRotationPoint(-35.5F, -1F, 8.8F);

		bodyModel[422].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.5F, -0.6F, 0F, -0.5F, -0.6F, -0.15F, -0.15F, -0.2F, -0.15F, -0.15F, -0.2F, -0.5F, -0.5F, -0.6F, -0.5F, -0.5F, -0.6F, -0.5F, 0F, -0.2F, -0.5F, 0F); // Lamp
		bodyModel[422].setRotationPoint(-35.5F, -1F, 8.8F);

		bodyModel[423].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F); // Box 518
		bodyModel[423].setRotationPoint(-35.25F, -1F, 8.8F);

		bodyModel[424].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, -0.8F, -0.1F, 0F, -0.8F, -0.1F, 0F, -0.8F, -0.1F, -0.3F, -0.8F, -0.1F, -0.3F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, -0.3F, 0F, -0.1F); // Box 519
		bodyModel[424].setRotationPoint(-35.25F, -2F, 8.8F);

		bodyModel[425].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.5F, -0.6F, 0F, -0.5F, -0.6F, -0.15F, -0.15F, -0.2F, -0.15F, -0.15F, -0.2F, -0.5F, -0.5F, -0.6F, -0.5F, -0.5F, -0.6F, -0.5F, 0F, -0.2F, -0.5F, 0F); // Lamp
		bodyModel[425].setRotationPoint(-34.15F, -15.8F, -0.5F);

		bodyModel[426].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, -0.5F, -0.5F, -0.6F, -0.5F, -0.5F, -0.6F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, -0.5F, -0.6F, 0F, -0.5F, -0.6F, -0.15F, -0.15F, -0.2F, -0.15F, -0.15F); // Lamp
		bodyModel[426].setRotationPoint(-34.15F, -15.8F, -0.5F);

		bodyModel[427].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, -0.15F, -0.15F, -0.6F, -0.15F, -0.15F, -0.6F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, -0.5F, 0F, -0.6F, -0.5F, 0F, -0.6F, -0.5F, -0.5F, -0.2F, -0.5F, -0.5F); // Lamp
		bodyModel[427].setRotationPoint(-34.15F, -15.8F, -0.5F);

		bodyModel[428].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, -0.5F, 0F, -0.6F, -0.5F, 0F, -0.6F, -0.5F, -0.5F, -0.2F, -0.5F, -0.5F, -0.2F, -0.15F, -0.15F, -0.6F, -0.15F, -0.15F, -0.6F, 0F, -0.5F, -0.2F, 0F, -0.5F); // Lamp
		bodyModel[428].setRotationPoint(-34.15F, -15.8F, -0.5F);

		bodyModel[429].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F); // Box 524
		bodyModel[429].setRotationPoint(-33.9F, -15.8F, -0.5F);

		bodyModel[430].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, -0.8F, -0.1F, 0F, -0.8F, -0.1F, 0F, -0.8F, -0.1F, -0.3F, -0.8F, -0.1F, -0.3F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, -0.3F, 0F, -0.1F); // Box 525
		bodyModel[430].setRotationPoint(-33.9F, -16.8F, -0.5F);

		bodyModel[431].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 526
		bodyModel[431].setRotationPoint(-29F, -16F, 4F);

		bodyModel[432].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.65F, -0.7F, 0F, -0.65F, -0.7F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 527
		bodyModel[432].setRotationPoint(-26F, -16F, 4F);

		bodyModel[433].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.65F, -0.7F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.65F, -0.7F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 528
		bodyModel[433].setRotationPoint(-30F, -16F, 4F);

		bodyModel[434].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 529
		bodyModel[434].setRotationPoint(-30F, -15.5F, 4F);

		bodyModel[435].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 530
		bodyModel[435].setRotationPoint(-26F, -15.5F, 4F);

		bodyModel[436].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 531
		bodyModel[436].setRotationPoint(-29F, -16F, -5F);

		bodyModel[437].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, -0.5F, -0.65F, -0.7F, -0.5F, -0.65F, -0.7F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 532
		bodyModel[437].setRotationPoint(-26F, -16F, -5F);

		bodyModel[438].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.65F, -0.7F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.65F, -0.7F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 533
		bodyModel[438].setRotationPoint(-30F, -16F, -5F);

		bodyModel[439].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 534
		bodyModel[439].setRotationPoint(-30F, -15.5F, -5F);

		bodyModel[440].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 535
		bodyModel[440].setRotationPoint(-26F, -15.5F, -5F);

		bodyModel[441].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.25F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.625F, -0.625F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.25F); // Box 614
		bodyModel[441].setRotationPoint(11.5F, -21.65F, 3.05F);

		bodyModel[442].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, -0.75F, 0F, -0.625F, -0.625F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.75F, 0F, 0F, -0.5F); // Box 615
		bodyModel[442].setRotationPoint(12F, -21.65F, 3.05F);

		bodyModel[443].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.625F, -0.625F, -0.5F, -0.75F, -0.75F, -0.5F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.75F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 616
		bodyModel[443].setRotationPoint(12F, -21.65F, 2.05F);

		bodyModel[444].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, -0.5F, -0.5F, -0.625F, -0.625F, -0.5F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.25F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 617
		bodyModel[444].setRotationPoint(11.5F, -21.65F, 2.05F);

		bodyModel[445].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.75F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.625F, -0.625F, -0.5F, -0.75F, -0.75F, -0.5F, -0.75F, 0F, 0F, -0.5F, 0F); // Box 618
		bodyModel[445].setRotationPoint(12F, -20.65F, 2.05F);

		bodyModel[446].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.25F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.625F, -0.625F, -0.5F, -0.5F, 0F, 0F, -0.25F, 0F); // Box 619
		bodyModel[446].setRotationPoint(11.5F, -20.65F, 2.05F);

		bodyModel[447].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 620
		bodyModel[447].setRotationPoint(11F, -20.65F, 2.05F);

		bodyModel[448].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 621
		bodyModel[448].setRotationPoint(11F, -21.65F, 2.05F);

		bodyModel[449].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 622
		bodyModel[449].setRotationPoint(11F, -20.65F, 3.05F);

		bodyModel[450].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 623
		bodyModel[450].setRotationPoint(11F, -21.65F, 3.05F);

		bodyModel[451].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, -0.25F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.625F, -0.625F, 0F, -0.5F, -0.5F); // Box 624
		bodyModel[451].setRotationPoint(11.5F, -20.65F, 3.05F);

		bodyModel[452].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, -0.75F, 0F, -0.625F, -0.625F); // Box 625
		bodyModel[452].setRotationPoint(12F, -20.65F, 3.05F);

		bodyModel[453].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 626
		bodyModel[453].setRotationPoint(12F, -20.9F, 2.3F);

		bodyModel[454].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 557
		bodyModel[454].setRotationPoint(-29F, -2.5F, 8F);

		bodyModel[455].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 567
		bodyModel[455].setRotationPoint(-19F, -2.5F, 8F);

		bodyModel[456].addShapeBox(0F, 0F, 0F, 40, 0, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 558
		bodyModel[456].setRotationPoint(-29F, -10.9F, 8F);
		bodyModel[456].rotateAngleX = -0.59341195F;

		bodyModel[457].addShapeBox(0F, 0F, 0F, 40, 0, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 559
		bodyModel[457].setRotationPoint(-29F, -10.5F, 8F);
		bodyModel[457].rotateAngleX = -0.59341195F;

		bodyModel[458].addShapeBox(0F, 0F, 0F, 40, 0, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 560
		bodyModel[458].setRotationPoint(-29F, -9.7F, 8F);
		bodyModel[458].rotateAngleX = -0.59341195F;

		bodyModel[459].addShapeBox(0F, 0F, 0F, 40, 0, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 561
		bodyModel[459].setRotationPoint(-29F, -10.1F, 8F);
		bodyModel[459].rotateAngleX = -0.59341195F;

		bodyModel[460].addShapeBox(0F, 0F, 0F, 40, 0, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 562
		bodyModel[460].setRotationPoint(-29F, -8.1F, 8F);
		bodyModel[460].rotateAngleX = -0.59341195F;

		bodyModel[461].addShapeBox(0F, 0F, 0F, 40, 0, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 563
		bodyModel[461].setRotationPoint(-29F, -8.5F, 8F);
		bodyModel[461].rotateAngleX = -0.59341195F;

		bodyModel[462].addShapeBox(0F, 0F, 0F, 40, 0, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 564
		bodyModel[462].setRotationPoint(-29F, -8.9F, 8F);
		bodyModel[462].rotateAngleX = -0.59341195F;

		bodyModel[463].addShapeBox(0F, 0F, 0F, 40, 0, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 565
		bodyModel[463].setRotationPoint(-29F, -9.3F, 8F);
		bodyModel[463].rotateAngleX = -0.59341195F;

		bodyModel[464].addShapeBox(0F, 0F, 0F, 40, 0, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 566
		bodyModel[464].setRotationPoint(-29F, -4.9F, 8F);
		bodyModel[464].rotateAngleX = -0.59341195F;

		bodyModel[465].addShapeBox(0F, 0F, 0F, 40, 0, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 567
		bodyModel[465].setRotationPoint(-29F, -5.3F, 8F);
		bodyModel[465].rotateAngleX = -0.59341195F;

		bodyModel[466].addShapeBox(0F, 0F, 0F, 40, 0, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 568
		bodyModel[466].setRotationPoint(-29F, -5.7F, 8F);
		bodyModel[466].rotateAngleX = -0.59341195F;

		bodyModel[467].addShapeBox(0F, 0F, 0F, 40, 0, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 569
		bodyModel[467].setRotationPoint(-29F, -6.1F, 8F);
		bodyModel[467].rotateAngleX = -0.59341195F;

		bodyModel[468].addShapeBox(0F, 0F, 0F, 40, 0, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 570
		bodyModel[468].setRotationPoint(-29F, -6.5F, 8F);
		bodyModel[468].rotateAngleX = -0.59341195F;

		bodyModel[469].addShapeBox(0F, 0F, 0F, 40, 0, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 571
		bodyModel[469].setRotationPoint(-29F, -6.9F, 8F);
		bodyModel[469].rotateAngleX = -0.59341195F;

		bodyModel[470].addShapeBox(0F, 0F, 0F, 40, 0, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 572
		bodyModel[470].setRotationPoint(-29F, -7.3F, 8F);
		bodyModel[470].rotateAngleX = -0.59341195F;

		bodyModel[471].addShapeBox(0F, 0F, 0F, 40, 0, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 573
		bodyModel[471].setRotationPoint(-29F, -7.7F, 8F);
		bodyModel[471].rotateAngleX = -0.59341195F;

		bodyModel[472].addShapeBox(0F, 0F, 0F, 40, 0, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 574
		bodyModel[472].setRotationPoint(-29F, -4.5F, 8F);
		bodyModel[472].rotateAngleX = -0.59341195F;

		bodyModel[473].addShapeBox(0F, 0F, 0F, 40, 0, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 575
		bodyModel[473].setRotationPoint(-29F, -4.1F, 8F);
		bodyModel[473].rotateAngleX = -0.59341195F;

		bodyModel[474].addShapeBox(0F, 0F, 0F, 40, 0, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 576
		bodyModel[474].setRotationPoint(-29F, -3.7F, 8F);
		bodyModel[474].rotateAngleX = -0.59341195F;

		bodyModel[475].addShapeBox(0F, 0F, 0F, 40, 0, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 577
		bodyModel[475].setRotationPoint(-29F, -3.3F, 8F);
		bodyModel[475].rotateAngleX = -0.59341195F;

		bodyModel[476].addShapeBox(0F, 0F, 0F, 40, 0, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 578
		bodyModel[476].setRotationPoint(-29F, -2.9F, 8F);
		bodyModel[476].rotateAngleX = -0.59341195F;

		bodyModel[477].addShapeBox(0F, 0F, 0F, 40, 0, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 579
		bodyModel[477].setRotationPoint(-29F, -2.5F, 8F);
		bodyModel[477].rotateAngleX = -0.59341195F;

		bodyModel[478].addShapeBox(0F, 0F, 0F, 1, 0, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 580
		bodyModel[478].setRotationPoint(-33.9F, -5.7F, -6F);
		bodyModel[478].rotateAngleZ = 0.59341195F;

		bodyModel[479].addShapeBox(0F, 0F, 0F, 1, 0, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 581
		bodyModel[479].setRotationPoint(-33.9F, -5.3F, -6F);
		bodyModel[479].rotateAngleZ = 0.59341195F;

		bodyModel[480].addShapeBox(0F, 0F, 0F, 1, 0, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 582
		bodyModel[480].setRotationPoint(-33.9F, -4.9F, -6F);
		bodyModel[480].rotateAngleZ = 0.59341195F;

		bodyModel[481].addShapeBox(0F, 0F, 0F, 1, 0, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 583
		bodyModel[481].setRotationPoint(-33.9F, -4.5F, -6F);
		bodyModel[481].rotateAngleZ = 0.59341195F;

		bodyModel[482].addShapeBox(0F, 0F, 0F, 1, 0, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 584
		bodyModel[482].setRotationPoint(-33.9F, -6.1F, -6F);
		bodyModel[482].rotateAngleZ = 0.59341195F;

		bodyModel[483].addShapeBox(0F, 0F, 0F, 1, 0, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 585
		bodyModel[483].setRotationPoint(-33.9F, -6.5F, -6F);
		bodyModel[483].rotateAngleZ = 0.59341195F;

		bodyModel[484].addShapeBox(0F, 0F, 0F, 1, 0, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 586
		bodyModel[484].setRotationPoint(-33.9F, -6.9F, -6F);
		bodyModel[484].rotateAngleZ = 0.59341195F;

		bodyModel[485].addShapeBox(0F, 0F, 0F, 1, 0, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 587
		bodyModel[485].setRotationPoint(-33.9F, -7.3F, -6F);
		bodyModel[485].rotateAngleZ = 0.59341195F;

		bodyModel[486].addShapeBox(0F, 0F, 0F, 1, 0, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 588
		bodyModel[486].setRotationPoint(-33.9F, -7.7F, -6F);
		bodyModel[486].rotateAngleZ = 0.59341195F;

		bodyModel[487].addShapeBox(0F, 0F, 0F, 1, 0, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 589
		bodyModel[487].setRotationPoint(-33.9F, -8.1F, -6F);
		bodyModel[487].rotateAngleZ = 0.59341195F;

		bodyModel[488].addShapeBox(0F, 0F, 0F, 1, 0, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 590
		bodyModel[488].setRotationPoint(-33.9F, -8.5F, -6F);
		bodyModel[488].rotateAngleZ = 0.59341195F;

		bodyModel[489].addShapeBox(0F, 0F, 0F, 1, 0, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 591
		bodyModel[489].setRotationPoint(-33.9F, -8.9F, -6F);
		bodyModel[489].rotateAngleZ = 0.59341195F;

		bodyModel[490].addShapeBox(0F, 0F, 0F, 1, 0, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 592
		bodyModel[490].setRotationPoint(-33.9F, -9.3F, -6F);
		bodyModel[490].rotateAngleZ = 0.59341195F;

		bodyModel[491].addShapeBox(0F, 0F, 0F, 1, 0, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 593
		bodyModel[491].setRotationPoint(-33.9F, -9.7F, -6F);
		bodyModel[491].rotateAngleZ = 0.59341195F;

		bodyModel[492].addShapeBox(0F, 0F, 0F, 1, 0, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 594
		bodyModel[492].setRotationPoint(-33.9F, -10.1F, -6F);
		bodyModel[492].rotateAngleZ = 0.59341195F;

		bodyModel[493].addShapeBox(0F, 0F, 0F, 1, 0, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 595
		bodyModel[493].setRotationPoint(-33.9F, -10.5F, -6F);
		bodyModel[493].rotateAngleZ = 0.59341195F;

		bodyModel[494].addShapeBox(0F, 0F, 0F, 1, 0, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 596
		bodyModel[494].setRotationPoint(-33.9F, -10.9F, -6F);
		bodyModel[494].rotateAngleZ = 0.59341195F;

		bodyModel[495].addShapeBox(0F, 0F, 0F, 1, 0, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 597
		bodyModel[495].setRotationPoint(-33.9F, -11.3F, -6F);
		bodyModel[495].rotateAngleZ = 0.59341195F;

		bodyModel[496].addShapeBox(0F, 0F, 0F, 1, 0, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 598
		bodyModel[496].setRotationPoint(-33.9F, -11.7F, -6F);
		bodyModel[496].rotateAngleZ = 0.59341195F;

		bodyModel[497].addShapeBox(0F, 0F, 0F, 1, 0, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 599
		bodyModel[497].setRotationPoint(-33.9F, -12.1F, -6F);
		bodyModel[497].rotateAngleZ = 0.59341195F;

		bodyModel[498].addShapeBox(0F, 0F, 0F, 1, 0, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 600
		bodyModel[498].setRotationPoint(-33.9F, -12.5F, -6F);
		bodyModel[498].rotateAngleZ = 0.59341195F;

		bodyModel[499].addShapeBox(0F, 0F, 0F, 1, 0, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 603
		bodyModel[499].setRotationPoint(-33.9F, -3.3F, -6F);
		bodyModel[499].rotateAngleZ = 0.59341195F;
	}

	private void initbodyModel_2()
	{
		bodyModel[500] = new ModelRendererTurbo(this, 481, 161, textureX, textureY); // Box 604
		bodyModel[501] = new ModelRendererTurbo(this, 73, 169, textureX, textureY); // Box 605
		bodyModel[502] = new ModelRendererTurbo(this, 433, 169, textureX, textureY); // Box 606
		bodyModel[503] = new ModelRendererTurbo(this, 449, 169, textureX, textureY); // Box 607
		bodyModel[504] = new ModelRendererTurbo(this, 473, 169, textureX, textureY); // Box 608
		bodyModel[505] = new ModelRendererTurbo(this, 177, 185, textureX, textureY); // Box 610
		bodyModel[506] = new ModelRendererTurbo(this, 265, 185, textureX, textureY); // Box 611
		bodyModel[507] = new ModelRendererTurbo(this, 353, 185, textureX, textureY); // Box 612
		bodyModel[508] = new ModelRendererTurbo(this, 1, 193, textureX, textureY); // Box 613
		bodyModel[509] = new ModelRendererTurbo(this, 89, 193, textureX, textureY); // Box 614
		bodyModel[510] = new ModelRendererTurbo(this, 177, 193, textureX, textureY); // Box 615
		bodyModel[511] = new ModelRendererTurbo(this, 265, 193, textureX, textureY); // Box 616
		bodyModel[512] = new ModelRendererTurbo(this, 353, 193, textureX, textureY); // Box 617
		bodyModel[513] = new ModelRendererTurbo(this, 1, 201, textureX, textureY); // Box 618
		bodyModel[514] = new ModelRendererTurbo(this, 89, 201, textureX, textureY); // Box 619
		bodyModel[515] = new ModelRendererTurbo(this, 177, 201, textureX, textureY); // Box 620
		bodyModel[516] = new ModelRendererTurbo(this, 265, 201, textureX, textureY); // Box 621
		bodyModel[517] = new ModelRendererTurbo(this, 353, 201, textureX, textureY); // Box 622
		bodyModel[518] = new ModelRendererTurbo(this, 1, 209, textureX, textureY); // Box 623
		bodyModel[519] = new ModelRendererTurbo(this, 89, 209, textureX, textureY); // Box 624
		bodyModel[520] = new ModelRendererTurbo(this, 177, 209, textureX, textureY); // Box 625
		bodyModel[521] = new ModelRendererTurbo(this, 265, 209, textureX, textureY); // Box 626
		bodyModel[522] = new ModelRendererTurbo(this, 353, 209, textureX, textureY); // Box 627
		bodyModel[523] = new ModelRendererTurbo(this, 1, 217, textureX, textureY); // Box 628
		bodyModel[524] = new ModelRendererTurbo(this, 89, 217, textureX, textureY); // Box 629
		bodyModel[525] = new ModelRendererTurbo(this, 177, 217, textureX, textureY); // Box 630
		bodyModel[526] = new ModelRendererTurbo(this, 265, 217, textureX, textureY); // Box 631

		bodyModel[500].addShapeBox(0F, 0F, 0F, 1, 0, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 604
		bodyModel[500].setRotationPoint(-33.9F, -2.9F, -6F);
		bodyModel[500].rotateAngleZ = 0.59341195F;

		bodyModel[501].addShapeBox(0F, 0F, 0F, 1, 0, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 605
		bodyModel[501].setRotationPoint(-33.9F, -3.7F, -6F);
		bodyModel[501].rotateAngleZ = 0.59341195F;

		bodyModel[502].addShapeBox(0F, 0F, 0F, 1, 0, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 606
		bodyModel[502].setRotationPoint(-33.9F, -4.1F, -6F);
		bodyModel[502].rotateAngleZ = 0.59341195F;

		bodyModel[503].addShapeBox(0F, 0F, 0F, 1, 0, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 607
		bodyModel[503].setRotationPoint(-33.9F, -2.5F, -6F);
		bodyModel[503].rotateAngleZ = 0.59341195F;

		bodyModel[504].addShapeBox(0F, 0F, 0F, 1, 0, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 608
		bodyModel[504].setRotationPoint(-33.9F, -2.1F, -6F);
		bodyModel[504].rotateAngleZ = 0.59341195F;

		bodyModel[505].addShapeBox(0F, 0F, 0F, 40, 0, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 610
		bodyModel[505].setRotationPoint(-29.5F, -10.5F, -8.8F);
		bodyModel[505].rotateAngleX = 0.59341195F;

		bodyModel[506].addShapeBox(0F, 0F, 0F, 40, 0, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 611
		bodyModel[506].setRotationPoint(-29.5F, -10.1F, -8.8F);
		bodyModel[506].rotateAngleX = 0.59341195F;

		bodyModel[507].addShapeBox(0F, 0F, 0F, 40, 0, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 612
		bodyModel[507].setRotationPoint(-29.5F, -9.7F, -8.8F);
		bodyModel[507].rotateAngleX = 0.59341195F;

		bodyModel[508].addShapeBox(0F, 0F, 0F, 40, 0, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 613
		bodyModel[508].setRotationPoint(-29.5F, -9.3F, -8.8F);
		bodyModel[508].rotateAngleX = 0.59341195F;

		bodyModel[509].addShapeBox(0F, 0F, 0F, 40, 0, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 614
		bodyModel[509].setRotationPoint(-29.5F, -8.9F, -8.8F);
		bodyModel[509].rotateAngleX = 0.59341195F;

		bodyModel[510].addShapeBox(0F, 0F, 0F, 40, 0, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 615
		bodyModel[510].setRotationPoint(-29.5F, -8.5F, -8.8F);
		bodyModel[510].rotateAngleX = 0.59341195F;

		bodyModel[511].addShapeBox(0F, 0F, 0F, 40, 0, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 616
		bodyModel[511].setRotationPoint(-29.5F, -8.1F, -8.8F);
		bodyModel[511].rotateAngleX = 0.59341195F;

		bodyModel[512].addShapeBox(0F, 0F, 0F, 40, 0, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 617
		bodyModel[512].setRotationPoint(-29.5F, -7.3F, -8.8F);
		bodyModel[512].rotateAngleX = 0.59341195F;

		bodyModel[513].addShapeBox(0F, 0F, 0F, 40, 0, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 618
		bodyModel[513].setRotationPoint(-29.5F, -7.7F, -8.8F);
		bodyModel[513].rotateAngleX = 0.59341195F;

		bodyModel[514].addShapeBox(0F, 0F, 0F, 40, 0, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 619
		bodyModel[514].setRotationPoint(-29.5F, -6.9F, -8.8F);
		bodyModel[514].rotateAngleX = 0.59341195F;

		bodyModel[515].addShapeBox(0F, 0F, 0F, 40, 0, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 620
		bodyModel[515].setRotationPoint(-29.5F, -6.1F, -8.8F);
		bodyModel[515].rotateAngleX = 0.59341195F;

		bodyModel[516].addShapeBox(0F, 0F, 0F, 40, 0, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 621
		bodyModel[516].setRotationPoint(-29.5F, -6.5F, -8.8F);
		bodyModel[516].rotateAngleX = 0.59341195F;

		bodyModel[517].addShapeBox(0F, 0F, 0F, 40, 0, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 622
		bodyModel[517].setRotationPoint(-29.5F, -5.7F, -8.8F);
		bodyModel[517].rotateAngleX = 0.59341195F;

		bodyModel[518].addShapeBox(0F, 0F, 0F, 40, 0, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 623
		bodyModel[518].setRotationPoint(-29.5F, -5.3F, -8.8F);
		bodyModel[518].rotateAngleX = 0.59341195F;

		bodyModel[519].addShapeBox(0F, 0F, 0F, 40, 0, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 624
		bodyModel[519].setRotationPoint(-29.5F, -4.9F, -8.8F);
		bodyModel[519].rotateAngleX = 0.59341195F;

		bodyModel[520].addShapeBox(0F, 0F, 0F, 40, 0, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 625
		bodyModel[520].setRotationPoint(-29.5F, -4.1F, -8.8F);
		bodyModel[520].rotateAngleX = 0.59341195F;

		bodyModel[521].addShapeBox(0F, 0F, 0F, 40, 0, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 626
		bodyModel[521].setRotationPoint(-29.5F, -4.5F, -8.8F);
		bodyModel[521].rotateAngleX = 0.59341195F;

		bodyModel[522].addShapeBox(0F, 0F, 0F, 40, 0, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 627
		bodyModel[522].setRotationPoint(-29.5F, -3.7F, -8.8F);
		bodyModel[522].rotateAngleX = 0.59341195F;

		bodyModel[523].addShapeBox(0F, 0F, 0F, 40, 0, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 628
		bodyModel[523].setRotationPoint(-29.5F, -3.3F, -8.8F);
		bodyModel[523].rotateAngleX = 0.59341195F;

		bodyModel[524].addShapeBox(0F, 0F, 0F, 40, 0, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 629
		bodyModel[524].setRotationPoint(-29.5F, -2.9F, -8.8F);
		bodyModel[524].rotateAngleX = 0.59341195F;

		bodyModel[525].addShapeBox(0F, 0F, 0F, 40, 0, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 630
		bodyModel[525].setRotationPoint(-29.5F, -2.4F, -8.8F);
		bodyModel[525].rotateAngleX = 0.59341195F;

		bodyModel[526].addShapeBox(0F, 0F, 0F, 40, 0, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 631
		bodyModel[526].setRotationPoint(-29.5F, -2F, -8.8F);
		bodyModel[526].rotateAngleX = 0.59341195F;
	}
	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {

		for (ModelRendererTurbo m : bodyModel) {
			if (m.boxName.equals("Lamp")) {
				Minecraft.getMinecraft().entityRenderer.disableLightmap(1D);
			}
			m.render(f5);
			if (m.boxName.equals("Lamp")) {
				Minecraft.getMinecraft().entityRenderer.enableLightmap(1D);
			}
		}
	}
}