//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2021 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 28.05.2021 - 22:54:26
// Last changed on: 28.05.2021 - 22:54:26

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

public class ModelSW1500 extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 256;

	public ModelSW1500() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[397];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 11, 230, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 48, 217, textureX, textureY); // Box 52
		bodyModel[2] = new ModelRendererTurbo(this, 48, 217, textureX, textureY); // Box 53
		bodyModel[3] = new ModelRendererTurbo(this, 37, 215, textureX, textureY); // Box 2
		bodyModel[4] = new ModelRendererTurbo(this, 37, 215, textureX, textureY); // Box 146
		bodyModel[5] = new ModelRendererTurbo(this, 13, 43, textureX, textureY); // Box 246
		bodyModel[6] = new ModelRendererTurbo(this, 10, 62, textureX, textureY); // Box 61
		bodyModel[7] = new ModelRendererTurbo(this, 54, 62, textureX, textureY); // Box 63
		bodyModel[8] = new ModelRendererTurbo(this, 1, 237, textureX, textureY); // Box 197
		bodyModel[9] = new ModelRendererTurbo(this, 17, 38, textureX, textureY); // Box 144
		bodyModel[10] = new ModelRendererTurbo(this, 13, 53, textureX, textureY); // Box 226
		bodyModel[11] = new ModelRendererTurbo(this, 11, 49, textureX, textureY); // Box 227
		bodyModel[12] = new ModelRendererTurbo(this, 11, 224, textureX, textureY); // Box 40
		bodyModel[13] = new ModelRendererTurbo(this, 64, 43, textureX, textureY); // Box 55
		bodyModel[14] = new ModelRendererTurbo(this, 62, 49, textureX, textureY); // Box 56
		bodyModel[15] = new ModelRendererTurbo(this, 64, 53, textureX, textureY); // Box 57
		bodyModel[16] = new ModelRendererTurbo(this, 68, 38, textureX, textureY); // Box 58
		bodyModel[17] = new ModelRendererTurbo(this, 105, 62, textureX, textureY); // Box 59
		bodyModel[18] = new ModelRendererTurbo(this, 61, 62, textureX, textureY); // Box 61
		bodyModel[19] = new ModelRendererTurbo(this, 100, 67, textureX, textureY); // Box 202
		bodyModel[20] = new ModelRendererTurbo(this, 111, 69, textureX, textureY); // Box 204
		bodyModel[21] = new ModelRendererTurbo(this, 111, 72, textureX, textureY); // Box 301
		bodyModel[22] = new ModelRendererTurbo(this, 14, 37, textureX, textureY); // Box 66
		bodyModel[23] = new ModelRendererTurbo(this, 25, 39, textureX, textureY); // Box 67
		bodyModel[24] = new ModelRendererTurbo(this, 25, 42, textureX, textureY); // Box 68
		bodyModel[25] = new ModelRendererTurbo(this, 62, 102, textureX, textureY); // Box 5
		bodyModel[26] = new ModelRendererTurbo(this, 190, 168, textureX, textureY, "cull"); // Box 138 intake cull
		bodyModel[27] = new ModelRendererTurbo(this, 1, 187, textureX, textureY); // Box 240
		bodyModel[28] = new ModelRendererTurbo(this, 155, 76, textureX, textureY); // Box 249
		bodyModel[29] = new ModelRendererTurbo(this, 155, 72, textureX, textureY); // Box 250
		bodyModel[30] = new ModelRendererTurbo(this, 177, 69, textureX, textureY); // Box 251
		bodyModel[31] = new ModelRendererTurbo(this, 177, 74, textureX, textureY); // Box 252
		bodyModel[32] = new ModelRendererTurbo(this, 177, 82, textureX, textureY); // Box 253
		bodyModel[33] = new ModelRendererTurbo(this, 153, 80, textureX, textureY); // Box 254
		bodyModel[34] = new ModelRendererTurbo(this, 153, 85, textureX, textureY); // Box 255
		bodyModel[35] = new ModelRendererTurbo(this, 186, 69, textureX, textureY); // Box 260
		bodyModel[36] = new ModelRendererTurbo(this, 88, 202, textureX, textureY); // Box 264
		bodyModel[37] = new ModelRendererTurbo(this, 77, 205, textureX, textureY); // Box 265
		bodyModel[38] = new ModelRendererTurbo(this, 72, 202, textureX, textureY); // Box 266
		bodyModel[39] = new ModelRendererTurbo(this, 99, 205, textureX, textureY); // Box 269
		bodyModel[40] = new ModelRendererTurbo(this, 110, 202, textureX, textureY); // Box 270
		bodyModel[41] = new ModelRendererTurbo(this, 124, 208, textureX, textureY); // Box 271
		bodyModel[42] = new ModelRendererTurbo(this, 95, 203, textureX, textureY); // Box 274
		bodyModel[43] = new ModelRendererTurbo(this, 84, 203, textureX, textureY); // Box 275
		bodyModel[44] = new ModelRendererTurbo(this, 144, 98, textureX, textureY); // Box 17
		bodyModel[45] = new ModelRendererTurbo(this, 175, 98, textureX, textureY); // Box 47
		bodyModel[46] = new ModelRendererTurbo(this, 207, 102, textureX, textureY); // Box 107
		bodyModel[47] = new ModelRendererTurbo(this, 8, 167, textureX, textureY); // Box 279
		bodyModel[48] = new ModelRendererTurbo(this, 144, 108, textureX, textureY); // Box 293
		bodyModel[49] = new ModelRendererTurbo(this, 254, 113, textureX, textureY); // Box 350
		bodyModel[50] = new ModelRendererTurbo(this, 254, 141, textureX, textureY); // Box 351
		bodyModel[51] = new ModelRendererTurbo(this, 86, 167, textureX, textureY); // Box 352
		bodyModel[52] = new ModelRendererTurbo(this, 33, 160, textureX, textureY); // Box 353
		bodyModel[53] = new ModelRendererTurbo(this, 67, 160, textureX, textureY); // Box 354
		bodyModel[54] = new ModelRendererTurbo(this, 111, 150, textureX, textureY); // Box 355
		bodyModel[55] = new ModelRendererTurbo(this, 150, 164, textureX, textureY); // Box 315 door swing right
		bodyModel[56] = new ModelRendererTurbo(this, 52, 163, textureX, textureY); // Box 61 door swing right
		bodyModel[57] = new ModelRendererTurbo(this, 250, 145, textureX, textureY); // Box 368
		bodyModel[58] = new ModelRendererTurbo(this, 229, 141, textureX, textureY); // Box 370
		bodyModel[59] = new ModelRendererTurbo(this, 226, 25, textureX, textureY); // Box 372
		bodyModel[60] = new ModelRendererTurbo(this, 231, 25, textureX, textureY); // Box 375
		bodyModel[61] = new ModelRendererTurbo(this, 26, 159, textureX, textureY); // Box 386
		bodyModel[62] = new ModelRendererTurbo(this, 212, 107, textureX, textureY); // Box 33
		bodyModel[63] = new ModelRendererTurbo(this, 150, 40, textureX, textureY); // Box 399
		bodyModel[64] = new ModelRendererTurbo(this, 140, 33, textureX, textureY); // Box 287
		bodyModel[65] = new ModelRendererTurbo(this, 143, 24, textureX, textureY); // Box 288
		bodyModel[66] = new ModelRendererTurbo(this, 140, 39, textureX, textureY); // Box 289
		bodyModel[67] = new ModelRendererTurbo(this, 143, 37, textureX, textureY); // Box 290
		bodyModel[68] = new ModelRendererTurbo(this, 1, 31, textureX, textureY); // Box 78
		bodyModel[69] = new ModelRendererTurbo(this, 1, 31, textureX, textureY); // Box 188
		bodyModel[70] = new ModelRendererTurbo(this, 8, 31, textureX, textureY, "lamp"); // Box 189 lamp ditchlight front up
		bodyModel[71] = new ModelRendererTurbo(this, 8, 31, textureX, textureY, "lamp"); // Box 190 lamp ditchlight front up
		bodyModel[72] = new ModelRendererTurbo(this, 8, 36, textureX, textureY, "lamp"); // Box 416 lamp ditchlight front down
		bodyModel[73] = new ModelRendererTurbo(this, 1, 36, textureX, textureY); // Box 417
		bodyModel[74] = new ModelRendererTurbo(this, 8, 36, textureX, textureY, "lamp"); // Box 418 lamp ditchlight front down
		bodyModel[75] = new ModelRendererTurbo(this, 1, 36, textureX, textureY); // Box 419
		bodyModel[76] = new ModelRendererTurbo(this, 1, 55, textureX, textureY, "lamp"); // Box 180 lamp ditchlight rear down
		bodyModel[77] = new ModelRendererTurbo(this, 1, 50, textureX, textureY); // Box 181
		bodyModel[78] = new ModelRendererTurbo(this, 8, 45, textureX, textureY, "lamp"); // Box 182 lamp ditchlight rear up
		bodyModel[79] = new ModelRendererTurbo(this, 1, 45, textureX, textureY); // Box 183
		bodyModel[80] = new ModelRendererTurbo(this, 1, 55, textureX, textureY, "lamp"); // Box 184 lamp ditchlight rear down
		bodyModel[81] = new ModelRendererTurbo(this, 1, 50, textureX, textureY); // Box 185
		bodyModel[82] = new ModelRendererTurbo(this, 8, 45, textureX, textureY, "lamp"); // Box 186 lamp ditchlight rear up
		bodyModel[83] = new ModelRendererTurbo(this, 1, 45, textureX, textureY); // Box 187
		bodyModel[84] = new ModelRendererTurbo(this, 233, 131, textureX, textureY); // Box 188
		bodyModel[85] = new ModelRendererTurbo(this, 237, 132, textureX, textureY); // Box 189
		bodyModel[86] = new ModelRendererTurbo(this, 222, 132, textureX, textureY); // Box 190
		bodyModel[87] = new ModelRendererTurbo(this, 2, 104, textureX, textureY); // Box 195
		bodyModel[88] = new ModelRendererTurbo(this, 32, 90, textureX, textureY); // Box 196
		bodyModel[89] = new ModelRendererTurbo(this, 29, 106, textureX, textureY); // Box 197
		bodyModel[90] = new ModelRendererTurbo(this, 17, 102, textureX, textureY); // Box 198
		bodyModel[91] = new ModelRendererTurbo(this, 49, 116, textureX, textureY); // Box 199
		bodyModel[92] = new ModelRendererTurbo(this, 49, 112, textureX, textureY); // Box 200
		bodyModel[93] = new ModelRendererTurbo(this, 51, 109, textureX, textureY); // Box 201
		bodyModel[94] = new ModelRendererTurbo(this, 51, 109, textureX, textureY); // Box 202
		bodyModel[95] = new ModelRendererTurbo(this, 156, 78, textureX, textureY); // Box 205
		bodyModel[96] = new ModelRendererTurbo(this, 156, 83, textureX, textureY); // Box 206
		bodyModel[97] = new ModelRendererTurbo(this, 238, 240, textureX, textureY); // Box 367
		bodyModel[98] = new ModelRendererTurbo(this, 238, 240, textureX, textureY); // Box 368
		bodyModel[99] = new ModelRendererTurbo(this, 78, 216, textureX, textureY); // Box 86
		bodyModel[100] = new ModelRendererTurbo(this, 78, 220, textureX, textureY); // Box 87
		bodyModel[101] = new ModelRendererTurbo(this, 124, 223, textureX, textureY); // Box 375
		bodyModel[102] = new ModelRendererTurbo(this, 124, 219, textureX, textureY); // Box 376
		bodyModel[103] = new ModelRendererTurbo(this, 150, 31, textureX, textureY); // Box 377
		bodyModel[104] = new ModelRendererTurbo(this, 219, 31, textureX, textureY); // Box 261
		bodyModel[105] = new ModelRendererTurbo(this, 132, 44, textureX, textureY); // Box 379
		bodyModel[106] = new ModelRendererTurbo(this, 132, 44, textureX, textureY); // Box 380
		bodyModel[107] = new ModelRendererTurbo(this, 134, 46, textureX, textureY); // Box 381
		bodyModel[108] = new ModelRendererTurbo(this, 134, 46, textureX, textureY); // Box 382
		bodyModel[109] = new ModelRendererTurbo(this, 212, 98, textureX, textureY); // Box 383
		bodyModel[110] = new ModelRendererTurbo(this, 174, 179, textureX, textureY); // Box 364
		bodyModel[111] = new ModelRendererTurbo(this, 174, 190, textureX, textureY); // Box 365
		bodyModel[112] = new ModelRendererTurbo(this, 167, 192, textureX, textureY); // Box 366
		bodyModel[113] = new ModelRendererTurbo(this, 1, 7, textureX, textureY); // Box 354
		bodyModel[114] = new ModelRendererTurbo(this, 1, 4, textureX, textureY); // Box 355
		bodyModel[115] = new ModelRendererTurbo(this, 1, 10, textureX, textureY); // Box 356
		bodyModel[116] = new ModelRendererTurbo(this, 12, 7, textureX, textureY); // Box 357
		bodyModel[117] = new ModelRendererTurbo(this, 24, 4, textureX, textureY); // Box 114
		bodyModel[118] = new ModelRendererTurbo(this, 24, 1, textureX, textureY); // Box 74
		bodyModel[119] = new ModelRendererTurbo(this, 24, 7, textureX, textureY); // Box 78
		bodyModel[120] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 245
		bodyModel[121] = new ModelRendererTurbo(this, 29, 4, textureX, textureY); // Box 418
		bodyModel[122] = new ModelRendererTurbo(this, 221, 93, textureX, textureY, "cull"); // Box 420 cull
		bodyModel[123] = new ModelRendererTurbo(this, 11, 1, textureX, textureY); // Box 164
		bodyModel[124] = new ModelRendererTurbo(this, 6, 1, textureX, textureY); // Box 165
		bodyModel[125] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 166
		bodyModel[126] = new ModelRendererTurbo(this, 13, 16, textureX, textureY); // Box 426
		bodyModel[127] = new ModelRendererTurbo(this, 14, 12, textureX, textureY, "lamp"); // Box 427 glow commander beacon
		bodyModel[128] = new ModelRendererTurbo(this, 7, 41, textureX, textureY); // Box 430
		bodyModel[129] = new ModelRendererTurbo(this, 50, 1, textureX, textureY, "cull"); // Box 360 cull
		bodyModel[130] = new ModelRendererTurbo(this, 34, 16, textureX, textureY); // Box 363
		bodyModel[131] = new ModelRendererTurbo(this, 35, 12, textureX, textureY, "lamp"); // Box 364 glow commander beacon
		bodyModel[132] = new ModelRendererTurbo(this, 41, 1, textureX, textureY, "cull"); // Box 366 cull
		bodyModel[133] = new ModelRendererTurbo(this, 27, 16, textureX, textureY); // Box 367
		bodyModel[134] = new ModelRendererTurbo(this, 28, 12, textureX, textureY, "lamp"); // Box 368 glow commander beacon
		bodyModel[135] = new ModelRendererTurbo(this, 10, 41, textureX, textureY); // Box 353
		bodyModel[136] = new ModelRendererTurbo(this, 8, 16, textureX, textureY); // Box 383
		bodyModel[137] = new ModelRendererTurbo(this, 1, 19, textureX, textureY); // Box 384
		bodyModel[138] = new ModelRendererTurbo(this, 1, 16, textureX, textureY); // Box 385
		bodyModel[139] = new ModelRendererTurbo(this, 1, 13, textureX, textureY); // Box 386
		bodyModel[140] = new ModelRendererTurbo(this, 165, 220, textureX, textureY); // Box 50 OPTIONAL
		bodyModel[141] = new ModelRendererTurbo(this, 172, 220, textureX, textureY); // Box 175
		bodyModel[142] = new ModelRendererTurbo(this, 186, 220, textureX, textureY); // Box 178
		bodyModel[143] = new ModelRendererTurbo(this, 179, 220, textureX, textureY); // Box 179
		bodyModel[144] = new ModelRendererTurbo(this, 32, 31, textureX, textureY); // Box 452
		bodyModel[145] = new ModelRendererTurbo(this, 39, 31, textureX, textureY); // Box 453
		bodyModel[146] = new ModelRendererTurbo(this, 108, 161, textureX, textureY); // Box 122
		bodyModel[147] = new ModelRendererTurbo(this, 108, 157, textureX, textureY); // Box 123
		bodyModel[148] = new ModelRendererTurbo(this, 274, 148, textureX, textureY); // Box 456
		bodyModel[149] = new ModelRendererTurbo(this, 299, 151, textureX, textureY); // Box 457
		bodyModel[150] = new ModelRendererTurbo(this, 234, 228, textureX, textureY); // Box 462
		bodyModel[151] = new ModelRendererTurbo(this, 234, 228, textureX, textureY); // Box 463
		bodyModel[152] = new ModelRendererTurbo(this, 230, 39, textureX, textureY); // Box 299
		bodyModel[153] = new ModelRendererTurbo(this, 230, 30, textureX, textureY); // Box 303
		bodyModel[154] = new ModelRendererTurbo(this, 236, 40, textureX, textureY); // Box 307
		bodyModel[155] = new ModelRendererTurbo(this, 236, 31, textureX, textureY); // Box 308
		bodyModel[156] = new ModelRendererTurbo(this, 195, 111, textureX, textureY); // Box 310 nasa cap
		bodyModel[157] = new ModelRendererTurbo(this, 195, 108, textureX, textureY); // Box 311 nasa cap
		bodyModel[158] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 312
		bodyModel[159] = new ModelRendererTurbo(this, 4, 41, textureX, textureY); // Box 313
		bodyModel[160] = new ModelRendererTurbo(this, 21, 12, textureX, textureY, "lamp"); // Box 315 glow commander beacon
		bodyModel[161] = new ModelRendererTurbo(this, 20, 16, textureX, textureY); // Box 316
		bodyModel[162] = new ModelRendererTurbo(this, 126, 185, textureX, textureY, "lamp"); // Box 71 glow speedometer
		bodyModel[163] = new ModelRendererTurbo(this, 107, 192, textureX, textureY); // Box 296
		bodyModel[164] = new ModelRendererTurbo(this, 55, 185, textureX, textureY); // Box 297
		bodyModel[165] = new ModelRendererTurbo(this, 120, 194, textureX, textureY); // Box 299
		bodyModel[166] = new ModelRendererTurbo(this, 137, 194, textureX, textureY); // Box 300
		bodyModel[167] = new ModelRendererTurbo(this, 150, 189, textureX, textureY); // Box 301
		bodyModel[168] = new ModelRendererTurbo(this, 128, 185, textureX, textureY); // Box 302
		bodyModel[169] = new ModelRendererTurbo(this, 98, 185, textureX, textureY); // Box 303
		bodyModel[170] = new ModelRendererTurbo(this, 85, 187, textureX, textureY); // Box 304
		bodyModel[171] = new ModelRendererTurbo(this, 98, 192, textureX, textureY); // Box 305
		bodyModel[172] = new ModelRendererTurbo(this, 66, 186, textureX, textureY); // Box 306
		bodyModel[173] = new ModelRendererTurbo(this, 117, 187, textureX, textureY); // Box 307
		bodyModel[174] = new ModelRendererTurbo(this, 72, 189, textureX, textureY); // Box 298
		bodyModel[175] = new ModelRendererTurbo(this, 72, 133, textureX, textureY, "lamp"); // Box 385 lamp front 2 beam
		bodyModel[176] = new ModelRendererTurbo(this, 72, 133, textureX, textureY, "lamp"); // Box 386 lamp front 2 beam
		bodyModel[177] = new ModelRendererTurbo(this, 57, 131, textureX, textureY); // Box 387
		bodyModel[178] = new ModelRendererTurbo(this, 45, 132, textureX, textureY, "lamp"); // Box 341 numberboard glow
		bodyModel[179] = new ModelRendererTurbo(this, 45, 132, textureX, textureY, "lamp"); // Box 342 numberboard glow
		bodyModel[180] = new ModelRendererTurbo(this, 56, 132, textureX, textureY, "lamp"); // Box 307 glow marker
		bodyModel[181] = new ModelRendererTurbo(this, 64, 132, textureX, textureY, "lamp"); // Box 308 glow marker
		bodyModel[182] = new ModelRendererTurbo(this, 102, 141, textureX, textureY, "lamp"); // Box 331 lamp front 2 beam sp
		bodyModel[183] = new ModelRendererTurbo(this, 102, 141, textureX, textureY, "lamp"); // Box 332 lamp front 2 beam sp
		bodyModel[184] = new ModelRendererTurbo(this, 88, 141, textureX, textureY, "lamp"); // Box 333 lamp front gyro sp
		bodyModel[185] = new ModelRendererTurbo(this, 88, 141, textureX, textureY, "lamp"); // Box 334 lamp front gyro sp
		bodyModel[186] = new ModelRendererTurbo(this, 95, 141, textureX, textureY, "lamp"); // Box 336 glow front gyro red sp
		bodyModel[187] = new ModelRendererTurbo(this, 101, 136, textureX, textureY); // Box 337 why are you like this SP
		bodyModel[188] = new ModelRendererTurbo(this, 88, 134, textureX, textureY); // Box 299
		bodyModel[189] = new ModelRendererTurbo(this, 118, 146, textureX, textureY); // Box 295
		bodyModel[190] = new ModelRendererTurbo(this, 117, 135, textureX, textureY); // Box 299
		bodyModel[191] = new ModelRendererTurbo(this, 108, 135, textureX, textureY, "lamp"); // Box 300 glow marker
		bodyModel[192] = new ModelRendererTurbo(this, 78, 139, textureX, textureY); // Box 347
		bodyModel[193] = new ModelRendererTurbo(this, 98, 135, textureX, textureY, "lamp"); // Box 348 glow marker
		bodyModel[194] = new ModelRendererTurbo(this, 87, 134, textureX, textureY); // Box 349
		bodyModel[195] = new ModelRendererTurbo(this, 110, 134, textureX, textureY); // Box 350
		bodyModel[196] = new ModelRendererTurbo(this, 68, 141, textureX, textureY); // Box 355
		bodyModel[197] = new ModelRendererTurbo(this, 126, 137, textureX, textureY); // Box 356
		bodyModel[198] = new ModelRendererTurbo(this, 109, 141, textureX, textureY); // Box 357
		bodyModel[199] = new ModelRendererTurbo(this, 51, 84, textureX, textureY); // Box 359
		bodyModel[200] = new ModelRendererTurbo(this, 51, 93, textureX, textureY); // Box 360
		bodyModel[201] = new ModelRendererTurbo(this, 145, 246, textureX, textureY); // Box 19
		bodyModel[202] = new ModelRendererTurbo(this, 155, 229, textureX, textureY); // Box 489
		bodyModel[203] = new ModelRendererTurbo(this, 148, 227, textureX, textureY); // Box 278
		bodyModel[204] = new ModelRendererTurbo(this, 152, 245, textureX, textureY); // Box 281
		bodyModel[205] = new ModelRendererTurbo(this, 199, 228, textureX, textureY); // Box 288
		bodyModel[206] = new ModelRendererTurbo(this, 148, 233, textureX, textureY); // Box 315
		bodyModel[207] = new ModelRendererTurbo(this, 152, 239, textureX, textureY); // Box 316
		bodyModel[208] = new ModelRendererTurbo(this, 231, 172, textureX, textureY); // Box 369
		bodyModel[209] = new ModelRendererTurbo(this, 245, 207, textureX, textureY); // Box 370
		bodyModel[210] = new ModelRendererTurbo(this, 231, 187, textureX, textureY); // Box 372
		bodyModel[211] = new ModelRendererTurbo(this, 245, 202, textureX, textureY); // Box 373
		bodyModel[212] = new ModelRendererTurbo(this, 1, 140, textureX, textureY); // Box 374
		bodyModel[213] = new ModelRendererTurbo(this, 1, 131, textureX, textureY); // Box 375
		bodyModel[214] = new ModelRendererTurbo(this, 28, 131, textureX, textureY); // Box 376
		bodyModel[215] = new ModelRendererTurbo(this, 238, 93, textureX, textureY, "cull"); // Box 377 cull
		bodyModel[216] = new ModelRendererTurbo(this, 61, 215, textureX, textureY); // Box 288
		bodyModel[217] = new ModelRendererTurbo(this, 61, 215, textureX, textureY); // Box 379
		bodyModel[218] = new ModelRendererTurbo(this, 45, 131, textureX, textureY); // Box 380
		bodyModel[219] = new ModelRendererTurbo(this, 62, 131, textureX, textureY); // Box 382
		bodyModel[220] = new ModelRendererTurbo(this, 294, 125, textureX, textureY); // Box 356
		bodyModel[221] = new ModelRendererTurbo(this, 291, 125, textureX, textureY); // Box 358
		bodyModel[222] = new ModelRendererTurbo(this, 288, 125, textureX, textureY); // Box 359
		bodyModel[223] = new ModelRendererTurbo(this, 301, 126, textureX, textureY); // Box 360
		bodyModel[224] = new ModelRendererTurbo(this, 301, 129, textureX, textureY); // Box 294
		bodyModel[225] = new ModelRendererTurbo(this, 252, 133, textureX, textureY); // Box 132
		bodyModel[226] = new ModelRendererTurbo(this, 252, 125, textureX, textureY); // Box 135
		bodyModel[227] = new ModelRendererTurbo(this, 252, 117, textureX, textureY); // Box 57
		bodyModel[228] = new ModelRendererTurbo(this, 258, 106, textureX, textureY); // Box 280
		bodyModel[229] = new ModelRendererTurbo(this, 258, 109, textureX, textureY); // Box 281
		bodyModel[230] = new ModelRendererTurbo(this, 281, 115, textureX, textureY); // Box 282
		bodyModel[231] = new ModelRendererTurbo(this, 285, 131, textureX, textureY); // Box 284
		bodyModel[232] = new ModelRendererTurbo(this, 294, 133, textureX, textureY); // Box 285
		bodyModel[233] = new ModelRendererTurbo(this, 290, 117, textureX, textureY); // Box 286
		bodyModel[234] = new ModelRendererTurbo(this, 198, 139, textureX, textureY); // Box 399
		bodyModel[235] = new ModelRendererTurbo(this, 181, 139, textureX, textureY); // Box 400
		bodyModel[236] = new ModelRendererTurbo(this, 192, 140, textureX, textureY, "lamp"); // Box 401 glow marker
		bodyModel[237] = new ModelRendererTurbo(this, 181, 140, textureX, textureY, "lamp"); // Box 402 numberboard glow
		bodyModel[238] = new ModelRendererTurbo(this, 193, 139, textureX, textureY); // Box 403
		bodyModel[239] = new ModelRendererTurbo(this, 208, 141, textureX, textureY, "lamp"); // Box 404 lamp rear 2 beam
		bodyModel[240] = new ModelRendererTurbo(this, 208, 141, textureX, textureY, "lamp"); // Box 405 lamp rear 2 beam
		bodyModel[241] = new ModelRendererTurbo(this, 181, 140, textureX, textureY, "lamp"); // Box 406 numberboard glow
		bodyModel[242] = new ModelRendererTurbo(this, 200, 140, textureX, textureY, "lamp"); // Box 407 glow marker
		bodyModel[243] = new ModelRendererTurbo(this, 303, 125, textureX, textureY); // Box 408
		bodyModel[244] = new ModelRendererTurbo(this, 300, 125, textureX, textureY); // Box 409
		bodyModel[245] = new ModelRendererTurbo(this, 315, 129, textureX, textureY); // Box 410
		bodyModel[246] = new ModelRendererTurbo(this, 308, 125, textureX, textureY); // Box 411
		bodyModel[247] = new ModelRendererTurbo(this, 315, 126, textureX, textureY); // Box 412
		bodyModel[248] = new ModelRendererTurbo(this, 317, 125, textureX, textureY); // Box 413
		bodyModel[249] = new ModelRendererTurbo(this, 314, 125, textureX, textureY); // Box 414
		bodyModel[250] = new ModelRendererTurbo(this, 140, 246, textureX, textureY); // Box 415
		bodyModel[251] = new ModelRendererTurbo(this, 10, 94, textureX, textureY); // Box 416
		bodyModel[252] = new ModelRendererTurbo(this, 20, 91, textureX, textureY); // Box 417
		bodyModel[253] = new ModelRendererTurbo(this, 125, 100, textureX, textureY); // Box 457
		bodyModel[254] = new ModelRendererTurbo(this, 107, 109, textureX, textureY); // Box 458
		bodyModel[255] = new ModelRendererTurbo(this, 138, 122, textureX, textureY); // Box 43
		bodyModel[256] = new ModelRendererTurbo(this, 139, 125, textureX, textureY); // Box 43
		bodyModel[257] = new ModelRendererTurbo(this, 133, 144, textureX, textureY); // Box 574
		bodyModel[258] = new ModelRendererTurbo(this, 135, 134, textureX, textureY); // Box 308 sp light cover
		bodyModel[259] = new ModelRendererTurbo(this, 148, 134, textureX, textureY); // Box 309 sp light cover
		bodyModel[260] = new ModelRendererTurbo(this, 130, 143, textureX, textureY); // Box 310 sp light cover
		bodyModel[261] = new ModelRendererTurbo(this, 129, 143, textureX, textureY); // Box 311 sp light cover
		bodyModel[262] = new ModelRendererTurbo(this, 194, 156, textureX, textureY, "lamp"); // Box 331 lamp rear 2 beam sp
		bodyModel[263] = new ModelRendererTurbo(this, 194, 156, textureX, textureY, "lamp"); // Box 332 lamp rear 2 beam sp
		bodyModel[264] = new ModelRendererTurbo(this, 180, 156, textureX, textureY, "lamp"); // Box 333 lamp rear gyro sp
		bodyModel[265] = new ModelRendererTurbo(this, 180, 156, textureX, textureY, "lamp"); // Box 334 lamp rear gyro sp
		bodyModel[266] = new ModelRendererTurbo(this, 187, 156, textureX, textureY, "lamp"); // Box 336 glow rear gyro red sp
		bodyModel[267] = new ModelRendererTurbo(this, 193, 151, textureX, textureY); // Box 337 why are you like this SP
		bodyModel[268] = new ModelRendererTurbo(this, 180, 149, textureX, textureY); // Box 299
		bodyModel[269] = new ModelRendererTurbo(this, 190, 150, textureX, textureY, "lamp"); // Box 300 glow marker
		bodyModel[270] = new ModelRendererTurbo(this, 200, 150, textureX, textureY, "lamp"); // Box 348 glow marker
		bodyModel[271] = new ModelRendererTurbo(this, 179, 149, textureX, textureY); // Box 349
		bodyModel[272] = new ModelRendererTurbo(this, 202, 149, textureX, textureY); // Box 350
		bodyModel[273] = new ModelRendererTurbo(this, 201, 156, textureX, textureY); // Box 357
		bodyModel[274] = new ModelRendererTurbo(this, 218, 144, textureX, textureY); // Box 308 sp light cover
		bodyModel[275] = new ModelRendererTurbo(this, 218, 150, textureX, textureY); // Box 309 sp light cover
		bodyModel[276] = new ModelRendererTurbo(this, 169, 161, textureX, textureY); // Box 310 sp light cover
		bodyModel[277] = new ModelRendererTurbo(this, 168, 161, textureX, textureY); // Box 311 sp light cover
		bodyModel[278] = new ModelRendererTurbo(this, 209, 150, textureX, textureY); // Box 336 sp light cover
		bodyModel[279] = new ModelRendererTurbo(this, 210, 161, textureX, textureY); // Box 337
		bodyModel[280] = new ModelRendererTurbo(this, 144, 208, textureX, textureY, "cull"); // Box 3 cull aww
		bodyModel[281] = new ModelRendererTurbo(this, 146, 203, textureX, textureY); // Box 5 aww
		bodyModel[282] = new ModelRendererTurbo(this, 223, 165, textureX, textureY); // Box 340
		bodyModel[283] = new ModelRendererTurbo(this, 223, 165, textureX, textureY); // Box 341
		bodyModel[284] = new ModelRendererTurbo(this, 121, 202, textureX, textureY); // Box 303
		bodyModel[285] = new ModelRendererTurbo(this, 135, 209, textureX, textureY); // Box 305
		bodyModel[286] = new ModelRendererTurbo(this, 54, 203, textureX, textureY); // Box 306
		bodyModel[287] = new ModelRendererTurbo(this, 63, 203, textureX, textureY); // Box 307
		bodyModel[288] = new ModelRendererTurbo(this, 73, 18, textureX, textureY); // Box 280
		bodyModel[289] = new ModelRendererTurbo(this, 49, 26, textureX, textureY); // Box 281
		bodyModel[290] = new ModelRendererTurbo(this, 23, 37, textureX, textureY); // Box 282
		bodyModel[291] = new ModelRendererTurbo(this, 36, 40, textureX, textureY); // Box 283
		bodyModel[292] = new ModelRendererTurbo(this, 36, 28, textureX, textureY); // Box 284
		bodyModel[293] = new ModelRendererTurbo(this, 51, 38, textureX, textureY); // Box 285
		bodyModel[294] = new ModelRendererTurbo(this, 62, 16, textureX, textureY); // Box 340
		bodyModel[295] = new ModelRendererTurbo(this, 62, 26, textureX, textureY); // Box 342
		bodyModel[296] = new ModelRendererTurbo(this, 100, 38, textureX, textureY); // Box 354
		bodyModel[297] = new ModelRendererTurbo(this, 87, 28, textureX, textureY); // Box 355
		bodyModel[298] = new ModelRendererTurbo(this, 74, 37, textureX, textureY); // Box 356
		bodyModel[299] = new ModelRendererTurbo(this, 87, 40, textureX, textureY); // Box 357
		bodyModel[300] = new ModelRendererTurbo(this, 100, 28, textureX, textureY); // Box 358
		bodyModel[301] = new ModelRendererTurbo(this, 100, 18, textureX, textureY); // Box 359
		bodyModel[302] = new ModelRendererTurbo(this, 111, 26, textureX, textureY); // Box 360
		bodyModel[303] = new ModelRendererTurbo(this, 89, 16, textureX, textureY); // Box 361
		bodyModel[304] = new ModelRendererTurbo(this, 59, 16, textureX, textureY); // Box 160
		bodyModel[305] = new ModelRendererTurbo(this, 59, 10, textureX, textureY); // Box 161
		bodyModel[306] = new ModelRendererTurbo(this, 48, 10, textureX, textureY); // Box 594
		bodyModel[307] = new ModelRendererTurbo(this, 48, 16, textureX, textureY); // Box 595
		bodyModel[308] = new ModelRendererTurbo(this, 8, 192, textureX, textureY); // Box 366 kcs shit
		bodyModel[309] = new ModelRendererTurbo(this, 15, 26, textureX, textureY); // Box 364 prime base
		bodyModel[310] = new ModelRendererTurbo(this, 15, 22, textureX, textureY, "lamp"); // Box 6 PRIME1-1
		bodyModel[311] = new ModelRendererTurbo(this, 15, 22, textureX, textureY, "lamp"); // Box 7 PRIME1-3
		bodyModel[312] = new ModelRendererTurbo(this, 15, 22, textureX, textureY, "lamp"); // Box 8 PRIME1-2
		bodyModel[313] = new ModelRendererTurbo(this, 15, 22, textureX, textureY, "lamp"); // Box 9 PRIME1-4
		bodyModel[314] = new ModelRendererTurbo(this, 203, 108, textureX, textureY); // Box 359 smoke
		bodyModel[315] = new ModelRendererTurbo(this, 203, 112, textureX, textureY); // Box 360 smoke
		bodyModel[316] = new ModelRendererTurbo(this, 19, 4, textureX, textureY); // Box 361 up 1198
		bodyModel[317] = new ModelRendererTurbo(this, 19, 1, textureX, textureY); // Box 362
		bodyModel[318] = new ModelRendererTurbo(this, 19, 7, textureX, textureY); // Box 363
		bodyModel[319] = new ModelRendererTurbo(this, 265, 230, textureX, textureY); // Box 364
		bodyModel[320] = new ModelRendererTurbo(this, 265, 230, textureX, textureY); // Box 365
		bodyModel[321] = new ModelRendererTurbo(this, 178, 168, textureX, textureY); // Box 366
		bodyModel[322] = new ModelRendererTurbo(this, 65, 53, textureX, textureY); // Box 519
		bodyModel[323] = new ModelRendererTurbo(this, 233, 30, textureX, textureY); // Box 368
		bodyModel[324] = new ModelRendererTurbo(this, 233, 39, textureX, textureY); // Box 369
		bodyModel[325] = new ModelRendererTurbo(this, 101, 53, textureX, textureY); // Box 370
		bodyModel[326] = new ModelRendererTurbo(this, 50, 53, textureX, textureY); // Box 371
		bodyModel[327] = new ModelRendererTurbo(this, 14, 53, textureX, textureY); // Box 372
		bodyModel[328] = new ModelRendererTurbo(this, 49, 141, textureX, textureY, "lamp"); // Box 373 gyralight front up
		bodyModel[329] = new ModelRendererTurbo(this, 49, 141, textureX, textureY, "lamp"); // Box 374 gyralight front up
		bodyModel[330] = new ModelRendererTurbo(this, 40, 142, textureX, textureY); // Box 375
		bodyModel[331] = new ModelRendererTurbo(this, 39, 142, textureX, textureY); // Box 376
		bodyModel[332] = new ModelRendererTurbo(this, 39, 142, textureX, textureY); // Box 377
		bodyModel[333] = new ModelRendererTurbo(this, 24, 26, textureX, textureY); // Box 364 prime base
		bodyModel[334] = new ModelRendererTurbo(this, 24, 22, textureX, textureY, "lamp"); // Box 6 PRIME2-1
		bodyModel[335] = new ModelRendererTurbo(this, 24, 22, textureX, textureY, "lamp"); // Box 7 PRIME2-3
		bodyModel[336] = new ModelRendererTurbo(this, 24, 22, textureX, textureY, "lamp"); // Box 8 PRIME2-2
		bodyModel[337] = new ModelRendererTurbo(this, 24, 22, textureX, textureY, "lamp"); // Box 9 PRIME2-4
		bodyModel[338] = new ModelRendererTurbo(this, 10, 43, textureX, textureY); // Box 383
		bodyModel[339] = new ModelRendererTurbo(this, 150, 196, textureX, textureY); // Box 380
		bodyModel[340] = new ModelRendererTurbo(this, 167, 199, textureX, textureY); // Box 381
		bodyModel[341] = new ModelRendererTurbo(this, 174, 197, textureX, textureY); // Box 382
		bodyModel[342] = new ModelRendererTurbo(this, 80, 131, textureX, textureY); // Box 390
		bodyModel[343] = new ModelRendererTurbo(this, 83, 131, textureX, textureY); // Box 391
		bodyModel[344] = new ModelRendererTurbo(this, 179, 66, textureX, textureY); // Box 392
		bodyModel[345] = new ModelRendererTurbo(this, 180, 62, textureX, textureY); // Box 393
		bodyModel[346] = new ModelRendererTurbo(this, 155, 74, textureX, textureY); // Box 394
		bodyModel[347] = new ModelRendererTurbo(this, 166, 76, textureX, textureY); // Box 395
		bodyModel[348] = new ModelRendererTurbo(this, 166, 74, textureX, textureY); // Box 396
		bodyModel[349] = new ModelRendererTurbo(this, 164, 80, textureX, textureY); // Box 397
		bodyModel[350] = new ModelRendererTurbo(this, 167, 78, textureX, textureY); // Box 398
		bodyModel[351] = new ModelRendererTurbo(this, 167, 83, textureX, textureY); // Box 399
		bodyModel[352] = new ModelRendererTurbo(this, 164, 85, textureX, textureY); // Box 400
		bodyModel[353] = new ModelRendererTurbo(this, 186, 82, textureX, textureY); // Box 401
		bodyModel[354] = new ModelRendererTurbo(this, 186, 74, textureX, textureY); // Box 402
		bodyModel[355] = new ModelRendererTurbo(this, 166, 72, textureX, textureY); // Box 403
		bodyModel[356] = new ModelRendererTurbo(this, 188, 66, textureX, textureY); // Box 405
		bodyModel[357] = new ModelRendererTurbo(this, 189, 62, textureX, textureY); // Box 406
		bodyModel[358] = new ModelRendererTurbo(this, 155, 72, textureX, textureY); // Box 407
		bodyModel[359] = new ModelRendererTurbo(this, 155, 74, textureX, textureY); // Box 408
		bodyModel[360] = new ModelRendererTurbo(this, 155, 76, textureX, textureY); // Box 409
		bodyModel[361] = new ModelRendererTurbo(this, 195, 74, textureX, textureY); // Box 410
		bodyModel[362] = new ModelRendererTurbo(this, 195, 69, textureX, textureY); // Box 411
		bodyModel[363] = new ModelRendererTurbo(this, 197, 66, textureX, textureY); // Box 412
		bodyModel[364] = new ModelRendererTurbo(this, 198, 62, textureX, textureY); // Box 413
		bodyModel[365] = new ModelRendererTurbo(this, 156, 78, textureX, textureY); // Box 414
		bodyModel[366] = new ModelRendererTurbo(this, 153, 80, textureX, textureY); // Box 415
		bodyModel[367] = new ModelRendererTurbo(this, 195, 82, textureX, textureY); // Box 416
		bodyModel[368] = new ModelRendererTurbo(this, 156, 83, textureX, textureY); // Box 417
		bodyModel[369] = new ModelRendererTurbo(this, 153, 85, textureX, textureY); // Box 418
		bodyModel[370] = new ModelRendererTurbo(this, 167, 83, textureX, textureY); // Box 419
		bodyModel[371] = new ModelRendererTurbo(this, 164, 85, textureX, textureY); // Box 420
		bodyModel[372] = new ModelRendererTurbo(this, 167, 78, textureX, textureY); // Box 421
		bodyModel[373] = new ModelRendererTurbo(this, 164, 80, textureX, textureY); // Box 422
		bodyModel[374] = new ModelRendererTurbo(this, 166, 76, textureX, textureY); // Box 423
		bodyModel[375] = new ModelRendererTurbo(this, 166, 74, textureX, textureY); // Box 424
		bodyModel[376] = new ModelRendererTurbo(this, 166, 72, textureX, textureY); // Box 425
		bodyModel[377] = new ModelRendererTurbo(this, 204, 69, textureX, textureY); // Box 426
		bodyModel[378] = new ModelRendererTurbo(this, 204, 74, textureX, textureY); // Box 427
		bodyModel[379] = new ModelRendererTurbo(this, 204, 82, textureX, textureY); // Box 428
		bodyModel[380] = new ModelRendererTurbo(this, 206, 66, textureX, textureY); // Box 429
		bodyModel[381] = new ModelRendererTurbo(this, 207, 62, textureX, textureY); // Box 430
		bodyModel[382] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 336
		bodyModel[383] = new ModelRendererTurbo(this, 1, 28, textureX, textureY); // Box 337
		bodyModel[384] = new ModelRendererTurbo(this, 1, 22, textureX, textureY); // Box 338
		bodyModel[385] = new ModelRendererTurbo(this, 10, 25, textureX, textureY); // Box 339
		bodyModel[386] = new ModelRendererTurbo(this, 245, 25, textureX, textureY); // Box 283
		bodyModel[387] = new ModelRendererTurbo(this, 240, 25, textureX, textureY); // Box 284
		bodyModel[388] = new ModelRendererTurbo(this, 218, 130, textureX, textureY, "lamp"); // Box 193 numberboard glow
		bodyModel[389] = new ModelRendererTurbo(this, 218, 130, textureX, textureY, "lamp"); // Box 194 numberboard glow
		bodyModel[390] = new ModelRendererTurbo(this, 233, 25, textureX, textureY); // Box 390
		bodyModel[391] = new ModelRendererTurbo(this, 26, 218, textureX, textureY, "cull"); // Box 391 cull
		bodyModel[392] = new ModelRendererTurbo(this, 26, 218, textureX, textureY, "cull"); // Box 391 cull
		bodyModel[393] = new ModelRendererTurbo(this, 15, 218, textureX, textureY, "cull"); // Box 391 cull
		bodyModel[394] = new ModelRendererTurbo(this, 15, 218, textureX, textureY, "cull"); // Box 391 cull
		bodyModel[395] = new ModelRendererTurbo(this, 56, 109, textureX, textureY); // Box 395
		bodyModel[396] = new ModelRendererTurbo(this, 56, 109, textureX, textureY); // Box 396

		bodyModel[0].addBox(0F, 0F, 0F, 54, 1, 4, 0F); // Box 0
		bodyModel[0].setRotationPoint(-27F, 0F, -11F);

		bodyModel[1].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 52
		bodyModel[1].setRotationPoint(-35F, 3F, -1.5F);

		bodyModel[2].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 53
		bodyModel[2].setRotationPoint(32F, 3F, -1.5F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[3].setRotationPoint(-32F, 2.5F, -2F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 146
		bodyModel[4].setRotationPoint(31F, 2.5F, -2F);

		bodyModel[5].addBox(0F, 0F, 0F, 0, 7, 20, 0F); // Box 246
		bodyModel[5].setRotationPoint(-31.01F, 0F, -10F);

		bodyModel[6].addBox(0F, 0F, 0F, 0, 7, 1, 0F); // Box 61
		bodyModel[6].setRotationPoint(-31F, -2F, 10F);

		bodyModel[7].addBox(0F, 0F, 0F, 0, 7, 1, 0F); // Box 63
		bodyModel[7].setRotationPoint(-31F, -2F, -11F);

		bodyModel[8].addBox(0F, 0F, 0F, 62, 3, 14, 0F); // Box 197
		bodyModel[8].setRotationPoint(-31F, 0F, -7F);

		bodyModel[9].addBox(0F, 0F, 0F, 0, 8, 16, 0F); // Box 144
		bodyModel[9].setRotationPoint(-31F, -8F, -8F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 0, 1, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 226
		bodyModel[10].setRotationPoint(-31.01F, 8F, -10F);

		bodyModel[11].addBox(0F, 0F, 0F, 0, 1, 22, 0F); // Box 227
		bodyModel[11].setRotationPoint(-31.01F, 7F, -11F);

		bodyModel[12].addBox(0F, 0F, 0F, 54, 1, 4, 0F); // Box 40
		bodyModel[12].setRotationPoint(-27F, 0F, 7F);

		bodyModel[13].addBox(0F, 0F, 0F, 0, 7, 20, 0F); // Box 55
		bodyModel[13].setRotationPoint(31.01F, 0F, -10F);

		bodyModel[14].addBox(0F, 0F, 0F, 0, 1, 22, 0F); // Box 56
		bodyModel[14].setRotationPoint(31.01F, 7F, -11F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 0, 1, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 57
		bodyModel[15].setRotationPoint(31.01F, 8F, -10F);

		bodyModel[16].addBox(0F, 0F, 0F, 0, 8, 16, 0F); // Box 58
		bodyModel[16].setRotationPoint(31F, -8F, -8F);

		bodyModel[17].addBox(0F, 0F, 0F, 0, 7, 1, 0F); // Box 59
		bodyModel[17].setRotationPoint(31F, -2F, 10F);

		bodyModel[18].addBox(0F, 0F, 0F, 0, 7, 1, 0F); // Box 61
		bodyModel[18].setRotationPoint(31F, -2F, -11F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 202
		bodyModel[19].setRotationPoint(31F, 0F, -4F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 204
		bodyModel[20].setRotationPoint(31F, 0F, -5F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, 0F, -1F, 0F); // Box 301
		bodyModel[21].setRotationPoint(31F, 0F, 4F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 66
		bodyModel[22].setRotationPoint(-32F, 0F, -4F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F); // Box 67
		bodyModel[23].setRotationPoint(-32F, 0F, 4F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 68
		bodyModel[24].setRotationPoint(-32F, 0F, -5F);

		bodyModel[25].addBox(0F, 0F, 0F, 8, 14, 14, 0F); // Box 5
		bodyModel[25].setRotationPoint(-24F, -14F, -7F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 2, 24, 24, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -12F, 0F, 0F, -12F, 0F, -12F, 0F, -1F, -12F, 0F, -1F, -12F, -12F, 0F, -12F, -12F); // Box 138 intake cull
		bodyModel[26].setRotationPoint(-28F, -13F, -6F);

		bodyModel[27].addBox(0F, 0F, 0F, 15, 5, 22, 0F); // Box 240
		bodyModel[27].setRotationPoint(11F, -5F, -11F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 3, 0, 1, 0F,0F, 0F, 0F, 0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 249
		bodyModel[28].setRotationPoint(-31F, 3F, -9F);

		bodyModel[29].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 250
		bodyModel[29].setRotationPoint(-31F, 0F, -8F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 251
		bodyModel[30].setRotationPoint(-28F, 0F, -11F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F,-1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 252
		bodyModel[31].setRotationPoint(-28F, 1F, -11F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,-1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, -1F, -0.4F, 0F, -1F); // Box 253
		bodyModel[32].setRotationPoint(-28F, 5F, -11F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, -0.35F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 254
		bodyModel[33].setRotationPoint(-31F, 5F, -10F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F); // Box 255
		bodyModel[34].setRotationPoint(-31F, 8F, -11F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 260
		bodyModel[35].setRotationPoint(-28F, 0F, 8F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 264
		bodyModel[36].setRotationPoint(26F, -5F, -8F);

		bodyModel[37].addBox(0F, 0F, 0F, 2, 3, 6, 0F); // Box 265
		bodyModel[37].setRotationPoint(26F, -3F, -8F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 266
		bodyModel[38].setRotationPoint(26F, -3F, -11F);

		bodyModel[39].addBox(0F, 0F, 0F, 2, 3, 6, 0F); // Box 269
		bodyModel[39].setRotationPoint(26F, -3F, 2F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 270
		bodyModel[40].setRotationPoint(26F, -5F, 2F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 271
		bodyModel[41].setRotationPoint(26F, -3F, 8F);

		bodyModel[42].addBox(0F, 0F, 0F, 1, 0, 4, 0F); // Box 274
		bodyModel[42].setRotationPoint(26F, -4F, -2F);

		bodyModel[43].addBox(0F, 0F, 0F, 2, 0, 4, 0F); // Box 275
		bodyModel[43].setRotationPoint(26F, -2F, -2F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 8, 2, 7, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		bodyModel[44].setRotationPoint(3F, -16F, -7F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 8, 2, 7, 0F,0F, 0.5F, 0F, 0F, -1.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 47
		bodyModel[45].setRotationPoint(3F, -16F, 0F);

		bodyModel[46].addBox(0F, 0F, 0F, 8, 14, 14, 0F); // Box 107
		bodyModel[46].setRotationPoint(3F, -14F, -7F);

		bodyModel[47].addBox(0F, 0F, 0F, 11, 15, 1, 0F); // Box 279
		bodyModel[47].setRotationPoint(12F, -20F, -11F);

		bodyModel[48].addBox(0F, 0F, 0F, 17, 16, 14, 0F); // Box 293
		bodyModel[48].setRotationPoint(-14F, -16F, -7F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 13, 1, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 350
		bodyModel[49].setRotationPoint(11F, -21F, -11F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 13, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 351
		bodyModel[50].setRotationPoint(11F, -21F, 9F);

		bodyModel[51].addBox(0F, 0F, 0F, 11, 15, 1, 0F); // Box 352
		bodyModel[51].setRotationPoint(12F, -20F, 10F);

		bodyModel[52].addBox(0F, 0F, 0F, 1, 15, 8, 0F); // Box 353
		bodyModel[52].setRotationPoint(23F, -20F, -11F);

		bodyModel[53].addBox(0F, 0F, 0F, 1, 15, 8, 0F); // Box 354
		bodyModel[53].setRotationPoint(23F, -20F, 3F);

		bodyModel[54].addBox(0F, 0F, 0F, 1, 15, 18, 0F); // Box 355
		bodyModel[54].setRotationPoint(11F, -20F, -7F);

		bodyModel[55].addBox(-0.5F, 0F, -0.5F, 1, 15, 4, 0F); // Box 315 door swing right
		bodyModel[55].setRotationPoint(11.5F, -20F, -10.5F);

		bodyModel[56].addShapeBox(0F, 0F, -5F, 1, 14, 6, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 61 door swing right
		bodyModel[56].setRotationPoint(23F, -19F, 2F);

		bodyModel[57].addBox(0F, 0F, 0F, 1, 1, 18, 0F); // Box 368
		bodyModel[57].setRotationPoint(11F, -21F, -9F);

		bodyModel[58].addBox(0F, 0F, 0F, 1, 1, 18, 0F); // Box 370
		bodyModel[58].setRotationPoint(23F, -21F, -9F);

		bodyModel[59].addBox(0F, 0F, 0F, 2, 0, 4, 0F); // Box 372
		bodyModel[59].setRotationPoint(9F, -4F, -11F);

		bodyModel[60].addBox(0F, 0F, 0F, 1, 0, 4, 0F); // Box 375
		bodyModel[60].setRotationPoint(8F, -2F, -11F);

		bodyModel[61].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Box 386
		bodyModel[61].setRotationPoint(23F, -20F, -3F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 2, 6, 2, 0F,0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 33
		bodyModel[62].setRotationPoint(1F, -22F, -1F);

		bodyModel[63].addBox(0F, 0F, 0F, 39, 8, 0, 0F); // Box 399
		bodyModel[63].setRotationPoint(-28F, -8F, 11F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 0, 5, 1, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 287
		bodyModel[64].setRotationPoint(-28F, -6F, -11.5F);

		bodyModel[65].addBox(0F, 0F, 0F, 0, 12, 3, 0F); // Box 288
		bodyModel[65].setRotationPoint(-28F, -8F, -11F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 0, 5, 1, 0F,0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 289
		bodyModel[66].setRotationPoint(-28F, -6F, 10.5F);

		bodyModel[67].addBox(0F, 0F, 0F, 0, 12, 3, 0F); // Box 290
		bodyModel[67].setRotationPoint(-28F, -8F, 8F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 78
		bodyModel[68].setRotationPoint(-31F, -2F, 4.75F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 188
		bodyModel[69].setRotationPoint(-31F, -2F, -6.75F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 189 lamp ditchlight front up
		bodyModel[70].setRotationPoint(-31.25F, -2F, 4.75F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 190 lamp ditchlight front up
		bodyModel[71].setRotationPoint(-31.25F, -2F, -6.75F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 416 lamp ditchlight front down
		bodyModel[72].setRotationPoint(-32.25F, 0F, -6.75F);

		bodyModel[73].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 417
		bodyModel[73].setRotationPoint(-32F, 0F, -6.75F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 418 lamp ditchlight front down
		bodyModel[74].setRotationPoint(-32.25F, 0F, 4.75F);

		bodyModel[75].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 419
		bodyModel[75].setRotationPoint(-32F, 0F, 4.75F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 180 lamp ditchlight rear down
		bodyModel[76].setRotationPoint(31.25F, 0F, -6.75F);

		bodyModel[77].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 181
		bodyModel[77].setRotationPoint(31F, 0F, -6.75F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 182 lamp ditchlight rear up
		bodyModel[78].setRotationPoint(30.25F, -2F, -6.75F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 183
		bodyModel[79].setRotationPoint(30F, -2F, -6.75F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 184 lamp ditchlight rear down
		bodyModel[80].setRotationPoint(31.25F, 0F, 4.75F);

		bodyModel[81].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 185
		bodyModel[81].setRotationPoint(31F, 0F, 4.75F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 186 lamp ditchlight rear up
		bodyModel[82].setRotationPoint(30.25F, -2F, 4.75F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 187
		bodyModel[83].setRotationPoint(30F, -2F, 4.75F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 188
		bodyModel[84].setRotationPoint(9F, -22.5F, -1F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 2, 3, 5, 0F,-2F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 189
		bodyModel[85].setRotationPoint(9F, -22.5F, -6F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 2, 3, 5, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -2F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 190
		bodyModel[86].setRotationPoint(9F, -22.5F, 1F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 1, 14, 12, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 195
		bodyModel[87].setRotationPoint(-27F, -14F, -6F);

		bodyModel[88].addBox(0F, 0F, 0F, 2, 1, 14, 0F); // Box 196
		bodyModel[88].setRotationPoint(-26F, -14F, -7F);

		bodyModel[89].addBox(0F, 0F, 0F, 2, 10, 14, 0F); // Box 197
		bodyModel[89].setRotationPoint(-26F, -10F, -7F);

		bodyModel[90].addBox(0F, 0F, 0F, 2, 3, 10, 0F); // Box 198
		bodyModel[90].setRotationPoint(-26F, -13F, -5F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 199
		bodyModel[91].setRotationPoint(-26F, -11F, -7F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 200
		bodyModel[92].setRotationPoint(-26F, -11F, 5F);

		bodyModel[93].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 201
		bodyModel[93].setRotationPoint(-25.5F, -11F, -6.5F);

		bodyModel[94].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 202
		bodyModel[94].setRotationPoint(-25.5F, -11F, 5.5F);

		bodyModel[95].addBox(0F, 0F, 0F, 3, 1, 0, 0F); // Box 205
		bodyModel[95].setRotationPoint(-31F, 4F, -8F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,0F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, 0F); // Box 206
		bodyModel[96].setRotationPoint(-31F, 7F, -9F);

		bodyModel[97].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 367
		bodyModel[97].setRotationPoint(-19F, 3F, -2F);

		bodyModel[98].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 368
		bodyModel[98].setRotationPoint(15F, 3F, -2F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 20, 1, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 86
		bodyModel[99].setRotationPoint(-10F, 1F, 9F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 20, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 87
		bodyModel[100].setRotationPoint(-10F, 2F, 9F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 20, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 375
		bodyModel[101].setRotationPoint(-10F, 2F, -11F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 20, 1, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 376
		bodyModel[102].setRotationPoint(-10F, 1F, -11F);

		bodyModel[103].addBox(0F, 0F, 0F, 34, 8, 0, 0F); // Box 377
		bodyModel[103].setRotationPoint(-28F, -8F, -11F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 5, 1, 0, 0F,0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F); // Box 261
		bodyModel[104].setRotationPoint(6F, -8F, -11F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,0F, 4F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, -4F, 0F); // Box 379
		bodyModel[105].setRotationPoint(24F, -9F, -3F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,0F, 4F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, -4F, 0F); // Box 380
		bodyModel[106].setRotationPoint(24F, -9F, 3F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 1, 6, 0, 0F,0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 381
		bodyModel[107].setRotationPoint(27F, -9F, -2F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 1, 6, 0, 0F,0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 382
		bodyModel[108].setRotationPoint(27F, -9F, 2F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 2, 6, 2, 0F,0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 383
		bodyModel[109].setRotationPoint(-11F, -22F, -1F);

		bodyModel[110].addBox(0F, 0F, 0F, 6, 2, 4, 0F); // Box 364
		bodyModel[110].setRotationPoint(15.5F, -24F, -2F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 365
		bodyModel[111].setRotationPoint(21.5F, -24F, -2F);

		bodyModel[112].addBox(0F, 0F, 0F, 1, 1, 4, 0F); // Box 366
		bodyModel[112].setRotationPoint(21.5F, -23F, -2F);

		bodyModel[113].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 354
		bodyModel[113].setRotationPoint(9F, -23.5F, -0.5F);

		bodyModel[114].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 355
		bodyModel[114].setRotationPoint(10F, -23.25F, 0.5F);

		bodyModel[115].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 356
		bodyModel[115].setRotationPoint(9.5F, -23.25F, -1.5F);

		bodyModel[116].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 357
		bodyModel[116].setRotationPoint(11.5F, -22.5F, -0.5F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 114
		bodyModel[117].setRotationPoint(-13F, -18.5F, -0.75F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[118].setRotationPoint(-13F, -19.5F, -0.75F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 78
		bodyModel[119].setRotationPoint(-12.75F, -18F, -0.5F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 245
		bodyModel[120].setRotationPoint(-13F, -20.5F, -0.550000000000001F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 418
		bodyModel[121].setRotationPoint(-13F, -19.5F, 0.45F);

		bodyModel[122].addBox(0F, 0F, 0F, 4, 4, 4, 0F); // Box 420 cull
		bodyModel[122].setRotationPoint(0F, -24.5F, -2F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.5F, 0.25F, 0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, 0.5F, 0.25F, 0.25F, 0.5F, 0.25F, 0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, 0.5F, 0.25F, 0.25F); // Box 164
		bodyModel[123].setRotationPoint(8.5F, -21.5F, -0.5F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.25F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F); // Box 165
		bodyModel[124].setRotationPoint(9.5F, -21.5F, -0.5F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 166
		bodyModel[125].setRotationPoint(10.5F, -21.5F, -0.5F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0.3F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, 0.3F, -0.5F, 0.1F, 0.3F, 0F, 0.1F, -1F, 0F, 0.1F, -1F, 0F, 0.1F, 0.3F, 0F, 0.1F); // Box 426
		bodyModel[126].setRotationPoint(18.68F, -23F, -0.5F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 427 glow commander beacon
		bodyModel[127].setRotationPoint(18.5F, -24F, -0.5F);

		bodyModel[128].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 430
		bodyModel[128].setRotationPoint(16F, -24F, 0F);

		bodyModel[129].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 360 cull
		bodyModel[129].setRotationPoint(17.5F, -21.5F, -10F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0.3F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, 0.3F, -0.5F, 0.1F, 0.3F, 0F, 0.1F, -1F, 0F, 0.1F, -1F, 0F, 0.1F, 0.3F, 0F, 0.1F); // Box 363
		bodyModel[130].setRotationPoint(18.18F, -22.5F, -9.5F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 364 glow commander beacon
		bodyModel[131].setRotationPoint(18F, -23.5F, -9.5F);

		bodyModel[132].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 366 cull
		bodyModel[132].setRotationPoint(17.5F, -21.5F, 8F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0.3F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, 0.3F, -0.5F, 0.1F, 0.3F, 0F, 0.1F, -1F, 0F, 0.1F, -1F, 0F, 0.1F, 0.3F, 0F, 0.1F); // Box 367
		bodyModel[133].setRotationPoint(18.18F, -22.5F, 8.5F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 368 glow commander beacon
		bodyModel[134].setRotationPoint(18F, -23.5F, 8.5F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 353
		bodyModel[135].setRotationPoint(21.5F, -23F, 0F);

		bodyModel[136].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 383
		bodyModel[136].setRotationPoint(11F, -22F, 6.5F);

		bodyModel[137].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 384
		bodyModel[137].setRotationPoint(9.5F, -23F, 5.5F);

		bodyModel[138].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 385
		bodyModel[138].setRotationPoint(11F, -23F, 6.5F);

		bodyModel[139].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 386
		bodyModel[139].setRotationPoint(10.25F, -23F, 7.5F);

		bodyModel[140].addBox(0F, 0F, 0F, 3, 0, 8, 0F); // Box 50 OPTIONAL
		bodyModel[140].setRotationPoint(-34F, 8F, -11F);

		bodyModel[141].addBox(0F, 0F, 0F, 3, 0, 8, 0F); // Box 175
		bodyModel[141].setRotationPoint(-34F, 8F, 3F);

		bodyModel[142].addBox(0F, 0F, 0F, 3, 0, 8, 0F); // Box 178
		bodyModel[142].setRotationPoint(31.01F, 8F, 3F);

		bodyModel[143].addBox(0F, 0F, 0F, 3, 0, 8, 0F); // Box 179
		bodyModel[143].setRotationPoint(31.01F, 8F, -11F);

		bodyModel[144].addBox(0F, 0F, 0F, 1, 3, 2, 0F); // Box 452
		bodyModel[144].setRotationPoint(-31.5F, -3F, -4.5F);

		bodyModel[145].addBox(0F, 0F, 0F, 1, 3, 2, 0F); // Box 453
		bodyModel[145].setRotationPoint(30.5F, -3F, 2.5F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 9, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1.75F, -2F, 0F, -1.75F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F); // Box 122
		bodyModel[146].setRotationPoint(13F, -20F, 11F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 9, 2, 1, 0F,-1.75F, -2F, 0F, -1.75F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 123
		bodyModel[147].setRotationPoint(13F, -20F, -12F);

		bodyModel[148].addBox(0F, 0F, 0F, 2, 2, 20, 0F); // Box 456
		bodyModel[148].setRotationPoint(-33F, 6.5F, -10F);

		bodyModel[149].addBox(0F, 0F, 0F, 2, 2, 20, 0F); // Box 457
		bodyModel[149].setRotationPoint(31F, 6.5F, -10F);

		bodyModel[150].addBox(0F, 0F, 0F, 4, 1, 22, 0F); // Box 462
		bodyModel[150].setRotationPoint(-19F, 1F, -11F);

		bodyModel[151].addBox(0F, 0F, 0F, 4, 1, 22, 0F); // Box 463
		bodyModel[151].setRotationPoint(15F, 1F, -11F);

		bodyModel[152].addBox(0F, 0F, 0F, 0, 7, 1, 0F); // Box 299
		bodyModel[152].setRotationPoint(27.5F, -2F, 10F);

		bodyModel[153].addBox(0F, 0F, 0F, 0, 7, 1, 0F); // Box 303
		bodyModel[153].setRotationPoint(27.5F, -2F, -11F);

		bodyModel[154].addBox(0F, 0F, 0F, 3, 3, 0, 0F); // Box 307
		bodyModel[154].setRotationPoint(24.5F, -8F, 8F);

		bodyModel[155].addBox(0F, 0F, 0F, 3, 3, 0, 0F); // Box 308
		bodyModel[155].setRotationPoint(24.5F, -8F, -8F);

		bodyModel[156].addBox(0F, 0F, 0F, 2, 0, 2, 0F); // Box 310 nasa cap
		bodyModel[156].setRotationPoint(1.75F, -23.5F, -1F);
		bodyModel[156].rotateAngleZ = -0.87266463F;

		bodyModel[157].addBox(0F, 0F, 0F, 2, 0, 2, 0F); // Box 311 nasa cap
		bodyModel[157].setRotationPoint(-10.25F, -23.5F, -1F);
		bodyModel[157].rotateAngleZ = -0.87266463F;

		bodyModel[158].addBox(0F, 0F, 0F, 1, 3, 0, 0F); // Box 312
		bodyModel[158].setRotationPoint(17F, -24.5F, -0.5F);

		bodyModel[159].addBox(0F, 0F, 0F, 1, 3, 0, 0F); // Box 313
		bodyModel[159].setRotationPoint(17F, -24.5F, 0.5F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 315 glow commander beacon
		bodyModel[160].setRotationPoint(17.03F, -26.5F, -0.5F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0.3F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, 0.3F, -0.5F, 0.1F, 0.3F, 0F, 0.1F, -1F, 0F, 0.1F, -1F, 0F, 0.1F, 0.3F, 0F, 0.1F); // Box 316
		bodyModel[161].setRotationPoint(17.18F, -25.5F, -0.5F);

		bodyModel[162].addShapeBox(-0.5F, 0F, -1F, 1, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, -1F, -1F); // Box 71 glow speedometer
		bodyModel[162].setRotationPoint(14F, -16F, 5F);
		bodyModel[162].rotateAngleY = 0.78539816F;

		bodyModel[163].addShapeBox(-1F, 0F, 0F, 7, 4, 2, 0F,0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, -2F, 0F, -4F, -2F, 0F, -4F, -2F, 0F, 0F, -2F, 0F); // Box 296
		bodyModel[163].setRotationPoint(12F, -12F, 9F);
		bodyModel[163].rotateAngleY = -1.57079633F;

		bodyModel[164].addBox(0F, 0F, 0F, 2, 9, 6, 0F); // Box 297
		bodyModel[164].setRotationPoint(12F, -14F, -7F);

		bodyModel[165].addBox(0F, 0F, 0F, 5, 1, 6, 0F); // Box 299
		bodyModel[165].setRotationPoint(18F, -6F, -10F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F); // Box 300
		bodyModel[166].setRotationPoint(16F, -6F, -10F);

		bodyModel[167].addBox(0F, 0F, 0F, 5, 1, 5, 0F); // Box 301
		bodyModel[167].setRotationPoint(18F, -6F, 5F);

		bodyModel[168].addBox(0F, 0F, 0F, 6, 1, 7, 0F); // Box 302
		bodyModel[168].setRotationPoint(12F, -6F, 3F);

		bodyModel[169].addBox(0F, 0F, 0F, 6, 3, 3, 0F); // Box 303
		bodyModel[169].setRotationPoint(11.4F, -14F, 4F);
		bodyModel[169].rotateAngleY = -0.38397244F;

		bodyModel[170].addBox(0F, 0F, 0F, 3, 10, 3, 0F); // Box 304
		bodyModel[170].setRotationPoint(17.5F, -15F, 2F);

		bodyModel[171].addShapeBox(2F, 3F, 0.5F, 2, 6, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 305
		bodyModel[171].setRotationPoint(11.4F, -14F, 4F);
		bodyModel[171].rotateAngleY = -0.38397244F;

		bodyModel[172].addBox(0F, 0F, 0F, 3, 3, 1, 0F); // Box 306
		bodyModel[172].setRotationPoint(19F, -11F, -10F);

		bodyModel[173].addShapeBox(-1.5F, 0F, -1F, 2, 2, 2, 0F,0F, 0F, 0.25F, -0.25F, 0.25F, 0.25F, -0.25F, 0.25F, 0.25F, 0F, 0F, 0.25F, 0F, 0.25F, 0.25F, -0.25F, 0.25F, 0.25F, -0.25F, 0.25F, 0.25F, 0F, 0.25F, 0.25F); // Box 307
		bodyModel[173].setRotationPoint(14F, -16F, 5F);
		bodyModel[173].rotateAngleY = 0.78539816F;

		bodyModel[174].addBox(0F, 0F, 0F, 2, 7, 4, 0F); // Box 298
		bodyModel[174].setRotationPoint(12F, -12F, -1F);

		bodyModel[175].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 385 lamp front 2 beam
		bodyModel[175].setRotationPoint(-29.5F, -16.25F, 0F);

		bodyModel[176].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 386 lamp front 2 beam
		bodyModel[176].setRotationPoint(-29.5F, -16.25F, -2F);

		bodyModel[177].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 387
		bodyModel[177].setRotationPoint(-29.25F, -16.25F, -2F);

		bodyModel[178].addShapeBox(0F, 0F, 0F, 0, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 341 numberboard glow
		bodyModel[178].setRotationPoint(-28.23F, -16F, -5.5F);
		bodyModel[178].rotateAngleY = 0.13962634F;

		bodyModel[179].addShapeBox(0F, 0F, -3F, 0, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 342 numberboard glow
		bodyModel[179].setRotationPoint(-28.23F, -16F, 5.5F);
		bodyModel[179].rotateAngleY = -0.13962634F;

		bodyModel[180].addBox(-0.5F, 0F, -0.5F, 1, 1, 1, 0F); // Box 307 glow marker
		bodyModel[180].setRotationPoint(-27.75F, -15.5F, -6.25F);
		bodyModel[180].rotateAngleY = 0.13962634F;

		bodyModel[181].addBox(-0.5F, 0F, -0.5F, 1, 1, 1, 0F); // Box 308 glow marker
		bodyModel[181].setRotationPoint(-27.75F, -15.5F, 6.25F);
		bodyModel[181].rotateAngleY = -0.13962634F;

		bodyModel[182].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 331 lamp front 2 beam sp
		bodyModel[182].setRotationPoint(-29.25F, -16.25F, -5.25F);

		bodyModel[183].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 332 lamp front 2 beam sp
		bodyModel[183].setRotationPoint(-29.25F, -16.25F, -3.3F);

		bodyModel[184].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 333 lamp front gyro sp
		bodyModel[184].setRotationPoint(-29.5F, -16.25F, 1.3F);

		bodyModel[185].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 334 lamp front gyro sp
		bodyModel[185].setRotationPoint(-29.5F, -16.25F, 3.25F);

		bodyModel[186].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 336 glow front gyro red sp
		bodyModel[186].setRotationPoint(-29.5F, -16.25F, -1F);

		bodyModel[187].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0.25F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0.25F, 0F, 0.25F); // Box 337 why are you like this SP
		bodyModel[187].setRotationPoint(-29F, -16.25F, -1F);

		bodyModel[188].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F); // Box 299
		bodyModel[188].setRotationPoint(-29F, -16.25F, 1.5F);

		bodyModel[189].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, -1F, 0.5F, 0F, -1F, 2F, 0F, -0.63F, -0.5F, 0F, -0.65F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 2F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 295
		bodyModel[189].setRotationPoint(-29F, -17F, -5F);

		bodyModel[190].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 1F, 0F, -1F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 1F, 0F, 0F, -0.5F); // Box 299
		bodyModel[190].setRotationPoint(-29F, -17F, 0F);

		bodyModel[191].addBox(-0.5F, 0F, -0.5F, 1, 1, 1, 0F); // Box 300 glow marker
		bodyModel[191].setRotationPoint(-28.25F, -15.5F, -6F);
		bodyModel[191].rotateAngleY = 0.59341195F;

		bodyModel[192].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 347
		bodyModel[192].setRotationPoint(-28F, -17F, 0F);

		bodyModel[193].addBox(-0.5F, 0F, -0.5F, 1, 1, 1, 0F); // Box 348 glow marker
		bodyModel[193].setRotationPoint(-28.25F, -15.5F, 6F);
		bodyModel[193].rotateAngleY = -0.59341195F;

		bodyModel[194].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,1F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 349
		bodyModel[194].setRotationPoint(-28F, -16F, 6F);

		bodyModel[195].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 350
		bodyModel[195].setRotationPoint(-29F, -16F, -5.5F);

		bodyModel[196].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 355
		bodyModel[196].setRotationPoint(-28F, -17F, -7F);

		bodyModel[197].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, -1F, -0.5F, 0F, -1F, 1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, 1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 356
		bodyModel[197].setRotationPoint(-29F, -17F, -6F);

		bodyModel[198].addShapeBox(0F, 0F, 0F, 1, 3, 5, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.61F, 0.5F, 0F, -0.61F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 357
		bodyModel[198].setRotationPoint(-28F, -17F, -7F);

		bodyModel[199].addShapeBox(0F, 0F, 0F, 19, 1, 7, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 359
		bodyModel[199].setRotationPoint(-16F, -17F, 0F);

		bodyModel[200].addShapeBox(0F, 0F, 0F, 19, 1, 7, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 360
		bodyModel[200].setRotationPoint(-16F, -17F, -7F);

		bodyModel[201].addBox(0F, -0.5F, -0.5F, 1, 3, 1, 0F); // Box 19
		bodyModel[201].setRotationPoint(3.5F, 2F, -11F);
		bodyModel[201].rotateAngleX = 0.78539816F;

		bodyModel[202].addBox(0F, 0F, 0F, 10, 3, 22, 0F); // Box 489
		bodyModel[202].setRotationPoint(-5F, 3F, -11F);

		bodyModel[203].addShapeBox(0F, 0F, 0F, 10, 1, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 278
		bodyModel[203].setRotationPoint(-5F, 2F, -11F);

		bodyModel[204].addShapeBox(0F, 0F, 0F, 10, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 281
		bodyModel[204].setRotationPoint(-5F, 6F, -11F);

		bodyModel[205].addShapeBox(0F, 0F, 0F, 10, 3, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 288
		bodyModel[205].setRotationPoint(-5F, 6F, -9F);

		bodyModel[206].addShapeBox(0F, 0F, 0F, 10, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 315
		bodyModel[206].setRotationPoint(-5F, 2F, 7F);

		bodyModel[207].addShapeBox(0F, 0F, 0F, 10, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 316
		bodyModel[207].setRotationPoint(-5F, 6F, 9F);

		bodyModel[208].addShapeBox(0F, 0F, 0F, 20, 0, 14, 0F,0F, 0F, 0F, -10F, 0F, 0F, -10F, -0.5F, -7F, 0F, -0.5F, -7F, 0F, 0F, 0F, -10F, 0F, 0F, -10F, 0.5F, -7F, 0F, 0.5F, -7F); // Box 369
		bodyModel[208].setRotationPoint(-26F, -16.5F, 0F);

		bodyModel[209].addShapeBox(0F, 0F, 0F, 20, 4, 0, 0F,0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -10F, -2F, 0F, -10F, -2F, 0F, 0F, -2F, 0F); // Box 370
		bodyModel[209].setRotationPoint(-26F, -16F, -7F);

		bodyModel[210].addShapeBox(0F, 0F, 0F, 20, 0, 14, 0F,0F, -0.5F, -7F, -10F, -0.5F, -7F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -7F, -10F, 0.5F, -7F, -10F, 0F, 0F, 0F, 0F, 0F); // Box 372
		bodyModel[210].setRotationPoint(-26F, -16.5F, -14F);

		bodyModel[211].addShapeBox(0F, 0F, 0F, 20, 4, 0, 0F,0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -10F, -2F, 0F, -10F, -2F, 0F, 0F, -2F, 0F); // Box 373
		bodyModel[211].setRotationPoint(-26F, -16F, 7F);

		bodyModel[212].addShapeBox(0F, 0F, 0F, 10, 2, 6, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 374
		bodyModel[212].setRotationPoint(-26F, -16F, 0.5F);

		bodyModel[213].addShapeBox(0F, 0F, 0F, 10, 2, 6, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 375
		bodyModel[213].setRotationPoint(-26F, -16F, -6.5F);

		bodyModel[214].addBox(0F, 0F, 0F, 10, 1, 1, 0F); // Box 376
		bodyModel[214].setRotationPoint(-26F, -16.4F, -0.5F);

		bodyModel[215].addBox(0F, 0F, 0F, 4, 4, 4, 0F); // Box 377 cull
		bodyModel[215].setRotationPoint(-12F, -24.5F, -2F);

		bodyModel[216].addBox(0F, 0F, 0F, 4, 3, 4, 0F); // Box 288
		bodyModel[216].setRotationPoint(-31F, 2.5F, -2F);

		bodyModel[217].addBox(0F, 0F, 0F, 4, 3, 4, 0F); // Box 379
		bodyModel[217].setRotationPoint(27F, 2.5F, -2F);

		bodyModel[218].addShapeBox(0F, 0F, 0F, 1, 2, 7, 0F,1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 1F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 380
		bodyModel[218].setRotationPoint(-28F, -17F, 0F);

		bodyModel[219].addShapeBox(0F, 0F, 0F, 1, 2, 7, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 1F, -0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 1F, 1F, 0F); // Box 382
		bodyModel[219].setRotationPoint(-28F, -17F, -7F);

		bodyModel[220].addShapeBox(0F, 0F, 0F, 1, 0, 6, 0F,0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 356
		bodyModel[220].setRotationPoint(10F, -22.5F, -9F);

		bodyModel[221].addBox(0F, 0F, 0F, 1, 0, 6, 0F); // Box 358
		bodyModel[221].setRotationPoint(10F, -22F, -3F);

		bodyModel[222].addShapeBox(0F, 0F, 0F, 1, 0, 6, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F); // Box 359
		bodyModel[222].setRotationPoint(10F, -22.5F, 3F);

		bodyModel[223].addShapeBox(0F, 0F, 0F, 1, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -1F, 1F, 0F); // Box 360
		bodyModel[223].setRotationPoint(10F, -21F, 9F);

		bodyModel[224].addShapeBox(0F, 0F, 0F, 1, 0, 2, 0F,-1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 294
		bodyModel[224].setRotationPoint(10F, -21F, -11F);

		bodyModel[225].addShapeBox(0F, 0F, 0F, 11, 1, 6, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F); // Box 132
		bodyModel[225].setRotationPoint(12F, -22.5F, 3F);

		bodyModel[226].addBox(0F, 0F, 0F, 13, 1, 6, 0F); // Box 135
		bodyModel[226].setRotationPoint(11F, -22F, -3F);

		bodyModel[227].addShapeBox(0F, 0F, 0F, 11, 1, 6, 0F,0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 57
		bodyModel[227].setRotationPoint(12F, -22.5F, -9F);

		bodyModel[228].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 280
		bodyModel[228].setRotationPoint(12F, -20F, -10F);

		bodyModel[229].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 281
		bodyModel[229].setRotationPoint(12F, -20F, 9F);

		bodyModel[230].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 282
		bodyModel[230].setRotationPoint(11F, -22.5F, -9F);

		bodyModel[231].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 284
		bodyModel[231].setRotationPoint(11F, -22.5F, 3F);

		bodyModel[232].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 285
		bodyModel[232].setRotationPoint(23F, -22.5F, 3F);

		bodyModel[233].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 286
		bodyModel[233].setRotationPoint(23F, -22.5F, -9F);

		bodyModel[234].addShapeBox(0F, 0F, 0F, 1, 2, 7, 0F,0F, -0.5F, 0F, 1F, -0.5F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, 1F, 0F, 1F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 399
		bodyModel[234].setRotationPoint(24F, -22.5F, 0F);

		bodyModel[235].addShapeBox(0F, 0F, 0F, 1, 2, 7, 0F,0F, -1.25F, 0F, 0F, -1.25F, 0F, 1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 1F, 1F, 0F, 0F, 1F, 0F); // Box 400
		bodyModel[235].setRotationPoint(24F, -22.5F, -7F);

		bodyModel[236].addBox(-0.5F, 0F, -0.5F, 1, 1, 1, 0F); // Box 401 glow marker
		bodyModel[236].setRotationPoint(24.75F, -21F, -6.25F);
		bodyModel[236].rotateAngleY = -0.13962634F;

		bodyModel[237].addShapeBox(0F, 0F, 0F, 0, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 402 numberboard glow
		bodyModel[237].setRotationPoint(25.23F, -21.5F, -5.5F);
		bodyModel[237].rotateAngleY = -0.13962634F;

		bodyModel[238].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 403
		bodyModel[238].setRotationPoint(25.25F, -21.75F, -2F);

		bodyModel[239].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 404 lamp rear 2 beam
		bodyModel[239].setRotationPoint(25.5F, -21.75F, -2F);

		bodyModel[240].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 405 lamp rear 2 beam
		bodyModel[240].setRotationPoint(25.5F, -21.75F, 0F);

		bodyModel[241].addShapeBox(0F, 0F, -3F, 0, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 406 numberboard glow
		bodyModel[241].setRotationPoint(25.23F, -21.5F, 5.5F);
		bodyModel[241].rotateAngleY = 0.13962634F;

		bodyModel[242].addBox(-0.5F, 0F, -0.5F, 1, 1, 1, 0F); // Box 407 glow marker
		bodyModel[242].setRotationPoint(24.75F, -21F, 6.25F);
		bodyModel[242].rotateAngleY = 0.13962634F;

		bodyModel[243].addBox(0F, 0F, 0F, 2, 0, 6, 0F); // Box 408
		bodyModel[243].setRotationPoint(24F, -22F, -3F);

		bodyModel[244].addShapeBox(0F, 0F, 0F, 1, 0, 6, 0F,0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 409
		bodyModel[244].setRotationPoint(24F, -22.5F, -9F);

		bodyModel[245].addShapeBox(0F, 0F, 0F, 1, 0, 2, 0F,0F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 410
		bodyModel[245].setRotationPoint(24F, -21F, -11F);

		bodyModel[246].addShapeBox(0F, 0F, 0F, 1, 0, 6, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F); // Box 411
		bodyModel[246].setRotationPoint(24F, -22.5F, 3F);

		bodyModel[247].addShapeBox(0F, 0F, 0F, 1, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 1F, 0F, 0F, 1F, 0F); // Box 412
		bodyModel[247].setRotationPoint(24F, -21F, 9F);

		bodyModel[248].addShapeBox(0F, 0F, 0F, 1, 0, 6, 0F,0F, -1.5F, 0F, -1F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 1.5F, 0F, -1F, 1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 413
		bodyModel[248].setRotationPoint(25F, -22.5F, -9F);

		bodyModel[249].addShapeBox(0F, 0F, 0F, 1, 0, 6, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -1F, 1.5F, 0F, 0F, 1.5F, 0F); // Box 414
		bodyModel[249].setRotationPoint(25F, -22.5F, 3F);

		bodyModel[250].addBox(0F, -0.5F, -0.5F, 1, 3, 1, 0F); // Box 415
		bodyModel[250].setRotationPoint(3.5F, 2F, 11F);
		bodyModel[250].rotateAngleX = -0.78539816F;

		bodyModel[251].addShapeBox(0F, 0F, 0F, 1, 2, 7, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 416
		bodyModel[251].setRotationPoint(-27F, -17F, -7F);

		bodyModel[252].addShapeBox(0F, 0F, 0F, 1, 2, 7, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 417
		bodyModel[252].setRotationPoint(-27F, -17F, 0F);

		bodyModel[253].addBox(0F, 0F, 0F, 2, 7, 14, 0F); // Box 457
		bodyModel[253].setRotationPoint(-16F, -16F, -7F);

		bodyModel[254].addBox(0F, 0F, 0F, 2, 8, 13, 0F); // Box 458
		bodyModel[254].setRotationPoint(-16F, -9F, -6F);

		bodyModel[255].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
		bodyModel[255].setRotationPoint(-15.5F, -8.5F, -7F);

		bodyModel[256].addBox(0F, 0F, 0F, 0, 6, 1, 0F); // Box 43
		bodyModel[256].setRotationPoint(-15F, -6.5F, -7F);

		bodyModel[257].addBox(0F, 0F, 0F, 2, 1, 14, 0F); // Box 574
		bodyModel[257].setRotationPoint(-16F, -1F, -7F);

		bodyModel[258].addShapeBox(0F, 0F, 0F, 0, 2, 6, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 308 sp light cover
		bodyModel[258].setRotationPoint(-29.02F, -16F, 0F);

		bodyModel[259].addShapeBox(0F, 0F, 0F, 0, 2, 6, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 309 sp light cover
		bodyModel[259].setRotationPoint(-29.02F, -16F, -6F);

		bodyModel[260].addBox(0F, 0F, 0F, 1, 0, 14, 0F); // Box 310 sp light cover
		bodyModel[260].setRotationPoint(-28F, -13.98F, -7F);

		bodyModel[261].addShapeBox(0F, 0F, 0F, 1, 0, 12, 0F,0F, 0F, -0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -0.5F); // Box 311 sp light cover
		bodyModel[261].setRotationPoint(-29F, -13.98F, -6F);

		bodyModel[262].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 331 lamp rear 2 beam sp
		bodyModel[262].setRotationPoint(25.25F, -21.75F, 1.3F);

		bodyModel[263].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 332 lamp rear 2 beam sp
		bodyModel[263].setRotationPoint(25.25F, -21.75F, 3.25F);

		bodyModel[264].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 333 lamp rear gyro sp
		bodyModel[264].setRotationPoint(25.5F, -21.75F, -5.25F);

		bodyModel[265].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 334 lamp rear gyro sp
		bodyModel[265].setRotationPoint(25.5F, -21.75F, -3.3F);

		bodyModel[266].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 336 glow rear gyro red sp
		bodyModel[266].setRotationPoint(25.5F, -21.75F, -1F);

		bodyModel[267].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 337 why are you like this SP
		bodyModel[267].setRotationPoint(24F, -21.75F, -1F);

		bodyModel[268].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,0F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F); // Box 299
		bodyModel[268].setRotationPoint(24F, -21.75F, -5.5F);

		bodyModel[269].addBox(-0.5F, 0F, -0.5F, 1, 1, 1, 0F); // Box 300 glow marker
		bodyModel[269].setRotationPoint(25.25F, -21F, -6F);
		bodyModel[269].rotateAngleY = -0.59341195F;

		bodyModel[270].addBox(-0.5F, 0F, -0.5F, 1, 1, 1, 0F); // Box 348 glow marker
		bodyModel[270].setRotationPoint(25.25F, -21F, 6F);
		bodyModel[270].rotateAngleY = 0.59341195F;

		bodyModel[271].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 349
		bodyModel[271].setRotationPoint(24F, -21.5F, -7F);

		bodyModel[272].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F); // Box 350
		bodyModel[272].setRotationPoint(25F, -21.5F, 1.5F);

		bodyModel[273].addShapeBox(0F, 0F, 0F, 1, 3, 5, 0F,0F, -0.61F, 0.5F, 0F, -0.61F, 0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 357
		bodyModel[273].setRotationPoint(24F, -22.5F, 2F);

		bodyModel[274].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 308 sp light cover
		bodyModel[274].setRotationPoint(25.02F, -21.5F, 3F);

		bodyModel[275].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 309 sp light cover
		bodyModel[275].setRotationPoint(25.02F, -21.5F, -6F);

		bodyModel[276].addBox(0F, 0F, 0F, 1, 0, 14, 0F); // Box 310 sp light cover
		bodyModel[276].setRotationPoint(24F, -19.48F, -7F);

		bodyModel[277].addShapeBox(0F, 0F, 0F, 1, 0, 12, 0F,0F, 0F, 1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 1F); // Box 311 sp light cover
		bodyModel[277].setRotationPoint(25F, -19.48F, -6F);

		bodyModel[278].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 336 sp light cover
		bodyModel[278].setRotationPoint(25.02F, -22F, -3F);

		bodyModel[279].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, -0.63F, -0.5F, 0F, -0.65F, -0.5F, 0F, -1F, 0.5F, 0F, -1F, 2F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 2F); // Box 337
		bodyModel[279].setRotationPoint(25F, -22.5F, 1F);

		bodyModel[280].addShapeBox(0F, 0F, 0F, 7, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F); // Box 3 cull aww
		bodyModel[280].setRotationPoint(14F, -19F, 10F);

		bodyModel[281].addShapeBox(0F, 0F, 0F, 7, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 5 aww
		bodyModel[281].setRotationPoint(14F, -20F, 10F);

		bodyModel[282].addBox(0F, 0F, 0F, 34, 0, 1, 0F); // Box 340
		bodyModel[282].setRotationPoint(-26F, -13F, -8F);

		bodyModel[283].addBox(0F, 0F, 0F, 34, 0, 1, 0F); // Box 341
		bodyModel[283].setRotationPoint(-26F, -13F, 7F);

		bodyModel[284].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 303
		bodyModel[284].setRotationPoint(26F, -5F, 8F);

		bodyModel[285].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,1F, 0F, 0F, 0F, -2F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 305
		bodyModel[285].setRotationPoint(27F, -5F, 8F);

		bodyModel[286].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, -2F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 306
		bodyModel[286].setRotationPoint(27F, -5F, -11F);

		bodyModel[287].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 307
		bodyModel[287].setRotationPoint(26F, -5F, -11F);

		bodyModel[288].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0.5F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0.5F, 0F, -1F, 0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F); // Box 280
		bodyModel[288].setRotationPoint(-34F, 4F, 2F);

		bodyModel[289].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F); // Box 281
		bodyModel[289].setRotationPoint(-34F, 6F, 0F);

		bodyModel[290].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,-1F, 0F, 0F, 0.5F, 0F, 0F, 3F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, -1F, -2.5F, 0F, -1F); // Box 282
		bodyModel[290].setRotationPoint(-35F, 7F, 0F);

		bodyModel[291].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,-3.5F, 0F, 0F, 3F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -2.5F, 0F, -1F, 2F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 283
		bodyModel[291].setRotationPoint(-35F, 7F, -10F);

		bodyModel[292].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,-2.5F, 0F, 0F, 2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 284
		bodyModel[292].setRotationPoint(-34F, 6F, -10F);

		bodyModel[293].addShapeBox(0F, 0F, -2F, 1, 1, 8, 0F,-1F, 0.5F, 0F, 0.5F, 0.5F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 285
		bodyModel[293].setRotationPoint(-34F, 4F, -8F);

		bodyModel[294].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0.5F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1.5F, 0F, 0F); // Box 340
		bodyModel[294].setRotationPoint(-33F, 5F, 2F);

		bodyModel[295].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,-1.5F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F); // Box 342
		bodyModel[295].setRotationPoint(-33F, 5F, -10F);

		bodyModel[296].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F); // Box 354
		bodyModel[296].setRotationPoint(33F, 6F, 0F);

		bodyModel[297].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,2F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 355
		bodyModel[297].setRotationPoint(33F, 6F, -10F);

		bodyModel[298].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,3F, 0F, 0F, -3.5F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 2F, 0F, -1F, -2.5F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 356
		bodyModel[298].setRotationPoint(34F, 7F, -10F);

		bodyModel[299].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,0.5F, 0F, 0F, -1F, 0F, 0F, -3.5F, 0F, 0F, 3F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, -1F, 2F, 0F, -1F); // Box 357
		bodyModel[299].setRotationPoint(34F, 7F, 0F);

		bodyModel[300].addShapeBox(-2F, 0F, 0F, 1, 1, 8, 0F,-1F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, 0F); // Box 358
		bodyModel[300].setRotationPoint(34F, 5F, 2F);

		bodyModel[301].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,-1F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F); // Box 359
		bodyModel[301].setRotationPoint(33F, 4F, 2F);

		bodyModel[302].addShapeBox(-2F, 0F, 0F, 1, 1, 8, 0F,1F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F); // Box 360
		bodyModel[302].setRotationPoint(34F, 5F, -10F);

		bodyModel[303].addShapeBox(0F, 0F, -2F, 1, 1, 8, 0F,0.5F, 0.5F, 0F, -1F, 0.5F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 361
		bodyModel[303].setRotationPoint(33F, 4F, -8F);

		bodyModel[304].addBox(0F, 0F, 0F, 1, 3, 4, 0F); // Box 160
		bodyModel[304].setRotationPoint(-31.5F, -3F, -2F);

		bodyModel[305].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 161
		bodyModel[305].setRotationPoint(-31.5F, -4F, -2F);

		bodyModel[306].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 594
		bodyModel[306].setRotationPoint(30.5F, -4F, -2F);

		bodyModel[307].addBox(0F, 0F, 0F, 1, 3, 4, 0F); // Box 595
		bodyModel[307].setRotationPoint(30.5F, -3F, -2F);

		bodyModel[308].addBox(0F, 0F, 0F, 3, 12, 4, 0F); // Box 366 kcs shit
		bodyModel[308].setRotationPoint(8F, -12F, 7F);

		bodyModel[309].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 364 prime base
		bodyModel[309].setRotationPoint(13F, -23F, -1F);

		bodyModel[310].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F); // Box 6 PRIME1-1
		bodyModel[310].setRotationPoint(13F, -23.5F, -1F);

		bodyModel[311].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F); // Box 7 PRIME1-3
		bodyModel[311].setRotationPoint(13F, -23.5F, -1F);

		bodyModel[312].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 8 PRIME1-2
		bodyModel[312].setRotationPoint(13F, -23.5F, -1F);

		bodyModel[313].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 9 PRIME1-4
		bodyModel[313].setRotationPoint(13F, -23.5F, -1F);

		bodyModel[314].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 359 smoke
		bodyModel[314].setRotationPoint(1F, -23F, -1F);

		bodyModel[315].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 360 smoke
		bodyModel[315].setRotationPoint(-11F, -23F, -1F);

		bodyModel[316].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 361 up 1198
		bodyModel[316].setRotationPoint(-21F, 2F, 9.25F);

		bodyModel[317].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 362
		bodyModel[317].setRotationPoint(-21F, 1F, 9.25F);

		bodyModel[318].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 363
		bodyModel[318].setRotationPoint(-20.75F, 2.5F, 9.5F);

		bodyModel[319].addShapeBox(0F, 0F, 0F, 2, 1, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 364
		bodyModel[319].setRotationPoint(16F, 2F, -11F);

		bodyModel[320].addShapeBox(0F, 0F, 0F, 2, 1, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 365
		bodyModel[320].setRotationPoint(-18F, 2F, -11F);

		bodyModel[321].addBox(0F, 0F, 0F, 5, 2, 8, 0F); // Box 366
		bodyModel[321].setRotationPoint(14.5F, -23.5F, -4F);

		bodyModel[322].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, -2F, 2F, 0F, -2F, 2F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 519
		bodyModel[322].setRotationPoint(31F, -8F, -10F);
		bodyModel[322].rotateAngleY = -3.14159265F;

		bodyModel[323].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, -2F, 2F, 0F, -2F, 2F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 368
		bodyModel[323].setRotationPoint(27.5F, -8F, -10F);
		bodyModel[323].rotateAngleY = -3.14159265F;

		bodyModel[324].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, -2F, 2F, 0F, -2F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 369
		bodyModel[324].setRotationPoint(27.5F, -8F, 11F);
		bodyModel[324].rotateAngleY = -3.14159265F;

		bodyModel[325].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, -2F, 2F, 0F, -2F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 370
		bodyModel[325].setRotationPoint(31F, -8F, 11F);
		bodyModel[325].rotateAngleY = -3.14159265F;

		bodyModel[326].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, -2F, 2F, 0F, -2F, 2F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 371
		bodyModel[326].setRotationPoint(-31F, -8F, -10F);
		bodyModel[326].rotateAngleY = -3.14159265F;

		bodyModel[327].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, -2F, 2F, 0F, -2F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 372
		bodyModel[327].setRotationPoint(-31F, -8F, 11F);
		bodyModel[327].rotateAngleY = -3.14159265F;

		bodyModel[328].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 373 gyralight front up
		bodyModel[328].setRotationPoint(-29.5F, -18.75F, 0F);

		bodyModel[329].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 374 gyralight front up
		bodyModel[329].setRotationPoint(-29.5F, -18.75F, -2F);

		bodyModel[330].addBox(0F, 0F, 0F, 2, 2, 4, 0F); // Box 375
		bodyModel[330].setRotationPoint(-29.25F, -18.75F, -2F);

		bodyModel[331].addShapeBox(0F, 0F, 0F, 2, 3, 0, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 376
		bodyModel[331].setRotationPoint(-29.25F, -18.75F, -2.01F);

		bodyModel[332].addShapeBox(0F, 0F, 0F, 2, 3, 0, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 377
		bodyModel[332].setRotationPoint(-29.25F, -18.75F, 2.01F);

		bodyModel[333].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 364 prime base
		bodyModel[333].setRotationPoint(22F, -23F, -1F);

		bodyModel[334].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F); // Box 6 PRIME2-1
		bodyModel[334].setRotationPoint(22F, -23.5F, -1F);

		bodyModel[335].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F); // Box 7 PRIME2-3
		bodyModel[335].setRotationPoint(22F, -23.5F, -1F);

		bodyModel[336].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 8 PRIME2-2
		bodyModel[336].setRotationPoint(22F, -23.5F, -1F);

		bodyModel[337].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 9 PRIME2-4
		bodyModel[337].setRotationPoint(22F, -23.5F, -1F);

		bodyModel[338].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 383
		bodyModel[338].setRotationPoint(14F, -22.5F, -6F);

		bodyModel[339].addBox(0F, 0F, -2F, 6, 2, 4, 0F); // Box 380
		bodyModel[339].setRotationPoint(16F, -23.5F, -6F);
		bodyModel[339].rotateAngleX = 0.15707963F;

		bodyModel[340].addShapeBox(-1F, 1F, -2F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 381
		bodyModel[340].setRotationPoint(16F, -23.5F, -6F);
		bodyModel[340].rotateAngleX = 0.15707963F;

		bodyModel[341].addShapeBox(-1F, 0F, -2F, 1, 1, 4, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 382
		bodyModel[341].setRotationPoint(16F, -23.5F, -6F);
		bodyModel[341].rotateAngleX = 0.15707963F;

		bodyModel[342].addBox(0F, 0F, 0F, 0, 5, 1, 0F); // Box 390
		bodyModel[342].setRotationPoint(14F, -19F, 11F);

		bodyModel[343].addBox(0F, 0F, 0F, 0, 5, 1, 0F); // Box 391
		bodyModel[343].setRotationPoint(14F, -19F, -12F);

		bodyModel[344].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 392
		bodyModel[344].setRotationPoint(-28F, 0F, -8F);

		bodyModel[345].addBox(0F, 0F, 0F, 0, 2, 1, 0F); // Box 393
		bodyModel[345].setRotationPoint(-28F, 1F, -8F);

		bodyModel[346].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 394
		bodyModel[346].setRotationPoint(-31F, 3F, -8F);

		bodyModel[347].addShapeBox(0F, 0F, 0F, 3, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.35F, 0F, 0F, 0F, 0F, 0F); // Box 395
		bodyModel[347].setRotationPoint(-31F, 3F, 8F);

		bodyModel[348].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 396
		bodyModel[348].setRotationPoint(-31F, 3F, 7F);

		bodyModel[349].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, -1F, 0F, 0F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.35F, 0F, 0F, 0F, 0F, 0F); // Box 397
		bodyModel[349].setRotationPoint(-31F, 5F, 8F);

		bodyModel[350].addBox(0F, 0F, 0F, 3, 1, 0, 0F); // Box 398
		bodyModel[350].setRotationPoint(-31F, 4F, 8F);

		bodyModel[351].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,0F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, 0F); // Box 399
		bodyModel[351].setRotationPoint(-31F, 7F, 9F);

		bodyModel[352].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 400
		bodyModel[352].setRotationPoint(-31F, 8F, 9F);

		bodyModel[353].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.4F, 0F, -1F, -0.6F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 401
		bodyModel[353].setRotationPoint(-28F, 5F, 8F);

		bodyModel[354].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 402
		bodyModel[354].setRotationPoint(-28F, 1F, 8F);

		bodyModel[355].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 403
		bodyModel[355].setRotationPoint(-31F, 0F, 7F);

		bodyModel[356].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 405
		bodyModel[356].setRotationPoint(-28F, 0F, 7F);

		bodyModel[357].addBox(0F, 0F, 0F, 0, 2, 1, 0F); // Box 406
		bodyModel[357].setRotationPoint(-28F, 1F, 7F);

		bodyModel[358].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 407
		bodyModel[358].setRotationPoint(28F, 0F, -8F);

		bodyModel[359].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 408
		bodyModel[359].setRotationPoint(28F, 3F, -8F);

		bodyModel[360].addShapeBox(0F, 0F, 0F, 3, 0, 1, 0F,0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 409
		bodyModel[360].setRotationPoint(28F, 3F, -9F);

		bodyModel[361].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 410
		bodyModel[361].setRotationPoint(27F, 1F, -11F);

		bodyModel[362].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 411
		bodyModel[362].setRotationPoint(27F, 0F, -11F);

		bodyModel[363].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 412
		bodyModel[363].setRotationPoint(27F, 0F, -8F);

		bodyModel[364].addBox(0F, 0F, 0F, 0, 2, 1, 0F); // Box 413
		bodyModel[364].setRotationPoint(28F, 1F, -8F);

		bodyModel[365].addBox(0F, 0F, 0F, 3, 1, 0, 0F); // Box 414
		bodyModel[365].setRotationPoint(28F, 4F, -8F);

		bodyModel[366].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,-0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 415
		bodyModel[366].setRotationPoint(27F, 5F, -10F);

		bodyModel[367].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.4F, 0F, -1F, -0.6F, 0F, -1F); // Box 416
		bodyModel[367].setRotationPoint(27F, 5F, -11F);

		bodyModel[368].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.4F, 0F, 0F); // Box 417
		bodyModel[368].setRotationPoint(28F, 7F, -9F);

		bodyModel[369].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F); // Box 418
		bodyModel[369].setRotationPoint(27F, 8F, -11F);

		bodyModel[370].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.4F, 0F, 0F); // Box 419
		bodyModel[370].setRotationPoint(28F, 7F, 9F);

		bodyModel[371].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,-0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 420
		bodyModel[371].setRotationPoint(27F, 8F, 9F);

		bodyModel[372].addBox(0F, 0F, 0F, 3, 1, 0, 0F); // Box 421
		bodyModel[372].setRotationPoint(28F, 4F, 8F);

		bodyModel[373].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, 0F, 0F); // Box 422
		bodyModel[373].setRotationPoint(27F, 5F, 8F);

		bodyModel[374].addShapeBox(0F, 0F, 0F, 3, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.35F, 0F, 0F); // Box 423
		bodyModel[374].setRotationPoint(28F, 3F, 8F);

		bodyModel[375].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 424
		bodyModel[375].setRotationPoint(28F, 3F, 7F);

		bodyModel[376].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 425
		bodyModel[376].setRotationPoint(28F, 0F, 7F);

		bodyModel[377].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 426
		bodyModel[377].setRotationPoint(27F, 0F, 8F);

		bodyModel[378].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F,-1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 427
		bodyModel[378].setRotationPoint(27F, 1F, 8F);

		bodyModel[379].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,-1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, -1F, -0.4F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 428
		bodyModel[379].setRotationPoint(27F, 5F, 8F);

		bodyModel[380].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 429
		bodyModel[380].setRotationPoint(27F, 0F, 7F);

		bodyModel[381].addBox(0F, 0F, 0F, 0, 2, 1, 0F); // Box 430
		bodyModel[381].setRotationPoint(28F, 1F, 7F);

		bodyModel[382].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 336
		bodyModel[382].setRotationPoint(-11F, -18F, -6.5F);

		bodyModel[383].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 337
		bodyModel[383].setRotationPoint(-10F, -17.75F, -7.5F);

		bodyModel[384].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 338
		bodyModel[384].setRotationPoint(-10.5F, -17.75F, -5.5F);

		bodyModel[385].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 339
		bodyModel[385].setRotationPoint(-9F, -17F, -6.5F);

		bodyModel[386].addShapeBox(0F, 0F, 0F, 1, 5, 0, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 283
		bodyModel[386].setRotationPoint(8F, -5F, -11F);

		bodyModel[387].addBox(0F, 0F, 0F, 2, 5, 0, 0F); // Box 284
		bodyModel[387].setRotationPoint(9F, -5F, -11F);

		bodyModel[388].addShapeBox(0F, 0F, 0F, 0, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 193 numberboard glow
		bodyModel[388].setRotationPoint(10.8F, -21.75F, -5.5F);
		bodyModel[388].rotateAngleY = 0.40142573F;

		bodyModel[389].addShapeBox(0F, 0F, -4F, 0, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 194 numberboard glow
		bodyModel[389].setRotationPoint(10.8F, -21.75F, 5.5F);
		bodyModel[389].rotateAngleY = -0.40142573F;

		bodyModel[390].addBox(0F, 0F, 0F, 1, 0, 4, 0F); // Box 390
		bodyModel[390].setRotationPoint(9F, -2F, -11F);

		bodyModel[391].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,-0.5F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 391 cull
		bodyModel[391].setRotationPoint(-33F, 6F, 7F);

		bodyModel[392].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,-0.5F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 391 cull
		bodyModel[392].setRotationPoint(-33F, 6F, -10F);

		bodyModel[393].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, 0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 391 cull
		bodyModel[393].setRotationPoint(31F, 6F, 7F);

		bodyModel[394].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, 0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 391 cull
		bodyModel[394].setRotationPoint(31F, 6F, -10F);

		bodyModel[395].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.25F, -0.25F, 0.25F, 0.25F, -0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F); // Box 395
		bodyModel[395].setRotationPoint(24.5F, -5.75F, -10.5F);

		bodyModel[396].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, -0.25F, 0.25F, 0.25F, -0.25F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F); // Box 396
		bodyModel[396].setRotationPoint(24.5F, -5.75F, 9.5F);
	}
	ModelFlexicoil2 theTrucks1 = new ModelFlexicoil2();
	ModelTypeA theTrucks2 = new ModelTypeA();

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		for (int i = 0; i < 397; i++) {
			if (bodyModel[i].boxName != null && bodyModel[i].boxName.contains("lamp")) {
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

		if (entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor() == 13244) {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/typeA_Silver.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.05, 0.33, 0);
			theTrucks2.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(2.13, 0, 0);
			theTrucks2.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else if (entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor() == 12 || entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor() == 4 || entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor() == 7) {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/flexicoil2_Black.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.05, 0.33, 0);
			theTrucks1.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(2.13, 0, 0);
			theTrucks1.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else if (entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor() == 6) {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/flexicoil2_Silver.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.05, 0.33, 0);
			theTrucks1.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(2.13, 0, 0);
			theTrucks1.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/typeA_Black.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.05, -0.03, 0);
			theTrucks2.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(2.13, 0, 0);
			theTrucks2.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		}
	}
	public float[] getTrans() {
		return new float[]{-1.0F, 0.15F, 0.00F};
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
				add(new double[]{0.90D, 1.40D, 0.0D});
				add(new double[]{1.65D, 1.40D, 0.0D});
			}
		};
	}
}