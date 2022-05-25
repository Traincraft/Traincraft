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

public class ModelBR_MK2F_Coach extends ModelBase
{
	int textureX = 512;
	int textureY = 512;

	public ModelBR_MK2F_Coach()
	{
		br_mk2f_coachModel = new ModelRendererTurbo[291];
		br_mk2f_coachModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		br_mk2f_coachModel[1] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 1
		br_mk2f_coachModel[2] = new ModelRendererTurbo(this, 185, 9, textureX, textureY); // Box 2
		br_mk2f_coachModel[3] = new ModelRendererTurbo(this, 209, 17, textureX, textureY); // Box 3
		br_mk2f_coachModel[4] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 4
		br_mk2f_coachModel[5] = new ModelRendererTurbo(this, 169, 33, textureX, textureY); // Box 5
		br_mk2f_coachModel[6] = new ModelRendererTurbo(this, 337, 33, textureX, textureY); // Box 6
		br_mk2f_coachModel[7] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 7
		br_mk2f_coachModel[8] = new ModelRendererTurbo(this, 169, 41, textureX, textureY); // Box 8
		br_mk2f_coachModel[9] = new ModelRendererTurbo(this, 337, 41, textureX, textureY); // Box 9
		br_mk2f_coachModel[10] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 10
		br_mk2f_coachModel[11] = new ModelRendererTurbo(this, 177, 49, textureX, textureY); // Box 11
		br_mk2f_coachModel[12] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 12
		br_mk2f_coachModel[13] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 13
		br_mk2f_coachModel[14] = new ModelRendererTurbo(this, 329, 49, textureX, textureY); // Box 14
		br_mk2f_coachModel[15] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 15
		br_mk2f_coachModel[16] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 16
		br_mk2f_coachModel[17] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 17
		br_mk2f_coachModel[18] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 17
		br_mk2f_coachModel[19] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 17
		br_mk2f_coachModel[20] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 17
		br_mk2f_coachModel[21] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 17
		br_mk2f_coachModel[22] = new ModelRendererTurbo(this, 457, 9, textureX, textureY); // Box 22
		br_mk2f_coachModel[23] = new ModelRendererTurbo(this, 377, 49, textureX, textureY); // Box 23
		br_mk2f_coachModel[24] = new ModelRendererTurbo(this, 425, 49, textureX, textureY); // Box 24
		br_mk2f_coachModel[25] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 25
		br_mk2f_coachModel[26] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 26
		br_mk2f_coachModel[27] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 26
		br_mk2f_coachModel[28] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 28
		br_mk2f_coachModel[29] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 28
		br_mk2f_coachModel[30] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 28
		br_mk2f_coachModel[31] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 28
		br_mk2f_coachModel[32] = new ModelRendererTurbo(this, 377, 9, textureX, textureY); // Box 28
		br_mk2f_coachModel[33] = new ModelRendererTurbo(this, 481, 17, textureX, textureY); // Box 33
		br_mk2f_coachModel[34] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 33
		br_mk2f_coachModel[35] = new ModelRendererTurbo(this, 505, 25, textureX, textureY); // Box 33
		br_mk2f_coachModel[36] = new ModelRendererTurbo(this, 361, 49, textureX, textureY); // Box 33
		br_mk2f_coachModel[37] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 33
		br_mk2f_coachModel[38] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 33
		br_mk2f_coachModel[39] = new ModelRendererTurbo(this, 353, 9, textureX, textureY); // Box 33
		br_mk2f_coachModel[40] = new ModelRendererTurbo(this, 361, 9, textureX, textureY); // Box 33
		br_mk2f_coachModel[41] = new ModelRendererTurbo(this, 345, 49, textureX, textureY); // Box 33
		br_mk2f_coachModel[42] = new ModelRendererTurbo(this, 385, 49, textureX, textureY); // Box 33
		br_mk2f_coachModel[43] = new ModelRendererTurbo(this, 369, 9, textureX, textureY); // Box 33
		br_mk2f_coachModel[44] = new ModelRendererTurbo(this, 457, 9, textureX, textureY); // Box 33
		br_mk2f_coachModel[45] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 33
		br_mk2f_coachModel[46] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 33
		br_mk2f_coachModel[47] = new ModelRendererTurbo(this, 409, 49, textureX, textureY); // Box 33
		br_mk2f_coachModel[48] = new ModelRendererTurbo(this, 433, 49, textureX, textureY); // Box 33
		br_mk2f_coachModel[49] = new ModelRendererTurbo(this, 457, 49, textureX, textureY); // Box 33
		br_mk2f_coachModel[50] = new ModelRendererTurbo(this, 465, 49, textureX, textureY); // Box 33
		br_mk2f_coachModel[51] = new ModelRendererTurbo(this, 465, 9, textureX, textureY); // Box 33
		br_mk2f_coachModel[52] = new ModelRendererTurbo(this, 481, 9, textureX, textureY); // Box 33
		br_mk2f_coachModel[53] = new ModelRendererTurbo(this, 185, 17, textureX, textureY); // Box 33
		br_mk2f_coachModel[54] = new ModelRendererTurbo(this, 193, 17, textureX, textureY); // Box 33
		br_mk2f_coachModel[55] = new ModelRendererTurbo(this, 393, 49, textureX, textureY); // Box 33
		br_mk2f_coachModel[56] = new ModelRendererTurbo(this, 441, 49, textureX, textureY); // Box 33
		br_mk2f_coachModel[57] = new ModelRendererTurbo(this, 201, 17, textureX, textureY); // Box 33
		br_mk2f_coachModel[58] = new ModelRendererTurbo(this, 401, 17, textureX, textureY); // Box 33
		br_mk2f_coachModel[59] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 33
		br_mk2f_coachModel[60] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 33
		br_mk2f_coachModel[61] = new ModelRendererTurbo(this, 409, 17, textureX, textureY); // Box 61
		br_mk2f_coachModel[62] = new ModelRendererTurbo(this, 417, 17, textureX, textureY); // Box 61
		br_mk2f_coachModel[63] = new ModelRendererTurbo(this, 425, 17, textureX, textureY); // Box 61
		br_mk2f_coachModel[64] = new ModelRendererTurbo(this, 457, 17, textureX, textureY); // Box 61
		br_mk2f_coachModel[65] = new ModelRendererTurbo(this, 433, 17, textureX, textureY); // Box 61
		br_mk2f_coachModel[66] = new ModelRendererTurbo(this, 441, 17, textureX, textureY); // Box 61
		br_mk2f_coachModel[67] = new ModelRendererTurbo(this, 169, 25, textureX, textureY); // Box 61
		br_mk2f_coachModel[68] = new ModelRendererTurbo(this, 185, 25, textureX, textureY); // Box 61
		br_mk2f_coachModel[69] = new ModelRendererTurbo(this, 377, 25, textureX, textureY); // Box 70
		br_mk2f_coachModel[70] = new ModelRendererTurbo(this, 393, 25, textureX, textureY); // Box 70
		br_mk2f_coachModel[71] = new ModelRendererTurbo(this, 409, 25, textureX, textureY); // Box 70
		br_mk2f_coachModel[72] = new ModelRendererTurbo(this, 481, 49, textureX, textureY); // Box 70
		br_mk2f_coachModel[73] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 74
		br_mk2f_coachModel[74] = new ModelRendererTurbo(this, 41, 57, textureX, textureY); // Box 74
		br_mk2f_coachModel[75] = new ModelRendererTurbo(this, 65, 57, textureX, textureY); // Box 75
		br_mk2f_coachModel[76] = new ModelRendererTurbo(this, 97, 57, textureX, textureY); // Box 75
		br_mk2f_coachModel[77] = new ModelRendererTurbo(this, 137, 57, textureX, textureY); // Box 75
		br_mk2f_coachModel[78] = new ModelRendererTurbo(this, 481, 17, textureX, textureY); // Box 75
		br_mk2f_coachModel[79] = new ModelRendererTurbo(this, 497, 17, textureX, textureY); // Box 75
		br_mk2f_coachModel[80] = new ModelRendererTurbo(this, 201, 25, textureX, textureY); // Box 75
		br_mk2f_coachModel[81] = new ModelRendererTurbo(this, 337, 41, textureX, textureY); // Box 75
		br_mk2f_coachModel[82] = new ModelRendererTurbo(this, 465, 17, textureX, textureY); // Box 75
		br_mk2f_coachModel[83] = new ModelRendererTurbo(this, 177, 25, textureX, textureY); // Box 75
		br_mk2f_coachModel[84] = new ModelRendererTurbo(this, 193, 25, textureX, textureY); // Box 75
		br_mk2f_coachModel[85] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 75
		br_mk2f_coachModel[86] = new ModelRendererTurbo(this, 169, 49, textureX, textureY); // Box 75
		br_mk2f_coachModel[87] = new ModelRendererTurbo(this, 361, 49, textureX, textureY); // Box 75
		br_mk2f_coachModel[88] = new ModelRendererTurbo(this, 377, 49, textureX, textureY); // Box 75
		br_mk2f_coachModel[89] = new ModelRendererTurbo(this, 497, 49, textureX, textureY); // Box 75
		br_mk2f_coachModel[90] = new ModelRendererTurbo(this, 409, 49, textureX, textureY); // Box 75
		br_mk2f_coachModel[91] = new ModelRendererTurbo(this, 425, 49, textureX, textureY); // Box 75
		br_mk2f_coachModel[92] = new ModelRendererTurbo(this, 161, 57, textureX, textureY); // Box 75
		br_mk2f_coachModel[93] = new ModelRendererTurbo(this, 185, 57, textureX, textureY); // Box 74
		br_mk2f_coachModel[94] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 74
		br_mk2f_coachModel[95] = new ModelRendererTurbo(this, 25, 57, textureX, textureY); // Box 75
		br_mk2f_coachModel[96] = new ModelRendererTurbo(this, 465, 49, textureX, textureY); // Box 75
		br_mk2f_coachModel[97] = new ModelRendererTurbo(this, 41, 57, textureX, textureY); // Box 75
		br_mk2f_coachModel[98] = new ModelRendererTurbo(this, 121, 57, textureX, textureY); // Box 75
		br_mk2f_coachModel[99] = new ModelRendererTurbo(this, 129, 57, textureX, textureY); // Box 75
		br_mk2f_coachModel[100] = new ModelRendererTurbo(this, 137, 57, textureX, textureY); // Box 75
		br_mk2f_coachModel[101] = new ModelRendererTurbo(this, 145, 57, textureX, textureY); // Box 75
		br_mk2f_coachModel[102] = new ModelRendererTurbo(this, 161, 57, textureX, textureY); // Box 75
		br_mk2f_coachModel[103] = new ModelRendererTurbo(this, 233, 57, textureX, textureY); // Box 75
		br_mk2f_coachModel[104] = new ModelRendererTurbo(this, 169, 57, textureX, textureY); // Box 75
		br_mk2f_coachModel[105] = new ModelRendererTurbo(this, 241, 57, textureX, textureY); // Box 75
		br_mk2f_coachModel[106] = new ModelRendererTurbo(this, 289, 57, textureX, textureY); // Box 75
		br_mk2f_coachModel[107] = new ModelRendererTurbo(this, 297, 57, textureX, textureY); // Box 75
		br_mk2f_coachModel[108] = new ModelRendererTurbo(this, 305, 57, textureX, textureY); // Box 75
		br_mk2f_coachModel[109] = new ModelRendererTurbo(this, 313, 57, textureX, textureY); // Box 75
		br_mk2f_coachModel[110] = new ModelRendererTurbo(this, 321, 57, textureX, textureY); // Box 75
		br_mk2f_coachModel[111] = new ModelRendererTurbo(this, 337, 57, textureX, textureY); // Box 75
		br_mk2f_coachModel[112] = new ModelRendererTurbo(this, 489, 57, textureX, textureY); // Box 75
		br_mk2f_coachModel[113] = new ModelRendererTurbo(this, 497, 57, textureX, textureY); // Box 75
		br_mk2f_coachModel[114] = new ModelRendererTurbo(this, 505, 57, textureX, textureY); // Box 75
		br_mk2f_coachModel[115] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 75
		br_mk2f_coachModel[116] = new ModelRendererTurbo(this, 9, 65, textureX, textureY); // Box 75
		br_mk2f_coachModel[117] = new ModelRendererTurbo(this, 25, 65, textureX, textureY); // Box 75
		br_mk2f_coachModel[118] = new ModelRendererTurbo(this, 41, 65, textureX, textureY); // Box 75
		br_mk2f_coachModel[119] = new ModelRendererTurbo(this, 49, 65, textureX, textureY); // Box 75
		br_mk2f_coachModel[120] = new ModelRendererTurbo(this, 65, 65, textureX, textureY); // Box 75
		br_mk2f_coachModel[121] = new ModelRendererTurbo(this, 81, 65, textureX, textureY); // Box 75
		br_mk2f_coachModel[122] = new ModelRendererTurbo(this, 97, 65, textureX, textureY); // Box 75
		br_mk2f_coachModel[123] = new ModelRendererTurbo(this, 105, 65, textureX, textureY); // Box 75
		br_mk2f_coachModel[124] = new ModelRendererTurbo(this, 121, 65, textureX, textureY); // Box 75
		br_mk2f_coachModel[125] = new ModelRendererTurbo(this, 129, 65, textureX, textureY); // Box 75
		br_mk2f_coachModel[126] = new ModelRendererTurbo(this, 137, 65, textureX, textureY); // Box 75
		br_mk2f_coachModel[127] = new ModelRendererTurbo(this, 145, 65, textureX, textureY); // Box 75
		br_mk2f_coachModel[128] = new ModelRendererTurbo(this, 161, 65, textureX, textureY); // Box 75
		br_mk2f_coachModel[129] = new ModelRendererTurbo(this, 185, 65, textureX, textureY); // Box 70
		br_mk2f_coachModel[130] = new ModelRendererTurbo(this, 201, 65, textureX, textureY); // Box 70
		br_mk2f_coachModel[131] = new ModelRendererTurbo(this, 217, 65, textureX, textureY); // Box 70
		br_mk2f_coachModel[132] = new ModelRendererTurbo(this, 233, 65, textureX, textureY); // Box 70
		br_mk2f_coachModel[133] = new ModelRendererTurbo(this, 233, 65, textureX, textureY); // Box 74
		br_mk2f_coachModel[134] = new ModelRendererTurbo(this, 273, 65, textureX, textureY); // Box 74
		br_mk2f_coachModel[135] = new ModelRendererTurbo(this, 297, 65, textureX, textureY); // Box 75
		br_mk2f_coachModel[136] = new ModelRendererTurbo(this, 473, 65, textureX, textureY); // Box 75
		br_mk2f_coachModel[137] = new ModelRendererTurbo(this, 65, 73, textureX, textureY); // Box 75
		br_mk2f_coachModel[138] = new ModelRendererTurbo(this, 169, 65, textureX, textureY); // Box 75
		br_mk2f_coachModel[139] = new ModelRendererTurbo(this, 257, 65, textureX, textureY); // Box 75
		br_mk2f_coachModel[140] = new ModelRendererTurbo(this, 265, 65, textureX, textureY); // Box 75
		br_mk2f_coachModel[141] = new ModelRendererTurbo(this, 273, 65, textureX, textureY); // Box 75
		br_mk2f_coachModel[142] = new ModelRendererTurbo(this, 361, 65, textureX, textureY); // Box 75
		br_mk2f_coachModel[143] = new ModelRendererTurbo(this, 281, 65, textureX, textureY); // Box 75
		br_mk2f_coachModel[144] = new ModelRendererTurbo(this, 377, 65, textureX, textureY); // Box 75
		br_mk2f_coachModel[145] = new ModelRendererTurbo(this, 409, 65, textureX, textureY); // Box 75
		br_mk2f_coachModel[146] = new ModelRendererTurbo(this, 417, 65, textureX, textureY); // Box 75
		br_mk2f_coachModel[147] = new ModelRendererTurbo(this, 425, 65, textureX, textureY); // Box 75
		br_mk2f_coachModel[148] = new ModelRendererTurbo(this, 465, 65, textureX, textureY); // Box 75
		br_mk2f_coachModel[149] = new ModelRendererTurbo(this, 473, 65, textureX, textureY); // Box 75
		br_mk2f_coachModel[150] = new ModelRendererTurbo(this, 497, 65, textureX, textureY); // Box 75
		br_mk2f_coachModel[151] = new ModelRendererTurbo(this, 505, 65, textureX, textureY); // Box 75
		br_mk2f_coachModel[152] = new ModelRendererTurbo(this, 161, 73, textureX, textureY); // Box 75
		br_mk2f_coachModel[153] = new ModelRendererTurbo(this, 185, 73, textureX, textureY); // Box 74
		br_mk2f_coachModel[154] = new ModelRendererTurbo(this, 233, 73, textureX, textureY); // Box 74
		br_mk2f_coachModel[155] = new ModelRendererTurbo(this, 257, 73, textureX, textureY); // Box 75
		br_mk2f_coachModel[156] = new ModelRendererTurbo(this, 273, 73, textureX, textureY); // Box 75
		br_mk2f_coachModel[157] = new ModelRendererTurbo(this, 89, 73, textureX, textureY); // Box 75
		br_mk2f_coachModel[158] = new ModelRendererTurbo(this, 297, 73, textureX, textureY); // Box 75
		br_mk2f_coachModel[159] = new ModelRendererTurbo(this, 305, 73, textureX, textureY); // Box 75
		br_mk2f_coachModel[160] = new ModelRendererTurbo(this, 313, 73, textureX, textureY); // Box 75
		br_mk2f_coachModel[161] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 75
		br_mk2f_coachModel[162] = new ModelRendererTurbo(this, 321, 73, textureX, textureY); // Box 75
		br_mk2f_coachModel[163] = new ModelRendererTurbo(this, 473, 73, textureX, textureY); // Box 75
		br_mk2f_coachModel[164] = new ModelRendererTurbo(this, 481, 73, textureX, textureY); // Box 75
		br_mk2f_coachModel[165] = new ModelRendererTurbo(this, 497, 73, textureX, textureY); // Box 75
		br_mk2f_coachModel[166] = new ModelRendererTurbo(this, 49, 81, textureX, textureY); // Box 75
		br_mk2f_coachModel[167] = new ModelRendererTurbo(this, 505, 73, textureX, textureY); // Box 75
		br_mk2f_coachModel[168] = new ModelRendererTurbo(this, 65, 81, textureX, textureY); // Box 75
		br_mk2f_coachModel[169] = new ModelRendererTurbo(this, 73, 81, textureX, textureY); // Box 75
		br_mk2f_coachModel[170] = new ModelRendererTurbo(this, 89, 81, textureX, textureY); // Box 75
		br_mk2f_coachModel[171] = new ModelRendererTurbo(this, 97, 81, textureX, textureY); // Box 75
		br_mk2f_coachModel[172] = new ModelRendererTurbo(this, 105, 81, textureX, textureY); // Box 75
		br_mk2f_coachModel[173] = new ModelRendererTurbo(this, 113, 81, textureX, textureY); // Box 75
		br_mk2f_coachModel[174] = new ModelRendererTurbo(this, 129, 81, textureX, textureY); // Box 75
		br_mk2f_coachModel[175] = new ModelRendererTurbo(this, 137, 81, textureX, textureY); // Box 75
		br_mk2f_coachModel[176] = new ModelRendererTurbo(this, 145, 81, textureX, textureY); // Box 75
		br_mk2f_coachModel[177] = new ModelRendererTurbo(this, 185, 81, textureX, textureY); // Box 75
		br_mk2f_coachModel[178] = new ModelRendererTurbo(this, 161, 81, textureX, textureY); // Box 75
		br_mk2f_coachModel[179] = new ModelRendererTurbo(this, 201, 81, textureX, textureY); // Box 75
		br_mk2f_coachModel[180] = new ModelRendererTurbo(this, 169, 81, textureX, textureY); // Box 75
		br_mk2f_coachModel[181] = new ModelRendererTurbo(this, 209, 81, textureX, textureY); // Box 75
		br_mk2f_coachModel[182] = new ModelRendererTurbo(this, 217, 81, textureX, textureY); // Box 75
		br_mk2f_coachModel[183] = new ModelRendererTurbo(this, 225, 81, textureX, textureY); // Box 75
		br_mk2f_coachModel[184] = new ModelRendererTurbo(this, 313, 81, textureX, textureY); // Box 75
		br_mk2f_coachModel[185] = new ModelRendererTurbo(this, 321, 81, textureX, textureY); // Box 75
		br_mk2f_coachModel[186] = new ModelRendererTurbo(this, 377, 81, textureX, textureY); // Box 75
		br_mk2f_coachModel[187] = new ModelRendererTurbo(this, 385, 81, textureX, textureY); // Box 75
		br_mk2f_coachModel[188] = new ModelRendererTurbo(this, 393, 81, textureX, textureY); // Box 188
		br_mk2f_coachModel[189] = new ModelRendererTurbo(this, 409, 81, textureX, textureY); // Box 188
		br_mk2f_coachModel[190] = new ModelRendererTurbo(this, 417, 81, textureX, textureY); // Box 188
		br_mk2f_coachModel[191] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 188
		br_mk2f_coachModel[192] = new ModelRendererTurbo(this, 9, 89, textureX, textureY); // Box 188
		br_mk2f_coachModel[193] = new ModelRendererTurbo(this, 25, 89, textureX, textureY); // Box 188
		br_mk2f_coachModel[194] = new ModelRendererTurbo(this, 33, 89, textureX, textureY); // Box 188
		br_mk2f_coachModel[195] = new ModelRendererTurbo(this, 41, 89, textureX, textureY); // Box 188
		br_mk2f_coachModel[196] = new ModelRendererTurbo(this, 49, 89, textureX, textureY); // Box 197
		br_mk2f_coachModel[197] = new ModelRendererTurbo(this, 105, 89, textureX, textureY); // Box 198
		br_mk2f_coachModel[198] = new ModelRendererTurbo(this, 121, 89, textureX, textureY); // Box 198
		br_mk2f_coachModel[199] = new ModelRendererTurbo(this, 137, 89, textureX, textureY); // Box 198
		br_mk2f_coachModel[200] = new ModelRendererTurbo(this, 161, 89, textureX, textureY); // Box 198
		br_mk2f_coachModel[201] = new ModelRendererTurbo(this, 177, 89, textureX, textureY); // Box 198
		br_mk2f_coachModel[202] = new ModelRendererTurbo(this, 193, 89, textureX, textureY); // Box 198
		br_mk2f_coachModel[203] = new ModelRendererTurbo(this, 209, 89, textureX, textureY); // Box 198
		br_mk2f_coachModel[204] = new ModelRendererTurbo(this, 225, 89, textureX, textureY); // Box 198
		br_mk2f_coachModel[205] = new ModelRendererTurbo(this, 241, 89, textureX, textureY); // Box 198
		br_mk2f_coachModel[206] = new ModelRendererTurbo(this, 257, 89, textureX, textureY); // Box 197
		br_mk2f_coachModel[207] = new ModelRendererTurbo(this, 273, 89, textureX, textureY); // Box 197
		br_mk2f_coachModel[208] = new ModelRendererTurbo(this, 297, 89, textureX, textureY); // Box 197
		br_mk2f_coachModel[209] = new ModelRendererTurbo(this, 313, 89, textureX, textureY); // Box 197
		br_mk2f_coachModel[210] = new ModelRendererTurbo(this, 329, 89, textureX, textureY); // Box 198
		br_mk2f_coachModel[211] = new ModelRendererTurbo(this, 337, 89, textureX, textureY); // Box 198
		br_mk2f_coachModel[212] = new ModelRendererTurbo(this, 289, 89, textureX, textureY); // Box 198
		br_mk2f_coachModel[213] = new ModelRendererTurbo(this, 273, 89, textureX, textureY); // Box 198
		br_mk2f_coachModel[214] = new ModelRendererTurbo(this, 361, 89, textureX, textureY); // Box 74
		br_mk2f_coachModel[215] = new ModelRendererTurbo(this, 409, 89, textureX, textureY); // Box 74
		br_mk2f_coachModel[216] = new ModelRendererTurbo(this, 457, 89, textureX, textureY); // Box 74
		br_mk2f_coachModel[217] = new ModelRendererTurbo(this, 17, 57, textureX, textureY); // Box 74
		br_mk2f_coachModel[218] = new ModelRendererTurbo(this, 393, 89, textureX, textureY); // Box 74
		br_mk2f_coachModel[219] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 74
		br_mk2f_coachModel[220] = new ModelRendererTurbo(this, 49, 97, textureX, textureY); // Box 74
		br_mk2f_coachModel[221] = new ModelRendererTurbo(this, 169, 97, textureX, textureY); // Box 74
		br_mk2f_coachModel[222] = new ModelRendererTurbo(this, 137, 81, textureX, textureY); // Box 74
		br_mk2f_coachModel[223] = new ModelRendererTurbo(this, 441, 89, textureX, textureY); // Box 74
		br_mk2f_coachModel[224] = new ModelRendererTurbo(this, 393, 89, textureX, textureY); // Box 198
		br_mk2f_coachModel[225] = new ModelRendererTurbo(this, 417, 89, textureX, textureY); // Box 198
		br_mk2f_coachModel[226] = new ModelRendererTurbo(this, 441, 89, textureX, textureY); // Box 198
		br_mk2f_coachModel[227] = new ModelRendererTurbo(this, 89, 121, textureX, textureY); // Box 198
		br_mk2f_coachModel[228] = new ModelRendererTurbo(this, 377, 89, textureX, textureY); // Box 198
		br_mk2f_coachModel[229] = new ModelRendererTurbo(this, 449, 89, textureX, textureY); // Box 198
		br_mk2f_coachModel[230] = new ModelRendererTurbo(this, 81, 97, textureX, textureY); // Box 198
		br_mk2f_coachModel[231] = new ModelRendererTurbo(this, 489, 89, textureX, textureY); // Box 198
		br_mk2f_coachModel[232] = new ModelRendererTurbo(this, 465, 89, textureX, textureY); // Box 198
		br_mk2f_coachModel[233] = new ModelRendererTurbo(this, 473, 89, textureX, textureY); // Box 198
		br_mk2f_coachModel[234] = new ModelRendererTurbo(this, 201, 97, textureX, textureY); // Box 198
		br_mk2f_coachModel[235] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 198
		br_mk2f_coachModel[236] = new ModelRendererTurbo(this, 489, 89, textureX, textureY); // Box 198
		br_mk2f_coachModel[237] = new ModelRendererTurbo(this, 505, 89, textureX, textureY); // Box 198
		br_mk2f_coachModel[238] = new ModelRendererTurbo(this, 233, 97, textureX, textureY); // Box 198
		br_mk2f_coachModel[239] = new ModelRendererTurbo(this, 33, 97, textureX, textureY); // Box 198
		br_mk2f_coachModel[240] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 198
		br_mk2f_coachModel[241] = new ModelRendererTurbo(this, 17, 97, textureX, textureY); // Box 198
		br_mk2f_coachModel[242] = new ModelRendererTurbo(this, 305, 97, textureX, textureY); // Box 198
		br_mk2f_coachModel[243] = new ModelRendererTurbo(this, 105, 105, textureX, textureY); // Box 198
		br_mk2f_coachModel[244] = new ModelRendererTurbo(this, 33, 97, textureX, textureY); // Box 198
		br_mk2f_coachModel[245] = new ModelRendererTurbo(this, 65, 97, textureX, textureY); // Box 198
		br_mk2f_coachModel[246] = new ModelRendererTurbo(this, 129, 105, textureX, textureY); // Box 198
		br_mk2f_coachModel[247] = new ModelRendererTurbo(this, 257, 105, textureX, textureY); // Box 198
		br_mk2f_coachModel[248] = new ModelRendererTurbo(this, 81, 97, textureX, textureY); // Box 198
		br_mk2f_coachModel[249] = new ModelRendererTurbo(this, 105, 97, textureX, textureY); // Box 198
		br_mk2f_coachModel[250] = new ModelRendererTurbo(this, 161, 105, textureX, textureY); // Box 198
		br_mk2f_coachModel[251] = new ModelRendererTurbo(this, 281, 105, textureX, textureY); // Box 198
		br_mk2f_coachModel[252] = new ModelRendererTurbo(this, 113, 97, textureX, textureY); // Box 198
		br_mk2f_coachModel[253] = new ModelRendererTurbo(this, 201, 97, textureX, textureY); // Box 198
		br_mk2f_coachModel[254] = new ModelRendererTurbo(this, 329, 105, textureX, textureY); // Box 198
		br_mk2f_coachModel[255] = new ModelRendererTurbo(this, 297, 113, textureX, textureY); // Box 198
		br_mk2f_coachModel[256] = new ModelRendererTurbo(this, 225, 97, textureX, textureY); // Box 198
		br_mk2f_coachModel[257] = new ModelRendererTurbo(this, 233, 97, textureX, textureY); // Box 198
		br_mk2f_coachModel[258] = new ModelRendererTurbo(this, 457, 113, textureX, textureY); // Box 198
		br_mk2f_coachModel[259] = new ModelRendererTurbo(this, 489, 113, textureX, textureY); // Box 198
		br_mk2f_coachModel[260] = new ModelRendererTurbo(this, 257, 97, textureX, textureY); // Box 198
		br_mk2f_coachModel[261] = new ModelRendererTurbo(this, 265, 97, textureX, textureY); // Box 198
		br_mk2f_coachModel[262] = new ModelRendererTurbo(this, 249, 121, textureX, textureY); // Box 198
		br_mk2f_coachModel[263] = new ModelRendererTurbo(this, 281, 121, textureX, textureY); // Box 198
		br_mk2f_coachModel[264] = new ModelRendererTurbo(this, 329, 97, textureX, textureY); // Box 198
		br_mk2f_coachModel[265] = new ModelRendererTurbo(this, 393, 97, textureX, textureY); // Box 198
		br_mk2f_coachModel[266] = new ModelRendererTurbo(this, 313, 121, textureX, textureY); // Box 198
		br_mk2f_coachModel[267] = new ModelRendererTurbo(this, 345, 121, textureX, textureY); // Box 198
		br_mk2f_coachModel[268] = new ModelRendererTurbo(this, 401, 97, textureX, textureY); // Box 198
		br_mk2f_coachModel[269] = new ModelRendererTurbo(this, 417, 97, textureX, textureY); // Box 198
		br_mk2f_coachModel[270] = new ModelRendererTurbo(this, 369, 121, textureX, textureY); // Box 198
		br_mk2f_coachModel[271] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Box 198
		br_mk2f_coachModel[272] = new ModelRendererTurbo(this, 425, 97, textureX, textureY); // Box 198
		br_mk2f_coachModel[273] = new ModelRendererTurbo(this, 441, 97, textureX, textureY); // Box 198
		br_mk2f_coachModel[274] = new ModelRendererTurbo(this, 25, 129, textureX, textureY); // Box 198
		br_mk2f_coachModel[275] = new ModelRendererTurbo(this, 297, 129, textureX, textureY); // Box 198
		br_mk2f_coachModel[276] = new ModelRendererTurbo(this, 449, 97, textureX, textureY); // Box 198
		br_mk2f_coachModel[277] = new ModelRendererTurbo(this, 465, 97, textureX, textureY); // Box 198
		br_mk2f_coachModel[278] = new ModelRendererTurbo(this, 393, 129, textureX, textureY); // Box 198
		br_mk2f_coachModel[279] = new ModelRendererTurbo(this, 425, 129, textureX, textureY); // Box 198
		br_mk2f_coachModel[280] = new ModelRendererTurbo(this, 473, 97, textureX, textureY); // Box 198
		br_mk2f_coachModel[281] = new ModelRendererTurbo(this, 57, 105, textureX, textureY); // Box 198
		br_mk2f_coachModel[282] = new ModelRendererTurbo(this, 449, 129, textureX, textureY); // Box 198
		br_mk2f_coachModel[283] = new ModelRendererTurbo(this, 481, 129, textureX, textureY); // Box 198
		br_mk2f_coachModel[284] = new ModelRendererTurbo(this, 49, 137, textureX, textureY); // Box 198
		br_mk2f_coachModel[285] = new ModelRendererTurbo(this, 1, 145, textureX, textureY); // Box 198
		br_mk2f_coachModel[286] = new ModelRendererTurbo(this, 156, 149, textureX, textureY); // Box 198
		br_mk2f_coachModel[287] = new ModelRendererTurbo(this, 175, 148, textureX, textureY); // Box 198
		br_mk2f_coachModel[288] = new ModelRendererTurbo(this, 465, 49, textureX, textureY); // Box 75
		br_mk2f_coachModel[289] = new ModelRendererTurbo(this, 465, 49, textureX, textureY); // Box 75
		br_mk2f_coachModel[290] = new ModelRendererTurbo(this, 465, 49, textureX, textureY); // Box 75

		br_mk2f_coachModel[0].addShapeBox(0F, 0F, 0F, 81, 1, 20, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.4F, 0.4F, 0F, -0.4F, 0.4F, 0F, -0.4F, 0.4F, 0F, -0.4F, 0.4F); // Box 0
		br_mk2f_coachModel[0].setRotationPoint(-48F, 0F, -10F);

		br_mk2f_coachModel[1].addShapeBox(0F, 0F, 0F, 81, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F); // Box 1
		br_mk2f_coachModel[1].setRotationPoint(-48F, -3F, -11F);

		br_mk2f_coachModel[2].addShapeBox(0F, 0F, 0F, 81, 4, 1, 0F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 2
		br_mk2f_coachModel[2].setRotationPoint(-48F, -3F, 10F);

		br_mk2f_coachModel[3].addShapeBox(0F, 0F, 0F, 81, 14, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0F, 0F, -0.9F); // Box 3
		br_mk2f_coachModel[3].setRotationPoint(-48F, -17F, -11F);

		br_mk2f_coachModel[4].addShapeBox(0F, 0F, 0F, 81, 14, 1, 0F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
		br_mk2f_coachModel[4].setRotationPoint(-48F, -17F, 10F);

		br_mk2f_coachModel[5].addShapeBox(0F, 0F, 0F, 79, 1, 1, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0F, 0F, -0.9F); // Box 5
		br_mk2f_coachModel[5].setRotationPoint(-47F, -18F, -11F);

		br_mk2f_coachModel[6].addShapeBox(0F, 0F, 0F, 79, 1, 1, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		br_mk2f_coachModel[6].setRotationPoint(-47F, -18F, 10F);

		br_mk2f_coachModel[7].addShapeBox(0F, 0F, 0F, 79, 2, 3, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, -3F, 0F, 0.1F, -3F); // Box 7
		br_mk2f_coachModel[7].setRotationPoint(-47F, -20F, -10F);

		br_mk2f_coachModel[8].addShapeBox(0F, 0F, 0F, 79, 2, 3, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0.1F, -3F, 0F, 0.1F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		br_mk2f_coachModel[8].setRotationPoint(-47F, -20F, 7F);

		br_mk2f_coachModel[9].addShapeBox(0F, 0F, 0F, 79, 2, 5, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, -5F, 0F, 0.1F, -5F); // Box 9
		br_mk2f_coachModel[9].setRotationPoint(-47F, -22F, -7F);

		br_mk2f_coachModel[10].addShapeBox(0F, 0F, 0F, 79, 2, 5, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0.1F, -5F, 0F, 0.1F, -5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 10
		br_mk2f_coachModel[10].setRotationPoint(-47F, -22F, 2F);

		br_mk2f_coachModel[11].addShapeBox(0F, 0F, 0F, 79, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F); // Box 11
		br_mk2f_coachModel[11].setRotationPoint(-47F, -22F, -2F);

		br_mk2f_coachModel[12].addShapeBox(0F, 0F, 0F, 1, 2, 20, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F); // Box 12
		br_mk2f_coachModel[12].setRotationPoint(-49F, 0F, -10F);

		br_mk2f_coachModel[13].addShapeBox(0F, 0F, 0F, 1, 4, 22, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.5F, -1.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -1.5F); // Box 13
		br_mk2f_coachModel[13].setRotationPoint(-49F, -3F, -11F);

		br_mk2f_coachModel[14].addShapeBox(0F, 0F, 0F, 1, 14, 22, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 14
		br_mk2f_coachModel[14].setRotationPoint(-49F, -17F, -11F);

		br_mk2f_coachModel[15].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -2F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		br_mk2f_coachModel[15].setRotationPoint(-49F, -18F, -11F);

		br_mk2f_coachModel[16].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -2F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 16
		br_mk2f_coachModel[16].setRotationPoint(-49F, -18F, 10F);

		br_mk2f_coachModel[17].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F, -2F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		br_mk2f_coachModel[17].setRotationPoint(-49F, -20F, -10F);

		br_mk2f_coachModel[18].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		br_mk2f_coachModel[18].setRotationPoint(-49F, -20F, 7F);

		br_mk2f_coachModel[19].addShapeBox(0F, 0F, 0F, 2, 5, 5, 0F, -2F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		br_mk2f_coachModel[19].setRotationPoint(-49F, -22F, -7F);

		br_mk2f_coachModel[20].addShapeBox(0F, 0F, 0F, 2, 5, 5, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		br_mk2f_coachModel[20].setRotationPoint(-49F, -22F, 2F);

		br_mk2f_coachModel[21].addShapeBox(0F, 0F, 0F, 2, 5, 4, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		br_mk2f_coachModel[21].setRotationPoint(-49F, -22F, -2F);

		br_mk2f_coachModel[22].addShapeBox(0F, 0F, 0F, 1, 2, 20, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F); // Box 22
		br_mk2f_coachModel[22].setRotationPoint(33F, 0F, -10F);

		br_mk2f_coachModel[23].addShapeBox(0F, 0F, 0F, 1, 4, 22, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, -0.5F); // Box 23
		br_mk2f_coachModel[23].setRotationPoint(33F, -3F, -11F);

		br_mk2f_coachModel[24].addShapeBox(0F, 0F, 0F, 1, 14, 22, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 24
		br_mk2f_coachModel[24].setRotationPoint(33F, -17F, -11F);

		br_mk2f_coachModel[25].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25
		br_mk2f_coachModel[25].setRotationPoint(32F, -18F, -11F);

		br_mk2f_coachModel[26].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		br_mk2f_coachModel[26].setRotationPoint(32F, -18F, 10F);

		br_mk2f_coachModel[27].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 26
		br_mk2f_coachModel[27].setRotationPoint(33F, -18F, 10F);

		br_mk2f_coachModel[28].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F, 0F, -2F, 0F, -2F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 28
		br_mk2f_coachModel[28].setRotationPoint(32F, -20F, -10F);

		br_mk2f_coachModel[29].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 28
		br_mk2f_coachModel[29].setRotationPoint(32F, -20F, 7F);

		br_mk2f_coachModel[30].addShapeBox(0F, 0F, 0F, 2, 5, 5, 0F, 0F, -2F, 0F, -2F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 28
		br_mk2f_coachModel[30].setRotationPoint(32F, -22F, -7F);

		br_mk2f_coachModel[31].addShapeBox(0F, 0F, 0F, 2, 5, 5, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 28
		br_mk2f_coachModel[31].setRotationPoint(32F, -22F, 2F);

		br_mk2f_coachModel[32].addShapeBox(0F, 0F, 0F, 2, 5, 4, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 28
		br_mk2f_coachModel[32].setRotationPoint(32F, -22F, -2F);

		br_mk2f_coachModel[33].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 33
		br_mk2f_coachModel[33].setRotationPoint(-51F, 0F, -4F);

		br_mk2f_coachModel[34].addShapeBox(0F, 0F, 0F, 2, 18, 1, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 33
		br_mk2f_coachModel[34].setRotationPoint(-51F, -18F, -5F);

		br_mk2f_coachModel[35].addShapeBox(0F, 0F, 0F, 2, 18, 1, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 33
		br_mk2f_coachModel[35].setRotationPoint(-51F, -18F, 4F);

		br_mk2f_coachModel[36].addShapeBox(0F, 0F, 0F, 3, 2, 8, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 33
		br_mk2f_coachModel[36].setRotationPoint(-51F, -19F, -4F);

		br_mk2f_coachModel[37].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 33
		br_mk2f_coachModel[37].setRotationPoint(-51F, -19F, -5F);

		br_mk2f_coachModel[38].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 33
		br_mk2f_coachModel[38].setRotationPoint(-51F, -19F, 4F);

		br_mk2f_coachModel[39].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 33
		br_mk2f_coachModel[39].setRotationPoint(-51F, 0F, -5F);

		br_mk2f_coachModel[40].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F); // Box 33
		br_mk2f_coachModel[40].setRotationPoint(-51F, 0F, 4F);

		br_mk2f_coachModel[41].addShapeBox(0F, 0F, 0F, 1, 18, 1, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 33
		br_mk2f_coachModel[41].setRotationPoint(-50F, -18F, -5F);

		br_mk2f_coachModel[42].addShapeBox(0F, 0F, 0F, 1, 18, 1, 0F, -0.5F, 0F, 0F, 0.7F, 0F, 0F, 0.7F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 33
		br_mk2f_coachModel[42].setRotationPoint(-50F, -18F, 4F);

		br_mk2f_coachModel[43].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 33
		br_mk2f_coachModel[43].setRotationPoint(-50F, -19F, -5F);

		br_mk2f_coachModel[44].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -0.5F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 33
		br_mk2f_coachModel[44].setRotationPoint(-50F, -19F, 4F);

		br_mk2f_coachModel[45].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 33
		br_mk2f_coachModel[45].setRotationPoint(-50F, 0F, -5F);

		br_mk2f_coachModel[46].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F); // Box 33
		br_mk2f_coachModel[46].setRotationPoint(-50F, 0F, 4F);

		br_mk2f_coachModel[47].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 33
		br_mk2f_coachModel[47].setRotationPoint(36F, 0F, 4F);
		br_mk2f_coachModel[47].rotateAngleY = -3.14159265F;

		br_mk2f_coachModel[48].addShapeBox(0F, 0F, 0F, 2, 18, 1, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 33
		br_mk2f_coachModel[48].setRotationPoint(36F, -18F, 5F);
		br_mk2f_coachModel[48].rotateAngleY = -3.14159265F;

		br_mk2f_coachModel[49].addShapeBox(0F, 0F, 0F, 2, 18, 1, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 33
		br_mk2f_coachModel[49].setRotationPoint(36F, -18F, -4F);
		br_mk2f_coachModel[49].rotateAngleY = -3.14159265F;

		br_mk2f_coachModel[50].addShapeBox(0F, 0F, 0F, 3, 2, 8, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 33
		br_mk2f_coachModel[50].setRotationPoint(36F, -19F, 4F);
		br_mk2f_coachModel[50].rotateAngleY = -3.14159265F;

		br_mk2f_coachModel[51].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 33
		br_mk2f_coachModel[51].setRotationPoint(36F, -19F, 5F);
		br_mk2f_coachModel[51].rotateAngleY = -3.14159265F;

		br_mk2f_coachModel[52].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 33
		br_mk2f_coachModel[52].setRotationPoint(36F, -19F, -4F);
		br_mk2f_coachModel[52].rotateAngleY = -3.14159265F;

		br_mk2f_coachModel[53].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 33
		br_mk2f_coachModel[53].setRotationPoint(36F, 0F, 5F);
		br_mk2f_coachModel[53].rotateAngleY = -3.14159265F;

		br_mk2f_coachModel[54].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F); // Box 33
		br_mk2f_coachModel[54].setRotationPoint(36F, 0F, -4F);
		br_mk2f_coachModel[54].rotateAngleY = -3.14159265F;

		br_mk2f_coachModel[55].addShapeBox(0F, 0F, 0F, 1, 18, 1, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 33
		br_mk2f_coachModel[55].setRotationPoint(35F, -18F, 5F);
		br_mk2f_coachModel[55].rotateAngleY = -3.14159265F;

		br_mk2f_coachModel[56].addShapeBox(0F, 0F, 0F, 1, 18, 1, 0F, -0.5F, 0F, 0F, 0.7F, 0F, 0F, 0.7F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 33
		br_mk2f_coachModel[56].setRotationPoint(35F, -18F, -4F);
		br_mk2f_coachModel[56].rotateAngleY = -3.14159265F;

		br_mk2f_coachModel[57].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 33
		br_mk2f_coachModel[57].setRotationPoint(35F, -19F, 5F);
		br_mk2f_coachModel[57].rotateAngleY = -3.14159265F;

		br_mk2f_coachModel[58].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -0.5F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 33
		br_mk2f_coachModel[58].setRotationPoint(35F, -19F, -4F);
		br_mk2f_coachModel[58].rotateAngleY = -3.14159265F;

		br_mk2f_coachModel[59].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 33
		br_mk2f_coachModel[59].setRotationPoint(35F, 0F, 5F);
		br_mk2f_coachModel[59].rotateAngleY = -3.14159265F;

		br_mk2f_coachModel[60].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F); // Box 33
		br_mk2f_coachModel[60].setRotationPoint(35F, 0F, -4F);
		br_mk2f_coachModel[60].rotateAngleY = -3.14159265F;

		br_mk2f_coachModel[61].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.4F, 0.2F, -0.7F, 0F, 0.2F, -0.7F, 0F, 0.2F, 0.3F, 0.4F, 0.2F, 0.3F, 0.4F, -0.7F, -0.7F, 0F, -0.7F, -0.7F, 0F, -0.7F, 0.3F, 0.4F, -0.7F, 0.3F); // Box 61
		br_mk2f_coachModel[61].setRotationPoint(-50F, 1F, 6F);

		br_mk2f_coachModel[62].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.4F, 0.2F, 0.3F, 0F, 0.2F, 0.3F, 0F, 0.2F, -0.7F, 0.4F, 0.2F, -0.7F, 0.4F, -0.7F, 0.3F, 0F, -0.7F, 0.3F, 0F, -0.7F, -0.7F, 0.4F, -0.7F, -0.7F); // Box 61
		br_mk2f_coachModel[62].setRotationPoint(-50F, 1F, -7F);

		br_mk2f_coachModel[63].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F, -0.5F, 0F, 0.5F, -0.4F, 0F, 0.5F, -0.4F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0.5F, -0.4F, 0F, 0.5F, -0.4F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 61
		br_mk2f_coachModel[63].setRotationPoint(-51F, 0F, -8F);

		br_mk2f_coachModel[64].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F, -0.5F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, 0F, 0.5F, -0.5F, 0F, 0.5F); // Box 61
		br_mk2f_coachModel[64].setRotationPoint(-51F, 0F, 5F);

		br_mk2f_coachModel[65].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.4F, 0.2F, -0.7F, 0F, 0.2F, -0.7F, 0F, 0.2F, 0.3F, 0.4F, 0.2F, 0.3F, 0.4F, -0.7F, -0.7F, 0F, -0.7F, -0.7F, 0F, -0.7F, 0.3F, 0.4F, -0.7F, 0.3F); // Box 61
		br_mk2f_coachModel[65].setRotationPoint(35F, 1F, 8F);
		br_mk2f_coachModel[65].rotateAngleY = -3.14159265F;

		br_mk2f_coachModel[66].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.4F, 0.2F, 0.3F, 0F, 0.2F, 0.3F, 0F, 0.2F, -0.7F, 0.4F, 0.2F, -0.7F, 0.4F, -0.7F, 0.3F, 0F, -0.7F, 0.3F, 0F, -0.7F, -0.7F, 0.4F, -0.7F, -0.7F); // Box 61
		br_mk2f_coachModel[66].setRotationPoint(35F, 1F, -7F);
		br_mk2f_coachModel[66].rotateAngleY = -3.14159265F;

		br_mk2f_coachModel[67].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F, -0.5F, 0F, 0.5F, -0.4F, 0F, 0.5F, -0.4F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0.5F, -0.4F, 0F, 0.5F, -0.4F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 61
		br_mk2f_coachModel[67].setRotationPoint(36F, 0F, -6F);
		br_mk2f_coachModel[67].rotateAngleY = -3.14159265F;

		br_mk2f_coachModel[68].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F, -0.5F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, 0F, 0.5F, -0.5F, 0F, 0.5F); // Box 61
		br_mk2f_coachModel[68].setRotationPoint(36F, 0F, 9F);
		br_mk2f_coachModel[68].rotateAngleY = -3.14159265F;

		br_mk2f_coachModel[69].addBox(0F, 0F, 0F, 5, 5, 0, 0F); // Box 70
		br_mk2f_coachModel[69].setRotationPoint(-43F, 2F, -6F);

		br_mk2f_coachModel[70].addBox(0F, 0F, 0F, 5, 5, 0, 0F); // Box 70
		br_mk2f_coachModel[70].setRotationPoint(-43F, 2F, 6F);

		br_mk2f_coachModel[71].addBox(0F, 0F, 0F, 5, 5, 0, 0F); // Box 70
		br_mk2f_coachModel[71].setRotationPoint(-29F, 2F, -6F);

		br_mk2f_coachModel[72].addBox(0F, 0F, 0F, 5, 5, 0, 0F); // Box 70
		br_mk2f_coachModel[72].setRotationPoint(-29F, 2F, 6F);

		br_mk2f_coachModel[73].addBox(0F, 0F, 0F, 1, 1, 16, 0F); // Box 74
		br_mk2f_coachModel[73].setRotationPoint(-41F, 4F, -8F);

		br_mk2f_coachModel[74].addBox(0F, 0F, 0F, 1, 1, 16, 0F); // Box 74
		br_mk2f_coachModel[74].setRotationPoint(-27F, 4F, -8F);

		br_mk2f_coachModel[75].addShapeBox(0F, 0F, 0F, 19, 1, 1, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0.2F, 0F, 0.5F, 0.2F, 0F, 0.5F, 0.2F, 0F, 0.5F, 0.2F, 0F); // Box 75
		br_mk2f_coachModel[75].setRotationPoint(-43F, 2F, -8F);

		br_mk2f_coachModel[76].addShapeBox(0F, 0F, 0F, 1, 1, 16, 0F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0.2F, -0.5F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, 0F, 0.2F, -0.5F); // Box 75
		br_mk2f_coachModel[76].setRotationPoint(-44F, 2F, -8F);

		br_mk2f_coachModel[77].addShapeBox(0F, 0F, 0F, 1, 1, 16, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0.2F, 0F, 0F, 0.2F, -0.5F, 0F, 0.2F, -0.5F, -0.5F, 0.2F, 0F); // Box 75
		br_mk2f_coachModel[77].setRotationPoint(-24F, 2F, -8F);

		br_mk2f_coachModel[78].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0.2F, 0F, 0F); // Box 75
		br_mk2f_coachModel[78].setRotationPoint(-42F, 3F, -8F);

		br_mk2f_coachModel[79].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 75
		br_mk2f_coachModel[79].setRotationPoint(-40F, 3F, -8F);

		br_mk2f_coachModel[80].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, -0.4F, -0.7F, 0F, -0.4F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, -0.7F, 0F, -0.4F, -0.7F, 0F, 0F, 0F, 0F, 0F); // Box 75
		br_mk2f_coachModel[80].setRotationPoint(-43F, 3F, -8F);

		br_mk2f_coachModel[81].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -0.7F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, -0.7F, 0F, 0F); // Box 75
		br_mk2f_coachModel[81].setRotationPoint(-39F, 3F, -8F);

		br_mk2f_coachModel[82].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, -0.6F, 0F, 0.2F, -0.6F, 0F, 0.2F, -0.6F, 0F, 0.2F, -0.6F, 0F); // Box 75
		br_mk2f_coachModel[82].setRotationPoint(-42F, 5F, -8F);

		br_mk2f_coachModel[83].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.4F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, -0.4F, -0.2F, -0.6F, 0F, -0.2F, -0.6F, 0F, 0F, -0.6F, 0F); // Box 75
		br_mk2f_coachModel[83].setRotationPoint(-43F, 5F, -8F);

		br_mk2f_coachModel[84].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.2F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.6F, 0F, 0F, -0.6F, -0.4F, 0F, -0.6F, 0F, -0.2F, -0.6F, 0F); // Box 75
		br_mk2f_coachModel[84].setRotationPoint(-39F, 5F, -8F);

		br_mk2f_coachModel[85].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0.2F, 0F, 0F); // Box 75
		br_mk2f_coachModel[85].setRotationPoint(-28F, 3F, -8F);

		br_mk2f_coachModel[86].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 75
		br_mk2f_coachModel[86].setRotationPoint(-26F, 3F, -8F);

		br_mk2f_coachModel[87].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, -0.4F, -0.7F, 0F, -0.4F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, -0.7F, 0F, -0.4F, -0.7F, 0F, 0F, 0F, 0F, 0F); // Box 75
		br_mk2f_coachModel[87].setRotationPoint(-29F, 3F, -8F);

		br_mk2f_coachModel[88].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -0.7F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, -0.7F, 0F, 0F); // Box 75
		br_mk2f_coachModel[88].setRotationPoint(-25F, 3F, -8F);

		br_mk2f_coachModel[89].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, -0.6F, 0F, 0.2F, -0.6F, 0F, 0.2F, -0.6F, 0F, 0.2F, -0.6F, 0F); // Box 75
		br_mk2f_coachModel[89].setRotationPoint(-28F, 5F, -8F);

		br_mk2f_coachModel[90].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.4F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, -0.4F, -0.2F, -0.6F, 0F, -0.2F, -0.6F, 0F, 0F, -0.6F, 0F); // Box 75
		br_mk2f_coachModel[90].setRotationPoint(-29F, 5F, -8F);

		br_mk2f_coachModel[91].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.2F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.6F, 0F, 0F, -0.6F, -0.4F, 0F, -0.6F, 0F, -0.2F, -0.6F, 0F); // Box 75
		br_mk2f_coachModel[91].setRotationPoint(-25F, 5F, -8F);

		br_mk2f_coachModel[92].addShapeBox(0F, 0F, 0F, 3, 1, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 75
		br_mk2f_coachModel[92].setRotationPoint(-35F, 2F, -7F);

		br_mk2f_coachModel[93].addBox(0F, 0F, 0F, 21, 1, 2, 0F); // Box 74
		br_mk2f_coachModel[93].setRotationPoint(-44F, 3F, -1F);

		br_mk2f_coachModel[94].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		br_mk2f_coachModel[94].setRotationPoint(-35F, 0F, -1F);

		br_mk2f_coachModel[95].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F); // Box 75
		br_mk2f_coachModel[95].setRotationPoint(-35F, 3F, -8F);

		br_mk2f_coachModel[96].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 75
		br_mk2f_coachModel[96].setRotationPoint(-34F, 3F, -8F);

		br_mk2f_coachModel[97].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F, 0.5F, -0.4F, 0F, 0.5F, -0.4F, 0F, 0.5F, -0.4F, 0F, 0.5F, -0.4F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 75
		br_mk2f_coachModel[97].setRotationPoint(-36F, 4F, -8F);

		br_mk2f_coachModel[98].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, -0.5F, -0.5F, -0.2F, -0.5F, -0.5F, -0.2F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F); // Box 75
		br_mk2f_coachModel[98].setRotationPoint(-36F, 1F, -8F);

		br_mk2f_coachModel[99].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, -0.2F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -1F, 0F, -0.2F, -1F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F); // Box 75
		br_mk2f_coachModel[99].setRotationPoint(-32F, 1F, -8F);

