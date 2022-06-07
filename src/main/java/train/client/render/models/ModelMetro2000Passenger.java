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

public class ModelMetro2000Passenger extends ModelBase
{
	int textureX = 512;
	int textureY = 256;

	public ModelMetro2000Passenger()
	{
		metro2000passengerModel = new ModelRendererTurbo[346];
		metro2000passengerModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 44
		metro2000passengerModel[1] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 171
		metro2000passengerModel[2] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 277
		metro2000passengerModel[3] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 278
		metro2000passengerModel[4] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 32
		metro2000passengerModel[5] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 33
		metro2000passengerModel[6] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 174
		metro2000passengerModel[7] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 175
		metro2000passengerModel[8] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 182
		metro2000passengerModel[9] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 183
		metro2000passengerModel[10] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 184
		metro2000passengerModel[11] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 185
		metro2000passengerModel[12] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 93
		metro2000passengerModel[13] = new ModelRendererTurbo(this, 233, 17, textureX, textureY); // Box 170
		metro2000passengerModel[14] = new ModelRendererTurbo(this, 281, 17, textureX, textureY); // Box 171
		metro2000passengerModel[15] = new ModelRendererTurbo(this, 305, 17, textureX, textureY); // Box 183
		metro2000passengerModel[16] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 184
		metro2000passengerModel[17] = new ModelRendererTurbo(this, 264, 17, textureX, textureY); // Box 201
		metro2000passengerModel[18] = new ModelRendererTurbo(this, 368, 1, textureX, textureY); // Box 202
		metro2000passengerModel[19] = new ModelRendererTurbo(this, 305, 25, textureX, textureY); // Box 210
		metro2000passengerModel[20] = new ModelRendererTurbo(this, 129, 17, textureX, textureY); // Box 229
		metro2000passengerModel[21] = new ModelRendererTurbo(this, 425, 17, textureX, textureY); // Box 230
		metro2000passengerModel[22] = new ModelRendererTurbo(this, 449, 17, textureX, textureY); // Box 231
		metro2000passengerModel[23] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 292
		metro2000passengerModel[24] = new ModelRendererTurbo(this, 129, 9, textureX, textureY); // Box 293
		metro2000passengerModel[25] = new ModelRendererTurbo(this, 137, 9, textureX, textureY); // Box 294
		metro2000passengerModel[26] = new ModelRendererTurbo(this, 193, 9, textureX, textureY); // Box 295
		metro2000passengerModel[27] = new ModelRendererTurbo(this, 153, 9, textureX, textureY); // Box 296
		metro2000passengerModel[28] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 407
		metro2000passengerModel[29] = new ModelRendererTurbo(this, 481, 17, textureX, textureY); // Box 411
		metro2000passengerModel[30] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 235
		metro2000passengerModel[31] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 236
		metro2000passengerModel[32] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 238
		metro2000passengerModel[33] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 37
		metro2000passengerModel[34] = new ModelRendererTurbo(this, 177, 9, textureX, textureY); // Box 418
		metro2000passengerModel[35] = new ModelRendererTurbo(this, 161, 9, textureX, textureY); // Box 419
		metro2000passengerModel[36] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 421
		metro2000passengerModel[37] = new ModelRendererTurbo(this, 217, 9, textureX, textureY); // Box 275
		metro2000passengerModel[38] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 281
		metro2000passengerModel[39] = new ModelRendererTurbo(this, 497, 17, textureX, textureY); // Box 292
		metro2000passengerModel[40] = new ModelRendererTurbo(this, 9, 33, textureX, textureY); // Box 293
		metro2000passengerModel[41] = new ModelRendererTurbo(this, 41, 33, textureX, textureY); // Box 294
		metro2000passengerModel[42] = new ModelRendererTurbo(this, 57, 33, textureX, textureY); // Box 295
		metro2000passengerModel[43] = new ModelRendererTurbo(this, 73, 33, textureX, textureY); // Box 296
		metro2000passengerModel[44] = new ModelRendererTurbo(this, 73, 33, textureX, textureY); // Box 297
		metro2000passengerModel[45] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 298
		metro2000passengerModel[46] = new ModelRendererTurbo(this, 409, 9, textureX, textureY); // Box 299
		metro2000passengerModel[47] = new ModelRendererTurbo(this, 129, 25, textureX, textureY); // Box 300
		metro2000passengerModel[48] = new ModelRendererTurbo(this, 105, 33, textureX, textureY); // Box 305
		metro2000passengerModel[49] = new ModelRendererTurbo(this, 169, 33, textureX, textureY); // Box 306
		metro2000passengerModel[50] = new ModelRendererTurbo(this, 465, 25, textureX, textureY); // Box 307
		metro2000passengerModel[51] = new ModelRendererTurbo(this, 185, 33, textureX, textureY); // Box 308
		metro2000passengerModel[52] = new ModelRendererTurbo(this, 201, 33, textureX, textureY); // Box 309
		metro2000passengerModel[53] = new ModelRendererTurbo(this, 233, 33, textureX, textureY); // Box 312
		metro2000passengerModel[54] = new ModelRendererTurbo(this, 329, 33, textureX, textureY); // Box 313
		metro2000passengerModel[55] = new ModelRendererTurbo(this, 401, 41, textureX, textureY); // Box 319
		metro2000passengerModel[56] = new ModelRendererTurbo(this, 121, 33, textureX, textureY); // Box 320
		metro2000passengerModel[57] = new ModelRendererTurbo(this, 289, 17, textureX, textureY); // Box 321
		metro2000passengerModel[58] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 332
		metro2000passengerModel[59] = new ModelRendererTurbo(this, 449, 34, textureX, textureY); // Box 333
		metro2000passengerModel[60] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 334
		metro2000passengerModel[61] = new ModelRendererTurbo(this, 489, 33, textureX, textureY); // Box 360
		metro2000passengerModel[62] = new ModelRendererTurbo(this, 129, 49, textureX, textureY); // Box 369
		metro2000passengerModel[63] = new ModelRendererTurbo(this, 73, 41, textureX, textureY); // Box 386
		metro2000passengerModel[64] = new ModelRendererTurbo(this, 152, 49, textureX, textureY); // Box 387
		metro2000passengerModel[65] = new ModelRendererTurbo(this, 201, 41, textureX, textureY); // Box 388
		metro2000passengerModel[66] = new ModelRendererTurbo(this, 49, 49, textureX, textureY); // Box 394
		metro2000passengerModel[67] = new ModelRendererTurbo(this, 233, 49, textureX, textureY); // Box 395
		metro2000passengerModel[68] = new ModelRendererTurbo(this, 441, 49, textureX, textureY); // Box 396
		metro2000passengerModel[69] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 405
		metro2000passengerModel[70] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 406
		metro2000passengerModel[71] = new ModelRendererTurbo(this, 89, 33, textureX, textureY); // Box 407
		metro2000passengerModel[72] = new ModelRendererTurbo(this, 81, 57, textureX, textureY); // Box 421
		metro2000passengerModel[73] = new ModelRendererTurbo(this, 441, 9, textureX, textureY); // Box 422
		metro2000passengerModel[74] = new ModelRendererTurbo(this, 273, 57, textureX, textureY); // Box 423
		metro2000passengerModel[75] = new ModelRendererTurbo(this, 313, 57, textureX, textureY); // Box 424
		metro2000passengerModel[76] = new ModelRendererTurbo(this, 217, 25, textureX, textureY); // Box 425
		metro2000passengerModel[77] = new ModelRendererTurbo(this, 217, 33, textureX, textureY); // Box 428
		metro2000passengerModel[78] = new ModelRendererTurbo(this, 145, 9, textureX, textureY); // Box 429
		metro2000passengerModel[79] = new ModelRendererTurbo(this, 249, 17, textureX, textureY); // Box 430
		metro2000passengerModel[80] = new ModelRendererTurbo(this, 345, 57, textureX, textureY); // Box 443
		metro2000passengerModel[81] = new ModelRendererTurbo(this, 49, 65, textureX, textureY); // Box 444
		metro2000passengerModel[82] = new ModelRendererTurbo(this, 345, 33, textureX, textureY); // Box 445
		metro2000passengerModel[83] = new ModelRendererTurbo(this, 89, 65, textureX, textureY); // Box 446
		metro2000passengerModel[84] = new ModelRendererTurbo(this, 409, 33, textureX, textureY); // Box 447
		metro2000passengerModel[85] = new ModelRendererTurbo(this, 449, 17, textureX, textureY); // Box 219
		metro2000passengerModel[86] = new ModelRendererTurbo(this, 473, 17, textureX, textureY); // Box 220
		metro2000passengerModel[87] = new ModelRendererTurbo(this, 169, 65, textureX, textureY); // Box 219
		metro2000passengerModel[88] = new ModelRendererTurbo(this, 177, 49, textureX, textureY); // Box 221
		metro2000passengerModel[89] = new ModelRendererTurbo(this, 505, 33, textureX, textureY); // Box 223
		metro2000passengerModel[90] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 225
		metro2000passengerModel[91] = new ModelRendererTurbo(this, 377, 57, textureX, textureY); // Box 226
		metro2000passengerModel[92] = new ModelRendererTurbo(this, 201, 65, textureX, textureY); // Box 227
		metro2000passengerModel[93] = new ModelRendererTurbo(this, 193, 49, textureX, textureY); // Box 231
		metro2000passengerModel[94] = new ModelRendererTurbo(this, 393, 49, textureX, textureY); // Box 232
		metro2000passengerModel[95] = new ModelRendererTurbo(this, 505, 49, textureX, textureY); // Box 234
		metro2000passengerModel[96] = new ModelRendererTurbo(this, 217, 65, textureX, textureY); // Box 235
		metro2000passengerModel[97] = new ModelRendererTurbo(this, 41, 41, textureX, textureY); // Box 236
		metro2000passengerModel[98] = new ModelRendererTurbo(this, 481, 17, textureX, textureY); // Box 237
		metro2000passengerModel[99] = new ModelRendererTurbo(this, 313, 33, textureX, textureY); // Box 238
		metro2000passengerModel[100] = new ModelRendererTurbo(this, 105, 33, textureX, textureY); // Box 239
		metro2000passengerModel[101] = new ModelRendererTurbo(this, 169, 33, textureX, textureY); // Box 240
		metro2000passengerModel[102] = new ModelRendererTurbo(this, 401, 33, textureX, textureY); // Box 241
		metro2000passengerModel[103] = new ModelRendererTurbo(this, 249, 33, textureX, textureY); // Box 242
		metro2000passengerModel[104] = new ModelRendererTurbo(this, 273, 49, textureX, textureY); // Box 243
		metro2000passengerModel[105] = new ModelRendererTurbo(this, 265, 33, textureX, textureY); // Box 244
		metro2000passengerModel[106] = new ModelRendererTurbo(this, 273, 33, textureX, textureY); // Box 245
		metro2000passengerModel[107] = new ModelRendererTurbo(this, 281, 65, textureX, textureY); // Box 246
		metro2000passengerModel[108] = new ModelRendererTurbo(this, 289, 65, textureX, textureY); // Box 247
		metro2000passengerModel[109] = new ModelRendererTurbo(this, 305, 65, textureX, textureY); // Box 248
		metro2000passengerModel[110] = new ModelRendererTurbo(this, 321, 65, textureX, textureY); // Box 249
		metro2000passengerModel[111] = new ModelRendererTurbo(this, 337, 65, textureX, textureY); // Box 250
		metro2000passengerModel[112] = new ModelRendererTurbo(this, 353, 65, textureX, textureY); // Box 251
		metro2000passengerModel[113] = new ModelRendererTurbo(this, 393, 65, textureX, textureY); // Box 252
		metro2000passengerModel[114] = new ModelRendererTurbo(this, 281, 49, textureX, textureY); // Box 253
		metro2000passengerModel[115] = new ModelRendererTurbo(this, 489, 58, textureX, textureY); // Box 254
		metro2000passengerModel[116] = new ModelRendererTurbo(this, 409, 65, textureX, textureY); // Box 255
		metro2000passengerModel[117] = new ModelRendererTurbo(this, 273, 57, textureX, textureY); // Box 256
		metro2000passengerModel[118] = new ModelRendererTurbo(this, 401, 49, textureX, textureY); // Box 257
		metro2000passengerModel[119] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 258
		metro2000passengerModel[120] = new ModelRendererTurbo(this, 433, 49, textureX, textureY); // Box 259
		metro2000passengerModel[121] = new ModelRendererTurbo(this, 113, 57, textureX, textureY); // Box 260
		metro2000passengerModel[122] = new ModelRendererTurbo(this, 345, 33, textureX, textureY); // Box 261
		metro2000passengerModel[123] = new ModelRendererTurbo(this, 449, 49, textureX, textureY); // Box 262
		metro2000passengerModel[124] = new ModelRendererTurbo(this, 361, 33, textureX, textureY); // Box 263
		metro2000passengerModel[125] = new ModelRendererTurbo(this, 9, 57, textureX, textureY); // Box 264
		metro2000passengerModel[126] = new ModelRendererTurbo(this, 385, 33, textureX, textureY); // Box 265
		metro2000passengerModel[127] = new ModelRendererTurbo(this, 481, 41, textureX, textureY); // Box 266
		metro2000passengerModel[128] = new ModelRendererTurbo(this, 49, 65, textureX, textureY); // Box 267
		metro2000passengerModel[129] = new ModelRendererTurbo(this, 369, 65, textureX, textureY); // Box 268
		metro2000passengerModel[130] = new ModelRendererTurbo(this, 409, 33, textureX, textureY); // Box 269
		metro2000passengerModel[131] = new ModelRendererTurbo(this, 41, 57, textureX, textureY); // Box 270
		metro2000passengerModel[132] = new ModelRendererTurbo(this, 89, 49, textureX, textureY); // Box 271
		metro2000passengerModel[133] = new ModelRendererTurbo(this, 73, 66, textureX, textureY); // Box 272
		metro2000passengerModel[134] = new ModelRendererTurbo(this, 417, 33, textureX, textureY); // Box 273
		metro2000passengerModel[135] = new ModelRendererTurbo(this, 465, 33, textureX, textureY); // Box 274
		metro2000passengerModel[136] = new ModelRendererTurbo(this, 97, 73, textureX, textureY); // Box 275
		metro2000passengerModel[137] = new ModelRendererTurbo(this, 233, 73, textureX, textureY); // Box 276
		metro2000passengerModel[138] = new ModelRendererTurbo(this, 89, 65, textureX, textureY); // Box 277
		metro2000passengerModel[139] = new ModelRendererTurbo(this, 473, 33, textureX, textureY); // Box 278
		metro2000passengerModel[140] = new ModelRendererTurbo(this, 481, 65, textureX, textureY); // Box 279
		metro2000passengerModel[141] = new ModelRendererTurbo(this, 105, 49, textureX, textureY); // Box 280
		metro2000passengerModel[142] = new ModelRendererTurbo(this, 481, 33, textureX, textureY); // Box 281
		metro2000passengerModel[143] = new ModelRendererTurbo(this, 353, 66, textureX, textureY); // Box 282
		metro2000passengerModel[144] = new ModelRendererTurbo(this, 489, 33, textureX, textureY); // Box 283
		metro2000passengerModel[145] = new ModelRendererTurbo(this, 409, 73, textureX, textureY); // Box 284
		metro2000passengerModel[146] = new ModelRendererTurbo(this, 441, 73, textureX, textureY); // Box 288
		metro2000passengerModel[147] = new ModelRendererTurbo(this, 377, 73, textureX, textureY); // Box 290
		metro2000passengerModel[148] = new ModelRendererTurbo(this, 489, 73, textureX, textureY); // Box 291
		metro2000passengerModel[149] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 292
		metro2000passengerModel[150] = new ModelRendererTurbo(this, 385, 73, textureX, textureY); // Box 295
		metro2000passengerModel[151] = new ModelRendererTurbo(this, 17, 81, textureX, textureY); // Box 296
		metro2000passengerModel[152] = new ModelRendererTurbo(this, 473, 73, textureX, textureY); // Box 297
		metro2000passengerModel[153] = new ModelRendererTurbo(this, 49, 81, textureX, textureY); // Box 299
		metro2000passengerModel[154] = new ModelRendererTurbo(this, 65, 81, textureX, textureY); // Box 300
		metro2000passengerModel[155] = new ModelRendererTurbo(this, 505, 73, textureX, textureY); // Box 302
		metro2000passengerModel[156] = new ModelRendererTurbo(this, 81, 81, textureX, textureY); // Box 303
		metro2000passengerModel[157] = new ModelRendererTurbo(this, 89, 81, textureX, textureY); // Box 306
		metro2000passengerModel[158] = new ModelRendererTurbo(this, 417, 81, textureX, textureY); // Box 1
		metro2000passengerModel[159] = new ModelRendererTurbo(this, 289, 65, textureX, textureY); // Box 4
		metro2000passengerModel[160] = new ModelRendererTurbo(this, 321, 65, textureX, textureY); // Box 5
		metro2000passengerModel[161] = new ModelRendererTurbo(this, 233, 49, textureX, textureY); // Box 13
		metro2000passengerModel[162] = new ModelRendererTurbo(this, 297, 49, textureX, textureY); // Box 14
		metro2000passengerModel[163] = new ModelRendererTurbo(this, 113, 81, textureX, textureY); // Box 16
		metro2000passengerModel[164] = new ModelRendererTurbo(this, 49, 41, textureX, textureY); // Box 28
		metro2000passengerModel[165] = new ModelRendererTurbo(this, 113, 81, textureX, textureY); // Box 35
		metro2000passengerModel[166] = new ModelRendererTurbo(this, 409, 41, textureX, textureY); // Box 39
		metro2000passengerModel[167] = new ModelRendererTurbo(this, 113, 49, textureX, textureY); // Box 41
		metro2000passengerModel[168] = new ModelRendererTurbo(this, 329, 49, textureX, textureY); // Box 45
		metro2000passengerModel[169] = new ModelRendererTurbo(this, 305, 57, textureX, textureY); // Box 46
		metro2000passengerModel[170] = new ModelRendererTurbo(this, 137, 81, textureX, textureY); // Box 47
		metro2000passengerModel[171] = new ModelRendererTurbo(this, 489, 57, textureX, textureY); // Box 49
		metro2000passengerModel[172] = new ModelRendererTurbo(this, 233, 73, textureX, textureY); // Box 56
		metro2000passengerModel[173] = new ModelRendererTurbo(this, 393, 73, textureX, textureY); // Box 57
		metro2000passengerModel[174] = new ModelRendererTurbo(this, 161, 65, textureX, textureY); // Box 58
		metro2000passengerModel[175] = new ModelRendererTurbo(this, 217, 65, textureX, textureY); // Box 59
		metro2000passengerModel[176] = new ModelRendererTurbo(this, 409, 49, textureX, textureY); // Box 60
		metro2000passengerModel[177] = new ModelRendererTurbo(this, 489, 65, textureX, textureY); // Box 61
		metro2000passengerModel[178] = new ModelRendererTurbo(this, 289, 49, textureX, textureY); // Box 62
		metro2000passengerModel[179] = new ModelRendererTurbo(this, 441, 49, textureX, textureY); // Box 63
		metro2000passengerModel[180] = new ModelRendererTurbo(this, 153, 81, textureX, textureY); // Box 41
		metro2000passengerModel[181] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 42
		metro2000passengerModel[182] = new ModelRendererTurbo(this, 169, 81, textureX, textureY); // Box 43
		metro2000passengerModel[183] = new ModelRendererTurbo(this, 81, 65, textureX, textureY); // Box 44
		metro2000passengerModel[184] = new ModelRendererTurbo(this, 473, 65, textureX, textureY); // Box 45
		metro2000passengerModel[185] = new ModelRendererTurbo(this, 185, 81, textureX, textureY); // Box 45
		metro2000passengerModel[186] = new ModelRendererTurbo(this, 201, 81, textureX, textureY); // Box 46
		metro2000passengerModel[187] = new ModelRendererTurbo(this, 257, 81, textureX, textureY); // Box 43
		metro2000passengerModel[188] = new ModelRendererTurbo(this, 265, 81, textureX, textureY); // Box 44
		metro2000passengerModel[189] = new ModelRendererTurbo(this, 281, 81, textureX, textureY); // Box 45
		metro2000passengerModel[190] = new ModelRendererTurbo(this, 65, 73, textureX, textureY); // Box 46
		metro2000passengerModel[191] = new ModelRendererTurbo(this, 297, 81, textureX, textureY); // Box 47
		metro2000passengerModel[192] = new ModelRendererTurbo(this, 305, 81, textureX, textureY); // Box 48
		metro2000passengerModel[193] = new ModelRendererTurbo(this, 121, 57, textureX, textureY); // Box 53
		metro2000passengerModel[194] = new ModelRendererTurbo(this, 505, 65, textureX, textureY); // Box 54
		metro2000passengerModel[195] = new ModelRendererTurbo(this, 417, 81, textureX, textureY); // Box 57
		metro2000passengerModel[196] = new ModelRendererTurbo(this, 417, 81, textureX, textureY); // Box 58
		metro2000passengerModel[197] = new ModelRendererTurbo(this, 417, 81, textureX, textureY); // Box 59
		metro2000passengerModel[198] = new ModelRendererTurbo(this, 89, 73, textureX, textureY); // Box 58
		metro2000passengerModel[199] = new ModelRendererTurbo(this, 105, 73, textureX, textureY); // Box 59
		metro2000passengerModel[200] = new ModelRendererTurbo(this, 369, 73, textureX, textureY); // Box 60
		metro2000passengerModel[201] = new ModelRendererTurbo(this, 433, 81, textureX, textureY); // Box 61
		metro2000passengerModel[202] = new ModelRendererTurbo(this, 481, 81, textureX, textureY); // Box 62
		metro2000passengerModel[203] = new ModelRendererTurbo(this, 97, 89, textureX, textureY); // Box 63
		metro2000passengerModel[204] = new ModelRendererTurbo(this, 105, 89, textureX, textureY); // Box 64
		metro2000passengerModel[205] = new ModelRendererTurbo(this, 113, 89, textureX, textureY); // Box 65
		metro2000passengerModel[206] = new ModelRendererTurbo(this, 121, 89, textureX, textureY); // Box 66
		metro2000passengerModel[207] = new ModelRendererTurbo(this, 145, 89, textureX, textureY); // Box 362
		metro2000passengerModel[208] = new ModelRendererTurbo(this, 185, 89, textureX, textureY); // Box 363
		metro2000passengerModel[209] = new ModelRendererTurbo(this, 217, 89, textureX, textureY); // Box 364
		metro2000passengerModel[210] = new ModelRendererTurbo(this, 137, 89, textureX, textureY); // Box 367
		metro2000passengerModel[211] = new ModelRendererTurbo(this, 233, 89, textureX, textureY); // Box 368
		metro2000passengerModel[212] = new ModelRendererTurbo(this, 177, 89, textureX, textureY); // Box 369
		metro2000passengerModel[213] = new ModelRendererTurbo(this, 249, 89, textureX, textureY); // Box 370
		metro2000passengerModel[214] = new ModelRendererTurbo(this, 265, 89, textureX, textureY); // Box 371
		metro2000passengerModel[215] = new ModelRendererTurbo(this, 281, 89, textureX, textureY); // Box 372
		metro2000passengerModel[216] = new ModelRendererTurbo(this, 297, 89, textureX, textureY); // Box 373
		metro2000passengerModel[217] = new ModelRendererTurbo(this, 313, 89, textureX, textureY); // Box 374
		metro2000passengerModel[218] = new ModelRendererTurbo(this, 329, 89, textureX, textureY); // Box 375
		metro2000passengerModel[219] = new ModelRendererTurbo(this, 345, 89, textureX, textureY); // Box 376
		metro2000passengerModel[220] = new ModelRendererTurbo(this, 361, 89, textureX, textureY); // Box 377
		metro2000passengerModel[221] = new ModelRendererTurbo(this, 377, 89, textureX, textureY); // Box 378
		metro2000passengerModel[222] = new ModelRendererTurbo(this, 393, 89, textureX, textureY); // Box 379
		metro2000passengerModel[223] = new ModelRendererTurbo(this, 409, 89, textureX, textureY); // Box 380
		metro2000passengerModel[224] = new ModelRendererTurbo(this, 425, 89, textureX, textureY); // Box 381
		metro2000passengerModel[225] = new ModelRendererTurbo(this, 441, 89, textureX, textureY); // Box 382
		metro2000passengerModel[226] = new ModelRendererTurbo(this, 457, 89, textureX, textureY); // Box 383
		metro2000passengerModel[227] = new ModelRendererTurbo(this, 473, 89, textureX, textureY); // Box 384
		metro2000passengerModel[228] = new ModelRendererTurbo(this, 489, 89, textureX, textureY); // Box 385
		metro2000passengerModel[229] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 386
		metro2000passengerModel[230] = new ModelRendererTurbo(this, 17, 97, textureX, textureY); // Box 387
		metro2000passengerModel[231] = new ModelRendererTurbo(this, 33, 97, textureX, textureY); // Box 388
		metro2000passengerModel[232] = new ModelRendererTurbo(this, 49, 97, textureX, textureY); // Box 389
		metro2000passengerModel[233] = new ModelRendererTurbo(this, 65, 97, textureX, textureY); // Box 397
		metro2000passengerModel[234] = new ModelRendererTurbo(this, 97, 97, textureX, textureY); // Box 398
		metro2000passengerModel[235] = new ModelRendererTurbo(this, 345, 97, textureX, textureY); // Box 399
		metro2000passengerModel[236] = new ModelRendererTurbo(this, 129, 105, textureX, textureY); // Box 400
		metro2000passengerModel[237] = new ModelRendererTurbo(this, 209, 89, textureX, textureY); // Lamp 2
		metro2000passengerModel[238] = new ModelRendererTurbo(this, 505, 89, textureX, textureY); // Box 223
		metro2000passengerModel[239] = new ModelRendererTurbo(this, 129, 97, textureX, textureY); // Box 83
		metro2000passengerModel[240] = new ModelRendererTurbo(this, 297, 97, textureX, textureY); // Box 52
		metro2000passengerModel[241] = new ModelRendererTurbo(this, 393, 97, textureX, textureY); // Box 413
		metro2000passengerModel[242] = new ModelRendererTurbo(this, 137, 97, textureX, textureY); // Lamp 4
		metro2000passengerModel[243] = new ModelRendererTurbo(this, 265, 97, textureX, textureY); // Box 415
		metro2000passengerModel[244] = new ModelRendererTurbo(this, 297, 105, textureX, textureY); // Box 424
		metro2000passengerModel[245] = new ModelRendererTurbo(this, 306, 106, textureX, textureY); // Box 425
		metro2000passengerModel[246] = new ModelRendererTurbo(this, 162, 82, textureX, textureY); // Box 426
		metro2000passengerModel[247] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 466
		metro2000passengerModel[248] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 467
		metro2000passengerModel[249] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 468
		metro2000passengerModel[250] = new ModelRendererTurbo(this, 233, 9, textureX, textureY); // Box 469
		metro2000passengerModel[251] = new ModelRendererTurbo(this, 161, 17, textureX, textureY); // Box 470
		metro2000passengerModel[252] = new ModelRendererTurbo(this, 433, 17, textureX, textureY); // Box 473
		metro2000passengerModel[253] = new ModelRendererTurbo(this, 129, 25, textureX, textureY); // Box 287
		metro2000passengerModel[254] = new ModelRendererTurbo(this, 433, 25, textureX, textureY); // Box 288
		metro2000passengerModel[255] = new ModelRendererTurbo(this, 153, 33, textureX, textureY); // Box 289
		metro2000passengerModel[256] = new ModelRendererTurbo(this, 161, 33, textureX, textureY); // Box 290
		metro2000passengerModel[257] = new ModelRendererTurbo(this, 41, 41, textureX, textureY); // Box 291
		metro2000passengerModel[258] = new ModelRendererTurbo(this, 217, 49, textureX, textureY); // Box 292
		metro2000passengerModel[259] = new ModelRendererTurbo(this, 297, 49, textureX, textureY); // Box 289
		metro2000passengerModel[260] = new ModelRendererTurbo(this, 409, 41, textureX, textureY); // Box 290
		metro2000passengerModel[261] = new ModelRendererTurbo(this, 105, 73, textureX, textureY); // Box 291
		metro2000passengerModel[262] = new ModelRendererTurbo(this, 369, 73, textureX, textureY); // Box 292
		metro2000passengerModel[263] = new ModelRendererTurbo(this, 265, 81, textureX, textureY); // Box 293
		metro2000passengerModel[264] = new ModelRendererTurbo(this, 201, 81, textureX, textureY); // Box 294
		metro2000passengerModel[265] = new ModelRendererTurbo(this, 113, 81, textureX, textureY); // Box 295
		metro2000passengerModel[266] = new ModelRendererTurbo(this, 441, 49, textureX, textureY); // Box 296
		metro2000passengerModel[267] = new ModelRendererTurbo(this, 409, 49, textureX, textureY); // Box 297
		metro2000passengerModel[268] = new ModelRendererTurbo(this, 161, 65, textureX, textureY); // Box 298
		metro2000passengerModel[269] = new ModelRendererTurbo(this, 113, 81, textureX, textureY); // Box 299
		metro2000passengerModel[270] = new ModelRendererTurbo(this, 169, 81, textureX, textureY); // Box 300
		metro2000passengerModel[271] = new ModelRendererTurbo(this, 81, 65, textureX, textureY); // Box 301
		metro2000passengerModel[272] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 302
		metro2000passengerModel[273] = new ModelRendererTurbo(this, 89, 73, textureX, textureY); // Box 303
		metro2000passengerModel[274] = new ModelRendererTurbo(this, 49, 41, textureX, textureY); // Box 304
		metro2000passengerModel[275] = new ModelRendererTurbo(this, 233, 49, textureX, textureY); // Box 305
		metro2000passengerModel[276] = new ModelRendererTurbo(this, 113, 49, textureX, textureY); // Box 306
		metro2000passengerModel[277] = new ModelRendererTurbo(this, 417, 81, textureX, textureY); // Box 307
		metro2000passengerModel[278] = new ModelRendererTurbo(this, 185, 81, textureX, textureY); // Box 308
		metro2000passengerModel[279] = new ModelRendererTurbo(this, 393, 73, textureX, textureY); // Box 309
		metro2000passengerModel[280] = new ModelRendererTurbo(this, 233, 73, textureX, textureY); // Box 310
		metro2000passengerModel[281] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 311
		metro2000passengerModel[282] = new ModelRendererTurbo(this, 153, 81, textureX, textureY); // Box 312
		metro2000passengerModel[283] = new ModelRendererTurbo(this, 417, 81, textureX, textureY); // Box 313
		metro2000passengerModel[284] = new ModelRendererTurbo(this, 417, 81, textureX, textureY); // Box 314
		metro2000passengerModel[285] = new ModelRendererTurbo(this, 473, 65, textureX, textureY); // Box 315
		metro2000passengerModel[286] = new ModelRendererTurbo(this, 481, 81, textureX, textureY); // Box 316
		metro2000passengerModel[287] = new ModelRendererTurbo(this, 137, 81, textureX, textureY); // Box 317
		metro2000passengerModel[288] = new ModelRendererTurbo(this, 289, 49, textureX, textureY); // Box 318
		metro2000passengerModel[289] = new ModelRendererTurbo(this, 489, 65, textureX, textureY); // Box 319
		metro2000passengerModel[290] = new ModelRendererTurbo(this, 217, 65, textureX, textureY); // Box 320
		metro2000passengerModel[291] = new ModelRendererTurbo(this, 329, 49, textureX, textureY); // Box 321
		metro2000passengerModel[292] = new ModelRendererTurbo(this, 305, 57, textureX, textureY); // Box 322
		metro2000passengerModel[293] = new ModelRendererTurbo(this, 97, 89, textureX, textureY); // Box 323
		metro2000passengerModel[294] = new ModelRendererTurbo(this, 105, 89, textureX, textureY); // Box 324
		metro2000passengerModel[295] = new ModelRendererTurbo(this, 417, 81, textureX, textureY); // Box 325
		metro2000passengerModel[296] = new ModelRendererTurbo(this, 321, 65, textureX, textureY); // Box 326
		metro2000passengerModel[297] = new ModelRendererTurbo(this, 433, 81, textureX, textureY); // Box 327
		metro2000passengerModel[298] = new ModelRendererTurbo(this, 113, 89, textureX, textureY); // Box 328
		metro2000passengerModel[299] = new ModelRendererTurbo(this, 289, 65, textureX, textureY); // Box 329
		metro2000passengerModel[300] = new ModelRendererTurbo(this, 489, 57, textureX, textureY); // Box 330
		metro2000passengerModel[301] = new ModelRendererTurbo(this, 281, 81, textureX, textureY); // Box 333
		metro2000passengerModel[302] = new ModelRendererTurbo(this, 113, 89, textureX, textureY); // Box 334
		metro2000passengerModel[303] = new ModelRendererTurbo(this, 49, 49, textureX, textureY); // Box 335
		metro2000passengerModel[304] = new ModelRendererTurbo(this, 147, 112, textureX, textureY); // Box 336
		metro2000passengerModel[305] = new ModelRendererTurbo(this, 185, 89, textureX, textureY); // Box 337
		metro2000passengerModel[306] = new ModelRendererTurbo(this, 209, 89, textureX, textureY); // Lamp 1
		metro2000passengerModel[307] = new ModelRendererTurbo(this, 297, 105, textureX, textureY); // Box 339
		metro2000passengerModel[308] = new ModelRendererTurbo(this, 505, 89, textureX, textureY); // Box 340
		metro2000passengerModel[309] = new ModelRendererTurbo(this, 297, 97, textureX, textureY); // Box 341
		metro2000passengerModel[310] = new ModelRendererTurbo(this, 265, 97, textureX, textureY); // Box 342
		metro2000passengerModel[311] = new ModelRendererTurbo(this, 393, 97, textureX, textureY); // Box 343
		metro2000passengerModel[312] = new ModelRendererTurbo(this, 137, 97, textureX, textureY); // Lamp3
		metro2000passengerModel[313] = new ModelRendererTurbo(this, 129, 97, textureX, textureY); // Box 345
		metro2000passengerModel[314] = new ModelRendererTurbo(this, 1, 137, textureX, textureY); // Box 332
		metro2000passengerModel[315] = new ModelRendererTurbo(this, 13, 137, textureX, textureY); // Box 333
		metro2000passengerModel[316] = new ModelRendererTurbo(this, 419, 99, textureX, textureY); // Box 173
		metro2000passengerModel[317] = new ModelRendererTurbo(this, 473, 33, textureX, textureY); // Box 335
		metro2000passengerModel[318] = new ModelRendererTurbo(this, 419, 99, textureX, textureY); // Box 336
		metro2000passengerModel[319] = new ModelRendererTurbo(this, 473, 33, textureX, textureY); // Box 337
		metro2000passengerModel[320] = new ModelRendererTurbo(this, 419, 99, textureX, textureY); // Box 338
		metro2000passengerModel[321] = new ModelRendererTurbo(this, 419, 99, textureX, textureY); // Box 339
		metro2000passengerModel[322] = new ModelRendererTurbo(this, 419, 99, textureX, textureY); // Box 340
		metro2000passengerModel[323] = new ModelRendererTurbo(this, 419, 99, textureX, textureY); // Box 341
		metro2000passengerModel[324] = new ModelRendererTurbo(this, 419, 99, textureX, textureY); // Box 342
		metro2000passengerModel[325] = new ModelRendererTurbo(this, 419, 99, textureX, textureY); // Box 343
		metro2000passengerModel[326] = new ModelRendererTurbo(this, 419, 99, textureX, textureY); // Box 344
		metro2000passengerModel[327] = new ModelRendererTurbo(this, 473, 33, textureX, textureY); // Box 345
		metro2000passengerModel[328] = new ModelRendererTurbo(this, 419, 99, textureX, textureY); // Box 346
		metro2000passengerModel[329] = new ModelRendererTurbo(this, 419, 99, textureX, textureY); // Box 347
		metro2000passengerModel[330] = new ModelRendererTurbo(this, 473, 33, textureX, textureY); // Box 348
		metro2000passengerModel[331] = new ModelRendererTurbo(this, 419, 99, textureX, textureY); // Box 349
		metro2000passengerModel[332] = new ModelRendererTurbo(this, 419, 99, textureX, textureY); // Box 350
		metro2000passengerModel[333] = new ModelRendererTurbo(this, 419, 99, textureX, textureY); // Box 351
		metro2000passengerModel[334] = new ModelRendererTurbo(this, 419, 99, textureX, textureY); // Box 352
		metro2000passengerModel[335] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 353
		metro2000passengerModel[336] = new ModelRendererTurbo(this, 1, 111, textureX, textureY); // Box 353
		metro2000passengerModel[337] = new ModelRendererTurbo(this, 1, 111, textureX, textureY); // Box 354
		metro2000passengerModel[338] = new ModelRendererTurbo(this, 201, 33, textureX, textureY); // Box 310
		metro2000passengerModel[339] = new ModelRendererTurbo(this, 297, 33, textureX, textureY); // Box 311
		metro2000passengerModel[340] = new ModelRendererTurbo(this, 345, 33, textureX, textureY); // Box 314
		metro2000passengerModel[341] = new ModelRendererTurbo(this, 369, 33, textureX, textureY); // Box 315
		metro2000passengerModel[342] = new ModelRendererTurbo(this, 361, 33, textureX, textureY); // Box 316
		metro2000passengerModel[343] = new ModelRendererTurbo(this, 393, 33, textureX, textureY); // Box 317
		metro2000passengerModel[344] = new ModelRendererTurbo(this, 385, 33, textureX, textureY); // Box 318
		metro2000passengerModel[345] = new ModelRendererTurbo(this, 265, 97, textureX, textureY); // Box 401

		metro2000passengerModel[0].addShapeBox(0F, 0F, 0F, 53, 1, 20, 0F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -2.25F, 0F, 0F, -2.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F); // Box 44
		metro2000passengerModel[0].setRotationPoint(-27.5F, 4F, -10.5F);

		metro2000passengerModel[1].addShapeBox(0F, 0F, 0F, 1, 8, 18, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 171
		metro2000passengerModel[1].setRotationPoint(-24F, -4F, -9.5F);

		metro2000passengerModel[2].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 277
		metro2000passengerModel[2].setRotationPoint(-28.5F, -1F, -6.5F);

		metro2000passengerModel[3].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 278
		metro2000passengerModel[3].setRotationPoint(-28.5F, -1F, -3.5F);

		metro2000passengerModel[4].addBox(0F, 0F, 0F, 6, 1, 2, 0F); // Box 32
		metro2000passengerModel[4].setRotationPoint(-35F, 6.5F, -1F);

		metro2000passengerModel[5].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 33
		metro2000passengerModel[5].setRotationPoint(-36F, 6F, -2F);

		metro2000passengerModel[6].addBox(0F, 0F, 0F, 3, 1, 6, 0F); // Box 174
		metro2000passengerModel[6].setRotationPoint(-32.8F, -3F, -7F);

		metro2000passengerModel[7].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F, -0.5F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 175
		metro2000passengerModel[7].setRotationPoint(-33.1F, -5F, -7F);

		metro2000passengerModel[8].addShapeBox(0F, 0F, 0F, 1, 5, 2, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 182
		metro2000passengerModel[8].setRotationPoint(-26F, -6F, -5.5F);

		metro2000passengerModel[9].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 183
		metro2000passengerModel[9].setRotationPoint(-26.5F, -5F, -3.5F);

		metro2000passengerModel[10].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F); // Box 184
		metro2000passengerModel[10].setRotationPoint(-26.5F, -5F, -6.5F);

		metro2000passengerModel[11].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 185
		metro2000passengerModel[11].setRotationPoint(-28.5F, -1F, -6.5F);

		metro2000passengerModel[12].addShapeBox(0F, 0F, 0F, 62, 1, 10, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 1F, 1F, 0F, 1F); // Box 93
		metro2000passengerModel[12].setRotationPoint(-31.5F, -16.75F, -4.75F);

		metro2000passengerModel[13].addShapeBox(0F, 0F, 0F, 2, 7, 20, 0F, -0.5F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, -0.4F, -2.3F, 0F, 0F, -1.25F, 0F, 0F, -0.25F, -0.5F, -0.4F, -1.3F); // Box 170
		metro2000passengerModel[13].setRotationPoint(-34.5F, -4F, -10.5F);

		metro2000passengerModel[14].addShapeBox(0F, 0F, 0F, 2, 11, 13, 0F, -0.5F, 0F, -1.75F, 0F, 0F, -0.75F, 0F, 0F, -1.5F, -0.5F, 0F, -1.5F, -0.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1.5F, -0.5F, 0F, -1.5F); // Box 171
		metro2000passengerModel[14].setRotationPoint(-34.5F, -15F, -9.5F);

		metro2000passengerModel[15].addShapeBox(0F, 0F, 0F, 62, 2, 2, 0F, 1F, -0.7F, 1.25F, 0F, -0.7F, 1.25F, 0F, -0.25F, 0.5F, 1F, -0.25F, 0.5F, 1F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 1F, 0F, -1.5F); // Box 183
		metro2000passengerModel[15].setRotationPoint(-31.5F, -17F, -7.25F);

		metro2000passengerModel[16].addShapeBox(0F, 0F, 0F, 62, 2, 2, 0F, 1F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.7F, 1.25F, 1F, -0.7F, 1.25F, 1F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 1F, 0F, 1.5F); // Box 184
		metro2000passengerModel[16].setRotationPoint(-31.5F, -17F, 5.25F);

		metro2000passengerModel[17].addShapeBox(0F, 0F, 0F, 11, 11, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F); // Box 201
		metro2000passengerModel[17].setRotationPoint(-32.5F, -15F, 7.75F);

		metro2000passengerModel[18].addShapeBox(0F, 0F, 0F, 6, 8, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 202
		metro2000passengerModel[18].setRotationPoint(-27.5F, -4F, 8.5F);

		metro2000passengerModel[19].addShapeBox(0F, 0F, 0F, 63, 2, 2, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 210
		metro2000passengerModel[19].setRotationPoint(-32.5F, -16F, -7.75F);

		metro2000passengerModel[20].addShapeBox(0F, 0F, 0F, 1, 10, 18, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 229
		metro2000passengerModel[20].setRotationPoint(-24F, -14F, -9.5F);

		metro2000passengerModel[21].addShapeBox(0F, 0F, 0F, 1, 2, 16, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 230
		metro2000passengerModel[21].setRotationPoint(-24F, -16F, -9F);

		metro2000passengerModel[22].addBox(0F, 0F, 0F, 5, 2, 8, 0F); // Box 231
		metro2000passengerModel[22].setRotationPoint(-29.5F, -18.5F, -4F);

		metro2000passengerModel[23].addShapeBox(0F, 0F, 0F, 3, 8, 1, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 292
		metro2000passengerModel[23].setRotationPoint(-11F, -4F, -8.5F);

		metro2000passengerModel[24].addShapeBox(0F, 0F, 0F, 1, 10, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 293
		metro2000passengerModel[24].setRotationPoint(-24F, -14F, -8F);

		metro2000passengerModel[25].addBox(0F, 0F, 0F, 1, 8, 1, 0F); // Box 294
		metro2000passengerModel[25].setRotationPoint(-24F, -4F, -9F);

		metro2000passengerModel[26].addShapeBox(0F, 0F, 0F, 1, 10, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 295
		metro2000passengerModel[26].setRotationPoint(-24F, -14F, 7F);

		metro2000passengerModel[27].addBox(0F, 0F, 0F, 1, 8, 1, 0F); // Box 296
		metro2000passengerModel[27].setRotationPoint(-24F, -4F, 8F);

		metro2000passengerModel[28].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 407
		metro2000passengerModel[28].setRotationPoint(-22.5F, 5F, -1.5F);

		metro2000passengerModel[29].addShapeBox(0F, 0F, 0F, 2, 11, 4, 0F, -0.5F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -0.75F, -0.5F, 0F, -1.75F, -0.5F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, -0.5F, 0F, -1F); // Box 411
		metro2000passengerModel[29].setRotationPoint(-34.5F, -15F, 5.5F);

		metro2000passengerModel[30].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.15F, 0F, -0.35F, -0.45F, 0F, -0.35F, -0.45F, 0F, 0F, -0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 235
		metro2000passengerModel[30].setRotationPoint(-30F, -3F, -8F);

		metro2000passengerModel[31].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.35F, -0.45F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, -0.35F, -0.45F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 236
		metro2000passengerModel[31].setRotationPoint(-31F, -3F, -8F);

		metro2000passengerModel[32].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F); // Box 238
		metro2000passengerModel[32].setRotationPoint(-30.5F, -3.8F, -8F);

		metro2000passengerModel[33].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 37
		metro2000passengerModel[33].setRotationPoint(-30.5F, -4.6F, -8F);

		metro2000passengerModel[34].addShapeBox(0F, 0F, 0F, 3, 6, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0F, 0F); // Box 418
		metro2000passengerModel[34].setRotationPoint(-31.5F, -2F, -8.5F);

		metro2000passengerModel[35].addBox(0F, 0F, 0F, 3, 6, 1, 0F); // Box 419
		metro2000passengerModel[35].setRotationPoint(-32.5F, -2F, -1F);

		metro2000passengerModel[36].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 421
		metro2000passengerModel[36].setRotationPoint(-27.5F, 0F, -5F);

		metro2000passengerModel[37].addShapeBox(0F, 0F, 0F, 3, 10, 1, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 275
		metro2000passengerModel[37].setRotationPoint(-10.99F, -14F, -8F);

		metro2000passengerModel[38].addShapeBox(0F, 0F, 0F, 9, 8, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 281
		metro2000passengerModel[38].setRotationPoint(16.5F, -4F, 8.5F);

		metro2000passengerModel[39].addShapeBox(0F, 0F, 0F, 5, 8, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, -1F, -0.25F); // Box 292
		metro2000passengerModel[39].setRotationPoint(-32.5F, -4F, 8.5F);

		metro2000passengerModel[40].addShapeBox(0F, 0F, 0F, 5, 1, 17, 0F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 293
		metro2000passengerModel[40].setRotationPoint(-32.5F, 4F, -9F);

		metro2000passengerModel[41].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 294
		metro2000passengerModel[41].setRotationPoint(-32.5F, 3F, 7.5F);

		metro2000passengerModel[42].addShapeBox(0F, 0F, 0F, 5, 8, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, -1F, 0.25F); // Box 295
		metro2000passengerModel[42].setRotationPoint(-32.5F, -4F, -9.5F);

		metro2000passengerModel[43].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F, 0F, 0F, 0.75F, 0F, -1F, 0.75F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 296
		metro2000passengerModel[43].setRotationPoint(-32.5F, 3F, -8.5F);

		metro2000passengerModel[44].addShapeBox(0F, 0F, 0F, 2, 2, 20, 0F, -0.5F, 0.4F, -2.3F, 0F, 0F, -1.25F, 0F, 0F, -0.25F, -0.5F, 0.4F, -1.3F, -0.5F, -0.25F, -3.25F, 0F, 0F, -2.25F, 0F, 0F, -1.25F, -0.5F, -0.225F, -2.25F); // Box 297
		metro2000passengerModel[44].setRotationPoint(-34.5F, 3F, -10.5F);

		metro2000passengerModel[45].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 1F, -0.5F, 0F); // Box 298
		metro2000passengerModel[45].setRotationPoint(-34.5F, 4.5F, -7F);

		metro2000passengerModel[46].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 299
		metro2000passengerModel[46].setRotationPoint(-34.5F, 4.5F, 3F);

		metro2000passengerModel[47].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F, 1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 1F, -0.5F, 0F); // Box 300
		metro2000passengerModel[47].setRotationPoint(-34.5F, 4.5F, -4F);

		metro2000passengerModel[48].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F, -0.9F, -0.25F, -1.25F, 0F, -0.25F, -1.25F, 0F, -0.7F, -1F, -0.9F, -0.7F, -1F, 0.5F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -0.75F, 0.5F, 0F, -1.75F); // Box 305
		metro2000passengerModel[48].setRotationPoint(-33.5F, -17F, 3.5F);

		metro2000passengerModel[49].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F, -0.9F, -0.7F, -1F, 0F, -0.7F, -1F, 0F, -0.25F, -1.25F, -0.9F, -0.25F, -1.25F, 0.5F, 0F, -1.75F, 0F, 0F, -0.75F, 0F, 0F, -1.25F, 0.5F, 0F, -1.25F); // Box 306
		metro2000passengerModel[49].setRotationPoint(-33.5F, -17F, -9.5F);

		metro2000passengerModel[50].addShapeBox(0F, 0F, 0F, 1, 2, 11, 0F, -0.9F, -0.25F, -1.25F, 0F, -0.25F, -1.25F, 0F, -0.25F, -0.25F, -0.9F, -0.25F, -0.25F, 0.5F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -0.25F, 0.5F, 0F, -0.25F); // Box 307
		metro2000passengerModel[50].setRotationPoint(-33.5F, -17F, -6F);

		metro2000passengerModel[51].addShapeBox(0F, 0F, 0F, 5, 8, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, -0.5F, 0.25F, 0F, -1F, -0.25F, 0F, 0F, -0.25F); // Box 308
		metro2000passengerModel[51].setRotationPoint(25.5F, -4F, 8.5F);

		metro2000passengerModel[52].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0.75F, 0F, -1F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 309
		metro2000passengerModel[52].setRotationPoint(25.5F, 3F, 7.5F);

		metro2000passengerModel[53].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F, 0F, -1F, 0.75F, 0F, 0F, 0.75F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 312
		metro2000passengerModel[53].setRotationPoint(25.5F, 3F, -8.5F);

		metro2000passengerModel[54].addShapeBox(0F, 0F, 0F, 5, 8, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -1F, -0.25F, 0F, -0.5F, 0.25F, 0F, 0F, 0.25F); // Box 313
		metro2000passengerModel[54].setRotationPoint(25.5F, -4F, -9.5F);

		metro2000passengerModel[55].addShapeBox(0F, 0F, 0F, 5, 1, 17, 0F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 319
		metro2000passengerModel[55].setRotationPoint(25.5F, 4F, -9F);

		metro2000passengerModel[56].addBox(0F, 0F, 0F, 1, 18, 1, 0F); // Box 320
		metro2000passengerModel[56].setRotationPoint(32F, -14F, 3F);

		metro2000passengerModel[57].addBox(0F, 0F, 0F, 1, 8, 1, 0F); // Box 321
		metro2000passengerModel[57].setRotationPoint(32F, -4F, -4F);

		metro2000passengerModel[58].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F, 0F, 1F, -2F, 0F, 1F, -2F, 0F, 1F, 2F, 0F, 1F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 332
		metro2000passengerModel[58].setRotationPoint(-8.5F, -15.4F, 4.5F);

		metro2000passengerModel[59].addShapeBox(0F, 0F, 0F, 0, 1, 10, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 333
		metro2000passengerModel[59].setRotationPoint(-8.5F, -14.4F, -5F);

		metro2000passengerModel[60].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F, 0F, 1F, 2F, 0F, 1F, 2F, 0F, 1F, -2F, 0F, 1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 334
		metro2000passengerModel[60].setRotationPoint(-8.5F, -15.4F, -5.5F);

		metro2000passengerModel[61].addShapeBox(0F, 0F, 0F, 1, 11, 6, 0F, 0F, 0F, -1F, 0.5F, 0F, -1F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0.5F, 0F, -1F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 360
		metro2000passengerModel[61].setRotationPoint(-34F, -15F, 1F);

		metro2000passengerModel[62].addShapeBox(0F, 0F, 0F, 9, 8, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 369
		metro2000passengerModel[62].setRotationPoint(16.5F, -4F, -9.5F);

		metro2000passengerModel[63].addShapeBox(0F, 0F, 0F, 6, 8, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 386
		metro2000passengerModel[63].setRotationPoint(-15.5F, -4F, -9.5F);

		metro2000passengerModel[64].addShapeBox(0F, 0F, 0F, 11, 11, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 387
		metro2000passengerModel[64].setRotationPoint(-32.5F, -15F, -8.75F);

		metro2000passengerModel[65].addShapeBox(0F, 0F, 0F, 6, 8, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 388
		metro2000passengerModel[65].setRotationPoint(-27.5F, -4F, -9.5F);

		metro2000passengerModel[66].addShapeBox(0F, 0F, 0F, 5, 5, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 394
		metro2000passengerModel[66].setRotationPoint(-10.5F, 5F, 0F);

		metro2000passengerModel[67].addShapeBox(0F, 0F, 0F, 9, 3, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 395
		metro2000passengerModel[67].setRotationPoint(-3F, -19.5F, -7F);

		metro2000passengerModel[68].addBox(0F, 0F, 0F, 16, 3, 12, 0F); // Box 396
		metro2000passengerModel[68].setRotationPoint(-19.5F, -19F, -6F);

		metro2000passengerModel[69].addBox(0F, 0F, 0F, 11, 3, 12, 0F); // Box 405
		metro2000passengerModel[69].setRotationPoint(6.5F, -19F, -6F);

		metro2000passengerModel[70].addShapeBox(0F, 0F, 0F, 1, 10, 0, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 406
		metro2000passengerModel[70].setRotationPoint(-35F, -8F, 2.5F);

		metro2000passengerModel[71].addShapeBox(0F, 0F, 0F, 1, 10, 0, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 407
		metro2000passengerModel[71].setRotationPoint(-35F, -8F, 8F);

		metro2000passengerModel[72].addBox(0F, 0F, 0F, 12, 3, 2, 0F); // Box 421
		metro2000passengerModel[72].setRotationPoint(-8.5F, 1F, 6.5F);

		metro2000passengerModel[73].addShapeBox(0F, -3F, 0F, 1, 2, 3, 0F, 0F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 422
		metro2000passengerModel[73].setRotationPoint(3F, 0.7F, 4.5F);
		metro2000passengerModel[73].rotateAngleX = -0.06981317F;

		metro2000passengerModel[74].addShapeBox(0F, 0F, 0F, 12, 1, 4, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 423
		metro2000passengerModel[74].setRotationPoint(-8.5F, 0F, 4.5F);

		metro2000passengerModel[75].addShapeBox(0F, 0F, 0F, 12, 4, 1, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 424
		metro2000passengerModel[75].setRotationPoint(-8.5F, -4F, 7.5F);

		metro2000passengerModel[76].addShapeBox(0F, -3F, 0F, 1, 2, 3, 0F, 0F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 425
		metro2000passengerModel[76].setRotationPoint(-8.5F, 0.7F, 4.5F);
		metro2000passengerModel[76].rotateAngleX = -0.06981317F;

		metro2000passengerModel[77].addShapeBox(0F, 0F, 0F, 0, 9, 1, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, -0.5F, 0F, 1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 428
		metro2000passengerModel[77].setRotationPoint(3.25F, -11F, 4F);

		metro2000passengerModel[78].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 1F, -1F, 0F, 1F, -1F, 0F, 1F, 0.5F, 0F, 1F, 0.5F); // Box 429
		metro2000passengerModel[78].setRotationPoint(3.25F, -2F, 4F);

		metro2000passengerModel[79].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F, 0F, 1F, -1.5F, 0F, 1F, -1.5F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 430
		metro2000passengerModel[79].setRotationPoint(3.25F, -14F, 4F);

		metro2000passengerModel[80].addBox(0F, 0F, 0F, 12, 3, 2, 0F); // Box 443
		metro2000passengerModel[80].setRotationPoint(-8.5F, 1F, -8.5F);

		metro2000passengerModel[81].addShapeBox(0F, 0F, 0F, 12, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 444
		metro2000passengerModel[81].setRotationPoint(-8.5F, 0F, -8.5F);

		metro2000passengerModel[82].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 445
		metro2000passengerModel[82].setRotationPoint(3F, -2.1F, -7.7F);
		metro2000passengerModel[82].rotateAngleX = 0.06981317F;

		metro2000passengerModel[83].addShapeBox(0F, 0F, 0F, 12, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 446
		metro2000passengerModel[83].setRotationPoint(-8.5F, -4F, -8.5F);

		metro2000passengerModel[84].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 447
		metro2000passengerModel[84].setRotationPoint(-8.5F, -2.1F, -7.7F);
		metro2000passengerModel[84].rotateAngleX = 0.06981317F;

		metro2000passengerModel[85].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F, 0F, 1F, -2F, 0F, 1F, -2F, 0F, 1F, 2F, 0F, 1F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 219
		metro2000passengerModel[85].setRotationPoint(4F, -15.4F, 4.5F);

		metro2000passengerModel[86].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F, 0F, 1F, 2F, 0F, 1F, 2F, 0F, 1F, -2F, 0F, 1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 220
		metro2000passengerModel[86].setRotationPoint(4F, -15.4F, -5.5F);

		metro2000passengerModel[87].addShapeBox(0F, 0F, 0F, 14, 8, 1, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 219
		metro2000passengerModel[87].setRotationPoint(-9.5F, -4F, -9.25F);

		metro2000passengerModel[88].addShapeBox(0F, 0F, 0F, 6, 8, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 221
		metro2000passengerModel[88].setRotationPoint(-21.5F, -4F, -9.5F);

		metro2000passengerModel[89].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 223
		metro2000passengerModel[89].setRotationPoint(-3F, -15F, -8.75F);

		metro2000passengerModel[90].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.75F, 0.5F, 0F, 0.75F, 0.5F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 225
		metro2000passengerModel[90].setRotationPoint(3F, -15F, -8.75F);

		metro2000passengerModel[91].addShapeBox(0F, 0F, 0F, 6, 8, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 226
		metro2000passengerModel[91].setRotationPoint(10.5F, -4F, -9.5F);

		metro2000passengerModel[92].addShapeBox(0F, 0F, 0F, 6, 8, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 227
		metro2000passengerModel[92].setRotationPoint(4.5F, -4F, -9.5F);

		metro2000passengerModel[93].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.75F, 0.5F, 0F, 0.75F, 0.5F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 231
		metro2000passengerModel[93].setRotationPoint(29F, -15F, -8.75F);

		metro2000passengerModel[94].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 232
		metro2000passengerModel[94].setRotationPoint(23F, -15F, -8.75F);

		metro2000passengerModel[95].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.75F, 0.5F, 0F, 0.75F, 0.5F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 234
		metro2000passengerModel[95].setRotationPoint(16.5F, -15F, -8.75F);

		metro2000passengerModel[96].addShapeBox(0F, 0F, 0F, 2, 11, 5, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 235
		metro2000passengerModel[96].setRotationPoint(30.5F, -15F, -2.5F);

		metro2000passengerModel[97].addShapeBox(0F, -3F, 0F, 1, 2, 3, 0F, 0F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 236
		metro2000passengerModel[97].setRotationPoint(-3F, 0.7F, 4.5F);
		metro2000passengerModel[97].rotateAngleX = -0.06981317F;

		metro2000passengerModel[98].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 1F, -1F, 0F, 1F, -1F, 0F, 1F, 0.5F, 0F, 1F, 0.5F); // Box 237
		metro2000passengerModel[98].setRotationPoint(-8.25F, -2F, 4F);

		metro2000passengerModel[99].addShapeBox(0F, 0F, 0F, 0, 9, 1, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, -0.5F, 0F, 1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 238
		metro2000passengerModel[99].setRotationPoint(-8.25F, -11F, 4F);

		metro2000passengerModel[100].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F, 0F, 1F, -1.5F, 0F, 1F, -1.5F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 239
		metro2000passengerModel[100].setRotationPoint(-8.25F, -14F, 4F);

		metro2000passengerModel[101].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0.5F, 0F, 1F, 0.5F, 0F, 1F, -1F, 0F, 1F, -1F); // Box 240
		metro2000passengerModel[101].setRotationPoint(3.25F, -2F, -5F);

		metro2000passengerModel[102].addShapeBox(0F, 0F, 0F, 0, 9, 1, 0F, 0F, 1F, -0.5F, 0F, 1F, -0.5F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 241
		metro2000passengerModel[102].setRotationPoint(3.25F, -11F, -5F);

		metro2000passengerModel[103].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0.5F, 0F, 1F, 0.5F, 0F, 1F, -1F, 0F, 1F, -1F); // Box 242
		metro2000passengerModel[103].setRotationPoint(-8.25F, -2F, -5F);

		metro2000passengerModel[104].addShapeBox(0F, 0F, 0F, 0, 9, 1, 0F, 0F, 1F, -0.5F, 0F, 1F, -0.5F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 243
		metro2000passengerModel[104].setRotationPoint(-8.25F, -11F, -5F);

		metro2000passengerModel[105].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F, -1.5F, 0F, 1F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 244
		metro2000passengerModel[105].setRotationPoint(-8.25F, -14F, -5F);

		metro2000passengerModel[106].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F, -1.5F, 0F, 1F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 245
		metro2000passengerModel[106].setRotationPoint(3.25F, -14F, -5F);

		metro2000passengerModel[107].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.75F, 0.5F, 0F, 0.75F, 0.5F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 246
		metro2000passengerModel[107].setRotationPoint(-9.5F, -15F, -8.75F);

		metro2000passengerModel[108].addShapeBox(0F, 0F, 0F, 3, 8, 1, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 247
		metro2000passengerModel[108].setRotationPoint(-23.5F, -4F, -8.5F);

		metro2000passengerModel[109].addShapeBox(0F, 0F, 0F, 3, 10, 1, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 248
		metro2000passengerModel[109].setRotationPoint(-23.49F, -14F, -8F);

		metro2000passengerModel[110].addShapeBox(0F, 0F, 0F, 3, 8, 1, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 249
		metro2000passengerModel[110].setRotationPoint(2.5F, -4F, -8.5F);

		metro2000passengerModel[111].addShapeBox(0F, 0F, 0F, 3, 10, 1, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 250
		metro2000passengerModel[111].setRotationPoint(2.51F, -14F, -8F);

		metro2000passengerModel[112].addShapeBox(0F, 0F, 0F, 3, 8, 1, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 251
		metro2000passengerModel[112].setRotationPoint(15F, -4F, -8.5F);

		metro2000passengerModel[113].addShapeBox(0F, 0F, 0F, 3, 10, 1, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 252
		metro2000passengerModel[113].setRotationPoint(15.01F, -14F, -8F);

		metro2000passengerModel[114].addShapeBox(0F, -3F, 0F, 1, 2, 3, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 253
		metro2000passengerModel[114].setRotationPoint(-3F, 0.9F, -7.5F);
		metro2000passengerModel[114].rotateAngleX = 0.06981317F;

		metro2000passengerModel[115].addShapeBox(0F, 0F, 0F, 0, 1, 10, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 254
		metro2000passengerModel[115].setRotationPoint(4F, -14.4F, -5F);

		metro2000passengerModel[116].addBox(0F, 0F, 0F, 12, 3, 2, 0F); // Box 255
		metro2000passengerModel[116].setRotationPoint(18F, 1F, 6.5F);

		metro2000passengerModel[117].addShapeBox(0F, 0F, 0F, 12, 1, 4, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 256
		metro2000passengerModel[117].setRotationPoint(18F, 0F, 4.5F);

		metro2000passengerModel[118].addShapeBox(0F, -3F, 0F, 1, 2, 3, 0F, 0F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 257
		metro2000passengerModel[118].setRotationPoint(18F, 0.7F, 4.5F);
		metro2000passengerModel[118].rotateAngleX = -0.06981317F;

		metro2000passengerModel[119].addShapeBox(0F, 0F, 0F, 12, 4, 1, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 258
		metro2000passengerModel[119].setRotationPoint(18F, -4F, 7.5F);

		metro2000passengerModel[120].addShapeBox(0F, -3F, 0F, 1, 2, 3, 0F, 0F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 259
		metro2000passengerModel[120].setRotationPoint(23.5F, 0.7F, 4.5F);
		metro2000passengerModel[120].rotateAngleX = -0.06981317F;

		metro2000passengerModel[121].addShapeBox(0F, -3F, 0F, 1, 2, 3, 0F, 0F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 260
		metro2000passengerModel[121].setRotationPoint(29.5F, 0.7F, 4.5F);
		metro2000passengerModel[121].rotateAngleX = -0.06981317F;

		metro2000passengerModel[122].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 1F, -1F, 0F, 1F, -1F, 0F, 1F, 0.5F, 0F, 1F, 0.5F); // Box 261
		metro2000passengerModel[122].setRotationPoint(29.75F, -2F, 4F);

		metro2000passengerModel[123].addShapeBox(0F, 0F, 0F, 0, 9, 1, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, -0.5F, 0F, 1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 262
		metro2000passengerModel[123].setRotationPoint(29.75F, -11F, 4F);

		metro2000passengerModel[124].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 1F, -1F, 0F, 1F, -1F, 0F, 1F, 0.5F, 0F, 1F, 0.5F); // Box 263
		metro2000passengerModel[124].setRotationPoint(18.25F, -2F, 4F);

		metro2000passengerModel[125].addShapeBox(0F, 0F, 0F, 0, 9, 1, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, -0.5F, 0F, 1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 264
		metro2000passengerModel[125].setRotationPoint(18.25F, -11F, 4F);

		metro2000passengerModel[126].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F, 0F, 1F, -1.5F, 0F, 1F, -1.5F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 265
		metro2000passengerModel[126].setRotationPoint(18.25F, -14F, 4F);

		metro2000passengerModel[127].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F, 0F, 1F, -1.5F, 0F, 1F, -1.5F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 266
		metro2000passengerModel[127].setRotationPoint(29.75F, -14F, 4F);

		metro2000passengerModel[128].addShapeBox(0F, 0F, 0F, 12, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 267
		metro2000passengerModel[128].setRotationPoint(18F, 0F, -8.5F);

		metro2000passengerModel[129].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 268
		metro2000passengerModel[129].setRotationPoint(29.5F, -2.1F, -7.7F);
		metro2000passengerModel[129].rotateAngleX = 0.06981317F;

		metro2000passengerModel[130].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0.5F, 0F, 1F, 0.5F, 0F, 1F, -1F, 0F, 1F, -1F); // Box 269
		metro2000passengerModel[130].setRotationPoint(29.75F, -2F, -5F);

		metro2000passengerModel[131].addShapeBox(0F, 0F, 0F, 0, 9, 1, 0F, 0F, 1F, -0.5F, 0F, 1F, -0.5F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 270
		metro2000passengerModel[131].setRotationPoint(29.75F, -11F, -5F);

		metro2000passengerModel[132].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F, -1.5F, 0F, 1F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 271
		metro2000passengerModel[132].setRotationPoint(29.75F, -14F, -5F);

		metro2000passengerModel[133].addShapeBox(0F, 0F, 0F, 0, 1, 10, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 272
		metro2000passengerModel[133].setRotationPoint(30F, -14.4F, -5F);

		metro2000passengerModel[134].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F, 0F, 1F, 2F, 0F, 1F, 2F, 0F, 1F, -2F, 0F, 1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 273
		metro2000passengerModel[134].setRotationPoint(30F, -15.4F, -5.5F);

		metro2000passengerModel[135].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F, 0F, 1F, -2F, 0F, 1F, -2F, 0F, 1F, 2F, 0F, 1F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 274
		metro2000passengerModel[135].setRotationPoint(30F, -15.4F, 4.5F);

		metro2000passengerModel[136].addShapeBox(0F, -3F, 0F, 1, 2, 3, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 275
		metro2000passengerModel[136].setRotationPoint(23.5F, 0.9F, -7.5F);
		metro2000passengerModel[136].rotateAngleX = 0.05235988F;

		metro2000passengerModel[137].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 276
		metro2000passengerModel[137].setRotationPoint(18F, -2.1F, -7.7F);
		metro2000passengerModel[137].rotateAngleX = 0.06981317F;

		metro2000passengerModel[138].addShapeBox(0F, 0F, 0F, 12, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 277
		metro2000passengerModel[138].setRotationPoint(18F, -4F, -8.5F);

		metro2000passengerModel[139].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0.5F, 0F, 1F, 0.5F, 0F, 1F, -1F, 0F, 1F, -1F); // Box 278
		metro2000passengerModel[139].setRotationPoint(18.25F, -2F, -5F);

		metro2000passengerModel[140].addShapeBox(0F, 0F, 0F, 0, 9, 1, 0F, 0F, 1F, -0.5F, 0F, 1F, -0.5F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 279
		metro2000passengerModel[140].setRotationPoint(18.25F, -11F, -5F);

		metro2000passengerModel[141].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F, -1.5F, 0F, 1F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 280
		metro2000passengerModel[141].setRotationPoint(18.25F, -14F, -5F);

		metro2000passengerModel[142].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F, 0F, 1F, 2F, 0F, 1F, 2F, 0F, 1F, -2F, 0F, 1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 281
		metro2000passengerModel[142].setRotationPoint(17.5F, -15.4F, -5.5F);

		metro2000passengerModel[143].addShapeBox(0F, 0F, 0F, 0, 1, 10, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 282
		metro2000passengerModel[143].setRotationPoint(17.5F, -14.4F, -5F);

		metro2000passengerModel[144].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F, 0F, 1F, -2F, 0F, 1F, -2F, 0F, 1F, 2F, 0F, 1F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 283
		metro2000passengerModel[144].setRotationPoint(17.5F, -15.4F, 4.5F);

		metro2000passengerModel[145].addBox(0F, 0F, 0F, 12, 3, 2, 0F); // Box 284
		metro2000passengerModel[145].setRotationPoint(18F, 1F, -8.5F);

		metro2000passengerModel[146].addShapeBox(0F, 0F, 0F, 14, 8, 1, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 288
		metro2000passengerModel[146].setRotationPoint(-9.5F, -4F, 8.25F);

		metro2000passengerModel[147].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0.5F, 0F, -0.75F, 0.5F, 0F, 0.75F, 0F, 0F, 0.75F); // Box 290
		metro2000passengerModel[147].setRotationPoint(-9.5F, -15F, 7.75F);

		metro2000passengerModel[148].addShapeBox(0F, 0F, 0F, 6, 8, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 291
		metro2000passengerModel[148].setRotationPoint(-15.5F, -4F, 8.5F);

		metro2000passengerModel[149].addShapeBox(0F, 0F, 0F, 6, 8, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 292
		metro2000passengerModel[149].setRotationPoint(-21.5F, -4F, 8.5F);

		metro2000passengerModel[150].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F); // Box 295
		metro2000passengerModel[150].setRotationPoint(-3F, -15F, 7.75F);

		metro2000passengerModel[151].addShapeBox(0F, 0F, 0F, 11, 11, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, 0.75F, 0F, 0F, 0.75F); // Box 296
		metro2000passengerModel[151].setRotationPoint(-8F, -15F, 7.75F);

		metro2000passengerModel[152].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0.5F, 0F, -0.75F, 0.5F, 0F, 0.75F, 0F, 0F, 0.75F); // Box 297
		metro2000passengerModel[152].setRotationPoint(3F, -15F, 7.75F);

		metro2000passengerModel[153].addShapeBox(0F, 0F, 0F, 6, 8, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 299
		metro2000passengerModel[153].setRotationPoint(4.5F, -4F, 8.5F);

		metro2000passengerModel[154].addShapeBox(0F, 0F, 0F, 6, 8, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 300
		metro2000passengerModel[154].setRotationPoint(10.5F, -4F, 8.5F);

		metro2000passengerModel[155].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0.5F, 0F, -0.75F, 0.5F, 0F, 0.75F, 0F, 0F, 0.75F); // Box 302
		metro2000passengerModel[155].setRotationPoint(16.5F, -15F, 7.75F);

		metro2000passengerModel[156].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F); // Box 303
		metro2000passengerModel[156].setRotationPoint(23F, -15F, 7.75F);

		metro2000passengerModel[157].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0.5F, 0F, -0.75F, 0.5F, 0F, 0.75F, 0F, 0F, 0.75F); // Box 306
		metro2000passengerModel[157].setRotationPoint(29F, -15F, 7.75F);

		metro2000passengerModel[158].addBox(-2.5F, -2.5F, 0F, 5, 5, 0, 0F); // Box 1
		metro2000passengerModel[158].setRotationPoint(-27.25F, 8F, 5F);

		metro2000passengerModel[159].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 4
		metro2000passengerModel[159].setRotationPoint(-15.25F, 7.5F, -6F);

		metro2000passengerModel[160].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 5
		metro2000passengerModel[160].setRotationPoint(-27.75F, 7.5F, -6F);

		metro2000passengerModel[161].addBox(0F, 0F, 0F, 3, 2, 1, 0F); // Box 13
		metro2000passengerModel[161].setRotationPoint(-16.5F, 5F, 6F);

		metro2000passengerModel[162].addBox(0F, 0F, 0F, 3, 2, 1, 0F); // Box 14
		metro2000passengerModel[162].setRotationPoint(-28.5F, 5F, 6F);

		metro2000passengerModel[163].addShapeBox(0F, -1F, 0F, 3, 3, 1, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 16
		metro2000passengerModel[163].setRotationPoint(-22.5F, 6.5F, 6F);

		metro2000passengerModel[164].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F); // Box 28
		metro2000passengerModel[164].setRotationPoint(-15.75F, 7.5F, 6.2F);

		metro2000passengerModel[165].addShapeBox(0F, 0F, 0F, 3, 1, 14, 0F, 0F, 0F, 1.5F, 0F, 0F, 1F, 0F, 0F, 1.5F, 0F, 0F, 1F, 0F, 0F, 1.5F, 0F, 0F, 1F, 0F, 0F, 1.5F, 0F, 0F, 1F); // Box 35
		metro2000passengerModel[165].setRotationPoint(-22.5F, 4.5F, -7F);

		metro2000passengerModel[166].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39
		metro2000passengerModel[166].setRotationPoint(-28.5F, 7.5F, 6F);

		metro2000passengerModel[167].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		metro2000passengerModel[167].setRotationPoint(-14.5F, 7.5F, 6F);

		metro2000passengerModel[168].addBox(0F, 0F, 0F, 3, 2, 1, 0F); // Box 45
		metro2000passengerModel[168].setRotationPoint(-28.5F, 5F, -7F);

		metro2000passengerModel[169].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 1F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 1F, 0F, 0F); // Box 46
		metro2000passengerModel[169].setRotationPoint(-24.5F, 5F, -7F);

		metro2000passengerModel[170].addShapeBox(0F, -1F, 0F, 3, 3, 1, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 47
		metro2000passengerModel[170].setRotationPoint(-22.5F, 6.5F, -7F);

		metro2000passengerModel[171].addBox(0F, 0F, 0F, 3, 2, 1, 0F); // Box 49
		metro2000passengerModel[171].setRotationPoint(-16.5F, 5F, -7F);

		metro2000passengerModel[172].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 56
		metro2000passengerModel[172].setRotationPoint(-22.5F, 7F, -5F);

		metro2000passengerModel[173].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 57
		metro2000passengerModel[173].setRotationPoint(-20.5F, 7F, -5F);

		metro2000passengerModel[174].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 58
		metro2000passengerModel[174].setRotationPoint(-19.5F, 4.5F, 7.5F);

		metro2000passengerModel[175].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 59
		metro2000passengerModel[175].setRotationPoint(-23.5F, 4.5F, -8.5F);

		metro2000passengerModel[176].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, -0.4F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.4F, -0.2F, 0F, 0F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 0F, -0.2F); // Box 60
		metro2000passengerModel[176].setRotationPoint(-22.5F, 6.5F, 7.5F);

		metro2000passengerModel[177].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, -0.2F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -0.2F, -0.2F); // Box 61
		metro2000passengerModel[177].setRotationPoint(-22.5F, 6.5F, -8.5F);

		metro2000passengerModel[178].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 62
		metro2000passengerModel[178].setRotationPoint(-19.5F, 6.75F, -8F);

		metro2000passengerModel[179].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F); // Box 63
		metro2000passengerModel[179].setRotationPoint(-23.5F, 6.75F, 7F);

		metro2000passengerModel[180].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 41
		metro2000passengerModel[180].setRotationPoint(-22F, 5.5F, -7F);

		metro2000passengerModel[181].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 1F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 1F, 0F, 0F); // Box 42
		metro2000passengerModel[181].setRotationPoint(-24.5F, 5F, 6F);

		metro2000passengerModel[182].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 43
		metro2000passengerModel[182].setRotationPoint(-22F, 5.5F, 5F);

		metro2000passengerModel[183].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, -1.5F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 1.5F, 0F); // Box 44
		metro2000passengerModel[183].setRotationPoint(-19.5F, 5F, 6F);

		metro2000passengerModel[184].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, -1.5F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 1.5F, 0F); // Box 45
		metro2000passengerModel[184].setRotationPoint(-19.5F, 5F, -7F);

		metro2000passengerModel[185].addShapeBox(0F, -1F, 0F, 3, 3, 1, 0F, 2F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 2F, 0F, 0F); // Box 45
		metro2000passengerModel[185].setRotationPoint(-17.5F, 7F, 3F);

		metro2000passengerModel[186].addShapeBox(0F, -1F, 0F, 3, 3, 1, 0F, 2F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 2F, 0F, 0F); // Box 46
		metro2000passengerModel[186].setRotationPoint(-25.5F, 7F, -2F);

		metro2000passengerModel[187].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
		metro2000passengerModel[187].setRotationPoint(-30.5F, 5F, 4.5F);

		metro2000passengerModel[188].addShapeBox(0F, -1F, 0F, 3, 3, 1, 0F, 2F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 2F, 0F, 0F); // Box 44
		metro2000passengerModel[188].setRotationPoint(-26.5F, 7F, 2F);

		metro2000passengerModel[189].addShapeBox(0F, -1F, 0F, 3, 3, 1, 0F, 2F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 2F, 0F, 0F); // Box 45
		metro2000passengerModel[189].setRotationPoint(-16.5F, 7F, -2F);

		metro2000passengerModel[190].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -1F, 0.5F, 0F, -1F, 0.5F, 0F, -1F, 0.5F, 0.5F, -1F, 0.5F); // Box 46
		metro2000passengerModel[190].setRotationPoint(-30.5F, 8F, 4.5F);

		metro2000passengerModel[191].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -1F, 0.5F, 0F, -1F, 0.5F, 0F, -1F, 0.5F, 0.5F, -1F, 0.5F); // Box 47
		metro2000passengerModel[191].setRotationPoint(-30.5F, 8F, -5.5F);

		metro2000passengerModel[192].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 48
		metro2000passengerModel[192].setRotationPoint(-30.5F, 5F, -5.5F);

		metro2000passengerModel[193].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 53
		metro2000passengerModel[193].setRotationPoint(-29.5F, 5F, 5F);

		metro2000passengerModel[194].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F); // Box 54
		metro2000passengerModel[194].setRotationPoint(-29.5F, 5F, -6F);

		metro2000passengerModel[195].addBox(-2.5F, -2.5F, 0F, 5, 5, 0, 0F); // Box 57
		metro2000passengerModel[195].setRotationPoint(-27.25F, 8F, -5F);

		metro2000passengerModel[196].addBox(-2.5F, -2.5F, 0F, 5, 5, 0, 0F); // Box 58
		metro2000passengerModel[196].setRotationPoint(-14.75F, 8F, -5F);

		metro2000passengerModel[197].addBox(-2.5F, -2.5F, 0F, 5, 5, 0, 0F); // Box 59
		metro2000passengerModel[197].setRotationPoint(-14.75F, 8F, 5F);

		metro2000passengerModel[198].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F); // Box 58
		metro2000passengerModel[198].setRotationPoint(-17.75F, 7.5F, 6F);

		metro2000passengerModel[199].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F); // Box 59
		metro2000passengerModel[199].setRotationPoint(-28.25F, 7.5F, 6.2F);

		metro2000passengerModel[200].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 60
		metro2000passengerModel[200].setRotationPoint(-26.25F, 7.5F, 6F);

		metro2000passengerModel[201].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F); // Box 61
		metro2000passengerModel[201].setRotationPoint(-15.75F, 7.5F, -7.2F);

		metro2000passengerModel[202].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F); // Box 62
		metro2000passengerModel[202].setRotationPoint(-17.75F, 7.5F, -7F);

		metro2000passengerModel[203].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 63
		metro2000passengerModel[203].setRotationPoint(-26.25F, 7.5F, -7F);

		metro2000passengerModel[204].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F); // Box 64
		metro2000passengerModel[204].setRotationPoint(-28.25F, 7.5F, -7.2F);

		metro2000passengerModel[205].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 65
		metro2000passengerModel[205].setRotationPoint(-14.5F, 7.5F, -7F);

		metro2000passengerModel[206].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 66
		metro2000passengerModel[206].setRotationPoint(-28.5F, 7.5F, -7F);

		metro2000passengerModel[207].addShapeBox(0F, 0F, 0F, 9, 5, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 362
		metro2000passengerModel[207].setRotationPoint(-5F, 5F, -0.5F);

		metro2000passengerModel[208].addShapeBox(0F, 0F, 0F, 4, 5, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 363
		metro2000passengerModel[208].setRotationPoint(5.5F, 5F, 0F);

		metro2000passengerModel[209].addShapeBox(0F, 0F, 0F, 6, 10, 1, 0F, 0F, 0F, 0.06F, 0F, 0F, 0.06F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 364
		metro2000passengerModel[209].setRotationPoint(-15.5F, -14F, -8.75F);

		metro2000passengerModel[210].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.06F, 0F, 0F, 0.06F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 367
		metro2000passengerModel[210].setRotationPoint(-15.5F, -15F, -8.75F);

		metro2000passengerModel[211].addShapeBox(0F, 0F, 0F, 6, 10, 1, 0F, 0F, 0F, 0.06F, 0F, 0F, 0.06F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 368
		metro2000passengerModel[211].setRotationPoint(-21.5F, -14F, -8.75F);

		metro2000passengerModel[212].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.06F, 0F, 0F, 0.06F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 369
		metro2000passengerModel[212].setRotationPoint(-21.5F, -15F, -8.75F);

		metro2000passengerModel[213].addShapeBox(0F, 0F, 0F, 6, 10, 1, 0F, 0F, 0F, 0.06F, 0F, 0F, 0.06F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 370
		metro2000passengerModel[213].setRotationPoint(4.5F, -14F, -8.75F);

		metro2000passengerModel[214].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.06F, 0F, 0F, 0.06F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 371
		metro2000passengerModel[214].setRotationPoint(4.5F, -15F, -8.75F);

		metro2000passengerModel[215].addShapeBox(0F, 0F, 0F, 6, 10, 1, 0F, 0F, 0F, 0.06F, 0F, 0F, 0.06F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 372
		metro2000passengerModel[215].setRotationPoint(10.5F, -14F, -8.75F);

		metro2000passengerModel[216].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.06F, 0F, 0F, 0.06F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 373
		metro2000passengerModel[216].setRotationPoint(10.5F, -15F, -8.75F);

		metro2000passengerModel[217].addShapeBox(0F, 0F, 0F, 6, 10, 1, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0.06F, 0F, 0F, 0.06F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F); // Box 374
		metro2000passengerModel[217].setRotationPoint(-21.5F, -14F, 7.75F);

		metro2000passengerModel[218].addShapeBox(0F, 0F, 0F, 6, 10, 1, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0.06F, 0F, 0F, 0.06F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F); // Box 375
		metro2000passengerModel[218].setRotationPoint(-15.5F, -14F, 7.75F);

		metro2000passengerModel[219].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.06F, 0F, 0F, 0.06F); // Box 376
		metro2000passengerModel[219].setRotationPoint(-15.5F, -15F, 7.75F);

		metro2000passengerModel[220].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.06F, 0F, 0F, 0.06F); // Box 377
		metro2000passengerModel[220].setRotationPoint(-21.5F, -15F, 7.75F);

		metro2000passengerModel[221].addShapeBox(0F, 0F, 0F, 6, 10, 1, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0.06F, 0F, 0F, 0.06F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F); // Box 378
		metro2000passengerModel[221].setRotationPoint(4.5F, -14F, 7.75F);

		metro2000passengerModel[222].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.06F, 0F, 0F, 0.06F); // Box 379
		metro2000passengerModel[222].setRotationPoint(4.5F, -15F, 7.75F);

		metro2000passengerModel[223].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.06F, 0F, 0F, 0.06F); // Box 380
		metro2000passengerModel[223].setRotationPoint(10.5F, -15F, 7.75F);

		metro2000passengerModel[224].addShapeBox(0F, 0F, 0F, 6, 10, 1, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0.06F, 0F, 0F, 0.06F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F); // Box 381
		metro2000passengerModel[224].setRotationPoint(10.5F, -14F, 7.75F);

		metro2000passengerModel[225].addShapeBox(0F, 0F, 0F, 3, 8, 1, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 382
		metro2000passengerModel[225].setRotationPoint(15F, -4F, 7.5F);

		metro2000passengerModel[226].addShapeBox(0F, 0F, 0F, 3, 10, 1, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F); // Box 383
		metro2000passengerModel[226].setRotationPoint(15.01F, -14F, 7F);

		metro2000passengerModel[227].addShapeBox(0F, 0F, 0F, 3, 10, 1, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F); // Box 384
		metro2000passengerModel[227].setRotationPoint(2.51F, -14F, 7F);

		metro2000passengerModel[228].addShapeBox(0F, 0F, 0F, 3, 8, 1, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 385
		metro2000passengerModel[228].setRotationPoint(2.5F, -4F, 7.5F);

		metro2000passengerModel[229].addShapeBox(0F, 0F, 0F, 3, 10, 1, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F); // Box 386
		metro2000passengerModel[229].setRotationPoint(-10.99F, -14F, 7F);

		metro2000passengerModel[230].addShapeBox(0F, 0F, 0F, 3, 8, 1, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 387
		metro2000passengerModel[230].setRotationPoint(-11F, -4F, 7.5F);

		metro2000passengerModel[231].addShapeBox(0F, 0F, 0F, 3, 8, 1, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 388
		metro2000passengerModel[231].setRotationPoint(-23.5F, -4F, 7.5F);

		metro2000passengerModel[232].addShapeBox(0F, 0F, 0F, 3, 10, 1, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F); // Box 389
		metro2000passengerModel[232].setRotationPoint(-23.49F, -14F, 7F);

		metro2000passengerModel[233].addShapeBox(0F, 0F, 0F, 11, 11, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, 0.75F, 0F, 0F, 0.75F); // Box 397
		metro2000passengerModel[233].setRotationPoint(18F, -15F, 7.75F);

		metro2000passengerModel[234].addShapeBox(0F, 0F, 0F, 11, 11, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, -1.25F, 0F, 0F, -1.25F); // Box 398
		metro2000passengerModel[234].setRotationPoint(18F, -15F, -8.75F);

		metro2000passengerModel[235].addShapeBox(0F, 0F, 0F, 11, 11, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, -1.25F, 0F, 0F, -1.25F); // Box 399
		metro2000passengerModel[235].setRotationPoint(-8F, -15F, -8.75F);

		metro2000passengerModel[236].addShapeBox(0F, 0F, 0F, 63, 2, 2, 0F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 400
		metro2000passengerModel[236].setRotationPoint(-32.5F, -16F, 5.75F);

		metro2000passengerModel[237].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, 0F, 0F, -0.1F, 0F); // Lamp 2
		metro2000passengerModel[237].setRotationPoint(-34.2F, 3.1F, -5.3F);

		metro2000passengerModel[238].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, -0.75F, -0.5F, 0F, -0.45F, -0.25F, 0F, -0.45F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.7F, -0.5F, 0F, -0.7F, -0.25F, 0F, -0.7F, -0.25F, 0F, -0.7F, -0.25F); // Box 223
		metro2000passengerModel[238].setRotationPoint(-34.2F, 2F, -6.1F);

		metro2000passengerModel[239].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, -0.75F, -0.25F, 0F, -0.45F, -0.25F, 0F, -0.45F, -0.25F, 0F, -0.95F, -0.5F, 0F, -0.6F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.85F, -0.5F); // Box 83
		metro2000passengerModel[239].setRotationPoint(-34.2F, 2F, -4.5F);

		metro2000passengerModel[240].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, -0.8F, -0.45F, 0F, -0.5F, -0.45F, 0F, -0.5F, -0.05F, 0F, -0.8F, -0.05F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.05F, 0F, 0F, -0.05F); // Box 52
		metro2000passengerModel[240].setRotationPoint(-34.2F, 1.95F, -7.2F);

		metro2000passengerModel[241].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, -0.8F, -0.45F, 0F, -0.5F, -0.45F, 0F, -0.5F, -0.05F, 0F, -0.8F, -0.05F); // Box 413
		metro2000passengerModel[241].setRotationPoint(-34.2F, 4.15F, -7.2F);

		metro2000passengerModel[242].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, 0F, 0F, -0.1F, 0F); // Lamp 4
		metro2000passengerModel[242].setRotationPoint(-34.2F, 3.1F, -6.7F);

		metro2000passengerModel[243].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, -0.95F, -0.5F, 0F, -0.45F, -0.25F, 0F, -0.45F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.85F, -0.5F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.6F, -0.25F); // Box 415
		metro2000passengerModel[243].setRotationPoint(-34.2F, 2F, -7.5F);

		metro2000passengerModel[244].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 1.65F, 0F, 0.2F, 1.65F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 1.65F, 0F, 0.2F, 1.65F); // Box 424
		metro2000passengerModel[244].setRotationPoint(-34.1F, 3.02F, -6.8F);

		metro2000passengerModel[245].addBox(0F, 0F, 0F, 6, 1, 1, 0F); // Box 425
		metro2000passengerModel[245].setRotationPoint(27.5F, 6F, -0.5F);

		metro2000passengerModel[246].addBox(0F, 0F, 0F, 1, 2, 3, 0F); // Box 426
		metro2000passengerModel[246].setRotationPoint(33.5F, 6F, -1.5F);

		metro2000passengerModel[247].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F, 0F, 0F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, 0F, 0F, -2F, 0.5F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -2F, 0.5F, 0F); // Box 466
		metro2000passengerModel[247].setRotationPoint(28F, 7.75F, 1.4F);

		metro2000passengerModel[248].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 467
		metro2000passengerModel[248].setRotationPoint(30F, 8.75F, 1.4F);

		metro2000passengerModel[249].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 468
		metro2000passengerModel[249].setRotationPoint(30F, 8.75F, -1.4F);

		metro2000passengerModel[250].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F, 0F, 0F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, 0F, 0F, -2F, 0.5F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -2F, 0.5F, 0F); // Box 469
		metro2000passengerModel[250].setRotationPoint(28F, 7.75F, -1.4F);

		metro2000passengerModel[251].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F, -0.5F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.25F, 0F, 1F, 0F, 0F, -2F, 0.5F, 0F, -2F, 0.5F, 0F, 1F, 0F, 0F); // Box 470
		metro2000passengerModel[251].setRotationPoint(33F, 7.75F, 1.4F);

		metro2000passengerModel[252].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F, -0.5F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.25F, 0F, 1F, 0F, 0F, -2F, 0.5F, 0F, -2F, 0.5F, 0F, 1F, 0F, 0F); // Box 473
		metro2000passengerModel[252].setRotationPoint(33F, 7.75F, -1.4F);

		metro2000passengerModel[253].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 287
		metro2000passengerModel[253].setRotationPoint(-33.5F, 8.75F, 1.9F);

		metro2000passengerModel[254].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F, 0F, 0F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, 0F, 0F, -2F, 0.5F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -2F, 0.5F, 0F); // Box 288
		metro2000passengerModel[254].setRotationPoint(-35.5F, 7.75F, -1.9F);

		metro2000passengerModel[255].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F, 0F, 0F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, 0F, 0F, -2F, 0.5F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -2F, 0.5F, 0F); // Box 289
		metro2000passengerModel[255].setRotationPoint(-35.5F, 7.75F, 1.9F);

		metro2000passengerModel[256].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 290
		metro2000passengerModel[256].setRotationPoint(-33.5F, 8.75F, -1.9F);

		metro2000passengerModel[257].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F, -0.5F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.25F, 0F, 1F, 0F, 0F, -2F, 0.5F, 0F, -2F, 0.5F, 0F, 1F, 0F, 0F); // Box 291
		metro2000passengerModel[257].setRotationPoint(-30.5F, 7.75F, -1.9F);

		metro2000passengerModel[258].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F, -0.5F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.25F, 0F, 1F, 0F, 0F, -2F, 0.5F, 0F, -2F, 0.5F, 0F, 1F, 0F, 0F); // Box 292
		metro2000passengerModel[258].setRotationPoint(-30.5F, 7.75F, 1.9F);

		metro2000passengerModel[259].addBox(0F, 0F, 0F, 3, 2, 1, 0F); // Box 289
		metro2000passengerModel[259].setRotationPoint(12.5F, 5F, 6F);

		metro2000passengerModel[260].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 290
		metro2000passengerModel[260].setRotationPoint(12.5F, 7.5F, 6F);

		metro2000passengerModel[261].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F); // Box 291
		metro2000passengerModel[261].setRotationPoint(12.75F, 7.5F, 6.2F);

		metro2000passengerModel[262].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 292
		metro2000passengerModel[262].setRotationPoint(14.75F, 7.5F, 6F);

		metro2000passengerModel[263].addShapeBox(0F, -1F, 0F, 3, 3, 1, 0F, 2F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 2F, 0F, 0F); // Box 293
		metro2000passengerModel[263].setRotationPoint(14.5F, 7F, 2F);

		metro2000passengerModel[264].addShapeBox(0F, -1F, 0F, 3, 3, 1, 0F, 2F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 2F, 0F, 0F); // Box 294
		metro2000passengerModel[264].setRotationPoint(15.5F, 7F, -2F);

		metro2000passengerModel[265].addShapeBox(0F, -1F, 0F, 3, 3, 1, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 295
		metro2000passengerModel[265].setRotationPoint(18.5F, 6.5F, 6F);

		metro2000passengerModel[266].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F); // Box 296
		metro2000passengerModel[266].setRotationPoint(17.5F, 6.75F, 7F);

		metro2000passengerModel[267].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, -0.4F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.4F, -0.2F, 0F, 0F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 0F, -0.2F); // Box 297
		metro2000passengerModel[267].setRotationPoint(18.5F, 6.5F, 7.5F);

		metro2000passengerModel[268].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 298
		metro2000passengerModel[268].setRotationPoint(21.5F, 4.5F, 7.5F);

		metro2000passengerModel[269].addShapeBox(0F, 0F, 0F, 3, 1, 14, 0F, 0F, 0F, 1.5F, 0F, 0F, 1F, 0F, 0F, 1.5F, 0F, 0F, 1F, 0F, 0F, 1.5F, 0F, 0F, 1F, 0F, 0F, 1.5F, 0F, 0F, 1F); // Box 299
		metro2000passengerModel[269].setRotationPoint(18.5F, 4.5F, -7F);

		metro2000passengerModel[270].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 300
		metro2000passengerModel[270].setRotationPoint(19F, 5.5F, 5F);

		metro2000passengerModel[271].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, -1.5F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 1.5F, 0F); // Box 301
		metro2000passengerModel[271].setRotationPoint(21.5F, 5F, 6F);

		metro2000passengerModel[272].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 1F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 1F, 0F, 0F); // Box 302
		metro2000passengerModel[272].setRotationPoint(16.5F, 5F, 6F);

		metro2000passengerModel[273].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F); // Box 303
		metro2000passengerModel[273].setRotationPoint(23.25F, 7.5F, 6F);

		metro2000passengerModel[274].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F); // Box 304
		metro2000passengerModel[274].setRotationPoint(25.25F, 7.5F, 6.2F);

		metro2000passengerModel[275].addBox(0F, 0F, 0F, 3, 2, 1, 0F); // Box 305
		metro2000passengerModel[275].setRotationPoint(24.5F, 5F, 6F);

		metro2000passengerModel[276].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 306
		metro2000passengerModel[276].setRotationPoint(26.5F, 7.5F, 6F);

		metro2000passengerModel[277].addBox(-2.5F, -2.5F, 0F, 5, 5, 0, 0F); // Box 307
		metro2000passengerModel[277].setRotationPoint(26.25F, 8F, 5F);

		metro2000passengerModel[278].addShapeBox(0F, -1F, 0F, 3, 3, 1, 0F, 2F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 2F, 0F, 0F); // Box 308
		metro2000passengerModel[278].setRotationPoint(23.5F, 7F, 3F);

		metro2000passengerModel[279].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 309
		metro2000passengerModel[279].setRotationPoint(20.5F, 7F, -5F);

		metro2000passengerModel[280].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 310
		metro2000passengerModel[280].setRotationPoint(18.5F, 7F, -5F);

		metro2000passengerModel[281].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 311
		metro2000passengerModel[281].setRotationPoint(18.5F, 5F, -1.5F);

		metro2000passengerModel[282].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 312
		metro2000passengerModel[282].setRotationPoint(19F, 5.5F, -7F);

		metro2000passengerModel[283].addBox(-2.5F, -2.5F, 0F, 5, 5, 0, 0F); // Box 313
		metro2000passengerModel[283].setRotationPoint(13.75F, 8F, 5F);

		metro2000passengerModel[284].addBox(-2.5F, -2.5F, 0F, 5, 5, 0, 0F); // Box 314
		metro2000passengerModel[284].setRotationPoint(26.25F, 8F, -5F);

		metro2000passengerModel[285].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, -1.5F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 1.5F, 0F); // Box 315
		metro2000passengerModel[285].setRotationPoint(21.5F, 5F, -7F);

		metro2000passengerModel[286].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F); // Box 316
		metro2000passengerModel[286].setRotationPoint(23.25F, 7.5F, -7F);

		metro2000passengerModel[287].addShapeBox(0F, -1F, 0F, 3, 3, 1, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 317
		metro2000passengerModel[287].setRotationPoint(18.5F, 6.5F, -7F);

		metro2000passengerModel[288].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 318
		metro2000passengerModel[288].setRotationPoint(21.5F, 6.75F, -8F);

		metro2000passengerModel[289].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, -0.2F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -0.2F, -0.2F); // Box 319
		metro2000passengerModel[289].setRotationPoint(18.5F, 6.5F, -8.5F);

		metro2000passengerModel[290].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 320
		metro2000passengerModel[290].setRotationPoint(17.5F, 4.5F, -8.5F);

		metro2000passengerModel[291].addBox(0F, 0F, 0F, 3, 2, 1, 0F); // Box 321
		metro2000passengerModel[291].setRotationPoint(12.5F, 5F, -7F);

		metro2000passengerModel[292].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 1F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 1F, 0F, 0F); // Box 322
		metro2000passengerModel[292].setRotationPoint(16.5F, 5F, -7F);

		metro2000passengerModel[293].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 323
		metro2000passengerModel[293].setRotationPoint(14.75F, 7.5F, -7F);

		metro2000passengerModel[294].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F); // Box 324
		metro2000passengerModel[294].setRotationPoint(12.75F, 7.5F, -7.2F);

		metro2000passengerModel[295].addBox(-2.5F, -2.5F, 0F, 5, 5, 0, 0F); // Box 325
		metro2000passengerModel[295].setRotationPoint(13.75F, 8F, -5F);

		metro2000passengerModel[296].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 326
		metro2000passengerModel[296].setRotationPoint(13.25F, 7.5F, -6F);

		metro2000passengerModel[297].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F); // Box 327
		metro2000passengerModel[297].setRotationPoint(25.25F, 7.5F, -7.2F);

		metro2000passengerModel[298].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 328
		metro2000passengerModel[298].setRotationPoint(26.5F, 7.5F, -7F);

		metro2000passengerModel[299].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 329
		metro2000passengerModel[299].setRotationPoint(25.75F, 7.5F, -6F);

		metro2000passengerModel[300].addBox(0F, 0F, 0F, 3, 2, 1, 0F); // Box 330
		metro2000passengerModel[300].setRotationPoint(24.5F, 5F, -7F);

		metro2000passengerModel[301].addShapeBox(0F, -1F, 0F, 3, 3, 1, 0F, 2F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 2F, 0F, 0F); // Box 333
		metro2000passengerModel[301].setRotationPoint(24.5F, 7F, -2F);

		metro2000passengerModel[302].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 334
		metro2000passengerModel[302].setRotationPoint(12.5F, 7.5F, -7F);

		metro2000passengerModel[303].addShapeBox(0F, 0F, 0F, 5, 5, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 335
		metro2000passengerModel[303].setRotationPoint(-10.5F, 5F, -8F);

		metro2000passengerModel[304].addShapeBox(0F, 0F, 0F, 9, 5, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 336
		metro2000passengerModel[304].setRotationPoint(-5F, 5F, -7.5F);

		metro2000passengerModel[305].addShapeBox(0F, 0F, 0F, 4, 5, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 337
		metro2000passengerModel[305].setRotationPoint(5.5F, 5F, -8F);

		metro2000passengerModel[306].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, 0F, 0F, -0.1F, 0F); // Lamp 1
		metro2000passengerModel[306].setRotationPoint(-34.2F, 3.1F, 4.2F);

		metro2000passengerModel[307].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 1.65F, 0F, 0.2F, 1.65F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 1.65F, 0F, 0.2F, 1.65F); // Box 339
		metro2000passengerModel[307].setRotationPoint(-34.1F, 3.02F, 4.2F);

		metro2000passengerModel[308].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, -0.75F, -0.5F, 0F, -0.45F, -0.25F, 0F, -0.45F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.7F, -0.5F, 0F, -0.7F, -0.25F, 0F, -0.7F, -0.25F, 0F, -0.7F, -0.25F); // Box 340
		metro2000passengerModel[308].setRotationPoint(-34.2F, 2F, 4.9F);

		metro2000passengerModel[309].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, -0.8F, -0.45F, 0F, -0.5F, -0.45F, 0F, -0.5F, -0.05F, 0F, -0.8F, -0.05F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.05F, 0F, 0F, -0.05F); // Box 341
		metro2000passengerModel[309].setRotationPoint(-34.2F, 1.95F, 3.8F);

		metro2000passengerModel[310].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, -0.95F, -0.5F, 0F, -0.45F, -0.25F, 0F, -0.45F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.85F, -0.5F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.6F, -0.25F); // Box 342
		metro2000passengerModel[310].setRotationPoint(-34.2F, 2F, 3.5F);

		metro2000passengerModel[311].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, -0.8F, -0.45F, 0F, -0.5F, -0.45F, 0F, -0.5F, -0.05F, 0F, -0.8F, -0.05F); // Box 343
		metro2000passengerModel[311].setRotationPoint(-34.2F, 4.15F, 3.8F);

		metro2000passengerModel[312].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, 0F, 0F, -0.1F, 0F); // Lamp3
		metro2000passengerModel[312].setRotationPoint(-34.2F, 3.1F, 5.7F);

		metro2000passengerModel[313].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, -0.75F, -0.25F, 0F, -0.45F, -0.25F, 0F, -0.45F, -0.25F, 0F, -0.95F, -0.5F, 0F, -0.6F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.85F, -0.5F); // Box 345
		metro2000passengerModel[313].setRotationPoint(-34.2F, 2F, 6.5F);

		metro2000passengerModel[314].addShapeBox(0F, 0F, 0F, 12, 14, 1, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, -9F, 0F, -0.3F, -9F, -9F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, -9F, -9F, 0F); // Box 332
		metro2000passengerModel[314].setRotationPoint(-34F, -9F, 8.5F);

		metro2000passengerModel[315].addShapeBox(0F, 0F, 0F, 12, 14, 1, 0F, -9F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, -9F, 0F, 0F, -9F, -9F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, -9F, -9F, 0F); // Box 333
		metro2000passengerModel[315].setRotationPoint(-34F, -9F, -9.5F);

		metro2000passengerModel[316].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, -0.7F, 0F, -0.5F, -0.7F, 0F, -0.5F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 173
		metro2000passengerModel[316].setRotationPoint(23.5F, -3.1F, -7.05F);

		metro2000passengerModel[317].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0.5F, 0F, 1F, 0.5F, 0F, 1F, -1F, 0F, 1F, -1F); // Box 335
		metro2000passengerModel[317].setRotationPoint(23.75F, -2.1F, -5F);

		metro2000passengerModel[318].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, -0.7F, 0F, -0.5F, -0.7F, 0F, -0.5F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 336
		metro2000passengerModel[318].setRotationPoint(-3F, -3.1F, -7.05F);

		metro2000passengerModel[319].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0.5F, 0F, 1F, 0.5F, 0F, 1F, -1F, 0F, 1F, -1F); // Box 337
		metro2000passengerModel[319].setRotationPoint(-2.75F, -2.1F, -5F);

		metro2000passengerModel[320].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, -0.7F, 0F, -0.5F, -0.7F, 0F, -0.5F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 338
		metro2000passengerModel[320].setRotationPoint(-3F, -3.1F, -7.05F);

		metro2000passengerModel[321].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, -0.7F, 0F, -0.5F, -0.7F, 0F, -0.5F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 339
		metro2000passengerModel[321].setRotationPoint(-3F, -3.1F, -7.05F);

		metro2000passengerModel[322].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, -0.7F, 0F, -0.5F, -0.7F, 0F, -0.5F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 340
		metro2000passengerModel[322].setRotationPoint(-3F, -3.1F, -7.05F);

		metro2000passengerModel[323].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, -0.7F, 0F, -0.5F, -0.7F, 0F, -0.5F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 341
		metro2000passengerModel[323].setRotationPoint(-8.5F, -3.1F, -7.5F);

		metro2000passengerModel[324].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, -0.7F, 0F, -0.5F, -0.7F, 0F, -0.5F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 342
		metro2000passengerModel[324].setRotationPoint(3F, -3.1F, -7.5F);

		metro2000passengerModel[325].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, -0.7F, 0F, -0.5F, -0.7F, 0F, -0.5F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 343
		metro2000passengerModel[325].setRotationPoint(18F, -3.1F, -7.5F);

		metro2000passengerModel[326].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, -0.7F, 0F, -0.5F, -0.7F, 0F, -0.5F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 344
		metro2000passengerModel[326].setRotationPoint(29.5F, -3.1F, -7.5F);

		metro2000passengerModel[327].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 1F, -1F, 0F, 1F, -1F, 0F, 1F, 0.5F, 0F, 1F, 0.5F); // Box 345
		metro2000passengerModel[327].setRotationPoint(-2.75F, -2.1F, 4F);

		metro2000passengerModel[328].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, -0.7F, 0F, -0.5F, -0.7F, 0F, -0.5F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 346
		metro2000passengerModel[328].setRotationPoint(-3F, -3.1F, 3.95F);

		metro2000passengerModel[329].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, -0.7F, 0F, -0.5F, -0.7F, 0F, -0.5F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 347
		metro2000passengerModel[329].setRotationPoint(23.5F, -3.1F, 3.95F);

		metro2000passengerModel[330].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 1F, -1F, 0F, 1F, -1F, 0F, 1F, 0.5F, 0F, 1F, 0.5F); // Box 348
		metro2000passengerModel[330].setRotationPoint(23.75F, -2.1F, 4F);

		metro2000passengerModel[331].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, -0.7F, 0F, -0.5F, -0.7F, 0F, -0.5F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 349
		metro2000passengerModel[331].setRotationPoint(29.5F, -3.1F, 4.5F);

		metro2000passengerModel[332].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, -0.7F, 0F, -0.5F, -0.7F, 0F, -0.5F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 350
		metro2000passengerModel[332].setRotationPoint(18F, -3.1F, 4.5F);

		metro2000passengerModel[333].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, -0.7F, 0F, -0.5F, -0.7F, 0F, -0.5F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 351
		metro2000passengerModel[333].setRotationPoint(3F, -3.1F, 4.5F);

		metro2000passengerModel[334].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, -0.7F, 0F, -0.5F, -0.7F, 0F, -0.5F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 352
		metro2000passengerModel[334].setRotationPoint(-8.5F, -3.1F, 4.5F);

		metro2000passengerModel[335].addBox(0F, 0F, 0F, 11, 3, 12, 0F); // Box 353
		metro2000passengerModel[335].setRotationPoint(17.5F, -19F, -6F);

		metro2000passengerModel[336].addShapeBox(0F, 0F, 0F, 2, 11, 1, 0F, -0.6F, 0F, -1.75F, 0F, 0F, -0.75F, 0F, 0F, 0.5F, -0.6F, 0F, 1.2F, -0.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0.5F); // Box 353
		metro2000passengerModel[336].setRotationPoint(-34.51F, -15F, -9.55F);

		metro2000passengerModel[337].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F, -0.6F, 0F, -1F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.6F, 0F, 0.5F, -0.55F, 0F, -1.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, -0.555F, 0F, 0.75F); // Box 354
		metro2000passengerModel[337].setRotationPoint(-34.51F, -4F, -9.55F);

		metro2000passengerModel[338].addShapeBox(0F, 0F, 0F, 2, 7, 20, 0F, 0F, 0F, -1F, -0.5F, 0F, -2F, -0.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1.25F, -0.5F, -0.25F, -2.3F, -0.5F, -0.25F, -1.3F, 0F, 0F, -0.25F); // Box 310
		metro2000passengerModel[338].setRotationPoint(30.5F, -4F, -10.5F);

		metro2000passengerModel[339].addShapeBox(0F, 0F, 0F, 2, 2, 20, 0F, 0F, 0F, -1.25F, -0.5F, 0.25F, -2.3F, -0.5F, 0.25F, -1.3F, 0F, 0F, -0.25F, 0F, 0F, -2.25F, -0.5F, -0.5F, -3F, -0.5F, -0.5F, -2F, 0F, 0F, -1.25F); // Box 311
		metro2000passengerModel[339].setRotationPoint(30.5F, 3F, -10.5F);

		metro2000passengerModel[340].addShapeBox(0F, 0F, 0F, 2, 11, 9, 0F, 0F, 0F, -0.75F, -0.5F, 0F, -1.75F, -0.5F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -2F, 0F, 0F, -2F); // Box 314
		metro2000passengerModel[340].setRotationPoint(30.5F, -15F, -9.5F);

		metro2000passengerModel[341].addShapeBox(0F, 0F, 0F, 2, 11, 9, 0F, 0F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F, -1.75F, 0F, 0F, -0.75F, 0F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F, -1F, 0F, 0F, 0F); // Box 315
		metro2000passengerModel[341].setRotationPoint(30.5F, -15F, 0.5F);

		metro2000passengerModel[342].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F, 0F, -0.25F, -1.25F, -0.9F, -0.25F, -1.25F, -0.9F, -0.7F, -1F, 0F, -0.7F, -1F, 0F, 0F, -1.25F, 0.5F, 0F, -1.25F, 0.5F, 0F, -1.75F, 0F, 0F, -0.75F); // Box 316
		metro2000passengerModel[342].setRotationPoint(30.5F, -17F, 3.5F);

		metro2000passengerModel[343].addShapeBox(0F, 0F, 0F, 1, 2, 11, 0F, 0F, -0.25F, -1.25F, -0.9F, -0.25F, -1.25F, -0.9F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, -1.25F, 0.5F, 0F, -1.25F, 0.5F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 317
		metro2000passengerModel[343].setRotationPoint(30.5F, -17F, -6F);

		metro2000passengerModel[344].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F, 0F, -0.7F, -1F, -0.9F, -0.7F, -1F, -0.9F, -0.25F, -1.25F, 0F, -0.25F, -1.25F, 0F, 0F, -0.75F, 0.5F, 0F, -1.75F, 0.5F, 0F, -1.25F, 0F, 0F, -1.25F); // Box 318
		metro2000passengerModel[344].setRotationPoint(30.5F, -17F, -9.5F);

		metro2000passengerModel[345].addShapeBox(0F, 0F, 0F, 2, 11, 7, 0F, 0F, 0F, -0.25F, -1F, 0F, -1.75F, -1F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0.5F, -1F, 0F, -1F, -1F, 0F, -2F, 0F, 0F, -2F); // Box 401
		metro2000passengerModel[345].setRotationPoint(32F, -15F, -8F);


	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		for(int i = 0; i < 346; i++)
		{
			metro2000passengerModel[i].render(f5);
		}
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
	{
	}

	public ModelRendererTurbo metro2000passengerModel[];
}