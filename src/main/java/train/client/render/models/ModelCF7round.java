//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 20.11.2020 - 11:11:32
// Last changed on: 20.11.2020 - 11:11:32

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

public class ModelCF7round extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelCF7round() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[361];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 7
		bodyModel[1] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 37
		bodyModel[2] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 38
		bodyModel[3] = new ModelRendererTurbo(this, 284, 3, textureX, textureY); // Box 39
		bodyModel[4] = new ModelRendererTurbo(this, 351, 14, textureX, textureY); // Box 40
		bodyModel[5] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 42
		bodyModel[6] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 44
		bodyModel[7] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 45
		bodyModel[8] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 46
		bodyModel[9] = new ModelRendererTurbo(this, 257, 25, textureX, textureY); // Box 48
		bodyModel[10] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 50
		bodyModel[11] = new ModelRendererTurbo(this, 313, 25, textureX, textureY); // Box 51
		bodyModel[12] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 52 door swing right
		bodyModel[13] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 53
		bodyModel[14] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 54
		bodyModel[15] = new ModelRendererTurbo(this, 433, 25, textureX, textureY); // Box 55
		bodyModel[16] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 59
		bodyModel[17] = new ModelRendererTurbo(this, 274, 1, textureX, textureY); // Box 61
		bodyModel[18] = new ModelRendererTurbo(this, 73, 9, textureX, textureY); // Box 70
		bodyModel[19] = new ModelRendererTurbo(this, 193, 1, textureX, textureY, "lamp"); // Box 71 glow marker
		bodyModel[20] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 73
		bodyModel[21] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 74
		bodyModel[22] = new ModelRendererTurbo(this, 473, 25, textureX, textureY); // Box 72
		bodyModel[23] = new ModelRendererTurbo(this, 361, 9, textureX, textureY); // Box 78
		bodyModel[24] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 82
		bodyModel[25] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 83
		bodyModel[26] = new ModelRendererTurbo(this, 73, 9, textureX, textureY); // Box 84
		bodyModel[27] = new ModelRendererTurbo(this, 81, 9, textureX, textureY); // Box 85
		bodyModel[28] = new ModelRendererTurbo(this, 329, 9, textureX, textureY); // Box 86
		bodyModel[29] = new ModelRendererTurbo(this, 177, 25, textureX, textureY); // Box 87
		bodyModel[30] = new ModelRendererTurbo(this, 169, 9, textureX, textureY); // Box 86
		bodyModel[31] = new ModelRendererTurbo(this, 260, 28, textureX, textureY); // Box 87
		bodyModel[32] = new ModelRendererTurbo(this, 105, 33, textureX, textureY); // Box 88
		bodyModel[33] = new ModelRendererTurbo(this, 281, 9, textureX, textureY); // Box 90
		bodyModel[34] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 91
		bodyModel[35] = new ModelRendererTurbo(this, 201, 33, textureX, textureY); // Box 92
		bodyModel[36] = new ModelRendererTurbo(this, 105, 41, textureX, textureY); // Box 93
		bodyModel[37] = new ModelRendererTurbo(this, 361, 17, textureX, textureY); // Box 94
		bodyModel[38] = new ModelRendererTurbo(this, 121, 33, textureX, textureY); // Box 95
		bodyModel[39] = new ModelRendererTurbo(this, 169, 49, textureX, textureY); // Box 99
		bodyModel[40] = new ModelRendererTurbo(this, 473, 41, textureX, textureY); // Box 190
		bodyModel[41] = new ModelRendererTurbo(this, 385, 9, textureX, textureY); // Box 106
		bodyModel[42] = new ModelRendererTurbo(this, 73, 17, textureX, textureY); // Box 69
		bodyModel[43] = new ModelRendererTurbo(this, 169, 17, textureX, textureY); // Box 143
		bodyModel[44] = new ModelRendererTurbo(this, 273, 17, textureX, textureY); // Box 4
		bodyModel[45] = new ModelRendererTurbo(this, 49, 33, textureX, textureY); // Box 48
		bodyModel[46] = new ModelRendererTurbo(this, 178, 59, textureX, textureY); // Box 57
		bodyModel[47] = new ModelRendererTurbo(this, 257, 16, textureX, textureY); // Box 58
		bodyModel[48] = new ModelRendererTurbo(this, 97, 9, textureX, textureY); // Box 143
		bodyModel[49] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 61
		bodyModel[50] = new ModelRendererTurbo(this, 305, 9, textureX, textureY); // Box 62
		bodyModel[51] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 63
		bodyModel[52] = new ModelRendererTurbo(this, 457, 9, textureX, textureY); // Box 78
		bodyModel[53] = new ModelRendererTurbo(this, 313, 17, textureX, textureY); // Box 80
		bodyModel[54] = new ModelRendererTurbo(this, 294, 21, textureX, textureY); // Box 99
		bodyModel[55] = new ModelRendererTurbo(this, 433, 17, textureX, textureY); // Box 100
		bodyModel[56] = new ModelRendererTurbo(this, 297, 25, textureX, textureY); // Box 132
		bodyModel[57] = new ModelRendererTurbo(this, 417, 25, textureX, textureY); // Box 133
		bodyModel[58] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 184
		bodyModel[59] = new ModelRendererTurbo(this, 257, 49, textureX, textureY); // Box 235
		bodyModel[60] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 245
		bodyModel[61] = new ModelRendererTurbo(this, 505, 9, textureX, textureY); // Box 246
		bodyModel[62] = new ModelRendererTurbo(this, 465, 25, textureX, textureY); // Box 254
		bodyModel[63] = new ModelRendererTurbo(this, 209, 9, textureX, textureY); // Box 255
		bodyModel[64] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 259
		bodyModel[65] = new ModelRendererTurbo(this, 10, 91, textureX, textureY); // Box 260
		bodyModel[66] = new ModelRendererTurbo(this, 57, 33, textureX, textureY); // Box 261
		bodyModel[67] = new ModelRendererTurbo(this, 273, 49, textureX, textureY); // Box 262
		bodyModel[68] = new ModelRendererTurbo(this, 297, 49, textureX, textureY); // Box 263
		bodyModel[69] = new ModelRendererTurbo(this, 425, 57, textureX, textureY); // Box 264
		bodyModel[70] = new ModelRendererTurbo(this, 297, 25, textureX, textureY); // Box 265
		bodyModel[71] = new ModelRendererTurbo(this, 433, 25, textureX, textureY, "lamp"); // Box 318 lantern
		bodyModel[72] = new ModelRendererTurbo(this, 57, 41, textureX, textureY); // Box 319
		bodyModel[73] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 320
		bodyModel[74] = new ModelRendererTurbo(this, 449, 57, textureX, textureY); // Box 321
		bodyModel[75] = new ModelRendererTurbo(this, 250, 107, textureX, textureY); // Box 324
		bodyModel[76] = new ModelRendererTurbo(this, 473, 57, textureX, textureY); // Box 325
		bodyModel[77] = new ModelRendererTurbo(this, 393, 9, textureX, textureY, "lamp"); // Box 117 liveryimg 2 glow
		bodyModel[78] = new ModelRendererTurbo(this, 449, 9, textureX, textureY, "lamp"); // Box 118 liveryimg 2 glow
		bodyModel[79] = new ModelRendererTurbo(this, 417, 25, textureX, textureY, "lamp"); // Box 124 glow marker
		bodyModel[80] = new ModelRendererTurbo(this, 185, 65, textureX, textureY); // Box 125
		bodyModel[81] = new ModelRendererTurbo(this, 177, 27, textureX, textureY); // Box 259
		bodyModel[82] = new ModelRendererTurbo(this, 209, 65, textureX, textureY); // Box 131
		bodyModel[83] = new ModelRendererTurbo(this, 94, 42, textureX, textureY); // Box 134
		bodyModel[84] = new ModelRendererTurbo(this, 249, 49, textureX, textureY); // Box 135
		bodyModel[85] = new ModelRendererTurbo(this, 289, 57, textureX, textureY); // Box 139
		bodyModel[86] = new ModelRendererTurbo(this, 489, 16, textureX, textureY); // Box 275
		bodyModel[87] = new ModelRendererTurbo(this, 177, 46, textureX, textureY); // Box 141
		bodyModel[88] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 142
		bodyModel[89] = new ModelRendererTurbo(this, 484, 1, textureX, textureY); // Box 143
		bodyModel[90] = new ModelRendererTurbo(this, 465, 9, textureX, textureY); // Box 144
		bodyModel[91] = new ModelRendererTurbo(this, 497, 57, textureX, textureY); // Box 145
		bodyModel[92] = new ModelRendererTurbo(this, 9, 41, textureX, textureY); // Box 147
		bodyModel[93] = new ModelRendererTurbo(this, 505, 25, textureX, textureY); // Box 148
		bodyModel[94] = new ModelRendererTurbo(this, 1, 66, textureX, textureY); // Box 149
		bodyModel[95] = new ModelRendererTurbo(this, 167, 27, textureX, textureY); // Box 150
		bodyModel[96] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 61
		bodyModel[97] = new ModelRendererTurbo(this, 329, 65, textureX, textureY); // Box 81
		bodyModel[98] = new ModelRendererTurbo(this, 361, 9, textureX, textureY); // Box 81
		bodyModel[99] = new ModelRendererTurbo(this, 441, 57, textureX, textureY); // Box 174
		bodyModel[100] = new ModelRendererTurbo(this, 118, 60, textureX, textureY); // Box 175
		bodyModel[101] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 176
		bodyModel[102] = new ModelRendererTurbo(this, 337, 65, textureX, textureY); // Box 177
		bodyModel[103] = new ModelRendererTurbo(this, 177, 9, textureX, textureY); // Box 178
		bodyModel[104] = new ModelRendererTurbo(this, 289, 49, textureX, textureY, "lamp"); // Box 186 headlight f
		bodyModel[105] = new ModelRendererTurbo(this, 42, 53, textureX, textureY, "lamp"); // Box 187 headlight f
		bodyModel[106] = new ModelRendererTurbo(this, 97, 57, textureX, textureY); // Box 188
		bodyModel[107] = new ModelRendererTurbo(this, 505, 57, textureX, textureY, "lamp"); // Box 189 ditchlight f
		bodyModel[108] = new ModelRendererTurbo(this, 185, 65, textureX, textureY, "lamp"); // Box 190 ditchlight f
		bodyModel[109] = new ModelRendererTurbo(this, 193, 65, textureX, textureY); // Box 191
		bodyModel[110] = new ModelRendererTurbo(this, 217, 65, textureX, textureY); // Box 192
		bodyModel[111] = new ModelRendererTurbo(this, 369, 65, textureX, textureY); // Box 193
		bodyModel[112] = new ModelRendererTurbo(this, 385, 65, textureX, textureY); // box64
		bodyModel[113] = new ModelRendererTurbo(this, 457, 65, textureX, textureY); // Box 204
		bodyModel[114] = new ModelRendererTurbo(this, 241, 65, textureX, textureY); // Box 205
		bodyModel[115] = new ModelRendererTurbo(this, 409, 65, textureX, textureY); // Box 206
		bodyModel[116] = new ModelRendererTurbo(this, 313, 65, textureX, textureY); // Box 207
		bodyModel[117] = new ModelRendererTurbo(this, 249, 73, textureX, textureY); // Box 208
		bodyModel[118] = new ModelRendererTurbo(this, 401, 65, textureX, textureY); // Box 209
		bodyModel[119] = new ModelRendererTurbo(this, 305, 65, textureX, textureY); // Box 210
		bodyModel[120] = new ModelRendererTurbo(this, 249, 73, textureX, textureY); // Box 211
		bodyModel[121] = new ModelRendererTurbo(this, 265, 73, textureX, textureY); // Box 234
		bodyModel[122] = new ModelRendererTurbo(this, 281, 73, textureX, textureY); // Box 235
		bodyModel[123] = new ModelRendererTurbo(this, 265, 73, textureX, textureY); // Box 236
		bodyModel[124] = new ModelRendererTurbo(this, 385, 73, textureX, textureY); // Box 237
		bodyModel[125] = new ModelRendererTurbo(this, 401, 73, textureX, textureY); // Box 238
		bodyModel[126] = new ModelRendererTurbo(this, 241, 73, textureX, textureY); // Box 239
		bodyModel[127] = new ModelRendererTurbo(this, 449, 73, textureX, textureY, "lamp"); // Box 240 ditchlight r
		bodyModel[128] = new ModelRendererTurbo(this, 457, 73, textureX, textureY, "lamp"); // Box 241 ditchlight r
		bodyModel[129] = new ModelRendererTurbo(this, 489, 73, textureX, textureY); // Box 242
		bodyModel[130] = new ModelRendererTurbo(this, 497, 73, textureX, textureY); // Box 243
		bodyModel[131] = new ModelRendererTurbo(this, 273, 25, textureX, textureY); // Box 244
		bodyModel[132] = new ModelRendererTurbo(this, 401, 9, textureX, textureY); // Box 245
		bodyModel[133] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 246
		bodyModel[134] = new ModelRendererTurbo(this, 505, 73, textureX, textureY, "lamp"); // Box 247 headlight r
		bodyModel[135] = new ModelRendererTurbo(this, 17, 81, textureX, textureY, "lamp"); // Box 248 headlight r
		bodyModel[136] = new ModelRendererTurbo(this, 25, 81, textureX, textureY); // Box 249
		bodyModel[137] = new ModelRendererTurbo(this, 33, 81, textureX, textureY); // Box 250
		bodyModel[138] = new ModelRendererTurbo(this, 73, 17, textureX, textureY); // Box 251
		bodyModel[139] = new ModelRendererTurbo(this, 40, 80, textureX, textureY); // Box 252
		bodyModel[140] = new ModelRendererTurbo(this, 65, 81, textureX, textureY); // Box 253
		bodyModel[141] = new ModelRendererTurbo(this, 81, 81, textureX, textureY); // Box 254
		bodyModel[142] = new ModelRendererTurbo(this, 289, 17, textureX, textureY); // Box 43
		bodyModel[143] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 43
		bodyModel[144] = new ModelRendererTurbo(this, 57, 41, textureX, textureY); // Box 114
		bodyModel[145] = new ModelRendererTurbo(this, 257, 49, textureX, textureY); // Box 74
		bodyModel[146] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 78
		bodyModel[147] = new ModelRendererTurbo(this, 273, 73, textureX, textureY); // Box 245
		bodyModel[148] = new ModelRendererTurbo(this, 345, 65, textureX, textureY); // Box 292
		bodyModel[149] = new ModelRendererTurbo(this, 369, 65, textureX, textureY); // Box 293
		bodyModel[150] = new ModelRendererTurbo(this, 17, 89, textureX, textureY); // Box 311
		bodyModel[151] = new ModelRendererTurbo(this, 505, 81, textureX, textureY); // Box 312
		bodyModel[152] = new ModelRendererTurbo(this, 73, 89, textureX, textureY); // Box 313
		bodyModel[153] = new ModelRendererTurbo(this, 97, 81, textureX, textureY); // Box 314 door swing right
		bodyModel[154] = new ModelRendererTurbo(this, 113, 89, textureX, textureY); // Box 316
		bodyModel[155] = new ModelRendererTurbo(this, 113, 81, textureX, textureY); // Box 318
		bodyModel[156] = new ModelRendererTurbo(this, 113, 89, textureX, textureY); // Box 319
		bodyModel[157] = new ModelRendererTurbo(this, 313, 25, textureX, textureY); // Box 320
		bodyModel[158] = new ModelRendererTurbo(this, 121, 89, textureX, textureY); // Box 321
		bodyModel[159] = new ModelRendererTurbo(this, 329, 65, textureX, textureY); // Box 322
		bodyModel[160] = new ModelRendererTurbo(this, 129, 89, textureX, textureY); // Box 323
		bodyModel[161] = new ModelRendererTurbo(this, 169, 89, textureX, textureY); // Box 324
		bodyModel[162] = new ModelRendererTurbo(this, 177, 89, textureX, textureY); // Box 325
		bodyModel[163] = new ModelRendererTurbo(this, 57, 89, textureX, textureY); // Box 326
		bodyModel[164] = new ModelRendererTurbo(this, 185, 89, textureX, textureY); // Box 327
		bodyModel[165] = new ModelRendererTurbo(this, 201, 89, textureX, textureY); // Box 328
		bodyModel[166] = new ModelRendererTurbo(this, 217, 89, textureX, textureY); // Box 329
		bodyModel[167] = new ModelRendererTurbo(this, 233, 89, textureX, textureY); // Box 330
		bodyModel[168] = new ModelRendererTurbo(this, 241, 89, textureX, textureY); // Box 331
		bodyModel[169] = new ModelRendererTurbo(this, 289, 89, textureX, textureY); // Box 332
		bodyModel[170] = new ModelRendererTurbo(this, 297, 89, textureX, textureY); // Box 333
		bodyModel[171] = new ModelRendererTurbo(this, 73, 89, textureX, textureY, "lamp"); // Box 334 ANE headlight r
		bodyModel[172] = new ModelRendererTurbo(this, 313, 89, textureX, textureY, "lamp"); // Box 335 ANE headlight r
		bodyModel[173] = new ModelRendererTurbo(this, 321, 89, textureX, textureY); // Box 336
		bodyModel[174] = new ModelRendererTurbo(this, 337, 89, textureX, textureY, "lamp"); // Box 337 ANE headlight f
		bodyModel[175] = new ModelRendererTurbo(this, 345, 89, textureX, textureY, "lamp"); // Box 338 ANE headlight f
		bodyModel[176] = new ModelRendererTurbo(this, 497, 89, textureX, textureY); // Box 350
		bodyModel[177] = new ModelRendererTurbo(this, 505, 89, textureX, textureY); // Box 351
		bodyModel[178] = new ModelRendererTurbo(this, 121, 97, textureX, textureY); // Box 1
		bodyModel[179] = new ModelRendererTurbo(this, 249, 97, textureX, textureY); // Box 2
		bodyModel[180] = new ModelRendererTurbo(this, 281, 89, textureX, textureY); // Box 3
		bodyModel[181] = new ModelRendererTurbo(this, 265, 97, textureX, textureY); // Box 5
		bodyModel[182] = new ModelRendererTurbo(this, 361, 89, textureX, textureY); // Box 6
		bodyModel[183] = new ModelRendererTurbo(this, 209, 81, textureX, textureY); // Box 2
		bodyModel[184] = new ModelRendererTurbo(this, 225, 81, textureX, textureY); // Box 336
		bodyModel[185] = new ModelRendererTurbo(this, 290, 100, textureX, textureY); // Box 338
		bodyModel[186] = new ModelRendererTurbo(this, 305, 98, textureX, textureY); // Box 340
		bodyModel[187] = new ModelRendererTurbo(this, 9, 81, textureX, textureY); // Box 343
		bodyModel[188] = new ModelRendererTurbo(this, 345, 61, textureX, textureY); // Box 344
		bodyModel[189] = new ModelRendererTurbo(this, 201, 105, textureX, textureY); // Box 4
		bodyModel[190] = new ModelRendererTurbo(this, 225, 105, textureX, textureY); // Box 346
		bodyModel[191] = new ModelRendererTurbo(this, 81, 49, textureX, textureY); // Box 350
		bodyModel[192] = new ModelRendererTurbo(this, 241, 81, textureX, textureY); // Box 351
		bodyModel[193] = new ModelRendererTurbo(this, 353, 81, textureX, textureY); // Box 352
		bodyModel[194] = new ModelRendererTurbo(this, 369, 81, textureX, textureY); // Box 353
		bodyModel[195] = new ModelRendererTurbo(this, 41, 105, textureX, textureY, "lamp"); // Box 359 ditchlight f
		bodyModel[196] = new ModelRendererTurbo(this, 49, 105, textureX, textureY, "cull"); // Box 360 ditchlight cull
		bodyModel[197] = new ModelRendererTurbo(this, 113, 105, textureX, textureY, "cull"); // Box 361 ditchlight cull
		bodyModel[198] = new ModelRendererTurbo(this, 245, 103, textureX, textureY, "lamp"); // Box 362 ditchlight f
		bodyModel[199] = new ModelRendererTurbo(this, 441, 105, textureX, textureY); // Box 356
		bodyModel[200] = new ModelRendererTurbo(this, 377, 89, textureX, textureY); // Box 357
		bodyModel[201] = new ModelRendererTurbo(this, 457, 105, textureX, textureY); // Box 4
		bodyModel[202] = new ModelRendererTurbo(this, 473, 105, textureX, textureY); // Box 4
		bodyModel[203] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Box 4
		bodyModel[204] = new ModelRendererTurbo(this, 329, 113, textureX, textureY); // Box 4
		bodyModel[205] = new ModelRendererTurbo(this, 377, 113, textureX, textureY); // Box 365
		bodyModel[206] = new ModelRendererTurbo(this, 17, 121, textureX, textureY); // Box 366
		bodyModel[207] = new ModelRendererTurbo(this, 185, 113, textureX, textureY); // Box 367
		bodyModel[208] = new ModelRendererTurbo(this, 241, 113, textureX, textureY); // Box 368
		bodyModel[209] = new ModelRendererTurbo(this, 129, 105, textureX, textureY); // Box 374
		bodyModel[210] = new ModelRendererTurbo(this, 201, 105, textureX, textureY); // Box 375
		bodyModel[211] = new ModelRendererTurbo(this, 225, 105, textureX, textureY); // Box 376
		bodyModel[212] = new ModelRendererTurbo(this, 313, 105, textureX, textureY); // Box 377
		bodyModel[213] = new ModelRendererTurbo(this, 377, 105, textureX, textureY); // Box 378
		bodyModel[214] = new ModelRendererTurbo(this, 385, 105, textureX, textureY); // Box 379
		bodyModel[215] = new ModelRendererTurbo(this, 425, 105, textureX, textureY); // Box 380
		bodyModel[216] = new ModelRendererTurbo(this, 293, 3, textureX, textureY); // Box 599
		bodyModel[217] = new ModelRendererTurbo(this, 351, 19, textureX, textureY); // Box 600
		bodyModel[218] = new ModelRendererTurbo(this, 35, 53, textureX, textureY, "lamp"); // Box 573 headlight f
		bodyModel[219] = new ModelRendererTurbo(this, 351, 2, textureX, textureY); // Box 574
		bodyModel[220] = new ModelRendererTurbo(this, 272, 49, textureX, textureY, "lamp"); // Box 575 headlight f
		bodyModel[221] = new ModelRendererTurbo(this, 20, 9, textureX, textureY); // Box 576
		bodyModel[222] = new ModelRendererTurbo(this, 90, 44, textureX, textureY); // Box 577
		bodyModel[223] = new ModelRendererTurbo(this, 257, 14, textureX, textureY); // Box 578
		bodyModel[224] = new ModelRendererTurbo(this, 165, 59, textureX, textureY); // Box 580
		bodyModel[225] = new ModelRendererTurbo(this, 257, 20, textureX, textureY); // Box 581
		bodyModel[226] = new ModelRendererTurbo(this, 257, 18, textureX, textureY); // Box 582
		bodyModel[227] = new ModelRendererTurbo(this, 489, 18, textureX, textureY); // Box 583
		bodyModel[228] = new ModelRendererTurbo(this, 1, 43, textureX, textureY); // Box 584
		bodyModel[229] = new ModelRendererTurbo(this, 294, 18, textureX, textureY); // Box 585
		bodyModel[230] = new ModelRendererTurbo(this, 186, 46, textureX, textureY); // Box 586
		bodyModel[231] = new ModelRendererTurbo(this, 433, 14, textureX, textureY); // Box 587
		bodyModel[232] = new ModelRendererTurbo(this, 20, 9, textureX, textureY); // Box 588
		bodyModel[233] = new ModelRendererTurbo(this, 90, 44, textureX, textureY); // Box 589
		bodyModel[234] = new ModelRendererTurbo(this, 489, 16, textureX, textureY); // Box 590
		bodyModel[235] = new ModelRendererTurbo(this, 257, 14, textureX, textureY); // Box 591
		bodyModel[236] = new ModelRendererTurbo(this, 257, 16, textureX, textureY); // Box 592
		bodyModel[237] = new ModelRendererTurbo(this, 178, 59, textureX, textureY); // Box 593
		bodyModel[238] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 594
		bodyModel[239] = new ModelRendererTurbo(this, 177, 46, textureX, textureY); // Box 595
		bodyModel[240] = new ModelRendererTurbo(this, 433, 17, textureX, textureY); // Box 596
		bodyModel[241] = new ModelRendererTurbo(this, 294, 21, textureX, textureY); // Box 597
		bodyModel[242] = new ModelRendererTurbo(this, 257, 18, textureX, textureY); // Box 598
		bodyModel[243] = new ModelRendererTurbo(this, 257, 20, textureX, textureY); // Box 599
		bodyModel[244] = new ModelRendererTurbo(this, 489, 18, textureX, textureY); // Box 600
		bodyModel[245] = new ModelRendererTurbo(this, 165, 59, textureX, textureY); // Box 601
		bodyModel[246] = new ModelRendererTurbo(this, 1, 43, textureX, textureY); // Box 602
		bodyModel[247] = new ModelRendererTurbo(this, 294, 18, textureX, textureY); // Box 603
		bodyModel[248] = new ModelRendererTurbo(this, 186, 46, textureX, textureY); // Box 604
		bodyModel[249] = new ModelRendererTurbo(this, 433, 14, textureX, textureY); // Box 605
		bodyModel[250] = new ModelRendererTurbo(this, 64, 102, textureX, textureY); // Box 607
		bodyModel[251] = new ModelRendererTurbo(this, 82, 121, textureX, textureY); // Box 608
		bodyModel[252] = new ModelRendererTurbo(this, 82, 121, textureX, textureY); // Box 609
		bodyModel[253] = new ModelRendererTurbo(this, 137, 124, textureX, textureY); // Box 610
		bodyModel[254] = new ModelRendererTurbo(this, 137, 124, textureX, textureY); // Box 611
		bodyModel[255] = new ModelRendererTurbo(this, 449, 65, textureX, textureY); // box65
		bodyModel[256] = new ModelRendererTurbo(this, 397, 72, textureX, textureY); // Box 601
		bodyModel[257] = new ModelRendererTurbo(this, 26, 26, textureX, textureY); // Box 391
		bodyModel[258] = new ModelRendererTurbo(this, 45, 25, textureX, textureY, "cull"); // Box 392 cull
		bodyModel[259] = new ModelRendererTurbo(this, 45, 25, textureX, textureY, "cull"); // Box 393 cull
		bodyModel[260] = new ModelRendererTurbo(this, 26, 26, textureX, textureY); // Box 394
		bodyModel[261] = new ModelRendererTurbo(this, 45, 25, textureX, textureY, "cull"); // Box 395 cull
		bodyModel[262] = new ModelRendererTurbo(this, 26, 26, textureX, textureY); // Box 396
		bodyModel[263] = new ModelRendererTurbo(this, 45, 25, textureX, textureY, "cull"); // Box 397 cull
		bodyModel[264] = new ModelRendererTurbo(this, 26, 26, textureX, textureY); // Box 398
		bodyModel[265] = new ModelRendererTurbo(this, 137, 81, textureX, textureY); // Box 277
		bodyModel[266] = new ModelRendererTurbo(this, 505, 105, textureX, textureY); // Box 373
		bodyModel[267] = new ModelRendererTurbo(this, 9, 154, textureX, textureY); // DBox 89
		bodyModel[268] = new ModelRendererTurbo(this, 1, 138, textureX, textureY); // DBox 91
		bodyModel[269] = new ModelRendererTurbo(this, 45, 143, textureX, textureY); // DBox 101
		bodyModel[270] = new ModelRendererTurbo(this, 62, 143, textureX, textureY); // DBox 105
		bodyModel[271] = new ModelRendererTurbo(this, 77, 143, textureX, textureY); // DBox 172
		bodyModel[272] = new ModelRendererTurbo(this, 45, 138, textureX, textureY); // DBox 173
		bodyModel[273] = new ModelRendererTurbo(this, 62, 138, textureX, textureY); // DBox 176
		bodyModel[274] = new ModelRendererTurbo(this, 77, 138, textureX, textureY); // DBox 177
		bodyModel[275] = new ModelRendererTurbo(this, 28, 138, textureX, textureY); // DBox 178
		bodyModel[276] = new ModelRendererTurbo(this, 59, 150, textureX, textureY); // DBox 179
		bodyModel[277] = new ModelRendererTurbo(this, 59, 155, textureX, textureY); // DBox 180
		bodyModel[278] = new ModelRendererTurbo(this, 28, 143, textureX, textureY); // DBox 181
		bodyModel[279] = new ModelRendererTurbo(this, 44, 155, textureX, textureY); // DBox 182
		bodyModel[280] = new ModelRendererTurbo(this, 44, 150, textureX, textureY); // DBox 183
		bodyModel[281] = new ModelRendererTurbo(this, 485, 12, textureX, textureY); // Box 402
		bodyModel[282] = new ModelRendererTurbo(this, 444, 69, textureX, textureY, "lamp"); // Box 394 ditchlight r
		bodyModel[283] = new ModelRendererTurbo(this, 235, 70, textureX, textureY); // Box 395
		bodyModel[284] = new ModelRendererTurbo(this, 444, 69, textureX, textureY, "lamp"); // Box 396 ditchlight r
		bodyModel[285] = new ModelRendererTurbo(this, 235, 70, textureX, textureY); // Box 397
		bodyModel[286] = new ModelRendererTurbo(this, 451, 101, textureX, textureY); // Box 398
		bodyModel[287] = new ModelRendererTurbo(this, 458, 101, textureX, textureY, "lamp"); // Box 399 ditchlight f
		bodyModel[288] = new ModelRendererTurbo(this, 458, 101, textureX, textureY, "lamp"); // Box 400 ditchlight f
		bodyModel[289] = new ModelRendererTurbo(this, 451, 101, textureX, textureY); // Box 401
		bodyModel[290] = new ModelRendererTurbo(this, 489, 132, textureX, textureY); // Box 75
		bodyModel[291] = new ModelRendererTurbo(this, 404, 137, textureX, textureY); // Box 76
		bodyModel[292] = new ModelRendererTurbo(this, 389, 152, textureX, textureY); // Box 401
		bodyModel[293] = new ModelRendererTurbo(this, 464, 154, textureX, textureY); // Box 402
		bodyModel[294] = new ModelRendererTurbo(this, 398, 126, textureX, textureY); // Box 403
		bodyModel[295] = new ModelRendererTurbo(this, 461, 146, textureX, textureY); // Box 404
		bodyModel[296] = new ModelRendererTurbo(this, 424, 142, textureX, textureY); // Box 405
		bodyModel[297] = new ModelRendererTurbo(this, 426, 152, textureX, textureY); // Box 406
		bodyModel[298] = new ModelRendererTurbo(this, 433, 131, textureX, textureY); // Box 407
		bodyModel[299] = new ModelRendererTurbo(this, 384, 130, textureX, textureY); // Box 408
		bodyModel[300] = new ModelRendererTurbo(this, 461, 123, textureX, textureY); // Box 409
		bodyModel[301] = new ModelRendererTurbo(this, 433, 109, textureX, textureY); // Box 410
		bodyModel[302] = new ModelRendererTurbo(this, 404, 133, textureX, textureY); // Box 411
		bodyModel[303] = new ModelRendererTurbo(this, 377, 81, textureX, textureY); // Box 299
		bodyModel[304] = new ModelRendererTurbo(this, 41, 81, textureX, textureY); // Box 300
		bodyModel[305] = new ModelRendererTurbo(this, 409, 81, textureX, textureY); // Box 301
		bodyModel[306] = new ModelRendererTurbo(this, 57, 81, textureX, textureY); // Box 302
		bodyModel[307] = new ModelRendererTurbo(this, 428, 7, textureX, textureY, "lamp"); // Box 389 commander beacon
		bodyModel[308] = new ModelRendererTurbo(this, 104, 20, textureX, textureY); // Box 390
		bodyModel[309] = new ModelRendererTurbo(this, 430, 132, textureX, textureY); // Box 429
		bodyModel[310] = new ModelRendererTurbo(this, 430, 132, textureX, textureY); // Box 430
		bodyModel[311] = new ModelRendererTurbo(this, 201, 81, textureX, textureY); // Box 278
		bodyModel[312] = new ModelRendererTurbo(this, 217, 81, textureX, textureY); // Box 279
		bodyModel[313] = new ModelRendererTurbo(this, 233, 81, textureX, textureY); // Box 280
		bodyModel[314] = new ModelRendererTurbo(this, 321, 33, textureX, textureY, "cull"); // Box 281 cull
		bodyModel[315] = new ModelRendererTurbo(this, 465, 81, textureX, textureY); // Box 307
		bodyModel[316] = new ModelRendererTurbo(this, 393, 81, textureX, textureY); // Box 308
		bodyModel[317] = new ModelRendererTurbo(this, 481, 81, textureX, textureY); // Box 309
		bodyModel[318] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 310
		bodyModel[319] = new ModelRendererTurbo(this, 423, 133, textureX, textureY); // Box 439
		bodyModel[320] = new ModelRendererTurbo(this, 473, 133, textureX, textureY); // Box 440
		bodyModel[321] = new ModelRendererTurbo(this, 406, 130, textureX, textureY); // Box 441
		bodyModel[322] = new ModelRendererTurbo(this, 485, 131, textureX, textureY); // Box 442
		bodyModel[323] = new ModelRendererTurbo(this, 429, 121, textureX, textureY); // Box 443
		bodyModel[324] = new ModelRendererTurbo(this, 441, 121, textureX, textureY); // Box 444
		bodyModel[325] = new ModelRendererTurbo(this, 473, 124, textureX, textureY); // Box 445
		bodyModel[326] = new ModelRendererTurbo(this, 485, 124, textureX, textureY); // Box 446
		bodyModel[327] = new ModelRendererTurbo(this, 16, 29, textureX, textureY); // Box 260
		bodyModel[328] = new ModelRendererTurbo(this, 13, 35, textureX, textureY); // Box 264
		bodyModel[329] = new ModelRendererTurbo(this, 1, 26, textureX, textureY); // Box 268
		bodyModel[330] = new ModelRendererTurbo(this, 13, 27, textureX, textureY); // Box 274
		bodyModel[331] = new ModelRendererTurbo(this, 122, 117, textureX, textureY); // Box 283
		bodyModel[332] = new ModelRendererTurbo(this, 109, 117, textureX, textureY); // Box 284
		bodyModel[333] = new ModelRendererTurbo(this, 109, 128, textureX, textureY); // Box 291
		bodyModel[334] = new ModelRendererTurbo(this, 122, 128, textureX, textureY); // Box 292
		bodyModel[335] = new ModelRendererTurbo(this, 122, 141, textureX, textureY); // Box 293
		bodyModel[336] = new ModelRendererTurbo(this, 109, 140, textureX, textureY); // Box 294
		bodyModel[337] = new ModelRendererTurbo(this, 112, 147, textureX, textureY); // Box 295
		bodyModel[338] = new ModelRendererTurbo(this, 121, 148, textureX, textureY); // Box 296
		bodyModel[339] = new ModelRendererTurbo(this, 386, 138, textureX, textureY); // Box 307
		bodyModel[340] = new ModelRendererTurbo(this, 388, 129, textureX, textureY); // Box 308
		bodyModel[341] = new ModelRendererTurbo(this, 387, 135, textureX, textureY); // Box 309
		bodyModel[342] = new ModelRendererTurbo(this, 387, 141, textureX, textureY); // Box 310
		bodyModel[343] = new ModelRendererTurbo(this, 383, 128, textureX, textureY); // Box 475
		bodyModel[344] = new ModelRendererTurbo(this, 380, 132, textureX, textureY); // Box 476
		bodyModel[345] = new ModelRendererTurbo(this, 461, 122, textureX, textureY, "cull"); // Box 477 support cull
		bodyModel[346] = new ModelRendererTurbo(this, 370, 141, textureX, textureY); // Box 364 prime base
		bodyModel[347] = new ModelRendererTurbo(this, 375, 145, textureX, textureY, "lamp"); // Box 6 PRIME1-1
		bodyModel[348] = new ModelRendererTurbo(this, 366, 145, textureX, textureY, "lamp"); // Box 7 PRIME1-3
		bodyModel[349] = new ModelRendererTurbo(this, 375, 149, textureX, textureY, "lamp"); // Box 8 PRIME1-2
		bodyModel[350] = new ModelRendererTurbo(this, 366, 149, textureX, textureY, "lamp"); // Box 9 PRIME1-4
		bodyModel[351] = new ModelRendererTurbo(this, 350, 127, textureX, textureY, "cull"); // Box 483 support cull
		bodyModel[352] = new ModelRendererTurbo(this, 352, 142, textureX, textureY, "lamp"); // Box 484 PRIME 2-1
		bodyModel[353] = new ModelRendererTurbo(this, 351, 146, textureX, textureY, "lamp"); // Box 485 PRIME 2-4
		bodyModel[354] = new ModelRendererTurbo(this, 351, 133, textureX, textureY, "lamp"); // Box 486 PRIME 2-3
		bodyModel[355] = new ModelRendererTurbo(this, 351, 138, textureX, textureY, "lamp"); // Box 487 PRIME 2-2
		bodyModel[356] = new ModelRendererTurbo(this, 352, 150, textureX, textureY); // Box 488 prime base
		bodyModel[357] = new ModelRendererTurbo(this, 345, 65, textureX, textureY); // Box 184 o2 generator
		bodyModel[358] = new ModelRendererTurbo(this, 354, 156, textureX, textureY); // Box 364
		bodyModel[359] = new ModelRendererTurbo(this, 371, 153, textureX, textureY); // Box 365
		bodyModel[360] = new ModelRendererTurbo(this, 379, 156, textureX, textureY); // Box 366

		bodyModel[0].addBox(0F, 0F, 0F, 22, 2, 22, 0F); // Box 7
		bodyModel[0].setRotationPoint(-31F, -5F, -11F);

		bodyModel[1].addBox(0F, 0F, 0F, 22, 2, 22, 0F); // Box 37
		bodyModel[1].setRotationPoint(9F, -5F, -11F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 18, 3, 21, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 38
		bodyModel[2].setRotationPoint(-9F, -5F, -10.5F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 39
		bodyModel[3].setRotationPoint(9F, -3F, -11F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 40
		bodyModel[4].setRotationPoint(-11F, -3F, -11F);

		bodyModel[5].addBox(0F, 0F, 0F, 11, 2, 20, 0F); // Box 42
		bodyModel[5].setRotationPoint(-2F, -2F, -10F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 11, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -2F, 0F, -0.25F, -2F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 44
		bodyModel[6].setRotationPoint(-2F, 0F, -10F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 7, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 45
		bodyModel[7].setRotationPoint(-9F, -1.5F, -10.5F);

		bodyModel[8].addBox(0F, 0F, 0F, 7, 3, 19, 0F); // Box 46
		bodyModel[8].setRotationPoint(-9F, -1.5F, -9.5F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 7, 1, 19, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, 0.5F, -1F); // Box 48
		bodyModel[9].setRotationPoint(-9F, 1.5F, -9.5F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 7, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 50
		bodyModel[10].setRotationPoint(-9F, -1.5F, 9.5F);

		bodyModel[11].addBox(0F, 0F, 0F, 42, 20, 14, 0F); // Box 51
		bodyModel[11].setRotationPoint(-11F, -25F, -7F);

		bodyModel[12].addBox(-0.5F, 0F, -0.5F, 1, 14, 4, 0F); // Box 52 door swing right
		bodyModel[12].setRotationPoint(-25.5F, -23F, -9.5F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 1, 14, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 53
		bodyModel[13].setRotationPoint(-33F, -18F, 1F);

		bodyModel[14].addBox(0F, 0F, 0F, 1, 14, 2, 0F); // Box 54
		bodyModel[14].setRotationPoint(-33F, -18F, -1F);

		bodyModel[15].addBox(0F, 0F, 0F, 6, 14, 12, 0F); // Box 55
		bodyModel[15].setRotationPoint(-32F, -18F, -6F);

		bodyModel[16].addBox(0F, 0F, 0F, 1, 2, 6, 0F); // Box 59
		bodyModel[16].setRotationPoint(-37F, -4F, -3F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 1, 7, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -5.5F, 0F, 0F, -5.5F, 0F, 0F, -5.5F, 0F, -1F, -5.5F, 0F); // Box 61
		bodyModel[17].setRotationPoint(-37F, -4F, 3F);

		bodyModel[18].addBox(0F, 0F, 0F, 1, 14, 17, 0F); // Box 70
		bodyModel[18].setRotationPoint(-12F, -23F, -10F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F); // Box 71 glow marker
		bodyModel[19].setRotationPoint(-32.5F, -17F, -5.5F);

		bodyModel[20].addBox(0F, 0F, 0F, 5, 4, 5, 0F); // Box 73
		bodyModel[20].setRotationPoint(-31F, -9F, 6F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 3, 4, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 74
		bodyModel[21].setRotationPoint(-29F, -26F, -1F);

		bodyModel[22].addBox(0F, 0F, 0F, 14, 14, 1, 0F); // Box 72
		bodyModel[22].setRotationPoint(-26F, -23F, 10F);

		bodyModel[23].addBox(0F, 0F, 0F, 6, 1, 6, 0F); // Box 78
		bodyModel[23].setRotationPoint(-10F, -26F, -3F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F); // Box 82
		bodyModel[24].setRotationPoint(6F, -27F, -1F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F); // Box 83
		bodyModel[25].setRotationPoint(8.75F, -27F, -1F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F); // Box 84
		bodyModel[26].setRotationPoint(11.25F, -27F, -1F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F); // Box 85
		bodyModel[27].setRotationPoint(14F, -27F, -1F);

		bodyModel[28].addBox(0F, 0F, 0F, 7, 8, 3, 0F); // Box 86
		bodyModel[28].setRotationPoint(-25.1F, -17F, -5F);
		bodyModel[28].rotateAngleY = -0.38397244F;

		bodyModel[29].addBox(0F, 0F, 0F, 1, 9, 10, 0F); // Box 87
		bodyModel[29].setRotationPoint(-25F, -18F, -4F);

		bodyModel[30].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 86
		bodyModel[30].setRotationPoint(-22F, -19F, -5.5F);
		bodyModel[30].rotateAngleY = -0.38397244F;

		bodyModel[31].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 87
		bodyModel[31].setRotationPoint(-24F, -18.75F, -4F);
		bodyModel[31].rotateAngleY = -0.38397244F;

		bodyModel[32].addBox(0F, 0F, 0F, 1, 17, 9, 0F); // Box 88
		bodyModel[32].setRotationPoint(-13F, -25F, -4.5F);

		bodyModel[33].addBox(0F, 0F, 0F, 1, 4, 4, 0F); // Box 90
		bodyModel[33].setRotationPoint(-11F, -9F, 7F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 1, 4, 0, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 91
		bodyModel[34].setRotationPoint(-10F, -9F, 11.01F);

		bodyModel[35].addBox(0F, 0F, 0F, 37, 8, 0, 0F); // Box 92
		bodyModel[35].setRotationPoint(-6F, -13F, 11F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 18, 1, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 93
		bodyModel[36].setRotationPoint(-9F, -5F, -11F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 18, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 94
		bodyModel[37].setRotationPoint(-9F, -1.5F, -11F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 18, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 95
		bodyModel[38].setRotationPoint(-9F, -1.5F, 10F);

		bodyModel[39].addBox(0F, 0F, 0F, 42, 8, 0, 0F); // Box 99
		bodyModel[39].setRotationPoint(-11F, -13F, -11F);

		bodyModel[40].addBox(0F, 0F, 0F, 15, 14, 1, 0F); // Box 190
		bodyModel[40].setRotationPoint(-26F, -23F, -11F);

		bodyModel[41].addBox(0F, 0F, 0F, 5, 4, 0, 0F); // Box 106
		bodyModel[41].setRotationPoint(-31F, -9F, -11.01F);

		bodyModel[42].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 69
		bodyModel[42].setRotationPoint(-22.5F, -2.5F, -2F);

		bodyModel[43].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 143
		bodyModel[43].setRotationPoint(18.5F, -2.5F, -2F);

		bodyModel[44].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 4
		bodyModel[44].setRotationPoint(-39.5F, -2F, -1.5F);

		bodyModel[45].addBox(0F, 0F, 0F, 0, 6, 20, 0F); // Box 48
		bodyModel[45].setRotationPoint(-36.01F, -4F, -10F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, 0.3F, 0F, 0F, 0.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.9F, 0F, 0F, 0F, 0F, 0F); // Box 57
		bodyModel[46].setRotationPoint(-36F, 1F, 8F);

		bodyModel[47].addBox(0F, 0F, 0F, 5, 0, 1, 0F); // Box 58
		bodyModel[47].setRotationPoint(-36F, 3F, 10F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 0, 6, 3, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 143
		bodyModel[48].setRotationPoint(-36.01F, -12F, -8F);
		bodyModel[48].rotateAngleY = -3.14159265F;

		bodyModel[49].addBox(0F, 0F, 0F, 0, 6, 1, 0F); // Box 61
		bodyModel[49].setRotationPoint(-36F, -6F, 10F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 0, 6, 3, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 62
		bodyModel[50].setRotationPoint(-36.01F, -12F, 8F);

		bodyModel[51].addBox(0F, 0F, 0F, 0, 6, 1, 0F); // Box 63
		bodyModel[51].setRotationPoint(-36F, -6F, -11F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 78
		bodyModel[52].setRotationPoint(-36F, -6F, 4.75F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 80
		bodyModel[53].setRotationPoint(-36F, -12F, -7F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0.65F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.65F, 0F, 0F, 0F, 0F, 0F); // Box 99
		bodyModel[54].setRotationPoint(-36F, -1F, 7F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0.65F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.65F, 0F, 0F, 0F, 0F, 0F); // Box 100
		bodyModel[55].setRotationPoint(-36F, -3F, 7F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 2, 3, 8, 0F,-2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 132
		bodyModel[56].setRotationPoint(-38.01F, 1F, -8F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 2, 3, 8, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -2F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 133
		bodyModel[57].setRotationPoint(-38.01F, 1F, 0F);

		bodyModel[58].addBox(0F, 0F, 0F, 72, 1, 12, 0F); // Box 184
		bodyModel[58].setRotationPoint(-36F, -3F, -6F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 1, 14, 5, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 235
		bodyModel[59].setRotationPoint(-33F, -18F, -6F);

		bodyModel[60].addBox(0F, 0F, 0F, 0, 6, 1, 0F); // Box 245
		bodyModel[60].setRotationPoint(36F, -6F, 10F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 0, 6, 3, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 246
		bodyModel[61].setRotationPoint(35.99F, -12F, 8F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 0, 6, 3, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 254
		bodyModel[62].setRotationPoint(35.99F, -12F, -8F);
		bodyModel[62].rotateAngleY = -3.14159265F;

		bodyModel[63].addBox(0F, 0F, 0F, 0, 6, 1, 0F); // Box 255
		bodyModel[63].setRotationPoint(36F, -6F, -11F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 259
		bodyModel[64].setRotationPoint(36F, -4F, -3F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -1F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 260
		bodyModel[65].setRotationPoint(36F, -4F, -5F);

		bodyModel[66].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 261
		bodyModel[66].setRotationPoint(36.5F, -2F, -1.5F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 3, 12, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 262
		bodyModel[67].setRotationPoint(31F, -25F, 1F);

		bodyModel[68].addBox(0F, 0F, 0F, 3, 21, 2, 0F); // Box 263
		bodyModel[68].setRotationPoint(31F, -25F, -1F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 3, 21, 6, 0F,0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 264
		bodyModel[69].setRotationPoint(31F, -25F, -7F);

		bodyModel[70].addBox(0F, 0F, 0F, 1, 4, 2, 0F); // Box 265
		bodyModel[70].setRotationPoint(33.5F, -23.5F, -1F);

		bodyModel[71].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 318 lantern
		bodyModel[71].setRotationPoint(-21F, -25.5F, -1F);

		bodyModel[72].addBox(0F, 0F, 0F, 6, 1, 6, 0F); // Box 319
		bodyModel[72].setRotationPoint(-3F, -26F, -3F);

		bodyModel[73].addBox(0F, 0F, 0F, 6, 1, 6, 0F); // Box 320
		bodyModel[73].setRotationPoint(16F, -26F, -3F);

		bodyModel[74].addBox(0F, 0F, 0F, 6, 1, 6, 0F); // Box 321
		bodyModel[74].setRotationPoint(23F, -26F, -3F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 11, 3, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 324
		bodyModel[75].setRotationPoint(-2F, 0F, -8F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 11, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -2F, 0F, -0.25F, -2F); // Box 325
		bodyModel[76].setRotationPoint(-2F, 0F, 8F);

		bodyModel[77].addBox(0F, 0F, 0F, 0, 2, 5, 0F); // Box 117 liveryimg 2 glow
		bodyModel[77].setRotationPoint(-26.05F, -25F, -6F);
		bodyModel[77].rotateAngleY = 0.38397244F;

		bodyModel[78].addBox(0F, 0F, -5F, 0, 2, 5, 0F); // Box 118 liveryimg 2 glow
		bodyModel[78].setRotationPoint(-26.05F, -25F, 6F);
		bodyModel[78].rotateAngleY = -0.38397244F;

		bodyModel[79].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0.25F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 124 glow marker
		bodyModel[79].setRotationPoint(-32.5F, -17F, 3.5F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 6, 1, 12, 0F,0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 125
		bodyModel[80].setRotationPoint(-32F, -19F, -6F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 259
		bodyModel[81].setRotationPoint(-32F, -4F, 7F);

		bodyModel[82].addBox(0F, 0F, 0F, 5, 1, 14, 0F); // Box 131
		bodyModel[82].setRotationPoint(-36F, -4F, -7F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 1, 6, 3, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 134
		bodyModel[83].setRotationPoint(-32F, -3F, 7F);

		bodyModel[84].addBox(0F, 0F, 0F, 0, 1, 22, 0F); // Box 135
		bodyModel[84].setRotationPoint(-36.01F, 2F, -11F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 0, 1, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 139
		bodyModel[85].setRotationPoint(-36.01F, 3F, -9F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 0F, 0F, 0.65F, 0F, 0F, 0.65F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.65F, 0F, 0F, 0.65F, 0F, 0F, 0F, 0F, 0F); // Box 275
		bodyModel[86].setRotationPoint(-36F, 2F, 9F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 141
		bodyModel[87].setRotationPoint(-36F, -2F, 7F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F); // Box 142
		bodyModel[88].setRotationPoint(-36F, 0F, 8F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 143
		bodyModel[89].setRotationPoint(-32.5F, -18.5F, -1F);

		bodyModel[90].addBox(0F, 0F, 0F, 0, 8, 1, 0F); // Box 144
		bodyModel[90].setRotationPoint(-36F, -12F, -8F);

		bodyModel[91].addBox(0F, 0F, 0F, 0, 8, 6, 0F); // Box 145
		bodyModel[91].setRotationPoint(-37.01F, -12F, -3F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F,1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 147
		bodyModel[92].setRotationPoint(-36F, -12F, 3F);

		bodyModel[93].addBox(0F, 0F, 0F, 0, 8, 1, 0F); // Box 148
		bodyModel[93].setRotationPoint(-36F, -12F, 7F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 1, 6, 3, 0F,-1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 149
		bodyModel[94].setRotationPoint(-32F, -3F, -10F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 150
		bodyModel[95].setRotationPoint(-32F, -4F, -10F);

		bodyModel[96].addBox(0F, 0F, 0F, 2, 1, 0, 0F); // Box 61
		bodyModel[96].setRotationPoint(-31.5F, -16F, -11.01F);

		bodyModel[97].addBox(0F, 0F, 0F, 0, 16, 2, 0F); // Box 81
		bodyModel[97].setRotationPoint(-31.5F, -16F, -11F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 0, 4, 1, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 81
		bodyModel[98].setRotationPoint(-31.5F, -10F, -11.5F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 4, 2, 0, 0F,0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 174
		bodyModel[99].setRotationPoint(-29.5F, -17F, -11.01F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 4, 2, 0, 0F,0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 175
		bodyModel[100].setRotationPoint(-29.5F, -17F, 11.01F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 0, 4, 1, 0F,0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 176
		bodyModel[101].setRotationPoint(-31.5F, -10F, 10.5F);

		bodyModel[102].addBox(0F, 0F, 0F, 0, 16, 2, 0F); // Box 177
		bodyModel[102].setRotationPoint(-31.5F, -16F, 9F);

		bodyModel[103].addBox(0F, 0F, 0F, 2, 1, 0, 0F); // Box 178
		bodyModel[103].setRotationPoint(-31.5F, -16F, 11.01F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 186 headlight f
		bodyModel[104].setRotationPoint(-28.75F, -26F, -1F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 187 headlight f
		bodyModel[105].setRotationPoint(-28.75F, -24F, -1F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 188
		bodyModel[106].setRotationPoint(-36F, -6F, -6.75F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 189 ditchlight f
		bodyModel[107].setRotationPoint(-36.25F, -6F, 4.75F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 190 ditchlight f
		bodyModel[108].setRotationPoint(-36.25F, -6F, -6.75F);

		bodyModel[109].addBox(0F, 0F, 0F, 1, 6, 0, 0F); // Box 191
		bodyModel[109].setRotationPoint(-30.5F, -15F, -11.01F);

		bodyModel[110].addBox(0F, 0F, 0F, 1, 6, 0, 0F); // Box 192
		bodyModel[110].setRotationPoint(-30.5F, -15F, 11.01F);

		bodyModel[111].addBox(0F, 0F, 0F, 3, 4, 5, 0F); // Box 193
		bodyModel[111].setRotationPoint(-29F, -9F, -11F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 9, 2, 1, 0F,1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -1F, 1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // box64
		bodyModel[112].setRotationPoint(-24F, -23F, 11F);
		bodyModel[112].rotateAngleX = 0.26179939F;

		bodyModel[113].addBox(0F, 0F, 0F, 5, 1, 14, 0F); // Box 204
		bodyModel[113].setRotationPoint(31F, -4F, -7F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 205
		bodyModel[114].setRotationPoint(31F, -4F, -10F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 1, 6, 3, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 206
		bodyModel[115].setRotationPoint(31F, -3F, -10F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 207
		bodyModel[116].setRotationPoint(31F, -4F, 7F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 1, 6, 3, 0F,-1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 208
		bodyModel[117].setRotationPoint(31F, -3F, 7F);

		bodyModel[118].addBox(0F, 0F, 0F, 0, 6, 20, 0F); // Box 209
		bodyModel[118].setRotationPoint(36.01F, -4F, -10F);

		bodyModel[119].addBox(0F, 0F, 0F, 0, 1, 22, 0F); // Box 210
		bodyModel[119].setRotationPoint(36.01F, 2F, -11F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 0, 1, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 211
		bodyModel[120].setRotationPoint(36.01F, 3F, -9F);

		bodyModel[121].addBox(0F, 0F, 0F, 0, 8, 6, 0F); // Box 234
		bodyModel[121].setRotationPoint(37.01F, -12F, -3F);

		bodyModel[122].addBox(0F, 0F, 0F, 0, 8, 1, 0F); // Box 235
		bodyModel[122].setRotationPoint(36F, -12F, -8F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 236
		bodyModel[123].setRotationPoint(36F, -12F, -7F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F,-1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 237
		bodyModel[124].setRotationPoint(36F, -12F, 3F);

		bodyModel[125].addBox(0F, 0F, 0F, 0, 8, 1, 0F); // Box 238
		bodyModel[125].setRotationPoint(36F, -12F, 7F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 239
		bodyModel[126].setRotationPoint(35F, -6F, -6.75F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 240 ditchlight r
		bodyModel[127].setRotationPoint(35.25F, -6F, -6.75F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 241 ditchlight r
		bodyModel[128].setRotationPoint(35.25F, -6F, 4.75F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 242
		bodyModel[129].setRotationPoint(35F, -6F, 4.75F);

		bodyModel[130].addBox(0F, 0F, 0F, 0, 13, 2, 0F); // Box 243
		bodyModel[130].setRotationPoint(31.5F, -13F, 9F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 244
		bodyModel[131].setRotationPoint(31.5F, -11F, 10.5F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 245
		bodyModel[132].setRotationPoint(31F, -13F, 11F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, 0F, -1F, 0F); // Box 246
		bodyModel[133].setRotationPoint(36F, -4F, 3F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 247 headlight r
		bodyModel[134].setRotationPoint(33.75F, -23.5F, -1F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 248 headlight r
		bodyModel[135].setRotationPoint(33.75F, -21.5F, -1F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 249
		bodyModel[136].setRotationPoint(31.5F, -11F, -11.5F);

		bodyModel[137].addBox(0F, 0F, 0F, 0, 13, 2, 0F); // Box 250
		bodyModel[137].setRotationPoint(31.5F, -13F, -11F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 251
		bodyModel[138].setRotationPoint(31F, -13F, -11F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 3, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 252
		bodyModel[139].setRotationPoint(31F, -6F, 1F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 2, 7, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 253
		bodyModel[140].setRotationPoint(32F, -13F, 1F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 1, 7, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 254
		bodyModel[141].setRotationPoint(31F, -13F, 5F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
		bodyModel[142].setRotationPoint(30.75F, -12F, 3.5F);

		bodyModel[143].addBox(0F, 0F, 0F, 1, 4, 0, 0F); // Box 43
		bodyModel[143].setRotationPoint(30.75F, -10F, 4F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 114
		bodyModel[144].setRotationPoint(3F, -23F, -8.7F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[145].setRotationPoint(3F, -24F, -8.7F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 78
		bodyModel[146].setRotationPoint(3.25F, -22.5F, -8.45F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 245
		bodyModel[147].setRotationPoint(3F, -25F, -8.5F);

		bodyModel[148].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 292
		bodyModel[148].setRotationPoint(3F, -2.5F, -11.25F);

		bodyModel[149].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 293
		bodyModel[149].setRotationPoint(3F, -2.5F, 10.25F);

		bodyModel[150].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 311
		bodyModel[150].setRotationPoint(29F, -26.5F, 5F);

		bodyModel[151].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 312
		bodyModel[151].setRotationPoint(29F, -25.5F, 5F);

		bodyModel[152].addBox(0F, 0F, 0F, 1, 14, 16, 0F); // Box 313
		bodyModel[152].setRotationPoint(-26F, -23F, -6F);

		bodyModel[153].addBox(-0.5F, 0F, -3.5F, 1, 14, 4, 0F); // Box 314 door swing right
		bodyModel[153].setRotationPoint(-11.5F, -23F, 10.5F);

		bodyModel[154].addBox(0F, 0F, 0F, 15, 4, 22, 0F); // Box 316
		bodyModel[154].setRotationPoint(-26F, -9F, -11F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 318
		bodyModel[155].setRotationPoint(-10F, -7F, 7F);

		bodyModel[156].addBox(0F, 0F, 0F, 1, 4, 0, 0F); // Box 319
		bodyModel[156].setRotationPoint(-11F, -9F, 11.01F);

		bodyModel[157].addBox(0F, 0F, 0F, 1, 1, 0, 0F); // Box 320
		bodyModel[157].setRotationPoint(-9F, -15F, 11F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 2, 3, 0, 0F,0F, 1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F); // Box 321
		bodyModel[158].setRotationPoint(-11F, -17F, 11F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 322
		bodyModel[159].setRotationPoint(-8F, -15F, 11F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 323
		bodyModel[160].setRotationPoint(3F, -23F, 7.7F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 324
		bodyModel[161].setRotationPoint(3.25F, -22.5F, 7.95F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 325
		bodyModel[162].setRotationPoint(3F, -24F, 7.7F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 326
		bodyModel[163].setRotationPoint(3F, -25F, 7F);

		bodyModel[164].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 327
		bodyModel[164].setRotationPoint(0.5F, -26.5F, -6.5F);

		bodyModel[165].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 328
		bodyModel[165].setRotationPoint(1.5F, -26.25F, -5.5F);

		bodyModel[166].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 329
		bodyModel[166].setRotationPoint(1F, -26.25F, -7.5F);

		bodyModel[167].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 330
		bodyModel[167].setRotationPoint(3F, -25.5F, -6.5F);

		bodyModel[168].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 331
		bodyModel[168].setRotationPoint(2F, -27.5F, -5.75F);

		bodyModel[169].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 332
		bodyModel[169].setRotationPoint(2F, -27.5F, -7F);

		bodyModel[170].addBox(0F, 0F, 0F, 2, 2, 4, 0F); // Box 333
		bodyModel[170].setRotationPoint(33F, -25.5F, -2F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 334 ANE headlight r
		bodyModel[171].setRotationPoint(34.25F, -25.5F, -2F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 335 ANE headlight r
		bodyModel[172].setRotationPoint(34.25F, -25.5F, 0F);

		bodyModel[173].addBox(0F, 0F, 0F, 2, 2, 4, 0F); // Box 336
		bodyModel[173].setRotationPoint(-29F, -28F, -2F);

		bodyModel[174].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 337 ANE headlight f
		bodyModel[174].setRotationPoint(-29.75F, -28F, 0F);

		bodyModel[175].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 338 ANE headlight f
		bodyModel[175].setRotationPoint(-29.75F, -28F, -2F);

		bodyModel[176].addBox(0F, 0F, 0F, 0, 4, 1, 0F); // Box 350
		bodyModel[176].setRotationPoint(-25F, -22F, -12F);

		bodyModel[177].addBox(0F, 0F, 0F, 0, 4, 1, 0F); // Box 351
		bodyModel[177].setRotationPoint(-25.01F, -22F, 11F);

		bodyModel[178].addBox(0F, 0F, 0F, 5, 5, 0, 0F); // Box 1
		bodyModel[178].setRotationPoint(-24F, -22F, 12.51F);

		bodyModel[179].addShapeBox(0F, 0F, 0F, 5, 0, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 2
		bodyModel[179].setRotationPoint(-24F, -17F, 10F);

		bodyModel[180].addShapeBox(0F, 0F, 0F, 0, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F); // Box 3
		bodyModel[180].setRotationPoint(-24F, -22F, 10F);

		bodyModel[181].addShapeBox(0F, 0F, 0F, 5, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 5
		bodyModel[181].setRotationPoint(-24F, -23F, 10.01F);

		bodyModel[182].addShapeBox(0F, 0F, 0F, 0, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F); // Box 6
		bodyModel[182].setRotationPoint(-19F, -22F, 10F);

		bodyModel[183].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[183].setRotationPoint(36F, -1.5F, -2F);

		bodyModel[184].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 336
		bodyModel[184].setRotationPoint(-37F, -1.5F, -2F);

		bodyModel[185].addBox(0F, 0F, 0F, 6, 12, 0, 0F); // Box 338
		bodyModel[185].setRotationPoint(-32.5F, -19F, -5.5F);

		bodyModel[186].addBox(0F, 0F, 0F, 2, 12, 0, 0F); // Box 340
		bodyModel[186].setRotationPoint(-32.5F, -19F, 5.5F);

		bodyModel[187].addBox(0F, 0F, 0F, 1, 2, 5, 0F); // Box 343
		bodyModel[187].setRotationPoint(-30F, -7F, -11F);

		bodyModel[188].addBox(0F, 0F, 0F, 3, 1, 0, 0F); // Box 344
		bodyModel[188].setRotationPoint(-29.5F, -19F, 5.5F);
		bodyModel[188].rotateAngleY = -0.78539816F;

		bodyModel[189].addShapeBox(0F, 0F, 0F, 5, 7, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[189].setRotationPoint(-36F, -3F, -3F);

		bodyModel[190].addShapeBox(0F, 0F, 0F, 5, 7, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); // Box 346
		bodyModel[190].setRotationPoint(31F, -3F, -3F);

		bodyModel[191].addBox(0F, 0F, 0F, 1, 0, 3, 0F); // Box 350
		bodyModel[191].setRotationPoint(-37F, -3F, -9.5F);

		bodyModel[192].addBox(0F, 0F, 0F, 1, 0, 3, 0F); // Box 351
		bodyModel[192].setRotationPoint(-37F, -3F, 6.5F);

		bodyModel[193].addBox(0F, 0F, 0F, 1, 0, 3, 0F); // Box 352
		bodyModel[193].setRotationPoint(36F, -3F, -9.5F);

		bodyModel[194].addBox(0F, 0F, 0F, 1, 0, 3, 0F); // Box 353
		bodyModel[194].setRotationPoint(36F, -3F, 6.5F);

		bodyModel[195].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 359 ditchlight f
		bodyModel[195].setRotationPoint(-37.25F, -4F, -6.75F);

		bodyModel[196].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 360 ditchlight cull
		bodyModel[196].setRotationPoint(-37F, -4F, -6.75F);

		bodyModel[197].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 361 ditchlight cull
		bodyModel[197].setRotationPoint(-37F, -4F, 4.75F);

		bodyModel[198].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 362 ditchlight f
		bodyModel[198].setRotationPoint(-37.25F, -4F, 4.75F);

		bodyModel[199].addShapeBox(0F, 0F, 0F, 1, 7, 3, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -5.5F, 0F, 0F, -5.5F, 0F, 0F, -5.5F, 0F, 0F, -5.5F, 0F); // Box 356
		bodyModel[199].setRotationPoint(-37F, -4F, -6F);

		bodyModel[200].addBox(0F, 0F, 0F, 1, 0, 3, 0F); // Box 357
		bodyModel[200].setRotationPoint(-32F, -6F, 6.5F);

		bodyModel[201].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F,0.5F, 0F, 0F, -3F, 0F, 0F, -1F, 1F, 0F, -1.5F, 1F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F); // Box 4
		bodyModel[201].setRotationPoint(-39F, 1F, 2F);

		bodyModel[202].addShapeBox(0F, 0F, 0F, 3, 2, 10, 0F,0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 1F, 0F, 0F, -3.5F, 0F, 0F, -1F, 0F, -1F, -1.5F, 0F, -1F); // Box 4
		bodyModel[202].setRotationPoint(-39F, 2F, 0F);

		bodyModel[203].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F,-2F, 1F, 0F, -0.5F, 1F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 0F, 0F, -1F, 0F, 0F); // Box 4
		bodyModel[203].setRotationPoint(-39.5F, 1F, -10F);

		bodyModel[204].addShapeBox(0F, 0F, 0F, 3, 2, 10, 0F,-2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, -1F, -1F, 0F, -1F, -3.5F, 0F, 0F, 1F, 0F, 0F); // Box 4
		bodyModel[204].setRotationPoint(-39F, 2F, -10F);

		bodyModel[205].addShapeBox(0F, 0F, 0F, 3, 2, 10, 0F,0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -1F, 0F, -1F, -1.5F, 0F, -1F, 1F, 0F, 0F, -3.5F, 0F, 0F); // Box 365
		bodyModel[205].setRotationPoint(36F, 2F, -10F);

		bodyModel[206].addShapeBox(0F, 0F, 0F, 3, 2, 10, 0F,-2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, 1F, 0F, 0F, -1.5F, 0F, -1F, -1F, 0F, -1F); // Box 366
		bodyModel[206].setRotationPoint(36F, 2F, 0F);

		bodyModel[207].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F,-3F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 1F, 0F, -1F, 1F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F); // Box 367
		bodyModel[207].setRotationPoint(36F, 1F, 2F);

		bodyModel[208].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F,-0.5F, 1F, 0F, -2F, 1F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0.5F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, -1.5F, 0F, 0F); // Box 368
		bodyModel[208].setRotationPoint(36.5F, 1F, -10F);

		bodyModel[209].addShapeBox(0F, 0F, 0F, 2, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 374
		bodyModel[209].setRotationPoint(-31F, -3F, -11F);

		bodyModel[210].addShapeBox(0F, 0F, 0F, 2, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 375
		bodyModel[210].setRotationPoint(-31F, -3F, 11F);

		bodyModel[211].addShapeBox(0F, 0F, 0F, 2, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 376
		bodyModel[211].setRotationPoint(29F, -3F, 11F);

		bodyModel[212].addShapeBox(0F, 0F, 0F, 2, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 377
		bodyModel[212].setRotationPoint(29F, -3F, -11F);

		bodyModel[213].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 378
		bodyModel[213].setRotationPoint(-34.5F, -3F, 5.3F);

		bodyModel[214].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 379
		bodyModel[214].setRotationPoint(-34.25F, -1.5F, 5.55F);

		bodyModel[215].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 380
		bodyModel[215].setRotationPoint(-34.5F, -2F, 5.3F);

		bodyModel[216].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 599
		bodyModel[216].setRotationPoint(9F, -3F, 9F);

		bodyModel[217].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 600
		bodyModel[217].setRotationPoint(-11F, -3F, 9F);

		bodyModel[218].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 573 headlight f
		bodyModel[218].setRotationPoint(-33.75F, -15F, -1F);

		bodyModel[219].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 574
		bodyModel[219].setRotationPoint(-34F, -17F, -1F);

		bodyModel[220].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 575 headlight f
		bodyModel[220].setRotationPoint(-33.75F, -17F, -1F);

		bodyModel[221].addBox(0F, 0F, 0F, 0, 6, 1, 0F); // Box 576
		bodyModel[221].setRotationPoint(-31F, -3F, -11F);

		bodyModel[222].addBox(0F, 0F, 0F, 0, 6, 1, 0F); // Box 577
		bodyModel[222].setRotationPoint(-31F, -3F, 10F);

		bodyModel[223].addShapeBox(0F, 0F, 0F, 5, 0, 1, 0F,0F, 0F, 0F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 578
		bodyModel[223].setRotationPoint(-36F, 3F, 9F);

		bodyModel[224].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, 0.9F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.9F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F); // Box 580
		bodyModel[224].setRotationPoint(-36F, 1F, -10F);

		bodyModel[225].addShapeBox(0F, 0F, 0F, 5, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, 0F, 0F, 0F, 0F, 0F); // Box 581
		bodyModel[225].setRotationPoint(-36F, 3F, -10F);

		bodyModel[226].addBox(0F, 0F, 0F, 5, 0, 1, 0F); // Box 582
		bodyModel[226].setRotationPoint(-36F, 3F, -11F);

		bodyModel[227].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 0F, 0F, 0.65F, 0F, 0F, 0.65F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.65F, 0F, 0F, 0.65F, 0F, 0F, 0F, 0F, 0F); // Box 583
		bodyModel[227].setRotationPoint(-36F, 2F, -9F);

		bodyModel[228].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F); // Box 584
		bodyModel[228].setRotationPoint(-36F, 0F, -8F);

		bodyModel[229].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, 0.65F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.65F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 585
		bodyModel[229].setRotationPoint(-36F, -1F, -9F);

		bodyModel[230].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 586
		bodyModel[230].setRotationPoint(-36F, -2F, -7F);

		bodyModel[231].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, 0.65F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.65F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 587
		bodyModel[231].setRotationPoint(-36F, -3F, -9F);

		bodyModel[232].addBox(0F, 0F, 0F, 0, 6, 1, 0F); // Box 588
		bodyModel[232].setRotationPoint(31F, -3F, -11F);

		bodyModel[233].addBox(0F, 0F, 0F, 0, 6, 1, 0F); // Box 589
		bodyModel[233].setRotationPoint(31F, -3F, 10F);

		bodyModel[234].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0.65F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.65F, 0F, 0F, 0.65F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.65F, 0F, 0F); // Box 590
		bodyModel[234].setRotationPoint(32F, 2F, 9F);

		bodyModel[235].addShapeBox(0F, 0F, 0F, 5, 0, 1, 0F,-0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 591
		bodyModel[235].setRotationPoint(31F, 3F, 9F);

		bodyModel[236].addBox(0F, 0F, 0F, 5, 0, 1, 0F); // Box 592
		bodyModel[236].setRotationPoint(31F, 3F, 10F);

		bodyModel[237].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.9F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.9F, 0F, 0F); // Box 593
		bodyModel[237].setRotationPoint(32F, 1F, 8F);

		bodyModel[238].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F); // Box 594
		bodyModel[238].setRotationPoint(32F, 0F, 8F);

		bodyModel[239].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 595
		bodyModel[239].setRotationPoint(32F, -2F, 7F);

		bodyModel[240].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.65F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.65F, 0F, 0F); // Box 596
		bodyModel[240].setRotationPoint(32F, -3F, 7F);

		bodyModel[241].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.65F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.65F, 0F, 0F); // Box 597
		bodyModel[241].setRotationPoint(32F, -1F, 7F);

		bodyModel[242].addBox(0F, 0F, 0F, 5, 0, 1, 0F); // Box 598
		bodyModel[242].setRotationPoint(31F, 3F, -11F);

		bodyModel[243].addShapeBox(0F, 0F, 0F, 5, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, 0F, 0F); // Box 599
		bodyModel[243].setRotationPoint(31F, 3F, -10F);

		bodyModel[244].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0.65F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.65F, 0F, 0F, 0.65F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.65F, 0F, 0F); // Box 600
		bodyModel[244].setRotationPoint(32F, 2F, -9F);

		bodyModel[245].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F); // Box 601
		bodyModel[245].setRotationPoint(32F, 1F, -10F);

		bodyModel[246].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F); // Box 602
		bodyModel[246].setRotationPoint(32F, 0F, -8F);

		bodyModel[247].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0.65F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.65F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 603
		bodyModel[247].setRotationPoint(32F, -1F, -9F);

		bodyModel[248].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 604
		bodyModel[248].setRotationPoint(32F, -2F, -7F);

		bodyModel[249].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0.65F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.65F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 605
		bodyModel[249].setRotationPoint(32F, -3F, -9F);

		bodyModel[250].addBox(0F, 0F, 0F, 1, 7, 2, 0F); // Box 607
		bodyModel[250].setRotationPoint(31F, -13F, 1F);

		bodyModel[251].addBox(0F, 0F, 0F, 9, 4, 1, 0F); // Box 608
		bodyModel[251].setRotationPoint(-10F, -24F, -7.25F);

		bodyModel[252].addBox(0F, 0F, 0F, 9, 4, 1, 0F); // Box 609
		bodyModel[252].setRotationPoint(-10F, -24F, 6.25F);

		bodyModel[253].addBox(0F, 0F, 0F, 13, 4, 1, 0F); // Box 610
		bodyModel[253].setRotationPoint(17F, -24F, 6.25F);

		bodyModel[254].addBox(0F, 0F, 0F, 13, 4, 1, 0F); // Box 611
		bodyModel[254].setRotationPoint(17F, -24F, -7.25F);

		bodyModel[255].addShapeBox(0F, 0F, 0F, 9, 2, 1, 0F,1F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // box65
		bodyModel[255].setRotationPoint(-24F, -23.25F, -11.97F);
		bodyModel[255].rotateAngleX = -0.26179939F;

		bodyModel[256].addBox(0F, 0F, 0F, 1, 7, 0, 0F); // Box 601
		bodyModel[256].setRotationPoint(33.25F, -13F, 2.75F);

		bodyModel[257].addBox(0F, 0F, 0F, 2, 1, 6, 0F); // Box 391
		bodyModel[257].setRotationPoint(5.5F, -27.5F, -3F);

		bodyModel[258].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F,-0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 392 cull
		bodyModel[258].setRotationPoint(5.5F, -29.5F, -3F);

		bodyModel[259].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F,-0.5F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 393 cull
		bodyModel[259].setRotationPoint(13.5F, -29.5F, -3F);

		bodyModel[260].addBox(0F, 0F, 0F, 2, 1, 6, 0F); // Box 394
		bodyModel[260].setRotationPoint(13.5F, -27.5F, -3F);

		bodyModel[261].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F,-0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 395 cull
		bodyModel[261].setRotationPoint(10.75F, -29.5F, -3F);

		bodyModel[262].addBox(0F, 0F, 0F, 2, 1, 6, 0F); // Box 396
		bodyModel[262].setRotationPoint(10.75F, -27.5F, -3F);

		bodyModel[263].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F,-0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 397 cull
		bodyModel[263].setRotationPoint(8.25F, -29.5F, -3F);

		bodyModel[264].addBox(0F, 0F, 0F, 2, 1, 6, 0F); // Box 398
		bodyModel[264].setRotationPoint(8.25F, -27.5F, -3F);

		bodyModel[265].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 277
		bodyModel[265].setRotationPoint(-37F, -8F, -5F);

		bodyModel[266].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 373
		bodyModel[266].setRotationPoint(36.5F, -8F, 3F);

		bodyModel[267].addShapeBox(0F, 0F, 0F, 6, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // DBox 89
		bodyModel[267].setRotationPoint(7.5F, -26.5F, -3F);

		bodyModel[268].addBox(0F, 0F, 0F, 6, 1, 14, 0F); // DBox 91
		bodyModel[268].setRotationPoint(7.5F, -26F, -7F);

		bodyModel[269].addShapeBox(0F, 0F, 0F, 6, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // DBox 101
		bodyModel[269].setRotationPoint(7.5F, -24F, 7F);

		bodyModel[270].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1.5F, -2F); // DBox 105
		bodyModel[270].setRotationPoint(4.5F, -24F, 7F);

		bodyModel[271].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, -2F, 0F, 0F, -1F); // DBox 172
		bodyModel[271].setRotationPoint(13.5F, -24F, 7F);

		bodyModel[272].addShapeBox(0F, 0F, 0F, 6, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // DBox 173
		bodyModel[272].setRotationPoint(7.5F, -26F, 7F);

		bodyModel[273].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // DBox 176
		bodyModel[273].setRotationPoint(4.5F, -26F, 7F);

		bodyModel[274].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -2F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F); // DBox 177
		bodyModel[274].setRotationPoint(13.5F, -26F, 7F);

		bodyModel[275].addShapeBox(0F, 0F, 0F, 6, 2, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // DBox 178
		bodyModel[275].setRotationPoint(7.5F, -26F, -9F);

		bodyModel[276].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, -1F, 0F, 0F, -1F, -2F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // DBox 179
		bodyModel[276].setRotationPoint(13.5F, -26F, -9F);

		bodyModel[277].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1.5F, -2F, 0F, -1.5F, 0F, 0F, 0F, 0F); // DBox 180
		bodyModel[277].setRotationPoint(13.5F, -24F, -9F);

		bodyModel[278].addShapeBox(0F, 0F, 0F, 6, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // DBox 181
		bodyModel[278].setRotationPoint(7.5F, -24F, -9F);

		bodyModel[279].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1.5F, 0F); // DBox 182
		bodyModel[279].setRotationPoint(4.5F, -24F, -9F);

		bodyModel[280].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, -1F, -2F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // DBox 183
		bodyModel[280].setRotationPoint(4.5F, -26F, -9F);

		bodyModel[281].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 402
		bodyModel[281].setRotationPoint(30.5F, -25.5F, -1F);

		bodyModel[282].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 394 ditchlight r
		bodyModel[282].setRotationPoint(35.75F, -3F, -5.75F);

		bodyModel[283].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 395
		bodyModel[283].setRotationPoint(35.5F, -3F, -5.75F);

		bodyModel[284].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 396 ditchlight r
		bodyModel[284].setRotationPoint(35.75F, -3F, 3.75F);

		bodyModel[285].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 397
		bodyModel[285].setRotationPoint(35.5F, -3F, 3.75F);

		bodyModel[286].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 398
		bodyModel[286].setRotationPoint(-36.5F, -2.25F, 2.75F);

		bodyModel[287].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 399 ditchlight f
		bodyModel[287].setRotationPoint(-36.75F, -2.25F, 2.75F);

		bodyModel[288].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 400 ditchlight f
		bodyModel[288].setRotationPoint(-36.75F, -2.25F, -4.75F);

		bodyModel[289].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 401
		bodyModel[289].setRotationPoint(-36.5F, -2.25F, -4.75F);

		bodyModel[290].addShapeBox(0F, 0F, 0F, 2, 2, 5, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 75
		bodyModel[290].setRotationPoint(-28F, -25F, -6F);

		bodyModel[291].addShapeBox(0F, 0F, 0F, 2, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 76
		bodyModel[291].setRotationPoint(-28F, -25F, 1F);

		bodyModel[292].addShapeBox(0F, 0F, 0F, 15, 1, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 401
		bodyModel[292].setRotationPoint(-26F, -24F, -11F);

		bodyModel[293].addShapeBox(0F, 0F, 0F, 15, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 402
		bodyModel[293].setRotationPoint(-26F, -24F, 10F);

		bodyModel[294].addShapeBox(0F, 0F, 0F, 13, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 403
		bodyModel[294].setRotationPoint(-25F, -25F, 8F);

		bodyModel[295].addShapeBox(0F, 0F, 0F, 13, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 404
		bodyModel[295].setRotationPoint(-25F, -26F, 4F);

		bodyModel[296].addShapeBox(0F, 0F, 0F, 13, 1, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 405
		bodyModel[296].setRotationPoint(-25F, -26F, -8F);

		bodyModel[297].addShapeBox(0F, 0F, 0F, 13, 1, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 406
		bodyModel[297].setRotationPoint(-25F, -25F, -10F);

		bodyModel[298].addBox(0F, 0F, 0F, 15, 1, 8, 0F); // Box 407
		bodyModel[298].setRotationPoint(-26F, -26F, -4F);

		bodyModel[299].addBox(0F, 0F, 0F, 1, 1, 16, 0F); // Box 408
		bodyModel[299].setRotationPoint(-26F, -25F, -8F);

		bodyModel[300].addBox(0F, 0F, 0F, 1, 1, 20, 0F); // Box 409
		bodyModel[300].setRotationPoint(-26F, -24F, -10F);

		bodyModel[301].addBox(0F, 0F, 0F, 1, 1, 20, 0F); // Box 410
		bodyModel[301].setRotationPoint(-12F, -24F, -10F);

		bodyModel[302].addBox(0F, 0F, 0F, 1, 1, 16, 0F); // Box 411
		bodyModel[302].setRotationPoint(-12F, -25F, -8F);

		bodyModel[303].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 299
		bodyModel[303].setRotationPoint(-20F, -27F, -8F);

		bodyModel[304].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 300
		bodyModel[304].setRotationPoint(-20F, -26F, -8F);

		bodyModel[305].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 301
		bodyModel[305].setRotationPoint(-20F, -27F, 7F);

		bodyModel[306].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 302
		bodyModel[306].setRotationPoint(-18F, -26F, 7F);

		bodyModel[307].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 389 commander beacon
		bodyModel[307].setRotationPoint(-25F, -27F, -0.5F);

		bodyModel[308].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0.3F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, 0.3F, -0.5F, 0.1F, 0.3F, 0F, 0.1F, -1F, 0F, 0.1F, -1F, 0F, 0.1F, 0.3F, 0F, 0.1F); // Box 390
		bodyModel[308].setRotationPoint(-24.85F, -27F, -0.5F);

		bodyModel[309].addBox(0F, 0F, 0F, 3, 3, 1, 0F); // Box 429
		bodyModel[309].setRotationPoint(2F, -4.5F, -11F);

		bodyModel[310].addBox(0F, 0F, 0F, 3, 3, 1, 0F); // Box 430
		bodyModel[310].setRotationPoint(2F, -4.5F, 10F);

		bodyModel[311].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 278
		bodyModel[311].setRotationPoint(-29F, -28F, -1.5F);

		bodyModel[312].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 279
		bodyModel[312].setRotationPoint(-28F, -28F, -0.5F);

		bodyModel[313].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 280
		bodyModel[313].setRotationPoint(-30F, -28F, 0.5F);

		bodyModel[314].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 281 cull
		bodyModel[314].setRotationPoint(-27F, -27F, -0.5F);

		bodyModel[315].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 307
		bodyModel[315].setRotationPoint(-27F, -27.5F, 6F);

		bodyModel[316].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 308
		bodyModel[316].setRotationPoint(-25F, -26.5F, 5F);

		bodyModel[317].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 309
		bodyModel[317].setRotationPoint(-25F, -27.5F, 5F);

		bodyModel[318].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 310
		bodyModel[318].setRotationPoint(-26F, -27.5F, 4F);

		bodyModel[319].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 439
		bodyModel[319].setRotationPoint(-26F, -26F, -8F);

		bodyModel[320].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 440
		bodyModel[320].setRotationPoint(-26F, -25F, -10F);

		bodyModel[321].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 441
		bodyModel[321].setRotationPoint(-12F, -26F, -8F);

		bodyModel[322].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 442
		bodyModel[322].setRotationPoint(-12F, -25F, -10F);

		bodyModel[323].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 443
		bodyModel[323].setRotationPoint(-12F, -26F, 4F);

		bodyModel[324].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 444
		bodyModel[324].setRotationPoint(-26F, -26F, 4F);

		bodyModel[325].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 445
		bodyModel[325].setRotationPoint(-26F, -25F, 8F);

		bodyModel[326].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 446
		bodyModel[326].setRotationPoint(-12F, -25F, 8F);

		bodyModel[327].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -1F, 0F, -0.5F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 260
		bodyModel[327].setRotationPoint(-19F, -33F, 6F);

		bodyModel[328].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 264
		bodyModel[328].setRotationPoint(-19F, -33F, 8F);

		bodyModel[329].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0F, 0F, -1F, -1.5F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -2F); // Box 268
		bodyModel[329].setRotationPoint(-19F, -32F, 5F);

		bodyModel[330].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 1F, 0F, 0.5F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 274
		bodyModel[330].setRotationPoint(-19F, -32F, 8F);

		bodyModel[331].addShapeBox(0F, 0F, 0F, 3, 7, 3, 0F,0F, 0F, -2F, -1F, 0F, -0.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 1F, -2F, -0.5F, -2F, 0F, 1F, 0F, 0F, 1F); // Box 283
		bodyModel[331].setRotationPoint(-19F, -30F, 7F);

		bodyModel[332].addShapeBox(0F, 0F, 0F, 3, 7, 3, 0F,0F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -2F, 0F, -3F, 1F, -2F, -3F, 1F, 1F, -2F, -0.5F, 0F, -3F, -3F); // Box 284
		bodyModel[332].setRotationPoint(-19F, -30F, 5F);

		bodyModel[333].addShapeBox(0F, 0F, 0F, 3, 7, 3, 0F,0F, 0F, -2F, -1F, 0F, -0.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -3F, 1F, -2F, -0.5F, -2F, -3F, 1F, 0F, -3F, 1F); // Box 291
		bodyModel[333].setRotationPoint(-19F, -30F, -8F);

		bodyModel[334].addShapeBox(0F, 0F, 0F, 3, 7, 3, 0F,0F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, 1F, -2F, 0F, 1F, 1F, -2F, -0.5F, 0F, 0F, -3F); // Box 292
		bodyModel[334].setRotationPoint(-19F, -30F, -10F);

		bodyModel[335].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 1F, 0F, 0.5F, 0F, 0F, -1F); // Box 293
		bodyModel[335].setRotationPoint(-19F, -32F, -9F);

		bodyModel[336].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 294
		bodyModel[336].setRotationPoint(-19F, -32F, -8F);

		bodyModel[337].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, -1F, 0F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 295
		bodyModel[337].setRotationPoint(-19F, -33F, -8F);

		bodyModel[338].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, 0F, -0.5F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 296
		bodyModel[338].setRotationPoint(-19F, -33F, -9F);

		bodyModel[339].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 307
		bodyModel[339].setRotationPoint(-16F, -27.75F, 0.5F);

		bodyModel[340].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 308
		bodyModel[340].setRotationPoint(-14F, -27F, -1.5F);

		bodyModel[341].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 309
		bodyModel[341].setRotationPoint(-17F, -28F, -0.5F);

		bodyModel[342].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 310
		bodyModel[342].setRotationPoint(-16F, -27.75F, -1.5F);

		bodyModel[343].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 475
		bodyModel[343].setRotationPoint(-15F, -27.5F, 1.5F);

		bodyModel[344].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 476
		bodyModel[344].setRotationPoint(-15F, -27.5F, -2.5F);

		bodyModel[345].addBox(0F, 0F, 0F, 2, 2, 3, 0F); // Box 477 support cull
		bodyModel[345].setRotationPoint(-24F, -26F, -9F);

		bodyModel[346].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 364 prime base
		bodyModel[346].setRotationPoint(-24F, -27F, -8.5F);

		bodyModel[347].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F); // Box 6 PRIME1-1
		bodyModel[347].setRotationPoint(-24F, -27.5F, -8.5F);

		bodyModel[348].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F); // Box 7 PRIME1-3
		bodyModel[348].setRotationPoint(-24F, -27.5F, -8.5F);

		bodyModel[349].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 8 PRIME1-2
		bodyModel[349].setRotationPoint(-24F, -27.5F, -8.5F);

		bodyModel[350].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 9 PRIME1-4
		bodyModel[350].setRotationPoint(-24F, -27.5F, -8.5F);

		bodyModel[351].addBox(0F, 0F, 0F, 3, 2, 2, 0F); // Box 483 support cull
		bodyModel[351].setRotationPoint(-23.5F, -28F, -1F);

		bodyModel[352].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F); // Box 484 PRIME 2-1
		bodyModel[352].setRotationPoint(-23F, -29.5F, -1F);

		bodyModel[353].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 485 PRIME 2-4
		bodyModel[353].setRotationPoint(-23F, -29.5F, -1F);

		bodyModel[354].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F); // Box 486 PRIME 2-3
		bodyModel[354].setRotationPoint(-23F, -29.5F, -1F);

		bodyModel[355].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 487 PRIME 2-2
		bodyModel[355].setRotationPoint(-23F, -29.5F, -1F);

		bodyModel[356].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 488 prime base
		bodyModel[356].setRotationPoint(-23F, -29F, -1F);

		bodyModel[357].addBox(0F, 0F, 0F, 5, 2, 6, 0F); // Box 184 o2 generator
		bodyModel[357].setRotationPoint(-19.5F, -27.75F, -3F);

		bodyModel[358].addBox(0F, 0F, 0F, 6, 2, 4, 0F); // Box 364
		bodyModel[358].setRotationPoint(-18.5F, -28F, -1F);

		bodyModel[359].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 365
		bodyModel[359].setRotationPoint(-19.5F, -28F, -1F);

		bodyModel[360].addBox(0F, 0F, 0F, 1, 1, 4, 0F); // Box 366
		bodyModel[360].setRotationPoint(-19.5F, -27F, -1F);
	}
	ModelBapBlombergB theTrucks2 = new ModelBapBlombergB();
	ModelTypeB theTrucks3 = new ModelTypeB();
	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		for (int i = 0; i < 361; i++) {
			if (bodyModel[i].boxName != null && bodyModel[i].boxName.contains("lamp") ) {
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
		if (entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor() == 11||entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor() == 4) {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/blombergB_Grey.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.28, -0.15, 0);
			theTrucks2.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(2.55, 0, 0);
			theTrucks2.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else if (entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor() == 14) {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/blombergB_DarkerGrey.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.28, -0.15, 0);
			theTrucks2.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(2.55, 0, 0);
			theTrucks2.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else if (entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor() == 12344) {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/typeb_Black.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.3, -0.01, 0);
			theTrucks3.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(2.57, 0, 0);
			theTrucks3.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/blombergB_Black.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.28, -0.15, 0);
			theTrucks2.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(2.55, 0, 0);
			theTrucks2.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		}
	}
}