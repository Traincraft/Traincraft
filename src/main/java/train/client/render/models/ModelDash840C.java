//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2021 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 25.03.2021 - 23:15:38
// Last changed on: 25.03.2021 - 23:15:38
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

public class ModelDash840C extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelDash840C() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[308];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 24, 295, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 429, 175, textureX, textureY); // Box 2
		bodyModel[2] = new ModelRendererTurbo(this, 220, 125, textureX, textureY); // Box 3
		bodyModel[3] = new ModelRendererTurbo(this, 112, 164, textureX, textureY); // Box 8
		bodyModel[4] = new ModelRendererTurbo(this, 394, 270, textureX, textureY); // Box 10
		bodyModel[5] = new ModelRendererTurbo(this, 112, 167, textureX, textureY); // Box 63
		bodyModel[6] = new ModelRendererTurbo(this, 146, 203, textureX, textureY); // Box 156
		bodyModel[7] = new ModelRendererTurbo(this, 442, 197, textureX, textureY); // Box 157
		bodyModel[8] = new ModelRendererTurbo(this, 442, 206, textureX, textureY); // Box 158
		bodyModel[9] = new ModelRendererTurbo(this, 118, 196, textureX, textureY); // Box 197
		bodyModel[10] = new ModelRendererTurbo(this, 130, 196, textureX, textureY); // Box 199
		bodyModel[11] = new ModelRendererTurbo(this, 119, 190, textureX, textureY); // Box 200
		bodyModel[12] = new ModelRendererTurbo(this, 119, 190, textureX, textureY); // Box 201
		bodyModel[13] = new ModelRendererTurbo(this, 138, 190, textureX, textureY); // Box 202
		bodyModel[14] = new ModelRendererTurbo(this, 130, 198, textureX, textureY); // Box 203
		bodyModel[15] = new ModelRendererTurbo(this, 138, 190, textureX, textureY); // Box 204
		bodyModel[16] = new ModelRendererTurbo(this, 137, 196, textureX, textureY); // Box 205
		bodyModel[17] = new ModelRendererTurbo(this, 310, 158, textureX, textureY); // Box 215
		bodyModel[18] = new ModelRendererTurbo(this, 217, 144, textureX, textureY); // Box 61
		bodyModel[19] = new ModelRendererTurbo(this, 261, 144, textureX, textureY); // Box 63
		bodyModel[20] = new ModelRendererTurbo(this, 247, 131, textureX, textureY); // Box 80
		bodyModel[21] = new ModelRendererTurbo(this, 30, 322, textureX, textureY); // Box 251
		bodyModel[22] = new ModelRendererTurbo(this, 270, 125, textureX, textureY); // Box 256
		bodyModel[23] = new ModelRendererTurbo(this, 311, 144, textureX, textureY); // Box 259
		bodyModel[24] = new ModelRendererTurbo(this, 267, 144, textureX, textureY); // Box 269
		bodyModel[25] = new ModelRendererTurbo(this, 482, 285, textureX, textureY); // Box 19
		bodyModel[26] = new ModelRendererTurbo(this, 482, 285, textureX, textureY); // Box 19
		bodyModel[27] = new ModelRendererTurbo(this, 482, 285, textureX, textureY); // Box 19
		bodyModel[28] = new ModelRendererTurbo(this, 311, 175, textureX, textureY); // Box 440
		bodyModel[29] = new ModelRendererTurbo(this, 311, 175, textureX, textureY); // Box 441
		bodyModel[30] = new ModelRendererTurbo(this, 457, 226, textureX, textureY); // Box 19
		bodyModel[31] = new ModelRendererTurbo(this, 452, 226, textureX, textureY); // Box 19
		bodyModel[32] = new ModelRendererTurbo(this, 112, 154, textureX, textureY); // Box 2603
		bodyModel[33] = new ModelRendererTurbo(this, 136, 166, textureX, textureY); // Box 263
		bodyModel[34] = new ModelRendererTurbo(this, 310, 184, textureX, textureY); // Box 193
		bodyModel[35] = new ModelRendererTurbo(this, 310, 184, textureX, textureY); // Box 273
		bodyModel[36] = new ModelRendererTurbo(this, 136, 154, textureX, textureY); // Box 270434
		bodyModel[37] = new ModelRendererTurbo(this, 474, 217, textureX, textureY); // Box 310
		bodyModel[38] = new ModelRendererTurbo(this, 433, 217, textureX, textureY); // Box 311
		bodyModel[39] = new ModelRendererTurbo(this, 318, 176, textureX, textureY); // Box 318
		bodyModel[40] = new ModelRendererTurbo(this, 345, 200, textureX, textureY); // Box 319
		bodyModel[41] = new ModelRendererTurbo(this, 268, 132, textureX, textureY); // Box 320
		bodyModel[42] = new ModelRendererTurbo(this, 218, 132, textureX, textureY); // Box 321
		bodyModel[43] = new ModelRendererTurbo(this, 252, 204, textureX, textureY); // Box 253
		bodyModel[44] = new ModelRendererTurbo(this, 239, 204, textureX, textureY); // Box 280
		bodyModel[45] = new ModelRendererTurbo(this, 261, 137, textureX, textureY); // Box 298
		bodyModel[46] = new ModelRendererTurbo(this, 217, 137, textureX, textureY); // Box 299
		bodyModel[47] = new ModelRendererTurbo(this, 267, 137, textureX, textureY); // Box 300
		bodyModel[48] = new ModelRendererTurbo(this, 311, 137, textureX, textureY); // Box 301
		bodyModel[49] = new ModelRendererTurbo(this, 140, 193, textureX, textureY); // Box 411
		bodyModel[50] = new ModelRendererTurbo(this, 121, 193, textureX, textureY); // Box 412
		bodyModel[51] = new ModelRendererTurbo(this, 140, 185, textureX, textureY); // Box 431
		bodyModel[52] = new ModelRendererTurbo(this, 121, 185, textureX, textureY); // Box 432
		bodyModel[53] = new ModelRendererTurbo(this, 311, 175, textureX, textureY); // Box 322
		bodyModel[54] = new ModelRendererTurbo(this, 311, 175, textureX, textureY); // Box 323
		bodyModel[55] = new ModelRendererTurbo(this, 342, 220, textureX, textureY); // Box 82
		bodyModel[56] = new ModelRendererTurbo(this, 207, 255, textureX, textureY); // Box 96
		bodyModel[57] = new ModelRendererTurbo(this, 283, 257, textureX, textureY); // Box 97
		bodyModel[58] = new ModelRendererTurbo(this, 360, 129, textureX, textureY); // Box 124
		bodyModel[59] = new ModelRendererTurbo(this, 390, 129, textureX, textureY); // Box 130
		bodyModel[60] = new ModelRendererTurbo(this, 379, 141, textureX, textureY); // Box 131
		bodyModel[61] = new ModelRendererTurbo(this, 329, 220, textureX, textureY); // Box 2
		bodyModel[62] = new ModelRendererTurbo(this, 281, 309, textureX, textureY); // Box 97
		bodyModel[63] = new ModelRendererTurbo(this, 281, 302, textureX, textureY); // Box 97
		bodyModel[64] = new ModelRendererTurbo(this, 279, 293, textureX, textureY); // Box 97
		bodyModel[65] = new ModelRendererTurbo(this, 382, 124, textureX, textureY); // Box 219
		bodyModel[66] = new ModelRendererTurbo(this, 126, 157, textureX, textureY); // Box 31
		bodyModel[67] = new ModelRendererTurbo(this, 126, 152, textureX, textureY, "lamp"); // Box 247 headlight rear
		bodyModel[68] = new ModelRendererTurbo(this, 126, 152, textureX, textureY, "lamp"); // Box 248 headlight rear
		bodyModel[69] = new ModelRendererTurbo(this, 349, 170, textureX, textureY); // Box 88
		bodyModel[70] = new ModelRendererTurbo(this, 398, 220, textureX, textureY); // Box 119
		bodyModel[71] = new ModelRendererTurbo(this, 380, 208, textureX, textureY); // Box 127
		bodyModel[72] = new ModelRendererTurbo(this, 398, 220, textureX, textureY); // Box 128
		bodyModel[73] = new ModelRendererTurbo(this, 380, 214, textureX, textureY); // Box 130
		bodyModel[74] = new ModelRendererTurbo(this, 333, 210, textureX, textureY); // Box 135
		bodyModel[75] = new ModelRendererTurbo(this, 333, 216, textureX, textureY); // Box 136
		bodyModel[76] = new ModelRendererTurbo(this, 379, 133, textureX, textureY); // Box 132
		bodyModel[77] = new ModelRendererTurbo(this, 391, 120, textureX, textureY); // Box 133
		bodyModel[78] = new ModelRendererTurbo(this, 338, 184, textureX, textureY); // Box 233
		bodyModel[79] = new ModelRendererTurbo(this, 361, 120, textureX, textureY); // Box 173
		bodyModel[80] = new ModelRendererTurbo(this, 206, 203, textureX, textureY); // Box 4
		bodyModel[81] = new ModelRendererTurbo(this, 215, 205, textureX, textureY); // Box 2
		bodyModel[82] = new ModelRendererTurbo(this, 215, 205, textureX, textureY); // Box 211
		bodyModel[83] = new ModelRendererTurbo(this, 206, 203, textureX, textureY); // Box 212
		bodyModel[84] = new ModelRendererTurbo(this, 248, 126, textureX, textureY); // Box 162
		bodyModel[85] = new ModelRendererTurbo(this, 239, 130, textureX, textureY); // Box 163
		bodyModel[86] = new ModelRendererTurbo(this, 245, 118, textureX, textureY); // Box 164
		bodyModel[87] = new ModelRendererTurbo(this, 284, 128, textureX, textureY); // Box 121
		bodyModel[88] = new ModelRendererTurbo(this, 273, 128, textureX, textureY); // Box 122
		bodyModel[89] = new ModelRendererTurbo(this, 291, 128, textureX, textureY); // Box 123
		bodyModel[90] = new ModelRendererTurbo(this, 50, 228, textureX, textureY); // Box 138
		bodyModel[91] = new ModelRendererTurbo(this, 86, 229, textureX, textureY); // Box 138
		bodyModel[92] = new ModelRendererTurbo(this, 50, 237, textureX, textureY); // Box 254
		bodyModel[93] = new ModelRendererTurbo(this, 47, 246, textureX, textureY); // Box 255
		bodyModel[94] = new ModelRendererTurbo(this, 222, 138, textureX, textureY); // Box 21
		bodyModel[95] = new ModelRendererTurbo(this, 272, 138, textureX, textureY); // Box 257
		bodyModel[96] = new ModelRendererTurbo(this, 1, 229, textureX, textureY); // Box 258
		bodyModel[97] = new ModelRendererTurbo(this, 54, 212, textureX, textureY); // Box 7
		bodyModel[98] = new ModelRendererTurbo(this, 129, 212, textureX, textureY); // Box 24
		bodyModel[99] = new ModelRendererTurbo(this, 79, 195, textureX, textureY); // Box 28
		bodyModel[100] = new ModelRendererTurbo(this, 4, 195, textureX, textureY); // Box 30
		bodyModel[101] = new ModelRendererTurbo(this, 43, 209, textureX, textureY); // Box 52 door swing right
		bodyModel[102] = new ModelRendererTurbo(this, 118, 209, textureX, textureY); // Box 314 door swing right
		bodyModel[103] = new ModelRendererTurbo(this, 55, 179, textureX, textureY); // Box 266
		bodyModel[104] = new ModelRendererTurbo(this, 14, 179, textureX, textureY); // Box 267
		bodyModel[105] = new ModelRendererTurbo(this, 14, 171, textureX, textureY); // Box 268
		bodyModel[106] = new ModelRendererTurbo(this, 50, 195, textureX, textureY); // Box 269
		bodyModel[107] = new ModelRendererTurbo(this, 100, 192, textureX, textureY); // Box 270
		bodyModel[108] = new ModelRendererTurbo(this, 21, 175, textureX, textureY); // Box 271
		bodyModel[109] = new ModelRendererTurbo(this, 48, 171, textureX, textureY); // Box 272
		bodyModel[110] = new ModelRendererTurbo(this, 48, 179, textureX, textureY); // Box 273
		bodyModel[111] = new ModelRendererTurbo(this, 21, 183, textureX, textureY); // Box 274
		bodyModel[112] = new ModelRendererTurbo(this, 8, 233, textureX, textureY); // Box 275
		bodyModel[113] = new ModelRendererTurbo(this, 8, 242, textureX, textureY); // Box 276
		bodyModel[114] = new ModelRendererTurbo(this, 156, 226, textureX, textureY); // Box 298
		bodyModel[115] = new ModelRendererTurbo(this, 123, 228, textureX, textureY); // Box 279
		bodyModel[116] = new ModelRendererTurbo(this, 174, 149, textureX, textureY); // Box 281
		bodyModel[117] = new ModelRendererTurbo(this, 108, 234, textureX, textureY); // Box 282
		bodyModel[118] = new ModelRendererTurbo(this, 93, 234, textureX, textureY); // Box 283
		bodyModel[119] = new ModelRendererTurbo(this, 257, 326, textureX, textureY); // Box 284
		bodyModel[120] = new ModelRendererTurbo(this, 186, 232, textureX, textureY); // Box 285
		bodyModel[121] = new ModelRendererTurbo(this, 116, 134, textureX, textureY, "lamp"); // Box 247 Headlight Front
		bodyModel[122] = new ModelRendererTurbo(this, 116, 134, textureX, textureY, "lamp"); // Box 248 Headlight Front
		bodyModel[123] = new ModelRendererTurbo(this, 177, 228, textureX, textureY); // Box 288
		bodyModel[124] = new ModelRendererTurbo(this, 193, 228, textureX, textureY); // Box 289
		bodyModel[125] = new ModelRendererTurbo(this, 190, 226, textureX, textureY); // Box 290
		bodyModel[126] = new ModelRendererTurbo(this, 185, 228, textureX, textureY); // Box 291
		bodyModel[127] = new ModelRendererTurbo(this, 119, 110, textureX, textureY, "lamp"); // Box 117 numberboard
		bodyModel[128] = new ModelRendererTurbo(this, 119, 110, textureX, textureY, "lamp"); // Box 295 numberboard
		bodyModel[129] = new ModelRendererTurbo(this, 109, 135, textureX, textureY); // Box 296
		bodyModel[130] = new ModelRendererTurbo(this, 118, 231, textureX, textureY); // Box 297
		bodyModel[131] = new ModelRendererTurbo(this, 197, 216, textureX, textureY); // Box 298
		bodyModel[132] = new ModelRendererTurbo(this, 183, 214, textureX, textureY); // Box 299
		bodyModel[133] = new ModelRendererTurbo(this, 169, 213, textureX, textureY); // Box 300
		bodyModel[134] = new ModelRendererTurbo(this, 154, 211, textureX, textureY); // Box 301
		bodyModel[135] = new ModelRendererTurbo(this, 145, 231, textureX, textureY); // Box 302
		bodyModel[136] = new ModelRendererTurbo(this, 152, 149, textureX, textureY); // Box 306
		bodyModel[137] = new ModelRendererTurbo(this, 223, 131, textureX, textureY); // Box 307
		bodyModel[138] = new ModelRendererTurbo(this, 234, 130, textureX, textureY); // Box 308
		bodyModel[139] = new ModelRendererTurbo(this, 258, 142, textureX, textureY); // Box 363
		bodyModel[140] = new ModelRendererTurbo(this, 220, 142, textureX, textureY); // Box 310
		bodyModel[141] = new ModelRendererTurbo(this, 349, 156, textureX, textureY); // Box 312
		bodyModel[142] = new ModelRendererTurbo(this, 25, 196, textureX, textureY); // Box 412
		bodyModel[143] = new ModelRendererTurbo(this, 40, 196, textureX, textureY); // Box 413
		bodyModel[144] = new ModelRendererTurbo(this, 28, 189, textureX, textureY); // Box 86
		bodyModel[145] = new ModelRendererTurbo(this, 284, 130, textureX, textureY); // Box 320
		bodyModel[146] = new ModelRendererTurbo(this, 273, 131, textureX, textureY); // Box 321
		bodyModel[147] = new ModelRendererTurbo(this, 270, 142, textureX, textureY); // Box 322
		bodyModel[148] = new ModelRendererTurbo(this, 297, 131, textureX, textureY); // Box 323
		bodyModel[149] = new ModelRendererTurbo(this, 308, 142, textureX, textureY); // Box 324
		bodyModel[150] = new ModelRendererTurbo(this, 257, 316, textureX, textureY); // Box 325
		bodyModel[151] = new ModelRendererTurbo(this, 360, 316, textureX, textureY); // Box 326
		bodyModel[152] = new ModelRendererTurbo(this, 152, 147, textureX, textureY); // Box 296
		bodyModel[153] = new ModelRendererTurbo(this, 152, 136, textureX, textureY); // Box 328
		bodyModel[154] = new ModelRendererTurbo(this, 144, 138, textureX, textureY); // Box 296
		bodyModel[155] = new ModelRendererTurbo(this, 149, 148, textureX, textureY); // Box 280
		bodyModel[156] = new ModelRendererTurbo(this, 141, 148, textureX, textureY); // Box 281
		bodyModel[157] = new ModelRendererTurbo(this, 136, 138, textureX, textureY); // Box 282
		bodyModel[158] = new ModelRendererTurbo(this, 149, 145, textureX, textureY); // Box 333
		bodyModel[159] = new ModelRendererTurbo(this, 141, 145, textureX, textureY); // Box 334
		bodyModel[160] = new ModelRendererTurbo(this, 7, 230, textureX, textureY); // Box 335
		bodyModel[161] = new ModelRendererTurbo(this, 195, 149, textureX, textureY); // Box 336
		bodyModel[162] = new ModelRendererTurbo(this, 188, 156, textureX, textureY); // Box 295
		bodyModel[163] = new ModelRendererTurbo(this, 209, 142, textureX, textureY); // Box 338
		bodyModel[164] = new ModelRendererTurbo(this, 214, 152, textureX, textureY); // Box 339
		bodyModel[165] = new ModelRendererTurbo(this, 206, 152, textureX, textureY); // Box 340
		bodyModel[166] = new ModelRendererTurbo(this, 201, 142, textureX, textureY); // Box 341
		bodyModel[167] = new ModelRendererTurbo(this, 214, 149, textureX, textureY); // Box 342
		bodyModel[168] = new ModelRendererTurbo(this, 206, 149, textureX, textureY); // Box 343
		bodyModel[169] = new ModelRendererTurbo(this, 214, 151, textureX, textureY); // Box 344
		bodyModel[170] = new ModelRendererTurbo(this, 206, 151, textureX, textureY); // Box 345
		bodyModel[171] = new ModelRendererTurbo(this, 149, 147, textureX, textureY); // Box 346
		bodyModel[172] = new ModelRendererTurbo(this, 141, 147, textureX, textureY); // Box 347
		bodyModel[173] = new ModelRendererTurbo(this, 0, 230, textureX, textureY); // Box 348
		bodyModel[174] = new ModelRendererTurbo(this, 188, 154, textureX, textureY); // Box 349
		bodyModel[175] = new ModelRendererTurbo(this, 198, 149, textureX, textureY); // Box 350
		bodyModel[176] = new ModelRendererTurbo(this, 181, 149, textureX, textureY); // Box 351
		bodyModel[177] = new ModelRendererTurbo(this, 126, 145, textureX, textureY, "lamp"); // Box 352 headlight nose
		bodyModel[178] = new ModelRendererTurbo(this, 126, 145, textureX, textureY, "lamp"); // Box 353 headlight nose
		bodyModel[179] = new ModelRendererTurbo(this, 122, 137, textureX, textureY); // Box 354
		bodyModel[180] = new ModelRendererTurbo(this, 142, 116, textureX, textureY); // Box 364 prime base
		bodyModel[181] = new ModelRendererTurbo(this, 142, 112, textureX, textureY, "lamp"); // Box 6 PRIME2-1
		bodyModel[182] = new ModelRendererTurbo(this, 142, 112, textureX, textureY, "lamp"); // Box 7 PRIME2-3
		bodyModel[183] = new ModelRendererTurbo(this, 142, 112, textureX, textureY, "lamp"); // Box 8 PRIME2-2
		bodyModel[184] = new ModelRendererTurbo(this, 142, 112, textureX, textureY, "lamp"); // Box 9 PRIME2-4
		bodyModel[185] = new ModelRendererTurbo(this, 178, 107, textureX, textureY); // Box 417 ac
		bodyModel[186] = new ModelRendererTurbo(this, 165, 111, textureX, textureY, "cull"); // Box 361 cull
		bodyModel[187] = new ModelRendererTurbo(this, 161, 103, textureX, textureY); // Box 425
		bodyModel[188] = new ModelRendererTurbo(this, 116, 145, textureX, textureY); // Box 363
		bodyModel[189] = new ModelRendererTurbo(this, 121, 145, textureX, textureY); // Box 364
		bodyModel[190] = new ModelRendererTurbo(this, 100, 146, textureX, textureY); // Box 365
		bodyModel[191] = new ModelRendererTurbo(this, 108, 144, textureX, textureY); // Box 366
		bodyModel[192] = new ModelRendererTurbo(this, 97, 167, textureX, textureY); // Box 276
		bodyModel[193] = new ModelRendererTurbo(this, 104, 167, textureX, textureY); // Box 277
		bodyModel[194] = new ModelRendererTurbo(this, 201, 227, textureX, textureY); // Box 385
		bodyModel[195] = new ModelRendererTurbo(this, 208, 227, textureX, textureY); // Box 386
		bodyModel[196] = new ModelRendererTurbo(this, 71, 196, textureX, textureY); // Box 122
		bodyModel[197] = new ModelRendererTurbo(this, 71, 200, textureX, textureY); // Box 123
		bodyModel[198] = new ModelRendererTurbo(this, 67, 198, textureX, textureY); // Box 350
		bodyModel[199] = new ModelRendererTurbo(this, 93, 198, textureX, textureY); // Box 321
		bodyModel[200] = new ModelRendererTurbo(this, 158, 106, textureX, textureY); // Box 279
		bodyModel[201] = new ModelRendererTurbo(this, 161, 107, textureX, textureY); // Box 392
		bodyModel[202] = new ModelRendererTurbo(this, 119, 107, textureX, textureY, "lamp"); // Box 393 numberboard
		bodyModel[203] = new ModelRendererTurbo(this, 381, 127, textureX, textureY); // Box 394
		bodyModel[204] = new ModelRendererTurbo(this, 119, 107, textureX, textureY, "lamp"); // Box 395 numberboard
		bodyModel[205] = new ModelRendererTurbo(this, 107, 135, textureX, textureY, "lamp"); // Box 396 glow marker
		bodyModel[206] = new ModelRendererTurbo(this, 107, 135, textureX, textureY, "lamp"); // Box 396 glow marker
		bodyModel[207] = new ModelRendererTurbo(this, 107, 132, textureX, textureY, "lamp"); // Box 398 glow marker
		bodyModel[208] = new ModelRendererTurbo(this, 107, 132, textureX, textureY, "lamp"); // Box 399 glow marker
		bodyModel[209] = new ModelRendererTurbo(this, 119, 127, textureX, textureY); // Box 252
		bodyModel[210] = new ModelRendererTurbo(this, 126, 128, textureX, textureY); // Box 101
		bodyModel[211] = new ModelRendererTurbo(this, 119, 122, textureX, textureY, "lamp"); // Box 190 ditchlight f u
		bodyModel[212] = new ModelRendererTurbo(this, 126, 123, textureX, textureY, "lamp"); // Box 275 ditchlight f l
		bodyModel[213] = new ModelRendererTurbo(this, 126, 128, textureX, textureY); // Box 444
		bodyModel[214] = new ModelRendererTurbo(this, 126, 123, textureX, textureY, "lamp"); // Box 445 ditchlight f l
		bodyModel[215] = new ModelRendererTurbo(this, 119, 122, textureX, textureY, "lamp"); // Box 446 ditchlight f u
		bodyModel[216] = new ModelRendererTurbo(this, 119, 127, textureX, textureY); // Box 447
		bodyModel[217] = new ModelRendererTurbo(this, 88, 122, textureX, textureY); // Box 354
		bodyModel[218] = new ModelRendererTurbo(this, 90, 119, textureX, textureY); // Box 355
		bodyModel[219] = new ModelRendererTurbo(this, 90, 125, textureX, textureY); // Box 356
		bodyModel[220] = new ModelRendererTurbo(this, 99, 122, textureX, textureY); // Box 357
		bodyModel[221] = new ModelRendererTurbo(this, 169, 105, textureX, textureY); // Box 412 idk up bs or somethin
		bodyModel[222] = new ModelRendererTurbo(this, 161, 105, textureX, textureY); // Box 413
		bodyModel[223] = new ModelRendererTurbo(this, 104, 121, textureX, textureY); // Box 414
		bodyModel[224] = new ModelRendererTurbo(this, 115, 121, textureX, textureY); // Box 415
		bodyModel[225] = new ModelRendererTurbo(this, 106, 118, textureX, textureY); // Box 416
		bodyModel[226] = new ModelRendererTurbo(this, 106, 124, textureX, textureY); // Box 417
		bodyModel[227] = new ModelRendererTurbo(this, 76, 122, textureX, textureY); // Box 418
		bodyModel[228] = new ModelRendererTurbo(this, 67, 119, textureX, textureY); // Box 419
		bodyModel[229] = new ModelRendererTurbo(this, 65, 122, textureX, textureY); // Box 420
		bodyModel[230] = new ModelRendererTurbo(this, 67, 125, textureX, textureY); // Box 421
		bodyModel[231] = new ModelRendererTurbo(this, 133, 112, textureX, textureY, "lamp"); // Box 6 PRIME1-1
		bodyModel[232] = new ModelRendererTurbo(this, 133, 112, textureX, textureY, "lamp"); // Box 7 PRIME1-3
		bodyModel[233] = new ModelRendererTurbo(this, 133, 112, textureX, textureY, "lamp"); // Box 8 PRIME1-2
		bodyModel[234] = new ModelRendererTurbo(this, 133, 112, textureX, textureY, "lamp"); // Box 9 PRIME1-4
		bodyModel[235] = new ModelRendererTurbo(this, 152, 111, textureX, textureY, "cull"); // Box 426 cull
		bodyModel[236] = new ModelRendererTurbo(this, 133, 116, textureX, textureY); // Box 428
		bodyModel[237] = new ModelRendererTurbo(this, 203, 111, textureX, textureY); // Box 361 ac
		bodyModel[238] = new ModelRendererTurbo(this, 214, 103, textureX, textureY); // Box 362 ac
		bodyModel[239] = new ModelRendererTurbo(this, 207, 105, textureX, textureY); // Box 363 ac
		bodyModel[240] = new ModelRendererTurbo(this, 224, 111, textureX, textureY); // Box 432 ac
		bodyModel[241] = new ModelRendererTurbo(this, 235, 103, textureX, textureY); // Box 433 ac
		bodyModel[242] = new ModelRendererTurbo(this, 228, 105, textureX, textureY); // Box 434 ac
		bodyModel[243] = new ModelRendererTurbo(this, 269, 259, textureX, textureY); // Box 435
		bodyModel[244] = new ModelRendererTurbo(this, 269, 259, textureX, textureY); // Box 436
		bodyModel[245] = new ModelRendererTurbo(this, 82, 120, textureX, textureY); // Box 443
		bodyModel[246] = new ModelRendererTurbo(this, 82, 124, textureX, textureY); // Box 444
		bodyModel[247] = new ModelRendererTurbo(this, 147, 130, textureX, textureY, "lamp"); // Box 334 commander beacon
		bodyModel[248] = new ModelRendererTurbo(this, 147, 134, textureX, textureY); // Box 335
		bodyModel[249] = new ModelRendererTurbo(this, 6, 156, textureX, textureY); // Box 282
		bodyModel[250] = new ModelRendererTurbo(this, 52, 156, textureX, textureY); // Box 283
		bodyModel[251] = new ModelRendererTurbo(this, 19, 154, textureX, textureY); // Box 4
		bodyModel[252] = new ModelRendererTurbo(this, 32, 154, textureX, textureY); // Box 448
		bodyModel[253] = new ModelRendererTurbo(this, 138, 190, textureX, textureY); // Box 300
		bodyModel[254] = new ModelRendererTurbo(this, 140, 193, textureX, textureY); // Box 301
		bodyModel[255] = new ModelRendererTurbo(this, 137, 196, textureX, textureY); // Box 302
		bodyModel[256] = new ModelRendererTurbo(this, 140, 185, textureX, textureY); // Box 303
		bodyModel[257] = new ModelRendererTurbo(this, 138, 190, textureX, textureY); // Box 304
		bodyModel[258] = new ModelRendererTurbo(this, 130, 198, textureX, textureY); // Box 305
		bodyModel[259] = new ModelRendererTurbo(this, 121, 193, textureX, textureY); // Box 306
		bodyModel[260] = new ModelRendererTurbo(this, 118, 196, textureX, textureY); // Box 307
		bodyModel[261] = new ModelRendererTurbo(this, 119, 190, textureX, textureY); // Box 308
		bodyModel[262] = new ModelRendererTurbo(this, 121, 185, textureX, textureY); // Box 309
		bodyModel[263] = new ModelRendererTurbo(this, 119, 190, textureX, textureY); // Box 310
		bodyModel[264] = new ModelRendererTurbo(this, 130, 196, textureX, textureY); // Box 311
		bodyModel[265] = new ModelRendererTurbo(this, 140, 128, textureX, textureY); // Box 312
		bodyModel[266] = new ModelRendererTurbo(this, 140, 123, textureX, textureY, "lamp"); // Box 313 ditchlight r l
		bodyModel[267] = new ModelRendererTurbo(this, 133, 127, textureX, textureY); // Box 314
		bodyModel[268] = new ModelRendererTurbo(this, 133, 122, textureX, textureY, "lamp"); // Box 315 ditchlight r u
		bodyModel[269] = new ModelRendererTurbo(this, 140, 123, textureX, textureY, "lamp"); // Box 316 ditchlight r l
		bodyModel[270] = new ModelRendererTurbo(this, 140, 128, textureX, textureY); // Box 317
		bodyModel[271] = new ModelRendererTurbo(this, 133, 127, textureX, textureY); // Box 318
		bodyModel[272] = new ModelRendererTurbo(this, 133, 122, textureX, textureY, "lamp"); // Box 319 ditchlight r u
		bodyModel[273] = new ModelRendererTurbo(this, 318, 176, textureX, textureY); // Box 320
		bodyModel[274] = new ModelRendererTurbo(this, 65, 154, textureX, textureY); // Box 322
		bodyModel[275] = new ModelRendererTurbo(this, 78, 154, textureX, textureY); // Box 323
		bodyModel[276] = new ModelRendererTurbo(this, 43, 152, textureX, textureY); // Box 280
		bodyModel[277] = new ModelRendererTurbo(this, 89, 152, textureX, textureY); // Box 285
		bodyModel[278] = new ModelRendererTurbo(this, 6, 143, textureX, textureY); // Box 326
		bodyModel[279] = new ModelRendererTurbo(this, 52, 139, textureX, textureY); // Box 327
		bodyModel[280] = new ModelRendererTurbo(this, 65, 137, textureX, textureY); // Box 328
		bodyModel[281] = new ModelRendererTurbo(this, 19, 141, textureX, textureY); // Box 329
		bodyModel[282] = new ModelRendererTurbo(this, 32, 141, textureX, textureY); // Box 330
		bodyModel[283] = new ModelRendererTurbo(this, 43, 139, textureX, textureY); // Box 331
		bodyModel[284] = new ModelRendererTurbo(this, 78, 137, textureX, textureY); // Box 332
		bodyModel[285] = new ModelRendererTurbo(this, 89, 135, textureX, textureY); // Box 333
		bodyModel[286] = new ModelRendererTurbo(this, 424, 239, textureX, textureY, "cull"); // Box 3 cull aww
		bodyModel[287] = new ModelRendererTurbo(this, 426, 234, textureX, textureY); // Box 5
		bodyModel[288] = new ModelRendererTurbo(this, 369, 274, textureX, textureY); // Box 434
		bodyModel[289] = new ModelRendererTurbo(this, 428, 277, textureX, textureY); // Box 435
		bodyModel[290] = new ModelRendererTurbo(this, 482, 290, textureX, textureY); // Box 436
		bodyModel[291] = new ModelRendererTurbo(this, 482, 290, textureX, textureY); // Box 437
		bodyModel[292] = new ModelRendererTurbo(this, 482, 290, textureX, textureY); // Box 438
		bodyModel[293] = new ModelRendererTurbo(this, 130, 198, textureX, textureY); // Box 439
		bodyModel[294] = new ModelRendererTurbo(this, 130, 196, textureX, textureY); // Box 440
		bodyModel[295] = new ModelRendererTurbo(this, 130, 198, textureX, textureY); // Box 441
		bodyModel[296] = new ModelRendererTurbo(this, 130, 196, textureX, textureY); // Box 442
		bodyModel[297] = new ModelRendererTurbo(this, 223, 308, textureX, textureY); // Box 297
		bodyModel[298] = new ModelRendererTurbo(this, 259, 292, textureX, textureY); // Box 299
		bodyModel[299] = new ModelRendererTurbo(this, 211, 262, textureX, textureY, "lamp"); // Box 162 rotating lamp?
		bodyModel[300] = new ModelRendererTurbo(this, 210, 265, textureX, textureY); // Box 165
		bodyModel[301] = new ModelRendererTurbo(this, 217, 262, textureX, textureY); // Box 302
		bodyModel[302] = new ModelRendererTurbo(this, 350, 257, textureX, textureY); // Box 303
		bodyModel[303] = new ModelRendererTurbo(this, 350, 257, textureX, textureY); // Box 304
		bodyModel[304] = new ModelRendererTurbo(this, 350, 257, textureX, textureY); // Box 305
		bodyModel[305] = new ModelRendererTurbo(this, 350, 257, textureX, textureY); // Box 306
		bodyModel[306] = new ModelRendererTurbo(this, 350, 257, textureX, textureY); // Box 307
		bodyModel[307] = new ModelRendererTurbo(this, 350, 257, textureX, textureY); // Box 308

		bodyModel[0].addBox(0F, 0F, 0F, 88, 2, 22, 0F); // Box 0
		bodyModel[0].setRotationPoint(-44F, -1F, -11F);

		bodyModel[1].addBox(0F, 0F, 0F, 22, 4, 16, 0F); // Box 2
		bodyModel[1].setRotationPoint(-11F, 5F, -8F);

		bodyModel[2].addBox(0F, 0F, 0F, 0, 8, 20, 0F); // Box 3
		bodyModel[2].setRotationPoint(-48.01F, -1F, -10F);

		bodyModel[3].addBox(0F, 0F, 0F, 4, 2, 14, 0F); // Box 8
		bodyModel[3].setRotationPoint(-48F, -1F, -7F);

		bodyModel[4].addBox(0F, 0F, 0F, 4, 3, 22, 0F); // Box 10
		bodyModel[4].setRotationPoint(-11F, 2F, -11F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 2, 6, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 63
		bodyModel[5].setRotationPoint(-44F, 2F, -11F);

		bodyModel[6].addBox(0F, 0F, 0F, 26, 1, 3, 0F); // Box 156
		bodyModel[6].setRotationPoint(-44F, 1F, -11F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 22, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 157
		bodyModel[7].setRotationPoint(-11F, 5F, -11F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 22, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 158
		bodyModel[8].setRotationPoint(-11F, 5F, 8F);

		bodyModel[9].addBox(0F, 0F, 0F, 4, 0, 3, 0F); // Box 197
		bodyModel[9].setRotationPoint(-48F, 8F, 8F);

		bodyModel[10].addBox(0F, 0F, 0F, 4, 0, 1, 0F); // Box 199
		bodyModel[10].setRotationPoint(-48F, -1F, 7F);

		bodyModel[11].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 200
		bodyModel[11].setRotationPoint(-48F, 3F, 6.5F);

		bodyModel[12].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 201
		bodyModel[12].setRotationPoint(-48F, 5.5F, 7F);

		bodyModel[13].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 202
		bodyModel[13].setRotationPoint(-48F, 5.5F, -9F);

		bodyModel[14].addBox(0F, 0F, 0F, 4, 0, 1, 0F); // Box 203
		bodyModel[14].setRotationPoint(-48F, -1F, -8F);

		bodyModel[15].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 204
		bodyModel[15].setRotationPoint(-48F, 3F, -8.5F);

		bodyModel[16].addBox(0F, 0F, 0F, 4, 0, 3, 0F); // Box 205
		bodyModel[16].setRotationPoint(-48F, 8F, -11F);

		bodyModel[17].addBox(0F, 0F, 0F, 4, 2, 14, 0F); // Box 215
		bodyModel[17].setRotationPoint(44F, -1F, -7F);

		bodyModel[18].addBox(0F, 0F, 0F, 0, 7, 1, 0F); // Box 61
		bodyModel[18].setRotationPoint(-48F, -3F, 10F);

		bodyModel[19].addBox(0F, 0F, 0F, 0, 7, 1, 0F); // Box 63
		bodyModel[19].setRotationPoint(-48F, -3F, -11F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 0, 8, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F); // Box 80
		bodyModel[20].setRotationPoint(-48F, -9F, -8F);

		bodyModel[21].addBox(0F, 0F, 0F, 88, 2, 16, 0F); // Box 251
		bodyModel[21].setRotationPoint(-44F, 1F, -8F);

		bodyModel[22].addBox(0F, 0F, 0F, 0, 8, 20, 0F); // Box 256
		bodyModel[22].setRotationPoint(48.01F, -1F, -10F);

		bodyModel[23].addBox(0F, 0F, 0F, 0, 7, 1, 0F); // Box 259
		bodyModel[23].setRotationPoint(48.01F, -3F, 10F);

		bodyModel[24].addBox(0F, 0F, 0F, 0, 7, 1, 0F); // Box 269
		bodyModel[24].setRotationPoint(48.01F, -3F, -11F);

		bodyModel[25].addBox(0F, 0F, 0F, 8, 3, 1, 0F); // Box 19
		bodyModel[25].setRotationPoint(-7F, 1.5F, 9F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 8, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 19
		bodyModel[26].setRotationPoint(-7F, 1.5F, 10F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 8, 3, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 19
		bodyModel[27].setRotationPoint(-7F, 1.5F, 8F);

		bodyModel[28].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 440
		bodyModel[28].setRotationPoint(-29F, 3F, -1F);

		bodyModel[29].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 441
		bodyModel[29].setRotationPoint(27F, 3F, -1F);

		bodyModel[30].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 19
		bodyModel[30].setRotationPoint(-9F, 1F, -11.75F);
		bodyModel[30].rotateAngleX = 0.71558499F;

		bodyModel[31].addBox(0F, 0F, -1F, 1, 3, 1, 0F); // Box 19
		bodyModel[31].setRotationPoint(-9F, 1F, 11.75F);
		bodyModel[31].rotateAngleX = -0.71558499F;

		bodyModel[32].addShapeBox(0F, 0F, 0F, 2, 7, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 2603
		bodyModel[32].setRotationPoint(-44F, 1F, 7F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 2, 7, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 263
		bodyModel[33].setRotationPoint(42F, 1F, -11F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 5, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Box 193
		bodyModel[34].setRotationPoint(-48F, 1F, -3F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 5, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); // Box 273
		bodyModel[35].setRotationPoint(43F, 1F, -3F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 2, 7, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 270434
		bodyModel[36].setRotationPoint(42F, 1F, 7F);

		bodyModel[37].addBox(0F, 0F, 0F, 2, 1, 14, 0F); // Box 310
		bodyModel[37].setRotationPoint(11F, 3F, -7F);

		bodyModel[38].addBox(0F, 0F, 0F, 2, 1, 14, 0F); // Box 311
		bodyModel[38].setRotationPoint(-13F, 3F, -7F);

		bodyModel[39].addBox(0F, 0F, 0F, 4, 1, 3, 0F); // Box 318
		bodyModel[39].setRotationPoint(26F, 1F, -11F);

		bodyModel[40].addBox(0F, 0F, 0F, 4, 1, 3, 0F); // Box 319
		bodyModel[40].setRotationPoint(-30F, 1F, 8F);

		bodyModel[41].addBox(0F, 0F, 0F, 0, 1, 22, 0F); // Box 320
		bodyModel[41].setRotationPoint(48.01F, 7F, -11F);

		bodyModel[42].addBox(0F, 0F, 0F, 0, 1, 22, 0F); // Box 321
		bodyModel[42].setRotationPoint(-48.01F, 7F, -11F);

		bodyModel[43].addBox(0F, 0F, 0F, 5, 1, 1, 0F); // Box 253
		bodyModel[43].setRotationPoint(-38F, 1F, 9F);
		bodyModel[43].rotateAngleZ = -0.27925268F;

		bodyModel[44].addBox(0F, 0F, 0F, 5, 1, 1, 0F); // Box 280
		bodyModel[44].setRotationPoint(-43F, 1F, 9F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, -2F, 2F, 0F, -2F, 2F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 298
		bodyModel[45].setRotationPoint(-48F, -9F, -10F);
		bodyModel[45].rotateAngleY = -3.14159265F;

		bodyModel[46].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, -2F, 2F, 0F, -2F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 299
		bodyModel[46].setRotationPoint(-48F, -9F, 11F);
		bodyModel[46].rotateAngleY = -3.14159265F;

		bodyModel[47].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, -2F, 2F, 0F, -2F, 2F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 300
		bodyModel[47].setRotationPoint(48.01F, -9F, -10F);
		bodyModel[47].rotateAngleY = -3.14159265F;

		bodyModel[48].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, -2F, 2F, 0F, -2F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 301
		bodyModel[48].setRotationPoint(48.01F, -9F, 11F);
		bodyModel[48].rotateAngleY = -3.14159265F;

		bodyModel[49].addBox(0F, 0F, 0F, 4, 2, 0, 0F); // Box 411
		bodyModel[49].setRotationPoint(-48F, 6F, -8F);

		bodyModel[50].addBox(0F, 0F, 0F, 4, 2, 0, 0F); // Box 412
		bodyModel[50].setRotationPoint(-48F, 6F, 8F);

		bodyModel[51].addBox(0F, 0F, 0F, 4, 4, 0, 0F); // Box 431
		bodyModel[51].setRotationPoint(-48F, 2F, -7F);

		bodyModel[52].addBox(0F, 0F, 0F, 4, 4, 0, 0F); // Box 432
		bodyModel[52].setRotationPoint(-48F, 2F, 7F);

		bodyModel[53].addBox(0F, 0F, 0F, 2, 1, 22, 0F); // Box 322
		bodyModel[53].setRotationPoint(27F, 2F, -11F);

		bodyModel[54].addBox(0F, 0F, 0F, 2, 1, 22, 0F); // Box 323
		bodyModel[54].setRotationPoint(-29F, 2F, -11F);

		bodyModel[55].addBox(0F, 0F, 0F, 20, 18, 14, 0F); // Box 82
		bodyModel[55].setRotationPoint(22F, -19F, -7F);

		bodyModel[56].addBox(-1F, 0F, 0F, 23, 21, 14, 0F); // Box 96
		bodyModel[56].setRotationPoint(-23F, -22F, -7F);

		bodyModel[57].addBox(0F, 0F, 0F, 23, 19, 14, 0F); // Box 97
		bodyModel[57].setRotationPoint(-1F, -20F, -7F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 2, 19, 7, 0F,1F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -1F, 1F, 0F, -1F); // Box 124
		bodyModel[58].setRotationPoint(43F, -20F, -7F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 2, 19, 7, 0F,1F, 0F, -1F, 0F, 0F, -1F, -3F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -1F, 0F, 0F, -1F, -3F, 0F, 0F, 1F, 0F, 0F); // Box 130
		bodyModel[59].setRotationPoint(43F, -20F, 0F);

		bodyModel[60].addBox(0F, 0F, 0F, 3, 12, 2, 0F); // Box 131
		bodyModel[60].setRotationPoint(42F, -13F, -1F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 3, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[61].setRotationPoint(14F, -22F, -3F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 23, 1, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 97
		bodyModel[62].setRotationPoint(-1F, -21F, -7F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 23, 1, 4, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 97
		bodyModel[63].setRotationPoint(-1F, -21F, 3F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 23, 1, 6, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 97
		bodyModel[64].setRotationPoint(-1F, -21F, -3F);

		bodyModel[65].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 219
		bodyModel[65].setRotationPoint(43F, -13F, -0.5F);
		bodyModel[65].rotateAngleZ = 0.78539816F;

		bodyModel[66].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 31
		bodyModel[66].setRotationPoint(45F, -21F, -1F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 247 headlight rear
		bodyModel[67].setRotationPoint(44.5F, -21.05F, -1F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 248 headlight rear
		bodyModel[68].setRotationPoint(44.5F, -19.05F, -1F);

		bodyModel[69].addShapeBox(0F, -1F, 0F, 21, 2, 11, 0F,0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 88
		bodyModel[69].setRotationPoint(22F, -21F, -11F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 15, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 119
		bodyModel[70].setRotationPoint(25F, -18F, 7F);

		bodyModel[71].addBox(0F, 0F, 0F, 21, 1, 4, 0F); // Box 127
		bodyModel[71].setRotationPoint(22F, -19F, -9F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 15, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[72].setRotationPoint(25F, -18F, -9F);

		bodyModel[73].addBox(0F, 0F, 0F, 21, 1, 4, 0F); // Box 130
		bodyModel[73].setRotationPoint(22F, -19F, 5F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 21, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 135
		bodyModel[74].setRotationPoint(22F, -19F, -11F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 21, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 136
		bodyModel[75].setRotationPoint(22F, -19F, 9F);

		bodyModel[76].addBox(0F, 0F, 0F, 3, 5, 2, 0F); // Box 132
		bodyModel[76].setRotationPoint(42F, -21F, -1F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,1F, 0F, -1F, 0F, 0F, -1F, -2F, 0F, -2F, 1F, 0F, -2F, 1F, 0F, -1F, 0F, 0F, -1F, -2F, 0F, -2F, 1F, 0F, -2F); // Box 133
		bodyModel[77].setRotationPoint(44F, -21F, 0F);

		bodyModel[78].addBox(0F, -1F, 0F, 21, 1, 22, 0F); // Box 233
		bodyModel[78].setRotationPoint(22F, -19F, -11F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,1F, 0F, -2F, -2F, 0F, -2F, 0F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, -2F, -2F, 0F, -2F, 0F, 0F, -1F, 1F, 0F, -1F); // Box 173
		bodyModel[79].setRotationPoint(44F, -21F, -7F);

		bodyModel[80].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 4
		bodyModel[80].setRotationPoint(-52F, 3F, -1.5F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[81].setRotationPoint(-49F, 2.5F, -2F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 211
		bodyModel[82].setRotationPoint(48F, 2.5F, -2F);

		bodyModel[83].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 212
		bodyModel[83].setRotationPoint(49F, 3F, -1.5F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F,-1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 162
		bodyModel[84].setRotationPoint(-50F, -1F, -8F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 163
		bodyModel[85].setRotationPoint(-50F, -1F, -2F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F); // Box 164
		bodyModel[86].setRotationPoint(-50F, -1F, 2F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 121
		bodyModel[87].setRotationPoint(48F, -1F, -2F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F,0F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 122
		bodyModel[88].setRotationPoint(48F, -1F, -8F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F); // Box 123
		bodyModel[89].setRotationPoint(48F, -1F, 2F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 13, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 138
		bodyModel[90].setRotationPoint(-24F, -5F, 7F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 138
		bodyModel[91].setRotationPoint(-9F, -3F, 7F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 10, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 254
		bodyModel[92].setRotationPoint(-24F, -5F, -11F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 1, 0, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 255
		bodyModel[93].setRotationPoint(-14F, -3F, -11F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 0, 1, 18, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 21
		bodyModel[94].setRotationPoint(-48F, 8F, -9F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 0, 1, 18, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 257
		bodyModel[95].setRotationPoint(48F, 8F, -9F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 13, 4, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 258
		bodyModel[96].setRotationPoint(-37F, -5F, -11F);

		bodyModel[97].addBox(0F, 0F, 0F, 11, 14, 1, 0F); // Box 7
		bodyModel[97].setRotationPoint(-36F, -19F, -11F);

		bodyModel[98].addBox(0F, 0F, 0F, 11, 14, 1, 0F); // Box 24
		bodyModel[98].setRotationPoint(-36F, -19F, 10F);

		bodyModel[99].addBox(0F, 0F, 0F, 1, 14, 18, 0F); // Box 28
		bodyModel[99].setRotationPoint(-25F, -19F, -11F);

		bodyModel[100].addBox(0F, 0F, 0F, 1, 14, 18, 0F); // Box 30
		bodyModel[100].setRotationPoint(-37F, -19F, -7F);

		bodyModel[101].addBox(-0.5F, 0F, -0.5F, 1, 14, 4, 0F); // Box 52 door swing right
		bodyModel[101].setRotationPoint(-36.5F, -19F, -10.5F);

		bodyModel[102].addBox(-0.5F, 0F, -3.5F, 1, 14, 4, 0F); // Box 314 door swing right
		bodyModel[102].setRotationPoint(-24.5F, -19F, 10.5F);

		bodyModel[103].addBox(-1F, 0F, 0F, 13, 1, 14, 0F); // Box 266
		bodyModel[103].setRotationPoint(-36F, -22F, -7F);

		bodyModel[104].addShapeBox(-1F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 267
		bodyModel[104].setRotationPoint(-36F, -22F, 7F);

		bodyModel[105].addShapeBox(-1F, 0F, 0F, 1, 3, 4, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 268
		bodyModel[105].setRotationPoint(-36F, -22F, -11F);

		bodyModel[106].addBox(0F, 0F, 0F, 1, 2, 14, 0F); // Box 269
		bodyModel[106].setRotationPoint(-37F, -21F, -7F);

		bodyModel[107].addBox(0F, 0F, 0F, 1, 2, 14, 0F); // Box 270
		bodyModel[107].setRotationPoint(-25F, -21F, -7F);

		bodyModel[108].addShapeBox(-1F, 0F, 0F, 11, 1, 4, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -1F, 0F, 2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 271
		bodyModel[108].setRotationPoint(-35F, -22F, -11F);

		bodyModel[109].addShapeBox(-1F, 0F, 0F, 1, 3, 4, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 272
		bodyModel[109].setRotationPoint(-24F, -22F, -11F);

		bodyModel[110].addShapeBox(-1F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 273
		bodyModel[110].setRotationPoint(-24F, -22F, 7F);

		bodyModel[111].addShapeBox(-1F, 0F, 0F, 11, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -1F, 0F, 2F, -1F); // Box 274
		bodyModel[111].setRotationPoint(-35F, -22F, 7F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 3, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 275
		bodyModel[112].setRotationPoint(-40F, -5F, -11F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 3, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 276
		bodyModel[113].setRotationPoint(-40F, -5F, 7F);

		bodyModel[114].addBox(0F, 0F, 0F, 3, 13, 14, 0F); // Box 298
		bodyModel[114].setRotationPoint(-40F, -14F, -7F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 4, 13, 12, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 279
		bodyModel[115].setRotationPoint(-44F, -14F, -6F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 3, 8, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 281
		bodyModel[116].setRotationPoint(-40F, -13F, -11F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 1, 13, 6, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 282
		bodyModel[117].setRotationPoint(-45F, -14F, -6F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 1, 13, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 283
		bodyModel[118].setRotationPoint(-45F, -14F, 0F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 54, 8, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 284
		bodyModel[119].setRotationPoint(-10F, -9F, -11F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 285
		bodyModel[120].setRotationPoint(-38F, -21F, -2F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 247 Headlight Front
		bodyModel[121].setRotationPoint(-39F, -21.2F, -2F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 248 Headlight Front
		bodyModel[122].setRotationPoint(-39F, -21.2F, 0F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 288
		bodyModel[123].setRotationPoint(-38F, -21F, 2F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,-0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 289
		bodyModel[124].setRotationPoint(-38F, -21F, -7F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 290
		bodyModel[125].setRotationPoint(-38F, -20F, 7F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 291
		bodyModel[126].setRotationPoint(-38F, -21F, 7F);

		bodyModel[127].addBox(0F, 0F, 0F, 0, 2, 5, 0F); // Box 117 numberboard
		bodyModel[127].setRotationPoint(-37.51F, -21.25F, -7F);
		bodyModel[127].rotateAngleY = 0.1012291F;

		bodyModel[128].addBox(0F, 0F, -5F, 0, 2, 5, 0F); // Box 295 numberboard
		bodyModel[128].setRotationPoint(-37.51F, -21.25F, 7F);
		bodyModel[128].rotateAngleY = -0.1012291F;

		bodyModel[129].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 296
		bodyModel[129].setRotationPoint(-38.25F, -21.2F, -2F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,-1F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 297
		bodyModel[130].setRotationPoint(-45F, -15F, -6F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 3, 1, 7, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 298
		bodyModel[131].setRotationPoint(-40F, -15F, -7F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 3, 1, 7, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 299
		bodyModel[132].setRotationPoint(-40F, -15F, 0F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 4, 1, 6, 0F,0F, -1F, 0F, 0F, -1F, 1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 300
		bodyModel[133].setRotationPoint(-44F, -15F, -6F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 4, 1, 6, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 301
		bodyModel[134].setRotationPoint(-44F, -15F, 0F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 302
		bodyModel[135].setRotationPoint(-45F, -15F, 0F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 10, 8, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 306
		bodyModel[136].setRotationPoint(-24F, -13F, -11F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 0, 8, 5, 0F,2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 307
		bodyModel[137].setRotationPoint(-48F, -9F, 3F);

		bodyModel[138].addBox(0F, 0F, 0F, 0, 8, 6, 0F); // Box 308
		bodyModel[138].setRotationPoint(-50F, -9F, -3F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 363
		bodyModel[139].setRotationPoint(-48F, -8F, -8F);
		bodyModel[139].rotateAngleY = 0.38397244F;

		bodyModel[140].addShapeBox(0F, 0F, -1F, 0, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 310
		bodyModel[140].setRotationPoint(-48F, -8F, 8F);
		bodyModel[140].rotateAngleY = -0.38397244F;

		bodyModel[141].addShapeBox(0F, -1F, 0F, 21, 2, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 312
		bodyModel[141].setRotationPoint(22F, -21F, 0F);

		bodyModel[142].addBox(0F, 0F, 0F, 4, 9, 3, 0F); // Box 412
		bodyModel[142].setRotationPoint(-31F, -14F, -6F);

		bodyModel[143].addBox(0F, 0F, 0F, 7, 7, 3, 0F); // Box 413
		bodyModel[143].setRotationPoint(-37.1F, -12F, -2F);
		bodyModel[143].rotateAngleY = -0.82030475F;

		bodyModel[144].addShapeBox(-1F, 0F, -0.5F, 11, 4, 2, 0F,0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -2F, 0F, -5F, -2F, 0F, -5F, -2F, 0F, 0F, -2F, 0F); // Box 86
		bodyModel[144].setRotationPoint(-35.5F, -14F, -2F);
		bodyModel[144].rotateAngleY = -0.82030475F;

		bodyModel[145].addBox(0F, 0F, 0F, 0, 8, 6, 0F); // Box 320
		bodyModel[145].setRotationPoint(50F, -9F, -3F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 0, 8, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F); // Box 321
		bodyModel[146].setRotationPoint(48F, -9F, -8F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 322
		bodyModel[147].setRotationPoint(48F, -8F, -8F);
		bodyModel[147].rotateAngleY = -0.38397244F;

		bodyModel[148].addShapeBox(0F, 0F, 0F, 0, 8, 5, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 323
		bodyModel[148].setRotationPoint(48F, -9F, 3F);

		bodyModel[149].addShapeBox(0F, 0F, -1F, 0, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 324
		bodyModel[149].setRotationPoint(48F, -8F, 8F);
		bodyModel[149].rotateAngleY = 0.38397244F;

		bodyModel[150].addShapeBox(0F, 0F, 0F, 49, 8, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 325
		bodyModel[150].setRotationPoint(-5F, -9F, 11F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 15, 8, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 326
		bodyModel[151].setRotationPoint(-24F, -13F, 11F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F); // Box 296
		bodyModel[152].setRotationPoint(-14F, -13F, -11F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F); // Box 328
		bodyModel[153].setRotationPoint(-9F, -13F, 11F);

		bodyModel[154].addBox(0F, 0F, 0F, 0, 13, 2, 0F); // Box 296
		bodyModel[154].setRotationPoint(44.5F, -9F, -11F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 0, 4, 1, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 280
		bodyModel[155].setRotationPoint(44.5F, -5F, -11.5F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 0, 4, 1, 0F,0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 281
		bodyModel[156].setRotationPoint(44.5F, -5F, 10.5F);

		bodyModel[157].addBox(0F, 0F, 0F, 0, 13, 2, 0F); // Box 282
		bodyModel[157].setRotationPoint(44.5F, -9F, 9F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 333
		bodyModel[158].setRotationPoint(44F, -9F, -11F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 334
		bodyModel[159].setRotationPoint(44F, -9F, 11F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 1, 4, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 335
		bodyModel[160].setRotationPoint(-41F, -5F, -11F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 1, 8, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 336
		bodyModel[161].setRotationPoint(-44F, -9F, -11F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F); // Box 295
		bodyModel[162].setRotationPoint(-43F, -13F, -11.01F);

		bodyModel[163].addBox(0F, 0F, 0F, 0, 13, 2, 0F); // Box 338
		bodyModel[163].setRotationPoint(-44.5F, -9F, -11F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 0, 4, 1, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 339
		bodyModel[164].setRotationPoint(-44.5F, -5F, -11.5F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 0, 4, 1, 0F,0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 340
		bodyModel[165].setRotationPoint(-44.5F, -5F, 10.5F);

		bodyModel[166].addBox(0F, 0F, 0F, 0, 13, 2, 0F); // Box 341
		bodyModel[166].setRotationPoint(-44.5F, -9F, 9F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 342
		bodyModel[167].setRotationPoint(-45F, -9F, -11F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 343
		bodyModel[168].setRotationPoint(-45F, -9F, 11F);

		bodyModel[169].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 344
		bodyModel[169].setRotationPoint(-45F, 3F, -11F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 345
		bodyModel[170].setRotationPoint(-45F, 3F, 11F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 346
		bodyModel[171].setRotationPoint(44F, 3F, -11F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 347
		bodyModel[172].setRotationPoint(44F, 3F, 11F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 1, 0, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 348
		bodyModel[173].setRotationPoint(-41F, -3F, -11F);

		bodyModel[174].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F); // Box 349
		bodyModel[174].setRotationPoint(-43F, -13F, 11.01F);

		bodyModel[175].addShapeBox(0F, 0F, 0F, 1, 8, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 350
		bodyModel[175].setRotationPoint(-44F, -9F, 11.02F);

		bodyModel[176].addShapeBox(0F, 0F, 0F, 3, 8, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 351
		bodyModel[176].setRotationPoint(-40F, -13F, 11.02F);

		bodyModel[177].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 352 headlight nose
		bodyModel[177].setRotationPoint(-45.85F, -14F, 0F);

		bodyModel[178].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 353 headlight nose
		bodyModel[178].setRotationPoint(-45.85F, -14F, -2F);

		bodyModel[179].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 354
		bodyModel[179].setRotationPoint(-45.1F, -14F, -2F);

		bodyModel[180].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 364 prime base
		bodyModel[180].setRotationPoint(-37F, -23F, -1F);

		bodyModel[181].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F); // Box 6 PRIME2-1
		bodyModel[181].setRotationPoint(-37F, -23.5F, -1F);

		bodyModel[182].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F); // Box 7 PRIME2-3
		bodyModel[182].setRotationPoint(-37F, -23.5F, -1F);

		bodyModel[183].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 8 PRIME2-2
		bodyModel[183].setRotationPoint(-37F, -23.5F, -1F);

		bodyModel[184].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 9 PRIME2-4
		bodyModel[184].setRotationPoint(-37F, -23.5F, -1F);

		bodyModel[185].addBox(0F, 0F, 0F, 4, 2, 8, 0F); // Box 417 ac
		bodyModel[185].setRotationPoint(-34F, -23.5F, -4F);

		bodyModel[186].addBox(0F, 0F, 0F, 3, 3, 3, 0F); // Box 361 cull
		bodyModel[186].setRotationPoint(-29F, -23.5F, 6F);

		bodyModel[187].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 425
		bodyModel[187].setRotationPoint(-29F, -24.5F, 7F);

		bodyModel[188].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 363
		bodyModel[188].setRotationPoint(-45.35F, -14F, -2.25F);

		bodyModel[189].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 364
		bodyModel[189].setRotationPoint(-45.35F, -14F, 1.25F);

		bodyModel[190].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 365
		bodyModel[190].setRotationPoint(-45.35F, -15F, -2.25F);

		bodyModel[191].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F); // Box 366
		bodyModel[191].setRotationPoint(-45.35F, -12F, -2.25F);

		bodyModel[192].addBox(0F, 0F, 0F, 3, 3, 0, 0F); // Box 276
		bodyModel[192].setRotationPoint(-42.5F, -12F, 7.25F);

		bodyModel[193].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 277
		bodyModel[193].setRotationPoint(-41.5F, -11F, 6.25F);

		bodyModel[194].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 385
		bodyModel[194].setRotationPoint(-38F, -20F, -9F);

		bodyModel[195].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 386
		bodyModel[195].setRotationPoint(-38F, -21F, -9F);

		bodyModel[196].addShapeBox(0F, 0F, 0F, 9, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1.75F, -2F, 0F, -1.75F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F); // Box 122
		bodyModel[196].setRotationPoint(-35F, -18F, 11F);

		bodyModel[197].addShapeBox(0F, 0F, 0F, 9, 2, 1, 0F,-1.75F, -2F, 0F, -1.75F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 123
		bodyModel[197].setRotationPoint(-35F, -18F, -12F);

		bodyModel[198].addBox(0F, 0F, 0F, 0, 4, 1, 0F); // Box 350
		bodyModel[198].setRotationPoint(-35.01F, -16F, -12F);

		bodyModel[199].addBox(0F, 0F, 0F, 0, 4, 1, 0F); // Box 321
		bodyModel[199].setRotationPoint(-35.01F, -16F, 11F);

		bodyModel[200].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 279
		bodyModel[200].setRotationPoint(-37F, -24F, -3F);

		bodyModel[201].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 392
		bodyModel[201].setRotationPoint(-29F, -23F, 0F);

		bodyModel[202].addBox(0F, 0F, 0F, 0, 2, 5, 0F); // Box 393 numberboard
		bodyModel[202].setRotationPoint(42.51F, -16F, -6F);
		bodyModel[202].rotateAngleY = -0.4712389F;

		bodyModel[203].addBox(0F, 0F, 0F, 1, 3, 2, 0F); // Box 394
		bodyModel[203].setRotationPoint(42F, -16F, -1F);

		bodyModel[204].addBox(0F, 0F, -5F, 0, 2, 5, 0F); // Box 395 numberboard
		bodyModel[204].setRotationPoint(42.51F, -16F, 6F);
		bodyModel[204].rotateAngleY = 0.4712389F;

		bodyModel[205].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 396 glow marker
		bodyModel[205].setRotationPoint(-37.75F, -20.5F, -8.25F);

		bodyModel[206].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 396 glow marker
		bodyModel[206].setRotationPoint(-37.75F, -20.5F, 7.25F);

		bodyModel[207].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 398 glow marker
		bodyModel[207].setRotationPoint(42F, -13.5F, -6.25F);

		bodyModel[208].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 399 glow marker
		bodyModel[208].setRotationPoint(42F, -13.5F, 5.25F);

		bodyModel[209].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 252
		bodyModel[209].setRotationPoint(-49F, -4F, -5.75F);

		bodyModel[210].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 101
		bodyModel[210].setRotationPoint(-48.5F, 0F, -6.75F);

		bodyModel[211].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 190 ditchlight f u
		bodyModel[211].setRotationPoint(-49.25F, -4F, -5.75F);

		bodyModel[212].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 275 ditchlight f l
		bodyModel[212].setRotationPoint(-48.75F, 0F, -6.75F);

		bodyModel[213].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 444
		bodyModel[213].setRotationPoint(-48.5F, 0F, 4.75F);

		bodyModel[214].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 445 ditchlight f l
		bodyModel[214].setRotationPoint(-48.75F, 0F, 4.75F);

		bodyModel[215].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 446 ditchlight f u
		bodyModel[215].setRotationPoint(-49.25F, -4F, 3.75F);

		bodyModel[216].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 447
		bodyModel[216].setRotationPoint(-49F, -4F, 3.75F);

		bodyModel[217].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 354
		bodyModel[217].setRotationPoint(7F, -22.5F, -0.5F);

		bodyModel[218].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 355
		bodyModel[218].setRotationPoint(8F, -22.25F, 0.5F);

		bodyModel[219].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 356
		bodyModel[219].setRotationPoint(7.5F, -22.25F, -1.5F);

		bodyModel[220].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 357
		bodyModel[220].setRotationPoint(9.5F, -21.5F, -0.5F);

		bodyModel[221].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 412 idk up bs or somethin
		bodyModel[221].setRotationPoint(-29.5F, -23F, -2F);

		bodyModel[222].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 413
		bodyModel[222].setRotationPoint(-29F, -24F, 0F);

		bodyModel[223].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 414
		bodyModel[223].setRotationPoint(7F, -18.5F, -8.5F);

		bodyModel[224].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 415
		bodyModel[224].setRotationPoint(9.5F, -18.5F, -7.5F);

		bodyModel[225].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 416
		bodyModel[225].setRotationPoint(7.5F, -17.5F, -8.25F);

		bodyModel[226].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 417
		bodyModel[226].setRotationPoint(8F, -19.5F, -8.25F);

		bodyModel[227].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 418
		bodyModel[227].setRotationPoint(4.5F, -22F, -6.5F);

		bodyModel[228].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 419
		bodyModel[228].setRotationPoint(3F, -22.75F, -5.5F);

		bodyModel[229].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 420
		bodyModel[229].setRotationPoint(2F, -23F, -6.5F);

		bodyModel[230].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 421
		bodyModel[230].setRotationPoint(3.5F, -22.75F, -7.5F);

		bodyModel[231].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F); // Box 6 PRIME1-1
		bodyModel[231].setRotationPoint(-34F, -23.5F, 7.5F);

		bodyModel[232].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F); // Box 7 PRIME1-3
		bodyModel[232].setRotationPoint(-34F, -23.5F, 7.5F);

		bodyModel[233].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 8 PRIME1-2
		bodyModel[233].setRotationPoint(-34F, -23.5F, 7.5F);

		bodyModel[234].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 9 PRIME1-4
		bodyModel[234].setRotationPoint(-34F, -23.5F, 7.5F);

		bodyModel[235].addShapeBox(0F, 0F, 0F, 3, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 426 cull
		bodyModel[235].setRotationPoint(-34.5F, -22F, 7F);

		bodyModel[236].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 428
		bodyModel[236].setRotationPoint(-34F, -23F, 7.5F);

		bodyModel[237].addBox(0F, 0F, 0F, 6, 2, 4, 0F); // Box 361 ac
		bodyModel[237].setRotationPoint(-33.5F, -24F, -5F);

		bodyModel[238].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 362 ac
		bodyModel[238].setRotationPoint(-34.5F, -24F, -5F);

		bodyModel[239].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 363 ac
		bodyModel[239].setRotationPoint(-34.5F, -23F, -5F);

		bodyModel[240].addBox(0F, 0F, 0F, 6, 2, 4, 0F); // Box 432 ac
		bodyModel[240].setRotationPoint(-33.5F, -24F, 1F);

		bodyModel[241].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 433 ac
		bodyModel[241].setRotationPoint(-34.5F, -24F, 1F);

		bodyModel[242].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 434 ac
		bodyModel[242].setRotationPoint(-34.5F, -23F, 1F);

		bodyModel[243].addBox(-1F, 0F, 0F, 11, 4, 1, 0F); // Box 435
		bodyModel[243].setRotationPoint(-12F, -21F, -7.5F);

		bodyModel[244].addBox(-1F, 0F, 0F, 11, 4, 1, 0F); // Box 436
		bodyModel[244].setRotationPoint(-12F, -21F, 6.5F);

		bodyModel[245].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 443
		bodyModel[245].setRotationPoint(8.5F, -23.25F, 0.25F);

		bodyModel[246].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 444
		bodyModel[246].setRotationPoint(8.5F, -23.25F, -1.25F);

		bodyModel[247].addShapeBox(0F, -1F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 334 commander beacon
		bodyModel[247].setRotationPoint(-38F, -22.5F, -0.5F);

		bodyModel[248].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 335
		bodyModel[248].setRotationPoint(-38F, -22.5F, -0.5F);

		bodyModel[249].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,-1F, 0F, 0F, 0.5F, 0F, 0F, 3F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, -1F, -2.5F, 0F, -1F); // Box 282
		bodyModel[249].setRotationPoint(-52F, 7F, 0F);

		bodyModel[250].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,-3.5F, 0F, 0F, 3F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -2.5F, 0F, -1F, 2F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 283
		bodyModel[250].setRotationPoint(-52F, 7F, -10F);

		bodyModel[251].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F); // Box 4
		bodyModel[251].setRotationPoint(-51F, 6F, 0F);

		bodyModel[252].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F); // Box 448
		bodyModel[252].setRotationPoint(-51F, 5F, 2F);

		bodyModel[253].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 300
		bodyModel[253].setRotationPoint(44F, 5.5F, -9F);

		bodyModel[254].addBox(0F, 0F, 0F, 4, 2, 0, 0F); // Box 301
		bodyModel[254].setRotationPoint(44F, 6F, -8F);

		bodyModel[255].addBox(0F, 0F, 0F, 4, 0, 3, 0F); // Box 302
		bodyModel[255].setRotationPoint(44F, 8F, -11F);

		bodyModel[256].addBox(0F, 0F, 0F, 4, 4, 0, 0F); // Box 303
		bodyModel[256].setRotationPoint(44F, 2F, -7F);

		bodyModel[257].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 304
		bodyModel[257].setRotationPoint(44F, 3F, -8.5F);

		bodyModel[258].addBox(0F, 0F, 0F, 4, 0, 1, 0F); // Box 305
		bodyModel[258].setRotationPoint(44F, -1F, -8F);

		bodyModel[259].addBox(0F, 0F, 0F, 4, 2, 0, 0F); // Box 306
		bodyModel[259].setRotationPoint(44F, 6F, 8F);

		bodyModel[260].addBox(0F, 0F, 0F, 4, 0, 3, 0F); // Box 307
		bodyModel[260].setRotationPoint(44F, 8F, 8F);

		bodyModel[261].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 308
		bodyModel[261].setRotationPoint(44F, 5.5F, 7F);

		bodyModel[262].addBox(0F, 0F, 0F, 4, 4, 0, 0F); // Box 309
		bodyModel[262].setRotationPoint(44F, 2F, 7F);

		bodyModel[263].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 310
		bodyModel[263].setRotationPoint(44F, 3F, 6.5F);

		bodyModel[264].addBox(0F, 0F, 0F, 4, 0, 1, 0F); // Box 311
		bodyModel[264].setRotationPoint(44F, -1F, 7F);

		bodyModel[265].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 312
		bodyModel[265].setRotationPoint(47.5F, 0F, -6.75F);

		bodyModel[266].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 313 ditchlight r l
		bodyModel[266].setRotationPoint(47.75F, 0F, -6.75F);

		bodyModel[267].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 314
		bodyModel[267].setRotationPoint(48F, -4F, -5.75F);

		bodyModel[268].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 315 ditchlight r u
		bodyModel[268].setRotationPoint(48.25F, -4F, -5.75F);

		bodyModel[269].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 316 ditchlight r l
		bodyModel[269].setRotationPoint(47.75F, 0F, 4.75F);

		bodyModel[270].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 317
		bodyModel[270].setRotationPoint(47.5F, 0F, 4.75F);

		bodyModel[271].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 318
		bodyModel[271].setRotationPoint(48F, -4F, 3.75F);

		bodyModel[272].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 319 ditchlight r u
		bodyModel[272].setRotationPoint(48.25F, -4F, 3.75F);

		bodyModel[273].addBox(0F, 0F, 0F, 4, 1, 3, 0F); // Box 320
		bodyModel[273].setRotationPoint(26F, 1F, 8F);

		bodyModel[274].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,-2.5F, 0F, 0F, 2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 322
		bodyModel[274].setRotationPoint(-51F, 6F, -10F);

		bodyModel[275].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,-2.5F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 323
		bodyModel[275].setRotationPoint(-51F, 5F, -10F);

		bodyModel[276].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0.5F, 0F, 0F, -1F, 0F, 0F, 1F, 1F, 0F, -1.5F, 1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F); // Box 280
		bodyModel[276].setRotationPoint(-51F, 4F, 2F);

		bodyModel[277].addShapeBox(0F, 0F, -2F, 1, 1, 8, 0F,-1.5F, 1F, 0F, 1F, 1F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 285
		bodyModel[277].setRotationPoint(-51F, 4F, -8F);

		bodyModel[278].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,0.5F, 0F, 0F, -1F, 0F, 0F, -3.5F, 0F, 0F, 3F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, -1F, 2F, 0F, -1F); // Box 326
		bodyModel[278].setRotationPoint(51F, 7F, 0F);

		bodyModel[279].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,3F, 0F, 0F, -3.5F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 2F, 0F, -1F, -2.5F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 327
		bodyModel[279].setRotationPoint(51F, 7F, -10F);

		bodyModel[280].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,2F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 328
		bodyModel[280].setRotationPoint(50F, 6F, -10F);

		bodyModel[281].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F); // Box 329
		bodyModel[281].setRotationPoint(50F, 6F, 0F);

		bodyModel[282].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F); // Box 330
		bodyModel[282].setRotationPoint(50F, 5F, 2F);

		bodyModel[283].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,-1F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 1F, 0F, 1F, 1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F); // Box 331
		bodyModel[283].setRotationPoint(50F, 4F, 2F);

		bodyModel[284].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,2F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 332
		bodyModel[284].setRotationPoint(50F, 5F, -10F);

		bodyModel[285].addShapeBox(0F, 0F, -2F, 1, 1, 8, 0F,1F, 1F, 0F, -1.5F, 1F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 333
		bodyModel[285].setRotationPoint(50F, 4F, -8F);

		bodyModel[286].addShapeBox(0F, 0F, 0F, 7, 6, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F); // Box 3 cull aww
		bodyModel[286].setRotationPoint(-34F, -17F, 10F);

		bodyModel[287].addShapeBox(0F, 0F, 0F, 7, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 5
		bodyModel[287].setRotationPoint(-34F, -18F, 10F);

		bodyModel[288].addBox(0F, 0F, 0F, 1, 3, 22, 0F); // Box 434
		bodyModel[288].setRotationPoint(10F, 2F, -11F);

		bodyModel[289].addBox(0F, 0F, 0F, 17, 3, 19, 0F); // Box 435
		bodyModel[289].setRotationPoint(-7F, 2F, -11F);

		bodyModel[290].addShapeBox(-8F, 0F, 0F, 8, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 436
		bodyModel[290].setRotationPoint(10F, 1.5F, 10F);

		bodyModel[291].addBox(-8F, 0F, 0F, 8, 3, 1, 0F); // Box 437
		bodyModel[291].setRotationPoint(10F, 1.5F, 9F);

		bodyModel[292].addShapeBox(-8F, 0F, 0F, 8, 3, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 438
		bodyModel[292].setRotationPoint(10F, 1.5F, 8F);

		bodyModel[293].addBox(0F, 0F, 0F, 4, 0, 1, 0F); // Box 439
		bodyModel[293].setRotationPoint(-48F, 1F, -8F);

		bodyModel[294].addBox(0F, 0F, 0F, 4, 0, 1, 0F); // Box 440
		bodyModel[294].setRotationPoint(-48F, 1F, 7F);

		bodyModel[295].addBox(0F, 0F, 0F, 4, 0, 1, 0F); // Box 441
		bodyModel[295].setRotationPoint(44F, 1F, -8F);

		bodyModel[296].addBox(0F, 0F, 0F, 4, 0, 1, 0F); // Box 442
		bodyModel[296].setRotationPoint(44F, 1F, 7F);

		bodyModel[297].addShapeBox(0F, 0F, 0F, 2, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 297
		bodyModel[297].setRotationPoint(-11F, -5F, 7F);

		bodyModel[298].addShapeBox(0F, 0F, 0F, 2, 6, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 299
		bodyModel[298].setRotationPoint(-39F, -11F, 7F);

		bodyModel[299].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 162 rotating lamp?
		bodyModel[299].setRotationPoint(-31.53F, -23F, -0.5F);

		bodyModel[300].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0.3F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, 0.3F, -0.5F, 0.1F, 0.3F, 0F, 0.1F, -1F, 0F, 0.1F, -1F, 0F, 0.1F, 0.3F, 0F, 0.1F); // Box 165
		bodyModel[300].setRotationPoint(-31.37F, -23F, -0.5F);

		bodyModel[301].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 302
		bodyModel[301].setRotationPoint(-26.5F, -24F, 0F);

		bodyModel[302].addShapeBox(0F, -1F, 0F, 5, 2, 8, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 303
		bodyModel[302].setRotationPoint(25F, -21.5F, -10F);

		bodyModel[303].addShapeBox(0F, -1F, 0F, 5, 2, 8, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 304
		bodyModel[303].setRotationPoint(31F, -21.5F, -10F);

		bodyModel[304].addShapeBox(0F, -1F, 0F, 5, 2, 8, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 305
		bodyModel[304].setRotationPoint(37F, -21.5F, -10F);

		bodyModel[305].addShapeBox(0F, -1F, 0F, 5, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 306
		bodyModel[305].setRotationPoint(31F, -21.5F, 2F);

		bodyModel[306].addShapeBox(0F, -1F, 0F, 5, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 307
		bodyModel[306].setRotationPoint(25F, -21.5F, 2F);

		bodyModel[307].addShapeBox(0F, -1F, 0F, 5, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 308
		bodyModel[307].setRotationPoint(37F, -21.5F, 2F);
	}
	ModelFB3 theTrucks2 = new ModelFB3();
	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		for (int i = 0; i < 307; i++) {
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
		if (entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor() == 843||entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor() == 1544) {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/fb3_Grey.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.75, 0.07, 0);
			theTrucks2.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(3.52, 0, 0);
			theTrucks2.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else if (entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor() == 11){
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/fb3_UpMoment.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.75, 0.07, 0);
			theTrucks2.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(3.52, 0, 0);
			theTrucks2.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/fb3_Black.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.75, 0.07, 0);
			theTrucks2.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(3.52, 0, 0);
			theTrucks2.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		}
	}
	public float[] getTrans() {
		return new float[]{-1.6F, 0.15F, 0.00F};
	}

	public float[] getRotate() {
		return new float[] { 0F, 180F, 180F };
	}

	public float[] getScale() {
		return null;
	}

	public ArrayList<double[]> getSmokePosition() {
		return new ArrayList<double[]>() {
			{
				add(new double[]{0.65D, 1.35D, 0.0D});
			}
		};
	}
}