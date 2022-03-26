//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2022 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator:
// Created on:15.09.2021 - 17:27:29
// Last changed on: 15.09.2021 - 17:27:29

package train.client.render.models;

import net.minecraft.entity.Entity;
import tmt.ModelBase;
import tmt.ModelRendererTurbo;


public class ModelBR_MK4_DVT extends ModelBase
{
	int textureX = 512;
	int textureY = 512;

	public ModelBR_MK4_DVT()
	{
		br_mk4_dvtModel = new ModelRendererTurbo[210];
		br_mk4_dvtModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // 01
		br_mk4_dvtModel[1] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // 02
		br_mk4_dvtModel[2] = new ModelRendererTurbo(this, 209, 9, textureX, textureY); // 03
		br_mk4_dvtModel[3] = new ModelRendererTurbo(this, 209, 17, textureX, textureY); // 04
		br_mk4_dvtModel[4] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // 05
		br_mk4_dvtModel[5] = new ModelRendererTurbo(this, 193, 25, textureX, textureY); // 06
		br_mk4_dvtModel[6] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // 07
		br_mk4_dvtModel[7] = new ModelRendererTurbo(this, 193, 41, textureX, textureY); // 08
		br_mk4_dvtModel[8] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // 09
		br_mk4_dvtModel[9] = new ModelRendererTurbo(this, 193, 49, textureX, textureY); // 10
		br_mk4_dvtModel[10] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // 11
		br_mk4_dvtModel[11] = new ModelRendererTurbo(this, 193, 57, textureX, textureY); // 12
		br_mk4_dvtModel[12] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // 13
		br_mk4_dvtModel[13] = new ModelRendererTurbo(this, 393, 33, textureX, textureY); // 22
		br_mk4_dvtModel[14] = new ModelRendererTurbo(this, 425, 41, textureX, textureY); // 23
		br_mk4_dvtModel[15] = new ModelRendererTurbo(this, 457, 49, textureX, textureY); // 24
		br_mk4_dvtModel[16] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // 25
		br_mk4_dvtModel[17] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // 26
		br_mk4_dvtModel[18] = new ModelRendererTurbo(this, 417, 9, textureX, textureY); // 27
		br_mk4_dvtModel[19] = new ModelRendererTurbo(this, 497, 9, textureX, textureY); // 28
		br_mk4_dvtModel[20] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // 29
		br_mk4_dvtModel[21] = new ModelRendererTurbo(this, 361, 25, textureX, textureY); // 31
		br_mk4_dvtModel[22] = new ModelRendererTurbo(this, 9, 9, textureX, textureY); // 44
		br_mk4_dvtModel[23] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // 45
		br_mk4_dvtModel[24] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // 46
		br_mk4_dvtModel[25] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // 47
		br_mk4_dvtModel[26] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // 48
		br_mk4_dvtModel[27] = new ModelRendererTurbo(this, 249, 73, textureX, textureY); // 63
		br_mk4_dvtModel[28] = new ModelRendererTurbo(this, 281, 73, textureX, textureY); // 64
		br_mk4_dvtModel[29] = new ModelRendererTurbo(this, 297, 73, textureX, textureY); // 65
		br_mk4_dvtModel[30] = new ModelRendererTurbo(this, 313, 73, textureX, textureY); // 66
		br_mk4_dvtModel[31] = new ModelRendererTurbo(this, 337, 81, textureX, textureY); // 67
		br_mk4_dvtModel[32] = new ModelRendererTurbo(this, 433, 17, textureX, textureY); // 68
		br_mk4_dvtModel[33] = new ModelRendererTurbo(this, 441, 17, textureX, textureY); // 69
		br_mk4_dvtModel[34] = new ModelRendererTurbo(this, 465, 17, textureX, textureY); // 70
		br_mk4_dvtModel[35] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // 71
		br_mk4_dvtModel[36] = new ModelRendererTurbo(this, 401, 17, textureX, textureY); // 72
		br_mk4_dvtModel[37] = new ModelRendererTurbo(this, 497, 25, textureX, textureY); // 73
		br_mk4_dvtModel[38] = new ModelRendererTurbo(this, 505, 25, textureX, textureY); // 74
		br_mk4_dvtModel[39] = new ModelRendererTurbo(this, 377, 73, textureX, textureY); // 75
		br_mk4_dvtModel[40] = new ModelRendererTurbo(this, 505, 65, textureX, textureY); // 76
		br_mk4_dvtModel[41] = new ModelRendererTurbo(this, 449, 73, textureX, textureY); // 77
		br_mk4_dvtModel[42] = new ModelRendererTurbo(this, 273, 81, textureX, textureY); // 78
		br_mk4_dvtModel[43] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // 79
		br_mk4_dvtModel[44] = new ModelRendererTurbo(this, 9, 89, textureX, textureY); // 80
		br_mk4_dvtModel[45] = new ModelRendererTurbo(this, 425, 33, textureX, textureY); // 81
		br_mk4_dvtModel[46] = new ModelRendererTurbo(this, 441, 33, textureX, textureY); // 82
		br_mk4_dvtModel[47] = new ModelRendererTurbo(this, 409, 33, textureX, textureY); // 83
		br_mk4_dvtModel[48] = new ModelRendererTurbo(this, 449, 33, textureX, textureY); // 84
		br_mk4_dvtModel[49] = new ModelRendererTurbo(this, 409, 41, textureX, textureY); // 85
		br_mk4_dvtModel[50] = new ModelRendererTurbo(this, 385, 49, textureX, textureY); // 86
		br_mk4_dvtModel[51] = new ModelRendererTurbo(this, 393, 49, textureX, textureY); // 87
		br_mk4_dvtModel[52] = new ModelRendererTurbo(this, 401, 49, textureX, textureY); // 88
		br_mk4_dvtModel[53] = new ModelRendererTurbo(this, 425, 49, textureX, textureY); // Box 88
		br_mk4_dvtModel[54] = new ModelRendererTurbo(this, 457, 57, textureX, textureY); // Box 88
		br_mk4_dvtModel[55] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 88
		br_mk4_dvtModel[56] = new ModelRendererTurbo(this, 17, 65, textureX, textureY); // Box 88
		br_mk4_dvtModel[57] = new ModelRendererTurbo(this, 17, 89, textureX, textureY); // Box 92
		br_mk4_dvtModel[58] = new ModelRendererTurbo(this, 49, 89, textureX, textureY); // Box 92
		br_mk4_dvtModel[59] = new ModelRendererTurbo(this, 33, 65, textureX, textureY); // Box 94
		br_mk4_dvtModel[60] = new ModelRendererTurbo(this, 49, 65, textureX, textureY); // Box 94
		br_mk4_dvtModel[61] = new ModelRendererTurbo(this, 465, 49, textureX, textureY); // Box 94
		br_mk4_dvtModel[62] = new ModelRendererTurbo(this, 489, 49, textureX, textureY); // Box 94
		br_mk4_dvtModel[63] = new ModelRendererTurbo(this, 65, 65, textureX, textureY); // Box 94
		br_mk4_dvtModel[64] = new ModelRendererTurbo(this, 81, 65, textureX, textureY); // Box 99
		br_mk4_dvtModel[65] = new ModelRendererTurbo(this, 505, 49, textureX, textureY); // Box 100
		br_mk4_dvtModel[66] = new ModelRendererTurbo(this, 121, 65, textureX, textureY); // Box 101
		br_mk4_dvtModel[67] = new ModelRendererTurbo(this, 129, 65, textureX, textureY); // Box 102
		br_mk4_dvtModel[68] = new ModelRendererTurbo(this, 409, 49, textureX, textureY); // Box 103
		br_mk4_dvtModel[69] = new ModelRendererTurbo(this, 145, 65, textureX, textureY); // Box 104
		br_mk4_dvtModel[70] = new ModelRendererTurbo(this, 441, 49, textureX, textureY); // Box 105
		br_mk4_dvtModel[71] = new ModelRendererTurbo(this, 441, 57, textureX, textureY); // Box 105
		br_mk4_dvtModel[72] = new ModelRendererTurbo(this, 161, 65, textureX, textureY); // Box 104
		br_mk4_dvtModel[73] = new ModelRendererTurbo(this, 177, 65, textureX, textureY); // Box 105
		br_mk4_dvtModel[74] = new ModelRendererTurbo(this, 185, 65, textureX, textureY); // Box 105
		br_mk4_dvtModel[75] = new ModelRendererTurbo(this, 337, 73, textureX, textureY); // Box 110
		br_mk4_dvtModel[76] = new ModelRendererTurbo(this, 489, 65, textureX, textureY); // Box 111
		br_mk4_dvtModel[77] = new ModelRendererTurbo(this, 361, 73, textureX, textureY); // Box 112
		br_mk4_dvtModel[78] = new ModelRendererTurbo(this, 425, 73, textureX, textureY); // Box 110
		br_mk4_dvtModel[79] = new ModelRendererTurbo(this, 273, 73, textureX, textureY); // Box 94
		br_mk4_dvtModel[80] = new ModelRendererTurbo(this, 41, 89, textureX, textureY); // Box 94
		br_mk4_dvtModel[81] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 94
		br_mk4_dvtModel[82] = new ModelRendererTurbo(this, 217, 73, textureX, textureY); // Box 94
		br_mk4_dvtModel[83] = new ModelRendererTurbo(this, 73, 89, textureX, textureY); // Box 94
		br_mk4_dvtModel[84] = new ModelRendererTurbo(this, 321, 73, textureX, textureY); // Box 100
		br_mk4_dvtModel[85] = new ModelRendererTurbo(this, 353, 73, textureX, textureY); // Box 101
		br_mk4_dvtModel[86] = new ModelRendererTurbo(this, 81, 89, textureX, textureY); // Box 102
		br_mk4_dvtModel[87] = new ModelRendererTurbo(this, 201, 73, textureX, textureY); // Box 103
		br_mk4_dvtModel[88] = new ModelRendererTurbo(this, 217, 81, textureX, textureY); // Box 104
		br_mk4_dvtModel[89] = new ModelRendererTurbo(this, 337, 73, textureX, textureY); // Box 105
		br_mk4_dvtModel[90] = new ModelRendererTurbo(this, 377, 73, textureX, textureY); // Box 105
		br_mk4_dvtModel[91] = new ModelRendererTurbo(this, 321, 81, textureX, textureY); // Box 104
		br_mk4_dvtModel[92] = new ModelRendererTurbo(this, 425, 73, textureX, textureY); // Box 105
		br_mk4_dvtModel[93] = new ModelRendererTurbo(this, 441, 73, textureX, textureY); // Box 105
		br_mk4_dvtModel[94] = new ModelRendererTurbo(this, 97, 89, textureX, textureY); // Box 112
		br_mk4_dvtModel[95] = new ModelRendererTurbo(this, 193, 57, textureX, textureY); // Box 130
		br_mk4_dvtModel[96] = new ModelRendererTurbo(this, 305, 73, textureX, textureY); // Box 130
		br_mk4_dvtModel[97] = new ModelRendererTurbo(this, 113, 89, textureX, textureY); // Box 88
		br_mk4_dvtModel[98] = new ModelRendererTurbo(this, 129, 89, textureX, textureY); // Box 88
		br_mk4_dvtModel[99] = new ModelRendererTurbo(this, 145, 89, textureX, textureY); // Box 88
		br_mk4_dvtModel[100] = new ModelRendererTurbo(this, 161, 89, textureX, textureY); // Box 88
		br_mk4_dvtModel[101] = new ModelRendererTurbo(this, 161, 89, textureX, textureY); // Box 92
		br_mk4_dvtModel[102] = new ModelRendererTurbo(this, 249, 89, textureX, textureY); // Box 92
		br_mk4_dvtModel[103] = new ModelRendererTurbo(this, 281, 89, textureX, textureY); // Box 94
		br_mk4_dvtModel[104] = new ModelRendererTurbo(this, 377, 89, textureX, textureY); // Box 94
		br_mk4_dvtModel[105] = new ModelRendererTurbo(this, 9, 89, textureX, textureY); // Box 94
		br_mk4_dvtModel[106] = new ModelRendererTurbo(this, 185, 89, textureX, textureY); // Box 94
		br_mk4_dvtModel[107] = new ModelRendererTurbo(this, 393, 89, textureX, textureY); // Box 94
		br_mk4_dvtModel[108] = new ModelRendererTurbo(this, 409, 89, textureX, textureY); // Box 99
		br_mk4_dvtModel[109] = new ModelRendererTurbo(this, 457, 89, textureX, textureY); // Box 100
		br_mk4_dvtModel[110] = new ModelRendererTurbo(this, 465, 89, textureX, textureY); // Box 101
		br_mk4_dvtModel[111] = new ModelRendererTurbo(this, 473, 89, textureX, textureY); // Box 102
		br_mk4_dvtModel[112] = new ModelRendererTurbo(this, 305, 81, textureX, textureY); // Box 103
		br_mk4_dvtModel[113] = new ModelRendererTurbo(this, 489, 89, textureX, textureY); // Box 104
		br_mk4_dvtModel[114] = new ModelRendererTurbo(this, 25, 89, textureX, textureY); // Box 105
		br_mk4_dvtModel[115] = new ModelRendererTurbo(this, 57, 89, textureX, textureY); // Box 105
		br_mk4_dvtModel[116] = new ModelRendererTurbo(this, 41, 97, textureX, textureY); // Box 104
		br_mk4_dvtModel[117] = new ModelRendererTurbo(this, 505, 89, textureX, textureY); // Box 105
		br_mk4_dvtModel[118] = new ModelRendererTurbo(this, 57, 97, textureX, textureY); // Box 105
		br_mk4_dvtModel[119] = new ModelRendererTurbo(this, 81, 97, textureX, textureY); // Box 110
		br_mk4_dvtModel[120] = new ModelRendererTurbo(this, 73, 97, textureX, textureY); // Box 111
		br_mk4_dvtModel[121] = new ModelRendererTurbo(this, 105, 97, textureX, textureY); // Box 112
		br_mk4_dvtModel[122] = new ModelRendererTurbo(this, 121, 97, textureX, textureY); // Box 110
		br_mk4_dvtModel[123] = new ModelRendererTurbo(this, 137, 97, textureX, textureY); // Box 94
		br_mk4_dvtModel[124] = new ModelRendererTurbo(this, 153, 97, textureX, textureY); // Box 94
		br_mk4_dvtModel[125] = new ModelRendererTurbo(this, 97, 97, textureX, textureY); // Box 94
		br_mk4_dvtModel[126] = new ModelRendererTurbo(this, 185, 97, textureX, textureY); // Box 94
		br_mk4_dvtModel[127] = new ModelRendererTurbo(this, 193, 97, textureX, textureY); // Box 94
		br_mk4_dvtModel[128] = new ModelRendererTurbo(this, 209, 97, textureX, textureY); // Box 100
		br_mk4_dvtModel[129] = new ModelRendererTurbo(this, 217, 97, textureX, textureY); // Box 101
		br_mk4_dvtModel[130] = new ModelRendererTurbo(this, 225, 97, textureX, textureY); // Box 102
		br_mk4_dvtModel[131] = new ModelRendererTurbo(this, 121, 97, textureX, textureY); // Box 103
		br_mk4_dvtModel[132] = new ModelRendererTurbo(this, 241, 97, textureX, textureY); // Box 104
		br_mk4_dvtModel[133] = new ModelRendererTurbo(this, 169, 97, textureX, textureY); // Box 105
		br_mk4_dvtModel[134] = new ModelRendererTurbo(this, 257, 97, textureX, textureY); // Box 105
		br_mk4_dvtModel[135] = new ModelRendererTurbo(this, 281, 97, textureX, textureY); // Box 104
		br_mk4_dvtModel[136] = new ModelRendererTurbo(this, 297, 97, textureX, textureY); // Box 105
		br_mk4_dvtModel[137] = new ModelRendererTurbo(this, 305, 97, textureX, textureY); // Box 105
		br_mk4_dvtModel[138] = new ModelRendererTurbo(this, 313, 97, textureX, textureY); // Box 112
		br_mk4_dvtModel[139] = new ModelRendererTurbo(this, 329, 97, textureX, textureY); // Box 130
		br_mk4_dvtModel[140] = new ModelRendererTurbo(this, 393, 97, textureX, textureY); // Box 130
		br_mk4_dvtModel[141] = new ModelRendererTurbo(this, 377, 97, textureX, textureY); // Box 176
		br_mk4_dvtModel[142] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 177
		br_mk4_dvtModel[143] = new ModelRendererTurbo(this, 49, 105, textureX, textureY); // Box 178
		br_mk4_dvtModel[144] = new ModelRendererTurbo(this, 121, 105, textureX, textureY); // Box 179
		br_mk4_dvtModel[145] = new ModelRendererTurbo(this, 273, 89, textureX, textureY); // Box 180
		br_mk4_dvtModel[146] = new ModelRendererTurbo(this, 33, 105, textureX, textureY); // Box 180
		br_mk4_dvtModel[147] = new ModelRendererTurbo(this, 489, 89, textureX, textureY); // Box 180
		br_mk4_dvtModel[148] = new ModelRendererTurbo(this, 185, 186, textureX, textureY); // 04
		br_mk4_dvtModel[149] = new ModelRendererTurbo(this, 1, 186, textureX, textureY); // 05
		br_mk4_dvtModel[150] = new ModelRendererTurbo(this, 1, 186, textureX, textureY); // 06
		br_mk4_dvtModel[151] = new ModelRendererTurbo(this, 185, 222, textureX, textureY); // 07
		br_mk4_dvtModel[152] = new ModelRendererTurbo(this, 225, 222, textureX, textureY); // 08
		br_mk4_dvtModel[153] = new ModelRendererTurbo(this, 249, 239, textureX, textureY); // 09
		br_mk4_dvtModel[154] = new ModelRendererTurbo(this, 273, 186, textureX, textureY); // 10
		br_mk4_dvtModel[155] = new ModelRendererTurbo(this, 281, 186, textureX, textureY); // 11
		br_mk4_dvtModel[156] = new ModelRendererTurbo(this, 384, 222, textureX, textureY); // 12
		br_mk4_dvtModel[157] = new ModelRendererTurbo(this, 329, 222, textureX, textureY); // 13
		br_mk4_dvtModel[158] = new ModelRendererTurbo(this, 384, 239, textureX, textureY); // 14
		br_mk4_dvtModel[159] = new ModelRendererTurbo(this, 407, 229, textureX, textureY); // 15
		br_mk4_dvtModel[160] = new ModelRendererTurbo(this, 446, 220, textureX, textureY); // 18
		br_mk4_dvtModel[161] = new ModelRendererTurbo(this, 225, 186, textureX, textureY); // 25
		br_mk4_dvtModel[162] = new ModelRendererTurbo(this, 473, 186, textureX, textureY); // 26
		br_mk4_dvtModel[163] = new ModelRendererTurbo(this, 329, 186, textureX, textureY); // 27
		br_mk4_dvtModel[164] = new ModelRendererTurbo(this, 145, 186, textureX, textureY); // 28
		br_mk4_dvtModel[165] = new ModelRendererTurbo(this, 241, 186, textureX, textureY); // 29
		br_mk4_dvtModel[166] = new ModelRendererTurbo(this, 289, 229, textureX, textureY); // 30
		br_mk4_dvtModel[167] = new ModelRendererTurbo(this, 385, 186, textureX, textureY); // 31
		br_mk4_dvtModel[168] = new ModelRendererTurbo(this, 433, 186, textureX, textureY); // 32
		br_mk4_dvtModel[169] = new ModelRendererTurbo(this, 489, 221, textureX, textureY); // 33
		br_mk4_dvtModel[170] = new ModelRendererTurbo(this, 417, 186, textureX, textureY); // 34
		br_mk4_dvtModel[171] = new ModelRendererTurbo(this, 321, 185, textureX, textureY); // 35
		br_mk4_dvtModel[172] = new ModelRendererTurbo(this, 349, 185, textureX, textureY); // 36
		br_mk4_dvtModel[173] = new ModelRendererTurbo(this, 1, 186, textureX, textureY); // 37
		br_mk4_dvtModel[174] = new ModelRendererTurbo(this, 321, 217, textureX, textureY); // 40
		br_mk4_dvtModel[175] = new ModelRendererTurbo(this, 345, 217, textureX, textureY); // 41
		br_mk4_dvtModel[176] = new ModelRendererTurbo(this, 505, 186, textureX, textureY); // 43
		br_mk4_dvtModel[177] = new ModelRendererTurbo(this, 305, 186, textureX, textureY); // 44
		br_mk4_dvtModel[178] = new ModelRendererTurbo(this, 201, 186, textureX, textureY); // 49
		br_mk4_dvtModel[179] = new ModelRendererTurbo(this, 249, 222, textureX, textureY); // 50
		br_mk4_dvtModel[180] = new ModelRendererTurbo(this, 481, 206, textureX, textureY); // 221
		br_mk4_dvtModel[181] = new ModelRendererTurbo(this, 161, 217, textureX, textureY); // 222
		br_mk4_dvtModel[182] = new ModelRendererTurbo(this, 289, 217, textureX, textureY); // 223
		br_mk4_dvtModel[183] = new ModelRendererTurbo(this, 337, 239, textureX, textureY); // 225
		br_mk4_dvtModel[184] = new ModelRendererTurbo(this, 361, 186, textureX, textureY); // 226
		br_mk4_dvtModel[185] = new ModelRendererTurbo(this, 385, 186, textureX, textureY); // 230
		br_mk4_dvtModel[186] = new ModelRendererTurbo(this, 409, 186, textureX, textureY); // 231
		br_mk4_dvtModel[187] = new ModelRendererTurbo(this, 1, 197, textureX, textureY); // 38
		br_mk4_dvtModel[188] = new ModelRendererTurbo(this, 185, 197, textureX, textureY); // 39
		br_mk4_dvtModel[189] = new ModelRendererTurbo(this, 89, 186, textureX, textureY); // 224
		br_mk4_dvtModel[190] = new ModelRendererTurbo(this, 385, 167, textureX, textureY); // 16
		br_mk4_dvtModel[191] = new ModelRendererTurbo(this, 401, 167, textureX, textureY); // 17
		br_mk4_dvtModel[192] = new ModelRendererTurbo(this, 465, 269, textureX, textureY); // 51
		br_mk4_dvtModel[193] = new ModelRendererTurbo(this, 1, 269, textureX, textureY); // 52
		br_mk4_dvtModel[194] = new ModelRendererTurbo(this, 497, 269, textureX, textureY); // 53
		br_mk4_dvtModel[195] = new ModelRendererTurbo(this, 33, 269, textureX, textureY); // 54
		br_mk4_dvtModel[196] = new ModelRendererTurbo(this, 57, 269, textureX, textureY); // 55
		br_mk4_dvtModel[197] = new ModelRendererTurbo(this, 169, 269, textureX, textureY); // 56
		br_mk4_dvtModel[198] = new ModelRendererTurbo(this, 81, 269, textureX, textureY); // 57
		br_mk4_dvtModel[199] = new ModelRendererTurbo(this, 89, 269, textureX, textureY); // 58
		br_mk4_dvtModel[200] = new ModelRendererTurbo(this, 113, 269, textureX, textureY); // 59
		br_mk4_dvtModel[201] = new ModelRendererTurbo(this, 185, 269, textureX, textureY); // 60
		br_mk4_dvtModel[202] = new ModelRendererTurbo(this, 441, 269, textureX, textureY); // 61
		br_mk4_dvtModel[203] = new ModelRendererTurbo(this, 465, 269, textureX, textureY); // 62
		br_mk4_dvtModel[204] = new ModelRendererTurbo(this, 385, 269, textureX, textureY); // 63
		br_mk4_dvtModel[205] = new ModelRendererTurbo(this, 161, 269, textureX, textureY); // 64
		br_mk4_dvtModel[206] = new ModelRendererTurbo(this, 225, 260, textureX, textureY); // 65
		br_mk4_dvtModel[207] = new ModelRendererTurbo(this, 233, 269, textureX, textureY); // 66
		br_mk4_dvtModel[208] = new ModelRendererTurbo(this, 481, 269, textureX, textureY); // 67
		br_mk4_dvtModel[209] = new ModelRendererTurbo(this, 113, 269, textureX, textureY); // 193

		br_mk4_dvtModel[0].addShapeBox(0F, 0F, 0F, 78, 1, 21, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // 01
		br_mk4_dvtModel[0].setRotationPoint(-41F, 0F, -11F);

		br_mk4_dvtModel[1].addShapeBox(0F, 0F, 0F, 77, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // 02
		br_mk4_dvtModel[1].setRotationPoint(-40F, -3F, -11F);

		br_mk4_dvtModel[2].addShapeBox(0F, 0F, 0F, 77, 3, 1, 0F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // 03
		br_mk4_dvtModel[2].setRotationPoint(-40F, -3F, 10F);

		br_mk4_dvtModel[3].addShapeBox(0F, 0F, 0F, 77, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0F, 0F, -0.9F); // 04
		br_mk4_dvtModel[3].setRotationPoint(-40F, -6F, -11F);

		br_mk4_dvtModel[4].addShapeBox(0F, 0F, 0F, 77, 3, 1, 0F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F, 0F); // 05
		br_mk4_dvtModel[4].setRotationPoint(-40F, -6F, 10F);

		br_mk4_dvtModel[5].addShapeBox(0F, 0F, 0F, 77, 11, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0F, 0F, -0.9F); // 06
		br_mk4_dvtModel[5].setRotationPoint(-40F, -17F, -11F);

		br_mk4_dvtModel[6].addShapeBox(0F, 0F, 0F, 77, 11, 1, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F, 0F); // 07
		br_mk4_dvtModel[6].setRotationPoint(-40F, -17F, 10F);

		br_mk4_dvtModel[7].addShapeBox(0F, 0F, 0F, 72, 1, 1, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // 08
		br_mk4_dvtModel[7].setRotationPoint(-35F, -18F, -11F);

		br_mk4_dvtModel[8].addShapeBox(0F, 0F, 0F, 72, 1, 1, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // 09
		br_mk4_dvtModel[8].setRotationPoint(-35F, -18F, 10F);

		br_mk4_dvtModel[9].addShapeBox(0F, 0F, 0F, 72, 2, 3, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.9F, 0F, 0F, -2.9F); // 10
		br_mk4_dvtModel[9].setRotationPoint(-35F, -20F, -10F);

		br_mk4_dvtModel[10].addShapeBox(0F, 0F, 0F, 72, 2, 3, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -2.9F, 0F, 0F, -2.9F, 0F, 0F, 0F, 0F, 0F, 0F); // 11
		br_mk4_dvtModel[10].setRotationPoint(-35F, -20F, 7F);

		br_mk4_dvtModel[11].addShapeBox(0F, 0F, 0F, 72, 2, 7, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, -7F, 0F, 0.1F, -7F); // 12
		br_mk4_dvtModel[11].setRotationPoint(-35F, -22F, -7F);

		br_mk4_dvtModel[12].addShapeBox(0F, 0F, 0F, 72, 2, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0.1F, -7F, 0F, 0.1F, -7F, 0F, 0F, 0F, 0F, 0F, 0F); // 13
		br_mk4_dvtModel[12].setRotationPoint(-35F, -22F, 0F);

		br_mk4_dvtModel[13].addShapeBox(0F, 0F, 0F, 1, 3, 22, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F); // 22
		br_mk4_dvtModel[13].setRotationPoint(38F, -3F, 11F);
		br_mk4_dvtModel[13].rotateAngleY = 3.14159265F;

		br_mk4_dvtModel[14].addShapeBox(0F, 0F, 0F, 1, 3, 22, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F); // 23
		br_mk4_dvtModel[14].setRotationPoint(38F, -6F, 11F);
		br_mk4_dvtModel[14].rotateAngleY = 3.14159265F;

		br_mk4_dvtModel[15].addShapeBox(0F, 0F, 0F, 1, 11, 22, 0F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F); // 24
		br_mk4_dvtModel[15].setRotationPoint(38F, -17F, 11F);
		br_mk4_dvtModel[15].rotateAngleY = 3.14159265F;

		br_mk4_dvtModel[16].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F, 0F, -3F, -1F, 0F, -2F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // 25
		br_mk4_dvtModel[16].setRotationPoint(38F, -20F, 11F);
		br_mk4_dvtModel[16].rotateAngleY = 3.14159265F;

		br_mk4_dvtModel[17].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -1F, 0F, -3F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1F); // 26
		br_mk4_dvtModel[17].setRotationPoint(38F, -20F, -7F);
		br_mk4_dvtModel[17].rotateAngleY = 3.14159265F;

		br_mk4_dvtModel[18].addShapeBox(0F, 0F, 0F, 1, 5, 6, 0F, -1F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // 27
		br_mk4_dvtModel[18].setRotationPoint(38F, -22F, 7F);
		br_mk4_dvtModel[18].rotateAngleY = 3.14159265F;

		br_mk4_dvtModel[19].addShapeBox(0F, 0F, 0F, 1, 5, 6, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // 28
		br_mk4_dvtModel[19].setRotationPoint(38F, -22F, -1F);
		br_mk4_dvtModel[19].rotateAngleY = 3.14159265F;

		br_mk4_dvtModel[20].addShapeBox(0F, 0F, 0F, 1, 5, 2, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // 29
		br_mk4_dvtModel[20].setRotationPoint(38F, -22F, 1F);
		br_mk4_dvtModel[20].rotateAngleY = 3.14159265F;

		br_mk4_dvtModel[21].addShapeBox(0F, 0F, 0F, 1, 1, 21, 0F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F); // 31
		br_mk4_dvtModel[21].setRotationPoint(38F, 0F, 11F);
		br_mk4_dvtModel[21].rotateAngleY = -3.14159265F;

		br_mk4_dvtModel[22].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, -0.3F, 0.5F, 0F, -0.3F, 0.5F, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // 44
		br_mk4_dvtModel[22].setRotationPoint(-50F, 0F, 0F);

		br_mk4_dvtModel[23].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F, 0F, 0.1F, 0.5F, 0.1F, 0.1F, 0.5F, 0.1F, 0.1F, -0.5F, 0F, 0.1F, -0.5F, 0F, 0.3F, 0.5F, 0.1F, 0.3F, 0.5F, 0.1F, 0.3F, -0.5F, 0F, 0.3F, -0.5F); // 45
		br_mk4_dvtModel[23].setRotationPoint(-50F, 0F, 0F);

		br_mk4_dvtModel[24].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F); // 46
		br_mk4_dvtModel[24].setRotationPoint(-51F, 0F, -1F);

		br_mk4_dvtModel[25].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, 0.3F, -0.75F, 0F, 0.3F, -0.75F, 0F, 0.3F, 0.25F, -0.5F, 0.3F, 0.25F, -0.5F, -0.8F, -0.75F, 0F, -0.8F, -0.75F, 0F, -0.8F, 0.25F, -0.5F, -0.8F, 0.25F); // 47
		br_mk4_dvtModel[25].setRotationPoint(-51F, 1F, -1F);

		br_mk4_dvtModel[26].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -0.5F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F, -0.5F, 0.5F, -0.75F, 0F, 0.5F, -0.75F, 0F, 0.5F, 0.25F, -0.5F, 0.5F, 0.25F); // 48
		br_mk4_dvtModel[26].setRotationPoint(-50F, 0F, -1F);

		br_mk4_dvtModel[27].addShapeBox(0F, 0F, 0F, 9, 5, 3, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, 0F, -1.5F, -3F, 0F, -1.5F, -3F, 0F, 0F, 0F, 0F, 0F); // 63
		br_mk4_dvtModel[27].setRotationPoint(37F, 0F, 10F);
		br_mk4_dvtModel[27].rotateAngleY = -3.14159265F;

		br_mk4_dvtModel[28].addShapeBox(0F, 0F, 0F, 9, 5, 3, 0F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -1.5F, 0F, 0F, -1.5F); // 64
		br_mk4_dvtModel[28].setRotationPoint(37F, 0F, -7F);
		br_mk4_dvtModel[28].rotateAngleY = -3.14159265F;

		br_mk4_dvtModel[29].addShapeBox(0F, 0F, 0F, 2, 2, 14, 0F, 0F, -0.5F, 0.65F, 0F, -0.5F, 0.65F, 0F, -0.5F, 0.65F, 0F, -0.5F, 0.65F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // 65
		br_mk4_dvtModel[29].setRotationPoint(37F, 3F, 7F);
		br_mk4_dvtModel[29].rotateAngleY = -3.14159265F;

		br_mk4_dvtModel[30].addShapeBox(0F, 0F, 0F, 2, 2, 18, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.65F, 0F, 0F, -0.65F, 0F, 0F, -0.65F, 0F, 0F, -0.65F); // 66
		br_mk4_dvtModel[30].setRotationPoint(37F, 0F, 9F);
		br_mk4_dvtModel[30].rotateAngleY = -3.14159265F;

		br_mk4_dvtModel[31].addShapeBox(0F, 0F, 0F, 7, 5, 18, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -2F, -3F, 0F, -2F, -3F, 0F, -2F, 0F, 0F, -2F); // 67
		br_mk4_dvtModel[31].setRotationPoint(35F, 0F, 9F);
		br_mk4_dvtModel[31].rotateAngleY = -3.14159265F;

		br_mk4_dvtModel[32].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // 68
		br_mk4_dvtModel[32].setRotationPoint(37F, 2F, 6F);
		br_mk4_dvtModel[32].rotateAngleY = -3.14159265F;

		br_mk4_dvtModel[33].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // 69
		br_mk4_dvtModel[33].setRotationPoint(37F, 2F, -5F);
		br_mk4_dvtModel[33].rotateAngleY = -3.14159265F;

		br_mk4_dvtModel[34].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, -0.3F, 0.5F, 0F, -0.3F, 0.5F, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // 70
		br_mk4_dvtModel[34].setRotationPoint(39F, 1F, 0F);
		br_mk4_dvtModel[34].rotateAngleY = -3.14159265F;

		br_mk4_dvtModel[35].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F, 0F, 0.1F, 0.5F, 0.1F, 0.1F, 0.5F, 0.1F, 0.1F, -0.5F, 0F, 0.1F, -0.5F, 0F, 0.3F, 0.5F, 0.1F, 0.3F, 0.5F, 0.1F, 0.3F, -0.5F, 0F, 0.3F, -0.5F); // 71
		br_mk4_dvtModel[35].setRotationPoint(39F, 1F, 0F);
		br_mk4_dvtModel[35].rotateAngleY = -3.14159265F;

		br_mk4_dvtModel[36].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F); // 72
		br_mk4_dvtModel[36].setRotationPoint(40F, 1F, 1F);
		br_mk4_dvtModel[36].rotateAngleY = -3.14159265F;

		br_mk4_dvtModel[37].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, 0.3F, -0.75F, 0F, 0.3F, -0.75F, 0F, 0.3F, 0.25F, -0.5F, 0.3F, 0.25F, -0.5F, -0.8F, -0.75F, 0F, -0.8F, -0.75F, 0F, -0.8F, 0.25F, -0.5F, -0.8F, 0.25F); // 73
		br_mk4_dvtModel[37].setRotationPoint(40F, 2F, 1F);
		br_mk4_dvtModel[37].rotateAngleY = -3.14159265F;

		br_mk4_dvtModel[38].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -0.5F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F, -0.5F, 0.5F, -0.75F, 0F, 0.5F, -0.75F, 0F, 0.5F, 0.25F, -0.5F, 0.5F, 0.25F); // 74
		br_mk4_dvtModel[38].setRotationPoint(39F, 1F, 1F);
		br_mk4_dvtModel[38].rotateAngleY = -3.14159265F;

		br_mk4_dvtModel[39].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0.5F, -0.3F, 0F); // 75
		br_mk4_dvtModel[39].setRotationPoint(39F, 0F, 4F);
		br_mk4_dvtModel[39].rotateAngleY = -3.14159265F;

