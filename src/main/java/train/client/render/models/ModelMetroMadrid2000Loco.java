//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2022 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator:
// Created on:20.05.2022 - 20:57:41
// Last changed on: 20.05.2022 - 20:57:41

package train.client.render.models;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;

import org.lwjgl.opengl.GL11;
import tmt.ModelBase;
import tmt.ModelRendererTurbo;

public class ModelMetroMadrid2000Loco extends ModelBase
{
	int textureX = 512;
	int textureY = 256;

	public ModelMetroMadrid2000Loco()
	{
		metromadrid2000locoModel = new ModelRendererTurbo[355];
		metromadrid2000locoModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 44
		metromadrid2000locoModel[1] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 171
		metromadrid2000locoModel[2] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 277
		metromadrid2000locoModel[3] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 278
		metromadrid2000locoModel[4] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 32
		metromadrid2000locoModel[5] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 33
		metromadrid2000locoModel[6] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 174
		metromadrid2000locoModel[7] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 175
		metromadrid2000locoModel[8] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 182
		metromadrid2000locoModel[9] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 183
		metromadrid2000locoModel[10] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 184
		metromadrid2000locoModel[11] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 185
		metromadrid2000locoModel[12] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 93
		metromadrid2000locoModel[13] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 188
		metromadrid2000locoModel[14] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 190
		metromadrid2000locoModel[15] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 192
		metromadrid2000locoModel[16] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 193
		metromadrid2000locoModel[17] = new ModelRendererTurbo(this, 198, 22, textureX, textureY); // Box 194
		metromadrid2000locoModel[18] = new ModelRendererTurbo(this, 233, 17, textureX, textureY); // Box 170
		metromadrid2000locoModel[19] = new ModelRendererTurbo(this, 281, 17, textureX, textureY); // Box 171
		metromadrid2000locoModel[20] = new ModelRendererTurbo(this, 305, 17, textureX, textureY); // Box 183
		metromadrid2000locoModel[21] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 184
		metromadrid2000locoModel[22] = new ModelRendererTurbo(this, 264, 17, textureX, textureY); // Box 201
		metromadrid2000locoModel[23] = new ModelRendererTurbo(this, 368, 1, textureX, textureY); // Box 202
		metromadrid2000locoModel[24] = new ModelRendererTurbo(this, 305, 25, textureX, textureY); // Box 210
		metromadrid2000locoModel[25] = new ModelRendererTurbo(this, 129, 17, textureX, textureY); // Box 229
		metromadrid2000locoModel[26] = new ModelRendererTurbo(this, 425, 17, textureX, textureY); // Box 230
		metromadrid2000locoModel[27] = new ModelRendererTurbo(this, 449, 17, textureX, textureY); // Box 231
		metromadrid2000locoModel[28] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 292
		metromadrid2000locoModel[29] = new ModelRendererTurbo(this, 129, 9, textureX, textureY); // Box 293
		metromadrid2000locoModel[30] = new ModelRendererTurbo(this, 137, 9, textureX, textureY); // Box 294
		metromadrid2000locoModel[31] = new ModelRendererTurbo(this, 193, 9, textureX, textureY); // Box 295
		metromadrid2000locoModel[32] = new ModelRendererTurbo(this, 153, 9, textureX, textureY); // Box 296
		metromadrid2000locoModel[33] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 407
		metromadrid2000locoModel[34] = new ModelRendererTurbo(this, 481, 17, textureX, textureY); // Box 411
		metromadrid2000locoModel[35] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 235
		metromadrid2000locoModel[36] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 236
		metromadrid2000locoModel[37] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 238
		metromadrid2000locoModel[38] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 37
		metromadrid2000locoModel[39] = new ModelRendererTurbo(this, 177, 9, textureX, textureY); // Box 418
		metromadrid2000locoModel[40] = new ModelRendererTurbo(this, 161, 9, textureX, textureY); // Box 419
		metromadrid2000locoModel[41] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 421
		metromadrid2000locoModel[42] = new ModelRendererTurbo(this, 217, 9, textureX, textureY); // Box 275
		metromadrid2000locoModel[43] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 281
		metromadrid2000locoModel[44] = new ModelRendererTurbo(this, 497, 17, textureX, textureY); // Box 292
		metromadrid2000locoModel[45] = new ModelRendererTurbo(this, 9, 33, textureX, textureY); // Box 293
		metromadrid2000locoModel[46] = new ModelRendererTurbo(this, 41, 33, textureX, textureY); // Box 294
		metromadrid2000locoModel[47] = new ModelRendererTurbo(this, 57, 33, textureX, textureY); // Box 295
		metromadrid2000locoModel[48] = new ModelRendererTurbo(this, 73, 33, textureX, textureY); // Box 296
		metromadrid2000locoModel[49] = new ModelRendererTurbo(this, 73, 33, textureX, textureY); // Box 297
		metromadrid2000locoModel[50] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 298
		metromadrid2000locoModel[51] = new ModelRendererTurbo(this, 409, 9, textureX, textureY); // Box 299
		metromadrid2000locoModel[52] = new ModelRendererTurbo(this, 129, 25, textureX, textureY); // Box 300
		metromadrid2000locoModel[53] = new ModelRendererTurbo(this, 105, 33, textureX, textureY); // Box 305
		metromadrid2000locoModel[54] = new ModelRendererTurbo(this, 169, 33, textureX, textureY); // Box 306
		metromadrid2000locoModel[55] = new ModelRendererTurbo(this, 465, 25, textureX, textureY); // Box 307
		metromadrid2000locoModel[56] = new ModelRendererTurbo(this, 185, 33, textureX, textureY); // Box 308
		metromadrid2000locoModel[57] = new ModelRendererTurbo(this, 201, 33, textureX, textureY); // Box 309
		metromadrid2000locoModel[58] = new ModelRendererTurbo(this, 201, 33, textureX, textureY); // Box 310
		metromadrid2000locoModel[59] = new ModelRendererTurbo(this, 297, 33, textureX, textureY); // Box 311
		metromadrid2000locoModel[60] = new ModelRendererTurbo(this, 233, 33, textureX, textureY); // Box 312
		metromadrid2000locoModel[61] = new ModelRendererTurbo(this, 329, 33, textureX, textureY); // Box 313
		metromadrid2000locoModel[62] = new ModelRendererTurbo(this, 345, 33, textureX, textureY); // Box 314
		metromadrid2000locoModel[63] = new ModelRendererTurbo(this, 369, 33, textureX, textureY); // Box 315
		metromadrid2000locoModel[64] = new ModelRendererTurbo(this, 361, 33, textureX, textureY); // Box 316
		metromadrid2000locoModel[65] = new ModelRendererTurbo(this, 393, 33, textureX, textureY); // Box 317
		metromadrid2000locoModel[66] = new ModelRendererTurbo(this, 385, 33, textureX, textureY); // Box 318
		metromadrid2000locoModel[67] = new ModelRendererTurbo(this, 401, 41, textureX, textureY); // Box 319
		metromadrid2000locoModel[68] = new ModelRendererTurbo(this, 121, 33, textureX, textureY); // Box 320
		metromadrid2000locoModel[69] = new ModelRendererTurbo(this, 289, 17, textureX, textureY); // Box 321
		metromadrid2000locoModel[70] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 332
		metromadrid2000locoModel[71] = new ModelRendererTurbo(this, 449, 34, textureX, textureY); // Box 333
		metromadrid2000locoModel[72] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 334
		metromadrid2000locoModel[73] = new ModelRendererTurbo(this, 489, 33, textureX, textureY); // Box 360
		metromadrid2000locoModel[74] = new ModelRendererTurbo(this, 129, 49, textureX, textureY); // Box 369
		metromadrid2000locoModel[75] = new ModelRendererTurbo(this, 73, 41, textureX, textureY); // Box 386
		metromadrid2000locoModel[76] = new ModelRendererTurbo(this, 152, 49, textureX, textureY); // Box 387
		metromadrid2000locoModel[77] = new ModelRendererTurbo(this, 201, 41, textureX, textureY); // Box 388
		metromadrid2000locoModel[78] = new ModelRendererTurbo(this, 49, 49, textureX, textureY); // Box 394
		metromadrid2000locoModel[79] = new ModelRendererTurbo(this, 233, 49, textureX, textureY); // Box 395
		metromadrid2000locoModel[80] = new ModelRendererTurbo(this, 441, 49, textureX, textureY); // Box 396
		metromadrid2000locoModel[81] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 399
		metromadrid2000locoModel[82] = new ModelRendererTurbo(this, 433, 41, textureX, textureY); // Box 93
		metromadrid2000locoModel[83] = new ModelRendererTurbo(this, 457, 41, textureX, textureY); // Box 94
		metromadrid2000locoModel[84] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 404
		metromadrid2000locoModel[85] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 405
		metromadrid2000locoModel[86] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 406
		metromadrid2000locoModel[87] = new ModelRendererTurbo(this, 89, 33, textureX, textureY); // Box 407
		metromadrid2000locoModel[88] = new ModelRendererTurbo(this, 81, 57, textureX, textureY); // Box 421
		metromadrid2000locoModel[89] = new ModelRendererTurbo(this, 441, 9, textureX, textureY); // Box 422
		metromadrid2000locoModel[90] = new ModelRendererTurbo(this, 273, 57, textureX, textureY); // Box 423
		metromadrid2000locoModel[91] = new ModelRendererTurbo(this, 313, 57, textureX, textureY); // Box 424
		metromadrid2000locoModel[92] = new ModelRendererTurbo(this, 217, 25, textureX, textureY); // Box 425
		metromadrid2000locoModel[93] = new ModelRendererTurbo(this, 217, 33, textureX, textureY); // Box 428
		metromadrid2000locoModel[94] = new ModelRendererTurbo(this, 145, 9, textureX, textureY); // Box 429
		metromadrid2000locoModel[95] = new ModelRendererTurbo(this, 249, 17, textureX, textureY); // Box 430
		metromadrid2000locoModel[96] = new ModelRendererTurbo(this, 345, 57, textureX, textureY); // Box 443
		metromadrid2000locoModel[97] = new ModelRendererTurbo(this, 49, 65, textureX, textureY); // Box 444
		metromadrid2000locoModel[98] = new ModelRendererTurbo(this, 345, 33, textureX, textureY); // Box 445
		metromadrid2000locoModel[99] = new ModelRendererTurbo(this, 89, 65, textureX, textureY); // Box 446
		metromadrid2000locoModel[100] = new ModelRendererTurbo(this, 409, 33, textureX, textureY); // Box 447
		metromadrid2000locoModel[101] = new ModelRendererTurbo(this, 449, 17, textureX, textureY); // Box 219
		metromadrid2000locoModel[102] = new ModelRendererTurbo(this, 473, 17, textureX, textureY); // Box 220
		metromadrid2000locoModel[103] = new ModelRendererTurbo(this, 169, 65, textureX, textureY); // Box 219
		metromadrid2000locoModel[104] = new ModelRendererTurbo(this, 177, 49, textureX, textureY); // Box 221
		metromadrid2000locoModel[105] = new ModelRendererTurbo(this, 505, 33, textureX, textureY); // Box 223
		metromadrid2000locoModel[106] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 225
		metromadrid2000locoModel[107] = new ModelRendererTurbo(this, 377, 57, textureX, textureY); // Box 226
		metromadrid2000locoModel[108] = new ModelRendererTurbo(this, 201, 65, textureX, textureY); // Box 227
		metromadrid2000locoModel[109] = new ModelRendererTurbo(this, 193, 49, textureX, textureY); // Box 231
		metromadrid2000locoModel[110] = new ModelRendererTurbo(this, 393, 49, textureX, textureY); // Box 232
		metromadrid2000locoModel[111] = new ModelRendererTurbo(this, 505, 49, textureX, textureY); // Box 234
		metromadrid2000locoModel[112] = new ModelRendererTurbo(this, 217, 65, textureX, textureY); // Box 235
		metromadrid2000locoModel[113] = new ModelRendererTurbo(this, 41, 41, textureX, textureY); // Box 236
		metromadrid2000locoModel[114] = new ModelRendererTurbo(this, 481, 17, textureX, textureY); // Box 237
		metromadrid2000locoModel[115] = new ModelRendererTurbo(this, 313, 33, textureX, textureY); // Box 238
		metromadrid2000locoModel[116] = new ModelRendererTurbo(this, 105, 33, textureX, textureY); // Box 239
		metromadrid2000locoModel[117] = new ModelRendererTurbo(this, 169, 33, textureX, textureY); // Box 240
		metromadrid2000locoModel[118] = new ModelRendererTurbo(this, 401, 33, textureX, textureY); // Box 241
		metromadrid2000locoModel[119] = new ModelRendererTurbo(this, 249, 33, textureX, textureY); // Box 242
		metromadrid2000locoModel[120] = new ModelRendererTurbo(this, 273, 49, textureX, textureY); // Box 243
		metromadrid2000locoModel[121] = new ModelRendererTurbo(this, 265, 33, textureX, textureY); // Box 244
		metromadrid2000locoModel[122] = new ModelRendererTurbo(this, 273, 33, textureX, textureY); // Box 245
		metromadrid2000locoModel[123] = new ModelRendererTurbo(this, 281, 65, textureX, textureY); // Box 246
		metromadrid2000locoModel[124] = new ModelRendererTurbo(this, 289, 65, textureX, textureY); // Box 247
		metromadrid2000locoModel[125] = new ModelRendererTurbo(this, 305, 65, textureX, textureY); // Box 248
		metromadrid2000locoModel[126] = new ModelRendererTurbo(this, 321, 65, textureX, textureY); // Box 249
		metromadrid2000locoModel[127] = new ModelRendererTurbo(this, 337, 65, textureX, textureY); // Box 250
		metromadrid2000locoModel[128] = new ModelRendererTurbo(this, 353, 65, textureX, textureY); // Box 251
		metromadrid2000locoModel[129] = new ModelRendererTurbo(this, 393, 65, textureX, textureY); // Box 252
		metromadrid2000locoModel[130] = new ModelRendererTurbo(this, 281, 49, textureX, textureY); // Box 253
		metromadrid2000locoModel[131] = new ModelRendererTurbo(this, 489, 58, textureX, textureY); // Box 254
		metromadrid2000locoModel[132] = new ModelRendererTurbo(this, 409, 65, textureX, textureY); // Box 255
		metromadrid2000locoModel[133] = new ModelRendererTurbo(this, 273, 57, textureX, textureY); // Box 256
		metromadrid2000locoModel[134] = new ModelRendererTurbo(this, 401, 49, textureX, textureY); // Box 257
		metromadrid2000locoModel[135] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 258
		metromadrid2000locoModel[136] = new ModelRendererTurbo(this, 433, 49, textureX, textureY); // Box 259
		metromadrid2000locoModel[137] = new ModelRendererTurbo(this, 113, 57, textureX, textureY); // Box 260
		metromadrid2000locoModel[138] = new ModelRendererTurbo(this, 345, 33, textureX, textureY); // Box 261
		metromadrid2000locoModel[139] = new ModelRendererTurbo(this, 449, 49, textureX, textureY); // Box 262
		metromadrid2000locoModel[140] = new ModelRendererTurbo(this, 361, 33, textureX, textureY); // Box 263
		metromadrid2000locoModel[141] = new ModelRendererTurbo(this, 9, 57, textureX, textureY); // Box 264
		metromadrid2000locoModel[142] = new ModelRendererTurbo(this, 385, 33, textureX, textureY); // Box 265
		metromadrid2000locoModel[143] = new ModelRendererTurbo(this, 481, 41, textureX, textureY); // Box 266
		metromadrid2000locoModel[144] = new ModelRendererTurbo(this, 49, 65, textureX, textureY); // Box 267
		metromadrid2000locoModel[145] = new ModelRendererTurbo(this, 369, 65, textureX, textureY); // Box 268
		metromadrid2000locoModel[146] = new ModelRendererTurbo(this, 409, 33, textureX, textureY); // Box 269
		metromadrid2000locoModel[147] = new ModelRendererTurbo(this, 41, 57, textureX, textureY); // Box 270
		metromadrid2000locoModel[148] = new ModelRendererTurbo(this, 89, 49, textureX, textureY); // Box 271
		metromadrid2000locoModel[149] = new ModelRendererTurbo(this, 73, 66, textureX, textureY); // Box 272
		metromadrid2000locoModel[150] = new ModelRendererTurbo(this, 417, 33, textureX, textureY); // Box 273
		metromadrid2000locoModel[151] = new ModelRendererTurbo(this, 465, 33, textureX, textureY); // Box 274
		metromadrid2000locoModel[152] = new ModelRendererTurbo(this, 97, 73, textureX, textureY); // Box 275
		metromadrid2000locoModel[153] = new ModelRendererTurbo(this, 233, 73, textureX, textureY); // Box 276
		metromadrid2000locoModel[154] = new ModelRendererTurbo(this, 89, 65, textureX, textureY); // Box 277
		metromadrid2000locoModel[155] = new ModelRendererTurbo(this, 473, 33, textureX, textureY); // Box 278
		metromadrid2000locoModel[156] = new ModelRendererTurbo(this, 481, 65, textureX, textureY); // Box 279
		metromadrid2000locoModel[157] = new ModelRendererTurbo(this, 105, 49, textureX, textureY); // Box 280
		metromadrid2000locoModel[158] = new ModelRendererTurbo(this, 481, 33, textureX, textureY); // Box 281
		metromadrid2000locoModel[159] = new ModelRendererTurbo(this, 353, 66, textureX, textureY); // Box 282
		metromadrid2000locoModel[160] = new ModelRendererTurbo(this, 489, 33, textureX, textureY); // Box 283
		metromadrid2000locoModel[161] = new ModelRendererTurbo(this, 409, 73, textureX, textureY); // Box 284
		metromadrid2000locoModel[162] = new ModelRendererTurbo(this, 441, 73, textureX, textureY); // Box 288
		metromadrid2000locoModel[163] = new ModelRendererTurbo(this, 377, 73, textureX, textureY); // Box 290
		metromadrid2000locoModel[164] = new ModelRendererTurbo(this, 489, 73, textureX, textureY); // Box 291
		metromadrid2000locoModel[165] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 292
		metromadrid2000locoModel[166] = new ModelRendererTurbo(this, 385, 73, textureX, textureY); // Box 295
		metromadrid2000locoModel[167] = new ModelRendererTurbo(this, 17, 81, textureX, textureY); // Box 296
		metromadrid2000locoModel[168] = new ModelRendererTurbo(this, 473, 73, textureX, textureY); // Box 297
		metromadrid2000locoModel[169] = new ModelRendererTurbo(this, 49, 81, textureX, textureY); // Box 299
		metromadrid2000locoModel[170] = new ModelRendererTurbo(this, 65, 81, textureX, textureY); // Box 300
		metromadrid2000locoModel[171] = new ModelRendererTurbo(this, 505, 73, textureX, textureY); // Box 302
		metromadrid2000locoModel[172] = new ModelRendererTurbo(this, 81, 81, textureX, textureY); // Box 303
		metromadrid2000locoModel[173] = new ModelRendererTurbo(this, 89, 81, textureX, textureY); // Box 306
		metromadrid2000locoModel[174] = new ModelRendererTurbo(this, 417, 81, textureX, textureY); // Box 1
		metromadrid2000locoModel[175] = new ModelRendererTurbo(this, 289, 65, textureX, textureY); // Box 4
		metromadrid2000locoModel[176] = new ModelRendererTurbo(this, 321, 65, textureX, textureY); // Box 5
		metromadrid2000locoModel[177] = new ModelRendererTurbo(this, 233, 49, textureX, textureY); // Box 13
		metromadrid2000locoModel[178] = new ModelRendererTurbo(this, 297, 49, textureX, textureY); // Box 14
		metromadrid2000locoModel[179] = new ModelRendererTurbo(this, 113, 81, textureX, textureY); // Box 16
		metromadrid2000locoModel[180] = new ModelRendererTurbo(this, 49, 41, textureX, textureY); // Box 28
		metromadrid2000locoModel[181] = new ModelRendererTurbo(this, 113, 81, textureX, textureY); // Box 35
		metromadrid2000locoModel[182] = new ModelRendererTurbo(this, 409, 41, textureX, textureY); // Box 39
		metromadrid2000locoModel[183] = new ModelRendererTurbo(this, 113, 49, textureX, textureY); // Box 41
		metromadrid2000locoModel[184] = new ModelRendererTurbo(this, 329, 49, textureX, textureY); // Box 45
		metromadrid2000locoModel[185] = new ModelRendererTurbo(this, 305, 57, textureX, textureY); // Box 46
		metromadrid2000locoModel[186] = new ModelRendererTurbo(this, 137, 81, textureX, textureY); // Box 47
		metromadrid2000locoModel[187] = new ModelRendererTurbo(this, 489, 57, textureX, textureY); // Box 49
		metromadrid2000locoModel[188] = new ModelRendererTurbo(this, 233, 73, textureX, textureY); // Box 56
		metromadrid2000locoModel[189] = new ModelRendererTurbo(this, 393, 73, textureX, textureY); // Box 57
		metromadrid2000locoModel[190] = new ModelRendererTurbo(this, 161, 65, textureX, textureY); // Box 58
		metromadrid2000locoModel[191] = new ModelRendererTurbo(this, 217, 65, textureX, textureY); // Box 59
		metromadrid2000locoModel[192] = new ModelRendererTurbo(this, 409, 49, textureX, textureY); // Box 60
		metromadrid2000locoModel[193] = new ModelRendererTurbo(this, 489, 65, textureX, textureY); // Box 61
		metromadrid2000locoModel[194] = new ModelRendererTurbo(this, 289, 49, textureX, textureY); // Box 62
		metromadrid2000locoModel[195] = new ModelRendererTurbo(this, 441, 49, textureX, textureY); // Box 63
		metromadrid2000locoModel[196] = new ModelRendererTurbo(this, 153, 81, textureX, textureY); // Box 41
		metromadrid2000locoModel[197] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 42
		metromadrid2000locoModel[198] = new ModelRendererTurbo(this, 169, 81, textureX, textureY); // Box 43
		metromadrid2000locoModel[199] = new ModelRendererTurbo(this, 81, 65, textureX, textureY); // Box 44
		metromadrid2000locoModel[200] = new ModelRendererTurbo(this, 473, 65, textureX, textureY); // Box 45
		metromadrid2000locoModel[201] = new ModelRendererTurbo(this, 185, 81, textureX, textureY); // Box 45
		metromadrid2000locoModel[202] = new ModelRendererTurbo(this, 201, 81, textureX, textureY); // Box 46
		metromadrid2000locoModel[203] = new ModelRendererTurbo(this, 257, 81, textureX, textureY); // Box 43
		metromadrid2000locoModel[204] = new ModelRendererTurbo(this, 265, 81, textureX, textureY); // Box 44
		metromadrid2000locoModel[205] = new ModelRendererTurbo(this, 281, 81, textureX, textureY); // Box 45
		metromadrid2000locoModel[206] = new ModelRendererTurbo(this, 65, 73, textureX, textureY); // Box 46
		metromadrid2000locoModel[207] = new ModelRendererTurbo(this, 297, 81, textureX, textureY); // Box 47
		metromadrid2000locoModel[208] = new ModelRendererTurbo(this, 305, 81, textureX, textureY); // Box 48
		metromadrid2000locoModel[209] = new ModelRendererTurbo(this, 121, 57, textureX, textureY); // Box 53
		metromadrid2000locoModel[210] = new ModelRendererTurbo(this, 505, 65, textureX, textureY); // Box 54
		metromadrid2000locoModel[211] = new ModelRendererTurbo(this, 417, 81, textureX, textureY); // Box 57
		metromadrid2000locoModel[212] = new ModelRendererTurbo(this, 417, 81, textureX, textureY); // Box 58
		metromadrid2000locoModel[213] = new ModelRendererTurbo(this, 417, 81, textureX, textureY); // Box 59
		metromadrid2000locoModel[214] = new ModelRendererTurbo(this, 89, 73, textureX, textureY); // Box 58
		metromadrid2000locoModel[215] = new ModelRendererTurbo(this, 105, 73, textureX, textureY); // Box 59
		metromadrid2000locoModel[216] = new ModelRendererTurbo(this, 369, 73, textureX, textureY); // Box 60
		metromadrid2000locoModel[217] = new ModelRendererTurbo(this, 433, 81, textureX, textureY); // Box 61
		metromadrid2000locoModel[218] = new ModelRendererTurbo(this, 481, 81, textureX, textureY); // Box 62
		metromadrid2000locoModel[219] = new ModelRendererTurbo(this, 97, 89, textureX, textureY); // Box 63
		metromadrid2000locoModel[220] = new ModelRendererTurbo(this, 105, 89, textureX, textureY); // Box 64
		metromadrid2000locoModel[221] = new ModelRendererTurbo(this, 113, 89, textureX, textureY); // Box 65
		metromadrid2000locoModel[222] = new ModelRendererTurbo(this, 121, 89, textureX, textureY); // Box 66
		metromadrid2000locoModel[223] = new ModelRendererTurbo(this, 145, 89, textureX, textureY); // Box 362
		metromadrid2000locoModel[224] = new ModelRendererTurbo(this, 185, 89, textureX, textureY); // Box 363
		metromadrid2000locoModel[225] = new ModelRendererTurbo(this, 217, 89, textureX, textureY); // Box 364
		metromadrid2000locoModel[226] = new ModelRendererTurbo(this, 137, 89, textureX, textureY); // Box 367
		metromadrid2000locoModel[227] = new ModelRendererTurbo(this, 233, 89, textureX, textureY); // Box 368
		metromadrid2000locoModel[228] = new ModelRendererTurbo(this, 177, 89, textureX, textureY); // Box 369
		metromadrid2000locoModel[229] = new ModelRendererTurbo(this, 249, 89, textureX, textureY); // Box 370
		metromadrid2000locoModel[230] = new ModelRendererTurbo(this, 265, 89, textureX, textureY); // Box 371
		metromadrid2000locoModel[231] = new ModelRendererTurbo(this, 281, 89, textureX, textureY); // Box 372
		metromadrid2000locoModel[232] = new ModelRendererTurbo(this, 297, 89, textureX, textureY); // Box 373
		metromadrid2000locoModel[233] = new ModelRendererTurbo(this, 313, 89, textureX, textureY); // Box 374
		metromadrid2000locoModel[234] = new ModelRendererTurbo(this, 329, 89, textureX, textureY); // Box 375
		metromadrid2000locoModel[235] = new ModelRendererTurbo(this, 345, 89, textureX, textureY); // Box 376
		metromadrid2000locoModel[236] = new ModelRendererTurbo(this, 361, 89, textureX, textureY); // Box 377
		metromadrid2000locoModel[237] = new ModelRendererTurbo(this, 377, 89, textureX, textureY); // Box 378
		metromadrid2000locoModel[238] = new ModelRendererTurbo(this, 393, 89, textureX, textureY); // Box 379
		metromadrid2000locoModel[239] = new ModelRendererTurbo(this, 409, 89, textureX, textureY); // Box 380
		metromadrid2000locoModel[240] = new ModelRendererTurbo(this, 425, 89, textureX, textureY); // Box 381
		metromadrid2000locoModel[241] = new ModelRendererTurbo(this, 441, 89, textureX, textureY); // Box 382
		metromadrid2000locoModel[242] = new ModelRendererTurbo(this, 457, 89, textureX, textureY); // Box 383
		metromadrid2000locoModel[243] = new ModelRendererTurbo(this, 473, 89, textureX, textureY); // Box 384
		metromadrid2000locoModel[244] = new ModelRendererTurbo(this, 489, 89, textureX, textureY); // Box 385
		metromadrid2000locoModel[245] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 386
		metromadrid2000locoModel[246] = new ModelRendererTurbo(this, 17, 97, textureX, textureY); // Box 387
		metromadrid2000locoModel[247] = new ModelRendererTurbo(this, 33, 97, textureX, textureY); // Box 388
		metromadrid2000locoModel[248] = new ModelRendererTurbo(this, 49, 97, textureX, textureY); // Box 389
		metromadrid2000locoModel[249] = new ModelRendererTurbo(this, 65, 97, textureX, textureY); // Box 397
		metromadrid2000locoModel[250] = new ModelRendererTurbo(this, 97, 97, textureX, textureY); // Box 398
		metromadrid2000locoModel[251] = new ModelRendererTurbo(this, 345, 97, textureX, textureY); // Box 399
		metromadrid2000locoModel[252] = new ModelRendererTurbo(this, 129, 105, textureX, textureY); // Box 400
		metromadrid2000locoModel[253] = new ModelRendererTurbo(this, 265, 97, textureX, textureY); // Box 401
		metromadrid2000locoModel[254] = new ModelRendererTurbo(this, 209, 89, textureX, textureY); // Lamp 2
		metromadrid2000locoModel[255] = new ModelRendererTurbo(this, 505, 89, textureX, textureY); // Box 223
		metromadrid2000locoModel[256] = new ModelRendererTurbo(this, 129, 97, textureX, textureY); // Box 83
		metromadrid2000locoModel[257] = new ModelRendererTurbo(this, 297, 97, textureX, textureY); // Box 52
		metromadrid2000locoModel[258] = new ModelRendererTurbo(this, 393, 97, textureX, textureY); // Box 413
		metromadrid2000locoModel[259] = new ModelRendererTurbo(this, 137, 97, textureX, textureY); // Lamp 4
		metromadrid2000locoModel[260] = new ModelRendererTurbo(this, 265, 97, textureX, textureY); // Box 415
		metromadrid2000locoModel[261] = new ModelRendererTurbo(this, 297, 105, textureX, textureY); // Box 424
		metromadrid2000locoModel[262] = new ModelRendererTurbo(this, 306, 106, textureX, textureY); // Box 425
		metromadrid2000locoModel[263] = new ModelRendererTurbo(this, 162, 82, textureX, textureY); // Box 426
		metromadrid2000locoModel[264] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 466
		metromadrid2000locoModel[265] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 467
		metromadrid2000locoModel[266] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 468
		metromadrid2000locoModel[267] = new ModelRendererTurbo(this, 233, 9, textureX, textureY); // Box 469
		metromadrid2000locoModel[268] = new ModelRendererTurbo(this, 161, 17, textureX, textureY); // Box 470
		metromadrid2000locoModel[269] = new ModelRendererTurbo(this, 433, 17, textureX, textureY); // Box 473
		metromadrid2000locoModel[270] = new ModelRendererTurbo(this, 129, 25, textureX, textureY); // Box 287
		metromadrid2000locoModel[271] = new ModelRendererTurbo(this, 433, 25, textureX, textureY); // Box 288
		metromadrid2000locoModel[272] = new ModelRendererTurbo(this, 153, 33, textureX, textureY); // Box 289
		metromadrid2000locoModel[273] = new ModelRendererTurbo(this, 161, 33, textureX, textureY); // Box 290
		metromadrid2000locoModel[274] = new ModelRendererTurbo(this, 41, 41, textureX, textureY); // Box 291
		metromadrid2000locoModel[275] = new ModelRendererTurbo(this, 217, 49, textureX, textureY); // Box 292
		metromadrid2000locoModel[276] = new ModelRendererTurbo(this, 297, 49, textureX, textureY); // Box 289
		metromadrid2000locoModel[277] = new ModelRendererTurbo(this, 409, 41, textureX, textureY); // Box 290
		metromadrid2000locoModel[278] = new ModelRendererTurbo(this, 105, 73, textureX, textureY); // Box 291
		metromadrid2000locoModel[279] = new ModelRendererTurbo(this, 369, 73, textureX, textureY); // Box 292
		metromadrid2000locoModel[280] = new ModelRendererTurbo(this, 265, 81, textureX, textureY); // Box 293
		metromadrid2000locoModel[281] = new ModelRendererTurbo(this, 201, 81, textureX, textureY); // Box 294
		metromadrid2000locoModel[282] = new ModelRendererTurbo(this, 113, 81, textureX, textureY); // Box 295
		metromadrid2000locoModel[283] = new ModelRendererTurbo(this, 441, 49, textureX, textureY); // Box 296
		metromadrid2000locoModel[284] = new ModelRendererTurbo(this, 409, 49, textureX, textureY); // Box 297
		metromadrid2000locoModel[285] = new ModelRendererTurbo(this, 161, 65, textureX, textureY); // Box 298
		metromadrid2000locoModel[286] = new ModelRendererTurbo(this, 113, 81, textureX, textureY); // Box 299
		metromadrid2000locoModel[287] = new ModelRendererTurbo(this, 169, 81, textureX, textureY); // Box 300
		metromadrid2000locoModel[288] = new ModelRendererTurbo(this, 81, 65, textureX, textureY); // Box 301
		metromadrid2000locoModel[289] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 302
		metromadrid2000locoModel[290] = new ModelRendererTurbo(this, 89, 73, textureX, textureY); // Box 303
		metromadrid2000locoModel[291] = new ModelRendererTurbo(this, 49, 41, textureX, textureY); // Box 304
		metromadrid2000locoModel[292] = new ModelRendererTurbo(this, 233, 49, textureX, textureY); // Box 305
		metromadrid2000locoModel[293] = new ModelRendererTurbo(this, 113, 49, textureX, textureY); // Box 306
		metromadrid2000locoModel[294] = new ModelRendererTurbo(this, 417, 81, textureX, textureY); // Box 307
		metromadrid2000locoModel[295] = new ModelRendererTurbo(this, 185, 81, textureX, textureY); // Box 308
		metromadrid2000locoModel[296] = new ModelRendererTurbo(this, 393, 73, textureX, textureY); // Box 309
		metromadrid2000locoModel[297] = new ModelRendererTurbo(this, 233, 73, textureX, textureY); // Box 310
		metromadrid2000locoModel[298] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 311
		metromadrid2000locoModel[299] = new ModelRendererTurbo(this, 153, 81, textureX, textureY); // Box 312
		metromadrid2000locoModel[300] = new ModelRendererTurbo(this, 417, 81, textureX, textureY); // Box 313
		metromadrid2000locoModel[301] = new ModelRendererTurbo(this, 417, 81, textureX, textureY); // Box 314
		metromadrid2000locoModel[302] = new ModelRendererTurbo(this, 473, 65, textureX, textureY); // Box 315
		metromadrid2000locoModel[303] = new ModelRendererTurbo(this, 481, 81, textureX, textureY); // Box 316
		metromadrid2000locoModel[304] = new ModelRendererTurbo(this, 137, 81, textureX, textureY); // Box 317
		metromadrid2000locoModel[305] = new ModelRendererTurbo(this, 289, 49, textureX, textureY); // Box 318
		metromadrid2000locoModel[306] = new ModelRendererTurbo(this, 489, 65, textureX, textureY); // Box 319
		metromadrid2000locoModel[307] = new ModelRendererTurbo(this, 217, 65, textureX, textureY); // Box 320
		metromadrid2000locoModel[308] = new ModelRendererTurbo(this, 329, 49, textureX, textureY); // Box 321
		metromadrid2000locoModel[309] = new ModelRendererTurbo(this, 305, 57, textureX, textureY); // Box 322
		metromadrid2000locoModel[310] = new ModelRendererTurbo(this, 97, 89, textureX, textureY); // Box 323
		metromadrid2000locoModel[311] = new ModelRendererTurbo(this, 105, 89, textureX, textureY); // Box 324
		metromadrid2000locoModel[312] = new ModelRendererTurbo(this, 417, 81, textureX, textureY); // Box 325
		metromadrid2000locoModel[313] = new ModelRendererTurbo(this, 321, 65, textureX, textureY); // Box 326
		metromadrid2000locoModel[314] = new ModelRendererTurbo(this, 433, 81, textureX, textureY); // Box 327
		metromadrid2000locoModel[315] = new ModelRendererTurbo(this, 113, 89, textureX, textureY); // Box 328
		metromadrid2000locoModel[316] = new ModelRendererTurbo(this, 289, 65, textureX, textureY); // Box 329
		metromadrid2000locoModel[317] = new ModelRendererTurbo(this, 489, 57, textureX, textureY); // Box 330
		metromadrid2000locoModel[318] = new ModelRendererTurbo(this, 281, 81, textureX, textureY); // Box 333
		metromadrid2000locoModel[319] = new ModelRendererTurbo(this, 113, 89, textureX, textureY); // Box 334
		metromadrid2000locoModel[320] = new ModelRendererTurbo(this, 49, 49, textureX, textureY); // Box 335
		metromadrid2000locoModel[321] = new ModelRendererTurbo(this, 147, 112, textureX, textureY); // Box 336
		metromadrid2000locoModel[322] = new ModelRendererTurbo(this, 185, 89, textureX, textureY); // Box 337
		metromadrid2000locoModel[323] = new ModelRendererTurbo(this, 209, 89, textureX, textureY); // Lamp 1
		metromadrid2000locoModel[324] = new ModelRendererTurbo(this, 297, 105, textureX, textureY); // Box 339
		metromadrid2000locoModel[325] = new ModelRendererTurbo(this, 505, 89, textureX, textureY); // Box 340
		metromadrid2000locoModel[326] = new ModelRendererTurbo(this, 297, 97, textureX, textureY); // Box 341
		metromadrid2000locoModel[327] = new ModelRendererTurbo(this, 265, 97, textureX, textureY); // Box 342
		metromadrid2000locoModel[328] = new ModelRendererTurbo(this, 393, 97, textureX, textureY); // Box 343
		metromadrid2000locoModel[329] = new ModelRendererTurbo(this, 137, 97, textureX, textureY); // Lamp3
		metromadrid2000locoModel[330] = new ModelRendererTurbo(this, 129, 97, textureX, textureY); // Box 345
		metromadrid2000locoModel[331] = new ModelRendererTurbo(this, 1, 137, textureX, textureY); // Box 332
		metromadrid2000locoModel[332] = new ModelRendererTurbo(this, 13, 137, textureX, textureY); // Box 333
		metromadrid2000locoModel[333] = new ModelRendererTurbo(this, 419, 99, textureX, textureY); // Box 173
		metromadrid2000locoModel[334] = new ModelRendererTurbo(this, 473, 33, textureX, textureY); // Box 335
		metromadrid2000locoModel[335] = new ModelRendererTurbo(this, 419, 99, textureX, textureY); // Box 336
		metromadrid2000locoModel[336] = new ModelRendererTurbo(this, 473, 33, textureX, textureY); // Box 337
		metromadrid2000locoModel[337] = new ModelRendererTurbo(this, 419, 99, textureX, textureY); // Box 338
		metromadrid2000locoModel[338] = new ModelRendererTurbo(this, 419, 99, textureX, textureY); // Box 339
		metromadrid2000locoModel[339] = new ModelRendererTurbo(this, 419, 99, textureX, textureY); // Box 340
		metromadrid2000locoModel[340] = new ModelRendererTurbo(this, 419, 99, textureX, textureY); // Box 341
		metromadrid2000locoModel[341] = new ModelRendererTurbo(this, 419, 99, textureX, textureY); // Box 342
		metromadrid2000locoModel[342] = new ModelRendererTurbo(this, 419, 99, textureX, textureY); // Box 343
		metromadrid2000locoModel[343] = new ModelRendererTurbo(this, 419, 99, textureX, textureY); // Box 344
		metromadrid2000locoModel[344] = new ModelRendererTurbo(this, 473, 33, textureX, textureY); // Box 345
		metromadrid2000locoModel[345] = new ModelRendererTurbo(this, 419, 99, textureX, textureY); // Box 346
		metromadrid2000locoModel[346] = new ModelRendererTurbo(this, 419, 99, textureX, textureY); // Box 347
		metromadrid2000locoModel[347] = new ModelRendererTurbo(this, 473, 33, textureX, textureY); // Box 348
		metromadrid2000locoModel[348] = new ModelRendererTurbo(this, 419, 99, textureX, textureY); // Box 349
		metromadrid2000locoModel[349] = new ModelRendererTurbo(this, 419, 99, textureX, textureY); // Box 350
		metromadrid2000locoModel[350] = new ModelRendererTurbo(this, 419, 99, textureX, textureY); // Box 351
		metromadrid2000locoModel[351] = new ModelRendererTurbo(this, 419, 99, textureX, textureY); // Box 352
		metromadrid2000locoModel[352] = new ModelRendererTurbo(this, 1, 111, textureX, textureY); // Box 353
		metromadrid2000locoModel[353] = new ModelRendererTurbo(this, 1, 111, textureX, textureY); // Box 354
		metromadrid2000locoModel[354] = new ModelRendererTurbo(this, 198, 22, textureX, textureY); // Box 355

		metromadrid2000locoModel[0].addShapeBox(0F, 0F, 0F, 53, 1, 20, 0F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -2.25F, 0F, 0F, -2.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F); // Box 44
		metromadrid2000locoModel[0].setRotationPoint(-27.5F, 4F, -10.5F);

		metromadrid2000locoModel[1].addShapeBox(0F, 0F, 0F, 1, 8, 18, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 171
		metromadrid2000locoModel[1].setRotationPoint(-24F, -4F, -9.5F);

		metromadrid2000locoModel[2].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 277
		metromadrid2000locoModel[2].setRotationPoint(-28.5F, -1F, -6.5F);

		metromadrid2000locoModel[3].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 278
		metromadrid2000locoModel[3].setRotationPoint(-28.5F, -1F, -3.5F);

		metromadrid2000locoModel[4].addBox(0F, 0F, 0F, 6, 1, 2, 0F); // Box 32
		metromadrid2000locoModel[4].setRotationPoint(-35F, 6.5F, -1F);

		metromadrid2000locoModel[5].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 33
		metromadrid2000locoModel[5].setRotationPoint(-36F, 6F, -2F);

		metromadrid2000locoModel[6].addBox(0F, 0F, 0F, 3, 1, 6, 0F); // Box 174
		metromadrid2000locoModel[6].setRotationPoint(-32.8F, -3F, -7F);

		metromadrid2000locoModel[7].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F, -0.5F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 175
		metromadrid2000locoModel[7].setRotationPoint(-33.1F, -5F, -7F);

		metromadrid2000locoModel[8].addShapeBox(0F, 0F, 0F, 1, 5, 2, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 182
		metromadrid2000locoModel[8].setRotationPoint(-26F, -6F, -5.5F);

		metromadrid2000locoModel[9].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 183
		metromadrid2000locoModel[9].setRotationPoint(-26.5F, -5F, -3.5F);

		metromadrid2000locoModel[10].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F); // Box 184
		metromadrid2000locoModel[10].setRotationPoint(-26.5F, -5F, -6.5F);

		metromadrid2000locoModel[11].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 185
		metromadrid2000locoModel[11].setRotationPoint(-28.5F, -1F, -6.5F);

		metromadrid2000locoModel[12].addShapeBox(0F, 0F, 0F, 62, 1, 10, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 1F, 1F, 0F, 1F); // Box 93
		metromadrid2000locoModel[12].setRotationPoint(-31.5F, -16.75F, -4.75F);

		metromadrid2000locoModel[13].addShapeBox(0F, 0F, 0F, 7, 4, 6, 0F, -1F, -0.5F, -3F, 0F, -3F, -3F, 0F, -3F, -2F, -1F, -0.5F, -2F, -1F, -2.5F, -3F, 0F, 0F, -3F, 0F, 0F, -2F, -1F, -2.5F, -2F); // Box 188
		metromadrid2000locoModel[13].setRotationPoint(19.5F, -20.5F, -3.5F);

		metromadrid2000locoModel[14].addShapeBox(0F, 0F, 0F, 7, 4, 6, 0F, 0F, -3.5F, -3F, -1F, -1F, -5F, -1F, -1F, 0F, 0F, -3.5F, -2F, 0F, 0.5F, -3F, -1F, -2F, -5F, -1F, -2F, 0F, 0F, 0.5F, -2F); // Box 190
		metromadrid2000locoModel[14].setRotationPoint(20.5F, -23.5F, -2.5F);

		metromadrid2000locoModel[15].addShapeBox(0F, 0F, 0F, 7, 4, 6, 0F, 0F, -3.5F, -2F, -1F, -1F, 0F, -1F, -1F, -5F, 0F, -3.5F, -3F, 0F, 0.5F, -2F, -1F, -2F, 0F, -1F, -2F, -5F, 0F, 0.5F, -3F); // Box 192
		metromadrid2000locoModel[15].setRotationPoint(20.5F, -23.5F, -3.5F);

		metromadrid2000locoModel[16].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 193
		metromadrid2000locoModel[16].setRotationPoint(26F, -22.5F, -4F);

		metromadrid2000locoModel[17].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 194
		metromadrid2000locoModel[17].setRotationPoint(20F, -20F, -1.5F);

		metromadrid2000locoModel[18].addShapeBox(0F, 0F, 0F, 2, 7, 20, 0F, -0.5F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, -0.4F, -2.3F, 0F, 0F, -1.25F, 0F, 0F, -0.25F, -0.5F, -0.4F, -1.3F); // Box 170
		metromadrid2000locoModel[18].setRotationPoint(-34.5F, -4F, -10.5F);

		metromadrid2000locoModel[19].addShapeBox(0F, 0F, 0F, 2, 11, 13, 0F, -0.5F, 0F, -1.75F, 0F, 0F, -0.75F, 0F, 0F, -1.5F, -0.5F, 0F, -1.5F, -0.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1.5F, -0.5F, 0F, -1.5F); // Box 171
		metromadrid2000locoModel[19].setRotationPoint(-34.5F, -15F, -9.5F);

		metromadrid2000locoModel[20].addShapeBox(0F, 0F, 0F, 62, 2, 2, 0F, 1F, -0.7F, 1.25F, 0F, -0.7F, 1.25F, 0F, -0.25F, 0.5F, 1F, -0.25F, 0.5F, 1F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 1F, 0F, -1.5F); // Box 183
		metromadrid2000locoModel[20].setRotationPoint(-31.5F, -17F, -7.25F);

		metromadrid2000locoModel[21].addShapeBox(0F, 0F, 0F, 62, 2, 2, 0F, 1F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.7F, 1.25F, 1F, -0.7F, 1.25F, 1F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 1F, 0F, 1.5F); // Box 184
		metromadrid2000locoModel[21].setRotationPoint(-31.5F, -17F, 5.25F);

		metromadrid2000locoModel[22].addShapeBox(0F, 0F, 0F, 11, 11, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F); // Box 201
		metromadrid2000locoModel[22].setRotationPoint(-32.5F, -15F, 7.75F);

		metromadrid2000locoModel[23].addShapeBox(0F, 0F, 0F, 6, 8, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 202
		metromadrid2000locoModel[23].setRotationPoint(-27.5F, -4F, 8.5F);

		metromadrid2000locoModel[24].addShapeBox(0F, 0F, 0F, 63, 2, 2, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 210
		metromadrid2000locoModel[24].setRotationPoint(-32.5F, -16F, -7.75F);

		metromadrid2000locoModel[25].addShapeBox(0F, 0F, 0F, 1, 10, 18, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 229
		metromadrid2000locoModel[25].setRotationPoint(-24F, -14F, -9.5F);

		metromadrid2000locoModel[26].addShapeBox(0F, 0F, 0F, 1, 2, 16, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 230
		metromadrid2000locoModel[26].setRotationPoint(-24F, -16F, -9F);

		metromadrid2000locoModel[27].addBox(0F, 0F, 0F, 5, 2, 8, 0F); // Box 231
		metromadrid2000locoModel[27].setRotationPoint(-29.5F, -18.5F, -4F);

		metromadrid2000locoModel[28].addShapeBox(0F, 0F, 0F, 3, 8, 1, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 292
		metromadrid2000locoModel[28].setRotationPoint(-11F, -4F, -8.5F);

		metromadrid2000locoModel[29].addShapeBox(0F, 0F, 0F, 1, 10, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 293
		metromadrid2000locoModel[29].setRotationPoint(-24F, -14F, -8F);

		metromadrid2000locoModel[30].addBox(0F, 0F, 0F, 1, 8, 1, 0F); // Box 294
		metromadrid2000locoModel[30].setRotationPoint(-24F, -4F, -9F);

		metromadrid2000locoModel[31].addShapeBox(0F, 0F, 0F, 1, 10, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 295
		metromadrid2000locoModel[31].setRotationPoint(-24F, -14F, 7F);

		metromadrid2000locoModel[32].addBox(0F, 0F, 0F, 1, 8, 1, 0F); // Box 296
		metromadrid2000locoModel[32].setRotationPoint(-24F, -4F, 8F);

		metromadrid2000locoModel[33].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 407
		metromadrid2000locoModel[33].setRotationPoint(-22.5F, 5F, -1.5F);

		metromadrid2000locoModel[34].addShapeBox(0F, 0F, 0F, 2, 11, 4, 0F, -0.5F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -0.75F, -0.5F, 0F, -1.75F, -0.5F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, -0.5F, 0F, -1F); // Box 411
		metromadrid2000locoModel[34].setRotationPoint(-34.5F, -15F, 5.5F);

		metromadrid2000locoModel[35].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.15F, 0F, -0.35F, -0.45F, 0F, -0.35F, -0.45F, 0F, 0F, -0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 235
		metromadrid2000locoModel[35].setRotationPoint(-30F, -3F, -8F);

		metromadrid2000locoModel[36].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.35F, -0.45F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, -0.35F, -0.45F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 236
		metromadrid2000locoModel[36].setRotationPoint(-31F, -3F, -8F);

		metromadrid2000locoModel[37].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F); // Box 238
		metromadrid2000locoModel[37].setRotationPoint(-30.5F, -3.8F, -8F);

		metromadrid2000locoModel[38].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 37
		metromadrid2000locoModel[38].setRotationPoint(-30.5F, -4.6F, -8F);

		metromadrid2000locoModel[39].addShapeBox(0F, 0F, 0F, 3, 6, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0F, 0F); // Box 418
		metromadrid2000locoModel[39].setRotationPoint(-31.5F, -2F, -8.5F);

		metromadrid2000locoModel[40].addBox(0F, 0F, 0F, 3, 6, 1, 0F); // Box 419
		metromadrid2000locoModel[40].setRotationPoint(-32.5F, -2F, -1F);

		metromadrid2000locoModel[41].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 421
		metromadrid2000locoModel[41].setRotationPoint(-27.5F, 0F, -5F);

		metromadrid2000locoModel[42].addShapeBox(0F, 0F, 0F, 3, 10, 1, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 275
		metromadrid2000locoModel[42].setRotationPoint(-10.99F, -14F, -8F);

		metromadrid2000locoModel[43].addShapeBox(0F, 0F, 0F, 9, 8, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 281
		metromadrid2000locoModel[43].setRotationPoint(16.5F, -4F, 8.5F);

		metromadrid2000locoModel[44].addShapeBox(0F, 0F, 0F, 5, 8, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, -1F, -0.25F); // Box 292
		metromadrid2000locoModel[44].setRotationPoint(-32.5F, -4F, 8.5F);

		metromadrid2000locoModel[45].addShapeBox(0F, 0F, 0F, 5, 1, 17, 0F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 293
		metromadrid2000locoModel[45].setRotationPoint(-32.5F, 4F, -9F);

		metromadrid2000locoModel[46].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 294
		metromadrid2000locoModel[46].setRotationPoint(-32.5F, 3F, 7.5F);

		metromadrid2000locoModel[47].addShapeBox(0F, 0F, 0F, 5, 8, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, -1F, 0.25F); // Box 295
		metromadrid2000locoModel[47].setRotationPoint(-32.5F, -4F, -9.5F);

		metromadrid2000locoModel[48].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F, 0F, 0F, 0.75F, 0F, -1F, 0.75F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 296
		metromadrid2000locoModel[48].setRotationPoint(-32.5F, 3F, -8.5F);

		metromadrid2000locoModel[49].addShapeBox(0F, 0F, 0F, 2, 2, 20, 0F, -0.5F, 0.4F, -2.3F, 0F, 0F, -1.25F, 0F, 0F, -0.25F, -0.5F, 0.4F, -1.3F, -0.5F, -0.25F, -3.25F, 0F, 0F, -2.25F, 0F, 0F, -1.25F, -0.5F, -0.225F, -2.25F); // Box 297
		metromadrid2000locoModel[49].setRotationPoint(-34.5F, 3F, -10.5F);

		metromadrid2000locoModel[50].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 1F, -0.5F, 0F); // Box 298
		metromadrid2000locoModel[50].setRotationPoint(-34.5F, 4.5F, -7F);

		metromadrid2000locoModel[51].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 299
		metromadrid2000locoModel[51].setRotationPoint(-34.5F, 4.5F, 3F);

		metromadrid2000locoModel[52].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F, 1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 1F, -0.5F, 0F); // Box 300
		metromadrid2000locoModel[52].setRotationPoint(-34.5F, 4.5F, -4F);

		metromadrid2000locoModel[53].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F, -0.9F, -0.25F, -1.25F, 0F, -0.25F, -1.25F, 0F, -0.7F, -1F, -0.9F, -0.7F, -1F, 0.5F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -0.75F, 0.5F, 0F, -1.75F); // Box 305
		metromadrid2000locoModel[53].setRotationPoint(-33.5F, -17F, 3.5F);

		metromadrid2000locoModel[54].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F, -0.9F, -0.7F, -1F, 0F, -0.7F, -1F, 0F, -0.25F, -1.25F, -0.9F, -0.25F, -1.25F, 0.5F, 0F, -1.75F, 0F, 0F, -0.75F, 0F, 0F, -1.25F, 0.5F, 0F, -1.25F); // Box 306
		metromadrid2000locoModel[54].setRotationPoint(-33.5F, -17F, -9.5F);

		metromadrid2000locoModel[55].addShapeBox(0F, 0F, 0F, 1, 2, 11, 0F, -0.9F, -0.25F, -1.25F, 0F, -0.25F, -1.25F, 0F, -0.25F, -0.25F, -0.9F, -0.25F, -0.25F, 0.5F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -0.25F, 0.5F, 0F, -0.25F); // Box 307
		metromadrid2000locoModel[55].setRotationPoint(-33.5F, -17F, -6F);

		metromadrid2000locoModel[56].addShapeBox(0F, 0F, 0F, 5, 8, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, -0.5F, 0.25F, 0F, -1F, -0.25F, 0F, 0F, -0.25F); // Box 308
		metromadrid2000locoModel[56].setRotationPoint(25.5F, -4F, 8.5F);

		metromadrid2000locoModel[57].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0.75F, 0F, -1F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 309
		metromadrid2000locoModel[57].setRotationPoint(25.5F, 3F, 7.5F);

		metromadrid2000locoModel[58].addShapeBox(0F, 0F, 0F, 2, 7, 20, 0F, 0F, 0F, -1F, -0.5F, 0F, -2F, -0.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1.25F, -0.5F, -0.25F, -2.3F, -0.5F, -0.25F, -1.3F, 0F, 0F, -0.25F); // Box 310
		metromadrid2000locoModel[58].setRotationPoint(30.5F, -4F, -10.5F);

		metromadrid2000locoModel[59].addShapeBox(0F, 0F, 0F, 2, 2, 20, 0F, 0F, 0F, -1.25F, -0.5F, 0.25F, -2.3F, -0.5F, 0.25F, -1.3F, 0F, 0F, -0.25F, 0F, 0F, -2.25F, -0.5F, -0.5F, -3F, -0.5F, -0.5F, -2F, 0F, 0F, -1.25F); // Box 311
		metromadrid2000locoModel[59].setRotationPoint(30.5F, 3F, -10.5F);

		metromadrid2000locoModel[60].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F, 0F, -1F, 0.75F, 0F, 0F, 0.75F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 312
		metromadrid2000locoModel[60].setRotationPoint(25.5F, 3F, -8.5F);

		metromadrid2000locoModel[61].addShapeBox(0F, 0F, 0F, 5, 8, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -1F, -0.25F, 0F, -0.5F, 0.25F, 0F, 0F, 0.25F); // Box 313
		metromadrid2000locoModel[61].setRotationPoint(25.5F, -4F, -9.5F);

		metromadrid2000locoModel[62].addShapeBox(0F, 0F, 0F, 2, 11, 9, 0F, 0F, 0F, -0.75F, -0.5F, 0F, -1.75F, -0.5F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -2F, 0F, 0F, -2F); // Box 314
		metromadrid2000locoModel[62].setRotationPoint(30.5F, -15F, -9.5F);

		metromadrid2000locoModel[63].addShapeBox(0F, 0F, 0F, 2, 11, 9, 0F, 0F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F, -1.75F, 0F, 0F, -0.75F, 0F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F, -1F, 0F, 0F, 0F); // Box 315
		metromadrid2000locoModel[63].setRotationPoint(30.5F, -15F, 0.5F);

		metromadrid2000locoModel[64].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F, 0F, -0.25F, -1.25F, -0.9F, -0.25F, -1.25F, -0.9F, -0.7F, -1F, 0F, -0.7F, -1F, 0F, 0F, -1.25F, 0.5F, 0F, -1.25F, 0.5F, 0F, -1.75F, 0F, 0F, -0.75F); // Box 316
		metromadrid2000locoModel[64].setRotationPoint(30.5F, -17F, 3.5F);

		metromadrid2000locoModel[65].addShapeBox(0F, 0F, 0F, 1, 2, 11, 0F, 0F, -0.25F, -1.25F, -0.9F, -0.25F, -1.25F, -0.9F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, -1.25F, 0.5F, 0F, -1.25F, 0.5F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 317
		metromadrid2000locoModel[65].setRotationPoint(30.5F, -17F, -6F);

		metromadrid2000locoModel[66].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F, 0F, -0.7F, -1F, -0.9F, -0.7F, -1F, -0.9F, -0.25F, -1.25F, 0F, -0.25F, -1.25F, 0F, 0F, -0.75F, 0.5F, 0F, -1.75F, 0.5F, 0F, -1.25F, 0F, 0F, -1.25F); // Box 318
		metromadrid2000locoModel[66].setRotationPoint(30.5F, -17F, -9.5F);

		metromadrid2000locoModel[67].addShapeBox(0F, 0F, 0F, 5, 1, 17, 0F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 319
		metromadrid2000locoModel[67].setRotationPoint(25.5F, 4F, -9F);

		metromadrid2000locoModel[68].addBox(0F, 0F, 0F, 1, 18, 1, 0F); // Box 320
		metromadrid2000locoModel[68].setRotationPoint(32F, -14F, 3F);

		metromadrid2000locoModel[69].addBox(0F, 0F, 0F, 1, 8, 1, 0F); // Box 321
		metromadrid2000locoModel[69].setRotationPoint(32F, -4F, -4F);

		metromadrid2000locoModel[70].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F, 0F, 1F, -2F, 0F, 1F, -2F, 0F, 1F, 2F, 0F, 1F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 332
		metromadrid2000locoModel[70].setRotationPoint(-8.5F, -15.4F, 4.5F);

		metromadrid2000locoModel[71].addShapeBox(0F, 0F, 0F, 0, 1, 10, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 333
		metromadrid2000locoModel[71].setRotationPoint(-8.5F, -14.4F, -5F);

		metromadrid2000locoModel[72].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F, 0F, 1F, 2F, 0F, 1F, 2F, 0F, 1F, -2F, 0F, 1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 334
		metromadrid2000locoModel[72].setRotationPoint(-8.5F, -15.4F, -5.5F);

		metromadrid2000locoModel[73].addShapeBox(0F, 0F, 0F, 1, 11, 6, 0F, 0F, 0F, -1F, 0.5F, 0F, -1F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0.5F, 0F, -1F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 360
		metromadrid2000locoModel[73].setRotationPoint(-34F, -15F, 1F);

		metromadrid2000locoModel[74].addShapeBox(0F, 0F, 0F, 9, 8, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 369
		metromadrid2000locoModel[74].setRotationPoint(16.5F, -4F, -9.5F);

		metromadrid2000locoModel[75].addShapeBox(0F, 0F, 0F, 6, 8, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 386
		metromadrid2000locoModel[75].setRotationPoint(-15.5F, -4F, -9.5F);

		metromadrid2000locoModel[76].addShapeBox(0F, 0F, 0F, 11, 11, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 387
		metromadrid2000locoModel[76].setRotationPoint(-32.5F, -15F, -8.75F);

		metromadrid2000locoModel[77].addShapeBox(0F, 0F, 0F, 6, 8, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 388
		metromadrid2000locoModel[77].setRotationPoint(-27.5F, -4F, -9.5F);

		metromadrid2000locoModel[78].addShapeBox(0F, 0F, 0F, 5, 5, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 394
		metromadrid2000locoModel[78].setRotationPoint(-10.5F, 5F, 0F);

		metromadrid2000locoModel[79].addShapeBox(0F, 0F, 0F, 9, 3, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 395
		metromadrid2000locoModel[79].setRotationPoint(-3F, -19.5F, -7F);

		metromadrid2000locoModel[80].addBox(0F, 0F, 0F, 16, 3, 12, 0F); // Box 396
		metromadrid2000locoModel[80].setRotationPoint(-19.5F, -19F, -6F);

		metromadrid2000locoModel[81].addBox(0F, 0F, 0F, 1, 2, 13, 0F); // Box 399
		metromadrid2000locoModel[81].setRotationPoint(17.5F, -18.5F, -6.5F);

		metromadrid2000locoModel[82].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F, 0F, 1F, -1F, 0F, 1F, -1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 93
		metromadrid2000locoModel[82].setRotationPoint(18.5F, -17.5F, -7.5F);

		metromadrid2000locoModel[83].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F, -1F, 0F, 1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 94
		metromadrid2000locoModel[83].setRotationPoint(18.5F, -17.5F, 6.5F);

		metromadrid2000locoModel[84].addBox(0F, 0F, 0F, 1, 2, 13, 0F); // Box 404
		metromadrid2000locoModel[84].setRotationPoint(28.5F, -18.5F, -6.5F);

		metromadrid2000locoModel[85].addBox(0F, 0F, 0F, 11, 3, 12, 0F); // Box 405
		metromadrid2000locoModel[85].setRotationPoint(6.5F, -19F, -6F);

		metromadrid2000locoModel[86].addShapeBox(0F, 0F, 0F, 1, 10, 0, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 406
		metromadrid2000locoModel[86].setRotationPoint(-35F, -8F, 2.5F);

		metromadrid2000locoModel[87].addShapeBox(0F, 0F, 0F, 1, 10, 0, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 407
		metromadrid2000locoModel[87].setRotationPoint(-35F, -8F, 8F);

		metromadrid2000locoModel[88].addBox(0F, 0F, 0F, 12, 3, 2, 0F); // Box 421
		metromadrid2000locoModel[88].setRotationPoint(-8.5F, 1F, 6.5F);

		metromadrid2000locoModel[89].addShapeBox(0F, -3F, 0F, 1, 2, 3, 0F, 0F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 422
		metromadrid2000locoModel[89].setRotationPoint(3F, 0.7F, 4.5F);
		metromadrid2000locoModel[89].rotateAngleX = -0.06981317F;

		metromadrid2000locoModel[90].addShapeBox(0F, 0F, 0F, 12, 1, 4, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 423
		metromadrid2000locoModel[90].setRotationPoint(-8.5F, 0F, 4.5F);

		metromadrid2000locoModel[91].addShapeBox(0F, 0F, 0F, 12, 4, 1, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 424
		metromadrid2000locoModel[91].setRotationPoint(-8.5F, -4F, 7.5F);

		metromadrid2000locoModel[92].addShapeBox(0F, -3F, 0F, 1, 2, 3, 0F, 0F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 425
		metromadrid2000locoModel[92].setRotationPoint(-8.5F, 0.7F, 4.5F);
		metromadrid2000locoModel[92].rotateAngleX = -0.06981317F;

		metromadrid2000locoModel[93].addShapeBox(0F, 0F, 0F, 0, 9, 1, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, -0.5F, 0F, 1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 428
		metromadrid2000locoModel[93].setRotationPoint(3.25F, -11F, 4F);

		metromadrid2000locoModel[94].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 1F, -1F, 0F, 1F, -1F, 0F, 1F, 0.5F, 0F, 1F, 0.5F); // Box 429
		metromadrid2000locoModel[94].setRotationPoint(3.25F, -2F, 4F);

		metromadrid2000locoModel[95].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F, 0F, 1F, -1.5F, 0F, 1F, -1.5F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 430
		metromadrid2000locoModel[95].setRotationPoint(3.25F, -14F, 4F);

		metromadrid2000locoModel[96].addBox(0F, 0F, 0F, 12, 3, 2, 0F); // Box 443
		metromadrid2000locoModel[96].setRotationPoint(-8.5F, 1F, -8.5F);

		metromadrid2000locoModel[97].addShapeBox(0F, 0F, 0F, 12, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 444
		metromadrid2000locoModel[97].setRotationPoint(-8.5F, 0F, -8.5F);

		metromadrid2000locoModel[98].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 445
		metromadrid2000locoModel[98].setRotationPoint(3F, -2.1F, -7.7F);
		metromadrid2000locoModel[98].rotateAngleX = 0.06981317F;

		metromadrid2000locoModel[99].addShapeBox(0F, 0F, 0F, 12, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 446
		metromadrid2000locoModel[99].setRotationPoint(-8.5F, -4F, -8.5F);

		metromadrid2000locoModel[100].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 447
		metromadrid2000locoModel[100].setRotationPoint(-8.5F, -2.1F, -7.7F);
		metromadrid2000locoModel[100].rotateAngleX = 0.06981317F;

		metromadrid2000locoModel[101].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F, 0F, 1F, -2F, 0F, 1F, -2F, 0F, 1F, 2F, 0F, 1F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 219
		metromadrid2000locoModel[101].setRotationPoint(4F, -15.4F, 4.5F);

		metromadrid2000locoModel[102].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F, 0F, 1F, 2F, 0F, 1F, 2F, 0F, 1F, -2F, 0F, 1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 220
		metromadrid2000locoModel[102].setRotationPoint(4F, -15.4F, -5.5F);

		metromadrid2000locoModel[103].addShapeBox(0F, 0F, 0F, 14, 8, 1, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 219
		metromadrid2000locoModel[103].setRotationPoint(-9.5F, -4F, -9.25F);

		metromadrid2000locoModel[104].addShapeBox(0F, 0F, 0F, 6, 8, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 221
		metromadrid2000locoModel[104].setRotationPoint(-21.5F, -4F, -9.5F);

		metromadrid2000locoModel[105].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 223
		metromadrid2000locoModel[105].setRotationPoint(-3F, -15F, -8.75F);

		metromadrid2000locoModel[106].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.75F, 0.5F, 0F, 0.75F, 0.5F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 225
		metromadrid2000locoModel[106].setRotationPoint(3F, -15F, -8.75F);

		metromadrid2000locoModel[107].addShapeBox(0F, 0F, 0F, 6, 8, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 226
		metromadrid2000locoModel[107].setRotationPoint(10.5F, -4F, -9.5F);

		metromadrid2000locoModel[108].addShapeBox(0F, 0F, 0F, 6, 8, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 227
		metromadrid2000locoModel[108].setRotationPoint(4.5F, -4F, -9.5F);

		metromadrid2000locoModel[109].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.75F, 0.5F, 0F, 0.75F, 0.5F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 231
		metromadrid2000locoModel[109].setRotationPoint(29F, -15F, -8.75F);

		metromadrid2000locoModel[110].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 232
		metromadrid2000locoModel[110].setRotationPoint(23F, -15F, -8.75F);

		metromadrid2000locoModel[111].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.75F, 0.5F, 0F, 0.75F, 0.5F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 234
		metromadrid2000locoModel[111].setRotationPoint(16.5F, -15F, -8.75F);

		metromadrid2000locoModel[112].addShapeBox(0F, 0F, 0F, 2, 11, 5, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 235
		metromadrid2000locoModel[112].setRotationPoint(30.5F, -15F, -2.5F);

		metromadrid2000locoModel[113].addShapeBox(0F, -3F, 0F, 1, 2, 3, 0F, 0F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 236
		metromadrid2000locoModel[113].setRotationPoint(-3F, 0.7F, 4.5F);
		metromadrid2000locoModel[113].rotateAngleX = -0.06981317F;

		metromadrid2000locoModel[114].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 1F, -1F, 0F, 1F, -1F, 0F, 1F, 0.5F, 0F, 1F, 0.5F); // Box 237
		metromadrid2000locoModel[114].setRotationPoint(-8.25F, -2F, 4F);

		metromadrid2000locoModel[115].addShapeBox(0F, 0F, 0F, 0, 9, 1, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, -0.5F, 0F, 1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 238
		metromadrid2000locoModel[115].setRotationPoint(-8.25F, -11F, 4F);

		metromadrid2000locoModel[116].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F, 0F, 1F, -1.5F, 0F, 1F, -1.5F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 239
		metromadrid2000locoModel[116].setRotationPoint(-8.25F, -14F, 4F);

		metromadrid2000locoModel[117].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0.5F, 0F, 1F, 0.5F, 0F, 1F, -1F, 0F, 1F, -1F); // Box 240
		metromadrid2000locoModel[117].setRotationPoint(3.25F, -2F, -5F);

		metromadrid2000locoModel[118].addShapeBox(0F, 0F, 0F, 0, 9, 1, 0F, 0F, 1F, -0.5F, 0F, 1F, -0.5F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 241
		metromadrid2000locoModel[118].setRotationPoint(3.25F, -11F, -5F);

		metromadrid2000locoModel[119].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0.5F, 0F, 1F, 0.5F, 0F, 1F, -1F, 0F, 1F, -1F); // Box 242
		metromadrid2000locoModel[119].setRotationPoint(-8.25F, -2F, -5F);

		metromadrid2000locoModel[120].addShapeBox(0F, 0F, 0F, 0, 9, 1, 0F, 0F, 1F, -0.5F, 0F, 1F, -0.5F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 243
		metromadrid2000locoModel[120].setRotationPoint(-8.25F, -11F, -5F);

		metromadrid2000locoModel[121].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F, -1.5F, 0F, 1F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 244
		metromadrid2000locoModel[121].setRotationPoint(-8.25F, -14F, -5F);

		metromadrid2000locoModel[122].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F, -1.5F, 0F, 1F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 245
		metromadrid2000locoModel[122].setRotationPoint(3.25F, -14F, -5F);

		metromadrid2000locoModel[123].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.75F, 0.5F, 0F, 0.75F, 0.5F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 246
		metromadrid2000locoModel[123].setRotationPoint(-9.5F, -15F, -8.75F);

		metromadrid2000locoModel[124].addShapeBox(0F, 0F, 0F, 3, 8, 1, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 247
		metromadrid2000locoModel[124].setRotationPoint(-23.5F, -4F, -8.5F);

		metromadrid2000locoModel[125].addShapeBox(0F, 0F, 0F, 3, 10, 1, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 248
		metromadrid2000locoModel[125].setRotationPoint(-23.49F, -14F, -8F);

		metromadrid2000locoModel[126].addShapeBox(0F, 0F, 0F, 3, 8, 1, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 249
		metromadrid2000locoModel[126].setRotationPoint(2.5F, -4F, -8.5F);

		metromadrid2000locoModel[127].addShapeBox(0F, 0F, 0F, 3, 10, 1, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 250
		metromadrid2000locoModel[127].setRotationPoint(2.51F, -14F, -8F);

		metromadrid2000locoModel[128].addShapeBox(0F, 0F, 0F, 3, 8, 1, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 251
		metromadrid2000locoModel[128].setRotationPoint(15F, -4F, -8.5F);

		metromadrid2000locoModel[129].addShapeBox(0F, 0F, 0F, 3, 10, 1, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 252
		metromadrid2000locoModel[129].setRotationPoint(15.01F, -14F, -8F);

		metromadrid2000locoModel[130].addShapeBox(0F, -3F, 0F, 1, 2, 3, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 253
		metromadrid2000locoModel[130].setRotationPoint(-3F, 0.9F, -7.5F);
		metromadrid2000locoModel[130].rotateAngleX = 0.06981317F;

		metromadrid2000locoModel[131].addShapeBox(0F, 0F, 0F, 0, 1, 10, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 254
		metromadrid2000locoModel[131].setRotationPoint(4F, -14.4F, -5F);

		metromadrid2000locoModel[132].addBox(0F, 0F, 0F, 12, 3, 2, 0F); // Box 255
		metromadrid2000locoModel[132].setRotationPoint(18F, 1F, 6.5F);

		metromadrid2000locoModel[133].addShapeBox(0F, 0F, 0F, 12, 1, 4, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 256
		metromadrid2000locoModel[133].setRotationPoint(18F, 0F, 4.5F);

		metromadrid2000locoModel[134].addShapeBox(0F, -3F, 0F, 1, 2, 3, 0F, 0F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 257
		metromadrid2000locoModel[134].setRotationPoint(18F, 0.7F, 4.5F);
		metromadrid2000locoModel[134].rotateAngleX = -0.06981317F;

		metromadrid2000locoModel[135].addShapeBox(0F, 0F, 0F, 12, 4, 1, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 258
		metromadrid2000locoModel[135].setRotationPoint(18F, -4F, 7.5F);

		metromadrid2000locoModel[136].addShapeBox(0F, -3F, 0F, 1, 2, 3, 0F, 0F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 259
		metromadrid2000locoModel[136].setRotationPoint(23.5F, 0.7F, 4.5F);
		metromadrid2000locoModel[136].rotateAngleX = -0.06981317F;

		metromadrid2000locoModel[137].addShapeBox(0F, -3F, 0F, 1, 2, 3, 0F, 0F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 260
		metromadrid2000locoModel[137].setRotationPoint(29.5F, 0.7F, 4.5F);
		metromadrid2000locoModel[137].rotateAngleX = -0.06981317F;

		metromadrid2000locoModel[138].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 1F, -1F, 0F, 1F, -1F, 0F, 1F, 0.5F, 0F, 1F, 0.5F); // Box 261
		metromadrid2000locoModel[138].setRotationPoint(29.75F, -2F, 4F);

		metromadrid2000locoModel[139].addShapeBox(0F, 0F, 0F, 0, 9, 1, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, -0.5F, 0F, 1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 262
		metromadrid2000locoModel[139].setRotationPoint(29.75F, -11F, 4F);

		metromadrid2000locoModel[140].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 1F, -1F, 0F, 1F, -1F, 0F, 1F, 0.5F, 0F, 1F, 0.5F); // Box 263
		metromadrid2000locoModel[140].setRotationPoint(18.25F, -2F, 4F);

		metromadrid2000locoModel[141].addShapeBox(0F, 0F, 0F, 0, 9, 1, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, -0.5F, 0F, 1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 264
		metromadrid2000locoModel[141].setRotationPoint(18.25F, -11F, 4F);

		metromadrid2000locoModel[142].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F, 0F, 1F, -1.5F, 0F, 1F, -1.5F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 265
		metromadrid2000locoModel[142].setRotationPoint(18.25F, -14F, 4F);

		metromadrid2000locoModel[143].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F, 0F, 1F, -1.5F, 0F, 1F, -1.5F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 266
		metromadrid2000locoModel[143].setRotationPoint(29.75F, -14F, 4F);

		metromadrid2000locoModel[144].addShapeBox(0F, 0F, 0F, 12, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 267
		metromadrid2000locoModel[144].setRotationPoint(18F, 0F, -8.5F);

		metromadrid2000locoModel[145].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 268
		metromadrid2000locoModel[145].setRotationPoint(29.5F, -2.1F, -7.7F);
		metromadrid2000locoModel[145].rotateAngleX = 0.06981317F;

		metromadrid2000locoModel[146].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0.5F, 0F, 1F, 0.5F, 0F, 1F, -1F, 0F, 1F, -1F); // Box 269
		metromadrid2000locoModel[146].setRotationPoint(29.75F, -2F, -5F);

		metromadrid2000locoModel[147].addShapeBox(0F, 0F, 0F, 0, 9, 1, 0F, 0F, 1F, -0.5F, 0F, 1F, -0.5F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 270
		metromadrid2000locoModel[147].setRotationPoint(29.75F, -11F, -5F);

		metromadrid2000locoModel[148].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F, -1.5F, 0F, 1F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 271
		metromadrid2000locoModel[148].setRotationPoint(29.75F, -14F, -5F);

		metromadrid2000locoModel[149].addShapeBox(0F, 0F, 0F, 0, 1, 10, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 272
		metromadrid2000locoModel[149].setRotationPoint(30F, -14.4F, -5F);

		metromadrid2000locoModel[150].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F, 0F, 1F, 2F, 0F, 1F, 2F, 0F, 1F, -2F, 0F, 1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 273
		metromadrid2000locoModel[150].setRotationPoint(30F, -15.4F, -5.5F);

		metromadrid2000locoModel[151].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F, 0F, 1F, -2F, 0F, 1F, -2F, 0F, 1F, 2F, 0F, 1F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 274
		metromadrid2000locoModel[151].setRotationPoint(30F, -15.4F, 4.5F);

		metromadrid2000locoModel[152].addShapeBox(0F, -3F, 0F, 1, 2, 3, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 275
		metromadrid2000locoModel[152].setRotationPoint(23.5F, 0.9F, -7.5F);
		metromadrid2000locoModel[152].rotateAngleX = 0.05235988F;

		metromadrid2000locoModel[153].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 276
		metromadrid2000locoModel[153].setRotationPoint(18F, -2.1F, -7.7F);
		metromadrid2000locoModel[153].rotateAngleX = 0.06981317F;

		metromadrid2000locoModel[154].addShapeBox(0F, 0F, 0F, 12, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 277
		metromadrid2000locoModel[154].setRotationPoint(18F, -4F, -8.5F);

		metromadrid2000locoModel[155].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0.5F, 0F, 1F, 0.5F, 0F, 1F, -1F, 0F, 1F, -1F); // Box 278
		metromadrid2000locoModel[155].setRotationPoint(18.25F, -2F, -5F);

		metromadrid2000locoModel[156].addShapeBox(0F, 0F, 0F, 0, 9, 1, 0F, 0F, 1F, -0.5F, 0F, 1F, -0.5F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 279
		metromadrid2000locoModel[156].setRotationPoint(18.25F, -11F, -5F);

		metromadrid2000locoModel[157].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F, -1.5F, 0F, 1F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 280
		metromadrid2000locoModel[157].setRotationPoint(18.25F, -14F, -5F);

		metromadrid2000locoModel[158].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F, 0F, 1F, 2F, 0F, 1F, 2F, 0F, 1F, -2F, 0F, 1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 281
		metromadrid2000locoModel[158].setRotationPoint(17.5F, -15.4F, -5.5F);

		metromadrid2000locoModel[159].addShapeBox(0F, 0F, 0F, 0, 1, 10, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 282
		metromadrid2000locoModel[159].setRotationPoint(17.5F, -14.4F, -5F);

		metromadrid2000locoModel[160].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F, 0F, 1F, -2F, 0F, 1F, -2F, 0F, 1F, 2F, 0F, 1F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 283
		metromadrid2000locoModel[160].setRotationPoint(17.5F, -15.4F, 4.5F);

		metromadrid2000locoModel[161].addBox(0F, 0F, 0F, 12, 3, 2, 0F); // Box 284
		metromadrid2000locoModel[161].setRotationPoint(18F, 1F, -8.5F);

		metromadrid2000locoModel[162].addShapeBox(0F, 0F, 0F, 14, 8, 1, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 288
		metromadrid2000locoModel[162].setRotationPoint(-9.5F, -4F, 8.25F);

		metromadrid2000locoModel[163].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0.5F, 0F, -0.75F, 0.5F, 0F, 0.75F, 0F, 0F, 0.75F); // Box 290
		metromadrid2000locoModel[163].setRotationPoint(-9.5F, -15F, 7.75F);

		metromadrid2000locoModel[164].addShapeBox(0F, 0F, 0F, 6, 8, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 291
		metromadrid2000locoModel[164].setRotationPoint(-15.5F, -4F, 8.5F);

		metromadrid2000locoModel[165].addShapeBox(0F, 0F, 0F, 6, 8, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 292
		metromadrid2000locoModel[165].setRotationPoint(-21.5F, -4F, 8.5F);

		metromadrid2000locoModel[166].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F); // Box 295
		metromadrid2000locoModel[166].setRotationPoint(-3F, -15F, 7.75F);

		metromadrid2000locoModel[167].addShapeBox(0F, 0F, 0F, 11, 11, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, 0.75F, 0F, 0F, 0.75F); // Box 296
		metromadrid2000locoModel[167].setRotationPoint(-8F, -15F, 7.75F);

		metromadrid2000locoModel[168].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0.5F, 0F, -0.75F, 0.5F, 0F, 0.75F, 0F, 0F, 0.75F); // Box 297
		metromadrid2000locoModel[168].setRotationPoint(3F, -15F, 7.75F);

		metromadrid2000locoModel[169].addShapeBox(0F, 0F, 0F, 6, 8, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 299
		metromadrid2000locoModel[169].setRotationPoint(4.5F, -4F, 8.5F);

		metromadrid2000locoModel[170].addShapeBox(0F, 0F, 0F, 6, 8, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 300
		metromadrid2000locoModel[170].setRotationPoint(10.5F, -4F, 8.5F);

		metromadrid2000locoModel[171].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0.5F, 0F, -0.75F, 0.5F, 0F, 0.75F, 0F, 0F, 0.75F); // Box 302
		metromadrid2000locoModel[171].setRotationPoint(16.5F, -15F, 7.75F);

		metromadrid2000locoModel[172].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F); // Box 303
		metromadrid2000locoModel[172].setRotationPoint(23F, -15F, 7.75F);

		metromadrid2000locoModel[173].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0.5F, 0F, -0.75F, 0.5F, 0F, 0.75F, 0F, 0F, 0.75F); // Box 306
		metromadrid2000locoModel[173].setRotationPoint(29F, -15F, 7.75F);

		metromadrid2000locoModel[174].addBox(-2.5F, -2.5F, 0F, 5, 5, 0, 0F); // Box 1
		metromadrid2000locoModel[174].setRotationPoint(-27.25F, 8F, 5F);

		metromadrid2000locoModel[175].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 4
		metromadrid2000locoModel[175].setRotationPoint(-15.25F, 7.5F, -6F);

		metromadrid2000locoModel[176].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 5
		metromadrid2000locoModel[176].setRotationPoint(-27.75F, 7.5F, -6F);

		metromadrid2000locoModel[177].addBox(0F, 0F, 0F, 3, 2, 1, 0F); // Box 13
		metromadrid2000locoModel[177].setRotationPoint(-16.5F, 5F, 6F);

		metromadrid2000locoModel[178].addBox(0F, 0F, 0F, 3, 2, 1, 0F); // Box 14
		metromadrid2000locoModel[178].setRotationPoint(-28.5F, 5F, 6F);

		metromadrid2000locoModel[179].addShapeBox(0F, -1F, 0F, 3, 3, 1, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 16
		metromadrid2000locoModel[179].setRotationPoint(-22.5F, 6.5F, 6F);

		metromadrid2000locoModel[180].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F); // Box 28
		metromadrid2000locoModel[180].setRotationPoint(-15.75F, 7.5F, 6.2F);

		metromadrid2000locoModel[181].addShapeBox(0F, 0F, 0F, 3, 1, 14, 0F, 0F, 0F, 1.5F, 0F, 0F, 1F, 0F, 0F, 1.5F, 0F, 0F, 1F, 0F, 0F, 1.5F, 0F, 0F, 1F, 0F, 0F, 1.5F, 0F, 0F, 1F); // Box 35
		metromadrid2000locoModel[181].setRotationPoint(-22.5F, 4.5F, -7F);

		metromadrid2000locoModel[182].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39
		metromadrid2000locoModel[182].setRotationPoint(-28.5F, 7.5F, 6F);

		metromadrid2000locoModel[183].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		metromadrid2000locoModel[183].setRotationPoint(-14.5F, 7.5F, 6F);

		metromadrid2000locoModel[184].addBox(0F, 0F, 0F, 3, 2, 1, 0F); // Box 45
		metromadrid2000locoModel[184].setRotationPoint(-28.5F, 5F, -7F);

		metromadrid2000locoModel[185].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 1F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 1F, 0F, 0F); // Box 46
		metromadrid2000locoModel[185].setRotationPoint(-24.5F, 5F, -7F);

		metromadrid2000locoModel[186].addShapeBox(0F, -1F, 0F, 3, 3, 1, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 47
		metromadrid2000locoModel[186].setRotationPoint(-22.5F, 6.5F, -7F);

		metromadrid2000locoModel[187].addBox(0F, 0F, 0F, 3, 2, 1, 0F); // Box 49
		metromadrid2000locoModel[187].setRotationPoint(-16.5F, 5F, -7F);

		metromadrid2000locoModel[188].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 56
		metromadrid2000locoModel[188].setRotationPoint(-22.5F, 7F, -5F);

		metromadrid2000locoModel[189].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 57
		metromadrid2000locoModel[189].setRotationPoint(-20.5F, 7F, -5F);

		metromadrid2000locoModel[190].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 58
		metromadrid2000locoModel[190].setRotationPoint(-19.5F, 4.5F, 7.5F);

		metromadrid2000locoModel[191].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 59
		metromadrid2000locoModel[191].setRotationPoint(-23.5F, 4.5F, -8.5F);

		metromadrid2000locoModel[192].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, -0.4F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.4F, -0.2F, 0F, 0F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 0F, -0.2F); // Box 60
		metromadrid2000locoModel[192].setRotationPoint(-22.5F, 6.5F, 7.5F);

		metromadrid2000locoModel[193].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, -0.2F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -0.2F, -0.2F); // Box 61
		metromadrid2000locoModel[193].setRotationPoint(-22.5F, 6.5F, -8.5F);

		metromadrid2000locoModel[194].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 62
		metromadrid2000locoModel[194].setRotationPoint(-19.5F, 6.75F, -8F);

		metromadrid2000locoModel[195].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F); // Box 63
		metromadrid2000locoModel[195].setRotationPoint(-23.5F, 6.75F, 7F);

		metromadrid2000locoModel[196].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 41
		metromadrid2000locoModel[196].setRotationPoint(-22F, 5.5F, -7F);

		metromadrid2000locoModel[197].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 1F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 1F, 0F, 0F); // Box 42
		metromadrid2000locoModel[197].setRotationPoint(-24.5F, 5F, 6F);

		metromadrid2000locoModel[198].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 43
		metromadrid2000locoModel[198].setRotationPoint(-22F, 5.5F, 5F);

		metromadrid2000locoModel[199].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, -1.5F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 1.5F, 0F); // Box 44
		metromadrid2000locoModel[199].setRotationPoint(-19.5F, 5F, 6F);

		metromadrid2000locoModel[200].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, -1.5F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 1.5F, 0F); // Box 45
		metromadrid2000locoModel[200].setRotationPoint(-19.5F, 5F, -7F);

		metromadrid2000locoModel[201].addShapeBox(0F, -1F, 0F, 3, 3, 1, 0F, 2F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 2F, 0F, 0F); // Box 45
		metromadrid2000locoModel[201].setRotationPoint(-17.5F, 7F, 3F);

		metromadrid2000locoModel[202].addShapeBox(0F, -1F, 0F, 3, 3, 1, 0F, 2F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 2F, 0F, 0F); // Box 46
		metromadrid2000locoModel[202].setRotationPoint(-25.5F, 7F, -2F);

		metromadrid2000locoModel[203].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
		metromadrid2000locoModel[203].setRotationPoint(-30.5F, 5F, 4.5F);

		metromadrid2000locoModel[204].addShapeBox(0F, -1F, 0F, 3, 3, 1, 0F, 2F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 2F, 0F, 0F); // Box 44
		metromadrid2000locoModel[204].setRotationPoint(-26.5F, 7F, 2F);

		metromadrid2000locoModel[205].addShapeBox(0F, -1F, 0F, 3, 3, 1, 0F, 2F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 2F, 0F, 0F); // Box 45
		metromadrid2000locoModel[205].setRotationPoint(-16.5F, 7F, -2F);

		metromadrid2000locoModel[206].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -1F, 0.5F, 0F, -1F, 0.5F, 0F, -1F, 0.5F, 0.5F, -1F, 0.5F); // Box 46
		metromadrid2000locoModel[206].setRotationPoint(-30.5F, 8F, 4.5F);

		metromadrid2000locoModel[207].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -1F, 0.5F, 0F, -1F, 0.5F, 0F, -1F, 0.5F, 0.5F, -1F, 0.5F); // Box 47
		metromadrid2000locoModel[207].setRotationPoint(-30.5F, 8F, -5.5F);

		metromadrid2000locoModel[208].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 48
		metromadrid2000locoModel[208].setRotationPoint(-30.5F, 5F, -5.5F);

		metromadrid2000locoModel[209].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 53
		metromadrid2000locoModel[209].setRotationPoint(-29.5F, 5F, 5F);

		metromadrid2000locoModel[210].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F); // Box 54
		metromadrid2000locoModel[210].setRotationPoint(-29.5F, 5F, -6F);

		metromadrid2000locoModel[211].addBox(-2.5F, -2.5F, 0F, 5, 5, 0, 0F); // Box 57
		metromadrid2000locoModel[211].setRotationPoint(-27.25F, 8F, -5F);

		metromadrid2000locoModel[212].addBox(-2.5F, -2.5F, 0F, 5, 5, 0, 0F); // Box 58
		metromadrid2000locoModel[212].setRotationPoint(-14.75F, 8F, -5F);

		metromadrid2000locoModel[213].addBox(-2.5F, -2.5F, 0F, 5, 5, 0, 0F); // Box 59
		metromadrid2000locoModel[213].setRotationPoint(-14.75F, 8F, 5F);

		metromadrid2000locoModel[214].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F); // Box 58
		metromadrid2000locoModel[214].setRotationPoint(-17.75F, 7.5F, 6F);

		metromadrid2000locoModel[215].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F); // Box 59
		metromadrid2000locoModel[215].setRotationPoint(-28.25F, 7.5F, 6.2F);

		metromadrid2000locoModel[216].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 60
		metromadrid2000locoModel[216].setRotationPoint(-26.25F, 7.5F, 6F);

		metromadrid2000locoModel[217].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F); // Box 61
		metromadrid2000locoModel[217].setRotationPoint(-15.75F, 7.5F, -7.2F);

		metromadrid2000locoModel[218].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F); // Box 62
		metromadrid2000locoModel[218].setRotationPoint(-17.75F, 7.5F, -7F);

		metromadrid2000locoModel[219].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 63
		metromadrid2000locoModel[219].setRotationPoint(-26.25F, 7.5F, -7F);

		metromadrid2000locoModel[220].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F); // Box 64
		metromadrid2000locoModel[220].setRotationPoint(-28.25F, 7.5F, -7.2F);

		metromadrid2000locoModel[221].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 65
		metromadrid2000locoModel[221].setRotationPoint(-14.5F, 7.5F, -7F);

		metromadrid2000locoModel[222].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 66
		metromadrid2000locoModel[222].setRotationPoint(-28.5F, 7.5F, -7F);

		metromadrid2000locoModel[223].addShapeBox(0F, 0F, 0F, 9, 5, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 362
		metromadrid2000locoModel[223].setRotationPoint(-5F, 5F, -0.5F);

		metromadrid2000locoModel[224].addShapeBox(0F, 0F, 0F, 4, 5, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 363
		metromadrid2000locoModel[224].setRotationPoint(5.5F, 5F, 0F);

		metromadrid2000locoModel[225].addShapeBox(0F, 0F, 0F, 6, 10, 1, 0F, 0F, 0F, 0.06F, 0F, 0F, 0.06F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 364
		metromadrid2000locoModel[225].setRotationPoint(-15.5F, -14F, -8.75F);

		metromadrid2000locoModel[226].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.06F, 0F, 0F, 0.06F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 367
		metromadrid2000locoModel[226].setRotationPoint(-15.5F, -15F, -8.75F);

		metromadrid2000locoModel[227].addShapeBox(0F, 0F, 0F, 6, 10, 1, 0F, 0F, 0F, 0.06F, 0F, 0F, 0.06F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 368
		metromadrid2000locoModel[227].setRotationPoint(-21.5F, -14F, -8.75F);

		metromadrid2000locoModel[228].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.06F, 0F, 0F, 0.06F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 369
		metromadrid2000locoModel[228].setRotationPoint(-21.5F, -15F, -8.75F);

		metromadrid2000locoModel[229].addShapeBox(0F, 0F, 0F, 6, 10, 1, 0F, 0F, 0F, 0.06F, 0F, 0F, 0.06F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 370
		metromadrid2000locoModel[229].setRotationPoint(4.5F, -14F, -8.75F);

		metromadrid2000locoModel[230].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.06F, 0F, 0F, 0.06F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 371
		metromadrid2000locoModel[230].setRotationPoint(4.5F, -15F, -8.75F);

		metromadrid2000locoModel[231].addShapeBox(0F, 0F, 0F, 6, 10, 1, 0F, 0F, 0F, 0.06F, 0F, 0F, 0.06F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 372
		metromadrid2000locoModel[231].setRotationPoint(10.5F, -14F, -8.75F);

		metromadrid2000locoModel[232].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.06F, 0F, 0F, 0.06F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 373
		metromadrid2000locoModel[232].setRotationPoint(10.5F, -15F, -8.75F);

		metromadrid2000locoModel[233].addShapeBox(0F, 0F, 0F, 6, 10, 1, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0.06F, 0F, 0F, 0.06F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F); // Box 374
		metromadrid2000locoModel[233].setRotationPoint(-21.5F, -14F, 7.75F);

		metromadrid2000locoModel[234].addShapeBox(0F, 0F, 0F, 6, 10, 1, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0.06F, 0F, 0F, 0.06F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F); // Box 375
		metromadrid2000locoModel[234].setRotationPoint(-15.5F, -14F, 7.75F);

		metromadrid2000locoModel[235].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.06F, 0F, 0F, 0.06F); // Box 376
		metromadrid2000locoModel[235].setRotationPoint(-15.5F, -15F, 7.75F);

		metromadrid2000locoModel[236].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.06F, 0F, 0F, 0.06F); // Box 377
		metromadrid2000locoModel[236].setRotationPoint(-21.5F, -15F, 7.75F);

		metromadrid2000locoModel[237].addShapeBox(0F, 0F, 0F, 6, 10, 1, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0.06F, 0F, 0F, 0.06F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F); // Box 378
		metromadrid2000locoModel[237].setRotationPoint(4.5F, -14F, 7.75F);

		metromadrid2000locoModel[238].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.06F, 0F, 0F, 0.06F); // Box 379
		metromadrid2000locoModel[238].setRotationPoint(4.5F, -15F, 7.75F);

		metromadrid2000locoModel[239].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.06F, 0F, 0F, 0.06F); // Box 380
		metromadrid2000locoModel[239].setRotationPoint(10.5F, -15F, 7.75F);

		metromadrid2000locoModel[240].addShapeBox(0F, 0F, 0F, 6, 10, 1, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0.06F, 0F, 0F, 0.06F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F); // Box 381
		metromadrid2000locoModel[240].setRotationPoint(10.5F, -14F, 7.75F);

		metromadrid2000locoModel[241].addShapeBox(0F, 0F, 0F, 3, 8, 1, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 382
		metromadrid2000locoModel[241].setRotationPoint(15F, -4F, 7.5F);

		metromadrid2000locoModel[242].addShapeBox(0F, 0F, 0F, 3, 10, 1, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F); // Box 383
		metromadrid2000locoModel[242].setRotationPoint(15.01F, -14F, 7F);

		metromadrid2000locoModel[243].addShapeBox(0F, 0F, 0F, 3, 10, 1, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F); // Box 384
		metromadrid2000locoModel[243].setRotationPoint(2.51F, -14F, 7F);

		metromadrid2000locoModel[244].addShapeBox(0F, 0F, 0F, 3, 8, 1, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 385
		metromadrid2000locoModel[244].setRotationPoint(2.5F, -4F, 7.5F);

		metromadrid2000locoModel[245].addShapeBox(0F, 0F, 0F, 3, 10, 1, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F); // Box 386
		metromadrid2000locoModel[245].setRotationPoint(-10.99F, -14F, 7F);

		metromadrid2000locoModel[246].addShapeBox(0F, 0F, 0F, 3, 8, 1, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 387
		metromadrid2000locoModel[246].setRotationPoint(-11F, -4F, 7.5F);

		metromadrid2000locoModel[247].addShapeBox(0F, 0F, 0F, 3, 8, 1, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 388
		metromadrid2000locoModel[247].setRotationPoint(-23.5F, -4F, 7.5F);

		metromadrid2000locoModel[248].addShapeBox(0F, 0F, 0F, 3, 10, 1, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F); // Box 389
		metromadrid2000locoModel[248].setRotationPoint(-23.49F, -14F, 7F);

		metromadrid2000locoModel[249].addShapeBox(0F, 0F, 0F, 11, 11, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, 0.75F, 0F, 0F, 0.75F); // Box 397
		metromadrid2000locoModel[249].setRotationPoint(18F, -15F, 7.75F);

		metromadrid2000locoModel[250].addShapeBox(0F, 0F, 0F, 11, 11, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, -1.25F, 0F, 0F, -1.25F); // Box 398
		metromadrid2000locoModel[250].setRotationPoint(18F, -15F, -8.75F);

		metromadrid2000locoModel[251].addShapeBox(0F, 0F, 0F, 11, 11, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, -1.25F, 0F, 0F, -1.25F); // Box 399
		metromadrid2000locoModel[251].setRotationPoint(-8F, -15F, -8.75F);

		metromadrid2000locoModel[252].addShapeBox(0F, 0F, 0F, 63, 2, 2, 0F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 400
		metromadrid2000locoModel[252].setRotationPoint(-32.5F, -16F, 5.75F);

		metromadrid2000locoModel[253].addShapeBox(0F, 0F, 0F, 2, 11, 7, 0F, 0F, 0F, -0.25F, -1F, 0F, -1.75F, -1F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0.5F, -1F, 0F, -1F, -1F, 0F, -2F, 0F, 0F, -2F); // Box 401
		metromadrid2000locoModel[253].setRotationPoint(32F, -15F, -8F);

		metromadrid2000locoModel[254].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, 0F, 0F, -0.1F, 0F); // Lamp 2
		metromadrid2000locoModel[254].setRotationPoint(-34.2F, 3.1F, -5.3F);

		metromadrid2000locoModel[255].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, -0.75F, -0.5F, 0F, -0.45F, -0.25F, 0F, -0.45F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.7F, -0.5F, 0F, -0.7F, -0.25F, 0F, -0.7F, -0.25F, 0F, -0.7F, -0.25F); // Box 223
		metromadrid2000locoModel[255].setRotationPoint(-34.2F, 2F, -6.1F);

		metromadrid2000locoModel[256].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, -0.75F, -0.25F, 0F, -0.45F, -0.25F, 0F, -0.45F, -0.25F, 0F, -0.95F, -0.5F, 0F, -0.6F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.85F, -0.5F); // Box 83
		metromadrid2000locoModel[256].setRotationPoint(-34.2F, 2F, -4.5F);

		metromadrid2000locoModel[257].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, -0.8F, -0.45F, 0F, -0.5F, -0.45F, 0F, -0.5F, -0.05F, 0F, -0.8F, -0.05F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.05F, 0F, 0F, -0.05F); // Box 52
		metromadrid2000locoModel[257].setRotationPoint(-34.2F, 1.95F, -7.2F);

		metromadrid2000locoModel[258].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, -0.8F, -0.45F, 0F, -0.5F, -0.45F, 0F, -0.5F, -0.05F, 0F, -0.8F, -0.05F); // Box 413
		metromadrid2000locoModel[258].setRotationPoint(-34.2F, 4.15F, -7.2F);

		metromadrid2000locoModel[259].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, 0F, 0F, -0.1F, 0F); // Lamp 4
		metromadrid2000locoModel[259].setRotationPoint(-34.2F, 3.1F, -6.7F);

		metromadrid2000locoModel[260].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, -0.95F, -0.5F, 0F, -0.45F, -0.25F, 0F, -0.45F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.85F, -0.5F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.6F, -0.25F); // Box 415
		metromadrid2000locoModel[260].setRotationPoint(-34.2F, 2F, -7.5F);

		metromadrid2000locoModel[261].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 1.65F, 0F, 0.2F, 1.65F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 1.65F, 0F, 0.2F, 1.65F); // Box 424
		metromadrid2000locoModel[261].setRotationPoint(-34.1F, 3.02F, -6.8F);

		metromadrid2000locoModel[262].addBox(0F, 0F, 0F, 6, 1, 1, 0F); // Box 425
		metromadrid2000locoModel[262].setRotationPoint(27.5F, 6F, -0.5F);

		metromadrid2000locoModel[263].addBox(0F, 0F, 0F, 1, 2, 3, 0F); // Box 426
		metromadrid2000locoModel[263].setRotationPoint(33.5F, 6F, -1.5F);

		metromadrid2000locoModel[264].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F, 0F, 0F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, 0F, 0F, -2F, 0.5F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -2F, 0.5F, 0F); // Box 466
		metromadrid2000locoModel[264].setRotationPoint(28F, 7.75F, 1.4F);

		metromadrid2000locoModel[265].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 467
		metromadrid2000locoModel[265].setRotationPoint(30F, 8.75F, 1.4F);

		metromadrid2000locoModel[266].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 468
		metromadrid2000locoModel[266].setRotationPoint(30F, 8.75F, -1.4F);

		metromadrid2000locoModel[267].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F, 0F, 0F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, 0F, 0F, -2F, 0.5F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -2F, 0.5F, 0F); // Box 469
		metromadrid2000locoModel[267].setRotationPoint(28F, 7.75F, -1.4F);

		metromadrid2000locoModel[268].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F, -0.5F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.25F, 0F, 1F, 0F, 0F, -2F, 0.5F, 0F, -2F, 0.5F, 0F, 1F, 0F, 0F); // Box 470
		metromadrid2000locoModel[268].setRotationPoint(33F, 7.75F, 1.4F);

		metromadrid2000locoModel[269].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F, -0.5F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.25F, 0F, 1F, 0F, 0F, -2F, 0.5F, 0F, -2F, 0.5F, 0F, 1F, 0F, 0F); // Box 473
		metromadrid2000locoModel[269].setRotationPoint(33F, 7.75F, -1.4F);

		metromadrid2000locoModel[270].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 287
		metromadrid2000locoModel[270].setRotationPoint(-33.5F, 8.75F, 1.9F);

		metromadrid2000locoModel[271].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F, 0F, 0F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, 0F, 0F, -2F, 0.5F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -2F, 0.5F, 0F); // Box 288
		metromadrid2000locoModel[271].setRotationPoint(-35.5F, 7.75F, -1.9F);

		metromadrid2000locoModel[272].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F, 0F, 0F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, 0F, 0F, -2F, 0.5F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -2F, 0.5F, 0F); // Box 289
		metromadrid2000locoModel[272].setRotationPoint(-35.5F, 7.75F, 1.9F);

		metromadrid2000locoModel[273].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 290
		metromadrid2000locoModel[273].setRotationPoint(-33.5F, 8.75F, -1.9F);

		metromadrid2000locoModel[274].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F, -0.5F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.25F, 0F, 1F, 0F, 0F, -2F, 0.5F, 0F, -2F, 0.5F, 0F, 1F, 0F, 0F); // Box 291
		metromadrid2000locoModel[274].setRotationPoint(-30.5F, 7.75F, -1.9F);

		metromadrid2000locoModel[275].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F, -0.5F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.25F, 0F, 1F, 0F, 0F, -2F, 0.5F, 0F, -2F, 0.5F, 0F, 1F, 0F, 0F); // Box 292
		metromadrid2000locoModel[275].setRotationPoint(-30.5F, 7.75F, 1.9F);

		metromadrid2000locoModel[276].addBox(0F, 0F, 0F, 3, 2, 1, 0F); // Box 289
		metromadrid2000locoModel[276].setRotationPoint(12.5F, 5F, 6F);

		metromadrid2000locoModel[277].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 290
		metromadrid2000locoModel[277].setRotationPoint(12.5F, 7.5F, 6F);

		metromadrid2000locoModel[278].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F); // Box 291
		metromadrid2000locoModel[278].setRotationPoint(12.75F, 7.5F, 6.2F);

		metromadrid2000locoModel[279].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 292
		metromadrid2000locoModel[279].setRotationPoint(14.75F, 7.5F, 6F);

		metromadrid2000locoModel[280].addShapeBox(0F, -1F, 0F, 3, 3, 1, 0F, 2F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 2F, 0F, 0F); // Box 293
		metromadrid2000locoModel[280].setRotationPoint(14.5F, 7F, 2F);

		metromadrid2000locoModel[281].addShapeBox(0F, -1F, 0F, 3, 3, 1, 0F, 2F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 2F, 0F, 0F); // Box 294
		metromadrid2000locoModel[281].setRotationPoint(15.5F, 7F, -2F);

		metromadrid2000locoModel[282].addShapeBox(0F, -1F, 0F, 3, 3, 1, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 295
		metromadrid2000locoModel[282].setRotationPoint(18.5F, 6.5F, 6F);

		metromadrid2000locoModel[283].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F); // Box 296
		metromadrid2000locoModel[283].setRotationPoint(17.5F, 6.75F, 7F);

		metromadrid2000locoModel[284].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, -0.4F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.4F, -0.2F, 0F, 0F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 0F, -0.2F); // Box 297
		metromadrid2000locoModel[284].setRotationPoint(18.5F, 6.5F, 7.5F);

		metromadrid2000locoModel[285].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 298
		metromadrid2000locoModel[285].setRotationPoint(21.5F, 4.5F, 7.5F);

		metromadrid2000locoModel[286].addShapeBox(0F, 0F, 0F, 3, 1, 14, 0F, 0F, 0F, 1.5F, 0F, 0F, 1F, 0F, 0F, 1.5F, 0F, 0F, 1F, 0F, 0F, 1.5F, 0F, 0F, 1F, 0F, 0F, 1.5F, 0F, 0F, 1F); // Box 299
		metromadrid2000locoModel[286].setRotationPoint(18.5F, 4.5F, -7F);

		metromadrid2000locoModel[287].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 300
		metromadrid2000locoModel[287].setRotationPoint(19F, 5.5F, 5F);

		metromadrid2000locoModel[288].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, -1.5F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 1.5F, 0F); // Box 301
		metromadrid2000locoModel[288].setRotationPoint(21.5F, 5F, 6F);

		metromadrid2000locoModel[289].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 1F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 1F, 0F, 0F); // Box 302
		metromadrid2000locoModel[289].setRotationPoint(16.5F, 5F, 6F);

		metromadrid2000locoModel[290].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F); // Box 303
		metromadrid2000locoModel[290].setRotationPoint(23.25F, 7.5F, 6F);

		metromadrid2000locoModel[291].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F); // Box 304
		metromadrid2000locoModel[291].setRotationPoint(25.25F, 7.5F, 6.2F);

		metromadrid2000locoModel[292].addBox(0F, 0F, 0F, 3, 2, 1, 0F); // Box 305
		metromadrid2000locoModel[292].setRotationPoint(24.5F, 5F, 6F);

		metromadrid2000locoModel[293].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 306
		metromadrid2000locoModel[293].setRotationPoint(26.5F, 7.5F, 6F);

		metromadrid2000locoModel[294].addBox(-2.5F, -2.5F, 0F, 5, 5, 0, 0F); // Box 307
		metromadrid2000locoModel[294].setRotationPoint(26.25F, 8F, 5F);

		metromadrid2000locoModel[295].addShapeBox(0F, -1F, 0F, 3, 3, 1, 0F, 2F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 2F, 0F, 0F); // Box 308
		metromadrid2000locoModel[295].setRotationPoint(23.5F, 7F, 3F);

		metromadrid2000locoModel[296].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 309
		metromadrid2000locoModel[296].setRotationPoint(20.5F, 7F, -5F);

		metromadrid2000locoModel[297].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 310
		metromadrid2000locoModel[297].setRotationPoint(18.5F, 7F, -5F);

		metromadrid2000locoModel[298].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 311
		metromadrid2000locoModel[298].setRotationPoint(18.5F, 5F, -1.5F);

		metromadrid2000locoModel[299].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 312
		metromadrid2000locoModel[299].setRotationPoint(19F, 5.5F, -7F);

		metromadrid2000locoModel[300].addBox(-2.5F, -2.5F, 0F, 5, 5, 0, 0F); // Box 313
		metromadrid2000locoModel[300].setRotationPoint(13.75F, 8F, 5F);

		metromadrid2000locoModel[301].addBox(-2.5F, -2.5F, 0F, 5, 5, 0, 0F); // Box 314
		metromadrid2000locoModel[301].setRotationPoint(26.25F, 8F, -5F);

		metromadrid2000locoModel[302].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, -1.5F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 1.5F, 0F); // Box 315
		metromadrid2000locoModel[302].setRotationPoint(21.5F, 5F, -7F);

		metromadrid2000locoModel[303].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F); // Box 316
		metromadrid2000locoModel[303].setRotationPoint(23.25F, 7.5F, -7F);

		metromadrid2000locoModel[304].addShapeBox(0F, -1F, 0F, 3, 3, 1, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 317
		metromadrid2000locoModel[304].setRotationPoint(18.5F, 6.5F, -7F);

		metromadrid2000locoModel[305].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 318
		metromadrid2000locoModel[305].setRotationPoint(21.5F, 6.75F, -8F);

		metromadrid2000locoModel[306].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, -0.2F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -0.2F, -0.2F); // Box 319
		metromadrid2000locoModel[306].setRotationPoint(18.5F, 6.5F, -8.5F);

		metromadrid2000locoModel[307].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 320
		metromadrid2000locoModel[307].setRotationPoint(17.5F, 4.5F, -8.5F);

		metromadrid2000locoModel[308].addBox(0F, 0F, 0F, 3, 2, 1, 0F); // Box 321
		metromadrid2000locoModel[308].setRotationPoint(12.5F, 5F, -7F);

		metromadrid2000locoModel[309].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 1F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 1F, 0F, 0F); // Box 322
		metromadrid2000locoModel[309].setRotationPoint(16.5F, 5F, -7F);

		metromadrid2000locoModel[310].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 323
		metromadrid2000locoModel[310].setRotationPoint(14.75F, 7.5F, -7F);

		metromadrid2000locoModel[311].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F); // Box 324
		metromadrid2000locoModel[311].setRotationPoint(12.75F, 7.5F, -7.2F);

		metromadrid2000locoModel[312].addBox(-2.5F, -2.5F, 0F, 5, 5, 0, 0F); // Box 325
		metromadrid2000locoModel[312].setRotationPoint(13.75F, 8F, -5F);

		metromadrid2000locoModel[313].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 326
		metromadrid2000locoModel[313].setRotationPoint(13.25F, 7.5F, -6F);

		metromadrid2000locoModel[314].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F); // Box 327
		metromadrid2000locoModel[314].setRotationPoint(25.25F, 7.5F, -7.2F);

		metromadrid2000locoModel[315].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 328
		metromadrid2000locoModel[315].setRotationPoint(26.5F, 7.5F, -7F);

		metromadrid2000locoModel[316].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 329
		metromadrid2000locoModel[316].setRotationPoint(25.75F, 7.5F, -6F);

		metromadrid2000locoModel[317].addBox(0F, 0F, 0F, 3, 2, 1, 0F); // Box 330
		metromadrid2000locoModel[317].setRotationPoint(24.5F, 5F, -7F);

		metromadrid2000locoModel[318].addShapeBox(0F, -1F, 0F, 3, 3, 1, 0F, 2F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 2F, 0F, 0F); // Box 333
		metromadrid2000locoModel[318].setRotationPoint(24.5F, 7F, -2F);

		metromadrid2000locoModel[319].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 334
		metromadrid2000locoModel[319].setRotationPoint(12.5F, 7.5F, -7F);

		metromadrid2000locoModel[320].addShapeBox(0F, 0F, 0F, 5, 5, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 335
		metromadrid2000locoModel[320].setRotationPoint(-10.5F, 5F, -8F);

		metromadrid2000locoModel[321].addShapeBox(0F, 0F, 0F, 9, 5, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 336
		metromadrid2000locoModel[321].setRotationPoint(-5F, 5F, -7.5F);

		metromadrid2000locoModel[322].addShapeBox(0F, 0F, 0F, 4, 5, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 337
		metromadrid2000locoModel[322].setRotationPoint(5.5F, 5F, -8F);

		metromadrid2000locoModel[323].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, 0F, 0F, -0.1F, 0F); // Lamp 1
		metromadrid2000locoModel[323].setRotationPoint(-34.2F, 3.1F, 4.2F);

		metromadrid2000locoModel[324].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 1.65F, 0F, 0.2F, 1.65F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 1.65F, 0F, 0.2F, 1.65F); // Box 339
		metromadrid2000locoModel[324].setRotationPoint(-34.1F, 3.02F, 4.2F);

		metromadrid2000locoModel[325].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, -0.75F, -0.5F, 0F, -0.45F, -0.25F, 0F, -0.45F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.7F, -0.5F, 0F, -0.7F, -0.25F, 0F, -0.7F, -0.25F, 0F, -0.7F, -0.25F); // Box 340
		metromadrid2000locoModel[325].setRotationPoint(-34.2F, 2F, 4.9F);

		metromadrid2000locoModel[326].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, -0.8F, -0.45F, 0F, -0.5F, -0.45F, 0F, -0.5F, -0.05F, 0F, -0.8F, -0.05F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.05F, 0F, 0F, -0.05F); // Box 341
		metromadrid2000locoModel[326].setRotationPoint(-34.2F, 1.95F, 3.8F);

		metromadrid2000locoModel[327].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, -0.95F, -0.5F, 0F, -0.45F, -0.25F, 0F, -0.45F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.85F, -0.5F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.6F, -0.25F); // Box 342
		metromadrid2000locoModel[327].setRotationPoint(-34.2F, 2F, 3.5F);

		metromadrid2000locoModel[328].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, -0.8F, -0.45F, 0F, -0.5F, -0.45F, 0F, -0.5F, -0.05F, 0F, -0.8F, -0.05F); // Box 343
		metromadrid2000locoModel[328].setRotationPoint(-34.2F, 4.15F, 3.8F);

		metromadrid2000locoModel[329].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, 0F, 0F, -0.1F, 0F); // Lamp3
		metromadrid2000locoModel[329].setRotationPoint(-34.2F, 3.1F, 5.7F);

		metromadrid2000locoModel[330].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, -0.75F, -0.25F, 0F, -0.45F, -0.25F, 0F, -0.45F, -0.25F, 0F, -0.95F, -0.5F, 0F, -0.6F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.85F, -0.5F); // Box 345
		metromadrid2000locoModel[330].setRotationPoint(-34.2F, 2F, 6.5F);

		metromadrid2000locoModel[331].addShapeBox(0F, 0F, 0F, 12, 14, 1, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, -9F, 0F, -0.3F, -9F, -9F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, -9F, -9F, 0F); // Box 332
		metromadrid2000locoModel[331].setRotationPoint(-34F, -9F, 8.5F);

		metromadrid2000locoModel[332].addShapeBox(0F, 0F, 0F, 12, 14, 1, 0F, -9F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, -9F, 0F, 0F, -9F, -9F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, -9F, -9F, 0F); // Box 333
		metromadrid2000locoModel[332].setRotationPoint(-34F, -9F, -9.5F);

		metromadrid2000locoModel[333].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, -0.7F, 0F, -0.5F, -0.7F, 0F, -0.5F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 173
		metromadrid2000locoModel[333].setRotationPoint(23.5F, -3.1F, -7.05F);

		metromadrid2000locoModel[334].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0.5F, 0F, 1F, 0.5F, 0F, 1F, -1F, 0F, 1F, -1F); // Box 335
		metromadrid2000locoModel[334].setRotationPoint(23.75F, -2.1F, -5F);

		metromadrid2000locoModel[335].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, -0.7F, 0F, -0.5F, -0.7F, 0F, -0.5F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 336
		metromadrid2000locoModel[335].setRotationPoint(-3F, -3.1F, -7.05F);

		metromadrid2000locoModel[336].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0.5F, 0F, 1F, 0.5F, 0F, 1F, -1F, 0F, 1F, -1F); // Box 337
		metromadrid2000locoModel[336].setRotationPoint(-2.75F, -2.1F, -5F);

		metromadrid2000locoModel[337].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, -0.7F, 0F, -0.5F, -0.7F, 0F, -0.5F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 338
		metromadrid2000locoModel[337].setRotationPoint(-3F, -3.1F, -7.05F);

		metromadrid2000locoModel[338].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, -0.7F, 0F, -0.5F, -0.7F, 0F, -0.5F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 339
		metromadrid2000locoModel[338].setRotationPoint(-3F, -3.1F, -7.05F);

		metromadrid2000locoModel[339].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, -0.7F, 0F, -0.5F, -0.7F, 0F, -0.5F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 340
		metromadrid2000locoModel[339].setRotationPoint(-3F, -3.1F, -7.05F);

		metromadrid2000locoModel[340].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, -0.7F, 0F, -0.5F, -0.7F, 0F, -0.5F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 341
		metromadrid2000locoModel[340].setRotationPoint(-8.5F, -3.1F, -7.5F);

		metromadrid2000locoModel[341].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, -0.7F, 0F, -0.5F, -0.7F, 0F, -0.5F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 342
		metromadrid2000locoModel[341].setRotationPoint(3F, -3.1F, -7.5F);

		metromadrid2000locoModel[342].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, -0.7F, 0F, -0.5F, -0.7F, 0F, -0.5F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 343
		metromadrid2000locoModel[342].setRotationPoint(18F, -3.1F, -7.5F);

		metromadrid2000locoModel[343].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, -0.7F, 0F, -0.5F, -0.7F, 0F, -0.5F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 344
		metromadrid2000locoModel[343].setRotationPoint(29.5F, -3.1F, -7.5F);

		metromadrid2000locoModel[344].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 1F, -1F, 0F, 1F, -1F, 0F, 1F, 0.5F, 0F, 1F, 0.5F); // Box 345
		metromadrid2000locoModel[344].setRotationPoint(-2.75F, -2.1F, 4F);

		metromadrid2000locoModel[345].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, -0.7F, 0F, -0.5F, -0.7F, 0F, -0.5F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 346
		metromadrid2000locoModel[345].setRotationPoint(-3F, -3.1F, 3.95F);

		metromadrid2000locoModel[346].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, -0.7F, 0F, -0.5F, -0.7F, 0F, -0.5F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 347
		metromadrid2000locoModel[346].setRotationPoint(23.5F, -3.1F, 3.95F);

		metromadrid2000locoModel[347].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 1F, -1F, 0F, 1F, -1F, 0F, 1F, 0.5F, 0F, 1F, 0.5F); // Box 348
		metromadrid2000locoModel[347].setRotationPoint(23.75F, -2.1F, 4F);

		metromadrid2000locoModel[348].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, -0.7F, 0F, -0.5F, -0.7F, 0F, -0.5F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 349
		metromadrid2000locoModel[348].setRotationPoint(29.5F, -3.1F, 4.5F);

		metromadrid2000locoModel[349].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, -0.7F, 0F, -0.5F, -0.7F, 0F, -0.5F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 350
		metromadrid2000locoModel[349].setRotationPoint(18F, -3.1F, 4.5F);

		metromadrid2000locoModel[350].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, -0.7F, 0F, -0.5F, -0.7F, 0F, -0.5F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 351
		metromadrid2000locoModel[350].setRotationPoint(3F, -3.1F, 4.5F);

		metromadrid2000locoModel[351].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, -0.7F, 0F, -0.5F, -0.7F, 0F, -0.5F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 352
		metromadrid2000locoModel[351].setRotationPoint(-8.5F, -3.1F, 4.5F);

		metromadrid2000locoModel[352].addShapeBox(0F, 0F, 0F, 2, 11, 1, 0F, -0.6F, 0F, -1.75F, 0F, 0F, -0.75F, 0F, 0F, 0.5F, -0.6F, 0F, 1.2F, -0.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0.5F); // Box 353
		metromadrid2000locoModel[352].setRotationPoint(-34.51F, -15F, -9.55F);

		metromadrid2000locoModel[353].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F, -0.6F, 0F, -1F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.6F, 0F, 0.5F, -0.55F, 0F, -1.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, -0.555F, 0F, 0.75F); // Box 354
		metromadrid2000locoModel[353].setRotationPoint(-34.51F, -4F, -9.55F);

		metromadrid2000locoModel[354].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 355
		metromadrid2000locoModel[354].setRotationPoint(26F, -17.5F, -1.5F);


	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		for(int i = 0; i < 355; i++)
		{
			metromadrid2000locoModel[i].render(f5);
		}
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
	{
	}

	public ModelRendererTurbo metromadrid2000locoModel[];
}