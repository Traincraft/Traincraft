//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2021 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 14.04.2021 - 02:36:29
// Last changed on: 14.04.2021 - 02:36:29

package train.client.render.models; //Path where the model is located

import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import tmt.ModelConverter;
import tmt.ModelRendererTurbo;
import tmt.Tessellator;
import train.common.api.AbstractTrains;
import train.common.library.Info;

public class ModelPSSleeper565 extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelPSSleeper565() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[624];

		initbodyModel_1();
		initbodyModel_2();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 51, 107, textureX, textureY); // Box 2
		bodyModel[1] = new ModelRendererTurbo(this, 340, 104, textureX, textureY); // Box 2
		bodyModel[2] = new ModelRendererTurbo(this, 310, 116, textureX, textureY); // Box 2
		bodyModel[3] = new ModelRendererTurbo(this, 275, 148, textureX, textureY); // Box 2
		bodyModel[4] = new ModelRendererTurbo(this, 275, 151, textureX, textureY); // Box 2
		bodyModel[5] = new ModelRendererTurbo(this, 266, 148, textureX, textureY); // Box 2
		bodyModel[6] = new ModelRendererTurbo(this, 266, 151, textureX, textureY); // Box 2
		bodyModel[7] = new ModelRendererTurbo(this, 256, 148, textureX, textureY); // Box 2
		bodyModel[8] = new ModelRendererTurbo(this, 259, 151, textureX, textureY); // Box 2
		bodyModel[9] = new ModelRendererTurbo(this, 74, 151, textureX, textureY); // Box 2
		bodyModel[10] = new ModelRendererTurbo(this, 74, 148, textureX, textureY); // Box 2
		bodyModel[11] = new ModelRendererTurbo(this, 93, 148, textureX, textureY); // Box 2
		bodyModel[12] = new ModelRendererTurbo(this, 91, 151, textureX, textureY); // Box 2
		bodyModel[13] = new ModelRendererTurbo(this, 246, 148, textureX, textureY); // Box 2
		bodyModel[14] = new ModelRendererTurbo(this, 245, 151, textureX, textureY); // Box 2
		bodyModel[15] = new ModelRendererTurbo(this, 100, 148, textureX, textureY); // Box 2
		bodyModel[16] = new ModelRendererTurbo(this, 100, 151, textureX, textureY); // Box 2
		bodyModel[17] = new ModelRendererTurbo(this, 105, 148, textureX, textureY); // Box 2
		bodyModel[18] = new ModelRendererTurbo(this, 122, 151, textureX, textureY); // Box 2
		bodyModel[19] = new ModelRendererTurbo(this, 281, 138, textureX, textureY); // Box 24
		bodyModel[20] = new ModelRendererTurbo(this, 281, 141, textureX, textureY); // Box 25
		bodyModel[21] = new ModelRendererTurbo(this, 272, 138, textureX, textureY); // Box 26
		bodyModel[22] = new ModelRendererTurbo(this, 272, 141, textureX, textureY); // Box 27
		bodyModel[23] = new ModelRendererTurbo(this, 262, 138, textureX, textureY); // Box 28
		bodyModel[24] = new ModelRendererTurbo(this, 265, 141, textureX, textureY); // Box 29
		bodyModel[25] = new ModelRendererTurbo(this, 74, 141, textureX, textureY); // Box 30
		bodyModel[26] = new ModelRendererTurbo(this, 74, 138, textureX, textureY); // Box 31
		bodyModel[27] = new ModelRendererTurbo(this, 93, 138, textureX, textureY); // Box 32
		bodyModel[28] = new ModelRendererTurbo(this, 91, 141, textureX, textureY); // Box 33
		bodyModel[29] = new ModelRendererTurbo(this, 246, 138, textureX, textureY); // Box 34
		bodyModel[30] = new ModelRendererTurbo(this, 251, 141, textureX, textureY); // Box 35
		bodyModel[31] = new ModelRendererTurbo(this, 100, 138, textureX, textureY); // Box 36
		bodyModel[32] = new ModelRendererTurbo(this, 100, 141, textureX, textureY); // Box 37
		bodyModel[33] = new ModelRendererTurbo(this, 105, 138, textureX, textureY); // Box 38
		bodyModel[34] = new ModelRendererTurbo(this, 122, 141, textureX, textureY); // Box 39
		bodyModel[35] = new ModelRendererTurbo(this, 261, 148, textureX, textureY); // Box 2
		bodyModel[36] = new ModelRendererTurbo(this, 267, 138, textureX, textureY); // Box 41
		bodyModel[37] = new ModelRendererTurbo(this, 347, 117, textureX, textureY); // Box 2
		bodyModel[38] = new ModelRendererTurbo(this, 299, 132, textureX, textureY); // Box 2
		bodyModel[39] = new ModelRendererTurbo(this, 58, 123, textureX, textureY); // Box 2
		bodyModel[40] = new ModelRendererTurbo(this, 30, 122, textureX, textureY); // Box 2
		bodyModel[41] = new ModelRendererTurbo(this, 74, 132, textureX, textureY); // Box 2
		bodyModel[42] = new ModelRendererTurbo(this, 311, 121, textureX, textureY); // Box 2
		bodyModel[43] = new ModelRendererTurbo(this, 64, 119, textureX, textureY); // Box 2
		bodyModel[44] = new ModelRendererTurbo(this, 202, 173, textureX, textureY); // Box 2
		bodyModel[45] = new ModelRendererTurbo(this, 239, 173, textureX, textureY); // Box 2
		bodyModel[46] = new ModelRendererTurbo(this, 151, 163, textureX, textureY); // Box 52
		bodyModel[47] = new ModelRendererTurbo(this, 266, 174, textureX, textureY); // Box 2
		bodyModel[48] = new ModelRendererTurbo(this, 107, 151, textureX, textureY); // Box 2
		bodyModel[49] = new ModelRendererTurbo(this, 107, 141, textureX, textureY); // Box 55
		bodyModel[50] = new ModelRendererTurbo(this, 141, 174, textureX, textureY); // Box 2
		bodyModel[51] = new ModelRendererTurbo(this, 96, 157, textureX, textureY); // Box 2
		bodyModel[52] = new ModelRendererTurbo(this, 96, 172, textureX, textureY); // Box 2
		bodyModel[53] = new ModelRendererTurbo(this, 74, 158, textureX, textureY); // Box 59
		bodyModel[54] = new ModelRendererTurbo(this, 156, 177, textureX, textureY); // Box 41
		bodyModel[55] = new ModelRendererTurbo(this, 156, 175, textureX, textureY); // Box 41
		bodyModel[56] = new ModelRendererTurbo(this, 176, 175, textureX, textureY); // Box 41
		bodyModel[57] = new ModelRendererTurbo(this, 179, 177, textureX, textureY); // Box 41
		bodyModel[58] = new ModelRendererTurbo(this, 179, 175, textureX, textureY); // Box 41
		bodyModel[59] = new ModelRendererTurbo(this, 199, 175, textureX, textureY); // Box 41
		bodyModel[60] = new ModelRendererTurbo(this, 89, 157, textureX, textureY); // Box 41
		bodyModel[61] = new ModelRendererTurbo(this, 91, 158, textureX, textureY); // Box 41
		bodyModel[62] = new ModelRendererTurbo(this, 101, 158, textureX, textureY); // Box 41
		bodyModel[63] = new ModelRendererTurbo(this, 219, 162, textureX, textureY); // Box 41
		bodyModel[64] = new ModelRendererTurbo(this, 219, 160, textureX, textureY); // Box 41
		bodyModel[65] = new ModelRendererTurbo(this, 239, 160, textureX, textureY); // Box 41
		bodyModel[66] = new ModelRendererTurbo(this, 200, 162, textureX, textureY); // Box 41
		bodyModel[67] = new ModelRendererTurbo(this, 200, 160, textureX, textureY); // Box 41
		bodyModel[68] = new ModelRendererTurbo(this, 216, 160, textureX, textureY); // Box 41
		bodyModel[69] = new ModelRendererTurbo(this, 226, 141, textureX, textureY); // Box 39
		bodyModel[70] = new ModelRendererTurbo(this, 205, 141, textureX, textureY); // Box 39
		bodyModel[71] = new ModelRendererTurbo(this, 165, 159, textureX, textureY); // Box 38
		bodyModel[72] = new ModelRendererTurbo(this, 179, 158, textureX, textureY); // Box 38
		bodyModel[73] = new ModelRendererTurbo(this, 174, 158, textureX, textureY); // Box 38
		bodyModel[74] = new ModelRendererTurbo(this, 165, 155, textureX, textureY); // Box 38
		bodyModel[75] = new ModelRendererTurbo(this, 183, 161, textureX, textureY); // Box 41
		bodyModel[76] = new ModelRendererTurbo(this, 188, 169, textureX, textureY); // Box 41
		bodyModel[77] = new ModelRendererTurbo(this, 192, 160, textureX, textureY); // Box 41
		bodyModel[78] = new ModelRendererTurbo(this, 184, 160, textureX, textureY); // Box 41
		bodyModel[79] = new ModelRendererTurbo(this, 197, 168, textureX, textureY); // Box 41
		bodyModel[80] = new ModelRendererTurbo(this, 189, 168, textureX, textureY); // Box 41
		bodyModel[81] = new ModelRendererTurbo(this, 150, 156, textureX, textureY); // Box 41
		bodyModel[82] = new ModelRendererTurbo(this, 150, 154, textureX, textureY); // Box 41
		bodyModel[83] = new ModelRendererTurbo(this, 162, 154, textureX, textureY); // Box 41
		bodyModel[84] = new ModelRendererTurbo(this, 141, 162, textureX, textureY); // Box 41
		bodyModel[85] = new ModelRendererTurbo(this, 247, 156, textureX, textureY); // Box 26
		bodyModel[86] = new ModelRendererTurbo(this, 248, 159, textureX, textureY); // Box 26
		bodyModel[87] = new ModelRendererTurbo(this, 254, 156, textureX, textureY); // Box 26
		bodyModel[88] = new ModelRendererTurbo(this, 255, 159, textureX, textureY); // Box 26
		bodyModel[89] = new ModelRendererTurbo(this, 256, 154, textureX, textureY); // Box 24
		bodyModel[90] = new ModelRendererTurbo(this, 249, 154, textureX, textureY); // Box 24
		bodyModel[91] = new ModelRendererTurbo(this, 331, 62, textureX, textureY); // Left step part
		bodyModel[92] = new ModelRendererTurbo(this, 329, 65, textureX, textureY); // Left step part
		bodyModel[93] = new ModelRendererTurbo(this, 331, 68, textureX, textureY); // Left step part
		bodyModel[94] = new ModelRendererTurbo(this, 329, 71, textureX, textureY); // Left step part
		bodyModel[95] = new ModelRendererTurbo(this, 331, 77, textureX, textureY); // Left step part
		bodyModel[96] = new ModelRendererTurbo(this, 322, 79, textureX, textureY); // Left step part
		bodyModel[97] = new ModelRendererTurbo(this, 322, 77, textureX, textureY); // Left step part
		bodyModel[98] = new ModelRendererTurbo(this, 323, 74, textureX, textureY); // Left step part
		bodyModel[99] = new ModelRendererTurbo(this, 340, 79, textureX, textureY); // Left step part
		bodyModel[100] = new ModelRendererTurbo(this, 340, 77, textureX, textureY); // Left step part
		bodyModel[101] = new ModelRendererTurbo(this, 341, 74, textureX, textureY); // Left step part
		bodyModel[102] = new ModelRendererTurbo(this, 331, 74, textureX, textureY); // Left step part
		bodyModel[103] = new ModelRendererTurbo(this, 327, 81, textureX, textureY); // Left step part
		bodyModel[104] = new ModelRendererTurbo(this, 247, 165, textureX, textureY); // Box 140
		bodyModel[105] = new ModelRendererTurbo(this, 248, 168, textureX, textureY); // Box 141
		bodyModel[106] = new ModelRendererTurbo(this, 254, 165, textureX, textureY); // Box 142
		bodyModel[107] = new ModelRendererTurbo(this, 255, 168, textureX, textureY); // Box 143
		bodyModel[108] = new ModelRendererTurbo(this, 256, 163, textureX, textureY); // Box 144
		bodyModel[109] = new ModelRendererTurbo(this, 249, 163, textureX, textureY); // Box 145
		bodyModel[110] = new ModelRendererTurbo(this, 331, 87, textureX, textureY); // Right step part
		bodyModel[111] = new ModelRendererTurbo(this, 329, 90, textureX, textureY); // Right step part
		bodyModel[112] = new ModelRendererTurbo(this, 331, 93, textureX, textureY); // Right step part
		bodyModel[113] = new ModelRendererTurbo(this, 329, 96, textureX, textureY); // Right step part
		bodyModel[114] = new ModelRendererTurbo(this, 331, 102, textureX, textureY); // Right step part
		bodyModel[115] = new ModelRendererTurbo(this, 322, 100, textureX, textureY); // Right step part
		bodyModel[116] = new ModelRendererTurbo(this, 322, 98, textureX, textureY); // Right step part
		bodyModel[117] = new ModelRendererTurbo(this, 323, 95, textureX, textureY); // Right step part
		bodyModel[118] = new ModelRendererTurbo(this, 340, 100, textureX, textureY); // Right step part
		bodyModel[119] = new ModelRendererTurbo(this, 340, 98, textureX, textureY); // Right step part
		bodyModel[120] = new ModelRendererTurbo(this, 341, 95, textureX, textureY); // Right step part
		bodyModel[121] = new ModelRendererTurbo(this, 331, 99, textureX, textureY); // Right step part
		bodyModel[122] = new ModelRendererTurbo(this, 327, 106, textureX, textureY); // Right step part
		bodyModel[123] = new ModelRendererTurbo(this, 314, 108, textureX, textureY); // Left trapdoor
		bodyModel[124] = new ModelRendererTurbo(this, 329, 118, textureX, textureY); // Right trapdoor
		bodyModel[125] = new ModelRendererTurbo(this, 311, 69, textureX, textureY); // Left side door
		bodyModel[126] = new ModelRendererTurbo(this, 72, 68, textureX, textureY); // Box 38
		bodyModel[127] = new ModelRendererTurbo(this, 72, 87, textureX, textureY); // Box 128
		bodyModel[128] = new ModelRendererTurbo(this, 327, 20, textureX, textureY); // Box 128
		bodyModel[129] = new ModelRendererTurbo(this, 361, 20, textureX, textureY); // Box 128
		bodyModel[130] = new ModelRendererTurbo(this, 380, 19, textureX, textureY); // Box 128
		bodyModel[131] = new ModelRendererTurbo(this, 415, 20, textureX, textureY); // Box 128
		bodyModel[132] = new ModelRendererTurbo(this, 311, 90, textureX, textureY); // Right side door
		bodyModel[133] = new ModelRendererTurbo(this, 55, 19, textureX, textureY); // Box 128
		bodyModel[134] = new ModelRendererTurbo(this, 1, 12, textureX, textureY); // Box 128
		bodyModel[135] = new ModelRendererTurbo(this, 337, 19, textureX, textureY); // Box 128
		bodyModel[136] = new ModelRendererTurbo(this, 391, 19, textureX, textureY); // Box 128
		bodyModel[137] = new ModelRendererTurbo(this, 27, 18, textureX, textureY); // Box 128
		bodyModel[138] = new ModelRendererTurbo(this, 311, 66, textureX, textureY); // Box 128
		bodyModel[139] = new ModelRendererTurbo(this, 311, 87, textureX, textureY); // Box 128
		bodyModel[140] = new ModelRendererTurbo(this, 346, 21, textureX, textureY); // Vestibule door
		bodyModel[141] = new ModelRendererTurbo(this, 18, 20, textureX, textureY); // Front end door
		bodyModel[142] = new ModelRendererTurbo(this, 431, 18, textureX, textureY); // Box 128
		bodyModel[143] = new ModelRendererTurbo(this, 437, 35, textureX, textureY); // Box 128
		bodyModel[144] = new ModelRendererTurbo(this, 413, 2, textureX, textureY); // Box 128
		bodyModel[145] = new ModelRendererTurbo(this, 432, 2, textureX, textureY); // Box 128
		bodyModel[146] = new ModelRendererTurbo(this, 418, 1, textureX, textureY); // Box 128
		bodyModel[147] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 128
		bodyModel[148] = new ModelRendererTurbo(this, 446, 23, textureX, textureY); // Box 128
		bodyModel[149] = new ModelRendererTurbo(this, 424, 35, textureX, textureY); // Box 128
		bodyModel[150] = new ModelRendererTurbo(this, 426, 19, textureX, textureY); // Box 128
		bodyModel[151] = new ModelRendererTurbo(this, 442, 19, textureX, textureY); // Box 153
		bodyModel[152] = new ModelRendererTurbo(this, 22, 43, textureX, textureY); // Box 128
		bodyModel[153] = new ModelRendererTurbo(this, 44, 35, textureX, textureY); // Box 128
		bodyModel[154] = new ModelRendererTurbo(this, 63, 1, textureX, textureY); // Box 128
		bodyModel[155] = new ModelRendererTurbo(this, 44, 2, textureX, textureY); // Box 128
		bodyModel[156] = new ModelRendererTurbo(this, 56, 1, textureX, textureY); // Box 128
		bodyModel[157] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 128
		bodyModel[158] = new ModelRendererTurbo(this, 31, 43, textureX, textureY); // Box 128
		bodyModel[159] = new ModelRendererTurbo(this, 4, 39, textureX, textureY); // Box 128
		bodyModel[160] = new ModelRendererTurbo(this, 17, 42, textureX, textureY); // Box 128
		bodyModel[161] = new ModelRendererTurbo(this, 1, 42, textureX, textureY); // Box 153
		bodyModel[162] = new ModelRendererTurbo(this, 72, 41, textureX, textureY); // Box 128
		bodyModel[163] = new ModelRendererTurbo(this, 72, 49, textureX, textureY); // Box 128
		bodyModel[164] = new ModelRendererTurbo(this, 72, 55, textureX, textureY); // Box 128
		bodyModel[165] = new ModelRendererTurbo(this, 72, 35, textureX, textureY); // Box 168
		bodyModel[166] = new ModelRendererTurbo(this, 72, 30, textureX, textureY); // Box 169
		bodyModel[167] = new ModelRendererTurbo(this, 13, 1, textureX, textureY); // Box 128
		bodyModel[168] = new ModelRendererTurbo(this, 30, 8, textureX, textureY); // Box 128
		bodyModel[169] = new ModelRendererTurbo(this, 1, 392, textureX, textureY); // Box 128
		bodyModel[170] = new ModelRendererTurbo(this, 18, 8, textureX, textureY); // Box 176
		bodyModel[171] = new ModelRendererTurbo(this, 1, 386, textureX, textureY); // Box 177
		bodyModel[172] = new ModelRendererTurbo(this, 72, 60, textureX, textureY); // Box 128
		bodyModel[173] = new ModelRendererTurbo(this, 72, 26, textureX, textureY); // Box 170
		bodyModel[174] = new ModelRendererTurbo(this, 399, 29, textureX, textureY); // Rear gate closed
		bodyModel[175] = new ModelRendererTurbo(this, 412, 34, textureX, textureY); // Rear gate open
		bodyModel[176] = new ModelRendererTurbo(this, 442, 1, textureX, textureY); // Box 128
		bodyModel[177] = new ModelRendererTurbo(this, 394, 9, textureX, textureY); // Box 128
		bodyModel[178] = new ModelRendererTurbo(this, 362, 9, textureX, textureY); // Box 176
		bodyModel[179] = new ModelRendererTurbo(this, 320, 17, textureX, textureY); // Box 128
		bodyModel[180] = new ModelRendererTurbo(this, 319, 22, textureX, textureY); // Box 128
		bodyModel[181] = new ModelRendererTurbo(this, 323, 59, textureX, textureY); // Box 190
		bodyModel[182] = new ModelRendererTurbo(this, 325, 55, textureX, textureY); // Box 191
		bodyModel[183] = new ModelRendererTurbo(this, 349, 77, textureX, textureY); // Box 128
		bodyModel[184] = new ModelRendererTurbo(this, 352, 77, textureX, textureY); // Box 128
		bodyModel[185] = new ModelRendererTurbo(this, 62, 84, textureX, textureY); // Box 128
		bodyModel[186] = new ModelRendererTurbo(this, 74, 145, textureX, textureY); // Box 128
		bodyModel[187] = new ModelRendererTurbo(this, 349, 98, textureX, textureY); // Box 202
		bodyModel[188] = new ModelRendererTurbo(this, 352, 98, textureX, textureY); // Box 203
		bodyModel[189] = new ModelRendererTurbo(this, 62, 103, textureX, textureY); // Box 204
		bodyModel[190] = new ModelRendererTurbo(this, 74, 155, textureX, textureY); // Box 205
		bodyModel[191] = new ModelRendererTurbo(this, 394, 295, textureX, textureY); // Box 38
		bodyModel[192] = new ModelRendererTurbo(this, 336, 227, textureX, textureY); // Box 38
		bodyModel[193] = new ModelRendererTurbo(this, 507, 295, textureX, textureY); // Box 38
		bodyModel[194] = new ModelRendererTurbo(this, 202, 227, textureX, textureY); // Box 38
		bodyModel[195] = new ModelRendererTurbo(this, 66, 234, textureX, textureY); // Box 38
		bodyModel[196] = new ModelRendererTurbo(this, 129, 222, textureX, textureY); // Box 38
		bodyModel[197] = new ModelRendererTurbo(this, 275, 223, textureX, textureY); // Box 38
		bodyModel[198] = new ModelRendererTurbo(this, 324, 294, textureX, textureY); // Box 38
		bodyModel[199] = new ModelRendererTurbo(this, 136, 294, textureX, textureY); // Box 38
		bodyModel[200] = new ModelRendererTurbo(this, 319, 226, textureX, textureY); // Box 38
		bodyModel[201] = new ModelRendererTurbo(this, 381, 291, textureX, textureY); // Box 38
		bodyModel[202] = new ModelRendererTurbo(this, 189, 294, textureX, textureY); // Box 38
		bodyModel[203] = new ModelRendererTurbo(this, 255, 280, textureX, textureY); // Box 38
		bodyModel[204] = new ModelRendererTurbo(this, 67, 280, textureX, textureY); // Box 38
		bodyModel[205] = new ModelRendererTurbo(this, 377, 212, textureX, textureY); // Box 38
		bodyModel[206] = new ModelRendererTurbo(this, 257, 226, textureX, textureY); // Box 38
		bodyModel[207] = new ModelRendererTurbo(this, 166, 198, textureX, textureY); // Box 225
		bodyModel[208] = new ModelRendererTurbo(this, 1, 191, textureX, textureY); // Box 225
		bodyModel[209] = new ModelRendererTurbo(this, 151, 193, textureX, textureY); // Box 38
		bodyModel[210] = new ModelRendererTurbo(this, 389, 274, textureX, textureY); // Box 38
		bodyModel[211] = new ModelRendererTurbo(this, 231, 360, textureX, textureY); // Box 38
		bodyModel[212] = new ModelRendererTurbo(this, 328, 355, textureX, textureY); // Box 38
		bodyModel[213] = new ModelRendererTurbo(this, 288, 358, textureX, textureY); // Box 38
		bodyModel[214] = new ModelRendererTurbo(this, 299, 360, textureX, textureY); // Box 38
		bodyModel[215] = new ModelRendererTurbo(this, 216, 355, textureX, textureY); // Box 38
		bodyModel[216] = new ModelRendererTurbo(this, 356, 292, textureX, textureY); // Box 38
		bodyModel[217] = new ModelRendererTurbo(this, 173, 331, textureX, textureY); // Box 225
		bodyModel[218] = new ModelRendererTurbo(this, 153, 326, textureX, textureY); // Box 38
		bodyModel[219] = new ModelRendererTurbo(this, 168, 331, textureX, textureY); // Box 225
		bodyModel[220] = new ModelRendererTurbo(this, 264, 225, textureX, textureY); // Box 38
		bodyModel[221] = new ModelRendererTurbo(this, 250, 326, textureX, textureY); // Box 38
		bodyModel[222] = new ModelRendererTurbo(this, 241, 331, textureX, textureY); // Box 38
		bodyModel[223] = new ModelRendererTurbo(this, 212, 336, textureX, textureY); // Box 38
		bodyModel[224] = new ModelRendererTurbo(this, 299, 227, textureX, textureY); // Box 38
		bodyModel[225] = new ModelRendererTurbo(this, 314, 231, textureX, textureY); // Box 38
		bodyModel[226] = new ModelRendererTurbo(this, 367, 295, textureX, textureY); // Box 38
		bodyModel[227] = new ModelRendererTurbo(this, 341, 299, textureX, textureY); // Box 38
		bodyModel[228] = new ModelRendererTurbo(this, 486, 223, textureX, textureY); // Box 38
		bodyModel[229] = new ModelRendererTurbo(this, 176, 291, textureX, textureY); // Box 38
		bodyModel[230] = new ModelRendererTurbo(this, 206, 299, textureX, textureY); // Box 38
		bodyModel[231] = new ModelRendererTurbo(this, 214, 295, textureX, textureY); // Box 38
		bodyModel[232] = new ModelRendererTurbo(this, 171, 295, textureX, textureY); // Box 38
		bodyModel[233] = new ModelRendererTurbo(this, 153, 299, textureX, textureY); // Box 38
		bodyModel[234] = new ModelRendererTurbo(this, 203, 293, textureX, textureY); // Box 38
		bodyModel[235] = new ModelRendererTurbo(this, 159, 292, textureX, textureY); // Box 38
		bodyModel[236] = new ModelRendererTurbo(this, 191, 285, textureX, textureY); // Box 38
		bodyModel[237] = new ModelRendererTurbo(this, 138, 285, textureX, textureY); // Box 38
		bodyModel[238] = new ModelRendererTurbo(this, 446, 226, textureX, textureY); // Box 38
		bodyModel[239] = new ModelRendererTurbo(this, 1, 294, textureX, textureY); // Box 38
		bodyModel[240] = new ModelRendererTurbo(this, 18, 299, textureX, textureY); // Box 38
		bodyModel[241] = new ModelRendererTurbo(this, 26, 295, textureX, textureY); // Box 38
		bodyModel[242] = new ModelRendererTurbo(this, 481, 227, textureX, textureY); // Box 38
		bodyModel[243] = new ModelRendererTurbo(this, 463, 231, textureX, textureY); // Box 38
		bodyModel[244] = new ModelRendererTurbo(this, 15, 293, textureX, textureY); // Box 38
		bodyModel[245] = new ModelRendererTurbo(this, 469, 224, textureX, textureY); // Box 38
		bodyModel[246] = new ModelRendererTurbo(this, 3, 285, textureX, textureY); // Box 38
		bodyModel[247] = new ModelRendererTurbo(this, 448, 217, textureX, textureY); // Box 38
		bodyModel[248] = new ModelRendererTurbo(this, 304, 224, textureX, textureY); // Box 38
		bodyModel[249] = new ModelRendererTurbo(this, 321, 217, textureX, textureY); // Box 38
		bodyModel[250] = new ModelRendererTurbo(this, 326, 285, textureX, textureY); // Box 38
		bodyModel[251] = new ModelRendererTurbo(this, 345, 292, textureX, textureY); // Box 38
		bodyModel[252] = new ModelRendererTurbo(this, 158, 298, textureX, textureY); // Box 38
		bodyModel[253] = new ModelRendererTurbo(this, 160, 303, textureX, textureY); // Box 38
		bodyModel[254] = new ModelRendererTurbo(this, 468, 230, textureX, textureY); // Box 38
		bodyModel[255] = new ModelRendererTurbo(this, 470, 235, textureX, textureY); // Box 38
		bodyModel[256] = new ModelRendererTurbo(this, 305, 230, textureX, textureY); // Box 38
		bodyModel[257] = new ModelRendererTurbo(this, 305, 235, textureX, textureY); // Box 38
		bodyModel[258] = new ModelRendererTurbo(this, 346, 298, textureX, textureY); // Box 38
		bodyModel[259] = new ModelRendererTurbo(this, 346, 303, textureX, textureY); // Box 38
		bodyModel[260] = new ModelRendererTurbo(this, 66, 264, textureX, textureY); // upper bed
		bodyModel[261] = new ModelRendererTurbo(this, 4, 268, textureX, textureY); // lower rotating bed
		bodyModel[262] = new ModelRendererTurbo(this, 50, 309, textureX, textureY); // Box 38
		bodyModel[263] = new ModelRendererTurbo(this, 66, 248, textureX, textureY); // upper bed
		bodyModel[264] = new ModelRendererTurbo(this, 28, 260, textureX, textureY); // lower rotating bed
		bodyModel[265] = new ModelRendererTurbo(this, 70, 271, textureX, textureY); // upper bed cable front
		bodyModel[266] = new ModelRendererTurbo(this, 67, 271, textureX, textureY); // upper bed cable rear
		bodyModel[267] = new ModelRendererTurbo(this, 70, 265, textureX, textureY); // upper bed cable front
		bodyModel[268] = new ModelRendererTurbo(this, 67, 265, textureX, textureY); // upper bed cable rear
		bodyModel[269] = new ModelRendererTurbo(this, 459, 206, textureX, textureY); // upper bed
		bodyModel[270] = new ModelRendererTurbo(this, 434, 200, textureX, textureY); // lower rotating bed
		bodyModel[271] = new ModelRendererTurbo(this, 410, 241, textureX, textureY); // Box 38
		bodyModel[272] = new ModelRendererTurbo(this, 459, 190, textureX, textureY); // upper bed
		bodyModel[273] = new ModelRendererTurbo(this, 410, 192, textureX, textureY); // lower rotating bed
		bodyModel[274] = new ModelRendererTurbo(this, 492, 213, textureX, textureY); // upper bed cable front
		bodyModel[275] = new ModelRendererTurbo(this, 489, 213, textureX, textureY); // upper bed cable rear
		bodyModel[276] = new ModelRendererTurbo(this, 492, 207, textureX, textureY); // upper bed cable front
		bodyModel[277] = new ModelRendererTurbo(this, 489, 207, textureX, textureY); // upper bed cable rear
		bodyModel[278] = new ModelRendererTurbo(this, 43, 277, textureX, textureY); // Box 38
		bodyModel[279] = new ModelRendererTurbo(this, 46, 290, textureX, textureY); // Box 38
		bodyModel[280] = new ModelRendererTurbo(this, 49, 277, textureX, textureY); // Box 38
		bodyModel[281] = new ModelRendererTurbo(this, 431, 209, textureX, textureY); // Box 38
		bodyModel[282] = new ModelRendererTurbo(this, 428, 222, textureX, textureY); // Box 38
		bodyModel[283] = new ModelRendererTurbo(this, 415, 209, textureX, textureY); // Box 38
		bodyModel[284] = new ModelRendererTurbo(this, 47, 303, textureX, textureY); // seat sliding part
		bodyModel[285] = new ModelRendererTurbo(this, 49, 282, textureX, textureY); // seat backrest
		bodyModel[286] = new ModelRendererTurbo(this, 35, 299, textureX, textureY); // seat sliding part cull
		bodyModel[287] = new ModelRendererTurbo(this, 35, 294, textureX, textureY); // seat sliding part cull
		bodyModel[288] = new ModelRendererTurbo(this, 34, 304, textureX, textureY); // Box 128
		bodyModel[289] = new ModelRendererTurbo(this, 34, 309, textureX, textureY); // Box 128
		bodyModel[290] = new ModelRendererTurbo(this, 27, 309, textureX, textureY); // Box 128
		bodyModel[291] = new ModelRendererTurbo(this, 43, 309, textureX, textureY); // Box 128
		bodyModel[292] = new ModelRendererTurbo(this, 50, 297, textureX, textureY); // seat sliding part
		bodyModel[293] = new ModelRendererTurbo(this, 50, 288, textureX, textureY); // seat backrest
		bodyModel[294] = new ModelRendererTurbo(this, 413, 235, textureX, textureY); // seat sliding part
		bodyModel[295] = new ModelRendererTurbo(this, 415, 214, textureX, textureY); // seat backrest
		bodyModel[296] = new ModelRendererTurbo(this, 431, 231, textureX, textureY); // seat sliding part cull
		bodyModel[297] = new ModelRendererTurbo(this, 431, 226, textureX, textureY); // seat sliding part cull
		bodyModel[298] = new ModelRendererTurbo(this, 430, 236, textureX, textureY); // Box 128
		bodyModel[299] = new ModelRendererTurbo(this, 430, 241, textureX, textureY); // Box 128
		bodyModel[300] = new ModelRendererTurbo(this, 423, 241, textureX, textureY); // Box 128
		bodyModel[301] = new ModelRendererTurbo(this, 439, 241, textureX, textureY); // Box 128
		bodyModel[302] = new ModelRendererTurbo(this, 416, 229, textureX, textureY); // seat sliding part
		bodyModel[303] = new ModelRendererTurbo(this, 416, 220, textureX, textureY); // seat backrest
		bodyModel[304] = new ModelRendererTurbo(this, 172, 252, textureX, textureY); // upper bed
		bodyModel[305] = new ModelRendererTurbo(this, 192, 268, textureX, textureY); // lower rotating bed
		bodyModel[306] = new ModelRendererTurbo(this, 238, 309, textureX, textureY); // Box 38
		bodyModel[307] = new ModelRendererTurbo(this, 195, 250, textureX, textureY); // upper bed
		bodyModel[308] = new ModelRendererTurbo(this, 216, 260, textureX, textureY); // lower rotating bed
		bodyModel[309] = new ModelRendererTurbo(this, 199, 257, textureX, textureY); // upper bed cable front
		bodyModel[310] = new ModelRendererTurbo(this, 196, 257, textureX, textureY); // upper bed cable rear
		bodyModel[311] = new ModelRendererTurbo(this, 199, 251, textureX, textureY); // upper bed cable front
		bodyModel[312] = new ModelRendererTurbo(this, 196, 251, textureX, textureY); // upper bed cable rear
		bodyModel[313] = new ModelRendererTurbo(this, 231, 277, textureX, textureY); // Box 38
		bodyModel[314] = new ModelRendererTurbo(this, 234, 290, textureX, textureY); // Box 38
		bodyModel[315] = new ModelRendererTurbo(this, 237, 277, textureX, textureY); // Box 38
		bodyModel[316] = new ModelRendererTurbo(this, 235, 303, textureX, textureY); // seat sliding part
		bodyModel[317] = new ModelRendererTurbo(this, 237, 282, textureX, textureY); // seat backrest
		bodyModel[318] = new ModelRendererTurbo(this, 223, 299, textureX, textureY); // seat sliding part cull
		bodyModel[319] = new ModelRendererTurbo(this, 223, 294, textureX, textureY); // seat sliding part cull
		bodyModel[320] = new ModelRendererTurbo(this, 222, 304, textureX, textureY); // Box 128
		bodyModel[321] = new ModelRendererTurbo(this, 222, 309, textureX, textureY); // Box 128
		bodyModel[322] = new ModelRendererTurbo(this, 215, 309, textureX, textureY); // Box 128
		bodyModel[323] = new ModelRendererTurbo(this, 231, 309, textureX, textureY); // Box 128
		bodyModel[324] = new ModelRendererTurbo(this, 238, 297, textureX, textureY); // seat sliding part
		bodyModel[325] = new ModelRendererTurbo(this, 238, 288, textureX, textureY); // seat backrest
		bodyModel[326] = new ModelRendererTurbo(this, 289, 206, textureX, textureY); // upper bed
		bodyModel[327] = new ModelRendererTurbo(this, 314, 200, textureX, textureY); // lower rotating bed
		bodyModel[328] = new ModelRendererTurbo(this, 360, 241, textureX, textureY); // Box 38
		bodyModel[329] = new ModelRendererTurbo(this, 289, 190, textureX, textureY); // upper bed
		bodyModel[330] = new ModelRendererTurbo(this, 338, 192, textureX, textureY); // lower rotating bed
		bodyModel[331] = new ModelRendererTurbo(this, 293, 213, textureX, textureY); // upper bed cable front
		bodyModel[332] = new ModelRendererTurbo(this, 290, 213, textureX, textureY); // upper bed cable rear
		bodyModel[333] = new ModelRendererTurbo(this, 293, 207, textureX, textureY); // upper bed cable front
		bodyModel[334] = new ModelRendererTurbo(this, 290, 207, textureX, textureY); // upper bed cable rear
		bodyModel[335] = new ModelRendererTurbo(this, 353, 209, textureX, textureY); // Box 38
		bodyModel[336] = new ModelRendererTurbo(this, 356, 222, textureX, textureY); // Box 38
		bodyModel[337] = new ModelRendererTurbo(this, 359, 209, textureX, textureY); // Box 38
		bodyModel[338] = new ModelRendererTurbo(this, 357, 235, textureX, textureY); // seat sliding part
		bodyModel[339] = new ModelRendererTurbo(this, 359, 214, textureX, textureY); // seat backrest
		bodyModel[340] = new ModelRendererTurbo(this, 345, 231, textureX, textureY); // seat sliding part cull
		bodyModel[341] = new ModelRendererTurbo(this, 345, 226, textureX, textureY); // seat sliding part cull
		bodyModel[342] = new ModelRendererTurbo(this, 344, 236, textureX, textureY); // Box 128
		bodyModel[343] = new ModelRendererTurbo(this, 344, 241, textureX, textureY); // Box 128
		bodyModel[344] = new ModelRendererTurbo(this, 337, 241, textureX, textureY); // Box 128
		bodyModel[345] = new ModelRendererTurbo(this, 353, 241, textureX, textureY); // Box 128
		bodyModel[346] = new ModelRendererTurbo(this, 360, 229, textureX, textureY); // seat sliding part
		bodyModel[347] = new ModelRendererTurbo(this, 360, 220, textureX, textureY); // seat backrest
		bodyModel[348] = new ModelRendererTurbo(this, 149, 274, textureX, textureY); // upper bed
		bodyModel[349] = new ModelRendererTurbo(this, 100, 260, textureX, textureY); // lower rotating bed
		bodyModel[350] = new ModelRendererTurbo(this, 149, 258, textureX, textureY); // upper bed
		bodyModel[351] = new ModelRendererTurbo(this, 124, 268, textureX, textureY); // lower rotating bed
		bodyModel[352] = new ModelRendererTurbo(this, 182, 281, textureX, textureY); // upper bed cable front
		bodyModel[353] = new ModelRendererTurbo(this, 179, 281, textureX, textureY); // upper bed cable rear
		bodyModel[354] = new ModelRendererTurbo(this, 182, 275, textureX, textureY); // upper bed cable front
		bodyModel[355] = new ModelRendererTurbo(this, 179, 275, textureX, textureY); // upper bed cable rear
		bodyModel[356] = new ModelRendererTurbo(this, 121, 277, textureX, textureY); // Box 38
		bodyModel[357] = new ModelRendererTurbo(this, 118, 290, textureX, textureY); // Box 38
		bodyModel[358] = new ModelRendererTurbo(this, 105, 277, textureX, textureY); // Box 38
		bodyModel[359] = new ModelRendererTurbo(this, 103, 303, textureX, textureY); // seat sliding part
		bodyModel[360] = new ModelRendererTurbo(this, 105, 282, textureX, textureY); // seat backrest
		bodyModel[361] = new ModelRendererTurbo(this, 121, 299, textureX, textureY); // seat sliding part cull
		bodyModel[362] = new ModelRendererTurbo(this, 121, 294, textureX, textureY); // seat sliding part cull
		bodyModel[363] = new ModelRendererTurbo(this, 120, 304, textureX, textureY); // Box 128
		bodyModel[364] = new ModelRendererTurbo(this, 120, 309, textureX, textureY); // Box 128
		bodyModel[365] = new ModelRendererTurbo(this, 113, 309, textureX, textureY); // Box 128
		bodyModel[366] = new ModelRendererTurbo(this, 129, 309, textureX, textureY); // Box 128
		bodyModel[367] = new ModelRendererTurbo(this, 106, 297, textureX, textureY); // seat sliding part
		bodyModel[368] = new ModelRendererTurbo(this, 106, 288, textureX, textureY); // seat backrest
		bodyModel[369] = new ModelRendererTurbo(this, 337, 274, textureX, textureY); // upper bed
		bodyModel[370] = new ModelRendererTurbo(this, 312, 268, textureX, textureY); // lower rotating bed
		bodyModel[371] = new ModelRendererTurbo(this, 342, 258, textureX, textureY); // upper bed
		bodyModel[372] = new ModelRendererTurbo(this, 288, 260, textureX, textureY); // lower rotating bed
		bodyModel[373] = new ModelRendererTurbo(this, 370, 281, textureX, textureY); // upper bed cable front
		bodyModel[374] = new ModelRendererTurbo(this, 367, 281, textureX, textureY); // upper bed cable rear
		bodyModel[375] = new ModelRendererTurbo(this, 370, 275, textureX, textureY); // upper bed cable front
		bodyModel[376] = new ModelRendererTurbo(this, 367, 275, textureX, textureY); // upper bed cable rear
		bodyModel[377] = new ModelRendererTurbo(this, 309, 277, textureX, textureY); // Box 38
		bodyModel[378] = new ModelRendererTurbo(this, 306, 290, textureX, textureY); // Box 38
		bodyModel[379] = new ModelRendererTurbo(this, 293, 277, textureX, textureY); // Box 38
		bodyModel[380] = new ModelRendererTurbo(this, 291, 303, textureX, textureY); // seat sliding part
		bodyModel[381] = new ModelRendererTurbo(this, 293, 282, textureX, textureY); // seat backrest
		bodyModel[382] = new ModelRendererTurbo(this, 309, 299, textureX, textureY); // seat sliding part cull
		bodyModel[383] = new ModelRendererTurbo(this, 309, 294, textureX, textureY); // seat sliding part cull
		bodyModel[384] = new ModelRendererTurbo(this, 308, 304, textureX, textureY); // Box 128
		bodyModel[385] = new ModelRendererTurbo(this, 308, 309, textureX, textureY); // Box 128
		bodyModel[386] = new ModelRendererTurbo(this, 301, 309, textureX, textureY); // Box 128
		bodyModel[387] = new ModelRendererTurbo(this, 317, 309, textureX, textureY); // Box 128
		bodyModel[388] = new ModelRendererTurbo(this, 294, 297, textureX, textureY); // seat sliding part
		bodyModel[389] = new ModelRendererTurbo(this, 294, 288, textureX, textureY); // seat backrest
		bodyModel[390] = new ModelRendererTurbo(this, 47, 226, textureX, textureY); // Box 38
		bodyModel[391] = new ModelRendererTurbo(this, 40, 229, textureX, textureY); // Box 38
		bodyModel[392] = new ModelRendererTurbo(this, 14, 224, textureX, textureY); // Box 38
		bodyModel[393] = new ModelRendererTurbo(this, 27, 224, textureX, textureY); // Box 38
		bodyModel[394] = new ModelRendererTurbo(this, 40, 238, textureX, textureY); // Box 38
		bodyModel[395] = new ModelRendererTurbo(this, 6, 230, textureX, textureY); // roomette bed rear
		bodyModel[396] = new ModelRendererTurbo(this, 33, 26, textureX, textureY); // Box 128
		bodyModel[397] = new ModelRendererTurbo(this, 42, 19, textureX, textureY); // Box 128
		bodyModel[398] = new ModelRendererTurbo(this, 1, 242, textureX, textureY); // roomette bed rear
		bodyModel[399] = new ModelRendererTurbo(this, 1, 239, textureX, textureY); // roomette bed rear
		bodyModel[400] = new ModelRendererTurbo(this, 27, 233, textureX, textureY); // Box 38
		bodyModel[401] = new ModelRendererTurbo(this, 39, 33, textureX, textureY); // Box 128
		bodyModel[402] = new ModelRendererTurbo(this, 1, 230, textureX, textureY); // Box 128
		bodyModel[403] = new ModelRendererTurbo(this, 1, 234, textureX, textureY); // Box 128
		bodyModel[404] = new ModelRendererTurbo(this, 71, 219, textureX, textureY); // Box 128
		bodyModel[405] = new ModelRendererTurbo(this, 119, 226, textureX, textureY); // Box 38
		bodyModel[406] = new ModelRendererTurbo(this, 112, 229, textureX, textureY); // Box 38
		bodyModel[407] = new ModelRendererTurbo(this, 86, 224, textureX, textureY); // Box 38
		bodyModel[408] = new ModelRendererTurbo(this, 99, 224, textureX, textureY); // Box 38
		bodyModel[409] = new ModelRendererTurbo(this, 110, 238, textureX, textureY); // Box 38
		bodyModel[410] = new ModelRendererTurbo(this, 76, 230, textureX, textureY); // roomette bed rear
		bodyModel[411] = new ModelRendererTurbo(this, 53, 229, textureX, textureY); // Box 128
		bodyModel[412] = new ModelRendererTurbo(this, 71, 242, textureX, textureY); // roomette bed rear
		bodyModel[413] = new ModelRendererTurbo(this, 71, 239, textureX, textureY); // roomette bed rear
		bodyModel[414] = new ModelRendererTurbo(this, 97, 233, textureX, textureY); // Box 38
		bodyModel[415] = new ModelRendererTurbo(this, 82, 236, textureX, textureY); // Box 128
		bodyModel[416] = new ModelRendererTurbo(this, 71, 230, textureX, textureY); // Box 128
		bodyModel[417] = new ModelRendererTurbo(this, 71, 234, textureX, textureY); // Box 128
		bodyModel[418] = new ModelRendererTurbo(this, 176, 237, textureX, textureY); // Box 128
		bodyModel[419] = new ModelRendererTurbo(this, 197, 230, textureX, textureY); // Box 128
		bodyModel[420] = new ModelRendererTurbo(this, 197, 234, textureX, textureY); // Box 128
		bodyModel[421] = new ModelRendererTurbo(this, 157, 233, textureX, textureY); // Box 38
		bodyModel[422] = new ModelRendererTurbo(this, 12, 236, textureX, textureY); // Box 128
		bodyModel[423] = new ModelRendererTurbo(this, 170, 230, textureX, textureY); // roomette bed front
		bodyModel[424] = new ModelRendererTurbo(this, 191, 242, textureX, textureY); // roomette bed front
		bodyModel[425] = new ModelRendererTurbo(this, 193, 239, textureX, textureY); // roomette bed front
		bodyModel[426] = new ModelRendererTurbo(this, 171, 224, textureX, textureY); // Box 38
		bodyModel[427] = new ModelRendererTurbo(this, 156, 224, textureX, textureY); // Box 38
		bodyModel[428] = new ModelRendererTurbo(this, 144, 226, textureX, textureY); // Box 38
		bodyModel[429] = new ModelRendererTurbo(this, 151, 229, textureX, textureY); // Box 38
		bodyModel[430] = new ModelRendererTurbo(this, 144, 238, textureX, textureY); // Box 38
		bodyModel[431] = new ModelRendererTurbo(this, 288, 225, textureX, textureY); // Box 38
		bodyModel[432] = new ModelRendererTurbo(this, 23, 191, textureX, textureY); // Box 128
		bodyModel[433] = new ModelRendererTurbo(this, 18, 196, textureX, textureY); // Box 128
		bodyModel[434] = new ModelRendererTurbo(this, 34, 207, textureX, textureY); // Box 128
		bodyModel[435] = new ModelRendererTurbo(this, 23, 201, textureX, textureY); // Box 128
		bodyModel[436] = new ModelRendererTurbo(this, 23, 205, textureX, textureY); // Box 128
		bodyModel[437] = new ModelRendererTurbo(this, 28, 201, textureX, textureY); // roomette bed rear
		bodyModel[438] = new ModelRendererTurbo(this, 23, 213, textureX, textureY); // roomette bed rear
		bodyModel[439] = new ModelRendererTurbo(this, 23, 210, textureX, textureY); // roomette bed rear
		bodyModel[440] = new ModelRendererTurbo(this, 49, 204, textureX, textureY); // Box 38
		bodyModel[441] = new ModelRendererTurbo(this, 69, 197, textureX, textureY); // Box 38
		bodyModel[442] = new ModelRendererTurbo(this, 62, 200, textureX, textureY); // Box 38
		bodyModel[443] = new ModelRendererTurbo(this, 36, 195, textureX, textureY); // Box 38
		bodyModel[444] = new ModelRendererTurbo(this, 49, 195, textureX, textureY); // Box 38
		bodyModel[445] = new ModelRendererTurbo(this, 62, 209, textureX, textureY); // Box 38
		bodyModel[446] = new ModelRendererTurbo(this, 88, 205, textureX, textureY); // Box 38
		bodyModel[447] = new ModelRendererTurbo(this, 93, 190, textureX, textureY); // Box 128
		bodyModel[448] = new ModelRendererTurbo(this, 75, 200, textureX, textureY); // Box 128
		bodyModel[449] = new ModelRendererTurbo(this, 104, 207, textureX, textureY); // Box 128
		bodyModel[450] = new ModelRendererTurbo(this, 98, 201, textureX, textureY); // roomette bed rear
		bodyModel[451] = new ModelRendererTurbo(this, 93, 213, textureX, textureY); // roomette bed rear
		bodyModel[452] = new ModelRendererTurbo(this, 93, 210, textureX, textureY); // roomette bed rear
		bodyModel[453] = new ModelRendererTurbo(this, 93, 201, textureX, textureY); // Box 128
		bodyModel[454] = new ModelRendererTurbo(this, 93, 205, textureX, textureY); // Box 128
		bodyModel[455] = new ModelRendererTurbo(this, 119, 204, textureX, textureY); // Box 38
		bodyModel[456] = new ModelRendererTurbo(this, 141, 197, textureX, textureY); // Box 38
		bodyModel[457] = new ModelRendererTurbo(this, 134, 200, textureX, textureY); // Box 38
		bodyModel[458] = new ModelRendererTurbo(this, 108, 195, textureX, textureY); // Box 38
		bodyModel[459] = new ModelRendererTurbo(this, 121, 195, textureX, textureY); // Box 38
		bodyModel[460] = new ModelRendererTurbo(this, 132, 209, textureX, textureY); // Box 38
		bodyModel[461] = new ModelRendererTurbo(this, 6, 353, textureX, textureY); // Box 128
		bodyModel[462] = new ModelRendererTurbo(this, 54, 360, textureX, textureY); // Box 38
		bodyModel[463] = new ModelRendererTurbo(this, 47, 363, textureX, textureY); // Box 38
		bodyModel[464] = new ModelRendererTurbo(this, 21, 358, textureX, textureY); // Box 38
		bodyModel[465] = new ModelRendererTurbo(this, 34, 358, textureX, textureY); // Box 38
		bodyModel[466] = new ModelRendererTurbo(this, 45, 372, textureX, textureY); // Box 38
		bodyModel[467] = new ModelRendererTurbo(this, 11, 364, textureX, textureY); // roomette bed rear
		bodyModel[468] = new ModelRendererTurbo(this, 6, 376, textureX, textureY); // roomette bed rear
		bodyModel[469] = new ModelRendererTurbo(this, 6, 373, textureX, textureY); // roomette bed rear
		bodyModel[470] = new ModelRendererTurbo(this, 32, 367, textureX, textureY); // Box 38
		bodyModel[471] = new ModelRendererTurbo(this, 6, 364, textureX, textureY); // Box 128
		bodyModel[472] = new ModelRendererTurbo(this, 6, 368, textureX, textureY); // Box 128
		bodyModel[473] = new ModelRendererTurbo(this, 1, 368, textureX, textureY); // Box 128
		bodyModel[474] = new ModelRendererTurbo(this, 77, 368, textureX, textureY); // Box 38
		bodyModel[475] = new ModelRendererTurbo(this, 82, 353, textureX, textureY); // Box 128
		bodyModel[476] = new ModelRendererTurbo(this, 130, 360, textureX, textureY); // Box 38
		bodyModel[477] = new ModelRendererTurbo(this, 123, 363, textureX, textureY); // Box 38
		bodyModel[478] = new ModelRendererTurbo(this, 97, 358, textureX, textureY); // Box 38
		bodyModel[479] = new ModelRendererTurbo(this, 110, 358, textureX, textureY); // Box 38
		bodyModel[480] = new ModelRendererTurbo(this, 121, 372, textureX, textureY); // Box 38
		bodyModel[481] = new ModelRendererTurbo(this, 87, 364, textureX, textureY); // roomette bed rear
		bodyModel[482] = new ModelRendererTurbo(this, 64, 363, textureX, textureY); // Box 128
		bodyModel[483] = new ModelRendererTurbo(this, 82, 376, textureX, textureY); // roomette bed rear
		bodyModel[484] = new ModelRendererTurbo(this, 82, 373, textureX, textureY); // roomette bed rear
		bodyModel[485] = new ModelRendererTurbo(this, 108, 367, textureX, textureY); // Box 38
		bodyModel[486] = new ModelRendererTurbo(this, 93, 370, textureX, textureY); // Box 128
		bodyModel[487] = new ModelRendererTurbo(this, 82, 364, textureX, textureY); // Box 128
		bodyModel[488] = new ModelRendererTurbo(this, 82, 368, textureX, textureY); // Box 128
		bodyModel[489] = new ModelRendererTurbo(this, 153, 368, textureX, textureY); // Box 38
		bodyModel[490] = new ModelRendererTurbo(this, 158, 353, textureX, textureY); // Box 128
		bodyModel[491] = new ModelRendererTurbo(this, 206, 360, textureX, textureY); // Box 38
		bodyModel[492] = new ModelRendererTurbo(this, 199, 363, textureX, textureY); // Box 38
		bodyModel[493] = new ModelRendererTurbo(this, 173, 358, textureX, textureY); // Box 38
		bodyModel[494] = new ModelRendererTurbo(this, 186, 358, textureX, textureY); // Box 38
		bodyModel[495] = new ModelRendererTurbo(this, 197, 372, textureX, textureY); // Box 38
		bodyModel[496] = new ModelRendererTurbo(this, 163, 364, textureX, textureY); // roomette bed rear
		bodyModel[497] = new ModelRendererTurbo(this, 140, 363, textureX, textureY); // Box 128
		bodyModel[498] = new ModelRendererTurbo(this, 158, 376, textureX, textureY); // roomette bed rear
		bodyModel[499] = new ModelRendererTurbo(this, 158, 373, textureX, textureY); // roomette bed rear

		bodyModel[0].addBox(0F, 0F, 0F, 118, 2, 22, 0F); // Box 2
		bodyModel[0].setRotationPoint(-61F, 1F, -11F);

		bodyModel[1].addBox(0F, 0F, 0F, 1, 2, 22, 0F); // Box 2
		bodyModel[1].setRotationPoint(61F, 1F, -11F);

		bodyModel[2].addBox(0F, 0F, 0F, 4, 2, 10, 0F); // Box 2
		bodyModel[2].setRotationPoint(57F, 1F, -5F);

		bodyModel[3].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 2
		bodyModel[3].setRotationPoint(61F, 3F, 10F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 2
		bodyModel[4].setRotationPoint(61F, 4F, 10F);

		bodyModel[5].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 2
		bodyModel[5].setRotationPoint(55F, 3F, 10F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 2
		bodyModel[6].setRotationPoint(55F, 4F, 10F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.75F, 0F, 0F); // Box 2
		bodyModel[7].setRotationPoint(52.75F, 3F, 10F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, -0.5F, -1F, 0F, -0.5F); // Box 2
		bodyModel[8].setRotationPoint(53.5F, 4F, 10F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 7, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 2
		bodyModel[9].setRotationPoint(-61F, 4F, 10F);

		bodyModel[10].addBox(0F, 0F, 0F, 8, 1, 1, 0F); // Box 2
		bodyModel[10].setRotationPoint(-61F, 3F, 10F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0.25F, 0F, 0F); // Box 2
		bodyModel[11].setRotationPoint(-52.75F, 3F, 10F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 2
		bodyModel[12].setRotationPoint(-54.5F, 4F, 10F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0.25F, 0F, 0F); // Box 2
		bodyModel[13].setRotationPoint(35.25F, 3F, 10F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 2
		bodyModel[14].setRotationPoint(33.5F, 4F, 10F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.75F, 0F, 0F); // Box 2
		bodyModel[15].setRotationPoint(-35.25F, 3F, 10F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, -0.5F, -1F, 0F, -0.5F); // Box 2
		bodyModel[16].setRotationPoint(-34.5F, 4F, 10F);

		bodyModel[17].addBox(0F, 0F, 0F, 69, 1, 1, 0F); // Box 2
		bodyModel[17].setRotationPoint(-34F, 3F, 10F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 60, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 2
		bodyModel[18].setRotationPoint(-26F, 4F, 10F);

		bodyModel[19].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 24
		bodyModel[19].setRotationPoint(61F, 3F, -11F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 25
		bodyModel[20].setRotationPoint(61F, 4F, -11F);

		bodyModel[21].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 26
		bodyModel[21].setRotationPoint(55F, 3F, -11F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 27
		bodyModel[22].setRotationPoint(55F, 4F, -11F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.75F, 0F, 0F); // Box 28
		bodyModel[23].setRotationPoint(52.75F, 3F, -11F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0.5F, -1F, 0F, 0.5F); // Box 29
		bodyModel[24].setRotationPoint(53.5F, 4F, -11F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 7, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 30
		bodyModel[25].setRotationPoint(-61F, 4F, -11F);

		bodyModel[26].addBox(0F, 0F, 0F, 8, 1, 1, 0F); // Box 31
		bodyModel[26].setRotationPoint(-61F, 3F, -11F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0.25F, 0F, 0F); // Box 32
		bodyModel[27].setRotationPoint(-52.75F, 3F, -11F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0.5F, -0.5F, 0F, 0.5F); // Box 33
		bodyModel[28].setRotationPoint(-54.5F, 4F, -11F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0.25F, 0F, 0F); // Box 34
		bodyModel[29].setRotationPoint(35.25F, 3F, -11F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0.5F, -0.5F, 0F, 0.5F); // Box 35
		bodyModel[30].setRotationPoint(33.5F, 4F, -11F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.75F, 0F, 0F); // Box 36
		bodyModel[31].setRotationPoint(-35.25F, 3F, -11F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0.5F, -1F, 0F, 0.5F); // Box 37
		bodyModel[32].setRotationPoint(-34.5F, 4F, -11F);

		bodyModel[33].addBox(0F, 0F, 0F, 69, 1, 1, 0F); // Box 38
		bodyModel[33].setRotationPoint(-34F, 3F, -11F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 40, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 39
		bodyModel[34].setRotationPoint(-26F, 4F, -11F);

		bodyModel[35].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 2
		bodyModel[35].setRotationPoint(54F, 3F, 10F);

		bodyModel[36].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 41
		bodyModel[36].setRotationPoint(54F, 3F, -11F);

		bodyModel[37].addBox(0F, 0F, 0F, 4, 2, 3, 0F); // Box 2
		bodyModel[37].setRotationPoint(60F, 3F, -1.5F);

		bodyModel[38].addBox(0F, 0F, 0F, 5, 1, 10, 0F); // Box 2
		bodyModel[38].setRotationPoint(57F, 3F, -5F);

		bodyModel[39].addBox(0F, 0F, 0F, 4, 2, 3, 0F); // Box 2
		bodyModel[39].setRotationPoint(-63F, 3F, -1.5F);

		bodyModel[40].addBox(0F, 0F, 0F, 5, 1, 10, 0F); // Box 2
		bodyModel[40].setRotationPoint(-61F, 3F, -5F);

		bodyModel[41].addBox(0F, 0F, 0F, 113, 1, 4, 0F); // Box 2
		bodyModel[41].setRotationPoint(-56F, 3F, -2F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 2
		bodyModel[42].setRotationPoint(43.5F, 4F, -1F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 2
		bodyModel[43].setRotationPoint(-44.5F, 4F, -1F);

		bodyModel[44].addBox(0F, 0F, 0F, 13, 5, 5, 0F); // Box 2
		bodyModel[44].setRotationPoint(1F, 3F, 4F);

		bodyModel[45].addBox(0F, 0F, 0F, 8, 5, 5, 0F); // Box 2
		bodyModel[45].setRotationPoint(15F, 3F, 4F);

		bodyModel[46].addBox(0F, 0F, 0F, 13, 5, 5, 0F); // Box 52
		bodyModel[46].setRotationPoint(1F, 3F, -9F);

		bodyModel[47].addBox(0F, 0F, 0F, 4, 5, 4, 0F); // Box 2
		bodyModel[47].setRotationPoint(24F, 3F, 4F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 2
		bodyModel[48].setRotationPoint(-33F, 4F, 10F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 55
		bodyModel[49].setRotationPoint(-33F, 4F, -11F);

		bodyModel[50].addBox(0F, 0F, 0F, 3, 3, 4, 0F); // Box 2
		bodyModel[50].setRotationPoint(-28F, 3F, 5F);

		bodyModel[51].addBox(0F, 0F, 0F, 17, 4, 10, 0F); // Box 2
		bodyModel[51].setRotationPoint(-28F, 4F, -5F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 17, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 2
		bodyModel[52].setRotationPoint(-28F, 8F, -5F);

		bodyModel[53].addBox(0F, 0F, 0F, 3, 3, 4, 0F); // Box 59
		bodyModel[53].setRotationPoint(-28F, 3F, -9F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 8, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[54].setRotationPoint(-24F, 3F, 7.25F);
		bodyModel[54].rotateAngleX = -0.78539816F;

		bodyModel[55].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 41
		bodyModel[55].setRotationPoint(-24.01F, 3F, 6.75F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 41
		bodyModel[56].setRotationPoint(-15.99F, 3F, 6.75F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 8, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[57].setRotationPoint(-15F, 3F, 7.25F);
		bodyModel[57].rotateAngleX = -0.78539816F;

		bodyModel[58].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 41
		bodyModel[58].setRotationPoint(-15.01F, 3F, 6.75F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 41
		bodyModel[59].setRotationPoint(-6.99F, 3F, 6.75F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 3, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[60].setRotationPoint(-30.5F, 3F, 4F);
		bodyModel[60].rotateAngleZ = -0.78539816F;

		bodyModel[61].addShapeBox(0F, 0F, 0F, 1, 3, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 41
		bodyModel[61].setRotationPoint(-31F, 3F, 3.99F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 1, 3, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 41
		bodyModel[62].setRotationPoint(-31F, 3F, 9.01F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 8, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[63].setRotationPoint(24F, 4F, 0F);
		bodyModel[63].rotateAngleX = -0.78539816F;

		bodyModel[64].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 41
		bodyModel[64].setRotationPoint(23.99F, 4F, -0.5F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 41
		bodyModel[65].setRotationPoint(32.01F, 4F, -0.5F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 6, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[66].setRotationPoint(24F, 3F, -7F);
		bodyModel[66].rotateAngleX = -0.78539816F;

		bodyModel[67].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 41
		bodyModel[67].setRotationPoint(23.99F, 3F, -7.5F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 41
		bodyModel[68].setRotationPoint(30.01F, 3F, -7.5F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 11, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 39
		bodyModel[69].setRotationPoint(23F, 4F, -11F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 9, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 39
		bodyModel[70].setRotationPoint(14F, 4F, -11F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 1.25F, 0F, 0F, 1.25F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[71].setRotationPoint(15.75F, 5F, -10.5F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, -1.125F, 0F, 0F, -1.125F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, -0.875F, 0F, 0F, -0.875F, 0F, 0F, 0.25F, 0F); // Box 38
		bodyModel[72].setRotationPoint(19.75F, 5F, -10.5F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 38
		bodyModel[73].setRotationPoint(18.75F, 5F, -10.5F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.25F, -1.375F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.25F, -1.375F, 0F, -0.25F, -0.375F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.25F, -0.375F, 0F); // Box 38
		bodyModel[74].setRotationPoint(14.75F, 4.75F, -10.5F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 41
		bodyModel[75].setRotationPoint(16.05F, 5.2F, -9.5F);
		bodyModel[75].rotateAngleZ = -0.78539816F;

		bodyModel[76].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 41
		bodyModel[76].setRotationPoint(19.25F, 5.2F, -9.5F);
		bodyModel[76].rotateAngleZ = -0.78539816F;

		bodyModel[77].addShapeBox(0F, 0F, 0F, 1, 4, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 41
		bodyModel[77].setRotationPoint(15.55F, 3F, -5.49F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 1, 4, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 41
		bodyModel[78].setRotationPoint(15.55F, 3F, -9.51F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 1, 4, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 41
		bodyModel[79].setRotationPoint(18.75F, 3F, -5.49F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 1, 4, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 41
		bodyModel[80].setRotationPoint(18.75F, 3F, -9.51F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 4, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[81].setRotationPoint(-16F, 3F, -7.25F);
		bodyModel[81].rotateAngleX = -0.78539816F;

		bodyModel[82].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 41
		bodyModel[82].setRotationPoint(-16.01F, 3F, -7.75F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 41
		bodyModel[83].setRotationPoint(-11.99F, 3F, -7.75F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[84].setRotationPoint(-20.5F, 3F, -9F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 0, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 26
		bodyModel[85].setRotationPoint(57F, 3F, -10F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 0, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -1.6F, 0F, -0.4F, -1.6F); // Box 26
		bodyModel[86].setRotationPoint(57F, 4F, -10F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 0, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 26
		bodyModel[87].setRotationPoint(61F, 3F, -10F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 0, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -1.6F, 0F, -0.4F, -1.6F); // Box 26
		bodyModel[88].setRotationPoint(61F, 4F, -10F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F); // Box 24
		bodyModel[89].setRotationPoint(61.01F, 3F, -9F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F); // Box 24
		bodyModel[90].setRotationPoint(56.99F, 3F, -9F);

		bodyModel[91].addShapeBox(0F, 1F, 1F, 4, 2, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Left step part
		bodyModel[91].setRotationPoint(57.01F, 4F, -8F);

		bodyModel[92].addShapeBox(0F, 1F, -1F, 4, 0, 2, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Left step part
		bodyModel[92].setRotationPoint(57.01F, 4F, -8F);

		bodyModel[93].addShapeBox(0F, -1F, -1F, 4, 2, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Left step part
		bodyModel[93].setRotationPoint(57.01F, 4F, -8F);

		bodyModel[94].addShapeBox(0F, -1F, -3F, 4, 0, 2, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Left step part
		bodyModel[94].setRotationPoint(57.01F, 4F, -8F);

		bodyModel[95].addShapeBox(0F, -3F, -3F, 4, 3, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Left step part
		bodyModel[95].setRotationPoint(57.01F, 4F, -8F);

		bodyModel[96].addShapeBox(0F, 1F, -3F, 0, 2, 4, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Left step part
		bodyModel[96].setRotationPoint(57.01F, 4F, -8F);

		bodyModel[97].addShapeBox(0F, 0F, -3F, 0, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Left step part
		bodyModel[97].setRotationPoint(57.01F, 4F, -8F);

		bodyModel[98].addShapeBox(0F, -3F, -3F, 0, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left step part
		bodyModel[98].setRotationPoint(57.01F, 4F, -8F);

		bodyModel[99].addShapeBox(0F, 1F, -3F, 0, 2, 4, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Left step part
		bodyModel[99].setRotationPoint(60.99F, 4F, -8F);

		bodyModel[100].addShapeBox(0F, 0F, -3F, 0, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Left step part
		bodyModel[100].setRotationPoint(60.99F, 4F, -8F);

		bodyModel[101].addShapeBox(0F, -3F, -3F, 0, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left step part
		bodyModel[101].setRotationPoint(60.99F, 4F, -8F);

		bodyModel[102].addShapeBox(0F, 0F, -3F, 4, 2, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.02F, 0F, -0.5F, -0.02F, 0F, 0.5F, 0F, 0F, 0.5F); // Left step part
		bodyModel[102].setRotationPoint(57.01F, 4F, -8F);

		bodyModel[103].addShapeBox(0F, 2F, -2.5F, 4, 0, 4, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 1F, -0.5F, 0F, 1F, -0.5F); // Left step part
		bodyModel[103].setRotationPoint(57.01F, 4F, -8F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 0, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 140
		bodyModel[104].setRotationPoint(57F, 3F, 7F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 0, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, -1.6F, 0F, -0.4F, -1.6F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F); // Box 141
		bodyModel[105].setRotationPoint(57F, 4F, 8F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 0, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 142
		bodyModel[106].setRotationPoint(61F, 3F, 7F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 0, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, -1.6F, 0F, -0.4F, -1.6F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F); // Box 143
		bodyModel[107].setRotationPoint(61F, 4F, 8F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 144
		bodyModel[108].setRotationPoint(61.01F, 3F, 8F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 145
		bodyModel[109].setRotationPoint(56.99F, 3F, 8F);

		bodyModel[110].addShapeBox(0F, 1F, -1F, 4, 2, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Right step part
		bodyModel[110].setRotationPoint(57.01F, 4F, 8F);

		bodyModel[111].addShapeBox(0F, 1F, -1F, 4, 0, 2, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Right step part
		bodyModel[111].setRotationPoint(57.01F, 4F, 8F);

		bodyModel[112].addShapeBox(0F, -1F, 1F, 4, 2, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Right step part
		bodyModel[112].setRotationPoint(57.01F, 4F, 8F);

		bodyModel[113].addShapeBox(0F, -1F, 1F, 4, 0, 2, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Right step part
		bodyModel[113].setRotationPoint(57.01F, 4F, 8F);

		bodyModel[114].addShapeBox(0F, -3F, 3F, 4, 3, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Right step part
		bodyModel[114].setRotationPoint(57.01F, 4F, 8F);

		bodyModel[115].addShapeBox(0F, 1F, -1F, 0, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F); // Right step part
		bodyModel[115].setRotationPoint(57.01F, 4F, 8F);

		bodyModel[116].addShapeBox(0F, 0F, -1F, 0, 1, 4, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Right step part
		bodyModel[116].setRotationPoint(57.01F, 4F, 8F);

		bodyModel[117].addShapeBox(0F, -3F, 0F, 0, 3, 3, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right step part
		bodyModel[117].setRotationPoint(57.01F, 4F, 8F);

		bodyModel[118].addShapeBox(0F, 1F, -1F, 0, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F); // Right step part
		bodyModel[118].setRotationPoint(60.99F, 4F, 8F);

		bodyModel[119].addShapeBox(0F, 0F, -1F, 0, 1, 4, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Right step part
		bodyModel[119].setRotationPoint(60.99F, 4F, 8F);

		bodyModel[120].addShapeBox(0F, -3F, 0F, 0, 3, 3, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right step part
		bodyModel[120].setRotationPoint(60.99F, 4F, 8F);

		bodyModel[121].addShapeBox(0F, 0F, 3F, 4, 2, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.02F, 0F, 0.5F, -0.02F, 0F, -0.5F, 0F, 0F, -0.5F); // Right step part
		bodyModel[121].setRotationPoint(57.01F, 4F, 8F);

		bodyModel[122].addShapeBox(0F, 2F, -1.5F, 4, 0, 4, 0F,0F, -1F, -0.5F, -0.02F, -1F, -0.5F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -0.5F, -0.02F, 1F, -0.5F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Right step part
		bodyModel[122].setRotationPoint(57.01F, 4F, 8F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 4, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F); // Left trapdoor
		bodyModel[123].setRotationPoint(57F, 1F, -10.99F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 4, 1, 6, 0F,0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F); // Right trapdoor
		bodyModel[124].setRotationPoint(57F, 1F, 4.99F);

		bodyModel[125].addShapeBox(0F, 0F, -1F, 4, 15, 1, 0F,0F, 0F, -0.5F, -0.02F, 0F, -0.5F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.02F, 0F, -0.5F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Left side door
		bodyModel[125].setRotationPoint(57.01F, -14F, -10.5F);

		bodyModel[126].addBox(0F, 0F, 0F, 118, 16, 1, 0F); // Box 38
		bodyModel[126].setRotationPoint(-61F, -15F, -11F);

		bodyModel[127].addBox(0F, 0F, 0F, 118, 16, 1, 0F); // Box 128
		bodyModel[127].setRotationPoint(-61F, -15F, 10F);

		bodyModel[128].addBox(0F, 0F, 0F, 1, 16, 7, 0F); // Box 128
		bodyModel[128].setRotationPoint(56F, -15F, -10F);

		bodyModel[129].addBox(0F, 0F, 0F, 1, 16, 7, 0F); // Box 128
		bodyModel[129].setRotationPoint(56F, -15F, 3F);

		bodyModel[130].addBox(0F, 0F, 0F, 1, 16, 8, 0F); // Box 128
		bodyModel[130].setRotationPoint(61F, -15F, -11F);

		bodyModel[131].addBox(0F, 0F, 0F, 1, 16, 8, 0F); // Box 128
		bodyModel[131].setRotationPoint(61F, -15F, 3F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 4, 15, 1, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, -0.5F, 0F, 0F, -0.5F); // Right side door
		bodyModel[132].setRotationPoint(57.01F, -14F, 10.5F);

		bodyModel[133].addBox(0F, 0F, 0F, 1, 3, 5, 0F); // Box 128
		bodyModel[133].setRotationPoint(-61F, -15F, -10F);

		bodyModel[134].addBox(0F, 0F, 0F, 1, 16, 7, 0F); // Box 128
		bodyModel[134].setRotationPoint(-61F, -15F, 3F);

		bodyModel[135].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Box 128
		bodyModel[135].setRotationPoint(56F, -15F, -3F);

		bodyModel[136].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Box 128
		bodyModel[136].setRotationPoint(61F, -15F, -3F);

		bodyModel[137].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Box 128
		bodyModel[137].setRotationPoint(-61F, -15F, -3F);

		bodyModel[138].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 128
		bodyModel[138].setRotationPoint(57F, -15F, -11F);

		bodyModel[139].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 128
		bodyModel[139].setRotationPoint(57F, -15F, 10F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 1, 15, 6, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Vestibule door
		bodyModel[140].setRotationPoint(56.01F, -14F, -3F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 1, 15, 6, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Front end door
		bodyModel[141].setRotationPoint(-60.99F, -14F, -3F);

		bodyModel[142].addBox(0F, 0F, 0F, 1, 1, 8, 0F); // Box 128
		bodyModel[142].setRotationPoint(62F, -15F, -4F);

		bodyModel[143].addBox(0F, 0F, 0F, 1, 1, 8, 0F); // Box 128
		bodyModel[143].setRotationPoint(62F, 1F, -4F);

		bodyModel[144].addBox(0F, 0F, 0F, 1, 15, 1, 0F); // Box 128
		bodyModel[144].setRotationPoint(62F, -14F, -4F);

		bodyModel[145].addBox(0F, 0F, 0F, 1, 15, 1, 0F); // Box 128
		bodyModel[145].setRotationPoint(62F, -14F, 3F);

		bodyModel[146].addBox(0F, 0F, 0F, 1, 15, 2, 0F); // Box 128
		bodyModel[146].setRotationPoint(63F, -14F, -5F);

		bodyModel[147].addBox(0F, 0F, 0F, 1, 15, 2, 0F); // Box 128
		bodyModel[147].setRotationPoint(63F, -14F, 3F);

		bodyModel[148].addBox(0F, 0F, 0F, 1, 1, 10, 0F); // Box 128
		bodyModel[148].setRotationPoint(63F, 1F, -5F);

		bodyModel[149].addBox(0F, 0F, 0F, 1, 1, 10, 0F); // Box 128
		bodyModel[149].setRotationPoint(63F, -15F, -5F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[150].setRotationPoint(63F, -16F, -5F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 153
		bodyModel[151].setRotationPoint(63F, -16F, 0F);

		bodyModel[152].addBox(0F, 0F, 0F, 1, 1, 8, 0F); // Box 128
		bodyModel[152].setRotationPoint(-62F, -15F, -4F);

		bodyModel[153].addBox(0F, 0F, 0F, 1, 1, 8, 0F); // Box 128
		bodyModel[153].setRotationPoint(-62F, 1F, -4F);

		bodyModel[154].addBox(0F, 0F, 0F, 1, 15, 1, 0F); // Box 128
		bodyModel[154].setRotationPoint(-62F, -14F, -4F);

		bodyModel[155].addBox(0F, 0F, 0F, 1, 15, 1, 0F); // Box 128
		bodyModel[155].setRotationPoint(-62F, -14F, 3F);

		bodyModel[156].addBox(0F, 0F, 0F, 1, 15, 2, 0F); // Box 128
		bodyModel[156].setRotationPoint(-63F, -14F, -5F);

		bodyModel[157].addBox(0F, 0F, 0F, 1, 15, 2, 0F); // Box 128
		bodyModel[157].setRotationPoint(-63F, -14F, 3F);

		bodyModel[158].addBox(0F, 0F, 0F, 1, 1, 10, 0F); // Box 128
		bodyModel[158].setRotationPoint(-63F, 1F, -5F);

		bodyModel[159].addBox(0F, 0F, 0F, 1, 1, 10, 0F); // Box 128
		bodyModel[159].setRotationPoint(-63F, -15F, -5F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[160].setRotationPoint(-63F, -16F, -5F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 153
		bodyModel[161].setRotationPoint(-63F, -16F, 0F);

		bodyModel[162].addBox(0F, 0F, 0F, 123, 2, 6, 0F); // Box 128
		bodyModel[162].setRotationPoint(-61F, -20F, -3F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 123, 1, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[163].setRotationPoint(-61F, -20F, -7F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 123, 1, 3, 0F,0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[164].setRotationPoint(-61F, -19F, -10F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 123, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 168
		bodyModel[165].setRotationPoint(-61F, -20F, 3F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 123, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F); // Box 169
		bodyModel[166].setRotationPoint(-61F, -19F, 7F);

		bodyModel[167].addBox(0F, 0F, 0F, 1, 2, 14, 0F); // Box 128
		bodyModel[167].setRotationPoint(-61F, -17F, -7F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[168].setRotationPoint(-61F, -18F, -10F);

		bodyModel[169].addShapeBox(0F, 0F, 0F, 123, 1, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[169].setRotationPoint(-61F, -19F, -7F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 176
		bodyModel[170].setRotationPoint(-61F, -18F, 7F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 123, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 177
		bodyModel[171].setRotationPoint(-61F, -19F, 3F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 123, 1, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 1.25F, -1F, 0F, 1.25F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 128
		bodyModel[172].setRotationPoint(-61F, -16F, -11F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 123, 1, 2, 0F,0F, 1.25F, 0F, 0F, 1.25F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 170
		bodyModel[173].setRotationPoint(-61F, -16F, 10F);

		bodyModel[174].addShapeBox(0F, 0F, 0F, 0, 8, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Rear gate closed
		bodyModel[174].setRotationPoint(63F, -7F, -3F);

		bodyModel[175].addShapeBox(0F, 0F, 0F, 0, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Rear gate open
		bodyModel[175].setRotationPoint(63F, -7F, -3F);

		bodyModel[176].addBox(0F, 0F, 0F, 6, 2, 14, 0F); // Box 128
		bodyModel[176].setRotationPoint(56F, -17F, -7F);

		bodyModel[177].addShapeBox(0F, 0F, 0F, 6, 3, 3, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[177].setRotationPoint(56F, -18F, -10F);

		bodyModel[178].addShapeBox(0F, 0F, 0F, 6, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 176
		bodyModel[178].setRotationPoint(56F, -18F, 7F);

		bodyModel[179].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,-0.5F, -0.35F, 0F, -0.5F, -0.35F, 0F, -0.6F, -0.75F, 0F, -0.6F, -0.75F, 0F, 0F, -2.25F, 0F, 0F, -2.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[179].setRotationPoint(46F, -18F, 10F);

		bodyModel[180].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, 0.15F, 0F, 0F, 0.15F, -0.5F, -0.85F, 0F, -0.5F, -0.85F, 0F, 0F, -1F, 0.15F, 0F, -1F, 0.15F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 128
		bodyModel[180].setRotationPoint(46F, -18.5F, 8F);

		bodyModel[181].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,-0.6F, -0.75F, 0F, -0.6F, -0.75F, 0F, -0.5F, -0.35F, 0F, -0.5F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.25F, 0F, 0F, -2.25F, 0F); // Box 190
		bodyModel[181].setRotationPoint(46F, -18F, -11F);

		bodyModel[182].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,-0.5F, -0.85F, 0F, -0.5F, -0.85F, 0F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -1F, 0.15F, 0F, -1F, 0.15F); // Box 191
		bodyModel[182].setRotationPoint(46F, -18.5F, -10F);

		bodyModel[183].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[183].setRotationPoint(56.5F, -6F, -12F);

		bodyModel[184].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[184].setRotationPoint(61.5F, -6F, -12F);

		bodyModel[185].addShapeBox(0F, 0F, 0F, 4, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[185].setRotationPoint(-61F, -1.5F, -12F);

		bodyModel[186].addShapeBox(0F, 0F, 0F, 3, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[186].setRotationPoint(-61F, 6F, -10.5F);

		bodyModel[187].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 202
		bodyModel[187].setRotationPoint(56.5F, -6F, 11F);

		bodyModel[188].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 203
		bodyModel[188].setRotationPoint(61.5F, -6F, 11F);

		bodyModel[189].addShapeBox(0F, 0F, 0F, 4, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 204
		bodyModel[189].setRotationPoint(-61F, -1.5F, 11F);

		bodyModel[190].addShapeBox(0F, 0F, 0F, 3, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 205
		bodyModel[190].setRotationPoint(-61F, 6F, 10.5F);

		bodyModel[191].addShapeBox(0F, 0F, 0F, 55, 17, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[191].setRotationPoint(-34F, -16F, 5F);

		bodyModel[192].addShapeBox(0F, 0F, 0F, 1, 17, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 38
		bodyModel[192].setRotationPoint(-35F, -16F, 5F);

		bodyModel[193].addShapeBox(0F, 0F, 0F, 1, 17, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[193].setRotationPoint(21F, -16F, 5F);

		bodyModel[194].addShapeBox(0F, 0F, 0F, 26, 17, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[194].setRotationPoint(-60F, -16F, -4F);

		bodyModel[195].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[195].setRotationPoint(-52F, -12F, -5F);

		bodyModel[196].addShapeBox(0F, 0F, 0F, 1, 17, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[196].setRotationPoint(-43F, -16F, -10F);

		bodyModel[197].addShapeBox(0F, 0F, 0F, 1, 17, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[197].setRotationPoint(-33F, -16F, -10F);

		bodyModel[198].addShapeBox(0F, 0F, 0F, 3, 14, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[198].setRotationPoint(19F, -13F, 0F);

		bodyModel[199].addShapeBox(0F, 0F, 0F, 3, 14, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[199].setRotationPoint(1F, -13F, 0F);

		bodyModel[200].addShapeBox(0F, 0F, 0F, 3, 14, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[200].setRotationPoint(-35F, -13F, 0F);

		bodyModel[201].addShapeBox(0F, 0F, 0F, 1, 17, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[201].setRotationPoint(19F, -16F, -10F);

		bodyModel[202].addShapeBox(0F, 0F, 0F, 3, 14, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[202].setRotationPoint(1F, -13F, -10F);

		bodyModel[203].addShapeBox(0F, 0F, 0F, 1, 18, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[203].setRotationPoint(11F, -17F, -10F);

		bodyModel[204].addShapeBox(0F, 0F, 0F, 1, 18, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[204].setRotationPoint(-7F, -17F, -10F);

		bodyModel[205].addShapeBox(0F, 0F, 0F, 1, 18, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[205].setRotationPoint(-25F, -17F, -10F);

		bodyModel[206].addShapeBox(0F, 0F, 0F, 1, 17, 2, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[206].setRotationPoint(-34F, -16F, -5F);

		bodyModel[207].addShapeBox(0F, 0F, 0F, 19, 17, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 225
		bodyModel[207].setRotationPoint(-58F, -16F, 3F);

		bodyModel[208].addShapeBox(0F, 0F, 0F, 2, 17, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 225
		bodyModel[208].setRotationPoint(-60F, -16F, 4F);

		bodyModel[209].addShapeBox(0F, 0F, 0F, 1, 17, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[209].setRotationPoint(-40F, -16F, 4F);

		bodyModel[210].addShapeBox(0F, 0F, 0F, 3, 17, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[210].setRotationPoint(21F, -16F, -3F);

		bodyModel[211].addShapeBox(0F, 0F, 0F, 27, 17, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[211].setRotationPoint(21F, -16F, -4F);

		bodyModel[212].addShapeBox(0F, 0F, 0F, 3, 17, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[212].setRotationPoint(53F, -16F, -10F);

		bodyModel[213].addShapeBox(0F, 0F, 0F, 2, 17, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[213].setRotationPoint(48F, -16F, -6F);

		bodyModel[214].addShapeBox(0F, 0F, 0F, 3, 17, 1, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 38
		bodyModel[214].setRotationPoint(50F, -16F, -4F);

		bodyModel[215].addShapeBox(0F, 0F, 0F, 1, 17, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[215].setRotationPoint(47F, -16F, -10F);

		bodyModel[216].addShapeBox(0F, 0F, 0F, 1, 17, 4, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[216].setRotationPoint(20.25F, -16F, -4F);

		bodyModel[217].addShapeBox(0F, 0F, 0F, 18, 17, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 225
		bodyModel[217].setRotationPoint(27F, -16F, 3F);

		bodyModel[218].addShapeBox(0F, 0F, 0F, 1, 17, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[218].setRotationPoint(44F, -16F, 4F);

		bodyModel[219].addShapeBox(0F, 0F, 0F, 1, 17, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 225
		bodyModel[219].setRotationPoint(26F, -16F, 3F);

		bodyModel[220].addShapeBox(0F, 0F, 0F, 2, 17, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 38
		bodyModel[220].setRotationPoint(-37F, -16F, -3F);

		bodyModel[221].addShapeBox(0F, 0F, 0F, 2, 17, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[221].setRotationPoint(54F, -16F, 4F);

		bodyModel[222].addShapeBox(0F, 0F, 0F, 3, 17, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[222].setRotationPoint(51F, -16F, 4F);

		bodyModel[223].addShapeBox(0F, 0F, 0F, 9, 8, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[223].setRotationPoint(45F, -7F, 5F);

		bodyModel[224].addShapeBox(0F, 0F, 0F, 1, 17, 1, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0.75F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0.75F); // Box 38
		bodyModel[224].setRotationPoint(-33.25F, -16F, -5F);

		bodyModel[225].addShapeBox(0F, 0F, 0F, 1, 13, 1, 0F,0F, 0F, 0.75F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.75F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[225].setRotationPoint(-33.25F, -12F, -1F);

		bodyModel[226].addShapeBox(0F, 0F, 0F, 1, 17, 1, 0F,0.25F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F, 0.75F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F, 0.75F, 0.25F, 0F, 0F); // Box 38
		bodyModel[226].setRotationPoint(19.25F, -16F, -5F);

		bodyModel[227].addShapeBox(0F, 0F, 0F, 1, 13, 1, 0F,0.25F, 0F, 0F, 0F, 0F, 0.75F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0.75F, 0F, 0F, 0F, 0.25F, 0F, 0F); // Box 38
		bodyModel[227].setRotationPoint(19.25F, -12F, -1F);

		bodyModel[228].addShapeBox(0F, 0F, 0F, 1, 17, 5, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[228].setRotationPoint(-15.75F, -16F, -5F);

		bodyModel[229].addShapeBox(0F, 0F, 0F, 1, 17, 5, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[229].setRotationPoint(2.25F, -16F, -5F);

		bodyModel[230].addShapeBox(0F, 0F, 0F, 1, 13, 1, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0.75F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0.75F); // Box 38
		bodyModel[230].setRotationPoint(2.75F, -12F, -5F);

		bodyModel[231].addShapeBox(0F, 0F, 0F, 1, 17, 1, 0F,0F, 0F, 0.75F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.75F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[231].setRotationPoint(2.75F, -16F, -1F);

		bodyModel[232].addShapeBox(0F, 0F, 0F, 1, 17, 1, 0F,0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.75F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.75F, 0.25F, 0F, 0F); // Box 38
		bodyModel[232].setRotationPoint(1.25F, -16F, -5F);

		bodyModel[233].addShapeBox(0F, 0F, 0F, 1, 13, 1, 0F,0.25F, 0F, 0F, 0F, 0F, 0.75F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0.75F, 0F, 0F, 0F, 0.25F, 0F, 0F); // Box 38
		bodyModel[233].setRotationPoint(1.25F, -12F, -1F);

		bodyModel[234].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F); // Box 38
		bodyModel[234].setRotationPoint(3F, -13F, -5F);

		bodyModel[235].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[235].setRotationPoint(1F, -13F, -4F);

		bodyModel[236].addShapeBox(0F, 0F, 0F, 1, 3, 5, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[236].setRotationPoint(1F, -16F, -10F);

		bodyModel[237].addShapeBox(0F, 0F, 0F, 1, 3, 5, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[237].setRotationPoint(3.5F, -16F, 0F);

		bodyModel[238].addShapeBox(0F, 0F, 0F, 3, 14, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[238].setRotationPoint(-17F, -13F, 0F);

		bodyModel[239].addShapeBox(0F, 0F, 0F, 3, 14, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[239].setRotationPoint(-17F, -13F, -10F);

		bodyModel[240].addShapeBox(0F, 0F, 0F, 1, 13, 1, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0.75F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0.75F); // Box 38
		bodyModel[240].setRotationPoint(-15.25F, -12F, -5F);

		bodyModel[241].addShapeBox(0F, 0F, 0F, 1, 17, 1, 0F,0F, 0F, 0.75F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.75F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[241].setRotationPoint(-15.25F, -16F, -1F);

		bodyModel[242].addShapeBox(0F, 0F, 0F, 1, 17, 1, 0F,0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.75F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.75F, 0.25F, 0F, 0F); // Box 38
		bodyModel[242].setRotationPoint(-16.75F, -16F, -5F);

		bodyModel[243].addShapeBox(0F, 0F, 0F, 1, 13, 1, 0F,0.25F, 0F, 0F, 0F, 0F, 0.75F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0.75F, 0F, 0F, 0F, 0.25F, 0F, 0F); // Box 38
		bodyModel[243].setRotationPoint(-16.75F, -12F, -1F);

		bodyModel[244].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F); // Box 38
		bodyModel[244].setRotationPoint(-15F, -13F, -5F);

		bodyModel[245].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[245].setRotationPoint(-17F, -13F, -4F);

		bodyModel[246].addShapeBox(0F, 0F, 0F, 1, 3, 5, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[246].setRotationPoint(-17F, -16F, -10F);

		bodyModel[247].addShapeBox(0F, 0F, 0F, 1, 3, 5, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[247].setRotationPoint(-14.5F, -16F, 0F);

		bodyModel[248].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F); // Box 38
		bodyModel[248].setRotationPoint(-33F, -13F, -4F);

		bodyModel[249].addShapeBox(0F, 0F, 0F, 1, 3, 5, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[249].setRotationPoint(-35F, -16F, 0F);

		bodyModel[250].addShapeBox(0F, 0F, 0F, 1, 3, 5, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[250].setRotationPoint(21.5F, -16F, 0F);

		bodyModel[251].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[251].setRotationPoint(19F, -13F, -4F);

		bodyModel[252].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[252].setRotationPoint(1F, -7F, -4F);

		bodyModel[253].addShapeBox(0F, 0F, 0F, 1, 7, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[253].setRotationPoint(2F, -6F, -4F);

		bodyModel[254].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[254].setRotationPoint(-17F, -7F, -4F);

		bodyModel[255].addShapeBox(0F, 0F, 0F, 1, 7, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[255].setRotationPoint(-16F, -6F, -4F);

		bodyModel[256].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[256].setRotationPoint(-33.25F, -7F, -4F);

		bodyModel[257].addShapeBox(0F, 0F, 0F, 1, 7, 3, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[257].setRotationPoint(-33.25F, -6F, -4F);

		bodyModel[258].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[258].setRotationPoint(19F, -7F, -4F);

		bodyModel[259].addShapeBox(0F, 0F, 0F, 1, 7, 3, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[259].setRotationPoint(20F, -6F, -4F);

		bodyModel[260].addBox(0F, 0F, 0F, 4, 1, 14, 0F); // upper bed
		bodyModel[260].setRotationPoint(-11F, -17F, -9F);

		bodyModel[261].addBox(0F, -0.5F, -13.5F, 4, 1, 15, 0F); // lower rotating bed
		bodyModel[261].setRotationPoint(-11F, -2.5F, 3.5F);
		bodyModel[261].rotateAngleX = -1.57079633F;

		bodyModel[262].addBox(0F, 0F, 0F, 7, 3, 1, 0F); // Box 38
		bodyModel[262].setRotationPoint(-14F, -2F, -10F);

		bodyModel[263].addShapeBox(0F, 0F, 0F, 4, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // upper bed
		bodyModel[263].setRotationPoint(-11F, -17.5F, -9F);

		bodyModel[264].addShapeBox(0F, -1F, -13.5F, 4, 1, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // lower rotating bed
		bodyModel[264].setRotationPoint(-11F, -2.5F, 3.5F);
		bodyModel[264].rotateAngleX = -1.57079633F;

		bodyModel[265].addBox(0F, -5F, 0F, 0, 5, 1, 0F); // upper bed cable front
		bodyModel[265].setRotationPoint(-11.01F, -17.5F, -8F);
		bodyModel[265].rotateAngleZ = -1.57079633F;

		bodyModel[266].addBox(0F, -5F, 0F, 0, 5, 1, 0F); // upper bed cable rear
		bodyModel[266].setRotationPoint(-7.01F, -17.51F, -8F);
		bodyModel[266].rotateAngleZ = 1.57079633F;

		bodyModel[267].addBox(0F, -5F, 0F, 0, 5, 1, 0F); // upper bed cable front
		bodyModel[267].setRotationPoint(-11.01F, -17.5F, 4F);
		bodyModel[267].rotateAngleZ = -1.57079633F;

		bodyModel[268].addBox(0F, -5F, 0F, 0, 5, 1, 0F); // upper bed cable rear
		bodyModel[268].setRotationPoint(-7.01F, -17.51F, 4F);
		bodyModel[268].rotateAngleZ = 1.57079633F;

		bodyModel[269].addBox(0F, 0F, 0F, 4, 1, 14, 0F); // upper bed
		bodyModel[269].setRotationPoint(-24F, -17F, -9F);

		bodyModel[270].addBox(0F, -0.5F, -13.5F, 4, 1, 15, 0F); // lower rotating bed
		bodyModel[270].setRotationPoint(-24F, -2.5F, 3.5F);
		bodyModel[270].rotateAngleX = -1.57079633F;

		bodyModel[271].addBox(0F, 0F, 0F, 7, 3, 1, 0F); // Box 38
		bodyModel[271].setRotationPoint(-24F, -2F, -10F);

		bodyModel[272].addShapeBox(0F, 0F, 0F, 4, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // upper bed
		bodyModel[272].setRotationPoint(-24F, -17.5F, -9F);

		bodyModel[273].addShapeBox(0F, -1F, -13.5F, 4, 1, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // lower rotating bed
		bodyModel[273].setRotationPoint(-24F, -2.5F, 3.5F);
		bodyModel[273].rotateAngleX = -1.57079633F;

		bodyModel[274].addBox(0F, -5F, 0F, 0, 5, 1, 0F); // upper bed cable front
		bodyModel[274].setRotationPoint(-23.99F, -17.5F, -8F);
		bodyModel[274].rotateAngleZ = -1.57079633F;

		bodyModel[275].addBox(0F, -5F, 0F, 0, 5, 1, 0F); // upper bed cable rear
		bodyModel[275].setRotationPoint(-19.99F, -17.51F, -8F);
		bodyModel[275].rotateAngleZ = 1.57079633F;

		bodyModel[276].addBox(0F, -5F, 0F, 0, 5, 1, 0F); // upper bed cable front
		bodyModel[276].setRotationPoint(-23.99F, -17.5F, 4F);
		bodyModel[276].rotateAngleZ = -1.57079633F;

		bodyModel[277].addBox(0F, -5F, 0F, 0, 5, 1, 0F); // upper bed cable rear
		bodyModel[277].setRotationPoint(-19.99F, -17.51F, 4F);
		bodyModel[277].rotateAngleZ = 1.57079633F;

		bodyModel[278].addBox(0F, 0F, 0F, 0, 15, 1, 0F); // Box 38
		bodyModel[278].setRotationPoint(-11.02F, -16F, 4F);

		bodyModel[279].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[279].setRotationPoint(-11.02F, -4F, 3F);

		bodyModel[280].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[280].setRotationPoint(-11F, -1F, 3F);

		bodyModel[281].addBox(0F, 0F, 0F, 0, 15, 1, 0F); // Box 38
		bodyModel[281].setRotationPoint(-19.99F, -16F, 4F);

		bodyModel[282].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[282].setRotationPoint(-19.99F, -4F, 3F);

		bodyModel[283].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[283].setRotationPoint(-24F, -1F, 3F);

		bodyModel[284].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // seat sliding part
		bodyModel[284].setRotationPoint(-12.5F, -2F, -5F);

		bodyModel[285].addShapeBox(-0.1F, -5F, 0F, 2, 1, 4, 0F,-0.35F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.35F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F); // seat backrest
		bodyModel[285].setRotationPoint(-8.5F, -2F, -5F);

		bodyModel[286].addBox(0F, 0F, 0F, 4, 3, 1, 0F); // seat sliding part cull
		bodyModel[286].setRotationPoint(-12F, -4F, -6F);

		bodyModel[287].addBox(0F, 0F, 0F, 4, 3, 1, 0F); // seat sliding part cull
		bodyModel[287].setRotationPoint(-12F, -4F, -1F);

		bodyModel[288].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[288].setRotationPoint(-12.5F, -2F, -1F);

		bodyModel[289].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[289].setRotationPoint(-12.5F, -2F, -6F);

		bodyModel[290].addShapeBox(0F, 0F, 0F, 1, 0, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[290].setRotationPoint(-12.5F, 0.99F, -5F);

		bodyModel[291].addShapeBox(0F, 0F, 0F, 1, 0, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[291].setRotationPoint(-8F, 0.99F, -5F);

		bodyModel[292].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // seat sliding part
		bodyModel[292].setRotationPoint(-8.5F, -2F, -5F);

		bodyModel[293].addShapeBox(0F, -4F, 0F, 1, 4, 4, 0F,-0.55F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, -0.55F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // seat backrest
		bodyModel[293].setRotationPoint(-8.5F, -2F, -5F);

		bodyModel[294].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // seat sliding part
		bodyModel[294].setRotationPoint(-22.5F, -2F, -5F);

		bodyModel[295].addShapeBox(-0.1F, -5F, 0F, 2, 1, 4, 0F,-0.35F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.35F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F); // seat backrest
		bodyModel[295].setRotationPoint(-18.5F, -2F, -5F);

		bodyModel[296].addBox(0F, 0F, 0F, 4, 3, 1, 0F); // seat sliding part cull
		bodyModel[296].setRotationPoint(-22F, -4F, -6F);

		bodyModel[297].addBox(0F, 0F, 0F, 4, 3, 1, 0F); // seat sliding part cull
		bodyModel[297].setRotationPoint(-22F, -4F, -1F);

		bodyModel[298].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[298].setRotationPoint(-22.5F, -2F, -1F);

		bodyModel[299].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[299].setRotationPoint(-22.5F, -2F, -6F);

		bodyModel[300].addShapeBox(0F, 0F, 0F, 1, 0, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[300].setRotationPoint(-22.5F, 0.99F, -5F);

		bodyModel[301].addShapeBox(0F, 0F, 0F, 1, 0, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[301].setRotationPoint(-18F, 0.99F, -5F);

		bodyModel[302].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // seat sliding part
		bodyModel[302].setRotationPoint(-18.5F, -2F, -5F);

		bodyModel[303].addShapeBox(0F, -4F, 0F, 1, 4, 4, 0F,-0.55F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, -0.55F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // seat backrest
		bodyModel[303].setRotationPoint(-18.5F, -2F, -5F);

		bodyModel[304].addBox(0F, 0F, 0F, 4, 1, 14, 0F); // upper bed
		bodyModel[304].setRotationPoint(7F, -17F, -9F);

		bodyModel[305].addBox(0F, -0.5F, -13.5F, 4, 1, 15, 0F); // lower rotating bed
		bodyModel[305].setRotationPoint(7F, -2.5F, 3.5F);
		bodyModel[305].rotateAngleX = -1.57079633F;

		bodyModel[306].addBox(0F, 0F, 0F, 7, 3, 1, 0F); // Box 38
		bodyModel[306].setRotationPoint(4F, -2F, -10F);

		bodyModel[307].addShapeBox(0F, 0F, 0F, 4, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // upper bed
		bodyModel[307].setRotationPoint(7F, -17.5F, -9F);

		bodyModel[308].addShapeBox(0F, -1F, -13.5F, 4, 1, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // lower rotating bed
		bodyModel[308].setRotationPoint(7F, -2.5F, 3.5F);
		bodyModel[308].rotateAngleX = -1.57079633F;

		bodyModel[309].addBox(0F, -5F, 0F, 0, 5, 1, 0F); // upper bed cable front
		bodyModel[309].setRotationPoint(6.99F, -17.5F, -8F);
		bodyModel[309].rotateAngleZ = -1.57079633F;

		bodyModel[310].addBox(0F, -5F, 0F, 0, 5, 1, 0F); // upper bed cable rear
		bodyModel[310].setRotationPoint(10.99F, -17.51F, -8F);
		bodyModel[310].rotateAngleZ = 1.57079633F;

		bodyModel[311].addBox(0F, -5F, 0F, 0, 5, 1, 0F); // upper bed cable front
		bodyModel[311].setRotationPoint(6.99F, -17.5F, 4F);
		bodyModel[311].rotateAngleZ = -1.57079633F;

		bodyModel[312].addBox(0F, -5F, 0F, 0, 5, 1, 0F); // upper bed cable rear
		bodyModel[312].setRotationPoint(10.99F, -17.51F, 4F);
		bodyModel[312].rotateAngleZ = 1.57079633F;

		bodyModel[313].addBox(0F, 0F, 0F, 0, 15, 1, 0F); // Box 38
		bodyModel[313].setRotationPoint(6.98F, -16F, 4F);

		bodyModel[314].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[314].setRotationPoint(6.98F, -4F, 3F);

		bodyModel[315].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[315].setRotationPoint(7F, -1F, 3F);

		bodyModel[316].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // seat sliding part
		bodyModel[316].setRotationPoint(5.5F, -2F, -5F);

		bodyModel[317].addShapeBox(-0.1F, -5F, 0F, 2, 1, 4, 0F,-0.35F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.35F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F); // seat backrest
		bodyModel[317].setRotationPoint(9.5F, -2F, -5F);

		bodyModel[318].addBox(0F, 0F, 0F, 4, 3, 1, 0F); // seat sliding part cull
		bodyModel[318].setRotationPoint(6F, -4F, -6F);

		bodyModel[319].addBox(0F, 0F, 0F, 4, 3, 1, 0F); // seat sliding part cull
		bodyModel[319].setRotationPoint(6F, -4F, -1F);

		bodyModel[320].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[320].setRotationPoint(5.5F, -2F, -1F);

		bodyModel[321].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[321].setRotationPoint(5.5F, -2F, -6F);

		bodyModel[322].addShapeBox(0F, 0F, 0F, 1, 0, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[322].setRotationPoint(5.5F, 0.99F, -5F);

		bodyModel[323].addShapeBox(0F, 0F, 0F, 1, 0, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[323].setRotationPoint(10F, 0.99F, -5F);

		bodyModel[324].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // seat sliding part
		bodyModel[324].setRotationPoint(9.5F, -2F, -5F);

		bodyModel[325].addShapeBox(0F, -4F, 0F, 1, 4, 4, 0F,-0.55F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, -0.55F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // seat backrest
		bodyModel[325].setRotationPoint(9.5F, -2F, -5F);

		bodyModel[326].addBox(0F, 0F, 0F, 4, 1, 14, 0F); // upper bed
		bodyModel[326].setRotationPoint(-29F, -17F, -9F);

		bodyModel[327].addBox(0F, -0.5F, -13.5F, 4, 1, 15, 0F); // lower rotating bed
		bodyModel[327].setRotationPoint(-29F, -2.5F, 3.5F);
		bodyModel[327].rotateAngleX = -1.57079633F;

		bodyModel[328].addBox(0F, 0F, 0F, 7, 3, 1, 0F); // Box 38
		bodyModel[328].setRotationPoint(-32F, -2F, -10F);

		bodyModel[329].addShapeBox(0F, 0F, 0F, 4, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // upper bed
		bodyModel[329].setRotationPoint(-29F, -17.5F, -9F);

		bodyModel[330].addShapeBox(0F, -1F, -13.5F, 4, 1, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // lower rotating bed
		bodyModel[330].setRotationPoint(-29F, -2.5F, 3.5F);
		bodyModel[330].rotateAngleX = -1.57079633F;

		bodyModel[331].addBox(0F, -5F, 0F, 0, 5, 1, 0F); // upper bed cable front
		bodyModel[331].setRotationPoint(-29.01F, -17.5F, -8F);
		bodyModel[331].rotateAngleZ = -1.57079633F;

		bodyModel[332].addBox(0F, -5F, 0F, 0, 5, 1, 0F); // upper bed cable rear
		bodyModel[332].setRotationPoint(-25.01F, -17.51F, -8F);
		bodyModel[332].rotateAngleZ = 1.57079633F;

		bodyModel[333].addBox(0F, -5F, 0F, 0, 5, 1, 0F); // upper bed cable front
		bodyModel[333].setRotationPoint(-29.01F, -17.5F, 4F);
		bodyModel[333].rotateAngleZ = -1.57079633F;

		bodyModel[334].addBox(0F, -5F, 0F, 0, 5, 1, 0F); // upper bed cable rear
		bodyModel[334].setRotationPoint(-25.01F, -17.51F, 4F);
		bodyModel[334].rotateAngleZ = 1.57079633F;

		bodyModel[335].addBox(0F, 0F, 0F, 0, 15, 1, 0F); // Box 38
		bodyModel[335].setRotationPoint(-29.02F, -16F, 4F);

		bodyModel[336].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[336].setRotationPoint(-29.02F, -4F, 3F);

		bodyModel[337].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[337].setRotationPoint(-29F, -1F, 3F);

		bodyModel[338].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // seat sliding part
		bodyModel[338].setRotationPoint(-30.5F, -2F, -5F);

		bodyModel[339].addShapeBox(-0.1F, -5F, 0F, 2, 1, 4, 0F,-0.35F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.35F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F); // seat backrest
		bodyModel[339].setRotationPoint(-26.5F, -2F, -5F);

		bodyModel[340].addBox(0F, 0F, 0F, 4, 3, 1, 0F); // seat sliding part cull
		bodyModel[340].setRotationPoint(-30F, -4F, -6F);

		bodyModel[341].addBox(0F, 0F, 0F, 4, 3, 1, 0F); // seat sliding part cull
		bodyModel[341].setRotationPoint(-30F, -4F, -1F);

		bodyModel[342].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[342].setRotationPoint(-30.5F, -2F, -1F);

		bodyModel[343].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[343].setRotationPoint(-30.5F, -2F, -6F);

		bodyModel[344].addShapeBox(0F, 0F, 0F, 1, 0, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[344].setRotationPoint(-30.5F, 0.99F, -5F);

		bodyModel[345].addShapeBox(0F, 0F, 0F, 1, 0, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[345].setRotationPoint(-26F, 0.99F, -5F);

		bodyModel[346].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // seat sliding part
		bodyModel[346].setRotationPoint(-26.5F, -2F, -5F);

		bodyModel[347].addShapeBox(0F, -4F, 0F, 1, 4, 4, 0F,-0.55F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, -0.55F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // seat backrest
		bodyModel[347].setRotationPoint(-26.5F, -2F, -5F);

		bodyModel[348].addBox(0F, 0F, 0F, 4, 1, 14, 0F); // upper bed
		bodyModel[348].setRotationPoint(-6F, -17F, -9F);

		bodyModel[349].addBox(0F, -0.5F, -13.5F, 4, 1, 15, 0F); // lower rotating bed
		bodyModel[349].setRotationPoint(-6F, -2.5F, 3.5F);
		bodyModel[349].rotateAngleX = -1.57079633F;

		bodyModel[350].addShapeBox(0F, 0F, 0F, 4, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // upper bed
		bodyModel[350].setRotationPoint(-6F, -17.5F, -9F);

		bodyModel[351].addShapeBox(0F, -1F, -13.5F, 4, 1, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // lower rotating bed
		bodyModel[351].setRotationPoint(-6F, -2.5F, 3.5F);
		bodyModel[351].rotateAngleX = -1.57079633F;

		bodyModel[352].addBox(0F, -5F, 0F, 0, 5, 1, 0F); // upper bed cable front
		bodyModel[352].setRotationPoint(-5.99F, -17.5F, -8F);
		bodyModel[352].rotateAngleZ = -1.57079633F;

		bodyModel[353].addBox(0F, -5F, 0F, 0, 5, 1, 0F); // upper bed cable rear
		bodyModel[353].setRotationPoint(-1.99F, -17.51F, -8F);
		bodyModel[353].rotateAngleZ = 1.57079633F;

		bodyModel[354].addBox(0F, -5F, 0F, 0, 5, 1, 0F); // upper bed cable front
		bodyModel[354].setRotationPoint(-5.99F, -17.5F, 4F);
		bodyModel[354].rotateAngleZ = -1.57079633F;

		bodyModel[355].addBox(0F, -5F, 0F, 0, 5, 1, 0F); // upper bed cable rear
		bodyModel[355].setRotationPoint(-1.99F, -17.51F, 4F);
		bodyModel[355].rotateAngleZ = 1.57079633F;

		bodyModel[356].addBox(0F, 0F, 0F, 0, 15, 1, 0F); // Box 38
		bodyModel[356].setRotationPoint(-1.99F, -16F, 4F);

		bodyModel[357].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[357].setRotationPoint(-1.99F, -4F, 3F);

		bodyModel[358].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[358].setRotationPoint(-6F, -1F, 3F);

		bodyModel[359].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // seat sliding part
		bodyModel[359].setRotationPoint(-4.5F, -2F, -5F);

		bodyModel[360].addShapeBox(-0.1F, -5F, 0F, 2, 1, 4, 0F,-0.35F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.35F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F); // seat backrest
		bodyModel[360].setRotationPoint(-0.5F, -2F, -5F);

		bodyModel[361].addBox(0F, 0F, 0F, 4, 3, 1, 0F); // seat sliding part cull
		bodyModel[361].setRotationPoint(-4F, -4F, -6F);

		bodyModel[362].addBox(0F, 0F, 0F, 4, 3, 1, 0F); // seat sliding part cull
		bodyModel[362].setRotationPoint(-4F, -4F, -1F);

		bodyModel[363].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[363].setRotationPoint(-4.5F, -2F, -1F);

		bodyModel[364].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[364].setRotationPoint(-4.5F, -2F, -6F);

		bodyModel[365].addShapeBox(0F, 0F, 0F, 1, 0, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[365].setRotationPoint(-4.5F, 0.99F, -5F);

		bodyModel[366].addShapeBox(0F, 0F, 0F, 1, 0, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[366].setRotationPoint(0F, 0.99F, -5F);

		bodyModel[367].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // seat sliding part
		bodyModel[367].setRotationPoint(-0.5F, -2F, -5F);

		bodyModel[368].addShapeBox(0F, -4F, 0F, 1, 4, 4, 0F,-0.55F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, -0.55F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // seat backrest
		bodyModel[368].setRotationPoint(-0.5F, -2F, -5F);

		bodyModel[369].addBox(0F, 0F, 0F, 4, 1, 14, 0F); // upper bed
		bodyModel[369].setRotationPoint(12F, -17F, -9F);

		bodyModel[370].addBox(0F, -0.5F, -13.5F, 4, 1, 15, 0F); // lower rotating bed
		bodyModel[370].setRotationPoint(12F, -2.5F, 3.5F);
		bodyModel[370].rotateAngleX = -1.57079633F;

		bodyModel[371].addShapeBox(0F, 0F, 0F, 4, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // upper bed
		bodyModel[371].setRotationPoint(12F, -17.5F, -9F);

		bodyModel[372].addShapeBox(0F, -1F, -13.5F, 4, 1, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // lower rotating bed
		bodyModel[372].setRotationPoint(12F, -2.5F, 3.5F);
		bodyModel[372].rotateAngleX = -1.57079633F;

		bodyModel[373].addBox(0F, -5F, 0F, 0, 5, 1, 0F); // upper bed cable front
		bodyModel[373].setRotationPoint(12.01F, -17.5F, -8F);
		bodyModel[373].rotateAngleZ = -1.57079633F;

		bodyModel[374].addBox(0F, -5F, 0F, 0, 5, 1, 0F); // upper bed cable rear
		bodyModel[374].setRotationPoint(16.01F, -17.51F, -8F);
		bodyModel[374].rotateAngleZ = 1.57079633F;

		bodyModel[375].addBox(0F, -5F, 0F, 0, 5, 1, 0F); // upper bed cable front
		bodyModel[375].setRotationPoint(12.01F, -17.5F, 4F);
		bodyModel[375].rotateAngleZ = -1.57079633F;

		bodyModel[376].addBox(0F, -5F, 0F, 0, 5, 1, 0F); // upper bed cable rear
		bodyModel[376].setRotationPoint(16.01F, -17.51F, 4F);
		bodyModel[376].rotateAngleZ = 1.57079633F;

		bodyModel[377].addBox(0F, 0F, 0F, 0, 15, 1, 0F); // Box 38
		bodyModel[377].setRotationPoint(16.01F, -16F, 4F);

		bodyModel[378].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[378].setRotationPoint(16.01F, -4F, 3F);

		bodyModel[379].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[379].setRotationPoint(12F, -1F, 3F);

		bodyModel[380].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // seat sliding part
		bodyModel[380].setRotationPoint(13.5F, -2F, -5F);

		bodyModel[381].addShapeBox(-0.1F, -5F, 0F, 2, 1, 4, 0F,-0.35F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.35F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F); // seat backrest
		bodyModel[381].setRotationPoint(17.5F, -2F, -5F);

		bodyModel[382].addBox(0F, 0F, 0F, 4, 3, 1, 0F); // seat sliding part cull
		bodyModel[382].setRotationPoint(14F, -4F, -6F);

		bodyModel[383].addBox(0F, 0F, 0F, 4, 3, 1, 0F); // seat sliding part cull
		bodyModel[383].setRotationPoint(14F, -4F, -1F);

		bodyModel[384].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[384].setRotationPoint(13.5F, -2F, -1F);

		bodyModel[385].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[385].setRotationPoint(13.5F, -2F, -6F);

		bodyModel[386].addShapeBox(0F, 0F, 0F, 1, 0, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[386].setRotationPoint(13.5F, 0.99F, -5F);

		bodyModel[387].addShapeBox(0F, 0F, 0F, 1, 0, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[387].setRotationPoint(18F, 0.99F, -5F);

		bodyModel[388].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // seat sliding part
		bodyModel[388].setRotationPoint(17.5F, -2F, -5F);

		bodyModel[389].addShapeBox(0F, -4F, 0F, 1, 4, 4, 0F,-0.55F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, -0.55F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // seat backrest
		bodyModel[389].setRotationPoint(17.5F, -2F, -5F);

		bodyModel[390].addBox(0F, 0F, 0F, 2, 7, 1, 0F); // Box 38
		bodyModel[390].setRotationPoint(-54F, -6F, -5F);

		bodyModel[391].addShapeBox(0F, 0F, 0F, 2, 7, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[391].setRotationPoint(-54F, -6F, -6F);

		bodyModel[392].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F); // Box 38
		bodyModel[392].setRotationPoint(-54.5F, -2F, -9F);

		bodyModel[393].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[393].setRotationPoint(-54.5F, -3F, -10F);

		bodyModel[394].addShapeBox(0F, 0F, 0F, 3, 1, 6, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[394].setRotationPoint(-54F, -13F, -10F);

		bodyModel[395].addShapeBox(-0.5F, -0.5F, 0F, 9, 1, 4, 0F,-0.01F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, -0.01F, -0.01F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F); // roomette bed rear
		bodyModel[395].setRotationPoint(-60.5F, -3.5F, -10F);
		bodyModel[395].rotateAngleZ = 1.57079633F;

		bodyModel[396].addBox(0F, 0F, 0F, 1, 16, 2, 0F); // Box 128
		bodyModel[396].setRotationPoint(-61F, -15F, -5F);

		bodyModel[397].addShapeBox(0F, 0F, 0F, 1, 9, 5, 0F,0F, 0F, 0F, -0.99F, 0F, 0F, -0.99F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.99F, 0F, 0F, -0.99F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[397].setRotationPoint(-61F, -12F, -10F);

		bodyModel[398].addShapeBox(-0.5F, -0.5F, 0F, 4, 1, 1, 0F,-0.01F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, -0.01F, -0.01F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F); // roomette bed rear
		bodyModel[398].setRotationPoint(-60.5F, -3.5F, -6F);
		bodyModel[398].rotateAngleZ = 1.57079633F;

		bodyModel[399].addShapeBox(3.5F, -0.5F, 0F, 3, 1, 1, 0F,0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, -1F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // roomette bed rear
		bodyModel[399].setRotationPoint(-60.5F, -3.5F, -6F);
		bodyModel[399].rotateAngleZ = 1.57079633F;

		bodyModel[400].addBox(0F, 0F, 0F, 3, 4, 6, 0F); // Box 38
		bodyModel[400].setRotationPoint(-60F, -3F, -10F);

		bodyModel[401].addBox(0F, 0F, 0F, 1, 4, 5, 0F); // Box 128
		bodyModel[401].setRotationPoint(-61F, -3F, -10F);

		bodyModel[402].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F); // Box 128
		bodyModel[402].setRotationPoint(-61F, -12F, -6F);

		bodyModel[403].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.01F, 0F, 0F); // Box 128
		bodyModel[403].setRotationPoint(-61F, -10F, -6F);

		bodyModel[404].addBox(0F, 0F, 0F, 1, 4, 6, 0F); // Box 128
		bodyModel[404].setRotationPoint(-52F, -16F, -10F);

		bodyModel[405].addBox(0F, 0F, 0F, 2, 7, 1, 0F); // Box 38
		bodyModel[405].setRotationPoint(-45F, -6F, -5F);

		bodyModel[406].addShapeBox(0F, 0F, 0F, 2, 7, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[406].setRotationPoint(-45F, -6F, -6F);

		bodyModel[407].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F); // Box 38
		bodyModel[407].setRotationPoint(-45.5F, -2F, -9F);

		bodyModel[408].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[408].setRotationPoint(-45.5F, -3F, -10F);

		bodyModel[409].addShapeBox(0F, 0F, 0F, 3, 1, 6, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[409].setRotationPoint(-45F, -13F, -10F);

		bodyModel[410].addShapeBox(-0.5F, -0.5F, 0F, 9, 1, 4, 0F,-0.01F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, -0.01F, -0.01F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F); // roomette bed rear
		bodyModel[410].setRotationPoint(-51.5F, -3.5F, -10F);
		bodyModel[410].rotateAngleZ = 1.57079633F;

		bodyModel[411].addShapeBox(0F, 0F, 0F, 1, 9, 5, 0F,0F, 0F, 0F, -0.99F, 0F, 0F, -0.99F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.99F, 0F, 0F, -0.99F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[411].setRotationPoint(-52F, -12F, -10F);

		bodyModel[412].addShapeBox(-0.5F, -0.5F, 0F, 4, 1, 1, 0F,-0.01F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, -0.01F, -0.01F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F); // roomette bed rear
		bodyModel[412].setRotationPoint(-51.5F, -3.5F, -6F);
		bodyModel[412].rotateAngleZ = 1.57079633F;

		bodyModel[413].addShapeBox(3.5F, -0.5F, 0F, 3, 1, 1, 0F,0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, -1F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // roomette bed rear
		bodyModel[413].setRotationPoint(-51.5F, -3.5F, -6F);
		bodyModel[413].rotateAngleZ = 1.57079633F;

		bodyModel[414].addBox(0F, 0F, 0F, 3, 4, 6, 0F); // Box 38
		bodyModel[414].setRotationPoint(-51F, -3F, -10F);

		bodyModel[415].addBox(0F, 0F, 0F, 1, 4, 6, 0F); // Box 128
		bodyModel[415].setRotationPoint(-52F, -3F, -10F);

		bodyModel[416].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F); // Box 128
		bodyModel[416].setRotationPoint(-52F, -12F, -6F);

		bodyModel[417].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.01F, 0F, 0F); // Box 128
		bodyModel[417].setRotationPoint(-52F, -10F, -6F);

		bodyModel[418].addBox(0F, 0F, 0F, 1, 4, 5, 0F); // Box 128
		bodyModel[418].setRotationPoint(-34F, -16F, -10F);

		bodyModel[419].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[419].setRotationPoint(-34F, -12F, -6F);

		bodyModel[420].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[420].setRotationPoint(-34F, -10F, -6F);

		bodyModel[421].addBox(0F, 0F, 0F, 3, 4, 6, 0F); // Box 38
		bodyModel[421].setRotationPoint(-37F, -3F, -10F);

		bodyModel[422].addBox(0F, 0F, 0F, 1, 4, 5, 0F); // Box 128
		bodyModel[422].setRotationPoint(-34F, -3F, -10F);

		bodyModel[423].addShapeBox(-8.5F, -0.5F, 0F, 9, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // roomette bed front
		bodyModel[423].setRotationPoint(-33.5F, -3.5F, -10F);
		bodyModel[423].rotateAngleZ = -1.57079633F;

		bodyModel[424].addShapeBox(-3.5F, -0.5F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // roomette bed front
		bodyModel[424].setRotationPoint(-33.5F, -3.5F, -6F);
		bodyModel[424].rotateAngleZ = -1.57079633F;

		bodyModel[425].addShapeBox(-6.5F, -0.5F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // roomette bed front
		bodyModel[425].setRotationPoint(-33.5F, -3.5F, -6F);
		bodyModel[425].rotateAngleZ = -1.57079633F;

		bodyModel[426].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F); // Box 38
		bodyModel[426].setRotationPoint(-42F, -2F, -9F);

		bodyModel[427].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[427].setRotationPoint(-42F, -3F, -10F);

		bodyModel[428].addBox(0F, 0F, 0F, 2, 7, 1, 0F); // Box 38
		bodyModel[428].setRotationPoint(-42F, -6F, -5F);

		bodyModel[429].addShapeBox(0F, 0F, 0F, 2, 7, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[429].setRotationPoint(-42F, -6F, -6F);

		bodyModel[430].addShapeBox(0F, 0F, 0F, 3, 1, 6, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[430].setRotationPoint(-42F, -13F, -10F);

		bodyModel[431].addShapeBox(0F, 0F, 0F, 2, 17, 3, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[431].setRotationPoint(-35F, -16F, -3F);

		bodyModel[432].addBox(0F, 0F, 0F, 1, 4, 5, 0F); // Box 128
		bodyModel[432].setRotationPoint(-58F, -16F, 5F);

		bodyModel[433].addBox(0F, 0F, 0F, 1, 17, 1, 0F); // Box 128
		bodyModel[433].setRotationPoint(-58F, -16F, 4F);

		bodyModel[434].addBox(0F, 0F, 0F, 1, 4, 5, 0F); // Box 128
		bodyModel[434].setRotationPoint(-58F, -3F, 5F);

		bodyModel[435].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[435].setRotationPoint(-58F, -12F, 5F);

		bodyModel[436].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 128
		bodyModel[436].setRotationPoint(-58F, -10F, 5F);

		bodyModel[437].addShapeBox(-0.5F, -0.5F, 0F, 9, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // roomette bed rear
		bodyModel[437].setRotationPoint(-57.5F, -3.5F, 6F);
		bodyModel[437].rotateAngleZ = 1.57079633F;

		bodyModel[438].addShapeBox(-0.5F, -0.5F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // roomette bed rear
		bodyModel[438].setRotationPoint(-57.5F, -3.5F, 5F);
		bodyModel[438].rotateAngleZ = 1.57079633F;

		bodyModel[439].addShapeBox(3.5F, -0.5F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // roomette bed rear
		bodyModel[439].setRotationPoint(-57.5F, -3.5F, 5F);
		bodyModel[439].rotateAngleZ = 1.57079633F;

		bodyModel[440].addBox(0F, 0F, 0F, 3, 4, 6, 0F); // Box 38
		bodyModel[440].setRotationPoint(-57F, -3F, 4F);

		bodyModel[441].addBox(0F, 0F, 0F, 2, 7, 1, 0F); // Box 38
		bodyModel[441].setRotationPoint(-51F, -6F, 4F);

		bodyModel[442].addShapeBox(0F, 0F, 0F, 2, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 38
		bodyModel[442].setRotationPoint(-51F, -6F, 5F);

		bodyModel[443].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F); // Box 38
		bodyModel[443].setRotationPoint(-51.5F, -2F, 7F);

		bodyModel[444].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[444].setRotationPoint(-51.5F, -3F, 6F);

		bodyModel[445].addShapeBox(0F, 0F, 0F, 3, 1, 6, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[445].setRotationPoint(-51F, -13F, 4F);

		bodyModel[446].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[446].setRotationPoint(-49F, -12F, 4F);

		bodyModel[447].addBox(0F, 0F, 0F, 1, 4, 6, 0F); // Box 128
		bodyModel[447].setRotationPoint(-49F, -16F, 4F);

		bodyModel[448].addShapeBox(0F, 0F, 0F, 1, 9, 5, 0F,0F, 0F, 0F, -0.99F, 0F, 0F, -0.99F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.99F, 0F, 0F, -0.99F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[448].setRotationPoint(-49F, -12F, 5F);

		bodyModel[449].addBox(0F, 0F, 0F, 1, 4, 6, 0F); // Box 128
		bodyModel[449].setRotationPoint(-49F, -3F, 4F);

		bodyModel[450].addShapeBox(-0.5F, -0.5F, 0F, 9, 1, 4, 0F,-0.01F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, -0.01F, -0.01F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F); // roomette bed rear
		bodyModel[450].setRotationPoint(-48.5F, -3.5F, 6F);
		bodyModel[450].rotateAngleZ = 1.57079633F;

		bodyModel[451].addShapeBox(-0.5F, -0.5F, 0F, 4, 1, 1, 0F,-0.01F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, -0.01F, -0.01F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F); // roomette bed rear
		bodyModel[451].setRotationPoint(-48.5F, -3.5F, 5F);
		bodyModel[451].rotateAngleZ = 1.57079633F;

		bodyModel[452].addShapeBox(3.5F, -0.5F, 0F, 3, 1, 1, 0F,0F, -0.01F, 0F, 0F, -0.01F, -1F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // roomette bed rear
		bodyModel[452].setRotationPoint(-48.5F, -3.5F, 5F);
		bodyModel[452].rotateAngleZ = 1.57079633F;

		bodyModel[453].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F); // Box 128
		bodyModel[453].setRotationPoint(-49F, -12F, 5F);

		bodyModel[454].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.01F, 0F, -1F); // Box 128
		bodyModel[454].setRotationPoint(-49F, -10F, 5F);

		bodyModel[455].addBox(0F, 0F, 0F, 3, 4, 6, 0F); // Box 38
		bodyModel[455].setRotationPoint(-48F, -3F, 4F);

		bodyModel[456].addBox(0F, 0F, 0F, 2, 7, 1, 0F); // Box 38
		bodyModel[456].setRotationPoint(-42F, -6F, 4F);

		bodyModel[457].addShapeBox(0F, 0F, 0F, 2, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 38
		bodyModel[457].setRotationPoint(-42F, -6F, 5F);

		bodyModel[458].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F); // Box 38
		bodyModel[458].setRotationPoint(-42.5F, -2F, 7F);

		bodyModel[459].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[459].setRotationPoint(-42.5F, -3F, 6F);

		bodyModel[460].addShapeBox(0F, 0F, 0F, 3, 1, 6, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[460].setRotationPoint(-42F, -13F, 4F);

		bodyModel[461].addBox(0F, 0F, 0F, 1, 4, 6, 0F); // Box 128
		bodyModel[461].setRotationPoint(20F, -16F, -10F);

		bodyModel[462].addBox(0F, 0F, 0F, 2, 7, 1, 0F); // Box 38
		bodyModel[462].setRotationPoint(27F, -6F, -5F);

		bodyModel[463].addShapeBox(0F, 0F, 0F, 2, 7, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[463].setRotationPoint(27F, -6F, -6F);

		bodyModel[464].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F); // Box 38
		bodyModel[464].setRotationPoint(26.5F, -2F, -9F);

		bodyModel[465].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[465].setRotationPoint(26.5F, -3F, -10F);

		bodyModel[466].addShapeBox(0F, 0F, 0F, 3, 1, 6, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[466].setRotationPoint(27F, -13F, -10F);

		bodyModel[467].addShapeBox(-0.5F, -0.5F, 0F, 9, 1, 4, 0F,-0.01F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, -0.01F, -0.01F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F); // roomette bed rear
		bodyModel[467].setRotationPoint(20.5F, -3.5F, -10F);
		bodyModel[467].rotateAngleZ = 1.57079633F;

		bodyModel[468].addShapeBox(-0.5F, -0.5F, 0F, 4, 1, 1, 0F,-0.01F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, -0.01F, -0.01F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F); // roomette bed rear
		bodyModel[468].setRotationPoint(20.5F, -3.5F, -6F);
		bodyModel[468].rotateAngleZ = 1.57079633F;

		bodyModel[469].addShapeBox(3.5F, -0.5F, 0F, 3, 1, 1, 0F,0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, -1F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // roomette bed rear
		bodyModel[469].setRotationPoint(20.5F, -3.5F, -6F);
		bodyModel[469].rotateAngleZ = 1.57079633F;

		bodyModel[470].addBox(0F, 0F, 0F, 3, 4, 6, 0F); // Box 38
		bodyModel[470].setRotationPoint(21F, -3F, -10F);

		bodyModel[471].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F); // Box 128
		bodyModel[471].setRotationPoint(20F, -12F, -6F);

		bodyModel[472].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.01F, 0F, 0F); // Box 128
		bodyModel[472].setRotationPoint(20F, -10F, -6F);

		bodyModel[473].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[473].setRotationPoint(20.25F, -12F, -5F);

		bodyModel[474].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[474].setRotationPoint(29F, -12F, -5F);

		bodyModel[475].addBox(0F, 0F, 0F, 1, 4, 6, 0F); // Box 128
		bodyModel[475].setRotationPoint(29F, -16F, -10F);

		bodyModel[476].addBox(0F, 0F, 0F, 2, 7, 1, 0F); // Box 38
		bodyModel[476].setRotationPoint(36F, -6F, -5F);

		bodyModel[477].addShapeBox(0F, 0F, 0F, 2, 7, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[477].setRotationPoint(36F, -6F, -6F);

		bodyModel[478].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F); // Box 38
		bodyModel[478].setRotationPoint(35.5F, -2F, -9F);

		bodyModel[479].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[479].setRotationPoint(35.5F, -3F, -10F);

		bodyModel[480].addShapeBox(0F, 0F, 0F, 3, 1, 6, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[480].setRotationPoint(36F, -13F, -10F);

		bodyModel[481].addShapeBox(-0.5F, -0.5F, 0F, 9, 1, 4, 0F,-0.01F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, -0.01F, -0.01F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F); // roomette bed rear
		bodyModel[481].setRotationPoint(29.5F, -3.5F, -10F);
		bodyModel[481].rotateAngleZ = 1.57079633F;

		bodyModel[482].addShapeBox(0F, 0F, 0F, 1, 9, 5, 0F,0F, 0F, 0F, -0.99F, 0F, 0F, -0.99F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.99F, 0F, 0F, -0.99F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[482].setRotationPoint(29F, -12F, -10F);

		bodyModel[483].addShapeBox(-0.5F, -0.5F, 0F, 4, 1, 1, 0F,-0.01F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, -0.01F, -0.01F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F); // roomette bed rear
		bodyModel[483].setRotationPoint(29.5F, -3.5F, -6F);
		bodyModel[483].rotateAngleZ = 1.57079633F;

		bodyModel[484].addShapeBox(3.5F, -0.5F, 0F, 3, 1, 1, 0F,0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, -1F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // roomette bed rear
		bodyModel[484].setRotationPoint(29.5F, -3.5F, -6F);
		bodyModel[484].rotateAngleZ = 1.57079633F;

		bodyModel[485].addBox(0F, 0F, 0F, 3, 4, 6, 0F); // Box 38
		bodyModel[485].setRotationPoint(30F, -3F, -10F);

		bodyModel[486].addBox(0F, 0F, 0F, 1, 4, 6, 0F); // Box 128
		bodyModel[486].setRotationPoint(29F, -3F, -10F);

		bodyModel[487].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F); // Box 128
		bodyModel[487].setRotationPoint(29F, -12F, -6F);

		bodyModel[488].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.01F, 0F, 0F); // Box 128
		bodyModel[488].setRotationPoint(29F, -10F, -6F);

		bodyModel[489].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[489].setRotationPoint(38F, -12F, -5F);

		bodyModel[490].addBox(0F, 0F, 0F, 1, 4, 6, 0F); // Box 128
		bodyModel[490].setRotationPoint(38F, -16F, -10F);

		bodyModel[491].addBox(0F, 0F, 0F, 2, 7, 1, 0F); // Box 38
		bodyModel[491].setRotationPoint(45F, -6F, -5F);

		bodyModel[492].addShapeBox(0F, 0F, 0F, 2, 7, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[492].setRotationPoint(45F, -6F, -6F);

		bodyModel[493].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F); // Box 38
		bodyModel[493].setRotationPoint(44.5F, -2F, -9F);

		bodyModel[494].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[494].setRotationPoint(44.5F, -3F, -10F);

		bodyModel[495].addShapeBox(0F, 0F, 0F, 3, 1, 6, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[495].setRotationPoint(45F, -13F, -10F);

		bodyModel[496].addShapeBox(-0.5F, -0.5F, 0F, 9, 1, 4, 0F,-0.01F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, -0.01F, -0.01F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F); // roomette bed rear
		bodyModel[496].setRotationPoint(38.5F, -3.5F, -10F);
		bodyModel[496].rotateAngleZ = 1.57079633F;

		bodyModel[497].addShapeBox(0F, 0F, 0F, 1, 9, 5, 0F,0F, 0F, 0F, -0.99F, 0F, 0F, -0.99F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.99F, 0F, 0F, -0.99F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[497].setRotationPoint(38F, -12F, -10F);

		bodyModel[498].addShapeBox(-0.5F, -0.5F, 0F, 4, 1, 1, 0F,-0.01F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, -0.01F, -0.01F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F); // roomette bed rear
		bodyModel[498].setRotationPoint(38.5F, -3.5F, -6F);
		bodyModel[498].rotateAngleZ = 1.57079633F;

		bodyModel[499].addShapeBox(3.5F, -0.5F, 0F, 3, 1, 1, 0F,0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, -1F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // roomette bed rear
		bodyModel[499].setRotationPoint(38.5F, -3.5F, -6F);
		bodyModel[499].rotateAngleZ = 1.57079633F;
	}

	private void initbodyModel_2()
	{
		bodyModel[500] = new ModelRendererTurbo(this, 184, 367, textureX, textureY); // Box 38
		bodyModel[501] = new ModelRendererTurbo(this, 169, 370, textureX, textureY); // Box 128
		bodyModel[502] = new ModelRendererTurbo(this, 158, 364, textureX, textureY); // Box 128
		bodyModel[503] = new ModelRendererTurbo(this, 158, 368, textureX, textureY); // Box 128
		bodyModel[504] = new ModelRendererTurbo(this, 14, 338, textureX, textureY); // Box 38
		bodyModel[505] = new ModelRendererTurbo(this, 19, 323, textureX, textureY); // Box 128
		bodyModel[506] = new ModelRendererTurbo(this, 30, 340, textureX, textureY); // Box 128
		bodyModel[507] = new ModelRendererTurbo(this, 24, 334, textureX, textureY); // roomette bed rear
		bodyModel[508] = new ModelRendererTurbo(this, 19, 346, textureX, textureY); // roomette bed rear
		bodyModel[509] = new ModelRendererTurbo(this, 19, 343, textureX, textureY); // roomette bed rear
		bodyModel[510] = new ModelRendererTurbo(this, 19, 334, textureX, textureY); // Box 128
		bodyModel[511] = new ModelRendererTurbo(this, 19, 338, textureX, textureY); // Box 128
		bodyModel[512] = new ModelRendererTurbo(this, 45, 337, textureX, textureY); // Box 38
		bodyModel[513] = new ModelRendererTurbo(this, 67, 330, textureX, textureY); // Box 38
		bodyModel[514] = new ModelRendererTurbo(this, 60, 333, textureX, textureY); // Box 38
		bodyModel[515] = new ModelRendererTurbo(this, 34, 328, textureX, textureY); // Box 38
		bodyModel[516] = new ModelRendererTurbo(this, 47, 328, textureX, textureY); // Box 38
		bodyModel[517] = new ModelRendererTurbo(this, 58, 342, textureX, textureY); // Box 38
		bodyModel[518] = new ModelRendererTurbo(this, 90, 338, textureX, textureY); // Box 38
		bodyModel[519] = new ModelRendererTurbo(this, 95, 323, textureX, textureY); // Box 128
		bodyModel[520] = new ModelRendererTurbo(this, 106, 340, textureX, textureY); // Box 128
		bodyModel[521] = new ModelRendererTurbo(this, 100, 334, textureX, textureY); // roomette bed rear
		bodyModel[522] = new ModelRendererTurbo(this, 95, 346, textureX, textureY); // roomette bed rear
		bodyModel[523] = new ModelRendererTurbo(this, 95, 343, textureX, textureY); // roomette bed rear
		bodyModel[524] = new ModelRendererTurbo(this, 95, 334, textureX, textureY); // Box 128
		bodyModel[525] = new ModelRendererTurbo(this, 95, 338, textureX, textureY); // Box 128
		bodyModel[526] = new ModelRendererTurbo(this, 121, 337, textureX, textureY); // Box 38
		bodyModel[527] = new ModelRendererTurbo(this, 143, 330, textureX, textureY); // Box 38
		bodyModel[528] = new ModelRendererTurbo(this, 136, 333, textureX, textureY); // Box 38
		bodyModel[529] = new ModelRendererTurbo(this, 110, 328, textureX, textureY); // Box 38
		bodyModel[530] = new ModelRendererTurbo(this, 123, 328, textureX, textureY); // Box 38
		bodyModel[531] = new ModelRendererTurbo(this, 134, 342, textureX, textureY); // Box 38
		bodyModel[532] = new ModelRendererTurbo(this, 1, 333, textureX, textureY); // Box 128
		bodyModel[533] = new ModelRendererTurbo(this, 77, 333, textureX, textureY); // Box 128
		bodyModel[534] = new ModelRendererTurbo(this, 212, 327, textureX, textureY); // Box 38
		bodyModel[535] = new ModelRendererTurbo(this, 184, 423, textureX, textureY); // Box 38
		bodyModel[536] = new ModelRendererTurbo(this, 1, 420, textureX, textureY); // Box 38
		bodyModel[537] = new ModelRendererTurbo(this, 84, 420, textureX, textureY); // Box 38
		bodyModel[538] = new ModelRendererTurbo(this, 318, 212, textureX, textureY); // Box 38
		bodyModel[539] = new ModelRendererTurbo(this, 316, 272, textureX, textureY); // Box 38
		bodyModel[540] = new ModelRendererTurbo(this, 90, 428, textureX, textureY); // Box 38
		bodyModel[541] = new ModelRendererTurbo(this, 137, 428, textureX, textureY); // Box 38
		bodyModel[542] = new ModelRendererTurbo(this, 1, 314, textureX, textureY); // Box 38
		bodyModel[543] = new ModelRendererTurbo(this, 87, 401, textureX, textureY); // Box 38
		bodyModel[544] = new ModelRendererTurbo(this, 189, 314, textureX, textureY); // Box 38
		bodyModel[545] = new ModelRendererTurbo(this, 1, 401, textureX, textureY); // Box 38
		bodyModel[546] = new ModelRendererTurbo(this, 178, 401, textureX, textureY); // Box 38
		bodyModel[547] = new ModelRendererTurbo(this, 4, 398, textureX, textureY); // Box 38
		bodyModel[548] = new ModelRendererTurbo(this, 4, 417, textureX, textureY); // Box 38
		bodyModel[549] = new ModelRendererTurbo(this, 191, 417, textureX, textureY); // Box 38
		bodyModel[550] = new ModelRendererTurbo(this, 365, 87, textureX, textureY); // Box 38
		bodyModel[551] = new ModelRendererTurbo(this, 373, 103, textureX, textureY); // Box 128
		bodyModel[552] = new ModelRendererTurbo(this, 372, 97, textureX, textureY); // Box 128
		bodyModel[553] = new ModelRendererTurbo(this, 371, 91, textureX, textureY); // Box 128
		bodyModel[554] = new ModelRendererTurbo(this, 369, 83, textureX, textureY); // Box 128
		bodyModel[555] = new ModelRendererTurbo(this, 365, 67, textureX, textureY); // Box 248
		bodyModel[556] = new ModelRendererTurbo(this, 373, 67, textureX, textureY); // Box 250
		bodyModel[557] = new ModelRendererTurbo(this, 372, 72, textureX, textureY); // Box 252
		bodyModel[558] = new ModelRendererTurbo(this, 371, 77, textureX, textureY); // Box 254
		bodyModel[559] = new ModelRendererTurbo(this, 389, 59, textureX, textureY); // Box 128
		bodyModel[560] = new ModelRendererTurbo(this, 389, 98, textureX, textureY); // Box 128
		bodyModel[561] = new ModelRendererTurbo(this, 402, 89, textureX, textureY); // Box 128
		bodyModel[562] = new ModelRendererTurbo(this, 402, 69, textureX, textureY); // Box 128
		bodyModel[563] = new ModelRendererTurbo(this, 370, 86, textureX, textureY); // Box 38
		bodyModel[564] = new ModelRendererTurbo(this, 384, 102, textureX, textureY); // Box 128
		bodyModel[565] = new ModelRendererTurbo(this, 413, 67, textureX, textureY); // Box 128
		bodyModel[566] = new ModelRendererTurbo(this, 383, 96, textureX, textureY); // Box 128
		bodyModel[567] = new ModelRendererTurbo(this, 382, 90, textureX, textureY); // Box 128
		bodyModel[568] = new ModelRendererTurbo(this, 380, 82, textureX, textureY); // Box 128
		bodyModel[569] = new ModelRendererTurbo(this, 426, 69, textureX, textureY); // Box 128
		bodyModel[570] = new ModelRendererTurbo(this, 411, 69, textureX, textureY); // Box 128
		bodyModel[571] = new ModelRendererTurbo(this, 410, 57, textureX, textureY); // Box 128
		bodyModel[572] = new ModelRendererTurbo(this, 422, 52, textureX, textureY); // Box 128
		bodyModel[573] = new ModelRendererTurbo(this, 412, 52, textureX, textureY); // Box 153
		bodyModel[574] = new ModelRendererTurbo(this, 418, 45, textureX, textureY); // Box 128
		bodyModel[575] = new ModelRendererTurbo(this, 426, 46, textureX, textureY); // Box 128
		bodyModel[576] = new ModelRendererTurbo(this, 370, 66, textureX, textureY); // Box 247
		bodyModel[577] = new ModelRendererTurbo(this, 384, 67, textureX, textureY); // Box 249
		bodyModel[578] = new ModelRendererTurbo(this, 383, 71, textureX, textureY); // Box 251
		bodyModel[579] = new ModelRendererTurbo(this, 382, 76, textureX, textureY); // Box 253
		bodyModel[580] = new ModelRendererTurbo(this, 412, 46, textureX, textureY); // Box 255
		bodyModel[581] = new ModelRendererTurbo(this, 35, 86, textureX, textureY); // Box 38
		bodyModel[582] = new ModelRendererTurbo(this, 40, 87, textureX, textureY); // Box 38
		bodyModel[583] = new ModelRendererTurbo(this, 19, 102, textureX, textureY); // Box 128
		bodyModel[584] = new ModelRendererTurbo(this, 28, 103, textureX, textureY); // Box 128
		bodyModel[585] = new ModelRendererTurbo(this, 5, 130, textureX, textureY); // Box 128
		bodyModel[586] = new ModelRendererTurbo(this, 18, 96, textureX, textureY); // Box 128
		bodyModel[587] = new ModelRendererTurbo(this, 27, 97, textureX, textureY); // Box 128
		bodyModel[588] = new ModelRendererTurbo(this, 17, 90, textureX, textureY); // Box 128
		bodyModel[589] = new ModelRendererTurbo(this, 26, 91, textureX, textureY); // Box 128
		bodyModel[590] = new ModelRendererTurbo(this, 15, 82, textureX, textureY); // Box 128
		bodyModel[591] = new ModelRendererTurbo(this, 24, 83, textureX, textureY); // Box 128
		bodyModel[592] = new ModelRendererTurbo(this, 18, 132, textureX, textureY); // Box 128
		bodyModel[593] = new ModelRendererTurbo(this, 3, 132, textureX, textureY); // Box 128
		bodyModel[594] = new ModelRendererTurbo(this, 2, 120, textureX, textureY); // Box 128
		bodyModel[595] = new ModelRendererTurbo(this, 14, 115, textureX, textureY); // Box 128
		bodyModel[596] = new ModelRendererTurbo(this, 4, 115, textureX, textureY); // Box 153
		bodyModel[597] = new ModelRendererTurbo(this, 10, 108, textureX, textureY); // Box 128
		bodyModel[598] = new ModelRendererTurbo(this, 18, 109, textureX, textureY); // Box 128
		bodyModel[599] = new ModelRendererTurbo(this, 35, 66, textureX, textureY); // Box 247
		bodyModel[600] = new ModelRendererTurbo(this, 40, 67, textureX, textureY); // Box 248
		bodyModel[601] = new ModelRendererTurbo(this, 19, 67, textureX, textureY); // Box 249
		bodyModel[602] = new ModelRendererTurbo(this, 28, 67, textureX, textureY); // Box 250
		bodyModel[603] = new ModelRendererTurbo(this, 18, 71, textureX, textureY); // Box 251
		bodyModel[604] = new ModelRendererTurbo(this, 27, 72, textureX, textureY); // Box 252
		bodyModel[605] = new ModelRendererTurbo(this, 17, 76, textureX, textureY); // Box 253
		bodyModel[606] = new ModelRendererTurbo(this, 26, 77, textureX, textureY); // Box 254
		bodyModel[607] = new ModelRendererTurbo(this, 4, 109, textureX, textureY); // Box 255
		bodyModel[608] = new ModelRendererTurbo(this, 0, 59, textureX, textureY); // Box 128
		bodyModel[609] = new ModelRendererTurbo(this, 0, 98, textureX, textureY); // Box 128
		bodyModel[610] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 128
		bodyModel[611] = new ModelRendererTurbo(this, 1, 69, textureX, textureY); // Box 128
		bodyModel[612] = new ModelRendererTurbo(this, 100, 309, textureX, textureY); // Box 38
		bodyModel[613] = new ModelRendererTurbo(this, 288, 309, textureX, textureY); // Box 38
		bodyModel[614] = new ModelRendererTurbo(this, 17, 370, textureX, textureY); // Box 128
		bodyModel[615] = new ModelRendererTurbo(this, 72, 261, textureX, textureY); // bed ladder front
		bodyModel[616] = new ModelRendererTurbo(this, 481, 203, textureX, textureY); // bed ladder rear
		bodyModel[617] = new ModelRendererTurbo(this, 201, 247, textureX, textureY); // bed ladder front
		bodyModel[618] = new ModelRendererTurbo(this, 295, 203, textureX, textureY); // bed ladder front
		bodyModel[619] = new ModelRendererTurbo(this, 171, 271, textureX, textureY); // bed ladder rear
		bodyModel[620] = new ModelRendererTurbo(this, 359, 271, textureX, textureY); // bed ladder rear
		bodyModel[621] = new ModelRendererTurbo(this, 322, 64, textureX, textureY); // Box 190
		bodyModel[622] = new ModelRendererTurbo(this, 58, 104, textureX, textureY); // Box 204
		bodyModel[623] = new ModelRendererTurbo(this, 48, 79, textureX, textureY); // Box 194

		bodyModel[500].addBox(0F, 0F, 0F, 3, 4, 6, 0F); // Box 38
		bodyModel[500].setRotationPoint(39F, -3F, -10F);

		bodyModel[501].addBox(0F, 0F, 0F, 1, 4, 6, 0F); // Box 128
		bodyModel[501].setRotationPoint(38F, -3F, -10F);

		bodyModel[502].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F); // Box 128
		bodyModel[502].setRotationPoint(38F, -12F, -6F);

		bodyModel[503].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.01F, 0F, 0F); // Box 128
		bodyModel[503].setRotationPoint(38F, -10F, -6F);

		bodyModel[504].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[504].setRotationPoint(26F, -12F, 4F);

		bodyModel[505].addBox(0F, 0F, 0F, 1, 4, 6, 0F); // Box 128
		bodyModel[505].setRotationPoint(26F, -16F, 4F);

		bodyModel[506].addBox(0F, 0F, 0F, 1, 4, 6, 0F); // Box 128
		bodyModel[506].setRotationPoint(26F, -3F, 4F);

		bodyModel[507].addShapeBox(-0.5F, -0.5F, 0F, 9, 1, 4, 0F,-0.01F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, -0.01F, -0.01F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F); // roomette bed rear
		bodyModel[507].setRotationPoint(26.5F, -3.5F, 6F);
		bodyModel[507].rotateAngleZ = 1.57079633F;

		bodyModel[508].addShapeBox(-0.5F, -0.5F, 0F, 4, 1, 1, 0F,-0.01F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, -0.01F, -0.01F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F); // roomette bed rear
		bodyModel[508].setRotationPoint(26.5F, -3.5F, 5F);
		bodyModel[508].rotateAngleZ = 1.57079633F;

		bodyModel[509].addShapeBox(3.5F, -0.5F, 0F, 3, 1, 1, 0F,0F, -0.01F, 0F, 0F, -0.01F, -1F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // roomette bed rear
		bodyModel[509].setRotationPoint(26.5F, -3.5F, 5F);
		bodyModel[509].rotateAngleZ = 1.57079633F;

		bodyModel[510].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F); // Box 128
		bodyModel[510].setRotationPoint(26F, -12F, 5F);

		bodyModel[511].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.01F, 0F, -1F); // Box 128
		bodyModel[511].setRotationPoint(26F, -10F, 5F);

		bodyModel[512].addBox(0F, 0F, 0F, 3, 4, 6, 0F); // Box 38
		bodyModel[512].setRotationPoint(27F, -3F, 4F);

		bodyModel[513].addBox(0F, 0F, 0F, 2, 7, 1, 0F); // Box 38
		bodyModel[513].setRotationPoint(33F, -6F, 4F);

		bodyModel[514].addShapeBox(0F, 0F, 0F, 2, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 38
		bodyModel[514].setRotationPoint(33F, -6F, 5F);

		bodyModel[515].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F); // Box 38
		bodyModel[515].setRotationPoint(32.5F, -2F, 7F);

		bodyModel[516].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[516].setRotationPoint(32.5F, -3F, 6F);

		bodyModel[517].addShapeBox(0F, 0F, 0F, 3, 1, 6, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[517].setRotationPoint(33F, -13F, 4F);

		bodyModel[518].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[518].setRotationPoint(35F, -12F, 4F);

		bodyModel[519].addBox(0F, 0F, 0F, 1, 4, 6, 0F); // Box 128
		bodyModel[519].setRotationPoint(35F, -16F, 4F);

		bodyModel[520].addBox(0F, 0F, 0F, 1, 4, 6, 0F); // Box 128
		bodyModel[520].setRotationPoint(35F, -3F, 4F);

		bodyModel[521].addShapeBox(-0.5F, -0.5F, 0F, 9, 1, 4, 0F,-0.01F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, -0.01F, -0.01F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F); // roomette bed rear
		bodyModel[521].setRotationPoint(35.5F, -3.5F, 6F);
		bodyModel[521].rotateAngleZ = 1.57079633F;

		bodyModel[522].addShapeBox(-0.5F, -0.5F, 0F, 4, 1, 1, 0F,-0.01F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, -0.01F, -0.01F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F); // roomette bed rear
		bodyModel[522].setRotationPoint(35.5F, -3.5F, 5F);
		bodyModel[522].rotateAngleZ = 1.57079633F;

		bodyModel[523].addShapeBox(3.5F, -0.5F, 0F, 3, 1, 1, 0F,0F, -0.01F, 0F, 0F, -0.01F, -1F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // roomette bed rear
		bodyModel[523].setRotationPoint(35.5F, -3.5F, 5F);
		bodyModel[523].rotateAngleZ = 1.57079633F;

		bodyModel[524].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F); // Box 128
		bodyModel[524].setRotationPoint(35F, -12F, 5F);

		bodyModel[525].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.01F, 0F, -1F); // Box 128
		bodyModel[525].setRotationPoint(35F, -10F, 5F);

		bodyModel[526].addBox(0F, 0F, 0F, 3, 4, 6, 0F); // Box 38
		bodyModel[526].setRotationPoint(36F, -3F, 4F);

		bodyModel[527].addBox(0F, 0F, 0F, 2, 7, 1, 0F); // Box 38
		bodyModel[527].setRotationPoint(42F, -6F, 4F);

		bodyModel[528].addShapeBox(0F, 0F, 0F, 2, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 38
		bodyModel[528].setRotationPoint(42F, -6F, 5F);

		bodyModel[529].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F); // Box 38
		bodyModel[529].setRotationPoint(41.5F, -2F, 7F);

		bodyModel[530].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[530].setRotationPoint(41.5F, -3F, 6F);

		bodyModel[531].addShapeBox(0F, 0F, 0F, 3, 1, 6, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[531].setRotationPoint(42F, -13F, 4F);

		bodyModel[532].addShapeBox(0F, 0F, 0F, 1, 9, 5, 0F,0F, 0F, 0F, -0.99F, 0F, 0F, -0.99F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.99F, 0F, 0F, -0.99F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[532].setRotationPoint(26F, -12F, 5F);

		bodyModel[533].addShapeBox(0F, 0F, 0F, 1, 9, 5, 0F,0F, 0F, 0F, -0.99F, 0F, 0F, -0.99F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.99F, 0F, 0F, -0.99F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[533].setRotationPoint(35F, -12F, 5F);

		bodyModel[534].addShapeBox(0F, 0F, 0F, 6, 8, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[534].setRotationPoint(44.75F, -15F, 4.5F);
		bodyModel[534].rotateAngleY = 1.57079633F;

		bodyModel[535].addShapeBox(0F, 0F, 0F, 40, 1, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[535].setRotationPoint(16F, -17F, -10F);

		bodyModel[536].addShapeBox(0F, 0F, 0F, 31, 1, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[536].setRotationPoint(-60F, -17F, -10F);

		bodyModel[537].addShapeBox(0F, 0F, 0F, 45, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[537].setRotationPoint(-29F, -17F, 5F);

		bodyModel[538].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[538].setRotationPoint(-29F, -17F, -10F);

		bodyModel[539].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[539].setRotationPoint(12F, -17F, -10F);

		bodyModel[540].addShapeBox(0F, 0F, 0F, 9, 2, 14, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[540].setRotationPoint(-20F, -18F, -9F);

		bodyModel[541].addShapeBox(0F, 0F, 0F, 9, 2, 14, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[541].setRotationPoint(-2F, -18F, -9F);

		bodyModel[542].addShapeBox(0F, 0F, 0F, 17, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[542].setRotationPoint(-24F, -17F, -10F);

		bodyModel[543].addShapeBox(0F, 0F, 0F, 45, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[543].setRotationPoint(-29F, -18F, 5F);

		bodyModel[544].addShapeBox(0F, 0F, 0F, 17, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[544].setRotationPoint(-6F, -17F, -10F);

		bodyModel[545].addShapeBox(0F, 0F, 0F, 32, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[545].setRotationPoint(-61F, -18F, -7F);

		bodyModel[546].addShapeBox(0F, 0F, 0F, 46, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[546].setRotationPoint(16F, -18F, -7F);

		bodyModel[547].addShapeBox(0F, 0F, 0F, 116, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[547].setRotationPoint(-60F, -18F, 7F);

		bodyModel[548].addShapeBox(0F, 0F, 0F, 31, 1, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[548].setRotationPoint(-60F, -18F, -8F);

		bodyModel[549].addShapeBox(0F, 0F, 0F, 45, 1, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[549].setRotationPoint(16F, -18F, -8F);

		bodyModel[550].addShapeBox(0F, 0F, 0F, 2, 18, 0, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[550].setRotationPoint(62F, -15F, -11F);

		bodyModel[551].addShapeBox(0F, 0F, 0F, 2, 0, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 2.25F, -1F, 0F, 2.25F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -2.25F, -1F, 0F, -2.25F, -1F); // Box 128
		bodyModel[551].setRotationPoint(62F, -15F, -11F);

		bodyModel[552].addShapeBox(0F, 0F, 0F, 2, 0, 3, 0F,0F, -1.75F, 0F, -0.5F, -1.75F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 1.75F, 0F, -0.5F, 1.75F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[552].setRotationPoint(62F, -19F, -10F);

		bodyModel[553].addShapeBox(0F, 0F, 0F, 2, 0, 4, 0F,0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -0.5F, 1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[553].setRotationPoint(62F, -20F, -7F);

		bodyModel[554].addShapeBox(0F, 0F, 0F, 2, 0, 6, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[554].setRotationPoint(62F, -20F, -3F);

		bodyModel[555].addShapeBox(0F, 0F, 0F, 2, 18, 0, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 248
		bodyModel[555].setRotationPoint(62F, -15F, 11F);

		bodyModel[556].addShapeBox(0F, 0F, 0F, 2, 0, 2, 0F,0F, 2.25F, -1F, -0.5F, 2.25F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -2.25F, -1F, -0.5F, -2.25F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 250
		bodyModel[556].setRotationPoint(62F, -15F, 9F);

		bodyModel[557].addShapeBox(0F, 0F, 0F, 2, 0, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 1.75F, 0F, 0F, 1.75F, 0F); // Box 252
		bodyModel[557].setRotationPoint(62F, -19F, 7F);

		bodyModel[558].addShapeBox(0F, 0F, 0F, 2, 0, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 1F, 0F, 0F, 1F, 0F); // Box 254
		bodyModel[558].setRotationPoint(62F, -20F, 3F);

		bodyModel[559].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[559].setRotationPoint(62F, -15F, -4F);

		bodyModel[560].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[560].setRotationPoint(62F, 1F, -4F);

		bodyModel[561].addShapeBox(0F, 0F, 0F, 2, 15, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[561].setRotationPoint(62F, -14F, -4F);

		bodyModel[562].addShapeBox(0F, 0F, 0F, 2, 15, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[562].setRotationPoint(62F, -14F, 3F);

		bodyModel[563].addShapeBox(0F, 0F, 0F, 1, 18, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[563].setRotationPoint(63.5F, -15F, -11F);

		bodyModel[564].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 1.25F, -1F, 0F, 1.25F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F); // Box 128
		bodyModel[564].setRotationPoint(63.5F, -16F, -11F);

		bodyModel[565].addShapeBox(0F, 0F, 0F, 1, 1, 20, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[565].setRotationPoint(63.5F, 1F, -10F);

		bodyModel[566].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -1.75F, 0F, -0.5F, -1.75F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 1.75F, 0F, -0.5F, 1.75F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[566].setRotationPoint(63.5F, -19F, -10F);

		bodyModel[567].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -0.5F, 1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[567].setRotationPoint(63.5F, -20F, -7F);

		bodyModel[568].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[568].setRotationPoint(63.5F, -20F, -3F);

		bodyModel[569].addShapeBox(0F, 0F, 0F, 1, 15, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[569].setRotationPoint(63.5F, -14F, -5F);

		bodyModel[570].addShapeBox(0F, 0F, 0F, 1, 15, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[570].setRotationPoint(63.5F, -14F, 3F);

		bodyModel[571].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[571].setRotationPoint(63.5F, -15F, -5F);

		bodyModel[572].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.8F, 0F, -0.5F, -0.8F, 0F, -0.5F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[572].setRotationPoint(63.5F, -16F, -4F);

		bodyModel[573].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 153
		bodyModel[573].setRotationPoint(63.5F, -16F, 1F);

		bodyModel[574].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[574].setRotationPoint(63.5F, -19F, -1F);

		bodyModel[575].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 128
		bodyModel[575].setRotationPoint(63.5F, -18.75F, -5F);

		bodyModel[576].addShapeBox(0F, 0F, 0F, 1, 18, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 247
		bodyModel[576].setRotationPoint(63.5F, -15F, 10F);

		bodyModel[577].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 1.25F, -1F, -0.5F, 1.25F, -1F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 249
		bodyModel[577].setRotationPoint(63.5F, -16F, 9F);

		bodyModel[578].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 1.75F, 0F, 0F, 1.75F, 0F); // Box 251
		bodyModel[578].setRotationPoint(63.5F, -19F, 7F);

		bodyModel[579].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 1F, 0F, 0F, 1F, 0F); // Box 253
		bodyModel[579].setRotationPoint(63.5F, -20F, 3F);

		bodyModel[580].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 255
		bodyModel[580].setRotationPoint(63.5F, -18.75F, 4F);

		bodyModel[581].addShapeBox(0F, 0F, 0F, 1, 18, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[581].setRotationPoint(-63F, -15F, -11F);

		bodyModel[582].addShapeBox(0F, 0F, 0F, 2, 18, 0, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[582].setRotationPoint(-62.5F, -15F, -11F);

		bodyModel[583].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 1.25F, -1F, 0F, 1.25F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F); // Box 128
		bodyModel[583].setRotationPoint(-63F, -16F, -11F);

		bodyModel[584].addShapeBox(0F, 0F, 0F, 2, 0, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 2.25F, -1F, 0F, 2.25F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -2.25F, -1F, 0F, -2.25F, -1F); // Box 128
		bodyModel[584].setRotationPoint(-62.5F, -15F, -11F);

		bodyModel[585].addShapeBox(0F, 0F, 0F, 1, 1, 20, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[585].setRotationPoint(-63F, 1F, -10F);

		bodyModel[586].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -1.75F, 0F, -0.5F, -1.75F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 1.75F, 0F, -0.5F, 1.75F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[586].setRotationPoint(-63F, -19F, -10F);

		bodyModel[587].addShapeBox(0F, 0F, 0F, 2, 0, 3, 0F,0F, -1.75F, 0F, -0.5F, -1.75F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 1.75F, 0F, -0.5F, 1.75F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[587].setRotationPoint(-62.5F, -19F, -10F);

		bodyModel[588].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -0.5F, 1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[588].setRotationPoint(-63F, -20F, -7F);

		bodyModel[589].addShapeBox(0F, 0F, 0F, 2, 0, 4, 0F,0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -0.5F, 1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[589].setRotationPoint(-62.5F, -20F, -7F);

		bodyModel[590].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[590].setRotationPoint(-63F, -20F, -3F);

		bodyModel[591].addShapeBox(0F, 0F, 0F, 2, 0, 6, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[591].setRotationPoint(-62.5F, -20F, -3F);

		bodyModel[592].addShapeBox(0F, 0F, 0F, 1, 15, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[592].setRotationPoint(-63F, -14F, -5F);

		bodyModel[593].addShapeBox(0F, 0F, 0F, 1, 15, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[593].setRotationPoint(-63F, -14F, 3F);

		bodyModel[594].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[594].setRotationPoint(-63F, -15F, -5F);

		bodyModel[595].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.8F, 0F, -0.5F, -0.8F, 0F, -0.5F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[595].setRotationPoint(-63F, -16F, -4F);

		bodyModel[596].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 153
		bodyModel[596].setRotationPoint(-63F, -16F, 1F);

		bodyModel[597].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[597].setRotationPoint(-63F, -19F, -1F);

		bodyModel[598].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 128
		bodyModel[598].setRotationPoint(-63F, -18.75F, -5F);

		bodyModel[599].addShapeBox(0F, 0F, 0F, 1, 18, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 247
		bodyModel[599].setRotationPoint(-63F, -15F, 10F);

		bodyModel[600].addShapeBox(0F, 0F, 0F, 2, 18, 0, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 248
		bodyModel[600].setRotationPoint(-62.5F, -15F, 11F);

		bodyModel[601].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 1.25F, -1F, -0.5F, 1.25F, -1F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 249
		bodyModel[601].setRotationPoint(-63F, -16F, 9F);

		bodyModel[602].addShapeBox(0F, 0F, 0F, 2, 0, 2, 0F,0F, 2.25F, -1F, -0.5F, 2.25F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -2.25F, -1F, -0.5F, -2.25F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 250
		bodyModel[602].setRotationPoint(-62.5F, -15F, 9F);

		bodyModel[603].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 1.75F, 0F, 0F, 1.75F, 0F); // Box 251
		bodyModel[603].setRotationPoint(-63F, -19F, 7F);

		bodyModel[604].addShapeBox(0F, 0F, 0F, 2, 0, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 1.75F, 0F, 0F, 1.75F, 0F); // Box 252
		bodyModel[604].setRotationPoint(-62.5F, -19F, 7F);

		bodyModel[605].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 1F, 0F, 0F, 1F, 0F); // Box 253
		bodyModel[605].setRotationPoint(-63F, -20F, 3F);

		bodyModel[606].addShapeBox(0F, 0F, 0F, 2, 0, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 1F, 0F, 0F, 1F, 0F); // Box 254
		bodyModel[606].setRotationPoint(-62.5F, -20F, 3F);

		bodyModel[607].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 255
		bodyModel[607].setRotationPoint(-63F, -18.75F, 4F);

		bodyModel[608].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[608].setRotationPoint(-62.5F, -15F, -4F);

		bodyModel[609].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[609].setRotationPoint(-62.5F, 1F, -4F);

		bodyModel[610].addShapeBox(0F, 0F, 0F, 2, 15, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[610].setRotationPoint(-62.5F, -14F, -4F);

		bodyModel[611].addShapeBox(0F, 0F, 0F, 2, 15, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[611].setRotationPoint(-62.5F, -14F, 3F);

		bodyModel[612].addBox(0F, 0F, 0F, 7, 3, 1, 0F); // Box 38
		bodyModel[612].setRotationPoint(-6F, -2F, -10F);

		bodyModel[613].addBox(0F, 0F, 0F, 7, 3, 1, 0F); // Box 38
		bodyModel[613].setRotationPoint(12F, -2F, -10F);

		bodyModel[614].addBox(0F, 0F, 0F, 1, 4, 6, 0F); // Box 128
		bodyModel[614].setRotationPoint(20F, -3F, -10F);

		bodyModel[615].addShapeBox(0F, 0F, 0F, 0, 12, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // bed ladder front
		bodyModel[615].setRotationPoint(-11.01F, -17.51F, -7F);
		bodyModel[615].rotateAngleX = 1.57079633F;
		bodyModel[615].rotateAngleZ = -1.57079633F;

		bodyModel[616].addShapeBox(0F, 0F, 0F, 0, 12, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // bed ladder rear
		bodyModel[616].setRotationPoint(-19.99F, -17.51F, -7F);
		bodyModel[616].rotateAngleX = 1.57079633F;
		bodyModel[616].rotateAngleZ = 1.57079633F;

		bodyModel[617].addShapeBox(0F, 0F, 0F, 0, 12, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // bed ladder front
		bodyModel[617].setRotationPoint(6.99F, -17.51F, -7F);
		bodyModel[617].rotateAngleX = 1.57079633F;
		bodyModel[617].rotateAngleZ = -1.57079633F;

		bodyModel[618].addShapeBox(0F, 0F, 0F, 0, 12, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // bed ladder front
		bodyModel[618].setRotationPoint(-29.01F, -17.51F, -7F);
		bodyModel[618].rotateAngleX = 1.57079633F;
		bodyModel[618].rotateAngleZ = -1.57079633F;

		bodyModel[619].addShapeBox(0F, 0F, 0F, 0, 12, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // bed ladder rear
		bodyModel[619].setRotationPoint(-1.99F, -17.51F, -7F);
		bodyModel[619].rotateAngleX = 1.57079633F;
		bodyModel[619].rotateAngleZ = 1.57079633F;

		bodyModel[620].addShapeBox(0F, 0F, 0F, 0, 12, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // bed ladder rear
		bodyModel[620].setRotationPoint(16.01F, -17.51F, -7F);
		bodyModel[620].rotateAngleX = 1.57079633F;
		bodyModel[620].rotateAngleZ = 1.57079633F;

		bodyModel[621].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,-0.6F, -0.75F, -0.5F, -0.6F, -0.75F, -0.5F, -0.6F, -0.75F, -0.5F, -0.6F, -0.75F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 190
		bodyModel[621].setRotationPoint(46F, -18F, -11.5F);

		bodyModel[622].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 204
		bodyModel[622].setRotationPoint(-60.5F, -6F, 11F);

		bodyModel[623].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 194
		bodyModel[623].setRotationPoint(-60.5F, -6F, -12F);
	}
	ModelPS_Truck bogie1 = new ModelPS_Truck();
	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		for(int i = 0; i < 624; i++)
		{
			bodyModel[i].render(f5);
		}
		if(entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor()==0){
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/41-N-11_truck_silver.png"));
		} else if (entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor() == 12) {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/BAP_41-N-11_truck_NKP_blue.png"));
		}else {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/41-N-11_truck_black.png"));
		}
		GL11.glPushMatrix();
		GL11.glTranslated(-2.7,0,0);
		bogie1.render(entity,f,f1,f2,f3,f4,f5);

		GL11.glTranslated(5.5,0,0);
		bogie1.render(entity,f,f1,f2,f3,f4,f5);
		GL11.glPopMatrix();
	}
}