//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2021 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: F7a
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

public class ModelF7A extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 256;

	public ModelF7A() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[406];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 292, 77, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 97, 242, textureX, textureY); // Box 1
		bodyModel[2] = new ModelRendererTurbo(this, 274, 160, textureX, textureY); // Box 1
		bodyModel[3] = new ModelRendererTurbo(this, 176, 128, textureX, textureY); // Box 0
		bodyModel[4] = new ModelRendererTurbo(this, 342, 128, textureX, textureY); // Box 0
		bodyModel[5] = new ModelRendererTurbo(this, 417, 135, textureX, textureY); // Box 0
		bodyModel[6] = new ModelRendererTurbo(this, 137, 135, textureX, textureY); // Box 0
		bodyModel[7] = new ModelRendererTurbo(this, 290, 158, textureX, textureY); // Box 1
		bodyModel[8] = new ModelRendererTurbo(this, 267, 146, textureX, textureY); // Box 1
		bodyModel[9] = new ModelRendererTurbo(this, 268, 146, textureX, textureY); // Box 1
		bodyModel[10] = new ModelRendererTurbo(this, 290, 146, textureX, textureY); // Box 1
		bodyModel[11] = new ModelRendererTurbo(this, 267, 109, textureX, textureY); // Box 0
		bodyModel[12] = new ModelRendererTurbo(this, 142, 23, textureX, textureY); // Box 0
		bodyModel[13] = new ModelRendererTurbo(this, 140, 15, textureX, textureY); // Box 0
		bodyModel[14] = new ModelRendererTurbo(this, 142, 9, textureX, textureY); // Box 0
		bodyModel[15] = new ModelRendererTurbo(this, 143, 29, textureX, textureY); // Box 0
		bodyModel[16] = new ModelRendererTurbo(this, 143, 4, textureX, textureY); // Box 0
		bodyModel[17] = new ModelRendererTurbo(this, 145, 34, textureX, textureY); // Box 0
		bodyModel[18] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 0
		bodyModel[19] = new ModelRendererTurbo(this, 256, 110, textureX, textureY); // Box 0
		bodyModel[20] = new ModelRendererTurbo(this, 264, 102, textureX, textureY); // Box 0
		bodyModel[21] = new ModelRendererTurbo(this, 261, 118, textureX, textureY); // Box 0
		bodyModel[22] = new ModelRendererTurbo(this, 273, 118, textureX, textureY); // Box 0
		bodyModel[23] = new ModelRendererTurbo(this, 259, 112, textureX, textureY); // Box 0
		bodyModel[24] = new ModelRendererTurbo(this, 273, 112, textureX, textureY); // Box 0
		bodyModel[25] = new ModelRendererTurbo(this, 85, 150, textureX, textureY); // Box 0
		bodyModel[26] = new ModelRendererTurbo(this, 85, 144, textureX, textureY); // Box 0
		bodyModel[27] = new ModelRendererTurbo(this, 96, 142, textureX, textureY); // Box 0
		bodyModel[28] = new ModelRendererTurbo(this, 109, 146, textureX, textureY); // Box 0
		bodyModel[29] = new ModelRendererTurbo(this, 58, 150, textureX, textureY); // Box 0
		bodyModel[30] = new ModelRendererTurbo(this, 170, 244, textureX, textureY); // Box 1 pilot a
		bodyModel[31] = new ModelRendererTurbo(this, 97, 204, textureX, textureY); // Box 106
		bodyModel[32] = new ModelRendererTurbo(this, 85, 204, textureX, textureY); // Box 112
		bodyModel[33] = new ModelRendererTurbo(this, 85, 197, textureX, textureY); // Box 117
		bodyModel[34] = new ModelRendererTurbo(this, 81, 191, textureX, textureY); // Box 118
		bodyModel[35] = new ModelRendererTurbo(this, 118, 150, textureX, textureY); // Box 129
		bodyModel[36] = new ModelRendererTurbo(this, 385, 160, textureX, textureY); // Box 0
		bodyModel[37] = new ModelRendererTurbo(this, 401, 144, textureX, textureY); // Box 0
		bodyModel[38] = new ModelRendererTurbo(this, 417, 128, textureX, textureY); // Box 0
		bodyModel[39] = new ModelRendererTurbo(this, 422, 128, textureX, textureY); // Box 0
		bodyModel[40] = new ModelRendererTurbo(this, 412, 128, textureX, textureY); // Box 0
		bodyModel[41] = new ModelRendererTurbo(this, 401, 128, textureX, textureY); // Box 0
		bodyModel[42] = new ModelRendererTurbo(this, 165, 144, textureX, textureY); // Box 0
		bodyModel[43] = new ModelRendererTurbo(this, 155, 128, textureX, textureY); // Box 0
		bodyModel[44] = new ModelRendererTurbo(this, 146, 128, textureX, textureY); // Box 0
		bodyModel[45] = new ModelRendererTurbo(this, 160, 128, textureX, textureY); // Box 0
		bodyModel[46] = new ModelRendererTurbo(this, 165, 128, textureX, textureY); // Box 0
		bodyModel[47] = new ModelRendererTurbo(this, 486, 113, textureX, textureY); // Box 0
		bodyModel[48] = new ModelRendererTurbo(this, 256, 13, textureX, textureY); // Box 0
		bodyModel[49] = new ModelRendererTurbo(this, 275, 13, textureX, textureY); // Box 0
		bodyModel[50] = new ModelRendererTurbo(this, 288, 15, textureX, textureY); // Box 0
		bodyModel[51] = new ModelRendererTurbo(this, 301, 13, textureX, textureY); // Box 0
		bodyModel[52] = new ModelRendererTurbo(this, 314, 15, textureX, textureY); // Box 0
		bodyModel[53] = new ModelRendererTurbo(this, 315, 202, textureX, textureY); // Box 42
		bodyModel[54] = new ModelRendererTurbo(this, 300, 206, textureX, textureY); // Box 44
		bodyModel[55] = new ModelRendererTurbo(this, 255, 201, textureX, textureY); // Box 45
		bodyModel[56] = new ModelRendererTurbo(this, 255, 178, textureX, textureY); // Box 46
		bodyModel[57] = new ModelRendererTurbo(this, 227, 176, textureX, textureY); // Box 48
		bodyModel[58] = new ModelRendererTurbo(this, 255, 205, textureX, textureY); // Box 50
		bodyModel[59] = new ModelRendererTurbo(this, 319, 181, textureX, textureY); // Box 324
		bodyModel[60] = new ModelRendererTurbo(this, 300, 200, textureX, textureY); // Box 325
		bodyModel[61] = new ModelRendererTurbo(this, 297, 217, textureX, textureY); // Box 123
		bodyModel[62] = new ModelRendererTurbo(this, 288, 217, textureX, textureY); // Box 254
		bodyModel[63] = new ModelRendererTurbo(this, 297, 212, textureX, textureY); // Box 255
		bodyModel[64] = new ModelRendererTurbo(this, 288, 212, textureX, textureY); // Box 136
		bodyModel[65] = new ModelRendererTurbo(this, 324, 212, textureX, textureY); // Box 137
		bodyModel[66] = new ModelRendererTurbo(this, 324, 217, textureX, textureY); // Box 138
		bodyModel[67] = new ModelRendererTurbo(this, 225, 197, textureX, textureY); // Box 139
		bodyModel[68] = new ModelRendererTurbo(this, 324, 207, textureX, textureY); // Box 140
		bodyModel[69] = new ModelRendererTurbo(this, 288, 207, textureX, textureY); // Box 141
		bodyModel[70] = new ModelRendererTurbo(this, 115, 178, textureX, textureY); // Box 111
		bodyModel[71] = new ModelRendererTurbo(this, 51, 178, textureX, textureY); // Box 144
		bodyModel[72] = new ModelRendererTurbo(this, 79, 245, textureX, textureY); // Box 145
		bodyModel[73] = new ModelRendererTurbo(this, 79, 245, textureX, textureY); // Box 146
		bodyModel[74] = new ModelRendererTurbo(this, 79, 243, textureX, textureY); // Box 147
		bodyModel[75] = new ModelRendererTurbo(this, 79, 243, textureX, textureY); // Box 148
		bodyModel[76] = new ModelRendererTurbo(this, 74, 221, textureX, textureY); // Box 149
		bodyModel[77] = new ModelRendererTurbo(this, 74, 221, textureX, textureY); // Box 150
		bodyModel[78] = new ModelRendererTurbo(this, 84, 240, textureX, textureY); // Box 151
		bodyModel[79] = new ModelRendererTurbo(this, 177, 146, textureX, textureY); // Box 152
		bodyModel[80] = new ModelRendererTurbo(this, 177, 146, textureX, textureY); // Box 153
		bodyModel[81] = new ModelRendererTurbo(this, 398, 146, textureX, textureY); // Box 154
		bodyModel[82] = new ModelRendererTurbo(this, 398, 146, textureX, textureY); // Box 155
		bodyModel[83] = new ModelRendererTurbo(this, 167, 151, textureX, textureY); // Box 156
		bodyModel[84] = new ModelRendererTurbo(this, 401, 151, textureX, textureY); // Box 157
		bodyModel[85] = new ModelRendererTurbo(this, 470, 67, textureX, textureY); // Box 350
		bodyModel[86] = new ModelRendererTurbo(this, 473, 67, textureX, textureY); // Box 351
		bodyModel[87] = new ModelRendererTurbo(this, 160, 151, textureX, textureY); // Box 160
		bodyModel[88] = new ModelRendererTurbo(this, 410, 151, textureX, textureY); // Box 161
		bodyModel[89] = new ModelRendererTurbo(this, 153, 46, textureX, textureY); // Box 299
		bodyModel[90] = new ModelRendererTurbo(this, 153, 49, textureX, textureY); // Box 300
		bodyModel[91] = new ModelRendererTurbo(this, 153, 40, textureX, textureY); // Box 301
		bodyModel[92] = new ModelRendererTurbo(this, 157, 43, textureX, textureY); // Box 302
		bodyModel[93] = new ModelRendererTurbo(this, 188, 147, textureX, textureY); // Box 177
		bodyModel[94] = new ModelRendererTurbo(this, 188, 147, textureX, textureY); // Box 178
		bodyModel[95] = new ModelRendererTurbo(this, 395, 146, textureX, textureY); // Box 179
		bodyModel[96] = new ModelRendererTurbo(this, 395, 146, textureX, textureY); // Box 180
		bodyModel[97] = new ModelRendererTurbo(this, 146, 40, textureX, textureY, "lamp"); // Box 348 commander beacon
		bodyModel[98] = new ModelRendererTurbo(this, 145, 43, textureX, textureY); // Box 349
		bodyModel[99] = new ModelRendererTurbo(this, 77, 168, textureX, textureY); // Box 183 CNW Gong
		bodyModel[100] = new ModelRendererTurbo(this, 125, 175, textureX, textureY, "lamp"); // Box 184 numberboard glow
		bodyModel[101] = new ModelRendererTurbo(this, 45, 175, textureX, textureY, "lamp"); // Box 185 numberboard glow
		bodyModel[102] = new ModelRendererTurbo(this, 256, 21, textureX, textureY, "cull"); // Box 186 winterization hatch cull
		bodyModel[103] = new ModelRendererTurbo(this, 250, 6, textureX, textureY); // Box 187
		bodyModel[104] = new ModelRendererTurbo(this, 250, 2, textureX, textureY); // Box 188
		bodyModel[105] = new ModelRendererTurbo(this, 236, 151, textureX, textureY); // Box 189
		bodyModel[106] = new ModelRendererTurbo(this, 332, 151, textureX, textureY); // Box 190
		bodyModel[107] = new ModelRendererTurbo(this, 325, 151, textureX, textureY); // Box 191
		bodyModel[108] = new ModelRendererTurbo(this, 245, 151, textureX, textureY); // Box 192
		bodyModel[109] = new ModelRendererTurbo(this, 165, 43, textureX, textureY); // Box 193
		bodyModel[110] = new ModelRendererTurbo(this, 169, 40, textureX, textureY); // Box 194
		bodyModel[111] = new ModelRendererTurbo(this, 167, 37, textureX, textureY); // Box 195
		bodyModel[112] = new ModelRendererTurbo(this, 177, 119, textureX, textureY); // Box 196
		bodyModel[113] = new ModelRendererTurbo(this, 322, 119, textureX, textureY); // Box 197
		bodyModel[114] = new ModelRendererTurbo(this, 191, 147, textureX, textureY); // Box 198
		bodyModel[115] = new ModelRendererTurbo(this, 191, 147, textureX, textureY); // Box 199
		bodyModel[116] = new ModelRendererTurbo(this, 392, 146, textureX, textureY); // Box 200
		bodyModel[117] = new ModelRendererTurbo(this, 392, 146, textureX, textureY); // Box 201
		bodyModel[118] = new ModelRendererTurbo(this, 253, 4, textureX, textureY); // Box 202
		bodyModel[119] = new ModelRendererTurbo(this, 264, 4, textureX, textureY); // Box 203
		bodyModel[120] = new ModelRendererTurbo(this, 413, 60, textureX, textureY); // Box 314
		bodyModel[121] = new ModelRendererTurbo(this, 420, 60, textureX, textureY); // Box 316
		bodyModel[122] = new ModelRendererTurbo(this, 178, 43, textureX, textureY); // Box 278
		bodyModel[123] = new ModelRendererTurbo(this, 178, 40, textureX, textureY); // Box 279
		bodyModel[124] = new ModelRendererTurbo(this, 178, 37, textureX, textureY); // Box 280
		bodyModel[125] = new ModelRendererTurbo(this, 187, 40, textureX, textureY); // Box 214
		bodyModel[126] = new ModelRendererTurbo(this, 145, 56, textureX, textureY); // Box 215
		bodyModel[127] = new ModelRendererTurbo(this, 145, 59, textureX, textureY); // Box 216
		bodyModel[128] = new ModelRendererTurbo(this, 145, 62, textureX, textureY); // Box 217
		bodyModel[129] = new ModelRendererTurbo(this, 154, 59, textureX, textureY); // Box 218
		bodyModel[130] = new ModelRendererTurbo(this, 444, 68, textureX, textureY); // Box 131
		bodyModel[131] = new ModelRendererTurbo(this, 447, 70, textureX, textureY); // Box 131
		bodyModel[132] = new ModelRendererTurbo(this, 462, 87, textureX, textureY); // Box 131
		bodyModel[133] = new ModelRendererTurbo(this, 467, 85, textureX, textureY); // Box 131
		bodyModel[134] = new ModelRendererTurbo(this, 476, 87, textureX, textureY); // Box 131
		bodyModel[135] = new ModelRendererTurbo(this, 436, 70, textureX, textureY); // Box 131
		bodyModel[136] = new ModelRendererTurbo(this, 461, 82, textureX, textureY); // Box 131
		bodyModel[137] = new ModelRendererTurbo(this, 462, 74, textureX, textureY); // Box 131
		bodyModel[138] = new ModelRendererTurbo(this, 273, 2, textureX, textureY); // Box 231
		bodyModel[139] = new ModelRendererTurbo(this, 384, 69, textureX, textureY, "lamp"); // Box 247 headlight rear left
		bodyModel[140] = new ModelRendererTurbo(this, 312, 143, textureX, textureY); // Box 222
		bodyModel[141] = new ModelRendererTurbo(this, 301, 143, textureX, textureY); // Box 223
		bodyModel[142] = new ModelRendererTurbo(this, 270, 201, textureX, textureY); // Box 438
		bodyModel[143] = new ModelRendererTurbo(this, 270, 201, textureX, textureY); // Box 439
		bodyModel[144] = new ModelRendererTurbo(this, 83, 137, textureX, textureY); // Box 336
		bodyModel[145] = new ModelRendererTurbo(this, 87, 132, textureX, textureY, "lamp"); // Box 337 ane 2 beam
		bodyModel[146] = new ModelRendererTurbo(this, 87, 132, textureX, textureY, "lamp"); // Box 338 ane 2 beam
		bodyModel[147] = new ModelRendererTurbo(this, 124, 243, textureX, textureY, "lamp"); // Box 443 ditchlight front a
		bodyModel[148] = new ModelRendererTurbo(this, 117, 243, textureX, textureY); // Box 444
		bodyModel[149] = new ModelRendererTurbo(this, 124, 243, textureX, textureY, "lamp"); // Box 445 ditchlight front a
		bodyModel[150] = new ModelRendererTurbo(this, 117, 243, textureX, textureY); // Box 446
		bodyModel[151] = new ModelRendererTurbo(this, 209, 41, textureX, textureY); // Box 447
		bodyModel[152] = new ModelRendererTurbo(this, 209, 38, textureX, textureY); // Box 448
		bodyModel[153] = new ModelRendererTurbo(this, 209, 44, textureX, textureY); // Box 449
		bodyModel[154] = new ModelRendererTurbo(this, 218, 41, textureX, textureY); // Box 450
		bodyModel[155] = new ModelRendererTurbo(this, 181, 74, textureX, textureY); // Box 260
		bodyModel[156] = new ModelRendererTurbo(this, 177, 73, textureX, textureY); // Box 264
		bodyModel[157] = new ModelRendererTurbo(this, 145, 76, textureX, textureY); // Box 268
		bodyModel[158] = new ModelRendererTurbo(this, 139, 78, textureX, textureY); // Box 274
		bodyModel[159] = new ModelRendererTurbo(this, 136, 82, textureX, textureY); // Box 283
		bodyModel[160] = new ModelRendererTurbo(this, 149, 82, textureX, textureY); // Box 284
		bodyModel[161] = new ModelRendererTurbo(this, 166, 82, textureX, textureY); // Box 291
		bodyModel[162] = new ModelRendererTurbo(this, 179, 82, textureX, textureY); // Box 292
		bodyModel[163] = new ModelRendererTurbo(this, 184, 78, textureX, textureY); // Box 293
		bodyModel[164] = new ModelRendererTurbo(this, 172, 76, textureX, textureY); // Box 294
		bodyModel[165] = new ModelRendererTurbo(this, 140, 74, textureX, textureY); // Box 295
		bodyModel[166] = new ModelRendererTurbo(this, 146, 73, textureX, textureY); // Box 296
		bodyModel[167] = new ModelRendererTurbo(this, 194, 40, textureX, textureY); // Box 249
		bodyModel[168] = new ModelRendererTurbo(this, 203, 41, textureX, textureY); // Box 250
		bodyModel[169] = new ModelRendererTurbo(this, 194, 37, textureX, textureY); // Box 251
		bodyModel[170] = new ModelRendererTurbo(this, 194, 43, textureX, textureY); // Box 252
		bodyModel[171] = new ModelRendererTurbo(this, 193, 56, textureX, textureY); // Box 114
		bodyModel[172] = new ModelRendererTurbo(this, 193, 53, textureX, textureY); // Box 74
		bodyModel[173] = new ModelRendererTurbo(this, 193, 59, textureX, textureY); // Box 78
		bodyModel[174] = new ModelRendererTurbo(this, 195, 59, textureX, textureY); // Box 245
		bodyModel[175] = new ModelRendererTurbo(this, 198, 54, textureX, textureY); // Box 257
		bodyModel[176] = new ModelRendererTurbo(this, 168, 48, textureX, textureY); // Box 194
		bodyModel[177] = new ModelRendererTurbo(this, 70, 202, textureX, textureY); // Box 278
		bodyModel[178] = new ModelRendererTurbo(this, 57, 207, textureX, textureY); // Box 279
		bodyModel[179] = new ModelRendererTurbo(this, 50, 207, textureX, textureY); // Box 280
		bodyModel[180] = new ModelRendererTurbo(this, 43, 186, textureX, textureY); // Box 281
		bodyModel[181] = new ModelRendererTurbo(this, 60, 180, textureX, textureY); // Box 282
		bodyModel[182] = new ModelRendererTurbo(this, 61, 188, textureX, textureY); // Box 284
		bodyModel[183] = new ModelRendererTurbo(this, 46, 197, textureX, textureY); // Box 289
		bodyModel[184] = new ModelRendererTurbo(this, 38, 199, textureX, textureY); // Box 291
		bodyModel[185] = new ModelRendererTurbo(this, 427, 97, textureX, textureY); // Box 293
		bodyModel[186] = new ModelRendererTurbo(this, 96, 202, textureX, textureY); // Box 294
		bodyModel[187] = new ModelRendererTurbo(this, 111, 207, textureX, textureY); // Box 295
		bodyModel[188] = new ModelRendererTurbo(this, 124, 207, textureX, textureY); // Box 296
		bodyModel[189] = new ModelRendererTurbo(this, 58, 153, textureX, textureY); // Box 311
		bodyModel[190] = new ModelRendererTurbo(this, 51, 152, textureX, textureY); // Box 312
		bodyModel[191] = new ModelRendererTurbo(this, 115, 186, textureX, textureY); // Box 313
		bodyModel[192] = new ModelRendererTurbo(this, 98, 180, textureX, textureY); // Box 314
		bodyModel[193] = new ModelRendererTurbo(this, 105, 188, textureX, textureY); // Box 315
		bodyModel[194] = new ModelRendererTurbo(this, 96, 149, textureX, textureY); // Box 323
		bodyModel[195] = new ModelRendererTurbo(this, 109, 151, textureX, textureY); // Box 324
		bodyModel[196] = new ModelRendererTurbo(this, 118, 153, textureX, textureY); // Box 325
		bodyModel[197] = new ModelRendererTurbo(this, 123, 152, textureX, textureY); // Box 326
		bodyModel[198] = new ModelRendererTurbo(this, 72, 149, textureX, textureY); // Box 327
		bodyModel[199] = new ModelRendererTurbo(this, 63, 151, textureX, textureY); // Box 328
		bodyModel[200] = new ModelRendererTurbo(this, 39, 194, textureX, textureY); // Box 329
		bodyModel[201] = new ModelRendererTurbo(this, 72, 142, textureX, textureY); // Box 330
		bodyModel[202] = new ModelRendererTurbo(this, 63, 146, textureX, textureY); // Box 331
		bodyModel[203] = new ModelRendererTurbo(this, 69, 232, textureX, textureY); // Box 332
		bodyModel[204] = new ModelRendererTurbo(this, 97, 232, textureX, textureY); // Box 333
		bodyModel[205] = new ModelRendererTurbo(this, 85, 234, textureX, textureY); // Box 334
		bodyModel[206] = new ModelRendererTurbo(this, 56, 233, textureX, textureY); // Box 335
		bodyModel[207] = new ModelRendererTurbo(this, 294, 99, textureX, textureY); // Box 441
		bodyModel[208] = new ModelRendererTurbo(this, 81, 186, textureX, textureY); // Box 167
		bodyModel[209] = new ModelRendererTurbo(this, 91, 186, textureX, textureY); // Box 166
		bodyModel[210] = new ModelRendererTurbo(this, 91, 181, textureX, textureY); // Box 165
		bodyModel[211] = new ModelRendererTurbo(this, 77, 181, textureX, textureY); // Box 164
		bodyModel[212] = new ModelRendererTurbo(this, 83, 221, textureX, textureY); // Box 556
		bodyModel[213] = new ModelRendererTurbo(this, 91, 221, textureX, textureY); // Box 557
		bodyModel[214] = new ModelRendererTurbo(this, 427, 85, textureX, textureY); // Box 865
		bodyModel[215] = new ModelRendererTurbo(this, 96, 193, textureX, textureY); // Box 866
		bodyModel[216] = new ModelRendererTurbo(this, 105, 196, textureX, textureY); // Box 867
		bodyModel[217] = new ModelRendererTurbo(this, 59, 196, textureX, textureY); // Box 868
		bodyModel[218] = new ModelRendererTurbo(this, 70, 193, textureX, textureY); // Box 869
		bodyModel[219] = new ModelRendererTurbo(this, 112, 233, textureX, textureY); // Box 1296
		bodyModel[220] = new ModelRendererTurbo(this, 159, 244, textureX, textureY); // Box 1297 pilot a
		bodyModel[221] = new ModelRendererTurbo(this, 181, 244, textureX, textureY); // Box 1299 pilot a
		bodyModel[222] = new ModelRendererTurbo(this, 152, 246, textureX, textureY); // Box 1300 pilot a
		bodyModel[223] = new ModelRendererTurbo(this, 192, 246, textureX, textureY); // Box 1301 pilot a
		bodyModel[224] = new ModelRendererTurbo(this, 47, 204, textureX, textureY); // Box 1302
		bodyModel[225] = new ModelRendererTurbo(this, 121, 204, textureX, textureY); // Box 1303
		bodyModel[226] = new ModelRendererTurbo(this, 116, 197, textureX, textureY); // Box 1304
		bodyModel[227] = new ModelRendererTurbo(this, 133, 194, textureX, textureY); // Box 1305
		bodyModel[228] = new ModelRendererTurbo(this, 132, 199, textureX, textureY); // Box 1306
		bodyModel[229] = new ModelRendererTurbo(this, 165, 131, textureX, textureY); // Box 329 door swing left cab
		bodyModel[230] = new ModelRendererTurbo(this, 401, 131, textureX, textureY); // Box 332 door swing right cab
		bodyModel[231] = new ModelRendererTurbo(this, 72, 133, textureX, textureY); // Box 326
		bodyModel[232] = new ModelRendererTurbo(this, 104, 139, textureX, textureY); // Box 327
		bodyModel[233] = new ModelRendererTurbo(this, 64, 139, textureX, textureY); // Box 328
		bodyModel[234] = new ModelRendererTurbo(this, 235, 135, textureX, textureY); // Box 329 door swing left hood
		bodyModel[235] = new ModelRendererTurbo(this, 331, 135, textureX, textureY); // Box 332 door swing right hood
		bodyModel[236] = new ModelRendererTurbo(this, 246, 128, textureX, textureY); // Box 333
		bodyModel[237] = new ModelRendererTurbo(this, 310, 128, textureX, textureY); // Box 334
		bodyModel[238] = new ModelRendererTurbo(this, 331, 128, textureX, textureY); // Box 335
		bodyModel[239] = new ModelRendererTurbo(this, 235, 128, textureX, textureY); // Box 336
		bodyModel[240] = new ModelRendererTurbo(this, 331, 148, textureX, textureY); // Box 337
		bodyModel[241] = new ModelRendererTurbo(this, 235, 148, textureX, textureY); // Box 338
		bodyModel[242] = new ModelRendererTurbo(this, 474, 96, textureX, textureY); // Box 602
		bodyModel[243] = new ModelRendererTurbo(this, 486, 96, textureX, textureY); // Box 603
		bodyModel[244] = new ModelRendererTurbo(this, 478, 96, textureX, textureY); // Box 604
		bodyModel[245] = new ModelRendererTurbo(this, 491, 96, textureX, textureY); // Box 605
		bodyModel[246] = new ModelRendererTurbo(this, 497, 115, textureX, textureY); // Box 606
		bodyModel[247] = new ModelRendererTurbo(this, 125, 177, textureX, textureY, "lamp"); // Box 352 markerlight
		bodyModel[248] = new ModelRendererTurbo(this, 51, 177, textureX, textureY, "lamp"); // Box 353 markerlight
		bodyModel[249] = new ModelRendererTurbo(this, 475, 125, textureX, textureY); // Box 356
		bodyModel[250] = new ModelRendererTurbo(this, 478, 105, textureX, textureY); // Box 357
		bodyModel[251] = new ModelRendererTurbo(this, 474, 104, textureX, textureY); // Box 358
		bodyModel[252] = new ModelRendererTurbo(this, 470, 65, textureX, textureY); // Box 359
		bodyModel[253] = new ModelRendererTurbo(this, 461, 78, textureX, textureY); // Box 360
		bodyModel[254] = new ModelRendererTurbo(this, 431, 78, textureX, textureY); // Box 361
		bodyModel[255] = new ModelRendererTurbo(this, 472, 123, textureX, textureY); // Box 362
		bodyModel[256] = new ModelRendererTurbo(this, 78, 173, textureX, textureY); // Box 103
		bodyModel[257] = new ModelRendererTurbo(this, 83, 173, textureX, textureY); // Box 103
		bodyModel[258] = new ModelRendererTurbo(this, 91, 173, textureX, textureY); // Box 103
		bodyModel[259] = new ModelRendererTurbo(this, 98, 173, textureX, textureY); // Box 103
		bodyModel[260] = new ModelRendererTurbo(this, 78, 177, textureX, textureY); // Box 103
		bodyModel[261] = new ModelRendererTurbo(this, 98, 177, textureX, textureY); // Box 103
		bodyModel[262] = new ModelRendererTurbo(this, 83, 177, textureX, textureY); // Box 103
		bodyModel[263] = new ModelRendererTurbo(this, 91, 177, textureX, textureY); // Box 103
		bodyModel[264] = new ModelRendererTurbo(this, 79, 204, textureX, textureY); // Box 380
		bodyModel[265] = new ModelRendererTurbo(this, 104, 167, textureX, textureY, "lamp"); // Box 186 headlight 2beam top A
		bodyModel[266] = new ModelRendererTurbo(this, 104, 172, textureX, textureY, "lamp"); // Box 187 headlight 2beam top A
		bodyModel[267] = new ModelRendererTurbo(this, 83, 226, textureX, textureY); // Box 386
		bodyModel[268] = new ModelRendererTurbo(this, 91, 226, textureX, textureY); // Box 387
		bodyModel[269] = new ModelRendererTurbo(this, 98, 226, textureX, textureY); // Box 388
		bodyModel[270] = new ModelRendererTurbo(this, 98, 230, textureX, textureY); // Box 389
		bodyModel[271] = new ModelRendererTurbo(this, 91, 230, textureX, textureY); // Box 390
		bodyModel[272] = new ModelRendererTurbo(this, 83, 230, textureX, textureY); // Box 391
		bodyModel[273] = new ModelRendererTurbo(this, 78, 230, textureX, textureY); // Box 392
		bodyModel[274] = new ModelRendererTurbo(this, 78, 226, textureX, textureY); // Box 393
		bodyModel[275] = new ModelRendererTurbo(this, 111, 172, textureX, textureY, "lamp"); // Box 169 headlight big top
		bodyModel[276] = new ModelRendererTurbo(this, 104, 221, textureX, textureY, "lamp"); // Box 186 headlight 2beam bottom A
		bodyModel[277] = new ModelRendererTurbo(this, 104, 226, textureX, textureY, "lamp"); // Box 187 headlight 2beam bottom A
		bodyModel[278] = new ModelRendererTurbo(this, 111, 226, textureX, textureY, "lamp"); // Box 169 headlight big bottom
		bodyModel[279] = new ModelRendererTurbo(this, 118, 221, textureX, textureY, "lamp"); // Box 186 headlight 2beam bottom B
		bodyModel[280] = new ModelRendererTurbo(this, 111, 221, textureX, textureY, "lamp"); // Box 187 headlight 2beam bottom B
		bodyModel[281] = new ModelRendererTurbo(this, 118, 167, textureX, textureY, "lamp"); // Box 186 headlight 2beam top B
		bodyModel[282] = new ModelRendererTurbo(this, 111, 167, textureX, textureY, "lamp"); // Box 187 headlight 2beam top B
		bodyModel[283] = new ModelRendererTurbo(this, 85, 165, textureX, textureY); // Box 403 headlight cover
		bodyModel[284] = new ModelRendererTurbo(this, 91, 165, textureX, textureY); // Box 404 headlight cover
		bodyModel[285] = new ModelRendererTurbo(this, 91, 168, textureX, textureY); // Box 405 headlight cover
		bodyModel[286] = new ModelRendererTurbo(this, 85, 168, textureX, textureY); // Box 406 headlight cover
		bodyModel[287] = new ModelRendererTurbo(this, 465, 131, textureX, textureY); // Box 407
		bodyModel[288] = new ModelRendererTurbo(this, 458, 121, textureX, textureY); // Box 409
		bodyModel[289] = new ModelRendererTurbo(this, 451, 121, textureX, textureY); // Box 410
		bodyModel[290] = new ModelRendererTurbo(this, 441, 131, textureX, textureY); // Box 411
		bodyModel[291] = new ModelRendererTurbo(this, 95, 125, textureX, textureY); // Box 413
		bodyModel[292] = new ModelRendererTurbo(this, 75, 125, textureX, textureY); // Box 414
		bodyModel[293] = new ModelRendererTurbo(this, 86, 126, textureX, textureY); // Box 415
		bodyModel[294] = new ModelRendererTurbo(this, 106, 127, textureX, textureY); // Box 416
		bodyModel[295] = new ModelRendererTurbo(this, 68, 127, textureX, textureY); // Box 417
		bodyModel[296] = new ModelRendererTurbo(this, 384, 64, textureX, textureY, "lamp"); // Box 418 headlight rear right
		bodyModel[297] = new ModelRendererTurbo(this, 170, 232, textureX, textureY); // Box 419 pilot b, c
		bodyModel[298] = new ModelRendererTurbo(this, 192, 232, textureX, textureY); // Box 420 pilot b
		bodyModel[299] = new ModelRendererTurbo(this, 181, 232, textureX, textureY); // Box 421 pilot b
		bodyModel[300] = new ModelRendererTurbo(this, 159, 232, textureX, textureY); // Box 422 pilot b
		bodyModel[301] = new ModelRendererTurbo(this, 152, 232, textureX, textureY); // Box 423 pilot b
		bodyModel[302] = new ModelRendererTurbo(this, 110, 235, textureX, textureY); // Box 424
		bodyModel[303] = new ModelRendererTurbo(this, 64, 235, textureX, textureY); // Box 425
		bodyModel[304] = new ModelRendererTurbo(this, 170, 225, textureX, textureY); // Box 427 pilot b, c
		bodyModel[305] = new ModelRendererTurbo(this, 155, 223, textureX, textureY); // Box 429 pilot b
		bodyModel[306] = new ModelRendererTurbo(this, 196, 224, textureX, textureY); // Box 432 pilot b
		bodyModel[307] = new ModelRendererTurbo(this, 181, 223, textureX, textureY); // Box 433 pilot b
		bodyModel[308] = new ModelRendererTurbo(this, 142, 224, textureX, textureY); // Box 434 pilot b
		bodyModel[309] = new ModelRendererTurbo(this, 74, 243, textureX, textureY); // Box 435
		bodyModel[310] = new ModelRendererTurbo(this, 74, 245, textureX, textureY); // Box 436
		bodyModel[311] = new ModelRendererTurbo(this, 74, 243, textureX, textureY); // Box 437
		bodyModel[312] = new ModelRendererTurbo(this, 74, 245, textureX, textureY); // Box 438
		bodyModel[313] = new ModelRendererTurbo(this, 179, 148, textureX, textureY); // Box 439
		bodyModel[314] = new ModelRendererTurbo(this, 179, 150, textureX, textureY); // Box 440
		bodyModel[315] = new ModelRendererTurbo(this, 179, 150, textureX, textureY); // Box 441
		bodyModel[316] = new ModelRendererTurbo(this, 179, 148, textureX, textureY); // Box 442
		bodyModel[317] = new ModelRendererTurbo(this, 392, 57, textureX, textureY); // Box 443
		bodyModel[318] = new ModelRendererTurbo(this, 397, 57, textureX, textureY); // Box 444
		bodyModel[319] = new ModelRendererTurbo(this, 409, 50, textureX, textureY); // Box 445
		bodyModel[320] = new ModelRendererTurbo(this, 363, 58, textureX, textureY); // Box 128
		bodyModel[321] = new ModelRendererTurbo(this, 371, 56, textureX, textureY); // Box 153
		bodyModel[322] = new ModelRendererTurbo(this, 371, 66, textureX, textureY); // Box 448
		bodyModel[323] = new ModelRendererTurbo(this, 292, 10, textureX, textureY); // Box 82 stack 1
		bodyModel[324] = new ModelRendererTurbo(this, 292, 10, textureX, textureY); // Box 85 stack 4
		bodyModel[325] = new ModelRendererTurbo(this, 402, 57, textureX, textureY); // Box 452 some door that magically vibes in the back
		bodyModel[326] = new ModelRendererTurbo(this, 379, 51, textureX, textureY); // Box 453
		bodyModel[327] = new ModelRendererTurbo(this, 379, 56, textureX, textureY); // Box 454
		bodyModel[328] = new ModelRendererTurbo(this, 360, 65, textureX, textureY); // Box 455
		bodyModel[329] = new ModelRendererTurbo(this, 289, 4, textureX, textureY); // Box 457
		bodyModel[330] = new ModelRendererTurbo(this, 289, 4, textureX, textureY); // Box 458
		bodyModel[331] = new ModelRendererTurbo(this, 94, 137, textureX, textureY); // Box 364 prime base
		bodyModel[332] = new ModelRendererTurbo(this, 94, 133, textureX, textureY, "lamp"); // Box 6 PRIME1-1
		bodyModel[333] = new ModelRendererTurbo(this, 94, 133, textureX, textureY, "lamp"); // Box 7 PRIME1-3
		bodyModel[334] = new ModelRendererTurbo(this, 94, 133, textureX, textureY, "lamp"); // Box 8 PRIME1-2
		bodyModel[335] = new ModelRendererTurbo(this, 94, 133, textureX, textureY, "lamp"); // Box 9 PRIME1-4
		bodyModel[336] = new ModelRendererTurbo(this, 314, 42, textureX, textureY); // Box 464
		bodyModel[337] = new ModelRendererTurbo(this, 290, 31, textureX, textureY); // Box 465
		bodyModel[338] = new ModelRendererTurbo(this, 288, 34, textureX, textureY); // Box 466
		bodyModel[339] = new ModelRendererTurbo(this, 284, 27, textureX, textureY); // Box 467
		bodyModel[340] = new ModelRendererTurbo(this, 154, 193, textureX, textureY); // Box 474 pilot c
		bodyModel[341] = new ModelRendererTurbo(this, 176, 205, textureX, textureY); // Box 476 pilot c
		bodyModel[342] = new ModelRendererTurbo(this, 176, 193, textureX, textureY); // Box 477 pilot c
		bodyModel[343] = new ModelRendererTurbo(this, 197, 205, textureX, textureY); // Box 478 pilot c
		bodyModel[344] = new ModelRendererTurbo(this, 158, 205, textureX, textureY); // Box 479 pilot c
		bodyModel[345] = new ModelRendererTurbo(this, 176, 215, textureX, textureY); // Box 480 pilot c
		bodyModel[346] = new ModelRendererTurbo(this, 162, 215, textureX, textureY); // Box 481 pilot c
		bodyModel[347] = new ModelRendererTurbo(this, 197, 193, textureX, textureY); // Box 482 pilot c
		bodyModel[348] = new ModelRendererTurbo(this, 179, 148, textureX, textureY); // Box 483
		bodyModel[349] = new ModelRendererTurbo(this, 179, 148, textureX, textureY); // Box 484
		bodyModel[350] = new ModelRendererTurbo(this, 161, 49, textureX, textureY); // Box 372
		bodyModel[351] = new ModelRendererTurbo(this, 72, 177, textureX, textureY); // Box 487
		bodyModel[352] = new ModelRendererTurbo(this, 141, 39, textureX, textureY); // Box 488
		bodyModel[353] = new ModelRendererTurbo(this, 417, 237, textureX, textureY); // Box 0
		bodyModel[354] = new ModelRendererTurbo(this, 417, 222, textureX, textureY); // Box 2
		bodyModel[355] = new ModelRendererTurbo(this, 417, 192, textureX, textureY); // Box 3
		bodyModel[356] = new ModelRendererTurbo(this, 417, 176, textureX, textureY); // Box 4
		bodyModel[357] = new ModelRendererTurbo(this, 425, 169, textureX, textureY); // Box 5
		bodyModel[358] = new ModelRendererTurbo(this, 425, 155, textureX, textureY); // Box 6
		bodyModel[359] = new ModelRendererTurbo(this, 396, 204, textureX, textureY); // Box 10
		bodyModel[360] = new ModelRendererTurbo(this, 407, 204, textureX, textureY); // Box 11
		bodyModel[361] = new ModelRendererTurbo(this, 385, 204, textureX, textureY); // Box 12
		bodyModel[362] = new ModelRendererTurbo(this, 394, 213, textureX, textureY); // Box 13
		bodyModel[363] = new ModelRendererTurbo(this, 381, 189, textureX, textureY); // Box 14
		bodyModel[364] = new ModelRendererTurbo(this, 417, 208, textureX, textureY); // Box 3
		bodyModel[365] = new ModelRendererTurbo(this, 377, 197, textureX, textureY); // Box 9
		bodyModel[366] = new ModelRendererTurbo(this, 397, 187, textureX, textureY); // Box 9
		bodyModel[367] = new ModelRendererTurbo(this, 377, 197, textureX, textureY); // Box 9
		bodyModel[368] = new ModelRendererTurbo(this, 377, 197, textureX, textureY); // Box 9
		bodyModel[369] = new ModelRendererTurbo(this, 377, 197, textureX, textureY); // Box 9
		bodyModel[370] = new ModelRendererTurbo(this, 392, 182, textureX, textureY); // Box 21
		bodyModel[371] = new ModelRendererTurbo(this, 393, 202, textureX, textureY); // Box 0
		bodyModel[372] = new ModelRendererTurbo(this, 393, 202, textureX, textureY); // Box 0
		bodyModel[373] = new ModelRendererTurbo(this, 366, 156, textureX, textureY); // Box 13
		bodyModel[374] = new ModelRendererTurbo(this, 370, 210, textureX, textureY); // Box 10
		bodyModel[375] = new ModelRendererTurbo(this, 370, 210, textureX, textureY); // Box 10
		bodyModel[376] = new ModelRendererTurbo(this, 425, 162, textureX, textureY); // Box 7
		bodyModel[377] = new ModelRendererTurbo(this, 367, 160, textureX, textureY); // Box 513
		bodyModel[378] = new ModelRendererTurbo(this, 379, 236, textureX, textureY); // Box 110
		bodyModel[379] = new ModelRendererTurbo(this, 369, 230, textureX, textureY); // Box 111
		bodyModel[380] = new ModelRendererTurbo(this, 384, 229, textureX, textureY); // Box 112
		bodyModel[381] = new ModelRendererTurbo(this, 401, 230, textureX, textureY); // Box 113
		bodyModel[382] = new ModelRendererTurbo(this, 401, 249, textureX, textureY); // Box 114
		bodyModel[383] = new ModelRendererTurbo(this, 384, 248, textureX, textureY); // Box 115
		bodyModel[384] = new ModelRendererTurbo(this, 369, 249, textureX, textureY); // Box 116
		bodyModel[385] = new ModelRendererTurbo(this, 407, 239, textureX, textureY); // Box 522
		bodyModel[386] = new ModelRendererTurbo(this, 374, 222, textureX, textureY); // Box 523
		bodyModel[387] = new ModelRendererTurbo(this, 385, 225, textureX, textureY); // Box 255
		bodyModel[388] = new ModelRendererTurbo(this, 385, 221, textureX, textureY); // Box 256
		bodyModel[389] = new ModelRendererTurbo(this, 97, 169, textureX, textureY); // Box 538
		bodyModel[390] = new ModelRendererTurbo(this, 178, 49, textureX, textureY); // Box 468
		bodyModel[391] = new ModelRendererTurbo(this, 187, 49, textureX, textureY); // Box 469
		bodyModel[392] = new ModelRendererTurbo(this, 178, 46, textureX, textureY); // Box 470
		bodyModel[393] = new ModelRendererTurbo(this, 178, 52, textureX, textureY); // Box 471
		bodyModel[394] = new ModelRendererTurbo(this, 171, 48, textureX, textureY); // Box 486
		bodyModel[395] = new ModelRendererTurbo(this, 275, 21, textureX, textureY); // Box 398
		bodyModel[396] = new ModelRendererTurbo(this, 92, 205, textureX, textureY); // Box 381
		bodyModel[397] = new ModelRendererTurbo(this, 84, 205, textureX, textureY); // Box 382
		bodyModel[398] = new ModelRendererTurbo(this, 298, 1, textureX, textureY); // Box 398 trainphone
		bodyModel[399] = new ModelRendererTurbo(this, 298, 1, textureX, textureY); // Box 399 trainphone
		bodyModel[400] = new ModelRendererTurbo(this, 73, 227, textureX, textureY); // Box 403 headlight backpart
		bodyModel[401] = new ModelRendererTurbo(this, 73, 227, textureX, textureY); // Box 404 headlight backpart
		bodyModel[402] = new ModelRendererTurbo(this, 73, 227, textureX, textureY); // Box 405 headlight backpart
		bodyModel[403] = new ModelRendererTurbo(this, 73, 227, textureX, textureY); // Box 406 headlight backpart
		bodyModel[404] = new ModelRendererTurbo(this, 171, 51, textureX, textureY); // Box 404
		bodyModel[405] = new ModelRendererTurbo(this, 158, 51, textureX, textureY); // Box 405

		bodyModel[0].addBox(0F, 0F, 0F, 57, 1, 20, 0F); // Box 0
		bodyModel[0].setRotationPoint(-25.5F, 0F, -10F);

		bodyModel[1].addBox(0F, 0F, 0F, 6, 2, 3, 0F); // Box 1
		bodyModel[1].setRotationPoint(-34.5F, 3F, -1.5F);

		bodyModel[2].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 1
		bodyModel[2].setRotationPoint(32.5F, 3F, -1.5F);

		bodyModel[3].addBox(0F, 0F, 0F, 28, 17, 1, 0F); // Box 0
		bodyModel[3].setRotationPoint(-8.5F, -15F, -11F);

		bodyModel[4].addBox(0F, 0F, 0F, 28, 17, 1, 0F); // Box 0
		bodyModel[4].setRotationPoint(-8.5F, -15F, 10F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 10, 12, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[5].setRotationPoint(-23F, -10F, 10F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 10, 12, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[6].setRotationPoint(-23F, -10F, -11F);

		bodyModel[7].addBox(0F, 0F, 0F, 1, 3, 4, 0F); // Box 1
		bodyModel[7].setRotationPoint(31.5F, 3F, -2F);

		bodyModel[8].addBox(0F, 0F, 0F, 1, 2, 20, 0F); // Box 1
		bodyModel[8].setRotationPoint(31.5F, 1F, -10F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 1, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[9].setRotationPoint(31.5F, 3F, -10F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 1, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F); // Box 1
		bodyModel[10].setRotationPoint(31.5F, 3F, 2F);

		bodyModel[11].addBox(0F, 0F, 0F, 1, 16, 20, 0F); // Box 0
		bodyModel[11].setRotationPoint(31.5F, -15F, -10F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 50, 1, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[12].setRotationPoint(-17.5F, -19F, -7F);

		bodyModel[13].addBox(0F, 0F, 0F, 50, 1, 6, 0F); // Box 0
		bodyModel[13].setRotationPoint(-17.5F, -19F, -3F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 50, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 0
		bodyModel[14].setRotationPoint(-17.5F, -19F, 3F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 50, 1, 3, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[15].setRotationPoint(-17.5F, -18F, -10F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 50, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F); // Box 0
		bodyModel[16].setRotationPoint(-17.5F, -18F, 7F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 50, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[17].setRotationPoint(-17.5F, -16F, -11F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 50, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[18].setRotationPoint(-17.5F, -16F, 10F);

		bodyModel[19].addBox(0F, 0F, 0F, 1, 2, 14, 0F); // Box 0
		bodyModel[19].setRotationPoint(31.5F, -17F, -7F);

		bodyModel[20].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Box 0
		bodyModel[20].setRotationPoint(31.5F, -18F, -3F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[21].setRotationPoint(31.5F, -17F, -10F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[22].setRotationPoint(31.5F, -17F, 7F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[23].setRotationPoint(31.5F, -18F, -7F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[24].setRotationPoint(31.5F, -18F, 3F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,-2.5F, 0F, 0F, 2.5F, 0F, 0F, 2.5F, 0F, 0F, -2.5F, 0F, 0F, 0.5F, 1F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, 0.5F, 1F, 0F); // Box 0
		bodyModel[25].setRotationPoint(-22F, -18F, -2F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, -1F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[26].setRotationPoint(-19.5F, -19F, -2F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-0.5F, -2F, 0F, 1F, -1F, 0F, 0.5F, 0F, 0F, 0F, -1F, 0F, -0.5F, 1F, 0F, 1F, 1F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[27].setRotationPoint(-19.5F, -19F, -7F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-1F, -3F, 0F, 1F, -2F, 0F, 1F, 0F, 0F, -0.5F, -1F, 0F, -1F, 2F, 0F, 1F, 2F, 0F, 1F, 0F, 0F, -0.5F, 0F, 0F); // Box 0
		bodyModel[28].setRotationPoint(-19.5F, -18F, -10F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 0
		bodyModel[29].setRotationPoint(-18.5F, -16F, 10F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 1, 6, 4, 0F,-1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 1 pilot a
		bodyModel[30].setRotationPoint(-32.5F, 3F, -2F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 106
		bodyModel[31].setRotationPoint(-30F, -12F, -2F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 1, 12, 4, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 112
		bodyModel[32].setRotationPoint(-32F, -10F, -2F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,-2F, -0.25F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 117
		bodyModel[33].setRotationPoint(-29F, -14F, -2F);

		bodyModel[34].addBox(0F, 0F, 0F, 5, 1, 4, 0F); // Box 118
		bodyModel[34].setRotationPoint(-26F, -14F, -2F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 129
		bodyModel[35].setRotationPoint(-18.5F, -16F, -11F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[36].setRotationPoint(-8.5F, -18F, -10F);

		bodyModel[37].addBox(0F, 0F, 0F, 4, 5, 1, 0F); // Box 0
		bodyModel[37].setRotationPoint(-12.5F, -3F, 10F);

		bodyModel[38].addBox(0F, 0F, 0F, 1, 5, 1, 0F); // Box 0
		bodyModel[38].setRotationPoint(-14F, -15F, 10F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 3, 5, 1, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[39].setRotationPoint(-17.5F, -15F, 10F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 1, 17, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[40].setRotationPoint(-13F, -15F, 10F);

		bodyModel[41].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 0
		bodyModel[41].setRotationPoint(-12.5F, -15F, 10F);

		bodyModel[42].addBox(0F, 0F, 0F, 4, 5, 1, 0F); // Box 0
		bodyModel[42].setRotationPoint(-12.5F, -3F, -11F);

		bodyModel[43].addBox(0F, 0F, 0F, 1, 5, 1, 0F); // Box 0
		bodyModel[43].setRotationPoint(-14F, -15F, -11F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 3, 5, 1, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[44].setRotationPoint(-17.5F, -15F, -11F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 1, 17, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[45].setRotationPoint(-13F, -15F, -11F);

		bodyModel[46].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 0
		bodyModel[46].setRotationPoint(-12.5F, -15F, -11F);

		bodyModel[47].addBox(0F, 0F, 0F, 1, 11, 8, 0F); // Box 0
		bodyModel[47].setRotationPoint(-21F, -11F, -10F);

		bodyModel[48].addBox(0F, 0F, 0F, 6, 1, 6, 0F); // Box 0
		bodyModel[48].setRotationPoint(-5.5F, -20F, -3F);

		bodyModel[49].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 0
		bodyModel[49].setRotationPoint(2.5F, -20F, -2F);

		bodyModel[50].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 0
		bodyModel[50].setRotationPoint(8.5F, -20F, -2F);

		bodyModel[51].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 0
		bodyModel[51].setRotationPoint(13.5F, -20F, -2F);

		bodyModel[52].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 0
		bodyModel[52].setRotationPoint(19.5F, -20F, -2F);

		bodyModel[53].addBox(0F, 0F, 0F, 8, 4, 20, 0F); // Box 42
		bodyModel[53].setRotationPoint(1F, 2F, -10F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 8, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -2F, 0F, -0.25F, -2F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 44
		bodyModel[54].setRotationPoint(1F, 6F, -10F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 45
		bodyModel[55].setRotationPoint(-3F, 3.5F, -10.5F);

		bodyModel[56].addBox(0F, 0F, 0F, 4, 3, 19, 0F); // Box 46
		bodyModel[56].setRotationPoint(-3F, 3.5F, -9.5F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 4, 1, 19, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, 0.5F, -1F); // Box 48
		bodyModel[57].setRotationPoint(-3F, 6.5F, -9.5F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 50
		bodyModel[58].setRotationPoint(-3F, 3.5F, 9.5F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 8, 3, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 324
		bodyModel[59].setRotationPoint(1F, 6F, -8F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 8, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -2F, 0F, -0.25F, -2F); // Box 325
		bodyModel[60].setRotationPoint(1F, 6F, 8F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 12, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 123
		bodyModel[61].setRotationPoint(-3F, 2F, -11F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F); // Box 254
		bodyModel[62].setRotationPoint(-6F, 2F, -11F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 12, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 255
		bodyModel[63].setRotationPoint(-3F, 2F, 10F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F); // Box 136
		bodyModel[64].setRotationPoint(-6F, 2F, 10F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -0.5F, 0F); // Box 137
		bodyModel[65].setRotationPoint(9F, 2F, 10F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -0.5F, 0F); // Box 138
		bodyModel[66].setRotationPoint(9F, 2F, -11F);

		bodyModel[67].addBox(0F, 0F, 0F, 4, 2, 21, 0F); // Box 139
		bodyModel[67].setRotationPoint(-3F, 1.5F, -10.5F);

		bodyModel[68].addBox(0F, 0F, 0F, 3, 3, 1, 0F); // Box 140
		bodyModel[68].setRotationPoint(5F, 2F, -10.5F);

		bodyModel[69].addBox(0F, 0F, 0F, 3, 3, 1, 0F); // Box 141
		bodyModel[69].setRotationPoint(5F, 2F, 9.5F);

		bodyModel[70].addBox(0F, 0F, 0F, 2, 2, 5, 0F); // Box 111
		bodyModel[70].setRotationPoint(-27F, -8.5F, -10F);
		bodyModel[70].rotateAngleY = 0.6981317F;

		bodyModel[71].addBox(0F, 0F, -5F, 2, 2, 5, 0F); // Box 144
		bodyModel[71].setRotationPoint(-27F, -8.5F, 10F);
		bodyModel[71].rotateAngleY = -0.6981317F;

		bodyModel[72].addShapeBox(0F, 0F, 0F, 2, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 145
		bodyModel[72].setRotationPoint(-33F, 0F, -4F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 2, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 146
		bodyModel[73].setRotationPoint(-33F, 0F, 4F);

		bodyModel[74].addBox(0F, 0F, 0F, 2, 1, 0, 0F); // Box 147
		bodyModel[74].setRotationPoint(-33F, -1F, -4F);

		bodyModel[75].addBox(0F, 0F, 0F, 2, 1, 0, 0F); // Box 148
		bodyModel[75].setRotationPoint(-33F, -1F, 4F);

		bodyModel[76].addBox(0F, 0F, 0F, 1, 5, 0, 0F); // Box 149
		bodyModel[76].setRotationPoint(-30.75F, -8F, -3F);
		bodyModel[76].rotateAngleZ = -0.15707963F;

		bodyModel[77].addBox(0F, 0F, 0F, 1, 5, 0, 0F); // Box 150
		bodyModel[77].setRotationPoint(-30.75F, -8F, 3F);
		bodyModel[77].rotateAngleZ = -0.15707963F;

		bodyModel[78].addBox(0F, 0F, 0F, 1, 2, 5, 0F); // Box 151
		bodyModel[78].setRotationPoint(-32.5F, 1F, -2.5F);

		bodyModel[79].addBox(0F, 0F, 0F, 0, 13, 1, 0F); // Box 152
		bodyModel[79].setRotationPoint(-8F, -11F, -11.75F);

		bodyModel[80].addBox(0F, 0F, 0F, 0, 13, 1, 0F); // Box 153
		bodyModel[80].setRotationPoint(-13F, -11F, -11.75F);

		bodyModel[81].addBox(0F, 0F, 0F, 0, 13, 1, 0F); // Box 154
		bodyModel[81].setRotationPoint(-13F, -11F, 10.75F);

		bodyModel[82].addBox(0F, 0F, 0F, 0, 13, 1, 0F); // Box 155
		bodyModel[82].setRotationPoint(-8F, -11F, 10.75F);

		bodyModel[83].addBox(0F, 0F, 0F, 4, 5, 0, 0F); // Box 156
		bodyModel[83].setRotationPoint(-12.5F, 2F, -11F);

		bodyModel[84].addBox(0F, 0F, 0F, 4, 5, 0, 0F); // Box 157
		bodyModel[84].setRotationPoint(-12.5F, 2F, 11F);

		bodyModel[85].addBox(0F, 0F, 0F, 0, 4, 1, 0F); // Box 350
		bodyModel[85].setRotationPoint(-17.5F, -14F, -12F);

		bodyModel[86].addBox(0F, 0F, 0F, 0, 4, 1, 0F); // Box 351
		bodyModel[86].setRotationPoint(-17.5F, -14F, 11F);

		bodyModel[87].addBox(0F, 0F, 0F, 3, 5, 0, 0F); // Box 160
		bodyModel[87].setRotationPoint(-22F, 2F, -11F);

		bodyModel[88].addBox(0F, 0F, 0F, 3, 5, 0, 0F); // Box 161
		bodyModel[88].setRotationPoint(-22F, 2F, 11F);

		bodyModel[89].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 299
		bodyModel[89].setRotationPoint(-15F, -20.5F, -5F);

		bodyModel[90].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 300
		bodyModel[90].setRotationPoint(-15F, -19.5F, -5F);

		bodyModel[91].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 301
		bodyModel[91].setRotationPoint(-15F, -20.5F, 4F);

		bodyModel[92].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 302
		bodyModel[92].setRotationPoint(-12F, -19.5F, 4F);

		bodyModel[93].addBox(0F, 0F, 0F, 0, 11, 1, 0F); // Box 177
		bodyModel[93].setRotationPoint(24F, -9F, -11.75F);

		bodyModel[94].addBox(0F, 0F, 0F, 0, 11, 1, 0F); // Box 178
		bodyModel[94].setRotationPoint(19F, -9F, -11.75F);

		bodyModel[95].addBox(0F, 0F, 0F, 0, 11, 1, 0F); // Box 179
		bodyModel[95].setRotationPoint(24F, -9F, 10.75F);

		bodyModel[96].addBox(0F, 0F, 0F, 0, 11, 1, 0F); // Box 180
		bodyModel[96].setRotationPoint(19F, -9F, 10.75F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 348 commander beacon
		bodyModel[97].setRotationPoint(-15F, -20F, -0.5F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0.1F, -0.5F, 0.1F, -0.9F, -0.5F, 0.1F, -0.9F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, 0F, 0.1F, -0.9F, 0F, 0.1F, -0.9F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 349
		bodyModel[98].setRotationPoint(-15F, -20F, -0.5F);

		bodyModel[99].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 183 CNW Gong
		bodyModel[99].setRotationPoint(-31.25F, -13F, -1F);

		bodyModel[100].addBox(0F, 0F, 0F, 0, 2, 5, 0F); // Box 184 numberboard glow
		bodyModel[100].setRotationPoint(-27.01F, -8.5F, -10F);
		bodyModel[100].rotateAngleY = 0.6981317F;

		bodyModel[101].addBox(0F, 0F, -5F, 0, 2, 5, 0F); // Box 185 numberboard glow
		bodyModel[101].setRotationPoint(-27.01F, -8.5F, 10F);
		bodyModel[101].rotateAngleY = -0.6981317F;

		bodyModel[102].addBox(0F, 0F, 0F, 6, 2, 6, 0F); // Box 186 winterization hatch cull
		bodyModel[102].setRotationPoint(19.35F, -21F, -3F);

		bodyModel[103].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 187
		bodyModel[103].setRotationPoint(27F, -20F, -3F);

		bodyModel[104].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 188
		bodyModel[104].setRotationPoint(29F, -20F, 1F);

		bodyModel[105].addBox(0F, 0F, 0F, 4, 5, 0, 0F); // Box 189
		bodyModel[105].setRotationPoint(19.5F, 2F, -11F);

		bodyModel[106].addBox(0F, 0F, 0F, 4, 5, 0, 0F); // Box 190
		bodyModel[106].setRotationPoint(19.5F, 2F, 11F);

		bodyModel[107].addBox(0F, 0F, 0F, 3, 5, 0, 0F); // Box 191
		bodyModel[107].setRotationPoint(28F, 2F, 11F);

		bodyModel[108].addBox(0F, 0F, 0F, 3, 5, 0, 0F); // Box 192
		bodyModel[108].setRotationPoint(28F, 2F, -11F);

		bodyModel[109].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 193
		bodyModel[109].setRotationPoint(-15F, -20.5F, 2F);

		bodyModel[110].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 194
		bodyModel[110].setRotationPoint(-13F, -19.5F, 2.5F);

		bodyModel[111].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 195
		bodyModel[111].setRotationPoint(-14F, -20.5F, 3F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 38, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F); // Box 196
		bodyModel[112].setRotationPoint(-7F, -14.5F, -11.25F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 38, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F); // Box 197
		bodyModel[113].setRotationPoint(-7F, -14.5F, 10.25F);

		bodyModel[114].addBox(0F, 0F, 0F, 0, 6, 1, 0F); // Box 198
		bodyModel[114].setRotationPoint(31F, -4F, -11.75F);

		bodyModel[115].addBox(0F, 0F, 0F, 0, 6, 1, 0F); // Box 199
		bodyModel[115].setRotationPoint(28F, -4F, -11.75F);

		bodyModel[116].addBox(0F, 0F, 0F, 0, 6, 1, 0F); // Box 200
		bodyModel[116].setRotationPoint(31F, -4F, 10.75F);

		bodyModel[117].addBox(0F, 0F, 0F, 0, 6, 1, 0F); // Box 201
		bodyModel[117].setRotationPoint(28F, -4F, 10.75F);

		bodyModel[118].addBox(0F, 0F, 0F, 2, 1, 6, 0F); // Box 202
		bodyModel[118].setRotationPoint(32.5F, -19F, -3F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, -1F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -2F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 203
		bodyModel[119].setRotationPoint(32.5F, -19F, -7F);

		bodyModel[120].addBox(0F, 0F, 0F, 2, 15, 1, 0F); // Box 314
		bodyModel[120].setRotationPoint(32.5F, -14F, -4F);

		bodyModel[121].addBox(0F, 0F, 0F, 2, 15, 1, 0F); // Box 316
		bodyModel[121].setRotationPoint(32.5F, -14F, 3F);

		bodyModel[122].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 278
		bodyModel[122].setRotationPoint(-11F, -20.5F, -1F);

		bodyModel[123].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 279
		bodyModel[123].setRotationPoint(-10F, -20.5F, 0F);

		bodyModel[124].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 280
		bodyModel[124].setRotationPoint(-12F, -20.5F, 1F);

		bodyModel[125].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 214
		bodyModel[125].setRotationPoint(-9F, -19.5F, 0.5F);

		bodyModel[126].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 215
		bodyModel[126].setRotationPoint(-17F, -20.5F, 4F);

		bodyModel[127].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 216
		bodyModel[127].setRotationPoint(-16F, -20F, 5F);

		bodyModel[128].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 217
		bodyModel[128].setRotationPoint(-18F, -19.5F, 6F);

		bodyModel[129].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 218
		bodyModel[129].setRotationPoint(-15F, -19F, 5F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F); // Box 131
		bodyModel[130].setRotationPoint(-19F, -11F, 8.5F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 2, 5, 2, 0F,-0.2F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0.5F, -0.2F, -0.1F, 0.5F, -0.2F, -0.1F, 0.5F, -0.2F, -0.2F, 0.5F, -0.2F); // Box 131
		bodyModel[131].setRotationPoint(-19.5F, -9F, 8F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 131
		bodyModel[132].setRotationPoint(-17F, -11F, 2F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 1, 7, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 131
		bodyModel[133].setRotationPoint(-18F, -11F, 1F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 131
		bodyModel[134].setRotationPoint(-19F, -11F, 2F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F); // Box 131
		bodyModel[135].setRotationPoint(-20F, -12.3F, 4F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0.15F, -0.75F, -1F, -1F, -0.75F, 0.15F, 0.15F, -0.75F, -1F, -1F, -0.75F, 0.15F, 0.15F, 0F, -1F, -1F, 0F, 0.15F, 0.15F, 0F, -1F, -1F, 0F, 0.15F); // Box 131
		bodyModel[136].setRotationPoint(-18.5F, -13F, 1.5F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.5F, 0F, -1.25F, -1.5F, 0F, 0.25F, -0.25F, 0F, -1.25F, -1.25F, 0F, 0.25F, -0.5F, 0F, -1.25F, -1.5F, 0F, 0.25F, -0.25F, 0F, -1.25F, -1.25F, 0F, 0.25F); // Box 131
		bodyModel[137].setRotationPoint(-20.5F, -13.5F, 2.75F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, -2F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 1F, 0F, 0F, 1F, 0F); // Box 231
		bodyModel[138].setRotationPoint(32.5F, -19F, 3F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 247 headlight rear left
		bodyModel[139].setRotationPoint(32F, -10.5F, -9F);

		bodyModel[140].addBox(0F, 0F, 0F, 0, 5, 5, 0F); // Box 222
		bodyModel[140].setRotationPoint(32.51F, 2F, -10F);

		bodyModel[141].addBox(0F, 0F, 0F, 0, 5, 5, 0F); // Box 223
		bodyModel[141].setRotationPoint(32.51F, 2F, 5F);

		bodyModel[142].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 438
		bodyModel[142].setRotationPoint(18F, 3F, -2F);

		bodyModel[143].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 439
		bodyModel[143].setRotationPoint(-16F, 3F, -2F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 3, 2, 4, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 336
		bodyModel[144].setRotationPoint(-18.75F, -20.5F, -2F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 337 ane 2 beam
		bodyModel[145].setRotationPoint(-19.5F, -20.5F, 0F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 338 ane 2 beam
		bodyModel[146].setRotationPoint(-19.5F, -20.5F, -2F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 443 ditchlight front a
		bodyModel[147].setRotationPoint(-32.25F, 0.75F, -6.5F);

		bodyModel[148].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 444
		bodyModel[148].setRotationPoint(-31.5F, 0.75F, -6.5F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 445 ditchlight front a
		bodyModel[149].setRotationPoint(-32.25F, 0.75F, 4.5F);

		bodyModel[150].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 446
		bodyModel[150].setRotationPoint(-31.5F, 0.75F, 4.5F);

		bodyModel[151].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 447
		bodyModel[151].setRotationPoint(16F, -21F, -4F);

		bodyModel[152].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 448
		bodyModel[152].setRotationPoint(14F, -21F, -3F);

		bodyModel[153].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 449
		bodyModel[153].setRotationPoint(15F, -21F, -5F);

		bodyModel[154].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 450
		bodyModel[154].setRotationPoint(17F, -20F, -3.5F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -1F, 0F, -0.5F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 260
		bodyModel[155].setRotationPoint(-13F, -25F, 6F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 264
		bodyModel[156].setRotationPoint(-13F, -25F, 8F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0F, 0F, -1F, -1.5F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -2F); // Box 268
		bodyModel[157].setRotationPoint(-13F, -24F, 5F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 1F, 0F, 0.5F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 274
		bodyModel[158].setRotationPoint(-13F, -24F, 8F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 3, 7, 3, 0F,0F, 0F, -2F, -1F, 0F, -0.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 1F, -2F, -0.5F, -2F, 0F, 1F, 0F, 0F, 1F); // Box 283
		bodyModel[159].setRotationPoint(-13F, -22F, 7F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 3, 7, 3, 0F,0F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -2F, 0F, -3F, 1F, -2F, -3F, 1F, 1F, -2F, -0.5F, 0F, -3F, -3F); // Box 284
		bodyModel[160].setRotationPoint(-13F, -22F, 5F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 3, 7, 3, 0F,0F, 0F, -2F, -1F, 0F, -0.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -3F, 1F, -2F, -0.5F, -2F, -3F, 1F, 0F, -3F, 1F); // Box 291
		bodyModel[161].setRotationPoint(-13F, -22F, -8F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 3, 7, 3, 0F,0F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, 1F, -2F, 0F, 1F, 1F, -2F, -0.5F, 0F, 0F, -3F); // Box 292
		bodyModel[162].setRotationPoint(-13F, -22F, -10F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 1F, 0F, 0.5F, 0F, 0F, -1F); // Box 293
		bodyModel[163].setRotationPoint(-13F, -24F, -9F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 294
		bodyModel[164].setRotationPoint(-13F, -24F, -8F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, -1F, 0F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 295
		bodyModel[165].setRotationPoint(-13F, -25F, -8F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, 0F, -0.5F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 296
		bodyModel[166].setRotationPoint(-13F, -25F, -9F);

		bodyModel[167].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 249
		bodyModel[167].setRotationPoint(4F, -19.5F, -9F);

		bodyModel[168].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 250
		bodyModel[168].setRotationPoint(5F, -18.5F, -9F);

		bodyModel[169].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 251
		bodyModel[169].setRotationPoint(2F, -19.5F, -8F);

		bodyModel[170].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 252
		bodyModel[170].setRotationPoint(3F, -19.5F, -10F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 114
		bodyModel[171].setRotationPoint(4.5F, -18.5F, 8.7F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[172].setRotationPoint(4.5F, -19.5F, 8.7F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 78
		bodyModel[173].setRotationPoint(4.75F, -18F, 8.95F);

		bodyModel[174].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 245
		bodyModel[174].setRotationPoint(4.5F, -20.5F, 7.5F);

		bodyModel[175].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 257
		bodyModel[175].setRotationPoint(4.5F, -19.5F, 6.5F);

		bodyModel[176].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 194
		bodyModel[176].setRotationPoint(-13F, -21F, -2.5F);

		bodyModel[177].addShapeBox(0F, 0F, 0F, 1, 12, 6, 0F,1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 278
		bodyModel[177].setRotationPoint(-29F, -10F, 2F);

		bodyModel[178].addShapeBox(0F, 0F, 0F, 5, 12, 1, 0F,-1F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 1F, 0F, 2F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, -3F); // Box 279
		bodyModel[178].setRotationPoint(-28F, -10F, 10F);

		bodyModel[179].addShapeBox(0F, 0F, 0F, 2, 12, 1, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 280
		bodyModel[179].setRotationPoint(-25F, -10F, 10F);

		bodyModel[180].addShapeBox(0F, 0F, 0F, 5, 1, 6, 0F,0F, 0F, 0F, -5F, 0F, 0F, 0F, -1.5F, 0F, 1F, -3F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 1.5F, 0F, 1F, 3F, 0F); // Box 281
		bodyModel[180].setRotationPoint(-26F, -14F, 2F);

		bodyModel[181].addShapeBox(0F, 0F, 0F, 5, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, -5F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, -5F, 1.5F, 0F); // Box 282
		bodyModel[181].setRotationPoint(-26F, -14F, 2F);

		bodyModel[182].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, -0.25F, 0F, 0F, 0F, 0F, -1F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 2F, 0F, 0F, 2F, 0F); // Box 284
		bodyModel[182].setRotationPoint(-27F, -14F, 2F);

		bodyModel[183].addShapeBox(0F, 0F, 0F, 6, 1, 3, 0F,0F, -2F, 0F, 0F, -0.5F, 0F, -2F, -2.75F, 0F, 0F, -2F, -3F, 0F, 1F, 0F, 0F, 0.5F, 0F, -2F, 1.75F, -1F, 0F, 1F, -3F); // Box 289
		bodyModel[183].setRotationPoint(-27F, -13F, 8F);

		bodyModel[184].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,-2F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, -2.75F, 0F, -2F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 2F, 0F, 0F, 2F, 0F); // Box 291
		bodyModel[184].setRotationPoint(-23F, -13F, 8F);

		bodyModel[185].addBox(0F, 0F, 0F, 13, 3, 20, 0F); // Box 293
		bodyModel[185].setRotationPoint(-20.5F, -3F, -10F);

		bodyModel[186].addShapeBox(0F, 0F, 0F, 1, 12, 6, 0F,-1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F); // Box 294
		bodyModel[186].setRotationPoint(-29F, -10F, -8F);

		bodyModel[187].addShapeBox(0F, 0F, 0F, 5, 12, 1, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 2F, 2F, 0F, -3F, -2F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, 2F); // Box 295
		bodyModel[187].setRotationPoint(-28F, -10F, -11F);

		bodyModel[188].addShapeBox(0F, 0F, 0F, 2, 12, 1, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 296
		bodyModel[188].setRotationPoint(-25F, -10F, -11F);

		bodyModel[189].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-2.5F, 0F, 0F, 2.5F, 0F, 0F, 2.5F, 0F, 0F, -3.5F, 0F, 0F, 0F, 1F, 0F, 0.5F, 1F, 0F, 0.5F, 1F, 0F, -1.5F, 1F, 0F); // Box 311
		bodyModel[189].setRotationPoint(-21F, -15F, 10F);

		bodyModel[190].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F,-2.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 312
		bodyModel[190].setRotationPoint(-20F, -15F, 10F);

		bodyModel[191].addShapeBox(0F, 0F, 0F, 5, 1, 6, 0F,1F, -3F, 0F, 0F, -1.5F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 1F, 3F, 0F, 0F, 1.5F, 0F, -5F, 0F, 0F, 0F, 0F, 0F); // Box 313
		bodyModel[191].setRotationPoint(-26F, -14F, -8F);

		bodyModel[192].addShapeBox(0F, 0F, 0F, 5, 1, 6, 0F,-5F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 314
		bodyModel[192].setRotationPoint(-26F, -14F, -8F);

		bodyModel[193].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, -3F, 0F, -1F, -3F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, 2F, 0F, -1F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 315
		bodyModel[193].setRotationPoint(-27F, -14F, -8F);

		bodyModel[194].addShapeBox(0F, 0F, 0F, 1, 4, 5, 0F,-3F, 0F, 0F, 3F, 0F, 0F, 2.5F, 1F, 0F, -2.5F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 323
		bodyModel[194].setRotationPoint(-22F, -17F, -7F);

		bodyModel[195].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F,-3.5F, -1F, 0F, 3.5F, -1F, 0F, 3F, 1F, 0F, -3F, 1F, 0F, -1F, 2F, 0F, 1F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 324
		bodyModel[195].setRotationPoint(-22F, -16F, -10F);

		bodyModel[196].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-3.5F, 0F, 0F, 2.5F, 0F, 0F, 2.5F, 0F, 0F, -2.5F, 0F, 0F, -1.5F, 1F, 0F, 0.5F, 1F, 0F, 0.5F, 1F, 0F, 0F, 1F, 0F); // Box 325
		bodyModel[196].setRotationPoint(-21F, -15F, -11F);

		bodyModel[197].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F,-2.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 326
		bodyModel[197].setRotationPoint(-20F, -15F, -11F);

		bodyModel[198].addShapeBox(0F, 0F, 0F, 1, 4, 5, 0F,-2.5F, 1F, 0F, 2.5F, 1F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 327
		bodyModel[198].setRotationPoint(-22F, -17F, 2F);

		bodyModel[199].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F,-3F, 1F, 0F, 3F, 1F, 0F, 3.5F, -1F, 0F, -3.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 2F, 0F, -1F, 2F, 0F); // Box 328
		bodyModel[199].setRotationPoint(-22F, -16F, 7F);

		bodyModel[200].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0.9F, -2F, 0F, 0F, -2.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0F, 0F, 0.5F, 2F, 0F, 0F, 2F, 0F); // Box 329
		bodyModel[200].setRotationPoint(-21F, -13F, 8F);

		bodyModel[201].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -1F, 0F, 0.5F, 0F, 0F, 1F, -1F, 0F, -0.5F, -2F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 1F, 1F, 0F, -0.5F, 1F, 0F); // Box 330
		bodyModel[201].setRotationPoint(-19.5F, -19F, 2F);

		bodyModel[202].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.5F, -1F, 0F, 1F, 0F, 0F, 1F, -2F, 0F, -1F, -3F, 0F, -0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 2F, 0F, -1F, 2F, 0F); // Box 331
		bodyModel[202].setRotationPoint(-19.5F, -18F, 7F);

		bodyModel[203].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F); // Box 332
		bodyModel[203].setRotationPoint(-32F, 2F, 2F);

		bodyModel[204].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 333
		bodyModel[204].setRotationPoint(-32F, 2F, -8F);

		bodyModel[205].addBox(0F, 0F, 0F, 1, 1, 4, 0F); // Box 334
		bodyModel[205].setRotationPoint(-32F, 2F, -2F);

		bodyModel[206].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, -3F, -5F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, -3F, -5F, 0F, -2F); // Box 335
		bodyModel[206].setRotationPoint(-30F, 2F, 8F);

		bodyModel[207].addBox(0F, 0F, 0F, 61, 2, 14, 0F); // Box 441
		bodyModel[207].setRotationPoint(-29.5F, 1F, -7F);

		bodyModel[208].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 167
		bodyModel[208].setRotationPoint(-29.5F, -12F, 0F);

		bodyModel[209].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 166
		bodyModel[209].setRotationPoint(-29.5F, -12F, -2F);

		bodyModel[210].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 165
		bodyModel[210].setRotationPoint(-29.5F, -14F, -2F);

		bodyModel[211].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 164
		bodyModel[211].setRotationPoint(-29.5F, -14F, 0F);

		bodyModel[212].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 556
		bodyModel[212].setRotationPoint(-30.5F, -8F, 0F);

		bodyModel[213].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 557
		bodyModel[213].setRotationPoint(-30.5F, -8F, -2F);

		bodyModel[214].addBox(0F, 0F, 0F, 8, 1, 9, 0F); // Box 865
		bodyModel[214].setRotationPoint(-20.5F, -4F, 1F);

		bodyModel[215].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,-1F, -2F, 0F, 1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 866
		bodyModel[215].setRotationPoint(-29F, -12F, -8F);

		bodyModel[216].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F,0F, -3F, 0F, -1F, -2F, 0F, -1F, 0.75F, 0F, 1F, -1F, 0F, 0F, 1F, 0F, -1F, 1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 867
		bodyModel[216].setRotationPoint(-28F, -13F, -8F);

		bodyModel[217].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F,1F, -1F, 0F, -1F, 0.75F, 0F, -1F, -2F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 1F, 0F, 0F, 1F, 0F); // Box 868
		bodyModel[217].setRotationPoint(-28F, -13F, 2F);

		bodyModel[218].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, -2F, 0F, -1F, -2F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 869
		bodyModel[218].setRotationPoint(-29F, -12F, 2F);

		bodyModel[219].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-5F, 0F, -2F, 4F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, -2F, 4F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1296
		bodyModel[219].setRotationPoint(-30F, 2F, -13F);

		bodyModel[220].addShapeBox(0F, 0F, 0F, 1, 6, 4, 0F,-1F, 0F, 0F, 1F, 0F, 0F, 3F, 0F, 1F, -3F, 0F, 1F, 1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 1297 pilot a
		bodyModel[220].setRotationPoint(-32.5F, 3F, 2F);

		bodyModel[221].addShapeBox(0F, 0F, 0F, 1, 6, 4, 0F,-3F, 0F, 1F, 3F, 0F, 1F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 1299 pilot a
		bodyModel[221].setRotationPoint(-32.5F, 3F, -6F);

		bodyModel[222].addShapeBox(0F, 0F, 0F, 1, 5, 2, 0F,-1F, 0F, 0F, 1F, 0F, 0F, 4F, 0F, 1F, -4F, 0F, 1F, 0.65F, 0F, 0.85F, -0.7F, 0F, 0.85F, 2F, 0F, 0F, -2F, 0F, 0F); // Box 1300 pilot a
		bodyModel[222].setRotationPoint(-30.5F, 3F, 7F);

		bodyModel[223].addShapeBox(0F, 0F, 0F, 1, 5, 2, 0F,-4F, 0F, 1F, 4F, 0F, 1F, 1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, -0.7F, 0F, 0.85F, 0.65F, 0F, 0.85F); // Box 1301 pilot a
		bodyModel[223].setRotationPoint(-30.5F, 3F, -9F);

		bodyModel[224].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,-1F, 0F, 0F, 0F, -0.5F, -2F, 0F, -0.75F, 2F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, -1F); // Box 1302
		bodyModel[224].setRotationPoint(-28F, -11F, 8F);

		bodyModel[225].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,-1F, 0F, -1F, 0F, -0.75F, 2F, 0F, -0.5F, -2F, -1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 1303
		bodyModel[225].setRotationPoint(-28F, -11F, -9F);

		bodyModel[226].addShapeBox(0F, 0F, 0F, 6, 1, 3, 0F,0F, -2F, -3F, -2F, -2.75F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, 1F, -3F, -2F, 1.75F, -1F, 0F, 0.5F, 0F, 0F, 1F, 0F); // Box 1304
		bodyModel[226].setRotationPoint(-27F, -13F, -11F);

		bodyModel[227].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -2.5F, 0F, 0.9F, -2F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, 0.5F, 2F, 0F, -0.5F, 0F, 0F, 0F, 0.5F, 0F); // Box 1305
		bodyModel[227].setRotationPoint(-21F, -13F, -11F);

		bodyModel[228].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, -2.75F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, -2F, -0.5F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0.5F, 0F, -2F, 0.5F, 0F); // Box 1306
		bodyModel[228].setRotationPoint(-23F, -13F, -11F);

		bodyModel[229].addShapeBox(-3.5F, 0F, -0.5F, 4, 11, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 329 door swing left cab
		bodyModel[229].setRotationPoint(-9F, -14F, -10.5F);

		bodyModel[230].addShapeBox(-3.5F, 0F, -0.5F, 4, 11, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 332 door swing right cab
		bodyModel[230].setRotationPoint(-9F, -14F, 10.5F);

		bodyModel[231].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -1F); // Box 326
		bodyModel[231].setRotationPoint(-18F, -19F, -3F);

		bodyModel[232].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, -1F, 0F, 0F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, -0.5F, 0F, -1F, 0F, 0F, 0F); // Box 327
		bodyModel[232].setRotationPoint(-18F, -19F, -7F);

		bodyModel[233].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 1F, 0F, -0.5F, 1F, 0F); // Box 328
		bodyModel[233].setRotationPoint(-18F, -19F, 2F);

		bodyModel[234].addShapeBox(-3.5F, 0F, -0.5F, 4, 11, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 329 door swing left hood
		bodyModel[234].setRotationPoint(23F, -10F, -10.5F);

		bodyModel[235].addShapeBox(-3.5F, 0F, -0.5F, 4, 11, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 332 door swing right hood
		bodyModel[235].setRotationPoint(23F, -10F, 10.5F);

		bodyModel[236].addBox(0F, 0F, 0F, 9, 17, 1, 0F); // Box 333
		bodyModel[236].setRotationPoint(23.5F, -15F, -11F);

		bodyModel[237].addBox(0F, 0F, 0F, 9, 17, 1, 0F); // Box 334
		bodyModel[237].setRotationPoint(23.5F, -15F, 10F);

		bodyModel[238].addBox(0F, 0F, 0F, 4, 5, 1, 0F); // Box 335
		bodyModel[238].setRotationPoint(19.5F, -15F, 10F);

		bodyModel[239].addBox(0F, 0F, 0F, 4, 5, 1, 0F); // Box 336
		bodyModel[239].setRotationPoint(19.5F, -15F, -11F);

		bodyModel[240].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 337
		bodyModel[240].setRotationPoint(19.5F, 1F, 10F);

		bodyModel[241].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 338
		bodyModel[241].setRotationPoint(19.5F, 1F, -11F);

		bodyModel[242].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 602
		bodyModel[242].setRotationPoint(-21F, -12F, -10F);

		bodyModel[243].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 603
		bodyModel[243].setRotationPoint(-21F, -12F, 7F);

		bodyModel[244].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 604
		bodyModel[244].setRotationPoint(-21F, -13F, -7F);

		bodyModel[245].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 605
		bodyModel[245].setRotationPoint(-21F, -13F, 2F);

		bodyModel[246].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 606
		bodyModel[246].setRotationPoint(-23F, -13F, -2F);

		bodyModel[247].addShapeBox(-0.5F, -0.5F, -0.5F, 1, 1, 1, 0F,-0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F); // Box 352 markerlight
		bodyModel[247].setRotationPoint(-27.9F, -9.5F, -7.7F);
		bodyModel[247].rotateAngleY = 0.6981317F;

		bodyModel[248].addShapeBox(-0.5F, -0.5F, -0.5F, 1, 1, 1, 0F,-0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F); // Box 353 markerlight
		bodyModel[248].setRotationPoint(-27.9F, -9.5F, 7.7F);
		bodyModel[248].rotateAngleY = -0.6981317F;

		bodyModel[249].addShapeBox(0F, 0F, 0F, 1, 7, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 356
		bodyModel[249].setRotationPoint(-20F, -10F, -10F);

		bodyModel[250].addShapeBox(0F, 0F, 0F, 1, 3, 5, 0F,0F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 357
		bodyModel[250].setRotationPoint(-20F, -13F, -7F);

		bodyModel[251].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 358
		bodyModel[251].setRotationPoint(-20F, -12F, -10F);

		bodyModel[252].addBox(0F, 0F, 0F, 1, 11, 8, 0F); // Box 359
		bodyModel[252].setRotationPoint(-21F, -11F, 2F);

		bodyModel[253].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 360
		bodyModel[253].setRotationPoint(-20F, -9.3F, 6F);

		bodyModel[254].addBox(0F, 0F, 0F, 8, 1, 5, 0F); // Box 361
		bodyModel[254].setRotationPoint(-20.5F, -4F, -10F);

		bodyModel[255].addBox(0F, 0F, 0F, 2, 6, 3, 0F); // Box 362
		bodyModel[255].setRotationPoint(-18F, -9F, -5F);

		bodyModel[256].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.65F, -0.35F, 0F, -0.65F, -0.35F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 103
		bodyModel[256].setRotationPoint(-30.5F, -14F, 1F);

		bodyModel[257].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.35F, -0.65F, 0F, -0.35F, -0.65F); // Box 103
		bodyModel[257].setRotationPoint(-30.5F, -14F, 0F);

		bodyModel[258].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, -0.65F, 0F, -0.35F, -0.65F, 0F, -0.8F, 0F, 0F, -0.8F, 0F); // Box 103
		bodyModel[258].setRotationPoint(-30.5F, -14F, -2F);

		bodyModel[259].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.65F, -0.35F, 0F, -0.65F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F); // Box 103
		bodyModel[259].setRotationPoint(-30.5F, -14F, -2F);

		bodyModel[260].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.65F, -0.35F, 0F, -0.65F, -0.35F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 103
		bodyModel[260].setRotationPoint(-30.5F, -12F, 1F);

		bodyModel[261].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.65F, -0.35F, 0F, -0.65F, -0.35F); // Box 103
		bodyModel[261].setRotationPoint(-30.5F, -12F, -2F);

		bodyModel[262].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.35F, -0.65F, 0F, -0.35F, -0.65F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 103
		bodyModel[262].setRotationPoint(-30.5F, -11F, 0F);

		bodyModel[263].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.35F, -0.65F, 0F, -0.35F, -0.65F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 103
		bodyModel[263].setRotationPoint(-30.5F, -11F, -2F);

		bodyModel[264].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-1F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 380
		bodyModel[264].setRotationPoint(-30F, -12F, 1F);

		bodyModel[265].addShapeBox(0F, -1.85F, -1F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 186 headlight 2beam top A
		bodyModel[265].setRotationPoint(-29.75F, -12F, 0F);

		bodyModel[266].addShapeBox(0F, -0.15F, -1F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 187 headlight 2beam top A
		bodyModel[266].setRotationPoint(-29.75F, -12F, 0F);

		bodyModel[267].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.35F, -0.65F, 0F, -0.35F, -0.65F); // Box 386
		bodyModel[267].setRotationPoint(-31.5F, -8F, 0F);

		bodyModel[268].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, -0.65F, 0F, -0.35F, -0.65F, 0F, -0.8F, 0F, 0F, -0.8F, 0F); // Box 387
		bodyModel[268].setRotationPoint(-31.5F, -8F, -2F);

		bodyModel[269].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.65F, -0.35F, 0F, -0.65F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F); // Box 388
		bodyModel[269].setRotationPoint(-31.5F, -8F, -2F);

		bodyModel[270].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.65F, -0.35F, 0F, -0.65F, -0.35F); // Box 389
		bodyModel[270].setRotationPoint(-31.5F, -6F, -2F);

		bodyModel[271].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.35F, -0.65F, 0F, -0.35F, -0.65F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 390
		bodyModel[271].setRotationPoint(-31.5F, -5F, -2F);

		bodyModel[272].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.35F, -0.65F, 0F, -0.35F, -0.65F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 391
		bodyModel[272].setRotationPoint(-31.5F, -5F, 0F);

		bodyModel[273].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.65F, -0.35F, 0F, -0.65F, -0.35F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 392
		bodyModel[273].setRotationPoint(-31.5F, -6F, 1F);

		bodyModel[274].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.65F, -0.35F, 0F, -0.65F, -0.35F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 393
		bodyModel[274].setRotationPoint(-31.5F, -8F, 1F);

		bodyModel[275].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 169 headlight big top
		bodyModel[275].setRotationPoint(-29.75F, -13.25F, -1.25F);

		bodyModel[276].addShapeBox(0F, -1.85F, -1F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 186 headlight 2beam bottom A
		bodyModel[276].setRotationPoint(-31.1F, -6F, 0F);

		bodyModel[277].addShapeBox(0F, -0.15F, -1F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 187 headlight 2beam bottom A
		bodyModel[277].setRotationPoint(-31.1F, -6F, 0F);

		bodyModel[278].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 169 headlight big bottom
		bodyModel[278].setRotationPoint(-31.1F, -7.25F, -1.25F);

		bodyModel[279].addShapeBox(0F, -1.85F, -1F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 186 headlight 2beam bottom B
		bodyModel[279].setRotationPoint(-31.1F, -6F, 0F);
		bodyModel[279].rotateAngleX = 1.57079633F;

		bodyModel[280].addShapeBox(0F, -0.15F, -1F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 187 headlight 2beam bottom B
		bodyModel[280].setRotationPoint(-31.1F, -6F, 0F);
		bodyModel[280].rotateAngleX = 1.57079633F;

		bodyModel[281].addShapeBox(0F, -1.85F, -1F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 186 headlight 2beam top B
		bodyModel[281].setRotationPoint(-29.75F, -12F, 0F);
		bodyModel[281].rotateAngleX = 1.57079633F;

		bodyModel[282].addShapeBox(0F, -0.15F, -1F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 187 headlight 2beam top B
		bodyModel[282].setRotationPoint(-29.75F, -12F, 0F);
		bodyModel[282].rotateAngleX = 1.57079633F;

		bodyModel[283].addShapeBox(0F, 0F, 0F, 0, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 403 headlight cover
		bodyModel[283].setRotationPoint(-30.51F, -14F, 0F);

		bodyModel[284].addShapeBox(0F, 0F, 0F, 0, 2, 2, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 404 headlight cover
		bodyModel[284].setRotationPoint(-30.51F, -14F, -2F);

		bodyModel[285].addShapeBox(0F, 0F, 0F, 0, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 405 headlight cover
		bodyModel[285].setRotationPoint(-30.51F, -12F, -2F);

		bodyModel[286].addShapeBox(0F, 0F, 0F, 0, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 406 headlight cover
		bodyModel[286].setRotationPoint(-30.51F, -12F, 0F);

		bodyModel[287].addBox(-1F, 0F, -1F, 2, 3, 2, 0F); // Box 407
		bodyModel[287].setRotationPoint(-17F, -12F, -4F);
		bodyModel[287].rotateAngleY = -0.78539816F;

		bodyModel[288].addBox(0F, 0F, 0F, 2, 14, 1, 0F); // Box 409
		bodyModel[288].setRotationPoint(-23F, -13F, 2F);

		bodyModel[289].addBox(0F, 0F, 0F, 2, 14, 1, 0F); // Box 410
		bodyModel[289].setRotationPoint(-23F, -13F, -3F);

		bodyModel[290].addBox(0F, 0F, 0F, 1, 14, 6, 0F); // Box 411
		bodyModel[290].setRotationPoint(-24F, -13F, -3F);

		bodyModel[291].addShapeBox(0F, 0F, 0F, 0, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 1F, 0F, 0.5F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, 0.5F, -1F, 0F); // Box 413
		bodyModel[291].setRotationPoint(-17.5F, -19F, -7F);

		bodyModel[292].addShapeBox(0F, 0F, 0F, 0, 1, 5, 0F,0.5F, 1F, 0F, -0.5F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 414
		bodyModel[292].setRotationPoint(-17.5F, -19F, 2F);

		bodyModel[293].addBox(0F, 0F, 0F, 0, 1, 4, 0F); // Box 415
		bodyModel[293].setRotationPoint(-18F, -20F, -2F);

		bodyModel[294].addShapeBox(0F, 0F, 0F, 0, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 416
		bodyModel[294].setRotationPoint(-17.5F, -17F, -10F);

		bodyModel[295].addShapeBox(0F, 0F, 0F, 0, 1, 3, 0F,0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 417
		bodyModel[295].setRotationPoint(-17.5F, -17F, 7F);

		bodyModel[296].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 418 headlight rear right
		bodyModel[296].setRotationPoint(32F, -10.5F, 7F);

		bodyModel[297].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,-1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 419 pilot b, c
		bodyModel[297].setRotationPoint(-32F, 5F, -2F);

		bodyModel[298].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,-4F, 0F, 1F, 4F, 0F, 1F, 1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, -0.55F, 0F, 0.75F, 0.5F, 0F, 0.75F); // Box 420 pilot b
		bodyModel[298].setRotationPoint(-30F, 5F, -9F);

		bodyModel[299].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,-3F, 0F, 1F, 3F, 0F, 1F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 421 pilot b
		bodyModel[299].setRotationPoint(-32F, 5F, -6F);

		bodyModel[300].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,-1F, 0F, 0F, 1F, 0F, 0F, 3F, 0F, 1F, -3F, 0F, 1F, 1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 422 pilot b
		bodyModel[300].setRotationPoint(-32F, 5F, 2F);

		bodyModel[301].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,-1F, 0F, 0F, 1F, 0F, 0F, 4F, 0F, 1F, -4F, 0F, 1F, 0.5F, 0F, 0.75F, -0.55F, 0F, 0.75F, 2F, 0F, 0F, -2F, 0F, 0F); // Box 423 pilot b
		bodyModel[301].setRotationPoint(-30F, 5F, 7F);

		bodyModel[302].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 424
		bodyModel[302].setRotationPoint(-25F, 2F, -11F);

		bodyModel[303].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 425
		bodyModel[303].setRotationPoint(-25F, 2F, 10F);

		bodyModel[304].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 427 pilot b, c
		bodyModel[304].setRotationPoint(-31F, 3F, -2F);

		bodyModel[305].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, -1F, -2F, 0F, -1F); // Box 429 pilot b
		bodyModel[305].setRotationPoint(-31F, 3F, 2F);

		bodyModel[306].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,-4F, 0F, -2F, 4F, 0F, -2F, -1F, 0F, 0F, 1F, 0F, 0F, -3F, 0F, -3F, 3F, 0F, -3F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 432 pilot b
		bodyModel[306].setRotationPoint(-29F, 3F, -13F);

		bodyModel[307].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,-1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, -1F, 2F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 433 pilot b
		bodyModel[307].setRotationPoint(-31F, 3F, -8F);

		bodyModel[308].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,1F, 0F, 0F, -1F, 0F, 0F, 4F, 0F, -2F, -4F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, 1F, 3F, 0F, -3F, -3F, 0F, -3F); // Box 434 pilot b
		bodyModel[308].setRotationPoint(-29F, 3F, 8F);

		bodyModel[309].addBox(0F, 0F, 0F, 2, 1, 0, 0F); // Box 435
		bodyModel[309].setRotationPoint(-31.5F, -7F, -4F);

		bodyModel[310].addShapeBox(0F, 0F, 0F, 2, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 436
		bodyModel[310].setRotationPoint(-31.5F, -6F, -4F);

		bodyModel[311].addBox(0F, 0F, 0F, 2, 1, 0, 0F); // Box 437
		bodyModel[311].setRotationPoint(-31.5F, -7F, 4F);

		bodyModel[312].addShapeBox(0F, 0F, 0F, 2, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 438
		bodyModel[312].setRotationPoint(-31.5F, -6F, 4F);

		bodyModel[313].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 439
		bodyModel[313].setRotationPoint(-12F, 1F, -11.75F);

		bodyModel[314].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 440
		bodyModel[314].setRotationPoint(-12F, -3F, -11.75F);

		bodyModel[315].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 441
		bodyModel[315].setRotationPoint(-12F, -3F, 10.75F);

		bodyModel[316].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 442
		bodyModel[316].setRotationPoint(-12F, 1F, 10.75F);

		bodyModel[317].addBox(0F, 0F, 0F, 1, 17, 1, 0F); // Box 443
		bodyModel[317].setRotationPoint(33.5F, -15F, 4F);

		bodyModel[318].addBox(0F, 0F, 0F, 1, 17, 1, 0F); // Box 444
		bodyModel[318].setRotationPoint(33.5F, -15F, -5F);

		bodyModel[319].addBox(0F, 0F, 0F, 2, 1, 8, 0F); // Box 445
		bodyModel[319].setRotationPoint(32.5F, -15F, -4F);

		bodyModel[320].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[320].setRotationPoint(33.5F, -16F, -5F);

		bodyModel[321].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 153
		bodyModel[321].setRotationPoint(33.5F, -16F, 0F);

		bodyModel[322].addBox(0F, 0F, 0F, 2, 1, 8, 0F); // Box 448
		bodyModel[322].setRotationPoint(32.5F, 1F, -4F);

		bodyModel[323].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F); // Box 82 stack 1
		bodyModel[323].setRotationPoint(7F, -20.75F, -1F);

		bodyModel[324].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F); // Box 85 stack 4
		bodyModel[324].setRotationPoint(18F, -20.75F, -1F);

		bodyModel[325].addBox(0F, 0F, 0F, 1, 14, 4, 0F); // Box 452 some door that magically vibes in the back
		bodyModel[325].setRotationPoint(32F, -13F, -2F);

		bodyModel[326].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 453
		bodyModel[326].setRotationPoint(33.5F, -14F, 0F);

		bodyModel[327].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 454
		bodyModel[327].setRotationPoint(33.5F, -14F, -3F);

		bodyModel[328].addBox(0F, 0F, 0F, 2, 1, 7, 0F); // Box 455
		bodyModel[328].setRotationPoint(32.5F, 2F, -3.5F);

		bodyModel[329].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 457
		bodyModel[329].setRotationPoint(6.5F, -21.75F, -2F);

		bodyModel[330].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 458
		bodyModel[330].setRotationPoint(17.5F, -21.75F, -2F);

		bodyModel[331].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 364 prime base
		bodyModel[331].setRotationPoint(-17.5F, -20F, -1F);

		bodyModel[332].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F); // Box 6 PRIME1-1
		bodyModel[332].setRotationPoint(-17.5F, -20.5F, -1F);

		bodyModel[333].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F); // Box 7 PRIME1-3
		bodyModel[333].setRotationPoint(-17.5F, -20.5F, -1F);

		bodyModel[334].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 8 PRIME1-2
		bodyModel[334].setRotationPoint(-17.5F, -20.5F, -1F);

		bodyModel[335].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 9 PRIME1-4
		bodyModel[335].setRotationPoint(-17.5F, -20.5F, -1F);

		bodyModel[336].addBox(0F, 0F, 0F, 2, 2, 10, 0F); // Box 464
		bodyModel[336].setRotationPoint(-0.5F, -20F, -5F);

		bodyModel[337].addBox(0F, 0F, 0F, 2, 0, 3, 0F); // Box 465
		bodyModel[337].setRotationPoint(3.5F, -20.5F, -1.5F);

		bodyModel[338].addShapeBox(0F, 0F, 0F, 2, 0, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F); // Box 466
		bodyModel[338].setRotationPoint(3.5F, -20.5F, 1.5F);

		bodyModel[339].addShapeBox(0F, 0F, 0F, 2, 0, 3, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 467
		bodyModel[339].setRotationPoint(3.5F, -20.5F, -4.5F);

		bodyModel[340].addShapeBox(0F, 0F, 0F, 1, 2, 9, 0F,1F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, -1F, -3F, 0F, -1F); // Box 474 pilot c
		bodyModel[340].setRotationPoint(-31F, 3F, 2F);

		bodyModel[341].addShapeBox(0F, 0F, 0F, 1, 2, 7, 0F,-4F, 0F, 1F, 4F, 0F, 1F, 1F, 0F, 0F, -1F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 476 pilot c
		bodyModel[341].setRotationPoint(-32F, 5F, -9F);

		bodyModel[342].addShapeBox(0F, 0F, 0F, 1, 2, 9, 0F,-2F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -3F, 0F, -1F, 3F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 477 pilot c
		bodyModel[342].setRotationPoint(-31F, 3F, -11F);

		bodyModel[343].addShapeBox(0F, 0F, 0F, 2, 2, 9, 0F,0F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, -1F, -2F, 0F, -1F, -5F, 0F, 0F, 3F, 0F, 0F); // Box 478 pilot c
		bodyModel[343].setRotationPoint(-27F, 3F, -11F);

		bodyModel[344].addShapeBox(0F, 0F, 0F, 1, 2, 7, 0F,-1F, 0F, 0F, 1F, 0F, 0F, 4F, 0F, 1F, -4F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F); // Box 479 pilot c
		bodyModel[344].setRotationPoint(-32F, 5F, 2F);

		bodyModel[345].addShapeBox(-1F, 2F, 2F, 1, 2, 5, 0F,-3.36F, 0F, 0.5F, 3.36F, 0F, 0.5F, 1F, 0F, 0F, -1F, 0F, 0F, -2.36F, 0F, 0F, 2.36F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 480 pilot c
		bodyModel[345].setRotationPoint(-32F, 5F, -9F);

		bodyModel[346].addShapeBox(-1F, 2F, 2F, 1, 2, 5, 0F,-1F, 0F, 0F, 1F, 0F, 0F, 3.36F, 0F, 0.5F, -3.36F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 2.36F, 0F, 0F, -2.36F, 0F, 0F); // Box 481 pilot c
		bodyModel[346].setRotationPoint(-32F, 5F, 0F);

		bodyModel[347].addShapeBox(0F, 0F, 0F, 2, 2, 9, 0F,3F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, -5F, 0F, 0F, -2F, 0F, -1F, 0F, 0F, -1F); // Box 482 pilot c
		bodyModel[347].setRotationPoint(-27F, 3F, 2F);

		bodyModel[348].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 483
		bodyModel[348].setRotationPoint(-12F, -1F, 10.75F);

		bodyModel[349].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 484
		bodyModel[349].setRotationPoint(-12F, -1F, -11.75F);

		bodyModel[350].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 372
		bodyModel[350].setRotationPoint(-13.5F, -20F, 0F);

		bodyModel[351].addShapeBox(-0.5F, -0.5F, -0.5F, 1, 1, 1, 0F,0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F); // Box 487
		bodyModel[351].setRotationPoint(-28.75F, -11F, 3.75F);

		bodyModel[352].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 488
		bodyModel[352].setRotationPoint(-16F, -22F, -0.5F);

		bodyModel[353].addShapeBox(0F, 0F, 0F, 20, 3, 12, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 0
		bodyModel[353].setRotationPoint(3.5F, -3F, -6F);

		bodyModel[354].addShapeBox(0F, 0F, 0F, 20, 2, 12, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F); // Box 2
		bodyModel[354].setRotationPoint(3.5F, -5F, -6F);

		bodyModel[355].addShapeBox(0F, 0F, 0F, 20, 3, 12, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 3
		bodyModel[355].setRotationPoint(3.5F, -9F, -6F);

		bodyModel[356].addShapeBox(0F, 0F, 0F, 20, 3, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 4
		bodyModel[356].setRotationPoint(3.5F, -12F, -6F);

		bodyModel[357].addShapeBox(0F, 0F, 0F, 20, 2, 4, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		bodyModel[357].setRotationPoint(3.5F, -14F, -6F);

		bodyModel[358].addShapeBox(0F, 0F, 0F, 20, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[358].setRotationPoint(3.5F, -14F, 2F);

		bodyModel[359].addBox(0F, 0F, 0F, 1, 4, 4, 0F); // Box 10
		bodyModel[359].setRotationPoint(2.5F, -16F, -2F);

		bodyModel[360].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[360].setRotationPoint(2.5F, -16F, -6F);

		bodyModel[361].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		bodyModel[361].setRotationPoint(2.5F, -16F, 2F);

		bodyModel[362].addBox(0F, 0F, 0F, 1, 9, 6, 0F); // Box 13
		bodyModel[362].setRotationPoint(2.5F, -12F, -3F);

		bodyModel[363].addBox(0F, 0F, 0F, 2, 4, 3, 0F); // Box 14
		bodyModel[363].setRotationPoint(23.5F, -4F, -5F);

		bodyModel[364].addShapeBox(0F, 0F, 0F, 20, 1, 12, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 3
		bodyModel[364].setRotationPoint(3.5F, -6F, -6F);

		bodyModel[365].addShapeBox(0F, 0F, 0F, 8, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 9
		bodyModel[365].setRotationPoint(4.5F, -16F, -1.5F);

		bodyModel[366].addBox(0F, 0F, 0F, 1, 4, 8, 0F); // Box 9
		bodyModel[366].setRotationPoint(23.5F, -12F, -4F);

		bodyModel[367].addShapeBox(0F, 0F, 0F, 8, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 9
		bodyModel[367].setRotationPoint(14.5F, -16F, -1.5F);

		bodyModel[368].addShapeBox(0F, 0F, 0F, 8, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 9
		bodyModel[368].setRotationPoint(4.5F, -15F, -1.5F);

		bodyModel[369].addShapeBox(0F, 0F, 0F, 8, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 9
		bodyModel[369].setRotationPoint(14.5F, -15F, -1.5F);

		bodyModel[370].addBox(0F, 0F, 0F, 1, 7, 5, 0F); // Box 21
		bodyModel[370].setRotationPoint(23.5F, -8F, -2F);

		bodyModel[371].addBox(0F, 0F, 0F, 1, 3, 2, 0F); // Box 0
		bodyModel[371].setRotationPoint(7F, -18F, -1F);

		bodyModel[372].addBox(0F, 0F, 0F, 1, 3, 2, 0F); // Box 0
		bodyModel[372].setRotationPoint(18F, -18F, -1F);

		bodyModel[373].addBox(0F, 0F, 0F, 3, 18, 12, 0F); // Box 13
		bodyModel[373].setRotationPoint(-8.5F, -18F, -6F);

		bodyModel[374].addBox(0F, 0F, 0F, 5, 3, 3, 0F); // Box 10
		bodyModel[374].setRotationPoint(-2.5F, -15F, 3F);

		bodyModel[375].addBox(0F, 0F, 0F, 5, 3, 3, 0F); // Box 10
		bodyModel[375].setRotationPoint(-2.5F, -15F, -6F);

		bodyModel[376].addBox(0F, 0F, 0F, 20, 2, 4, 0F); // Box 7
		bodyModel[376].setRotationPoint(3.5F, -14F, -2F);

		bodyModel[377].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 513
		bodyModel[377].setRotationPoint(-8.5F, -18F, 6F);

		bodyModel[378].addShapeBox(0F, 0F, 0F, 5, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 110
		bodyModel[378].setRotationPoint(-1.5F, -5.5F, -4F);

		bodyModel[379].addShapeBox(0F, 0F, 0F, 5, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Box 111
		bodyModel[379].setRotationPoint(-1.5F, -8F, 1.5F);

		bodyModel[380].addShapeBox(0F, 0F, 0F, 5, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 112
		bodyModel[380].setRotationPoint(-1.5F, -8F, -1.5F);

		bodyModel[381].addShapeBox(0F, 0F, 0F, 5, 3, 2, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 113
		bodyModel[381].setRotationPoint(-1.5F, -8F, -3.5F);

		bodyModel[382].addShapeBox(0F, 0F, 0F, 5, 3, 2, 0F,0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 114
		bodyModel[382].setRotationPoint(-1.5F, -3F, -3.5F);

		bodyModel[383].addShapeBox(0F, 0F, 0F, 5, 3, 3, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 115
		bodyModel[383].setRotationPoint(-1.5F, -3F, -1.5F);

		bodyModel[384].addShapeBox(0F, 0F, 0F, 5, 3, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 116
		bodyModel[384].setRotationPoint(-1.5F, -3F, 1.5F);

		bodyModel[385].addShapeBox(0F, 0F, 0F, 3, 5, 3, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 522
		bodyModel[385].setRotationPoint(-4.5F, -5F, -1.5F);

		bodyModel[386].addBox(0F, 0F, 0F, 2, 3, 3, 0F); // Box 523
		bodyModel[386].setRotationPoint(-1.5F, -11F, -1.5F);

		bodyModel[387].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 255
		bodyModel[387].setRotationPoint(0.5F, -9.5F, -1F);

		bodyModel[388].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 256
		bodyModel[388].setRotationPoint(0.5F, -10.5F, -1F);

		bodyModel[389].addBox(-0.5F, -0.5F, -0.5F, 2, 2, 1, 0F); // Box 538
		bodyModel[389].setRotationPoint(-29F, -12F, -3.25F);

		bodyModel[390].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 468
		bodyModel[390].setRotationPoint(3F, -22F, -0.5F);

		bodyModel[391].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 469
		bodyModel[391].setRotationPoint(4F, -21F, -0.5F);

		bodyModel[392].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 470
		bodyModel[392].setRotationPoint(1F, -22F, 0.5F);

		bodyModel[393].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 471
		bodyModel[393].setRotationPoint(2F, -22F, -1.5F);

		bodyModel[394].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 486
		bodyModel[394].setRotationPoint(-18F, -21F, 0F);

		bodyModel[395].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 398
		bodyModel[395].setRotationPoint(-5.5F, -20F, -2F);

		bodyModel[396].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, -0.5F, 0.5F, 0.5F, -0.5F, 0.5F, 0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 381
		bodyModel[396].setRotationPoint(-30F, -11F, -1F);

		bodyModel[397].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, 0F, 0.5F, -1F, 0F, 0.5F, -0.5F, 0.5F, -0.5F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 382
		bodyModel[397].setRotationPoint(-30F, -11F, 0F);

		bodyModel[398].addBox(0F, 0F, 0F, 47, 3, 0, 0F); // Box 398 trainphone
		bodyModel[398].setRotationPoint(-15F, -21F, -6F);

		bodyModel[399].addBox(0F, 0F, 0F, 47, 3, 0, 0F); // Box 399 trainphone
		bodyModel[399].setRotationPoint(-15F, -21F, 6F);

		bodyModel[400].addShapeBox(0F, 0F, 0F, 0, 2, 2, 0F,-0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 403 headlight backpart
		bodyModel[400].setRotationPoint(-30.7F, -8F, 0F);

		bodyModel[401].addShapeBox(0F, 0F, 0F, 0, 2, 2, 0F,-0.25F, -0.5F, -0.5F, 0.25F, -0.5F, -0.5F, 0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 404 headlight backpart
		bodyModel[401].setRotationPoint(-30.7F, -8F, -2F);

		bodyModel[402].addShapeBox(0F, 0F, 0F, 0, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.3F, 0F, 0F, 0.3F, 0F, 0F); // Box 405 headlight backpart
		bodyModel[402].setRotationPoint(-30.7F, -6F, -2F);

		bodyModel[403].addShapeBox(0F, 0F, 0F, 0, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.25F, -0.5F, -0.5F, 0.25F, -0.5F, -0.5F); // Box 406 headlight backpart
		bodyModel[403].setRotationPoint(-30.7F, -6F, 0F);

		bodyModel[404].addBox(0F, 0F, 0F, 1, 4, 0, 0F); // Box 404
		bodyModel[404].setRotationPoint(-10F, -23F, 0F);

		bodyModel[405].addBox(0F, 0F, 0F, 4, 0, 4, 0F); // Box 405
		bodyModel[405].setRotationPoint(-11.5F, -21F, -2F);
	}
	ModelBapBlombergB theTrucc = new ModelBapBlombergB();
	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		for (int i = 0; i < 406; i++) {
			if (bodyModel[i].boxName != null && bodyModel[i].boxName.contains("lamp")) {
				Minecraft.getMinecraft().entityRenderer.disableLightmap(1D);
				bodyModel[i].render(f5);
				Minecraft.getMinecraft().entityRenderer.enableLightmap(1D);
			} else {
				bodyModel[i].render(f5);
			}
		}

		if (entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor() == 3||entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor() == 11||entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor() == 1) {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/blombergB_Grey.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-0.95, 0.16, 0);
			theTrucc.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(2.2, 0, 0);
			theTrucc.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else if (entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor() == 8) {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/blombergb_SPgrey.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-0.95, 0.16, 0);
			theTrucc.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(2.2, 0, 0);
			theTrucc.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/blombergB_Black.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-0.95, 0.16, 0);
			theTrucc.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(2.2, 0, 0);
			theTrucc.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		}
	}
}