		br_mk4_dvtModel[40].addShapeBox(0F, 0F, 0F, 1, 18, 1, 0F, -0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F); // 76
		br_mk4_dvtModel[40].setRotationPoint(39F, -18F, 5F);
		br_mk4_dvtModel[40].rotateAngleY = -3.14159265F;

		br_mk4_dvtModel[41].addShapeBox(0F, 0F, 0F, 1, 18, 1, 0F, -0.75F, 0F, 0F, 0.35F, 0F, 0F, 0.35F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F); // 77
		br_mk4_dvtModel[41].setRotationPoint(39F, -18F, -4F);
		br_mk4_dvtModel[41].rotateAngleY = -3.14159265F;

		br_mk4_dvtModel[42].addShapeBox(0F, 0F, 0F, 1, 18, 1, 0F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F); // 78
		br_mk4_dvtModel[42].setRotationPoint(39F, -18F, 5F);
		br_mk4_dvtModel[42].rotateAngleY = -3.14159265F;

		br_mk4_dvtModel[43].addShapeBox(0F, 0F, 0F, 1, 18, 1, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F); // 79
		br_mk4_dvtModel[43].setRotationPoint(39F, -18F, -4F);
		br_mk4_dvtModel[43].rotateAngleY = -3.14159265F;

		br_mk4_dvtModel[44].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.6F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // 80
		br_mk4_dvtModel[44].setRotationPoint(39F, -19F, 4F);
		br_mk4_dvtModel[44].rotateAngleY = -3.14159265F;

