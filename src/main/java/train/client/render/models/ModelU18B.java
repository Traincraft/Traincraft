//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2021 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: U18B
// Model Creator: Bida
// Created on: 14.07.2021 - 22:37:09
// Last changed on: 14.07.2021 - 22:37:09

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

public class ModelU18B extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 256;

	public ModelU18B() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[321];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 257, 37, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 238, 148, textureX, textureY); // Box 2 fuel tank smol
		bodyModel[2] = new ModelRendererTurbo(this, 99, 114, textureX, textureY); // Box 3
		bodyModel[3] = new ModelRendererTurbo(this, 284, 2, textureX, textureY); // Box 6
		bodyModel[4] = new ModelRendererTurbo(this, 73, 8, textureX, textureY); // Box 7
		bodyModel[5] = new ModelRendererTurbo(this, 101, 156, textureX, textureY); // Box 8
		bodyModel[6] = new ModelRendererTurbo(this, 296, 142, textureX, textureY); // Box 10 fuel tank smol
		bodyModel[7] = new ModelRendererTurbo(this, 233, 65, textureX, textureY); // Box 18
		bodyModel[8] = new ModelRendererTurbo(this, 350, 113, textureX, textureY); // Box 19
		bodyModel[9] = new ModelRendererTurbo(this, 246, 68, textureX, textureY); // Box 21
		bodyModel[10] = new ModelRendererTurbo(this, 31, 8, textureX, textureY); // Box 24
		bodyModel[11] = new ModelRendererTurbo(this, 1, 123, textureX, textureY); // Box 25
		bodyModel[12] = new ModelRendererTurbo(this, 10, 6, textureX, textureY); // Box 28
		bodyModel[13] = new ModelRendererTurbo(this, 52, 6, textureX, textureY); // Box 30
		bodyModel[14] = new ModelRendererTurbo(this, 114, 81, textureX, textureY); // Box 31
		bodyModel[15] = new ModelRendererTurbo(this, 97, 81, textureX, textureY); // Box 33
		bodyModel[16] = new ModelRendererTurbo(this, 218, 102, textureX, textureY); // Box 35
		bodyModel[17] = new ModelRendererTurbo(this, 184, 102, textureX, textureY); // Box 36
		bodyModel[18] = new ModelRendererTurbo(this, 206, 99, textureX, textureY); // Box 37
		bodyModel[19] = new ModelRendererTurbo(this, 240, 99, textureX, textureY); // Box 38
		bodyModel[20] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 61
		bodyModel[21] = new ModelRendererTurbo(this, 156, 133, textureX, textureY); // Box 63
		bodyModel[22] = new ModelRendererTurbo(this, 59, 43, textureX, textureY); // Box 67
		bodyModel[23] = new ModelRendererTurbo(this, 30, 43, textureX, textureY); // Box 68
		bodyModel[24] = new ModelRendererTurbo(this, 77, 25, textureX, textureY); // Box 106
		bodyModel[25] = new ModelRendererTurbo(this, 35, 25, textureX, textureY); // Box 107
		bodyModel[26] = new ModelRendererTurbo(this, 76, 5, textureX, textureY); // Box 123
		bodyModel[27] = new ModelRendererTurbo(this, 464, 115, textureX, textureY); // Box 148
		bodyModel[28] = new ModelRendererTurbo(this, 471, 110, textureX, textureY); // Box 149
		bodyModel[29] = new ModelRendererTurbo(this, 447, 110, textureX, textureY); // Box 150
		bodyModel[30] = new ModelRendererTurbo(this, 271, 82, textureX, textureY); // Box 156
		bodyModel[31] = new ModelRendererTurbo(this, 295, 156, textureX, textureY); // Box 157 fuel tank smol
		bodyModel[32] = new ModelRendererTurbo(this, 271, 156, textureX, textureY); // Box 158 fuel tank smol
		bodyModel[33] = new ModelRendererTurbo(this, 109, 9, textureX, textureY); // Box 160
		bodyModel[34] = new ModelRendererTurbo(this, 35, 45, textureX, textureY); // Box 161
		bodyModel[35] = new ModelRendererTurbo(this, 90, 45, textureX, textureY); // Box 162
		bodyModel[36] = new ModelRendererTurbo(this, 50, 45, textureX, textureY); // Box 163
		bodyModel[37] = new ModelRendererTurbo(this, 75, 45, textureX, textureY); // Box 164
		bodyModel[38] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 165
		bodyModel[39] = new ModelRendererTurbo(this, 99, 43, textureX, textureY); // Box 166
		bodyModel[40] = new ModelRendererTurbo(this, 105, 29, textureX, textureY); // Box 167
		bodyModel[41] = new ModelRendererTurbo(this, 70, 43, textureX, textureY); // Box 168
		bodyModel[42] = new ModelRendererTurbo(this, 109, 21, textureX, textureY); // Box 169
		bodyModel[43] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 48
		bodyModel[44] = new ModelRendererTurbo(this, 21, 39, textureX, textureY); // Box 43
		bodyModel[45] = new ModelRendererTurbo(this, 8, 42, textureX, textureY, "lamp"); // Box 117 numberboard
		bodyModel[46] = new ModelRendererTurbo(this, 8, 42, textureX, textureY, "lamp"); // Box 118 numberboard
		bodyModel[47] = new ModelRendererTurbo(this, 8, 39, textureX, textureY); // Box 175
		bodyModel[48] = new ModelRendererTurbo(this, 1, 76, textureX, textureY); // Box 185
		bodyModel[49] = new ModelRendererTurbo(this, 146, 132, textureX, textureY); // Box 195
		bodyModel[50] = new ModelRendererTurbo(this, 82, 132, textureX, textureY); // Box 196
		bodyModel[51] = new ModelRendererTurbo(this, 420, 102, textureX, textureY); // Box 197
		bodyModel[52] = new ModelRendererTurbo(this, 152, 132, textureX, textureY); // Box 198
		bodyModel[53] = new ModelRendererTurbo(this, 422, 94, textureX, textureY); // Box 199
		bodyModel[54] = new ModelRendererTurbo(this, 421, 96, textureX, textureY); // Box 200
		bodyModel[55] = new ModelRendererTurbo(this, 421, 99, textureX, textureY); // Box 201
		bodyModel[56] = new ModelRendererTurbo(this, 142, 91, textureX, textureY); // Box 202
		bodyModel[57] = new ModelRendererTurbo(this, 143, 86, textureX, textureY); // Box 203
		bodyModel[58] = new ModelRendererTurbo(this, 142, 88, textureX, textureY); // Box 204
		bodyModel[59] = new ModelRendererTurbo(this, 141, 94, textureX, textureY); // Box 205
		bodyModel[60] = new ModelRendererTurbo(this, 100, 105, textureX, textureY); // box65
		bodyModel[61] = new ModelRendererTurbo(this, 438, 165, textureX, textureY); // Box 215
		bodyModel[62] = new ModelRendererTurbo(this, 433, 128, textureX, textureY); // Box 218
		bodyModel[63] = new ModelRendererTurbo(this, 500, 128, textureX, textureY); // Box 220
		bodyModel[64] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 230
		bodyModel[65] = new ModelRendererTurbo(this, 449, 141, textureX, textureY); // Box 231
		bodyModel[66] = new ModelRendererTurbo(this, 96, 134, textureX, textureY); // Box 61
		bodyModel[67] = new ModelRendererTurbo(this, 140, 134, textureX, textureY); // Box 63
		bodyModel[68] = new ModelRendererTurbo(this, 103, 109, textureX, textureY); // Box 80
		bodyModel[69] = new ModelRendererTurbo(this, 263, 62, textureX, textureY); // Box 251
		bodyModel[70] = new ModelRendererTurbo(this, 201, 65, textureX, textureY); // Box 252
		bodyModel[71] = new ModelRendererTurbo(this, 447, 128, textureX, textureY); // Box 256
		bodyModel[72] = new ModelRendererTurbo(this, 487, 139, textureX, textureY); // Box 259
		bodyModel[73] = new ModelRendererTurbo(this, 451, 123, textureX, textureY); // Box 267
		bodyModel[74] = new ModelRendererTurbo(this, 445, 139, textureX, textureY); // Box 269
		bodyModel[75] = new ModelRendererTurbo(this, 173, 4, textureX, textureY, "lamp"); // Box 162 commander beacon
		bodyModel[76] = new ModelRendererTurbo(this, 172, 7, textureX, textureY); // Box 165
		bodyModel[77] = new ModelRendererTurbo(this, 116, 45, textureX, textureY); // Box 276
		bodyModel[78] = new ModelRendererTurbo(this, 119, 42, textureX, textureY); // Box 277
		bodyModel[79] = new ModelRendererTurbo(this, 213, 65, textureX, textureY); // Box 281
		bodyModel[80] = new ModelRendererTurbo(this, 149, 65, textureX, textureY); // Box 284
		bodyModel[81] = new ModelRendererTurbo(this, 159, 79, textureX, textureY); // Box 285
		bodyModel[82] = new ModelRendererTurbo(this, 186, 81, textureX, textureY); // Box 288
		bodyModel[83] = new ModelRendererTurbo(this, 159, 90, textureX, textureY); // Box 300
		bodyModel[84] = new ModelRendererTurbo(this, 186, 90, textureX, textureY); // Box 303
		bodyModel[85] = new ModelRendererTurbo(this, 442, 110, textureX, textureY); // Box 296
		bodyModel[86] = new ModelRendererTurbo(this, 371, 125, textureX, textureY); // Box 305
		bodyModel[87] = new ModelRendererTurbo(this, 365, 125, textureX, textureY); // Box 305
		bodyModel[88] = new ModelRendererTurbo(this, 336, 85, textureX, textureY); // Box 19
		bodyModel[89] = new ModelRendererTurbo(this, 315, 89, textureX, textureY); // Box 19
		bodyModel[90] = new ModelRendererTurbo(this, 357, 98, textureX, textureY); // Box 305
		bodyModel[91] = new ModelRendererTurbo(this, 351, 97, textureX, textureY); // Box 305
		bodyModel[92] = new ModelRendererTurbo(this, 336, 81, textureX, textureY); // Box 440
		bodyModel[93] = new ModelRendererTurbo(this, 346, 81, textureX, textureY); // Box 441
		bodyModel[94] = new ModelRendererTurbo(this, 467, 23, textureX, textureY); // Box 293
		bodyModel[95] = new ModelRendererTurbo(this, 266, 122, textureX, textureY); // Box 19
		bodyModel[96] = new ModelRendererTurbo(this, 266, 105, textureX, textureY); // Box 19
		bodyModel[97] = new ModelRendererTurbo(this, 193, 66, textureX, textureY); // Box 101
		bodyModel[98] = new ModelRendererTurbo(this, 222, 66, textureX, textureY); // Box 101
		bodyModel[99] = new ModelRendererTurbo(this, 481, 109, textureX, textureY, "lamp"); // Box 240 numberboard
		bodyModel[100] = new ModelRendererTurbo(this, 481, 109, textureX, textureY, "lamp"); // Box 241 numberboard
		bodyModel[101] = new ModelRendererTurbo(this, 191, 9, textureX, textureY); // Box 114
		bodyModel[102] = new ModelRendererTurbo(this, 191, 6, textureX, textureY); // Box 74
		bodyModel[103] = new ModelRendererTurbo(this, 191, 12, textureX, textureY); // Box 78
		bodyModel[104] = new ModelRendererTurbo(this, 190, 1, textureX, textureY); // Box 245
		bodyModel[105] = new ModelRendererTurbo(this, 144, 32, textureX, textureY); // Box 248
		bodyModel[106] = new ModelRendererTurbo(this, 144, 36, textureX, textureY); // Box 250
		bodyModel[107] = new ModelRendererTurbo(this, 152, 33, textureX, textureY); // Box 249
		bodyModel[108] = new ModelRendererTurbo(this, 119, 111, textureX, textureY); // Box 205
		bodyModel[109] = new ModelRendererTurbo(this, 415, 139, textureX, textureY); // Box 205
		bodyModel[110] = new ModelRendererTurbo(this, 141, 9, textureX, textureY); // Box 114
		bodyModel[111] = new ModelRendererTurbo(this, 141, 6, textureX, textureY); // Box 74
		bodyModel[112] = new ModelRendererTurbo(this, 141, 12, textureX, textureY); // Box 78
		bodyModel[113] = new ModelRendererTurbo(this, 139, 1, textureX, textureY); // Box 78
		bodyModel[114] = new ModelRendererTurbo(this, 72, 133, textureX, textureY); // Box 2603
		bodyModel[115] = new ModelRendererTurbo(this, 84, 132, textureX, textureY); // Box 261
		bodyModel[116] = new ModelRendererTurbo(this, 492, 127, textureX, textureY); // Box 263
		bodyModel[117] = new ModelRendererTurbo(this, 493, 114, textureX, textureY); // Box 264
		bodyModel[118] = new ModelRendererTurbo(this, 108, 145, textureX, textureY); // Box 193
		bodyModel[119] = new ModelRendererTurbo(this, 201, 60, textureX, textureY, "lamp"); // Box 190 ditchlight f1
		bodyModel[120] = new ModelRendererTurbo(this, 469, 164, textureX, textureY); // Box 273
		bodyModel[121] = new ModelRendererTurbo(this, 193, 61, textureX, textureY, "lamp"); // Box 275 ditchlight f2
		bodyModel[122] = new ModelRendererTurbo(this, 213, 60, textureX, textureY, "lamp"); // Box 276 ditchlight r1
		bodyModel[123] = new ModelRendererTurbo(this, 222, 60, textureX, textureY, "lamp"); // Box 278 ditchlight r2
		bodyModel[124] = new ModelRendererTurbo(this, 447, 112, textureX, textureY, "lamp"); // Box 284 Headlight Rear
		bodyModel[125] = new ModelRendererTurbo(this, 447, 112, textureX, textureY, "lamp"); // Box 285 Headlight Rear
		bodyModel[126] = new ModelRendererTurbo(this, 17, 3, textureX, textureY); // Box 2
		bodyModel[127] = new ModelRendererTurbo(this, 17, 11, textureX, textureY); // Box 267
		bodyModel[128] = new ModelRendererTurbo(this, 435, 127, textureX, textureY); // Box 270434
		bodyModel[129] = new ModelRendererTurbo(this, 433, 114, textureX, textureY); // Box 271
		bodyModel[130] = new ModelRendererTurbo(this, 182, 4, textureX, textureY, "lamp"); // Box 162 commander beacon
		bodyModel[131] = new ModelRendererTurbo(this, 181, 8, textureX, textureY); // Box 165
		bodyModel[132] = new ModelRendererTurbo(this, 156, 65, textureX, textureY); // Box 279
		bodyModel[133] = new ModelRendererTurbo(this, 444, 125, textureX, textureY); // Box 280
		bodyModel[134] = new ModelRendererTurbo(this, 488, 130, textureX, textureY); // Box 281
		bodyModel[135] = new ModelRendererTurbo(this, 488, 115, textureX, textureY); // Box 282
		bodyModel[136] = new ModelRendererTurbo(this, 203, 16, textureX, textureY); // Box 292
		bodyModel[137] = new ModelRendererTurbo(this, 215, 2, textureX, textureY); // Box 293
		bodyModel[138] = new ModelRendererTurbo(this, 213, 8, textureX, textureY); // Box 294
		bodyModel[139] = new ModelRendererTurbo(this, 179, 99, textureX, textureY); // Box 296
		bodyModel[140] = new ModelRendererTurbo(this, 179, 79, textureX, textureY); // Box 297
		bodyModel[141] = new ModelRendererTurbo(this, 83, 54, textureX, textureY); // Box 298
		bodyModel[142] = new ModelRendererTurbo(this, 78, 55, textureX, textureY); // Box 299
		bodyModel[143] = new ModelRendererTurbo(this, 49, 57, textureX, textureY); // Box 300
		bodyModel[144] = new ModelRendererTurbo(this, 70, 59, textureX, textureY); // Box 301
		bodyModel[145] = new ModelRendererTurbo(this, 41, 101, textureX, textureY); // Box 302
		bodyModel[146] = new ModelRendererTurbo(this, 19, 101, textureX, textureY); // Box 303
		bodyModel[147] = new ModelRendererTurbo(this, 34, 105, textureX, textureY); // Box 304
		bodyModel[148] = new ModelRendererTurbo(this, 112, 60, textureX, textureY); // Box 305
		bodyModel[149] = new ModelRendererTurbo(this, 112, 52, textureX, textureY); // Box 306
		bodyModel[150] = new ModelRendererTurbo(this, 1, 65, textureX, textureY, "lamp"); // Box 307 glowey marker
		bodyModel[151] = new ModelRendererTurbo(this, 1, 65, textureX, textureY, "lamp"); // Box 308 glowey marker
		bodyModel[152] = new ModelRendererTurbo(this, 113, 17, textureX, textureY); // Box 309
		bodyModel[153] = new ModelRendererTurbo(this, 314, 117, textureX, textureY); // Box 310
		bodyModel[154] = new ModelRendererTurbo(this, 243, 117, textureX, textureY); // Box 311
		bodyModel[155] = new ModelRendererTurbo(this, 98, 5, textureX, textureY); // Box 52 door swing right
		bodyModel[156] = new ModelRendererTurbo(this, 56, 5, textureX, textureY); // Box 314 door swing right
		bodyModel[157] = new ModelRendererTurbo(this, 207, 114, textureX, textureY); // Box 318
		bodyModel[158] = new ModelRendererTurbo(this, 207, 129, textureX, textureY); // Box 319
		bodyModel[159] = new ModelRendererTurbo(this, 445, 135, textureX, textureY); // Box 320
		bodyModel[160] = new ModelRendererTurbo(this, 97, 121, textureX, textureY); // Box 321
		bodyModel[161] = new ModelRendererTurbo(this, 433, 67, textureX, textureY); // Box 298
		bodyModel[162] = new ModelRendererTurbo(this, 500, 152, textureX, textureY, "lamp"); // Box 339 glowey marker
		bodyModel[163] = new ModelRendererTurbo(this, 500, 152, textureX, textureY, "lamp"); // Box 340 glowey marker
		bodyModel[164] = new ModelRendererTurbo(this, 3, 83, textureX, textureY); // Box 402
		bodyModel[165] = new ModelRendererTurbo(this, 483, 32, textureX, textureY); // Box 342
		bodyModel[166] = new ModelRendererTurbo(this, 462, 10, textureX, textureY); // Box 349
		bodyModel[167] = new ModelRendererTurbo(this, 467, 32, textureX, textureY); // Box 350
		bodyModel[168] = new ModelRendererTurbo(this, 207, 123, textureX, textureY); // Box 253
		bodyModel[169] = new ModelRendererTurbo(this, 207, 126, textureX, textureY); // Box 280
		bodyModel[170] = new ModelRendererTurbo(this, 422, 23, textureX, textureY); // Box 283
		bodyModel[171] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 284
		bodyModel[172] = new ModelRendererTurbo(this, 98, 95, textureX, textureY); // Box 292
		bodyModel[173] = new ModelRendererTurbo(this, 99, 112, textureX, textureY); // Box 293
		bodyModel[174] = new ModelRendererTurbo(this, 84, 93, textureX, textureY); // Box 294
		bodyModel[175] = new ModelRendererTurbo(this, 84, 91, textureX, textureY); // Box 295
		bodyModel[176] = new ModelRendererTurbo(this, 84, 91, textureX, textureY); // Box 296
		bodyModel[177] = new ModelRendererTurbo(this, 136, 126, textureX, textureY); // Box 298
		bodyModel[178] = new ModelRendererTurbo(this, 100, 126, textureX, textureY); // Box 299
		bodyModel[179] = new ModelRendererTurbo(this, 448, 140, textureX, textureY); // Box 300
		bodyModel[180] = new ModelRendererTurbo(this, 484, 140, textureX, textureY); // Box 301
		bodyModel[181] = new ModelRendererTurbo(this, 56, 90, textureX, textureY); // Box 410
		bodyModel[182] = new ModelRendererTurbo(this, 130, 91, textureX, textureY); // Box 411
		bodyModel[183] = new ModelRendererTurbo(this, 407, 99, textureX, textureY); // Box 412
		bodyModel[184] = new ModelRendererTurbo(this, 414, 99, textureX, textureY); // Box 413
		bodyModel[185] = new ModelRendererTurbo(this, 137, 91, textureX, textureY); // Box 414
		bodyModel[186] = new ModelRendererTurbo(this, 134, 62, textureX, textureY); // Box 417 atsf bit
		bodyModel[187] = new ModelRendererTurbo(this, 157, 64, textureX, textureY); // Box 418 atsf bit
		bodyModel[188] = new ModelRendererTurbo(this, 178, 65, textureX, textureY, "cull"); // Box 419 cull atsf bit
		bodyModel[189] = new ModelRendererTurbo(this, 181, 63, textureX, textureY); // Box 425
		bodyModel[190] = new ModelRendererTurbo(this, 152, 42, textureX, textureY); // Box 427
		bodyModel[191] = new ModelRendererTurbo(this, 152, 45, textureX, textureY); // Box 428
		bodyModel[192] = new ModelRendererTurbo(this, 152, 48, textureX, textureY); // Box 429
		bodyModel[193] = new ModelRendererTurbo(this, 161, 45, textureX, textureY); // Box 430
		bodyModel[194] = new ModelRendererTurbo(this, 130, 86, textureX, textureY); // Box 431
		bodyModel[195] = new ModelRendererTurbo(this, 407, 94, textureX, textureY); // Box 432
		bodyModel[196] = new ModelRendererTurbo(this, 414, 94, textureX, textureY); // Box 433
		bodyModel[197] = new ModelRendererTurbo(this, 137, 86, textureX, textureY); // Box 434
		bodyModel[198] = new ModelRendererTurbo(this, 222, 66, textureX, textureY); // Box 440
		bodyModel[199] = new ModelRendererTurbo(this, 222, 60, textureX, textureY, "lamp"); // Box 441 ditchlight r2
		bodyModel[200] = new ModelRendererTurbo(this, 213, 65, textureX, textureY); // Box 442
		bodyModel[201] = new ModelRendererTurbo(this, 213, 60, textureX, textureY, "lamp"); // Box 443 ditchlight r1
		bodyModel[202] = new ModelRendererTurbo(this, 193, 66, textureX, textureY); // Box 444
		bodyModel[203] = new ModelRendererTurbo(this, 193, 61, textureX, textureY, "lamp"); // Box 445 ditchlight f2
		bodyModel[204] = new ModelRendererTurbo(this, 201, 60, textureX, textureY, "lamp"); // Box 446 ditchlight f1
		bodyModel[205] = new ModelRendererTurbo(this, 201, 65, textureX, textureY); // Box 447
		bodyModel[206] = new ModelRendererTurbo(this, 141, 94, textureX, textureY); // Box 448
		bodyModel[207] = new ModelRendererTurbo(this, 142, 91, textureX, textureY); // Box 449
		bodyModel[208] = new ModelRendererTurbo(this, 142, 88, textureX, textureY); // Box 450
		bodyModel[209] = new ModelRendererTurbo(this, 143, 86, textureX, textureY); // Box 451
		bodyModel[210] = new ModelRendererTurbo(this, 420, 102, textureX, textureY); // Box 452
		bodyModel[211] = new ModelRendererTurbo(this, 421, 99, textureX, textureY); // Box 453
		bodyModel[212] = new ModelRendererTurbo(this, 421, 96, textureX, textureY); // Box 454
		bodyModel[213] = new ModelRendererTurbo(this, 422, 94, textureX, textureY); // Box 455
		bodyModel[214] = new ModelRendererTurbo(this, 95, 24, textureX, textureY); // Box 350
		bodyModel[215] = new ModelRendererTurbo(this, 98, 24, textureX, textureY); // Box 321
		bodyModel[216] = new ModelRendererTurbo(this, 180, 112, textureX, textureY); // Box 322
		bodyModel[217] = new ModelRendererTurbo(this, 180, 136, textureX, textureY); // Box 323
		bodyModel[218] = new ModelRendererTurbo(this, 116, 42, textureX, textureY); // Box 324
		bodyModel[219] = new ModelRendererTurbo(this, 113, 42, textureX, textureY); // Box 337
		bodyModel[220] = new ModelRendererTurbo(this, 111, 99, textureX, textureY, "cull"); // Box 339 cull crossover
		bodyModel[221] = new ModelRendererTurbo(this, 237, 49, textureX, textureY); // Box 418
		bodyModel[222] = new ModelRendererTurbo(this, 228, 46, textureX, textureY); // Box 419
		bodyModel[223] = new ModelRendererTurbo(this, 226, 49, textureX, textureY); // Box 420
		bodyModel[224] = new ModelRendererTurbo(this, 228, 52, textureX, textureY); // Box 421
		bodyModel[225] = new ModelRendererTurbo(this, 151, 55, textureX, textureY, "lamp"); // Box 6 PRIME1-1
		bodyModel[226] = new ModelRendererTurbo(this, 151, 55, textureX, textureY, "lamp"); // Box 7 PRIME1-3
		bodyModel[227] = new ModelRendererTurbo(this, 151, 55, textureX, textureY, "lamp"); // Box 8 PRIME1-2
		bodyModel[228] = new ModelRendererTurbo(this, 151, 55, textureX, textureY, "lamp"); // Box 9 PRIME1-4
		bodyModel[229] = new ModelRendererTurbo(this, 161, 56, textureX, textureY, "cull"); // Box 426 cull
		bodyModel[230] = new ModelRendererTurbo(this, 151, 59, textureX, textureY); // Box 428
		bodyModel[231] = new ModelRendererTurbo(this, 16, 55, textureX, textureY, "cull"); // Box 3 cull aww
		bodyModel[232] = new ModelRendererTurbo(this, 17, 50, textureX, textureY); // Box 5
		bodyModel[233] = new ModelRendererTurbo(this, 112, 38, textureX, textureY); // Box 413
		bodyModel[234] = new ModelRendererTurbo(this, 476, 32, textureX, textureY); // Box 362
		bodyModel[235] = new ModelRendererTurbo(this, 462, 1, textureX, textureY); // Box 364
		bodyModel[236] = new ModelRendererTurbo(this, 471, 11, textureX, textureY); // Box 365
		bodyModel[237] = new ModelRendererTurbo(this, 478, 10, textureX, textureY); // Box 366
		bodyModel[238] = new ModelRendererTurbo(this, 440, 57, textureX, textureY); // Box 369
		bodyModel[239] = new ModelRendererTurbo(this, 440, 44, textureX, textureY); // Box 370
		bodyModel[240] = new ModelRendererTurbo(this, 446, 53, textureX, textureY); // Box 371
		bodyModel[241] = new ModelRendererTurbo(this, 251, 40, textureX, textureY); // Box 373
		bodyModel[242] = new ModelRendererTurbo(this, 259, 45, textureX, textureY); // Box 374
		bodyModel[243] = new ModelRendererTurbo(this, 248, 45, textureX, textureY); // Box 375
		bodyModel[244] = new ModelRendererTurbo(this, 251, 28, textureX, textureY); // Box 376
		bodyModel[245] = new ModelRendererTurbo(this, 263, 28, textureX, textureY); // Box 377
		bodyModel[246] = new ModelRendererTurbo(this, 254, 24, textureX, textureY); // Box 378
		bodyModel[247] = new ModelRendererTurbo(this, 315, 89, textureX, textureY); // Box 548
		bodyModel[248] = new ModelRendererTurbo(this, 315, 89, textureX, textureY); // Box 549
		bodyModel[249] = new ModelRendererTurbo(this, 315, 89, textureX, textureY); // Box 550
		bodyModel[250] = new ModelRendererTurbo(this, 260, 89, textureX, textureY); // Box 551 fuel tank lorge
		bodyModel[251] = new ModelRendererTurbo(this, 279, 139, textureX, textureY); // Box 552 fuel tank lorge
		bodyModel[252] = new ModelRendererTurbo(this, 266, 118, textureX, textureY); // Box 553 fuel tank lorge
		bodyModel[253] = new ModelRendererTurbo(this, 279, 148, textureX, textureY); // Box 554 fuel tank lorge
		bodyModel[254] = new ModelRendererTurbo(this, 125, 78, textureX, textureY); // Box 555
		bodyModel[255] = new ModelRendererTurbo(this, 134, 78, textureX, textureY); // Box 556
		bodyModel[256] = new ModelRendererTurbo(this, 215, 99, textureX, textureY); // Box 557
		bodyModel[257] = new ModelRendererTurbo(this, 249, 99, textureX, textureY); // Box 558
		bodyModel[258] = new ModelRendererTurbo(this, 463, 111, textureX, textureY); // Box 277
		bodyModel[259] = new ModelRendererTurbo(this, 447, 110, textureX, textureY); // Box 278
		bodyModel[260] = new ModelRendererTurbo(this, 447, 110, textureX, textureY); // Box 279
		bodyModel[261] = new ModelRendererTurbo(this, 6, 156, textureX, textureY); // Box 60
		bodyModel[262] = new ModelRendererTurbo(this, 52, 156, textureX, textureY); // Box 61
		bodyModel[263] = new ModelRendererTurbo(this, 19, 154, textureX, textureY); // Box 62
		bodyModel[264] = new ModelRendererTurbo(this, 65, 154, textureX, textureY); // Box 63
		bodyModel[265] = new ModelRendererTurbo(this, 78, 153, textureX, textureY); // Box 64
		bodyModel[266] = new ModelRendererTurbo(this, 32, 153, textureX, textureY); // Box 65
		bodyModel[267] = new ModelRendererTurbo(this, 43, 151, textureX, textureY); // Box 66
		bodyModel[268] = new ModelRendererTurbo(this, 89, 151, textureX, textureY); // Box 67
		bodyModel[269] = new ModelRendererTurbo(this, 462, 104, textureX, textureY); // Box 288
		bodyModel[270] = new ModelRendererTurbo(this, 1, 91, textureX, textureY, "lamp"); // Box 289 gyralight rear l
		bodyModel[271] = new ModelRendererTurbo(this, 8, 91, textureX, textureY, "lamp"); // Box 290gyralight rear r
		bodyModel[272] = new ModelRendererTurbo(this, 463, 94, textureX, textureY); // Box 291
		bodyModel[273] = new ModelRendererTurbo(this, 414, 94, textureX, textureY); // Box 292
		bodyModel[274] = new ModelRendererTurbo(this, 407, 94, textureX, textureY); // Box 293
		bodyModel[275] = new ModelRendererTurbo(this, 130, 86, textureX, textureY); // Box 294
		bodyModel[276] = new ModelRendererTurbo(this, 137, 86, textureX, textureY); // Box 295
		bodyModel[277] = new ModelRendererTurbo(this, 275, 118, textureX, textureY); // Box 296 fuel tank smol support
		bodyModel[278] = new ModelRendererTurbo(this, 275, 118, textureX, textureY); // Box 296 fuel tank smol support
		bodyModel[279] = new ModelRendererTurbo(this, 307, 118, textureX, textureY); // Box 296 fuel tank smol support
		bodyModel[280] = new ModelRendererTurbo(this, 307, 118, textureX, textureY); // Box 296 fuel tank smol support
		bodyModel[281] = new ModelRendererTurbo(this, 121, 113, textureX, textureY); // Box 300
		bodyModel[282] = new ModelRendererTurbo(this, 115, 113, textureX, textureY); // Box 301
		bodyModel[283] = new ModelRendererTurbo(this, 119, 117, textureX, textureY); // Box 302
		bodyModel[284] = new ModelRendererTurbo(this, 107, 117, textureX, textureY); // Box 303
		bodyModel[285] = new ModelRendererTurbo(this, 76, 122, textureX, textureY); // Box 306
		bodyModel[286] = new ModelRendererTurbo(this, 67, 119, textureX, textureY); // Box 307
		bodyModel[287] = new ModelRendererTurbo(this, 65, 122, textureX, textureY); // Box 308
		bodyModel[288] = new ModelRendererTurbo(this, 67, 125, textureX, textureY); // Box 309
		bodyModel[289] = new ModelRendererTurbo(this, 69, 90, textureX, textureY); // Box 310
		bodyModel[290] = new ModelRendererTurbo(this, 34, 5, textureX, textureY); // Box 311
		bodyModel[291] = new ModelRendererTurbo(this, 122, 114, textureX, textureY); // Box 312
		bodyModel[292] = new ModelRendererTurbo(this, 110, 114, textureX, textureY); // Box 313
		bodyModel[293] = new ModelRendererTurbo(this, 425, 91, textureX, textureY); // Box 314
		bodyModel[294] = new ModelRendererTurbo(this, 421, 91, textureX, textureY); // Box 315
		bodyModel[295] = new ModelRendererTurbo(this, 38, 101, textureX, textureY); // Box 316
		bodyModel[296] = new ModelRendererTurbo(this, 40, 100, textureX, textureY); // Box 317
		bodyModel[297] = new ModelRendererTurbo(this, 28, 100, textureX, textureY); // Box 318
		bodyModel[298] = new ModelRendererTurbo(this, 28, 101, textureX, textureY); // Box 319
		bodyModel[299] = new ModelRendererTurbo(this, 455, 111, textureX, textureY); // Box 324
		bodyModel[300] = new ModelRendererTurbo(this, 457, 107, textureX, textureY); // Box 325
		bodyModel[301] = new ModelRendererTurbo(this, 475, 107, textureX, textureY); // Box 326
		bodyModel[302] = new ModelRendererTurbo(this, 467, 111, textureX, textureY); // Box 327
		bodyModel[303] = new ModelRendererTurbo(this, 459, 98, textureX, textureY, "cull"); // Box 328 cull crossover
		bodyModel[304] = new ModelRendererTurbo(this, 55, 188, textureX, textureY); // Box 275
		bodyModel[305] = new ModelRendererTurbo(this, 26, 197, textureX, textureY); // Box 412
		bodyModel[306] = new ModelRendererTurbo(this, 40, 196, textureX, textureY); // Box 413
		bodyModel[307] = new ModelRendererTurbo(this, 28, 189, textureX, textureY); // Box 86
		bodyModel[308] = new ModelRendererTurbo(this, 61, 96, textureX, textureY); // Box 106
		bodyModel[309] = new ModelRendererTurbo(this, 1, 47, textureX, textureY, "lamp"); // Box 186 Headlight Front up
		bodyModel[310] = new ModelRendererTurbo(this, 1, 52, textureX, textureY, "lamp"); // Box 187 Headlight Front down
		bodyModel[311] = new ModelRendererTurbo(this, 4, 71, textureX, textureY, "lamp"); // Box 247 Headlight Front nose R
		bodyModel[312] = new ModelRendererTurbo(this, 12, 81, textureX, textureY, "lamp"); // Box 248 Headlight Front nose L
		bodyModel[313] = new ModelRendererTurbo(this, 56, 99, textureX, textureY); // Box 325
		bodyModel[314] = new ModelRendererTurbo(this, 72, 90, textureX, textureY); // Box 326
		bodyModel[315] = new ModelRendererTurbo(this, 176, 16, textureX, textureY); // Box 401
		bodyModel[316] = new ModelRendererTurbo(this, 173, 15, textureX, textureY); // Box 402
		bodyModel[317] = new ModelRendererTurbo(this, 218, 49, textureX, textureY); // Box 745
		bodyModel[318] = new ModelRendererTurbo(this, 206, 49, textureX, textureY); // Box 746
		bodyModel[319] = new ModelRendererTurbo(this, 208, 46, textureX, textureY); // Box 747
		bodyModel[320] = new ModelRendererTurbo(this, 208, 52, textureX, textureY); // Box 748

		bodyModel[0].addBox(0F, 0F, 0F, 66, 2, 22, 0F); // Box 0
		bodyModel[0].setRotationPoint(-33F, -1F, -11F);

		bodyModel[1].addBox(0F, 0F, 0F, 8, 4, 16, 0F); // Box 2 fuel tank smol
		bodyModel[1].setRotationPoint(-4F, 5F, -8F);

		bodyModel[2].addBox(0F, 0F, 0F, 0, 8, 20, 0F); // Box 3
		bodyModel[2].setRotationPoint(-37.01F, -1F, -10F);

		bodyModel[3].addBox(0F, 0F, 0F, 47, 20, 14, 0F); // Box 6
		bodyModel[3].setRotationPoint(-14F, -21F, -7F);

		bodyModel[4].addBox(0F, 0F, 0F, 11, 14, 1, 0F); // Box 7
		bodyModel[4].setRotationPoint(-26F, -19F, -11F);

		bodyModel[5].addBox(0F, 0F, 0F, 4, 2, 14, 0F); // Box 8
		bodyModel[5].setRotationPoint(-37F, -1F, -7F);

		bodyModel[6].addBox(0F, 0F, 0F, 8, 3, 22, 0F); // Box 10 fuel tank smol
		bodyModel[6].setRotationPoint(-4F, 2F, -11F);

		bodyModel[7].addBox(0F, 0F, 0F, 2, 1, 5, 0F); // Box 18
		bodyModel[7].setRotationPoint(7.5F, -23.5F, -2.5F);

		bodyModel[8].addBox(0F, 0F, 0F, 1, 3, 18, 0F); // Box 19
		bodyModel[8].setRotationPoint(7F, 4F, -9F);

		bodyModel[9].addBox(0F, 0F, 0F, 3, 1, 6, 0F); // Box 21
		bodyModel[9].setRotationPoint(7F, -22.5F, -3F);

		bodyModel[10].addBox(0F, 0F, 0F, 11, 14, 1, 0F); // Box 24
		bodyModel[10].setRotationPoint(-26F, -19F, 10F);

		bodyModel[11].addBox(0F, 0F, 0F, 13, 4, 22, 0F); // Box 25
		bodyModel[11].setRotationPoint(-27F, -5F, -11F);

		bodyModel[12].addBox(0F, 0F, 0F, 1, 14, 18, 0F); // Box 28
		bodyModel[12].setRotationPoint(-15F, -19F, -11F);

		bodyModel[13].addBox(0F, 0F, 0F, 1, 14, 18, 0F); // Box 30
		bodyModel[13].setRotationPoint(-27F, -19F, -7F);

		bodyModel[14].addBox(0F, 0F, 0F, 3, 4, 4, 0F); // Box 31
		bodyModel[14].setRotationPoint(-30F, -5F, -11F);

		bodyModel[15].addBox(0F, 0F, 0F, 4, 4, 4, 0F); // Box 33
		bodyModel[15].setRotationPoint(-31F, -5F, 7F);

		bodyModel[16].addBox(0F, 0F, 0F, 8, 4, 4, 0F); // Box 35
		bodyModel[16].setRotationPoint(-14F, -5F, 7F);

		bodyModel[17].addBox(0F, 0F, 0F, 8, 4, 4, 0F); // Box 36
		bodyModel[17].setRotationPoint(-14F, -5F, -11F);

		bodyModel[18].addBox(0F, 0F, 0F, 1, 2, 3, 0F); // Box 37
		bodyModel[18].setRotationPoint(-6F, -3F, -10F);

		bodyModel[19].addBox(0F, 0F, 0F, 1, 2, 3, 0F); // Box 38
		bodyModel[19].setRotationPoint(-6F, -3F, 7F);

		bodyModel[20].addBox(0F, 0F, 0F, 4, 2, 3, 0F); // Box 61
		bodyModel[20].setRotationPoint(-41F, 3F, -1.5F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 1, 7, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 63
		bodyModel[21].setRotationPoint(-33F, 1F, -11F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 67
		bodyModel[22].setRotationPoint(-27F, -22F, 7F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 68
		bodyModel[23].setRotationPoint(-27F, -22F, -11F);

		bodyModel[24].addBox(0F, 0F, 0F, 1, 3, 14, 0F); // Box 106
		bodyModel[24].setRotationPoint(-15F, -22F, -7F);

		bodyModel[25].addBox(0F, 0F, 0F, 1, 3, 14, 0F); // Box 107
		bodyModel[25].setRotationPoint(-27F, -22F, -7F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 9, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 123
		bodyModel[26].setRotationPoint(-25F, -19F, -11F);
		bodyModel[26].rotateAngleX = -0.61086524F;

		bodyModel[27].addBox(0F, 0F, 0F, 1, 21, 2, 0F); // Box 148
		bodyModel[27].setRotationPoint(33F, -22F, -1F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 1, 21, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 149
		bodyModel[28].setRotationPoint(33F, -22F, 1F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 1, 21, 7, 0F,0F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 150
		bodyModel[29].setRotationPoint(33F, -22F, -8F);

		bodyModel[30].addBox(0F, 0F, 0F, 27, 1, 3, 0F); // Box 156
		bodyModel[30].setRotationPoint(-33F, 1F, -11F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 8, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 157 fuel tank smol
		bodyModel[31].setRotationPoint(-4F, 5F, -11F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 8, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 158 fuel tank smol
		bodyModel[32].setRotationPoint(-4F, 5F, 8F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 11, 1, 6, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 160
		bodyModel[33].setRotationPoint(-26F, -23F, -7F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 161
		bodyModel[34].setRotationPoint(-27F, -23F, -7F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 162
		bodyModel[35].setRotationPoint(-15F, -23F, -7F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 163
		bodyModel[36].setRotationPoint(-27F, -23F, 1F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 164
		bodyModel[37].setRotationPoint(-15F, -23F, 1F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 11, 3, 4, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 165
		bodyModel[38].setRotationPoint(-26F, -22F, -11F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 166
		bodyModel[39].setRotationPoint(-15F, -22F, -11F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 11, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 167
		bodyModel[40].setRotationPoint(-26F, -22F, 7F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[41].setRotationPoint(-15F, -22F, 7F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 11, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 169
		bodyModel[42].setRotationPoint(-26F, -23F, 1F);

		bodyModel[43].addBox(0F, 0F, 0F, 1, 4, 2, 0F); // Box 48
		bodyModel[43].setRotationPoint(-28F, -23F, -1F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
		bodyModel[44].setRotationPoint(-28F, -22F, -6F);

		bodyModel[45].addBox(0F, 0F, 0F, 0, 2, 5, 0F); // Box 117 numberboard
		bodyModel[45].setRotationPoint(-27.05F, -22F, -6F);
		bodyModel[45].rotateAngleY = 0.19198622F;

		bodyModel[46].addBox(0F, 0F, -5F, 0, 2, 5, 0F); // Box 118 numberboard
		bodyModel[46].setRotationPoint(-27.05F, -22F, 6F);
		bodyModel[46].rotateAngleY = -0.19198622F;

		bodyModel[47].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 175
		bodyModel[47].setRotationPoint(-28F, -22F, 1F);

		bodyModel[48].addBox(0F, 0F, 0F, 2, 2, 4, 0F); // Box 185
		bodyModel[48].setRotationPoint(-33.75F, -13.75F, -2F);

		bodyModel[49].addBox(0F, 0F, 0F, 1, 9, 3, 0F); // Box 195
		bodyModel[49].setRotationPoint(-34F, -1F, -10F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 196
		bodyModel[50].setRotationPoint(-34F, 7F, 10F);

		bodyModel[51].addBox(0F, 0F, 0F, 3, 0, 3, 0F); // Box 197
		bodyModel[51].setRotationPoint(-37F, 8F, 8F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 198
		bodyModel[52].setRotationPoint(-34F, 7F, -11F);

		bodyModel[53].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 199
		bodyModel[53].setRotationPoint(-37F, -1F, 7F);

		bodyModel[54].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 200
		bodyModel[54].setRotationPoint(-37F, 2F, 7F);

		bodyModel[55].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 201
		bodyModel[55].setRotationPoint(-37F, 5F, 8F);

		bodyModel[56].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 202
		bodyModel[56].setRotationPoint(-37F, 5F, -10F);

		bodyModel[57].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 203
		bodyModel[57].setRotationPoint(-37F, -1F, -8F);

		bodyModel[58].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 204
		bodyModel[58].setRotationPoint(-37F, 2F, -9F);

		bodyModel[59].addBox(0F, 0F, 0F, 3, 0, 3, 0F); // Box 205
		bodyModel[59].setRotationPoint(-37F, 8F, -11F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 0, 1, 18, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // box65
		bodyModel[60].setRotationPoint(-37F, 8F, -9F);

		bodyModel[61].addBox(0F, 0F, 0F, 4, 2, 14, 0F); // Box 215
		bodyModel[61].setRotationPoint(33F, -1F, -7F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 218
		bodyModel[62].setRotationPoint(33F, 7F, 10F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 220
		bodyModel[63].setRotationPoint(33F, 7F, -11F);

		bodyModel[64].addBox(0F, 0F, 0F, 4, 2, 3, 0F); // Box 230
		bodyModel[64].setRotationPoint(37F, 3F, -1.5F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 0, 1, 18, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 231
		bodyModel[65].setRotationPoint(37F, 8F, -9F);

		bodyModel[66].addBox(0F, 0F, 0F, 0, 7, 1, 0F); // Box 61
		bodyModel[66].setRotationPoint(-37F, -3F, 10F);

		bodyModel[67].addBox(0F, 0F, 0F, 0, 7, 1, 0F); // Box 63
		bodyModel[67].setRotationPoint(-37F, -3F, -11F);

		bodyModel[68].addBox(0F, 0F, 0F, 0, 8, 16, 0F); // Box 80
		bodyModel[68].setRotationPoint(-37F, -9F, -8F);

		bodyModel[69].addBox(0F, 0F, 0F, 66, 2, 16, 0F); // Box 251
		bodyModel[69].setRotationPoint(-33F, 1F, -8F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 252
		bodyModel[70].setRotationPoint(-37F, -4F, -6.75F);

		bodyModel[71].addBox(0F, 0F, 0F, 0, 8, 20, 0F); // Box 256
		bodyModel[71].setRotationPoint(37.01F, -1F, -10F);

		bodyModel[72].addBox(0F, 0F, 0F, 0, 7, 1, 0F); // Box 259
		bodyModel[72].setRotationPoint(37.01F, -3F, 10F);

		bodyModel[73].addBox(0F, 0F, 0F, 0, 8, 16, 0F); // Box 267
		bodyModel[73].setRotationPoint(37.01F, -9F, -8F);

		bodyModel[74].addBox(0F, 0F, 0F, 0, 7, 1, 0F); // Box 269
		bodyModel[74].setRotationPoint(37.01F, -3F, -11F);

		bodyModel[75].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 162 commander beacon
		bodyModel[75].setRotationPoint(-26.18F, -24.5F, -0.5F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0.3F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, 0.3F, -0.5F, 0.1F, 0.3F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, 0.3F, -0.5F, 0.1F); // Box 165
		bodyModel[76].setRotationPoint(-26F, -24F, -0.5F);

		bodyModel[77].addBox(0F, 0F, 0F, 4, 4, 0, 0F); // Box 276
		bodyModel[77].setRotationPoint(-32F, -12.5F, 7.5F);

		bodyModel[78].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 277
		bodyModel[78].setRotationPoint(-30.5F, -11F, 6.5F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 281
		bodyModel[79].setRotationPoint(36F, -4F, -6.75F);

		bodyModel[80].addBox(0F, 0F, 0F, 3, 2, 0, 0F); // Box 284
		bodyModel[80].setRotationPoint(-19F, -24.5F, 3F);

		bodyModel[81].addBox(0F, 0F, 0F, 8, 10, 0, 0F); // Box 285
		bodyModel[81].setRotationPoint(-14F, -13F, 11.01F);

		bodyModel[82].addBox(0F, 0F, 0F, 36, 8, 0, 0F); // Box 288
		bodyModel[82].setRotationPoint(-2F, -9F, 11F);

		bodyModel[83].addBox(0F, 0F, 0F, 8, 10, 0, 0F); // Box 300
		bodyModel[83].setRotationPoint(-14F, -13F, -11.01F);

		bodyModel[84].addBox(0F, 0F, 0F, 36, 8, 0, 0F); // Box 303
		bodyModel[84].setRotationPoint(-2F, -9F, -11F);

		bodyModel[85].addBox(0F, 0F, 0F, 0, 13, 2, 0F); // Box 296
		bodyModel[85].setRotationPoint(34F, -9F, -11F);

		bodyModel[86].addBox(0F, 0F, 0F, 1, 5, 0, 0F); // Box 305
		bodyModel[86].setRotationPoint(7F, 1F, -9.01F);

		bodyModel[87].addBox(0F, 0F, 0F, 1, 5, 0, 0F); // Box 305
		bodyModel[87].setRotationPoint(7F, 1F, 9.01F);

		bodyModel[88].addBox(0F, 0F, 0F, 1, 3, 18, 0F); // Box 19
		bodyModel[88].setRotationPoint(-8F, 4F, -9F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 19
		bodyModel[89].setRotationPoint(-9F, 5F, -9F);

		bodyModel[90].addBox(0F, 0F, 0F, 1, 4, 0, 0F); // Box 305
		bodyModel[90].setRotationPoint(-8F, 2F, -9.01F);

		bodyModel[91].addBox(0F, 0F, 0F, 1, 5, 0, 0F); // Box 305
		bodyModel[91].setRotationPoint(-8F, 1F, 9.01F);

		bodyModel[92].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 440
		bodyModel[92].setRotationPoint(-21.5F, 3F, -1F);

		bodyModel[93].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 441
		bodyModel[93].setRotationPoint(19.5F, 3F, -1F);

		bodyModel[94].addBox(0F, 0F, 0F, 10, 6, 1, 0F); // Box 293
		bodyModel[94].setRotationPoint(22F, -14F, -7.75F);

		bodyModel[95].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 19
		bodyModel[95].setRotationPoint(-2F, 1.75F, -11.5F);
		bodyModel[95].rotateAngleX = 1.13446401F;

		bodyModel[96].addBox(0F, 0F, -1F, 1, 3, 1, 0F); // Box 19
		bodyModel[96].setRotationPoint(-2F, 1.75F, 11.5F);
		bodyModel[96].rotateAngleX = -1.13446401F;

		bodyModel[97].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 101
		bodyModel[97].setRotationPoint(-37.5F, -1F, -6.75F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 101
		bodyModel[98].setRotationPoint(37F, -1F, -6.75F);

		bodyModel[99].addBox(0F, 0F, -5F, 1, 2, 5, 0F); // Box 240 numberboard
		bodyModel[99].setRotationPoint(32.3F, -19F, 6F);
		bodyModel[99].rotateAngleY = 0.15707963F;

		bodyModel[100].addBox(0F, 0F, 0F, 1, 2, 5, 0F); // Box 241 numberboard
		bodyModel[100].setRotationPoint(32.3F, -19F, -6F);
		bodyModel[100].rotateAngleY = -0.15707963F;

		bodyModel[101].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 114
		bodyModel[101].setRotationPoint(-13F, -19.25F, -9F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[102].setRotationPoint(-13F, -20.25F, -9F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 78
		bodyModel[103].setRotationPoint(-12.75F, -18.75F, -8.75F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F); // Box 245
		bodyModel[104].setRotationPoint(-13F, -21.25F, -8.8F);

		bodyModel[105].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 248
		bodyModel[105].setRotationPoint(-28F, -24F, 3F);

		bodyModel[106].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 250
		bodyModel[106].setRotationPoint(-27.5F, -24F, 4.5F);

		bodyModel[107].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 249
		bodyModel[107].setRotationPoint(-26F, -23F, 3.25F);

		bodyModel[108].addBox(0F, 0F, 0F, 2, 0, 20, 0F); // Box 205
		bodyModel[108].setRotationPoint(-39F, 8F, -10F);

		bodyModel[109].addBox(0F, 0F, 0F, 2, 0, 20, 0F); // Box 205
		bodyModel[109].setRotationPoint(37F, 8F, -10F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 114
		bodyModel[110].setRotationPoint(-8F, 3F, 9.5F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[111].setRotationPoint(-8F, 2F, 9.5F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 78
		bodyModel[112].setRotationPoint(-7.75F, 3.5F, 9.75F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 78
		bodyModel[113].setRotationPoint(-7.75F, 1F, 7.75F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 1, 7, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 2603
		bodyModel[114].setRotationPoint(-33F, 1F, 7F);

		bodyModel[115].addBox(0F, 0F, 0F, 1, 9, 3, 0F); // Box 261
		bodyModel[115].setRotationPoint(-34F, -1F, 7F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 1, 7, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 263
		bodyModel[116].setRotationPoint(32F, 1F, -11F);

		bodyModel[117].addBox(0F, 0F, 0F, 1, 9, 3, 0F); // Box 264
		bodyModel[117].setRotationPoint(33F, -1F, -10F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 5, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Box 193
		bodyModel[118].setRotationPoint(-37F, 1F, -3F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 190 ditchlight f1
		bodyModel[119].setRotationPoint(-37.25F, -4F, -6.75F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 5, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); // Box 273
		bodyModel[120].setRotationPoint(32F, 1F, -3F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 275 ditchlight f2
		bodyModel[121].setRotationPoint(-37.75F, -1F, -6.75F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 276 ditchlight r1
		bodyModel[122].setRotationPoint(36.75F, -4F, -6.75F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 278 ditchlight r2
		bodyModel[123].setRotationPoint(37.25F, -1F, -6.75F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 284 Headlight Rear
		bodyModel[124].setRotationPoint(33.25F, -17.5F, -1F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 285 Headlight Rear
		bodyModel[125].setRotationPoint(33.25F, -19.5F, -1F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[126].setRotationPoint(-38F, 2.5F, -2F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 267
		bodyModel[127].setRotationPoint(37F, 2.5F, -2F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 1, 7, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 270434
		bodyModel[128].setRotationPoint(32F, 1F, 7F);

		bodyModel[129].addBox(0F, 0F, 0F, 1, 9, 3, 0F); // Box 271
		bodyModel[129].setRotationPoint(33F, -1F, 7F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 162 commander beacon
		bodyModel[130].setRotationPoint(-22F, -24.8F, -0.5F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0.3F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, 0.3F, -0.5F, 0.1F, 0.3F, 0F, 0.1F, -1F, 0F, 0.1F, -1F, 0F, 0.1F, 0.3F, 0F, 0.1F); // Box 165
		bodyModel[131].setRotationPoint(-21.82F, -23.8F, -0.5F);

		bodyModel[132].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 279
		bodyModel[132].setRotationPoint(-20F, -25F, 0F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 0, 4, 1, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 280
		bodyModel[133].setRotationPoint(34F, -5F, -11.5F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 0, 4, 1, 0F,0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 281
		bodyModel[134].setRotationPoint(34F, -5F, 10.5F);

		bodyModel[135].addBox(0F, 0F, 0F, 0, 13, 2, 0F); // Box 282
		bodyModel[135].setRotationPoint(34F, -9F, 9F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 26, 1, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 292
		bodyModel[136].setRotationPoint(-14F, -22F, -7F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 26, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 293
		bodyModel[137].setRotationPoint(-14F, -22F, 3F);

		bodyModel[138].addBox(0F, 0F, 0F, 26, 1, 6, 0F); // Box 294
		bodyModel[138].setRotationPoint(-14F, -22F, -3F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F); // Box 296
		bodyModel[139].setRotationPoint(-6F, -13F, -11F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F); // Box 297
		bodyModel[140].setRotationPoint(-6F, -13F, 11F);

		bodyModel[141].addBox(0F, 0F, 0F, 6, 12, 14, 0F); // Box 298
		bodyModel[141].setRotationPoint(-33F, -13F, -7F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 6, 1, 2, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 299
		bodyModel[142].setRotationPoint(-33F, -14F, -1F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 6, 1, 6, 0F,0F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 300
		bodyModel[143].setRotationPoint(-33F, -14F, -7F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 6, 1, 6, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 301
		bodyModel[144].setRotationPoint(-33F, -14F, 1F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 1, 12, 6, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 302
		bodyModel[145].setRotationPoint(-34F, -13F, -7F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 1, 12, 6, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 303
		bodyModel[146].setRotationPoint(-34F, -13F, 1F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 1, 12, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 304
		bodyModel[147].setRotationPoint(-34F, -13F, -1F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,-1F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, -0.5F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 305
		bodyModel[148].setRotationPoint(-34F, -14F, -7F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,-0.5F, -1F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 306
		bodyModel[149].setRotationPoint(-34F, -14F, 1F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.65F, -0.25F, -0.25F, 0.2F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.65F, -0.25F, -0.25F, 0.2F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 307 glowey marker
		bodyModel[150].setRotationPoint(-33.9F, -12.7F, -7F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0.2F, -0.25F, -0.25F, -0.65F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0.2F, -0.25F, -0.25F, -0.65F, -0.25F, -0.25F); // Box 308 glowey marker
		bodyModel[151].setRotationPoint(-33.9F, -12.7F, 5F);

		bodyModel[152].addBox(0F, 0F, 0F, 13, 1, 2, 0F); // Box 309
		bodyModel[152].setRotationPoint(-27F, -23F, -1F);

		bodyModel[153].addBox(0F, 0F, 0F, 2, 1, 14, 0F); // Box 310
		bodyModel[153].setRotationPoint(6F, 3F, -7F);

		bodyModel[154].addBox(0F, 0F, 0F, 2, 1, 14, 0F); // Box 311
		bodyModel[154].setRotationPoint(-8F, 3F, -7F);

		bodyModel[155].addBox(-0.5F, 0F, -0.5F, 1, 14, 4, 0F); // Box 52 door swing right
		bodyModel[155].setRotationPoint(-26.5F, -19F, -10.5F);

		bodyModel[156].addBox(-0.5F, 0F, -3.5F, 1, 14, 4, 0F); // Box 314 door swing right
		bodyModel[156].setRotationPoint(-14.5F, -19F, 10.5F);

		bodyModel[157].addBox(0F, 0F, 0F, 4, 1, 22, 0F); // Box 318
		bodyModel[157].setRotationPoint(18.5F, 1F, -11F);

		bodyModel[158].addBox(0F, 0F, 0F, 4, 1, 3, 0F); // Box 319
		bodyModel[158].setRotationPoint(-22.5F, 1F, 8F);

		bodyModel[159].addBox(0F, 0F, 0F, 0, 1, 22, 0F); // Box 320
		bodyModel[159].setRotationPoint(37.01F, 7F, -11F);

		bodyModel[160].addBox(0F, 0F, 0F, 0, 1, 22, 0F); // Box 321
		bodyModel[160].setRotationPoint(-37.01F, 7F, -11F);

		bodyModel[161].addBox(0F, 0F, 0F, 21, 2, 16, 0F); // Box 298
		bodyModel[161].setRotationPoint(12F, -22F, -8F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0.2F, -0.25F, -0.25F, -0.65F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0.2F, -0.25F, -0.25F, -0.65F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 339 glowey marker
		bodyModel[162].setRotationPoint(33F, -21.7F, -7.5F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.65F, -0.25F, -0.25F, 0.2F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.65F, -0.25F, -0.25F, 0.2F, -0.25F, -0.25F); // Box 340 glowey marker
		bodyModel[163].setRotationPoint(33F, -21.7F, 5.5F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 402
		bodyModel[164].setRotationPoint(-32.5F, -14F, -1F);

		bodyModel[165].addBox(0F, 0F, 0F, 2, 6, 1, 0F); // Box 342
		bodyModel[165].setRotationPoint(16.5F, -14F, -7.75F);

		bodyModel[166].addBox(0F, 0F, 0F, 3, 6, 1, 0F); // Box 349
		bodyModel[166].setRotationPoint(13F, -7.5F, 6.75F);

		bodyModel[167].addBox(0F, 0F, 0F, 3, 6, 1, 0F); // Box 350
		bodyModel[167].setRotationPoint(13F, -7.5F, -7.75F);

		bodyModel[168].addBox(0F, 0F, 0F, 5, 1, 1, 0F); // Box 253
		bodyModel[168].setRotationPoint(-27F, 1F, 9F);
		bodyModel[168].rotateAngleZ = -0.27925268F;

		bodyModel[169].addBox(0F, 0F, 0F, 5, 1, 1, 0F); // Box 280
		bodyModel[169].setRotationPoint(-32F, 1F, 9F);

		bodyModel[170].addBox(0F, 0F, 0F, 21, 19, 1, 0F); // Box 283
		bodyModel[170].setRotationPoint(12F, -20F, -7.5F);

		bodyModel[171].addBox(0F, 0F, 0F, 21, 19, 1, 0F); // Box 284
		bodyModel[171].setRotationPoint(12F, -20F, 6.5F);

		bodyModel[172].addBox(0F, 0F, 0F, 3, 8, 0, 0F); // Box 292
		bodyModel[172].setRotationPoint(-30F, -13F, -11F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 0, 4, 1, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 293
		bodyModel[173].setRotationPoint(-34F, -5F, -11.5F);

		bodyModel[174].addBox(0F, 0F, 0F, 0, 14, 2, 0F); // Box 294
		bodyModel[174].setRotationPoint(-34F, -10F, -11F);

		bodyModel[175].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F); // Box 295
		bodyModel[175].setRotationPoint(-32F, -13F, -11F);

		bodyModel[176].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.23F, 0F, 0F, 0.23F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.23F, 0F, 0F, 0.23F); // Box 296
		bodyModel[176].setRotationPoint(-32F, -10F, -11F);
		bodyModel[176].rotateAngleY = 1.11701072F;

		bodyModel[177].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, -2F, 2F, 0F, -2F, 2F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 298
		bodyModel[177].setRotationPoint(-37.01F, -9F, -10F);
		bodyModel[177].rotateAngleY = -3.14159265F;

		bodyModel[178].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, -2F, 2F, 0F, -2F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 299
		bodyModel[178].setRotationPoint(-37.01F, -9F, 11F);
		bodyModel[178].rotateAngleY = -3.14159265F;

		bodyModel[179].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, -2F, 2F, 0F, -2F, 2F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 300
		bodyModel[179].setRotationPoint(37.01F, -9F, -10F);
		bodyModel[179].rotateAngleY = -3.14159265F;

		bodyModel[180].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, -2F, 2F, 0F, -2F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 301
		bodyModel[180].setRotationPoint(37.01F, -9F, 11F);
		bodyModel[180].rotateAngleY = -3.14159265F;

		bodyModel[181].addBox(0F, 0F, 0F, 6, 8, 0, 0F); // Box 410
		bodyModel[181].setRotationPoint(-33F, -13F, 11F);

		bodyModel[182].addBox(0F, 0F, 0F, 3, 2, 0, 0F); // Box 411
		bodyModel[182].setRotationPoint(-37F, 6F, -8F);

		bodyModel[183].addBox(0F, 0F, 0F, 3, 2, 0, 0F); // Box 412
		bodyModel[183].setRotationPoint(-37F, 6F, 8F);

		bodyModel[184].addBox(0F, 0F, 0F, 3, 2, 0, 0F); // Box 413
		bodyModel[184].setRotationPoint(34F, 6F, 8F);

		bodyModel[185].addBox(0F, 0F, 0F, 3, 2, 0, 0F); // Box 414
		bodyModel[185].setRotationPoint(34F, 6F, -8F);

		bodyModel[186].addBox(0F, 0F, 0F, 4, 2, 6, 0F); // Box 417 atsf bit
		bodyModel[186].setRotationPoint(-24F, -24F, -3F);

		bodyModel[187].addBox(0F, 0F, 0F, 5, 2, 4, 0F); // Box 418 atsf bit
		bodyModel[187].setRotationPoint(-19.25F, -24F, -3F);

		bodyModel[188].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 419 cull atsf bit
		bodyModel[188].setRotationPoint(-18F, -24F, 3.5F);

		bodyModel[189].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 425
		bodyModel[189].setRotationPoint(-18F, -25F, 5F);

		bodyModel[190].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 427
		bodyModel[190].setRotationPoint(-28F, -24.5F, -1.5F);

		bodyModel[191].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 428
		bodyModel[191].setRotationPoint(-27F, -24.5F, -0.5F);

		bodyModel[192].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 429
		bodyModel[192].setRotationPoint(-28F, -24.5F, 0.5F);

		bodyModel[193].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 430
		bodyModel[193].setRotationPoint(-26.5F, -23.5F, -0.5F);

		bodyModel[194].addBox(0F, 0F, 0F, 3, 1, 0, 0F); // Box 431
		bodyModel[194].setRotationPoint(-37F, 1F, -7F);

		bodyModel[195].addBox(0F, 0F, 0F, 3, 1, 0, 0F); // Box 432
		bodyModel[195].setRotationPoint(-37F, 1F, 7F);

		bodyModel[196].addBox(0F, 0F, 0F, 3, 1, 0, 0F); // Box 433
		bodyModel[196].setRotationPoint(34F, 1F, 7F);

		bodyModel[197].addBox(0F, 0F, 0F, 3, 1, 0, 0F); // Box 434
		bodyModel[197].setRotationPoint(34F, 1F, -7F);

		bodyModel[198].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 440
		bodyModel[198].setRotationPoint(37F, -1F, 4.75F);

		bodyModel[199].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 441 ditchlight r2
		bodyModel[199].setRotationPoint(37.25F, -1F, 4.75F);

		bodyModel[200].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 442
		bodyModel[200].setRotationPoint(36F, -4F, 4.75F);

		bodyModel[201].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 443 ditchlight r1
		bodyModel[201].setRotationPoint(36.75F, -4F, 4.75F);

		bodyModel[202].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 444
		bodyModel[202].setRotationPoint(-37.5F, -1F, 4.75F);

		bodyModel[203].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 445 ditchlight f2
		bodyModel[203].setRotationPoint(-37.75F, -1F, 4.75F);

		bodyModel[204].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 446 ditchlight f1
		bodyModel[204].setRotationPoint(-37.25F, -4F, 4.75F);

		bodyModel[205].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 447
		bodyModel[205].setRotationPoint(-37F, -4F, 4.75F);

		bodyModel[206].addBox(0F, 0F, 0F, 3, 0, 3, 0F); // Box 448
		bodyModel[206].setRotationPoint(34F, 8F, -11F);

		bodyModel[207].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 449
		bodyModel[207].setRotationPoint(34F, 5F, -10F);

		bodyModel[208].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 450
		bodyModel[208].setRotationPoint(34F, 2F, -9F);

		bodyModel[209].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 451
		bodyModel[209].setRotationPoint(34F, -1F, -8F);

		bodyModel[210].addBox(0F, 0F, 0F, 3, 0, 3, 0F); // Box 452
		bodyModel[210].setRotationPoint(34F, 8F, 8F);

		bodyModel[211].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 453
		bodyModel[211].setRotationPoint(34F, 5F, 8F);

		bodyModel[212].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 454
		bodyModel[212].setRotationPoint(34F, 2F, 7F);

		bodyModel[213].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 455
		bodyModel[213].setRotationPoint(34F, -1F, 7F);

		bodyModel[214].addBox(0F, 0F, -1F, 0, 4, 1, 0F); // Box 350
		bodyModel[214].setRotationPoint(-23F, -17F, -11F);
		bodyModel[214].rotateAngleY = 0.52359878F;

		bodyModel[215].addBox(0F, 0F, 0F, 0, 4, 1, 0F); // Box 321
		bodyModel[215].setRotationPoint(-23.01F, -17F, 11F);

		bodyModel[216].addBox(0F, 0F, 0F, 2, 1, 22, 0F); // Box 322
		bodyModel[216].setRotationPoint(19.5F, 2F, -11F);

		bodyModel[217].addBox(0F, 0F, 0F, 2, 1, 22, 0F); // Box 323
		bodyModel[217].setRotationPoint(-21.5F, 2F, -11F);

		bodyModel[218].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 324
		bodyModel[218].setRotationPoint(-28F, -24F, -1.5F);

		bodyModel[219].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 337
		bodyModel[219].setRotationPoint(-13F, -24F, -1.5F);

		bodyModel[220].addBox(-4F, 0F, 0F, 4, 1, 4, 0F); // Box 339 cull crossover
		bodyModel[220].setRotationPoint(-37F, -1F, -2F);
		bodyModel[220].rotateAngleZ = -1.48352986F;

		bodyModel[221].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 418
		bodyModel[221].setRotationPoint(-0.5F, -22.5F, -6.5F);

		bodyModel[222].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 419
		bodyModel[222].setRotationPoint(-2F, -23.25F, -5.5F);

		bodyModel[223].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 420
		bodyModel[223].setRotationPoint(-3F, -23.5F, -6.5F);

		bodyModel[224].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 421
		bodyModel[224].setRotationPoint(-1.5F, -23.25F, -7.5F);

		bodyModel[225].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F); // Box 6 PRIME1-1
		bodyModel[225].setRotationPoint(-24F, -23.5F, 7.5F);

		bodyModel[226].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F); // Box 7 PRIME1-3
		bodyModel[226].setRotationPoint(-24F, -23.5F, 7.5F);

		bodyModel[227].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 8 PRIME1-2
		bodyModel[227].setRotationPoint(-24F, -23.5F, 7.5F);

		bodyModel[228].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 9 PRIME1-4
		bodyModel[228].setRotationPoint(-24F, -23.5F, 7.5F);

		bodyModel[229].addShapeBox(0F, 0F, 0F, 3, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 426 cull
		bodyModel[229].setRotationPoint(-24.5F, -22F, 7F);

		bodyModel[230].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 428
		bodyModel[230].setRotationPoint(-24F, -23F, 7.5F);

		bodyModel[231].addShapeBox(0F, 0F, 0F, 5, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F); // Box 3 cull aww
		bodyModel[231].setRotationPoint(-23F, -17F, 10F);

		bodyModel[232].addShapeBox(0F, 0F, 0F, 5, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 5
		bodyModel[232].setRotationPoint(-23F, -18F, 10F);

		bodyModel[233].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 413
		bodyModel[233].setRotationPoint(-23F, -24F, 0F);

		bodyModel[234].addBox(0F, 0F, 0F, 2, 6, 1, 0F); // Box 362
		bodyModel[234].setRotationPoint(19F, -14F, -7.75F);

		bodyModel[235].addBox(0F, 0F, 0F, 10, 6, 1, 0F); // Box 364
		bodyModel[235].setRotationPoint(22F, -14F, 6.75F);

		bodyModel[236].addBox(0F, 0F, 0F, 2, 6, 1, 0F); // Box 365
		bodyModel[236].setRotationPoint(19F, -14F, 6.75F);

		bodyModel[237].addBox(0F, 0F, 0F, 2, 6, 1, 0F); // Box 366
		bodyModel[237].setRotationPoint(16.5F, -14F, 6.75F);

		bodyModel[238].addShapeBox(0F, 0F, 0F, 21, 1, 7, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 369
		bodyModel[238].setRotationPoint(12F, -23F, 1F);

		bodyModel[239].addShapeBox(0F, 0F, 0F, 21, 1, 7, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 370
		bodyModel[239].setRotationPoint(12F, -23F, -8F);

		bodyModel[240].addShapeBox(0F, 0F, 0F, 20, 1, 2, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 371
		bodyModel[240].setRotationPoint(12F, -23F, -1F);

		bodyModel[241].addBox(0F, 0F, 0F, 6, 2, 1, 0F); // Box 373
		bodyModel[241].setRotationPoint(-13.5F, -20F, -7.25F);

		bodyModel[242].addBox(0F, 0F, 0F, 2, 4, 1, 0F); // Box 374
		bodyModel[242].setRotationPoint(-13.5F, -17.5F, -7.25F);

		bodyModel[243].addBox(0F, 0F, 0F, 4, 4, 1, 0F); // Box 375
		bodyModel[243].setRotationPoint(-11F, -17.5F, -7.25F);

		bodyModel[244].addBox(0F, 0F, 0F, 4, 4, 1, 0F); // Box 376
		bodyModel[244].setRotationPoint(-11F, -17.5F, 6.25F);

		bodyModel[245].addBox(0F, 0F, 0F, 2, 4, 1, 0F); // Box 377
		bodyModel[245].setRotationPoint(-13.5F, -17.5F, 6.25F);

		bodyModel[246].addBox(0F, 0F, 0F, 6, 2, 1, 0F); // Box 378
		bodyModel[246].setRotationPoint(-13.5F, -20F, 6.25F);

		bodyModel[247].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 548
		bodyModel[247].setRotationPoint(-7F, 5F, -9F);

		bodyModel[248].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 549
		bodyModel[248].setRotationPoint(8F, 5F, -9F);

		bodyModel[249].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 550
		bodyModel[249].setRotationPoint(6F, 5F, -9F);

		bodyModel[250].addBox(0F, 0F, 0F, 12, 3, 22, 0F); // Box 551 fuel tank lorge
		bodyModel[250].setRotationPoint(-6F, 2F, -11F);

		bodyModel[251].addShapeBox(0F, 0F, 0F, 12, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 552 fuel tank lorge
		bodyModel[251].setRotationPoint(-6F, 5F, -11F);

		bodyModel[252].addBox(0F, 0F, 0F, 12, 4, 16, 0F); // Box 553 fuel tank lorge
		bodyModel[252].setRotationPoint(-6F, 5F, -8F);

		bodyModel[253].addShapeBox(0F, 0F, 0F, 12, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 554 fuel tank lorge
		bodyModel[253].setRotationPoint(-6F, 5F, 8F);

		bodyModel[254].addBox(0F, 0F, 0F, 1, 2, 3, 0F); // Box 555
		bodyModel[254].setRotationPoint(-31F, -3F, -10F);

		bodyModel[255].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 556
		bodyModel[255].setRotationPoint(-31F, -5F, -11F);

		bodyModel[256].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 557
		bodyModel[256].setRotationPoint(-6F, -5F, -11F);

		bodyModel[257].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 558
		bodyModel[257].setRotationPoint(-6F, -5F, 10F);

		bodyModel[258].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 277
		bodyModel[258].setRotationPoint(32F, -23F, -1F);

		bodyModel[259].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, -0.5F, -0.5F, -1F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 278
		bodyModel[259].setRotationPoint(33F, -23F, -8F);

		bodyModel[260].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, 0.5F, 0F, 0F, 0F, 0F, -1F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 279
		bodyModel[260].setRotationPoint(33F, -23F, 1F);

		bodyModel[261].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,-1F, 0F, 0F, 0.5F, 0F, 0F, 3F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, -1F, -2.5F, 0F, -1F); // Box 60
		bodyModel[261].setRotationPoint(-41F, 7F, 0F);

		bodyModel[262].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,-3.5F, 0F, 0F, 3F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -2.5F, 0F, -1F, 2F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 61
		bodyModel[262].setRotationPoint(-41F, 7F, -10F);

		bodyModel[263].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F); // Box 62
		bodyModel[263].setRotationPoint(-40F, 6F, 0F);

		bodyModel[264].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,-2.5F, 0F, 0F, 2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 63
		bodyModel[264].setRotationPoint(-40F, 6F, -10F);

		bodyModel[265].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F,-2.5F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 64
		bodyModel[265].setRotationPoint(-40F, 4F, -10F);

		bodyModel[266].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F); // Box 65
		bodyModel[266].setRotationPoint(-40F, 4F, 2F);

		bodyModel[267].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0.5F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F); // Box 66
		bodyModel[267].setRotationPoint(-40F, 3F, 2F);

		bodyModel[268].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,-1.5F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 67
		bodyModel[268].setRotationPoint(-40F, 3F, -10F);

		bodyModel[269].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 288
		bodyModel[269].setRotationPoint(33.75F, -21.75F, -2F);

		bodyModel[270].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 289 gyralight rear l
		bodyModel[270].setRotationPoint(34.5F, -21.7F, -2F);

		bodyModel[271].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 290gyralight rear r
		bodyModel[271].setRotationPoint(34.5F, -21.7F, 0F);

		bodyModel[272].addShapeBox(-1F, 0F, -1F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 291
		bodyModel[272].setRotationPoint(33F, -23.25F, 0F);

		bodyModel[273].addBox(0F, 0F, 0F, 3, 1, 0, 0F); // Box 292
		bodyModel[273].setRotationPoint(34F, 4F, 8F);

		bodyModel[274].addBox(0F, 0F, 0F, 3, 1, 0, 0F); // Box 293
		bodyModel[274].setRotationPoint(-37F, 4F, 8F);

		bodyModel[275].addBox(0F, 0F, 0F, 3, 1, 0, 0F); // Box 294
		bodyModel[275].setRotationPoint(-37F, 4F, -8F);

		bodyModel[276].addBox(0F, 0F, 0F, 3, 1, 0, 0F); // Box 295
		bodyModel[276].setRotationPoint(34F, 4F, -8F);

		bodyModel[277].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 296 fuel tank smol support
		bodyModel[277].setRotationPoint(-6F, 3F, -7F);

		bodyModel[278].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 296 fuel tank smol support
		bodyModel[278].setRotationPoint(-6F, 3F, 6F);

		bodyModel[279].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 296 fuel tank smol support
		bodyModel[279].setRotationPoint(4F, 3F, -7F);

		bodyModel[280].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 296 fuel tank smol support
		bodyModel[280].setRotationPoint(4F, 3F, 6F);

		bodyModel[281].addBox(0F, 0F, 0F, 1, 9, 0, 0F); // Box 300
		bodyModel[281].setRotationPoint(-38F, -9F, -2F);

		bodyModel[282].addBox(0F, 0F, 0F, 1, 9, 0, 0F); // Box 301
		bodyModel[282].setRotationPoint(-38F, -9F, 2F);

		bodyModel[283].addShapeBox(0F, 0F, 0F, 1, 0, 5, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 302
		bodyModel[283].setRotationPoint(-38F, -1F, -7F);

		bodyModel[284].addShapeBox(0F, 0F, 0F, 1, 0, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 303
		bodyModel[284].setRotationPoint(-38F, -1F, 2F);

		bodyModel[285].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 306
		bodyModel[285].setRotationPoint(-25.5F, -23.5F, -3.5F);

		bodyModel[286].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 307
		bodyModel[286].setRotationPoint(-27F, -24.25F, -2.5F);

		bodyModel[287].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 308
		bodyModel[287].setRotationPoint(-26F, -24.5F, -3.5F);

		bodyModel[288].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 309
		bodyModel[288].setRotationPoint(-25.5F, -24.25F, -4.5F);

		bodyModel[289].addBox(0F, 0F, 0F, 1, 17, 0, 0F); // Box 310
		bodyModel[289].setRotationPoint(-34F, -13F, 11F);

		bodyModel[290].addShapeBox(0F, 0F, 0F, 9, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 311
		bodyModel[290].setRotationPoint(-25F, -19F, 11F);
		bodyModel[290].rotateAngleX = 0.61086524F;

		bodyModel[291].addShapeBox(0F, 0F, 0F, 1, 0, 2, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 312
		bodyModel[291].setRotationPoint(-35F, -1F, -10F);

		bodyModel[292].addShapeBox(0F, 0F, 0F, 1, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 313
		bodyModel[292].setRotationPoint(-35F, -1F, 8F);

		bodyModel[293].addShapeBox(0F, 0F, 0F, 1, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 314
		bodyModel[293].setRotationPoint(34F, -1F, 8F);

		bodyModel[294].addShapeBox(0F, 0F, 0F, 1, 0, 2, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 315
		bodyModel[294].setRotationPoint(34F, -1F, -10F);

		bodyModel[295].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 0F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F); // Box 316
		bodyModel[295].setRotationPoint(-32F, -13.75F, -6F);

		bodyModel[296].addShapeBox(0F, 0F, 0F, 0, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 317
		bodyModel[296].setRotationPoint(-32F, -13.75F, -6F);

		bodyModel[297].addShapeBox(0F, 0F, 0F, 0, 1, 3, 0F,0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 318
		bodyModel[297].setRotationPoint(-32F, -13.75F, 3F);

		bodyModel[298].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F); // Box 319
		bodyModel[298].setRotationPoint(-32F, -13.75F, 6F);

		bodyModel[299].addShapeBox(0F, 0F, 0F, 1, 0, 5, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 324
		bodyModel[299].setRotationPoint(37F, -1F, -7F);

		bodyModel[300].addBox(0F, 0F, 0F, 1, 9, 0, 0F); // Box 325
		bodyModel[300].setRotationPoint(37F, -9F, -2F);

		bodyModel[301].addBox(0F, 0F, 0F, 1, 9, 0, 0F); // Box 326
		bodyModel[301].setRotationPoint(37F, -9F, 2F);

		bodyModel[302].addShapeBox(0F, 0F, 0F, 1, 0, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 327
		bodyModel[302].setRotationPoint(37F, -1F, 2F);

		bodyModel[303].addBox(-4F, 0F, 0F, 4, 1, 4, 0F); // Box 328 cull crossover
		bodyModel[303].setRotationPoint(37F, -1F, 2F);
		bodyModel[303].rotateAngleY = -3.14159265F;
		bodyModel[303].rotateAngleZ = -1.48352986F;

		bodyModel[304].addBox(0F, 0F, 0F, 1, 4, 3, 0F); // Box 275
		bodyModel[304].setRotationPoint(-26F, -14F, -1F);

		bodyModel[305].addBox(0F, 0F, 0F, 4, 9, 2, 0F); // Box 412
		bodyModel[305].setRotationPoint(-21F, -14F, -6F);

		bodyModel[306].addBox(0F, 0F, 0F, 7, 7, 3, 0F); // Box 413
		bodyModel[306].setRotationPoint(-27.1F, -12F, -2F);
		bodyModel[306].rotateAngleY = -0.82030475F;

		bodyModel[307].addShapeBox(-1F, 0F, -0.5F, 11, 4, 2, 0F,0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -2F, 0F, -5F, -2F, 0F, -5F, -2F, 0F, 0F, -2F, 0F); // Box 86
		bodyModel[307].setRotationPoint(-25.5F, -14F, -2F);
		bodyModel[307].rotateAngleY = -0.82030475F;

		bodyModel[308].addShapeBox(0F, 0F, 0F, 2, 6, 14, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 106
		bodyModel[308].setRotationPoint(-17F, -22F, -7F);

		bodyModel[309].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 186 Headlight Front up
		bodyModel[309].setRotationPoint(-28.25F, -23F, -1F);

		bodyModel[310].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 187 Headlight Front down
		bodyModel[310].setRotationPoint(-28.25F, -21F, -1F);

		bodyModel[311].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 247 Headlight Front nose R
		bodyModel[311].setRotationPoint(-34.5F, -13.7F, -2F);

		bodyModel[312].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 248 Headlight Front nose L
		bodyModel[312].setRotationPoint(-34.5F, -13.7F, 0F);

		bodyModel[313].addBox(0F, 0F, 0F, 6, 8, 0, 0F); // Box 325
		bodyModel[313].setRotationPoint(-33F, -13F, -11F);

		bodyModel[314].addBox(0F, 0F, 0F, 1, 17, 0, 0F); // Box 326
		bodyModel[314].setRotationPoint(-34F, -13F, -11F);

		bodyModel[315].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, -0.2F); // Box 401
		bodyModel[315].setRotationPoint(-25F, -25F, -0.5F);

		bodyModel[316].addBox(0F, 0F, 0F, 0, 2, 1, 0F); // Box 402
		bodyModel[316].setRotationPoint(-24F, -25F, -0.5F);

		bodyModel[317].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 745
		bodyModel[317].setRotationPoint(-11.5F, -23F, -0.5F);

		bodyModel[318].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 746
		bodyModel[318].setRotationPoint(-14F, -24F, -0.5F);

		bodyModel[319].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 747
		bodyModel[319].setRotationPoint(-13F, -23.75F, 0.5F);

		bodyModel[320].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 748
		bodyModel[320].setRotationPoint(-12.5F, -23.75F, -1.5F);
	}
	ModelTypeB theTrucks1 = new ModelTypeB();
	ModelFB2 theTrucks2 = new ModelFB2();
	ModelBapBlombergB theTrucks3 = new ModelBapBlombergB();

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		for (int i = 0; i < 321; i++) {
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
		if (entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor() == 6||entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor() == 7324) {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/fb2_Grey.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.3, 0.335, 0);
			theTrucks2.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(2.58, 0, 0);
			theTrucks2.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else if (entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor() == 14321||entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor() == 2436){
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/typeb_LightGrey.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.52, 0.335, 0);
			theTrucks1.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(3.05, 0, 0);
			theTrucks1.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else if (entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor() == 4){
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/blombergB_Black.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.3, 0.17, 0);
			theTrucks3.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(2.6, 0, 0);
			theTrucks3.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/fb2_Black.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.3, 0.335, 0);
			theTrucks2.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(2.58, 0, 0);
			theTrucks2.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		}
	}
	public ArrayList<double[]> getSmokePosition() {
		return new ArrayList<double[]>() {
			{
				add(new double[]{0.77D, 1.45D, 0.0D});
			}
		};
	}
	public float[] getTrans() {
		return new float[]{-1.3F, 0.155F, 0F};
	}

	public float[] getRotate() {
		return new float[] { 0F, 180F, 180F };
	}

	public float[] getScale() {
		return null;
	}
}