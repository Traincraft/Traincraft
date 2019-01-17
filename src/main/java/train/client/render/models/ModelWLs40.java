//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2018 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator:
// Created on:10.08.2018 - 18:13:32
// Last changed on: 10.08.2018 - 18:13:32

package train.client.render.models;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import tmt.ModelBase;
import tmt.ModelRendererTurbo;

public class ModelWLs40 extends ModelBase
{
	int textureX = 512;
	int textureY = 512;

	public ModelWLs40()
	{
		wls40Model = new ModelRendererTurbo[394];
		wls40Model[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 1
		wls40Model[1] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 2
		wls40Model[2] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 3
		wls40Model[3] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 1
		wls40Model[4] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 1
		wls40Model[5] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 1
		wls40Model[6] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 7
		wls40Model[7] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 7
		wls40Model[8] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 7
		wls40Model[9] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 7
		wls40Model[10] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 7
		wls40Model[11] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 7
		wls40Model[12] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 7
		wls40Model[13] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 7
		wls40Model[14] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 7
		wls40Model[15] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 7
		wls40Model[16] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 7
		wls40Model[17] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 7
		wls40Model[18] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 7
		wls40Model[19] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 7
		wls40Model[20] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 7
		wls40Model[21] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 7
		wls40Model[22] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 7
		wls40Model[23] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 7
		wls40Model[24] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 7
		wls40Model[25] = new ModelRendererTurbo(this, 345, 9, textureX, textureY); // Box 7
		wls40Model[26] = new ModelRendererTurbo(this, 361, 9, textureX, textureY); // Box 7
		wls40Model[27] = new ModelRendererTurbo(this, 377, 9, textureX, textureY); // Box 7
		wls40Model[28] = new ModelRendererTurbo(this, 393, 9, textureX, textureY); // Box 7
		wls40Model[29] = new ModelRendererTurbo(this, 409, 9, textureX, textureY); // Box 7
		wls40Model[30] = new ModelRendererTurbo(this, 425, 9, textureX, textureY); // Box 7
		wls40Model[31] = new ModelRendererTurbo(this, 441, 9, textureX, textureY); // Box 7
		wls40Model[32] = new ModelRendererTurbo(this, 457, 9, textureX, textureY); // Box 7
		wls40Model[33] = new ModelRendererTurbo(this, 473, 9, textureX, textureY); // Box 7
		wls40Model[34] = new ModelRendererTurbo(this, 489, 9, textureX, textureY); // Box 7
		wls40Model[35] = new ModelRendererTurbo(this, 281, 17, textureX, textureY); // Box 7
		wls40Model[36] = new ModelRendererTurbo(this, 297, 17, textureX, textureY); // Box 7
		wls40Model[37] = new ModelRendererTurbo(this, 313, 17, textureX, textureY); // Box 7
		wls40Model[38] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 7
		wls40Model[39] = new ModelRendererTurbo(this, 233, 17, textureX, textureY); // Box 7
		wls40Model[40] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 7
		wls40Model[41] = new ModelRendererTurbo(this, 113, 25, textureX, textureY); // Box 44
		wls40Model[42] = new ModelRendererTurbo(this, 153, 25, textureX, textureY); // Box 44
		wls40Model[43] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 46
		wls40Model[44] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 46
		wls40Model[45] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 46
		wls40Model[46] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 46
		wls40Model[47] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 46
		wls40Model[48] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 46
		wls40Model[49] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 46
		wls40Model[50] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 46
		wls40Model[51] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 46
		wls40Model[52] = new ModelRendererTurbo(this, 217, 17, textureX, textureY); // Box 46
		wls40Model[53] = new ModelRendererTurbo(this, 329, 17, textureX, textureY); // Box 46
		wls40Model[54] = new ModelRendererTurbo(this, 345, 17, textureX, textureY); // Box 46
		wls40Model[55] = new ModelRendererTurbo(this, 361, 17, textureX, textureY); // Box 46
		wls40Model[56] = new ModelRendererTurbo(this, 377, 17, textureX, textureY); // Box 46
		wls40Model[57] = new ModelRendererTurbo(this, 393, 17, textureX, textureY); // Box 46
		wls40Model[58] = new ModelRendererTurbo(this, 409, 17, textureX, textureY); // Box 46
		wls40Model[59] = new ModelRendererTurbo(this, 193, 25, textureX, textureY); // Box 44
		wls40Model[60] = new ModelRendererTurbo(this, 417, 17, textureX, textureY); // Box 44
		wls40Model[61] = new ModelRendererTurbo(this, 433, 17, textureX, textureY); // Box 44
		wls40Model[62] = new ModelRendererTurbo(this, 449, 17, textureX, textureY); // Box 44
		wls40Model[63] = new ModelRendererTurbo(this, 465, 17, textureX, textureY); // Box 44
		wls40Model[64] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 70
		wls40Model[65] = new ModelRendererTurbo(this, 505, 9, textureX, textureY); // Box 70
		wls40Model[66] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 70
		wls40Model[67] = new ModelRendererTurbo(this, 281, 17, textureX, textureY); // Box 70
		wls40Model[68] = new ModelRendererTurbo(this, 233, 25, textureX, textureY); // Box 74
		wls40Model[69] = new ModelRendererTurbo(this, 265, 25, textureX, textureY); // Box 74
		wls40Model[70] = new ModelRendererTurbo(this, 297, 25, textureX, textureY); // Box 74
		wls40Model[71] = new ModelRendererTurbo(this, 329, 25, textureX, textureY); // Box 74
		wls40Model[72] = new ModelRendererTurbo(this, 361, 25, textureX, textureY); // Box 78
		wls40Model[73] = new ModelRendererTurbo(this, 225, 33, textureX, textureY); // Box 2
		wls40Model[74] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 70
		wls40Model[75] = new ModelRendererTurbo(this, 257, 9, textureX, textureY); // Box 70
		wls40Model[76] = new ModelRendererTurbo(this, 233, 17, textureX, textureY); // Box 70
		wls40Model[77] = new ModelRendererTurbo(this, 297, 17, textureX, textureY); // Box 70
		wls40Model[78] = new ModelRendererTurbo(this, 313, 17, textureX, textureY); // Box 74
		wls40Model[79] = new ModelRendererTurbo(this, 489, 17, textureX, textureY); // Box 74
		wls40Model[80] = new ModelRendererTurbo(this, 505, 17, textureX, textureY); // Box 74
		wls40Model[81] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 74
		wls40Model[82] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 92
		wls40Model[83] = new ModelRendererTurbo(this, 105, 25, textureX, textureY); // Box 92
		wls40Model[84] = new ModelRendererTurbo(this, 185, 25, textureX, textureY); // Box 78
		wls40Model[85] = new ModelRendererTurbo(this, 385, 25, textureX, textureY); // Box 74
		wls40Model[86] = new ModelRendererTurbo(this, 401, 25, textureX, textureY); // Box 74
		wls40Model[87] = new ModelRendererTurbo(this, 481, 25, textureX, textureY); // Box 74
		wls40Model[88] = new ModelRendererTurbo(this, 497, 25, textureX, textureY); // Box 74
		wls40Model[89] = new ModelRendererTurbo(this, 113, 25, textureX, textureY); // Box 78
		wls40Model[90] = new ModelRendererTurbo(this, 289, 33, textureX, textureY); // Box 78
		wls40Model[91] = new ModelRendererTurbo(this, 305, 33, textureX, textureY); // Box 78
		wls40Model[92] = new ModelRendererTurbo(this, 329, 33, textureX, textureY); // Box 74
		wls40Model[93] = new ModelRendererTurbo(this, 337, 33, textureX, textureY); // Box 74
		wls40Model[94] = new ModelRendererTurbo(this, 345, 33, textureX, textureY); // Box 74
		wls40Model[95] = new ModelRendererTurbo(this, 353, 33, textureX, textureY); // Box 74
		wls40Model[96] = new ModelRendererTurbo(this, 345, 33, textureX, textureY); // Box 7
		wls40Model[97] = new ModelRendererTurbo(this, 361, 33, textureX, textureY); // Box 2
		wls40Model[98] = new ModelRendererTurbo(this, 393, 33, textureX, textureY); // Box 2
		wls40Model[99] = new ModelRendererTurbo(this, 369, 33, textureX, textureY); // Box 74
		wls40Model[100] = new ModelRendererTurbo(this, 393, 33, textureX, textureY); // Box 74
		wls40Model[101] = new ModelRendererTurbo(this, 457, 33, textureX, textureY); // Box 74
		wls40Model[102] = new ModelRendererTurbo(this, 465, 33, textureX, textureY); // Box 74
		wls40Model[103] = new ModelRendererTurbo(this, 457, 33, textureX, textureY); // Box 2
		wls40Model[104] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 2
		wls40Model[105] = new ModelRendererTurbo(this, 33, 41, textureX, textureY); // Box 2
		wls40Model[106] = new ModelRendererTurbo(this, 89, 41, textureX, textureY); // Box 2
		wls40Model[107] = new ModelRendererTurbo(this, 65, 41, textureX, textureY); // Box 2
		wls40Model[108] = new ModelRendererTurbo(this, 489, 33, textureX, textureY); // Box 2
		wls40Model[109] = new ModelRendererTurbo(this, 185, 33, textureX, textureY); // Box 2
		wls40Model[110] = new ModelRendererTurbo(this, 505, 33, textureX, textureY); // Box 2
		wls40Model[111] = new ModelRendererTurbo(this, 377, 33, textureX, textureY); // Box 2
		wls40Model[112] = new ModelRendererTurbo(this, 473, 33, textureX, textureY); // Box 2
		wls40Model[113] = new ModelRendererTurbo(this, 401, 33, textureX, textureY); // Box 2
		wls40Model[114] = new ModelRendererTurbo(this, 289, 9, textureX, textureY); // Box 2
		wls40Model[115] = new ModelRendererTurbo(this, 313, 9, textureX, textureY); // Box 2
		wls40Model[116] = new ModelRendererTurbo(this, 489, 33, textureX, textureY); // Box 2
		wls40Model[117] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 2
		wls40Model[118] = new ModelRendererTurbo(this, 41, 41, textureX, textureY); // Box 2
		wls40Model[119] = new ModelRendererTurbo(this, 49, 41, textureX, textureY); // Box 2
		wls40Model[120] = new ModelRendererTurbo(this, 65, 41, textureX, textureY); // Box 2
		wls40Model[121] = new ModelRendererTurbo(this, 89, 41, textureX, textureY); // Box 2
		wls40Model[122] = new ModelRendererTurbo(this, 97, 41, textureX, textureY); // Box 2
		wls40Model[123] = new ModelRendererTurbo(this, 105, 41, textureX, textureY); // Box 2
		wls40Model[124] = new ModelRendererTurbo(this, 137, 41, textureX, textureY); // Box 2
		wls40Model[125] = new ModelRendererTurbo(this, 145, 41, textureX, textureY); // Box 2
		wls40Model[126] = new ModelRendererTurbo(this, 153, 41, textureX, textureY); // Box 2
		wls40Model[127] = new ModelRendererTurbo(this, 161, 41, textureX, textureY); // Box 2
		wls40Model[128] = new ModelRendererTurbo(this, 169, 41, textureX, textureY); // Box 2
		wls40Model[129] = new ModelRendererTurbo(this, 177, 41, textureX, textureY); // Box 2
		wls40Model[130] = new ModelRendererTurbo(this, 193, 41, textureX, textureY); // Box 2
		wls40Model[131] = new ModelRendererTurbo(this, 201, 41, textureX, textureY); // Box 2
		wls40Model[132] = new ModelRendererTurbo(this, 217, 41, textureX, textureY); // Box 2
		wls40Model[133] = new ModelRendererTurbo(this, 297, 41, textureX, textureY); // Box 7
		wls40Model[134] = new ModelRendererTurbo(this, 297, 41, textureX, textureY); // Box 7
		wls40Model[135] = new ModelRendererTurbo(this, 321, 41, textureX, textureY); // Box 7
		wls40Model[136] = new ModelRendererTurbo(this, 169, 49, textureX, textureY); // Box 7
		wls40Model[137] = new ModelRendererTurbo(this, 201, 49, textureX, textureY); // Box 7
		wls40Model[138] = new ModelRendererTurbo(this, 329, 41, textureX, textureY); // Box 7
		wls40Model[139] = new ModelRendererTurbo(this, 329, 41, textureX, textureY); // Box 7
		wls40Model[140] = new ModelRendererTurbo(this, 465, 41, textureX, textureY); // Box 7
		wls40Model[141] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 7
		wls40Model[142] = new ModelRendererTurbo(this, 97, 49, textureX, textureY); // Box 2
		wls40Model[143] = new ModelRendererTurbo(this, 137, 49, textureX, textureY); // Box 2
		wls40Model[144] = new ModelRendererTurbo(this, 153, 49, textureX, textureY); // Box 2
		wls40Model[145] = new ModelRendererTurbo(this, 505, 49, textureX, textureY); // Box 2
		wls40Model[146] = new ModelRendererTurbo(this, 193, 49, textureX, textureY); // Box 2
		wls40Model[147] = new ModelRendererTurbo(this, 233, 57, textureX, textureY); // Box 2
		wls40Model[148] = new ModelRendererTurbo(this, 249, 57, textureX, textureY); // Box 2
		wls40Model[149] = new ModelRendererTurbo(this, 289, 41, textureX, textureY); // Box 74
		wls40Model[150] = new ModelRendererTurbo(this, 345, 41, textureX, textureY); // Box 74
		wls40Model[151] = new ModelRendererTurbo(this, 369, 41, textureX, textureY); // Box 74
		wls40Model[152] = new ModelRendererTurbo(this, 393, 41, textureX, textureY); // Box 74
		wls40Model[153] = new ModelRendererTurbo(this, 233, 41, textureX, textureY); // Box 2
		wls40Model[154] = new ModelRendererTurbo(this, 305, 41, textureX, textureY); // Box 2
		wls40Model[155] = new ModelRendererTurbo(this, 353, 41, textureX, textureY); // Box 2
		wls40Model[156] = new ModelRendererTurbo(this, 401, 41, textureX, textureY); // Box 2
		wls40Model[157] = new ModelRendererTurbo(this, 457, 41, textureX, textureY); // Box 2
		wls40Model[158] = new ModelRendererTurbo(this, 481, 17, textureX, textureY); // Box 2
		wls40Model[159] = new ModelRendererTurbo(this, 17, 57, textureX, textureY); // Box 2
		wls40Model[160] = new ModelRendererTurbo(this, 265, 57, textureX, textureY); // Box 2
		wls40Model[161] = new ModelRendererTurbo(this, 281, 57, textureX, textureY); // Box 2
		wls40Model[162] = new ModelRendererTurbo(this, 409, 57, textureX, textureY); // Box 2
		wls40Model[163] = new ModelRendererTurbo(this, 497, 17, textureX, textureY); // Box 2
		wls40Model[164] = new ModelRendererTurbo(this, 49, 49, textureX, textureY); // Box 2
		wls40Model[165] = new ModelRendererTurbo(this, 177, 49, textureX, textureY); // Box 2
		wls40Model[166] = new ModelRendererTurbo(this, 193, 49, textureX, textureY); // Box 2
		wls40Model[167] = new ModelRendererTurbo(this, 25, 65, textureX, textureY); // Box 2
		wls40Model[168] = new ModelRendererTurbo(this, 57, 65, textureX, textureY); // Box 2
		wls40Model[169] = new ModelRendererTurbo(this, 105, 65, textureX, textureY); // Box 2
		wls40Model[170] = new ModelRendererTurbo(this, 153, 57, textureX, textureY); // Box 2
		wls40Model[171] = new ModelRendererTurbo(this, 209, 49, textureX, textureY); // Box 173
		wls40Model[172] = new ModelRendererTurbo(this, 297, 49, textureX, textureY); // Box 173
		wls40Model[173] = new ModelRendererTurbo(this, 305, 49, textureX, textureY); // Box 175
		wls40Model[174] = new ModelRendererTurbo(this, 321, 49, textureX, textureY); // Box 175
		wls40Model[175] = new ModelRendererTurbo(this, 377, 49, textureX, textureY); // Box 175
		wls40Model[176] = new ModelRendererTurbo(this, 345, 9, textureX, textureY); // Box 178
		wls40Model[177] = new ModelRendererTurbo(this, 377, 9, textureX, textureY); // Box 178
		wls40Model[178] = new ModelRendererTurbo(this, 465, 49, textureX, textureY); // Box 180
		wls40Model[179] = new ModelRendererTurbo(this, 489, 49, textureX, textureY); // Box 180
		wls40Model[180] = new ModelRendererTurbo(this, 417, 57, textureX, textureY); // Box 180
		wls40Model[181] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 180
		wls40Model[182] = new ModelRendererTurbo(this, 25, 57, textureX, textureY); // Box 180
		wls40Model[183] = new ModelRendererTurbo(this, 473, 49, textureX, textureY); // Box 178
		wls40Model[184] = new ModelRendererTurbo(this, 41, 57, textureX, textureY); // Box 178
		wls40Model[185] = new ModelRendererTurbo(this, 49, 57, textureX, textureY); // Box 178
		wls40Model[186] = new ModelRendererTurbo(this, 65, 57, textureX, textureY); // Box 180
		wls40Model[187] = new ModelRendererTurbo(this, 73, 57, textureX, textureY); // Box 180
		wls40Model[188] = new ModelRendererTurbo(this, 305, 65, textureX, textureY); // Box 180
		wls40Model[189] = new ModelRendererTurbo(this, 97, 65, textureX, textureY); // Box 180
		wls40Model[190] = new ModelRendererTurbo(this, 169, 57, textureX, textureY); // Box 180
		wls40Model[191] = new ModelRendererTurbo(this, 89, 57, textureX, textureY); // Box 178
		wls40Model[192] = new ModelRendererTurbo(this, 161, 57, textureX, textureY); // Box 178
		wls40Model[193] = new ModelRendererTurbo(this, 225, 57, textureX, textureY); // Box 178
		wls40Model[194] = new ModelRendererTurbo(this, 225, 57, textureX, textureY); // Box 3
		wls40Model[195] = new ModelRendererTurbo(this, 345, 57, textureX, textureY); // Box 2
		wls40Model[196] = new ModelRendererTurbo(this, 297, 65, textureX, textureY); // Box 2
		wls40Model[197] = new ModelRendererTurbo(this, 417, 65, textureX, textureY); // Box 2
		wls40Model[198] = new ModelRendererTurbo(this, 193, 65, textureX, textureY); // Box 2
		wls40Model[199] = new ModelRendererTurbo(this, 401, 65, textureX, textureY); // Box 2
		wls40Model[200] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 201
		wls40Model[201] = new ModelRendererTurbo(this, 273, 57, textureX, textureY); // Box 201
		wls40Model[202] = new ModelRendererTurbo(this, 433, 57, textureX, textureY); // Box 2
		wls40Model[203] = new ModelRendererTurbo(this, 129, 65, textureX, textureY); // Box 2
		wls40Model[204] = new ModelRendererTurbo(this, 433, 65, textureX, textureY); // Box 7
		wls40Model[205] = new ModelRendererTurbo(this, 273, 73, textureX, textureY); // Box 7
		wls40Model[206] = new ModelRendererTurbo(this, 153, 65, textureX, textureY); // Box 70
		wls40Model[207] = new ModelRendererTurbo(this, 25, 73, textureX, textureY); // Box 70
		wls40Model[208] = new ModelRendererTurbo(this, 41, 73, textureX, textureY); // Box 70
		wls40Model[209] = new ModelRendererTurbo(this, 97, 73, textureX, textureY); // Box 70
		wls40Model[210] = new ModelRendererTurbo(this, 329, 65, textureX, textureY); // Box 7
		wls40Model[211] = new ModelRendererTurbo(this, 209, 73, textureX, textureY); // Box 7
		wls40Model[212] = new ModelRendererTurbo(this, 169, 73, textureX, textureY); // Box 7
		wls40Model[213] = new ModelRendererTurbo(this, 281, 57, textureX, textureY); // Box 7
		wls40Model[214] = new ModelRendererTurbo(this, 505, 65, textureX, textureY); // Box 7
		wls40Model[215] = new ModelRendererTurbo(this, 297, 73, textureX, textureY); // Box 7
		wls40Model[216] = new ModelRendererTurbo(this, 345, 73, textureX, textureY); // Box 7
		wls40Model[217] = new ModelRendererTurbo(this, 209, 73, textureX, textureY); // Box 7
		wls40Model[218] = new ModelRendererTurbo(this, 289, 73, textureX, textureY); // Box 7
		wls40Model[219] = new ModelRendererTurbo(this, 377, 73, textureX, textureY); // Box 7
		wls40Model[220] = new ModelRendererTurbo(this, 353, 57, textureX, textureY, "lamp"); // Box 224
		wls40Model[221] = new ModelRendererTurbo(this, 57, 65, textureX, textureY, "lamp"); // Box 224
		wls40Model[222] = new ModelRendererTurbo(this, 425, 65, textureX, textureY, "lamp"); // Box 224
		wls40Model[223] = new ModelRendererTurbo(this, 225, 73, textureX, textureY, "lamp"); // Box 224
		wls40Model[224] = new ModelRendererTurbo(this, 233, 73, textureX, textureY); // Box 224
		wls40Model[225] = new ModelRendererTurbo(this, 249, 73, textureX, textureY); // Box 224
		wls40Model[226] = new ModelRendererTurbo(this, 257, 73, textureX, textureY); // Box 224
		wls40Model[227] = new ModelRendererTurbo(this, 321, 73, textureX, textureY); // Box 224
		wls40Model[228] = new ModelRendererTurbo(this, 297, 65, textureX, textureY); // Box 235
		wls40Model[229] = new ModelRendererTurbo(this, 369, 73, textureX, textureY, "lamp"); // Box 224
		wls40Model[230] = new ModelRendererTurbo(this, 377, 73, textureX, textureY, "lamp"); // Box 224
		wls40Model[231] = new ModelRendererTurbo(this, 385, 73, textureX, textureY, "lamp"); // Box 224
		wls40Model[232] = new ModelRendererTurbo(this, 473, 73, textureX, textureY, "lamp"); // Box 224
		wls40Model[233] = new ModelRendererTurbo(this, 481, 73, textureX, textureY); // Box 224
		wls40Model[234] = new ModelRendererTurbo(this, 489, 73, textureX, textureY); // Box 224
		wls40Model[235] = new ModelRendererTurbo(this, 497, 73, textureX, textureY); // Box 224
		wls40Model[236] = new ModelRendererTurbo(this, 505, 73, textureX, textureY); // Box 224
		wls40Model[237] = new ModelRendererTurbo(this, 97, 81, textureX, textureY); // Box 235
		wls40Model[238] = new ModelRendererTurbo(this, 105, 81, textureX, textureY); // Box 245
		wls40Model[239] = new ModelRendererTurbo(this, 113, 81, textureX, textureY); // Box 245
		wls40Model[240] = new ModelRendererTurbo(this, 121, 81, textureX, textureY); // Box 245
		wls40Model[241] = new ModelRendererTurbo(this, 169, 81, textureX, textureY); // Box 245
		wls40Model[242] = new ModelRendererTurbo(this, 417, 81, textureX, textureY); // Box 245
		wls40Model[243] = new ModelRendererTurbo(this, 177, 81, textureX, textureY); // Box 245
		wls40Model[244] = new ModelRendererTurbo(this, 257, 25, textureX, textureY); // Box 7
		wls40Model[245] = new ModelRendererTurbo(this, 289, 25, textureX, textureY); // Box 7
		wls40Model[246] = new ModelRendererTurbo(this, 321, 25, textureX, textureY); // Box 7
		wls40Model[247] = new ModelRendererTurbo(this, 353, 25, textureX, textureY); // Box 7
		wls40Model[248] = new ModelRendererTurbo(this, 393, 25, textureX, textureY); // Box 7
		wls40Model[249] = new ModelRendererTurbo(this, 409, 25, textureX, textureY); // Box 7
		wls40Model[250] = new ModelRendererTurbo(this, 425, 25, textureX, textureY); // Box 7
		wls40Model[251] = new ModelRendererTurbo(this, 441, 25, textureX, textureY); // Box 7
		wls40Model[252] = new ModelRendererTurbo(this, 457, 25, textureX, textureY); // Box 7
		wls40Model[253] = new ModelRendererTurbo(this, 473, 25, textureX, textureY); // Box 7
		wls40Model[254] = new ModelRendererTurbo(this, 489, 25, textureX, textureY); // Box 7
		wls40Model[255] = new ModelRendererTurbo(this, 297, 33, textureX, textureY); // Box 7
		wls40Model[256] = new ModelRendererTurbo(this, 329, 33, textureX, textureY); // Box 7
		wls40Model[257] = new ModelRendererTurbo(this, 337, 33, textureX, textureY); // Box 7
		wls40Model[258] = new ModelRendererTurbo(this, 345, 33, textureX, textureY); // Box 7
		wls40Model[259] = new ModelRendererTurbo(this, 41, 41, textureX, textureY); // Box 7
		wls40Model[260] = new ModelRendererTurbo(this, 89, 41, textureX, textureY); // Box 7
		wls40Model[261] = new ModelRendererTurbo(this, 97, 41, textureX, textureY); // Box 7
		wls40Model[262] = new ModelRendererTurbo(this, 137, 41, textureX, textureY); // Box 7
		wls40Model[263] = new ModelRendererTurbo(this, 145, 41, textureX, textureY); // Box 7
		wls40Model[264] = new ModelRendererTurbo(this, 193, 41, textureX, textureY); // Box 7
		wls40Model[265] = new ModelRendererTurbo(this, 209, 41, textureX, textureY); // Box 7
		wls40Model[266] = new ModelRendererTurbo(this, 297, 49, textureX, textureY); // Box 7
		wls40Model[267] = new ModelRendererTurbo(this, 33, 57, textureX, textureY); // Box 7
		wls40Model[268] = new ModelRendererTurbo(this, 41, 57, textureX, textureY); // Box 7
		wls40Model[269] = new ModelRendererTurbo(this, 81, 57, textureX, textureY); // Box 7
		wls40Model[270] = new ModelRendererTurbo(this, 89, 57, textureX, textureY); // Box 7
		wls40Model[271] = new ModelRendererTurbo(this, 417, 65, textureX, textureY); // Box 7
		wls40Model[272] = new ModelRendererTurbo(this, 17, 73, textureX, textureY); // Box 7
		wls40Model[273] = new ModelRendererTurbo(this, 33, 73, textureX, textureY); // Box 7
		wls40Model[274] = new ModelRendererTurbo(this, 49, 73, textureX, textureY); // Box 7
		wls40Model[275] = new ModelRendererTurbo(this, 369, 73, textureX, textureY); // Box 7
		wls40Model[276] = new ModelRendererTurbo(this, 377, 73, textureX, textureY); // Box 7
		wls40Model[277] = new ModelRendererTurbo(this, 473, 73, textureX, textureY); // Box 7
		wls40Model[278] = new ModelRendererTurbo(this, 481, 73, textureX, textureY); // Box 7
		wls40Model[279] = new ModelRendererTurbo(this, 489, 73, textureX, textureY); // Box 7
		wls40Model[280] = new ModelRendererTurbo(this, 497, 73, textureX, textureY); // Box 7
		wls40Model[281] = new ModelRendererTurbo(this, 89, 81, textureX, textureY); // Box 7
		wls40Model[282] = new ModelRendererTurbo(this, 169, 81, textureX, textureY); // Box 7
		wls40Model[283] = new ModelRendererTurbo(this, 265, 81, textureX, textureY); // Box 7
		wls40Model[284] = new ModelRendererTurbo(this, 289, 81, textureX, textureY); // Box 7
		wls40Model[285] = new ModelRendererTurbo(this, 321, 81, textureX, textureY); // Box 7
		wls40Model[286] = new ModelRendererTurbo(this, 345, 81, textureX, textureY); // Box 7
		wls40Model[287] = new ModelRendererTurbo(this, 369, 81, textureX, textureY); // Box 7
		wls40Model[288] = new ModelRendererTurbo(this, 377, 81, textureX, textureY); // Box 7
		wls40Model[289] = new ModelRendererTurbo(this, 425, 81, textureX, textureY); // Box 7
		wls40Model[290] = new ModelRendererTurbo(this, 433, 81, textureX, textureY); // Box 7
		wls40Model[291] = new ModelRendererTurbo(this, 441, 81, textureX, textureY); // Box 7
		wls40Model[292] = new ModelRendererTurbo(this, 425, 81, textureX, textureY); // Box 318
		wls40Model[293] = new ModelRendererTurbo(this, 321, 81, textureX, textureY); // Box 319
		wls40Model[294] = new ModelRendererTurbo(this, 353, 81, textureX, textureY); // Box 319
		wls40Model[295] = new ModelRendererTurbo(this, 441, 81, textureX, textureY); // Box 321
		wls40Model[296] = new ModelRendererTurbo(this, 473, 81, textureX, textureY); // Box 321
		wls40Model[297] = new ModelRendererTurbo(this, 433, 81, textureX, textureY); // Box 318
		wls40Model[298] = new ModelRendererTurbo(this, 369, 81, textureX, textureY); // Box 319
		wls40Model[299] = new ModelRendererTurbo(this, 377, 81, textureX, textureY); // Box 319
		wls40Model[300] = new ModelRendererTurbo(this, 441, 81, textureX, textureY); // Box 318
		wls40Model[301] = new ModelRendererTurbo(this, 385, 81, textureX, textureY); // Box 319
		wls40Model[302] = new ModelRendererTurbo(this, 457, 81, textureX, textureY); // Box 319
		wls40Model[303] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 321
		wls40Model[304] = new ModelRendererTurbo(this, 33, 89, textureX, textureY); // Box 321
		wls40Model[305] = new ModelRendererTurbo(this, 465, 81, textureX, textureY); // Box 318
		wls40Model[306] = new ModelRendererTurbo(this, 473, 81, textureX, textureY); // Box 319
		wls40Model[307] = new ModelRendererTurbo(this, 489, 81, textureX, textureY); // Box 319
		wls40Model[308] = new ModelRendererTurbo(this, 49, 89, textureX, textureY); // Box 321
		wls40Model[309] = new ModelRendererTurbo(this, 489, 81, textureX, textureY); // Box 7
		wls40Model[310] = new ModelRendererTurbo(this, 497, 81, textureX, textureY); // Box 7
		wls40Model[311] = new ModelRendererTurbo(this, 17, 89, textureX, textureY); // Box 7
		wls40Model[312] = new ModelRendererTurbo(this, 25, 89, textureX, textureY); // Box 7
		wls40Model[313] = new ModelRendererTurbo(this, 49, 89, textureX, textureY); // Box 7
		wls40Model[314] = new ModelRendererTurbo(this, 73, 89, textureX, textureY); // Box 7
		wls40Model[315] = new ModelRendererTurbo(this, 81, 89, textureX, textureY); // Box 7
		wls40Model[316] = new ModelRendererTurbo(this, 89, 89, textureX, textureY); // Box 7
		wls40Model[317] = new ModelRendererTurbo(this, 97, 89, textureX, textureY); // Box 7
		wls40Model[318] = new ModelRendererTurbo(this, 105, 89, textureX, textureY); // Box 7
		wls40Model[319] = new ModelRendererTurbo(this, 113, 89, textureX, textureY); // Box 7
		wls40Model[320] = new ModelRendererTurbo(this, 121, 89, textureX, textureY); // Box 7
		wls40Model[321] = new ModelRendererTurbo(this, 129, 89, textureX, textureY); // Box 7
		wls40Model[322] = new ModelRendererTurbo(this, 137, 89, textureX, textureY); // Box 7
		wls40Model[323] = new ModelRendererTurbo(this, 145, 89, textureX, textureY); // Box 7
		wls40Model[324] = new ModelRendererTurbo(this, 153, 89, textureX, textureY); // Box 7
		wls40Model[325] = new ModelRendererTurbo(this, 217, 89, textureX, textureY); // Box 2
		wls40Model[326] = new ModelRendererTurbo(this, 249, 89, textureX, textureY); // Box 360
		wls40Model[327] = new ModelRendererTurbo(this, 273, 89, textureX, textureY); // Box 360
		wls40Model[328] = new ModelRendererTurbo(this, 497, 81, textureX, textureY); // Box 360
		wls40Model[329] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 363
		wls40Model[330] = new ModelRendererTurbo(this, 33, 89, textureX, textureY); // Box 363
		wls40Model[331] = new ModelRendererTurbo(this, 505, 81, textureX, textureY); // Box 363
		wls40Model[332] = new ModelRendererTurbo(this, 17, 89, textureX, textureY); // Box 363
		wls40Model[333] = new ModelRendererTurbo(this, 25, 89, textureX, textureY); // Box 363
		wls40Model[334] = new ModelRendererTurbo(this, 57, 89, textureX, textureY); // Box 363
		wls40Model[335] = new ModelRendererTurbo(this, 49, 89, textureX, textureY); // Box 363
		wls40Model[336] = new ModelRendererTurbo(this, 73, 89, textureX, textureY); // Box 363
		wls40Model[337] = new ModelRendererTurbo(this, 81, 89, textureX, textureY); // Box 363
		wls40Model[338] = new ModelRendererTurbo(this, 161, 89, textureX, textureY); // Box 363
		wls40Model[339] = new ModelRendererTurbo(this, 89, 89, textureX, textureY); // Box 363
		wls40Model[340] = new ModelRendererTurbo(this, 97, 89, textureX, textureY); // Box 363
		wls40Model[341] = new ModelRendererTurbo(this, 201, 89, textureX, textureY); // Box 363
		wls40Model[342] = new ModelRendererTurbo(this, 329, 89, textureX, textureY); // Box 363
		wls40Model[343] = new ModelRendererTurbo(this, 337, 89, textureX, textureY); // Box 363
		wls40Model[344] = new ModelRendererTurbo(this, 409, 89, textureX, textureY); // Box 363
		wls40Model[345] = new ModelRendererTurbo(this, 417, 89, textureX, textureY); // Box 363
		wls40Model[346] = new ModelRendererTurbo(this, 505, 89, textureX, textureY); // Box 363
		wls40Model[347] = new ModelRendererTurbo(this, 105, 89, textureX, textureY); // Box 388
		wls40Model[348] = new ModelRendererTurbo(this, 73, 97, textureX, textureY); // Box 321
		wls40Model[349] = new ModelRendererTurbo(this, 113, 89, textureX, textureY); // Box 321
		wls40Model[350] = new ModelRendererTurbo(this, 265, 89, textureX, textureY); // Box 363
		wls40Model[351] = new ModelRendererTurbo(this, 289, 89, textureX, textureY); // Box 321
		wls40Model[352] = new ModelRendererTurbo(this, 457, 89, textureX, textureY); // Box 224
		wls40Model[353] = new ModelRendererTurbo(this, 473, 89, textureX, textureY); // Box 224
		wls40Model[354] = new ModelRendererTurbo(this, 489, 89, textureX, textureY); // Box 224
		wls40Model[355] = new ModelRendererTurbo(this, 497, 89, textureX, textureY); // Box 224
		wls40Model[356] = new ModelRendererTurbo(this, 89, 97, textureX, textureY); // Box 321
		wls40Model[357] = new ModelRendererTurbo(this, 417, 89, textureX, textureY); // Box 178
		wls40Model[358] = new ModelRendererTurbo(this, 89, 97, textureX, textureY); // Box 363
		wls40Model[359] = new ModelRendererTurbo(this, 121, 89, textureX, textureY); // Box 74
		wls40Model[360] = new ModelRendererTurbo(this, 129, 89, textureX, textureY); // Box 74
		wls40Model[361] = new ModelRendererTurbo(this, 137, 89, textureX, textureY); // Box 74
		wls40Model[362] = new ModelRendererTurbo(this, 145, 89, textureX, textureY); // Box 74
		wls40Model[363] = new ModelRendererTurbo(this, 153, 89, textureX, textureY); // Box 74
		wls40Model[364] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 74
		wls40Model[365] = new ModelRendererTurbo(this, 17, 97, textureX, textureY); // Box 74
		wls40Model[366] = new ModelRendererTurbo(this, 25, 97, textureX, textureY); // Box 74
		wls40Model[367] = new ModelRendererTurbo(this, 33, 97, textureX, textureY); // Box 321
		wls40Model[368] = new ModelRendererTurbo(this, 49, 97, textureX, textureY); // Box 321
		wls40Model[369] = new ModelRendererTurbo(this, 57, 97, textureX, textureY); // Box 321
		wls40Model[370] = new ModelRendererTurbo(this, 81, 97, textureX, textureY); // Box 321
		wls40Model[371] = new ModelRendererTurbo(this, 121, 97, textureX, textureY); // Box 2
		wls40Model[372] = new ModelRendererTurbo(this, 145, 97, textureX, textureY); // Box 2
		wls40Model[373] = new ModelRendererTurbo(this, 105, 97, textureX, textureY); // Box 7
		wls40Model[374] = new ModelRendererTurbo(this, 169, 97, textureX, textureY); // Box 7
		wls40Model[375] = new ModelRendererTurbo(this, 177, 97, textureX, textureY); // Box 7
		wls40Model[376] = new ModelRendererTurbo(this, 185, 97, textureX, textureY); // Box 7
		wls40Model[377] = new ModelRendererTurbo(this, 193, 97, textureX, textureY); // Box 7
		wls40Model[378] = new ModelRendererTurbo(this, 201, 97, textureX, textureY); // Box 7
		wls40Model[379] = new ModelRendererTurbo(this, 209, 97, textureX, textureY); // Box 7
		wls40Model[380] = new ModelRendererTurbo(this, 217, 97, textureX, textureY); // Box 7
		wls40Model[381] = new ModelRendererTurbo(this, 249, 97, textureX, textureY); // Box 7
		wls40Model[382] = new ModelRendererTurbo(this, 257, 97, textureX, textureY); // Box 7
		wls40Model[383] = new ModelRendererTurbo(this, 265, 97, textureX, textureY); // Box 7
		wls40Model[384] = new ModelRendererTurbo(this, 273, 97, textureX, textureY); // Box 7
		wls40Model[385] = new ModelRendererTurbo(this, 281, 97, textureX, textureY); // Box 7
		wls40Model[386] = new ModelRendererTurbo(this, 289, 97, textureX, textureY); // Box 7
		wls40Model[387] = new ModelRendererTurbo(this, 297, 97, textureX, textureY); // Box 7
		wls40Model[388] = new ModelRendererTurbo(this, 305, 97, textureX, textureY); // Box 7
		wls40Model[389] = new ModelRendererTurbo(this, 225, 97, textureX, textureY); // Box 391
		wls40Model[390] = new ModelRendererTurbo(this, 313, 97, textureX, textureY); // Box 391
		wls40Model[391] = new ModelRendererTurbo(this, 113, 97, textureX, textureY); // Box 363
		wls40Model[392] = new ModelRendererTurbo(this, 329, 97, textureX, textureY); // Box 363
		wls40Model[393] = new ModelRendererTurbo(this, 169, 97, textureX, textureY); // Box 321

		wls40Model[0].addBox(0F, 0F, 0F, 8, 8, 0, 0F); // Box 1
		wls40Model[0].setRotationPoint(-37F, 1F, -6F);

		wls40Model[1].addShapeBox(0F, 0F, 0F, 46, 8, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		wls40Model[1].setRotationPoint(-53F, -1F, -5F);

		wls40Model[2].addBox(0F, 0F, 0F, 45, 1, 20, 0F); // Box 3
		wls40Model[2].setRotationPoint(-53F, -2F, -10F);

		wls40Model[3].addBox(0F, 0F, 0F, 8, 8, 0, 0F); // Box 1
		wls40Model[3].setRotationPoint(-20F, 1F, -6F);

		wls40Model[4].addBox(0F, 0F, 0F, 8, 8, 0, 0F); // Box 1
		wls40Model[4].setRotationPoint(-37F, 1F, 6F);

		wls40Model[5].addBox(0F, 0F, 0F, 8, 8, 0, 0F); // Box 1
		wls40Model[5].setRotationPoint(-20F, 1F, 6F);

		wls40Model[6].addBox(0F, 0F, 0F, 1, 10, 13, 0F); // Box 7
		wls40Model[6].setRotationPoint(-54F, -2F, -6.5F);

		wls40Model[7].addBox(0F, 0F, 0F, 2, 2, 4, 0F); // Box 7
		wls40Model[7].setRotationPoint(7F, 4F, -2F);

		wls40Model[8].addShapeBox(-1F, 0F, 0F, 2, 4, 8, 0F, 0F, 0F, 0F, -1F, 0F, -2F, -1F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -2F, -1F, 0F, -2F, 0F, 0F, 0F); // Box 7
		wls40Model[8].setRotationPoint(10F, 3F, -4F);

		wls40Model[9].addShapeBox(0F, 0F, 0F, 1, 9, 2, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 7
		wls40Model[9].setRotationPoint(-53F, -11F, -6.5F);

		wls40Model[10].addShapeBox(0F, 0F, 0F, 1, 2, 9, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 7
		wls40Model[10].setRotationPoint(-53F, -4F, -4.5F);

		wls40Model[11].addShapeBox(0F, 0F, 0F, 1, 6, 2, 0F, 0F, 0F, 2F, -0.75F, 0F, 2F, -0.75F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 7
		wls40Model[11].setRotationPoint(-53F, -17F, 4.5F);

		wls40Model[12].addShapeBox(0F, 0F, 0F, 1, 9, 2, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 7
		wls40Model[12].setRotationPoint(-53F, -11F, 4.5F);

		wls40Model[13].addShapeBox(0F, 0F, 0F, 1, 6, 2, 0F, 0F, 0F, -2F, -0.75F, 0F, -2F, -0.75F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 7
		wls40Model[13].setRotationPoint(-53F, -17F, -6.5F);

		wls40Model[14].addShapeBox(0F, 0F, 0F, 1, 2, 9, 0F, 0F, 0F, -0.7F, -0.75F, 0F, -0.7F, -0.75F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 7
		wls40Model[14].setRotationPoint(-53F, -19F, -4.5F);

		wls40Model[15].addShapeBox(-0.25F, 0F, 0F, 1, 0, 9, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 7
		wls40Model[15].setRotationPoint(-52.85F, -4.5F, -4.5F);
		wls40Model[15].rotateAngleZ = 0.54105207F;

		wls40Model[16].addShapeBox(-0.25F, 0F, 0F, 1, 0, 9, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 7
		wls40Model[16].setRotationPoint(-52.85F, -5F, -4.5F);
		wls40Model[16].rotateAngleZ = 0.54105207F;

		wls40Model[17].addShapeBox(-0.25F, 0F, 0F, 1, 0, 9, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 7
		wls40Model[17].setRotationPoint(-52.85F, -5.5F, -4.5F);
		wls40Model[17].rotateAngleZ = 0.54105207F;

		wls40Model[18].addShapeBox(-0.25F, 0F, 0F, 1, 0, 9, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 7
		wls40Model[18].setRotationPoint(-52.85F, -6F, -4.5F);
		wls40Model[18].rotateAngleZ = 0.54105207F;

		wls40Model[19].addShapeBox(-0.25F, 0F, 0F, 1, 0, 9, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 7
		wls40Model[19].setRotationPoint(-52.85F, -6.5F, -4.5F);
		wls40Model[19].rotateAngleZ = 0.54105207F;

		wls40Model[20].addShapeBox(-0.25F, 0F, 0F, 1, 0, 9, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 7
		wls40Model[20].setRotationPoint(-52.85F, -7F, -4.5F);
		wls40Model[20].rotateAngleZ = 0.54105207F;

		wls40Model[21].addShapeBox(-0.25F, 0F, 0F, 1, 0, 9, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 7
		wls40Model[21].setRotationPoint(-52.85F, -7.5F, -4.5F);
		wls40Model[21].rotateAngleZ = 0.54105207F;

		wls40Model[22].addShapeBox(-0.25F, 0F, 0F, 1, 0, 9, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 7
		wls40Model[22].setRotationPoint(-52.85F, -8F, -4.5F);
		wls40Model[22].rotateAngleZ = 0.54105207F;

		wls40Model[23].addShapeBox(-0.25F, 0F, 0F, 1, 0, 9, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 7
		wls40Model[23].setRotationPoint(-52.85F, -8.5F, -4.5F);
		wls40Model[23].rotateAngleZ = 0.54105207F;

		wls40Model[24].addShapeBox(-0.25F, 0F, 0F, 1, 0, 9, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 7
		wls40Model[24].setRotationPoint(-52.85F, -9F, -4.5F);
		wls40Model[24].rotateAngleZ = 0.54105207F;

		wls40Model[25].addShapeBox(-0.25F, 0F, 0F, 1, 0, 9, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 7
		wls40Model[25].setRotationPoint(-52.85F, -9.5F, -4.5F);
		wls40Model[25].rotateAngleZ = 0.54105207F;

		wls40Model[26].addShapeBox(-0.25F, 0F, 0F, 1, 0, 9, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 7
		wls40Model[26].setRotationPoint(-52.85F, -10F, -4.5F);
		wls40Model[26].rotateAngleZ = 0.54105207F;

		wls40Model[27].addShapeBox(-0.25F, 0F, 0F, 1, 0, 9, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 7
		wls40Model[27].setRotationPoint(-52.85F, -10.5F, -4.5F);
		wls40Model[27].rotateAngleZ = 0.54105207F;

		wls40Model[28].addShapeBox(-0.25F, 0F, 0F, 1, 0, 9, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 7
		wls40Model[28].setRotationPoint(-52.85F, -11F, -4.5F);
		wls40Model[28].rotateAngleZ = 0.54105207F;

		wls40Model[29].addShapeBox(-0.25F, 0F, 0F, 1, 0, 9, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 7
		wls40Model[29].setRotationPoint(-52.85F, -11.5F, -4.45F);
		wls40Model[29].rotateAngleZ = 0.54105207F;

		wls40Model[30].addShapeBox(-0.25F, 0F, 0F, 1, 0, 9, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 7
		wls40Model[30].setRotationPoint(-52.85F, -12F, -4.25F);
		wls40Model[30].rotateAngleZ = 0.54105207F;

		wls40Model[31].addShapeBox(-0.25F, 0F, 0F, 1, 0, 9, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.8F, 0F, 0F, -0.8F); // Box 7
		wls40Model[31].setRotationPoint(-52.85F, -12.5F, -4.1F);
		wls40Model[31].rotateAngleZ = 0.54105207F;

		wls40Model[32].addShapeBox(-0.25F, 0F, 0F, 1, 0, 8, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 7
		wls40Model[32].setRotationPoint(-52.85F, -13F, -3.9F);
		wls40Model[32].rotateAngleZ = 0.54105207F;

		wls40Model[33].addShapeBox(-0.25F, 0F, 0F, 1, 0, 8, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 7
		wls40Model[33].setRotationPoint(-52.85F, -13.5F, -3.75F);
		wls40Model[33].rotateAngleZ = 0.54105207F;

		wls40Model[34].addShapeBox(-0.25F, 0F, 0F, 1, 0, 8, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.8F, 0F, 0F, -0.8F); // Box 7
		wls40Model[34].setRotationPoint(-52.85F, -14F, -3.58F);
		wls40Model[34].rotateAngleZ = 0.54105207F;

		wls40Model[35].addShapeBox(-0.25F, 0F, 0F, 1, 0, 7, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 7
		wls40Model[35].setRotationPoint(-52.85F, -14.5F, -3.45F);
		wls40Model[35].rotateAngleZ = 0.54105207F;

		wls40Model[36].addShapeBox(-0.25F, 0F, 0F, 1, 0, 7, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 7
		wls40Model[36].setRotationPoint(-52.85F, -15F, -3.25F);
		wls40Model[36].rotateAngleZ = 0.54105207F;

		wls40Model[37].addShapeBox(-0.25F, 0F, 0F, 1, 0, 7, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.8F, 0F, 0F, -0.8F); // Box 7
		wls40Model[37].setRotationPoint(-52.85F, -15.5F, -3.1F);
		wls40Model[37].rotateAngleZ = 0.54105207F;

		wls40Model[38].addShapeBox(-0.25F, 0F, 0F, 1, 0, 6, 0F, 0F, 0F, -0.1F, -0.5F, 0F, -0.1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, -0.5F, 0F, -0.1F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 7
		wls40Model[38].setRotationPoint(-52.85F, -16F, -3.05F);
		wls40Model[38].rotateAngleZ = 0.54105207F;

		wls40Model[39].addShapeBox(-0.25F, 0F, 0F, 1, 0, 6, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 7
		wls40Model[39].setRotationPoint(-52.85F, -16.5F, -2.75F);
		wls40Model[39].rotateAngleZ = 0.54105207F;

		wls40Model[40].addShapeBox(0F, 0F, 0F, 47, 2, 8, 0F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, -1F, -2.4F, 0F, -1F, -2.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 7
		wls40Model[40].setRotationPoint(-53F, -21F, -3.8F);

		wls40Model[41].addShapeBox(0F, 0F, 0F, 13, 6, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 44
		wls40Model[41].setRotationPoint(-47F, -9F, -3F);

		wls40Model[42].addBox(0F, 0F, 0F, 13, 6, 3, 0F); // Box 44
		wls40Model[42].setRotationPoint(-47F, -15F, -1.5F);

		wls40Model[43].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.75F, -0.75F, -1F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.75F, -0.75F, -1F, -0.75F, -0.75F); // Box 46
		wls40Model[43].setRotationPoint(-46F, -9F, 3F);

		wls40Model[44].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.75F, -0.75F, -1F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.75F, -0.75F, -1F, -0.75F, -0.75F); // Box 46
		wls40Model[44].setRotationPoint(-43F, -9F, 3F);

		wls40Model[45].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.75F, -0.75F, -1F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.75F, -0.75F, -1F, -0.75F, -0.75F); // Box 46
		wls40Model[45].setRotationPoint(-40F, -9F, 3F);

		wls40Model[46].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.75F, -0.75F, -1F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.75F, -0.75F, -1F, -0.75F, -0.75F); // Box 46
		wls40Model[46].setRotationPoint(-37F, -9F, 3F);

		wls40Model[47].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F, -1F, -0.75F, -0.75F, -1F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.75F, -0.75F, -1F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 46
		wls40Model[47].setRotationPoint(-46F, -9F, -4F);

		wls40Model[48].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F, -1F, -0.75F, -0.75F, -1F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.75F, -0.75F, -1F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 46
		wls40Model[48].setRotationPoint(-43F, -9F, -4F);

		wls40Model[49].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F, -1F, -0.75F, -0.75F, -1F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.75F, -0.75F, -1F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 46
		wls40Model[49].setRotationPoint(-40F, -9F, -4F);

		wls40Model[50].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F, -1F, -0.75F, -0.75F, -1F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.75F, -0.75F, -1F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 46
		wls40Model[50].setRotationPoint(-37F, -9F, -4F);

		wls40Model[51].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.75F, -0.75F, -1F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.75F, -0.75F, -1F, -0.75F, -0.75F); // Box 46
		wls40Model[51].setRotationPoint(-46F, -5F, 3F);

		wls40Model[52].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.75F, -0.75F, -1F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.75F, -0.75F, -1F, -0.75F, -0.75F); // Box 46
		wls40Model[52].setRotationPoint(-43F, -5F, 3F);

		wls40Model[53].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.75F, -0.75F, -1F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.75F, -0.75F, -1F, -0.75F, -0.75F); // Box 46
		wls40Model[53].setRotationPoint(-40F, -5F, 3F);

		wls40Model[54].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.75F, -0.75F, -1F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.75F, -0.75F, -1F, -0.75F, -0.75F); // Box 46
		wls40Model[54].setRotationPoint(-37F, -5F, 3F);

		wls40Model[55].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F, -1F, -0.75F, -0.75F, -1F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.75F, -0.75F, -1F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 46
		wls40Model[55].setRotationPoint(-46F, -5F, -4F);

		wls40Model[56].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F, -1F, -0.75F, -0.75F, -1F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.75F, -0.75F, -1F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 46
		wls40Model[56].setRotationPoint(-43F, -5F, -4F);

		wls40Model[57].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F, -1F, -0.75F, -0.75F, -1F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.75F, -0.75F, -1F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 46
		wls40Model[57].setRotationPoint(-40F, -5F, -4F);

		wls40Model[58].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F, -1F, -0.75F, -0.75F, -1F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.75F, -0.75F, -1F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 46
		wls40Model[58].setRotationPoint(-37F, -5F, -4F);

		wls40Model[59].addShapeBox(0F, 0F, 0F, 13, 1, 8, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 44
		wls40Model[59].setRotationPoint(-47F, -3F, -4F);

		wls40Model[60].addShapeBox(0F, 0F, 0F, 2, 4, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 44
		wls40Model[60].setRotationPoint(-34F, -10F, 0F);

		wls40Model[61].addShapeBox(0F, 0F, 0F, 2, 4, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F); // Box 44
		wls40Model[61].setRotationPoint(-34F, -6F, 0F);

		wls40Model[62].addShapeBox(0F, 0F, 0F, 2, 4, 4, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 44
		wls40Model[62].setRotationPoint(-34F, -10F, -4F);

		wls40Model[63].addShapeBox(0F, 0F, 0F, 2, 4, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 44
		wls40Model[63].setRotationPoint(-34F, -6F, -4F);

		wls40Model[64].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 70
		wls40Model[64].setRotationPoint(-38F, -10F, -2.5F);

		wls40Model[65].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 70
		wls40Model[65].setRotationPoint(-38F, -10F, -3.5F);

		wls40Model[66].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 70
		wls40Model[66].setRotationPoint(-38F, -11F, -2.5F);

		wls40Model[67].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 70
		wls40Model[67].setRotationPoint(-38F, -11F, -3.5F);

		wls40Model[68].addShapeBox(0F, 0F, 0F, 13, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.625F, -0.625F, 0F, -0.625F, -0.625F); // Box 74
		wls40Model[68].setRotationPoint(-47F, -12.5F, -2F);

		wls40Model[69].addShapeBox(0F, 0F, 0F, 13, 1, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.625F, -0.625F, 0F, -0.625F, -0.625F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 74
		wls40Model[69].setRotationPoint(-47F, -12.5F, -3F);

		wls40Model[70].addShapeBox(0F, 0F, 0F, 13, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.625F, -0.625F, 0F, -0.625F, -0.625F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 74
		wls40Model[70].setRotationPoint(-47F, -13.5F, -2F);

		wls40Model[71].addShapeBox(0F, 0F, 0F, 13, 1, 1, 0F, 0F, -0.625F, -0.625F, 0F, -0.625F, -0.625F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		wls40Model[71].setRotationPoint(-47F, -13.5F, -3F);

		wls40Model[72].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 78
		wls40Model[72].setRotationPoint(-48F, -14.25F, -2.5F);

		wls40Model[73].addBox(0F, 0F, 0F, 22, 9, 13, 0F); // Box 2
		wls40Model[73].setRotationPoint(-30F, -11F, -6.5F);

		wls40Model[74].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 70
		wls40Model[74].setRotationPoint(-48F, -6F, -1F);

		wls40Model[75].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F); // Box 70
		wls40Model[75].setRotationPoint(-48F, -6F, 0F);

		wls40Model[76].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 70
		wls40Model[76].setRotationPoint(-48F, -7F, -1F);

		wls40Model[77].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 70
		wls40Model[77].setRotationPoint(-48F, -7F, 0F);

		wls40Model[78].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.625F, -0.625F, 0F, -0.625F, -0.625F); // Box 74
		wls40Model[78].setRotationPoint(-48F, -12.5F, 0F);

		wls40Model[79].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.625F, -0.625F, 0F, -0.625F, -0.625F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 74
		wls40Model[79].setRotationPoint(-48F, -12.5F, -1F);

		wls40Model[80].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.625F, -0.625F, 0F, -0.625F, -0.625F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 74
		wls40Model[80].setRotationPoint(-48F, -13.5F, 0F);

		wls40Model[81].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.625F, -0.625F, 0F, -0.625F, -0.625F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		wls40Model[81].setRotationPoint(-48F, -13.5F, -1F);

		wls40Model[82].addShapeBox(0F, 0F, 0F, 1, 7, 0, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F); // Box 92
		wls40Model[82].setRotationPoint(-48F, -12.5F, -0.5F);
		wls40Model[82].rotateAngleX = -0.1150172F;

		wls40Model[83].addShapeBox(0F, 0F, 0F, 1, 7, 0, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F); // Box 92
		wls40Model[83].setRotationPoint(-48F, -12.5F, 0.5F);
		wls40Model[83].rotateAngleX = 0.1150172F;

		wls40Model[84].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, -0.5F, -0.5F, -1.75F, 1.5F, -0.5F, -1.75F, 1.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, -1.75F, -2F, -0.5F, -1.75F, -2F, 0F, 0F, 0F, 0F); // Box 78
		wls40Model[84].setRotationPoint(-47F, -14.25F, -1.5F);
		wls40Model[84].rotateAngleY = 1.57079633F;

		wls40Model[85].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.625F, -0.625F, 0F, -0.625F, -0.625F); // Box 74
		wls40Model[85].setRotationPoint(-47.75F, -18F, 0F);
		wls40Model[85].rotateAngleZ = 1.57079633F;

		wls40Model[86].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.625F, -0.625F, 0F, -0.625F, -0.625F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 74
		wls40Model[86].setRotationPoint(-47.75F, -18F, -1F);
		wls40Model[86].rotateAngleZ = 1.57079633F;

		wls40Model[87].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.625F, -0.625F, 0F, -0.625F, -0.625F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 74
		wls40Model[87].setRotationPoint(-48.75F, -18F, 0F);
		wls40Model[87].rotateAngleZ = 1.57079633F;

		wls40Model[88].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, -0.625F, -0.625F, 0F, -0.625F, -0.625F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		wls40Model[88].setRotationPoint(-48.75F, -18F, -1F);
		wls40Model[88].rotateAngleZ = 1.57079633F;

		wls40Model[89].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 78
		wls40Model[89].setRotationPoint(-48.5F, -15.25F, -0.75F);
		wls40Model[89].rotateAngleZ = 1.57079633F;

		wls40Model[90].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, -0.5F, -0.5F, -1.75F, 1.5F, -0.5F, -1.75F, 1.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, -1.75F, -2F, -0.5F, -1.75F, -2F, 0F, 0F, 0F, 0F); // Box 78
		wls40Model[90].setRotationPoint(-48.5F, -14.25F, 1.5F);
		wls40Model[90].rotateAngleY = -1.57079633F;

		wls40Model[91].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 78
		wls40Model[91].setRotationPoint(-48F, -14.25F, 1F);

		wls40Model[92].addShapeBox(0F, 0F, -1F, 1, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.625F, -0.625F, 0F, -0.625F, -0.625F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 74
		wls40Model[92].setRotationPoint(-47.45F, -5.5F, -2.5F);
		wls40Model[92].rotateAngleZ = 1.57079633F;

		wls40Model[93].addShapeBox(0F, 0F, -1F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.625F, -0.625F, 0F, -0.625F, -0.625F); // Box 74
		wls40Model[93].setRotationPoint(-46.45F, -5.5F, -2.5F);
		wls40Model[93].rotateAngleZ = 1.57079633F;

		wls40Model[94].addShapeBox(0F, 0F, -1F, 1, 1, 1, 0F, 0F, -0.625F, -0.625F, 0F, -0.625F, -0.625F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		wls40Model[94].setRotationPoint(-47.45F, -5.5F, -3.5F);
		wls40Model[94].rotateAngleZ = 1.57079633F;

		wls40Model[95].addShapeBox(0F, 0F, -1F, 1, 1, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.625F, -0.625F, 0F, -0.625F, -0.625F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 74
		wls40Model[95].setRotationPoint(-46.45F, -5.5F, -3.5F);
		wls40Model[95].rotateAngleZ = 1.57079633F;

		wls40Model[96].addShapeBox(0F, 0F, 0F, 1, 2, 14, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 7
		wls40Model[96].setRotationPoint(-43.75F, -11F, 6.5F);
		wls40Model[96].rotateAngleY = -1.57079633F;

		wls40Model[97].addBox(0F, 0F, 0F, 1, 14, 22, 0F); // Box 2
		wls40Model[97].setRotationPoint(5F, -12F, -11F);

		wls40Model[98].addShapeBox(0F, 0F, 0F, 22, 8, 13, 0F, 0F, 0F, -2.7F, 0F, 0F, -2.7F, 0F, 0F, -2.7F, 0F, 0F, -2.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		wls40Model[98].setRotationPoint(-30F, -19F, -6.5F);

		wls40Model[99].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.7F, 0F, -0.7F, 0F, 0F, -0.4F, 0F, 0F, -0.525F, -0.525F, 0F, -0.775F, -0.775F); // Box 74
		wls40Model[99].setRotationPoint(-47.75F, -16F, 0F);
		wls40Model[99].rotateAngleZ = 1.57079633F;

		wls40Model[100].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, -0.7F, 0F, 0F, -0.4F, 0F, 0F, -0.525F, -0.525F, 0F, -0.775F, -0.775F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.7F); // Box 74
		wls40Model[100].setRotationPoint(-48.75F, -16F, 0F);
		wls40Model[100].rotateAngleZ = 1.57079633F;

		wls40Model[101].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.775F, -0.775F, 0F, -0.525F, -0.525F, 0F, -0.4F, 0F, 0F, -0.7F, 0F); // Box 74
		wls40Model[101].setRotationPoint(-47.75F, -16F, -1F);
		wls40Model[101].rotateAngleZ = 1.57079633F;

		wls40Model[102].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, -0.775F, -0.775F, 0F, -0.525F, -0.525F, 0F, -0.4F, 0F, 0F, -0.7F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		wls40Model[102].setRotationPoint(-48.75F, -16F, -1F);
		wls40Model[102].rotateAngleZ = 1.57079633F;

		wls40Model[103].addBox(0F, 0F, 0F, 1, 11, 22, 0F); // Box 2
		wls40Model[103].setRotationPoint(-8F, -12F, -11F);

		wls40Model[104].addShapeBox(0F, 0F, 0F, 13, 5, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		wls40Model[104].setRotationPoint(-7F, 2F, -5F);

		wls40Model[105].addShapeBox(0F, 0F, 0F, 4, 1, 22, 0F, 0F, 0F, 0F, -1F, -3F, 0F, -1F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 3F, 0F, -1F, 3F, 0F, 0F, 0F, 0F); // Box 2
		wls40Model[105].setRotationPoint(-7F, -2F, -11F);

		wls40Model[106].addShapeBox(0F, 0F, 0F, 9, 1, 22, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		wls40Model[106].setRotationPoint(-4F, 1F, -11F);

		wls40Model[107].addShapeBox(0F, 0F, 0F, 3, 3, 10, 0F, 0F, 0F, 0F, -1.5F, -1.5F, 0F, -1.5F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		wls40Model[107].setRotationPoint(-7F, -1F, -5F);

		wls40Model[108].addBox(0F, 0F, 0F, 1, 7, 6, 0F); // Box 2
		wls40Model[108].setRotationPoint(5F, -19F, -3F);

		wls40Model[109].addBox(0F, 0F, 0F, 1, 12, 2, 0F); // Box 2
		wls40Model[109].setRotationPoint(5F, -24F, -11F);

		wls40Model[110].addBox(0F, 0F, 0F, 1, 12, 2, 0F); // Box 2
		wls40Model[110].setRotationPoint(5F, -24F, 9F);

		wls40Model[111].addBox(0F, 0F, 0F, 1, 12, 1, 0F); // Box 2
		wls40Model[111].setRotationPoint(5F, -24F, -4F);

		wls40Model[112].addBox(0F, 0F, 0F, 1, 12, 1, 0F); // Box 2
		wls40Model[112].setRotationPoint(5F, -24F, 3F);

		wls40Model[113].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		wls40Model[113].setRotationPoint(5F, -23F, 8F);

		wls40Model[114].addBox(0F, 0F, 0F, 1, 1, 5, 0F); // Box 2
		wls40Model[114].setRotationPoint(5F, -24F, -9F);

		wls40Model[115].addBox(0F, 0F, 0F, 1, 1, 5, 0F); // Box 2
		wls40Model[115].setRotationPoint(5F, -24F, 4F);

		wls40Model[116].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 2
		wls40Model[116].setRotationPoint(5F, -23F, 4F);

		wls40Model[117].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		wls40Model[117].setRotationPoint(5F, -13F, 8F);

		wls40Model[118].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		wls40Model[118].setRotationPoint(4F, -13F, 10F);

		wls40Model[119].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		wls40Model[119].setRotationPoint(5F, -23F, -5F);

		wls40Model[120].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 2
		wls40Model[120].setRotationPoint(5F, -23F, -9F);

		wls40Model[121].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		wls40Model[121].setRotationPoint(5F, -13F, -5F);

		wls40Model[122].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		wls40Model[122].setRotationPoint(5F, -13F, -9F);

		wls40Model[123].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		wls40Model[123].setRotationPoint(5F, -20F, 2F);

		wls40Model[124].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		wls40Model[124].setRotationPoint(5F, -20F, -3F);

		wls40Model[125].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		wls40Model[125].setRotationPoint(5F, -24F, 2F);

		wls40Model[126].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 2
		wls40Model[126].setRotationPoint(5F, -24F, -3F);

		wls40Model[127].addBox(0F, 0F, 0F, 2, 13, 1, 0F); // Box 2
		wls40Model[127].setRotationPoint(3F, -12F, -11F);

		wls40Model[128].addBox(0F, 0F, 0F, 2, 13, 1, 0F); // Box 2
		wls40Model[128].setRotationPoint(3F, -12F, 10F);

		wls40Model[129].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		wls40Model[129].setRotationPoint(5F, -13F, 4F);

		wls40Model[130].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		wls40Model[130].setRotationPoint(4F, -13F, -11F);

		wls40Model[131].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -1.5F, 0F); // Box 2
		wls40Model[131].setRotationPoint(-7F, -2F, -11F);

		wls40Model[132].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -1.5F, 0F); // Box 2
		wls40Model[132].setRotationPoint(-7F, -2F, 10F);

		wls40Model[133].addShapeBox(0F, 0F, 0F, 1, 3, 14, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 7
		wls40Model[133].setRotationPoint(-43.75F, -5F, 6.5F);
		wls40Model[133].rotateAngleY = -1.57079633F;

		wls40Model[134].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 7
		wls40Model[134].setRotationPoint(-31.75F, -9F, 6.5F);
		wls40Model[134].rotateAngleY = -1.57079633F;

		wls40Model[135].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 7
		wls40Model[135].setRotationPoint(-38.75F, -9F, 6.5F);
		wls40Model[135].rotateAngleY = -1.57079633F;

		wls40Model[136].addShapeBox(0F, 0F, 0F, 1, 2, 14, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 7
		wls40Model[136].setRotationPoint(-43.75F, -11F, -6.25F);
		wls40Model[136].rotateAngleY = -1.57079633F;

		wls40Model[137].addShapeBox(0F, 0F, 0F, 1, 3, 14, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 7
		wls40Model[137].setRotationPoint(-43.75F, -5F, -6.25F);
		wls40Model[137].rotateAngleY = -1.57079633F;

		wls40Model[138].addShapeBox(0F, 0F, 0F, 1, 9, 9, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 7
		wls40Model[138].setRotationPoint(-52.75F, -11F, -6.25F);
		wls40Model[138].rotateAngleY = -1.57079633F;

		wls40Model[139].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 7
		wls40Model[139].setRotationPoint(-31.75F, -9F, -6.25F);
		wls40Model[139].rotateAngleY = -1.57079633F;

		wls40Model[140].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 7
		wls40Model[140].setRotationPoint(-38.75F, -9F, -6.25F);
		wls40Model[140].rotateAngleY = -1.57079633F;

		wls40Model[141].addShapeBox(0F, 0F, 0F, 1, 9, 9, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 7
		wls40Model[141].setRotationPoint(-52.75F, -11F, 6.5F);
		wls40Model[141].rotateAngleY = -1.57079633F;

		wls40Model[142].addBox(0F, 0F, 0F, 3, 10, 1, 0F); // Box 2
		wls40Model[142].setRotationPoint(-7F, -12F, -11F);

		wls40Model[143].addBox(0F, 0F, 0F, 3, 10, 1, 0F); // Box 2
		wls40Model[143].setRotationPoint(-7F, -12F, 10F);

		wls40Model[144].addShapeBox(0F, 0F, 0F, 1, 12, 2, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		wls40Model[144].setRotationPoint(-8F, -24F, 9F);

		wls40Model[145].addShapeBox(0F, 0F, 0F, 1, 12, 2, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		wls40Model[145].setRotationPoint(-8F, -24F, -11F);

		wls40Model[146].addShapeBox(0F, 0F, 0F, 1, 2, 7, 0F, -0.33F, 0F, 0F, 0.33F, 0F, 0F, 0.33F, 0F, 0F, -0.33F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		wls40Model[146].setRotationPoint(-8F, -14F, -9F);

		wls40Model[147].addShapeBox(0F, 0F, 0F, 3, 12, 1, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		wls40Model[147].setRotationPoint(-7F, -24F, -11F);

		wls40Model[148].addShapeBox(0F, 0F, 0F, 3, 12, 1, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		wls40Model[148].setRotationPoint(-7F, -24F, 10F);

		wls40Model[149].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.4F, 0F, -0.4F, 0F, 0F, -0.7F, 0F, 0F, -0.775F, -0.775F, 0F, -0.525F, -0.525F); // Box 74
		wls40Model[149].setRotationPoint(-47.75F, -22F, 0F);
		wls40Model[149].rotateAngleZ = 1.57079633F;

		wls40Model[150].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, -0.4F, 0F, 0F, -0.7F, 0F, 0F, -0.775F, -0.775F, 0F, -0.525F, -0.525F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.4F); // Box 74
		wls40Model[150].setRotationPoint(-48.75F, -22F, 0F);
		wls40Model[150].rotateAngleZ = 1.57079633F;

		wls40Model[151].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.525F, -0.525F, 0F, -0.775F, -0.775F, 0F, -0.7F, 0F, 0F, -0.4F, 0F); // Box 74
		wls40Model[151].setRotationPoint(-47.75F, -22F, -1F);
		wls40Model[151].rotateAngleZ = 1.57079633F;

		wls40Model[152].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, -0.525F, -0.525F, 0F, -0.775F, -0.775F, 0F, -0.7F, 0F, 0F, -0.4F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		wls40Model[152].setRotationPoint(-48.75F, -22F, -1F);
		wls40Model[152].rotateAngleZ = 1.57079633F;

		wls40Model[153].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0.165F, 0F, 0F, -0.165F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		wls40Model[153].setRotationPoint(-7.67F, -15F, 8F);

		wls40Model[154].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.165F, 0F, 0F, 0.165F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		wls40Model[154].setRotationPoint(-7.67F, -15F, -9F);

		wls40Model[155].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.165F, 0F, 0F, 0.165F, 0F, 0F); // Box 2
		wls40Model[155].setRotationPoint(-6F, -24F, 8F);

		wls40Model[156].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.165F, 0F, 0F, -0.165F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 2
		wls40Model[156].setRotationPoint(-6F, -24F, -9F);

		wls40Model[157].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0.165F, 0F, 0.325F, -0.165F, 0F, 0.325F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		wls40Model[157].setRotationPoint(-7.67F, -15F, -7F);

		wls40Model[158].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F, -0.275F, -1.5F, -0.8F, 0.275F, -1.5F, -0.8F, 0.4375F, -0.5F, 0F, -0.4375F, -0.5F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		wls40Model[158].setRotationPoint(-7.02F, -21F, -5F);

		wls40Model[159].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F, -0.65F, 0F, -1.3F, 0.65F, 0F, -1.3F, 0.65F, 0F, 0F, -0.65F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		wls40Model[159].setRotationPoint(-7.67F, -18F, -6F);

		wls40Model[160].addShapeBox(0F, 0F, 0F, 1, 12, 4, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		wls40Model[160].setRotationPoint(-8F, -24F, -2F);

		wls40Model[161].addShapeBox(0F, 0F, 0F, 1, 2, 7, 0F, -0.33F, 0F, 0F, 0.33F, 0F, 0F, 0.33F, 0F, 0F, -0.33F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		wls40Model[161].setRotationPoint(-8F, -14F, 2F);

		wls40Model[162].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F, -0.65F, 0F, 0F, 0.65F, 0F, 0F, 0.65F, 0F, -1.3F, -0.65F, 0F, -1.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		wls40Model[162].setRotationPoint(-7.67F, -18F, 2F);

		wls40Model[163].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F, -0.4375F, -0.5F, 0F, 0.4375F, -0.5F, 0F, 0.275F, -1.5F, -0.8F, -0.275F, -1.5F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 2
		wls40Model[163].setRotationPoint(-7.02F, -21F, 2F);

		wls40Model[164].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.165F, 0F, 0.325F, 0.165F, 0F, 0.325F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		wls40Model[164].setRotationPoint(-7.67F, -15F, 6F);

		wls40Model[165].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.165F, 0F, 0F, -0.165F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 2
		wls40Model[165].setRotationPoint(-6F, -24F, 2F);

		wls40Model[166].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.165F, 0F, 0F, 0.165F, 0F, 0F); // Box 2
		wls40Model[166].setRotationPoint(-6F, -24F, -3F);

		wls40Model[167].addBox(0F, 0F, 0F, 12, 1, 6, 0F); // Box 2
		wls40Model[167].setRotationPoint(-6F, -25F, -3F);

		wls40Model[168].addShapeBox(0F, 0F, 0F, 12, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		wls40Model[168].setRotationPoint(-6F, -25F, 3F);

		wls40Model[169].addShapeBox(0F, 0F, 0F, 12, 1, 8, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		wls40Model[169].setRotationPoint(-6F, -25F, -11F);

		wls40Model[170].addShapeBox(0F, 0F, 0F, 1, 8, 13, 0F, 0F, 0F, -2.7F, 0.5F, 0F, -2.7F, 0.5F, 0F, -2.7F, 0F, 0F, -2.7F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 2
		wls40Model[170].setRotationPoint(-8F, -19F, -6.5F);

		wls40Model[171].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F); // Box 173
		wls40Model[171].setRotationPoint(-48.87F, -21F, -0.5F);

		wls40Model[172].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.375F, -0.375F, -0.25F, -0.375F, -0.375F, -0.25F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, -0.25F, -0.375F, -0.375F, -0.25F, -0.375F, -0.375F, 0F, -0.375F, -0.375F); // Box 173
		wls40Model[172].setRotationPoint(-49.25F, -20.63F, -0.5F);
		wls40Model[172].rotateAngleZ = 1.57079633F;

		wls40Model[173].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 175
		wls40Model[173].setRotationPoint(-49.25F, -22F, -0.5F);

		wls40Model[174].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.625F, -0.875F, -0.25F, -0.25F, -0.875F, -0.25F, -0.25F, -0.875F, -0.25F, -0.625F, -0.875F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 175
		wls40Model[174].setRotationPoint(-49.25F, -23F, -0.5F);

		wls40Model[175].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, -0.625F, -0.25F, -0.25F, -0.625F, -0.25F, -0.25F, -0.625F, -0.25F, -0.25F, -0.625F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 175
		wls40Model[175].setRotationPoint(-49.25F, -23.13F, -0.5F);

		wls40Model[176].addBox(0F, 0F, 0F, 1, 1, 12, 0F); // Box 178
		wls40Model[176].setRotationPoint(-33.5F, 4.5F, -6F);

		wls40Model[177].addBox(0F, 0F, 0F, 1, 1, 12, 0F); // Box 178
		wls40Model[177].setRotationPoint(-16.5F, 4.5F, -6F);

		wls40Model[178].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 180
		wls40Model[178].setRotationPoint(-34F, 7F, 6F);

		wls40Model[179].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 180
		wls40Model[179].setRotationPoint(-17F, 6F, 6F);

		wls40Model[180].addBox(0F, 0F, 0F, 15, 1, 1, 0F); // Box 180
		wls40Model[180].setRotationPoint(-32F, 7.5F, 6F);

		wls40Model[181].addBox(0F, 0F, 0F, 3, 5, 1, 0F); // Box 180
		wls40Model[181].setRotationPoint(-9F, 3F, 5F);

		wls40Model[182].addBox(0F, 0F, 0F, 5, 1, 1, 0F); // Box 180
		wls40Model[182].setRotationPoint(-12F, 6.5F, 6F);

		wls40Model[183].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 178
		wls40Model[183].setRotationPoint(-33.5F, 7.5F, 6.5F);

		wls40Model[184].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 178
		wls40Model[184].setRotationPoint(-16.5F, 7.5F, 6.5F);

		wls40Model[185].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 178
		wls40Model[185].setRotationPoint(-13.5F, 6.5F, 6.5F);

		wls40Model[186].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 180
		wls40Model[186].setRotationPoint(-34F, 7F, -7F);

		wls40Model[187].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 180
		wls40Model[187].setRotationPoint(-17F, 6F, -7F);

		wls40Model[188].addBox(0F, 0F, 0F, 15, 1, 1, 0F); // Box 180
		wls40Model[188].setRotationPoint(-32F, 7.5F, -7F);

		wls40Model[189].addBox(0F, 0F, 0F, 3, 5, 1, 0F); // Box 180
		wls40Model[189].setRotationPoint(-9F, 3F, -6F);

		wls40Model[190].addBox(0F, 0F, 0F, 5, 1, 1, 0F); // Box 180
		wls40Model[190].setRotationPoint(-12F, 6.5F, -7F);

		wls40Model[191].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 178
		wls40Model[191].setRotationPoint(-33.5F, 7.5F, -7.5F);

		wls40Model[192].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 178
		wls40Model[192].setRotationPoint(-16.5F, 7.5F, -7.5F);

		wls40Model[193].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 178
		wls40Model[193].setRotationPoint(-13.5F, 6.5F, -7.5F);

		wls40Model[194].addShapeBox(0F, 0F, 0F, 1, 4, 20, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -4F, -0.5F, -2F, -4F, -0.5F, -2F, -4F, 0F, -2F, -4F); // Box 3
		wls40Model[194].setRotationPoint(-53F, -1F, -10F);

		wls40Model[195].addBox(0F, 0F, 0F, 0, 11, 5, 0F); // Box 2
		wls40Model[195].setRotationPoint(5.5F, -23F, -9F);

		wls40Model[196].addBox(0F, 0F, 0F, 0, 11, 5, 0F); // Box 2
		wls40Model[196].setRotationPoint(5.5F, -23F, 4F);

		wls40Model[197].addBox(0F, 0F, 0F, 0, 5, 6, 0F); // Box 2
		wls40Model[197].setRotationPoint(5.5F, -24F, -3F);

		wls40Model[198].addBox(0F, 0F, 0F, 0, 11, 7, 0F); // Box 2
		wls40Model[198].setRotationPoint(-5.5F, -24F, 2F);
		wls40Model[198].rotateAngleZ = -0.16580628F;

		wls40Model[199].addBox(0F, 0F, 0F, 0, 11, 7, 0F); // Box 2
		wls40Model[199].setRotationPoint(-5.5F, -24F, -9F);
		wls40Model[199].rotateAngleZ = -0.16580628F;

		wls40Model[200].addShapeBox(0F, 0F, 0F, 44, 1, 1, 0F, 0F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, -0.875F, 0F, -0.75F, -0.875F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.875F, 0F, 0F, -0.875F); // Box 201
		wls40Model[200].setRotationPoint(-48F, -21.25F, -1F);
		wls40Model[200].rotateAngleZ = 0.00174533F;

		wls40Model[201].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.875F, 0F, -0.75F, -0.875F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.875F, 0F, 0F, -0.875F); // Box 201
		wls40Model[201].setRotationPoint(-47.87F, -21.25F, -0.87F);
		wls40Model[201].rotateAngleY = 1.57079633F;

		wls40Model[202].addShapeBox(0F, 0F, 0F, 1, 4, 18, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		wls40Model[202].setRotationPoint(6F, -2F, -9F);

		wls40Model[203].addShapeBox(0F, 0F, 0F, 1, 5, 18, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F); // Box 2
		wls40Model[203].setRotationPoint(6F, 2F, -9F);

		wls40Model[204].addBox(0F, 0F, 0F, 2, 2, 4, 0F); // Box 7
		wls40Model[204].setRotationPoint(-56F, 4F, -2F);

		wls40Model[205].addShapeBox(-1F, 0F, 0F, 2, 4, 8, 0F, -1F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -2F, -1F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -2F); // Box 7
		wls40Model[205].setRotationPoint(-57F, 3F, -4F);

		wls40Model[206].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 70
		wls40Model[206].setRotationPoint(-32F, -6F, 0F);

		wls40Model[207].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 70
		wls40Model[207].setRotationPoint(-32F, -8F, 0F);

		wls40Model[208].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 70
		wls40Model[208].setRotationPoint(-32F, -6F, -2F);

		wls40Model[209].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 70
		wls40Model[209].setRotationPoint(-32F, -8F, -2F);

		wls40Model[210].addShapeBox(0F, 0F, 0F, 1, 9, 9, 0F, 1.95F, -1F, 0F, -2.7F, -1F, 0F, -2.7F, -1F, 0F, 1.95F, -1F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Box 7
		wls40Model[210].setRotationPoint(-52.75F, -20F, -5.5F);
		wls40Model[210].rotateAngleY = -1.57079633F;

		wls40Model[211].addShapeBox(0F, 0F, 0F, 1, 9, 9, 0F, -2.7F, -1F, 0F, 1.95F, -1F, 0F, 1.95F, -1F, 0F, -2.7F, -1F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 7
		wls40Model[211].setRotationPoint(-52.75F, -20F, 6.5F);
		wls40Model[211].rotateAngleY = -1.57079633F;

		wls40Model[212].addShapeBox(0F, 0F, 0F, 1, 2, 14, 0F, -0.675F, 0F, 0F, -0.075F, 0F, 0F, -0.075F, 0F, -0.25F, -0.675F, 0F, -0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 7
		wls40Model[212].setRotationPoint(-43.75F, -13F, 6.5F);
		wls40Model[212].rotateAngleY = -1.57079633F;

		wls40Model[213].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F, -1.345F, 0F, 0F, 0.595F, 0F, 0F, 0.595F, 0F, -0.25F, -1.345F, 0F, -0.25F, 0.005F, 0F, 0F, -0.755F, 0F, 0F, -0.755F, 0F, -0.25F, 0.005F, 0F, -0.25F); // Box 7
		wls40Model[213].setRotationPoint(-31.75F, -17F, 5.82F);
		wls40Model[213].rotateAngleY = -1.57079633F;

		wls40Model[214].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F, -1.345F, 0F, 0F, 0.595F, 0F, 0F, 0.595F, 0F, 0F, -1.345F, 0F, 0F, 0.005F, 0F, 0F, -0.755F, 0F, 0F, -0.755F, 0F, 0F, 0.005F, 0F, 0F); // Box 7
		wls40Model[214].setRotationPoint(-38.75F, -17F, 5.82F);
		wls40Model[214].rotateAngleY = -1.57079633F;

		wls40Model[215].addShapeBox(0F, 0F, 0F, 1, 2, 14, 0F, -0.675F, 0F, 0F, -0.075F, 0F, 0F, -0.075F, 0F, -0.25F, -0.675F, 0F, -0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 7
		wls40Model[215].setRotationPoint(-43.75F, -19F, 4.47F);
		wls40Model[215].rotateAngleY = -1.57079633F;

		wls40Model[216].addShapeBox(0F, 0F, 0F, 1, 2, 14, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, -0.675F, 0F, 0F, -0.075F, 0F, 0F, -0.075F, 0F, -0.25F, -0.675F, 0F, -0.25F); // Box 7
		wls40Model[216].setRotationPoint(-43.75F, -13F, -5.57F);
		wls40Model[216].rotateAngleY = -1.57079633F;

		wls40Model[217].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F, 0.005F, 0F, 0F, -0.755F, 0F, 0F, -0.755F, 0F, -0.25F, 0.005F, 0F, -0.25F, -1.345F, 0F, 0F, 0.595F, 0F, 0F, 0.595F, 0F, -0.25F, -1.345F, 0F, -0.25F); // Box 7
		wls40Model[217].setRotationPoint(-31.75F, -17F, -4.23F);
		wls40Model[217].rotateAngleY = -1.57079633F;

		wls40Model[218].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F, 0.005F, 0F, 0F, -0.755F, 0F, 0F, -0.755F, 0F, 0F, 0.005F, 0F, 0F, -1.345F, 0F, 0F, 0.595F, 0F, 0F, 0.595F, 0F, 0F, -1.345F, 0F, 0F); // Box 7
		wls40Model[218].setRotationPoint(-38.75F, -17F, -4.23F);
		wls40Model[218].rotateAngleY = -1.57079633F;

		wls40Model[219].addShapeBox(0F, 0F, 0F, 1, 2, 14, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, -0.675F, 0F, 0F, -0.075F, 0F, 0F, -0.075F, 0F, -0.25F, -0.675F, 0F, -0.25F); // Box 7
		wls40Model[219].setRotationPoint(-43.75F, -19F, -3.53F);
		wls40Model[219].rotateAngleY = -1.57079633F;

		wls40Model[220].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 224
		wls40Model[220].setRotationPoint(-53F, -3.25F, 7.25F);

		wls40Model[221].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 224
		wls40Model[221].setRotationPoint(-53F, -3.25F, 8.25F);

		wls40Model[222].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 224
		wls40Model[222].setRotationPoint(-53F, -4.25F, 7.25F);

		wls40Model[223].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 224
		wls40Model[223].setRotationPoint(-53F, -4.25F, 8.25F);

		wls40Model[224].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, -0.9F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, -0.9F, -0.25F, -0.25F, -0.9F, 0F, 0F, 0F, 0F, 0F); // Box 224
		wls40Model[224].setRotationPoint(-52F, -3.25F, 7.25F);

		wls40Model[225].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 224
		wls40Model[225].setRotationPoint(-52F, -3.25F, 8.25F);

		wls40Model[226].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.25F, -0.25F, -0.9F, -0.25F, -0.25F, -0.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 224
		wls40Model[226].setRotationPoint(-52F, -4.25F, 7.25F);

		wls40Model[227].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F); // Box 224
		wls40Model[227].setRotationPoint(-52F, -4.25F, 8.25F);

		wls40Model[228].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 235
		wls40Model[228].setRotationPoint(-53.25F, -3.25F, 7.25F);

		wls40Model[229].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 224
		wls40Model[229].setRotationPoint(-53F, -3.25F, -9.25F);

		wls40Model[230].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 224
		wls40Model[230].setRotationPoint(-53F, -3.25F, -8.25F);

		wls40Model[231].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 224
		wls40Model[231].setRotationPoint(-53F, -4.25F, -9.25F);

		wls40Model[232].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 224
		wls40Model[232].setRotationPoint(-53F, -4.25F, -8.25F);

		wls40Model[233].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, -0.9F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, -0.9F, -0.25F, -0.25F, -0.9F, 0F, 0F, 0F, 0F, 0F); // Box 224
		wls40Model[233].setRotationPoint(-52F, -3.25F, -9.25F);

		wls40Model[234].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 224
		wls40Model[234].setRotationPoint(-52F, -3.25F, -8.25F);

		wls40Model[235].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.25F, -0.25F, -0.9F, -0.25F, -0.25F, -0.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 224
		wls40Model[235].setRotationPoint(-52F, -4.25F, -9.25F);

		wls40Model[236].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F); // Box 224
		wls40Model[236].setRotationPoint(-52F, -4.25F, -8.25F);

		wls40Model[237].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 235
		wls40Model[237].setRotationPoint(-53.25F, -3.25F, -9.25F);

		wls40Model[238].addShapeBox(-0.25F, 0F, -0.25F, 1, 1, 1, 0F, -0.325F, 0F, 0F, -0.175F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.325F, 0F, 0F, -0.175F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 245
		wls40Model[238].setRotationPoint(-53F, -17.75F, -2.75F);
		wls40Model[238].rotateAngleX = -1.57079633F;
		wls40Model[238].rotateAngleY = -1.57079633F;

		wls40Model[239].addShapeBox(-0.25F, 0F, -0.25F, 1, 5, 1, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -2.2F, 0F, 0F, 1.7F, 0F, 0F, 1.7F, 0F, -0.5F, -2.2F, 0F, -0.5F); // Box 245
		wls40Model[239].setRotationPoint(-53.75F, -17.5F, -2.75F);
		wls40Model[239].rotateAngleY = -1.57079633F;

		wls40Model[240].addShapeBox(-0.25F, 0F, -0.25F, 1, 1, 1, 0F, -0.325F, 0F, 0F, -0.175F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.325F, 0F, 0F, -0.175F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 245
		wls40Model[240].setRotationPoint(-53F, -12.25F, -4.63F);
		wls40Model[240].rotateAngleX = -1.57079633F;
		wls40Model[240].rotateAngleY = -1.57079633F;

		wls40Model[241].addShapeBox(-0.25F, 0F, -0.25F, 1, 1, 1, 0F, -0.175F, 0F, 0F, -0.325F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, -0.175F, 0F, 0F, -0.325F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 245
		wls40Model[241].setRotationPoint(-53F, -17.75F, 3.25F);
		wls40Model[241].rotateAngleX = -1.57079633F;
		wls40Model[241].rotateAngleY = -1.57079633F;

		wls40Model[242].addShapeBox(-0.25F, 0F, -0.25F, 1, 5, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 1.7F, 0F, 0F, -2.2F, 0F, 0F, -2.2F, 0F, -0.5F, 1.7F, 0F, -0.5F); // Box 245
		wls40Model[242].setRotationPoint(-53.75F, -17.5F, 3.25F);
		wls40Model[242].rotateAngleY = -1.57079633F;

		wls40Model[243].addShapeBox(-0.25F, 0F, -0.25F, 1, 1, 1, 0F, -0.175F, 0F, 0F, -0.325F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, -0.175F, 0F, 0F, -0.325F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 245
		wls40Model[243].setRotationPoint(-53F, -12.25F, 5.13F);
		wls40Model[243].rotateAngleX = -1.57079633F;
		wls40Model[243].rotateAngleY = -1.57079633F;

		wls40Model[244].addShapeBox(-0.25F, 0F, 0F, 1, 0, 5, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 7
		wls40Model[244].setRotationPoint(-38.75F, -8.75F, -6.35F);
		wls40Model[244].rotateAngleY = 1.57079633F;
		wls40Model[244].rotateAngleZ = 0.54105207F;

		wls40Model[245].addShapeBox(-0.25F, 0F, 0F, 1, 0, 5, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 7
		wls40Model[245].setRotationPoint(-38.75F, -8.25F, -6.35F);
		wls40Model[245].rotateAngleY = 1.57079633F;
		wls40Model[245].rotateAngleZ = 0.54105207F;

		wls40Model[246].addShapeBox(-0.25F, 0F, 0F, 1, 0, 5, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 7
		wls40Model[246].setRotationPoint(-38.75F, -7.75F, -6.35F);
		wls40Model[246].rotateAngleY = 1.57079633F;
		wls40Model[246].rotateAngleZ = 0.54105207F;

		wls40Model[247].addShapeBox(-0.25F, 0F, 0F, 1, 0, 5, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 7
		wls40Model[247].setRotationPoint(-38.75F, -7.25F, -6.35F);
		wls40Model[247].rotateAngleY = 1.57079633F;
		wls40Model[247].rotateAngleZ = 0.54105207F;

		wls40Model[248].addShapeBox(-0.25F, 0F, 0F, 1, 0, 5, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 7
		wls40Model[248].setRotationPoint(-38.75F, -6.75F, -6.35F);
		wls40Model[248].rotateAngleY = 1.57079633F;
		wls40Model[248].rotateAngleZ = 0.54105207F;

		wls40Model[249].addShapeBox(-0.25F, 0F, 0F, 1, 0, 5, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 7
		wls40Model[249].setRotationPoint(-38.75F, -6.25F, -6.35F);
		wls40Model[249].rotateAngleY = 1.57079633F;
		wls40Model[249].rotateAngleZ = 0.54105207F;

		wls40Model[250].addShapeBox(-0.25F, 0F, 0F, 1, 0, 5, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 7
		wls40Model[250].setRotationPoint(-38.75F, -5.75F, -6.35F);
		wls40Model[250].rotateAngleY = 1.57079633F;
		wls40Model[250].rotateAngleZ = 0.54105207F;

		wls40Model[251].addShapeBox(-0.25F, 0F, 0F, 1, 0, 5, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 7
		wls40Model[251].setRotationPoint(-38.75F, -5.25F, -6.35F);
		wls40Model[251].rotateAngleY = 1.57079633F;
		wls40Model[251].rotateAngleZ = 0.54105207F;

		wls40Model[252].addShapeBox(-0.25F, 0F, 0F, 1, 0, 5, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 7
		wls40Model[252].setRotationPoint(-31.75F, -8.75F, -6.35F);
		wls40Model[252].rotateAngleY = 1.57079633F;
		wls40Model[252].rotateAngleZ = 0.54105207F;

		wls40Model[253].addShapeBox(-0.25F, 0F, 0F, 1, 0, 5, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 7
		wls40Model[253].setRotationPoint(-31.75F, -8.25F, -6.35F);
		wls40Model[253].rotateAngleY = 1.57079633F;
		wls40Model[253].rotateAngleZ = 0.54105207F;

		wls40Model[254].addShapeBox(-0.25F, 0F, 0F, 1, 0, 5, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 7
		wls40Model[254].setRotationPoint(-31.75F, -7.75F, -6.35F);
		wls40Model[254].rotateAngleY = 1.57079633F;
		wls40Model[254].rotateAngleZ = 0.54105207F;

		wls40Model[255].addShapeBox(-0.25F, 0F, 0F, 1, 0, 5, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 7
		wls40Model[255].setRotationPoint(-31.75F, -7.25F, -6.35F);
		wls40Model[255].rotateAngleY = 1.57079633F;
		wls40Model[255].rotateAngleZ = 0.54105207F;

		wls40Model[256].addShapeBox(-0.25F, 0F, 0F, 1, 0, 5, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 7
		wls40Model[256].setRotationPoint(-31.75F, -6.75F, -6.35F);
		wls40Model[256].rotateAngleY = 1.57079633F;
		wls40Model[256].rotateAngleZ = 0.54105207F;

		wls40Model[257].addShapeBox(-0.25F, 0F, 0F, 1, 0, 5, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 7
		wls40Model[257].setRotationPoint(-31.75F, -6.25F, -6.35F);
		wls40Model[257].rotateAngleY = 1.57079633F;
		wls40Model[257].rotateAngleZ = 0.54105207F;

		wls40Model[258].addShapeBox(-0.25F, 0F, 0F, 1, 0, 5, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 7
		wls40Model[258].setRotationPoint(-31.75F, -5.75F, -6.35F);
		wls40Model[258].rotateAngleY = 1.57079633F;
		wls40Model[258].rotateAngleZ = 0.54105207F;

		wls40Model[259].addShapeBox(-0.25F, 0F, 0F, 1, 0, 5, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 7
		wls40Model[259].setRotationPoint(-31.75F, -5.25F, -6.35F);
		wls40Model[259].rotateAngleY = 1.57079633F;
		wls40Model[259].rotateAngleZ = 0.54105207F;

		wls40Model[260].addShapeBox(-0.25F, 0F, 0F, 1, 0, 5, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 7
		wls40Model[260].setRotationPoint(-36.75F, -8.75F, 6.35F);
		wls40Model[260].rotateAngleY = -1.57079633F;
		wls40Model[260].rotateAngleZ = 0.54105207F;

		wls40Model[261].addShapeBox(-0.25F, 0F, 0F, 1, 0, 5, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 7
		wls40Model[261].setRotationPoint(-36.75F, -8.25F, 6.35F);
		wls40Model[261].rotateAngleY = -1.57079633F;
		wls40Model[261].rotateAngleZ = 0.54105207F;

		wls40Model[262].addShapeBox(-0.25F, 0F, 0F, 1, 0, 5, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 7
		wls40Model[262].setRotationPoint(-36.75F, -7.75F, 6.35F);
		wls40Model[262].rotateAngleY = -1.57079633F;
		wls40Model[262].rotateAngleZ = 0.54105207F;

		wls40Model[263].addShapeBox(-0.25F, 0F, 0F, 1, 0, 5, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 7
		wls40Model[263].setRotationPoint(-36.75F, -7.25F, 6.35F);
		wls40Model[263].rotateAngleY = -1.57079633F;
		wls40Model[263].rotateAngleZ = 0.54105207F;

		wls40Model[264].addShapeBox(-0.25F, 0F, 0F, 1, 0, 5, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 7
		wls40Model[264].setRotationPoint(-36.75F, -6.75F, 6.35F);
		wls40Model[264].rotateAngleY = -1.57079633F;
		wls40Model[264].rotateAngleZ = 0.54105207F;

		wls40Model[265].addShapeBox(-0.25F, 0F, 0F, 1, 0, 5, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 7
		wls40Model[265].setRotationPoint(-36.75F, -6.25F, 6.35F);
		wls40Model[265].rotateAngleY = -1.57079633F;
		wls40Model[265].rotateAngleZ = 0.54105207F;

		wls40Model[266].addShapeBox(-0.25F, 0F, 0F, 1, 0, 5, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 7
		wls40Model[266].setRotationPoint(-36.75F, -5.75F, 6.35F);
		wls40Model[266].rotateAngleY = -1.57079633F;
		wls40Model[266].rotateAngleZ = 0.54105207F;

		wls40Model[267].addShapeBox(-0.25F, 0F, 0F, 1, 0, 5, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 7
		wls40Model[267].setRotationPoint(-36.75F, -5.25F, 6.35F);
		wls40Model[267].rotateAngleY = -1.57079633F;
		wls40Model[267].rotateAngleZ = 0.54105207F;

		wls40Model[268].addShapeBox(-0.25F, 0F, 0F, 1, 0, 5, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 7
		wls40Model[268].setRotationPoint(-43.75F, -8.75F, 6.35F);
		wls40Model[268].rotateAngleY = -1.57079633F;
		wls40Model[268].rotateAngleZ = 0.54105207F;

		wls40Model[269].addShapeBox(-0.25F, 0F, 0F, 1, 0, 5, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 7
		wls40Model[269].setRotationPoint(-43.75F, -8.25F, 6.35F);
		wls40Model[269].rotateAngleY = -1.57079633F;
		wls40Model[269].rotateAngleZ = 0.54105207F;

		wls40Model[270].addShapeBox(-0.25F, 0F, 0F, 1, 0, 5, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 7
		wls40Model[270].setRotationPoint(-43.75F, -7.75F, 6.35F);
		wls40Model[270].rotateAngleY = -1.57079633F;
		wls40Model[270].rotateAngleZ = 0.54105207F;

		wls40Model[271].addShapeBox(-0.25F, 0F, 0F, 1, 0, 5, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 7
		wls40Model[271].setRotationPoint(-43.75F, -7.25F, 6.35F);
		wls40Model[271].rotateAngleY = -1.57079633F;
		wls40Model[271].rotateAngleZ = 0.54105207F;

		wls40Model[272].addShapeBox(-0.25F, 0F, 0F, 1, 0, 5, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 7
		wls40Model[272].setRotationPoint(-43.75F, -6.75F, 6.35F);
		wls40Model[272].rotateAngleY = -1.57079633F;
		wls40Model[272].rotateAngleZ = 0.54105207F;

		wls40Model[273].addShapeBox(-0.25F, 0F, 0F, 1, 0, 5, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 7
		wls40Model[273].setRotationPoint(-43.75F, -6.25F, 6.35F);
		wls40Model[273].rotateAngleY = -1.57079633F;
		wls40Model[273].rotateAngleZ = 0.54105207F;

		wls40Model[274].addShapeBox(-0.25F, 0F, 0F, 1, 0, 5, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 7
		wls40Model[274].setRotationPoint(-43.75F, -5.75F, 6.35F);
		wls40Model[274].rotateAngleY = -1.57079633F;
		wls40Model[274].rotateAngleZ = 0.54105207F;

		wls40Model[275].addShapeBox(-0.25F, 0F, 0F, 1, 0, 5, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 7
		wls40Model[275].setRotationPoint(-43.75F, -5.25F, 6.35F);
		wls40Model[275].rotateAngleY = -1.57079633F;
		wls40Model[275].rotateAngleZ = 0.54105207F;

		wls40Model[276].addShapeBox(-0.25F, 0F, 0F, 1, 0, 5, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 7
		wls40Model[276].setRotationPoint(-43.75F, -16.75F, 4.47F);
		wls40Model[276].rotateAngleY = -1.57079633F;
		wls40Model[276].rotateAngleZ = 0.54105207F;

		wls40Model[277].addShapeBox(-0.25F, 0F, 0F, 1, 0, 5, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 7
		wls40Model[277].setRotationPoint(-43.75F, -16.25F, 4.63F);
		wls40Model[277].rotateAngleY = -1.57079633F;
		wls40Model[277].rotateAngleZ = 0.54105207F;

		wls40Model[278].addShapeBox(-0.25F, 0F, 0F, 1, 0, 5, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 7
		wls40Model[278].setRotationPoint(-43.75F, -15.75F, 4.8F);
		wls40Model[278].rotateAngleY = -1.57079633F;
		wls40Model[278].rotateAngleZ = 0.54105207F;

		wls40Model[279].addShapeBox(-0.25F, 0F, 0F, 1, 0, 5, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 7
		wls40Model[279].setRotationPoint(-43.75F, -15.25F, 4.95F);
		wls40Model[279].rotateAngleY = -1.57079633F;
		wls40Model[279].rotateAngleZ = 0.54105207F;

		wls40Model[280].addShapeBox(-0.25F, 0F, 0F, 1, 0, 5, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 7
		wls40Model[280].setRotationPoint(-43.75F, -14.75F, 5.14F);
		wls40Model[280].rotateAngleY = -1.57079633F;
		wls40Model[280].rotateAngleZ = 0.54105207F;

		wls40Model[281].addShapeBox(-0.25F, 0F, 0F, 1, 0, 5, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 7
		wls40Model[281].setRotationPoint(-43.75F, -14.25F, 5.35F);
		wls40Model[281].rotateAngleY = -1.57079633F;
		wls40Model[281].rotateAngleZ = 0.54105207F;

		wls40Model[282].addShapeBox(-0.25F, 0F, 0F, 1, 0, 5, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 7
		wls40Model[282].setRotationPoint(-43.75F, -13.75F, 5.5F);
		wls40Model[282].rotateAngleY = -1.57079633F;
		wls40Model[282].rotateAngleZ = 0.54105207F;

		wls40Model[283].addShapeBox(-0.25F, 0F, 0F, 1, 0, 5, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 7
		wls40Model[283].setRotationPoint(-43.75F, -13.25F, 5.65F);
		wls40Model[283].rotateAngleY = -1.57079633F;
		wls40Model[283].rotateAngleZ = 0.54105207F;

		wls40Model[284].addShapeBox(-0.25F, 0F, 0F, 1, 0, 5, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 7
		wls40Model[284].setRotationPoint(-36.75F, -16.75F, 4.47F);
		wls40Model[284].rotateAngleY = -1.57079633F;
		wls40Model[284].rotateAngleZ = 0.54105207F;

		wls40Model[285].addShapeBox(-0.25F, 0F, 0F, 1, 0, 5, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 7
		wls40Model[285].setRotationPoint(-36.75F, -16.25F, 4.63F);
		wls40Model[285].rotateAngleY = -1.57079633F;
		wls40Model[285].rotateAngleZ = 0.54105207F;

		wls40Model[286].addShapeBox(-0.25F, 0F, 0F, 1, 0, 5, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 7
		wls40Model[286].setRotationPoint(-36.75F, -15.75F, 4.8F);
		wls40Model[286].rotateAngleY = -1.57079633F;
		wls40Model[286].rotateAngleZ = 0.54105207F;

		wls40Model[287].addShapeBox(-0.25F, 0F, 0F, 1, 0, 5, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 7
		wls40Model[287].setRotationPoint(-36.75F, -15.25F, 4.95F);
		wls40Model[287].rotateAngleY = -1.57079633F;
		wls40Model[287].rotateAngleZ = 0.54105207F;

		wls40Model[288].addShapeBox(-0.25F, 0F, 0F, 1, 0, 5, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 7
		wls40Model[288].setRotationPoint(-36.75F, -14.75F, 5.14F);
		wls40Model[288].rotateAngleY = -1.57079633F;
		wls40Model[288].rotateAngleZ = 0.54105207F;

		wls40Model[289].addShapeBox(-0.25F, 0F, 0F, 1, 0, 5, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 7
		wls40Model[289].setRotationPoint(-36.75F, -14.25F, 5.35F);
		wls40Model[289].rotateAngleY = -1.57079633F;
		wls40Model[289].rotateAngleZ = 0.54105207F;

		wls40Model[290].addShapeBox(-0.25F, 0F, 0F, 1, 0, 5, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 7
		wls40Model[290].setRotationPoint(-36.75F, -13.75F, 5.5F);
		wls40Model[290].rotateAngleY = -1.57079633F;
		wls40Model[290].rotateAngleZ = 0.54105207F;

		wls40Model[291].addShapeBox(-0.25F, 0F, 0F, 1, 0, 5, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 7
		wls40Model[291].setRotationPoint(-36.75F, -13.25F, 5.65F);
		wls40Model[291].rotateAngleY = -1.57079633F;
		wls40Model[291].rotateAngleZ = 0.54105207F;

		wls40Model[292].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 318
		wls40Model[292].setRotationPoint(-22F, 0F, -6F);

		wls40Model[293].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 319
		wls40Model[293].setRotationPoint(-21F, 3F, -6F);

		wls40Model[294].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F); // Box 319
		wls40Model[294].setRotationPoint(-22F, 3F, -6F);

		wls40Model[295].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 321
		wls40Model[295].setRotationPoint(-22F, 0F, -6F);

		wls40Model[296].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 321
		wls40Model[296].setRotationPoint(-22F, 7F, -6F);

		wls40Model[297].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 318
		wls40Model[297].setRotationPoint(-22F, 0F, 5F);

		wls40Model[298].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 319
		wls40Model[298].setRotationPoint(-21F, 3F, 5F);

		wls40Model[299].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F); // Box 319
		wls40Model[299].setRotationPoint(-22F, 3F, 5F);

		wls40Model[300].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 318
		wls40Model[300].setRotationPoint(-39F, 0F, -6F);

		wls40Model[301].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 319
		wls40Model[301].setRotationPoint(-38F, 3F, -6F);

		wls40Model[302].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F); // Box 319
		wls40Model[302].setRotationPoint(-39F, 3F, -6F);

		wls40Model[303].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 321
		wls40Model[303].setRotationPoint(-39F, 0F, -6F);

		wls40Model[304].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 321
		wls40Model[304].setRotationPoint(-39F, 7F, -6F);

		wls40Model[305].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 318
		wls40Model[305].setRotationPoint(-39F, 0F, 5F);

		wls40Model[306].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 319
		wls40Model[306].setRotationPoint(-38F, 3F, 5F);

		wls40Model[307].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F); // Box 319
		wls40Model[307].setRotationPoint(-39F, 3F, 5F);

		wls40Model[308].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 321
		wls40Model[308].setRotationPoint(-39F, 7F, 0.5F);
		wls40Model[308].rotateAngleY = -1.57079633F;

		wls40Model[309].addShapeBox(-0.25F, 0F, 0F, 1, 0, 5, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 7
		wls40Model[309].setRotationPoint(-31.75F, -16.75F, -4.5F);
		wls40Model[309].rotateAngleY = 1.57079633F;
		wls40Model[309].rotateAngleZ = 0.54105207F;

		wls40Model[310].addShapeBox(-0.25F, 0F, 0F, 1, 0, 5, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 7
		wls40Model[310].setRotationPoint(-31.75F, -16.25F, -4.69F);
		wls40Model[310].rotateAngleY = 1.57079633F;
		wls40Model[310].rotateAngleZ = 0.54105207F;

		wls40Model[311].addShapeBox(-0.25F, 0F, 0F, 1, 0, 5, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 7
		wls40Model[311].setRotationPoint(-31.75F, -15.75F, -4.87F);
		wls40Model[311].rotateAngleY = 1.57079633F;
		wls40Model[311].rotateAngleZ = 0.54105207F;

		wls40Model[312].addShapeBox(-0.25F, 0F, 0F, 1, 0, 5, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 7
		wls40Model[312].setRotationPoint(-31.75F, -15.25F, -5.02F);
		wls40Model[312].rotateAngleY = 1.57079633F;
		wls40Model[312].rotateAngleZ = 0.54105207F;

		wls40Model[313].addShapeBox(-0.25F, 0F, 0F, 1, 0, 5, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 7
		wls40Model[313].setRotationPoint(-31.75F, -14.75F, -5.18F);
		wls40Model[313].rotateAngleY = 1.57079633F;
		wls40Model[313].rotateAngleZ = 0.54105207F;

		wls40Model[314].addShapeBox(-0.25F, 0F, 0F, 1, 0, 5, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 7
		wls40Model[314].setRotationPoint(-31.75F, -14.25F, -5.37F);
		wls40Model[314].rotateAngleY = 1.57079633F;
		wls40Model[314].rotateAngleZ = 0.54105207F;

		wls40Model[315].addShapeBox(-0.25F, 0F, 0F, 1, 0, 5, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 7
		wls40Model[315].setRotationPoint(-31.75F, -13.75F, -5.52F);
		wls40Model[315].rotateAngleY = 1.57079633F;
		wls40Model[315].rotateAngleZ = 0.54105207F;

		wls40Model[316].addShapeBox(-0.25F, 0F, 0F, 1, 0, 5, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 7
		wls40Model[316].setRotationPoint(-31.75F, -13.25F, -5.67F);
		wls40Model[316].rotateAngleY = 1.57079633F;
		wls40Model[316].rotateAngleZ = 0.54105207F;

		wls40Model[317].addShapeBox(-0.25F, 0F, 0F, 1, 0, 5, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 7
		wls40Model[317].setRotationPoint(-38.75F, -16.75F, -4.5F);
		wls40Model[317].rotateAngleY = 1.57079633F;
		wls40Model[317].rotateAngleZ = 0.54105207F;

		wls40Model[318].addShapeBox(-0.25F, 0F, 0F, 1, 0, 5, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 7
		wls40Model[318].setRotationPoint(-38.75F, -16.25F, -4.69F);
		wls40Model[318].rotateAngleY = 1.57079633F;
		wls40Model[318].rotateAngleZ = 0.54105207F;

		wls40Model[319].addShapeBox(-0.25F, 0F, 0F, 1, 0, 5, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 7
		wls40Model[319].setRotationPoint(-38.75F, -15.75F, -4.87F);
		wls40Model[319].rotateAngleY = 1.57079633F;
		wls40Model[319].rotateAngleZ = 0.54105207F;

		wls40Model[320].addShapeBox(-0.25F, 0F, 0F, 1, 0, 5, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 7
		wls40Model[320].setRotationPoint(-38.75F, -15.25F, -5.02F);
		wls40Model[320].rotateAngleY = 1.57079633F;
		wls40Model[320].rotateAngleZ = 0.54105207F;

		wls40Model[321].addShapeBox(-0.25F, 0F, 0F, 1, 0, 5, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 7
		wls40Model[321].setRotationPoint(-38.75F, -14.75F, -5.18F);
		wls40Model[321].rotateAngleY = 1.57079633F;
		wls40Model[321].rotateAngleZ = 0.54105207F;

		wls40Model[322].addShapeBox(-0.25F, 0F, 0F, 1, 0, 5, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 7
		wls40Model[322].setRotationPoint(-38.75F, -14.25F, -5.37F);
		wls40Model[322].rotateAngleY = 1.57079633F;
		wls40Model[322].rotateAngleZ = 0.54105207F;

		wls40Model[323].addShapeBox(-0.25F, 0F, 0F, 1, 0, 5, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 7
		wls40Model[323].setRotationPoint(-38.75F, -13.75F, -5.52F);
		wls40Model[323].rotateAngleY = 1.57079633F;
		wls40Model[323].rotateAngleZ = 0.54105207F;

		wls40Model[324].addShapeBox(-0.25F, 0F, 0F, 1, 0, 5, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 7
		wls40Model[324].setRotationPoint(-38.75F, -13.25F, -5.67F);
		wls40Model[324].rotateAngleY = 1.57079633F;
		wls40Model[324].rotateAngleZ = 0.54105207F;

		wls40Model[325].addShapeBox(0F, 0F, 0F, 3, 1, 20, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		wls40Model[325].setRotationPoint(2F, -5F, -10F);

		wls40Model[326].addBox(0F, 0F, 0F, 5, 3, 4, 0F); // Box 360
		wls40Model[326].setRotationPoint(-7F, -2F, -3F);

		wls40Model[327].addShapeBox(0F, 0F, 0F, 5, 2, 4, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 360
		wls40Model[327].setRotationPoint(-7F, -4F, -3F);

		wls40Model[328].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 360
		wls40Model[328].setRotationPoint(-3.5F, -3F, -1.5F);

		wls40Model[329].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 363
		wls40Model[329].setRotationPoint(-7F, -7F, 3F);

		wls40Model[330].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 363
		wls40Model[330].setRotationPoint(-3F, -7F, 2F);

		wls40Model[331].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 363
		wls40Model[331].setRotationPoint(-3F, -8F, 3F);

		wls40Model[332].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 363
		wls40Model[332].setRotationPoint(-3F, -6F, 3F);

		wls40Model[333].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 363
		wls40Model[333].setRotationPoint(-3F, -7.5F, 1F);

		wls40Model[334].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 363
		wls40Model[334].setRotationPoint(-3F, -9F, 2.5F);

		wls40Model[335].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0.5F, 0F, -1.5F, 0.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F); // Box 363
		wls40Model[335].setRotationPoint(-3F, -5.5F, 5F);

		wls40Model[336].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, -1.5F, 0.5F, 0F, -1.5F, 0.5F); // Box 363
		wls40Model[336].setRotationPoint(-3F, -5.5F, 1F);

		wls40Model[337].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 363
		wls40Model[337].setRotationPoint(-3F, -7.5F, 5F);

		wls40Model[338].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 363
		wls40Model[338].setRotationPoint(-3F, -5F, 2.5F);

		wls40Model[339].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, -1.5F, 0.5F, 0F, -1.5F, 0.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 363
		wls40Model[339].setRotationPoint(-3F, -9.5F, 5F);

		wls40Model[340].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, -1.5F, 0.5F, 0F, -1.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 363
		wls40Model[340].setRotationPoint(-3F, -9.5F, 1F);

		wls40Model[341].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, -0.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 363
		wls40Model[341].setRotationPoint(-7.5F, -7.5F, 2.5F);

		wls40Model[342].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, -0.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 363
		wls40Model[342].setRotationPoint(-7F, -7.5F, 2.5F);

		wls40Model[343].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, -0.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 363
		wls40Model[343].setRotationPoint(-6.5F, -7.5F, 2.5F);

		wls40Model[344].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, -0.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 363
		wls40Model[344].setRotationPoint(-6F, -7.5F, 2.5F);

		wls40Model[345].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, -0.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 363
		wls40Model[345].setRotationPoint(-5.5F, -7.5F, 2.5F);

		wls40Model[346].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, -0.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 363
		wls40Model[346].setRotationPoint(-5F, -7.5F, 2.5F);

		wls40Model[347].addShapeBox(0F, 0F, 0F, 1, 10, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 388
		wls40Model[347].setRotationPoint(-1F, -8F, -4.1F);
		wls40Model[347].rotateAngleZ = -0.26179939F;

		wls40Model[348].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 321
		wls40Model[348].setRotationPoint(-8F, -6F, -3.5F);
		wls40Model[348].rotateAngleX = 0.43633231F;
		wls40Model[348].rotateAngleY = -1.57079633F;

		wls40Model[349].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 321
		wls40Model[349].setRotationPoint(-5F, -7.4F, -3.5F);
		wls40Model[349].rotateAngleX = 0.43633231F;
		wls40Model[349].rotateAngleY = -1.57079633F;

		wls40Model[350].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 363
		wls40Model[350].setRotationPoint(-7F, -9.5F, 5F);

		wls40Model[351].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 321
		wls40Model[351].setRotationPoint(-6F, -9.3F, 5.25F);
		wls40Model[351].rotateAngleX = 0.43633231F;
		wls40Model[351].rotateAngleY = -1.57079633F;

		wls40Model[352].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 224
		wls40Model[352].setRotationPoint(-6F, -9.25F, 7.25F);
		wls40Model[352].rotateAngleZ = -1.57079633F;

		wls40Model[353].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 224
		wls40Model[353].setRotationPoint(-6F, -9.25F, 8.25F);
		wls40Model[353].rotateAngleZ = -1.57079633F;

		wls40Model[354].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 224
		wls40Model[354].setRotationPoint(-5F, -9.25F, 7.25F);
		wls40Model[354].rotateAngleZ = -1.57079633F;

		wls40Model[355].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 224
		wls40Model[355].setRotationPoint(-5F, -9.25F, 8.25F);
		wls40Model[355].rotateAngleZ = -1.57079633F;

		wls40Model[356].addShapeBox(-0.5F, 0F, -0.5F, 1, 1, 3, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 321
		wls40Model[356].setRotationPoint(-6F, -10F, 8.25F);
		wls40Model[356].rotateAngleY = -2.18166156F;

		wls40Model[357].addBox(0F, 0F, 0F, 1, 1, 13, 0F); // Box 178
		wls40Model[357].setRotationPoint(-8F, 4.5F, -6.5F);

		wls40Model[358].addShapeBox(0F, 0F, 0F, 3, 2, 9, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0.5F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 1F); // Box 363
		wls40Model[358].setRotationPoint(-7F, -13F, -4.5F);

		wls40Model[359].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.625F, -0.5F, -0.625F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.625F, 0F, -0.625F); // Box 74
		wls40Model[359].setRotationPoint(-6F, -13.25F, -3F);
		wls40Model[359].rotateAngleZ = -0.4712389F;

		wls40Model[360].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.625F, -0.5F, -0.625F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.625F, 0F, -0.625F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 74
		wls40Model[360].setRotationPoint(-6F, -13.25F, -4F);
		wls40Model[360].rotateAngleZ = -0.4712389F;

		wls40Model[361].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.625F, -0.5F, -0.625F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.625F, 0F, -0.625F, 0F, 0F, -0.5F); // Box 74
		wls40Model[361].setRotationPoint(-5.11F, -12.8F, -3F);
		wls40Model[361].rotateAngleZ = -0.4712389F;

		wls40Model[362].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, -0.5F, -0.625F, -0.5F, -0.625F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, -0.625F, 0F, -0.625F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 74
		wls40Model[362].setRotationPoint(-5.11F, -12.8F, -4F);
		wls40Model[362].rotateAngleZ = -0.4712389F;

		wls40Model[363].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.625F, -0.5F, -0.625F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.625F, 0F, -0.625F); // Box 74
		wls40Model[363].setRotationPoint(-6F, -13.25F, -1.9F);
		wls40Model[363].rotateAngleZ = -0.4712389F;

		wls40Model[364].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.625F, -0.5F, -0.625F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.625F, 0F, -0.625F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 74
		wls40Model[364].setRotationPoint(-6F, -13.25F, -2.9F);
		wls40Model[364].rotateAngleZ = -0.4712389F;

		wls40Model[365].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.625F, -0.5F, -0.625F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.625F, 0F, -0.625F, 0F, 0F, -0.5F); // Box 74
		wls40Model[365].setRotationPoint(-5.11F, -12.8F, -1.9F);
		wls40Model[365].rotateAngleZ = -0.4712389F;

		wls40Model[366].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, -0.5F, -0.625F, -0.5F, -0.625F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, -0.625F, 0F, -0.625F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 74
		wls40Model[366].setRotationPoint(-5.11F, -12.8F, -2.9F);
		wls40Model[366].rotateAngleZ = -0.4712389F;

		wls40Model[367].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, -0.375F, -0.25F, -0.75F, -0.375F, -0.25F, -0.75F, -0.375F, -0.25F, 0F, -0.375F, -0.25F, 0F, -0.375F, -0.25F, -0.75F, -0.375F, -0.25F, -0.75F, -0.375F, -0.25F, 0F, -0.375F, -0.25F, 0F); // Box 321
		wls40Model[367].setRotationPoint(-6.5F, -13.5F, 0F);
		wls40Model[367].rotateAngleX = -0.4712389F;
		wls40Model[367].rotateAngleY = -1.57079633F;

		wls40Model[368].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, -0.375F, -0.25F, -0.75F, -0.375F, -0.25F, -0.75F, -0.375F, -0.25F, 0F, -0.375F, -0.25F, 0F, -0.375F, -0.25F, -0.75F, -0.375F, -0.25F, -0.75F, -0.375F, -0.25F, 0F, -0.375F, -0.25F, 0F); // Box 321
		wls40Model[368].setRotationPoint(-6.5F, -13.5F, 3F);
		wls40Model[368].rotateAngleX = -0.4712389F;
		wls40Model[368].rotateAngleY = -1.57079633F;

		wls40Model[369].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 321
		wls40Model[369].setRotationPoint(-6.5F, -11.75F, 4.25F);
		wls40Model[369].rotateAngleX = 1.02974426F;
		wls40Model[369].rotateAngleY = -1.57079633F;

		wls40Model[370].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 321
		wls40Model[370].setRotationPoint(-5.25F, -11.55F, 4.25F);
		wls40Model[370].rotateAngleX = 1.02974426F;
		wls40Model[370].rotateAngleY = -1.57079633F;

		wls40Model[371].addShapeBox(-7F, 0F, -1F, 7, 13, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		wls40Model[371].setRotationPoint(3F, -12F, 11F);

		wls40Model[372].addShapeBox(-7F, 0F, 0F, 7, 13, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		wls40Model[372].setRotationPoint(3F, -12F, -11F);

		wls40Model[373].addShapeBox(-0.25F, 0F, 0F, 1, 0, 5, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 7
		wls40Model[373].setRotationPoint(-28.75F, -16.75F, 4.52F);
		wls40Model[373].rotateAngleY = -1.57079633F;
		wls40Model[373].rotateAngleZ = 0.54105207F;

		wls40Model[374].addShapeBox(-0.25F, 0F, 0F, 1, 0, 5, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 7
		wls40Model[374].setRotationPoint(-28.75F, -16.25F, 4.68F);
		wls40Model[374].rotateAngleY = -1.57079633F;
		wls40Model[374].rotateAngleZ = 0.54105207F;

		wls40Model[375].addShapeBox(-0.25F, 0F, 0F, 1, 0, 5, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 7
		wls40Model[375].setRotationPoint(-28.75F, -15.75F, 4.85F);
		wls40Model[375].rotateAngleY = -1.57079633F;
		wls40Model[375].rotateAngleZ = 0.54105207F;

		wls40Model[376].addShapeBox(-0.25F, 0F, 0F, 1, 0, 5, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 7
		wls40Model[376].setRotationPoint(-28.75F, -15.25F, 5.05F);
		wls40Model[376].rotateAngleY = -1.57079633F;
		wls40Model[376].rotateAngleZ = 0.54105207F;

		wls40Model[377].addShapeBox(-0.25F, 0F, 0F, 1, 0, 5, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 7
		wls40Model[377].setRotationPoint(-28.75F, -14.75F, 5.19F);
		wls40Model[377].rotateAngleY = -1.57079633F;
		wls40Model[377].rotateAngleZ = 0.54105207F;

		wls40Model[378].addShapeBox(-0.25F, 0F, 0F, 1, 0, 5, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 7
		wls40Model[378].setRotationPoint(-28.75F, -14.25F, 5.4F);
		wls40Model[378].rotateAngleY = -1.57079633F;
		wls40Model[378].rotateAngleZ = 0.54105207F;

		wls40Model[379].addShapeBox(-0.25F, 0F, 0F, 1, 0, 5, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 7
		wls40Model[379].setRotationPoint(-28.75F, -13.75F, 5.55F);
		wls40Model[379].rotateAngleY = -1.57079633F;
		wls40Model[379].rotateAngleZ = 0.54105207F;

		wls40Model[380].addShapeBox(-0.25F, 0F, 0F, 1, 0, 5, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 7
		wls40Model[380].setRotationPoint(-28.75F, -13.25F, 5.7F);
		wls40Model[380].rotateAngleY = -1.57079633F;
		wls40Model[380].rotateAngleZ = 0.54105207F;

		wls40Model[381].addShapeBox(-0.25F, 0F, 0F, 1, 0, 5, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 7
		wls40Model[381].setRotationPoint(-23.75F, -16.75F, -4.5F);
		wls40Model[381].rotateAngleY = 1.57079633F;
		wls40Model[381].rotateAngleZ = 0.54105207F;

		wls40Model[382].addShapeBox(-0.25F, 0F, 0F, 1, 0, 5, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 7
		wls40Model[382].setRotationPoint(-23.75F, -16.25F, -4.69F);
		wls40Model[382].rotateAngleY = 1.57079633F;
		wls40Model[382].rotateAngleZ = 0.54105207F;

		wls40Model[383].addShapeBox(-0.25F, 0F, 0F, 1, 0, 5, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 7
		wls40Model[383].setRotationPoint(-23.75F, -15.75F, -4.87F);
		wls40Model[383].rotateAngleY = 1.57079633F;
		wls40Model[383].rotateAngleZ = 0.54105207F;

		wls40Model[384].addShapeBox(-0.25F, 0F, 0F, 1, 0, 5, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 7
		wls40Model[384].setRotationPoint(-23.75F, -15.25F, -5.02F);
		wls40Model[384].rotateAngleY = 1.57079633F;
		wls40Model[384].rotateAngleZ = 0.54105207F;

		wls40Model[385].addShapeBox(-0.25F, 0F, 0F, 1, 0, 5, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 7
		wls40Model[385].setRotationPoint(-23.75F, -14.75F, -5.18F);
		wls40Model[385].rotateAngleY = 1.57079633F;
		wls40Model[385].rotateAngleZ = 0.54105207F;

		wls40Model[386].addShapeBox(-0.25F, 0F, 0F, 1, 0, 5, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 7
		wls40Model[386].setRotationPoint(-23.75F, -14.25F, -5.37F);
		wls40Model[386].rotateAngleY = 1.57079633F;
		wls40Model[386].rotateAngleZ = 0.54105207F;

		wls40Model[387].addShapeBox(-0.25F, 0F, 0F, 1, 0, 5, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 7
		wls40Model[387].setRotationPoint(-23.75F, -13.75F, -5.52F);
		wls40Model[387].rotateAngleY = 1.57079633F;
		wls40Model[387].rotateAngleZ = 0.54105207F;

		wls40Model[388].addShapeBox(-0.25F, 0F, 0F, 1, 0, 5, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 7
		wls40Model[388].setRotationPoint(-23.75F, -13.25F, -5.67F);
		wls40Model[388].rotateAngleY = 1.57079633F;
		wls40Model[388].rotateAngleZ = 0.54105207F;

		wls40Model[389].addBox(0F, 0F, 0F, 3, 2, 2, 0F); // Box 391
		wls40Model[389].setRotationPoint(-60F, 4F, -1F);

		wls40Model[390].addBox(0F, 0F, 0F, 3, 2, 2, 0F); // Box 391
		wls40Model[390].setRotationPoint(10F, 4F, -1F);

		wls40Model[391].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 363
		wls40Model[391].setRotationPoint(-6.5F, -10F, 7.75F);

		wls40Model[392].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 363
		wls40Model[392].setRotationPoint(-7F, -9F, 7.25F);

		wls40Model[393].addShapeBox(-0.5F, 0F, -0.5F, 1, 1, 1, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 321
		wls40Model[393].setRotationPoint(-7F, -10F, 8.25F);
		wls40Model[393].rotateAngleY = 1.57079633F;

		fixRotation(wls40Model, false, true, true);

	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		for (ModelRendererTurbo mrt : wls40Model) {
			if (mrt.boxName.equals("lamp")) {
				Minecraft.getMinecraft().entityRenderer.disableLightmap(1D);
				mrt.render(f5, false);
				Minecraft.getMinecraft().entityRenderer.enableLightmap(1D);
			} else {
				mrt.render(f5, false);
			}
		}
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
	{
	}

	public ModelRendererTurbo wls40Model[];
}