		br_mk4_dvtModel[45].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.3F, -1F, 0F, -0.3F, -1F, 0F, -0.3F, 0F, -0.75F, -0.3F, 0F); // 81
		br_mk4_dvtModel[45].setRotationPoint(39F, 0F, 5F);
		br_mk4_dvtModel[45].rotateAngleY = -3.14159265F;

		br_mk4_dvtModel[46].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -1F, -0.75F, -0.3F, -1F); // 82
		br_mk4_dvtModel[46].setRotationPoint(39F, 0F, -4F);
		br_mk4_dvtModel[46].rotateAngleY = -3.14159265F;

		br_mk4_dvtModel[47].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.3F, -1F, 0F, -0.3F, -1F, 0F, -0.3F, 0F, 0.5F, -0.3F, 0F); // 83
		br_mk4_dvtModel[47].setRotationPoint(39F, 0F, 5F);
		br_mk4_dvtModel[47].rotateAngleY = -3.14159265F;

		br_mk4_dvtModel[48].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -1F, 0.5F, -0.3F, -1F); // 84
		br_mk4_dvtModel[48].setRotationPoint(39F, 0F, -4F);
		br_mk4_dvtModel[48].rotateAngleY = -3.14159265F;

		br_mk4_dvtModel[49].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F); // 85
		br_mk4_dvtModel[49].setRotationPoint(38F, -19F, 5F);
		br_mk4_dvtModel[49].rotateAngleY = -3.14159265F;

		br_mk4_dvtModel[50].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0.25F, 0F, -1F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F); // 86
		br_mk4_dvtModel[50].setRotationPoint(38F, -19F, -4F);
		br_mk4_dvtModel[50].rotateAngleY = -3.14159265F;

		br_mk4_dvtModel[51].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.5F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, 0.5F, 0F, 0F); // 87
		br_mk4_dvtModel[51].setRotationPoint(39F, -19F, 5F);
		br_mk4_dvtModel[51].rotateAngleY = -3.14159265F;

		br_mk4_dvtModel[52].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -1F, 0.5F, 0F, -1F, 0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, 0.5F, 0F, -0.5F); // 88
		br_mk4_dvtModel[52].setRotationPoint(39F, -19F, -4F);
		br_mk4_dvtModel[52].rotateAngleY = -3.14159265F;

		br_mk4_dvtModel[53].addBox(0F, 0F, 0F, 5, 5, 0, 0F); // Box 88
		br_mk4_dvtModel[53].setRotationPoint(-40F, 2F, -6F);

		br_mk4_dvtModel[54].addBox(0F, 0F, 0F, 5, 5, 0, 0F); // Box 88
		br_mk4_dvtModel[54].setRotationPoint(-40F, 2F, 6F);

		br_mk4_dvtModel[55].addBox(0F, 0F, 0F, 5, 5, 0, 0F); // Box 88
		br_mk4_dvtModel[55].setRotationPoint(-27F, 2F, -6F);

		br_mk4_dvtModel[56].addBox(0F, 0F, 0F, 5, 5, 0, 0F); // Box 88
		br_mk4_dvtModel[56].setRotationPoint(-27F, 2F, 6F);

		br_mk4_dvtModel[57].addBox(0F, 0F, 0F, 1, 1, 14, 0F); // Box 92
		br_mk4_dvtModel[57].setRotationPoint(-38F, 4F, -7F);

		br_mk4_dvtModel[58].addBox(0F, 0F, 0F, 1, 1, 14, 0F); // Box 92
		br_mk4_dvtModel[58].setRotationPoint(-25F, 4F, -7F);

		br_mk4_dvtModel[59].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 94
		br_mk4_dvtModel[59].setRotationPoint(-39F, 2F, -8F);

		br_mk4_dvtModel[60].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 94
		br_mk4_dvtModel[60].setRotationPoint(-27F, 2F, -8F);

		br_mk4_dvtModel[61].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -2F, 0F); // Box 94
		br_mk4_dvtModel[61].setRotationPoint(-35F, 2F, -8F);

		br_mk4_dvtModel[62].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0.5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0.5F, 0F); // Box 94
		br_mk4_dvtModel[62].setRotationPoint(-29F, 2F, -8F);

		br_mk4_dvtModel[63].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 94
		br_mk4_dvtModel[63].setRotationPoint(-33F, 4F, -8F);

		br_mk4_dvtModel[64].addShapeBox(0F, 0F, 0F, 14, 1, 2, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 99
		br_mk4_dvtModel[64].setRotationPoint(-38F, 3F, -1F);

		br_mk4_dvtModel[65].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -0.5F); // Box 100
		br_mk4_dvtModel[65].setRotationPoint(-32F, 1F, -9F);

		br_mk4_dvtModel[66].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, 0F, 0F); // Box 101
		br_mk4_dvtModel[66].setRotationPoint(-31F, 1F, -9F);

		br_mk4_dvtModel[67].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 102
		br_mk4_dvtModel[67].setRotationPoint(-33F, 0F, -10F);

		br_mk4_dvtModel[68].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.2F, 0.5F, 0F, -0.2F, 0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 103
		br_mk4_dvtModel[68].setRotationPoint(-31F, 2F, -8F);

		br_mk4_dvtModel[69].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F); // Box 104
		br_mk4_dvtModel[69].setRotationPoint(-39F, 4F, -7F);

		br_mk4_dvtModel[70].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, -0.4F, -0.2F, 0.5F, -0.4F, -0.2F, 0.5F, -0.4F, -0.2F, -1F, -0.4F, -0.2F, -1F, 0F, -0.2F, 0F, -0.8F, -0.2F, 0F, -0.8F, -0.2F, -0.8F, 0F, -0.2F, -0.8F); // Box 105
		br_mk4_dvtModel[70].setRotationPoint(-39F, 2F, -7F);

		br_mk4_dvtModel[71].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, -0.8F, -0.2F, 0.5F, 0F, -0.2F, 0.5F, 0F, -0.2F, -1F, -0.8F, -0.2F, -1F, -0.8F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.8F, -0.8F, -0.2F, -0.8F); // Box 105
		br_mk4_dvtModel[71].setRotationPoint(-37F, 2F, -7F);

		br_mk4_dvtModel[72].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F); // Box 104
		br_mk4_dvtModel[72].setRotationPoint(-26F, 4F, -7F);

		br_mk4_dvtModel[73].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, -0.2F, 0.5F, -0.8F, -0.2F, 0.5F, -0.8F, -0.2F, -1F, 0F, -0.2F, -1F, 0F, -0.2F, 0F, -0.8F, -0.2F, 0F, -0.8F, -0.2F, -0.8F, 0F, -0.2F, -0.8F); // Box 105
		br_mk4_dvtModel[73].setRotationPoint(-26F, 2F, -7F);

		br_mk4_dvtModel[74].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, -0.4F, -0.2F, 0.5F, -0.4F, -0.2F, 0.5F, -0.4F, -0.2F, -1F, -0.4F, -0.2F, -1F, -0.8F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.8F, -0.8F, -0.2F, -0.8F); // Box 105
		br_mk4_dvtModel[74].setRotationPoint(-24F, 2F, -7F);

		br_mk4_dvtModel[75].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 110
		br_mk4_dvtModel[75].setRotationPoint(-32F, 2F, -7F);

		br_mk4_dvtModel[76].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 111
		br_mk4_dvtModel[76].setRotationPoint(-32F, 0F, -1F);

		br_mk4_dvtModel[77].addShapeBox(0F, 0F, 0F, 4, 4, 2, 0F, -3F, -0.5F, 0.2F, -0.5F, -0.5F, 0.2F, -0.5F, -0.5F, -1.7F, -3F, -0.5F, -1.7F, 0F, -0.5F, -1.5F, -3.5F, -0.5F, -1.5F, -3.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 112
		br_mk4_dvtModel[77].setRotationPoint(-33F, 1F, -10F);

		br_mk4_dvtModel[78].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 110
		br_mk4_dvtModel[78].setRotationPoint(-32F, 2F, 1F);

		br_mk4_dvtModel[79].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 94
		br_mk4_dvtModel[79].setRotationPoint(-23F, 2F, 8F);
		br_mk4_dvtModel[79].rotateAngleY = -3.14159265F;

		br_mk4_dvtModel[80].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 94
		br_mk4_dvtModel[80].setRotationPoint(-35F, 2F, 8F);
		br_mk4_dvtModel[80].rotateAngleY = -3.14159265F;

		br_mk4_dvtModel[81].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -2F, 0F); // Box 94
		br_mk4_dvtModel[81].setRotationPoint(-27F, 2F, 8F);
		br_mk4_dvtModel[81].rotateAngleY = -3.14159265F;

		br_mk4_dvtModel[82].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0.5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0.5F, 0F); // Box 94
		br_mk4_dvtModel[82].setRotationPoint(-33F, 2F, 8F);
		br_mk4_dvtModel[82].rotateAngleY = -3.14159265F;

		br_mk4_dvtModel[83].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 94
		br_mk4_dvtModel[83].setRotationPoint(-29F, 4F, 8F);
		br_mk4_dvtModel[83].rotateAngleY = -3.14159265F;

		br_mk4_dvtModel[84].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -0.5F); // Box 100
		br_mk4_dvtModel[84].setRotationPoint(-30F, 1F, 9F);
		br_mk4_dvtModel[84].rotateAngleY = -3.14159265F;

		br_mk4_dvtModel[85].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, 0F, 0F); // Box 101
		br_mk4_dvtModel[85].setRotationPoint(-31F, 1F, 9F);
		br_mk4_dvtModel[85].rotateAngleY = -3.14159265F;

		br_mk4_dvtModel[86].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 102
		br_mk4_dvtModel[86].setRotationPoint(-29F, 0F, 10F);
		br_mk4_dvtModel[86].rotateAngleY = -3.14159265F;

		br_mk4_dvtModel[87].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.2F, 0.5F, 0F, -0.2F, 0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 103
		br_mk4_dvtModel[87].setRotationPoint(-31F, 2F, 8F);
		br_mk4_dvtModel[87].rotateAngleY = -3.14159265F;

		br_mk4_dvtModel[88].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F); // Box 104
		br_mk4_dvtModel[88].setRotationPoint(-23F, 4F, 7F);
		br_mk4_dvtModel[88].rotateAngleY = -3.14159265F;

		br_mk4_dvtModel[89].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, -0.4F, -0.2F, 0.5F, -0.4F, -0.2F, 0.5F, -0.4F, -0.2F, -1F, -0.4F, -0.2F, -1F, 0F, -0.2F, 0F, -0.8F, -0.2F, 0F, -0.8F, -0.2F, -0.8F, 0F, -0.2F, -0.8F); // Box 105
		br_mk4_dvtModel[89].setRotationPoint(-23F, 2F, 7F);
		br_mk4_dvtModel[89].rotateAngleY = -3.14159265F;

		br_mk4_dvtModel[90].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, -0.8F, -0.2F, 0.5F, 0F, -0.2F, 0.5F, 0F, -0.2F, -1F, -0.8F, -0.2F, -1F, -0.8F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.8F, -0.8F, -0.2F, -0.8F); // Box 105
		br_mk4_dvtModel[90].setRotationPoint(-25F, 2F, 7F);
		br_mk4_dvtModel[90].rotateAngleY = -3.14159265F;

		br_mk4_dvtModel[91].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F); // Box 104
		br_mk4_dvtModel[91].setRotationPoint(-36F, 4F, 7F);
		br_mk4_dvtModel[91].rotateAngleY = -3.14159265F;

		br_mk4_dvtModel[92].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, -0.2F, 0.5F, -0.8F, -0.2F, 0.5F, -0.8F, -0.2F, -1F, 0F, -0.2F, -1F, 0F, -0.2F, 0F, -0.8F, -0.2F, 0F, -0.8F, -0.2F, -0.8F, 0F, -0.2F, -0.8F); // Box 105
		br_mk4_dvtModel[92].setRotationPoint(-36F, 2F, 7F);
		br_mk4_dvtModel[92].rotateAngleY = -3.14159265F;

		br_mk4_dvtModel[93].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, -0.4F, -0.2F, 0.5F, -0.4F, -0.2F, 0.5F, -0.4F, -0.2F, -1F, -0.4F, -0.2F, -1F, -0.8F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.8F, -0.8F, -0.2F, -0.8F); // Box 105
		br_mk4_dvtModel[93].setRotationPoint(-38F, 2F, 7F);
		br_mk4_dvtModel[93].rotateAngleY = -3.14159265F;

		br_mk4_dvtModel[94].addShapeBox(0F, 0F, 0F, 4, 4, 2, 0F, -0.5F, -0.5F, 0.2F, -3F, -0.5F, 0.2F, -3F, -0.5F, -1.7F, -0.5F, -0.5F, -1.7F, -3.5F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, 0F, -3.5F, -0.5F, 0F); // Box 112
		br_mk4_dvtModel[94].setRotationPoint(-29F, 1F, 10F);
		br_mk4_dvtModel[94].rotateAngleY = -3.14159265F;

		br_mk4_dvtModel[95].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, -0.5F, 0.2F, -0.5F, -0.5F, 0.2F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 130
		br_mk4_dvtModel[95].setRotationPoint(-30F, 1F, -10F);

		br_mk4_dvtModel[96].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, -0.5F, 0.5F, -0.5F, -0.5F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F); // Box 130
		br_mk4_dvtModel[96].setRotationPoint(-29F, 1F, 10F);
		br_mk4_dvtModel[96].rotateAngleY = -3.14159265F;

		br_mk4_dvtModel[97].addBox(0F, 0F, 0F, 5, 5, 0, 0F); // Box 88
		br_mk4_dvtModel[97].setRotationPoint(10F, 2F, -6F);

		br_mk4_dvtModel[98].addBox(0F, 0F, 0F, 5, 5, 0, 0F); // Box 88
		br_mk4_dvtModel[98].setRotationPoint(10F, 2F, 6F);

		br_mk4_dvtModel[99].addBox(0F, 0F, 0F, 5, 5, 0, 0F); // Box 88
		br_mk4_dvtModel[99].setRotationPoint(23F, 2F, -6F);

		br_mk4_dvtModel[100].addBox(0F, 0F, 0F, 5, 5, 0, 0F); // Box 88
		br_mk4_dvtModel[100].setRotationPoint(23F, 2F, 6F);

		br_mk4_dvtModel[101].addBox(0F, 0F, 0F, 1, 1, 14, 0F); // Box 92
		br_mk4_dvtModel[101].setRotationPoint(12F, 4F, -7F);

		br_mk4_dvtModel[102].addBox(0F, 0F, 0F, 1, 1, 14, 0F); // Box 92
		br_mk4_dvtModel[102].setRotationPoint(25F, 4F, -7F);

		br_mk4_dvtModel[103].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 94
		br_mk4_dvtModel[103].setRotationPoint(11F, 2F, -8F);

		br_mk4_dvtModel[104].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 94
		br_mk4_dvtModel[104].setRotationPoint(23F, 2F, -8F);

		br_mk4_dvtModel[105].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -2F, 0F); // Box 94
		br_mk4_dvtModel[105].setRotationPoint(15F, 2F, -8F);

		br_mk4_dvtModel[106].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0.5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0.5F, 0F); // Box 94
		br_mk4_dvtModel[106].setRotationPoint(21F, 2F, -8F);

		br_mk4_dvtModel[107].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 94
		br_mk4_dvtModel[107].setRotationPoint(17F, 4F, -8F);

		br_mk4_dvtModel[108].addShapeBox(0F, 0F, 0F, 14, 1, 2, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 99
		br_mk4_dvtModel[108].setRotationPoint(12F, 3F, -1F);

		br_mk4_dvtModel[109].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -0.5F); // Box 100
		br_mk4_dvtModel[109].setRotationPoint(18F, 1F, -9F);

		br_mk4_dvtModel[110].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, 0F, 0F); // Box 101
		br_mk4_dvtModel[110].setRotationPoint(19F, 1F, -9F);

		br_mk4_dvtModel[111].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 102
		br_mk4_dvtModel[111].setRotationPoint(17F, 0F, -10F);

		br_mk4_dvtModel[112].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.2F, 0.5F, 0F, -0.2F, 0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 103
		br_mk4_dvtModel[112].setRotationPoint(19F, 2F, -8F);

		br_mk4_dvtModel[113].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F); // Box 104
		br_mk4_dvtModel[113].setRotationPoint(11F, 4F, -7F);

		br_mk4_dvtModel[114].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, -0.4F, -0.2F, 0.5F, -0.4F, -0.2F, 0.5F, -0.4F, -0.2F, -1F, -0.4F, -0.2F, -1F, 0F, -0.2F, 0F, -0.8F, -0.2F, 0F, -0.8F, -0.2F, -0.8F, 0F, -0.2F, -0.8F); // Box 105
		br_mk4_dvtModel[114].setRotationPoint(11F, 2F, -7F);

		br_mk4_dvtModel[115].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, -0.8F, -0.2F, 0.5F, 0F, -0.2F, 0.5F, 0F, -0.2F, -1F, -0.8F, -0.2F, -1F, -0.8F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.8F, -0.8F, -0.2F, -0.8F); // Box 105
		br_mk4_dvtModel[115].setRotationPoint(13F, 2F, -7F);

		br_mk4_dvtModel[116].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F); // Box 104
		br_mk4_dvtModel[116].setRotationPoint(24F, 4F, -7F);

		br_mk4_dvtModel[117].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, -0.2F, 0.5F, -0.8F, -0.2F, 0.5F, -0.8F, -0.2F, -1F, 0F, -0.2F, -1F, 0F, -0.2F, 0F, -0.8F, -0.2F, 0F, -0.8F, -0.2F, -0.8F, 0F, -0.2F, -0.8F); // Box 105
		br_mk4_dvtModel[117].setRotationPoint(24F, 2F, -7F);

		br_mk4_dvtModel[118].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, -0.4F, -0.2F, 0.5F, -0.4F, -0.2F, 0.5F, -0.4F, -0.2F, -1F, -0.4F, -0.2F, -1F, -0.8F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.8F, -0.8F, -0.2F, -0.8F); // Box 105
		br_mk4_dvtModel[118].setRotationPoint(26F, 2F, -7F);

		br_mk4_dvtModel[119].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 110
		br_mk4_dvtModel[119].setRotationPoint(18F, 2F, -7F);

		br_mk4_dvtModel[120].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 111
		br_mk4_dvtModel[120].setRotationPoint(18F, 0F, -1F);

		br_mk4_dvtModel[121].addShapeBox(0F, 0F, 0F, 4, 4, 2, 0F, -3F, -0.5F, 0.2F, -0.5F, -0.5F, 0.2F, -0.5F, -0.5F, -1.7F, -3F, -0.5F, -1.7F, 0F, -0.5F, -1.5F, -3.5F, -0.5F, -1.5F, -3.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 112
		br_mk4_dvtModel[121].setRotationPoint(21F, 1F, 10F);
		br_mk4_dvtModel[121].rotateAngleY = -3.14159265F;

		br_mk4_dvtModel[122].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 110
		br_mk4_dvtModel[122].setRotationPoint(18F, 2F, 1F);

		br_mk4_dvtModel[123].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 94
		br_mk4_dvtModel[123].setRotationPoint(27F, 2F, 8F);
		br_mk4_dvtModel[123].rotateAngleY = -3.14159265F;

		br_mk4_dvtModel[124].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 94
		br_mk4_dvtModel[124].setRotationPoint(15F, 2F, 8F);
		br_mk4_dvtModel[124].rotateAngleY = -3.14159265F;

		br_mk4_dvtModel[125].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -2F, 0F); // Box 94
		br_mk4_dvtModel[125].setRotationPoint(23F, 2F, 8F);
		br_mk4_dvtModel[125].rotateAngleY = -3.14159265F;

		br_mk4_dvtModel[126].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0.5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0.5F, 0F); // Box 94
		br_mk4_dvtModel[126].setRotationPoint(17F, 2F, 8F);
		br_mk4_dvtModel[126].rotateAngleY = -3.14159265F;

		br_mk4_dvtModel[127].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 94
		br_mk4_dvtModel[127].setRotationPoint(21F, 4F, 8F);
		br_mk4_dvtModel[127].rotateAngleY = -3.14159265F;

		br_mk4_dvtModel[128].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -0.5F); // Box 100
		br_mk4_dvtModel[128].setRotationPoint(20F, 1F, 9F);
		br_mk4_dvtModel[128].rotateAngleY = -3.14159265F;

		br_mk4_dvtModel[129].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, 0F, 0F); // Box 101
		br_mk4_dvtModel[129].setRotationPoint(19F, 1F, 9F);
		br_mk4_dvtModel[129].rotateAngleY = -3.14159265F;

		br_mk4_dvtModel[130].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 102
		br_mk4_dvtModel[130].setRotationPoint(21F, 0F, 10F);
		br_mk4_dvtModel[130].rotateAngleY = -3.14159265F;

		br_mk4_dvtModel[131].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.2F, 0.5F, 0F, -0.2F, 0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 103
		br_mk4_dvtModel[131].setRotationPoint(19F, 2F, 8F);
		br_mk4_dvtModel[131].rotateAngleY = -3.14159265F;

		br_mk4_dvtModel[132].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F); // Box 104
		br_mk4_dvtModel[132].setRotationPoint(27F, 4F, 7F);
		br_mk4_dvtModel[132].rotateAngleY = -3.14159265F;

		br_mk4_dvtModel[133].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, -0.4F, -0.2F, 0.5F, -0.4F, -0.2F, 0.5F, -0.4F, -0.2F, -1F, -0.4F, -0.2F, -1F, 0F, -0.2F, 0F, -0.8F, -0.2F, 0F, -0.8F, -0.2F, -0.8F, 0F, -0.2F, -0.8F); // Box 105
		br_mk4_dvtModel[133].setRotationPoint(27F, 2F, 7F);
		br_mk4_dvtModel[133].rotateAngleY = -3.14159265F;

		br_mk4_dvtModel[134].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, -0.8F, -0.2F, 0.5F, 0F, -0.2F, 0.5F, 0F, -0.2F, -1F, -0.8F, -0.2F, -1F, -0.8F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.8F, -0.8F, -0.2F, -0.8F); // Box 105
		br_mk4_dvtModel[134].setRotationPoint(25F, 2F, 7F);
		br_mk4_dvtModel[134].rotateAngleY = -3.14159265F;

		br_mk4_dvtModel[135].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F); // Box 104
		br_mk4_dvtModel[135].setRotationPoint(14F, 4F, 7F);
		br_mk4_dvtModel[135].rotateAngleY = -3.14159265F;

		br_mk4_dvtModel[136].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, -0.2F, 0.5F, -0.8F, -0.2F, 0.5F, -0.8F, -0.2F, -1F, 0F, -0.2F, -1F, 0F, -0.2F, 0F, -0.8F, -0.2F, 0F, -0.8F, -0.2F, -0.8F, 0F, -0.2F, -0.8F); // Box 105
		br_mk4_dvtModel[136].setRotationPoint(14F, 2F, 7F);
		br_mk4_dvtModel[136].rotateAngleY = -3.14159265F;

		br_mk4_dvtModel[137].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, -0.4F, -0.2F, 0.5F, -0.4F, -0.2F, 0.5F, -0.4F, -0.2F, -1F, -0.4F, -0.2F, -1F, -0.8F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.8F, -0.8F, -0.2F, -0.8F); // Box 105
		br_mk4_dvtModel[137].setRotationPoint(12F, 2F, 7F);
		br_mk4_dvtModel[137].rotateAngleY = -3.14159265F;

		br_mk4_dvtModel[138].addShapeBox(0F, 0F, 0F, 4, 4, 2, 0F, -0.5F, -0.5F, 0.2F, -3F, -0.5F, 0.2F, -3F, -0.5F, -1.7F, -0.5F, -0.5F, -1.7F, -3.5F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, 0F, -3.5F, -0.5F, 0F); // Box 112
		br_mk4_dvtModel[138].setRotationPoint(17F, 1F, -10F);

		br_mk4_dvtModel[139].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, -0.5F, 0.2F, -0.5F, -0.5F, 0.2F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 130
		br_mk4_dvtModel[139].setRotationPoint(18F, 1F, 10F);
		br_mk4_dvtModel[139].rotateAngleY = -3.14159265F;

		br_mk4_dvtModel[140].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, -0.5F, 0.5F, -0.5F, -0.5F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F); // Box 130
		br_mk4_dvtModel[140].setRotationPoint(17F, 1F, -10F);

		br_mk4_dvtModel[141].addShapeBox(0F, 0F, 0F, 30, 5, 22, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F); // Box 176
		br_mk4_dvtModel[141].setRotationPoint(-21F, 0F, -11F);

		br_mk4_dvtModel[142].addShapeBox(0F, 0F, 0F, 1, 3, 22, 0F, 0F, 0F, -0.1F, -0.9F, 0F, -0.1F, -0.9F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.6F, -0.9F, 0F, -0.6F, -0.9F, 0F, -0.6F, 0F, 0F, -0.6F); // Box 177
		br_mk4_dvtModel[142].setRotationPoint(-29F, -3F, -11F);

		br_mk4_dvtModel[143].addShapeBox(0F, 0F, 0F, 1, 3, 22, 0F, 0F, 0F, -0.1F, -0.9F, 0F, -0.1F, -0.9F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, -0.9F, 0F, -0.1F, -0.9F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 178
		br_mk4_dvtModel[143].setRotationPoint(-29F, -6F, -11F);

		br_mk4_dvtModel[144].addShapeBox(0F, 0F, 0F, 1, 11, 22, 0F, 0F, 0F, -0.6F, -0.9F, 0F, -0.6F, -0.9F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.1F, -0.9F, 0F, -0.1F, -0.9F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 179
		br_mk4_dvtModel[144].setRotationPoint(-29F, -17F, -11F);

		br_mk4_dvtModel[145].addShapeBox(0F, 0F, 0F, 1, 1, 20, 0F, 0F, 0F, -0.1F, -0.9F, 0F, -0.1F, -0.9F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0.4F, -0.9F, 0F, 0.4F, -0.9F, 0F, 0.4F, 0F, 0F, 0.4F); // Box 180
		br_mk4_dvtModel[145].setRotationPoint(-29F, -18F, -10F);

		br_mk4_dvtModel[146].addShapeBox(0F, 0F, 0F, 1, 2, 16, 0F, 0F, 0F, -1.1F, -0.9F, 0F, -1.1F, -0.9F, 0F, -1.1F, 0F, 0F, -1.1F, 0F, 0F, 1.9F, -0.9F, 0F, 1.9F, -0.9F, 0F, 1.9F, 0F, 0F, 1.9F); // Box 180
		br_mk4_dvtModel[146].setRotationPoint(-29F, -20F, -8F);

		br_mk4_dvtModel[147].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F, 0F, -0.05F, -4.1F, -0.9F, -0.05F, -4.1F, -0.9F, -0.05F, -4.1F, 0F, -0.05F, -4.1F, 0F, 0F, 1.9F, -0.9F, 0F, 1.9F, -0.9F, 0F, 1.9F, 0F, 0F, 1.9F); // Box 180
		br_mk4_dvtModel[147].setRotationPoint(-29F, -22F, -5F);

		br_mk4_dvtModel[148].addShapeBox(0F, 0F, 0F, 5, 1, 22, 0F, 0.5F, 0F, -1F, 2F, 0F, -0.4F, 2F, 0F, -0.4F, 0.5F, 0F, -1F, 0.5F, -0.5F, -1F, 2F, -0.5F, -0.5F, 2F, -0.5F, -0.5F, 0.5F, -0.5F, -1F); // 04
		br_mk4_dvtModel[148].setRotationPoint(-45F, -1F, -11F);

		br_mk4_dvtModel[149].addShapeBox(0F, 0F, 0F, 8, 3, 1, 0F, 1.5F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F, -0.9F, 1.5F, 0F, 0F, 0F, 0F, -0.9F, 0F, 0F, -0.5F, 0F, 0F, -0.4F, 0F, 0F, 0F); // 05
		br_mk4_dvtModel[149].setRotationPoint(-48F, -3F, -11F);

		br_mk4_dvtModel[150].addShapeBox(0F, 0F, 0F, 8, 3, 1, 0F, 1.5F, 0F, 0F, 0F, 0F, -0.9F, 0F, 0F, 0F, 1.5F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.5F, 0F, 0F, -0.9F); // 06
		br_mk4_dvtModel[150].setRotationPoint(-48F, -3F, 10F);

		br_mk4_dvtModel[151].addShapeBox(0F, 0F, 0F, 9, 2, 1, 0F, 0.5F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0.5F, 0F, 0F, 0.5F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0.5F, 0F, 0F); // 07
		br_mk4_dvtModel[151].setRotationPoint(-49F, -5F, -11F);

		br_mk4_dvtModel[152].addShapeBox(0F, 0F, 0F, 9, 2, 1, 0F, 0.5F, 0F, 0F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0.5F, 0F, -0.9F, 0.5F, 0F, 0F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0.5F, 0F, -0.9F); // 08
		br_mk4_dvtModel[152].setRotationPoint(-49F, -5F, 10F);

		br_mk4_dvtModel[153].addShapeBox(0F, 0F, 0F, 9, 12, 1, 0F, -9F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.4F, -9F, 0F, -0.4F, 0.5F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0.5F, 0F, 0F); // 09
		br_mk4_dvtModel[153].setRotationPoint(-49F, -17F, -11F);

		br_mk4_dvtModel[154].addShapeBox(0F, 0F, 0F, 9, 12, 1, 0F, -9F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.5F, -9F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0.5F, 0F, -0.9F); // 10
		br_mk4_dvtModel[154].setRotationPoint(-49F, -17F, 10F);

		br_mk4_dvtModel[155].addShapeBox(0F, 0F, 0F, 1, 3, 20, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // 11
		br_mk4_dvtModel[155].setRotationPoint(-49F, -3F, -10F);

		br_mk4_dvtModel[156].addShapeBox(0F, 0F, 0F, 1, 2, 7, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // 12
		br_mk4_dvtModel[156].setRotationPoint(-49F, -5F, -10F);

		br_mk4_dvtModel[157].addShapeBox(0F, 0F, 0F, 1, 2, 7, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // 13
		br_mk4_dvtModel[157].setRotationPoint(-49F, -5F, 3F);

		br_mk4_dvtModel[158].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // 14
		br_mk4_dvtModel[158].setRotationPoint(-49F, -5F, -3F);

		br_mk4_dvtModel[159].addShapeBox(0F, 0F, 0F, 4, 6, 20, 0F, -4.25F, 0F, 0.25F, 0.3F, 0F, 0.25F, 0.3F, 0F, 0.25F, -4.25F, 0F, 0.25F, 0.5F, 0F, 0F, 0.2F, 0F, 0.4F, 0.2F, 0F, 0.4F, 0.5F, 0F, 0F); // 15
		br_mk4_dvtModel[159].setRotationPoint(-49F, -11F, -10F);

		br_mk4_dvtModel[160].addShapeBox(0F, 0F, 0F, 5, 6, 1, 0F, -5F, 0F, 0.5F, 0.3F, 0F, 0.5F, 0.3F, 0F, -0.5F, -5F, 0F, -0.5F, -0.2F, 0F, 0.5F, -4.6F, 0F, 0.5F, -4.6F, 0F, -0.5F, -0.2F, 0F, -0.5F); // 18
		br_mk4_dvtModel[160].setRotationPoint(-45F, -17F, 0F);

		br_mk4_dvtModel[161].addShapeBox(0F, 0F, 0F, 5, 5, 2, 0F, -5F, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, -5F, 0F, 0F, 0.2F, 0F, 0F, -3.8F, 0F, 0F, -3.8F, 0F, 0F, 0.2F, 0F, 0F); // 25
		br_mk4_dvtModel[161].setRotationPoint(-40F, -22F, -1F);

		br_mk4_dvtModel[162].addShapeBox(0F, 0F, 0F, 5, 5, 6, 0F, -5F, -2F, 0F, 0F, -2.1F, 0F, 0F, -0.1F, 0F, -5F, 0F, 0F, 0.2F, 0F, 0F, -3.8F, 0F, 0F, -3.8F, 0F, 0F, 0.2F, 0F, 0F); // 26
		br_mk4_dvtModel[162].setRotationPoint(-40F, -22F, -7F);

		br_mk4_dvtModel[163].addShapeBox(0F, 0F, 0F, 5, 5, 6, 0F, -5F, 0F, 0F, 0F, -0.1F, 0F, 0F, -2.1F, 0F, -5F, -2F, 0F, 0.2F, 0F, 0F, -3.8F, 0F, 0F, -3.8F, 0F, 0F, 0.2F, 0F, 0F); // 27
		br_mk4_dvtModel[163].setRotationPoint(-40F, -22F, 1F);

		br_mk4_dvtModel[164].addShapeBox(0F, 0F, 0F, 5, 3, 3, 0F, -5F, -2F, 0F, 0F, -3F, 0.5F, 0F, -0.1F, 0F, -5F, 0F, 0F, 0F, 0F, 0.5F, -3.8F, 0F, 0.5F, -3.8F, 0F, 0F, 0.2F, 0F, 0F); // 28
		br_mk4_dvtModel[164].setRotationPoint(-40F, -20F, -10F);

		br_mk4_dvtModel[165].addShapeBox(0F, 0F, 0F, 5, 3, 3, 0F, -5F, 0F, 0F, 0F, -0.1F, 0F, 0F, -3F, 0.5F, -5F, -2F, 0F, 0.2F, 0F, 0F, -3.8F, 0F, 0F, -3.8F, 0F, 0.5F, 0F, 0F, 0.5F); // 29
		br_mk4_dvtModel[165].setRotationPoint(-40F, -20F, 7F);

		br_mk4_dvtModel[166].addShapeBox(0F, 0F, 0F, 7, 6, 20, 0F, 0F, -1F, 0F, 0F, -1F, 0.5F, 0F, -1F, 0.5F, 0F, -1F, 0F, -4F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -4F, 0F, -1F); // 30
		br_mk4_dvtModel[166].setRotationPoint(-48F, -1F, -10F);

		br_mk4_dvtModel[167].addShapeBox(0F, 0F, 0F, 1, 4, 22, 0F, 0F, -0.5F, -0.9F, 0F, -0.5F, -0.9F, 0F, -0.5F, -0.9F, 0F, -0.5F, -0.9F, 0F, 0F, -2F, -1F, 0F, -2F, -1F, 0F, -2F, 0F, 0F, -2F); // 31
		br_mk4_dvtModel[167].setRotationPoint(-41F, 1F, -11F);

		br_mk4_dvtModel[168].addShapeBox(0F, 0F, 0F, 3, 1, 22, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0.5F, -0.9F, -2F, 0.5F, -0.9F, -2F, 0.5F, -0.9F, 0F, 0.5F, -0.9F); // 32
		br_mk4_dvtModel[168].setRotationPoint(-41F, 0F, -11F);

		br_mk4_dvtModel[169].addShapeBox(0F, 0F, 0F, 2, 2, 8, 0F, 0.1F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0F, 0.1F, 0.5F, 0F, 0.1F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0.1F, -0.5F, 0F); // 33
		br_mk4_dvtModel[169].setRotationPoint(-48F, 0F, -10F);

		br_mk4_dvtModel[170].addShapeBox(0F, 0F, 0F, 2, 2, 8, 0F, 0.1F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0.1F, 0.5F, -0.5F, 0.1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0.1F, -0.5F, -0.5F); // 34
		br_mk4_dvtModel[170].setRotationPoint(-48F, 0F, 2F);

		br_mk4_dvtModel[171].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F); // 35
		br_mk4_dvtModel[171].setRotationPoint(-48F, -1F, -2F);

		br_mk4_dvtModel[172].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, -0.1F, 0F, 0.5F, -0.1F, 0F, 0.5F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // 36
		br_mk4_dvtModel[172].setRotationPoint(-48F, 1F, -2F);

		br_mk4_dvtModel[173].addShapeBox(0F, 0F, 0F, 1, 1, 22, 0F, -0.05F, 0F, -0.6F, -0.5F, 0F, -0.6F, -0.5F, 0F, -0.6F, -0.05F, 0F, -0.6F, 0.55F, -0.3F, -0.6F, -0.9F, -0.3F, -0.6F, -0.9F, -0.3F, -0.6F, 0.55F, -0.3F, -0.6F); // 37
		br_mk4_dvtModel[173].setRotationPoint(-40F, -17F, -11F);

		br_mk4_dvtModel[174].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F, -0.8F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.8F, -0.5F, 0F, -0.8F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.8F, -0.5F, 0F); // 40
		br_mk4_dvtModel[174].setRotationPoint(-52F, -1F, -9F);

		br_mk4_dvtModel[175].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F, -0.8F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.8F, -0.5F, 0F, -0.8F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.8F, -0.5F, 0F); // 41
		br_mk4_dvtModel[175].setRotationPoint(-52F, -1F, 6F);

		br_mk4_dvtModel[176].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, -0.5F, 0.5F, -0.5F); // 43
		br_mk4_dvtModel[176].setRotationPoint(-49F, -1F, -9F);

		br_mk4_dvtModel[177].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -0.5F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, -1F, -0.5F, -0.5F, -1F, -0.5F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, -1F, -0.5F, 0.5F, -1F); // 44
		br_mk4_dvtModel[177].setRotationPoint(-49F, -1F, 9F);

		br_mk4_dvtModel[178].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, -0.7F, -0.5F, 0.15F, -0.1F, -0.5F, 0.15F, 0F, -0.5F, -0.85F, -0.7F, -0.5F, -0.85F, -0.7F, 0.5F, 0.15F, -0.1F, 0.5F, 0.15F, -0.1F, 0.5F, -0.85F, -0.7F, 0.5F, -0.85F); // 49
		br_mk4_dvtModel[178].setRotationPoint(-49F, 0F, -4F);

		br_mk4_dvtModel[179].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, -0.7F, -0.5F, 0.15F, -0.1F, -0.5F, 0.15F, 0F, -0.5F, -0.85F, -0.7F, -0.5F, -0.85F, -0.7F, 0.5F, 0.15F, -0.1F, 0.5F, 0.15F, -0.1F, 0.5F, -0.85F, -0.7F, 0.5F, -0.85F); // 50
		br_mk4_dvtModel[179].setRotationPoint(-49F, 0F, 4F);

		br_mk4_dvtModel[180].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, 0F, -0.2F, 0F); // 221
		br_mk4_dvtModel[180].setRotationPoint(-49F, -1F, -5F);

		br_mk4_dvtModel[181].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0.2F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, -0.5F, 0F, 0.2F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -1F, 0F, -0.5F, -1F); // 222
		br_mk4_dvtModel[181].setRotationPoint(-49F, 0F, -5F);

		br_mk4_dvtModel[182].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0.2F, -0.5F, -0.5F, 0.2F, -0.5F, -0.5F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, -0.5F, -1F, -0.5F, -0.5F, -1F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // 223
		br_mk4_dvtModel[182].setRotationPoint(-49F, 0F, 3F);

		br_mk4_dvtModel[183].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F, -2.5F, 0F, -0.1F, 0.6F, 0F, -0.1F, 0.6F, 0F, -0.8F, -2.5F, 0F, -0.8F, -0.2F, 0F, -0.1F, -1.7F, 0F, -0.1F, -1.7F, 0F, -0.8F, -0.2F, 0F, -0.8F); // 225
		br_mk4_dvtModel[183].setRotationPoint(-45F, -14F, -1F);

		br_mk4_dvtModel[184].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F, -2.5F, 0F, -0.8F, 0.6F, 0F, -0.8F, 0.6F, 0F, -0.1F, -2.5F, 0F, -0.1F, -0.2F, 0F, -0.8F, -1.7F, 0F, -0.8F, -1.7F, 0F, -0.1F, -0.2F, 0F, -0.1F); // 226
		br_mk4_dvtModel[184].setRotationPoint(-45F, -14F, 0F);

		br_mk4_dvtModel[185].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F, -1.3F, -1.5F, -2.1F, -0.6F, -1.5F, -2.1F, -0.6F, -1.5F, 1.2F, -1.3F, -1.5F, 1.2F, -0.2F, 0F, -0.1F, -1.7F, 0F, -0.1F, -1.7F, 0F, -0.8F, -0.2F, 0F, -0.8F); // 230
		br_mk4_dvtModel[185].setRotationPoint(-45F, -14F, -3F);

		br_mk4_dvtModel[186].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F, -1.3F, -1.5F, 1.2F, -0.6F, -1.5F, 1.2F, -0.6F, -1.5F, -2.1F, -1.3F, -1.5F, -2.1F, -0.2F, 0F, -0.8F, -1.7F, 0F, -0.8F, -1.7F, 0F, -0.1F, -0.2F, 0F, -0.1F); // 231
		br_mk4_dvtModel[186].setRotationPoint(-45F, -14F, 2F);

		br_mk4_dvtModel[187].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // 38
		br_mk4_dvtModel[187].setRotationPoint(-51F, 0F, -8F);

		br_mk4_dvtModel[188].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // 39
		br_mk4_dvtModel[188].setRotationPoint(-51F, 0F, 7F);

		br_mk4_dvtModel[189].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F, 0.5F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, 0.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, 0.5F, -0.2F, 0F); // 224
		br_mk4_dvtModel[189].setRotationPoint(-48F, -1F, -4F);

		br_mk4_dvtModel[190].addShapeBox(0F, 0F, 0F, 5, 6, 1, 0F, -5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.3F, -5F, 0F, 0F, -0.25F, 0F, -0.7F, 0F, 0F, -0.3F, 0F, 0F, -0.55F, -0.25F, 0F, 0.2F); // 16
		br_mk4_dvtModel[190].setRotationPoint(-45F, -17F, -11F);

		br_mk4_dvtModel[191].addShapeBox(0F, 0F, 0F, 5, 6, 1, 0F, -5F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.5F, -5F, 0F, -0.5F, -0.25F, 0F, 0.2F, 0F, 0F, -0.55F, 0F, 0F, -0.3F, -0.25F, 0F, -0.7F); // 17
		br_mk4_dvtModel[191].setRotationPoint(-45F, -17F, 10F);

		br_mk4_dvtModel[192].addShapeBox(0F, 0F, 0F, 2, 3, 11, 0F, -0.2F, 0F, -0.75F, -1.5F, 0F, -0.7F, -1.5F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -0.7F, -0.5F, 0F, -0.55F, -0.5F, 0F, 0F, -0.2F, 0F, 0F); // 51
		br_mk4_dvtModel[192].setRotationPoint(-45F, -11F, -11F);

		br_mk4_dvtModel[193].addShapeBox(0F, 0F, 0F, 2, 3, 7, 0F, -0.2F, -0.1F, 0F, -1.8F, -0.1F, 0F, -1.8F, -0.1F, -0.7F, -0.2F, -0.1F, -0.7F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.55F, 0F, 0F, -0.7F); // 52
		br_mk4_dvtModel[193].setRotationPoint(-45F, -11F, 4F);

		br_mk4_dvtModel[194].addShapeBox(0F, 0F, 0F, 2, 3, 4, 0F, -0.3F, 0F, 0F, -1.5F, 0F, 0F, -1F, 0F, 0.1F, -0.3F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // 53
		br_mk4_dvtModel[194].setRotationPoint(-45F, -11F, 0F);

		br_mk4_dvtModel[195].addShapeBox(0F, 0F, 0F, 6, 7, 2, 0F, 0F, 0F, -0.55F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.4F, 0F, 0F, 0F, 1.5F, 0F, 0F); // 54
		br_mk4_dvtModel[195].setRotationPoint(-44F, -8F, -11F);

		br_mk4_dvtModel[196].addShapeBox(0F, 0F, 0F, 6, 7, 4, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F); // 55
		br_mk4_dvtModel[196].setRotationPoint(-45F, -8F, 0F);

		br_mk4_dvtModel[197].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.25F, 0F, 0F, -0.6F, 0F, 0F, -0.4F, 0F, 0F, -0.6F, 0F, 0F, -0.2F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // 56
		br_mk4_dvtModel[197].setRotationPoint(-44F, -10F, -11F);

		br_mk4_dvtModel[198].addShapeBox(0F, 0F, 0F, 6, 7, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.6F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 1F, 0F, -0.7F); // 57
		br_mk4_dvtModel[198].setRotationPoint(-44F, -8F, 10F);

		br_mk4_dvtModel[199].addShapeBox(0F, 0F, 0F, 2, 7, 9, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F); // 58
		br_mk4_dvtModel[199].setRotationPoint(-46F, -8F, -9F);

		br_mk4_dvtModel[200].addShapeBox(0F, 0F, 0F, 2, 7, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F); // 59
		br_mk4_dvtModel[200].setRotationPoint(-46F, -8F, 3F);

		br_mk4_dvtModel[201].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // 60
		br_mk4_dvtModel[201].setRotationPoint(-42F, -7F, -7F);

		br_mk4_dvtModel[202].addShapeBox(0F, 0F, 0F, 2, 6, 4, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // 61
		br_mk4_dvtModel[202].setRotationPoint(-39F, -12F, -7F);

		br_mk4_dvtModel[203].addShapeBox(0F, 0F, 0F, 1, 5, 4, 0F, 0F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // 62
		br_mk4_dvtModel[203].setRotationPoint(-40F, -6F, -7F);

		br_mk4_dvtModel[204].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F); // 63
		br_mk4_dvtModel[204].setRotationPoint(-41F, -9F, -10F);

		br_mk4_dvtModel[205].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F); // 64
		br_mk4_dvtModel[205].setRotationPoint(-42F, -9F, 0F);

		br_mk4_dvtModel[206].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // 65
		br_mk4_dvtModel[206].setRotationPoint(-42F, -7F, 5F);

		br_mk4_dvtModel[207].addShapeBox(0F, 0F, 0F, 2, 5, 4, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // 66
		br_mk4_dvtModel[207].setRotationPoint(-39F, -11F, 5F);

		br_mk4_dvtModel[208].addShapeBox(0F, 0F, 0F, 1, 5, 4, 0F, 0F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // 67
		br_mk4_dvtModel[208].setRotationPoint(-40F, -6F, 5F);

		br_mk4_dvtModel[209].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, 0F, -0.3F); // 193
		br_mk4_dvtModel[209].setRotationPoint(-41F, -9F, -10F);


	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		for(int i = 0; i < 210; i++)
		{
			br_mk4_dvtModel[i].render(f5);
		}
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
	{
	}

	public ModelRendererTurbo br_mk4_dvtModel[];
}