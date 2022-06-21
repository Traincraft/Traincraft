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

public class ModelPSCombine extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelPSCombine() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[496];

		initbodyModel_1();

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
		bodyModel[126] = new ModelRendererTurbo(this, 118, 68, textureX, textureY); // Box 38
		bodyModel[127] = new ModelRendererTurbo(this, 118, 87, textureX, textureY); // Box 128
		bodyModel[128] = new ModelRendererTurbo(this, 327, 20, textureX, textureY); // Box 128
		bodyModel[129] = new ModelRendererTurbo(this, 361, 20, textureX, textureY); // Box 128
		bodyModel[130] = new ModelRendererTurbo(this, 380, 19, textureX, textureY); // Box 128
		bodyModel[131] = new ModelRendererTurbo(this, 415, 20, textureX, textureY); // Box 128
		bodyModel[132] = new ModelRendererTurbo(this, 311, 90, textureX, textureY); // Right side door
		bodyModel[133] = new ModelRendererTurbo(this, 35, 21, textureX, textureY); // Box 128
		bodyModel[134] = new ModelRendererTurbo(this, 1, 15, textureX, textureY); // Box 128
		bodyModel[135] = new ModelRendererTurbo(this, 337, 19, textureX, textureY); // Box 128
		bodyModel[136] = new ModelRendererTurbo(this, 391, 19, textureX, textureY); // Box 128
		bodyModel[137] = new ModelRendererTurbo(this, 44, 19, textureX, textureY); // Box 128
		bodyModel[138] = new ModelRendererTurbo(this, 311, 66, textureX, textureY); // Box 128
		bodyModel[139] = new ModelRendererTurbo(this, 311, 87, textureX, textureY); // Box 128
		bodyModel[140] = new ModelRendererTurbo(this, 346, 21, textureX, textureY); // Vestibule door
		bodyModel[141] = new ModelRendererTurbo(this, 18, 22, textureX, textureY); // Front end door
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
		bodyModel[152] = new ModelRendererTurbo(this, 22, 46, textureX, textureY); // Box 128
		bodyModel[153] = new ModelRendererTurbo(this, 44, 36, textureX, textureY); // Box 128
		bodyModel[154] = new ModelRendererTurbo(this, 63, 1, textureX, textureY); // Box 128
		bodyModel[155] = new ModelRendererTurbo(this, 44, 2, textureX, textureY); // Box 128
		bodyModel[156] = new ModelRendererTurbo(this, 56, 1, textureX, textureY); // Box 128
		bodyModel[157] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 128
		bodyModel[158] = new ModelRendererTurbo(this, 31, 46, textureX, textureY); // Box 128
		bodyModel[159] = new ModelRendererTurbo(this, 4, 42, textureX, textureY); // Box 128
		bodyModel[160] = new ModelRendererTurbo(this, 17, 44, textureX, textureY); // Box 128
		bodyModel[161] = new ModelRendererTurbo(this, 1, 42, textureX, textureY); // Box 153
		bodyModel[162] = new ModelRendererTurbo(this, 72, 41, textureX, textureY); // Box 128
		bodyModel[163] = new ModelRendererTurbo(this, 72, 49, textureX, textureY); // Box 128
		bodyModel[164] = new ModelRendererTurbo(this, 72, 55, textureX, textureY); // Box 128
		bodyModel[165] = new ModelRendererTurbo(this, 72, 35, textureX, textureY); // Box 168
		bodyModel[166] = new ModelRendererTurbo(this, 72, 30, textureX, textureY); // Box 169
		bodyModel[167] = new ModelRendererTurbo(this, 10, 4, textureX, textureY); // Box 128
		bodyModel[168] = new ModelRendererTurbo(this, 6, 1, textureX, textureY); // Box 128
		bodyModel[169] = new ModelRendererTurbo(this, 31, 8, textureX, textureY); // Box 128
		bodyModel[170] = new ModelRendererTurbo(this, 30, 1, textureX, textureY); // Box 128
		bodyModel[171] = new ModelRendererTurbo(this, 11, 11, textureX, textureY); // Box 176
		bodyModel[172] = new ModelRendererTurbo(this, 0, 9, textureX, textureY); // Box 177
		bodyModel[173] = new ModelRendererTurbo(this, 72, 60, textureX, textureY); // Box 128
		bodyModel[174] = new ModelRendererTurbo(this, 72, 26, textureX, textureY); // Box 170
		bodyModel[175] = new ModelRendererTurbo(this, 399, 29, textureX, textureY); // Rear gate closed
		bodyModel[176] = new ModelRendererTurbo(this, 64, 87, textureX, textureY); // Box 128
		bodyModel[177] = new ModelRendererTurbo(this, 96, 86, textureX, textureY); // Box 128
		bodyModel[178] = new ModelRendererTurbo(this, 95, 90, textureX, textureY); // Baggage door R
		bodyModel[179] = new ModelRendererTurbo(this, 64, 67, textureX, textureY); // Box 38
		bodyModel[180] = new ModelRendererTurbo(this, 96, 66, textureX, textureY); // Box 192
		bodyModel[181] = new ModelRendererTurbo(this, 95, 70, textureX, textureY); // Baggage door L
		bodyModel[182] = new ModelRendererTurbo(this, 320, 17, textureX, textureY); // Box 128
		bodyModel[183] = new ModelRendererTurbo(this, 319, 22, textureX, textureY); // Box 128
		bodyModel[184] = new ModelRendererTurbo(this, 323, 59, textureX, textureY); // Box 190
		bodyModel[185] = new ModelRendererTurbo(this, 325, 55, textureX, textureY); // Box 191
		bodyModel[186] = new ModelRendererTurbo(this, 322, 64, textureX, textureY); // Box 190
		bodyModel[187] = new ModelRendererTurbo(this, 327, 52, textureX, textureY); // Box 128
		bodyModel[188] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 128
		bodyModel[189] = new ModelRendererTurbo(this, 144, 6, textureX, textureY); // Box 128
		bodyModel[190] = new ModelRendererTurbo(this, 412, 34, textureX, textureY); // Rear gate open
		bodyModel[191] = new ModelRendererTurbo(this, 65, 19, textureX, textureY); // Box 128
		bodyModel[192] = new ModelRendererTurbo(this, 107, 2, textureX, textureY); // Box 128
		bodyModel[193] = new ModelRendererTurbo(this, 107, 6, textureX, textureY); // Box 128
		bodyModel[194] = new ModelRendererTurbo(this, 89, 2, textureX, textureY); // Box 128
		bodyModel[195] = new ModelRendererTurbo(this, 89, 6, textureX, textureY); // Box 128
		bodyModel[196] = new ModelRendererTurbo(this, 71, 1, textureX, textureY); // Box 128
		bodyModel[197] = new ModelRendererTurbo(this, 71, 5, textureX, textureY); // Box 128
		bodyModel[198] = new ModelRendererTurbo(this, 116, 15, textureX, textureY); // Box 210
		bodyModel[199] = new ModelRendererTurbo(this, 116, 11, textureX, textureY); // Box 211
		bodyModel[200] = new ModelRendererTurbo(this, 98, 15, textureX, textureY); // Box 212
		bodyModel[201] = new ModelRendererTurbo(this, 98, 11, textureX, textureY); // Box 213
		bodyModel[202] = new ModelRendererTurbo(this, 80, 15, textureX, textureY); // Box 214
		bodyModel[203] = new ModelRendererTurbo(this, 80, 11, textureX, textureY); // Box 215
		bodyModel[204] = new ModelRendererTurbo(this, 158, 15, textureX, textureY); // Box 210
		bodyModel[205] = new ModelRendererTurbo(this, 158, 11, textureX, textureY); // Box 211
		bodyModel[206] = new ModelRendererTurbo(this, 156, 5, textureX, textureY); // Box 211
		bodyModel[207] = new ModelRendererTurbo(this, 126, 13, textureX, textureY); // Box 212
		bodyModel[208] = new ModelRendererTurbo(this, 53, 86, textureX, textureY); // Box 38 cull
		bodyModel[209] = new ModelRendererTurbo(this, 9, 86, textureX, textureY); // Box 38 cull
		bodyModel[210] = new ModelRendererTurbo(this, 349, 77, textureX, textureY); // Box 128
		bodyModel[211] = new ModelRendererTurbo(this, 352, 77, textureX, textureY); // Box 128
		bodyModel[212] = new ModelRendererTurbo(this, 62, 85, textureX, textureY); // Box 128
		bodyModel[213] = new ModelRendererTurbo(this, 74, 145, textureX, textureY); // Box 128
		bodyModel[214] = new ModelRendererTurbo(this, 349, 98, textureX, textureY); // Box 202
		bodyModel[215] = new ModelRendererTurbo(this, 352, 98, textureX, textureY); // Box 203
		bodyModel[216] = new ModelRendererTurbo(this, 62, 105, textureX, textureY); // Box 204
		bodyModel[217] = new ModelRendererTurbo(this, 74, 155, textureX, textureY); // Box 205
		bodyModel[218] = new ModelRendererTurbo(this, 53, 82, textureX, textureY); // Box 38 cull
		bodyModel[219] = new ModelRendererTurbo(this, 9, 82, textureX, textureY); // Box 38 cull
		bodyModel[220] = new ModelRendererTurbo(this, 54, 77, textureX, textureY); // Box 38 cull
		bodyModel[221] = new ModelRendererTurbo(this, 46, 82, textureX, textureY); // Box 38 cull
		bodyModel[222] = new ModelRendererTurbo(this, 10, 77, textureX, textureY); // Box 38 cull
		bodyModel[223] = new ModelRendererTurbo(this, 16, 82, textureX, textureY); // Box 38 cull
		bodyModel[224] = new ModelRendererTurbo(this, 35, 80, textureX, textureY); // Box 38 cull
		bodyModel[225] = new ModelRendererTurbo(this, 23, 80, textureX, textureY); // Box 38 cull
		bodyModel[226] = new ModelRendererTurbo(this, 27, 71, textureX, textureY); // Box 38 cull
		bodyModel[227] = new ModelRendererTurbo(this, 53, 103, textureX, textureY); // Box 38 cull
		bodyModel[228] = new ModelRendererTurbo(this, 9, 103, textureX, textureY); // Box 38 cull
		bodyModel[229] = new ModelRendererTurbo(this, 368, 86, textureX, textureY); // Box 38 cull
		bodyModel[230] = new ModelRendererTurbo(this, 412, 86, textureX, textureY); // Box 38 cull
		bodyModel[231] = new ModelRendererTurbo(this, 368, 82, textureX, textureY); // Box 38 cull
		bodyModel[232] = new ModelRendererTurbo(this, 412, 82, textureX, textureY); // Box 38 cull
		bodyModel[233] = new ModelRendererTurbo(this, 369, 77, textureX, textureY); // Box 38 cull
		bodyModel[234] = new ModelRendererTurbo(this, 375, 82, textureX, textureY); // Box 38 cull
		bodyModel[235] = new ModelRendererTurbo(this, 413, 77, textureX, textureY); // Box 38 cull
		bodyModel[236] = new ModelRendererTurbo(this, 405, 82, textureX, textureY); // Box 38 cull
		bodyModel[237] = new ModelRendererTurbo(this, 382, 80, textureX, textureY); // Box 38 cull
		bodyModel[238] = new ModelRendererTurbo(this, 394, 80, textureX, textureY); // Box 38 cull
		bodyModel[239] = new ModelRendererTurbo(this, 386, 71, textureX, textureY); // Box 38 cull
		bodyModel[240] = new ModelRendererTurbo(this, 368, 103, textureX, textureY); // Box 38 cull
		bodyModel[241] = new ModelRendererTurbo(this, 412, 103, textureX, textureY); // Box 38 cull
		bodyModel[242] = new ModelRendererTurbo(this, 280, 243, textureX, textureY); // Box 38
		bodyModel[243] = new ModelRendererTurbo(this, 254, 218, textureX, textureY); // Box 128
		bodyModel[244] = new ModelRendererTurbo(this, 262, 197, textureX, textureY); // Box 128
		bodyModel[245] = new ModelRendererTurbo(this, 265, 236, textureX, textureY); // Box 128
		bodyModel[246] = new ModelRendererTurbo(this, 264, 205, textureX, textureY); // Box 128
		bodyModel[247] = new ModelRendererTurbo(this, 265, 211, textureX, textureY); // Box 176
		bodyModel[248] = new ModelRendererTurbo(this, 264, 191, textureX, textureY); // Box 177
		bodyModel[249] = new ModelRendererTurbo(this, 297, 243, textureX, textureY); // Box 38
		bodyModel[250] = new ModelRendererTurbo(this, 212, 274, textureX, textureY); // Right seat part
		bodyModel[251] = new ModelRendererTurbo(this, 212, 284, textureX, textureY); // Right seat part
		bodyModel[252] = new ModelRendererTurbo(this, 203, 267, textureX, textureY); // Right seat part
		bodyModel[253] = new ModelRendererTurbo(this, 192, 267, textureX, textureY); // Right seat part
		bodyModel[254] = new ModelRendererTurbo(this, 203, 287, textureX, textureY); // Right seat part
		bodyModel[255] = new ModelRendererTurbo(this, 203, 284, textureX, textureY); // Right seat part
		bodyModel[256] = new ModelRendererTurbo(this, 203, 277, textureX, textureY); // Right seat part
		bodyModel[257] = new ModelRendererTurbo(this, 203, 274, textureX, textureY); // Right seat part
		bodyModel[258] = new ModelRendererTurbo(this, 212, 312, textureX, textureY); // Left seat part
		bodyModel[259] = new ModelRendererTurbo(this, 212, 302, textureX, textureY); // Left seat part
		bodyModel[260] = new ModelRendererTurbo(this, 203, 295, textureX, textureY); // Left seat part
		bodyModel[261] = new ModelRendererTurbo(this, 192, 295, textureX, textureY); // Left seat part
		bodyModel[262] = new ModelRendererTurbo(this, 203, 305, textureX, textureY); // Left seat part
		bodyModel[263] = new ModelRendererTurbo(this, 203, 302, textureX, textureY); // Left seat part
		bodyModel[264] = new ModelRendererTurbo(this, 203, 315, textureX, textureY); // Left seat part
		bodyModel[265] = new ModelRendererTurbo(this, 203, 312, textureX, textureY); // Left seat part
		bodyModel[266] = new ModelRendererTurbo(this, 192, 277, textureX, textureY); // Right seat part
		bodyModel[267] = new ModelRendererTurbo(this, 192, 305, textureX, textureY); // Left seat part
		bodyModel[268] = new ModelRendererTurbo(this, 243, 274, textureX, textureY); // Right seat part
		bodyModel[269] = new ModelRendererTurbo(this, 243, 284, textureX, textureY); // Right seat part
		bodyModel[270] = new ModelRendererTurbo(this, 234, 267, textureX, textureY); // Right seat part
		bodyModel[271] = new ModelRendererTurbo(this, 223, 267, textureX, textureY); // Right seat part
		bodyModel[272] = new ModelRendererTurbo(this, 234, 287, textureX, textureY); // Right seat part
		bodyModel[273] = new ModelRendererTurbo(this, 234, 284, textureX, textureY); // Right seat part
		bodyModel[274] = new ModelRendererTurbo(this, 234, 277, textureX, textureY); // Right seat part
		bodyModel[275] = new ModelRendererTurbo(this, 234, 274, textureX, textureY); // Right seat part
		bodyModel[276] = new ModelRendererTurbo(this, 243, 312, textureX, textureY); // Left seat part
		bodyModel[277] = new ModelRendererTurbo(this, 243, 302, textureX, textureY); // Left seat part
		bodyModel[278] = new ModelRendererTurbo(this, 234, 295, textureX, textureY); // Left seat part
		bodyModel[279] = new ModelRendererTurbo(this, 223, 295, textureX, textureY); // Left seat part
		bodyModel[280] = new ModelRendererTurbo(this, 234, 305, textureX, textureY); // Left seat part
		bodyModel[281] = new ModelRendererTurbo(this, 234, 302, textureX, textureY); // Left seat part
		bodyModel[282] = new ModelRendererTurbo(this, 234, 315, textureX, textureY); // Left seat part
		bodyModel[283] = new ModelRendererTurbo(this, 234, 312, textureX, textureY); // Left seat part
		bodyModel[284] = new ModelRendererTurbo(this, 223, 277, textureX, textureY); // Right seat part
		bodyModel[285] = new ModelRendererTurbo(this, 223, 305, textureX, textureY); // Left seat part
		bodyModel[286] = new ModelRendererTurbo(this, 274, 274, textureX, textureY); // Right seat part
		bodyModel[287] = new ModelRendererTurbo(this, 274, 284, textureX, textureY); // Right seat part
		bodyModel[288] = new ModelRendererTurbo(this, 265, 267, textureX, textureY); // Right seat part
		bodyModel[289] = new ModelRendererTurbo(this, 254, 267, textureX, textureY); // Right seat part
		bodyModel[290] = new ModelRendererTurbo(this, 265, 287, textureX, textureY); // Right seat part
		bodyModel[291] = new ModelRendererTurbo(this, 265, 284, textureX, textureY); // Right seat part
		bodyModel[292] = new ModelRendererTurbo(this, 265, 277, textureX, textureY); // Right seat part
		bodyModel[293] = new ModelRendererTurbo(this, 265, 274, textureX, textureY); // Right seat part
		bodyModel[294] = new ModelRendererTurbo(this, 274, 312, textureX, textureY); // Left seat part
		bodyModel[295] = new ModelRendererTurbo(this, 274, 302, textureX, textureY); // Left seat part
		bodyModel[296] = new ModelRendererTurbo(this, 265, 295, textureX, textureY); // Left seat part
		bodyModel[297] = new ModelRendererTurbo(this, 254, 295, textureX, textureY); // Left seat part
		bodyModel[298] = new ModelRendererTurbo(this, 265, 305, textureX, textureY); // Left seat part
		bodyModel[299] = new ModelRendererTurbo(this, 265, 302, textureX, textureY); // Left seat part
		bodyModel[300] = new ModelRendererTurbo(this, 265, 315, textureX, textureY); // Left seat part
		bodyModel[301] = new ModelRendererTurbo(this, 265, 312, textureX, textureY); // Left seat part
		bodyModel[302] = new ModelRendererTurbo(this, 254, 277, textureX, textureY); // Right seat part
		bodyModel[303] = new ModelRendererTurbo(this, 254, 305, textureX, textureY); // Left seat part
		bodyModel[304] = new ModelRendererTurbo(this, 172, 197, textureX, textureY); // Box 38
		bodyModel[305] = new ModelRendererTurbo(this, 161, 220, textureX, textureY); // Box 38
		bodyModel[306] = new ModelRendererTurbo(this, 209, 197, textureX, textureY); // Box 38
		bodyModel[307] = new ModelRendererTurbo(this, 223, 220, textureX, textureY); // Box 38
		bodyModel[308] = new ModelRendererTurbo(this, 224, 202, textureX, textureY); // Box 38
		bodyModel[309] = new ModelRendererTurbo(this, 176, 225, textureX, textureY); // Box 38
		bodyModel[310] = new ModelRendererTurbo(this, 238, 225, textureX, textureY); // Box 38
		bodyModel[311] = new ModelRendererTurbo(this, 139, 200, textureX, textureY); // Box 38
		bodyModel[312] = new ModelRendererTurbo(this, 150, 214, textureX, textureY); // Box 38
		bodyModel[313] = new ModelRendererTurbo(this, 163, 211, textureX, textureY); // Conductor's door
		bodyModel[314] = new ModelRendererTurbo(this, 155, 203, textureX, textureY); // Box 38
		bodyModel[315] = new ModelRendererTurbo(this, 159, 205, textureX, textureY); // Conductor's seat
		bodyModel[316] = new ModelRendererTurbo(this, 148, 203, textureX, textureY); // Box 38
		bodyModel[317] = new ModelRendererTurbo(this, 193, 250, textureX, textureY); // Box 38
		bodyModel[318] = new ModelRendererTurbo(this, 195, 337, textureX, textureY); // Box 38
		bodyModel[319] = new ModelRendererTurbo(this, 193, 262, textureX, textureY); // Box 333
		bodyModel[320] = new ModelRendererTurbo(this, 195, 343, textureX, textureY); // Box 334
		bodyModel[321] = new ModelRendererTurbo(this, 188, 202, textureX, textureY); // Box 38
		bodyModel[322] = new ModelRendererTurbo(this, 187, 211, textureX, textureY); // Box 38
		bodyModel[323] = new ModelRendererTurbo(this, 192, 211, textureX, textureY); // Box 38
		bodyModel[324] = new ModelRendererTurbo(this, 200, 212, textureX, textureY); // Box 38
		bodyModel[325] = new ModelRendererTurbo(this, 196, 207, textureX, textureY); // Box 38
		bodyModel[326] = new ModelRendererTurbo(this, 195, 204, textureX, textureY); // Box 38
		bodyModel[327] = new ModelRendererTurbo(this, 202, 203, textureX, textureY); // Box 401
		bodyModel[328] = new ModelRendererTurbo(this, 202, 225, textureX, textureY); // Box 346
		bodyModel[329] = new ModelRendererTurbo(this, 201, 234, textureX, textureY); // Box 347
		bodyModel[330] = new ModelRendererTurbo(this, 206, 234, textureX, textureY); // Box 348
		bodyModel[331] = new ModelRendererTurbo(this, 214, 235, textureX, textureY); // Box 349
		bodyModel[332] = new ModelRendererTurbo(this, 210, 230, textureX, textureY); // Box 350
		bodyModel[333] = new ModelRendererTurbo(this, 209, 227, textureX, textureY); // Box 351
		bodyModel[334] = new ModelRendererTurbo(this, 216, 226, textureX, textureY); // Box 352
		bodyModel[335] = new ModelRendererTurbo(this, 143, 226, textureX, textureY); // Box 349
		bodyModel[336] = new ModelRendererTurbo(this, 152, 226, textureX, textureY); // Box 349
		bodyModel[337] = new ModelRendererTurbo(this, 144, 236, textureX, textureY); // Box 38
		bodyModel[338] = new ModelRendererTurbo(this, 144, 247, textureX, textureY); // Box 38 cull
		bodyModel[339] = new ModelRendererTurbo(this, 144, 242, textureX, textureY); // Box 38
		bodyModel[340] = new ModelRendererTurbo(this, 91, 221, textureX, textureY); // Box 38
		bodyModel[341] = new ModelRendererTurbo(this, 81, 221, textureX, textureY); // Box 38
		bodyModel[342] = new ModelRendererTurbo(this, 81, 199, textureX, textureY); // Box 360
		bodyModel[343] = new ModelRendererTurbo(this, 86, 219, textureX, textureY); // Box 38
		bodyModel[344] = new ModelRendererTurbo(this, 76, 219, textureX, textureY); // Box 38
		bodyModel[345] = new ModelRendererTurbo(this, 76, 197, textureX, textureY); // Box 363
		bodyModel[346] = new ModelRendererTurbo(this, 192, 325, textureX, textureY); // Box 38
		bodyModel[347] = new ModelRendererTurbo(this, 195, 331, textureX, textureY); // Box 38 glow
		bodyModel[348] = new ModelRendererTurbo(this, 181, 274, textureX, textureY); // Right seat part
		bodyModel[349] = new ModelRendererTurbo(this, 181, 284, textureX, textureY); // Right seat part
		bodyModel[350] = new ModelRendererTurbo(this, 172, 267, textureX, textureY); // Right seat part
		bodyModel[351] = new ModelRendererTurbo(this, 161, 267, textureX, textureY); // Right seat part
		bodyModel[352] = new ModelRendererTurbo(this, 172, 287, textureX, textureY); // Right seat part
		bodyModel[353] = new ModelRendererTurbo(this, 172, 284, textureX, textureY); // Right seat part
		bodyModel[354] = new ModelRendererTurbo(this, 172, 277, textureX, textureY); // Right seat part
		bodyModel[355] = new ModelRendererTurbo(this, 172, 274, textureX, textureY); // Right seat part
		bodyModel[356] = new ModelRendererTurbo(this, 181, 312, textureX, textureY); // Left seat part
		bodyModel[357] = new ModelRendererTurbo(this, 181, 302, textureX, textureY); // Left seat part
		bodyModel[358] = new ModelRendererTurbo(this, 172, 295, textureX, textureY); // Left seat part
		bodyModel[359] = new ModelRendererTurbo(this, 161, 295, textureX, textureY); // Left seat part
		bodyModel[360] = new ModelRendererTurbo(this, 172, 305, textureX, textureY); // Left seat part
		bodyModel[361] = new ModelRendererTurbo(this, 172, 302, textureX, textureY); // Left seat part
		bodyModel[362] = new ModelRendererTurbo(this, 172, 315, textureX, textureY); // Left seat part
		bodyModel[363] = new ModelRendererTurbo(this, 172, 312, textureX, textureY); // Left seat part
		bodyModel[364] = new ModelRendererTurbo(this, 161, 277, textureX, textureY); // Right seat part
		bodyModel[365] = new ModelRendererTurbo(this, 161, 305, textureX, textureY); // Left seat part
		bodyModel[366] = new ModelRendererTurbo(this, 163, 250, textureX, textureY); // Box 38
		bodyModel[367] = new ModelRendererTurbo(this, 169, 337, textureX, textureY); // Box 38
		bodyModel[368] = new ModelRendererTurbo(this, 163, 262, textureX, textureY); // Box 333
		bodyModel[369] = new ModelRendererTurbo(this, 169, 343, textureX, textureY); // Box 334
		bodyModel[370] = new ModelRendererTurbo(this, 160, 325, textureX, textureY); // Box 38
		bodyModel[371] = new ModelRendererTurbo(this, 169, 331, textureX, textureY); // Box 38 glow
		bodyModel[372] = new ModelRendererTurbo(this, 141, 267, textureX, textureY); // Box 38
		bodyModel[373] = new ModelRendererTurbo(this, 141, 293, textureX, textureY); // Box 38
		bodyModel[374] = new ModelRendererTurbo(this, 117, 256, textureX, textureY); // Box 128
		bodyModel[375] = new ModelRendererTurbo(this, 117, 282, textureX, textureY); // Box 128
		bodyModel[376] = new ModelRendererTurbo(this, 132, 310, textureX, textureY); // Box 128
		bodyModel[377] = new ModelRendererTurbo(this, 121, 311, textureX, textureY); // Box 128
		bodyModel[378] = new ModelRendererTurbo(this, 132, 274, textureX, textureY); // Box 176
		bodyModel[379] = new ModelRendererTurbo(this, 121, 275, textureX, textureY); // Box 177
		bodyModel[380] = new ModelRendererTurbo(this, 126, 284, textureX, textureY); // C&O bulkhead door
		bodyModel[381] = new ModelRendererTurbo(this, 89, 267, textureX, textureY); // Box 38
		bodyModel[382] = new ModelRendererTurbo(this, 106, 269, textureX, textureY); // Box 38
		bodyModel[383] = new ModelRendererTurbo(this, 79, 276, textureX, textureY); // Box 176
		bodyModel[384] = new ModelRendererTurbo(this, 78, 270, textureX, textureY); // Box 177
		bodyModel[385] = new ModelRendererTurbo(this, 78, 283, textureX, textureY); // Box 38
		bodyModel[386] = new ModelRendererTurbo(this, 88, 310, textureX, textureY); // Box 405
		bodyModel[387] = new ModelRendererTurbo(this, 91, 303, textureX, textureY); // Box 406
		bodyModel[388] = new ModelRendererTurbo(this, 91, 296, textureX, textureY); // Box 407
		bodyModel[389] = new ModelRendererTurbo(this, 91, 291, textureX, textureY); // Box 408
		bodyModel[390] = new ModelRendererTurbo(this, 35, 301, textureX, textureY); // Box 405
		bodyModel[391] = new ModelRendererTurbo(this, 35, 309, textureX, textureY); // Box 405
		bodyModel[392] = new ModelRendererTurbo(this, 30, 303, textureX, textureY); // Box 38
		bodyModel[393] = new ModelRendererTurbo(this, 25, 304, textureX, textureY); // Box 38
		bodyModel[394] = new ModelRendererTurbo(this, 23, 275, textureX, textureY); // Box 413
		bodyModel[395] = new ModelRendererTurbo(this, 23, 283, textureX, textureY); // Box 414
		bodyModel[396] = new ModelRendererTurbo(this, 18, 277, textureX, textureY); // Box 415
		bodyModel[397] = new ModelRendererTurbo(this, 13, 278, textureX, textureY); // Box 416
		bodyModel[398] = new ModelRendererTurbo(this, 1, 249, textureX, textureY); // Box 414
		bodyModel[399] = new ModelRendererTurbo(this, 1, 241, textureX, textureY); // Box 414
		bodyModel[400] = new ModelRendererTurbo(this, 81, 294, textureX, textureY); // Box 38 glow
		bodyModel[401] = new ModelRendererTurbo(this, 72, 294, textureX, textureY); // Box 38 glow
		bodyModel[402] = new ModelRendererTurbo(this, 63, 294, textureX, textureY); // Box 38 glow
		bodyModel[403] = new ModelRendererTurbo(this, 15, 306, textureX, textureY); // Box 38 glow
		bodyModel[404] = new ModelRendererTurbo(this, 6, 309, textureX, textureY); // Box 38 glow
		bodyModel[405] = new ModelRendererTurbo(this, 46, 292, textureX, textureY); // Box 38
		bodyModel[406] = new ModelRendererTurbo(this, 17, 311, textureX, textureY); // Box 38
		bodyModel[407] = new ModelRendererTurbo(this, 17, 316, textureX, textureY); // Box 38
		bodyModel[408] = new ModelRendererTurbo(this, 15, 320, textureX, textureY); // Box 38 glow
		bodyModel[409] = new ModelRendererTurbo(this, 17, 292, textureX, textureY); // Box 429
		bodyModel[410] = new ModelRendererTurbo(this, 17, 297, textureX, textureY); // Box 430
		bodyModel[411] = new ModelRendererTurbo(this, 15, 301, textureX, textureY); // Box 38 glow
		bodyModel[412] = new ModelRendererTurbo(this, 5, 292, textureX, textureY); // Box 414
		bodyModel[413] = new ModelRendererTurbo(this, 6, 300, textureX, textureY); // Box 414
		bodyModel[414] = new ModelRendererTurbo(this, 5, 304, textureX, textureY); // Box 414
		bodyModel[415] = new ModelRendererTurbo(this, 4, 284, textureX, textureY); // Box 414
		bodyModel[416] = new ModelRendererTurbo(this, 3, 289, textureX, textureY); // Folding table
		bodyModel[417] = new ModelRendererTurbo(this, 141, 354, textureX, textureY); // Box 38
		bodyModel[418] = new ModelRendererTurbo(this, 141, 380, textureX, textureY); // Box 38
		bodyModel[419] = new ModelRendererTurbo(this, 151, 364, textureX, textureY); // Box 128
		bodyModel[420] = new ModelRendererTurbo(this, 132, 361, textureX, textureY); // Box 176
		bodyModel[421] = new ModelRendererTurbo(this, 126, 371, textureX, textureY); // D&RGW bulkhead door
		bodyModel[422] = new ModelRendererTurbo(this, 97, 464, textureX, textureY); // Box 38
		bodyModel[423] = new ModelRendererTurbo(this, 82, 458, textureX, textureY); // Box 128
		bodyModel[424] = new ModelRendererTurbo(this, 81, 334, textureX, textureY); // Box 128
		bodyModel[425] = new ModelRendererTurbo(this, 1, 490, textureX, textureY); // Box 128
		bodyModel[426] = new ModelRendererTurbo(this, 83, 348, textureX, textureY); // Box 128
		bodyModel[427] = new ModelRendererTurbo(this, 93, 451, textureX, textureY); // Box 176
		bodyModel[428] = new ModelRendererTurbo(this, 83, 342, textureX, textureY); // Box 177
		bodyModel[429] = new ModelRendererTurbo(this, 86, 476, textureX, textureY); // Front dorm door
		bodyModel[430] = new ModelRendererTurbo(this, 4, 334, textureX, textureY); // Box 128
		bodyModel[431] = new ModelRendererTurbo(this, 6, 348, textureX, textureY); // Box 128
		bodyModel[432] = new ModelRendererTurbo(this, 6, 342, textureX, textureY); // Box 177
		bodyModel[433] = new ModelRendererTurbo(this, 1, 452, textureX, textureY); // Box 38
		bodyModel[434] = new ModelRendererTurbo(this, 62, 368, textureX, textureY); // Box 38
		bodyModel[435] = new ModelRendererTurbo(this, 105, 368, textureX, textureY); // Box 38
		bodyModel[436] = new ModelRendererTurbo(this, 86, 376, textureX, textureY); // Box 128
		bodyModel[437] = new ModelRendererTurbo(this, 88, 371, textureX, textureY); // Box 176
		bodyModel[438] = new ModelRendererTurbo(this, 1, 438, textureX, textureY); // Box 128
		bodyModel[439] = new ModelRendererTurbo(this, 12, 435, textureX, textureY); // Box 176
		bodyModel[440] = new ModelRendererTurbo(this, 95, 380, textureX, textureY); // Box 38
		bodyModel[441] = new ModelRendererTurbo(this, 112, 386, textureX, textureY); // Box 38
		bodyModel[442] = new ModelRendererTurbo(this, 95, 381, textureX, textureY); // Box 128
		bodyModel[443] = new ModelRendererTurbo(this, 132, 397, textureX, textureY); // Box 128
		bodyModel[444] = new ModelRendererTurbo(this, 17, 417, textureX, textureY); // Box 38
		bodyModel[445] = new ModelRendererTurbo(this, 8, 417, textureX, textureY); // Steward door
		bodyModel[446] = new ModelRendererTurbo(this, 49, 417, textureX, textureY); // Box 38
		bodyModel[447] = new ModelRendererTurbo(this, 38, 417, textureX, textureY); // Dorm door
		bodyModel[448] = new ModelRendererTurbo(this, 1, 484, textureX, textureY); // Box 128
		bodyModel[449] = new ModelRendererTurbo(this, 76, 355, textureX, textureY); // Box 128
		bodyModel[450] = new ModelRendererTurbo(this, 107, 356, textureX, textureY); // Box 128
		bodyModel[451] = new ModelRendererTurbo(this, 19, 440, textureX, textureY); // Box 128
		bodyModel[452] = new ModelRendererTurbo(this, 30, 435, textureX, textureY); // Box 176
		bodyModel[453] = new ModelRendererTurbo(this, 80, 375, textureX, textureY); // Box 128
		bodyModel[454] = new ModelRendererTurbo(this, 82, 372, textureX, textureY); // Box 176
		bodyModel[455] = new ModelRendererTurbo(this, 61, 360, textureX, textureY); // Box 38
		bodyModel[456] = new ModelRendererTurbo(this, 62, 400, textureX, textureY); // Box 38
		bodyModel[457] = new ModelRendererTurbo(this, 2, 360, textureX, textureY); // Box 38
		bodyModel[458] = new ModelRendererTurbo(this, 29, 371, textureX, textureY); // Box 38
		bodyModel[459] = new ModelRendererTurbo(this, 29, 402, textureX, textureY); // Box 38
		bodyModel[460] = new ModelRendererTurbo(this, 67, 461, textureX, textureY); // Box 38
		bodyModel[461] = new ModelRendererTurbo(this, 34, 468, textureX, textureY); // Box 38
		bodyModel[462] = new ModelRendererTurbo(this, 34, 463, textureX, textureY); // Box 38
		bodyModel[463] = new ModelRendererTurbo(this, 37, 473, textureX, textureY); // Box 38
		bodyModel[464] = new ModelRendererTurbo(this, 7, 368, textureX, textureY); // Box 38
		bodyModel[465] = new ModelRendererTurbo(this, 28, 356, textureX, textureY); // Box 38
		bodyModel[466] = new ModelRendererTurbo(this, 1, 364, textureX, textureY); // Box 38
		bodyModel[467] = new ModelRendererTurbo(this, 27, 354, textureX, textureY); // Box 38
		bodyModel[468] = new ModelRendererTurbo(this, 31, 352, textureX, textureY); // Box 38
		bodyModel[469] = new ModelRendererTurbo(this, 26, 354, textureX, textureY); // Box 38
		bodyModel[470] = new ModelRendererTurbo(this, 8, 399, textureX, textureY); // Box 38
		bodyModel[471] = new ModelRendererTurbo(this, 29, 387, textureX, textureY); // Box 38
		bodyModel[472] = new ModelRendererTurbo(this, 1, 394, textureX, textureY); // Box 38
		bodyModel[473] = new ModelRendererTurbo(this, 28, 385, textureX, textureY); // Box 38
		bodyModel[474] = new ModelRendererTurbo(this, 32, 383, textureX, textureY); // Box 38
		bodyModel[475] = new ModelRendererTurbo(this, 27, 385, textureX, textureY); // Box 38
		bodyModel[476] = new ModelRendererTurbo(this, 46, 457, textureX, textureY); // Box 128 glow
		bodyModel[477] = new ModelRendererTurbo(this, 2, 354, textureX, textureY); // Box 128 glow
		bodyModel[478] = new ModelRendererTurbo(this, 98, 359, textureX, textureY); // Box 128
		bodyModel[479] = new ModelRendererTurbo(this, 100, 356, textureX, textureY); // Box 176
		bodyModel[480] = new ModelRendererTurbo(this, 442, 1, textureX, textureY); // Box 128
		bodyModel[481] = new ModelRendererTurbo(this, 373, 1, textureX, textureY); // Box 128
		bodyModel[482] = new ModelRendererTurbo(this, 394, 9, textureX, textureY); // Box 128
		bodyModel[483] = new ModelRendererTurbo(this, 392, 1, textureX, textureY); // Box 128
		bodyModel[484] = new ModelRendererTurbo(this, 362, 9, textureX, textureY); // Box 176
		bodyModel[485] = new ModelRendererTurbo(this, 358, 1, textureX, textureY); // Box 177
		bodyModel[486] = new ModelRendererTurbo(this, 143, 221, textureX, textureY); // Box 349
		bodyModel[487] = new ModelRendererTurbo(this, 167, 203, textureX, textureY); // Box 38 glow
		bodyModel[488] = new ModelRendererTurbo(this, 63, 148, textureX, textureY); // Box 2
		bodyModel[489] = new ModelRendererTurbo(this, 71, 148, textureX, textureY); // Box 2
		bodyModel[490] = new ModelRendererTurbo(this, 65, 149, textureX, textureY); // Box 2
		bodyModel[491] = new ModelRendererTurbo(this, 65, 152, textureX, textureY); // Box 2
		bodyModel[492] = new ModelRendererTurbo(this, 63, 138, textureX, textureY); // Box 154
		bodyModel[493] = new ModelRendererTurbo(this, 71, 138, textureX, textureY); // Box 155
		bodyModel[494] = new ModelRendererTurbo(this, 65, 139, textureX, textureY); // Box 156
		bodyModel[495] = new ModelRendererTurbo(this, 65, 142, textureX, textureY); // Box 157

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

		bodyModel[126].addBox(0F, 0F, 0F, 95, 16, 1, 0F); // Box 38
		bodyModel[126].setRotationPoint(-38F, -15F, -11F);

		bodyModel[127].addBox(0F, 0F, 0F, 95, 16, 1, 0F); // Box 128
		bodyModel[127].setRotationPoint(-38F, -15F, 10F);

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

		bodyModel[133].addBox(0F, 0F, 0F, 1, 16, 7, 0F); // Box 128
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

		bodyModel[141].addShapeBox(-1F, 0F, 0F, 1, 15, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Front end door
		bodyModel[141].setRotationPoint(-59.99F, -14F, -3F);

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

		bodyModel[162].addBox(0F, 0F, 0F, 123, 1, 6, 0F); // Box 128
		bodyModel[162].setRotationPoint(-61F, -20F, -3F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 123, 1, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[163].setRotationPoint(-61F, -20F, -7F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 123, 1, 3, 0F,0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[164].setRotationPoint(-61F, -19F, -10F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 123, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 168
		bodyModel[165].setRotationPoint(-61F, -20F, 3F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 123, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F); // Box 169
		bodyModel[166].setRotationPoint(-61F, -19F, 7F);

		bodyModel[167].addBox(0F, 0F, 0F, 3, 3, 14, 0F); // Box 128
		bodyModel[167].setRotationPoint(-61F, -18F, -7F);

		bodyModel[168].addBox(0F, 0F, 0F, 3, 1, 6, 0F); // Box 128
		bodyModel[168].setRotationPoint(-61F, -19F, -3F);

		bodyModel[169].addShapeBox(0F, 0F, 0F, 3, 3, 3, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[169].setRotationPoint(-61F, -18F, -10F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[170].setRotationPoint(-61F, -19F, -7F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 3, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 176
		bodyModel[171].setRotationPoint(-61F, -18F, 7F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 177
		bodyModel[172].setRotationPoint(-61F, -19F, 3F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 123, 1, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 1.25F, -1F, 0F, 1.25F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 128
		bodyModel[173].setRotationPoint(-61F, -16F, -11F);

		bodyModel[174].addShapeBox(0F, 0F, 0F, 123, 1, 2, 0F,0F, 1.25F, 0F, 0F, 1.25F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 170
		bodyModel[174].setRotationPoint(-61F, -16F, 10F);

		bodyModel[175].addShapeBox(0F, 0F, 0F, 0, 8, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Rear gate closed
		bodyModel[175].setRotationPoint(63F, -7F, -3F);

		bodyModel[176].addBox(0F, 0F, 0F, 14, 16, 1, 0F); // Box 128
		bodyModel[176].setRotationPoint(-61F, -15F, 10F);

		bodyModel[177].addBox(0F, 0F, 0F, 9, 2, 1, 0F); // Box 128
		bodyModel[177].setRotationPoint(-47F, -15F, 10F);

		bodyModel[178].addShapeBox(0F, 0F, 0F, 10, 14, 1, 0F,0F, 0F, -0.01F, -1F, 0F, -0.01F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.01F, -1F, 0F, -0.01F, -1F, 0F, -0.5F, 0F, 0F, -0.5F); // Baggage door R
		bodyModel[178].setRotationPoint(-47F, -13F, 10F);

		bodyModel[179].addBox(0F, 0F, 0F, 14, 16, 1, 0F); // Box 38
		bodyModel[179].setRotationPoint(-61F, -15F, -11F);

		bodyModel[180].addBox(0F, 0F, 0F, 9, 2, 1, 0F); // Box 192
		bodyModel[180].setRotationPoint(-47F, -15F, -11F);

		bodyModel[181].addShapeBox(0F, 0F, 0F, 10, 14, 1, 0F,0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.01F, 0F, 0F, -0.01F); // Baggage door L
		bodyModel[181].setRotationPoint(-47F, -13F, -11F);

		bodyModel[182].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,-0.5F, -0.35F, 0F, -0.5F, -0.35F, 0F, -0.6F, -0.75F, 0F, -0.6F, -0.75F, 0F, 0F, -2.25F, 0F, 0F, -2.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[182].setRotationPoint(45F, -18F, 10F);

		bodyModel[183].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, 0.15F, 0F, 0F, 0.15F, -0.5F, -0.85F, 0F, -0.5F, -0.85F, 0F, 0F, -1F, 0.15F, 0F, -1F, 0.15F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 128
		bodyModel[183].setRotationPoint(45F, -18.5F, 8F);

		bodyModel[184].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,-0.6F, -0.75F, 0F, -0.6F, -0.75F, 0F, -0.5F, -0.35F, 0F, -0.5F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.25F, 0F, 0F, -2.25F, 0F); // Box 190
		bodyModel[184].setRotationPoint(42F, -18F, -11F);

		bodyModel[185].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,-0.5F, -0.85F, 0F, -0.5F, -0.85F, 0F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -1F, 0.15F, 0F, -1F, 0.15F); // Box 191
		bodyModel[185].setRotationPoint(42F, -18.5F, -10F);

		bodyModel[186].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,-0.6F, -0.75F, -0.5F, -0.6F, -0.75F, -0.5F, -0.6F, -0.75F, -0.5F, -0.6F, -0.75F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 190
		bodyModel[186].setRotationPoint(42F, -18F, -11.5F);

		bodyModel[187].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[187].setRotationPoint(47F, -20.75F, -5F);

		bodyModel[188].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,-0.5F, -0.35F, 0F, -0.5F, -0.35F, 0F, -0.6F, -0.75F, 0F, -0.6F, -0.75F, 0F, 0F, -2.25F, 0F, 0F, -2.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[188].setRotationPoint(-10F, -18F, 10F);

		bodyModel[189].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, 0.15F, 0F, 0F, 0.15F, -0.5F, -0.85F, 0F, -0.5F, -0.85F, 0F, 0F, -1F, 0.15F, 0F, -1F, 0.15F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 128
		bodyModel[189].setRotationPoint(-10F, -18.5F, 8F);

		bodyModel[190].addShapeBox(0F, 0F, 0F, 0, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Rear gate open
		bodyModel[190].setRotationPoint(63F, -7F, -3F);

		bodyModel[191].addBox(0F, 0F, 0F, 125, 1, 2, 0F); // Box 128
		bodyModel[191].setRotationPoint(-62F, -21F, -1F);

		bodyModel[192].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[192].setRotationPoint(-26F, -19.5F, 5.85F);

		bodyModel[193].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[193].setRotationPoint(-26F, -20.25F, 3.85F);

		bodyModel[194].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[194].setRotationPoint(-41F, -19.5F, 5.85F);

		bodyModel[195].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[195].setRotationPoint(-41F, -20.25F, 3.85F);

		bodyModel[196].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[196].setRotationPoint(-58F, -19.5F, 5.85F);

		bodyModel[197].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[197].setRotationPoint(-58F, -20.25F, 3.85F);

		bodyModel[198].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 210
		bodyModel[198].setRotationPoint(-21F, -19.5F, -7.85F);

		bodyModel[199].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 211
		bodyModel[199].setRotationPoint(-21F, -20.25F, -5.85F);

		bodyModel[200].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 212
		bodyModel[200].setRotationPoint(-33F, -19.5F, -7.85F);

		bodyModel[201].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 213
		bodyModel[201].setRotationPoint(-33F, -20.25F, -5.85F);

		bodyModel[202].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 214
		bodyModel[202].setRotationPoint(-50F, -19.5F, -7.85F);

		bodyModel[203].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 215
		bodyModel[203].setRotationPoint(-50F, -20.25F, -5.85F);

		bodyModel[204].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 210
		bodyModel[204].setRotationPoint(-1F, -19.5F, -7.85F);

		bodyModel[205].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 211
		bodyModel[205].setRotationPoint(-1F, -20.25F, -5.85F);

		bodyModel[206].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,-0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, -0.15F, -0.01F, 0F, -0.15F, -0.01F, -0.5F, 0F, -0.01F, -0.5F, 0F, -0.01F, -0.5F, -0.15F, -0.01F, -0.5F, -0.15F); // Box 211
		bodyModel[206].setRotationPoint(-1F, -20.75F, -4.85F);

		bodyModel[207].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 1.35F, 0F, 0F, 1.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.6F, 0F, 0F, -1.6F, 0F); // Box 212
		bodyModel[207].setRotationPoint(-34F, -18.9F, -8.85F);

		bodyModel[208].addBox(0F, 0F, 0F, 1, 14, 2, 0F); // Box 38 cull
		bodyModel[208].setRotationPoint(-62F, -15F, -11F);

		bodyModel[209].addBox(0F, 0F, 0F, 1, 14, 2, 0F); // Box 38 cull
		bodyModel[209].setRotationPoint(-62F, -15F, 9F);

		bodyModel[210].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[210].setRotationPoint(56.5F, -6F, -12F);

		bodyModel[211].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[211].setRotationPoint(61.5F, -6F, -12F);

		bodyModel[212].addShapeBox(0F, 0F, 0F, 4, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[212].setRotationPoint(-61F, -1.5F, -12F);

		bodyModel[213].addShapeBox(0F, 0F, 0F, 3, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[213].setRotationPoint(-61F, 6F, -10.5F);

		bodyModel[214].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 202
		bodyModel[214].setRotationPoint(56.5F, -6F, 11F);

		bodyModel[215].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 203
		bodyModel[215].setRotationPoint(61.5F, -6F, 11F);

		bodyModel[216].addShapeBox(0F, 0F, 0F, 4, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 204
		bodyModel[216].setRotationPoint(-61F, -1.5F, 11F);

		bodyModel[217].addShapeBox(0F, 0F, 0F, 3, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 205
		bodyModel[217].setRotationPoint(-61F, 6F, 10.5F);

		bodyModel[218].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 1.25F, -1F, 0F, 1.25F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 38 cull
		bodyModel[218].setRotationPoint(-62F, -16F, -11F);

		bodyModel[219].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 1.25F, 0F, 0F, 1.25F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 38 cull
		bodyModel[219].setRotationPoint(-62F, -16F, 10F);

		bodyModel[220].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.85F, 0F, 0F, 0.85F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 38 cull
		bodyModel[220].setRotationPoint(-62F, -17F, -10F);

		bodyModel[221].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -1.15F, 0F, 0F, -1.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.15F, 0F, 0F, 1.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38 cull
		bodyModel[221].setRotationPoint(-62F, -19F, -9F);

		bodyModel[222].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0.85F, 0F, 0F, 0.85F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 38 cull
		bodyModel[222].setRotationPoint(-62F, -17F, 9F);

		bodyModel[223].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.15F, 0F, 0F, -1.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.15F, 0F, 0F, 1.15F, 0F); // Box 38 cull
		bodyModel[223].setRotationPoint(-62F, -19F, 7F);

		bodyModel[224].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38 cull
		bodyModel[224].setRotationPoint(-62F, -20F, -7F);

		bodyModel[225].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 38 cull
		bodyModel[225].setRotationPoint(-62F, -20F, 3F);

		bodyModel[226].addBox(0F, 0F, 0F, 1, 2, 6, 0F); // Box 38 cull
		bodyModel[226].setRotationPoint(-62F, -20F, -3F);

		bodyModel[227].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 38 cull
		bodyModel[227].setRotationPoint(-62F, -1F, -11F);

		bodyModel[228].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 38 cull
		bodyModel[228].setRotationPoint(-62F, -1F, 9F);

		bodyModel[229].addBox(0F, 0F, 0F, 1, 14, 2, 0F); // Box 38 cull
		bodyModel[229].setRotationPoint(62F, -15F, -11F);

		bodyModel[230].addBox(0F, 0F, 0F, 1, 14, 2, 0F); // Box 38 cull
		bodyModel[230].setRotationPoint(62F, -15F, 9F);

		bodyModel[231].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 1.25F, -1F, 0F, 1.25F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 38 cull
		bodyModel[231].setRotationPoint(62F, -16F, -11F);

		bodyModel[232].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 1.25F, 0F, 0F, 1.25F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 38 cull
		bodyModel[232].setRotationPoint(62F, -16F, 10F);

		bodyModel[233].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.85F, 0F, 0F, 0.85F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 38 cull
		bodyModel[233].setRotationPoint(62F, -17F, -10F);

		bodyModel[234].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -1.15F, 0F, 0F, -1.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.15F, 0F, 0F, 1.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38 cull
		bodyModel[234].setRotationPoint(62F, -19F, -9F);

		bodyModel[235].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0.85F, 0F, 0F, 0.85F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 38 cull
		bodyModel[235].setRotationPoint(62F, -17F, 9F);

		bodyModel[236].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.15F, 0F, 0F, -1.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.15F, 0F, 0F, 1.15F, 0F); // Box 38 cull
		bodyModel[236].setRotationPoint(62F, -19F, 7F);

		bodyModel[237].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38 cull
		bodyModel[237].setRotationPoint(62F, -20F, -7F);

		bodyModel[238].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 38 cull
		bodyModel[238].setRotationPoint(62F, -20F, 3F);

		bodyModel[239].addBox(0F, 0F, 0F, 1, 2, 6, 0F); // Box 38 cull
		bodyModel[239].setRotationPoint(62F, -20F, -3F);

		bodyModel[240].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 38 cull
		bodyModel[240].setRotationPoint(62F, -1F, -11F);

		bodyModel[241].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 38 cull
		bodyModel[241].setRotationPoint(62F, -1F, 9F);

		bodyModel[242].addBox(0F, 0F, 0F, 1, 16, 7, 0F); // Box 38
		bodyModel[242].setRotationPoint(40F, -15F, 3F);

		bodyModel[243].addBox(0F, 0F, 0F, 16, 3, 14, 0F); // Box 128
		bodyModel[243].setRotationPoint(40F, -18F, -7F);

		bodyModel[244].addBox(0F, 0F, 0F, 16, 1, 6, 0F); // Box 128
		bodyModel[244].setRotationPoint(40F, -19F, -3F);

		bodyModel[245].addShapeBox(0F, 0F, 0F, 16, 3, 3, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[245].setRotationPoint(40F, -18F, -10F);

		bodyModel[246].addShapeBox(0F, 0F, 0F, 16, 1, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[246].setRotationPoint(40F, -19F, -7F);

		bodyModel[247].addShapeBox(0F, 0F, 0F, 16, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 176
		bodyModel[247].setRotationPoint(40F, -18F, 7F);

		bodyModel[248].addShapeBox(0F, 0F, 0F, 16, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 177
		bodyModel[248].setRotationPoint(40F, -19F, 3F);

		bodyModel[249].addBox(0F, 0F, 0F, 1, 16, 7, 0F); // Box 38
		bodyModel[249].setRotationPoint(40F, -15F, -10F);

		bodyModel[250].addBox(0.5F, 0F, 2F, 2, 6, 1, 0F); // Right seat part
		bodyModel[250].setRotationPoint(11.5F, -5F, 7F);
		bodyModel[250].rotateAngleY = -3.14159265F;

		bodyModel[251].addBox(0.5F, 0F, -3F, 2, 6, 1, 0F); // Right seat part
		bodyModel[251].setRotationPoint(11.5F, -5F, 7F);
		bodyModel[251].rotateAngleY = -3.14159265F;

		bodyModel[252].addBox(-1.5F, 0F, -2F, 5, 2, 4, 0F); // Right seat part
		bodyModel[252].setRotationPoint(11.5F, -3F, 7F);
		bodyModel[252].rotateAngleY = -3.14159265F;

		bodyModel[253].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[253].setRotationPoint(11.5F, -8F, 7F);
		bodyModel[253].rotateAngleY = -3.14159265F;

		bodyModel[254].addBox(-2.5F, 0F, -3F, 3, 5, 1, 0F); // Right seat part
		bodyModel[254].setRotationPoint(11.5F, -4F, 7F);
		bodyModel[254].rotateAngleY = -3.14159265F;

		bodyModel[255].addShapeBox(-2.5F, 0F, -3F, 3, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[255].setRotationPoint(11.5F, -5F, 7F);
		bodyModel[255].rotateAngleY = -3.14159265F;

		bodyModel[256].addBox(-2.5F, 0F, 2F, 3, 5, 1, 0F); // Right seat part
		bodyModel[256].setRotationPoint(11.5F, -4F, 7F);
		bodyModel[256].rotateAngleY = -3.14159265F;

		bodyModel[257].addShapeBox(-2.5F, 0F, 2F, 3, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[257].setRotationPoint(11.5F, -5F, 7F);
		bodyModel[257].rotateAngleY = -3.14159265F;

		bodyModel[258].addBox(0.5F, 0F, -3F, 2, 6, 1, 0F); // Left seat part
		bodyModel[258].setRotationPoint(11.5F, -5F, -7F);
		bodyModel[258].rotateAngleY = -3.14159265F;

		bodyModel[259].addBox(0.5F, 0F, 2F, 2, 6, 1, 0F); // Left seat part
		bodyModel[259].setRotationPoint(11.5F, -5F, -7F);
		bodyModel[259].rotateAngleY = -3.14159265F;

		bodyModel[260].addBox(-1.5F, 0F, -2F, 5, 2, 4, 0F); // Left seat part
		bodyModel[260].setRotationPoint(11.5F, -3F, -7F);
		bodyModel[260].rotateAngleY = -3.14159265F;

		bodyModel[261].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[261].setRotationPoint(11.5F, -8F, -7F);
		bodyModel[261].rotateAngleY = -3.14159265F;

		bodyModel[262].addBox(-2.5F, 0F, 2F, 3, 5, 1, 0F); // Left seat part
		bodyModel[262].setRotationPoint(11.5F, -4F, -7F);
		bodyModel[262].rotateAngleY = -3.14159265F;

		bodyModel[263].addShapeBox(-2.5F, 0F, 2F, 3, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[263].setRotationPoint(11.5F, -5F, -7F);
		bodyModel[263].rotateAngleY = -3.14159265F;

		bodyModel[264].addBox(-2.5F, 0F, -3F, 3, 5, 1, 0F); // Left seat part
		bodyModel[264].setRotationPoint(11.5F, -4F, -7F);
		bodyModel[264].rotateAngleY = -3.14159265F;

		bodyModel[265].addShapeBox(-2.5F, 0F, -3F, 3, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[265].setRotationPoint(11.5F, -5F, -7F);
		bodyModel[265].rotateAngleY = -3.14159265F;

		bodyModel[266].addShapeBox(-2.5F, 0F, -2F, 1, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Right seat part
		bodyModel[266].setRotationPoint(11.5F, -3F, 7F);
		bodyModel[266].rotateAngleY = -3.14159265F;

		bodyModel[267].addShapeBox(-2.5F, 0F, -2F, 1, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Left seat part
		bodyModel[267].setRotationPoint(11.5F, -3F, -7F);
		bodyModel[267].rotateAngleY = -3.14159265F;

		bodyModel[268].addBox(0.5F, 0F, 2F, 2, 6, 1, 0F); // Right seat part
		bodyModel[268].setRotationPoint(22.5F, -5F, 7F);
		bodyModel[268].rotateAngleY = -3.14159265F;

		bodyModel[269].addBox(0.5F, 0F, -3F, 2, 6, 1, 0F); // Right seat part
		bodyModel[269].setRotationPoint(22.5F, -5F, 7F);
		bodyModel[269].rotateAngleY = -3.14159265F;

		bodyModel[270].addBox(-1.5F, 0F, -2F, 5, 2, 4, 0F); // Right seat part
		bodyModel[270].setRotationPoint(22.5F, -3F, 7F);
		bodyModel[270].rotateAngleY = -3.14159265F;

		bodyModel[271].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[271].setRotationPoint(22.5F, -8F, 7F);
		bodyModel[271].rotateAngleY = -3.14159265F;

		bodyModel[272].addBox(-2.5F, 0F, -3F, 3, 5, 1, 0F); // Right seat part
		bodyModel[272].setRotationPoint(22.5F, -4F, 7F);
		bodyModel[272].rotateAngleY = -3.14159265F;

		bodyModel[273].addShapeBox(-2.5F, 0F, -3F, 3, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[273].setRotationPoint(22.5F, -5F, 7F);
		bodyModel[273].rotateAngleY = -3.14159265F;

		bodyModel[274].addBox(-2.5F, 0F, 2F, 3, 5, 1, 0F); // Right seat part
		bodyModel[274].setRotationPoint(22.5F, -4F, 7F);
		bodyModel[274].rotateAngleY = -3.14159265F;

		bodyModel[275].addShapeBox(-2.5F, 0F, 2F, 3, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[275].setRotationPoint(22.5F, -5F, 7F);
		bodyModel[275].rotateAngleY = -3.14159265F;

		bodyModel[276].addBox(0.5F, 0F, -3F, 2, 6, 1, 0F); // Left seat part
		bodyModel[276].setRotationPoint(22.5F, -5F, -7F);
		bodyModel[276].rotateAngleY = -3.14159265F;

		bodyModel[277].addBox(0.5F, 0F, 2F, 2, 6, 1, 0F); // Left seat part
		bodyModel[277].setRotationPoint(22.5F, -5F, -7F);
		bodyModel[277].rotateAngleY = -3.14159265F;

		bodyModel[278].addBox(-1.5F, 0F, -2F, 5, 2, 4, 0F); // Left seat part
		bodyModel[278].setRotationPoint(22.5F, -3F, -7F);
		bodyModel[278].rotateAngleY = -3.14159265F;

		bodyModel[279].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[279].setRotationPoint(22.5F, -8F, -7F);
		bodyModel[279].rotateAngleY = -3.14159265F;

		bodyModel[280].addBox(-2.5F, 0F, 2F, 3, 5, 1, 0F); // Left seat part
		bodyModel[280].setRotationPoint(22.5F, -4F, -7F);
		bodyModel[280].rotateAngleY = -3.14159265F;

		bodyModel[281].addShapeBox(-2.5F, 0F, 2F, 3, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[281].setRotationPoint(22.5F, -5F, -7F);
		bodyModel[281].rotateAngleY = -3.14159265F;

		bodyModel[282].addBox(-2.5F, 0F, -3F, 3, 5, 1, 0F); // Left seat part
		bodyModel[282].setRotationPoint(22.5F, -4F, -7F);
		bodyModel[282].rotateAngleY = -3.14159265F;

		bodyModel[283].addShapeBox(-2.5F, 0F, -3F, 3, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[283].setRotationPoint(22.5F, -5F, -7F);
		bodyModel[283].rotateAngleY = -3.14159265F;

		bodyModel[284].addShapeBox(-2.5F, 0F, -2F, 1, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Right seat part
		bodyModel[284].setRotationPoint(22.5F, -3F, 7F);
		bodyModel[284].rotateAngleY = -3.14159265F;

		bodyModel[285].addShapeBox(-2.5F, 0F, -2F, 1, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Left seat part
		bodyModel[285].setRotationPoint(22.5F, -3F, -7F);
		bodyModel[285].rotateAngleY = -3.14159265F;

		bodyModel[286].addBox(0.5F, 0F, 2F, 2, 6, 1, 0F); // Right seat part
		bodyModel[286].setRotationPoint(33.5F, -5F, 7F);
		bodyModel[286].rotateAngleY = -3.14159265F;

		bodyModel[287].addBox(0.5F, 0F, -3F, 2, 6, 1, 0F); // Right seat part
		bodyModel[287].setRotationPoint(33.5F, -5F, 7F);
		bodyModel[287].rotateAngleY = -3.14159265F;

		bodyModel[288].addBox(-1.5F, 0F, -2F, 5, 2, 4, 0F); // Right seat part
		bodyModel[288].setRotationPoint(33.5F, -3F, 7F);
		bodyModel[288].rotateAngleY = -3.14159265F;

		bodyModel[289].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[289].setRotationPoint(33.5F, -8F, 7F);
		bodyModel[289].rotateAngleY = -3.14159265F;

		bodyModel[290].addBox(-2.5F, 0F, -3F, 3, 5, 1, 0F); // Right seat part
		bodyModel[290].setRotationPoint(33.5F, -4F, 7F);
		bodyModel[290].rotateAngleY = -3.14159265F;

		bodyModel[291].addShapeBox(-2.5F, 0F, -3F, 3, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[291].setRotationPoint(33.5F, -5F, 7F);
		bodyModel[291].rotateAngleY = -3.14159265F;

		bodyModel[292].addBox(-2.5F, 0F, 2F, 3, 5, 1, 0F); // Right seat part
		bodyModel[292].setRotationPoint(33.5F, -4F, 7F);
		bodyModel[292].rotateAngleY = -3.14159265F;

		bodyModel[293].addShapeBox(-2.5F, 0F, 2F, 3, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[293].setRotationPoint(33.5F, -5F, 7F);
		bodyModel[293].rotateAngleY = -3.14159265F;

		bodyModel[294].addBox(0.5F, 0F, -3F, 2, 6, 1, 0F); // Left seat part
		bodyModel[294].setRotationPoint(33.5F, -5F, -7F);
		bodyModel[294].rotateAngleY = -3.14159265F;

		bodyModel[295].addBox(0.5F, 0F, 2F, 2, 6, 1, 0F); // Left seat part
		bodyModel[295].setRotationPoint(33.5F, -5F, -7F);
		bodyModel[295].rotateAngleY = -3.14159265F;

		bodyModel[296].addBox(-1.5F, 0F, -2F, 5, 2, 4, 0F); // Left seat part
		bodyModel[296].setRotationPoint(33.5F, -3F, -7F);
		bodyModel[296].rotateAngleY = -3.14159265F;

		bodyModel[297].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[297].setRotationPoint(33.5F, -8F, -7F);
		bodyModel[297].rotateAngleY = -3.14159265F;

		bodyModel[298].addBox(-2.5F, 0F, 2F, 3, 5, 1, 0F); // Left seat part
		bodyModel[298].setRotationPoint(33.5F, -4F, -7F);
		bodyModel[298].rotateAngleY = -3.14159265F;

		bodyModel[299].addShapeBox(-2.5F, 0F, 2F, 3, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[299].setRotationPoint(33.5F, -5F, -7F);
		bodyModel[299].rotateAngleY = -3.14159265F;

		bodyModel[300].addBox(-2.5F, 0F, -3F, 3, 5, 1, 0F); // Left seat part
		bodyModel[300].setRotationPoint(33.5F, -4F, -7F);
		bodyModel[300].rotateAngleY = -3.14159265F;

		bodyModel[301].addShapeBox(-2.5F, 0F, -3F, 3, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[301].setRotationPoint(33.5F, -5F, -7F);
		bodyModel[301].rotateAngleY = -3.14159265F;

		bodyModel[302].addShapeBox(-2.5F, 0F, -2F, 1, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Right seat part
		bodyModel[302].setRotationPoint(33.5F, -3F, 7F);
		bodyModel[302].rotateAngleY = -3.14159265F;

		bodyModel[303].addShapeBox(-2.5F, 0F, -2F, 1, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Left seat part
		bodyModel[303].setRotationPoint(33.5F, -3F, -7F);
		bodyModel[303].rotateAngleY = -3.14159265F;

		bodyModel[304].addBox(0F, 0F, 0F, 1, 16, 6, 0F); // Box 38
		bodyModel[304].setRotationPoint(45F, -15F, 4F);

		bodyModel[305].addBox(0F, 0F, 0F, 1, 16, 6, 0F); // Box 38
		bodyModel[305].setRotationPoint(46F, -15F, -10F);

		bodyModel[306].addBox(0F, 0F, 0F, 1, 16, 6, 0F); // Box 38
		bodyModel[306].setRotationPoint(51F, -15F, 4F);

		bodyModel[307].addBox(0F, 0F, 0F, 1, 16, 6, 0F); // Box 38
		bodyModel[307].setRotationPoint(51F, -15F, -10F);

		bodyModel[308].addBox(0F, 0F, 0F, 11, 16, 1, 0F); // Box 38
		bodyModel[308].setRotationPoint(45F, -15F, 3F);

		bodyModel[309].addBox(0F, 0F, 0F, 11, 16, 1, 0F); // Box 38
		bodyModel[309].setRotationPoint(41F, -15F, -4F);

		bodyModel[310].addBox(0F, 0F, 0F, 4, 16, 1, 0F); // Box 38
		bodyModel[310].setRotationPoint(52F, -15F, -5F);

		bodyModel[311].addBox(0F, 0F, 0F, 1, 16, 3, 0F); // Box 38
		bodyModel[311].setRotationPoint(41F, -15F, 3F);

		bodyModel[312].addBox(0F, 0F, 0F, 2, 1, 4, 0F); // Box 38
		bodyModel[312].setRotationPoint(41F, -5F, 6F);

		bodyModel[313].addBox(0F, 0F, -1F, 3, 7, 1, 0F); // Conductor's door
		bodyModel[313].setRotationPoint(42F, -6F, 4F);

		bodyModel[314].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 38
		bodyModel[314].setRotationPoint(42F, -15F, 3F);

		bodyModel[315].addBox(-2F, -1F, 0F, 2, 1, 3, 0F); // Conductor's seat
		bodyModel[315].setRotationPoint(45F, -2F, 7F);
		bodyModel[315].rotateAngleZ = 1.57079633F;

		bodyModel[316].addBox(0F, 0F, 0F, 1, 6, 4, 0F); // Box 38
		bodyModel[316].setRotationPoint(41F, -15F, 6F);

		bodyModel[317].addBox(0F, 0F, 0F, 34, 1, 3, 0F); // Box 38
		bodyModel[317].setRotationPoint(6F, -15F, 7F);

		bodyModel[318].addShapeBox(0F, 0F, 0F, 34, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[318].setRotationPoint(6F, -14F, 9F);

		bodyModel[319].addBox(0F, 0F, 0F, 34, 1, 3, 0F); // Box 333
		bodyModel[319].setRotationPoint(6F, -15F, -10F);

		bodyModel[320].addShapeBox(0F, 0F, 0F, 34, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 334
		bodyModel[320].setRotationPoint(6F, -14F, -10F);

		bodyModel[321].addBox(0F, 0F, 0F, 2, 7, 1, 0F); // Box 38
		bodyModel[321].setRotationPoint(46F, -6F, 4F);

		bodyModel[322].addBox(0F, 0F, 0F, 1, 7, 1, 0F); // Box 38
		bodyModel[322].setRotationPoint(46F, -6F, 5F);

		bodyModel[323].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[323].setRotationPoint(47F, -6F, 5F);

		bodyModel[324].addShapeBox(0F, 0F, 0F, 2, 6, 2, 0F,-1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 38
		bodyModel[324].setRotationPoint(49.5F, -5F, 8.5F);

		bodyModel[325].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F); // Box 38
		bodyModel[325].setRotationPoint(49.18F, -2F, 6.78F);
		bodyModel[325].rotateAngleY = 0.78539816F;

		bodyModel[326].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[326].setRotationPoint(49.53F, -1F, 7.84F);
		bodyModel[326].rotateAngleY = 0.78539816F;

		bodyModel[327].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 401
		bodyModel[327].setRotationPoint(46F, -5F, 8F);

		bodyModel[328].addBox(0F, 0F, 0F, 2, 7, 1, 0F); // Box 346
		bodyModel[328].setRotationPoint(47F, -6F, -5F);

		bodyModel[329].addBox(0F, 0F, 0F, 1, 7, 1, 0F); // Box 347
		bodyModel[329].setRotationPoint(47F, -6F, -6F);

		bodyModel[330].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 348
		bodyModel[330].setRotationPoint(48F, -6F, -6F);

		bodyModel[331].addShapeBox(0F, 0F, 0F, 2, 6, 2, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1.5F, 0F, 0F); // Box 349
		bodyModel[331].setRotationPoint(49.5F, -5F, -10.5F);

		bodyModel[332].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F); // Box 350
		bodyModel[332].setRotationPoint(47.77F, -2F, -8.19F);
		bodyModel[332].rotateAngleY = -0.78539816F;

		bodyModel[333].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 351
		bodyModel[333].setRotationPoint(48.83F, -1F, -8.54F);
		bodyModel[333].rotateAngleY = -0.78539816F;

		bodyModel[334].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 352
		bodyModel[334].setRotationPoint(50F, -5F, -6F);

		bodyModel[335].addShapeBox(0F, 0F, 0F, 2, 7, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 349
		bodyModel[335].setRotationPoint(41F, -6F, -10F);

		bodyModel[336].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -2F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 349
		bodyModel[336].setRotationPoint(41F, -6.5F, -6F);

		bodyModel[337].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, -2F); // Box 38
		bodyModel[337].setRotationPoint(42F, -3F, -7F);
		bodyModel[337].rotateAngleY = -0.78539816F;

		bodyModel[338].addShapeBox(0F, 0F, 0F, 4, 3, 4, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, -2F); // Box 38 cull
		bodyModel[338].setRotationPoint(42F, -2F, -7F);
		bodyModel[338].rotateAngleY = -0.78539816F;

		bodyModel[339].addShapeBox(0F, 0F, 0F, 4, 0, 4, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, -2F); // Box 38
		bodyModel[339].setRotationPoint(42F, 0F, -7F);
		bodyModel[339].rotateAngleY = -0.78539816F;

		bodyModel[340].addBox(0F, 0F, 0F, 1, 18, 1, 0F); // Box 38
		bodyModel[340].setRotationPoint(-38F, -17F, -9F);
		bodyModel[340].rotateAngleY = -0.78539816F;

		bodyModel[341].addBox(0F, 0F, 0F, 1, 18, 1, 0F); // Box 38
		bodyModel[341].setRotationPoint(-48.5F, -17F, -9F);
		bodyModel[341].rotateAngleY = -0.78539816F;

		bodyModel[342].addBox(0F, 0F, 0F, 1, 18, 1, 0F); // Box 360
		bodyModel[342].setRotationPoint(-48.5F, -17F, 8F);
		bodyModel[342].rotateAngleY = -0.78539816F;

		bodyModel[343].addBox(0F, 0F, 0F, 1, 20, 1, 0F); // Box 38
		bodyModel[343].setRotationPoint(-38F, -19F, -6F);
		bodyModel[343].rotateAngleY = -0.78539816F;

		bodyModel[344].addBox(0F, 0F, 0F, 1, 20, 1, 0F); // Box 38
		bodyModel[344].setRotationPoint(-48.5F, -19F, -6F);
		bodyModel[344].rotateAngleY = -0.78539816F;

		bodyModel[345].addBox(0F, 0F, 0F, 1, 20, 1, 0F); // Box 363
		bodyModel[345].setRotationPoint(-48.5F, -19F, 5F);
		bodyModel[345].rotateAngleY = -0.78539816F;

		bodyModel[346].addBox(0F, 0F, 0F, 34, 1, 4, 0F); // Box 38
		bodyModel[346].setRotationPoint(6F, -19F, -2F);

		bodyModel[347].addShapeBox(0F, 0F, 0F, 34, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38 glow
		bodyModel[347].setRotationPoint(6F, -18F, -0.5F);

		bodyModel[348].addBox(0.5F, 0F, 2F, 2, 6, 1, 0F); // Right seat part
		bodyModel[348].setRotationPoint(0.5F, -5F, 7F);
		bodyModel[348].rotateAngleY = -3.14159265F;

		bodyModel[349].addBox(0.5F, 0F, -3F, 2, 6, 1, 0F); // Right seat part
		bodyModel[349].setRotationPoint(0.5F, -5F, 7F);
		bodyModel[349].rotateAngleY = -3.14159265F;

		bodyModel[350].addBox(-1.5F, 0F, -2F, 5, 2, 4, 0F); // Right seat part
		bodyModel[350].setRotationPoint(0.5F, -3F, 7F);
		bodyModel[350].rotateAngleY = -3.14159265F;

		bodyModel[351].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[351].setRotationPoint(0.5F, -8F, 7F);
		bodyModel[351].rotateAngleY = -3.14159265F;

		bodyModel[352].addBox(-2.5F, 0F, -3F, 3, 5, 1, 0F); // Right seat part
		bodyModel[352].setRotationPoint(0.5F, -4F, 7F);
		bodyModel[352].rotateAngleY = -3.14159265F;

		bodyModel[353].addShapeBox(-2.5F, 0F, -3F, 3, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[353].setRotationPoint(0.5F, -5F, 7F);
		bodyModel[353].rotateAngleY = -3.14159265F;

		bodyModel[354].addBox(-2.5F, 0F, 2F, 3, 5, 1, 0F); // Right seat part
		bodyModel[354].setRotationPoint(0.5F, -4F, 7F);
		bodyModel[354].rotateAngleY = -3.14159265F;

		bodyModel[355].addShapeBox(-2.5F, 0F, 2F, 3, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[355].setRotationPoint(0.5F, -5F, 7F);
		bodyModel[355].rotateAngleY = -3.14159265F;

		bodyModel[356].addBox(0.5F, 0F, -3F, 2, 6, 1, 0F); // Left seat part
		bodyModel[356].setRotationPoint(0.5F, -5F, -7F);
		bodyModel[356].rotateAngleY = -3.14159265F;

		bodyModel[357].addBox(0.5F, 0F, 2F, 2, 6, 1, 0F); // Left seat part
		bodyModel[357].setRotationPoint(0.5F, -5F, -7F);
		bodyModel[357].rotateAngleY = -3.14159265F;

		bodyModel[358].addBox(-1.5F, 0F, -2F, 5, 2, 4, 0F); // Left seat part
		bodyModel[358].setRotationPoint(0.5F, -3F, -7F);
		bodyModel[358].rotateAngleY = -3.14159265F;

		bodyModel[359].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[359].setRotationPoint(0.5F, -8F, -7F);
		bodyModel[359].rotateAngleY = -3.14159265F;

		bodyModel[360].addBox(-2.5F, 0F, 2F, 3, 5, 1, 0F); // Left seat part
		bodyModel[360].setRotationPoint(0.5F, -4F, -7F);
		bodyModel[360].rotateAngleY = -3.14159265F;

		bodyModel[361].addShapeBox(-2.5F, 0F, 2F, 3, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[361].setRotationPoint(0.5F, -5F, -7F);
		bodyModel[361].rotateAngleY = -3.14159265F;

		bodyModel[362].addBox(-2.5F, 0F, -3F, 3, 5, 1, 0F); // Left seat part
		bodyModel[362].setRotationPoint(0.5F, -4F, -7F);
		bodyModel[362].rotateAngleY = -3.14159265F;

		bodyModel[363].addShapeBox(-2.5F, 0F, -3F, 3, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[363].setRotationPoint(0.5F, -5F, -7F);
		bodyModel[363].rotateAngleY = -3.14159265F;

		bodyModel[364].addShapeBox(-2.5F, 0F, -2F, 1, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Right seat part
		bodyModel[364].setRotationPoint(0.5F, -3F, 7F);
		bodyModel[364].rotateAngleY = -3.14159265F;

		bodyModel[365].addShapeBox(-2.5F, 0F, -2F, 1, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Left seat part
		bodyModel[365].setRotationPoint(0.5F, -3F, -7F);
		bodyModel[365].rotateAngleY = -3.14159265F;

		bodyModel[366].addBox(0F, 0F, 0F, 11, 1, 3, 0F); // Box 38
		bodyModel[366].setRotationPoint(-5F, -15F, 7F);

		bodyModel[367].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[367].setRotationPoint(-5F, -14F, 9F);

		bodyModel[368].addBox(0F, 0F, 0F, 11, 1, 3, 0F); // Box 333
		bodyModel[368].setRotationPoint(-5F, -15F, -10F);

		bodyModel[369].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 334
		bodyModel[369].setRotationPoint(-5F, -14F, -10F);

		bodyModel[370].addBox(0F, 0F, 0F, 11, 1, 4, 0F); // Box 38
		bodyModel[370].setRotationPoint(-5F, -19F, -2F);

		bodyModel[371].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38 glow
		bodyModel[371].setRotationPoint(-5F, -18F, -0.5F);

		bodyModel[372].addBox(0F, 0F, 0F, 1, 16, 7, 0F); // Box 38
		bodyModel[372].setRotationPoint(-6F, -15F, 3F);

		bodyModel[373].addBox(0F, 0F, 0F, 1, 16, 7, 0F); // Box 38
		bodyModel[373].setRotationPoint(-6F, -15F, -10F);

		bodyModel[374].addBox(0F, 0F, 0F, 1, 3, 14, 0F); // Box 128
		bodyModel[374].setRotationPoint(-6F, -18F, -7F);

		bodyModel[375].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Box 128
		bodyModel[375].setRotationPoint(-6F, -19F, -3F);

		bodyModel[376].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[376].setRotationPoint(-6F, -18F, -10F);

		bodyModel[377].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[377].setRotationPoint(-6F, -19F, -7F);

		bodyModel[378].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 176
		bodyModel[378].setRotationPoint(-6F, -18F, 7F);

		bodyModel[379].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 177
		bodyModel[379].setRotationPoint(-6F, -19F, 3F);

		bodyModel[380].addBox(0F, 0F, -6F, 1, 16, 6, 0F); // C&O bulkhead door
		bodyModel[380].setRotationPoint(-6F, -15F, 3F);

		bodyModel[381].addBox(0F, 0F, 0F, 1, 16, 7, 0F); // Box 38
		bodyModel[381].setRotationPoint(-11F, -15F, 3F);

		bodyModel[382].addBox(0F, 0F, 0F, 4, 20, 1, 0F); // Box 38
		bodyModel[382].setRotationPoint(-10F, -19F, 3F);

		bodyModel[383].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 176
		bodyModel[383].setRotationPoint(-11F, -18F, 7F);

		bodyModel[384].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 177
		bodyModel[384].setRotationPoint(-11F, -19F, 3F);

		bodyModel[385].addBox(0F, 0F, 0F, 1, 3, 4, 0F); // Box 38
		bodyModel[385].setRotationPoint(-11F, -18F, 3F);

		bodyModel[386].addBox(0F, 0F, 0F, 10, 16, 6, 0F); // Box 405
		bodyModel[386].setRotationPoint(-16F, -15F, -10F);

		bodyModel[387].addBox(0F, 0F, 0F, 10, 3, 3, 0F); // Box 406
		bodyModel[387].setRotationPoint(-16F, -18F, -7F);

		bodyModel[388].addShapeBox(0F, 0F, 0F, 10, 3, 3, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 407
		bodyModel[388].setRotationPoint(-16F, -18F, -10F);

		bodyModel[389].addShapeBox(0F, 0F, 0F, 10, 1, 3, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 408
		bodyModel[389].setRotationPoint(-16F, -19F, -7F);

		bodyModel[390].addBox(0F, 0F, 0F, 20, 1, 6, 0F); // Box 405
		bodyModel[390].setRotationPoint(-36F, -11F, -10F);

		bodyModel[391].addBox(0F, 0F, 0F, 20, 1, 6, 0F); // Box 405
		bodyModel[391].setRotationPoint(-36F, -5F, -10F);

		bodyModel[392].addBox(0F, 0F, 0F, 1, 12, 1, 0F); // Box 38
		bodyModel[392].setRotationPoint(-26F, -11F, -4F);

		bodyModel[393].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F,-0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, -0.01F, 0F, -0.01F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, -0.01F, 0F, -0.01F); // Box 38
		bodyModel[393].setRotationPoint(-36F, -10F, -5F);

		bodyModel[394].addBox(0F, 0F, 0F, 21, 1, 6, 0F); // Box 413
		bodyModel[394].setRotationPoint(-32F, -11F, 4F);

		bodyModel[395].addBox(0F, 0F, 0F, 21, 1, 6, 0F); // Box 414
		bodyModel[395].setRotationPoint(-32F, -5F, 4F);

		bodyModel[396].addBox(0F, 0F, 0F, 1, 12, 1, 0F); // Box 415
		bodyModel[396].setRotationPoint(-21.5F, -11F, 3F);

		bodyModel[397].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F,-0.01F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, -0.01F, 0F, 0F); // Box 416
		bodyModel[397].setRotationPoint(-32F, -10F, 4F);

		bodyModel[398].addBox(0F, 0F, 0F, 5, 14, 5, 0F); // Box 414
		bodyModel[398].setRotationPoint(-37F, -13F, 5F);

		bodyModel[399].addShapeBox(0F, 0F, 0F, 5, 2, 5, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 414
		bodyModel[399].setRotationPoint(-37F, -15F, 5F);

		bodyModel[400].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38 glow
		bodyModel[400].setRotationPoint(-12F, -19F, -1F);

		bodyModel[401].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38 glow
		bodyModel[401].setRotationPoint(-23F, -19F, -1F);

		bodyModel[402].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38 glow
		bodyModel[402].setRotationPoint(-34F, -19F, -1F);

		bodyModel[403].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38 glow
		bodyModel[403].setRotationPoint(-45F, -19F, -1F);

		bodyModel[404].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38 glow
		bodyModel[404].setRotationPoint(-56F, -19F, -1F);

		bodyModel[405].addShapeBox(0F, 0F, 0F, 4, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[405].setRotationPoint(-40.5F, -19F, -2F);

		bodyModel[406].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 38
		bodyModel[406].setRotationPoint(-42.5F, -19F, -7F);

		bodyModel[407].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.74F, 0.48F, 0F, -0.74F, 0.48F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 38
		bodyModel[407].setRotationPoint(-42.5F, -16F, -7F);

		bodyModel[408].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38 glow
		bodyModel[408].setRotationPoint(-43F, -14.86F, -7.96F);
		bodyModel[408].rotateAngleX = -0.2443461F;

		bodyModel[409].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 429
		bodyModel[409].setRotationPoint(-42.5F, -19F, 6F);

		bodyModel[410].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.74F, 0.48F, 0F, -0.74F, 0.48F); // Box 430
		bodyModel[410].setRotationPoint(-42.5F, -16F, 6F);

		bodyModel[411].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38 glow
		bodyModel[411].setRotationPoint(-43F, -14.38F, 6.02F);
		bodyModel[411].rotateAngleX = 0.2443461F;

		bodyModel[412].addBox(0F, 0F, 0F, 3, 5, 2, 0F); // Box 414
		bodyModel[412].setRotationPoint(-57F, -13F, 8F);

		bodyModel[413].addBox(0F, 0F, 0F, 3, 2, 1, 0F); // Box 414
		bodyModel[413].setRotationPoint(-57F, -8F, 9F);

		bodyModel[414].addBox(0F, 0F, 0F, 3, 1, 2, 0F); // Box 414
		bodyModel[414].setRotationPoint(-57F, -6F, 8F);

		bodyModel[415].addBox(0F, 0F, 0F, 3, 3, 1, 0F); // Box 414
		bodyModel[415].setRotationPoint(-60F, -10F, 9F);

		bodyModel[416].addBox(0F, 0F, -2F, 3, 0, 2, 0F); // Folding table
		bodyModel[416].setRotationPoint(-60F, -7F, 9F);

		bodyModel[417].addBox(0F, 0F, 0F, 1, 16, 7, 0F); // Box 38
		bodyModel[417].setRotationPoint(5F, -15F, 3F);

		bodyModel[418].addBox(0F, 0F, 0F, 1, 16, 7, 0F); // Box 38
		bodyModel[418].setRotationPoint(5F, -15F, -10F);

		bodyModel[419].addBox(0F, 0F, 0F, 1, 3, 14, 0F); // Box 128
		bodyModel[419].setRotationPoint(5F, -18F, -7F);

		bodyModel[420].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 176
		bodyModel[420].setRotationPoint(5F, -18F, 7F);

		bodyModel[421].addBox(0F, 0F, -6F, 1, 16, 6, 0F); // D&RGW bulkhead door
		bodyModel[421].setRotationPoint(5F, -15F, 3F);

		bodyModel[422].addBox(0F, 0F, 0F, 1, 16, 16, 0F); // Box 38
		bodyModel[422].setRotationPoint(-26F, -15F, -6F);

		bodyModel[423].addBox(0F, 0F, 0F, 1, 3, 14, 0F); // Box 128
		bodyModel[423].setRotationPoint(-26F, -18F, -7F);

		bodyModel[424].addBox(0F, 0F, 0F, 32, 1, 6, 0F); // Box 128
		bodyModel[424].setRotationPoint(-26F, -19F, -3F);

		bodyModel[425].addShapeBox(0F, 0F, 0F, 27, 3, 3, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[425].setRotationPoint(-26F, -18F, -10F);

		bodyModel[426].addShapeBox(0F, 0F, 0F, 32, 1, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[426].setRotationPoint(-26F, -19F, -7F);

		bodyModel[427].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 176
		bodyModel[427].setRotationPoint(-26F, -18F, 7F);

		bodyModel[428].addShapeBox(0F, 0F, 0F, 32, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 177
		bodyModel[428].setRotationPoint(-26F, -19F, 3F);

		bodyModel[429].addBox(0F, 0F, 0F, 1, 16, 4, 0F); // Front dorm door
		bodyModel[429].setRotationPoint(-26F, -15F, -10F);

		bodyModel[430].addBox(0F, 0F, 0F, 32, 1, 6, 0F); // Box 128
		bodyModel[430].setRotationPoint(-58F, -19F, -3F);

		bodyModel[431].addShapeBox(0F, 0F, 0F, 32, 1, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[431].setRotationPoint(-58F, -19F, -7F);

		bodyModel[432].addShapeBox(0F, 0F, 0F, 32, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 177
		bodyModel[432].setRotationPoint(-58F, -19F, 3F);

		bodyModel[433].addBox(0F, 0F, 0F, 1, 16, 15, 0F); // Box 38
		bodyModel[433].setRotationPoint(-18F, -15F, -5F);

		bodyModel[434].addBox(0F, 0F, 0F, 1, 16, 15, 0F); // Box 38
		bodyModel[434].setRotationPoint(-5F, -15F, -5F);

		bodyModel[435].addBox(0F, 0F, 0F, 9, 16, 1, 0F); // Box 38
		bodyModel[435].setRotationPoint(-4F, -15F, 3F);

		bodyModel[436].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 128
		bodyModel[436].setRotationPoint(-5F, -17F, 4F);

		bodyModel[437].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 176
		bodyModel[437].setRotationPoint(-5F, -17F, 8F);

		bodyModel[438].addBox(0F, 0F, 0F, 1, 1, 12, 0F); // Box 128
		bodyModel[438].setRotationPoint(-18F, -18F, -5F);

		bodyModel[439].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 176
		bodyModel[439].setRotationPoint(-18F, -18F, 7F);

		bodyModel[440].addBox(0F, 0F, 0F, 1, 16, 7, 0F); // Box 38
		bodyModel[440].setRotationPoint(0F, -15F, -10F);

		bodyModel[441].addBox(0F, 0F, 0F, 4, 16, 1, 0F); // Box 38
		bodyModel[441].setRotationPoint(1F, -15F, -4F);

		bodyModel[442].addBox(0F, 0F, 0F, 1, 3, 2, 0F); // Box 128
		bodyModel[442].setRotationPoint(0F, -18F, -7F);

		bodyModel[443].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[443].setRotationPoint(5F, -18F, -10F);

		bodyModel[444].addBox(0F, 0F, 0F, 9, 16, 1, 0F); // Box 38
		bodyModel[444].setRotationPoint(-22F, -15F, -6F);

		bodyModel[445].addBox(-3F, 0F, -1F, 3, 16, 1, 0F); // Steward door
		bodyModel[445].setRotationPoint(-22F, -15F, -5F);

		bodyModel[446].addBox(0F, 0F, 0F, 5, 16, 1, 0F); // Box 38
		bodyModel[446].setRotationPoint(-9F, -15F, -6F);

		bodyModel[447].addBox(-4F, 0F, -1F, 4, 16, 1, 0F); // Dorm door
		bodyModel[447].setRotationPoint(-9F, -15F, -5F);

		bodyModel[448].addBox(0F, 0F, 0F, 25, 3, 2, 0F); // Box 128
		bodyModel[448].setRotationPoint(-25F, -18F, -7F);

		bodyModel[449].addBox(0F, 0F, 0F, 6, 3, 9, 0F); // Box 128
		bodyModel[449].setRotationPoint(-5F, -18F, -5F);

		bodyModel[450].addBox(0F, 0F, 0F, 4, 3, 8, 0F); // Box 128
		bodyModel[450].setRotationPoint(1F, -18F, -4F);

		bodyModel[451].addBox(0F, 0F, 0F, 1, 2, 13, 0F); // Box 128
		bodyModel[451].setRotationPoint(-18F, -17F, -5F);

		bodyModel[452].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 176
		bodyModel[452].setRotationPoint(-18F, -17F, 8F);

		bodyModel[453].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 128
		bodyModel[453].setRotationPoint(-5F, -18F, 4F);

		bodyModel[454].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 176
		bodyModel[454].setRotationPoint(-5F, -18F, 7F);

		bodyModel[455].addBox(0F, 0F, 0F, 4, 19, 3, 0F); // Box 38
		bodyModel[455].setRotationPoint(-9F, -18F, -5F);

		bodyModel[456].addBox(0F, 0F, 0F, 4, 19, 3, 0F); // Box 38
		bodyModel[456].setRotationPoint(-17F, -18F, -5F);

		bodyModel[457].addBox(0F, 0F, -1F, 4, 3, 1, 0F); // Box 38
		bodyModel[457].setRotationPoint(-13F, -3F, 10F);

		bodyModel[458].addBox(0F, 0F, 0F, 4, 2, 12, 0F); // Box 38
		bodyModel[458].setRotationPoint(-9F, -3F, -2F);

		bodyModel[459].addBox(0F, 0F, 0F, 4, 2, 12, 0F); // Box 38
		bodyModel[459].setRotationPoint(-17F, -3F, -2F);

		bodyModel[460].addBox(0F, 0F, 0F, 4, 19, 3, 0F); // Box 38
		bodyModel[460].setRotationPoint(-22F, -18F, -5F);

		bodyModel[461].addBox(0F, 0F, 0F, 4, 3, 12, 0F); // Box 38
		bodyModel[461].setRotationPoint(-22F, -4F, -2F);

		bodyModel[462].addBox(0F, 0F, 0F, 2, 6, 3, 0F); // Box 38
		bodyModel[462].setRotationPoint(-25F, -5F, 7F);

		bodyModel[463].addBox(0F, 0F, 0F, 1, 3, 3, 0F); // Box 38
		bodyModel[463].setRotationPoint(-25F, -3F, 2F);

		bodyModel[464].addBox(0F, 0F, 0F, 4, 2, 12, 0F); // Box 38
		bodyModel[464].setRotationPoint(-9F, -15F, -2F);

		bodyModel[465].addBox(0F, 0F, 0F, 4, 2, 12, 0F); // Box 38
		bodyModel[465].setRotationPoint(-9F, -9F, -2F);

		bodyModel[466].addBox(0F, 0F, 0F, 0, 16, 3, 0F); // Box 38
		bodyModel[466].setRotationPoint(-9.01F, -15F, -2F);

		bodyModel[467].addBox(0F, 0F, 0F, 0, 8, 5, 0F); // Box 38
		bodyModel[467].setRotationPoint(-9.01F, -15F, 5F);

		bodyModel[468].addBox(0F, 0F, 0F, 0, 3, 3, 0F); // Box 38
		bodyModel[468].setRotationPoint(-9.01F, -18F, 5F);

		bodyModel[469].addBox(0F, 0F, 0F, 0, 2, 2, 0F); // Box 38
		bodyModel[469].setRotationPoint(-9.01F, -17F, 8F);

		bodyModel[470].addBox(0F, 0F, 0F, 4, 2, 12, 0F); // Box 38
		bodyModel[470].setRotationPoint(-17F, -15F, -2F);

		bodyModel[471].addBox(0F, 0F, 0F, 4, 2, 12, 0F); // Box 38
		bodyModel[471].setRotationPoint(-17F, -9F, -2F);

		bodyModel[472].addBox(0F, 0F, 0F, 0, 16, 3, 0F); // Box 38
		bodyModel[472].setRotationPoint(-12.99F, -15F, -2F);

		bodyModel[473].addBox(0F, 0F, 0F, 0, 8, 5, 0F); // Box 38
		bodyModel[473].setRotationPoint(-12.99F, -15F, 5F);

		bodyModel[474].addBox(0F, 0F, 0F, 0, 3, 3, 0F); // Box 38
		bodyModel[474].setRotationPoint(-12.99F, -18F, 5F);

		bodyModel[475].addBox(0F, 0F, 0F, 0, 2, 2, 0F); // Box 38
		bodyModel[475].setRotationPoint(-12.99F, -17F, 8F);

		bodyModel[476].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 128 glow
		bodyModel[476].setRotationPoint(-22F, -18F, -2F);

		bodyModel[477].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 128 glow
		bodyModel[477].setRotationPoint(-11.5F, -18F, -4F);

		bodyModel[478].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 128
		bodyModel[478].setRotationPoint(0F, -18F, 4F);

		bodyModel[479].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 176
		bodyModel[479].setRotationPoint(0F, -18F, 7F);

		bodyModel[480].addBox(0F, 0F, 0F, 6, 3, 14, 0F); // Box 128
		bodyModel[480].setRotationPoint(56F, -18F, -7F);

		bodyModel[481].addBox(0F, 0F, 0F, 6, 1, 6, 0F); // Box 128
		bodyModel[481].setRotationPoint(56F, -19F, -3F);

		bodyModel[482].addShapeBox(0F, 0F, 0F, 6, 3, 3, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[482].setRotationPoint(56F, -18F, -10F);

		bodyModel[483].addShapeBox(0F, 0F, 0F, 6, 1, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[483].setRotationPoint(56F, -19F, -7F);

		bodyModel[484].addShapeBox(0F, 0F, 0F, 6, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 176
		bodyModel[484].setRotationPoint(56F, -18F, 7F);

		bodyModel[485].addShapeBox(0F, 0F, 0F, 6, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 177
		bodyModel[485].setRotationPoint(56F, -19F, 3F);

		bodyModel[486].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 349
		bodyModel[486].setRotationPoint(41F, -15F, -10F);

		bodyModel[487].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38 glow
		bodyModel[487].setRotationPoint(43F, -15F, 7F);

		bodyModel[488].addShapeBox(0F, 0F, 0F, 0, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 2
		bodyModel[488].setRotationPoint(-39.99F, 3F, 10F);

		bodyModel[489].addShapeBox(0F, 0F, 0F, 0, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 2
		bodyModel[489].setRotationPoint(-38.01F, 3F, 10F);

		bodyModel[490].addShapeBox(0F, 0F, 0F, 2, 0, 1, 0F,-0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F); // Box 2
		bodyModel[490].setRotationPoint(-39.99F, 4.5F, 10F);

		bodyModel[491].addShapeBox(0F, 0F, 0F, 2, 0, 1, 0F,-0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F); // Box 2
		bodyModel[491].setRotationPoint(-39.99F, 6.5F, 10F);

		bodyModel[492].addShapeBox(0F, 0F, 0F, 0, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 154
		bodyModel[492].setRotationPoint(-39.99F, 3F, -11F);

		bodyModel[493].addShapeBox(0F, 0F, 0F, 0, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 155
		bodyModel[493].setRotationPoint(-38.01F, 3F, -11F);

		bodyModel[494].addShapeBox(0F, 0F, 0F, 2, 0, 1, 0F,-0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F); // Box 156
		bodyModel[494].setRotationPoint(-39.99F, 4.5F, -11F);

		bodyModel[495].addShapeBox(0F, 0F, 0F, 2, 0, 1, 0F,-0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F); // Box 157
		bodyModel[495].setRotationPoint(-39.99F, 6.5F, -11F);
	}
	ModelPS_Truck bogie1 = new ModelPS_Truck();
	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		for(int i = 0; i < 496; i++)
		{
			bodyModel[i].render(f5);
		}
		if(entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor()==14){
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/41-N-11_truck_silver.png"));
		} else {
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