//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2022 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator:
// Created on:04.02.2022 - 19:35:07
// Last changed on: 04.02.2022 - 19:35:07

package train.client.render.models;

import net.minecraft.entity.Entity;
import tmt.ModelBase;
import tmt.ModelRendererTurbo;

public class ModelBR_MK2F_BSO extends ModelBase
{
	int textureX = 512;
	int textureY = 512;

	public ModelBR_MK2F_BSO()
	{
		br_mk2f_bsoModel = new ModelRendererTurbo[267];
		br_mk2f_bsoModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		br_mk2f_bsoModel[1] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 1
		br_mk2f_bsoModel[2] = new ModelRendererTurbo(this, 185, 9, textureX, textureY); // Box 2
		br_mk2f_bsoModel[3] = new ModelRendererTurbo(this, 209, 17, textureX, textureY); // Box 3
		br_mk2f_bsoModel[4] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 4
		br_mk2f_bsoModel[5] = new ModelRendererTurbo(this, 169, 33, textureX, textureY); // Box 5
		br_mk2f_bsoModel[6] = new ModelRendererTurbo(this, 337, 33, textureX, textureY); // Box 6
		br_mk2f_bsoModel[7] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 7
		br_mk2f_bsoModel[8] = new ModelRendererTurbo(this, 169, 41, textureX, textureY); // Box 8
		br_mk2f_bsoModel[9] = new ModelRendererTurbo(this, 337, 41, textureX, textureY); // Box 9
		br_mk2f_bsoModel[10] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 10
		br_mk2f_bsoModel[11] = new ModelRendererTurbo(this, 177, 49, textureX, textureY); // Box 11
		br_mk2f_bsoModel[12] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 12
		br_mk2f_bsoModel[13] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 13
		br_mk2f_bsoModel[14] = new ModelRendererTurbo(this, 329, 49, textureX, textureY); // Box 14
		br_mk2f_bsoModel[15] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 15
		br_mk2f_bsoModel[16] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 16
		br_mk2f_bsoModel[17] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 17
		br_mk2f_bsoModel[18] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 17
		br_mk2f_bsoModel[19] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 17
		br_mk2f_bsoModel[20] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 17
		br_mk2f_bsoModel[21] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 17
		br_mk2f_bsoModel[22] = new ModelRendererTurbo(this, 457, 9, textureX, textureY); // Box 22
		br_mk2f_bsoModel[23] = new ModelRendererTurbo(this, 377, 49, textureX, textureY); // Box 23
		br_mk2f_bsoModel[24] = new ModelRendererTurbo(this, 425, 49, textureX, textureY); // Box 24
		br_mk2f_bsoModel[25] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 25
		br_mk2f_bsoModel[26] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 26
		br_mk2f_bsoModel[27] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 26
		br_mk2f_bsoModel[28] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 28
		br_mk2f_bsoModel[29] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 28
		br_mk2f_bsoModel[30] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 28
		br_mk2f_bsoModel[31] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 28
		br_mk2f_bsoModel[32] = new ModelRendererTurbo(this, 377, 9, textureX, textureY); // Box 28
		br_mk2f_bsoModel[33] = new ModelRendererTurbo(this, 481, 17, textureX, textureY); // Box 33
		br_mk2f_bsoModel[34] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 33
		br_mk2f_bsoModel[35] = new ModelRendererTurbo(this, 505, 25, textureX, textureY); // Box 33
		br_mk2f_bsoModel[36] = new ModelRendererTurbo(this, 361, 49, textureX, textureY); // Box 33
		br_mk2f_bsoModel[37] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 33
		br_mk2f_bsoModel[38] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 33
		br_mk2f_bsoModel[39] = new ModelRendererTurbo(this, 353, 9, textureX, textureY); // Box 33
		br_mk2f_bsoModel[40] = new ModelRendererTurbo(this, 361, 9, textureX, textureY); // Box 33
		br_mk2f_bsoModel[41] = new ModelRendererTurbo(this, 345, 49, textureX, textureY); // Box 33
		br_mk2f_bsoModel[42] = new ModelRendererTurbo(this, 385, 49, textureX, textureY); // Box 33
		br_mk2f_bsoModel[43] = new ModelRendererTurbo(this, 369, 9, textureX, textureY); // Box 33
		br_mk2f_bsoModel[44] = new ModelRendererTurbo(this, 457, 9, textureX, textureY); // Box 33
		br_mk2f_bsoModel[45] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 33
		br_mk2f_bsoModel[46] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 33
		br_mk2f_bsoModel[47] = new ModelRendererTurbo(this, 409, 49, textureX, textureY); // Box 33
		br_mk2f_bsoModel[48] = new ModelRendererTurbo(this, 433, 49, textureX, textureY); // Box 33
		br_mk2f_bsoModel[49] = new ModelRendererTurbo(this, 457, 49, textureX, textureY); // Box 33
		br_mk2f_bsoModel[50] = new ModelRendererTurbo(this, 465, 49, textureX, textureY); // Box 33
		br_mk2f_bsoModel[51] = new ModelRendererTurbo(this, 465, 9, textureX, textureY); // Box 33
		br_mk2f_bsoModel[52] = new ModelRendererTurbo(this, 481, 9, textureX, textureY); // Box 33
		br_mk2f_bsoModel[53] = new ModelRendererTurbo(this, 185, 17, textureX, textureY); // Box 33
		br_mk2f_bsoModel[54] = new ModelRendererTurbo(this, 193, 17, textureX, textureY); // Box 33
		br_mk2f_bsoModel[55] = new ModelRendererTurbo(this, 393, 49, textureX, textureY); // Box 33
		br_mk2f_bsoModel[56] = new ModelRendererTurbo(this, 441, 49, textureX, textureY); // Box 33
		br_mk2f_bsoModel[57] = new ModelRendererTurbo(this, 201, 17, textureX, textureY); // Box 33
		br_mk2f_bsoModel[58] = new ModelRendererTurbo(this, 401, 17, textureX, textureY); // Box 33
		br_mk2f_bsoModel[59] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 33
		br_mk2f_bsoModel[60] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 33
		br_mk2f_bsoModel[61] = new ModelRendererTurbo(this, 409, 17, textureX, textureY); // Box 61
		br_mk2f_bsoModel[62] = new ModelRendererTurbo(this, 417, 17, textureX, textureY); // Box 61
		br_mk2f_bsoModel[63] = new ModelRendererTurbo(this, 425, 17, textureX, textureY); // Box 61
		br_mk2f_bsoModel[64] = new ModelRendererTurbo(this, 457, 17, textureX, textureY); // Box 61
		br_mk2f_bsoModel[65] = new ModelRendererTurbo(this, 433, 17, textureX, textureY); // Box 61
		br_mk2f_bsoModel[66] = new ModelRendererTurbo(this, 441, 17, textureX, textureY); // Box 61
		br_mk2f_bsoModel[67] = new ModelRendererTurbo(this, 169, 25, textureX, textureY); // Box 61
		br_mk2f_bsoModel[68] = new ModelRendererTurbo(this, 185, 25, textureX, textureY); // Box 61
		br_mk2f_bsoModel[69] = new ModelRendererTurbo(this, 377, 25, textureX, textureY); // Box 70
		br_mk2f_bsoModel[70] = new ModelRendererTurbo(this, 393, 25, textureX, textureY); // Box 70
		br_mk2f_bsoModel[71] = new ModelRendererTurbo(this, 409, 25, textureX, textureY); // Box 70
		br_mk2f_bsoModel[72] = new ModelRendererTurbo(this, 481, 49, textureX, textureY); // Box 70
		br_mk2f_bsoModel[73] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 74
		br_mk2f_bsoModel[74] = new ModelRendererTurbo(this, 41, 57, textureX, textureY); // Box 74
		br_mk2f_bsoModel[75] = new ModelRendererTurbo(this, 65, 57, textureX, textureY); // Box 75
		br_mk2f_bsoModel[76] = new ModelRendererTurbo(this, 97, 57, textureX, textureY); // Box 75
		br_mk2f_bsoModel[77] = new ModelRendererTurbo(this, 137, 57, textureX, textureY); // Box 75
		br_mk2f_bsoModel[78] = new ModelRendererTurbo(this, 481, 17, textureX, textureY); // Box 75
		br_mk2f_bsoModel[79] = new ModelRendererTurbo(this, 497, 17, textureX, textureY); // Box 75
		br_mk2f_bsoModel[80] = new ModelRendererTurbo(this, 201, 25, textureX, textureY); // Box 75
		br_mk2f_bsoModel[81] = new ModelRendererTurbo(this, 337, 41, textureX, textureY); // Box 75
		br_mk2f_bsoModel[82] = new ModelRendererTurbo(this, 465, 17, textureX, textureY); // Box 75
		br_mk2f_bsoModel[83] = new ModelRendererTurbo(this, 177, 25, textureX, textureY); // Box 75
		br_mk2f_bsoModel[84] = new ModelRendererTurbo(this, 193, 25, textureX, textureY); // Box 75
		br_mk2f_bsoModel[85] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 75
		br_mk2f_bsoModel[86] = new ModelRendererTurbo(this, 169, 49, textureX, textureY); // Box 75
		br_mk2f_bsoModel[87] = new ModelRendererTurbo(this, 361, 49, textureX, textureY); // Box 75
		br_mk2f_bsoModel[88] = new ModelRendererTurbo(this, 377, 49, textureX, textureY); // Box 75
		br_mk2f_bsoModel[89] = new ModelRendererTurbo(this, 497, 49, textureX, textureY); // Box 75
		br_mk2f_bsoModel[90] = new ModelRendererTurbo(this, 409, 49, textureX, textureY); // Box 75
		br_mk2f_bsoModel[91] = new ModelRendererTurbo(this, 425, 49, textureX, textureY); // Box 75
		br_mk2f_bsoModel[92] = new ModelRendererTurbo(this, 161, 57, textureX, textureY); // Box 75
		br_mk2f_bsoModel[93] = new ModelRendererTurbo(this, 185, 57, textureX, textureY); // Box 74
		br_mk2f_bsoModel[94] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 74
		br_mk2f_bsoModel[95] = new ModelRendererTurbo(this, 25, 57, textureX, textureY); // Box 75
		br_mk2f_bsoModel[96] = new ModelRendererTurbo(this, 465, 49, textureX, textureY); // Box 75
		br_mk2f_bsoModel[97] = new ModelRendererTurbo(this, 41, 57, textureX, textureY); // Box 75
		br_mk2f_bsoModel[98] = new ModelRendererTurbo(this, 121, 57, textureX, textureY); // Box 75
		br_mk2f_bsoModel[99] = new ModelRendererTurbo(this, 129, 57, textureX, textureY); // Box 75
		br_mk2f_bsoModel[100] = new ModelRendererTurbo(this, 137, 57, textureX, textureY); // Box 75
		br_mk2f_bsoModel[101] = new ModelRendererTurbo(this, 145, 57, textureX, textureY); // Box 75
		br_mk2f_bsoModel[102] = new ModelRendererTurbo(this, 161, 57, textureX, textureY); // Box 75
		br_mk2f_bsoModel[103] = new ModelRendererTurbo(this, 233, 57, textureX, textureY); // Box 75
		br_mk2f_bsoModel[104] = new ModelRendererTurbo(this, 169, 57, textureX, textureY); // Box 75
		br_mk2f_bsoModel[105] = new ModelRendererTurbo(this, 241, 57, textureX, textureY); // Box 75
		br_mk2f_bsoModel[106] = new ModelRendererTurbo(this, 289, 57, textureX, textureY); // Box 75
		br_mk2f_bsoModel[107] = new ModelRendererTurbo(this, 297, 57, textureX, textureY); // Box 75
		br_mk2f_bsoModel[108] = new ModelRendererTurbo(this, 305, 57, textureX, textureY); // Box 75
		br_mk2f_bsoModel[109] = new ModelRendererTurbo(this, 313, 57, textureX, textureY); // Box 75
		br_mk2f_bsoModel[110] = new ModelRendererTurbo(this, 321, 57, textureX, textureY); // Box 75
		br_mk2f_bsoModel[111] = new ModelRendererTurbo(this, 337, 57, textureX, textureY); // Box 75
		br_mk2f_bsoModel[112] = new ModelRendererTurbo(this, 489, 57, textureX, textureY); // Box 75
		br_mk2f_bsoModel[113] = new ModelRendererTurbo(this, 497, 57, textureX, textureY); // Box 75
		br_mk2f_bsoModel[114] = new ModelRendererTurbo(this, 505, 57, textureX, textureY); // Box 75
		br_mk2f_bsoModel[115] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 75
		br_mk2f_bsoModel[116] = new ModelRendererTurbo(this, 9, 65, textureX, textureY); // Box 75
		br_mk2f_bsoModel[117] = new ModelRendererTurbo(this, 25, 65, textureX, textureY); // Box 75
		br_mk2f_bsoModel[118] = new ModelRendererTurbo(this, 41, 65, textureX, textureY); // Box 75
		br_mk2f_bsoModel[119] = new ModelRendererTurbo(this, 49, 65, textureX, textureY); // Box 75
		br_mk2f_bsoModel[120] = new ModelRendererTurbo(this, 65, 65, textureX, textureY); // Box 75
		br_mk2f_bsoModel[121] = new ModelRendererTurbo(this, 81, 65, textureX, textureY); // Box 75
		br_mk2f_bsoModel[122] = new ModelRendererTurbo(this, 97, 65, textureX, textureY); // Box 75
		br_mk2f_bsoModel[123] = new ModelRendererTurbo(this, 105, 65, textureX, textureY); // Box 75
		br_mk2f_bsoModel[124] = new ModelRendererTurbo(this, 121, 65, textureX, textureY); // Box 75
		br_mk2f_bsoModel[125] = new ModelRendererTurbo(this, 129, 65, textureX, textureY); // Box 75
		br_mk2f_bsoModel[126] = new ModelRendererTurbo(this, 137, 65, textureX, textureY); // Box 75
		br_mk2f_bsoModel[127] = new ModelRendererTurbo(this, 145, 65, textureX, textureY); // Box 75
		br_mk2f_bsoModel[128] = new ModelRendererTurbo(this, 161, 65, textureX, textureY); // Box 75
		br_mk2f_bsoModel[129] = new ModelRendererTurbo(this, 185, 65, textureX, textureY); // Box 70
		br_mk2f_bsoModel[130] = new ModelRendererTurbo(this, 201, 65, textureX, textureY); // Box 70
		br_mk2f_bsoModel[131] = new ModelRendererTurbo(this, 217, 65, textureX, textureY); // Box 70
		br_mk2f_bsoModel[132] = new ModelRendererTurbo(this, 233, 65, textureX, textureY); // Box 70
		br_mk2f_bsoModel[133] = new ModelRendererTurbo(this, 233, 65, textureX, textureY); // Box 74
		br_mk2f_bsoModel[134] = new ModelRendererTurbo(this, 273, 65, textureX, textureY); // Box 74
		br_mk2f_bsoModel[135] = new ModelRendererTurbo(this, 297, 65, textureX, textureY); // Box 75
		br_mk2f_bsoModel[136] = new ModelRendererTurbo(this, 473, 65, textureX, textureY); // Box 75
		br_mk2f_bsoModel[137] = new ModelRendererTurbo(this, 65, 73, textureX, textureY); // Box 75
		br_mk2f_bsoModel[138] = new ModelRendererTurbo(this, 169, 65, textureX, textureY); // Box 75
		br_mk2f_bsoModel[139] = new ModelRendererTurbo(this, 257, 65, textureX, textureY); // Box 75
		br_mk2f_bsoModel[140] = new ModelRendererTurbo(this, 265, 65, textureX, textureY); // Box 75
		br_mk2f_bsoModel[141] = new ModelRendererTurbo(this, 273, 65, textureX, textureY); // Box 75
		br_mk2f_bsoModel[142] = new ModelRendererTurbo(this, 361, 65, textureX, textureY); // Box 75
		br_mk2f_bsoModel[143] = new ModelRendererTurbo(this, 281, 65, textureX, textureY); // Box 75
		br_mk2f_bsoModel[144] = new ModelRendererTurbo(this, 377, 65, textureX, textureY); // Box 75
		br_mk2f_bsoModel[145] = new ModelRendererTurbo(this, 409, 65, textureX, textureY); // Box 75
		br_mk2f_bsoModel[146] = new ModelRendererTurbo(this, 417, 65, textureX, textureY); // Box 75
		br_mk2f_bsoModel[147] = new ModelRendererTurbo(this, 425, 65, textureX, textureY); // Box 75
		br_mk2f_bsoModel[148] = new ModelRendererTurbo(this, 465, 65, textureX, textureY); // Box 75
		br_mk2f_bsoModel[149] = new ModelRendererTurbo(this, 473, 65, textureX, textureY); // Box 75
		br_mk2f_bsoModel[150] = new ModelRendererTurbo(this, 497, 65, textureX, textureY); // Box 75
		br_mk2f_bsoModel[151] = new ModelRendererTurbo(this, 505, 65, textureX, textureY); // Box 75
		br_mk2f_bsoModel[152] = new ModelRendererTurbo(this, 161, 73, textureX, textureY); // Box 75
		br_mk2f_bsoModel[153] = new ModelRendererTurbo(this, 185, 73, textureX, textureY); // Box 74
		br_mk2f_bsoModel[154] = new ModelRendererTurbo(this, 233, 73, textureX, textureY); // Box 74
		br_mk2f_bsoModel[155] = new ModelRendererTurbo(this, 257, 73, textureX, textureY); // Box 75
		br_mk2f_bsoModel[156] = new ModelRendererTurbo(this, 273, 73, textureX, textureY); // Box 75
		br_mk2f_bsoModel[157] = new ModelRendererTurbo(this, 89, 73, textureX, textureY); // Box 75
		br_mk2f_bsoModel[158] = new ModelRendererTurbo(this, 297, 73, textureX, textureY); // Box 75
		br_mk2f_bsoModel[159] = new ModelRendererTurbo(this, 305, 73, textureX, textureY); // Box 75
		br_mk2f_bsoModel[160] = new ModelRendererTurbo(this, 313, 73, textureX, textureY); // Box 75
		br_mk2f_bsoModel[161] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 75
		br_mk2f_bsoModel[162] = new ModelRendererTurbo(this, 321, 73, textureX, textureY); // Box 75
		br_mk2f_bsoModel[163] = new ModelRendererTurbo(this, 473, 73, textureX, textureY); // Box 75
		br_mk2f_bsoModel[164] = new ModelRendererTurbo(this, 481, 73, textureX, textureY); // Box 75
		br_mk2f_bsoModel[165] = new ModelRendererTurbo(this, 497, 73, textureX, textureY); // Box 75
		br_mk2f_bsoModel[166] = new ModelRendererTurbo(this, 49, 81, textureX, textureY); // Box 75
		br_mk2f_bsoModel[167] = new ModelRendererTurbo(this, 505, 73, textureX, textureY); // Box 75
		br_mk2f_bsoModel[168] = new ModelRendererTurbo(this, 65, 81, textureX, textureY); // Box 75
		br_mk2f_bsoModel[169] = new ModelRendererTurbo(this, 73, 81, textureX, textureY); // Box 75
		br_mk2f_bsoModel[170] = new ModelRendererTurbo(this, 89, 81, textureX, textureY); // Box 75
		br_mk2f_bsoModel[171] = new ModelRendererTurbo(this, 97, 81, textureX, textureY); // Box 75
		br_mk2f_bsoModel[172] = new ModelRendererTurbo(this, 105, 81, textureX, textureY); // Box 75
		br_mk2f_bsoModel[173] = new ModelRendererTurbo(this, 113, 81, textureX, textureY); // Box 75
		br_mk2f_bsoModel[174] = new ModelRendererTurbo(this, 129, 81, textureX, textureY); // Box 75
		br_mk2f_bsoModel[175] = new ModelRendererTurbo(this, 137, 81, textureX, textureY); // Box 75
		br_mk2f_bsoModel[176] = new ModelRendererTurbo(this, 145, 81, textureX, textureY); // Box 75
		br_mk2f_bsoModel[177] = new ModelRendererTurbo(this, 185, 81, textureX, textureY); // Box 75
		br_mk2f_bsoModel[178] = new ModelRendererTurbo(this, 161, 81, textureX, textureY); // Box 75
		br_mk2f_bsoModel[179] = new ModelRendererTurbo(this, 201, 81, textureX, textureY); // Box 75
		br_mk2f_bsoModel[180] = new ModelRendererTurbo(this, 169, 81, textureX, textureY); // Box 75
		br_mk2f_bsoModel[181] = new ModelRendererTurbo(this, 209, 81, textureX, textureY); // Box 75
		br_mk2f_bsoModel[182] = new ModelRendererTurbo(this, 217, 81, textureX, textureY); // Box 75
		br_mk2f_bsoModel[183] = new ModelRendererTurbo(this, 225, 81, textureX, textureY); // Box 75
		br_mk2f_bsoModel[184] = new ModelRendererTurbo(this, 313, 81, textureX, textureY); // Box 75
		br_mk2f_bsoModel[185] = new ModelRendererTurbo(this, 321, 81, textureX, textureY); // Box 75
		br_mk2f_bsoModel[186] = new ModelRendererTurbo(this, 377, 81, textureX, textureY); // Box 75
		br_mk2f_bsoModel[187] = new ModelRendererTurbo(this, 385, 81, textureX, textureY); // Box 75
		br_mk2f_bsoModel[188] = new ModelRendererTurbo(this, 393, 81, textureX, textureY); // Box 188
		br_mk2f_bsoModel[189] = new ModelRendererTurbo(this, 409, 81, textureX, textureY); // Box 188
		br_mk2f_bsoModel[190] = new ModelRendererTurbo(this, 417, 81, textureX, textureY); // Box 188
		br_mk2f_bsoModel[191] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 188
		br_mk2f_bsoModel[192] = new ModelRendererTurbo(this, 9, 89, textureX, textureY); // Box 188
		br_mk2f_bsoModel[193] = new ModelRendererTurbo(this, 25, 89, textureX, textureY); // Box 188
		br_mk2f_bsoModel[194] = new ModelRendererTurbo(this, 33, 89, textureX, textureY); // Box 188
		br_mk2f_bsoModel[195] = new ModelRendererTurbo(this, 41, 89, textureX, textureY); // Box 188
		br_mk2f_bsoModel[196] = new ModelRendererTurbo(this, 49, 89, textureX, textureY); // Box 197
		br_mk2f_bsoModel[197] = new ModelRendererTurbo(this, 105, 89, textureX, textureY); // Box 198
		br_mk2f_bsoModel[198] = new ModelRendererTurbo(this, 121, 89, textureX, textureY); // Box 198
		br_mk2f_bsoModel[199] = new ModelRendererTurbo(this, 137, 89, textureX, textureY); // Box 198
		br_mk2f_bsoModel[200] = new ModelRendererTurbo(this, 161, 89, textureX, textureY); // Box 198
		br_mk2f_bsoModel[201] = new ModelRendererTurbo(this, 177, 89, textureX, textureY); // Box 198
		br_mk2f_bsoModel[202] = new ModelRendererTurbo(this, 193, 89, textureX, textureY); // Box 198
		br_mk2f_bsoModel[203] = new ModelRendererTurbo(this, 209, 89, textureX, textureY); // Box 198
		br_mk2f_bsoModel[204] = new ModelRendererTurbo(this, 225, 89, textureX, textureY); // Box 198
		br_mk2f_bsoModel[205] = new ModelRendererTurbo(this, 241, 89, textureX, textureY); // Box 198
		br_mk2f_bsoModel[206] = new ModelRendererTurbo(this, 257, 89, textureX, textureY); // Box 197
		br_mk2f_bsoModel[207] = new ModelRendererTurbo(this, 273, 89, textureX, textureY); // Box 197
		br_mk2f_bsoModel[208] = new ModelRendererTurbo(this, 297, 89, textureX, textureY); // Box 197
		br_mk2f_bsoModel[209] = new ModelRendererTurbo(this, 313, 89, textureX, textureY); // Box 197
		br_mk2f_bsoModel[210] = new ModelRendererTurbo(this, 329, 89, textureX, textureY); // Box 198
		br_mk2f_bsoModel[211] = new ModelRendererTurbo(this, 337, 89, textureX, textureY); // Box 198
		br_mk2f_bsoModel[212] = new ModelRendererTurbo(this, 289, 89, textureX, textureY); // Box 198
		br_mk2f_bsoModel[213] = new ModelRendererTurbo(this, 273, 89, textureX, textureY); // Box 198
		br_mk2f_bsoModel[214] = new ModelRendererTurbo(this, 361, 89, textureX, textureY); // Box 74
		br_mk2f_bsoModel[215] = new ModelRendererTurbo(this, 409, 89, textureX, textureY); // Box 74
		br_mk2f_bsoModel[216] = new ModelRendererTurbo(this, 457, 89, textureX, textureY); // Box 74
		br_mk2f_bsoModel[217] = new ModelRendererTurbo(this, 17, 57, textureX, textureY); // Box 74
		br_mk2f_bsoModel[218] = new ModelRendererTurbo(this, 393, 89, textureX, textureY); // Box 74
		br_mk2f_bsoModel[219] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 74
		br_mk2f_bsoModel[220] = new ModelRendererTurbo(this, 49, 97, textureX, textureY); // Box 74
		br_mk2f_bsoModel[221] = new ModelRendererTurbo(this, 169, 97, textureX, textureY); // Box 74
		br_mk2f_bsoModel[222] = new ModelRendererTurbo(this, 137, 81, textureX, textureY); // Box 74
		br_mk2f_bsoModel[223] = new ModelRendererTurbo(this, 441, 89, textureX, textureY); // Box 74
		br_mk2f_bsoModel[224] = new ModelRendererTurbo(this, 393, 89, textureX, textureY); // Box 198
		br_mk2f_bsoModel[225] = new ModelRendererTurbo(this, 417, 89, textureX, textureY); // Box 198
		br_mk2f_bsoModel[226] = new ModelRendererTurbo(this, 441, 89, textureX, textureY); // Box 198
		br_mk2f_bsoModel[227] = new ModelRendererTurbo(this, 89, 121, textureX, textureY); // Box 198
		br_mk2f_bsoModel[228] = new ModelRendererTurbo(this, 377, 89, textureX, textureY); // Box 198
		br_mk2f_bsoModel[229] = new ModelRendererTurbo(this, 449, 89, textureX, textureY); // Box 198
		br_mk2f_bsoModel[230] = new ModelRendererTurbo(this, 81, 97, textureX, textureY); // Box 198
		br_mk2f_bsoModel[231] = new ModelRendererTurbo(this, 489, 89, textureX, textureY); // Box 198
		br_mk2f_bsoModel[232] = new ModelRendererTurbo(this, 465, 89, textureX, textureY); // Box 198
		br_mk2f_bsoModel[233] = new ModelRendererTurbo(this, 473, 89, textureX, textureY); // Box 198
		br_mk2f_bsoModel[234] = new ModelRendererTurbo(this, 201, 97, textureX, textureY); // Box 198
		br_mk2f_bsoModel[235] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 198
		br_mk2f_bsoModel[236] = new ModelRendererTurbo(this, 489, 89, textureX, textureY); // Box 198
		br_mk2f_bsoModel[237] = new ModelRendererTurbo(this, 505, 89, textureX, textureY); // Box 198
		br_mk2f_bsoModel[238] = new ModelRendererTurbo(this, 233, 97, textureX, textureY); // Box 198
		br_mk2f_bsoModel[239] = new ModelRendererTurbo(this, 33, 97, textureX, textureY); // Box 198
		br_mk2f_bsoModel[240] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 198
		br_mk2f_bsoModel[241] = new ModelRendererTurbo(this, 17, 97, textureX, textureY); // Box 198
		br_mk2f_bsoModel[242] = new ModelRendererTurbo(this, 305, 97, textureX, textureY); // Box 198
		br_mk2f_bsoModel[243] = new ModelRendererTurbo(this, 105, 105, textureX, textureY); // Box 198
		br_mk2f_bsoModel[244] = new ModelRendererTurbo(this, 33, 97, textureX, textureY); // Box 198
		br_mk2f_bsoModel[245] = new ModelRendererTurbo(this, 65, 97, textureX, textureY); // Box 198
		br_mk2f_bsoModel[246] = new ModelRendererTurbo(this, 129, 105, textureX, textureY); // Box 198
		br_mk2f_bsoModel[247] = new ModelRendererTurbo(this, 257, 105, textureX, textureY); // Box 198
		br_mk2f_bsoModel[248] = new ModelRendererTurbo(this, 81, 97, textureX, textureY); // Box 198
		br_mk2f_bsoModel[249] = new ModelRendererTurbo(this, 105, 97, textureX, textureY); // Box 198
		br_mk2f_bsoModel[250] = new ModelRendererTurbo(this, 161, 105, textureX, textureY); // Box 198
		br_mk2f_bsoModel[251] = new ModelRendererTurbo(this, 281, 105, textureX, textureY); // Box 198
		br_mk2f_bsoModel[252] = new ModelRendererTurbo(this, 113, 97, textureX, textureY); // Box 198
		br_mk2f_bsoModel[253] = new ModelRendererTurbo(this, 201, 97, textureX, textureY); // Box 198
		br_mk2f_bsoModel[254] = new ModelRendererTurbo(this, 329, 105, textureX, textureY); // Box 198
		br_mk2f_bsoModel[255] = new ModelRendererTurbo(this, 297, 113, textureX, textureY); // Box 198
		br_mk2f_bsoModel[256] = new ModelRendererTurbo(this, 225, 97, textureX, textureY); // Box 198
		br_mk2f_bsoModel[257] = new ModelRendererTurbo(this, 233, 97, textureX, textureY); // Box 198
		br_mk2f_bsoModel[258] = new ModelRendererTurbo(this, 457, 113, textureX, textureY); // Box 198
		br_mk2f_bsoModel[259] = new ModelRendererTurbo(this, 489, 113, textureX, textureY); // Box 198
		br_mk2f_bsoModel[260] = new ModelRendererTurbo(this, 49, 137, textureX, textureY); // Box 198
		br_mk2f_bsoModel[261] = new ModelRendererTurbo(this, 1, 145, textureX, textureY); // Box 198
		br_mk2f_bsoModel[262] = new ModelRendererTurbo(this, 156, 149, textureX, textureY); // Box 198
		br_mk2f_bsoModel[263] = new ModelRendererTurbo(this, 175, 148, textureX, textureY); // Box 198
		br_mk2f_bsoModel[264] = new ModelRendererTurbo(this, 465, 49, textureX, textureY); // Box 75
		br_mk2f_bsoModel[265] = new ModelRendererTurbo(this, 465, 49, textureX, textureY); // Box 75
		br_mk2f_bsoModel[266] = new ModelRendererTurbo(this, 465, 49, textureX, textureY); // Box 75

		br_mk2f_bsoModel[0].addShapeBox(0F, 0F, 0F, 81, 1, 20, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.4F, 0.4F, 0F, -0.4F, 0.4F, 0F, -0.4F, 0.4F, 0F, -0.4F, 0.4F); // Box 0
		br_mk2f_bsoModel[0].setRotationPoint(-48F, 0F, -10F);

		br_mk2f_bsoModel[1].addShapeBox(0F, 0F, 0F, 81, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F); // Box 1
		br_mk2f_bsoModel[1].setRotationPoint(-48F, -3F, -11F);

		br_mk2f_bsoModel[2].addShapeBox(0F, 0F, 0F, 81, 4, 1, 0F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 2
		br_mk2f_bsoModel[2].setRotationPoint(-48F, -3F, 10F);

		br_mk2f_bsoModel[3].addShapeBox(0F, 0F, 0F, 81, 14, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0F, 0F, -0.9F); // Box 3
		br_mk2f_bsoModel[3].setRotationPoint(-48F, -17F, -11F);

		br_mk2f_bsoModel[4].addShapeBox(0F, 0F, 0F, 81, 14, 1, 0F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
		br_mk2f_bsoModel[4].setRotationPoint(-48F, -17F, 10F);

		br_mk2f_bsoModel[5].addShapeBox(0F, 0F, 0F, 79, 1, 1, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0F, 0F, -0.9F); // Box 5
		br_mk2f_bsoModel[5].setRotationPoint(-47F, -18F, -11F);

		br_mk2f_bsoModel[6].addShapeBox(0F, 0F, 0F, 79, 1, 1, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		br_mk2f_bsoModel[6].setRotationPoint(-47F, -18F, 10F);

		br_mk2f_bsoModel[7].addShapeBox(0F, 0F, 0F, 79, 2, 3, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, -3F, 0F, 0.1F, -3F); // Box 7
		br_mk2f_bsoModel[7].setRotationPoint(-47F, -20F, -10F);

		br_mk2f_bsoModel[8].addShapeBox(0F, 0F, 0F, 79, 2, 3, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0.1F, -3F, 0F, 0.1F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		br_mk2f_bsoModel[8].setRotationPoint(-47F, -20F, 7F);

		br_mk2f_bsoModel[9].addShapeBox(0F, 0F, 0F, 79, 2, 5, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, -5F, 0F, 0.1F, -5F); // Box 9
		br_mk2f_bsoModel[9].setRotationPoint(-47F, -22F, -7F);

		br_mk2f_bsoModel[10].addShapeBox(0F, 0F, 0F, 79, 2, 5, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0.1F, -5F, 0F, 0.1F, -5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 10
		br_mk2f_bsoModel[10].setRotationPoint(-47F, -22F, 2F);

		br_mk2f_bsoModel[11].addShapeBox(0F, 0F, 0F, 79, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F); // Box 11
		br_mk2f_bsoModel[11].setRotationPoint(-47F, -22F, -2F);

		br_mk2f_bsoModel[12].addShapeBox(0F, 0F, 0F, 1, 2, 20, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F); // Box 12
		br_mk2f_bsoModel[12].setRotationPoint(-49F, 0F, -10F);

		br_mk2f_bsoModel[13].addShapeBox(0F, 0F, 0F, 1, 4, 22, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.5F, -1.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -1.5F); // Box 13
		br_mk2f_bsoModel[13].setRotationPoint(-49F, -3F, -11F);

		br_mk2f_bsoModel[14].addShapeBox(0F, 0F, 0F, 1, 14, 22, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 14
		br_mk2f_bsoModel[14].setRotationPoint(-49F, -17F, -11F);

		br_mk2f_bsoModel[15].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -2F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		br_mk2f_bsoModel[15].setRotationPoint(-49F, -18F, -11F);

		br_mk2f_bsoModel[16].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -2F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 16
		br_mk2f_bsoModel[16].setRotationPoint(-49F, -18F, 10F);

		br_mk2f_bsoModel[17].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F, -2F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		br_mk2f_bsoModel[17].setRotationPoint(-49F, -20F, -10F);

		br_mk2f_bsoModel[18].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		br_mk2f_bsoModel[18].setRotationPoint(-49F, -20F, 7F);

		br_mk2f_bsoModel[19].addShapeBox(0F, 0F, 0F, 2, 5, 5, 0F, -2F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		br_mk2f_bsoModel[19].setRotationPoint(-49F, -22F, -7F);

		br_mk2f_bsoModel[20].addShapeBox(0F, 0F, 0F, 2, 5, 5, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		br_mk2f_bsoModel[20].setRotationPoint(-49F, -22F, 2F);

		br_mk2f_bsoModel[21].addShapeBox(0F, 0F, 0F, 2, 5, 4, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		br_mk2f_bsoModel[21].setRotationPoint(-49F, -22F, -2F);

		br_mk2f_bsoModel[22].addShapeBox(0F, 0F, 0F, 1, 2, 20, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F); // Box 22
		br_mk2f_bsoModel[22].setRotationPoint(33F, 0F, -10F);

		br_mk2f_bsoModel[23].addShapeBox(0F, 0F, 0F, 1, 4, 22, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, -0.5F); // Box 23
		br_mk2f_bsoModel[23].setRotationPoint(33F, -3F, -11F);

		br_mk2f_bsoModel[24].addShapeBox(0F, 0F, 0F, 1, 14, 22, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 24
		br_mk2f_bsoModel[24].setRotationPoint(33F, -17F, -11F);

		br_mk2f_bsoModel[25].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25
		br_mk2f_bsoModel[25].setRotationPoint(32F, -18F, -11F);

		br_mk2f_bsoModel[26].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		br_mk2f_bsoModel[26].setRotationPoint(32F, -18F, 10F);

		br_mk2f_bsoModel[27].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 26
		br_mk2f_bsoModel[27].setRotationPoint(33F, -18F, 10F);

		br_mk2f_bsoModel[28].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F, 0F, -2F, 0F, -2F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 28
		br_mk2f_bsoModel[28].setRotationPoint(32F, -20F, -10F);

		br_mk2f_bsoModel[29].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 28
		br_mk2f_bsoModel[29].setRotationPoint(32F, -20F, 7F);

		br_mk2f_bsoModel[30].addShapeBox(0F, 0F, 0F, 2, 5, 5, 0F, 0F, -2F, 0F, -2F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 28
		br_mk2f_bsoModel[30].setRotationPoint(32F, -22F, -7F);

		br_mk2f_bsoModel[31].addShapeBox(0F, 0F, 0F, 2, 5, 5, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 28
		br_mk2f_bsoModel[31].setRotationPoint(32F, -22F, 2F);

		br_mk2f_bsoModel[32].addShapeBox(0F, 0F, 0F, 2, 5, 4, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 28
		br_mk2f_bsoModel[32].setRotationPoint(32F, -22F, -2F);

		br_mk2f_bsoModel[33].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 33
		br_mk2f_bsoModel[33].setRotationPoint(-51F, 0F, -4F);

		br_mk2f_bsoModel[34].addShapeBox(0F, 0F, 0F, 2, 18, 1, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 33
		br_mk2f_bsoModel[34].setRotationPoint(-51F, -18F, -5F);

		br_mk2f_bsoModel[35].addShapeBox(0F, 0F, 0F, 2, 18, 1, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 33
		br_mk2f_bsoModel[35].setRotationPoint(-51F, -18F, 4F);

		br_mk2f_bsoModel[36].addShapeBox(0F, 0F, 0F, 3, 2, 8, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 33
		br_mk2f_bsoModel[36].setRotationPoint(-51F, -19F, -4F);

		br_mk2f_bsoModel[37].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 33
		br_mk2f_bsoModel[37].setRotationPoint(-51F, -19F, -5F);

		br_mk2f_bsoModel[38].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 33
		br_mk2f_bsoModel[38].setRotationPoint(-51F, -19F, 4F);

		br_mk2f_bsoModel[39].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 33
		br_mk2f_bsoModel[39].setRotationPoint(-51F, 0F, -5F);

		br_mk2f_bsoModel[40].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F); // Box 33
		br_mk2f_bsoModel[40].setRotationPoint(-51F, 0F, 4F);

		br_mk2f_bsoModel[41].addShapeBox(0F, 0F, 0F, 1, 18, 1, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 33
		br_mk2f_bsoModel[41].setRotationPoint(-50F, -18F, -5F);

		br_mk2f_bsoModel[42].addShapeBox(0F, 0F, 0F, 1, 18, 1, 0F, -0.5F, 0F, 0F, 0.7F, 0F, 0F, 0.7F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 33
		br_mk2f_bsoModel[42].setRotationPoint(-50F, -18F, 4F);

		br_mk2f_bsoModel[43].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 33
		br_mk2f_bsoModel[43].setRotationPoint(-50F, -19F, -5F);

		br_mk2f_bsoModel[44].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -0.5F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 33
		br_mk2f_bsoModel[44].setRotationPoint(-50F, -19F, 4F);

		br_mk2f_bsoModel[45].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 33
		br_mk2f_bsoModel[45].setRotationPoint(-50F, 0F, -5F);

		br_mk2f_bsoModel[46].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F); // Box 33
		br_mk2f_bsoModel[46].setRotationPoint(-50F, 0F, 4F);

		br_mk2f_bsoModel[47].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 33
		br_mk2f_bsoModel[47].setRotationPoint(36F, 0F, 4F);
		br_mk2f_bsoModel[47].rotateAngleY = -3.14159265F;

		br_mk2f_bsoModel[48].addShapeBox(0F, 0F, 0F, 2, 18, 1, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 33
		br_mk2f_bsoModel[48].setRotationPoint(36F, -18F, 5F);
		br_mk2f_bsoModel[48].rotateAngleY = -3.14159265F;

		br_mk2f_bsoModel[49].addShapeBox(0F, 0F, 0F, 2, 18, 1, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 33
		br_mk2f_bsoModel[49].setRotationPoint(36F, -18F, -4F);
		br_mk2f_bsoModel[49].rotateAngleY = -3.14159265F;

		br_mk2f_bsoModel[50].addShapeBox(0F, 0F, 0F, 3, 2, 8, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 33
		br_mk2f_bsoModel[50].setRotationPoint(36F, -19F, 4F);
		br_mk2f_bsoModel[50].rotateAngleY = -3.14159265F;

		br_mk2f_bsoModel[51].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 33
		br_mk2f_bsoModel[51].setRotationPoint(36F, -19F, 5F);
		br_mk2f_bsoModel[51].rotateAngleY = -3.14159265F;

		br_mk2f_bsoModel[52].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 33
		br_mk2f_bsoModel[52].setRotationPoint(36F, -19F, -4F);
		br_mk2f_bsoModel[52].rotateAngleY = -3.14159265F;

		br_mk2f_bsoModel[53].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 33
		br_mk2f_bsoModel[53].setRotationPoint(36F, 0F, 5F);
		br_mk2f_bsoModel[53].rotateAngleY = -3.14159265F;

		br_mk2f_bsoModel[54].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F); // Box 33
		br_mk2f_bsoModel[54].setRotationPoint(36F, 0F, -4F);
		br_mk2f_bsoModel[54].rotateAngleY = -3.14159265F;

		br_mk2f_bsoModel[55].addShapeBox(0F, 0F, 0F, 1, 18, 1, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 33
		br_mk2f_bsoModel[55].setRotationPoint(35F, -18F, 5F);
		br_mk2f_bsoModel[55].rotateAngleY = -3.14159265F;

		br_mk2f_bsoModel[56].addShapeBox(0F, 0F, 0F, 1, 18, 1, 0F, -0.5F, 0F, 0F, 0.7F, 0F, 0F, 0.7F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 33
		br_mk2f_bsoModel[56].setRotationPoint(35F, -18F, -4F);
		br_mk2f_bsoModel[56].rotateAngleY = -3.14159265F;

		br_mk2f_bsoModel[57].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 33
		br_mk2f_bsoModel[57].setRotationPoint(35F, -19F, 5F);
		br_mk2f_bsoModel[57].rotateAngleY = -3.14159265F;

		br_mk2f_bsoModel[58].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -0.5F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 33
		br_mk2f_bsoModel[58].setRotationPoint(35F, -19F, -4F);
		br_mk2f_bsoModel[58].rotateAngleY = -3.14159265F;

		br_mk2f_bsoModel[59].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 33
		br_mk2f_bsoModel[59].setRotationPoint(35F, 0F, 5F);
		br_mk2f_bsoModel[59].rotateAngleY = -3.14159265F;

		br_mk2f_bsoModel[60].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F); // Box 33
		br_mk2f_bsoModel[60].setRotationPoint(35F, 0F, -4F);
		br_mk2f_bsoModel[60].rotateAngleY = -3.14159265F;

		br_mk2f_bsoModel[61].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.4F, 0.2F, -0.7F, 0F, 0.2F, -0.7F, 0F, 0.2F, 0.3F, 0.4F, 0.2F, 0.3F, 0.4F, -0.7F, -0.7F, 0F, -0.7F, -0.7F, 0F, -0.7F, 0.3F, 0.4F, -0.7F, 0.3F); // Box 61
		br_mk2f_bsoModel[61].setRotationPoint(-50F, 1F, 6F);

		br_mk2f_bsoModel[62].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.4F, 0.2F, 0.3F, 0F, 0.2F, 0.3F, 0F, 0.2F, -0.7F, 0.4F, 0.2F, -0.7F, 0.4F, -0.7F, 0.3F, 0F, -0.7F, 0.3F, 0F, -0.7F, -0.7F, 0.4F, -0.7F, -0.7F); // Box 61
		br_mk2f_bsoModel[62].setRotationPoint(-50F, 1F, -7F);

		br_mk2f_bsoModel[63].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F, -0.5F, 0F, 0.5F, -0.4F, 0F, 0.5F, -0.4F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0.5F, -0.4F, 0F, 0.5F, -0.4F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 61
		br_mk2f_bsoModel[63].setRotationPoint(-51F, 0F, -8F);

		br_mk2f_bsoModel[64].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F, -0.5F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, 0F, 0.5F, -0.5F, 0F, 0.5F); // Box 61
		br_mk2f_bsoModel[64].setRotationPoint(-51F, 0F, 5F);

		br_mk2f_bsoModel[65].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.4F, 0.2F, -0.7F, 0F, 0.2F, -0.7F, 0F, 0.2F, 0.3F, 0.4F, 0.2F, 0.3F, 0.4F, -0.7F, -0.7F, 0F, -0.7F, -0.7F, 0F, -0.7F, 0.3F, 0.4F, -0.7F, 0.3F); // Box 61
		br_mk2f_bsoModel[65].setRotationPoint(35F, 1F, 8F);
		br_mk2f_bsoModel[65].rotateAngleY = -3.14159265F;

		br_mk2f_bsoModel[66].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.4F, 0.2F, 0.3F, 0F, 0.2F, 0.3F, 0F, 0.2F, -0.7F, 0.4F, 0.2F, -0.7F, 0.4F, -0.7F, 0.3F, 0F, -0.7F, 0.3F, 0F, -0.7F, -0.7F, 0.4F, -0.7F, -0.7F); // Box 61
		br_mk2f_bsoModel[66].setRotationPoint(35F, 1F, -7F);
		br_mk2f_bsoModel[66].rotateAngleY = -3.14159265F;

		br_mk2f_bsoModel[67].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F, -0.5F, 0F, 0.5F, -0.4F, 0F, 0.5F, -0.4F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0.5F, -0.4F, 0F, 0.5F, -0.4F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 61
		br_mk2f_bsoModel[67].setRotationPoint(36F, 0F, -6F);
		br_mk2f_bsoModel[67].rotateAngleY = -3.14159265F;

		br_mk2f_bsoModel[68].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F, -0.5F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, 0F, 0.5F, -0.5F, 0F, 0.5F); // Box 61
		br_mk2f_bsoModel[68].setRotationPoint(36F, 0F, 9F);
		br_mk2f_bsoModel[68].rotateAngleY = -3.14159265F;

		br_mk2f_bsoModel[69].addBox(0F, 0F, 0F, 5, 5, 0, 0F); // Box 70
		br_mk2f_bsoModel[69].setRotationPoint(-43F, 2F, -6F);

		br_mk2f_bsoModel[70].addBox(0F, 0F, 0F, 5, 5, 0, 0F); // Box 70
		br_mk2f_bsoModel[70].setRotationPoint(-43F, 2F, 6F);

		br_mk2f_bsoModel[71].addBox(0F, 0F, 0F, 5, 5, 0, 0F); // Box 70
		br_mk2f_bsoModel[71].setRotationPoint(-29F, 2F, -6F);

		br_mk2f_bsoModel[72].addBox(0F, 0F, 0F, 5, 5, 0, 0F); // Box 70
		br_mk2f_bsoModel[72].setRotationPoint(-29F, 2F, 6F);

		br_mk2f_bsoModel[73].addBox(0F, 0F, 0F, 1, 1, 16, 0F); // Box 74
		br_mk2f_bsoModel[73].setRotationPoint(-41F, 4F, -8F);

		br_mk2f_bsoModel[74].addBox(0F, 0F, 0F, 1, 1, 16, 0F); // Box 74
		br_mk2f_bsoModel[74].setRotationPoint(-27F, 4F, -8F);

		br_mk2f_bsoModel[75].addShapeBox(0F, 0F, 0F, 19, 1, 1, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0.2F, 0F, 0.5F, 0.2F, 0F, 0.5F, 0.2F, 0F, 0.5F, 0.2F, 0F); // Box 75
		br_mk2f_bsoModel[75].setRotationPoint(-43F, 2F, -8F);

		br_mk2f_bsoModel[76].addShapeBox(0F, 0F, 0F, 1, 1, 16, 0F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0.2F, -0.5F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, 0F, 0.2F, -0.5F); // Box 75
		br_mk2f_bsoModel[76].setRotationPoint(-44F, 2F, -8F);

		br_mk2f_bsoModel[77].addShapeBox(0F, 0F, 0F, 1, 1, 16, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0.2F, 0F, 0F, 0.2F, -0.5F, 0F, 0.2F, -0.5F, -0.5F, 0.2F, 0F); // Box 75
		br_mk2f_bsoModel[77].setRotationPoint(-24F, 2F, -8F);

		br_mk2f_bsoModel[78].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0.2F, 0F, 0F); // Box 75
		br_mk2f_bsoModel[78].setRotationPoint(-42F, 3F, -8F);

		br_mk2f_bsoModel[79].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 75
		br_mk2f_bsoModel[79].setRotationPoint(-40F, 3F, -8F);

		br_mk2f_bsoModel[80].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, -0.4F, -0.7F, 0F, -0.4F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, -0.7F, 0F, -0.4F, -0.7F, 0F, 0F, 0F, 0F, 0F); // Box 75
		br_mk2f_bsoModel[80].setRotationPoint(-43F, 3F, -8F);

		br_mk2f_bsoModel[81].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -0.7F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, -0.7F, 0F, 0F); // Box 75
		br_mk2f_bsoModel[81].setRotationPoint(-39F, 3F, -8F);

		br_mk2f_bsoModel[82].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, -0.6F, 0F, 0.2F, -0.6F, 0F, 0.2F, -0.6F, 0F, 0.2F, -0.6F, 0F); // Box 75
		br_mk2f_bsoModel[82].setRotationPoint(-42F, 5F, -8F);

		br_mk2f_bsoModel[83].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.4F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, -0.4F, -0.2F, -0.6F, 0F, -0.2F, -0.6F, 0F, 0F, -0.6F, 0F); // Box 75
		br_mk2f_bsoModel[83].setRotationPoint(-43F, 5F, -8F);

		br_mk2f_bsoModel[84].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.2F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.6F, 0F, 0F, -0.6F, -0.4F, 0F, -0.6F, 0F, -0.2F, -0.6F, 0F); // Box 75
		br_mk2f_bsoModel[84].setRotationPoint(-39F, 5F, -8F);

		br_mk2f_bsoModel[85].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0.2F, 0F, 0F); // Box 75
		br_mk2f_bsoModel[85].setRotationPoint(-28F, 3F, -8F);

		br_mk2f_bsoModel[86].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 75
		br_mk2f_bsoModel[86].setRotationPoint(-26F, 3F, -8F);

		br_mk2f_bsoModel[87].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, -0.4F, -0.7F, 0F, -0.4F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, -0.7F, 0F, -0.4F, -0.7F, 0F, 0F, 0F, 0F, 0F); // Box 75
		br_mk2f_bsoModel[87].setRotationPoint(-29F, 3F, -8F);

		br_mk2f_bsoModel[88].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -0.7F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, -0.7F, 0F, 0F); // Box 75
		br_mk2f_bsoModel[88].setRotationPoint(-25F, 3F, -8F);

		br_mk2f_bsoModel[89].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, -0.6F, 0F, 0.2F, -0.6F, 0F, 0.2F, -0.6F, 0F, 0.2F, -0.6F, 0F); // Box 75
		br_mk2f_bsoModel[89].setRotationPoint(-28F, 5F, -8F);

		br_mk2f_bsoModel[90].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.4F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, -0.4F, -0.2F, -0.6F, 0F, -0.2F, -0.6F, 0F, 0F, -0.6F, 0F); // Box 75
		br_mk2f_bsoModel[90].setRotationPoint(-29F, 5F, -8F);

		br_mk2f_bsoModel[91].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.2F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.6F, 0F, 0F, -0.6F, -0.4F, 0F, -0.6F, 0F, -0.2F, -0.6F, 0F); // Box 75
		br_mk2f_bsoModel[91].setRotationPoint(-25F, 5F, -8F);

		br_mk2f_bsoModel[92].addShapeBox(0F, 0F, 0F, 3, 1, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 75
		br_mk2f_bsoModel[92].setRotationPoint(-35F, 2F, -7F);

		br_mk2f_bsoModel[93].addBox(0F, 0F, 0F, 21, 1, 2, 0F); // Box 74
		br_mk2f_bsoModel[93].setRotationPoint(-44F, 3F, -1F);

		br_mk2f_bsoModel[94].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		br_mk2f_bsoModel[94].setRotationPoint(-35F, 0F, -1F);

		br_mk2f_bsoModel[95].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F); // Box 75
		br_mk2f_bsoModel[95].setRotationPoint(-35F, 3F, -8F);

		br_mk2f_bsoModel[96].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 75
		br_mk2f_bsoModel[96].setRotationPoint(-34F, 3F, -8F);

		br_mk2f_bsoModel[97].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F, 0.5F, -0.4F, 0F, 0.5F, -0.4F, 0F, 0.5F, -0.4F, 0F, 0.5F, -0.4F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 75
		br_mk2f_bsoModel[97].setRotationPoint(-36F, 4F, -8F);

		br_mk2f_bsoModel[98].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, -0.5F, -0.5F, -0.2F, -0.5F, -0.5F, -0.2F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F); // Box 75
		br_mk2f_bsoModel[98].setRotationPoint(-36F, 1F, -8F);

		br_mk2f_bsoModel[99].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, -0.2F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -1F, 0F, -0.2F, -1F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F); // Box 75
		br_mk2f_bsoModel[99].setRotationPoint(-32F, 1F, -8F);

