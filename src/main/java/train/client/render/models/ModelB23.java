//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 06.11.2020 - 22:22:00
// Last changed on: 06.11.2020 - 22:22:00

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

public class ModelB23 extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 256;

	public ModelB23() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[337];

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
		bodyModel[5] = new ModelRendererTurbo(this, 76, 147, textureX, textureY); // Box 8
		bodyModel[6] = new ModelRendererTurbo(this, 254, 89, textureX, textureY); // Box 10
		bodyModel[7] = new ModelRendererTurbo(this, 233, 65, textureX, textureY); // Box 18
		bodyModel[8] = new ModelRendererTurbo(this, 350, 113, textureX, textureY); // Box 19
		bodyModel[9] = new ModelRendererTurbo(this, 246, 68, textureX, textureY); // Box 21
		bodyModel[10] = new ModelRendererTurbo(this, 31, 8, textureX, textureY); // Box 24
		bodyModel[11] = new ModelRendererTurbo(this, 1, 123, textureX, textureY); // Box 25
		bodyModel[12] = new ModelRendererTurbo(this, 10, 6, textureX, textureY); // Box 28
		bodyModel[13] = new ModelRendererTurbo(this, 52, 6, textureX, textureY); // Box 30
		bodyModel[14] = new ModelRendererTurbo(this, 114, 81, textureX, textureY); // Box 31
		bodyModel[15] = new ModelRendererTurbo(this, 125, 78, textureX, textureY); // Box 32
		bodyModel[16] = new ModelRendererTurbo(this, 97, 81, textureX, textureY); // Box 33
		bodyModel[17] = new ModelRendererTurbo(this, 217, 102, textureX, textureY); // Box 35
		bodyModel[18] = new ModelRendererTurbo(this, 183, 102, textureX, textureY); // Box 36
		bodyModel[19] = new ModelRendererTurbo(this, 208, 99, textureX, textureY); // Box 37
		bodyModel[20] = new ModelRendererTurbo(this, 242, 99, textureX, textureY); // Box 38
		bodyModel[21] = new ModelRendererTurbo(this, 188, 38, textureX, textureY); // Box 46
		bodyModel[22] = new ModelRendererTurbo(this, 188, 32, textureX, textureY); // Box 47
		bodyModel[23] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 61
		bodyModel[24] = new ModelRendererTurbo(this, 155, 133, textureX, textureY); // Box 63
		bodyModel[25] = new ModelRendererTurbo(this, 197, 34, textureX, textureY); // Box 65
		bodyModel[26] = new ModelRendererTurbo(this, 59, 43, textureX, textureY); // Box 67
		bodyModel[27] = new ModelRendererTurbo(this, 30, 43, textureX, textureY); // Box 68
		bodyModel[28] = new ModelRendererTurbo(this, 77, 25, textureX, textureY); // Box 106
		bodyModel[29] = new ModelRendererTurbo(this, 35, 25, textureX, textureY); // Box 107
		bodyModel[30] = new ModelRendererTurbo(this, 28, 1, textureX, textureY); // Box 122
		bodyModel[31] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 123
		bodyModel[32] = new ModelRendererTurbo(this, 464, 115, textureX, textureY); // Box 148
		bodyModel[33] = new ModelRendererTurbo(this, 471, 110, textureX, textureY); // Box 149
		bodyModel[34] = new ModelRendererTurbo(this, 447, 110, textureX, textureY); // Box 150
		bodyModel[35] = new ModelRendererTurbo(this, 458, 114, textureX, textureY); // Box 153
		bodyModel[36] = new ModelRendererTurbo(this, 472, 114, textureX, textureY); // Box 154
		bodyModel[37] = new ModelRendererTurbo(this, 269, 82, textureX, textureY); // Box 156
		bodyModel[38] = new ModelRendererTurbo(this, 272, 158, textureX, textureY); // Box 157
		bodyModel[39] = new ModelRendererTurbo(this, 273, 145, textureX, textureY); // Box 158
		bodyModel[40] = new ModelRendererTurbo(this, 109, 9, textureX, textureY); // Box 160
		bodyModel[41] = new ModelRendererTurbo(this, 35, 45, textureX, textureY); // Box 161
		bodyModel[42] = new ModelRendererTurbo(this, 90, 45, textureX, textureY); // Box 162
		bodyModel[43] = new ModelRendererTurbo(this, 50, 45, textureX, textureY); // Box 163
		bodyModel[44] = new ModelRendererTurbo(this, 75, 45, textureX, textureY); // Box 164
		bodyModel[45] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 165
		bodyModel[46] = new ModelRendererTurbo(this, 99, 43, textureX, textureY); // Box 166
		bodyModel[47] = new ModelRendererTurbo(this, 105, 29, textureX, textureY); // Box 167
		bodyModel[48] = new ModelRendererTurbo(this, 70, 43, textureX, textureY); // Box 168
		bodyModel[49] = new ModelRendererTurbo(this, 109, 21, textureX, textureY); // Box 169
		bodyModel[50] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 48
		bodyModel[51] = new ModelRendererTurbo(this, 21, 39, textureX, textureY); // Box 43
		bodyModel[52] = new ModelRendererTurbo(this, 8, 42, textureX, textureY, "lamp"); // Box 117 liveryimg 2 glow
		bodyModel[53] = new ModelRendererTurbo(this, 8, 42, textureX, textureY, "lamp"); // Box 118 liveryimg 2 glow
		bodyModel[54] = new ModelRendererTurbo(this, 8, 39, textureX, textureY); // Box 175
		bodyModel[55] = new ModelRendererTurbo(this, 1, 76, textureX, textureY); // Box 185
		bodyModel[56] = new ModelRendererTurbo(this, 146, 132, textureX, textureY); // Box 195
		bodyModel[57] = new ModelRendererTurbo(this, 82, 132, textureX, textureY); // Box 196
		bodyModel[58] = new ModelRendererTurbo(this, 420, 102, textureX, textureY); // Box 197
		bodyModel[59] = new ModelRendererTurbo(this, 152, 132, textureX, textureY); // Box 198
		bodyModel[60] = new ModelRendererTurbo(this, 422, 94, textureX, textureY); // Box 199
		bodyModel[61] = new ModelRendererTurbo(this, 421, 96, textureX, textureY); // Box 200
		bodyModel[62] = new ModelRendererTurbo(this, 421, 99, textureX, textureY); // Box 201
		bodyModel[63] = new ModelRendererTurbo(this, 142, 91, textureX, textureY); // Box 202
		bodyModel[64] = new ModelRendererTurbo(this, 143, 86, textureX, textureY); // Box 203
		bodyModel[65] = new ModelRendererTurbo(this, 142, 88, textureX, textureY); // Box 204
		bodyModel[66] = new ModelRendererTurbo(this, 141, 94, textureX, textureY); // Box 205
		bodyModel[67] = new ModelRendererTurbo(this, 100, 96, textureX, textureY); // box65
		bodyModel[68] = new ModelRendererTurbo(this, 438, 165, textureX, textureY); // Box 215
		bodyModel[69] = new ModelRendererTurbo(this, 433, 128, textureX, textureY); // Box 218
		bodyModel[70] = new ModelRendererTurbo(this, 500, 128, textureX, textureY); // Box 220
		bodyModel[71] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 230
		bodyModel[72] = new ModelRendererTurbo(this, 405, 147, textureX, textureY); // Box 231
		bodyModel[73] = new ModelRendererTurbo(this, 96, 134, textureX, textureY); // Box 61
		bodyModel[74] = new ModelRendererTurbo(this, 140, 134, textureX, textureY); // Box 63
		bodyModel[75] = new ModelRendererTurbo(this, 103, 109, textureX, textureY); // Box 80
		bodyModel[76] = new ModelRendererTurbo(this, 253, 62, textureX, textureY); // Box 251
		bodyModel[77] = new ModelRendererTurbo(this, 201, 65, textureX, textureY); // Box 252
		bodyModel[78] = new ModelRendererTurbo(this, 447, 128, textureX, textureY); // Box 256
		bodyModel[79] = new ModelRendererTurbo(this, 488, 148, textureX, textureY); // Box 259
		bodyModel[80] = new ModelRendererTurbo(this, 451, 123, textureX, textureY); // Box 267
		bodyModel[81] = new ModelRendererTurbo(this, 445, 139, textureX, textureY); // Box 269
		bodyModel[82] = new ModelRendererTurbo(this, 173, 4, textureX, textureY, "lamp"); // Box 162 commander beacon
		bodyModel[83] = new ModelRendererTurbo(this, 172, 7, textureX, textureY); // Box 165
		bodyModel[84] = new ModelRendererTurbo(this, 56, 96, textureX, textureY); // Box 148
		bodyModel[85] = new ModelRendererTurbo(this, 56, 90, textureX, textureY); // Box 150
		bodyModel[86] = new ModelRendererTurbo(this, 78, 92, textureX, textureY); // Box 152
		bodyModel[87] = new ModelRendererTurbo(this, 75, 90, textureX, textureY); // Box 275
		bodyModel[88] = new ModelRendererTurbo(this, 116, 45, textureX, textureY); // Box 276
		bodyModel[89] = new ModelRendererTurbo(this, 119, 42, textureX, textureY); // Box 277
		bodyModel[90] = new ModelRendererTurbo(this, 213, 65, textureX, textureY); // Box 281
		bodyModel[91] = new ModelRendererTurbo(this, 149, 65, textureX, textureY); // Box 284
		bodyModel[92] = new ModelRendererTurbo(this, 160, 79, textureX, textureY); // Box 285
		bodyModel[93] = new ModelRendererTurbo(this, 183, 81, textureX, textureY); // Box 288
		bodyModel[94] = new ModelRendererTurbo(this, 160, 90, textureX, textureY); // Box 300
		bodyModel[95] = new ModelRendererTurbo(this, 183, 90, textureX, textureY); // Box 303
		bodyModel[96] = new ModelRendererTurbo(this, 442, 110, textureX, textureY); // Box 296
		bodyModel[97] = new ModelRendererTurbo(this, 371, 117, textureX, textureY); // Box 19
		bodyModel[98] = new ModelRendererTurbo(this, 329, 117, textureX, textureY); // Box 19
		bodyModel[99] = new ModelRendererTurbo(this, 371, 125, textureX, textureY); // Box 305
		bodyModel[100] = new ModelRendererTurbo(this, 365, 125, textureX, textureY); // Box 305
		bodyModel[101] = new ModelRendererTurbo(this, 336, 85, textureX, textureY); // Box 19
		bodyModel[102] = new ModelRendererTurbo(this, 357, 89, textureX, textureY); // Box 19
		bodyModel[103] = new ModelRendererTurbo(this, 315, 89, textureX, textureY); // Box 19
		bodyModel[104] = new ModelRendererTurbo(this, 357, 98, textureX, textureY); // Box 305
		bodyModel[105] = new ModelRendererTurbo(this, 351, 97, textureX, textureY); // Box 305
		bodyModel[106] = new ModelRendererTurbo(this, 336, 81, textureX, textureY); // Box 440
		bodyModel[107] = new ModelRendererTurbo(this, 346, 81, textureX, textureY); // Box 441
		bodyModel[108] = new ModelRendererTurbo(this, 481, 26, textureX, textureY); // Box 293
		bodyModel[109] = new ModelRendererTurbo(this, 266, 122, textureX, textureY); // Box 19
		bodyModel[110] = new ModelRendererTurbo(this, 266, 105, textureX, textureY); // Box 19
		bodyModel[111] = new ModelRendererTurbo(this, 193, 66, textureX, textureY); // Box 101
		bodyModel[112] = new ModelRendererTurbo(this, 222, 66, textureX, textureY); // Box 101
		bodyModel[113] = new ModelRendererTurbo(this, 481, 109, textureX, textureY, "lamp"); // Box 240 glow liveryimg 2
		bodyModel[114] = new ModelRendererTurbo(this, 481, 109, textureX, textureY, "lamp"); // Box 241 glow liveryimg 2
		bodyModel[115] = new ModelRendererTurbo(this, 191, 9, textureX, textureY); // Box 114
		bodyModel[116] = new ModelRendererTurbo(this, 191, 6, textureX, textureY); // Box 74
		bodyModel[117] = new ModelRendererTurbo(this, 191, 12, textureX, textureY); // Box 78
		bodyModel[118] = new ModelRendererTurbo(this, 190, 2, textureX, textureY); // Box 245
		bodyModel[119] = new ModelRendererTurbo(this, 188, 35, textureX, textureY); // Box 246
		bodyModel[120] = new ModelRendererTurbo(this, 164, 32, textureX, textureY); // Box 247
		bodyModel[121] = new ModelRendererTurbo(this, 164, 35, textureX, textureY); // Box 248
		bodyModel[122] = new ModelRendererTurbo(this, 173, 34, textureX, textureY); // Box 249
		bodyModel[123] = new ModelRendererTurbo(this, 164, 38, textureX, textureY); // Box 250
		bodyModel[124] = new ModelRendererTurbo(this, 144, 32, textureX, textureY); // Box 248
		bodyModel[125] = new ModelRendererTurbo(this, 144, 36, textureX, textureY); // Box 250
		bodyModel[126] = new ModelRendererTurbo(this, 152, 33, textureX, textureY); // Box 249
		bodyModel[127] = new ModelRendererTurbo(this, 127, 111, textureX, textureY); // Box 205
		bodyModel[128] = new ModelRendererTurbo(this, 415, 139, textureX, textureY); // Box 205
		bodyModel[129] = new ModelRendererTurbo(this, 160, 101, textureX, textureY); // Box 36
		bodyModel[130] = new ModelRendererTurbo(this, 141, 9, textureX, textureY); // Box 114
		bodyModel[131] = new ModelRendererTurbo(this, 141, 6, textureX, textureY); // Box 74
		bodyModel[132] = new ModelRendererTurbo(this, 141, 12, textureX, textureY); // Box 78
		bodyModel[133] = new ModelRendererTurbo(this, 139, 1, textureX, textureY); // Box 78
		bodyModel[134] = new ModelRendererTurbo(this, 71, 133, textureX, textureY); // Box 2603
		bodyModel[135] = new ModelRendererTurbo(this, 84, 132, textureX, textureY); // Box 261
		bodyModel[136] = new ModelRendererTurbo(this, 491, 127, textureX, textureY); // Box 263
		bodyModel[137] = new ModelRendererTurbo(this, 493, 114, textureX, textureY); // Box 264
		bodyModel[138] = new ModelRendererTurbo(this, 108, 145, textureX, textureY); // Box 193
		bodyModel[139] = new ModelRendererTurbo(this, 201, 60, textureX, textureY, "lamp"); // Box 190 ditchlight f
		bodyModel[140] = new ModelRendererTurbo(this, 469, 164, textureX, textureY); // Box 273
		bodyModel[141] = new ModelRendererTurbo(this, 193, 61, textureX, textureY, "lamp"); // Box 275 ditchlight f
		bodyModel[142] = new ModelRendererTurbo(this, 213, 60, textureX, textureY, "lamp"); // Box 276 ditchlight r
		bodyModel[143] = new ModelRendererTurbo(this, 222, 60, textureX, textureY, "lamp"); // Box 278 ditchlight r
		bodyModel[144] = new ModelRendererTurbo(this, 1, 52, textureX, textureY, "lamp"); // Box 186 Headlight Front
		bodyModel[145] = new ModelRendererTurbo(this, 1, 52, textureX, textureY, "lamp"); // Box 187 Headlight Front
		bodyModel[146] = new ModelRendererTurbo(this, 4, 71, textureX, textureY, "lamp"); // Box 247 Headlight Front
		bodyModel[147] = new ModelRendererTurbo(this, 4, 71, textureX, textureY, "lamp"); // Box 248 Headlight Front
		bodyModel[148] = new ModelRendererTurbo(this, 447, 112, textureX, textureY, "lamp"); // Box 284 Headlight Rear
		bodyModel[149] = new ModelRendererTurbo(this, 447, 112, textureX, textureY, "lamp"); // Box 285 Headlight Rear
		bodyModel[150] = new ModelRendererTurbo(this, 16, 152, textureX, textureY); // Box 4
		bodyModel[151] = new ModelRendererTurbo(this, 1, 150, textureX, textureY); // Box 4
		bodyModel[152] = new ModelRendererTurbo(this, 16, 165, textureX, textureY); // Box 4
		bodyModel[153] = new ModelRendererTurbo(this, 38, 150, textureX, textureY); // Box 4
		bodyModel[154] = new ModelRendererTurbo(this, 57, 150, textureX, textureY); // Box 4
		bodyModel[155] = new ModelRendererTurbo(this, 38, 162, textureX, textureY); // Box 4
		bodyModel[156] = new ModelRendererTurbo(this, 17, 3, textureX, textureY); // Box 2
		bodyModel[157] = new ModelRendererTurbo(this, 17, 11, textureX, textureY); // Box 267
		bodyModel[158] = new ModelRendererTurbo(this, 434, 127, textureX, textureY); // Box 270434
		bodyModel[159] = new ModelRendererTurbo(this, 433, 114, textureX, textureY); // Box 271
		bodyModel[160] = new ModelRendererTurbo(this, 182, 4, textureX, textureY, "lamp"); // Box 162 commander beacon
		bodyModel[161] = new ModelRendererTurbo(this, 181, 8, textureX, textureY); // Box 165
		bodyModel[162] = new ModelRendererTurbo(this, 156, 65, textureX, textureY); // Box 279
		bodyModel[163] = new ModelRendererTurbo(this, 444, 125, textureX, textureY); // Box 280
		bodyModel[164] = new ModelRendererTurbo(this, 488, 130, textureX, textureY); // Box 281
		bodyModel[165] = new ModelRendererTurbo(this, 488, 115, textureX, textureY); // Box 282
		bodyModel[166] = new ModelRendererTurbo(this, 366, 155, textureX, textureY); // Box 283
		bodyModel[167] = new ModelRendererTurbo(this, 336, 155, textureX, textureY); // Box 284
		bodyModel[168] = new ModelRendererTurbo(this, 319, 153, textureX, textureY); // Box 285
		bodyModel[169] = new ModelRendererTurbo(this, 383, 153, textureX, textureY); // Box 286
		bodyModel[170] = new ModelRendererTurbo(this, 385, 143, textureX, textureY); // Box 287
		bodyModel[171] = new ModelRendererTurbo(this, 321, 143, textureX, textureY); // Box 288
		bodyModel[172] = new ModelRendererTurbo(this, 56, 67, textureX, textureY); // Box 289
		bodyModel[173] = new ModelRendererTurbo(this, 205, 16, textureX, textureY); // Box 292
		bodyModel[174] = new ModelRendererTurbo(this, 205, 2, textureX, textureY); // Box 293
		bodyModel[175] = new ModelRendererTurbo(this, 203, 8, textureX, textureY); // Box 294
		bodyModel[176] = new ModelRendererTurbo(this, 44, 66, textureX, textureY); // Box 295
		bodyModel[177] = new ModelRendererTurbo(this, 25, 66, textureX, textureY); // Box 296
		bodyModel[178] = new ModelRendererTurbo(this, 10, 66, textureX, textureY); // Box 297
		bodyModel[179] = new ModelRendererTurbo(this, 1, 39, textureX, textureY, "lamp"); // Box 298 headlight f
		bodyModel[180] = new ModelRendererTurbo(this, 1, 39, textureX, textureY, "lamp"); // Box 299 headlight f
		bodyModel[181] = new ModelRendererTurbo(this, 19, 74, textureX, textureY); // Box 303
		bodyModel[182] = new ModelRendererTurbo(this, 34, 78, textureX, textureY); // Box 304
		bodyModel[183] = new ModelRendererTurbo(this, 41, 74, textureX, textureY); // Box 305
		bodyModel[184] = new ModelRendererTurbo(this, 34, 74, textureX, textureY); // Box 306
		bodyModel[185] = new ModelRendererTurbo(this, 50, 72, textureX, textureY); // Box 307
		bodyModel[186] = new ModelRendererTurbo(this, 10, 72, textureX, textureY); // Box 308
		bodyModel[187] = new ModelRendererTurbo(this, 128, 45, textureX, textureY); // Box 354
		bodyModel[188] = new ModelRendererTurbo(this, 130, 42, textureX, textureY); // Box 355
		bodyModel[189] = new ModelRendererTurbo(this, 130, 48, textureX, textureY); // Box 356
		bodyModel[190] = new ModelRendererTurbo(this, 139, 45, textureX, textureY); // Box 357
		bodyModel[191] = new ModelRendererTurbo(this, 210, 32, textureX, textureY); // Box 286
		bodyModel[192] = new ModelRendererTurbo(this, 219, 35, textureX, textureY); // Box 287
		bodyModel[193] = new ModelRendererTurbo(this, 210, 38, textureX, textureY); // Box 288
		bodyModel[194] = new ModelRendererTurbo(this, 208, 35, textureX, textureY); // Box 289
		bodyModel[195] = new ModelRendererTurbo(this, 183, 99, textureX, textureY); // Box 296
		bodyModel[196] = new ModelRendererTurbo(this, 183, 79, textureX, textureY); // Box 297
		bodyModel[197] = new ModelRendererTurbo(this, 83, 54, textureX, textureY); // Box 298
		bodyModel[198] = new ModelRendererTurbo(this, 78, 55, textureX, textureY); // Box 299
		bodyModel[199] = new ModelRendererTurbo(this, 49, 57, textureX, textureY); // Box 300
		bodyModel[200] = new ModelRendererTurbo(this, 70, 59, textureX, textureY); // Box 301
		bodyModel[201] = new ModelRendererTurbo(this, 41, 101, textureX, textureY); // Box 302
		bodyModel[202] = new ModelRendererTurbo(this, 19, 101, textureX, textureY); // Box 303
		bodyModel[203] = new ModelRendererTurbo(this, 34, 105, textureX, textureY); // Box 304
		bodyModel[204] = new ModelRendererTurbo(this, 112, 60, textureX, textureY); // Box 305
		bodyModel[205] = new ModelRendererTurbo(this, 112, 52, textureX, textureY); // Box 306
		bodyModel[206] = new ModelRendererTurbo(this, 1, 65, textureX, textureY, "lamp"); // Box 307 glowey
		bodyModel[207] = new ModelRendererTurbo(this, 1, 65, textureX, textureY, "lamp"); // Box 308 glowey
		bodyModel[208] = new ModelRendererTurbo(this, 113, 17, textureX, textureY); // Box 309
		bodyModel[209] = new ModelRendererTurbo(this, 314, 117, textureX, textureY); // Box 310
		bodyModel[210] = new ModelRendererTurbo(this, 243, 117, textureX, textureY); // Box 311
		bodyModel[211] = new ModelRendererTurbo(this, 98, 5, textureX, textureY); // Box 52 door swing right
		bodyModel[212] = new ModelRendererTurbo(this, 56, 5, textureX, textureY); // Box 314 door swing right
		bodyModel[213] = new ModelRendererTurbo(this, 207, 114, textureX, textureY); // Box 318
		bodyModel[214] = new ModelRendererTurbo(this, 207, 129, textureX, textureY); // Box 319
		bodyModel[215] = new ModelRendererTurbo(this, 445, 135, textureX, textureY); // Box 320
		bodyModel[216] = new ModelRendererTurbo(this, 97, 121, textureX, textureY); // Box 321
		bodyModel[217] = new ModelRendererTurbo(this, 444, 99, textureX, textureY); // Box 144
		bodyModel[218] = new ModelRendererTurbo(this, 444, 50, textureX, textureY); // Box 145
		bodyModel[219] = new ModelRendererTurbo(this, 433, 102, textureX, textureY); // Box 152
		bodyModel[220] = new ModelRendererTurbo(this, 491, 102, textureX, textureY); // Box 155
		bodyModel[221] = new ModelRendererTurbo(this, 444, 105, textureX, textureY); // Box 292
		bodyModel[222] = new ModelRendererTurbo(this, 444, 45, textureX, textureY); // Box 294
		bodyModel[223] = new ModelRendererTurbo(this, 433, 67, textureX, textureY); // Box 298
		bodyModel[224] = new ModelRendererTurbo(this, 445, 83, textureX, textureY); // Box 331
		bodyModel[225] = new ModelRendererTurbo(this, 464, 110, textureX, textureY); // Box 332
		bodyModel[226] = new ModelRendererTurbo(this, 1, 160, textureX, textureY); // Box 448
		bodyModel[227] = new ModelRendererTurbo(this, 57, 160, textureX, textureY); // Box 449
		bodyModel[228] = new ModelRendererTurbo(this, 370, 141, textureX, textureY); // Box 336
		bodyModel[229] = new ModelRendererTurbo(this, 336, 141, textureX, textureY); // Box 337
		bodyModel[230] = new ModelRendererTurbo(this, 493, 152, textureX, textureY, "lamp"); // Box 339 glowey
		bodyModel[231] = new ModelRendererTurbo(this, 500, 152, textureX, textureY, "lamp"); // Box 340 glowey
		bodyModel[232] = new ModelRendererTurbo(this, 3, 83, textureX, textureY); // Box 402
		bodyModel[233] = new ModelRendererTurbo(this, 498, 35, textureX, textureY); // Box 342
		bodyModel[234] = new ModelRendererTurbo(this, 476, 1, textureX, textureY); // Box 343
		bodyModel[235] = new ModelRendererTurbo(this, 504, 1, textureX, textureY); // Box 344
		bodyModel[236] = new ModelRendererTurbo(this, 493, 10, textureX, textureY); // Box 345
		bodyModel[237] = new ModelRendererTurbo(this, 476, 10, textureX, textureY); // Box 346
		bodyModel[238] = new ModelRendererTurbo(this, 481, 35, textureX, textureY); // Box 347
		bodyModel[239] = new ModelRendererTurbo(this, 490, 18, textureX, textureY); // Box 348
		bodyModel[240] = new ModelRendererTurbo(this, 481, 17, textureX, textureY); // Box 349
		bodyModel[241] = new ModelRendererTurbo(this, 501, 18, textureX, textureY); // Box 350
		bodyModel[242] = new ModelRendererTurbo(this, 79, 131, textureX, textureY); // Box 277
		bodyModel[243] = new ModelRendererTurbo(this, 477, 148, textureX, textureY); // Box 278
		bodyModel[244] = new ModelRendererTurbo(this, 207, 123, textureX, textureY); // Box 253
		bodyModel[245] = new ModelRendererTurbo(this, 207, 126, textureX, textureY); // Box 280
		bodyModel[246] = new ModelRendererTurbo(this, 112, 119, textureX, textureY); // Box 412
		bodyModel[247] = new ModelRendererTurbo(this, 460, 159, textureX, textureY); // Box 282
		bodyModel[248] = new ModelRendererTurbo(this, 422, 23, textureX, textureY); // Box 283
		bodyModel[249] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 284
		bodyModel[250] = new ModelRendererTurbo(this, 248, 31, textureX, textureY); // Box 285
		bodyModel[251] = new ModelRendererTurbo(this, 247, 24, textureX, textureY); // Box 286
		bodyModel[252] = new ModelRendererTurbo(this, 8, 50, textureX, textureY, "lamp"); // Box 287 glow liveryimg 2
		bodyModel[253] = new ModelRendererTurbo(this, 8, 50, textureX, textureY, "lamp"); // Box 288 glow liveryimg 2
		bodyModel[254] = new ModelRendererTurbo(this, 1, 44, textureX, textureY); // Box 289
		bodyModel[255] = new ModelRendererTurbo(this, 500, 147, textureX, textureY, "lamp"); // Box 290 glowey
		bodyModel[256] = new ModelRendererTurbo(this, 493, 147, textureX, textureY, "lamp"); // Box 291 glowey
		bodyModel[257] = new ModelRendererTurbo(this, 130, 116, textureX, textureY); // Box 292
		bodyModel[258] = new ModelRendererTurbo(this, 139, 125, textureX, textureY); // Box 293
		bodyModel[259] = new ModelRendererTurbo(this, 142, 114, textureX, textureY); // Box 294
		bodyModel[260] = new ModelRendererTurbo(this, 137, 122, textureX, textureY); // Box 295
		bodyModel[261] = new ModelRendererTurbo(this, 137, 122, textureX, textureY); // Box 296
		bodyModel[262] = new ModelRendererTurbo(this, 136, 126, textureX, textureY); // Box 298
		bodyModel[263] = new ModelRendererTurbo(this, 100, 126, textureX, textureY); // Box 299
		bodyModel[264] = new ModelRendererTurbo(this, 448, 140, textureX, textureY); // Box 300
		bodyModel[265] = new ModelRendererTurbo(this, 484, 140, textureX, textureY); // Box 301
		bodyModel[266] = new ModelRendererTurbo(this, 438, 88, textureX, textureY); // Box 403
		bodyModel[267] = new ModelRendererTurbo(this, 438, 56, textureX, textureY); // Box 404
		bodyModel[268] = new ModelRendererTurbo(this, 229, 57, textureX, textureY); // Box 405 EXTRA STACC
		bodyModel[269] = new ModelRendererTurbo(this, 92, 114, textureX, textureY); // Box 406
		bodyModel[270] = new ModelRendererTurbo(this, 97, 125, textureX, textureY); // Box 407
		bodyModel[271] = new ModelRendererTurbo(this, 97, 122, textureX, textureY); // Box 408
		bodyModel[272] = new ModelRendererTurbo(this, 97, 122, textureX, textureY); // Box 409
		bodyModel[273] = new ModelRendererTurbo(this, 102, 116, textureX, textureY); // Box 410
		bodyModel[274] = new ModelRendererTurbo(this, 130, 91, textureX, textureY); // Box 411
		bodyModel[275] = new ModelRendererTurbo(this, 407, 99, textureX, textureY); // Box 412
		bodyModel[276] = new ModelRendererTurbo(this, 414, 99, textureX, textureY); // Box 413
		bodyModel[277] = new ModelRendererTurbo(this, 137, 91, textureX, textureY); // Box 414
		bodyModel[278] = new ModelRendererTurbo(this, 134, 62, textureX, textureY); // Box 417 atsf bit
		bodyModel[279] = new ModelRendererTurbo(this, 157, 64, textureX, textureY); // Box 418 atsf bit
		bodyModel[280] = new ModelRendererTurbo(this, 178, 65, textureX, textureY, "cull"); // Box 419 cull atsf bit
		bodyModel[281] = new ModelRendererTurbo(this, 161, 7, textureX, textureY); // Box 364 prime base
		bodyModel[282] = new ModelRendererTurbo(this, 161, 2, textureX, textureY, "lamp"); // Box 6 PRIME1-1
		bodyModel[283] = new ModelRendererTurbo(this, 161, 2, textureX, textureY, "lamp"); // Box 7 PRIME1-3
		bodyModel[284] = new ModelRendererTurbo(this, 161, 2, textureX, textureY, "lamp"); // Box 8 PRIME1-2
		bodyModel[285] = new ModelRendererTurbo(this, 161, 2, textureX, textureY, "lamp"); // Box 9 PRIME1-4
		bodyModel[286] = new ModelRendererTurbo(this, 181, 63, textureX, textureY); // Box 425
		bodyModel[287] = new ModelRendererTurbo(this, 128, 61, textureX, textureY, "cull"); // Box 426 cull atsf bit
		bodyModel[288] = new ModelRendererTurbo(this, 152, 42, textureX, textureY); // Box 427
		bodyModel[289] = new ModelRendererTurbo(this, 152, 45, textureX, textureY); // Box 428
		bodyModel[290] = new ModelRendererTurbo(this, 152, 48, textureX, textureY); // Box 429
		bodyModel[291] = new ModelRendererTurbo(this, 161, 45, textureX, textureY); // Box 430
		bodyModel[292] = new ModelRendererTurbo(this, 130, 86, textureX, textureY); // Box 431
		bodyModel[293] = new ModelRendererTurbo(this, 407, 94, textureX, textureY); // Box 432
		bodyModel[294] = new ModelRendererTurbo(this, 414, 94, textureX, textureY); // Box 433
		bodyModel[295] = new ModelRendererTurbo(this, 137, 86, textureX, textureY); // Box 434
		bodyModel[296] = new ModelRendererTurbo(this, 150, 7, textureX, textureY); // Box 364 prime base
		bodyModel[297] = new ModelRendererTurbo(this, 150, 2, textureX, textureY, "lamp"); // Box 6 PRIME2-1
		bodyModel[298] = new ModelRendererTurbo(this, 150, 2, textureX, textureY, "lamp"); // Box 7 PRIME2-3
		bodyModel[299] = new ModelRendererTurbo(this, 150, 2, textureX, textureY, "lamp"); // Box 8 PRIME2-2
		bodyModel[300] = new ModelRendererTurbo(this, 150, 2, textureX, textureY, "lamp"); // Box 9 PRIME2-4
		bodyModel[301] = new ModelRendererTurbo(this, 222, 66, textureX, textureY); // Box 440
		bodyModel[302] = new ModelRendererTurbo(this, 222, 60, textureX, textureY, "lamp"); // Box 441 ditchlight r
		bodyModel[303] = new ModelRendererTurbo(this, 213, 65, textureX, textureY); // Box 442
		bodyModel[304] = new ModelRendererTurbo(this, 213, 60, textureX, textureY, "lamp"); // Box 443 ditchlight r
		bodyModel[305] = new ModelRendererTurbo(this, 193, 66, textureX, textureY); // Box 444
		bodyModel[306] = new ModelRendererTurbo(this, 193, 61, textureX, textureY, "lamp"); // Box 445 ditchlight f
		bodyModel[307] = new ModelRendererTurbo(this, 201, 60, textureX, textureY, "lamp"); // Box 446 ditchlight f
		bodyModel[308] = new ModelRendererTurbo(this, 201, 65, textureX, textureY); // Box 447
		bodyModel[309] = new ModelRendererTurbo(this, 141, 94, textureX, textureY); // Box 448
		bodyModel[310] = new ModelRendererTurbo(this, 142, 91, textureX, textureY); // Box 449
		bodyModel[311] = new ModelRendererTurbo(this, 142, 88, textureX, textureY); // Box 450
		bodyModel[312] = new ModelRendererTurbo(this, 143, 86, textureX, textureY); // Box 451
		bodyModel[313] = new ModelRendererTurbo(this, 420, 102, textureX, textureY); // Box 452
		bodyModel[314] = new ModelRendererTurbo(this, 421, 99, textureX, textureY); // Box 453
		bodyModel[315] = new ModelRendererTurbo(this, 421, 96, textureX, textureY); // Box 454
		bodyModel[316] = new ModelRendererTurbo(this, 422, 94, textureX, textureY); // Box 455
		bodyModel[317] = new ModelRendererTurbo(this, 1, 87, textureX, textureY); // Box 319
		bodyModel[318] = new ModelRendererTurbo(this, 95, 24, textureX, textureY); // Box 350
		bodyModel[319] = new ModelRendererTurbo(this, 98, 24, textureX, textureY); // Box 321
		bodyModel[320] = new ModelRendererTurbo(this, 180, 112, textureX, textureY); // Box 322
		bodyModel[321] = new ModelRendererTurbo(this, 180, 136, textureX, textureY); // Box 323
		bodyModel[322] = new ModelRendererTurbo(this, 116, 42, textureX, textureY); // Box 324
		bodyModel[323] = new ModelRendererTurbo(this, 134, 52, textureX, textureY, "lamp"); // Box 334 commander beacon
		bodyModel[324] = new ModelRendererTurbo(this, 129, 53, textureX, textureY); // Box 335
		bodyModel[325] = new ModelRendererTurbo(this, 140, 56, textureX, textureY, "cull"); // Box 329 support cull
		bodyModel[326] = new ModelRendererTurbo(this, 129, 56, textureX, textureY); // Box 330
		bodyModel[327] = new ModelRendererTurbo(this, 139, 52, textureX, textureY, "lamp"); // Box 334 commander beacon
		bodyModel[328] = new ModelRendererTurbo(this, 144, 53, textureX, textureY); // Box 335
		bodyModel[329] = new ModelRendererTurbo(this, 166, 42, textureX, textureY); // Box 333
		bodyModel[330] = new ModelRendererTurbo(this, 176, 45, textureX, textureY); // Box 334
		bodyModel[331] = new ModelRendererTurbo(this, 166, 45, textureX, textureY); // Box 335
		bodyModel[332] = new ModelRendererTurbo(this, 166, 48, textureX, textureY); // Box 336
		bodyModel[333] = new ModelRendererTurbo(this, 113, 42, textureX, textureY); // Box 337
		bodyModel[334] = new ModelRendererTurbo(this, 488, 140, textureX, textureY, "cull"); // Box 338 cull
		bodyModel[335] = new ModelRendererTurbo(this, 122, 107, textureX, textureY, "cull"); // Box 339 cull
		bodyModel[336] = new ModelRendererTurbo(this, 502, 113, textureX, textureY); // Box 340

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

		bodyModel[7].addBox(0F, 0F, 0F, 3, 1, 6, 0F); // Box 18
		bodyModel[7].setRotationPoint(10.5F, -23.5F, -3F);

		bodyModel[8].addBox(0F, 0F, 0F, 1, 3, 18, 0F); // Box 19
		bodyModel[8].setRotationPoint(10F, 4F, -9F);

		bodyModel[9].addBox(0F, 0F, 0F, 4, 1, 7, 0F); // Box 21
		bodyModel[9].setRotationPoint(10F, -22.5F, -3.5F);

		bodyModel[10].addBox(0F, 0F, 0F, 11, 14, 1, 0F); // Box 24
		bodyModel[10].setRotationPoint(-31F, -19F, 10F);

		bodyModel[11].addBox(0F, 0F, 0F, 13, 4, 22, 0F); // Box 25
		bodyModel[11].setRotationPoint(-32F, -5F, -11F);

		bodyModel[12].addBox(0F, 0F, 0F, 1, 14, 18, 0F); // Box 28
		bodyModel[12].setRotationPoint(-20F, -19F, -11F);

		bodyModel[13].addBox(0F, 0F, 0F, 1, 14, 18, 0F); // Box 30
		bodyModel[13].setRotationPoint(-32F, -19F, -7F);

		bodyModel[14].addBox(0F, 0F, 0F, 3, 4, 4, 0F); // Box 31
		bodyModel[14].setRotationPoint(-35F, -5F, -11F);

		bodyModel[15].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 32
		bodyModel[15].setRotationPoint(-36F, -3F, -11F);

		bodyModel[16].addBox(0F, 0F, 0F, 4, 4, 4, 0F); // Box 33
		bodyModel[16].setRotationPoint(-36F, -5F, 7F);

		bodyModel[17].addBox(0F, 0F, 0F, 10, 4, 4, 0F); // Box 35
		bodyModel[17].setRotationPoint(-19F, -5F, 7F);

		bodyModel[18].addBox(0F, 0F, 0F, 10, 4, 4, 0F); // Box 36
		bodyModel[18].setRotationPoint(-19F, -5F, -11F);

		bodyModel[19].addBox(0F, 0F, 0F, 2, 2, 4, 0F); // Box 37
		bodyModel[19].setRotationPoint(-9F, -3F, -11F);

		bodyModel[20].addBox(0F, 0F, 0F, 2, 2, 4, 0F); // Box 38
		bodyModel[20].setRotationPoint(-9F, -3F, 7F);

		bodyModel[21].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 46
		bodyModel[21].setRotationPoint(-15.5F, -24F, -2.5F);

		bodyModel[22].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 47
		bodyModel[22].setRotationPoint(-14.5F, -24F, 0.5F);

		bodyModel[23].addBox(0F, 0F, 0F, 4, 2, 3, 0F); // Box 61
		bodyModel[23].setRotationPoint(-46F, 3F, -1.5F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 2, 7, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 63
		bodyModel[24].setRotationPoint(-38F, 1F, -11F);

		bodyModel[25].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 65
		bodyModel[25].setRotationPoint(-14F, -23F, -2F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 67
		bodyModel[26].setRotationPoint(-32F, -22F, 7F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 68
		bodyModel[27].setRotationPoint(-32F, -22F, -11F);

		bodyModel[28].addBox(0F, 0F, 0F, 1, 3, 14, 0F); // Box 106
		bodyModel[28].setRotationPoint(-20F, -22F, -7F);

		bodyModel[29].addBox(0F, 0F, 0F, 1, 3, 14, 0F); // Box 107
		bodyModel[29].setRotationPoint(-32F, -22F, -7F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 9, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1.75F, -2F, 0F, -1.75F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F); // Box 122
		bodyModel[30].setRotationPoint(-30F, -19F, 11F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 9, 2, 1, 0F,-1.75F, -2F, 0F, -1.75F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 123
		bodyModel[31].setRotationPoint(-30F, -19F, -12F);

		bodyModel[32].addBox(0F, 0F, 0F, 1, 21, 2, 0F); // Box 148
		bodyModel[32].setRotationPoint(38F, -22F, -1F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 1, 21, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 149
		bodyModel[33].setRotationPoint(38F, -22F, 1F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 1, 21, 7, 0F,0F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 150
		bodyModel[34].setRotationPoint(38F, -22F, -8F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.4F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 153
		bodyModel[35].setRotationPoint(38F, -23F, -2F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 154
		bodyModel[36].setRotationPoint(38F, -23F, 1F);

		bodyModel[37].addBox(0F, 0F, 0F, 29, 1, 3, 0F); // Box 156
		bodyModel[37].setRotationPoint(-38F, 1F, -11F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 18, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 157
		bodyModel[38].setRotationPoint(-9F, 5F, -11F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 18, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 158
		bodyModel[39].setRotationPoint(-9F, 5F, 8F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 11, 1, 6, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 160
		bodyModel[40].setRotationPoint(-31F, -23F, -7F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 161
		bodyModel[41].setRotationPoint(-32F, -23F, -7F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 162
		bodyModel[42].setRotationPoint(-20F, -23F, -7F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 163
		bodyModel[43].setRotationPoint(-32F, -23F, 1F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 164
		bodyModel[44].setRotationPoint(-20F, -23F, 1F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 11, 3, 4, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 165
		bodyModel[45].setRotationPoint(-31F, -22F, -11F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 166
		bodyModel[46].setRotationPoint(-20F, -22F, -11F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 11, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 167
		bodyModel[47].setRotationPoint(-31F, -22F, 7F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[48].setRotationPoint(-20F, -22F, 7F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 11, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 169
		bodyModel[49].setRotationPoint(-31F, -23F, 1F);

		bodyModel[50].addBox(0F, 0F, 0F, 1, 4, 2, 0F); // Box 48
		bodyModel[50].setRotationPoint(-33F, -23F, -1F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
		bodyModel[51].setRotationPoint(-33F, -22F, -6F);

		bodyModel[52].addBox(0F, 0F, 0F, 0, 2, 5, 0F); // Box 117 liveryimg 2 glow
		bodyModel[52].setRotationPoint(-32.05F, -22F, -6F);
		bodyModel[52].rotateAngleY = 0.19198622F;

		bodyModel[53].addBox(0F, 0F, -5F, 0, 2, 5, 0F); // Box 118 liveryimg 2 glow
		bodyModel[53].setRotationPoint(-32.05F, -22F, 6F);
		bodyModel[53].rotateAngleY = -0.19198622F;

		bodyModel[54].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 175
		bodyModel[54].setRotationPoint(-33F, -22F, 1F);

		bodyModel[55].addBox(0F, 0F, 0F, 2, 2, 4, 0F); // Box 185
		bodyModel[55].setRotationPoint(-38.75F, -13.75F, -2F);

		bodyModel[56].addBox(0F, 0F, 0F, 1, 9, 3, 0F); // Box 195
		bodyModel[56].setRotationPoint(-39F, -1F, -10F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 196
		bodyModel[57].setRotationPoint(-39F, 7F, 10F);

		bodyModel[58].addBox(0F, 0F, 0F, 3, 0, 3, 0F); // Box 197
		bodyModel[58].setRotationPoint(-42F, 8F, 8F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 198
		bodyModel[59].setRotationPoint(-39F, 7F, -11F);

		bodyModel[60].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 199
		bodyModel[60].setRotationPoint(-42F, -1F, 7F);

		bodyModel[61].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 200
		bodyModel[61].setRotationPoint(-42F, 2F, 7F);

		bodyModel[62].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 201
		bodyModel[62].setRotationPoint(-42F, 5F, 7F);

		bodyModel[63].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 202
		bodyModel[63].setRotationPoint(-42F, 5F, -9F);

		bodyModel[64].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 203
		bodyModel[64].setRotationPoint(-42F, -1F, -8F);

		bodyModel[65].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 204
		bodyModel[65].setRotationPoint(-42F, 2F, -9F);

		bodyModel[66].addBox(0F, 0F, 0F, 3, 0, 3, 0F); // Box 205
		bodyModel[66].setRotationPoint(-42F, 8F, -11F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F,-1F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // box65
		bodyModel[67].setRotationPoint(-43F, 8F, -9F);

		bodyModel[68].addBox(0F, 0F, 0F, 4, 2, 14, 0F); // Box 215
		bodyModel[68].setRotationPoint(38F, -1F, -7F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 218
		bodyModel[69].setRotationPoint(38F, 7F, 10F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 220
		bodyModel[70].setRotationPoint(38F, 7F, -11F);

		bodyModel[71].addBox(0F, 0F, 0F, 4, 2, 3, 0F); // Box 230
		bodyModel[71].setRotationPoint(42F, 3F, -1.5F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F,0F, 0F, 1F, -1F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 231
		bodyModel[72].setRotationPoint(42F, 8F, -9F);

		bodyModel[73].addBox(0F, 0F, 0F, 0, 7, 1, 0F); // Box 61
		bodyModel[73].setRotationPoint(-42F, -3F, 10F);

		bodyModel[74].addBox(0F, 0F, 0F, 0, 7, 1, 0F); // Box 63
		bodyModel[74].setRotationPoint(-42F, -3F, -11F);

		bodyModel[75].addBox(0F, 0F, 0F, 0, 8, 16, 0F); // Box 80
		bodyModel[75].setRotationPoint(-42F, -9F, -8F);

		bodyModel[76].addBox(0F, 0F, 0F, 76, 2, 16, 0F); // Box 251
		bodyModel[76].setRotationPoint(-38F, 1F, -8F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 252
		bodyModel[77].setRotationPoint(-42F, -4F, -6.75F);

		bodyModel[78].addBox(0F, 0F, 0F, 0, 8, 20, 0F); // Box 256
		bodyModel[78].setRotationPoint(42.01F, -1F, -10F);

		bodyModel[79].addBox(0F, 0F, 0F, 0, 7, 1, 0F); // Box 259
		bodyModel[79].setRotationPoint(42.01F, -3F, 10F);

		bodyModel[80].addBox(0F, 0F, 0F, 0, 8, 16, 0F); // Box 267
		bodyModel[80].setRotationPoint(42.01F, -9F, -8F);

		bodyModel[81].addBox(0F, 0F, 0F, 0, 7, 1, 0F); // Box 269
		bodyModel[81].setRotationPoint(42.01F, -3F, -11F);

		bodyModel[82].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 162 commander beacon
		bodyModel[82].setRotationPoint(-28.68F, -24.5F, -0.5F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0.3F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, 0.3F, -0.5F, 0.1F, 0.3F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, 0.3F, -0.5F, 0.1F); // Box 165
		bodyModel[83].setRotationPoint(-28.5F, -24F, -0.5F);

		bodyModel[84].addBox(0F, 0F, 0F, 8, 9, 2, 0F); // Box 148
		bodyModel[84].setRotationPoint(-32F, -13.01F, -3F);
		bodyModel[84].rotateAngleY = -0.61086524F;

		bodyModel[85].addBox(0F, 0F, 0F, 3, 2, 2, 0F); // Box 150
		bodyModel[85].setRotationPoint(-29F, -15.01F, -5.25F);
		bodyModel[85].rotateAngleY = -0.57595865F;

		bodyModel[86].addBox(0F, 0F, 0F, 2, 10, 6, 0F); // Box 152
		bodyModel[86].setRotationPoint(-31F, -14.01F, -3F);
		bodyModel[86].rotateAngleY = 0.15707963F;

		bodyModel[87].addBox(0F, 0F, 0F, 1, 4, 3, 0F); // Box 275
		bodyModel[87].setRotationPoint(-31F, -14F, 3F);

		bodyModel[88].addBox(0F, 0F, 0F, 3, 3, 0, 0F); // Box 276
		bodyModel[88].setRotationPoint(-36.5F, -12F, 7.5F);

		bodyModel[89].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 277
		bodyModel[89].setRotationPoint(-35.5F, -11F, 6.5F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 281
		bodyModel[90].setRotationPoint(41F, -4F, -6.75F);

		bodyModel[91].addBox(0F, 0F, 0F, 3, 2, 0, 0F); // Box 284
		bodyModel[91].setRotationPoint(-24F, -24.5F, 3F);

		bodyModel[92].addBox(0F, 0F, 0F, 11, 10, 0, 0F); // Box 285
		bodyModel[92].setRotationPoint(-19F, -13F, 11.01F);

		bodyModel[93].addBox(0F, 0F, 0F, 43, 8, 0, 0F); // Box 288
		bodyModel[93].setRotationPoint(-4F, -9F, 11F);

		bodyModel[94].addBox(0F, 0F, 0F, 11, 10, 0, 0F); // Box 300
		bodyModel[94].setRotationPoint(-19F, -13F, -11.01F);

		bodyModel[95].addBox(0F, 0F, 0F, 43, 8, 0, 0F); // Box 303
		bodyModel[95].setRotationPoint(-4F, -9F, -11F);

		bodyModel[96].addBox(0F, 0F, 0F, 0, 13, 2, 0F); // Box 296
		bodyModel[96].setRotationPoint(39F, -9F, -11F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 1, 3, 18, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 19
		bodyModel[97].setRotationPoint(11F, 4F, -9F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 1, 3, 18, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 19
		bodyModel[98].setRotationPoint(9F, 4F, -9F);

		bodyModel[99].addBox(0F, 0F, 0F, 1, 5, 0, 0F); // Box 305
		bodyModel[99].setRotationPoint(10F, 1F, -9.01F);

		bodyModel[100].addBox(0F, 0F, 0F, 1, 5, 0, 0F); // Box 305
		bodyModel[100].setRotationPoint(10F, 1F, 9.01F);

		bodyModel[101].addBox(0F, 0F, 0F, 1, 3, 18, 0F); // Box 19
		bodyModel[101].setRotationPoint(-11F, 4F, -9F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 1, 3, 18, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 19
		bodyModel[102].setRotationPoint(-10F, 4F, -9F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 1, 3, 18, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 19
		bodyModel[103].setRotationPoint(-12F, 4F, -9F);

		bodyModel[104].addBox(0F, 0F, 0F, 1, 4, 0, 0F); // Box 305
		bodyModel[104].setRotationPoint(-11F, 2F, -9.01F);

		bodyModel[105].addBox(0F, 0F, 0F, 1, 5, 0, 0F); // Box 305
		bodyModel[105].setRotationPoint(-11F, 1F, 9.01F);

		bodyModel[106].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 440
		bodyModel[106].setRotationPoint(-25.5F, 3F, -1F);

		bodyModel[107].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 441
		bodyModel[107].setRotationPoint(23.5F, 3F, -1F);

		bodyModel[108].addBox(0F, 0F, 0F, 12, 7, 1, 0F); // Box 293
		bodyModel[108].setRotationPoint(25F, -15F, -7.75F);

		bodyModel[109].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 19
		bodyModel[109].setRotationPoint(5F, 1F, -11.75F);
		bodyModel[109].rotateAngleX = 0.71558499F;

		bodyModel[110].addBox(0F, 0F, -1F, 1, 3, 1, 0F); // Box 19
		bodyModel[110].setRotationPoint(5F, 1F, 11.75F);
		bodyModel[110].rotateAngleX = -0.71558499F;

		bodyModel[111].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 101
		bodyModel[111].setRotationPoint(-42.5F, 0F, -6.75F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 101
		bodyModel[112].setRotationPoint(42F, 0F, -6.75F);

		bodyModel[113].addBox(0F, 0F, -5F, 1, 2, 5, 0F); // Box 240 glow liveryimg 2
		bodyModel[113].setRotationPoint(37.5F, -19.5F, 6F);
		bodyModel[113].rotateAngleY = 0.15707963F;

		bodyModel[114].addBox(0F, 0F, 0F, 1, 2, 5, 0F); // Box 241 glow liveryimg 2
		bodyModel[114].setRotationPoint(37.5F, -19.5F, -6F);
		bodyModel[114].rotateAngleY = -0.15707963F;

		bodyModel[115].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 114
		bodyModel[115].setRotationPoint(-17F, -20F, -8.75F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[116].setRotationPoint(-17F, -21F, -8.75F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 78
		bodyModel[117].setRotationPoint(-16.75F, -19.5F, -8.5F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 245
		bodyModel[118].setRotationPoint(-17F, -22F, -8.55F);

		bodyModel[119].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 246
		bodyModel[119].setRotationPoint(-15F, -24F, -1F);

		bodyModel[120].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 247
		bodyModel[120].setRotationPoint(-32F, -24.5F, -2.5F);

		bodyModel[121].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 248
		bodyModel[121].setRotationPoint(-31.5F, -24.5F, -1F);

		bodyModel[122].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 249
		bodyModel[122].setRotationPoint(-30.5F, -23.5F, -2F);

		bodyModel[123].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 250
		bodyModel[123].setRotationPoint(-31F, -24.5F, 0.5F);

		bodyModel[124].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 248
		bodyModel[124].setRotationPoint(-33F, -24F, 3F);

		bodyModel[125].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 250
		bodyModel[125].setRotationPoint(-32.5F, -24F, 4.5F);

		bodyModel[126].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 249
		bodyModel[126].setRotationPoint(-31F, -23F, 3.25F);

		bodyModel[127].addBox(0F, 0F, 0F, 2, 0, 20, 0F); // Box 205
		bodyModel[127].setRotationPoint(-44F, 8F, -10F);

		bodyModel[128].addBox(0F, 0F, 0F, 2, 0, 20, 0F); // Box 205
		bodyModel[128].setRotationPoint(42F, 8F, -10F);

		bodyModel[129].addBox(0F, 0F, 0F, 7, 4, 4, 0F); // Box 36
		bodyModel[129].setRotationPoint(-19F, -9F, -11F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 114
		bodyModel[130].setRotationPoint(-11F, 3F, 9.5F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[131].setRotationPoint(-11F, 2F, 9.5F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 78
		bodyModel[132].setRotationPoint(-10.75F, 3.5F, 9.75F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 78
		bodyModel[133].setRotationPoint(-10.75F, 1F, 7.75F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 2, 7, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 2603
		bodyModel[134].setRotationPoint(-38F, 1F, 7F);

		bodyModel[135].addBox(0F, 0F, 0F, 1, 9, 3, 0F); // Box 261
		bodyModel[135].setRotationPoint(-39F, -1F, 7F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 2, 7, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 263
		bodyModel[136].setRotationPoint(36F, 1F, -11F);

		bodyModel[137].addBox(0F, 0F, 0F, 1, 9, 3, 0F); // Box 264
		bodyModel[137].setRotationPoint(38F, -1F, -10F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 5, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Box 193
		bodyModel[138].setRotationPoint(-42F, 1F, -3F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 190 ditchlight f
		bodyModel[139].setRotationPoint(-42.25F, -4F, -6.75F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 5, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); // Box 273
		bodyModel[140].setRotationPoint(37F, 1F, -3F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 275 ditchlight f
		bodyModel[141].setRotationPoint(-42.75F, 0F, -6.75F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 276 ditchlight r
		bodyModel[142].setRotationPoint(41.75F, -4F, -6.75F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 278 ditchlight r
		bodyModel[143].setRotationPoint(42.25F, 0F, -6.75F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 186 Headlight Front
		bodyModel[144].setRotationPoint(-33.25F, -23F, -1F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 187 Headlight Front
		bodyModel[145].setRotationPoint(-33.25F, -21F, -1F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 247 Headlight Front
		bodyModel[146].setRotationPoint(-39.5F, -13.7F, -2F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 248 Headlight Front
		bodyModel[147].setRotationPoint(-39.5F, -13.7F, 0F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 284 Headlight Rear
		bodyModel[148].setRotationPoint(38.5F, -17.5F, -1F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 285 Headlight Rear
		bodyModel[149].setRotationPoint(38.5F, -19.5F, -1F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 3, 1, 10, 0F,0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F); // Box 4
		bodyModel[150].setRotationPoint(-45F, 6F, 0F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F,0.5F, 0F, 0F, -3F, 0F, 0F, -1F, 1F, 0F, -1.5F, 1F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F); // Box 4
		bodyModel[151].setRotationPoint(-45F, 4F, 2F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 3, 2, 10, 0F,0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 1F, 0F, 0F, -3.5F, 0F, 0F, -1F, 0F, -1F, -1.5F, 0F, -1F); // Box 4
		bodyModel[152].setRotationPoint(-45F, 7F, 0F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 3, 1, 10, 0F,-2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[153].setRotationPoint(-45F, 6F, -10F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F,-2F, 1F, 0F, -0.5F, 1F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 0F, 0F, -1F, 0F, 0F); // Box 4
		bodyModel[154].setRotationPoint(-45.5F, 4F, -10F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 3, 2, 10, 0F,-2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, -1F, -1F, 0F, -1F, -3.5F, 0F, 0F, 1F, 0F, 0F); // Box 4
		bodyModel[155].setRotationPoint(-45F, 7F, -10F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[156].setRotationPoint(-43F, 2.5F, -2F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 267
		bodyModel[157].setRotationPoint(42F, 2.5F, -2F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 2, 7, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 270434
		bodyModel[158].setRotationPoint(36F, 1F, 7F);

		bodyModel[159].addBox(0F, 0F, 0F, 1, 9, 3, 0F); // Box 271
		bodyModel[159].setRotationPoint(38F, -1F, 7F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 162 commander beacon
		bodyModel[160].setRotationPoint(-22F, -24.8F, -0.5F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0.3F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, 0.3F, -0.5F, 0.1F, 0.3F, 0F, 0.1F, -1F, 0F, 0.1F, -1F, 0F, 0.1F, 0.3F, 0F, 0.1F); // Box 165
		bodyModel[161].setRotationPoint(-21.82F, -23.8F, -0.5F);

		bodyModel[162].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 279
		bodyModel[162].setRotationPoint(-26F, -24.5F, 0F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 0, 4, 1, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 280
		bodyModel[163].setRotationPoint(39F, -5F, -11.5F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 0, 4, 1, 0F,0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 281
		bodyModel[164].setRotationPoint(39F, -5F, 10.5F);

		bodyModel[165].addBox(0F, 0F, 0F, 0, 13, 2, 0F); // Box 282
		bodyModel[165].setRotationPoint(39F, -9F, 9F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 3, 2, 10, 0F,-2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, 1F, 0F, 0F, -1.5F, 0F, -1F, -1F, 0F, -1F); // Box 283
		bodyModel[166].setRotationPoint(42F, 7F, 0F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 3, 2, 10, 0F,0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -1F, 0F, -1F, -1.5F, 0F, -1F, 1F, 0F, 0F, -3.5F, 0F, 0F); // Box 284
		bodyModel[167].setRotationPoint(42F, 7F, -10F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 3, 1, 10, 0F,0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F); // Box 285
		bodyModel[168].setRotationPoint(42F, 6F, -10F);

		bodyModel[169].addShapeBox(0F, 0F, 0F, 3, 1, 10, 0F,-2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F); // Box 286
		bodyModel[169].setRotationPoint(42F, 6F, 0F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F,-3F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 1F, 0F, -1F, 1F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F); // Box 287
		bodyModel[170].setRotationPoint(42F, 4F, 2F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F,-0.5F, 1F, 0F, -2F, 1F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0.5F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, -1.5F, 0F, 0F); // Box 288
		bodyModel[171].setRotationPoint(42.5F, 4F, -10F);

		bodyModel[172].addBox(0F, 0F, 0F, 6, 8, 14, 0F); // Box 289
		bodyModel[172].setRotationPoint(-38F, -21F, -7F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 29, 1, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 292
		bodyModel[173].setRotationPoint(-19F, -22F, -7F);

		bodyModel[174].addShapeBox(0F, 0F, 0F, 29, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 293
		bodyModel[174].setRotationPoint(-19F, -22F, 3F);

		bodyModel[175].addBox(0F, 0F, 0F, 36, 1, 6, 0F); // Box 294
		bodyModel[175].setRotationPoint(-19F, -22F, -3F);

		bodyModel[176].addShapeBox(0F, 0F, 0F, 6, 1, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 295
		bodyModel[176].setRotationPoint(-38F, -22F, -7F);

		bodyModel[177].addBox(0F, 0F, 0F, 6, 1, 6, 0F); // Box 296
		bodyModel[177].setRotationPoint(-38F, -22F, -3F);

		bodyModel[178].addShapeBox(0F, 0F, 0F, 6, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 297
		bodyModel[178].setRotationPoint(-38F, -22F, 3F);

		bodyModel[179].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 298 headlight f
		bodyModel[179].setRotationPoint(-39.75F, -20.5F, -1F);

		bodyModel[180].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 299 headlight f
		bodyModel[180].setRotationPoint(-39.75F, -18.5F, -1F);

		bodyModel[181].addShapeBox(0F, 0F, 0F, 1, 20, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 303
		bodyModel[181].setRotationPoint(-39F, -21F, 1F);

		bodyModel[182].addBox(0F, 0F, 0F, 1, 20, 2, 0F); // Box 304
		bodyModel[182].setRotationPoint(-39F, -21F, -1F);

		bodyModel[183].addShapeBox(0F, 0F, 0F, 1, 20, 6, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 305
		bodyModel[183].setRotationPoint(-39F, -21F, -7F);

		bodyModel[184].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 306
		bodyModel[184].setRotationPoint(-39F, -22F, -1F);

		bodyModel[185].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,-1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 307
		bodyModel[185].setRotationPoint(-39F, -22F, -7F);

		bodyModel[186].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 308
		bodyModel[186].setRotationPoint(-39F, -22F, 1F);

		bodyModel[187].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 354
		bodyModel[187].setRotationPoint(-39F, -23.5F, -2F);

		bodyModel[188].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 355
		bodyModel[188].setRotationPoint(-38F, -23.25F, -1F);

		bodyModel[189].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 356
		bodyModel[189].setRotationPoint(-38.5F, -23.25F, -3F);

		bodyModel[190].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 357
		bodyModel[190].setRotationPoint(-36.5F, -22.5F, -2F);

		bodyModel[191].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 286
		bodyModel[191].setRotationPoint(36F, -24.5F, 3.5F);

		bodyModel[192].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 287
		bodyModel[192].setRotationPoint(37.5F, -23.75F, 2.5F);

		bodyModel[193].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 288
		bodyModel[193].setRotationPoint(36.5F, -24.5F, 1.5F);

		bodyModel[194].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 289
		bodyModel[194].setRotationPoint(36F, -24.75F, 2.5F);

		bodyModel[195].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F); // Box 296
		bodyModel[195].setRotationPoint(-8F, -13F, -11F);

		bodyModel[196].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F); // Box 297
		bodyModel[196].setRotationPoint(-8F, -13F, 11F);

		bodyModel[197].addBox(0F, 0F, 0F, 7, 12, 14, 0F); // Box 298
		bodyModel[197].setRotationPoint(-38F, -13F, -7F);

		bodyModel[198].addShapeBox(0F, 0F, 0F, 7, 1, 2, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 299
		bodyModel[198].setRotationPoint(-38F, -14F, -1F);

		bodyModel[199].addShapeBox(0F, 0F, 0F, 7, 1, 6, 0F,0F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 300
		bodyModel[199].setRotationPoint(-38F, -14F, -7F);

		bodyModel[200].addShapeBox(0F, 0F, 0F, 7, 1, 6, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 301
		bodyModel[200].setRotationPoint(-38F, -14F, 1F);

		bodyModel[201].addShapeBox(0F, 0F, 0F, 1, 12, 6, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 302
		bodyModel[201].setRotationPoint(-39F, -13F, -7F);

		bodyModel[202].addShapeBox(0F, 0F, 0F, 1, 12, 6, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 303
		bodyModel[202].setRotationPoint(-39F, -13F, 1F);

		bodyModel[203].addShapeBox(0F, 0F, 0F, 1, 12, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 304
		bodyModel[203].setRotationPoint(-39F, -13F, -1F);

		bodyModel[204].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,-1F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, -0.5F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 305
		bodyModel[204].setRotationPoint(-39F, -14F, -7F);

		bodyModel[205].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,-0.5F, -1F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 306
		bodyModel[205].setRotationPoint(-39F, -14F, 1F);

		bodyModel[206].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.65F, -0.25F, -0.25F, 0.2F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.65F, -0.25F, -0.25F, 0.2F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 307 glowey
		bodyModel[206].setRotationPoint(-38.9F, -12.7F, -7F);

		bodyModel[207].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0.2F, -0.25F, -0.25F, -0.65F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0.2F, -0.25F, -0.25F, -0.65F, -0.25F, -0.25F); // Box 308 glowey
		bodyModel[207].setRotationPoint(-38.9F, -12.7F, 5F);

		bodyModel[208].addBox(0F, 0F, 0F, 13, 1, 2, 0F); // Box 309
		bodyModel[208].setRotationPoint(-32F, -23F, -1F);

		bodyModel[209].addBox(0F, 0F, 0F, 2, 1, 14, 0F); // Box 310
		bodyModel[209].setRotationPoint(9F, 3F, -7F);

		bodyModel[210].addBox(0F, 0F, 0F, 2, 1, 14, 0F); // Box 311
		bodyModel[210].setRotationPoint(-11F, 3F, -7F);

		bodyModel[211].addBox(-0.5F, 0F, -0.5F, 1, 14, 4, 0F); // Box 52 door swing right
		bodyModel[211].setRotationPoint(-31.5F, -19F, -10.5F);

		bodyModel[212].addBox(-0.5F, 0F, -3.5F, 1, 14, 4, 0F); // Box 314 door swing right
		bodyModel[212].setRotationPoint(-19.5F, -19F, 10.5F);

		bodyModel[213].addBox(0F, 0F, 0F, 4, 1, 22, 0F); // Box 318
		bodyModel[213].setRotationPoint(22.5F, 1F, -11F);

		bodyModel[214].addBox(0F, 0F, 0F, 4, 1, 3, 0F); // Box 319
		bodyModel[214].setRotationPoint(-26.5F, 1F, 8F);

		bodyModel[215].addBox(0F, 0F, 0F, 0, 1, 22, 0F); // Box 320
		bodyModel[215].setRotationPoint(42.01F, 7F, -11F);

		bodyModel[216].addBox(0F, 0F, 0F, 0, 1, 22, 0F); // Box 321
		bodyModel[216].setRotationPoint(-42.01F, 7F, -11F);

		bodyModel[217].addBox(0F, 0F, 0F, 21, 2, 3, 0F); // Box 144
		bodyModel[217].setRotationPoint(17F, -22F, -10F);

		bodyModel[218].addBox(0F, 0F, 0F, 21, 2, 3, 0F); // Box 145
		bodyModel[218].setRotationPoint(17F, -22F, 7F);

		bodyModel[219].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 152
		bodyModel[219].setRotationPoint(38F, -23F, -10F);

		bodyModel[220].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, 0.4F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 155
		bodyModel[220].setRotationPoint(38F, -23F, 2F);

		bodyModel[221].addShapeBox(0F, 0F, 0F, 21, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 292
		bodyModel[221].setRotationPoint(17F, -20F, -10F);

		bodyModel[222].addShapeBox(0F, 0F, 0F, 21, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 294
		bodyModel[222].setRotationPoint(17F, -20F, 7F);

		bodyModel[223].addBox(0F, 0F, 0F, 21, 1, 14, 0F); // Box 298
		bodyModel[223].setRotationPoint(17F, -22F, -7F);

		bodyModel[224].addBox(0F, 0F, 0F, 21, 2, 2, 0F); // Box 331
		bodyModel[224].setRotationPoint(17F, -23.5F, -1F);

		bodyModel[225].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 332
		bodyModel[225].setRotationPoint(38F, -23.5F, -1F);

		bodyModel[226].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F,-0.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F); // Box 448
		bodyModel[226].setRotationPoint(-45F, 5F, 2F);

		bodyModel[227].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F,-2.5F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F); // Box 449
		bodyModel[227].setRotationPoint(-45F, 5F, -10F);

		bodyModel[228].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F,-2F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F); // Box 336
		bodyModel[228].setRotationPoint(42F, 5F, 2F);

		bodyModel[229].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F,0F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F); // Box 337
		bodyModel[229].setRotationPoint(42F, 5F, -10F);

		bodyModel[230].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0.2F, -0.25F, -0.25F, -0.65F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0.2F, -0.25F, -0.25F, -0.65F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 339 glowey
		bodyModel[230].setRotationPoint(38F, -15.7F, -7F);

		bodyModel[231].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.65F, -0.25F, -0.25F, 0.2F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.65F, -0.25F, -0.25F, 0.2F, -0.25F, -0.25F); // Box 340 glowey
		bodyModel[231].setRotationPoint(38F, -15.7F, 5F);

		bodyModel[232].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 402
		bodyModel[232].setRotationPoint(-38F, -14F, -1F);

		bodyModel[233].addBox(0F, 0F, 0F, 2, 10, 1, 0F); // Box 342
		bodyModel[233].setRotationPoint(22.5F, -15F, -7.75F);

		bodyModel[234].addBox(0F, 0F, 0F, 12, 7, 1, 0F); // Box 343
		bodyModel[234].setRotationPoint(25F, -15F, 6.75F);

		bodyModel[235].addBox(0F, 0F, 0F, 2, 10, 1, 0F); // Box 344
		bodyModel[235].setRotationPoint(22.5F, -15F, 6.75F);

		bodyModel[236].addBox(0F, 0F, 0F, 4, 6, 1, 0F); // Box 345
		bodyModel[236].setRotationPoint(25F, -7.5F, 6.75F);

		bodyModel[237].addBox(0F, 0F, 0F, 7, 5, 1, 0F); // Box 346
		bodyModel[237].setRotationPoint(29.5F, -7F, 6.75F);

		bodyModel[238].addBox(0F, 0F, 0F, 7, 5, 1, 0F); // Box 347
		bodyModel[238].setRotationPoint(29.5F, -7F, -7.75F);

		bodyModel[239].addBox(0F, 0F, 0F, 4, 6, 1, 0F); // Box 348
		bodyModel[239].setRotationPoint(25F, -7.5F, -7.75F);

		bodyModel[240].addBox(0F, 0F, 0F, 3, 6, 1, 0F); // Box 349
		bodyModel[240].setRotationPoint(17F, -7.5F, 6.75F);

		bodyModel[241].addBox(0F, 0F, 0F, 3, 6, 1, 0F); // Box 350
		bodyModel[241].setRotationPoint(17F, -7.5F, -7.75F);

		bodyModel[242].addShapeBox(0F, 0F, 0F, 1, 1, 14, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 277
		bodyModel[242].setRotationPoint(-43F, -1F, -7F);

		bodyModel[243].addShapeBox(0F, 0F, 0F, 1, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 278
		bodyModel[243].setRotationPoint(42F, -1F, -7F);

		bodyModel[244].addBox(0F, 0F, 0F, 5, 1, 1, 0F); // Box 253
		bodyModel[244].setRotationPoint(-31F, 1F, 9F);
		bodyModel[244].rotateAngleZ = -0.27925268F;

		bodyModel[245].addBox(0F, 0F, 0F, 5, 1, 1, 0F); // Box 280
		bodyModel[245].setRotationPoint(-36F, 1F, 9F);

		bodyModel[246].addBox(0F, -0.5F, 0F, 3, 1, 4, 0F); // Box 412
		bodyModel[246].setRotationPoint(-42F, -0.5F, -2F);
		bodyModel[246].rotateAngleZ = 1.67551608F;

		bodyModel[247].addBox(-3F, -0.5F, 0F, 3, 1, 4, 0F); // Box 282
		bodyModel[247].setRotationPoint(42F, -0.5F, -2F);
		bodyModel[247].rotateAngleZ = -1.67551608F;

		bodyModel[248].addBox(0F, 0F, 0F, 28, 20, 1, 0F); // Box 283
		bodyModel[248].setRotationPoint(10F, -21F, -7.5F);

		bodyModel[249].addBox(0F, 0F, 0F, 28, 20, 1, 0F); // Box 284
		bodyModel[249].setRotationPoint(10F, -21F, 6.5F);

		bodyModel[250].addShapeBox(0F, 0F, 0F, 7, 1, 4, 0F,0F, -1F, 0.5F, 0F, -1F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 285
		bodyModel[250].setRotationPoint(10F, -22F, -7F);

		bodyModel[251].addShapeBox(0F, 0F, 0F, 7, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0.5F, 0F, -1F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 286
		bodyModel[251].setRotationPoint(10F, -22F, 3F);

		bodyModel[252].addBox(0F, 0F, -5F, 1, 2, 5, 0F); // Box 287 glow liveryimg 2
		bodyModel[252].setRotationPoint(-38.5F, -18.5F, 6F);
		bodyModel[252].rotateAngleY = -0.15707963F;

		bodyModel[253].addBox(0F, 0F, 0F, 1, 2, 5, 0F); // Box 288 glow liveryimg 2
		bodyModel[253].setRotationPoint(-38.5F, -18.5F, -6F);
		bodyModel[253].rotateAngleY = 0.15707963F;

		bodyModel[254].addBox(0F, 0F, 0F, 1, 4, 2, 0F); // Box 289
		bodyModel[254].setRotationPoint(-39.5F, -20.5F, -1F);

		bodyModel[255].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.65F, -0.25F, -0.25F, 0.2F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.65F, -0.25F, -0.25F, 0.2F, -0.25F, -0.25F); // Box 290 glowey
		bodyModel[255].setRotationPoint(37.8F, -21.5F, 6F);

		bodyModel[256].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0.2F, -0.25F, -0.25F, -0.65F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0.2F, -0.25F, -0.25F, -0.65F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 291 glowey
		bodyModel[256].setRotationPoint(37.8F, -21.5F, -8F);

		bodyModel[257].addBox(0F, 0F, 0F, 3, 8, 0, 0F); // Box 292
		bodyModel[257].setRotationPoint(-35F, -13F, -11.01F);

		bodyModel[258].addShapeBox(0F, 0F, 0F, 0, 4, 1, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 293
		bodyModel[258].setRotationPoint(-39F, -5F, -11.5F);

		bodyModel[259].addBox(0F, 0F, 0F, 0, 14, 2, 0F); // Box 294
		bodyModel[259].setRotationPoint(-39F, -10F, -11F);

		bodyModel[260].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F); // Box 295
		bodyModel[260].setRotationPoint(-37F, -13F, -11.01F);

		bodyModel[261].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.23F, 0F, 0F, 0.23F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.23F, 0F, 0F, 0.23F); // Box 296
		bodyModel[261].setRotationPoint(-37F, -10F, -11F);
		bodyModel[261].rotateAngleY = 1.11701072F;

		bodyModel[262].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, -2F, 2F, 0F, -2F, 2F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 298
		bodyModel[262].setRotationPoint(-42.01F, -9F, -10F);
		bodyModel[262].rotateAngleY = -3.14159265F;

		bodyModel[263].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, -2F, 2F, 0F, -2F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 299
		bodyModel[263].setRotationPoint(-42.01F, -9F, 11F);
		bodyModel[263].rotateAngleY = -3.14159265F;

		bodyModel[264].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, -2F, 2F, 0F, -2F, 2F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 300
		bodyModel[264].setRotationPoint(42.01F, -9F, -10F);
		bodyModel[264].rotateAngleY = -3.14159265F;

		bodyModel[265].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, -2F, 2F, 0F, -2F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 301
		bodyModel[265].setRotationPoint(42.01F, -9F, 11F);
		bodyModel[265].rotateAngleY = -3.14159265F;

		bodyModel[266].addShapeBox(0F, 0F, 0F, 21, 1, 9, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 403
		bodyModel[266].setRotationPoint(17F, -23F, -10F);

		bodyModel[267].addShapeBox(0F, 0F, 0F, 21, 1, 9, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 404
		bodyModel[267].setRotationPoint(17F, -23F, 1F);

		bodyModel[268].addBox(0F, 0F, 0F, 3, 1, 6, 0F); // Box 405 EXTRA STACC
		bodyModel[268].setRotationPoint(10.5F, -24.5F, -3F);

		bodyModel[269].addBox(0F, 0F, 0F, 0, 14, 2, 0F); // Box 406
		bodyModel[269].setRotationPoint(-39F, -10F, 9F);

		bodyModel[270].addShapeBox(0F, 0F, 0F, 0, 4, 1, 0F,0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 407
		bodyModel[270].setRotationPoint(-39F, -5F, 10.5F);

		bodyModel[271].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.23F, 0F, 0F, 0.23F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.23F, 0F, 0F, 0.23F); // Box 408
		bodyModel[271].setRotationPoint(-37F, -10F, 11F);
		bodyModel[271].rotateAngleY = 2.02458193F;

		bodyModel[272].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F); // Box 409
		bodyModel[272].setRotationPoint(-37F, -13F, 10.99F);

		bodyModel[273].addBox(0F, 0F, 0F, 3, 8, 0, 0F); // Box 410
		bodyModel[273].setRotationPoint(-35F, -13F, 10.99F);

		bodyModel[274].addBox(0F, 0F, 0F, 3, 2, 0, 0F); // Box 411
		bodyModel[274].setRotationPoint(-42F, 6F, -8F);

		bodyModel[275].addBox(0F, 0F, 0F, 3, 2, 0, 0F); // Box 412
		bodyModel[275].setRotationPoint(-42F, 6F, 8F);

		bodyModel[276].addBox(0F, 0F, 0F, 3, 2, 0, 0F); // Box 413
		bodyModel[276].setRotationPoint(39F, 6F, 8F);

		bodyModel[277].addBox(0F, 0F, 0F, 3, 2, 0, 0F); // Box 414
		bodyModel[277].setRotationPoint(39F, 6F, -8F);

		bodyModel[278].addBox(0F, 0F, 0F, 4, 2, 6, 0F); // Box 417 atsf bit
		bodyModel[278].setRotationPoint(-29F, -24F, -3F);

		bodyModel[279].addBox(0F, 0F, 0F, 5, 2, 4, 0F); // Box 418 atsf bit
		bodyModel[279].setRotationPoint(-24.25F, -24F, -3F);

		bodyModel[280].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 419 cull atsf bit
		bodyModel[280].setRotationPoint(-23F, -24F, 3.5F);

		bodyModel[281].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 364 prime base
		bodyModel[281].setRotationPoint(-30F, -23.5F, -8F);

		bodyModel[282].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F); // Box 6 PRIME1-1
		bodyModel[282].setRotationPoint(-30F, -24.5F, -8F);

		bodyModel[283].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F); // Box 7 PRIME1-3
		bodyModel[283].setRotationPoint(-30F, -24.5F, -8F);

		bodyModel[284].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 8 PRIME1-2
		bodyModel[284].setRotationPoint(-30F, -24.5F, -8F);

		bodyModel[285].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 9 PRIME1-4
		bodyModel[285].setRotationPoint(-30F, -24.5F, -8F);

		bodyModel[286].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 425
		bodyModel[286].setRotationPoint(-23F, -25F, 5F);

		bodyModel[287].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 426 cull atsf bit
		bodyModel[287].setRotationPoint(-30F, -22.5F, -8.5F);

		bodyModel[288].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 427
		bodyModel[288].setRotationPoint(-33F, -25F, -1.5F);

		bodyModel[289].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 428
		bodyModel[289].setRotationPoint(-32F, -25F, -0.5F);

		bodyModel[290].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 429
		bodyModel[290].setRotationPoint(-33F, -25F, 0.5F);

		bodyModel[291].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 430
		bodyModel[291].setRotationPoint(-31.5F, -24F, -0.5F);

		bodyModel[292].addBox(0F, 0F, 0F, 3, 4, 0, 0F); // Box 431
		bodyModel[292].setRotationPoint(-42F, 1F, -7F);

		bodyModel[293].addBox(0F, 0F, 0F, 3, 4, 0, 0F); // Box 432
		bodyModel[293].setRotationPoint(-42F, 1F, 7F);

		bodyModel[294].addBox(0F, 0F, 0F, 3, 4, 0, 0F); // Box 433
		bodyModel[294].setRotationPoint(39F, 1F, 7F);

		bodyModel[295].addBox(0F, 0F, 0F, 3, 4, 0, 0F); // Box 434
		bodyModel[295].setRotationPoint(39F, 1F, -7F);

		bodyModel[296].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 364 prime base
		bodyModel[296].setRotationPoint(-37F, -23F, -1F);

		bodyModel[297].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F); // Box 6 PRIME2-1
		bodyModel[297].setRotationPoint(-37F, -23.5F, -1F);

		bodyModel[298].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F); // Box 7 PRIME2-3
		bodyModel[298].setRotationPoint(-37F, -23.5F, -1F);

		bodyModel[299].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 8 PRIME2-2
		bodyModel[299].setRotationPoint(-37F, -23.5F, -1F);

		bodyModel[300].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 9 PRIME2-4
		bodyModel[300].setRotationPoint(-37F, -23.5F, -1F);

		bodyModel[301].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 440
		bodyModel[301].setRotationPoint(42F, 0F, 4.75F);

		bodyModel[302].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 441 ditchlight r
		bodyModel[302].setRotationPoint(42.25F, 0F, 4.75F);

		bodyModel[303].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 442
		bodyModel[303].setRotationPoint(41F, -4F, 4.75F);

		bodyModel[304].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 443 ditchlight r
		bodyModel[304].setRotationPoint(41.75F, -4F, 4.75F);

		bodyModel[305].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 444
		bodyModel[305].setRotationPoint(-42.5F, 0F, 4.75F);

		bodyModel[306].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 445 ditchlight f
		bodyModel[306].setRotationPoint(-42.75F, 0F, 4.75F);

		bodyModel[307].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 446 ditchlight f
		bodyModel[307].setRotationPoint(-42.25F, -4F, 4.75F);

		bodyModel[308].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 447
		bodyModel[308].setRotationPoint(-42F, -4F, 4.75F);

		bodyModel[309].addBox(0F, 0F, 0F, 3, 0, 3, 0F); // Box 448
		bodyModel[309].setRotationPoint(39F, 8F, -11F);

		bodyModel[310].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 449
		bodyModel[310].setRotationPoint(39F, 5F, -9F);

		bodyModel[311].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 450
		bodyModel[311].setRotationPoint(39F, 2F, -9F);

		bodyModel[312].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 451
		bodyModel[312].setRotationPoint(39F, -1F, -8F);

		bodyModel[313].addBox(0F, 0F, 0F, 3, 0, 3, 0F); // Box 452
		bodyModel[313].setRotationPoint(39F, 8F, 8F);

		bodyModel[314].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 453
		bodyModel[314].setRotationPoint(39F, 5F, 7F);

		bodyModel[315].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 454
		bodyModel[315].setRotationPoint(39F, 2F, 7F);

		bodyModel[316].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 455
		bodyModel[316].setRotationPoint(39F, -1F, 7F);

		bodyModel[317].addBox(0F, 0F, 0F, 2, 1, 4, 0F); // Box 319
		bodyModel[317].setRotationPoint(-38.75F, -11.75F, -2F);

		bodyModel[318].addBox(0F, 0F, 0F, 0, 4, 1, 0F); // Box 350
		bodyModel[318].setRotationPoint(-30.01F, -17F, -12F);

		bodyModel[319].addBox(0F, 0F, 0F, 0, 4, 1, 0F); // Box 321
		bodyModel[319].setRotationPoint(-30.01F, -17F, 11F);

		bodyModel[320].addBox(0F, 0F, 0F, 2, 1, 22, 0F); // Box 322
		bodyModel[320].setRotationPoint(23.5F, 2F, -11F);

		bodyModel[321].addBox(0F, 0F, 0F, 2, 1, 22, 0F); // Box 323
		bodyModel[321].setRotationPoint(-25.5F, 2F, -11F);

		bodyModel[322].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 324
		bodyModel[322].setRotationPoint(-33F, -24F, -1.5F);

		bodyModel[323].addShapeBox(0F, -1F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 334 commander beacon
		bodyModel[323].setRotationPoint(-30F, -23F, 7.5F);

		bodyModel[324].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 335
		bodyModel[324].setRotationPoint(-30F, -23F, 7.5F);

		bodyModel[325].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 329 support cull
		bodyModel[325].setRotationPoint(-30.5F, -22F, -9F);

		bodyModel[326].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 330
		bodyModel[326].setRotationPoint(-30.5F, -22F, 7F);

		bodyModel[327].addShapeBox(0F, -1F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 334 commander beacon
		bodyModel[327].setRotationPoint(-30F, -23F, -8.5F);

		bodyModel[328].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 335
		bodyModel[328].setRotationPoint(-30F, -23F, -8.5F);

		bodyModel[329].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 333
		bodyModel[329].setRotationPoint(-18F, -23.5F, 3.5F);

		bodyModel[330].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 334
		bodyModel[330].setRotationPoint(-16.5F, -23F, 4.5F);

		bodyModel[331].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 335
		bodyModel[331].setRotationPoint(-17F, -24F, 4.5F);

		bodyModel[332].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 336
		bodyModel[332].setRotationPoint(-18F, -23.5F, 5.5F);

		bodyModel[333].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 337
		bodyModel[333].setRotationPoint(-18F, -24F, -1.5F);

		bodyModel[334].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 338 cull
		bodyModel[334].setRotationPoint(42F, -1F, -2F);

		bodyModel[335].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 339 cull
		bodyModel[335].setRotationPoint(-44F, -1F, -2F);

		bodyModel[336].addBox(0F, 0F, 0F, 1, 2, 3, 0F); // Box 340
		bodyModel[336].setRotationPoint(38.5F, -22.35F, -1.5F);
	}
	ModelTypeB theTrucks1 = new ModelTypeB();
	ModelFB2 theTrucks2 = new ModelFB2();
	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		for (int i = 0; i < 337; i++) {
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
		if (entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor() == 7||entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor() == 3247) {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/typeb_Black.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.52, 0.33, 0);
			theTrucks1.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(3.05, 0, 0);
			theTrucks1.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else if (entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor() == 1){
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/typeb_LightGrey.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.52, 0.33, 0);
			theTrucks1.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(3.05, 0, 0);
			theTrucks1.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else if (entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor() == 14 ||entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor() == 9){
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/typeb_bnsf_h1.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.52, 0.33, 0);
			theTrucks1.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(3.05, 0, 0);
			theTrucks1.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else if (entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor() == 11){
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/fb2_up.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.52, 0.33, 0);
			theTrucks2.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(3.05, 0, 0);
			theTrucks2.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else if (entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor() == 4){
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/fb2_Grey.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.52, 0.33, 0);
			theTrucks2.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(3.05, 0, 0);
			theTrucks2.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/fb2_Black.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.52, 0.33, 0);
			theTrucks2.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(3.05, 0, 0);
			theTrucks2.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		}
	}
	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
	{
	}
	public ModelRendererTurbo B23Model[];
	public ArrayList<double[]> getSmokePosition() {
		return new ArrayList<double[]>() {
			{
				add(new double[]{0.95D, 1.4D, 0.0D});
			}
		};
	}
}