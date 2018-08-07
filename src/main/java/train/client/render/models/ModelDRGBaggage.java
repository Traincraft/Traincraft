//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2018 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator:
// Created on:28.01.2018 - 00:34:39
// Last changed on: 28.01.2018 - 00:34:39

package train.client.render.models;

import net.minecraft.entity.Entity;
import tmt.ModelBase;
import tmt.ModelRendererTurbo;

public class ModelDRGBaggage extends ModelBase
{
	int textureX = 512;
	int textureY = 256;

	public ModelDRGBaggage()
	{
		drgbaggageModel = new ModelRendererTurbo[493];
		drgbaggageModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		drgbaggageModel[1] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 2
		drgbaggageModel[2] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 3
		drgbaggageModel[3] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 4
		drgbaggageModel[4] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 5
		drgbaggageModel[5] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 21
		drgbaggageModel[6] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 22
		drgbaggageModel[7] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 23
		drgbaggageModel[8] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 36
		drgbaggageModel[9] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 37
		drgbaggageModel[10] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 38
		drgbaggageModel[11] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 40
		drgbaggageModel[12] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 55
		drgbaggageModel[13] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 65
		drgbaggageModel[14] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 67
		drgbaggageModel[15] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 68
		drgbaggageModel[16] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 69
		drgbaggageModel[17] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 70
		drgbaggageModel[18] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 71
		drgbaggageModel[19] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 72
		drgbaggageModel[20] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 73
		drgbaggageModel[21] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 65
		drgbaggageModel[22] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 66
		drgbaggageModel[23] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 68
		drgbaggageModel[24] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 69
		drgbaggageModel[25] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 79
		drgbaggageModel[26] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 91
		drgbaggageModel[27] = new ModelRendererTurbo(this, 249, 17, textureX, textureY); // Box 94
		drgbaggageModel[28] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 95
		drgbaggageModel[29] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 96
		drgbaggageModel[30] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 97
		drgbaggageModel[31] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 98
		drgbaggageModel[32] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 99
		drgbaggageModel[33] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 100
		drgbaggageModel[34] = new ModelRendererTurbo(this, 9, 9, textureX, textureY); // Box 101
		drgbaggageModel[35] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Box 102
		drgbaggageModel[36] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 128
		drgbaggageModel[37] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 129
		drgbaggageModel[38] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 130
		drgbaggageModel[39] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Box 131
		drgbaggageModel[40] = new ModelRendererTurbo(this, 73, 9, textureX, textureY); // Box 132
		drgbaggageModel[41] = new ModelRendererTurbo(this, 329, 9, textureX, textureY); // Box 133
		drgbaggageModel[42] = new ModelRendererTurbo(this, 337, 9, textureX, textureY); // Box 134
		drgbaggageModel[43] = new ModelRendererTurbo(this, 193, 17, textureX, textureY); // Box 135
		drgbaggageModel[44] = new ModelRendererTurbo(this, 449, 9, textureX, textureY); // Box 136
		drgbaggageModel[45] = new ModelRendererTurbo(this, 153, 41, textureX, textureY); // Box 137
		drgbaggageModel[46] = new ModelRendererTurbo(this, 337, 9, textureX, textureY); // Box 138
		drgbaggageModel[47] = new ModelRendererTurbo(this, 433, 17, textureX, textureY); // Box 139
		drgbaggageModel[48] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 140
		drgbaggageModel[49] = new ModelRendererTurbo(this, 201, 25, textureX, textureY); // Box 141
		drgbaggageModel[50] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 143
		drgbaggageModel[51] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 145
		drgbaggageModel[52] = new ModelRendererTurbo(this, 233, 9, textureX, textureY); // Box 146
		drgbaggageModel[53] = new ModelRendererTurbo(this, 297, 9, textureX, textureY); // Box 147
		drgbaggageModel[54] = new ModelRendererTurbo(this, 377, 25, textureX, textureY); // Box 158
		drgbaggageModel[55] = new ModelRendererTurbo(this, 401, 25, textureX, textureY); // Box 159
		drgbaggageModel[56] = new ModelRendererTurbo(this, 457, 25, textureX, textureY); // Box 160
		drgbaggageModel[57] = new ModelRendererTurbo(this, 73, 17, textureX, textureY); // Box 171
		drgbaggageModel[58] = new ModelRendererTurbo(this, 457, 17, textureX, textureY); // Box 172
		drgbaggageModel[59] = new ModelRendererTurbo(this, 497, 17, textureX, textureY); // Box 173
		drgbaggageModel[60] = new ModelRendererTurbo(this, 169, 25, textureX, textureY); // Box 174
		drgbaggageModel[61] = new ModelRendererTurbo(this, 233, 25, textureX, textureY); // Box 175
		drgbaggageModel[62] = new ModelRendererTurbo(this, 425, 25, textureX, textureY); // Box 176
		drgbaggageModel[63] = new ModelRendererTurbo(this, 329, 25, textureX, textureY); // Box 177
		drgbaggageModel[64] = new ModelRendererTurbo(this, 369, 25, textureX, textureY); // Box 178
		drgbaggageModel[65] = new ModelRendererTurbo(this, 457, 25, textureX, textureY); // Box 179
		drgbaggageModel[66] = new ModelRendererTurbo(this, 185, 25, textureX, textureY); // Box 180
		drgbaggageModel[67] = new ModelRendererTurbo(this, 409, 25, textureX, textureY); // Box 181
		drgbaggageModel[68] = new ModelRendererTurbo(this, 481, 25, textureX, textureY); // Box 182
		drgbaggageModel[69] = new ModelRendererTurbo(this, 441, 25, textureX, textureY); // Box 183
		drgbaggageModel[70] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Box 184
		drgbaggageModel[71] = new ModelRendererTurbo(this, 49, 41, textureX, textureY); // Box 185
		drgbaggageModel[72] = new ModelRendererTurbo(this, 489, 25, textureX, textureY); // Box 186
		drgbaggageModel[73] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 187
		drgbaggageModel[74] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Box 188
		drgbaggageModel[75] = new ModelRendererTurbo(this, 49, 33, textureX, textureY); // Box 189
		drgbaggageModel[76] = new ModelRendererTurbo(this, 73, 33, textureX, textureY); // Box 190
		drgbaggageModel[77] = new ModelRendererTurbo(this, 169, 33, textureX, textureY); // Box 191
		drgbaggageModel[78] = new ModelRendererTurbo(this, 233, 33, textureX, textureY); // Box 192
		drgbaggageModel[79] = new ModelRendererTurbo(this, 329, 33, textureX, textureY); // Box 193
		drgbaggageModel[80] = new ModelRendererTurbo(this, 361, 33, textureX, textureY); // Box 194
		drgbaggageModel[81] = new ModelRendererTurbo(this, 345, 33, textureX, textureY); // Box 195
		drgbaggageModel[82] = new ModelRendererTurbo(this, 497, 33, textureX, textureY); // Box 196
		drgbaggageModel[83] = new ModelRendererTurbo(this, 369, 33, textureX, textureY); // Box 197
		drgbaggageModel[84] = new ModelRendererTurbo(this, 425, 33, textureX, textureY); // Box 198
		drgbaggageModel[85] = new ModelRendererTurbo(this, 49, 41, textureX, textureY); // Box 199
		drgbaggageModel[86] = new ModelRendererTurbo(this, 457, 33, textureX, textureY); // Box 200
		drgbaggageModel[87] = new ModelRendererTurbo(this, 489, 33, textureX, textureY); // Box 201
		drgbaggageModel[88] = new ModelRendererTurbo(this, 369, 41, textureX, textureY); // Box 202
		drgbaggageModel[89] = new ModelRendererTurbo(this, 385, 41, textureX, textureY); // Box 203
		drgbaggageModel[90] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 204
		drgbaggageModel[91] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 205
		drgbaggageModel[92] = new ModelRendererTurbo(this, 193, 65, textureX, textureY); // Box 206
		drgbaggageModel[93] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 207
		drgbaggageModel[94] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 208
		drgbaggageModel[95] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 209
		drgbaggageModel[96] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 210
		drgbaggageModel[97] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 211
		drgbaggageModel[98] = new ModelRendererTurbo(this, 73, 49, textureX, textureY); // Box 148
		drgbaggageModel[99] = new ModelRendererTurbo(this, 377, 49, textureX, textureY); // Box 149
		drgbaggageModel[100] = new ModelRendererTurbo(this, 417, 49, textureX, textureY); // Box 150
		drgbaggageModel[101] = new ModelRendererTurbo(this, 97, 49, textureX, textureY); // Box 151
		drgbaggageModel[102] = new ModelRendererTurbo(this, 449, 49, textureX, textureY); // Box 152
		drgbaggageModel[103] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 153
		drgbaggageModel[104] = new ModelRendererTurbo(this, 449, 65, textureX, textureY); // Box 155
		drgbaggageModel[105] = new ModelRendererTurbo(this, 481, 65, textureX, textureY); // Box 156
		drgbaggageModel[106] = new ModelRendererTurbo(this, 217, 73, textureX, textureY); // Box 157
		drgbaggageModel[107] = new ModelRendererTurbo(this, 249, 73, textureX, textureY); // Box 158
		drgbaggageModel[108] = new ModelRendererTurbo(this, 281, 73, textureX, textureY); // Box 159
		drgbaggageModel[109] = new ModelRendererTurbo(this, 313, 73, textureX, textureY); // Box 160
		drgbaggageModel[110] = new ModelRendererTurbo(this, 343, 73, textureX, textureY); // Box 161
		drgbaggageModel[111] = new ModelRendererTurbo(this, 129, 49, textureX, textureY); // Box 162
		drgbaggageModel[112] = new ModelRendererTurbo(this, 217, 89, textureX, textureY); // Box 173
		drgbaggageModel[113] = new ModelRendererTurbo(this, 393, 41, textureX, textureY); // Box 174
		drgbaggageModel[114] = new ModelRendererTurbo(this, 425, 41, textureX, textureY); // Box 177
		drgbaggageModel[115] = new ModelRendererTurbo(this, 17, 49, textureX, textureY); // Box 178
		drgbaggageModel[116] = new ModelRendererTurbo(this, 17, 57, textureX, textureY); // Box 179
		drgbaggageModel[117] = new ModelRendererTurbo(this, 281, 89, textureX, textureY); // Box 180
		drgbaggageModel[118] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 181
		drgbaggageModel[119] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 182
		drgbaggageModel[120] = new ModelRendererTurbo(this, 321, 9, textureX, textureY); // Box 184
		drgbaggageModel[121] = new ModelRendererTurbo(this, 337, 9, textureX, textureY); // Box 186
		drgbaggageModel[122] = new ModelRendererTurbo(this, 329, 89, textureX, textureY); // Box 185
		drgbaggageModel[123] = new ModelRendererTurbo(this, 385, 89, textureX, textureY); // Box 189
		drgbaggageModel[124] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 190
		drgbaggageModel[125] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 191
		drgbaggageModel[126] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Box 193
		drgbaggageModel[127] = new ModelRendererTurbo(this, 153, 49, textureX, textureY); // Box 196
		drgbaggageModel[128] = new ModelRendererTurbo(this, 409, 49, textureX, textureY); // Box 198
		drgbaggageModel[129] = new ModelRendererTurbo(this, 201, 33, textureX, textureY); // Box 199
		drgbaggageModel[130] = new ModelRendererTurbo(this, 409, 33, textureX, textureY); // Box 200
		drgbaggageModel[131] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 201
		drgbaggageModel[132] = new ModelRendererTurbo(this, 449, 9, textureX, textureY); // Box 202
		drgbaggageModel[133] = new ModelRendererTurbo(this, 425, 89, textureX, textureY); // Box 198
		drgbaggageModel[134] = new ModelRendererTurbo(this, 465, 89, textureX, textureY); // Box 199
		drgbaggageModel[135] = new ModelRendererTurbo(this, 25, 41, textureX, textureY); // Box 214
		drgbaggageModel[136] = new ModelRendererTurbo(this, 193, 17, textureX, textureY); // Box 215
		drgbaggageModel[137] = new ModelRendererTurbo(this, 505, 25, textureX, textureY); // Box 216
		drgbaggageModel[138] = new ModelRendererTurbo(this, 457, 41, textureX, textureY); // Box 217
		drgbaggageModel[139] = new ModelRendererTurbo(this, 41, 25, textureX, textureY); // Box 218
		drgbaggageModel[140] = new ModelRendererTurbo(this, 49, 49, textureX, textureY); // Box 220
		drgbaggageModel[141] = new ModelRendererTurbo(this, 217, 113, textureX, textureY); // Box 221
		drgbaggageModel[142] = new ModelRendererTurbo(this, 505, 41, textureX, textureY); // Box 221
		drgbaggageModel[143] = new ModelRendererTurbo(this, 185, 25, textureX, textureY); // Box 222
		drgbaggageModel[144] = new ModelRendererTurbo(this, 481, 25, textureX, textureY); // Box 223
		drgbaggageModel[145] = new ModelRendererTurbo(this, 65, 33, textureX, textureY); // Box 224
		drgbaggageModel[146] = new ModelRendererTurbo(this, 73, 33, textureX, textureY); // Box 225
		drgbaggageModel[147] = new ModelRendererTurbo(this, 81, 33, textureX, textureY); // Box 226
		drgbaggageModel[148] = new ModelRendererTurbo(this, 337, 33, textureX, textureY); // Box 227
		drgbaggageModel[149] = new ModelRendererTurbo(this, 353, 33, textureX, textureY); // Box 228
		drgbaggageModel[150] = new ModelRendererTurbo(this, 361, 33, textureX, textureY); // Box 229
		drgbaggageModel[151] = new ModelRendererTurbo(this, 465, 65, textureX, textureY); // Box 235
		drgbaggageModel[152] = new ModelRendererTurbo(this, 233, 73, textureX, textureY); // Box 236
		drgbaggageModel[153] = new ModelRendererTurbo(this, 265, 73, textureX, textureY); // Box 237
		drgbaggageModel[154] = new ModelRendererTurbo(this, 369, 89, textureX, textureY); // Box 233
		drgbaggageModel[155] = new ModelRendererTurbo(this, 49, 57, textureX, textureY); // Box 242
		drgbaggageModel[156] = new ModelRendererTurbo(this, 73, 57, textureX, textureY); // Box 243
		drgbaggageModel[157] = new ModelRendererTurbo(this, 89, 57, textureX, textureY); // Box 244
		drgbaggageModel[158] = new ModelRendererTurbo(this, 153, 57, textureX, textureY); // Box 245
		drgbaggageModel[159] = new ModelRendererTurbo(this, 361, 57, textureX, textureY); // Box 256
		drgbaggageModel[160] = new ModelRendererTurbo(this, 409, 57, textureX, textureY); // Box 257
		drgbaggageModel[161] = new ModelRendererTurbo(this, 497, 65, textureX, textureY); // Box 258
		drgbaggageModel[162] = new ModelRendererTurbo(this, 297, 73, textureX, textureY); // Box 259
		drgbaggageModel[163] = new ModelRendererTurbo(this, 441, 33, textureX, textureY); // Box 313
		drgbaggageModel[164] = new ModelRendererTurbo(this, 377, 41, textureX, textureY); // Box 314
		drgbaggageModel[165] = new ModelRendererTurbo(this, 481, 41, textureX, textureY); // Box 315
		drgbaggageModel[166] = new ModelRendererTurbo(this, 129, 49, textureX, textureY); // Box 316
		drgbaggageModel[167] = new ModelRendererTurbo(this, 361, 49, textureX, textureY); // Box 317
		drgbaggageModel[168] = new ModelRendererTurbo(this, 385, 49, textureX, textureY); // Box 318
		drgbaggageModel[169] = new ModelRendererTurbo(this, 425, 49, textureX, textureY); // Box 319
		drgbaggageModel[170] = new ModelRendererTurbo(this, 449, 49, textureX, textureY); // Box 320
		drgbaggageModel[171] = new ModelRendererTurbo(this, 377, 57, textureX, textureY); // Box 406
		drgbaggageModel[172] = new ModelRendererTurbo(this, 313, 73, textureX, textureY); // Box 407
		drgbaggageModel[173] = new ModelRendererTurbo(this, 329, 73, textureX, textureY); // Box 408
		drgbaggageModel[174] = new ModelRendererTurbo(this, 337, 73, textureX, textureY); // Box 409
		drgbaggageModel[175] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 410
		drgbaggageModel[176] = new ModelRendererTurbo(this, 449, 57, textureX, textureY); // Box 411
		drgbaggageModel[177] = new ModelRendererTurbo(this, 345, 73, textureX, textureY); // Box 412
		drgbaggageModel[178] = new ModelRendererTurbo(this, 361, 73, textureX, textureY); // Box 413
		drgbaggageModel[179] = new ModelRendererTurbo(this, 377, 73, textureX, textureY); // Box 414
		drgbaggageModel[180] = new ModelRendererTurbo(this, 417, 73, textureX, textureY); // Box 415
		drgbaggageModel[181] = new ModelRendererTurbo(this, 441, 73, textureX, textureY); // Box 416
		drgbaggageModel[182] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 417
		drgbaggageModel[183] = new ModelRendererTurbo(this, 33, 81, textureX, textureY); // Box 418
		drgbaggageModel[184] = new ModelRendererTurbo(this, 57, 81, textureX, textureY); // Box 419
		drgbaggageModel[185] = new ModelRendererTurbo(this, 65, 81, textureX, textureY); // Box 420
		drgbaggageModel[186] = new ModelRendererTurbo(this, 449, 73, textureX, textureY); // Box 421
		drgbaggageModel[187] = new ModelRendererTurbo(this, 89, 81, textureX, textureY); // Box 422
		drgbaggageModel[188] = new ModelRendererTurbo(this, 97, 81, textureX, textureY); // Box 423
		drgbaggageModel[189] = new ModelRendererTurbo(this, 121, 81, textureX, textureY); // Box 424
		drgbaggageModel[190] = new ModelRendererTurbo(this, 129, 81, textureX, textureY); // Box 425
		drgbaggageModel[191] = new ModelRendererTurbo(this, 153, 81, textureX, textureY); // Box 397
		drgbaggageModel[192] = new ModelRendererTurbo(this, 161, 81, textureX, textureY); // Box 398
		drgbaggageModel[193] = new ModelRendererTurbo(this, 185, 81, textureX, textureY); // Box 362
		drgbaggageModel[194] = new ModelRendererTurbo(this, 497, 73, textureX, textureY); // Box 363
		drgbaggageModel[195] = new ModelRendererTurbo(this, 489, 49, textureX, textureY); // Box 364
		drgbaggageModel[196] = new ModelRendererTurbo(this, 233, 81, textureX, textureY); // Box 365
		drgbaggageModel[197] = new ModelRendererTurbo(this, 425, 57, textureX, textureY); // Box 366
		drgbaggageModel[198] = new ModelRendererTurbo(this, 441, 97, textureX, textureY); // Box 354
		drgbaggageModel[199] = new ModelRendererTurbo(this, 505, 81, textureX, textureY); // Box 355
		drgbaggageModel[200] = new ModelRendererTurbo(this, 457, 97, textureX, textureY); // Box 356
		drgbaggageModel[201] = new ModelRendererTurbo(this, 169, 81, textureX, textureY); // Box 357
		drgbaggageModel[202] = new ModelRendererTurbo(this, 185, 97, textureX, textureY); // Box 358
		drgbaggageModel[203] = new ModelRendererTurbo(this, 209, 97, textureX, textureY); // Box 359
		drgbaggageModel[204] = new ModelRendererTurbo(this, 465, 97, textureX, textureY); // Box 360
		drgbaggageModel[205] = new ModelRendererTurbo(this, 473, 97, textureX, textureY); // Box 361
		drgbaggageModel[206] = new ModelRendererTurbo(this, 489, 97, textureX, textureY); // Box 362
		drgbaggageModel[207] = new ModelRendererTurbo(this, 233, 97, textureX, textureY); // Box 363
		drgbaggageModel[208] = new ModelRendererTurbo(this, 225, 121, textureX, textureY); // Box 463
		drgbaggageModel[209] = new ModelRendererTurbo(this, 257, 121, textureX, textureY); // Box 464
		drgbaggageModel[210] = new ModelRendererTurbo(this, 497, 97, textureX, textureY); // Box 465
		drgbaggageModel[211] = new ModelRendererTurbo(this, 457, 113, textureX, textureY); // Box 467
		drgbaggageModel[212] = new ModelRendererTurbo(this, 249, 97, textureX, textureY); // Box 470
		drgbaggageModel[213] = new ModelRendererTurbo(this, 273, 97, textureX, textureY); // Box 473
		drgbaggageModel[214] = new ModelRendererTurbo(this, 289, 121, textureX, textureY); // Box 474
		drgbaggageModel[215] = new ModelRendererTurbo(this, 265, 81, textureX, textureY); // Box 392
		drgbaggageModel[216] = new ModelRendererTurbo(this, 465, 73, textureX, textureY); // Box 393
		drgbaggageModel[217] = new ModelRendererTurbo(this, 297, 81, textureX, textureY); // Box 394
		drgbaggageModel[218] = new ModelRendererTurbo(this, 481, 73, textureX, textureY); // Box 395
		drgbaggageModel[219] = new ModelRendererTurbo(this, 289, 97, textureX, textureY); // Box 396
		drgbaggageModel[220] = new ModelRendererTurbo(this, 369, 97, textureX, textureY); // Box 397
		drgbaggageModel[221] = new ModelRendererTurbo(this, 97, 81, textureX, textureY); // Box 398
		drgbaggageModel[222] = new ModelRendererTurbo(this, 361, 81, textureX, textureY); // Box 399
		drgbaggageModel[223] = new ModelRendererTurbo(this, 217, 81, textureX, textureY); // Box 400
		drgbaggageModel[224] = new ModelRendererTurbo(this, 417, 81, textureX, textureY); // Box 401
		drgbaggageModel[225] = new ModelRendererTurbo(this, 249, 105, textureX, textureY); // Box 402
		drgbaggageModel[226] = new ModelRendererTurbo(this, 441, 81, textureX, textureY); // Box 403
		drgbaggageModel[227] = new ModelRendererTurbo(this, 249, 81, textureX, textureY); // Box 404
		drgbaggageModel[228] = new ModelRendererTurbo(this, 457, 81, textureX, textureY); // Box 405
		drgbaggageModel[229] = new ModelRendererTurbo(this, 281, 81, textureX, textureY); // Box 406
		drgbaggageModel[230] = new ModelRendererTurbo(this, 281, 105, textureX, textureY); // Box 407
		drgbaggageModel[231] = new ModelRendererTurbo(this, 313, 81, textureX, textureY); // Box 408
		drgbaggageModel[232] = new ModelRendererTurbo(this, 481, 81, textureX, textureY); // Box 409
		drgbaggageModel[233] = new ModelRendererTurbo(this, 33, 89, textureX, textureY); // Box 410
		drgbaggageModel[234] = new ModelRendererTurbo(this, 497, 81, textureX, textureY); // Box 411
		drgbaggageModel[235] = new ModelRendererTurbo(this, 241, 121, textureX, textureY); // Box 412
		drgbaggageModel[236] = new ModelRendererTurbo(this, 65, 89, textureX, textureY); // Box 413
		drgbaggageModel[237] = new ModelRendererTurbo(this, 129, 89, textureX, textureY); // Box 414
		drgbaggageModel[238] = new ModelRendererTurbo(this, 73, 89, textureX, textureY); // Box 415
		drgbaggageModel[239] = new ModelRendererTurbo(this, 185, 89, textureX, textureY); // Box 416
		drgbaggageModel[240] = new ModelRendererTurbo(this, 297, 121, textureX, textureY); // Box 417
		drgbaggageModel[241] = new ModelRendererTurbo(this, 385, 57, textureX, textureY); // Box 417
		drgbaggageModel[242] = new ModelRendererTurbo(this, 369, 73, textureX, textureY); // Box 418
		drgbaggageModel[243] = new ModelRendererTurbo(this, 329, 121, textureX, textureY); // Box 388
		drgbaggageModel[244] = new ModelRendererTurbo(this, 361, 121, textureX, textureY); // Box 389
		drgbaggageModel[245] = new ModelRendererTurbo(this, 393, 121, textureX, textureY); // Box 390
		drgbaggageModel[246] = new ModelRendererTurbo(this, 401, 121, textureX, textureY); // Box 391
		drgbaggageModel[247] = new ModelRendererTurbo(this, 409, 121, textureX, textureY); // Box 392
		drgbaggageModel[248] = new ModelRendererTurbo(this, 241, 129, textureX, textureY); // Box 394
		drgbaggageModel[249] = new ModelRendererTurbo(this, 313, 97, textureX, textureY); // Box 397
		drgbaggageModel[250] = new ModelRendererTurbo(this, 217, 121, textureX, textureY); // Box 398
		drgbaggageModel[251] = new ModelRendererTurbo(this, 297, 129, textureX, textureY); // Box 399
		drgbaggageModel[252] = new ModelRendererTurbo(this, 441, 121, textureX, textureY); // Box 400
		drgbaggageModel[253] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Box 401
		drgbaggageModel[254] = new ModelRendererTurbo(this, 9, 113, textureX, textureY); // Box 402
		drgbaggageModel[255] = new ModelRendererTurbo(this, 273, 121, textureX, textureY); // Box 403
		drgbaggageModel[256] = new ModelRendererTurbo(this, 1, 137, textureX, textureY); // Box 405
		drgbaggageModel[257] = new ModelRendererTurbo(this, 201, 97, textureX, textureY); // Box 406
		drgbaggageModel[258] = new ModelRendererTurbo(this, 225, 97, textureX, textureY); // Box 407
		drgbaggageModel[259] = new ModelRendererTurbo(this, 265, 97, textureX, textureY); // Box 408
		drgbaggageModel[260] = new ModelRendererTurbo(this, 321, 97, textureX, textureY); // Box 409
		drgbaggageModel[261] = new ModelRendererTurbo(this, 425, 97, textureX, textureY); // Box 410
		drgbaggageModel[262] = new ModelRendererTurbo(this, 473, 121, textureX, textureY); // Box 411
		drgbaggageModel[263] = new ModelRendererTurbo(this, 201, 105, textureX, textureY); // Box 416
		drgbaggageModel[264] = new ModelRendererTurbo(this, 249, 97, textureX, textureY); // Box 418
		drgbaggageModel[265] = new ModelRendererTurbo(this, 337, 97, textureX, textureY); // Box 419
		drgbaggageModel[266] = new ModelRendererTurbo(this, 425, 73, textureX, textureY); // Box 420
		drgbaggageModel[267] = new ModelRendererTurbo(this, 41, 81, textureX, textureY); // Box 421
		drgbaggageModel[268] = new ModelRendererTurbo(this, 73, 81, textureX, textureY); // Box 422
		drgbaggageModel[269] = new ModelRendererTurbo(this, 137, 81, textureX, textureY); // Box 423
		drgbaggageModel[270] = new ModelRendererTurbo(this, 169, 89, textureX, textureY); // Box 424
		drgbaggageModel[271] = new ModelRendererTurbo(this, 201, 89, textureX, textureY); // Box 425
		drgbaggageModel[272] = new ModelRendererTurbo(this, 441, 97, textureX, textureY); // Box 426
		drgbaggageModel[273] = new ModelRendererTurbo(this, 473, 97, textureX, textureY); // Box 427
		drgbaggageModel[274] = new ModelRendererTurbo(this, 481, 121, textureX, textureY); // Box 428
		drgbaggageModel[275] = new ModelRendererTurbo(this, 473, 129, textureX, textureY); // Box 431
		drgbaggageModel[276] = new ModelRendererTurbo(this, 377, 129, textureX, textureY); // Box 432
		drgbaggageModel[277] = new ModelRendererTurbo(this, 65, 137, textureX, textureY); // Box 433
		drgbaggageModel[278] = new ModelRendererTurbo(this, 225, 105, textureX, textureY); // Box 434
		drgbaggageModel[279] = new ModelRendererTurbo(this, 97, 137, textureX, textureY); // Box 435
		drgbaggageModel[280] = new ModelRendererTurbo(this, 281, 121, textureX, textureY); // Box 436
		drgbaggageModel[281] = new ModelRendererTurbo(this, 385, 129, textureX, textureY); // Box 437
		drgbaggageModel[282] = new ModelRendererTurbo(this, 129, 137, textureX, textureY); // Box 438
		drgbaggageModel[283] = new ModelRendererTurbo(this, 505, 129, textureX, textureY); // Box 427
		drgbaggageModel[284] = new ModelRendererTurbo(this, 161, 137, textureX, textureY); // Box 428
		drgbaggageModel[285] = new ModelRendererTurbo(this, 169, 137, textureX, textureY); // Box 429
		drgbaggageModel[286] = new ModelRendererTurbo(this, 177, 137, textureX, textureY); // Box 430
		drgbaggageModel[287] = new ModelRendererTurbo(this, 185, 137, textureX, textureY); // Box 431
		drgbaggageModel[288] = new ModelRendererTurbo(this, 193, 137, textureX, textureY); // Box 432
		drgbaggageModel[289] = new ModelRendererTurbo(this, 201, 137, textureX, textureY); // Box 433
		drgbaggageModel[290] = new ModelRendererTurbo(this, 209, 137, textureX, textureY); // Box 434
		drgbaggageModel[291] = new ModelRendererTurbo(this, 217, 137, textureX, textureY); // Box 435
		drgbaggageModel[292] = new ModelRendererTurbo(this, 297, 137, textureX, textureY); // Box 436
		drgbaggageModel[293] = new ModelRendererTurbo(this, 497, 97, textureX, textureY); // Box 437
		drgbaggageModel[294] = new ModelRendererTurbo(this, 305, 137, textureX, textureY); // Box 438
		drgbaggageModel[295] = new ModelRendererTurbo(this, 41, 57, textureX, textureY); // Box 440
		drgbaggageModel[296] = new ModelRendererTurbo(this, 89, 137, textureX, textureY); // Box 452
		drgbaggageModel[297] = new ModelRendererTurbo(this, 249, 137, textureX, textureY); // Box 453
		drgbaggageModel[298] = new ModelRendererTurbo(this, 321, 137, textureX, textureY); // Box 455
		drgbaggageModel[299] = new ModelRendererTurbo(this, 409, 137, textureX, textureY); // Box 457
		drgbaggageModel[300] = new ModelRendererTurbo(this, 1, 145, textureX, textureY); // Box 458
		drgbaggageModel[301] = new ModelRendererTurbo(this, 361, 137, textureX, textureY); // Box 427
		drgbaggageModel[302] = new ModelRendererTurbo(this, 457, 89, textureX, textureY); // Box 432
		drgbaggageModel[303] = new ModelRendererTurbo(this, 41, 145, textureX, textureY); // Box 453
		drgbaggageModel[304] = new ModelRendererTurbo(this, 497, 89, textureX, textureY); // Box 454
		drgbaggageModel[305] = new ModelRendererTurbo(this, 57, 145, textureX, textureY); // Box 455
		drgbaggageModel[306] = new ModelRendererTurbo(this, 217, 121, textureX, textureY); // Box 456
		drgbaggageModel[307] = new ModelRendererTurbo(this, 73, 145, textureX, textureY); // Box 457
		drgbaggageModel[308] = new ModelRendererTurbo(this, 441, 121, textureX, textureY); // Box 458
		drgbaggageModel[309] = new ModelRendererTurbo(this, 89, 145, textureX, textureY); // Box 459
		drgbaggageModel[310] = new ModelRendererTurbo(this, 449, 121, textureX, textureY); // Box 460
		drgbaggageModel[311] = new ModelRendererTurbo(this, 105, 145, textureX, textureY); // Box 463
		drgbaggageModel[312] = new ModelRendererTurbo(this, 113, 145, textureX, textureY); // Box 464
		drgbaggageModel[313] = new ModelRendererTurbo(this, 121, 145, textureX, textureY); // Box 465
		drgbaggageModel[314] = new ModelRendererTurbo(this, 225, 145, textureX, textureY); // Box 466
		drgbaggageModel[315] = new ModelRendererTurbo(this, 153, 145, textureX, textureY); // Box 467
		drgbaggageModel[316] = new ModelRendererTurbo(this, 257, 145, textureX, textureY); // Box 468
		drgbaggageModel[317] = new ModelRendererTurbo(this, 265, 145, textureX, textureY); // Box 469
		drgbaggageModel[318] = new ModelRendererTurbo(this, 273, 145, textureX, textureY); // Box 470
		drgbaggageModel[319] = new ModelRendererTurbo(this, 281, 137, textureX, textureY); // Box 331
		drgbaggageModel[320] = new ModelRendererTurbo(this, 305, 145, textureX, textureY); // Box 332
		drgbaggageModel[321] = new ModelRendererTurbo(this, 321, 145, textureX, textureY); // Box 333
		drgbaggageModel[322] = new ModelRendererTurbo(this, 337, 145, textureX, textureY); // Box 334
		drgbaggageModel[323] = new ModelRendererTurbo(this, 345, 145, textureX, textureY); // Box 335
		drgbaggageModel[324] = new ModelRendererTurbo(this, 393, 137, textureX, textureY); // Box 336
		drgbaggageModel[325] = new ModelRendererTurbo(this, 449, 137, textureX, textureY); // Box 337
		drgbaggageModel[326] = new ModelRendererTurbo(this, 409, 145, textureX, textureY); // Box 338
		drgbaggageModel[327] = new ModelRendererTurbo(this, 1, 153, textureX, textureY); // Box 339
		drgbaggageModel[328] = new ModelRendererTurbo(this, 81, 145, textureX, textureY); // Box 340
		drgbaggageModel[329] = new ModelRendererTurbo(this, 361, 145, textureX, textureY); // Box 341
		drgbaggageModel[330] = new ModelRendererTurbo(this, 433, 145, textureX, textureY); // Box 342
		drgbaggageModel[331] = new ModelRendererTurbo(this, 465, 145, textureX, textureY); // Box 343
		drgbaggageModel[332] = new ModelRendererTurbo(this, 481, 145, textureX, textureY); // Box 344
		drgbaggageModel[333] = new ModelRendererTurbo(this, 441, 145, textureX, textureY); // Box 345
		drgbaggageModel[334] = new ModelRendererTurbo(this, 497, 145, textureX, textureY); // Box 346
		drgbaggageModel[335] = new ModelRendererTurbo(this, 121, 153, textureX, textureY); // Box 347
		drgbaggageModel[336] = new ModelRendererTurbo(this, 97, 153, textureX, textureY); // Box 348
		drgbaggageModel[337] = new ModelRendererTurbo(this, 137, 153, textureX, textureY); // Box 349
		drgbaggageModel[338] = new ModelRendererTurbo(this, 153, 153, textureX, textureY); // Box 350
		drgbaggageModel[339] = new ModelRendererTurbo(this, 169, 153, textureX, textureY); // Box 351
		drgbaggageModel[340] = new ModelRendererTurbo(this, 281, 129, textureX, textureY); // Box 352
		drgbaggageModel[341] = new ModelRendererTurbo(this, 297, 129, textureX, textureY); // Box 353
		drgbaggageModel[342] = new ModelRendererTurbo(this, 369, 129, textureX, textureY); // Box 354
		drgbaggageModel[343] = new ModelRendererTurbo(this, 313, 145, textureX, textureY); // Box 355
		drgbaggageModel[344] = new ModelRendererTurbo(this, 329, 145, textureX, textureY); // Box 356
		drgbaggageModel[345] = new ModelRendererTurbo(this, 345, 145, textureX, textureY); // Box 357
		drgbaggageModel[346] = new ModelRendererTurbo(this, 409, 145, textureX, textureY); // Box 358
		drgbaggageModel[347] = new ModelRendererTurbo(this, 425, 145, textureX, textureY); // Box 359
		drgbaggageModel[348] = new ModelRendererTurbo(this, 1, 153, textureX, textureY); // Box 360
		drgbaggageModel[349] = new ModelRendererTurbo(this, 369, 145, textureX, textureY); // Box 361
		drgbaggageModel[350] = new ModelRendererTurbo(this, 177, 153, textureX, textureY); // Box 362
		drgbaggageModel[351] = new ModelRendererTurbo(this, 201, 153, textureX, textureY); // Box 363
		drgbaggageModel[352] = new ModelRendererTurbo(this, 225, 153, textureX, textureY); // Box 364
		drgbaggageModel[353] = new ModelRendererTurbo(this, 217, 153, textureX, textureY); // Box 365
		drgbaggageModel[354] = new ModelRendererTurbo(this, 297, 145, textureX, textureY); // Box 366
		drgbaggageModel[355] = new ModelRendererTurbo(this, 249, 153, textureX, textureY); // Box 367
		drgbaggageModel[356] = new ModelRendererTurbo(this, 257, 153, textureX, textureY); // Box 368
		drgbaggageModel[357] = new ModelRendererTurbo(this, 273, 153, textureX, textureY); // Box 369
		drgbaggageModel[358] = new ModelRendererTurbo(this, 289, 153, textureX, textureY); // Box 370
		drgbaggageModel[359] = new ModelRendererTurbo(this, 313, 153, textureX, textureY); // Box 371
		drgbaggageModel[360] = new ModelRendererTurbo(this, 345, 153, textureX, textureY); // Box 372
		drgbaggageModel[361] = new ModelRendererTurbo(this, 329, 153, textureX, textureY); // Box 373
		drgbaggageModel[362] = new ModelRendererTurbo(this, 361, 153, textureX, textureY); // Box 374
		drgbaggageModel[363] = new ModelRendererTurbo(this, 377, 153, textureX, textureY); // Box 375
		drgbaggageModel[364] = new ModelRendererTurbo(this, 409, 153, textureX, textureY); // Box 376
		drgbaggageModel[365] = new ModelRendererTurbo(this, 73, 153, textureX, textureY); // Box 377
		drgbaggageModel[366] = new ModelRendererTurbo(this, 225, 153, textureX, textureY); // Box 378
		drgbaggageModel[367] = new ModelRendererTurbo(this, 201, 153, textureX, textureY); // Box 379
		drgbaggageModel[368] = new ModelRendererTurbo(this, 241, 153, textureX, textureY); // Box 380
		drgbaggageModel[369] = new ModelRendererTurbo(this, 417, 153, textureX, textureY); // Box 381
		drgbaggageModel[370] = new ModelRendererTurbo(this, 425, 153, textureX, textureY); // Box 382
		drgbaggageModel[371] = new ModelRendererTurbo(this, 465, 153, textureX, textureY); // Box 383
		drgbaggageModel[372] = new ModelRendererTurbo(this, 473, 153, textureX, textureY); // Box 385
		drgbaggageModel[373] = new ModelRendererTurbo(this, 481, 153, textureX, textureY); // Box 388
		drgbaggageModel[374] = new ModelRendererTurbo(this, 497, 153, textureX, textureY); // Box 389
		drgbaggageModel[375] = new ModelRendererTurbo(this, 1, 161, textureX, textureY); // Box 390
		drgbaggageModel[376] = new ModelRendererTurbo(this, 9, 161, textureX, textureY); // Box 391
		drgbaggageModel[377] = new ModelRendererTurbo(this, 25, 161, textureX, textureY); // Box 392
		drgbaggageModel[378] = new ModelRendererTurbo(this, 41, 161, textureX, textureY); // Box 393
		drgbaggageModel[379] = new ModelRendererTurbo(this, 49, 161, textureX, textureY); // Box 394
		drgbaggageModel[380] = new ModelRendererTurbo(this, 65, 161, textureX, textureY); // Box 395
		drgbaggageModel[381] = new ModelRendererTurbo(this, 81, 161, textureX, textureY); // Box 396
		drgbaggageModel[382] = new ModelRendererTurbo(this, 89, 161, textureX, textureY); // Box 397
		drgbaggageModel[383] = new ModelRendererTurbo(this, 105, 161, textureX, textureY); // Box 398
		drgbaggageModel[384] = new ModelRendererTurbo(this, 113, 161, textureX, textureY); // Box 399
		drgbaggageModel[385] = new ModelRendererTurbo(this, 121, 161, textureX, textureY); // Box 400
		drgbaggageModel[386] = new ModelRendererTurbo(this, 129, 161, textureX, textureY); // Box 401
		drgbaggageModel[387] = new ModelRendererTurbo(this, 137, 161, textureX, textureY); // Box 402
		drgbaggageModel[388] = new ModelRendererTurbo(this, 145, 161, textureX, textureY); // Box 403
		drgbaggageModel[389] = new ModelRendererTurbo(this, 153, 161, textureX, textureY); // Box 404
		drgbaggageModel[390] = new ModelRendererTurbo(this, 161, 161, textureX, textureY); // Box 405
		drgbaggageModel[391] = new ModelRendererTurbo(this, 177, 161, textureX, textureY); // Box 406
		drgbaggageModel[392] = new ModelRendererTurbo(this, 265, 153, textureX, textureY); // Box 408
		drgbaggageModel[393] = new ModelRendererTurbo(this, 185, 161, textureX, textureY); // Box 409
		drgbaggageModel[394] = new ModelRendererTurbo(this, 217, 161, textureX, textureY); // Box 410
		drgbaggageModel[395] = new ModelRendererTurbo(this, 297, 161, textureX, textureY); // Box 411
		drgbaggageModel[396] = new ModelRendererTurbo(this, 281, 161, textureX, textureY); // Box 413
		drgbaggageModel[397] = new ModelRendererTurbo(this, 345, 161, textureX, textureY); // Box 414
		drgbaggageModel[398] = new ModelRendererTurbo(this, 353, 161, textureX, textureY); // Box 415
		drgbaggageModel[399] = new ModelRendererTurbo(this, 377, 161, textureX, textureY); // Box 416
		drgbaggageModel[400] = new ModelRendererTurbo(this, 417, 161, textureX, textureY); // Box 417
		drgbaggageModel[401] = new ModelRendererTurbo(this, 457, 161, textureX, textureY); // Box 418
		drgbaggageModel[402] = new ModelRendererTurbo(this, 481, 161, textureX, textureY); // Box 419
		drgbaggageModel[403] = new ModelRendererTurbo(this, 369, 161, textureX, textureY); // Box 420
		drgbaggageModel[404] = new ModelRendererTurbo(this, 433, 161, textureX, textureY); // Box 421
		drgbaggageModel[405] = new ModelRendererTurbo(this, 9, 169, textureX, textureY); // Box 422
		drgbaggageModel[406] = new ModelRendererTurbo(this, 25, 169, textureX, textureY); // Box 423
		drgbaggageModel[407] = new ModelRendererTurbo(this, 49, 169, textureX, textureY); // Box 424
		drgbaggageModel[408] = new ModelRendererTurbo(this, 57, 169, textureX, textureY); // Box 425
		drgbaggageModel[409] = new ModelRendererTurbo(this, 89, 169, textureX, textureY); // Box 426
		drgbaggageModel[410] = new ModelRendererTurbo(this, 113, 169, textureX, textureY); // Box 427
		drgbaggageModel[411] = new ModelRendererTurbo(this, 137, 169, textureX, textureY); // Box 428
		drgbaggageModel[412] = new ModelRendererTurbo(this, 161, 169, textureX, textureY); // Box 429
		drgbaggageModel[413] = new ModelRendererTurbo(this, 185, 169, textureX, textureY); // Box 431
		drgbaggageModel[414] = new ModelRendererTurbo(this, 473, 161, textureX, textureY); // Box 432
		drgbaggageModel[415] = new ModelRendererTurbo(this, 497, 161, textureX, textureY); // Box 433
		drgbaggageModel[416] = new ModelRendererTurbo(this, 73, 169, textureX, textureY); // Box 434
		drgbaggageModel[417] = new ModelRendererTurbo(this, 105, 169, textureX, textureY); // Box 435
		drgbaggageModel[418] = new ModelRendererTurbo(this, 129, 169, textureX, textureY); // Box 436
		drgbaggageModel[419] = new ModelRendererTurbo(this, 153, 169, textureX, textureY); // Box 437
		drgbaggageModel[420] = new ModelRendererTurbo(this, 257, 161, textureX, textureY); // Box 438
		drgbaggageModel[421] = new ModelRendererTurbo(this, 209, 169, textureX, textureY); // Box 439
		drgbaggageModel[422] = new ModelRendererTurbo(this, 233, 169, textureX, textureY); // Box 440
		drgbaggageModel[423] = new ModelRendererTurbo(this, 257, 169, textureX, textureY); // Box 441
		drgbaggageModel[424] = new ModelRendererTurbo(this, 281, 169, textureX, textureY); // Box 442
		drgbaggageModel[425] = new ModelRendererTurbo(this, 305, 169, textureX, textureY); // Box 443
		drgbaggageModel[426] = new ModelRendererTurbo(this, 329, 169, textureX, textureY); // Box 444
		drgbaggageModel[427] = new ModelRendererTurbo(this, 1, 177, textureX, textureY); // Box 438
		drgbaggageModel[428] = new ModelRendererTurbo(this, 353, 177, textureX, textureY); // Box 439
		drgbaggageModel[429] = new ModelRendererTurbo(this, 385, 177, textureX, textureY); // Box 440
		drgbaggageModel[430] = new ModelRendererTurbo(this, 225, 169, textureX, textureY); // Box 441
		drgbaggageModel[431] = new ModelRendererTurbo(this, 249, 169, textureX, textureY); // Box 442
		drgbaggageModel[432] = new ModelRendererTurbo(this, 273, 169, textureX, textureY); // Box 443
		drgbaggageModel[433] = new ModelRendererTurbo(this, 297, 169, textureX, textureY); // Box 444
		drgbaggageModel[434] = new ModelRendererTurbo(this, 321, 169, textureX, textureY); // Box 445
		drgbaggageModel[435] = new ModelRendererTurbo(this, 401, 169, textureX, textureY); // Box 446
		drgbaggageModel[436] = new ModelRendererTurbo(this, 377, 190, textureX, textureY); // Box 469
		drgbaggageModel[437] = new ModelRendererTurbo(this, 370, 189, textureX, textureY); // Box 471
		drgbaggageModel[438] = new ModelRendererTurbo(this, 370, 189, textureX, textureY); // Box 472
		drgbaggageModel[439] = new ModelRendererTurbo(this, 377, 190, textureX, textureY); // Box 447
		drgbaggageModel[440] = new ModelRendererTurbo(this, 370, 189, textureX, textureY); // Box 448
		drgbaggageModel[441] = new ModelRendererTurbo(this, 370, 189, textureX, textureY); // Box 449
		drgbaggageModel[442] = new ModelRendererTurbo(this, 343, 73, textureX, textureY); // Box 453
		drgbaggageModel[443] = new ModelRendererTurbo(this, 449, 49, textureX, textureY); // Box 454
		drgbaggageModel[444] = new ModelRendererTurbo(this, 97, 49, textureX, textureY); // Box 455
		drgbaggageModel[445] = new ModelRendererTurbo(this, 313, 73, textureX, textureY); // Box 456
		drgbaggageModel[446] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 457
		drgbaggageModel[447] = new ModelRendererTurbo(this, 481, 65, textureX, textureY); // Box 458
		drgbaggageModel[448] = new ModelRendererTurbo(this, 449, 65, textureX, textureY); // Box 459
		drgbaggageModel[449] = new ModelRendererTurbo(this, 249, 73, textureX, textureY); // Box 460
		drgbaggageModel[450] = new ModelRendererTurbo(this, 217, 73, textureX, textureY); // Box 461
		drgbaggageModel[451] = new ModelRendererTurbo(this, 281, 73, textureX, textureY); // Box 462
		drgbaggageModel[452] = new ModelRendererTurbo(this, 129, 49, textureX, textureY); // Box 463
		drgbaggageModel[453] = new ModelRendererTurbo(this, 113, 145, textureX, textureY); // Box 453
		drgbaggageModel[454] = new ModelRendererTurbo(this, 113, 145, textureX, textureY); // Box 454
		drgbaggageModel[455] = new ModelRendererTurbo(this, 113, 145, textureX, textureY); // Box 455
		drgbaggageModel[456] = new ModelRendererTurbo(this, 113, 145, textureX, textureY); // Box 456
		drgbaggageModel[457] = new ModelRendererTurbo(this, 113, 145, textureX, textureY); // Box 457
		drgbaggageModel[458] = new ModelRendererTurbo(this, 113, 145, textureX, textureY); // Box 458
		drgbaggageModel[459] = new ModelRendererTurbo(this, 113, 145, textureX, textureY); // Box 459
		drgbaggageModel[460] = new ModelRendererTurbo(this, 113, 145, textureX, textureY); // Box 460
		drgbaggageModel[461] = new ModelRendererTurbo(this, 113, 145, textureX, textureY); // Box 461
		drgbaggageModel[462] = new ModelRendererTurbo(this, 113, 145, textureX, textureY); // Box 462
		drgbaggageModel[463] = new ModelRendererTurbo(this, 113, 145, textureX, textureY); // Box 463
		drgbaggageModel[464] = new ModelRendererTurbo(this, 113, 145, textureX, textureY); // Box 464
		drgbaggageModel[465] = new ModelRendererTurbo(this, 113, 145, textureX, textureY); // Box 465
		drgbaggageModel[466] = new ModelRendererTurbo(this, 113, 145, textureX, textureY); // Box 466
		drgbaggageModel[467] = new ModelRendererTurbo(this, 113, 145, textureX, textureY); // Box 467
		drgbaggageModel[468] = new ModelRendererTurbo(this, 113, 145, textureX, textureY); // Box 468
		drgbaggageModel[469] = new ModelRendererTurbo(this, 113, 145, textureX, textureY); // Box 469
		drgbaggageModel[470] = new ModelRendererTurbo(this, 113, 145, textureX, textureY); // Box 470
		drgbaggageModel[471] = new ModelRendererTurbo(this, 113, 145, textureX, textureY); // Box 471
		drgbaggageModel[472] = new ModelRendererTurbo(this, 113, 145, textureX, textureY); // Box 472
		drgbaggageModel[473] = new ModelRendererTurbo(this, 113, 145, textureX, textureY); // Box 473
		drgbaggageModel[474] = new ModelRendererTurbo(this, 113, 145, textureX, textureY); // Box 474
		drgbaggageModel[475] = new ModelRendererTurbo(this, 113, 145, textureX, textureY); // Box 475
		drgbaggageModel[476] = new ModelRendererTurbo(this, 113, 145, textureX, textureY); // Box 476
		drgbaggageModel[477] = new ModelRendererTurbo(this, 492, 242, textureX, textureY); // Box 515
		drgbaggageModel[478] = new ModelRendererTurbo(this, 464, 247, textureX, textureY); // Box 517
		drgbaggageModel[479] = new ModelRendererTurbo(this, 492, 246, textureX, textureY); // Box 520
		drgbaggageModel[480] = new ModelRendererTurbo(this, 475, 235, textureX, textureY); // Box 525
		drgbaggageModel[481] = new ModelRendererTurbo(this, 484, 240, textureX, textureY); // Box 527
		drgbaggageModel[482] = new ModelRendererTurbo(this, 484, 237, textureX, textureY); // Box 528
		drgbaggageModel[483] = new ModelRendererTurbo(this, 484, 246, textureX, textureY); // Box 529
		drgbaggageModel[484] = new ModelRendererTurbo(this, 484, 243, textureX, textureY); // Box 530
		drgbaggageModel[485] = new ModelRendererTurbo(this, 475, 235, textureX, textureY); // Box 477
		drgbaggageModel[486] = new ModelRendererTurbo(this, 484, 240, textureX, textureY); // Box 478
		drgbaggageModel[487] = new ModelRendererTurbo(this, 484, 243, textureX, textureY); // Box 479
		drgbaggageModel[488] = new ModelRendererTurbo(this, 484, 246, textureX, textureY); // Box 480
		drgbaggageModel[489] = new ModelRendererTurbo(this, 492, 246, textureX, textureY); // Box 481
		drgbaggageModel[490] = new ModelRendererTurbo(this, 492, 242, textureX, textureY); // Box 482
		drgbaggageModel[491] = new ModelRendererTurbo(this, 464, 247, textureX, textureY); // Box 483
		drgbaggageModel[492] = new ModelRendererTurbo(this, 484, 237, textureX, textureY); // Box 484

		drgbaggageModel[0].addBox(0F, 0F, 0F, 6, 6, 0, 0F); // Box 0
		drgbaggageModel[0].setRotationPoint(36F, 4F, -5F);

		drgbaggageModel[1].addBox(0F, 0F, 0F, 6, 6, 0, 0F); // Box 2
		drgbaggageModel[1].setRotationPoint(36F, 4F, 5F);

		drgbaggageModel[2].addBox(0F, 0F, 0F, 2, 1, 20, 0F); // Box 3
		drgbaggageModel[2].setRotationPoint(-55F, 2F, -10F);

		drgbaggageModel[3].addBox(0F, 0F, 0F, 6, 6, 0, 0F); // Box 4
		drgbaggageModel[3].setRotationPoint(25F, 4F, 5F);

		drgbaggageModel[4].addBox(0F, 0F, 0F, 6, 6, 0, 0F); // Box 5
		drgbaggageModel[4].setRotationPoint(25F, 4F, -5F);

		drgbaggageModel[5].addBox(0F, 0F, 0F, 1, 10, 6, 0F); // Box 21
		drgbaggageModel[5].setRotationPoint(-45F, -8F, -9F);

		drgbaggageModel[6].addBox(0F, 0F, 0F, 1, 10, 6, 0F); // Box 22
		drgbaggageModel[6].setRotationPoint(-45F, -8F, 3F);

		drgbaggageModel[7].addShapeBox(0F, 0F, 0F, 38, 22, 1, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F); // Box 23
		drgbaggageModel[7].setRotationPoint(-45F, -20F, 9F);

		drgbaggageModel[8].addBox(0F, 0F, 0F, 1, 9, 2, 0F); // Box 36
		drgbaggageModel[8].setRotationPoint(-45F, -17F, -5F);

		drgbaggageModel[9].addBox(0F, 0F, 0F, 1, 9, 2, 0F); // Box 37
		drgbaggageModel[9].setRotationPoint(-45F, -17F, 7F);

		drgbaggageModel[10].addBox(0F, 0F, 0F, 1, 9, 2, 0F); // Box 38
		drgbaggageModel[10].setRotationPoint(-45F, -17F, 3F);

		drgbaggageModel[11].addBox(0F, 0F, 0F, 1, 9, 2, 0F); // Box 40
		drgbaggageModel[11].setRotationPoint(-45F, -17F, -9F);

		drgbaggageModel[12].addBox(0F, 0F, 0F, 1, 3, 18, 0F); // Box 55
		drgbaggageModel[12].setRotationPoint(-45F, -20F, -9F);

		drgbaggageModel[13].addBox(0F, 0F, 0F, 1, 9, 1, 0F); // Box 65
		drgbaggageModel[13].setRotationPoint(-54F, -7F, -10F);

		drgbaggageModel[14].addBox(0F, 0F, 0F, 1, 9, 1, 0F); // Box 67
		drgbaggageModel[14].setRotationPoint(-54F, -7F, -7F);

		drgbaggageModel[15].addBox(0F, 0F, 0F, 1, 9, 1, 0F); // Box 68
		drgbaggageModel[15].setRotationPoint(-54F, -7F, -4F);

		drgbaggageModel[16].addBox(0F, 0F, 0F, 1, 9, 1, 0F); // Box 69
		drgbaggageModel[16].setRotationPoint(-54F, -7F, 3F);

		drgbaggageModel[17].addBox(0F, 0F, 0F, 1, 9, 1, 0F); // Box 70
		drgbaggageModel[17].setRotationPoint(-54F, -7F, 6F);

		drgbaggageModel[18].addBox(0F, 0F, 0F, 1, 9, 1, 0F); // Box 71
		drgbaggageModel[18].setRotationPoint(-54F, -7F, 9F);

		drgbaggageModel[19].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 72
		drgbaggageModel[19].setRotationPoint(-53F, -8F, -3F);
		drgbaggageModel[19].rotateAngleY = -3.14159265F;

		drgbaggageModel[20].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		drgbaggageModel[20].setRotationPoint(-53F, -8F, 10F);
		drgbaggageModel[20].rotateAngleY = -3.14159265F;

		drgbaggageModel[21].addBox(0F, 0F, 0F, 6, 6, 0, 0F); // Box 65
		drgbaggageModel[21].setRotationPoint(-42F, 4F, -5F);

		drgbaggageModel[22].addBox(0F, 0F, 0F, 6, 6, 0, 0F); // Box 66
		drgbaggageModel[22].setRotationPoint(-31F, 4F, -5F);

		drgbaggageModel[23].addBox(0F, 0F, 0F, 6, 6, 0, 0F); // Box 68
		drgbaggageModel[23].setRotationPoint(-42F, 4F, 5F);

		drgbaggageModel[24].addBox(0F, 0F, 0F, 6, 6, 0, 0F); // Box 69
		drgbaggageModel[24].setRotationPoint(-31F, 4F, 5F);

		drgbaggageModel[25].addShapeBox(0F, 0F, 0F, 38, 22, 1, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F); // Box 79
		drgbaggageModel[25].setRotationPoint(7F, -20F, 9F);

		drgbaggageModel[26].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Box 91
		drgbaggageModel[26].setRotationPoint(-54F, -6F, -3F);

		drgbaggageModel[27].addShapeBox(0F, 0F, 0F, 38, 22, 1, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 94
		drgbaggageModel[27].setRotationPoint(-45F, -20F, -10F);

		drgbaggageModel[28].addBox(0F, 0F, 0F, 1, 10, 6, 0F); // Box 95
		drgbaggageModel[28].setRotationPoint(44F, -8F, -9F);

		drgbaggageModel[29].addBox(0F, 0F, 0F, 1, 10, 6, 0F); // Box 96
		drgbaggageModel[29].setRotationPoint(44F, -8F, 3F);

		drgbaggageModel[30].addBox(0F, 0F, 0F, 1, 3, 18, 0F); // Box 97
		drgbaggageModel[30].setRotationPoint(44F, -20F, -9F);

		drgbaggageModel[31].addBox(0F, 0F, 0F, 1, 9, 2, 0F); // Box 98
		drgbaggageModel[31].setRotationPoint(44F, -17F, 7F);

		drgbaggageModel[32].addBox(0F, 0F, 0F, 1, 9, 2, 0F); // Box 99
		drgbaggageModel[32].setRotationPoint(44F, -17F, 3F);

		drgbaggageModel[33].addBox(0F, 0F, 0F, 1, 9, 2, 0F); // Box 100
		drgbaggageModel[33].setRotationPoint(44F, -17F, -5F);

		drgbaggageModel[34].addBox(0F, 0F, 0F, 1, 9, 2, 0F); // Box 101
		drgbaggageModel[34].setRotationPoint(44F, -17F, -9F);

		drgbaggageModel[35].addShapeBox(0F, 0F, 0F, 38, 22, 1, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 102
		drgbaggageModel[35].setRotationPoint(7F, -20F, -10F);

		drgbaggageModel[36].addBox(0F, 0F, 0F, 1, 9, 1, 0F); // Box 128
		drgbaggageModel[36].setRotationPoint(53F, -7F, 9F);

		drgbaggageModel[37].addBox(0F, 0F, 0F, 1, 9, 1, 0F); // Box 129
		drgbaggageModel[37].setRotationPoint(53F, -7F, 6F);

		drgbaggageModel[38].addBox(0F, 0F, 0F, 1, 9, 1, 0F); // Box 130
		drgbaggageModel[38].setRotationPoint(53F, -7F, 3F);

		drgbaggageModel[39].addBox(0F, 0F, 0F, 1, 9, 1, 0F); // Box 131
		drgbaggageModel[39].setRotationPoint(53F, -7F, -10F);

		drgbaggageModel[40].addBox(0F, 0F, 0F, 1, 9, 1, 0F); // Box 132
		drgbaggageModel[40].setRotationPoint(53F, -7F, -7F);

		drgbaggageModel[41].addBox(0F, 0F, 0F, 1, 9, 1, 0F); // Box 133
		drgbaggageModel[41].setRotationPoint(53F, -7F, -4F);

		drgbaggageModel[42].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 134
		drgbaggageModel[42].setRotationPoint(54F, -8F, 10F);
		drgbaggageModel[42].rotateAngleY = -3.14159265F;

		drgbaggageModel[43].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 135
		drgbaggageModel[43].setRotationPoint(54F, -8F, -3F);
		drgbaggageModel[43].rotateAngleY = -3.14159265F;

		drgbaggageModel[44].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Box 136
		drgbaggageModel[44].setRotationPoint(53F, -6F, -3F);

		drgbaggageModel[45].addBox(0F, 0F, 0F, 90, 1, 20, 0F); // Box 137
		drgbaggageModel[45].setRotationPoint(-45F, 2F, -10F);

		drgbaggageModel[46].addBox(0F, 0F, 0F, 2, 1, 20, 0F); // Box 138
		drgbaggageModel[46].setRotationPoint(53F, 2F, -10F);

		drgbaggageModel[47].addBox(0F, 0F, 0F, 1, 1, 20, 0F); // Box 139
		drgbaggageModel[47].setRotationPoint(-53F, 2F, -10F);

		drgbaggageModel[48].addBox(0F, 0F, 0F, 1, 1, 20, 0F); // Box 140
		drgbaggageModel[48].setRotationPoint(-46F, 2F, -10F);

		drgbaggageModel[49].addBox(0F, 0F, 0F, 6, 1, 12, 0F); // Box 141
		drgbaggageModel[49].setRotationPoint(-52F, 2F, -6F);

		drgbaggageModel[50].addBox(0F, 0F, 0F, 6, 1, 2, 0F); // Box 143
		drgbaggageModel[50].setRotationPoint(-52F, 4.5F, -8F);

		drgbaggageModel[51].addBox(0F, 0F, 0F, 6, 1, 3, 0F); // Box 145
		drgbaggageModel[51].setRotationPoint(-52F, 7F, -10F);

		drgbaggageModel[52].addBox(0F, 0F, 0F, 1, 3, 5, 0F); // Box 146
		drgbaggageModel[52].setRotationPoint(-53F, 3F, -10F);

		drgbaggageModel[53].addBox(0F, 0F, 0F, 1, 2, 3, 0F); // Box 147
		drgbaggageModel[53].setRotationPoint(-53F, 6F, -10F);

		drgbaggageModel[54].addBox(0F, 0F, 0F, 6, 1, 12, 0F); // Box 158
		drgbaggageModel[54].setRotationPoint(46F, 2F, -6F);

		drgbaggageModel[55].addBox(0F, 0F, 0F, 1, 1, 20, 0F); // Box 159
		drgbaggageModel[55].setRotationPoint(52F, 2F, -10F);

		drgbaggageModel[56].addBox(0F, 0F, 0F, 1, 1, 20, 0F); // Box 160
		drgbaggageModel[56].setRotationPoint(45F, 2F, -10F);

		drgbaggageModel[57].addBox(0F, 0F, 0F, 1, 3, 5, 0F); // Box 171
		drgbaggageModel[57].setRotationPoint(-46F, 3F, -10F);

		drgbaggageModel[58].addBox(0F, 0F, 0F, 1, 2, 3, 0F); // Box 172
		drgbaggageModel[58].setRotationPoint(-46F, 6F, -10F);

		drgbaggageModel[59].addBox(0F, 0F, 0F, 6, 3, 1, 0F); // Box 173
		drgbaggageModel[59].setRotationPoint(-52F, 3F, -6F);

		drgbaggageModel[60].addBox(0F, 0F, 0F, 6, 2, 1, 0F); // Box 174
		drgbaggageModel[60].setRotationPoint(-52F, 5.5F, -8F);

		drgbaggageModel[61].addBox(0F, 0F, 0F, 6, 1, 1, 0F); // Box 175
		drgbaggageModel[61].setRotationPoint(-52F, 5F, -7F);

		drgbaggageModel[62].addBox(0F, 0F, 0F, 6, 3, 1, 0F); // Box 176
		drgbaggageModel[62].setRotationPoint(-52F, 3F, 5F);

		drgbaggageModel[63].addBox(0F, 0F, 0F, 6, 1, 2, 0F); // Box 177
		drgbaggageModel[63].setRotationPoint(-52F, 4.5F, 6F);

		drgbaggageModel[64].addBox(0F, 0F, 0F, 6, 2, 1, 0F); // Box 178
		drgbaggageModel[64].setRotationPoint(-52F, 5.5F, 7F);

		drgbaggageModel[65].addBox(0F, 0F, 0F, 6, 1, 3, 0F); // Box 179
		drgbaggageModel[65].setRotationPoint(-52F, 7F, 7F);

		drgbaggageModel[66].addBox(0F, 0F, 0F, 1, 3, 5, 0F); // Box 180
		drgbaggageModel[66].setRotationPoint(-46F, 3F, 5F);

		drgbaggageModel[67].addBox(0F, 0F, 0F, 1, 2, 3, 0F); // Box 181
		drgbaggageModel[67].setRotationPoint(-46F, 6F, 7F);

		drgbaggageModel[68].addBox(0F, 0F, 0F, 1, 3, 5, 0F); // Box 182
		drgbaggageModel[68].setRotationPoint(-53F, 3F, 5F);

		drgbaggageModel[69].addBox(0F, 0F, 0F, 1, 2, 3, 0F); // Box 183
		drgbaggageModel[69].setRotationPoint(-53F, 6F, 7F);

		drgbaggageModel[70].addBox(0F, 0F, 0F, 1, 1, 20, 0F); // Box 184
		drgbaggageModel[70].setRotationPoint(-55F, 3F, -10F);

		drgbaggageModel[71].addBox(0F, 0F, 0F, 1, 1, 20, 0F); // Box 185
		drgbaggageModel[71].setRotationPoint(54F, 3F, -10F);

		drgbaggageModel[72].addBox(0F, 0F, 0F, 6, 3, 1, 0F); // Box 186
		drgbaggageModel[72].setRotationPoint(46F, 3F, -6F);

		drgbaggageModel[73].addBox(0F, 0F, 0F, 6, 1, 2, 0F); // Box 187
		drgbaggageModel[73].setRotationPoint(46F, 4.5F, -8F);

		drgbaggageModel[74].addBox(0F, 0F, 0F, 6, 2, 1, 0F); // Box 188
		drgbaggageModel[74].setRotationPoint(46F, 5.5F, -8F);

		drgbaggageModel[75].addBox(0F, 0F, 0F, 6, 1, 3, 0F); // Box 189
		drgbaggageModel[75].setRotationPoint(46F, 7F, -10F);

		drgbaggageModel[76].addBox(0F, 0F, 0F, 1, 3, 5, 0F); // Box 190
		drgbaggageModel[76].setRotationPoint(45F, 3F, -10F);

		drgbaggageModel[77].addBox(0F, 0F, 0F, 6, 1, 1, 0F); // Box 191
		drgbaggageModel[77].setRotationPoint(-52F, 5F, 6F);

		drgbaggageModel[78].addBox(0F, 0F, 0F, 6, 1, 1, 0F); // Box 192
		drgbaggageModel[78].setRotationPoint(46F, 5F, -7F);

		drgbaggageModel[79].addBox(0F, 0F, 0F, 1, 2, 3, 0F); // Box 193
		drgbaggageModel[79].setRotationPoint(45F, 6F, -10F);

		drgbaggageModel[80].addBox(0F, 0F, 0F, 1, 3, 5, 0F); // Box 194
		drgbaggageModel[80].setRotationPoint(52F, 3F, -10F);

		drgbaggageModel[81].addBox(0F, 0F, 0F, 1, 2, 3, 0F); // Box 195
		drgbaggageModel[81].setRotationPoint(52F, 6F, -10F);

		drgbaggageModel[82].addBox(0F, 0F, 0F, 6, 3, 1, 0F); // Box 196
		drgbaggageModel[82].setRotationPoint(46F, 3F, 5F);

		drgbaggageModel[83].addBox(0F, 0F, 0F, 6, 1, 1, 0F); // Box 197
		drgbaggageModel[83].setRotationPoint(46F, 5F, 6F);

		drgbaggageModel[84].addBox(0F, 0F, 0F, 6, 2, 1, 0F); // Box 198
		drgbaggageModel[84].setRotationPoint(46F, 5.5F, 7F);

		drgbaggageModel[85].addBox(0F, 0F, 0F, 6, 1, 3, 0F); // Box 199
		drgbaggageModel[85].setRotationPoint(46F, 7F, 7F);

		drgbaggageModel[86].addBox(0F, 0F, 0F, 6, 1, 2, 0F); // Box 200
		drgbaggageModel[86].setRotationPoint(46F, 4.5F, 6F);

		drgbaggageModel[87].addBox(0F, 0F, 0F, 1, 3, 5, 0F); // Box 201
		drgbaggageModel[87].setRotationPoint(45F, 3F, 5F);

		drgbaggageModel[88].addBox(0F, 0F, 0F, 1, 3, 5, 0F); // Box 202
		drgbaggageModel[88].setRotationPoint(52F, 3F, 5F);

		drgbaggageModel[89].addBox(0F, 0F, 0F, 1, 2, 3, 0F); // Box 203
		drgbaggageModel[89].setRotationPoint(52F, 6F, 7F);

		drgbaggageModel[90].addBox(0F, 0F, 0F, 1, 2, 3, 0F); // Box 204
		drgbaggageModel[90].setRotationPoint(45F, 6F, 7F);

		drgbaggageModel[91].addBox(0F, 0F, 0F, 90, 1, 2, 0F); // Box 205
		drgbaggageModel[91].setRotationPoint(-45F, 3F, -10F);

		drgbaggageModel[92].addBox(0F, 0F, 0F, 90, 1, 2, 0F); // Box 206
		drgbaggageModel[92].setRotationPoint(-45F, 3F, 8F);

		drgbaggageModel[93].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 207
		drgbaggageModel[93].setRotationPoint(-54F, 3F, -10F);

		drgbaggageModel[94].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 208
		drgbaggageModel[94].setRotationPoint(-54F, 3F, 9F);

		drgbaggageModel[95].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 209
		drgbaggageModel[95].setRotationPoint(53F, 3F, 9F);

		drgbaggageModel[96].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 210
		drgbaggageModel[96].setRotationPoint(53F, 3F, -10F);

		drgbaggageModel[97].addShapeBox(0F, 0F, 0F, 110, 1, 3, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, -0.05F, 0.05F, 0F, -0.05F, 0.05F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, -0.01F, -0.3F, 0F, -0.01F, -0.3F); // Box 211
		drgbaggageModel[97].setRotationPoint(-55F, -20F, -10.98F);
		drgbaggageModel[97].rotateAngleX = 0.34906585F;

		drgbaggageModel[98].addShapeBox(0F, 0F, 0F, 13, 3, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 148
		drgbaggageModel[98].setRotationPoint(-50F, -24F, -7F);

		drgbaggageModel[99].addShapeBox(0F, 0F, 0F, 5, 3, 14, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 149
		drgbaggageModel[99].setRotationPoint(-55F, -24F, -7F);

		drgbaggageModel[100].addShapeBox(0F, 0F, 0F, 5, 3, 14, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 150
		drgbaggageModel[100].setRotationPoint(50F, -24F, -7F);

		drgbaggageModel[101].addBox(0F, 0F, 0F, 9, 1, 12, 0F); // Box 151
		drgbaggageModel[101].setRotationPoint(29F, 7F, -6F);

		drgbaggageModel[102].addBox(0F, 0F, 0F, 13, 1, 12, 0F); // Box 152
		drgbaggageModel[102].setRotationPoint(27F, 5F, -6F);

		drgbaggageModel[103].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 153
		drgbaggageModel[103].setRotationPoint(28F, 7F, -6F);

		drgbaggageModel[104].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 155
		drgbaggageModel[104].setRotationPoint(27F, 6F, -6F);

		drgbaggageModel[105].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 156
		drgbaggageModel[105].setRotationPoint(28F, 6F, -6F);

		drgbaggageModel[106].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 157
		drgbaggageModel[106].setRotationPoint(38F, 6F, -6F);

		drgbaggageModel[107].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 158
		drgbaggageModel[107].setRotationPoint(38F, 7F, -6F);

		drgbaggageModel[108].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 159
		drgbaggageModel[108].setRotationPoint(39F, 6F, -6F);

		drgbaggageModel[109].addBox(0F, 0F, 0F, 2, 1, 12, 0F); // Box 160
		drgbaggageModel[109].setRotationPoint(30F, 6F, -6F);

		drgbaggageModel[110].addBox(0F, 0F, 0F, 2, 1, 12, 0F); // Box 161
		drgbaggageModel[110].setRotationPoint(35F, 6F, -6F);

		drgbaggageModel[111].addBox(0F, 0F, 0F, 5, 2, 6, 0F); // Box 162
		drgbaggageModel[111].setRotationPoint(31F, 3F, -3F);

		drgbaggageModel[112].addShapeBox(0F, 0F, 0F, 29, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 173
		drgbaggageModel[112].setRotationPoint(-15F, 5.9F, -6F);

		drgbaggageModel[113].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 174
		drgbaggageModel[113].setRotationPoint(-25F, 2F, -6F);
		drgbaggageModel[113].rotateAngleZ = -0.36651914F;

		drgbaggageModel[114].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 177
		drgbaggageModel[114].setRotationPoint(24F, 2F, -5.5F);
		drgbaggageModel[114].rotateAngleY = -3.14159265F;
		drgbaggageModel[114].rotateAngleZ = -0.36651914F;

		drgbaggageModel[115].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 178
		drgbaggageModel[115].setRotationPoint(24F, 2F, 6F);
		drgbaggageModel[115].rotateAngleY = -3.14159265F;
		drgbaggageModel[115].rotateAngleZ = -0.36651914F;

		drgbaggageModel[116].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 179
		drgbaggageModel[116].setRotationPoint(-25F, 2F, 5.5F);
		drgbaggageModel[116].rotateAngleZ = -0.36651914F;

		drgbaggageModel[117].addShapeBox(0F, 0F, 0F, 29, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 180
		drgbaggageModel[117].setRotationPoint(-15F, 5.9F, 5.5F);

		drgbaggageModel[118].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 181
		drgbaggageModel[118].setRotationPoint(-15F, 2.4F, -6F);

		drgbaggageModel[119].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 182
		drgbaggageModel[119].setRotationPoint(13.5F, 2.4F, -6F);

		drgbaggageModel[120].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 184
		drgbaggageModel[120].setRotationPoint(-15F, 2.4F, 5.5F);

		drgbaggageModel[121].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 186
		drgbaggageModel[121].setRotationPoint(13.5F, 2.4F, 5.5F);

		drgbaggageModel[122].addBox(0F, 0F, 0F, 10, 1, 16, 0F); // Box 185
		drgbaggageModel[122].setRotationPoint(-55F, -21F, -8.1F);

		drgbaggageModel[123].addBox(0F, 0F, 0F, 10, 1, 16, 0F); // Box 189
		drgbaggageModel[123].setRotationPoint(45F, -21F, -8.1F);

		drgbaggageModel[124].addShapeBox(0F, 0F, 0F, 90, 1, 2, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 190
		drgbaggageModel[124].setRotationPoint(-45F, -21F, -8F);

		drgbaggageModel[125].addShapeBox(0F, 0F, 0F, 90, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 191
		drgbaggageModel[125].setRotationPoint(-45F, -21F, 6F);

		drgbaggageModel[126].addShapeBox(0F, 0F, 0F, 100, 1, 15, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 193
		drgbaggageModel[126].setRotationPoint(-50F, -24.5F, -7.5F);

		drgbaggageModel[127].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F, 0F, -3F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -3F, 0F, -0.7F, 0F, -0.5F, 0F, -2.5F, -0.5F, 0F, -2.5F, 0F, -0.7F, 0F, 0F); // Box 196
		drgbaggageModel[127].setRotationPoint(-55F, -24F, -8F);

		drgbaggageModel[128].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F, 0F, -3F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -3F, 0F, -0.7F, 0F, -0.5F, 0F, -2.5F, -0.5F, 0F, -2.5F, 0F, -0.7F, 0F, 0F); // Box 198
		drgbaggageModel[128].setRotationPoint(-55F, -24F, 6.5F);

		drgbaggageModel[129].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F, 0F, -3F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -3F, 0F, -0.7F, 0F, -0.5F, 0F, -2.5F, -0.5F, 0F, -2.5F, 0F, -0.7F, 0F, 0F); // Box 199
		drgbaggageModel[129].setRotationPoint(55F, -24F, 8F);
		drgbaggageModel[129].rotateAngleY = -3.14159265F;

		drgbaggageModel[130].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F, 0F, -3F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -3F, 0F, -0.7F, 0F, -0.5F, 0F, -2.5F, -0.5F, 0F, -2.5F, 0F, -0.7F, 0F, 0F); // Box 200
		drgbaggageModel[130].setRotationPoint(55F, -24F, -6.5F);
		drgbaggageModel[130].rotateAngleY = -3.14159265F;

		drgbaggageModel[131].addBox(0F, 0F, 0F, 3, 0, 3, 0F); // Box 201
		drgbaggageModel[131].setRotationPoint(52F, -9.01F, -7F);

		drgbaggageModel[132].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 202
		drgbaggageModel[132].setRotationPoint(53.01F, -9F, -6F);

		drgbaggageModel[133].addBox(0F, 0F, 0F, 13, 3, 3, 0F); // Box 198
		drgbaggageModel[133].setRotationPoint(-22F, 3F, -4.5F);

		drgbaggageModel[134].addBox(0F, 0F, 0F, 13, 3, 3, 0F); // Box 199
		drgbaggageModel[134].setRotationPoint(8F, 3F, 2F);

		drgbaggageModel[135].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 214
		drgbaggageModel[135].setRotationPoint(-58F, 4F, -1F);

		drgbaggageModel[136].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 1F, -1F, 0F, 1F, -1F, 0F, 0F, 1F, 0F); // Box 215
		drgbaggageModel[136].setRotationPoint(-54F, 3F, -1F);

		drgbaggageModel[137].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 1F, -1F, 0F); // Box 216
		drgbaggageModel[137].setRotationPoint(53F, 3F, -1F);

		drgbaggageModel[138].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 217
		drgbaggageModel[138].setRotationPoint(54F, 4F, -1F);

		drgbaggageModel[139].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 218
		drgbaggageModel[139].setRotationPoint(-54F, -9F, 5F);

		drgbaggageModel[140].addBox(0F, 0F, 0F, 3, 0, 3, 0F); // Box 220
		drgbaggageModel[140].setRotationPoint(-55F, -9.01F, 4F);

		drgbaggageModel[141].addShapeBox(0F, 0F, 0F, 110, 1, 3, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, -0.05F, 0.05F, 0F, -0.05F, 0.05F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, -0.01F, -0.3F, 0F, -0.01F, -0.3F); // Box 221
		drgbaggageModel[141].setRotationPoint(55F, -20.01F, 10.78F);
		drgbaggageModel[141].rotateAngleX = 0.34906585F;
		drgbaggageModel[141].rotateAngleY = -3.14159265F;

		drgbaggageModel[142].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 221
		drgbaggageModel[142].setRotationPoint(40F, -25F, -9F);

		drgbaggageModel[143].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 222
		drgbaggageModel[143].setRotationPoint(40F, -25F, -10F);

		drgbaggageModel[144].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 223
		drgbaggageModel[144].setRotationPoint(39F, -25F, -10F);

		drgbaggageModel[145].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 224
		drgbaggageModel[145].setRotationPoint(39F, -25F, -9F);

		drgbaggageModel[146].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 225
		drgbaggageModel[146].setRotationPoint(41F, -25F, -9F);

		drgbaggageModel[147].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 226
		drgbaggageModel[147].setRotationPoint(40F, -25F, -8F);

		drgbaggageModel[148].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 227
		drgbaggageModel[148].setRotationPoint(41F, -25F, -10F);

		drgbaggageModel[149].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 228
		drgbaggageModel[149].setRotationPoint(41F, -25F, -8F);

		drgbaggageModel[150].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 229
		drgbaggageModel[150].setRotationPoint(39F, -25F, -8F);

		drgbaggageModel[151].addShapeBox(0F, 0F, 0F, 11, 3, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 235
		drgbaggageModel[151].setRotationPoint(-14F, -24F, -7F);

		drgbaggageModel[152].addShapeBox(0F, 0F, 0F, 11, 3, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 236
		drgbaggageModel[152].setRotationPoint(3F, -24F, -7F);

		drgbaggageModel[153].addShapeBox(0F, 0F, 0F, 11, 3, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 237
		drgbaggageModel[153].setRotationPoint(20F, -24F, -7F);

		drgbaggageModel[154].addShapeBox(0F, 0F, 0F, 13, 3, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 233
		drgbaggageModel[154].setRotationPoint(37F, -24F, -7F);

		drgbaggageModel[155].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 242
		drgbaggageModel[155].setRotationPoint(-20F, -24F, -6.5F);

		drgbaggageModel[156].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 243
		drgbaggageModel[156].setRotationPoint(-3F, -24F, -6.5F);

		drgbaggageModel[157].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 244
		drgbaggageModel[157].setRotationPoint(14F, -24F, -6.5F);

		drgbaggageModel[158].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 245
		drgbaggageModel[158].setRotationPoint(31F, -24F, -6.5F);

		drgbaggageModel[159].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 256
		drgbaggageModel[159].setRotationPoint(-20F, -22F, -6.5F);

		drgbaggageModel[160].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 257
		drgbaggageModel[160].setRotationPoint(-3F, -22F, -6.5F);

		drgbaggageModel[161].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 258
		drgbaggageModel[161].setRotationPoint(14F, -22F, -6.5F);

		drgbaggageModel[162].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 259
		drgbaggageModel[162].setRotationPoint(31F, -22F, -6.5F);

		drgbaggageModel[163].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 313
		drgbaggageModel[163].setRotationPoint(-20F, -23.5F, -6.5F);

		drgbaggageModel[164].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 314
		drgbaggageModel[164].setRotationPoint(-14.5F, -23.5F, -6.5F);

		drgbaggageModel[165].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 315
		drgbaggageModel[165].setRotationPoint(-3F, -23.5F, -6.5F);

		drgbaggageModel[166].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 316
		drgbaggageModel[166].setRotationPoint(2.5F, -23.5F, -6.5F);

		drgbaggageModel[167].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 317
		drgbaggageModel[167].setRotationPoint(19.5F, -23.5F, -6.5F);

		drgbaggageModel[168].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 318
		drgbaggageModel[168].setRotationPoint(14F, -23.5F, -6.5F);

		drgbaggageModel[169].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 319
		drgbaggageModel[169].setRotationPoint(31F, -23.5F, -6.5F);

		drgbaggageModel[170].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 320
		drgbaggageModel[170].setRotationPoint(36.5F, -23.5F, -6.5F);

		drgbaggageModel[171].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, -0.5F, -1F, -0.5F, -0.5F, -1F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 406
		drgbaggageModel[171].setRotationPoint(44F, -17.5F, -8F);

		drgbaggageModel[172].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, -0.5F, -1F, -0.5F, -0.5F, -1F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 407
		drgbaggageModel[172].setRotationPoint(44F, -9F, -8F);

		drgbaggageModel[173].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 408
		drgbaggageModel[173].setRotationPoint(44F, -16.5F, -5.5F);

		drgbaggageModel[174].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 409
		drgbaggageModel[174].setRotationPoint(44F, -16.5F, -7F);

		drgbaggageModel[175].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, -0.5F, -1F, -0.5F, -0.5F, -1F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 410
		drgbaggageModel[175].setRotationPoint(44F, -15.5F, -7.5F);

		drgbaggageModel[176].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, -0.5F, -1F, -0.5F, -0.5F, -1F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 411
		drgbaggageModel[176].setRotationPoint(44F, -15.5F, 4.5F);

		drgbaggageModel[177].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 412
		drgbaggageModel[177].setRotationPoint(44F, -16.5F, 5F);

		drgbaggageModel[178].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, -0.5F, -1F, -0.5F, -0.5F, -1F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 413
		drgbaggageModel[178].setRotationPoint(44F, -17.5F, 4F);

		drgbaggageModel[179].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 414
		drgbaggageModel[179].setRotationPoint(44F, -16.5F, 6.5F);

		drgbaggageModel[180].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, -0.5F, -1F, -0.5F, -0.5F, -1F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 415
		drgbaggageModel[180].setRotationPoint(44F, -9F, 4F);

		drgbaggageModel[181].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, -0.5F, -1F, -0.5F, -0.5F, -1F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 416
		drgbaggageModel[181].setRotationPoint(-44.5F, -15.5F, 4.5F);

		drgbaggageModel[182].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 417
		drgbaggageModel[182].setRotationPoint(-44.5F, -16.5F, 5F);

		drgbaggageModel[183].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, -0.5F, -1F, -0.5F, -0.5F, -1F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 418
		drgbaggageModel[183].setRotationPoint(-44.5F, -17.5F, 4F);

		drgbaggageModel[184].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 419
		drgbaggageModel[184].setRotationPoint(-44.5F, -16.5F, 6.5F);

		drgbaggageModel[185].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, -0.5F, -1F, -0.5F, -0.5F, -1F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 420
		drgbaggageModel[185].setRotationPoint(-44.5F, -9F, 4F);

		drgbaggageModel[186].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, -0.5F, -1F, -0.5F, -0.5F, -1F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 421
		drgbaggageModel[186].setRotationPoint(-44.5F, -15.5F, -7.5F);

		drgbaggageModel[187].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 422
		drgbaggageModel[187].setRotationPoint(-44.5F, -16.5F, -7F);

		drgbaggageModel[188].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F, 0F, -0.5F, -1F, -0.5F, -0.5F, -1F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 423
		drgbaggageModel[188].setRotationPoint(-44.75F, -17.5F, -4F);

		drgbaggageModel[189].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 424
		drgbaggageModel[189].setRotationPoint(-44.5F, -16.5F, -5.5F);

		drgbaggageModel[190].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, -0.5F, -1F, -0.5F, -0.5F, -1F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 425
		drgbaggageModel[190].setRotationPoint(-44.5F, -9F, -8F);

		drgbaggageModel[191].addBox(0F, 0F, 0F, 1, 7, 1, 0F); // Box 397
		drgbaggageModel[191].setRotationPoint(-54F, -5F, -0.5F);

		drgbaggageModel[192].addBox(0F, 0F, 0F, 1, 7, 1, 0F); // Box 398
		drgbaggageModel[192].setRotationPoint(53F, -5F, -0.5F);

		drgbaggageModel[193].addShapeBox(0F, 0F, 0F, 11, 3, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 362
		drgbaggageModel[193].setRotationPoint(-31F, -24F, -7F);

		drgbaggageModel[194].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 363
		drgbaggageModel[194].setRotationPoint(-37F, -22F, -6.5F);

		drgbaggageModel[195].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 364
		drgbaggageModel[195].setRotationPoint(-37F, -23.5F, -6.5F);

		drgbaggageModel[196].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 365
		drgbaggageModel[196].setRotationPoint(-37F, -24F, -6.5F);

		drgbaggageModel[197].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 366
		drgbaggageModel[197].setRotationPoint(-31.5F, -23.5F, -6.5F);

		drgbaggageModel[198].addShapeBox(0F, 0F, 0F, 1, 11, 6, 0F, 0F, -0.5F, -1F, -0.5F, -0.5F, -1F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 354
		drgbaggageModel[198].setRotationPoint(-44.75F, -9.5F, -3.5F);

		drgbaggageModel[199].addShapeBox(0F, 0F, 0F, 1, 18, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 355
		drgbaggageModel[199].setRotationPoint(-44.75F, -16.5F, 2.5F);

		drgbaggageModel[200].addShapeBox(0F, 0F, 0F, 1, 18, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 356
		drgbaggageModel[200].setRotationPoint(-44.75F, -16.5F, -3F);

		drgbaggageModel[201].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, -0.5F, -1F, -0.5F, -0.5F, -1F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 357
		drgbaggageModel[201].setRotationPoint(-44.5F, -17.5F, -8F);

		drgbaggageModel[202].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F, 0F, -0.5F, -1F, -0.5F, -0.5F, -1F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 358
		drgbaggageModel[202].setRotationPoint(-44.75F, 1F, -4F);

		drgbaggageModel[203].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F, 0F, -0.5F, -1F, -0.5F, -0.5F, -1F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 359
		drgbaggageModel[203].setRotationPoint(44.25F, 1F, -4F);

		drgbaggageModel[204].addShapeBox(0F, 0F, 0F, 1, 18, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 360
		drgbaggageModel[204].setRotationPoint(44.25F, -16.5F, -3F);

		drgbaggageModel[205].addShapeBox(0F, 0F, 0F, 1, 11, 6, 0F, 0F, -0.5F, -1F, -0.5F, -0.5F, -1F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 361
		drgbaggageModel[205].setRotationPoint(44.25F, -9.5F, -3.5F);

		drgbaggageModel[206].addShapeBox(0F, 0F, 0F, 1, 18, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 362
		drgbaggageModel[206].setRotationPoint(44.25F, -16.5F, 2.5F);

		drgbaggageModel[207].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F, 0F, -0.5F, -1F, -0.5F, -0.5F, -1F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 363
		drgbaggageModel[207].setRotationPoint(44.25F, -17.5F, -4F);

		drgbaggageModel[208].addShapeBox(0F, 0F, 0F, 1, 4, 12, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 463
		drgbaggageModel[208].setRotationPoint(-45F, -24F, -6F);

		drgbaggageModel[209].addShapeBox(0F, 0F, 0F, 1, 4, 12, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 464
		drgbaggageModel[209].setRotationPoint(44F, -24F, -6F);

		drgbaggageModel[210].addBox(0F, 0F, 0F, 1, 22, 5, 0F); // Box 465
		drgbaggageModel[210].setRotationPoint(38F, -20F, 4F);

		drgbaggageModel[211].addBox(0F, 0F, 0F, 1, 22, 5, 0F); // Box 467
		drgbaggageModel[211].setRotationPoint(42F, -20F, 4F);

		drgbaggageModel[212].addBox(0F, 0F, 0F, 3, 1, 5, 0F); // Box 470
		drgbaggageModel[212].setRotationPoint(39F, -20F, 4F);

		drgbaggageModel[213].addBox(0F, 0F, 0F, 3, 1, 5, 0F); // Box 473
		drgbaggageModel[213].setRotationPoint(39F, 1F, 4F);

		drgbaggageModel[214].addBox(0F, 0F, 0F, 3, 20, 0, 0F); // Box 474
		drgbaggageModel[214].setRotationPoint(39F, -19F, 4.1F);

		drgbaggageModel[215].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 392
		drgbaggageModel[215].setRotationPoint(-3F, -22F, 6F);

		drgbaggageModel[216].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 393
		drgbaggageModel[216].setRotationPoint(-3F, -23.5F, 6F);

		drgbaggageModel[217].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 394
		drgbaggageModel[217].setRotationPoint(-3F, -24F, 6F);

		drgbaggageModel[218].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 395
		drgbaggageModel[218].setRotationPoint(2.5F, -23.5F, 6F);

		drgbaggageModel[219].addShapeBox(0F, 0F, 0F, 11, 3, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 396
		drgbaggageModel[219].setRotationPoint(3F, -24F, 6F);

		drgbaggageModel[220].addShapeBox(0F, 0F, 0F, 11, 3, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 397
		drgbaggageModel[220].setRotationPoint(-14F, -24F, 6F);

		drgbaggageModel[221].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 398
		drgbaggageModel[221].setRotationPoint(-20F, -23.5F, 6F);

		drgbaggageModel[222].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 399
		drgbaggageModel[222].setRotationPoint(-20F, -22F, 6F);

		drgbaggageModel[223].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 400
		drgbaggageModel[223].setRotationPoint(-14.5F, -23.5F, 6F);

		drgbaggageModel[224].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 401
		drgbaggageModel[224].setRotationPoint(-20F, -24F, 6F);

		drgbaggageModel[225].addShapeBox(0F, 0F, 0F, 11, 3, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 402
		drgbaggageModel[225].setRotationPoint(-31F, -24F, 6F);

		drgbaggageModel[226].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 403
		drgbaggageModel[226].setRotationPoint(-37F, -24F, 6F);

		drgbaggageModel[227].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 404
		drgbaggageModel[227].setRotationPoint(-31.5F, -23.5F, 6F);

		drgbaggageModel[228].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 405
		drgbaggageModel[228].setRotationPoint(-37F, -22F, 6F);

		drgbaggageModel[229].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 406
		drgbaggageModel[229].setRotationPoint(-37F, -23.5F, 6F);

		drgbaggageModel[230].addShapeBox(0F, 0F, 0F, 13, 3, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 407
		drgbaggageModel[230].setRotationPoint(-50F, -24F, 6F);

		drgbaggageModel[231].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 408
		drgbaggageModel[231].setRotationPoint(14F, -23.5F, 6F);

		drgbaggageModel[232].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 409
		drgbaggageModel[232].setRotationPoint(14F, -24F, 6F);

		drgbaggageModel[233].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 410
		drgbaggageModel[233].setRotationPoint(14F, -22F, 6F);

		drgbaggageModel[234].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 411
		drgbaggageModel[234].setRotationPoint(19.5F, -23.5F, 6F);

		drgbaggageModel[235].addShapeBox(0F, 0F, 0F, 11, 3, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 412
		drgbaggageModel[235].setRotationPoint(20F, -24F, 6F);

		drgbaggageModel[236].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 413
		drgbaggageModel[236].setRotationPoint(36.5F, -23.5F, 6F);

		drgbaggageModel[237].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 414
		drgbaggageModel[237].setRotationPoint(31F, -24F, 6F);

		drgbaggageModel[238].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 415
		drgbaggageModel[238].setRotationPoint(31F, -23.5F, 6F);

		drgbaggageModel[239].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 416
		drgbaggageModel[239].setRotationPoint(31F, -22F, 6F);

		drgbaggageModel[240].addShapeBox(0F, 0F, 0F, 13, 3, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 417
		drgbaggageModel[240].setRotationPoint(37F, -24F, 6F);

		drgbaggageModel[241].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 417
		drgbaggageModel[241].setRotationPoint(44F, -8F, 1F);

		drgbaggageModel[242].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 418
		drgbaggageModel[242].setRotationPoint(-45F, -8F, 1F);

		drgbaggageModel[243].addShapeBox(0F, 0F, 0F, 13, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 388
		drgbaggageModel[243].setRotationPoint(-6.5F, 1F, 9.25F);

		drgbaggageModel[244].addShapeBox(0F, 0F, 0F, 13, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 389
		drgbaggageModel[244].setRotationPoint(-6.5F, -17.5F, 9.25F);

		drgbaggageModel[245].addShapeBox(0F, 0F, 0F, 1, 18, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 390
		drgbaggageModel[245].setRotationPoint(6F, -16.5F, 9.25F);

		drgbaggageModel[246].addShapeBox(0F, 0F, 0F, 1, 18, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 391
		drgbaggageModel[246].setRotationPoint(-6.5F, -16.5F, 9.25F);

		drgbaggageModel[247].addShapeBox(0F, 0F, 0F, 12, 13, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 392
		drgbaggageModel[247].setRotationPoint(-6F, -11.5F, 9.25F);

		drgbaggageModel[248].addShapeBox(0F, 0F, 0F, 12, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 394
		drgbaggageModel[248].setRotationPoint(-6F, -12F, 9.25F);

		drgbaggageModel[249].addBox(0F, 0F, 0F, 1, 10, 5, 0F); // Box 397
		drgbaggageModel[249].setRotationPoint(33F, -8F, 4F);

		drgbaggageModel[250].addBox(0F, 0F, 0F, 4, 1, 5, 0F); // Box 398
		drgbaggageModel[250].setRotationPoint(34F, -8F, 4F);

		drgbaggageModel[251].addBox(0F, 0F, 0F, 32, 1, 5, 0F); // Box 399
		drgbaggageModel[251].setRotationPoint(12F, -8F, -9F);

		drgbaggageModel[252].addBox(0F, 0F, 0F, 1, 10, 5, 0F); // Box 400
		drgbaggageModel[252].setRotationPoint(11F, -8F, -9F);

		drgbaggageModel[253].addShapeBox(0F, 0F, 0F, 1, 8, 2, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 401
		drgbaggageModel[253].setRotationPoint(43F, -15.5F, -9F);

		drgbaggageModel[254].addShapeBox(0F, 0F, 0F, 1, 8, 2, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 402
		drgbaggageModel[254].setRotationPoint(40F, -15.5F, -9F);

		drgbaggageModel[255].addShapeBox(0F, 0F, 0F, 1, 8, 2, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 403
		drgbaggageModel[255].setRotationPoint(37F, -15.5F, -9F);

		drgbaggageModel[256].addShapeBox(0F, 0F, 0F, 28, 1, 3, 0F, 0F, -0.5F, -1F, -0.5F, -0.5F, -1F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 405
		drgbaggageModel[256].setRotationPoint(16F, -16.5F, -10F);

		drgbaggageModel[257].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F, 0F, -0.5F, -1F, -0.5F, -0.5F, -1F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 406
		drgbaggageModel[257].setRotationPoint(34.5F, -14F, -10F);

		drgbaggageModel[258].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F, 0F, -0.5F, -1F, -0.5F, -0.5F, -1F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 407
		drgbaggageModel[258].setRotationPoint(34.5F, -11.5F, -10F);

		drgbaggageModel[259].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F, 0F, -0.5F, -1F, -0.5F, -0.5F, -1F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 408
		drgbaggageModel[259].setRotationPoint(37.5F, -14F, -10F);

		drgbaggageModel[260].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F, 0F, -0.5F, -1F, -0.5F, -0.5F, -1F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 409
		drgbaggageModel[260].setRotationPoint(37.5F, -11.5F, -10F);

		drgbaggageModel[261].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F, 0F, -0.5F, -1F, -0.5F, -0.5F, -1F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 410
		drgbaggageModel[261].setRotationPoint(40.5F, -11.5F, -10F);

		drgbaggageModel[262].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F, 0F, -0.5F, -1F, -0.5F, -0.5F, -1F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 411
		drgbaggageModel[262].setRotationPoint(40.5F, -14F, -10F);

		drgbaggageModel[263].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 416
		drgbaggageModel[263].setRotationPoint(42F, -9F, -9F);

		drgbaggageModel[264].addBox(0F, 0F, 0F, 0, 2, 2, 0F); // Box 418
		drgbaggageModel[264].setRotationPoint(37F, -12.75F, -9F);
		drgbaggageModel[264].rotateAngleZ = -0.54105207F;

		drgbaggageModel[265].addBox(0F, 0F, 0F, 0, 2, 2, 0F); // Box 419
		drgbaggageModel[265].setRotationPoint(42F, -12.75F, -7F);
		drgbaggageModel[265].rotateAngleY = -3.14159265F;
		drgbaggageModel[265].rotateAngleZ = -0.54105207F;

		drgbaggageModel[266].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 420
		drgbaggageModel[266].setRotationPoint(41F, -9F, -9F);

		drgbaggageModel[267].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 421
		drgbaggageModel[267].setRotationPoint(34.6F, -12F, -9F);

		drgbaggageModel[268].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 422
		drgbaggageModel[268].setRotationPoint(38F, -9F, -9F);
		drgbaggageModel[268].rotateAngleY = 0.36651914F;

		drgbaggageModel[269].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 423
		drgbaggageModel[269].setRotationPoint(38F, -10F, -9F);

		drgbaggageModel[270].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 424
		drgbaggageModel[270].setRotationPoint(41F, -13F, -9F);

		drgbaggageModel[271].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 425
		drgbaggageModel[271].setRotationPoint(38.5F, -14.5F, -9F);

		drgbaggageModel[272].addBox(0F, 0F, 0F, 0, 2, 2, 0F); // Box 426
		drgbaggageModel[272].setRotationPoint(41F, -15.25F, -7F);
		drgbaggageModel[272].rotateAngleY = -2.72271363F;
		drgbaggageModel[272].rotateAngleZ = -0.54105207F;

		drgbaggageModel[273].addBox(0F, 0F, 0F, 0, 2, 2, 0F); // Box 427
		drgbaggageModel[273].setRotationPoint(41F, -15.5F, -7F);
		drgbaggageModel[273].rotateAngleY = -3.14159265F;

		drgbaggageModel[274].addBox(0F, 0F, 0F, 4, 1, 5, 0F); // Box 428
		drgbaggageModel[274].setRotationPoint(34F, -4F, 4F);

		drgbaggageModel[275].addShapeBox(0F, 0F, 0F, 12, 13, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 431
		drgbaggageModel[275].setRotationPoint(-6F, -11.5F, -9.75F);

		drgbaggageModel[276].addShapeBox(0F, 0F, 0F, 1, 18, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 432
		drgbaggageModel[276].setRotationPoint(6F, -16.5F, -9.75F);

		drgbaggageModel[277].addShapeBox(0F, 0F, 0F, 12, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 433
		drgbaggageModel[277].setRotationPoint(-6F, -12F, -9.75F);

		drgbaggageModel[278].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 434
		drgbaggageModel[278].setRotationPoint(3F, -16.5F, -9.75F);

		drgbaggageModel[279].addShapeBox(0F, 0F, 0F, 13, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 435
		drgbaggageModel[279].setRotationPoint(-6.5F, -17.5F, -9.75F);

		drgbaggageModel[280].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 436
		drgbaggageModel[280].setRotationPoint(-3.5F, -16.5F, -9.75F);

		drgbaggageModel[281].addShapeBox(0F, 0F, 0F, 1, 18, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 437
		drgbaggageModel[281].setRotationPoint(-6.5F, -16.5F, -9.75F);

		drgbaggageModel[282].addShapeBox(0F, 0F, 0F, 13, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 438
		drgbaggageModel[282].setRotationPoint(-6.5F, 1F, -9.75F);

		drgbaggageModel[283].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F); // Box 427
		drgbaggageModel[283].setRotationPoint(-46F, -7.5F, 8F);

		drgbaggageModel[284].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F); // Box 428
		drgbaggageModel[284].setRotationPoint(-46F, -7.5F, -8.5F);

		drgbaggageModel[285].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F); // Box 429
		drgbaggageModel[285].setRotationPoint(45.5F, -7.5F, -8.5F);

		drgbaggageModel[286].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F); // Box 430
		drgbaggageModel[286].setRotationPoint(45.5F, -7.5F, 8F);

		drgbaggageModel[287].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 431
		drgbaggageModel[287].setRotationPoint(-7.5F, -7.5F, 10.5F);

		drgbaggageModel[288].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 432
		drgbaggageModel[288].setRotationPoint(7F, -7.5F, 10.5F);

		drgbaggageModel[289].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 433
		drgbaggageModel[289].setRotationPoint(-7.5F, -7.5F, -11F);

		drgbaggageModel[290].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 434
		drgbaggageModel[290].setRotationPoint(7F, -7.5F, -11F);

		drgbaggageModel[291].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 435
		drgbaggageModel[291].setRotationPoint(-39F, -7.5F, -11F);

		drgbaggageModel[292].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 436
		drgbaggageModel[292].setRotationPoint(-39F, -7.5F, 10.5F);

		drgbaggageModel[293].addBox(0F, 0F, 0F, 0, 2, 2, 0F); // Box 437
		drgbaggageModel[293].setRotationPoint(34F, -5.75F, 6F);
		drgbaggageModel[293].rotateAngleY = -3.14159265F;
		drgbaggageModel[293].rotateAngleZ = -0.54105207F;

		drgbaggageModel[294].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 438
		drgbaggageModel[294].setRotationPoint(35.5F, -6F, 4F);
		drgbaggageModel[294].rotateAngleY = 0.27925268F;

		drgbaggageModel[295].addBox(0F, 0F, 0F, 2, 0, 3, 0F); // Box 440
		drgbaggageModel[295].setRotationPoint(35F, -8.02F, 5F);
		drgbaggageModel[295].rotateAngleY = 0.36651914F;

		drgbaggageModel[296].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 452
		drgbaggageModel[296].setRotationPoint(9.5F, -14.5F, 6.5F);

		drgbaggageModel[297].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 453
		drgbaggageModel[297].setRotationPoint(28F, -14.5F, 6.5F);

		drgbaggageModel[298].addShapeBox(0F, 0F, 0F, 20, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 455
		drgbaggageModel[298].setRotationPoint(9.5F, -15F, 6.5F);

		drgbaggageModel[299].addShapeBox(0F, 0F, 0F, 20, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 457
		drgbaggageModel[299].setRotationPoint(9.5F, -15F, 7.5F);

		drgbaggageModel[300].addShapeBox(0F, 0F, 0F, 20, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 458
		drgbaggageModel[300].setRotationPoint(9.5F, -15F, 8.5F);

		drgbaggageModel[301].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -1F, -0.5F, 0F, -1F); // Box 427
		drgbaggageModel[301].setRotationPoint(-35.5F, -23.5F, -1F);

		drgbaggageModel[302].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 432
		drgbaggageModel[302].setRotationPoint(-34.25F, -24F, 0F);

		drgbaggageModel[303].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -1F, -0.5F, 0F, -1F); // Box 453
		drgbaggageModel[303].setRotationPoint(-18.5F, -23.5F, -1F);

		drgbaggageModel[304].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 454
		drgbaggageModel[304].setRotationPoint(-17.25F, -24F, 0F);

		drgbaggageModel[305].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -1F, -0.5F, 0F, -1F); // Box 455
		drgbaggageModel[305].setRotationPoint(-1.5F, -23.5F, -1F);

		drgbaggageModel[306].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 456
		drgbaggageModel[306].setRotationPoint(-0.25F, -24F, 0F);

		drgbaggageModel[307].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -1F, -0.5F, 0F, -1F); // Box 457
		drgbaggageModel[307].setRotationPoint(15.5F, -23.5F, -1F);

		drgbaggageModel[308].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 458
		drgbaggageModel[308].setRotationPoint(16.75F, -24F, 0F);

		drgbaggageModel[309].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -1F, -0.5F, 0F, -1F); // Box 459
		drgbaggageModel[309].setRotationPoint(32.5F, -23.5F, -1F);

		drgbaggageModel[310].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 460
		drgbaggageModel[310].setRotationPoint(33.75F, -24F, 0F);

		drgbaggageModel[311].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 463
		drgbaggageModel[311].setRotationPoint(38.5F, -7.5F, -11F);

		drgbaggageModel[312].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 464
		drgbaggageModel[312].setRotationPoint(38.5F, -7.5F, 10.5F);

		drgbaggageModel[313].addShapeBox(0F, 0F, 0F, 13, 3, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 465
		drgbaggageModel[313].setRotationPoint(-6.5F, -20F, -10F);

		drgbaggageModel[314].addShapeBox(0F, 0F, 0F, 13, 3, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 466
		drgbaggageModel[314].setRotationPoint(-6.5F, -20F, 9F);

		drgbaggageModel[315].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 467
		drgbaggageModel[315].setRotationPoint(-0.25F, -16.5F, -9.75F);

		drgbaggageModel[316].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 468
		drgbaggageModel[316].setRotationPoint(-3.5F, -16.5F, 9.25F);

		drgbaggageModel[317].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 469
		drgbaggageModel[317].setRotationPoint(-0.25F, -16.5F, 9.25F);

		drgbaggageModel[318].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 470
		drgbaggageModel[318].setRotationPoint(3F, -16.5F, 9.25F);

		drgbaggageModel[319].addBox(0F, 0F, 0F, 1, 9, 5, 0F); // Box 331
		drgbaggageModel[319].setRotationPoint(28F, -7F, -9F);

		drgbaggageModel[320].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 332
		drgbaggageModel[320].setRotationPoint(22F, -14.5F, 6.5F);

		drgbaggageModel[321].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 333
		drgbaggageModel[321].setRotationPoint(15.5F, -14.5F, 6.5F);

		drgbaggageModel[322].addBox(0F, 0F, 0F, 3, 20, 0, 0F); // Box 334
		drgbaggageModel[322].setRotationPoint(-26F, -19F, 4.1F);

		drgbaggageModel[323].addBox(0F, 0F, 0F, 3, 1, 5, 0F); // Box 335
		drgbaggageModel[323].setRotationPoint(-26F, -20F, 4F);

		drgbaggageModel[324].addBox(0F, 0F, 0F, 1, 22, 5, 0F); // Box 336
		drgbaggageModel[324].setRotationPoint(-27F, -20F, 4F);

		drgbaggageModel[325].addBox(0F, 0F, 0F, 1, 22, 5, 0F); // Box 337
		drgbaggageModel[325].setRotationPoint(-23F, -20F, 4F);

		drgbaggageModel[326].addBox(0F, 0F, 0F, 3, 1, 5, 0F); // Box 338
		drgbaggageModel[326].setRotationPoint(-26F, 1F, 4F);

		drgbaggageModel[327].addBox(0F, 0F, 0F, 32, 1, 5, 0F); // Box 339
		drgbaggageModel[327].setRotationPoint(-44F, -8F, -9F);

		drgbaggageModel[328].addBox(0F, 0F, 0F, 1, 10, 5, 0F); // Box 340
		drgbaggageModel[328].setRotationPoint(-12F, -8F, -9F);

		drgbaggageModel[329].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 341
		drgbaggageModel[329].setRotationPoint(-35F, -9F, -9F);

		drgbaggageModel[330].addShapeBox(0F, 0F, 0F, 1, 8, 2, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 342
		drgbaggageModel[330].setRotationPoint(-34F, -15.5F, -9F);

		drgbaggageModel[331].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F, 0F, -0.5F, -1F, -0.5F, -0.5F, -1F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 343
		drgbaggageModel[331].setRotationPoint(-36.5F, -11.5F, -10F);

		drgbaggageModel[332].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F, 0F, -0.5F, -1F, -0.5F, -0.5F, -1F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 344
		drgbaggageModel[332].setRotationPoint(-39.5F, -11.5F, -10F);

		drgbaggageModel[333].addShapeBox(0F, 0F, 0F, 1, 8, 2, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 345
		drgbaggageModel[333].setRotationPoint(-37F, -15.5F, -9F);

		drgbaggageModel[334].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F, 0F, -0.5F, -1F, -0.5F, -0.5F, -1F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 346
		drgbaggageModel[334].setRotationPoint(-36.5F, -14F, -10F);

		drgbaggageModel[335].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F, 0F, -0.5F, -1F, -0.5F, -0.5F, -1F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 347
		drgbaggageModel[335].setRotationPoint(-39.5F, -14F, -10F);

		drgbaggageModel[336].addShapeBox(0F, 0F, 0F, 1, 8, 2, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 348
		drgbaggageModel[336].setRotationPoint(-40F, -15.5F, -9F);

		drgbaggageModel[337].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F, 0F, -0.5F, -1F, -0.5F, -0.5F, -1F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 349
		drgbaggageModel[337].setRotationPoint(-42.5F, -14F, -10F);

		drgbaggageModel[338].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F, 0F, -0.5F, -1F, -0.5F, -0.5F, -1F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 350
		drgbaggageModel[338].setRotationPoint(-42.5F, -11.5F, -10F);

		drgbaggageModel[339].addShapeBox(0F, 0F, 0F, 1, 8, 2, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 351
		drgbaggageModel[339].setRotationPoint(-43F, -15.5F, -9F);

		drgbaggageModel[340].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 352
		drgbaggageModel[340].setRotationPoint(-42.4F, -12F, -9F);

		drgbaggageModel[341].addBox(0F, 0F, 0F, 0, 2, 2, 0F); // Box 353
		drgbaggageModel[341].setRotationPoint(-40F, -12.75F, -9F);
		drgbaggageModel[341].rotateAngleZ = -0.54105207F;

		drgbaggageModel[342].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 354
		drgbaggageModel[342].setRotationPoint(-39F, -10F, -9F);

		drgbaggageModel[343].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 355
		drgbaggageModel[343].setRotationPoint(-39F, -9F, -9F);
		drgbaggageModel[343].rotateAngleY = 0.36651914F;

		drgbaggageModel[344].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 356
		drgbaggageModel[344].setRotationPoint(-36F, -9F, -9F);

		drgbaggageModel[345].addBox(0F, 0F, 0F, 0, 2, 2, 0F); // Box 357
		drgbaggageModel[345].setRotationPoint(-35F, -12.75F, -7F);
		drgbaggageModel[345].rotateAngleY = -3.14159265F;
		drgbaggageModel[345].rotateAngleZ = -0.54105207F;

		drgbaggageModel[346].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 358
		drgbaggageModel[346].setRotationPoint(-36F, -13F, -9F);

		drgbaggageModel[347].addBox(0F, 0F, 0F, 0, 2, 2, 0F); // Box 359
		drgbaggageModel[347].setRotationPoint(-36F, -15.5F, -7F);
		drgbaggageModel[347].rotateAngleY = -3.14159265F;

		drgbaggageModel[348].addBox(0F, 0F, 0F, 0, 2, 2, 0F); // Box 360
		drgbaggageModel[348].setRotationPoint(-36F, -15.25F, -7F);
		drgbaggageModel[348].rotateAngleY = -2.72271363F;
		drgbaggageModel[348].rotateAngleZ = -0.54105207F;

		drgbaggageModel[349].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 361
		drgbaggageModel[349].setRotationPoint(-38.5F, -14.5F, -9F);

		drgbaggageModel[350].addShapeBox(0F, 0F, 0F, 10, 1, 3, 0F, 0F, -0.5F, -1F, -0.5F, -0.5F, -1F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 362
		drgbaggageModel[350].setRotationPoint(-43F, -16.5F, -10F);

		drgbaggageModel[351].addBox(0F, 0F, 0F, 4, 1, 5, 0F); // Box 363
		drgbaggageModel[351].setRotationPoint(-31F, -4F, 4F);

		drgbaggageModel[352].addBox(0F, 0F, 0F, 4, 1, 5, 0F); // Box 364
		drgbaggageModel[352].setRotationPoint(-31F, -8F, 4F);

		drgbaggageModel[353].addBox(0F, 0F, 0F, 2, 0, 3, 0F); // Box 365
		drgbaggageModel[353].setRotationPoint(-30F, -8.02F, 5F);
		drgbaggageModel[353].rotateAngleY = 0.36651914F;

		drgbaggageModel[354].addBox(0F, 0F, 0F, 1, 10, 5, 0F); // Box 366
		drgbaggageModel[354].setRotationPoint(-32F, -8F, 4F);

		drgbaggageModel[355].addShapeBox(0F, 0F, 0F, 1, 8, 2, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 367
		drgbaggageModel[355].setRotationPoint(34F, -15.5F, -9F);

		drgbaggageModel[356].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F, 0F, -0.5F, -1F, -0.5F, -0.5F, -1F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 368
		drgbaggageModel[356].setRotationPoint(31.5F, -14F, -10F);

		drgbaggageModel[357].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F, 0F, -0.5F, -1F, -0.5F, -0.5F, -1F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 369
		drgbaggageModel[357].setRotationPoint(31.5F, -11.5F, -10F);

		drgbaggageModel[358].addShapeBox(0F, 0F, 0F, 1, 8, 2, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 370
		drgbaggageModel[358].setRotationPoint(31F, -15.5F, -9F);

		drgbaggageModel[359].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F, 0F, -0.5F, -1F, -0.5F, -0.5F, -1F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 371
		drgbaggageModel[359].setRotationPoint(28.5F, -11.5F, -10F);

		drgbaggageModel[360].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F, 0F, -0.5F, -1F, -0.5F, -0.5F, -1F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 372
		drgbaggageModel[360].setRotationPoint(28.5F, -14F, -10F);

		drgbaggageModel[361].addShapeBox(0F, 0F, 0F, 1, 8, 2, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 373
		drgbaggageModel[361].setRotationPoint(28F, -15.5F, -9F);

		drgbaggageModel[362].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F, 0F, -0.5F, -1F, -0.5F, -0.5F, -1F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 374
		drgbaggageModel[362].setRotationPoint(25.5F, -14F, -10F);

		drgbaggageModel[363].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F, 0F, -0.5F, -1F, -0.5F, -0.5F, -1F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 375
		drgbaggageModel[363].setRotationPoint(25.5F, -11.5F, -10F);

		drgbaggageModel[364].addShapeBox(0F, 0F, 0F, 1, 8, 2, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 376
		drgbaggageModel[364].setRotationPoint(25F, -15.5F, -9F);

		drgbaggageModel[365].addBox(0F, 0F, 0F, 0, 2, 2, 0F); // Box 377
		drgbaggageModel[365].setRotationPoint(32F, -15.25F, -7F);
		drgbaggageModel[365].rotateAngleY = -2.72271363F;
		drgbaggageModel[365].rotateAngleZ = -0.54105207F;

		drgbaggageModel[366].addBox(0F, 0F, 0F, 0, 2, 2, 0F); // Box 378
		drgbaggageModel[366].setRotationPoint(32F, -15.5F, -7F);
		drgbaggageModel[366].rotateAngleY = -3.14159265F;

		drgbaggageModel[367].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 379
		drgbaggageModel[367].setRotationPoint(29.5F, -14.5F, -9F);

		drgbaggageModel[368].addBox(0F, 0F, 0F, 0, 2, 2, 0F); // Box 380
		drgbaggageModel[368].setRotationPoint(33F, -12.75F, -7F);
		drgbaggageModel[368].rotateAngleY = -3.14159265F;
		drgbaggageModel[368].rotateAngleZ = -0.54105207F;

		drgbaggageModel[369].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 381
		drgbaggageModel[369].setRotationPoint(32F, -13F, -9F);

		drgbaggageModel[370].addBox(0F, 0F, 0F, 0, 2, 2, 0F); // Box 382
		drgbaggageModel[370].setRotationPoint(28F, -12.75F, -9F);
		drgbaggageModel[370].rotateAngleZ = -0.54105207F;

		drgbaggageModel[371].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 383
		drgbaggageModel[371].setRotationPoint(25.6F, -12F, -9F);

		drgbaggageModel[372].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 385
		drgbaggageModel[372].setRotationPoint(29F, -9F, -9F);
		drgbaggageModel[372].rotateAngleY = 0.36651914F;

		drgbaggageModel[373].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F, 0F, -0.5F, -1F, -0.5F, -0.5F, -1F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 388
		drgbaggageModel[373].setRotationPoint(22.5F, -14F, -10F);

		drgbaggageModel[374].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F, 0F, -0.5F, -1F, -0.5F, -0.5F, -1F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 389
		drgbaggageModel[374].setRotationPoint(22.5F, -11.5F, -10F);

		drgbaggageModel[375].addShapeBox(0F, 0F, 0F, 1, 8, 2, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 390
		drgbaggageModel[375].setRotationPoint(22F, -15.5F, -9F);

		drgbaggageModel[376].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F, 0F, -0.5F, -1F, -0.5F, -0.5F, -1F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 391
		drgbaggageModel[376].setRotationPoint(19.5F, -11.5F, -10F);

		drgbaggageModel[377].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F, 0F, -0.5F, -1F, -0.5F, -0.5F, -1F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 392
		drgbaggageModel[377].setRotationPoint(19.5F, -14F, -10F);

		drgbaggageModel[378].addShapeBox(0F, 0F, 0F, 1, 8, 2, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 393
		drgbaggageModel[378].setRotationPoint(19F, -15.5F, -9F);

		drgbaggageModel[379].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F, 0F, -0.5F, -1F, -0.5F, -0.5F, -1F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 394
		drgbaggageModel[379].setRotationPoint(16.5F, -14F, -10F);

		drgbaggageModel[380].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F, 0F, -0.5F, -1F, -0.5F, -0.5F, -1F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 395
		drgbaggageModel[380].setRotationPoint(16.5F, -11.5F, -10F);

		drgbaggageModel[381].addShapeBox(0F, 0F, 0F, 1, 8, 2, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 396
		drgbaggageModel[381].setRotationPoint(16F, -15.5F, -9F);

		drgbaggageModel[382].addBox(0F, 0F, 0F, 0, 2, 2, 0F); // Box 397
		drgbaggageModel[382].setRotationPoint(23F, -15.25F, -7F);
		drgbaggageModel[382].rotateAngleY = -2.72271363F;
		drgbaggageModel[382].rotateAngleZ = -0.54105207F;

		drgbaggageModel[383].addBox(0F, 0F, 0F, 0, 2, 2, 0F); // Box 398
		drgbaggageModel[383].setRotationPoint(23F, -15.5F, -7F);
		drgbaggageModel[383].rotateAngleY = -3.14159265F;

		drgbaggageModel[384].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 399
		drgbaggageModel[384].setRotationPoint(20.5F, -14.5F, -9F);

		drgbaggageModel[385].addBox(0F, 0F, 0F, 0, 2, 2, 0F); // Box 400
		drgbaggageModel[385].setRotationPoint(24F, -12.75F, -7F);
		drgbaggageModel[385].rotateAngleY = -3.14159265F;
		drgbaggageModel[385].rotateAngleZ = -0.54105207F;

		drgbaggageModel[386].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 401
		drgbaggageModel[386].setRotationPoint(23F, -13F, -9F);

		drgbaggageModel[387].addBox(0F, 0F, 0F, 0, 2, 2, 0F); // Box 402
		drgbaggageModel[387].setRotationPoint(19F, -12.75F, -9F);
		drgbaggageModel[387].rotateAngleZ = -0.54105207F;

		drgbaggageModel[388].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 403
		drgbaggageModel[388].setRotationPoint(16.6F, -12F, -9F);

		drgbaggageModel[389].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 404
		drgbaggageModel[389].setRotationPoint(20F, -10F, -9F);

		drgbaggageModel[390].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 405
		drgbaggageModel[390].setRotationPoint(20F, -9F, -9F);
		drgbaggageModel[390].rotateAngleY = 0.36651914F;

		drgbaggageModel[391].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 406
		drgbaggageModel[391].setRotationPoint(23F, -9F, -9F);

		drgbaggageModel[392].addBox(0F, 0F, 0F, 1, 9, 5, 0F); // Box 408
		drgbaggageModel[392].setRotationPoint(-29F, -7F, -9F);

		drgbaggageModel[393].addShapeBox(0F, 0F, 0F, 13, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 409
		drgbaggageModel[393].setRotationPoint(-22.5F, -15F, 7.5F);

		drgbaggageModel[394].addShapeBox(0F, 0F, 0F, 13, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 410
		drgbaggageModel[394].setRotationPoint(-22.5F, -15F, 8.5F);

		drgbaggageModel[395].addShapeBox(0F, 0F, 0F, 13, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 411
		drgbaggageModel[395].setRotationPoint(-22.5F, -15F, 6.5F);

		drgbaggageModel[396].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 413
		drgbaggageModel[396].setRotationPoint(-19.5F, -14.5F, 6.5F);

		drgbaggageModel[397].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 414
		drgbaggageModel[397].setRotationPoint(-13F, -14.5F, 6.5F);

		drgbaggageModel[398].addBox(0F, 0F, 0F, 5, 5, 5, 0F); // Box 415
		drgbaggageModel[398].setRotationPoint(-42F, -3F, 3F);
		drgbaggageModel[398].rotateAngleY = 0.41887902F;

		drgbaggageModel[399].addBox(0F, 0F, 0F, 5, 5, 5, 0F); // Box 416
		drgbaggageModel[399].setRotationPoint(-42F, -8F, 4F);
		drgbaggageModel[399].rotateAngleY = 0.10471976F;

		drgbaggageModel[400].addBox(0F, 0F, 0F, 5, 5, 5, 0F); // Box 417
		drgbaggageModel[400].setRotationPoint(-18F, -3F, 4F);
		drgbaggageModel[400].rotateAngleY = 0.10471976F;

		drgbaggageModel[401].addBox(0F, 0F, 0F, 5, 5, 5, 0F); // Box 418
		drgbaggageModel[401].setRotationPoint(-13F, -3F, 5F);
		drgbaggageModel[401].rotateAngleY = -0.33161256F;

		drgbaggageModel[402].addBox(0F, 0F, 0F, 5, 5, 4, 0F); // Box 419
		drgbaggageModel[402].setRotationPoint(-16F, -8F, 5F);

		drgbaggageModel[403].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 420
		drgbaggageModel[403].setRotationPoint(21.5F, -16.5F, 7F);

		drgbaggageModel[404].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 421
		drgbaggageModel[404].setRotationPoint(14.5F, -16.5F, 7F);
		drgbaggageModel[404].rotateAngleY = 0.50614548F;

		drgbaggageModel[405].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 422
		drgbaggageModel[405].setRotationPoint(-16.5F, -16.5F, 7F);
		drgbaggageModel[405].rotateAngleY = -0.52359878F;

		drgbaggageModel[406].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 423
		drgbaggageModel[406].setRotationPoint(-17.5F, -10F, -7F);
		drgbaggageModel[406].rotateAngleY = -0.52359878F;

		drgbaggageModel[407].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 424
		drgbaggageModel[407].setRotationPoint(-20.5F, -10F, -7F);
		drgbaggageModel[407].rotateAngleY = 0.12217305F;

		drgbaggageModel[408].addBox(0F, 0F, 0F, 5, 5, 5, 0F); // Box 425
		drgbaggageModel[408].setRotationPoint(18F, -3F, 4F);
		drgbaggageModel[408].rotateAngleY = 0.10471976F;

		drgbaggageModel[409].addBox(0F, 0F, 0F, 5, 5, 4, 0F); // Box 426
		drgbaggageModel[409].setRotationPoint(20F, -8F, 5F);

		drgbaggageModel[410].addBox(0F, 0F, 0F, 5, 5, 5, 0F); // Box 427
		drgbaggageModel[410].setRotationPoint(23F, -3F, 5F);
		drgbaggageModel[410].rotateAngleY = -0.33161256F;

		drgbaggageModel[411].addBox(0F, 0F, 0F, 5, 5, 5, 0F); // Box 428
		drgbaggageModel[411].setRotationPoint(10F, -3F, 4F);
		drgbaggageModel[411].rotateAngleY = 0.10471976F;

		drgbaggageModel[412].addBox(0F, 0F, 0F, 5, 5, 4, 0F); // Box 429
		drgbaggageModel[412].setRotationPoint(14F, -8F, 5F);
		drgbaggageModel[412].rotateAngleY = 0.19198622F;

		drgbaggageModel[413].addBox(0F, 0F, 0F, 4, 4, 4, 0F); // Box 431
		drgbaggageModel[413].setRotationPoint(16F, -12F, 5F);
		drgbaggageModel[413].rotateAngleY = -0.33161256F;

		drgbaggageModel[414].addBox(0F, 0F, 0F, 2, 0, 3, 0F); // Box 432
		drgbaggageModel[414].setRotationPoint(23F, -8.02F, -8F);
		drgbaggageModel[414].rotateAngleY = 0.36651914F;

		drgbaggageModel[415].addBox(0F, 0F, 0F, 2, 0, 3, 0F); // Box 433
		drgbaggageModel[415].setRotationPoint(16F, -8.02F, -6F);
		drgbaggageModel[415].rotateAngleY = 2.68780705F;

		drgbaggageModel[416].addBox(0F, 0F, 0F, 2, 0, 3, 0F); // Box 434
		drgbaggageModel[416].setRotationPoint(37F, -8.02F, -5F);
		drgbaggageModel[416].rotateAngleY = 2.86233997F;

		drgbaggageModel[417].addBox(0F, 0F, 0F, 2, 0, 3, 0F); // Box 435
		drgbaggageModel[417].setRotationPoint(-23F, -8.02F, -5F);
		drgbaggageModel[417].rotateAngleY = 2.86233997F;

		drgbaggageModel[418].addBox(0F, 0F, 0F, 2, 0, 3, 0F); // Box 436
		drgbaggageModel[418].setRotationPoint(-27F, -8.02F, -5F);
		drgbaggageModel[418].rotateAngleY = 3.24631241F;

		drgbaggageModel[419].addBox(0F, 0F, 0F, 2, 0, 3, 0F); // Box 437
		drgbaggageModel[419].setRotationPoint(-30F, -8.02F, -5F);
		drgbaggageModel[419].rotateAngleY = 2.96705973F;

		drgbaggageModel[420].addBox(0F, 0F, 0F, 0, 2, 2, 0F); // Box 438
		drgbaggageModel[420].setRotationPoint(-31F, -5.75F, 6F);
		drgbaggageModel[420].rotateAngleY = -3.14159265F;
		drgbaggageModel[420].rotateAngleZ = -0.54105207F;

		drgbaggageModel[421].addBox(0F, 0F, 0F, 5, 5, 5, 0F); // Box 439
		drgbaggageModel[421].setRotationPoint(20F, -3F, -7F);
		drgbaggageModel[421].rotateAngleY = -0.33161256F;

		drgbaggageModel[422].addBox(0F, 0F, 0F, 5, 5, 5, 0F); // Box 440
		drgbaggageModel[422].setRotationPoint(34F, -3F, -9F);
		drgbaggageModel[422].rotateAngleY = 0.05235988F;

		drgbaggageModel[423].addBox(0F, 0F, 0F, 5, 5, 5, 0F); // Box 441
		drgbaggageModel[423].setRotationPoint(14F, -3F, -9F);
		drgbaggageModel[423].rotateAngleY = 0.05235988F;

		drgbaggageModel[424].addBox(0F, 0F, 0F, 5, 5, 5, 0F); // Box 442
		drgbaggageModel[424].setRotationPoint(-42F, -3F, -9F);
		drgbaggageModel[424].rotateAngleY = 0.05235988F;

		drgbaggageModel[425].addBox(0F, 0F, 0F, 5, 5, 5, 0F); // Box 443
		drgbaggageModel[425].setRotationPoint(-20F, -3F, -7F);
		drgbaggageModel[425].rotateAngleY = -0.33161256F;

		drgbaggageModel[426].addBox(0F, 0F, 0F, 5, 5, 5, 0F); // Box 444
		drgbaggageModel[426].setRotationPoint(-24F, -3F, -8F);
		drgbaggageModel[426].rotateAngleY = 0.50614548F;

		drgbaggageModel[427].addShapeBox(0F, 0F, 0F, 13, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 438
		drgbaggageModel[427].setRotationPoint(-27.5F, -15F, -8F);

		drgbaggageModel[428].addShapeBox(0F, 0F, 0F, 13, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 439
		drgbaggageModel[428].setRotationPoint(-27.5F, -15F, -7F);

		drgbaggageModel[429].addShapeBox(0F, 0F, 0F, 13, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 440
		drgbaggageModel[429].setRotationPoint(-27.5F, -15F, -9F);

		drgbaggageModel[430].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 441
		drgbaggageModel[430].setRotationPoint(-16F, -14.5F, -6.5F);
		drgbaggageModel[430].rotateAngleY = -3.14159265F;

		drgbaggageModel[431].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 442
		drgbaggageModel[431].setRotationPoint(-25F, -14.5F, -6.5F);
		drgbaggageModel[431].rotateAngleY = -3.14159265F;

		drgbaggageModel[432].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 443
		drgbaggageModel[432].setRotationPoint(-20.5F, -16.5F, -8F);
		drgbaggageModel[432].rotateAngleY = -0.52359878F;

		drgbaggageModel[433].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 444
		drgbaggageModel[433].setRotationPoint(35.5F, 0F, 4F);
		drgbaggageModel[433].rotateAngleY = 0.64577182F;

		drgbaggageModel[434].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 445
		drgbaggageModel[434].setRotationPoint(35.5F, -2F, 4F);
		drgbaggageModel[434].rotateAngleY = 0.20943951F;

		drgbaggageModel[435].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 446
		drgbaggageModel[435].setRotationPoint(-29.5F, 0F, 4F);
		drgbaggageModel[435].rotateAngleY = 0.20943951F;

		drgbaggageModel[436].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F, 0F, -0.5F, -1F, -0.5F, -0.5F, -1F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 469
		drgbaggageModel[436].setRotationPoint(44.25F, -17F, -3.5F);

		drgbaggageModel[437].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 471
		drgbaggageModel[437].setRotationPoint(44.25F, -16F, -2.5F);

		drgbaggageModel[438].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 472
		drgbaggageModel[438].setRotationPoint(44.25F, -16F, 2F);

		drgbaggageModel[439].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F, 0F, -0.5F, -1F, -0.5F, -0.5F, -1F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 447
		drgbaggageModel[439].setRotationPoint(-44.75F, -17F, -3.5F);

		drgbaggageModel[440].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 448
		drgbaggageModel[440].setRotationPoint(-44.75F, -16F, -2.5F);

		drgbaggageModel[441].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 449
		drgbaggageModel[441].setRotationPoint(-44.75F, -16F, 2F);

		drgbaggageModel[442].addBox(0F, 0F, 0F, 2, 1, 12, 0F); // Box 453
		drgbaggageModel[442].setRotationPoint(-32F, 6F, -6F);

		drgbaggageModel[443].addBox(0F, 0F, 0F, 13, 1, 12, 0F); // Box 454
		drgbaggageModel[443].setRotationPoint(-40F, 5F, -6F);

		drgbaggageModel[444].addBox(0F, 0F, 0F, 9, 1, 12, 0F); // Box 455
		drgbaggageModel[444].setRotationPoint(-38F, 7F, -6F);

		drgbaggageModel[445].addBox(0F, 0F, 0F, 2, 1, 12, 0F); // Box 456
		drgbaggageModel[445].setRotationPoint(-37F, 6F, -6F);

		drgbaggageModel[446].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 457
		drgbaggageModel[446].setRotationPoint(-39F, 7F, -6F);

		drgbaggageModel[447].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 458
		drgbaggageModel[447].setRotationPoint(-39F, 6F, -6F);

		drgbaggageModel[448].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 459
		drgbaggageModel[448].setRotationPoint(-40F, 6F, -6F);

		drgbaggageModel[449].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 460
		drgbaggageModel[449].setRotationPoint(-29F, 7F, -6F);

		drgbaggageModel[450].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 461
		drgbaggageModel[450].setRotationPoint(-29F, 6F, -6F);

		drgbaggageModel[451].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 462
		drgbaggageModel[451].setRotationPoint(-28F, 6F, -6F);

		drgbaggageModel[452].addBox(0F, 0F, 0F, 5, 2, 6, 0F); // Box 463
		drgbaggageModel[452].setRotationPoint(-36F, 3F, -3F);

		drgbaggageModel[453].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 453
		drgbaggageModel[453].setRotationPoint(38.5F, -8F, 10F);

		drgbaggageModel[454].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 454
		drgbaggageModel[454].setRotationPoint(38.5F, -0.5F, 10F);

		drgbaggageModel[455].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 455
		drgbaggageModel[455].setRotationPoint(7F, -0.5F, 10F);

		drgbaggageModel[456].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 456
		drgbaggageModel[456].setRotationPoint(7F, -8F, 10F);

		drgbaggageModel[457].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 457
		drgbaggageModel[457].setRotationPoint(-7.5F, -0.5F, 10F);

		drgbaggageModel[458].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 458
		drgbaggageModel[458].setRotationPoint(-7.5F, -8F, 10F);

		drgbaggageModel[459].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 459
		drgbaggageModel[459].setRotationPoint(-39F, -0.5F, 10F);

		drgbaggageModel[460].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 460
		drgbaggageModel[460].setRotationPoint(-39F, -8F, 10F);

		drgbaggageModel[461].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 461
		drgbaggageModel[461].setRotationPoint(-39F, -0.5F, -10.5F);

		drgbaggageModel[462].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 462
		drgbaggageModel[462].setRotationPoint(-39F, -8F, -10.5F);

		drgbaggageModel[463].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 463
		drgbaggageModel[463].setRotationPoint(-7.5F, -8F, -10.5F);

		drgbaggageModel[464].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 464
		drgbaggageModel[464].setRotationPoint(-7.5F, -0.5F, -10.5F);

		drgbaggageModel[465].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 465
		drgbaggageModel[465].setRotationPoint(7F, -0.5F, -10.5F);

		drgbaggageModel[466].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 466
		drgbaggageModel[466].setRotationPoint(7F, -8F, -10.5F);

		drgbaggageModel[467].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 467
		drgbaggageModel[467].setRotationPoint(38.5F, -8F, -10.5F);

		drgbaggageModel[468].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 468
		drgbaggageModel[468].setRotationPoint(38.5F, -0.5F, -10.5F);

		drgbaggageModel[469].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 469
		drgbaggageModel[469].setRotationPoint(45F, -0.5F, -8.5F);

		drgbaggageModel[470].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 470
		drgbaggageModel[470].setRotationPoint(45F, -8F, -8.5F);

		drgbaggageModel[471].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 471
		drgbaggageModel[471].setRotationPoint(45F, -8F, 8F);

		drgbaggageModel[472].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 472
		drgbaggageModel[472].setRotationPoint(45F, -0.5F, 8F);

		drgbaggageModel[473].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 473
		drgbaggageModel[473].setRotationPoint(-45.5F, -8F, 8F);

		drgbaggageModel[474].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 474
		drgbaggageModel[474].setRotationPoint(-45.5F, -0.5F, 8F);

		drgbaggageModel[475].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 475
		drgbaggageModel[475].setRotationPoint(-45.5F, -8F, -8.5F);

		drgbaggageModel[476].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 476
		drgbaggageModel[476].setRotationPoint(-45.5F, -0.5F, -8.5F);

		drgbaggageModel[477].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 515
		drgbaggageModel[477].setRotationPoint(-57F, 4F, 0.5F);

		drgbaggageModel[478].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.4F, -0.5F, -0.5F, -0.4F, -0.5F, -0.5F, -0.1F, 0F, -0.5F, -0.1F); // Box 517
		drgbaggageModel[478].setRotationPoint(-57F, 6F, 0.6F);

		drgbaggageModel[479].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, -0.5F, -0.5F, 1F, -0.5F, -0.5F, 1F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 520
		drgbaggageModel[479].setRotationPoint(-57F, 3F, 0.5F);

		drgbaggageModel[480].addShapeBox(0F, 1F, 0F, 1, 1, 14, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 525
		drgbaggageModel[480].setRotationPoint(-56.5F, 2F, -7F);

		drgbaggageModel[481].addShapeBox(0F, 1F, 0F, 1, 1, 1, 0F, 0F, -1F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, -1.5F, 0F, -0.5F, 1F, -0.5F, -0.5F, 1F, -0.5F, 0F, -1.5F, 0F, 0F); // Box 527
		drgbaggageModel[481].setRotationPoint(-56.5F, 1F, 6F);

		drgbaggageModel[482].addShapeBox(0F, 1F, 0F, 1, 1, 1, 0F, 0F, -1F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, -1.5F, 0F, -0.5F, 1F, -0.5F, -0.5F, 1F, -0.5F, 0F, -1.5F, 0F, 0F); // Box 528
		drgbaggageModel[482].setRotationPoint(-56.5F, 1F, -7.5F);

		drgbaggageModel[483].addShapeBox(0F, 1F, 0F, 1, 1, 1, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 529
		drgbaggageModel[483].setRotationPoint(-56.5F, 2F, -0.75F);

		drgbaggageModel[484].addShapeBox(0F, 1F, 0F, 1, 1, 1, 0F, 0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 530
		drgbaggageModel[484].setRotationPoint(-55.5F, 1.5F, -0.75F);

		drgbaggageModel[485].addShapeBox(0F, 1F, 0F, 1, 1, 14, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 477
		drgbaggageModel[485].setRotationPoint(56F, 2F, -7F);

		drgbaggageModel[486].addShapeBox(0F, 1F, 0F, 1, 1, 1, 0F, -0.5F, -0.5F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, -0.5F, -0.5F, 0F, 1F, -0.5F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, 0F, 1F, -0.5F, 0F); // Box 478
		drgbaggageModel[486].setRotationPoint(55.5F, 1F, 6F);

		drgbaggageModel[487].addShapeBox(0F, 1F, 0F, 1, 1, 1, 0F, 0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 479
		drgbaggageModel[487].setRotationPoint(55.5F, 1.5F, -0.75F);

		drgbaggageModel[488].addShapeBox(0F, 1F, 0F, 1, 1, 1, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 480
		drgbaggageModel[488].setRotationPoint(56F, 2F, -0.75F);

		drgbaggageModel[489].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 1F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 1F, -0.5F, 0F, 1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 481
		drgbaggageModel[489].setRotationPoint(56F, 3F, 0.5F);

		drgbaggageModel[490].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 482
		drgbaggageModel[490].setRotationPoint(56.5F, 4F, 0.5F);

		drgbaggageModel[491].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.4F, -0.5F, -0.5F, -0.4F, -0.5F, -0.5F, -0.1F, 0F, -0.5F, -0.1F); // Box 483
		drgbaggageModel[491].setRotationPoint(56.5F, 6F, 0.6F);

		drgbaggageModel[492].addShapeBox(0F, 1F, 0F, 1, 1, 1, 0F, -0.5F, -0.5F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, -0.5F, -0.5F, 0F, 1F, -0.5F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, 0F, 1F, -0.5F, 0F); // Box 484
		drgbaggageModel[492].setRotationPoint(55.5F, 1F, -7.5F);

		fixRotation(drgbaggageModel, false, true, true);

	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		for(int i = 0; i < 493; i++)
		{
			drgbaggageModel[i].render(f5);
		}
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
	{
	}

	public ModelRendererTurbo drgbaggageModel[];
}