		br_mk2f_bsoModel[100].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F, -0.2F, -0.2F, 0.5F, -0.2F, -0.2F, 0.5F, 0F, -0.5F, 0.5F, 0F); // Box 75
		br_mk2f_bsoModel[100].setRotationPoint(-37F, 3F, -8F);

		br_mk2f_bsoModel[101].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.2F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0.5F, -0.2F, -0.5F, 0.5F, -0.2F, -0.5F, 0.5F, 0F, -0.2F, 0.5F, 0F); // Box 75
		br_mk2f_bsoModel[101].setRotationPoint(-31F, 3F, -8F);

		br_mk2f_bsoModel[102].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 75
		br_mk2f_bsoModel[102].setRotationPoint(-33F, 2F, -9F);

		br_mk2f_bsoModel[103].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, -0.8F, -0.8F, -0.2F, -0.3F, -0.5F, -0.2F, -0.3F, -0.3F, 0F, -0.8F, 0F, 0F, 0F, -0.8F, -0.2F, -0.5F, -0.5F, -0.2F, -0.5F, -0.3F, 0F, 0F, 0F); // Box 75
		br_mk2f_bsoModel[103].setRotationPoint(-34F, 3F, -9F);

		br_mk2f_bsoModel[104].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.8F, -0.7F, -0.5F, 0F, -0.7F, -0.5F, 0F, -0.7F, -0.3F, -0.8F, -0.7F, -0.3F, -0.8F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.3F, -0.8F, 0.5F, -0.3F); // Box 75
		br_mk2f_bsoModel[104].setRotationPoint(-33F, 2F, -9F);

		br_mk2f_bsoModel[105].addShapeBox(0F, 0F, 0F, 19, 1, 1, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0.2F, 0F, 0.5F, 0.2F, 0F, 0.5F, 0.2F, 0F, 0.5F, 0.2F, 0F); // Box 75
		br_mk2f_bsoModel[105].setRotationPoint(-43F, 2F, 7F);

		br_mk2f_bsoModel[106].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0.2F, 0F, 0F); // Box 75
		br_mk2f_bsoModel[106].setRotationPoint(-42F, 3F, 7F);

		br_mk2f_bsoModel[107].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 75
		br_mk2f_bsoModel[107].setRotationPoint(-40F, 3F, 7F);

		br_mk2f_bsoModel[108].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, -0.4F, -0.7F, 0F, -0.4F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, -0.7F, 0F, -0.4F, -0.7F, 0F, 0F, 0F, 0F, 0F); // Box 75
		br_mk2f_bsoModel[108].setRotationPoint(-38F, 3F, 8F);
		br_mk2f_bsoModel[108].rotateAngleY = -3.14159265F;

		br_mk2f_bsoModel[109].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -0.7F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, -0.7F, 0F, 0F); // Box 75
		br_mk2f_bsoModel[109].setRotationPoint(-42F, 3F, 8F);
		br_mk2f_bsoModel[109].rotateAngleY = -3.14159265F;

		br_mk2f_bsoModel[110].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, -0.6F, 0F, 0.2F, -0.6F, 0F, 0.2F, -0.6F, 0F, 0.2F, -0.6F, 0F); // Box 75
		br_mk2f_bsoModel[110].setRotationPoint(-42F, 5F, 7F);

		br_mk2f_bsoModel[111].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.4F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, -0.4F, -0.2F, -0.6F, 0F, -0.2F, -0.6F, 0F, 0F, -0.6F, 0F); // Box 75
		br_mk2f_bsoModel[111].setRotationPoint(-38F, 5F, 8F);
		br_mk2f_bsoModel[111].rotateAngleY = -3.14159265F;

		br_mk2f_bsoModel[112].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.2F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.6F, 0F, 0F, -0.6F, -0.4F, 0F, -0.6F, 0F, -0.2F, -0.6F, 0F); // Box 75
		br_mk2f_bsoModel[112].setRotationPoint(-42F, 5F, 8F);
		br_mk2f_bsoModel[112].rotateAngleY = -3.14159265F;

		br_mk2f_bsoModel[113].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0.2F, 0F, 0F); // Box 75
		br_mk2f_bsoModel[113].setRotationPoint(-28F, 3F, 7F);

		br_mk2f_bsoModel[114].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 75
		br_mk2f_bsoModel[114].setRotationPoint(-26F, 3F, 7F);

		br_mk2f_bsoModel[115].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, -0.4F, -0.7F, 0F, -0.4F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, -0.7F, 0F, -0.4F, -0.7F, 0F, 0F, 0F, 0F, 0F); // Box 75
		br_mk2f_bsoModel[115].setRotationPoint(-24F, 3F, 8F);
		br_mk2f_bsoModel[115].rotateAngleY = -3.14159265F;

		br_mk2f_bsoModel[116].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -0.7F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, -0.7F, 0F, 0F); // Box 75
		br_mk2f_bsoModel[116].setRotationPoint(-28F, 3F, 8F);
		br_mk2f_bsoModel[116].rotateAngleY = -3.14159265F;

		br_mk2f_bsoModel[117].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, -0.6F, 0F, 0.2F, -0.6F, 0F, 0.2F, -0.6F, 0F, 0.2F, -0.6F, 0F); // Box 75
		br_mk2f_bsoModel[117].setRotationPoint(-28F, 5F, 7F);

		br_mk2f_bsoModel[118].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.4F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, -0.4F, -0.2F, -0.6F, 0F, -0.2F, -0.6F, 0F, 0F, -0.6F, 0F); // Box 75
		br_mk2f_bsoModel[118].setRotationPoint(-24F, 5F, 8F);
		br_mk2f_bsoModel[118].rotateAngleY = -3.14159265F;

		br_mk2f_bsoModel[119].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.2F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.6F, 0F, 0F, -0.6F, -0.4F, 0F, -0.6F, 0F, -0.2F, -0.6F, 0F); // Box 75
		br_mk2f_bsoModel[119].setRotationPoint(-28F, 5F, 8F);
		br_mk2f_bsoModel[119].rotateAngleY = -3.14159265F;

		br_mk2f_bsoModel[120].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F); // Box 75
		br_mk2f_bsoModel[120].setRotationPoint(-35F, 3F, 6F);

		br_mk2f_bsoModel[121].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F, 0.5F, -0.4F, 0F, 0.5F, -0.4F, 0F, 0.5F, -0.4F, 0F, 0.5F, -0.4F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 75
		br_mk2f_bsoModel[121].setRotationPoint(-36F, 4F, 6F);

		br_mk2f_bsoModel[122].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, -0.5F, -0.5F, -0.2F, -0.5F, -0.5F, -0.2F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F); // Box 75
		br_mk2f_bsoModel[122].setRotationPoint(-31F, 1F, 8F);
		br_mk2f_bsoModel[122].rotateAngleY = -3.14159265F;

		br_mk2f_bsoModel[123].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, -0.2F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -1F, 0F, -0.2F, -1F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F); // Box 75
		br_mk2f_bsoModel[123].setRotationPoint(-35F, 1F, 8F);
		br_mk2f_bsoModel[123].rotateAngleY = -3.14159265F;

		br_mk2f_bsoModel[124].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F, -0.2F, -0.2F, 0.5F, -0.2F, -0.2F, 0.5F, 0F, -0.5F, 0.5F, 0F); // Box 75
		br_mk2f_bsoModel[124].setRotationPoint(-30F, 3F, 8F);
		br_mk2f_bsoModel[124].rotateAngleY = -3.14159265F;

		br_mk2f_bsoModel[125].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.2F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0.5F, -0.2F, -0.5F, 0.5F, -0.2F, -0.5F, 0.5F, 0F, -0.2F, 0.5F, 0F); // Box 75
		br_mk2f_bsoModel[125].setRotationPoint(-36F, 3F, 8F);
		br_mk2f_bsoModel[125].rotateAngleY = -3.14159265F;

		br_mk2f_bsoModel[126].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 75
		br_mk2f_bsoModel[126].setRotationPoint(-32F, 2F, 9F);
		br_mk2f_bsoModel[126].rotateAngleY = -3.14159265F;

		br_mk2f_bsoModel[127].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, -0.3F, -0.5F, -0.2F, -0.8F, -0.8F, -0.2F, -0.8F, 0F, 0F, -0.3F, -0.3F, 0F, -0.5F, -0.5F, -0.2F, 0F, -0.8F, -0.2F, 0F, 0F, 0F, -0.5F, -0.3F); // Box 75
		br_mk2f_bsoModel[127].setRotationPoint(-32F, 3F, 9F);
		br_mk2f_bsoModel[127].rotateAngleY = -3.14159265F;

		br_mk2f_bsoModel[128].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.7F, -0.5F, -0.8F, -0.7F, -0.5F, -0.8F, -0.7F, -0.3F, 0F, -0.7F, -0.3F, 0F, 0.5F, -0.5F, -0.8F, 0.5F, -0.5F, -0.8F, 0.5F, -0.3F, 0F, 0.5F, -0.3F); // Box 75
		br_mk2f_bsoModel[128].setRotationPoint(-32F, 2F, 9F);
		br_mk2f_bsoModel[128].rotateAngleY = -3.14159265F;

		br_mk2f_bsoModel[129].addBox(0F, 0F, 0F, 5, 5, 0, 0F); // Box 70
		br_mk2f_bsoModel[129].setRotationPoint(9F, 2F, -6F);

		br_mk2f_bsoModel[130].addBox(0F, 0F, 0F, 5, 5, 0, 0F); // Box 70
		br_mk2f_bsoModel[130].setRotationPoint(9F, 2F, 6F);

		br_mk2f_bsoModel[131].addBox(0F, 0F, 0F, 5, 5, 0, 0F); // Box 70
		br_mk2f_bsoModel[131].setRotationPoint(23F, 2F, -6F);

		br_mk2f_bsoModel[132].addBox(0F, 0F, 0F, 5, 5, 0, 0F); // Box 70
		br_mk2f_bsoModel[132].setRotationPoint(23F, 2F, 6F);

		br_mk2f_bsoModel[133].addBox(0F, 0F, 0F, 1, 1, 16, 0F); // Box 74
		br_mk2f_bsoModel[133].setRotationPoint(11F, 4F, -8F);

		br_mk2f_bsoModel[134].addBox(0F, 0F, 0F, 1, 1, 16, 0F); // Box 74
		br_mk2f_bsoModel[134].setRotationPoint(25F, 4F, -8F);

		br_mk2f_bsoModel[135].addShapeBox(0F, 0F, 0F, 19, 1, 1, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0.2F, 0F, 0.5F, 0.2F, 0F, 0.5F, 0.2F, 0F, 0.5F, 0.2F, 0F); // Box 75
		br_mk2f_bsoModel[135].setRotationPoint(9F, 2F, -8F);

		br_mk2f_bsoModel[136].addShapeBox(0F, 0F, 0F, 1, 1, 16, 0F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0.2F, -0.5F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, 0F, 0.2F, -0.5F); // Box 75
		br_mk2f_bsoModel[136].setRotationPoint(8F, 2F, -8F);

		br_mk2f_bsoModel[137].addShapeBox(0F, 0F, 0F, 1, 1, 16, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0.2F, 0F, 0F, 0.2F, -0.5F, 0F, 0.2F, -0.5F, -0.5F, 0.2F, 0F); // Box 75
		br_mk2f_bsoModel[137].setRotationPoint(28F, 2F, -8F);

		br_mk2f_bsoModel[138].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0.2F, 0F, 0F); // Box 75
		br_mk2f_bsoModel[138].setRotationPoint(10F, 3F, -8F);

		br_mk2f_bsoModel[139].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 75
		br_mk2f_bsoModel[139].setRotationPoint(12F, 3F, -8F);

		br_mk2f_bsoModel[140].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, -0.4F, -0.7F, 0F, -0.4F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, -0.7F, 0F, -0.4F, -0.7F, 0F, 0F, 0F, 0F, 0F); // Box 75
		br_mk2f_bsoModel[140].setRotationPoint(9F, 3F, -8F);

		br_mk2f_bsoModel[141].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -0.7F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, -0.7F, 0F, 0F); // Box 75
		br_mk2f_bsoModel[141].setRotationPoint(13F, 3F, -8F);

		br_mk2f_bsoModel[142].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, -0.6F, 0F, 0.2F, -0.6F, 0F, 0.2F, -0.6F, 0F, 0.2F, -0.6F, 0F); // Box 75
		br_mk2f_bsoModel[142].setRotationPoint(10F, 5F, -8F);

		br_mk2f_bsoModel[143].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.4F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, -0.4F, -0.2F, -0.6F, 0F, -0.2F, -0.6F, 0F, 0F, -0.6F, 0F); // Box 75
		br_mk2f_bsoModel[143].setRotationPoint(9F, 5F, -8F);

		br_mk2f_bsoModel[144].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.2F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.6F, 0F, 0F, -0.6F, -0.4F, 0F, -0.6F, 0F, -0.2F, -0.6F, 0F); // Box 75
		br_mk2f_bsoModel[144].setRotationPoint(13F, 5F, -8F);

		br_mk2f_bsoModel[145].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0.2F, 0F, 0F); // Box 75
		br_mk2f_bsoModel[145].setRotationPoint(24F, 3F, -8F);

		br_mk2f_bsoModel[146].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 75
		br_mk2f_bsoModel[146].setRotationPoint(26F, 3F, -8F);

		br_mk2f_bsoModel[147].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, -0.4F, -0.7F, 0F, -0.4F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, -0.7F, 0F, -0.4F, -0.7F, 0F, 0F, 0F, 0F, 0F); // Box 75
		br_mk2f_bsoModel[147].setRotationPoint(23F, 3F, -8F);

		br_mk2f_bsoModel[148].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -0.7F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, -0.7F, 0F, 0F); // Box 75
		br_mk2f_bsoModel[148].setRotationPoint(27F, 3F, -8F);

		br_mk2f_bsoModel[149].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, -0.6F, 0F, 0.2F, -0.6F, 0F, 0.2F, -0.6F, 0F, 0.2F, -0.6F, 0F); // Box 75
		br_mk2f_bsoModel[149].setRotationPoint(24F, 5F, -8F);

		br_mk2f_bsoModel[150].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.4F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, -0.4F, -0.2F, -0.6F, 0F, -0.2F, -0.6F, 0F, 0F, -0.6F, 0F); // Box 75
		br_mk2f_bsoModel[150].setRotationPoint(23F, 5F, -8F);

		br_mk2f_bsoModel[151].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.2F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.6F, 0F, 0F, -0.6F, -0.4F, 0F, -0.6F, 0F, -0.2F, -0.6F, 0F); // Box 75
		br_mk2f_bsoModel[151].setRotationPoint(27F, 5F, -8F);

		br_mk2f_bsoModel[152].addShapeBox(0F, 0F, 0F, 3, 1, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 75
		br_mk2f_bsoModel[152].setRotationPoint(17F, 2F, -7F);

		br_mk2f_bsoModel[153].addBox(0F, 0F, 0F, 21, 1, 2, 0F); // Box 74
		br_mk2f_bsoModel[153].setRotationPoint(8F, 3F, -1F);

		br_mk2f_bsoModel[154].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		br_mk2f_bsoModel[154].setRotationPoint(17F, 0F, -1F);

		br_mk2f_bsoModel[155].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F); // Box 75
		br_mk2f_bsoModel[155].setRotationPoint(17F, 3F, -8F);

		br_mk2f_bsoModel[156].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F, 0.5F, -0.4F, 0F, 0.5F, -0.4F, 0F, 0.5F, -0.4F, 0F, 0.5F, -0.4F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 75
		br_mk2f_bsoModel[156].setRotationPoint(16F, 4F, -8F);

		br_mk2f_bsoModel[157].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, -0.5F, -0.5F, -0.2F, -0.5F, -0.5F, -0.2F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F); // Box 75
		br_mk2f_bsoModel[157].setRotationPoint(16F, 1F, -8F);

		br_mk2f_bsoModel[158].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, -0.2F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -1F, 0F, -0.2F, -1F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F); // Box 75
		br_mk2f_bsoModel[158].setRotationPoint(20F, 1F, -8F);

		br_mk2f_bsoModel[159].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F, -0.2F, -0.2F, 0.5F, -0.2F, -0.2F, 0.5F, 0F, -0.5F, 0.5F, 0F); // Box 75
		br_mk2f_bsoModel[159].setRotationPoint(15F, 3F, -8F);

		br_mk2f_bsoModel[160].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.2F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0.5F, -0.2F, -0.5F, 0.5F, -0.2F, -0.5F, 0.5F, 0F, -0.2F, 0.5F, 0F); // Box 75
		br_mk2f_bsoModel[160].setRotationPoint(21F, 3F, -8F);

		br_mk2f_bsoModel[161].addShapeBox(0F, 0F, 0F, 19, 1, 1, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0.2F, 0F, 0.5F, 0.2F, 0F, 0.5F, 0.2F, 0F, 0.5F, 0.2F, 0F); // Box 75
		br_mk2f_bsoModel[161].setRotationPoint(9F, 2F, 7F);

		br_mk2f_bsoModel[162].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0.2F, 0F, 0F); // Box 75
		br_mk2f_bsoModel[162].setRotationPoint(10F, 3F, 7F);

		br_mk2f_bsoModel[163].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 75
		br_mk2f_bsoModel[163].setRotationPoint(12F, 3F, 7F);

		br_mk2f_bsoModel[164].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, -0.4F, -0.7F, 0F, -0.4F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, -0.7F, 0F, -0.4F, -0.7F, 0F, 0F, 0F, 0F, 0F); // Box 75
		br_mk2f_bsoModel[164].setRotationPoint(14F, 3F, 8F);
		br_mk2f_bsoModel[164].rotateAngleY = -3.14159265F;

		br_mk2f_bsoModel[165].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -0.7F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, -0.7F, 0F, 0F); // Box 75
		br_mk2f_bsoModel[165].setRotationPoint(10F, 3F, 8F);
		br_mk2f_bsoModel[165].rotateAngleY = -3.14159265F;

		br_mk2f_bsoModel[166].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, -0.6F, 0F, 0.2F, -0.6F, 0F, 0.2F, -0.6F, 0F, 0.2F, -0.6F, 0F); // Box 75
		br_mk2f_bsoModel[166].setRotationPoint(10F, 5F, 7F);

		br_mk2f_bsoModel[167].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.4F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, -0.4F, -0.2F, -0.6F, 0F, -0.2F, -0.6F, 0F, 0F, -0.6F, 0F); // Box 75
		br_mk2f_bsoModel[167].setRotationPoint(14F, 5F, 8F);
		br_mk2f_bsoModel[167].rotateAngleY = -3.14159265F;

		br_mk2f_bsoModel[168].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.2F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.6F, 0F, 0F, -0.6F, -0.4F, 0F, -0.6F, 0F, -0.2F, -0.6F, 0F); // Box 75
		br_mk2f_bsoModel[168].setRotationPoint(10F, 5F, 8F);
		br_mk2f_bsoModel[168].rotateAngleY = -3.14159265F;

		br_mk2f_bsoModel[169].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0.2F, 0F, 0F); // Box 75
		br_mk2f_bsoModel[169].setRotationPoint(24F, 3F, 7F);

		br_mk2f_bsoModel[170].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 75
		br_mk2f_bsoModel[170].setRotationPoint(26F, 3F, 7F);

		br_mk2f_bsoModel[171].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, -0.4F, -0.7F, 0F, -0.4F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, -0.7F, 0F, -0.4F, -0.7F, 0F, 0F, 0F, 0F, 0F); // Box 75
		br_mk2f_bsoModel[171].setRotationPoint(28F, 3F, 8F);
		br_mk2f_bsoModel[171].rotateAngleY = -3.14159265F;

		br_mk2f_bsoModel[172].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -0.7F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, -0.7F, 0F, 0F); // Box 75
		br_mk2f_bsoModel[172].setRotationPoint(24F, 3F, 8F);
		br_mk2f_bsoModel[172].rotateAngleY = -3.14159265F;

		br_mk2f_bsoModel[173].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, -0.6F, 0F, 0.2F, -0.6F, 0F, 0.2F, -0.6F, 0F, 0.2F, -0.6F, 0F); // Box 75
		br_mk2f_bsoModel[173].setRotationPoint(24F, 5F, 7F);

		br_mk2f_bsoModel[174].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.4F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, -0.4F, -0.2F, -0.6F, 0F, -0.2F, -0.6F, 0F, 0F, -0.6F, 0F); // Box 75
		br_mk2f_bsoModel[174].setRotationPoint(28F, 5F, 8F);
		br_mk2f_bsoModel[174].rotateAngleY = -3.14159265F;

		br_mk2f_bsoModel[175].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.2F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.6F, 0F, 0F, -0.6F, -0.4F, 0F, -0.6F, 0F, -0.2F, -0.6F, 0F); // Box 75
		br_mk2f_bsoModel[175].setRotationPoint(24F, 5F, 8F);
		br_mk2f_bsoModel[175].rotateAngleY = -3.14159265F;

		br_mk2f_bsoModel[176].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F); // Box 75
		br_mk2f_bsoModel[176].setRotationPoint(17F, 3F, 6F);

		br_mk2f_bsoModel[177].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F, 0.5F, -0.4F, 0F, 0.5F, -0.4F, 0F, 0.5F, -0.4F, 0F, 0.5F, -0.4F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 75
		br_mk2f_bsoModel[177].setRotationPoint(16F, 4F, 6F);

		br_mk2f_bsoModel[178].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, -0.5F, -0.5F, -0.2F, -0.5F, -0.5F, -0.2F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F); // Box 75
		br_mk2f_bsoModel[178].setRotationPoint(21F, 1F, 8F);
		br_mk2f_bsoModel[178].rotateAngleY = -3.14159265F;

		br_mk2f_bsoModel[179].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, -0.2F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -1F, 0F, -0.2F, -1F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F); // Box 75
		br_mk2f_bsoModel[179].setRotationPoint(17F, 1F, 8F);
		br_mk2f_bsoModel[179].rotateAngleY = -3.14159265F;

		br_mk2f_bsoModel[180].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F, -0.2F, -0.2F, 0.5F, -0.2F, -0.2F, 0.5F, 0F, -0.5F, 0.5F, 0F); // Box 75
		br_mk2f_bsoModel[180].setRotationPoint(22F, 3F, 8F);
		br_mk2f_bsoModel[180].rotateAngleY = -3.14159265F;

		br_mk2f_bsoModel[181].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.2F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0.5F, -0.2F, -0.5F, 0.5F, -0.2F, -0.5F, 0.5F, 0F, -0.2F, 0.5F, 0F); // Box 75
		br_mk2f_bsoModel[181].setRotationPoint(16F, 3F, 8F);
		br_mk2f_bsoModel[181].rotateAngleY = -3.14159265F;

		br_mk2f_bsoModel[182].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 75
		br_mk2f_bsoModel[182].setRotationPoint(18F, 2F, 9F);
		br_mk2f_bsoModel[182].rotateAngleY = -3.14159265F;

		br_mk2f_bsoModel[183].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, -0.8F, -0.8F, -0.2F, -0.3F, -0.5F, -0.2F, -0.3F, -0.3F, 0F, -0.8F, 0F, 0F, 0F, -0.8F, -0.2F, -0.5F, -0.5F, -0.2F, -0.5F, -0.3F, 0F, 0F, 0F); // Box 75
		br_mk2f_bsoModel[183].setRotationPoint(19F, 3F, 9F);
		br_mk2f_bsoModel[183].rotateAngleY = -3.14159265F;

		br_mk2f_bsoModel[184].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.8F, -0.7F, -0.5F, 0F, -0.7F, -0.5F, 0F, -0.7F, -0.3F, -0.8F, -0.7F, -0.3F, -0.8F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.3F, -0.8F, 0.5F, -0.3F); // Box 75
		br_mk2f_bsoModel[184].setRotationPoint(18F, 2F, 9F);
		br_mk2f_bsoModel[184].rotateAngleY = -3.14159265F;

		br_mk2f_bsoModel[185].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 75
		br_mk2f_bsoModel[185].setRotationPoint(17F, 2F, -9F);

		br_mk2f_bsoModel[186].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, -0.3F, -0.5F, -0.2F, -0.8F, -0.8F, -0.2F, -0.8F, 0F, 0F, -0.3F, -0.3F, 0F, -0.5F, -0.5F, -0.2F, 0F, -0.8F, -0.2F, 0F, 0F, 0F, -0.5F, -0.3F); // Box 75
		br_mk2f_bsoModel[186].setRotationPoint(17F, 3F, -9F);

		br_mk2f_bsoModel[187].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.7F, -0.5F, -0.8F, -0.7F, -0.5F, -0.8F, -0.7F, -0.3F, 0F, -0.7F, -0.3F, 0F, 0.5F, -0.5F, -0.8F, 0.5F, -0.5F, -0.8F, 0.5F, -0.3F, 0F, 0.5F, -0.3F); // Box 75
		br_mk2f_bsoModel[187].setRotationPoint(17F, 2F, -9F);

		br_mk2f_bsoModel[188].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.4F, 0.5F, 0F, -0.4F, 0.5F, 0F, -0.4F, -0.5F, 0F, -0.4F, -0.5F); // Box 188
		br_mk2f_bsoModel[188].setRotationPoint(-51F, 2F, 0F);

		br_mk2f_bsoModel[189].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0.4F, 0.7F, -0.9F, 0.4F, 0.7F, -0.9F, 0.4F, -0.3F, 0F, 0.4F, -0.3F, 0F, 0F, 0.7F, -0.9F, 0F, 0.7F, -0.9F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 188
		br_mk2f_bsoModel[189].setRotationPoint(-51F, 2F, 0F);

		br_mk2f_bsoModel[190].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, -0.7F, -0.5F, 0.3F, -0.7F, -0.5F, -0.8F, 0.3F, 0F, -0.8F, 0.3F, 0F, -0.8F, -0.7F, -0.5F, -0.8F, -0.7F); // Box 188
		br_mk2f_bsoModel[190].setRotationPoint(-52F, 2F, 0F);

		br_mk2f_bsoModel[191].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, -0.4F, 0.3F, 0F, -0.4F, 0.3F, 0F, -0.4F, -0.7F, -0.5F, -0.4F, -0.7F, -0.5F, -0.1F, 0.3F, 0F, -0.1F, 0.3F, 0F, -0.1F, -0.7F, -0.5F, -0.1F, -0.7F); // Box 188
		br_mk2f_bsoModel[191].setRotationPoint(-52F, 2F, 0F);

		br_mk2f_bsoModel[192].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.4F, 0.5F, 0F, -0.4F, 0.5F, 0F, -0.4F, -0.5F, 0F, -0.4F, -0.5F); // Box 188
		br_mk2f_bsoModel[192].setRotationPoint(36F, 2F, 0F);
		br_mk2f_bsoModel[192].rotateAngleY = -3.14159265F;

		br_mk2f_bsoModel[193].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0.4F, 0.7F, -0.9F, 0.4F, 0.7F, -0.9F, 0.4F, -0.3F, 0F, 0.4F, -0.3F, 0F, 0F, 0.7F, -0.9F, 0F, 0.7F, -0.9F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 188
		br_mk2f_bsoModel[193].setRotationPoint(36F, 2F, 0F);
		br_mk2f_bsoModel[193].rotateAngleY = -3.14159265F;

		br_mk2f_bsoModel[194].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, -0.7F, -0.5F, 0.3F, -0.7F, -0.5F, -0.8F, 0.3F, 0F, -0.8F, 0.3F, 0F, -0.8F, -0.7F, -0.5F, -0.8F, -0.7F); // Box 188
		br_mk2f_bsoModel[194].setRotationPoint(37F, 2F, 0F);
		br_mk2f_bsoModel[194].rotateAngleY = -3.14159265F;

		br_mk2f_bsoModel[195].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, -0.4F, 0.3F, 0F, -0.4F, 0.3F, 0F, -0.4F, -0.7F, -0.5F, -0.4F, -0.7F, -0.5F, -0.1F, 0.3F, 0F, -0.1F, 0.3F, 0F, -0.1F, -0.7F, -0.5F, -0.1F, -0.7F); // Box 188
		br_mk2f_bsoModel[195].setRotationPoint(37F, 2F, 0F);
		br_mk2f_bsoModel[195].rotateAngleY = -3.14159265F;

		br_mk2f_bsoModel[196].addBox(0F, 0F, 0F, 4, 4, 4, 0F); // Box 197
		br_mk2f_bsoModel[196].setRotationPoint(2F, 1F, 4F);

		br_mk2f_bsoModel[197].addShapeBox(0F, 0F, 0F, 5, 2, 2, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F); // Box 198
		br_mk2f_bsoModel[197].setRotationPoint(-22F, 2F, -8F);

		br_mk2f_bsoModel[198].addShapeBox(0F, 0F, 0F, 4, 5, 3, 0F, 0F, -0.1F, -0.5F, 0F, -0.1F, -0.5F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 198
		br_mk2f_bsoModel[198].setRotationPoint(2F, 0F, -9F);

		br_mk2f_bsoModel[199].addShapeBox(0F, 0F, 0F, 5, 5, 3, 0F, -0.5F, -0.1F, 0F, 0.5F, -0.1F, 0F, 0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 198
		br_mk2f_bsoModel[199].setRotationPoint(-4F, 0F, -9F);

		br_mk2f_bsoModel[200].addShapeBox(0F, 0F, 0F, 3, 5, 3, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 198
		br_mk2f_bsoModel[200].setRotationPoint(-16F, 0F, -9F);

		br_mk2f_bsoModel[201].addShapeBox(0F, 0F, 0F, 3, 5, 3, 0F, 0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, 0.5F, -0.1F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 198
		br_mk2f_bsoModel[201].setRotationPoint(-12F, 0F, -9F);

		br_mk2f_bsoModel[202].addShapeBox(0F, 0F, 0F, 5, 2, 2, 0F, 0F, 0.7F, 0F, 0F, 0.7F, 0F, 0F, 0.7F, 0F, 0F, 0.7F, 0F, 0F, -1.4F, -0.5F, 0F, -1.4F, -0.5F, 0F, -1.4F, -0.5F, 0F, -1.4F, -0.5F); // Box 198
		br_mk2f_bsoModel[202].setRotationPoint(-22F, 4F, -8F);

		br_mk2f_bsoModel[203].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 198
		br_mk2f_bsoModel[203].setRotationPoint(-21F, 0F, -7F);

		br_mk2f_bsoModel[204].addShapeBox(0F, 0F, 0F, 4, 2, 3, 0F, -0.5F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, -0.5F, 0F, -0.7F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 198
		br_mk2f_bsoModel[204].setRotationPoint(-2F, 1F, 8F);
		br_mk2f_bsoModel[204].rotateAngleY = -1.57079633F;

		br_mk2f_bsoModel[205].addShapeBox(0F, 0F, 0F, 4, 2, 3, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, -0.5F, 0F, -0.7F); // Box 198
		br_mk2f_bsoModel[205].setRotationPoint(-2F, 3F, 8F);
		br_mk2f_bsoModel[205].rotateAngleY = -1.57079633F;

		br_mk2f_bsoModel[206].addBox(0F, 0F, 0F, 3, 3, 4, 0F); // Box 197
		br_mk2f_bsoModel[206].setRotationPoint(-6F, 1F, 5F);

		br_mk2f_bsoModel[207].addShapeBox(0F, 0F, 0F, 5, 5, 5, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 197
		br_mk2f_bsoModel[207].setRotationPoint(-18F, 0F, 3F);

		br_mk2f_bsoModel[208].addBox(0F, 0F, 0F, 3, 4, 4, 0F); // Box 197
		br_mk2f_bsoModel[208].setRotationPoint(-12F, 1F, 5F);

		br_mk2f_bsoModel[209].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 197
		br_mk2f_bsoModel[209].setRotationPoint(-8F, 1F, 4F);

		br_mk2f_bsoModel[210].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 198
		br_mk2f_bsoModel[210].setRotationPoint(-11F, 0F, 6F);

		br_mk2f_bsoModel[211].addShapeBox(0F, 0F, 0F, 11, 3, 10, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 198
		br_mk2f_bsoModel[211].setRotationPoint(-5F, 0F, -6F);

		br_mk2f_bsoModel[212].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 198
		br_mk2f_bsoModel[212].setRotationPoint(-47F, 0F, -8F);

		br_mk2f_bsoModel[213].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 198
		br_mk2f_bsoModel[213].setRotationPoint(-21F, 0F, 6F);

		br_mk2f_bsoModel[214].addShapeBox(0F, 0F, 0F, 1, 3, 22, 0F, 0F, 0F, -0.1F, -0.9F, 0F, -0.1F, -0.9F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.5F, -0.9F, 0F, -0.5F, -0.9F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 74
		br_mk2f_bsoModel[214].setRotationPoint(-42F, -3F, -11F);

		br_mk2f_bsoModel[215].addShapeBox(0F, 0F, 0F, 1, 14, 22, 0F, 0F, 0F, -0.1F, -0.9F, 0F, -0.1F, -0.9F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, -0.9F, 0F, -0.1F, -0.9F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 74
		br_mk2f_bsoModel[215].setRotationPoint(-42F, -17F, -11F);

		br_mk2f_bsoModel[216].addShapeBox(0F, 0F, 0F, 1, 1, 22, 0F, 0F, -0.1F, -1F, -0.9F, -0.1F, -1F, -0.9F, -0.1F, -1F, 0F, -0.1F, -1F, 0F, 0F, -0.1F, -0.9F, 0F, -0.1F, -0.9F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 74
		br_mk2f_bsoModel[216].setRotationPoint(-42F, -18F, -11F);

		br_mk2f_bsoModel[217].addShapeBox(0F, 0F, 0F, 1, 2, 20, 0F, 0F, -0.1F, -3F, -0.9F, -0.1F, -3F, -0.9F, -0.1F, -3F, 0F, -0.1F, -3F, 0F, 0.1F, 0F, -0.9F, 0.1F, 0F, -0.9F, 0.1F, 0F, 0F, 0.1F, 0F); // Box 74
		br_mk2f_bsoModel[217].setRotationPoint(-42F, -20F, -10F);

		br_mk2f_bsoModel[218].addShapeBox(0F, 0F, 0F, 1, 2, 14, 0F, 0F, -0.1F, -5F, -0.9F, -0.1F, -5F, -0.9F, -0.1F, -5F, 0F, -0.1F, -5F, 0F, 0.1F, 0F, -0.9F, 0.1F, 0F, -0.9F, 0.1F, 0F, 0F, 0.1F, 0F); // Box 74
		br_mk2f_bsoModel[218].setRotationPoint(-42F, -22F, -7F);

		br_mk2f_bsoModel[219].addShapeBox(0F, 0F, 0F, 1, 3, 22, 0F, 0F, 0F, -0.1F, -0.9F, 0F, -0.1F, -0.9F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.5F, -0.9F, 0F, -0.5F, -0.9F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 74
		br_mk2f_bsoModel[219].setRotationPoint(3F, -3F, 11F);
		br_mk2f_bsoModel[219].rotateAngleY = -3.14159265F;

		br_mk2f_bsoModel[220].addShapeBox(0F, 0F, 0F, 1, 14, 22, 0F, 0F, 0F, -0.1F, -0.9F, 0F, -0.1F, -0.9F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, -0.9F, 0F, -0.1F, -0.9F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 74
		br_mk2f_bsoModel[220].setRotationPoint(3F, -17F, 11F);
		br_mk2f_bsoModel[220].rotateAngleY = -3.14159265F;

		br_mk2f_bsoModel[221].addShapeBox(0F, 0F, 0F, 1, 1, 22, 0F, 0F, -0.1F, -1F, -0.9F, -0.1F, -1F, -0.9F, -0.1F, -1F, 0F, -0.1F, -1F, 0F, 0F, -0.1F, -0.9F, 0F, -0.1F, -0.9F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 74
		br_mk2f_bsoModel[221].setRotationPoint(3F, -18F, 11F);
		br_mk2f_bsoModel[221].rotateAngleY = -3.14159265F;

		br_mk2f_bsoModel[222].addShapeBox(0F, 0F, 0F, 1, 2, 20, 0F, 0F, -0.1F, -3F, -0.9F, -0.1F, -3F, -0.9F, -0.1F, -3F, 0F, -0.1F, -3F, 0F, 0.1F, 0F, -0.9F, 0.1F, 0F, -0.9F, 0.1F, 0F, 0F, 0.1F, 0F); // Box 74
		br_mk2f_bsoModel[222].setRotationPoint(3F, -20F, 10F);
		br_mk2f_bsoModel[222].rotateAngleY = -3.14159265F;

		br_mk2f_bsoModel[223].addShapeBox(0F, 0F, 0F, 1, 2, 14, 0F, 0F, -0.1F, -5F, -0.9F, -0.1F, -5F, -0.9F, -0.1F, -5F, 0F, -0.1F, -5F, 0F, 0.1F, 0F, -0.9F, 0.1F, 0F, -0.9F, 0.1F, 0F, 0F, 0.1F, 0F); // Box 74
		br_mk2f_bsoModel[223].setRotationPoint(3F, -22F, 7F);
		br_mk2f_bsoModel[223].rotateAngleY = -3.14159265F;

		br_mk2f_bsoModel[224].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F); // Box 198
		br_mk2f_bsoModel[224].setRotationPoint(-49F, 2F, 7F);

		br_mk2f_bsoModel[225].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F); // Box 198
		br_mk2f_bsoModel[225].setRotationPoint(34F, 2F, -7F);
		br_mk2f_bsoModel[225].rotateAngleY = -3.14159265F;

		br_mk2f_bsoModel[226].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 198
		br_mk2f_bsoModel[226].setRotationPoint(30F, 0F, 7F);

		br_mk2f_bsoModel[227].addShapeBox(0F, 0F, 0F, 69, 1, 14, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 198
		br_mk2f_bsoModel[227].setRotationPoint(-42F, -21F, -7F);

		br_mk2f_bsoModel[228].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 198
		br_mk2f_bsoModel[228].setRotationPoint(-36F, -3F, -9F);

		br_mk2f_bsoModel[229].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 198
		br_mk2f_bsoModel[229].setRotationPoint(-36F, -3F, -6F);

		br_mk2f_bsoModel[230].addShapeBox(0F, 0F, 0F, 4, 1, 8, 0F, 0F, 0F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 198
		br_mk2f_bsoModel[230].setRotationPoint(-38F, -4F, -11F);

		br_mk2f_bsoModel[231].addShapeBox(0F, 0F, 0F, 1, 7, 8, 0F, -1F, 0F, -0.3F, 0.5F, 0F, -0.3F, 0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 198
		br_mk2f_bsoModel[231].setRotationPoint(-34F, -10F, -11F);

		br_mk2f_bsoModel[232].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 198
		br_mk2f_bsoModel[232].setRotationPoint(-36F, -3F, 5F);

		br_mk2f_bsoModel[233].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 198
		br_mk2f_bsoModel[233].setRotationPoint(-36F, -3F, 8F);

		br_mk2f_bsoModel[234].addShapeBox(0F, 0F, 0F, 4, 1, 8, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 198
		br_mk2f_bsoModel[234].setRotationPoint(-38F, -4F, 3F);

		br_mk2f_bsoModel[235].addShapeBox(0F, 0F, 0F, 1, 7, 8, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.3F, -1F, 0F, -0.3F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 198
		br_mk2f_bsoModel[235].setRotationPoint(-34F, -10F, 3F);

		br_mk2f_bsoModel[236].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 198
		br_mk2f_bsoModel[236].setRotationPoint(-27F, -3F, -9F);

		br_mk2f_bsoModel[237].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 198
		br_mk2f_bsoModel[237].setRotationPoint(-27F, -3F, -6F);

		br_mk2f_bsoModel[238].addShapeBox(0F, 0F, 0F, 4, 1, 8, 0F, 0F, 0F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 198
		br_mk2f_bsoModel[238].setRotationPoint(-29F, -4F, -11F);

		br_mk2f_bsoModel[239].addShapeBox(0F, 0F, 0F, 1, 7, 8, 0F, -1F, 0F, -0.3F, 0.5F, 0F, -0.3F, 0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 198
		br_mk2f_bsoModel[239].setRotationPoint(-25F, -10F, -11F);

		br_mk2f_bsoModel[240].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 198
		br_mk2f_bsoModel[240].setRotationPoint(-27F, -3F, 5F);

		br_mk2f_bsoModel[241].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 198
		br_mk2f_bsoModel[241].setRotationPoint(-27F, -3F, 8F);

		br_mk2f_bsoModel[242].addShapeBox(0F, 0F, 0F, 4, 1, 8, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 198
		br_mk2f_bsoModel[242].setRotationPoint(-29F, -4F, 3F);

		br_mk2f_bsoModel[243].addShapeBox(0F, 0F, 0F, 1, 7, 8, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.3F, -1F, 0F, -0.3F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 198
		br_mk2f_bsoModel[243].setRotationPoint(-25F, -10F, 3F);

		br_mk2f_bsoModel[244].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 198
		br_mk2f_bsoModel[244].setRotationPoint(-18F, -3F, -9F);

		br_mk2f_bsoModel[245].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 198
		br_mk2f_bsoModel[245].setRotationPoint(-18F, -3F, -6F);

		br_mk2f_bsoModel[246].addShapeBox(0F, 0F, 0F, 4, 1, 8, 0F, 0F, 0F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 198
		br_mk2f_bsoModel[246].setRotationPoint(-20F, -4F, -11F);

		br_mk2f_bsoModel[247].addShapeBox(0F, 0F, 0F, 1, 7, 8, 0F, -1F, 0F, -0.3F, 0.5F, 0F, -0.3F, 0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 198
		br_mk2f_bsoModel[247].setRotationPoint(-16F, -10F, -11F);

		br_mk2f_bsoModel[248].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 198
		br_mk2f_bsoModel[248].setRotationPoint(-18F, -3F, 5F);

		br_mk2f_bsoModel[249].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 198
		br_mk2f_bsoModel[249].setRotationPoint(-18F, -3F, 8F);

		br_mk2f_bsoModel[250].addShapeBox(0F, 0F, 0F, 4, 1, 8, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 198
		br_mk2f_bsoModel[250].setRotationPoint(-20F, -4F, 3F);

		br_mk2f_bsoModel[251].addShapeBox(0F, 0F, 0F, 1, 7, 8, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.3F, -1F, 0F, -0.3F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 198
		br_mk2f_bsoModel[251].setRotationPoint(-16F, -10F, 3F);

		br_mk2f_bsoModel[252].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 198
		br_mk2f_bsoModel[252].setRotationPoint(-9F, -3F, -9F);

		br_mk2f_bsoModel[253].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 198
		br_mk2f_bsoModel[253].setRotationPoint(-9F, -3F, -6F);

		br_mk2f_bsoModel[254].addShapeBox(0F, 0F, 0F, 4, 1, 8, 0F, 0F, 0F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 198
		br_mk2f_bsoModel[254].setRotationPoint(-11F, -4F, -11F);

		br_mk2f_bsoModel[255].addShapeBox(0F, 0F, 0F, 1, 7, 8, 0F, -1F, 0F, -0.3F, 0.5F, 0F, -0.3F, 0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 198
		br_mk2f_bsoModel[255].setRotationPoint(-7F, -10F, -11F);

		br_mk2f_bsoModel[256].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 198
		br_mk2f_bsoModel[256].setRotationPoint(-9F, -3F, 5F);

		br_mk2f_bsoModel[257].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 198
		br_mk2f_bsoModel[257].setRotationPoint(-9F, -3F, 8F);

		br_mk2f_bsoModel[258].addShapeBox(0F, 0F, 0F, 4, 1, 8, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 198
		br_mk2f_bsoModel[258].setRotationPoint(-11F, -4F, 3F);

		br_mk2f_bsoModel[259].addShapeBox(0F, 0F, 0F, 1, 7, 8, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.3F, -1F, 0F, -0.3F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 198
		br_mk2f_bsoModel[259].setRotationPoint(-7F, -10F, 3F);

		br_mk2f_bsoModel[260].addShapeBox(0F, 0F, 0F, 45, 1, 3, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 198
		br_mk2f_bsoModel[260].setRotationPoint(-42F, -16F, -11F);

		br_mk2f_bsoModel[261].addShapeBox(0F, 0F, 0F, 45, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 198
		br_mk2f_bsoModel[261].setRotationPoint(-42F, -16F, 8F);

		br_mk2f_bsoModel[262].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F); // Box 198
		br_mk2f_bsoModel[262].setRotationPoint(-44F, 1F, -9F);

		br_mk2f_bsoModel[263].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F); // Box 198
		br_mk2f_bsoModel[263].setRotationPoint(24F, 1F, 7F);

		br_mk2f_bsoModel[264].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 75
		br_mk2f_bsoModel[264].setRotationPoint(-33F, 3F, 8F);
		br_mk2f_bsoModel[264].rotateAngleY = -3.14159265F;

		br_mk2f_bsoModel[265].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 75
		br_mk2f_bsoModel[265].setRotationPoint(19F, 3F, 8F);
		br_mk2f_bsoModel[265].rotateAngleY = -3.14159265F;

		br_mk2f_bsoModel[266].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 75
		br_mk2f_bsoModel[266].setRotationPoint(18F, 3F, -8F);


	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		for(int i = 0; i < 267; i++)
		{
			br_mk2f_bsoModel[i].render(f5);
		}
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
	{
	}

	public ModelRendererTurbo br_mk2f_bsoModel[];
}