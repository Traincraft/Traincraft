//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2021 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 15.09.2021 - 17:27:29
// Last changed on: 15.09.2021 - 17:27:29

package train.client.render.models; //Path where the model is located

import tmt.ModelConverter;
import tmt.ModelRendererTurbo;

public class ModelBR_MK4_DVT extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelBR_MK4_DVT() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[210];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // 01
		bodyModel[1] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // 02
		bodyModel[2] = new ModelRendererTurbo(this, 209, 9, textureX, textureY); // 03
		bodyModel[3] = new ModelRendererTurbo(this, 209, 17, textureX, textureY); // 04
		bodyModel[4] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // 05
		bodyModel[5] = new ModelRendererTurbo(this, 193, 25, textureX, textureY); // 06
		bodyModel[6] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // 07
		bodyModel[7] = new ModelRendererTurbo(this, 193, 41, textureX, textureY); // 08
		bodyModel[8] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // 09
		bodyModel[9] = new ModelRendererTurbo(this, 193, 49, textureX, textureY); // 10
		bodyModel[10] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // 11
		bodyModel[11] = new ModelRendererTurbo(this, 193, 57, textureX, textureY); // 12
		bodyModel[12] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // 13
		bodyModel[13] = new ModelRendererTurbo(this, 393, 33, textureX, textureY); // 22
		bodyModel[14] = new ModelRendererTurbo(this, 425, 41, textureX, textureY); // 23
		bodyModel[15] = new ModelRendererTurbo(this, 457, 49, textureX, textureY); // 24
		bodyModel[16] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // 25
		bodyModel[17] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // 26
		bodyModel[18] = new ModelRendererTurbo(this, 417, 9, textureX, textureY); // 27
		bodyModel[19] = new ModelRendererTurbo(this, 497, 9, textureX, textureY); // 28
		bodyModel[20] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // 29
		bodyModel[21] = new ModelRendererTurbo(this, 361, 25, textureX, textureY); // 31
		bodyModel[22] = new ModelRendererTurbo(this, 9, 9, textureX, textureY); // 44
		bodyModel[23] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // 45
		bodyModel[24] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // 46
		bodyModel[25] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // 47
		bodyModel[26] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // 48
		bodyModel[27] = new ModelRendererTurbo(this, 249, 73, textureX, textureY); // 63
		bodyModel[28] = new ModelRendererTurbo(this, 281, 73, textureX, textureY); // 64
		bodyModel[29] = new ModelRendererTurbo(this, 297, 73, textureX, textureY); // 65
		bodyModel[30] = new ModelRendererTurbo(this, 313, 73, textureX, textureY); // 66
		bodyModel[31] = new ModelRendererTurbo(this, 337, 81, textureX, textureY); // 67
		bodyModel[32] = new ModelRendererTurbo(this, 433, 17, textureX, textureY); // 68
		bodyModel[33] = new ModelRendererTurbo(this, 441, 17, textureX, textureY); // 69
		bodyModel[34] = new ModelRendererTurbo(this, 465, 17, textureX, textureY); // 70
		bodyModel[35] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // 71
		bodyModel[36] = new ModelRendererTurbo(this, 401, 17, textureX, textureY); // 72
		bodyModel[37] = new ModelRendererTurbo(this, 497, 25, textureX, textureY); // 73
		bodyModel[38] = new ModelRendererTurbo(this, 505, 25, textureX, textureY); // 74
		bodyModel[39] = new ModelRendererTurbo(this, 377, 73, textureX, textureY); // 75
		bodyModel[40] = new ModelRendererTurbo(this, 505, 65, textureX, textureY); // 76
		bodyModel[41] = new ModelRendererTurbo(this, 449, 73, textureX, textureY); // 77
		bodyModel[42] = new ModelRendererTurbo(this, 273, 81, textureX, textureY); // 78
		bodyModel[43] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // 79
		bodyModel[44] = new ModelRendererTurbo(this, 9, 89, textureX, textureY); // 80
		bodyModel[45] = new ModelRendererTurbo(this, 425, 33, textureX, textureY); // 81
		bodyModel[46] = new ModelRendererTurbo(this, 441, 33, textureX, textureY); // 82
		bodyModel[47] = new ModelRendererTurbo(this, 409, 33, textureX, textureY); // 83
		bodyModel[48] = new ModelRendererTurbo(this, 449, 33, textureX, textureY); // 84
		bodyModel[49] = new ModelRendererTurbo(this, 409, 41, textureX, textureY); // 85
		bodyModel[50] = new ModelRendererTurbo(this, 385, 49, textureX, textureY); // 86
		bodyModel[51] = new ModelRendererTurbo(this, 393, 49, textureX, textureY); // 87
		bodyModel[52] = new ModelRendererTurbo(this, 401, 49, textureX, textureY); // 88
		bodyModel[53] = new ModelRendererTurbo(this, 425, 49, textureX, textureY); // Box 88
		bodyModel[54] = new ModelRendererTurbo(this, 457, 57, textureX, textureY); // Box 88
		bodyModel[55] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 88
		bodyModel[56] = new ModelRendererTurbo(this, 17, 65, textureX, textureY); // Box 88
		bodyModel[57] = new ModelRendererTurbo(this, 17, 89, textureX, textureY); // Box 92
		bodyModel[58] = new ModelRendererTurbo(this, 49, 89, textureX, textureY); // Box 92
		bodyModel[59] = new ModelRendererTurbo(this, 33, 65, textureX, textureY); // Box 94
		bodyModel[60] = new ModelRendererTurbo(this, 49, 65, textureX, textureY); // Box 94
		bodyModel[61] = new ModelRendererTurbo(this, 465, 49, textureX, textureY); // Box 94
		bodyModel[62] = new ModelRendererTurbo(this, 489, 49, textureX, textureY); // Box 94
		bodyModel[63] = new ModelRendererTurbo(this, 65, 65, textureX, textureY); // Box 94
		bodyModel[64] = new ModelRendererTurbo(this, 81, 65, textureX, textureY); // Box 99
		bodyModel[65] = new ModelRendererTurbo(this, 505, 49, textureX, textureY); // Box 100
		bodyModel[66] = new ModelRendererTurbo(this, 121, 65, textureX, textureY); // Box 101
		bodyModel[67] = new ModelRendererTurbo(this, 129, 65, textureX, textureY); // Box 102
		bodyModel[68] = new ModelRendererTurbo(this, 409, 49, textureX, textureY); // Box 103
		bodyModel[69] = new ModelRendererTurbo(this, 145, 65, textureX, textureY); // Box 104
		bodyModel[70] = new ModelRendererTurbo(this, 441, 49, textureX, textureY); // Box 105
		bodyModel[71] = new ModelRendererTurbo(this, 441, 57, textureX, textureY); // Box 105
		bodyModel[72] = new ModelRendererTurbo(this, 161, 65, textureX, textureY); // Box 104
		bodyModel[73] = new ModelRendererTurbo(this, 177, 65, textureX, textureY); // Box 105
		bodyModel[74] = new ModelRendererTurbo(this, 185, 65, textureX, textureY); // Box 105
		bodyModel[75] = new ModelRendererTurbo(this, 337, 73, textureX, textureY); // Box 110
		bodyModel[76] = new ModelRendererTurbo(this, 489, 65, textureX, textureY); // Box 111
		bodyModel[77] = new ModelRendererTurbo(this, 361, 73, textureX, textureY); // Box 112
		bodyModel[78] = new ModelRendererTurbo(this, 425, 73, textureX, textureY); // Box 110
		bodyModel[79] = new ModelRendererTurbo(this, 273, 73, textureX, textureY); // Box 94
		bodyModel[80] = new ModelRendererTurbo(this, 41, 89, textureX, textureY); // Box 94
		bodyModel[81] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 94
		bodyModel[82] = new ModelRendererTurbo(this, 217, 73, textureX, textureY); // Box 94
		bodyModel[83] = new ModelRendererTurbo(this, 73, 89, textureX, textureY); // Box 94
		bodyModel[84] = new ModelRendererTurbo(this, 321, 73, textureX, textureY); // Box 100
		bodyModel[85] = new ModelRendererTurbo(this, 353, 73, textureX, textureY); // Box 101
		bodyModel[86] = new ModelRendererTurbo(this, 81, 89, textureX, textureY); // Box 102
		bodyModel[87] = new ModelRendererTurbo(this, 201, 73, textureX, textureY); // Box 103
		bodyModel[88] = new ModelRendererTurbo(this, 217, 81, textureX, textureY); // Box 104
		bodyModel[89] = new ModelRendererTurbo(this, 337, 73, textureX, textureY); // Box 105
		bodyModel[90] = new ModelRendererTurbo(this, 377, 73, textureX, textureY); // Box 105
		bodyModel[91] = new ModelRendererTurbo(this, 321, 81, textureX, textureY); // Box 104
		bodyModel[92] = new ModelRendererTurbo(this, 425, 73, textureX, textureY); // Box 105
		bodyModel[93] = new ModelRendererTurbo(this, 441, 73, textureX, textureY); // Box 105
		bodyModel[94] = new ModelRendererTurbo(this, 97, 89, textureX, textureY); // Box 112
		bodyModel[95] = new ModelRendererTurbo(this, 193, 57, textureX, textureY); // Box 130
		bodyModel[96] = new ModelRendererTurbo(this, 305, 73, textureX, textureY); // Box 130
		bodyModel[97] = new ModelRendererTurbo(this, 113, 89, textureX, textureY); // Box 88
		bodyModel[98] = new ModelRendererTurbo(this, 129, 89, textureX, textureY); // Box 88
		bodyModel[99] = new ModelRendererTurbo(this, 145, 89, textureX, textureY); // Box 88
		bodyModel[100] = new ModelRendererTurbo(this, 161, 89, textureX, textureY); // Box 88
		bodyModel[101] = new ModelRendererTurbo(this, 161, 89, textureX, textureY); // Box 92
		bodyModel[102] = new ModelRendererTurbo(this, 249, 89, textureX, textureY); // Box 92
		bodyModel[103] = new ModelRendererTurbo(this, 281, 89, textureX, textureY); // Box 94
		bodyModel[104] = new ModelRendererTurbo(this, 377, 89, textureX, textureY); // Box 94
		bodyModel[105] = new ModelRendererTurbo(this, 9, 89, textureX, textureY); // Box 94
		bodyModel[106] = new ModelRendererTurbo(this, 185, 89, textureX, textureY); // Box 94
		bodyModel[107] = new ModelRendererTurbo(this, 393, 89, textureX, textureY); // Box 94
		bodyModel[108] = new ModelRendererTurbo(this, 409, 89, textureX, textureY); // Box 99
		bodyModel[109] = new ModelRendererTurbo(this, 457, 89, textureX, textureY); // Box 100
		bodyModel[110] = new ModelRendererTurbo(this, 465, 89, textureX, textureY); // Box 101
		bodyModel[111] = new ModelRendererTurbo(this, 473, 89, textureX, textureY); // Box 102
		bodyModel[112] = new ModelRendererTurbo(this, 305, 81, textureX, textureY); // Box 103
		bodyModel[113] = new ModelRendererTurbo(this, 489, 89, textureX, textureY); // Box 104
		bodyModel[114] = new ModelRendererTurbo(this, 25, 89, textureX, textureY); // Box 105
		bodyModel[115] = new ModelRendererTurbo(this, 57, 89, textureX, textureY); // Box 105
		bodyModel[116] = new ModelRendererTurbo(this, 41, 97, textureX, textureY); // Box 104
		bodyModel[117] = new ModelRendererTurbo(this, 505, 89, textureX, textureY); // Box 105
		bodyModel[118] = new ModelRendererTurbo(this, 57, 97, textureX, textureY); // Box 105
		bodyModel[119] = new ModelRendererTurbo(this, 81, 97, textureX, textureY); // Box 110
		bodyModel[120] = new ModelRendererTurbo(this, 73, 97, textureX, textureY); // Box 111
		bodyModel[121] = new ModelRendererTurbo(this, 105, 97, textureX, textureY); // Box 112
		bodyModel[122] = new ModelRendererTurbo(this, 121, 97, textureX, textureY); // Box 110
		bodyModel[123] = new ModelRendererTurbo(this, 137, 97, textureX, textureY); // Box 94
		bodyModel[124] = new ModelRendererTurbo(this, 153, 97, textureX, textureY); // Box 94
		bodyModel[125] = new ModelRendererTurbo(this, 97, 97, textureX, textureY); // Box 94
		bodyModel[126] = new ModelRendererTurbo(this, 185, 97, textureX, textureY); // Box 94
		bodyModel[127] = new ModelRendererTurbo(this, 193, 97, textureX, textureY); // Box 94
		bodyModel[128] = new ModelRendererTurbo(this, 209, 97, textureX, textureY); // Box 100
		bodyModel[129] = new ModelRendererTurbo(this, 217, 97, textureX, textureY); // Box 101
		bodyModel[130] = new ModelRendererTurbo(this, 225, 97, textureX, textureY); // Box 102
		bodyModel[131] = new ModelRendererTurbo(this, 121, 97, textureX, textureY); // Box 103
		bodyModel[132] = new ModelRendererTurbo(this, 241, 97, textureX, textureY); // Box 104
		bodyModel[133] = new ModelRendererTurbo(this, 169, 97, textureX, textureY); // Box 105
		bodyModel[134] = new ModelRendererTurbo(this, 257, 97, textureX, textureY); // Box 105
		bodyModel[135] = new ModelRendererTurbo(this, 281, 97, textureX, textureY); // Box 104
		bodyModel[136] = new ModelRendererTurbo(this, 297, 97, textureX, textureY); // Box 105
		bodyModel[137] = new ModelRendererTurbo(this, 305, 97, textureX, textureY); // Box 105
		bodyModel[138] = new ModelRendererTurbo(this, 313, 97, textureX, textureY); // Box 112
		bodyModel[139] = new ModelRendererTurbo(this, 329, 97, textureX, textureY); // Box 130
		bodyModel[140] = new ModelRendererTurbo(this, 393, 97, textureX, textureY); // Box 130
		bodyModel[141] = new ModelRendererTurbo(this, 377, 97, textureX, textureY); // Box 176
		bodyModel[142] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 177
		bodyModel[143] = new ModelRendererTurbo(this, 49, 105, textureX, textureY); // Box 178
		bodyModel[144] = new ModelRendererTurbo(this, 121, 105, textureX, textureY); // Box 179
		bodyModel[145] = new ModelRendererTurbo(this, 273, 89, textureX, textureY); // Box 180
		bodyModel[146] = new ModelRendererTurbo(this, 33, 105, textureX, textureY); // Box 180
		bodyModel[147] = new ModelRendererTurbo(this, 489, 89, textureX, textureY); // Box 180
		bodyModel[148] = new ModelRendererTurbo(this, 185, 186, textureX, textureY); // 04
		bodyModel[149] = new ModelRendererTurbo(this, 1, 186, textureX, textureY); // 05
		bodyModel[150] = new ModelRendererTurbo(this, 1, 186, textureX, textureY); // 06
		bodyModel[151] = new ModelRendererTurbo(this, 185, 222, textureX, textureY); // 07
		bodyModel[152] = new ModelRendererTurbo(this, 225, 222, textureX, textureY); // 08
		bodyModel[153] = new ModelRendererTurbo(this, 249, 239, textureX, textureY); // 09
		bodyModel[154] = new ModelRendererTurbo(this, 273, 186, textureX, textureY); // 10
		bodyModel[155] = new ModelRendererTurbo(this, 281, 186, textureX, textureY); // 11
		bodyModel[156] = new ModelRendererTurbo(this, 384, 222, textureX, textureY); // 12
		bodyModel[157] = new ModelRendererTurbo(this, 329, 222, textureX, textureY); // 13
		bodyModel[158] = new ModelRendererTurbo(this, 384, 239, textureX, textureY); // 14
		bodyModel[159] = new ModelRendererTurbo(this, 407, 229, textureX, textureY); // 15
		bodyModel[160] = new ModelRendererTurbo(this, 446, 220, textureX, textureY); // 18
		bodyModel[161] = new ModelRendererTurbo(this, 225, 186, textureX, textureY); // 25
		bodyModel[162] = new ModelRendererTurbo(this, 473, 186, textureX, textureY); // 26
		bodyModel[163] = new ModelRendererTurbo(this, 329, 186, textureX, textureY); // 27
		bodyModel[164] = new ModelRendererTurbo(this, 145, 186, textureX, textureY); // 28
		bodyModel[165] = new ModelRendererTurbo(this, 241, 186, textureX, textureY); // 29
		bodyModel[166] = new ModelRendererTurbo(this, 289, 229, textureX, textureY); // 30
		bodyModel[167] = new ModelRendererTurbo(this, 385, 186, textureX, textureY); // 31
		bodyModel[168] = new ModelRendererTurbo(this, 433, 186, textureX, textureY); // 32
		bodyModel[169] = new ModelRendererTurbo(this, 489, 221, textureX, textureY); // 33
		bodyModel[170] = new ModelRendererTurbo(this, 417, 186, textureX, textureY); // 34
		bodyModel[171] = new ModelRendererTurbo(this, 321, 185, textureX, textureY); // 35
		bodyModel[172] = new ModelRendererTurbo(this, 349, 185, textureX, textureY); // 36
		bodyModel[173] = new ModelRendererTurbo(this, 1, 186, textureX, textureY); // 37
		bodyModel[174] = new ModelRendererTurbo(this, 321, 217, textureX, textureY); // 40
		bodyModel[175] = new ModelRendererTurbo(this, 345, 217, textureX, textureY); // 41
		bodyModel[176] = new ModelRendererTurbo(this, 505, 186, textureX, textureY); // 43
		bodyModel[177] = new ModelRendererTurbo(this, 305, 186, textureX, textureY); // 44
		bodyModel[178] = new ModelRendererTurbo(this, 201, 186, textureX, textureY); // 49
		bodyModel[179] = new ModelRendererTurbo(this, 249, 222, textureX, textureY); // 50
		bodyModel[180] = new ModelRendererTurbo(this, 481, 206, textureX, textureY); // 221
		bodyModel[181] = new ModelRendererTurbo(this, 161, 217, textureX, textureY); // 222
		bodyModel[182] = new ModelRendererTurbo(this, 289, 217, textureX, textureY); // 223
		bodyModel[183] = new ModelRendererTurbo(this, 337, 239, textureX, textureY); // 225
		bodyModel[184] = new ModelRendererTurbo(this, 361, 186, textureX, textureY); // 226
		bodyModel[185] = new ModelRendererTurbo(this, 385, 186, textureX, textureY); // 230
		bodyModel[186] = new ModelRendererTurbo(this, 409, 186, textureX, textureY); // 231
		bodyModel[187] = new ModelRendererTurbo(this, 1, 197, textureX, textureY); // 38
		bodyModel[188] = new ModelRendererTurbo(this, 185, 197, textureX, textureY); // 39
		bodyModel[189] = new ModelRendererTurbo(this, 89, 186, textureX, textureY); // 224
		bodyModel[190] = new ModelRendererTurbo(this, 385, 167, textureX, textureY); // 16
		bodyModel[191] = new ModelRendererTurbo(this, 401, 167, textureX, textureY); // 17
		bodyModel[192] = new ModelRendererTurbo(this, 465, 269, textureX, textureY); // 51
		bodyModel[193] = new ModelRendererTurbo(this, 1, 269, textureX, textureY); // 52
		bodyModel[194] = new ModelRendererTurbo(this, 497, 269, textureX, textureY); // 53
		bodyModel[195] = new ModelRendererTurbo(this, 33, 269, textureX, textureY); // 54
		bodyModel[196] = new ModelRendererTurbo(this, 57, 269, textureX, textureY); // 55
		bodyModel[197] = new ModelRendererTurbo(this, 169, 269, textureX, textureY); // 56
		bodyModel[198] = new ModelRendererTurbo(this, 81, 269, textureX, textureY); // 57
		bodyModel[199] = new ModelRendererTurbo(this, 89, 269, textureX, textureY); // 58
		bodyModel[200] = new ModelRendererTurbo(this, 113, 269, textureX, textureY); // 59
		bodyModel[201] = new ModelRendererTurbo(this, 185, 269, textureX, textureY); // 60
		bodyModel[202] = new ModelRendererTurbo(this, 441, 269, textureX, textureY); // 61
		bodyModel[203] = new ModelRendererTurbo(this, 465, 269, textureX, textureY); // 62
		bodyModel[204] = new ModelRendererTurbo(this, 385, 269, textureX, textureY); // 63
		bodyModel[205] = new ModelRendererTurbo(this, 161, 269, textureX, textureY); // 64
		bodyModel[206] = new ModelRendererTurbo(this, 225, 260, textureX, textureY); // 65
		bodyModel[207] = new ModelRendererTurbo(this, 233, 269, textureX, textureY); // 66
		bodyModel[208] = new ModelRendererTurbo(this, 481, 269, textureX, textureY); // 67
		bodyModel[209] = new ModelRendererTurbo(this, 113, 269, textureX, textureY); // 193

		bodyModel[0].addShapeBox(0F, 0F, 0F, 78, 1, 21, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // 01
		bodyModel[0].setRotationPoint(-41F, 0F, -11F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 77, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // 02
		bodyModel[1].setRotationPoint(-40F, -3F, -11F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 77, 3, 1, 0F,0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // 03
		bodyModel[2].setRotationPoint(-40F, -3F, 10F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 77, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0F, 0F, -0.9F); // 04
		bodyModel[3].setRotationPoint(-40F, -6F, -11F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 77, 3, 1, 0F,0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F, 0F); // 05
		bodyModel[4].setRotationPoint(-40F, -6F, 10F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 77, 11, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0F, 0F, -0.9F); // 06
		bodyModel[5].setRotationPoint(-40F, -17F, -11F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 77, 11, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F, 0F); // 07
		bodyModel[6].setRotationPoint(-40F, -17F, 10F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 72, 1, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // 08
		bodyModel[7].setRotationPoint(-35F, -18F, -11F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 72, 1, 1, 0F,0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // 09
		bodyModel[8].setRotationPoint(-35F, -18F, 10F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 72, 2, 3, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.9F, 0F, 0F, -2.9F); // 10
		bodyModel[9].setRotationPoint(-35F, -20F, -10F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 72, 2, 3, 0F,0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -2.9F, 0F, 0F, -2.9F, 0F, 0F, 0F, 0F, 0F, 0F); // 11
		bodyModel[10].setRotationPoint(-35F, -20F, 7F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 72, 2, 7, 0F,0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, -7F, 0F, 0.1F, -7F); // 12
		bodyModel[11].setRotationPoint(-35F, -22F, -7F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 72, 2, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0.1F, -7F, 0F, 0.1F, -7F, 0F, 0F, 0F, 0F, 0F, 0F); // 13
		bodyModel[12].setRotationPoint(-35F, -22F, 0F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 1, 3, 22, 0F,0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F); // 22
		bodyModel[13].setRotationPoint(38F, -3F, 11F);
		bodyModel[13].rotateAngleY = 3.14159265F;

		bodyModel[14].addShapeBox(0F, 0F, 0F, 1, 3, 22, 0F,0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F); // 23
		bodyModel[14].setRotationPoint(38F, -6F, 11F);
		bodyModel[14].rotateAngleY = 3.14159265F;

		bodyModel[15].addShapeBox(0F, 0F, 0F, 1, 11, 22, 0F,0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F); // 24
		bodyModel[15].setRotationPoint(38F, -17F, 11F);
		bodyModel[15].rotateAngleY = 3.14159265F;

		bodyModel[16].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, -3F, -1F, 0F, -2F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // 25
		bodyModel[16].setRotationPoint(38F, -20F, 11F);
		bodyModel[16].rotateAngleY = 3.14159265F;

		bodyModel[17].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -1F, 0F, -3F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1F); // 26
		bodyModel[17].setRotationPoint(38F, -20F, -7F);
		bodyModel[17].rotateAngleY = 3.14159265F;

		bodyModel[18].addShapeBox(0F, 0F, 0F, 1, 5, 6, 0F,-1F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // 27
		bodyModel[18].setRotationPoint(38F, -22F, 7F);
		bodyModel[18].rotateAngleY = 3.14159265F;

		bodyModel[19].addShapeBox(0F, 0F, 0F, 1, 5, 6, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // 28
		bodyModel[19].setRotationPoint(38F, -22F, -1F);
		bodyModel[19].rotateAngleY = 3.14159265F;

		bodyModel[20].addShapeBox(0F, 0F, 0F, 1, 5, 2, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // 29
		bodyModel[20].setRotationPoint(38F, -22F, 1F);
		bodyModel[20].rotateAngleY = 3.14159265F;

		bodyModel[21].addShapeBox(0F, 0F, 0F, 1, 1, 21, 0F,0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F); // 31
		bodyModel[21].setRotationPoint(38F, 0F, 11F);
		bodyModel[21].rotateAngleY = -3.14159265F;

		bodyModel[22].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.3F, 0.5F, 0F, -0.3F, 0.5F, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // 44
		bodyModel[22].setRotationPoint(-50F, 0F, 0F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0.1F, 0.5F, 0.1F, 0.1F, 0.5F, 0.1F, 0.1F, -0.5F, 0F, 0.1F, -0.5F, 0F, 0.3F, 0.5F, 0.1F, 0.3F, 0.5F, 0.1F, 0.3F, -0.5F, 0F, 0.3F, -0.5F); // 45
		bodyModel[23].setRotationPoint(-50F, 0F, 0F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F); // 46
		bodyModel[24].setRotationPoint(-51F, 0F, -1F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0.3F, -0.75F, 0F, 0.3F, -0.75F, 0F, 0.3F, 0.25F, -0.5F, 0.3F, 0.25F, -0.5F, -0.8F, -0.75F, 0F, -0.8F, -0.75F, 0F, -0.8F, 0.25F, -0.5F, -0.8F, 0.25F); // 47
		bodyModel[25].setRotationPoint(-51F, 1F, -1F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.5F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F, -0.5F, 0.5F, -0.75F, 0F, 0.5F, -0.75F, 0F, 0.5F, 0.25F, -0.5F, 0.5F, 0.25F); // 48
		bodyModel[26].setRotationPoint(-50F, 0F, -1F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 9, 5, 3, 0F,0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, 0F, -1.5F, -3F, 0F, -1.5F, -3F, 0F, 0F, 0F, 0F, 0F); // 63
		bodyModel[27].setRotationPoint(37F, 0F, 10F);
		bodyModel[27].rotateAngleY = -3.14159265F;

		bodyModel[28].addShapeBox(0F, 0F, 0F, 9, 5, 3, 0F,0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -1.5F, 0F, 0F, -1.5F); // 64
		bodyModel[28].setRotationPoint(37F, 0F, -7F);
		bodyModel[28].rotateAngleY = -3.14159265F;

		bodyModel[29].addShapeBox(0F, 0F, 0F, 2, 2, 14, 0F,0F, -0.5F, 0.65F, 0F, -0.5F, 0.65F, 0F, -0.5F, 0.65F, 0F, -0.5F, 0.65F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // 65
		bodyModel[29].setRotationPoint(37F, 3F, 7F);
		bodyModel[29].rotateAngleY = -3.14159265F;

		bodyModel[30].addShapeBox(0F, 0F, 0F, 2, 2, 18, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.65F, 0F, 0F, -0.65F, 0F, 0F, -0.65F, 0F, 0F, -0.65F); // 66
		bodyModel[30].setRotationPoint(37F, 0F, 9F);
		bodyModel[30].rotateAngleY = -3.14159265F;

		bodyModel[31].addShapeBox(0F, 0F, 0F, 7, 5, 18, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -2F, -3F, 0F, -2F, -3F, 0F, -2F, 0F, 0F, -2F); // 67
		bodyModel[31].setRotationPoint(35F, 0F, 9F);
		bodyModel[31].rotateAngleY = -3.14159265F;

		bodyModel[32].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // 68
		bodyModel[32].setRotationPoint(37F, 2F, 6F);
		bodyModel[32].rotateAngleY = -3.14159265F;

		bodyModel[33].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // 69
		bodyModel[33].setRotationPoint(37F, 2F, -5F);
		bodyModel[33].rotateAngleY = -3.14159265F;

		bodyModel[34].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.3F, 0.5F, 0F, -0.3F, 0.5F, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // 70
		bodyModel[34].setRotationPoint(39F, 1F, 0F);
		bodyModel[34].rotateAngleY = -3.14159265F;

		bodyModel[35].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0.1F, 0.5F, 0.1F, 0.1F, 0.5F, 0.1F, 0.1F, -0.5F, 0F, 0.1F, -0.5F, 0F, 0.3F, 0.5F, 0.1F, 0.3F, 0.5F, 0.1F, 0.3F, -0.5F, 0F, 0.3F, -0.5F); // 71
		bodyModel[35].setRotationPoint(39F, 1F, 0F);
		bodyModel[35].rotateAngleY = -3.14159265F;

		bodyModel[36].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F); // 72
		bodyModel[36].setRotationPoint(40F, 1F, 1F);
		bodyModel[36].rotateAngleY = -3.14159265F;

		bodyModel[37].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0.3F, -0.75F, 0F, 0.3F, -0.75F, 0F, 0.3F, 0.25F, -0.5F, 0.3F, 0.25F, -0.5F, -0.8F, -0.75F, 0F, -0.8F, -0.75F, 0F, -0.8F, 0.25F, -0.5F, -0.8F, 0.25F); // 73
		bodyModel[37].setRotationPoint(40F, 2F, 1F);
		bodyModel[37].rotateAngleY = -3.14159265F;

		bodyModel[38].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.5F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F, -0.5F, 0.5F, -0.75F, 0F, 0.5F, -0.75F, 0F, 0.5F, 0.25F, -0.5F, 0.5F, 0.25F); // 74
		bodyModel[38].setRotationPoint(39F, 1F, 1F);
		bodyModel[38].rotateAngleY = -3.14159265F;

		bodyModel[39].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0.5F, -0.3F, 0F); // 75
		bodyModel[39].setRotationPoint(39F, 0F, 4F);
		bodyModel[39].rotateAngleY = -3.14159265F;

		bodyModel[40].addShapeBox(0F, 0F, 0F, 1, 18, 1, 0F,-0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F); // 76
		bodyModel[40].setRotationPoint(39F, -18F, 5F);
		bodyModel[40].rotateAngleY = -3.14159265F;

		bodyModel[41].addShapeBox(0F, 0F, 0F, 1, 18, 1, 0F,-0.75F, 0F, 0F, 0.35F, 0F, 0F, 0.35F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F); // 77
		bodyModel[41].setRotationPoint(39F, -18F, -4F);
		bodyModel[41].rotateAngleY = -3.14159265F;

		bodyModel[42].addShapeBox(0F, 0F, 0F, 1, 18, 1, 0F,0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F); // 78
		bodyModel[42].setRotationPoint(39F, -18F, 5F);
		bodyModel[42].rotateAngleY = -3.14159265F;

		bodyModel[43].addShapeBox(0F, 0F, 0F, 1, 18, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F); // 79
		bodyModel[43].setRotationPoint(39F, -18F, -4F);
		bodyModel[43].rotateAngleY = -3.14159265F;

		bodyModel[44].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F,0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.6F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // 80
		bodyModel[44].setRotationPoint(39F, -19F, 4F);
		bodyModel[44].rotateAngleY = -3.14159265F;

		bodyModel[45].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.3F, -1F, 0F, -0.3F, -1F, 0F, -0.3F, 0F, -0.75F, -0.3F, 0F); // 81
		bodyModel[45].setRotationPoint(39F, 0F, 5F);
		bodyModel[45].rotateAngleY = -3.14159265F;

		bodyModel[46].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -1F, -0.75F, -0.3F, -1F); // 82
		bodyModel[46].setRotationPoint(39F, 0F, -4F);
		bodyModel[46].rotateAngleY = -3.14159265F;

		bodyModel[47].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.3F, -1F, 0F, -0.3F, -1F, 0F, -0.3F, 0F, 0.5F, -0.3F, 0F); // 83
		bodyModel[47].setRotationPoint(39F, 0F, 5F);
		bodyModel[47].rotateAngleY = -3.14159265F;

		bodyModel[48].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -1F, 0.5F, -0.3F, -1F); // 84
		bodyModel[48].setRotationPoint(39F, 0F, -4F);
		bodyModel[48].rotateAngleY = -3.14159265F;

		bodyModel[49].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F); // 85
		bodyModel[49].setRotationPoint(38F, -19F, 5F);
		bodyModel[49].rotateAngleY = -3.14159265F;

		bodyModel[50].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0.25F, 0F, -1F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F); // 86
		bodyModel[50].setRotationPoint(38F, -19F, -4F);
		bodyModel[50].rotateAngleY = -3.14159265F;

		bodyModel[51].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.5F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, 0.5F, 0F, 0F); // 87
		bodyModel[51].setRotationPoint(39F, -19F, 5F);
		bodyModel[51].rotateAngleY = -3.14159265F;

		bodyModel[52].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -1F, 0.5F, 0F, -1F, 0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, 0.5F, 0F, -0.5F); // 88
		bodyModel[52].setRotationPoint(39F, -19F, -4F);
		bodyModel[52].rotateAngleY = -3.14159265F;

		bodyModel[53].addBox(0F, 0F, 0F, 5, 5, 0, 0F); // Box 88
		bodyModel[53].setRotationPoint(-40F, 2F, -6F);

		bodyModel[54].addBox(0F, 0F, 0F, 5, 5, 0, 0F); // Box 88
		bodyModel[54].setRotationPoint(-40F, 2F, 6F);

		bodyModel[55].addBox(0F, 0F, 0F, 5, 5, 0, 0F); // Box 88
		bodyModel[55].setRotationPoint(-27F, 2F, -6F);

		bodyModel[56].addBox(0F, 0F, 0F, 5, 5, 0, 0F); // Box 88
		bodyModel[56].setRotationPoint(-27F, 2F, 6F);

		bodyModel[57].addBox(0F, 0F, 0F, 1, 1, 14, 0F); // Box 92
		bodyModel[57].setRotationPoint(-38F, 4F, -7F);

		bodyModel[58].addBox(0F, 0F, 0F, 1, 1, 14, 0F); // Box 92
		bodyModel[58].setRotationPoint(-25F, 4F, -7F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 94
		bodyModel[59].setRotationPoint(-39F, 2F, -8F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 94
		bodyModel[60].setRotationPoint(-27F, 2F, -8F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -2F, 0F); // Box 94
		bodyModel[61].setRotationPoint(-35F, 2F, -8F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0.5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0.5F, 0F); // Box 94
		bodyModel[62].setRotationPoint(-29F, 2F, -8F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 94
		bodyModel[63].setRotationPoint(-33F, 4F, -8F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 14, 1, 2, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 99
		bodyModel[64].setRotationPoint(-38F, 3F, -1F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -0.5F); // Box 100
		bodyModel[65].setRotationPoint(-32F, 1F, -9F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, 0F, 0F); // Box 101
		bodyModel[66].setRotationPoint(-31F, 1F, -9F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F,-0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 102
		bodyModel[67].setRotationPoint(-33F, 0F, -10F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.2F, 0.5F, 0F, -0.2F, 0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 103
		bodyModel[68].setRotationPoint(-31F, 2F, -8F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F); // Box 104
		bodyModel[69].setRotationPoint(-39F, 4F, -7F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.4F, -0.2F, 0.5F, -0.4F, -0.2F, 0.5F, -0.4F, -0.2F, -1F, -0.4F, -0.2F, -1F, 0F, -0.2F, 0F, -0.8F, -0.2F, 0F, -0.8F, -0.2F, -0.8F, 0F, -0.2F, -0.8F); // Box 105
		bodyModel[70].setRotationPoint(-39F, 2F, -7F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.8F, -0.2F, 0.5F, 0F, -0.2F, 0.5F, 0F, -0.2F, -1F, -0.8F, -0.2F, -1F, -0.8F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.8F, -0.8F, -0.2F, -0.8F); // Box 105
		bodyModel[71].setRotationPoint(-37F, 2F, -7F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F); // Box 104
		bodyModel[72].setRotationPoint(-26F, 4F, -7F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, -0.2F, 0.5F, -0.8F, -0.2F, 0.5F, -0.8F, -0.2F, -1F, 0F, -0.2F, -1F, 0F, -0.2F, 0F, -0.8F, -0.2F, 0F, -0.8F, -0.2F, -0.8F, 0F, -0.2F, -0.8F); // Box 105
		bodyModel[73].setRotationPoint(-26F, 2F, -7F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.4F, -0.2F, 0.5F, -0.4F, -0.2F, 0.5F, -0.4F, -0.2F, -1F, -0.4F, -0.2F, -1F, -0.8F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.8F, -0.8F, -0.2F, -0.8F); // Box 105
		bodyModel[74].setRotationPoint(-24F, 2F, -7F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 110
		bodyModel[75].setRotationPoint(-32F, 2F, -7F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 111
		bodyModel[76].setRotationPoint(-32F, 0F, -1F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 4, 4, 2, 0F,-3F, -0.5F, 0.2F, -0.5F, -0.5F, 0.2F, -0.5F, -0.5F, -1.7F, -3F, -0.5F, -1.7F, 0F, -0.5F, -1.5F, -3.5F, -0.5F, -1.5F, -3.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 112
		bodyModel[77].setRotationPoint(-33F, 1F, -10F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 110
		bodyModel[78].setRotationPoint(-32F, 2F, 1F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 94
		bodyModel[79].setRotationPoint(-23F, 2F, 8F);
		bodyModel[79].rotateAngleY = -3.14159265F;

		bodyModel[80].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 94
		bodyModel[80].setRotationPoint(-35F, 2F, 8F);
		bodyModel[80].rotateAngleY = -3.14159265F;

		bodyModel[81].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -2F, 0F); // Box 94
		bodyModel[81].setRotationPoint(-27F, 2F, 8F);
		bodyModel[81].rotateAngleY = -3.14159265F;

		bodyModel[82].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0.5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0.5F, 0F); // Box 94
		bodyModel[82].setRotationPoint(-33F, 2F, 8F);
		bodyModel[82].rotateAngleY = -3.14159265F;

		bodyModel[83].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 94
		bodyModel[83].setRotationPoint(-29F, 4F, 8F);
		bodyModel[83].rotateAngleY = -3.14159265F;

		bodyModel[84].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -0.5F); // Box 100
		bodyModel[84].setRotationPoint(-30F, 1F, 9F);
		bodyModel[84].rotateAngleY = -3.14159265F;

		bodyModel[85].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, 0F, 0F); // Box 101
		bodyModel[85].setRotationPoint(-31F, 1F, 9F);
		bodyModel[85].rotateAngleY = -3.14159265F;

		bodyModel[86].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F,-0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 102
		bodyModel[86].setRotationPoint(-29F, 0F, 10F);
		bodyModel[86].rotateAngleY = -3.14159265F;

		bodyModel[87].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.2F, 0.5F, 0F, -0.2F, 0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 103
		bodyModel[87].setRotationPoint(-31F, 2F, 8F);
		bodyModel[87].rotateAngleY = -3.14159265F;

		bodyModel[88].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F); // Box 104
		bodyModel[88].setRotationPoint(-23F, 4F, 7F);
		bodyModel[88].rotateAngleY = -3.14159265F;

		bodyModel[89].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.4F, -0.2F, 0.5F, -0.4F, -0.2F, 0.5F, -0.4F, -0.2F, -1F, -0.4F, -0.2F, -1F, 0F, -0.2F, 0F, -0.8F, -0.2F, 0F, -0.8F, -0.2F, -0.8F, 0F, -0.2F, -0.8F); // Box 105
		bodyModel[89].setRotationPoint(-23F, 2F, 7F);
		bodyModel[89].rotateAngleY = -3.14159265F;

		bodyModel[90].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.8F, -0.2F, 0.5F, 0F, -0.2F, 0.5F, 0F, -0.2F, -1F, -0.8F, -0.2F, -1F, -0.8F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.8F, -0.8F, -0.2F, -0.8F); // Box 105
		bodyModel[90].setRotationPoint(-25F, 2F, 7F);
		bodyModel[90].rotateAngleY = -3.14159265F;

		bodyModel[91].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F); // Box 104
		bodyModel[91].setRotationPoint(-36F, 4F, 7F);
		bodyModel[91].rotateAngleY = -3.14159265F;

		bodyModel[92].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, -0.2F, 0.5F, -0.8F, -0.2F, 0.5F, -0.8F, -0.2F, -1F, 0F, -0.2F, -1F, 0F, -0.2F, 0F, -0.8F, -0.2F, 0F, -0.8F, -0.2F, -0.8F, 0F, -0.2F, -0.8F); // Box 105
		bodyModel[92].setRotationPoint(-36F, 2F, 7F);
		bodyModel[92].rotateAngleY = -3.14159265F;

		bodyModel[93].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.4F, -0.2F, 0.5F, -0.4F, -0.2F, 0.5F, -0.4F, -0.2F, -1F, -0.4F, -0.2F, -1F, -0.8F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.8F, -0.8F, -0.2F, -0.8F); // Box 105
		bodyModel[93].setRotationPoint(-38F, 2F, 7F);
		bodyModel[93].rotateAngleY = -3.14159265F;

		bodyModel[94].addShapeBox(0F, 0F, 0F, 4, 4, 2, 0F,-0.5F, -0.5F, 0.2F, -3F, -0.5F, 0.2F, -3F, -0.5F, -1.7F, -0.5F, -0.5F, -1.7F, -3.5F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, 0F, -3.5F, -0.5F, 0F); // Box 112
		bodyModel[94].setRotationPoint(-29F, 1F, 10F);
		bodyModel[94].rotateAngleY = -3.14159265F;

		bodyModel[95].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, -0.5F, 0.2F, -0.5F, -0.5F, 0.2F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 130
		bodyModel[95].setRotationPoint(-30F, 1F, -10F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, -0.5F, 0.5F, -0.5F, -0.5F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F); // Box 130
		bodyModel[96].setRotationPoint(-29F, 1F, 10F);
		bodyModel[96].rotateAngleY = -3.14159265F;

		bodyModel[97].addBox(0F, 0F, 0F, 5, 5, 0, 0F); // Box 88
		bodyModel[97].setRotationPoint(10F, 2F, -6F);

		bodyModel[98].addBox(0F, 0F, 0F, 5, 5, 0, 0F); // Box 88
		bodyModel[98].setRotationPoint(10F, 2F, 6F);

		bodyModel[99].addBox(0F, 0F, 0F, 5, 5, 0, 0F); // Box 88
		bodyModel[99].setRotationPoint(23F, 2F, -6F);

		bodyModel[100].addBox(0F, 0F, 0F, 5, 5, 0, 0F); // Box 88
		bodyModel[100].setRotationPoint(23F, 2F, 6F);

		bodyModel[101].addBox(0F, 0F, 0F, 1, 1, 14, 0F); // Box 92
		bodyModel[101].setRotationPoint(12F, 4F, -7F);

		bodyModel[102].addBox(0F, 0F, 0F, 1, 1, 14, 0F); // Box 92
		bodyModel[102].setRotationPoint(25F, 4F, -7F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 94
		bodyModel[103].setRotationPoint(11F, 2F, -8F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 94
		bodyModel[104].setRotationPoint(23F, 2F, -8F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -2F, 0F); // Box 94
		bodyModel[105].setRotationPoint(15F, 2F, -8F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0.5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0.5F, 0F); // Box 94
		bodyModel[106].setRotationPoint(21F, 2F, -8F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 94
		bodyModel[107].setRotationPoint(17F, 4F, -8F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 14, 1, 2, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 99
		bodyModel[108].setRotationPoint(12F, 3F, -1F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -0.5F); // Box 100
		bodyModel[109].setRotationPoint(18F, 1F, -9F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, 0F, 0F); // Box 101
		bodyModel[110].setRotationPoint(19F, 1F, -9F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F,-0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 102
		bodyModel[111].setRotationPoint(17F, 0F, -10F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.2F, 0.5F, 0F, -0.2F, 0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 103
		bodyModel[112].setRotationPoint(19F, 2F, -8F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F); // Box 104
		bodyModel[113].setRotationPoint(11F, 4F, -7F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.4F, -0.2F, 0.5F, -0.4F, -0.2F, 0.5F, -0.4F, -0.2F, -1F, -0.4F, -0.2F, -1F, 0F, -0.2F, 0F, -0.8F, -0.2F, 0F, -0.8F, -0.2F, -0.8F, 0F, -0.2F, -0.8F); // Box 105
		bodyModel[114].setRotationPoint(11F, 2F, -7F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.8F, -0.2F, 0.5F, 0F, -0.2F, 0.5F, 0F, -0.2F, -1F, -0.8F, -0.2F, -1F, -0.8F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.8F, -0.8F, -0.2F, -0.8F); // Box 105
		bodyModel[115].setRotationPoint(13F, 2F, -7F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F); // Box 104
		bodyModel[116].setRotationPoint(24F, 4F, -7F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, -0.2F, 0.5F, -0.8F, -0.2F, 0.5F, -0.8F, -0.2F, -1F, 0F, -0.2F, -1F, 0F, -0.2F, 0F, -0.8F, -0.2F, 0F, -0.8F, -0.2F, -0.8F, 0F, -0.2F, -0.8F); // Box 105
		bodyModel[117].setRotationPoint(24F, 2F, -7F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.4F, -0.2F, 0.5F, -0.4F, -0.2F, 0.5F, -0.4F, -0.2F, -1F, -0.4F, -0.2F, -1F, -0.8F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.8F, -0.8F, -0.2F, -0.8F); // Box 105
		bodyModel[118].setRotationPoint(26F, 2F, -7F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 110
		bodyModel[119].setRotationPoint(18F, 2F, -7F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 111
		bodyModel[120].setRotationPoint(18F, 0F, -1F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 4, 4, 2, 0F,-3F, -0.5F, 0.2F, -0.5F, -0.5F, 0.2F, -0.5F, -0.5F, -1.7F, -3F, -0.5F, -1.7F, 0F, -0.5F, -1.5F, -3.5F, -0.5F, -1.5F, -3.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 112
		bodyModel[121].setRotationPoint(21F, 1F, 10F);
		bodyModel[121].rotateAngleY = -3.14159265F;

		bodyModel[122].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 110
		bodyModel[122].setRotationPoint(18F, 2F, 1F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 94
		bodyModel[123].setRotationPoint(27F, 2F, 8F);
		bodyModel[123].rotateAngleY = -3.14159265F;

		bodyModel[124].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 94
		bodyModel[124].setRotationPoint(15F, 2F, 8F);
		bodyModel[124].rotateAngleY = -3.14159265F;

		bodyModel[125].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -2F, 0F); // Box 94
		bodyModel[125].setRotationPoint(23F, 2F, 8F);
		bodyModel[125].rotateAngleY = -3.14159265F;

		bodyModel[126].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0.5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0.5F, 0F); // Box 94
		bodyModel[126].setRotationPoint(17F, 2F, 8F);
		bodyModel[126].rotateAngleY = -3.14159265F;

		bodyModel[127].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 94
		bodyModel[127].setRotationPoint(21F, 4F, 8F);
		bodyModel[127].rotateAngleY = -3.14159265F;

		bodyModel[128].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -0.5F); // Box 100
		bodyModel[128].setRotationPoint(20F, 1F, 9F);
		bodyModel[128].rotateAngleY = -3.14159265F;

		bodyModel[129].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, 0F, 0F); // Box 101
		bodyModel[129].setRotationPoint(19F, 1F, 9F);
		bodyModel[129].rotateAngleY = -3.14159265F;

		bodyModel[130].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F,-0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 102
		bodyModel[130].setRotationPoint(21F, 0F, 10F);
		bodyModel[130].rotateAngleY = -3.14159265F;

		bodyModel[131].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.2F, 0.5F, 0F, -0.2F, 0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 103
		bodyModel[131].setRotationPoint(19F, 2F, 8F);
		bodyModel[131].rotateAngleY = -3.14159265F;

		bodyModel[132].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F); // Box 104
		bodyModel[132].setRotationPoint(27F, 4F, 7F);
		bodyModel[132].rotateAngleY = -3.14159265F;

		bodyModel[133].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.4F, -0.2F, 0.5F, -0.4F, -0.2F, 0.5F, -0.4F, -0.2F, -1F, -0.4F, -0.2F, -1F, 0F, -0.2F, 0F, -0.8F, -0.2F, 0F, -0.8F, -0.2F, -0.8F, 0F, -0.2F, -0.8F); // Box 105
		bodyModel[133].setRotationPoint(27F, 2F, 7F);
		bodyModel[133].rotateAngleY = -3.14159265F;

		bodyModel[134].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.8F, -0.2F, 0.5F, 0F, -0.2F, 0.5F, 0F, -0.2F, -1F, -0.8F, -0.2F, -1F, -0.8F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.8F, -0.8F, -0.2F, -0.8F); // Box 105
		bodyModel[134].setRotationPoint(25F, 2F, 7F);
		bodyModel[134].rotateAngleY = -3.14159265F;

		bodyModel[135].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F); // Box 104
		bodyModel[135].setRotationPoint(14F, 4F, 7F);
		bodyModel[135].rotateAngleY = -3.14159265F;

		bodyModel[136].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, -0.2F, 0.5F, -0.8F, -0.2F, 0.5F, -0.8F, -0.2F, -1F, 0F, -0.2F, -1F, 0F, -0.2F, 0F, -0.8F, -0.2F, 0F, -0.8F, -0.2F, -0.8F, 0F, -0.2F, -0.8F); // Box 105
		bodyModel[136].setRotationPoint(14F, 2F, 7F);
		bodyModel[136].rotateAngleY = -3.14159265F;

		bodyModel[137].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.4F, -0.2F, 0.5F, -0.4F, -0.2F, 0.5F, -0.4F, -0.2F, -1F, -0.4F, -0.2F, -1F, -0.8F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.8F, -0.8F, -0.2F, -0.8F); // Box 105
		bodyModel[137].setRotationPoint(12F, 2F, 7F);
		bodyModel[137].rotateAngleY = -3.14159265F;

		bodyModel[138].addShapeBox(0F, 0F, 0F, 4, 4, 2, 0F,-0.5F, -0.5F, 0.2F, -3F, -0.5F, 0.2F, -3F, -0.5F, -1.7F, -0.5F, -0.5F, -1.7F, -3.5F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, 0F, -3.5F, -0.5F, 0F); // Box 112
		bodyModel[138].setRotationPoint(17F, 1F, -10F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, -0.5F, 0.2F, -0.5F, -0.5F, 0.2F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 130
		bodyModel[139].setRotationPoint(18F, 1F, 10F);
		bodyModel[139].rotateAngleY = -3.14159265F;

		bodyModel[140].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, -0.5F, 0.5F, -0.5F, -0.5F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F); // Box 130
		bodyModel[140].setRotationPoint(17F, 1F, -10F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 30, 5, 22, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F); // Box 176
		bodyModel[141].setRotationPoint(-21F, 0F, -11F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 1, 3, 22, 0F,0F, 0F, -0.1F, -0.9F, 0F, -0.1F, -0.9F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.6F, -0.9F, 0F, -0.6F, -0.9F, 0F, -0.6F, 0F, 0F, -0.6F); // Box 177
		bodyModel[142].setRotationPoint(-29F, -3F, -11F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 1, 3, 22, 0F,0F, 0F, -0.1F, -0.9F, 0F, -0.1F, -0.9F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, -0.9F, 0F, -0.1F, -0.9F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 178
		bodyModel[143].setRotationPoint(-29F, -6F, -11F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 1, 11, 22, 0F,0F, 0F, -0.6F, -0.9F, 0F, -0.6F, -0.9F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.1F, -0.9F, 0F, -0.1F, -0.9F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 179
		bodyModel[144].setRotationPoint(-29F, -17F, -11F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 1, 1, 20, 0F,0F, 0F, -0.1F, -0.9F, 0F, -0.1F, -0.9F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0.4F, -0.9F, 0F, 0.4F, -0.9F, 0F, 0.4F, 0F, 0F, 0.4F); // Box 180
		bodyModel[145].setRotationPoint(-29F, -18F, -10F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 1, 2, 16, 0F,0F, 0F, -1.1F, -0.9F, 0F, -1.1F, -0.9F, 0F, -1.1F, 0F, 0F, -1.1F, 0F, 0F, 1.9F, -0.9F, 0F, 1.9F, -0.9F, 0F, 1.9F, 0F, 0F, 1.9F); // Box 180
		bodyModel[146].setRotationPoint(-29F, -20F, -8F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,0F, -0.05F, -4.1F, -0.9F, -0.05F, -4.1F, -0.9F, -0.05F, -4.1F, 0F, -0.05F, -4.1F, 0F, 0F, 1.9F, -0.9F, 0F, 1.9F, -0.9F, 0F, 1.9F, 0F, 0F, 1.9F); // Box 180
		bodyModel[147].setRotationPoint(-29F, -22F, -5F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 5, 1, 22, 0F,0.5F, 0F, -1F, 2F, 0F, -0.4F, 2F, 0F, -0.4F, 0.5F, 0F, -1F, 0.5F, -0.5F, -1F, 2F, -0.5F, -0.5F, 2F, -0.5F, -0.5F, 0.5F, -0.5F, -1F); // 04
		bodyModel[148].setRotationPoint(-45F, -1F, -11F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 8, 3, 1, 0F,1.5F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F, -0.9F, 1.5F, 0F, 0F, 0F, 0F, -0.9F, 0F, 0F, -0.5F, 0F, 0F, -0.4F, 0F, 0F, 0F); // 05
		bodyModel[149].setRotationPoint(-48F, -3F, -11F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 8, 3, 1, 0F,1.5F, 0F, 0F, 0F, 0F, -0.9F, 0F, 0F, 0F, 1.5F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.5F, 0F, 0F, -0.9F); // 06
		bodyModel[150].setRotationPoint(-48F, -3F, 10F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 9, 2, 1, 0F,0.5F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0.5F, 0F, 0F, 0.5F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0.5F, 0F, 0F); // 07
		bodyModel[151].setRotationPoint(-49F, -5F, -11F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 9, 2, 1, 0F,0.5F, 0F, 0F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0.5F, 0F, -0.9F, 0.5F, 0F, 0F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0.5F, 0F, -0.9F); // 08
		bodyModel[152].setRotationPoint(-49F, -5F, 10F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 9, 12, 1, 0F,-9F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.4F, -9F, 0F, -0.4F, 0.5F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0.5F, 0F, 0F); // 09
		bodyModel[153].setRotationPoint(-49F, -17F, -11F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 9, 12, 1, 0F,-9F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.5F, -9F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0.5F, 0F, -0.9F); // 10
		bodyModel[154].setRotationPoint(-49F, -17F, 10F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 1, 3, 20, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // 11
		bodyModel[155].setRotationPoint(-49F, -3F, -10F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 1, 2, 7, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // 12
		bodyModel[156].setRotationPoint(-49F, -5F, -10F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 1, 2, 7, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // 13
		bodyModel[157].setRotationPoint(-49F, -5F, 3F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // 14
		bodyModel[158].setRotationPoint(-49F, -5F, -3F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 4, 6, 20, 0F,-4.25F, 0F, 0.25F, 0.3F, 0F, 0.25F, 0.3F, 0F, 0.25F, -4.25F, 0F, 0.25F, 0.5F, 0F, 0F, 0.2F, 0F, 0.4F, 0.2F, 0F, 0.4F, 0.5F, 0F, 0F); // 15
		bodyModel[159].setRotationPoint(-49F, -11F, -10F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 5, 6, 1, 0F,-5F, 0F, 0.5F, 0.3F, 0F, 0.5F, 0.3F, 0F, -0.5F, -5F, 0F, -0.5F, -0.2F, 0F, 0.5F, -4.6F, 0F, 0.5F, -4.6F, 0F, -0.5F, -0.2F, 0F, -0.5F); // 18
		bodyModel[160].setRotationPoint(-45F, -17F, 0F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 5, 5, 2, 0F,-5F, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, -5F, 0F, 0F, 0.2F, 0F, 0F, -3.8F, 0F, 0F, -3.8F, 0F, 0F, 0.2F, 0F, 0F); // 25
		bodyModel[161].setRotationPoint(-40F, -22F, -1F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 5, 5, 6, 0F,-5F, -2F, 0F, 0F, -2.1F, 0F, 0F, -0.1F, 0F, -5F, 0F, 0F, 0.2F, 0F, 0F, -3.8F, 0F, 0F, -3.8F, 0F, 0F, 0.2F, 0F, 0F); // 26
		bodyModel[162].setRotationPoint(-40F, -22F, -7F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 5, 5, 6, 0F,-5F, 0F, 0F, 0F, -0.1F, 0F, 0F, -2.1F, 0F, -5F, -2F, 0F, 0.2F, 0F, 0F, -3.8F, 0F, 0F, -3.8F, 0F, 0F, 0.2F, 0F, 0F); // 27
		bodyModel[163].setRotationPoint(-40F, -22F, 1F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 5, 3, 3, 0F,-5F, -2F, 0F, 0F, -3F, 0.5F, 0F, -0.1F, 0F, -5F, 0F, 0F, 0F, 0F, 0.5F, -3.8F, 0F, 0.5F, -3.8F, 0F, 0F, 0.2F, 0F, 0F); // 28
		bodyModel[164].setRotationPoint(-40F, -20F, -10F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 5, 3, 3, 0F,-5F, 0F, 0F, 0F, -0.1F, 0F, 0F, -3F, 0.5F, -5F, -2F, 0F, 0.2F, 0F, 0F, -3.8F, 0F, 0F, -3.8F, 0F, 0.5F, 0F, 0F, 0.5F); // 29
		bodyModel[165].setRotationPoint(-40F, -20F, 7F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 7, 6, 20, 0F,0F, -1F, 0F, 0F, -1F, 0.5F, 0F, -1F, 0.5F, 0F, -1F, 0F, -4F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -4F, 0F, -1F); // 30
		bodyModel[166].setRotationPoint(-48F, -1F, -10F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 1, 4, 22, 0F,0F, -0.5F, -0.9F, 0F, -0.5F, -0.9F, 0F, -0.5F, -0.9F, 0F, -0.5F, -0.9F, 0F, 0F, -2F, -1F, 0F, -2F, -1F, 0F, -2F, 0F, 0F, -2F); // 31
		bodyModel[167].setRotationPoint(-41F, 1F, -11F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 3, 1, 22, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0.5F, -0.9F, -2F, 0.5F, -0.9F, -2F, 0.5F, -0.9F, 0F, 0.5F, -0.9F); // 32
		bodyModel[168].setRotationPoint(-41F, 0F, -11F);

		bodyModel[169].addShapeBox(0F, 0F, 0F, 2, 2, 8, 0F,0.1F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0F, 0.1F, 0.5F, 0F, 0.1F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0.1F, -0.5F, 0F); // 33
		bodyModel[169].setRotationPoint(-48F, 0F, -10F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 2, 2, 8, 0F,0.1F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0.1F, 0.5F, -0.5F, 0.1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0.1F, -0.5F, -0.5F); // 34
		bodyModel[170].setRotationPoint(-48F, 0F, 2F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F); // 35
		bodyModel[171].setRotationPoint(-48F, -1F, -2F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, -0.1F, 0F, 0.5F, -0.1F, 0F, 0.5F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // 36
		bodyModel[172].setRotationPoint(-48F, 1F, -2F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 1, 1, 22, 0F,-0.05F, 0F, -0.6F, -0.5F, 0F, -0.6F, -0.5F, 0F, -0.6F, -0.05F, 0F, -0.6F, 0.55F, -0.3F, -0.6F, -0.9F, -0.3F, -0.6F, -0.9F, -0.3F, -0.6F, 0.55F, -0.3F, -0.6F); // 37
		bodyModel[173].setRotationPoint(-40F, -17F, -11F);

		bodyModel[174].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,-0.8F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.8F, -0.5F, 0F, -0.8F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.8F, -0.5F, 0F); // 40
		bodyModel[174].setRotationPoint(-52F, -1F, -9F);

		bodyModel[175].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,-0.8F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.8F, -0.5F, 0F, -0.8F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.8F, -0.5F, 0F); // 41
		bodyModel[175].setRotationPoint(-52F, -1F, 6F);

		bodyModel[176].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, -0.5F, 0.5F, -0.5F); // 43
		bodyModel[176].setRotationPoint(-49F, -1F, -9F);

		bodyModel[177].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.5F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, -1F, -0.5F, -0.5F, -1F, -0.5F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, -1F, -0.5F, 0.5F, -1F); // 44
		bodyModel[177].setRotationPoint(-49F, -1F, 9F);

		bodyModel[178].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.7F, -0.5F, 0.15F, -0.1F, -0.5F, 0.15F, 0F, -0.5F, -0.85F, -0.7F, -0.5F, -0.85F, -0.7F, 0.5F, 0.15F, -0.1F, 0.5F, 0.15F, -0.1F, 0.5F, -0.85F, -0.7F, 0.5F, -0.85F); // 49
		bodyModel[178].setRotationPoint(-49F, 0F, -4F);

		bodyModel[179].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.7F, -0.5F, 0.15F, -0.1F, -0.5F, 0.15F, 0F, -0.5F, -0.85F, -0.7F, -0.5F, -0.85F, -0.7F, 0.5F, 0.15F, -0.1F, 0.5F, 0.15F, -0.1F, 0.5F, -0.85F, -0.7F, 0.5F, -0.85F); // 50
		bodyModel[179].setRotationPoint(-49F, 0F, 4F);

		bodyModel[180].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, 0F, -0.2F, 0F); // 221
		bodyModel[180].setRotationPoint(-49F, -1F, -5F);

		bodyModel[181].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0.2F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, -0.5F, 0F, 0.2F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -1F, 0F, -0.5F, -1F); // 222
		bodyModel[181].setRotationPoint(-49F, 0F, -5F);

		bodyModel[182].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0.2F, -0.5F, -0.5F, 0.2F, -0.5F, -0.5F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, -0.5F, -1F, -0.5F, -0.5F, -1F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // 223
		bodyModel[182].setRotationPoint(-49F, 0F, 3F);

		bodyModel[183].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,-2.5F, 0F, -0.1F, 0.6F, 0F, -0.1F, 0.6F, 0F, -0.8F, -2.5F, 0F, -0.8F, -0.2F, 0F, -0.1F, -1.7F, 0F, -0.1F, -1.7F, 0F, -0.8F, -0.2F, 0F, -0.8F); // 225
		bodyModel[183].setRotationPoint(-45F, -14F, -1F);

		bodyModel[184].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,-2.5F, 0F, -0.8F, 0.6F, 0F, -0.8F, 0.6F, 0F, -0.1F, -2.5F, 0F, -0.1F, -0.2F, 0F, -0.8F, -1.7F, 0F, -0.8F, -1.7F, 0F, -0.1F, -0.2F, 0F, -0.1F); // 226
		bodyModel[184].setRotationPoint(-45F, -14F, 0F);

		bodyModel[185].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,-1.3F, -1.5F, -2.1F, -0.6F, -1.5F, -2.1F, -0.6F, -1.5F, 1.2F, -1.3F, -1.5F, 1.2F, -0.2F, 0F, -0.1F, -1.7F, 0F, -0.1F, -1.7F, 0F, -0.8F, -0.2F, 0F, -0.8F); // 230
		bodyModel[185].setRotationPoint(-45F, -14F, -3F);

		bodyModel[186].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,-1.3F, -1.5F, 1.2F, -0.6F, -1.5F, 1.2F, -0.6F, -1.5F, -2.1F, -1.3F, -1.5F, -2.1F, -0.2F, 0F, -0.8F, -1.7F, 0F, -0.8F, -1.7F, 0F, -0.1F, -0.2F, 0F, -0.1F); // 231
		bodyModel[186].setRotationPoint(-45F, -14F, 2F);

		bodyModel[187].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // 38
		bodyModel[187].setRotationPoint(-51F, 0F, -8F);

		bodyModel[188].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // 39
		bodyModel[188].setRotationPoint(-51F, 0F, 7F);

		bodyModel[189].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0.5F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, 0.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, 0.5F, -0.2F, 0F); // 224
		bodyModel[189].setRotationPoint(-48F, -1F, -4F);

		bodyModel[190].addShapeBox(0F, 0F, 0F, 5, 6, 1, 0F,-5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.3F, -5F, 0F, 0F, -0.25F, 0F, -0.7F, 0F, 0F, -0.3F, 0F, 0F, -0.55F, -0.25F, 0F, 0.2F); // 16
		bodyModel[190].setRotationPoint(-45F, -17F, -11F);

		bodyModel[191].addShapeBox(0F, 0F, 0F, 5, 6, 1, 0F,-5F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.5F, -5F, 0F, -0.5F, -0.25F, 0F, 0.2F, 0F, 0F, -0.55F, 0F, 0F, -0.3F, -0.25F, 0F, -0.7F); // 17
		bodyModel[191].setRotationPoint(-45F, -17F, 10F);

		bodyModel[192].addShapeBox(0F, 0F, 0F, 2, 3, 11, 0F,-0.2F, 0F, -0.75F, -1.5F, 0F, -0.7F, -1.5F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -0.7F, -0.5F, 0F, -0.55F, -0.5F, 0F, 0F, -0.2F, 0F, 0F); // 51
		bodyModel[192].setRotationPoint(-45F, -11F, -11F);

		bodyModel[193].addShapeBox(0F, 0F, 0F, 2, 3, 7, 0F,-0.2F, -0.1F, 0F, -1.8F, -0.1F, 0F, -1.8F, -0.1F, -0.7F, -0.2F, -0.1F, -0.7F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.55F, 0F, 0F, -0.7F); // 52
		bodyModel[193].setRotationPoint(-45F, -11F, 4F);

		bodyModel[194].addShapeBox(0F, 0F, 0F, 2, 3, 4, 0F,-0.3F, 0F, 0F, -1.5F, 0F, 0F, -1F, 0F, 0.1F, -0.3F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // 53
		bodyModel[194].setRotationPoint(-45F, -11F, 0F);

		bodyModel[195].addShapeBox(0F, 0F, 0F, 6, 7, 2, 0F,0F, 0F, -0.55F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.4F, 0F, 0F, 0F, 1.5F, 0F, 0F); // 54
		bodyModel[195].setRotationPoint(-44F, -8F, -11F);

		bodyModel[196].addShapeBox(0F, 0F, 0F, 6, 7, 4, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F); // 55
		bodyModel[196].setRotationPoint(-45F, -8F, 0F);

		bodyModel[197].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F,0F, 0F, -0.6F, 0F, 0F, -0.25F, 0F, 0F, -0.6F, 0F, 0F, -0.4F, 0F, 0F, -0.6F, 0F, 0F, -0.2F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // 56
		bodyModel[197].setRotationPoint(-44F, -10F, -11F);

		bodyModel[198].addShapeBox(0F, 0F, 0F, 6, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.6F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 1F, 0F, -0.7F); // 57
		bodyModel[198].setRotationPoint(-44F, -8F, 10F);

		bodyModel[199].addShapeBox(0F, 0F, 0F, 2, 7, 9, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F); // 58
		bodyModel[199].setRotationPoint(-46F, -8F, -9F);

		bodyModel[200].addShapeBox(0F, 0F, 0F, 2, 7, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F); // 59
		bodyModel[200].setRotationPoint(-46F, -8F, 3F);

		bodyModel[201].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // 60
		bodyModel[201].setRotationPoint(-42F, -7F, -7F);

		bodyModel[202].addShapeBox(0F, 0F, 0F, 2, 6, 4, 0F,-1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // 61
		bodyModel[202].setRotationPoint(-39F, -12F, -7F);

		bodyModel[203].addShapeBox(0F, 0F, 0F, 1, 5, 4, 0F,0F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // 62
		bodyModel[203].setRotationPoint(-40F, -6F, -7F);

		bodyModel[204].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F); // 63
		bodyModel[204].setRotationPoint(-41F, -9F, -10F);

		bodyModel[205].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F); // 64
		bodyModel[205].setRotationPoint(-42F, -9F, 0F);

		bodyModel[206].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // 65
		bodyModel[206].setRotationPoint(-42F, -7F, 5F);

		bodyModel[207].addShapeBox(0F, 0F, 0F, 2, 5, 4, 0F,-1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // 66
		bodyModel[207].setRotationPoint(-39F, -11F, 5F);

		bodyModel[208].addShapeBox(0F, 0F, 0F, 1, 5, 4, 0F,0F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // 67
		bodyModel[208].setRotationPoint(-40F, -6F, 5F);

		bodyModel[209].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, 0F, -0.3F); // 193
		bodyModel[209].setRotationPoint(-41F, -9F, -10F);
	}
}