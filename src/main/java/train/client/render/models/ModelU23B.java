//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2021 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 15.07.2021 - 18:10:46
// Last changed on: 15.07.2021 - 18:10:46

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

public class ModelU23B extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 256;

	public ModelU23B() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[388];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 247, 37, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 260, 118, textureX, textureY); // Box 2
		bodyModel[2] = new ModelRendererTurbo(this, 99, 114, textureX, textureY); // Box 3
		bodyModel[3] = new ModelRendererTurbo(this, 274, 2, textureX, textureY); // Box 6
		bodyModel[4] = new ModelRendererTurbo(this, 73, 8, textureX, textureY); // Box 7
		bodyModel[5] = new ModelRendererTurbo(this, 101, 156, textureX, textureY); // Box 8
		bodyModel[6] = new ModelRendererTurbo(this, 254, 89, textureX, textureY); // Box 10
		bodyModel[7] = new ModelRendererTurbo(this, 350, 113, textureX, textureY); // Box 19
		bodyModel[8] = new ModelRendererTurbo(this, 31, 8, textureX, textureY); // Box 24
		bodyModel[9] = new ModelRendererTurbo(this, 1, 123, textureX, textureY); // Box 25
		bodyModel[10] = new ModelRendererTurbo(this, 10, 6, textureX, textureY); // Box 28
		bodyModel[11] = new ModelRendererTurbo(this, 52, 6, textureX, textureY); // Box 30
		bodyModel[12] = new ModelRendererTurbo(this, 114, 81, textureX, textureY); // Box 31
		bodyModel[13] = new ModelRendererTurbo(this, 125, 78, textureX, textureY); // Box 32
		bodyModel[14] = new ModelRendererTurbo(this, 97, 81, textureX, textureY); // Box 33
		bodyModel[15] = new ModelRendererTurbo(this, 217, 102, textureX, textureY); // Box 35
		bodyModel[16] = new ModelRendererTurbo(this, 183, 102, textureX, textureY); // Box 36
		bodyModel[17] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 61
		bodyModel[18] = new ModelRendererTurbo(this, 155, 133, textureX, textureY); // Box 63
		bodyModel[19] = new ModelRendererTurbo(this, 59, 43, textureX, textureY); // Box 67
		bodyModel[20] = new ModelRendererTurbo(this, 30, 43, textureX, textureY); // Box 68
		bodyModel[21] = new ModelRendererTurbo(this, 77, 25, textureX, textureY); // Box 106
		bodyModel[22] = new ModelRendererTurbo(this, 35, 25, textureX, textureY); // Box 107
		bodyModel[23] = new ModelRendererTurbo(this, 464, 115, textureX, textureY); // Box 148
		bodyModel[24] = new ModelRendererTurbo(this, 471, 110, textureX, textureY); // Box 149
		bodyModel[25] = new ModelRendererTurbo(this, 447, 110, textureX, textureY); // Box 150
		bodyModel[26] = new ModelRendererTurbo(this, 269, 82, textureX, textureY); // Box 156
		bodyModel[27] = new ModelRendererTurbo(this, 273, 148, textureX, textureY); // Box 157
		bodyModel[28] = new ModelRendererTurbo(this, 273, 139, textureX, textureY); // Box 158
		bodyModel[29] = new ModelRendererTurbo(this, 109, 9, textureX, textureY); // Box 160
		bodyModel[30] = new ModelRendererTurbo(this, 35, 45, textureX, textureY); // Box 161
		bodyModel[31] = new ModelRendererTurbo(this, 90, 45, textureX, textureY); // Box 162
		bodyModel[32] = new ModelRendererTurbo(this, 50, 45, textureX, textureY); // Box 163
		bodyModel[33] = new ModelRendererTurbo(this, 75, 45, textureX, textureY); // Box 164
		bodyModel[34] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 165
		bodyModel[35] = new ModelRendererTurbo(this, 99, 43, textureX, textureY); // Box 166
		bodyModel[36] = new ModelRendererTurbo(this, 105, 29, textureX, textureY); // Box 167
		bodyModel[37] = new ModelRendererTurbo(this, 70, 43, textureX, textureY); // Box 168
		bodyModel[38] = new ModelRendererTurbo(this, 109, 21, textureX, textureY); // Box 169
		bodyModel[39] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 48
		bodyModel[40] = new ModelRendererTurbo(this, 21, 39, textureX, textureY); // Box 43
		bodyModel[41] = new ModelRendererTurbo(this, 8, 42, textureX, textureY, "lamp"); // Box 117 liveryimg 2 glow
		bodyModel[42] = new ModelRendererTurbo(this, 8, 42, textureX, textureY, "lamp"); // Box 118 liveryimg 2 glow
		bodyModel[43] = new ModelRendererTurbo(this, 7, 39, textureX, textureY); // Box 175
		bodyModel[44] = new ModelRendererTurbo(this, 1, 76, textureX, textureY); // Box 185
		bodyModel[45] = new ModelRendererTurbo(this, 146, 132, textureX, textureY); // Box 195
		bodyModel[46] = new ModelRendererTurbo(this, 82, 132, textureX, textureY); // Box 196
		bodyModel[47] = new ModelRendererTurbo(this, 420, 102, textureX, textureY); // Box 197
		bodyModel[48] = new ModelRendererTurbo(this, 152, 132, textureX, textureY); // Box 198
		bodyModel[49] = new ModelRendererTurbo(this, 422, 94, textureX, textureY); // Box 199
		bodyModel[50] = new ModelRendererTurbo(this, 421, 96, textureX, textureY); // Box 200
		bodyModel[51] = new ModelRendererTurbo(this, 143, 86, textureX, textureY); // Box 203
		bodyModel[52] = new ModelRendererTurbo(this, 142, 88, textureX, textureY); // Box 204
		bodyModel[53] = new ModelRendererTurbo(this, 141, 94, textureX, textureY); // Box 205
		bodyModel[54] = new ModelRendererTurbo(this, 100, 105, textureX, textureY); // box65
		bodyModel[55] = new ModelRendererTurbo(this, 438, 165, textureX, textureY); // Box 215
		bodyModel[56] = new ModelRendererTurbo(this, 433, 128, textureX, textureY); // Box 218
		bodyModel[57] = new ModelRendererTurbo(this, 500, 128, textureX, textureY); // Box 220
		bodyModel[58] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 230
		bodyModel[59] = new ModelRendererTurbo(this, 405, 147, textureX, textureY); // Box 231
		bodyModel[60] = new ModelRendererTurbo(this, 96, 134, textureX, textureY); // Box 61
		bodyModel[61] = new ModelRendererTurbo(this, 140, 134, textureX, textureY); // Box 63
		bodyModel[62] = new ModelRendererTurbo(this, 103, 109, textureX, textureY); // Box 80
		bodyModel[63] = new ModelRendererTurbo(this, 253, 62, textureX, textureY); // Box 251
		bodyModel[64] = new ModelRendererTurbo(this, 201, 65, textureX, textureY); // Box 252
		bodyModel[65] = new ModelRendererTurbo(this, 447, 128, textureX, textureY); // Box 256
		bodyModel[66] = new ModelRendererTurbo(this, 487, 139, textureX, textureY); // Box 259
		bodyModel[67] = new ModelRendererTurbo(this, 451, 123, textureX, textureY); // Box 267
		bodyModel[68] = new ModelRendererTurbo(this, 445, 139, textureX, textureY); // Box 269
		bodyModel[69] = new ModelRendererTurbo(this, 173, 4, textureX, textureY, "lamp"); // Box 162 commander beacon
		bodyModel[70] = new ModelRendererTurbo(this, 172, 7, textureX, textureY); // Box 165
		bodyModel[71] = new ModelRendererTurbo(this, 55, 188, textureX, textureY); // Box 275 cs
		bodyModel[72] = new ModelRendererTurbo(this, 119, 42, textureX, textureY); // Box 277
		bodyModel[73] = new ModelRendererTurbo(this, 213, 65, textureX, textureY); // Box 281
		bodyModel[74] = new ModelRendererTurbo(this, 149, 65, textureX, textureY); // Box 284
		bodyModel[75] = new ModelRendererTurbo(this, 156, 79, textureX, textureY); // Box 285
		bodyModel[76] = new ModelRendererTurbo(this, 179, 81, textureX, textureY); // Box 288
		bodyModel[77] = new ModelRendererTurbo(this, 156, 90, textureX, textureY); // Box 300
		bodyModel[78] = new ModelRendererTurbo(this, 179, 90, textureX, textureY); // Box 303
		bodyModel[79] = new ModelRendererTurbo(this, 442, 110, textureX, textureY); // Box 296
		bodyModel[80] = new ModelRendererTurbo(this, 371, 125, textureX, textureY); // Box 305
		bodyModel[81] = new ModelRendererTurbo(this, 365, 125, textureX, textureY); // Box 305
		bodyModel[82] = new ModelRendererTurbo(this, 336, 85, textureX, textureY); // Box 19
		bodyModel[83] = new ModelRendererTurbo(this, 357, 98, textureX, textureY); // Box 305
		bodyModel[84] = new ModelRendererTurbo(this, 351, 97, textureX, textureY); // Box 305
		bodyModel[85] = new ModelRendererTurbo(this, 336, 81, textureX, textureY); // Box 440
		bodyModel[86] = new ModelRendererTurbo(this, 346, 81, textureX, textureY); // Box 441
		bodyModel[87] = new ModelRendererTurbo(this, 266, 122, textureX, textureY); // Box 19
		bodyModel[88] = new ModelRendererTurbo(this, 266, 105, textureX, textureY); // Box 19
		bodyModel[89] = new ModelRendererTurbo(this, 193, 66, textureX, textureY); // Box 101
		bodyModel[90] = new ModelRendererTurbo(this, 222, 66, textureX, textureY); // Box 101
		bodyModel[91] = new ModelRendererTurbo(this, 481, 109, textureX, textureY, "lamp"); // Box 240 glow liveryimg 2
		bodyModel[92] = new ModelRendererTurbo(this, 481, 109, textureX, textureY, "lamp"); // Box 241 glow liveryimg 2
		bodyModel[93] = new ModelRendererTurbo(this, 164, 32, textureX, textureY); // Box 247
		bodyModel[94] = new ModelRendererTurbo(this, 164, 35, textureX, textureY); // Box 248
		bodyModel[95] = new ModelRendererTurbo(this, 173, 34, textureX, textureY); // Box 249
		bodyModel[96] = new ModelRendererTurbo(this, 164, 38, textureX, textureY); // Box 250
		bodyModel[97] = new ModelRendererTurbo(this, 144, 32, textureX, textureY); // Box 248
		bodyModel[98] = new ModelRendererTurbo(this, 144, 36, textureX, textureY); // Box 250
		bodyModel[99] = new ModelRendererTurbo(this, 152, 33, textureX, textureY); // Box 249
		bodyModel[100] = new ModelRendererTurbo(this, 119, 111, textureX, textureY); // Box 205
		bodyModel[101] = new ModelRendererTurbo(this, 415, 139, textureX, textureY); // Box 205
		bodyModel[102] = new ModelRendererTurbo(this, 160, 101, textureX, textureY); // Box 36
		bodyModel[103] = new ModelRendererTurbo(this, 141, 9, textureX, textureY); // Box 114
		bodyModel[104] = new ModelRendererTurbo(this, 141, 6, textureX, textureY); // Box 74
		bodyModel[105] = new ModelRendererTurbo(this, 141, 12, textureX, textureY); // Box 78
		bodyModel[106] = new ModelRendererTurbo(this, 139, 1, textureX, textureY); // Box 78
		bodyModel[107] = new ModelRendererTurbo(this, 71, 133, textureX, textureY); // Box 2603
		bodyModel[108] = new ModelRendererTurbo(this, 84, 132, textureX, textureY); // Box 261
		bodyModel[109] = new ModelRendererTurbo(this, 491, 127, textureX, textureY); // Box 263
		bodyModel[110] = new ModelRendererTurbo(this, 493, 114, textureX, textureY); // Box 264
		bodyModel[111] = new ModelRendererTurbo(this, 108, 145, textureX, textureY); // Box 193
		bodyModel[112] = new ModelRendererTurbo(this, 201, 60, textureX, textureY, "lamp"); // Box 190 ditchlight f1
		bodyModel[113] = new ModelRendererTurbo(this, 469, 164, textureX, textureY); // Box 273
		bodyModel[114] = new ModelRendererTurbo(this, 193, 61, textureX, textureY, "lamp"); // Box 275 ditchlight f2
		bodyModel[115] = new ModelRendererTurbo(this, 213, 60, textureX, textureY, "lamp"); // Box 276 ditchlight r1
		bodyModel[116] = new ModelRendererTurbo(this, 222, 60, textureX, textureY, "lamp"); // Box 278 ditchlight r2
		bodyModel[117] = new ModelRendererTurbo(this, 1, 47, textureX, textureY, "lamp"); // Box 186 Headlight Front up
		bodyModel[118] = new ModelRendererTurbo(this, 1, 52, textureX, textureY, "lamp"); // Box 187 Headlight Front down
		bodyModel[119] = new ModelRendererTurbo(this, 4, 71, textureX, textureY, "lamp"); // Box 247 Headlight Front nose R
		bodyModel[120] = new ModelRendererTurbo(this, 12, 81, textureX, textureY, "lamp"); // Box 248 Headlight Front nose L
		bodyModel[121] = new ModelRendererTurbo(this, 447, 112, textureX, textureY, "lamp"); // Box 284 Headlight Rear down
		bodyModel[122] = new ModelRendererTurbo(this, 447, 112, textureX, textureY, "lamp"); // Box 285 Headlight Rear up
		bodyModel[123] = new ModelRendererTurbo(this, 17, 3, textureX, textureY); // Box 2
		bodyModel[124] = new ModelRendererTurbo(this, 17, 11, textureX, textureY); // Box 267
		bodyModel[125] = new ModelRendererTurbo(this, 434, 127, textureX, textureY); // Box 270434
		bodyModel[126] = new ModelRendererTurbo(this, 433, 114, textureX, textureY); // Box 271
		bodyModel[127] = new ModelRendererTurbo(this, 182, 4, textureX, textureY, "lamp"); // Box 162 commander beacon
		bodyModel[128] = new ModelRendererTurbo(this, 181, 8, textureX, textureY); // Box 165
		bodyModel[129] = new ModelRendererTurbo(this, 156, 65, textureX, textureY); // Box 279
		bodyModel[130] = new ModelRendererTurbo(this, 444, 125, textureX, textureY); // Box 280
		bodyModel[131] = new ModelRendererTurbo(this, 488, 130, textureX, textureY); // Box 281
		bodyModel[132] = new ModelRendererTurbo(this, 488, 115, textureX, textureY); // Box 282
		bodyModel[133] = new ModelRendererTurbo(this, 56, 67, textureX, textureY); // Box 289
		bodyModel[134] = new ModelRendererTurbo(this, 193, 16, textureX, textureY); // Box 292
		bodyModel[135] = new ModelRendererTurbo(this, 205, 2, textureX, textureY); // Box 293
		bodyModel[136] = new ModelRendererTurbo(this, 203, 8, textureX, textureY); // Box 294
		bodyModel[137] = new ModelRendererTurbo(this, 44, 66, textureX, textureY); // Box 295
		bodyModel[138] = new ModelRendererTurbo(this, 25, 66, textureX, textureY); // Box 296
		bodyModel[139] = new ModelRendererTurbo(this, 10, 66, textureX, textureY); // Box 297
		bodyModel[140] = new ModelRendererTurbo(this, 1, 39, textureX, textureY, "lamp"); // Box 298 headlight f hh
		bodyModel[141] = new ModelRendererTurbo(this, 1, 39, textureX, textureY, "lamp"); // Box 299 headlight f h
		bodyModel[142] = new ModelRendererTurbo(this, 19, 74, textureX, textureY); // Box 303
		bodyModel[143] = new ModelRendererTurbo(this, 34, 78, textureX, textureY); // Box 304
		bodyModel[144] = new ModelRendererTurbo(this, 41, 74, textureX, textureY); // Box 305
		bodyModel[145] = new ModelRendererTurbo(this, 34, 74, textureX, textureY); // Box 306
		bodyModel[146] = new ModelRendererTurbo(this, 50, 72, textureX, textureY); // Box 307
		bodyModel[147] = new ModelRendererTurbo(this, 10, 72, textureX, textureY); // Box 308
		bodyModel[148] = new ModelRendererTurbo(this, 128, 45, textureX, textureY); // Box 354
		bodyModel[149] = new ModelRendererTurbo(this, 130, 42, textureX, textureY); // Box 355
		bodyModel[150] = new ModelRendererTurbo(this, 130, 48, textureX, textureY); // Box 356
		bodyModel[151] = new ModelRendererTurbo(this, 139, 45, textureX, textureY); // Box 357
		bodyModel[152] = new ModelRendererTurbo(this, 210, 32, textureX, textureY); // Box 286
		bodyModel[153] = new ModelRendererTurbo(this, 219, 35, textureX, textureY); // Box 287
		bodyModel[154] = new ModelRendererTurbo(this, 210, 38, textureX, textureY); // Box 288
		bodyModel[155] = new ModelRendererTurbo(this, 208, 35, textureX, textureY); // Box 289
		bodyModel[156] = new ModelRendererTurbo(this, 179, 99, textureX, textureY); // Box 296
		bodyModel[157] = new ModelRendererTurbo(this, 179, 79, textureX, textureY); // Box 297
		bodyModel[158] = new ModelRendererTurbo(this, 83, 54, textureX, textureY); // Box 298
		bodyModel[159] = new ModelRendererTurbo(this, 78, 55, textureX, textureY); // Box 299
		bodyModel[160] = new ModelRendererTurbo(this, 49, 57, textureX, textureY); // Box 300
		bodyModel[161] = new ModelRendererTurbo(this, 70, 59, textureX, textureY); // Box 301
		bodyModel[162] = new ModelRendererTurbo(this, 41, 101, textureX, textureY); // Box 302
		bodyModel[163] = new ModelRendererTurbo(this, 19, 101, textureX, textureY); // Box 303
		bodyModel[164] = new ModelRendererTurbo(this, 34, 105, textureX, textureY); // Box 304
		bodyModel[165] = new ModelRendererTurbo(this, 112, 60, textureX, textureY); // Box 305
		bodyModel[166] = new ModelRendererTurbo(this, 112, 52, textureX, textureY); // Box 306
		bodyModel[167] = new ModelRendererTurbo(this, 1, 65, textureX, textureY, "lamp"); // Box 307 glowey marker
		bodyModel[168] = new ModelRendererTurbo(this, 1, 65, textureX, textureY, "lamp"); // Box 308 glowey marker
		bodyModel[169] = new ModelRendererTurbo(this, 113, 17, textureX, textureY); // Box 309
		bodyModel[170] = new ModelRendererTurbo(this, 314, 117, textureX, textureY); // Box 310
		bodyModel[171] = new ModelRendererTurbo(this, 243, 117, textureX, textureY); // Box 311
		bodyModel[172] = new ModelRendererTurbo(this, 98, 5, textureX, textureY); // Box 52 door swing right
		bodyModel[173] = new ModelRendererTurbo(this, 56, 5, textureX, textureY); // Box 314 door swing right
		bodyModel[174] = new ModelRendererTurbo(this, 207, 114, textureX, textureY); // Box 318
		bodyModel[175] = new ModelRendererTurbo(this, 207, 129, textureX, textureY); // Box 319
		bodyModel[176] = new ModelRendererTurbo(this, 445, 135, textureX, textureY); // Box 320
		bodyModel[177] = new ModelRendererTurbo(this, 97, 121, textureX, textureY); // Box 321
		bodyModel[178] = new ModelRendererTurbo(this, 493, 152, textureX, textureY, "lamp"); // Box 339 glowey marker
		bodyModel[179] = new ModelRendererTurbo(this, 493, 152, textureX, textureY, "lamp"); // Box 340 glowey marker
		bodyModel[180] = new ModelRendererTurbo(this, 3, 83, textureX, textureY); // Box 402
		bodyModel[181] = new ModelRendererTurbo(this, 207, 123, textureX, textureY); // Box 253
		bodyModel[182] = new ModelRendererTurbo(this, 207, 126, textureX, textureY); // Box 280
		bodyModel[183] = new ModelRendererTurbo(this, 422, 23, textureX, textureY); // Box 283
		bodyModel[184] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 284
		bodyModel[185] = new ModelRendererTurbo(this, 8, 50, textureX, textureY, "lamp"); // Box 287 glow liveryimg 2
		bodyModel[186] = new ModelRendererTurbo(this, 8, 50, textureX, textureY, "lamp"); // Box 288 glow liveryimg 2
		bodyModel[187] = new ModelRendererTurbo(this, 136, 124, textureX, textureY); // Box 298
		bodyModel[188] = new ModelRendererTurbo(this, 100, 124, textureX, textureY); // Box 299
		bodyModel[189] = new ModelRendererTurbo(this, 448, 138, textureX, textureY); // Box 300
		bodyModel[190] = new ModelRendererTurbo(this, 484, 138, textureX, textureY); // Box 301
		bodyModel[191] = new ModelRendererTurbo(this, 130, 91, textureX, textureY); // Box 411
		bodyModel[192] = new ModelRendererTurbo(this, 407, 99, textureX, textureY); // Box 412
		bodyModel[193] = new ModelRendererTurbo(this, 414, 99, textureX, textureY); // Box 413
		bodyModel[194] = new ModelRendererTurbo(this, 137, 91, textureX, textureY); // Box 414
		bodyModel[195] = new ModelRendererTurbo(this, 134, 62, textureX, textureY); // Box 417 atsf bit
		bodyModel[196] = new ModelRendererTurbo(this, 157, 64, textureX, textureY); // Box 418 atsf bit
		bodyModel[197] = new ModelRendererTurbo(this, 178, 65, textureX, textureY, "cull"); // Box 419 cull atsf bit
		bodyModel[198] = new ModelRendererTurbo(this, 161, 7, textureX, textureY); // Box 364 prime base
		bodyModel[199] = new ModelRendererTurbo(this, 161, 2, textureX, textureY, "lamp"); // Box 6 PRIME1-1
		bodyModel[200] = new ModelRendererTurbo(this, 161, 2, textureX, textureY, "lamp"); // Box 7 PRIME1-3
		bodyModel[201] = new ModelRendererTurbo(this, 161, 2, textureX, textureY, "lamp"); // Box 8 PRIME1-2
		bodyModel[202] = new ModelRendererTurbo(this, 161, 2, textureX, textureY, "lamp"); // Box 9 PRIME1-4
		bodyModel[203] = new ModelRendererTurbo(this, 181, 63, textureX, textureY); // Box 425
		bodyModel[204] = new ModelRendererTurbo(this, 128, 61, textureX, textureY, "cull"); // Box 426 cull atsf bit
		bodyModel[205] = new ModelRendererTurbo(this, 152, 42, textureX, textureY); // Box 427
		bodyModel[206] = new ModelRendererTurbo(this, 152, 45, textureX, textureY); // Box 428
		bodyModel[207] = new ModelRendererTurbo(this, 152, 48, textureX, textureY); // Box 429
		bodyModel[208] = new ModelRendererTurbo(this, 161, 45, textureX, textureY); // Box 430
		bodyModel[209] = new ModelRendererTurbo(this, 150, 7, textureX, textureY); // Box 364 prime base
		bodyModel[210] = new ModelRendererTurbo(this, 150, 2, textureX, textureY, "lamp"); // Box 6 PRIME2-1
		bodyModel[211] = new ModelRendererTurbo(this, 150, 2, textureX, textureY, "lamp"); // Box 7 PRIME2-3
		bodyModel[212] = new ModelRendererTurbo(this, 150, 2, textureX, textureY, "lamp"); // Box 8 PRIME2-2
		bodyModel[213] = new ModelRendererTurbo(this, 150, 2, textureX, textureY, "lamp"); // Box 9 PRIME2-4
		bodyModel[214] = new ModelRendererTurbo(this, 222, 66, textureX, textureY); // Box 440
		bodyModel[215] = new ModelRendererTurbo(this, 222, 60, textureX, textureY, "lamp"); // Box 441 ditchlight r2
		bodyModel[216] = new ModelRendererTurbo(this, 213, 65, textureX, textureY); // Box 442
		bodyModel[217] = new ModelRendererTurbo(this, 213, 60, textureX, textureY, "lamp"); // Box 443 ditchlight r1
		bodyModel[218] = new ModelRendererTurbo(this, 193, 66, textureX, textureY); // Box 444
		bodyModel[219] = new ModelRendererTurbo(this, 193, 61, textureX, textureY, "lamp"); // Box 445 ditchlight f2
		bodyModel[220] = new ModelRendererTurbo(this, 201, 60, textureX, textureY, "lamp"); // Box 446 ditchlight f1
		bodyModel[221] = new ModelRendererTurbo(this, 201, 65, textureX, textureY); // Box 447
		bodyModel[222] = new ModelRendererTurbo(this, 141, 94, textureX, textureY); // Box 448
		bodyModel[223] = new ModelRendererTurbo(this, 142, 88, textureX, textureY); // Box 450
		bodyModel[224] = new ModelRendererTurbo(this, 143, 86, textureX, textureY); // Box 451
		bodyModel[225] = new ModelRendererTurbo(this, 420, 102, textureX, textureY); // Box 452
		bodyModel[226] = new ModelRendererTurbo(this, 421, 96, textureX, textureY); // Box 454
		bodyModel[227] = new ModelRendererTurbo(this, 422, 94, textureX, textureY); // Box 455
		bodyModel[228] = new ModelRendererTurbo(this, 180, 112, textureX, textureY); // Box 322
		bodyModel[229] = new ModelRendererTurbo(this, 180, 136, textureX, textureY); // Box 323
		bodyModel[230] = new ModelRendererTurbo(this, 116, 42, textureX, textureY); // Box 324
		bodyModel[231] = new ModelRendererTurbo(this, 134, 52, textureX, textureY, "lamp"); // Box 334 commander beacon
		bodyModel[232] = new ModelRendererTurbo(this, 129, 53, textureX, textureY); // Box 335
		bodyModel[233] = new ModelRendererTurbo(this, 140, 56, textureX, textureY, "cull"); // Box 329 support cull
		bodyModel[234] = new ModelRendererTurbo(this, 129, 56, textureX, textureY); // Box 330
		bodyModel[235] = new ModelRendererTurbo(this, 139, 52, textureX, textureY, "lamp"); // Box 334 commander beacon
		bodyModel[236] = new ModelRendererTurbo(this, 144, 53, textureX, textureY); // Box 335
		bodyModel[237] = new ModelRendererTurbo(this, 166, 42, textureX, textureY); // Box 333
		bodyModel[238] = new ModelRendererTurbo(this, 176, 45, textureX, textureY); // Box 334
		bodyModel[239] = new ModelRendererTurbo(this, 166, 45, textureX, textureY); // Box 335
		bodyModel[240] = new ModelRendererTurbo(this, 166, 48, textureX, textureY); // Box 336
		bodyModel[241] = new ModelRendererTurbo(this, 113, 42, textureX, textureY); // Box 337
		bodyModel[242] = new ModelRendererTurbo(this, 237, 49, textureX, textureY); // Box 418
		bodyModel[243] = new ModelRendererTurbo(this, 228, 46, textureX, textureY); // Box 419
		bodyModel[244] = new ModelRendererTurbo(this, 226, 49, textureX, textureY); // Box 420
		bodyModel[245] = new ModelRendererTurbo(this, 228, 52, textureX, textureY); // Box 421
		bodyModel[246] = new ModelRendererTurbo(this, 151, 55, textureX, textureY, "lamp"); // Box 6 PRIME3-1
		bodyModel[247] = new ModelRendererTurbo(this, 151, 55, textureX, textureY, "lamp"); // Box 7 PRIME3-3
		bodyModel[248] = new ModelRendererTurbo(this, 151, 55, textureX, textureY, "lamp"); // Box 8 PRIME3-2
		bodyModel[249] = new ModelRendererTurbo(this, 151, 55, textureX, textureY, "lamp"); // Box 9 PRIME3-4
		bodyModel[250] = new ModelRendererTurbo(this, 161, 56, textureX, textureY, "cull"); // Box 426 cull
		bodyModel[251] = new ModelRendererTurbo(this, 151, 59, textureX, textureY); // Box 428
		bodyModel[252] = new ModelRendererTurbo(this, 26, 197, textureX, textureY); // Box 412 cs
		bodyModel[253] = new ModelRendererTurbo(this, 40, 196, textureX, textureY); // Box 413 cs
		bodyModel[254] = new ModelRendererTurbo(this, 28, 189, textureX, textureY); // Box 86
		bodyModel[255] = new ModelRendererTurbo(this, 147, 14, textureX, textureY); // Box 352
		bodyModel[256] = new ModelRendererTurbo(this, 147, 17, textureX, textureY); // Box 353
		bodyModel[257] = new ModelRendererTurbo(this, 147, 11, textureX, textureY); // Box 354
		bodyModel[258] = new ModelRendererTurbo(this, 140, 22, textureX, textureY); // Box 877
		bodyModel[259] = new ModelRendererTurbo(this, 138, 21, textureX, textureY); // Box 332
		bodyModel[260] = new ModelRendererTurbo(this, 138, 21, textureX, textureY); // Box 333
		bodyModel[261] = new ModelRendererTurbo(this, 112, 38, textureX, textureY); // Box 413
		bodyModel[262] = new ModelRendererTurbo(this, 433, 67, textureX, textureY); // Box 298
		bodyModel[263] = new ModelRendererTurbo(this, 440, 57, textureX, textureY); // Box 369
		bodyModel[264] = new ModelRendererTurbo(this, 440, 44, textureX, textureY); // Box 370
		bodyModel[265] = new ModelRendererTurbo(this, 446, 53, textureX, textureY); // Box 371
		bodyModel[266] = new ModelRendererTurbo(this, 463, 111, textureX, textureY); // Box 277
		bodyModel[267] = new ModelRendererTurbo(this, 448, 98, textureX, textureY); // Box 278
		bodyModel[268] = new ModelRendererTurbo(this, 470, 98, textureX, textureY); // Box 279
		bodyModel[269] = new ModelRendererTurbo(this, 3, 87, textureX, textureY); // Box 291
		bodyModel[270] = new ModelRendererTurbo(this, 233, 65, textureX, textureY); // Box 18
		bodyModel[271] = new ModelRendererTurbo(this, 246, 68, textureX, textureY); // Box 21
		bodyModel[272] = new ModelRendererTurbo(this, 134, 78, textureX, textureY); // Box 688
		bodyModel[273] = new ModelRendererTurbo(this, 206, 99, textureX, textureY); // Box 37
		bodyModel[274] = new ModelRendererTurbo(this, 240, 99, textureX, textureY); // Box 38
		bodyModel[275] = new ModelRendererTurbo(this, 215, 99, textureX, textureY); // Box 557
		bodyModel[276] = new ModelRendererTurbo(this, 249, 99, textureX, textureY); // Box 558
		bodyModel[277] = new ModelRendererTurbo(this, 500, 152, textureX, textureY, "lamp"); // Box 339 glowey marker
		bodyModel[278] = new ModelRendererTurbo(this, 500, 152, textureX, textureY, "lamp"); // Box 340 glowey marker
		bodyModel[279] = new ModelRendererTurbo(this, 462, 104, textureX, textureY); // Box 288
		bodyModel[280] = new ModelRendererTurbo(this, 1, 91, textureX, textureY, "lamp"); // Box 289 gyralight rear l
		bodyModel[281] = new ModelRendererTurbo(this, 8, 91, textureX, textureY, "lamp"); // Box 290gyralight rear r
		bodyModel[282] = new ModelRendererTurbo(this, 455, 111, textureX, textureY); // Box 324
		bodyModel[283] = new ModelRendererTurbo(this, 457, 107, textureX, textureY); // Box 325
		bodyModel[284] = new ModelRendererTurbo(this, 475, 107, textureX, textureY); // Box 326
		bodyModel[285] = new ModelRendererTurbo(this, 467, 111, textureX, textureY); // Box 327
		bodyModel[286] = new ModelRendererTurbo(this, 459, 98, textureX, textureY, "cull"); // Box 328 cull crossover
		bodyModel[287] = new ModelRendererTurbo(this, 111, 99, textureX, textureY, "cull"); // Box 339 cull crossover
		bodyModel[288] = new ModelRendererTurbo(this, 121, 113, textureX, textureY); // Box 300
		bodyModel[289] = new ModelRendererTurbo(this, 115, 113, textureX, textureY); // Box 301
		bodyModel[290] = new ModelRendererTurbo(this, 119, 117, textureX, textureY); // Box 302
		bodyModel[291] = new ModelRendererTurbo(this, 107, 117, textureX, textureY); // Box 303
		bodyModel[292] = new ModelRendererTurbo(this, 28, 101, textureX, textureY); // Box 316
		bodyModel[293] = new ModelRendererTurbo(this, 40, 100, textureX, textureY); // Box 317
		bodyModel[294] = new ModelRendererTurbo(this, 28, 100, textureX, textureY); // Box 318
		bodyModel[295] = new ModelRendererTurbo(this, 42, 101, textureX, textureY); // Box 319
		bodyModel[296] = new ModelRendererTurbo(this, 116, 45, textureX, textureY); // Box 276
		bodyModel[297] = new ModelRendererTurbo(this, 76, 5, textureX, textureY); // Box 123
		bodyModel[298] = new ModelRendererTurbo(this, 95, 24, textureX, textureY); // Box 350
		bodyModel[299] = new ModelRendererTurbo(this, 98, 24, textureX, textureY); // Box 321
		bodyModel[300] = new ModelRendererTurbo(this, 16, 55, textureX, textureY, "cull"); // Box 3 cull aww
		bodyModel[301] = new ModelRendererTurbo(this, 17, 50, textureX, textureY); // Box 5
		bodyModel[302] = new ModelRendererTurbo(this, 34, 5, textureX, textureY); // Box 311
		bodyModel[303] = new ModelRendererTurbo(this, 6, 156, textureX, textureY); // Box 282
		bodyModel[304] = new ModelRendererTurbo(this, 52, 156, textureX, textureY); // Box 283
		bodyModel[305] = new ModelRendererTurbo(this, 19, 154, textureX, textureY); // Box 4
		bodyModel[306] = new ModelRendererTurbo(this, 32, 154, textureX, textureY); // Box 448
		bodyModel[307] = new ModelRendererTurbo(this, 65, 154, textureX, textureY); // Box 322
		bodyModel[308] = new ModelRendererTurbo(this, 78, 154, textureX, textureY); // Box 323
		bodyModel[309] = new ModelRendererTurbo(this, 43, 152, textureX, textureY); // Box 280
		bodyModel[310] = new ModelRendererTurbo(this, 89, 152, textureX, textureY); // Box 285
		bodyModel[311] = new ModelRendererTurbo(this, 19, 171, textureX, textureY); // Box 727
		bodyModel[312] = new ModelRendererTurbo(this, 65, 168, textureX, textureY); // Box 728
		bodyModel[313] = new ModelRendererTurbo(this, 52, 170, textureX, textureY); // Box 729
		bodyModel[314] = new ModelRendererTurbo(this, 6, 173, textureX, textureY); // Box 730
		bodyModel[315] = new ModelRendererTurbo(this, 32, 171, textureX, textureY); // Box 731
		bodyModel[316] = new ModelRendererTurbo(this, 43, 169, textureX, textureY); // Box 732
		bodyModel[317] = new ModelRendererTurbo(this, 78, 168, textureX, textureY); // Box 733
		bodyModel[318] = new ModelRendererTurbo(this, 89, 166, textureX, textureY); // Box 734
		bodyModel[319] = new ModelRendererTurbo(this, 191, 9, textureX, textureY); // Box 114
		bodyModel[320] = new ModelRendererTurbo(this, 191, 6, textureX, textureY); // Box 74
		bodyModel[321] = new ModelRendererTurbo(this, 191, 12, textureX, textureY); // Box 78
		bodyModel[322] = new ModelRendererTurbo(this, 190, 1, textureX, textureY); // Box 245
		bodyModel[323] = new ModelRendererTurbo(this, 251, 40, textureX, textureY); // Box 373
		bodyModel[324] = new ModelRendererTurbo(this, 259, 45, textureX, textureY); // Box 374
		bodyModel[325] = new ModelRendererTurbo(this, 248, 45, textureX, textureY); // Box 375
		bodyModel[326] = new ModelRendererTurbo(this, 251, 28, textureX, textureY); // Box 376
		bodyModel[327] = new ModelRendererTurbo(this, 263, 28, textureX, textureY); // Box 377
		bodyModel[328] = new ModelRendererTurbo(this, 254, 24, textureX, textureY); // Box 378
		bodyModel[329] = new ModelRendererTurbo(this, 218, 49, textureX, textureY); // Box 745
		bodyModel[330] = new ModelRendererTurbo(this, 206, 49, textureX, textureY); // Box 746
		bodyModel[331] = new ModelRendererTurbo(this, 208, 46, textureX, textureY); // Box 747
		bodyModel[332] = new ModelRendererTurbo(this, 208, 52, textureX, textureY); // Box 748
		bodyModel[333] = new ModelRendererTurbo(this, 174, 55, textureX, textureY, "lamp"); // Box 6 PRIME4-1
		bodyModel[334] = new ModelRendererTurbo(this, 174, 55, textureX, textureY, "lamp"); // Box 7 PRIME4-3
		bodyModel[335] = new ModelRendererTurbo(this, 174, 55, textureX, textureY, "lamp"); // Box 8 PRIME4-2
		bodyModel[336] = new ModelRendererTurbo(this, 174, 55, textureX, textureY, "lamp"); // Box 9 PRIME4-4
		bodyModel[337] = new ModelRendererTurbo(this, 174, 59, textureX, textureY); // Box 428
		bodyModel[338] = new ModelRendererTurbo(this, 421, 99, textureX, textureY); // Box 201
		bodyModel[339] = new ModelRendererTurbo(this, 142, 91, textureX, textureY); // Box 202
		bodyModel[340] = new ModelRendererTurbo(this, 130, 86, textureX, textureY); // Box 431
		bodyModel[341] = new ModelRendererTurbo(this, 407, 94, textureX, textureY); // Box 432
		bodyModel[342] = new ModelRendererTurbo(this, 414, 94, textureX, textureY); // Box 433
		bodyModel[343] = new ModelRendererTurbo(this, 137, 86, textureX, textureY); // Box 434
		bodyModel[344] = new ModelRendererTurbo(this, 142, 91, textureX, textureY); // Box 449
		bodyModel[345] = new ModelRendererTurbo(this, 421, 99, textureX, textureY); // Box 453
		bodyModel[346] = new ModelRendererTurbo(this, 414, 94, textureX, textureY); // Box 292
		bodyModel[347] = new ModelRendererTurbo(this, 407, 94, textureX, textureY); // Box 293
		bodyModel[348] = new ModelRendererTurbo(this, 130, 86, textureX, textureY); // Box 294
		bodyModel[349] = new ModelRendererTurbo(this, 137, 86, textureX, textureY); // Box 295
		bodyModel[350] = new ModelRendererTurbo(this, 1, 32, textureX, textureY); // Box 206
		bodyModel[351] = new ModelRendererTurbo(this, 1, 32, textureX, textureY); // Box 207
		bodyModel[352] = new ModelRendererTurbo(this, 435, 106, textureX, textureY); // Box 217
		bodyModel[353] = new ModelRendererTurbo(this, 501, 108, textureX, textureY); // Box 221
		bodyModel[354] = new ModelRendererTurbo(this, 315, 89, textureX, textureY); // Box 19
		bodyModel[355] = new ModelRendererTurbo(this, 315, 89, textureX, textureY); // Box 548
		bodyModel[356] = new ModelRendererTurbo(this, 329, 117, textureX, textureY); // Box 19
		bodyModel[357] = new ModelRendererTurbo(this, 329, 117, textureX, textureY); // Box 548
		bodyModel[358] = new ModelRendererTurbo(this, 462, 1, textureX, textureY); // Box 293
		bodyModel[359] = new ModelRendererTurbo(this, 467, 23, textureX, textureY); // Box 293
		bodyModel[360] = new ModelRendererTurbo(this, 483, 32, textureX, textureY); // Box 293
		bodyModel[361] = new ModelRendererTurbo(this, 476, 32, textureX, textureY); // Box 293
		bodyModel[362] = new ModelRendererTurbo(this, 467, 32, textureX, textureY); // Box 293
		bodyModel[363] = new ModelRendererTurbo(this, 478, 10, textureX, textureY); // Box 293
		bodyModel[364] = new ModelRendererTurbo(this, 471, 11, textureX, textureY); // Box 293
		bodyModel[365] = new ModelRendererTurbo(this, 462, 10, textureX, textureY); // Box 293
		bodyModel[366] = new ModelRendererTurbo(this, 8, 59, textureX, textureY, "lamp"); // Box 307 glowey marker
		bodyModel[367] = new ModelRendererTurbo(this, 8, 59, textureX, textureY, "lamp"); // Box 308 glowey marker
		bodyModel[368] = new ModelRendererTurbo(this, 112, 40, textureX, textureY); // Box 785
		bodyModel[369] = new ModelRendererTurbo(this, 195, 46, textureX, textureY); // Box 786
		bodyModel[370] = new ModelRendererTurbo(this, 186, 43, textureX, textureY); // Box 787
		bodyModel[371] = new ModelRendererTurbo(this, 184, 46, textureX, textureY); // Box 788
		bodyModel[372] = new ModelRendererTurbo(this, 186, 49, textureX, textureY); // Box 789
		bodyModel[373] = new ModelRendererTurbo(this, 143, 101, textureX, textureY); // Box 790
		bodyModel[374] = new ModelRendererTurbo(this, 132, 104, textureX, textureY); // Box 791
		bodyModel[375] = new ModelRendererTurbo(this, 56, 90, textureX, textureY); // Box 410
		bodyModel[376] = new ModelRendererTurbo(this, 69, 90, textureX, textureY); // Box 310
		bodyModel[377] = new ModelRendererTurbo(this, 84, 95, textureX, textureY); // Box 81
		bodyModel[378] = new ModelRendererTurbo(this, 99, 112, textureX, textureY); // Box 81
		bodyModel[379] = new ModelRendererTurbo(this, 103, 108, textureX, textureY); // Box 275
		bodyModel[380] = new ModelRendererTurbo(this, 94, 95, textureX, textureY); // Box 250
		bodyModel[381] = new ModelRendererTurbo(this, 99, 108, textureX, textureY); // Box 276
		bodyModel[382] = new ModelRendererTurbo(this, 490, 23, textureX, textureY); // Box 293
		bodyModel[383] = new ModelRendererTurbo(this, 485, 1, textureX, textureY); // Box 293
		bodyModel[384] = new ModelRendererTurbo(this, 37, 62, textureX, textureY); // Box 402
		bodyModel[385] = new ModelRendererTurbo(this, 61, 96, textureX, textureY); // Box 106
		bodyModel[386] = new ModelRendererTurbo(this, 176, 16, textureX, textureY); // Box 401
		bodyModel[387] = new ModelRendererTurbo(this, 173, 15, textureX, textureY); // Box 402

		bodyModel[0].addBox(0F, 0F, 0F, 76, 2, 22, 0F); // Box 0
		bodyModel[0].setRotationPoint(-38F, -1F, -11F);

		bodyModel[1].addBox(0F, 0F, 0F, 18, 4, 16, 0F); // Box 2
		bodyModel[1].setRotationPoint(-9F, 5F, -8F);

		bodyModel[2].addBox(0F, 0F, 0F, 0, 8, 20, 0F); // Box 3
		bodyModel[2].setRotationPoint(-42.01F, -1F, -10F);

		bodyModel[3].addBox(0F, 0F, 0F, 57, 20, 14, 0F); // Box 6
		bodyModel[3].setRotationPoint(-19F, -21F, -7F);

		bodyModel[4].addBox(0F, 0F, 0F, 11, 14, 1, 0F); // Box 7
		bodyModel[4].setRotationPoint(-31F, -19F, -11F);

		bodyModel[5].addBox(0F, 0F, 0F, 4, 2, 14, 0F); // Box 8
		bodyModel[5].setRotationPoint(-42F, -1F, -7F);

		bodyModel[6].addBox(0F, 0F, 0F, 18, 3, 22, 0F); // Box 10
		bodyModel[6].setRotationPoint(-9F, 2F, -11F);

		bodyModel[7].addBox(0F, 0F, 0F, 1, 3, 18, 0F); // Box 19
		bodyModel[7].setRotationPoint(10F, 4F, -9F);

		bodyModel[8].addBox(0F, 0F, 0F, 11, 14, 1, 0F); // Box 24
		bodyModel[8].setRotationPoint(-31F, -19F, 10F);

		bodyModel[9].addBox(0F, 0F, 0F, 13, 4, 22, 0F); // Box 25
		bodyModel[9].setRotationPoint(-32F, -5F, -11F);

		bodyModel[10].addBox(0F, 0F, 0F, 1, 14, 18, 0F); // Box 28
		bodyModel[10].setRotationPoint(-20F, -19F, -11F);

		bodyModel[11].addBox(0F, 0F, 0F, 1, 14, 18, 0F); // Box 30
		bodyModel[11].setRotationPoint(-32F, -19F, -7F);

		bodyModel[12].addBox(0F, 0F, 0F, 3, 4, 4, 0F); // Box 31
		bodyModel[12].setRotationPoint(-35F, -5F, -11F);

		bodyModel[13].addBox(0F, 0F, 0F, 1, 2, 3, 0F); // Box 32
		bodyModel[13].setRotationPoint(-36F, -3F, -10F);

		bodyModel[14].addBox(0F, 0F, 0F, 4, 4, 4, 0F); // Box 33
		bodyModel[14].setRotationPoint(-36F, -5F, 7F);

		bodyModel[15].addBox(0F, 0F, 0F, 9, 4, 4, 0F); // Box 35
		bodyModel[15].setRotationPoint(-19F, -5F, 7F);

		bodyModel[16].addBox(0F, 0F, 0F, 9, 4, 4, 0F); // Box 36
		bodyModel[16].setRotationPoint(-19F, -5F, -11F);

		bodyModel[17].addBox(0F, 0F, 0F, 4, 2, 3, 0F); // Box 61
		bodyModel[17].setRotationPoint(-46F, 3F, -1.5F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 2, 7, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 63
		bodyModel[18].setRotationPoint(-38F, 1F, -11F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 67
		bodyModel[19].setRotationPoint(-32F, -22F, 7F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 68
		bodyModel[20].setRotationPoint(-32F, -22F, -11F);

		bodyModel[21].addBox(0F, 0F, 0F, 1, 3, 14, 0F); // Box 106
		bodyModel[21].setRotationPoint(-20F, -22F, -7F);

		bodyModel[22].addBox(0F, 0F, 0F, 1, 3, 14, 0F); // Box 107
		bodyModel[22].setRotationPoint(-32F, -22F, -7F);

		bodyModel[23].addBox(0F, 0F, 0F, 1, 21, 2, 0F); // Box 148
		bodyModel[23].setRotationPoint(38F, -22F, -1F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 1, 21, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 149
		bodyModel[24].setRotationPoint(38F, -22F, 1F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 1, 21, 7, 0F,0F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 150
		bodyModel[25].setRotationPoint(38F, -22F, -8F);

		bodyModel[26].addBox(0F, 0F, 0F, 29, 1, 3, 0F); // Box 156
		bodyModel[26].setRotationPoint(-38F, 1F, -11F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 18, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 157
		bodyModel[27].setRotationPoint(-9F, 5F, -11F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 18, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 158
		bodyModel[28].setRotationPoint(-9F, 5F, 8F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 11, 1, 6, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 160
		bodyModel[29].setRotationPoint(-31F, -23F, -7F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 161
		bodyModel[30].setRotationPoint(-32F, -23F, -7F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 162
		bodyModel[31].setRotationPoint(-20F, -23F, -7F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 163
		bodyModel[32].setRotationPoint(-32F, -23F, 1F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 164
		bodyModel[33].setRotationPoint(-20F, -23F, 1F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 11, 3, 4, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 165
		bodyModel[34].setRotationPoint(-31F, -22F, -11F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 166
		bodyModel[35].setRotationPoint(-20F, -22F, -11F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 11, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 167
		bodyModel[36].setRotationPoint(-31F, -22F, 7F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[37].setRotationPoint(-20F, -22F, 7F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 11, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 169
		bodyModel[38].setRotationPoint(-31F, -23F, 1F);

		bodyModel[39].addBox(0F, 0F, 0F, 1, 4, 2, 0F); // Box 48
		bodyModel[39].setRotationPoint(-33F, -23F, -1F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
		bodyModel[40].setRotationPoint(-33F, -22F, -6F);

		bodyModel[41].addBox(0F, 0F, 0F, 0, 2, 5, 0F); // Box 117 liveryimg 2 glow
		bodyModel[41].setRotationPoint(-32.05F, -22F, -6F);
		bodyModel[41].rotateAngleY = 0.19198622F;

		bodyModel[42].addBox(0F, 0F, -5F, 0, 2, 5, 0F); // Box 118 liveryimg 2 glow
		bodyModel[42].setRotationPoint(-32.05F, -22F, 6F);
		bodyModel[42].rotateAngleY = -0.19198622F;

		bodyModel[43].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 175
		bodyModel[43].setRotationPoint(-33F, -22F, 1F);

		bodyModel[44].addBox(0F, 0F, 0F, 2, 2, 4, 0F); // Box 185
		bodyModel[44].setRotationPoint(-38.75F, -13.75F, -2F);

		bodyModel[45].addBox(0F, 0F, 0F, 1, 9, 3, 0F); // Box 195
		bodyModel[45].setRotationPoint(-39F, -1F, -10F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 196
		bodyModel[46].setRotationPoint(-39F, 7F, 10F);

		bodyModel[47].addBox(0F, 0F, 0F, 3, 0, 3, 0F); // Box 197
		bodyModel[47].setRotationPoint(-42F, 8F, 8F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 198
		bodyModel[48].setRotationPoint(-39F, 7F, -11F);

		bodyModel[49].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 199
		bodyModel[49].setRotationPoint(-42F, -1F, 7F);

		bodyModel[50].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 200
		bodyModel[50].setRotationPoint(-42F, 2F, 7F);

		bodyModel[51].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 203
		bodyModel[51].setRotationPoint(-42F, -1F, -8F);

		bodyModel[52].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 204
		bodyModel[52].setRotationPoint(-42F, 2F, -9F);

		bodyModel[53].addBox(0F, 0F, 0F, 3, 0, 3, 0F); // Box 205
		bodyModel[53].setRotationPoint(-42F, 8F, -11F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F,-1F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // box65
		bodyModel[54].setRotationPoint(-43F, 8F, -9F);

		bodyModel[55].addBox(0F, 0F, 0F, 4, 2, 14, 0F); // Box 215
		bodyModel[55].setRotationPoint(38F, -1F, -7F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 218
		bodyModel[56].setRotationPoint(38F, 7F, 10F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 220
		bodyModel[57].setRotationPoint(38F, 7F, -11F);

		bodyModel[58].addBox(0F, 0F, 0F, 4, 2, 3, 0F); // Box 230
		bodyModel[58].setRotationPoint(42F, 3F, -1.5F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F,0F, 0F, 1F, -1F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 231
		bodyModel[59].setRotationPoint(42F, 8F, -9F);

		bodyModel[60].addBox(0F, 0F, 0F, 0, 5, 1, 0F); // Box 61
		bodyModel[60].setRotationPoint(-42F, -1F, 10F);

		bodyModel[61].addBox(0F, 0F, 0F, 0, 5, 1, 0F); // Box 63
		bodyModel[61].setRotationPoint(-42F, -1F, -11F);

		bodyModel[62].addBox(0F, 0F, 0F, 0, 8, 16, 0F); // Box 80
		bodyModel[62].setRotationPoint(-42F, -9F, -8F);

		bodyModel[63].addBox(0F, 0F, 0F, 76, 2, 16, 0F); // Box 251
		bodyModel[63].setRotationPoint(-38F, 1F, -8F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 252
		bodyModel[64].setRotationPoint(-42F, -4F, -6.75F);

		bodyModel[65].addBox(0F, 0F, 0F, 0, 8, 20, 0F); // Box 256
		bodyModel[65].setRotationPoint(42.01F, -1F, -10F);

		bodyModel[66].addBox(0F, 0F, 0F, 0, 5, 1, 0F); // Box 259
		bodyModel[66].setRotationPoint(42.01F, -1F, 10F);

		bodyModel[67].addBox(0F, 0F, 0F, 0, 8, 16, 0F); // Box 267
		bodyModel[67].setRotationPoint(42.01F, -9F, -8F);

		bodyModel[68].addBox(0F, 0F, 0F, 0, 5, 1, 0F); // Box 269
		bodyModel[68].setRotationPoint(42.01F, -1F, -11F);

		bodyModel[69].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 162 commander beacon
		bodyModel[69].setRotationPoint(-28.68F, -24.5F, -0.5F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0.3F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, 0.3F, -0.5F, 0.1F, 0.3F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, 0.3F, -0.5F, 0.1F); // Box 165
		bodyModel[70].setRotationPoint(-28.5F, -24F, -0.5F);

		bodyModel[71].addBox(0F, 0F, 0F, 1, 4, 3, 0F); // Box 275 cs
		bodyModel[71].setRotationPoint(-31F, -14F, -1F);

		bodyModel[72].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 277
		bodyModel[72].setRotationPoint(-35.5F, -11F, 6.5F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 281
		bodyModel[73].setRotationPoint(41F, -4F, -6.75F);

		bodyModel[74].addBox(0F, 0F, 0F, 3, 2, 0, 0F); // Box 284
		bodyModel[74].setRotationPoint(-24F, -24.5F, 3F);

		bodyModel[75].addBox(0F, 0F, 0F, 11, 10, 0, 0F); // Box 285
		bodyModel[75].setRotationPoint(-19F, -13F, 11.01F);

		bodyModel[76].addBox(0F, 0F, 0F, 43, 8, 0, 0F); // Box 288
		bodyModel[76].setRotationPoint(-4F, -9F, 11F);

		bodyModel[77].addBox(0F, 0F, 0F, 11, 10, 0, 0F); // Box 300
		bodyModel[77].setRotationPoint(-19F, -13F, -11.01F);

		bodyModel[78].addBox(0F, 0F, 0F, 43, 8, 0, 0F); // Box 303
		bodyModel[78].setRotationPoint(-4F, -9F, -11F);

		bodyModel[79].addBox(0F, 0F, 0F, 0, 13, 2, 0F); // Box 296
		bodyModel[79].setRotationPoint(39F, -9F, -11F);

		bodyModel[80].addBox(0F, 0F, 0F, 1, 5, 0, 0F); // Box 305
		bodyModel[80].setRotationPoint(10F, 1F, -9.01F);

		bodyModel[81].addBox(0F, 0F, 0F, 1, 5, 0, 0F); // Box 305
		bodyModel[81].setRotationPoint(10F, 1F, 9.01F);

		bodyModel[82].addBox(0F, 0F, 0F, 1, 3, 18, 0F); // Box 19
		bodyModel[82].setRotationPoint(-11F, 4F, -9F);

		bodyModel[83].addBox(0F, 0F, 0F, 1, 4, 0, 0F); // Box 305
		bodyModel[83].setRotationPoint(-11F, 2F, -9.01F);

		bodyModel[84].addBox(0F, 0F, 0F, 1, 5, 0, 0F); // Box 305
		bodyModel[84].setRotationPoint(-11F, 1F, 9.01F);

		bodyModel[85].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 440
		bodyModel[85].setRotationPoint(-25.5F, 3F, -1F);

		bodyModel[86].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 441
		bodyModel[86].setRotationPoint(23.5F, 3F, -1F);

		bodyModel[87].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 19
		bodyModel[87].setRotationPoint(-4F, 1F, -11.75F);
		bodyModel[87].rotateAngleX = 0.71558499F;

		bodyModel[88].addBox(0F, 0F, -1F, 1, 3, 1, 0F); // Box 19
		bodyModel[88].setRotationPoint(-4F, 1F, 11.75F);
		bodyModel[88].rotateAngleX = -0.71558499F;

		bodyModel[89].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 101
		bodyModel[89].setRotationPoint(-42.5F, -1F, -6.75F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 101
		bodyModel[90].setRotationPoint(42F, -1F, -6.75F);

		bodyModel[91].addBox(0F, 0F, -5F, 1, 2, 5, 0F); // Box 240 glow liveryimg 2
		bodyModel[91].setRotationPoint(37.3F, -19.5F, 6F);
		bodyModel[91].rotateAngleY = 0.15707963F;

		bodyModel[92].addBox(0F, 0F, 0F, 1, 2, 5, 0F); // Box 241 glow liveryimg 2
		bodyModel[92].setRotationPoint(37.3F, -19.5F, -6F);
		bodyModel[92].rotateAngleY = -0.15707963F;

		bodyModel[93].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 247
		bodyModel[93].setRotationPoint(-32F, -24.5F, -2.5F);

		bodyModel[94].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 248
		bodyModel[94].setRotationPoint(-31.5F, -24.5F, -1F);

		bodyModel[95].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 249
		bodyModel[95].setRotationPoint(-30.5F, -23.5F, -2F);

		bodyModel[96].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 250
		bodyModel[96].setRotationPoint(-31F, -24.5F, 0.5F);

		bodyModel[97].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 248
		bodyModel[97].setRotationPoint(-33F, -24F, 3F);

		bodyModel[98].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 250
		bodyModel[98].setRotationPoint(-32.5F, -24F, 4.5F);

		bodyModel[99].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 249
		bodyModel[99].setRotationPoint(-31F, -23F, 3.25F);

		bodyModel[100].addBox(0F, 0F, 0F, 2, 0, 20, 0F); // Box 205
		bodyModel[100].setRotationPoint(-44F, 8F, -10F);

		bodyModel[101].addBox(0F, 0F, 0F, 2, 0, 20, 0F); // Box 205
		bodyModel[101].setRotationPoint(42F, 8F, -10F);

		bodyModel[102].addBox(0F, 0F, 0F, 7, 4, 4, 0F); // Box 36
		bodyModel[102].setRotationPoint(-18F, -9F, -11F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 114
		bodyModel[103].setRotationPoint(-11F, 3F, 9.5F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[104].setRotationPoint(-11F, 2F, 9.5F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 78
		bodyModel[105].setRotationPoint(-10.75F, 3.5F, 9.75F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 78
		bodyModel[106].setRotationPoint(-10.75F, 1F, 7.75F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 2, 7, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 2603
		bodyModel[107].setRotationPoint(-38F, 1F, 7F);

		bodyModel[108].addBox(0F, 0F, 0F, 1, 9, 3, 0F); // Box 261
		bodyModel[108].setRotationPoint(-39F, -1F, 7F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 2, 7, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 263
		bodyModel[109].setRotationPoint(36F, 1F, -11F);

		bodyModel[110].addBox(0F, 0F, 0F, 1, 9, 3, 0F); // Box 264
		bodyModel[110].setRotationPoint(38F, -1F, -10F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 5, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Box 193
		bodyModel[111].setRotationPoint(-42F, 1F, -3F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 190 ditchlight f1
		bodyModel[112].setRotationPoint(-42.25F, -4F, -6.75F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 5, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); // Box 273
		bodyModel[113].setRotationPoint(37F, 1F, -3F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 275 ditchlight f2
		bodyModel[114].setRotationPoint(-42.75F, -1F, -6.75F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 276 ditchlight r1
		bodyModel[115].setRotationPoint(41.75F, -4F, -6.75F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 278 ditchlight r2
		bodyModel[116].setRotationPoint(42.25F, -1F, -6.75F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 186 Headlight Front up
		bodyModel[117].setRotationPoint(-33.25F, -23F, -1F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 187 Headlight Front down
		bodyModel[118].setRotationPoint(-33.25F, -21F, -1F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 247 Headlight Front nose R
		bodyModel[119].setRotationPoint(-39.5F, -13.7F, -2F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 248 Headlight Front nose L
		bodyModel[120].setRotationPoint(-39.5F, -13.7F, 0F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 284 Headlight Rear down
		bodyModel[121].setRotationPoint(38.25F, -17.5F, -1F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 285 Headlight Rear up
		bodyModel[122].setRotationPoint(38.25F, -19.5F, -1F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[123].setRotationPoint(-43F, 2.5F, -2F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 267
		bodyModel[124].setRotationPoint(42F, 2.5F, -2F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 2, 7, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 270434
		bodyModel[125].setRotationPoint(36F, 1F, 7F);

		bodyModel[126].addBox(0F, 0F, 0F, 1, 9, 3, 0F); // Box 271
		bodyModel[126].setRotationPoint(38F, -1F, 7F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 162 commander beacon
		bodyModel[127].setRotationPoint(-22F, -24.8F, -0.5F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0.3F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, 0.3F, -0.5F, 0.1F, 0.3F, 0F, 0.1F, -1F, 0F, 0.1F, -1F, 0F, 0.1F, 0.3F, 0F, 0.1F); // Box 165
		bodyModel[128].setRotationPoint(-21.82F, -23.8F, -0.5F);

		bodyModel[129].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 279
		bodyModel[129].setRotationPoint(-27F, -24.5F, 0F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 280
		bodyModel[130].setRotationPoint(39F, -4F, -11.5F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 281
		bodyModel[131].setRotationPoint(39F, -4F, 10.5F);

		bodyModel[132].addBox(0F, 0F, 0F, 0, 13, 2, 0F); // Box 282
		bodyModel[132].setRotationPoint(39F, -9F, 9F);

		bodyModel[133].addBox(0F, 0F, 0F, 6, 8, 14, 0F); // Box 289
		bodyModel[133].setRotationPoint(-38F, -21F, -7F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 36, 1, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 292
		bodyModel[134].setRotationPoint(-19F, -22F, -7F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 36, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 293
		bodyModel[135].setRotationPoint(-19F, -22F, 3F);

		bodyModel[136].addBox(0F, 0F, 0F, 36, 1, 6, 0F); // Box 294
		bodyModel[136].setRotationPoint(-19F, -22F, -3F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 6, 1, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 295
		bodyModel[137].setRotationPoint(-38F, -22F, -7F);

		bodyModel[138].addBox(0F, 0F, 0F, 6, 1, 6, 0F); // Box 296
		bodyModel[138].setRotationPoint(-38F, -22F, -3F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 6, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 297
		bodyModel[139].setRotationPoint(-38F, -22F, 3F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 298 headlight f hh
		bodyModel[140].setRotationPoint(-39.25F, -19.5F, -1F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 299 headlight f h
		bodyModel[141].setRotationPoint(-39.25F, -17.5F, -1F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 1, 20, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 303
		bodyModel[142].setRotationPoint(-39F, -21F, 1F);

		bodyModel[143].addBox(0F, 0F, 0F, 1, 20, 2, 0F); // Box 304
		bodyModel[143].setRotationPoint(-39F, -21F, -1F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 1, 20, 6, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 305
		bodyModel[144].setRotationPoint(-39F, -21F, -7F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 306
		bodyModel[145].setRotationPoint(-39F, -22F, -1F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,-1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 307
		bodyModel[146].setRotationPoint(-39F, -22F, -7F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 308
		bodyModel[147].setRotationPoint(-39F, -22F, 1F);

		bodyModel[148].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 354
		bodyModel[148].setRotationPoint(-39F, -23.5F, -2F);

		bodyModel[149].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 355
		bodyModel[149].setRotationPoint(-38F, -23.25F, -1F);

		bodyModel[150].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 356
		bodyModel[150].setRotationPoint(-38.5F, -23.25F, -3F);

		bodyModel[151].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 357
		bodyModel[151].setRotationPoint(-36.5F, -22.5F, -2F);

		bodyModel[152].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 286
		bodyModel[152].setRotationPoint(36F, -24.5F, 3.5F);

		bodyModel[153].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 287
		bodyModel[153].setRotationPoint(37.5F, -23.75F, 2.5F);

		bodyModel[154].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 288
		bodyModel[154].setRotationPoint(36.5F, -24.5F, 1.5F);

		bodyModel[155].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 289
		bodyModel[155].setRotationPoint(36F, -24.75F, 2.5F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F); // Box 296
		bodyModel[156].setRotationPoint(-8F, -13F, -11F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F); // Box 297
		bodyModel[157].setRotationPoint(-8F, -13F, 11F);

		bodyModel[158].addBox(0F, 0F, 0F, 6, 12, 14, 0F); // Box 298
		bodyModel[158].setRotationPoint(-38F, -13F, -7F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 6, 1, 2, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 299
		bodyModel[159].setRotationPoint(-38F, -14F, -1F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 6, 1, 6, 0F,0F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 300
		bodyModel[160].setRotationPoint(-38F, -14F, -7F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 6, 1, 6, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 301
		bodyModel[161].setRotationPoint(-38F, -14F, 1F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 1, 12, 6, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 302
		bodyModel[162].setRotationPoint(-39F, -13F, -7F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 1, 12, 6, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 303
		bodyModel[163].setRotationPoint(-39F, -13F, 1F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 1, 12, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 304
		bodyModel[164].setRotationPoint(-39F, -13F, -1F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,-1F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, -0.5F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 305
		bodyModel[165].setRotationPoint(-39F, -14F, -7F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,-0.5F, -1F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 306
		bodyModel[166].setRotationPoint(-39F, -14F, 1F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.65F, -0.25F, -0.25F, 0.2F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.65F, -0.25F, -0.25F, 0.2F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 307 glowey marker
		bodyModel[167].setRotationPoint(-38.9F, -12.7F, -7F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0.2F, -0.25F, -0.25F, -0.65F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0.2F, -0.25F, -0.25F, -0.65F, -0.25F, -0.25F); // Box 308 glowey marker
		bodyModel[168].setRotationPoint(-38.9F, -12.7F, 5F);

		bodyModel[169].addBox(0F, 0F, 0F, 13, 1, 2, 0F); // Box 309
		bodyModel[169].setRotationPoint(-32F, -23F, -1F);

		bodyModel[170].addBox(0F, 0F, 0F, 2, 1, 14, 0F); // Box 310
		bodyModel[170].setRotationPoint(9F, 3F, -7F);

		bodyModel[171].addBox(0F, 0F, 0F, 2, 1, 14, 0F); // Box 311
		bodyModel[171].setRotationPoint(-11F, 3F, -7F);

		bodyModel[172].addBox(-0.5F, 0F, -0.5F, 1, 14, 4, 0F); // Box 52 door swing right
		bodyModel[172].setRotationPoint(-31.5F, -19F, -10.5F);

		bodyModel[173].addBox(-0.5F, 0F, -3.5F, 1, 14, 4, 0F); // Box 314 door swing right
		bodyModel[173].setRotationPoint(-19.5F, -19F, 10.5F);

		bodyModel[174].addBox(0F, 0F, 0F, 4, 1, 22, 0F); // Box 318
		bodyModel[174].setRotationPoint(22.5F, 1F, -11F);

		bodyModel[175].addBox(0F, 0F, 0F, 4, 1, 3, 0F); // Box 319
		bodyModel[175].setRotationPoint(-26.5F, 1F, 8F);

		bodyModel[176].addBox(0F, 0F, 0F, 0, 1, 22, 0F); // Box 320
		bodyModel[176].setRotationPoint(42.01F, 7F, -11F);

		bodyModel[177].addBox(0F, 0F, 0F, 0, 1, 22, 0F); // Box 321
		bodyModel[177].setRotationPoint(-42.01F, 7F, -11F);

		bodyModel[178].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0.2F, -0.25F, -0.25F, -0.65F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0.2F, -0.25F, -0.25F, -0.65F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 339 glowey marker
		bodyModel[178].setRotationPoint(38F, -15.7F, -7F);

		bodyModel[179].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.65F, -0.25F, -0.25F, 0.2F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.65F, -0.25F, -0.25F, 0.2F, -0.25F, -0.25F); // Box 340 glowey marker
		bodyModel[179].setRotationPoint(38F, -15.7F, 5F);

		bodyModel[180].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 402
		bodyModel[180].setRotationPoint(-37.5F, -14F, -1F);

		bodyModel[181].addBox(0F, 0F, 0F, 5, 1, 1, 0F); // Box 253
		bodyModel[181].setRotationPoint(-31F, 1F, 9F);
		bodyModel[181].rotateAngleZ = -0.27925268F;

		bodyModel[182].addBox(0F, 0F, 0F, 5, 1, 1, 0F); // Box 280
		bodyModel[182].setRotationPoint(-36F, 1F, 9F);

		bodyModel[183].addBox(0F, 0F, 0F, 21, 19, 1, 0F); // Box 283
		bodyModel[183].setRotationPoint(17F, -20F, -7.5F);

		bodyModel[184].addBox(0F, 0F, 0F, 21, 19, 1, 0F); // Box 284
		bodyModel[184].setRotationPoint(17F, -20F, 6.5F);

		bodyModel[185].addBox(0F, 0F, -5F, 1, 2, 5, 0F); // Box 287 glow liveryimg 2
		bodyModel[185].setRotationPoint(-38.5F, -17.5F, 6F);
		bodyModel[185].rotateAngleY = -0.15707963F;

		bodyModel[186].addBox(0F, 0F, 0F, 1, 2, 5, 0F); // Box 288 glow liveryimg 2
		bodyModel[186].setRotationPoint(-38.5F, -17.5F, -6F);
		bodyModel[186].rotateAngleY = 0.15707963F;

		bodyModel[187].addShapeBox(0F, 0F, 0F, 0, 8, 1, 0F,0F, -2.5F, 2F, 0F, -2.5F, 2F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 298
		bodyModel[187].setRotationPoint(-42.01F, -9F, -10F);
		bodyModel[187].rotateAngleY = -3.14159265F;

		bodyModel[188].addShapeBox(0F, 0F, 0F, 0, 8, 1, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, -2.5F, 2F, 0F, -2.5F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 299
		bodyModel[188].setRotationPoint(-42.01F, -9F, 11F);
		bodyModel[188].rotateAngleY = -3.14159265F;

		bodyModel[189].addShapeBox(0F, 0F, 0F, 0, 8, 1, 0F,0F, -2.5F, 2F, 0F, -2.5F, 2F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 300
		bodyModel[189].setRotationPoint(42.01F, -9F, -10F);
		bodyModel[189].rotateAngleY = -3.14159265F;

		bodyModel[190].addShapeBox(0F, 0F, 0F, 0, 8, 1, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, -2.5F, 2F, 0F, -2.5F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 301
		bodyModel[190].setRotationPoint(42.01F, -9F, 11F);
		bodyModel[190].rotateAngleY = -3.14159265F;

		bodyModel[191].addBox(0F, 0F, 0F, 3, 2, 0, 0F); // Box 411
		bodyModel[191].setRotationPoint(-42F, 6F, -8F);

		bodyModel[192].addBox(0F, 0F, 0F, 3, 2, 0, 0F); // Box 412
		bodyModel[192].setRotationPoint(-42F, 6F, 8F);

		bodyModel[193].addBox(0F, 0F, 0F, 3, 2, 0, 0F); // Box 413
		bodyModel[193].setRotationPoint(39F, 6F, 8F);

		bodyModel[194].addBox(0F, 0F, 0F, 3, 2, 0, 0F); // Box 414
		bodyModel[194].setRotationPoint(39F, 6F, -8F);

		bodyModel[195].addBox(0F, 0F, 0F, 4, 2, 6, 0F); // Box 417 atsf bit
		bodyModel[195].setRotationPoint(-29F, -24F, -3F);

		bodyModel[196].addBox(0F, 0F, 0F, 5, 2, 4, 0F); // Box 418 atsf bit
		bodyModel[196].setRotationPoint(-24.25F, -24F, -3F);

		bodyModel[197].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 419 cull atsf bit
		bodyModel[197].setRotationPoint(-23F, -24F, 3.5F);

		bodyModel[198].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 364 prime base
		bodyModel[198].setRotationPoint(-30F, -23.5F, -8F);

		bodyModel[199].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F); // Box 6 PRIME1-1
		bodyModel[199].setRotationPoint(-30F, -24.5F, -8F);

		bodyModel[200].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F); // Box 7 PRIME1-3
		bodyModel[200].setRotationPoint(-30F, -24.5F, -8F);

		bodyModel[201].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 8 PRIME1-2
		bodyModel[201].setRotationPoint(-30F, -24.5F, -8F);

		bodyModel[202].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 9 PRIME1-4
		bodyModel[202].setRotationPoint(-30F, -24.5F, -8F);

		bodyModel[203].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 425
		bodyModel[203].setRotationPoint(-23F, -25F, 5F);

		bodyModel[204].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 426 cull atsf bit
		bodyModel[204].setRotationPoint(-30F, -22.5F, -8.5F);

		bodyModel[205].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 427
		bodyModel[205].setRotationPoint(-33F, -25F, -1.5F);

		bodyModel[206].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 428
		bodyModel[206].setRotationPoint(-32F, -25F, -0.5F);

		bodyModel[207].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 429
		bodyModel[207].setRotationPoint(-33F, -25F, 0.5F);

		bodyModel[208].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 430
		bodyModel[208].setRotationPoint(-31.5F, -24F, -0.5F);

		bodyModel[209].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 364 prime base
		bodyModel[209].setRotationPoint(-37F, -23F, -1F);

		bodyModel[210].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F); // Box 6 PRIME2-1
		bodyModel[210].setRotationPoint(-37F, -23.5F, -1F);

		bodyModel[211].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F); // Box 7 PRIME2-3
		bodyModel[211].setRotationPoint(-37F, -23.5F, -1F);

		bodyModel[212].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 8 PRIME2-2
		bodyModel[212].setRotationPoint(-37F, -23.5F, -1F);

		bodyModel[213].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 9 PRIME2-4
		bodyModel[213].setRotationPoint(-37F, -23.5F, -1F);

		bodyModel[214].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 440
		bodyModel[214].setRotationPoint(42F, -1F, 4.75F);

		bodyModel[215].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 441 ditchlight r2
		bodyModel[215].setRotationPoint(42.25F, -1F, 4.75F);

		bodyModel[216].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 442
		bodyModel[216].setRotationPoint(41F, -4F, 4.75F);

		bodyModel[217].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 443 ditchlight r1
		bodyModel[217].setRotationPoint(41.75F, -4F, 4.75F);

		bodyModel[218].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 444
		bodyModel[218].setRotationPoint(-42.5F, -1F, 4.75F);

		bodyModel[219].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 445 ditchlight f2
		bodyModel[219].setRotationPoint(-42.75F, -1F, 4.75F);

		bodyModel[220].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 446 ditchlight f1
		bodyModel[220].setRotationPoint(-42.25F, -4F, 4.75F);

		bodyModel[221].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 447
		bodyModel[221].setRotationPoint(-42F, -4F, 4.75F);

		bodyModel[222].addBox(0F, 0F, 0F, 3, 0, 3, 0F); // Box 448
		bodyModel[222].setRotationPoint(39F, 8F, -11F);

		bodyModel[223].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 450
		bodyModel[223].setRotationPoint(39F, 2F, -9F);

		bodyModel[224].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 451
		bodyModel[224].setRotationPoint(39F, -1F, -8F);

		bodyModel[225].addBox(0F, 0F, 0F, 3, 0, 3, 0F); // Box 452
		bodyModel[225].setRotationPoint(39F, 8F, 8F);

		bodyModel[226].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 454
		bodyModel[226].setRotationPoint(39F, 2F, 7F);

		bodyModel[227].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 455
		bodyModel[227].setRotationPoint(39F, -1F, 7F);

		bodyModel[228].addBox(0F, 0F, 0F, 2, 1, 22, 0F); // Box 322
		bodyModel[228].setRotationPoint(23.5F, 2F, -11F);

		bodyModel[229].addBox(0F, 0F, 0F, 2, 1, 22, 0F); // Box 323
		bodyModel[229].setRotationPoint(-25.5F, 2F, -11F);

		bodyModel[230].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 324
		bodyModel[230].setRotationPoint(-33F, -24F, -1.5F);

		bodyModel[231].addShapeBox(0F, -1F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 334 commander beacon
		bodyModel[231].setRotationPoint(-30F, -23F, 7.5F);

		bodyModel[232].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 335
		bodyModel[232].setRotationPoint(-30F, -23F, 7.5F);

		bodyModel[233].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 329 support cull
		bodyModel[233].setRotationPoint(-30.5F, -22F, -9F);

		bodyModel[234].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 330
		bodyModel[234].setRotationPoint(-30.5F, -22F, 7F);

		bodyModel[235].addShapeBox(0F, -1F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 334 commander beacon
		bodyModel[235].setRotationPoint(-30F, -23F, -8.5F);

		bodyModel[236].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 335
		bodyModel[236].setRotationPoint(-30F, -23F, -8.5F);

		bodyModel[237].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 333
		bodyModel[237].setRotationPoint(-18F, -23.5F, 3.5F);

		bodyModel[238].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 334
		bodyModel[238].setRotationPoint(-16.5F, -23F, 4.5F);

		bodyModel[239].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 335
		bodyModel[239].setRotationPoint(-17F, -24F, 4.5F);

		bodyModel[240].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 336
		bodyModel[240].setRotationPoint(-18F, -23.5F, 5.5F);

		bodyModel[241].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 337
		bodyModel[241].setRotationPoint(-18F, -24F, -1.5F);

		bodyModel[242].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 418
		bodyModel[242].setRotationPoint(4.5F, -22.5F, -6.5F);

		bodyModel[243].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 419
		bodyModel[243].setRotationPoint(3F, -23.25F, -5.5F);

		bodyModel[244].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 420
		bodyModel[244].setRotationPoint(2F, -23.5F, -6.5F);

		bodyModel[245].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 421
		bodyModel[245].setRotationPoint(3.5F, -23.25F, -7.5F);

		bodyModel[246].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F); // Box 6 PRIME3-1
		bodyModel[246].setRotationPoint(-29F, -23.5F, 7.5F);

		bodyModel[247].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F); // Box 7 PRIME3-3
		bodyModel[247].setRotationPoint(-29F, -23.5F, 7.5F);

		bodyModel[248].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 8 PRIME3-2
		bodyModel[248].setRotationPoint(-29F, -23.5F, 7.5F);

		bodyModel[249].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 9 PRIME3-4
		bodyModel[249].setRotationPoint(-29F, -23.5F, 7.5F);

		bodyModel[250].addShapeBox(0F, 0F, 0F, 3, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 426 cull
		bodyModel[250].setRotationPoint(-29.5F, -22F, 7F);

		bodyModel[251].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 428
		bodyModel[251].setRotationPoint(-29F, -23F, 7.5F);

		bodyModel[252].addBox(0F, 0F, 0F, 4, 9, 2, 0F); // Box 412 cs
		bodyModel[252].setRotationPoint(-26F, -14F, -6F);

		bodyModel[253].addBox(0F, 0F, 0F, 7, 7, 3, 0F); // Box 413 cs
		bodyModel[253].setRotationPoint(-32.1F, -12F, -2F);
		bodyModel[253].rotateAngleY = -0.82030475F;

		bodyModel[254].addShapeBox(-1F, 0F, -0.5F, 11, 4, 2, 0F,0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -2F, 0F, -5F, -2F, 0F, -5F, -2F, 0F, 0F, -2F, 0F); // Box 86
		bodyModel[254].setRotationPoint(-30.5F, -14F, -2F);
		bodyModel[254].rotateAngleY = -0.82030475F;

		bodyModel[255].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 352
		bodyModel[255].setRotationPoint(39.5F, -22F, -0.5F);

		bodyModel[256].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 353
		bodyModel[256].setRotationPoint(39.75F, -21.5F, -0.25F);

		bodyModel[257].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 354
		bodyModel[257].setRotationPoint(39.5F, -23F, -0.5F);

		bodyModel[258].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 877
		bodyModel[258].setRotationPoint(39.75F, -24F, -1.5F);

		bodyModel[259].addShapeBox(0F, 0F, 0F, 2, 3, 0, 0F,-1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 332
		bodyModel[259].setRotationPoint(37.5F, -23.5F, -1F);

		bodyModel[260].addShapeBox(0F, 0F, 0F, 2, 3, 0, 0F,-1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 333
		bodyModel[260].setRotationPoint(37.5F, -23.5F, 1F);

		bodyModel[261].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 413
		bodyModel[261].setRotationPoint(-23F, -24F, 0F);

		bodyModel[262].addBox(0F, 0F, 0F, 21, 2, 16, 0F); // Box 298
		bodyModel[262].setRotationPoint(17F, -22F, -8F);

		bodyModel[263].addShapeBox(0F, 0F, 0F, 21, 1, 7, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 369
		bodyModel[263].setRotationPoint(17F, -23F, 1F);

		bodyModel[264].addShapeBox(0F, 0F, 0F, 21, 1, 7, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 370
		bodyModel[264].setRotationPoint(17F, -23F, -8F);

		bodyModel[265].addShapeBox(0F, 0F, 0F, 20, 1, 2, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 371
		bodyModel[265].setRotationPoint(17F, -23F, -1F);

		bodyModel[266].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 277
		bodyModel[266].setRotationPoint(37F, -23F, -1F);

		bodyModel[267].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, -0.5F, -0.5F, -1F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 278
		bodyModel[267].setRotationPoint(38F, -23F, -8F);

		bodyModel[268].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, 0.5F, 0F, 0F, 0F, 0F, -1F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 279
		bodyModel[268].setRotationPoint(38F, -23F, 1F);

		bodyModel[269].addShapeBox(-1F, 0F, -1F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 291
		bodyModel[269].setRotationPoint(38F, -23.25F, 0F);

		bodyModel[270].addBox(0F, 0F, 0F, 2, 1, 5, 0F); // Box 18
		bodyModel[270].setRotationPoint(11.5F, -23.5F, -2.5F);

		bodyModel[271].addBox(0F, 0F, 0F, 3, 1, 6, 0F); // Box 21
		bodyModel[271].setRotationPoint(11F, -22.5F, -3F);

		bodyModel[272].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 688
		bodyModel[272].setRotationPoint(-36F, -5F, -11F);

		bodyModel[273].addBox(0F, 0F, 0F, 1, 2, 3, 0F); // Box 37
		bodyModel[273].setRotationPoint(-10F, -3F, -10F);

		bodyModel[274].addBox(0F, 0F, 0F, 1, 2, 3, 0F); // Box 38
		bodyModel[274].setRotationPoint(-10F, -3F, 7F);

		bodyModel[275].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 557
		bodyModel[275].setRotationPoint(-10F, -5F, -11F);

		bodyModel[276].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 558
		bodyModel[276].setRotationPoint(-10F, -5F, 10F);

		bodyModel[277].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0.2F, -0.25F, -0.25F, -0.65F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0.2F, -0.25F, -0.25F, -0.65F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 339 glowey marker
		bodyModel[277].setRotationPoint(38F, -21.7F, -7.5F);

		bodyModel[278].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.65F, -0.25F, -0.25F, 0.2F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.65F, -0.25F, -0.25F, 0.2F, -0.25F, -0.25F); // Box 340 glowey marker
		bodyModel[278].setRotationPoint(38F, -21.7F, 5.5F);

		bodyModel[279].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 288
		bodyModel[279].setRotationPoint(38.75F, -21.75F, -2F);

		bodyModel[280].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 289 gyralight rear l
		bodyModel[280].setRotationPoint(39.5F, -21.7F, -2F);

		bodyModel[281].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 290gyralight rear r
		bodyModel[281].setRotationPoint(39.5F, -21.7F, 0F);

		bodyModel[282].addShapeBox(0F, 0F, 0F, 1, 0, 5, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 324
		bodyModel[282].setRotationPoint(42F, -1F, -7F);

		bodyModel[283].addBox(0F, 0F, 0F, 1, 9, 0, 0F); // Box 325
		bodyModel[283].setRotationPoint(42F, -9F, -2F);

		bodyModel[284].addBox(0F, 0F, 0F, 1, 9, 0, 0F); // Box 326
		bodyModel[284].setRotationPoint(42F, -9F, 2F);

		bodyModel[285].addShapeBox(0F, 0F, 0F, 1, 0, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 327
		bodyModel[285].setRotationPoint(42F, -1F, 2F);

		bodyModel[286].addBox(-4F, 0F, 0F, 4, 1, 4, 0F); // Box 328 cull crossover
		bodyModel[286].setRotationPoint(42F, -1F, 2F);
		bodyModel[286].rotateAngleY = -3.14159265F;
		bodyModel[286].rotateAngleZ = -1.48352986F;

		bodyModel[287].addBox(-4F, 0F, 0F, 4, 1, 4, 0F); // Box 339 cull crossover
		bodyModel[287].setRotationPoint(-42F, -1F, -2F);
		bodyModel[287].rotateAngleZ = -1.48352986F;

		bodyModel[288].addBox(0F, 0F, 0F, 1, 9, 0, 0F); // Box 300
		bodyModel[288].setRotationPoint(-43F, -9F, -2F);

		bodyModel[289].addBox(0F, 0F, 0F, 1, 9, 0, 0F); // Box 301
		bodyModel[289].setRotationPoint(-43F, -9F, 2F);

		bodyModel[290].addShapeBox(0F, 0F, 0F, 1, 0, 5, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 302
		bodyModel[290].setRotationPoint(-43F, -1F, -7F);

		bodyModel[291].addShapeBox(0F, 0F, 0F, 1, 0, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 303
		bodyModel[291].setRotationPoint(-43F, -1F, 2F);

		bodyModel[292].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 0F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F); // Box 316
		bodyModel[292].setRotationPoint(-37F, -13.75F, 6F);

		bodyModel[293].addShapeBox(0F, 0F, 0F, 0, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 317
		bodyModel[293].setRotationPoint(-37F, -13.75F, -6F);

		bodyModel[294].addShapeBox(0F, 0F, 0F, 0, 1, 3, 0F,0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 318
		bodyModel[294].setRotationPoint(-37F, -13.75F, 3F);

		bodyModel[295].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F); // Box 319
		bodyModel[295].setRotationPoint(-37F, -13.75F, -6F);

		bodyModel[296].addBox(0F, 0F, 0F, 4, 4, 0, 0F); // Box 276
		bodyModel[296].setRotationPoint(-37F, -12.5F, 7.5F);

		bodyModel[297].addShapeBox(0F, 0F, 0F, 9, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 123
		bodyModel[297].setRotationPoint(-30F, -19F, -11F);
		bodyModel[297].rotateAngleX = -0.61086524F;

		bodyModel[298].addBox(0F, 0F, -1F, 0, 4, 1, 0F); // Box 350
		bodyModel[298].setRotationPoint(-28F, -17F, -11F);

		bodyModel[299].addBox(0F, 0F, 0F, 0, 4, 1, 0F); // Box 321
		bodyModel[299].setRotationPoint(-28.01F, -17F, 11F);

		bodyModel[300].addShapeBox(0F, 0F, 0F, 5, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F); // Box 3 cull aww
		bodyModel[300].setRotationPoint(-28F, -17F, 10F);

		bodyModel[301].addShapeBox(0F, 0F, 0F, 5, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 5
		bodyModel[301].setRotationPoint(-28F, -18F, 10F);

		bodyModel[302].addShapeBox(0F, 0F, 0F, 9, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 311
		bodyModel[302].setRotationPoint(-30F, -19F, 11F);
		bodyModel[302].rotateAngleX = 0.61086524F;

		bodyModel[303].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,-1F, 0F, 0F, 0.5F, 0F, 0F, 3F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, -1F, -2.5F, 0F, -1F); // Box 282
		bodyModel[303].setRotationPoint(-46F, 7F, 0F);

		bodyModel[304].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,-3.5F, 0F, 0F, 3F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -2.5F, 0F, -1F, 2F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 283
		bodyModel[304].setRotationPoint(-46F, 7F, -10F);

		bodyModel[305].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F); // Box 4
		bodyModel[305].setRotationPoint(-45F, 6F, 0F);

		bodyModel[306].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F); // Box 448
		bodyModel[306].setRotationPoint(-45F, 5F, 2F);

		bodyModel[307].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,-2.5F, 0F, 0F, 2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 322
		bodyModel[307].setRotationPoint(-45F, 6F, -10F);

		bodyModel[308].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,-2.5F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 323
		bodyModel[308].setRotationPoint(-45F, 5F, -10F);

		bodyModel[309].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0.5F, 0F, 0F, -1F, 0F, 0F, 1F, 1F, 0F, -1.5F, 1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F); // Box 280
		bodyModel[309].setRotationPoint(-45F, 4F, 2F);

		bodyModel[310].addShapeBox(0F, 0F, -2F, 1, 1, 8, 0F,-1.5F, 1F, 0F, 1F, 1F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 285
		bodyModel[310].setRotationPoint(-45F, 4F, -8F);

		bodyModel[311].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F); // Box 727
		bodyModel[311].setRotationPoint(44F, 6F, 0F);

		bodyModel[312].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,2F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 728
		bodyModel[312].setRotationPoint(44F, 6F, -10F);

		bodyModel[313].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,3F, 0F, 0F, -3.5F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 2F, 0F, -1F, -2.5F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 729
		bodyModel[313].setRotationPoint(45F, 7F, -10F);

		bodyModel[314].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,0.5F, 0F, 0F, -1F, 0F, 0F, -3.5F, 0F, 0F, 3F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, -1F, 2F, 0F, -1F); // Box 730
		bodyModel[314].setRotationPoint(45F, 7F, 0F);

		bodyModel[315].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F); // Box 731
		bodyModel[315].setRotationPoint(44F, 5F, 2F);

		bodyModel[316].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,-1F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 1F, 0F, 1F, 1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F); // Box 732
		bodyModel[316].setRotationPoint(44F, 4F, 2F);

		bodyModel[317].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,2F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 733
		bodyModel[317].setRotationPoint(44F, 5F, -10F);

		bodyModel[318].addShapeBox(0F, 0F, -2F, 1, 1, 8, 0F,1F, 1F, 0F, -1.5F, 1F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 734
		bodyModel[318].setRotationPoint(44F, 4F, -8F);

		bodyModel[319].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 114
		bodyModel[319].setRotationPoint(-18F, -19.25F, -9F);

		bodyModel[320].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[320].setRotationPoint(-18F, -20.25F, -9F);

		bodyModel[321].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 78
		bodyModel[321].setRotationPoint(-17.75F, -18.75F, -8.75F);

		bodyModel[322].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F); // Box 245
		bodyModel[322].setRotationPoint(-18F, -21.25F, -8.8F);

		bodyModel[323].addBox(0F, 0F, 0F, 6, 2, 1, 0F); // Box 373
		bodyModel[323].setRotationPoint(-18.5F, -20F, -7.25F);

		bodyModel[324].addBox(0F, 0F, 0F, 2, 4, 1, 0F); // Box 374
		bodyModel[324].setRotationPoint(-18.5F, -17.5F, -7.25F);

		bodyModel[325].addBox(0F, 0F, 0F, 4, 4, 1, 0F); // Box 375
		bodyModel[325].setRotationPoint(-16F, -17.5F, -7.25F);

		bodyModel[326].addBox(0F, 0F, 0F, 4, 4, 1, 0F); // Box 376
		bodyModel[326].setRotationPoint(-18.5F, -17.5F, 6.25F);

		bodyModel[327].addBox(0F, 0F, 0F, 2, 4, 1, 0F); // Box 377
		bodyModel[327].setRotationPoint(-14F, -17.5F, 6.25F);

		bodyModel[328].addBox(0F, 0F, 0F, 6, 2, 1, 0F); // Box 378
		bodyModel[328].setRotationPoint(-18.5F, -20F, 6.25F);

		bodyModel[329].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 745
		bodyModel[329].setRotationPoint(-13.5F, -23F, -0.5F);

		bodyModel[330].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 746
		bodyModel[330].setRotationPoint(-16F, -24F, -0.5F);

		bodyModel[331].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 747
		bodyModel[331].setRotationPoint(-15F, -23.75F, 0.5F);

		bodyModel[332].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 748
		bodyModel[332].setRotationPoint(-14.5F, -23.75F, -1.5F);

		bodyModel[333].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F); // Box 6 PRIME4-1
		bodyModel[333].setRotationPoint(-24F, -24.5F, -1F);

		bodyModel[334].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F); // Box 7 PRIME4-3
		bodyModel[334].setRotationPoint(-24F, -24.5F, -1F);

		bodyModel[335].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 8 PRIME4-2
		bodyModel[335].setRotationPoint(-24F, -24.5F, -1F);

		bodyModel[336].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 9 PRIME4-4
		bodyModel[336].setRotationPoint(-24F, -24.5F, -1F);

		bodyModel[337].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 428
		bodyModel[337].setRotationPoint(-24F, -24F, -1F);

		bodyModel[338].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 201
		bodyModel[338].setRotationPoint(-42F, 5F, 8F);

		bodyModel[339].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 202
		bodyModel[339].setRotationPoint(-42F, 5F, -10F);

		bodyModel[340].addBox(0F, 0F, 0F, 3, 1, 0, 0F); // Box 431
		bodyModel[340].setRotationPoint(-42F, 1F, -7F);

		bodyModel[341].addBox(0F, 0F, 0F, 3, 1, 0, 0F); // Box 432
		bodyModel[341].setRotationPoint(-42F, 1F, 7F);

		bodyModel[342].addBox(0F, 0F, 0F, 3, 1, 0, 0F); // Box 433
		bodyModel[342].setRotationPoint(39F, 1F, 7F);

		bodyModel[343].addBox(0F, 0F, 0F, 3, 1, 0, 0F); // Box 434
		bodyModel[343].setRotationPoint(39F, 1F, -7F);

		bodyModel[344].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 449
		bodyModel[344].setRotationPoint(39F, 5F, -10F);

		bodyModel[345].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 453
		bodyModel[345].setRotationPoint(39F, 5F, 8F);

		bodyModel[346].addBox(0F, 0F, 0F, 3, 1, 0, 0F); // Box 292
		bodyModel[346].setRotationPoint(39F, 4F, 8F);

		bodyModel[347].addBox(0F, 0F, 0F, 3, 1, 0, 0F); // Box 293
		bodyModel[347].setRotationPoint(-42F, 4F, 8F);

		bodyModel[348].addBox(0F, 0F, 0F, 3, 1, 0, 0F); // Box 294
		bodyModel[348].setRotationPoint(-42F, 4F, -8F);

		bodyModel[349].addBox(0F, 0F, 0F, 3, 1, 0, 0F); // Box 295
		bodyModel[349].setRotationPoint(39F, 4F, -8F);

		bodyModel[350].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 206
		bodyModel[350].setRotationPoint(-39F, 3F, 10F);

		bodyModel[351].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 207
		bodyModel[351].setRotationPoint(-39F, 3F, -11F);

		bodyModel[352].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 217
		bodyModel[352].setRotationPoint(38F, 3F, 10F);

		bodyModel[353].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 221
		bodyModel[353].setRotationPoint(38F, 3F, -11F);

		bodyModel[354].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 19
		bodyModel[354].setRotationPoint(-12F, 5F, -9F);

		bodyModel[355].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 548
		bodyModel[355].setRotationPoint(-10F, 5F, -9F);

		bodyModel[356].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 19
		bodyModel[356].setRotationPoint(9F, 5F, -9F);

		bodyModel[357].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 548
		bodyModel[357].setRotationPoint(11F, 5F, -9F);

		bodyModel[358].addBox(0F, 0F, 0F, 10, 7, 1, 0F); // Box 293
		bodyModel[358].setRotationPoint(26F, -15F, 6.75F);

		bodyModel[359].addBox(0F, 0F, 0F, 10, 7, 1, 0F); // Box 293
		bodyModel[359].setRotationPoint(26F, -15F, -7.75F);

		bodyModel[360].addBox(0F, 0F, 0F, 2, 7, 1, 0F); // Box 293
		bodyModel[360].setRotationPoint(23.5F, -15F, -7.75F);

		bodyModel[361].addBox(0F, 0F, 0F, 2, 7, 1, 0F); // Box 293
		bodyModel[361].setRotationPoint(21F, -15F, -7.75F);

		bodyModel[362].addBox(0F, 0F, 0F, 3, 6, 1, 0F); // Box 293
		bodyModel[362].setRotationPoint(17.5F, -8F, -7.75F);

		bodyModel[363].addBox(0F, 0F, 0F, 2, 7, 1, 0F); // Box 293
		bodyModel[363].setRotationPoint(23.5F, -15F, 6.75F);

		bodyModel[364].addBox(0F, 0F, 0F, 2, 7, 1, 0F); // Box 293
		bodyModel[364].setRotationPoint(21F, -15F, 6.75F);

		bodyModel[365].addBox(0F, 0F, 0F, 3, 6, 1, 0F); // Box 293
		bodyModel[365].setRotationPoint(17.5F, -8F, 6.75F);

		bodyModel[366].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.65F, -0.25F, -0.25F, 0.2F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.65F, -0.25F, -0.25F, 0.2F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 307 glowey marker
		bodyModel[366].setRotationPoint(-38.9F, -19.7F, -7F);

		bodyModel[367].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0.2F, -0.25F, -0.25F, -0.65F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0.2F, -0.25F, -0.25F, -0.65F, -0.25F, -0.25F); // Box 308 glowey marker
		bodyModel[367].setRotationPoint(-38.9F, -19.7F, 5F);

		bodyModel[368].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 785
		bodyModel[368].setRotationPoint(-17F, -23F, 0F);

		bodyModel[369].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 786
		bodyModel[369].setRotationPoint(-15.5F, -22.5F, -4.5F);

		bodyModel[370].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 787
		bodyModel[370].setRotationPoint(-16F, -23.25F, -3.5F);

		bodyModel[371].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 788
		bodyModel[371].setRotationPoint(-18F, -23.5F, -4.5F);

		bodyModel[372].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 789
		bodyModel[372].setRotationPoint(-17F, -23.25F, -5.5F);

		bodyModel[373].addBox(0F, 0F, 0F, 4, 4, 4, 0F); // Box 790
		bodyModel[373].setRotationPoint(-18F, -9F, -11F);

		bodyModel[374].addBox(0F, 0F, 0F, 2, 2, 3, 0F); // Box 791
		bodyModel[374].setRotationPoint(-14F, -7F, -11F);

		bodyModel[375].addBox(0F, 0F, 0F, 6, 8, 0, 0F); // Box 410
		bodyModel[375].setRotationPoint(-38F, -13F, 11F);

		bodyModel[376].addBox(0F, 0F, 0F, 1, 17, 0, 0F); // Box 310
		bodyModel[376].setRotationPoint(-39F, -13F, 11F);

		bodyModel[377].addBox(0F, 0F, 0F, 0, 12, 2, 0F); // Box 81
		bodyModel[377].setRotationPoint(-39.01F, -8F, -11F);

		bodyModel[378].addShapeBox(0F, 0F, 0F, 0, 4, 1, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 81
		bodyModel[378].setRotationPoint(-39.01F, -5F, -11.5F);

		bodyModel[379].addShapeBox(0F, 0F, 0F, 0, 4, 1, 0F,0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 275
		bodyModel[379].setRotationPoint(-39F, -12F, -9.5F);

		bodyModel[380].addBox(0F, 0F, 0F, 7, 8, 0, 0F); // Box 250
		bodyModel[380].setRotationPoint(-39F, -13F, -11F);

		bodyModel[381].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 276
		bodyModel[381].setRotationPoint(-39F, -13F, -11F);

		bodyModel[382].addBox(0F, 0F, 0F, 3, 6, 1, 0F); // Box 293
		bodyModel[382].setRotationPoint(17.5F, -19F, -7.75F);

		bodyModel[383].addBox(0F, 0F, 0F, 3, 6, 1, 0F); // Box 293
		bodyModel[383].setRotationPoint(17.5F, -19F, 6.75F);

		bodyModel[384].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 402
		bodyModel[384].setRotationPoint(-38.75F, -22.5F, -1F);

		bodyModel[385].addShapeBox(0F, 0F, 0F, 2, 6, 14, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 106
		bodyModel[385].setRotationPoint(-22F, -22F, -7F);

		bodyModel[386].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, -0.2F); // Box 401
		bodyModel[386].setRotationPoint(-32F, -25F, -0.5F);

		bodyModel[387].addBox(0F, 0F, 0F, 0, 2, 1, 0F); // Box 402
		bodyModel[387].setRotationPoint(-31F, -25F, -0.5F);
	}
	ModelTypeB theTrucks1 = new ModelTypeB();
	ModelFB2 theTrucks2 = new ModelFB2();
	ModelBapBlombergB theTrucks3 = new ModelBapBlombergB();

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		for (int i = 0; i < 388; i++) {
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
		if (entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor() == 14||entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor() == 7) {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/fb2_Black.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.52, 0.335, 0);
			theTrucks2.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(3.05, 0, 0);
			theTrucks2.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else if (entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor() == 11||entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor() == 16){
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/typeb_LightGrey.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.52, 0.335, 0);
			theTrucks1.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(3.05, 0, 0);
			theTrucks1.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else if (entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor() == 5){
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/blombergB_Black.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.52, 0.17, 0);
			theTrucks3.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(3.05, 0, 0);
			theTrucks3.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else if (entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor() == 6){
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/fb2_Grey.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.52, 0.335, 0);
			theTrucks2.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(3.05, 0, 0);
			theTrucks2.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/typeb_Black.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.52, 0.335, 0);
			theTrucks1.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(3.05, 0, 0);
			theTrucks1.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		}
	}
	public ArrayList<double[]> getSmokePosition() {
		return new ArrayList<double[]>() {
			{
				add(new double[]{0.9D, 1.45D, 0.0D});
			}
		};
	}
	public float[] getTrans() { return new float[]{-1.7F, 0.155F, 0F}; }

	public float[] getRotate() {
		return new float[] { 0F, 180F, 180F };
	}

	public float[] getScale() {
		return null;
	}
}