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
import fexcraft.tmt.slim.ModelConverter;
import fexcraft.tmt.slim.ModelRendererTurbo;
import fexcraft.tmt.slim.Tessellator;
import train.common.api.AbstractTrains;
import train.common.library.Info;

public class ModelACFGN60SeatCoach extends ModelConverter//Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelACFGN60SeatCoach() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[563];

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
		bodyModel[3] = new ModelRendererTurbo(this, 272, 148, textureX, textureY); // Box 2
		bodyModel[4] = new ModelRendererTurbo(this, 272, 151, textureX, textureY); // Box 2
		bodyModel[5] = new ModelRendererTurbo(this, 263, 148, textureX, textureY); // Box 2
		bodyModel[6] = new ModelRendererTurbo(this, 260, 151, textureX, textureY); // Box 2
		bodyModel[7] = new ModelRendererTurbo(this, 253, 148, textureX, textureY); // Box 2
		bodyModel[8] = new ModelRendererTurbo(this, 253, 151, textureX, textureY); // Box 2
		bodyModel[9] = new ModelRendererTurbo(this, 74, 151, textureX, textureY, "cull"); // Box 2 cull
		bodyModel[10] = new ModelRendererTurbo(this, 74, 148, textureX, textureY, "cull"); // Box 2 cull
		bodyModel[11] = new ModelRendererTurbo(this, 93, 148, textureX, textureY); // Box 2
		bodyModel[12] = new ModelRendererTurbo(this, 91, 151, textureX, textureY); // Box 2
		bodyModel[13] = new ModelRendererTurbo(this, 246, 148, textureX, textureY); // Box 2
		bodyModel[14] = new ModelRendererTurbo(this, 244, 151, textureX, textureY); // Box 2
		bodyModel[15] = new ModelRendererTurbo(this, 100, 148, textureX, textureY); // Box 2
		bodyModel[16] = new ModelRendererTurbo(this, 100, 151, textureX, textureY); // Box 2
		bodyModel[17] = new ModelRendererTurbo(this, 105, 148, textureX, textureY); // Box 2
		bodyModel[18] = new ModelRendererTurbo(this, 107, 151, textureX, textureY); // Box 2
		bodyModel[19] = new ModelRendererTurbo(this, 272, 138, textureX, textureY); // Box 24
		bodyModel[20] = new ModelRendererTurbo(this, 272, 141, textureX, textureY); // Box 25
		bodyModel[21] = new ModelRendererTurbo(this, 263, 138, textureX, textureY); // Box 26
		bodyModel[22] = new ModelRendererTurbo(this, 260, 141, textureX, textureY); // Box 27
		bodyModel[23] = new ModelRendererTurbo(this, 253, 138, textureX, textureY); // Box 28
		bodyModel[24] = new ModelRendererTurbo(this, 253, 141, textureX, textureY); // Box 29
		bodyModel[25] = new ModelRendererTurbo(this, 74, 141, textureX, textureY, "cull"); // Box 30 cull
		bodyModel[26] = new ModelRendererTurbo(this, 74, 138, textureX, textureY, "cull"); // Box 31 cull
		bodyModel[27] = new ModelRendererTurbo(this, 93, 138, textureX, textureY); // Box 32
		bodyModel[28] = new ModelRendererTurbo(this, 91, 141, textureX, textureY); // Box 33
		bodyModel[29] = new ModelRendererTurbo(this, 246, 138, textureX, textureY); // Box 34
		bodyModel[30] = new ModelRendererTurbo(this, 244, 141, textureX, textureY); // Box 35
		bodyModel[31] = new ModelRendererTurbo(this, 100, 138, textureX, textureY); // Box 36
		bodyModel[32] = new ModelRendererTurbo(this, 100, 141, textureX, textureY); // Box 37
		bodyModel[33] = new ModelRendererTurbo(this, 105, 138, textureX, textureY); // Box 38
		bodyModel[34] = new ModelRendererTurbo(this, 107, 141, textureX, textureY); // Box 39
		bodyModel[35] = new ModelRendererTurbo(this, 258, 148, textureX, textureY); // Box 2
		bodyModel[36] = new ModelRendererTurbo(this, 258, 138, textureX, textureY); // Box 41
		bodyModel[37] = new ModelRendererTurbo(this, 347, 117, textureX, textureY); // Box 2
		bodyModel[38] = new ModelRendererTurbo(this, 299, 132, textureX, textureY); // Box 2
		bodyModel[39] = new ModelRendererTurbo(this, 58, 123, textureX, textureY); // Box 2
		bodyModel[40] = new ModelRendererTurbo(this, 30, 122, textureX, textureY); // Box 2
		bodyModel[41] = new ModelRendererTurbo(this, 74, 132, textureX, textureY); // Box 2
		bodyModel[42] = new ModelRendererTurbo(this, 311, 121, textureX, textureY); // Box 2
		bodyModel[43] = new ModelRendererTurbo(this, 64, 119, textureX, textureY); // Box 2
		bodyModel[44] = new ModelRendererTurbo(this, 158, 157, textureX, textureY); // Box 2
		bodyModel[45] = new ModelRendererTurbo(this, 159, 175, textureX, textureY); // Box 52
		bodyModel[46] = new ModelRendererTurbo(this, 74, 165, textureX, textureY); // Box 2
		bodyModel[47] = new ModelRendererTurbo(this, 74, 173, textureX, textureY); // Box 2
		bodyModel[48] = new ModelRendererTurbo(this, 77, 160, textureX, textureY); // Box 41
		bodyModel[49] = new ModelRendererTurbo(this, 74, 160, textureX, textureY); // Box 41
		bodyModel[50] = new ModelRendererTurbo(this, 96, 160, textureX, textureY); // Box 41
		bodyModel[51] = new ModelRendererTurbo(this, 208, 159, textureX, textureY); // Box 41
		bodyModel[52] = new ModelRendererTurbo(this, 208, 157, textureX, textureY); // Box 41
		bodyModel[53] = new ModelRendererTurbo(this, 228, 157, textureX, textureY); // Box 41
		bodyModel[54] = new ModelRendererTurbo(this, 247, 155, textureX, textureY); // Box 26
		bodyModel[55] = new ModelRendererTurbo(this, 248, 158, textureX, textureY); // Box 26
		bodyModel[56] = new ModelRendererTurbo(this, 256, 155, textureX, textureY); // Box 26
		bodyModel[57] = new ModelRendererTurbo(this, 257, 158, textureX, textureY); // Box 26
		bodyModel[58] = new ModelRendererTurbo(this, 259, 154, textureX, textureY); // Box 24
		bodyModel[59] = new ModelRendererTurbo(this, 250, 154, textureX, textureY); // Box 24
		bodyModel[60] = new ModelRendererTurbo(this, 331, 62, textureX, textureY); // Left step part
		bodyModel[61] = new ModelRendererTurbo(this, 329, 65, textureX, textureY); // Left step part
		bodyModel[62] = new ModelRendererTurbo(this, 331, 68, textureX, textureY); // Left step part
		bodyModel[63] = new ModelRendererTurbo(this, 329, 71, textureX, textureY); // Left step part
		bodyModel[64] = new ModelRendererTurbo(this, 331, 77, textureX, textureY); // Left step part
		bodyModel[65] = new ModelRendererTurbo(this, 322, 79, textureX, textureY); // Left step part
		bodyModel[66] = new ModelRendererTurbo(this, 322, 77, textureX, textureY); // Left step part
		bodyModel[67] = new ModelRendererTurbo(this, 323, 74, textureX, textureY); // Left step part
		bodyModel[68] = new ModelRendererTurbo(this, 340, 79, textureX, textureY); // Left step part
		bodyModel[69] = new ModelRendererTurbo(this, 340, 77, textureX, textureY); // Left step part
		bodyModel[70] = new ModelRendererTurbo(this, 341, 74, textureX, textureY); // Left step part
		bodyModel[71] = new ModelRendererTurbo(this, 331, 74, textureX, textureY); // Left step part
		bodyModel[72] = new ModelRendererTurbo(this, 327, 81, textureX, textureY); // Left step part
		bodyModel[73] = new ModelRendererTurbo(this, 247, 164, textureX, textureY); // Box 140
		bodyModel[74] = new ModelRendererTurbo(this, 248, 167, textureX, textureY); // Box 141
		bodyModel[75] = new ModelRendererTurbo(this, 256, 164, textureX, textureY); // Box 142
		bodyModel[76] = new ModelRendererTurbo(this, 257, 167, textureX, textureY); // Box 143
		bodyModel[77] = new ModelRendererTurbo(this, 259, 163, textureX, textureY); // Box 144
		bodyModel[78] = new ModelRendererTurbo(this, 250, 163, textureX, textureY); // Box 145
		bodyModel[79] = new ModelRendererTurbo(this, 331, 87, textureX, textureY); // Right step part
		bodyModel[80] = new ModelRendererTurbo(this, 329, 90, textureX, textureY); // Right step part
		bodyModel[81] = new ModelRendererTurbo(this, 331, 93, textureX, textureY); // Right step part
		bodyModel[82] = new ModelRendererTurbo(this, 329, 96, textureX, textureY); // Right step part
		bodyModel[83] = new ModelRendererTurbo(this, 331, 102, textureX, textureY); // Right step part
		bodyModel[84] = new ModelRendererTurbo(this, 322, 100, textureX, textureY); // Right step part
		bodyModel[85] = new ModelRendererTurbo(this, 322, 98, textureX, textureY); // Right step part
		bodyModel[86] = new ModelRendererTurbo(this, 323, 95, textureX, textureY); // Right step part
		bodyModel[87] = new ModelRendererTurbo(this, 340, 100, textureX, textureY); // Right step part
		bodyModel[88] = new ModelRendererTurbo(this, 340, 98, textureX, textureY); // Right step part
		bodyModel[89] = new ModelRendererTurbo(this, 341, 95, textureX, textureY); // Right step part
		bodyModel[90] = new ModelRendererTurbo(this, 331, 99, textureX, textureY); // Right step part
		bodyModel[91] = new ModelRendererTurbo(this, 327, 106, textureX, textureY); // Right step part
		bodyModel[92] = new ModelRendererTurbo(this, 314, 108, textureX, textureY); // Left trapdoor
		bodyModel[93] = new ModelRendererTurbo(this, 329, 118, textureX, textureY); // Right trapdoor
		bodyModel[94] = new ModelRendererTurbo(this, 311, 69, textureX, textureY); // Left side door
		bodyModel[95] = new ModelRendererTurbo(this, 72, 68, textureX, textureY); // Box 38
		bodyModel[96] = new ModelRendererTurbo(this, 72, 87, textureX, textureY); // Box 128
		bodyModel[97] = new ModelRendererTurbo(this, 327, 20, textureX, textureY); // Box 128
		bodyModel[98] = new ModelRendererTurbo(this, 361, 20, textureX, textureY); // Box 128
		bodyModel[99] = new ModelRendererTurbo(this, 380, 19, textureX, textureY); // Box 128
		bodyModel[100] = new ModelRendererTurbo(this, 415, 20, textureX, textureY); // Box 128
		bodyModel[101] = new ModelRendererTurbo(this, 311, 90, textureX, textureY); // Right side door
		bodyModel[102] = new ModelRendererTurbo(this, 35, 19, textureX, textureY); // Box 128
		bodyModel[103] = new ModelRendererTurbo(this, 1, 12, textureX, textureY); // Box 128
		bodyModel[104] = new ModelRendererTurbo(this, 337, 19, textureX, textureY); // Box 128
		bodyModel[105] = new ModelRendererTurbo(this, 391, 19, textureX, textureY); // Box 128
		bodyModel[106] = new ModelRendererTurbo(this, 27, 18, textureX, textureY); // Box 128
		bodyModel[107] = new ModelRendererTurbo(this, 311, 66, textureX, textureY); // Box 128
		bodyModel[108] = new ModelRendererTurbo(this, 311, 87, textureX, textureY); // Box 128
		bodyModel[109] = new ModelRendererTurbo(this, 346, 21, textureX, textureY); // Vestibule door
		bodyModel[110] = new ModelRendererTurbo(this, 18, 20, textureX, textureY); // Front end door
		bodyModel[111] = new ModelRendererTurbo(this, 434, 23, textureX, textureY); // Box 128
		bodyModel[112] = new ModelRendererTurbo(this, 434, 35, textureX, textureY); // Box 128
		bodyModel[113] = new ModelRendererTurbo(this, 410, 2, textureX, textureY); // Box 128
		bodyModel[114] = new ModelRendererTurbo(this, 431, 2, textureX, textureY); // Box 128
		bodyModel[115] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 128
		bodyModel[116] = new ModelRendererTurbo(this, 424, 1, textureX, textureY); // Box 128
		bodyModel[117] = new ModelRendererTurbo(this, 445, 35, textureX, textureY); // Box 128
		bodyModel[118] = new ModelRendererTurbo(this, 445, 23, textureX, textureY); // Box 128
		bodyModel[119] = new ModelRendererTurbo(this, 445, 17, textureX, textureY); // Box 128
		bodyModel[120] = new ModelRendererTurbo(this, 457, 17, textureX, textureY); // Box 153
		bodyModel[121] = new ModelRendererTurbo(this, 20, 43, textureX, textureY); // Box 128
		bodyModel[122] = new ModelRendererTurbo(this, 44, 35, textureX, textureY); // Box 128
		bodyModel[123] = new ModelRendererTurbo(this, 65, 2, textureX, textureY); // Box 128
		bodyModel[124] = new ModelRendererTurbo(this, 44, 2, textureX, textureY); // Box 128
		bodyModel[125] = new ModelRendererTurbo(this, 58, 1, textureX, textureY); // Box 128
		bodyModel[126] = new ModelRendererTurbo(this, 51, 1, textureX, textureY); // Box 128
		bodyModel[127] = new ModelRendererTurbo(this, 31, 43, textureX, textureY); // Box 128
		bodyModel[128] = new ModelRendererTurbo(this, 4, 39, textureX, textureY); // Box 128
		bodyModel[129] = new ModelRendererTurbo(this, 17, 43, textureX, textureY); // Box 128
		bodyModel[130] = new ModelRendererTurbo(this, 3, 43, textureX, textureY); // Box 153
		bodyModel[131] = new ModelRendererTurbo(this, 72, 40, textureX, textureY); // Box 128
		bodyModel[132] = new ModelRendererTurbo(this, 72, 49, textureX, textureY); // Box 128
		bodyModel[133] = new ModelRendererTurbo(this, 72, 55, textureX, textureY); // Box 128
		bodyModel[134] = new ModelRendererTurbo(this, 72, 34, textureX, textureY); // Box 168
		bodyModel[135] = new ModelRendererTurbo(this, 72, 29, textureX, textureY); // Box 169
		bodyModel[136] = new ModelRendererTurbo(this, 13, 1, textureX, textureY); // Box 128
		bodyModel[137] = new ModelRendererTurbo(this, 30, 8, textureX, textureY); // Box 128
		bodyModel[138] = new ModelRendererTurbo(this, 72, 218, textureX, textureY); // Box 128
		bodyModel[139] = new ModelRendererTurbo(this, 18, 8, textureX, textureY); // Box 176
		bodyModel[140] = new ModelRendererTurbo(this, 72, 196, textureX, textureY); // Box 177
		bodyModel[141] = new ModelRendererTurbo(this, 72, 60, textureX, textureY); // Box 128
		bodyModel[142] = new ModelRendererTurbo(this, 72, 25, textureX, textureY); // Box 170
		bodyModel[143] = new ModelRendererTurbo(this, 399, 29, textureX, textureY); // Rear gate closed
		bodyModel[144] = new ModelRendererTurbo(this, 412, 34, textureX, textureY); // Rear gate open
		bodyModel[145] = new ModelRendererTurbo(this, 438, 1, textureX, textureY); // Box 128
		bodyModel[146] = new ModelRendererTurbo(this, 492, 23, textureX, textureY); // Box 128
		bodyModel[147] = new ModelRendererTurbo(this, 460, 23, textureX, textureY); // Box 176
		bodyModel[148] = new ModelRendererTurbo(this, 459, 10, textureX, textureY); // Box 128
		bodyModel[149] = new ModelRendererTurbo(this, 52, 3, textureX, textureY); // Box 128
		bodyModel[150] = new ModelRendererTurbo(this, 72, 202, textureX, textureY); // Box 128
		bodyModel[151] = new ModelRendererTurbo(this, 72, 228, textureX, textureY); // Box 128
		bodyModel[152] = new ModelRendererTurbo(this, 72, 224, textureX, textureY); // Box 128
		bodyModel[153] = new ModelRendererTurbo(this, 72, 187, textureX, textureY); // Box 193
		bodyModel[154] = new ModelRendererTurbo(this, 72, 192, textureX, textureY); // Box 194
		bodyModel[155] = new ModelRendererTurbo(this, 349, 77, textureX, textureY); // Box 128
		bodyModel[156] = new ModelRendererTurbo(this, 352, 77, textureX, textureY); // Box 128
		bodyModel[157] = new ModelRendererTurbo(this, 62, 84, textureX, textureY); // Box 128
		bodyModel[158] = new ModelRendererTurbo(this, 349, 98, textureX, textureY); // Box 202
		bodyModel[159] = new ModelRendererTurbo(this, 352, 98, textureX, textureY); // Box 203
		bodyModel[160] = new ModelRendererTurbo(this, 62, 103, textureX, textureY); // Box 204
		bodyModel[161] = new ModelRendererTurbo(this, 65, 140, textureX, textureY, "cull"); // Box 31 cull
		bodyModel[162] = new ModelRendererTurbo(this, 65, 138, textureX, textureY); // Box 31
		bodyModel[163] = new ModelRendererTurbo(this, 65, 150, textureX, textureY, "cull"); // Box 31 cull
		bodyModel[164] = new ModelRendererTurbo(this, 65, 148, textureX, textureY); // Box 31
		bodyModel[165] = new ModelRendererTurbo(this, 5, 38, textureX, textureY); // Box 128
		bodyModel[166] = new ModelRendererTurbo(this, 452, 16, textureX, textureY); // Box 128
		bodyModel[167] = new ModelRendererTurbo(this, 366, 87, textureX, textureY); // Box 38
		bodyModel[168] = new ModelRendererTurbo(this, 374, 103, textureX, textureY); // Box 128
		bodyModel[169] = new ModelRendererTurbo(this, 373, 97, textureX, textureY); // Box 128
		bodyModel[170] = new ModelRendererTurbo(this, 372, 91, textureX, textureY); // Box 128
		bodyModel[171] = new ModelRendererTurbo(this, 370, 83, textureX, textureY); // Box 128
		bodyModel[172] = new ModelRendererTurbo(this, 366, 67, textureX, textureY); // Box 248
		bodyModel[173] = new ModelRendererTurbo(this, 374, 67, textureX, textureY); // Box 250
		bodyModel[174] = new ModelRendererTurbo(this, 373, 72, textureX, textureY); // Box 252
		bodyModel[175] = new ModelRendererTurbo(this, 372, 77, textureX, textureY); // Box 254
		bodyModel[176] = new ModelRendererTurbo(this, 371, 86, textureX, textureY); // Box 38
		bodyModel[177] = new ModelRendererTurbo(this, 385, 110, textureX, textureY); // Box 128
		bodyModel[178] = new ModelRendererTurbo(this, 392, 84, textureX, textureY); // Box 128
		bodyModel[179] = new ModelRendererTurbo(this, 384, 104, textureX, textureY); // Box 128
		bodyModel[180] = new ModelRendererTurbo(this, 385, 99, textureX, textureY); // Box 128
		bodyModel[181] = new ModelRendererTurbo(this, 381, 83, textureX, textureY); // Box 128
		bodyModel[182] = new ModelRendererTurbo(this, 385, 75, textureX, textureY); // Box 128
		bodyModel[183] = new ModelRendererTurbo(this, 371, 66, textureX, textureY); // Box 247
		bodyModel[184] = new ModelRendererTurbo(this, 385, 60, textureX, textureY); // Box 249
		bodyModel[185] = new ModelRendererTurbo(this, 384, 64, textureX, textureY); // Box 251
		bodyModel[186] = new ModelRendererTurbo(this, 385, 70, textureX, textureY); // Box 253
		bodyModel[187] = new ModelRendererTurbo(this, 385, 91, textureX, textureY); // Box 255
		bodyModel[188] = new ModelRendererTurbo(this, 35, 86, textureX, textureY); // Box 38
		bodyModel[189] = new ModelRendererTurbo(this, 40, 87, textureX, textureY); // Box 38
		bodyModel[190] = new ModelRendererTurbo(this, 19, 110, textureX, textureY); // Box 128
		bodyModel[191] = new ModelRendererTurbo(this, 28, 103, textureX, textureY); // Box 128
		bodyModel[192] = new ModelRendererTurbo(this, 7, 114, textureX, textureY); // Box 128
		bodyModel[193] = new ModelRendererTurbo(this, 18, 104, textureX, textureY); // Box 128
		bodyModel[194] = new ModelRendererTurbo(this, 27, 97, textureX, textureY); // Box 128
		bodyModel[195] = new ModelRendererTurbo(this, 19, 99, textureX, textureY); // Box 128
		bodyModel[196] = new ModelRendererTurbo(this, 26, 91, textureX, textureY); // Box 128
		bodyModel[197] = new ModelRendererTurbo(this, 15, 83, textureX, textureY); // Box 128
		bodyModel[198] = new ModelRendererTurbo(this, 24, 83, textureX, textureY); // Box 128
		bodyModel[199] = new ModelRendererTurbo(this, 19, 91, textureX, textureY); // Box 128
		bodyModel[200] = new ModelRendererTurbo(this, 35, 66, textureX, textureY); // Box 247
		bodyModel[201] = new ModelRendererTurbo(this, 40, 67, textureX, textureY); // Box 248
		bodyModel[202] = new ModelRendererTurbo(this, 19, 60, textureX, textureY); // Box 249
		bodyModel[203] = new ModelRendererTurbo(this, 28, 67, textureX, textureY); // Box 250
		bodyModel[204] = new ModelRendererTurbo(this, 18, 64, textureX, textureY); // Box 251
		bodyModel[205] = new ModelRendererTurbo(this, 27, 72, textureX, textureY); // Box 252
		bodyModel[206] = new ModelRendererTurbo(this, 19, 70, textureX, textureY); // Box 253
		bodyModel[207] = new ModelRendererTurbo(this, 26, 77, textureX, textureY); // Box 254
		bodyModel[208] = new ModelRendererTurbo(this, 19, 75, textureX, textureY); // Box 255
		bodyModel[209] = new ModelRendererTurbo(this, 303, 7, textureX, textureY); // Box 275
		bodyModel[210] = new ModelRendererTurbo(this, 302, 10, textureX, textureY); // Box 276
		bodyModel[211] = new ModelRendererTurbo(this, 303, 1, textureX, textureY); // Box 275
		bodyModel[212] = new ModelRendererTurbo(this, 303, 4, textureX, textureY); // Box 275
		bodyModel[213] = new ModelRendererTurbo(this, 312, 16, textureX, textureY); // Box 259
		bodyModel[214] = new ModelRendererTurbo(this, 311, 12, textureX, textureY); // Box 260
		bodyModel[215] = new ModelRendererTurbo(this, 312, 22, textureX, textureY); // Box 261
		bodyModel[216] = new ModelRendererTurbo(this, 312, 19, textureX, textureY); // Box 262
		bodyModel[217] = new ModelRendererTurbo(this, 307, 22, textureX, textureY); // Box 260
		bodyModel[218] = new ModelRendererTurbo(this, 74, 145, textureX, textureY); // Box 128
		bodyModel[219] = new ModelRendererTurbo(this, 74, 155, textureX, textureY); // Box 205
		bodyModel[220] = new ModelRendererTurbo(this, 82, 20, textureX, textureY); // Box 264
		bodyModel[221] = new ModelRendererTurbo(this, 82, 17, textureX, textureY); // Box 264
		bodyModel[222] = new ModelRendererTurbo(this, 82, 14, textureX, textureY); // Box 264
		bodyModel[223] = new ModelRendererTurbo(this, 82, 10, textureX, textureY); // Box 264
		bodyModel[224] = new ModelRendererTurbo(this, 82, 12, textureX, textureY); // Box 264
		bodyModel[225] = new ModelRendererTurbo(this, 290, 1, textureX, textureY); // Box 264
		bodyModel[226] = new ModelRendererTurbo(this, 291, 4, textureX, textureY); // Box 264
		bodyModel[227] = new ModelRendererTurbo(this, 291, 6, textureX, textureY); // Box 264
		bodyModel[228] = new ModelRendererTurbo(this, 158, 166, textureX, textureY); // Box 2
		bodyModel[229] = new ModelRendererTurbo(this, 185, 157, textureX, textureY); // Box 2
		bodyModel[230] = new ModelRendererTurbo(this, 185, 166, textureX, textureY); // Box 2
		bodyModel[231] = new ModelRendererTurbo(this, 144, 159, textureX, textureY); // Box 38
		bodyModel[232] = new ModelRendererTurbo(this, 134, 158, textureX, textureY); // Box 38
		bodyModel[233] = new ModelRendererTurbo(this, 139, 158, textureX, textureY); // Box 38
		bodyModel[234] = new ModelRendererTurbo(this, 153, 159, textureX, textureY); // Box 38
		bodyModel[235] = new ModelRendererTurbo(this, 108, 158, textureX, textureY); // Box 41
		bodyModel[236] = new ModelRendererTurbo(this, 121, 158, textureX, textureY); // Box 41
		bodyModel[237] = new ModelRendererTurbo(this, 117, 158, textureX, textureY); // Box 41
		bodyModel[238] = new ModelRendererTurbo(this, 130, 158, textureX, textureY); // Box 41
		bodyModel[239] = new ModelRendererTurbo(this, 122, 158, textureX, textureY); // Box 41
		bodyModel[240] = new ModelRendererTurbo(this, 109, 158, textureX, textureY); // Box 41
		bodyModel[241] = new ModelRendererTurbo(this, 125, 175, textureX, textureY); // Box 52
		bodyModel[242] = new ModelRendererTurbo(this, 191, 178, textureX, textureY); // Box 52
		bodyModel[243] = new ModelRendererTurbo(this, 182, 178, textureX, textureY); // Box 52
		bodyModel[244] = new ModelRendererTurbo(this, 116, 179, textureX, textureY); // Box 52
		bodyModel[245] = new ModelRendererTurbo(this, 99, 160, textureX, textureY); // Box 52
		bodyModel[246] = new ModelRendererTurbo(this, 150, 178, textureX, textureY); // Box 52
		bodyModel[247] = new ModelRendererTurbo(this, 103, 179, textureX, textureY); // Box 41
		bodyModel[248] = new ModelRendererTurbo(this, 112, 180, textureX, textureY); // Box 41
		bodyModel[249] = new ModelRendererTurbo(this, 104, 180, textureX, textureY); // Box 41
		bodyModel[250] = new ModelRendererTurbo(this, 95, 180, textureX, textureY); // Box 52
		bodyModel[251] = new ModelRendererTurbo(this, 83, 179, textureX, textureY); // Box 41
		bodyModel[252] = new ModelRendererTurbo(this, 92, 180, textureX, textureY); // Box 41
		bodyModel[253] = new ModelRendererTurbo(this, 84, 180, textureX, textureY); // Box 41
		bodyModel[254] = new ModelRendererTurbo(this, 74, 179, textureX, textureY); // Box 52
		bodyModel[255] = new ModelRendererTurbo(this, 202, 175, textureX, textureY); // Box 52
		bodyModel[256] = new ModelRendererTurbo(this, 227, 175, textureX, textureY); // Box 52
		bodyModel[257] = new ModelRendererTurbo(this, 304, 175, textureX, textureY); // Box 52
		bodyModel[258] = new ModelRendererTurbo(this, 253, 181, textureX, textureY); // Box 41
		bodyModel[259] = new ModelRendererTurbo(this, 252, 179, textureX, textureY); // Box 41
		bodyModel[260] = new ModelRendererTurbo(this, 274, 179, textureX, textureY); // Box 41
		bodyModel[261] = new ModelRendererTurbo(this, 286, 179, textureX, textureY); // Box 41
		bodyModel[262] = new ModelRendererTurbo(this, 295, 180, textureX, textureY); // Box 41
		bodyModel[263] = new ModelRendererTurbo(this, 287, 180, textureX, textureY); // Box 41
		bodyModel[264] = new ModelRendererTurbo(this, 277, 181, textureX, textureY); // Box 52
		bodyModel[265] = new ModelRendererTurbo(this, 299, 181, textureX, textureY); // Box 52
		bodyModel[266] = new ModelRendererTurbo(this, 322, 87, textureX, textureY); // windscreen R
		bodyModel[267] = new ModelRendererTurbo(this, 322, 66, textureX, textureY); // windscreen L
		bodyModel[268] = new ModelRendererTurbo(this, 81, 269, textureX, textureY); // Box 38
		bodyModel[269] = new ModelRendererTurbo(this, 81, 297, textureX, textureY); // Box 38
		bodyModel[270] = new ModelRendererTurbo(this, 316, 269, textureX, textureY); // Box 38
		bodyModel[271] = new ModelRendererTurbo(this, 316, 297, textureX, textureY); // Box 38
		bodyModel[272] = new ModelRendererTurbo(this, 1, 142, textureX, textureY); // Box 38
		bodyModel[273] = new ModelRendererTurbo(this, 15, 161, textureX, textureY); // Box 38
		bodyModel[274] = new ModelRendererTurbo(this, 15, 137, textureX, textureY); // Box 276
		bodyModel[275] = new ModelRendererTurbo(this, 394, 52, textureX, textureY); // Box 38
		bodyModel[276] = new ModelRendererTurbo(this, 408, 71, textureX, textureY); // Box 38
		bodyModel[277] = new ModelRendererTurbo(this, 408, 47, textureX, textureY); // Box 276
		bodyModel[278] = new ModelRendererTurbo(this, 103, 244, textureX, textureY); // Box 38
		bodyModel[279] = new ModelRendererTurbo(this, 105, 239, textureX, textureY); // Box 38
		bodyModel[280] = new ModelRendererTurbo(this, 103, 252, textureX, textureY); // Box 275
		bodyModel[281] = new ModelRendererTurbo(this, 105, 259, textureX, textureY); // Box 276
		bodyModel[282] = new ModelRendererTurbo(this, 105, 257, textureX, textureY, "glow"); // Box 275 glow
		bodyModel[283] = new ModelRendererTurbo(this, 105, 242, textureX, textureY, "glow"); // Box 285 glow
		bodyModel[284] = new ModelRendererTurbo(this, 106, 262, textureX, textureY); // Box 38
		bodyModel[285] = new ModelRendererTurbo(this, 106, 233, textureX, textureY); // Box 462
		bodyModel[286] = new ModelRendererTurbo(this, 156, 249, textureX, textureY, "glow"); // Box 38 glow
		bodyModel[287] = new ModelRendererTurbo(this, 163, 249, textureX, textureY, "glow"); // Box 38 glow
		bodyModel[288] = new ModelRendererTurbo(this, 170, 249, textureX, textureY, "glow"); // Box 38 glow
		bodyModel[289] = new ModelRendererTurbo(this, 177, 249, textureX, textureY, "glow"); // Box 38 glow
		bodyModel[290] = new ModelRendererTurbo(this, 184, 249, textureX, textureY, "glow"); // Box 38 glow
		bodyModel[291] = new ModelRendererTurbo(this, 191, 249, textureX, textureY, "glow"); // Box 38 glow
		bodyModel[292] = new ModelRendererTurbo(this, 198, 249, textureX, textureY, "glow"); // Box 38 glow
		bodyModel[293] = new ModelRendererTurbo(this, 205, 249, textureX, textureY, "glow"); // Box 38 glow
		bodyModel[294] = new ModelRendererTurbo(this, 119, 276, textureX, textureY); // Right seat part
		bodyModel[295] = new ModelRendererTurbo(this, 119, 286, textureX, textureY); // Right seat part
		bodyModel[296] = new ModelRendererTurbo(this, 110, 269, textureX, textureY); // Right seat part
		bodyModel[297] = new ModelRendererTurbo(this, 99, 279, textureX, textureY); // Right seat part
		bodyModel[298] = new ModelRendererTurbo(this, 99, 269, textureX, textureY); // Right seat part
		bodyModel[299] = new ModelRendererTurbo(this, 110, 289, textureX, textureY); // Right seat part
		bodyModel[300] = new ModelRendererTurbo(this, 110, 286, textureX, textureY); // Right seat part
		bodyModel[301] = new ModelRendererTurbo(this, 110, 279, textureX, textureY); // Right seat part
		bodyModel[302] = new ModelRendererTurbo(this, 110, 276, textureX, textureY); // Right seat part
		bodyModel[303] = new ModelRendererTurbo(this, 119, 314, textureX, textureY); // Left seat part
		bodyModel[304] = new ModelRendererTurbo(this, 119, 304, textureX, textureY); // Left seat part
		bodyModel[305] = new ModelRendererTurbo(this, 110, 297, textureX, textureY); // Left seat part
		bodyModel[306] = new ModelRendererTurbo(this, 99, 297, textureX, textureY); // Left seat part
		bodyModel[307] = new ModelRendererTurbo(this, 110, 307, textureX, textureY); // Left seat part
		bodyModel[308] = new ModelRendererTurbo(this, 110, 304, textureX, textureY); // Left seat part
		bodyModel[309] = new ModelRendererTurbo(this, 110, 317, textureX, textureY); // Left seat part
		bodyModel[310] = new ModelRendererTurbo(this, 110, 314, textureX, textureY); // Left seat part
		bodyModel[311] = new ModelRendererTurbo(this, 150, 276, textureX, textureY); // Right seat part
		bodyModel[312] = new ModelRendererTurbo(this, 150, 286, textureX, textureY); // Right seat part
		bodyModel[313] = new ModelRendererTurbo(this, 141, 269, textureX, textureY); // Right seat part
		bodyModel[314] = new ModelRendererTurbo(this, 130, 269, textureX, textureY); // Right seat part
		bodyModel[315] = new ModelRendererTurbo(this, 141, 289, textureX, textureY); // Right seat part
		bodyModel[316] = new ModelRendererTurbo(this, 141, 286, textureX, textureY); // Right seat part
		bodyModel[317] = new ModelRendererTurbo(this, 141, 279, textureX, textureY); // Right seat part
		bodyModel[318] = new ModelRendererTurbo(this, 141, 276, textureX, textureY); // Right seat part
		bodyModel[319] = new ModelRendererTurbo(this, 150, 314, textureX, textureY); // Left seat part
		bodyModel[320] = new ModelRendererTurbo(this, 150, 304, textureX, textureY); // Left seat part
		bodyModel[321] = new ModelRendererTurbo(this, 141, 297, textureX, textureY); // Left seat part
		bodyModel[322] = new ModelRendererTurbo(this, 130, 297, textureX, textureY); // Left seat part
		bodyModel[323] = new ModelRendererTurbo(this, 141, 307, textureX, textureY); // Left seat part
		bodyModel[324] = new ModelRendererTurbo(this, 141, 304, textureX, textureY); // Left seat part
		bodyModel[325] = new ModelRendererTurbo(this, 141, 317, textureX, textureY); // Left seat part
		bodyModel[326] = new ModelRendererTurbo(this, 141, 314, textureX, textureY); // Left seat part
		bodyModel[327] = new ModelRendererTurbo(this, 181, 276, textureX, textureY); // Right seat part
		bodyModel[328] = new ModelRendererTurbo(this, 181, 286, textureX, textureY); // Right seat part
		bodyModel[329] = new ModelRendererTurbo(this, 161, 269, textureX, textureY); // Right seat part
		bodyModel[330] = new ModelRendererTurbo(this, 172, 289, textureX, textureY); // Right seat part
		bodyModel[331] = new ModelRendererTurbo(this, 172, 286, textureX, textureY); // Right seat part
		bodyModel[332] = new ModelRendererTurbo(this, 172, 279, textureX, textureY); // Right seat part
		bodyModel[333] = new ModelRendererTurbo(this, 172, 276, textureX, textureY); // Right seat part
		bodyModel[334] = new ModelRendererTurbo(this, 181, 314, textureX, textureY); // Left seat part
		bodyModel[335] = new ModelRendererTurbo(this, 181, 304, textureX, textureY); // Left seat part
		bodyModel[336] = new ModelRendererTurbo(this, 172, 297, textureX, textureY); // Left seat part
		bodyModel[337] = new ModelRendererTurbo(this, 161, 297, textureX, textureY); // Left seat part
		bodyModel[338] = new ModelRendererTurbo(this, 172, 307, textureX, textureY); // Left seat part
		bodyModel[339] = new ModelRendererTurbo(this, 172, 304, textureX, textureY); // Left seat part
		bodyModel[340] = new ModelRendererTurbo(this, 172, 317, textureX, textureY); // Left seat part
		bodyModel[341] = new ModelRendererTurbo(this, 172, 314, textureX, textureY); // Left seat part
		bodyModel[342] = new ModelRendererTurbo(this, 130, 279, textureX, textureY); // Right seat part
		bodyModel[343] = new ModelRendererTurbo(this, 161, 279, textureX, textureY); // Right seat part
		bodyModel[344] = new ModelRendererTurbo(this, 99, 307, textureX, textureY); // Left seat part
		bodyModel[345] = new ModelRendererTurbo(this, 130, 307, textureX, textureY); // Left seat part
		bodyModel[346] = new ModelRendererTurbo(this, 161, 307, textureX, textureY); // Left seat part
		bodyModel[347] = new ModelRendererTurbo(this, 172, 269, textureX, textureY); // Right seat part
		bodyModel[348] = new ModelRendererTurbo(this, 212, 276, textureX, textureY); // Right seat part
		bodyModel[349] = new ModelRendererTurbo(this, 212, 286, textureX, textureY); // Right seat part
		bodyModel[350] = new ModelRendererTurbo(this, 203, 269, textureX, textureY); // Right seat part
		bodyModel[351] = new ModelRendererTurbo(this, 192, 269, textureX, textureY); // Right seat part
		bodyModel[352] = new ModelRendererTurbo(this, 203, 289, textureX, textureY); // Right seat part
		bodyModel[353] = new ModelRendererTurbo(this, 203, 286, textureX, textureY); // Right seat part
		bodyModel[354] = new ModelRendererTurbo(this, 203, 279, textureX, textureY); // Right seat part
		bodyModel[355] = new ModelRendererTurbo(this, 203, 276, textureX, textureY); // Right seat part
		bodyModel[356] = new ModelRendererTurbo(this, 212, 314, textureX, textureY); // Left seat part
		bodyModel[357] = new ModelRendererTurbo(this, 212, 304, textureX, textureY); // Left seat part
		bodyModel[358] = new ModelRendererTurbo(this, 203, 297, textureX, textureY); // Left seat part
		bodyModel[359] = new ModelRendererTurbo(this, 192, 297, textureX, textureY); // Left seat part
		bodyModel[360] = new ModelRendererTurbo(this, 203, 307, textureX, textureY); // Left seat part
		bodyModel[361] = new ModelRendererTurbo(this, 203, 304, textureX, textureY); // Left seat part
		bodyModel[362] = new ModelRendererTurbo(this, 203, 317, textureX, textureY); // Left seat part
		bodyModel[363] = new ModelRendererTurbo(this, 203, 314, textureX, textureY); // Left seat part
		bodyModel[364] = new ModelRendererTurbo(this, 192, 279, textureX, textureY); // Right seat part
		bodyModel[365] = new ModelRendererTurbo(this, 192, 307, textureX, textureY); // Left seat part
		bodyModel[366] = new ModelRendererTurbo(this, 243, 276, textureX, textureY); // Right seat part
		bodyModel[367] = new ModelRendererTurbo(this, 243, 286, textureX, textureY); // Right seat part
		bodyModel[368] = new ModelRendererTurbo(this, 234, 269, textureX, textureY); // Right seat part
		bodyModel[369] = new ModelRendererTurbo(this, 223, 269, textureX, textureY); // Right seat part
		bodyModel[370] = new ModelRendererTurbo(this, 234, 289, textureX, textureY); // Right seat part
		bodyModel[371] = new ModelRendererTurbo(this, 234, 286, textureX, textureY); // Right seat part
		bodyModel[372] = new ModelRendererTurbo(this, 234, 279, textureX, textureY); // Right seat part
		bodyModel[373] = new ModelRendererTurbo(this, 234, 276, textureX, textureY); // Right seat part
		bodyModel[374] = new ModelRendererTurbo(this, 243, 314, textureX, textureY); // Left seat part
		bodyModel[375] = new ModelRendererTurbo(this, 243, 304, textureX, textureY); // Left seat part
		bodyModel[376] = new ModelRendererTurbo(this, 234, 297, textureX, textureY); // Left seat part
		bodyModel[377] = new ModelRendererTurbo(this, 223, 297, textureX, textureY); // Left seat part
		bodyModel[378] = new ModelRendererTurbo(this, 234, 307, textureX, textureY); // Left seat part
		bodyModel[379] = new ModelRendererTurbo(this, 234, 304, textureX, textureY); // Left seat part
		bodyModel[380] = new ModelRendererTurbo(this, 234, 317, textureX, textureY); // Left seat part
		bodyModel[381] = new ModelRendererTurbo(this, 234, 314, textureX, textureY); // Left seat part
		bodyModel[382] = new ModelRendererTurbo(this, 223, 279, textureX, textureY); // Right seat part
		bodyModel[383] = new ModelRendererTurbo(this, 223, 307, textureX, textureY); // Left seat part
		bodyModel[384] = new ModelRendererTurbo(this, 274, 276, textureX, textureY); // Right seat part
		bodyModel[385] = new ModelRendererTurbo(this, 274, 286, textureX, textureY); // Right seat part
		bodyModel[386] = new ModelRendererTurbo(this, 265, 269, textureX, textureY); // Right seat part
		bodyModel[387] = new ModelRendererTurbo(this, 254, 269, textureX, textureY); // Right seat part
		bodyModel[388] = new ModelRendererTurbo(this, 265, 289, textureX, textureY); // Right seat part
		bodyModel[389] = new ModelRendererTurbo(this, 265, 286, textureX, textureY); // Right seat part
		bodyModel[390] = new ModelRendererTurbo(this, 265, 279, textureX, textureY); // Right seat part
		bodyModel[391] = new ModelRendererTurbo(this, 265, 276, textureX, textureY); // Right seat part
		bodyModel[392] = new ModelRendererTurbo(this, 274, 314, textureX, textureY); // Left seat part
		bodyModel[393] = new ModelRendererTurbo(this, 274, 304, textureX, textureY); // Left seat part
		bodyModel[394] = new ModelRendererTurbo(this, 265, 297, textureX, textureY); // Left seat part
		bodyModel[395] = new ModelRendererTurbo(this, 254, 297, textureX, textureY); // Left seat part
		bodyModel[396] = new ModelRendererTurbo(this, 265, 307, textureX, textureY); // Left seat part
		bodyModel[397] = new ModelRendererTurbo(this, 265, 304, textureX, textureY); // Left seat part
		bodyModel[398] = new ModelRendererTurbo(this, 265, 317, textureX, textureY); // Left seat part
		bodyModel[399] = new ModelRendererTurbo(this, 265, 314, textureX, textureY); // Left seat part
		bodyModel[400] = new ModelRendererTurbo(this, 254, 280, textureX, textureY); // Right seat part
		bodyModel[401] = new ModelRendererTurbo(this, 254, 307, textureX, textureY); // Left seat part
		bodyModel[402] = new ModelRendererTurbo(this, 305, 276, textureX, textureY); // Right seat part
		bodyModel[403] = new ModelRendererTurbo(this, 305, 286, textureX, textureY); // Right seat part
		bodyModel[404] = new ModelRendererTurbo(this, 296, 269, textureX, textureY); // Right seat part
		bodyModel[405] = new ModelRendererTurbo(this, 285, 269, textureX, textureY); // Right seat part
		bodyModel[406] = new ModelRendererTurbo(this, 296, 289, textureX, textureY); // Right seat part
		bodyModel[407] = new ModelRendererTurbo(this, 296, 286, textureX, textureY); // Right seat part
		bodyModel[408] = new ModelRendererTurbo(this, 296, 279, textureX, textureY); // Right seat part
		bodyModel[409] = new ModelRendererTurbo(this, 296, 276, textureX, textureY); // Right seat part
		bodyModel[410] = new ModelRendererTurbo(this, 305, 314, textureX, textureY); // Left seat part
		bodyModel[411] = new ModelRendererTurbo(this, 305, 304, textureX, textureY); // Left seat part
		bodyModel[412] = new ModelRendererTurbo(this, 296, 297, textureX, textureY); // Left seat part
		bodyModel[413] = new ModelRendererTurbo(this, 285, 297, textureX, textureY); // Left seat part
		bodyModel[414] = new ModelRendererTurbo(this, 296, 307, textureX, textureY); // Left seat part
		bodyModel[415] = new ModelRendererTurbo(this, 296, 304, textureX, textureY); // Left seat part
		bodyModel[416] = new ModelRendererTurbo(this, 296, 317, textureX, textureY); // Left seat part
		bodyModel[417] = new ModelRendererTurbo(this, 296, 314, textureX, textureY); // Left seat part
		bodyModel[418] = new ModelRendererTurbo(this, 285, 279, textureX, textureY); // Right seat part
		bodyModel[419] = new ModelRendererTurbo(this, 285, 307, textureX, textureY); // Left seat part
		bodyModel[420] = new ModelRendererTurbo(this, 358, 260, textureX, textureY); // Box 38
		bodyModel[421] = new ModelRendererTurbo(this, 427, 259, textureX, textureY); // Box 38
		bodyModel[422] = new ModelRendererTurbo(this, 346, 303, textureX, textureY); // Box 38
		bodyModel[423] = new ModelRendererTurbo(this, 462, 274, textureX, textureY); // Box 38
		bodyModel[424] = new ModelRendererTurbo(this, 332, 321, textureX, textureY); // Box 38
		bodyModel[425] = new ModelRendererTurbo(this, 326, 296, textureX, textureY, "glow"); // Box 38 glow
		bodyModel[426] = new ModelRendererTurbo(this, 77, 295, textureX, textureY, "glow"); // Box 38 glow
		bodyModel[427] = new ModelRendererTurbo(this, 431, 238, textureX, textureY); // Box 38
		bodyModel[428] = new ModelRendererTurbo(this, 368, 303, textureX, textureY); // Box 38
		bodyModel[429] = new ModelRendererTurbo(this, 357, 303, textureX, textureY); // Box 38
		bodyModel[430] = new ModelRendererTurbo(this, 355, 307, textureX, textureY); // Box 38
		bodyModel[431] = new ModelRendererTurbo(this, 460, 299, textureX, textureY); // Box 38
		bodyModel[432] = new ModelRendererTurbo(this, 422, 212, textureX, textureY); // Box 526
		bodyModel[433] = new ModelRendererTurbo(this, 405, 193, textureX, textureY); // Box 527
		bodyModel[434] = new ModelRendererTurbo(this, 434, 202, textureX, textureY); // Box 528
		bodyModel[435] = new ModelRendererTurbo(this, 434, 227, textureX, textureY); // Box 529
		bodyModel[436] = new ModelRendererTurbo(this, 437, 205, textureX, textureY); // Box 530
		bodyModel[437] = new ModelRendererTurbo(this, 437, 230, textureX, textureY); // Box 531
		bodyModel[438] = new ModelRendererTurbo(this, 407, 210, textureX, textureY); // Box 532
		bodyModel[439] = new ModelRendererTurbo(this, 432, 208, textureX, textureY); // Box 533
		bodyModel[440] = new ModelRendererTurbo(this, 432, 233, textureX, textureY); // Box 534
		bodyModel[441] = new ModelRendererTurbo(this, 439, 220, textureX, textureY); // Box 531
		bodyModel[442] = new ModelRendererTurbo(this, 439, 216, textureX, textureY); // Box 531
		bodyModel[443] = new ModelRendererTurbo(this, 419, 283, textureX, textureY); // Box 38
		bodyModel[444] = new ModelRendererTurbo(this, 417, 274, textureX, textureY); // Box 38
		bodyModel[445] = new ModelRendererTurbo(this, 422, 274, textureX, textureY); // Box 38
		bodyModel[446] = new ModelRendererTurbo(this, 419, 246, textureX, textureY); // Box 38
		bodyModel[447] = new ModelRendererTurbo(this, 418, 255, textureX, textureY); // Box 38
		bodyModel[448] = new ModelRendererTurbo(this, 423, 255, textureX, textureY); // Box 38
		bodyModel[449] = new ModelRendererTurbo(this, 419, 264, textureX, textureY); // Box 38
		bodyModel[450] = new ModelRendererTurbo(this, 418, 243, textureX, textureY); // Box 38
		bodyModel[451] = new ModelRendererTurbo(this, 446, 262, textureX, textureY); // Box 38
		bodyModel[452] = new ModelRendererTurbo(this, 449, 267, textureX, textureY); // Box 38
		bodyModel[453] = new ModelRendererTurbo(this, 448, 271, textureX, textureY); // Box 38
		bodyModel[454] = new ModelRendererTurbo(this, 339, 257, textureX, textureY); // Conductor's scissor gate
		bodyModel[455] = new ModelRendererTurbo(this, 334, 247, textureX, textureY); // Box 38
		bodyModel[456] = new ModelRendererTurbo(this, 352, 247, textureX, textureY); // Box 38
		bodyModel[457] = new ModelRendererTurbo(this, 357, 321, textureX, textureY); // Box 38
		bodyModel[458] = new ModelRendererTurbo(this, 329, 247, textureX, textureY); // Box 264
		bodyModel[459] = new ModelRendererTurbo(this, 329, 240, textureX, textureY); // Box 38
		bodyModel[460] = new ModelRendererTurbo(this, 343, 247, textureX, textureY); // Box 128
		bodyModel[461] = new ModelRendererTurbo(this, 344, 240, textureX, textureY); // Box 128
		bodyModel[462] = new ModelRendererTurbo(this, 345, 251, textureX, textureY); // Box 128
		bodyModel[463] = new ModelRendererTurbo(this, 333, 266, textureX, textureY); // Box 38
		bodyModel[464] = new ModelRendererTurbo(this, 333, 275, textureX, textureY); // Box 38
		bodyModel[465] = new ModelRendererTurbo(this, 333, 284, textureX, textureY); // Box 38
		bodyModel[466] = new ModelRendererTurbo(this, 35, 288, textureX, textureY); // Box 38
		bodyModel[467] = new ModelRendererTurbo(this, 1, 271, textureX, textureY); // Box 38
		bodyModel[468] = new ModelRendererTurbo(this, 20, 269, textureX, textureY); // Box 38
		bodyModel[469] = new ModelRendererTurbo(this, 5, 256, textureX, textureY); // Box 38
		bodyModel[470] = new ModelRendererTurbo(this, 70, 303, textureX, textureY); // Box 38
		bodyModel[471] = new ModelRendererTurbo(this, 5, 235, textureX, textureY); // Box 38
		bodyModel[472] = new ModelRendererTurbo(this, 68, 272, textureX, textureY); // Box 38
		bodyModel[473] = new ModelRendererTurbo(this, 4, 274, textureX, textureY); // Box 38
		bodyModel[474] = new ModelRendererTurbo(this, 7, 279, textureX, textureY); // Box 38
		bodyModel[475] = new ModelRendererTurbo(this, 6, 283, textureX, textureY); // Box 38
		bodyModel[476] = new ModelRendererTurbo(this, 44, 295, textureX, textureY); // Box 38
		bodyModel[477] = new ModelRendererTurbo(this, 46, 286, textureX, textureY); // Box 38
		bodyModel[478] = new ModelRendererTurbo(this, 41, 286, textureX, textureY); // Box 38
		bodyModel[479] = new ModelRendererTurbo(this, 44, 258, textureX, textureY); // Box 38
		bodyModel[480] = new ModelRendererTurbo(this, 46, 267, textureX, textureY); // Box 38
		bodyModel[481] = new ModelRendererTurbo(this, 41, 267, textureX, textureY); // Box 38
		bodyModel[482] = new ModelRendererTurbo(this, 44, 276, textureX, textureY); // Box 38
		bodyModel[483] = new ModelRendererTurbo(this, 52, 299, textureX, textureY); // Box 38
		bodyModel[484] = new ModelRendererTurbo(this, 57, 235, textureX, textureY); // Box 38
		bodyModel[485] = new ModelRendererTurbo(this, 58, 300, textureX, textureY); // Box 38
		bodyModel[486] = new ModelRendererTurbo(this, 58, 245, textureX, textureY); // Box 128
		bodyModel[487] = new ModelRendererTurbo(this, 59, 239, textureX, textureY); // Box 128
		bodyModel[488] = new ModelRendererTurbo(this, 60, 249, textureX, textureY); // Box 128
		bodyModel[489] = new ModelRendererTurbo(this, 59, 290, textureX, textureY); // Box 128
		bodyModel[490] = new ModelRendererTurbo(this, 60, 294, textureX, textureY); // Box 128
		bodyModel[491] = new ModelRendererTurbo(this, 61, 284, textureX, textureY); // Box 128
		bodyModel[492] = new ModelRendererTurbo(this, 53, 251, textureX, textureY); // Box 527
		bodyModel[493] = new ModelRendererTurbo(this, 52, 264, textureX, textureY); // Box 528
		bodyModel[494] = new ModelRendererTurbo(this, 57, 276, textureX, textureY); // Box 529
		bodyModel[495] = new ModelRendererTurbo(this, 51, 267, textureX, textureY); // Box 530
		bodyModel[496] = new ModelRendererTurbo(this, 52, 276, textureX, textureY); // Box 531
		bodyModel[497] = new ModelRendererTurbo(this, 52, 270, textureX, textureY); // Box 532
		bodyModel[498] = new ModelRendererTurbo(this, 60, 265, textureX, textureY); // Box 533
		bodyModel[499] = new ModelRendererTurbo(this, 61, 279, textureX, textureY); // Box 534

		bodyModel[0].addBox(0F, 0F, 0F, 118, 2, 22, 0F); // Box 2
		bodyModel[0].setRotationPoint(-61F, 1F, -11F);

		bodyModel[1].addBox(0F, 0F, 0F, 1, 2, 22, 0F); // Box 2
		bodyModel[1].setRotationPoint(61F, 1F, -11F);

		bodyModel[2].addBox(0F, 0F, 0F, 4, 2, 10, 0F); // Box 2
		bodyModel[2].setRotationPoint(57F, 1F, -5F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 2
		bodyModel[3].setRotationPoint(61F, 3F, 10.5F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 2
		bodyModel[4].setRotationPoint(61F, 4F, 10.5F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 2
		bodyModel[5].setRotationPoint(55F, 3F, 10.5F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 2
		bodyModel[6].setRotationPoint(55F, 4F, 10.5F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, -0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, -0.75F, 0F, -0.5F); // Box 2
		bodyModel[7].setRotationPoint(52.75F, 3F, 10.5F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, -1F, -1F, 0F, -1F); // Box 2
		bodyModel[8].setRotationPoint(53.5F, 4F, 10.5F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 7, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 2 cull
		bodyModel[9].setRotationPoint(-61F, 4F, 10.5F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 2 cull
		bodyModel[10].setRotationPoint(-61F, 3F, 10.5F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.5F, 0.25F, 0F, -0.5F); // Box 2
		bodyModel[11].setRotationPoint(-52.75F, 3F, 10.5F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, -1F, -0.5F, 0F, -1F); // Box 2
		bodyModel[12].setRotationPoint(-54.5F, 4F, 10.5F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.5F, 0.25F, 0F, -0.5F); // Box 2
		bodyModel[13].setRotationPoint(35.25F, 3F, 10.5F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, -1F, -0.5F, 0F, -1F); // Box 2
		bodyModel[14].setRotationPoint(33.5F, 4F, 10.5F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, -0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, -0.75F, 0F, -0.5F); // Box 2
		bodyModel[15].setRotationPoint(-35.25F, 3F, 10.5F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, -1F, -1F, 0F, -1F); // Box 2
		bodyModel[16].setRotationPoint(-34.5F, 4F, 10.5F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 69, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 2
		bodyModel[17].setRotationPoint(-34F, 3F, 10.5F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 67, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 2
		bodyModel[18].setRotationPoint(-33F, 4F, 10.5F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 24
		bodyModel[19].setRotationPoint(61F, 3F, -11F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25
		bodyModel[20].setRotationPoint(61F, 4F, -11F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 26
		bodyModel[21].setRotationPoint(55F, 3F, -11F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
		bodyModel[22].setRotationPoint(55F, 4F, -11F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, -0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, -0.75F, 0F, -0.5F); // Box 28
		bodyModel[23].setRotationPoint(52.75F, 3F, -11F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F); // Box 29
		bodyModel[24].setRotationPoint(53.5F, 4F, -11F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 7, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 30 cull
		bodyModel[25].setRotationPoint(-61F, 4F, -11F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 31 cull
		bodyModel[26].setRotationPoint(-61F, 3F, -11F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.5F, 0.25F, 0F, -0.5F); // Box 32
		bodyModel[27].setRotationPoint(-52.75F, 3F, -11F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, -0.5F, 0F, 0F); // Box 33
		bodyModel[28].setRotationPoint(-54.5F, 4F, -11F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.5F, 0.25F, 0F, -0.5F); // Box 34
		bodyModel[29].setRotationPoint(35.25F, 3F, -11F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, -0.5F, 0F, 0F); // Box 35
		bodyModel[30].setRotationPoint(33.5F, 4F, -11F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, -0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, -0.75F, 0F, -0.5F); // Box 36
		bodyModel[31].setRotationPoint(-35.25F, 3F, -11F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F); // Box 37
		bodyModel[32].setRotationPoint(-34.5F, 4F, -11F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 69, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 38
		bodyModel[33].setRotationPoint(-34F, 3F, -11F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 67, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39
		bodyModel[34].setRotationPoint(-33F, 4F, -11F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 2
		bodyModel[35].setRotationPoint(54F, 3F, 10.5F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 41
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

		bodyModel[44].addBox(0F, 0F, 0F, 8, 3, 5, 0F); // Box 2
		bodyModel[44].setRotationPoint(6F, 3F, 5F);

		bodyModel[45].addBox(0F, 0F, 0F, 6, 5, 5, 0F); // Box 52
		bodyModel[45].setRotationPoint(18F, 3F, -10F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 18, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 2
		bodyModel[46].setRotationPoint(-29F, 4F, -2F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 18, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 2
		bodyModel[47].setRotationPoint(-29F, 6.5F, -2F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 7, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[48].setRotationPoint(-26F, 3F, 8.9F);
		bodyModel[48].rotateAngleX = -0.78539816F;

		bodyModel[49].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 41
		bodyModel[49].setRotationPoint(-26.01F, 3F, 8.4F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 41
		bodyModel[50].setRotationPoint(-18.99F, 3F, 8.4F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 8, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[51].setRotationPoint(20F, 4F, 0F);
		bodyModel[51].rotateAngleX = -0.78539816F;

		bodyModel[52].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 41
		bodyModel[52].setRotationPoint(19.99F, 4F, -0.5F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 41
		bodyModel[53].setRotationPoint(28.01F, 4F, -0.5F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F); // Box 26
		bodyModel[54].setRotationPoint(57F, 3F, -10.5F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 0, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F); // Box 26
		bodyModel[55].setRotationPoint(57F, 4F, -10.5F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F); // Box 26
		bodyModel[56].setRotationPoint(61F, 3F, -10.5F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 0, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F); // Box 26
		bodyModel[57].setRotationPoint(61F, 4F, -10.5F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F); // Box 24
		bodyModel[58].setRotationPoint(61.01F, 3F, -9F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F); // Box 24
		bodyModel[59].setRotationPoint(56.99F, 3F, -9F);

		bodyModel[60].addShapeBox(0F, 1F, 1F, 4, 2, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Left step part
		bodyModel[60].setRotationPoint(57.01F, 4F, -8F);

		bodyModel[61].addShapeBox(0F, 1F, -1F, 4, 0, 2, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Left step part
		bodyModel[61].setRotationPoint(57.01F, 4F, -8F);

		bodyModel[62].addShapeBox(0F, -1F, -1F, 4, 2, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Left step part
		bodyModel[62].setRotationPoint(57.01F, 4F, -8F);

		bodyModel[63].addShapeBox(0F, -1F, -3F, 4, 0, 2, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Left step part
		bodyModel[63].setRotationPoint(57.01F, 4F, -8F);

		bodyModel[64].addShapeBox(0F, -3F, -3F, 4, 3, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Left step part
		bodyModel[64].setRotationPoint(57.01F, 4F, -8F);

		bodyModel[65].addShapeBox(0F, 1F, -3F, 0, 2, 4, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Left step part
		bodyModel[65].setRotationPoint(57.01F, 4F, -8F);

		bodyModel[66].addShapeBox(0F, 0F, -3F, 0, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Left step part
		bodyModel[66].setRotationPoint(57.01F, 4F, -8F);

		bodyModel[67].addShapeBox(0F, -3F, -3F, 0, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left step part
		bodyModel[67].setRotationPoint(57.01F, 4F, -8F);

		bodyModel[68].addShapeBox(0F, 1F, -3F, 0, 2, 4, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Left step part
		bodyModel[68].setRotationPoint(60.99F, 4F, -8F);

		bodyModel[69].addShapeBox(0F, 0F, -3F, 0, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Left step part
		bodyModel[69].setRotationPoint(60.99F, 4F, -8F);

		bodyModel[70].addShapeBox(0F, -3F, -3F, 0, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left step part
		bodyModel[70].setRotationPoint(60.99F, 4F, -8F);

		bodyModel[71].addShapeBox(0F, 0F, -3F, 4, 2, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.02F, 0F, -0.5F, -0.02F, 0F, 0.5F, 0F, 0F, 0.5F); // Left step part
		bodyModel[71].setRotationPoint(57.01F, 4F, -8F);

		bodyModel[72].addShapeBox(0F, 2F, -2.5F, 4, 0, 4, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 1F, -0.5F, 0F, 1F, -0.5F); // Left step part
		bodyModel[72].setRotationPoint(57.01F, 4F, -8F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 140
		bodyModel[73].setRotationPoint(57F, 3F, 7F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 0, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 141
		bodyModel[74].setRotationPoint(57F, 4F, 8F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 142
		bodyModel[75].setRotationPoint(61F, 3F, 7F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 0, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 143
		bodyModel[76].setRotationPoint(61F, 4F, 8F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 144
		bodyModel[77].setRotationPoint(61.01F, 3F, 8F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 145
		bodyModel[78].setRotationPoint(56.99F, 3F, 8F);

		bodyModel[79].addShapeBox(0F, 1F, -1F, 4, 2, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Right step part
		bodyModel[79].setRotationPoint(57.01F, 4F, 8F);

		bodyModel[80].addShapeBox(0F, 1F, -1F, 4, 0, 2, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Right step part
		bodyModel[80].setRotationPoint(57.01F, 4F, 8F);

		bodyModel[81].addShapeBox(0F, -1F, 1F, 4, 2, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Right step part
		bodyModel[81].setRotationPoint(57.01F, 4F, 8F);

		bodyModel[82].addShapeBox(0F, -1F, 1F, 4, 0, 2, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Right step part
		bodyModel[82].setRotationPoint(57.01F, 4F, 8F);

		bodyModel[83].addShapeBox(0F, -3F, 3F, 4, 3, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Right step part
		bodyModel[83].setRotationPoint(57.01F, 4F, 8F);

		bodyModel[84].addShapeBox(0F, 1F, -1F, 0, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F); // Right step part
		bodyModel[84].setRotationPoint(57.01F, 4F, 8F);

		bodyModel[85].addShapeBox(0F, 0F, -1F, 0, 1, 4, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Right step part
		bodyModel[85].setRotationPoint(57.01F, 4F, 8F);

		bodyModel[86].addShapeBox(0F, -3F, 0F, 0, 3, 3, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right step part
		bodyModel[86].setRotationPoint(57.01F, 4F, 8F);

		bodyModel[87].addShapeBox(0F, 1F, -1F, 0, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F); // Right step part
		bodyModel[87].setRotationPoint(60.99F, 4F, 8F);

		bodyModel[88].addShapeBox(0F, 0F, -1F, 0, 1, 4, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Right step part
		bodyModel[88].setRotationPoint(60.99F, 4F, 8F);

		bodyModel[89].addShapeBox(0F, -3F, 0F, 0, 3, 3, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right step part
		bodyModel[89].setRotationPoint(60.99F, 4F, 8F);

		bodyModel[90].addShapeBox(0F, 0F, 3F, 4, 2, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.02F, 0F, 0.5F, -0.02F, 0F, -0.5F, 0F, 0F, -0.5F); // Right step part
		bodyModel[90].setRotationPoint(57.01F, 4F, 8F);

		bodyModel[91].addShapeBox(0F, 2F, -1.5F, 4, 0, 4, 0F,0F, -1F, -0.5F, -0.02F, -1F, -0.5F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -0.5F, -0.02F, 1F, -0.5F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Right step part
		bodyModel[91].setRotationPoint(57.01F, 4F, 8F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 4, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F); // Left trapdoor
		bodyModel[92].setRotationPoint(57F, 1F, -10.99F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 4, 1, 6, 0F,0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F); // Right trapdoor
		bodyModel[93].setRotationPoint(57F, 1F, 4.99F);

		bodyModel[94].addShapeBox(0F, 0F, -1F, 4, 15, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Left side door
		bodyModel[94].setRotationPoint(57F, -14F, -10.5F);

		bodyModel[95].addBox(0F, 0F, 0F, 118, 16, 1, 0F); // Box 38
		bodyModel[95].setRotationPoint(-61F, -15F, -11F);

		bodyModel[96].addBox(0F, 0F, 0F, 118, 16, 1, 0F); // Box 128
		bodyModel[96].setRotationPoint(-61F, -15F, 10F);

		bodyModel[97].addBox(0F, 0F, 0F, 1, 16, 7, 0F); // Box 128
		bodyModel[97].setRotationPoint(56F, -15F, -10F);

		bodyModel[98].addBox(0F, 0F, 0F, 1, 16, 7, 0F); // Box 128
		bodyModel[98].setRotationPoint(56F, -15F, 3F);

		bodyModel[99].addBox(0F, 0F, 0F, 1, 16, 8, 0F); // Box 128
		bodyModel[99].setRotationPoint(61F, -15F, -11F);

		bodyModel[100].addBox(0F, 0F, 0F, 1, 16, 8, 0F); // Box 128
		bodyModel[100].setRotationPoint(61F, -15F, 3F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 4, 15, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Right side door
		bodyModel[101].setRotationPoint(57F, -14F, 10.5F);

		bodyModel[102].addBox(0F, 0F, 0F, 1, 16, 7, 0F); // Box 128
		bodyModel[102].setRotationPoint(-61F, -15F, -10F);

		bodyModel[103].addBox(0F, 0F, 0F, 1, 16, 7, 0F); // Box 128
		bodyModel[103].setRotationPoint(-61F, -15F, 3F);

		bodyModel[104].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Box 128
		bodyModel[104].setRotationPoint(56F, -15F, -3F);

		bodyModel[105].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Box 128
		bodyModel[105].setRotationPoint(61F, -15F, -3F);

		bodyModel[106].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Box 128
		bodyModel[106].setRotationPoint(-61F, -15F, -3F);

		bodyModel[107].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 128
		bodyModel[107].setRotationPoint(57F, -15F, -11F);

		bodyModel[108].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 128
		bodyModel[108].setRotationPoint(57F, -15F, 10F);

		bodyModel[109].addShapeBox(0F, 0F, -6F, 1, 15, 6, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Vestibule door
		bodyModel[109].setRotationPoint(56.01F, -14F, 3F);

		bodyModel[110].addShapeBox(-1F, 0F, 0F, 1, 15, 6, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Front end door
		bodyModel[110].setRotationPoint(-59.99F, -14F, -3F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[111].setRotationPoint(62F, -15F, -4F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[112].setRotationPoint(62F, 1F, -4F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 2, 15, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[113].setRotationPoint(62F, -14F, -4F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 2, 15, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[114].setRotationPoint(62F, -14F, 3F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 1, 15, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[115].setRotationPoint(63.5F, -14F, -5F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 1, 15, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[116].setRotationPoint(63.5F, -14F, 3F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[117].setRotationPoint(63.5F, 1F, -5F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[118].setRotationPoint(63.5F, -15F, -5F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 128
		bodyModel[119].setRotationPoint(63.5F, -16F, -5F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 153
		bodyModel[120].setRotationPoint(63.5F, -16F, 1.5F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[121].setRotationPoint(-62.5F, -15F, -4F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[122].setRotationPoint(-62.5F, 1F, -4F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 2, 15, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[123].setRotationPoint(-62.5F, -14F, -4F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 2, 15, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[124].setRotationPoint(-62.5F, -14F, 3F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 1, 15, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[125].setRotationPoint(-63F, -14F, -5F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 1, 15, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[126].setRotationPoint(-63F, -14F, 3F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[127].setRotationPoint(-63F, 1F, -5F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[128].setRotationPoint(-63F, -15F, -5F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 128
		bodyModel[129].setRotationPoint(-63F, -16F, -5F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 153
		bodyModel[130].setRotationPoint(-63F, -16F, 1.5F);

		bodyModel[131].addBox(0F, 0F, 0F, 123, 2, 6, 0F); // Box 128
		bodyModel[131].setRotationPoint(-61F, -20F, -3F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 123, 1, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[132].setRotationPoint(-61F, -20F, -7F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 123, 1, 3, 0F,0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.75F, 0F, 0F, 1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[133].setRotationPoint(-61F, -19F, -10F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 123, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 168
		bodyModel[134].setRotationPoint(-61F, -20F, 3F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 123, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.75F, 0F, 0F, 1.75F, 0F); // Box 169
		bodyModel[135].setRotationPoint(-61F, -19F, 7F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 1, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 128
		bodyModel[136].setRotationPoint(-61F, -17F, -7F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 128
		bodyModel[137].setRotationPoint(-61F, -18F, -10F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 123, 1, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[138].setRotationPoint(-61F, -19F, -7F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 176
		bodyModel[139].setRotationPoint(-61F, -18F, 7F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 123, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 177
		bodyModel[140].setRotationPoint(-61F, -19F, 3F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 123, 1, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 1.25F, -1F, 0F, 1.25F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 128
		bodyModel[141].setRotationPoint(-61F, -16F, -11F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 123, 1, 2, 0F,0F, 1.25F, 0F, 0F, 1.25F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 170
		bodyModel[142].setRotationPoint(-61F, -16F, 10F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 0, 8, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Rear gate closed
		bodyModel[143].setRotationPoint(62F, -7F, -3F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 0, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Rear gate open
		bodyModel[144].setRotationPoint(62F, -7F, -3F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 6, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 128
		bodyModel[145].setRotationPoint(56F, -17F, -7F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 6, 3, 3, 0F,0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F); // Box 128
		bodyModel[146].setRotationPoint(56F, -18F, -10F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 6, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F); // Box 176
		bodyModel[147].setRotationPoint(56F, -18F, 7F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 6, 1, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 128
		bodyModel[148].setRotationPoint(56F, -16.25F, -10F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 1, 1, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 128
		bodyModel[149].setRotationPoint(-61F, -16.25F, -10F);

		bodyModel[150].addBox(0F, 0F, 0F, 123, 1, 14, 0F); // Box 128
		bodyModel[150].setRotationPoint(-61F, -18F, -7F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 116, 1, 3, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 1F, -1.7F, 0F, 1F, -1.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -0.65F, 0F, -2F, -0.65F); // Box 128
		bodyModel[151].setRotationPoint(-60F, -16F, -10F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 116, 1, 2, 0F,0F, -1F, -0.3F, 0F, -1F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[152].setRotationPoint(-60F, -18F, -9F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 116, 1, 3, 0F,0F, 1F, -1.7F, 0F, 1F, -1.7F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -2F, -0.65F, 0F, -2F, -0.65F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 193
		bodyModel[153].setRotationPoint(-60F, -16F, 7F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 116, 1, 2, 0F,0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 194
		bodyModel[154].setRotationPoint(-60F, -18F, 6.7F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[155].setRotationPoint(56.5F, -6F, -12F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[156].setRotationPoint(61.5F, -6F, -12F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 4, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[157].setRotationPoint(-61F, -1.5F, -12F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 202
		bodyModel[158].setRotationPoint(56.5F, -6F, 11F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 203
		bodyModel[159].setRotationPoint(61.5F, -6F, 11F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 4, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 204
		bodyModel[160].setRotationPoint(-61F, -1.5F, 11F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F,-0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F); // Box 31 cull
		bodyModel[161].setRotationPoint(-61F, 3F, -11F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 3, 0, 1, 0F,-0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F); // Box 31
		bodyModel[162].setRotationPoint(-61F, 5F, -11F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F,-0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F); // Box 31 cull
		bodyModel[163].setRotationPoint(-61F, 3F, 10F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 3, 0, 1, 0F,-0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F); // Box 31
		bodyModel[164].setRotationPoint(-61F, 5F, 10F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[165].setRotationPoint(-63F, -16F, -1.5F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[166].setRotationPoint(63.5F, -16F, -1.5F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 2, 18, 0, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[167].setRotationPoint(62F, -15F, -11F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 2, 0, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 2.25F, -1F, 0F, 2.25F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -2.25F, -1F, 0F, -2.25F, -1F); // Box 128
		bodyModel[168].setRotationPoint(62F, -15F, -11F);

		bodyModel[169].addShapeBox(0F, 0F, 0F, 2, 0, 3, 0F,0F, -1.75F, 0F, -0.5F, -1.75F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 1.75F, 0F, -0.5F, 1.75F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[169].setRotationPoint(62F, -19F, -10F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 2, 0, 4, 0F,0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -0.5F, 1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[170].setRotationPoint(62F, -20F, -7F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 2, 0, 6, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[171].setRotationPoint(62F, -20F, -3F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 2, 18, 0, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 248
		bodyModel[172].setRotationPoint(62F, -15F, 11F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 2, 0, 2, 0F,0F, 2.25F, -1F, -0.5F, 2.25F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -2.25F, -1F, -0.5F, -2.25F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 250
		bodyModel[173].setRotationPoint(62F, -15F, 9F);

		bodyModel[174].addShapeBox(0F, 0F, 0F, 2, 0, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 1.75F, 0F, 0F, 1.75F, 0F); // Box 252
		bodyModel[174].setRotationPoint(62F, -19F, 7F);

		bodyModel[175].addShapeBox(0F, 0F, 0F, 2, 0, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 1F, 0F, 0F, 1F, 0F); // Box 254
		bodyModel[175].setRotationPoint(62F, -20F, 3F);

		bodyModel[176].addShapeBox(0F, 0F, 0F, 1, 18, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[176].setRotationPoint(63.5F, -15F, -11F);

		bodyModel[177].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 1.25F, -1F, 0F, 1.25F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F); // Box 128
		bodyModel[177].setRotationPoint(63.5F, -16F, -11F);

		bodyModel[178].addShapeBox(0F, 0F, 0F, 1, 1, 20, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[178].setRotationPoint(63.5F, 1F, -10F);

		bodyModel[179].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, -1.75F, 0F, -0.5F, -1.75F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, -0.5F, 2F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[179].setRotationPoint(63.5F, -19F, -10F);

		bodyModel[180].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[180].setRotationPoint(63.5F, -19.5F, -7F);

		bodyModel[181].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[181].setRotationPoint(63.5F, -20F, -3F);

		bodyModel[182].addShapeBox(0F, 0F, 0F, 1, 5, 2, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[182].setRotationPoint(63.5F, -20F, -5F);

		bodyModel[183].addShapeBox(0F, 0F, 0F, 1, 18, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 247
		bodyModel[183].setRotationPoint(63.5F, -15F, 10F);

		bodyModel[184].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 1.25F, -1F, -0.5F, 1.25F, -1F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 249
		bodyModel[184].setRotationPoint(63.5F, -16F, 9F);

		bodyModel[185].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 2F, 0F, 0F, 2F, 0F); // Box 251
		bodyModel[185].setRotationPoint(63.5F, -19F, 7F);

		bodyModel[186].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 253
		bodyModel[186].setRotationPoint(63.5F, -19.5F, 5F);

		bodyModel[187].addShapeBox(0F, 0F, 0F, 1, 5, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 255
		bodyModel[187].setRotationPoint(63.5F, -20F, 3F);

		bodyModel[188].addShapeBox(0F, 0F, 0F, 1, 18, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[188].setRotationPoint(-63F, -15F, -11F);

		bodyModel[189].addShapeBox(0F, 0F, 0F, 2, 18, 0, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[189].setRotationPoint(-62.5F, -15F, -11F);

		bodyModel[190].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 1.25F, -1F, 0F, 1.25F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F); // Box 128
		bodyModel[190].setRotationPoint(-63F, -16F, -11F);

		bodyModel[191].addShapeBox(0F, 0F, 0F, 2, 0, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 2.25F, -1F, 0F, 2.25F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -2.25F, -1F, 0F, -2.25F, -1F); // Box 128
		bodyModel[191].setRotationPoint(-62.5F, -15F, -11F);

		bodyModel[192].addShapeBox(0F, 0F, 0F, 1, 1, 20, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[192].setRotationPoint(-63F, 1F, -10F);

		bodyModel[193].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, -1.75F, 0F, -0.5F, -1.75F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, -0.5F, 2F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[193].setRotationPoint(-63F, -19F, -10F);

		bodyModel[194].addShapeBox(0F, 0F, 0F, 2, 0, 3, 0F,0F, -1.75F, 0F, -0.5F, -1.75F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 1.75F, 0F, -0.5F, 1.75F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[194].setRotationPoint(-62.5F, -19F, -10F);

		bodyModel[195].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[195].setRotationPoint(-63F, -19.5F, -7F);

		bodyModel[196].addShapeBox(0F, 0F, 0F, 2, 0, 4, 0F,0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -0.5F, 1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[196].setRotationPoint(-62.5F, -20F, -7F);

		bodyModel[197].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[197].setRotationPoint(-63F, -20F, -3F);

		bodyModel[198].addShapeBox(0F, 0F, 0F, 2, 0, 6, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[198].setRotationPoint(-62.5F, -20F, -3F);

		bodyModel[199].addShapeBox(0F, 0F, 0F, 1, 5, 2, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[199].setRotationPoint(-63F, -20F, -5F);

		bodyModel[200].addShapeBox(0F, 0F, 0F, 1, 18, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 247
		bodyModel[200].setRotationPoint(-63F, -15F, 10F);

		bodyModel[201].addShapeBox(0F, 0F, 0F, 2, 18, 0, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 248
		bodyModel[201].setRotationPoint(-62.5F, -15F, 11F);

		bodyModel[202].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 1.25F, -1F, -0.5F, 1.25F, -1F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 249
		bodyModel[202].setRotationPoint(-63F, -16F, 9F);

		bodyModel[203].addShapeBox(0F, 0F, 0F, 2, 0, 2, 0F,0F, 2.25F, -1F, -0.5F, 2.25F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -2.25F, -1F, -0.5F, -2.25F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 250
		bodyModel[203].setRotationPoint(-62.5F, -15F, 9F);

		bodyModel[204].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 2F, 0F, 0F, 2F, 0F); // Box 251
		bodyModel[204].setRotationPoint(-63F, -19F, 7F);

		bodyModel[205].addShapeBox(0F, 0F, 0F, 2, 0, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 1.75F, 0F, 0F, 1.75F, 0F); // Box 252
		bodyModel[205].setRotationPoint(-62.5F, -19F, 7F);

		bodyModel[206].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 253
		bodyModel[206].setRotationPoint(-63F, -19.5F, 5F);

		bodyModel[207].addShapeBox(0F, 0F, 0F, 2, 0, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 1F, 0F, 0F, 1F, 0F); // Box 254
		bodyModel[207].setRotationPoint(-62.5F, -20F, 3F);

		bodyModel[208].addShapeBox(0F, 0F, 0F, 1, 5, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 255
		bodyModel[208].setRotationPoint(-63F, -20F, 3F);

		bodyModel[209].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, -0.65F, 0F, -0.5F, -0.65F, 0F, 0.3F, -0.25F, 0F, 0.3F, -0.25F, 0F, 0.16F, -0.51F, 0F, 0.16F, -0.51F); // Box 275
		bodyModel[209].setRotationPoint(57F, -18F, 10F);

		bodyModel[210].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, 0.16F, 0F, 0F, 0.16F, 0F, -0.75F, -0.1F, 0F, -0.75F, -0.1F, 0F, -1F, 0.16F, 0F, -1F, 0.16F, 0F, 0F, -0.45F, 0F, 0F, -0.45F); // Box 276
		bodyModel[210].setRotationPoint(57F, -18.25F, 8.45F);

		bodyModel[211].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.25F, -0.47F, 0F, -0.25F, -0.47F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.75F, -0.47F, 0F, -0.75F, -0.47F, 0F, -0.2F, -0.29F, 0F, -0.2F, -0.29F); // Box 275
		bodyModel[211].setRotationPoint(57F, -16.4F, 10.02F);

		bodyModel[212].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.25F, -0.38F, 0F, -0.25F, -0.38F, 0F, -0.11F, -0.38F, 0F, -0.11F, -0.38F, 0F, -0.2F, -0.62F, 0F, -0.2F, -0.62F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 275
		bodyModel[212].setRotationPoint(57F, -16.95F, 9.87F);

		bodyModel[213].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.5F, -0.65F, 0F, -0.5F, -0.65F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0.16F, -0.51F, 0F, 0.16F, -0.51F, 0F, 0.3F, -0.25F, 0F, 0.3F, -0.25F); // Box 259
		bodyModel[213].setRotationPoint(57F, -18F, -11F);

		bodyModel[214].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, -0.75F, -0.1F, 0F, -0.75F, -0.1F, 0F, 0F, 0.16F, 0F, 0F, 0.16F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, -1F, 0.16F, 0F, -1F, 0.16F); // Box 260
		bodyModel[214].setRotationPoint(57F, -18.25F, -10.45F);

		bodyModel[215].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.25F, -0.47F, 0F, -0.25F, -0.47F, 0F, -0.2F, -0.29F, 0F, -0.2F, -0.29F, 0F, -0.75F, -0.47F, 0F, -0.75F, -0.47F); // Box 261
		bodyModel[215].setRotationPoint(57F, -16.4F, -11.02F);

		bodyModel[216].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.11F, -0.38F, 0F, -0.11F, -0.38F, 0F, -0.25F, -0.38F, 0F, -0.25F, -0.38F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.2F, -0.62F, 0F, -0.2F, -0.62F); // Box 262
		bodyModel[216].setRotationPoint(57F, -16.95F, -10.87F);

		bodyModel[217].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.1F, -0.4F, 0F, -0.1F, -0.4F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, -0.1F, -0.25F, 0F, -0.1F, -0.25F, 0F, 0F, -1F, 0.3F, 0F, -1F, 0.3F); // Box 260
		bodyModel[217].setRotationPoint(37F, -19F, -8.3F);

		bodyModel[218].addShapeBox(0F, 0F, 0F, 3, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[218].setRotationPoint(-61F, 6F, -10.5F);

		bodyModel[219].addShapeBox(0F, 0F, 0F, 3, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 205
		bodyModel[219].setRotationPoint(-61F, 6F, 10.5F);

		bodyModel[220].addShapeBox(-0.5F, 0F, -0.5F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F); // Box 264
		bodyModel[220].setRotationPoint(-44F, -19.75F, -5.85F);
		bodyModel[220].rotateAngleY = -0.78539816F;

		bodyModel[221].addShapeBox(-0.5F, 0F, -0.5F, 1, 1, 1, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, -0.35F, 0.1F, 0.1F, -0.35F, 0.1F, 0.1F, -0.35F, 0.1F, 0.1F, -0.35F, 0.1F); // Box 264
		bodyModel[221].setRotationPoint(-44F, -20.4F, -5.85F);
		bodyModel[221].rotateAngleY = -0.78539816F;

		bodyModel[222].addShapeBox(-0.5F, 0F, -0.5F, 1, 1, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F); // Box 264
		bodyModel[222].setRotationPoint(-44F, -20.9F, -5.85F);
		bodyModel[222].rotateAngleY = -0.78539816F;

		bodyModel[223].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.2F, -0.5F, 0F); // Box 264
		bodyModel[223].setRotationPoint(-45.35F, -21.4F, -5.85F);

		bodyModel[224].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,-0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 264
		bodyModel[224].setRotationPoint(-45.35F, -20.9F, -5.85F);

		bodyModel[225].addShapeBox(-0.5F, 0F, -0.5F, 1, 1, 1, 0F,-0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F); // Box 264
		bodyModel[225].setRotationPoint(37.6F, -19.9F, 4.75F);
		bodyModel[225].rotateAngleY = -0.78539816F;

		bodyModel[226].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 264
		bodyModel[226].setRotationPoint(37.35F, -20.5F, 4.75F);

		bodyModel[227].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.4F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 264
		bodyModel[227].setRotationPoint(37.35F, -21.1F, 4.75F);

		bodyModel[228].addShapeBox(0F, 0F, 0F, 8, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 2
		bodyModel[228].setRotationPoint(6F, 6F, 5F);

		bodyModel[229].addBox(0F, 0F, 0F, 6, 3, 5, 0F); // Box 2
		bodyModel[229].setRotationPoint(27F, 3F, 5F);

		bodyModel[230].addShapeBox(0F, 0F, 0F, 6, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 2
		bodyModel[230].setRotationPoint(27F, 6F, 5F);

		bodyModel[231].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 1.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 1.25F, -0.5F); // Box 38
		bodyModel[231].setRotationPoint(-6.3F, 4F, 9.5F);

		bodyModel[232].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, -1.125F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1.125F, -0.5F, 0F, -0.875F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.5F, 0F, -0.875F, -0.5F); // Box 38
		bodyModel[232].setRotationPoint(-8.3F, 4F, 9.5F);

		bodyModel[233].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F); // Box 38
		bodyModel[233].setRotationPoint(-7.3F, 4F, 9.5F);

		bodyModel[234].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.75F, 0F, -0.25F, -1.375F, 0F, -0.25F, -1.375F, -0.5F, 0F, -0.75F, -0.5F, 0F, 0.25F, 0F, -0.25F, -0.375F, 0F, -0.25F, -0.375F, -0.5F, 0F, 0.25F, -0.5F); // Box 38
		bodyModel[234].setRotationPoint(-3.3F, 3.75F, 9.5F);

		bodyModel[235].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 41
		bodyModel[235].setRotationPoint(-7F, 4.2F, 5.5F);
		bodyModel[235].rotateAngleZ = -0.78539816F;

		bodyModel[236].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 41
		bodyModel[236].setRotationPoint(-3.8F, 4.2F, 5.5F);
		bodyModel[236].rotateAngleZ = -0.78539816F;

		bodyModel[237].addShapeBox(0F, 0F, 0F, 1, 3, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 41
		bodyModel[237].setRotationPoint(-7.5F, 3F, 9.49F);

		bodyModel[238].addShapeBox(0F, 0F, 0F, 1, 3, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 41
		bodyModel[238].setRotationPoint(-4.3F, 3F, 9.49F);

		bodyModel[239].addShapeBox(0F, 0F, 0F, 1, 3, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 41
		bodyModel[239].setRotationPoint(-4.3F, 3F, 5.49F);

		bodyModel[240].addShapeBox(0F, 0F, 0F, 1, 3, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 41
		bodyModel[240].setRotationPoint(-7.5F, 3F, 5.49F);

		bodyModel[241].addBox(0F, 0F, 0F, 7, 5, 5, 0F); // Box 52
		bodyModel[241].setRotationPoint(6F, 3F, -10F);

		bodyModel[242].addBox(0F, 0F, 0F, 2, 5, 2, 0F); // Box 52
		bodyModel[242].setRotationPoint(26F, 3F, -10F);

		bodyModel[243].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 52
		bodyModel[243].setRotationPoint(24F, 3F, -10F);

		bodyModel[244].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 52
		bodyModel[244].setRotationPoint(4F, 3F, -10F);

		bodyModel[245].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 52
		bodyModel[245].setRotationPoint(-11.5F, 3F, 8F);

		bodyModel[246].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 52
		bodyModel[246].setRotationPoint(13F, 3F, -10F);

		bodyModel[247].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 41
		bodyModel[247].setRotationPoint(0F, 3.2F, -10F);
		bodyModel[247].rotateAngleZ = -0.78539816F;

		bodyModel[248].addShapeBox(0F, 0F, 0F, 1, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 41
		bodyModel[248].setRotationPoint(-0.5F, 3F, -5.99F);

		bodyModel[249].addShapeBox(0F, 0F, 0F, 1, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 41
		bodyModel[249].setRotationPoint(-0.5F, 3F, -10.01F);

		bodyModel[250].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 52
		bodyModel[250].setRotationPoint(-6F, 3F, -10F);

		bodyModel[251].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 41
		bodyModel[251].setRotationPoint(-10F, 3.2F, -10F);
		bodyModel[251].rotateAngleZ = -0.78539816F;

		bodyModel[252].addShapeBox(0F, 0F, 0F, 1, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 41
		bodyModel[252].setRotationPoint(-10.5F, 3F, -5.99F);

		bodyModel[253].addShapeBox(0F, 0F, 0F, 1, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 41
		bodyModel[253].setRotationPoint(-10.5F, 3F, -10.01F);

		bodyModel[254].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 52
		bodyModel[254].setRotationPoint(-14F, 3F, -10F);

		bodyModel[255].addBox(0F, 0F, 0F, 7, 5, 5, 0F); // Box 52
		bodyModel[255].setRotationPoint(-29F, 3F, -10F);

		bodyModel[256].addBox(0F, 0F, 0F, 7, 5, 5, 0F); // Box 52
		bodyModel[256].setRotationPoint(-21F, 3F, -10F);

		bodyModel[257].addBox(0F, 0F, 0F, 9, 5, 5, 0F); // Box 52
		bodyModel[257].setRotationPoint(19F, 3F, -10F);

		bodyModel[258].addShapeBox(0F, 0F, 0F, 9, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[258].setRotationPoint(-8F, 3F, -8.9F);
		bodyModel[258].rotateAngleX = -0.78539816F;

		bodyModel[259].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 41
		bodyModel[259].setRotationPoint(-8.01F, 3F, -9.4F);

		bodyModel[260].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 41
		bodyModel[260].setRotationPoint(1.01F, 3F, -9.4F);

		bodyModel[261].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 41
		bodyModel[261].setRotationPoint(12F, 3.2F, -10F);
		bodyModel[261].rotateAngleZ = -0.78539816F;

		bodyModel[262].addShapeBox(0F, 0F, 0F, 1, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 41
		bodyModel[262].setRotationPoint(11.5F, 3F, -5.99F);

		bodyModel[263].addShapeBox(0F, 0F, 0F, 1, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 41
		bodyModel[263].setRotationPoint(11.5F, 3F, -10.01F);

		bodyModel[264].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 52
		bodyModel[264].setRotationPoint(6F, 3F, -10F);

		bodyModel[265].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 52
		bodyModel[265].setRotationPoint(15F, 3F, -10.5F);

		bodyModel[266].addShapeBox(-1F, 0F, 0F, 2, 6, 0, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // windscreen R
		bodyModel[266].setRotationPoint(57F, -14F, 11.01F);

		bodyModel[267].addShapeBox(-1F, 0F, 0F, 2, 6, 0, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // windscreen L
		bodyModel[267].setRotationPoint(57F, -14F, -11.01F);

		bodyModel[268].addBox(0F, 0F, 0F, 1, 16, 7, 0F); // Box 38
		bodyModel[268].setRotationPoint(-42F, -15F, 3F);

		bodyModel[269].addBox(0F, 0F, 0F, 1, 16, 7, 0F); // Box 38
		bodyModel[269].setRotationPoint(-42F, -15F, -10F);

		bodyModel[270].addBox(0F, 0F, 0F, 1, 16, 7, 0F); // Box 38
		bodyModel[270].setRotationPoint(36F, -15F, 3F);

		bodyModel[271].addBox(0F, 0F, 0F, 1, 16, 7, 0F); // Box 38
		bodyModel[271].setRotationPoint(36F, -15F, -10F);

		bodyModel[272].addBox(0F, 0F, 0F, 19, 2, 16, 0F); // Box 38
		bodyModel[272].setRotationPoint(-60F, -17F, -8F);

		bodyModel[273].addShapeBox(0F, 0F, 0F, 19, 2, 2, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[273].setRotationPoint(-60F, -17F, -10F);

		bodyModel[274].addShapeBox(0F, 0F, 0F, 19, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 276
		bodyModel[274].setRotationPoint(-60F, -17F, 8F);

		bodyModel[275].addBox(0F, 0F, 0F, 20, 2, 16, 0F); // Box 38
		bodyModel[275].setRotationPoint(36F, -17F, -8F);

		bodyModel[276].addShapeBox(0F, 0F, 0F, 20, 2, 2, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[276].setRotationPoint(36F, -17F, -10F);

		bodyModel[277].addShapeBox(0F, 0F, 0F, 20, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 276
		bodyModel[277].setRotationPoint(36F, -17F, 8F);

		bodyModel[278].addBox(0F, 0F, 0F, 77, 1, 3, 0F); // Box 38
		bodyModel[278].setRotationPoint(-41F, -14F, 7F);

		bodyModel[279].addShapeBox(0F, 0F, 0F, 77, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[279].setRotationPoint(-41F, -13F, 9F);

		bodyModel[280].addBox(0F, 0F, 0F, 77, 1, 3, 0F); // Box 275
		bodyModel[280].setRotationPoint(-41F, -14F, -10F);

		bodyModel[281].addShapeBox(0F, 0F, 0F, 77, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 276
		bodyModel[281].setRotationPoint(-41F, -13F, -10F);

		bodyModel[282].addBox(0F, 0F, 0F, 77, 0, 1, 0F); // Box 275 glow
		bodyModel[282].setRotationPoint(-41F, -12.99F, -8.5F);

		bodyModel[283].addBox(0F, 0F, 0F, 77, 0, 1, 0F); // Box 285 glow
		bodyModel[283].setRotationPoint(-41F, -12.99F, 7.5F);

		bodyModel[284].addShapeBox(0F, 0F, 0F, 77, 5, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[284].setRotationPoint(-41F, -11F, -9.9F);

		bodyModel[285].addShapeBox(0F, 0F, 0F, 77, 5, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 462
		bodyModel[285].setRotationPoint(-41F, -11F, 9.9F);

		bodyModel[286].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38 glow
		bodyModel[286].setRotationPoint(-39F, -17F, -0.5F);

		bodyModel[287].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38 glow
		bodyModel[287].setRotationPoint(-29F, -17F, -0.5F);

		bodyModel[288].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38 glow
		bodyModel[288].setRotationPoint(-19F, -17F, -0.5F);

		bodyModel[289].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38 glow
		bodyModel[289].setRotationPoint(-9F, -17F, -0.5F);

		bodyModel[290].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38 glow
		bodyModel[290].setRotationPoint(1F, -17F, -0.5F);

		bodyModel[291].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38 glow
		bodyModel[291].setRotationPoint(11F, -17F, -0.5F);

		bodyModel[292].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38 glow
		bodyModel[292].setRotationPoint(21F, -17F, -0.5F);

		bodyModel[293].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38 glow
		bodyModel[293].setRotationPoint(31F, -17F, -0.5F);

		bodyModel[294].addBox(0.5F, 0F, 2F, 2, 6, 1, 0F); // Right seat part
		bodyModel[294].setRotationPoint(-29.5F, -5F, 7F);
		bodyModel[294].rotateAngleY = -3.14159265F;

		bodyModel[295].addBox(0.5F, 0F, -3F, 2, 6, 1, 0F); // Right seat part
		bodyModel[295].setRotationPoint(-29.5F, -5F, 7F);
		bodyModel[295].rotateAngleY = -3.14159265F;

		bodyModel[296].addBox(-1.5F, 0F, -2F, 5, 2, 4, 0F); // Right seat part
		bodyModel[296].setRotationPoint(-29.5F, -3F, 7F);
		bodyModel[296].rotateAngleY = -3.14159265F;

		bodyModel[297].addShapeBox(-2.5F, 0F, -2F, 1, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Right seat part
		bodyModel[297].setRotationPoint(-29.5F, -3F, 7F);
		bodyModel[297].rotateAngleY = -3.14159265F;

		bodyModel[298].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[298].setRotationPoint(-29.5F, -8F, 7F);
		bodyModel[298].rotateAngleY = -3.14159265F;

		bodyModel[299].addBox(-2.5F, 0F, -3F, 3, 5, 1, 0F); // Right seat part
		bodyModel[299].setRotationPoint(-29.5F, -4F, 7F);
		bodyModel[299].rotateAngleY = -3.14159265F;

		bodyModel[300].addShapeBox(-2.5F, 0F, -3F, 3, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[300].setRotationPoint(-29.5F, -5F, 7F);
		bodyModel[300].rotateAngleY = -3.14159265F;

		bodyModel[301].addBox(-2.5F, 0F, 2F, 3, 5, 1, 0F); // Right seat part
		bodyModel[301].setRotationPoint(-29.5F, -4F, 7F);
		bodyModel[301].rotateAngleY = -3.14159265F;

		bodyModel[302].addShapeBox(-2.5F, 0F, 2F, 3, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[302].setRotationPoint(-29.5F, -5F, 7F);
		bodyModel[302].rotateAngleY = -3.14159265F;

		bodyModel[303].addBox(0.5F, 0F, -3F, 2, 6, 1, 0F); // Left seat part
		bodyModel[303].setRotationPoint(-29.5F, -5F, -7F);
		bodyModel[303].rotateAngleY = -3.14159265F;

		bodyModel[304].addBox(0.5F, 0F, 2F, 2, 6, 1, 0F); // Left seat part
		bodyModel[304].setRotationPoint(-29.5F, -5F, -7F);
		bodyModel[304].rotateAngleY = -3.14159265F;

		bodyModel[305].addBox(-1.5F, 0F, -2F, 5, 2, 4, 0F); // Left seat part
		bodyModel[305].setRotationPoint(-29.5F, -3F, -7F);
		bodyModel[305].rotateAngleY = -3.14159265F;

		bodyModel[306].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[306].setRotationPoint(-29.5F, -8F, -7F);
		bodyModel[306].rotateAngleY = -3.14159265F;

		bodyModel[307].addBox(-2.5F, 0F, 2F, 3, 5, 1, 0F); // Left seat part
		bodyModel[307].setRotationPoint(-29.5F, -4F, -7F);
		bodyModel[307].rotateAngleY = -3.14159265F;

		bodyModel[308].addShapeBox(-2.5F, 0F, 2F, 3, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[308].setRotationPoint(-29.5F, -5F, -7F);
		bodyModel[308].rotateAngleY = -3.14159265F;

		bodyModel[309].addBox(-2.5F, 0F, -3F, 3, 5, 1, 0F); // Left seat part
		bodyModel[309].setRotationPoint(-29.5F, -4F, -7F);
		bodyModel[309].rotateAngleY = -3.14159265F;

		bodyModel[310].addShapeBox(-2.5F, 0F, -3F, 3, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[310].setRotationPoint(-29.5F, -5F, -7F);
		bodyModel[310].rotateAngleY = -3.14159265F;

		bodyModel[311].addBox(0.5F, 0F, 2F, 2, 6, 1, 0F); // Right seat part
		bodyModel[311].setRotationPoint(-19.5F, -5F, 7F);
		bodyModel[311].rotateAngleY = -3.14159265F;

		bodyModel[312].addBox(0.5F, 0F, -3F, 2, 6, 1, 0F); // Right seat part
		bodyModel[312].setRotationPoint(-19.5F, -5F, 7F);
		bodyModel[312].rotateAngleY = -3.14159265F;

		bodyModel[313].addBox(-1.5F, 0F, -2F, 5, 2, 4, 0F); // Right seat part
		bodyModel[313].setRotationPoint(-19.5F, -3F, 7F);
		bodyModel[313].rotateAngleY = -3.14159265F;

		bodyModel[314].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[314].setRotationPoint(-19.5F, -8F, 7F);
		bodyModel[314].rotateAngleY = -3.14159265F;

		bodyModel[315].addBox(-2.5F, 0F, -3F, 3, 5, 1, 0F); // Right seat part
		bodyModel[315].setRotationPoint(-19.5F, -4F, 7F);
		bodyModel[315].rotateAngleY = -3.14159265F;

		bodyModel[316].addShapeBox(-2.5F, 0F, -3F, 3, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[316].setRotationPoint(-19.5F, -5F, 7F);
		bodyModel[316].rotateAngleY = -3.14159265F;

		bodyModel[317].addBox(-2.5F, 0F, 2F, 3, 5, 1, 0F); // Right seat part
		bodyModel[317].setRotationPoint(-19.5F, -4F, 7F);
		bodyModel[317].rotateAngleY = -3.14159265F;

		bodyModel[318].addShapeBox(-2.5F, 0F, 2F, 3, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[318].setRotationPoint(-19.5F, -5F, 7F);
		bodyModel[318].rotateAngleY = -3.14159265F;

		bodyModel[319].addBox(0.5F, 0F, -3F, 2, 6, 1, 0F); // Left seat part
		bodyModel[319].setRotationPoint(-19.5F, -5F, -7F);
		bodyModel[319].rotateAngleY = -3.14159265F;

		bodyModel[320].addBox(0.5F, 0F, 2F, 2, 6, 1, 0F); // Left seat part
		bodyModel[320].setRotationPoint(-19.5F, -5F, -7F);
		bodyModel[320].rotateAngleY = -3.14159265F;

		bodyModel[321].addBox(-1.5F, 0F, -2F, 5, 2, 4, 0F); // Left seat part
		bodyModel[321].setRotationPoint(-19.5F, -3F, -7F);
		bodyModel[321].rotateAngleY = -3.14159265F;

		bodyModel[322].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[322].setRotationPoint(-19.5F, -8F, -7F);
		bodyModel[322].rotateAngleY = -3.14159265F;

		bodyModel[323].addBox(-2.5F, 0F, 2F, 3, 5, 1, 0F); // Left seat part
		bodyModel[323].setRotationPoint(-19.5F, -4F, -7F);
		bodyModel[323].rotateAngleY = -3.14159265F;

		bodyModel[324].addShapeBox(-2.5F, 0F, 2F, 3, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[324].setRotationPoint(-19.5F, -5F, -7F);
		bodyModel[324].rotateAngleY = -3.14159265F;

		bodyModel[325].addBox(-2.5F, 0F, -3F, 3, 5, 1, 0F); // Left seat part
		bodyModel[325].setRotationPoint(-19.5F, -4F, -7F);
		bodyModel[325].rotateAngleY = -3.14159265F;

		bodyModel[326].addShapeBox(-2.5F, 0F, -3F, 3, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[326].setRotationPoint(-19.5F, -5F, -7F);
		bodyModel[326].rotateAngleY = -3.14159265F;

		bodyModel[327].addBox(0.5F, 0F, 2F, 2, 6, 1, 0F); // Right seat part
		bodyModel[327].setRotationPoint(-9.5F, -5F, 7F);
		bodyModel[327].rotateAngleY = -3.14159265F;

		bodyModel[328].addBox(0.5F, 0F, -3F, 2, 6, 1, 0F); // Right seat part
		bodyModel[328].setRotationPoint(-9.5F, -5F, 7F);
		bodyModel[328].rotateAngleY = -3.14159265F;

		bodyModel[329].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[329].setRotationPoint(-9.5F, -8F, 7F);
		bodyModel[329].rotateAngleY = -3.14159265F;

		bodyModel[330].addBox(-2.5F, 0F, -3F, 3, 5, 1, 0F); // Right seat part
		bodyModel[330].setRotationPoint(-9.5F, -4F, 7F);
		bodyModel[330].rotateAngleY = -3.14159265F;

		bodyModel[331].addShapeBox(-2.5F, 0F, -3F, 3, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[331].setRotationPoint(-9.5F, -5F, 7F);
		bodyModel[331].rotateAngleY = -3.14159265F;

		bodyModel[332].addBox(-2.5F, 0F, 2F, 3, 5, 1, 0F); // Right seat part
		bodyModel[332].setRotationPoint(-9.5F, -4F, 7F);
		bodyModel[332].rotateAngleY = -3.14159265F;

		bodyModel[333].addShapeBox(-2.5F, 0F, 2F, 3, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[333].setRotationPoint(-9.5F, -5F, 7F);
		bodyModel[333].rotateAngleY = -3.14159265F;

		bodyModel[334].addBox(0.5F, 0F, -3F, 2, 6, 1, 0F); // Left seat part
		bodyModel[334].setRotationPoint(-9.5F, -5F, -7F);
		bodyModel[334].rotateAngleY = -3.14159265F;

		bodyModel[335].addBox(0.5F, 0F, 2F, 2, 6, 1, 0F); // Left seat part
		bodyModel[335].setRotationPoint(-9.5F, -5F, -7F);
		bodyModel[335].rotateAngleY = -3.14159265F;

		bodyModel[336].addBox(-1.5F, 0F, -2F, 5, 2, 4, 0F); // Left seat part
		bodyModel[336].setRotationPoint(-9.5F, -3F, -7F);
		bodyModel[336].rotateAngleY = -3.14159265F;

		bodyModel[337].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[337].setRotationPoint(-9.5F, -8F, -7F);
		bodyModel[337].rotateAngleY = -3.14159265F;

		bodyModel[338].addBox(-2.5F, 0F, 2F, 3, 5, 1, 0F); // Left seat part
		bodyModel[338].setRotationPoint(-9.5F, -4F, -7F);
		bodyModel[338].rotateAngleY = -3.14159265F;

		bodyModel[339].addShapeBox(-2.5F, 0F, 2F, 3, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[339].setRotationPoint(-9.5F, -5F, -7F);
		bodyModel[339].rotateAngleY = -3.14159265F;

		bodyModel[340].addBox(-2.5F, 0F, -3F, 3, 5, 1, 0F); // Left seat part
		bodyModel[340].setRotationPoint(-9.5F, -4F, -7F);
		bodyModel[340].rotateAngleY = -3.14159265F;

		bodyModel[341].addShapeBox(-2.5F, 0F, -3F, 3, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[341].setRotationPoint(-9.5F, -5F, -7F);
		bodyModel[341].rotateAngleY = -3.14159265F;

		bodyModel[342].addShapeBox(-2.5F, 0F, -2F, 1, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Right seat part
		bodyModel[342].setRotationPoint(-19.5F, -3F, 7F);
		bodyModel[342].rotateAngleY = -3.14159265F;

		bodyModel[343].addShapeBox(-2.5F, 0F, -2F, 1, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Right seat part
		bodyModel[343].setRotationPoint(-9.5F, -3F, 7F);
		bodyModel[343].rotateAngleY = -3.14159265F;

		bodyModel[344].addShapeBox(-2.5F, 0F, -2F, 1, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Left seat part
		bodyModel[344].setRotationPoint(-29.5F, -3F, -7F);
		bodyModel[344].rotateAngleY = -3.14159265F;

		bodyModel[345].addShapeBox(-2.5F, 0F, -2F, 1, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Left seat part
		bodyModel[345].setRotationPoint(-19.5F, -3F, -7F);
		bodyModel[345].rotateAngleY = -3.14159265F;

		bodyModel[346].addShapeBox(-2.5F, 0F, -2F, 1, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Left seat part
		bodyModel[346].setRotationPoint(-9.5F, -3F, -7F);
		bodyModel[346].rotateAngleY = -3.14159265F;

		bodyModel[347].addBox(-1.5F, 0F, -2F, 5, 2, 4, 0F); // Right seat part
		bodyModel[347].setRotationPoint(-9.5F, -3F, 7F);
		bodyModel[347].rotateAngleY = -3.14159265F;

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

		bodyModel[366].addBox(0.5F, 0F, 2F, 2, 6, 1, 0F); // Right seat part
		bodyModel[366].setRotationPoint(10.5F, -5F, 7F);
		bodyModel[366].rotateAngleY = -3.14159265F;

		bodyModel[367].addBox(0.5F, 0F, -3F, 2, 6, 1, 0F); // Right seat part
		bodyModel[367].setRotationPoint(10.5F, -5F, 7F);
		bodyModel[367].rotateAngleY = -3.14159265F;

		bodyModel[368].addBox(-1.5F, 0F, -2F, 5, 2, 4, 0F); // Right seat part
		bodyModel[368].setRotationPoint(10.5F, -3F, 7F);
		bodyModel[368].rotateAngleY = -3.14159265F;

		bodyModel[369].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[369].setRotationPoint(10.5F, -8F, 7F);
		bodyModel[369].rotateAngleY = -3.14159265F;

		bodyModel[370].addBox(-2.5F, 0F, -3F, 3, 5, 1, 0F); // Right seat part
		bodyModel[370].setRotationPoint(10.5F, -4F, 7F);
		bodyModel[370].rotateAngleY = -3.14159265F;

		bodyModel[371].addShapeBox(-2.5F, 0F, -3F, 3, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[371].setRotationPoint(10.5F, -5F, 7F);
		bodyModel[371].rotateAngleY = -3.14159265F;

		bodyModel[372].addBox(-2.5F, 0F, 2F, 3, 5, 1, 0F); // Right seat part
		bodyModel[372].setRotationPoint(10.5F, -4F, 7F);
		bodyModel[372].rotateAngleY = -3.14159265F;

		bodyModel[373].addShapeBox(-2.5F, 0F, 2F, 3, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[373].setRotationPoint(10.5F, -5F, 7F);
		bodyModel[373].rotateAngleY = -3.14159265F;

		bodyModel[374].addBox(0.5F, 0F, -3F, 2, 6, 1, 0F); // Left seat part
		bodyModel[374].setRotationPoint(10.5F, -5F, -7F);
		bodyModel[374].rotateAngleY = -3.14159265F;

		bodyModel[375].addBox(0.5F, 0F, 2F, 2, 6, 1, 0F); // Left seat part
		bodyModel[375].setRotationPoint(10.5F, -5F, -7F);
		bodyModel[375].rotateAngleY = -3.14159265F;

		bodyModel[376].addBox(-1.5F, 0F, -2F, 5, 2, 4, 0F); // Left seat part
		bodyModel[376].setRotationPoint(10.5F, -3F, -7F);
		bodyModel[376].rotateAngleY = -3.14159265F;

		bodyModel[377].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[377].setRotationPoint(10.5F, -8F, -7F);
		bodyModel[377].rotateAngleY = -3.14159265F;

		bodyModel[378].addBox(-2.5F, 0F, 2F, 3, 5, 1, 0F); // Left seat part
		bodyModel[378].setRotationPoint(10.5F, -4F, -7F);
		bodyModel[378].rotateAngleY = -3.14159265F;

		bodyModel[379].addShapeBox(-2.5F, 0F, 2F, 3, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[379].setRotationPoint(10.5F, -5F, -7F);
		bodyModel[379].rotateAngleY = -3.14159265F;

		bodyModel[380].addBox(-2.5F, 0F, -3F, 3, 5, 1, 0F); // Left seat part
		bodyModel[380].setRotationPoint(10.5F, -4F, -7F);
		bodyModel[380].rotateAngleY = -3.14159265F;

		bodyModel[381].addShapeBox(-2.5F, 0F, -3F, 3, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[381].setRotationPoint(10.5F, -5F, -7F);
		bodyModel[381].rotateAngleY = -3.14159265F;

		bodyModel[382].addShapeBox(-2.5F, 0F, -2F, 1, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Right seat part
		bodyModel[382].setRotationPoint(10.5F, -3F, 7F);
		bodyModel[382].rotateAngleY = -3.14159265F;

		bodyModel[383].addShapeBox(-2.5F, 0F, -2F, 1, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Left seat part
		bodyModel[383].setRotationPoint(10.5F, -3F, -7F);
		bodyModel[383].rotateAngleY = -3.14159265F;

		bodyModel[384].addBox(0.5F, 0F, 2F, 2, 6, 1, 0F); // Right seat part
		bodyModel[384].setRotationPoint(20.5F, -5F, 7F);
		bodyModel[384].rotateAngleY = -3.14159265F;

		bodyModel[385].addBox(0.5F, 0F, -3F, 2, 6, 1, 0F); // Right seat part
		bodyModel[385].setRotationPoint(20.5F, -5F, 7F);
		bodyModel[385].rotateAngleY = -3.14159265F;

		bodyModel[386].addBox(-1.5F, 0F, -2F, 5, 2, 4, 0F); // Right seat part
		bodyModel[386].setRotationPoint(20.5F, -3F, 7F);
		bodyModel[386].rotateAngleY = -3.14159265F;

		bodyModel[387].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[387].setRotationPoint(20.5F, -8F, 7F);
		bodyModel[387].rotateAngleY = -3.14159265F;

		bodyModel[388].addBox(-2.5F, 0F, -3F, 3, 5, 1, 0F); // Right seat part
		bodyModel[388].setRotationPoint(20.5F, -4F, 7F);
		bodyModel[388].rotateAngleY = -3.14159265F;

		bodyModel[389].addShapeBox(-2.5F, 0F, -3F, 3, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[389].setRotationPoint(20.5F, -5F, 7F);
		bodyModel[389].rotateAngleY = -3.14159265F;

		bodyModel[390].addBox(-2.5F, 0F, 2F, 3, 5, 1, 0F); // Right seat part
		bodyModel[390].setRotationPoint(20.5F, -4F, 7F);
		bodyModel[390].rotateAngleY = -3.14159265F;

		bodyModel[391].addShapeBox(-2.5F, 0F, 2F, 3, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[391].setRotationPoint(20.5F, -5F, 7F);
		bodyModel[391].rotateAngleY = -3.14159265F;

		bodyModel[392].addBox(0.5F, 0F, -3F, 2, 6, 1, 0F); // Left seat part
		bodyModel[392].setRotationPoint(20.5F, -5F, -7F);
		bodyModel[392].rotateAngleY = -3.14159265F;

		bodyModel[393].addBox(0.5F, 0F, 2F, 2, 6, 1, 0F); // Left seat part
		bodyModel[393].setRotationPoint(20.5F, -5F, -7F);
		bodyModel[393].rotateAngleY = -3.14159265F;

		bodyModel[394].addBox(-1.5F, 0F, -2F, 5, 2, 4, 0F); // Left seat part
		bodyModel[394].setRotationPoint(20.5F, -3F, -7F);
		bodyModel[394].rotateAngleY = -3.14159265F;

		bodyModel[395].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[395].setRotationPoint(20.5F, -8F, -7F);
		bodyModel[395].rotateAngleY = -3.14159265F;

		bodyModel[396].addBox(-2.5F, 0F, 2F, 3, 5, 1, 0F); // Left seat part
		bodyModel[396].setRotationPoint(20.5F, -4F, -7F);
		bodyModel[396].rotateAngleY = -3.14159265F;

		bodyModel[397].addShapeBox(-2.5F, 0F, 2F, 3, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[397].setRotationPoint(20.5F, -5F, -7F);
		bodyModel[397].rotateAngleY = -3.14159265F;

		bodyModel[398].addBox(-2.5F, 0F, -3F, 3, 5, 1, 0F); // Left seat part
		bodyModel[398].setRotationPoint(20.5F, -4F, -7F);
		bodyModel[398].rotateAngleY = -3.14159265F;

		bodyModel[399].addShapeBox(-2.5F, 0F, -3F, 3, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[399].setRotationPoint(20.5F, -5F, -7F);
		bodyModel[399].rotateAngleY = -3.14159265F;

		bodyModel[400].addShapeBox(-2.5F, 0F, -2F, 1, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Right seat part
		bodyModel[400].setRotationPoint(20.5F, -3F, 7F);
		bodyModel[400].rotateAngleY = -3.14159265F;

		bodyModel[401].addShapeBox(-2.5F, 0F, -2F, 1, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Left seat part
		bodyModel[401].setRotationPoint(20.5F, -3F, -7F);
		bodyModel[401].rotateAngleY = -3.14159265F;

		bodyModel[402].addBox(0.5F, 0F, 2F, 2, 6, 1, 0F); // Right seat part
		bodyModel[402].setRotationPoint(30.5F, -5F, 7F);
		bodyModel[402].rotateAngleY = -3.14159265F;

		bodyModel[403].addBox(0.5F, 0F, -3F, 2, 6, 1, 0F); // Right seat part
		bodyModel[403].setRotationPoint(30.5F, -5F, 7F);
		bodyModel[403].rotateAngleY = -3.14159265F;

		bodyModel[404].addBox(-1.5F, 0F, -2F, 5, 2, 4, 0F); // Right seat part
		bodyModel[404].setRotationPoint(30.5F, -3F, 7F);
		bodyModel[404].rotateAngleY = -3.14159265F;

		bodyModel[405].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[405].setRotationPoint(30.5F, -8F, 7F);
		bodyModel[405].rotateAngleY = -3.14159265F;

		bodyModel[406].addBox(-2.5F, 0F, -3F, 3, 5, 1, 0F); // Right seat part
		bodyModel[406].setRotationPoint(30.5F, -4F, 7F);
		bodyModel[406].rotateAngleY = -3.14159265F;

		bodyModel[407].addShapeBox(-2.5F, 0F, -3F, 3, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[407].setRotationPoint(30.5F, -5F, 7F);
		bodyModel[407].rotateAngleY = -3.14159265F;

		bodyModel[408].addBox(-2.5F, 0F, 2F, 3, 5, 1, 0F); // Right seat part
		bodyModel[408].setRotationPoint(30.5F, -4F, 7F);
		bodyModel[408].rotateAngleY = -3.14159265F;

		bodyModel[409].addShapeBox(-2.5F, 0F, 2F, 3, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[409].setRotationPoint(30.5F, -5F, 7F);
		bodyModel[409].rotateAngleY = -3.14159265F;

		bodyModel[410].addBox(0.5F, 0F, -3F, 2, 6, 1, 0F); // Left seat part
		bodyModel[410].setRotationPoint(30.5F, -5F, -7F);
		bodyModel[410].rotateAngleY = -3.14159265F;

		bodyModel[411].addBox(0.5F, 0F, 2F, 2, 6, 1, 0F); // Left seat part
		bodyModel[411].setRotationPoint(30.5F, -5F, -7F);
		bodyModel[411].rotateAngleY = -3.14159265F;

		bodyModel[412].addBox(-1.5F, 0F, -2F, 5, 2, 4, 0F); // Left seat part
		bodyModel[412].setRotationPoint(30.5F, -3F, -7F);
		bodyModel[412].rotateAngleY = -3.14159265F;

		bodyModel[413].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[413].setRotationPoint(30.5F, -8F, -7F);
		bodyModel[413].rotateAngleY = -3.14159265F;

		bodyModel[414].addBox(-2.5F, 0F, 2F, 3, 5, 1, 0F); // Left seat part
		bodyModel[414].setRotationPoint(30.5F, -4F, -7F);
		bodyModel[414].rotateAngleY = -3.14159265F;

		bodyModel[415].addShapeBox(-2.5F, 0F, 2F, 3, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[415].setRotationPoint(30.5F, -5F, -7F);
		bodyModel[415].rotateAngleY = -3.14159265F;

		bodyModel[416].addBox(-2.5F, 0F, -3F, 3, 5, 1, 0F); // Left seat part
		bodyModel[416].setRotationPoint(30.5F, -4F, -7F);
		bodyModel[416].rotateAngleY = -3.14159265F;

		bodyModel[417].addShapeBox(-2.5F, 0F, -3F, 3, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[417].setRotationPoint(30.5F, -5F, -7F);
		bodyModel[417].rotateAngleY = -3.14159265F;

		bodyModel[418].addShapeBox(-2.5F, 0F, -2F, 1, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Right seat part
		bodyModel[418].setRotationPoint(30.5F, -3F, 7F);
		bodyModel[418].rotateAngleY = -3.14159265F;

		bodyModel[419].addShapeBox(-2.5F, 0F, -2F, 1, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Left seat part
		bodyModel[419].setRotationPoint(30.5F, -3F, -7F);
		bodyModel[419].rotateAngleY = -3.14159265F;

		bodyModel[420].addBox(0F, 0F, 0F, 1, 16, 16, 0F); // Box 38
		bodyModel[420].setRotationPoint(42F, -15F, -6F);

		bodyModel[421].addBox(0F, 0F, 0F, 1, 16, 16, 0F); // Box 38
		bodyModel[421].setRotationPoint(51F, -15F, -6F);

		bodyModel[422].addBox(0F, 0F, 0F, 3, 16, 1, 0F); // Box 38
		bodyModel[422].setRotationPoint(43F, -15F, -6F);

		bodyModel[423].addShapeBox(0F, 0F, 0F, 4, 16, 1, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F); // Box 38
		bodyModel[423].setRotationPoint(52F, -15F, 1F);

		bodyModel[424].addShapeBox(0F, 0F, 0F, 2, 16, 5, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[424].setRotationPoint(37F, -15F, -10F);

		bodyModel[425].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 38 glow
		bodyModel[425].setRotationPoint(39F, -15F, -3F);

		bodyModel[426].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 38 glow
		bodyModel[426].setRotationPoint(-45F, -15F, -0.5F);

		bodyModel[427].addBox(0F, 0F, 0F, 2, 16, 3, 0F); // Box 38
		bodyModel[427].setRotationPoint(43F, -15F, -5F);

		bodyModel[428].addBox(0F, 0F, 0F, 2, 16, 1, 0F); // Box 38
		bodyModel[428].setRotationPoint(49F, -15F, -6F);

		bodyModel[429].addBox(0F, 0F, 0F, 3, 2, 1, 0F); // Box 38
		bodyModel[429].setRotationPoint(46F, -15F, -6F);

		bodyModel[430].addShapeBox(0F, 0F, 0F, 6, 13, 0, 0F,0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[430].setRotationPoint(46F, -13F, -5.5F);

		bodyModel[431].addShapeBox(0F, 0F, 0F, 1, 16, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[431].setRotationPoint(55F, -15F, -10F);

		bodyModel[432].addShapeBox(0F, 0F, 0F, 2, 2, 12, 0F,0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 526
		bodyModel[432].setRotationPoint(44F, -3F, -2F);

		bodyModel[433].addShapeBox(0F, 0F, 0F, 1, 4, 12, 0F,0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 527
		bodyModel[433].setRotationPoint(43.5F, -6F, -1.75F);

		bodyModel[434].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 528
		bodyModel[434].setRotationPoint(43.5F, -4.5F, 9.5F);

		bodyModel[435].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 529
		bodyModel[435].setRotationPoint(43.5F, -4.5F, -2F);

		bodyModel[436].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, -0.5F, 0.5F, -0.5F); // Box 530
		bodyModel[436].setRotationPoint(44.75F, -4.5F, 9.5F);

		bodyModel[437].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, -0.5F, 0.5F, -0.5F); // Box 531
		bodyModel[437].setRotationPoint(44.75F, -4.5F, -2.01F);

		bodyModel[438].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 532
		bodyModel[438].setRotationPoint(43.5F, -2.5F, -2F);

		bodyModel[439].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, -0.5F, 0.5F, -0.5F); // Box 533
		bodyModel[439].setRotationPoint(43F, -1.5F, 9.5F);

		bodyModel[440].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, -0.5F, 0.5F, -0.5F); // Box 534
		bodyModel[440].setRotationPoint(43F, -1.5F, -2F);

		bodyModel[441].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, -0.5F, 0.5F, -0.5F); // Box 531
		bodyModel[441].setRotationPoint(44.75F, -1.5F, 1.75F);

		bodyModel[442].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, -0.5F, 0.5F, -0.5F); // Box 531
		bodyModel[442].setRotationPoint(44.75F, -1.5F, 5.75F);

		bodyModel[443].addShapeBox(0F, 0F, 0F, 2, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[443].setRotationPoint(49F, -6F, -5F);

		bodyModel[444].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 38
		bodyModel[444].setRotationPoint(49F, -6F, -4F);

		bodyModel[445].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[445].setRotationPoint(50F, -6F, -4F);

		bodyModel[446].addShapeBox(0F, 0F, 0F, 2, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[446].setRotationPoint(49F, -6F, 9F);

		bodyModel[447].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[447].setRotationPoint(49F, -6F, 8F);

		bodyModel[448].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[448].setRotationPoint(50F, -6F, 8F);

		bodyModel[449].addShapeBox(0F, 0F, 0F, 1, 7, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[449].setRotationPoint(50F, -6F, -1F);

		bodyModel[450].addShapeBox(0F, 0F, 0F, 2, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[450].setRotationPoint(46.5F, -3F, 8F);

		bodyModel[451].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F); // Box 38
		bodyModel[451].setRotationPoint(54.07F, -2F, 6.57F);
		bodyModel[451].rotateAngleY = 0.78539816F;

		bodyModel[452].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Box 38
		bodyModel[452].setRotationPoint(54.25F, -1F, 7.45F);
		bodyModel[452].rotateAngleY = 0.78539816F;

		bodyModel[453].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F); // Box 38
		bodyModel[453].setRotationPoint(54.25F, 0.5F, 6.75F);
		bodyModel[453].rotateAngleY = 0.78539816F;

		bodyModel[454].addShapeBox(0F, 0F, 0F, 6, 6, 0, 0F,0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Conductor's scissor gate
		bodyModel[454].setRotationPoint(38F, -5F, 3.5F);

		bodyModel[455].addBox(0F, 0F, 0F, 1, 16, 1, 0F); // Box 38
		bodyModel[455].setRotationPoint(37F, -15F, 3F);

		bodyModel[456].addBox(0F, 0F, 0F, 1, 16, 1, 0F); // Box 38
		bodyModel[456].setRotationPoint(41F, -15F, 3F);

		bodyModel[457].addBox(0F, 0F, 0F, 3, 14, 1, 0F); // Box 38
		bodyModel[457].setRotationPoint(46F, -13F, -6F);

		bodyModel[458].addShapeBox(-0.5F, 0F, -0.5F, 1, 16, 1, 0F,-0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F); // Box 264
		bodyModel[458].setRotationPoint(37.6F, -15F, 4.75F);
		bodyModel[458].rotateAngleY = -0.78539816F;

		bodyModel[459].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 38
		bodyModel[459].setRotationPoint(37F, -5F, 5.5F);

		bodyModel[460].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 128
		bodyModel[460].setRotationPoint(39F, -3.5F, 6.75F);

		bodyModel[461].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[461].setRotationPoint(41F, -6.5F, 6.75F);

		bodyModel[462].addShapeBox(-0.5F, 0F, -0.5F, 1, 4, 1, 0F,-0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F); // Box 128
		bodyModel[462].setRotationPoint(40.12F, -2.5F, 7.75F);
		bodyModel[462].rotateAngleY = -0.78539816F;

		bodyModel[463].addBox(0F, 0F, 0F, 5, 1, 7, 0F); // Box 38
		bodyModel[463].setRotationPoint(37F, -12F, 3F);

		bodyModel[464].addBox(0F, 0F, 0F, 5, 1, 7, 0F); // Box 38
		bodyModel[464].setRotationPoint(37F, -8F, 3F);

		bodyModel[465].addBox(0F, 0F, 0F, 5, 1, 7, 0F); // Box 38
		bodyModel[465].setRotationPoint(37F, -4F, 3F);

		bodyModel[466].addBox(0F, 0F, 0F, 1, 16, 16, 0F); // Box 38
		bodyModel[466].setRotationPoint(-47F, -15F, -10F);

		bodyModel[467].addBox(0F, 0F, 0F, 1, 16, 16, 0F); // Box 38
		bodyModel[467].setRotationPoint(-56F, -15F, -10F);

		bodyModel[468].addBox(0F, 0F, 0F, 8, 16, 1, 0F); // Box 38
		bodyModel[468].setRotationPoint(-55F, -15F, 5F);

		bodyModel[469].addShapeBox(0F, 0F, 0F, 4, 16, 1, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F); // Box 38
		bodyModel[469].setRotationPoint(-60F, -15F, -4F);

		bodyModel[470].addBox(0F, 0F, 0F, 4, 16, 1, 0F); // Box 38
		bodyModel[470].setRotationPoint(-46F, -15F, -4F);

		bodyModel[471].addShapeBox(0F, 0F, 0F, 1, 16, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[471].setRotationPoint(-60F, -15F, 6F);

		bodyModel[472].addShapeBox(0F, 0F, 0F, 2, 16, 4, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[472].setRotationPoint(-44F, -15F, 6F);

		bodyModel[473].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F); // Box 38
		bodyModel[473].setRotationPoint(-58.5F, -2F, -9.75F);
		bodyModel[473].rotateAngleY = 0.78539816F;

		bodyModel[474].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Box 38
		bodyModel[474].setRotationPoint(-58.85F, -1F, -9.4F);
		bodyModel[474].rotateAngleY = 0.78539816F;

		bodyModel[475].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F); // Box 38
		bodyModel[475].setRotationPoint(-58.5F, 0.5F, -9.75F);
		bodyModel[475].rotateAngleY = 0.78539816F;

		bodyModel[476].addShapeBox(0F, 0F, 0F, 2, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[476].setRotationPoint(-55F, -6F, -10F);

		bodyModel[477].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[477].setRotationPoint(-54F, -6F, -9F);

		bodyModel[478].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[478].setRotationPoint(-55F, -6F, -9F);

		bodyModel[479].addShapeBox(0F, 0F, 0F, 2, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[479].setRotationPoint(-55F, -6F, 4F);

		bodyModel[480].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[480].setRotationPoint(-54F, -6F, 3F);

		bodyModel[481].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[481].setRotationPoint(-55F, -6F, 3F);

		bodyModel[482].addShapeBox(0F, 0F, 0F, 1, 7, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[482].setRotationPoint(-55F, -6F, -1F);

		bodyModel[483].addShapeBox(0F, 0F, 0F, 2, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[483].setRotationPoint(-52.5F, -3F, -10F);

		bodyModel[484].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[484].setRotationPoint(-50F, -5F, 3F);

		bodyModel[485].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[485].setRotationPoint(-50F, -5F, -10F);

		bodyModel[486].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 128
		bodyModel[486].setRotationPoint(-49.5F, -3.5F, 1.37F);

		bodyModel[487].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 128
		bodyModel[487].setRotationPoint(-49.5F, -6.5F, 0.86F);

		bodyModel[488].addShapeBox(-0.5F, 0F, -0.5F, 1, 4, 1, 0F,-0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F); // Box 128
		bodyModel[488].setRotationPoint(-48.5F, -2.5F, 2.24F);
		bodyModel[488].rotateAngleY = -0.78539816F;

		bodyModel[489].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 128
		bodyModel[489].setRotationPoint(-49.5F, -3.5F, -8.37F);

		bodyModel[490].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 128
		bodyModel[490].setRotationPoint(-49.5F, -6.5F, -6.37F);

		bodyModel[491].addShapeBox(-0.5F, 0F, -0.5F, 1, 4, 1, 0F,-0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F); // Box 128
		bodyModel[491].setRotationPoint(-48.5F, -2.5F, -7.25F);
		bodyModel[491].rotateAngleY = -0.78539816F;

		bodyModel[492].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 527
		bodyModel[492].setRotationPoint(-47.5F, -6F, -4.5F);

		bodyModel[493].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 528
		bodyModel[493].setRotationPoint(-49.5F, -4F, -1F);

		bodyModel[494].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 529
		bodyModel[494].setRotationPoint(-49.5F, -4F, -5.01F);

		bodyModel[495].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 530
		bodyModel[495].setRotationPoint(-50.5F, -4F, -1F);

		bodyModel[496].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 531
		bodyModel[496].setRotationPoint(-50.5F, -4F, -5.01F);

		bodyModel[497].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 532
		bodyModel[497].setRotationPoint(-50.5F, -3F, -4.5F);

		bodyModel[498].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 533
		bodyModel[498].setRotationPoint(-48F, -2F, -1.5F);

		bodyModel[499].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 534
		bodyModel[499].setRotationPoint(-48F, -2F, -4.5F);
	}

	private void initbodyModel_2()
	{
		bodyModel[500] = new ModelRendererTurbo(this, 60, 259, textureX, textureY); // Box 528
		bodyModel[501] = new ModelRendererTurbo(this, 60, 262, textureX, textureY); // Box 528
		bodyModel[502] = new ModelRendererTurbo(this, 333, 300, textureX, textureY); // Box 515
		bodyModel[503] = new ModelRendererTurbo(this, 447, 299, textureX, textureY); // Box 38
		bodyModel[504] = new ModelRendererTurbo(this, 405, 280, textureX, textureY); // Box 526
		bodyModel[505] = new ModelRendererTurbo(this, 394, 268, textureX, textureY); // Box 527
		bodyModel[506] = new ModelRendererTurbo(this, 394, 277, textureX, textureY); // Box 528
		bodyModel[507] = new ModelRendererTurbo(this, 394, 286, textureX, textureY); // Box 529
		bodyModel[508] = new ModelRendererTurbo(this, 401, 277, textureX, textureY); // Box 530
		bodyModel[509] = new ModelRendererTurbo(this, 401, 286, textureX, textureY); // Box 531
		bodyModel[510] = new ModelRendererTurbo(this, 394, 280, textureX, textureY); // Box 532
		bodyModel[511] = new ModelRendererTurbo(this, 388, 293, textureX, textureY); // Box 533
		bodyModel[512] = new ModelRendererTurbo(this, 393, 293, textureX, textureY); // Box 534
		bodyModel[513] = new ModelRendererTurbo(this, 405, 259, textureX, textureY); // Box 526
		bodyModel[514] = new ModelRendererTurbo(this, 394, 247, textureX, textureY); // Box 527
		bodyModel[515] = new ModelRendererTurbo(this, 394, 256, textureX, textureY); // Box 528
		bodyModel[516] = new ModelRendererTurbo(this, 394, 265, textureX, textureY); // Box 529
		bodyModel[517] = new ModelRendererTurbo(this, 401, 256, textureX, textureY); // Box 530
		bodyModel[518] = new ModelRendererTurbo(this, 401, 265, textureX, textureY); // Box 531
		bodyModel[519] = new ModelRendererTurbo(this, 394, 259, textureX, textureY); // Box 532
		bodyModel[520] = new ModelRendererTurbo(this, 389, 259, textureX, textureY); // Box 533
		bodyModel[521] = new ModelRendererTurbo(this, 389, 268, textureX, textureY); // Box 534
		bodyModel[522] = new ModelRendererTurbo(this, 405, 238, textureX, textureY); // Box 526
		bodyModel[523] = new ModelRendererTurbo(this, 394, 226, textureX, textureY); // Box 527
		bodyModel[524] = new ModelRendererTurbo(this, 394, 235, textureX, textureY); // Box 528
		bodyModel[525] = new ModelRendererTurbo(this, 394, 244, textureX, textureY); // Box 529
		bodyModel[526] = new ModelRendererTurbo(this, 401, 235, textureX, textureY); // Box 530
		bodyModel[527] = new ModelRendererTurbo(this, 401, 244, textureX, textureY); // Box 531
		bodyModel[528] = new ModelRendererTurbo(this, 394, 238, textureX, textureY); // Box 532
		bodyModel[529] = new ModelRendererTurbo(this, 389, 238, textureX, textureY); // Box 533
		bodyModel[530] = new ModelRendererTurbo(this, 389, 247, textureX, textureY); // Box 534
		bodyModel[531] = new ModelRendererTurbo(this, 295, 10, textureX, textureY); // Box 275
		bodyModel[532] = new ModelRendererTurbo(this, 295, 7, textureX, textureY); // Box 275
		bodyModel[533] = new ModelRendererTurbo(this, 295, 4, textureX, textureY); // Box 275
		bodyModel[534] = new ModelRendererTurbo(this, 295, 1, textureX, textureY); // Box 275
		bodyModel[535] = new ModelRendererTurbo(this, 75, 11, textureX, textureY); // Box 549
		bodyModel[536] = new ModelRendererTurbo(this, 75, 14, textureX, textureY); // Box 550
		bodyModel[537] = new ModelRendererTurbo(this, 75, 17, textureX, textureY); // Box 551
		bodyModel[538] = new ModelRendererTurbo(this, 75, 20, textureX, textureY); // Box 552
		bodyModel[539] = new ModelRendererTurbo(this, 341, 48, textureX, textureY); // Right step part
		bodyModel[540] = new ModelRendererTurbo(this, 339, 45, textureX, textureY); // Right step part
		bodyModel[541] = new ModelRendererTurbo(this, 341, 54, textureX, textureY); // Right step part
		bodyModel[542] = new ModelRendererTurbo(this, 339, 51, textureX, textureY); // Right step part
		bodyModel[543] = new ModelRendererTurbo(this, 339, 63, textureX, textureY); // Right step part
		bodyModel[544] = new ModelRendererTurbo(this, 350, 50, textureX, textureY); // Box 142
		bodyModel[545] = new ModelRendererTurbo(this, 356, 47, textureX, textureY); // Right step part
		bodyModel[546] = new ModelRendererTurbo(this, 339, 57, textureX, textureY); // Right step part
		bodyModel[547] = new ModelRendererTurbo(this, 341, 60, textureX, textureY); // Right step part
		bodyModel[548] = new ModelRendererTurbo(this, 330, 50, textureX, textureY); // Box 142
		bodyModel[549] = new ModelRendererTurbo(this, 330, 47, textureX, textureY); // Right step part
		bodyModel[550] = new ModelRendererTurbo(this, 372, 48, textureX, textureY); // Box 550
		bodyModel[551] = new ModelRendererTurbo(this, 370, 45, textureX, textureY); // Box 551
		bodyModel[552] = new ModelRendererTurbo(this, 372, 54, textureX, textureY); // Box 552
		bodyModel[553] = new ModelRendererTurbo(this, 370, 51, textureX, textureY); // Box 553
		bodyModel[554] = new ModelRendererTurbo(this, 370, 63, textureX, textureY); // Box 554
		bodyModel[555] = new ModelRendererTurbo(this, 381, 49, textureX, textureY); // Box 555
		bodyModel[556] = new ModelRendererTurbo(this, 387, 46, textureX, textureY); // Box 556
		bodyModel[557] = new ModelRendererTurbo(this, 370, 57, textureX, textureY); // Box 557
		bodyModel[558] = new ModelRendererTurbo(this, 372, 60, textureX, textureY); // Box 558
		bodyModel[559] = new ModelRendererTurbo(this, 361, 50, textureX, textureY); // Box 559
		bodyModel[560] = new ModelRendererTurbo(this, 361, 47, textureX, textureY); // Box 560
		bodyModel[561] = new ModelRendererTurbo(this, 104, 328, textureX, textureY, "glow"); // Box 275 glow
		bodyModel[562] = new ModelRendererTurbo(this, 104, 325, textureX, textureY, "glow"); // Box 285 glow

		bodyModel[500].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 528
		bodyModel[500].setRotationPoint(-47.5F, -3.5F, -1.5F);

		bodyModel[501].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 528
		bodyModel[501].setRotationPoint(-47.5F, -3.5F, -4.5F);

		bodyModel[502].addShapeBox(0F, 0F, 0F, 2, 16, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 515
		bodyModel[502].setRotationPoint(37F, -15F, -10F);

		bodyModel[503].addShapeBox(0F, 0F, 0F, 1, 16, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 38
		bodyModel[503].setRotationPoint(54F, -15F, -10F);

		bodyModel[504].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 526
		bodyModel[504].setRotationPoint(44F, -3F, -4.25F);

		bodyModel[505].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 527
		bodyModel[505].setRotationPoint(43.5F, -6F, -4.25F);

		bodyModel[506].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 528
		bodyModel[506].setRotationPoint(43.5F, -4.5F, -0.75F);

		bodyModel[507].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 529
		bodyModel[507].setRotationPoint(43.5F, -4.5F, -4.75F);

		bodyModel[508].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, -0.5F, 0.5F, -0.5F); // Box 530
		bodyModel[508].setRotationPoint(44.75F, -4.5F, -0.75F);

		bodyModel[509].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, -0.5F, 0.5F, -0.5F); // Box 531
		bodyModel[509].setRotationPoint(44.75F, -4.5F, -4.75F);

		bodyModel[510].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 532
		bodyModel[510].setRotationPoint(43.5F, -2.5F, -4.25F);

		bodyModel[511].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 533
		bodyModel[511].setRotationPoint(43F, -4F, -0.75F);

		bodyModel[512].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 534
		bodyModel[512].setRotationPoint(43F, -4F, -4.75F);

		bodyModel[513].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 526
		bodyModel[513].setRotationPoint(44F, -3F, 0.75F);

		bodyModel[514].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 527
		bodyModel[514].setRotationPoint(43.5F, -6F, 0.75F);

		bodyModel[515].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 528
		bodyModel[515].setRotationPoint(43.5F, -4.5F, 4.25F);

		bodyModel[516].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 529
		bodyModel[516].setRotationPoint(43.5F, -4.5F, 0.25F);

		bodyModel[517].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, -0.5F, 0.5F, -0.5F); // Box 530
		bodyModel[517].setRotationPoint(44.75F, -4.5F, 4.25F);

		bodyModel[518].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, -0.5F, 0.5F, -0.5F); // Box 531
		bodyModel[518].setRotationPoint(44.75F, -4.5F, 0.25F);

		bodyModel[519].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 532
		bodyModel[519].setRotationPoint(43.5F, -2.5F, 0.75F);

		bodyModel[520].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 533
		bodyModel[520].setRotationPoint(43F, -4F, 4.25F);

		bodyModel[521].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 534
		bodyModel[521].setRotationPoint(43F, -4F, 0.25F);

		bodyModel[522].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 526
		bodyModel[522].setRotationPoint(44F, -3F, 5.75F);

		bodyModel[523].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 527
		bodyModel[523].setRotationPoint(43.5F, -6F, 5.75F);

		bodyModel[524].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 528
		bodyModel[524].setRotationPoint(43.5F, -4.5F, 9.25F);

		bodyModel[525].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 529
		bodyModel[525].setRotationPoint(43.5F, -4.5F, 5.25F);

		bodyModel[526].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, -0.5F, 0.5F, -0.5F); // Box 530
		bodyModel[526].setRotationPoint(44.75F, -4.5F, 9.25F);

		bodyModel[527].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, -0.5F, 0.5F, -0.5F); // Box 531
		bodyModel[527].setRotationPoint(44.75F, -4.5F, 5.25F);

		bodyModel[528].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 532
		bodyModel[528].setRotationPoint(43.5F, -2.5F, 5.75F);

		bodyModel[529].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 533
		bodyModel[529].setRotationPoint(43F, -4F, 9.25F);

		bodyModel[530].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 534
		bodyModel[530].setRotationPoint(43F, -4F, 5.25F);

		bodyModel[531].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.4F, -0.05F, 0.25F, -0.4F, -0.05F, 0.25F, -0.4F, -0.25F, -0.25F, -0.4F, -0.25F, -0.25F, -0.4F, -0.6F, 0F, -0.4F, -0.6F, 0F, -0.4F, -0.75F, -0.25F, -0.4F, -0.75F, -0.25F); // Box 275
		bodyModel[531].setRotationPoint(53F, -17.5F, 9.85F);

		bodyModel[532].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.25F, -0.25F, -0.4F, -0.25F, -0.25F, -0.36F, -0.15F, -0.25F, -0.36F, -0.15F, -0.25F, -0.35F, -0.15F, -0.17F, -0.35F, -0.15F, -0.17F); // Box 275
		bodyModel[532].setRotationPoint(53F, -17.5F, 9.85F);

		bodyModel[533].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.36F, 0F, 0F, -0.36F, 0F, 0F, -0.35F, 0F, -0.42F, -0.35F, 0F, -0.42F, -0.31F, -0.4F, -0.35F, -0.31F, -0.4F, -0.35F, -0.31F, -0.4F, -0.34F, -0.31F, -0.4F, -0.34F); // Box 275
		bodyModel[533].setRotationPoint(53F, -16.65F, 10.1F);

		bodyModel[534].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.31F, 0F, 0F, -0.31F, 0F, 0F, -0.31F, 0F, -0.69F, -0.31F, 0F, -0.69F, -0.25F, -0.3F, -0.4F, -0.25F, -0.3F, -0.4F, -0.25F, -0.3F, -0.6F, -0.25F, -0.3F, -0.6F); // Box 275
		bodyModel[534].setRotationPoint(53F, -16.05F, 10.45F);

		bodyModel[535].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.4F, -0.25F, -0.25F, -0.4F, -0.25F, -0.25F, -0.4F, -0.05F, 0.25F, -0.4F, -0.05F, 0.25F, -0.4F, -0.75F, -0.25F, -0.4F, -0.75F, -0.25F, -0.4F, -0.6F, 0F, -0.4F, -0.6F, 0F); // Box 549
		bodyModel[535].setRotationPoint(-58F, -17.5F, -10.85F);

		bodyModel[536].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.4F, -0.25F, -0.25F, -0.4F, -0.25F, -0.25F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.35F, -0.15F, -0.17F, -0.35F, -0.15F, -0.17F, -0.36F, -0.15F, -0.25F, -0.36F, -0.15F, -0.25F); // Box 550
		bodyModel[536].setRotationPoint(-58F, -17.5F, -10.85F);

		bodyModel[537].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.35F, 0F, -0.42F, -0.35F, 0F, -0.42F, -0.36F, 0F, 0F, -0.36F, 0F, 0F, -0.31F, -0.4F, -0.34F, -0.31F, -0.4F, -0.34F, -0.31F, -0.4F, -0.35F, -0.31F, -0.4F, -0.35F); // Box 551
		bodyModel[537].setRotationPoint(-58F, -16.65F, -11.1F);

		bodyModel[538].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.31F, 0F, -0.69F, -0.31F, 0F, -0.69F, -0.31F, 0F, 0F, -0.31F, 0F, 0F, -0.25F, -0.3F, -0.6F, -0.25F, -0.3F, -0.6F, -0.25F, -0.3F, -0.4F, -0.25F, -0.3F, -0.4F); // Box 552
		bodyModel[538].setRotationPoint(-58F, -16.05F, -11.45F);

		bodyModel[539].addShapeBox(0F, 2F, -2F, 4, 2, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.02F, -0.25F, 0F, -0.02F, -0.25F, 0F, 0F, -0.25F, 0F); // Right step part
		bodyModel[539].setRotationPoint(57.01F, 0.75F, 8.5F);

		bodyModel[540].addShapeBox(0F, 2F, -2F, 4, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Right step part
		bodyModel[540].setRotationPoint(57F, 0.75F, 7F);

		bodyModel[541].addShapeBox(0F, 0F, 0F, 4, 2, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.02F, -0.25F, 0F, -0.02F, -0.25F, 0F, 0F, -0.25F, 0F); // Right step part
		bodyModel[541].setRotationPoint(57.01F, 4.5F, 8F);

		bodyModel[542].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, -0.5F, 0F, 0F, -0.5F); // Right step part
		bodyModel[542].setRotationPoint(57.01F, 4.5F, 6.5F);

		bodyModel[543].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, -0.5F, 0F, 0F, -0.5F); // Right step part
		bodyModel[543].setRotationPoint(57.01F, 8F, 9.5F);

		bodyModel[544].addShapeBox(0F, 0F, 0F, 0, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -4.5F, 0F, 0F, -4.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 142
		bodyModel[544].setRotationPoint(60.99F, 3F, 5F);

		bodyModel[545].addShapeBox(0F, 0F, 0F, 0, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Right step part
		bodyModel[545].setRotationPoint(60.99F, 3F, 9.5F);

		bodyModel[546].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, -0.5F, 0F, 0F, -0.5F); // Right step part
		bodyModel[546].setRotationPoint(57.01F, 6.25F, 8F);

		bodyModel[547].addShapeBox(0F, 0F, 0F, 4, 2, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.02F, -0.25F, 0F, -0.02F, -0.25F, 0F, 0F, -0.25F, 0F); // Right step part
		bodyModel[547].setRotationPoint(57.01F, 6.25F, 9.5F);

		bodyModel[548].addShapeBox(0F, 0F, 0F, 0, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -4.5F, 0F, 0F, -4.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 142
		bodyModel[548].setRotationPoint(57.01F, 3F, 5F);

		bodyModel[549].addShapeBox(0F, 0F, 0F, 0, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Right step part
		bodyModel[549].setRotationPoint(57.01F, 3F, 9.5F);

		bodyModel[550].addShapeBox(0F, 2F, -2F, 4, 2, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.02F, -0.25F, 0F, -0.02F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 550
		bodyModel[550].setRotationPoint(57.01F, 0.75F, -4.5F);

		bodyModel[551].addShapeBox(0F, 2F, -2F, 4, 0, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 551
		bodyModel[551].setRotationPoint(57F, 0.75F, -5F);

		bodyModel[552].addShapeBox(0F, 0F, 0F, 4, 2, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.02F, -0.25F, 0F, -0.02F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 552
		bodyModel[552].setRotationPoint(57.01F, 4.5F, -8F);

		bodyModel[553].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, -0.5F, -0.02F, 0F, -0.5F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.02F, 0F, -0.5F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Box 553
		bodyModel[553].setRotationPoint(57.01F, 4.5F, -8.5F);

		bodyModel[554].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, -0.5F, -0.02F, 0F, -0.5F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.02F, 0F, -0.5F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Box 554
		bodyModel[554].setRotationPoint(57.01F, 8F, -11.5F);

		bodyModel[555].addShapeBox(0F, 0F, 0F, 0, 5, 5, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -4.5F, 0F, 0F, -4.5F); // Box 555
		bodyModel[555].setRotationPoint(60.99F, 3F, -10F);

		bodyModel[556].addShapeBox(0F, 0F, 0F, 0, 5, 2, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 556
		bodyModel[556].setRotationPoint(60.99F, 3F, -11.5F);

		bodyModel[557].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, -0.5F, -0.02F, 0F, -0.5F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.02F, 0F, -0.5F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Box 557
		bodyModel[557].setRotationPoint(57.01F, 6.25F, -10F);

		bodyModel[558].addShapeBox(0F, 0F, 0F, 4, 2, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.02F, -0.25F, 0F, -0.02F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 558
		bodyModel[558].setRotationPoint(57.01F, 6.25F, -9.5F);

		bodyModel[559].addShapeBox(0F, 0F, 0F, 0, 5, 5, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -4.5F, 0F, 0F, -4.5F); // Box 559
		bodyModel[559].setRotationPoint(57.01F, 3F, -10F);

		bodyModel[560].addShapeBox(0F, 0F, 0F, 0, 5, 2, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 560
		bodyModel[560].setRotationPoint(57.01F, 3F, -11.5F);

		bodyModel[561].addBox(0F, 0F, 0F, 77, 0, 2, 0F); // Box 275 glow
		bodyModel[561].setRotationPoint(-41F, -12.99F, -9F);

		bodyModel[562].addBox(0F, 0F, 0F, 77, 0, 2, 0F); // Box 285 glow
		bodyModel[562].setRotationPoint(-41F, -12.99F, 7F);
	}
	ModelPS_Truck bogie1 = new ModelPS_Truck();
	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		for(int i = 0; i < 563; i++)
		{
			if (bodyModel[i].boxName != null && bodyModel[i].boxName.contains("glow")) {
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
		if(entity instanceof AbstractTrains && AbstractTrains.getColorFromString(((AbstractTrains) entity).getColor())==123456){
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