		br_mk2f_coachModel[100].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F, -0.2F, -0.2F, 0.5F, -0.2F, -0.2F, 0.5F, 0F, -0.5F, 0.5F, 0F); // Box 75
		br_mk2f_coachModel[100].setRotationPoint(-37F, 3F, -8F);

		br_mk2f_coachModel[101].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.2F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0.5F, -0.2F, -0.5F, 0.5F, -0.2F, -0.5F, 0.5F, 0F, -0.2F, 0.5F, 0F); // Box 75
		br_mk2f_coachModel[101].setRotationPoint(-31F, 3F, -8F);

		br_mk2f_coachModel[102].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 75
		br_mk2f_coachModel[102].setRotationPoint(-33F, 2F, -9F);

		br_mk2f_coachModel[103].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, -0.8F, -0.8F, -0.2F, -0.3F, -0.5F, -0.2F, -0.3F, -0.3F, 0F, -0.8F, 0F, 0F, 0F, -0.8F, -0.2F, -0.5F, -0.5F, -0.2F, -0.5F, -0.3F, 0F, 0F, 0F); // Box 75
		br_mk2f_coachModel[103].setRotationPoint(-34F, 3F, -9F);

		br_mk2f_coachModel[104].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.8F, -0.7F, -0.5F, 0F, -0.7F, -0.5F, 0F, -0.7F, -0.3F, -0.8F, -0.7F, -0.3F, -0.8F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.3F, -0.8F, 0.5F, -0.3F); // Box 75
		br_mk2f_coachModel[104].setRotationPoint(-33F, 2F, -9F);

		br_mk2f_coachModel[105].addShapeBox(0F, 0F, 0F, 19, 1, 1, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0.2F, 0F, 0.5F, 0.2F, 0F, 0.5F, 0.2F, 0F, 0.5F, 0.2F, 0F); // Box 75
		br_mk2f_coachModel[105].setRotationPoint(-43F, 2F, 7F);

		br_mk2f_coachModel[106].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0.2F, 0F, 0F); // Box 75
		br_mk2f_coachModel[106].setRotationPoint(-42F, 3F, 7F);

		br_mk2f_coachModel[107].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 75
		br_mk2f_coachModel[107].setRotationPoint(-40F, 3F, 7F);

		br_mk2f_coachModel[108].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, -0.4F, -0.7F, 0F, -0.4F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, -0.7F, 0F, -0.4F, -0.7F, 0F, 0F, 0F, 0F, 0F); // Box 75
		br_mk2f_coachModel[108].setRotationPoint(-38F, 3F, 8F);
		br_mk2f_coachModel[108].rotateAngleY = -3.14159265F;

		br_mk2f_coachModel[109].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -0.7F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, -0.7F, 0F, 0F); // Box 75
		br_mk2f_coachModel[109].setRotationPoint(-42F, 3F, 8F);
		br_mk2f_coachModel[109].rotateAngleY = -3.14159265F;

		br_mk2f_coachModel[110].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, -0.6F, 0F, 0.2F, -0.6F, 0F, 0.2F, -0.6F, 0F, 0.2F, -0.6F, 0F); // Box 75
		br_mk2f_coachModel[110].setRotationPoint(-42F, 5F, 7F);

		br_mk2f_coachModel[111].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.4F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, -0.4F, -0.2F, -0.6F, 0F, -0.2F, -0.6F, 0F, 0F, -0.6F, 0F); // Box 75
		br_mk2f_coachModel[111].setRotationPoint(-38F, 5F, 8F);
		br_mk2f_coachModel[111].rotateAngleY = -3.14159265F;

		br_mk2f_coachModel[112].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.2F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.6F, 0F, 0F, -0.6F, -0.4F, 0F, -0.6F, 0F, -0.2F, -0.6F, 0F); // Box 75
		br_mk2f_coachModel[112].setRotationPoint(-42F, 5F, 8F);
		br_mk2f_coachModel[112].rotateAngleY = -3.14159265F;

		br_mk2f_coachModel[113].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0.2F, 0F, 0F); // Box 75
		br_mk2f_coachModel[113].setRotationPoint(-28F, 3F, 7F);

		br_mk2f_coachModel[114].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 75
		br_mk2f_coachModel[114].setRotationPoint(-26F, 3F, 7F);

		br_mk2f_coachModel[115].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, -0.4F, -0.7F, 0F, -0.4F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, -0.7F, 0F, -0.4F, -0.7F, 0F, 0F, 0F, 0F, 0F); // Box 75
		br_mk2f_coachModel[115].setRotationPoint(-24F, 3F, 8F);
		br_mk2f_coachModel[115].rotateAngleY = -3.14159265F;

		br_mk2f_coachModel[116].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -0.7F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, -0.7F, 0F, 0F); // Box 75
		br_mk2f_coachModel[116].setRotationPoint(-28F, 3F, 8F);
		br_mk2f_coachModel[116].rotateAngleY = -3.14159265F;

		br_mk2f_coachModel[117].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, -0.6F, 0F, 0.2F, -0.6F, 0F, 0.2F, -0.6F, 0F, 0.2F, -0.6F, 0F); // Box 75
		br_mk2f_coachModel[117].setRotationPoint(-28F, 5F, 7F);

		br_mk2f_coachModel[118].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.4F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, -0.4F, -0.2F, -0.6F, 0F, -0.2F, -0.6F, 0F, 0F, -0.6F, 0F); // Box 75
		br_mk2f_coachModel[118].setRotationPoint(-24F, 5F, 8F);
		br_mk2f_coachModel[118].rotateAngleY = -3.14159265F;

		br_mk2f_coachModel[119].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.2F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.6F, 0F, 0F, -0.6F, -0.4F, 0F, -0.6F, 0F, -0.2F, -0.6F, 0F); // Box 75
		br_mk2f_coachModel[119].setRotationPoint(-28F, 5F, 8F);
		br_mk2f_coachModel[119].rotateAngleY = -3.14159265F;

		br_mk2f_coachModel[120].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F); // Box 75
		br_mk2f_coachModel[120].setRotationPoint(-35F, 3F, 6F);

		br_mk2f_coachModel[121].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F, 0.5F, -0.4F, 0F, 0.5F, -0.4F, 0F, 0.5F, -0.4F, 0F, 0.5F, -0.4F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 75
		br_mk2f_coachModel[121].setRotationPoint(-36F, 4F, 6F);

		br_mk2f_coachModel[122].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, -0.5F, -0.5F, -0.2F, -0.5F, -0.5F, -0.2F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F); // Box 75
		br_mk2f_coachModel[122].setRotationPoint(-31F, 1F, 8F);
		br_mk2f_coachModel[122].rotateAngleY = -3.14159265F;

		br_mk2f_coachModel[123].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, -0.2F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -1F, 0F, -0.2F, -1F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F); // Box 75
		br_mk2f_coachModel[123].setRotationPoint(-35F, 1F, 8F);
		br_mk2f_coachModel[123].rotateAngleY = -3.14159265F;

		br_mk2f_coachModel[124].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F, -0.2F, -0.2F, 0.5F, -0.2F, -0.2F, 0.5F, 0F, -0.5F, 0.5F, 0F); // Box 75
		br_mk2f_coachModel[124].setRotationPoint(-30F, 3F, 8F);
		br_mk2f_coachModel[124].rotateAngleY = -3.14159265F;

		br_mk2f_coachModel[125].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.2F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0.5F, -0.2F, -0.5F, 0.5F, -0.2F, -0.5F, 0.5F, 0F, -0.2F, 0.5F, 0F); // Box 75
		br_mk2f_coachModel[125].setRotationPoint(-36F, 3F, 8F);
		br_mk2f_coachModel[125].rotateAngleY = -3.14159265F;

		br_mk2f_coachModel[126].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 75
		br_mk2f_coachModel[126].setRotationPoint(-32F, 2F, 9F);
		br_mk2f_coachModel[126].rotateAngleY = -3.14159265F;

		br_mk2f_coachModel[127].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, -0.3F, -0.5F, -0.2F, -0.8F, -0.8F, -0.2F, -0.8F, 0F, 0F, -0.3F, -0.3F, 0F, -0.5F, -0.5F, -0.2F, 0F, -0.8F, -0.2F, 0F, 0F, 0F, -0.5F, -0.3F); // Box 75
		br_mk2f_coachModel[127].setRotationPoint(-32F, 3F, 9F);
		br_mk2f_coachModel[127].rotateAngleY = -3.14159265F;

		br_mk2f_coachModel[128].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.7F, -0.5F, -0.8F, -0.7F, -0.5F, -0.8F, -0.7F, -0.3F, 0F, -0.7F, -0.3F, 0F, 0.5F, -0.5F, -0.8F, 0.5F, -0.5F, -0.8F, 0.5F, -0.3F, 0F, 0.5F, -0.3F); // Box 75
		br_mk2f_coachModel[128].setRotationPoint(-32F, 2F, 9F);
		br_mk2f_coachModel[128].rotateAngleY = -3.14159265F;

		br_mk2f_coachModel[129].addBox(0F, 0F, 0F, 5, 5, 0, 0F); // Box 70
		br_mk2f_coachModel[129].setRotationPoint(9F, 2F, -6F);

		br_mk2f_coachModel[130].addBox(0F, 0F, 0F, 5, 5, 0, 0F); // Box 70
		br_mk2f_coachModel[130].setRotationPoint(9F, 2F, 6F);

		br_mk2f_coachModel[131].addBox(0F, 0F, 0F, 5, 5, 0, 0F); // Box 70
		br_mk2f_coachModel[131].setRotationPoint(23F, 2F, -6F);

		br_mk2f_coachModel[132].addBox(0F, 0F, 0F, 5, 5, 0, 0F); // Box 70
		br_mk2f_coachModel[132].setRotationPoint(23F, 2F, 6F);

		br_mk2f_coachModel[133].addBox(0F, 0F, 0F, 1, 1, 16, 0F); // Box 74
		br_mk2f_coachModel[133].setRotationPoint(11F, 4F, -8F);

		br_mk2f_coachModel[134].addBox(0F, 0F, 0F, 1, 1, 16, 0F); // Box 74
		br_mk2f_coachModel[134].setRotationPoint(25F, 4F, -8F);

		br_mk2f_coachModel[135].addShapeBox(0F, 0F, 0F, 19, 1, 1, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0.2F, 0F, 0.5F, 0.2F, 0F, 0.5F, 0.2F, 0F, 0.5F, 0.2F, 0F); // Box 75
		br_mk2f_coachModel[135].setRotationPoint(9F, 2F, -8F);

		br_mk2f_coachModel[136].addShapeBox(0F, 0F, 0F, 1, 1, 16, 0F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0.2F, -0.5F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, 0F, 0.2F, -0.5F); // Box 75
		br_mk2f_coachModel[136].setRotationPoint(8F, 2F, -8F);

		br_mk2f_coachModel[137].addShapeBox(0F, 0F, 0F, 1, 1, 16, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0.2F, 0F, 0F, 0.2F, -0.5F, 0F, 0.2F, -0.5F, -0.5F, 0.2F, 0F); // Box 75
		br_mk2f_coachModel[137].setRotationPoint(28F, 2F, -8F);

		br_mk2f_coachModel[138].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0.2F, 0F, 0F); // Box 75
		br_mk2f_coachModel[138].setRotationPoint(10F, 3F, -8F);

		br_mk2f_coachModel[139].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 75
		br_mk2f_coachModel[139].setRotationPoint(12F, 3F, -8F);

		br_mk2f_coachModel[140].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, -0.4F, -0.7F, 0F, -0.4F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, -0.7F, 0F, -0.4F, -0.7F, 0F, 0F, 0F, 0F, 0F); // Box 75
		br_mk2f_coachModel[140].setRotationPoint(9F, 3F, -8F);

		br_mk2f_coachModel[141].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -0.7F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, -0.7F, 0F, 0F); // Box 75
		br_mk2f_coachModel[141].setRotationPoint(13F, 3F, -8F);

		br_mk2f_coachModel[142].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, -0.6F, 0F, 0.2F, -0.6F, 0F, 0.2F, -0.6F, 0F, 0.2F, -0.6F, 0F); // Box 75
		br_mk2f_coachModel[142].setRotationPoint(10F, 5F, -8F);

		br_mk2f_coachModel[143].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.4F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, -0.4F, -0.2F, -0.6F, 0F, -0.2F, -0.6F, 0F, 0F, -0.6F, 0F); // Box 75
		br_mk2f_coachModel[143].setRotationPoint(9F, 5F, -8F);

		br_mk2f_coachModel[144].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.2F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.6F, 0F, 0F, -0.6F, -0.4F, 0F, -0.6F, 0F, -0.2F, -0.6F, 0F); // Box 75
		br_mk2f_coachModel[144].setRotationPoint(13F, 5F, -8F);

		br_mk2f_coachModel[145].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0.2F, 0F, 0F); // Box 75
		br_mk2f_coachModel[145].setRotationPoint(24F, 3F, -8F);

		br_mk2f_coachModel[146].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 75
		br_mk2f_coachModel[146].setRotationPoint(26F, 3F, -8F);

		br_mk2f_coachModel[147].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, -0.4F, -0.7F, 0F, -0.4F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, -0.7F, 0F, -0.4F, -0.7F, 0F, 0F, 0F, 0F, 0F); // Box 75
		br_mk2f_coachModel[147].setRotationPoint(23F, 3F, -8F);

		br_mk2f_coachModel[148].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -0.7F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, -0.7F, 0F, 0F); // Box 75
		br_mk2f_coachModel[148].setRotationPoint(27F, 3F, -8F);

		br_mk2f_coachModel[149].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, -0.6F, 0F, 0.2F, -0.6F, 0F, 0.2F, -0.6F, 0F, 0.2F, -0.6F, 0F); // Box 75
		br_mk2f_coachModel[149].setRotationPoint(24F, 5F, -8F);

		br_mk2f_coachModel[150].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.4F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, -0.4F, -0.2F, -0.6F, 0F, -0.2F, -0.6F, 0F, 0F, -0.6F, 0F); // Box 75
		br_mk2f_coachModel[150].setRotationPoint(23F, 5F, -8F);

		br_mk2f_coachModel[151].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.2F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.6F, 0F, 0F, -0.6F, -0.4F, 0F, -0.6F, 0F, -0.2F, -0.6F, 0F); // Box 75
		br_mk2f_coachModel[151].setRotationPoint(27F, 5F, -8F);

		br_mk2f_coachModel[152].addShapeBox(0F, 0F, 0F, 3, 1, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 75
		br_mk2f_coachModel[152].setRotationPoint(17F, 2F, -7F);

		br_mk2f_coachModel[153].addBox(0F, 0F, 0F, 21, 1, 2, 0F); // Box 74
		br_mk2f_coachModel[153].setRotationPoint(8F, 3F, -1F);

		br_mk2f_coachModel[154].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		br_mk2f_coachModel[154].setRotationPoint(17F, 0F, -1F);

		br_mk2f_coachModel[155].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F); // Box 75
		br_mk2f_coachModel[155].setRotationPoint(17F, 3F, -8F);

		br_mk2f_coachModel[156].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F, 0.5F, -0.4F, 0F, 0.5F, -0.4F, 0F, 0.5F, -0.4F, 0F, 0.5F, -0.4F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 75
		br_mk2f_coachModel[156].setRotationPoint(16F, 4F, -8F);

		br_mk2f_coachModel[157].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, -0.5F, -0.5F, -0.2F, -0.5F, -0.5F, -0.2F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F); // Box 75
		br_mk2f_coachModel[157].setRotationPoint(16F, 1F, -8F);

		br_mk2f_coachModel[158].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, -0.2F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -1F, 0F, -0.2F, -1F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F); // Box 75
		br_mk2f_coachModel[158].setRotationPoint(20F, 1F, -8F);

		br_mk2f_coachModel[159].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F, -0.2F, -0.2F, 0.5F, -0.2F, -0.2F, 0.5F, 0F, -0.5F, 0.5F, 0F); // Box 75
		br_mk2f_coachModel[159].setRotationPoint(15F, 3F, -8F);

		br_mk2f_coachModel[160].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.2F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0.5F, -0.2F, -0.5F, 0.5F, -0.2F, -0.5F, 0.5F, 0F, -0.2F, 0.5F, 0F); // Box 75
		br_mk2f_coachModel[160].setRotationPoint(21F, 3F, -8F);

		br_mk2f_coachModel[161].addShapeBox(0F, 0F, 0F, 19, 1, 1, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0.2F, 0F, 0.5F, 0.2F, 0F, 0.5F, 0.2F, 0F, 0.5F, 0.2F, 0F); // Box 75
		br_mk2f_coachModel[161].setRotationPoint(9F, 2F, 7F);

		br_mk2f_coachModel[162].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0.2F, 0F, 0F); // Box 75
		br_mk2f_coachModel[162].setRotationPoint(10F, 3F, 7F);

		br_mk2f_coachModel[163].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 75
		br_mk2f_coachModel[163].setRotationPoint(12F, 3F, 7F);

		br_mk2f_coachModel[164].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, -0.4F, -0.7F, 0F, -0.4F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, -0.7F, 0F, -0.4F, -0.7F, 0F, 0F, 0F, 0F, 0F); // Box 75
		br_mk2f_coachModel[164].setRotationPoint(14F, 3F, 8F);
		br_mk2f_coachModel[164].rotateAngleY = -3.14159265F;

		br_mk2f_coachModel[165].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -0.7F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, -0.7F, 0F, 0F); // Box 75
		br_mk2f_coachModel[165].setRotationPoint(10F, 3F, 8F);
		br_mk2f_coachModel[165].rotateAngleY = -3.14159265F;

		br_mk2f_coachModel[166].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, -0.6F, 0F, 0.2F, -0.6F, 0F, 0.2F, -0.6F, 0F, 0.2F, -0.6F, 0F); // Box 75
		br_mk2f_coachModel[166].setRotationPoint(10F, 5F, 7F);

		br_mk2f_coachModel[167].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.4F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, -0.4F, -0.2F, -0.6F, 0F, -0.2F, -0.6F, 0F, 0F, -0.6F, 0F); // Box 75
		br_mk2f_coachModel[167].setRotationPoint(14F, 5F, 8F);
		br_mk2f_coachModel[167].rotateAngleY = -3.14159265F;

		br_mk2f_coachModel[168].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.2F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.6F, 0F, 0F, -0.6F, -0.4F, 0F, -0.6F, 0F, -0.2F, -0.6F, 0F); // Box 75
		br_mk2f_coachModel[168].setRotationPoint(10F, 5F, 8F);
		br_mk2f_coachModel[168].rotateAngleY = -3.14159265F;

		br_mk2f_coachModel[169].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0.2F, 0F, 0F); // Box 75
		br_mk2f_coachModel[169].setRotationPoint(24F, 3F, 7F);

		br_mk2f_coachModel[170].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 75
		br_mk2f_coachModel[170].setRotationPoint(26F, 3F, 7F);

		br_mk2f_coachModel[171].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, -0.4F, -0.7F, 0F, -0.4F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, -0.7F, 0F, -0.4F, -0.7F, 0F, 0F, 0F, 0F, 0F); // Box 75
		br_mk2f_coachModel[171].setRotationPoint(28F, 3F, 8F);
		br_mk2f_coachModel[171].rotateAngleY = -3.14159265F;

		br_mk2f_coachModel[172].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -0.7F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, -0.7F, 0F, 0F); // Box 75
		br_mk2f_coachModel[172].setRotationPoint(24F, 3F, 8F);
		br_mk2f_coachModel[172].rotateAngleY = -3.14159265F;

		br_mk2f_coachModel[173].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, -0.6F, 0F, 0.2F, -0.6F, 0F, 0.2F, -0.6F, 0F, 0.2F, -0.6F, 0F); // Box 75
		br_mk2f_coachModel[173].setRotationPoint(24F, 5F, 7F);

		br_mk2f_coachModel[174].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.4F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, -0.4F, -0.2F, -0.6F, 0F, -0.2F, -0.6F, 0F, 0F, -0.6F, 0F); // Box 75
		br_mk2f_coachModel[174].setRotationPoint(28F, 5F, 8F);
		br_mk2f_coachModel[174].rotateAngleY = -3.14159265F;

		br_mk2f_coachModel[175].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.2F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.6F, 0F, 0F, -0.6F, -0.4F, 0F, -0.6F, 0F, -0.2F, -0.6F, 0F); // Box 75
		br_mk2f_coachModel[175].setRotationPoint(24F, 5F, 8F);
		br_mk2f_coachModel[175].rotateAngleY = -3.14159265F;

		br_mk2f_coachModel[176].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F); // Box 75
		br_mk2f_coachModel[176].setRotationPoint(17F, 3F, 6F);

		br_mk2f_coachModel[177].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F, 0.5F, -0.4F, 0F, 0.5F, -0.4F, 0F, 0.5F, -0.4F, 0F, 0.5F, -0.4F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 75
		br_mk2f_coachModel[177].setRotationPoint(16F, 4F, 6F);

		br_mk2f_coachModel[178].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, -0.5F, -0.5F, -0.2F, -0.5F, -0.5F, -0.2F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F); // Box 75
		br_mk2f_coachModel[178].setRotationPoint(21F, 1F, 8F);
		br_mk2f_coachModel[178].rotateAngleY = -3.14159265F;

		br_mk2f_coachModel[179].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, -0.2F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -1F, 0F, -0.2F, -1F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F); // Box 75
		br_mk2f_coachModel[179].setRotationPoint(17F, 1F, 8F);
		br_mk2f_coachModel[179].rotateAngleY = -3.14159265F;

		br_mk2f_coachModel[180].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F, -0.2F, -0.2F, 0.5F, -0.2F, -0.2F, 0.5F, 0F, -0.5F, 0.5F, 0F); // Box 75
		br_mk2f_coachModel[180].setRotationPoint(22F, 3F, 8F);
		br_mk2f_coachModel[180].rotateAngleY = -3.14159265F;

		br_mk2f_coachModel[181].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.2F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0.5F, -0.2F, -0.5F, 0.5F, -0.2F, -0.5F, 0.5F, 0F, -0.2F, 0.5F, 0F); // Box 75
		br_mk2f_coachModel[181].setRotationPoint(16F, 3F, 8F);
		br_mk2f_coachModel[181].rotateAngleY = -3.14159265F;

		br_mk2f_coachModel[182].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 75
		br_mk2f_coachModel[182].setRotationPoint(18F, 2F, 9F);
		br_mk2f_coachModel[182].rotateAngleY = -3.14159265F;

		br_mk2f_coachModel[183].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, -0.8F, -0.8F, -0.2F, -0.3F, -0.5F, -0.2F, -0.3F, -0.3F, 0F, -0.8F, 0F, 0F, 0F, -0.8F, -0.2F, -0.5F, -0.5F, -0.2F, -0.5F, -0.3F, 0F, 0F, 0F); // Box 75
		br_mk2f_coachModel[183].setRotationPoint(19F, 3F, 9F);
		br_mk2f_coachModel[183].rotateAngleY = -3.14159265F;

		br_mk2f_coachModel[184].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.8F, -0.7F, -0.5F, 0F, -0.7F, -0.5F, 0F, -0.7F, -0.3F, -0.8F, -0.7F, -0.3F, -0.8F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.3F, -0.8F, 0.5F, -0.3F); // Box 75
		br_mk2f_coachModel[184].setRotationPoint(18F, 2F, 9F);
		br_mk2f_coachModel[184].rotateAngleY = -3.14159265F;

		br_mk2f_coachModel[185].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 75
		br_mk2f_coachModel[185].setRotationPoint(17F, 2F, -9F);

		br_mk2f_coachModel[186].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, -0.3F, -0.5F, -0.2F, -0.8F, -0.8F, -0.2F, -0.8F, 0F, 0F, -0.3F, -0.3F, 0F, -0.5F, -0.5F, -0.2F, 0F, -0.8F, -0.2F, 0F, 0F, 0F, -0.5F, -0.3F); // Box 75
		br_mk2f_coachModel[186].setRotationPoint(17F, 3F, -9F);

		br_mk2f_coachModel[187].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.7F, -0.5F, -0.8F, -0.7F, -0.5F, -0.8F, -0.7F, -0.3F, 0F, -0.7F, -0.3F, 0F, 0.5F, -0.5F, -0.8F, 0.5F, -0.5F, -0.8F, 0.5F, -0.3F, 0F, 0.5F, -0.3F); // Box 75
		br_mk2f_coachModel[187].setRotationPoint(17F, 2F, -9F);

		br_mk2f_coachModel[188].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.4F, 0.5F, 0F, -0.4F, 0.5F, 0F, -0.4F, -0.5F, 0F, -0.4F, -0.5F); // Box 188
		br_mk2f_coachModel[188].setRotationPoint(-51F, 2F, 0F);

		br_mk2f_coachModel[189].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0.4F, 0.7F, -0.9F, 0.4F, 0.7F, -0.9F, 0.4F, -0.3F, 0F, 0.4F, -0.3F, 0F, 0F, 0.7F, -0.9F, 0F, 0.7F, -0.9F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 188
		br_mk2f_coachModel[189].setRotationPoint(-51F, 2F, 0F);

		br_mk2f_coachModel[190].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, -0.7F, -0.5F, 0.3F, -0.7F, -0.5F, -0.8F, 0.3F, 0F, -0.8F, 0.3F, 0F, -0.8F, -0.7F, -0.5F, -0.8F, -0.7F); // Box 188
		br_mk2f_coachModel[190].setRotationPoint(-52F, 2F, 0F);

		br_mk2f_coachModel[191].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, -0.4F, 0.3F, 0F, -0.4F, 0.3F, 0F, -0.4F, -0.7F, -0.5F, -0.4F, -0.7F, -0.5F, -0.1F, 0.3F, 0F, -0.1F, 0.3F, 0F, -0.1F, -0.7F, -0.5F, -0.1F, -0.7F); // Box 188
		br_mk2f_coachModel[191].setRotationPoint(-52F, 2F, 0F);

		br_mk2f_coachModel[192].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.4F, 0.5F, 0F, -0.4F, 0.5F, 0F, -0.4F, -0.5F, 0F, -0.4F, -0.5F); // Box 188
		br_mk2f_coachModel[192].setRotationPoint(36F, 2F, 0F);
		br_mk2f_coachModel[192].rotateAngleY = -3.14159265F;

		br_mk2f_coachModel[193].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0.4F, 0.7F, -0.9F, 0.4F, 0.7F, -0.9F, 0.4F, -0.3F, 0F, 0.4F, -0.3F, 0F, 0F, 0.7F, -0.9F, 0F, 0.7F, -0.9F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 188
		br_mk2f_coachModel[193].setRotationPoint(36F, 2F, 0F);
		br_mk2f_coachModel[193].rotateAngleY = -3.14159265F;

		br_mk2f_coachModel[194].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, -0.7F, -0.5F, 0.3F, -0.7F, -0.5F, -0.8F, 0.3F, 0F, -0.8F, 0.3F, 0F, -0.8F, -0.7F, -0.5F, -0.8F, -0.7F); // Box 188
		br_mk2f_coachModel[194].setRotationPoint(37F, 2F, 0F);
		br_mk2f_coachModel[194].rotateAngleY = -3.14159265F;

		br_mk2f_coachModel[195].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, -0.4F, 0.3F, 0F, -0.4F, 0.3F, 0F, -0.4F, -0.7F, -0.5F, -0.4F, -0.7F, -0.5F, -0.1F, 0.3F, 0F, -0.1F, 0.3F, 0F, -0.1F, -0.7F, -0.5F, -0.1F, -0.7F); // Box 188
		br_mk2f_coachModel[195].setRotationPoint(37F, 2F, 0F);
		br_mk2f_coachModel[195].rotateAngleY = -3.14159265F;

		br_mk2f_coachModel[196].addBox(0F, 0F, 0F, 4, 4, 4, 0F); // Box 197
		br_mk2f_coachModel[196].setRotationPoint(2F, 1F, 4F);

		br_mk2f_coachModel[197].addShapeBox(0F, 0F, 0F, 5, 2, 2, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F); // Box 198
		br_mk2f_coachModel[197].setRotationPoint(-22F, 2F, -8F);

		br_mk2f_coachModel[198].addShapeBox(0F, 0F, 0F, 4, 5, 3, 0F, 0F, -0.1F, -0.5F, 0F, -0.1F, -0.5F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 198
		br_mk2f_coachModel[198].setRotationPoint(2F, 0F, -9F);

		br_mk2f_coachModel[199].addShapeBox(0F, 0F, 0F, 5, 5, 3, 0F, -0.5F, -0.1F, 0F, 0.5F, -0.1F, 0F, 0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 198
		br_mk2f_coachModel[199].setRotationPoint(-4F, 0F, -9F);

		br_mk2f_coachModel[200].addShapeBox(0F, 0F, 0F, 3, 5, 3, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 198
		br_mk2f_coachModel[200].setRotationPoint(-16F, 0F, -9F);

		br_mk2f_coachModel[201].addShapeBox(0F, 0F, 0F, 3, 5, 3, 0F, 0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, 0.5F, -0.1F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 198
		br_mk2f_coachModel[201].setRotationPoint(-12F, 0F, -9F);

		br_mk2f_coachModel[202].addShapeBox(0F, 0F, 0F, 5, 2, 2, 0F, 0F, 0.7F, 0F, 0F, 0.7F, 0F, 0F, 0.7F, 0F, 0F, 0.7F, 0F, 0F, -1.4F, -0.5F, 0F, -1.4F, -0.5F, 0F, -1.4F, -0.5F, 0F, -1.4F, -0.5F); // Box 198
		br_mk2f_coachModel[202].setRotationPoint(-22F, 4F, -8F);

		br_mk2f_coachModel[203].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 198
		br_mk2f_coachModel[203].setRotationPoint(-21F, 0F, -7F);

		br_mk2f_coachModel[204].addShapeBox(0F, 0F, 0F, 4, 2, 3, 0F, -0.5F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, -0.5F, 0F, -0.7F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 198
		br_mk2f_coachModel[204].setRotationPoint(-2F, 1F, 8F);
		br_mk2f_coachModel[204].rotateAngleY = -1.57079633F;

		br_mk2f_coachModel[205].addShapeBox(0F, 0F, 0F, 4, 2, 3, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, -0.5F, 0F, -0.7F); // Box 198
		br_mk2f_coachModel[205].setRotationPoint(-2F, 3F, 8F);
		br_mk2f_coachModel[205].rotateAngleY = -1.57079633F;

		br_mk2f_coachModel[206].addBox(0F, 0F, 0F, 3, 3, 4, 0F); // Box 197
		br_mk2f_coachModel[206].setRotationPoint(-6F, 1F, 5F);

		br_mk2f_coachModel[207].addShapeBox(0F, 0F, 0F, 5, 5, 5, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 197
		br_mk2f_coachModel[207].setRotationPoint(-18F, 0F, 3F);

		br_mk2f_coachModel[208].addBox(0F, 0F, 0F, 3, 4, 4, 0F); // Box 197
		br_mk2f_coachModel[208].setRotationPoint(-12F, 1F, 5F);

		br_mk2f_coachModel[209].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 197
		br_mk2f_coachModel[209].setRotationPoint(-8F, 1F, 4F);

		br_mk2f_coachModel[210].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 198
		br_mk2f_coachModel[210].setRotationPoint(-11F, 0F, 6F);

		br_mk2f_coachModel[211].addShapeBox(0F, 0F, 0F, 11, 3, 10, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 198
		br_mk2f_coachModel[211].setRotationPoint(-5F, 0F, -6F);

		br_mk2f_coachModel[212].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 198
		br_mk2f_coachModel[212].setRotationPoint(-47F, 0F, -8F);

		br_mk2f_coachModel[213].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 198
		br_mk2f_coachModel[213].setRotationPoint(-21F, 0F, 6F);

		br_mk2f_coachModel[214].addShapeBox(0F, 0F, 0F, 1, 3, 22, 0F, 0F, 0F, -0.1F, -0.9F, 0F, -0.1F, -0.9F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.5F, -0.9F, 0F, -0.5F, -0.9F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 74
		br_mk2f_coachModel[214].setRotationPoint(-42F, -3F, -11F);

		br_mk2f_coachModel[215].addShapeBox(0F, 0F, 0F, 1, 14, 22, 0F, 0F, 0F, -0.1F, -0.9F, 0F, -0.1F, -0.9F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, -0.9F, 0F, -0.1F, -0.9F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 74
		br_mk2f_coachModel[215].setRotationPoint(-42F, -17F, -11F);

		br_mk2f_coachModel[216].addShapeBox(0F, 0F, 0F, 1, 1, 22, 0F, 0F, -0.1F, -1F, -0.9F, -0.1F, -1F, -0.9F, -0.1F, -1F, 0F, -0.1F, -1F, 0F, 0F, -0.1F, -0.9F, 0F, -0.1F, -0.9F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 74
		br_mk2f_coachModel[216].setRotationPoint(-42F, -18F, -11F);

		br_mk2f_coachModel[217].addShapeBox(0F, 0F, 0F, 1, 2, 20, 0F, 0F, -0.1F, -3F, -0.9F, -0.1F, -3F, -0.9F, -0.1F, -3F, 0F, -0.1F, -3F, 0F, 0.1F, 0F, -0.9F, 0.1F, 0F, -0.9F, 0.1F, 0F, 0F, 0.1F, 0F); // Box 74
		br_mk2f_coachModel[217].setRotationPoint(-42F, -20F, -10F);

		br_mk2f_coachModel[218].addShapeBox(0F, 0F, 0F, 1, 2, 14, 0F, 0F, -0.1F, -5F, -0.9F, -0.1F, -5F, -0.9F, -0.1F, -5F, 0F, -0.1F, -5F, 0F, 0.1F, 0F, -0.9F, 0.1F, 0F, -0.9F, 0.1F, 0F, 0F, 0.1F, 0F); // Box 74
		br_mk2f_coachModel[218].setRotationPoint(-42F, -22F, -7F);

		br_mk2f_coachModel[219].addShapeBox(0F, 0F, 0F, 1, 3, 22, 0F, 0F, 0F, -0.1F, -0.9F, 0F, -0.1F, -0.9F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.5F, -0.9F, 0F, -0.5F, -0.9F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 74
		br_mk2f_coachModel[219].setRotationPoint(27F, -3F, 11F);
		br_mk2f_coachModel[219].rotateAngleY = -3.14159265F;

		br_mk2f_coachModel[220].addShapeBox(0F, 0F, 0F, 1, 14, 22, 0F, 0F, 0F, -0.1F, -0.9F, 0F, -0.1F, -0.9F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, -0.9F, 0F, -0.1F, -0.9F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 74
		br_mk2f_coachModel[220].setRotationPoint(27F, -17F, 11F);
		br_mk2f_coachModel[220].rotateAngleY = -3.14159265F;

		br_mk2f_coachModel[221].addShapeBox(0F, 0F, 0F, 1, 1, 22, 0F, 0F, -0.1F, -1F, -0.9F, -0.1F, -1F, -0.9F, -0.1F, -1F, 0F, -0.1F, -1F, 0F, 0F, -0.1F, -0.9F, 0F, -0.1F, -0.9F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 74
		br_mk2f_coachModel[221].setRotationPoint(27F, -18F, 11F);
		br_mk2f_coachModel[221].rotateAngleY = -3.14159265F;

		br_mk2f_coachModel[222].addShapeBox(0F, 0F, 0F, 1, 2, 20, 0F, 0F, -0.1F, -3F, -0.9F, -0.1F, -3F, -0.9F, -0.1F, -3F, 0F, -0.1F, -3F, 0F, 0.1F, 0F, -0.9F, 0.1F, 0F, -0.9F, 0.1F, 0F, 0F, 0.1F, 0F); // Box 74
		br_mk2f_coachModel[222].setRotationPoint(27F, -20F, 10F);
		br_mk2f_coachModel[222].rotateAngleY = -3.14159265F;

		br_mk2f_coachModel[223].addShapeBox(0F, 0F, 0F, 1, 2, 14, 0F, 0F, -0.1F, -5F, -0.9F, -0.1F, -5F, -0.9F, -0.1F, -5F, 0F, -0.1F, -5F, 0F, 0.1F, 0F, -0.9F, 0.1F, 0F, -0.9F, 0.1F, 0F, 0F, 0.1F, 0F); // Box 74
		br_mk2f_coachModel[223].setRotationPoint(27F, -22F, 7F);
		br_mk2f_coachModel[223].rotateAngleY = -3.14159265F;

		br_mk2f_coachModel[224].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F); // Box 198
		br_mk2f_coachModel[224].setRotationPoint(-49F, 2F, 7F);

		br_mk2f_coachModel[225].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F); // Box 198
		br_mk2f_coachModel[225].setRotationPoint(34F, 2F, -7F);
		br_mk2f_coachModel[225].rotateAngleY = -3.14159265F;

		br_mk2f_coachModel[226].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 198
		br_mk2f_coachModel[226].setRotationPoint(30F, 0F, 7F);

		br_mk2f_coachModel[227].addShapeBox(0F, 0F, 0F, 69, 1, 14, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 198
		br_mk2f_coachModel[227].setRotationPoint(-42F, -21F, -7F);

		br_mk2f_coachModel[228].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 198
		br_mk2f_coachModel[228].setRotationPoint(-36F, -3F, -9F);

		br_mk2f_coachModel[229].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 198
		br_mk2f_coachModel[229].setRotationPoint(-36F, -3F, -6F);

		br_mk2f_coachModel[230].addShapeBox(0F, 0F, 0F, 4, 1, 8, 0F, 0F, 0F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 198
		br_mk2f_coachModel[230].setRotationPoint(-38F, -4F, -11F);

		br_mk2f_coachModel[231].addShapeBox(0F, 0F, 0F, 1, 7, 8, 0F, -1F, 0F, -0.3F, 0.5F, 0F, -0.3F, 0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 198
		br_mk2f_coachModel[231].setRotationPoint(-34F, -10F, -11F);

		br_mk2f_coachModel[232].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 198
		br_mk2f_coachModel[232].setRotationPoint(-36F, -3F, 5F);

		br_mk2f_coachModel[233].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 198
		br_mk2f_coachModel[233].setRotationPoint(-36F, -3F, 8F);

		br_mk2f_coachModel[234].addShapeBox(0F, 0F, 0F, 4, 1, 8, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 198
		br_mk2f_coachModel[234].setRotationPoint(-38F, -4F, 3F);

		br_mk2f_coachModel[235].addShapeBox(0F, 0F, 0F, 1, 7, 8, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.3F, -1F, 0F, -0.3F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 198
		br_mk2f_coachModel[235].setRotationPoint(-34F, -10F, 3F);

		br_mk2f_coachModel[236].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 198
		br_mk2f_coachModel[236].setRotationPoint(-27F, -3F, -9F);

		br_mk2f_coachModel[237].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 198
		br_mk2f_coachModel[237].setRotationPoint(-27F, -3F, -6F);

		br_mk2f_coachModel[238].addShapeBox(0F, 0F, 0F, 4, 1, 8, 0F, 0F, 0F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 198
		br_mk2f_coachModel[238].setRotationPoint(-29F, -4F, -11F);

		br_mk2f_coachModel[239].addShapeBox(0F, 0F, 0F, 1, 7, 8, 0F, -1F, 0F, -0.3F, 0.5F, 0F, -0.3F, 0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 198
		br_mk2f_coachModel[239].setRotationPoint(-25F, -10F, -11F);

		br_mk2f_coachModel[240].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 198
		br_mk2f_coachModel[240].setRotationPoint(-27F, -3F, 5F);

		br_mk2f_coachModel[241].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 198
		br_mk2f_coachModel[241].setRotationPoint(-27F, -3F, 8F);

		br_mk2f_coachModel[242].addShapeBox(0F, 0F, 0F, 4, 1, 8, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 198
		br_mk2f_coachModel[242].setRotationPoint(-29F, -4F, 3F);

		br_mk2f_coachModel[243].addShapeBox(0F, 0F, 0F, 1, 7, 8, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.3F, -1F, 0F, -0.3F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 198
		br_mk2f_coachModel[243].setRotationPoint(-25F, -10F, 3F);

		br_mk2f_coachModel[244].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 198
		br_mk2f_coachModel[244].setRotationPoint(-18F, -3F, -9F);

		br_mk2f_coachModel[245].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 198
		br_mk2f_coachModel[245].setRotationPoint(-18F, -3F, -6F);

		br_mk2f_coachModel[246].addShapeBox(0F, 0F, 0F, 4, 1, 8, 0F, 0F, 0F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 198
		br_mk2f_coachModel[246].setRotationPoint(-20F, -4F, -11F);

		br_mk2f_coachModel[247].addShapeBox(0F, 0F, 0F, 1, 7, 8, 0F, -1F, 0F, -0.3F, 0.5F, 0F, -0.3F, 0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 198
		br_mk2f_coachModel[247].setRotationPoint(-16F, -10F, -11F);

		br_mk2f_coachModel[248].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 198
		br_mk2f_coachModel[248].setRotationPoint(-18F, -3F, 5F);

		br_mk2f_coachModel[249].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 198
		br_mk2f_coachModel[249].setRotationPoint(-18F, -3F, 8F);

		br_mk2f_coachModel[250].addShapeBox(0F, 0F, 0F, 4, 1, 8, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 198
		br_mk2f_coachModel[250].setRotationPoint(-20F, -4F, 3F);

		br_mk2f_coachModel[251].addShapeBox(0F, 0F, 0F, 1, 7, 8, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.3F, -1F, 0F, -0.3F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 198
		br_mk2f_coachModel[251].setRotationPoint(-16F, -10F, 3F);

		br_mk2f_coachModel[252].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 198
		br_mk2f_coachModel[252].setRotationPoint(-9F, -3F, -9F);

		br_mk2f_coachModel[253].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 198
		br_mk2f_coachModel[253].setRotationPoint(-9F, -3F, -6F);

		br_mk2f_coachModel[254].addShapeBox(0F, 0F, 0F, 4, 1, 8, 0F, 0F, 0F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 198
		br_mk2f_coachModel[254].setRotationPoint(-11F, -4F, -11F);

		br_mk2f_coachModel[255].addShapeBox(0F, 0F, 0F, 1, 7, 8, 0F, -1F, 0F, -0.3F, 0.5F, 0F, -0.3F, 0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 198
		br_mk2f_coachModel[255].setRotationPoint(-7F, -10F, -11F);

		br_mk2f_coachModel[256].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 198
		br_mk2f_coachModel[256].setRotationPoint(-9F, -3F, 5F);

		br_mk2f_coachModel[257].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 198
		br_mk2f_coachModel[257].setRotationPoint(-9F, -3F, 8F);

		br_mk2f_coachModel[258].addShapeBox(0F, 0F, 0F, 4, 1, 8, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 198
		br_mk2f_coachModel[258].setRotationPoint(-11F, -4F, 3F);

		br_mk2f_coachModel[259].addShapeBox(0F, 0F, 0F, 1, 7, 8, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.3F, -1F, 0F, -0.3F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 198
		br_mk2f_coachModel[259].setRotationPoint(-7F, -10F, 3F);

		br_mk2f_coachModel[260].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 198
		br_mk2f_coachModel[260].setRotationPoint(0F, -3F, -9F);

		br_mk2f_coachModel[261].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 198
		br_mk2f_coachModel[261].setRotationPoint(0F, -3F, -6F);

		br_mk2f_coachModel[262].addShapeBox(0F, 0F, 0F, 4, 1, 8, 0F, 0F, 0F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 198
		br_mk2f_coachModel[262].setRotationPoint(-2F, -4F, -11F);

		br_mk2f_coachModel[263].addShapeBox(0F, 0F, 0F, 1, 7, 8, 0F, -1F, 0F, -0.3F, 0.5F, 0F, -0.3F, 0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 198
		br_mk2f_coachModel[263].setRotationPoint(2F, -10F, -11F);

		br_mk2f_coachModel[264].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 198
		br_mk2f_coachModel[264].setRotationPoint(0F, -3F, 5F);

		br_mk2f_coachModel[265].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 198
		br_mk2f_coachModel[265].setRotationPoint(0F, -3F, 8F);

		br_mk2f_coachModel[266].addShapeBox(0F, 0F, 0F, 4, 1, 8, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 198
		br_mk2f_coachModel[266].setRotationPoint(-2F, -4F, 3F);

		br_mk2f_coachModel[267].addShapeBox(0F, 0F, 0F, 1, 7, 8, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.3F, -1F, 0F, -0.3F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 198
		br_mk2f_coachModel[267].setRotationPoint(2F, -10F, 3F);

		br_mk2f_coachModel[268].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 198
		br_mk2f_coachModel[268].setRotationPoint(9F, -3F, -9F);

		br_mk2f_coachModel[269].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 198
		br_mk2f_coachModel[269].setRotationPoint(9F, -3F, -6F);

		br_mk2f_coachModel[270].addShapeBox(0F, 0F, 0F, 4, 1, 8, 0F, 0F, 0F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 198
		br_mk2f_coachModel[270].setRotationPoint(7F, -4F, -11F);

		br_mk2f_coachModel[271].addShapeBox(0F, 0F, 0F, 1, 7, 8, 0F, -1F, 0F, -0.3F, 0.5F, 0F, -0.3F, 0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 198
		br_mk2f_coachModel[271].setRotationPoint(11F, -10F, -11F);

		br_mk2f_coachModel[272].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 198
		br_mk2f_coachModel[272].setRotationPoint(9F, -3F, 5F);

		br_mk2f_coachModel[273].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 198
		br_mk2f_coachModel[273].setRotationPoint(9F, -3F, 8F);

		br_mk2f_coachModel[274].addShapeBox(0F, 0F, 0F, 4, 1, 8, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 198
		br_mk2f_coachModel[274].setRotationPoint(7F, -4F, 3F);

		br_mk2f_coachModel[275].addShapeBox(0F, 0F, 0F, 1, 7, 8, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.3F, -1F, 0F, -0.3F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 198
		br_mk2f_coachModel[275].setRotationPoint(11F, -10F, 3F);

		br_mk2f_coachModel[276].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 198
		br_mk2f_coachModel[276].setRotationPoint(18F, -3F, -9F);

		br_mk2f_coachModel[277].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 198
		br_mk2f_coachModel[277].setRotationPoint(18F, -3F, -6F);

		br_mk2f_coachModel[278].addShapeBox(0F, 0F, 0F, 4, 1, 8, 0F, 0F, 0F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 198
		br_mk2f_coachModel[278].setRotationPoint(16F, -4F, -11F);

		br_mk2f_coachModel[279].addShapeBox(0F, 0F, 0F, 1, 7, 8, 0F, -1F, 0F, -0.3F, 0.5F, 0F, -0.3F, 0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 198
		br_mk2f_coachModel[279].setRotationPoint(20F, -10F, -11F);

		br_mk2f_coachModel[280].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 198
		br_mk2f_coachModel[280].setRotationPoint(18F, -3F, 5F);

		br_mk2f_coachModel[281].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 198
		br_mk2f_coachModel[281].setRotationPoint(18F, -3F, 8F);

		br_mk2f_coachModel[282].addShapeBox(0F, 0F, 0F, 4, 1, 8, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 198
		br_mk2f_coachModel[282].setRotationPoint(16F, -4F, 3F);

		br_mk2f_coachModel[283].addShapeBox(0F, 0F, 0F, 1, 7, 8, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.3F, -1F, 0F, -0.3F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 198
		br_mk2f_coachModel[283].setRotationPoint(20F, -10F, 3F);

		br_mk2f_coachModel[284].addShapeBox(0F, 0F, 0F, 69, 1, 3, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 198
		br_mk2f_coachModel[284].setRotationPoint(-42F, -16F, -11F);

		br_mk2f_coachModel[285].addShapeBox(0F, 0F, 0F, 69, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 198
		br_mk2f_coachModel[285].setRotationPoint(-42F, -16F, 8F);

		br_mk2f_coachModel[286].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F); // Box 198
		br_mk2f_coachModel[286].setRotationPoint(-44F, 1F, -9F);

		br_mk2f_coachModel[287].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F); // Box 198
		br_mk2f_coachModel[287].setRotationPoint(24F, 1F, 7F);

		br_mk2f_coachModel[288].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 75
		br_mk2f_coachModel[288].setRotationPoint(-33F, 3F, 8F);
		br_mk2f_coachModel[288].rotateAngleY = -3.14159265F;

		br_mk2f_coachModel[289].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 75
		br_mk2f_coachModel[289].setRotationPoint(19F, 3F, 8F);
		br_mk2f_coachModel[289].rotateAngleY = -3.14159265F;

		br_mk2f_coachModel[290].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 75
		br_mk2f_coachModel[290].setRotationPoint(18F, 3F, -8F);


	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		for(int i = 0; i < 291; i++)
		{
			br_mk2f_coachModel[i].render(f5);
		}
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
	{
	}

	public ModelRendererTurbo br_mk2f_coachModel[];
}