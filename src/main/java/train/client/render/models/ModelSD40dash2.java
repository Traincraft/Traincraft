//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2021 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 27.03.2019 - 14:12:15
// Last changed on: 27.03.2019 - 14:12:15

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

public class ModelSD40dash2 extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelSD40dash2() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[429];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 23
		bodyModel[2] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 6
		bodyModel[3] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 7
		bodyModel[4] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 36
		bodyModel[5] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 34
		bodyModel[6] = new ModelRendererTurbo(this, 425, 9, textureX, textureY); // Box 112
		bodyModel[7] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 164
		bodyModel[8] = new ModelRendererTurbo(this, 145, 9, textureX, textureY); // Box 3
		bodyModel[9] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 246
		bodyModel[10] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 247
		bodyModel[11] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 259
		bodyModel[12] = new ModelRendererTurbo(this, 129, 9, textureX, textureY); // Box 262
		bodyModel[13] = new ModelRendererTurbo(this, 145, 9, textureX, textureY); // Box 264
		bodyModel[14] = new ModelRendererTurbo(this, 425, 9, textureX, textureY); // Box 265
		bodyModel[15] = new ModelRendererTurbo(this, 481, 9, textureX, textureY); // Box 261
		bodyModel[16] = new ModelRendererTurbo(this, 161, 9, textureX, textureY); // Box 143
		bodyModel[17] = new ModelRendererTurbo(this, 497, 9, textureX, textureY); // Box 62
		bodyModel[18] = new ModelRendererTurbo(this, 505, 9, textureX, textureY); // Box 61
		bodyModel[19] = new ModelRendererTurbo(this, 145, 17, textureX, textureY); // Box 63
		bodyModel[20] = new ModelRendererTurbo(this, 361, 9, textureX, textureY); // Box 4
		bodyModel[21] = new ModelRendererTurbo(this, 129, 17, textureX, textureY); // Box 98
		bodyModel[22] = new ModelRendererTurbo(this, 169, 25, textureX, textureY); // Box 197
		bodyModel[23] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 80
		bodyModel[24] = new ModelRendererTurbo(this, 153, 17, textureX, textureY); // Box 144
		bodyModel[25] = new ModelRendererTurbo(this, 209, 25, textureX, textureY); // Box 145
		bodyModel[26] = new ModelRendererTurbo(this, 169, 9, textureX, textureY); // Box 147
		bodyModel[27] = new ModelRendererTurbo(this, 193, 25, textureX, textureY); // Box 148
		bodyModel[28] = new ModelRendererTurbo(this, 233, 25, textureX, textureY); // Box 4
		bodyModel[29] = new ModelRendererTurbo(this, 257, 25, textureX, textureY); // Box 4
		bodyModel[30] = new ModelRendererTurbo(this, 273, 25, textureX, textureY); // Box 4
		bodyModel[31] = new ModelRendererTurbo(this, 305, 25, textureX, textureY); // Box 4
		bodyModel[32] = new ModelRendererTurbo(this, 329, 25, textureX, textureY); // Box 4
		bodyModel[33] = new ModelRendererTurbo(this, 345, 25, textureX, textureY); // Box 4
		bodyModel[34] = new ModelRendererTurbo(this, 425, 17, textureX, textureY); // Box 2
		bodyModel[35] = new ModelRendererTurbo(this, 225, 41, textureX, textureY); // Box 159
		bodyModel[36] = new ModelRendererTurbo(this, 385, 33, textureX, textureY); // Box 3
		bodyModel[37] = new ModelRendererTurbo(this, 481, 17, textureX, textureY); // Box 246
		bodyModel[38] = new ModelRendererTurbo(this, 489, 17, textureX, textureY); // Box 164
		bodyModel[39] = new ModelRendererTurbo(this, 201, 25, textureX, textureY); // Box 259
		bodyModel[40] = new ModelRendererTurbo(this, 217, 25, textureX, textureY); // Box 261
		bodyModel[41] = new ModelRendererTurbo(this, 297, 25, textureX, textureY); // Box 262
		bodyModel[42] = new ModelRendererTurbo(this, 497, 25, textureX, textureY); // Box 264
		bodyModel[43] = new ModelRendererTurbo(this, 377, 33, textureX, textureY); // Box 265
		bodyModel[44] = new ModelRendererTurbo(this, 393, 33, textureX, textureY); // Box 266
		bodyModel[45] = new ModelRendererTurbo(this, 417, 33, textureX, textureY); // Box 4
		bodyModel[46] = new ModelRendererTurbo(this, 193, 33, textureX, textureY); // Box 5
		bodyModel[47] = new ModelRendererTurbo(this, 505, 17, textureX, textureY); // Box 143
		bodyModel[48] = new ModelRendererTurbo(this, 233, 25, textureX, textureY); // Box 61
		bodyModel[49] = new ModelRendererTurbo(this, 369, 25, textureX, textureY); // Box 62
		bodyModel[50] = new ModelRendererTurbo(this, 401, 33, textureX, textureY); // Box 63
		bodyModel[51] = new ModelRendererTurbo(this, 441, 33, textureX, textureY); // Box 80
		bodyModel[52] = new ModelRendererTurbo(this, 449, 33, textureX, textureY); // Box 81
		bodyModel[53] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 179
		bodyModel[54] = new ModelRendererTurbo(this, 457, 33, textureX, textureY); // Box 234
		bodyModel[55] = new ModelRendererTurbo(this, 257, 25, textureX, textureY); // Box 236
		bodyModel[56] = new ModelRendererTurbo(this, 481, 33, textureX, textureY); // Box 4
		bodyModel[57] = new ModelRendererTurbo(this, 137, 41, textureX, textureY); // Box 4
		bodyModel[58] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 4
		bodyModel[59] = new ModelRendererTurbo(this, 33, 49, textureX, textureY); // Box 4
		bodyModel[60] = new ModelRendererTurbo(this, 57, 49, textureX, textureY); // Box 4
		bodyModel[61] = new ModelRendererTurbo(this, 73, 49, textureX, textureY); // Box 4
		bodyModel[62] = new ModelRendererTurbo(this, 457, 33, textureX, textureY); // Box 2
		bodyModel[63] = new ModelRendererTurbo(this, 105, 49, textureX, textureY); // Box 193
		bodyModel[64] = new ModelRendererTurbo(this, 161, 41, textureX, textureY); // Box 52 door swing right
		bodyModel[65] = new ModelRendererTurbo(this, 457, 33, textureX, textureY); // Box 70
		bodyModel[66] = new ModelRendererTurbo(this, 177, 49, textureX, textureY); // Box 72
		bodyModel[67] = new ModelRendererTurbo(this, 201, 49, textureX, textureY); // Box 190
		bodyModel[68] = new ModelRendererTurbo(this, 113, 49, textureX, textureY); // Box 313
		bodyModel[69] = new ModelRendererTurbo(this, 441, 41, textureX, textureY); // Box 314 door swing right
		bodyModel[70] = new ModelRendererTurbo(this, 209, 49, textureX, textureY); // Box 316
		bodyModel[71] = new ModelRendererTurbo(this, 273, 25, textureX, textureY); // Box 201
		bodyModel[72] = new ModelRendererTurbo(this, 257, 49, textureX, textureY); // Box 202
		bodyModel[73] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 204
		bodyModel[74] = new ModelRendererTurbo(this, 329, 25, textureX, textureY); // Box 206
		bodyModel[75] = new ModelRendererTurbo(this, 377, 9, textureX, textureY); // Box 207
		bodyModel[76] = new ModelRendererTurbo(this, 201, 41, textureX, textureY); // Box 11
		bodyModel[77] = new ModelRendererTurbo(this, 25, 49, textureX, textureY); // Box 210
		bodyModel[78] = new ModelRendererTurbo(this, 273, 49, textureX, textureY); // Box 211
		bodyModel[79] = new ModelRendererTurbo(this, 345, 25, textureX, textureY); // Box 48
		bodyModel[80] = new ModelRendererTurbo(this, 297, 49, textureX, textureY); // Box 43
		bodyModel[81] = new ModelRendererTurbo(this, 313, 49, textureX, textureY); // Box 44
		bodyModel[82] = new ModelRendererTurbo(this, 297, 33, textureX, textureY, "lamp"); // Box 117 liveryimg 2 glow
		bodyModel[83] = new ModelRendererTurbo(this, 273, 49, textureX, textureY, "lamp"); // Box 118 liveryimg 2 glow
		bodyModel[84] = new ModelRendererTurbo(this, 393, 33, textureX, textureY, "lamp"); // Box 186 headlight front
		bodyModel[85] = new ModelRendererTurbo(this, 481, 33, textureX, textureY, "lamp"); // Box 187 headlight front
		bodyModel[86] = new ModelRendererTurbo(this, 321, 49, textureX, textureY); // Box 219
		bodyModel[87] = new ModelRendererTurbo(this, 345, 57, textureX, textureY); // Box 220
		bodyModel[88] = new ModelRendererTurbo(this, 345, 49, textureX, textureY); // Box 221
		bodyModel[89] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 222
		bodyModel[90] = new ModelRendererTurbo(this, 425, 49, textureX, textureY); // Box 223
		bodyModel[91] = new ModelRendererTurbo(this, 497, 49, textureX, textureY); // Box 224
		bodyModel[92] = new ModelRendererTurbo(this, 153, 49, textureX, textureY); // Box 225
		bodyModel[93] = new ModelRendererTurbo(this, 417, 49, textureX, textureY); // Box 226
		bodyModel[94] = new ModelRendererTurbo(this, 9, 57, textureX, textureY); // Box 227
		bodyModel[95] = new ModelRendererTurbo(this, 33, 65, textureX, textureY); // Box 229
		bodyModel[96] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 230
		bodyModel[97] = new ModelRendererTurbo(this, 281, 73, textureX, textureY); // Box 231
		bodyModel[98] = new ModelRendererTurbo(this, 353, 73, textureX, textureY); // Box 232
		bodyModel[99] = new ModelRendererTurbo(this, 153, 73, textureX, textureY); // Box 233
		bodyModel[100] = new ModelRendererTurbo(this, 425, 73, textureX, textureY); // Box 234
		bodyModel[101] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 235
		bodyModel[102] = new ModelRendererTurbo(this, 49, 81, textureX, textureY); // Box 236
		bodyModel[103] = new ModelRendererTurbo(this, 153, 65, textureX, textureY); // Box 86
		bodyModel[104] = new ModelRendererTurbo(this, 193, 65, textureX, textureY); // Box 87
		bodyModel[105] = new ModelRendererTurbo(this, 385, 65, textureX, textureY); // Box 255
		bodyModel[106] = new ModelRendererTurbo(this, 73, 73, textureX, textureY); // Box 256
		bodyModel[107] = new ModelRendererTurbo(this, 97, 49, textureX, textureY); // Box 241
		bodyModel[108] = new ModelRendererTurbo(this, 137, 57, textureX, textureY); // Box 242
		bodyModel[109] = new ModelRendererTurbo(this, 153, 57, textureX, textureY); // Box 243
		bodyModel[110] = new ModelRendererTurbo(this, 345, 57, textureX, textureY); // Box 244
		bodyModel[111] = new ModelRendererTurbo(this, 473, 73, textureX, textureY); // Box 245
		bodyModel[112] = new ModelRendererTurbo(this, 153, 81, textureX, textureY); // Box 246
		bodyModel[113] = new ModelRendererTurbo(this, 225, 49, textureX, textureY); // Box 81
		bodyModel[114] = new ModelRendererTurbo(this, 505, 33, textureX, textureY); // Box 81
		bodyModel[115] = new ModelRendererTurbo(this, 153, 41, textureX, textureY); // Box 176
		bodyModel[116] = new ModelRendererTurbo(this, 497, 57, textureX, textureY); // Box 177
		bodyModel[117] = new ModelRendererTurbo(this, 137, 9, textureX, textureY); // Box 271
		bodyModel[118] = new ModelRendererTurbo(this, 153, 9, textureX, textureY); // Box 272
		bodyModel[119] = new ModelRendererTurbo(this, 169, 9, textureX, textureY); // Box 273
		bodyModel[120] = new ModelRendererTurbo(this, 489, 9, textureX, textureY); // Box 274
		bodyModel[121] = new ModelRendererTurbo(this, 161, 25, textureX, textureY); // Box 258
		bodyModel[122] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 259
		bodyModel[123] = new ModelRendererTurbo(this, 297, 33, textureX, textureY); // Box 260
		bodyModel[124] = new ModelRendererTurbo(this, 209, 25, textureX, textureY); // Box 261
		bodyModel[125] = new ModelRendererTurbo(this, 57, 49, textureX, textureY); // Box 262
		bodyModel[126] = new ModelRendererTurbo(this, 73, 49, textureX, textureY); // Box 263
		bodyModel[127] = new ModelRendererTurbo(this, 257, 49, textureX, textureY); // Box 264
		bodyModel[128] = new ModelRendererTurbo(this, 305, 25, textureX, textureY); // Box 265
		bodyModel[129] = new ModelRendererTurbo(this, 385, 33, textureX, textureY); // Box 266
		bodyModel[130] = new ModelRendererTurbo(this, 273, 49, textureX, textureY); // Box 267
		bodyModel[131] = new ModelRendererTurbo(this, 425, 57, textureX, textureY); // Box 268
		bodyModel[132] = new ModelRendererTurbo(this, 89, 81, textureX, textureY); // Box 269
		bodyModel[133] = new ModelRendererTurbo(this, 201, 73, textureX, textureY); // Box 270
		bodyModel[134] = new ModelRendererTurbo(this, 177, 81, textureX, textureY); // Box 271
		bodyModel[135] = new ModelRendererTurbo(this, 217, 81, textureX, textureY); // Box 272
		bodyModel[136] = new ModelRendererTurbo(this, 233, 81, textureX, textureY); // Box 273
		bodyModel[137] = new ModelRendererTurbo(this, 417, 57, textureX, textureY); // Box 274
		bodyModel[138] = new ModelRendererTurbo(this, 265, 81, textureX, textureY); // Box 275
		bodyModel[139] = new ModelRendererTurbo(this, 297, 81, textureX, textureY); // Box 276
		bodyModel[140] = new ModelRendererTurbo(this, 329, 81, textureX, textureY); // Box 277
		bodyModel[141] = new ModelRendererTurbo(this, 361, 81, textureX, textureY); // Box 278
		bodyModel[142] = new ModelRendererTurbo(this, 393, 81, textureX, textureY); // Box 279
		bodyModel[143] = new ModelRendererTurbo(this, 425, 81, textureX, textureY); // Box 280
		bodyModel[144] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 281
		bodyModel[145] = new ModelRendererTurbo(this, 129, 17, textureX, textureY); // Box 282
		bodyModel[146] = new ModelRendererTurbo(this, 417, 33, textureX, textureY); // Box 283
		bodyModel[147] = new ModelRendererTurbo(this, 297, 49, textureX, textureY); // Box 284
		bodyModel[148] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 285
		bodyModel[149] = new ModelRendererTurbo(this, 25, 89, textureX, textureY); // Box 286
		bodyModel[150] = new ModelRendererTurbo(this, 329, 49, textureX, textureY); // Box 287
		bodyModel[151] = new ModelRendererTurbo(this, 505, 57, textureX, textureY); // Box 288
		bodyModel[152] = new ModelRendererTurbo(this, 377, 49, textureX, textureY); // Box 289
		bodyModel[153] = new ModelRendererTurbo(this, 497, 73, textureX, textureY); // Box 290
		bodyModel[154] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 291
		bodyModel[155] = new ModelRendererTurbo(this, 457, 81, textureX, textureY); // Box 292
		bodyModel[156] = new ModelRendererTurbo(this, 313, 49, textureX, textureY); // Box 293
		bodyModel[157] = new ModelRendererTurbo(this, 281, 57, textureX, textureY); // Box 294
		bodyModel[158] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 295
		bodyModel[159] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 296
		bodyModel[160] = new ModelRendererTurbo(this, 49, 89, textureX, textureY); // Box 297
		bodyModel[161] = new ModelRendererTurbo(this, 113, 89, textureX, textureY); // Box 298
		bodyModel[162] = new ModelRendererTurbo(this, 201, 89, textureX, textureY); // Box 299
		bodyModel[163] = new ModelRendererTurbo(this, 353, 89, textureX, textureY); // Box 300
		bodyModel[164] = new ModelRendererTurbo(this, 9, 9, textureX, textureY); // Box 301
		bodyModel[165] = new ModelRendererTurbo(this, 433, 9, textureX, textureY); // Box 302
		bodyModel[166] = new ModelRendererTurbo(this, 281, 81, textureX, textureY); // Box 303
		bodyModel[167] = new ModelRendererTurbo(this, 433, 17, textureX, textureY); // Box 304
		bodyModel[168] = new ModelRendererTurbo(this, 305, 65, textureX, textureY); // Box 31
		bodyModel[169] = new ModelRendererTurbo(this, 105, 65, textureX, textureY, "lamp"); // Box 247 headlight r
		bodyModel[170] = new ModelRendererTurbo(this, 257, 65, textureX, textureY, "lamp"); // Box 248 headlight r
		bodyModel[171] = new ModelRendererTurbo(this, 417, 89, textureX, textureY); // Box 308
		bodyModel[172] = new ModelRendererTurbo(this, 73, 89, textureX, textureY); // Box 309
		bodyModel[173] = new ModelRendererTurbo(this, 473, 89, textureX, textureY); // Box 310
		bodyModel[174] = new ModelRendererTurbo(this, 137, 89, textureX, textureY); // Box 311
		bodyModel[175] = new ModelRendererTurbo(this, 121, 97, textureX, textureY); // Box 312
		bodyModel[176] = new ModelRendererTurbo(this, 177, 25, textureX, textureY); // Box 313
		bodyModel[177] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 314
		bodyModel[178] = new ModelRendererTurbo(this, 225, 25, textureX, textureY); // Box 315
		bodyModel[179] = new ModelRendererTurbo(this, 201, 97, textureX, textureY); // Box 316
		bodyModel[180] = new ModelRendererTurbo(this, 465, 33, textureX, textureY); // Box 317
		bodyModel[181] = new ModelRendererTurbo(this, 257, 25, textureX, textureY); // Box 318
		bodyModel[182] = new ModelRendererTurbo(this, 329, 25, textureX, textureY); // Box 319
		bodyModel[183] = new ModelRendererTurbo(this, 369, 89, textureX, textureY); // Box 320 ptc forehead
		bodyModel[184] = new ModelRendererTurbo(this, 241, 97, textureX, textureY); // Box 321 ptc forehead
		bodyModel[185] = new ModelRendererTurbo(this, 265, 97, textureX, textureY); // Box 322 ptc forehead
		bodyModel[186] = new ModelRendererTurbo(this, 289, 97, textureX, textureY); // Box 42
		bodyModel[187] = new ModelRendererTurbo(this, 313, 97, textureX, textureY); // Box 45
		bodyModel[188] = new ModelRendererTurbo(this, 105, 49, textureX, textureY, "lamp"); // Box 176 markerlight glow
		bodyModel[189] = new ModelRendererTurbo(this, 433, 49, textureX, textureY, "lamp"); // Box 176 markerlight glow
		bodyModel[190] = new ModelRendererTurbo(this, 433, 89, textureX, textureY); // Box 43
		bodyModel[191] = new ModelRendererTurbo(this, 345, 97, textureX, textureY); // Box 43
		bodyModel[192] = new ModelRendererTurbo(this, 105, 81, textureX, textureY); // Box 43
		bodyModel[193] = new ModelRendererTurbo(this, 265, 81, textureX, textureY); // Box 43
		bodyModel[194] = new ModelRendererTurbo(this, 241, 81, textureX, textureY); // Box 43
		bodyModel[195] = new ModelRendererTurbo(this, 465, 97, textureX, textureY); // Box 345
		bodyModel[196] = new ModelRendererTurbo(this, 505, 81, textureX, textureY); // Box 346 cover
		bodyModel[197] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Box 100
		bodyModel[198] = new ModelRendererTurbo(this, 33, 113, textureX, textureY); // Box 101
		bodyModel[199] = new ModelRendererTurbo(this, 257, 97, textureX, textureY); // Box 102
		bodyModel[200] = new ModelRendererTurbo(this, 321, 81, textureX, textureY); // Box 103
		bodyModel[201] = new ModelRendererTurbo(this, 353, 81, textureX, textureY); // Box 104
		bodyModel[202] = new ModelRendererTurbo(this, 281, 97, textureX, textureY); // Box 105
		bodyModel[203] = new ModelRendererTurbo(this, 130, 149, textureX, textureY); // Box 354 cnw bELL
		bodyModel[204] = new ModelRendererTurbo(this, 417, 81, textureX, textureY); // Box 355
		bodyModel[205] = new ModelRendererTurbo(this, 193, 73, textureX, textureY); // Box 356
		bodyModel[206] = new ModelRendererTurbo(this, 465, 73, textureX, textureY); // Box 114
		bodyModel[207] = new ModelRendererTurbo(this, 41, 81, textureX, textureY); // Box 74
		bodyModel[208] = new ModelRendererTurbo(this, 89, 81, textureX, textureY); // Box 78
		bodyModel[209] = new ModelRendererTurbo(this, 449, 81, textureX, textureY); // Box 245
		bodyModel[210] = new ModelRendererTurbo(this, 65, 113, textureX, textureY); // Box 361
		bodyModel[211] = new ModelRendererTurbo(this, 305, 97, textureX, textureY); // Box 362
		bodyModel[212] = new ModelRendererTurbo(this, 329, 97, textureX, textureY); // Box 363
		bodyModel[213] = new ModelRendererTurbo(this, 89, 113, textureX, textureY); // Box 364
		bodyModel[214] = new ModelRendererTurbo(this, 369, 97, textureX, textureY); // Box 365
		bodyModel[215] = new ModelRendererTurbo(this, 393, 97, textureX, textureY); // Box 366
		bodyModel[216] = new ModelRendererTurbo(this, 225, 89, textureX, textureY); // Box 367
		bodyModel[217] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 368
		bodyModel[218] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 369
		bodyModel[219] = new ModelRendererTurbo(this, 129, 9, textureX, textureY); // Box 370
		bodyModel[220] = new ModelRendererTurbo(this, 145, 9, textureX, textureY); // Box 371
		bodyModel[221] = new ModelRendererTurbo(this, 361, 9, textureX, textureY); // Box 372
		bodyModel[222] = new ModelRendererTurbo(this, 425, 9, textureX, textureY); // Box 373
		bodyModel[223] = new ModelRendererTurbo(this, 425, 97, textureX, textureY); // Box 374
		bodyModel[224] = new ModelRendererTurbo(this, 481, 9, textureX, textureY); // Box 375
		bodyModel[225] = new ModelRendererTurbo(this, 425, 17, textureX, textureY); // Box 376
		bodyModel[226] = new ModelRendererTurbo(this, 481, 41, textureX, textureY); // Box 377
		bodyModel[227] = new ModelRendererTurbo(this, 505, 41, textureX, textureY); // Box 378
		bodyModel[228] = new ModelRendererTurbo(this, 457, 97, textureX, textureY); // Box 379
		bodyModel[229] = new ModelRendererTurbo(this, 81, 89, textureX, textureY); // Box 380
		bodyModel[230] = new ModelRendererTurbo(this, 145, 89, textureX, textureY); // Box 381
		bodyModel[231] = new ModelRendererTurbo(this, 97, 113, textureX, textureY); // Box 382
		bodyModel[232] = new ModelRendererTurbo(this, 401, 97, textureX, textureY); // Box 384
		bodyModel[233] = new ModelRendererTurbo(this, 241, 97, textureX, textureY); // Box 385
		bodyModel[234] = new ModelRendererTurbo(this, 313, 97, textureX, textureY); // Box 386
		bodyModel[235] = new ModelRendererTurbo(this, 393, 81, textureX, textureY); // Box 387
		bodyModel[236] = new ModelRendererTurbo(this, 121, 113, textureX, textureY, "cull"); // Box 388 cull
		bodyModel[237] = new ModelRendererTurbo(this, 337, 97, textureX, textureY); // Box 114
		bodyModel[238] = new ModelRendererTurbo(this, 353, 97, textureX, textureY); // Box 74
		bodyModel[239] = new ModelRendererTurbo(this, 377, 97, textureX, textureY); // Box 78
		bodyModel[240] = new ModelRendererTurbo(this, 505, 97, textureX, textureY); // Box 78
		bodyModel[241] = new ModelRendererTurbo(this, 113, 105, textureX, textureY); // Box 188
		bodyModel[242] = new ModelRendererTurbo(this, 193, 105, textureX, textureY, "lamp"); // Box 189 ditchlight f b
		bodyModel[243] = new ModelRendererTurbo(this, 465, 105, textureX, textureY, "lamp"); // Box 190 ditchlight f b
		bodyModel[244] = new ModelRendererTurbo(this, 497, 105, textureX, textureY); // Box 239
		bodyModel[245] = new ModelRendererTurbo(this, 505, 105, textureX, textureY, "lamp"); // Box 240 ditchlight r b
		bodyModel[246] = new ModelRendererTurbo(this, 137, 113, textureX, textureY, "lamp"); // Box 241 ditchlight r b
		bodyModel[247] = new ModelRendererTurbo(this, 145, 113, textureX, textureY); // Box 242
		bodyModel[248] = new ModelRendererTurbo(this, 441, 97, textureX, textureY); // Box 114
		bodyModel[249] = new ModelRendererTurbo(this, 473, 97, textureX, textureY); // Box 74
		bodyModel[250] = new ModelRendererTurbo(this, 473, 105, textureX, textureY); // Box 78
		bodyModel[251] = new ModelRendererTurbo(this, 153, 113, textureX, textureY); // Box 245
		bodyModel[252] = new ModelRendererTurbo(this, 161, 113, textureX, textureY); // Box 409
		bodyModel[253] = new ModelRendererTurbo(this, 121, 113, textureX, textureY, "lamp"); // Box 410 glow commander
		bodyModel[254] = new ModelRendererTurbo(this, 169, 113, textureX, textureY); // Box 411
		bodyModel[255] = new ModelRendererTurbo(this, 185, 113, textureX, textureY); // Box 412
		bodyModel[256] = new ModelRendererTurbo(this, 201, 113, textureX, textureY); // Box 413
		bodyModel[257] = new ModelRendererTurbo(this, 217, 113, textureX, textureY); // Box 414
		bodyModel[258] = new ModelRendererTurbo(this, 385, 49, textureX, textureY); // Box 415
		bodyModel[259] = new ModelRendererTurbo(this, 233, 113, textureX, textureY, "lamp"); // Box 416 ditchlight f c
		bodyModel[260] = new ModelRendererTurbo(this, 241, 113, textureX, textureY); // Box 417 cull
		bodyModel[261] = new ModelRendererTurbo(this, 249, 113, textureX, textureY, "lamp"); // Box 418 ditchlight f c
		bodyModel[262] = new ModelRendererTurbo(this, 257, 113, textureX, textureY, "cull"); // Box 419 cull
		bodyModel[263] = new ModelRendererTurbo(this, 265, 113, textureX, textureY); // box64
		bodyModel[264] = new ModelRendererTurbo(this, 377, 113, textureX, textureY); // box65
		bodyModel[265] = new ModelRendererTurbo(this, 337, 113, textureX, textureY); // Box 350
		bodyModel[266] = new ModelRendererTurbo(this, 401, 113, textureX, textureY); // Box 351
		bodyModel[267] = new ModelRendererTurbo(this, 409, 113, textureX, textureY); // Box 336
		bodyModel[268] = new ModelRendererTurbo(this, 425, 113, textureX, textureY, "lamp"); // Box 337 lamp
		bodyModel[269] = new ModelRendererTurbo(this, 1, 121, textureX, textureY, "lamp"); // Box 338 lamp
		bodyModel[270] = new ModelRendererTurbo(this, 9, 121, textureX, textureY); // Box 327
		bodyModel[271] = new ModelRendererTurbo(this, 25, 121, textureX, textureY); // Box 328
		bodyModel[272] = new ModelRendererTurbo(this, 41, 121, textureX, textureY); // Box 329
		bodyModel[273] = new ModelRendererTurbo(this, 57, 121, textureX, textureY); // Box 330
		bodyModel[274] = new ModelRendererTurbo(this, 65, 121, textureX, textureY); // Box 331
		bodyModel[275] = new ModelRendererTurbo(this, 73, 121, textureX, textureY); // Box 332
		bodyModel[276] = new ModelRendererTurbo(this, 81, 121, textureX, textureY); // Box 894
		bodyModel[277] = new ModelRendererTurbo(this, 97, 121, textureX, textureY); // Box 895
		bodyModel[278] = new ModelRendererTurbo(this, 257, 105, textureX, textureY); // Box 202
		bodyModel[279] = new ModelRendererTurbo(this, 105, 121, textureX, textureY, "lamp"); // Box 438 headlight r o canada
		bodyModel[280] = new ModelRendererTurbo(this, 481, 49, textureX, textureY); // Box 439
		bodyModel[281] = new ModelRendererTurbo(this, 281, 113, textureX, textureY); // Box 440
		bodyModel[282] = new ModelRendererTurbo(this, 121, 121, textureX, textureY); // Box 441
		bodyModel[283] = new ModelRendererTurbo(this, 169, 57, textureX, textureY); // Box 442
		bodyModel[284] = new ModelRendererTurbo(this, 449, 57, textureX, textureY); // Box 443
		bodyModel[285] = new ModelRendererTurbo(this, 129, 121, textureX, textureY); // Box 444
		bodyModel[286] = new ModelRendererTurbo(this, 17, 121, textureX, textureY); // Box 445
		bodyModel[287] = new ModelRendererTurbo(this, 137, 121, textureX, textureY); // Box 86
		bodyModel[288] = new ModelRendererTurbo(this, 385, 113, textureX, textureY); // Box 87
		bodyModel[289] = new ModelRendererTurbo(this, 161, 121, textureX, textureY); // Box 86
		bodyModel[290] = new ModelRendererTurbo(this, 177, 121, textureX, textureY); // Box 87
		bodyModel[291] = new ModelRendererTurbo(this, 169, 121, textureX, textureY); // Box 450 extended tank
		bodyModel[292] = new ModelRendererTurbo(this, 241, 121, textureX, textureY); // Box 451
		bodyModel[293] = new ModelRendererTurbo(this, 489, 49, textureX, textureY); // Box 452
		bodyModel[294] = new ModelRendererTurbo(this, 257, 121, textureX, textureY); // Box 453
		bodyModel[295] = new ModelRendererTurbo(this, 297, 121, textureX, textureY); // Box 454
		bodyModel[296] = new ModelRendererTurbo(this, 25, 57, textureX, textureY, "lamp"); // Box 115 liveryimg 2 glow
		bodyModel[297] = new ModelRendererTurbo(this, 97, 57, textureX, textureY, "lamp"); // Box 116 liveryimg 2 glow
		bodyModel[298] = new ModelRendererTurbo(this, 377, 121, textureX, textureY); // Box 19
		bodyModel[299] = new ModelRendererTurbo(this, 33, 121, textureX, textureY); // Box 334
		bodyModel[300] = new ModelRendererTurbo(this, 249, 121, textureX, textureY); // Box 335
		bodyModel[301] = new ModelRendererTurbo(this, 265, 121, textureX, textureY); // Box 336
		bodyModel[302] = new ModelRendererTurbo(this, 441, 121, textureX, textureY); // Box 337
		bodyModel[303] = new ModelRendererTurbo(this, 305, 121, textureX, textureY); // Box 338
		bodyModel[304] = new ModelRendererTurbo(this, 321, 121, textureX, textureY); // Box 339
		bodyModel[305] = new ModelRendererTurbo(this, 49, 129, textureX, textureY, "lamp"); // Box 340 glow commander
		bodyModel[306] = new ModelRendererTurbo(this, 57, 129, textureX, textureY); // Box 341
		bodyModel[307] = new ModelRendererTurbo(this, 134, 107, textureX, textureY); // Box 629
		bodyModel[308] = new ModelRendererTurbo(this, 144, 107, textureX, textureY); // Box 630
		bodyModel[309] = new ModelRendererTurbo(this, 154, 107, textureX, textureY); // Box 726
		bodyModel[310] = new ModelRendererTurbo(this, 164, 107, textureX, textureY); // Box 727
		bodyModel[311] = new ModelRendererTurbo(this, 341, 125, textureX, textureY); // Box 382
		bodyModel[312] = new ModelRendererTurbo(this, 320, 132, textureX, textureY); // Box 383
		bodyModel[313] = new ModelRendererTurbo(this, 299, 132, textureX, textureY); // Box 384
		bodyModel[314] = new ModelRendererTurbo(this, 94, 91, textureX, textureY, "lamp"); // Box 385 headlight f hh
		bodyModel[315] = new ModelRendererTurbo(this, 101, 91, textureX, textureY, "lamp"); // Box 386 headlight f hh
		bodyModel[316] = new ModelRendererTurbo(this, 288, 127, textureX, textureY); // Box 387
		bodyModel[317] = new ModelRendererTurbo(this, 280, 129, textureX, textureY, "lamp"); // Box 350 liveryimg 3 glow
		bodyModel[318] = new ModelRendererTurbo(this, 272, 132, textureX, textureY, "lamp"); // Box 351 liveryimg 3 glow
		bodyModel[319] = new ModelRendererTurbo(this, 258, 30, textureX, textureY); // Box 352
		bodyModel[320] = new ModelRendererTurbo(this, 57, 108, textureX, textureY); // Box 354
		bodyModel[321] = new ModelRendererTurbo(this, 48, 108, textureX, textureY); // Box 355
		bodyModel[322] = new ModelRendererTurbo(this, 68, 107, textureX, textureY); // Box 356
		bodyModel[323] = new ModelRendererTurbo(this, 41, 108, textureX, textureY); // Box 357
		bodyModel[324] = new ModelRendererTurbo(this, 109, 83, textureX, textureY); // Box 369
		bodyModel[325] = new ModelRendererTurbo(this, 20, 46, textureX, textureY); // Box 370
		bodyModel[326] = new ModelRendererTurbo(this, 7, 47, textureX, textureY); // Box 371
		bodyModel[327] = new ModelRendererTurbo(this, 371, 47, textureX, textureY); // Box 372
		bodyModel[328] = new ModelRendererTurbo(this, 12, 12, textureX, textureY); // Box 373
		bodyModel[329] = new ModelRendererTurbo(this, 11, 7, textureX, textureY); // Box 374
		bodyModel[330] = new ModelRendererTurbo(this, 47, 149, textureX, textureY); // Box 42
		bodyModel[331] = new ModelRendererTurbo(this, 66, 141, textureX, textureY); // Box 48
		bodyModel[332] = new ModelRendererTurbo(this, 122, 154, textureX, textureY, "lamp"); // Box 294 lamp canada front
		bodyModel[333] = new ModelRendererTurbo(this, 122, 149, textureX, textureY, "lamp"); // Box 295 lamp canada front
		bodyModel[334] = new ModelRendererTurbo(this, 66, 151, textureX, textureY); // Box 296 nose cover
		bodyModel[335] = new ModelRendererTurbo(this, 76, 149, textureX, textureY); // Box 298
		bodyModel[336] = new ModelRendererTurbo(this, 71, 151, textureX, textureY); // Box 299 nose cover
		bodyModel[337] = new ModelRendererTurbo(this, 113, 148, textureX, textureY, "lamp"); // Box 301 lamp bnsf front
		bodyModel[338] = new ModelRendererTurbo(this, 113, 153, textureX, textureY, "lamp"); // Box 302 lamp bnsf front
		bodyModel[339] = new ModelRendererTurbo(this, 47, 139, textureX, textureY); // Box 318
		bodyModel[340] = new ModelRendererTurbo(this, 76, 139, textureX, textureY); // Box 319
		bodyModel[341] = new ModelRendererTurbo(this, 131, 143, textureX, textureY, "lamp"); // Box 314 lamp sp front
		bodyModel[342] = new ModelRendererTurbo(this, 123, 143, textureX, textureY, "lamp"); // Box 315 lamp sp front
		bodyModel[343] = new ModelRendererTurbo(this, 127, 138, textureX, textureY, "lamp"); // Box 316 lamp sp front gyralight
		bodyModel[344] = new ModelRendererTurbo(this, 111, 134, textureX, textureY); // Box 317
		bodyModel[345] = new ModelRendererTurbo(this, 110, 140, textureX, textureY); // Box 20
		bodyModel[346] = new ModelRendererTurbo(this, 141, 152, textureX, textureY); // Box 278
		bodyModel[347] = new ModelRendererTurbo(this, 141, 146, textureX, textureY); // Box 315
		bodyModel[348] = new ModelRendererTurbo(this, 186, 152, textureX, textureY); // Box 382
		bodyModel[349] = new ModelRendererTurbo(this, 186, 146, textureX, textureY); // Box 383
		bodyModel[350] = new ModelRendererTurbo(this, 92, 49, textureX, textureY, "lamp"); // Box 384 markerlight glow
		bodyModel[351] = new ModelRendererTurbo(this, 438, 66, textureX, textureY, "lamp"); // Box 385 markerlight glow
		bodyModel[352] = new ModelRendererTurbo(this, 239, 129, textureX, textureY, "cull"); // Box 386 cull
		bodyModel[353] = new ModelRendererTurbo(this, 239, 129, textureX, textureY, "cull"); // Box 387 cull
		bodyModel[354] = new ModelRendererTurbo(this, 246, 129, textureX, textureY, "lamp"); // Box 388 ditchlight r c
		bodyModel[355] = new ModelRendererTurbo(this, 246, 129, textureX, textureY, "lamp"); // Box 389 ditchlight r c
		bodyModel[356] = new ModelRendererTurbo(this, 18, 140, textureX, textureY); // Box 446
		bodyModel[357] = new ModelRendererTurbo(this, 2, 136, textureX, textureY); // Box 447
		bodyModel[358] = new ModelRendererTurbo(this, 2, 148, textureX, textureY); // Box 448
		bodyModel[359] = new ModelRendererTurbo(this, 18, 153, textureX, textureY); // Box 449
		bodyModel[360] = new ModelRendererTurbo(this, 37, 159, textureX, textureY); // Box 394 awvr window
		bodyModel[361] = new ModelRendererTurbo(this, 52, 159, textureX, textureY); // Box 394 awvr window
		bodyModel[362] = new ModelRendererTurbo(this, 489, 9, textureX, textureY); // Box 396
		bodyModel[363] = new ModelRendererTurbo(this, 137, 9, textureX, textureY); // Box 397
		bodyModel[364] = new ModelRendererTurbo(this, 169, 9, textureX, textureY); // Box 398
		bodyModel[365] = new ModelRendererTurbo(this, 153, 9, textureX, textureY); // Box 399
		bodyModel[366] = new ModelRendererTurbo(this, 297, 121, textureX, textureY); // Box 400
		bodyModel[367] = new ModelRendererTurbo(this, 257, 121, textureX, textureY); // Box 401
		bodyModel[368] = new ModelRendererTurbo(this, 241, 121, textureX, textureY); // Box 402
		bodyModel[369] = new ModelRendererTurbo(this, 489, 49, textureX, textureY); // Box 403
		bodyModel[370] = new ModelRendererTurbo(this, 18, 166, textureX, textureY); // Box 395
		bodyModel[371] = new ModelRendererTurbo(this, 18, 179, textureX, textureY); // Box 396
		bodyModel[372] = new ModelRendererTurbo(this, 2, 171, textureX, textureY); // Box 397
		bodyModel[373] = new ModelRendererTurbo(this, 2, 160, textureX, textureY); // Box 398
		bodyModel[374] = new ModelRendererTurbo(this, 62, 128, textureX, textureY); // Box 408
		bodyModel[375] = new ModelRendererTurbo(this, 65, 129, textureX, textureY); // Box 409
		bodyModel[376] = new ModelRendererTurbo(this, 204, 147, textureX, textureY); // Box 410
		bodyModel[377] = new ModelRendererTurbo(this, 211, 147, textureX, textureY); // Box 411
		bodyModel[378] = new ModelRendererTurbo(this, 204, 153, textureX, textureY, "lamp"); // Box 412 ditchlight f a
		bodyModel[379] = new ModelRendererTurbo(this, 211, 153, textureX, textureY, "lamp"); // Box 412 ditchlight f a
		bodyModel[380] = new ModelRendererTurbo(this, 225, 147, textureX, textureY); // Box 414
		bodyModel[381] = new ModelRendererTurbo(this, 218, 147, textureX, textureY); // Box 415
		bodyModel[382] = new ModelRendererTurbo(this, 218, 153, textureX, textureY, "lamp"); // Box 416 ditchlight r a
		bodyModel[383] = new ModelRendererTurbo(this, 225, 153, textureX, textureY, "lamp"); // Box 417 ditchlight r a
		bodyModel[384] = new ModelRendererTurbo(this, 183, 124, textureX, textureY); // Box 418
		bodyModel[385] = new ModelRendererTurbo(this, 183, 128, textureX, textureY); // Box 419
		bodyModel[386] = new ModelRendererTurbo(this, 184, 131, textureX, textureY); // Box 420
		bodyModel[387] = new ModelRendererTurbo(this, 178, 124, textureX, textureY); // Box 421
		bodyModel[388] = new ModelRendererTurbo(this, 76, 160, textureX, textureY); // Box 394
		bodyModel[389] = new ModelRendererTurbo(this, 76, 160, textureX, textureY); // Box 395
		bodyModel[390] = new ModelRendererTurbo(this, 76, 160, textureX, textureY); // Box 396
		bodyModel[391] = new ModelRendererTurbo(this, 76, 160, textureX, textureY); // Box 397
		bodyModel[392] = new ModelRendererTurbo(this, 76, 160, textureX, textureY); // Box 398
		bodyModel[393] = new ModelRendererTurbo(this, 76, 160, textureX, textureY); // Box 399
		bodyModel[394] = new ModelRendererTurbo(this, 76, 162, textureX, textureY); // Box 400
		bodyModel[395] = new ModelRendererTurbo(this, 76, 162, textureX, textureY); // Box 401
		bodyModel[396] = new ModelRendererTurbo(this, 76, 162, textureX, textureY); // Box 402
		bodyModel[397] = new ModelRendererTurbo(this, 76, 162, textureX, textureY); // Box 403
		bodyModel[398] = new ModelRendererTurbo(this, 76, 162, textureX, textureY); // Box 404
		bodyModel[399] = new ModelRendererTurbo(this, 76, 162, textureX, textureY); // Box 405
		bodyModel[400] = new ModelRendererTurbo(this, 42, 176, textureX, textureY); // Box 364 prime base
		bodyModel[401] = new ModelRendererTurbo(this, 42, 180, textureX, textureY, "lamp"); // Box 6 PRIME1-1
		bodyModel[402] = new ModelRendererTurbo(this, 42, 180, textureX, textureY, "lamp"); // Box 7 PRIME1-3
		bodyModel[403] = new ModelRendererTurbo(this, 42, 180, textureX, textureY, "lamp"); // Box 8 PRIME1-2
		bodyModel[404] = new ModelRendererTurbo(this, 42, 180, textureX, textureY, "lamp"); // Box 9 PRIME1-4
		bodyModel[405] = new ModelRendererTurbo(this, 42, 171, textureX, textureY, "cull"); // Box 356 support cull
		bodyModel[406] = new ModelRendererTurbo(this, 111, 170, textureX, textureY); // Box 412
		bodyModel[407] = new ModelRendererTurbo(this, 90, 172, textureX, textureY); // Box 413
		bodyModel[408] = new ModelRendererTurbo(this, 88, 165, textureX, textureY); // Box 86
		bodyModel[409] = new ModelRendererTurbo(this, 129, 172, textureX, textureY, "cull"); // Box 3 cull aww
		bodyModel[410] = new ModelRendererTurbo(this, 131, 167, textureX, textureY); // Box 5
		bodyModel[411] = new ModelRendererTurbo(this, 54, 172, textureX, textureY); // Box 196 winterization hatch
		bodyModel[412] = new ModelRendererTurbo(this, 100, 152, textureX, textureY); // Box 418
		bodyModel[413] = new ModelRendererTurbo(this, 88, 154, textureX, textureY); // Box 419
		bodyModel[414] = new ModelRendererTurbo(this, 42, 184, textureX, textureY, "cull"); // Box 420 cull
		bodyModel[415] = new ModelRendererTurbo(this, 42, 189, textureX, textureY); // Box 421 prime base
		bodyModel[416] = new ModelRendererTurbo(this, 42, 193, textureX, textureY, "lamp"); // Box 6 PRIME2-1
		bodyModel[417] = new ModelRendererTurbo(this, 42, 193, textureX, textureY, "lamp"); // Box 7 PRIME2-3
		bodyModel[418] = new ModelRendererTurbo(this, 42, 193, textureX, textureY, "lamp"); // Box 8 PRIME2-2
		bodyModel[419] = new ModelRendererTurbo(this, 42, 193, textureX, textureY, "lamp"); // Box 9 PRIME2-4
		bodyModel[420] = new ModelRendererTurbo(this, 52, 189, textureX, textureY); // Box 421 prime base
		bodyModel[421] = new ModelRendererTurbo(this, 52, 193, textureX, textureY, "lamp"); // Box 6 PRIME3-1
		bodyModel[422] = new ModelRendererTurbo(this, 52, 193, textureX, textureY, "lamp"); // Box 7 PRIME3-3
		bodyModel[423] = new ModelRendererTurbo(this, 52, 193, textureX, textureY, "lamp"); // Box 8 PRIME3-2
		bodyModel[424] = new ModelRendererTurbo(this, 52, 193, textureX, textureY, "lamp"); // Box 9 PRIME3-4
		bodyModel[425] = new ModelRendererTurbo(this, 121, 169, textureX, textureY); // Box 136
		bodyModel[426] = new ModelRendererTurbo(this, 121, 161, textureX, textureY); // Box 287
		bodyModel[427] = new ModelRendererTurbo(this, 121, 165, textureX, textureY); // Box 288
		bodyModel[428] = new ModelRendererTurbo(this, 117, 164, textureX, textureY); // Box 289

		bodyModel[0].addBox(0F, 0F, 0F, 84, 1, 4, 0F); // Box 0
		bodyModel[0].setRotationPoint(-42.5F, 0F, -11F);

		bodyModel[1].addBox(0F, 0F, 0F, 88, 4, 14, 0F); // Box 23
		bodyModel[1].setRotationPoint(-44.5F, 0F, -7F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 3, 21, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[2].setRotationPoint(37.5F, -21F, 0F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 3, 21, 7, 0F,0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 7
		bodyModel[3].setRotationPoint(37.5F, -21F, -7F);

		bodyModel[4].addBox(0F, 0F, 0F, 40, 2, 4, 0F); // Box 36
		bodyModel[4].setRotationPoint(-17.5F, -2F, -11F);

		bodyModel[5].addBox(0F, 0F, 0F, 55, 21, 14, 0F); // Box 34
		bodyModel[5].setRotationPoint(-17.5F, -21F, -7F);

		bodyModel[6].addBox(0F, 0F, 0F, 18, 6, 16, 0F); // Box 112
		bodyModel[6].setRotationPoint(-8F, 3F, -8F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,-1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 164
		bodyModel[7].setRotationPoint(-43.5F, 2F, -11F);

		bodyModel[8].addBox(0F, 0F, 0F, 0, 7, 18, 0F); // Box 3
		bodyModel[8].setRotationPoint(-47.51F, 0F, -9F);

		bodyModel[9].addBox(0F, 0F, 0F, 0, 5, 1, 0F); // Box 246
		bodyModel[9].setRotationPoint(-47.5F, 2F, -10F);

		bodyModel[10].addBox(0F, 0F, 0F, 0, 5, 1, 0F); // Box 247
		bodyModel[10].setRotationPoint(-47.5F, 2F, 9F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 259
		bodyModel[11].setRotationPoint(-43.5F, 2F, 7F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 262
		bodyModel[12].setRotationPoint(-43.5F, 0F, 7F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,-1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, -2F); // Box 264
		bodyModel[13].setRotationPoint(-43.5F, 5F, -11F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -2F, -1F, 0F, -2F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 265
		bodyModel[14].setRotationPoint(-43.5F, 5F, 7F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 261
		bodyModel[15].setRotationPoint(-43.5F, 0F, -11F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 0, 6, 3, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 143
		bodyModel[16].setRotationPoint(-47.51F, -8F, -8F);
		bodyModel[16].rotateAngleY = -3.14159265F;

		bodyModel[17].addShapeBox(0F, 0F, 0F, 0, 6, 3, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 62
		bodyModel[17].setRotationPoint(-47.51F, -8F, 8F);

		bodyModel[18].addBox(0F, 0F, 0F, 0, 7, 1, 0F); // Box 61
		bodyModel[18].setRotationPoint(-47.5F, -2F, 10F);

		bodyModel[19].addBox(0F, 0F, 0F, 0, 7, 1, 0F); // Box 63
		bodyModel[19].setRotationPoint(-47.5F, -2F, -11F);

		bodyModel[20].addBox(0F, 0F, 0F, 4, 2, 3, 0F); // Box 4
		bodyModel[20].setRotationPoint(-51.5F, 4F, -1.5F);

		bodyModel[21].addBox(0F, 0F, 0F, 3, 0, 4, 0F); // Box 98
		bodyModel[21].setRotationPoint(-51.51F, 0F, -2F);

		bodyModel[22].addBox(0F, 0F, 0F, 3, 2, 14, 0F); // Box 197
		bodyModel[22].setRotationPoint(-47.5F, 0F, -7F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 0, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 80
		bodyModel[23].setRotationPoint(-47.5F, -8F, -7F);

		bodyModel[24].addBox(0F, 0F, 0F, 0, 8, 1, 0F); // Box 144
		bodyModel[24].setRotationPoint(-47.5F, -8F, -8F);

		bodyModel[25].addBox(0F, 0F, 0F, 0, 8, 8, 0F); // Box 145
		bodyModel[25].setRotationPoint(-48.5F, -8F, -4F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 0, 1, 3, 0F,1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 147
		bodyModel[26].setRotationPoint(-47.5F, -8F, 4F);

		bodyModel[27].addBox(0F, 0F, 0F, 0, 8, 1, 0F); // Box 148
		bodyModel[27].setRotationPoint(-47.5F, -8F, 7F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 3, 1, 10, 0F,0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F); // Box 4
		bodyModel[28].setRotationPoint(-50.5F, 7F, 0F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F,0.5F, 0F, 0F, -3F, 0F, 0F, -1F, 1F, 0F, -1.5F, 1F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F); // Box 4
		bodyModel[29].setRotationPoint(-50.5F, 6F, 2F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 3, 2, 10, 0F,0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 1F, 0F, 0F, -3.5F, 0F, 0F, -1F, 0F, -1F, -1.5F, 0F, -1F); // Box 4
		bodyModel[30].setRotationPoint(-50.5F, 8F, 0F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 3, 1, 10, 0F,-2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[31].setRotationPoint(-50.5F, 7F, -10F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F,-2F, 1F, 0F, -0.5F, 1F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 0F, 0F, -1F, 0F, 0F); // Box 4
		bodyModel[32].setRotationPoint(-51F, 6F, -10F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 3, 2, 10, 0F,-2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, -1F, -1F, 0F, -1F, -3.5F, 0F, 0F, 1F, 0F, 0F); // Box 4
		bodyModel[33].setRotationPoint(-50.5F, 8F, -10F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[34].setRotationPoint(-48.5F, 3.5F, -2F);

		bodyModel[35].addBox(0F, 0F, 0F, 84, 1, 4, 0F); // Box 159
		bodyModel[35].setRotationPoint(-42.5F, 0F, 7F);

		bodyModel[36].addBox(0F, 0F, 0F, 0, 7, 18, 0F); // Box 3
		bodyModel[36].setRotationPoint(46.5F, 0F, -9F);

		bodyModel[37].addBox(0F, 0F, 0F, 0, 5, 1, 0F); // Box 246
		bodyModel[37].setRotationPoint(46.51F, 2F, -10F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 164
		bodyModel[38].setRotationPoint(41.5F, 2F, -11F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,-1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 259
		bodyModel[39].setRotationPoint(41.5F, 2F, 7F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 261
		bodyModel[40].setRotationPoint(41.5F, 0F, -11F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 262
		bodyModel[41].setRotationPoint(41.5F, 0F, 7F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -2F, -1F, 0F, -2F); // Box 264
		bodyModel[42].setRotationPoint(41.5F, 5F, -11F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,-1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 265
		bodyModel[43].setRotationPoint(41.5F, 5F, 7F);

		bodyModel[44].addBox(0F, 0F, 0F, 3, 2, 14, 0F); // Box 266
		bodyModel[44].setRotationPoint(43.5F, 0F, -7F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 5, 6, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); // Box 4
		bodyModel[45].setRotationPoint(41.5F, 2F, -3F);

		bodyModel[46].addBox(0F, 0F, 0F, 4, 2, 3, 0F); // Box 5
		bodyModel[46].setRotationPoint(46.5F, 4F, -1.5F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 0, 6, 3, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 143
		bodyModel[47].setRotationPoint(46.5F, -8F, -8F);
		bodyModel[47].rotateAngleY = -3.14159265F;

		bodyModel[48].addBox(0F, 0F, 0F, 0, 7, 1, 0F); // Box 61
		bodyModel[48].setRotationPoint(46.51F, -2F, 10F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 0, 6, 3, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 62
		bodyModel[49].setRotationPoint(46.5F, -8F, 8F);

		bodyModel[50].addBox(0F, 0F, 0F, 0, 7, 1, 0F); // Box 63
		bodyModel[50].setRotationPoint(46.51F, -2F, -11F);

		bodyModel[51].addBox(0F, 0F, 0F, 0, 8, 1, 0F); // Box 80
		bodyModel[51].setRotationPoint(46.51F, -8F, -8F);

		bodyModel[52].addBox(0F, 0F, 0F, 0, 8, 1, 0F); // Box 81
		bodyModel[52].setRotationPoint(46.51F, -8F, 7F);

		bodyModel[53].addBox(0F, 0F, 0F, 2, 0, 4, 0F); // Box 179
		bodyModel[53].setRotationPoint(47.5F, 0F, -2F);

		bodyModel[54].addBox(0F, 0F, 0F, 0, 8, 8, 0F); // Box 234
		bodyModel[54].setRotationPoint(47.49F, -8F, -4F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 0, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 236
		bodyModel[55].setRotationPoint(46.49F, -8F, -7F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 3, 1, 10, 0F,-2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[56].setRotationPoint(46.5F, 7F, 0F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F,-3F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 1F, 0F, -1F, 1F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[57].setRotationPoint(46.5F, 6F, 2F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 3, 2, 10, 0F,-2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, 1F, 0F, 0F, -1.5F, 0F, -1F, -1F, 0F, -1F); // Box 4
		bodyModel[58].setRotationPoint(46.5F, 8F, 0F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 3, 1, 10, 0F,0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F); // Box 4
		bodyModel[59].setRotationPoint(46.5F, 7F, -10F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F,-0.5F, 1F, 0F, -2F, 1F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0.5F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, -1.5F, 0F, 0F); // Box 4
		bodyModel[60].setRotationPoint(47F, 6F, -10F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 3, 2, 10, 0F,0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -1F, 0F, -1F, -1.5F, 0F, -1F, 1F, 0F, 0F, -3.5F, 0F, 0F); // Box 4
		bodyModel[61].setRotationPoint(46.5F, 8F, -10F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[62].setRotationPoint(46.5F, 3.5F, -2F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 5, 6, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Box 193
		bodyModel[63].setRotationPoint(-47.5F, 2F, -3F);

		bodyModel[64].addBox(-0.5F, 0F, -0.5F, 1, 14, 4, 0F); // Box 52 door swing right
		bodyModel[64].setRotationPoint(-29F, -18F, -10.5F);

		bodyModel[65].addBox(0F, 0F, 0F, 1, 14, 18, 0F); // Box 70
		bodyModel[65].setRotationPoint(-18.5F, -18F, -11F);

		bodyModel[66].addBox(0F, 0F, 0F, 10, 14, 1, 0F); // Box 72
		bodyModel[66].setRotationPoint(-28.5F, -18F, 10F);

		bodyModel[67].addBox(0F, 0F, 0F, 10, 14, 1, 0F); // Box 190
		bodyModel[67].setRotationPoint(-28.5F, -18F, -11F);

		bodyModel[68].addBox(0F, 0F, 0F, 1, 14, 18, 0F); // Box 313
		bodyModel[68].setRotationPoint(-29.5F, -18F, -7F);

		bodyModel[69].addBox(-0.5F, 0F, -3.5F, 1, 14, 4, 0F); // Box 314 door swing right
		bodyModel[69].setRotationPoint(-18F, -18F, 10.5F);

		bodyModel[70].addBox(0F, 0F, 0F, 12, 4, 22, 0F); // Box 316
		bodyModel[70].setRotationPoint(-29.5F, -4F, -11F);

		bodyModel[71].addBox(0F, 0F, 0F, 0, 5, 1, 0F); // Box 201
		bodyModel[71].setRotationPoint(46.51F, 2F, 9F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 202
		bodyModel[72].setRotationPoint(46.5F, 0F, -5F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 204
		bodyModel[73].setRotationPoint(46.5F, 0F, -6F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 0, 1, 3, 0F,-1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 206
		bodyModel[74].setRotationPoint(46.49F, -8F, 4F);

		bodyModel[75].addBox(0F, 0F, 0F, 0, 1, 22, 0F); // Box 207
		bodyModel[75].setRotationPoint(46.5F, 7F, -11F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[76].setRotationPoint(-29.5F, -21F, -11F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 210
		bodyModel[77].setRotationPoint(-18.5F, -21F, -11F);

		bodyModel[78].addBox(0F, 0F, 0F, 1, 3, 14, 0F); // Box 211
		bodyModel[78].setRotationPoint(-29.5F, -21F, -7F);

		bodyModel[79].addBox(0F, 0F, 0F, 2, 4, 2, 0F); // Box 48
		bodyModel[79].setRotationPoint(-31.5F, -21F, -1F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 2, 4, 5, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
		bodyModel[80].setRotationPoint(-31.5F, -21F, -6F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 2, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 44
		bodyModel[81].setRotationPoint(-31.5F, -21F, 1F);

		bodyModel[82].addBox(0F, 0F, 0F, 0, 2, 5, 0F); // Box 117 liveryimg 2 glow
		bodyModel[82].setRotationPoint(-29.55F, -19.5F, -6F);
		bodyModel[82].rotateAngleY = 0.38397244F;

		bodyModel[83].addBox(0F, 0F, -5F, 0, 2, 5, 0F); // Box 118 liveryimg 2 glow
		bodyModel[83].setRotationPoint(-29.55F, -19.5F, 6F);
		bodyModel[83].rotateAngleY = -0.38397244F;

		bodyModel[84].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 186 headlight front
		bodyModel[84].setRotationPoint(-32F, -21F, -1F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 187 headlight front
		bodyModel[85].setRotationPoint(-32F, -19F, -1F);

		bodyModel[86].addBox(0F, 0F, 0F, 1, 3, 14, 0F); // Box 219
		bodyModel[86].setRotationPoint(-18.5F, -21F, -7F);

		bodyModel[87].addBox(0F, 0F, 0F, 10, 1, 14, 0F); // Box 220
		bodyModel[87].setRotationPoint(-28.5F, -21F, -7F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 10, 3, 4, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 221
		bodyModel[88].setRotationPoint(-28.5F, -21F, -11F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 10, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 222
		bodyModel[89].setRotationPoint(-28.5F, -21F, 7F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 223
		bodyModel[90].setRotationPoint(-18.5F, -21F, 7F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 224
		bodyModel[91].setRotationPoint(-29.5F, -21F, 7F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 0, 1, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 225
		bodyModel[92].setRotationPoint(46.5F, 8F, -10F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 0, 1, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 226
		bodyModel[93].setRotationPoint(-47.5F, 8F, -10F);

		bodyModel[94].addBox(0F, 0F, 0F, 0, 1, 22, 0F); // Box 227
		bodyModel[94].setRotationPoint(-47.5F, 7F, -11F);

		bodyModel[95].addBox(0F, 0F, 0F, 30, 1, 4, 0F); // Box 229
		bodyModel[95].setRotationPoint(-42.5F, 1F, -11F);

		bodyModel[96].addBox(0F, 0F, 0F, 30, 1, 4, 0F); // Box 230
		bodyModel[96].setRotationPoint(-42.5F, 1F, 7F);

		bodyModel[97].addBox(0F, 0F, 0F, 30, 1, 4, 0F); // Box 231
		bodyModel[97].setRotationPoint(11.5F, 1F, 7F);

		bodyModel[98].addBox(0F, 0F, 0F, 30, 1, 4, 0F); // Box 232
		bodyModel[98].setRotationPoint(11.5F, 1F, -11F);

		bodyModel[99].addBox(0F, 0F, 0F, 18, 3, 3, 0F); // Box 233
		bodyModel[99].setRotationPoint(-8F, 3F, -11F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 18, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 234
		bodyModel[100].setRotationPoint(-8F, 6F, -11F);

		bodyModel[101].addBox(0F, 0F, 0F, 18, 3, 3, 0F); // Box 235
		bodyModel[101].setRotationPoint(-8F, 3F, 8F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 18, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F); // Box 236
		bodyModel[102].setRotationPoint(-8F, 6F, 8F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 15, 1, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 86
		bodyModel[103].setRotationPoint(-5.5F, 0.5F, 9F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 15, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 87
		bodyModel[104].setRotationPoint(-5.5F, 1.5F, 9F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 15, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 255
		bodyModel[105].setRotationPoint(-5.5F, 1.5F, -11F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 15, 1, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 256
		bodyModel[106].setRotationPoint(-5.5F, 0.5F, -11F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 241
		bodyModel[107].setRotationPoint(-12.5F, 1F, -11F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 242
		bodyModel[108].setRotationPoint(-12.5F, 1F, 7F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 243
		bodyModel[109].setRotationPoint(10.5F, 1F, 7F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 244
		bodyModel[110].setRotationPoint(10.5F, 1F, -11F);

		bodyModel[111].addBox(0F, 0F, 0F, 7, 4, 4, 0F); // Box 245
		bodyModel[111].setRotationPoint(-36.5F, -4F, -11F);

		bodyModel[112].addBox(0F, 0F, 0F, 7, 4, 4, 0F); // Box 246
		bodyModel[112].setRotationPoint(-36.5F, -4F, 7F);

		bodyModel[113].addBox(0F, 0F, 0F, 0, 13, 2, 0F); // Box 81
		bodyModel[113].setRotationPoint(-43.5F, -8F, -11F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 81
		bodyModel[114].setRotationPoint(-43.5F, -6F, -11.5F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 176
		bodyModel[115].setRotationPoint(-43.5F, -6F, 10.5F);

		bodyModel[116].addBox(0F, 0F, 0F, 0, 13, 2, 0F); // Box 177
		bodyModel[116].setRotationPoint(-43.5F, -8F, 9F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 3, 0, 1, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 271
		bodyModel[117].setRotationPoint(-47.5F, 1F, -8F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 272
		bodyModel[118].setRotationPoint(-47.5F, 8F, -11F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 273
		bodyModel[119].setRotationPoint(-47.5F, 5F, -10F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 274
		bodyModel[120].setRotationPoint(-47.5F, 3F, -9F);

		bodyModel[121].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 258
		bodyModel[121].setRotationPoint(-43.5F, -8F, -11F);

		bodyModel[122].addBox(0F, 0F, 0F, 1, 7, 0, 0F); // Box 259
		bodyModel[122].setRotationPoint(-41.5F, -7F, -11F);

		bodyModel[123].addBox(0F, 0F, 0F, 6, 1, 0, 0F); // Box 260
		bodyModel[123].setRotationPoint(-35.5F, -12F, -11F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 261
		bodyModel[124].setRotationPoint(-39.5F, -8F, -11F);

		bodyModel[125].addBox(0F, 0F, 0F, 1, 7, 0, 0F); // Box 262
		bodyModel[125].setRotationPoint(-34.5F, -11F, -11F);

		bodyModel[126].addBox(0F, 0F, 0F, 1, 7, 0, 0F); // Box 263
		bodyModel[126].setRotationPoint(-34.5F, -11F, 11F);

		bodyModel[127].addBox(0F, 0F, 0F, 1, 7, 0, 0F); // Box 264
		bodyModel[127].setRotationPoint(-41.5F, -7F, 11F);

		bodyModel[128].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 265
		bodyModel[128].setRotationPoint(-43.5F, -8F, 11F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 266
		bodyModel[129].setRotationPoint(-39.5F, -8F, 11F);

		bodyModel[130].addBox(0F, 0F, 0F, 6, 1, 0, 0F); // Box 267
		bodyModel[130].setRotationPoint(-35.5F, -12F, 11F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 268
		bodyModel[131].setRotationPoint(-49.5F, 0F, -7F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 269
		bodyModel[132].setRotationPoint(-49.5F, 0F, 0F);

		bodyModel[133].addBox(0F, 0F, 0F, 1, 8, 3, 0F); // Box 270
		bodyModel[133].setRotationPoint(-17.5F, -10F, -10F);

		bodyModel[134].addBox(0F, 0F, 0F, 8, 11, 2, 0F); // Box 271
		bodyModel[134].setRotationPoint(-14.5F, -13F, -9F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 8, 2, 2, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 272
		bodyModel[135].setRotationPoint(-14.5F, -15F, -9F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 7, 1, 12, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 273
		bodyModel[136].setRotationPoint(-15.5F, -22F, -6F);

		bodyModel[137].addBox(0F, 0F, 0F, 2, 1, 5, 0F); // Box 274
		bodyModel[137].setRotationPoint(-6.5F, -22.5F, -2.5F);

		bodyModel[138].addBox(0F, 0F, 0F, 4, 1, 8, 0F); // Box 275
		bodyModel[138].setRotationPoint(-7.5F, -21.5F, -4F);

		bodyModel[139].addBox(0F, 0F, 0F, 6, 2, 6, 0F); // Box 276
		bodyModel[139].setRotationPoint(30.5F, -22F, -3F);

		bodyModel[140].addBox(0F, 0F, 0F, 6, 2, 6, 0F); // Box 277
		bodyModel[140].setRotationPoint(23.5F, -22F, -3F);

		bodyModel[141].addBox(0F, 0F, 0F, 6, 1, 6, 0F); // Box 278
		bodyModel[141].setRotationPoint(-1.5F, -22F, -3F);

		bodyModel[142].addBox(0F, 0F, 0F, 6, 2, 6, 0F); // Box 279
		bodyModel[142].setRotationPoint(16.5F, -22F, -3F);

		bodyModel[143].addBox(0F, 0F, 0F, 6, 1, 6, 0F); // Box 280
		bodyModel[143].setRotationPoint(5.5F, -22F, -3F);

		bodyModel[144].addBox(0F, 0F, 0F, 1, 4, 0, 0F); // Box 281
		bodyModel[144].setRotationPoint(-37.5F, -4F, -11F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 1, 4, 0, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 282
		bodyModel[145].setRotationPoint(-38.5F, -4F, -11F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 1, 4, 0, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 283
		bodyModel[146].setRotationPoint(-38.5F, -4F, 11F);

		bodyModel[147].addBox(0F, 0F, 0F, 1, 4, 0, 0F); // Box 284
		bodyModel[147].setRotationPoint(-37.5F, -4F, 11F);

		bodyModel[148].addBox(0F, 0F, 0F, 9, 5, 1, 0F); // Box 285
		bodyModel[148].setRotationPoint(-16.5F, -20.5F, -7.5F);

		bodyModel[149].addBox(0F, 0F, 0F, 9, 5, 1, 0F); // Box 286
		bodyModel[149].setRotationPoint(-16.5F, -20.5F, 6.5F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 287
		bodyModel[150].setRotationPoint(42.5F, -6F, -11.5F);

		bodyModel[151].addBox(0F, 0F, 0F, 0, 13, 2, 0F); // Box 288
		bodyModel[151].setRotationPoint(42.5F, -8F, -11F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 289
		bodyModel[152].setRotationPoint(42.5F, -6F, 10.5F);

		bodyModel[153].addBox(0F, 0F, 0F, 0, 13, 2, 0F); // Box 290
		bodyModel[153].setRotationPoint(42.5F, -8F, 9F);

		bodyModel[154].addBox(0F, 0F, 0F, 56, 8, 0, 0F); // Box 291
		bodyModel[154].setRotationPoint(-13.5F, -8F, 11F);

		bodyModel[155].addBox(0F, 0F, 0F, 2, 4, 4, 0F); // Box 292
		bodyModel[155].setRotationPoint(-17.5F, -4F, 7F);

		bodyModel[156].addBox(0F, 0F, 0F, 1, 4, 0, 0F); // Box 293
		bodyModel[156].setRotationPoint(-15.5F, -4F, 11F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 1, 4, 0, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 294
		bodyModel[157].setRotationPoint(-14.5F, -4F, 11F);

		bodyModel[158].addBox(0F, 0F, 0F, 1, 1, 0, 0F); // Box 295
		bodyModel[158].setRotationPoint(-17.5F, -12F, 11F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F); // Box 296
		bodyModel[159].setRotationPoint(-16.5F, -10F, 11F);

		bodyModel[160].addBox(0F, 0F, 0F, 10, 4, 1, 0F); // Box 297
		bodyModel[160].setRotationPoint(27F, -20.5F, -7.25F);

		bodyModel[161].addBox(0F, 0F, 0F, 10, 4, 1, 0F); // Box 298
		bodyModel[161].setRotationPoint(16.5F, -20.5F, -7.25F);

		bodyModel[162].addBox(0F, 0F, 0F, 10, 4, 1, 0F); // Box 299
		bodyModel[162].setRotationPoint(27F, -20.5F, 6.25F);

		bodyModel[163].addBox(0F, 0F, 0F, 10, 4, 1, 0F); // Box 300
		bodyModel[163].setRotationPoint(16.5F, -20.5F, 6.25F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, 0F, -1F, 0F); // Box 301
		bodyModel[164].setRotationPoint(46.5F, 0F, 5F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F); // Box 302
		bodyModel[165].setRotationPoint(-48.5F, 0F, 5F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 303
		bodyModel[166].setRotationPoint(-48.5F, 0F, -5F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 304
		bodyModel[167].setRotationPoint(-48.5F, 0F, -6F);

		bodyModel[168].addBox(0F, 0F, 0F, 2, 2, 4, 0F); // Box 31
		bodyModel[168].setRotationPoint(38.75F, -19F, -2F);

		bodyModel[169].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 247 headlight r
		bodyModel[169].setRotationPoint(40F, -19F, -2F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 248 headlight r
		bodyModel[170].setRotationPoint(40F, -19F, 0F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 10, 3, 4, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 308
		bodyModel[171].setRotationPoint(-17.5F, -21F, -11F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 309
		bodyModel[172].setRotationPoint(-7.5F, -21F, -11F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 10, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 310
		bodyModel[173].setRotationPoint(-17.5F, -21F, 7F);

		bodyModel[174].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 311
		bodyModel[174].setRotationPoint(-7.5F, -21F, 7F);

		bodyModel[175].addBox(0F, 0F, 0F, 36, 8, 0, 0F); // Box 312
		bodyModel[175].setRotationPoint(-14.5F, -10F, -11F);

		bodyModel[176].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 313
		bodyModel[176].setRotationPoint(-16.5F, -12F, -11F);

		bodyModel[177].addBox(0F, 0F, 0F, 1, 1, 0, 0F); // Box 314
		bodyModel[177].setRotationPoint(-17.5F, -12F, -11F);

		bodyModel[178].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 315
		bodyModel[178].setRotationPoint(21.5F, -10F, -11F);

		bodyModel[179].addBox(0F, 0F, 0F, 19, 8, 0, 0F); // Box 316
		bodyModel[179].setRotationPoint(23.5F, -8F, -11F);

		bodyModel[180].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 317
		bodyModel[180].setRotationPoint(13.5F, -22F, -1F);

		bodyModel[181].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F); // Box 318
		bodyModel[181].setRotationPoint(37F, -21.5F, -0.5F);

		bodyModel[182].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F); // Box 319
		bodyModel[182].setRotationPoint(-39.5F, -13.5F, -0.5F);

		bodyModel[183].addBox(0F, 0F, 0F, 4, 3, 14, 0F); // Box 320 ptc forehead
		bodyModel[183].setRotationPoint(-33.5F, -21F, -7F);

		bodyModel[184].addShapeBox(0F, 0F, 0F, 1, 3, 7, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 321 ptc forehead
		bodyModel[184].setRotationPoint(-34.5F, -21F, -7F);

		bodyModel[185].addShapeBox(0F, 0F, 0F, 1, 3, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 322 ptc forehead
		bodyModel[185].setRotationPoint(-34.5F, -21F, 0F);

		bodyModel[186].addShapeBox(0F, 0F, 0F, 3, 8, 7, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 42
		bodyModel[186].setRotationPoint(-42.5F, -8F, -7F);

		bodyModel[187].addShapeBox(0F, 0F, 0F, 3, 8, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 45
		bodyModel[187].setRotationPoint(-42.5F, -8F, 0F);

		bodyModel[188].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 176 markerlight glow
		bodyModel[188].setRotationPoint(-40.4F, -11.5F, 5.5F);
		bodyModel[188].rotateAngleY = -0.43633231F;

		bodyModel[189].addBox(0F, 0F, -1F, 1, 1, 1, 0F); // Box 176 markerlight glow
		bodyModel[189].setRotationPoint(-40.4F, -11.5F, -5.5F);
		bodyModel[189].rotateAngleY = 0.43633231F;

		bodyModel[190].addBox(0F, 0F, 0F, 1, 13, 14, 0F); // Box 43
		bodyModel[190].setRotationPoint(-39.5F, -13F, -7F);

		bodyModel[191].addBox(0F, 0F, 0F, 2, 13, 13, 0F); // Box 43
		bodyModel[191].setRotationPoint(-38.5F, -13F, -6F);

		bodyModel[192].addBox(0F, 0F, 0F, 2, 4, 1, 0F); // Box 43
		bodyModel[192].setRotationPoint(-38.5F, -13F, -7F);

		bodyModel[193].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
		bodyModel[193].setRotationPoint(-38F, -8.5F, -7F);

		bodyModel[194].addBox(0F, 0F, 0F, 0, 7, 1, 0F); // Box 43
		bodyModel[194].setRotationPoint(-37.5F, -6.5F, -7F);

		bodyModel[195].addBox(0F, 0F, 0F, 7, 13, 14, 0F); // Box 345
		bodyModel[195].setRotationPoint(-36.5F, -13F, -7F);

		bodyModel[196].addBox(0F, 0F, 0F, 2, 9, 1, 0F); // Box 346 cover
		bodyModel[196].setRotationPoint(-38.5F, -9F, -7F);

		bodyModel[197].addShapeBox(0F, 0F, 0F, 13, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 100
		bodyModel[197].setRotationPoint(-1.5F, -21F, -9F);

		bodyModel[198].addShapeBox(0F, 0F, 0F, 13, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 101
		bodyModel[198].setRotationPoint(-1.5F, -21F, 7F);

		bodyModel[199].addShapeBox(0F, 0F, 0F, 5, 3, 2, 0F,0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, -1.75F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.7F, 0F); // Box 102
		bodyModel[199].setRotationPoint(-6.5F, -21F, -9F);

		bodyModel[200].addShapeBox(0F, 0F, 0F, 3, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1.5F, -2F, 0F, -1.5F, 0F, 0F, 0F, 0F); // Box 103
		bodyModel[200].setRotationPoint(11.5F, -21F, -9F);

		bodyModel[201].addShapeBox(0F, 0F, 0F, 3, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, -2F, 0F, 0F, -1F); // Box 104
		bodyModel[201].setRotationPoint(11.5F, -21F, 7F);

		bodyModel[202].addShapeBox(0F, 0F, 0F, 5, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.7F, -1.75F); // Box 105
		bodyModel[202].setRotationPoint(-6.5F, -21F, 7F);

		bodyModel[203].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 354 cnw bELL
		bodyModel[203].setRotationPoint(-42.5F, -13F, -1F);

		bodyModel[204].addBox(0F, 0F, 0F, 3, 3, 0, 0F); // Box 355
		bodyModel[204].setRotationPoint(-38.5F, -12F, -7.5F);

		bodyModel[205].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 356
		bodyModel[205].setRotationPoint(-37.5F, -11F, -7.5F);

		bodyModel[206].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 114
		bodyModel[206].setRotationPoint(-33.5F, -19F, -0.5F);

		bodyModel[207].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[207].setRotationPoint(-33.5F, -20F, -0.5F);

		bodyModel[208].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 78
		bodyModel[208].setRotationPoint(-33.25F, -18.5F, -0.25F);

		bodyModel[209].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 245
		bodyModel[209].setRotationPoint(-33.5F, -21F, -0.5F);

		bodyModel[210].addBox(0F, 0F, 0F, 6, 2, 4, 0F); // Box 361
		bodyModel[210].setRotationPoint(-26.5F, -23F, -6F);

		bodyModel[211].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 362
		bodyModel[211].setRotationPoint(-27.5F, -23F, -6F);

		bodyModel[212].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 363
		bodyModel[212].setRotationPoint(-27.5F, -22F, -6F);

		bodyModel[213].addBox(0F, 0F, 0F, 6, 2, 4, 0F); // Box 364
		bodyModel[213].setRotationPoint(-26.5F, -23F, 2F);

		bodyModel[214].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 365
		bodyModel[214].setRotationPoint(-27.5F, -23F, 2F);

		bodyModel[215].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 366
		bodyModel[215].setRotationPoint(-27.5F, -22F, 2F);

		bodyModel[216].addBox(0F, 0F, 0F, 6, 0, 2, 0F); // Box 367
		bodyModel[216].setRotationPoint(-26.5F, -22F, -9F);

		bodyModel[217].addBox(0F, 0F, 0F, 1, 3, 0, 0F); // Box 368
		bodyModel[217].setRotationPoint(-26.5F, -22F, -9F);

		bodyModel[218].addBox(0F, 0F, 0F, 1, 3, 0, 0F); // Box 369
		bodyModel[218].setRotationPoint(-21.5F, -22F, -9F);

		bodyModel[219].addBox(0F, 0F, 0F, 1, 1, 0, 0F); // Box 370
		bodyModel[219].setRotationPoint(-21.5F, -22F, -7F);

		bodyModel[220].addBox(0F, 0F, 0F, 1, 1, 0, 0F); // Box 371
		bodyModel[220].setRotationPoint(-26.5F, -22F, -7F);

		bodyModel[221].addBox(0F, 0F, 0F, 1, 1, 0, 0F); // Box 372
		bodyModel[221].setRotationPoint(-21.5F, -22F, 7F);

		bodyModel[222].addBox(0F, 0F, 0F, 1, 1, 0, 0F); // Box 373
		bodyModel[222].setRotationPoint(-26.5F, -22F, 7F);

		bodyModel[223].addBox(0F, 0F, 0F, 6, 0, 2, 0F); // Box 374
		bodyModel[223].setRotationPoint(-26.5F, -22F, 7F);

		bodyModel[224].addBox(0F, 0F, 0F, 1, 3, 0, 0F); // Box 375
		bodyModel[224].setRotationPoint(-26.5F, -22F, 9F);

		bodyModel[225].addBox(0F, 0F, 0F, 1, 3, 0, 0F); // Box 376
		bodyModel[225].setRotationPoint(-21.5F, -22F, 9F);

		bodyModel[226].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 377
		bodyModel[226].setRotationPoint(-26.5F, -23F, 8F);

		bodyModel[227].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 378
		bodyModel[227].setRotationPoint(-23.5F, -23F, -8F);

		bodyModel[228].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 379
		bodyModel[228].setRotationPoint(13.5F, -22F, -7F);

		bodyModel[229].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 380
		bodyModel[229].setRotationPoint(12.5F, -23F, -6.75F);

		bodyModel[230].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 381
		bodyModel[230].setRotationPoint(11.5F, -23F, -5.25F);

		bodyModel[231].addBox(0F, 0F, 0F, 1, 1, 16, 0F); // Box 382
		bodyModel[231].setRotationPoint(-24F, -22F, -8F);

		bodyModel[232].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 384
		bodyModel[232].setRotationPoint(-32.5F, -23F, -1.5F);

		bodyModel[233].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 385
		bodyModel[233].setRotationPoint(-31F, -23F, -0.5F);

		bodyModel[234].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 386
		bodyModel[234].setRotationPoint(-31.75F, -23F, 0.5F);

		bodyModel[235].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 387
		bodyModel[235].setRotationPoint(-30.75F, -22.5F, -0.5F);

		bodyModel[236].addBox(0F, 0F, 0F, 5, 2, 5, 0F); // Box 388 cull
		bodyModel[236].setRotationPoint(-26.5F, -22.5F, 0F);

		bodyModel[237].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 114
		bodyModel[237].setRotationPoint(-13.5F, 3F, -10.5F);

		bodyModel[238].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[238].setRotationPoint(-13.5F, 2F, -10.5F);

		bodyModel[239].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 78
		bodyModel[239].setRotationPoint(-13.25F, 3.5F, -10.25F);

		bodyModel[240].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 78
		bodyModel[240].setRotationPoint(-47.5F, -2F, 4.75F);

		bodyModel[241].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 188
		bodyModel[241].setRotationPoint(-47.5F, -2F, -6.75F);

		bodyModel[242].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 189 ditchlight f b
		bodyModel[242].setRotationPoint(-47.75F, -2F, 4.75F);

		bodyModel[243].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 190 ditchlight f b
		bodyModel[243].setRotationPoint(-47.75F, -2F, -6.75F);

		bodyModel[244].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 239
		bodyModel[244].setRotationPoint(45.5F, -2F, -6.75F);

		bodyModel[245].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 240 ditchlight r b
		bodyModel[245].setRotationPoint(45.75F, -2F, -6.75F);

		bodyModel[246].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 241 ditchlight r b
		bodyModel[246].setRotationPoint(45.75F, -2F, 4.75F);

		bodyModel[247].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 242
		bodyModel[247].setRotationPoint(45.5F, -2F, 4.75F);

		bodyModel[248].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 114
		bodyModel[248].setRotationPoint(-17.5F, -19F, -8.7F);

		bodyModel[249].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[249].setRotationPoint(-17.5F, -20F, -8.7F);

		bodyModel[250].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 78
		bodyModel[250].setRotationPoint(-17.25F, -18.5F, -8.45F);

		bodyModel[251].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 245
		bodyModel[251].setRotationPoint(-17.5F, -21F, -8.5F);

		bodyModel[252].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0.3F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, 0.3F, -0.5F, 0.1F, 0.3F, 0F, 0.1F, -1F, 0F, 0.1F, -1F, 0F, 0.1F, 0.3F, 0F, 0.1F); // Box 409
		bodyModel[252].setRotationPoint(-28.82F, -22F, -0.5F);

		bodyModel[253].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 410 glow commander
		bodyModel[253].setRotationPoint(-29F, -23F, -0.5F);

		bodyModel[254].addBox(0F, 0F, 0F, 2, 1, 4, 0F); // Box 411
		bodyModel[254].setRotationPoint(-28.5F, 2F, -11F);

		bodyModel[255].addBox(0F, 0F, 0F, 2, 1, 4, 0F); // Box 412
		bodyModel[255].setRotationPoint(-28.5F, 2F, 7F);

		bodyModel[256].addBox(0F, 0F, 0F, 2, 1, 4, 0F); // Box 413
		bodyModel[256].setRotationPoint(25.5F, 2F, 7F);

		bodyModel[257].addBox(0F, 0F, 0F, 2, 1, 4, 0F); // Box 414
		bodyModel[257].setRotationPoint(25.5F, 2F, -11F);

		bodyModel[258].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 415
		bodyModel[258].setRotationPoint(-22.5F, -22F, -5F);

		bodyModel[259].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 416 ditchlight f c
		bodyModel[259].setRotationPoint(-48.25F, 1F, -5.75F);

		bodyModel[260].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 417 cull
		bodyModel[260].setRotationPoint(-48F, 1F, -5.75F);

		bodyModel[261].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 418 ditchlight f c
		bodyModel[261].setRotationPoint(-48.25F, 1F, 3.75F);

		bodyModel[262].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 419 cull
		bodyModel[262].setRotationPoint(-48F, 1F, 3.75F);

		bodyModel[263].addShapeBox(0F, 0F, 0F, 7, 2, 1, 0F,1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -1F, 1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // box64
		bodyModel[263].setRotationPoint(-27.5F, -18F, 11F);

		bodyModel[264].addShapeBox(0F, 0F, 0F, 7, 2, 1, 0F,1F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // box65
		bodyModel[264].setRotationPoint(-27.5F, -18F, -12F);

		bodyModel[265].addBox(0F, 0F, 0F, 0, 4, 1, 0F); // Box 350
		bodyModel[265].setRotationPoint(-28.5F, -16F, -12F);

		bodyModel[266].addBox(0F, 0F, 0F, 0, 4, 1, 0F); // Box 351
		bodyModel[266].setRotationPoint(-28.5F, -16F, 11F);

		bodyModel[267].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 336
		bodyModel[267].setRotationPoint(-31.5F, -23F, -2F);

		bodyModel[268].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 337 lamp
		bodyModel[268].setRotationPoint(-32.25F, -23F, 0F);

		bodyModel[269].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 338 lamp
		bodyModel[269].setRotationPoint(-32.25F, -23F, -2F);

		bodyModel[270].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 327
		bodyModel[270].setRotationPoint(5F, -22.5F, -8.5F);

		bodyModel[271].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 328
		bodyModel[271].setRotationPoint(6F, -22.25F, -7.5F);

		bodyModel[272].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 329
		bodyModel[272].setRotationPoint(5.5F, -22.25F, -9.5F);

		bodyModel[273].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 330
		bodyModel[273].setRotationPoint(7.5F, -21.5F, -8.5F);

		bodyModel[274].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 331
		bodyModel[274].setRotationPoint(6.5F, -23.5F, -7.75F);

		bodyModel[275].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 332
		bodyModel[275].setRotationPoint(6.5F, -23.5F, -9F);

		bodyModel[276].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 894
		bodyModel[276].setRotationPoint(34.5F, -23F, 4.5F);

		bodyModel[277].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 895
		bodyModel[277].setRotationPoint(34.5F, -22F, 4.5F);

		bodyModel[278].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, -0.5F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F); // Box 202
		bodyModel[278].setRotationPoint(35.5F, -23.5F, 3.5F);

		bodyModel[279].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 438 headlight r o canada
		bodyModel[279].setRotationPoint(40F, -19F, -1F);

		bodyModel[280].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 439
		bodyModel[280].setRotationPoint(-13.5F, -23F, -3F);

		bodyModel[281].addBox(0F, 0F, 0F, 1, 7, 4, 0F); // Box 440
		bodyModel[281].setRotationPoint(-43.5F, -7F, -2F);

		bodyModel[282].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 441
		bodyModel[282].setRotationPoint(-44F, -6.5F, -0.5F);

		bodyModel[283].addBox(0F, 0F, 0F, 0, 3, 3, 0F); // Box 442
		bodyModel[283].setRotationPoint(-44F, -7.5F, -1.5F);

		bodyModel[284].addBox(0F, 0F, 0F, 0, 3, 3, 0F); // Box 443
		bodyModel[284].setRotationPoint(42F, -7.5F, -1.5F);

		bodyModel[285].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 444
		bodyModel[285].setRotationPoint(41F, -6.5F, -0.5F);

		bodyModel[286].addBox(0F, 0F, 0F, 1, 7, 4, 0F); // Box 445
		bodyModel[286].setRotationPoint(40.5F, -7F, -2F);

		bodyModel[287].addBox(0F, 0F, 0F, 7, 8, 3, 0F); // Box 86
		bodyModel[287].setRotationPoint(-28.6F, -12F, -5F);
		bodyModel[287].rotateAngleY = -0.38397244F;

		bodyModel[288].addBox(0F, 0F, 0F, 1, 9, 10, 0F); // Box 87
		bodyModel[288].setRotationPoint(-28.5F, -13F, -4F);

		bodyModel[289].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 86
		bodyModel[289].setRotationPoint(-25.5F, -14F, -5.5F);
		bodyModel[289].rotateAngleY = -0.38397244F;

		bodyModel[290].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 87
		bodyModel[290].setRotationPoint(-27.5F, -13.75F, -4F);
		bodyModel[290].rotateAngleY = -0.38397244F;

		bodyModel[291].addBox(0F, 0F, 0F, 21, 2, 22, 0F); // Box 450 extended tank
		bodyModel[291].setRotationPoint(-11F, 1F, -11F);

		bodyModel[292].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 451
		bodyModel[292].setRotationPoint(-47.5F, 3F, 7F);

		bodyModel[293].addShapeBox(0F, 0F, 0F, 3, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 452
		bodyModel[293].setRotationPoint(-47.5F, 1F, 7F);

		bodyModel[294].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 453
		bodyModel[294].setRotationPoint(-47.5F, 5F, 8F);

		bodyModel[295].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 454
		bodyModel[295].setRotationPoint(-47.5F, 8F, 9F);

		bodyModel[296].addBox(0F, 0F, 0F, 0, 2, 5, 0F); // Box 115 liveryimg 2 glow
		bodyModel[296].setRotationPoint(37.95F, -16F, -6F);
		bodyModel[296].rotateAngleY = -0.41887902F;

		bodyModel[297].addBox(0F, 0F, -5F, 0, 2, 5, 0F); // Box 116 liveryimg 2 glow
		bodyModel[297].setRotationPoint(37.95F, -16F, 6F);
		bodyModel[297].rotateAngleY = 0.41887902F;

		bodyModel[298].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 19
		bodyModel[298].setRotationPoint(-8F, 2F, -11.5F);
		bodyModel[298].rotateAngleX = 0.87266463F;

		bodyModel[299].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 334
		bodyModel[299].setRotationPoint(-8F, 3.5F, 8.75F);
		bodyModel[299].rotateAngleX = 0.87266463F;

		bodyModel[300].addBox(0F, 0F, 0F, 3, 3, 3, 0F); // Box 335
		bodyModel[300].setRotationPoint(-11F, 3F, -11F);

		bodyModel[301].addShapeBox(0F, 0F, 0F, 3, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 336
		bodyModel[301].setRotationPoint(-11F, 6F, -11F);

		bodyModel[302].addBox(0F, 0F, 0F, 3, 6, 16, 0F); // Box 337
		bodyModel[302].setRotationPoint(-11F, 3F, -8F);

		bodyModel[303].addShapeBox(0F, 0F, 0F, 3, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F); // Box 338
		bodyModel[303].setRotationPoint(-11F, 6F, 8F);

		bodyModel[304].addBox(0F, 0F, 0F, 3, 3, 3, 0F); // Box 339
		bodyModel[304].setRotationPoint(-11F, 3F, 8F);

		bodyModel[305].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 340 glow commander
		bodyModel[305].setRotationPoint(-25F, -23F, -0.5F);

		bodyModel[306].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0.3F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, 0.3F, -0.5F, 0.1F, 0.3F, 0F, 0.1F, -1F, 0F, 0.1F, -1F, 0F, 0.1F, 0.3F, 0F, 0.1F); // Box 341
		bodyModel[306].setRotationPoint(-24.82F, -22F, -0.5F);

		bodyModel[307].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 629
		bodyModel[307].setRotationPoint(-26.5F, 4F, -1F);

		bodyModel[308].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 630
		bodyModel[308].setRotationPoint(-33.5F, 4F, -1F);

		bodyModel[309].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 726
		bodyModel[309].setRotationPoint(30.5F, 4F, -1F);

		bodyModel[310].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 727
		bodyModel[310].setRotationPoint(23.5F, 4F, -1F);

		bodyModel[311].addBox(0F, 0F, 0F, 10, 8, 14, 0F); // Box 382
		bodyModel[311].setRotationPoint(-39.5F, -21F, -7F);

		bodyModel[312].addShapeBox(0F, 0F, 0F, 3, 8, 7, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 383
		bodyModel[312].setRotationPoint(-42.5F, -21F, -7F);

		bodyModel[313].addShapeBox(0F, 0F, 0F, 3, 8, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 384
		bodyModel[313].setRotationPoint(-42.5F, -21F, 0F);

		bodyModel[314].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 385 headlight f hh
		bodyModel[314].setRotationPoint(-43F, -19F, 0F);

		bodyModel[315].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 386 headlight f hh
		bodyModel[315].setRotationPoint(-43F, -19F, -2F);

		bodyModel[316].addBox(0F, 0F, 0F, 2, 2, 4, 0F); // Box 387
		bodyModel[316].setRotationPoint(-42.75F, -19F, -2F);

		bodyModel[317].addBox(0F, 0F, -5F, 1, 2, 5, 0F); // Box 350 liveryimg 3 glow
		bodyModel[317].setRotationPoint(-40F, -16F, 6F);
		bodyModel[317].rotateAngleY = -0.40142573F;

		bodyModel[318].addBox(0F, 0F, 0F, 1, 2, 5, 0F); // Box 351 liveryimg 3 glow
		bodyModel[318].setRotationPoint(-40F, -16F, -6F);
		bodyModel[318].rotateAngleY = 0.40142573F;

		bodyModel[319].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F); // Box 352
		bodyModel[319].setRotationPoint(-39.5F, -21.5F, -0.5F);

		bodyModel[320].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 354
		bodyModel[320].setRotationPoint(-42F, -23F, -5.5F);

		bodyModel[321].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 355
		bodyModel[321].setRotationPoint(-41F, -22.75F, -4.5F);

		bodyModel[322].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 356
		bodyModel[322].setRotationPoint(-41.5F, -22.75F, -6.5F);

		bodyModel[323].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 357
		bodyModel[323].setRotationPoint(-39.5F, -22F, -5.5F);

		bodyModel[324].addBox(0F, 0F, 0F, 4, 0, 4, 0F); // Box 369
		bodyModel[324].setRotationPoint(-18.5F, -23F, 2F);

		bodyModel[325].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 370
		bodyModel[325].setRotationPoint(-18.5F, -23F, 2F);

		bodyModel[326].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 371
		bodyModel[326].setRotationPoint(-18.5F, -23F, 6F);

		bodyModel[327].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 372
		bodyModel[327].setRotationPoint(-18.5F, -24F, 4F);

		bodyModel[328].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 373
		bodyModel[328].setRotationPoint(-15.5F, -23F, 6F);

		bodyModel[329].addBox(0F, 0F, 0F, 1, 1, 0, 0F); // Box 374
		bodyModel[329].setRotationPoint(-15.5F, -23F, 2F);

		bodyModel[330].addShapeBox(0F, 0F, 0F, 3, 2, 6, 0F,-0.42F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -0.42F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 42
		bodyModel[330].setRotationPoint(-42.5F, -10F, 1F);

		bodyModel[331].addShapeBox(0F, 0F, 0F, 2, 5, 2, 0F,0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.6F, 0F, 0F); // Box 48
		bodyModel[331].setRotationPoint(-41.48F, -13F, -1F);

		bodyModel[332].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 294 lamp canada front
		bodyModel[332].setRotationPoint(-42.5F, -10F, -1F);

		bodyModel[333].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 295 lamp canada front
		bodyModel[333].setRotationPoint(-42.5F, -12F, -1F);

		bodyModel[334].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, -0.57F, 0F, 0F, -0.58F, 0F, 0F, -0.42F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.58F, 0F, 0F, -0.42F, 0F, 0F); // Box 296 nose cover
		bodyModel[334].setRotationPoint(-42.5F, -13F, 0F);

		bodyModel[335].addShapeBox(0F, 0F, 0F, 3, 2, 6, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.42F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.42F, 0F, 0F); // Box 298
		bodyModel[335].setRotationPoint(-42.5F, -10F, -7F);

		bodyModel[336].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-0.42F, 0F, 0F, -0.58F, 0F, 0F, -0.57F, 0F, 0F, 0F, 0F, 0F, -0.42F, 0F, 0F, -0.58F, 0F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F); // Box 299 nose cover
		bodyModel[336].setRotationPoint(-42.5F, -13F, -1F);

		bodyModel[337].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 301 lamp bnsf front
		bodyModel[337].setRotationPoint(-42.5F, -13F, -1F);

		bodyModel[338].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 302 lamp bnsf front
		bodyModel[338].setRotationPoint(-42.5F, -11F, -1F);

		bodyModel[339].addShapeBox(0F, 0F, 0F, 3, 3, 6, 0F,-0.42F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -0.42F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 318
		bodyModel[339].setRotationPoint(-42.5F, -13F, 1F);

		bodyModel[340].addShapeBox(0F, 0F, 0F, 3, 3, 6, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.42F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.42F, 0F, 0F); // Box 319
		bodyModel[340].setRotationPoint(-42.5F, -13F, -7F);

		bodyModel[341].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 314 lamp sp front
		bodyModel[341].setRotationPoint(-42.25F, -12F, -2F);

		bodyModel[342].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 315 lamp sp front
		bodyModel[342].setRotationPoint(-42.25F, -12F, 0F);

		bodyModel[343].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 316 lamp sp front gyralight
		bodyModel[343].setRotationPoint(-42.25F, -14F, -1F);

		bodyModel[344].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.6F, 0F, 0F); // Box 317
		bodyModel[344].setRotationPoint(-41.48F, -14F, -1.5F);

		bodyModel[345].addShapeBox(0F, 0F, 0F, 2, 3, 4, 0F,0F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0F, 0F, 0F); // Box 20
		bodyModel[345].setRotationPoint(-41.65F, -13F, -2F);

		bodyModel[346].addShapeBox(0F, 0F, 0F, 18, 1, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 278
		bodyModel[346].setRotationPoint(-8F, 2F, -11F);

		bodyModel[347].addShapeBox(0F, 0F, 0F, 18, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 315
		bodyModel[347].setRotationPoint(-8F, 2F, 7F);

		bodyModel[348].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 382
		bodyModel[348].setRotationPoint(-11F, 2F, -11F);

		bodyModel[349].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 383
		bodyModel[349].setRotationPoint(-11F, 2F, 7F);

		bodyModel[350].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 384 markerlight glow
		bodyModel[350].setRotationPoint(37.4F, -13.5F, -5.5F);
		bodyModel[350].rotateAngleY = -0.43633231F;

		bodyModel[351].addBox(0F, 0F, -1F, 1, 1, 1, 0F); // Box 385 markerlight glow
		bodyModel[351].setRotationPoint(37.4F, -13.5F, 5.5F);
		bodyModel[351].rotateAngleY = 0.43633231F;

		bodyModel[352].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 386 cull
		bodyModel[352].setRotationPoint(46F, 1F, 3.75F);

		bodyModel[353].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 387 cull
		bodyModel[353].setRotationPoint(46F, 1F, -5.75F);

		bodyModel[354].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 388 ditchlight r c
		bodyModel[354].setRotationPoint(46.25F, 1F, -5.75F);

		bodyModel[355].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 389 ditchlight r c
		bodyModel[355].setRotationPoint(46.25F, 1F, 3.75F);

		bodyModel[356].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F,-2F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 0F, 0F, -1F, 0F, 0F); // Box 446
		bodyModel[356].setRotationPoint(-51F, 4F, -10F);

		bodyModel[357].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F,0.5F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F); // Box 447
		bodyModel[357].setRotationPoint(-50.5F, 4F, 2F);

		bodyModel[358].addShapeBox(0F, 0F, 0F, 3, 2, 8, 0F,-0.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F); // Box 448
		bodyModel[358].setRotationPoint(-50.5F, 5F, 2F);

		bodyModel[359].addShapeBox(0F, 0F, 0F, 3, 2, 8, 0F,-2.5F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F); // Box 449
		bodyModel[359].setRotationPoint(-50.5F, 5F, -10F);

		bodyModel[360].addShapeBox(0F, 0F, 0F, 1, 4, 6, 0F,1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 394 awvr window
		bodyModel[360].setRotationPoint(-30.5F, -17F, 0F);

		bodyModel[361].addShapeBox(0F, 0F, 0F, 1, 4, 6, 0F,-1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 394 awvr window
		bodyModel[361].setRotationPoint(-30.5F, -17F, -6F);

		bodyModel[362].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 396
		bodyModel[362].setRotationPoint(42.5F, 3F, -9F);

		bodyModel[363].addShapeBox(0F, 0F, 0F, 3, 0, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 397
		bodyModel[363].setRotationPoint(43.5F, 1F, -8F);

		bodyModel[364].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 398
		bodyModel[364].setRotationPoint(42.5F, 5F, -10F);

		bodyModel[365].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 399
		bodyModel[365].setRotationPoint(42.5F, 8F, -11F);

		bodyModel[366].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 400
		bodyModel[366].setRotationPoint(42.5F, 8F, 9F);

		bodyModel[367].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 401
		bodyModel[367].setRotationPoint(42.5F, 5F, 8F);

		bodyModel[368].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 402
		bodyModel[368].setRotationPoint(42.5F, 3F, 7F);

		bodyModel[369].addShapeBox(0F, 0F, 0F, 3, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 403
		bodyModel[369].setRotationPoint(43.5F, 1F, 7F);

		bodyModel[370].addShapeBox(0F, 0F, 0F, 3, 2, 8, 0F,-2F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F); // Box 395
		bodyModel[370].setRotationPoint(46.5F, 5F, 2F);

		bodyModel[371].addShapeBox(0F, 0F, 0F, 3, 2, 8, 0F,0F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F); // Box 396
		bodyModel[371].setRotationPoint(46.5F, 5F, -10F);

		bodyModel[372].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F,-0.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0.5F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, -1.5F, 0F, 0F); // Box 397
		bodyModel[372].setRotationPoint(47F, 4F, -10F);

		bodyModel[373].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F,-3F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F); // Box 398
		bodyModel[373].setRotationPoint(46.5F, 4F, 2F);

		bodyModel[374].addBox(0F, 0F, 0F, 1, 0, 4, 0F); // Box 408
		bodyModel[374].setRotationPoint(-37.5F, -2F, -11F);

		bodyModel[375].addBox(0F, 0F, 0F, 1, 0, 4, 0F); // Box 409
		bodyModel[375].setRotationPoint(-37.5F, -2F, 7F);

		bodyModel[376].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 410
		bodyModel[376].setRotationPoint(-48.5F, -3F, -5F);

		bodyModel[377].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 411
		bodyModel[377].setRotationPoint(-48.5F, -3F, 3F);

		bodyModel[378].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 412 ditchlight f a
		bodyModel[378].setRotationPoint(-48.75F, -3F, -5F);

		bodyModel[379].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 412 ditchlight f a
		bodyModel[379].setRotationPoint(-48.75F, -3F, 3F);

		bodyModel[380].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 414
		bodyModel[380].setRotationPoint(46.5F, -3F, 3F);

		bodyModel[381].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 415
		bodyModel[381].setRotationPoint(46.5F, -3F, -5F);

		bodyModel[382].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 416 ditchlight r a
		bodyModel[382].setRotationPoint(46.75F, -3F, -5F);

		bodyModel[383].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 417 ditchlight r a
		bodyModel[383].setRotationPoint(46.75F, -3F, 3F);

		bodyModel[384].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 418
		bodyModel[384].setRotationPoint(15F, -21F, -8.5F);

		bodyModel[385].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 419
		bodyModel[385].setRotationPoint(15F, -20F, -8.7F);

		bodyModel[386].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 420
		bodyModel[386].setRotationPoint(15F, -19F, -8.7F);

		bodyModel[387].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 421
		bodyModel[387].setRotationPoint(15.25F, -18.5F, -8.45F);

		bodyModel[388].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 394
		bodyModel[388].setRotationPoint(-47.5F, 7F, 9F);

		bodyModel[389].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 395
		bodyModel[389].setRotationPoint(-47.5F, 4F, 8F);

		bodyModel[390].addBox(0F, 0F, 0F, 3, 1, 0, 0F); // Box 396
		bodyModel[390].setRotationPoint(-47.5F, 2F, 7F);

		bodyModel[391].addBox(0F, 0F, 0F, 3, 1, 0, 0F); // Box 397
		bodyModel[391].setRotationPoint(43.5F, 2F, 7F);

		bodyModel[392].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 398
		bodyModel[392].setRotationPoint(42.5F, 4F, 8F);

		bodyModel[393].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 399
		bodyModel[393].setRotationPoint(42.5F, 7F, 9F);

		bodyModel[394].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 400
		bodyModel[394].setRotationPoint(-47.5F, 7F, -9F);

		bodyModel[395].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 401
		bodyModel[395].setRotationPoint(-47.5F, 4F, -8F);

		bodyModel[396].addBox(0F, 0F, 0F, 3, 1, 0, 0F); // Box 402
		bodyModel[396].setRotationPoint(-47.5F, 2F, -7F);

		bodyModel[397].addBox(0F, 0F, 0F, 3, 1, 0, 0F); // Box 403
		bodyModel[397].setRotationPoint(43.5F, 2F, -7F);

		bodyModel[398].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 404
		bodyModel[398].setRotationPoint(42.5F, 4F, -8F);

		bodyModel[399].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 405
		bodyModel[399].setRotationPoint(42.5F, 7F, -9F);

		bodyModel[400].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 364 prime base
		bodyModel[400].setRotationPoint(-28.5F, -22F, 7F);

		bodyModel[401].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F); // Box 6 PRIME1-1
		bodyModel[401].setRotationPoint(-28.5F, -22.5F, 7F);

		bodyModel[402].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F); // Box 7 PRIME1-3
		bodyModel[402].setRotationPoint(-28.5F, -22.5F, 7F);

		bodyModel[403].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 8 PRIME1-2
		bodyModel[403].setRotationPoint(-28.5F, -22.5F, 7F);

		bodyModel[404].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 9 PRIME1-4
		bodyModel[404].setRotationPoint(-28.5F, -22.5F, 7F);

		bodyModel[405].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 356 support cull
		bodyModel[405].setRotationPoint(-29F, -21F, 7F);

		bodyModel[406].addBox(0F, 0F, 0F, 1, 9, 4, 0F); // Box 412
		bodyModel[406].setRotationPoint(-28.5F, -13F, 3F);

		bodyModel[407].addBox(0F, 0F, 0F, 7, 8, 3, 0F); // Box 413
		bodyModel[407].setRotationPoint(-28.6F, -12F, 1F);
		bodyModel[407].rotateAngleY = -0.38397244F;

		bodyModel[408].addShapeBox(-1F, 0F, 0F, 11, 4, 2, 0F,0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -2F, 0F, -5F, -2F, 0F, -5F, -2F, 0F, 0F, -2F, 0F); // Box 86
		bodyModel[408].setRotationPoint(-27F, -14F, 1F);
		bodyModel[408].rotateAngleY = -0.38397244F;

		bodyModel[409].addShapeBox(0F, 0F, 0F, 6, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F); // Box 3 cull aww
		bodyModel[409].setRotationPoint(-26.5F, -17F, 10F);

		bodyModel[410].addShapeBox(0F, 0F, 0F, 6, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 5
		bodyModel[410].setRotationPoint(-26.5F, -18F, 10F);

		bodyModel[411].addBox(0F, 0F, 0F, 8, 2, 7, 0F); // Box 196 winterization hatch
		bodyModel[411].setRotationPoint(15F, -22.5F, -3.5F);

		bodyModel[412].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 418
		bodyModel[412].setRotationPoint(46.5F, 0F, 0F);

		bodyModel[413].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 419
		bodyModel[413].setRotationPoint(46.5F, 0F, -7F);

		bodyModel[414].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 420 cull
		bodyModel[414].setRotationPoint(-29F, -21.5F, -9F);

		bodyModel[415].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 421 prime base
		bodyModel[415].setRotationPoint(-28.5F, -22.5F, -9F);

		bodyModel[416].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F); // Box 6 PRIME2-1
		bodyModel[416].setRotationPoint(-28.5F, -23F, -9F);

		bodyModel[417].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F); // Box 7 PRIME2-3
		bodyModel[417].setRotationPoint(-28.5F, -23F, -9F);

		bodyModel[418].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 8 PRIME2-2
		bodyModel[418].setRotationPoint(-28.5F, -23F, -9F);

		bodyModel[419].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 9 PRIME2-4
		bodyModel[419].setRotationPoint(-28.5F, -23F, -9F);

		bodyModel[420].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 421 prime base
		bodyModel[420].setRotationPoint(-30.5F, -22F, -1F);

		bodyModel[421].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F); // Box 6 PRIME3-1
		bodyModel[421].setRotationPoint(-30.5F, -22.5F, -1F);

		bodyModel[422].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F); // Box 7 PRIME3-3
		bodyModel[422].setRotationPoint(-30.5F, -22.5F, -1F);

		bodyModel[423].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 8 PRIME3-2
		bodyModel[423].setRotationPoint(-30.5F, -22.5F, -1F);

		bodyModel[424].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 9 PRIME3-4
		bodyModel[424].setRotationPoint(-30.5F, -22.5F, -1F);

		bodyModel[425].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 136
		bodyModel[425].setRotationPoint(-14F, 3.5F, -11F);

		bodyModel[426].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 287
		bodyModel[426].setRotationPoint(-14F, 2F, -11F);

		bodyModel[427].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F); // Box 288
		bodyModel[427].setRotationPoint(-14F, 3F, -11F);

		bodyModel[428].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 289
		bodyModel[428].setRotationPoint(-13.5F, 3.5F, -10.5F);
	}
	ModelFlexicoil_C2H theTrucks = new ModelFlexicoil_C2H();
	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		for (int i = 0; i < 429; i++) {
			if (bodyModel[i].boxName != null && bodyModel[i].boxName.contains("lamp")) {
				Minecraft.getMinecraft().entityRenderer.disableLightmap(1D);
				bodyModel[i].render(f5);
				Minecraft.getMinecraft().entityRenderer.enableLightmap(1D);
			} else {
				bodyModel[i].render(f5);
			}
		}
		if (entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor() == 15) {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/flexicoil_c2h_Blue.png"));
		} else if (entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor() == 4 ||entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor() == 5) {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/flexicoil_c2h_Grey.png"));
		} else if (entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor() == 6 ) {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/flexicoil_c2h_BeanSniff.png"));
		} else {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/flexicoil_c2h_Black.png"));
		}
		GL11.glPushMatrix();
		GL11.glTranslatef(-2F, 0.0F, 0F);
		theTrucks.render(entity, f, f1, f2, f3, f4, f5);
		GL11.glPopMatrix();

		GL11.glPushMatrix();
		GL11.glRotatef(180, 0, 1, 0);
		GL11.glTranslated(-1.95F, 0.0F, 0);
		theTrucks.render(entity, f, f1, f2, f3, f4, f5);
		GL11.glPopMatrix();
	}
	public ArrayList<double[]> getSmokePosition() {
		return new ArrayList<double[]>() {
			{
				add(new double[]{2.25D, 1.4D, 0.0D});
			}
		};
	}
}//