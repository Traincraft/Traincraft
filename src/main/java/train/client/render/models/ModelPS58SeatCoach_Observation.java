//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2021 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 14.04.2021 - 02:36:29
// Last changed on: 14.04.2021 - 02:36:29

package train.client.render.models; //Path where the model is located

import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import tmt.ModelConverter;
import tmt.ModelRendererTurbo;
import tmt.Tessellator;
import train.common.api.AbstractTrains;
import train.common.library.Info;

public class ModelPS58SeatCoach_Observation extends ModelConverter//Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelPS58SeatCoach_Observation() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[574];

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
		bodyModel[71] = new ModelRendererTurbo(this, 150, 156, textureX, textureY); // Box 41
		bodyModel[72] = new ModelRendererTurbo(this, 150, 154, textureX, textureY); // Box 41
		bodyModel[73] = new ModelRendererTurbo(this, 162, 154, textureX, textureY); // Box 41
		bodyModel[74] = new ModelRendererTurbo(this, 141, 162, textureX, textureY); // Box 41
		bodyModel[75] = new ModelRendererTurbo(this, 247, 156, textureX, textureY); // Box 26
		bodyModel[76] = new ModelRendererTurbo(this, 248, 159, textureX, textureY); // Box 26
		bodyModel[77] = new ModelRendererTurbo(this, 254, 156, textureX, textureY); // Box 26
		bodyModel[78] = new ModelRendererTurbo(this, 255, 159, textureX, textureY); // Box 26
		bodyModel[79] = new ModelRendererTurbo(this, 256, 154, textureX, textureY); // Box 24
		bodyModel[80] = new ModelRendererTurbo(this, 249, 154, textureX, textureY); // Box 24
		bodyModel[81] = new ModelRendererTurbo(this, 331, 62, textureX, textureY); // Left step part
		bodyModel[82] = new ModelRendererTurbo(this, 329, 65, textureX, textureY); // Left step part
		bodyModel[83] = new ModelRendererTurbo(this, 331, 68, textureX, textureY); // Left step part
		bodyModel[84] = new ModelRendererTurbo(this, 329, 71, textureX, textureY); // Left step part
		bodyModel[85] = new ModelRendererTurbo(this, 331, 77, textureX, textureY); // Left step part
		bodyModel[86] = new ModelRendererTurbo(this, 322, 79, textureX, textureY); // Left step part
		bodyModel[87] = new ModelRendererTurbo(this, 322, 77, textureX, textureY); // Left step part
		bodyModel[88] = new ModelRendererTurbo(this, 323, 74, textureX, textureY); // Left step part
		bodyModel[89] = new ModelRendererTurbo(this, 340, 79, textureX, textureY); // Left step part
		bodyModel[90] = new ModelRendererTurbo(this, 340, 77, textureX, textureY); // Left step part
		bodyModel[91] = new ModelRendererTurbo(this, 341, 74, textureX, textureY); // Left step part
		bodyModel[92] = new ModelRendererTurbo(this, 331, 74, textureX, textureY); // Left step part
		bodyModel[93] = new ModelRendererTurbo(this, 327, 81, textureX, textureY); // Left step part
		bodyModel[94] = new ModelRendererTurbo(this, 247, 165, textureX, textureY); // Box 140
		bodyModel[95] = new ModelRendererTurbo(this, 248, 168, textureX, textureY); // Box 141
		bodyModel[96] = new ModelRendererTurbo(this, 254, 165, textureX, textureY); // Box 142
		bodyModel[97] = new ModelRendererTurbo(this, 255, 168, textureX, textureY); // Box 143
		bodyModel[98] = new ModelRendererTurbo(this, 256, 163, textureX, textureY); // Box 144
		bodyModel[99] = new ModelRendererTurbo(this, 249, 163, textureX, textureY); // Box 145
		bodyModel[100] = new ModelRendererTurbo(this, 331, 87, textureX, textureY); // Right step part
		bodyModel[101] = new ModelRendererTurbo(this, 329, 90, textureX, textureY); // Right step part
		bodyModel[102] = new ModelRendererTurbo(this, 331, 93, textureX, textureY); // Right step part
		bodyModel[103] = new ModelRendererTurbo(this, 329, 96, textureX, textureY); // Right step part
		bodyModel[104] = new ModelRendererTurbo(this, 331, 102, textureX, textureY); // Right step part
		bodyModel[105] = new ModelRendererTurbo(this, 322, 100, textureX, textureY); // Right step part
		bodyModel[106] = new ModelRendererTurbo(this, 322, 98, textureX, textureY); // Right step part
		bodyModel[107] = new ModelRendererTurbo(this, 323, 95, textureX, textureY); // Right step part
		bodyModel[108] = new ModelRendererTurbo(this, 340, 100, textureX, textureY); // Right step part
		bodyModel[109] = new ModelRendererTurbo(this, 340, 98, textureX, textureY); // Right step part
		bodyModel[110] = new ModelRendererTurbo(this, 341, 95, textureX, textureY); // Right step part
		bodyModel[111] = new ModelRendererTurbo(this, 331, 99, textureX, textureY); // Right step part
		bodyModel[112] = new ModelRendererTurbo(this, 327, 106, textureX, textureY); // Right step part
		bodyModel[113] = new ModelRendererTurbo(this, 314, 108, textureX, textureY); // Left trapdoor
		bodyModel[114] = new ModelRendererTurbo(this, 329, 118, textureX, textureY); // Right trapdoor
		bodyModel[115] = new ModelRendererTurbo(this, 311, 69, textureX, textureY); // Left side door
		bodyModel[116] = new ModelRendererTurbo(this, 72, 68, textureX, textureY); // Box 38
		bodyModel[117] = new ModelRendererTurbo(this, 72, 87, textureX, textureY); // Box 128
		bodyModel[118] = new ModelRendererTurbo(this, 327, 20, textureX, textureY); // Box 128
		bodyModel[119] = new ModelRendererTurbo(this, 361, 20, textureX, textureY); // Box 128
		bodyModel[120] = new ModelRendererTurbo(this, 380, 19, textureX, textureY); // Box 128
		bodyModel[121] = new ModelRendererTurbo(this, 415, 20, textureX, textureY); // Box 128
		bodyModel[122] = new ModelRendererTurbo(this, 311, 90, textureX, textureY); // Right side door
		bodyModel[123] = new ModelRendererTurbo(this, 35, 19, textureX, textureY); // Box 128
		bodyModel[124] = new ModelRendererTurbo(this, 1, 14, textureX, textureY); // Box 128
		bodyModel[125] = new ModelRendererTurbo(this, 337, 19, textureX, textureY); // Box 128
		bodyModel[126] = new ModelRendererTurbo(this, 391, 19, textureX, textureY); // Box 128
		bodyModel[127] = new ModelRendererTurbo(this, 27, 18, textureX, textureY); // Box 128
		bodyModel[128] = new ModelRendererTurbo(this, 311, 66, textureX, textureY); // Box 128
		bodyModel[129] = new ModelRendererTurbo(this, 311, 87, textureX, textureY); // Box 128
		bodyModel[130] = new ModelRendererTurbo(this, 346, 21, textureX, textureY); // Vestibule door
		bodyModel[131] = new ModelRendererTurbo(this, 18, 20, textureX, textureY); // Front end door
		bodyModel[132] = new ModelRendererTurbo(this, 431, 18, textureX, textureY); // Box 128
		bodyModel[133] = new ModelRendererTurbo(this, 437, 35, textureX, textureY); // Box 128
		bodyModel[134] = new ModelRendererTurbo(this, 413, 2, textureX, textureY); // Box 128
		bodyModel[135] = new ModelRendererTurbo(this, 432, 2, textureX, textureY); // Box 128
		bodyModel[136] = new ModelRendererTurbo(this, 418, 1, textureX, textureY); // Box 128
		bodyModel[137] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 128
		bodyModel[138] = new ModelRendererTurbo(this, 446, 23, textureX, textureY); // Box 128
		bodyModel[139] = new ModelRendererTurbo(this, 424, 35, textureX, textureY); // Box 128
		bodyModel[140] = new ModelRendererTurbo(this, 426, 19, textureX, textureY); // Box 128
		bodyModel[141] = new ModelRendererTurbo(this, 442, 19, textureX, textureY); // Box 153
		bodyModel[142] = new ModelRendererTurbo(this, 22, 43, textureX, textureY); // Box 128
		bodyModel[143] = new ModelRendererTurbo(this, 44, 35, textureX, textureY); // Box 128
		bodyModel[144] = new ModelRendererTurbo(this, 63, 1, textureX, textureY); // Box 128
		bodyModel[145] = new ModelRendererTurbo(this, 44, 2, textureX, textureY); // Box 128
		bodyModel[146] = new ModelRendererTurbo(this, 56, 1, textureX, textureY); // Box 128
		bodyModel[147] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 128
		bodyModel[148] = new ModelRendererTurbo(this, 31, 43, textureX, textureY); // Box 128
		bodyModel[149] = new ModelRendererTurbo(this, 4, 39, textureX, textureY); // Box 128
		bodyModel[150] = new ModelRendererTurbo(this, 17, 42, textureX, textureY); // Box 128
		bodyModel[151] = new ModelRendererTurbo(this, 1, 42, textureX, textureY); // Box 153
		bodyModel[152] = new ModelRendererTurbo(this, 72, 41, textureX, textureY); // Box 128
		bodyModel[153] = new ModelRendererTurbo(this, 72, 49, textureX, textureY); // Box 128
		bodyModel[154] = new ModelRendererTurbo(this, 72, 55, textureX, textureY); // Box 128
		bodyModel[155] = new ModelRendererTurbo(this, 72, 35, textureX, textureY); // Box 168
		bodyModel[156] = new ModelRendererTurbo(this, 72, 30, textureX, textureY); // Box 169
		bodyModel[157] = new ModelRendererTurbo(this, 72, 60, textureX, textureY); // Box 128
		bodyModel[158] = new ModelRendererTurbo(this, 72, 26, textureX, textureY); // Box 170
		bodyModel[159] = new ModelRendererTurbo(this, 399, 29, textureX, textureY); // Rear gate closed
		bodyModel[160] = new ModelRendererTurbo(this, 412, 34, textureX, textureY); // Rear gate open
		bodyModel[161] = new ModelRendererTurbo(this, 392, 1, textureX, textureY); // Box 128
		bodyModel[162] = new ModelRendererTurbo(this, 358, 1, textureX, textureY); // Box 177
		bodyModel[163] = new ModelRendererTurbo(this, 373, 1, textureX, textureY); // Box 128
		bodyModel[164] = new ModelRendererTurbo(this, 442, 1, textureX, textureY); // Box 128
		bodyModel[165] = new ModelRendererTurbo(this, 394, 9, textureX, textureY); // Box 128
		bodyModel[166] = new ModelRendererTurbo(this, 362, 9, textureX, textureY); // Box 176
		bodyModel[167] = new ModelRendererTurbo(this, 188, 156, textureX, textureY); // Box 38
		bodyModel[168] = new ModelRendererTurbo(this, 195, 160, textureX, textureY); // Box 38
		bodyModel[169] = new ModelRendererTurbo(this, 197, 155, textureX, textureY); // Box 38
		bodyModel[170] = new ModelRendererTurbo(this, 183, 155, textureX, textureY); // Box 38
		bodyModel[171] = new ModelRendererTurbo(this, 203, 155, textureX, textureY); // Box 41
		bodyModel[172] = new ModelRendererTurbo(this, 222, 155, textureX, textureY); // Box 41
		bodyModel[173] = new ModelRendererTurbo(this, 212, 155, textureX, textureY); // Box 41
		bodyModel[174] = new ModelRendererTurbo(this, 231, 155, textureX, textureY); // Box 41
		bodyModel[175] = new ModelRendererTurbo(this, 223, 155, textureX, textureY); // Box 41
		bodyModel[176] = new ModelRendererTurbo(this, 204, 155, textureX, textureY); // Box 41
		bodyModel[177] = new ModelRendererTurbo(this, 349, 77, textureX, textureY); // Box 128
		bodyModel[178] = new ModelRendererTurbo(this, 352, 77, textureX, textureY); // Box 128
		bodyModel[179] = new ModelRendererTurbo(this, 349, 98, textureX, textureY); // Box 202
		bodyModel[180] = new ModelRendererTurbo(this, 352, 98, textureX, textureY); // Box 203
		bodyModel[181] = new ModelRendererTurbo(this, 51, 78, textureX, textureY); // Box 128
		bodyModel[182] = new ModelRendererTurbo(this, 60, 97, textureX, textureY); // Box 202
		bodyModel[183] = new ModelRendererTurbo(this, 63, 145, textureX, textureY); // Box 128
		bodyModel[184] = new ModelRendererTurbo(this, 74, 155, textureX, textureY); // Box 205
		bodyModel[185] = new ModelRendererTurbo(this, 366, 87, textureX, textureY); // Box 38
		bodyModel[186] = new ModelRendererTurbo(this, 374, 103, textureX, textureY); // Box 128
		bodyModel[187] = new ModelRendererTurbo(this, 373, 97, textureX, textureY); // Box 128
		bodyModel[188] = new ModelRendererTurbo(this, 372, 91, textureX, textureY); // Box 128
		bodyModel[189] = new ModelRendererTurbo(this, 370, 83, textureX, textureY); // Box 128
		bodyModel[190] = new ModelRendererTurbo(this, 366, 67, textureX, textureY); // Box 248
		bodyModel[191] = new ModelRendererTurbo(this, 374, 67, textureX, textureY); // Box 250
		bodyModel[192] = new ModelRendererTurbo(this, 373, 72, textureX, textureY); // Box 252
		bodyModel[193] = new ModelRendererTurbo(this, 372, 77, textureX, textureY); // Box 254
		bodyModel[194] = new ModelRendererTurbo(this, 371, 86, textureX, textureY); // Box 38
		bodyModel[195] = new ModelRendererTurbo(this, 385, 102, textureX, textureY); // Box 128
		bodyModel[196] = new ModelRendererTurbo(this, 414, 67, textureX, textureY); // Box 128
		bodyModel[197] = new ModelRendererTurbo(this, 384, 96, textureX, textureY); // Box 128
		bodyModel[198] = new ModelRendererTurbo(this, 383, 90, textureX, textureY); // Box 128
		bodyModel[199] = new ModelRendererTurbo(this, 381, 82, textureX, textureY); // Box 128
		bodyModel[200] = new ModelRendererTurbo(this, 419, 45, textureX, textureY); // Box 128
		bodyModel[201] = new ModelRendererTurbo(this, 427, 46, textureX, textureY); // Box 128
		bodyModel[202] = new ModelRendererTurbo(this, 371, 66, textureX, textureY); // Box 247
		bodyModel[203] = new ModelRendererTurbo(this, 385, 67, textureX, textureY); // Box 249
		bodyModel[204] = new ModelRendererTurbo(this, 384, 71, textureX, textureY); // Box 251
		bodyModel[205] = new ModelRendererTurbo(this, 383, 76, textureX, textureY); // Box 253
		bodyModel[206] = new ModelRendererTurbo(this, 413, 46, textureX, textureY); // Box 255
		bodyModel[207] = new ModelRendererTurbo(this, 411, 57, textureX, textureY); // Box 128
		bodyModel[208] = new ModelRendererTurbo(this, 423, 52, textureX, textureY); // Box 128
		bodyModel[209] = new ModelRendererTurbo(this, 413, 52, textureX, textureY); // Box 153
		bodyModel[210] = new ModelRendererTurbo(this, 427, 69, textureX, textureY); // Box 128
		bodyModel[211] = new ModelRendererTurbo(this, 412, 69, textureX, textureY); // Box 128
		bodyModel[212] = new ModelRendererTurbo(this, 403, 69, textureX, textureY); // Box 128
		bodyModel[213] = new ModelRendererTurbo(this, 403, 89, textureX, textureY); // Box 128
		bodyModel[214] = new ModelRendererTurbo(this, 390, 59, textureX, textureY); // Box 128
		bodyModel[215] = new ModelRendererTurbo(this, 390, 98, textureX, textureY); // Box 128
		bodyModel[216] = new ModelRendererTurbo(this, 327, 52, textureX, textureY); // Box 204
		bodyModel[217] = new ModelRendererTurbo(this, 327, 57, textureX, textureY); // Box 205
		bodyModel[218] = new ModelRendererTurbo(this, 62, 59, textureX, textureY); // Box 190
		bodyModel[219] = new ModelRendererTurbo(this, 61, 55, textureX, textureY); // Box 191
		bodyModel[220] = new ModelRendererTurbo(this, 300, 21, textureX, textureY); // Box 128
		bodyModel[221] = new ModelRendererTurbo(this, 299, 16, textureX, textureY); // Box 128
		bodyModel[222] = new ModelRendererTurbo(this, 311, 17, textureX, textureY); // Box 275
		bodyModel[223] = new ModelRendererTurbo(this, 310, 22, textureX, textureY); // Box 276
		bodyModel[224] = new ModelRendererTurbo(this, 79, 297, textureX, textureY); // Box 209
		bodyModel[225] = new ModelRendererTurbo(this, 23, 241, textureX, textureY); // Box 128
		bodyModel[226] = new ModelRendererTurbo(this, 34, 259, textureX, textureY); // Box 128
		bodyModel[227] = new ModelRendererTurbo(this, 33, 228, textureX, textureY); // Box 128
		bodyModel[228] = new ModelRendererTurbo(this, 34, 234, textureX, textureY); // Box 176
		bodyModel[229] = new ModelRendererTurbo(this, 31, 220, textureX, textureY); // Box 128
		bodyModel[230] = new ModelRendererTurbo(this, 33, 214, textureX, textureY); // Box 177
		bodyModel[231] = new ModelRendererTurbo(this, 79, 266, textureX, textureY); // Box 209
		bodyModel[232] = new ModelRendererTurbo(this, 310, 290, textureX, textureY); // Box 128
		bodyModel[233] = new ModelRendererTurbo(this, 353, 192, textureX, textureY); // Box 177
		bodyModel[234] = new ModelRendererTurbo(this, 339, 226, textureX, textureY); // Box 128
		bodyModel[235] = new ModelRendererTurbo(this, 353, 212, textureX, textureY); // Box 128
		bodyModel[236] = new ModelRendererTurbo(this, 353, 219, textureX, textureY); // Box 176
		bodyModel[237] = new ModelRendererTurbo(this, 353, 206, textureX, textureY); // Box 128
		bodyModel[238] = new ModelRendererTurbo(this, 351, 198, textureX, textureY); // Box 128
		bodyModel[239] = new ModelRendererTurbo(this, 348, 304, textureX, textureY); // Box 128
		bodyModel[240] = new ModelRendererTurbo(this, 328, 271, textureX, textureY); // Box 128
		bodyModel[241] = new ModelRendererTurbo(this, 366, 299, textureX, textureY); // Box 128
		bodyModel[242] = new ModelRendererTurbo(this, 383, 306, textureX, textureY); // Box 38
		bodyModel[243] = new ModelRendererTurbo(this, 383, 314, textureX, textureY); // Box 38
		bodyModel[244] = new ModelRendererTurbo(this, 363, 281, textureX, textureY); // Box 128
		bodyModel[245] = new ModelRendererTurbo(this, 397, 281, textureX, textureY); // Box 128
		bodyModel[246] = new ModelRendererTurbo(this, 382, 276, textureX, textureY); // Box 128
		bodyModel[247] = new ModelRendererTurbo(this, 100, 228, textureX, textureY); // Box 38
		bodyModel[248] = new ModelRendererTurbo(this, 343, 304, textureX, textureY); // Box 128
		bodyModel[249] = new ModelRendererTurbo(this, 104, 191, textureX, textureY); // Box 38
		bodyModel[250] = new ModelRendererTurbo(this, 106, 196, textureX, textureY); // Box 38
		bodyModel[251] = new ModelRendererTurbo(this, 104, 258, textureX, textureY); // Box 275
		bodyModel[252] = new ModelRendererTurbo(this, 106, 263, textureX, textureY); // Box 276
		bodyModel[253] = new ModelRendererTurbo(this, 88, 259, textureX, textureY); // Box 275
		bodyModel[254] = new ModelRendererTurbo(this, 95, 259, textureX, textureY); // Box 275
		bodyModel[255] = new ModelRendererTurbo(this, 88, 263, textureX, textureY); // Box 275
		bodyModel[256] = new ModelRendererTurbo(this, 101, 263, textureX, textureY); // Box 276
		bodyModel[257] = new ModelRendererTurbo(this, 153, 234, textureX, textureY); // Box 38 glow
		bodyModel[258] = new ModelRendererTurbo(this, 160, 234, textureX, textureY); // Box 38 glow
		bodyModel[259] = new ModelRendererTurbo(this, 167, 234, textureX, textureY); // Box 38 glow
		bodyModel[260] = new ModelRendererTurbo(this, 174, 234, textureX, textureY); // Box 38 glow
		bodyModel[261] = new ModelRendererTurbo(this, 181, 234, textureX, textureY); // Box 38 glow
		bodyModel[262] = new ModelRendererTurbo(this, 188, 234, textureX, textureY); // Box 38 glow
		bodyModel[263] = new ModelRendererTurbo(this, 195, 234, textureX, textureY); // Box 38 glow
		bodyModel[264] = new ModelRendererTurbo(this, 119, 274, textureX, textureY); // Right seat part
		bodyModel[265] = new ModelRendererTurbo(this, 119, 284, textureX, textureY); // Right seat part
		bodyModel[266] = new ModelRendererTurbo(this, 110, 267, textureX, textureY); // Right seat part
		bodyModel[267] = new ModelRendererTurbo(this, 99, 277, textureX, textureY); // Right seat part
		bodyModel[268] = new ModelRendererTurbo(this, 99, 267, textureX, textureY); // Right seat part
		bodyModel[269] = new ModelRendererTurbo(this, 110, 287, textureX, textureY); // Right seat part
		bodyModel[270] = new ModelRendererTurbo(this, 110, 284, textureX, textureY); // Right seat part
		bodyModel[271] = new ModelRendererTurbo(this, 110, 277, textureX, textureY); // Right seat part
		bodyModel[272] = new ModelRendererTurbo(this, 110, 274, textureX, textureY); // Right seat part
		bodyModel[273] = new ModelRendererTurbo(this, 119, 312, textureX, textureY); // Left seat part
		bodyModel[274] = new ModelRendererTurbo(this, 119, 302, textureX, textureY); // Left seat part
		bodyModel[275] = new ModelRendererTurbo(this, 110, 295, textureX, textureY); // Left seat part
		bodyModel[276] = new ModelRendererTurbo(this, 99, 295, textureX, textureY); // Left seat part
		bodyModel[277] = new ModelRendererTurbo(this, 110, 305, textureX, textureY); // Left seat part
		bodyModel[278] = new ModelRendererTurbo(this, 110, 302, textureX, textureY); // Left seat part
		bodyModel[279] = new ModelRendererTurbo(this, 110, 315, textureX, textureY); // Left seat part
		bodyModel[280] = new ModelRendererTurbo(this, 110, 312, textureX, textureY); // Left seat part
		bodyModel[281] = new ModelRendererTurbo(this, 150, 274, textureX, textureY); // Right seat part
		bodyModel[282] = new ModelRendererTurbo(this, 150, 284, textureX, textureY); // Right seat part
		bodyModel[283] = new ModelRendererTurbo(this, 141, 267, textureX, textureY); // Right seat part
		bodyModel[284] = new ModelRendererTurbo(this, 130, 267, textureX, textureY); // Right seat part
		bodyModel[285] = new ModelRendererTurbo(this, 141, 287, textureX, textureY); // Right seat part
		bodyModel[286] = new ModelRendererTurbo(this, 141, 284, textureX, textureY); // Right seat part
		bodyModel[287] = new ModelRendererTurbo(this, 141, 277, textureX, textureY); // Right seat part
		bodyModel[288] = new ModelRendererTurbo(this, 141, 274, textureX, textureY); // Right seat part
		bodyModel[289] = new ModelRendererTurbo(this, 150, 312, textureX, textureY); // Left seat part
		bodyModel[290] = new ModelRendererTurbo(this, 150, 302, textureX, textureY); // Left seat part
		bodyModel[291] = new ModelRendererTurbo(this, 141, 295, textureX, textureY); // Left seat part
		bodyModel[292] = new ModelRendererTurbo(this, 130, 295, textureX, textureY); // Left seat part
		bodyModel[293] = new ModelRendererTurbo(this, 141, 305, textureX, textureY); // Left seat part
		bodyModel[294] = new ModelRendererTurbo(this, 141, 302, textureX, textureY); // Left seat part
		bodyModel[295] = new ModelRendererTurbo(this, 141, 315, textureX, textureY); // Left seat part
		bodyModel[296] = new ModelRendererTurbo(this, 141, 312, textureX, textureY); // Left seat part
		bodyModel[297] = new ModelRendererTurbo(this, 181, 274, textureX, textureY); // Right seat part
		bodyModel[298] = new ModelRendererTurbo(this, 181, 284, textureX, textureY); // Right seat part
		bodyModel[299] = new ModelRendererTurbo(this, 172, 267, textureX, textureY); // Right seat part
		bodyModel[300] = new ModelRendererTurbo(this, 161, 267, textureX, textureY); // Right seat part
		bodyModel[301] = new ModelRendererTurbo(this, 172, 287, textureX, textureY); // Right seat part
		bodyModel[302] = new ModelRendererTurbo(this, 172, 284, textureX, textureY); // Right seat part
		bodyModel[303] = new ModelRendererTurbo(this, 172, 277, textureX, textureY); // Right seat part
		bodyModel[304] = new ModelRendererTurbo(this, 172, 274, textureX, textureY); // Right seat part
		bodyModel[305] = new ModelRendererTurbo(this, 181, 312, textureX, textureY); // Left seat part
		bodyModel[306] = new ModelRendererTurbo(this, 181, 302, textureX, textureY); // Left seat part
		bodyModel[307] = new ModelRendererTurbo(this, 172, 295, textureX, textureY); // Left seat part
		bodyModel[308] = new ModelRendererTurbo(this, 161, 295, textureX, textureY); // Left seat part
		bodyModel[309] = new ModelRendererTurbo(this, 172, 305, textureX, textureY); // Left seat part
		bodyModel[310] = new ModelRendererTurbo(this, 172, 302, textureX, textureY); // Left seat part
		bodyModel[311] = new ModelRendererTurbo(this, 172, 315, textureX, textureY); // Left seat part
		bodyModel[312] = new ModelRendererTurbo(this, 172, 312, textureX, textureY); // Left seat part
		bodyModel[313] = new ModelRendererTurbo(this, 130, 277, textureX, textureY); // Right seat part
		bodyModel[314] = new ModelRendererTurbo(this, 161, 277, textureX, textureY); // Right seat part
		bodyModel[315] = new ModelRendererTurbo(this, 99, 305, textureX, textureY); // Left seat part
		bodyModel[316] = new ModelRendererTurbo(this, 130, 305, textureX, textureY); // Left seat part
		bodyModel[317] = new ModelRendererTurbo(this, 161, 305, textureX, textureY); // Left seat part
		bodyModel[318] = new ModelRendererTurbo(this, 212, 274, textureX, textureY); // Right seat part
		bodyModel[319] = new ModelRendererTurbo(this, 212, 284, textureX, textureY); // Right seat part
		bodyModel[320] = new ModelRendererTurbo(this, 203, 267, textureX, textureY); // Right seat part
		bodyModel[321] = new ModelRendererTurbo(this, 192, 277, textureX, textureY); // Right seat part
		bodyModel[322] = new ModelRendererTurbo(this, 192, 267, textureX, textureY); // Right seat part
		bodyModel[323] = new ModelRendererTurbo(this, 203, 287, textureX, textureY); // Right seat part
		bodyModel[324] = new ModelRendererTurbo(this, 203, 284, textureX, textureY); // Right seat part
		bodyModel[325] = new ModelRendererTurbo(this, 203, 277, textureX, textureY); // Right seat part
		bodyModel[326] = new ModelRendererTurbo(this, 203, 274, textureX, textureY); // Right seat part
		bodyModel[327] = new ModelRendererTurbo(this, 212, 312, textureX, textureY); // Left seat part
		bodyModel[328] = new ModelRendererTurbo(this, 212, 302, textureX, textureY); // Left seat part
		bodyModel[329] = new ModelRendererTurbo(this, 203, 295, textureX, textureY); // Left seat part
		bodyModel[330] = new ModelRendererTurbo(this, 192, 295, textureX, textureY); // Left seat part
		bodyModel[331] = new ModelRendererTurbo(this, 203, 305, textureX, textureY); // Left seat part
		bodyModel[332] = new ModelRendererTurbo(this, 203, 302, textureX, textureY); // Left seat part
		bodyModel[333] = new ModelRendererTurbo(this, 203, 315, textureX, textureY); // Left seat part
		bodyModel[334] = new ModelRendererTurbo(this, 203, 312, textureX, textureY); // Left seat part
		bodyModel[335] = new ModelRendererTurbo(this, 243, 274, textureX, textureY); // Right seat part
		bodyModel[336] = new ModelRendererTurbo(this, 243, 284, textureX, textureY); // Right seat part
		bodyModel[337] = new ModelRendererTurbo(this, 234, 267, textureX, textureY); // Right seat part
		bodyModel[338] = new ModelRendererTurbo(this, 223, 267, textureX, textureY); // Right seat part
		bodyModel[339] = new ModelRendererTurbo(this, 234, 287, textureX, textureY); // Right seat part
		bodyModel[340] = new ModelRendererTurbo(this, 234, 284, textureX, textureY); // Right seat part
		bodyModel[341] = new ModelRendererTurbo(this, 234, 277, textureX, textureY); // Right seat part
		bodyModel[342] = new ModelRendererTurbo(this, 234, 274, textureX, textureY); // Right seat part
		bodyModel[343] = new ModelRendererTurbo(this, 243, 312, textureX, textureY); // Left seat part
		bodyModel[344] = new ModelRendererTurbo(this, 243, 302, textureX, textureY); // Left seat part
		bodyModel[345] = new ModelRendererTurbo(this, 234, 295, textureX, textureY); // Left seat part
		bodyModel[346] = new ModelRendererTurbo(this, 223, 295, textureX, textureY); // Left seat part
		bodyModel[347] = new ModelRendererTurbo(this, 234, 305, textureX, textureY); // Left seat part
		bodyModel[348] = new ModelRendererTurbo(this, 234, 302, textureX, textureY); // Left seat part
		bodyModel[349] = new ModelRendererTurbo(this, 234, 315, textureX, textureY); // Left seat part
		bodyModel[350] = new ModelRendererTurbo(this, 234, 312, textureX, textureY); // Left seat part
		bodyModel[351] = new ModelRendererTurbo(this, 274, 274, textureX, textureY); // Right seat part
		bodyModel[352] = new ModelRendererTurbo(this, 274, 284, textureX, textureY); // Right seat part
		bodyModel[353] = new ModelRendererTurbo(this, 265, 267, textureX, textureY); // Right seat part
		bodyModel[354] = new ModelRendererTurbo(this, 254, 267, textureX, textureY); // Right seat part
		bodyModel[355] = new ModelRendererTurbo(this, 265, 287, textureX, textureY); // Right seat part
		bodyModel[356] = new ModelRendererTurbo(this, 265, 284, textureX, textureY); // Right seat part
		bodyModel[357] = new ModelRendererTurbo(this, 265, 277, textureX, textureY); // Right seat part
		bodyModel[358] = new ModelRendererTurbo(this, 265, 274, textureX, textureY); // Right seat part
		bodyModel[359] = new ModelRendererTurbo(this, 274, 312, textureX, textureY); // Left seat part
		bodyModel[360] = new ModelRendererTurbo(this, 274, 302, textureX, textureY); // Left seat part
		bodyModel[361] = new ModelRendererTurbo(this, 265, 295, textureX, textureY); // Left seat part
		bodyModel[362] = new ModelRendererTurbo(this, 254, 295, textureX, textureY); // Left seat part
		bodyModel[363] = new ModelRendererTurbo(this, 265, 305, textureX, textureY); // Left seat part
		bodyModel[364] = new ModelRendererTurbo(this, 265, 302, textureX, textureY); // Left seat part
		bodyModel[365] = new ModelRendererTurbo(this, 265, 315, textureX, textureY); // Left seat part
		bodyModel[366] = new ModelRendererTurbo(this, 265, 312, textureX, textureY); // Left seat part
		bodyModel[367] = new ModelRendererTurbo(this, 223, 277, textureX, textureY); // Right seat part
		bodyModel[368] = new ModelRendererTurbo(this, 254, 277, textureX, textureY); // Right seat part
		bodyModel[369] = new ModelRendererTurbo(this, 192, 305, textureX, textureY); // Left seat part
		bodyModel[370] = new ModelRendererTurbo(this, 223, 305, textureX, textureY); // Left seat part
		bodyModel[371] = new ModelRendererTurbo(this, 254, 305, textureX, textureY); // Left seat part
		bodyModel[372] = new ModelRendererTurbo(this, 305, 274, textureX, textureY); // Right seat part
		bodyModel[373] = new ModelRendererTurbo(this, 305, 284, textureX, textureY); // Right seat part
		bodyModel[374] = new ModelRendererTurbo(this, 296, 267, textureX, textureY); // Right seat part
		bodyModel[375] = new ModelRendererTurbo(this, 285, 267, textureX, textureY); // Right seat part
		bodyModel[376] = new ModelRendererTurbo(this, 296, 287, textureX, textureY); // Right seat part
		bodyModel[377] = new ModelRendererTurbo(this, 296, 284, textureX, textureY); // Right seat part
		bodyModel[378] = new ModelRendererTurbo(this, 296, 277, textureX, textureY); // Right seat part
		bodyModel[379] = new ModelRendererTurbo(this, 296, 274, textureX, textureY); // Right seat part
		bodyModel[380] = new ModelRendererTurbo(this, 285, 277, textureX, textureY); // Right seat part
		bodyModel[381] = new ModelRendererTurbo(this, 285, 308, textureX, textureY); // Box 128
		bodyModel[382] = new ModelRendererTurbo(this, 289, 300, textureX, textureY); // Box 128
		bodyModel[383] = new ModelRendererTurbo(this, 291, 299, textureX, textureY); // Box 128
		bodyModel[384] = new ModelRendererTurbo(this, 288, 300, textureX, textureY); // Box 128
		bodyModel[385] = new ModelRendererTurbo(this, 10, 230, textureX, textureY); // Box 38 glow
		bodyModel[386] = new ModelRendererTurbo(this, 11, 234, textureX, textureY); // Box 38 glow
		bodyModel[387] = new ModelRendererTurbo(this, 11, 238, textureX, textureY); // Box 38 glow
		bodyModel[388] = new ModelRendererTurbo(this, 18, 240, textureX, textureY); // Box 38 glow
		bodyModel[389] = new ModelRendererTurbo(this, 25, 238, textureX, textureY); // Box 38 glow
		bodyModel[390] = new ModelRendererTurbo(this, 24, 226, textureX, textureY); // Box 38 glow
		bodyModel[391] = new ModelRendererTurbo(this, 25, 234, textureX, textureY); // Box 38 glow
		bodyModel[392] = new ModelRendererTurbo(this, 10, 226, textureX, textureY); // Box 38 glow
		bodyModel[393] = new ModelRendererTurbo(this, 17, 224, textureX, textureY); // Box 38 glow
		bodyModel[394] = new ModelRendererTurbo(this, 24, 230, textureX, textureY); // Box 38 glow
		bodyModel[395] = new ModelRendererTurbo(this, 300, 310, textureX, textureY); // Box 128
		bodyModel[396] = new ModelRendererTurbo(this, 47, 312, textureX, textureY); // Box 209
		bodyModel[397] = new ModelRendererTurbo(this, 51, 305, textureX, textureY); // Box 209
		bodyModel[398] = new ModelRendererTurbo(this, 58, 308, textureX, textureY); // Box 209
		bodyModel[399] = new ModelRendererTurbo(this, 50, 299, textureX, textureY); // Box 209
		bodyModel[400] = new ModelRendererTurbo(this, 40, 306, textureX, textureY); // Box 209
		bodyModel[401] = new ModelRendererTurbo(this, 42, 313, textureX, textureY); // Box 209
		bodyModel[402] = new ModelRendererTurbo(this, 47, 280, textureX, textureY); // Box 470
		bodyModel[403] = new ModelRendererTurbo(this, 49, 274, textureX, textureY); // Box 471
		bodyModel[404] = new ModelRendererTurbo(this, 58, 276, textureX, textureY); // Box 472
		bodyModel[405] = new ModelRendererTurbo(this, 48, 268, textureX, textureY); // Box 473
		bodyModel[406] = new ModelRendererTurbo(this, 38, 275, textureX, textureY); // Box 474
		bodyModel[407] = new ModelRendererTurbo(this, 42, 281, textureX, textureY); // Box 475
		bodyModel[408] = new ModelRendererTurbo(this, 25, 299, textureX, textureY); // Box 492
		bodyModel[409] = new ModelRendererTurbo(this, 28, 289, textureX, textureY); // Box 493
		bodyModel[410] = new ModelRendererTurbo(this, 31, 306, textureX, textureY); // Box 494
		bodyModel[411] = new ModelRendererTurbo(this, 22, 306, textureX, textureY); // Box 495
		bodyModel[412] = new ModelRendererTurbo(this, 36, 314, textureX, textureY); // Box 496
		bodyModel[413] = new ModelRendererTurbo(this, 21, 314, textureX, textureY); // Box 497
		bodyModel[414] = new ModelRendererTurbo(this, 36, 311, textureX, textureY); // Box 498
		bodyModel[415] = new ModelRendererTurbo(this, 21, 311, textureX, textureY); // Box 499
		bodyModel[416] = new ModelRendererTurbo(this, 28, 296, textureX, textureY); // Box 492
		bodyModel[417] = new ModelRendererTurbo(this, 31, 316, textureX, textureY); // Box 498
		bodyModel[418] = new ModelRendererTurbo(this, 26, 316, textureX, textureY); // Box 499
		bodyModel[419] = new ModelRendererTurbo(this, 26, 312, textureX, textureY); // Box 493
		bodyModel[420] = new ModelRendererTurbo(this, 31, 312, textureX, textureY); // Box 493
		bodyModel[421] = new ModelRendererTurbo(this, 2, 299, textureX, textureY); // Box 492
		bodyModel[422] = new ModelRendererTurbo(this, 5, 289, textureX, textureY); // Box 493
		bodyModel[423] = new ModelRendererTurbo(this, 11, 306, textureX, textureY); // Box 494
		bodyModel[424] = new ModelRendererTurbo(this, 2, 306, textureX, textureY); // Box 495
		bodyModel[425] = new ModelRendererTurbo(this, 16, 314, textureX, textureY); // Box 496
		bodyModel[426] = new ModelRendererTurbo(this, 1, 314, textureX, textureY); // Box 497
		bodyModel[427] = new ModelRendererTurbo(this, 16, 311, textureX, textureY); // Box 498
		bodyModel[428] = new ModelRendererTurbo(this, 1, 311, textureX, textureY); // Box 499
		bodyModel[429] = new ModelRendererTurbo(this, 5, 296, textureX, textureY); // Box 492
		bodyModel[430] = new ModelRendererTurbo(this, 11, 316, textureX, textureY); // Box 498
		bodyModel[431] = new ModelRendererTurbo(this, 6, 316, textureX, textureY); // Box 499
		bodyModel[432] = new ModelRendererTurbo(this, 6, 312, textureX, textureY); // Box 493
		bodyModel[433] = new ModelRendererTurbo(this, 11, 312, textureX, textureY); // Box 493
		bodyModel[434] = new ModelRendererTurbo(this, 24, 271, textureX, textureY); // Box 526
		bodyModel[435] = new ModelRendererTurbo(this, 28, 281, textureX, textureY); // Box 527
		bodyModel[436] = new ModelRendererTurbo(this, 37, 270, textureX, textureY); // Box 528
		bodyModel[437] = new ModelRendererTurbo(this, 19, 270, textureX, textureY); // Box 529
		bodyModel[438] = new ModelRendererTurbo(this, 35, 266, textureX, textureY); // Box 530
		bodyModel[439] = new ModelRendererTurbo(this, 17, 266, textureX, textureY); // Box 531
		bodyModel[440] = new ModelRendererTurbo(this, 27, 278, textureX, textureY); // Box 532
		bodyModel[441] = new ModelRendererTurbo(this, 27, 263, textureX, textureY); // Box 533
		bodyModel[442] = new ModelRendererTurbo(this, 22, 265, textureX, textureY); // Box 534
		bodyModel[443] = new ModelRendererTurbo(this, 27, 259, textureX, textureY); // Box 535
		bodyModel[444] = new ModelRendererTurbo(this, 22, 261, textureX, textureY); // Box 546
		bodyModel[445] = new ModelRendererTurbo(this, 28, 268, textureX, textureY); // Box 548
		bodyModel[446] = new ModelRendererTurbo(this, 17, 263, textureX, textureY); // Box 549
		bodyModel[447] = new ModelRendererTurbo(this, 15, 286, textureX, textureY); // Right seat part
		bodyModel[448] = new ModelRendererTurbo(this, 19, 291, textureX, textureY); // Right seat part
		bodyModel[449] = new ModelRendererTurbo(this, 15, 298, textureX, textureY); // Right seat part
		bodyModel[450] = new ModelRendererTurbo(this, 405, 265, textureX, textureY); // Box 38
		bodyModel[451] = new ModelRendererTurbo(this, 402, 269, textureX, textureY); // Box 38
		bodyModel[452] = new ModelRendererTurbo(this, 407, 269, textureX, textureY); // Box 38
		bodyModel[453] = new ModelRendererTurbo(this, 389, 267, textureX, textureY); // Box 38
		bodyModel[454] = new ModelRendererTurbo(this, 392, 272, textureX, textureY); // Box 38
		bodyModel[455] = new ModelRendererTurbo(this, 407, 273, textureX, textureY); // Box 38
		bodyModel[456] = new ModelRendererTurbo(this, 391, 276, textureX, textureY); // Box 38
		bodyModel[457] = new ModelRendererTurbo(this, 400, 276, textureX, textureY, "cull"); // Box 38 cull
		bodyModel[458] = new ModelRendererTurbo(this, 371, 268, textureX, textureY); // Box 38
		bodyModel[459] = new ModelRendererTurbo(this, 374, 273, textureX, textureY); // Box 38
		bodyModel[460] = new ModelRendererTurbo(this, 373, 277, textureX, textureY); // Box 38
		bodyModel[461] = new ModelRendererTurbo(this, 410, 270, textureX, textureY); // Box 38
		bodyModel[462] = new ModelRendererTurbo(this, 337, 258, textureX, textureY); // Box 38
		bodyModel[463] = new ModelRendererTurbo(this, 336, 262, textureX, textureY); // Box 38
		bodyModel[464] = new ModelRendererTurbo(this, 341, 262, textureX, textureY); // Box 38
		bodyModel[465] = new ModelRendererTurbo(this, 337, 266, textureX, textureY); // Box 38
		bodyModel[466] = new ModelRendererTurbo(this, 328, 248, textureX, textureY); // Box 38
		bodyModel[467] = new ModelRendererTurbo(this, 326, 252, textureX, textureY); // Box 38
		bodyModel[468] = new ModelRendererTurbo(this, 332, 252, textureX, textureY); // Box 38
		bodyModel[469] = new ModelRendererTurbo(this, 329, 256, textureX, textureY); // Box 38
		bodyModel[470] = new ModelRendererTurbo(this, 335, 274, textureX, textureY); // Box 38
		bodyModel[471] = new ModelRendererTurbo(this, 329, 264, textureX, textureY, "cull"); // Box 38 cull
		bodyModel[472] = new ModelRendererTurbo(this, 337, 279, textureX, textureY); // Box 38
		bodyModel[473] = new ModelRendererTurbo(this, 324, 240, textureX, textureY, "cull"); // Box 38 cull
		bodyModel[474] = new ModelRendererTurbo(this, 398, 263, textureX, textureY, "cull"); // Box 38 cull
		bodyModel[475] = new ModelRendererTurbo(this, 331, 241, textureX, textureY, "cull"); // Box 38 cull
		bodyModel[476] = new ModelRendererTurbo(this, 317, 241, textureX, textureY, "cull"); // Box 38 cull
		bodyModel[477] = new ModelRendererTurbo(this, 319, 258, textureX, textureY); // Box 349
		bodyModel[478] = new ModelRendererTurbo(this, 319, 244, textureX, textureY); // Box 349
		bodyModel[479] = new ModelRendererTurbo(this, 321, 249, textureX, textureY); // Box 349
		bodyModel[480] = new ModelRendererTurbo(this, 315, 267, textureX, textureY); // Box 38
		bodyModel[481] = new ModelRendererTurbo(this, 315, 278, textureX, textureY, "cull"); // Box 38 cull
		bodyModel[482] = new ModelRendererTurbo(this, 315, 273, textureX, textureY); // Box 38
		bodyModel[483] = new ModelRendererTurbo(this, 318, 262, textureX, textureY); // Box 38
		bodyModel[484] = new ModelRendererTurbo(this, 353, 243, textureX, textureY); // Box 128
		bodyModel[485] = new ModelRendererTurbo(this, 84, 252, textureX, textureY); // Box 128
		bodyModel[486] = new ModelRendererTurbo(this, 2, 1, textureX, textureY); // Box 128
		bodyModel[487] = new ModelRendererTurbo(this, 55, 23, textureX, textureY); // Box 548
		bodyModel[488] = new ModelRendererTurbo(this, 30, 96, textureX, textureY); // Box 2
		bodyModel[489] = new ModelRendererTurbo(this, 69, 148, textureX, textureY); // Box 128
		bodyModel[490] = new ModelRendererTurbo(this, 69, 138, textureX, textureY); // Box 553
		bodyModel[491] = new ModelRendererTurbo(this, 69, 151, textureX, textureY); // Box 2
		bodyModel[492] = new ModelRendererTurbo(this, 69, 141, textureX, textureY); // Box 30
		bodyModel[493] = new ModelRendererTurbo(this, 68, 1, textureX, textureY); // Box 170
		bodyModel[494] = new ModelRendererTurbo(this, 70, 22, textureX, textureY); // Box 524
		bodyModel[495] = new ModelRendererTurbo(this, 68, 0, textureX, textureY); // Box 170
		bodyModel[496] = new ModelRendererTurbo(this, 1, 191, textureX, textureY); // Box 128
		bodyModel[497] = new ModelRendererTurbo(this, 85, 1, textureX, textureY); // Box 169
		bodyModel[498] = new ModelRendererTurbo(this, 102, 13, textureX, textureY); // Box 530
		bodyModel[499] = new ModelRendererTurbo(this, 102, 8, textureX, textureY); // Box 531

		bodyModel[0].addBox(0F, 0F, 0F, 117, 2, 22, 0F); // Box 2
		bodyModel[0].setRotationPoint(-60F, 1F, -11F);

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

		bodyModel[9].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 2
		bodyModel[9].setRotationPoint(-60F, 4F, 10F);

		bodyModel[10].addBox(1F, 0F, 0F, 7, 1, 1, 0F); // Box 2
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

		bodyModel[25].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 30
		bodyModel[25].setRotationPoint(-60F, 4F, -11F);

		bodyModel[26].addBox(1F, 0F, 0F, 7, 1, 1, 0F); // Box 31
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

		bodyModel[71].addShapeBox(0F, 0F, 0F, 4, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[71].setRotationPoint(-16F, 3F, -7.25F);
		bodyModel[71].rotateAngleX = -0.78539816F;

		bodyModel[72].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 41
		bodyModel[72].setRotationPoint(-16.01F, 3F, -7.75F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 41
		bodyModel[73].setRotationPoint(-11.99F, 3F, -7.75F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[74].setRotationPoint(-20.5F, 3F, -9F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 0, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 26
		bodyModel[75].setRotationPoint(57F, 3F, -10F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 0, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -1.6F, 0F, -0.4F, -1.6F); // Box 26
		bodyModel[76].setRotationPoint(57F, 4F, -10F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 0, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 26
		bodyModel[77].setRotationPoint(61F, 3F, -10F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 0, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -1.6F, 0F, -0.4F, -1.6F); // Box 26
		bodyModel[78].setRotationPoint(61F, 4F, -10F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F); // Box 24
		bodyModel[79].setRotationPoint(61.01F, 3F, -9F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F); // Box 24
		bodyModel[80].setRotationPoint(56.99F, 3F, -9F);

		bodyModel[81].addShapeBox(0F, 1F, 1F, 4, 2, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Left step part
		bodyModel[81].setRotationPoint(57.01F, 4F, -8F);

		bodyModel[82].addShapeBox(0F, 1F, -1F, 4, 0, 2, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Left step part
		bodyModel[82].setRotationPoint(57.01F, 4F, -8F);

		bodyModel[83].addShapeBox(0F, -1F, -1F, 4, 2, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Left step part
		bodyModel[83].setRotationPoint(57.01F, 4F, -8F);

		bodyModel[84].addShapeBox(0F, -1F, -3F, 4, 0, 2, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Left step part
		bodyModel[84].setRotationPoint(57.01F, 4F, -8F);

		bodyModel[85].addShapeBox(0F, -3F, -3F, 4, 3, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Left step part
		bodyModel[85].setRotationPoint(57.01F, 4F, -8F);

		bodyModel[86].addShapeBox(0F, 1F, -3F, 0, 2, 4, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Left step part
		bodyModel[86].setRotationPoint(57.01F, 4F, -8F);

		bodyModel[87].addShapeBox(0F, 0F, -3F, 0, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Left step part
		bodyModel[87].setRotationPoint(57.01F, 4F, -8F);

		bodyModel[88].addShapeBox(0F, -3F, -3F, 0, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left step part
		bodyModel[88].setRotationPoint(57.01F, 4F, -8F);

		bodyModel[89].addShapeBox(0F, 1F, -3F, 0, 2, 4, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Left step part
		bodyModel[89].setRotationPoint(60.99F, 4F, -8F);

		bodyModel[90].addShapeBox(0F, 0F, -3F, 0, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Left step part
		bodyModel[90].setRotationPoint(60.99F, 4F, -8F);

		bodyModel[91].addShapeBox(0F, -3F, -3F, 0, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left step part
		bodyModel[91].setRotationPoint(60.99F, 4F, -8F);

		bodyModel[92].addShapeBox(0F, 0F, -3F, 4, 2, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.02F, 0F, -0.5F, -0.02F, 0F, 0.5F, 0F, 0F, 0.5F); // Left step part
		bodyModel[92].setRotationPoint(57.01F, 4F, -8F);

		bodyModel[93].addShapeBox(0F, 2F, -2.5F, 4, 0, 4, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 1F, -0.5F, 0F, 1F, -0.5F); // Left step part
		bodyModel[93].setRotationPoint(57.01F, 4F, -8F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 0, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 140
		bodyModel[94].setRotationPoint(57F, 3F, 7F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 0, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, -1.6F, 0F, -0.4F, -1.6F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F); // Box 141
		bodyModel[95].setRotationPoint(57F, 4F, 8F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 0, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 142
		bodyModel[96].setRotationPoint(61F, 3F, 7F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 0, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, -1.6F, 0F, -0.4F, -1.6F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F); // Box 143
		bodyModel[97].setRotationPoint(61F, 4F, 8F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 144
		bodyModel[98].setRotationPoint(61.01F, 3F, 8F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 145
		bodyModel[99].setRotationPoint(56.99F, 3F, 8F);

		bodyModel[100].addShapeBox(0F, 1F, -1F, 4, 2, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Right step part
		bodyModel[100].setRotationPoint(57.01F, 4F, 8F);

		bodyModel[101].addShapeBox(0F, 1F, -1F, 4, 0, 2, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Right step part
		bodyModel[101].setRotationPoint(57.01F, 4F, 8F);

		bodyModel[102].addShapeBox(0F, -1F, 1F, 4, 2, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Right step part
		bodyModel[102].setRotationPoint(57.01F, 4F, 8F);

		bodyModel[103].addShapeBox(0F, -1F, 1F, 4, 0, 2, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Right step part
		bodyModel[103].setRotationPoint(57.01F, 4F, 8F);

		bodyModel[104].addShapeBox(0F, -3F, 3F, 4, 3, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Right step part
		bodyModel[104].setRotationPoint(57.01F, 4F, 8F);

		bodyModel[105].addShapeBox(0F, 1F, -1F, 0, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F); // Right step part
		bodyModel[105].setRotationPoint(57.01F, 4F, 8F);

		bodyModel[106].addShapeBox(0F, 0F, -1F, 0, 1, 4, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Right step part
		bodyModel[106].setRotationPoint(57.01F, 4F, 8F);

		bodyModel[107].addShapeBox(0F, -3F, 0F, 0, 3, 3, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right step part
		bodyModel[107].setRotationPoint(57.01F, 4F, 8F);

		bodyModel[108].addShapeBox(0F, 1F, -1F, 0, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F); // Right step part
		bodyModel[108].setRotationPoint(60.99F, 4F, 8F);

		bodyModel[109].addShapeBox(0F, 0F, -1F, 0, 1, 4, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Right step part
		bodyModel[109].setRotationPoint(60.99F, 4F, 8F);

		bodyModel[110].addShapeBox(0F, -3F, 0F, 0, 3, 3, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right step part
		bodyModel[110].setRotationPoint(60.99F, 4F, 8F);

		bodyModel[111].addShapeBox(0F, 0F, 3F, 4, 2, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.02F, 0F, 0.5F, -0.02F, 0F, -0.5F, 0F, 0F, -0.5F); // Right step part
		bodyModel[111].setRotationPoint(57.01F, 4F, 8F);

		bodyModel[112].addShapeBox(0F, 2F, -1.5F, 4, 0, 4, 0F,0F, -1F, -0.5F, -0.02F, -1F, -0.5F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -0.5F, -0.02F, 1F, -0.5F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Right step part
		bodyModel[112].setRotationPoint(57.01F, 4F, 8F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 4, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F); // Left trapdoor
		bodyModel[113].setRotationPoint(57F, 1F, -10.99F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 4, 1, 6, 0F,0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F); // Right trapdoor
		bodyModel[114].setRotationPoint(57F, 1F, 4.99F);

		bodyModel[115].addShapeBox(0F, 0F, -1F, 4, 15, 1, 0F,0F, 0F, -0.5F, -0.02F, 0F, -0.5F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.02F, 0F, -0.5F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Left side door
		bodyModel[115].setRotationPoint(57.01F, -14F, -10.5F);

		bodyModel[116].addBox(0F, 0F, 0F, 117, 16, 1, 0F); // Box 38
		bodyModel[116].setRotationPoint(-60F, -15F, -11F);

		bodyModel[117].addBox(0F, 0F, 0F, 117, 16, 1, 0F); // Box 128
		bodyModel[117].setRotationPoint(-60F, -15F, 10F);

		bodyModel[118].addBox(0F, 0F, 0F, 1, 16, 7, 0F); // Box 128
		bodyModel[118].setRotationPoint(56F, -15F, -10F);

		bodyModel[119].addBox(0F, 0F, 0F, 1, 16, 7, 0F); // Box 128
		bodyModel[119].setRotationPoint(56F, -15F, 3F);

		bodyModel[120].addBox(0F, 0F, 0F, 1, 16, 8, 0F); // Box 128
		bodyModel[120].setRotationPoint(61F, -15F, -11F);

		bodyModel[121].addBox(0F, 0F, 0F, 1, 16, 8, 0F); // Box 128
		bodyModel[121].setRotationPoint(61F, -15F, 3F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 4, 15, 1, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, -0.5F, 0F, 0F, -0.5F); // Right side door
		bodyModel[122].setRotationPoint(57.01F, -14F, 10.5F);

		bodyModel[123].addBox(0F, 0F, 0F, 1, 16, 7, 0F); // Box 128
		bodyModel[123].setRotationPoint(-61F, -15F, -10F);

		bodyModel[124].addBox(0F, 0F, 0F, 1, 16, 7, 0F); // Box 128
		bodyModel[124].setRotationPoint(-61F, -15F, 3F);

		bodyModel[125].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Box 128
		bodyModel[125].setRotationPoint(56F, -15F, -3F);

		bodyModel[126].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Box 128
		bodyModel[126].setRotationPoint(61F, -15F, -3F);

		bodyModel[127].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Box 128
		bodyModel[127].setRotationPoint(-61F, -15F, -3F);

		bodyModel[128].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 128
		bodyModel[128].setRotationPoint(57F, -15F, -11F);

		bodyModel[129].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 128
		bodyModel[129].setRotationPoint(57F, -15F, 10F);

		bodyModel[130].addShapeBox(0F, 0F, -6F, 1, 15, 6, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Vestibule door
		bodyModel[130].setRotationPoint(56.01F, -14F, 3F);

		bodyModel[131].addShapeBox(-1F, 0F, 0F, 1, 15, 6, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Front end door
		bodyModel[131].setRotationPoint(-59.99F, -14F, -3F);

		bodyModel[132].addBox(0F, 0F, 0F, 1, 1, 8, 0F); // Box 128
		bodyModel[132].setRotationPoint(62F, -15F, -4F);

		bodyModel[133].addBox(0F, 0F, 0F, 1, 1, 8, 0F); // Box 128
		bodyModel[133].setRotationPoint(62F, 1F, -4F);

		bodyModel[134].addBox(0F, 0F, 0F, 1, 15, 1, 0F); // Box 128
		bodyModel[134].setRotationPoint(62F, -14F, -4F);

		bodyModel[135].addBox(0F, 0F, 0F, 1, 15, 1, 0F); // Box 128
		bodyModel[135].setRotationPoint(62F, -14F, 3F);

		bodyModel[136].addBox(0F, 0F, 0F, 1, 15, 2, 0F); // Box 128
		bodyModel[136].setRotationPoint(63F, -14F, -5F);

		bodyModel[137].addBox(0F, 0F, 0F, 1, 15, 2, 0F); // Box 128
		bodyModel[137].setRotationPoint(63F, -14F, 3F);

		bodyModel[138].addBox(0F, 0F, 0F, 1, 1, 10, 0F); // Box 128
		bodyModel[138].setRotationPoint(63F, 1F, -5F);

		bodyModel[139].addBox(0F, 0F, 0F, 1, 1, 10, 0F); // Box 128
		bodyModel[139].setRotationPoint(63F, -15F, -5F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[140].setRotationPoint(63F, -16F, -5F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 153
		bodyModel[141].setRotationPoint(63F, -16F, 0F);

		bodyModel[142].addBox(0F, 0F, 0F, 1, 1, 8, 0F); // Box 128
		bodyModel[142].setRotationPoint(-62F, -15F, -4F);

		bodyModel[143].addBox(0F, 0F, 0F, 1, 1, 8, 0F); // Box 128
		bodyModel[143].setRotationPoint(-62F, 1F, -4F);

		bodyModel[144].addBox(0F, 0F, 0F, 1, 15, 1, 0F); // Box 128
		bodyModel[144].setRotationPoint(-62F, -14F, -4F);

		bodyModel[145].addBox(0F, 0F, 0F, 1, 15, 1, 0F); // Box 128
		bodyModel[145].setRotationPoint(-62F, -14F, 3F);

		bodyModel[146].addBox(0F, 0F, 0F, 1, 15, 2, 0F); // Box 128
		bodyModel[146].setRotationPoint(-63F, -14F, -5F);

		bodyModel[147].addBox(0F, 0F, 0F, 1, 15, 2, 0F); // Box 128
		bodyModel[147].setRotationPoint(-63F, -14F, 3F);

		bodyModel[148].addBox(0F, 0F, 0F, 1, 1, 10, 0F); // Box 128
		bodyModel[148].setRotationPoint(-63F, 1F, -5F);

		bodyModel[149].addBox(0F, 0F, 0F, 1, 1, 10, 0F); // Box 128
		bodyModel[149].setRotationPoint(-63F, -15F, -5F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[150].setRotationPoint(-63F, -16F, -5F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 153
		bodyModel[151].setRotationPoint(-63F, -16F, 0F);

		bodyModel[152].addBox(0F, 0F, 0F, 119, 1, 6, 0F); // Box 128
		bodyModel[152].setRotationPoint(-57F, -20F, -3F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 119, 1, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[153].setRotationPoint(-57F, -20F, -7F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 119, 1, 3, 0F,0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[154].setRotationPoint(-57F, -19F, -10F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 119, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 168
		bodyModel[155].setRotationPoint(-57F, -20F, 3F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 119, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F); // Box 169
		bodyModel[156].setRotationPoint(-57F, -19F, 7F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 122, 1, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 1.25F, -1F, 0F, 1.25F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 128
		bodyModel[157].setRotationPoint(-60F, -16F, -11F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 122, 1, 2, 0F,0F, 1.25F, 0F, 0F, 1.25F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 170
		bodyModel[158].setRotationPoint(-60F, -16F, 10F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 0, 8, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Rear gate closed
		bodyModel[159].setRotationPoint(63F, -7F, -3F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 0, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Rear gate open
		bodyModel[160].setRotationPoint(63F, -7F, -3F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 6, 1, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[161].setRotationPoint(56F, -19F, -7F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 6, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 177
		bodyModel[162].setRotationPoint(56F, -19F, 3F);

		bodyModel[163].addBox(0F, 0F, 0F, 6, 1, 6, 0F); // Box 128
		bodyModel[163].setRotationPoint(56F, -19F, -3F);

		bodyModel[164].addBox(0F, 0F, 0F, 6, 3, 14, 0F); // Box 128
		bodyModel[164].setRotationPoint(56F, -18F, -7F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 6, 3, 3, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[165].setRotationPoint(56F, -18F, -10F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 6, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 176
		bodyModel[166].setRotationPoint(56F, -18F, 7F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 1.25F, 0F, 0F, 1.25F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[167].setRotationPoint(15.75F, 4F, -10.5F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, -1.125F, 0F, 0F, -1.125F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, -0.875F, 0F, 0F, -0.875F, 0F, 0F, 0.25F, 0F); // Box 38
		bodyModel[168].setRotationPoint(19.75F, 4F, -10.5F);

		bodyModel[169].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 38
		bodyModel[169].setRotationPoint(18.75F, 4F, -10.5F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.25F, -1.375F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.25F, -1.375F, 0F, -0.25F, -0.375F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.25F, -0.375F, 0F); // Box 38
		bodyModel[170].setRotationPoint(14.75F, 3.75F, -10.5F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 41
		bodyModel[171].setRotationPoint(16.05F, 4.2F, -9.5F);
		bodyModel[171].rotateAngleZ = -0.78539816F;

		bodyModel[172].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 41
		bodyModel[172].setRotationPoint(19.25F, 4.2F, -9.5F);
		bodyModel[172].rotateAngleZ = -0.78539816F;

		bodyModel[173].addShapeBox(0F, 0F, 0F, 1, 3, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 41
		bodyModel[173].setRotationPoint(15.55F, 3F, -5.49F);

		bodyModel[174].addShapeBox(0F, 0F, 0F, 1, 3, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 41
		bodyModel[174].setRotationPoint(18.75F, 3F, -5.49F);

		bodyModel[175].addShapeBox(0F, 0F, 0F, 1, 3, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 41
		bodyModel[175].setRotationPoint(18.75F, 3F, -9.51F);

		bodyModel[176].addShapeBox(0F, 0F, 0F, 1, 3, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 41
		bodyModel[176].setRotationPoint(15.55F, 3F, -9.51F);

		bodyModel[177].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[177].setRotationPoint(56.5F, -6F, -12F);

		bodyModel[178].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[178].setRotationPoint(61.5F, -6F, -12F);

		bodyModel[179].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 202
		bodyModel[179].setRotationPoint(56.5F, -6F, 11F);

		bodyModel[180].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 203
		bodyModel[180].setRotationPoint(61.5F, -6F, 11F);

		bodyModel[181].addShapeBox(0F, 0F, -1F, 0, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[181].setRotationPoint(-60F, -6F, -11F);
		bodyModel[181].rotateAngleY = -0.78539816F;

		bodyModel[182].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 202
		bodyModel[182].setRotationPoint(-60F, -6F, 11F);
		bodyModel[182].rotateAngleY = 0.78539816F;

		bodyModel[183].addShapeBox(0F, 0F, 0F, 3, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[183].setRotationPoint(-61F, 6F, -10.5F);

		bodyModel[184].addShapeBox(0F, 0F, 0F, 3, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 205
		bodyModel[184].setRotationPoint(-61F, 6F, 10.5F);

		bodyModel[185].addShapeBox(0F, 0F, 0F, 2, 18, 0, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[185].setRotationPoint(62F, -15F, -11F);

		bodyModel[186].addShapeBox(0F, 0F, 0F, 2, 0, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 2.25F, -1F, 0F, 2.25F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -2.25F, -1F, 0F, -2.25F, -1F); // Box 128
		bodyModel[186].setRotationPoint(62F, -15F, -11F);

		bodyModel[187].addShapeBox(0F, 0F, 0F, 2, 0, 3, 0F,0F, -1.75F, 0F, -0.5F, -1.75F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 1.75F, 0F, -0.5F, 1.75F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[187].setRotationPoint(62F, -19F, -10F);

		bodyModel[188].addShapeBox(0F, 0F, 0F, 2, 0, 4, 0F,0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -0.5F, 1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[188].setRotationPoint(62F, -20F, -7F);

		bodyModel[189].addShapeBox(0F, 0F, 0F, 2, 0, 6, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[189].setRotationPoint(62F, -20F, -3F);

		bodyModel[190].addShapeBox(0F, 0F, 0F, 2, 18, 0, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 248
		bodyModel[190].setRotationPoint(62F, -15F, 11F);

		bodyModel[191].addShapeBox(0F, 0F, 0F, 2, 0, 2, 0F,0F, 2.25F, -1F, -0.5F, 2.25F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -2.25F, -1F, -0.5F, -2.25F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 250
		bodyModel[191].setRotationPoint(62F, -15F, 9F);

		bodyModel[192].addShapeBox(0F, 0F, 0F, 2, 0, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 1.75F, 0F, 0F, 1.75F, 0F); // Box 252
		bodyModel[192].setRotationPoint(62F, -19F, 7F);

		bodyModel[193].addShapeBox(0F, 0F, 0F, 2, 0, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 1F, 0F, 0F, 1F, 0F); // Box 254
		bodyModel[193].setRotationPoint(62F, -20F, 3F);

		bodyModel[194].addShapeBox(0F, 0F, 0F, 1, 18, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[194].setRotationPoint(63.5F, -15F, -11F);

		bodyModel[195].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 1.25F, -1F, 0F, 1.25F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F); // Box 128
		bodyModel[195].setRotationPoint(63.5F, -16F, -11F);

		bodyModel[196].addShapeBox(0F, 0F, 0F, 1, 1, 20, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[196].setRotationPoint(63.5F, 1F, -10F);

		bodyModel[197].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -1.75F, 0F, -0.5F, -1.75F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 1.75F, 0F, -0.5F, 1.75F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[197].setRotationPoint(63.5F, -19F, -10F);

		bodyModel[198].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -0.5F, 1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[198].setRotationPoint(63.5F, -20F, -7F);

		bodyModel[199].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[199].setRotationPoint(63.5F, -20F, -3F);

		bodyModel[200].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[200].setRotationPoint(63.5F, -19F, -1F);

		bodyModel[201].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 128
		bodyModel[201].setRotationPoint(63.5F, -18.75F, -5F);

		bodyModel[202].addShapeBox(0F, 0F, 0F, 1, 18, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 247
		bodyModel[202].setRotationPoint(63.5F, -15F, 10F);

		bodyModel[203].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 1.25F, -1F, -0.5F, 1.25F, -1F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 249
		bodyModel[203].setRotationPoint(63.5F, -16F, 9F);

		bodyModel[204].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 1.75F, 0F, 0F, 1.75F, 0F); // Box 251
		bodyModel[204].setRotationPoint(63.5F, -19F, 7F);

		bodyModel[205].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 1F, 0F, 0F, 1F, 0F); // Box 253
		bodyModel[205].setRotationPoint(63.5F, -20F, 3F);

		bodyModel[206].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 255
		bodyModel[206].setRotationPoint(63.5F, -18.75F, 4F);

		bodyModel[207].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[207].setRotationPoint(63.5F, -15F, -5F);

		bodyModel[208].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.8F, 0F, -0.5F, -0.8F, 0F, -0.5F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[208].setRotationPoint(63.5F, -16F, -4F);

		bodyModel[209].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 153
		bodyModel[209].setRotationPoint(63.5F, -16F, 1F);

		bodyModel[210].addShapeBox(0F, 0F, 0F, 1, 15, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[210].setRotationPoint(63.5F, -14F, -5F);

		bodyModel[211].addShapeBox(0F, 0F, 0F, 1, 15, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[211].setRotationPoint(63.5F, -14F, 3F);

		bodyModel[212].addShapeBox(0F, 0F, 0F, 2, 15, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[212].setRotationPoint(62F, -14F, 3F);

		bodyModel[213].addShapeBox(0F, 0F, 0F, 2, 15, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[213].setRotationPoint(62F, -14F, -4F);

		bodyModel[214].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[214].setRotationPoint(62F, -15F, -4F);

		bodyModel[215].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[215].setRotationPoint(62F, 1F, -4F);

		bodyModel[216].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, -0.5F, 0F, -0.35F, -0.5F, 0F, -0.51F, 0F, 0F, -0.51F, 0F); // Box 204
		bodyModel[216].setRotationPoint(45.5F, -19.36F, -8.36F);
		bodyModel[216].rotateAngleX = -1.04283423F;

		bodyModel[217].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0F, 0.16F, -0.5F, 0F, 0.16F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.54F, -0.5F, 0F, -0.54F, -0.5F, 0F, -0.54F, 0F, 0F, -0.54F, 0F); // Box 205
		bodyModel[217].setRotationPoint(45.5F, -17.65F, -10.92F);
		bodyModel[217].rotateAngleX = -0.41887902F;

		bodyModel[218].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,-0.6F, -0.75F, 0F, -0.6F, -0.75F, 0F, -0.5F, -0.35F, 0F, -0.5F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.25F, 0F, 0F, -2.25F, 0F); // Box 190
		bodyModel[218].setRotationPoint(-48F, -18F, -11F);

		bodyModel[219].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,-0.5F, -0.85F, 0F, -0.5F, -0.85F, 0F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -1F, 0.15F, 0F, -1F, 0.15F); // Box 191
		bodyModel[219].setRotationPoint(-48F, -18.5F, -10F);

		bodyModel[220].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.51F, 0F, 0F, -0.51F, 0F, 0F, -0.35F, -0.5F, 0F, -0.35F, -0.5F); // Box 128
		bodyModel[220].setRotationPoint(44.5F, -18.5F, 7.85F);
		bodyModel[220].rotateAngleX = 1.04283423F;

		bodyModel[221].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.16F, -0.5F, 0F, 0.16F, -0.5F, 0F, -0.54F, 0F, 0F, -0.54F, 0F, 0F, -0.54F, -0.5F, 0F, -0.54F, -0.5F); // Box 128
		bodyModel[221].setRotationPoint(44.5F, -17.25F, 10F);
		bodyModel[221].rotateAngleX = 0.41887902F;

		bodyModel[222].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,-0.5F, -0.35F, 0F, -0.5F, -0.35F, 0F, -0.6F, -0.75F, 0F, -0.6F, -0.75F, 0F, 0F, -2.25F, 0F, 0F, -2.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 275
		bodyModel[222].setRotationPoint(52F, -18F, 10F);

		bodyModel[223].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, 0.15F, 0F, 0F, 0.15F, -0.5F, -0.85F, 0F, -0.5F, -0.85F, 0F, 0F, -1F, 0.15F, 0F, -1F, 0.15F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 276
		bodyModel[223].setRotationPoint(52F, -18.5F, 8F);

		bodyModel[224].addBox(0F, 0F, 0F, 1, 16, 8, 0F); // Box 209
		bodyModel[224].setRotationPoint(-44F, -15F, -10F);

		bodyModel[225].addBox(0F, 0F, 0F, 14, 3, 14, 0F); // Box 128
		bodyModel[225].setRotationPoint(-57F, -18F, -7F);

		bodyModel[226].addShapeBox(0F, 0F, 0F, 14, 3, 3, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[226].setRotationPoint(-57F, -18F, -10F);

		bodyModel[227].addShapeBox(0F, 0F, 0F, 14, 1, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[227].setRotationPoint(-57F, -19F, -7F);

		bodyModel[228].addShapeBox(0F, 0F, 0F, 14, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 176
		bodyModel[228].setRotationPoint(-57F, -18F, 7F);

		bodyModel[229].addBox(0F, 0F, 0F, 14, 1, 6, 0F); // Box 128
		bodyModel[229].setRotationPoint(-57F, -19F, -3F);

		bodyModel[230].addShapeBox(0F, 0F, 0F, 14, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 177
		bodyModel[230].setRotationPoint(-57F, -19F, 3F);

		bodyModel[231].addBox(0F, 0F, 0F, 1, 16, 8, 0F); // Box 209
		bodyModel[231].setRotationPoint(-44F, -15F, 2F);

		bodyModel[232].addBox(0F, 0F, 0F, 1, 16, 15, 0F); // Box 128
		bodyModel[232].setRotationPoint(36F, -15F, -5F);

		bodyModel[233].addShapeBox(0F, 0F, 0F, 20, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 177
		bodyModel[233].setRotationPoint(36F, -19F, 3F);

		bodyModel[234].addBox(0F, 0F, 0F, 20, 3, 14, 0F); // Box 128
		bodyModel[234].setRotationPoint(36F, -18F, -7F);

		bodyModel[235].addShapeBox(0F, 0F, 0F, 20, 3, 3, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[235].setRotationPoint(36F, -18F, -10F);

		bodyModel[236].addShapeBox(0F, 0F, 0F, 20, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 176
		bodyModel[236].setRotationPoint(36F, -18F, 7F);

		bodyModel[237].addShapeBox(0F, 0F, 0F, 20, 1, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[237].setRotationPoint(36F, -19F, -7F);

		bodyModel[238].addBox(0F, 0F, 0F, 20, 1, 6, 0F); // Box 128
		bodyModel[238].setRotationPoint(36F, -19F, -3F);

		bodyModel[239].addBox(0F, 0F, 0F, 7, 16, 1, 0F); // Box 128
		bodyModel[239].setRotationPoint(37F, -15F, -6F);

		bodyModel[240].addBox(0F, 0F, 0F, 1, 16, 16, 0F); // Box 128
		bodyModel[240].setRotationPoint(44F, -15F, -6F);

		bodyModel[241].addBox(0F, 0F, 0F, 2, 16, 6, 0F); // Box 128
		bodyModel[241].setRotationPoint(48F, -15F, -10F);

		bodyModel[242].addBox(0F, 0F, 0F, 6, 1, 6, 0F); // Box 38
		bodyModel[242].setRotationPoint(50F, -10F, -10F);

		bodyModel[243].addBox(0F, 0F, 0F, 6, 1, 6, 0F); // Box 38
		bodyModel[243].setRotationPoint(50F, -4F, -10F);

		bodyModel[244].addBox(0F, 0F, 0F, 8, 16, 1, 0F); // Box 128
		bodyModel[244].setRotationPoint(45F, -15F, 3F);

		bodyModel[245].addBox(0F, 0F, 0F, 3, 16, 1, 0F); // Box 128
		bodyModel[245].setRotationPoint(53F, -15F, 4F);

		bodyModel[246].addBox(0F, 0F, 0F, 1, 16, 6, 0F); // Box 128
		bodyModel[246].setRotationPoint(49F, -15F, 4F);

		bodyModel[247].addBox(0F, 0F, 0F, 79, 1, 4, 0F); // Box 38
		bodyModel[247].setRotationPoint(-43F, -19F, -2F);

		bodyModel[248].addShapeBox(0F, 0F, 0F, 1, 16, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[248].setRotationPoint(36F, -15F, -6F);

		bodyModel[249].addBox(0F, 0F, 0F, 79, 1, 3, 0F); // Box 38
		bodyModel[249].setRotationPoint(-43F, -14F, 7F);

		bodyModel[250].addShapeBox(0F, 0F, 0F, 79, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[250].setRotationPoint(-43F, -13F, 9F);

		bodyModel[251].addBox(0F, 0F, 0F, 70, 1, 3, 0F); // Box 275
		bodyModel[251].setRotationPoint(-43F, -14F, -10F);

		bodyModel[252].addShapeBox(0F, 0F, 0F, 70, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 276
		bodyModel[252].setRotationPoint(-43F, -13F, -10F);

		bodyModel[253].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 275
		bodyModel[253].setRotationPoint(29F, -14F, -10F);

		bodyModel[254].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 275
		bodyModel[254].setRotationPoint(27F, -14F, -10F);

		bodyModel[255].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 275
		bodyModel[255].setRotationPoint(27F, -14F, -8F);

		bodyModel[256].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, 0F); // Box 276
		bodyModel[256].setRotationPoint(27F, -13F, -10F);

		bodyModel[257].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38 glow
		bodyModel[257].setRotationPoint(-38F, -18F, -0.5F);

		bodyModel[258].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38 glow
		bodyModel[258].setRotationPoint(-28F, -18F, -0.5F);

		bodyModel[259].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38 glow
		bodyModel[259].setRotationPoint(-18F, -18F, -0.5F);

		bodyModel[260].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38 glow
		bodyModel[260].setRotationPoint(-8F, -18F, -0.5F);

		bodyModel[261].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38 glow
		bodyModel[261].setRotationPoint(2F, -18F, -0.5F);

		bodyModel[262].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38 glow
		bodyModel[262].setRotationPoint(12F, -18F, -0.5F);

		bodyModel[263].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38 glow
		bodyModel[263].setRotationPoint(22F, -18F, -0.5F);

		bodyModel[264].addBox(0.5F, 0F, 2F, 2, 6, 1, 0F); // Right seat part
		bodyModel[264].setRotationPoint(-36.5F, -5F, 7F);

		bodyModel[265].addBox(0.5F, 0F, -3F, 2, 6, 1, 0F); // Right seat part
		bodyModel[265].setRotationPoint(-36.5F, -5F, 7F);

		bodyModel[266].addBox(-1.5F, 0F, -2F, 5, 2, 4, 0F); // Right seat part
		bodyModel[266].setRotationPoint(-36.5F, -3F, 7F);

		bodyModel[267].addShapeBox(-2.5F, 0F, -2F, 1, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Right seat part
		bodyModel[267].setRotationPoint(-36.5F, -3F, 7F);

		bodyModel[268].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[268].setRotationPoint(-36.5F, -8F, 7F);

		bodyModel[269].addBox(-2.5F, 0F, -3F, 3, 5, 1, 0F); // Right seat part
		bodyModel[269].setRotationPoint(-36.5F, -4F, 7F);

		bodyModel[270].addShapeBox(-2.5F, 0F, -3F, 3, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[270].setRotationPoint(-36.5F, -5F, 7F);

		bodyModel[271].addBox(-2.5F, 0F, 2F, 3, 5, 1, 0F); // Right seat part
		bodyModel[271].setRotationPoint(-36.5F, -4F, 7F);

		bodyModel[272].addShapeBox(-2.5F, 0F, 2F, 3, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[272].setRotationPoint(-36.5F, -5F, 7F);

		bodyModel[273].addBox(0.5F, 0F, -3F, 2, 6, 1, 0F); // Left seat part
		bodyModel[273].setRotationPoint(-36.5F, -5F, -7F);

		bodyModel[274].addBox(0.5F, 0F, 2F, 2, 6, 1, 0F); // Left seat part
		bodyModel[274].setRotationPoint(-36.5F, -5F, -7F);

		bodyModel[275].addBox(-1.5F, 0F, -2F, 5, 2, 4, 0F); // Left seat part
		bodyModel[275].setRotationPoint(-36.5F, -3F, -7F);

		bodyModel[276].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[276].setRotationPoint(-36.5F, -8F, -7F);

		bodyModel[277].addBox(-2.5F, 0F, 2F, 3, 5, 1, 0F); // Left seat part
		bodyModel[277].setRotationPoint(-36.5F, -4F, -7F);

		bodyModel[278].addShapeBox(-2.5F, 0F, 2F, 3, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[278].setRotationPoint(-36.5F, -5F, -7F);

		bodyModel[279].addBox(-2.5F, 0F, -3F, 3, 5, 1, 0F); // Left seat part
		bodyModel[279].setRotationPoint(-36.5F, -4F, -7F);

		bodyModel[280].addShapeBox(-2.5F, 0F, -3F, 3, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[280].setRotationPoint(-36.5F, -5F, -7F);

		bodyModel[281].addBox(0.5F, 0F, 2F, 2, 6, 1, 0F); // Right seat part
		bodyModel[281].setRotationPoint(-26.5F, -5F, 7F);

		bodyModel[282].addBox(0.5F, 0F, -3F, 2, 6, 1, 0F); // Right seat part
		bodyModel[282].setRotationPoint(-26.5F, -5F, 7F);

		bodyModel[283].addBox(-1.5F, 0F, -2F, 5, 2, 4, 0F); // Right seat part
		bodyModel[283].setRotationPoint(-26.5F, -3F, 7F);

		bodyModel[284].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[284].setRotationPoint(-26.5F, -8F, 7F);

		bodyModel[285].addBox(-2.5F, 0F, -3F, 3, 5, 1, 0F); // Right seat part
		bodyModel[285].setRotationPoint(-26.5F, -4F, 7F);

		bodyModel[286].addShapeBox(-2.5F, 0F, -3F, 3, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[286].setRotationPoint(-26.5F, -5F, 7F);

		bodyModel[287].addBox(-2.5F, 0F, 2F, 3, 5, 1, 0F); // Right seat part
		bodyModel[287].setRotationPoint(-26.5F, -4F, 7F);

		bodyModel[288].addShapeBox(-2.5F, 0F, 2F, 3, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[288].setRotationPoint(-26.5F, -5F, 7F);

		bodyModel[289].addBox(0.5F, 0F, -3F, 2, 6, 1, 0F); // Left seat part
		bodyModel[289].setRotationPoint(-26.5F, -5F, -7F);

		bodyModel[290].addBox(0.5F, 0F, 2F, 2, 6, 1, 0F); // Left seat part
		bodyModel[290].setRotationPoint(-26.5F, -5F, -7F);

		bodyModel[291].addBox(-1.5F, 0F, -2F, 5, 2, 4, 0F); // Left seat part
		bodyModel[291].setRotationPoint(-26.5F, -3F, -7F);

		bodyModel[292].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[292].setRotationPoint(-26.5F, -8F, -7F);

		bodyModel[293].addBox(-2.5F, 0F, 2F, 3, 5, 1, 0F); // Left seat part
		bodyModel[293].setRotationPoint(-26.5F, -4F, -7F);

		bodyModel[294].addShapeBox(-2.5F, 0F, 2F, 3, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[294].setRotationPoint(-26.5F, -5F, -7F);

		bodyModel[295].addBox(-2.5F, 0F, -3F, 3, 5, 1, 0F); // Left seat part
		bodyModel[295].setRotationPoint(-26.5F, -4F, -7F);

		bodyModel[296].addShapeBox(-2.5F, 0F, -3F, 3, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[296].setRotationPoint(-26.5F, -5F, -7F);

		bodyModel[297].addBox(0.5F, 0F, 2F, 2, 6, 1, 0F); // Right seat part
		bodyModel[297].setRotationPoint(-16.5F, -5F, 7F);

		bodyModel[298].addBox(0.5F, 0F, -3F, 2, 6, 1, 0F); // Right seat part
		bodyModel[298].setRotationPoint(-16.5F, -5F, 7F);

		bodyModel[299].addBox(-1.5F, 0F, -2F, 5, 2, 4, 0F); // Right seat part
		bodyModel[299].setRotationPoint(-16.5F, -3F, 7F);

		bodyModel[300].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[300].setRotationPoint(-16.5F, -8F, 7F);

		bodyModel[301].addBox(-2.5F, 0F, -3F, 3, 5, 1, 0F); // Right seat part
		bodyModel[301].setRotationPoint(-16.5F, -4F, 7F);

		bodyModel[302].addShapeBox(-2.5F, 0F, -3F, 3, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[302].setRotationPoint(-16.5F, -5F, 7F);

		bodyModel[303].addBox(-2.5F, 0F, 2F, 3, 5, 1, 0F); // Right seat part
		bodyModel[303].setRotationPoint(-16.5F, -4F, 7F);

		bodyModel[304].addShapeBox(-2.5F, 0F, 2F, 3, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[304].setRotationPoint(-16.5F, -5F, 7F);

		bodyModel[305].addBox(0.5F, 0F, -3F, 2, 6, 1, 0F); // Left seat part
		bodyModel[305].setRotationPoint(-16.5F, -5F, -7F);

		bodyModel[306].addBox(0.5F, 0F, 2F, 2, 6, 1, 0F); // Left seat part
		bodyModel[306].setRotationPoint(-16.5F, -5F, -7F);

		bodyModel[307].addBox(-1.5F, 0F, -2F, 5, 2, 4, 0F); // Left seat part
		bodyModel[307].setRotationPoint(-16.5F, -3F, -7F);

		bodyModel[308].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[308].setRotationPoint(-16.5F, -8F, -7F);

		bodyModel[309].addBox(-2.5F, 0F, 2F, 3, 5, 1, 0F); // Left seat part
		bodyModel[309].setRotationPoint(-16.5F, -4F, -7F);

		bodyModel[310].addShapeBox(-2.5F, 0F, 2F, 3, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[310].setRotationPoint(-16.5F, -5F, -7F);

		bodyModel[311].addBox(-2.5F, 0F, -3F, 3, 5, 1, 0F); // Left seat part
		bodyModel[311].setRotationPoint(-16.5F, -4F, -7F);

		bodyModel[312].addShapeBox(-2.5F, 0F, -3F, 3, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[312].setRotationPoint(-16.5F, -5F, -7F);

		bodyModel[313].addShapeBox(-2.5F, 0F, -2F, 1, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Right seat part
		bodyModel[313].setRotationPoint(-26.5F, -3F, 7F);

		bodyModel[314].addShapeBox(-2.5F, 0F, -2F, 1, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Right seat part
		bodyModel[314].setRotationPoint(-16.5F, -3F, 7F);

		bodyModel[315].addShapeBox(-2.5F, 0F, -2F, 1, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Left seat part
		bodyModel[315].setRotationPoint(-36.5F, -3F, -7F);

		bodyModel[316].addShapeBox(-2.5F, 0F, -2F, 1, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Left seat part
		bodyModel[316].setRotationPoint(-26.5F, -3F, -7F);

		bodyModel[317].addShapeBox(-2.5F, 0F, -2F, 1, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Left seat part
		bodyModel[317].setRotationPoint(-16.5F, -3F, -7F);

		bodyModel[318].addBox(0.5F, 0F, 2F, 2, 6, 1, 0F); // Right seat part
		bodyModel[318].setRotationPoint(-6.5F, -5F, 7F);

		bodyModel[319].addBox(0.5F, 0F, -3F, 2, 6, 1, 0F); // Right seat part
		bodyModel[319].setRotationPoint(-6.5F, -5F, 7F);

		bodyModel[320].addBox(-1.5F, 0F, -2F, 5, 2, 4, 0F); // Right seat part
		bodyModel[320].setRotationPoint(-6.5F, -3F, 7F);

		bodyModel[321].addShapeBox(-2.5F, 0F, -2F, 1, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Right seat part
		bodyModel[321].setRotationPoint(-6.5F, -3F, 7F);

		bodyModel[322].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[322].setRotationPoint(-6.5F, -8F, 7F);

		bodyModel[323].addBox(-2.5F, 0F, -3F, 3, 5, 1, 0F); // Right seat part
		bodyModel[323].setRotationPoint(-6.5F, -4F, 7F);

		bodyModel[324].addShapeBox(-2.5F, 0F, -3F, 3, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[324].setRotationPoint(-6.5F, -5F, 7F);

		bodyModel[325].addBox(-2.5F, 0F, 2F, 3, 5, 1, 0F); // Right seat part
		bodyModel[325].setRotationPoint(-6.5F, -4F, 7F);

		bodyModel[326].addShapeBox(-2.5F, 0F, 2F, 3, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[326].setRotationPoint(-6.5F, -5F, 7F);

		bodyModel[327].addBox(0.5F, 0F, -3F, 2, 6, 1, 0F); // Left seat part
		bodyModel[327].setRotationPoint(-6.5F, -5F, -7F);

		bodyModel[328].addBox(0.5F, 0F, 2F, 2, 6, 1, 0F); // Left seat part
		bodyModel[328].setRotationPoint(-6.5F, -5F, -7F);

		bodyModel[329].addBox(-1.5F, 0F, -2F, 5, 2, 4, 0F); // Left seat part
		bodyModel[329].setRotationPoint(-6.5F, -3F, -7F);

		bodyModel[330].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[330].setRotationPoint(-6.5F, -8F, -7F);

		bodyModel[331].addBox(-2.5F, 0F, 2F, 3, 5, 1, 0F); // Left seat part
		bodyModel[331].setRotationPoint(-6.5F, -4F, -7F);

		bodyModel[332].addShapeBox(-2.5F, 0F, 2F, 3, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[332].setRotationPoint(-6.5F, -5F, -7F);

		bodyModel[333].addBox(-2.5F, 0F, -3F, 3, 5, 1, 0F); // Left seat part
		bodyModel[333].setRotationPoint(-6.5F, -4F, -7F);

		bodyModel[334].addShapeBox(-2.5F, 0F, -3F, 3, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[334].setRotationPoint(-6.5F, -5F, -7F);

		bodyModel[335].addBox(0.5F, 0F, 2F, 2, 6, 1, 0F); // Right seat part
		bodyModel[335].setRotationPoint(3.5F, -5F, 7F);

		bodyModel[336].addBox(0.5F, 0F, -3F, 2, 6, 1, 0F); // Right seat part
		bodyModel[336].setRotationPoint(3.5F, -5F, 7F);

		bodyModel[337].addBox(-1.5F, 0F, -2F, 5, 2, 4, 0F); // Right seat part
		bodyModel[337].setRotationPoint(3.5F, -3F, 7F);

		bodyModel[338].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[338].setRotationPoint(3.5F, -8F, 7F);

		bodyModel[339].addBox(-2.5F, 0F, -3F, 3, 5, 1, 0F); // Right seat part
		bodyModel[339].setRotationPoint(3.5F, -4F, 7F);

		bodyModel[340].addShapeBox(-2.5F, 0F, -3F, 3, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[340].setRotationPoint(3.5F, -5F, 7F);

		bodyModel[341].addBox(-2.5F, 0F, 2F, 3, 5, 1, 0F); // Right seat part
		bodyModel[341].setRotationPoint(3.5F, -4F, 7F);

		bodyModel[342].addShapeBox(-2.5F, 0F, 2F, 3, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[342].setRotationPoint(3.5F, -5F, 7F);

		bodyModel[343].addBox(0.5F, 0F, -3F, 2, 6, 1, 0F); // Left seat part
		bodyModel[343].setRotationPoint(3.5F, -5F, -7F);

		bodyModel[344].addBox(0.5F, 0F, 2F, 2, 6, 1, 0F); // Left seat part
		bodyModel[344].setRotationPoint(3.5F, -5F, -7F);

		bodyModel[345].addBox(-1.5F, 0F, -2F, 5, 2, 4, 0F); // Left seat part
		bodyModel[345].setRotationPoint(3.5F, -3F, -7F);

		bodyModel[346].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[346].setRotationPoint(3.5F, -8F, -7F);

		bodyModel[347].addBox(-2.5F, 0F, 2F, 3, 5, 1, 0F); // Left seat part
		bodyModel[347].setRotationPoint(3.5F, -4F, -7F);

		bodyModel[348].addShapeBox(-2.5F, 0F, 2F, 3, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[348].setRotationPoint(3.5F, -5F, -7F);

		bodyModel[349].addBox(-2.5F, 0F, -3F, 3, 5, 1, 0F); // Left seat part
		bodyModel[349].setRotationPoint(3.5F, -4F, -7F);

		bodyModel[350].addShapeBox(-2.5F, 0F, -3F, 3, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[350].setRotationPoint(3.5F, -5F, -7F);

		bodyModel[351].addBox(0.5F, 0F, 2F, 2, 6, 1, 0F); // Right seat part
		bodyModel[351].setRotationPoint(13.5F, -5F, 7F);

		bodyModel[352].addBox(0.5F, 0F, -3F, 2, 6, 1, 0F); // Right seat part
		bodyModel[352].setRotationPoint(13.5F, -5F, 7F);

		bodyModel[353].addBox(-1.5F, 0F, -2F, 5, 2, 4, 0F); // Right seat part
		bodyModel[353].setRotationPoint(13.5F, -3F, 7F);

		bodyModel[354].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[354].setRotationPoint(13.5F, -8F, 7F);

		bodyModel[355].addBox(-2.5F, 0F, -3F, 3, 5, 1, 0F); // Right seat part
		bodyModel[355].setRotationPoint(13.5F, -4F, 7F);

		bodyModel[356].addShapeBox(-2.5F, 0F, -3F, 3, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[356].setRotationPoint(13.5F, -5F, 7F);

		bodyModel[357].addBox(-2.5F, 0F, 2F, 3, 5, 1, 0F); // Right seat part
		bodyModel[357].setRotationPoint(13.5F, -4F, 7F);

		bodyModel[358].addShapeBox(-2.5F, 0F, 2F, 3, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[358].setRotationPoint(13.5F, -5F, 7F);

		bodyModel[359].addBox(0.5F, 0F, -3F, 2, 6, 1, 0F); // Left seat part
		bodyModel[359].setRotationPoint(13.5F, -5F, -7F);

		bodyModel[360].addBox(0.5F, 0F, 2F, 2, 6, 1, 0F); // Left seat part
		bodyModel[360].setRotationPoint(13.5F, -5F, -7F);

		bodyModel[361].addBox(-1.5F, 0F, -2F, 5, 2, 4, 0F); // Left seat part
		bodyModel[361].setRotationPoint(13.5F, -3F, -7F);

		bodyModel[362].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[362].setRotationPoint(13.5F, -8F, -7F);

		bodyModel[363].addBox(-2.5F, 0F, 2F, 3, 5, 1, 0F); // Left seat part
		bodyModel[363].setRotationPoint(13.5F, -4F, -7F);

		bodyModel[364].addShapeBox(-2.5F, 0F, 2F, 3, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[364].setRotationPoint(13.5F, -5F, -7F);

		bodyModel[365].addBox(-2.5F, 0F, -3F, 3, 5, 1, 0F); // Left seat part
		bodyModel[365].setRotationPoint(13.5F, -4F, -7F);

		bodyModel[366].addShapeBox(-2.5F, 0F, -3F, 3, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[366].setRotationPoint(13.5F, -5F, -7F);

		bodyModel[367].addShapeBox(-2.5F, 0F, -2F, 1, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Right seat part
		bodyModel[367].setRotationPoint(3.5F, -3F, 7F);

		bodyModel[368].addShapeBox(-2.5F, 0F, -2F, 1, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Right seat part
		bodyModel[368].setRotationPoint(13.5F, -3F, 7F);

		bodyModel[369].addShapeBox(-2.5F, 0F, -2F, 1, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Left seat part
		bodyModel[369].setRotationPoint(-6.5F, -3F, -7F);

		bodyModel[370].addShapeBox(-2.5F, 0F, -2F, 1, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Left seat part
		bodyModel[370].setRotationPoint(3.5F, -3F, -7F);

		bodyModel[371].addShapeBox(-2.5F, 0F, -2F, 1, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Left seat part
		bodyModel[371].setRotationPoint(13.5F, -3F, -7F);

		bodyModel[372].addBox(0.5F, 0F, 2F, 2, 6, 1, 0F); // Right seat part
		bodyModel[372].setRotationPoint(23.5F, -5F, 7F);

		bodyModel[373].addBox(0.5F, 0F, -3F, 2, 6, 1, 0F); // Right seat part
		bodyModel[373].setRotationPoint(23.5F, -5F, 7F);

		bodyModel[374].addBox(-1.5F, 0F, -2F, 5, 2, 4, 0F); // Right seat part
		bodyModel[374].setRotationPoint(23.5F, -3F, 7F);

		bodyModel[375].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[375].setRotationPoint(23.5F, -8F, 7F);

		bodyModel[376].addBox(-2.5F, 0F, -3F, 3, 5, 1, 0F); // Right seat part
		bodyModel[376].setRotationPoint(23.5F, -4F, 7F);

		bodyModel[377].addShapeBox(-2.5F, 0F, -3F, 3, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[377].setRotationPoint(23.5F, -5F, 7F);

		bodyModel[378].addBox(-2.5F, 0F, 2F, 3, 5, 1, 0F); // Right seat part
		bodyModel[378].setRotationPoint(23.5F, -4F, 7F);

		bodyModel[379].addShapeBox(-2.5F, 0F, 2F, 3, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[379].setRotationPoint(23.5F, -5F, 7F);

		bodyModel[380].addShapeBox(-2.5F, 0F, -2F, 1, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Right seat part
		bodyModel[380].setRotationPoint(23.5F, -3F, 7F);

		bodyModel[381].addBox(0F, 0F, 0F, 1, 7, 6, 0F); // Box 128
		bodyModel[381].setRotationPoint(31F, -6F, -10F);

		bodyModel[382].addBox(0F, 0F, 0F, 0, 4, 3, 0F); // Box 128
		bodyModel[382].setRotationPoint(31.5F, -10F, -10F);

		bodyModel[383].addBox(0F, 0F, 0F, 0, 1, 2, 0F); // Box 128
		bodyModel[383].setRotationPoint(31.5F, -11F, -10F);

		bodyModel[384].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[384].setRotationPoint(31.5F, -11F, -8F);

		bodyModel[385].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38 glow
		bodyModel[385].setRotationPoint(-59F, -15F, 2.5F);

		bodyModel[386].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38 glow
		bodyModel[386].setRotationPoint(-59F, -15F, -4.5F);

		bodyModel[387].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38 glow
		bodyModel[387].setRotationPoint(-56F, -15F, -8F);

		bodyModel[388].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38 glow
		bodyModel[388].setRotationPoint(-53F, -15F, -8F);

		bodyModel[389].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38 glow
		bodyModel[389].setRotationPoint(-50F, -15F, -8F);

		bodyModel[390].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38 glow
		bodyModel[390].setRotationPoint(-47F, -15F, 2.5F);

		bodyModel[391].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38 glow
		bodyModel[391].setRotationPoint(-47F, -15F, -4.5F);

		bodyModel[392].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38 glow
		bodyModel[392].setRotationPoint(-56F, -15F, 6F);

		bodyModel[393].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38 glow
		bodyModel[393].setRotationPoint(-53F, -15F, 6F);

		bodyModel[394].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38 glow
		bodyModel[394].setRotationPoint(-50F, -15F, 6F);

		bodyModel[395].addShapeBox(0F, 0F, 0F, 2, 9, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[395].setRotationPoint(32F, -8F, -9F);

		bodyModel[396].addBox(0F, 0F, 0F, 2, 2, 6, 0F); // Box 209
		bodyModel[396].setRotationPoint(-46F, -1F, -10F);

		bodyModel[397].addBox(0F, 0F, 0F, 3, 2, 2, 0F); // Box 209
		bodyModel[397].setRotationPoint(-49F, -1F, -10F);

		bodyModel[398].addBox(0F, 0F, 0F, 3, 2, 7, 0F); // Box 209
		bodyModel[398].setRotationPoint(-47F, -3F, -10F);

		bodyModel[399].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 209
		bodyModel[399].setRotationPoint(-50F, -3F, -10F);

		bodyModel[400].addBox(0F, 0F, 0F, 3, 1, 4, 0F); // Box 209
		bodyModel[400].setRotationPoint(-50F, -6F, -7F);

		bodyModel[401].addBox(0F, 0F, 0F, 1, 6, 1, 0F); // Box 209
		bodyModel[401].setRotationPoint(-50F, -5F, -3.71F);
		bodyModel[401].rotateAngleY = -0.78539816F;

		bodyModel[402].addBox(0F, 0F, 0F, 2, 2, 6, 0F); // Box 470
		bodyModel[402].setRotationPoint(-46F, -1F, 4F);

		bodyModel[403].addBox(0F, 0F, 0F, 3, 2, 2, 0F); // Box 471
		bodyModel[403].setRotationPoint(-49F, -1F, 8F);

		bodyModel[404].addBox(0F, 0F, 0F, 3, 2, 7, 0F); // Box 472
		bodyModel[404].setRotationPoint(-47F, -3F, 3F);

		bodyModel[405].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 473
		bodyModel[405].setRotationPoint(-50F, -3F, 7F);

		bodyModel[406].addBox(0F, 0F, 0F, 3, 1, 4, 0F); // Box 474
		bodyModel[406].setRotationPoint(-50F, -6F, 3F);

		bodyModel[407].addBox(0F, 0F, 0F, 1, 6, 1, 0F); // Box 475
		bodyModel[407].setRotationPoint(-50F, -5F, 3.71F);
		bodyModel[407].rotateAngleY = -0.78539816F;

		bodyModel[408].addShapeBox(0F, 0F, 0F, 3, 2, 4, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 492
		bodyModel[408].setRotationPoint(-54F, -3F, -8F);

		bodyModel[409].addShapeBox(0F, 0F, 0F, 3, 5, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 493
		bodyModel[409].setRotationPoint(-54F, -7F, -9F);

		bodyModel[410].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 494
		bodyModel[410].setRotationPoint(-51F, -4.5F, -8.5F);

		bodyModel[411].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 495
		bodyModel[411].setRotationPoint(-54.5F, -4.5F, -8.5F);

		bodyModel[412].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, -0.5F, 0.5F, -0.5F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 496
		bodyModel[412].setRotationPoint(-51F, -4.5F, -6F);

		bodyModel[413].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, -0.5F, 0.5F, -0.5F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 497
		bodyModel[413].setRotationPoint(-54.5F, -4.5F, -6F);

		bodyModel[414].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 498
		bodyModel[414].setRotationPoint(-51F, -4.5F, -9.5F);

		bodyModel[415].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 499
		bodyModel[415].setRotationPoint(-54.5F, -4.5F, -9.5F);

		bodyModel[416].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 492
		bodyModel[416].setRotationPoint(-54F, -2.5F, -9F);

		bodyModel[417].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, -0.5F, 0.5F, -0.5F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 498
		bodyModel[417].setRotationPoint(-51.49F, -2.5F, -9.51F);

		bodyModel[418].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, -0.5F, 0.5F, -0.5F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 499
		bodyModel[418].setRotationPoint(-54.01F, -2.5F, -9.51F);

		bodyModel[419].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0.22F, -0.5F, 0F, 0.22F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 493
		bodyModel[419].setRotationPoint(-54.01F, -4.5F, -9.01F);

		bodyModel[420].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0.22F, -0.5F, 0F, 0.22F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 493
		bodyModel[420].setRotationPoint(-51.49F, -4.5F, -9.01F);

		bodyModel[421].addShapeBox(0F, 0F, 0F, 3, 2, 4, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 492
		bodyModel[421].setRotationPoint(-58.5F, -3F, -8F);

		bodyModel[422].addShapeBox(0F, 0F, 0F, 3, 5, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 493
		bodyModel[422].setRotationPoint(-58.5F, -7F, -9F);

		bodyModel[423].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 494
		bodyModel[423].setRotationPoint(-55.5F, -4.5F, -8.5F);

		bodyModel[424].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 495
		bodyModel[424].setRotationPoint(-59F, -4.5F, -8.5F);

		bodyModel[425].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, -0.5F, 0.5F, -0.5F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 496
		bodyModel[425].setRotationPoint(-55.5F, -4.5F, -6F);

		bodyModel[426].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, -0.5F, 0.5F, -0.5F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 497
		bodyModel[426].setRotationPoint(-59F, -4.5F, -6F);

		bodyModel[427].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 498
		bodyModel[427].setRotationPoint(-55.5F, -4.5F, -9.5F);

		bodyModel[428].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 499
		bodyModel[428].setRotationPoint(-59F, -4.5F, -9.5F);

		bodyModel[429].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 492
		bodyModel[429].setRotationPoint(-58.5F, -2.5F, -9F);

		bodyModel[430].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, -0.5F, 0.5F, -0.5F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 498
		bodyModel[430].setRotationPoint(-55.99F, -2.5F, -9.51F);

		bodyModel[431].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, -0.5F, 0.5F, -0.5F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 499
		bodyModel[431].setRotationPoint(-58.51F, -2.5F, -9.51F);

		bodyModel[432].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0.22F, -0.5F, 0F, 0.22F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 493
		bodyModel[432].setRotationPoint(-58.51F, -4.5F, -9.01F);

		bodyModel[433].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0.22F, -0.5F, 0F, 0.22F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 493
		bodyModel[433].setRotationPoint(-55.99F, -4.5F, -9.01F);

		bodyModel[434].addShapeBox(0F, 0F, 0F, 3, 2, 4, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 526
		bodyModel[434].setRotationPoint(-54F, -3F, 4F);

		bodyModel[435].addShapeBox(0F, 0F, 0F, 3, 5, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 527
		bodyModel[435].setRotationPoint(-54F, -7F, 8F);

		bodyModel[436].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 528
		bodyModel[436].setRotationPoint(-51F, -4.5F, 5.5F);

		bodyModel[437].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 529
		bodyModel[437].setRotationPoint(-54.5F, -4.5F, 5.5F);

		bodyModel[438].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, -0.5F, 0F, 0.5F, -0.5F); // Box 530
		bodyModel[438].setRotationPoint(-51F, -4.5F, 5F);

		bodyModel[439].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, -0.5F, 0F, 0.5F, -0.5F); // Box 531
		bodyModel[439].setRotationPoint(-54.5F, -4.5F, 5F);

		bodyModel[440].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 532
		bodyModel[440].setRotationPoint(-54F, -2.5F, 8F);

		bodyModel[441].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, -0.5F, 0F, 0.5F, -0.5F); // Box 533
		bodyModel[441].setRotationPoint(-51.49F, -2.5F, 8.51F);

		bodyModel[442].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, -0.5F, 0F, 0.5F, -0.5F); // Box 534
		bodyModel[442].setRotationPoint(-54.01F, -2.5F, 8.51F);

		bodyModel[443].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, 0.22F, 0F, 0F, 0.22F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 535
		bodyModel[443].setRotationPoint(-51.49F, -4.5F, 8.01F);

		bodyModel[444].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, 0.22F, 0F, 0F, 0.22F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 546
		bodyModel[444].setRotationPoint(-54.01F, -4.5F, 8.01F);

		bodyModel[445].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 548
		bodyModel[445].setRotationPoint(-51F, -4.5F, 8.5F);

		bodyModel[446].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 549
		bodyModel[446].setRotationPoint(-54.5F, -4.5F, 8.5F);

		bodyModel[447].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Right seat part
		bodyModel[447].setRotationPoint(-56.25F, -5F, -4.5F);

		bodyModel[448].addBox(0F, 0F, 0F, 1, 5, 1, 0F); // Right seat part
		bodyModel[448].setRotationPoint(-55.45F, -4.5F, -3F);
		bodyModel[448].rotateAngleY = -0.78539816F;

		bodyModel[449].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Right seat part
		bodyModel[449].setRotationPoint(-56.25F, 0.5F, -4.5F);

		bodyModel[450].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38
		bodyModel[450].setRotationPoint(54F, -6F, 9F);

		bodyModel[451].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38
		bodyModel[451].setRotationPoint(54F, -6F, 8F);

		bodyModel[452].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38
		bodyModel[452].setRotationPoint(55F, -6F, 8F);

		bodyModel[453].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F); // Box 38
		bodyModel[453].setRotationPoint(50.05F, -2F, 8.55F);
		bodyModel[453].rotateAngleY = -0.78539816F;

		bodyModel[454].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Box 38
		bodyModel[454].setRotationPoint(50.4F, -1F, 8.9F);
		bodyModel[454].rotateAngleY = -0.78539816F;

		bodyModel[455].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 38
		bodyModel[455].setRotationPoint(55.37F, -4.5F, 8.63F);
		bodyModel[455].rotateAngleY = 0.78539816F;

		bodyModel[456].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F); // Box 38
		bodyModel[456].setRotationPoint(50.05F, 0.5F, 8.55F);
		bodyModel[456].rotateAngleY = -0.78539816F;

		bodyModel[457].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,-0.35F, 0F, 0F, -0.85F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, -0.35F, -0.5F, 0F, -0.85F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 38 cull
		bodyModel[457].setRotationPoint(52F, -4F, 9.49F);

		bodyModel[458].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F); // Box 38
		bodyModel[458].setRotationPoint(47.55F, -2F, 9.95F);
		bodyModel[458].rotateAngleY = -2.35619449F;

		bodyModel[459].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Box 38
		bodyModel[459].setRotationPoint(47.9F, -1F, 9.6F);
		bodyModel[459].rotateAngleY = -2.35619449F;

		bodyModel[460].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F); // Box 38
		bodyModel[460].setRotationPoint(47.55F, 0.5F, 9.95F);
		bodyModel[460].rotateAngleY = -2.35619449F;

		bodyModel[461].addShapeBox(0F, 0F, 0F, 1, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[461].setRotationPoint(55F, -5F, 5F);

		bodyModel[462].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38
		bodyModel[462].setRotationPoint(42F, -6F, 9F);

		bodyModel[463].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38
		bodyModel[463].setRotationPoint(42F, -6F, 8F);

		bodyModel[464].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38
		bodyModel[464].setRotationPoint(43F, -6F, 8F);

		bodyModel[465].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 38
		bodyModel[465].setRotationPoint(43.37F, -4.5F, 8.63F);
		bodyModel[465].rotateAngleY = 0.78539816F;

		bodyModel[466].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38
		bodyModel[466].setRotationPoint(37F, -6F, 9F);

		bodyModel[467].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38
		bodyModel[467].setRotationPoint(38F, -6F, 8F);

		bodyModel[468].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38
		bodyModel[468].setRotationPoint(37F, -6F, 8F);

		bodyModel[469].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 38
		bodyModel[469].setRotationPoint(37.97F, -4.5F, 8.63F);
		bodyModel[469].rotateAngleY = 0.78539816F;

		bodyModel[470].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38
		bodyModel[470].setRotationPoint(42.5F, -6F, 1F);

		bodyModel[471].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,-0.35F, 0F, 0F, -0.85F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, -0.35F, -0.5F, 0F, -0.85F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 38 cull
		bodyModel[471].setRotationPoint(39.75F, -4F, 9.49F);

		bodyModel[472].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 38
		bodyModel[472].setRotationPoint(43.42F, -4.5F, 1.63F);
		bodyModel[472].rotateAngleY = 0.78539816F;

		bodyModel[473].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38 cull
		bodyModel[473].setRotationPoint(39.5F, -15F, 9.5F);

		bodyModel[474].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38 cull
		bodyModel[474].setRotationPoint(51.5F, -15F, 9.5F);

		bodyModel[475].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38 cull
		bodyModel[475].setRotationPoint(42F, -13.5F, 9.5F);

		bodyModel[476].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38 cull
		bodyModel[476].setRotationPoint(37F, -13.5F, 9.5F);

		bodyModel[477].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 349
		bodyModel[477].setRotationPoint(37F, -6F, -5F);

		bodyModel[478].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 349
		bodyModel[478].setRotationPoint(37F, -15F, -5F);

		bodyModel[479].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 349
		bodyModel[479].setRotationPoint(37F, -13F, -5F);

		bodyModel[480].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, -2F); // Box 38
		bodyModel[480].setRotationPoint(37.5F, -3.5F, -3.5F);
		bodyModel[480].rotateAngleY = -0.78539816F;

		bodyModel[481].addShapeBox(0F, 0F, 0F, 4, 4, 4, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, -2F, 0F, -0.5F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, -2F, 0F, -0.5F, -2F); // Box 38 cull
		bodyModel[481].setRotationPoint(37.5F, -2.5F, -3.5F);
		bodyModel[481].rotateAngleY = -0.78539816F;

		bodyModel[482].addShapeBox(0F, 0F, 0F, 4, 0, 4, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, -2F); // Box 38
		bodyModel[482].setRotationPoint(37.5F, -1.25F, -3.5F);
		bodyModel[482].rotateAngleY = -0.78539816F;

		bodyModel[483].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 38
		bodyModel[483].setRotationPoint(38.56F, -6F, -2.44F);
		bodyModel[483].rotateAngleY = -0.78539816F;

		bodyModel[484].addBox(0F, 0F, 0F, 0, 1, 1, 0F); // Box 128
		bodyModel[484].setRotationPoint(35.99F, -17F, -8F);

		bodyModel[485].addBox(0F, 0F, 0F, 0, 1, 1, 0F); // Box 128
		bodyModel[485].setRotationPoint(-42.99F, -17F, 7F);

		bodyModel[486].addShapeBox(0F, 0F, 0F, 1, 18, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 128
		bodyModel[486].setRotationPoint(-61F, -15F, 10F);

		bodyModel[487].addShapeBox(0F, 0F, 0F, 1, 18, 1, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 548
		bodyModel[487].setRotationPoint(-61F, -15F, -11F);

		bodyModel[488].addBox(0F, 0F, 0F, 1, 2, 20, 0F); // Box 2
		bodyModel[488].setRotationPoint(-61F, 1F, -10F);

		bodyModel[489].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F); // Box 128
		bodyModel[489].setRotationPoint(-61F, 3F, 10F);

		bodyModel[490].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 553
		bodyModel[490].setRotationPoint(-61F, 3F, -11F);

		bodyModel[491].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 2
		bodyModel[491].setRotationPoint(-61F, 4F, 10F);

		bodyModel[492].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 30
		bodyModel[492].setRotationPoint(-61F, 4F, -11F);

		bodyModel[493].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-1F, 1.25F, 0F, 0F, 1.25F, 0F, 0F, -1F, -1F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F); // Box 170
		bodyModel[493].setRotationPoint(-61F, -16F, 10F);

		bodyModel[494].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -1F, -2F, 0F, -1F, -1F, 0F, 1.25F, 0F, -1F, 1.25F, 0F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 524
		bodyModel[494].setRotationPoint(-61F, -16F, -12F);

		bodyModel[495].addShapeBox(0F, 0F, 0F, 1, 2, 7, 0F,-1F, 1.25F, 0F, 0F, 1.25F, 0F, 0F, 0.25F, 0F, -1F, 0.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 170
		bodyModel[495].setRotationPoint(-61F, -17F, 3F);

		bodyModel[496].addShapeBox(0F, 0F, 0F, 3, 2, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 128
		bodyModel[496].setRotationPoint(-60F, -17.25F, -10F);

		bodyModel[497].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, -3F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F); // Box 169
		bodyModel[497].setRotationPoint(-60F, -19F, 7F);

		bodyModel[498].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, -3F, 0.75F, 0F); // Box 530
		bodyModel[498].setRotationPoint(-60F, -19F, -10F);

		bodyModel[499].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, -1.75F, 0F, -3F, -1.75F, 0F, 0F, 0F, 0F, 0F, -1.32F, 0F, 0F, 0.75F, 0F, -3F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F); // Box 531
		bodyModel[499].setRotationPoint(-60F, -19F, -10F);
	}

	private void initbodyModel_2()
	{
		bodyModel[500] = new ModelRendererTurbo(this, 94, 18, textureX, textureY); // Box 169
		bodyModel[501] = new ModelRendererTurbo(this, 85, 6, textureX, textureY); // Box 169
		bodyModel[502] = new ModelRendererTurbo(this, 69, 10, textureX, textureY); // Box 170
		bodyModel[503] = new ModelRendererTurbo(this, 11, 11, textureX, textureY); // Box 128
		bodyModel[504] = new ModelRendererTurbo(this, 27, 9, textureX, textureY); // Box 538
		bodyModel[505] = new ModelRendererTurbo(this, 19, 3, textureX, textureY); // Box 128
		bodyModel[506] = new ModelRendererTurbo(this, 77, 16, textureX, textureY); // Box 540
		bodyModel[507] = new ModelRendererTurbo(this, 2, 203, textureX, textureY); // Box 169
		bodyModel[508] = new ModelRendererTurbo(this, 87, 11, textureX, textureY); // Box 169
		bodyModel[509] = new ModelRendererTurbo(this, 98, 1, textureX, textureY); // Box 543
		bodyModel[510] = new ModelRendererTurbo(this, 60, 34, textureX, textureY); // Box 169
		bodyModel[511] = new ModelRendererTurbo(this, 62, 87, textureX, textureY); // Box 169
		bodyModel[512] = new ModelRendererTurbo(this, 67, 87, textureX, textureY, "lamp"); // Box 169 marker lense LF
		bodyModel[513] = new ModelRendererTurbo(this, 57, 87, textureX, textureY, "lamp"); // Box 169 marker lense LR
		bodyModel[514] = new ModelRendererTurbo(this, 62, 68, textureX, textureY); // Box 548
		bodyModel[515] = new ModelRendererTurbo(this, 67, 68, textureX, textureY, "lamp"); // Box 549 marker lense RF
		bodyModel[516] = new ModelRendererTurbo(this, 57, 68, textureX, textureY, "lamp"); // Box 547 marker lense LR
		bodyModel[517] = new ModelRendererTurbo(this, 61, 46, textureX, textureY); // Box 169
		bodyModel[518] = new ModelRendererTurbo(this, 63, 43, textureX, textureY); // Box 169
		bodyModel[519] = new ModelRendererTurbo(this, 60, 39, textureX, textureY); // Box 169
		bodyModel[520] = new ModelRendererTurbo(this, 54, 51, textureX, textureY); // Box 169
		bodyModel[521] = new ModelRendererTurbo(this, 61, 49, textureX, textureY); // Box 555
		bodyModel[522] = new ModelRendererTurbo(this, 56, 56, textureX, textureY); // Box 169
		bodyModel[523] = new ModelRendererTurbo(this, 56, 62, textureX, textureY); // Box 557
		bodyModel[524] = new ModelRendererTurbo(this, 56, 59, textureX, textureY); // Box 169
		bodyModel[525] = new ModelRendererTurbo(this, 61, 25, textureX, textureY); // Box 169
		bodyModel[526] = new ModelRendererTurbo(this, 61, 19, textureX, textureY); // Box 169
		bodyModel[527] = new ModelRendererTurbo(this, 61, 22, textureX, textureY); // Box 169
		bodyModel[528] = new ModelRendererTurbo(this, 61, 31, textureX, textureY); // Box 564
		bodyModel[529] = new ModelRendererTurbo(this, 61, 28, textureX, textureY); // Box 565
		bodyModel[530] = new ModelRendererTurbo(this, 50, 55, textureX, textureY, "lamp"); // Box 555 rear light
		bodyModel[531] = new ModelRendererTurbo(this, 47, 55, textureX, textureY, "lamp"); // Box 555 rear light
		bodyModel[532] = new ModelRendererTurbo(this, 48, 55, textureX, textureY, "lamp"); // Box 555 rear light
		bodyModel[533] = new ModelRendererTurbo(this, 53, 55, textureX, textureY, "lamp"); // Box 555 rear light
		bodyModel[534] = new ModelRendererTurbo(this, 47, 59, textureX, textureY, "lamp"); // Box 555 rear light
		bodyModel[535] = new ModelRendererTurbo(this, 53, 59, textureX, textureY, "lamp"); // Box 555 rear light
		bodyModel[536] = new ModelRendererTurbo(this, 50, 59, textureX, textureY, "lamp"); // Box 555 rear light
		bodyModel[537] = new ModelRendererTurbo(this, 5, 272, textureX, textureY); // Box 573
		bodyModel[538] = new ModelRendererTurbo(this, 9, 277, textureX, textureY); // Box 574
		bodyModel[539] = new ModelRendererTurbo(this, 5, 284, textureX, textureY); // Box 575
		bodyModel[540] = new ModelRendererTurbo(this, 1, 242, textureX, textureY); // Box 576
		bodyModel[541] = new ModelRendererTurbo(this, 1, 232, textureX, textureY); // Box 577
		bodyModel[542] = new ModelRendererTurbo(this, 15, 248, textureX, textureY); // Box 578
		bodyModel[543] = new ModelRendererTurbo(this, 6, 249, textureX, textureY); // Box 579
		bodyModel[544] = new ModelRendererTurbo(this, 16, 256, textureX, textureY); // Box 580
		bodyModel[545] = new ModelRendererTurbo(this, 1, 256, textureX, textureY); // Box 581
		bodyModel[546] = new ModelRendererTurbo(this, 16, 253, textureX, textureY); // Box 582
		bodyModel[547] = new ModelRendererTurbo(this, 1, 253, textureX, textureY); // Box 583
		bodyModel[548] = new ModelRendererTurbo(this, 1, 239, textureX, textureY); // Box 584
		bodyModel[549] = new ModelRendererTurbo(this, 11, 258, textureX, textureY); // Box 585
		bodyModel[550] = new ModelRendererTurbo(this, 6, 258, textureX, textureY); // Box 586
		bodyModel[551] = new ModelRendererTurbo(this, 6, 254, textureX, textureY); // Box 587
		bodyModel[552] = new ModelRendererTurbo(this, 11, 254, textureX, textureY); // Box 588
		bodyModel[553] = new ModelRendererTurbo(this, 202, 234, textureX, textureY); // Box 38 glow
		bodyModel[554] = new ModelRendererTurbo(this, 305, 340, textureX, textureY); // Left seat part
		bodyModel[555] = new ModelRendererTurbo(this, 305, 330, textureX, textureY); // Left seat part
		bodyModel[556] = new ModelRendererTurbo(this, 296, 323, textureX, textureY); // Left seat part
		bodyModel[557] = new ModelRendererTurbo(this, 285, 323, textureX, textureY); // Left seat part
		bodyModel[558] = new ModelRendererTurbo(this, 296, 333, textureX, textureY); // Left seat part
		bodyModel[559] = new ModelRendererTurbo(this, 296, 330, textureX, textureY); // Left seat part
		bodyModel[560] = new ModelRendererTurbo(this, 296, 343, textureX, textureY); // Left seat part
		bodyModel[561] = new ModelRendererTurbo(this, 296, 340, textureX, textureY); // Left seat part
		bodyModel[562] = new ModelRendererTurbo(this, 285, 333, textureX, textureY); // Left seat part
		bodyModel[563] = new ModelRendererTurbo(this, 285, 253, textureX, textureY); // Box 128
		bodyModel[564] = new ModelRendererTurbo(this, 285, 246, textureX, textureY); // Box 128
		bodyModel[565] = new ModelRendererTurbo(this, 299, 252, textureX, textureY); // Box 128
		bodyModel[566] = new ModelRendererTurbo(this, 300, 249, textureX, textureY); // Box 128
		bodyModel[567] = new ModelRendererTurbo(this, 294, 253, textureX, textureY); // Box 128
		bodyModel[568] = new ModelRendererTurbo(this, 300, 257, textureX, textureY); // Box 128
		bodyModel[569] = new ModelRendererTurbo(this, 306, 245, textureX, textureY); // Box 128
		bodyModel[570] = new ModelRendererTurbo(this, 304, 250, textureX, textureY); // Box 128
		bodyModel[571] = new ModelRendererTurbo(this, 302, 261, textureX, textureY); // Box 128
		bodyModel[572] = new ModelRendererTurbo(this, 1, 43, textureX, textureY); // Box 128
		bodyModel[573] = new ModelRendererTurbo(this, 44, 37, textureX, textureY); // Box 574

		bodyModel[500].addShapeBox(0F, 0F, 0F, 3, 1, 6, 0F,0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F); // Box 169
		bodyModel[500].setRotationPoint(-60F, -20F, -3F);

		bodyModel[501].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, -1.32F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -1.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, -3F, 0F, 0.75F, 0F); // Box 169
		bodyModel[501].setRotationPoint(-60F, -19F, 7F);

		bodyModel[502].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,-1F, 1.25F, 0F, 0F, 1.25F, 0F, 0F, 1.25F, 0F, -1F, 1.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 170
		bodyModel[502].setRotationPoint(-61F, -17F, -3F);

		bodyModel[503].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[503].setRotationPoint(-61F, -16F, 3F);

		bodyModel[504].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 538
		bodyModel[504].setRotationPoint(-61F, -16F, -10F);

		bodyModel[505].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[505].setRotationPoint(-61F, -16F, -3F);

		bodyModel[506].addShapeBox(0F, 0F, 0F, 1, 2, 7, 0F,-1F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 1.25F, 0F, -1F, 1.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 540
		bodyModel[506].setRotationPoint(-61F, -17F, -10F);

		bodyModel[507].addShapeBox(0F, 0F, 0F, 3, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 169
		bodyModel[507].setRotationPoint(-60F, -18.25F, -3F);

		bodyModel[508].addShapeBox(0F, 0F, 0F, 3, 2, 4, 0F,0F, -1.75F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2.32F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F); // Box 169
		bodyModel[508].setRotationPoint(-60F, -20F, 3F);

		bodyModel[509].addShapeBox(0F, 0F, 0F, 3, 2, 4, 0F,0F, -2.32F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F); // Box 543
		bodyModel[509].setRotationPoint(-60F, -20F, -7F);

		bodyModel[510].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -0.25F, 0F); // Box 169
		bodyModel[510].setRotationPoint(-60F, -20F, -1F);

		bodyModel[511].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F); // Box 169
		bodyModel[511].setRotationPoint(-56F, -14F, 11F);

		bodyModel[512].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, -1F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, -1F, 0F, 0F, -1F); // Box 169 marker lense LF
		bodyModel[512].setRotationPoint(-55F, -14F, 11F);

		bodyModel[513].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, -0.5F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -1F, 0F, -0.5F, -1F); // Box 169 marker lense LR
		bodyModel[513].setRotationPoint(-56.25F, -14F, 11F);

		bodyModel[514].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 548
		bodyModel[514].setRotationPoint(-56F, -14F, -12F);

		bodyModel[515].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, -0.5F, -0.25F, -0.5F, -1F, -0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.25F, -0.5F, -1F, -0.25F, -0.5F, 0F, 0F, 0F, 0F); // Box 549 marker lense RF
		bodyModel[515].setRotationPoint(-55F, -14F, -12F);

		bodyModel[516].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, -1F, -0.25F, -0.5F, -0.5F, -0.25F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, 0F, 0F, -0.5F, 0F); // Box 547 marker lense LR
		bodyModel[516].setRotationPoint(-56.25F, -14F, -12F);

		bodyModel[517].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, -0.3F, 0F, -0.35F, -0.3F); // Box 169
		bodyModel[517].setRotationPoint(-61F, -20.95F, -0.35F);

		bodyModel[518].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.65F, -0.35F, 0F, -0.65F, -0.35F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F); // Box 169
		bodyModel[518].setRotationPoint(-61F, -20.95F, 0.35F);

		bodyModel[519].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F); // Box 169
		bodyModel[519].setRotationPoint(-60F, -20.3F, -1F);

		bodyModel[520].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -1F, 0F, -0.4F, -1F); // Box 169
		bodyModel[520].setRotationPoint(-61F, -20.3F, -1F);

		bodyModel[521].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.65F, -0.35F, 0F, -0.65F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, 0F, 0F, -0.35F, 0F); // Box 555
		bodyModel[521].setRotationPoint(-61F, -20.95F, -1.35F);

		bodyModel[522].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.65F, -0.35F, 0F, -0.65F, -0.35F); // Box 169
		bodyModel[522].setRotationPoint(-61F, -20.05F, 0.35F);

		bodyModel[523].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.65F, -0.35F, 0F, -0.65F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 557
		bodyModel[523].setRotationPoint(-61F, -20.05F, -1.35F);

		bodyModel[524].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, -0.3F, 0F, -0.35F, -0.3F); // Box 169
		bodyModel[524].setRotationPoint(-61F, -19.7F, -0.35F);

		bodyModel[525].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.05F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, -0.3F, 0F, -0.05F, -0.3F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 169
		bodyModel[525].setRotationPoint(-57F, -21F, -0.35F);

		bodyModel[526].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, -0.05F, -0.5F, -0.3F, -0.05F, -0.5F, -0.3F, -0.95F, 0F, 0F, -0.3F, 0F, -0.7F, -0.05F, -0.5F, -0.7F, -0.05F, -0.5F, -0.7F, -0.95F, 0F, -0.7F, -0.3F); // Box 169
		bodyModel[526].setRotationPoint(-57F, -20.3F, 0.3F);

		bodyModel[527].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.05F, -0.05F, -0.5F, -1F, -0.05F, -0.5F, -1F, -0.95F, 0F, -0.7F, -0.3F, 0F, -0.3F, -0.05F, -0.5F, 0F, -0.05F, -0.5F, 0F, -0.95F, 0F, -0.3F, -0.3F); // Box 169
		bodyModel[527].setRotationPoint(-57F, -21F, 0.3F);

		bodyModel[528].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, -0.3F, -0.5F, -0.3F, -0.95F, -0.5F, -0.3F, -0.05F, 0F, 0F, -0.05F, 0F, -0.7F, -0.3F, -0.5F, -0.7F, -0.95F, -0.5F, -0.7F, -0.05F, 0F, -0.7F, -0.05F); // Box 564
		bodyModel[528].setRotationPoint(-57F, -20.3F, -1.3F);

		bodyModel[529].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.7F, -0.3F, -0.5F, -1F, -0.95F, -0.5F, -1F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.3F, -0.3F, -0.5F, 0F, -0.95F, -0.5F, 0F, -0.05F, 0F, -0.3F, -0.05F); // Box 565
		bodyModel[529].setRotationPoint(-57F, -21F, -1.3F);

		bodyModel[530].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, -0.3F, 0F, -0.35F, -0.3F); // Box 555 rear light
		bodyModel[530].setRotationPoint(-61.01F, -20.95F, -0.35F);

		bodyModel[531].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.65F, -0.35F, 0F, -0.65F, -0.35F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F); // Box 555 rear light
		bodyModel[531].setRotationPoint(-61.01F, -20.95F, 0.35F);

		bodyModel[532].addShapeBox(0F, 0F, 0F, 0, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -1F, 0F, -0.4F, -1F); // Box 555 rear light
		bodyModel[532].setRotationPoint(-61.01F, -20.3F, -1F);

		bodyModel[533].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, -0.65F, -0.35F, 0F, -0.65F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, 0F, 0F, -0.35F, 0F); // Box 555 rear light
		bodyModel[533].setRotationPoint(-61.01F, -20.95F, -1.35F);

		bodyModel[534].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.65F, -0.35F, 0F, -0.65F, -0.35F); // Box 555 rear light
		bodyModel[534].setRotationPoint(-61.01F, -20.05F, 0.35F);

		bodyModel[535].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.65F, -0.35F, 0F, -0.65F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 555 rear light
		bodyModel[535].setRotationPoint(-61.01F, -20.05F, -1.35F);

		bodyModel[536].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, -0.3F, 0F, -0.35F, -0.3F); // Box 555 rear light
		bodyModel[536].setRotationPoint(-61.01F, -19.7F, -0.35F);

		bodyModel[537].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 573
		bodyModel[537].setRotationPoint(-56.25F, -5F, 1.5F);

		bodyModel[538].addBox(0F, 0F, 0F, 1, 5, 1, 0F); // Box 574
		bodyModel[538].setRotationPoint(-55.45F, -4.5F, 3F);
		bodyModel[538].rotateAngleY = -0.78539816F;

		bodyModel[539].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 575
		bodyModel[539].setRotationPoint(-56.25F, 0.5F, 1.5F);

		bodyModel[540].addShapeBox(0F, 0F, 0F, 3, 2, 4, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 576
		bodyModel[540].setRotationPoint(-58.5F, -3F, 4F);

		bodyModel[541].addShapeBox(0F, 0F, 0F, 3, 5, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 577
		bodyModel[541].setRotationPoint(-58.5F, -7F, 8F);

		bodyModel[542].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 578
		bodyModel[542].setRotationPoint(-55.5F, -4.5F, 5.5F);

		bodyModel[543].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 579
		bodyModel[543].setRotationPoint(-59F, -4.5F, 5.5F);

		bodyModel[544].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, -0.5F, 0F, 0.5F, -0.5F); // Box 580
		bodyModel[544].setRotationPoint(-55.5F, -4.5F, 5F);

		bodyModel[545].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, -0.5F, 0F, 0.5F, -0.5F); // Box 581
		bodyModel[545].setRotationPoint(-59F, -4.5F, 5F);

		bodyModel[546].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 582
		bodyModel[546].setRotationPoint(-55.5F, -4.5F, 8.5F);

		bodyModel[547].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 583
		bodyModel[547].setRotationPoint(-59F, -4.5F, 8.5F);

		bodyModel[548].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 584
		bodyModel[548].setRotationPoint(-58.5F, -2.5F, 8F);

		bodyModel[549].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, -0.5F, 0F, 0.5F, -0.5F); // Box 585
		bodyModel[549].setRotationPoint(-55.99F, -2.5F, 8.51F);

		bodyModel[550].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, -0.5F, 0F, 0.5F, -0.5F); // Box 586
		bodyModel[550].setRotationPoint(-58.51F, -2.5F, 8.51F);

		bodyModel[551].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, 0.22F, 0F, 0F, 0.22F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 587
		bodyModel[551].setRotationPoint(-58.51F, -4.5F, 8.01F);

		bodyModel[552].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, 0.22F, 0F, 0F, 0.22F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 588
		bodyModel[552].setRotationPoint(-55.99F, -4.5F, 8.01F);

		bodyModel[553].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38 glow
		bodyModel[553].setRotationPoint(32F, -18F, -0.5F);

		bodyModel[554].addBox(0.5F, 0F, -3F, 2, 6, 1, 0F); // Left seat part
		bodyModel[554].setRotationPoint(23.5F, -5F, -7F);

		bodyModel[555].addBox(0.5F, 0F, 2F, 2, 6, 1, 0F); // Left seat part
		bodyModel[555].setRotationPoint(23.5F, -5F, -7F);

		bodyModel[556].addBox(-1.5F, 0F, -2F, 5, 2, 4, 0F); // Left seat part
		bodyModel[556].setRotationPoint(23.5F, -3F, -7F);

		bodyModel[557].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[557].setRotationPoint(23.5F, -8F, -7F);

		bodyModel[558].addBox(-2.5F, 0F, 2F, 3, 5, 1, 0F); // Left seat part
		bodyModel[558].setRotationPoint(23.5F, -4F, -7F);

		bodyModel[559].addShapeBox(-2.5F, 0F, 2F, 3, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[559].setRotationPoint(23.5F, -5F, -7F);

		bodyModel[560].addBox(-2.5F, 0F, -3F, 3, 5, 1, 0F); // Left seat part
		bodyModel[560].setRotationPoint(23.5F, -4F, -7F);

		bodyModel[561].addShapeBox(-2.5F, 0F, -3F, 3, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[561].setRotationPoint(23.5F, -5F, -7F);

		bodyModel[562].addShapeBox(-2.5F, 0F, -2F, 1, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Left seat part
		bodyModel[562].setRotationPoint(23.5F, -3F, -7F);

		bodyModel[563].addShapeBox(0F, 0F, 0F, 1, 7, 6, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[563].setRotationPoint(31F, -6F, 4F);

		bodyModel[564].addBox(0F, 0F, 0F, 2, 1, 5, 0F); // Box 128
		bodyModel[564].setRotationPoint(31.5F, -6F, 5F);

		bodyModel[565].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.875F, 0F, 0F, -0.875F, 0F, 0F, -0.25F, 0F); // Box 128
		bodyModel[565].setRotationPoint(32F, -5F, 5F);

		bodyModel[566].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.875F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, -0.875F, 0F); // Box 128
		bodyModel[566].setRotationPoint(33F, -5F, 5F);

		bodyModel[567].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.125F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.125F, 0F); // Box 128
		bodyModel[567].setRotationPoint(31.5F, -5F, 5F);

		bodyModel[568].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 128
		bodyModel[568].setRotationPoint(33F, -3.5F, 6.5F);

		bodyModel[569].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[569].setRotationPoint(35F, -6.5F, 6.5F);

		bodyModel[570].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -2F, 0F, 0F, -2F); // Box 128
		bodyModel[570].setRotationPoint(35F, -4.5F, 6.5F);

		bodyModel[571].addShapeBox(-0.5F, 0F, -0.5F, 1, 4, 1, 0F,-0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F); // Box 128
		bodyModel[571].setRotationPoint(34.12F, -2.5F, 7.5F);
		bodyModel[571].rotateAngleY = -0.78539816F;

		bodyModel[572].addShapeBox(0F, 0F, 0F, 0, 5, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, -4F, 0F, -2F, -4F); // Box 128
		bodyModel[572].setRotationPoint(-61.01F, -5F, 5F);

		bodyModel[573].addShapeBox(0F, 0F, 0F, 0, 5, 8, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -4F, 0F, -2F, -4F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 574
		bodyModel[573].setRotationPoint(-61.01F, -5F, -13F);
	}
	ModelPS_Truck bogie1 = new ModelPS_Truck();
	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		for(int i = 0; i < 574; i++)
		{
			if (bodyModel[i].boxName != null && bodyModel[i].boxName.contains("lamp")) {
				Minecraft.getMinecraft().entityRenderer.disableLightmap(1D);
				bodyModel[i].render(f5);
				Minecraft.getMinecraft().entityRenderer.enableLightmap(1D);
			}else if (bodyModel[i].boxName != null && bodyModel[i].boxName.contains("cull")) {
				GL11.glDisable(GL11.GL_CULL_FACE);
				bodyModel[i].render(f5);
				GL11.glEnable(GL11.GL_CULL_FACE);
			} else {
				bodyModel[i].render(f5);
			}
		}
		if(entity instanceof AbstractTrains && AbstractTrains.getColorFromString(((AbstractTrains) entity).getColor())==7 || entity instanceof AbstractTrains && AbstractTrains.getColorFromString(((AbstractTrains) entity).getColor())==8){
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/41-N-11_truck_silver.png"));
		} else if (entity instanceof AbstractTrains && AbstractTrains.getColorFromString(((AbstractTrains) entity).getColor()) == 12345) {
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