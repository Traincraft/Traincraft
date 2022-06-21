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
import tmt.ModelConverter;
import tmt.ModelRendererTurbo;
import tmt.Tessellator;
import train.common.api.AbstractTrains;
import train.common.library.Info;

import java.util.ArrayList;

public class ModelEMDE8B extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 256;

	public ModelEMDE8B() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[259];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 231, 77, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 197, 101, textureX, textureY); // Box 1
		bodyModel[2] = new ModelRendererTurbo(this, 274, 160, textureX, textureY); // Box 1
		bodyModel[3] = new ModelRendererTurbo(this, 179, 128, textureX, textureY); // Box 0
		bodyModel[4] = new ModelRendererTurbo(this, 345, 128, textureX, textureY); // Box 0
		bodyModel[5] = new ModelRendererTurbo(this, 290, 158, textureX, textureY); // Box 1
		bodyModel[6] = new ModelRendererTurbo(this, 267, 146, textureX, textureY); // Box 1
		bodyModel[7] = new ModelRendererTurbo(this, 268, 146, textureX, textureY); // Box 1
		bodyModel[8] = new ModelRendererTurbo(this, 290, 146, textureX, textureY); // Box 1
		bodyModel[9] = new ModelRendererTurbo(this, 267, 109, textureX, textureY); // Box 0
		bodyModel[10] = new ModelRendererTurbo(this, 86, 23, textureX, textureY); // Box 0
		bodyModel[11] = new ModelRendererTurbo(this, 84, 15, textureX, textureY); // Box 0
		bodyModel[12] = new ModelRendererTurbo(this, 86, 9, textureX, textureY); // Box 0
		bodyModel[13] = new ModelRendererTurbo(this, 87, 29, textureX, textureY); // Box 0
		bodyModel[14] = new ModelRendererTurbo(this, 87, 4, textureX, textureY); // Box 0
		bodyModel[15] = new ModelRendererTurbo(this, 89, 34, textureX, textureY); // Box 0
		bodyModel[16] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 0
		bodyModel[17] = new ModelRendererTurbo(this, 256, 110, textureX, textureY); // Box 0
		bodyModel[18] = new ModelRendererTurbo(this, 264, 102, textureX, textureY); // Box 0
		bodyModel[19] = new ModelRendererTurbo(this, 261, 118, textureX, textureY); // Box 0
		bodyModel[20] = new ModelRendererTurbo(this, 273, 118, textureX, textureY); // Box 0
		bodyModel[21] = new ModelRendererTurbo(this, 259, 112, textureX, textureY); // Box 0
		bodyModel[22] = new ModelRendererTurbo(this, 273, 112, textureX, textureY); // Box 0
		bodyModel[23] = new ModelRendererTurbo(this, 270, 226, textureX, textureY); // Box 123
		bodyModel[24] = new ModelRendererTurbo(this, 261, 226, textureX, textureY); // Box 254
		bodyModel[25] = new ModelRendererTurbo(this, 270, 222, textureX, textureY); // Box 255
		bodyModel[26] = new ModelRendererTurbo(this, 319, 226, textureX, textureY); // Box 136
		bodyModel[27] = new ModelRendererTurbo(this, 261, 222, textureX, textureY); // Box 137
		bodyModel[28] = new ModelRendererTurbo(this, 319, 222, textureX, textureY); // Box 138
		bodyModel[29] = new ModelRendererTurbo(this, 160, 151, textureX, textureY); // Box 160
		bodyModel[30] = new ModelRendererTurbo(this, 410, 151, textureX, textureY); // Box 161
		bodyModel[31] = new ModelRendererTurbo(this, 325, 151, textureX, textureY); // Box 191
		bodyModel[32] = new ModelRendererTurbo(this, 245, 151, textureX, textureY); // Box 192
		bodyModel[33] = new ModelRendererTurbo(this, 191, 147, textureX, textureY); // Box 198
		bodyModel[34] = new ModelRendererTurbo(this, 191, 147, textureX, textureY); // Box 199
		bodyModel[35] = new ModelRendererTurbo(this, 392, 146, textureX, textureY); // Box 200
		bodyModel[36] = new ModelRendererTurbo(this, 392, 146, textureX, textureY); // Box 201
		bodyModel[37] = new ModelRendererTurbo(this, 253, 4, textureX, textureY); // Box 202
		bodyModel[38] = new ModelRendererTurbo(this, 264, 4, textureX, textureY); // Box 203
		bodyModel[39] = new ModelRendererTurbo(this, 413, 60, textureX, textureY); // Box 314
		bodyModel[40] = new ModelRendererTurbo(this, 420, 60, textureX, textureY); // Box 316
		bodyModel[41] = new ModelRendererTurbo(this, 273, 2, textureX, textureY); // Box 231
		bodyModel[42] = new ModelRendererTurbo(this, 384, 69, textureX, textureY,"glow"); // Box 247 headlight rear left
		bodyModel[43] = new ModelRendererTurbo(this, 312, 143, textureX, textureY); // Box 222
		bodyModel[44] = new ModelRendererTurbo(this, 301, 143, textureX, textureY); // Box 223
		bodyModel[45] = new ModelRendererTurbo(this, 263, 201, textureX, textureY); // Box 438
		bodyModel[46] = new ModelRendererTurbo(this, 263, 201, textureX, textureY); // Box 439
		bodyModel[47] = new ModelRendererTurbo(this, 293, 99, textureX, textureY); // Box 441
		bodyModel[48] = new ModelRendererTurbo(this, 28, 102, textureX, textureY); // Box 333
		bodyModel[49] = new ModelRendererTurbo(this, 28, 82, textureX, textureY); // Box 334
		bodyModel[50] = new ModelRendererTurbo(this, 384, 64, textureX, textureY,"glow"); // Box 418 headlight rear right
		bodyModel[51] = new ModelRendererTurbo(this, 392, 57, textureX, textureY); // Box 443
		bodyModel[52] = new ModelRendererTurbo(this, 397, 57, textureX, textureY); // Box 444
		bodyModel[53] = new ModelRendererTurbo(this, 409, 50, textureX, textureY); // Box 445
		bodyModel[54] = new ModelRendererTurbo(this, 363, 58, textureX, textureY); // Box 128
		bodyModel[55] = new ModelRendererTurbo(this, 371, 56, textureX, textureY); // Box 153
		bodyModel[56] = new ModelRendererTurbo(this, 371, 66, textureX, textureY); // Box 448
		bodyModel[57] = new ModelRendererTurbo(this, 402, 57, textureX, textureY); // Box 452 some door that magically vibes in the back
		bodyModel[58] = new ModelRendererTurbo(this, 379, 51, textureX, textureY); // Box 453
		bodyModel[59] = new ModelRendererTurbo(this, 379, 56, textureX, textureY); // Box 454
		bodyModel[60] = new ModelRendererTurbo(this, 360, 65, textureX, textureY); // Box 455
		bodyModel[61] = new ModelRendererTurbo(this, 275, 13, textureX, textureY); // Box 0
		bodyModel[62] = new ModelRendererTurbo(this, 292, 11, textureX, textureY); // Box 0
		bodyModel[63] = new ModelRendererTurbo(this, 288, 15, textureX, textureY); // Box 0
		bodyModel[64] = new ModelRendererTurbo(this, 301, 13, textureX, textureY); // Box 0
		bodyModel[65] = new ModelRendererTurbo(this, 292, 11, textureX, textureY); // Box 0
		bodyModel[66] = new ModelRendererTurbo(this, 250, 23, textureX, textureY); // Box 186
		bodyModel[67] = new ModelRendererTurbo(this, 328, 15, textureX, textureY); // Single Steam Genorator
		bodyModel[68] = new ModelRendererTurbo(this, 328, 19, textureX, textureY); // Single Steam Genorator
		bodyModel[69] = new ModelRendererTurbo(this, 312, 23, textureX, textureY); // Box 186
		bodyModel[70] = new ModelRendererTurbo(this, 284, 27, textureX, textureY); // Dynamic Brake fan
		bodyModel[71] = new ModelRendererTurbo(this, 119, 119, textureX, textureY); // Box 196
		bodyModel[72] = new ModelRendererTurbo(this, 295, 119, textureX, textureY); // Box 197
		bodyModel[73] = new ModelRendererTurbo(this, 422, 237, textureX, textureY); // Box 0
		bodyModel[74] = new ModelRendererTurbo(this, 422, 222, textureX, textureY); // Box 2
		bodyModel[75] = new ModelRendererTurbo(this, 422, 192, textureX, textureY); // Box 3
		bodyModel[76] = new ModelRendererTurbo(this, 422, 176, textureX, textureY); // Box 4
		bodyModel[77] = new ModelRendererTurbo(this, 430, 169, textureX, textureY); // Box 5
		bodyModel[78] = new ModelRendererTurbo(this, 430, 155, textureX, textureY); // Box 6
		bodyModel[79] = new ModelRendererTurbo(this, 430, 162, textureX, textureY); // Box 7
		bodyModel[80] = new ModelRendererTurbo(this, 396, 204, textureX, textureY); // Box 10
		bodyModel[81] = new ModelRendererTurbo(this, 407, 204, textureX, textureY); // Box 11
		bodyModel[82] = new ModelRendererTurbo(this, 385, 204, textureX, textureY); // Box 12
		bodyModel[83] = new ModelRendererTurbo(this, 394, 213, textureX, textureY); // Box 13
		bodyModel[84] = new ModelRendererTurbo(this, 381, 189, textureX, textureY); // Box 14
		bodyModel[85] = new ModelRendererTurbo(this, 422, 208, textureX, textureY); // Box 3
		bodyModel[86] = new ModelRendererTurbo(this, 364, 197, textureX, textureY); // Box 9
		bodyModel[87] = new ModelRendererTurbo(this, 397, 187, textureX, textureY); // Box 9
		bodyModel[88] = new ModelRendererTurbo(this, 364, 197, textureX, textureY); // Box 9
		bodyModel[89] = new ModelRendererTurbo(this, 392, 182, textureX, textureY); // Box 21
		bodyModel[90] = new ModelRendererTurbo(this, 370, 210, textureX, textureY); // Box 10
		bodyModel[91] = new ModelRendererTurbo(this, 370, 210, textureX, textureY); // Box 10
		bodyModel[92] = new ModelRendererTurbo(this, 393, 202, textureX, textureY); // Box 0
		bodyModel[93] = new ModelRendererTurbo(this, 393, 202, textureX, textureY); // Box 0
		bodyModel[94] = new ModelRendererTurbo(this, 393, 202, textureX, textureY); // Box 0
		bodyModel[95] = new ModelRendererTurbo(this, 393, 202, textureX, textureY); // Box 0
		bodyModel[96] = new ModelRendererTurbo(this, 393, 202, textureX, textureY); // Box 0
		bodyModel[97] = new ModelRendererTurbo(this, 393, 202, textureX, textureY); // Box 0
		bodyModel[98] = new ModelRendererTurbo(this, 422, 237, textureX, textureY); // Box 0
		bodyModel[99] = new ModelRendererTurbo(this, 422, 222, textureX, textureY); // Box 2
		bodyModel[100] = new ModelRendererTurbo(this, 422, 192, textureX, textureY); // Box 3
		bodyModel[101] = new ModelRendererTurbo(this, 422, 176, textureX, textureY); // Box 4
		bodyModel[102] = new ModelRendererTurbo(this, 430, 169, textureX, textureY); // Box 5
		bodyModel[103] = new ModelRendererTurbo(this, 430, 155, textureX, textureY); // Box 6
		bodyModel[104] = new ModelRendererTurbo(this, 430, 162, textureX, textureY); // Box 7
		bodyModel[105] = new ModelRendererTurbo(this, 396, 204, textureX, textureY); // Box 10
		bodyModel[106] = new ModelRendererTurbo(this, 385, 204, textureX, textureY); // Box 12
		bodyModel[107] = new ModelRendererTurbo(this, 394, 213, textureX, textureY); // Box 13
		bodyModel[108] = new ModelRendererTurbo(this, 381, 189, textureX, textureY); // Box 14
		bodyModel[109] = new ModelRendererTurbo(this, 422, 208, textureX, textureY); // Box 3
		bodyModel[110] = new ModelRendererTurbo(this, 364, 197, textureX, textureY); // Box 9
		bodyModel[111] = new ModelRendererTurbo(this, 397, 187, textureX, textureY); // Box 9
		bodyModel[112] = new ModelRendererTurbo(this, 364, 197, textureX, textureY); // Box 9
		bodyModel[113] = new ModelRendererTurbo(this, 392, 182, textureX, textureY); // Box 21
		bodyModel[114] = new ModelRendererTurbo(this, 370, 210, textureX, textureY); // Box 10
		bodyModel[115] = new ModelRendererTurbo(this, 370, 210, textureX, textureY); // Box 10
		bodyModel[116] = new ModelRendererTurbo(this, 393, 202, textureX, textureY); // Box 0
		bodyModel[117] = new ModelRendererTurbo(this, 393, 202, textureX, textureY); // Box 0
		bodyModel[118] = new ModelRendererTurbo(this, 393, 202, textureX, textureY); // Box 0
		bodyModel[119] = new ModelRendererTurbo(this, 393, 202, textureX, textureY); // Box 0
		bodyModel[120] = new ModelRendererTurbo(this, 393, 202, textureX, textureY); // Box 0
		bodyModel[121] = new ModelRendererTurbo(this, 393, 202, textureX, textureY); // Box 0
		bodyModel[122] = new ModelRendererTurbo(this, 409, 186, textureX, textureY); // Box 0
		bodyModel[123] = new ModelRendererTurbo(this, 409, 186, textureX, textureY); // Box 0
		bodyModel[124] = new ModelRendererTurbo(this, 379, 236, textureX, textureY); // Box 110
		bodyModel[125] = new ModelRendererTurbo(this, 369, 230, textureX, textureY); // Box 111
		bodyModel[126] = new ModelRendererTurbo(this, 384, 229, textureX, textureY); // Box 112
		bodyModel[127] = new ModelRendererTurbo(this, 401, 230, textureX, textureY); // Box 113
		bodyModel[128] = new ModelRendererTurbo(this, 401, 249, textureX, textureY); // Box 114
		bodyModel[129] = new ModelRendererTurbo(this, 384, 248, textureX, textureY); // Box 115
		bodyModel[130] = new ModelRendererTurbo(this, 407, 239, textureX, textureY); // Box 522
		bodyModel[131] = new ModelRendererTurbo(this, 374, 222, textureX, textureY); // Box 523
		bodyModel[132] = new ModelRendererTurbo(this, 385, 225, textureX, textureY); // Box 255
		bodyModel[133] = new ModelRendererTurbo(this, 385, 221, textureX, textureY); // Box 256
		bodyModel[134] = new ModelRendererTurbo(this, 407, 204, textureX, textureY); // Box 11
		bodyModel[135] = new ModelRendererTurbo(this, 369, 249, textureX, textureY); // Box 116
		bodyModel[136] = new ModelRendererTurbo(this, 379, 236, textureX, textureY); // Box 110
		bodyModel[137] = new ModelRendererTurbo(this, 369, 230, textureX, textureY); // Box 111
		bodyModel[138] = new ModelRendererTurbo(this, 384, 229, textureX, textureY); // Box 112
		bodyModel[139] = new ModelRendererTurbo(this, 401, 230, textureX, textureY); // Box 113
		bodyModel[140] = new ModelRendererTurbo(this, 401, 249, textureX, textureY); // Box 114
		bodyModel[141] = new ModelRendererTurbo(this, 384, 248, textureX, textureY); // Box 115
		bodyModel[142] = new ModelRendererTurbo(this, 407, 239, textureX, textureY); // Box 522
		bodyModel[143] = new ModelRendererTurbo(this, 374, 222, textureX, textureY); // Box 523
		bodyModel[144] = new ModelRendererTurbo(this, 385, 225, textureX, textureY); // Box 255
		bodyModel[145] = new ModelRendererTurbo(this, 385, 221, textureX, textureY); // Box 256
		bodyModel[146] = new ModelRendererTurbo(this, 369, 249, textureX, textureY); // Box 116
		bodyModel[147] = new ModelRendererTurbo(this, 303, 197, textureX, textureY); // Box 42
		bodyModel[148] = new ModelRendererTurbo(this, 278, 211, textureX, textureY); // Box 44
		bodyModel[149] = new ModelRendererTurbo(this, 308, 177, textureX, textureY); // Box 324
		bodyModel[150] = new ModelRendererTurbo(this, 278, 205, textureX, textureY); // Box 325
		bodyModel[151] = new ModelRendererTurbo(this, 307, 158, textureX, textureY); // Box 324
		bodyModel[152] = new ModelRendererTurbo(this, 320, 183, textureX, textureY); // Box 324
		bodyModel[153] = new ModelRendererTurbo(this, 287, 174, textureX, textureY); // Box 324
		bodyModel[154] = new ModelRendererTurbo(this, 320, 183, textureX, textureY); // Box 324
		bodyModel[155] = new ModelRendererTurbo(this, 317, 183, textureX, textureY); // Box 324
		bodyModel[156] = new ModelRendererTurbo(this, 317, 183, textureX, textureY); // Box 324
		bodyModel[157] = new ModelRendererTurbo(this, 275, 19, textureX, textureY); // Box 0
		bodyModel[158] = new ModelRendererTurbo(this, 288, 21, textureX, textureY); // Box 0
		bodyModel[159] = new ModelRendererTurbo(this, 301, 19, textureX, textureY); // Box 0
		bodyModel[160] = new ModelRendererTurbo(this, 236, 151, textureX, textureY); // Box 189
		bodyModel[161] = new ModelRendererTurbo(this, 332, 151, textureX, textureY); // Box 190
		bodyModel[162] = new ModelRendererTurbo(this, 395, 146, textureX, textureY); // Box 179
		bodyModel[163] = new ModelRendererTurbo(this, 395, 146, textureX, textureY); // Box 180
		bodyModel[164] = new ModelRendererTurbo(this, 331, 135, textureX, textureY); // Box 332 door swing right hood
		bodyModel[165] = new ModelRendererTurbo(this, 331, 128, textureX, textureY); // Box 335
		bodyModel[166] = new ModelRendererTurbo(this, 331, 148, textureX, textureY); // Box 337
		bodyModel[167] = new ModelRendererTurbo(this, 188, 147, textureX, textureY); // Box 177
		bodyModel[168] = new ModelRendererTurbo(this, 188, 147, textureX, textureY); // Box 178
		bodyModel[169] = new ModelRendererTurbo(this, 235, 135, textureX, textureY); // Box 329 door swing left hood
		bodyModel[170] = new ModelRendererTurbo(this, 235, 128, textureX, textureY); // Box 336
		bodyModel[171] = new ModelRendererTurbo(this, 235, 148, textureX, textureY); // Box 338
		bodyModel[172] = new ModelRendererTurbo(this, 337, 15, textureX, textureY); // Duel Steam Genorator
		bodyModel[173] = new ModelRendererTurbo(this, 337, 19, textureX, textureY); // Duel Steam Genorator
		bodyModel[174] = new ModelRendererTurbo(this, 337, 15, textureX, textureY); // Duel Steam Genorator
		bodyModel[175] = new ModelRendererTurbo(this, 337, 19, textureX, textureY); // Duel Steam Genorator
		bodyModel[176] = new ModelRendererTurbo(this, 248, 32, textureX, textureY); // Stupid UP snow sheild
		bodyModel[177] = new ModelRendererTurbo(this, 252, 23, textureX, textureY); // Stupid UP snow sheild
		bodyModel[178] = new ModelRendererTurbo(this, 252, 23, textureX, textureY); // Stupid UP snow sheild
		bodyModel[179] = new ModelRendererTurbo(this, 252, 23, textureX, textureY); // Stupid UP snow sheild
		bodyModel[180] = new ModelRendererTurbo(this, 252, 23, textureX, textureY); // Stupid UP snow sheild
		bodyModel[181] = new ModelRendererTurbo(this, 320, 32, textureX, textureY); // Stupid UP snow sheild
		bodyModel[182] = new ModelRendererTurbo(this, 252, 23, textureX, textureY); // Stupid UP snow sheild
		bodyModel[183] = new ModelRendererTurbo(this, 252, 23, textureX, textureY); // Stupid UP snow sheild
		bodyModel[184] = new ModelRendererTurbo(this, 252, 23, textureX, textureY); // Stupid UP snow sheild
		bodyModel[185] = new ModelRendererTurbo(this, 252, 23, textureX, textureY); // Stupid UP snow sheild
		bodyModel[186] = new ModelRendererTurbo(this, 297, 9, textureX, textureY); // Normal extentions
		bodyModel[187] = new ModelRendererTurbo(this, 297, 9, textureX, textureY); // Normal extentions
		bodyModel[188] = new ModelRendererTurbo(this, 287, 7, textureX, textureY); // Normal extention weird sides
		bodyModel[189] = new ModelRendererTurbo(this, 287, 7, textureX, textureY); // Normal extention weird sides
		bodyModel[190] = new ModelRendererTurbo(this, 297, 7, textureX, textureY); // Normal extention weird sides
		bodyModel[191] = new ModelRendererTurbo(this, 297, 7, textureX, textureY); // Normal extention weird sides
		bodyModel[192] = new ModelRendererTurbo(this, 296, 42, textureX, textureY); // MILW spark arresters
		bodyModel[193] = new ModelRendererTurbo(this, 296, 47, textureX, textureY); // MILW spark arresters
		bodyModel[194] = new ModelRendererTurbo(this, 288, 42, textureX, textureY); // MILW spark arresters
		bodyModel[195] = new ModelRendererTurbo(this, 288, 47, textureX, textureY); // MILW spark arrester support
		bodyModel[196] = new ModelRendererTurbo(this, 296, 42, textureX, textureY); // MILW spark arresters
		bodyModel[197] = new ModelRendererTurbo(this, 296, 47, textureX, textureY); // MILW spark arresters
		bodyModel[198] = new ModelRendererTurbo(this, 288, 42, textureX, textureY); // MILW spark arresters
		bodyModel[199] = new ModelRendererTurbo(this, 288, 47, textureX, textureY); // MILW spark arrester support
		bodyModel[200] = new ModelRendererTurbo(this, 193, 55, textureX, textureY); // Box 114
		bodyModel[201] = new ModelRendererTurbo(this, 193, 52, textureX, textureY); // Box 74
		bodyModel[202] = new ModelRendererTurbo(this, 193, 58, textureX, textureY); // Box 78
		bodyModel[203] = new ModelRendererTurbo(this, 197, 59, textureX, textureY); // Box 245
		bodyModel[204] = new ModelRendererTurbo(this, 198, 54, textureX, textureY); // Box 257
		bodyModel[205] = new ModelRendererTurbo(this, 213, 99, textureX, textureY); // Box 1
		bodyModel[206] = new ModelRendererTurbo(this, 190, 87, textureX, textureY); // Box 1
		bodyModel[207] = new ModelRendererTurbo(this, 191, 89, textureX, textureY); // Box 1
		bodyModel[208] = new ModelRendererTurbo(this, 220, 91, textureX, textureY); // Box 1
		bodyModel[209] = new ModelRendererTurbo(this, 142, 71, textureX, textureY); // Box 0
		bodyModel[210] = new ModelRendererTurbo(this, 178, 72, textureX, textureY); // Box 0
		bodyModel[211] = new ModelRendererTurbo(this, 186, 64, textureX, textureY); // Box 0
		bodyModel[212] = new ModelRendererTurbo(this, 183, 80, textureX, textureY); // Box 0
		bodyModel[213] = new ModelRendererTurbo(this, 195, 80, textureX, textureY); // Box 0
		bodyModel[214] = new ModelRendererTurbo(this, 181, 74, textureX, textureY); // Box 0
		bodyModel[215] = new ModelRendererTurbo(this, 195, 74, textureX, textureY); // Box 0
		bodyModel[216] = new ModelRendererTurbo(this, 253, 4, textureX, textureY); // Box 202
		bodyModel[217] = new ModelRendererTurbo(this, 264, 4, textureX, textureY); // Box 203
		bodyModel[218] = new ModelRendererTurbo(this, 273, 2, textureX, textureY); // Box 231
		bodyModel[219] = new ModelRendererTurbo(this, 329, 69, textureX, textureY,"glow"); // Box 247 headlight rear left
		bodyModel[220] = new ModelRendererTurbo(this, 217, 88, textureX, textureY); // Box 222
		bodyModel[221] = new ModelRendererTurbo(this, 213, 82, textureX, textureY); // Box 223
		bodyModel[222] = new ModelRendererTurbo(this, 329, 64, textureX, textureY,"glow"); // Box 418 headlight rear right
		bodyModel[223] = new ModelRendererTurbo(this, 307, 57, textureX, textureY); // Box 452 some door that magically vibes in the back
		bodyModel[224] = new ModelRendererTurbo(this, 49, 23, textureX, textureY); // Box 0
		bodyModel[225] = new ModelRendererTurbo(this, 43, 15, textureX, textureY); // Box 0
		bodyModel[226] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 0
		bodyModel[227] = new ModelRendererTurbo(this, 52, 29, textureX, textureY); // Box 0
		bodyModel[228] = new ModelRendererTurbo(this, 52, 4, textureX, textureY); // Box 0
		bodyModel[229] = new ModelRendererTurbo(this, 58, 34, textureX, textureY); // Box 0
		bodyModel[230] = new ModelRendererTurbo(this, 58, 1, textureX, textureY); // Box 0
		bodyModel[231] = new ModelRendererTurbo(this, 49, 62, textureX, textureY); // Box 0
		bodyModel[232] = new ModelRendererTurbo(this, 49, 43, textureX, textureY); // Box 0
		bodyModel[233] = new ModelRendererTurbo(this, 191, 147, textureX, textureY); // Box 198
		bodyModel[234] = new ModelRendererTurbo(this, 191, 147, textureX, textureY); // Box 199
		bodyModel[235] = new ModelRendererTurbo(this, 392, 146, textureX, textureY); // Box 200
		bodyModel[236] = new ModelRendererTurbo(this, 392, 146, textureX, textureY); // Box 201
		bodyModel[237] = new ModelRendererTurbo(this, 119, 110, textureX, textureY); // Box 196
		bodyModel[238] = new ModelRendererTurbo(this, 207, 110, textureX, textureY); // Box 197
		bodyModel[239] = new ModelRendererTurbo(this, 300, 60, textureX, textureY); // Box 314
		bodyModel[240] = new ModelRendererTurbo(this, 293, 60, textureX, textureY); // Box 316
		bodyModel[241] = new ModelRendererTurbo(this, 323, 57, textureX, textureY); // Box 443
		bodyModel[242] = new ModelRendererTurbo(this, 318, 57, textureX, textureY); // Box 444
		bodyModel[243] = new ModelRendererTurbo(this, 272, 52, textureX, textureY); // Box 445
		bodyModel[244] = new ModelRendererTurbo(this, 344, 58, textureX, textureY); // Box 128
		bodyModel[245] = new ModelRendererTurbo(this, 336, 56, textureX, textureY); // Box 153
		bodyModel[246] = new ModelRendererTurbo(this, 328, 66, textureX, textureY); // Box 448
		bodyModel[247] = new ModelRendererTurbo(this, 332, 51, textureX, textureY); // Box 453
		bodyModel[248] = new ModelRendererTurbo(this, 332, 56, textureX, textureY); // Box 454
		bodyModel[249] = new ModelRendererTurbo(this, 341, 65, textureX, textureY); // Box 455
		bodyModel[250] = new ModelRendererTurbo(this, 366, 156, textureX, textureY); // Box 13
		bodyModel[251] = new ModelRendererTurbo(this, 335, 147, textureX, textureY); // Box 13
		bodyModel[252] = new ModelRendererTurbo(this, 146, 40, textureX, textureY,"glow"); // Box 348 commander beacon
		bodyModel[253] = new ModelRendererTurbo(this, 145, 43, textureX, textureY); // Box 349
		bodyModel[254] = new ModelRendererTurbo(this, 168, 48, textureX, textureY); // Box 194
		bodyModel[255] = new ModelRendererTurbo(this, 154, 40, textureX, textureY); // Early CP horns
		bodyModel[256] = new ModelRendererTurbo(this, 157, 43, textureX, textureY); // horn base
		bodyModel[257] = new ModelRendererTurbo(this, 444, 68, textureX, textureY); // Box 131
		bodyModel[258] = new ModelRendererTurbo(this, 447, 70, textureX, textureY); // Box 131

		bodyModel[0].addBox(0F, 0F, 0F, 90, 1, 20, 0F); // Box 0
		bodyModel[0].setRotationPoint(-47F, 0F, -10F);

		bodyModel[1].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 1
		bodyModel[1].setRotationPoint(-51F, 3F, -1.5F);

		bodyModel[2].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 1
		bodyModel[2].setRotationPoint(44F, 3F, -1.5F);

		bodyModel[3].addBox(0F, 0F, 0F, 25, 17, 1, 0F); // Box 0
		bodyModel[3].setRotationPoint(-27F, -15F, -11F);

		bodyModel[4].addBox(0F, 0F, 0F, 25, 17, 1, 0F); // Box 0
		bodyModel[4].setRotationPoint(-27F, -15F, 10F);

		bodyModel[5].addBox(0F, 0F, 0F, 1, 3, 4, 0F); // Box 1
		bodyModel[5].setRotationPoint(43F, 3F, -2F);

		bodyModel[6].addBox(0F, 0F, 0F, 1, 2, 20, 0F); // Box 1
		bodyModel[6].setRotationPoint(43F, 1F, -10F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 1, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[7].setRotationPoint(43F, 3F, -10F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 1, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F); // Box 1
		bodyModel[8].setRotationPoint(43F, 3F, 2F);

		bodyModel[9].addBox(0F, 0F, 0F, 1, 16, 20, 0F); // Box 0
		bodyModel[9].setRotationPoint(43F, -15F, -10F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 78, 1, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[10].setRotationPoint(-34F, -19F, -7F);

		bodyModel[11].addBox(0F, 0F, 0F, 78, 1, 6, 0F); // Box 0
		bodyModel[11].setRotationPoint(-34F, -19F, -3F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 78, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 0
		bodyModel[12].setRotationPoint(-34F, -19F, 3F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 78, 1, 3, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[13].setRotationPoint(-34F, -18F, -10F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 78, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F); // Box 0
		bodyModel[14].setRotationPoint(-34F, -18F, 7F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 78, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[15].setRotationPoint(-34F, -16F, -11F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 78, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[16].setRotationPoint(-34F, -16F, 10F);

		bodyModel[17].addBox(0F, 0F, 0F, 1, 2, 14, 0F); // Box 0
		bodyModel[17].setRotationPoint(43F, -17F, -7F);

		bodyModel[18].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Box 0
		bodyModel[18].setRotationPoint(43F, -18F, -3F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[19].setRotationPoint(43F, -17F, -10F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[20].setRotationPoint(43F, -17F, 7F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[21].setRotationPoint(43F, -18F, -7F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[22].setRotationPoint(43F, -18F, 3F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 23, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 123
		bodyModel[23].setRotationPoint(-11.5F, 2F, -11F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F); // Box 254
		bodyModel[24].setRotationPoint(-14.5F, 2F, -11F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 23, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 255
		bodyModel[25].setRotationPoint(-11.5F, 2F, 10F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F); // Box 136
		bodyModel[26].setRotationPoint(-14.5F, 2F, 10F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -0.5F, 0F); // Box 137
		bodyModel[27].setRotationPoint(11.5F, 2F, 10F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -0.5F, 0F); // Box 138
		bodyModel[28].setRotationPoint(11.5F, 2F, -11F);

		bodyModel[29].addBox(0F, 0F, 0F, 3, 5, 0, 0F); // Box 160
		bodyModel[29].setRotationPoint(-47.5F, 2F, -11F);

		bodyModel[30].addBox(0F, 0F, 0F, 3, 5, 0, 0F); // Box 161
		bodyModel[30].setRotationPoint(-47.5F, 2F, 11F);

		bodyModel[31].addBox(0F, 0F, 0F, 3, 5, 0, 0F); // Box 191
		bodyModel[31].setRotationPoint(40.5F, 2F, 11F);

		bodyModel[32].addBox(0F, 0F, 0F, 3, 5, 0, 0F); // Box 192
		bodyModel[32].setRotationPoint(40.5F, 2F, -11F);

		bodyModel[33].addBox(0F, 0F, 0F, 0, 6, 1, 0F); // Box 198
		bodyModel[33].setRotationPoint(43.5F, -4F, -11.75F);

		bodyModel[34].addBox(0F, 0F, 0F, 0, 6, 1, 0F); // Box 199
		bodyModel[34].setRotationPoint(40.5F, -4F, -11.75F);

		bodyModel[35].addBox(0F, 0F, 0F, 0, 6, 1, 0F); // Box 200
		bodyModel[35].setRotationPoint(43.5F, -4F, 10.75F);

		bodyModel[36].addBox(0F, 0F, 0F, 0, 6, 1, 0F); // Box 201
		bodyModel[36].setRotationPoint(40.5F, -4F, 10.75F);

		bodyModel[37].addBox(0F, 0F, 0F, 2, 1, 6, 0F); // Box 202
		bodyModel[37].setRotationPoint(44F, -19F, -3F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, -1F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -2F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 203
		bodyModel[38].setRotationPoint(44F, -19F, -7F);

		bodyModel[39].addBox(0F, 0F, 0F, 2, 15, 1, 0F); // Box 314
		bodyModel[39].setRotationPoint(44F, -14F, -4F);

		bodyModel[40].addBox(0F, 0F, 0F, 2, 15, 1, 0F); // Box 316
		bodyModel[40].setRotationPoint(44F, -14F, 3F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, -2F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 1F, 0F, 0F, 1F, 0F); // Box 231
		bodyModel[41].setRotationPoint(44F, -19F, 3F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 247 headlight rear left
		bodyModel[42].setRotationPoint(43.5F, -10.5F, -9F);

		bodyModel[43].addBox(0F, 0F, 0F, 0, 5, 5, 0F); // Box 222
		bodyModel[43].setRotationPoint(44.01F, 2F, -10F);

		bodyModel[44].addBox(0F, 0F, 0F, 0, 5, 5, 0F); // Box 223
		bodyModel[44].setRotationPoint(44.01F, 2F, 5F);

		bodyModel[45].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 438
		bodyModel[45].setRotationPoint(25.5F, 3F, -2F);

		bodyModel[46].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 439
		bodyModel[46].setRotationPoint(-31.5F, 3F, -2F);

		bodyModel[47].addBox(0F, 0F, 0F, 90, 2, 14, 0F); // Box 441
		bodyModel[47].setRotationPoint(-47F, 1F, -7F);

		bodyModel[48].addBox(0F, 0F, 0F, 42, 17, 1, 0F); // Box 333
		bodyModel[48].setRotationPoint(2F, -15F, -11F);

		bodyModel[49].addBox(0F, 0F, 0F, 42, 17, 1, 0F); // Box 334
		bodyModel[49].setRotationPoint(2F, -15F, 10F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 418 headlight rear right
		bodyModel[50].setRotationPoint(43.5F, -10.5F, 7F);

		bodyModel[51].addBox(0F, 0F, 0F, 1, 17, 1, 0F); // Box 443
		bodyModel[51].setRotationPoint(45F, -15F, 4F);

		bodyModel[52].addBox(0F, 0F, 0F, 1, 17, 1, 0F); // Box 444
		bodyModel[52].setRotationPoint(45F, -15F, -5F);

		bodyModel[53].addBox(0F, 0F, 0F, 2, 1, 8, 0F); // Box 445
		bodyModel[53].setRotationPoint(44F, -15F, -4F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[54].setRotationPoint(45F, -16F, -5F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 153
		bodyModel[55].setRotationPoint(45F, -16F, 0F);

		bodyModel[56].addBox(0F, 0F, 0F, 2, 1, 8, 0F); // Box 448
		bodyModel[56].setRotationPoint(44F, 1F, -4F);

		bodyModel[57].addBox(0F, 0F, 0F, 1, 14, 4, 0F); // Box 452 some door that magically vibes in the back
		bodyModel[57].setRotationPoint(43.5F, -13F, -2F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 453
		bodyModel[58].setRotationPoint(44F, -14F, 0F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 454
		bodyModel[59].setRotationPoint(44F, -14F, -3F);

		bodyModel[60].addBox(0F, 0F, 0F, 2, 1, 7, 0F); // Box 455
		bodyModel[60].setRotationPoint(44F, 2F, -3.5F);

		bodyModel[61].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 0
		bodyModel[61].setRotationPoint(-20.5F, -20F, -2F);

		bodyModel[62].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 0
		bodyModel[62].setRotationPoint(-5.5F, -20F, -1F);

		bodyModel[63].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 0
		bodyModel[63].setRotationPoint(-16.25F, -20F, -2F);

		bodyModel[64].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 0
		bodyModel[64].setRotationPoint(-12F, -20F, -2F);

		bodyModel[65].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 0
		bodyModel[65].setRotationPoint(4.5F, -20F, -1F);

		bodyModel[66].addBox(0F, 0F, 0F, 9, 2, 6, 0F); // Box 186
		bodyModel[66].setRotationPoint(-25.4F, -21F, -3F);

		bodyModel[67].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Single Steam Genorator
		bodyModel[67].setRotationPoint(30.5F, -20F, 0F);

		bodyModel[68].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Single Steam Genorator
		bodyModel[68].setRotationPoint(34.5F, -20F, -2F);

		bodyModel[69].addBox(0F, 0F, 0F, 9, 2, 6, 0F); // Box 186
		bodyModel[69].setRotationPoint(16.35F, -21F, -3F);

		bodyModel[70].addBox(0F, 0F, 0F, 6, 1, 6, 0F); // Dynamic Brake fan
		bodyModel[70].setRotationPoint(-3F, -20F, -3F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 67, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F); // Box 196
		bodyModel[71].setRotationPoint(-24F, -14.5F, -11.25F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 67, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F); // Box 197
		bodyModel[72].setRotationPoint(-24F, -14.5F, 10.25F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 17, 3, 12, 0F,0F, 0F, -1.5F, -2F, 0F, -1.5F, -2F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 0
		bodyModel[73].setRotationPoint(5F, -3F, -6F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 17, 2, 12, 0F,0F, 0F, -0.25F, -2F, 0F, -0.25F, -2F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -1.5F, -2F, 0F, -1.5F, -2F, 0F, -1.5F, 0F, 0F, -1.5F); // Box 2
		bodyModel[74].setRotationPoint(5F, -5F, -6F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 17, 2, 12, 0F,0F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, -2F, 0F, -0.25F, -2F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 3
		bodyModel[75].setRotationPoint(5F, -8F, -6F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 17, 2, 12, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 4
		bodyModel[76].setRotationPoint(5F, -10F, -6F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 17, 2, 4, 0F,0F, -2F, 0F, -2F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 5
		bodyModel[77].setRotationPoint(5F, -12F, -6F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 17, 2, 4, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[78].setRotationPoint(5F, -12F, 2F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 17, 2, 4, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 7
		bodyModel[79].setRotationPoint(5F, -12F, -2F);

		bodyModel[80].addBox(0F, 0F, 0F, 1, 4, 4, 0F); // Box 10
		bodyModel[80].setRotationPoint(20F, -14F, -2F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[81].setRotationPoint(20F, -14F, -6F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		bodyModel[82].setRotationPoint(20F, -14F, 2F);

		bodyModel[83].addBox(0F, 0F, 0F, 1, 8, 6, 0F); // Box 13
		bodyModel[83].setRotationPoint(20F, -10F, -3F);

		bodyModel[84].addBox(0F, 0F, 0F, 2, 4, 3, 0F); // Box 14
		bodyModel[84].setRotationPoint(3F, -4F, -5F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 17, 1, 12, 0F,0F, 0F, -0.25F, -2F, 0F, -0.25F, -2F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -2F, 0F, -0.25F, -2F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 3
		bodyModel[85].setRotationPoint(5F, -6F, -6F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 14, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 9
		bodyModel[86].setRotationPoint(5F, -15F, -1.5F);

		bodyModel[87].addBox(0F, 0F, 0F, 1, 4, 8, 0F); // Box 9
		bodyModel[87].setRotationPoint(4F, -12F, -4F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 14, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 9
		bodyModel[88].setRotationPoint(5F, -14F, -1.5F);

		bodyModel[89].addBox(0F, 0F, 0F, 1, 7, 5, 0F); // Box 21
		bodyModel[89].setRotationPoint(4F, -8F, -2F);

		bodyModel[90].addBox(0F, 0F, 0F, 5, 3, 3, 0F); // Box 10
		bodyModel[90].setRotationPoint(21F, -13F, 3F);

		bodyModel[91].addBox(0F, 0F, 0F, 5, 3, 3, 0F); // Box 10
		bodyModel[91].setRotationPoint(21F, -13F, -6F);

		bodyModel[92].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 0
		bodyModel[92].setRotationPoint(17.5F, -14F, -1F);

		bodyModel[93].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 0
		bodyModel[93].setRotationPoint(13.5F, -14F, -1F);

		bodyModel[94].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 0
		bodyModel[94].setRotationPoint(15.5F, -14F, -1F);

		bodyModel[95].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 0
		bodyModel[95].setRotationPoint(10.5F, -14F, -1F);

		bodyModel[96].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 0
		bodyModel[96].setRotationPoint(6.5F, -14F, -1F);

		bodyModel[97].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 0
		bodyModel[97].setRotationPoint(8.5F, -14F, -1F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 17, 3, 12, 0F,0F, 0F, -1.5F, -2F, 0F, -1.5F, -2F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 0
		bodyModel[98].setRotationPoint(-20F, -3F, -6F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 17, 2, 12, 0F,0F, 0F, -0.25F, -2F, 0F, -0.25F, -2F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -1.5F, -2F, 0F, -1.5F, -2F, 0F, -1.5F, 0F, 0F, -1.5F); // Box 2
		bodyModel[99].setRotationPoint(-20F, -5F, -6F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 17, 2, 12, 0F,0F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, -2F, 0F, -0.25F, -2F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 3
		bodyModel[100].setRotationPoint(-20F, -8F, -6F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 17, 2, 12, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 4
		bodyModel[101].setRotationPoint(-20F, -10F, -6F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 17, 2, 4, 0F,0F, -2F, 0F, -2F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 5
		bodyModel[102].setRotationPoint(-20F, -12F, -6F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 17, 2, 4, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[103].setRotationPoint(-20F, -12F, 2F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 17, 2, 4, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 7
		bodyModel[104].setRotationPoint(-20F, -12F, -2F);

		bodyModel[105].addBox(0F, 0F, 0F, 1, 4, 4, 0F); // Box 10
		bodyModel[105].setRotationPoint(-21F, -14F, -2F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		bodyModel[106].setRotationPoint(-21F, -14F, 2F);

		bodyModel[107].addBox(0F, 0F, 0F, 1, 8, 6, 0F); // Box 13
		bodyModel[107].setRotationPoint(-21F, -10F, -3F);

		bodyModel[108].addBox(0F, 0F, 0F, 2, 4, 3, 0F); // Box 14
		bodyModel[108].setRotationPoint(-5F, -4F, -5F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 17, 1, 12, 0F,0F, 0F, -0.25F, -2F, 0F, -0.25F, -2F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -2F, 0F, -0.25F, -2F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 3
		bodyModel[109].setRotationPoint(-20F, -6F, -6F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 14, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 9
		bodyModel[110].setRotationPoint(-19F, -15F, -1.5F);

		bodyModel[111].addBox(0F, 0F, 0F, 1, 4, 8, 0F); // Box 9
		bodyModel[111].setRotationPoint(-5F, -12F, -4F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 14, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 9
		bodyModel[112].setRotationPoint(-19F, -14F, -1.5F);

		bodyModel[113].addBox(0F, 0F, 0F, 1, 7, 5, 0F); // Box 21
		bodyModel[113].setRotationPoint(-5F, -8F, -2F);

		bodyModel[114].addBox(0F, 0F, 0F, 5, 3, 3, 0F); // Box 10
		bodyModel[114].setRotationPoint(-26F, -13F, 3F);

		bodyModel[115].addBox(0F, 0F, 0F, 5, 3, 3, 0F); // Box 10
		bodyModel[115].setRotationPoint(-26F, -13F, -6F);

		bodyModel[116].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 0
		bodyModel[116].setRotationPoint(-7.5F, -14F, -1F);

		bodyModel[117].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 0
		bodyModel[117].setRotationPoint(-11.5F, -14F, -1F);

		bodyModel[118].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 0
		bodyModel[118].setRotationPoint(-9.5F, -14F, -1F);

		bodyModel[119].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 0
		bodyModel[119].setRotationPoint(-14.5F, -14F, -1F);

		bodyModel[120].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 0
		bodyModel[120].setRotationPoint(-18.5F, -14F, -1F);

		bodyModel[121].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 0
		bodyModel[121].setRotationPoint(-16.5F, -14F, -1F);

		bodyModel[122].addBox(0F, 0F, 0F, 1, 5, 2, 0F); // Box 0
		bodyModel[122].setRotationPoint(-5.5F, -18F, -1F);

		bodyModel[123].addBox(0F, 0F, 0F, 1, 5, 2, 0F); // Box 0
		bodyModel[123].setRotationPoint(4.5F, -18F, -1F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 5, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 110
		bodyModel[124].setRotationPoint(-25F, -5.5F, -4F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 5, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Box 111
		bodyModel[125].setRotationPoint(-25F, -8F, 1.5F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 5, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 112
		bodyModel[126].setRotationPoint(-25F, -8F, -1.5F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 5, 3, 2, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 113
		bodyModel[127].setRotationPoint(-25F, -8F, -3.5F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 5, 3, 2, 0F,0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 114
		bodyModel[128].setRotationPoint(-25F, -3F, -3.5F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 5, 3, 3, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 115
		bodyModel[129].setRotationPoint(-25F, -3F, -1.5F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 3, 5, 3, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 522
		bodyModel[130].setRotationPoint(-28F, -5F, -1.5F);

		bodyModel[131].addBox(0F, 0F, 0F, 2, 3, 3, 0F); // Box 523
		bodyModel[131].setRotationPoint(-25F, -11F, -1.5F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 255
		bodyModel[132].setRotationPoint(-23F, -9.5F, -1F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 256
		bodyModel[133].setRotationPoint(-23F, -10.5F, -1F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[134].setRotationPoint(-21F, -14F, -6F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 5, 3, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 116
		bodyModel[135].setRotationPoint(-25F, -3F, 1.5F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 5, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 110
		bodyModel[136].setRotationPoint(20F, -5.5F, -4F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 5, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Box 111
		bodyModel[137].setRotationPoint(20F, -8F, 1.5F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 5, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 112
		bodyModel[138].setRotationPoint(20F, -8F, -1.5F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 5, 3, 2, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 113
		bodyModel[139].setRotationPoint(20F, -8F, -3.5F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 5, 3, 2, 0F,0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 114
		bodyModel[140].setRotationPoint(20F, -3F, -3.5F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 5, 3, 3, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 115
		bodyModel[141].setRotationPoint(20F, -3F, -1.5F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 3, 5, 3, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 522
		bodyModel[142].setRotationPoint(25F, -5F, -1.5F);

		bodyModel[143].addBox(0F, 0F, 0F, 2, 3, 3, 0F); // Box 523
		bodyModel[143].setRotationPoint(23F, -11F, -1.5F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 255
		bodyModel[144].setRotationPoint(21F, -9.5F, -1F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 256
		bodyModel[145].setRotationPoint(21F, -10.5F, -1F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 5, 3, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 116
		bodyModel[146].setRotationPoint(20F, -3F, 1.5F);

		bodyModel[147].addBox(0F, 0F, 0F, 20, 4, 20, 0F); // Box 42
		bodyModel[147].setRotationPoint(-10F, 2F, -10F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 20, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -2F, 0F, -0.25F, -2F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 44
		bodyModel[148].setRotationPoint(-10F, 6F, -10F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 20, 3, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 324
		bodyModel[149].setRotationPoint(-10F, 6F, -8F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 20, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -2F, 0F, -0.25F, -2F); // Box 325
		bodyModel[150].setRotationPoint(-10F, 6F, 8F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 2, 2, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 324
		bodyModel[151].setRotationPoint(-13F, 6F, -8F);
		bodyModel[151].rotateAngleZ = 0.78539816F;

		bodyModel[152].addShapeBox(0F, 0F, 0F, 1, 6, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 324
		bodyModel[152].setRotationPoint(10.92F, 1F, -8.01F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 2, 2, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 324
		bodyModel[153].setRotationPoint(10F, 6F, -8F);
		bodyModel[153].rotateAngleZ = 0.78539816F;

		bodyModel[154].addShapeBox(0F, 0F, 0F, 1, 6, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 324
		bodyModel[154].setRotationPoint(10.92F, 1F, 8.01F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 1, 6, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 324
		bodyModel[155].setRotationPoint(-12.1F, 1F, -8.01F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 1, 6, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 324
		bodyModel[156].setRotationPoint(-12.1F, 1F, 8.01F);

		bodyModel[157].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 0
		bodyModel[157].setRotationPoint(8F, -20F, -2F);

		bodyModel[158].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 0
		bodyModel[158].setRotationPoint(12.25F, -20F, -2F);

		bodyModel[159].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 0
		bodyModel[159].setRotationPoint(16.5F, -20F, -2F);

		bodyModel[160].addBox(0F, 0F, 0F, 4, 5, 0, 0F); // Box 189
		bodyModel[160].setRotationPoint(-2F, 2F, -11.01F);

		bodyModel[161].addBox(0F, 0F, 0F, 4, 5, 0, 0F); // Box 190
		bodyModel[161].setRotationPoint(-2F, 2F, 11.01F);

		bodyModel[162].addBox(0F, 0F, 0F, 0, 11, 1, 0F); // Box 179
		bodyModel[162].setRotationPoint(2.5F, -9F, 10.75F);

		bodyModel[163].addBox(0F, 0F, 0F, 0, 11, 1, 0F); // Box 180
		bodyModel[163].setRotationPoint(-2.5F, -9F, 10.75F);

		bodyModel[164].addShapeBox(-3.5F, 0F, -0.5F, 4, 11, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 332 door swing right hood
		bodyModel[164].setRotationPoint(1.5F, -10F, 10.5F);

		bodyModel[165].addBox(0F, 0F, 0F, 4, 5, 1, 0F); // Box 335
		bodyModel[165].setRotationPoint(-2F, -15F, 10F);

		bodyModel[166].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 337
		bodyModel[166].setRotationPoint(-2F, 1F, 10F);

		bodyModel[167].addBox(0F, 0F, 0F, 0, 11, 1, 0F); // Box 177
		bodyModel[167].setRotationPoint(2.5F, -9F, -11.75F);

		bodyModel[168].addBox(0F, 0F, 0F, 0, 11, 1, 0F); // Box 178
		bodyModel[168].setRotationPoint(-2.5F, -9F, -11.75F);

		bodyModel[169].addShapeBox(-3.5F, 0F, -0.5F, 4, 11, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 329 door swing left hood
		bodyModel[169].setRotationPoint(1.5F, -10F, -10.5F);

		bodyModel[170].addBox(0F, 0F, 0F, 4, 5, 1, 0F); // Box 336
		bodyModel[170].setRotationPoint(-2F, -15F, -11F);

		bodyModel[171].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 338
		bodyModel[171].setRotationPoint(-2F, 1F, -11F);

		bodyModel[172].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Duel Steam Genorator
		bodyModel[172].setRotationPoint(31.5F, -19.7F, -4F);

		bodyModel[173].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Duel Steam Genorator
		bodyModel[173].setRotationPoint(37.5F, -19.7F, -4F);

		bodyModel[174].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Duel Steam Genorator
		bodyModel[174].setRotationPoint(31.5F, -19.7F, 2F);

		bodyModel[175].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Duel Steam Genorator
		bodyModel[175].setRotationPoint(37.5F, -19.7F, 2F);

		bodyModel[176].addBox(0F, 0F, 0F, 4, 0, 8, 0F); // Stupid UP snow sheild
		bodyModel[176].setRotationPoint(-25F, -21.25F, -4F);

		bodyModel[177].addBox(0F, 0F, 0F, 1, 3, 0, 0F); // Stupid UP snow sheild
		bodyModel[177].setRotationPoint(-25F, -21.25F, -3.01F);

		bodyModel[178].addBox(0F, 0F, 0F, 1, 3, 0, 0F); // Stupid UP snow sheild
		bodyModel[178].setRotationPoint(-25F, -21.25F, 3.01F);

		bodyModel[179].addBox(0F, 0F, 0F, 1, 3, 0, 0F); // Stupid UP snow sheild
		bodyModel[179].setRotationPoint(-22F, -21.25F, -3.01F);

		bodyModel[180].addBox(0F, 0F, 0F, 1, 3, 0, 0F); // Stupid UP snow sheild
		bodyModel[180].setRotationPoint(-22F, -21.25F, 3.01F);

		bodyModel[181].addBox(0F, 0F, 0F, 4, 0, 8, 0F); // Stupid UP snow sheild
		bodyModel[181].setRotationPoint(21F, -21.25F, -4F);

		bodyModel[182].addBox(0F, 0F, 0F, 1, 3, 0, 0F); // Stupid UP snow sheild
		bodyModel[182].setRotationPoint(21F, -21.25F, -3.01F);

		bodyModel[183].addBox(0F, 0F, 0F, 1, 3, 0, 0F); // Stupid UP snow sheild
		bodyModel[183].setRotationPoint(21F, -21.25F, 3.01F);

		bodyModel[184].addBox(0F, 0F, 0F, 1, 3, 0, 0F); // Stupid UP snow sheild
		bodyModel[184].setRotationPoint(24F, -21.25F, -3.01F);

		bodyModel[185].addBox(0F, 0F, 0F, 1, 3, 0, 0F); // Stupid UP snow sheild
		bodyModel[185].setRotationPoint(24F, -21.25F, 3.01F);

		bodyModel[186].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Normal extentions
		bodyModel[186].setRotationPoint(-5.5F, -21F, -1F);

		bodyModel[187].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Normal extentions
		bodyModel[187].setRotationPoint(4.5F, -21F, -1F);

		bodyModel[188].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -1F, 0.5F, 0F, -1F, 0.5F, 0F, -1F, 0.5F, 0F, -1F, 0.5F, 0F); // Normal extention weird sides
		bodyModel[188].setRotationPoint(3.5F, -21F, -1.01F);

		bodyModel[189].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -1F, 0.5F, 0F, -1F, 0.5F, 0F, -1F, 0.5F, 0F, -1F, 0.5F, 0F); // Normal extention weird sides
		bodyModel[189].setRotationPoint(3.5F, -21F, 1.01F);

		bodyModel[190].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -1F, 0.5F, 0F, -1F, 0.5F, 0F, -1F, 0.5F, 0F, -1F, 0.5F, 0F); // Normal extention weird sides
		bodyModel[190].setRotationPoint(-6.5F, -21F, -1.01F);

		bodyModel[191].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -1F, 0.5F, 0F, -1F, 0.5F, 0F, -1F, 0.5F, 0F, -1F, 0.5F, 0F); // Normal extention weird sides
		bodyModel[191].setRotationPoint(-6.5F, -21F, 1.01F);

		bodyModel[192].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // MILW spark arresters
		bodyModel[192].setRotationPoint(-7.5F, -21.5F, -1.5F);

		bodyModel[193].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // MILW spark arresters
		bodyModel[193].setRotationPoint(-7.5F, -20.5F, -1.5F);

		bodyModel[194].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // MILW spark arresters
		bodyModel[194].setRotationPoint(-7.49F, -22.5F, -1F);

		bodyModel[195].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // MILW spark arrester support
		bodyModel[195].setRotationPoint(-7.49F, -20.5F, -1F);

		bodyModel[196].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // MILW spark arresters
		bodyModel[196].setRotationPoint(4.5F, -21.5F, -1.5F);

		bodyModel[197].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // MILW spark arresters
		bodyModel[197].setRotationPoint(4.5F, -20.5F, -1.5F);

		bodyModel[198].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // MILW spark arresters
		bodyModel[198].setRotationPoint(6.51F, -22.5F, -1F);

		bodyModel[199].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // MILW spark arrester support
		bodyModel[199].setRotationPoint(6.51F, -20.5F, -1F);

		bodyModel[200].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 114
		bodyModel[200].setRotationPoint(-0.5F, -18.5F, 8.7F);

		bodyModel[201].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[201].setRotationPoint(-0.5F, -19.5F, 8.7F);

		bodyModel[202].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 78
		bodyModel[202].setRotationPoint(-0.25F, -18F, 8.95F);

		bodyModel[203].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 245
		bodyModel[203].setRotationPoint(-0.5F, -20.5F, 7.5F);

		bodyModel[204].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 257
		bodyModel[204].setRotationPoint(-0.5F, -19.5F, 6.5F);

		bodyModel[205].addBox(0F, 0F, 0F, 1, 3, 4, 0F); // Box 1
		bodyModel[205].setRotationPoint(-48F, 3F, -2F);

		bodyModel[206].addBox(0F, 0F, 0F, 1, 2, 20, 0F); // Box 1
		bodyModel[206].setRotationPoint(-48F, 1F, -10F);

		bodyModel[207].addShapeBox(0F, 0F, 0F, 1, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[207].setRotationPoint(-48F, 3F, -10F);

		bodyModel[208].addShapeBox(0F, 0F, 0F, 1, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F); // Box 1
		bodyModel[208].setRotationPoint(-48F, 3F, 2F);

		bodyModel[209].addBox(0F, 0F, 0F, 1, 16, 20, 0F); // Box 0
		bodyModel[209].setRotationPoint(-48F, -15F, -10F);

		bodyModel[210].addBox(0F, 0F, 0F, 1, 2, 14, 0F); // Box 0
		bodyModel[210].setRotationPoint(-48F, -17F, -7F);

		bodyModel[211].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Box 0
		bodyModel[211].setRotationPoint(-48F, -18F, -3F);

		bodyModel[212].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[212].setRotationPoint(-48F, -17F, -10F);

		bodyModel[213].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[213].setRotationPoint(-48F, -17F, 7F);

		bodyModel[214].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[214].setRotationPoint(-48F, -18F, -7F);

		bodyModel[215].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[215].setRotationPoint(-48F, -18F, 3F);

		bodyModel[216].addBox(0F, 0F, 0F, 2, 1, 6, 0F); // Box 202
		bodyModel[216].setRotationPoint(-50F, -19F, -3F);

		bodyModel[217].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,-2F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 203
		bodyModel[217].setRotationPoint(-50F, -19F, -7F);

		bodyModel[218].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -2F, 1F, 0F); // Box 231
		bodyModel[218].setRotationPoint(-50F, -19F, 3F);

		bodyModel[219].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 247 headlight rear left
		bodyModel[219].setRotationPoint(-49F, -10.5F, -9F);

		bodyModel[220].addBox(0F, 0F, 0F, 0, 5, 5, 0F); // Box 222
		bodyModel[220].setRotationPoint(-48.01F, 2F, -10F);

		bodyModel[221].addBox(0F, 0F, 0F, 0, 5, 5, 0F); // Box 223
		bodyModel[221].setRotationPoint(-48.01F, 2F, 5F);

		bodyModel[222].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 418 headlight rear right
		bodyModel[222].setRotationPoint(-49F, -10.5F, 7F);

		bodyModel[223].addBox(0F, 0F, 0F, 1, 14, 4, 0F); // Box 452 some door that magically vibes in the back
		bodyModel[223].setRotationPoint(-49F, -13F, -2F);

		bodyModel[224].addShapeBox(0F, 0F, 0F, 14, 1, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[224].setRotationPoint(-48F, -19F, -7F);

		bodyModel[225].addBox(0F, 0F, 0F, 14, 1, 6, 0F); // Box 0
		bodyModel[225].setRotationPoint(-48F, -19F, -3F);

		bodyModel[226].addShapeBox(0F, 0F, 0F, 14, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 0
		bodyModel[226].setRotationPoint(-48F, -19F, 3F);

		bodyModel[227].addShapeBox(0F, 0F, 0F, 14, 1, 3, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[227].setRotationPoint(-48F, -18F, -10F);

		bodyModel[228].addShapeBox(0F, 0F, 0F, 14, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F); // Box 0
		bodyModel[228].setRotationPoint(-48F, -18F, 7F);

		bodyModel[229].addShapeBox(0F, 0F, 0F, 14, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[229].setRotationPoint(-48F, -16F, -11F);

		bodyModel[230].addShapeBox(0F, 0F, 0F, 14, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[230].setRotationPoint(-48F, -16F, 10F);

		bodyModel[231].addBox(0F, 0F, 0F, 21, 17, 1, 0F); // Box 0
		bodyModel[231].setRotationPoint(-48F, -15F, -11F);

		bodyModel[232].addBox(0F, 0F, 0F, 21, 17, 1, 0F); // Box 0
		bodyModel[232].setRotationPoint(-48F, -15F, 10F);

		bodyModel[233].addBox(0F, 0F, 0F, 0, 6, 1, 0F); // Box 198
		bodyModel[233].setRotationPoint(-44.5F, -4F, -11.75F);

		bodyModel[234].addBox(0F, 0F, 0F, 0, 6, 1, 0F); // Box 199
		bodyModel[234].setRotationPoint(-47.5F, -4F, -11.75F);

		bodyModel[235].addBox(0F, 0F, 0F, 0, 6, 1, 0F); // Box 200
		bodyModel[235].setRotationPoint(-44.5F, -4F, 10.75F);

		bodyModel[236].addBox(0F, 0F, 0F, 0, 6, 1, 0F); // Box 201
		bodyModel[236].setRotationPoint(-47.5F, -4F, 10.75F);

		bodyModel[237].addShapeBox(0F, 0F, 0F, 23, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F); // Box 196
		bodyModel[237].setRotationPoint(-47F, -14.5F, -11.25F);

		bodyModel[238].addShapeBox(0F, 0F, 0F, 23, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F); // Box 197
		bodyModel[238].setRotationPoint(-47F, -14.5F, 10.25F);

		bodyModel[239].addBox(0F, 0F, 0F, 2, 15, 1, 0F); // Box 314
		bodyModel[239].setRotationPoint(-50F, -14F, -4F);

		bodyModel[240].addBox(0F, 0F, 0F, 2, 15, 1, 0F); // Box 316
		bodyModel[240].setRotationPoint(-50F, -14F, 3F);

		bodyModel[241].addBox(0F, 0F, 0F, 1, 17, 1, 0F); // Box 443
		bodyModel[241].setRotationPoint(-50F, -15F, 4F);

		bodyModel[242].addBox(0F, 0F, 0F, 1, 17, 1, 0F); // Box 444
		bodyModel[242].setRotationPoint(-50F, -15F, -5F);

		bodyModel[243].addBox(0F, 0F, 0F, 2, 1, 8, 0F); // Box 445
		bodyModel[243].setRotationPoint(-50F, -15F, -4F);

		bodyModel[244].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[244].setRotationPoint(-50F, -16F, -5F);

		bodyModel[245].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 153
		bodyModel[245].setRotationPoint(-50F, -16F, 0F);

		bodyModel[246].addBox(0F, 0F, 0F, 2, 1, 8, 0F); // Box 448
		bodyModel[246].setRotationPoint(-50F, 1F, -4F);

		bodyModel[247].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 453
		bodyModel[247].setRotationPoint(-49F, -14F, 0F);

		bodyModel[248].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 454
		bodyModel[248].setRotationPoint(-49F, -14F, -3F);

		bodyModel[249].addBox(0F, 0F, 0F, 2, 1, 7, 0F); // Box 455
		bodyModel[249].setRotationPoint(-50F, 2F, -3.5F);

		bodyModel[250].addShapeBox(0F, 0F, 0F, 3, 15, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 13
		bodyModel[250].setRotationPoint(-32F, -14F, -6F);

		bodyModel[251].addShapeBox(0F, 0F, 0F, 3, 15, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 13
		bodyModel[251].setRotationPoint(29F, -14F, -6F);

		bodyModel[252].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 348 commander beacon
		bodyModel[252].setRotationPoint(-33F, -20F, -0.5F);

		bodyModel[253].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0.1F, -0.5F, 0.1F, -0.9F, -0.5F, 0.1F, -0.9F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, 0F, 0.1F, -0.9F, 0F, 0.1F, -0.9F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 349
		bodyModel[253].setRotationPoint(-33F, -20F, -0.5F);

		bodyModel[254].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 194
		bodyModel[254].setRotationPoint(-30.5F, -21F, 0F);

		bodyModel[255].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Early CP horns
		bodyModel[255].setRotationPoint(-46.5F, -20.25F, 4F);

		bodyModel[256].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // horn base
		bodyModel[256].setRotationPoint(-44.5F, -19.25F, 4F);

		bodyModel[257].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F); // Box 131
		bodyModel[257].setRotationPoint(-45.5F, -7F, 8.5F);

		bodyModel[258].addShapeBox(0F, 0F, 0F, 2, 5, 2, 0F,-0.2F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0.5F, -0.2F, -0.1F, 0.5F, -0.2F, -0.1F, 0.5F, -0.2F, -0.2F, 0.5F, -0.2F); // Box 131
		bodyModel[258].setRotationPoint(-46F, -5F, 8F);
	}
	ModelBlombergA1ATruck theTruck = new ModelBlombergA1ATruck();
	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		for (int i = 0; i < 259; i++) {
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
		if (entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor() == 1 || entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor() == 8 || entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor() == 7) {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/BlombergA1ATruckGrey.png"));
		} else {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/BlombergA1ATruckBlack.png"));
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
				add(new double[]{2.08D, 1.23D, 0D});
				add(new double[]{1.45D, 1.23D, 0D});
			}
		};
	}
}