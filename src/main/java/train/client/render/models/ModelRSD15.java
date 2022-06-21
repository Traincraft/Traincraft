//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2021 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 01.07.2021 - 17:42:53
// Last changed on: 01.07.2021 - 17:42:53

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

public class ModelRSD15 extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelRSD15() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[458];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 324, 330, textureX, textureY); // Box 502
		bodyModel[1] = new ModelRendererTurbo(this, 385, 3, textureX, textureY); // Box 504
		bodyModel[2] = new ModelRendererTurbo(this, 342, 300, textureX, textureY); // Box 156
		bodyModel[3] = new ModelRendererTurbo(this, 315, 307, textureX, textureY); // Box 157
		bodyModel[4] = new ModelRendererTurbo(this, 366, 299, textureX, textureY); // Box 160
		bodyModel[5] = new ModelRendererTurbo(this, 368, 283, textureX, textureY); // Box 161
		bodyModel[6] = new ModelRendererTurbo(this, 293, 424, textureX, textureY); // Box 52
		bodyModel[7] = new ModelRendererTurbo(this, 16, 16, textureX, textureY); // Box 4
		bodyModel[8] = new ModelRendererTurbo(this, 314, 410, textureX, textureY); // Box 206
		bodyModel[9] = new ModelRendererTurbo(this, 314, 295, textureX, textureY); // Box 25
		bodyModel[10] = new ModelRendererTurbo(this, 312, 286, textureX, textureY); // Box 26
		bodyModel[11] = new ModelRendererTurbo(this, 341, 284, textureX, textureY); // Box 27
		bodyModel[12] = new ModelRendererTurbo(this, 388, 215, textureX, textureY); // Box 28
		bodyModel[13] = new ModelRendererTurbo(this, 141, 453, textureX, textureY); // Box 29
		bodyModel[14] = new ModelRendererTurbo(this, 346, 325, textureX, textureY); // Box 30
		bodyModel[15] = new ModelRendererTurbo(this, 345, 315, textureX, textureY); // Box 26
		bodyModel[16] = new ModelRendererTurbo(this, 345, 335, textureX, textureY); // Box 32
		bodyModel[17] = new ModelRendererTurbo(this, 246, 338, textureX, textureY); // Box 29
		bodyModel[18] = new ModelRendererTurbo(this, 247, 355, textureX, textureY); // Box 32
		bodyModel[19] = new ModelRendererTurbo(this, 65, 349, textureX, textureY); // Box 135
		bodyModel[20] = new ModelRendererTurbo(this, 66, 340, textureX, textureY); // Box 57
		bodyModel[21] = new ModelRendererTurbo(this, 77, 159, textureX, textureY); // Box 58
		bodyModel[22] = new ModelRendererTurbo(this, 316, 339, textureX, textureY); // Box 406
		bodyModel[23] = new ModelRendererTurbo(this, 359, 350, textureX, textureY); // Box 409
		bodyModel[24] = new ModelRendererTurbo(this, 318, 347, textureX, textureY); // Box 410
		bodyModel[25] = new ModelRendererTurbo(this, 1, 193, textureX, textureY); // Box 412
		bodyModel[26] = new ModelRendererTurbo(this, 429, 211, textureX, textureY); // Box 413
		bodyModel[27] = new ModelRendererTurbo(this, 339, 347, textureX, textureY); // Box 415
		bodyModel[28] = new ModelRendererTurbo(this, 15, 190, textureX, textureY); // Box 416
		bodyModel[29] = new ModelRendererTurbo(this, 158, 100, textureX, textureY); // Box 428
		bodyModel[30] = new ModelRendererTurbo(this, 300, 344, textureX, textureY); // Box 315 door swing right
		bodyModel[31] = new ModelRendererTurbo(this, 73, 186, textureX, textureY); // Box 706
		bodyModel[32] = new ModelRendererTurbo(this, 127, 346, textureX, textureY); // Box 278
		bodyModel[33] = new ModelRendererTurbo(this, 486, 212, textureX, textureY); // Box 129
		bodyModel[34] = new ModelRendererTurbo(this, 127, 339, textureX, textureY); // Box 130
		bodyModel[35] = new ModelRendererTurbo(this, 79, 81, textureX, textureY); // Box 132
		bodyModel[36] = new ModelRendererTurbo(this, 480, 192, textureX, textureY); // Box 405
		bodyModel[37] = new ModelRendererTurbo(this, 7, 187, textureX, textureY); // Box 417
		bodyModel[38] = new ModelRendererTurbo(this, 1, 187, textureX, textureY); // Box 705
		bodyModel[39] = new ModelRendererTurbo(this, 77, 186, textureX, textureY); // Box 57
		bodyModel[40] = new ModelRendererTurbo(this, 107, 243, textureX, textureY); // Box 432
		bodyModel[41] = new ModelRendererTurbo(this, 143, 245, textureX, textureY); // Box 439
		bodyModel[42] = new ModelRendererTurbo(this, 120, 245, textureX, textureY); // Box 440
		bodyModel[43] = new ModelRendererTurbo(this, 9, 350, textureX, textureY); // Box 95
		bodyModel[44] = new ModelRendererTurbo(this, 82, 338, textureX, textureY); // Box 563
		bodyModel[45] = new ModelRendererTurbo(this, 139, 337, textureX, textureY); // Box 74
		bodyModel[46] = new ModelRendererTurbo(this, 8, 467, textureX, textureY); // Box 75
		bodyModel[47] = new ModelRendererTurbo(this, 19, 439, textureX, textureY); // Box 76
		bodyModel[48] = new ModelRendererTurbo(this, 19, 424, textureX, textureY); // Box 77
		bodyModel[49] = new ModelRendererTurbo(this, 20, 432, textureX, textureY); // Box 78
		bodyModel[50] = new ModelRendererTurbo(this, 207, 335, textureX, textureY); // Box 79
		bodyModel[51] = new ModelRendererTurbo(this, 439, 318, textureX, textureY); // Box 80
		bodyModel[52] = new ModelRendererTurbo(this, 416, 305, textureX, textureY); // Box 81
		bodyModel[53] = new ModelRendererTurbo(this, 414, 343, textureX, textureY); // Box 82
		bodyModel[54] = new ModelRendererTurbo(this, 435, 303, textureX, textureY); // Box 83
		bodyModel[55] = new ModelRendererTurbo(this, 436, 291, textureX, textureY); // Box 84
		bodyModel[56] = new ModelRendererTurbo(this, 416, 296, textureX, textureY); // Box 85
		bodyModel[57] = new ModelRendererTurbo(this, 439, 324, textureX, textureY); // Box 86
		bodyModel[58] = new ModelRendererTurbo(this, 414, 317, textureX, textureY); // Box 87
		bodyModel[59] = new ModelRendererTurbo(this, 435, 310, textureX, textureY); // Box 88
		bodyModel[60] = new ModelRendererTurbo(this, 215, 419, textureX, textureY); // Box 89
		bodyModel[61] = new ModelRendererTurbo(this, 252, 421, textureX, textureY); // Box 90
		bodyModel[62] = new ModelRendererTurbo(this, 465, 358, textureX, textureY); // Box 6
		bodyModel[63] = new ModelRendererTurbo(this, 29, 297, textureX, textureY); // Box 228
		bodyModel[64] = new ModelRendererTurbo(this, 135, 84, textureX, textureY); // Box 682
		bodyModel[65] = new ModelRendererTurbo(this, 143, 85, textureX, textureY); // Box 709
		bodyModel[66] = new ModelRendererTurbo(this, 435, 228, textureX, textureY); // Box 99
		bodyModel[67] = new ModelRendererTurbo(this, 127, 379, textureX, textureY); // Box 224
		bodyModel[68] = new ModelRendererTurbo(this, 12, 23, textureX, textureY); // Box 275
		bodyModel[69] = new ModelRendererTurbo(this, 237, 388, textureX, textureY); // Box 723
		bodyModel[70] = new ModelRendererTurbo(this, 164, 391, textureX, textureY); // Box 724
		bodyModel[71] = new ModelRendererTurbo(this, 125, 389, textureX, textureY); // Box 107
		bodyModel[72] = new ModelRendererTurbo(this, 161, 377, textureX, textureY); // Box 108
		bodyModel[73] = new ModelRendererTurbo(this, 237, 396, textureX, textureY); // Box 109
		bodyModel[74] = new ModelRendererTurbo(this, 195, 378, textureX, textureY); // Box 110
		bodyModel[75] = new ModelRendererTurbo(this, 207, 381, textureX, textureY); // Box 111
		bodyModel[76] = new ModelRendererTurbo(this, 24, 380, textureX, textureY); // Box 112
		bodyModel[77] = new ModelRendererTurbo(this, 24, 393, textureX, textureY); // Box 113
		bodyModel[78] = new ModelRendererTurbo(this, 137, 120, textureX, textureY); // Box 8
		bodyModel[79] = new ModelRendererTurbo(this, 0, 27, textureX, textureY); // Box 13
		bodyModel[80] = new ModelRendererTurbo(this, 0, 25, textureX, textureY); // Box 14
		bodyModel[81] = new ModelRendererTurbo(this, 1, 23, textureX, textureY); // Box 18
		bodyModel[82] = new ModelRendererTurbo(this, 1, 21, textureX, textureY); // Box 20
		bodyModel[83] = new ModelRendererTurbo(this, 367, 213, textureX, textureY); // Box 21
		bodyModel[84] = new ModelRendererTurbo(this, 385, 215, textureX, textureY); // Box 28
		bodyModel[85] = new ModelRendererTurbo(this, 18, 2, textureX, textureY); // Box 277
		bodyModel[86] = new ModelRendererTurbo(this, 17, 4, textureX, textureY); // Box 278
		bodyModel[87] = new ModelRendererTurbo(this, 17, 6, textureX, textureY); // Box 279
		bodyModel[88] = new ModelRendererTurbo(this, 93, 95, textureX, textureY); // Box 153
		bodyModel[89] = new ModelRendererTurbo(this, 156, 167, textureX, textureY); // Box 155
		bodyModel[90] = new ModelRendererTurbo(this, 140, 234, textureX, textureY); // Box 156
		bodyModel[91] = new ModelRendererTurbo(this, 206, 390, textureX, textureY); // Box 157
		bodyModel[92] = new ModelRendererTurbo(this, 378, 455, textureX, textureY); // Box 159
		bodyModel[93] = new ModelRendererTurbo(this, 394, 497, textureX, textureY); // Box 160
		bodyModel[94] = new ModelRendererTurbo(this, 370, 486, textureX, textureY); // Box 161
		bodyModel[95] = new ModelRendererTurbo(this, 396, 487, textureX, textureY); // Box 162
		bodyModel[96] = new ModelRendererTurbo(this, 372, 499, textureX, textureY); // Box 163
		bodyModel[97] = new ModelRendererTurbo(this, 397, 477, textureX, textureY); // Box 164
		bodyModel[98] = new ModelRendererTurbo(this, 374, 476, textureX, textureY); // Box 165
		bodyModel[99] = new ModelRendererTurbo(this, 316, 387, textureX, textureY); // Box 179
		bodyModel[100] = new ModelRendererTurbo(this, 17, 8, textureX, textureY); // Box 168
		bodyModel[101] = new ModelRendererTurbo(this, 5, 224, textureX, textureY); // Box 178
		bodyModel[102] = new ModelRendererTurbo(this, 60, 244, textureX, textureY); // Box 173
		bodyModel[103] = new ModelRendererTurbo(this, 17, 354, textureX, textureY); // Box 174
		bodyModel[104] = new ModelRendererTurbo(this, 101, 285, textureX, textureY); // Box 175
		bodyModel[105] = new ModelRendererTurbo(this, 72, 3, textureX, textureY); // Box 176
		bodyModel[106] = new ModelRendererTurbo(this, 159, 53, textureX, textureY); // Box 177
		bodyModel[107] = new ModelRendererTurbo(this, 494, 233, textureX, textureY); // Box 186
		bodyModel[108] = new ModelRendererTurbo(this, 151, 85, textureX, textureY); // Box 187
		bodyModel[109] = new ModelRendererTurbo(this, 427, 203, textureX, textureY); // Box 188
		bodyModel[110] = new ModelRendererTurbo(this, 468, 181, textureX, textureY); // Box 189
		bodyModel[111] = new ModelRendererTurbo(this, 374, 212, textureX, textureY); // Box 192
		bodyModel[112] = new ModelRendererTurbo(this, 87, 186, textureX, textureY); // Box 193
		bodyModel[113] = new ModelRendererTurbo(this, 123, 95, textureX, textureY); // Box 194
		bodyModel[114] = new ModelRendererTurbo(this, 275, 343, textureX, textureY); // Box 195
		bodyModel[115] = new ModelRendererTurbo(this, 274, 348, textureX, textureY); // Box 196
		bodyModel[116] = new ModelRendererTurbo(this, 124, 246, textureX, textureY); // Box 199
		bodyModel[117] = new ModelRendererTurbo(this, 137, 247, textureX, textureY); // Box 200
		bodyModel[118] = new ModelRendererTurbo(this, 137, 243, textureX, textureY); // Box 201
		bodyModel[119] = new ModelRendererTurbo(this, 119, 242, textureX, textureY); // Box 202
		bodyModel[120] = new ModelRendererTurbo(this, 60, 179, textureX, textureY, "lamp"); // SP cab headlight
		bodyModel[121] = new ModelRendererTurbo(this, 146, 107, textureX, textureY, "lamp"); // SP cab headligh
		bodyModel[122] = new ModelRendererTurbo(this, 387, 221, textureX, textureY, "lamp"); // cab headlight botm
		bodyModel[123] = new ModelRendererTurbo(this, 145, 116, textureX, textureY, "lamp"); // cab headlight top
		bodyModel[124] = new ModelRendererTurbo(this, 154, 200, textureX, textureY, "lamp"); // long hood headlight botm
		bodyModel[125] = new ModelRendererTurbo(this, 178, 85, textureX, textureY, "lamp"); // long hood headlight top
		bodyModel[126] = new ModelRendererTurbo(this, 302, 484, textureX, textureY); // Box 215
		bodyModel[127] = new ModelRendererTurbo(this, 144, 479, textureX, textureY); // Box 216
		bodyModel[128] = new ModelRendererTurbo(this, 417, 232, textureX, textureY); // Box 217
		bodyModel[129] = new ModelRendererTurbo(this, 416, 288, textureX, textureY); // Box 218
		bodyModel[130] = new ModelRendererTurbo(this, 439, 330, textureX, textureY); // Box 219
		bodyModel[131] = new ModelRendererTurbo(this, 436, 279, textureX, textureY); // Box 220
		bodyModel[132] = new ModelRendererTurbo(this, 414, 326, textureX, textureY); // Box 221
		bodyModel[133] = new ModelRendererTurbo(this, 414, 335, textureX, textureY); // Box 222
		bodyModel[134] = new ModelRendererTurbo(this, 396, 306, textureX, textureY); // Box 223
		bodyModel[135] = new ModelRendererTurbo(this, 395, 288, textureX, textureY); // Box 224
		bodyModel[136] = new ModelRendererTurbo(this, 397, 296, textureX, textureY); // Box 225
		bodyModel[137] = new ModelRendererTurbo(this, 463, 291, textureX, textureY); // Box 226
		bodyModel[138] = new ModelRendererTurbo(this, 123, 440, textureX, textureY); // Box 227
		bodyModel[139] = new ModelRendererTurbo(this, 127, 432, textureX, textureY); // Box 228
		bodyModel[140] = new ModelRendererTurbo(this, 127, 424, textureX, textureY); // Box 229
		bodyModel[141] = new ModelRendererTurbo(this, 210, 480, textureX, textureY); // Box 230
		bodyModel[142] = new ModelRendererTurbo(this, 211, 452, textureX, textureY); // Box 232
		bodyModel[143] = new ModelRendererTurbo(this, 123, 234, textureX, textureY); // Box 233
		bodyModel[144] = new ModelRendererTurbo(this, 399, 336, textureX, textureY, "lamp"); // rsd15 high hood low headlight (top rsd17)
		bodyModel[145] = new ModelRendererTurbo(this, 399, 342, textureX, textureY, "lamp"); // rsd15 high hood top headlight
		bodyModel[146] = new ModelRendererTurbo(this, 409, 232, textureX, textureY, "lamp"); // nose headlight l
		bodyModel[147] = new ModelRendererTurbo(this, 311, 337, textureX, textureY, "lamp"); // nose headlight r
		bodyModel[148] = new ModelRendererTurbo(this, 36, 311, textureX, textureY); // Box 26
		bodyModel[149] = new ModelRendererTurbo(this, 6, 326, textureX, textureY); // Box 27
		bodyModel[150] = new ModelRendererTurbo(this, 72, 324, textureX, textureY); // Box 28
		bodyModel[151] = new ModelRendererTurbo(this, 58, 299, textureX, textureY); // Box 63
		bodyModel[152] = new ModelRendererTurbo(this, 42, 300, textureX, textureY); // Box 64
		bodyModel[153] = new ModelRendererTurbo(this, 7, 303, textureX, textureY); // Box 243
		bodyModel[154] = new ModelRendererTurbo(this, 139, 314, textureX, textureY); // Box 244
		bodyModel[155] = new ModelRendererTurbo(this, 61, 277, textureX, textureY); // Box 246
		bodyModel[156] = new ModelRendererTurbo(this, 107, 315, textureX, textureY); // Box 247
		bodyModel[157] = new ModelRendererTurbo(this, 18, 284, textureX, textureY); // Box 248
		bodyModel[158] = new ModelRendererTurbo(this, 100, 305, textureX, textureY); // Box 249
		bodyModel[159] = new ModelRendererTurbo(this, 2, 286, textureX, textureY); // Box 250
		bodyModel[160] = new ModelRendererTurbo(this, 34, 287, textureX, textureY); // Box 251
		bodyModel[161] = new ModelRendererTurbo(this, 78, 281, textureX, textureY); // Box 252
		bodyModel[162] = new ModelRendererTurbo(this, 156, 201, textureX, textureY); // Box 253
		bodyModel[163] = new ModelRendererTurbo(this, 477, 231, textureX, textureY); // Box 255
		bodyModel[164] = new ModelRendererTurbo(this, 134, 95, textureX, textureY); // Box 256
		bodyModel[165] = new ModelRendererTurbo(this, 100, 198, textureX, textureY); // Box 258
		bodyModel[166] = new ModelRendererTurbo(this, 165, 151, textureX, textureY); // Box 259
		bodyModel[167] = new ModelRendererTurbo(this, 119, 167, textureX, textureY); // Box 260
		bodyModel[168] = new ModelRendererTurbo(this, 108, 176, textureX, textureY); // Box 261
		bodyModel[169] = new ModelRendererTurbo(this, 108, 184, textureX, textureY); // Box 262
		bodyModel[170] = new ModelRendererTurbo(this, 105, 166, textureX, textureY); // Box 263
		bodyModel[171] = new ModelRendererTurbo(this, 110, 156, textureX, textureY); // Box 264
		bodyModel[172] = new ModelRendererTurbo(this, 147, 97, textureX, textureY); // Box 236
		bodyModel[173] = new ModelRendererTurbo(this, 12, 21, textureX, textureY); // Box 237
		bodyModel[174] = new ModelRendererTurbo(this, 53, 5, textureX, textureY); // Box 238
		bodyModel[175] = new ModelRendererTurbo(this, 11, 6, textureX, textureY); // Box 239
		bodyModel[176] = new ModelRendererTurbo(this, 0, 14, textureX, textureY); // Box 240
		bodyModel[177] = new ModelRendererTurbo(this, 1, 12, textureX, textureY); // Box 243
		bodyModel[178] = new ModelRendererTurbo(this, 15, 21, textureX, textureY); // Box 246
		bodyModel[179] = new ModelRendererTurbo(this, 1, 16, textureX, textureY); // Box 249
		bodyModel[180] = new ModelRendererTurbo(this, 12, 16, textureX, textureY); // Box 250
		bodyModel[181] = new ModelRendererTurbo(this, 316, 392, textureX, textureY); // Box 251
		bodyModel[182] = new ModelRendererTurbo(this, 29, 18, textureX, textureY); // Box 259
		bodyModel[183] = new ModelRendererTurbo(this, 23, 22, textureX, textureY); // Box 260
		bodyModel[184] = new ModelRendererTurbo(this, 53, 8, textureX, textureY); // Box 261
		bodyModel[185] = new ModelRendererTurbo(this, 465, 309, textureX, textureY); // Box 266
		bodyModel[186] = new ModelRendererTurbo(this, 29, 3, textureX, textureY); // Box 274
		bodyModel[187] = new ModelRendererTurbo(this, 117, 119, textureX, textureY); // Box 275
		bodyModel[188] = new ModelRendererTurbo(this, 42, 20, textureX, textureY); // Box 276
		bodyModel[189] = new ModelRendererTurbo(this, 314, 399, textureX, textureY); // Box 279
		bodyModel[190] = new ModelRendererTurbo(this, 437, 492, textureX, textureY); // Box 280
		bodyModel[191] = new ModelRendererTurbo(this, 431, 475, textureX, textureY); // Box 281
		bodyModel[192] = new ModelRendererTurbo(this, 2, 53, textureX, textureY); // Box 284
		bodyModel[193] = new ModelRendererTurbo(this, 79, 51, textureX, textureY); // Box 285
		bodyModel[194] = new ModelRendererTurbo(this, 3, 32, textureX, textureY); // Box 286
		bodyModel[195] = new ModelRendererTurbo(this, 44, 205, textureX, textureY); // Box 287
		bodyModel[196] = new ModelRendererTurbo(this, 77, 205, textureX, textureY); // Box 289
		bodyModel[197] = new ModelRendererTurbo(this, 134, 103, textureX, textureY); // Box 290
		bodyModel[198] = new ModelRendererTurbo(this, 81, 31, textureX, textureY); // Box 560
		bodyModel[199] = new ModelRendererTurbo(this, 81, 40, textureX, textureY); // Box 292
		bodyModel[200] = new ModelRendererTurbo(this, 130, 40, textureX, textureY); // Box 293
		bodyModel[201] = new ModelRendererTurbo(this, 130, 34, textureX, textureY); // Box 294
		bodyModel[202] = new ModelRendererTurbo(this, 437, 501, textureX, textureY); // Box 295
		bodyModel[203] = new ModelRendererTurbo(this, 431, 456, textureX, textureY); // Box 296
		bodyModel[204] = new ModelRendererTurbo(this, 289, 454, textureX, textureY); // Box 297
		bodyModel[205] = new ModelRendererTurbo(this, 26, 24, textureX, textureY); // Box 306
		bodyModel[206] = new ModelRendererTurbo(this, 43, 18, textureX, textureY); // Box 307
		bodyModel[207] = new ModelRendererTurbo(this, 54, 222, textureX, textureY); // Box 308
		bodyModel[208] = new ModelRendererTurbo(this, 3, 215, textureX, textureY); // Box 309
		bodyModel[209] = new ModelRendererTurbo(this, 5, 251, textureX, textureY); // Box 310
		bodyModel[210] = new ModelRendererTurbo(this, 43, 212, textureX, textureY); // Box 311
		bodyModel[211] = new ModelRendererTurbo(this, 105, 194, textureX, textureY); // Box 313
		bodyModel[212] = new ModelRendererTurbo(this, 93, 194, textureX, textureY); // Box 314
		bodyModel[213] = new ModelRendererTurbo(this, 3, 206, textureX, textureY); // Box 315
		bodyModel[214] = new ModelRendererTurbo(this, 98, 194, textureX, textureY); // Box 316
		bodyModel[215] = new ModelRendererTurbo(this, 189, 113, textureX, textureY); // Box 259
		bodyModel[216] = new ModelRendererTurbo(this, 437, 200, textureX, textureY); // Box 260
		bodyModel[217] = new ModelRendererTurbo(this, 464, 224, textureX, textureY); // Box 261
		bodyModel[218] = new ModelRendererTurbo(this, 86, 194, textureX, textureY); // Box 263
		bodyModel[219] = new ModelRendererTurbo(this, 228, 234, textureX, textureY); // Box 268
		bodyModel[220] = new ModelRendererTurbo(this, 165, 259, textureX, textureY); // Box 269
		bodyModel[221] = new ModelRendererTurbo(this, 222, 259, textureX, textureY); // Box 270
		bodyModel[222] = new ModelRendererTurbo(this, 228, 242, textureX, textureY); // Box 271
		bodyModel[223] = new ModelRendererTurbo(this, 228, 250, textureX, textureY); // Box 272
		bodyModel[224] = new ModelRendererTurbo(this, 229, 260, textureX, textureY); // Box 273
		bodyModel[225] = new ModelRendererTurbo(this, 122, 261, textureX, textureY); // Box 274
		bodyModel[226] = new ModelRendererTurbo(this, 169, 209, textureX, textureY); // Box 275
		bodyModel[227] = new ModelRendererTurbo(this, 192, 238, textureX, textureY); // Box 276
		bodyModel[228] = new ModelRendererTurbo(this, 192, 245, textureX, textureY); // Box 277
		bodyModel[229] = new ModelRendererTurbo(this, 221, 259, textureX, textureY); // Box 278
		bodyModel[230] = new ModelRendererTurbo(this, 221, 250, textureX, textureY); // Box 279
		bodyModel[231] = new ModelRendererTurbo(this, 193, 253, textureX, textureY); // Box 280
		bodyModel[232] = new ModelRendererTurbo(this, 165, 236, textureX, textureY); // Box 281
		bodyModel[233] = new ModelRendererTurbo(this, 221, 243, textureX, textureY); // Box 282
		bodyModel[234] = new ModelRendererTurbo(this, 221, 236, textureX, textureY); // Box 283
		bodyModel[235] = new ModelRendererTurbo(this, 396, 353, textureX, textureY); // Box 284
		bodyModel[236] = new ModelRendererTurbo(this, 356, 356, textureX, textureY); // Box 285
		bodyModel[237] = new ModelRendererTurbo(this, 6, 124, textureX, textureY); // Box 115
		bodyModel[238] = new ModelRendererTurbo(this, 93, 121, textureX, textureY); // Box 141
		bodyModel[239] = new ModelRendererTurbo(this, 1, 148, textureX, textureY); // Box 141
		bodyModel[240] = new ModelRendererTurbo(this, 121, 142, textureX, textureY); // Box 289
		bodyModel[241] = new ModelRendererTurbo(this, 156, 131, textureX, textureY); // Box 290
		bodyModel[242] = new ModelRendererTurbo(this, 388, 221, textureX, textureY); // Box 291
		bodyModel[243] = new ModelRendererTurbo(this, 464, 220, textureX, textureY); // Box 245
		bodyModel[244] = new ModelRendererTurbo(this, 287, 411, textureX, textureY); // Box 246
		bodyModel[245] = new ModelRendererTurbo(this, 31, 109, textureX, textureY); // Box 247
		bodyModel[246] = new ModelRendererTurbo(this, 287, 392, textureX, textureY); // Box 557
		bodyModel[247] = new ModelRendererTurbo(this, 125, 122, textureX, textureY); // Box 296
		bodyModel[248] = new ModelRendererTurbo(this, 287, 401, textureX, textureY); // Box 297
		bodyModel[249] = new ModelRendererTurbo(this, 437, 203, textureX, textureY); // Box 298
		bodyModel[250] = new ModelRendererTurbo(this, 286, 383, textureX, textureY); // Box 299
		bodyModel[251] = new ModelRendererTurbo(this, 431, 229, textureX, textureY); // Box 310
		bodyModel[252] = new ModelRendererTurbo(this, 266, 375, textureX, textureY); // Box 311
		bodyModel[253] = new ModelRendererTurbo(this, 25, 125, textureX, textureY); // Box 312
		bodyModel[254] = new ModelRendererTurbo(this, 108, 114, textureX, textureY); // Box 313
		bodyModel[255] = new ModelRendererTurbo(this, 225, 371, textureX, textureY); // Box 315
		bodyModel[256] = new ModelRendererTurbo(this, 260, 375, textureX, textureY); // Box 316
		bodyModel[257] = new ModelRendererTurbo(this, 190, 391, textureX, textureY); // Box 317
		bodyModel[258] = new ModelRendererTurbo(this, 254, 375, textureX, textureY); // Box 318
		bodyModel[259] = new ModelRendererTurbo(this, 240, 372, textureX, textureY); // Box 319
		bodyModel[260] = new ModelRendererTurbo(this, 105, 94, textureX, textureY); // Box 320
		bodyModel[261] = new ModelRendererTurbo(this, 370, 216, textureX, textureY); // Box 321
		bodyModel[262] = new ModelRendererTurbo(this, 375, 12, textureX, textureY); // brake wheew
		bodyModel[263] = new ModelRendererTurbo(this, 365, 21, textureX, textureY); // Box 323
		bodyModel[264] = new ModelRendererTurbo(this, 41, 117, textureX, textureY); // Box 324
		bodyModel[265] = new ModelRendererTurbo(this, 118, 297, textureX, textureY); // Box 325
		bodyModel[266] = new ModelRendererTurbo(this, 118, 300, textureX, textureY); // Box 326
		bodyModel[267] = new ModelRendererTurbo(this, 465, 343, textureX, textureY); // Box 0
		bodyModel[268] = new ModelRendererTurbo(this, 448, 346, textureX, textureY); // Box 2
		bodyModel[269] = new ModelRendererTurbo(this, 448, 336, textureX, textureY); // Box 329
		bodyModel[270] = new ModelRendererTurbo(this, 465, 343, textureX, textureY); // Box 330
		bodyModel[271] = new ModelRendererTurbo(this, 397, 234, textureX, textureY); // Box 331
		bodyModel[272] = new ModelRendererTurbo(this, 187, 79, textureX, textureY); // Box 332
		bodyModel[273] = new ModelRendererTurbo(this, 187, 94, textureX, textureY); // Box 333
		bodyModel[274] = new ModelRendererTurbo(this, 140, 136, textureX, textureY); // sandcap
		bodyModel[275] = new ModelRendererTurbo(this, 15, 117, textureX, textureY); // Box 337
		bodyModel[276] = new ModelRendererTurbo(this, 134, 113, textureX, textureY); // Box 338
		bodyModel[277] = new ModelRendererTurbo(this, 490, 343, textureX, textureY); // Box 339
		bodyModel[278] = new ModelRendererTurbo(this, 18, 179, textureX, textureY); // Box 340
		bodyModel[279] = new ModelRendererTurbo(this, 158, 111, textureX, textureY); // Box 342
		bodyModel[280] = new ModelRendererTurbo(this, 0, 10, textureX, textureY); // Box 343
		bodyModel[281] = new ModelRendererTurbo(this, 1, 8, textureX, textureY); // Box 344
		bodyModel[282] = new ModelRendererTurbo(this, 1, 6, textureX, textureY); // Box 345
		bodyModel[283] = new ModelRendererTurbo(this, 0, 4, textureX, textureY); // Box 346
		bodyModel[284] = new ModelRendererTurbo(this, 155, 123, textureX, textureY); // Box 348
		bodyModel[285] = new ModelRendererTurbo(this, 438, 220, textureX, textureY); // Box 351
		bodyModel[286] = new ModelRendererTurbo(this, 17, 354, textureX, textureY); // Box 353
		bodyModel[287] = new ModelRendererTurbo(this, 42, 15, textureX, textureY); // Box 310
		bodyModel[288] = new ModelRendererTurbo(this, 43, 13, textureX, textureY); // Box 311
		bodyModel[289] = new ModelRendererTurbo(this, 42, 11, textureX, textureY); // Box 312
		bodyModel[290] = new ModelRendererTurbo(this, 43, 9, textureX, textureY); // Box 313
		bodyModel[291] = new ModelRendererTurbo(this, 42, 7, textureX, textureY); // Box 314
		bodyModel[292] = new ModelRendererTurbo(this, 43, 5, textureX, textureY); // Box 315
		bodyModel[293] = new ModelRendererTurbo(this, 42, 3, textureX, textureY); // Box 316
		bodyModel[294] = new ModelRendererTurbo(this, 30, 28, textureX, textureY); // Box 317
		bodyModel[295] = new ModelRendererTurbo(this, 31, 26, textureX, textureY); // Box 318
		bodyModel[296] = new ModelRendererTurbo(this, 30, 24, textureX, textureY); // Box 319
		bodyModel[297] = new ModelRendererTurbo(this, 31, 15, textureX, textureY); // Box 320
		bodyModel[298] = new ModelRendererTurbo(this, 30, 11, textureX, textureY); // Box 321
		bodyModel[299] = new ModelRendererTurbo(this, 31, 13, textureX, textureY); // Box 322
		bodyModel[300] = new ModelRendererTurbo(this, 30, 9, textureX, textureY); // Box 323
		bodyModel[301] = new ModelRendererTurbo(this, 58, 16, textureX, textureY); // Box 324
		bodyModel[302] = new ModelRendererTurbo(this, 53, 16, textureX, textureY); // Box 325
		bodyModel[303] = new ModelRendererTurbo(this, 81, 166, textureX, textureY); // Box 326
		bodyModel[304] = new ModelRendererTurbo(this, 119, 139, textureX, textureY); // Box 328
		bodyModel[305] = new ModelRendererTurbo(this, 36, 139, textureX, textureY); // Box 329
		bodyModel[306] = new ModelRendererTurbo(this, 129, 127, textureX, textureY); // Box 330
		bodyModel[307] = new ModelRendererTurbo(this, 289, 471, textureX, textureY); // Box 233
		bodyModel[308] = new ModelRendererTurbo(this, 318, 472, textureX, textureY); // Box 234
		bodyModel[309] = new ModelRendererTurbo(this, 290, 482, textureX, textureY); // Box 235
		bodyModel[310] = new ModelRendererTurbo(this, 43, 143, textureX, textureY, "lamp"); // cab numberboard l
		bodyModel[311] = new ModelRendererTurbo(this, 457, 194, textureX, textureY, "lamp"); // cab numberboard r
		bodyModel[312] = new ModelRendererTurbo(this, 68, 162, textureX, textureY, "lamp"); // long hood numberboard l
		bodyModel[313] = new ModelRendererTurbo(this, 95, 113, textureX, textureY, "lamp"); // long hood numberboard r
		bodyModel[314] = new ModelRendererTurbo(this, 442, 355, textureX, textureY); // Box 340
		bodyModel[315] = new ModelRendererTurbo(this, 458, 336, textureX, textureY); // Box 341
		bodyModel[316] = new ModelRendererTurbo(this, 491, 182, textureX, textureY); // Box 343
		bodyModel[317] = new ModelRendererTurbo(this, 182, 430, textureX, textureY); // box64
		bodyModel[318] = new ModelRendererTurbo(this, 182, 430, textureX, textureY); // box65
		bodyModel[319] = new ModelRendererTurbo(this, 501, 227, textureX, textureY); // Box 327
		bodyModel[320] = new ModelRendererTurbo(this, 125, 89, textureX, textureY, "lamp"); // commander beacon
		bodyModel[321] = new ModelRendererTurbo(this, 159, 218, textureX, textureY); // Box 613
		bodyModel[322] = new ModelRendererTurbo(this, 502, 181, textureX, textureY, "lamp"); // sp emergency
		bodyModel[323] = new ModelRendererTurbo(this, 2, 125, textureX, textureY); // Box 319
		bodyModel[324] = new ModelRendererTurbo(this, 93, 173, textureX, textureY); // Box 320
		bodyModel[325] = new ModelRendererTurbo(this, 16, 148, textureX, textureY); // Box 321
		bodyModel[326] = new ModelRendererTurbo(this, 186, 153, textureX, textureY); // Box 322
		bodyModel[327] = new ModelRendererTurbo(this, 371, 221, textureX, textureY, "lamp"); // SP cab mount numberboard
		bodyModel[328] = new ModelRendererTurbo(this, 110, 302, textureX, textureY); // underbell2
		bodyModel[329] = new ModelRendererTurbo(this, 118, 115, textureX, textureY); // underbell1
		bodyModel[330] = new ModelRendererTurbo(this, 93, 168, textureX, textureY); // underbellclappa
		bodyModel[331] = new ModelRendererTurbo(this, 68, 144, textureX, textureY); // Box 365
		bodyModel[332] = new ModelRendererTurbo(this, 22, 144, textureX, textureY); // Box 366
		bodyModel[333] = new ModelRendererTurbo(this, 93, 140, textureX, textureY); // Box 252
		bodyModel[334] = new ModelRendererTurbo(this, 85, 140, textureX, textureY, "lamp"); // A&MT ditchlight l
		bodyModel[335] = new ModelRendererTurbo(this, 85, 146, textureX, textureY); // Box 361
		bodyModel[336] = new ModelRendererTurbo(this, 399, 216, textureX, textureY, "lamp"); // A&MT ditchlight r
		bodyModel[337] = new ModelRendererTurbo(this, 115, 110, textureX, textureY); // Box 238
		bodyModel[338] = new ModelRendererTurbo(this, 412, 211, textureX, textureY, "lamp"); // high hood numberboard r
		bodyModel[339] = new ModelRendererTurbo(this, 450, 202, textureX, textureY, "lamp"); // high hood numberboard l
		bodyModel[340] = new ModelRendererTurbo(this, 1, 159, textureX, textureY); // Box 586
		bodyModel[341] = new ModelRendererTurbo(this, 466, 212, textureX, textureY); // Box 587
		bodyModel[342] = new ModelRendererTurbo(this, 119, 303, textureX, textureY); // Box 588
		bodyModel[343] = new ModelRendererTurbo(this, 482, 183, textureX, textureY); // Box 589
		bodyModel[344] = new ModelRendererTurbo(this, 498, 190, textureX, textureY); // Box 590
		bodyModel[345] = new ModelRendererTurbo(this, 166, 85, textureX, textureY); // Box 591
		bodyModel[346] = new ModelRendererTurbo(this, 51, 145, textureX, textureY); // Box 592
		bodyModel[347] = new ModelRendererTurbo(this, 489, 190, textureX, textureY); // Box 593
		bodyModel[348] = new ModelRendererTurbo(this, 148, 84, textureX, textureY); // Box 594
		bodyModel[349] = new ModelRendererTurbo(this, 101, 280, textureX, textureY); // Box 376
		bodyModel[350] = new ModelRendererTurbo(this, 18, 185, textureX, textureY); // Box 377
		bodyModel[351] = new ModelRendererTurbo(this, 168, 94, textureX, textureY); // Box 378
		bodyModel[352] = new ModelRendererTurbo(this, 40, 161, textureX, textureY); // Box 379
		bodyModel[353] = new ModelRendererTurbo(this, 181, 103, textureX, textureY); // Box 380
		bodyModel[354] = new ModelRendererTurbo(this, 445, 226, textureX, textureY); // Box 381
		bodyModel[355] = new ModelRendererTurbo(this, 438, 215, textureX, textureY); // Box 382
		bodyModel[356] = new ModelRendererTurbo(this, 1, 166, textureX, textureY); // Box 383
		bodyModel[357] = new ModelRendererTurbo(this, 436, 207, textureX, textureY); // Box 385
		bodyModel[358] = new ModelRendererTurbo(this, 54, 159, textureX, textureY); // Box 386
		bodyModel[359] = new ModelRendererTurbo(this, 70, 140, textureX, textureY); // Box 387
		bodyModel[360] = new ModelRendererTurbo(this, 490, 356, textureX, textureY); // Box 388
		bodyModel[361] = new ModelRendererTurbo(this, 456, 308, textureX, textureY); // Box 389
		bodyModel[362] = new ModelRendererTurbo(this, 490, 317, textureX, textureY); // Box 390
		bodyModel[363] = new ModelRendererTurbo(this, 462, 280, textureX, textureY); // Box 391
		bodyModel[364] = new ModelRendererTurbo(this, 490, 305, textureX, textureY); // Box 392
		bodyModel[365] = new ModelRendererTurbo(this, 83, 304, textureX, textureY); // Box 397
		bodyModel[366] = new ModelRendererTurbo(this, 18, 338, textureX, textureY); // Box 400
		bodyModel[367] = new ModelRendererTurbo(this, 3, 295, textureX, textureY); // Box 403
		bodyModel[368] = new ModelRendererTurbo(this, 70, 303, textureX, textureY); // Box 407
		bodyModel[369] = new ModelRendererTurbo(this, 42, 284, textureX, textureY); // Box 408
		bodyModel[370] = new ModelRendererTurbo(this, 15, 292, textureX, textureY); // Box 409
		bodyModel[371] = new ModelRendererTurbo(this, 111, 139, textureX, textureY); // Box 411
		bodyModel[372] = new ModelRendererTurbo(this, 111, 131, textureX, textureY); // Box 412
		bodyModel[373] = new ModelRendererTurbo(this, 166, 155, textureX, textureY); // Box 413
		bodyModel[374] = new ModelRendererTurbo(this, 85, 152, textureX, textureY, "lamp"); // rsd17 headlight low top
		bodyModel[375] = new ModelRendererTurbo(this, 46, 170, textureX, textureY, "lamp"); // rsd17 headlight low bottom
		bodyModel[376] = new ModelRendererTurbo(this, 15, 109, textureX, textureY); // Box 114
		bodyModel[377] = new ModelRendererTurbo(this, 2, 109, textureX, textureY); // Box 74
		bodyModel[378] = new ModelRendererTurbo(this, 21, 108, textureX, textureY); // Box 78
		bodyModel[379] = new ModelRendererTurbo(this, 502, 224, textureX, textureY); // Box 875
		bodyModel[380] = new ModelRendererTurbo(this, 502, 218, textureX, textureY); // Box 876
		bodyModel[381] = new ModelRendererTurbo(this, 110, 145, textureX, textureY); // Box 877
		bodyModel[382] = new ModelRendererTurbo(this, 32, 113, textureX, textureY); // Box 481
		bodyModel[383] = new ModelRendererTurbo(this, 112, 135, textureX, textureY); // Box 409
		bodyModel[384] = new ModelRendererTurbo(this, 77, 200, textureX, textureY); // Box 410
		bodyModel[385] = new ModelRendererTurbo(this, 157, 124, textureX, textureY); // Box 411
		bodyModel[386] = new ModelRendererTurbo(this, 452, 211, textureX, textureY); // Box 412
		bodyModel[387] = new ModelRendererTurbo(this, 120, 144, textureX, textureY); // Box 413
		bodyModel[388] = new ModelRendererTurbo(this, 81, 307, textureX, textureY); // Box 414
		bodyModel[389] = new ModelRendererTurbo(this, 3, 305, textureX, textureY); // Box 415
		bodyModel[390] = new ModelRendererTurbo(this, 157, 235, textureX, textureY); // Box 417
		bodyModel[391] = new ModelRendererTurbo(this, 465, 189, textureX, textureY); // Box 413
		bodyModel[392] = new ModelRendererTurbo(this, 47, 178, textureX, textureY); // Box 418
		bodyModel[393] = new ModelRendererTurbo(this, 452, 214, textureX, textureY); // Box 419
		bodyModel[394] = new ModelRendererTurbo(this, 55, 170, textureX, textureY); // Box 420
		bodyModel[395] = new ModelRendererTurbo(this, 20, 160, textureX, textureY); // Box 421
		bodyModel[396] = new ModelRendererTurbo(this, 46, 187, textureX, textureY); // Box 423
		bodyModel[397] = new ModelRendererTurbo(this, 64, 171, textureX, textureY, "lamp"); // PRR cab siignalling
		bodyModel[398] = new ModelRendererTurbo(this, 123, 126, textureX, textureY, "lamp"); // commander beacon
		bodyModel[399] = new ModelRendererTurbo(this, 394, 210, textureX, textureY); // Box 428
		bodyModel[400] = new ModelRendererTurbo(this, 54, 186, textureX, textureY); // Box 429
		bodyModel[401] = new ModelRendererTurbo(this, 411, 211, textureX, textureY); // Box 430
		bodyModel[402] = new ModelRendererTurbo(this, 161, 62, textureX, textureY); // Box 431
		bodyModel[403] = new ModelRendererTurbo(this, 382, 209, textureX, textureY); // Box 432
		bodyModel[404] = new ModelRendererTurbo(this, 102, 140, textureX, textureY); // Box 433
		bodyModel[405] = new ModelRendererTurbo(this, 51, 141, textureX, textureY); // Box 293
		bodyModel[406] = new ModelRendererTurbo(this, 499, 194, textureX, textureY); // Box 294
		bodyModel[407] = new ModelRendererTurbo(this, 67, 200, textureX, textureY); // Box 295
		bodyModel[408] = new ModelRendererTurbo(this, 96, 90, textureX, textureY); // Box 437
		bodyModel[409] = new ModelRendererTurbo(this, 123, 290, textureX, textureY); // Box 438
		bodyModel[410] = new ModelRendererTurbo(this, 106, 141, textureX, textureY); // Box 439
		bodyModel[411] = new ModelRendererTurbo(this, 175, 97, textureX, textureY); // Box 440
		bodyModel[412] = new ModelRendererTurbo(this, 492, 199, textureX, textureY); // Box 441
		bodyModel[413] = new ModelRendererTurbo(this, 465, 230, textureX, textureY); // Box 442
		bodyModel[414] = new ModelRendererTurbo(this, 379, 218, textureX, textureY); // Box 443
		bodyModel[415] = new ModelRendererTurbo(this, 460, 227, textureX, textureY); // Box 444
		bodyModel[416] = new ModelRendererTurbo(this, 501, 221, textureX, textureY); // cabroof sinclair
		bodyModel[417] = new ModelRendererTurbo(this, 477, 221, textureX, textureY); // Box 380
		bodyModel[418] = new ModelRendererTurbo(this, 399, 223, textureX, textureY); // Box 453
		bodyModel[419] = new ModelRendererTurbo(this, 429, 216, textureX, textureY, "lamp"); // rsd17 headlight low high
		bodyModel[420] = new ModelRendererTurbo(this, 429, 222, textureX, textureY, "lamp"); // rsd17 headlight low high long hood
		bodyModel[421] = new ModelRendererTurbo(this, 177, 407, textureX, textureY); // cubed special f
		bodyModel[422] = new ModelRendererTurbo(this, 190, 407, textureX, textureY); // cubedspecial r
		bodyModel[423] = new ModelRendererTurbo(this, 410, 222, textureX, textureY); // Box 441
		bodyModel[424] = new ModelRendererTurbo(this, 414, 204, textureX, textureY); // Box 442
		bodyModel[425] = new ModelRendererTurbo(this, 464, 200, textureX, textureY); // Box 444
		bodyModel[426] = new ModelRendererTurbo(this, 464, 186, textureX, textureY); // Box 442
		bodyModel[427] = new ModelRendererTurbo(this, 118, 121, textureX, textureY); // Box 443
		bodyModel[428] = new ModelRendererTurbo(this, 311, 337, textureX, textureY, "lamp"); // SP headlight rear low r
		bodyModel[429] = new ModelRendererTurbo(this, 187, 86, textureX, textureY, "lamp"); // SP headlight rear low l
		bodyModel[430] = new ModelRendererTurbo(this, 97, 186, textureX, textureY); // PCCRsinclair
		bodyModel[431] = new ModelRendererTurbo(this, 375, 3, textureX, textureY); // Box 445
		bodyModel[432] = new ModelRendererTurbo(this, 364, 16, textureX, textureY); // Box 446
		bodyModel[433] = new ModelRendererTurbo(this, 475, 290, textureX, textureY); // Box 447
		bodyModel[434] = new ModelRendererTurbo(this, 476, 296, textureX, textureY); // Box 448
		bodyModel[435] = new ModelRendererTurbo(this, 152, 225, textureX, textureY); // Box 449
		bodyModel[436] = new ModelRendererTurbo(this, 145, 218, textureX, textureY); // Box 450
		bodyModel[437] = new ModelRendererTurbo(this, 120, 221, textureX, textureY); // Box 451
		bodyModel[438] = new ModelRendererTurbo(this, 136, 225, textureX, textureY); // Box 452
		bodyModel[439] = new ModelRendererTurbo(this, 122, 226, textureX, textureY); // Box 453
		bodyModel[440] = new ModelRendererTurbo(this, 371, 221, textureX, textureY, "lamp"); // SP cab mount numberboard
		bodyModel[441] = new ModelRendererTurbo(this, 129, 219, textureX, textureY); // Box 455
		bodyModel[442] = new ModelRendererTurbo(this, 111, 232, textureX, textureY); // Box 456
		bodyModel[443] = new ModelRendererTurbo(this, 111, 221, textureX, textureY); // Box 457
		bodyModel[444] = new ModelRendererTurbo(this, 113, 228, textureX, textureY); // Box 458
		bodyModel[445] = new ModelRendererTurbo(this, 491, 196, textureX, textureY); // Box 459
		bodyModel[446] = new ModelRendererTurbo(this, 112, 225, textureX, textureY); // Box 460
		bodyModel[447] = new ModelRendererTurbo(this, 114, 406, textureX, textureY); // exhaust
		bodyModel[448] = new ModelRendererTurbo(this, 0, 2, textureX, textureY); // Box 448
		bodyModel[449] = new ModelRendererTurbo(this, 385, 17, textureX, textureY); // Box 449
		bodyModel[450] = new ModelRendererTurbo(this, 358, 15, textureX, textureY); // Box 43
		bodyModel[451] = new ModelRendererTurbo(this, 363, 5, textureX, textureY); // Box 43
		bodyModel[452] = new ModelRendererTurbo(this, 359, 5, textureX, textureY); // Box 452
		bodyModel[453] = new ModelRendererTurbo(this, 367, 3, textureX, textureY); // Box 453
		bodyModel[454] = new ModelRendererTurbo(this, 147, 11, textureX, textureY, "lamp"); // RSD17 high hood numberboard l
		bodyModel[455] = new ModelRendererTurbo(this, 147, 4, textureX, textureY); // Box 455
		bodyModel[456] = new ModelRendererTurbo(this, 135, 11, textureX, textureY); // rsd17 long hood 
		bodyModel[457] = new ModelRendererTurbo(this, 135, 4, textureX, textureY, "lamp"); // RSD17longhoodnumberboardl

		bodyModel[0].addBox(0F, 0F, 0F, 4, 6, 4, 0F); // Box 502
		bodyModel[0].setRotationPoint(-42F, -14F, -2F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 1, 7, 5, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 504
		bodyModel[1].setRotationPoint(-42F, -8F, -6F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 4, 2, 5, 0F,-4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 156
		bodyModel[2].setRotationPoint(-42F, -13F, -7F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 4, 1, 5, 0F,-4F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 157
		bodyModel[3].setRotationPoint(-42F, -14F, -7F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 4, 3, 4, 0F,0F, -3F, 0F, -0.75F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 160
		bodyModel[4].setRotationPoint(-42F, -11F, -6F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,-2F, -2F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, 0F, -3F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 161
		bodyModel[5].setRotationPoint(-42F, -11F, -7F);

		bodyModel[6].addBox(0F, 0F, 0F, 89, 4, 14, 0F); // Box 52
		bodyModel[6].setRotationPoint(-46F, -1F, -7F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[7].setRotationPoint(-46F, -1F, -9F);

		bodyModel[8].addBox(0F, 0F, 0F, 79, 1, 4, 0F); // Box 206
		bodyModel[8].setRotationPoint(-41F, -1F, 7F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 4, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); // Box 25
		bodyModel[9].setRotationPoint(-42F, -13F, 2F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 4, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -4F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); // Box 26
		bodyModel[10].setRotationPoint(-42F, -14F, 2F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 4, 3, 4, 0F,0F, 0F, 0F, -3F, 0F, 0F, -0.75F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 27
		bodyModel[11].setRotationPoint(-42F, -11F, 2F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, -3F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 28
		bodyModel[12].setRotationPoint(-42F, -11F, 6F);

		bodyModel[13].addBox(0F, 0F, 0F, 18, 7, 14, 0F); // Box 29
		bodyModel[13].setRotationPoint(-41F, -8F, -7F);

		bodyModel[14].addBox(0F, 0F, 0F, 15, 1, 4, 0F); // Box 30
		bodyModel[14].setRotationPoint(-38F, -14F, -2F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 15, 1, 5, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[15].setRotationPoint(-38F, -14F, -7F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 15, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 32
		bodyModel[16].setRotationPoint(-38F, -14F, 2F);

		bodyModel[17].addBox(0F, 0F, 0F, 10, 12, 1, 0F); // Box 29
		bodyModel[17].setRotationPoint(-22F, -18F, -11F);

		bodyModel[18].addBox(0F, 0F, 0F, 10, 12, 1, 0F); // Box 32
		bodyModel[18].setRotationPoint(-22F, -18F, 10F);

		bodyModel[19].addBox(0F, 0F, 0F, 12, 1, 6, 0F); // Box 135
		bodyModel[19].setRotationPoint(-23F, -23F, -3F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 11, 1, 5, 0F,0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 57
		bodyModel[20].setRotationPoint(-23F, -23F, -8F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 10, 1, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 58
		bodyModel[21].setRotationPoint(-22F, -21F, -10F);

		bodyModel[22].addBox(0F, 0F, 0F, 1, 12, 18, 0F); // Box 406
		bodyModel[22].setRotationPoint(-12F, -18F, -11F);

		bodyModel[23].addBox(0F, 0F, 0F, 1, 1, 16, 0F); // Box 409
		bodyModel[23].setRotationPoint(-12F, -21F, -8F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 410
		bodyModel[24].setRotationPoint(-12F, -23F, -8F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 412
		bodyModel[25].setRotationPoint(-12F, -21F, -10F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 413
		bodyModel[26].setRotationPoint(-23F, -21F, -10F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 415
		bodyModel[27].setRotationPoint(-12F, -23F, 3F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 416
		bodyModel[28].setRotationPoint(-12F, -21F, 8F);

		bodyModel[29].addBox(-0.5F, -2F, 0.5F, 1, 2, 3, 0F); // Box 428
		bodyModel[29].setRotationPoint(-22.5F, -18F, -10.5F);

		bodyModel[30].addBox(-0.5F, 0F, -0.5F, 1, 12, 4, 0F); // Box 315 door swing right
		bodyModel[30].setRotationPoint(-22.5F, -18F, -10.5F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 706
		bodyModel[31].setRotationPoint(-23F, -21F, -8F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 12, 2, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 278
		bodyModel[32].setRotationPoint(-23F, -20F, -11F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 10, 1, 2, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 129
		bodyModel[33].setRotationPoint(-22F, -21F, 8F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 12, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 130
		bodyModel[34].setRotationPoint(-23F, -20F, 10F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 11, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F); // Box 132
		bodyModel[35].setRotationPoint(-23F, -23F, 3F);

		bodyModel[36].addBox(0F, 0F, 0F, 1, 12, 4, 0F); // Box 405
		bodyModel[36].setRotationPoint(-23F, -18F, 7F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 417
		bodyModel[37].setRotationPoint(-23F, -21F, 8F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 705
		bodyModel[38].setRotationPoint(-23F, -21F, 7F);

		bodyModel[39].addBox(0F, 0F, 0F, 1, 2, 3, 0F); // Box 57
		bodyModel[39].setRotationPoint(-23F, -20F, 7F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 2, 4, 4, 0F,0.05F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.05F, 0F, 0F); // Box 432
		bodyModel[40].setRotationPoint(-26.5F, -23F, -2F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,-3F, -1.2F, 0F, 1F, -1.2F, 0F, 1F, 0F, 0F, -0.15F, 0F, 0F, -3F, 0.2F, 0F, 1F, 0.2F, 0F, 1F, 0.065F, 0F, -0.14F, 0.065F, 0F); // Box 439
		bodyModel[41].setRotationPoint(-26F, -23F, -7F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.57F, 0F, 0F, -0.15F, 0.065F, 0F, 0F, 0.065F, 0F, 0F, 0F, 0F, 0.57F, 0F, 0F); // Box 440
		bodyModel[42].setRotationPoint(-26F, -23F, -3F);

		bodyModel[43].addBox(0F, 0F, 0F, 12, 5, 22, 0F); // Box 95
		bodyModel[43].setRotationPoint(-23F, -6F, -11F);

		bodyModel[44].addBox(0F, 0F, 0F, 5, 5, 22, 0F); // Box 563
		bodyModel[44].setRotationPoint(-11F, -6F, -11F);

		bodyModel[45].addBox(0F, 0F, 0F, 9, 5, 22, 0F); // Box 74
		bodyModel[45].setRotationPoint(-32F, -6F, -11F);

		bodyModel[46].addBox(0F, 0F, 0F, 46, 20, 14, 0F); // Box 75
		bodyModel[46].setRotationPoint(-11F, -21F, -7F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 46, 1, 5, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 76
		bodyModel[47].setRotationPoint(-11F, -22F, -7F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 46, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 77
		bodyModel[48].setRotationPoint(-11F, -22F, 2F);

		bodyModel[49].addBox(0F, 0F, 0F, 46, 1, 4, 0F); // Box 78
		bodyModel[49].setRotationPoint(-11F, -22F, -2F);

		bodyModel[50].addBox(0F, 0F, 0F, 1, 15, 14, 0F); // Box 79
		bodyModel[50].setRotationPoint(-23F, -21F, -7F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,-0.75F, 0F, 0F, 0F, -3F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 80
		bodyModel[51].setRotationPoint(35F, -19F, 6F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 4, 3, 4, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -0.75F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Box 81
		bodyModel[52].setRotationPoint(35F, -19F, 2F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 4, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Box 82
		bodyModel[53].setRotationPoint(35F, -21F, 2F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 4, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, -4F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Box 83
		bodyModel[54].setRotationPoint(35F, -22F, 2F);

		bodyModel[55].addBox(0F, 0F, 0F, 4, 6, 4, 0F); // Box 84
		bodyModel[55].setRotationPoint(35F, -22F, -2F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 4, 3, 4, 0F,-0.75F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 85
		bodyModel[56].setRotationPoint(35F, -19F, -6F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, 0F, 0F, -2F, -2F, 0F, 0F, -3F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 86
		bodyModel[57].setRotationPoint(35F, -19F, -7F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 4, 2, 5, 0F,0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 87
		bodyModel[58].setRotationPoint(35F, -21F, -7F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 4, 1, 5, 0F,0F, -1F, 0F, -4F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 88
		bodyModel[59].setRotationPoint(35F, -22F, -7F);

		bodyModel[60].addBox(0F, 0F, 0F, 3, 15, 14, 0F); // Box 89
		bodyModel[60].setRotationPoint(35F, -16F, -7F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 1, 15, 12, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 90
		bodyModel[61].setRotationPoint(38F, -16F, -6F);

		bodyModel[62].addBox(0F, 0F, 0F, 0, 6, 20, 0F); // Box 6
		bodyModel[62].setRotationPoint(-46.01F, -1F, -10F);

		bodyModel[63].addBox(0F, 0F, 0F, 0, 8, 4, 0F); // Box 228
		bodyModel[63].setRotationPoint(-46F, -9F, -7F);

		bodyModel[64].addBox(0F, 0F, 0F, 0, 5, 1, 0F); // Box 682
		bodyModel[64].setRotationPoint(-46F, -3F, -11F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, -1.5F, 1F, 0F, -1.5F, 1F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 709
		bodyModel[65].setRotationPoint(-46F, -9F, -9F);

		bodyModel[66].addBox(0F, 0F, 0F, 0, 5, 1, 0F); // Box 99
		bodyModel[66].setRotationPoint(-46F, -3F, 10F);

		bodyModel[67].addBox(0F, 0F, 0F, 11, 8, 0, 0F); // Box 224
		bodyModel[67].setRotationPoint(-43F, -9F, -11F);

		bodyModel[68].addBox(0F, 0F, 0F, 1, 5, 0, 0F); // Box 275
		bodyModel[68].setRotationPoint(-43F, -1F, -11F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 5, 1, 0, 0F,0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F); // Box 723
		bodyModel[69].setRotationPoint(-36F, -14F, -11F);

		bodyModel[70].addBox(0F, 0F, 0F, 8, 8, 0, 0F); // Box 724
		bodyModel[70].setRotationPoint(-31F, -14F, -11F);

		bodyModel[71].addBox(0F, 0F, 0F, 14, 8, 0, 0F); // Box 107
		bodyModel[71].setRotationPoint(-37F, -14F, 11F);

		bodyModel[72].addBox(0F, 0F, 0F, 13, 8, 0, 0F); // Box 108
		bodyModel[72].setRotationPoint(-11F, -14F, 11F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 5, 1, 0, 0F,0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F); // Box 109
		bodyModel[73].setRotationPoint(-8F, -14F, 11F);

		bodyModel[74].addBox(0F, 0F, 0F, 3, 8, 0, 0F); // Box 110
		bodyModel[74].setRotationPoint(-11F, -14F, -11F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 5, 1, 0, 0F,0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F); // Box 111
		bodyModel[75].setRotationPoint(-8F, -14F, -11F);

		bodyModel[76].addBox(0F, 0F, 0F, 46, 8, 0, 0F); // Box 112
		bodyModel[76].setRotationPoint(-6F, -9F, 11F);

		bodyModel[77].addBox(0F, 0F, 0F, 46, 8, 0, 0F); // Box 113
		bodyModel[77].setRotationPoint(-6F, -9F, -11F);

		bodyModel[78].addBox(0F, 0F, 0F, 0, 7, 2, 0F); // Box 8
		bodyModel[78].setRotationPoint(-42F, 1F, -11F);

		bodyModel[79].addBox(0F, 0F, 0F, 4, 0, 1, 0F); // Box 13
		bodyModel[79].setRotationPoint(-46F, 8F, -11F);

		bodyModel[80].addBox(0F, 0F, 0F, 4, 0, 1, 0F); // Box 14
		bodyModel[80].setRotationPoint(-46F, 5.5F, -10.5F);

		bodyModel[81].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 18
		bodyModel[81].setRotationPoint(-46F, 4.5F, -9.5F);

		bodyModel[82].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 20
		bodyModel[82].setRotationPoint(-46F, 7F, -10F);

		bodyModel[83].addBox(0F, 0F, 0F, 0, 1, 18, 0F); // Box 21
		bodyModel[83].setRotationPoint(-46F, 8F, -9F);

		bodyModel[84].addBox(0F, 0F, 0F, 0, 3, 22, 0F); // Box 28
		bodyModel[84].setRotationPoint(-46.01F, 5F, -11F);

		bodyModel[85].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 277
		bodyModel[85].setRotationPoint(-46F, 2F, -9F);

		bodyModel[86].addBox(0F, 0F, 0F, 4, 0, 1, 0F); // Box 278
		bodyModel[86].setRotationPoint(-46F, 3F, -10F);

		bodyModel[87].addBox(0F, 0F, 0F, 4, 0, 1, 0F); // Box 279
		bodyModel[87].setRotationPoint(-46F, 0.5F, -10F);

		bodyModel[88].addBox(0F, 0F, 0F, 0, 5, 1, 0F); // Box 153
		bodyModel[88].setRotationPoint(43F, -3F, -11F);

		bodyModel[89].addBox(0F, 0F, 0F, 0, 5, 1, 0F); // Box 155
		bodyModel[89].setRotationPoint(43F, -3F, 10F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 2, 2, 5, 0F,-4F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -0.43F, 0F, 0F, -4F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -0.43F, 0F, 0F); // Box 156
		bodyModel[90].setRotationPoint(-27F, -21F, -7F);

		bodyModel[91].addBox(0F, 0F, 0F, 11, 8, 0, 0F); // Box 157
		bodyModel[91].setRotationPoint(-43F, -9F, 11F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 7, 2, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 159
		bodyModel[92].setRotationPoint(23.5F, -22.5F, -7F);

		bodyModel[93].addBox(0F, 0F, 0F, 4, 2, 6, 0F); // Box 160
		bodyModel[93].setRotationPoint(19.5F, -22.5F, -3F);

		bodyModel[94].addBox(0F, 0F, 0F, 4, 2, 6, 0F); // Box 161
		bodyModel[94].setRotationPoint(30.5F, -22.5F, -3F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 4, 2, 4, 0F,0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 162
		bodyModel[95].setRotationPoint(19.5F, -22.5F, -7F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 4, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F); // Box 163
		bodyModel[96].setRotationPoint(19.5F, -22.5F, 3F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 4, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 164
		bodyModel[97].setRotationPoint(30.5F, -22.5F, -7F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 4, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F); // Box 165
		bodyModel[98].setRotationPoint(30.5F, -22.5F, 3F);

		bodyModel[99].addBox(0F, 0F, 0F, 79, 1, 1, 0F); // Box 179
		bodyModel[99].setRotationPoint(-41F, 0F, -11F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[100].setRotationPoint(-42F, -1F, -11F);

		bodyModel[101].addBox(0F, 0F, 0F, 12, 4, 21, 0F); // Box 178
		bodyModel[101].setRotationPoint(-16F, 3F, -10.5F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 12, 2, 19, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 173
		bodyModel[102].setRotationPoint(-16F, 7F, -9.5F);

		bodyModel[103].addShapeBox(-0.75F, 0F, -0.75F, 2, 1, 2, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 174
		bodyModel[103].setRotationPoint(-41F, -10.5F, -5.75F);
		bodyModel[103].rotateAngleX = 0.78539816F;
		bodyModel[103].rotateAngleY = -0.90757121F;
		bodyModel[103].rotateAngleZ = 0.03490659F;

		bodyModel[104].addShapeBox(-0.75F, 0F, -0.75F, 2, 1, 2, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 175
		bodyModel[104].setRotationPoint(38F, -18.5F, -5.75F);
		bodyModel[104].rotateAngleX = 0.78539816F;
		bodyModel[104].rotateAngleY = 0.89011792F;
		bodyModel[104].rotateAngleZ = 0.03490659F;

		bodyModel[105].addBox(0F, 0F, 0F, 17, 4, 21, 0F); // Box 176
		bodyModel[105].setRotationPoint(-3.5F, 3F, -10.5F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 17, 2, 19, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 177
		bodyModel[106].setRotationPoint(-3.5F, 7F, -9.5F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,-3F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -0.43F, 0F, 0F, -3F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -0.43F, 0F, 0F); // Box 186
		bodyModel[107].setRotationPoint(-26F, -21F, -7F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,-2F, -0.2F, 0F, 1F, -0.2F, 0F, 1F, 0F, 0F, 0.57F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0.57F, 0F, 0F); // Box 187
		bodyModel[108].setRotationPoint(-25F, -22F, -7F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.57F, 0F, 0F, -0.25F, 0.065F, 0F, 0F, 0.065F, 0F, 0F, 0F, 0F, 0.57F, 0F, 0F); // Box 188
		bodyModel[109].setRotationPoint(-25F, -23F, -3F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-2F, -1.2F, 0F, 1F, -1.2F, 0F, 1F, 0F, 0F, -0.25F, 0F, 0F, -2F, 0.2F, 0F, 1F, 0.2F, 0F, 1F, 0.065F, 0F, -0.24F, 0.065F, 0F); // Box 189
		bodyModel[110].setRotationPoint(-25F, -23F, -7F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0.57F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, 0.57F, 0F, 0F, 0F, 0F, 0F, 0F, 0.065F, 0F, -0.25F, 0.065F, 0F); // Box 192
		bodyModel[111].setRotationPoint(-25F, -23F, 1F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-0.25F, 0F, 0F, 1F, 0F, 0F, 1F, -1.2F, 0F, -2F, -1.2F, 0F, -0.24F, 0.065F, 0F, 1F, 0.065F, 0F, 1F, 0.2F, 0F, -2F, 0.2F, 0F); // Box 193
		bodyModel[112].setRotationPoint(-25F, -23F, 3F);

		bodyModel[113].addBox(-0.5F, -2F, -3.5F, 1, 2, 3, 0F); // Box 194
		bodyModel[113].setRotationPoint(-11.5F, -18F, 10.5F);

		bodyModel[114].addBox(-0.5F, 0F, -3.5F, 1, 12, 4, 0F); // Box 195
		bodyModel[114].setRotationPoint(-11.5F, -18F, 10.5F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 1, 2, 17, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 196
		bodyModel[115].setRotationPoint(-12F, -20F, -10F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 3, 0, 4, 0F,-1F, -1.2F, 0F, 0F, -1.2F, 0F, -2.85F, 0F, 0F, 0.5F, 0F, 0F, -1F, 1.2F, 0F, 0F, 1.2F, 0F, -2.85F, 0F, 0F, 0.5F, 0F, 0F); // Box 199
		bodyModel[116].setRotationPoint(-26F, -23F, -7F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 2, 0, 1, 0F,-0.35F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 200
		bodyModel[117].setRotationPoint(-25F, -21.8F, -8F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 1, 0, 2, 0F,-0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0.65F, 0.5F, 0F, -0.5F, 1F, 0F, 0F, 1F, 0F, 0F, -0.5F, 0F, 0.65F, -0.5F, 0F); // Box 201
		bodyModel[118].setRotationPoint(-24F, -21F, -10F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 1, 2, 0, 0F,-0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, -0.5F, 0F, 1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 202
		bodyModel[119].setRotationPoint(-24F, -20F, -11F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // SP cab headlight
		bodyModel[120].setRotationPoint(-27F, -21F, -2F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // SP cab headligh
		bodyModel[121].setRotationPoint(-27F, -21F, 0F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // cab headlight botm
		bodyModel[122].setRotationPoint(-26F, -21F, -1F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // cab headlight top
		bodyModel[123].setRotationPoint(-26F, -23F, -1F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // long hood headlight botm 
		bodyModel[124].setRotationPoint(39F, -20F, -1F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // long hood headlight top
		bodyModel[125].setRotationPoint(39F, -22F, -1F);

		bodyModel[126].addBox(0F, 0F, 0F, 15, 5, 14, 0F); // Box 215
		bodyModel[126].setRotationPoint(-38F, -13F, -7F);

		bodyModel[127].addBox(0F, 0F, 0F, 15, 5, 14, 0F); // Box 216
		bodyModel[127].setRotationPoint(-38F, -21F, -7F);

		bodyModel[128].addShapeBox(-0.75F, 0F, -0.75F, 2, 1, 2, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 217
		bodyModel[128].setRotationPoint(-41F, -18.5F, -5.75F);
		bodyModel[128].rotateAngleX = 0.78539816F;
		bodyModel[128].rotateAngleY = -0.90757121F;
		bodyModel[128].rotateAngleZ = 0.03490659F;

		bodyModel[129].addShapeBox(0F, 0F, 0F, 4, 3, 4, 0F,0F, -3F, 0F, -0.75F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 218
		bodyModel[129].setRotationPoint(-42F, -19F, -6F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,-2F, -2F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, 0F, -3F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 219
		bodyModel[130].setRotationPoint(-42F, -19F, -7F);

		bodyModel[131].addBox(0F, 0F, 0F, 4, 6, 4, 0F); // Box 220
		bodyModel[131].setRotationPoint(-42F, -22F, -2F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 4, 2, 5, 0F,-4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 221
		bodyModel[132].setRotationPoint(-42F, -21F, -7F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 4, 1, 5, 0F,-4F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 222
		bodyModel[133].setRotationPoint(-42F, -22F, -7F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 4, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -4F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); // Box 223
		bodyModel[134].setRotationPoint(-42F, -22F, 2F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 4, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); // Box 224
		bodyModel[135].setRotationPoint(-42F, -21F, 2F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 4, 3, 4, 0F,0F, 0F, 0F, -3F, 0F, 0F, -0.75F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 225
		bodyModel[136].setRotationPoint(-42F, -19F, 2F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, -3F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 226
		bodyModel[137].setRotationPoint(-42F, -19F, 6F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 15, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 227
		bodyModel[138].setRotationPoint(-38F, -22F, 2F);

		bodyModel[139].addBox(0F, 0F, 0F, 15, 1, 4, 0F); // Box 228
		bodyModel[139].setRotationPoint(-38F, -22F, -2F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 15, 1, 5, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 229
		bodyModel[140].setRotationPoint(-38F, -22F, -7F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 1, 8, 12, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 230
		bodyModel[141].setRotationPoint(-42F, -16F, -6F);

		bodyModel[142].addBox(0F, 0F, 0F, 18, 8, 14, 0F); // Box 232
		bodyModel[142].setRotationPoint(-41F, -16F, -7F);

		bodyModel[143].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Box 233
		bodyModel[143].setRotationPoint(-24F, -23F, -3F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // rsd15 high hood low headlight (top rsd17)
		bodyModel[144].setRotationPoint(-42.5F, -20F, -1F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // rsd15 high hood top headlight
		bodyModel[145].setRotationPoint(-42.5F, -22F, -1F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // nose headlight l
		bodyModel[146].setRotationPoint(-42.5F, -14F, -2F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // nose headlight r
		bodyModel[147].setRotationPoint(-42.5F, -14F, 0F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 18, 1, 5, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[148].setRotationPoint(-41F, -22F, -7F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 18, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
		bodyModel[149].setRotationPoint(-41F, -22F, 2F);

		bodyModel[150].addBox(0F, 0F, 0F, 19, 1, 4, 0F); // Box 28
		bodyModel[150].setRotationPoint(-42F, -22F, -2F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 63
		bodyModel[151].setRotationPoint(-42F, -22F, -7F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 64
		bodyModel[152].setRotationPoint(-42F, -22F, 2F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 243
		bodyModel[153].setRotationPoint(-42F, -21F, -6F);

		bodyModel[154].addBox(0F, 0F, 0F, 18, 5, 14, 0F); // Box 244
		bodyModel[154].setRotationPoint(-41F, -21F, -7F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 1, 2, 12, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 246
		bodyModel[155].setRotationPoint(38F, -21F, -6F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -1F, 0F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 247
		bodyModel[156].setRotationPoint(38F, -22F, -7F);

		bodyModel[157].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 248
		bodyModel[157].setRotationPoint(35F, -22F, -2F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 249
		bodyModel[158].setRotationPoint(38F, -22F, 2F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 3, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 250
		bodyModel[159].setRotationPoint(35F, -22F, 2F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 3, 1, 5, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 251
		bodyModel[160].setRotationPoint(35F, -22F, -7F);

		bodyModel[161].addBox(0F, 0F, 0F, 3, 5, 14, 0F); // Box 252
		bodyModel[161].setRotationPoint(35F, -21F, -7F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0.57F, 0F, 0F, 1F, 0F, 0F, 1F, -0.2F, 0F, -2F, -0.2F, 0F, 0.57F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F); // Box 253
		bodyModel[162].setRotationPoint(-25F, -22F, 1F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,-2F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0.57F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0.57F, 0F, 0F); // Box 255
		bodyModel[163].setRotationPoint(-25F, -23F, -7F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,0.05F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.05F, 0F, 0F); // Box 256
		bodyModel[164].setRotationPoint(-25.5F, -23F, -1F);

		bodyModel[165].addBox(0F, 0F, 0F, 18, 5, 14, 0F); // Box 258
		bodyModel[165].setRotationPoint(-41F, -13F, -7F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 1, 5, 12, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 259
		bodyModel[166].setRotationPoint(-42F, -13F, -6F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 260
		bodyModel[167].setRotationPoint(-42F, -14F, -7F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 18, 1, 5, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 261
		bodyModel[168].setRotationPoint(-41F, -14F, -7F);

		bodyModel[169].addBox(0F, 0F, 0F, 19, 1, 4, 0F); // Box 262
		bodyModel[169].setRotationPoint(-42F, -14F, -2F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 263
		bodyModel[170].setRotationPoint(-42F, -14F, 2F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 18, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 264
		bodyModel[171].setRotationPoint(-41F, -14F, 2F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, -1.5F, 1F, 0F, -1.5F, 1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 236
		bodyModel[172].setRotationPoint(-46F, -9F, 8F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 1, 0, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 237
		bodyModel[173].setRotationPoint(-43F, -1F, -8F);

		bodyModel[174].addBox(0F, 0F, 0F, 1, 5, 0, 0F); // Box 238
		bodyModel[174].setRotationPoint(-43F, -1F, 11.01F);

		bodyModel[175].addBox(0F, 0F, 0F, 0, 7, 2, 0F); // Box 239
		bodyModel[175].setRotationPoint(-42F, 1F, 9F);

		bodyModel[176].addBox(0F, 0F, 0F, 4, 0, 1, 0F); // Box 240
		bodyModel[176].setRotationPoint(-46F, 8F, 10F);

		bodyModel[177].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 243
		bodyModel[177].setRotationPoint(-46F, 7F, 10F);

		bodyModel[178].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 246
		bodyModel[178].setRotationPoint(-42F, -1F, 7F);

		bodyModel[179].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 249
		bodyModel[179].setRotationPoint(-46F, -1F, 7F);

		bodyModel[180].addShapeBox(0F, 0F, 0F, 1, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 250
		bodyModel[180].setRotationPoint(-43F, -1F, 7F);

		bodyModel[181].addBox(0F, 0F, 0F, 79, 1, 1, 0F); // Box 251
		bodyModel[181].setRotationPoint(-41F, 0F, 10F);

		bodyModel[182].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 259
		bodyModel[182].setRotationPoint(39F, -1F, 7F);

		bodyModel[183].addShapeBox(0F, 0F, 0F, 1, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 260
		bodyModel[183].setRotationPoint(39F, -1F, 7F);

		bodyModel[184].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 261
		bodyModel[184].setRotationPoint(38F, -1F, 7F);

		bodyModel[185].addBox(0F, 0F, 0F, 0, 6, 20, 0F); // Box 266
		bodyModel[185].setRotationPoint(43.01F, -1F, -10F);

		bodyModel[186].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 274
		bodyModel[186].setRotationPoint(39F, -1F, -9F);

		bodyModel[187].addShapeBox(0F, 0F, 0F, 1, 0, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 275
		bodyModel[187].setRotationPoint(39F, -1F, -8F);

		bodyModel[188].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 276
		bodyModel[188].setRotationPoint(38F, -1F, -11F);

		bodyModel[189].addBox(0F, 0F, 0F, 79, 1, 4, 0F); // Box 279
		bodyModel[189].setRotationPoint(-41F, -1F, -11F);

		bodyModel[190].addShapeBox(0F, 0F, 0F, 9, 5, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 280
		bodyModel[190].setRotationPoint(10F, -20F, -8F);

		bodyModel[191].addShapeBox(0F, 0F, 0F, 14, 13, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 281
		bodyModel[191].setRotationPoint(20F, -15F, -8F);

		bodyModel[192].addShapeBox(0F, 0F, 0F, 18, 2, 19, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 284
		bodyModel[192].setRotationPoint(-4F, 7F, -9.5F);

		bodyModel[193].addBox(0F, 0F, 0F, 18, 2, 21, 0F); // Box 285
		bodyModel[193].setRotationPoint(-4F, 5F, -10.5F);

		bodyModel[194].addBox(0F, 0F, 0F, 18, 2, 17, 0F); // Box 286
		bodyModel[194].setRotationPoint(-4F, 3F, -8.5F);

		bodyModel[195].addBox(0F, 0F, 0F, 12, 1, 3, 0F); // Box 287
		bodyModel[195].setRotationPoint(-16F, 2F, -10.5F);

		bodyModel[196].addBox(0F, 0F, 0F, 12, 1, 3, 0F); // Box 289
		bodyModel[196].setRotationPoint(-16F, 2F, 7.5F);

		bodyModel[197].addBox(0F, 0F, 0F, 1, 4, 2, 0F); // Box 290
		bodyModel[197].setRotationPoint(-24F, -23F, -1F);

		bodyModel[198].addShapeBox(0F, 0F, 0F, 17, 4, 4, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 560
		bodyModel[198].setRotationPoint(-3.5F, 1F, -11F);

		bodyModel[199].addShapeBox(0F, 0F, 0F, 17, 4, 4, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 292
		bodyModel[199].setRotationPoint(-3.5F, 1F, 7F);

		bodyModel[200].addBox(0F, 0F, 0F, 17, 1, 3, 0F); // Box 293
		bodyModel[200].setRotationPoint(-3.5F, 2F, 7.5F);

		bodyModel[201].addBox(0F, 0F, 0F, 17, 1, 3, 0F); // Box 294
		bodyModel[201].setRotationPoint(-3.5F, 2F, -10.5F);

		bodyModel[202].addShapeBox(0F, 0F, 0F, 9, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 295
		bodyModel[202].setRotationPoint(10F, -20F, 7F);

		bodyModel[203].addShapeBox(0F, 0F, 0F, 14, 13, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 296
		bodyModel[203].setRotationPoint(20F, -15F, 7F);

		bodyModel[204].addBox(0F, 0F, 0F, 15, 2, 9, 0F); // Box 297
		bodyModel[204].setRotationPoint(-3.5F, -23F, -4.5F);

		bodyModel[205].addBox(0F, 0F, 0F, 1, 5, 0, 0F); // Box 306
		bodyModel[205].setRotationPoint(39F, -1F, 11.01F);

		bodyModel[206].addBox(0F, 0F, 0F, 1, 5, 0, 0F); // Box 307
		bodyModel[206].setRotationPoint(39F, -1F, -11F);

		bodyModel[207].addShapeBox(0F, 0F, 0F, 17, 2, 16, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 308
		bodyModel[207].setRotationPoint(-3F, 7F, -9.5F);

		bodyModel[208].addShapeBox(0F, 0F, 0F, 16, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 309
		bodyModel[208].setRotationPoint(-2.5F, 1F, 6.5F);

		bodyModel[209].addShapeBox(0F, 0F, 0F, 17, 4, 17, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 310
		bodyModel[209].setRotationPoint(-3F, 3F, -10.5F);

		bodyModel[210].addBox(0F, 0F, 0F, 17, 1, 3, 0F); // Box 311
		bodyModel[210].setRotationPoint(-3F, 2F, -10.5F);

		bodyModel[211].addBox(0F, 0F, 0F, 1, 7, 0, 0F); // Box 313
		bodyModel[211].setRotationPoint(-1F, 1F, 9.51F);

		bodyModel[212].addBox(0F, 0F, 0F, 1, 7, 0, 0F); // Box 314
		bodyModel[212].setRotationPoint(11F, 1F, 9.51F);

		bodyModel[213].addShapeBox(0F, 0F, 0F, 16, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 315
		bodyModel[213].setRotationPoint(-2.5F, 5F, 6.5F);

		bodyModel[214].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 316
		bodyModel[214].setRotationPoint(13.51F, 0F, 7.49F);

		bodyModel[215].addBox(0F, 0F, 0F, 8, 5, 4, 0F); // Box 259
		bodyModel[215].setRotationPoint(-40F, -6F, 7F);

		bodyModel[216].addShapeBox(0F, 0F, 0F, 5, 1, 0, 0F,0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F); // Box 260
		bodyModel[216].setRotationPoint(-42F, -14F, 11F);

		bodyModel[217].addShapeBox(0F, 0F, 0F, 5, 1, 0, 0F,0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F); // Box 261
		bodyModel[217].setRotationPoint(-36F, -14F, 11F);

		bodyModel[218].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 263
		bodyModel[218].setRotationPoint(-3.49F, 0F, 7.49F);

		bodyModel[219].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 268
		bodyModel[219].setRotationPoint(8F, 0F, -9.51000000000001F);

		bodyModel[220].addShapeBox(0F, 0F, 0F, 3, 3, 17, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 269
		bodyModel[220].setRotationPoint(7F, 3F, -8.5F);

		bodyModel[221].addShapeBox(0F, 0F, 0F, 3, 3, 17, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 270
		bodyModel[221].setRotationPoint(11F, 3F, -8.5F);

		bodyModel[222].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 271
		bodyModel[222].setRotationPoint(12F, 0F, -9.51000000000001F);

		bodyModel[223].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 272
		bodyModel[223].setRotationPoint(12F, 0F, 8.50999999999999F);

		bodyModel[224].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 273
		bodyModel[224].setRotationPoint(8F, 0F, 8.50999999999999F);

		bodyModel[225].addBox(0F, 0F, 0F, 10, 4, 21, 0F); // Box 274
		bodyModel[225].setRotationPoint(-4F, 3F, -10.5F);

		bodyModel[226].addShapeBox(0F, 0F, 0F, 10, 2, 19, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 275
		bodyModel[226].setRotationPoint(-4F, 7F, -9.5F);

		bodyModel[227].addBox(0F, 0F, 0F, 10, 1, 3, 0F); // Box 276
		bodyModel[227].setRotationPoint(-4F, 2F, -10.5F);

		bodyModel[228].addBox(0F, 0F, 0F, 10, 1, 3, 0F); // Box 277
		bodyModel[228].setRotationPoint(-4F, 2F, 7.5F);

		bodyModel[229].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 278
		bodyModel[229].setRotationPoint(-2F, 0F, 8.51000000000001F);

		bodyModel[230].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 279
		bodyModel[230].setRotationPoint(2F, 0F, 8.51000000000001F);

		bodyModel[231].addShapeBox(0F, 0F, 0F, 3, 3, 17, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 280
		bodyModel[231].setRotationPoint(1F, 3F, -8.5F);

		bodyModel[232].addShapeBox(0F, 0F, 0F, 3, 3, 17, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 281
		bodyModel[232].setRotationPoint(-3F, 3F, -8.5F);

		bodyModel[233].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 282
		bodyModel[233].setRotationPoint(-2F, 0F, -9.51000000000001F);

		bodyModel[234].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 283
		bodyModel[234].setRotationPoint(2F, 0F, -9.51000000000001F);

		bodyModel[235].addBox(0F, 0F, 0F, 15, 0, 14, 0F); // Box 284
		bodyModel[235].setRotationPoint(19.5F, -22.55F, -7F);

		bodyModel[236].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3.5F, 0F, 0F, 3.5F, 0F, 0F, 3.5F, 0F, 0F, 3.5F); // Box 285
		bodyModel[236].setRotationPoint(-23F, -22F, -3F);

		bodyModel[237].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 115
		bodyModel[237].setRotationPoint(-44F, 5F, -3F);

		bodyModel[238].addBox(0F, 0F, 0F, 2, 4, 6, 0F); // Box 141
		bodyModel[238].setRotationPoint(-46F, 3F, -3F);

		bodyModel[239].addBox(0F, 0F, 0F, 2, 2, 6, 0F); // Box 141
		bodyModel[239].setRotationPoint(-44F, 3F, -3F);

		bodyModel[240].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 289
		bodyModel[240].setRotationPoint(39F, 5F, -3F);

		bodyModel[241].addBox(0F, 0F, 0F, 2, 4, 6, 0F); // Box 290
		bodyModel[241].setRotationPoint(41F, 3F, -3F);

		bodyModel[242].addBox(0F, 0F, 0F, 2, 2, 6, 0F); // Box 291
		bodyModel[242].setRotationPoint(39F, 3F, -3F);

		bodyModel[243].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 245
		bodyModel[243].setRotationPoint(-31F, 1F, -11F);

		bodyModel[244].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 246
		bodyModel[244].setRotationPoint(-30F, 0F, -10F);

		bodyModel[245].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 247
		bodyModel[245].setRotationPoint(-31F, 1F, 10F);

		bodyModel[246].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 557
		bodyModel[246].setRotationPoint(-30F, 0F, 7F);

		bodyModel[247].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 296
		bodyModel[247].setRotationPoint(24F, 1F, -11F);

		bodyModel[248].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 297
		bodyModel[248].setRotationPoint(25F, 0F, -10F);

		bodyModel[249].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 298
		bodyModel[249].setRotationPoint(24F, 1F, 10F);

		bodyModel[250].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 299
		bodyModel[250].setRotationPoint(25F, 0F, 7F);

		bodyModel[251].addBox(0F, 0F, 0F, 0, 10, 1, 0F); // Box 310
		bodyModel[251].setRotationPoint(-46F, -11F, -3F);

		bodyModel[252].addBox(0F, 0F, 0F, 0, 10, 1, 0F); // Box 311
		bodyModel[252].setRotationPoint(-46F, -11F, 2F);

		bodyModel[253].addBox(0F, 0F, 0F, 0, 3, 4, 0F); // Box 312
		bodyModel[253].setRotationPoint(-46F, -10F, -2F);

		bodyModel[254].addBox(0F, 0F, 0F, 0, 8, 4, 0F); // Box 313
		bodyModel[254].setRotationPoint(-46F, -9F, 3F);

		bodyModel[255].addBox(0F, 0F, 0F, 0, 8, 4, 0F); // Box 315
		bodyModel[255].setRotationPoint(43F, -9F, -7F);

		bodyModel[256].addBox(0F, 0F, 0F, 0, 10, 1, 0F); // Box 316
		bodyModel[256].setRotationPoint(43F, -11F, -3F);

		bodyModel[257].addBox(0F, 0F, 0F, 0, 3, 4, 0F); // Box 317
		bodyModel[257].setRotationPoint(43F, -10F, -2F);

		bodyModel[258].addBox(0F, 0F, 0F, 0, 10, 1, 0F); // Box 318
		bodyModel[258].setRotationPoint(43F, -11F, 2F);

		bodyModel[259].addBox(0F, 0F, 0F, 0, 8, 4, 0F); // Box 319
		bodyModel[259].setRotationPoint(43F, -9F, 3F);

		bodyModel[260].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, -1.5F, 1F, 0F, -1.5F, 1F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 320
		bodyModel[260].setRotationPoint(43F, -9F, -9F);

		bodyModel[261].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, -1.5F, 1F, 0F, -1.5F, 1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 321
		bodyModel[261].setRotationPoint(43F, -9F, 8F);

		bodyModel[262].addShapeBox(0F, 0F, 0F, 0, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // brake wheew
		bodyModel[262].setRotationPoint(-42.5F, -10F, -1.75F);

		bodyModel[263].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 323
		bodyModel[263].setRotationPoint(-43F, -8.75F, -0.5F);

		bodyModel[264].addBox(-3F, 0F, 0F, 3, 0, 4, 0F); // Box 324
		bodyModel[264].setRotationPoint(-46F, -1F, -2F);

		bodyModel[265].addShapeBox(-3F, -1F, 0F, 3, 1, 0, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 325
		bodyModel[265].setRotationPoint(-46F, -1F, -2F);

		bodyModel[266].addShapeBox(-3F, -1F, 4F, 3, 1, 0, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 326
		bodyModel[266].setRotationPoint(-46F, -1F, -2F);

		bodyModel[267].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 0
		bodyModel[267].setRotationPoint(-50F, 3F, -1.5F);

		bodyModel[268].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[268].setRotationPoint(-47F, 2.5F, -2F);

		bodyModel[269].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 329
		bodyModel[269].setRotationPoint(43F, 2.5F, -2F);

		bodyModel[270].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 330
		bodyModel[270].setRotationPoint(44F, 3F, -1.5F);

		bodyModel[271].addShapeBox(0F, -1F, 0F, 3, 1, 0, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 331
		bodyModel[271].setRotationPoint(43F, -1F, -2F);

		bodyModel[272].addShapeBox(0F, -1F, 4F, 3, 1, 0, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 332
		bodyModel[272].setRotationPoint(43F, -1F, -2F);

		bodyModel[273].addBox(0F, 0F, 0F, 3, 0, 4, 0F); // Box 333
		bodyModel[273].setRotationPoint(43F, -1F, -2F);

		bodyModel[274].addShapeBox(-0.75F, 0F, -1.25F, 2, 1, 2, 0F,0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // sandcap
		bodyModel[274].setRotationPoint(38F, -18.5F, 5.75F);
		bodyModel[274].rotateAngleX = 0.78539816F;
		bodyModel[274].rotateAngleY = 2.14675498F;
		bodyModel[274].rotateAngleZ = 0.03490659F;

		bodyModel[275].addBox(0F, 0F, 0F, 1, 3, 2, 0F); // Box 337
		bodyModel[275].setRotationPoint(-46F, -4F, -6.5F);

		bodyModel[276].addBox(0F, 0F, 0F, 1, 3, 2, 0F); // Box 338
		bodyModel[276].setRotationPoint(42F, -4F, 4.5F);

		bodyModel[277].addShapeBox(0F, 0F, 0F, 1, 3, 7, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 339
		bodyModel[277].setRotationPoint(-47F, 5F, -11F);

		bodyModel[278].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 340
		bodyModel[278].setRotationPoint(-46F, 3F, -11F);

		bodyModel[279].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 342
		bodyModel[279].setRotationPoint(-46F, 3F, 10F);

		bodyModel[280].addBox(0F, 0F, 0F, 4, 0, 1, 0F); // Box 343
		bodyModel[280].setRotationPoint(-46F, 5.5F, 9.5F);

		bodyModel[281].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 344
		bodyModel[281].setRotationPoint(-46F, 4.5F, 9.5F);

		bodyModel[282].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 345
		bodyModel[282].setRotationPoint(-46F, 2F, 9F);

		bodyModel[283].addBox(0F, 0F, 0F, 4, 0, 1, 0F); // Box 346
		bodyModel[283].setRotationPoint(-46F, 3F, 9F);

		bodyModel[284].addBox(0F, 0F, 0F, 0, 3, 22, 0F); // Box 348
		bodyModel[284].setRotationPoint(43.01F, 5F, -11F);

		bodyModel[285].addBox(0F, 0F, 0F, 0, 1, 18, 0F); // Box 351
		bodyModel[285].setRotationPoint(43.02F, 8F, -9F);

		bodyModel[286].addShapeBox(-0.75F, 0F, -1.25F, 2, 1, 2, 0F,0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 353
		bodyModel[286].setRotationPoint(-41F, -10.5F, 5.75F);
		bodyModel[286].rotateAngleX = 0.78539816F;
		bodyModel[286].rotateAngleY = -2.35619449F;
		bodyModel[286].rotateAngleZ = 0.03490659F;

		bodyModel[287].addBox(0F, 0F, 0F, 4, 0, 1, 0F); // Box 310
		bodyModel[287].setRotationPoint(39F, 0.5F, -10F);

		bodyModel[288].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 311
		bodyModel[288].setRotationPoint(39F, 2F, -9F);

		bodyModel[289].addBox(0F, 0F, 0F, 4, 0, 1, 0F); // Box 312
		bodyModel[289].setRotationPoint(39F, 3F, -10F);

		bodyModel[290].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 313
		bodyModel[290].setRotationPoint(39F, 4.5F, -9.5F);

		bodyModel[291].addBox(0F, 0F, 0F, 4, 0, 1, 0F); // Box 314
		bodyModel[291].setRotationPoint(39F, 5.5F, -10.5F);

		bodyModel[292].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 315
		bodyModel[292].setRotationPoint(39F, 7F, -10F);

		bodyModel[293].addBox(0F, 0F, 0F, 4, 0, 1, 0F); // Box 316
		bodyModel[293].setRotationPoint(39F, 8F, -11F);

		bodyModel[294].addBox(0F, 0F, 0F, 4, 0, 1, 0F); // Box 317
		bodyModel[294].setRotationPoint(39F, 0.5F, 9F);

		bodyModel[295].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 318
		bodyModel[295].setRotationPoint(39F, 2F, 9F);

		bodyModel[296].addBox(0F, 0F, 0F, 4, 0, 1, 0F); // Box 319
		bodyModel[296].setRotationPoint(39F, 3F, 9F);

		bodyModel[297].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 320
		bodyModel[297].setRotationPoint(39F, 4.5F, 9.5F);

		bodyModel[298].addBox(0F, 0F, 0F, 4, 0, 1, 0F); // Box 321
		bodyModel[298].setRotationPoint(39F, 5.5F, 9.5F);

		bodyModel[299].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 322
		bodyModel[299].setRotationPoint(39F, 7F, 10F);

		bodyModel[300].addBox(0F, 0F, 0F, 4, 0, 1, 0F); // Box 323
		bodyModel[300].setRotationPoint(39F, 8F, 10F);

		bodyModel[301].addBox(0F, 0F, 0F, 0, 7, 2, 0F); // Box 324
		bodyModel[301].setRotationPoint(39F, 1F, -11F);

		bodyModel[302].addBox(0F, 0F, 0F, 0, 7, 2, 0F); // Box 325
		bodyModel[302].setRotationPoint(39F, 1F, 9F);

		bodyModel[303].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 326
		bodyModel[303].setRotationPoint(-24.5F, -25F, -0.25F);

		bodyModel[304].addBox(0F, -1F, -2F, 1, 1, 2, 0F); // Box 328
		bodyModel[304].setRotationPoint(-8F, -22F, -2F);
		bodyModel[304].rotateAngleX = 0.19198622F;

		bodyModel[305].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 329
		bodyModel[305].setRotationPoint(-9.5F, -23F, -3F);

		bodyModel[306].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 330
		bodyModel[306].setRotationPoint(-9F, -23F, -4.5F);

		bodyModel[307].addBox(0F, 0F, 0F, 7, 1, 4, 0F); // Box 233
		bodyModel[307].setRotationPoint(12F, -22.5F, -2F);

		bodyModel[308].addBox(0F, 0F, -3F, 7, 1, 3, 0F); // Box 234
		bodyModel[308].setRotationPoint(12F, -22.5F, -2F);
		bodyModel[308].rotateAngleX = 0.19198622F;

		bodyModel[309].addBox(0F, 0F, 0F, 7, 1, 3, 0F); // Box 235
		bodyModel[309].setRotationPoint(12F, -22.5F, 2F);
		bodyModel[309].rotateAngleX = -0.19198622F;

		bodyModel[310].addShapeBox(0F, 0F, -2.5F, 0, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // cab numberboard l
		bodyModel[310].setRotationPoint(-24.25F, -21.25F, -4.25F);
		bodyModel[310].rotateAngleY = 0.41887902F;

		bodyModel[311].addShapeBox(0F, 0F, -2.5F, 0, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // cab numberboard r
		bodyModel[311].setRotationPoint(-24.3F, -21.25F, 4.25F);
		bodyModel[311].rotateAngleY = -0.40142573F;

		bodyModel[312].addShapeBox(0F, 0F, -2.5F, 0, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // long hood numberboard l
		bodyModel[312].setRotationPoint(37.25F, -21F, -4.25F);
		bodyModel[312].rotateAngleY = -0.66322512F;

		bodyModel[313].addShapeBox(0F, 0F, -2.5F, 0, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // long hood numberboard r
		bodyModel[313].setRotationPoint(37.15F, -21F, 4.40000000000001F);
		bodyModel[313].rotateAngleY = 0.66322512F;

		bodyModel[314].addShapeBox(0F, 0F, 0F, 3, 3, 8, 0F,0F, -2F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 340
		bodyModel[314].setRotationPoint(-48.5F, 5F, -4F);

		bodyModel[315].addShapeBox(0F, 0F, 0F, 2, 0, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 341
		bodyModel[315].setRotationPoint(-48.5F, 8F, -11F);

		bodyModel[316].addShapeBox(-0.75F, 0F, -1.25F, 2, 1, 2, 0F,0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 343
		bodyModel[316].setRotationPoint(-41F, -18.5F, 5.75F);
		bodyModel[316].rotateAngleX = 0.78539816F;
		bodyModel[316].rotateAngleY = -2.35619449F;
		bodyModel[316].rotateAngleZ = 0.03490659F;

		bodyModel[317].addShapeBox(0F, 0F, 0F, 7, 2, 1, 0F,1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -1F, 1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // box64
		bodyModel[317].setRotationPoint(-21F, -18F, 11F);
		bodyModel[317].rotateAngleX = 0.26179939F;

		bodyModel[318].addShapeBox(0F, 0F, 0F, 7, 2, 1, 0F,1F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // box65
		bodyModel[318].setRotationPoint(-21F, -18.25F, -11.97F);
		bodyModel[318].rotateAngleX = -0.26179939F;

		bodyModel[319].addShapeBox(0F, 0F, -1F, 2, 1, 1, 0F,0.3F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, 0.3F, -0.5F, 0.1F, 0.3F, 0F, 0.1F, -1F, 0F, 0.1F, -1F, 0F, 0.1F, 0.3F, 0F, 0.1F); // Box 327
		bodyModel[319].setRotationPoint(-19.34F, -24F, 0.5F);

		bodyModel[320].addShapeBox(0F, -1F, -1F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // commander beacon
		bodyModel[320].setRotationPoint(-19.5F, -24F, 0.5F);

		bodyModel[321].addBox(0F, 0F, 0F, 1, 2, 3, 0F); // Box 613
		bodyModel[321].setRotationPoint(-27.55F, -23F, -1.5F);

		bodyModel[322].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // sp emergency
		bodyModel[322].setRotationPoint(-27.8F, -23F, -1F);

		bodyModel[323].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 319
		bodyModel[323].setRotationPoint(-21F, -25F, -1.5F);

		bodyModel[324].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 320
		bodyModel[324].setRotationPoint(-21F, -24F, -1.5F);

		bodyModel[325].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 321
		bodyModel[325].setRotationPoint(-23F, -24.5F, -0.5F);

		bodyModel[326].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 322
		bodyModel[326].setRotationPoint(-23F, -24.5F, -2.5F);

		bodyModel[327].addShapeBox(0F, 0F, -2.5F, 0, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // SP cab mount numberboard
		bodyModel[327].setRotationPoint(-25.01F, -21.25F, -4.25F);
		bodyModel[327].rotateAngleY = 0.61086524F;

		bodyModel[328].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // underbell2
		bodyModel[328].setRotationPoint(-21.5F, 1F, -9.3F);

		bodyModel[329].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // underbell1
		bodyModel[329].setRotationPoint(-21.5F, 0F, -9.3F);

		bodyModel[330].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // underbellclappa
		bodyModel[330].setRotationPoint(-21.25F, 1.5F, -9.05F);

		bodyModel[331].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Box 365
		bodyModel[331].setRotationPoint(-12F, -22F, -3F);

		bodyModel[332].addBox(0F, 0F, 0F, 5, 3, 8, 0F); // Box 366
		bodyModel[332].setRotationPoint(-22F, -24F, -4F);

		bodyModel[333].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 252
		bodyModel[333].setRotationPoint(-46.5F, -1F, -6.75F);

		bodyModel[334].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // A&MT ditchlight l
		bodyModel[334].setRotationPoint(-46.75F, -1F, -6.75F);

		bodyModel[335].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 361
		bodyModel[335].setRotationPoint(-46.5F, -1F, 4.75F);

		bodyModel[336].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // A&MT ditchlight r
		bodyModel[336].setRotationPoint(-46.75F, -1F, 4.75F);

		bodyModel[337].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 238
		bodyModel[337].setRotationPoint(-42F, -14.5F, -1F);

		bodyModel[338].addShapeBox(0F, 0F, -2.5F, 0, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // high hood numberboard r
		bodyModel[338].setRotationPoint(-40.25F, -21F, -4.25F);
		bodyModel[338].rotateAngleY = 0.68067841F;

		bodyModel[339].addShapeBox(0F, 0F, -2.5F, 0, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // high hood numberboard l
		bodyModel[339].setRotationPoint(-40.2F, -21F, 4.40000000000001F);
		bodyModel[339].rotateAngleY = -0.66322512F;

		bodyModel[340].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 586
		bodyModel[340].setRotationPoint(-32F, 3F, -2F);

		bodyModel[341].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 587
		bodyModel[341].setRotationPoint(24F, 3F, -2F);

		bodyModel[342].addBox(0F, 0F, 0F, 73, 4, 0, 0F); // Box 588
		bodyModel[342].setRotationPoint(-38F, -24.5F, 5F);

		bodyModel[343].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 589
		bodyModel[343].setRotationPoint(-42F, -23.5F, 0.5F);

		bodyModel[344].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 590
		bodyModel[344].setRotationPoint(-41.5F, -24F, -0.5F);

		bodyModel[345].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 591
		bodyModel[345].setRotationPoint(-41F, -23F, -0.5F);

		bodyModel[346].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 592
		bodyModel[346].setRotationPoint(-43F, -23.5F, -1.5F);

		bodyModel[347].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 593
		bodyModel[347].setRotationPoint(-8.5F, -24.5F, -1.5F);

		bodyModel[348].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 594
		bodyModel[348].setRotationPoint(-8F, -22.5F, -1.5F);

		bodyModel[349].addShapeBox(0F, 0F, 0F, 1, 0, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 376
		bodyModel[349].setRotationPoint(34F, -21.75F, 5F);
		bodyModel[349].rotateAngleX = -0.19198622F;

		bodyModel[350].addBox(0F, 0F, 0F, 1, 3, 0, 0F); // Box 377
		bodyModel[350].setRotationPoint(34F, -21.3F, 7.25F);

		bodyModel[351].addShapeBox(0F, 0F, 0F, 1, 3, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 378
		bodyModel[351].setRotationPoint(34F, -18.3F, 7.25F);

		bodyModel[352].addBox(0F, 0F, 0F, 1, 15, 0, 0F); // Box 379
		bodyModel[352].setRotationPoint(35F, -15.3F, 7.25F);

		bodyModel[353].addBox(0F, 0F, 0F, 9, 0, 4, 0F); // Box 380
		bodyModel[353].setRotationPoint(-6F, -6F, 7F);

		bodyModel[354].addBox(0F, 0F, 0F, 0, 5, 4, 0F); // Box 381
		bodyModel[354].setRotationPoint(3F, -6F, 7F);

		bodyModel[355].addBox(0F, 0F, 0F, 3, 4, 4, 0F); // Box 382
		bodyModel[355].setRotationPoint(-0.5F, -5F, 7F);

		bodyModel[356].addBox(0F, 0F, 0F, 3, 4, 4, 0F); // Box 383
		bodyModel[356].setRotationPoint(-5.5F, -5F, 7F);

		bodyModel[357].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 385
		bodyModel[357].setRotationPoint(-29F, -22.5F, -5.5F);

		bodyModel[358].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 386
		bodyModel[358].setRotationPoint(-36F, -23F, -1F);

		bodyModel[359].addShapeBox(0F, 0F, 0F, 5, 1, 0, 0F,0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F); // Box 387
		bodyModel[359].setRotationPoint(2F, -14F, 11F);

		bodyModel[360].addShapeBox(0F, 0F, 0F, 1, 3, 7, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 388
		bodyModel[360].setRotationPoint(-47F, 5F, 4F);

		bodyModel[361].addShapeBox(0F, 0F, 0F, 3, 3, 8, 0F,-0.5F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 389
		bodyModel[361].setRotationPoint(42.5F, 5F, -4F);

		bodyModel[362].addShapeBox(0F, 0F, 0F, 1, 3, 7, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 390
		bodyModel[362].setRotationPoint(43F, 5F, -11F);

		bodyModel[363].addShapeBox(0F, 0F, 0F, 2, 0, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 391
		bodyModel[363].setRotationPoint(43.5F, 8F, -11F);

		bodyModel[364].addShapeBox(0F, 0F, 0F, 1, 3, 7, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 392
		bodyModel[364].setRotationPoint(43F, 5F, 4F);

		bodyModel[365].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 397
		bodyModel[365].setRotationPoint(-42F, -17F, -6F);

		bodyModel[366].addBox(0F, 0F, 0F, 2, 2, 6, 0F); // Box 400
		bodyModel[366].setRotationPoint(-42F, -19F, -3F);

		bodyModel[367].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,1.5F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.25F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Box 403
		bodyModel[367].setRotationPoint(-42F, -19F, 3F);

		bodyModel[368].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.25F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0.5F); // Box 407
		bodyModel[368].setRotationPoint(38F, -19F, -7F);

		bodyModel[369].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 408
		bodyModel[369].setRotationPoint(38F, -17F, -6F);

		bodyModel[370].addBox(0F, 0F, 0F, 1, 2, 6, 0F); // Box 409
		bodyModel[370].setRotationPoint(38F, -19F, -3F);

		bodyModel[371].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 411
		bodyModel[371].setRotationPoint(-25F, -24F, -0.5F);

		bodyModel[372].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 412
		bodyModel[372].setRotationPoint(-27F, -23.5F, 0.5F);

		bodyModel[373].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 413
		bodyModel[373].setRotationPoint(-25F, -23F, -0.5F);

		bodyModel[374].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // rsd17 headlight low top
		bodyModel[374].setRotationPoint(-42.5F, -14F, -1F);

		bodyModel[375].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // rsd17 headlight low bottom
		bodyModel[375].setRotationPoint(-42.5F, -12F, -1F);

		bodyModel[376].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 114
		bodyModel[376].setRotationPoint(-27.5F, -21.75F, -0.5F);

		bodyModel[377].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[377].setRotationPoint(-27.5F, -22.75F, -0.5F);

		bodyModel[378].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 78
		bodyModel[378].setRotationPoint(-27.25F, -21.25F, -0.25F);

		bodyModel[379].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 875
		bodyModel[379].setRotationPoint(-27.5F, -23F, -1F);

		bodyModel[380].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 876
		bodyModel[380].setRotationPoint(-27.5F, -23F, 1F);

		bodyModel[381].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 877
		bodyModel[381].setRotationPoint(-27.25F, -23.25F, -1.5F);

		bodyModel[382].addBox(0F, 0F, 0F, 2, 0, 2, 0F); // Box 481
		bodyModel[382].setRotationPoint(-27.5F, -23F, -1F);

		bodyModel[383].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 409
		bodyModel[383].setRotationPoint(-26F, -23F, -1.5F);

		bodyModel[384].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 410
		bodyModel[384].setRotationPoint(17F, -24.5F, -0.5F);

		bodyModel[385].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 411
		bodyModel[385].setRotationPoint(15F, -24F, 0.5F);

		bodyModel[386].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 412
		bodyModel[386].setRotationPoint(15.5F, -23.5F, -1.5F);

		bodyModel[387].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 413
		bodyModel[387].setRotationPoint(17F, -23.5F, -0.5F);

		bodyModel[388].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, 0F, 0.5F, 1.5F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 1.5F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 414
		bodyModel[388].setRotationPoint(38F, -19F, 3F);

		bodyModel[389].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 1.5F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 1.5F, 0F, 0F); // Box 415
		bodyModel[389].setRotationPoint(-42F, -19F, -7F);

		bodyModel[390].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 417
		bodyModel[390].setRotationPoint(-24F, -20F, -2F);

		bodyModel[391].addBox(0F, 0F, 0F, 4, 6, 2, 0F); // Box 413
		bodyModel[391].setRotationPoint(-19.5F, -12F, -4F);

		bodyModel[392].addBox(0F, 0F, 0F, 3, 2, 2, 0F); // Box 418
		bodyModel[392].setRotationPoint(-19.5F, -14F, -4F);

		bodyModel[393].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 419
		bodyModel[393].setRotationPoint(-21.5F, -12F, -4F);

		bodyModel[394].addBox(-1F, 0F, -1F, 2, 3, 1, 0F); // Box 420
		bodyModel[394].setRotationPoint(-20.5F, -15F, -2F);
		bodyModel[394].rotateAngleY = -0.76794487F;

		bodyModel[395].addBox(0F, 0F, 0F, 2, 9, 6, 0F); // Box 421
		bodyModel[395].setRotationPoint(-21.5F, -13F, -1F);

		bodyModel[396].addBox(0F, 0F, 0F, 1, 6, 2, 0F); // Box 423
		bodyModel[396].setRotationPoint(-20.5F, -12F, 5F);

		bodyModel[397].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // PRR cab siignalling
		bodyModel[397].setRotationPoint(-22F, -21F, -1F);

		bodyModel[398].addShapeBox(0F, -1F, -1F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // commander beacon
		bodyModel[398].setRotationPoint(-13.5F, -24F, 0.5F);

		bodyModel[399].addShapeBox(0F, 0F, -1F, 2, 1, 1, 0F,0.3F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, 0.3F, -0.5F, 0.1F, 0.3F, 0F, 0.1F, -1F, 0F, 0.1F, -1F, 0F, 0.1F, 0.3F, 0F, 0.1F); // Box 428
		bodyModel[399].setRotationPoint(-13.34F, -24F, 0.5F);

		bodyModel[400].addBox(0F, 0F, 0F, 7, 6, 3, 0F); // Box 429
		bodyModel[400].setRotationPoint(-31F, -12F, 7F);

		bodyModel[401].addShapeBox(0F, 0F, 0F, 1, 3, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 430
		bodyModel[401].setRotationPoint(-38F, -18.3F, 7.25F);

		bodyModel[402].addBox(0F, 0F, 0F, 1, 3, 0, 0F); // Box 431
		bodyModel[402].setRotationPoint(-38F, -21.3F, 7.25F);

		bodyModel[403].addShapeBox(0F, 0F, 0F, 1, 0, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 432
		bodyModel[403].setRotationPoint(-38F, -21.75F, 5F);
		bodyModel[403].rotateAngleX = -0.19198622F;

		bodyModel[404].addBox(0F, 0F, 0F, 1, 15, 0, 0F); // Box 433
		bodyModel[404].setRotationPoint(-39F, -15.3F, 7.25F);

		bodyModel[405].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 293
		bodyModel[405].setRotationPoint(-23.5F, -22.5F, 8F);

		bodyModel[406].addBox(0F, 0F, -2F, 1, 1, 2, 0F); // Box 294
		bodyModel[406].setRotationPoint(-21.5F, -21F, 10F);
		bodyModel[406].rotateAngleX = -0.64577182F;

		bodyModel[407].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 295
		bodyModel[407].setRotationPoint(-23F, -22F, 9.5F);

		bodyModel[408].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 437
		bodyModel[408].setRotationPoint(-21F, -23F, 9F);

		bodyModel[409].addBox(0F, 0F, 0F, 40, 4, 0, 0F); // Box 438
		bodyModel[409].setRotationPoint(-22F, -24.5F, -5F);

		bodyModel[410].addBox(0F, 0F, 0F, 1, 14, 0, 0F); // Box 439
		bodyModel[410].setRotationPoint(2F, -21.3F, -7.25F);

		bodyModel[411].addShapeBox(0F, 0F, -3F, 1, 0, 3, 0F,0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 440
		bodyModel[411].setRotationPoint(2F, -21.75F, -5F);
		bodyModel[411].rotateAngleX = 0.19198622F;

		bodyModel[412].addBox(0F, 0F, 0F, 4, 7, 3, 0F); // Box 441
		bodyModel[412].setRotationPoint(0F, -8F, -10F);

		bodyModel[413].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 442
		bodyModel[413].setRotationPoint(-4F, -7.3F, -7.25F);

		bodyModel[414].addBox(0F, 0F, 0F, 1, 5, 0, 0F); // Box 443
		bodyModel[414].setRotationPoint(-4F, -12.3F, -7.25F);

		bodyModel[415].addBox(0F, 0F, 0F, 7, 1, 0, 0F); // Box 444
		bodyModel[415].setRotationPoint(-11F, -12.3F, -7.25F);

		bodyModel[416].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // cabroof sinclair
		bodyModel[416].setRotationPoint(-18.5F, -24F, 0F);

		bodyModel[417].addBox(0F, 0F, 0F, 5, 3, 4, 0F); // Box 380
		bodyModel[417].setRotationPoint(-9.5F, -23F, 2F);

		bodyModel[418].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 453
		bodyModel[418].setRotationPoint(-11F, -22F, 4.5F);

		bodyModel[419].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // rsd17 headlight low high
		bodyModel[419].setRotationPoint(-42.5F, -18F, -1F);

		bodyModel[420].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // rsd17 headlight low high long hood
		bodyModel[420].setRotationPoint(38.5F, -18F, -1F);

		bodyModel[421].addShapeBox(0F, 0F, 0F, 0, 6, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // cubed special f
		bodyModel[421].setRotationPoint(-46.25F, -9F, -2.5F);

		bodyModel[422].addShapeBox(0F, 0F, 0F, 0, 6, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // cubedspecial r
		bodyModel[422].setRotationPoint(43.25F, -9F, -2.5F);

		bodyModel[423].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,-0.43F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -3F, 0F, 0F, -0.43F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -3F, 0F, 0F); // Box 441
		bodyModel[423].setRotationPoint(-26F, -21F, 1F);

		bodyModel[424].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 442
		bodyModel[424].setRotationPoint(-24F, -20F, -1F);

		bodyModel[425].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,0.57F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, 0.57F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F); // Box 444
		bodyModel[425].setRotationPoint(-25F, -23F, 1F);

		bodyModel[426].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 442
		bodyModel[426].setRotationPoint(43F, 3F, -11F);

		bodyModel[427].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 443
		bodyModel[427].setRotationPoint(43F, 3F, 10F);

		bodyModel[428].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // SP headlight rear low r
		bodyModel[428].setRotationPoint(38.5F, -15F, 0F);

		bodyModel[429].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // SP headlight rear low l
		bodyModel[429].setRotationPoint(38.5F, -15F, -2F);

		bodyModel[430].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // PCCRsinclair
		bodyModel[430].setRotationPoint(-27.5F, -23F, 1F);

		bodyModel[431].addShapeBox(0F, 0F, 0F, 0, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 445
		bodyModel[431].setRotationPoint(-10.5F, -13F, -10.75F);

		bodyModel[432].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 446
		bodyModel[432].setRotationPoint(-11F, -11.75F, -9.5F);

		bodyModel[433].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 447
		bodyModel[433].setRotationPoint(-17.5F, -25.5F, 1.5F);

		bodyModel[434].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 448
		bodyModel[434].setRotationPoint(-17F, -23.5F, 1.5F);

		bodyModel[435].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-3F, -0.2F, 0F, 2F, -0.2F, 0F, 2F, 0F, 0F, 0.57F, 0F, 0F, -3F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0.57F, 0F, 0F); // Box 449
		bodyModel[435].setRotationPoint(-26F, -22F, -7F);

		bodyModel[436].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,-0.15F, 0F, 0F, 1F, 0F, 0F, 1F, -1.2F, 0F, -3F, -1.2F, 0F, -0.14F, 0.065F, 0F, 1F, 0.065F, 0F, 1F, 0.2F, 0F, -3F, 0.2F, 0F); // Box 450
		bodyModel[436].setRotationPoint(-26F, -23F, 3F);

		bodyModel[437].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0.57F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.15F, 0F, 0F, 0.57F, 0F, 0F, 0F, 0F, 0F, 0F, 0.065F, 0F, -0.15F, 0.065F, 0F); // Box 451
		bodyModel[437].setRotationPoint(-26F, -23F, 2F);

		bodyModel[438].addShapeBox(0F, 0F, 0F, 2, 2, 5, 0F,-0.43F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -4F, 0F, 0F, -0.43F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -4F, 0F, 0F); // Box 452
		bodyModel[438].setRotationPoint(-27F, -21F, 2F);

		bodyModel[439].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0.57F, 0F, 0F, 2F, 0F, 0F, 2F, -0.2F, 0F, -3F, -0.2F, 0F, 0.57F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -3F, 0F, 0F); // Box 453
		bodyModel[439].setRotationPoint(-26F, -22F, 2F);

		bodyModel[440].addShapeBox(0F, 0F, -2.5F, 0, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // SP cab mount numberboard
		bodyModel[440].setRotationPoint(-25.01F, -21.25F, 4.25F);
		bodyModel[440].rotateAngleY = -0.61086524F;

		bodyModel[441].addShapeBox(0F, 0F, 0F, 3, 0, 4, 0F,0.5F, 0F, 0F, -2.85F, 0F, 0F, 0F, -1.2F, 0F, -1F, -1.2F, 0F, 0.5F, 0F, 0F, -2.85F, 0F, 0F, 0F, 1.2F, 0F, -1F, 1.2F, 0F); // Box 455
		bodyModel[441].setRotationPoint(-26F, -23F, 3F);

		bodyModel[442].addShapeBox(0F, 0F, 0F, 2, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, -0.35F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, -0.35F, 0.3F, 0F); // Box 456
		bodyModel[442].setRotationPoint(-25F, -21.8F, 7F);

		bodyModel[443].addShapeBox(0F, 0F, 0F, 1, 0, 2, 0F,0.65F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, -0.5F, -1F, 0F, 0.65F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 1F, 0F, -0.5F, 1F, 0F); // Box 457
		bodyModel[443].setRotationPoint(-24F, -21F, 8F);

		bodyModel[444].addShapeBox(0F, 0F, 0F, 1, 2, 0, 0F,-0.5F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 458
		bodyModel[444].setRotationPoint(-24F, -20F, 11F);

		bodyModel[445].addShapeBox(0F, 0F, 0F, 1, 0, 1, 0F,0F, 0F, 0F, -0.35F, 0F, 0F, -1.05F, 0F, 0F, 0.05F, 0F, 0F, 0F, 0F, 0F, -0.35F, 0F, 0F, -1.05F, 0F, 0F, 0.05F, 0F, 0F); // Box 459
		bodyModel[445].setRotationPoint(-26.5F, -23F, -3F);

		bodyModel[446].addShapeBox(0F, 0F, 0F, 1, 0, 1, 0F,0.05F, 0F, 0F, -1.05F, 0F, 0F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0.05F, 0F, 0F, -1.05F, 0F, 0F, -0.35F, 0F, 0F, 0F, 0F, 0F); // Box 460
		bodyModel[446].setRotationPoint(-26.5F, -23F, 2F);

		bodyModel[447].addBox(0F, 0F, 0F, 2, 1, 4, 0F); // exhaust
		bodyModel[447].setRotationPoint(12.5F, -23F, -2F);

		bodyModel[448].addBox(0F, 0F, 0F, 4, 0, 1, 0F); // Box 448
		bodyModel[448].setRotationPoint(-46F, 0.5F, 9F);

		bodyModel[449].addShapeBox(0F, 0F, 0F, 1, 7, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 449
		bodyModel[449].setRotationPoint(-42F, -8F, 1F);

		bodyModel[450].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
		bodyModel[450].setRotationPoint(-42F, -7.5F, -0.25F);

		bodyModel[451].addBox(0F, 0F, 0F, 1, 6, 0, 0F); // Box 43
		bodyModel[451].setRotationPoint(-42F, -6.5F, 0.25F);

		bodyModel[452].addBox(0F, 0F, 0F, 1, 3, 0, 0F); // Box 452
		bodyModel[452].setRotationPoint(-42F, -6.5F, -0.25F);

		bodyModel[453].addBox(0F, 0F, 0F, 1, 7, 2, 0F); // Box 453
		bodyModel[453].setRotationPoint(-42F, -8F, -1F);

		bodyModel[454].addShapeBox(0F, 0F, -2.5F, 0, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RSD17 high hood numberboard l
		bodyModel[454].setRotationPoint(-42.45F, -19F, 5.5F);
		bodyModel[454].rotateAngleY = -0.43633231F;

		bodyModel[455].addShapeBox(0F, 0F, -1.5F, 0, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 455
		bodyModel[455].setRotationPoint(-42.45F, -19F, -5.5F);
		bodyModel[455].rotateAngleY = 0.43633231F;

		bodyModel[456].addShapeBox(0F, 0F, -1.5F, 0, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // rsd17 long hood 
		bodyModel[456].setRotationPoint(39.5F, -19F, -5.5F);
		bodyModel[456].rotateAngleY = -0.43633231F;

		bodyModel[457].addShapeBox(0F, 0F, -2.5F, 0, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RSD17longhoodnumberboardl
		bodyModel[457].setRotationPoint(39.5F, -19F, 5.5F);
		bodyModel[457].rotateAngleY = 0.43633231F;
	}
	ModelTrimountTrucc theTruc = new ModelTrimountTrucc();
	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		for (int i = 0; i < 458; i++) {
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
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/trimount1_Black.png"));//1 brake cylinder vs 2
			GL11.glPushMatrix();
			GL11.glTranslated(-1.52, 0.0, 0);
			theTruc.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(3.05, 0, 0);
			theTruc.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/trimount2_Black.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.8, -0.03, 0);
			theTruc.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glRotatef(180, 0, 1, 0);
			GL11.glTranslated(-3.45, 0, 0);
			theTruc.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		}
	}
	public float[] getTrans() {
		return new float[]{-1.5F, 0.15F, 0.00F};
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