//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2021 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: E8-9a
// Model Creator: Bidahochi
// Created on: 22.06.2020 - 11:10:51
// Last changed on: 22.06.2020 - 11:10:51

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

import java.util.ArrayList;

public class ModelEMDE7B extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 256;

	public ModelEMDE7B() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[348];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 231, 77, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 197, 101, textureX, textureY); // Box 1
		bodyModel[2] = new ModelRendererTurbo(this, 274, 160, textureX, textureY); // Box 1
		bodyModel[3] = new ModelRendererTurbo(this, 290, 158, textureX, textureY); // Box 1
		bodyModel[4] = new ModelRendererTurbo(this, 267, 146, textureX, textureY); // Box 1
		bodyModel[5] = new ModelRendererTurbo(this, 268, 146, textureX, textureY); // Box 1
		bodyModel[6] = new ModelRendererTurbo(this, 290, 146, textureX, textureY); // Box 1
		bodyModel[7] = new ModelRendererTurbo(this, 267, 109, textureX, textureY); // Box 0
		bodyModel[8] = new ModelRendererTurbo(this, 86, 23, textureX, textureY); // Box 0
		bodyModel[9] = new ModelRendererTurbo(this, 84, 15, textureX, textureY); // Box 0
		bodyModel[10] = new ModelRendererTurbo(this, 86, 9, textureX, textureY); // Box 0
		bodyModel[11] = new ModelRendererTurbo(this, 87, 29, textureX, textureY); // Box 0
		bodyModel[12] = new ModelRendererTurbo(this, 87, 4, textureX, textureY); // Box 0
		bodyModel[13] = new ModelRendererTurbo(this, 89, 34, textureX, textureY); // Box 0
		bodyModel[14] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 0
		bodyModel[15] = new ModelRendererTurbo(this, 256, 110, textureX, textureY); // Box 0
		bodyModel[16] = new ModelRendererTurbo(this, 264, 102, textureX, textureY); // Box 0
		bodyModel[17] = new ModelRendererTurbo(this, 261, 118, textureX, textureY); // Box 0
		bodyModel[18] = new ModelRendererTurbo(this, 273, 118, textureX, textureY); // Box 0
		bodyModel[19] = new ModelRendererTurbo(this, 259, 112, textureX, textureY); // Box 0
		bodyModel[20] = new ModelRendererTurbo(this, 273, 112, textureX, textureY); // Box 0
		bodyModel[21] = new ModelRendererTurbo(this, 270, 226, textureX, textureY); // Box 123
		bodyModel[22] = new ModelRendererTurbo(this, 261, 226, textureX, textureY); // Box 254
		bodyModel[23] = new ModelRendererTurbo(this, 270, 222, textureX, textureY); // Box 255
		bodyModel[24] = new ModelRendererTurbo(this, 319, 226, textureX, textureY); // Box 136
		bodyModel[25] = new ModelRendererTurbo(this, 261, 222, textureX, textureY); // Box 137
		bodyModel[26] = new ModelRendererTurbo(this, 319, 222, textureX, textureY); // Box 138
		bodyModel[27] = new ModelRendererTurbo(this, 160, 151, textureX, textureY); // Box 160
		bodyModel[28] = new ModelRendererTurbo(this, 410, 151, textureX, textureY); // Box 161
		bodyModel[29] = new ModelRendererTurbo(this, 325, 151, textureX, textureY); // Box 191
		bodyModel[30] = new ModelRendererTurbo(this, 250, 151, textureX, textureY); // Box 192
		bodyModel[31] = new ModelRendererTurbo(this, 191, 147, textureX, textureY); // Box 198
		bodyModel[32] = new ModelRendererTurbo(this, 191, 147, textureX, textureY); // Box 199
		bodyModel[33] = new ModelRendererTurbo(this, 392, 146, textureX, textureY); // Box 200
		bodyModel[34] = new ModelRendererTurbo(this, 392, 146, textureX, textureY); // Box 201
		bodyModel[35] = new ModelRendererTurbo(this, 253, 4, textureX, textureY); // Box 202
		bodyModel[36] = new ModelRendererTurbo(this, 264, 4, textureX, textureY); // Box 203
		bodyModel[37] = new ModelRendererTurbo(this, 413, 60, textureX, textureY); // Box 314
		bodyModel[38] = new ModelRendererTurbo(this, 420, 60, textureX, textureY); // Box 316
		bodyModel[39] = new ModelRendererTurbo(this, 273, 2, textureX, textureY); // Box 231
		bodyModel[40] = new ModelRendererTurbo(this, 384, 69, textureX, textureY, "glow"); // Box 247 headlight rear left
		bodyModel[41] = new ModelRendererTurbo(this, 312, 143, textureX, textureY); // Box 222
		bodyModel[42] = new ModelRendererTurbo(this, 301, 143, textureX, textureY); // Box 223
		bodyModel[43] = new ModelRendererTurbo(this, 263, 201, textureX, textureY); // Box 438
		bodyModel[44] = new ModelRendererTurbo(this, 263, 201, textureX, textureY); // Box 439
		bodyModel[45] = new ModelRendererTurbo(this, 293, 99, textureX, textureY); // Box 441
		bodyModel[46] = new ModelRendererTurbo(this, 384, 64, textureX, textureY, "glow"); // Box 418 headlight rear right
		bodyModel[47] = new ModelRendererTurbo(this, 392, 57, textureX, textureY); // Box 443
		bodyModel[48] = new ModelRendererTurbo(this, 397, 57, textureX, textureY); // Box 444
		bodyModel[49] = new ModelRendererTurbo(this, 409, 50, textureX, textureY); // Box 445
		bodyModel[50] = new ModelRendererTurbo(this, 363, 58, textureX, textureY); // Box 128
		bodyModel[51] = new ModelRendererTurbo(this, 371, 56, textureX, textureY); // Box 153
		bodyModel[52] = new ModelRendererTurbo(this, 371, 66, textureX, textureY); // Box 448
		bodyModel[53] = new ModelRendererTurbo(this, 402, 57, textureX, textureY); // Box 452 some door that magically vibes in the back
		bodyModel[54] = new ModelRendererTurbo(this, 379, 51, textureX, textureY); // Box 453
		bodyModel[55] = new ModelRendererTurbo(this, 379, 56, textureX, textureY); // Box 454
		bodyModel[56] = new ModelRendererTurbo(this, 360, 65, textureX, textureY); // Box 455
		bodyModel[57] = new ModelRendererTurbo(this, 422, 237, textureX, textureY); // Box 0
		bodyModel[58] = new ModelRendererTurbo(this, 422, 222, textureX, textureY); // Box 2
		bodyModel[59] = new ModelRendererTurbo(this, 422, 192, textureX, textureY); // Box 3
		bodyModel[60] = new ModelRendererTurbo(this, 422, 176, textureX, textureY); // Box 4
		bodyModel[61] = new ModelRendererTurbo(this, 430, 169, textureX, textureY); // Box 5
		bodyModel[62] = new ModelRendererTurbo(this, 430, 155, textureX, textureY); // Box 6
		bodyModel[63] = new ModelRendererTurbo(this, 430, 162, textureX, textureY); // Box 7
		bodyModel[64] = new ModelRendererTurbo(this, 396, 204, textureX, textureY); // Box 10
		bodyModel[65] = new ModelRendererTurbo(this, 407, 204, textureX, textureY); // Box 11
		bodyModel[66] = new ModelRendererTurbo(this, 385, 204, textureX, textureY); // Box 12
		bodyModel[67] = new ModelRendererTurbo(this, 394, 213, textureX, textureY); // Box 13
		bodyModel[68] = new ModelRendererTurbo(this, 381, 189, textureX, textureY); // Box 14
		bodyModel[69] = new ModelRendererTurbo(this, 422, 208, textureX, textureY); // Box 3
		bodyModel[70] = new ModelRendererTurbo(this, 397, 187, textureX, textureY); // Box 9
		bodyModel[71] = new ModelRendererTurbo(this, 392, 182, textureX, textureY); // Box 21
		bodyModel[72] = new ModelRendererTurbo(this, 370, 210, textureX, textureY); // Box 10
		bodyModel[73] = new ModelRendererTurbo(this, 370, 210, textureX, textureY); // Box 10
		bodyModel[74] = new ModelRendererTurbo(this, 422, 237, textureX, textureY); // Box 0
		bodyModel[75] = new ModelRendererTurbo(this, 422, 222, textureX, textureY); // Box 2
		bodyModel[76] = new ModelRendererTurbo(this, 422, 192, textureX, textureY); // Box 3
		bodyModel[77] = new ModelRendererTurbo(this, 422, 176, textureX, textureY); // Box 4
		bodyModel[78] = new ModelRendererTurbo(this, 430, 169, textureX, textureY); // Box 5
		bodyModel[79] = new ModelRendererTurbo(this, 430, 155, textureX, textureY); // Box 6
		bodyModel[80] = new ModelRendererTurbo(this, 430, 162, textureX, textureY); // Box 7
		bodyModel[81] = new ModelRendererTurbo(this, 396, 204, textureX, textureY); // Box 10
		bodyModel[82] = new ModelRendererTurbo(this, 385, 204, textureX, textureY); // Box 12
		bodyModel[83] = new ModelRendererTurbo(this, 394, 213, textureX, textureY); // Box 13
		bodyModel[84] = new ModelRendererTurbo(this, 381, 189, textureX, textureY); // Box 14
		bodyModel[85] = new ModelRendererTurbo(this, 422, 208, textureX, textureY); // Box 3
		bodyModel[86] = new ModelRendererTurbo(this, 397, 187, textureX, textureY); // Box 9
		bodyModel[87] = new ModelRendererTurbo(this, 392, 182, textureX, textureY); // Box 21
		bodyModel[88] = new ModelRendererTurbo(this, 370, 210, textureX, textureY); // Box 10
		bodyModel[89] = new ModelRendererTurbo(this, 370, 210, textureX, textureY); // Box 10
		bodyModel[90] = new ModelRendererTurbo(this, 379, 236, textureX, textureY); // Box 110
		bodyModel[91] = new ModelRendererTurbo(this, 369, 230, textureX, textureY); // Box 111
		bodyModel[92] = new ModelRendererTurbo(this, 384, 229, textureX, textureY); // Box 112
		bodyModel[93] = new ModelRendererTurbo(this, 401, 230, textureX, textureY); // Box 113
		bodyModel[94] = new ModelRendererTurbo(this, 401, 249, textureX, textureY); // Box 114
		bodyModel[95] = new ModelRendererTurbo(this, 384, 248, textureX, textureY); // Box 115
		bodyModel[96] = new ModelRendererTurbo(this, 407, 239, textureX, textureY); // Box 522
		bodyModel[97] = new ModelRendererTurbo(this, 374, 222, textureX, textureY); // Box 523
		bodyModel[98] = new ModelRendererTurbo(this, 385, 225, textureX, textureY); // Box 255
		bodyModel[99] = new ModelRendererTurbo(this, 385, 221, textureX, textureY); // Box 256
		bodyModel[100] = new ModelRendererTurbo(this, 407, 204, textureX, textureY); // Box 11
		bodyModel[101] = new ModelRendererTurbo(this, 369, 249, textureX, textureY); // Box 116
		bodyModel[102] = new ModelRendererTurbo(this, 379, 236, textureX, textureY); // Box 110
		bodyModel[103] = new ModelRendererTurbo(this, 369, 230, textureX, textureY); // Box 111
		bodyModel[104] = new ModelRendererTurbo(this, 384, 229, textureX, textureY); // Box 112
		bodyModel[105] = new ModelRendererTurbo(this, 401, 230, textureX, textureY); // Box 113
		bodyModel[106] = new ModelRendererTurbo(this, 401, 249, textureX, textureY); // Box 114
		bodyModel[107] = new ModelRendererTurbo(this, 384, 248, textureX, textureY); // Box 115
		bodyModel[108] = new ModelRendererTurbo(this, 407, 239, textureX, textureY); // Box 522
		bodyModel[109] = new ModelRendererTurbo(this, 374, 222, textureX, textureY); // Box 523
		bodyModel[110] = new ModelRendererTurbo(this, 385, 225, textureX, textureY); // Box 255
		bodyModel[111] = new ModelRendererTurbo(this, 385, 221, textureX, textureY); // Box 256
		bodyModel[112] = new ModelRendererTurbo(this, 369, 249, textureX, textureY); // Box 116
		bodyModel[113] = new ModelRendererTurbo(this, 303, 197, textureX, textureY); // Box 42
		bodyModel[114] = new ModelRendererTurbo(this, 278, 211, textureX, textureY); // Box 44
		bodyModel[115] = new ModelRendererTurbo(this, 308, 177, textureX, textureY); // Box 324
		bodyModel[116] = new ModelRendererTurbo(this, 278, 205, textureX, textureY); // Box 325
		bodyModel[117] = new ModelRendererTurbo(this, 307, 158, textureX, textureY); // Box 324
		bodyModel[118] = new ModelRendererTurbo(this, 320, 183, textureX, textureY); // Box 324
		bodyModel[119] = new ModelRendererTurbo(this, 287, 174, textureX, textureY); // Box 324
		bodyModel[120] = new ModelRendererTurbo(this, 320, 183, textureX, textureY); // Box 324
		bodyModel[121] = new ModelRendererTurbo(this, 317, 183, textureX, textureY); // Box 324
		bodyModel[122] = new ModelRendererTurbo(this, 317, 183, textureX, textureY); // Box 324
		bodyModel[123] = new ModelRendererTurbo(this, 213, 99, textureX, textureY); // Box 1
		bodyModel[124] = new ModelRendererTurbo(this, 190, 87, textureX, textureY); // Box 1
		bodyModel[125] = new ModelRendererTurbo(this, 191, 89, textureX, textureY); // Box 1
		bodyModel[126] = new ModelRendererTurbo(this, 220, 91, textureX, textureY); // Box 1
		bodyModel[127] = new ModelRendererTurbo(this, 142, 71, textureX, textureY); // Box 0
		bodyModel[128] = new ModelRendererTurbo(this, 170, 72, textureX, textureY); // Box 0
		bodyModel[129] = new ModelRendererTurbo(this, 178, 64, textureX, textureY); // Box 0
		bodyModel[130] = new ModelRendererTurbo(this, 175, 80, textureX, textureY); // Box 0
		bodyModel[131] = new ModelRendererTurbo(this, 187, 80, textureX, textureY); // Box 0
		bodyModel[132] = new ModelRendererTurbo(this, 173, 74, textureX, textureY); // Box 0
		bodyModel[133] = new ModelRendererTurbo(this, 187, 74, textureX, textureY); // Box 0
		bodyModel[134] = new ModelRendererTurbo(this, 253, 4, textureX, textureY); // Box 202
		bodyModel[135] = new ModelRendererTurbo(this, 264, 4, textureX, textureY); // Box 203
		bodyModel[136] = new ModelRendererTurbo(this, 273, 2, textureX, textureY); // Box 231
		bodyModel[137] = new ModelRendererTurbo(this, 329, 69, textureX, textureY, "glow"); // Box 247 headlight rear left
		bodyModel[138] = new ModelRendererTurbo(this, 217, 88, textureX, textureY); // Box 222
		bodyModel[139] = new ModelRendererTurbo(this, 213, 82, textureX, textureY); // Box 223
		bodyModel[140] = new ModelRendererTurbo(this, 329, 64, textureX, textureY, "glow"); // Box 418 headlight rear right
		bodyModel[141] = new ModelRendererTurbo(this, 307, 57, textureX, textureY); // Box 452 some door that magically vibes in the back
		bodyModel[142] = new ModelRendererTurbo(this, 49, 23, textureX, textureY); // Box 0
		bodyModel[143] = new ModelRendererTurbo(this, 43, 15, textureX, textureY); // Box 0
		bodyModel[144] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 0
		bodyModel[145] = new ModelRendererTurbo(this, 52, 29, textureX, textureY); // Box 0
		bodyModel[146] = new ModelRendererTurbo(this, 52, 4, textureX, textureY); // Box 0
		bodyModel[147] = new ModelRendererTurbo(this, 58, 34, textureX, textureY); // Box 0
		bodyModel[148] = new ModelRendererTurbo(this, 58, 1, textureX, textureY); // Box 0
		bodyModel[149] = new ModelRendererTurbo(this, 191, 147, textureX, textureY); // Box 198
		bodyModel[150] = new ModelRendererTurbo(this, 191, 147, textureX, textureY); // Box 199
		bodyModel[151] = new ModelRendererTurbo(this, 392, 146, textureX, textureY); // Box 200
		bodyModel[152] = new ModelRendererTurbo(this, 392, 146, textureX, textureY); // Box 201
		bodyModel[153] = new ModelRendererTurbo(this, 300, 60, textureX, textureY); // Box 314
		bodyModel[154] = new ModelRendererTurbo(this, 293, 60, textureX, textureY); // Box 316
		bodyModel[155] = new ModelRendererTurbo(this, 323, 57, textureX, textureY); // Box 443
		bodyModel[156] = new ModelRendererTurbo(this, 318, 57, textureX, textureY); // Box 444
		bodyModel[157] = new ModelRendererTurbo(this, 272, 55, textureX, textureY); // Box 445
		bodyModel[158] = new ModelRendererTurbo(this, 344, 58, textureX, textureY); // Box 128
		bodyModel[159] = new ModelRendererTurbo(this, 336, 56, textureX, textureY); // Box 153
		bodyModel[160] = new ModelRendererTurbo(this, 328, 66, textureX, textureY); // Box 448
		bodyModel[161] = new ModelRendererTurbo(this, 332, 51, textureX, textureY); // Box 453
		bodyModel[162] = new ModelRendererTurbo(this, 332, 56, textureX, textureY); // Box 454
		bodyModel[163] = new ModelRendererTurbo(this, 341, 65, textureX, textureY); // Box 455
		bodyModel[164] = new ModelRendererTurbo(this, 366, 156, textureX, textureY); // Box 13
		bodyModel[165] = new ModelRendererTurbo(this, 335, 147, textureX, textureY); // Box 13
		bodyModel[166] = new ModelRendererTurbo(this, 444, 68, textureX, textureY); // Box 131
		bodyModel[167] = new ModelRendererTurbo(this, 447, 70, textureX, textureY); // Box 131
		bodyModel[168] = new ModelRendererTurbo(this, 179, 128, textureX, textureY); // Box 0
		bodyModel[169] = new ModelRendererTurbo(this, 338, 128, textureX, textureY); // Box 0
		bodyModel[170] = new ModelRendererTurbo(this, 35, 102, textureX, textureY); // Box 333
		bodyModel[171] = new ModelRendererTurbo(this, 35, 82, textureX, textureY); // Box 334
		bodyModel[172] = new ModelRendererTurbo(this, 275, 38, textureX, textureY); // Box 0
		bodyModel[173] = new ModelRendererTurbo(this, 266, 38, textureX, textureY); // Box 0
		bodyModel[174] = new ModelRendererTurbo(this, 257, 38, textureX, textureY); // Box 0
		bodyModel[175] = new ModelRendererTurbo(this, 248, 38, textureX, textureY); // Box 0
		bodyModel[176] = new ModelRendererTurbo(this, 275, 38, textureX, textureY); // Box 0
		bodyModel[177] = new ModelRendererTurbo(this, 266, 38, textureX, textureY); // Box 0
		bodyModel[178] = new ModelRendererTurbo(this, 257, 38, textureX, textureY); // Box 0
		bodyModel[179] = new ModelRendererTurbo(this, 248, 38, textureX, textureY); // Box 0
		bodyModel[180] = new ModelRendererTurbo(this, 241, 151, textureX, textureY); // Box 189
		bodyModel[181] = new ModelRendererTurbo(this, 332, 151, textureX, textureY); // Box 190
		bodyModel[182] = new ModelRendererTurbo(this, 152, 120, textureX, textureY); // Box 196
		bodyModel[183] = new ModelRendererTurbo(this, 152, 113, textureX, textureY); // Box 197
		bodyModel[184] = new ModelRendererTurbo(this, 175, 120, textureX, textureY); // Box 196
		bodyModel[185] = new ModelRendererTurbo(this, 175, 113, textureX, textureY); // Box 197
		bodyModel[186] = new ModelRendererTurbo(this, 192, 120, textureX, textureY); // Box 196
		bodyModel[187] = new ModelRendererTurbo(this, 192, 113, textureX, textureY); // Box 197
		bodyModel[188] = new ModelRendererTurbo(this, 211, 177, textureX, textureY); // Box 42
		bodyModel[189] = new ModelRendererTurbo(this, 305, 236, textureX, textureY); // Box 324
		bodyModel[190] = new ModelRendererTurbo(this, 231, 232, textureX, textureY); // Box 42
		bodyModel[191] = new ModelRendererTurbo(this, 270, 233, textureX, textureY); // Box 324
		bodyModel[192] = new ModelRendererTurbo(this, 222, 201, textureX, textureY); // Box 324
		bodyModel[193] = new ModelRendererTurbo(this, 252, 177, textureX, textureY); // Box 324
		bodyModel[194] = new ModelRendererTurbo(this, 342, 232, textureX, textureY); // Box 44
		bodyModel[195] = new ModelRendererTurbo(this, 342, 242, textureX, textureY); // Box 325
		bodyModel[196] = new ModelRendererTurbo(this, 228, 243, textureX, textureY); // Box 44
		bodyModel[197] = new ModelRendererTurbo(this, 228, 239, textureX, textureY); // Box 325
		bodyModel[198] = new ModelRendererTurbo(this, 342, 237, textureX, textureY); // Box 44
		bodyModel[199] = new ModelRendererTurbo(this, 342, 247, textureX, textureY); // Box 325
		bodyModel[200] = new ModelRendererTurbo(this, 228, 247, textureX, textureY); // Box 44
		bodyModel[201] = new ModelRendererTurbo(this, 228, 234, textureX, textureY); // Box 325
		bodyModel[202] = new ModelRendererTurbo(this, 327, 135, textureX, textureY); // Box 332 door swing right hood
		bodyModel[203] = new ModelRendererTurbo(this, 327, 128, textureX, textureY); // Box 335
		bodyModel[204] = new ModelRendererTurbo(this, 327, 148, textureX, textureY); // Box 337
		bodyModel[205] = new ModelRendererTurbo(this, 188, 147, textureX, textureY); // Box 177
		bodyModel[206] = new ModelRendererTurbo(this, 188, 147, textureX, textureY); // Box 178
		bodyModel[207] = new ModelRendererTurbo(this, 242, 135, textureX, textureY); // Box 329 door swing left hood
		bodyModel[208] = new ModelRendererTurbo(this, 242, 128, textureX, textureY); // Box 336
		bodyModel[209] = new ModelRendererTurbo(this, 242, 148, textureX, textureY); // Box 338
		bodyModel[210] = new ModelRendererTurbo(this, 193, 66, textureX, textureY); // Box 0
		bodyModel[211] = new ModelRendererTurbo(this, 193, 60, textureX, textureY); // Box 0
		bodyModel[212] = new ModelRendererTurbo(this, 194, 55, textureX, textureY); // Box 0
		bodyModel[213] = new ModelRendererTurbo(this, 194, 72, textureX, textureY); // Box 0
		bodyModel[214] = new ModelRendererTurbo(this, 233, 66, textureX, textureY); // Box 0
		bodyModel[215] = new ModelRendererTurbo(this, 233, 60, textureX, textureY); // Box 0
		bodyModel[216] = new ModelRendererTurbo(this, 234, 72, textureX, textureY); // Box 0
		bodyModel[217] = new ModelRendererTurbo(this, 234, 55, textureX, textureY); // Box 0
		bodyModel[218] = new ModelRendererTurbo(this, 252, 49, textureX, textureY); // Box 0
		bodyModel[219] = new ModelRendererTurbo(this, 243, 49, textureX, textureY); // Box 0
		bodyModel[220] = new ModelRendererTurbo(this, 261, 50, textureX, textureY); // Box 0
		bodyModel[221] = new ModelRendererTurbo(this, 236, 50, textureX, textureY); // Box 0
		bodyModel[222] = new ModelRendererTurbo(this, 252, 47, textureX, textureY); // Box 0
		bodyModel[223] = new ModelRendererTurbo(this, 243, 47, textureX, textureY); // Box 0
		bodyModel[224] = new ModelRendererTurbo(this, 261, 48, textureX, textureY); // Box 0
		bodyModel[225] = new ModelRendererTurbo(this, 236, 48, textureX, textureY); // Box 0
		bodyModel[226] = new ModelRendererTurbo(this, 252, 45, textureX, textureY); // Box 0
		bodyModel[227] = new ModelRendererTurbo(this, 243, 45, textureX, textureY); // Box 0
		bodyModel[228] = new ModelRendererTurbo(this, 261, 46, textureX, textureY); // Box 0
		bodyModel[229] = new ModelRendererTurbo(this, 236, 46, textureX, textureY); // Box 0
		bodyModel[230] = new ModelRendererTurbo(this, 252, 43, textureX, textureY); // Box 0
		bodyModel[231] = new ModelRendererTurbo(this, 243, 43, textureX, textureY); // Box 0
		bodyModel[232] = new ModelRendererTurbo(this, 261, 44, textureX, textureY); // Box 0
		bodyModel[233] = new ModelRendererTurbo(this, 236, 44, textureX, textureY); // Box 0
		bodyModel[234] = new ModelRendererTurbo(this, 338, 222, textureX, textureY); // Box 140
		bodyModel[235] = new ModelRendererTurbo(this, 338, 227, textureX, textureY); // Box 141
		bodyModel[236] = new ModelRendererTurbo(this, 329, 222, textureX, textureY); // Box 140
		bodyModel[237] = new ModelRendererTurbo(this, 329, 227, textureX, textureY); // Box 141
		bodyModel[238] = new ModelRendererTurbo(this, 47, 62, textureX, textureY); // Box 0
		bodyModel[239] = new ModelRendererTurbo(this, 47, 43, textureX, textureY); // Box 0
		bodyModel[240] = new ModelRendererTurbo(this, 311, 49, textureX, textureY, "cull"); // Box 0
		bodyModel[241] = new ModelRendererTurbo(this, 298, 49, textureX, textureY, "cull"); // Box 0
		bodyModel[242] = new ModelRendererTurbo(this, 285, 49, textureX, textureY, "cull"); // Box 0
		bodyModel[243] = new ModelRendererTurbo(this, 272, 49, textureX, textureY, "cull"); // Box 0
		bodyModel[244] = new ModelRendererTurbo(this, 311, 43, textureX, textureY, "cull"); // Box 0
		bodyModel[245] = new ModelRendererTurbo(this, 298, 43, textureX, textureY, "cull"); // Box 0
		bodyModel[246] = new ModelRendererTurbo(this, 285, 43, textureX, textureY, "cull"); // Box 0
		bodyModel[247] = new ModelRendererTurbo(this, 272, 43, textureX, textureY, "cull"); // Box 0
		bodyModel[248] = new ModelRendererTurbo(this, 304, 30, textureX, textureY, "cull"); // Box 0
		bodyModel[249] = new ModelRendererTurbo(this, 293, 30, textureX, textureY, "cull"); // Box 0
		bodyModel[250] = new ModelRendererTurbo(this, 282, 30, textureX, textureY, "cull"); // Box 0
		bodyModel[251] = new ModelRendererTurbo(this, 271, 30, textureX, textureY, "cull"); // Box 0
		bodyModel[252] = new ModelRendererTurbo(this, 304, 26, textureX, textureY, "cull"); // Box 0
		bodyModel[253] = new ModelRendererTurbo(this, 293, 26, textureX, textureY, "cull"); // Box 0
		bodyModel[254] = new ModelRendererTurbo(this, 282, 26, textureX, textureY, "cull"); // Box 0
		bodyModel[255] = new ModelRendererTurbo(this, 271, 26, textureX, textureY, "cull"); // Box 0
		bodyModel[256] = new ModelRendererTurbo(this, 344, 24, textureX, textureY); // Box 187
		bodyModel[257] = new ModelRendererTurbo(this, 346, 18, textureX, textureY); // Box 187
		bodyModel[258] = new ModelRendererTurbo(this, 337, 19, textureX, textureY); // Box 188
		bodyModel[259] = new ModelRendererTurbo(this, 337, 15, textureX, textureY); // Box 188
		bodyModel[260] = new ModelRendererTurbo(this, 335, 34, textureX, textureY); // Box 187
		bodyModel[261] = new ModelRendererTurbo(this, 344, 33, textureX, textureY); // Box 187
		bodyModel[262] = new ModelRendererTurbo(this, 319, 38, textureX, textureY); // Box 0
		bodyModel[263] = new ModelRendererTurbo(this, 308, 38, textureX, textureY); // Box 0
		bodyModel[264] = new ModelRendererTurbo(this, 297, 38, textureX, textureY); // Box 0
		bodyModel[265] = new ModelRendererTurbo(this, 286, 38, textureX, textureY); // Box 0
		bodyModel[266] = new ModelRendererTurbo(this, 319, 34, textureX, textureY); // Box 0
		bodyModel[267] = new ModelRendererTurbo(this, 308, 34, textureX, textureY); // Box 0
		bodyModel[268] = new ModelRendererTurbo(this, 297, 34, textureX, textureY); // Box 0
		bodyModel[269] = new ModelRendererTurbo(this, 286, 34, textureX, textureY); // Box 0
		bodyModel[270] = new ModelRendererTurbo(this, 291, 16, textureX, textureY); // Box 0
		bodyModel[271] = new ModelRendererTurbo(this, 300, 8, textureX, textureY); // Box 0
		bodyModel[272] = new ModelRendererTurbo(this, 287, 7, textureX, textureY, "cull"); // Box 0 cull
		bodyModel[273] = new ModelRendererTurbo(this, 331, 6, textureX, textureY, "cull"); // Box 0 cull
		bodyModel[274] = new ModelRendererTurbo(this, 302, 19, textureX, textureY); // Box 0
		bodyModel[275] = new ModelRendererTurbo(this, 276, 19, textureX, textureY); // Box 0
		bodyModel[276] = new ModelRendererTurbo(this, 276, 12, textureX, textureY); // Box 0
		bodyModel[277] = new ModelRendererTurbo(this, 302, 12, textureX, textureY); // Box 0
		bodyModel[278] = new ModelRendererTurbo(this, 465, 49, textureX, textureY); // Box 0
		bodyModel[279] = new ModelRendererTurbo(this, 465, 40, textureX, textureY); // Box 0
		bodyModel[280] = new ModelRendererTurbo(this, 472, 49, textureX, textureY); // Box 0
		bodyModel[281] = new ModelRendererTurbo(this, 451, 52, textureX, textureY); // Box 0
		bodyModel[282] = new ModelRendererTurbo(this, 488, 54, textureX, textureY); // Box 0
		bodyModel[283] = new ModelRendererTurbo(this, 458, 58, textureX, textureY); // Box 0
		bodyModel[284] = new ModelRendererTurbo(this, 485, 59, textureX, textureY); // Box 0
		bodyModel[285] = new ModelRendererTurbo(this, 470, 57, textureX, textureY); // Box 333
		bodyModel[286] = new ModelRendererTurbo(this, 475, 57, textureX, textureY); // Box 334
		bodyModel[287] = new ModelRendererTurbo(this, 465, 56, textureX, textureY); // Box 38
		bodyModel[288] = new ModelRendererTurbo(this, 457, 70, textureX, textureY); // Box 128
		bodyModel[289] = new ModelRendererTurbo(this, 496, 51, textureX, textureY); // Box 128
		bodyModel[290] = new ModelRendererTurbo(this, 502, 53, textureX, textureY); // Box 153
		bodyModel[291] = new ModelRendererTurbo(this, 500, 40, textureX, textureY); // Box 128
		bodyModel[292] = new ModelRendererTurbo(this, 498, 46, textureX, textureY); // Box 128
		bodyModel[293] = new ModelRendererTurbo(this, 480, 56, textureX, textureY); // Box 247
		bodyModel[294] = new ModelRendererTurbo(this, 504, 48, textureX, textureY); // Box 255
		bodyModel[295] = new ModelRendererTurbo(this, 462, 50, textureX, textureY); // Box 0
		bodyModel[296] = new ModelRendererTurbo(this, 470, 41, textureX, textureY); // Box 0
		bodyModel[297] = new ModelRendererTurbo(this, 477, 50, textureX, textureY); // Box 0
		bodyModel[298] = new ModelRendererTurbo(this, 456, 53, textureX, textureY); // Box 0
		bodyModel[299] = new ModelRendererTurbo(this, 485, 54, textureX, textureY); // Box 0
		bodyModel[300] = new ModelRendererTurbo(this, 459, 60, textureX, textureY); // Box 0
		bodyModel[301] = new ModelRendererTurbo(this, 486, 61, textureX, textureY); // Box 0
		bodyModel[302] = new ModelRendererTurbo(this, 480, 70, textureX, textureY); // Box 128
		bodyModel[303] = new ModelRendererTurbo(this, 134, 49, textureX, textureY); // Box 0
		bodyModel[304] = new ModelRendererTurbo(this, 134, 40, textureX, textureY); // Box 0
		bodyModel[305] = new ModelRendererTurbo(this, 141, 49, textureX, textureY); // Box 0
		bodyModel[306] = new ModelRendererTurbo(this, 120, 52, textureX, textureY); // Box 0
		bodyModel[307] = new ModelRendererTurbo(this, 157, 54, textureX, textureY); // Box 0
		bodyModel[308] = new ModelRendererTurbo(this, 127, 58, textureX, textureY); // Box 0
		bodyModel[309] = new ModelRendererTurbo(this, 153, 59, textureX, textureY); // Box 0
		bodyModel[310] = new ModelRendererTurbo(this, 139, 57, textureX, textureY); // Box 333
		bodyModel[311] = new ModelRendererTurbo(this, 144, 57, textureX, textureY); // Box 334
		bodyModel[312] = new ModelRendererTurbo(this, 134, 56, textureX, textureY); // Box 38
		bodyModel[313] = new ModelRendererTurbo(this, 126, 70, textureX, textureY); // Box 128
		bodyModel[314] = new ModelRendererTurbo(this, 100, 51, textureX, textureY); // Box 128
		bodyModel[315] = new ModelRendererTurbo(this, 114, 51, textureX, textureY); // Box 153
		bodyModel[316] = new ModelRendererTurbo(this, 108, 44, textureX, textureY); // Box 128
		bodyModel[317] = new ModelRendererTurbo(this, 103, 46, textureX, textureY); // Box 128
		bodyModel[318] = new ModelRendererTurbo(this, 149, 56, textureX, textureY); // Box 247
		bodyModel[319] = new ModelRendererTurbo(this, 115, 46, textureX, textureY); // Box 255
		bodyModel[320] = new ModelRendererTurbo(this, 131, 50, textureX, textureY); // Box 0
		bodyModel[321] = new ModelRendererTurbo(this, 139, 41, textureX, textureY); // Box 0
		bodyModel[322] = new ModelRendererTurbo(this, 146, 50, textureX, textureY); // Box 0
		bodyModel[323] = new ModelRendererTurbo(this, 125, 53, textureX, textureY); // Box 0
		bodyModel[324] = new ModelRendererTurbo(this, 154, 54, textureX, textureY); // Box 0
		bodyModel[325] = new ModelRendererTurbo(this, 128, 60, textureX, textureY); // Box 0
		bodyModel[326] = new ModelRendererTurbo(this, 149, 70, textureX, textureY); // Box 128
		bodyModel[327] = new ModelRendererTurbo(this, 331, 18, textureX, textureY); // Box 0
		bodyModel[328] = new ModelRendererTurbo(this, 331, 14, textureX, textureY); // Box 346
		bodyModel[329] = new ModelRendererTurbo(this, 154, 61, textureX, textureY); // Box 0
		bodyModel[330] = new ModelRendererTurbo(this, 393, 201, textureX, textureY); // Box 0
		bodyModel[331] = new ModelRendererTurbo(this, 393, 201, textureX, textureY); // Box 0
		bodyModel[332] = new ModelRendererTurbo(this, 393, 201, textureX, textureY); // Box 0
		bodyModel[333] = new ModelRendererTurbo(this, 393, 201, textureX, textureY); // Box 0
		bodyModel[334] = new ModelRendererTurbo(this, 393, 201, textureX, textureY); // Box 0
		bodyModel[335] = new ModelRendererTurbo(this, 393, 201, textureX, textureY); // Box 0
		bodyModel[336] = new ModelRendererTurbo(this, 393, 201, textureX, textureY); // Box 0
		bodyModel[337] = new ModelRendererTurbo(this, 393, 201, textureX, textureY); // Box 0
		bodyModel[338] = new ModelRendererTurbo(this, 393, 201, textureX, textureY); // Box 0
		bodyModel[339] = new ModelRendererTurbo(this, 393, 201, textureX, textureY); // Box 0
		bodyModel[340] = new ModelRendererTurbo(this, 393, 201, textureX, textureY); // Box 0
		bodyModel[341] = new ModelRendererTurbo(this, 393, 201, textureX, textureY); // Box 0
		bodyModel[342] = new ModelRendererTurbo(this, 471, 162, textureX, textureY); // Box 0
		bodyModel[343] = new ModelRendererTurbo(this, 471, 162, textureX, textureY); // Box 0
		bodyModel[344] = new ModelRendererTurbo(this, 471, 156, textureX, textureY); // Box 0
		bodyModel[345] = new ModelRendererTurbo(this, 471, 156, textureX, textureY); // Box 0
		bodyModel[346] = new ModelRendererTurbo(this, 395, 146, textureX, textureY); // Box 177
		bodyModel[347] = new ModelRendererTurbo(this, 395, 146, textureX, textureY); // Box 178

		bodyModel[0].addBox(0F, 0F, 0F, 90, 1, 20, 0F); // Box 0
		bodyModel[0].setRotationPoint(-47F, 0F, -10F);

		bodyModel[1].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 1
		bodyModel[1].setRotationPoint(-51F, 3F, -1.5F);

		bodyModel[2].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 1
		bodyModel[2].setRotationPoint(44F, 3F, -1.5F);

		bodyModel[3].addBox(0F, 0F, 0F, 1, 3, 4, 0F); // Box 1
		bodyModel[3].setRotationPoint(43F, 3F, -2F);

		bodyModel[4].addBox(0F, 0F, 0F, 1, 2, 20, 0F); // Box 1
		bodyModel[4].setRotationPoint(43F, 1F, -10F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 1, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[5].setRotationPoint(43F, 3F, -10F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 1, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F); // Box 1
		bodyModel[6].setRotationPoint(43F, 3F, 2F);

		bodyModel[7].addBox(0F, 0F, 0F, 1, 16, 20, 0F); // Box 0
		bodyModel[7].setRotationPoint(43F, -15F, -10F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 78, 1, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[8].setRotationPoint(-34F, -19F, -7F);

		bodyModel[9].addBox(0F, 0F, 0F, 78, 1, 6, 0F); // Box 0
		bodyModel[9].setRotationPoint(-34F, -19F, -3F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 78, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 0
		bodyModel[10].setRotationPoint(-34F, -19F, 3F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 78, 1, 3, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[11].setRotationPoint(-34F, -18F, -10F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 78, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F); // Box 0
		bodyModel[12].setRotationPoint(-34F, -18F, 7F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 78, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[13].setRotationPoint(-34F, -16F, -11F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 78, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[14].setRotationPoint(-34F, -16F, 10F);

		bodyModel[15].addBox(0F, 0F, 0F, 1, 2, 14, 0F); // Box 0
		bodyModel[15].setRotationPoint(43F, -17F, -7F);

		bodyModel[16].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Box 0
		bodyModel[16].setRotationPoint(43F, -18F, -3F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[17].setRotationPoint(43F, -17F, -10F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[18].setRotationPoint(43F, -17F, 7F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[19].setRotationPoint(43F, -18F, -7F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[20].setRotationPoint(43F, -18F, 3F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 23, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 123
		bodyModel[21].setRotationPoint(-11.5F, 2F, -11F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F); // Box 254
		bodyModel[22].setRotationPoint(-14.5F, 2F, -11F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 23, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 255
		bodyModel[23].setRotationPoint(-11.5F, 2F, 10F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F); // Box 136
		bodyModel[24].setRotationPoint(-14.5F, 2F, 10F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -0.5F, 0F); // Box 137
		bodyModel[25].setRotationPoint(11.5F, 2F, 10F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -0.5F, 0F); // Box 138
		bodyModel[26].setRotationPoint(11.5F, 2F, -11F);

		bodyModel[27].addBox(0F, 0F, 0F, 3, 5, 0, 0F); // Box 160
		bodyModel[27].setRotationPoint(-47.5F, 2F, -11F);

		bodyModel[28].addBox(0F, 0F, 0F, 3, 5, 0, 0F); // Box 161
		bodyModel[28].setRotationPoint(-47.5F, 2F, 11F);

		bodyModel[29].addBox(0F, 0F, 0F, 3, 5, 0, 0F); // Box 191
		bodyModel[29].setRotationPoint(40.5F, 2F, 11F);

		bodyModel[30].addBox(0F, 0F, 0F, 3, 5, 0, 0F); // Box 192
		bodyModel[30].setRotationPoint(40.5F, 2F, -11F);

		bodyModel[31].addBox(0F, 0F, 0F, 0, 6, 1, 0F); // Box 198
		bodyModel[31].setRotationPoint(43.5F, -4F, -11.75F);

		bodyModel[32].addBox(0F, 0F, 0F, 0, 6, 1, 0F); // Box 199
		bodyModel[32].setRotationPoint(40.5F, -4F, -11.75F);

		bodyModel[33].addBox(0F, 0F, 0F, 0, 6, 1, 0F); // Box 200
		bodyModel[33].setRotationPoint(43.5F, -4F, 10.75F);

		bodyModel[34].addBox(0F, 0F, 0F, 0, 6, 1, 0F); // Box 201
		bodyModel[34].setRotationPoint(40.5F, -4F, 10.75F);

		bodyModel[35].addBox(0F, 0F, 0F, 2, 1, 6, 0F); // Box 202
		bodyModel[35].setRotationPoint(44F, -19F, -3F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, -1F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -2F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 203
		bodyModel[36].setRotationPoint(44F, -19F, -7F);

		bodyModel[37].addBox(0F, 0F, 0F, 2, 15, 1, 0F); // Box 314
		bodyModel[37].setRotationPoint(44F, -14F, -4F);

		bodyModel[38].addBox(0F, 0F, 0F, 2, 15, 1, 0F); // Box 316
		bodyModel[38].setRotationPoint(44F, -14F, 3F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, -2F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 1F, 0F, 0F, 1F, 0F); // Box 231
		bodyModel[39].setRotationPoint(44F, -19F, 3F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 247 headlight rear left
		bodyModel[40].setRotationPoint(43.5F, -10.5F, -9F);

		bodyModel[41].addBox(0F, 0F, 0F, 0, 5, 5, 0F); // Box 222
		bodyModel[41].setRotationPoint(44.01F, 2F, -10F);

		bodyModel[42].addBox(0F, 0F, 0F, 0, 5, 5, 0F); // Box 223
		bodyModel[42].setRotationPoint(44.01F, 2F, 5F);

		bodyModel[43].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 438
		bodyModel[43].setRotationPoint(25.5F, 3F, -2F);

		bodyModel[44].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 439
		bodyModel[44].setRotationPoint(-31.5F, 3F, -2F);

		bodyModel[45].addBox(0F, 0F, 0F, 90, 2, 14, 0F); // Box 441
		bodyModel[45].setRotationPoint(-47F, 1F, -7F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 418 headlight rear right
		bodyModel[46].setRotationPoint(43.5F, -10.5F, 7F);

		bodyModel[47].addBox(0F, 0F, 0F, 1, 17, 1, 0F); // Box 443
		bodyModel[47].setRotationPoint(45F, -15F, 4F);

		bodyModel[48].addBox(0F, 0F, 0F, 1, 17, 1, 0F); // Box 444
		bodyModel[48].setRotationPoint(45F, -15F, -5F);

		bodyModel[49].addBox(0F, 0F, 0F, 2, 1, 8, 0F); // Box 445
		bodyModel[49].setRotationPoint(44F, -15F, -4F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[50].setRotationPoint(45F, -16F, -5F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 153
		bodyModel[51].setRotationPoint(45F, -16F, 0F);

		bodyModel[52].addBox(0F, 0F, 0F, 2, 1, 8, 0F); // Box 448
		bodyModel[52].setRotationPoint(44F, 1F, -4F);

		bodyModel[53].addBox(0F, 0F, 0F, 1, 14, 4, 0F); // Box 452 some door that magically vibes in the back
		bodyModel[53].setRotationPoint(43.5F, -13F, -2F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 453
		bodyModel[54].setRotationPoint(44F, -14F, 0F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 454
		bodyModel[55].setRotationPoint(44F, -14F, -3F);

		bodyModel[56].addBox(0F, 0F, 0F, 2, 1, 7, 0F); // Box 455
		bodyModel[56].setRotationPoint(44F, 2F, -3.5F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 15, 3, 12, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 0
		bodyModel[57].setRotationPoint(5F, -3F, -6F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 15, 2, 12, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F); // Box 2
		bodyModel[58].setRotationPoint(5F, -5F, -6F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 15, 2, 12, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 3
		bodyModel[59].setRotationPoint(5F, -8F, -6F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 15, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 4
		bodyModel[60].setRotationPoint(5F, -10F, -6F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 15, 2, 4, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		bodyModel[61].setRotationPoint(5F, -12F, -6F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 15, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[62].setRotationPoint(5F, -12F, 2F);

		bodyModel[63].addBox(0F, 0F, 0F, 15, 2, 4, 0F); // Box 7
		bodyModel[63].setRotationPoint(5F, -12F, -2F);

		bodyModel[64].addBox(0F, 0F, 0F, 1, 4, 4, 0F); // Box 10
		bodyModel[64].setRotationPoint(20F, -14F, -2F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[65].setRotationPoint(20F, -14F, -6F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		bodyModel[66].setRotationPoint(20F, -14F, 2F);

		bodyModel[67].addBox(0F, 0F, 0F, 1, 8, 6, 0F); // Box 13
		bodyModel[67].setRotationPoint(20F, -10F, -3F);

		bodyModel[68].addBox(0F, 0F, 0F, 2, 4, 3, 0F); // Box 14
		bodyModel[68].setRotationPoint(3F, -4F, -5F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 15, 1, 12, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 3
		bodyModel[69].setRotationPoint(5F, -6F, -6F);

		bodyModel[70].addBox(0F, 0F, 0F, 1, 4, 8, 0F); // Box 9
		bodyModel[70].setRotationPoint(4F, -12F, -4F);

		bodyModel[71].addBox(0F, 0F, 0F, 1, 7, 5, 0F); // Box 21
		bodyModel[71].setRotationPoint(4F, -8F, -2F);

		bodyModel[72].addBox(0F, 0F, 0F, 5, 3, 3, 0F); // Box 10
		bodyModel[72].setRotationPoint(21F, -13F, 3F);

		bodyModel[73].addBox(0F, 0F, 0F, 5, 3, 3, 0F); // Box 10
		bodyModel[73].setRotationPoint(21F, -13F, -6F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 15, 3, 12, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 0
		bodyModel[74].setRotationPoint(-20F, -3F, -6F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 15, 2, 12, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F); // Box 2
		bodyModel[75].setRotationPoint(-20F, -5F, -6F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 15, 2, 12, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 3
		bodyModel[76].setRotationPoint(-20F, -8F, -6F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 15, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 4
		bodyModel[77].setRotationPoint(-20F, -10F, -6F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 15, 2, 4, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		bodyModel[78].setRotationPoint(-20F, -12F, -6F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 15, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[79].setRotationPoint(-20F, -12F, 2F);

		bodyModel[80].addBox(0F, 0F, 0F, 15, 2, 4, 0F); // Box 7
		bodyModel[80].setRotationPoint(-20F, -12F, -2F);

		bodyModel[81].addBox(0F, 0F, 0F, 1, 4, 4, 0F); // Box 10
		bodyModel[81].setRotationPoint(-21F, -14F, -2F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		bodyModel[82].setRotationPoint(-21F, -14F, 2F);

		bodyModel[83].addBox(0F, 0F, 0F, 1, 8, 6, 0F); // Box 13
		bodyModel[83].setRotationPoint(-21F, -10F, -3F);

		bodyModel[84].addBox(0F, 0F, 0F, 2, 4, 3, 0F); // Box 14
		bodyModel[84].setRotationPoint(-5F, -4F, -5F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 15, 1, 12, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 3
		bodyModel[85].setRotationPoint(-20F, -6F, -6F);

		bodyModel[86].addBox(0F, 0F, 0F, 1, 4, 8, 0F); // Box 9
		bodyModel[86].setRotationPoint(-5F, -12F, -4F);

		bodyModel[87].addBox(0F, 0F, 0F, 1, 7, 5, 0F); // Box 21
		bodyModel[87].setRotationPoint(-5F, -8F, -2F);

		bodyModel[88].addBox(0F, 0F, 0F, 5, 3, 3, 0F); // Box 10
		bodyModel[88].setRotationPoint(-26F, -13F, 3F);

		bodyModel[89].addBox(0F, 0F, 0F, 5, 3, 3, 0F); // Box 10
		bodyModel[89].setRotationPoint(-26F, -13F, -6F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 5, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 110
		bodyModel[90].setRotationPoint(-25F, -5.5F, -4F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 5, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Box 111
		bodyModel[91].setRotationPoint(-25F, -8F, 1.5F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 5, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 112
		bodyModel[92].setRotationPoint(-25F, -8F, -1.5F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 5, 3, 2, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 113
		bodyModel[93].setRotationPoint(-25F, -8F, -3.5F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 5, 3, 2, 0F,0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 114
		bodyModel[94].setRotationPoint(-25F, -3F, -3.5F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 5, 3, 3, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 115
		bodyModel[95].setRotationPoint(-25F, -3F, -1.5F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 3, 5, 3, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 522
		bodyModel[96].setRotationPoint(-28F, -5F, -1.5F);

		bodyModel[97].addBox(0F, 0F, 0F, 2, 3, 3, 0F); // Box 523
		bodyModel[97].setRotationPoint(-25F, -11F, -1.5F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 255
		bodyModel[98].setRotationPoint(-23F, -9.5F, -1F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 256
		bodyModel[99].setRotationPoint(-23F, -10.5F, -1F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[100].setRotationPoint(-21F, -14F, -6F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 5, 3, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 116
		bodyModel[101].setRotationPoint(-25F, -3F, 1.5F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 5, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 110
		bodyModel[102].setRotationPoint(20F, -5.5F, -4F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 5, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Box 111
		bodyModel[103].setRotationPoint(20F, -8F, 1.5F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 5, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 112
		bodyModel[104].setRotationPoint(20F, -8F, -1.5F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 5, 3, 2, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 113
		bodyModel[105].setRotationPoint(20F, -8F, -3.5F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 5, 3, 2, 0F,0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 114
		bodyModel[106].setRotationPoint(20F, -3F, -3.5F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 5, 3, 3, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 115
		bodyModel[107].setRotationPoint(20F, -3F, -1.5F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 3, 5, 3, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 522
		bodyModel[108].setRotationPoint(25F, -5F, -1.5F);

		bodyModel[109].addBox(0F, 0F, 0F, 2, 3, 3, 0F); // Box 523
		bodyModel[109].setRotationPoint(23F, -11F, -1.5F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 255
		bodyModel[110].setRotationPoint(21F, -9.5F, -1F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 256
		bodyModel[111].setRotationPoint(21F, -10.5F, -1F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 5, 3, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 116
		bodyModel[112].setRotationPoint(20F, -3F, 1.5F);

		bodyModel[113].addBox(0F, 0F, 0F, 20, 4, 20, 0F); // Box 42
		bodyModel[113].setRotationPoint(-10F, 2F, -10F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 20, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -2F, 0F, -0.25F, -2F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 44
		bodyModel[114].setRotationPoint(-10F, 6F, -10F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 20, 3, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 324
		bodyModel[115].setRotationPoint(-10F, 6F, -8F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 20, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -2F, 0F, -0.25F, -2F); // Box 325
		bodyModel[116].setRotationPoint(-10F, 6F, 8F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 2, 2, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 324
		bodyModel[117].setRotationPoint(-13F, 6F, -8F);
		bodyModel[117].rotateAngleZ = 0.78539816F;

		bodyModel[118].addShapeBox(0F, 0F, 0F, 1, 6, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 324
		bodyModel[118].setRotationPoint(10.92F, 1F, -8.01F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 2, 2, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 324
		bodyModel[119].setRotationPoint(10F, 6F, -8F);
		bodyModel[119].rotateAngleZ = 0.78539816F;

		bodyModel[120].addShapeBox(0F, 0F, 0F, 1, 6, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 324
		bodyModel[120].setRotationPoint(10.92F, 1F, 8.01F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 1, 6, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 324
		bodyModel[121].setRotationPoint(-12.1F, 1F, -8.01F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 1, 6, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 324
		bodyModel[122].setRotationPoint(-12.1F, 1F, 8.01F);

		bodyModel[123].addBox(0F, 0F, 0F, 1, 3, 4, 0F); // Box 1
		bodyModel[123].setRotationPoint(-48F, 3F, -2F);

		bodyModel[124].addBox(0F, 0F, 0F, 1, 2, 20, 0F); // Box 1
		bodyModel[124].setRotationPoint(-48F, 1F, -10F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 1, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[125].setRotationPoint(-48F, 3F, -10F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 1, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F); // Box 1
		bodyModel[126].setRotationPoint(-48F, 3F, 2F);

		bodyModel[127].addBox(0F, 0F, 0F, 1, 16, 20, 0F); // Box 0
		bodyModel[127].setRotationPoint(-48F, -15F, -10F);

		bodyModel[128].addBox(0F, 0F, 0F, 1, 2, 14, 0F); // Box 0
		bodyModel[128].setRotationPoint(-48F, -17F, -7F);

		bodyModel[129].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Box 0
		bodyModel[129].setRotationPoint(-48F, -18F, -3F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[130].setRotationPoint(-48F, -17F, -10F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[131].setRotationPoint(-48F, -17F, 7F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[132].setRotationPoint(-48F, -18F, -7F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[133].setRotationPoint(-48F, -18F, 3F);

		bodyModel[134].addBox(0F, 0F, 0F, 2, 1, 6, 0F); // Box 202
		bodyModel[134].setRotationPoint(-50F, -19F, -3F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,-2F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 203
		bodyModel[135].setRotationPoint(-50F, -19F, -7F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -2F, 1F, 0F); // Box 231
		bodyModel[136].setRotationPoint(-50F, -19F, 3F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 247 headlight rear left
		bodyModel[137].setRotationPoint(-49F, -10.5F, -9F);

		bodyModel[138].addBox(0F, 0F, 0F, 0, 5, 5, 0F); // Box 222
		bodyModel[138].setRotationPoint(-48.01F, 2F, -10F);

		bodyModel[139].addBox(0F, 0F, 0F, 0, 5, 5, 0F); // Box 223
		bodyModel[139].setRotationPoint(-48.01F, 2F, 5F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 418 headlight rear right
		bodyModel[140].setRotationPoint(-49F, -10.5F, 7F);

		bodyModel[141].addBox(0F, 0F, 0F, 1, 14, 4, 0F); // Box 452 some door that magically vibes in the back
		bodyModel[141].setRotationPoint(-49F, -13F, -2F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 14, 1, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[142].setRotationPoint(-48F, -19F, -7F);

		bodyModel[143].addBox(0F, 0F, 0F, 14, 1, 6, 0F); // Box 0
		bodyModel[143].setRotationPoint(-48F, -19F, -3F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 14, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 0
		bodyModel[144].setRotationPoint(-48F, -19F, 3F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 14, 1, 3, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[145].setRotationPoint(-48F, -18F, -10F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 14, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F); // Box 0
		bodyModel[146].setRotationPoint(-48F, -18F, 7F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 14, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[147].setRotationPoint(-48F, -16F, -11F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 14, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[148].setRotationPoint(-48F, -16F, 10F);

		bodyModel[149].addBox(0F, 0F, 0F, 0, 6, 1, 0F); // Box 198
		bodyModel[149].setRotationPoint(-44.5F, -4F, -11.75F);

		bodyModel[150].addBox(0F, 0F, 0F, 0, 6, 1, 0F); // Box 199
		bodyModel[150].setRotationPoint(-47.5F, -4F, -11.75F);

		bodyModel[151].addBox(0F, 0F, 0F, 0, 6, 1, 0F); // Box 200
		bodyModel[151].setRotationPoint(-44.5F, -4F, 10.75F);

		bodyModel[152].addBox(0F, 0F, 0F, 0, 6, 1, 0F); // Box 201
		bodyModel[152].setRotationPoint(-47.5F, -4F, 10.75F);

		bodyModel[153].addBox(0F, 0F, 0F, 2, 15, 1, 0F); // Box 314
		bodyModel[153].setRotationPoint(-50F, -14F, -4F);

		bodyModel[154].addBox(0F, 0F, 0F, 2, 15, 1, 0F); // Box 316
		bodyModel[154].setRotationPoint(-50F, -14F, 3F);

		bodyModel[155].addBox(0F, 0F, 0F, 1, 17, 1, 0F); // Box 443
		bodyModel[155].setRotationPoint(-50F, -15F, 4F);

		bodyModel[156].addBox(0F, 0F, 0F, 1, 17, 1, 0F); // Box 444
		bodyModel[156].setRotationPoint(-50F, -15F, -5F);

		bodyModel[157].addBox(0F, 0F, 0F, 2, 1, 8, 0F); // Box 445
		bodyModel[157].setRotationPoint(-50F, -15F, -4F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[158].setRotationPoint(-50F, -16F, -5F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 153
		bodyModel[159].setRotationPoint(-50F, -16F, 0F);

		bodyModel[160].addBox(0F, 0F, 0F, 2, 1, 8, 0F); // Box 448
		bodyModel[160].setRotationPoint(-50F, 1F, -4F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 453
		bodyModel[161].setRotationPoint(-49F, -14F, 0F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 454
		bodyModel[162].setRotationPoint(-49F, -14F, -3F);

		bodyModel[163].addBox(0F, 0F, 0F, 2, 1, 7, 0F); // Box 455
		bodyModel[163].setRotationPoint(-50F, 2F, -3.5F);

		bodyModel[164].addBox(0F, 0F, 0F, 3, 14, 12, 0F); // Box 13
		bodyModel[164].setRotationPoint(-32F, -14F, -6F);

		bodyModel[165].addBox(0F, 0F, 0F, 3, 14, 12, 0F); // Box 13
		bodyModel[165].setRotationPoint(29F, -14F, -6F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F); // Box 131
		bodyModel[166].setRotationPoint(-45.5F, -7F, 8.5F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 2, 5, 2, 0F,-0.2F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0.5F, -0.2F, -0.1F, 0.5F, -0.2F, -0.1F, 0.5F, -0.2F, -0.2F, 0.5F, -0.2F); // Box 131
		bodyModel[167].setRotationPoint(-46F, -5F, 8F);

		bodyModel[168].addBox(0F, 0F, 0F, 30, 17, 1, 0F); // Box 0
		bodyModel[168].setRotationPoint(-25F, -15F, -11F);

		bodyModel[169].addBox(0F, 0F, 0F, 30, 17, 1, 0F); // Box 0
		bodyModel[169].setRotationPoint(-25F, -15F, 10F);

		bodyModel[170].addBox(0F, 0F, 0F, 35, 17, 1, 0F); // Box 333
		bodyModel[170].setRotationPoint(9F, -15F, -11F);

		bodyModel[171].addBox(0F, 0F, 0F, 35, 17, 1, 0F); // Box 334
		bodyModel[171].setRotationPoint(9F, -15F, 10F);

		bodyModel[172].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 0
		bodyModel[172].setRotationPoint(21.5F, -20F, -1F);

		bodyModel[173].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 0
		bodyModel[173].setRotationPoint(18.5F, -20F, -1F);

		bodyModel[174].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 0
		bodyModel[174].setRotationPoint(14.5F, -20F, -1F);

		bodyModel[175].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 0
		bodyModel[175].setRotationPoint(11.5F, -20F, -1F);

		bodyModel[176].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 0
		bodyModel[176].setRotationPoint(-3.5F, -20F, -1F);

		bodyModel[177].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 0
		bodyModel[177].setRotationPoint(-6.5F, -20F, -1F);

		bodyModel[178].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 0
		bodyModel[178].setRotationPoint(-10.5F, -20F, -1F);

		bodyModel[179].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 0
		bodyModel[179].setRotationPoint(-13.5F, -20F, -1F);

		bodyModel[180].addBox(0F, 0F, 0F, 4, 5, 0, 0F); // Box 189
		bodyModel[180].setRotationPoint(5F, 2F, -11.01F);

		bodyModel[181].addBox(0F, 0F, 0F, 4, 5, 0, 0F); // Box 190
		bodyModel[181].setRotationPoint(5F, 2F, 11.01F);

		bodyModel[182].addShapeBox(0F, 0F, 0F, 10, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 196
		bodyModel[182].setRotationPoint(-26.5F, -14.5F, -11.1F);

		bodyModel[183].addShapeBox(0F, 0F, 0F, 10, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 197
		bodyModel[183].setRotationPoint(-26.5F, -14.5F, 10.1F);

		bodyModel[184].addShapeBox(0F, 0F, 0F, 7, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 196
		bodyModel[184].setRotationPoint(0F, -14.5F, -11.1F);

		bodyModel[185].addShapeBox(0F, 0F, 0F, 7, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 197
		bodyModel[185].setRotationPoint(0F, -14.5F, 10.1F);

		bodyModel[186].addShapeBox(0F, 0F, 0F, 8, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 196
		bodyModel[186].setRotationPoint(28F, -14.5F, -11.1F);

		bodyModel[187].addShapeBox(0F, 0F, 0F, 8, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 197
		bodyModel[187].setRotationPoint(28F, -14.5F, 10.1F);

		bodyModel[188].addBox(0F, 0F, 0F, 10, 3, 20, 0F); // Box 42
		bodyModel[188].setRotationPoint(-10F, 4F, -10F);

		bodyModel[189].addShapeBox(0F, 0F, 0F, 10, 2, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 324
		bodyModel[189].setRotationPoint(-10F, 7F, -8F);

		bodyModel[190].addBox(0F, 0F, 0F, 9, 3, 20, 0F); // Box 42
		bodyModel[190].setRotationPoint(1F, 4F, -10F);

		bodyModel[191].addShapeBox(0F, 0F, 0F, 9, 2, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 324
		bodyModel[191].setRotationPoint(1F, 7F, -8F);

		bodyModel[192].addShapeBox(0F, 0F, 0F, 10, 2, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 324
		bodyModel[192].setRotationPoint(-10F, 2F, -8F);

		bodyModel[193].addShapeBox(0F, 0F, 0F, 9, 2, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 324
		bodyModel[193].setRotationPoint(1F, 2F, -8F);

		bodyModel[194].addShapeBox(0F, 0F, 0F, 10, 1, 2, 0F,0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 44
		bodyModel[194].setRotationPoint(-10F, 3F, -10F);

		bodyModel[195].addShapeBox(0F, 0F, 0F, 10, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 325
		bodyModel[195].setRotationPoint(-10F, 3F, 8F);

		bodyModel[196].addShapeBox(0F, 0F, 0F, 9, 1, 2, 0F,0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 44
		bodyModel[196].setRotationPoint(1F, 3F, -10F);

		bodyModel[197].addShapeBox(0F, 0F, 0F, 9, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 325
		bodyModel[197].setRotationPoint(1F, 3F, 8F);

		bodyModel[198].addShapeBox(0F, 0F, 0F, 10, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 44
		bodyModel[198].setRotationPoint(-10F, 7F, -10F);

		bodyModel[199].addShapeBox(0F, 0F, 0F, 10, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F); // Box 325
		bodyModel[199].setRotationPoint(-10F, 7F, 8F);

		bodyModel[200].addShapeBox(0F, 0F, 0F, 9, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 44
		bodyModel[200].setRotationPoint(1F, 7F, -10F);

		bodyModel[201].addShapeBox(0F, 0F, 0F, 9, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F); // Box 325
		bodyModel[201].setRotationPoint(1F, 7F, 8F);

		bodyModel[202].addShapeBox(-3.5F, 0F, -0.5F, 4, 11, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 332 door swing right hood
		bodyModel[202].setRotationPoint(8.5F, -10F, 10.5F);

		bodyModel[203].addBox(0F, 0F, 0F, 4, 5, 1, 0F); // Box 335
		bodyModel[203].setRotationPoint(5F, -15F, 10F);

		bodyModel[204].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 337
		bodyModel[204].setRotationPoint(5F, 1F, 10F);

		bodyModel[205].addBox(0F, 0F, 0F, 0, 11, 1, 0F); // Box 177
		bodyModel[205].setRotationPoint(9.5F, -9F, -11.75F);

		bodyModel[206].addBox(0F, 0F, 0F, 0, 11, 1, 0F); // Box 178
		bodyModel[206].setRotationPoint(4.5F, -9F, -11.75F);

		bodyModel[207].addShapeBox(-3.5F, 0F, -0.5F, 4, 11, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 329 door swing left hood
		bodyModel[207].setRotationPoint(8.5F, -10F, -10.5F);

		bodyModel[208].addBox(0F, 0F, 0F, 4, 5, 1, 0F); // Box 336
		bodyModel[208].setRotationPoint(5F, -15F, -11F);

		bodyModel[209].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 338
		bodyModel[209].setRotationPoint(5F, 1F, -11F);

		bodyModel[210].addShapeBox(0F, 0F, 0F, 15, 1, 4, 0F,0F, -1.8F, 0F, 0F, -1.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[210].setRotationPoint(-15F, -20F, -7F);

		bodyModel[211].addShapeBox(0F, 0F, 0F, 15, 1, 4, 0F,0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -1.8F, 0F, 0F, -1.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 0
		bodyModel[211].setRotationPoint(-15F, -20F, 3F);

		bodyModel[212].addShapeBox(0F, 0F, 0F, 15, 1, 3, 0F,0F, -2.8F, 0F, 0F, -2.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[212].setRotationPoint(-15F, -19F, -10F);

		bodyModel[213].addShapeBox(0F, 0F, 0F, 15, 1, 3, 0F,0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -2.8F, 0F, 0F, -2.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F); // Box 0
		bodyModel[213].setRotationPoint(-15F, -19F, 7F);

		bodyModel[214].addShapeBox(0F, 0F, 0F, 15, 1, 4, 0F,0F, -1.8F, 0F, 0F, -1.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[214].setRotationPoint(10F, -20F, -7F);

		bodyModel[215].addShapeBox(0F, 0F, 0F, 15, 1, 4, 0F,0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -1.8F, 0F, 0F, -1.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 0
		bodyModel[215].setRotationPoint(10F, -20F, 3F);

		bodyModel[216].addShapeBox(0F, 0F, 0F, 15, 1, 3, 0F,0F, -2.8F, 0F, 0F, -2.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[216].setRotationPoint(10F, -19F, -10F);

		bodyModel[217].addShapeBox(0F, 0F, 0F, 15, 1, 3, 0F,0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -2.8F, 0F, 0F, -2.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F); // Box 0
		bodyModel[217].setRotationPoint(10F, -19F, 7F);

		bodyModel[218].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 1F, 0F, -0.5F, 1F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 0
		bodyModel[218].setRotationPoint(-14.75F, -20F, -7F);

		bodyModel[219].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 1F, 0F, 0.5F, 1F, 0F); // Box 0
		bodyModel[219].setRotationPoint(-14.75F, -20F, 3F);

		bodyModel[220].addShapeBox(0F, 0F, 0F, 0, 1, 3, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 2F, 0F, -0.5F, 2F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 0
		bodyModel[220].setRotationPoint(-14.75F, -19F, -10F);

		bodyModel[221].addShapeBox(0F, 0F, 0F, 0, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 2F, 0F, 0.5F, 2F, 0F); // Box 0
		bodyModel[221].setRotationPoint(-14.75F, -19F, 7F);

		bodyModel[222].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 1F, 0F, -0.5F, 1F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 0
		bodyModel[222].setRotationPoint(0.75F, -20F, -7F);

		bodyModel[223].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 1F, 0F, 0.5F, 1F, 0F); // Box 0
		bodyModel[223].setRotationPoint(0.75F, -20F, 3F);

		bodyModel[224].addShapeBox(0F, 0F, 0F, 0, 1, 3, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 2F, 0F, -0.5F, 2F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 0
		bodyModel[224].setRotationPoint(0.75F, -19F, -10F);

		bodyModel[225].addShapeBox(0F, 0F, 0F, 0, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 2F, 0F, 0.5F, 2F, 0F); // Box 0
		bodyModel[225].setRotationPoint(0.75F, -19F, 7F);

		bodyModel[226].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 1F, 0F, -0.5F, 1F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 0
		bodyModel[226].setRotationPoint(10.25F, -20F, -7F);

		bodyModel[227].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 1F, 0F, 0.5F, 1F, 0F); // Box 0
		bodyModel[227].setRotationPoint(10.25F, -20F, 3F);

		bodyModel[228].addShapeBox(0F, 0F, 0F, 0, 1, 3, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 2F, 0F, -0.5F, 2F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 0
		bodyModel[228].setRotationPoint(10.25F, -19F, -10F);

		bodyModel[229].addShapeBox(0F, 0F, 0F, 0, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 2F, 0F, 0.5F, 2F, 0F); // Box 0
		bodyModel[229].setRotationPoint(10.25F, -19F, 7F);

		bodyModel[230].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 1F, 0F, -0.5F, 1F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 0
		bodyModel[230].setRotationPoint(25.75F, -20F, -7F);

		bodyModel[231].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 1F, 0F, 0.5F, 1F, 0F); // Box 0
		bodyModel[231].setRotationPoint(25.75F, -20F, 3F);

		bodyModel[232].addShapeBox(0F, 0F, 0F, 0, 1, 3, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 2F, 0F, -0.5F, 2F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 0
		bodyModel[232].setRotationPoint(25.75F, -19F, -10F);

		bodyModel[233].addShapeBox(0F, 0F, 0F, 0, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 2F, 0F, 0.5F, 2F, 0F); // Box 0
		bodyModel[233].setRotationPoint(25.75F, -19F, 7F);

		bodyModel[234].addBox(0F, 0F, 0F, 3, 3, 1, 0F); // Box 140
		bodyModel[234].setRotationPoint(4F, 2F, -10.5F);

		bodyModel[235].addBox(0F, 0F, 0F, 3, 3, 1, 0F); // Box 141
		bodyModel[235].setRotationPoint(4F, 2F, 9.5F);

		bodyModel[236].addBox(0F, 0F, 0F, 3, 3, 1, 0F); // Box 140
		bodyModel[236].setRotationPoint(-3.5F, 2F, -10.5F);

		bodyModel[237].addBox(0F, 0F, 0F, 3, 3, 1, 0F); // Box 141
		bodyModel[237].setRotationPoint(-3.5F, 2F, 9.5F);

		bodyModel[238].addBox(0F, 0F, 0F, 23, 17, 1, 0F); // Box 0
		bodyModel[238].setRotationPoint(-48F, -15F, -11F);

		bodyModel[239].addBox(0F, 0F, 0F, 23, 17, 1, 0F); // Box 0
		bodyModel[239].setRotationPoint(-48F, -15F, 10F);

		bodyModel[240].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, -1F, -0.25F, -0.5F, -1F); // Box 0
		bodyModel[240].setRotationPoint(11F, -20F, -1F);

		bodyModel[241].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, -1F, -0.25F, -0.5F, -1F); // Box 0
		bodyModel[241].setRotationPoint(14F, -20F, -1F);

		bodyModel[242].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, -1F, -0.25F, -0.5F, -1F); // Box 0
		bodyModel[242].setRotationPoint(18F, -20F, -1F);

		bodyModel[243].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, -1F, -0.25F, -0.5F, -1F); // Box 0
		bodyModel[243].setRotationPoint(21F, -20F, -1F);

		bodyModel[244].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, -1F, -0.25F, -0.5F, -1F); // Box 0
		bodyModel[244].setRotationPoint(-14F, -20F, -1F);

		bodyModel[245].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, -1F, -0.25F, -0.5F, -1F); // Box 0
		bodyModel[245].setRotationPoint(-11F, -20F, -1F);

		bodyModel[246].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, -1F, -0.25F, -0.5F, -1F); // Box 0
		bodyModel[246].setRotationPoint(-7F, -20F, -1F);

		bodyModel[247].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, -1F, -0.25F, -0.5F, -1F); // Box 0
		bodyModel[247].setRotationPoint(-4F, -20F, -1F);

		bodyModel[248].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 0
		bodyModel[248].setRotationPoint(-14F, -21F, -1F);

		bodyModel[249].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 0
		bodyModel[249].setRotationPoint(-11F, -21F, -1F);

		bodyModel[250].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 0
		bodyModel[250].setRotationPoint(-7F, -21F, -1F);

		bodyModel[251].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 0
		bodyModel[251].setRotationPoint(-4F, -21F, -1F);

		bodyModel[252].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 0
		bodyModel[252].setRotationPoint(11F, -21F, -1F);

		bodyModel[253].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 0
		bodyModel[253].setRotationPoint(14F, -21F, -1F);

		bodyModel[254].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 0
		bodyModel[254].setRotationPoint(18F, -21F, -1F);

		bodyModel[255].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 0
		bodyModel[255].setRotationPoint(21F, -21F, -1F);

		bodyModel[256].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 187
		bodyModel[256].setRotationPoint(33.5F, -21F, -1F);

		bodyModel[257].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 187
		bodyModel[257].setRotationPoint(33.5F, -21F, 0F);

		bodyModel[258].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 188
		bodyModel[258].setRotationPoint(37.5F, -19.35F, -5.25F);

		bodyModel[259].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 188
		bodyModel[259].setRotationPoint(37.5F, -19.35F, 3.25F);

		bodyModel[260].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 187
		bodyModel[260].setRotationPoint(33.5F, -19.5F, 0F);

		bodyModel[261].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 187
		bodyModel[261].setRotationPoint(33.5F, -20F, -1F);

		bodyModel[262].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,-1F, -0.25F, 0.5F, -1F, -0.25F, 0.5F, -1F, -0.25F, 0.5F, -1F, -0.25F, 0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 0
		bodyModel[262].setRotationPoint(11F, -21F, -1F);

		bodyModel[263].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,-1F, -0.25F, 0.5F, -1F, -0.25F, 0.5F, -1F, -0.25F, 0.5F, -1F, -0.25F, 0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 0
		bodyModel[263].setRotationPoint(14F, -21F, -1F);

		bodyModel[264].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,-1F, -0.25F, 0.5F, -1F, -0.25F, 0.5F, -1F, -0.25F, 0.5F, -1F, -0.25F, 0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 0
		bodyModel[264].setRotationPoint(18F, -21F, -1F);

		bodyModel[265].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,-1F, -0.25F, 0.5F, -1F, -0.25F, 0.5F, -1F, -0.25F, 0.5F, -1F, -0.25F, 0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 0
		bodyModel[265].setRotationPoint(21F, -21F, -1F);

		bodyModel[266].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,-1F, -0.25F, 0.5F, -1F, -0.25F, 0.5F, -1F, -0.25F, 0.5F, -1F, -0.25F, 0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 0
		bodyModel[266].setRotationPoint(-14F, -21F, -1F);

		bodyModel[267].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,-1F, -0.25F, 0.5F, -1F, -0.25F, 0.5F, -1F, -0.25F, 0.5F, -1F, -0.25F, 0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 0
		bodyModel[267].setRotationPoint(-11F, -21F, -1F);

		bodyModel[268].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,-1F, -0.25F, 0.5F, -1F, -0.25F, 0.5F, -1F, -0.25F, 0.5F, -1F, -0.25F, 0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 0
		bodyModel[268].setRotationPoint(-7F, -21F, -1F);

		bodyModel[269].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,-1F, -0.25F, 0.5F, -1F, -0.25F, 0.5F, -1F, -0.25F, 0.5F, -1F, -0.25F, 0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 0
		bodyModel[269].setRotationPoint(-4F, -21F, -1F);

		bodyModel[270].addShapeBox(0F, 0F, 0F, 3, 2, 4, 0F,-0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 0
		bodyModel[270].setRotationPoint(-20.5F, -21F, -2F);

		bodyModel[271].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, 0F, -1.5F, -0.25F, 0F, -1.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[271].setRotationPoint(-20.25F, -20F, -1F);

		bodyModel[272].addShapeBox(0F, 0F, 0F, 3, 2, 6, 0F,-0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 0 cull
		bodyModel[272].setRotationPoint(-20.5F, -21F, -3F);

		bodyModel[273].addShapeBox(0F, 0F, 0F, 4, 2, 4, 0F,-0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 0 cull
		bodyModel[273].setRotationPoint(-20.5F, -21F, -2F);

		bodyModel[274].addShapeBox(0F, 0F, 0F, 3, 2, 4, 0F,-0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 0
		bodyModel[274].setRotationPoint(-17F, -21F, -2F);

		bodyModel[275].addShapeBox(0F, 0F, 0F, 3, 2, 4, 0F,-0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 0
		bodyModel[275].setRotationPoint(-1F, -21F, -2F);

		bodyModel[276].addShapeBox(0F, 0F, 0F, 3, 2, 4, 0F,-0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 0
		bodyModel[276].setRotationPoint(8F, -21F, -2F);

		bodyModel[277].addShapeBox(0F, 0F, 0F, 3, 2, 4, 0F,-0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 0
		bodyModel[277].setRotationPoint(24F, -21F, -2F);

		bodyModel[278].addShapeBox(0F, 0F, 0F, 2, 0, 4, 0F,0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -0.5F, 1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[278].setRotationPoint(44F, -19F, -7F);

		bodyModel[279].addShapeBox(0F, 0F, 0F, 2, 0, 6, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[279].setRotationPoint(44F, -19F, -3F);

		bodyModel[280].addShapeBox(0F, 0F, 0F, 2, 0, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 1F, 0F, 0F, 1F, 0F); // Box 0
		bodyModel[280].setRotationPoint(44F, -19F, 3F);

		bodyModel[281].addShapeBox(0F, 0F, 0F, 2, 0, 3, 0F,0F, -2F, 0F, -0.5F, -2F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, -0.5F, 2F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[281].setRotationPoint(44F, -18F, -10F);

		bodyModel[282].addShapeBox(0F, 0F, 0F, 2, 0, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 2F, 0F, 0F, 2F, 0F); // Box 0
		bodyModel[282].setRotationPoint(44F, -18F, 7F);

		bodyModel[283].addShapeBox(0F, 0F, 0F, 2, 0, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F); // Box 0
		bodyModel[283].setRotationPoint(44F, -15F, -11F);

		bodyModel[284].addShapeBox(0F, 0F, 0F, 2, 0, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 1F, 0F, 0F, 1F, 0F); // Box 0
		bodyModel[284].setRotationPoint(44F, -16F, 10F);

		bodyModel[285].addShapeBox(0F, 0F, 0F, 2, 17, 0, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 333
		bodyModel[285].setRotationPoint(44F, -15F, -11F);

		bodyModel[286].addShapeBox(0F, 0F, 0F, 2, 17, 0, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 334
		bodyModel[286].setRotationPoint(44F, -15F, 11F);

		bodyModel[287].addShapeBox(0F, 0F, 0F, 1, 17, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[287].setRotationPoint(45.5F, -15F, -11F);

		bodyModel[288].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[288].setRotationPoint(45.5F, 1F, -10F);

		bodyModel[289].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.8F, 0F, -0.5F, -0.8F, 0F, -0.5F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[289].setRotationPoint(45.5F, -16F, -4F);

		bodyModel[290].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 153
		bodyModel[290].setRotationPoint(45.5F, -16F, 1F);

		bodyModel[291].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[291].setRotationPoint(45.5F, -18F, -1F);

		bodyModel[292].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 128
		bodyModel[292].setRotationPoint(45.5F, -17.75F, -5F);

		bodyModel[293].addShapeBox(0F, 0F, 0F, 1, 17, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 247
		bodyModel[293].setRotationPoint(45.5F, -15F, 10F);

		bodyModel[294].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 255
		bodyModel[294].setRotationPoint(45.5F, -17.75F, 4F);

		bodyModel[295].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -0.5F, 1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[295].setRotationPoint(45.5F, -19F, -7F);

		bodyModel[296].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[296].setRotationPoint(45.5F, -19F, -3F);

		bodyModel[297].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 1F, 0F, 0F, 1F, 0F); // Box 0
		bodyModel[297].setRotationPoint(45.5F, -19F, 3F);

		bodyModel[298].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -2F, 0F, -0.5F, -2F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, -0.5F, 2F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[298].setRotationPoint(45.5F, -18F, -10F);

		bodyModel[299].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 2F, 0F, 0F, 2F, 0F); // Box 0
		bodyModel[299].setRotationPoint(45.5F, -18F, 7F);

		bodyModel[300].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[300].setRotationPoint(45.5F, -16F, -11F);

		bodyModel[301].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[301].setRotationPoint(45.5F, -16F, 10F);

		bodyModel[302].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[302].setRotationPoint(45.5F, 1F, 5F);

		bodyModel[303].addShapeBox(0F, 0F, 0F, 2, 0, 4, 0F,0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -0.5F, 1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[303].setRotationPoint(-49.5F, -19F, -7F);

		bodyModel[304].addShapeBox(0F, 0F, 0F, 2, 0, 6, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[304].setRotationPoint(-49.5F, -19F, -3F);

		bodyModel[305].addShapeBox(0F, 0F, 0F, 2, 0, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 1F, 0F, 0F, 1F, 0F); // Box 0
		bodyModel[305].setRotationPoint(-49.5F, -19F, 3F);

		bodyModel[306].addShapeBox(0F, 0F, 0F, 2, 0, 3, 0F,0F, -2F, 0F, -0.5F, -2F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, -0.5F, 2F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[306].setRotationPoint(-49.5F, -18F, -10F);

		bodyModel[307].addShapeBox(0F, 0F, 0F, 2, 0, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 2F, 0F, 0F, 2F, 0F); // Box 0
		bodyModel[307].setRotationPoint(-49.5F, -18F, 7F);

		bodyModel[308].addShapeBox(0F, 0F, 0F, 2, 0, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F); // Box 0
		bodyModel[308].setRotationPoint(-49.5F, -15F, -11F);

		bodyModel[309].addShapeBox(0F, 0F, 0F, 2, 0, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 1F, 0F, 0F, 1F, 0F); // Box 0
		bodyModel[309].setRotationPoint(-49.5F, -16F, 10F);

		bodyModel[310].addShapeBox(0F, 0F, 0F, 2, 17, 0, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 333
		bodyModel[310].setRotationPoint(-49.5F, -15F, -11F);

		bodyModel[311].addShapeBox(0F, 0F, 0F, 2, 17, 0, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 334
		bodyModel[311].setRotationPoint(-49.5F, -15F, 11F);

		bodyModel[312].addShapeBox(0F, 0F, 0F, 1, 17, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[312].setRotationPoint(-50F, -15F, -11F);

		bodyModel[313].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[313].setRotationPoint(-50F, 1F, -10F);

		bodyModel[314].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.8F, 0F, -0.5F, -0.8F, 0F, -0.5F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[314].setRotationPoint(-50F, -16F, -4F);

		bodyModel[315].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 153
		bodyModel[315].setRotationPoint(-50F, -16F, 1F);

		bodyModel[316].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[316].setRotationPoint(-50F, -18F, -1F);

		bodyModel[317].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 128
		bodyModel[317].setRotationPoint(-50F, -17.75F, -5F);

		bodyModel[318].addShapeBox(0F, 0F, 0F, 1, 17, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 247
		bodyModel[318].setRotationPoint(-50F, -15F, 10F);

		bodyModel[319].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 255
		bodyModel[319].setRotationPoint(-50F, -17.75F, 4F);

		bodyModel[320].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -0.5F, 1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[320].setRotationPoint(-50F, -19F, -7F);

		bodyModel[321].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[321].setRotationPoint(-50F, -19F, -3F);

		bodyModel[322].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 1F, 0F, 0F, 1F, 0F); // Box 0
		bodyModel[322].setRotationPoint(-50F, -19F, 3F);

		bodyModel[323].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -2F, 0F, -0.5F, -2F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, -0.5F, 2F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[323].setRotationPoint(-50F, -18F, -10F);

		bodyModel[324].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 2F, 0F, 0F, 2F, 0F); // Box 0
		bodyModel[324].setRotationPoint(-50F, -18F, 7F);

		bodyModel[325].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[325].setRotationPoint(-50F, -16F, -11F);

		bodyModel[326].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[326].setRotationPoint(-50F, 1F, 5F);

		bodyModel[327].addShapeBox(0F, 0F, 0F, 0, 2, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F); // Box 0
		bodyModel[327].setRotationPoint(36.5F, -20.43F, -5.25F);

		bodyModel[328].addShapeBox(0F, 0F, 0F, 0, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F, 0.75F, -0.5F, 0F, 0.75F, 0F, 0F, -0.75F, 0F, 0F); // Box 346
		bodyModel[328].setRotationPoint(36.5F, -20.43F, 3.25F);

		bodyModel[329].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[329].setRotationPoint(-50F, -16F, 10F);

		bodyModel[330].addBox(0F, 0F, 0F, 1, 4, 2, 0F); // Box 0
		bodyModel[330].setRotationPoint(17.5F, -16F, -1F);

		bodyModel[331].addBox(0F, 0F, 0F, 1, 4, 2, 0F); // Box 0
		bodyModel[331].setRotationPoint(13.5F, -16F, -1F);

		bodyModel[332].addBox(0F, 0F, 0F, 1, 4, 2, 0F); // Box 0
		bodyModel[332].setRotationPoint(15.5F, -16F, -1F);

		bodyModel[333].addBox(0F, 0F, 0F, 1, 4, 2, 0F); // Box 0
		bodyModel[333].setRotationPoint(10.5F, -16F, -1F);

		bodyModel[334].addBox(0F, 0F, 0F, 1, 4, 2, 0F); // Box 0
		bodyModel[334].setRotationPoint(6.5F, -16F, -1F);

		bodyModel[335].addBox(0F, 0F, 0F, 1, 4, 2, 0F); // Box 0
		bodyModel[335].setRotationPoint(8.5F, -16F, -1F);

		bodyModel[336].addBox(0F, 0F, 0F, 1, 4, 2, 0F); // Box 0
		bodyModel[336].setRotationPoint(-7.5F, -16F, -1F);

		bodyModel[337].addBox(0F, 0F, 0F, 1, 4, 2, 0F); // Box 0
		bodyModel[337].setRotationPoint(-11.5F, -16F, -1F);

		bodyModel[338].addBox(0F, 0F, 0F, 1, 4, 2, 0F); // Box 0
		bodyModel[338].setRotationPoint(-9.5F, -16F, -1F);

		bodyModel[339].addBox(0F, 0F, 0F, 1, 4, 2, 0F); // Box 0
		bodyModel[339].setRotationPoint(-14.5F, -16F, -1F);

		bodyModel[340].addBox(0F, 0F, 0F, 1, 4, 2, 0F); // Box 0
		bodyModel[340].setRotationPoint(-18.5F, -16F, -1F);

		bodyModel[341].addBox(0F, 0F, 0F, 1, 4, 2, 0F); // Box 0
		bodyModel[341].setRotationPoint(-16.5F, -16F, -1F);

		bodyModel[342].addShapeBox(0F, 0F, 0F, 12, 1, 3, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[342].setRotationPoint(6.5F, -18F, -1.5F);

		bodyModel[343].addShapeBox(0F, 0F, 0F, 12, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 0
		bodyModel[343].setRotationPoint(6.5F, -17F, -1.5F);

		bodyModel[344].addShapeBox(0F, 0F, 0F, 12, 1, 3, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[344].setRotationPoint(-18.5F, -18F, -1.5F);

		bodyModel[345].addShapeBox(0F, 0F, 0F, 12, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 0
		bodyModel[345].setRotationPoint(-18.5F, -17F, -1.5F);

		bodyModel[346].addBox(0F, 0F, 0F, 0, 11, 1, 0F); // Box 177
		bodyModel[346].setRotationPoint(9.5F, -9F, 10.75F);

		bodyModel[347].addBox(0F, 0F, 0F, 0, 11, 1, 0F); // Box 178
		bodyModel[347].setRotationPoint(4.5F, -9F, 10.75F);
	}
	ModelNewBlombergA1ATruck theTruck = new ModelNewBlombergA1ATruck();
	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		for (int i = 0; i < 348; i++) {
			if (bodyModel[i].boxName != null && bodyModel[i].boxName.contains("glow")) {
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
		if (entity instanceof AbstractTrains && AbstractTrains.getColorFromString(((AbstractTrains) entity).getColor()) == 11 || entity instanceof AbstractTrains && AbstractTrains.getColorFromString(((AbstractTrains) entity).getColor()) == 7 || entity instanceof AbstractTrains && AbstractTrains.getColorFromString(((AbstractTrains) entity).getColor()) == 8) {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/NewBlombergA1ATruckSilverFriction.png"));
		} else {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/NewBlombergA1ATruckBlackFriction.png"));
		}
		GL11.glPushMatrix();
		GL11.glTranslated(-1.85, -0.0, 0);
		theTruck.render(entity, f, f1, f2, f3, f4, f5);

		GL11.glTranslated(3.55, 0, 0);
		theTruck.render(entity, f, f1, f2, f3, f4, f5);
		GL11.glPopMatrix();

	}
	public ArrayList<double[]> getSmokePosition() {
		return new ArrayList<double[]>() {
			{
				add(new double[]{2.56D, 1.21D, 0D});
				add(new double[]{2.38D, 1.21D, 0D});
				add(new double[]{2.12D, 1.21D, 0D});
				add(new double[]{1.94D, 1.21D, 0D});
				add(new double[]{1.0D, 1.21D, 0D});
				add(new double[]{0.82D, 1.21D, 0D});
				add(new double[]{0.56D, 1.21D, 0D});
				add(new double[]{0.38D, 1.21D, 0D});
			}
		};
	}
}