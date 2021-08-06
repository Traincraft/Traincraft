//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 25.12.2020 - 23:31:12
// Last changed on: 25.12.2020 - 23:31:12

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

public class ModelBapGP15 extends ModelConverter //Same as Filename
{
	int textureX = 256;
	int textureY = 256;

	public ModelBapGP15() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[388];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 1
		bodyModel[1] = new ModelRendererTurbo(this, 1, 13, textureX, textureY); // Box 114
		bodyModel[2] = new ModelRendererTurbo(this, 133, 204, textureX, textureY); // Box 163
		bodyModel[3] = new ModelRendererTurbo(this, 133, 204, textureX, textureY); // Box 166
		bodyModel[4] = new ModelRendererTurbo(this, 238, 199, textureX, textureY); // Box 168
		bodyModel[5] = new ModelRendererTurbo(this, 42, 224, textureX, textureY); // Box 3
		bodyModel[6] = new ModelRendererTurbo(this, 39, 243, textureX, textureY); // Box 246
		bodyModel[7] = new ModelRendererTurbo(this, 79, 243, textureX, textureY); // Box 247
		bodyModel[8] = new ModelRendererTurbo(this, 207, 134, textureX, textureY); // Box 271
		bodyModel[9] = new ModelRendererTurbo(this, 204, 147, textureX, textureY); // Box 272
		bodyModel[10] = new ModelRendererTurbo(this, 205, 141, textureX, textureY); // Box 273
		bodyModel[11] = new ModelRendererTurbo(this, 205, 136, textureX, textureY); // Box 274
		bodyModel[12] = new ModelRendererTurbo(this, 206, 144, textureX, textureY); // Box 275
		bodyModel[13] = new ModelRendererTurbo(this, 207, 139, textureX, textureY); // Box 276
		bodyModel[14] = new ModelRendererTurbo(this, 42, 199, textureX, textureY); // Box 3
		bodyModel[15] = new ModelRendererTurbo(this, 79, 218, textureX, textureY); // Box 246
		bodyModel[16] = new ModelRendererTurbo(this, 39, 218, textureX, textureY); // Box 247
		bodyModel[17] = new ModelRendererTurbo(this, 180, 169, textureX, textureY); // Box 4
		bodyModel[18] = new ModelRendererTurbo(this, 180, 169, textureX, textureY); // Box 4
		bodyModel[19] = new ModelRendererTurbo(this, 196, 132, textureX, textureY); // Box 261
		bodyModel[20] = new ModelRendererTurbo(this, 1, 31, textureX, textureY); // Box 19
		bodyModel[21] = new ModelRendererTurbo(this, 159, 36, textureX, textureY); // Box 31
		bodyModel[22] = new ModelRendererTurbo(this, 115, 38, textureX, textureY); // Box 40
		bodyModel[23] = new ModelRendererTurbo(this, 136, 38, textureX, textureY); // Box 41
		bodyModel[24] = new ModelRendererTurbo(this, 186, 28, textureX, textureY, "lamp"); // Box 115 liveryimg 2
		bodyModel[25] = new ModelRendererTurbo(this, 186, 28, textureX, textureY, "lamp"); // Box 116 liveryimg 2
		bodyModel[26] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 43
		bodyModel[27] = new ModelRendererTurbo(this, 147, 6, textureX, textureY); // box64
		bodyModel[28] = new ModelRendererTurbo(this, 159, 2, textureX, textureY); // box65
		bodyModel[29] = new ModelRendererTurbo(this, 14, 99, textureX, textureY); // Box 44
		bodyModel[30] = new ModelRendererTurbo(this, 1, 108, textureX, textureY); // Box 45
		bodyModel[31] = new ModelRendererTurbo(this, 1, 99, textureX, textureY); // Box 56
		bodyModel[32] = new ModelRendererTurbo(this, 36, 241, textureX, textureY); // Box 61
		bodyModel[33] = new ModelRendererTurbo(this, 82, 241, textureX, textureY); // Box 63
		bodyModel[34] = new ModelRendererTurbo(this, 1, 250, textureX, textureY); // Box 4
		bodyModel[35] = new ModelRendererTurbo(this, 28, 189, textureX, textureY); // Box 98
		bodyModel[36] = new ModelRendererTurbo(this, 1, 250, textureX, textureY); // Box 5
		bodyModel[37] = new ModelRendererTurbo(this, 36, 216, textureX, textureY); // Box 61
		bodyModel[38] = new ModelRendererTurbo(this, 82, 216, textureX, textureY); // Box 63
		bodyModel[39] = new ModelRendererTurbo(this, 76, 207, textureX, textureY); // Box 80
		bodyModel[40] = new ModelRendererTurbo(this, 42, 207, textureX, textureY); // Box 81
		bodyModel[41] = new ModelRendererTurbo(this, 148, 196, textureX, textureY); // Box 86
		bodyModel[42] = new ModelRendererTurbo(this, 148, 200, textureX, textureY); // Box 87
		bodyModel[43] = new ModelRendererTurbo(this, 148, 192, textureX, textureY); // Box 255
		bodyModel[44] = new ModelRendererTurbo(this, 148, 188, textureX, textureY); // Box 256
		bodyModel[45] = new ModelRendererTurbo(this, 45, 195, textureX, textureY); // Box 38R
		bodyModel[46] = new ModelRendererTurbo(this, 82, 204, textureX, textureY); // Box 176
		bodyModel[47] = new ModelRendererTurbo(this, 18, 104, textureX, textureY); // Box 178
		bodyModel[48] = new ModelRendererTurbo(this, 33, 188, textureX, textureY); // Box 179
		bodyModel[49] = new ModelRendererTurbo(this, 32, 142, textureX, textureY); // Box 78
		bodyModel[50] = new ModelRendererTurbo(this, 32, 142, textureX, textureY); // Box 188
		bodyModel[51] = new ModelRendererTurbo(this, 39, 142, textureX, textureY, "lamp"); // Box 189 ditchlight front RS
		bodyModel[52] = new ModelRendererTurbo(this, 39, 142, textureX, textureY, "lamp"); // Box 190 ditchlight front LS
		bodyModel[53] = new ModelRendererTurbo(this, 120, 190, textureX, textureY); // Box 243
		bodyModel[54] = new ModelRendererTurbo(this, 125, 196, textureX, textureY); // Box 244
		bodyModel[55] = new ModelRendererTurbo(this, 119, 212, textureX, textureY); // Box 249
		bodyModel[56] = new ModelRendererTurbo(this, 114, 211, textureX, textureY); // Box 250
		bodyModel[57] = new ModelRendererTurbo(this, 48, 142, textureX, textureY); // Box 239
		bodyModel[58] = new ModelRendererTurbo(this, 55, 142, textureX, textureY, "lamp"); // Box 240 ditchlight rear LS
		bodyModel[59] = new ModelRendererTurbo(this, 55, 142, textureX, textureY, "lamp"); // Box 241 ditchlight rear RS
		bodyModel[60] = new ModelRendererTurbo(this, 48, 142, textureX, textureY); // Box 242
		bodyModel[61] = new ModelRendererTurbo(this, 179, 38, textureX, textureY, "lamp"); // Box 247 lamp rear
		bodyModel[62] = new ModelRendererTurbo(this, 172, 38, textureX, textureY, "lamp"); // Box 248 lamp rear
		bodyModel[63] = new ModelRendererTurbo(this, 63, 198, textureX, textureY); // Box 234
		bodyModel[64] = new ModelRendererTurbo(this, 45, 211, textureX, textureY); // Box 236
		bodyModel[65] = new ModelRendererTurbo(this, 67, 211, textureX, textureY); // Box 237
		bodyModel[66] = new ModelRendererTurbo(this, 67, 236, textureX, textureY); // Box 80
		bodyModel[67] = new ModelRendererTurbo(this, 76, 232, textureX, textureY); // Box 144
		bodyModel[68] = new ModelRendererTurbo(this, 63, 223, textureX, textureY); // Box 145
		bodyModel[69] = new ModelRendererTurbo(this, 45, 236, textureX, textureY); // Box 147
		bodyModel[70] = new ModelRendererTurbo(this, 42, 232, textureX, textureY); // Box 148
		bodyModel[71] = new ModelRendererTurbo(this, 90, 237, textureX, textureY); // Box 61
		bodyModel[72] = new ModelRendererTurbo(this, 85, 233, textureX, textureY); // Box 81
		bodyModel[73] = new ModelRendererTurbo(this, 90, 244, textureX, textureY); // Box 81
		bodyModel[74] = new ModelRendererTurbo(this, 90, 234, textureX, textureY); // Box 174
		bodyModel[75] = new ModelRendererTurbo(this, 28, 244, textureX, textureY); // Box 176
		bodyModel[76] = new ModelRendererTurbo(this, 31, 231, textureX, textureY); // Box 177
		bodyModel[77] = new ModelRendererTurbo(this, 93, 240, textureX, textureY); // Box 191
		bodyModel[78] = new ModelRendererTurbo(this, 28, 237, textureX, textureY); // Box 227
		bodyModel[79] = new ModelRendererTurbo(this, 1, 242, textureX, textureY); // Box 2
		bodyModel[80] = new ModelRendererTurbo(this, 12, 242, textureX, textureY); // Box 2
		bodyModel[81] = new ModelRendererTurbo(this, 189, 198, textureX, textureY); // Box 114
		bodyModel[82] = new ModelRendererTurbo(this, 194, 198, textureX, textureY); // Box 74
		bodyModel[83] = new ModelRendererTurbo(this, 184, 198, textureX, textureY); // Box 78
		bodyModel[84] = new ModelRendererTurbo(this, 49, 83, textureX, textureY); // Box 9
		bodyModel[85] = new ModelRendererTurbo(this, 49, 67, textureX, textureY); // Box 10
		bodyModel[86] = new ModelRendererTurbo(this, 1, 67, textureX, textureY); // Box 15
		bodyModel[87] = new ModelRendererTurbo(this, 72, 67, textureX, textureY); // Box 21
		bodyModel[88] = new ModelRendererTurbo(this, 207, 4, textureX, textureY); // Box 48
		bodyModel[89] = new ModelRendererTurbo(this, 216, 1, textureX, textureY); // Box 43
		bodyModel[90] = new ModelRendererTurbo(this, 192, 1, textureX, textureY); // Box 44
		bodyModel[91] = new ModelRendererTurbo(this, 220, 7, textureX, textureY, "lamp"); // Box 117 liveryimg 2
		bodyModel[92] = new ModelRendererTurbo(this, 220, 7, textureX, textureY, "lamp"); // Box 118 liveryimg 2
		bodyModel[93] = new ModelRendererTurbo(this, 214, 1, textureX, textureY, "lamp"); // Box 186 lamp front
		bodyModel[94] = new ModelRendererTurbo(this, 202, 1, textureX, textureY, "lamp"); // Box 187 lamp front
		bodyModel[95] = new ModelRendererTurbo(this, 1, 99, textureX, textureY); // Box 201
		bodyModel[96] = new ModelRendererTurbo(this, 109, 80, textureX, textureY); // Box 314 door swing right
		bodyModel[97] = new ModelRendererTurbo(this, 38, 80, textureX, textureY); // Box 315 door swing right
		bodyModel[98] = new ModelRendererTurbo(this, 183, 158, textureX, textureY); // Box 489
		bodyModel[99] = new ModelRendererTurbo(this, 154, 222, textureX, textureY); // Box 278
		bodyModel[100] = new ModelRendererTurbo(this, 151, 204, textureX, textureY); // Box 281
		bodyModel[101] = new ModelRendererTurbo(this, 191, 184, textureX, textureY); // Box 288
		bodyModel[102] = new ModelRendererTurbo(this, 148, 216, textureX, textureY); // Box 315
		bodyModel[103] = new ModelRendererTurbo(this, 145, 210, textureX, textureY); // Box 316
		bodyModel[104] = new ModelRendererTurbo(this, 177, 19, textureX, textureY); // Box 273
		bodyModel[105] = new ModelRendererTurbo(this, 157, 45, textureX, textureY); // Box 285
		bodyModel[106] = new ModelRendererTurbo(this, 157, 52, textureX, textureY); // Box 286
		bodyModel[107] = new ModelRendererTurbo(this, 241, 125, textureX, textureY); // Box 274 stacc
		bodyModel[108] = new ModelRendererTurbo(this, 241, 125, textureX, textureY); // Box 275 stacc
		bodyModel[109] = new ModelRendererTurbo(this, 175, 75, textureX, textureY); // Box 278
		bodyModel[110] = new ModelRendererTurbo(this, 151, 73, textureX, textureY); // Box 101
		bodyModel[111] = new ModelRendererTurbo(this, 170, 73, textureX, textureY); // Box 104
		bodyModel[112] = new ModelRendererTurbo(this, 151, 67, textureX, textureY); // Box 284
		bodyModel[113] = new ModelRendererTurbo(this, 170, 67, textureX, textureY); // Box 286
		bodyModel[114] = new ModelRendererTurbo(this, 117, 225, textureX, textureY); // Box 302
		bodyModel[115] = new ModelRendererTurbo(this, 122, 216, textureX, textureY); // Box 303
		bodyModel[116] = new ModelRendererTurbo(this, 145, 225, textureX, textureY); // Box 304
		bodyModel[117] = new ModelRendererTurbo(this, 95, 235, textureX, textureY); // Box 293
		bodyModel[118] = new ModelRendererTurbo(this, 225, 29, textureX, textureY); // Box 43
		bodyModel[119] = new ModelRendererTurbo(this, 243, 36, textureX, textureY); // Box 43
		bodyModel[120] = new ModelRendererTurbo(this, 244, 32, textureX, textureY); // Box 43
		bodyModel[121] = new ModelRendererTurbo(this, 250, 33, textureX, textureY); // Box 43
		bodyModel[122] = new ModelRendererTurbo(this, 96, 106, textureX, textureY); // Box 11
		bodyModel[123] = new ModelRendererTurbo(this, 131, 102, textureX, textureY); // Box 210
		bodyModel[124] = new ModelRendererTurbo(this, 68, 108, textureX, textureY); // Box 211
		bodyModel[125] = new ModelRendererTurbo(this, 131, 104, textureX, textureY); // Box 219
		bodyModel[126] = new ModelRendererTurbo(this, 98, 108, textureX, textureY); // Box 220
		bodyModel[127] = new ModelRendererTurbo(this, 85, 114, textureX, textureY); // Box 221
		bodyModel[128] = new ModelRendererTurbo(this, 85, 126, textureX, textureY); // Box 222
		bodyModel[129] = new ModelRendererTurbo(this, 131, 110, textureX, textureY); // Box 223
		bodyModel[130] = new ModelRendererTurbo(this, 85, 106, textureX, textureY); // Box 224
		bodyModel[131] = new ModelRendererTurbo(this, 179, 199, textureX, textureY); // Box 19
		bodyModel[132] = new ModelRendererTurbo(this, 182, 201, textureX, textureY); // Box 334
		bodyModel[133] = new ModelRendererTurbo(this, 48, 131, textureX, textureY, "cull"); // Box 255 cull
		bodyModel[134] = new ModelRendererTurbo(this, 57, 131, textureX, textureY, "lamp"); // Box 256 ditchlight rear LS
		bodyModel[135] = new ModelRendererTurbo(this, 21, 250, textureX, textureY); // Box 258
		bodyModel[136] = new ModelRendererTurbo(this, 46, 99, textureX, textureY); // Box 36
		bodyModel[137] = new ModelRendererTurbo(this, 239, 117, textureX, textureY); // Box 271 bubble both
		bodyModel[138] = new ModelRendererTurbo(this, 239, 112, textureX, textureY); // Box 272 bubble1
		bodyModel[139] = new ModelRendererTurbo(this, 76, 206, textureX, textureY); // Box 313
		bodyModel[140] = new ModelRendererTurbo(this, 76, 204, textureX, textureY); // Box 314
		bodyModel[141] = new ModelRendererTurbo(this, 82, 213, textureX, textureY); // Box 315
		bodyModel[142] = new ModelRendererTurbo(this, 87, 213, textureX, textureY); // Box 316
		bodyModel[143] = new ModelRendererTurbo(this, 63, 106, textureX, textureY); // Box 270
		bodyModel[144] = new ModelRendererTurbo(this, 235, 76, textureX, textureY); // Box 42
		bodyModel[145] = new ModelRendererTurbo(this, 211, 76, textureX, textureY); // Box 45
		bodyModel[146] = new ModelRendererTurbo(this, 211, 67, textureX, textureY); // Box 42
		bodyModel[147] = new ModelRendererTurbo(this, 229, 75, textureX, textureY); // Box 48
		bodyModel[148] = new ModelRendererTurbo(this, 230, 110, textureX, textureY, "lamp"); // Box 294 lamp canada front
		bodyModel[149] = new ModelRendererTurbo(this, 230, 100, textureX, textureY, "lamp"); // Box 295 lamp canada front
		bodyModel[150] = new ModelRendererTurbo(this, 237, 67, textureX, textureY); // Box 298
		bodyModel[151] = new ModelRendererTurbo(this, 16, 112, textureX, textureY); // Box 300
		bodyModel[152] = new ModelRendererTurbo(this, 230, 95, textureX, textureY, "lamp"); // Box 301 lamp bnsf front
		bodyModel[153] = new ModelRendererTurbo(this, 230, 105, textureX, textureY, "lamp"); // Box 302 lamp bnsf front
		bodyModel[154] = new ModelRendererTurbo(this, 47, 115, textureX, textureY); // Box 303
		bodyModel[155] = new ModelRendererTurbo(this, 46, 115, textureX, textureY); // Box 304
		bodyModel[156] = new ModelRendererTurbo(this, 46, 106, textureX, textureY); // Box 305
		bodyModel[157] = new ModelRendererTurbo(this, 39, 206, textureX, textureY); // Box 306
		bodyModel[158] = new ModelRendererTurbo(this, 33, 208, textureX, textureY); // Box 307
		bodyModel[159] = new ModelRendererTurbo(this, 211, 57, textureX, textureY); // Box 318
		bodyModel[160] = new ModelRendererTurbo(this, 237, 57, textureX, textureY); // Box 319
		bodyModel[161] = new ModelRendererTurbo(this, 237, 92, textureX, textureY, "lamp"); // Box 314 lamp sp front
		bodyModel[162] = new ModelRendererTurbo(this, 223, 92, textureX, textureY, "lamp"); // Box 315 lamp sp front
		bodyModel[163] = new ModelRendererTurbo(this, 230, 90, textureX, textureY, "lamp"); // Box 316 lamp sp front
		bodyModel[164] = new ModelRendererTurbo(this, 213, 51, textureX, textureY); // Box 317
		bodyModel[165] = new ModelRendererTurbo(this, 227, 63, textureX, textureY); // Box 20
		bodyModel[166] = new ModelRendererTurbo(this, 189, 191, textureX, textureY); // Box 114
		bodyModel[167] = new ModelRendererTurbo(this, 194, 191, textureX, textureY); // Box 74
		bodyModel[168] = new ModelRendererTurbo(this, 184, 191, textureX, textureY); // Box 78
		bodyModel[169] = new ModelRendererTurbo(this, 199, 190, textureX, textureY); // Box 245
		bodyModel[170] = new ModelRendererTurbo(this, 32, 126, textureX, textureY, "cull"); // Box 348 cull
		bodyModel[171] = new ModelRendererTurbo(this, 39, 126, textureX, textureY, "lamp"); // Box 349 ditchlight front LS
		bodyModel[172] = new ModelRendererTurbo(this, 39, 126, textureX, textureY, "lamp"); // Box 350 ditchlight front RS
		bodyModel[173] = new ModelRendererTurbo(this, 32, 126, textureX, textureY, "cull"); // Box 351 cull
		bodyModel[174] = new ModelRendererTurbo(this, 48, 126, textureX, textureY, "cull"); // Box 352 cull
		bodyModel[175] = new ModelRendererTurbo(this, 48, 126, textureX, textureY, "cull"); // Box 353 cull
		bodyModel[176] = new ModelRendererTurbo(this, 55, 126, textureX, textureY, "lamp"); // Box 354 ditchlight rear RS
		bodyModel[177] = new ModelRendererTurbo(this, 55, 126, textureX, textureY, "lamp"); // Box 355 ditchlight rear LS
		bodyModel[178] = new ModelRendererTurbo(this, 212, 92, textureX, textureY, "lamp"); // Box 176 marker glow
		bodyModel[179] = new ModelRendererTurbo(this, 250, 92, textureX, textureY, "lamp"); // Box 176 marker glow
		bodyModel[180] = new ModelRendererTurbo(this, 92, 67, textureX, textureY); // Box 86
		bodyModel[181] = new ModelRendererTurbo(this, 120, 79, textureX, textureY); // Box 87
		bodyModel[182] = new ModelRendererTurbo(this, 93, 79, textureX, textureY); // Box 86
		bodyModel[183] = new ModelRendererTurbo(this, 76, 251, textureX, textureY); // Box 510
		bodyModel[184] = new ModelRendererTurbo(this, 42, 251, textureX, textureY); // Box 511
		bodyModel[185] = new ModelRendererTurbo(this, 76, 226, textureX, textureY); // Box 512
		bodyModel[186] = new ModelRendererTurbo(this, 42, 226, textureX, textureY); // Box 513
		bodyModel[187] = new ModelRendererTurbo(this, 215, 42, textureX, textureY); // Box 143 sandcap
		bodyModel[188] = new ModelRendererTurbo(this, 210, 36, textureX, textureY); // Box 351 sandcap
		bodyModel[189] = new ModelRendererTurbo(this, 190, 36, textureX, textureY, "lamp"); // Box 376 marker glow
		bodyModel[190] = new ModelRendererTurbo(this, 185, 36, textureX, textureY, "lamp"); // Box 377 marker glow
		bodyModel[191] = new ModelRendererTurbo(this, 62, 185, textureX, textureY, "cull"); // Box 450 cull
		bodyModel[192] = new ModelRendererTurbo(this, 45, 185, textureX, textureY, "cull"); // Box 451 cull
		bodyModel[193] = new ModelRendererTurbo(this, 79, 185, textureX, textureY, "cull"); // Box 453 cull
		bodyModel[194] = new ModelRendererTurbo(this, 96, 185, textureX, textureY, "cull"); // Box 455 cull
		bodyModel[195] = new ModelRendererTurbo(this, 15, 219, textureX, textureY, "cull"); // Box 479 cull
		bodyModel[196] = new ModelRendererTurbo(this, 15, 219, textureX, textureY, "cull"); // Box 339 cull
		bodyModel[197] = new ModelRendererTurbo(this, 73, 78, textureX, textureY); // Box 350
		bodyModel[198] = new ModelRendererTurbo(this, 76, 78, textureX, textureY); // Box 351
		bodyModel[199] = new ModelRendererTurbo(this, 239, 186, textureX, textureY); // Box 409
		bodyModel[200] = new ModelRendererTurbo(this, 1, 7, textureX, textureY); // Box 515
		bodyModel[201] = new ModelRendererTurbo(this, 79, 236, textureX, textureY); // Box 516
		bodyModel[202] = new ModelRendererTurbo(this, 39, 236, textureX, textureY); // Box 517
		bodyModel[203] = new ModelRendererTurbo(this, 39, 211, textureX, textureY); // Box 518
		bodyModel[204] = new ModelRendererTurbo(this, 79, 211, textureX, textureY); // Box 519
		bodyModel[205] = new ModelRendererTurbo(this, 126, 1, textureX, textureY, "cull"); // Box 3 cull
		bodyModel[206] = new ModelRendererTurbo(this, 142, 1, textureX, textureY); // Box 5
		bodyModel[207] = new ModelRendererTurbo(this, 225, 56, textureX, textureY); // Box 296 nose cover
		bodyModel[208] = new ModelRendererTurbo(this, 237, 56, textureX, textureY); // Box 299 nose cover
		bodyModel[209] = new ModelRendererTurbo(this, 193, 146, textureX, textureY); // Box 291
		bodyModel[210] = new ModelRendererTurbo(this, 219, 132, textureX, textureY); // Box 292
		bodyModel[211] = new ModelRendererTurbo(this, 230, 134, textureX, textureY); // Box 293
		bodyModel[212] = new ModelRendererTurbo(this, 228, 136, textureX, textureY); // Box 294
		bodyModel[213] = new ModelRendererTurbo(this, 230, 139, textureX, textureY); // Box 295
		bodyModel[214] = new ModelRendererTurbo(this, 228, 141, textureX, textureY); // Box 296
		bodyModel[215] = new ModelRendererTurbo(this, 230, 144, textureX, textureY); // Box 297
		bodyModel[216] = new ModelRendererTurbo(this, 228, 147, textureX, textureY); // Box 298
		bodyModel[217] = new ModelRendererTurbo(this, 211, 146, textureX, textureY); // Box 299
		bodyModel[218] = new ModelRendererTurbo(this, 239, 186, textureX, textureY); // Box 300
		bodyModel[219] = new ModelRendererTurbo(this, 238, 199, textureX, textureY); // Box 301
		bodyModel[220] = new ModelRendererTurbo(this, 239, 192, textureX, textureY); // Box 302
		bodyModel[221] = new ModelRendererTurbo(this, 245, 199, textureX, textureY); // Box 303
		bodyModel[222] = new ModelRendererTurbo(this, 239, 192, textureX, textureY); // Box 304
		bodyModel[223] = new ModelRendererTurbo(this, 245, 199, textureX, textureY); // Box 305
		bodyModel[224] = new ModelRendererTurbo(this, 196, 141, textureX, textureY); // Box 516
		bodyModel[225] = new ModelRendererTurbo(this, 205, 136, textureX, textureY); // Box 518
		bodyModel[226] = new ModelRendererTurbo(this, 207, 139, textureX, textureY); // Box 519
		bodyModel[227] = new ModelRendererTurbo(this, 205, 141, textureX, textureY); // Box 520
		bodyModel[228] = new ModelRendererTurbo(this, 206, 144, textureX, textureY); // Box 521
		bodyModel[229] = new ModelRendererTurbo(this, 204, 147, textureX, textureY); // Box 522
		bodyModel[230] = new ModelRendererTurbo(this, 193, 154, textureX, textureY); // Box 523
		bodyModel[231] = new ModelRendererTurbo(this, 73, 251, textureX, textureY); // Box 524
		bodyModel[232] = new ModelRendererTurbo(this, 45, 251, textureX, textureY); // Box 525
		bodyModel[233] = new ModelRendererTurbo(this, 207, 132, textureX, textureY); // Box 526
		bodyModel[234] = new ModelRendererTurbo(this, 207, 130, textureX, textureY); // Box 527
		bodyModel[235] = new ModelRendererTurbo(this, 239, 98, textureX, textureY); // Box 528 bubble 2
		bodyModel[236] = new ModelRendererTurbo(this, 239, 103, textureX, textureY); // Box 529 bubble 2
		bodyModel[237] = new ModelRendererTurbo(this, 45, 226, textureX, textureY); // Box 635
		bodyModel[238] = new ModelRendererTurbo(this, 73, 226, textureX, textureY); // Box 636
		bodyModel[239] = new ModelRendererTurbo(this, 230, 144, textureX, textureY); // Box 637
		bodyModel[240] = new ModelRendererTurbo(this, 228, 147, textureX, textureY); // Box 638
		bodyModel[241] = new ModelRendererTurbo(this, 202, 146, textureX, textureY); // Box 639
		bodyModel[242] = new ModelRendererTurbo(this, 219, 141, textureX, textureY); // Box 640
		bodyModel[243] = new ModelRendererTurbo(this, 228, 141, textureX, textureY); // Box 641
		bodyModel[244] = new ModelRendererTurbo(this, 230, 139, textureX, textureY); // Box 642
		bodyModel[245] = new ModelRendererTurbo(this, 228, 136, textureX, textureY); // Box 643
		bodyModel[246] = new ModelRendererTurbo(this, 230, 130, textureX, textureY); // Box 644
		bodyModel[247] = new ModelRendererTurbo(this, 230, 132, textureX, textureY); // Box 645
		bodyModel[248] = new ModelRendererTurbo(this, 181, 50, textureX, textureY); // Box 340
		bodyModel[249] = new ModelRendererTurbo(this, 173, 49, textureX, textureY); // Box 341
		bodyModel[250] = new ModelRendererTurbo(this, 213, 246, textureX, textureY, "cull"); // Box 304 vent cull
		bodyModel[251] = new ModelRendererTurbo(this, 170, 246, textureX, textureY, "cull"); // Box 305 vent cull
		bodyModel[252] = new ModelRendererTurbo(this, 178, 206, textureX, textureY); // Box 306
		bodyModel[253] = new ModelRendererTurbo(this, 217, 206, textureX, textureY); // Box 308
		bodyModel[254] = new ModelRendererTurbo(this, 190, 230, textureX, textureY, "cull"); // Box 299 big radiator
		bodyModel[255] = new ModelRendererTurbo(this, 190, 238, textureX, textureY, "cull"); // Box 300 big radiator
		bodyModel[256] = new ModelRendererTurbo(this, 140, 67, textureX, textureY); // Box 301
		bodyModel[257] = new ModelRendererTurbo(this, 140, 73, textureX, textureY); // Box 302
		bodyModel[258] = new ModelRendererTurbo(this, 187, 33, textureX, textureY); // Box 275 gp15T part
		bodyModel[259] = new ModelRendererTurbo(this, 194, 195, textureX, textureY); // Box 304
		bodyModel[260] = new ModelRendererTurbo(this, 189, 195, textureX, textureY); // Box 305
		bodyModel[261] = new ModelRendererTurbo(this, 184, 195, textureX, textureY); // Box 306
		bodyModel[262] = new ModelRendererTurbo(this, 199, 194, textureX, textureY); // Box 307
		bodyModel[263] = new ModelRendererTurbo(this, 173, 17, textureX, textureY); // Box 246
		bodyModel[264] = new ModelRendererTurbo(this, 174, 13, textureX, textureY, "lamp"); // Box 247 commander beacon R
		bodyModel[265] = new ModelRendererTurbo(this, 160, 13, textureX, textureY, "lamp"); // Box 248 commander beacon L
		bodyModel[266] = new ModelRendererTurbo(this, 159, 17, textureX, textureY); // Box 249
		bodyModel[267] = new ModelRendererTurbo(this, 1, 132, textureX, textureY); // Box 384
		bodyModel[268] = new ModelRendererTurbo(this, 1, 126, textureX, textureY); // Box 386
		bodyModel[269] = new ModelRendererTurbo(this, 1, 135, textureX, textureY); // Box 387
		bodyModel[270] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Box 385
		bodyModel[271] = new ModelRendererTurbo(this, 1, 149, textureX, textureY); // Box 361
		bodyModel[272] = new ModelRendererTurbo(this, 1, 140, textureX, textureY); // Box 362
		bodyModel[273] = new ModelRendererTurbo(this, 1, 146, textureX, textureY); // Box 363
		bodyModel[274] = new ModelRendererTurbo(this, 1, 143, textureX, textureY); // Box 364
		bodyModel[275] = new ModelRendererTurbo(this, 152, 20, textureX, textureY, "cull"); // Box 389 support cull
		bodyModel[276] = new ModelRendererTurbo(this, 153, 13, textureX, textureY, "lamp"); // Box 162 commander beacon L
		bodyModel[277] = new ModelRendererTurbo(this, 152, 17, textureX, textureY); // Box 165
		bodyModel[278] = new ModelRendererTurbo(this, 164, 20, textureX, textureY, "cull"); // Box 356 support cull
		bodyModel[279] = new ModelRendererTurbo(this, 167, 13, textureX, textureY, "lamp"); // Box 404 commander beacon R
		bodyModel[280] = new ModelRendererTurbo(this, 166, 17, textureX, textureY); // Box 405
		bodyModel[281] = new ModelRendererTurbo(this, 158, 25, textureX, textureY); // Box 264
		bodyModel[282] = new ModelRendererTurbo(this, 220, 150, textureX, textureY); // Box 327
		bodyModel[283] = new ModelRendererTurbo(this, 239, 150, textureX, textureY); // Box 328
		bodyModel[284] = new ModelRendererTurbo(this, 232, 150, textureX, textureY); // Box 329
		bodyModel[285] = new ModelRendererTurbo(this, 1, 162, textureX, textureY); // Box 330
		bodyModel[286] = new ModelRendererTurbo(this, 1, 159, textureX, textureY); // Box 331
		bodyModel[287] = new ModelRendererTurbo(this, 1, 156, textureX, textureY); // Box 332
		bodyModel[288] = new ModelRendererTurbo(this, 1, 165, textureX, textureY); // Box 333
		bodyModel[289] = new ModelRendererTurbo(this, 1, 193, textureX, textureY); // Box 280
		bodyModel[290] = new ModelRendererTurbo(this, 14, 201, textureX, textureY); // Box 281
		bodyModel[291] = new ModelRendererTurbo(this, 1, 215, textureX, textureY); // Box 282
		bodyModel[292] = new ModelRendererTurbo(this, 1, 228, textureX, textureY); // Box 283
		bodyModel[293] = new ModelRendererTurbo(this, 1, 203, textureX, textureY); // Box 284
		bodyModel[294] = new ModelRendererTurbo(this, 12, 191, textureX, textureY); // Box 285
		bodyModel[295] = new ModelRendererTurbo(this, 1, 182, textureX, textureY); // Box 340
		bodyModel[296] = new ModelRendererTurbo(this, 1, 172, textureX, textureY); // Box 341
		bodyModel[297] = new ModelRendererTurbo(this, 23, 188, textureX, textureY); // Box 342
		bodyModel[298] = new ModelRendererTurbo(this, 12, 180, textureX, textureY); // Box 343
		bodyModel[299] = new ModelRendererTurbo(this, 136, 234, textureX, textureY); // Box 280
		bodyModel[300] = new ModelRendererTurbo(this, 121, 230, textureX, textureY); // Box 281
		bodyModel[301] = new ModelRendererTurbo(this, 147, 228, textureX, textureY); // Box 282
		bodyModel[302] = new ModelRendererTurbo(this, 148, 241, textureX, textureY); // Box 283
		bodyModel[303] = new ModelRendererTurbo(this, 131, 244, textureX, textureY); // Box 284
		bodyModel[304] = new ModelRendererTurbo(this, 88, 246, textureX, textureY); // Box 285
		bodyModel[305] = new ModelRendererTurbo(this, 121, 243, textureX, textureY); // Box 340
		bodyModel[306] = new ModelRendererTurbo(this, 110, 236, textureX, textureY); // Box 341
		bodyModel[307] = new ModelRendererTurbo(this, 99, 243, textureX, textureY); // Box 342
		bodyModel[308] = new ModelRendererTurbo(this, 110, 246, textureX, textureY); // Box 343
		bodyModel[309] = new ModelRendererTurbo(this, 236, 158, textureX, textureY); // Box 354
		bodyModel[310] = new ModelRendererTurbo(this, 234, 172, textureX, textureY); // Box 355
		bodyModel[311] = new ModelRendererTurbo(this, 234, 164, textureX, textureY); // Box 356
		bodyModel[312] = new ModelRendererTurbo(this, 211, 32, textureX, textureY); // Box 357
		bodyModel[313] = new ModelRendererTurbo(this, 45, 223, textureX, textureY); // Box 358
		bodyModel[314] = new ModelRendererTurbo(this, 45, 234, textureX, textureY); // Box 359
		bodyModel[315] = new ModelRendererTurbo(this, 67, 234, textureX, textureY); // Box 360
		bodyModel[316] = new ModelRendererTurbo(this, 45, 198, textureX, textureY); // Box 361
		bodyModel[317] = new ModelRendererTurbo(this, 67, 209, textureX, textureY); // Box 362
		bodyModel[318] = new ModelRendererTurbo(this, 45, 209, textureX, textureY); // Box 363
		bodyModel[319] = new ModelRendererTurbo(this, 181, 13, textureX, textureY, "lamp"); // Box 364 commander beacon
		bodyModel[320] = new ModelRendererTurbo(this, 180, 17, textureX, textureY); // Box 365
		bodyModel[321] = new ModelRendererTurbo(this, 220, 214, textureX, textureY); // Box 366 smol radiator
		bodyModel[322] = new ModelRendererTurbo(this, 185, 214, textureX, textureY); // Box 367 smol radiator
		bodyModel[323] = new ModelRendererTurbo(this, 220, 222, textureX, textureY); // Box 368 smol radiator
		bodyModel[324] = new ModelRendererTurbo(this, 185, 222, textureX, textureY); // Box 369 smol radiator
		bodyModel[325] = new ModelRendererTurbo(this, 150, 10, textureX, textureY); // Box 335
		bodyModel[326] = new ModelRendererTurbo(this, 11, 140, textureX, textureY); // Box 362
		bodyModel[327] = new ModelRendererTurbo(this, 11, 146, textureX, textureY); // Box 363
		bodyModel[328] = new ModelRendererTurbo(this, 11, 143, textureX, textureY); // Box 364
		bodyModel[329] = new ModelRendererTurbo(this, 11, 149, textureX, textureY); // Box 339
		bodyModel[330] = new ModelRendererTurbo(this, 147, 10, textureX, textureY); // Box 340
		bodyModel[331] = new ModelRendererTurbo(this, 10, 129, textureX, textureY); // Box 341
		bodyModel[332] = new ModelRendererTurbo(this, 10, 126, textureX, textureY); // Box 342
		bodyModel[333] = new ModelRendererTurbo(this, 10, 132, textureX, textureY); // Box 343
		bodyModel[334] = new ModelRendererTurbo(this, 10, 135, textureX, textureY); // Box 344
		bodyModel[335] = new ModelRendererTurbo(this, 241, 137, textureX, textureY); // Box 345 mopac moment stacc
		bodyModel[336] = new ModelRendererTurbo(this, 241, 137, textureX, textureY); // Box 345 mopac moment stacc
		bodyModel[337] = new ModelRendererTurbo(this, 153, 10, textureX, textureY); // Box 347
		bodyModel[338] = new ModelRendererTurbo(this, 48, 131, textureX, textureY, "cull"); // Box 255 cull
		bodyModel[339] = new ModelRendererTurbo(this, 57, 131, textureX, textureY, "lamp"); // Box 256 ditchlight rear RS
		bodyModel[340] = new ModelRendererTurbo(this, 32, 131, textureX, textureY, "cull"); // Box 255 cull
		bodyModel[341] = new ModelRendererTurbo(this, 41, 131, textureX, textureY, "lamp"); // Box 256 ditchlight front LS
		bodyModel[342] = new ModelRendererTurbo(this, 32, 131, textureX, textureY, "cull"); // Box 255 cull
		bodyModel[343] = new ModelRendererTurbo(this, 41, 131, textureX, textureY, "lamp"); // Box 256 ditchlight front RS
		bodyModel[344] = new ModelRendererTurbo(this, 100, 31, textureX, textureY); // Box 361
		bodyModel[345] = new ModelRendererTurbo(this, 111, 38, textureX, textureY); // Box 362
		bodyModel[346] = new ModelRendererTurbo(this, 100, 38, textureX, textureY); // Box 363
		bodyModel[347] = new ModelRendererTurbo(this, 121, 31, textureX, textureY); // Box 364
		bodyModel[348] = new ModelRendererTurbo(this, 142, 31, textureX, textureY); // Box 365
		bodyModel[349] = new ModelRendererTurbo(this, 150, 33, textureX, textureY); // Box 360
		bodyModel[350] = new ModelRendererTurbo(this, 161, 6, textureX, textureY, "lamp"); // Box 334 commander beacon
		bodyModel[351] = new ModelRendererTurbo(this, 160, 10, textureX, textureY); // Box 335
		bodyModel[352] = new ModelRendererTurbo(this, 247, 132, textureX, textureY); // Box 363 stacc
		bodyModel[353] = new ModelRendererTurbo(this, 247, 132, textureX, textureY); // Box 363 stacc
		bodyModel[354] = new ModelRendererTurbo(this, 19, 130, textureX, textureY); // Box 364 prime base
		bodyModel[355] = new ModelRendererTurbo(this, 19, 126, textureX, textureY, "lamp"); // Box 6 PRIME1-1
		bodyModel[356] = new ModelRendererTurbo(this, 19, 126, textureX, textureY, "lamp"); // Box 7 PRIME1-3
		bodyModel[357] = new ModelRendererTurbo(this, 19, 126, textureX, textureY, "lamp"); // Box 8 PRIME1-2
		bodyModel[358] = new ModelRendererTurbo(this, 19, 126, textureX, textureY, "lamp"); // Box 9 PRIME1-4
		bodyModel[359] = new ModelRendererTurbo(this, 32, 136, textureX, textureY); // Box 370
		bodyModel[360] = new ModelRendererTurbo(this, 39, 137, textureX, textureY, "lamp"); // Box 190 ditchlight front LS
		bodyModel[361] = new ModelRendererTurbo(this, 32, 136, textureX, textureY); // Box 370
		bodyModel[362] = new ModelRendererTurbo(this, 39, 137, textureX, textureY, "lamp"); // Box 190 ditchlight front LS
		bodyModel[363] = new ModelRendererTurbo(this, 48, 136, textureX, textureY); // Box 370
		bodyModel[364] = new ModelRendererTurbo(this, 55, 137, textureX, textureY, "lamp"); // Box 190 ditchlight front LS
		bodyModel[365] = new ModelRendererTurbo(this, 48, 136, textureX, textureY); // Box 370
		bodyModel[366] = new ModelRendererTurbo(this, 55, 137, textureX, textureY, "lamp"); // Box 190 ditchlight front LS
		bodyModel[367] = new ModelRendererTurbo(this, 159, 20, textureX, textureY); // Box 372
		bodyModel[368] = new ModelRendererTurbo(this, 166, 6, textureX, textureY); // Box 379
		bodyModel[369] = new ModelRendererTurbo(this, 242, 8, textureX, textureY); // Box 352
		bodyModel[370] = new ModelRendererTurbo(this, 249, 7, textureX, textureY, "lamp"); // Box 353 lamp front upper
		bodyModel[371] = new ModelRendererTurbo(this, 249, 2, textureX, textureY, "lamp"); // Box 354 lamp front upper
		bodyModel[372] = new ModelRendererTurbo(this, 249, 78, textureX, textureY); // Box 354 cnw bELL
		bodyModel[373] = new ModelRendererTurbo(this, 122, 216, textureX, textureY); // Box 384
		bodyModel[374] = new ModelRendererTurbo(this, 145, 225, textureX, textureY); // Box 385
		bodyModel[375] = new ModelRendererTurbo(this, 117, 225, textureX, textureY); // Box 386
		bodyModel[376] = new ModelRendererTurbo(this, 21, 77, textureX, textureY, "cull"); // Box 376 cull
		bodyModel[377] = new ModelRendererTurbo(this, 21, 70, textureX, textureY, "cull"); // Box 377 cull
		bodyModel[378] = new ModelRendererTurbo(this, 167, 10, textureX, textureY); // Box 378
		bodyModel[379] = new ModelRendererTurbo(this, 170, 10, textureX, textureY); // Box 379
		bodyModel[380] = new ModelRendererTurbo(this, 108, 124, textureX, textureY); // Box 380
		bodyModel[381] = new ModelRendererTurbo(this, 108, 126, textureX, textureY); // Box 381
		bodyModel[382] = new ModelRendererTurbo(this, 108, 126, textureX, textureY); // Box 382
		bodyModel[383] = new ModelRendererTurbo(this, 108, 124, textureX, textureY); // Box 383
		bodyModel[384] = new ModelRendererTurbo(this, 102, 124, textureX, textureY); // Box 384
		bodyModel[385] = new ModelRendererTurbo(this, 102, 124, textureX, textureY); // Box 385
		bodyModel[386] = new ModelRendererTurbo(this, 105, 124, textureX, textureY); // Box 386
		bodyModel[387] = new ModelRendererTurbo(this, 105, 124, textureX, textureY); // Box 387

