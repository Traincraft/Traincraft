//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2021 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 22.08.2020 - 22:31:05
// Last changed on: 22.08.2020 - 22:31:05

package train.client.render.models; //Path where the model is located


import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import tmt.ModelConverter;
import tmt.ModelRendererTurbo;
import tmt.Tessellator;
import train.common.library.Info;

import java.util.ArrayList;

public class ModelKrautt extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelKrautt() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[376];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 0
		bodyModel[2] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 0
		bodyModel[3] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[4] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 0
		bodyModel[5] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 0
		bodyModel[6] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 0
		bodyModel[7] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 0
		bodyModel[8] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 0
		bodyModel[9] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 0
		bodyModel[10] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 12
		bodyModel[11] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 13
		bodyModel[12] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 14
		bodyModel[13] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 15
		bodyModel[14] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 16
		bodyModel[15] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 17
		bodyModel[16] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 18
		bodyModel[17] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 0
		bodyModel[18] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 0
		bodyModel[19] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 0
		bodyModel[20] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 0
		bodyModel[21] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 0
		bodyModel[22] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 0
		bodyModel[23] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 0
		bodyModel[24] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 0
		bodyModel[25] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 0
		bodyModel[26] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 28
		bodyModel[27] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 29
		bodyModel[28] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 30
		bodyModel[29] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 31
		bodyModel[30] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 32
		bodyModel[31] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 33
		bodyModel[32] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 34
		bodyModel[33] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 0
		bodyModel[34] = new ModelRendererTurbo(this, 393, 9, textureX, textureY); // Box 0
		bodyModel[35] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 0
		bodyModel[36] = new ModelRendererTurbo(this, 113, 33, textureX, textureY); // Box 0
		bodyModel[37] = new ModelRendererTurbo(this, 249, 9, textureX, textureY); // Box 0
		bodyModel[38] = new ModelRendererTurbo(this, 465, 17, textureX, textureY); // Box 0
		bodyModel[39] = new ModelRendererTurbo(this, 281, 25, textureX, textureY); // Box 0
		bodyModel[40] = new ModelRendererTurbo(this, 209, 33, textureX, textureY); // Box 0
		bodyModel[41] = new ModelRendererTurbo(this, 313, 33, textureX, textureY); // Box 0
		bodyModel[42] = new ModelRendererTurbo(this, 337, 41, textureX, textureY); // Box 0
		bodyModel[43] = new ModelRendererTurbo(this, 313, 9, textureX, textureY); // Box 0
		bodyModel[44] = new ModelRendererTurbo(this, 417, 41, textureX, textureY); // Box 55
		bodyModel[45] = new ModelRendererTurbo(this, 241, 49, textureX, textureY); // Box 0
		bodyModel[46] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 448
		bodyModel[47] = new ModelRendererTurbo(this, 249, 9, textureX, textureY); // Box 449
		bodyModel[48] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 4
		bodyModel[49] = new ModelRendererTurbo(this, 201, 9, textureX, textureY); // Box 4
		bodyModel[50] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 449
		bodyModel[51] = new ModelRendererTurbo(this, 457, 17, textureX, textureY); // Box 71
		bodyModel[52] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 73
		bodyModel[53] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 4
		bodyModel[54] = new ModelRendererTurbo(this, 233, 9, textureX, textureY); // Box 4
		bodyModel[55] = new ModelRendererTurbo(this, 393, 9, textureX, textureY); // Box 449
		bodyModel[56] = new ModelRendererTurbo(this, 97, 33, textureX, textureY); // Box 4
		bodyModel[57] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 449
		bodyModel[58] = new ModelRendererTurbo(this, 281, 9, textureX, textureY); // Box 4
		bodyModel[59] = new ModelRendererTurbo(this, 497, 9, textureX, textureY); // Box 4
		bodyModel[60] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 82
		bodyModel[61] = new ModelRendererTurbo(this, 185, 33, textureX, textureY); // Box 83
		bodyModel[62] = new ModelRendererTurbo(this, 329, 17, textureX, textureY); // Box 85
		bodyModel[63] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 0
		bodyModel[64] = new ModelRendererTurbo(this, 209, 25, textureX, textureY); // Box 0
		bodyModel[65] = new ModelRendererTurbo(this, 481, 41, textureX, textureY); // Box 78
		bodyModel[66] = new ModelRendererTurbo(this, 1, 9, textureX, textureY, "lamp"); // Rear lamp U
		bodyModel[67] = new ModelRendererTurbo(this, 249, 9, textureX, textureY, "lamp"); // Rear lamp L
		bodyModel[68] = new ModelRendererTurbo(this, 17, 9, textureX, textureY, "lamp"); // Rear marker light R
		bodyModel[69] = new ModelRendererTurbo(this, 201, 9, textureX, textureY, "lamp"); // Rear marker light L
		bodyModel[70] = new ModelRendererTurbo(this, 241, 9, textureX, textureY, "lamp"); // Rear lamp U
		bodyModel[71] = new ModelRendererTurbo(this, 153, 65, textureX, textureY); // Box 0
		bodyModel[72] = new ModelRendererTurbo(this, 153, 73, textureX, textureY); // Box 0
		bodyModel[73] = new ModelRendererTurbo(this, 289, 73, textureX, textureY); // Box 0
		bodyModel[74] = new ModelRendererTurbo(this, 161, 81, textureX, textureY); // Box 90
		bodyModel[75] = new ModelRendererTurbo(this, 297, 81, textureX, textureY); // Box 91
		bodyModel[76] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 0
		bodyModel[77] = new ModelRendererTurbo(this, 345, 17, textureX, textureY); // Box 0
		bodyModel[78] = new ModelRendererTurbo(this, 265, 9, textureX, textureY); // Box 0
		bodyModel[79] = new ModelRendererTurbo(this, 361, 17, textureX, textureY); // Box 95
		bodyModel[80] = new ModelRendererTurbo(this, 457, 17, textureX, textureY); // Box 96
		bodyModel[81] = new ModelRendererTurbo(this, 289, 9, textureX, textureY); // Box 97
		bodyModel[82] = new ModelRendererTurbo(this, 345, 25, textureX, textureY); // Box 0
		bodyModel[83] = new ModelRendererTurbo(this, 193, 49, textureX, textureY); // Box 0
		bodyModel[84] = new ModelRendererTurbo(this, 345, 33, textureX, textureY); // Box 0
		bodyModel[85] = new ModelRendererTurbo(this, 239, 41, textureX, textureY); // Box 101
		bodyModel[86] = new ModelRendererTurbo(this, 417, 49, textureX, textureY); // Box 0
		bodyModel[87] = new ModelRendererTurbo(this, 441, 49, textureX, textureY); // Box 0
		bodyModel[88] = new ModelRendererTurbo(this, 272, 41, textureX, textureY); // Box 0
		bodyModel[89] = new ModelRendererTurbo(this, 97, 49, textureX, textureY); // Box 101
		bodyModel[90] = new ModelRendererTurbo(this, 417, 49, textureX, textureY); // Box 0
		bodyModel[91] = new ModelRendererTurbo(this, 449, 49, textureX, textureY); // Box 0
		bodyModel[92] = new ModelRendererTurbo(this, 473, 57, textureX, textureY); // Box 0
		bodyModel[93] = new ModelRendererTurbo(this, 281, 65, textureX, textureY); // Box 0
		bodyModel[94] = new ModelRendererTurbo(this, 313, 65, textureX, textureY); // Box 0
		bodyModel[95] = new ModelRendererTurbo(this, 433, 65, textureX, textureY); // Box 0
		bodyModel[96] = new ModelRendererTurbo(this, 281, 25, textureX, textureY); // Exhaust 1
		bodyModel[97] = new ModelRendererTurbo(this, 497, 25, textureX, textureY); // Exhaust 2
		bodyModel[98] = new ModelRendererTurbo(this, 313, 9, textureX, textureY); // Rear sand fill
		bodyModel[99] = new ModelRendererTurbo(this, 489, 9, textureX, textureY); // Box 0
		bodyModel[100] = new ModelRendererTurbo(this, 473, 17, textureX, textureY); // Box 0
		bodyModel[101] = new ModelRendererTurbo(this, 97, 33, textureX, textureY); // Box 0
		bodyModel[102] = new ModelRendererTurbo(this, 113, 33, textureX, textureY); // Box 0
		bodyModel[103] = new ModelRendererTurbo(this, 185, 33, textureX, textureY); // Box 203
		bodyModel[104] = new ModelRendererTurbo(this, 241, 33, textureX, textureY); // Box 203
		bodyModel[105] = new ModelRendererTurbo(this, 313, 33, textureX, textureY); // Box 203
		bodyModel[106] = new ModelRendererTurbo(this, 377, 33, textureX, textureY); // Box 203
		bodyModel[107] = new ModelRendererTurbo(this, 129, 33, textureX, textureY); // Box 0
		bodyModel[108] = new ModelRendererTurbo(this, 233, 9, textureX, textureY); // Box 0
		bodyModel[109] = new ModelRendererTurbo(this, 505, 41, textureX, textureY); // Box 208
		bodyModel[110] = new ModelRendererTurbo(this, 281, 9, textureX, textureY); // Box 209
		bodyModel[111] = new ModelRendererTurbo(this, 377, 9, textureX, textureY); // Box 203
		bodyModel[112] = new ModelRendererTurbo(this, 393, 9, textureX, textureY); // Box 203
		bodyModel[113] = new ModelRendererTurbo(this, 409, 9, textureX, textureY); // Box 212
		bodyModel[114] = new ModelRendererTurbo(this, 505, 9, textureX, textureY); // Box 213
		bodyModel[115] = new ModelRendererTurbo(this, 217, 41, textureX, textureY); // Exhaust 1
		bodyModel[116] = new ModelRendererTurbo(this, 345, 41, textureX, textureY); // Exhaust 1
		bodyModel[117] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Exhaust 1
		bodyModel[118] = new ModelRendererTurbo(this, 465, 65, textureX, textureY); // Exhaust 1
		bodyModel[119] = new ModelRendererTurbo(this, 473, 65, textureX, textureY); // Exhaust 1
		bodyModel[120] = new ModelRendererTurbo(this, 481, 65, textureX, textureY); // Exhaust 1
		bodyModel[121] = new ModelRendererTurbo(this, 489, 65, textureX, textureY); // Exhaust 1
		bodyModel[122] = new ModelRendererTurbo(this, 497, 65, textureX, textureY); // Exhaust 1
		bodyModel[123] = new ModelRendererTurbo(this, 505, 65, textureX, textureY); // Exhaust 1
		bodyModel[124] = new ModelRendererTurbo(this, 433, 73, textureX, textureY); // Exhaust 1
		bodyModel[125] = new ModelRendererTurbo(this, 441, 73, textureX, textureY); // Exhaust 1
		bodyModel[126] = new ModelRendererTurbo(this, 449, 73, textureX, textureY); // Exhaust 1
		bodyModel[127] = new ModelRendererTurbo(this, 457, 73, textureX, textureY); // Box 158
		bodyModel[128] = new ModelRendererTurbo(this, 465, 81, textureX, textureY); // Box 159
		bodyModel[129] = new ModelRendererTurbo(this, 473, 81, textureX, textureY); // Box 160
		bodyModel[130] = new ModelRendererTurbo(this, 481, 81, textureX, textureY); // Box 161
		bodyModel[131] = new ModelRendererTurbo(this, 489, 81, textureX, textureY); // Box 162
		bodyModel[132] = new ModelRendererTurbo(this, 497, 81, textureX, textureY); // Box 163
		bodyModel[133] = new ModelRendererTurbo(this, 505, 81, textureX, textureY); // Box 164
		bodyModel[134] = new ModelRendererTurbo(this, 161, 89, textureX, textureY); // Box 165
		bodyModel[135] = new ModelRendererTurbo(this, 169, 89, textureX, textureY); // Box 166
		bodyModel[136] = new ModelRendererTurbo(this, 177, 89, textureX, textureY); // Box 167
		bodyModel[137] = new ModelRendererTurbo(this, 185, 89, textureX, textureY); // Box 168
		bodyModel[138] = new ModelRendererTurbo(this, 193, 89, textureX, textureY); // Box 169
		bodyModel[139] = new ModelRendererTurbo(this, 201, 89, textureX, textureY); // Box 0
		bodyModel[140] = new ModelRendererTurbo(this, 233, 89, textureX, textureY); // Box 151
		bodyModel[141] = new ModelRendererTurbo(this, 249, 89, textureX, textureY); // Box 0
		bodyModel[142] = new ModelRendererTurbo(this, 289, 89, textureX, textureY); // Box 0
		bodyModel[143] = new ModelRendererTurbo(this, 305, 89, textureX, textureY); // Box 0
		bodyModel[144] = new ModelRendererTurbo(this, 329, 89, textureX, textureY); // Box 156
		bodyModel[145] = new ModelRendererTurbo(this, 353, 89, textureX, textureY); // Door
		bodyModel[146] = new ModelRendererTurbo(this, 369, 89, textureX, textureY); // Box 0
		bodyModel[147] = new ModelRendererTurbo(this, 361, 89, textureX, textureY); // Box 0
		bodyModel[148] = new ModelRendererTurbo(this, 401, 89, textureX, textureY); // Box 0
		bodyModel[149] = new ModelRendererTurbo(this, 217, 57, textureX, textureY); // Box 0
		bodyModel[150] = new ModelRendererTurbo(this, 265, 41, textureX, textureY); // Box 0
		bodyModel[151] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 0
		bodyModel[152] = new ModelRendererTurbo(this, 185, 49, textureX, textureY); // Box 0
		bodyModel[153] = new ModelRendererTurbo(this, 441, 49, textureX, textureY); // Box 0
		bodyModel[154] = new ModelRendererTurbo(this, 321, 57, textureX, textureY); // Box 166
		bodyModel[155] = new ModelRendererTurbo(this, 337, 57, textureX, textureY); // Box 167
		bodyModel[156] = new ModelRendererTurbo(this, 425, 89, textureX, textureY); // Box 0
		bodyModel[157] = new ModelRendererTurbo(this, 441, 57, textureX, textureY); // Box 0
		bodyModel[158] = new ModelRendererTurbo(this, 425, 97, textureX, textureY); // Box 0
		bodyModel[159] = new ModelRendererTurbo(this, 233, 57, textureX, textureY); // Box 0
		bodyModel[160] = new ModelRendererTurbo(this, 337, 17, textureX, textureY); // Box 0
		bodyModel[161] = new ModelRendererTurbo(this, 305, 65, textureX, textureY); // Box 0
		bodyModel[162] = new ModelRendererTurbo(this, 353, 17, textureX, textureY); // Box 0
		bodyModel[163] = new ModelRendererTurbo(this, 457, 97, textureX, textureY); // Box 178
		bodyModel[164] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 179
		bodyModel[165] = new ModelRendererTurbo(this, 33, 105, textureX, textureY); // Box 180
		bodyModel[166] = new ModelRendererTurbo(this, 193, 49, textureX, textureY); // Box 0
		bodyModel[167] = new ModelRendererTurbo(this, 417, 57, textureX, textureY); // Box 182
		bodyModel[168] = new ModelRendererTurbo(this, 49, 105, textureX, textureY); // Box 0
		bodyModel[169] = new ModelRendererTurbo(this, 89, 104, textureX, textureY); // Box 0
		bodyModel[170] = new ModelRendererTurbo(this, 121, 105, textureX, textureY); // Box 0
		bodyModel[171] = new ModelRendererTurbo(this, 153, 105, textureX, textureY); // Box 0
		bodyModel[172] = new ModelRendererTurbo(this, 185, 105, textureX, textureY); // Box 90
		bodyModel[173] = new ModelRendererTurbo(this, 217, 105, textureX, textureY); // Box 91
		bodyModel[174] = new ModelRendererTurbo(this, 473, 97, textureX, textureY); // Box 0
		bodyModel[175] = new ModelRendererTurbo(this, 497, 97, textureX, textureY); // Box 0
		bodyModel[176] = new ModelRendererTurbo(this, 401, 89, textureX, textureY); // Box 0
		bodyModel[177] = new ModelRendererTurbo(this, 289, 105, textureX, textureY); // Box 209
		bodyModel[178] = new ModelRendererTurbo(this, 321, 105, textureX, textureY); // Box 210
		bodyModel[179] = new ModelRendererTurbo(this, 1, 33, textureX, textureY, "lamp"); // Front lamp U
		bodyModel[180] = new ModelRendererTurbo(this, 201, 33, textureX, textureY, "lamp"); // Front lamp L
		bodyModel[181] = new ModelRendererTurbo(this, 481, 41, textureX, textureY, "lamp"); // Front gyralight L
		bodyModel[182] = new ModelRendererTurbo(this, 321, 33, textureX, textureY); // Box 150
		bodyModel[183] = new ModelRendererTurbo(this, 497, 41, textureX, textureY, "lamp"); // Front gyralight L
		bodyModel[184] = new ModelRendererTurbo(this, 321, 89, textureX, textureY); // Box 150
		bodyModel[185] = new ModelRendererTurbo(this, 473, 49, textureX, textureY, "lamp"); // SP emergency light
		bodyModel[186] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 0
		bodyModel[187] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 0
		bodyModel[188] = new ModelRendererTurbo(this, 497, 33, textureX, textureY); // Box 0
		bodyModel[189] = new ModelRendererTurbo(this, 313, 41, textureX, textureY); // Box 0
		bodyModel[190] = new ModelRendererTurbo(this, 505, 33, textureX, textureY); // Box 216
		bodyModel[191] = new ModelRendererTurbo(this, 481, 9, textureX, textureY, "lamp"); // Front numberboard L
		bodyModel[192] = new ModelRendererTurbo(this, 385, 33, textureX, textureY, "lamp"); // Front numberboard R
		bodyModel[193] = new ModelRendererTurbo(this, 369, 17, textureX, textureY, "lamp"); // Front marker light L
		bodyModel[194] = new ModelRendererTurbo(this, 377, 17, textureX, textureY, "lamp"); // Front marker light L
		bodyModel[195] = new ModelRendererTurbo(this, 241, 49, textureX, textureY); // Box 0
		bodyModel[196] = new ModelRendererTurbo(this, 313, 49, textureX, textureY); // Box 0
		bodyModel[197] = new ModelRendererTurbo(this, 345, 105, textureX, textureY); // Box 0
		bodyModel[198] = new ModelRendererTurbo(this, 433, 105, textureX, textureY); // Box 0
		bodyModel[199] = new ModelRendererTurbo(this, 409, 25, textureX, textureY); // Box 0
		bodyModel[200] = new ModelRendererTurbo(this, 449, 105, textureX, textureY); // Box 0
		bodyModel[201] = new ModelRendererTurbo(this, 465, 105, textureX, textureY); // Box 0
		bodyModel[202] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Box 230
		bodyModel[203] = new ModelRendererTurbo(this, 17, 113, textureX, textureY); // Box 231
		bodyModel[204] = new ModelRendererTurbo(this, 17, 33, textureX, textureY); // Box 232
		bodyModel[205] = new ModelRendererTurbo(this, 33, 113, textureX, textureY); // Box 233
		bodyModel[206] = new ModelRendererTurbo(this, 49, 113, textureX, textureY); // Box 234
		bodyModel[207] = new ModelRendererTurbo(this, 321, 49, textureX, textureY); // Box 486
		bodyModel[208] = new ModelRendererTurbo(this, 201, 57, textureX, textureY); // Box 487
		bodyModel[209] = new ModelRendererTurbo(this, 241, 57, textureX, textureY); // Box 488
		bodyModel[210] = new ModelRendererTurbo(this, 353, 41, textureX, textureY); // Box 489
		bodyModel[211] = new ModelRendererTurbo(this, 105, 113, textureX, textureY); // Box 0
		bodyModel[212] = new ModelRendererTurbo(this, 337, 113, textureX, textureY); // Box 0
		bodyModel[213] = new ModelRendererTurbo(this, 121, 113, textureX, textureY); // Box 0
		bodyModel[214] = new ModelRendererTurbo(this, 1, 121, textureX, textureY); // Box 0
		bodyModel[215] = new ModelRendererTurbo(this, 281, 97, textureX, textureY); // Box 0
		bodyModel[216] = new ModelRendererTurbo(this, 297, 25, textureX, textureY); // Box 143
		bodyModel[217] = new ModelRendererTurbo(this, 329, 17, textureX, textureY); // Box 143
		bodyModel[218] = new ModelRendererTurbo(this, 297, 33, textureX, textureY); // Box 241
		bodyModel[219] = new ModelRendererTurbo(this, 345, 17, textureX, textureY); // Box 242
		bodyModel[220] = new ModelRendererTurbo(this, 121, 113, textureX, textureY); // Box 0
		bodyModel[221] = new ModelRendererTurbo(this, 225, 41, textureX, textureY); // Box 143
		bodyModel[222] = new ModelRendererTurbo(this, 361, 17, textureX, textureY); // Box 143
		bodyModel[223] = new ModelRendererTurbo(this, 329, 41, textureX, textureY); // Box 241
		bodyModel[224] = new ModelRendererTurbo(this, 457, 17, textureX, textureY); // Box 242
		bodyModel[225] = new ModelRendererTurbo(this, 137, 113, textureX, textureY); // Box 4
		bodyModel[226] = new ModelRendererTurbo(this, 153, 113, textureX, textureY); // Box 253
		bodyModel[227] = new ModelRendererTurbo(this, 177, 113, textureX, textureY); // Box 254
		bodyModel[228] = new ModelRendererTurbo(this, 193, 113, textureX, textureY); // Box 4
		bodyModel[229] = new ModelRendererTurbo(this, 217, 113, textureX, textureY); // Box 4
		bodyModel[230] = new ModelRendererTurbo(this, 233, 113, textureX, textureY); // Box 253
		bodyModel[231] = new ModelRendererTurbo(this, 249, 121, textureX, textureY); // Box 254
		bodyModel[232] = new ModelRendererTurbo(this, 256, 125, textureX, textureY); // Box 0
		bodyModel[233] = new ModelRendererTurbo(this, 313, 57, textureX, textureY); // Box 0
		bodyModel[234] = new ModelRendererTurbo(this, 161, 114, textureX, textureY); // Box 0
		bodyModel[235] = new ModelRendererTurbo(this, 329, 121, textureX, textureY); // Box 0
		bodyModel[236] = new ModelRendererTurbo(this, 89, 108, textureX, textureY); // Box 0
		bodyModel[237] = new ModelRendererTurbo(this, 353, 121, textureX, textureY); // Box 0
		bodyModel[238] = new ModelRendererTurbo(this, 369, 121, textureX, textureY); // Box 0
		bodyModel[239] = new ModelRendererTurbo(this, 209, 113, textureX, textureY); // Box 0
		bodyModel[240] = new ModelRendererTurbo(this, 305, 113, textureX, textureY); // Box 0
		bodyModel[241] = new ModelRendererTurbo(this, 497, 57, textureX, textureY); // Box 0
		bodyModel[242] = new ModelRendererTurbo(this, 457, 65, textureX, textureY); // Box 0
		bodyModel[243] = new ModelRendererTurbo(this, 329, 57, textureX, textureY); // Box 0
		bodyModel[244] = new ModelRendererTurbo(this, 425, 73, textureX, textureY); // Box 0
		bodyModel[245] = new ModelRendererTurbo(this, 281, 89, textureX, textureY); // Box 0
		bodyModel[246] = new ModelRendererTurbo(this, 345, 89, textureX, textureY); // Box 0
		bodyModel[247] = new ModelRendererTurbo(this, 345, 57, textureX, textureY); // Box 0
		bodyModel[248] = new ModelRendererTurbo(this, 457, 89, textureX, textureY); // Box 0
		bodyModel[249] = new ModelRendererTurbo(this, 281, 97, textureX, textureY); // Box 0
		bodyModel[250] = new ModelRendererTurbo(this, 505, 113, textureX, textureY); // Box 0
		bodyModel[251] = new ModelRendererTurbo(this, 361, 89, textureX, textureY); // Box 0
		bodyModel[252] = new ModelRendererTurbo(this, 273, 121, textureX, textureY); // Box 0
		bodyModel[253] = new ModelRendererTurbo(this, 385, 121, textureX, textureY); // Box 0
		bodyModel[254] = new ModelRendererTurbo(this, 393, 121, textureX, textureY); // Box 0
		bodyModel[255] = new ModelRendererTurbo(this, 505, 97, textureX, textureY); // Box 0
		bodyModel[256] = new ModelRendererTurbo(this, 401, 121, textureX, textureY); // Box 0
		bodyModel[257] = new ModelRendererTurbo(this, 409, 121, textureX, textureY); // Box 0
		bodyModel[258] = new ModelRendererTurbo(this, 417, 121, textureX, textureY); // Box 285
		bodyModel[259] = new ModelRendererTurbo(this, 297, 105, textureX, textureY); // Box 286
		bodyModel[260] = new ModelRendererTurbo(this, 425, 121, textureX, textureY); // Box 287
		bodyModel[261] = new ModelRendererTurbo(this, 433, 121, textureX, textureY); // Box 288
		bodyModel[262] = new ModelRendererTurbo(this, 441, 121, textureX, textureY); // Box 289
		bodyModel[263] = new ModelRendererTurbo(this, 353, 105, textureX, textureY); // Box 290
		bodyModel[264] = new ModelRendererTurbo(this, 449, 121, textureX, textureY); // Box 291
		bodyModel[265] = new ModelRendererTurbo(this, 457, 121, textureX, textureY); // Box 292
		bodyModel[266] = new ModelRendererTurbo(this, 465, 121, textureX, textureY); // Box 293
		bodyModel[267] = new ModelRendererTurbo(this, 441, 105, textureX, textureY); // Box 294
		bodyModel[268] = new ModelRendererTurbo(this, 473, 121, textureX, textureY); // Box 295
		bodyModel[269] = new ModelRendererTurbo(this, 481, 121, textureX, textureY); // Box 296
		bodyModel[270] = new ModelRendererTurbo(this, 489, 121, textureX, textureY); // Box 297
		bodyModel[271] = new ModelRendererTurbo(this, 457, 105, textureX, textureY); // Box 298
		bodyModel[272] = new ModelRendererTurbo(this, 497, 121, textureX, textureY); // Box 299
		bodyModel[273] = new ModelRendererTurbo(this, 505, 121, textureX, textureY); // Box 300
		bodyModel[274] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Box 28
		bodyModel[275] = new ModelRendererTurbo(this, 17, 129, textureX, textureY); // Box 552
		bodyModel[276] = new ModelRendererTurbo(this, 25, 129, textureX, textureY); // Box 28
		bodyModel[277] = new ModelRendererTurbo(this, 193, 121, textureX, textureY); // Box 0
		bodyModel[278] = new ModelRendererTurbo(this, 41, 129, textureX, textureY); // Box 0
		bodyModel[279] = new ModelRendererTurbo(this, 65, 129, textureX, textureY); // Box 28
		bodyModel[280] = new ModelRendererTurbo(this, 81, 129, textureX, textureY); // Box 552
		bodyModel[281] = new ModelRendererTurbo(this, 289, 129, textureX, textureY); // Box 28
		bodyModel[282] = new ModelRendererTurbo(this, 329, 113, textureX, textureY, "lamp"); // Rear lamp U
		bodyModel[283] = new ModelRendererTurbo(this, 305, 121, textureX, textureY); // Late handrail part
		bodyModel[284] = new ModelRendererTurbo(this, 17, 49, textureX, textureY); // Late handrail part
		bodyModel[285] = new ModelRendererTurbo(this, 281, 25, textureX, textureY); // Late handrail part
		bodyModel[286] = new ModelRendererTurbo(this, 417, 49, textureX, textureY); // Late handrail part
		bodyModel[287] = new ModelRendererTurbo(this, 497, 25, textureX, textureY); // Late handrail part
		bodyModel[288] = new ModelRendererTurbo(this, 89, 129, textureX, textureY); // Front weight
		bodyModel[289] = new ModelRendererTurbo(this, 113, 129, textureX, textureY); // Box 203
		bodyModel[290] = new ModelRendererTurbo(this, 129, 129, textureX, textureY); // Box 203
		bodyModel[291] = new ModelRendererTurbo(this, 201, 129, textureX, textureY); // Box 203
		bodyModel[292] = new ModelRendererTurbo(this, 217, 129, textureX, textureY); // Box 203
		bodyModel[293] = new ModelRendererTurbo(this, 233, 129, textureX, textureY); // Box 203
		bodyModel[294] = new ModelRendererTurbo(this, 273, 129, textureX, textureY); // Box 203
		bodyModel[295] = new ModelRendererTurbo(this, 321, 129, textureX, textureY); // Box 203
		bodyModel[296] = new ModelRendererTurbo(this, 385, 129, textureX, textureY); // Box 203
		bodyModel[297] = new ModelRendererTurbo(this, 401, 129, textureX, textureY); // Roof walkway part
		bodyModel[298] = new ModelRendererTurbo(this, 417, 41, textureX, textureY); // Roof walkway part
		bodyModel[299] = new ModelRendererTurbo(this, 249, 49, textureX, textureY); // Roof walkway part
		bodyModel[300] = new ModelRendererTurbo(this, 353, 49, textureX, textureY); // Roof walkway part
		bodyModel[301] = new ModelRendererTurbo(this, 249, 57, textureX, textureY); // Roof walkway part
		bodyModel[302] = new ModelRendererTurbo(this, 425, 129, textureX, textureY); // Roof walkway part
		bodyModel[303] = new ModelRendererTurbo(this, 353, 57, textureX, textureY); // Roof walkway part
		bodyModel[304] = new ModelRendererTurbo(this, 473, 57, textureX, textureY); // Roof walkway part
		bodyModel[305] = new ModelRendererTurbo(this, 9, 65, textureX, textureY); // Roof walkway part
		bodyModel[306] = new ModelRendererTurbo(this, 9, 73, textureX, textureY); // Roof walkway part
		bodyModel[307] = new ModelRendererTurbo(this, 449, 129, textureX, textureY); // Box 203
		bodyModel[308] = new ModelRendererTurbo(this, 465, 129, textureX, textureY); // Box 203
		bodyModel[309] = new ModelRendererTurbo(this, 481, 129, textureX, textureY); // Box 203
		bodyModel[310] = new ModelRendererTurbo(this, 497, 129, textureX, textureY); // Box 203
		bodyModel[311] = new ModelRendererTurbo(this, 65, 137, textureX, textureY); // Radiator tank extension part
		bodyModel[312] = new ModelRendererTurbo(this, 329, 139, textureX, textureY); // Radiator tank extension part
		bodyModel[313] = new ModelRendererTurbo(this, 1, 137, textureX, textureY); // Radiator tank extension part
		bodyModel[314] = new ModelRendererTurbo(this, 169, 137, textureX, textureY); // Box 203
		bodyModel[315] = new ModelRendererTurbo(this, 449, 49, textureX, textureY); // Radiator tank extension part
		bodyModel[316] = new ModelRendererTurbo(this, 313, 65, textureX, textureY); // Radiator tank extension part
		bodyModel[317] = new ModelRendererTurbo(this, 369, 137, textureX, textureY); // Radiator tank extension part
		bodyModel[318] = new ModelRendererTurbo(this, 409, 137, textureX, textureY); // Radiator tank extension part
		bodyModel[319] = new ModelRendererTurbo(this, 241, 137, textureX, textureY); // Radiator tank extension part
		bodyModel[320] = new ModelRendererTurbo(this, 449, 137, textureX, textureY); // Box 203
		bodyModel[321] = new ModelRendererTurbo(this, 305, 89, textureX, textureY); // Radiator tank extension part
		bodyModel[322] = new ModelRendererTurbo(this, 329, 89, textureX, textureY); // Radiator tank extension part
		bodyModel[323] = new ModelRendererTurbo(this, 17, 137, textureX, textureY); // Relocated handbrake part
		bodyModel[324] = new ModelRendererTurbo(this, 97, 129, textureX, textureY); // Relocated handbrake part
		bodyModel[325] = new ModelRendererTurbo(this, 465, 137, textureX, textureY); // Relocated handbrake part
		bodyModel[326] = new ModelRendererTurbo(this, 329, 33, textureX, textureY); // Heat exchanger part
		bodyModel[327] = new ModelRendererTurbo(this, 481, 33, textureX, textureY); // Heat exchanger part
		bodyModel[328] = new ModelRendererTurbo(this, 225, 49, textureX, textureY); // Heat exchanger part
		bodyModel[329] = new ModelRendererTurbo(this, 481, 105, textureX, textureY); // Heat exchanger part
		bodyModel[330] = new ModelRendererTurbo(this, 481, 137, textureX, textureY); // Heat exchanger part
		bodyModel[331] = new ModelRendererTurbo(this, 417, 129, textureX, textureY); // Heat exchanger part
		bodyModel[332] = new ModelRendererTurbo(this, 137, 113, textureX, textureY); // Heat exchanger part
		bodyModel[333] = new ModelRendererTurbo(this, 153, 113, textureX, textureY); // Heat exchanger part
		bodyModel[334] = new ModelRendererTurbo(this, 177, 113, textureX, textureY); // Heat exchanger part
		bodyModel[335] = new ModelRendererTurbo(this, 193, 113, textureX, textureY); // Heat exchanger part
		bodyModel[336] = new ModelRendererTurbo(this, 129, 145, textureX, textureY); // Heat exchanger part
		bodyModel[337] = new ModelRendererTurbo(this, 497, 137, textureX, textureY); // Heat exchanger part
		bodyModel[338] = new ModelRendererTurbo(this, 233, 113, textureX, textureY); // Sun visor part
		bodyModel[339] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Sun visor part
		bodyModel[340] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Sun visor part
		bodyModel[341] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Sun visor part
		bodyModel[342] = new ModelRendererTurbo(this, 505, 17, textureX, textureY); // Sun visor part
		bodyModel[343] = new ModelRendererTurbo(this, 145, 129, textureX, textureY); // Sun visor part
		bodyModel[344] = new ModelRendererTurbo(this, 289, 129, textureX, textureY); // Box 0
		bodyModel[345] = new ModelRendererTurbo(this, 113, 137, textureX, textureY); // Box 377
		bodyModel[346] = new ModelRendererTurbo(this, 169, 137, textureX, textureY); // Box 0
		bodyModel[347] = new ModelRendererTurbo(this, 361, 97, textureX, textureY); // Box 0
		bodyModel[348] = new ModelRendererTurbo(this, 193, 129, textureX, textureY); // Box 380
		bodyModel[349] = new ModelRendererTurbo(this, 393, 129, textureX, textureY); // Rear platform part
		bodyModel[350] = new ModelRendererTurbo(this, 177, 137, textureX, textureY); // Rear platform part
		bodyModel[351] = new ModelRendererTurbo(this, 225, 137, textureX, textureY); // Box 0
		bodyModel[352] = new ModelRendererTurbo(this, 225, 129, textureX, textureY); // Box 0
		bodyModel[353] = new ModelRendererTurbo(this, 161, 137, textureX, textureY); // Box 380
		bodyModel[354] = new ModelRendererTurbo(this, 225, 97, textureX, textureY); // Front weight
		bodyModel[355] = new ModelRendererTurbo(this, 25, 105, textureX, textureY); // Front weight
		bodyModel[356] = new ModelRendererTurbo(this, 9, 113, textureX, textureY); // Box 0
		bodyModel[357] = new ModelRendererTurbo(this, 473, 105, textureX, textureY); // Box 0
		bodyModel[358] = new ModelRendererTurbo(this, 25, 113, textureX, textureY); // Box 0
		bodyModel[359] = new ModelRendererTurbo(this, 41, 113, textureX, textureY); // Box 391
		bodyModel[360] = new ModelRendererTurbo(this, 57, 113, textureX, textureY); // Box 392
		bodyModel[361] = new ModelRendererTurbo(this, 217, 113, textureX, textureY); // Box 393
		bodyModel[362] = new ModelRendererTurbo(this, 369, 33, textureX, textureY); // Sun visor part
		bodyModel[363] = new ModelRendererTurbo(this, 121, 49, textureX, textureY); // Box 385
		bodyModel[364] = new ModelRendererTurbo(this, 1, 145, textureX, textureY); // Box 386
		bodyModel[365] = new ModelRendererTurbo(this, 9, 145, textureX, textureY); // Box 0
		bodyModel[366] = new ModelRendererTurbo(this, 25, 145, textureX, textureY); // Box 388
		bodyModel[367] = new ModelRendererTurbo(this, 274, 89, textureX, textureY); // Box 0
		bodyModel[368] = new ModelRendererTurbo(this, 395, 89, textureX, textureY); // Box 369
		bodyModel[369] = new ModelRendererTurbo(this, 452, 89, textureX, textureY); // Box 0
		bodyModel[370] = new ModelRendererTurbo(this, 452, 97, textureX, textureY); // Box 371
		bodyModel[371] = new ModelRendererTurbo(this, 434, 100, textureX, textureY); // Box 0
		bodyModel[372] = new ModelRendererTurbo(this, 439, 100, textureX, textureY); // Box 373
		bodyModel[373] = new ModelRendererTurbo(this, 338, 122, textureX, textureY); // Box 0
		bodyModel[374] = new ModelRendererTurbo(this, 330, 130, textureX, textureY); // Box 0
		bodyModel[375] = new ModelRendererTurbo(this, 329, 134, textureX, textureY); // Box 0

		bodyModel[0].addShapeBox(0F, 0F, 0F, 85, 3, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[0].setRotationPoint(-42.5F, -0.75F, -11F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 3, 2, 18, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[1].setRotationPoint(-44.75F, 0.25F, -9F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 0, 7, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[2].setRotationPoint(-44.76F, 0.25F, -11F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 3, 5, 0, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[3].setRotationPoint(-44.76F, 2.25F, -9F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 0, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[4].setRotationPoint(-42.5F, 2.25F, -11F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 3, 0, 2, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[5].setRotationPoint(-44.75F, 7.25F, -11F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 3, 0, 2, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[6].setRotationPoint(-44.75F, 4.75F, -11F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 3, 0, 2, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[7].setRotationPoint(-44.75F, 2.25F, -11F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 1, 5, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[8].setRotationPoint(-42.5F, 2.25F, -11F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 2, 5, 0, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[9].setRotationPoint(-41.5F, 2.25F, -11F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 3, 5, 0, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 12
		bodyModel[10].setRotationPoint(-44.76F, 2.25F, 9F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 0, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[11].setRotationPoint(-42.5F, 2.25F, 9F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 3, 0, 2, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 14
		bodyModel[12].setRotationPoint(-44.75F, 7.25F, 9F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 3, 0, 2, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 15
		bodyModel[13].setRotationPoint(-44.75F, 4.75F, 9F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 3, 0, 2, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 16
		bodyModel[14].setRotationPoint(-44.75F, 2.25F, 9F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 2, 5, 0, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 17
		bodyModel[15].setRotationPoint(-41.5F, 2.25F, 11F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 1, 5, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 18
		bodyModel[16].setRotationPoint(-42.5F, 2.25F, 11F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 3, 2, 18, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[17].setRotationPoint(42.5F, 0.25F, -9F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 0, 7, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[18].setRotationPoint(44.76F, 0.25F, -11F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 3, 5, 0, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[19].setRotationPoint(42.49F, 2.25F, -9F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 0, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[20].setRotationPoint(42.5F, 2.25F, -11F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 3, 0, 2, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[21].setRotationPoint(42.5F, 7.25F, -11F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 3, 0, 2, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[22].setRotationPoint(42.5F, 4.75F, -11F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 3, 0, 2, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[23].setRotationPoint(42.5F, 2.25F, -11F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 1, 5, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[24].setRotationPoint(41.5F, 2.25F, -11F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 2, 5, 0, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -1.75F, 0F, 0F); // Box 0
		bodyModel[25].setRotationPoint(39.75F, 2.25F, -11F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 3, 5, 0, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 28
		bodyModel[26].setRotationPoint(42.49F, 2.25F, 9F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 3, 0, 2, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 29
		bodyModel[27].setRotationPoint(42.5F, 7.25F, 9F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 3, 0, 2, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 30
		bodyModel[28].setRotationPoint(42.5F, 4.75F, 9F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 3, 0, 2, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 31
		bodyModel[29].setRotationPoint(42.5F, 2.25F, 9F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 1, 5, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 32
		bodyModel[30].setRotationPoint(41.5F, 2.25F, 11F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 2, 5, 0, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -1.75F, 0F, 0F); // Box 33
		bodyModel[31].setRotationPoint(39.75F, 2.25F, 11F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 0, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		bodyModel[32].setRotationPoint(42.5F, 2.25F, 9F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 1, 2, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 0
		bodyModel[33].setRotationPoint(-42.5F, -2F, -11F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 20, 2, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 0
		bodyModel[34].setRotationPoint(-39.5F, -2F, -11F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 33, 2, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 0
		bodyModel[35].setRotationPoint(-17.5F, -2F, -11F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 22, 2, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 0
		bodyModel[36].setRotationPoint(17.5F, -2F, -11F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 1, 2, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 0
		bodyModel[37].setRotationPoint(41.5F, -2F, -11F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 2, 2, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 1F, 0F, -0.75F, 1F, 0F, -0.75F, 1F, 0F, -0.75F, 1F); // Box 0
		bodyModel[38].setRotationPoint(-41.5F, -2F, -10F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 2, 2, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 1F, 0F, -0.75F, 1F, 0F, -0.75F, 1F, 0F, -0.75F, 1F); // Box 0
		bodyModel[39].setRotationPoint(-19.5F, -2F, -10F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 2, 2, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 1F, 0F, -0.75F, 1F, 0F, -0.75F, 1F, 0F, -0.75F, 1F); // Box 0
		bodyModel[40].setRotationPoint(15.5F, -2F, -10F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 2, 2, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 1F, 0F, -0.75F, 1F, 0F, -0.75F, 1F, 0F, -0.75F, 1F); // Box 0
		bodyModel[41].setRotationPoint(39.5F, -2F, -10F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 26, 5, 22, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[42].setRotationPoint(-14.5F, 2.25F, -11F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 26, 2, 5, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -2F, 0F, -0.5F, -2F, 0F, -0.5F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 0
		bodyModel[43].setRotationPoint(-14.5F, 7.25F, -11F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 26, 2, 5, 0F,0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -2F, 0F, 0F, -2F, 0F); // Box 55
		bodyModel[44].setRotationPoint(-14.5F, 7.25F, 6F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 26, 2, 13, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 0
		bodyModel[45].setRotationPoint(-14.5F, 7.25F, -6.25F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F,0.5F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 448
		bodyModel[46].setRotationPoint(-45.26F, 4F, 2F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 449
		bodyModel[47].setRotationPoint(-45.76F, 4F, -10F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, -0.625F, 0F, 0F, 0.125F, 0F, 0F, -0.5F, -0.75F, 0F, 0F, -0.75F, 0F, -0.625F, -0.75F, 0F, 0.125F, -0.75F, 0F); // Box 4
		bodyModel[48].setRotationPoint(-45.76F, 6F, -10F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 1, 3, 6, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, -0.35F, 0F, -0.5F, -0.15F, 0F, -0.5F, 0.175F, -0.75F, -5.5F, -0.675F, -0.75F, -5.5F, -0.675F, -0.75F, -0.5F, 0.175F, -0.75F, -0.5F); // Box 4
		bodyModel[49].setRotationPoint(-45.76F, 7.25F, -10F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.15F, 0F, -0.75F, -0.35F, 0F, -0.75F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.15F, 0F, -0.5F, -0.35F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 449
		bodyModel[50].setRotationPoint(-45.76F, 3F, -5F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,0.125F, 0F, 0F, -0.625F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0.125F, -0.75F, 0F, -0.625F, -0.75F, 0F, 0F, -0.75F, 0F, -0.5F, -0.75F, 0F); // Box 71
		bodyModel[51].setRotationPoint(-45.76F, 6F, 0F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.35F, 0F, -0.75F, -0.15F, 0F, -0.75F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.35F, 0F, -0.5F, -0.15F, 0F, -0.5F); // Box 73
		bodyModel[52].setRotationPoint(-45.76F, 3F, 2F);

		bodyModel[53].addBox(0F, 0F, 0F, 2, 2, 3, 0F); // Box 4
		bodyModel[53].setRotationPoint(-47.25F, 3F, -1.5F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 4
		bodyModel[54].setRotationPoint(-45.25F, 2.5F, -2F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F,1F, 0F, 0F, -1.5F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 1F, 0F, 0F, -1.5F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F); // Box 449
		bodyModel[55].setRotationPoint(45.76F, 4F, -10F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,1F, 0F, 0F, -1.5F, 0F, 0F, -0.875F, 0F, 0F, 0.375F, 0F, 0F, 1F, -0.75F, 0F, -1.5F, -0.75F, 0F, -0.875F, -0.75F, 0F, 0.375F, -0.75F, 0F); // Box 4
		bodyModel[56].setRotationPoint(45.76F, 6F, -10F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0.65F, 0F, -0.75F, -1.15F, 0F, -0.75F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.65F, 0F, -0.5F, -1.15F, 0F, -0.5F, -1F, 0F, 0F, 0.5F, 0F, 0F); // Box 449
		bodyModel[57].setRotationPoint(45.76F, 3F, -5F);

		bodyModel[58].addBox(0F, 0F, 0F, 2, 2, 3, 0F); // Box 4
		bodyModel[58].setRotationPoint(45.25F, 3F, -1.5F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 4
		bodyModel[59].setRotationPoint(44.75F, 2.5F, -2F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F,0.5F, 0F, 0F, -1F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, 0F); // Box 82
		bodyModel[60].setRotationPoint(45.76F, 4F, 2F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,0.375F, 0F, 0F, -0.875F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, 0F, 0.375F, -0.75F, 0F, -0.875F, -0.75F, 0F, -1.5F, -0.75F, 0F, 1F, -0.75F, 0F); // Box 83
		bodyModel[61].setRotationPoint(45.76F, 6F, 0F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0.5F, 0F, 0F, -1F, 0F, 0F, -1.15F, 0F, -0.75F, 0.65F, 0F, -0.75F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1.15F, 0F, -0.5F, 0.65F, 0F, -0.5F); // Box 85
		bodyModel[62].setRotationPoint(45.76F, 3F, 2F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 65, 18, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[63].setRotationPoint(-22.5F, -20F, -7F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 1, 6, 7, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[64].setRotationPoint(42.5F, -20F, -7F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 1, 6, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 78
		bodyModel[65].setRotationPoint(42.5F, -20F, 0F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Rear lamp U
		bodyModel[66].setRotationPoint(42.5F, -8.75F, -1F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Rear lamp L
		bodyModel[67].setRotationPoint(42.5F, -6.75F, -1F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Rear marker light R
		bodyModel[68].setRotationPoint(42.5F, -13.5F, 4.5F);

		bodyModel[69].addShapeBox(0F, 0F, -1F, 1, 1, 1, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Rear marker light L
		bodyModel[69].setRotationPoint(42.5F, -13.5F, -4.5F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Rear lamp U
		bodyModel[70].setRotationPoint(42.5F, -7.25F, -1F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 64, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.625F, 0F, 0F, -0.625F, 0F, 0F, -0.625F, 0F, 0F, -0.625F, 0F); // Box 0
		bodyModel[71].setRotationPoint(-21.5F, -20.37F, -1F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 64, 1, 3, 0F,0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.625F, 0F, 0F, -0.625F, 0F, 0F, -0.625F, 0F, 0F, -0.625F, 0F); // Box 0
		bodyModel[72].setRotationPoint(-21.5F, -20.37F, -4F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 64, 1, 3, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 0
		bodyModel[73].setRotationPoint(-21.5F, -20.25F, -7F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 64, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.625F, 0F, 0F, -0.625F, 0F, 0F, -0.625F, 0F, 0F, -0.625F, 0F); // Box 90
		bodyModel[74].setRotationPoint(-21.5F, -20.37F, 1F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 64, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 91
		bodyModel[75].setRotationPoint(-21.5F, -20.25F, 4F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.125F, 0F, -0.575F, -0.125F, 0F, -0.15F, 0F, 0F, 0F, 0F, 0F, 0F, -0.625F, 0F, -0.575F, -0.625F, 0F, -0.15F, -0.625F, 0F, 0F, -0.625F, 0F); // Box 0
		bodyModel[76].setRotationPoint(42.5F, -20.37F, -4F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.25F, 0F, -1F, -0.25F, 0F, -0.575F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, -1F, -0.75F, 0F, -0.575F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 0
		bodyModel[77].setRotationPoint(42.5F, -20.25F, -7F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.625F, 0F, -0.15F, -0.625F, 0F, 0F, -0.625F, 0F, 0F, -0.625F, 0F); // Box 0
		bodyModel[78].setRotationPoint(42.5F, -20.37F, -1F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, -0.15F, 0F, 0F, -0.575F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.625F, 0F, -0.15F, -0.625F, 0F, -0.575F, -0.625F, 0F, 0F, -0.625F, 0F); // Box 95
		bodyModel[79].setRotationPoint(42.5F, -20.37F, 1F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, -0.575F, 0F, 0F, -1F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, -0.575F, -0.75F, 0F, -1F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 96
		bodyModel[80].setRotationPoint(42.5F, -20.25F, 4F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -0.15F, 0F, 0F, 0F, 0F, 0F, 0F, -0.625F, 0F, 0F, -0.625F, 0F, -0.15F, -0.625F, 0F, 0F, -0.625F, 0F); // Box 97
		bodyModel[81].setRotationPoint(42.5F, -20.37F, 0F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 0, 2, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[82].setRotationPoint(-21F, -21.37F, -6.5F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 0, 2, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[83].setRotationPoint(-8F, -21.37F, -6.5F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 14, 2, 0, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[84].setRotationPoint(-21F, -21.37F, -6.5F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 14, 2, 0, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 101
		bodyModel[85].setRotationPoint(-21F, -21.37F, 6.5F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 0, 2, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[86].setRotationPoint(10F, -21.37F, -4.5F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 0, 2, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[87].setRotationPoint(23F, -21.37F, -6.5F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 14, 2, 0, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[88].setRotationPoint(10F, -21.37F, -6.5F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 14, 2, 0, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 101
		bodyModel[89].setRotationPoint(10F, -21.37F, 6.5F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 6, 1, 6, 0F,0F, 0F, 0F, -0.95F, 0F, 0F, -0.95F, 0F, -0.95F, 0F, 0F, -0.95F, 0F, -0.5F, 0F, -0.95F, -0.5F, 0F, -0.95F, -0.5F, -0.95F, 0F, -0.5F, -0.95F); // Box 0
		bodyModel[90].setRotationPoint(-7.29F, -20.62F, -2.52F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 6, 1, 6, 0F,0F, 0F, 0F, -0.95F, 0F, 0F, -0.95F, 0F, -0.95F, 0F, 0F, -0.95F, 0F, -0.5F, 0F, -0.95F, -0.5F, 0F, -0.95F, -0.5F, -0.95F, 0F, -0.5F, -0.95F); // Box 0
		bodyModel[91].setRotationPoint(-1.53F, -20.62F, -2.52F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 6, 1, 6, 0F,0F, 0F, 0F, -0.95F, 0F, 0F, -0.95F, 0F, -0.95F, 0F, 0F, -0.95F, 0F, -0.5F, 0F, -0.95F, -0.5F, 0F, -0.95F, -0.5F, -0.95F, 0F, -0.5F, -0.95F); // Box 0
		bodyModel[92].setRotationPoint(4.23F, -20.62F, -2.52F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 6, 1, 6, 0F,0F, 0F, 0F, -0.95F, 0F, 0F, -0.95F, 0F, -0.95F, 0F, 0F, -0.95F, 0F, -0.5F, 0F, -0.95F, -0.5F, 0F, -0.95F, -0.5F, -0.95F, 0F, -0.5F, -0.95F); // Box 0
		bodyModel[93].setRotationPoint(23.71F, -20.62F, -2.52F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 6, 1, 6, 0F,0F, 0F, 0F, -0.95F, 0F, 0F, -0.95F, 0F, -0.95F, 0F, 0F, -0.95F, 0F, -0.5F, 0F, -0.95F, -0.5F, 0F, -0.95F, -0.5F, -0.95F, 0F, -0.5F, -0.95F); // Box 0
		bodyModel[94].setRotationPoint(29.47F, -20.62F, -2.52F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 6, 1, 6, 0F,0F, 0F, 0F, -0.95F, 0F, 0F, -0.95F, 0F, -0.95F, 0F, 0F, -0.95F, 0F, -0.5F, 0F, -0.95F, -0.5F, 0F, -0.95F, -0.5F, -0.95F, 0F, -0.5F, -0.95F); // Box 0
		bodyModel[95].setRotationPoint(35.23F, -20.62F, -2.52F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, -0.5F, 0F, -0.25F, -0.5F); // Exhaust 1
		bodyModel[96].setRotationPoint(-15.75F, -21.12F, -1.25F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, -0.5F, 0F, -0.25F, -0.5F); // Exhaust 2
		bodyModel[97].setRotationPoint(15.25F, -21.12F, -1.25F);

		bodyModel[98].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Rear sand fill
		bodyModel[98].setRotationPoint(42F, -21.12F, -0.5F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, -0.75F, 0F, -0.5F, -0.75F); // Box 0
		bodyModel[99].setRotationPoint(-19F, -20.87F, -0.62F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, -0.75F, 0F, -0.5F, -0.75F); // Box 0
		bodyModel[100].setRotationPoint(-11.25F, -20.87F, -0.62F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, -0.75F, 0F, -0.5F, -0.75F); // Box 0
		bodyModel[101].setRotationPoint(12F, -20.87F, -0.62F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, -0.75F, 0F, -0.5F, -0.75F); // Box 0
		bodyModel[102].setRotationPoint(19.75F, -20.87F, -0.62F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, -0.75F, 0F, -0.5F, -0.75F); // Box 203
		bodyModel[103].setRotationPoint(-3.5F, -20.87F, -5.5F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.75F, -0.75F, -0.5F, -0.75F, -0.75F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 203
		bodyModel[104].setRotationPoint(-3.5F, -20.87F, 3.5F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, -0.75F, 0F, -0.5F, -0.75F); // Box 203
		bodyModel[105].setRotationPoint(27.5F, -20.87F, -5.5F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.75F, -0.75F, -0.5F, -0.75F, -0.75F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 203
		bodyModel[106].setRotationPoint(27.5F, -20.87F, 3.5F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 0, 20, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[107].setRotationPoint(10F, -21.37F, -8F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 0
		bodyModel[108].setRotationPoint(10F, -21.37F, -7F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 0, 20, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 208
		bodyModel[109].setRotationPoint(-8F, -21.37F, 7F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 209
		bodyModel[110].setRotationPoint(-8F, -21.37F, 6F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, -0.5F, 0F, -0.25F, -0.5F); // Box 203
		bodyModel[111].setRotationPoint(1.5F, -20F, -7.5F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, -0.5F, 0F, -0.25F, -0.5F); // Box 203
		bodyModel[112].setRotationPoint(32.5F, -20F, -7.5F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, -0.5F, 0F, -0.25F, -0.5F); // Box 212
		bodyModel[113].setRotationPoint(1.5F, -20F, 7F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, -0.5F, 0F, -0.25F, -0.5F); // Box 213
		bodyModel[114].setRotationPoint(32.5F, -20F, 7F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 2, 10, 1, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, 0F, -0.25F, -0.5F); // Exhaust 1
		bodyModel[115].setRotationPoint(1.75F, -17F, -7.5F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 2, 10, 1, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, 0F, -0.25F, -0.5F); // Exhaust 1
		bodyModel[116].setRotationPoint(-0.5F, -17F, -7.5F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 2, 10, 1, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, 0F, -0.25F, -0.5F); // Exhaust 1
		bodyModel[117].setRotationPoint(6.75F, -17F, -7.5F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 2, 10, 1, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, 0F, -0.25F, -0.5F); // Exhaust 1
		bodyModel[118].setRotationPoint(4.5F, -17F, -7.5F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 2, 10, 1, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, 0F, -0.25F, -0.5F); // Exhaust 1
		bodyModel[119].setRotationPoint(-3.25F, -17F, -7.5F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 2, 10, 1, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, 0F, -0.25F, -0.5F); // Exhaust 1
		bodyModel[120].setRotationPoint(-5.5F, -17F, -7.5F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 2, 10, 1, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, 0F, -0.25F, -0.5F); // Exhaust 1
		bodyModel[121].setRotationPoint(32.75F, -17F, -7.5F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 2, 10, 1, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, 0F, -0.25F, -0.5F); // Exhaust 1
		bodyModel[122].setRotationPoint(30.5F, -17F, -7.5F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 2, 10, 1, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, 0F, -0.25F, -0.5F); // Exhaust 1
		bodyModel[123].setRotationPoint(37.75F, -17F, -7.5F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 2, 10, 1, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, 0F, -0.25F, -0.5F); // Exhaust 1
		bodyModel[124].setRotationPoint(35.5F, -17F, -7.5F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 2, 10, 1, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, 0F, -0.25F, -0.5F); // Exhaust 1
		bodyModel[125].setRotationPoint(27.75F, -17F, -7.5F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 2, 10, 1, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, 0F, -0.25F, -0.5F); // Exhaust 1
		bodyModel[126].setRotationPoint(25.5F, -17F, -7.5F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 2, 10, 1, 0F,0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 158
		bodyModel[127].setRotationPoint(1.75F, -17F, 6.5F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 2, 10, 1, 0F,0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 159
		bodyModel[128].setRotationPoint(-0.5F, -17F, 6.5F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 2, 10, 1, 0F,0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 160
		bodyModel[129].setRotationPoint(6.75F, -17F, 6.5F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 2, 10, 1, 0F,0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 161
		bodyModel[130].setRotationPoint(4.5F, -17F, 6.5F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 2, 10, 1, 0F,0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 162
		bodyModel[131].setRotationPoint(-3.25F, -17F, 6.5F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 2, 10, 1, 0F,0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 163
		bodyModel[132].setRotationPoint(-5.5F, -17F, 6.5F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 2, 10, 1, 0F,0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 164
		bodyModel[133].setRotationPoint(32.75F, -17F, 6.5F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 2, 10, 1, 0F,0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 165
		bodyModel[134].setRotationPoint(30.5F, -17F, 6.5F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 2, 10, 1, 0F,0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 166
		bodyModel[135].setRotationPoint(37.75F, -17F, 6.5F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 2, 10, 1, 0F,0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 167
		bodyModel[136].setRotationPoint(35.5F, -17F, 6.5F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 2, 10, 1, 0F,0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 168
		bodyModel[137].setRotationPoint(27.75F, -17F, 6.5F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 2, 10, 1, 0F,0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 169
		bodyModel[138].setRotationPoint(25.5F, -17F, 6.5F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 12, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[139].setRotationPoint(-35.5F, -12F, -11F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 12, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 151
		bodyModel[140].setRotationPoint(-35.5F, -12F, 10F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 5, 11, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[141].setRotationPoint(-39.5F, -13F, -7F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 3, 11, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[142].setRotationPoint(-42.5F, -13F, -1.5F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 3, 11, 6, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 0
		bodyModel[143].setRotationPoint(-42.5F, -13F, -7F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 3, 11, 6, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 156
		bodyModel[144].setRotationPoint(-42.5F, -13F, 1F);

		bodyModel[145].addShapeBox(0F, 0F, -3F, 1, 10, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Door
		bodyModel[145].setRotationPoint(-35.5F, -12F, -7F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 1, 10, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[146].setRotationPoint(-35.5F, -12F, 7F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 8, 4, 17, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[147].setRotationPoint(-34.5F, -6F, -7F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 4, 4, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[148].setRotationPoint(-26.5F, -6F, -6F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 4, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[149].setRotationPoint(-30.5F, -6F, -10F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[150].setRotationPoint(-31.5F, -4F, -10F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[151].setRotationPoint(-34.5F, -4F, -9F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[152].setRotationPoint(-26.5F, -4F, -9F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[153].setRotationPoint(-25.5F, -4F, -9F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 166
		bodyModel[154].setRotationPoint(-26.5F, -4F, 6F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 167
		bodyModel[155].setRotationPoint(-25.5F, -4F, 6F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 12, 5, 1, 0F,-1.25F, 0F, -2.5F, 1.5F, 0F, -2.5F, 1.5F, 0F, 2.5F, -1.25F, 0F, 2.5F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[156].setRotationPoint(-35.5F, -18F, -10.5F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 12, 2, 1, 0F,-0.5F, 0F, -1F, 0.75F, 0F, -1F, 0.75F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.75F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[157].setRotationPoint(-34.25F, -20F, -8F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 12, 1, 1, 0F,0F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[158].setRotationPoint(-35.5F, -13F, -11F);

		bodyModel[159].addShapeBox(0F, 0F, -3F, 1, 1, 3, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[159].setRotationPoint(-35.5F, -13F, -7F);

		bodyModel[160].addShapeBox(0F, 0F, -3.5F, 1, 1, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[160].setRotationPoint(-35.5F, -13F, -7F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 0
		bodyModel[161].setRotationPoint(-35.5F, -13F, 7F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 0
		bodyModel[162].setRotationPoint(-35.5F, -13F, 9.5F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 12, 5, 1, 0F,-1.25F, 0F, 2.5F, 1.5F, 0F, 2.5F, 1.5F, 0F, -2.5F, -1.25F, 0F, -2.5F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F); // Box 178
		bodyModel[163].setRotationPoint(-35.5F, -18F, 9.5F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 12, 2, 1, 0F,-0.5F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, 0F, 0.75F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F); // Box 179
		bodyModel[164].setRotationPoint(-34.25F, -20F, 7F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 12, 1, 1, 0F,0F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 180
		bodyModel[165].setRotationPoint(-35.5F, -13F, 10F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,-0.25F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, -1F, 0F, 0F, -1F); // Box 0
		bodyModel[166].setRotationPoint(-33.25F, -19F, -7F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,-0.25F, 0F, -0.5F, 0.75F, 0F, -0.5F, 0.75F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, -1F, 0.75F, 0F, -1F, 0.75F, 0F, 0F, 0F, 0F, 0F); // Box 182
		bodyModel[167].setRotationPoint(-33.25F, -19F, 6F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 11, 1, 14, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[168].setRotationPoint(-33.75F, -20F, -7F);

		bodyModel[169].addShapeBox(0F, 0F, 0F, 12, 1, 2, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.625F, 0F, 0.25F, -0.625F, 0F, 0.25F, -0.625F, 0F, 0F, -0.625F, 0F); // Box 0
		bodyModel[169].setRotationPoint(-33.75F, -20.37F, -1F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 12, 1, 3, 0F,0F, -0.125F, 0F, 0.25F, -0.125F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.625F, 0F, 0.25F, -0.625F, 0F, 0.25F, -0.625F, 0F, 0F, -0.625F, 0F); // Box 0
		bodyModel[170].setRotationPoint(-33.75F, -20.37F, -4F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 12, 1, 3, 0F,0F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 0
		bodyModel[171].setRotationPoint(-33.75F, -20.25F, -7F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 12, 1, 3, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.625F, 0F, 0.25F, -0.625F, 0F, 0.25F, -0.625F, 0F, 0F, -0.625F, 0F); // Box 90
		bodyModel[172].setRotationPoint(-33.75F, -20.37F, 1F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 12, 1, 3, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 91
		bodyModel[173].setRotationPoint(-33.75F, -20.25F, 4F);

		bodyModel[174].addShapeBox(0F, 0F, 0F, 1, 6, 15, 0F,-1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, -1F, -1.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 0
		bodyModel[174].setRotationPoint(-35.5F, -19F, -7F);

		bodyModel[175].addShapeBox(0F, 0F, 0F, 1, 10, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F); // Box 0
		bodyModel[175].setRotationPoint(-24F, -12F, -10F);

		bodyModel[176].addShapeBox(0F, 0F, 0F, 1, 6, 3, 0F,-1.5F, 0F, -3F, 1.5F, 0F, -3F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F); // Box 0
		bodyModel[176].setRotationPoint(-24F, -18F, -10F);

		bodyModel[177].addShapeBox(0F, 0F, 0F, 1, 10, 3, 0F,-1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 209
		bodyModel[177].setRotationPoint(-24F, -12F, 7F);

		bodyModel[178].addShapeBox(0F, 0F, 0F, 1, 6, 3, 0F,-1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, -3F, -1.5F, 0F, -3F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 210
		bodyModel[178].setRotationPoint(-24F, -18F, 7F);

		bodyModel[179].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Front lamp U
		bodyModel[179].setRotationPoint(-43.25F, -6.25F, -1F);

		bodyModel[180].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Front lamp L
		bodyModel[180].setRotationPoint(-43.25F, -4.25F, -1F);

		bodyModel[181].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Front gyralight L
		bodyModel[181].setRotationPoint(-43.75F, -9.5F, 0F);

		bodyModel[182].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 150
		bodyModel[182].setRotationPoint(-43F, -9.5F, -2F);

		bodyModel[183].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Front gyralight L
		bodyModel[183].setRotationPoint(-43.75F, -9.5F, -2F);

		bodyModel[184].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 150
		bodyModel[184].setRotationPoint(-43F, -12F, -1.25F);

		bodyModel[185].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // SP emergency light
		bodyModel[185].setRotationPoint(-43.75F, -12F, -1F);

		bodyModel[186].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[186].setRotationPoint(-39F, -13.5F, 6.5F);

		bodyModel[187].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[187].setRotationPoint(-37.5F, -13.5F, 3.5F);

		bodyModel[188].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[188].setRotationPoint(-39F, -13.5F, 3.5F);

		bodyModel[189].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[189].setRotationPoint(-38F, -13.5F, -0.5F);

		bodyModel[190].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 216
		bodyModel[190].setRotationPoint(-39F, -13.5F, -5.5F);

		bodyModel[191].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F); // Front numberboard L
		bodyModel[191].setRotationPoint(-40.4F, -12F, -6.4F);
		bodyModel[191].rotateAngleY = 0.49741884F;

		bodyModel[192].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Front numberboard R
		bodyModel[192].setRotationPoint(-42.8F, -12F, 2F);
		bodyModel[192].rotateAngleY = -0.49741884F;

		bodyModel[193].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Front marker light L
		bodyModel[193].setRotationPoint(-40.75F, -8.5F, -5.25F);
		bodyModel[193].rotateAngleY = 0.49741884F;

		bodyModel[194].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Front marker light L
		bodyModel[194].setRotationPoint(-41.2F, -8.5F, 4.4F);
		bodyModel[194].rotateAngleY = -0.49741884F;

		bodyModel[195].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.65F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.65F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[195].setRotationPoint(-35F, -20F, -1F);

		bodyModel[196].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.6F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.6F, 0F, 0F, 0F, -0.625F, 0F, -0.4F, -0.625F, 0F, -0.4F, -0.625F, 0F, 0F, -0.625F, 0F); // Box 0
		bodyModel[196].setRotationPoint(-34.35F, -20.38F, -1F);

		bodyModel[197].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.8F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.65F, 0F, 0F, -0.15F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[197].setRotationPoint(-35F, -20F, -4F);

		bodyModel[198].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-1.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, -0.65F, 0F, 0F, -0.5F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[198].setRotationPoint(-34.85F, -20F, -7F);

		bodyModel[199].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.6F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.6F, 0F, -0.5F, -0.35F, 0F, 0F, -0.65F, 0F, 0F, -0.65F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 0
		bodyModel[199].setRotationPoint(-34.35F, -20F, -7.5F);

		bodyModel[200].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.6F, -0.125F, 0F, -0.4F, -0.125F, 0F, -0.4F, 0F, 0F, -0.6F, 0F, 0F, -0.15F, -0.625F, 0F, -0.4F, -0.625F, 0F, -0.4F, -0.625F, 0F, 0F, -0.625F, 0F); // Box 0
		bodyModel[200].setRotationPoint(-34.35F, -20.38F, -4F);

		bodyModel[201].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.45F, -0.25F, 0F, -0.55F, -0.25F, 0F, -0.55F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, -0.75F, 0F, -0.55F, -0.75F, 0F, -0.55F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 0
		bodyModel[201].setRotationPoint(-34.2F, -20.25F, -7F);

		bodyModel[202].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.65F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.15F, 0F, 0F); // Box 230
		bodyModel[202].setRotationPoint(-35F, -20F, 1F);

		bodyModel[203].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.65F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, -1.1F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, -0.5F, 0F, 0F); // Box 231
		bodyModel[203].setRotationPoint(-34.85F, -20F, 4F);

		bodyModel[204].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.6F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.6F, 0F, -0.5F, 0F, 0F, -0.5F, -0.65F, 0F, -0.5F, -0.65F, 0F, 0F, -0.35F, 0F, 0F); // Box 232
		bodyModel[204].setRotationPoint(-34.35F, -20F, 6.5F);

		bodyModel[205].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.6F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -0.125F, 0F, -0.6F, -0.125F, 0F, 0F, -0.625F, 0F, -0.4F, -0.625F, 0F, -0.4F, -0.625F, 0F, -0.15F, -0.625F, 0F); // Box 233
		bodyModel[205].setRotationPoint(-34.35F, -20.38F, 1F);

		bodyModel[206].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.45F, 0F, 0F, -0.55F, 0F, 0F, -0.55F, -0.25F, 0F, -0.45F, -0.25F, 0F, 0F, -0.75F, 0F, -0.55F, -0.75F, 0F, -0.55F, -0.75F, 0F, -0.45F, -0.75F, 0F); // Box 234
		bodyModel[206].setRotationPoint(-34.2F, -20.25F, 4F);

		bodyModel[207].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 486
		bodyModel[207].setRotationPoint(-35F, -21.75F, -1.5F);

		bodyModel[208].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 487
		bodyModel[208].setRotationPoint(-33F, -22.25F, -0.5F);

		bodyModel[209].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 488
		bodyModel[209].setRotationPoint(-34F, -21.75F, 0.5F);

		bodyModel[210].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 489
		bodyModel[210].setRotationPoint(-33F, -21.25F, -0.5F);

		bodyModel[211].addShapeBox(0F, 0F, 0F, 7, 7, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[211].setRotationPoint(-42.5F, -9F, -11F);

		bodyModel[212].addShapeBox(0F, 0F, 0F, 66, 7, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[212].setRotationPoint(-23.5F, -9F, -11F);

		bodyModel[213].addShapeBox(0F, 0F, 0F, 7, 7, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[213].setRotationPoint(-42.5F, -9F, 11F);

		bodyModel[214].addShapeBox(0F, 0F, 0F, 66, 7, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[214].setRotationPoint(-23.5F, -9F, 11F);

		bodyModel[215].addShapeBox(0F, 0F, 0F, 0, 7, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[215].setRotationPoint(-44.75F, -6.75F, -11F);

		bodyModel[216].addShapeBox(0F, 0F, 0F, 0, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 143
		bodyModel[216].setRotationPoint(-44.76F, -5.75F, -8F);
		bodyModel[216].rotateAngleY = -3.14159265F;

		bodyModel[217].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 143
		bodyModel[217].setRotationPoint(-44.76F, -6.75F, -8F);
		bodyModel[217].rotateAngleY = -3.14159265F;

		bodyModel[218].addShapeBox(0F, 0F, 0F, 0, 4, 1, 0F,0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 241
		bodyModel[218].setRotationPoint(-44.76F, -5.75F, 9F);
		bodyModel[218].rotateAngleY = -3.14159265F;

		bodyModel[219].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 242
		bodyModel[219].setRotationPoint(-44.76F, -6.75F, 9F);
		bodyModel[219].rotateAngleY = -3.14159265F;

		bodyModel[220].addShapeBox(0F, 0F, 0F, 0, 7, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[220].setRotationPoint(44.75F, -6.75F, -11F);

		bodyModel[221].addShapeBox(0F, 0F, 0F, 0, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 143
		bodyModel[221].setRotationPoint(44.76F, -5.75F, -8F);
		bodyModel[221].rotateAngleY = -3.14159265F;

		bodyModel[222].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 143
		bodyModel[222].setRotationPoint(44.76F, -6.75F, -8F);
		bodyModel[222].rotateAngleY = -3.14159265F;

		bodyModel[223].addShapeBox(0F, 0F, 0F, 0, 4, 1, 0F,0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 241
		bodyModel[223].setRotationPoint(44.76F, -5.75F, 9F);
		bodyModel[223].rotateAngleY = -3.14159265F;

		bodyModel[224].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 242
		bodyModel[224].setRotationPoint(44.76F, -6.75F, 9F);
		bodyModel[224].rotateAngleY = -3.14159265F;

		bodyModel[225].addShapeBox(0F, 0F, 0F, 1, 3, 5, 0F,-0.15F, 0F, 0F, -0.35F, 0F, 0F, -0.625F, 0F, -0.5F, 0.125F, 0F, -0.5F, 0.175F, -0.75F, 0F, -0.675F, -0.75F, 0F, -1F, -0.75F, -0.5F, 0.5F, -0.75F, -0.5F); // Box 4
		bodyModel[225].setRotationPoint(-45.76F, 7.25F, -4.5F);

		bodyModel[226].addShapeBox(0F, 0F, 0F, 1, 3, 6, 0F,-0.15F, 0F, -0.5F, -0.35F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0.175F, -0.75F, -0.5F, -0.675F, -0.75F, -0.5F, -0.675F, -0.75F, -5.5F, 0.175F, -0.75F, -5.5F); // Box 253
		bodyModel[226].setRotationPoint(-45.76F, 7.25F, 4F);

		bodyModel[227].addShapeBox(0F, 0F, 0F, 1, 3, 5, 0F,0.125F, 0F, -0.5F, -0.625F, 0F, -0.5F, -0.35F, 0F, 0F, -0.15F, 0F, 0F, 0.5F, -0.75F, -0.5F, -1F, -0.75F, -0.5F, -0.675F, -0.75F, 0F, 0.175F, -0.75F, 0F); // Box 254
		bodyModel[227].setRotationPoint(-45.76F, 7.25F, -0.5F);

		bodyModel[228].addShapeBox(0F, 0F, 0F, 1, 3, 6, 0F,1F, 0F, 0F, -1.5F, 0F, 0F, -1.15F, 0F, -0.5F, 0.65F, 0F, -0.5F, 0.325F, -0.75F, -5.5F, -0.825F, -0.75F, -5.5F, -0.825F, -0.75F, -0.5F, 0.325F, -0.75F, -0.5F); // Box 4
		bodyModel[228].setRotationPoint(45.76F, 7.25F, -10F);

		bodyModel[229].addShapeBox(0F, 0F, 0F, 1, 3, 5, 0F,0.65F, 0F, 0F, -1.15F, 0F, 0F, -0.875F, 0F, -0.5F, 0.375F, 0F, -0.5F, 0.325F, -0.75F, 0F, -0.825F, -0.75F, 0F, -0.5F, -0.75F, -0.5F, 0F, -0.75F, -0.5F); // Box 4
		bodyModel[229].setRotationPoint(45.76F, 7.25F, -4.5F);

		bodyModel[230].addShapeBox(0F, 0F, 0F, 1, 3, 6, 0F,0.65F, 0F, -0.5F, -1.15F, 0F, -0.5F, -1.5F, 0F, 0F, 1F, 0F, 0F, 0.325F, -0.75F, -0.5F, -0.825F, -0.75F, -0.5F, -0.825F, -0.75F, -5.5F, 0.325F, -0.75F, -5.5F); // Box 253
		bodyModel[230].setRotationPoint(45.76F, 7.25F, 4F);

		bodyModel[231].addShapeBox(0F, 0F, 0F, 1, 3, 5, 0F,0.375F, 0F, -0.5F, -0.875F, 0F, -0.5F, -1.15F, 0F, 0F, 0.65F, 0F, 0F, 0F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, -0.825F, -0.75F, 0F, 0.325F, -0.75F, 0F); // Box 254
		bodyModel[231].setRotationPoint(45.76F, 7.25F, -0.5F);

		bodyModel[232].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F,0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[232].setRotationPoint(-34.5F, -13F, 1F);

		bodyModel[233].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[233].setRotationPoint(-34.5F, -13F, 9F);

		bodyModel[234].addShapeBox(0F, 0F, 0F, 2, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[234].setRotationPoint(-34.5F, -12F, 1F);

		bodyModel[235].addShapeBox(0F, 0F, 0F, 2, 5, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[235].setRotationPoint(-34.5F, -11F, 1F);

		bodyModel[236].addShapeBox(0F, 0F, 0F, 2, 7, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 0
		bodyModel[236].setRotationPoint(-32.5F, -12.5F, 1F);

		bodyModel[237].addShapeBox(0F, 0F, 0F, 3, 5, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[237].setRotationPoint(-34.5F, -11F, 7F);

		bodyModel[238].addShapeBox(0F, 0F, 0F, 4, 6, 3, 0F,0F, 0F, 0F, -1F, 0F, -3F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -3F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[238].setRotationPoint(-31.5F, -12F, 7F);

		bodyModel[239].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[239].setRotationPoint(-32.5F, -12F, 7F);

		bodyModel[240].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, -0.5F, 0F, -1.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, -1.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 0
		bodyModel[240].setRotationPoint(-31.5F, -13F, 7F);

		bodyModel[241].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 0
		bodyModel[241].setRotationPoint(-32F, -13F, 7F);

		bodyModel[242].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 0
		bodyModel[242].setRotationPoint(-41.5F, -2F, -11F);

		bodyModel[243].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[243].setRotationPoint(-41.5F, -2F, -12F);

		bodyModel[244].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[244].setRotationPoint(-41.5F, -6.5F, -12F);

		bodyModel[245].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 0
		bodyModel[245].setRotationPoint(-41.5F, -5.5F, -12F);

		bodyModel[246].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 0
		bodyModel[246].setRotationPoint(-19.5F, -2F, -11F);

		bodyModel[247].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[247].setRotationPoint(-19.5F, -2F, -12F);

		bodyModel[248].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[248].setRotationPoint(-19.5F, -6.5F, -12F);

		bodyModel[249].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 0
		bodyModel[249].setRotationPoint(-19.5F, -5.5F, -12F);

		bodyModel[250].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 0
		bodyModel[250].setRotationPoint(15.5F, -2F, -11F);

		bodyModel[251].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[251].setRotationPoint(15.5F, -2F, -12F);

		bodyModel[252].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[252].setRotationPoint(15.5F, -6.5F, -12F);

		bodyModel[253].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 0
		bodyModel[253].setRotationPoint(15.5F, -5.5F, -12F);

		bodyModel[254].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 0
		bodyModel[254].setRotationPoint(39.5F, -2F, -11F);

		bodyModel[255].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[255].setRotationPoint(39.5F, -2F, -12F);

		bodyModel[256].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[256].setRotationPoint(39.5F, -6.5F, -12F);

		bodyModel[257].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 0
		bodyModel[257].setRotationPoint(39.5F, -5.5F, -12F);

		bodyModel[258].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 285
		bodyModel[258].setRotationPoint(-41.5F, -2F, 10F);

		bodyModel[259].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 286
		bodyModel[259].setRotationPoint(-41.5F, -2F, 11F);

		bodyModel[260].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 287
		bodyModel[260].setRotationPoint(-41.5F, -6.5F, 11F);

		bodyModel[261].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 288
		bodyModel[261].setRotationPoint(-41.5F, -5.5F, 11F);

		bodyModel[262].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 289
		bodyModel[262].setRotationPoint(-19.5F, -2F, 10F);

		bodyModel[263].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 290
		bodyModel[263].setRotationPoint(-19.5F, -2F, 11F);

		bodyModel[264].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 291
		bodyModel[264].setRotationPoint(-19.5F, -6.5F, 11F);

		bodyModel[265].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 292
		bodyModel[265].setRotationPoint(-19.5F, -5.5F, 11F);

		bodyModel[266].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 293
		bodyModel[266].setRotationPoint(15.5F, -2F, 10F);

		bodyModel[267].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 294
		bodyModel[267].setRotationPoint(15.5F, -2F, 11F);

		bodyModel[268].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 295
		bodyModel[268].setRotationPoint(15.5F, -6.5F, 11F);

		bodyModel[269].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 296
		bodyModel[269].setRotationPoint(15.5F, -5.5F, 11F);

		bodyModel[270].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 297
		bodyModel[270].setRotationPoint(39.5F, -2F, 10F);

		bodyModel[271].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 298
		bodyModel[271].setRotationPoint(39.5F, -2F, 11F);

		bodyModel[272].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 299
		bodyModel[272].setRotationPoint(39.5F, -6.5F, 11F);

		bodyModel[273].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 300
		bodyModel[273].setRotationPoint(39.5F, -5.5F, 11F);

		bodyModel[274].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 28
		bodyModel[274].setRotationPoint(-30F, 2.25F, -9F);

		bodyModel[275].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 552
		bodyModel[275].setRotationPoint(-30F, 2.25F, 7F);

		bodyModel[276].addShapeBox(0F, 0F, 0F, 8, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 28
		bodyModel[276].setRotationPoint(-31.5F, 2.25F, -4F);

		bodyModel[277].addShapeBox(0F, 0F, 0F, 2, 2, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[277].setRotationPoint(11F, 4.25F, -9F);

		bodyModel[278].addShapeBox(0F, 0F, 0F, 2, 2, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[278].setRotationPoint(13F, 2.25F, -9F);

		bodyModel[279].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 28
		bodyModel[279].setRotationPoint(25F, 2.25F, -9F);

		bodyModel[280].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 552
		bodyModel[280].setRotationPoint(25F, 2.25F, 7F);

		bodyModel[281].addShapeBox(0F, 0F, 0F, 8, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 28
		bodyModel[281].setRotationPoint(23.5F, 2.25F, -4F);

		bodyModel[282].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Rear lamp U
		bodyModel[282].setRotationPoint(-43F, -4.75F, -1F);

		bodyModel[283].addShapeBox(0F, 0F, 0F, 0, 2, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Late handrail part
		bodyModel[283].setRotationPoint(-44.75F, -8.75F, -11F);

		bodyModel[284].addShapeBox(0F, 0F, 0F, 0, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F); // Late handrail part
		bodyModel[284].setRotationPoint(-44.76F, -7.75F, -8F);
		bodyModel[284].rotateAngleY = -3.14159265F;

		bodyModel[285].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F); // Late handrail part
		bodyModel[285].setRotationPoint(-44.76F, -8.75F, -8F);
		bodyModel[285].rotateAngleY = -3.14159265F;

		bodyModel[286].addShapeBox(0F, 0F, 0F, 0, 4, 1, 0F,0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F); // Late handrail part
		bodyModel[286].setRotationPoint(-44.76F, -7.75F, 9F);
		bodyModel[286].rotateAngleY = -3.14159265F;

		bodyModel[287].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F); // Late handrail part
		bodyModel[287].setRotationPoint(-44.76F, -8.75F, 9F);
		bodyModel[287].rotateAngleY = -3.14159265F;

		bodyModel[288].addShapeBox(0F, 0F, 0F, 3, 3, 15, 0F,-0.01F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.05F, -0.75F, 0F); // Front weight
		bodyModel[288].setRotationPoint(-44.75F, -2F, -7.5F);

		bodyModel[289].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, -0.75F, 0F, -0.75F, -0.75F); // Box 203
		bodyModel[289].setRotationPoint(2.62F, -20.37F, -5.5F);

		bodyModel[290].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.75F, -0.75F, -0.75F, -0.75F, -0.75F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 203
		bodyModel[290].setRotationPoint(2.62F, -20.37F, 3.5F);

		bodyModel[291].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, -0.75F, 0F, -0.75F, -0.75F); // Box 203
		bodyModel[291].setRotationPoint(33.62F, -20.37F, -5.5F);

		bodyModel[292].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.75F, -0.75F, -0.75F, -0.75F, -0.75F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 203
		bodyModel[292].setRotationPoint(33.62F, -20.37F, 3.5F);

		bodyModel[293].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, -0.75F, 0F, -0.75F, -0.75F); // Box 203
		bodyModel[293].setRotationPoint(-7.25F, -20.37F, -5.5F);

		bodyModel[294].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.75F, -0.75F, -0.75F, -0.75F, -0.75F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 203
		bodyModel[294].setRotationPoint(-7.25F, -20.37F, 3.5F);

		bodyModel[295].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, -0.75F, 0F, -0.75F, -0.75F); // Box 203
		bodyModel[295].setRotationPoint(23.75F, -20.37F, -5.5F);

		bodyModel[296].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.75F, -0.75F, -0.75F, -0.75F, -0.75F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 203
		bodyModel[296].setRotationPoint(23.75F, -20.37F, 3.5F);

		bodyModel[297].addShapeBox(0F, 0F, 0F, 8, 0, 2, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F); // Roof walkway part
		bodyModel[297].setRotationPoint(29F, -20.63F, 4.5F);

		bodyModel[298].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -0.5F, 0F, -0.4F, -0.5F); // Roof walkway part
		bodyModel[298].setRotationPoint(29F, -20.62F, 4.5F);

		bodyModel[299].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -0.5F, 0F, -0.4F, -0.5F); // Roof walkway part
		bodyModel[299].setRotationPoint(36F, -20.62F, 4.5F);

		bodyModel[300].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -0.5F, 0F, -0.4F, -0.5F); // Roof walkway part
		bodyModel[300].setRotationPoint(33.25F, -20.62F, 4.5F);

		bodyModel[301].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -0.5F, 0F, -0.4F, -0.5F); // Roof walkway part
		bodyModel[301].setRotationPoint(31.38F, -20.62F, 4.5F);

		bodyModel[302].addShapeBox(0F, 0F, 0F, 8, 0, 2, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F); // Roof walkway part
		bodyModel[302].setRotationPoint(-2F, -20.63F, 4.5F);

		bodyModel[303].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -0.5F, 0F, -0.4F, -0.5F); // Roof walkway part
		bodyModel[303].setRotationPoint(-2F, -20.62F, 4.5F);

		bodyModel[304].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -0.5F, 0F, -0.4F, -0.5F); // Roof walkway part
		bodyModel[304].setRotationPoint(5F, -20.62F, 4.5F);

		bodyModel[305].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -0.5F, 0F, -0.4F, -0.5F); // Roof walkway part
		bodyModel[305].setRotationPoint(2.25F, -20.62F, 4.5F);

		bodyModel[306].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -0.5F, 0F, -0.4F, -0.5F); // Roof walkway part
		bodyModel[306].setRotationPoint(0.38F, -20.62F, 4.5F);

		bodyModel[307].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, -0.75F, 0F, -0.75F, -0.75F); // Box 203
		bodyModel[307].setRotationPoint(-3.5F, -20.37F, -5.5F);

		bodyModel[308].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.75F, -0.75F, -0.75F, -0.75F, -0.75F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 203
		bodyModel[308].setRotationPoint(-3.5F, -20.37F, 3.5F);

		bodyModel[309].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, -0.75F, 0F, -0.75F, -0.75F); // Box 203
		bodyModel[309].setRotationPoint(27.5F, -20.37F, -5.5F);

		bodyModel[310].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.75F, -0.75F, -0.75F, -0.75F, -0.75F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 203
		bodyModel[310].setRotationPoint(27.5F, -20.37F, 3.5F);

		bodyModel[311].addShapeBox(0F, 0F, 0F, 17, 1, 2, 0F,0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F); // Radiator tank extension part
		bodyModel[311].setRotationPoint(-7.3F, -21F, 5F);

		bodyModel[312].addShapeBox(0F, 0F, 0F, 17, 1, 2, 0F,0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F); // Radiator tank extension part
		bodyModel[312].setRotationPoint(-7.3F, -21F, -7F);

		bodyModel[313].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.75F, -0.75F, -0.5F, -0.75F, -0.75F, -0.5F, 0F, 0F, -0.5F, 0F); // Radiator tank extension part
		bodyModel[313].setRotationPoint(-3.5F, -21.5F, 4.25F);

		bodyModel[314].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, -0.75F, 0F, -0.5F, -0.75F); // Box 203
		bodyModel[314].setRotationPoint(-3.5F, -21.5F, -6.25F);

		bodyModel[315].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, -0.5F, 0F, -0.25F, -0.5F); // Radiator tank extension part
		bodyModel[315].setRotationPoint(1.5F, -21F, 7F);

		bodyModel[316].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, -0.5F, 0F, -0.25F, -0.5F); // Radiator tank extension part
		bodyModel[316].setRotationPoint(3F, -20F, 7F);

		bodyModel[317].addShapeBox(0F, 0F, 0F, 17, 1, 2, 0F,0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F); // Radiator tank extension part
		bodyModel[317].setRotationPoint(23.7F, -21F, 5F);

		bodyModel[318].addShapeBox(0F, 0F, 0F, 17, 1, 2, 0F,0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F); // Radiator tank extension part
		bodyModel[318].setRotationPoint(23.7F, -21F, -7F);

		bodyModel[319].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.75F, -0.75F, -0.5F, -0.75F, -0.75F, -0.5F, 0F, 0F, -0.5F, 0F); // Radiator tank extension part
		bodyModel[319].setRotationPoint(27.5F, -21.5F, 4.25F);

		bodyModel[320].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, -0.75F, 0F, -0.5F, -0.75F); // Box 203
		bodyModel[320].setRotationPoint(27.5F, -21.5F, -6.25F);

		bodyModel[321].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, -0.5F, 0F, -0.25F, -0.5F); // Radiator tank extension part
		bodyModel[321].setRotationPoint(32.5F, -21F, 7F);

		bodyModel[322].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, -0.5F, 0F, -0.25F, -0.5F); // Radiator tank extension part
		bodyModel[322].setRotationPoint(34F, -20F, 7F);

		bodyModel[323].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Relocated handbrake part
		bodyModel[323].setRotationPoint(-38.5F, -7.5F, 11F);

		bodyModel[324].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Relocated handbrake part
		bodyModel[324].setRotationPoint(-31.5F, 2F, 11F);

		bodyModel[325].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Relocated handbrake part
		bodyModel[325].setRotationPoint(-37.5F, 2F, 11F);

		bodyModel[326].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Heat exchanger part
		bodyModel[326].setRotationPoint(23.7F, -21.62F, -1.5F);

		bodyModel[327].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Heat exchanger part
		bodyModel[327].setRotationPoint(23.7F, -21.62F, 0.5F);

		bodyModel[328].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Heat exchanger part
		bodyModel[328].setRotationPoint(28.77F, -21.62F, -1.5F);

		bodyModel[329].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Heat exchanger part
		bodyModel[329].setRotationPoint(28.77F, -21.62F, 0.5F);

		bodyModel[330].addShapeBox(0F, 0F, 0F, 5, 0, 3, 0F,0F, 0F, 0F, 0.075F, 0F, 0F, 0.075F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.075F, 0F, 0F, 0.075F, 0F, 0F, 0F, 0F, 0F); // Heat exchanger part
		bodyModel[330].setRotationPoint(23.7F, -21.63F, -1.5F);

		bodyModel[331].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, -0.7F, -0.75F, 0F, -0.7F, -0.75F, 0F, 0F, -0.75F, 0F); // Heat exchanger part
		bodyModel[331].setRotationPoint(26.13F, -21.89F, -1.5F);

		bodyModel[332].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Heat exchanger part
		bodyModel[332].setRotationPoint(-7.3F, -21.62F, -1.5F);

		bodyModel[333].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Heat exchanger part
		bodyModel[333].setRotationPoint(-7.3F, -21.62F, 0.5F);

		bodyModel[334].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Heat exchanger part
		bodyModel[334].setRotationPoint(-2.23F, -21.62F, -1.5F);

		bodyModel[335].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Heat exchanger part
		bodyModel[335].setRotationPoint(-2.23F, -21.62F, 0.5F);

		bodyModel[336].addShapeBox(0F, 0F, 0F, 5, 0, 3, 0F,0F, 0F, 0F, 0.075F, 0F, 0F, 0.075F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.075F, 0F, 0F, 0.075F, 0F, 0F, 0F, 0F, 0F); // Heat exchanger part
		bodyModel[336].setRotationPoint(-7.3F, -21.63F, -1.5F);

		bodyModel[337].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, -0.7F, -0.75F, 0F, -0.7F, -0.75F, 0F, 0F, -0.75F, 0F); // Heat exchanger part
		bodyModel[337].setRotationPoint(-4.87F, -21.89F, -1.5F);

		bodyModel[338].addShapeBox(0F, 0F, 0F, 0, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Sun visor part
		bodyModel[338].setRotationPoint(-35F, -19F, -1F);
		bodyModel[338].rotateAngleZ = -0.26179939F;

		bodyModel[339].addShapeBox(0F, 0F, 0F, 0, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Sun visor part
		bodyModel[339].setRotationPoint(-34.85F, -19F, -4F);
		bodyModel[339].rotateAngleY = 0.05061455F;
		bodyModel[339].rotateAngleZ = -0.26179939F;

		bodyModel[340].addShapeBox(0F, 0F, 0F, 0, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.075F, 0F, 0F, 0.075F); // Sun visor part
		bodyModel[340].setRotationPoint(-34.35F, -19F, -7F);
		bodyModel[340].rotateAngleY = 0.16406095F;
		bodyModel[340].rotateAngleZ = -0.26179939F;

		bodyModel[341].addShapeBox(0F, 0F, 0F, 0, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Sun visor part
		bodyModel[341].setRotationPoint(-35F, -19F, 1F);
		bodyModel[341].rotateAngleY = -0.05061455F;
		bodyModel[341].rotateAngleZ = -0.26179939F;

		bodyModel[342].addShapeBox(0F, 0F, 0F, 0, 2, 3, 0F,0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.075F, 0F, 0F, 0.075F, 0F, 0F, 0F, 0F, 0F, 0F); // Sun visor part
		bodyModel[342].setRotationPoint(-34.85F, -19F, 4.05F);
		bodyModel[342].rotateAngleY = -0.16406095F;
		bodyModel[342].rotateAngleZ = -0.26179939F;

		bodyModel[343].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,-0.35F, 0F, 0F, 0.35F, 0F, 0F, 0.7F, 0F, -0.5F, -0.7F, 0F, -0.5F, 0.17F, -0.07F, -0.1F, -0.17F, -0.07F, -0.1F, 0.2F, 0F, 0.5F, -0.2F, 0F, 0.5F); // Sun visor part
		bodyModel[343].setRotationPoint(-34.7F, -19F, 7F);

		bodyModel[344].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[344].setRotationPoint(11F, 2.25F, -8F);

		bodyModel[345].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 377
		bodyModel[345].setRotationPoint(11F, 2.25F, 7F);

		bodyModel[346].addShapeBox(0F, 0F, 0F, 0, 2, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[346].setRotationPoint(44.76F, 7.25F, -5F);

		bodyModel[347].addShapeBox(0F, 0F, 0F, 0, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[347].setRotationPoint(44.76F, 7.25F, -11F);

		bodyModel[348].addShapeBox(0F, 0F, 0F, 0, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 380
		bodyModel[348].setRotationPoint(44.76F, 7.25F, 5F);

		bodyModel[349].addShapeBox(0F, 0F, 0F, 2, 0, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Rear platform part
		bodyModel[349].setRotationPoint(44.76F, 8.25F, 3F);

		bodyModel[350].addShapeBox(0F, 0F, 0F, 2, 0, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Rear platform part
		bodyModel[350].setRotationPoint(44.76F, 8.25F, -8F);

		bodyModel[351].addShapeBox(0F, 0F, 0F, 0, 2, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[351].setRotationPoint(-44.76F, 7.25F, -5F);

		bodyModel[352].addShapeBox(0F, 0F, 0F, 0, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[352].setRotationPoint(-44.76F, 7.25F, -11F);

		bodyModel[353].addShapeBox(0F, 0F, 0F, 0, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 380
		bodyModel[353].setRotationPoint(-44.76F, 7.25F, 5F);

		bodyModel[354].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, -0.25F, 0F); // Front weight
		bodyModel[354].setRotationPoint(-45.5F, 0.75F, -2.5F);

		bodyModel[355].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, -0.25F, 0F); // Front weight
		bodyModel[355].setRotationPoint(44.75F, 0.75F, -2.5F);

		bodyModel[356].addShapeBox(0F, 0F, 0F, 4, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 0
		bodyModel[356].setRotationPoint(-30.5F, -19F, -7.5F);
		bodyModel[356].rotateAngleX = -0.78539816F;

		bodyModel[357].addShapeBox(0F, 0F, 0F, 2, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F); // Box 0
		bodyModel[357].setRotationPoint(-32.5F, -19F, -7.5F);
		bodyModel[357].rotateAngleX = -0.78539816F;

		bodyModel[358].addShapeBox(0F, 0F, 0F, 2, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -0.5F, 0F); // Box 0
		bodyModel[358].setRotationPoint(-26.5F, -19F, -7.5F);
		bodyModel[358].rotateAngleX = -0.78539816F;

		bodyModel[359].addShapeBox(0F, 0F, 0F, 4, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 391
		bodyModel[359].setRotationPoint(-30.5F, -19F, 7.5F);
		bodyModel[359].rotateAngleX = 0.78539816F;

		bodyModel[360].addShapeBox(0F, 0F, 0F, 2, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F); // Box 392
		bodyModel[360].setRotationPoint(-32.5F, -19F, 7.5F);
		bodyModel[360].rotateAngleX = 0.78539816F;

		bodyModel[361].addShapeBox(0F, 0F, 0F, 2, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -0.5F, 0F); // Box 393
		bodyModel[361].setRotationPoint(-26.5F, -19F, 7.5F);
		bodyModel[361].rotateAngleX = 0.78539816F;

		bodyModel[362].addShapeBox(0F, 0F, 0F, 0, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Sun visor part
		bodyModel[362].setRotationPoint(-32.35F, -20.62F, -5.5F);
		bodyModel[362].rotateAngleX = 0.06108652F;

		bodyModel[363].addShapeBox(0F, 0F, 0F, 0, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 385
		bodyModel[363].setRotationPoint(-32.35F, -20.81F, 2.5F);
		bodyModel[363].rotateAngleX = -0.06108652F;

		bodyModel[364].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,-0.7F, 0F, -0.5F, 0.7F, 0F, -0.5F, 0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.2F, 0F, 0.5F, 0.2F, 0F, 0.5F, -0.17F, -0.07F, -0.1F, 0.17F, -0.07F, -0.1F); // Box 386
		bodyModel[364].setRotationPoint(-34.7F, -19F, -8F);

		bodyModel[365].addShapeBox(0F, 0F, 0F, 1, 5, 2, 0F,-1F, 0F, -2F, 1F, 0F, -2F, 1F, 0F, 0F, -1F, 0F, 0F, 0.25F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0F, 0.25F, 0F, 0F); // Box 0
		bodyModel[365].setRotationPoint(-35.25F, -18F, -9F);

		bodyModel[366].addShapeBox(0F, 0F, 0F, 1, 5, 2, 0F,-1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -2F, -1F, 0F, -2F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F); // Box 388
		bodyModel[366].setRotationPoint(-35.25F, -18F, 7F);

		bodyModel[367].addShapeBox(0F, 0F, 0F, 1, 10, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[367].setRotationPoint(-23.5F, -12F, -11F);

		bodyModel[368].addShapeBox(0F, 0F, 0F, 1, 10, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 369
		bodyModel[368].setRotationPoint(-23.5F, -12F, 10F);

		bodyModel[369].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-1.25F, 0F, -2.5F, 0.25F, 0F, -2.5F, 0.75F, 0F, 2.5F, -1.25F, 0F, 2.5F, 0F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[369].setRotationPoint(-23.25F, -18F, -10.5F);

		bodyModel[370].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-1.25F, 0F, 2.5F, 0.75F, 0F, 2.5F, 0.25F, 0F, -2.5F, -1.25F, 0F, -2.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 371
		bodyModel[370].setRotationPoint(-23.25F, -18F, 9.5F);

		bodyModel[371].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0.5F, 0F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[371].setRotationPoint(-23.5F, -13F, -11F);

		bodyModel[372].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.75F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 373
		bodyModel[372].setRotationPoint(-23.5F, -13F, 10F);

		bodyModel[373].addShapeBox(0F, 0F, 0F, 3, 7, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 0
		bodyModel[373].setRotationPoint(-34.5F, -12.5F, -7F);

		bodyModel[374].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[374].setRotationPoint(-32.5F, -13.5F, -7F);

		bodyModel[375].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F); // Box 0
		bodyModel[375].setRotationPoint(-33.5F, -13.75F, -0.75F);
	}
	ModelKrauttTrucc theTrucks = new ModelKrauttTrucc();
	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		for (int i = 0; i < 376; i++) {
			if (bodyModel[i].boxName != null && bodyModel[i].boxName.contains("lamp")) {
				Minecraft.getMinecraft().entityRenderer.disableLightmap(1D);
				bodyModel[i].render(f5);
				Minecraft.getMinecraft().entityRenderer.enableLightmap(1D);
			} else if (bodyModel[i].boxName != null && bodyModel[i].boxName.contains("cull")) {
				GL11.glDisable(GL11.GL_CULL_FACE);
				bodyModel[i].render(f5);
				GL11.glEnable(GL11.GL_CULL_FACE);
			} else {
				bodyModel[i].render(f5);
			}
		}
		Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/KM_ML4000_TruckFront.png"));
		GL11.glPushMatrix();
		GL11.glTranslatef(-1.73F, 0.0F, 0F);
		theTrucks.render(entity, f, f1, f2, f3, f4, f5);
		GL11.glPopMatrix();

		Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/KM_ML4000_TruckRear.png"));
		GL11.glPushMatrix();
		GL11.glRotatef(180, 0, 1, 0);
		GL11.glTranslated(-1.73F, 0.0F, 0);
		theTrucks.render(entity, f, f1, f2, f3, f4, f5);
		GL11.glPopMatrix();
	}
	public float[] getTrans() { return new float[]{-1.6F, 0.155F, 0F}; }

	public float[] getRotate() {
		return new float[] { 0F, 180F, 180F };
	}

	public float[] getScale() {
		return null;
	}

	public ArrayList<double[]> getSmokePosition() {
		return new ArrayList<double[]>() {
			{
				add(new double[]{0.57D, 1.3D, 0.0D});
				add(new double[]{2.5D, 1.3D, 0.0D});
			}
		};
	}
}