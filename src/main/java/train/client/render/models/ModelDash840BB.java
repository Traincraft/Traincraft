//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2021 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 02.03.2021 - 00:07:54
// Last changed on: 02.03.2021 - 00:07:54

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

public class ModelDash840BB extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 256;

	public ModelDash840BB() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[228];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 127, 159, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 429, 175, textureX, textureY); // Box 2
		bodyModel[2] = new ModelRendererTurbo(this, 220, 125, textureX, textureY); // Box 3
		bodyModel[3] = new ModelRendererTurbo(this, 112, 164, textureX, textureY); // Box 8
		bodyModel[4] = new ModelRendererTurbo(this, 423, 148, textureX, textureY); // Box 10
		bodyModel[5] = new ModelRendererTurbo(this, 431, 233, textureX, textureY); // Box 19
		bodyModel[6] = new ModelRendererTurbo(this, 112, 167, textureX, textureY); // Box 63
		bodyModel[7] = new ModelRendererTurbo(this, 146, 203, textureX, textureY); // Box 156
		bodyModel[8] = new ModelRendererTurbo(this, 442, 197, textureX, textureY); // Box 157
		bodyModel[9] = new ModelRendererTurbo(this, 442, 206, textureX, textureY); // Box 158
		bodyModel[10] = new ModelRendererTurbo(this, 118, 196, textureX, textureY); // Box 197
		bodyModel[11] = new ModelRendererTurbo(this, 130, 196, textureX, textureY); // Box 199
		bodyModel[12] = new ModelRendererTurbo(this, 130, 198, textureX, textureY); // Box 203
		bodyModel[13] = new ModelRendererTurbo(this, 137, 196, textureX, textureY); // Box 205
		bodyModel[14] = new ModelRendererTurbo(this, 310, 158, textureX, textureY); // Box 215
		bodyModel[15] = new ModelRendererTurbo(this, 217, 144, textureX, textureY); // Box 61
		bodyModel[16] = new ModelRendererTurbo(this, 261, 144, textureX, textureY); // Box 63
		bodyModel[17] = new ModelRendererTurbo(this, 247, 131, textureX, textureY); // Box 80
		bodyModel[18] = new ModelRendererTurbo(this, 133, 184, textureX, textureY); // Box 251
		bodyModel[19] = new ModelRendererTurbo(this, 270, 125, textureX, textureY); // Box 256
		bodyModel[20] = new ModelRendererTurbo(this, 311, 144, textureX, textureY); // Box 259
		bodyModel[21] = new ModelRendererTurbo(this, 267, 144, textureX, textureY); // Box 269
		bodyModel[22] = new ModelRendererTurbo(this, 431, 233, textureX, textureY); // Box 19
		bodyModel[23] = new ModelRendererTurbo(this, 431, 233, textureX, textureY); // Box 19
		bodyModel[24] = new ModelRendererTurbo(this, 486, 245, textureX, textureY); // Box 305
		bodyModel[25] = new ModelRendererTurbo(this, 486, 245, textureX, textureY); // Box 305
		bodyModel[26] = new ModelRendererTurbo(this, 471, 233, textureX, textureY); // Box 19
		bodyModel[27] = new ModelRendererTurbo(this, 471, 233, textureX, textureY); // Box 19
		bodyModel[28] = new ModelRendererTurbo(this, 471, 233, textureX, textureY); // Box 19
		bodyModel[29] = new ModelRendererTurbo(this, 452, 245, textureX, textureY); // Box 305
		bodyModel[30] = new ModelRendererTurbo(this, 452, 245, textureX, textureY); // Box 305
		bodyModel[31] = new ModelRendererTurbo(this, 311, 175, textureX, textureY); // Box 440
		bodyModel[32] = new ModelRendererTurbo(this, 311, 175, textureX, textureY); // Box 441
		bodyModel[33] = new ModelRendererTurbo(this, 457, 226, textureX, textureY); // Box 19
		bodyModel[34] = new ModelRendererTurbo(this, 452, 226, textureX, textureY); // Box 19
		bodyModel[35] = new ModelRendererTurbo(this, 112, 154, textureX, textureY); // Box 2603
		bodyModel[36] = new ModelRendererTurbo(this, 136, 166, textureX, textureY); // Box 263
		bodyModel[37] = new ModelRendererTurbo(this, 310, 184, textureX, textureY); // Box 193
		bodyModel[38] = new ModelRendererTurbo(this, 310, 184, textureX, textureY); // Box 273
		bodyModel[39] = new ModelRendererTurbo(this, 136, 154, textureX, textureY); // Box 270434
		bodyModel[40] = new ModelRendererTurbo(this, 474, 217, textureX, textureY); // Box 310
		bodyModel[41] = new ModelRendererTurbo(this, 433, 217, textureX, textureY); // Box 311
		bodyModel[42] = new ModelRendererTurbo(this, 318, 176, textureX, textureY); // Box 318
		bodyModel[43] = new ModelRendererTurbo(this, 345, 200, textureX, textureY); // Box 319
		bodyModel[44] = new ModelRendererTurbo(this, 268, 132, textureX, textureY); // Box 320
		bodyModel[45] = new ModelRendererTurbo(this, 218, 132, textureX, textureY); // Box 321
		bodyModel[46] = new ModelRendererTurbo(this, 252, 204, textureX, textureY); // Box 253
		bodyModel[47] = new ModelRendererTurbo(this, 239, 204, textureX, textureY); // Box 280
		bodyModel[48] = new ModelRendererTurbo(this, 261, 137, textureX, textureY); // Box 298
		bodyModel[49] = new ModelRendererTurbo(this, 217, 137, textureX, textureY); // Box 299
		bodyModel[50] = new ModelRendererTurbo(this, 267, 137, textureX, textureY); // Box 300
		bodyModel[51] = new ModelRendererTurbo(this, 311, 137, textureX, textureY); // Box 301
		bodyModel[52] = new ModelRendererTurbo(this, 140, 193, textureX, textureY); // Box 411
		bodyModel[53] = new ModelRendererTurbo(this, 121, 193, textureX, textureY); // Box 412
		bodyModel[54] = new ModelRendererTurbo(this, 311, 175, textureX, textureY); // Box 322
		bodyModel[55] = new ModelRendererTurbo(this, 311, 175, textureX, textureY); // Box 323
		bodyModel[56] = new ModelRendererTurbo(this, 342, 220, textureX, textureY); // Box 82
		bodyModel[57] = new ModelRendererTurbo(this, 206, 217, textureX, textureY); // Box 96
		bodyModel[58] = new ModelRendererTurbo(this, 273, 219, textureX, textureY); // Box 97
		bodyModel[59] = new ModelRendererTurbo(this, 360, 129, textureX, textureY); // Box 124
		bodyModel[60] = new ModelRendererTurbo(this, 390, 129, textureX, textureY); // Box 130
		bodyModel[61] = new ModelRendererTurbo(this, 379, 141, textureX, textureY); // Box 131
		bodyModel[62] = new ModelRendererTurbo(this, 329, 220, textureX, textureY); // Box 2
		bodyModel[63] = new ModelRendererTurbo(this, 283, 213, textureX, textureY); // Box 97
		bodyModel[64] = new ModelRendererTurbo(this, 282, 207, textureX, textureY); // Box 97
		bodyModel[65] = new ModelRendererTurbo(this, 234, 209, textureX, textureY); // Box 97
		bodyModel[66] = new ModelRendererTurbo(this, 382, 124, textureX, textureY); // Box 219
		bodyModel[67] = new ModelRendererTurbo(this, 126, 157, textureX, textureY); // Box 31
		bodyModel[68] = new ModelRendererTurbo(this, 126, 152, textureX, textureY, "lamp"); // Box 247 headlight rear
		bodyModel[69] = new ModelRendererTurbo(this, 126, 152, textureX, textureY, "lamp"); // Box 248 headlight rear
		bodyModel[70] = new ModelRendererTurbo(this, 349, 170, textureX, textureY); // Box 88
		bodyModel[71] = new ModelRendererTurbo(this, 398, 220, textureX, textureY); // Box 119
		bodyModel[72] = new ModelRendererTurbo(this, 380, 208, textureX, textureY); // Box 127
		bodyModel[73] = new ModelRendererTurbo(this, 398, 220, textureX, textureY); // Box 128
		bodyModel[74] = new ModelRendererTurbo(this, 380, 214, textureX, textureY); // Box 130
		bodyModel[75] = new ModelRendererTurbo(this, 333, 210, textureX, textureY); // Box 135
		bodyModel[76] = new ModelRendererTurbo(this, 333, 216, textureX, textureY); // Box 136
		bodyModel[77] = new ModelRendererTurbo(this, 379, 133, textureX, textureY); // Box 132
		bodyModel[78] = new ModelRendererTurbo(this, 391, 120, textureX, textureY); // Box 133
		bodyModel[79] = new ModelRendererTurbo(this, 338, 184, textureX, textureY); // Box 233
		bodyModel[80] = new ModelRendererTurbo(this, 361, 120, textureX, textureY); // Box 173
		bodyModel[81] = new ModelRendererTurbo(this, 206, 203, textureX, textureY); // Box 4
		bodyModel[82] = new ModelRendererTurbo(this, 215, 205, textureX, textureY); // Box 2
		bodyModel[83] = new ModelRendererTurbo(this, 215, 205, textureX, textureY); // Box 211
		bodyModel[84] = new ModelRendererTurbo(this, 206, 203, textureX, textureY); // Box 212
		bodyModel[85] = new ModelRendererTurbo(this, 248, 126, textureX, textureY); // Box 162
		bodyModel[86] = new ModelRendererTurbo(this, 239, 130, textureX, textureY); // Box 163
		bodyModel[87] = new ModelRendererTurbo(this, 245, 118, textureX, textureY); // Box 164
		bodyModel[88] = new ModelRendererTurbo(this, 284, 128, textureX, textureY); // Box 121
		bodyModel[89] = new ModelRendererTurbo(this, 273, 128, textureX, textureY); // Box 122
		bodyModel[90] = new ModelRendererTurbo(this, 291, 128, textureX, textureY); // Box 123
		bodyModel[91] = new ModelRendererTurbo(this, 50, 228, textureX, textureY); // Box 138
		bodyModel[92] = new ModelRendererTurbo(this, 86, 229, textureX, textureY); // Box 138
		bodyModel[93] = new ModelRendererTurbo(this, 50, 237, textureX, textureY); // Box 254
		bodyModel[94] = new ModelRendererTurbo(this, 47, 246, textureX, textureY); // Box 255
		bodyModel[95] = new ModelRendererTurbo(this, 222, 138, textureX, textureY); // Box 21
		bodyModel[96] = new ModelRendererTurbo(this, 272, 138, textureX, textureY); // Box 257
		bodyModel[97] = new ModelRendererTurbo(this, 1, 229, textureX, textureY); // Box 258
		bodyModel[98] = new ModelRendererTurbo(this, 8, 233, textureX, textureY); // Box 275
		bodyModel[99] = new ModelRendererTurbo(this, 8, 242, textureX, textureY); // Box 276
		bodyModel[100] = new ModelRendererTurbo(this, 174, 149, textureX, textureY); // Box 281
		bodyModel[101] = new ModelRendererTurbo(this, 152, 118, textureX, textureY); // Box 284
		bodyModel[102] = new ModelRendererTurbo(this, 152, 149, textureX, textureY); // Box 306
		bodyModel[103] = new ModelRendererTurbo(this, 223, 131, textureX, textureY); // Box 307
		bodyModel[104] = new ModelRendererTurbo(this, 234, 130, textureX, textureY); // Box 308
		bodyModel[105] = new ModelRendererTurbo(this, 258, 142, textureX, textureY); // Box 363
		bodyModel[106] = new ModelRendererTurbo(this, 220, 142, textureX, textureY); // Box 310
		bodyModel[107] = new ModelRendererTurbo(this, 349, 156, textureX, textureY); // Box 312
		bodyModel[108] = new ModelRendererTurbo(this, 284, 130, textureX, textureY); // Box 320
		bodyModel[109] = new ModelRendererTurbo(this, 273, 131, textureX, textureY); // Box 321
		bodyModel[110] = new ModelRendererTurbo(this, 270, 142, textureX, textureY); // Box 322
		bodyModel[111] = new ModelRendererTurbo(this, 297, 131, textureX, textureY); // Box 323
		bodyModel[112] = new ModelRendererTurbo(this, 308, 142, textureX, textureY); // Box 324
		bodyModel[113] = new ModelRendererTurbo(this, 152, 127, textureX, textureY); // Box 325
		bodyModel[114] = new ModelRendererTurbo(this, 152, 138, textureX, textureY); // Box 326
		bodyModel[115] = new ModelRendererTurbo(this, 152, 147, textureX, textureY); // Box 296
		bodyModel[116] = new ModelRendererTurbo(this, 152, 136, textureX, textureY); // Box 328
		bodyModel[117] = new ModelRendererTurbo(this, 144, 138, textureX, textureY); // Box 296
		bodyModel[118] = new ModelRendererTurbo(this, 149, 148, textureX, textureY); // Box 280
		bodyModel[119] = new ModelRendererTurbo(this, 141, 148, textureX, textureY); // Box 281
		bodyModel[120] = new ModelRendererTurbo(this, 136, 138, textureX, textureY); // Box 282
		bodyModel[121] = new ModelRendererTurbo(this, 149, 145, textureX, textureY); // Box 333
		bodyModel[122] = new ModelRendererTurbo(this, 141, 145, textureX, textureY); // Box 334
		bodyModel[123] = new ModelRendererTurbo(this, 7, 230, textureX, textureY); // Box 335
		bodyModel[124] = new ModelRendererTurbo(this, 195, 149, textureX, textureY); // Box 336
		bodyModel[125] = new ModelRendererTurbo(this, 188, 156, textureX, textureY); // Box 295
		bodyModel[126] = new ModelRendererTurbo(this, 209, 142, textureX, textureY); // Box 338
		bodyModel[127] = new ModelRendererTurbo(this, 214, 152, textureX, textureY); // Box 339
		bodyModel[128] = new ModelRendererTurbo(this, 206, 152, textureX, textureY); // Box 340
		bodyModel[129] = new ModelRendererTurbo(this, 201, 142, textureX, textureY); // Box 341
		bodyModel[130] = new ModelRendererTurbo(this, 214, 149, textureX, textureY); // Box 342
		bodyModel[131] = new ModelRendererTurbo(this, 206, 149, textureX, textureY); // Box 343
		bodyModel[132] = new ModelRendererTurbo(this, 214, 151, textureX, textureY); // Box 344
		bodyModel[133] = new ModelRendererTurbo(this, 206, 151, textureX, textureY); // Box 345
		bodyModel[134] = new ModelRendererTurbo(this, 149, 147, textureX, textureY); // Box 346
		bodyModel[135] = new ModelRendererTurbo(this, 141, 147, textureX, textureY); // Box 347
		bodyModel[136] = new ModelRendererTurbo(this, 0, 230, textureX, textureY); // Box 348
		bodyModel[137] = new ModelRendererTurbo(this, 188, 154, textureX, textureY); // Box 349
		bodyModel[138] = new ModelRendererTurbo(this, 198, 149, textureX, textureY); // Box 350
		bodyModel[139] = new ModelRendererTurbo(this, 181, 149, textureX, textureY); // Box 351
		bodyModel[140] = new ModelRendererTurbo(this, 178, 107, textureX, textureY); // Box 417 ac
		bodyModel[141] = new ModelRendererTurbo(this, 161, 107, textureX, textureY); // Box 392
		bodyModel[142] = new ModelRendererTurbo(this, 119, 107, textureX, textureY, "lamp"); // Box 393 numberboard
		bodyModel[143] = new ModelRendererTurbo(this, 381, 127, textureX, textureY); // Box 394
		bodyModel[144] = new ModelRendererTurbo(this, 119, 107, textureX, textureY, "lamp"); // Box 395 numberboard
		bodyModel[145] = new ModelRendererTurbo(this, 107, 132, textureX, textureY, "lamp"); // Box 398 glow marker
		bodyModel[146] = new ModelRendererTurbo(this, 107, 132, textureX, textureY, "lamp"); // Box 399 glow marker
		bodyModel[147] = new ModelRendererTurbo(this, 119, 127, textureX, textureY); // Box 252
		bodyModel[148] = new ModelRendererTurbo(this, 126, 128, textureX, textureY); // Box 101
		bodyModel[149] = new ModelRendererTurbo(this, 119, 122, textureX, textureY, "lamp"); // Box 190 ditchlight f u
		bodyModel[150] = new ModelRendererTurbo(this, 126, 123, textureX, textureY, "lamp"); // Box 275 ditchlight f l
		bodyModel[151] = new ModelRendererTurbo(this, 126, 128, textureX, textureY); // Box 444
		bodyModel[152] = new ModelRendererTurbo(this, 126, 123, textureX, textureY, "lamp"); // Box 445 ditchlight f l
		bodyModel[153] = new ModelRendererTurbo(this, 119, 122, textureX, textureY, "lamp"); // Box 446 ditchlight f u
		bodyModel[154] = new ModelRendererTurbo(this, 119, 127, textureX, textureY); // Box 447
		bodyModel[155] = new ModelRendererTurbo(this, 261, 218, textureX, textureY); // Box 435
		bodyModel[156] = new ModelRendererTurbo(this, 261, 218, textureX, textureY); // Box 436
		bodyModel[157] = new ModelRendererTurbo(this, 6, 156, textureX, textureY); // Box 282
		bodyModel[158] = new ModelRendererTurbo(this, 52, 156, textureX, textureY); // Box 283
		bodyModel[159] = new ModelRendererTurbo(this, 19, 154, textureX, textureY); // Box 4
		bodyModel[160] = new ModelRendererTurbo(this, 32, 154, textureX, textureY); // Box 448
		bodyModel[161] = new ModelRendererTurbo(this, 140, 193, textureX, textureY); // Box 301
		bodyModel[162] = new ModelRendererTurbo(this, 137, 196, textureX, textureY); // Box 302
		bodyModel[163] = new ModelRendererTurbo(this, 130, 198, textureX, textureY); // Box 305
		bodyModel[164] = new ModelRendererTurbo(this, 121, 193, textureX, textureY); // Box 306
		bodyModel[165] = new ModelRendererTurbo(this, 118, 196, textureX, textureY); // Box 307
		bodyModel[166] = new ModelRendererTurbo(this, 130, 196, textureX, textureY); // Box 311
		bodyModel[167] = new ModelRendererTurbo(this, 140, 128, textureX, textureY); // Box 312
		bodyModel[168] = new ModelRendererTurbo(this, 140, 123, textureX, textureY, "lamp"); // Box 313 ditchlight r l
		bodyModel[169] = new ModelRendererTurbo(this, 133, 127, textureX, textureY); // Box 314
		bodyModel[170] = new ModelRendererTurbo(this, 133, 122, textureX, textureY, "lamp"); // Box 315 ditchlight r u
		bodyModel[171] = new ModelRendererTurbo(this, 140, 123, textureX, textureY, "lamp"); // Box 316 ditchlight r l
		bodyModel[172] = new ModelRendererTurbo(this, 140, 128, textureX, textureY); // Box 317
		bodyModel[173] = new ModelRendererTurbo(this, 133, 127, textureX, textureY); // Box 318
		bodyModel[174] = new ModelRendererTurbo(this, 133, 122, textureX, textureY, "lamp"); // Box 319 ditchlight r u
		bodyModel[175] = new ModelRendererTurbo(this, 318, 176, textureX, textureY); // Box 320
		bodyModel[176] = new ModelRendererTurbo(this, 65, 154, textureX, textureY); // Box 322
		bodyModel[177] = new ModelRendererTurbo(this, 78, 154, textureX, textureY); // Box 323
		bodyModel[178] = new ModelRendererTurbo(this, 43, 152, textureX, textureY); // Box 280
		bodyModel[179] = new ModelRendererTurbo(this, 89, 152, textureX, textureY); // Box 285
		bodyModel[180] = new ModelRendererTurbo(this, 6, 143, textureX, textureY); // Box 326
		bodyModel[181] = new ModelRendererTurbo(this, 52, 139, textureX, textureY); // Box 327
		bodyModel[182] = new ModelRendererTurbo(this, 65, 137, textureX, textureY); // Box 328
		bodyModel[183] = new ModelRendererTurbo(this, 19, 141, textureX, textureY); // Box 329
		bodyModel[184] = new ModelRendererTurbo(this, 32, 141, textureX, textureY); // Box 330
		bodyModel[185] = new ModelRendererTurbo(this, 43, 139, textureX, textureY); // Box 331
		bodyModel[186] = new ModelRendererTurbo(this, 78, 137, textureX, textureY); // Box 332
		bodyModel[187] = new ModelRendererTurbo(this, 89, 135, textureX, textureY); // Box 333
		bodyModel[188] = new ModelRendererTurbo(this, 444, 74, textureX, textureY); // Box 293
		bodyModel[189] = new ModelRendererTurbo(this, 414, 95, textureX, textureY); // Box 294
		bodyModel[190] = new ModelRendererTurbo(this, 417, 77, textureX, textureY); // Box 295
		bodyModel[191] = new ModelRendererTurbo(this, 425, 81, textureX, textureY); // Box 296
		bodyModel[192] = new ModelRendererTurbo(this, 395, 81, textureX, textureY); // Box 297
		bodyModel[193] = new ModelRendererTurbo(this, 414, 86, textureX, textureY); // Box 300
		bodyModel[194] = new ModelRendererTurbo(this, 416, 80, textureX, textureY); // Box 301
		bodyModel[195] = new ModelRendererTurbo(this, 126, 157, textureX, textureY); // Box 302
		bodyModel[196] = new ModelRendererTurbo(this, 126, 152, textureX, textureY, "lamp"); // Box 303 headlight front
		bodyModel[197] = new ModelRendererTurbo(this, 126, 152, textureX, textureY, "lamp"); // Box 304 headlight front
		bodyModel[198] = new ModelRendererTurbo(this, 119, 107, textureX, textureY, "lamp"); // Box 305 numberboard
		bodyModel[199] = new ModelRendererTurbo(this, 119, 107, textureX, textureY, "lamp"); // Box 306 numberboard
		bodyModel[200] = new ModelRendererTurbo(this, 107, 132, textureX, textureY, "lamp"); // Box 307 glow marker
		bodyModel[201] = new ModelRendererTurbo(this, 107, 132, textureX, textureY, "lamp"); // Box 308 glow marker
		bodyModel[202] = new ModelRendererTurbo(this, 443, 65, textureX, textureY); // Box 309
		bodyModel[203] = new ModelRendererTurbo(this, 470, 65, textureX, textureY); // Box 310
		bodyModel[204] = new ModelRendererTurbo(this, 441, 82, textureX, textureY); // Box 311
		bodyModel[205] = new ModelRendererTurbo(this, 441, 82, textureX, textureY); // Box 312
		bodyModel[206] = new ModelRendererTurbo(this, 434, 71, textureX, textureY, "lamp"); // Box 162 commander beacon L
		bodyModel[207] = new ModelRendererTurbo(this, 433, 75, textureX, textureY); // Box 165
		bodyModel[208] = new ModelRendererTurbo(this, 427, 71, textureX, textureY, "lamp"); // Box 404 commander beacon R
		bodyModel[209] = new ModelRendererTurbo(this, 426, 75, textureX, textureY); // Box 405
		bodyModel[210] = new ModelRendererTurbo(this, 433, 66, textureX, textureY, "cull"); // Box 389 support cull
		bodyModel[211] = new ModelRendererTurbo(this, 424, 66, textureX, textureY); // Box 223
		bodyModel[212] = new ModelRendererTurbo(this, 119, 190, textureX, textureY); // Box 200
		bodyModel[213] = new ModelRendererTurbo(this, 119, 190, textureX, textureY); // Box 201
		bodyModel[214] = new ModelRendererTurbo(this, 138, 190, textureX, textureY); // Box 202
		bodyModel[215] = new ModelRendererTurbo(this, 138, 190, textureX, textureY); // Box 204
		bodyModel[216] = new ModelRendererTurbo(this, 140, 185, textureX, textureY); // Box 431
		bodyModel[217] = new ModelRendererTurbo(this, 121, 185, textureX, textureY); // Box 432
		bodyModel[218] = new ModelRendererTurbo(this, 138, 190, textureX, textureY); // Box 300
		bodyModel[219] = new ModelRendererTurbo(this, 140, 185, textureX, textureY); // Box 303
		bodyModel[220] = new ModelRendererTurbo(this, 138, 190, textureX, textureY); // Box 304
		bodyModel[221] = new ModelRendererTurbo(this, 119, 190, textureX, textureY); // Box 308
		bodyModel[222] = new ModelRendererTurbo(this, 121, 185, textureX, textureY); // Box 309
		bodyModel[223] = new ModelRendererTurbo(this, 119, 190, textureX, textureY); // Box 310
		bodyModel[224] = new ModelRendererTurbo(this, 130, 198, textureX, textureY); // Box 439
		bodyModel[225] = new ModelRendererTurbo(this, 130, 196, textureX, textureY); // Box 440
		bodyModel[226] = new ModelRendererTurbo(this, 130, 198, textureX, textureY); // Box 441
		bodyModel[227] = new ModelRendererTurbo(this, 130, 196, textureX, textureY); // Box 442

		bodyModel[0].addBox(0F, 0F, 0F, 80, 2, 22, 0F); // Box 0
		bodyModel[0].setRotationPoint(-40F, -1F, -11F);

		bodyModel[1].addBox(0F, 0F, 0F, 22, 4, 16, 0F); // Box 2
		bodyModel[1].setRotationPoint(-11F, 5F, -8F);

		bodyModel[2].addBox(0F, 0F, 0F, 0, 8, 20, 0F); // Box 3
		bodyModel[2].setRotationPoint(-44.01F, -1F, -10F);

		bodyModel[3].addBox(0F, 0F, 0F, 4, 2, 14, 0F); // Box 8
		bodyModel[3].setRotationPoint(-44F, -1F, -7F);

		bodyModel[4].addBox(0F, 0F, 0F, 22, 3, 22, 0F); // Box 10
		bodyModel[4].setRotationPoint(-11F, 2F, -11F);

		bodyModel[5].addBox(0F, 0F, 0F, 1, 3, 18, 0F); // Box 19
		bodyModel[5].setRotationPoint(12F, 4F, -9F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 2, 6, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 63
		bodyModel[6].setRotationPoint(-40F, 2F, -11F);

		bodyModel[7].addBox(0F, 0F, 0F, 26, 1, 3, 0F); // Box 156
		bodyModel[7].setRotationPoint(-40F, 1F, -11F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 22, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 157
		bodyModel[8].setRotationPoint(-11F, 5F, -11F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 22, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 158
		bodyModel[9].setRotationPoint(-11F, 5F, 8F);

		bodyModel[10].addBox(0F, 0F, 0F, 4, 0, 3, 0F); // Box 197
		bodyModel[10].setRotationPoint(-44F, 8F, 8F);

		bodyModel[11].addBox(0F, 0F, 0F, 4, 0, 1, 0F); // Box 199
		bodyModel[11].setRotationPoint(-44F, -1F, 7F);

		bodyModel[12].addBox(0F, 0F, 0F, 4, 0, 1, 0F); // Box 203
		bodyModel[12].setRotationPoint(-44F, -1F, -8F);

		bodyModel[13].addBox(0F, 0F, 0F, 4, 0, 3, 0F); // Box 205
		bodyModel[13].setRotationPoint(-44F, 8F, -11F);

		bodyModel[14].addBox(0F, 0F, 0F, 4, 2, 14, 0F); // Box 215
		bodyModel[14].setRotationPoint(40F, -1F, -7F);

		bodyModel[15].addBox(0F, 0F, 0F, 0, 7, 1, 0F); // Box 61
		bodyModel[15].setRotationPoint(-44F, -3F, 10F);

		bodyModel[16].addBox(0F, 0F, 0F, 0, 7, 1, 0F); // Box 63
		bodyModel[16].setRotationPoint(-44F, -3F, -11F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 0, 8, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F); // Box 80
		bodyModel[17].setRotationPoint(-44F, -9F, -8F);

		bodyModel[18].addBox(0F, 0F, 0F, 80, 2, 16, 0F); // Box 251
		bodyModel[18].setRotationPoint(-40F, 1F, -8F);

		bodyModel[19].addBox(0F, 0F, 0F, 0, 8, 20, 0F); // Box 256
		bodyModel[19].setRotationPoint(44.01F, -1F, -10F);

		bodyModel[20].addBox(0F, 0F, 0F, 0, 7, 1, 0F); // Box 259
		bodyModel[20].setRotationPoint(44.01F, -3F, 10F);

		bodyModel[21].addBox(0F, 0F, 0F, 0, 7, 1, 0F); // Box 269
		bodyModel[21].setRotationPoint(44.01F, -3F, -11F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 1, 3, 18, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 19
		bodyModel[22].setRotationPoint(13F, 4F, -9F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 1, 3, 18, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 19
		bodyModel[23].setRotationPoint(11F, 4F, -9F);

		bodyModel[24].addBox(0F, 0F, 0F, 1, 5, 0, 0F); // Box 305
		bodyModel[24].setRotationPoint(12F, 1F, -9.01F);

		bodyModel[25].addBox(0F, 0F, 0F, 1, 5, 0, 0F); // Box 305
		bodyModel[25].setRotationPoint(12F, 1F, 9.01F);

		bodyModel[26].addBox(0F, 0F, 0F, 1, 3, 18, 0F); // Box 19
		bodyModel[26].setRotationPoint(-13F, 4F, -9F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 1, 3, 18, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 19
		bodyModel[27].setRotationPoint(-12F, 4F, -9F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 1, 3, 18, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 19
		bodyModel[28].setRotationPoint(-14F, 4F, -9F);

		bodyModel[29].addBox(0F, 0F, 0F, 1, 5, 0, 0F); // Box 305
		bodyModel[29].setRotationPoint(-13F, 1F, -9.01F);

		bodyModel[30].addBox(0F, 0F, 0F, 1, 5, 0, 0F); // Box 305
		bodyModel[30].setRotationPoint(-13F, 1F, 9.01F);

		bodyModel[31].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 440
		bodyModel[31].setRotationPoint(-27F, 3F, -1F);

		bodyModel[32].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 441
		bodyModel[32].setRotationPoint(25F, 3F, -1F);

		bodyModel[33].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 19
		bodyModel[33].setRotationPoint(7F, 1F, -11.75F);
		bodyModel[33].rotateAngleX = 0.71558499F;

		bodyModel[34].addBox(0F, 0F, -1F, 1, 3, 1, 0F); // Box 19
		bodyModel[34].setRotationPoint(7F, 1F, 11.75F);
		bodyModel[34].rotateAngleX = -0.71558499F;

		bodyModel[35].addShapeBox(0F, 0F, 0F, 2, 7, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 2603
		bodyModel[35].setRotationPoint(-40F, 1F, 7F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 2, 7, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 263
		bodyModel[36].setRotationPoint(38F, 1F, -11F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 5, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Box 193
		bodyModel[37].setRotationPoint(-44F, 1F, -3F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 5, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); // Box 273
		bodyModel[38].setRotationPoint(39F, 1F, -3F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 2, 7, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 270434
		bodyModel[39].setRotationPoint(38F, 1F, 7F);

		bodyModel[40].addBox(0F, 0F, 0F, 2, 1, 14, 0F); // Box 310
		bodyModel[40].setRotationPoint(11F, 3F, -7F);

		bodyModel[41].addBox(0F, 0F, 0F, 2, 1, 14, 0F); // Box 311
		bodyModel[41].setRotationPoint(-13F, 3F, -7F);

		bodyModel[42].addBox(0F, 0F, 0F, 4, 1, 3, 0F); // Box 318
		bodyModel[42].setRotationPoint(24F, 1F, -11F);

		bodyModel[43].addBox(0F, 0F, 0F, 4, 1, 3, 0F); // Box 319
		bodyModel[43].setRotationPoint(-28F, 1F, 8F);

		bodyModel[44].addBox(0F, 0F, 0F, 0, 1, 22, 0F); // Box 320
		bodyModel[44].setRotationPoint(44.01F, 7F, -11F);

		bodyModel[45].addBox(0F, 0F, 0F, 0, 1, 22, 0F); // Box 321
		bodyModel[45].setRotationPoint(-44.01F, 7F, -11F);

		bodyModel[46].addBox(0F, 0F, 0F, 5, 1, 1, 0F); // Box 253
		bodyModel[46].setRotationPoint(-34F, 1F, 9F);
		bodyModel[46].rotateAngleZ = -0.27925268F;

		bodyModel[47].addBox(0F, 0F, 0F, 5, 1, 1, 0F); // Box 280
		bodyModel[47].setRotationPoint(-39F, 1F, 9F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, -2F, 2F, 0F, -2F, 2F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 298
		bodyModel[48].setRotationPoint(-44F, -9F, -10F);
		bodyModel[48].rotateAngleY = -3.14159265F;

		bodyModel[49].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, -2F, 2F, 0F, -2F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 299
		bodyModel[49].setRotationPoint(-44F, -9F, 11F);
		bodyModel[49].rotateAngleY = -3.14159265F;

		bodyModel[50].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, -2F, 2F, 0F, -2F, 2F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 300
		bodyModel[50].setRotationPoint(44.01F, -9F, -10F);
		bodyModel[50].rotateAngleY = -3.14159265F;

		bodyModel[51].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, -2F, 2F, 0F, -2F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 301
		bodyModel[51].setRotationPoint(44.01F, -9F, 11F);
		bodyModel[51].rotateAngleY = -3.14159265F;

		bodyModel[52].addBox(0F, 0F, 0F, 4, 2, 0, 0F); // Box 411
		bodyModel[52].setRotationPoint(-44F, 6F, -8F);

		bodyModel[53].addBox(0F, 0F, 0F, 4, 2, 0, 0F); // Box 412
		bodyModel[53].setRotationPoint(-44F, 6F, 8F);

		bodyModel[54].addBox(0F, 0F, 0F, 2, 1, 22, 0F); // Box 322
		bodyModel[54].setRotationPoint(25F, 2F, -11F);

		bodyModel[55].addBox(0F, 0F, 0F, 2, 1, 22, 0F); // Box 323
		bodyModel[55].setRotationPoint(-27F, 2F, -11F);

		bodyModel[56].addBox(0F, 0F, 0F, 20, 18, 14, 0F); // Box 82
		bodyModel[56].setRotationPoint(19F, -19F, -7F);

		bodyModel[57].addBox(-1F, 0F, 0F, 19, 21, 14, 0F); // Box 96
		bodyModel[57].setRotationPoint(-19F, -22F, -7F);

		bodyModel[58].addBox(0F, 0F, 0F, 20, 19, 14, 0F); // Box 97
		bodyModel[58].setRotationPoint(-1F, -20F, -7F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 2, 19, 7, 0F,1F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -1F, 1F, 0F, -1F); // Box 124
		bodyModel[59].setRotationPoint(40F, -20F, -7F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 2, 19, 7, 0F,1F, 0F, -1F, 0F, 0F, -1F, -3F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -1F, 0F, 0F, -1F, -3F, 0F, 0F, 1F, 0F, 0F); // Box 130
		bodyModel[60].setRotationPoint(40F, -20F, 0F);

		bodyModel[61].addBox(0F, 0F, 0F, 3, 12, 2, 0F); // Box 131
		bodyModel[61].setRotationPoint(39F, -13F, -1F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 3, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[62].setRotationPoint(14F, -22F, -3F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 20, 1, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 97
		bodyModel[63].setRotationPoint(-1F, -21F, -7F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 20, 1, 4, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 97
		bodyModel[64].setRotationPoint(-1F, -21F, 3F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 20, 1, 6, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 97
		bodyModel[65].setRotationPoint(-1F, -21F, -3F);

		bodyModel[66].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 219
		bodyModel[66].setRotationPoint(40F, -13F, -0.5F);
		bodyModel[66].rotateAngleZ = 0.78539816F;

		bodyModel[67].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 31
		bodyModel[67].setRotationPoint(42F, -20F, -1F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 247 headlight rear
		bodyModel[68].setRotationPoint(41.5F, -20.05F, -1F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 248 headlight rear
		bodyModel[69].setRotationPoint(41.5F, -18.05F, -1F);

		bodyModel[70].addShapeBox(0F, -1F, 0F, 21, 2, 11, 0F,0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 88
		bodyModel[70].setRotationPoint(19F, -21F, -11F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 15, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 119
		bodyModel[71].setRotationPoint(22F, -18F, 7F);

		bodyModel[72].addBox(0F, 0F, 0F, 21, 1, 4, 0F); // Box 127
		bodyModel[72].setRotationPoint(19F, -19F, -9F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 15, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[73].setRotationPoint(22F, -18F, -9F);

		bodyModel[74].addBox(0F, 0F, 0F, 21, 1, 4, 0F); // Box 130
		bodyModel[74].setRotationPoint(19F, -19F, 5F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 21, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 135
		bodyModel[75].setRotationPoint(19F, -19F, -11F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 21, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 136
		bodyModel[76].setRotationPoint(19F, -19F, 9F);

		bodyModel[77].addBox(0F, 0F, 0F, 3, 5, 2, 0F); // Box 132
		bodyModel[77].setRotationPoint(39F, -21F, -1F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,1F, 0F, -1F, 0F, 0F, -1F, -2F, 0F, -2F, 1F, 0F, -2F, 1F, 0F, -1F, 0F, 0F, -1F, -2F, 0F, -2F, 1F, 0F, -2F); // Box 133
		bodyModel[78].setRotationPoint(41F, -21F, 0F);

		bodyModel[79].addBox(0F, -1F, 0F, 21, 1, 22, 0F); // Box 233
		bodyModel[79].setRotationPoint(19F, -19F, -11F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,1F, 0F, -2F, -2F, 0F, -2F, 0F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, -2F, -2F, 0F, -2F, 0F, 0F, -1F, 1F, 0F, -1F); // Box 173
		bodyModel[80].setRotationPoint(41F, -21F, -7F);

		bodyModel[81].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 4
		bodyModel[81].setRotationPoint(-48F, 3F, -1.5F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[82].setRotationPoint(-45F, 2.5F, -2F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 211
		bodyModel[83].setRotationPoint(44F, 2.5F, -2F);

		bodyModel[84].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 212
		bodyModel[84].setRotationPoint(45F, 3F, -1.5F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F,-1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 162
		bodyModel[85].setRotationPoint(-46F, -1F, -8F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 163
		bodyModel[86].setRotationPoint(-46F, -1F, -2F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F); // Box 164
		bodyModel[87].setRotationPoint(-46F, -1F, 2F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 121
		bodyModel[88].setRotationPoint(44F, -1F, -2F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F,0F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 122
		bodyModel[89].setRotationPoint(44F, -1F, -8F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F); // Box 123
		bodyModel[90].setRotationPoint(44F, -1F, 2F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 13, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 138
		bodyModel[91].setRotationPoint(-20F, -5F, 7F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 138
		bodyModel[92].setRotationPoint(-7F, -3F, 7F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 10, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 254
		bodyModel[93].setRotationPoint(-20F, -5F, -11F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 1, 0, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 255
		bodyModel[94].setRotationPoint(-10F, -3F, -11F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 0, 1, 18, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 21
		bodyModel[95].setRotationPoint(-44F, 8F, -9F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 0, 1, 18, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 257
		bodyModel[96].setRotationPoint(44F, 8F, -9F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 13, 4, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 258
		bodyModel[97].setRotationPoint(-33F, -5F, -11F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 3, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 275
		bodyModel[98].setRotationPoint(-36F, -5F, -11F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 3, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 276
		bodyModel[99].setRotationPoint(-36F, -5F, 7F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 3, 8, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 281
		bodyModel[100].setRotationPoint(-36F, -13F, -11F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 46, 8, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 284
		bodyModel[101].setRotationPoint(-6F, -9F, -11F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 10, 8, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 306
		bodyModel[102].setRotationPoint(-20F, -13F, -11F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 0, 8, 5, 0F,2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 307
		bodyModel[103].setRotationPoint(-44F, -9F, 3F);

		bodyModel[104].addBox(0F, 0F, 0F, 0, 8, 6, 0F); // Box 308
		bodyModel[104].setRotationPoint(-46F, -9F, -3F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 363
		bodyModel[105].setRotationPoint(-44F, -8F, -8F);
		bodyModel[105].rotateAngleY = 0.38397244F;

		bodyModel[106].addShapeBox(0F, 0F, -1F, 0, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 310
		bodyModel[106].setRotationPoint(-44F, -8F, 8F);
		bodyModel[106].rotateAngleY = -0.38397244F;

		bodyModel[107].addShapeBox(0F, -1F, 0F, 21, 2, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 312
		bodyModel[107].setRotationPoint(19F, -21F, 0F);

		bodyModel[108].addBox(0F, 0F, 0F, 0, 8, 6, 0F); // Box 320
		bodyModel[108].setRotationPoint(46F, -9F, -3F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 0, 8, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F); // Box 321
		bodyModel[109].setRotationPoint(44F, -9F, -8F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 322
		bodyModel[110].setRotationPoint(44F, -8F, -8F);
		bodyModel[110].rotateAngleY = -0.38397244F;

		bodyModel[111].addShapeBox(0F, 0F, 0F, 0, 8, 5, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 323
		bodyModel[111].setRotationPoint(44F, -9F, 3F);

		bodyModel[112].addShapeBox(0F, 0F, -1F, 0, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 324
		bodyModel[112].setRotationPoint(44F, -8F, 8F);
		bodyModel[112].rotateAngleY = 0.38397244F;

		bodyModel[113].addShapeBox(0F, 0F, 0F, 43, 8, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 325
		bodyModel[113].setRotationPoint(-3F, -9F, 11F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 13, 8, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 326
		bodyModel[114].setRotationPoint(-20F, -13F, 11F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F); // Box 296
		bodyModel[115].setRotationPoint(-10F, -13F, -11F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F); // Box 328
		bodyModel[116].setRotationPoint(-7F, -13F, 11F);

		bodyModel[117].addBox(0F, 0F, 0F, 0, 13, 2, 0F); // Box 296
		bodyModel[117].setRotationPoint(40.5F, -9F, -11F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 0, 4, 1, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 280
		bodyModel[118].setRotationPoint(40.5F, -5F, -11.5F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 0, 4, 1, 0F,0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 281
		bodyModel[119].setRotationPoint(40.5F, -5F, 10.5F);

		bodyModel[120].addBox(0F, 0F, 0F, 0, 13, 2, 0F); // Box 282
		bodyModel[120].setRotationPoint(40.5F, -9F, 9F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 333
		bodyModel[121].setRotationPoint(40F, -9F, -11F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 334
		bodyModel[122].setRotationPoint(40F, -9F, 11F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 1, 4, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 335
		bodyModel[123].setRotationPoint(-37F, -5F, -11F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 1, 8, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 336
		bodyModel[124].setRotationPoint(-40F, -9F, -11F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F); // Box 295
		bodyModel[125].setRotationPoint(-39F, -13F, -11.01F);

		bodyModel[126].addBox(0F, 0F, 0F, 0, 13, 2, 0F); // Box 338
		bodyModel[126].setRotationPoint(-40.5F, -9F, -11F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 0, 4, 1, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 339
		bodyModel[127].setRotationPoint(-40.5F, -5F, -11.5F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 0, 4, 1, 0F,0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 340
		bodyModel[128].setRotationPoint(-40.5F, -5F, 10.5F);

		bodyModel[129].addBox(0F, 0F, 0F, 0, 13, 2, 0F); // Box 341
		bodyModel[129].setRotationPoint(-40.5F, -9F, 9F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 342
		bodyModel[130].setRotationPoint(-41F, -9F, -11F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 343
		bodyModel[131].setRotationPoint(-41F, -9F, 11F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 344
		bodyModel[132].setRotationPoint(-41F, 3F, -11F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 345
		bodyModel[133].setRotationPoint(-41F, 3F, 11F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 346
		bodyModel[134].setRotationPoint(40F, 3F, -11F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 347
		bodyModel[135].setRotationPoint(40F, 3F, 11F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 1, 0, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 348
		bodyModel[136].setRotationPoint(-37F, -3F, -11F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F); // Box 349
		bodyModel[137].setRotationPoint(-39F, -13F, 11.01F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 1, 8, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 350
		bodyModel[138].setRotationPoint(-40F, -9F, 11.02F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 3, 8, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 351
		bodyModel[139].setRotationPoint(-36F, -13F, 11.02F);

		bodyModel[140].addBox(0F, 0F, 0F, 4, 2, 8, 0F); // Box 417 ac
		bodyModel[140].setRotationPoint(-24F, -23.5F, -4F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 392
		bodyModel[141].setRotationPoint(-28F, -23F, 0F);

		bodyModel[142].addBox(0F, 0F, 0F, 0, 2, 5, 0F); // Box 393 numberboard
		bodyModel[142].setRotationPoint(39.51F, -16F, -6F);
		bodyModel[142].rotateAngleY = -0.4712389F;

		bodyModel[143].addBox(0F, 0F, 0F, 1, 3, 2, 0F); // Box 394
		bodyModel[143].setRotationPoint(39F, -16F, -1F);

		bodyModel[144].addBox(0F, 0F, -5F, 0, 2, 5, 0F); // Box 395 numberboard
		bodyModel[144].setRotationPoint(39.51F, -16F, 6F);
		bodyModel[144].rotateAngleY = 0.4712389F;

		bodyModel[145].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 398 glow marker
		bodyModel[145].setRotationPoint(39F, -13.5F, -6.25F);

		bodyModel[146].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 399 glow marker
		bodyModel[146].setRotationPoint(39F, -13.5F, 5.25F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 252
		bodyModel[147].setRotationPoint(-45F, -4F, -5.75F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 101
		bodyModel[148].setRotationPoint(-44.5F, 0F, -6.75F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 190 ditchlight f u
		bodyModel[149].setRotationPoint(-45.25F, -4F, -5.75F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 275 ditchlight f l
		bodyModel[150].setRotationPoint(-44.75F, 0F, -6.75F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 444
		bodyModel[151].setRotationPoint(-44.5F, 0F, 4.75F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 445 ditchlight f l
		bodyModel[152].setRotationPoint(-44.75F, 0F, 4.75F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 446 ditchlight f u
		bodyModel[153].setRotationPoint(-45.25F, -4F, 3.75F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 447
		bodyModel[154].setRotationPoint(-45F, -4F, 3.75F);

		bodyModel[155].addBox(-1F, 0F, 0F, 7, 4, 1, 0F); // Box 435
		bodyModel[155].setRotationPoint(-8F, -21F, -7.5F);

		bodyModel[156].addBox(-1F, 0F, 0F, 7, 4, 1, 0F); // Box 436
		bodyModel[156].setRotationPoint(-8F, -21F, 6.5F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,-1F, 0F, 0F, 0.5F, 0F, 0F, 3F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, -1F, -2.5F, 0F, -1F); // Box 282
		bodyModel[157].setRotationPoint(-48F, 7F, 0F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,-3.5F, 0F, 0F, 3F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -2.5F, 0F, -1F, 2F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 283
		bodyModel[158].setRotationPoint(-48F, 7F, -10F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F); // Box 4
		bodyModel[159].setRotationPoint(-47F, 6F, 0F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F); // Box 448
		bodyModel[160].setRotationPoint(-47F, 5F, 2F);

		bodyModel[161].addBox(0F, 0F, 0F, 4, 2, 0, 0F); // Box 301
		bodyModel[161].setRotationPoint(40F, 6F, -8F);

		bodyModel[162].addBox(0F, 0F, 0F, 4, 0, 3, 0F); // Box 302
		bodyModel[162].setRotationPoint(40F, 8F, -11F);

		bodyModel[163].addBox(0F, 0F, 0F, 4, 0, 1, 0F); // Box 305
		bodyModel[163].setRotationPoint(40F, -1F, -8F);

		bodyModel[164].addBox(0F, 0F, 0F, 4, 2, 0, 0F); // Box 306
		bodyModel[164].setRotationPoint(40F, 6F, 8F);

		bodyModel[165].addBox(0F, 0F, 0F, 4, 0, 3, 0F); // Box 307
		bodyModel[165].setRotationPoint(40F, 8F, 8F);

		bodyModel[166].addBox(0F, 0F, 0F, 4, 0, 1, 0F); // Box 311
		bodyModel[166].setRotationPoint(40F, -1F, 7F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 312
		bodyModel[167].setRotationPoint(43.5F, 0F, -6.75F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 313 ditchlight r l
		bodyModel[168].setRotationPoint(43.75F, 0F, -6.75F);

		bodyModel[169].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 314
		bodyModel[169].setRotationPoint(44F, -4F, -5.75F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 315 ditchlight r u
		bodyModel[170].setRotationPoint(44.25F, -4F, -5.75F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 316 ditchlight r l
		bodyModel[171].setRotationPoint(43.75F, 0F, 4.75F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 317
		bodyModel[172].setRotationPoint(43.5F, 0F, 4.75F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 318
		bodyModel[173].setRotationPoint(44F, -4F, 3.75F);

		bodyModel[174].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 319 ditchlight r u
		bodyModel[174].setRotationPoint(44.25F, -4F, 3.75F);

		bodyModel[175].addBox(0F, 0F, 0F, 4, 1, 3, 0F); // Box 320
		bodyModel[175].setRotationPoint(24F, 1F, 8F);

		bodyModel[176].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,-2.5F, 0F, 0F, 2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 322
		bodyModel[176].setRotationPoint(-47F, 6F, -10F);

		bodyModel[177].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,-2.5F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 323
		bodyModel[177].setRotationPoint(-47F, 5F, -10F);

		bodyModel[178].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0.5F, 0F, 0F, -1F, 0F, 0F, 1F, 1F, 0F, -1.5F, 1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F); // Box 280
		bodyModel[178].setRotationPoint(-47F, 4F, 2F);

		bodyModel[179].addShapeBox(0F, 0F, -2F, 1, 1, 8, 0F,-1.5F, 1F, 0F, 1F, 1F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 285
		bodyModel[179].setRotationPoint(-47F, 4F, -8F);

		bodyModel[180].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,0.5F, 0F, 0F, -1F, 0F, 0F, -3.5F, 0F, 0F, 3F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, -1F, 2F, 0F, -1F); // Box 326
		bodyModel[180].setRotationPoint(47F, 7F, 0F);

		bodyModel[181].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,3F, 0F, 0F, -3.5F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 2F, 0F, -1F, -2.5F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 327
		bodyModel[181].setRotationPoint(47F, 7F, -10F);

		bodyModel[182].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,2F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 328
		bodyModel[182].setRotationPoint(46F, 6F, -10F);

		bodyModel[183].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F); // Box 329
		bodyModel[183].setRotationPoint(46F, 6F, 0F);

		bodyModel[184].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F); // Box 330
		bodyModel[184].setRotationPoint(46F, 5F, 2F);

		bodyModel[185].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,-1F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 1F, 0F, 1F, 1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F); // Box 331
		bodyModel[185].setRotationPoint(46F, 4F, 2F);

		bodyModel[186].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,2F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 332
		bodyModel[186].setRotationPoint(46F, 5F, -10F);

		bodyModel[187].addShapeBox(0F, 0F, -2F, 1, 1, 8, 0F,1F, 1F, 0F, -1.5F, 1F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 333
		bodyModel[187].setRotationPoint(46F, 4F, -8F);

		bodyModel[188].addBox(-1F, 0F, 0F, 19, 21, 14, 0F); // Box 293
		bodyModel[188].setRotationPoint(-38F, -22F, -7F);

		bodyModel[189].addBox(0F, 0F, 0F, 3, 12, 2, 0F); // Box 294
		bodyModel[189].setRotationPoint(-42F, -13F, -1F);

		bodyModel[190].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 295
		bodyModel[190].setRotationPoint(-41.5F, -13F, -0.5F);
		bodyModel[190].rotateAngleZ = 0.78539816F;

		bodyModel[191].addShapeBox(0F, 0F, 0F, 2, 21, 7, 0F,-3F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -1F, 0F, 0F, -1F, -3F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -1F, 0F, 0F, -1F); // Box 296
		bodyModel[191].setRotationPoint(-42F, -22F, -7F);

		bodyModel[192].addShapeBox(0F, 0F, 0F, 2, 21, 7, 0F,0F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, -3F, 0F, 0F); // Box 297
		bodyModel[192].setRotationPoint(-42F, -22F, 0F);

		bodyModel[193].addBox(0F, 0F, 0F, 3, 6, 2, 0F); // Box 300
		bodyModel[193].setRotationPoint(-42F, -22F, -1F);

		bodyModel[194].addBox(0F, 0F, 0F, 1, 3, 2, 0F); // Box 301
		bodyModel[194].setRotationPoint(-40F, -16F, -1F);

		bodyModel[195].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Box 302
		bodyModel[195].setRotationPoint(-43F, -20F, -1F);

		bodyModel[196].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 303 headlight front
		bodyModel[196].setRotationPoint(-42.5F, -18.05F, -1F);

		bodyModel[197].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 304 headlight front
		bodyModel[197].setRotationPoint(-42.5F, -20.05F, -1F);

		bodyModel[198].addBox(0F, 0F, 0F, 0, 2, 5, 0F); // Box 305 numberboard
		bodyModel[198].setRotationPoint(-39.51F, -16F, -6F);
		bodyModel[198].rotateAngleY = 0.4712389F;

		bodyModel[199].addBox(0F, 0F, -5F, 0, 2, 5, 0F); // Box 306 numberboard
		bodyModel[199].setRotationPoint(-39.51F, -16F, 6F);
		bodyModel[199].rotateAngleY = -0.4712389F;

		bodyModel[200].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 307 glow marker
		bodyModel[200].setRotationPoint(-40.02F, -13.5F, 5.25F);

		bodyModel[201].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 308 glow marker
		bodyModel[201].setRotationPoint(-40.02F, -13.5F, -6.25F);

		bodyModel[202].addShapeBox(0F, 0F, 0F, 13, 8, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 309
		bodyModel[202].setRotationPoint(-33F, -13F, -11F);

		bodyModel[203].addShapeBox(0F, 0F, 0F, 13, 8, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 310
		bodyModel[203].setRotationPoint(-33F, -13F, 11F);

		bodyModel[204].addBox(-1F, 0F, 0F, 7, 4, 1, 0F); // Box 311
		bodyModel[204].setRotationPoint(-36F, -21F, -7.5F);

		bodyModel[205].addBox(-1F, 0F, 0F, 7, 4, 1, 0F); // Box 312
		bodyModel[205].setRotationPoint(-36F, -21F, 6.5F);

		bodyModel[206].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 162 commander beacon L
		bodyModel[206].setRotationPoint(-22.47F, -23F, -8.5F);

		bodyModel[207].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0.3F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, 0.3F, -0.5F, 0.1F, 0.3F, 0F, 0.1F, -1F, 0F, 0.1F, -1F, 0F, 0.1F, 0.3F, 0F, 0.1F); // Box 165
		bodyModel[207].setRotationPoint(-22.32F, -22F, -8.5F);

		bodyModel[208].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 404 commander beacon R
		bodyModel[208].setRotationPoint(-22.47F, -23F, 7.5F);

		bodyModel[209].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0.3F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, 0.3F, -0.5F, 0.1F, 0.3F, 0F, 0.1F, -1F, 0F, 0.1F, -1F, 0F, 0.1F, 0.3F, 0F, 0.1F); // Box 405
		bodyModel[209].setRotationPoint(-22.32F, -22F, 7.5F);

		bodyModel[210].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 389 support cull
		bodyModel[210].setRotationPoint(-23F, -21F, -9F);

		bodyModel[211].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 223
		bodyModel[211].setRotationPoint(-23F, -21F, 7F);

		bodyModel[212].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 200
		bodyModel[212].setRotationPoint(-44F, 3F, 6.5F);

		bodyModel[213].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 201
		bodyModel[213].setRotationPoint(-44F, 5.5F, 7F);

		bodyModel[214].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 202
		bodyModel[214].setRotationPoint(-44F, 5.5F, -9F);

		bodyModel[215].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 204
		bodyModel[215].setRotationPoint(-44F, 3F, -8.5F);

		bodyModel[216].addBox(0F, 0F, 0F, 4, 4, 0, 0F); // Box 431
		bodyModel[216].setRotationPoint(-44F, 2F, -7F);

		bodyModel[217].addBox(0F, 0F, 0F, 4, 4, 0, 0F); // Box 432
		bodyModel[217].setRotationPoint(-44F, 2F, 7F);

		bodyModel[218].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 300
		bodyModel[218].setRotationPoint(40F, 5.5F, -9F);

		bodyModel[219].addBox(0F, 0F, 0F, 4, 4, 0, 0F); // Box 303
		bodyModel[219].setRotationPoint(40F, 2F, -7F);

		bodyModel[220].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 304
		bodyModel[220].setRotationPoint(40F, 3F, -8.5F);

		bodyModel[221].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 308
		bodyModel[221].setRotationPoint(40F, 5.5F, 7F);

		bodyModel[222].addBox(0F, 0F, 0F, 4, 4, 0, 0F); // Box 309
		bodyModel[222].setRotationPoint(40F, 2F, 7F);

		bodyModel[223].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 310
		bodyModel[223].setRotationPoint(40F, 3F, 6.5F);

		bodyModel[224].addBox(0F, 0F, 0F, 4, 0, 1, 0F); // Box 439
		bodyModel[224].setRotationPoint(-44F, 1F, -8F);

		bodyModel[225].addBox(0F, 0F, 0F, 4, 0, 1, 0F); // Box 440
		bodyModel[225].setRotationPoint(-44F, 1F, 7F);

		bodyModel[226].addBox(0F, 0F, 0F, 4, 0, 1, 0F); // Box 441
		bodyModel[226].setRotationPoint(40F, 1F, -8F);

		bodyModel[227].addBox(0F, 0F, 0F, 4, 0, 1, 0F); // Box 442
		bodyModel[227].setRotationPoint(40F, 1F, 7F);
	}
	ModelFB2 theTrucks2 = new ModelFB2();
	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		for (int i = 0; i < 228; i++) {
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
		if (entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor() == 14321){
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/fb2_up.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.65, 0.33, 0);
			theTrucks2.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(3.27, 0, 0);
			theTrucks2.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else if (entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor() == 1){
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/fb2_Grey.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.65, 0.33, 0);
			theTrucks2.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(3.27, 0, 0);
			theTrucks2.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/fb2_Black.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.65, 0.33, 0);
			theTrucks2.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(3.27, 0, 0);
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
				add(new double[]{0.6D, 1.35D, 0.0D});
			}
		};
	}
}