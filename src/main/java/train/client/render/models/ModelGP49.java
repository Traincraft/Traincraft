//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2021 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 23.03.2021 - 20:54:49
// Last changed on: 23.03.2021 - 20:54:49

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

public class ModelGP49 extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 256;

	public ModelGP49() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[295];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 1
		bodyModel[1] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 114
		bodyModel[2] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 163
		bodyModel[3] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 166
		bodyModel[4] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 168
		bodyModel[5] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 169
		bodyModel[6] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 263
		bodyModel[7] = new ModelRendererTurbo(this, 294, 152, textureX, textureY); // Box 266
		bodyModel[8] = new ModelRendererTurbo(this, 65, 9, textureX, textureY); // Box 3
		bodyModel[9] = new ModelRendererTurbo(this, 105, 9, textureX, textureY); // Box 246
		bodyModel[10] = new ModelRendererTurbo(this, 113, 9, textureX, textureY); // Box 247
		bodyModel[11] = new ModelRendererTurbo(this, 105, 9, textureX, textureY); // Box 263
		bodyModel[12] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 266
		bodyModel[13] = new ModelRendererTurbo(this, 129, 9, textureX, textureY); // Box 4
		bodyModel[14] = new ModelRendererTurbo(this, 329, 9, textureX, textureY); // Box 4
		bodyModel[15] = new ModelRendererTurbo(this, 129, 25, textureX, textureY); // Box 19
		bodyModel[16] = new ModelRendererTurbo(this, 369, 9, textureX, textureY); // Box 31
		bodyModel[17] = new ModelRendererTurbo(this, 41, 17, textureX, textureY); // Box 40
		bodyModel[18] = new ModelRendererTurbo(this, 489, 17, textureX, textureY); // Box 41
		bodyModel[19] = new ModelRendererTurbo(this, 385, 9, textureX, textureY, "lamp"); // Box 115 liveryimg 2
		bodyModel[20] = new ModelRendererTurbo(this, 497, 9, textureX, textureY, "lamp"); // Box 116 liveryimg 2
		bodyModel[21] = new ModelRendererTurbo(this, 265, 25, textureX, textureY); // Box 43
		bodyModel[22] = new ModelRendererTurbo(this, 313, 9, textureX, textureY); // box64
		bodyModel[23] = new ModelRendererTurbo(this, 385, 9, textureX, textureY); // box65
		bodyModel[24] = new ModelRendererTurbo(this, 417, 9, textureX, textureY); // Box 44
		bodyModel[25] = new ModelRendererTurbo(this, 257, 25, textureX, textureY); // Box 45
		bodyModel[26] = new ModelRendererTurbo(this, 297, 25, textureX, textureY); // Box 56
		bodyModel[27] = new ModelRendererTurbo(this, 353, 10, textureX, textureY); // Box 61
		bodyModel[28] = new ModelRendererTurbo(this, 401, 10, textureX, textureY); // Box 63
		bodyModel[29] = new ModelRendererTurbo(this, 481, 9, textureX, textureY); // Box 4
		bodyModel[30] = new ModelRendererTurbo(this, 89, 17, textureX, textureY); // Box 5
		bodyModel[31] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 61
		bodyModel[32] = new ModelRendererTurbo(this, 9, 17, textureX, textureY); // Box 63
		bodyModel[33] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 80
		bodyModel[34] = new ModelRendererTurbo(this, 321, 25, textureX, textureY); // Box 81
		bodyModel[35] = new ModelRendererTurbo(this, 329, 25, textureX, textureY); // Box 86
		bodyModel[36] = new ModelRendererTurbo(this, 377, 25, textureX, textureY); // Box 87
		bodyModel[37] = new ModelRendererTurbo(this, 329, 33, textureX, textureY); // Box 255
		bodyModel[38] = new ModelRendererTurbo(this, 377, 33, textureX, textureY); // Box 256
		bodyModel[39] = new ModelRendererTurbo(this, 313, 41, textureX, textureY); // Box 38R
		bodyModel[40] = new ModelRendererTurbo(this, 409, 41, textureX, textureY); // Box 176
		bodyModel[41] = new ModelRendererTurbo(this, 129, 9, textureX, textureY); // Box 178
		bodyModel[42] = new ModelRendererTurbo(this, 97, 9, textureX, textureY); // Box 78
		bodyModel[43] = new ModelRendererTurbo(this, 497, 9, textureX, textureY); // Box 188
		bodyModel[44] = new ModelRendererTurbo(this, 505, 9, textureX, textureY, "lamp"); // Box 189 ditchlight front a
		bodyModel[45] = new ModelRendererTurbo(this, 41, 17, textureX, textureY, "lamp"); // Box 190 ditchlight front a
		bodyModel[46] = new ModelRendererTurbo(this, 137, 25, textureX, textureY); // Box 243
		bodyModel[47] = new ModelRendererTurbo(this, 473, 25, textureX, textureY); // Box 244
		bodyModel[48] = new ModelRendererTurbo(this, 481, 25, textureX, textureY); // Box 249
		bodyModel[49] = new ModelRendererTurbo(this, 105, 33, textureX, textureY); // Box 250
		bodyModel[50] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Box 239
		bodyModel[51] = new ModelRendererTurbo(this, 105, 17, textureX, textureY, "lamp"); // Box 240 ditchlight rear a
		bodyModel[52] = new ModelRendererTurbo(this, 321, 17, textureX, textureY, "lamp"); // Box 241 ditchlight rear a
		bodyModel[53] = new ModelRendererTurbo(this, 369, 17, textureX, textureY); // Box 242
		bodyModel[54] = new ModelRendererTurbo(this, 377, 17, textureX, textureY, "lamp"); // Box 247 lamp rear
		bodyModel[55] = new ModelRendererTurbo(this, 385, 17, textureX, textureY, "lamp"); // Box 248 lamp rear
		bodyModel[56] = new ModelRendererTurbo(this, 113, 33, textureX, textureY); // Box 234
		bodyModel[57] = new ModelRendererTurbo(this, 449, 9, textureX, textureY); // Box 236
		bodyModel[58] = new ModelRendererTurbo(this, 73, 17, textureX, textureY); // Box 237
		bodyModel[59] = new ModelRendererTurbo(this, 1, 24, textureX, textureY); // Box 80
		bodyModel[60] = new ModelRendererTurbo(this, 481, 34, textureX, textureY); // Box 144
		bodyModel[61] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 145
		bodyModel[62] = new ModelRendererTurbo(this, 25, 24, textureX, textureY); // Box 147
		bodyModel[63] = new ModelRendererTurbo(this, 17, 42, textureX, textureY); // Box 148
		bodyModel[64] = new ModelRendererTurbo(this, 393, 17, textureX, textureY); // Box 61
		bodyModel[65] = new ModelRendererTurbo(this, 429, 29, textureX, textureY); // Box 81
		bodyModel[66] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 174
		bodyModel[67] = new ModelRendererTurbo(this, 33, 42, textureX, textureY); // Box 176
		bodyModel[68] = new ModelRendererTurbo(this, 433, 33, textureX, textureY); // Box 227
		bodyModel[69] = new ModelRendererTurbo(this, 369, 25, textureX, textureY); // Box 2
		bodyModel[70] = new ModelRendererTurbo(this, 313, 33, textureX, textureY); // Box 2
		bodyModel[71] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 114
		bodyModel[72] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 74
		bodyModel[73] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 78
		bodyModel[74] = new ModelRendererTurbo(this, 361, 57, textureX, textureY); // Box 9
		bodyModel[75] = new ModelRendererTurbo(this, 385, 57, textureX, textureY); // Box 10
		bodyModel[76] = new ModelRendererTurbo(this, 393, 57, textureX, textureY); // Box 15
		bodyModel[77] = new ModelRendererTurbo(this, 433, 57, textureX, textureY); // Box 21
		bodyModel[78] = new ModelRendererTurbo(this, 441, 33, textureX, textureY); // Box 48
		bodyModel[79] = new ModelRendererTurbo(this, 281, 57, textureX, textureY); // Box 43
		bodyModel[80] = new ModelRendererTurbo(this, 417, 57, textureX, textureY); // Box 44
		bodyModel[81] = new ModelRendererTurbo(this, 369, 33, textureX, textureY, "lamp"); // Box 117 liveryimg 2
		bodyModel[82] = new ModelRendererTurbo(this, 457, 33, textureX, textureY, "lamp"); // Box 118 liveryimg 2
		bodyModel[83] = new ModelRendererTurbo(this, 505, 17, textureX, textureY, "lamp"); // Box 186 lamp front
		bodyModel[84] = new ModelRendererTurbo(this, 113, 33, textureX, textureY, "lamp"); // Box 187 lamp front
		bodyModel[85] = new ModelRendererTurbo(this, 73, 65, textureX, textureY); // Box 201
		bodyModel[86] = new ModelRendererTurbo(this, 33, 65, textureX, textureY); // Box 314 door swing right
		bodyModel[87] = new ModelRendererTurbo(this, 121, 65, textureX, textureY); // Box 315 door swing right
		bodyModel[88] = new ModelRendererTurbo(this, 145, 65, textureX, textureY); // Box 489
		bodyModel[89] = new ModelRendererTurbo(this, 201, 65, textureX, textureY); // Box 278
		bodyModel[90] = new ModelRendererTurbo(this, 457, 65, textureX, textureY); // Box 281
		bodyModel[91] = new ModelRendererTurbo(this, 209, 73, textureX, textureY); // Box 288
		bodyModel[92] = new ModelRendererTurbo(this, 49, 73, textureX, textureY); // Box 315
		bodyModel[93] = new ModelRendererTurbo(this, 265, 73, textureX, textureY); // Box 316
		bodyModel[94] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 273
		bodyModel[95] = new ModelRendererTurbo(this, 137, 65, textureX, textureY); // Box 285
		bodyModel[96] = new ModelRendererTurbo(this, 137, 73, textureX, textureY); // Box 286
		bodyModel[97] = new ModelRendererTurbo(this, 194, 157, textureX, textureY); // Box 264
		bodyModel[98] = new ModelRendererTurbo(this, 201, 73, textureX, textureY); // Box 276
		bodyModel[99] = new ModelRendererTurbo(this, 321, 73, textureX, textureY); // Box 277
		bodyModel[100] = new ModelRendererTurbo(this, 345, 73, textureX, textureY); // Box 297
		bodyModel[101] = new ModelRendererTurbo(this, 369, 73, textureX, textureY); // Box 299
		bodyModel[102] = new ModelRendererTurbo(this, 473, 73, textureX, textureY); // Box 272
		bodyModel[103] = new ModelRendererTurbo(this, 49, 81, textureX, textureY); // Box 273
		bodyModel[104] = new ModelRendererTurbo(this, 93, 139, textureX, textureY); // Box 274
		bodyModel[105] = new ModelRendererTurbo(this, 345, 81, textureX, textureY); // Box 278
		bodyModel[106] = new ModelRendererTurbo(this, 137, 81, textureX, textureY); // Box 101
		bodyModel[107] = new ModelRendererTurbo(this, 121, 33, textureX, textureY); // Box 104
		bodyModel[108] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 105
		bodyModel[109] = new ModelRendererTurbo(this, 265, 81, textureX, textureY); // Box 284
		bodyModel[110] = new ModelRendererTurbo(this, 241, 65, textureX, textureY); // Box 285
		bodyModel[111] = new ModelRendererTurbo(this, 433, 65, textureX, textureY); // Box 286
		bodyModel[112] = new ModelRendererTurbo(this, 472, 80, textureX, textureY); // Box 268 anticlimber
		bodyModel[113] = new ModelRendererTurbo(this, 0, 88, textureX, textureY); // Box 269anticlimber
		bodyModel[114] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 293
		bodyModel[115] = new ModelRendererTurbo(this, 361, 81, textureX, textureY); // Box 43
		bodyModel[116] = new ModelRendererTurbo(this, 473, 33, textureX, textureY); // Box 43
		bodyModel[117] = new ModelRendererTurbo(this, 425, 9, textureX, textureY); // Box 43
		bodyModel[118] = new ModelRendererTurbo(this, 97, 41, textureX, textureY); // Box 43
		bodyModel[119] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 379
		bodyModel[120] = new ModelRendererTurbo(this, 505, 49, textureX, textureY); // Box 380
		bodyModel[121] = new ModelRendererTurbo(this, 329, 57, textureX, textureY); // Box 381
		bodyModel[122] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 430
		bodyModel[123] = new ModelRendererTurbo(this, 137, 89, textureX, textureY); // Box 11
		bodyModel[124] = new ModelRendererTurbo(this, 393, 89, textureX, textureY); // Box 210
		bodyModel[125] = new ModelRendererTurbo(this, 393, 89, textureX, textureY); // Box 211
		bodyModel[126] = new ModelRendererTurbo(this, 425, 89, textureX, textureY); // Box 219
		bodyModel[127] = new ModelRendererTurbo(this, 9, 97, textureX, textureY); // Box 220
		bodyModel[128] = new ModelRendererTurbo(this, 449, 89, textureX, textureY); // Box 221
		bodyModel[129] = new ModelRendererTurbo(this, 49, 97, textureX, textureY); // Box 222
		bodyModel[130] = new ModelRendererTurbo(this, 417, 89, textureX, textureY); // Box 223
		bodyModel[131] = new ModelRendererTurbo(this, 489, 89, textureX, textureY); // Box 224
		bodyModel[132] = new ModelRendererTurbo(this, 89, 57, textureX, textureY); // Box 19
		bodyModel[133] = new ModelRendererTurbo(this, 83, 59, textureX, textureY); // Box 334
		bodyModel[134] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 258
		bodyModel[135] = new ModelRendererTurbo(this, 97, 97, textureX, textureY); // Box 36
		bodyModel[136] = new ModelRendererTurbo(this, 97, 25, textureX, textureY); // Box 313
		bodyModel[137] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 314
		bodyModel[138] = new ModelRendererTurbo(this, 417, 25, textureX, textureY); // Box 315
		bodyModel[139] = new ModelRendererTurbo(this, 233, 97, textureX, textureY); // Box 316
		bodyModel[140] = new ModelRendererTurbo(this, 305, 97, textureX, textureY); // Box 270
		bodyModel[141] = new ModelRendererTurbo(this, 457, 97, textureX, textureY); // Box 42
		bodyModel[142] = new ModelRendererTurbo(this, 481, 97, textureX, textureY); // Box 45
		bodyModel[143] = new ModelRendererTurbo(this, 57, 105, textureX, textureY); // Box 42
		bodyModel[144] = new ModelRendererTurbo(this, 97, 105, textureX, textureY); // Box 48
		bodyModel[145] = new ModelRendererTurbo(this, 113, 105, textureX, textureY); // Box 298
		bodyModel[146] = new ModelRendererTurbo(this, 369, 33, textureX, textureY); // Box 300
		bodyModel[147] = new ModelRendererTurbo(this, 417, 9, textureX, textureY); // Box 303
		bodyModel[148] = new ModelRendererTurbo(this, 329, 97, textureX, textureY); // Box 304
		bodyModel[149] = new ModelRendererTurbo(this, 137, 105, textureX, textureY); // Box 305
		bodyModel[150] = new ModelRendererTurbo(this, 105, 33, textureX, textureY); // Box 306
		bodyModel[151] = new ModelRendererTurbo(this, 97, 57, textureX, textureY); // Box 307
		bodyModel[152] = new ModelRendererTurbo(this, 161, 105, textureX, textureY); // Box 318
		bodyModel[153] = new ModelRendererTurbo(this, 201, 105, textureX, textureY); // Box 319
		bodyModel[154] = new ModelRendererTurbo(this, 49, 105, textureX, textureY); // Box 338
		bodyModel[155] = new ModelRendererTurbo(this, 129, 105, textureX, textureY); // Box 339
		bodyModel[156] = new ModelRendererTurbo(this, 153, 105, textureX, textureY); // Box 340
		bodyModel[157] = new ModelRendererTurbo(this, 369, 81, textureX, textureY); // Box 341
		bodyModel[158] = new ModelRendererTurbo(this, 9, 113, textureX, textureY); // Box 361
		bodyModel[159] = new ModelRendererTurbo(this, 41, 113, textureX, textureY); // Box 365
		bodyModel[160] = new ModelRendererTurbo(this, 65, 113, textureX, textureY); // Box 366
		bodyModel[161] = new ModelRendererTurbo(this, 97, 113, textureX, textureY); // Box 367
		bodyModel[162] = new ModelRendererTurbo(this, 177, 113, textureX, textureY); // Box 368
		bodyModel[163] = new ModelRendererTurbo(this, 217, 113, textureX, textureY); // Box 369
		bodyModel[164] = new ModelRendererTurbo(this, 113, 105, textureX, textureY, "lamp"); // Box 176 glow marker
		bodyModel[165] = new ModelRendererTurbo(this, 25, 113, textureX, textureY, "lamp"); // Box 176 glow marker
		bodyModel[166] = new ModelRendererTurbo(this, 345, 169, textureX, textureY, "cull"); // Box 196 winterization hatch
		bodyModel[167] = new ModelRendererTurbo(this, 369, 9, textureX, textureY); // Box 512
		bodyModel[168] = new ModelRendererTurbo(this, 481, 9, textureX, textureY); // Box 513
		bodyModel[169] = new ModelRendererTurbo(this, 41, 121, textureX, textureY); // Box 143 sandcap
		bodyModel[170] = new ModelRendererTurbo(this, 57, 121, textureX, textureY); // Box 351 sandcap
		bodyModel[171] = new ModelRendererTurbo(this, 225, 105, textureX, textureY); // Box 352
		bodyModel[172] = new ModelRendererTurbo(this, 369, 113, textureX, textureY, "lamp"); // Box 353 lamp front arr
		bodyModel[173] = new ModelRendererTurbo(this, 73, 121, textureX, textureY, "lamp"); // Box 354 lamp front arr
		bodyModel[174] = new ModelRendererTurbo(this, 97, 121, textureX, textureY, "cull"); // Box 355 support cull
		bodyModel[175] = new ModelRendererTurbo(this, 113, 121, textureX, textureY); // Box 364 prime base
		bodyModel[176] = new ModelRendererTurbo(this, 129, 121, textureX, textureY, "lamp"); // Box 6 PRIME1-1
		bodyModel[177] = new ModelRendererTurbo(this, 145, 121, textureX, textureY, "lamp"); // Box 7 PRIME1-3
		bodyModel[178] = new ModelRendererTurbo(this, 161, 121, textureX, textureY, "lamp"); // Box 8 PRIME1-2
		bodyModel[179] = new ModelRendererTurbo(this, 177, 121, textureX, textureY, "lamp"); // Box 9 PRIME1-4
		bodyModel[180] = new ModelRendererTurbo(this, 209, 121, textureX, textureY); // Box 367
		bodyModel[181] = new ModelRendererTurbo(this, 241, 121, textureX, textureY); // Box 368
		bodyModel[182] = new ModelRendererTurbo(this, 241, 121, textureX, textureY); // Box 369
		bodyModel[183] = new ModelRendererTurbo(this, 313, 121, textureX, textureY); // Box 370
		bodyModel[184] = new ModelRendererTurbo(this, 329, 121, textureX, textureY); // Box 371
		bodyModel[185] = new ModelRendererTurbo(this, 401, 121, textureX, textureY); // Box 372
		bodyModel[186] = new ModelRendererTurbo(this, 417, 121, textureX, textureY); // Box 373 arr antenna
		bodyModel[187] = new ModelRendererTurbo(this, 289, 113, textureX, textureY); // Box 374 arr antenna
		bodyModel[188] = new ModelRendererTurbo(this, 25, 121, textureX, textureY); // Box 375 arr antenna
		bodyModel[189] = new ModelRendererTurbo(this, 225, 121, textureX, textureY, "lamp"); // Box 376 glow marker
		bodyModel[190] = new ModelRendererTurbo(this, 433, 121, textureX, textureY, "lamp"); // Box 377 glow marker
		bodyModel[191] = new ModelRendererTurbo(this, 497, 121, textureX, textureY); // Box 399
		bodyModel[192] = new ModelRendererTurbo(this, 465, 121, textureX, textureY); // Box 400
		bodyModel[193] = new ModelRendererTurbo(this, 505, 121, textureX, textureY); // Box 401
		bodyModel[194] = new ModelRendererTurbo(this, 489, 121, textureX, textureY); // Box 402
		bodyModel[195] = new ModelRendererTurbo(this, 41, 129, textureX, textureY); // Box 284
		bodyModel[196] = new ModelRendererTurbo(this, 73, 81, textureX, textureY); // Box 350
		bodyModel[197] = new ModelRendererTurbo(this, 473, 121, textureX, textureY); // Box 351
		bodyModel[198] = new ModelRendererTurbo(this, 41, 137, textureX, textureY); // Box 408
		bodyModel[199] = new ModelRendererTurbo(this, 425, 137, textureX, textureY); // Box 409
		bodyModel[200] = new ModelRendererTurbo(this, 265, 145, textureX, textureY); // Box 515
		bodyModel[201] = new ModelRendererTurbo(this, 209, 129, textureX, textureY); // Box 518
		bodyModel[202] = new ModelRendererTurbo(this, 217, 129, textureX, textureY); // Box 519
		bodyModel[203] = new ModelRendererTurbo(this, 418, 141, textureX, textureY, "cull"); // Box 3 cull
		bodyModel[204] = new ModelRendererTurbo(this, 420, 152, textureX, textureY); // Box 5
		bodyModel[205] = new ModelRendererTurbo(this, 436, 129, textureX, textureY); // Box 401
		bodyModel[206] = new ModelRendererTurbo(this, 442, 126, textureX, textureY); // Box 402
		bodyModel[207] = new ModelRendererTurbo(this, 89, 73, textureX, textureY); // Box 296 nose cover
		bodyModel[208] = new ModelRendererTurbo(this, 161, 73, textureX, textureY); // Box 299 nose cover
		bodyModel[209] = new ModelRendererTurbo(this, 111, 170, textureX, textureY); // Box 412
		bodyModel[210] = new ModelRendererTurbo(this, 90, 172, textureX, textureY); // Box 413
		bodyModel[211] = new ModelRendererTurbo(this, 88, 165, textureX, textureY); // Box 86
		bodyModel[212] = new ModelRendererTurbo(this, 153, 147, textureX, textureY); // Box 516
		bodyModel[213] = new ModelRendererTurbo(this, 150, 160, textureX, textureY); // Box 518
		bodyModel[214] = new ModelRendererTurbo(this, 152, 163, textureX, textureY); // Box 519
		bodyModel[215] = new ModelRendererTurbo(this, 150, 165, textureX, textureY); // Box 520
		bodyModel[216] = new ModelRendererTurbo(this, 150, 168, textureX, textureY); // Box 521
		bodyModel[217] = new ModelRendererTurbo(this, 148, 171, textureX, textureY); // Box 522
		bodyModel[218] = new ModelRendererTurbo(this, 162, 146, textureX, textureY); // Box 523
		bodyModel[219] = new ModelRendererTurbo(this, 153, 158, textureX, textureY); // Box 526
		bodyModel[220] = new ModelRendererTurbo(this, 153, 156, textureX, textureY); // Box 527
		bodyModel[221] = new ModelRendererTurbo(this, 181, 168, textureX, textureY); // Box 637
		bodyModel[222] = new ModelRendererTurbo(this, 179, 171, textureX, textureY); // Box 638
		bodyModel[223] = new ModelRendererTurbo(this, 171, 146, textureX, textureY); // Box 639
		bodyModel[224] = new ModelRendererTurbo(this, 180, 147, textureX, textureY); // Box 640
		bodyModel[225] = new ModelRendererTurbo(this, 179, 165, textureX, textureY); // Box 641
		bodyModel[226] = new ModelRendererTurbo(this, 181, 163, textureX, textureY); // Box 642
		bodyModel[227] = new ModelRendererTurbo(this, 179, 160, textureX, textureY); // Box 643
		bodyModel[228] = new ModelRendererTurbo(this, 180, 156, textureX, textureY); // Box 644
		bodyModel[229] = new ModelRendererTurbo(this, 180, 158, textureX, textureY); // Box 645
		bodyModel[230] = new ModelRendererTurbo(this, 0, 88, textureX, textureY); // Box 436
		bodyModel[231] = new ModelRendererTurbo(this, 472, 80, textureX, textureY); // Box 437
		bodyModel[232] = new ModelRendererTurbo(this, 209, 140, textureX, textureY); // Box 438
		bodyModel[233] = new ModelRendererTurbo(this, 212, 140, textureX, textureY); // Box 439
		bodyModel[234] = new ModelRendererTurbo(this, 232, 156, textureX, textureY); // Box 440
		bodyModel[235] = new ModelRendererTurbo(this, 229, 152, textureX, textureY); // Box 441
		bodyModel[236] = new ModelRendererTurbo(this, 223, 158, textureX, textureY); // Box 442
		bodyModel[237] = new ModelRendererTurbo(this, 253, 158, textureX, textureY); // Box 443
		bodyModel[238] = new ModelRendererTurbo(this, 234, 161, textureX, textureY); // Box 444
		bodyModel[239] = new ModelRendererTurbo(this, 223, 153, textureX, textureY); // Box 445
		bodyModel[240] = new ModelRendererTurbo(this, 255, 153, textureX, textureY); // Box 446
		bodyModel[241] = new ModelRendererTurbo(this, 234, 153, textureX, textureY); // Box 447
		bodyModel[242] = new ModelRendererTurbo(this, 253, 152, textureX, textureY); // Box 448
		bodyModel[243] = new ModelRendererTurbo(this, 234, 161, textureX, textureY); // Box 449
		bodyModel[244] = new ModelRendererTurbo(this, 223, 158, textureX, textureY); // Box 450
		bodyModel[245] = new ModelRendererTurbo(this, 253, 158, textureX, textureY); // Box 451
		bodyModel[246] = new ModelRendererTurbo(this, 255, 153, textureX, textureY); // Box 452
		bodyModel[247] = new ModelRendererTurbo(this, 223, 153, textureX, textureY); // Box 453
		bodyModel[248] = new ModelRendererTurbo(this, 253, 152, textureX, textureY); // Box 454
		bodyModel[249] = new ModelRendererTurbo(this, 234, 153, textureX, textureY); // Box 455
		bodyModel[250] = new ModelRendererTurbo(this, 229, 152, textureX, textureY); // Box 456
		bodyModel[251] = new ModelRendererTurbo(this, 232, 156, textureX, textureY); // Box 457
		bodyModel[252] = new ModelRendererTurbo(this, 113, 129, textureX, textureY); // Box 130
		bodyModel[253] = new ModelRendererTurbo(this, 116, 126, textureX, textureY); // Box 131
		bodyModel[254] = new ModelRendererTurbo(this, 113, 142, textureX, textureY); // Box 132
		bodyModel[255] = new ModelRendererTurbo(this, 115, 149, textureX, textureY); // Box 314
		bodyModel[256] = new ModelRendererTurbo(this, 224, 165, textureX, textureY); // Box 315
		bodyModel[257] = new ModelRendererTurbo(this, 224, 165, textureX, textureY); // Box 316
		bodyModel[258] = new ModelRendererTurbo(this, 52, 125, textureX, textureY); // Box 317
		bodyModel[259] = new ModelRendererTurbo(this, 50, 129, textureX, textureY); // Box 318
		bodyModel[260] = new ModelRendererTurbo(this, 266, 152, textureX, textureY); // Box 319
		bodyModel[261] = new ModelRendererTurbo(this, 264, 152, textureX, textureY); // Box 320
		bodyModel[262] = new ModelRendererTurbo(this, 266, 152, textureX, textureY); // Box 321
		bodyModel[263] = new ModelRendererTurbo(this, 262, 152, textureX, textureY); // Box 322
		bodyModel[264] = new ModelRendererTurbo(this, 285, 152, textureX, textureY, "cull"); // Box 323 stair cull
		bodyModel[265] = new ModelRendererTurbo(this, 296, 152, textureX, textureY, "cull"); // Box 324 stair cull
		bodyModel[266] = new ModelRendererTurbo(this, 121, 200, textureX, textureY); // Box 280
		bodyModel[267] = new ModelRendererTurbo(this, 107, 201, textureX, textureY); // Box 281
		bodyModel[268] = new ModelRendererTurbo(this, 93, 203, textureX, textureY); // Box 282
		bodyModel[269] = new ModelRendererTurbo(this, 166, 203, textureX, textureY); // Box 283
		bodyModel[270] = new ModelRendererTurbo(this, 152, 201, textureX, textureY); // Box 284
		bodyModel[271] = new ModelRendererTurbo(this, 142, 200, textureX, textureY); // Box 331
		bodyModel[272] = new ModelRendererTurbo(this, 79, 205, textureX, textureY); // Box 332
		bodyModel[273] = new ModelRendererTurbo(this, 181, 205, textureX, textureY); // Box 335
		bodyModel[274] = new ModelRendererTurbo(this, 121, 188, textureX, textureY); // Box 336
		bodyModel[275] = new ModelRendererTurbo(this, 109, 186, textureX, textureY); // Box 339
		bodyModel[276] = new ModelRendererTurbo(this, 142, 188, textureX, textureY); // Box 340
		bodyModel[277] = new ModelRendererTurbo(this, 153, 186, textureX, textureY); // Box 341
		bodyModel[278] = new ModelRendererTurbo(this, 158, 120, textureX, textureY); // Box 342
		bodyModel[279] = new ModelRendererTurbo(this, 318, 155, textureX, textureY); // Box 343
		bodyModel[280] = new ModelRendererTurbo(this, 146, 127, textureX, textureY); // Box 344
		bodyModel[281] = new ModelRendererTurbo(this, 146, 123, textureX, textureY); // Box 345
		bodyModel[282] = new ModelRendererTurbo(this, 160, 128, textureX, textureY); // Box 346
		bodyModel[283] = new ModelRendererTurbo(this, 160, 126, textureX, textureY); // Box 347
		bodyModel[284] = new ModelRendererTurbo(this, 214, 151, textureX, textureY); // Box 208
		bodyModel[285] = new ModelRendererTurbo(this, 214, 151, textureX, textureY); // Box 209
		bodyModel[286] = new ModelRendererTurbo(this, 146, 125, textureX, textureY); // Box 350
		bodyModel[287] = new ModelRendererTurbo(this, 146, 125, textureX, textureY); // Box 351
		bodyModel[288] = new ModelRendererTurbo(this, 209, 149, textureX, textureY); // Box 353
		bodyModel[289] = new ModelRendererTurbo(this, 209, 149, textureX, textureY); // Box 354
		bodyModel[290] = new ModelRendererTurbo(this, 1, 24, textureX, textureY); // Box 355
		bodyModel[291] = new ModelRendererTurbo(this, 25, 24, textureX, textureY); // Box 356
		bodyModel[292] = new ModelRendererTurbo(this, 377, 113, textureX, textureY); // Box 86 stand2
		bodyModel[293] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Box 87 stand2
		bodyModel[294] = new ModelRendererTurbo(this, 401, 113, textureX, textureY); // Box 86 stand2

		bodyModel[0].addBox(0F, 0F, 0F, 70, 1, 4, 0F); // Box 1
		bodyModel[0].setRotationPoint(-35F, 0F, -11F);

		bodyModel[1].addBox(0F, 0F, 0F, 70, 3, 14, 0F); // Box 114
		bodyModel[1].setRotationPoint(-35F, 0F, -7F);

		bodyModel[2].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 163
		bodyModel[2].setRotationPoint(-25F, 3F, -2F);

		bodyModel[3].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 166
		bodyModel[3].setRotationPoint(22F, 3F, -2F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 2, 1, 21, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 168
		bodyModel[4].setRotationPoint(-24F, 2F, -10.5F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 2, 1, 21, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 169
		bodyModel[5].setRotationPoint(23F, 2F, -10.5F);

		bodyModel[6].addBox(0F, 0F, 0F, 2, 3, 14, 0F); // Box 263
		bodyModel[6].setRotationPoint(-37F, 0F, -7F);

		bodyModel[7].addBox(0F, 0F, 0F, 4, 1, 14, 0F); // Box 266
		bodyModel[7].setRotationPoint(-41F, 0F, -7F);

		bodyModel[8].addBox(0F, 0F, 0F, 0, 9, 18, 0F); // Box 3
		bodyModel[8].setRotationPoint(40F, 0F, -9F);

		bodyModel[9].addBox(0F, 0F, 0F, 0, 6, 1, 0F); // Box 246
		bodyModel[9].setRotationPoint(40F, 2F, -10F);

		bodyModel[10].addBox(0F, 0F, 0F, 0, 6, 1, 0F); // Box 247
		bodyModel[10].setRotationPoint(40F, 2F, 9F);

		bodyModel[11].addBox(0F, 0F, 0F, 2, 3, 14, 0F); // Box 263
		bodyModel[11].setRotationPoint(35F, 0F, -7F);

		bodyModel[12].addBox(0F, 0F, 0F, 3, 2, 14, 0F); // Box 266
		bodyModel[12].setRotationPoint(37F, 0F, -7F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 5, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[13].setRotationPoint(-40F, 2F, -3F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 5, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); // Box 4
		bodyModel[14].setRotationPoint(35F, 2F, -3F);

		bodyModel[15].addBox(0F, 0F, 0F, 53, 21, 14, 0F); // Box 19
		bodyModel[15].setRotationPoint(-17F, -21F, -7F);

		bodyModel[16].addBox(0F, 0F, 0F, 2, 2, 4, 0F); // Box 31
		bodyModel[16].setRotationPoint(37.25F, -19F, -2F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 3, 21, 7, 0F,0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		bodyModel[17].setRotationPoint(36F, -21F, -7F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 3, 21, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[18].setRotationPoint(36F, -21F, 0F);

		bodyModel[19].addBox(0F, 0F, 0F, 0, 2, 5, 0F); // Box 115 liveryimg 2
		bodyModel[19].setRotationPoint(36.45F, -16.5F, -6F);
		bodyModel[19].rotateAngleY = -0.41887902F;

		bodyModel[20].addBox(0F, 0F, -5F, 0, 2, 5, 0F); // Box 116 liveryimg 2
		bodyModel[20].setRotationPoint(36.45F, -16.5F, 6F);
		bodyModel[20].rotateAngleY = 0.41887902F;

		bodyModel[21].addBox(0F, 0F, 0F, 6, 13, 14, 0F); // Box 43
		bodyModel[21].setRotationPoint(-34F, -13F, -7F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F,1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -1F, 1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // box64
		bodyModel[22].setRotationPoint(-25F, -18F, 11F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F,1F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // box65
		bodyModel[23].setRotationPoint(-25F, -18F, -12F);

		bodyModel[24].addBox(0F, 0F, 0F, 1, 0, 4, 0F); // Box 44
		bodyModel[24].setRotationPoint(-34F, -2F, -11F);

		bodyModel[25].addBox(0F, 0F, 0F, 6, 4, 4, 0F); // Box 45
		bodyModel[25].setRotationPoint(-34F, -4F, 7F);

		bodyModel[26].addBox(0F, 0F, 0F, 5, 4, 4, 0F); // Box 56
		bodyModel[26].setRotationPoint(-33F, -4F, -11F);

		bodyModel[27].addBox(0F, 0F, 0F, 1, 8, 0, 0F); // Box 61
		bodyModel[27].setRotationPoint(-40F, -8F, 11F);

		bodyModel[28].addBox(0F, 0F, 0F, 1, 8, 0, 0F); // Box 63
		bodyModel[28].setRotationPoint(-40F, -8F, -11F);

		bodyModel[29].addBox(0F, 0F, 0F, 4, 2, 3, 0F); // Box 4
		bodyModel[29].setRotationPoint(-44F, 3F, -1.5F);

		bodyModel[30].addBox(0F, 0F, 0F, 4, 2, 3, 0F); // Box 5
		bodyModel[30].setRotationPoint(39F, 3F, -1.5F);

		bodyModel[31].addBox(0F, 0F, 0F, 0, 7, 1, 0F); // Box 61
		bodyModel[31].setRotationPoint(40F, -2F, 10F);

		bodyModel[32].addBox(0F, 0F, 0F, 0, 7, 1, 0F); // Box 63
		bodyModel[32].setRotationPoint(40F, -2F, -11F);

		bodyModel[33].addBox(0F, 0F, 0F, 0, 8, 1, 0F); // Box 80
		bodyModel[33].setRotationPoint(40F, -8F, -8F);

		bodyModel[34].addBox(0F, 0F, 0F, 0, 8, 1, 0F); // Box 81
		bodyModel[34].setRotationPoint(40F, -8F, 7F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 18, 1, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 86
		bodyModel[35].setRotationPoint(-3F, 0.5F, 9F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 18, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 87
		bodyModel[36].setRotationPoint(-3F, 1.5F, 9F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 18, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 255
		bodyModel[37].setRotationPoint(-3F, 1.5F, -11F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 18, 1, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 256
		bodyModel[38].setRotationPoint(-3F, 0.5F, -11F);

		bodyModel[39].addBox(0F, 0F, 0F, 47, 8, 0, 0F); // Box 38R
		bodyModel[39].setRotationPoint(-11F, -8F, 11.01F);

		bodyModel[40].addBox(0F, 0F, 0F, 32, 8, 0, 0F); // Box 176
		bodyModel[40].setRotationPoint(-14F, -10F, -11.01F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 1, 4, 0, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 178
		bodyModel[41].setRotationPoint(-34F, -4F, -11F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 78
		bodyModel[42].setRotationPoint(-41.5F, -2F, 4.5F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 188
		bodyModel[43].setRotationPoint(-41.5F, -2F, -6.5F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 189 ditchlight front a
		bodyModel[44].setRotationPoint(-41.75F, -2F, 4.5F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 190 ditchlight front a
		bodyModel[45].setRotationPoint(-41.75F, -2F, -6.5F);

		bodyModel[46].addBox(0F, 0F, 0F, 0, 11, 2, 0F); // Box 243
		bodyModel[46].setRotationPoint(36F, -8F, 9F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 244
		bodyModel[47].setRotationPoint(36F, -4F, 10.5F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 249
		bodyModel[48].setRotationPoint(36F, -4F, -11.5F);

		bodyModel[49].addBox(0F, 0F, 0F, 0, 11, 2, 0F); // Box 250
		bodyModel[49].setRotationPoint(36F, -8F, -11F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 239
		bodyModel[50].setRotationPoint(39.5F, -2F, -6.5F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 240 ditchlight rear a
		bodyModel[51].setRotationPoint(39.75F, -2F, -6.5F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 241 ditchlight rear a
		bodyModel[52].setRotationPoint(39.75F, -2F, 4.5F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 242
		bodyModel[53].setRotationPoint(39.5F, -2F, 4.5F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 247 lamp rear
		bodyModel[54].setRotationPoint(38.5F, -19F, -2F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 248 lamp rear
		bodyModel[55].setRotationPoint(38.5F, -19F, 0F);

		bodyModel[56].addBox(0F, 0F, 0F, 0, 8, 6, 0F); // Box 234
		bodyModel[56].setRotationPoint(41F, -8F, -3F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 236
		bodyModel[57].setRotationPoint(40F, -8F, -7F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F,-1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 237
		bodyModel[58].setRotationPoint(40F, -8F, 3F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 0, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 80
		bodyModel[59].setRotationPoint(-42F, -8F, -8F);

		bodyModel[60].addBox(0F, 0F, 0F, 1, 8, 0, 0F); // Box 144
		bodyModel[60].setRotationPoint(-42F, -8F, -8F);

		bodyModel[61].addBox(0F, 0F, 0F, 0, 8, 6, 0F); // Box 145
		bodyModel[61].setRotationPoint(-43F, -8F, -3F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 0, 1, 5, 0F,1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 147
		bodyModel[62].setRotationPoint(-42F, -8F, 3F);

		bodyModel[63].addBox(0F, 0F, 0F, 1, 8, 0, 0F); // Box 148
		bodyModel[63].setRotationPoint(-42F, -8F, 8F);

		bodyModel[64].addBox(0F, 0F, 0F, 3, 1, 0, 0F); // Box 61
		bodyModel[64].setRotationPoint(-36F, -10F, -11F);

		bodyModel[65].addBox(0F, 0F, 0F, 1, 9, 0, 0F); // Box 81
		bodyModel[65].setRotationPoint(-36F, -9F, -11F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 2, 2, 0, 0F,0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 174
		bodyModel[66].setRotationPoint(-33F, -11F, -11F);

		bodyModel[67].addBox(0F, 0F, 0F, 1, 11, 0, 0F); // Box 176
		bodyModel[67].setRotationPoint(-36F, -11F, 11F);

		bodyModel[68].addBox(0F, 0F, 0F, 1, 7, 0, 0F); // Box 227
		bodyModel[68].setRotationPoint(-34F, -11F, 11F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[69].setRotationPoint(-41F, 2.5F, -2F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[70].setRotationPoint(40F, 2.5F, -2F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 114
		bodyModel[71].setRotationPoint(-13F, 2F, -10.5F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[72].setRotationPoint(-13F, 1F, -10.5F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 78
		bodyModel[73].setRotationPoint(-12.75F, 2.5F, -10.25F);

		bodyModel[74].addBox(0F, 0F, 0F, 10, 14, 1, 0F); // Box 9
		bodyModel[74].setRotationPoint(-28F, -18F, 10F);

		bodyModel[75].addBox(0F, 0F, 0F, 10, 14, 1, 0F); // Box 10
		bodyModel[75].setRotationPoint(-27F, -18F, -11F);

		bodyModel[76].addBox(0F, 0F, 0F, 1, 14, 17, 0F); // Box 15
		bodyModel[76].setRotationPoint(-28F, -18F, -7F);

		bodyModel[77].addBox(0F, 0F, 0F, 1, 14, 17, 0F); // Box 21
		bodyModel[77].setRotationPoint(-18F, -18F, -10F);

		bodyModel[78].addBox(0F, 0F, 0F, 2, 4, 2, 0F); // Box 48
		bodyModel[78].setRotationPoint(-30F, -21F, -1F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 2, 4, 5, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
		bodyModel[79].setRotationPoint(-30F, -21F, -6F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 2, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 44
		bodyModel[80].setRotationPoint(-30F, -21F, 1F);

		bodyModel[81].addBox(0F, 0F, 0F, 0, 2, 5, 0F); // Box 117 liveryimg 2
		bodyModel[81].setRotationPoint(-28.05F, -19.5F, -6F);
		bodyModel[81].rotateAngleY = 0.38397244F;

		bodyModel[82].addBox(0F, 0F, -5F, 0, 2, 5, 0F); // Box 118 liveryimg 2
		bodyModel[82].setRotationPoint(-28.05F, -19.5F, 6F);
		bodyModel[82].rotateAngleY = -0.38397244F;

		bodyModel[83].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 186 lamp front
		bodyModel[83].setRotationPoint(-30.5F, -21F, -1F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 187 lamp front
		bodyModel[84].setRotationPoint(-30.5F, -19F, -1F);

		bodyModel[85].addBox(0F, 0F, 0F, 11, 4, 22, 0F); // Box 201
		bodyModel[85].setRotationPoint(-28F, -4F, -11F);

		bodyModel[86].addBox(-0.5F, 0F, -3.5F, 1, 14, 4, 0F); // Box 314 door swing right
		bodyModel[86].setRotationPoint(-17.5F, -18F, 10.5F);

		bodyModel[87].addBox(-0.5F, 0F, -0.5F, 1, 14, 4, 0F); // Box 315 door swing right
		bodyModel[87].setRotationPoint(-27.5F, -18F, -10.5F);

		bodyModel[88].addBox(0F, 0F, 0F, 15, 3, 22, 0F); // Box 489
		bodyModel[88].setRotationPoint(-7F, 3F, -11F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 15, 1, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 278
		bodyModel[89].setRotationPoint(-7F, 2F, -11F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 15, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 281
		bodyModel[90].setRotationPoint(-7F, 6F, -11F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 15, 3, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 288
		bodyModel[91].setRotationPoint(-7F, 6F, -9F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 15, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 315
		bodyModel[92].setRotationPoint(-7F, 2F, 7F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 15, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 316
		bodyModel[93].setRotationPoint(-7F, 6F, 9F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 7, 1, 12, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 273
		bodyModel[94].setRotationPoint(-16F, -22F, -6F);

		bodyModel[95].addBox(0F, 0F, 0F, 8, 5, 1, 0F); // Box 285
		bodyModel[95].setRotationPoint(-16F, -20.5F, -7.5F);

		bodyModel[96].addBox(0F, 0F, 0F, 8, 5, 1, 0F); // Box 286
		bodyModel[96].setRotationPoint(-16F, -20.5F, 6.5F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 8, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 264
		bodyModel[97].setRotationPoint(-8F, -22F, -6F);

		bodyModel[98].addBox(0F, 0F, 0F, 6, 2, 6, 0F); // Box 276
		bodyModel[98].setRotationPoint(27F, -22.5F, -3F);

		bodyModel[99].addBox(0F, 0F, 0F, 6, 2, 6, 0F); // Box 277
		bodyModel[99].setRotationPoint(19F, -22.5F, -3F);

		bodyModel[100].addBox(0F, 0F, 0F, 9, 5, 1, 0F); // Box 297
		bodyModel[100].setRotationPoint(26F, -19.5F, -7.5F);

		bodyModel[101].addBox(0F, 0F, 0F, 9, 5, 1, 0F); // Box 299
		bodyModel[101].setRotationPoint(26F, -19.5F, 6.5F);

		bodyModel[102].addBox(0F, 0F, 0F, 9, 5, 1, 0F); // Box 272
		bodyModel[102].setRotationPoint(16.5F, -19.5F, -7.5F);

		bodyModel[103].addBox(0F, 0F, 0F, 9, 5, 1, 0F); // Box 273
		bodyModel[103].setRotationPoint(16.5F, -19.5F, 6.5F);

		bodyModel[104].addBox(0F, 0F, 0F, 3, 1, 7, 0F); // Box 274
		bodyModel[104].setRotationPoint(-3.5F, -22.25F, -3.5F);

		bodyModel[105].addBox(0F, 0F, 0F, 6, 2, 6, 0F); // Box 278
		bodyModel[105].setRotationPoint(4F, -22.5F, -3F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 14, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 101
		bodyModel[106].setRotationPoint(-2F, -21F, 7F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 3, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, -2F, 0F, 0F, -1F); // Box 104
		bodyModel[107].setRotationPoint(12F, -21F, 7F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 5, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.7F, -1.75F); // Box 105
		bodyModel[108].setRotationPoint(-7F, -21F, 7F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 14, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 284
		bodyModel[109].setRotationPoint(-2F, -21F, -9F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 5, 3, 2, 0F,0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, -1.75F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.7F, 0F); // Box 285
		bodyModel[110].setRotationPoint(-7F, -21F, -9F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 3, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1.5F, -2F, 0F, -1.5F, 0F, 0F, 0F, 0F); // Box 286
		bodyModel[111].setRotationPoint(12F, -21F, -9F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 268 anticlimber
		bodyModel[112].setRotationPoint(-43F, 0F, -8F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 269anticlimber
		bodyModel[113].setRotationPoint(-43F, 0F, 0F);

		bodyModel[114].addBox(0F, 0F, 0F, 3, 1, 0, 0F); // Box 293
		bodyModel[114].setRotationPoint(-31F, -12F, -11F);

		bodyModel[115].addBox(0F, 0F, 0F, 2, 13, 13, 0F); // Box 43
		bodyModel[115].setRotationPoint(-36F, -13F, -6F);

		bodyModel[116].addBox(0F, 0F, 0F, 2, 4, 1, 0F); // Box 43
		bodyModel[116].setRotationPoint(-36F, -13F, -7F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
		bodyModel[117].setRotationPoint(-35.5F, -8.5F, -7F);

		bodyModel[118].addBox(0F, 0F, 0F, 0, 7, 1, 0F); // Box 43
		bodyModel[118].setRotationPoint(-35F, -6.5F, -7F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 379
		bodyModel[119].setRotationPoint(13.5F, -22.5F, -7F);

		bodyModel[120].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 380
		bodyModel[120].setRotationPoint(12.5F, -23.5F, -6.75F);

		bodyModel[121].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 381
		bodyModel[121].setRotationPoint(11.5F, -23.5F, -5.25F);

		bodyModel[122].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 430
		bodyModel[122].setRotationPoint(-19F, -23F, 0F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[123].setRotationPoint(-28F, -21F, -11F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 210
		bodyModel[124].setRotationPoint(-18F, -21F, -11F);

		bodyModel[125].addBox(0F, 0F, 0F, 1, 3, 14, 0F); // Box 211
		bodyModel[125].setRotationPoint(-28F, -21F, -7F);

		bodyModel[126].addBox(0F, 0F, 0F, 1, 3, 14, 0F); // Box 219
		bodyModel[126].setRotationPoint(-18F, -21F, -7F);

		bodyModel[127].addBox(0F, 0F, 0F, 9, 1, 14, 0F); // Box 220
		bodyModel[127].setRotationPoint(-27F, -21F, -7F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 9, 3, 4, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 221
		bodyModel[128].setRotationPoint(-27F, -21F, -11F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 9, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 222
		bodyModel[129].setRotationPoint(-27F, -21F, 7F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 223
		bodyModel[130].setRotationPoint(-18F, -21F, 7F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 224
		bodyModel[131].setRotationPoint(-28F, -21F, 7F);

		bodyModel[132].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 19
		bodyModel[132].setRotationPoint(-6F, 2F, -11.5F);
		bodyModel[132].rotateAngleX = 0.87266463F;

		bodyModel[133].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 334
		bodyModel[133].setRotationPoint(-6F, 3.5F, 8.75F);
		bodyModel[133].rotateAngleX = 0.87266463F;

		bodyModel[134].addBox(0F, 0F, 0F, 8, 1, 0, 0F); // Box 258
		bodyModel[134].setRotationPoint(-36F, -12F, 11F);

		bodyModel[135].addBox(0F, 0F, 0F, 37, 2, 4, 0F); // Box 36
		bodyModel[135].setRotationPoint(-17F, -2F, -11F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 313
		bodyModel[136].setRotationPoint(-16F, -12F, -11F);

		bodyModel[137].addBox(0F, 0F, 0F, 1, 1, 0, 0F); // Box 314
		bodyModel[137].setRotationPoint(-17F, -12F, -11F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 315
		bodyModel[138].setRotationPoint(18F, -10F, -11F);

		bodyModel[139].addBox(0F, 0F, 0F, 16, 8, 0, 0F); // Box 316
		bodyModel[139].setRotationPoint(20F, -8F, -11F);

		bodyModel[140].addBox(0F, 0F, 0F, 2, 8, 4, 0F); // Box 270
		bodyModel[140].setRotationPoint(-17F, -10F, -10.5F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 3, 8, 7, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 42
		bodyModel[141].setRotationPoint(-39F, -8F, -7F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 3, 8, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 45
		bodyModel[142].setRotationPoint(-39F, -8F, 0F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 3, 2, 6, 0F,-0.42F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -0.42F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 42
		bodyModel[143].setRotationPoint(-39F, -10F, 1F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 2, 5, 2, 0F,0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.6F, 0F, 0F); // Box 48
		bodyModel[144].setRotationPoint(-37.98F, -13F, -1F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 3, 2, 6, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.42F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.42F, 0F, 0F); // Box 298
		bodyModel[145].setRotationPoint(-39F, -10F, -7F);

		bodyModel[146].addBox(0F, 0F, 0F, 1, 0, 4, 0F); // Box 300
		bodyModel[146].setRotationPoint(-35F, -2F, 7F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 1, 4, 0, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 303
		bodyModel[147].setRotationPoint(-13F, -4F, 11F);

		bodyModel[148].addBox(0F, 0F, 0F, 1, 0, 4, 0F); // Box 304
		bodyModel[148].setRotationPoint(-13F, -2F, 7F);

		bodyModel[149].addBox(0F, 0F, 0F, 4, 4, 4, 0F); // Box 305
		bodyModel[149].setRotationPoint(-17F, -4F, 7F);

		bodyModel[150].addBox(0F, 0F, 0F, 2, 1, 0, 0F); // Box 306
		bodyModel[150].setRotationPoint(-17F, -12F, 11F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F); // Box 307
		bodyModel[151].setRotationPoint(-15F, -12F, 11F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 3, 3, 6, 0F,-0.42F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -0.42F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 318
		bodyModel[152].setRotationPoint(-39F, -13F, 1F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 3, 3, 6, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.42F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.42F, 0F, 0F); // Box 319
		bodyModel[153].setRotationPoint(-39F, -13F, -7F);

		bodyModel[154].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 338
		bodyModel[154].setRotationPoint(-17F, -23.25F, -1.5F);

		bodyModel[155].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 339
		bodyModel[155].setRotationPoint(-17.5F, -23.5F, -0.5F);

		bodyModel[156].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 340
		bodyModel[156].setRotationPoint(-16.5F, -23.25F, 0.5F);

		bodyModel[157].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 341
		bodyModel[157].setRotationPoint(-15F, -22.5F, -0.5F);

		bodyModel[158].addBox(0F, 0F, 0F, 4, 3, 22, 0F); // Box 361
		bodyModel[158].setRotationPoint(-11F, 3F, -11F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 4, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 365
		bodyModel[159].setRotationPoint(-11F, 6F, -11F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 4, 3, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 366
		bodyModel[160].setRotationPoint(-11F, 6F, -9F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 4, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 367
		bodyModel[161].setRotationPoint(-11F, 6F, 9F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 368
		bodyModel[162].setRotationPoint(-11F, 2F, -11F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 369
		bodyModel[163].setRotationPoint(-11F, 2F, 7F);

		bodyModel[164].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 176 glow marker
		bodyModel[164].setRotationPoint(-37.1F, -11.5F, 5F);

		bodyModel[165].addBox(0F, 0F, -1F, 1, 1, 1, 0F); // Box 176 glow marker
		bodyModel[165].setRotationPoint(-37.1F, -11.5F, -5F);

		bodyModel[166].addBox(0F, 0F, 0F, 11, 3, 9, 0F); // Box 196 winterization hatch
		bodyModel[166].setRotationPoint(15F, -23F, -4.5F);

		bodyModel[167].addBox(0F, 0F, 0F, 0, 1, 1, 0F); // Box 512
		bodyModel[167].setRotationPoint(40F, 7F, 10F);

		bodyModel[168].addBox(0F, 0F, 0F, 0, 1, 1, 0F); // Box 513
		bodyModel[168].setRotationPoint(40F, 7F, -11F);

		bodyModel[169].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 143 sandcap
		bodyModel[169].setRotationPoint(-37.5F, -13.5F, -1F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 351 sandcap
		bodyModel[170].setRotationPoint(35.5F, -21.5F, -1F);

		bodyModel[171].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 352
		bodyModel[171].setRotationPoint(-30F, -23F, -2F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 353 lamp front arr
		bodyModel[172].setRotationPoint(-30.25F, -23F, -2F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 354 lamp front arr
		bodyModel[173].setRotationPoint(-30.25F, -23F, 0F);

		bodyModel[174].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 355 support cull
		bodyModel[174].setRotationPoint(-28.5F, -22.5F, -1F);

		bodyModel[175].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 364 prime base
		bodyModel[175].setRotationPoint(-28.5F, -23.5F, -1F);

		bodyModel[176].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F); // Box 6 PRIME1-1
		bodyModel[176].setRotationPoint(-28.5F, -24F, -1F);

		bodyModel[177].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F); // Box 7 PRIME1-3
		bodyModel[177].setRotationPoint(-28.5F, -24F, -1F);

		bodyModel[178].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 8 PRIME1-2
		bodyModel[178].setRotationPoint(-28.5F, -24F, -1F);

		bodyModel[179].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 9 PRIME1-4
		bodyModel[179].setRotationPoint(-28.5F, -24F, -1F);

		bodyModel[180].addBox(0F, 0F, 0F, 4, 3, 22, 0F); // Box 367
		bodyModel[180].setRotationPoint(8F, 3F, -11F);

		bodyModel[181].addShapeBox(0F, 0F, 0F, 4, 3, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 368
		bodyModel[181].setRotationPoint(8F, 6F, -9F);

		bodyModel[182].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 369
		bodyModel[182].setRotationPoint(8F, 2F, -11F);

		bodyModel[183].addShapeBox(0F, 0F, 0F, 4, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 370
		bodyModel[183].setRotationPoint(8F, 6F, -11F);

		bodyModel[184].addShapeBox(0F, 0F, 0F, 4, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 371
		bodyModel[184].setRotationPoint(8F, 6F, 9F);

		bodyModel[185].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 372
		bodyModel[185].setRotationPoint(8F, 2F, 7F);

		bodyModel[186].addBox(0F, 0F, 0F, 4, 2, 1, 0F); // Box 373 arr antenna
		bodyModel[186].setRotationPoint(-24.5F, -22.5F, -0.5F);

		bodyModel[187].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 374 arr antenna
		bodyModel[187].setRotationPoint(-25.5F, -22.5F, -0.5F);

		bodyModel[188].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 375 arr antenna
		bodyModel[188].setRotationPoint(-25.5F, -21.5F, -0.5F);

		bodyModel[189].addBox(-1F, 0F, 0F, 1, 1, 1, 0F); // Box 376 glow marker
		bodyModel[189].setRotationPoint(37.1F, -13.5F, 5F);

		bodyModel[190].addBox(-1F, 0F, -1F, 1, 1, 1, 0F); // Box 377 glow marker
		bodyModel[190].setRotationPoint(37.1F, -13.5F, -5F);

		bodyModel[191].addShapeBox(0F, 0F, 0F, 1, 5, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 399
		bodyModel[191].setRotationPoint(40F, -5F, 3F);

		bodyModel[192].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F); // Box 400
		bodyModel[192].setRotationPoint(40.5F, -4.5F, 3F);

		bodyModel[193].addShapeBox(0F, 0F, 0F, 1, 5, 2, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 401
		bodyModel[193].setRotationPoint(-42F, -5F, -5F);

		bodyModel[194].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 402
		bodyModel[194].setRotationPoint(-42.5F, -4.5F, -5F);

		bodyModel[195].addShapeBox(-1.5F, -1.5F, -0.5F, 3, 3, 1, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 284
		bodyModel[195].setRotationPoint(-26F, -19.5F, 9F);
		bodyModel[195].rotateAngleX = 0.9250245F;

		bodyModel[196].addBox(0F, 0F, 0F, 0, 4, 1, 0F); // Box 350
		bodyModel[196].setRotationPoint(-25.01F, -16F, -12F);

		bodyModel[197].addBox(0F, 0F, 0F, 0, 4, 1, 0F); // Box 351
		bodyModel[197].setRotationPoint(-25.01F, -16F, 11F);

		bodyModel[198].addBox(0F, 0F, 0F, 3, 1, 21, 0F); // Box 408
		bodyModel[198].setRotationPoint(22.5F, 1F, -10.5F);

		bodyModel[199].addBox(0F, 0F, 0F, 3, 1, 21, 0F); // Box 409
		bodyModel[199].setRotationPoint(-24.5F, 1F, -10.5F);

		bodyModel[200].addBox(0F, 0F, 0F, 70, 1, 4, 0F); // Box 515
		bodyModel[200].setRotationPoint(-35F, 0F, 7F);

		bodyModel[201].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, -2F, 2F, 0F, -2F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 518
		bodyModel[201].setRotationPoint(40F, -8F, 11F);
		bodyModel[201].rotateAngleY = -3.14159265F;

		bodyModel[202].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, -2F, 2F, 0F, -2F, 2F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 519
		bodyModel[202].setRotationPoint(40F, -8F, -10F);
		bodyModel[202].rotateAngleY = -3.14159265F;

		bodyModel[203].addShapeBox(0F, 0F, 0F, 5, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F); // Box 3 cull
		bodyModel[203].setRotationPoint(-25F, -17F, 10F);

		bodyModel[204].addShapeBox(0F, 0F, 0F, 5, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 5
		bodyModel[204].setRotationPoint(-25F, -18F, 10F);

		bodyModel[205].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F); // Box 401
		bodyModel[205].setRotationPoint(-28F, -22.5F, -4.5F);

		bodyModel[206].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 402
		bodyModel[206].setRotationPoint(-27F, -22.5F, -4F);

		bodyModel[207].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, -0.57F, 0F, 0F, -0.58F, 0F, 0F, -0.42F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.58F, 0F, 0F, -0.42F, 0F, 0F); // Box 296 nose cover
		bodyModel[207].setRotationPoint(-39F, -13F, 0F);

		bodyModel[208].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-0.42F, 0F, 0F, -0.58F, 0F, 0F, -0.57F, 0F, 0F, 0F, 0F, 0F, -0.42F, 0F, 0F, -0.58F, 0F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F); // Box 299 nose cover
		bodyModel[208].setRotationPoint(-39F, -13F, -1F);

		bodyModel[209].addBox(0F, 0F, 0F, 1, 9, 4, 0F); // Box 412
		bodyModel[209].setRotationPoint(-27F, -13F, 3F);

		bodyModel[210].addBox(0F, 0F, 0F, 7, 8, 3, 0F); // Box 413
		bodyModel[210].setRotationPoint(-27.1F, -12F, 1F);
		bodyModel[210].rotateAngleY = -0.38397244F;

		bodyModel[211].addShapeBox(-1F, 0F, 0F, 11, 4, 2, 0F,0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -2F, 0F, -5F, -2F, 0F, -5F, -2F, 0F, 0F, -2F, 0F); // Box 86
		bodyModel[211].setRotationPoint(-25.5F, -14F, 1F);
		bodyModel[211].rotateAngleY = -0.38397244F;

		bodyModel[212].addShapeBox(0F, 0F, 0F, 1, 5, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 516
		bodyModel[212].setRotationPoint(35F, 0F, -9.5F);

		bodyModel[213].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 518
		bodyModel[213].setRotationPoint(36F, 3F, -9F);

		bodyModel[214].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 519
		bodyModel[214].setRotationPoint(36F, 4F, -7.5F);

		bodyModel[215].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 520
		bodyModel[215].setRotationPoint(36F, 5F, -9.5F);

		bodyModel[216].addBox(0F, 0F, 0F, 5, 2, 0, 0F); // Box 521
		bodyModel[216].setRotationPoint(35F, 6F, -9F);

		bodyModel[217].addBox(0F, 0F, 0F, 5, 0, 2, 0F); // Box 522
		bodyModel[217].setRotationPoint(35F, 8F, -11F);

		bodyModel[218].addBox(0F, 0F, 0F, 0, 7, 4, 0F); // Box 523
		bodyModel[218].setRotationPoint(35F, 1F, -11F);

		bodyModel[219].addShapeBox(0F, 0F, 0F, 3, 0, 1, 0F,0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 526
		bodyModel[219].setRotationPoint(37F, 0F, -8F);

		bodyModel[220].addShapeBox(0F, 0F, 0F, 1, 0, 1, 0F,0.8F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0.4F, 0F, 0F, 0.8F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0.4F, 0F, 0F); // Box 527
		bodyModel[220].setRotationPoint(37F, 0F, -9F);

		bodyModel[221].addBox(0F, 0F, 0F, 5, 2, 0, 0F); // Box 637
		bodyModel[221].setRotationPoint(35F, 6F, 9F);

		bodyModel[222].addBox(0F, 0F, 0F, 5, 0, 2, 0F); // Box 638
		bodyModel[222].setRotationPoint(35F, 8F, 9F);

		bodyModel[223].addBox(0F, 0F, 0F, 0, 7, 4, 0F); // Box 639
		bodyModel[223].setRotationPoint(35F, 1F, 7F);

		bodyModel[224].addShapeBox(0F, 0F, 0F, 1, 5, 3, 0F,0F, 0F, -0.5F, 1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 640
		bodyModel[224].setRotationPoint(35F, 0F, 6.5F);

		bodyModel[225].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 641
		bodyModel[225].setRotationPoint(36F, 5F, 7.5F);

		bodyModel[226].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 642
		bodyModel[226].setRotationPoint(36F, 4F, 7.5F);

		bodyModel[227].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 643
		bodyModel[227].setRotationPoint(36F, 3F, 7F);

		bodyModel[228].addShapeBox(0F, 0F, 0F, 1, 0, 1, 0F,0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0.8F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0.8F, 0F, 0F); // Box 644
		bodyModel[228].setRotationPoint(37F, 0F, 8F);

		bodyModel[229].addShapeBox(0F, 0F, 0F, 3, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.4F, 0F, 0F); // Box 645
		bodyModel[229].setRotationPoint(37F, 0F, 7F);

		bodyModel[230].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 436
		bodyModel[230].setRotationPoint(40F, 0F, 0F);

		bodyModel[231].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 437
		bodyModel[231].setRotationPoint(40F, 0F, -8F);

		bodyModel[232].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 438
		bodyModel[232].setRotationPoint(40F, 8F, -10F);

		bodyModel[233].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 439
		bodyModel[233].setRotationPoint(40F, 8F, 9F);

		bodyModel[234].addShapeBox(0F, 0F, 0F, 8, 1, 3, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 440
		bodyModel[234].setRotationPoint(-16F, -21F, -11F);

		bodyModel[235].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 441
		bodyModel[235].setRotationPoint(-17F, -21F, -8F);

		bodyModel[236].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 442
		bodyModel[236].setRotationPoint(-17F, -19F, -11F);

		bodyModel[237].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 443
		bodyModel[237].setRotationPoint(-8F, -19F, -11F);

		bodyModel[238].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 444
		bodyModel[238].setRotationPoint(-16F, -19F, -11F);

		bodyModel[239].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 445
		bodyModel[239].setRotationPoint(-17F, -21F, -11F);

		bodyModel[240].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 446
		bodyModel[240].setRotationPoint(-8F, -21F, -11F);

		bodyModel[241].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 447
		bodyModel[241].setRotationPoint(-16F, -21F, -8F);

		bodyModel[242].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 448
		bodyModel[242].setRotationPoint(-8F, -21F, -8F);

		bodyModel[243].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 449
		bodyModel[243].setRotationPoint(-16F, -19F, 10F);

		bodyModel[244].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 450
		bodyModel[244].setRotationPoint(-17F, -19F, 7F);

		bodyModel[245].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 451
		bodyModel[245].setRotationPoint(-8F, -19F, 7F);

		bodyModel[246].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, -1F, 0F, 1F, -1F); // Box 452
		bodyModel[246].setRotationPoint(-8F, -21F, 8F);

		bodyModel[247].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, -1F, 0F, 1F, -1F); // Box 453
		bodyModel[247].setRotationPoint(-17F, -21F, 8F);

		bodyModel[248].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 454
		bodyModel[248].setRotationPoint(-8F, -21F, 7F);

		bodyModel[249].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 455
		bodyModel[249].setRotationPoint(-16F, -21F, 7F);

		bodyModel[250].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 456
		bodyModel[250].setRotationPoint(-17F, -21F, 7F);

		bodyModel[251].addShapeBox(0F, 0F, 0F, 8, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, -1F); // Box 457
		bodyModel[251].setRotationPoint(-16F, -21F, 8F);

		bodyModel[252].addShapeBox(3F, 0F, 0F, 6, 9, 3, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 130
		bodyModel[252].setRotationPoint(-18F, -14F, -10F);

		bodyModel[253].addShapeBox(3F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 131
		bodyModel[253].setRotationPoint(-18F, -15F, -8F);

		bodyModel[254].addShapeBox(3F, 0F, 0F, 6, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 132
		bodyModel[254].setRotationPoint(-18F, -5F, -10F);

		bodyModel[255].addShapeBox(3F, 0F, 0F, 6, 2, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 314
		bodyModel[255].setRotationPoint(-18F, -4F, -11F);

		bodyModel[256].addBox(0F, 0F, 0F, 17, 3, 0, 0F); // Box 315
		bodyModel[256].setRotationPoint(-17F, -23.5F, -7F);

		bodyModel[257].addBox(0F, 0F, 0F, 17, 3, 0, 0F); // Box 316
		bodyModel[257].setRotationPoint(-17F, -23.5F, 7F);

		bodyModel[258].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 317
		bodyModel[258].setRotationPoint(12.5F, -22F, -1F);

		bodyModel[259].addBox(0F, 0F, 0F, 2, 1, 3, 0F); // Box 318
		bodyModel[259].setRotationPoint(12F, -22.5F, -1.5F);

		bodyModel[260].addBox(0F, 0F, 0F, 6, 1, 3, 0F); // Box 319
		bodyModel[260].setRotationPoint(-41F, 0F, -10F);

		bodyModel[261].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 320
		bodyModel[261].setRotationPoint(-41F, 0F, -11F);

		bodyModel[262].addBox(0F, 0F, 0F, 6, 1, 3, 0F); // Box 321
		bodyModel[262].setRotationPoint(-41F, 0F, 7F);

		bodyModel[263].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 322
		bodyModel[263].setRotationPoint(-41F, 0F, 10F);

		bodyModel[264].addBox(0F, 0F, 0F, 4, 8, 1, 0F); // Box 323 stair cull
		bodyModel[264].setRotationPoint(-39F, 0F, -11F);

		bodyModel[265].addBox(0F, 0F, 0F, 4, 8, 1, 0F); // Box 324 stair cull
		bodyModel[265].setRotationPoint(-39F, 0F, 10F);

		bodyModel[266].addShapeBox(0F, 0F, 0F, 1, 2, 9, 0F,0.5F, -1F, -0.5F, -1F, -1F, -0.5F, 3F, 0F, 0F, -3.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, -3.5F, 0F, 0F); // Box 280
		bodyModel[266].setRotationPoint(-42F, 4F, 2F);

		bodyModel[267].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, 3F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 3F, 0F, 0F, -3.5F, 0F, 0F); // Box 281
		bodyModel[267].setRotationPoint(-42F, 6F, 0F);

		bodyModel[268].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,-1F, 0F, 0F, 0.5F, 0F, 0F, 4F, 0F, 0F, -4.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 3F, 0F, 0F, -3.5F, 0F, 0F); // Box 282
		bodyModel[268].setRotationPoint(-43F, 7F, 0F);

		bodyModel[269].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,-4.5F, 0F, 0F, 4F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -3.5F, 0F, 0F, 3F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 283
		bodyModel[269].setRotationPoint(-43F, 7F, -11F);

		bodyModel[270].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,-3.5F, 0F, 0F, 3F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, 3F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 284
		bodyModel[270].setRotationPoint(-42F, 6F, -11F);

		bodyModel[271].addShapeBox(0F, 0F, 0F, 1, 2, 9, 0F,-3.5F, 0F, 0F, 3F, 0F, 0F, -1F, -1F, -0.5F, 0.5F, -1F, -0.5F, -3.5F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 331
		bodyModel[271].setRotationPoint(-42F, 4F, -11F);

		bodyModel[272].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,-1F, 0F, 0F, 0.5F, 0F, 0F, 4F, 0F, 0F, -4.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 3F, 0F, -1F, -3.5F, 0F, -1F); // Box 332
		bodyModel[272].setRotationPoint(-44F, 8F, 0F);

		bodyModel[273].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,-4.5F, 0F, 0F, 4F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -3.5F, 0F, -1F, 3F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 335
		bodyModel[273].setRotationPoint(-44F, 8F, -11F);

		bodyModel[274].addShapeBox(0F, 0F, 0F, 1, 2, 9, 0F,1F, -1F, -1F, -1.5F, -1F, -1F, 2.5F, 0F, 0F, -3F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 4F, -1F, 0F, -4.5F, -1F, 0F); // Box 336
		bodyModel[274].setRotationPoint(-43F, 3F, 2F);

		bodyModel[275].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F,-1F, -1.5F, -1F, 0F, -1.5F, -1F, 3F, 0.5F, 0F, -4F, 0F, 0F, -1F, 0.5F, -1F, 0.5F, 0.5F, -1F, 4.5F, -0.5F, 0F, -5F, -0.5F, 0F); // Box 339
		bodyModel[275].setRotationPoint(-45F, 2.5F, 2F);

		bodyModel[276].addShapeBox(0F, 0F, 0F, 1, 2, 9, 0F,-3F, 0F, 0F, 2.5F, 0F, 0F, -1.5F, -1F, -1F, 1F, -1F, -1F, -4.5F, -1F, 0F, 4F, -1F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 340
		bodyModel[276].setRotationPoint(-43F, 3F, -11F);

		bodyModel[277].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F,-4F, 0F, 0F, 3F, 0.5F, 0F, 0F, -1.5F, -1F, -1F, -1.5F, -1F, -5F, -0.5F, 0F, 4.5F, -0.5F, 0F, 0.5F, 0.5F, -1F, -1F, 0.5F, -1F); // Box 341
		bodyModel[277].setRotationPoint(-45F, 2.5F, -11F);

		bodyModel[278].addBox(0F, 0F, 0F, 0, 9, 12, 0F); // Box 342
		bodyModel[278].setRotationPoint(-40.01F, 0F, -6F);

		bodyModel[279].addBox(0F, 0F, 0F, 3, 2, 14, 0F); // Box 343
		bodyModel[279].setRotationPoint(-40F, 1F, -7F);

		bodyModel[280].addBox(0F, 0F, 0F, 0, 2, 5, 0F); // Box 344
		bodyModel[280].setRotationPoint(-40.01F, 1F, -11F);

		bodyModel[281].addBox(0F, 0F, 0F, 0, 2, 5, 0F); // Box 345
		bodyModel[281].setRotationPoint(-40.01F, 1F, 6F);

		bodyModel[282].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 346
		bodyModel[282].setRotationPoint(-40.01F, 3F, -8F);

		bodyModel[283].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 347
		bodyModel[283].setRotationPoint(-40.01F, 3F, 6F);

		bodyModel[284].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F); // Box 208
		bodyModel[284].setRotationPoint(-41.5F, 1F, -7F);

		bodyModel[285].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F); // Box 209
		bodyModel[285].setRotationPoint(-41.5F, 1F, 4F);

		bodyModel[286].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 350
		bodyModel[286].setRotationPoint(-40.01F, 1F, -11F);

		bodyModel[287].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 351
		bodyModel[287].setRotationPoint(-40.01F, 1F, 11F);

		bodyModel[288].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 353
		bodyModel[288].setRotationPoint(40F, 1F, -6F);

		bodyModel[289].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 354
		bodyModel[289].setRotationPoint(40F, 1F, 4F);

		bodyModel[290].addShapeBox(0F, 0F, 0F, 0, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 355
		bodyModel[290].setRotationPoint(-40F, -8F, -11F);

		bodyModel[291].addShapeBox(0F, 0F, 0F, 0, 1, 3, 0F,1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 356
		bodyModel[291].setRotationPoint(-40F, -8F, 8F);

		bodyModel[292].addBox(0F, 0F, 0F, 7, 8, 3, 0F); // Box 86 stand2
		bodyModel[292].setRotationPoint(-27.1F, -12F, -5F);
		bodyModel[292].rotateAngleY = -0.38397244F;

		bodyModel[293].addBox(0F, 0F, 0F, 1, 9, 10, 0F); // Box 87 stand2
		bodyModel[293].setRotationPoint(-27F, -13F, -4F);

		bodyModel[294].addBox(0F, 0F, 0F, 5, 2, 2, 0F); // Box 86 stand2
		bodyModel[294].setRotationPoint(-26F, -14F, -5F);
		bodyModel[294].rotateAngleY = -0.38397244F;
	}
	ModelBapBlombergB theTrucks2 = new ModelBapBlombergB();
	ModelTypeB theTrucks3 = new ModelTypeB();

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		for (int i = 0; i < 295; i++) {
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

		if (entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor() == 643||entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor() == 1235||entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor() == 12351||entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor() == 3457||entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor() == 3458||entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor() == 3455) {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/blombergB_Black.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.5, 0.15, 0);
			theTrucks2.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(3, 0, 0);
			theTrucks2.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		/*} else if (entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor() == 3247) {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/typeb_Grey.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.5, 0.3, 0);
			theTrucks3.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(2.95, 0, 0);
			theTrucks3.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();

		} else if (entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor() == 13454||entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor() == 15345) {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/typeb_Black.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.55, 0.3, 0);
			theTrucks3.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(3.05, 0, 0);
			theTrucks3.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();*/
		} else {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/blombergB_Grey.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.5, 0.15, 0);
			theTrucks2.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(3, 0, 0);
			theTrucks2.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		}
	}
	public ArrayList<double[]> getSmokePosition() {
		return new ArrayList<double[]>() {
			{
				add(new double[]{1.6D, 1.35D, 0.0D});
			}
		};
	}
}