		bodyModel[0].addBox(0F, 0F, 0F, 58, 1, 4, 0F); // Box 1
		bodyModel[0].setRotationPoint(-30F, 0F, -11F);

		bodyModel[1].addBox(0F, 0F, 0F, 68, 3, 14, 0F); // Box 114
		bodyModel[1].setRotationPoint(-35F, 0F, -7F);

		bodyModel[2].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 163
		bodyModel[2].setRotationPoint(-21F, 3F, -2F);

		bodyModel[3].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 166
		bodyModel[3].setRotationPoint(15F, 3F, -2F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 168
		bodyModel[4].setRotationPoint(-20F, 2F, -11F);

		bodyModel[5].addBox(0F, 0F, 0F, 0, 9, 18, 0F); // Box 3
		bodyModel[5].setRotationPoint(-35.01F, 0F, -9F);

		bodyModel[6].addBox(0F, 0F, 0F, 0, 6, 1, 0F); // Box 246
		bodyModel[6].setRotationPoint(-35F, 2F, -10F);

		bodyModel[7].addBox(0F, 0F, 0F, 0, 6, 1, 0F); // Box 247
		bodyModel[7].setRotationPoint(-35F, 2F, 9F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 3, 0, 1, 0F,0F, 0F, 0F, 0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 271
		bodyModel[8].setRotationPoint(-35F, 0F, -8F);

		bodyModel[9].addBox(0F, 0F, 0F, 5, 0, 2, 0F); // Box 272
		bodyModel[9].setRotationPoint(-35F, 8F, -11F);

		bodyModel[10].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 273
		bodyModel[10].setRotationPoint(-35F, 5F, -10F);

		bodyModel[11].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 274
		bodyModel[11].setRotationPoint(-35F, 3F, -9F);

		bodyModel[12].addBox(0F, 0F, 0F, 5, 2, 0, 0F); // Box 275
		bodyModel[12].setRotationPoint(-35F, 6F, -9F);

		bodyModel[13].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 276
		bodyModel[13].setRotationPoint(-35F, 4F, -8F);

		bodyModel[14].addBox(0F, 0F, 0F, 0, 9, 18, 0F); // Box 3
		bodyModel[14].setRotationPoint(33.01F, 0F, -9F);

		bodyModel[15].addBox(0F, 0F, 0F, 0, 6, 1, 0F); // Box 246
		bodyModel[15].setRotationPoint(33.02F, 2F, -10F);

		bodyModel[16].addBox(0F, 0F, 0F, 0, 6, 1, 0F); // Box 247
		bodyModel[16].setRotationPoint(33.02F, 2F, 9F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 6, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[17].setRotationPoint(-35F, 2F, -3F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 6, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); // Box 4
		bodyModel[18].setRotationPoint(27F, 2F, -3F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 1, 5, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 261
		bodyModel[19].setRotationPoint(-31F, 0F, -10F);

		bodyModel[20].addBox(0F, 0F, 0F, 42, 21, 14, 0F); // Box 19
		bodyModel[20].setRotationPoint(-13F, -21F, -7F);

		bodyModel[21].addBox(0F, 0F, 0F, 2, 2, 4, 0F); // Box 31
		bodyModel[21].setRotationPoint(30.25F, -18F, -2F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 3, 21, 7, 0F,0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		bodyModel[22].setRotationPoint(29F, -21F, -7F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 3, 21, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[23].setRotationPoint(29F, -21F, 0F);

		bodyModel[24].addBox(0F, 0F, 0F, 0, 2, 5, 0F); // Box 115 liveryimg 2
		bodyModel[24].setRotationPoint(29.45F, -15.5F, -6F);
		bodyModel[24].rotateAngleY = -0.41887902F;

		bodyModel[25].addBox(0F, 0F, -5F, 0, 2, 5, 0F); // Box 116 liveryimg 2
		bodyModel[25].setRotationPoint(29.45F, -15.5F, 6F);
		bodyModel[25].rotateAngleY = 0.41887902F;

		bodyModel[26].addBox(0F, 0F, 0F, 5, 13, 14, 0F); // Box 43
		bodyModel[26].setRotationPoint(-29F, -13F, -7F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F,1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -1F, 1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // box64
		bodyModel[27].setRotationPoint(-21F, -18F, 11F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F,1F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // box65
		bodyModel[28].setRotationPoint(-21F, -18F, -12F);

		bodyModel[29].addBox(0F, 0F, 0F, 1, 0, 4, 0F); // Box 44
		bodyModel[29].setRotationPoint(-29F, -2F, -11F);

		bodyModel[30].addBox(0F, 0F, 0F, 5, 4, 4, 0F); // Box 45
		bodyModel[30].setRotationPoint(-29F, -4F, 7F);

		bodyModel[31].addBox(0F, 0F, 0F, 4, 4, 4, 0F); // Box 56
		bodyModel[31].setRotationPoint(-28F, -4F, -11F);

		bodyModel[32].addBox(0F, 0F, 0F, 0, 7, 1, 0F); // Box 61
		bodyModel[32].setRotationPoint(-35F, -2F, 10F);

		bodyModel[33].addBox(0F, 0F, 0F, 0, 7, 1, 0F); // Box 63
		bodyModel[33].setRotationPoint(-35F, -2F, -11F);

		bodyModel[34].addBox(0F, 0F, 0F, 4, 2, 3, 0F); // Box 4
		bodyModel[34].setRotationPoint(-39F, 3F, -1.5F);

		bodyModel[35].addBox(0F, 0F, 0F, 2, 0, 6, 0F); // Box 98
		bodyModel[35].setRotationPoint(-38F, 0F, -3F);

		bodyModel[36].addBox(0F, 0F, 0F, 4, 2, 3, 0F); // Box 5
		bodyModel[36].setRotationPoint(33F, 3F, -1.5F);

		bodyModel[37].addBox(0F, 0F, 0F, 0, 7, 1, 0F); // Box 61
		bodyModel[37].setRotationPoint(33.02F, -2F, 10F);

		bodyModel[38].addBox(0F, 0F, 0F, 0, 7, 1, 0F); // Box 63
		bodyModel[38].setRotationPoint(33.02F, -2F, -11F);

		bodyModel[39].addBox(0F, 0F, 0F, 0, 8, 1, 0F); // Box 80
		bodyModel[39].setRotationPoint(33.02F, -8F, -8F);

		bodyModel[40].addBox(0F, 0F, 0F, 0, 8, 1, 0F); // Box 81
		bodyModel[40].setRotationPoint(33.02F, -8F, 7F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 13, 1, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 86
		bodyModel[41].setRotationPoint(-4F, 0.5F, 9F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 13, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 87
		bodyModel[42].setRotationPoint(-4F, 1.5F, 9F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 13, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 255
		bodyModel[43].setRotationPoint(-4F, 1.5F, -11F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 13, 1, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 256
		bodyModel[44].setRotationPoint(-4F, 0.5F, -11F);

		bodyModel[45].addBox(0F, 0F, 0F, 37, 8, 0, 0F); // Box 38R
		bodyModel[45].setRotationPoint(-8F, -8F, 11.01F);

		bodyModel[46].addBox(0F, 0F, 0F, 24, 8, 0, 0F); // Box 176
		bodyModel[46].setRotationPoint(-10F, -10F, -11.01F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 1, 4, 0, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 178
		bodyModel[47].setRotationPoint(-30F, -4F, -11F);

		bodyModel[48].addBox(0F, 0F, 0F, 2, 0, 6, 0F); // Box 179
		bodyModel[48].setRotationPoint(34F, 0F, -3F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 78
		bodyModel[49].setRotationPoint(-35.5F, -2F, 5F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 188
		bodyModel[50].setRotationPoint(-35.5F, -2F, -7F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 189 ditchlight front RS
		bodyModel[51].setRotationPoint(-35.75F, -2F, 5F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 190 ditchlight front LS
		bodyModel[52].setRotationPoint(-35.75F, -2F, -7F);

		bodyModel[53].addBox(0F, 0F, 0F, 0, 11, 2, 0F); // Box 243
		bodyModel[53].setRotationPoint(29F, -8F, 9F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 244
		bodyModel[54].setRotationPoint(29F, -7F, 10.5F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 249
		bodyModel[55].setRotationPoint(29F, -7F, -11.5F);

		bodyModel[56].addBox(0F, 0F, 0F, 0, 11, 2, 0F); // Box 250
		bodyModel[56].setRotationPoint(29F, -8F, -11F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 239
		bodyModel[57].setRotationPoint(32.5F, -2F, -7F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 240 ditchlight rear LS
		bodyModel[58].setRotationPoint(32.75F, -2F, -7F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 241 ditchlight rear RS
		bodyModel[59].setRotationPoint(32.75F, -2F, 5F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 242
		bodyModel[60].setRotationPoint(32.5F, -2F, 5F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 247 lamp rear
		bodyModel[61].setRotationPoint(31.5F, -18F, -2F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 248 lamp rear
		bodyModel[62].setRotationPoint(31.5F, -18F, 0F);

		bodyModel[63].addBox(0F, 0F, 0F, 0, 8, 6, 0F); // Box 234
		bodyModel[63].setRotationPoint(34F, -8F, -3F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 236
		bodyModel[64].setRotationPoint(33F, -8F, -7F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F,-1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 237
		bodyModel[65].setRotationPoint(33F, -8F, 3F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 80
		bodyModel[66].setRotationPoint(-35F, -8F, -7F);

		bodyModel[67].addBox(0F, 0F, 0F, 0, 8, 1, 0F); // Box 144
		bodyModel[67].setRotationPoint(-35F, -8F, -8F);

		bodyModel[68].addBox(0F, 0F, 0F, 0, 8, 6, 0F); // Box 145
		bodyModel[68].setRotationPoint(-36F, -8F, -3F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F,1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 147
		bodyModel[69].setRotationPoint(-35F, -8F, 3F);

		bodyModel[70].addBox(0F, 0F, 0F, 0, 8, 1, 0F); // Box 148
		bodyModel[70].setRotationPoint(-35F, -8F, 7F);

		bodyModel[71].addBox(0F, 0F, 0F, 3, 1, 0, 0F); // Box 61
		bodyModel[71].setRotationPoint(-31F, -10F, -11F);

		bodyModel[72].addBox(0F, 0F, 0F, 0, 14, 2, 0F); // Box 81
		bodyModel[72].setRotationPoint(-31F, -10F, -11F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 0, 4, 1, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 81
		bodyModel[73].setRotationPoint(-31F, -6F, -11.5F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 2, 2, 0, 0F,0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 174
		bodyModel[74].setRotationPoint(-28F, -11F, -11F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 0, 4, 1, 0F,0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 176
		bodyModel[75].setRotationPoint(-31F, -6F, 10.5F);

		bodyModel[76].addBox(0F, 0F, 0F, 0, 16, 2, 0F); // Box 177
		bodyModel[76].setRotationPoint(-31F, -12F, 9F);

		bodyModel[77].addBox(0F, 0F, 0F, 1, 9, 0, 0F); // Box 191
		bodyModel[77].setRotationPoint(-29F, -9F, -11F);

		bodyModel[78].addBox(0F, 0F, 0F, 1, 7, 0, 0F); // Box 227
		bodyModel[78].setRotationPoint(-29F, -11F, 11F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[79].setRotationPoint(-36F, 2.5F, -2F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[80].setRotationPoint(33F, 2.5F, -2F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 114
		bodyModel[81].setRotationPoint(-10F, 2F, -10.5F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[82].setRotationPoint(-10F, 1F, -10.5F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 78
		bodyModel[83].setRotationPoint(-9.75F, 2.5F, -10.25F);

		bodyModel[84].addBox(0F, 0F, 0F, 10, 14, 1, 0F); // Box 9
		bodyModel[84].setRotationPoint(-24F, -18F, 10F);

		bodyModel[85].addBox(0F, 0F, 0F, 10, 14, 1, 0F); // Box 10
		bodyModel[85].setRotationPoint(-23F, -18F, -11F);

		bodyModel[86].addBox(0F, 0F, 0F, 1, 14, 17, 0F); // Box 15
		bodyModel[86].setRotationPoint(-24F, -18F, -7F);

		bodyModel[87].addBox(0F, 0F, 0F, 1, 14, 17, 0F); // Box 21
		bodyModel[87].setRotationPoint(-14F, -18F, -10F);

		bodyModel[88].addBox(0F, 0F, 0F, 2, 4, 2, 0F); // Box 48
		bodyModel[88].setRotationPoint(-26F, -21F, -1F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 2, 4, 5, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
		bodyModel[89].setRotationPoint(-26F, -21F, -6F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 2, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 44
		bodyModel[90].setRotationPoint(-26F, -21F, 1F);

		bodyModel[91].addBox(0F, 0F, 0F, 0, 2, 5, 0F); // Box 117 liveryimg 2
		bodyModel[91].setRotationPoint(-24.05F, -19.5F, -6F);
		bodyModel[91].rotateAngleY = 0.38397244F;

		bodyModel[92].addBox(0F, 0F, -5F, 0, 2, 5, 0F); // Box 118 liveryimg 2
		bodyModel[92].setRotationPoint(-24.05F, -19.5F, 6F);
		bodyModel[92].rotateAngleY = -0.38397244F;

		bodyModel[93].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 186 lamp front
		bodyModel[93].setRotationPoint(-26.5F, -21F, -1F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 187 lamp front
		bodyModel[94].setRotationPoint(-26.5F, -19F, -1F);

		bodyModel[95].addBox(0F, 0F, 0F, 11, 4, 22, 0F); // Box 201
		bodyModel[95].setRotationPoint(-24F, -4F, -11F);

		bodyModel[96].addBox(-0.5F, 0F, -3.5F, 1, 14, 4, 0F); // Box 314 door swing right
		bodyModel[96].setRotationPoint(-13.5F, -18F, 10.5F);

		bodyModel[97].addBox(-0.5F, 0F, -0.5F, 1, 14, 4, 0F); // Box 315 door swing right
		bodyModel[97].setRotationPoint(-23.5F, -18F, -10.5F);

		bodyModel[98].addBox(0F, 0F, 0F, 14, 3, 22, 0F); // Box 489
		bodyModel[98].setRotationPoint(-8F, 3F, -11F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 14, 1, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 278
		bodyModel[99].setRotationPoint(-8F, 2F, -11F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 14, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 281
		bodyModel[100].setRotationPoint(-8F, 6F, -11F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 14, 3, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 288
		bodyModel[101].setRotationPoint(-8F, 6F, -9F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 14, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 315
		bodyModel[102].setRotationPoint(-8F, 2F, 7F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 14, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 316
		bodyModel[103].setRotationPoint(-8F, 6F, 9F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 7, 1, 12, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 273
		bodyModel[104].setRotationPoint(-12F, -22F, -6F);

		bodyModel[105].addBox(0F, 0F, 0F, 7, 5, 1, 0F); // Box 285
		bodyModel[105].setRotationPoint(-12F, -20.5F, -7.5F);

		bodyModel[106].addBox(0F, 0F, 0F, 7, 5, 1, 0F); // Box 286
		bodyModel[106].setRotationPoint(-12F, -20.5F, 6.5F);

		bodyModel[107].addBox(0F, 0F, 0F, 2, 1, 5, 0F); // Box 274 stacc
		bodyModel[107].setRotationPoint(-1.5F, -22F, -2.5F);

		bodyModel[108].addBox(0F, 0F, 0F, 2, 1, 5, 0F); // Box 275 stacc
		bodyModel[108].setRotationPoint(7.5F, -22F, -2.5F);

		bodyModel[109].addBox(0F, 0F, 0F, 6, 1, 6, 0F); // Box 278
		bodyModel[109].setRotationPoint(4.5F, -21.5F, -3F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 7, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 101
		bodyModel[110].setRotationPoint(4F, -21F, 7F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 3, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, -2F, 0F, 0F, -1F); // Box 104
		bodyModel[111].setRotationPoint(11F, -21F, 7F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 7, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 284
		bodyModel[112].setRotationPoint(4F, -21F, -9F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 3, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1.5F, -2F, 0F, -1.5F, 0F, 0F, 0F, 0F); // Box 286
		bodyModel[113].setRotationPoint(11F, -21F, -9F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F); // Box 302
		bodyModel[114].setRotationPoint(-36F, 0F, 5F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 303
		bodyModel[115].setRotationPoint(-36F, 0F, -5F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 304
		bodyModel[116].setRotationPoint(-36F, 0F, -6F);

		bodyModel[117].addBox(0F, 0F, 0F, 2, 1, 0, 0F); // Box 293
		bodyModel[117].setRotationPoint(-26F, -12F, -11F);

		bodyModel[118].addBox(0F, 0F, 0F, 2, 13, 13, 0F); // Box 43
		bodyModel[118].setRotationPoint(-31F, -13F, -6F);

		bodyModel[119].addBox(0F, 0F, 0F, 2, 4, 1, 0F); // Box 43
		bodyModel[119].setRotationPoint(-31F, -13F, -7F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
		bodyModel[120].setRotationPoint(-30.5F, -8.5F, -7F);

		bodyModel[121].addBox(0F, 0F, 0F, 0, 7, 1, 0F); // Box 43
		bodyModel[121].setRotationPoint(-30F, -6.5F, -7F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[122].setRotationPoint(-24F, -21F, -11F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 210
		bodyModel[123].setRotationPoint(-14F, -21F, -11F);

		bodyModel[124].addBox(0F, 0F, 0F, 1, 3, 14, 0F); // Box 211
		bodyModel[124].setRotationPoint(-24F, -21F, -7F);

		bodyModel[125].addBox(0F, 0F, 0F, 1, 3, 14, 0F); // Box 219
		bodyModel[125].setRotationPoint(-14F, -21F, -7F);

		bodyModel[126].addBox(0F, 0F, 0F, 9, 1, 14, 0F); // Box 220
		bodyModel[126].setRotationPoint(-23F, -21F, -7F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 9, 3, 4, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 221
		bodyModel[127].setRotationPoint(-23F, -21F, -11F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 9, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 222
		bodyModel[128].setRotationPoint(-23F, -21F, 7F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 223
		bodyModel[129].setRotationPoint(-14F, -21F, 7F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 224
		bodyModel[130].setRotationPoint(-24F, -21F, 7F);

		bodyModel[131].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 19
		bodyModel[131].setRotationPoint(-7F, 2F, -11.5F);
		bodyModel[131].rotateAngleX = 0.87266463F;

		bodyModel[132].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 334
		bodyModel[132].setRotationPoint(-7F, 3.5F, 8.75F);
		bodyModel[132].rotateAngleX = 0.87266463F;

		bodyModel[133].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 255 cull
		bodyModel[133].setRotationPoint(32.5F, -0.1F, -7F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 256 ditchlight rear LS
		bodyModel[134].setRotationPoint(33.75F, -0.1F, -7F);

		bodyModel[135].addBox(0F, 0F, 0F, 7, 1, 0, 0F); // Box 258
		bodyModel[135].setRotationPoint(-31F, -12F, 11F);

		bodyModel[136].addBox(0F, 0F, 0F, 29, 2, 4, 0F); // Box 36
		bodyModel[136].setRotationPoint(-13F, -2F, -11F);

		bodyModel[137].addBox(0F, 0F, 0F, 6, 5, 2, 0F); // Box 271 bubble both
		bodyModel[137].setRotationPoint(-11F, -7F, -9F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 6, 2, 2, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 272 bubble1
		bodyModel[138].setRotationPoint(-11F, -9F, -9F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 313
		bodyModel[139].setRotationPoint(-12F, -12F, -11F);

		bodyModel[140].addBox(0F, 0F, 0F, 1, 1, 0, 0F); // Box 314
		bodyModel[140].setRotationPoint(-13F, -12F, -11F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 315
		bodyModel[141].setRotationPoint(14F, -10F, -11F);

		bodyModel[142].addBox(0F, 0F, 0F, 13, 8, 0, 0F); // Box 316
		bodyModel[142].setRotationPoint(16F, -8F, -11F);

		bodyModel[143].addBox(0F, 0F, 0F, 2, 8, 4, 0F); // Box 270
		bodyModel[143].setRotationPoint(-13F, -10F, -10.5F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 3, 8, 7, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 42
		bodyModel[144].setRotationPoint(-34F, -8F, -7F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 3, 8, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 45
		bodyModel[145].setRotationPoint(-34F, -8F, 0F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 3, 2, 6, 0F,-0.42F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -0.42F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 42
		bodyModel[146].setRotationPoint(-34F, -10F, 1F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 2, 5, 2, 0F,0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.6F, 0F, 0F); // Box 48
		bodyModel[147].setRotationPoint(-32.98F, -13F, -1F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 294 lamp canada front
		bodyModel[148].setRotationPoint(-34F, -10F, -1F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 295 lamp canada front
		bodyModel[149].setRotationPoint(-34F, -12F, -1F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 3, 2, 6, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.42F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.42F, 0F, 0F); // Box 298
		bodyModel[150].setRotationPoint(-34F, -10F, -7F);

		bodyModel[151].addBox(0F, 0F, 0F, 1, 0, 4, 0F); // Box 300
		bodyModel[151].setRotationPoint(-30F, -2F, 7F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 301 lamp bnsf front
		bodyModel[152].setRotationPoint(-34F, -13F, -1F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 302 lamp bnsf front
		bodyModel[153].setRotationPoint(-34F, -11F, -1F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 1, 4, 0, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 303
		bodyModel[154].setRotationPoint(-9F, -4F, 11F);

		bodyModel[155].addBox(0F, 0F, 0F, 1, 0, 4, 0F); // Box 304
		bodyModel[155].setRotationPoint(-9F, -2F, 7F);

		bodyModel[156].addBox(0F, 0F, 0F, 4, 4, 4, 0F); // Box 305
		bodyModel[156].setRotationPoint(-13F, -4F, 7F);

		bodyModel[157].addBox(0F, 0F, 0F, 1, 1, 0, 0F); // Box 306
		bodyModel[157].setRotationPoint(-13F, -12F, 11F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F); // Box 307
		bodyModel[158].setRotationPoint(-12F, -12F, 11F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 3, 3, 6, 0F,-0.42F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -0.42F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 318
		bodyModel[159].setRotationPoint(-34F, -13F, 1F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 3, 3, 6, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.42F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.42F, 0F, 0F); // Box 319
		bodyModel[160].setRotationPoint(-34F, -13F, -7F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 314 lamp sp front
		bodyModel[161].setRotationPoint(-33.75F, -12F, -2F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 315 lamp sp front
		bodyModel[162].setRotationPoint(-33.75F, -12F, 0F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 316 lamp sp front
		bodyModel[163].setRotationPoint(-33.75F, -14F, -1F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.6F, 0F, 0F); // Box 317
		bodyModel[164].setRotationPoint(-32.98F, -14F, -1.5F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 2, 3, 4, 0F,0F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0F, 0F, 0F); // Box 20
		bodyModel[165].setRotationPoint(-33.15F, -13F, -2F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 114
		bodyModel[166].setRotationPoint(-4.5F, -19F, -8.7F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[167].setRotationPoint(-4.5F, -20F, -8.7F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 78
		bodyModel[168].setRotationPoint(-4.25F, -18.5F, -8.45F);

		bodyModel[169].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 245
		bodyModel[169].setRotationPoint(-4.5F, -21F, -8.5F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 348 cull
		bodyModel[170].setRotationPoint(-35.5F, 1F, -5.5F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 349 ditchlight front LS
		bodyModel[171].setRotationPoint(-35.75F, 1F, -5.5F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 350 ditchlight front RS
		bodyModel[172].setRotationPoint(-35.75F, 1F, 3.5F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 351 cull
		bodyModel[173].setRotationPoint(-35.5F, 1F, 3.5F);

		bodyModel[174].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 352 cull
		bodyModel[174].setRotationPoint(32.5F, 1F, -5.5F);

		bodyModel[175].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 353 cull
		bodyModel[175].setRotationPoint(32.5F, 1F, 3.5F);

		bodyModel[176].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 354 ditchlight rear RS
		bodyModel[176].setRotationPoint(32.75F, 1F, 3.5F);

		bodyModel[177].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 355 ditchlight rear LS
		bodyModel[177].setRotationPoint(32.75F, 1F, -5.5F);

		bodyModel[178].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 176 marker glow
		bodyModel[178].setRotationPoint(-32.1F, -11.5F, 5.5F);
		bodyModel[178].rotateAngleY = -0.43633231F;

		bodyModel[179].addBox(0F, 0F, -1F, 1, 1, 1, 0F); // Box 176 marker glow
		bodyModel[179].setRotationPoint(-32.1F, -11.5F, -5.5F);
		bodyModel[179].rotateAngleY = 0.43633231F;

		bodyModel[180].addBox(0F, 0F, 0F, 7, 8, 3, 0F); // Box 86
		bodyModel[180].setRotationPoint(-23.1F, -12F, -5F);
		bodyModel[180].rotateAngleY = -0.38397244F;

		bodyModel[181].addBox(0F, 0F, 0F, 1, 9, 10, 0F); // Box 87
		bodyModel[181].setRotationPoint(-23F, -13F, -4F);

		bodyModel[182].addBox(0F, 0F, 0F, 5, 2, 2, 0F); // Box 86
		bodyModel[182].setRotationPoint(-22F, -14F, -5F);
		bodyModel[182].rotateAngleY = -0.38397244F;

		bodyModel[183].addBox(0F, 0F, 0F, 0, 1, 1, 0F); // Box 510
		bodyModel[183].setRotationPoint(-35F, 7F, -11F);

		bodyModel[184].addBox(0F, 0F, 0F, 0, 1, 1, 0F); // Box 511
		bodyModel[184].setRotationPoint(-35F, 7F, 10F);

		bodyModel[185].addBox(0F, 0F, 0F, 0, 1, 1, 0F); // Box 512
		bodyModel[185].setRotationPoint(33F, 7F, 10F);

		bodyModel[186].addBox(0F, 0F, 0F, 0, 1, 1, 0F); // Box 513
		bodyModel[186].setRotationPoint(33F, 7F, -11F);

		bodyModel[187].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 143 sandcap
		bodyModel[187].setRotationPoint(-32.5F, -13.5F, -1F);

		bodyModel[188].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 351 sandcap
		bodyModel[188].setRotationPoint(29F, -21.5F, -1F);

		bodyModel[189].addBox(-1F, 0F, 0F, 1, 1, 1, 0F); // Box 376 marker glow
		bodyModel[189].setRotationPoint(30.1F, -13F, 5.5F);
		bodyModel[189].rotateAngleY = 0.43633231F;

		bodyModel[190].addBox(-1F, 0F, -1F, 1, 1, 1, 0F); // Box 377 marker glow
		bodyModel[190].setRotationPoint(30.1F, -13F, -5.5F);
		bodyModel[190].rotateAngleY = -0.43633231F;

		bodyModel[191].addBox(0F, 0F, 0F, 2, 2, 6, 0F); // Box 450 cull
		bodyModel[191].setRotationPoint(-37F, 7F, -9F);

		bodyModel[192].addBox(0F, 0F, 0F, 2, 2, 6, 0F); // Box 451 cull
		bodyModel[192].setRotationPoint(-37F, 7F, 3F);

		bodyModel[193].addBox(0F, 0F, 0F, 2, 2, 6, 0F); // Box 453 cull
		bodyModel[193].setRotationPoint(33F, 7F, 3F);

		bodyModel[194].addBox(0F, 0F, 0F, 2, 2, 6, 0F); // Box 455 cull
		bodyModel[194].setRotationPoint(33F, 7F, -9F);

		bodyModel[195].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 479 cull
		bodyModel[195].setRotationPoint(33F, 8F, -2F);

		bodyModel[196].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 339 cull
		bodyModel[196].setRotationPoint(-37F, 8F, -2F);

		bodyModel[197].addBox(0F, 0F, 0F, 0, 4, 1, 0F); // Box 350
		bodyModel[197].setRotationPoint(-23.01F, -16F, -12F);

		bodyModel[198].addBox(0F, 0F, 0F, 0, 4, 1, 0F); // Box 351
		bodyModel[198].setRotationPoint(-23.01F, -16F, 11F);

		bodyModel[199].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 409
		bodyModel[199].setRotationPoint(-20.5F, 1F, -11F);

		bodyModel[200].addBox(0F, 0F, 0F, 58, 1, 4, 0F); // Box 515
		bodyModel[200].setRotationPoint(-30F, 0F, 7F);

		bodyModel[201].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, -2F, 2F, 0F, -2F, 2F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 516
		bodyModel[201].setRotationPoint(-35.01F, -8F, -10F);
		bodyModel[201].rotateAngleY = -3.14159265F;

		bodyModel[202].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, -2F, 2F, 0F, -2F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 517
		bodyModel[202].setRotationPoint(-35.01F, -8F, 11F);
		bodyModel[202].rotateAngleY = -3.14159265F;

		bodyModel[203].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, -2F, 2F, 0F, -2F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 518
		bodyModel[203].setRotationPoint(33.01F, -8F, 11F);
		bodyModel[203].rotateAngleY = -3.14159265F;

		bodyModel[204].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, -2F, 2F, 0F, -2F, 2F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 519
		bodyModel[204].setRotationPoint(33.01F, -8F, -10F);
		bodyModel[204].rotateAngleY = -3.14159265F;

		bodyModel[205].addShapeBox(0F, 0F, 0F, 5, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F); // Box 3 cull
		bodyModel[205].setRotationPoint(-21F, -17F, 10F);

		bodyModel[206].addShapeBox(0F, 0F, 0F, 5, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 5
		bodyModel[206].setRotationPoint(-21F, -18F, 10F);

		bodyModel[207].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, -0.57F, 0F, 0F, -0.58F, 0F, 0F, -0.42F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.58F, 0F, 0F, -0.42F, 0F, 0F); // Box 296 nose cover
		bodyModel[207].setRotationPoint(-34F, -13F, 0F);

		bodyModel[208].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-0.42F, 0F, 0F, -0.58F, 0F, 0F, -0.57F, 0F, 0F, 0F, 0F, 0F, -0.42F, 0F, 0F, -0.58F, 0F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F); // Box 299 nose cover
		bodyModel[208].setRotationPoint(-34F, -13F, -1F);

		bodyModel[209].addBox(0F, 0F, 0F, 0, 7, 4, 0F); // Box 291
		bodyModel[209].setRotationPoint(-30F, 1F, -11F);

		bodyModel[210].addShapeBox(0F, 0F, 0F, 1, 5, 3, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 292
		bodyModel[210].setRotationPoint(-31F, 0F, 7F);

		bodyModel[211].addShapeBox(0F, 0F, 0F, 3, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.35F, 0F, 0F, 0F, 0F, 0F); // Box 293
		bodyModel[211].setRotationPoint(-35F, 0F, 7F);

		bodyModel[212].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 294
		bodyModel[212].setRotationPoint(-35F, 3F, 7F);

		bodyModel[213].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 295
		bodyModel[213].setRotationPoint(-35F, 4F, 8F);

		bodyModel[214].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 296
		bodyModel[214].setRotationPoint(-35F, 5F, 8F);

		bodyModel[215].addBox(0F, 0F, 0F, 5, 2, 0, 0F); // Box 297
		bodyModel[215].setRotationPoint(-35F, 6F, 9F);

		bodyModel[216].addBox(0F, 0F, 0F, 5, 0, 2, 0F); // Box 298
		bodyModel[216].setRotationPoint(-35F, 8F, 9F);

		bodyModel[217].addBox(0F, 0F, 0F, 0, 7, 4, 0F); // Box 299
		bodyModel[217].setRotationPoint(-30F, 1F, 7F);

		bodyModel[218].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 300
		bodyModel[218].setRotationPoint(-20.5F, 1F, 7F);

		bodyModel[219].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 301
		bodyModel[219].setRotationPoint(-20F, 2F, 10F);

		bodyModel[220].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 302
		bodyModel[220].setRotationPoint(15.5F, 1F, -11F);

		bodyModel[221].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 303
		bodyModel[221].setRotationPoint(16F, 2F, -11F);

		bodyModel[222].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 304
		bodyModel[222].setRotationPoint(15.5F, 1F, 7F);

		bodyModel[223].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 305
		bodyModel[223].setRotationPoint(16F, 2F, 10F);

		bodyModel[224].addShapeBox(0F, 0F, 0F, 1, 5, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 516
		bodyModel[224].setRotationPoint(28F, 0F, -9.5F);

		bodyModel[225].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 518
		bodyModel[225].setRotationPoint(29F, 3F, -9F);

		bodyModel[226].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 519
		bodyModel[226].setRotationPoint(29F, 4F, -7.5F);

		bodyModel[227].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 520
		bodyModel[227].setRotationPoint(29F, 5F, -9.5F);

		bodyModel[228].addBox(0F, 0F, 0F, 5, 2, 0, 0F); // Box 521
		bodyModel[228].setRotationPoint(28F, 6F, -9F);

		bodyModel[229].addBox(0F, 0F, 0F, 5, 0, 2, 0F); // Box 522
		bodyModel[229].setRotationPoint(28F, 8F, -11F);

		bodyModel[230].addBox(0F, 0F, 0F, 0, 7, 4, 0F); // Box 523
		bodyModel[230].setRotationPoint(28F, 1F, -11F);

		bodyModel[231].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 524
		bodyModel[231].setRotationPoint(-35.01F, 8F, -10F);

		bodyModel[232].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 525
		bodyModel[232].setRotationPoint(-35.01F, 8F, 9F);

		bodyModel[233].addShapeBox(0F, 0F, 0F, 3, 0, 1, 0F,0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 526
		bodyModel[233].setRotationPoint(30F, 0F, -8F);

		bodyModel[234].addShapeBox(0F, 0F, 0F, 3, 0, 1, 0F,0.8F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0.4F, 0F, 0F, 0.8F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0.4F, 0F, 0F); // Box 527
		bodyModel[234].setRotationPoint(30F, 0F, -9F);

		bodyModel[235].addShapeBox(0F, 0F, 0F, 6, 2, 2, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 528 bubble 2
		bodyModel[235].setRotationPoint(-11F, -15F, -9F);

		bodyModel[236].addBox(0F, 0F, 0F, 6, 6, 2, 0F); // Box 529 bubble 2
		bodyModel[236].setRotationPoint(-11F, -13F, -9F);

		bodyModel[237].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 635
		bodyModel[237].setRotationPoint(33.01F, 8F, -10F);

		bodyModel[238].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 636
		bodyModel[238].setRotationPoint(33.01F, 8F, 9F);

		bodyModel[239].addBox(0F, 0F, 0F, 5, 2, 0, 0F); // Box 637
		bodyModel[239].setRotationPoint(28F, 6F, 9F);

		bodyModel[240].addBox(0F, 0F, 0F, 5, 0, 2, 0F); // Box 638
		bodyModel[240].setRotationPoint(28F, 8F, 9F);

		bodyModel[241].addBox(0F, 0F, 0F, 0, 7, 4, 0F); // Box 639
		bodyModel[241].setRotationPoint(28F, 1F, 7F);

		bodyModel[242].addShapeBox(0F, 0F, 0F, 1, 5, 3, 0F,0F, 0F, -0.5F, 1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 640
		bodyModel[242].setRotationPoint(28F, 0F, 6.5F);

		bodyModel[243].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 641
		bodyModel[243].setRotationPoint(29F, 5F, 7.5F);

		bodyModel[244].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 642
		bodyModel[244].setRotationPoint(29F, 4F, 7.5F);

		bodyModel[245].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 643
		bodyModel[245].setRotationPoint(29F, 3F, 7F);

		bodyModel[246].addShapeBox(0F, 0F, 0F, 3, 0, 1, 0F,0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0.8F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0.8F, 0F, 0F); // Box 644
		bodyModel[246].setRotationPoint(30F, 0F, 8F);

		bodyModel[247].addShapeBox(0F, 0F, 0F, 3, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.4F, 0F, 0F); // Box 645
		bodyModel[247].setRotationPoint(30F, 0F, 7F);

		bodyModel[248].addBox(0F, 0F, 0F, 0, 10, 14, 0F); // Box 340
		bodyModel[248].setRotationPoint(18F, -10F, -7F);

		bodyModel[249].addBox(0F, 0F, 0F, 11, 0, 14, 0F); // Box 341
		bodyModel[249].setRotationPoint(18F, -10F, -7F);

		bodyModel[250].addShapeBox(0F, 0F, 0F, 20, 8, 1, 0F,0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F); // Box 304 vent cull
		bodyModel[250].setRotationPoint(18F, -10F, 6.25F);

		bodyModel[251].addShapeBox(0F, 0F, 0F, 20, 8, 1, 0F,0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F); // Box 305 vent cull
		bodyModel[251].setRotationPoint(18F, -10F, -7.25F);

		bodyModel[252].addShapeBox(0F, 0F, 0F, 13, 1, 6, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0.25F, 0.75F, 0F, 0.25F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.75F, 0F, 0F, 0.75F); // Box 306
		bodyModel[252].setRotationPoint(15F, -22F, -7F);

		bodyModel[253].addShapeBox(0F, 0F, 0F, 13, 1, 6, 0F,0F, 0.25F, 0.75F, 0F, 0.25F, 0.75F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 308
		bodyModel[253].setRotationPoint(15F, -22F, 1F);

		bodyModel[254].addShapeBox(0F, 0F, 0F, 26, 1, 6, 0F,-0.25F, 1F, 0F, -13.25F, 1F, 0F, -13.25F, 0F, 0.3F, -0.25F, 0F, 0.3F, -0.25F, -1F, 0F, -13.25F, -1F, 0F, -13.25F, 0F, 0.3F, -0.25F, 0F, 0.3F); // Box 299 big radiator
		bodyModel[254].setRotationPoint(15F, -21.75F, 0.5F);

		bodyModel[255].addShapeBox(0F, 0F, 0F, 26, 1, 6, 0F,-0.25F, 0F, 0.3F, -13.25F, 0F, 0.3F, -13.25F, 1F, 0F, -0.25F, 1F, 0F, -0.25F, 0F, 0.3F, -13.25F, 0F, 0.3F, -13.25F, -1F, 0F, -0.25F, -1F, 0F); // Box 300 big radiator
		bodyModel[255].setRotationPoint(15F, -21.75F, -6.5F);

		bodyModel[256].addShapeBox(0F, 0F, 0F, 3, 3, 2, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1.5F, 0F); // Box 301
		bodyModel[256].setRotationPoint(1F, -21F, -9F);

		bodyModel[257].addShapeBox(0F, 0F, 0F, 3, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1.5F, -2F); // Box 302
		bodyModel[257].setRotationPoint(1F, -21F, 7F);

		bodyModel[258].addBox(0F, 0F, 0F, 4, 1, 14, 0F); // Box 275 gp15T part
		bodyModel[258].setRotationPoint(-5F, -22F, -7F);

		bodyModel[259].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 304
		bodyModel[259].setRotationPoint(-0.5F, -20F, 7.7F);

		bodyModel[260].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 305
		bodyModel[260].setRotationPoint(-0.5F, -19F, 7.7F);

		bodyModel[261].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 306
		bodyModel[261].setRotationPoint(-0.25F, -18.5F, 7.95F);

		bodyModel[262].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 307
		bodyModel[262].setRotationPoint(-0.5F, -21F, 6.5F);

		bodyModel[263].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0.3F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, 0.3F, -0.5F, 0.1F, 0.3F, 0F, 0.1F, -1F, 0F, 0.1F, -1F, 0F, 0.1F, 0.3F, 0F, 0.1F); // Box 246
		bodyModel[263].setRotationPoint(-18.85F, -21F, 8.5F);
		bodyModel[263].rotateAngleX = -0.62831853F;

		bodyModel[264].addShapeBox(0F, -1F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 247 commander beacon R
		bodyModel[264].setRotationPoint(-19F, -21F, 8.5F);
		bodyModel[264].rotateAngleX = -0.62831853F;

		bodyModel[265].addShapeBox(0F, -1F, -1F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 248 commander beacon L
		bodyModel[265].setRotationPoint(-19F, -21F, -8.5F);
		bodyModel[265].rotateAngleX = 0.62831853F;

		bodyModel[266].addShapeBox(0F, 0F, -1F, 2, 1, 1, 0F,0.3F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, 0.3F, -0.5F, 0.1F, 0.3F, 0F, 0.1F, -1F, 0F, 0.1F, -1F, 0F, 0.1F, 0.3F, 0F, 0.1F); // Box 249
		bodyModel[266].setRotationPoint(-18.85F, -21F, -8.5F);
		bodyModel[266].rotateAngleX = 0.62831853F;

		bodyModel[267].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 384
		bodyModel[267].setRotationPoint(-26.5F, -22.5F, -1.5F);

		bodyModel[268].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 386
		bodyModel[268].setRotationPoint(-25.75F, -22.5F, 0.5F);

		bodyModel[269].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 387
		bodyModel[269].setRotationPoint(-24.75F, -22.5F, -0.5F);

		bodyModel[270].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 385
		bodyModel[270].setRotationPoint(-25F, -22.75F, -0.5F);

		bodyModel[271].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 361
		bodyModel[271].setRotationPoint(2F, -22F, -6.5F);

		bodyModel[272].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 362
		bodyModel[272].setRotationPoint(0F, -23F, -4.5F);

		bodyModel[273].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 363
		bodyModel[273].setRotationPoint(1F, -23F, -6.5F);

		bodyModel[274].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 364
		bodyModel[274].setRotationPoint(2F, -23F, -5.5F);

		bodyModel[275].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 389 support cull
		bodyModel[275].setRotationPoint(-23F, -21F, -9F);

		bodyModel[276].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 162 commander beacon L
		bodyModel[276].setRotationPoint(-22.47F, -23F, -8.5F);

		bodyModel[277].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0.3F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, 0.3F, -0.5F, 0.1F, 0.3F, 0F, 0.1F, -1F, 0F, 0.1F, -1F, 0F, 0.1F, 0.3F, 0F, 0.1F); // Box 165
		bodyModel[277].setRotationPoint(-22.32F, -22F, -8.5F);

		bodyModel[278].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 356 support cull
		bodyModel[278].setRotationPoint(-23F, -21F, 7F);

		bodyModel[279].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 404 commander beacon R
		bodyModel[279].setRotationPoint(-22.47F, -23F, 7.5F);

		bodyModel[280].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0.3F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, 0.3F, -0.5F, 0.1F, 0.3F, 0F, 0.1F, -1F, 0F, 0.1F, -1F, 0F, 0.1F, 0.3F, 0F, 0.1F); // Box 405
		bodyModel[280].setRotationPoint(-22.32F, -22F, 7.5F);

		bodyModel[281].addBox(0F, 0F, 0F, 5, 2, 8, 0F); // Box 264
		bodyModel[281].setRotationPoint(-21F, -22.5F, -4F);

		bodyModel[282].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 327
		bodyModel[282].setRotationPoint(33F, 0F, 2F);

		bodyModel[283].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 328
		bodyModel[283].setRotationPoint(33F, 0F, -8F);

		bodyModel[284].addBox(0F, 0F, 0F, 2, 1, 4, 0F); // Box 329
		bodyModel[284].setRotationPoint(33F, 0F, -2F);

		bodyModel[285].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 330
		bodyModel[285].setRotationPoint(-23F, -22.5F, 4F);

		bodyModel[286].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 331
		bodyModel[286].setRotationPoint(-21F, -22.5F, 5F);

		bodyModel[287].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 332
		bodyModel[287].setRotationPoint(-23F, -22.5F, 6F);

		bodyModel[288].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 333
		bodyModel[288].setRotationPoint(-21F, -21.5F, 5F);

		bodyModel[289].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0.5F, 0F, 0F, -1F, 0F, 0F, 1F, 1F, 0F, -1.5F, 1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F); // Box 280
		bodyModel[289].setRotationPoint(-38F, 5F, 2F);

		bodyModel[290].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F); // Box 281
		bodyModel[290].setRotationPoint(-38F, 6F, 0F);

		bodyModel[291].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,-1F, 0F, 0F, 0.5F, 0F, 0F, 3F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, -1F, -2.5F, 0F, -1F); // Box 282
		bodyModel[291].setRotationPoint(-39F, 7F, 0F);

		bodyModel[292].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,-3.5F, 0F, 0F, 3F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -2.5F, 0F, -1F, 2F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 283
		bodyModel[292].setRotationPoint(-39F, 7F, -10F);

		bodyModel[293].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,-2.5F, 0F, 0F, 2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 284
		bodyModel[293].setRotationPoint(-38F, 6F, -10F);

		bodyModel[294].addShapeBox(0F, 0F, -2F, 1, 1, 8, 0F,-1.5F, 1F, 0F, 1F, 1F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 285
		bodyModel[294].setRotationPoint(-38F, 5F, -8F);

		bodyModel[295].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F,0.5F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1.5F, 0F, 0F); // Box 340
		bodyModel[295].setRotationPoint(-37F, 4F, 2F);

		bodyModel[296].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0.5F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F); // Box 341
		bodyModel[296].setRotationPoint(-38F, 3F, 2F);

		bodyModel[297].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F,-1.5F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F); // Box 342
		bodyModel[297].setRotationPoint(-37F, 4F, -10F);

		bodyModel[298].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,-1.5F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 343
		bodyModel[298].setRotationPoint(-38F, 3F, -10F);

		bodyModel[299].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,-1F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 1F, 0F, 1F, 1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F); // Box 280
		bodyModel[299].setRotationPoint(35F, 5F, 2F);

		bodyModel[300].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F); // Box 281
		bodyModel[300].setRotationPoint(35F, 6F, 0F);

		bodyModel[301].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,0.5F, 0F, 0F, -1F, 0F, 0F, -3.5F, 0F, 0F, 3F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, -1F, 2F, 0F, -1F); // Box 282
		bodyModel[301].setRotationPoint(36F, 7F, 0F);

		bodyModel[302].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,3F, 0F, 0F, -3.5F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 2F, 0F, -1F, -2.5F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 283
		bodyModel[302].setRotationPoint(36F, 7F, -10F);

		bodyModel[303].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,2F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 284
		bodyModel[303].setRotationPoint(35F, 6F, -10F);

		bodyModel[304].addShapeBox(0F, 0F, -2F, 1, 1, 8, 0F,1F, 1F, 0F, -1.5F, 1F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 285
		bodyModel[304].setRotationPoint(35F, 5F, -8F);

		bodyModel[305].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F,-1F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, 0F); // Box 340
		bodyModel[305].setRotationPoint(34F, 4F, 2F);

		bodyModel[306].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,-1F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F); // Box 341
		bodyModel[306].setRotationPoint(35F, 3F, 2F);

		bodyModel[307].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F,1F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F); // Box 342
		bodyModel[307].setRotationPoint(34F, 4F, -10F);

		bodyModel[308].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,1F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 343
		bodyModel[308].setRotationPoint(35F, 3F, -10F);

		bodyModel[309].addBox(0F, 0F, 0F, 2, 1, 4, 0F); // Box 354
		bodyModel[309].setRotationPoint(-37F, 0F, -2F);

		bodyModel[310].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 355
		bodyModel[310].setRotationPoint(-37F, 0F, -8F);

		bodyModel[311].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 356
		bodyModel[311].setRotationPoint(-37F, 0F, 2F);

		bodyModel[312].addBox(0F, 0F, 0F, 5, 1, 8, 0F); // Box 357
		bodyModel[312].setRotationPoint(-30F, -13.25F, -4F);

		bodyModel[313].addBox(0F, 0F, 0F, 0, 8, 6, 0F); // Box 358
		bodyModel[313].setRotationPoint(-37F, -8F, -3F);

		bodyModel[314].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F,2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 359
		bodyModel[314].setRotationPoint(-35F, -8F, 3F);

		bodyModel[315].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F); // Box 360
		bodyModel[315].setRotationPoint(-35F, -8F, -7F);

		bodyModel[316].addBox(0F, 0F, 0F, 0, 8, 6, 0F); // Box 361
		bodyModel[316].setRotationPoint(35F, -8F, -3F);

		bodyModel[317].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 362
		bodyModel[317].setRotationPoint(33F, -8F, 3F);

		bodyModel[318].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F); // Box 363
		bodyModel[318].setRotationPoint(33F, -8F, -7F);

		bodyModel[319].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 364 commander beacon
		bodyModel[319].setRotationPoint(10.03F, -23F, 7.5F);

		bodyModel[320].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0.3F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, 0.3F, -0.5F, 0.1F, 0.3F, 0F, 0.1F, -1F, 0F, 0.1F, -1F, 0F, 0.1F, 0.3F, 0F, 0.1F); // Box 365
		bodyModel[320].setRotationPoint(10.18F, -22F, 7.5F);

		bodyModel[321].addShapeBox(0F, 0F, 0F, 11, 1, 6, 0F,-0.25F, 0F, 0.3F, -4.75F, 0F, 0.3F, -4.75F, 1F, 0F, -0.25F, 1F, 0F, -0.25F, 0F, 0.3F, -4.75F, 0F, 0.3F, -4.75F, -1F, 0F, -0.25F, -1F, 0F); // Box 366 smol radiator
		bodyModel[321].setRotationPoint(15F, -21.75F, -6.5F);

		bodyModel[322].addShapeBox(0F, 0F, 0F, 11, 1, 6, 0F,-0.25F, 0F, 0.3F, -4.75F, 0F, 0.3F, -4.75F, 1F, 0F, -0.25F, 1F, 0F, -0.25F, 0F, 0.3F, -4.75F, 0F, 0.3F, -4.75F, -1F, 0F, -0.25F, -1F, 0F); // Box 367 smol radiator
		bodyModel[322].setRotationPoint(21.5F, -21.75F, -6.5F);

		bodyModel[323].addShapeBox(0F, 0F, 0F, 11, 1, 6, 0F,-0.25F, 1F, 0F, -4.75F, 1F, 0F, -4.75F, 0F, 0.3F, -0.25F, 0F, 0.3F, -0.25F, -1F, 0F, -4.75F, -1F, 0F, -4.75F, 0F, 0.3F, -0.25F, 0F, 0.3F); // Box 368 smol radiator
		bodyModel[323].setRotationPoint(15F, -21.75F, 0.5F);

		bodyModel[324].addShapeBox(0F, 0F, 0F, 11, 1, 6, 0F,-0.25F, 1F, 0F, -4.75F, 1F, 0F, -4.75F, 0F, 0.3F, -0.25F, 0F, 0.3F, -0.25F, -1F, 0F, -4.75F, -1F, 0F, -4.75F, 0F, 0.3F, -0.25F, 0F, 0.3F); // Box 369 smol radiator
		bodyModel[324].setRotationPoint(21.5F, -21.75F, 0.5F);

		bodyModel[325].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 335
		bodyModel[325].setRotationPoint(-24F, -23F, 3F);

		bodyModel[326].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 362
		bodyModel[326].setRotationPoint(10.75F, -22.5F, 0.5F);

		bodyModel[327].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 363
		bodyModel[327].setRotationPoint(11.75F, -22.5F, -1.5F);

		bodyModel[328].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 364
		bodyModel[328].setRotationPoint(12.75F, -22.5F, -0.5F);

		bodyModel[329].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 339
		bodyModel[329].setRotationPoint(12.75F, -21.5F, -0.5F);

		bodyModel[330].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 340
		bodyModel[330].setRotationPoint(-15F, -23F, 0F);

		bodyModel[331].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 341
		bodyModel[331].setRotationPoint(-24F, -23.5F, -0.5F);

		bodyModel[332].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 342
		bodyModel[332].setRotationPoint(-26F, -23.5F, 0.5F);

		bodyModel[333].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 343
		bodyModel[333].setRotationPoint(-25F, -23.5F, -1.5F);

		bodyModel[334].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 344
		bodyModel[334].setRotationPoint(-24F, -22.5F, -0.5F);

		bodyModel[335].addBox(0F, 0F, 0F, 2, 2, 5, 0F); // Box 345 mopac moment stacc
		bodyModel[335].setRotationPoint(-1.5F, -24F, -2.5F);

		bodyModel[336].addBox(0F, 0F, 0F, 2, 2, 5, 0F); // Box 345 mopac moment stacc
		bodyModel[336].setRotationPoint(7.5F, -24F, -2.5F);

		bodyModel[337].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 347
		bodyModel[337].setRotationPoint(-22F, -23F, 0F);

		bodyModel[338].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 255 cull
		bodyModel[338].setRotationPoint(32.5F, -0.1F, 5F);

		bodyModel[339].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 256 ditchlight rear RS
		bodyModel[339].setRotationPoint(33.75F, -0.1F, 5F);

		bodyModel[340].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 255 cull
		bodyModel[340].setRotationPoint(-36.5F, -0.1F, -7F);

		bodyModel[341].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 256 ditchlight front LS
		bodyModel[341].setRotationPoint(-36.75F, -0.1F, -7F);

		bodyModel[342].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 255 cull
		bodyModel[342].setRotationPoint(-36.5F, -0.1F, 5F);

		bodyModel[343].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 256 ditchlight front RS
		bodyModel[343].setRotationPoint(-36.75F, -0.1F, 5F);

		bodyModel[344].addBox(0F, 0F, 0F, 6, 2, 4, 0F); // Box 361
		bodyModel[344].setRotationPoint(-20.5F, -23F, -6F);

		bodyModel[345].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 362
		bodyModel[345].setRotationPoint(-21.5F, -23F, -6F);

		bodyModel[346].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 363
		bodyModel[346].setRotationPoint(-21.5F, -22F, -6F);

		bodyModel[347].addBox(0F, 0F, 0F, 6, 2, 4, 0F); // Box 364
		bodyModel[347].setRotationPoint(-20.5F, -23F, 2F);

		bodyModel[348].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 365
		bodyModel[348].setRotationPoint(-21.5F, -23F, 2F);

		bodyModel[349].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 360
		bodyModel[349].setRotationPoint(-21.5F, -22F, 2F);

		bodyModel[350].addShapeBox(0F, -1F, -1F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 334 commander beacon
		bodyModel[350].setRotationPoint(-16F, -22F, 0.5F);

		bodyModel[351].addShapeBox(0F, 0F, -1F, 2, 1, 1, 0F,0.3F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, 0.3F, -0.5F, 0.1F, 0.3F, 0F, 0.1F, -1F, 0F, 0.1F, -1F, 0F, 0.1F, 0.3F, 0F, 0.1F); // Box 335
		bodyModel[351].setRotationPoint(-15.85F, -22F, 0.5F);

		bodyModel[352].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 363 stacc
		bodyModel[352].setRotationPoint(7.5F, -23F, -1F);

		bodyModel[353].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 363 stacc
		bodyModel[353].setRotationPoint(-1.5F, -23F, -1F);

		bodyModel[354].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 364 prime base
		bodyModel[354].setRotationPoint(-23.5F, -22F, -1F);

		bodyModel[355].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F); // Box 6 PRIME1-1
		bodyModel[355].setRotationPoint(-23.5F, -22.5F, -1F);

		bodyModel[356].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F); // Box 7 PRIME1-3
		bodyModel[356].setRotationPoint(-23.5F, -22.5F, -1F);

		bodyModel[357].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 8 PRIME1-2
		bodyModel[357].setRotationPoint(-23.5F, -22.5F, -1F);

		bodyModel[358].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 9 PRIME1-4
		bodyModel[358].setRotationPoint(-23.5F, -22.5F, -1F);

		bodyModel[359].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 370
		bodyModel[359].setRotationPoint(-36.5F, -3F, -5F);

		bodyModel[360].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 190 ditchlight front LS
		bodyModel[360].setRotationPoint(-36.75F, -3F, -5F);

		bodyModel[361].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 370
		bodyModel[361].setRotationPoint(-36.5F, -3F, 3F);

		bodyModel[362].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 190 ditchlight front LS
		bodyModel[362].setRotationPoint(-36.75F, -3F, 3F);

		bodyModel[363].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 370
		bodyModel[363].setRotationPoint(33.5F, -3F, -5F);

		bodyModel[364].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 190 ditchlight front LS
		bodyModel[364].setRotationPoint(33.75F, -3F, -5F);

		bodyModel[365].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 370
		bodyModel[365].setRotationPoint(33.5F, -3F, 3F);

		bodyModel[366].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 190 ditchlight front LS
		bodyModel[366].setRotationPoint(33.75F, -3F, 3F);

		bodyModel[367].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 372
		bodyModel[367].setRotationPoint(-10F, -23F, 4F);

		bodyModel[368].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 379
		bodyModel[368].setRotationPoint(-21F, -22F, 0F);

		bodyModel[369].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 352
		bodyModel[369].setRotationPoint(-26F, -23F, -2F);

		bodyModel[370].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 353 lamp front upper
		bodyModel[370].setRotationPoint(-26.25F, -23F, -2F);

		bodyModel[371].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 354 lamp front upper
		bodyModel[371].setRotationPoint(-26.25F, -23F, 0F);

		bodyModel[372].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 354 cnw bELL
		bodyModel[372].setRotationPoint(-34F, -13F, -1F);

		bodyModel[373].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 384
		bodyModel[373].setRotationPoint(33F, 0F, -5F);

		bodyModel[374].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 385
		bodyModel[374].setRotationPoint(33F, 0F, -6F);

		bodyModel[375].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, 0F, -1F, 0F); // Box 386
		bodyModel[375].setRotationPoint(33F, 0F, 5F);

		bodyModel[376].addBox(0F, 0F, 0F, 6, 3, 3, 0F); // Box 376 cull
		bodyModel[376].setRotationPoint(-20F, -21F, -10F);

		bodyModel[377].addBox(0F, 0F, 0F, 6, 3, 3, 0F); // Box 377 cull
		bodyModel[377].setRotationPoint(-20F, -21F, 7F);

		bodyModel[378].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 378
		bodyModel[378].setRotationPoint(-17F, -23F, 9F);

		bodyModel[379].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 379
		bodyModel[379].setRotationPoint(-17F, -23F, -9F);

		bodyModel[380].addBox(0F, 0F, 0F, 21, 1, 0, 0F); // Box 380
		bodyModel[380].setRotationPoint(-30F, 1F, -11F);

		bodyModel[381].addBox(0F, 0F, 0F, 17, 1, 0, 0F); // Box 381
		bodyModel[381].setRotationPoint(11F, 1F, -11F);

		bodyModel[382].addBox(0F, 0F, 0F, 17, 1, 0, 0F); // Box 382
		bodyModel[382].setRotationPoint(11F, 1F, 11F);

		bodyModel[383].addBox(0F, 0F, 0F, 21, 1, 0, 0F); // Box 383
		bodyModel[383].setRotationPoint(-30F, 1F, 11F);

		bodyModel[384].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 384
		bodyModel[384].setRotationPoint(-9F, 1F, -11F);

		bodyModel[385].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 385
		bodyModel[385].setRotationPoint(-9F, 1F, 11F);

		bodyModel[386].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 386
		bodyModel[386].setRotationPoint(10F, 1F, -11F);

		bodyModel[387].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 387
		bodyModel[387].setRotationPoint(10F, 1F, 11F);
	}
	ModelBapBlombergB theTrucc = new ModelBapBlombergB();
	ModelTypeB theTrucks1 = new ModelTypeB();

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

		if (entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor() == 12345) {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/typeb_Black.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.4, 0.15, 0);
			theTrucks1.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(2.85, 0, 0);
			theTrucks1.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else if (entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor() == 1231||entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor() == 345||entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor() == 5345||entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor() == 3456||entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor() == 13453) {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/blombergB_Grey.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.2, 0.15, 0);
			theTrucc.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(2.27, 0, 0);
			theTrucc.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();

		} else if (entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor() == 11) {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/blombergB_spooki_up_trash.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.2, 0.15, 0);
			theTrucc.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(2.27, 0, 0);
			theTrucc.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();


		} else if (entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor() == 3456) {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/blombergB_Stale_Egg.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.2, 0.15, 0);
			theTrucc.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glRotatef(180, 0, 1, 0);
			GL11.glTranslated(-2.27, 0, 0);
			theTrucc.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();

		} else {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/blombergB_Black.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.2, 0.15, 0);
			theTrucc.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(2.27, 0, 0);
			theTrucc.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		}
	}
	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
	{
	}
	public ModelRendererTurbo ModelGP15[];
	public ArrayList<double[]> getSmokePosition() {
		return new ArrayList<double[]>() {
			{
				add(new double[]{1.33D, 1.45D, 0.0D});
				add(new double[]{0.75D, 1.45D, 0.0D});
			}
		};
	}
}
//blombergB_Stale_Egg