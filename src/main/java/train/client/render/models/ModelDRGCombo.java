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

public class ModelDRGCombo extends ModelBase
{
	int textureX = 512;
	int textureY = 256;

	public ModelDRGCombo()
	{
		drgcomboModel = new ModelRendererTurbo[559];
		drgcomboModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		drgcomboModel[1] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 2
		drgcomboModel[2] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 3
		drgcomboModel[3] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 4
		drgcomboModel[4] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 5
		drgcomboModel[5] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 21
		drgcomboModel[6] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 22
		drgcomboModel[7] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 23
		drgcomboModel[8] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 26
		drgcomboModel[9] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 36
		drgcomboModel[10] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 37
		drgcomboModel[11] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 38
		drgcomboModel[12] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 40
		drgcomboModel[13] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 54
		drgcomboModel[14] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 55
		drgcomboModel[15] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 65
		drgcomboModel[16] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 67
		drgcomboModel[17] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 68
		drgcomboModel[18] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 69
		drgcomboModel[19] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 70
		drgcomboModel[20] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 71
		drgcomboModel[21] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 72
		drgcomboModel[22] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 73
		drgcomboModel[23] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 65
		drgcomboModel[24] = new ModelRendererTurbo(this, 65, 9, textureX, textureY); // Box 66
		drgcomboModel[25] = new ModelRendererTurbo(this, 273, 9, textureX, textureY); // Box 68
		drgcomboModel[26] = new ModelRendererTurbo(this, 289, 9, textureX, textureY); // Box 69
		drgcomboModel[27] = new ModelRendererTurbo(this, 305, 9, textureX, textureY); // Box 71
		drgcomboModel[28] = new ModelRendererTurbo(this, 321, 9, textureX, textureY); // Box 72
		drgcomboModel[29] = new ModelRendererTurbo(this, 337, 9, textureX, textureY); // Box 73
		drgcomboModel[30] = new ModelRendererTurbo(this, 353, 9, textureX, textureY); // Box 74
		drgcomboModel[31] = new ModelRendererTurbo(this, 369, 9, textureX, textureY); // Box 75
		drgcomboModel[32] = new ModelRendererTurbo(this, 385, 9, textureX, textureY); // Box 76
		drgcomboModel[33] = new ModelRendererTurbo(this, 113, 17, textureX, textureY); // Box 79
		drgcomboModel[34] = new ModelRendererTurbo(this, 417, 9, textureX, textureY); // Box 91
		drgcomboModel[35] = new ModelRendererTurbo(this, 145, 17, textureX, textureY); // Box 94
		drgcomboModel[36] = new ModelRendererTurbo(this, 65, 17, textureX, textureY); // Box 95
		drgcomboModel[37] = new ModelRendererTurbo(this, 257, 17, textureX, textureY); // Box 96
		drgcomboModel[38] = new ModelRendererTurbo(this, 417, 9, textureX, textureY); // Box 97
		drgcomboModel[39] = new ModelRendererTurbo(this, 273, 17, textureX, textureY); // Box 98
		drgcomboModel[40] = new ModelRendererTurbo(this, 281, 17, textureX, textureY); // Box 99
		drgcomboModel[41] = new ModelRendererTurbo(this, 289, 17, textureX, textureY); // Box 100
		drgcomboModel[42] = new ModelRendererTurbo(this, 297, 17, textureX, textureY); // Box 101
		drgcomboModel[43] = new ModelRendererTurbo(this, 481, 17, textureX, textureY); // Box 102
		drgcomboModel[44] = new ModelRendererTurbo(this, 273, 33, textureX, textureY); // Box 103
		drgcomboModel[45] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 104
		drgcomboModel[46] = new ModelRendererTurbo(this, 17, 25, textureX, textureY); // Box 108
		drgcomboModel[47] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 109
		drgcomboModel[48] = new ModelRendererTurbo(this, 49, 25, textureX, textureY); // Box 110
		drgcomboModel[49] = new ModelRendererTurbo(this, 81, 25, textureX, textureY); // Box 111
		drgcomboModel[50] = new ModelRendererTurbo(this, 97, 25, textureX, textureY); // Box 112
		drgcomboModel[51] = new ModelRendererTurbo(this, 457, 25, textureX, textureY); // Box 128
		drgcomboModel[52] = new ModelRendererTurbo(this, 465, 25, textureX, textureY); // Box 129
		drgcomboModel[53] = new ModelRendererTurbo(this, 473, 25, textureX, textureY); // Box 130
		drgcomboModel[54] = new ModelRendererTurbo(this, 145, 33, textureX, textureY); // Box 131
		drgcomboModel[55] = new ModelRendererTurbo(this, 153, 33, textureX, textureY); // Box 132
		drgcomboModel[56] = new ModelRendererTurbo(this, 161, 33, textureX, textureY); // Box 133
		drgcomboModel[57] = new ModelRendererTurbo(this, 441, 9, textureX, textureY); // Box 134
		drgcomboModel[58] = new ModelRendererTurbo(this, 417, 17, textureX, textureY); // Box 135
		drgcomboModel[59] = new ModelRendererTurbo(this, 305, 25, textureX, textureY); // Box 136
		drgcomboModel[60] = new ModelRendererTurbo(this, 153, 41, textureX, textureY); // Box 137
		drgcomboModel[61] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 138
		drgcomboModel[62] = new ModelRendererTurbo(this, 329, 9, textureX, textureY); // Box 139
		drgcomboModel[63] = new ModelRendererTurbo(this, 41, 25, textureX, textureY); // Box 140
		drgcomboModel[64] = new ModelRendererTurbo(this, 73, 41, textureX, textureY); // Box 141
		drgcomboModel[65] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 143
		drgcomboModel[66] = new ModelRendererTurbo(this, 169, 33, textureX, textureY); // Box 145
		drgcomboModel[67] = new ModelRendererTurbo(this, 465, 9, textureX, textureY); // Box 146
		drgcomboModel[68] = new ModelRendererTurbo(this, 313, 17, textureX, textureY); // Box 147
		drgcomboModel[69] = new ModelRendererTurbo(this, 113, 41, textureX, textureY); // Box 158
		drgcomboModel[70] = new ModelRendererTurbo(this, 377, 41, textureX, textureY); // Box 159
		drgcomboModel[71] = new ModelRendererTurbo(this, 425, 41, textureX, textureY); // Box 160
		drgcomboModel[72] = new ModelRendererTurbo(this, 329, 17, textureX, textureY); // Box 171
		drgcomboModel[73] = new ModelRendererTurbo(this, 361, 17, textureX, textureY); // Box 172
		drgcomboModel[74] = new ModelRendererTurbo(this, 193, 33, textureX, textureY); // Box 173
		drgcomboModel[75] = new ModelRendererTurbo(this, 353, 25, textureX, textureY); // Box 174
		drgcomboModel[76] = new ModelRendererTurbo(this, 369, 25, textureX, textureY); // Box 175
		drgcomboModel[77] = new ModelRendererTurbo(this, 209, 33, textureX, textureY); // Box 176
		drgcomboModel[78] = new ModelRendererTurbo(this, 225, 33, textureX, textureY); // Box 177
		drgcomboModel[79] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 178
		drgcomboModel[80] = new ModelRendererTurbo(this, 105, 41, textureX, textureY); // Box 179
		drgcomboModel[81] = new ModelRendererTurbo(this, 41, 33, textureX, textureY); // Box 180
		drgcomboModel[82] = new ModelRendererTurbo(this, 9, 33, textureX, textureY); // Box 181
		drgcomboModel[83] = new ModelRendererTurbo(this, 457, 33, textureX, textureY); // Box 182
		drgcomboModel[84] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Box 183
		drgcomboModel[85] = new ModelRendererTurbo(this, 33, 49, textureX, textureY); // Box 184
		drgcomboModel[86] = new ModelRendererTurbo(this, 401, 49, textureX, textureY); // Box 185
		drgcomboModel[87] = new ModelRendererTurbo(this, 361, 41, textureX, textureY); // Box 186
		drgcomboModel[88] = new ModelRendererTurbo(this, 65, 41, textureX, textureY); // Box 187
		drgcomboModel[89] = new ModelRendererTurbo(this, 377, 41, textureX, textureY); // Box 188
		drgcomboModel[90] = new ModelRendererTurbo(this, 401, 41, textureX, textureY); // Box 189
		drgcomboModel[91] = new ModelRendererTurbo(this, 473, 33, textureX, textureY); // Box 190
		drgcomboModel[92] = new ModelRendererTurbo(this, 417, 41, textureX, textureY); // Box 191
		drgcomboModel[93] = new ModelRendererTurbo(this, 489, 41, textureX, textureY); // Box 192
		drgcomboModel[94] = new ModelRendererTurbo(this, 89, 33, textureX, textureY); // Box 193
		drgcomboModel[95] = new ModelRendererTurbo(this, 145, 41, textureX, textureY); // Box 194
		drgcomboModel[96] = new ModelRendererTurbo(this, 249, 33, textureX, textureY); // Box 195
		drgcomboModel[97] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 196
		drgcomboModel[98] = new ModelRendererTurbo(this, 33, 49, textureX, textureY); // Box 197
		drgcomboModel[99] = new ModelRendererTurbo(this, 57, 49, textureX, textureY); // Box 198
		drgcomboModel[100] = new ModelRendererTurbo(this, 361, 49, textureX, textureY); // Box 199
		drgcomboModel[101] = new ModelRendererTurbo(this, 105, 49, textureX, textureY); // Box 200
		drgcomboModel[102] = new ModelRendererTurbo(this, 449, 41, textureX, textureY); // Box 201
		drgcomboModel[103] = new ModelRendererTurbo(this, 465, 41, textureX, textureY); // Box 202
		drgcomboModel[104] = new ModelRendererTurbo(this, 433, 41, textureX, textureY); // Box 203
		drgcomboModel[105] = new ModelRendererTurbo(this, 161, 49, textureX, textureY); // Box 204
		drgcomboModel[106] = new ModelRendererTurbo(this, 57, 65, textureX, textureY); // Box 205
		drgcomboModel[107] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 206
		drgcomboModel[108] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 207
		drgcomboModel[109] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 208
		drgcomboModel[110] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 209
		drgcomboModel[111] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 210
		drgcomboModel[112] = new ModelRendererTurbo(this, 193, 73, textureX, textureY); // Box 211
		drgcomboModel[113] = new ModelRendererTurbo(this, 481, 49, textureX, textureY); // Box 148
		drgcomboModel[114] = new ModelRendererTurbo(this, 457, 57, textureX, textureY); // Box 149
		drgcomboModel[115] = new ModelRendererTurbo(this, 409, 73, textureX, textureY); // Box 150
		drgcomboModel[116] = new ModelRendererTurbo(this, 257, 81, textureX, textureY); // Box 163
		drgcomboModel[117] = new ModelRendererTurbo(this, 301, 81, textureX, textureY); // Box 164
		drgcomboModel[118] = new ModelRendererTurbo(this, 345, 81, textureX, textureY); // Box 165
		drgcomboModel[119] = new ModelRendererTurbo(this, 377, 81, textureX, textureY); // Box 166
		drgcomboModel[120] = new ModelRendererTurbo(this, 441, 81, textureX, textureY); // Box 167
		drgcomboModel[121] = new ModelRendererTurbo(this, 471, 81, textureX, textureY); // Box 168
		drgcomboModel[122] = new ModelRendererTurbo(this, 471, 81, textureX, textureY); // Box 169
		drgcomboModel[123] = new ModelRendererTurbo(this, 137, 89, textureX, textureY); // Box 170
		drgcomboModel[124] = new ModelRendererTurbo(this, 169, 89, textureX, textureY); // Box 171
		drgcomboModel[125] = new ModelRendererTurbo(this, 209, 89, textureX, textureY); // Box 172
		drgcomboModel[126] = new ModelRendererTurbo(this, 241, 81, textureX, textureY); // Box 172
		drgcomboModel[127] = new ModelRendererTurbo(this, 57, 57, textureX, textureY); // Box 173
		drgcomboModel[128] = new ModelRendererTurbo(this, 121, 57, textureX, textureY); // Box 174
		drgcomboModel[129] = new ModelRendererTurbo(this, 361, 57, textureX, textureY); // Box 177
		drgcomboModel[130] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 178
		drgcomboModel[131] = new ModelRendererTurbo(this, 249, 65, textureX, textureY); // Box 179
		drgcomboModel[132] = new ModelRendererTurbo(this, 281, 65, textureX, textureY); // Box 180
		drgcomboModel[133] = new ModelRendererTurbo(this, 417, 9, textureX, textureY); // Box 181
		drgcomboModel[134] = new ModelRendererTurbo(this, 441, 9, textureX, textureY); // Box 182
		drgcomboModel[135] = new ModelRendererTurbo(this, 65, 17, textureX, textureY); // Box 184
		drgcomboModel[136] = new ModelRendererTurbo(this, 257, 17, textureX, textureY); // Box 186
		drgcomboModel[137] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 185
		drgcomboModel[138] = new ModelRendererTurbo(this, 57, 97, textureX, textureY); // Box 189
		drgcomboModel[139] = new ModelRendererTurbo(this, 225, 97, textureX, textureY); // Box 190
		drgcomboModel[140] = new ModelRendererTurbo(this, 97, 105, textureX, textureY); // Box 191
		drgcomboModel[141] = new ModelRendererTurbo(this, 273, 105, textureX, textureY); // Box 193
		drgcomboModel[142] = new ModelRendererTurbo(this, 401, 49, textureX, textureY); // Box 196
		drgcomboModel[143] = new ModelRendererTurbo(this, 425, 49, textureX, textureY); // Box 198
		drgcomboModel[144] = new ModelRendererTurbo(this, 73, 49, textureX, textureY); // Box 199
		drgcomboModel[145] = new ModelRendererTurbo(this, 385, 49, textureX, textureY); // Box 200
		drgcomboModel[146] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 201
		drgcomboModel[147] = new ModelRendererTurbo(this, 417, 17, textureX, textureY); // Box 202
		drgcomboModel[148] = new ModelRendererTurbo(this, 345, 65, textureX, textureY); // Box 198
		drgcomboModel[149] = new ModelRendererTurbo(this, 417, 97, textureX, textureY); // Box 199
		drgcomboModel[150] = new ModelRendererTurbo(this, 33, 57, textureX, textureY); // Box 214
		drgcomboModel[151] = new ModelRendererTurbo(this, 321, 25, textureX, textureY); // Box 215
		drgcomboModel[152] = new ModelRendererTurbo(this, 33, 41, textureX, textureY); // Box 216
		drgcomboModel[153] = new ModelRendererTurbo(this, 153, 57, textureX, textureY); // Box 217
		drgcomboModel[154] = new ModelRendererTurbo(this, 305, 25, textureX, textureY); // Box 218
		drgcomboModel[155] = new ModelRendererTurbo(this, 401, 57, textureX, textureY); // Box 220
		drgcomboModel[156] = new ModelRendererTurbo(this, 1, 121, textureX, textureY); // Box 221
		drgcomboModel[157] = new ModelRendererTurbo(this, 505, 41, textureX, textureY); // Box 221
		drgcomboModel[158] = new ModelRendererTurbo(this, 185, 33, textureX, textureY); // Box 222
		drgcomboModel[159] = new ModelRendererTurbo(this, 449, 41, textureX, textureY); // Box 223
		drgcomboModel[160] = new ModelRendererTurbo(this, 377, 49, textureX, textureY); // Box 224
		drgcomboModel[161] = new ModelRendererTurbo(this, 425, 57, textureX, textureY); // Box 225
		drgcomboModel[162] = new ModelRendererTurbo(this, 433, 57, textureX, textureY); // Box 226
		drgcomboModel[163] = new ModelRendererTurbo(this, 449, 57, textureX, textureY); // Box 227
		drgcomboModel[164] = new ModelRendererTurbo(this, 457, 57, textureX, textureY); // Box 228
		drgcomboModel[165] = new ModelRendererTurbo(this, 465, 57, textureX, textureY); // Box 229
		drgcomboModel[166] = new ModelRendererTurbo(this, 105, 81, textureX, textureY); // Box 235
		drgcomboModel[167] = new ModelRendererTurbo(this, 137, 81, textureX, textureY); // Box 236
		drgcomboModel[168] = new ModelRendererTurbo(this, 209, 81, textureX, textureY); // Box 237
		drgcomboModel[169] = new ModelRendererTurbo(this, 393, 81, textureX, textureY); // Box 233
		drgcomboModel[170] = new ModelRendererTurbo(this, 33, 65, textureX, textureY); // Box 242
		drgcomboModel[171] = new ModelRendererTurbo(this, 377, 65, textureX, textureY); // Box 243
		drgcomboModel[172] = new ModelRendererTurbo(this, 393, 65, textureX, textureY); // Box 244
		drgcomboModel[173] = new ModelRendererTurbo(this, 425, 65, textureX, textureY); // Box 245
		drgcomboModel[174] = new ModelRendererTurbo(this, 497, 73, textureX, textureY); // Box 256
		drgcomboModel[175] = new ModelRendererTurbo(this, 33, 81, textureX, textureY); // Box 257
		drgcomboModel[176] = new ModelRendererTurbo(this, 81, 81, textureX, textureY); // Box 258
		drgcomboModel[177] = new ModelRendererTurbo(this, 169, 81, textureX, textureY); // Box 259
		drgcomboModel[178] = new ModelRendererTurbo(this, 409, 65, textureX, textureY); // Box 264
		drgcomboModel[179] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 265
		drgcomboModel[180] = new ModelRendererTurbo(this, 297, 81, textureX, textureY); // Box 266
		drgcomboModel[181] = new ModelRendererTurbo(this, 457, 65, textureX, textureY); // Box 267
		drgcomboModel[182] = new ModelRendererTurbo(this, 337, 81, textureX, textureY); // Box 268
		drgcomboModel[183] = new ModelRendererTurbo(this, 441, 65, textureX, textureY); // Box 269
		drgcomboModel[184] = new ModelRendererTurbo(this, 305, 81, textureX, textureY); // Box 270
		drgcomboModel[185] = new ModelRendererTurbo(this, 361, 81, textureX, textureY); // Box 271
		drgcomboModel[186] = new ModelRendererTurbo(this, 369, 81, textureX, textureY); // Box 272
		drgcomboModel[187] = new ModelRendererTurbo(this, 457, 81, textureX, textureY); // Box 273
		drgcomboModel[188] = new ModelRendererTurbo(this, 441, 73, textureX, textureY); // Box 274
		drgcomboModel[189] = new ModelRendererTurbo(this, 473, 81, textureX, textureY); // Box 275
		drgcomboModel[190] = new ModelRendererTurbo(this, 489, 81, textureX, textureY); // Box 276
		drgcomboModel[191] = new ModelRendererTurbo(this, 497, 81, textureX, textureY); // Box 277
		drgcomboModel[192] = new ModelRendererTurbo(this, 33, 89, textureX, textureY); // Box 278
		drgcomboModel[193] = new ModelRendererTurbo(this, 193, 81, textureX, textureY); // Box 279
		drgcomboModel[194] = new ModelRendererTurbo(this, 185, 89, textureX, textureY); // Box 280
		drgcomboModel[195] = new ModelRendererTurbo(this, 505, 89, textureX, textureY); // Box 281
		drgcomboModel[196] = new ModelRendererTurbo(this, 81, 89, textureX, textureY); // Box 282
		drgcomboModel[197] = new ModelRendererTurbo(this, 337, 89, textureX, textureY); // Box 283
		drgcomboModel[198] = new ModelRendererTurbo(this, 441, 81, textureX, textureY); // Box 284
		drgcomboModel[199] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 285
		drgcomboModel[200] = new ModelRendererTurbo(this, 9, 97, textureX, textureY); // Box 286
		drgcomboModel[201] = new ModelRendererTurbo(this, 369, 89, textureX, textureY); // Box 287
		drgcomboModel[202] = new ModelRendererTurbo(this, 393, 89, textureX, textureY); // Box 288
		drgcomboModel[203] = new ModelRendererTurbo(this, 105, 89, textureX, textureY); // Box 289
		drgcomboModel[204] = new ModelRendererTurbo(this, 41, 97, textureX, textureY); // Box 290
		drgcomboModel[205] = new ModelRendererTurbo(this, 49, 97, textureX, textureY); // Box 291
		drgcomboModel[206] = new ModelRendererTurbo(this, 457, 89, textureX, textureY); // Box 292
		drgcomboModel[207] = new ModelRendererTurbo(this, 57, 97, textureX, textureY); // Box 293
		drgcomboModel[208] = new ModelRendererTurbo(this, 489, 57, textureX, textureY); // Box 313
		drgcomboModel[209] = new ModelRendererTurbo(this, 241, 81, textureX, textureY); // Box 314
		drgcomboModel[210] = new ModelRendererTurbo(this, 121, 89, textureX, textureY); // Box 315
		drgcomboModel[211] = new ModelRendererTurbo(this, 137, 89, textureX, textureY); // Box 316
		drgcomboModel[212] = new ModelRendererTurbo(this, 153, 89, textureX, textureY); // Box 317
		drgcomboModel[213] = new ModelRendererTurbo(this, 169, 89, textureX, textureY); // Box 318
		drgcomboModel[214] = new ModelRendererTurbo(this, 193, 89, textureX, textureY); // Box 319
		drgcomboModel[215] = new ModelRendererTurbo(this, 209, 89, textureX, textureY); // Box 320
		drgcomboModel[216] = new ModelRendererTurbo(this, 489, 97, textureX, textureY); // Box 360
		drgcomboModel[217] = new ModelRendererTurbo(this, 225, 89, textureX, textureY); // Box 361
		drgcomboModel[218] = new ModelRendererTurbo(this, 97, 97, textureX, textureY); // Box 362
		drgcomboModel[219] = new ModelRendererTurbo(this, 121, 97, textureX, textureY); // Box 363
		drgcomboModel[220] = new ModelRendererTurbo(this, 497, 97, textureX, textureY); // Box 364
		drgcomboModel[221] = new ModelRendererTurbo(this, 505, 105, textureX, textureY); // Box 365
		drgcomboModel[222] = new ModelRendererTurbo(this, 137, 97, textureX, textureY); // Box 366
		drgcomboModel[223] = new ModelRendererTurbo(this, 153, 97, textureX, textureY); // Box 367
		drgcomboModel[224] = new ModelRendererTurbo(this, 225, 113, textureX, textureY); // Box 368
		drgcomboModel[225] = new ModelRendererTurbo(this, 193, 97, textureX, textureY); // Box 369
		drgcomboModel[226] = new ModelRendererTurbo(this, 233, 113, textureX, textureY); // Box 370
		drgcomboModel[227] = new ModelRendererTurbo(this, 169, 97, textureX, textureY); // Box 371
		drgcomboModel[228] = new ModelRendererTurbo(this, 449, 97, textureX, textureY); // Box 372
		drgcomboModel[229] = new ModelRendererTurbo(this, 241, 113, textureX, textureY); // Box 373
		drgcomboModel[230] = new ModelRendererTurbo(this, 465, 97, textureX, textureY); // Box 374
		drgcomboModel[231] = new ModelRendererTurbo(this, 209, 97, textureX, textureY); // Box 375
		drgcomboModel[232] = new ModelRendererTurbo(this, 57, 105, textureX, textureY); // Box 376
		drgcomboModel[233] = new ModelRendererTurbo(this, 249, 113, textureX, textureY); // Box 377
		drgcomboModel[234] = new ModelRendererTurbo(this, 257, 113, textureX, textureY); // Box 378
		drgcomboModel[235] = new ModelRendererTurbo(this, 113, 113, textureX, textureY); // Box 379
		drgcomboModel[236] = new ModelRendererTurbo(this, 265, 113, textureX, textureY); // Box 380
		drgcomboModel[237] = new ModelRendererTurbo(this, 129, 113, textureX, textureY); // Box 381
		drgcomboModel[238] = new ModelRendererTurbo(this, 145, 113, textureX, textureY); // Box 382
		drgcomboModel[239] = new ModelRendererTurbo(this, 505, 121, textureX, textureY); // Box 383
		drgcomboModel[240] = new ModelRendererTurbo(this, 161, 113, textureX, textureY); // Box 384
		drgcomboModel[241] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Box 385
		drgcomboModel[242] = new ModelRendererTurbo(this, 177, 113, textureX, textureY); // Box 386
		drgcomboModel[243] = new ModelRendererTurbo(this, 193, 113, textureX, textureY); // Box 387
		drgcomboModel[244] = new ModelRendererTurbo(this, 9, 129, textureX, textureY); // Box 388
		drgcomboModel[245] = new ModelRendererTurbo(this, 209, 113, textureX, textureY); // Box 389
		drgcomboModel[246] = new ModelRendererTurbo(this, 273, 65, textureX, textureY); // Box 406
		drgcomboModel[247] = new ModelRendererTurbo(this, 137, 113, textureX, textureY); // Box 407
		drgcomboModel[248] = new ModelRendererTurbo(this, 17, 129, textureX, textureY); // Box 408
		drgcomboModel[249] = new ModelRendererTurbo(this, 25, 129, textureX, textureY); // Box 409
		drgcomboModel[250] = new ModelRendererTurbo(this, 497, 89, textureX, textureY); // Box 410
		drgcomboModel[251] = new ModelRendererTurbo(this, 481, 97, textureX, textureY); // Box 411
		drgcomboModel[252] = new ModelRendererTurbo(this, 33, 129, textureX, textureY); // Box 412
		drgcomboModel[253] = new ModelRendererTurbo(this, 185, 113, textureX, textureY); // Box 413
		drgcomboModel[254] = new ModelRendererTurbo(this, 41, 129, textureX, textureY); // Box 414
		drgcomboModel[255] = new ModelRendererTurbo(this, 273, 113, textureX, textureY); // Box 415
		drgcomboModel[256] = new ModelRendererTurbo(this, 489, 113, textureX, textureY); // Box 416
		drgcomboModel[257] = new ModelRendererTurbo(this, 49, 129, textureX, textureY); // Box 417
		drgcomboModel[258] = new ModelRendererTurbo(this, 497, 113, textureX, textureY); // Box 418
		drgcomboModel[259] = new ModelRendererTurbo(this, 57, 129, textureX, textureY); // Box 419
		drgcomboModel[260] = new ModelRendererTurbo(this, 65, 129, textureX, textureY); // Box 420
		drgcomboModel[261] = new ModelRendererTurbo(this, 81, 129, textureX, textureY); // Box 421
		drgcomboModel[262] = new ModelRendererTurbo(this, 89, 129, textureX, textureY); // Box 422
		drgcomboModel[263] = new ModelRendererTurbo(this, 121, 129, textureX, textureY); // Box 424
		drgcomboModel[264] = new ModelRendererTurbo(this, 129, 129, textureX, textureY); // Box 425
		drgcomboModel[265] = new ModelRendererTurbo(this, 145, 129, textureX, textureY); // Box 397
		drgcomboModel[266] = new ModelRendererTurbo(this, 153, 129, textureX, textureY); // Box 398
		drgcomboModel[267] = new ModelRendererTurbo(this, 161, 129, textureX, textureY); // Box 362
		drgcomboModel[268] = new ModelRendererTurbo(this, 193, 129, textureX, textureY); // Box 363
		drgcomboModel[269] = new ModelRendererTurbo(this, 97, 129, textureX, textureY); // Box 364
		drgcomboModel[270] = new ModelRendererTurbo(this, 209, 129, textureX, textureY); // Box 365
		drgcomboModel[271] = new ModelRendererTurbo(this, 113, 129, textureX, textureY); // Box 366
		drgcomboModel[272] = new ModelRendererTurbo(this, 257, 129, textureX, textureY); // Box 357
		drgcomboModel[273] = new ModelRendererTurbo(this, 289, 129, textureX, textureY); // Box 359
		drgcomboModel[274] = new ModelRendererTurbo(this, 313, 129, textureX, textureY); // Box 360
		drgcomboModel[275] = new ModelRendererTurbo(this, 321, 129, textureX, textureY); // Box 361
		drgcomboModel[276] = new ModelRendererTurbo(this, 337, 129, textureX, textureY); // Box 362
		drgcomboModel[277] = new ModelRendererTurbo(this, 345, 129, textureX, textureY); // Box 363
		drgcomboModel[278] = new ModelRendererTurbo(this, 361, 129, textureX, textureY); // Box 436
		drgcomboModel[279] = new ModelRendererTurbo(this, 361, 137, textureX, textureY); // Box 437
		drgcomboModel[280] = new ModelRendererTurbo(this, 1, 145, textureX, textureY); // Box 438
		drgcomboModel[281] = new ModelRendererTurbo(this, 345, 145, textureX, textureY); // Box 439
		drgcomboModel[282] = new ModelRendererTurbo(this, 1, 153, textureX, textureY); // Box 440
		drgcomboModel[283] = new ModelRendererTurbo(this, 121, 153, textureX, textureY); // Box 441
		drgcomboModel[284] = new ModelRendererTurbo(this, 241, 65, textureX, textureY); // Box 442
		drgcomboModel[285] = new ModelRendererTurbo(this, 281, 129, textureX, textureY); // Box 443
		drgcomboModel[286] = new ModelRendererTurbo(this, 473, 129, textureX, textureY); // Box 444
		drgcomboModel[287] = new ModelRendererTurbo(this, 489, 129, textureX, textureY); // Box 445
		drgcomboModel[288] = new ModelRendererTurbo(this, 65, 137, textureX, textureY); // Box 446
		drgcomboModel[289] = new ModelRendererTurbo(this, 81, 137, textureX, textureY); // Box 447
		drgcomboModel[290] = new ModelRendererTurbo(this, 113, 137, textureX, textureY); // Box 448
		drgcomboModel[291] = new ModelRendererTurbo(this, 129, 137, textureX, textureY); // Box 452
		drgcomboModel[292] = new ModelRendererTurbo(this, 161, 137, textureX, textureY); // Box 454
		drgcomboModel[293] = new ModelRendererTurbo(this, 177, 137, textureX, textureY); // Box 455
		drgcomboModel[294] = new ModelRendererTurbo(this, 193, 137, textureX, textureY); // Box 456
		drgcomboModel[295] = new ModelRendererTurbo(this, 209, 137, textureX, textureY); // Box 457
		drgcomboModel[296] = new ModelRendererTurbo(this, 257, 137, textureX, textureY); // Box 458
		drgcomboModel[297] = new ModelRendererTurbo(this, 281, 137, textureX, textureY); // Box 459
		drgcomboModel[298] = new ModelRendererTurbo(this, 473, 129, textureX, textureY); // Box 463
		drgcomboModel[299] = new ModelRendererTurbo(this, 297, 137, textureX, textureY); // Box 464
		drgcomboModel[300] = new ModelRendererTurbo(this, 241, 145, textureX, textureY); // Box 465
		drgcomboModel[301] = new ModelRendererTurbo(this, 257, 145, textureX, textureY); // Box 467
		drgcomboModel[302] = new ModelRendererTurbo(this, 113, 145, textureX, textureY); // Box 470
		drgcomboModel[303] = new ModelRendererTurbo(this, 137, 145, textureX, textureY); // Box 473
		drgcomboModel[304] = new ModelRendererTurbo(this, 505, 137, textureX, textureY); // Box 474
		drgcomboModel[305] = new ModelRendererTurbo(this, 73, 137, textureX, textureY); // Box 484
		drgcomboModel[306] = new ModelRendererTurbo(this, 129, 145, textureX, textureY); // Box 485
		drgcomboModel[307] = new ModelRendererTurbo(this, 137, 137, textureX, textureY); // Box 486
		drgcomboModel[308] = new ModelRendererTurbo(this, 153, 145, textureX, textureY); // Box 487
		drgcomboModel[309] = new ModelRendererTurbo(this, 169, 137, textureX, textureY); // Box 490
		drgcomboModel[310] = new ModelRendererTurbo(this, 177, 145, textureX, textureY); // Box 491
		drgcomboModel[311] = new ModelRendererTurbo(this, 185, 137, textureX, textureY); // Box 492
		drgcomboModel[312] = new ModelRendererTurbo(this, 193, 145, textureX, textureY); // Box 493
		drgcomboModel[313] = new ModelRendererTurbo(this, 201, 137, textureX, textureY); // Box 496
		drgcomboModel[314] = new ModelRendererTurbo(this, 265, 145, textureX, textureY); // Box 497
		drgcomboModel[315] = new ModelRendererTurbo(this, 489, 137, textureX, textureY); // Box 498
		drgcomboModel[316] = new ModelRendererTurbo(this, 433, 153, textureX, textureY); // Box 499
		drgcomboModel[317] = new ModelRendererTurbo(this, 353, 153, textureX, textureY); // Box 392
		drgcomboModel[318] = new ModelRendererTurbo(this, 225, 129, textureX, textureY); // Box 393
		drgcomboModel[319] = new ModelRendererTurbo(this, 401, 153, textureX, textureY); // Box 394
		drgcomboModel[320] = new ModelRendererTurbo(this, 289, 129, textureX, textureY); // Box 395
		drgcomboModel[321] = new ModelRendererTurbo(this, 473, 153, textureX, textureY); // Box 396
		drgcomboModel[322] = new ModelRendererTurbo(this, 41, 161, textureX, textureY); // Box 397
		drgcomboModel[323] = new ModelRendererTurbo(this, 305, 129, textureX, textureY); // Box 398
		drgcomboModel[324] = new ModelRendererTurbo(this, 73, 161, textureX, textureY); // Box 399
		drgcomboModel[325] = new ModelRendererTurbo(this, 321, 129, textureX, textureY); // Box 400
		drgcomboModel[326] = new ModelRendererTurbo(this, 89, 161, textureX, textureY); // Box 401
		drgcomboModel[327] = new ModelRendererTurbo(this, 105, 161, textureX, textureY); // Box 402
		drgcomboModel[328] = new ModelRendererTurbo(this, 137, 161, textureX, textureY); // Box 403
		drgcomboModel[329] = new ModelRendererTurbo(this, 345, 129, textureX, textureY); // Box 404
		drgcomboModel[330] = new ModelRendererTurbo(this, 153, 161, textureX, textureY); // Box 405
		drgcomboModel[331] = new ModelRendererTurbo(this, 497, 129, textureX, textureY); // Box 406
		drgcomboModel[332] = new ModelRendererTurbo(this, 169, 161, textureX, textureY); // Box 407
		drgcomboModel[333] = new ModelRendererTurbo(this, 217, 137, textureX, textureY); // Box 408
		drgcomboModel[334] = new ModelRendererTurbo(this, 201, 161, textureX, textureY); // Box 409
		drgcomboModel[335] = new ModelRendererTurbo(this, 217, 161, textureX, textureY); // Box 410
		drgcomboModel[336] = new ModelRendererTurbo(this, 217, 145, textureX, textureY); // Box 411
		drgcomboModel[337] = new ModelRendererTurbo(this, 481, 161, textureX, textureY); // Box 412
		drgcomboModel[338] = new ModelRendererTurbo(this, 257, 145, textureX, textureY); // Box 413
		drgcomboModel[339] = new ModelRendererTurbo(this, 305, 161, textureX, textureY); // Box 414
		drgcomboModel[340] = new ModelRendererTurbo(this, 281, 145, textureX, textureY); // Box 415
		drgcomboModel[341] = new ModelRendererTurbo(this, 353, 161, textureX, textureY); // Box 416
		drgcomboModel[342] = new ModelRendererTurbo(this, 41, 169, textureX, textureY); // Box 417
		drgcomboModel[343] = new ModelRendererTurbo(this, 65, 169, textureX, textureY); // Box 404
		drgcomboModel[344] = new ModelRendererTurbo(this, 81, 169, textureX, textureY); // Box 405
		drgcomboModel[345] = new ModelRendererTurbo(this, 233, 161, textureX, textureY); // Box 406
		drgcomboModel[346] = new ModelRendererTurbo(this, 441, 161, textureX, textureY); // Box 407
		drgcomboModel[347] = new ModelRendererTurbo(this, 97, 169, textureX, textureY); // Box 416
		drgcomboModel[348] = new ModelRendererTurbo(this, 121, 169, textureX, textureY); // Box 417
		drgcomboModel[349] = new ModelRendererTurbo(this, 73, 129, textureX, textureY); // Box 380
		drgcomboModel[350] = new ModelRendererTurbo(this, 145, 169, textureX, textureY); // Box 381
		drgcomboModel[351] = new ModelRendererTurbo(this, 161, 169, textureX, textureY); // Box 382
		drgcomboModel[352] = new ModelRendererTurbo(this, 105, 169, textureX, textureY); // Box 384
		drgcomboModel[353] = new ModelRendererTurbo(this, 177, 169, textureX, textureY); // Box 387
		drgcomboModel[354] = new ModelRendererTurbo(this, 305, 169, textureX, textureY); // Box 388
		drgcomboModel[355] = new ModelRendererTurbo(this, 337, 169, textureX, textureY); // Box 389
		drgcomboModel[356] = new ModelRendererTurbo(this, 209, 169, textureX, textureY); // Box 390
		drgcomboModel[357] = new ModelRendererTurbo(this, 217, 169, textureX, textureY); // Box 391
		drgcomboModel[358] = new ModelRendererTurbo(this, 369, 169, textureX, textureY); // Box 392
		drgcomboModel[359] = new ModelRendererTurbo(this, 481, 169, textureX, textureY); // Box 394
		drgcomboModel[360] = new ModelRendererTurbo(this, 369, 153, textureX, textureY); // Box 395
		drgcomboModel[361] = new ModelRendererTurbo(this, 417, 153, textureX, textureY); // Box 396
		drgcomboModel[362] = new ModelRendererTurbo(this, 249, 169, textureX, textureY); // Box 397
		drgcomboModel[363] = new ModelRendererTurbo(this, 1, 177, textureX, textureY); // Box 398
		drgcomboModel[364] = new ModelRendererTurbo(this, 25, 177, textureX, textureY); // Box 399
		drgcomboModel[365] = new ModelRendererTurbo(this, 265, 169, textureX, textureY); // Box 400
		drgcomboModel[366] = new ModelRendererTurbo(this, 1, 161, textureX, textureY); // Box 401
		drgcomboModel[367] = new ModelRendererTurbo(this, 225, 169, textureX, textureY); // Box 402
		drgcomboModel[368] = new ModelRendererTurbo(this, 401, 169, textureX, textureY); // Box 403
		drgcomboModel[369] = new ModelRendererTurbo(this, 57, 177, textureX, textureY); // Box 404
		drgcomboModel[370] = new ModelRendererTurbo(this, 281, 177, textureX, textureY); // Box 405
		drgcomboModel[371] = new ModelRendererTurbo(this, 273, 153, textureX, textureY); // Box 406
		drgcomboModel[372] = new ModelRendererTurbo(this, 401, 161, textureX, textureY); // Box 407
		drgcomboModel[373] = new ModelRendererTurbo(this, 137, 169, textureX, textureY); // Box 408
		drgcomboModel[374] = new ModelRendererTurbo(this, 17, 177, textureX, textureY); // Box 409
		drgcomboModel[375] = new ModelRendererTurbo(this, 313, 177, textureX, textureY); // Box 410
		drgcomboModel[376] = new ModelRendererTurbo(this, 329, 177, textureX, textureY); // Box 411
		drgcomboModel[377] = new ModelRendererTurbo(this, 337, 177, textureX, textureY); // Box 412
		drgcomboModel[378] = new ModelRendererTurbo(this, 441, 177, textureX, textureY); // Box 413
		drgcomboModel[379] = new ModelRendererTurbo(this, 465, 177, textureX, textureY); // Box 414
		drgcomboModel[380] = new ModelRendererTurbo(this, 233, 177, textureX, textureY); // Box 415
		drgcomboModel[381] = new ModelRendererTurbo(this, 113, 153, textureX, textureY); // Box 416
		drgcomboModel[382] = new ModelRendererTurbo(this, 457, 153, textureX, textureY); // Box 418
		drgcomboModel[383] = new ModelRendererTurbo(this, 9, 161, textureX, textureY); // Box 419
		drgcomboModel[384] = new ModelRendererTurbo(this, 137, 129, textureX, textureY); // Box 420
		drgcomboModel[385] = new ModelRendererTurbo(this, 265, 129, textureX, textureY); // Box 421
		drgcomboModel[386] = new ModelRendererTurbo(this, 297, 145, textureX, textureY); // Box 422
		drgcomboModel[387] = new ModelRendererTurbo(this, 321, 161, textureX, textureY); // Box 423
		drgcomboModel[388] = new ModelRendererTurbo(this, 369, 161, textureX, textureY); // Box 424
		drgcomboModel[389] = new ModelRendererTurbo(this, 417, 161, textureX, textureY); // Box 425
		drgcomboModel[390] = new ModelRendererTurbo(this, 433, 161, textureX, textureY); // Box 426
		drgcomboModel[391] = new ModelRendererTurbo(this, 9, 169, textureX, textureY); // Box 427
		drgcomboModel[392] = new ModelRendererTurbo(this, 489, 177, textureX, textureY); // Box 428
		drgcomboModel[393] = new ModelRendererTurbo(this, 1, 185, textureX, textureY); // Box 429
		drgcomboModel[394] = new ModelRendererTurbo(this, 137, 177, textureX, textureY); // Box 430
		drgcomboModel[395] = new ModelRendererTurbo(this, 25, 185, textureX, textureY); // Box 431
		drgcomboModel[396] = new ModelRendererTurbo(this, 361, 177, textureX, textureY); // Box 432
		drgcomboModel[397] = new ModelRendererTurbo(this, 249, 185, textureX, textureY); // Box 433
		drgcomboModel[398] = new ModelRendererTurbo(this, 97, 169, textureX, textureY); // Box 434
		drgcomboModel[399] = new ModelRendererTurbo(this, 281, 185, textureX, textureY); // Box 435
		drgcomboModel[400] = new ModelRendererTurbo(this, 121, 169, textureX, textureY); // Box 436
		drgcomboModel[401] = new ModelRendererTurbo(this, 97, 185, textureX, textureY); // Box 437
		drgcomboModel[402] = new ModelRendererTurbo(this, 369, 185, textureX, textureY); // Box 438
		drgcomboModel[403] = new ModelRendererTurbo(this, 161, 185, textureX, textureY); // Box 427
		drgcomboModel[404] = new ModelRendererTurbo(this, 169, 185, textureX, textureY); // Box 428
		drgcomboModel[405] = new ModelRendererTurbo(this, 225, 185, textureX, textureY); // Box 429
		drgcomboModel[406] = new ModelRendererTurbo(this, 313, 185, textureX, textureY); // Box 430
		drgcomboModel[407] = new ModelRendererTurbo(this, 321, 185, textureX, textureY); // Box 431
		drgcomboModel[408] = new ModelRendererTurbo(this, 329, 185, textureX, textureY); // Box 432
		drgcomboModel[409] = new ModelRendererTurbo(this, 401, 185, textureX, textureY); // Box 433
		drgcomboModel[410] = new ModelRendererTurbo(this, 409, 185, textureX, textureY); // Box 434
		drgcomboModel[411] = new ModelRendererTurbo(this, 417, 185, textureX, textureY); // Box 435
		drgcomboModel[412] = new ModelRendererTurbo(this, 425, 185, textureX, textureY); // Box 436
		drgcomboModel[413] = new ModelRendererTurbo(this, 81, 169, textureX, textureY); // Box 437
		drgcomboModel[414] = new ModelRendererTurbo(this, 457, 177, textureX, textureY); // Box 438
		drgcomboModel[415] = new ModelRendererTurbo(this, 385, 57, textureX, textureY); // Box 440
		drgcomboModel[416] = new ModelRendererTurbo(this, 241, 177, textureX, textureY); // Box 440
		drgcomboModel[417] = new ModelRendererTurbo(this, 305, 177, textureX, textureY); // Box 441
		drgcomboModel[418] = new ModelRendererTurbo(this, 457, 185, textureX, textureY); // Box 442
		drgcomboModel[419] = new ModelRendererTurbo(this, 473, 185, textureX, textureY); // Box 443
		drgcomboModel[420] = new ModelRendererTurbo(this, 489, 185, textureX, textureY); // Box 444
		drgcomboModel[421] = new ModelRendererTurbo(this, 81, 193, textureX, textureY); // Box 445
		drgcomboModel[422] = new ModelRendererTurbo(this, 353, 177, textureX, textureY); // Box 446
		drgcomboModel[423] = new ModelRendererTurbo(this, 481, 177, textureX, textureY); // Box 447
		drgcomboModel[424] = new ModelRendererTurbo(this, 129, 185, textureX, textureY); // Box 452
		drgcomboModel[425] = new ModelRendererTurbo(this, 273, 185, textureX, textureY); // Box 453
		drgcomboModel[426] = new ModelRendererTurbo(this, 105, 193, textureX, textureY); // Box 455
		drgcomboModel[427] = new ModelRendererTurbo(this, 121, 193, textureX, textureY); // Box 457
		drgcomboModel[428] = new ModelRendererTurbo(this, 177, 193, textureX, textureY); // Box 458
		drgcomboModel[429] = new ModelRendererTurbo(this, 129, 193, textureX, textureY); // Box 427
		drgcomboModel[430] = new ModelRendererTurbo(this, 161, 169, textureX, textureY); // Box 432
		drgcomboModel[431] = new ModelRendererTurbo(this, 185, 193, textureX, textureY); // Box 453
		drgcomboModel[432] = new ModelRendererTurbo(this, 1, 177, textureX, textureY); // Box 454
		drgcomboModel[433] = new ModelRendererTurbo(this, 201, 193, textureX, textureY); // Box 455
		drgcomboModel[434] = new ModelRendererTurbo(this, 489, 177, textureX, textureY); // Box 456
		drgcomboModel[435] = new ModelRendererTurbo(this, 233, 193, textureX, textureY); // Box 457
		drgcomboModel[436] = new ModelRendererTurbo(this, 505, 177, textureX, textureY); // Box 458
		drgcomboModel[437] = new ModelRendererTurbo(this, 249, 193, textureX, textureY); // Box 459
		drgcomboModel[438] = new ModelRendererTurbo(this, 17, 185, textureX, textureY); // Box 460
		drgcomboModel[439] = new ModelRendererTurbo(this, 217, 193, textureX, textureY); // Box 463
		drgcomboModel[440] = new ModelRendererTurbo(this, 265, 193, textureX, textureY); // Box 464
		drgcomboModel[441] = new ModelRendererTurbo(this, 281, 193, textureX, textureY); // Box 465
		drgcomboModel[442] = new ModelRendererTurbo(this, 25, 65, textureX, textureY); // Box 466
		drgcomboModel[443] = new ModelRendererTurbo(this, 297, 193, textureX, textureY); // Box 467
		drgcomboModel[444] = new ModelRendererTurbo(this, 329, 193, textureX, textureY); // Box 468
		drgcomboModel[445] = new ModelRendererTurbo(this, 377, 190, textureX, textureY); // Box 469
		drgcomboModel[446] = new ModelRendererTurbo(this, 370, 189, textureX, textureY); // Box 471
		drgcomboModel[447] = new ModelRendererTurbo(this, 370, 189, textureX, textureY); // Box 472
		drgcomboModel[448] = new ModelRendererTurbo(this, 370, 189, textureX, textureY); // Box 473
		drgcomboModel[449] = new ModelRendererTurbo(this, 370, 189, textureX, textureY); // Box 474
		drgcomboModel[450] = new ModelRendererTurbo(this, 377, 190, textureX, textureY); // Box 475
		drgcomboModel[451] = new ModelRendererTurbo(this, 301, 81, textureX, textureY); // Box 478
		drgcomboModel[452] = new ModelRendererTurbo(this, 241, 81, textureX, textureY); // Box 479
		drgcomboModel[453] = new ModelRendererTurbo(this, 257, 81, textureX, textureY); // Box 480
		drgcomboModel[454] = new ModelRendererTurbo(this, 209, 89, textureX, textureY); // Box 481
		drgcomboModel[455] = new ModelRendererTurbo(this, 169, 89, textureX, textureY); // Box 482
		drgcomboModel[456] = new ModelRendererTurbo(this, 137, 89, textureX, textureY); // Box 483
		drgcomboModel[457] = new ModelRendererTurbo(this, 471, 81, textureX, textureY); // Box 484
		drgcomboModel[458] = new ModelRendererTurbo(this, 471, 81, textureX, textureY); // Box 485
		drgcomboModel[459] = new ModelRendererTurbo(this, 377, 81, textureX, textureY); // Box 486
		drgcomboModel[460] = new ModelRendererTurbo(this, 441, 81, textureX, textureY); // Box 487
		drgcomboModel[461] = new ModelRendererTurbo(this, 345, 81, textureX, textureY); // Box 488
		drgcomboModel[462] = new ModelRendererTurbo(this, 492, 242, textureX, textureY); // Box 515
		drgcomboModel[463] = new ModelRendererTurbo(this, 464, 247, textureX, textureY); // Box 517
		drgcomboModel[464] = new ModelRendererTurbo(this, 492, 246, textureX, textureY); // Box 520
		drgcomboModel[465] = new ModelRendererTurbo(this, 475, 235, textureX, textureY); // Box 525
		drgcomboModel[466] = new ModelRendererTurbo(this, 484, 240, textureX, textureY); // Box 527
		drgcomboModel[467] = new ModelRendererTurbo(this, 484, 237, textureX, textureY); // Box 528
		drgcomboModel[468] = new ModelRendererTurbo(this, 484, 246, textureX, textureY); // Box 529
		drgcomboModel[469] = new ModelRendererTurbo(this, 484, 243, textureX, textureY); // Box 530
		drgcomboModel[470] = new ModelRendererTurbo(this, 475, 235, textureX, textureY); // Box 477
		drgcomboModel[471] = new ModelRendererTurbo(this, 484, 240, textureX, textureY); // Box 478
		drgcomboModel[472] = new ModelRendererTurbo(this, 484, 243, textureX, textureY); // Box 479
		drgcomboModel[473] = new ModelRendererTurbo(this, 484, 246, textureX, textureY); // Box 480
		drgcomboModel[474] = new ModelRendererTurbo(this, 492, 246, textureX, textureY); // Box 481
		drgcomboModel[475] = new ModelRendererTurbo(this, 492, 242, textureX, textureY); // Box 482
		drgcomboModel[476] = new ModelRendererTurbo(this, 464, 247, textureX, textureY); // Box 483
		drgcomboModel[477] = new ModelRendererTurbo(this, 484, 237, textureX, textureY); // Box 484
		drgcomboModel[478] = new ModelRendererTurbo(this, 417, 185, textureX, textureY); // Box 478
		drgcomboModel[479] = new ModelRendererTurbo(this, 417, 185, textureX, textureY); // Box 479
		drgcomboModel[480] = new ModelRendererTurbo(this, 417, 185, textureX, textureY); // Box 480
		drgcomboModel[481] = new ModelRendererTurbo(this, 417, 185, textureX, textureY); // Box 481
		drgcomboModel[482] = new ModelRendererTurbo(this, 417, 185, textureX, textureY); // Box 482
		drgcomboModel[483] = new ModelRendererTurbo(this, 417, 185, textureX, textureY); // Box 483
		drgcomboModel[484] = new ModelRendererTurbo(this, 417, 185, textureX, textureY); // Box 484
		drgcomboModel[485] = new ModelRendererTurbo(this, 417, 185, textureX, textureY); // Box 485
		drgcomboModel[486] = new ModelRendererTurbo(this, 417, 185, textureX, textureY); // Box 486
		drgcomboModel[487] = new ModelRendererTurbo(this, 417, 185, textureX, textureY); // Box 487
		drgcomboModel[488] = new ModelRendererTurbo(this, 417, 185, textureX, textureY); // Box 488
		drgcomboModel[489] = new ModelRendererTurbo(this, 417, 185, textureX, textureY); // Box 489
		drgcomboModel[490] = new ModelRendererTurbo(this, 417, 185, textureX, textureY); // Box 490
		drgcomboModel[491] = new ModelRendererTurbo(this, 417, 185, textureX, textureY); // Box 491
		drgcomboModel[492] = new ModelRendererTurbo(this, 417, 185, textureX, textureY); // Box 492
		drgcomboModel[493] = new ModelRendererTurbo(this, 417, 185, textureX, textureY); // Box 493
		drgcomboModel[494] = new ModelRendererTurbo(this, 417, 185, textureX, textureY); // Box 494
		drgcomboModel[495] = new ModelRendererTurbo(this, 417, 185, textureX, textureY); // Box 495
		drgcomboModel[496] = new ModelRendererTurbo(this, 417, 185, textureX, textureY); // Box 496
		drgcomboModel[497] = new ModelRendererTurbo(this, 417, 185, textureX, textureY); // Box 497
		drgcomboModel[498] = new ModelRendererTurbo(this, -8, 226, textureX, textureY); // Box 476
		drgcomboModel[499] = new ModelRendererTurbo(this, 1, 226, textureX, textureY); // Box 477
		drgcomboModel[500] = new ModelRendererTurbo(this, 0, 241, textureX, textureY); // Box 489
		drgcomboModel[501] = new ModelRendererTurbo(this, 0, 241, textureX, textureY); // Box 490
		drgcomboModel[502] = new ModelRendererTurbo(this, 0, 241, textureX, textureY); // Box 491
		drgcomboModel[503] = new ModelRendererTurbo(this, 0, 241, textureX, textureY); // Box 493
		drgcomboModel[504] = new ModelRendererTurbo(this, 0, 241, textureX, textureY); // Box 494
		drgcomboModel[505] = new ModelRendererTurbo(this, 0, 241, textureX, textureY); // Box 495
		drgcomboModel[506] = new ModelRendererTurbo(this, 0, 241, textureX, textureY); // Box 496
		drgcomboModel[507] = new ModelRendererTurbo(this, 0, 241, textureX, textureY); // Box 497
		drgcomboModel[508] = new ModelRendererTurbo(this, 0, 241, textureX, textureY); // Box 498
		drgcomboModel[509] = new ModelRendererTurbo(this, 0, 241, textureX, textureY); // Box 499
		drgcomboModel[510] = new ModelRendererTurbo(this, 0, 241, textureX, textureY); // Box 500
		drgcomboModel[511] = new ModelRendererTurbo(this, 0, 241, textureX, textureY); // Box 501
		drgcomboModel[512] = new ModelRendererTurbo(this, 0, 241, textureX, textureY); // Box 502
		drgcomboModel[513] = new ModelRendererTurbo(this, 0, 241, textureX, textureY); // Box 507
		drgcomboModel[514] = new ModelRendererTurbo(this, 0, 241, textureX, textureY); // Box 508
		drgcomboModel[515] = new ModelRendererTurbo(this, 0, 241, textureX, textureY); // Box 514
		drgcomboModel[516] = new ModelRendererTurbo(this, -8, 226, textureX, textureY); // Box 515
		drgcomboModel[517] = new ModelRendererTurbo(this, 0, 241, textureX, textureY); // Box 516
		drgcomboModel[518] = new ModelRendererTurbo(this, 0, 241, textureX, textureY); // Box 517
		drgcomboModel[519] = new ModelRendererTurbo(this, 0, 241, textureX, textureY); // Box 518
		drgcomboModel[520] = new ModelRendererTurbo(this, 0, 241, textureX, textureY); // Box 519
		drgcomboModel[521] = new ModelRendererTurbo(this, 0, 241, textureX, textureY); // Box 520
		drgcomboModel[522] = new ModelRendererTurbo(this, 0, 241, textureX, textureY); // Box 521
		drgcomboModel[523] = new ModelRendererTurbo(this, 0, 241, textureX, textureY); // Box 522
		drgcomboModel[524] = new ModelRendererTurbo(this, 1, 226, textureX, textureY); // Box 523
		drgcomboModel[525] = new ModelRendererTurbo(this, 0, 241, textureX, textureY); // Box 524
		drgcomboModel[526] = new ModelRendererTurbo(this, 0, 241, textureX, textureY); // Box 525
		drgcomboModel[527] = new ModelRendererTurbo(this, 0, 241, textureX, textureY); // Box 526
		drgcomboModel[528] = new ModelRendererTurbo(this, 0, 241, textureX, textureY); // Box 527
		drgcomboModel[529] = new ModelRendererTurbo(this, 0, 241, textureX, textureY); // Box 528
		drgcomboModel[530] = new ModelRendererTurbo(this, 0, 241, textureX, textureY); // Box 529
		drgcomboModel[531] = new ModelRendererTurbo(this, 0, 241, textureX, textureY); // Box 530
		drgcomboModel[532] = new ModelRendererTurbo(this, 0, 241, textureX, textureY); // Box 548
		drgcomboModel[533] = new ModelRendererTurbo(this, 0, 241, textureX, textureY); // Box 549
		drgcomboModel[534] = new ModelRendererTurbo(this, 0, 241, textureX, textureY); // Box 550
		drgcomboModel[535] = new ModelRendererTurbo(this, 0, 241, textureX, textureY); // Box 551
		drgcomboModel[536] = new ModelRendererTurbo(this, 0, 241, textureX, textureY); // Box 552
		drgcomboModel[537] = new ModelRendererTurbo(this, 0, 241, textureX, textureY); // Box 553
		drgcomboModel[538] = new ModelRendererTurbo(this, 0, 241, textureX, textureY); // Box 554
		drgcomboModel[539] = new ModelRendererTurbo(this, -8, 226, textureX, textureY); // Box 555
		drgcomboModel[540] = new ModelRendererTurbo(this, 0, 241, textureX, textureY); // Box 556
		drgcomboModel[541] = new ModelRendererTurbo(this, 0, 241, textureX, textureY); // Box 557
		drgcomboModel[542] = new ModelRendererTurbo(this, 0, 241, textureX, textureY); // Box 558
		drgcomboModel[543] = new ModelRendererTurbo(this, 0, 241, textureX, textureY); // Box 559
		drgcomboModel[544] = new ModelRendererTurbo(this, 0, 241, textureX, textureY); // Box 560
		drgcomboModel[545] = new ModelRendererTurbo(this, 0, 241, textureX, textureY); // Box 561
		drgcomboModel[546] = new ModelRendererTurbo(this, 0, 241, textureX, textureY); // Box 562
		drgcomboModel[547] = new ModelRendererTurbo(this, 0, 241, textureX, textureY); // Box 563
		drgcomboModel[548] = new ModelRendererTurbo(this, 1, 226, textureX, textureY); // Box 564
		drgcomboModel[549] = new ModelRendererTurbo(this, 417, 73, textureX, textureY); // Box 559
		drgcomboModel[550] = new ModelRendererTurbo(this, 337, 129, textureX, textureY); // Box 560
		drgcomboModel[551] = new ModelRendererTurbo(this, 345, 129, textureX, textureY); // Box 561
		drgcomboModel[552] = new ModelRendererTurbo(this, 377, 190, textureX, textureY); // Box 562
		drgcomboModel[553] = new ModelRendererTurbo(this, 370, 189, textureX, textureY); // Box 563
		drgcomboModel[554] = new ModelRendererTurbo(this, 370, 189, textureX, textureY); // Box 564
		drgcomboModel[555] = new ModelRendererTurbo(this, 313, 129, textureX, textureY); // Box 565
		drgcomboModel[556] = new ModelRendererTurbo(this, 417, 73, textureX, textureY); // Box 566
		drgcomboModel[557] = new ModelRendererTurbo(this, 289, 129, textureX, textureY); // Box 567
		drgcomboModel[558] = new ModelRendererTurbo(this, 225, 129, textureX, textureY); // Box 568

		drgcomboModel[0].addBox(0F, 0F, 0F, 6, 6, 0, 0F); // Box 0
		drgcomboModel[0].setRotationPoint(37F, 4F, -5F);

		drgcomboModel[1].addBox(0F, 0F, 0F, 6, 6, 0, 0F); // Box 2
		drgcomboModel[1].setRotationPoint(37F, 4F, 5F);

		drgcomboModel[2].addBox(0F, 0F, 0F, 2, 1, 20, 0F); // Box 3
		drgcomboModel[2].setRotationPoint(-54F, 2F, -10F);

		drgcomboModel[3].addBox(0F, 0F, 0F, 6, 6, 0, 0F); // Box 4
		drgcomboModel[3].setRotationPoint(26F, 4F, 5F);

		drgcomboModel[4].addBox(0F, 0F, 0F, 6, 6, 0, 0F); // Box 5
		drgcomboModel[4].setRotationPoint(26F, 4F, -5F);

		drgcomboModel[5].addBox(0F, 0F, 0F, 1, 10, 6, 0F); // Box 21
		drgcomboModel[5].setRotationPoint(-44F, -8F, -9F);

		drgcomboModel[6].addBox(0F, 0F, 0F, 1, 10, 6, 0F); // Box 22
		drgcomboModel[6].setRotationPoint(-44F, -8F, 3F);

		drgcomboModel[7].addShapeBox(0F, 0F, 0F, 54, 10, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 23
		drgcomboModel[7].setRotationPoint(-44F, -8F, 9F);

		drgcomboModel[8].addShapeBox(0F, 0F, 0F, 4, 9, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 26
		drgcomboModel[8].setRotationPoint(-44F, -17F, 9F);

		drgcomboModel[9].addBox(0F, 0F, 0F, 1, 9, 2, 0F); // Box 36
		drgcomboModel[9].setRotationPoint(-44F, -17F, -5F);

		drgcomboModel[10].addBox(0F, 0F, 0F, 1, 9, 2, 0F); // Box 37
		drgcomboModel[10].setRotationPoint(-44F, -17F, 7F);

		drgcomboModel[11].addBox(0F, 0F, 0F, 1, 9, 2, 0F); // Box 38
		drgcomboModel[11].setRotationPoint(-44F, -17F, 3F);

		drgcomboModel[12].addBox(0F, 0F, 0F, 1, 9, 2, 0F); // Box 40
		drgcomboModel[12].setRotationPoint(-44F, -17F, -9F);

		drgcomboModel[13].addShapeBox(0F, 0F, 0F, 90, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 54
		drgcomboModel[13].setRotationPoint(-44F, -20F, 9F);

		drgcomboModel[14].addBox(0F, 0F, 0F, 1, 3, 18, 0F); // Box 55
		drgcomboModel[14].setRotationPoint(-44F, -20F, -9F);

		drgcomboModel[15].addBox(0F, 0F, 0F, 1, 9, 1, 0F); // Box 65
		drgcomboModel[15].setRotationPoint(-53F, -7F, -10F);

		drgcomboModel[16].addBox(0F, 0F, 0F, 1, 9, 1, 0F); // Box 67
		drgcomboModel[16].setRotationPoint(-53F, -7F, -7F);

		drgcomboModel[17].addBox(0F, 0F, 0F, 1, 9, 1, 0F); // Box 68
		drgcomboModel[17].setRotationPoint(-53F, -7F, -4F);

		drgcomboModel[18].addBox(0F, 0F, 0F, 1, 9, 1, 0F); // Box 69
		drgcomboModel[18].setRotationPoint(-53F, -7F, 3F);

		drgcomboModel[19].addBox(0F, 0F, 0F, 1, 9, 1, 0F); // Box 70
		drgcomboModel[19].setRotationPoint(-53F, -7F, 6F);

		drgcomboModel[20].addBox(0F, 0F, 0F, 1, 9, 1, 0F); // Box 71
		drgcomboModel[20].setRotationPoint(-53F, -7F, 9F);

		drgcomboModel[21].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 72
		drgcomboModel[21].setRotationPoint(-52F, -8F, -3F);
		drgcomboModel[21].rotateAngleY = -3.14159265F;

		drgcomboModel[22].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		drgcomboModel[22].setRotationPoint(-52F, -8F, 10F);
		drgcomboModel[22].rotateAngleY = -3.14159265F;

		drgcomboModel[23].addBox(0F, 0F, 0F, 6, 6, 0, 0F); // Box 65
		drgcomboModel[23].setRotationPoint(-41F, 4F, -5F);

		drgcomboModel[24].addBox(0F, 0F, 0F, 6, 6, 0, 0F); // Box 66
		drgcomboModel[24].setRotationPoint(-30F, 4F, -5F);

		drgcomboModel[25].addBox(0F, 0F, 0F, 6, 6, 0, 0F); // Box 68
		drgcomboModel[25].setRotationPoint(-41F, 4F, 5F);

		drgcomboModel[26].addBox(0F, 0F, 0F, 6, 6, 0, 0F); // Box 69
		drgcomboModel[26].setRotationPoint(-30F, 4F, 5F);

		drgcomboModel[27].addBox(0F, 0F, 0F, 4, 9, 1, 0F); // Box 71
		drgcomboModel[27].setRotationPoint(-35F, -17F, 9F);

		drgcomboModel[28].addBox(0F, 0F, 0F, 4, 9, 1, 0F); // Box 72
		drgcomboModel[28].setRotationPoint(-26F, -17F, 9F);

		drgcomboModel[29].addBox(0F, 0F, 0F, 4, 9, 1, 0F); // Box 73
		drgcomboModel[29].setRotationPoint(-17F, -17F, 9F);

		drgcomboModel[30].addBox(0F, 0F, 0F, 4, 9, 1, 0F); // Box 74
		drgcomboModel[30].setRotationPoint(-8F, -17F, 9F);

		drgcomboModel[31].addBox(0F, 0F, 0F, 4, 9, 1, 0F); // Box 75
		drgcomboModel[31].setRotationPoint(1F, -17F, 9F);

		drgcomboModel[32].addBox(0F, 0F, 0F, 11, 19, 1, 0F); // Box 76
		drgcomboModel[32].setRotationPoint(10F, -17F, 9F);

		drgcomboModel[33].addShapeBox(0F, 0F, 0F, 12, 19, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 79
		drgcomboModel[33].setRotationPoint(34F, -17F, 9F);

		drgcomboModel[34].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Box 91
		drgcomboModel[34].setRotationPoint(-53F, -6F, -3F);

		drgcomboModel[35].addShapeBox(0F, 0F, 0F, 54, 10, 1, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 94
		drgcomboModel[35].setRotationPoint(-44F, -8F, -10F);

		drgcomboModel[36].addBox(0F, 0F, 0F, 1, 10, 6, 0F); // Box 95
		drgcomboModel[36].setRotationPoint(45F, -8F, -9F);

		drgcomboModel[37].addBox(0F, 0F, 0F, 1, 10, 6, 0F); // Box 96
		drgcomboModel[37].setRotationPoint(45F, -8F, 3F);

		drgcomboModel[38].addBox(0F, 0F, 0F, 1, 3, 18, 0F); // Box 97
		drgcomboModel[38].setRotationPoint(45F, -20F, -9F);

		drgcomboModel[39].addBox(0F, 0F, 0F, 1, 9, 2, 0F); // Box 98
		drgcomboModel[39].setRotationPoint(45F, -17F, 7F);

		drgcomboModel[40].addBox(0F, 0F, 0F, 1, 9, 2, 0F); // Box 99
		drgcomboModel[40].setRotationPoint(45F, -17F, 3F);

		drgcomboModel[41].addBox(0F, 0F, 0F, 1, 9, 2, 0F); // Box 100
		drgcomboModel[41].setRotationPoint(45F, -17F, -5F);

		drgcomboModel[42].addBox(0F, 0F, 0F, 1, 9, 2, 0F); // Box 101
		drgcomboModel[42].setRotationPoint(45F, -17F, -9F);

		drgcomboModel[43].addShapeBox(0F, 0F, 0F, 12, 19, 1, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 102
		drgcomboModel[43].setRotationPoint(34F, -17F, -10F);

		drgcomboModel[44].addShapeBox(0F, 0F, 0F, 90, 3, 1, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 103
		drgcomboModel[44].setRotationPoint(-44F, -20F, -10F);

		drgcomboModel[45].addShapeBox(0F, 0F, 0F, 4, 9, 1, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 104
		drgcomboModel[45].setRotationPoint(-44F, -17F, -10F);

		drgcomboModel[46].addBox(0F, 0F, 0F, 4, 9, 1, 0F); // Box 108
		drgcomboModel[46].setRotationPoint(-35F, -17F, -10F);

		drgcomboModel[47].addBox(0F, 0F, 0F, 4, 9, 1, 0F); // Box 109
		drgcomboModel[47].setRotationPoint(-26F, -17F, -10F);

		drgcomboModel[48].addBox(0F, 0F, 0F, 4, 9, 1, 0F); // Box 110
		drgcomboModel[48].setRotationPoint(-17F, -17F, -10F);

		drgcomboModel[49].addBox(0F, 0F, 0F, 4, 9, 1, 0F); // Box 111
		drgcomboModel[49].setRotationPoint(-8F, -17F, -10F);

		drgcomboModel[50].addBox(0F, 0F, 0F, 4, 9, 1, 0F); // Box 112
		drgcomboModel[50].setRotationPoint(1F, -17F, -10F);

		drgcomboModel[51].addBox(0F, 0F, 0F, 1, 9, 1, 0F); // Box 128
		drgcomboModel[51].setRotationPoint(54F, -7F, 9F);

		drgcomboModel[52].addBox(0F, 0F, 0F, 1, 9, 1, 0F); // Box 129
		drgcomboModel[52].setRotationPoint(54F, -7F, 6F);

		drgcomboModel[53].addBox(0F, 0F, 0F, 1, 9, 1, 0F); // Box 130
		drgcomboModel[53].setRotationPoint(54F, -7F, 3F);

		drgcomboModel[54].addBox(0F, 0F, 0F, 1, 9, 1, 0F); // Box 131
		drgcomboModel[54].setRotationPoint(54F, -7F, -10F);

		drgcomboModel[55].addBox(0F, 0F, 0F, 1, 9, 1, 0F); // Box 132
		drgcomboModel[55].setRotationPoint(54F, -7F, -7F);

		drgcomboModel[56].addBox(0F, 0F, 0F, 1, 9, 1, 0F); // Box 133
		drgcomboModel[56].setRotationPoint(54F, -7F, -4F);

		drgcomboModel[57].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 134
		drgcomboModel[57].setRotationPoint(55F, -8F, 10F);
		drgcomboModel[57].rotateAngleY = -3.14159265F;

		drgcomboModel[58].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 135
		drgcomboModel[58].setRotationPoint(55F, -8F, -3F);
		drgcomboModel[58].rotateAngleY = -3.14159265F;

		drgcomboModel[59].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Box 136
		drgcomboModel[59].setRotationPoint(54F, -6F, -3F);

		drgcomboModel[60].addBox(0F, 0F, 0F, 90, 1, 20, 0F); // Box 137
		drgcomboModel[60].setRotationPoint(-44F, 2F, -10F);

		drgcomboModel[61].addBox(0F, 0F, 0F, 2, 1, 20, 0F); // Box 138
		drgcomboModel[61].setRotationPoint(54F, 2F, -10F);

		drgcomboModel[62].addBox(0F, 0F, 0F, 1, 1, 20, 0F); // Box 139
		drgcomboModel[62].setRotationPoint(-52F, 2F, -10F);

		drgcomboModel[63].addBox(0F, 0F, 0F, 1, 1, 20, 0F); // Box 140
		drgcomboModel[63].setRotationPoint(-45F, 2F, -10F);

		drgcomboModel[64].addBox(0F, 0F, 0F, 6, 1, 12, 0F); // Box 141
		drgcomboModel[64].setRotationPoint(-51F, 2F, -6F);

		drgcomboModel[65].addBox(0F, 0F, 0F, 6, 1, 2, 0F); // Box 143
		drgcomboModel[65].setRotationPoint(-51F, 4.5F, -8F);

		drgcomboModel[66].addBox(0F, 0F, 0F, 6, 1, 3, 0F); // Box 145
		drgcomboModel[66].setRotationPoint(-51F, 7F, -10F);

		drgcomboModel[67].addBox(0F, 0F, 0F, 1, 3, 5, 0F); // Box 146
		drgcomboModel[67].setRotationPoint(-52F, 3F, -10F);

		drgcomboModel[68].addBox(0F, 0F, 0F, 1, 2, 3, 0F); // Box 147
		drgcomboModel[68].setRotationPoint(-52F, 6F, -10F);

		drgcomboModel[69].addBox(0F, 0F, 0F, 6, 1, 12, 0F); // Box 158
		drgcomboModel[69].setRotationPoint(47F, 2F, -6F);

		drgcomboModel[70].addBox(0F, 0F, 0F, 1, 1, 20, 0F); // Box 159
		drgcomboModel[70].setRotationPoint(53F, 2F, -10F);

		drgcomboModel[71].addBox(0F, 0F, 0F, 1, 1, 20, 0F); // Box 160
		drgcomboModel[71].setRotationPoint(46F, 2F, -10F);

		drgcomboModel[72].addBox(0F, 0F, 0F, 1, 3, 5, 0F); // Box 171
		drgcomboModel[72].setRotationPoint(-45F, 3F, -10F);

		drgcomboModel[73].addBox(0F, 0F, 0F, 1, 2, 3, 0F); // Box 172
		drgcomboModel[73].setRotationPoint(-45F, 6F, -10F);

		drgcomboModel[74].addBox(0F, 0F, 0F, 6, 3, 1, 0F); // Box 173
		drgcomboModel[74].setRotationPoint(-51F, 3F, -6F);

		drgcomboModel[75].addBox(0F, 0F, 0F, 6, 2, 1, 0F); // Box 174
		drgcomboModel[75].setRotationPoint(-51F, 5.5F, -8F);

		drgcomboModel[76].addBox(0F, 0F, 0F, 6, 1, 1, 0F); // Box 175
		drgcomboModel[76].setRotationPoint(-51F, 5F, -7F);

		drgcomboModel[77].addBox(0F, 0F, 0F, 6, 3, 1, 0F); // Box 176
		drgcomboModel[77].setRotationPoint(-51F, 3F, 5F);

		drgcomboModel[78].addBox(0F, 0F, 0F, 6, 1, 2, 0F); // Box 177
		drgcomboModel[78].setRotationPoint(-51F, 4.5F, 6F);

		drgcomboModel[79].addBox(0F, 0F, 0F, 6, 2, 1, 0F); // Box 178
		drgcomboModel[79].setRotationPoint(-51F, 5.5F, 7F);

		drgcomboModel[80].addBox(0F, 0F, 0F, 6, 1, 3, 0F); // Box 179
		drgcomboModel[80].setRotationPoint(-51F, 7F, 7F);

		drgcomboModel[81].addBox(0F, 0F, 0F, 1, 3, 5, 0F); // Box 180
		drgcomboModel[81].setRotationPoint(-45F, 3F, 5F);

		drgcomboModel[82].addBox(0F, 0F, 0F, 1, 2, 3, 0F); // Box 181
		drgcomboModel[82].setRotationPoint(-45F, 6F, 7F);

		drgcomboModel[83].addBox(0F, 0F, 0F, 1, 3, 5, 0F); // Box 182
		drgcomboModel[83].setRotationPoint(-52F, 3F, 5F);

		drgcomboModel[84].addBox(0F, 0F, 0F, 1, 2, 3, 0F); // Box 183
		drgcomboModel[84].setRotationPoint(-52F, 6F, 7F);

		drgcomboModel[85].addBox(0F, 0F, 0F, 1, 1, 20, 0F); // Box 184
		drgcomboModel[85].setRotationPoint(-54F, 3F, -10F);

		drgcomboModel[86].addBox(0F, 0F, 0F, 1, 1, 20, 0F); // Box 185
		drgcomboModel[86].setRotationPoint(55F, 3F, -10F);

		drgcomboModel[87].addBox(0F, 0F, 0F, 6, 3, 1, 0F); // Box 186
		drgcomboModel[87].setRotationPoint(47F, 3F, -6F);

		drgcomboModel[88].addBox(0F, 0F, 0F, 6, 1, 2, 0F); // Box 187
		drgcomboModel[88].setRotationPoint(47F, 4.5F, -8F);

		drgcomboModel[89].addBox(0F, 0F, 0F, 6, 2, 1, 0F); // Box 188
		drgcomboModel[89].setRotationPoint(47F, 5.5F, -8F);

		drgcomboModel[90].addBox(0F, 0F, 0F, 6, 1, 3, 0F); // Box 189
		drgcomboModel[90].setRotationPoint(47F, 7F, -10F);

		drgcomboModel[91].addBox(0F, 0F, 0F, 1, 3, 5, 0F); // Box 190
		drgcomboModel[91].setRotationPoint(46F, 3F, -10F);

		drgcomboModel[92].addBox(0F, 0F, 0F, 6, 1, 1, 0F); // Box 191
		drgcomboModel[92].setRotationPoint(-51F, 5F, 6F);

		drgcomboModel[93].addBox(0F, 0F, 0F, 6, 1, 1, 0F); // Box 192
		drgcomboModel[93].setRotationPoint(47F, 5F, -7F);

		drgcomboModel[94].addBox(0F, 0F, 0F, 1, 2, 3, 0F); // Box 193
		drgcomboModel[94].setRotationPoint(46F, 6F, -10F);

		drgcomboModel[95].addBox(0F, 0F, 0F, 1, 3, 5, 0F); // Box 194
		drgcomboModel[95].setRotationPoint(53F, 3F, -10F);

		drgcomboModel[96].addBox(0F, 0F, 0F, 1, 2, 3, 0F); // Box 195
		drgcomboModel[96].setRotationPoint(53F, 6F, -10F);

		drgcomboModel[97].addBox(0F, 0F, 0F, 6, 3, 1, 0F); // Box 196
		drgcomboModel[97].setRotationPoint(47F, 3F, 5F);

		drgcomboModel[98].addBox(0F, 0F, 0F, 6, 1, 1, 0F); // Box 197
		drgcomboModel[98].setRotationPoint(47F, 5F, 6F);

		drgcomboModel[99].addBox(0F, 0F, 0F, 6, 2, 1, 0F); // Box 198
		drgcomboModel[99].setRotationPoint(47F, 5.5F, 7F);

		drgcomboModel[100].addBox(0F, 0F, 0F, 6, 1, 3, 0F); // Box 199
		drgcomboModel[100].setRotationPoint(47F, 7F, 7F);

		drgcomboModel[101].addBox(0F, 0F, 0F, 6, 1, 2, 0F); // Box 200
		drgcomboModel[101].setRotationPoint(47F, 4.5F, 6F);

		drgcomboModel[102].addBox(0F, 0F, 0F, 1, 3, 5, 0F); // Box 201
		drgcomboModel[102].setRotationPoint(46F, 3F, 5F);

		drgcomboModel[103].addBox(0F, 0F, 0F, 1, 3, 5, 0F); // Box 202
		drgcomboModel[103].setRotationPoint(53F, 3F, 5F);

		drgcomboModel[104].addBox(0F, 0F, 0F, 1, 2, 3, 0F); // Box 203
		drgcomboModel[104].setRotationPoint(53F, 6F, 7F);

		drgcomboModel[105].addBox(0F, 0F, 0F, 1, 2, 3, 0F); // Box 204
		drgcomboModel[105].setRotationPoint(46F, 6F, 7F);

		drgcomboModel[106].addBox(0F, 0F, 0F, 90, 1, 2, 0F); // Box 205
		drgcomboModel[106].setRotationPoint(-44F, 3F, -10F);

		drgcomboModel[107].addBox(0F, 0F, 0F, 90, 1, 2, 0F); // Box 206
		drgcomboModel[107].setRotationPoint(-44F, 3F, 8F);

		drgcomboModel[108].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 207
		drgcomboModel[108].setRotationPoint(-53F, 3F, -10F);

		drgcomboModel[109].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 208
		drgcomboModel[109].setRotationPoint(-53F, 3F, 9F);

		drgcomboModel[110].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 209
		drgcomboModel[110].setRotationPoint(54F, 3F, 9F);

		drgcomboModel[111].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 210
		drgcomboModel[111].setRotationPoint(54F, 3F, -10F);

		drgcomboModel[112].addShapeBox(0F, 0F, 0F, 110, 1, 3, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, -0.05F, 0.05F, 0F, -0.05F, 0.05F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, -0.01F, -0.3F, 0F, -0.01F, -0.3F); // Box 211
		drgcomboModel[112].setRotationPoint(-54F, -20F, -10.98F);
		drgcomboModel[112].rotateAngleX = 0.34906585F;

		drgcomboModel[113].addShapeBox(0F, 0F, 0F, 13, 3, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 148
		drgcomboModel[113].setRotationPoint(-49F, -24F, -7F);

		drgcomboModel[114].addShapeBox(0F, 0F, 0F, 5, 3, 14, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 149
		drgcomboModel[114].setRotationPoint(-54F, -24F, -7F);

		drgcomboModel[115].addShapeBox(0F, 0F, 0F, 5, 3, 14, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 150
		drgcomboModel[115].setRotationPoint(51F, -24F, -7F);

		drgcomboModel[116].addBox(0F, 0F, 0F, 13, 1, 12, 0F); // Box 163
		drgcomboModel[116].setRotationPoint(-39F, 5F, -6F);

		drgcomboModel[117].addBox(0F, 0F, 0F, 9, 1, 12, 0F); // Box 164
		drgcomboModel[117].setRotationPoint(-37F, 7F, -6F);

		drgcomboModel[118].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 165
		drgcomboModel[118].setRotationPoint(-39F, 6F, -6F);

		drgcomboModel[119].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 166
		drgcomboModel[119].setRotationPoint(-38F, 6F, -6F);

		drgcomboModel[120].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 167
		drgcomboModel[120].setRotationPoint(-38F, 7F, -6F);

		drgcomboModel[121].addBox(0F, 0F, 0F, 2, 1, 12, 0F); // Box 168
		drgcomboModel[121].setRotationPoint(-36F, 6F, -6F);

		drgcomboModel[122].addBox(0F, 0F, 0F, 2, 1, 12, 0F); // Box 169
		drgcomboModel[122].setRotationPoint(-31F, 6F, -6F);

		drgcomboModel[123].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 170
		drgcomboModel[123].setRotationPoint(-28F, 7F, -6F);

		drgcomboModel[124].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 171
		drgcomboModel[124].setRotationPoint(-28F, 6F, -6F);

		drgcomboModel[125].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 172
		drgcomboModel[125].setRotationPoint(-27F, 6F, -6F);

		drgcomboModel[126].addBox(0F, 0F, 0F, 5, 2, 6, 0F); // Box 172
		drgcomboModel[126].setRotationPoint(-35F, 3F, -3F);

		drgcomboModel[127].addShapeBox(0F, 0F, 0F, 29, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 173
		drgcomboModel[127].setRotationPoint(-14F, 5.9F, -6F);

		drgcomboModel[128].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 174
		drgcomboModel[128].setRotationPoint(-24F, 2F, -6F);
		drgcomboModel[128].rotateAngleZ = -0.36651914F;

		drgcomboModel[129].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 177
		drgcomboModel[129].setRotationPoint(25F, 2F, -5.5F);
		drgcomboModel[129].rotateAngleY = -3.14159265F;
		drgcomboModel[129].rotateAngleZ = -0.36651914F;

		drgcomboModel[130].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 178
		drgcomboModel[130].setRotationPoint(25F, 2F, 6F);
		drgcomboModel[130].rotateAngleY = -3.14159265F;
		drgcomboModel[130].rotateAngleZ = -0.36651914F;

		drgcomboModel[131].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 179
		drgcomboModel[131].setRotationPoint(-24F, 2F, 5.5F);
		drgcomboModel[131].rotateAngleZ = -0.36651914F;

		drgcomboModel[132].addShapeBox(0F, 0F, 0F, 29, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 180
		drgcomboModel[132].setRotationPoint(-14F, 5.9F, 5.5F);

		drgcomboModel[133].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 181
		drgcomboModel[133].setRotationPoint(-14F, 2.4F, -6F);

		drgcomboModel[134].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 182
		drgcomboModel[134].setRotationPoint(14.5F, 2.4F, -6F);

		drgcomboModel[135].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 184
		drgcomboModel[135].setRotationPoint(-14F, 2.4F, 5.5F);

		drgcomboModel[136].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 186
		drgcomboModel[136].setRotationPoint(14.5F, 2.4F, 5.5F);

		drgcomboModel[137].addBox(0F, 0F, 0F, 10, 1, 16, 0F); // Box 185
		drgcomboModel[137].setRotationPoint(-54F, -21F, -8.1F);

		drgcomboModel[138].addBox(0F, 0F, 0F, 10, 1, 16, 0F); // Box 189
		drgcomboModel[138].setRotationPoint(46F, -21F, -8.1F);

		drgcomboModel[139].addShapeBox(0F, 0F, 0F, 90, 1, 2, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 190
		drgcomboModel[139].setRotationPoint(-44F, -21F, -8F);

		drgcomboModel[140].addShapeBox(0F, 0F, 0F, 90, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 191
		drgcomboModel[140].setRotationPoint(-44F, -21F, 6F);

		drgcomboModel[141].addShapeBox(0F, 0F, 0F, 100, 1, 15, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 193
		drgcomboModel[141].setRotationPoint(-49F, -24.5F, -7.5F);

		drgcomboModel[142].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F, 0F, -3F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -3F, 0F, -0.7F, 0F, -0.5F, 0F, -2.5F, -0.5F, 0F, -2.5F, 0F, -0.7F, 0F, 0F); // Box 196
		drgcomboModel[142].setRotationPoint(-54F, -24F, -8F);

		drgcomboModel[143].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F, 0F, -3F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -3F, 0F, -0.7F, 0F, -0.5F, 0F, -2.5F, -0.5F, 0F, -2.5F, 0F, -0.7F, 0F, 0F); // Box 198
		drgcomboModel[143].setRotationPoint(-54F, -24F, 6.5F);

		drgcomboModel[144].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F, 0F, -3F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -3F, 0F, -0.7F, 0F, -0.5F, 0F, -2.5F, -0.5F, 0F, -2.5F, 0F, -0.7F, 0F, 0F); // Box 199
		drgcomboModel[144].setRotationPoint(56F, -24F, 8F);
		drgcomboModel[144].rotateAngleY = -3.14159265F;

		drgcomboModel[145].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F, 0F, -3F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -3F, 0F, -0.7F, 0F, -0.5F, 0F, -2.5F, -0.5F, 0F, -2.5F, 0F, -0.7F, 0F, 0F); // Box 200
		drgcomboModel[145].setRotationPoint(56F, -24F, -6.5F);
		drgcomboModel[145].rotateAngleY = -3.14159265F;

		drgcomboModel[146].addBox(0F, 0F, 0F, 3, 0, 3, 0F); // Box 201
		drgcomboModel[146].setRotationPoint(53F, -9.01F, -7F);

		drgcomboModel[147].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 202
		drgcomboModel[147].setRotationPoint(54.01F, -9F, -6F);

		drgcomboModel[148].addBox(0F, 0F, 0F, 13, 3, 3, 0F); // Box 198
		drgcomboModel[148].setRotationPoint(-21F, 3F, -4.5F);

		drgcomboModel[149].addBox(0F, 0F, 0F, 13, 3, 3, 0F); // Box 199
		drgcomboModel[149].setRotationPoint(9F, 3F, 2F);

		drgcomboModel[150].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 214
		drgcomboModel[150].setRotationPoint(-57F, 4F, -1F);

		drgcomboModel[151].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 1F, -1F, 0F, 1F, -1F, 0F, 0F, 1F, 0F); // Box 215
		drgcomboModel[151].setRotationPoint(-53F, 3F, -1F);

		drgcomboModel[152].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 1F, -1F, 0F); // Box 216
		drgcomboModel[152].setRotationPoint(54F, 3F, -1F);

		drgcomboModel[153].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 217
		drgcomboModel[153].setRotationPoint(55F, 4F, -1F);

		drgcomboModel[154].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 218
		drgcomboModel[154].setRotationPoint(-53F, -9F, 5F);

		drgcomboModel[155].addBox(0F, 0F, 0F, 3, 0, 3, 0F); // Box 220
		drgcomboModel[155].setRotationPoint(-54F, -9.01F, 4F);

		drgcomboModel[156].addShapeBox(0F, 0F, 0F, 110, 1, 3, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, -0.05F, 0.05F, 0F, -0.05F, 0.05F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, -0.01F, -0.3F, 0F, -0.01F, -0.3F); // Box 221
		drgcomboModel[156].setRotationPoint(56F, -20.01F, 10.78F);
		drgcomboModel[156].rotateAngleX = 0.34906585F;
		drgcomboModel[156].rotateAngleY = -3.14159265F;

		drgcomboModel[157].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 221
		drgcomboModel[157].setRotationPoint(41F, -25F, -9F);

		drgcomboModel[158].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 222
		drgcomboModel[158].setRotationPoint(41F, -25F, -10F);

		drgcomboModel[159].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 223
		drgcomboModel[159].setRotationPoint(40F, -25F, -10F);

		drgcomboModel[160].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 224
		drgcomboModel[160].setRotationPoint(40F, -25F, -9F);

		drgcomboModel[161].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 225
		drgcomboModel[161].setRotationPoint(42F, -25F, -9F);

		drgcomboModel[162].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 226
		drgcomboModel[162].setRotationPoint(41F, -25F, -8F);

		drgcomboModel[163].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 227
		drgcomboModel[163].setRotationPoint(42F, -25F, -10F);

		drgcomboModel[164].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 228
		drgcomboModel[164].setRotationPoint(42F, -25F, -8F);

		drgcomboModel[165].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 229
		drgcomboModel[165].setRotationPoint(40F, -25F, -8F);

		drgcomboModel[166].addShapeBox(0F, 0F, 0F, 11, 3, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 235
		drgcomboModel[166].setRotationPoint(-13F, -24F, -7F);

		drgcomboModel[167].addShapeBox(0F, 0F, 0F, 11, 3, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 236
		drgcomboModel[167].setRotationPoint(4F, -24F, -7F);

		drgcomboModel[168].addShapeBox(0F, 0F, 0F, 11, 3, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 237
		drgcomboModel[168].setRotationPoint(21F, -24F, -7F);

		drgcomboModel[169].addShapeBox(0F, 0F, 0F, 13, 3, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 233
		drgcomboModel[169].setRotationPoint(38F, -24F, -7F);

		drgcomboModel[170].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 242
		drgcomboModel[170].setRotationPoint(-19F, -24F, -6.5F);

		drgcomboModel[171].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 243
		drgcomboModel[171].setRotationPoint(-2F, -24F, -6.5F);

		drgcomboModel[172].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 244
		drgcomboModel[172].setRotationPoint(15F, -24F, -6.5F);

		drgcomboModel[173].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 245
		drgcomboModel[173].setRotationPoint(32F, -24F, -6.5F);

		drgcomboModel[174].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 256
		drgcomboModel[174].setRotationPoint(-19F, -22F, -6.5F);

		drgcomboModel[175].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 257
		drgcomboModel[175].setRotationPoint(-2F, -22F, -6.5F);

		drgcomboModel[176].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 258
		drgcomboModel[176].setRotationPoint(15F, -22F, -6.5F);

		drgcomboModel[177].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 259
		drgcomboModel[177].setRotationPoint(32F, -22F, -6.5F);

		drgcomboModel[178].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 264
		drgcomboModel[178].setRotationPoint(-39.5F, -15.5F, -9.5F);

		drgcomboModel[179].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 265
		drgcomboModel[179].setRotationPoint(-40F, -16.5F, -9.5F);

		drgcomboModel[180].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 266
		drgcomboModel[180].setRotationPoint(-35.5F, -16.5F, -9.5F);

		drgcomboModel[181].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 267
		drgcomboModel[181].setRotationPoint(-40F, -17.5F, -9.5F);

		drgcomboModel[182].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 268
		drgcomboModel[182].setRotationPoint(-40F, -9F, -9.5F);

		drgcomboModel[183].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 269
		drgcomboModel[183].setRotationPoint(-30.5F, -15.5F, -9.5F);

		drgcomboModel[184].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 270
		drgcomboModel[184].setRotationPoint(-31F, -16.5F, -9.5F);

		drgcomboModel[185].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 271
		drgcomboModel[185].setRotationPoint(-26.5F, -16.5F, -9.5F);

		drgcomboModel[186].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 272
		drgcomboModel[186].setRotationPoint(-31F, -17.5F, -9.5F);

		drgcomboModel[187].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 273
		drgcomboModel[187].setRotationPoint(-31F, -9F, -9.5F);

		drgcomboModel[188].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 274
		drgcomboModel[188].setRotationPoint(-21.5F, -15.5F, -9.5F);

		drgcomboModel[189].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 275
		drgcomboModel[189].setRotationPoint(-22F, -16.5F, -9.5F);

		drgcomboModel[190].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 276
		drgcomboModel[190].setRotationPoint(-17.5F, -16.5F, -9.5F);

		drgcomboModel[191].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 277
		drgcomboModel[191].setRotationPoint(-22F, -17.5F, -9.5F);

		drgcomboModel[192].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 278
		drgcomboModel[192].setRotationPoint(-22F, -9F, -9.5F);

		drgcomboModel[193].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 279
		drgcomboModel[193].setRotationPoint(-12.5F, -15.5F, -9.5F);

		drgcomboModel[194].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 280
		drgcomboModel[194].setRotationPoint(-13F, -16.5F, -9.5F);

		drgcomboModel[195].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 281
		drgcomboModel[195].setRotationPoint(-8.5F, -16.5F, -9.5F);

		drgcomboModel[196].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 282
		drgcomboModel[196].setRotationPoint(-13F, -17.5F, -9.5F);

		drgcomboModel[197].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 283
		drgcomboModel[197].setRotationPoint(-13F, -9F, -9.5F);

		drgcomboModel[198].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 284
		drgcomboModel[198].setRotationPoint(-3.5F, -15.5F, -9.5F);

		drgcomboModel[199].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 285
		drgcomboModel[199].setRotationPoint(-4F, -16.5F, -9.5F);

		drgcomboModel[200].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 286
		drgcomboModel[200].setRotationPoint(0.5F, -16.5F, -9.5F);

		drgcomboModel[201].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 287
		drgcomboModel[201].setRotationPoint(-4F, -17.5F, -9.5F);

		drgcomboModel[202].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 288
		drgcomboModel[202].setRotationPoint(-4F, -9F, -9.5F);

		drgcomboModel[203].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 289
		drgcomboModel[203].setRotationPoint(5.5F, -15.5F, -9.5F);

		drgcomboModel[204].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 290
		drgcomboModel[204].setRotationPoint(5F, -16.5F, -9.5F);

		drgcomboModel[205].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 291
		drgcomboModel[205].setRotationPoint(9.5F, -16.5F, -9.5F);

		drgcomboModel[206].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 292
		drgcomboModel[206].setRotationPoint(5F, -17.5F, -9.5F);

		drgcomboModel[207].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 293
		drgcomboModel[207].setRotationPoint(5F, -9F, -9.5F);

		drgcomboModel[208].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 313
		drgcomboModel[208].setRotationPoint(-19F, -23.5F, -6.5F);

		drgcomboModel[209].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 314
		drgcomboModel[209].setRotationPoint(-13.5F, -23.5F, -6.5F);

		drgcomboModel[210].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 315
		drgcomboModel[210].setRotationPoint(-2F, -23.5F, -6.5F);

		drgcomboModel[211].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 316
		drgcomboModel[211].setRotationPoint(3.5F, -23.5F, -6.5F);

		drgcomboModel[212].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 317
		drgcomboModel[212].setRotationPoint(20.5F, -23.5F, -6.5F);

		drgcomboModel[213].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 318
		drgcomboModel[213].setRotationPoint(15F, -23.5F, -6.5F);

		drgcomboModel[214].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 319
		drgcomboModel[214].setRotationPoint(32F, -23.5F, -6.5F);

		drgcomboModel[215].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 320
		drgcomboModel[215].setRotationPoint(37.5F, -23.5F, -6.5F);

		drgcomboModel[216].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 360
		drgcomboModel[216].setRotationPoint(-40F, -16.5F, 9F);

		drgcomboModel[217].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 361
		drgcomboModel[217].setRotationPoint(-39.5F, -15.5F, 9F);

		drgcomboModel[218].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 362
		drgcomboModel[218].setRotationPoint(-40F, -17.5F, 9F);

		drgcomboModel[219].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 363
		drgcomboModel[219].setRotationPoint(-40F, -9F, 9F);

		drgcomboModel[220].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 364
		drgcomboModel[220].setRotationPoint(-35.5F, -16.5F, 9F);

		drgcomboModel[221].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 365
		drgcomboModel[221].setRotationPoint(-31F, -16.5F, 9F);

		drgcomboModel[222].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 366
		drgcomboModel[222].setRotationPoint(-30.5F, -15.5F, 9F);

		drgcomboModel[223].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 367
		drgcomboModel[223].setRotationPoint(-31F, -17.5F, 9F);

		drgcomboModel[224].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 368
		drgcomboModel[224].setRotationPoint(-26.5F, -16.5F, 9F);

		drgcomboModel[225].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 369
		drgcomboModel[225].setRotationPoint(-31F, -9F, 9F);

		drgcomboModel[226].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 370
		drgcomboModel[226].setRotationPoint(-22F, -16.5F, 9F);

		drgcomboModel[227].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 371
		drgcomboModel[227].setRotationPoint(-21.5F, -15.5F, 9F);

		drgcomboModel[228].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 372
		drgcomboModel[228].setRotationPoint(-22F, -17.5F, 9F);

		drgcomboModel[229].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 373
		drgcomboModel[229].setRotationPoint(-17.5F, -16.5F, 9F);

		drgcomboModel[230].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 374
		drgcomboModel[230].setRotationPoint(-22F, -9F, 9F);

		drgcomboModel[231].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 375
		drgcomboModel[231].setRotationPoint(-12.5F, -15.5F, 9F);

		drgcomboModel[232].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 376
		drgcomboModel[232].setRotationPoint(-13F, -17.5F, 9F);

		drgcomboModel[233].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 377
		drgcomboModel[233].setRotationPoint(-13F, -16.5F, 9F);

		drgcomboModel[234].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 378
		drgcomboModel[234].setRotationPoint(-8.5F, -16.5F, 9F);

		drgcomboModel[235].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 379
		drgcomboModel[235].setRotationPoint(-13F, -9F, 9F);

		drgcomboModel[236].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 380
		drgcomboModel[236].setRotationPoint(-4F, -16.5F, 9F);

		drgcomboModel[237].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 381
		drgcomboModel[237].setRotationPoint(-3.5F, -15.5F, 9F);

		drgcomboModel[238].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 382
		drgcomboModel[238].setRotationPoint(-4F, -9F, 9F);

		drgcomboModel[239].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 383
		drgcomboModel[239].setRotationPoint(0.5F, -16.5F, 9F);

		drgcomboModel[240].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 384
		drgcomboModel[240].setRotationPoint(-4F, -17.5F, 9F);

		drgcomboModel[241].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 385
		drgcomboModel[241].setRotationPoint(5F, -16.5F, 9F);

		drgcomboModel[242].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 386
		drgcomboModel[242].setRotationPoint(5.5F, -15.5F, 9F);

		drgcomboModel[243].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 387
		drgcomboModel[243].setRotationPoint(5F, -17.5F, 9F);

		drgcomboModel[244].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 388
		drgcomboModel[244].setRotationPoint(9.5F, -16.5F, 9F);

		drgcomboModel[245].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 389
		drgcomboModel[245].setRotationPoint(5F, -9F, 9F);

		drgcomboModel[246].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, -0.5F, -1F, -0.5F, -0.5F, -1F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 406
		drgcomboModel[246].setRotationPoint(45F, -17.5F, -8F);

		drgcomboModel[247].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, -0.5F, -1F, -0.5F, -0.5F, -1F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 407
		drgcomboModel[247].setRotationPoint(45F, -9F, -8F);

		drgcomboModel[248].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 408
		drgcomboModel[248].setRotationPoint(45F, -16.5F, -5.5F);

		drgcomboModel[249].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 409
		drgcomboModel[249].setRotationPoint(45F, -16.5F, -7F);

		drgcomboModel[250].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, -0.5F, -1F, -0.5F, -0.5F, -1F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 410
		drgcomboModel[250].setRotationPoint(45F, -15.5F, -7.5F);

		drgcomboModel[251].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, -0.5F, -1F, -0.5F, -0.5F, -1F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 411
		drgcomboModel[251].setRotationPoint(45F, -15.5F, 4.5F);

		drgcomboModel[252].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 412
		drgcomboModel[252].setRotationPoint(45F, -16.5F, 5F);

		drgcomboModel[253].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, -0.5F, -1F, -0.5F, -0.5F, -1F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 413
		drgcomboModel[253].setRotationPoint(45F, -17.5F, 4F);

		drgcomboModel[254].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 414
		drgcomboModel[254].setRotationPoint(45F, -16.5F, 6.5F);

		drgcomboModel[255].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, -0.5F, -1F, -0.5F, -0.5F, -1F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 415
		drgcomboModel[255].setRotationPoint(45F, -9F, 4F);

		drgcomboModel[256].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, -0.5F, -1F, -0.5F, -0.5F, -1F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 416
		drgcomboModel[256].setRotationPoint(-43.5F, -15.5F, 4.5F);

		drgcomboModel[257].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 417
		drgcomboModel[257].setRotationPoint(-43.5F, -16.5F, 5F);

		drgcomboModel[258].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, -0.5F, -1F, -0.5F, -0.5F, -1F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 418
		drgcomboModel[258].setRotationPoint(-43.5F, -17.5F, 4F);

		drgcomboModel[259].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 419
		drgcomboModel[259].setRotationPoint(-43.5F, -16.5F, 6.5F);

		drgcomboModel[260].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, -0.5F, -1F, -0.5F, -0.5F, -1F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 420
		drgcomboModel[260].setRotationPoint(-43.5F, -9F, 4F);

		drgcomboModel[261].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, -0.5F, -1F, -0.5F, -0.5F, -1F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 421
		drgcomboModel[261].setRotationPoint(-43.5F, -15.5F, -7.5F);

		drgcomboModel[262].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 422
		drgcomboModel[262].setRotationPoint(-43.5F, -16.5F, -7F);

		drgcomboModel[263].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 424
		drgcomboModel[263].setRotationPoint(-43.5F, -16.5F, -5.5F);

		drgcomboModel[264].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, -0.5F, -1F, -0.5F, -0.5F, -1F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 425
		drgcomboModel[264].setRotationPoint(-43.5F, -9F, -8F);

		drgcomboModel[265].addBox(0F, 0F, 0F, 1, 7, 1, 0F); // Box 397
		drgcomboModel[265].setRotationPoint(-53F, -5F, -0.5F);

		drgcomboModel[266].addBox(0F, 0F, 0F, 1, 7, 1, 0F); // Box 398
		drgcomboModel[266].setRotationPoint(54F, -5F, -0.5F);

		drgcomboModel[267].addShapeBox(0F, 0F, 0F, 11, 3, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 362
		drgcomboModel[267].setRotationPoint(-30F, -24F, -7F);

		drgcomboModel[268].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 363
		drgcomboModel[268].setRotationPoint(-36F, -22F, -6.5F);

		drgcomboModel[269].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 364
		drgcomboModel[269].setRotationPoint(-36F, -23.5F, -6.5F);

		drgcomboModel[270].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 365
		drgcomboModel[270].setRotationPoint(-36F, -24F, -6.5F);

		drgcomboModel[271].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 366
		drgcomboModel[271].setRotationPoint(-30.5F, -23.5F, -6.5F);

		drgcomboModel[272].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, -0.5F, -1F, -0.5F, -0.5F, -1F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 357
		drgcomboModel[272].setRotationPoint(-43.5F, -17.5F, -8F);

		drgcomboModel[273].addShapeBox(0F, 18.5F, -1F, 1, 1, 7, 0F, 0F, -0.5F, -1F, -0.5F, -0.5F, -1F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 359
		drgcomboModel[273].setRotationPoint(45.25F, -17.5F, -3F);

		drgcomboModel[274].addShapeBox(0F, 1F, 5.5F, 1, 18, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 360
		drgcomboModel[274].setRotationPoint(45.25F, -17.5F, -3F);

		drgcomboModel[275].addShapeBox(0F, 8F, -0.5F, 1, 11, 6, 0F, 0F, -0.5F, -1F, -0.5F, -0.5F, -1F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 361
		drgcomboModel[275].setRotationPoint(45.25F, -17.5F, -3F);

		drgcomboModel[276].addShapeBox(0F, 0.5F, 0F, 1, 18, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 362
		drgcomboModel[276].setRotationPoint(45.25F, -17F, -3F);

		drgcomboModel[277].addShapeBox(0F, 0F, -1F, 1, 1, 7, 0F, 0F, -0.5F, -1F, -0.5F, -0.5F, -1F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 363
		drgcomboModel[277].setRotationPoint(45.25F, -17.5F, -3F);

		drgcomboModel[278].addShapeBox(0F, 0F, 0F, 56, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 436
		drgcomboModel[278].setRotationPoint(-43F, -18F, -6.5F);

		drgcomboModel[279].addShapeBox(0F, 0F, 0F, 56, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 437
		drgcomboModel[279].setRotationPoint(-43F, -18F, -7.5F);

		drgcomboModel[280].addShapeBox(0F, 0F, 0F, 56, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 438
		drgcomboModel[280].setRotationPoint(-43F, -18F, -8.5F);

		drgcomboModel[281].addShapeBox(0F, 0F, 0F, 56, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 439
		drgcomboModel[281].setRotationPoint(-43F, -18F, 8F);

		drgcomboModel[282].addShapeBox(0F, 0F, 0F, 56, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 440
		drgcomboModel[282].setRotationPoint(-43F, -18F, 7F);

		drgcomboModel[283].addShapeBox(0F, 0F, 0F, 56, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 441
		drgcomboModel[283].setRotationPoint(-43F, -18F, 6F);

		drgcomboModel[284].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F); // Box 442
		drgcomboModel[284].setRotationPoint(-41F, -17.5F, -9.5F);

		drgcomboModel[285].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F); // Box 443
		drgcomboModel[285].setRotationPoint(-33.3F, -17.5F, -9.5F);

		drgcomboModel[286].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F); // Box 444
		drgcomboModel[286].setRotationPoint(-24.3F, -17.5F, -9.5F);

		drgcomboModel[287].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F); // Box 445
		drgcomboModel[287].setRotationPoint(-15.3F, -17.5F, -9.5F);

		drgcomboModel[288].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F); // Box 446
		drgcomboModel[288].setRotationPoint(-6.3F, -17.5F, -9.5F);

		drgcomboModel[289].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F); // Box 447
		drgcomboModel[289].setRotationPoint(2.7F, -17.5F, -9.5F);

		drgcomboModel[290].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F); // Box 448
		drgcomboModel[290].setRotationPoint(11.7F, -17.5F, -9.5F);

		drgcomboModel[291].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F); // Box 452
		drgcomboModel[291].setRotationPoint(-41F, -17.5F, 9.5F);
		drgcomboModel[291].rotateAngleY = -3.14159265F;

		drgcomboModel[292].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F); // Box 454
		drgcomboModel[292].setRotationPoint(-32.7F, -17.5F, 9.5F);
		drgcomboModel[292].rotateAngleY = -3.14159265F;

		drgcomboModel[293].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F); // Box 455
		drgcomboModel[293].setRotationPoint(-23.7F, -17.5F, 9.5F);
		drgcomboModel[293].rotateAngleY = -3.14159265F;

		drgcomboModel[294].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F); // Box 456
		drgcomboModel[294].setRotationPoint(-14.7F, -17.5F, 9.5F);
		drgcomboModel[294].rotateAngleY = -3.14159265F;

		drgcomboModel[295].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F); // Box 457
		drgcomboModel[295].setRotationPoint(-5.7F, -17.5F, 9.5F);
		drgcomboModel[295].rotateAngleY = -3.14159265F;

		drgcomboModel[296].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F); // Box 458
		drgcomboModel[296].setRotationPoint(3.3F, -17.5F, 9.5F);
		drgcomboModel[296].rotateAngleY = -3.14159265F;

		drgcomboModel[297].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F); // Box 459
		drgcomboModel[297].setRotationPoint(12.3F, -17.5F, 9.5F);
		drgcomboModel[297].rotateAngleY = -3.14159265F;

		drgcomboModel[298].addShapeBox(0F, 0F, 0F, 1, 4, 12, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 463
		drgcomboModel[298].setRotationPoint(-44F, -24F, -6F);

		drgcomboModel[299].addShapeBox(0F, 0F, 0F, 1, 4, 12, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 464
		drgcomboModel[299].setRotationPoint(45F, -24F, -6F);

		drgcomboModel[300].addBox(0F, 0F, 0F, 1, 22, 5, 0F); // Box 465
		drgcomboModel[300].setRotationPoint(39F, -20F, 4F);

		drgcomboModel[301].addBox(0F, 0F, 0F, 1, 22, 5, 0F); // Box 467
		drgcomboModel[301].setRotationPoint(43F, -20F, 4F);

		drgcomboModel[302].addBox(0F, 0F, 0F, 3, 1, 5, 0F); // Box 470
		drgcomboModel[302].setRotationPoint(40F, -20F, 4F);

		drgcomboModel[303].addBox(0F, 0F, 0F, 3, 1, 5, 0F); // Box 473
		drgcomboModel[303].setRotationPoint(40F, 1F, 4F);

		drgcomboModel[304].addBox(0F, 0F, 0F, 3, 20, 0, 0F); // Box 474
		drgcomboModel[304].setRotationPoint(40F, -19F, 4.1F);

		drgcomboModel[305].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 484
		drgcomboModel[305].setRotationPoint(7F, -1F, -5F);

		drgcomboModel[306].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 485
		drgcomboModel[306].setRotationPoint(4F, -1F, -5F);

		drgcomboModel[307].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 486
		drgcomboModel[307].setRotationPoint(1F, -1F, -5F);

		drgcomboModel[308].addShapeBox(0F, 0F, 0F, 9, 1, 2, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 487
		drgcomboModel[308].setRotationPoint(1F, -5.5F, -7F);

		drgcomboModel[309].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 490
		drgcomboModel[309].setRotationPoint(-11F, -1F, -5F);

		drgcomboModel[310].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 491
		drgcomboModel[310].setRotationPoint(-14F, -1F, -5F);

		drgcomboModel[311].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 492
		drgcomboModel[311].setRotationPoint(-17F, -1F, -5F);

		drgcomboModel[312].addShapeBox(0F, 0F, 0F, 9, 1, 2, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 493
		drgcomboModel[312].setRotationPoint(-17F, -5.5F, -7F);

		drgcomboModel[313].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 496
		drgcomboModel[313].setRotationPoint(-29F, -1F, -5F);

		drgcomboModel[314].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 497
		drgcomboModel[314].setRotationPoint(-32F, -1F, -5F);

		drgcomboModel[315].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 498
		drgcomboModel[315].setRotationPoint(-35F, -1F, -5F);

		drgcomboModel[316].addShapeBox(0F, 0F, 0F, 9, 1, 2, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 499
		drgcomboModel[316].setRotationPoint(-35F, -5.5F, -7F);

		drgcomboModel[317].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 392
		drgcomboModel[317].setRotationPoint(-2F, -22F, 6F);

		drgcomboModel[318].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 393
		drgcomboModel[318].setRotationPoint(-2F, -23.5F, 6F);

		drgcomboModel[319].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 394
		drgcomboModel[319].setRotationPoint(-2F, -24F, 6F);

		drgcomboModel[320].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 395
		drgcomboModel[320].setRotationPoint(3.5F, -23.5F, 6F);

		drgcomboModel[321].addShapeBox(0F, 0F, 0F, 11, 3, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 396
		drgcomboModel[321].setRotationPoint(4F, -24F, 6F);

		drgcomboModel[322].addShapeBox(0F, 0F, 0F, 11, 3, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 397
		drgcomboModel[322].setRotationPoint(-13F, -24F, 6F);

		drgcomboModel[323].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 398
		drgcomboModel[323].setRotationPoint(-19F, -23.5F, 6F);

		drgcomboModel[324].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 399
		drgcomboModel[324].setRotationPoint(-19F, -22F, 6F);

		drgcomboModel[325].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 400
		drgcomboModel[325].setRotationPoint(-13.5F, -23.5F, 6F);

		drgcomboModel[326].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 401
		drgcomboModel[326].setRotationPoint(-19F, -24F, 6F);

		drgcomboModel[327].addShapeBox(0F, 0F, 0F, 11, 3, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 402
		drgcomboModel[327].setRotationPoint(-30F, -24F, 6F);

		drgcomboModel[328].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 403
		drgcomboModel[328].setRotationPoint(-36F, -24F, 6F);

		drgcomboModel[329].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 404
		drgcomboModel[329].setRotationPoint(-30.5F, -23.5F, 6F);

		drgcomboModel[330].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 405
		drgcomboModel[330].setRotationPoint(-36F, -22F, 6F);

		drgcomboModel[331].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 406
		drgcomboModel[331].setRotationPoint(-36F, -23.5F, 6F);

		drgcomboModel[332].addShapeBox(0F, 0F, 0F, 13, 3, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 407
		drgcomboModel[332].setRotationPoint(-49F, -24F, 6F);

		drgcomboModel[333].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 408
		drgcomboModel[333].setRotationPoint(15F, -23.5F, 6F);

		drgcomboModel[334].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 409
		drgcomboModel[334].setRotationPoint(15F, -24F, 6F);

		drgcomboModel[335].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 410
		drgcomboModel[335].setRotationPoint(15F, -22F, 6F);

		drgcomboModel[336].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 411
		drgcomboModel[336].setRotationPoint(20.5F, -23.5F, 6F);

		drgcomboModel[337].addShapeBox(0F, 0F, 0F, 11, 3, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 412
		drgcomboModel[337].setRotationPoint(21F, -24F, 6F);

		drgcomboModel[338].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 413
		drgcomboModel[338].setRotationPoint(37.5F, -23.5F, 6F);

		drgcomboModel[339].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 414
		drgcomboModel[339].setRotationPoint(32F, -24F, 6F);

		drgcomboModel[340].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 415
		drgcomboModel[340].setRotationPoint(32F, -23.5F, 6F);

		drgcomboModel[341].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 416
		drgcomboModel[341].setRotationPoint(32F, -22F, 6F);

		drgcomboModel[342].addShapeBox(0F, 0F, 0F, 13, 3, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 417
		drgcomboModel[342].setRotationPoint(38F, -24F, 6F);

		drgcomboModel[343].addBox(0F, 0F, 0F, 1, 22, 6, 0F); // Box 404
		drgcomboModel[343].setRotationPoint(13F, -20F, -9F);

		drgcomboModel[344].addShapeBox(0F, 0F, 0F, 1, 11, 6, 0F, 0F, -0.5F, -1F, -0.5F, -0.5F, -1F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 405
		drgcomboModel[344].setRotationPoint(13.25F, -9.5F, -3.5F);

		drgcomboModel[345].addShapeBox(0F, 0F, 0F, 1, 18, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 406
		drgcomboModel[345].setRotationPoint(13.25F, -16.5F, -3F);

		drgcomboModel[346].addShapeBox(0F, 0F, 0F, 1, 18, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 407
		drgcomboModel[346].setRotationPoint(13.25F, -16.5F, 2.5F);

		drgcomboModel[347].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F, 0F, -0.5F, -1F, -0.5F, -0.5F, -1F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 416
		drgcomboModel[347].setRotationPoint(13.25F, -17.5F, -4F);

		drgcomboModel[348].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F, 0F, -0.5F, -1F, -0.5F, -0.5F, -1F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 417
		drgcomboModel[348].setRotationPoint(13.25F, 1F, -4F);

		drgcomboModel[349].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 380
		drgcomboModel[349].setRotationPoint(13F, -8F, 1F);

		drgcomboModel[350].addBox(0F, 0F, 0F, 1, 22, 6, 0F); // Box 381
		drgcomboModel[350].setRotationPoint(13F, -20F, 3F);

		drgcomboModel[351].addBox(0F, 0F, 0F, 1, 3, 6, 0F); // Box 382
		drgcomboModel[351].setRotationPoint(13F, -20F, -3F);

		drgcomboModel[352].addShapeBox(0F, 0F, 0F, 1, 4, 12, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 384
		drgcomboModel[352].setRotationPoint(13F, -24F, -6F);

		drgcomboModel[353].addBox(0F, 0F, 0F, 11, 19, 1, 0F); // Box 387
		drgcomboModel[353].setRotationPoint(10F, -17F, -10F);

		drgcomboModel[354].addShapeBox(0F, 0F, 0F, 13, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 388
		drgcomboModel[354].setRotationPoint(21F, 1F, 9.25F);

		drgcomboModel[355].addShapeBox(0F, 0F, 0F, 13, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 389
		drgcomboModel[355].setRotationPoint(21F, -17.5F, 9.25F);

		drgcomboModel[356].addShapeBox(0F, 0F, 0F, 1, 18, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 390
		drgcomboModel[356].setRotationPoint(33.5F, -16.5F, 9.25F);

		drgcomboModel[357].addShapeBox(0F, 0F, 0F, 1, 18, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 391
		drgcomboModel[357].setRotationPoint(21F, -16.5F, 9.25F);

		drgcomboModel[358].addShapeBox(0F, 0F, 0F, 12, 13, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 392
		drgcomboModel[358].setRotationPoint(21.5F, -11.5F, 9.25F);

		drgcomboModel[359].addShapeBox(0F, 0F, 0F, 12, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 394
		drgcomboModel[359].setRotationPoint(21.5F, -12F, 9.25F);

		drgcomboModel[360].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 395
		drgcomboModel[360].setRotationPoint(29.5F, -16.5F, 9.25F);

		drgcomboModel[361].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 396
		drgcomboModel[361].setRotationPoint(25F, -16.5F, 9.25F);

		drgcomboModel[362].addBox(0F, 0F, 0F, 1, 10, 5, 0F); // Box 397
		drgcomboModel[362].setRotationPoint(34F, -8F, 4F);

		drgcomboModel[363].addBox(0F, 0F, 0F, 4, 1, 5, 0F); // Box 398
		drgcomboModel[363].setRotationPoint(35F, -8F, 4F);

		drgcomboModel[364].addBox(0F, 0F, 0F, 10, 1, 5, 0F); // Box 399
		drgcomboModel[364].setRotationPoint(35F, -8F, -9F);

		drgcomboModel[365].addBox(0F, 0F, 0F, 1, 10, 5, 0F); // Box 400
		drgcomboModel[365].setRotationPoint(34F, -8F, -9F);

		drgcomboModel[366].addShapeBox(0F, 0F, 0F, 1, 8, 2, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 401
		drgcomboModel[366].setRotationPoint(44F, -15.5F, -9F);

		drgcomboModel[367].addShapeBox(0F, 0F, 0F, 1, 8, 2, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 402
		drgcomboModel[367].setRotationPoint(41F, -15.5F, -9F);

		drgcomboModel[368].addShapeBox(0F, 0F, 0F, 1, 8, 2, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 403
		drgcomboModel[368].setRotationPoint(38F, -15.5F, -9F);

		drgcomboModel[369].addShapeBox(0F, 0F, 0F, 1, 8, 2, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 404
		drgcomboModel[369].setRotationPoint(35F, -15.5F, -9F);

		drgcomboModel[370].addShapeBox(0F, 0F, 0F, 10, 1, 3, 0F, 0F, -0.5F, -1F, -0.5F, -0.5F, -1F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 405
		drgcomboModel[370].setRotationPoint(35F, -16.5F, -10F);

		drgcomboModel[371].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F, 0F, -0.5F, -1F, -0.5F, -0.5F, -1F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 406
		drgcomboModel[371].setRotationPoint(35.5F, -14F, -10F);

		drgcomboModel[372].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F, 0F, -0.5F, -1F, -0.5F, -0.5F, -1F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 407
		drgcomboModel[372].setRotationPoint(35.5F, -11.5F, -10F);

		drgcomboModel[373].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F, 0F, -0.5F, -1F, -0.5F, -0.5F, -1F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 408
		drgcomboModel[373].setRotationPoint(38.5F, -14F, -10F);

		drgcomboModel[374].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F, 0F, -0.5F, -1F, -0.5F, -0.5F, -1F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 409
		drgcomboModel[374].setRotationPoint(38.5F, -11.5F, -10F);

		drgcomboModel[375].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F, 0F, -0.5F, -1F, -0.5F, -0.5F, -1F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 410
		drgcomboModel[375].setRotationPoint(41.5F, -11.5F, -10F);

		drgcomboModel[376].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F, 0F, -0.5F, -1F, -0.5F, -0.5F, -1F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 411
		drgcomboModel[376].setRotationPoint(41.5F, -14F, -10F);

		drgcomboModel[377].addBox(0F, 0F, 0F, 5, 5, 5, 0F); // Box 412
		drgcomboModel[377].setRotationPoint(14F, -3F, -9F);

		drgcomboModel[378].addBox(0F, 0F, 0F, 5, 5, 5, 0F); // Box 413
		drgcomboModel[378].setRotationPoint(16F, -8F, -9F);
		drgcomboModel[378].rotateAngleY = 0.48869219F;

		drgcomboModel[379].addBox(0F, 0F, 0F, 5, 1, 5, 0F); // Box 414
		drgcomboModel[379].setRotationPoint(14F, -6F, 4F);

		drgcomboModel[380].addBox(0F, 0F, 0F, 1, 8, 5, 0F); // Box 415
		drgcomboModel[380].setRotationPoint(19F, -6F, 4F);

		drgcomboModel[381].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 416
		drgcomboModel[381].setRotationPoint(43F, -9F, -9F);

		drgcomboModel[382].addBox(0F, 0F, 0F, 0, 2, 2, 0F); // Box 418
		drgcomboModel[382].setRotationPoint(38F, -12.75F, -9F);
		drgcomboModel[382].rotateAngleZ = -0.54105207F;

		drgcomboModel[383].addBox(0F, 0F, 0F, 0, 2, 2, 0F); // Box 419
		drgcomboModel[383].setRotationPoint(43F, -12.75F, -7F);
		drgcomboModel[383].rotateAngleY = -3.14159265F;
		drgcomboModel[383].rotateAngleZ = -0.54105207F;

		drgcomboModel[384].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 420
		drgcomboModel[384].setRotationPoint(42F, -9F, -9F);

		drgcomboModel[385].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 421
		drgcomboModel[385].setRotationPoint(35.6F, -12F, -9F);

		drgcomboModel[386].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 422
		drgcomboModel[386].setRotationPoint(39F, -9F, -9F);
		drgcomboModel[386].rotateAngleY = 0.36651914F;

		drgcomboModel[387].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 423
		drgcomboModel[387].setRotationPoint(39F, -10F, -9F);

		drgcomboModel[388].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 424
		drgcomboModel[388].setRotationPoint(42F, -13F, -9F);

		drgcomboModel[389].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 425
		drgcomboModel[389].setRotationPoint(39.5F, -14.5F, -9F);

		drgcomboModel[390].addBox(0F, 0F, 0F, 0, 2, 2, 0F); // Box 426
		drgcomboModel[390].setRotationPoint(42F, -15.25F, -7F);
		drgcomboModel[390].rotateAngleY = -2.72271363F;
		drgcomboModel[390].rotateAngleZ = -0.54105207F;

		drgcomboModel[391].addBox(0F, 0F, 0F, 0, 2, 2, 0F); // Box 427
		drgcomboModel[391].setRotationPoint(42F, -15.5F, -7F);
		drgcomboModel[391].rotateAngleY = -3.14159265F;

		drgcomboModel[392].addBox(0F, 0F, 0F, 4, 1, 5, 0F); // Box 428
		drgcomboModel[392].setRotationPoint(35F, -4F, 4F);

		drgcomboModel[393].addBox(0F, 0F, 0F, 5, 5, 4, 0F); // Box 429
		drgcomboModel[393].setRotationPoint(14F, -11F, 5F);

		drgcomboModel[394].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 430
		drgcomboModel[394].setRotationPoint(17.5F, -20F, 8F);

		drgcomboModel[395].addShapeBox(0F, 0F, 0F, 12, 13, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 431
		drgcomboModel[395].setRotationPoint(21.5F, -11.5F, -9.75F);

		drgcomboModel[396].addShapeBox(0F, 0F, 0F, 1, 18, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 432
		drgcomboModel[396].setRotationPoint(33.5F, -16.5F, -9.75F);

		drgcomboModel[397].addShapeBox(0F, 0F, 0F, 12, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 433
		drgcomboModel[397].setRotationPoint(21.5F, -12F, -9.75F);

		drgcomboModel[398].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 434
		drgcomboModel[398].setRotationPoint(29.5F, -16.5F, -9.75F);

		drgcomboModel[399].addShapeBox(0F, 0F, 0F, 13, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 435
		drgcomboModel[399].setRotationPoint(21F, -17.5F, -9.75F);

		drgcomboModel[400].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 436
		drgcomboModel[400].setRotationPoint(25F, -16.5F, -9.75F);

		drgcomboModel[401].addShapeBox(0F, 0F, 0F, 1, 18, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 437
		drgcomboModel[401].setRotationPoint(21F, -16.5F, -9.75F);

		drgcomboModel[402].addShapeBox(0F, 0F, 0F, 13, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 438
		drgcomboModel[402].setRotationPoint(21F, 1F, -9.75F);

		drgcomboModel[403].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F); // Box 427
		drgcomboModel[403].setRotationPoint(-45F, -7.5F, 8F);

		drgcomboModel[404].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F); // Box 428
		drgcomboModel[404].setRotationPoint(-45F, -7.5F, -8.5F);

		drgcomboModel[405].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F); // Box 429
		drgcomboModel[405].setRotationPoint(46.5F, -7.5F, -8.5F);

		drgcomboModel[406].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F); // Box 430
		drgcomboModel[406].setRotationPoint(46.5F, -7.5F, 8F);

		drgcomboModel[407].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 431
		drgcomboModel[407].setRotationPoint(20F, -7.5F, 10.5F);

		drgcomboModel[408].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 432
		drgcomboModel[408].setRotationPoint(34.5F, -7.5F, 10.5F);

		drgcomboModel[409].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 433
		drgcomboModel[409].setRotationPoint(20F, -7.5F, -11F);

		drgcomboModel[410].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 434
		drgcomboModel[410].setRotationPoint(34.5F, -7.5F, -11F);

		drgcomboModel[411].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 435
		drgcomboModel[411].setRotationPoint(-38F, -7.5F, -11F);

		drgcomboModel[412].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 436
		drgcomboModel[412].setRotationPoint(-38F, -7.5F, 10.5F);

		drgcomboModel[413].addBox(0F, 0F, 0F, 0, 2, 2, 0F); // Box 437
		drgcomboModel[413].setRotationPoint(35F, -5.75F, 6F);
		drgcomboModel[413].rotateAngleY = -3.14159265F;
		drgcomboModel[413].rotateAngleZ = -0.54105207F;

		drgcomboModel[414].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 438
		drgcomboModel[414].setRotationPoint(36.5F, -6F, 4F);
		drgcomboModel[414].rotateAngleY = 0.27925268F;

		drgcomboModel[415].addBox(0F, 0F, 0F, 2, 0, 3, 0F); // Box 440
		drgcomboModel[415].setRotationPoint(36F, -8.02F, 5F);
		drgcomboModel[415].rotateAngleY = 0.36651914F;

		drgcomboModel[416].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 440
		drgcomboModel[416].setRotationPoint(14F, -16F, -8.5F);

		drgcomboModel[417].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 441
		drgcomboModel[417].setRotationPoint(14F, -16F, -4.5F);

		drgcomboModel[418].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 442
		drgcomboModel[418].setRotationPoint(15F, -16.5F, -9F);

		drgcomboModel[419].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 443
		drgcomboModel[419].setRotationPoint(14F, -16.5F, -9F);

		drgcomboModel[420].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 444
		drgcomboModel[420].setRotationPoint(14F, -16.5F, 3.5F);

		drgcomboModel[421].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 445
		drgcomboModel[421].setRotationPoint(15F, -16.5F, 3.5F);

		drgcomboModel[422].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 446
		drgcomboModel[422].setRotationPoint(14F, -16F, 4F);

		drgcomboModel[423].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 447
		drgcomboModel[423].setRotationPoint(14F, -16F, 8F);

		drgcomboModel[424].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 452
		drgcomboModel[424].setRotationPoint(34.5F, -14.5F, 6.5F);

		drgcomboModel[425].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 453
		drgcomboModel[425].setRotationPoint(36.5F, -14.5F, 6.5F);

		drgcomboModel[426].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 455
		drgcomboModel[426].setRotationPoint(34.5F, -15F, 6.5F);

		drgcomboModel[427].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 457
		drgcomboModel[427].setRotationPoint(34.5F, -15F, 7.5F);

		drgcomboModel[428].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 458
		drgcomboModel[428].setRotationPoint(34.5F, -15F, 8.5F);

		drgcomboModel[429].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -1F, -0.5F, 0F, -1F); // Box 427
		drgcomboModel[429].setRotationPoint(-34.5F, -23.5F, -1F);

		drgcomboModel[430].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 432
		drgcomboModel[430].setRotationPoint(-33.25F, -24F, 0F);

		drgcomboModel[431].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -1F, -0.5F, 0F, -1F); // Box 453
		drgcomboModel[431].setRotationPoint(-17.5F, -23.5F, -1F);

		drgcomboModel[432].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 454
		drgcomboModel[432].setRotationPoint(-16.25F, -24F, 0F);

		drgcomboModel[433].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -1F, -0.5F, 0F, -1F); // Box 455
		drgcomboModel[433].setRotationPoint(-0.5F, -23.5F, -1F);

		drgcomboModel[434].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 456
		drgcomboModel[434].setRotationPoint(0.75F, -24F, 0F);

		drgcomboModel[435].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -1F, -0.5F, 0F, -1F); // Box 457
		drgcomboModel[435].setRotationPoint(16.5F, -23.5F, -1F);

		drgcomboModel[436].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 458
		drgcomboModel[436].setRotationPoint(17.75F, -24F, 0F);

		drgcomboModel[437].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -1F, -0.5F, 0F, -1F); // Box 459
		drgcomboModel[437].setRotationPoint(33.5F, -23.5F, -1F);

		drgcomboModel[438].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 460
		drgcomboModel[438].setRotationPoint(34.75F, -24F, 0F);

		drgcomboModel[439].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 463
		drgcomboModel[439].setRotationPoint(35F, -16.5F, 7F);
		drgcomboModel[439].rotateAngleY = -0.27925268F;

		drgcomboModel[440].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 464
		drgcomboModel[440].setRotationPoint(14F, -18F, 6F);
		drgcomboModel[440].rotateAngleY = -0.27925268F;

		drgcomboModel[441].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 465
		drgcomboModel[441].setRotationPoint(14F, -18F, -7F);
		drgcomboModel[441].rotateAngleY = 0.19198622F;

		drgcomboModel[442].addBox(0F, 0F, 0F, 2, 0, 3, 0F); // Box 466
		drgcomboModel[442].setRotationPoint(38F, -8.02F, -8F);
		drgcomboModel[442].rotateAngleY = 0.36651914F;

		drgcomboModel[443].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 467
		drgcomboModel[443].setRotationPoint(36.5F, 0F, 4F);
		drgcomboModel[443].rotateAngleY = 0.4712389F;

		drgcomboModel[444].addBox(0F, 0F, 0F, 5, 5, 5, 0F); // Box 468
		drgcomboModel[444].setRotationPoint(37.5F, -4F, -9F);
		drgcomboModel[444].rotateAngleY = 0.27925268F;

		drgcomboModel[445].addShapeBox(0F, 0.5F, -0.5F, 1, 1, 6, 0F, 0F, -0.5F, -1F, -0.5F, -0.5F, -1F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 469
		drgcomboModel[445].setRotationPoint(45.25F, -17.5F, -3F);

		drgcomboModel[446].addShapeBox(0F, 1.5F, 0.5F, 1, 7, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 471
		drgcomboModel[446].setRotationPoint(45.25F, -17.5F, -3F);

		drgcomboModel[447].addShapeBox(0F, 1.5F, 5F, 1, 7, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 472
		drgcomboModel[447].setRotationPoint(45.25F, -17.5F, -3F);

		drgcomboModel[448].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 473
		drgcomboModel[448].setRotationPoint(13.25F, -16F, -2.5F);

		drgcomboModel[449].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 474
		drgcomboModel[449].setRotationPoint(13.25F, -16F, 2F);

		drgcomboModel[450].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F, 0F, -0.5F, -1F, -0.5F, -0.5F, -1F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 475
		drgcomboModel[450].setRotationPoint(13.25F, -17F, -3.5F);

		drgcomboModel[451].addBox(0F, 0F, 0F, 9, 1, 12, 0F); // Box 478
		drgcomboModel[451].setRotationPoint(30F, 7F, -6F);

		drgcomboModel[452].addBox(0F, 0F, 0F, 5, 2, 6, 0F); // Box 479
		drgcomboModel[452].setRotationPoint(32F, 3F, -3F);

		drgcomboModel[453].addBox(0F, 0F, 0F, 13, 1, 12, 0F); // Box 480
		drgcomboModel[453].setRotationPoint(28F, 5F, -6F);

		drgcomboModel[454].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 481
		drgcomboModel[454].setRotationPoint(40F, 6F, -6F);

		drgcomboModel[455].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 482
		drgcomboModel[455].setRotationPoint(39F, 6F, -6F);

		drgcomboModel[456].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 483
		drgcomboModel[456].setRotationPoint(39F, 7F, -6F);

		drgcomboModel[457].addBox(0F, 0F, 0F, 2, 1, 12, 0F); // Box 484
		drgcomboModel[457].setRotationPoint(36F, 6F, -6F);

		drgcomboModel[458].addBox(0F, 0F, 0F, 2, 1, 12, 0F); // Box 485
		drgcomboModel[458].setRotationPoint(31F, 6F, -6F);

		drgcomboModel[459].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 486
		drgcomboModel[459].setRotationPoint(29F, 6F, -6F);

		drgcomboModel[460].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 487
		drgcomboModel[460].setRotationPoint(29F, 7F, -6F);

		drgcomboModel[461].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 488
		drgcomboModel[461].setRotationPoint(28F, 6F, -6F);

		drgcomboModel[462].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 515
		drgcomboModel[462].setRotationPoint(-56F, 4F, 0.5F);

		drgcomboModel[463].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.4F, -0.5F, -0.5F, -0.4F, -0.5F, -0.5F, -0.1F, 0F, -0.5F, -0.1F); // Box 517
		drgcomboModel[463].setRotationPoint(-56F, 6F, 0.6F);

		drgcomboModel[464].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, -0.5F, -0.5F, 1F, -0.5F, -0.5F, 1F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 520
		drgcomboModel[464].setRotationPoint(-56F, 3F, 0.5F);

		drgcomboModel[465].addShapeBox(0F, 1F, 0F, 1, 1, 14, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 525
		drgcomboModel[465].setRotationPoint(-55.5F, 2F, -7F);

		drgcomboModel[466].addShapeBox(0F, 1F, 0F, 1, 1, 1, 0F, 0F, -1F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, -1.5F, 0F, -0.5F, 1F, -0.5F, -0.5F, 1F, -0.5F, 0F, -1.5F, 0F, 0F); // Box 527
		drgcomboModel[466].setRotationPoint(-55.5F, 1F, 6F);

		drgcomboModel[467].addShapeBox(0F, 1F, 0F, 1, 1, 1, 0F, 0F, -1F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, -1.5F, 0F, -0.5F, 1F, -0.5F, -0.5F, 1F, -0.5F, 0F, -1.5F, 0F, 0F); // Box 528
		drgcomboModel[467].setRotationPoint(-55.5F, 1F, -7.5F);

		drgcomboModel[468].addShapeBox(0F, 1F, 0F, 1, 1, 1, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 529
		drgcomboModel[468].setRotationPoint(-55.5F, 2F, -0.75F);

		drgcomboModel[469].addShapeBox(0F, 1F, 0F, 1, 1, 1, 0F, 0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 530
		drgcomboModel[469].setRotationPoint(-54.5F, 1.5F, -0.75F);

		drgcomboModel[470].addShapeBox(0F, 1F, 0F, 1, 1, 14, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 477
		drgcomboModel[470].setRotationPoint(57F, 2F, -7F);

		drgcomboModel[471].addShapeBox(0F, 1F, 0F, 1, 1, 1, 0F, -0.5F, -0.5F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, -0.5F, -0.5F, 0F, 1F, -0.5F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, 0F, 1F, -0.5F, 0F); // Box 478
		drgcomboModel[471].setRotationPoint(56.5F, 1F, 6F);

		drgcomboModel[472].addShapeBox(0F, 1F, 0F, 1, 1, 1, 0F, 0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 479
		drgcomboModel[472].setRotationPoint(56.5F, 1.5F, -0.75F);

		drgcomboModel[473].addShapeBox(0F, 1F, 0F, 1, 1, 1, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 480
		drgcomboModel[473].setRotationPoint(57F, 2F, -0.75F);

		drgcomboModel[474].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 1F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 1F, -0.5F, 0F, 1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 481
		drgcomboModel[474].setRotationPoint(57F, 3F, 0.5F);

		drgcomboModel[475].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 482
		drgcomboModel[475].setRotationPoint(57.5F, 4F, 0.5F);

		drgcomboModel[476].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.4F, -0.5F, -0.5F, -0.4F, -0.5F, -0.5F, -0.1F, 0F, -0.5F, -0.1F); // Box 483
		drgcomboModel[476].setRotationPoint(57.5F, 6F, 0.6F);

		drgcomboModel[477].addShapeBox(0F, 1F, 0F, 1, 1, 1, 0F, -0.5F, -0.5F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, -0.5F, -0.5F, 0F, 1F, -0.5F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, 0F, 1F, -0.5F, 0F); // Box 484
		drgcomboModel[477].setRotationPoint(56.5F, 1F, -7.5F);

		drgcomboModel[478].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 478
		drgcomboModel[478].setRotationPoint(-38F, -8F, -10.5F);

		drgcomboModel[479].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 479
		drgcomboModel[479].setRotationPoint(-38F, -0.5F, -10.5F);

		drgcomboModel[480].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 480
		drgcomboModel[480].setRotationPoint(20F, -0.5F, -10.5F);

		drgcomboModel[481].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 481
		drgcomboModel[481].setRotationPoint(20F, -8F, -10.5F);

		drgcomboModel[482].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 482
		drgcomboModel[482].setRotationPoint(34.5F, -0.5F, -10.5F);

		drgcomboModel[483].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 483
		drgcomboModel[483].setRotationPoint(34.5F, -8F, -10.5F);

		drgcomboModel[484].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 484
		drgcomboModel[484].setRotationPoint(34.5F, -0.5F, 10F);

		drgcomboModel[485].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 485
		drgcomboModel[485].setRotationPoint(34.5F, -8F, 10F);

		drgcomboModel[486].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 486
		drgcomboModel[486].setRotationPoint(20F, -8F, 10F);

		drgcomboModel[487].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 487
		drgcomboModel[487].setRotationPoint(20F, -0.5F, 10F);

		drgcomboModel[488].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 488
		drgcomboModel[488].setRotationPoint(-38F, -0.5F, 10F);

		drgcomboModel[489].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 489
		drgcomboModel[489].setRotationPoint(-38F, -8F, 10F);

		drgcomboModel[490].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 490
		drgcomboModel[490].setRotationPoint(-44.5F, -0.5F, 8F);

		drgcomboModel[491].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 491
		drgcomboModel[491].setRotationPoint(-44.5F, -8F, 8F);

		drgcomboModel[492].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 492
		drgcomboModel[492].setRotationPoint(-44.5F, -0.5F, -8.5F);

		drgcomboModel[493].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 493
		drgcomboModel[493].setRotationPoint(-44.5F, -8F, -8.5F);

		drgcomboModel[494].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 494
		drgcomboModel[494].setRotationPoint(46F, -0.5F, -8.5F);

		drgcomboModel[495].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 495
		drgcomboModel[495].setRotationPoint(46F, -8F, -8.5F);

		drgcomboModel[496].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 496
		drgcomboModel[496].setRotationPoint(46F, -0.5F, 8F);

		drgcomboModel[497].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 497
		drgcomboModel[497].setRotationPoint(46F, -8F, 8F);

		drgcomboModel[498].addBox(0F, 0F, 0F, 8, 0, 14, 0F); // Box 476
		drgcomboModel[498].setRotationPoint(-17F, -1.5F, -5F);

		drgcomboModel[499].addBox(-0.5F, 0F, 0F, 0, 8, 14, 0F); // Box 477
		drgcomboModel[499].setRotationPoint(-7.25F, -9F, -5F);
		drgcomboModel[499].rotateAngleZ = -0.17453293F;

		drgcomboModel[500].addShapeBox(0F, 6F, 0F, 1, 1, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 489
		drgcomboModel[500].setRotationPoint(-8.25F, -9.5F, -4F);
		drgcomboModel[500].rotateAngleZ = -0.17453293F;

		drgcomboModel[501].addShapeBox(0F, 0F, 0F, 1, 1, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5.5F, 0F, 0F, -5.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5.5F, 0F, 0F, -5.5F); // Box 490
		drgcomboModel[501].setRotationPoint(-17F, -2F, -4F);
		drgcomboModel[501].rotateAngleY = -1.57079633F;

		drgcomboModel[502].addShapeBox(0F, 0F, 0F, 1, 1, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6.5F, 0F, 0F, -6.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6.5F, 0F, 0F, -6.4F); // Box 491
		drgcomboModel[502].setRotationPoint(-8.25F, -9.5F, -4F);
		drgcomboModel[502].rotateAngleX = -1.57079633F;
		drgcomboModel[502].rotateAngleZ = -0.17453293F;

		drgcomboModel[503].addShapeBox(0F, 0F, 0F, 1, 1, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 493
		drgcomboModel[503].setRotationPoint(-14F, -2F, -4F);

		drgcomboModel[504].addShapeBox(0F, 0F, 0F, 1, 1, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 494
		drgcomboModel[504].setRotationPoint(-12.5F, -2F, -4F);

		drgcomboModel[505].addShapeBox(0F, 0F, 0F, 1, 1, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 495
		drgcomboModel[505].setRotationPoint(-11F, -2F, -4F);

		drgcomboModel[506].addShapeBox(0F, 0F, 0F, 1, 1, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 496
		drgcomboModel[506].setRotationPoint(-9.5F, -2F, -4F);

		drgcomboModel[507].addShapeBox(0F, 4.5F, 0F, 1, 1, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 497
		drgcomboModel[507].setRotationPoint(-8.25F, -9.5F, -4F);
		drgcomboModel[507].rotateAngleZ = -0.17453293F;

		drgcomboModel[508].addShapeBox(0F, 3F, 0F, 1, 1, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 498
		drgcomboModel[508].setRotationPoint(-8.25F, -9.5F, -4F);
		drgcomboModel[508].rotateAngleZ = -0.17453293F;

		drgcomboModel[509].addShapeBox(0F, 1.5F, 0F, 1, 1, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 499
		drgcomboModel[509].setRotationPoint(-8.25F, -9.5F, -4F);
		drgcomboModel[509].rotateAngleZ = -0.17453293F;

		drgcomboModel[510].addShapeBox(0F, 0F, 0F, 1, 1, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 500
		drgcomboModel[510].setRotationPoint(-8.25F, -9.5F, -4F);
		drgcomboModel[510].rotateAngleZ = -0.17453293F;

		drgcomboModel[511].addShapeBox(0F, 0F, 0F, 1, 1, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6.5F, 0F, 0F, -6.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6.5F, 0F, 0F, -6.4F); // Box 501
		drgcomboModel[511].setRotationPoint(-8.25F, -9.5F, 9F);
		drgcomboModel[511].rotateAngleX = -1.57079633F;
		drgcomboModel[511].rotateAngleZ = -0.17453293F;

		drgcomboModel[512].addShapeBox(0F, 0F, 0F, 1, 1, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5.5F, 0F, 0F, -5.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5.5F, 0F, 0F, -5.5F); // Box 502
		drgcomboModel[512].setRotationPoint(-17F, -2F, 9F);
		drgcomboModel[512].rotateAngleY = -1.57079633F;

		drgcomboModel[513].addShapeBox(0F, 0F, 0F, 1, 1, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 507
		drgcomboModel[513].setRotationPoint(-15.5F, -2F, -4F);

		drgcomboModel[514].addShapeBox(0F, 0F, 0F, 1, 1, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 508
		drgcomboModel[514].setRotationPoint(-17F, -2F, -4F);

		drgcomboModel[515].addShapeBox(0F, 0F, 0F, 1, 1, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 514
		drgcomboModel[515].setRotationPoint(-35F, -2F, -4F);

		drgcomboModel[516].addBox(0F, 0F, 0F, 8, 0, 14, 0F); // Box 515
		drgcomboModel[516].setRotationPoint(-35F, -1.5F, -5F);

		drgcomboModel[517].addShapeBox(0F, 0F, 0F, 1, 1, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 516
		drgcomboModel[517].setRotationPoint(-33.5F, -2F, -4F);

		drgcomboModel[518].addShapeBox(0F, 0F, 0F, 1, 1, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 517
		drgcomboModel[518].setRotationPoint(-32F, -2F, -4F);

		drgcomboModel[519].addShapeBox(0F, 0F, 0F, 1, 1, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 518
		drgcomboModel[519].setRotationPoint(-30.5F, -2F, -4F);

		drgcomboModel[520].addShapeBox(0F, 0F, 0F, 1, 1, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 519
		drgcomboModel[520].setRotationPoint(-29F, -2F, -4F);

		drgcomboModel[521].addShapeBox(0F, 0F, 0F, 1, 1, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 520
		drgcomboModel[521].setRotationPoint(-27.5F, -2F, -4F);

		drgcomboModel[522].addShapeBox(0F, 0F, 0F, 1, 1, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5.5F, 0F, 0F, -5.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5.5F, 0F, 0F, -5.5F); // Box 521
		drgcomboModel[522].setRotationPoint(-35F, -2F, -4F);
		drgcomboModel[522].rotateAngleY = -1.57079633F;

		drgcomboModel[523].addShapeBox(0F, 6F, 0F, 1, 1, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 522
		drgcomboModel[523].setRotationPoint(-26.25F, -9.5F, -4F);
		drgcomboModel[523].rotateAngleZ = -0.17453293F;

		drgcomboModel[524].addBox(-0.5F, 0F, 0F, 0, 8, 14, 0F); // Box 523
		drgcomboModel[524].setRotationPoint(-25.25F, -9F, -5F);
		drgcomboModel[524].rotateAngleZ = -0.17453293F;

		drgcomboModel[525].addShapeBox(0F, 4.5F, 0F, 1, 1, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 524
		drgcomboModel[525].setRotationPoint(-26.25F, -9.5F, -4F);
		drgcomboModel[525].rotateAngleZ = -0.17453293F;

		drgcomboModel[526].addShapeBox(0F, 0F, 0F, 1, 1, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6.5F, 0F, 0F, -6.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6.5F, 0F, 0F, -6.4F); // Box 525
		drgcomboModel[526].setRotationPoint(-26.25F, -9.5F, -4F);
		drgcomboModel[526].rotateAngleX = -1.57079633F;
		drgcomboModel[526].rotateAngleZ = -0.17453293F;

		drgcomboModel[527].addShapeBox(0F, 0F, 0F, 1, 1, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6.5F, 0F, 0F, -6.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6.5F, 0F, 0F, -6.4F); // Box 526
		drgcomboModel[527].setRotationPoint(-26.25F, -9.5F, 9F);
		drgcomboModel[527].rotateAngleX = -1.57079633F;
		drgcomboModel[527].rotateAngleZ = -0.17453293F;

		drgcomboModel[528].addShapeBox(0F, 3F, 0F, 1, 1, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 527
		drgcomboModel[528].setRotationPoint(-26.25F, -9.5F, -4F);
		drgcomboModel[528].rotateAngleZ = -0.17453293F;

		drgcomboModel[529].addShapeBox(0F, 1.5F, 0F, 1, 1, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 528
		drgcomboModel[529].setRotationPoint(-26.25F, -9.5F, -4F);
		drgcomboModel[529].rotateAngleZ = -0.17453293F;

		drgcomboModel[530].addShapeBox(0F, 0F, 0F, 1, 1, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 529
		drgcomboModel[530].setRotationPoint(-26.25F, -9.5F, -4F);
		drgcomboModel[530].rotateAngleZ = -0.17453293F;

		drgcomboModel[531].addShapeBox(0F, 0F, 0F, 1, 1, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5.5F, 0F, 0F, -5.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5.5F, 0F, 0F, -5.5F); // Box 530
		drgcomboModel[531].setRotationPoint(-35F, -2F, 9F);
		drgcomboModel[531].rotateAngleY = -1.57079633F;

		drgcomboModel[532].addShapeBox(0F, 0F, 0F, 1, 1, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 548
		drgcomboModel[532].setRotationPoint(7F, -2F, -4F);

		drgcomboModel[533].addShapeBox(0F, 0F, 0F, 1, 1, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 549
		drgcomboModel[533].setRotationPoint(8.5F, -2F, -4F);

		drgcomboModel[534].addShapeBox(0F, 0F, 0F, 1, 1, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 550
		drgcomboModel[534].setRotationPoint(5.5F, -2F, -4F);

		drgcomboModel[535].addShapeBox(0F, 0F, 0F, 1, 1, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 551
		drgcomboModel[535].setRotationPoint(4F, -2F, -4F);

		drgcomboModel[536].addShapeBox(0F, 0F, 0F, 1, 1, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 552
		drgcomboModel[536].setRotationPoint(2.5F, -2F, -4F);

		drgcomboModel[537].addShapeBox(0F, 0F, 0F, 1, 1, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 553
		drgcomboModel[537].setRotationPoint(1F, -2F, -4F);

		drgcomboModel[538].addShapeBox(0F, 0F, 0F, 1, 1, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5.5F, 0F, 0F, -5.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5.5F, 0F, 0F, -5.5F); // Box 554
		drgcomboModel[538].setRotationPoint(1F, -2F, -4F);
		drgcomboModel[538].rotateAngleY = -1.57079633F;

		drgcomboModel[539].addBox(0F, 0F, 0F, 8, 0, 14, 0F); // Box 555
		drgcomboModel[539].setRotationPoint(1F, -1.5F, -5F);

		drgcomboModel[540].addShapeBox(0F, 6F, 0F, 1, 1, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 556
		drgcomboModel[540].setRotationPoint(9.75F, -9.5F, -4F);
		drgcomboModel[540].rotateAngleZ = -0.17453293F;

		drgcomboModel[541].addShapeBox(0F, 4.5F, 0F, 1, 1, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 557
		drgcomboModel[541].setRotationPoint(9.75F, -9.5F, -4F);
		drgcomboModel[541].rotateAngleZ = -0.17453293F;

		drgcomboModel[542].addShapeBox(0F, 3F, 0F, 1, 1, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 558
		drgcomboModel[542].setRotationPoint(9.75F, -9.5F, -4F);
		drgcomboModel[542].rotateAngleZ = -0.17453293F;

		drgcomboModel[543].addShapeBox(0F, 1.5F, 0F, 1, 1, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 559
		drgcomboModel[543].setRotationPoint(9.75F, -9.5F, -4F);
		drgcomboModel[543].rotateAngleZ = -0.17453293F;

		drgcomboModel[544].addShapeBox(0F, 0F, 0F, 1, 1, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 560
		drgcomboModel[544].setRotationPoint(9.75F, -9.5F, -4F);
		drgcomboModel[544].rotateAngleZ = -0.17453293F;

		drgcomboModel[545].addShapeBox(0F, 0F, 0F, 1, 1, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6.5F, 0F, 0F, -6.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6.5F, 0F, 0F, -6.4F); // Box 561
		drgcomboModel[545].setRotationPoint(9.75F, -9.5F, -4F);
		drgcomboModel[545].rotateAngleX = -1.57079633F;
		drgcomboModel[545].rotateAngleZ = -0.17453293F;

		drgcomboModel[546].addShapeBox(0F, 0F, 0F, 1, 1, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5.5F, 0F, 0F, -5.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5.5F, 0F, 0F, -5.5F); // Box 562
		drgcomboModel[546].setRotationPoint(1F, -2F, 9F);
		drgcomboModel[546].rotateAngleY = -1.57079633F;

		drgcomboModel[547].addShapeBox(0F, 0F, 0F, 1, 1, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6.5F, 0F, 0F, -6.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6.5F, 0F, 0F, -6.4F); // Box 563
		drgcomboModel[547].setRotationPoint(9.75F, -9.5F, 9F);
		drgcomboModel[547].rotateAngleX = -1.57079633F;
		drgcomboModel[547].rotateAngleZ = -0.17453293F;

		drgcomboModel[548].addBox(-0.5F, 0F, 0F, 0, 8, 14, 0F); // Box 564
		drgcomboModel[548].setRotationPoint(10.75F, -9F, -5F);
		drgcomboModel[548].rotateAngleZ = -0.17453293F;

		drgcomboModel[549].addShapeBox(-0.25F, 9F, 4F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 559
		drgcomboModel[549].setRotationPoint(45.25F, -17F, -3F);

		drgcomboModel[550].addShapeBox(0F, 0.5F, 0F, 1, 18, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 560
		drgcomboModel[550].setRotationPoint(-43.75F, -17F, -3F);

		drgcomboModel[551].addShapeBox(0F, 0F, -1F, 1, 1, 7, 0F, 0F, -0.5F, -1F, -0.5F, -0.5F, -1F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 561
		drgcomboModel[551].setRotationPoint(-43.75F, -17.5F, -3F);

		drgcomboModel[552].addShapeBox(0F, 0.5F, -0.5F, 1, 1, 6, 0F, 0F, -0.5F, -1F, -0.5F, -0.5F, -1F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 562
		drgcomboModel[552].setRotationPoint(-43.75F, -17.5F, -3F);

		drgcomboModel[553].addShapeBox(0F, 1.5F, 0.5F, 1, 7, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 563
		drgcomboModel[553].setRotationPoint(-43.75F, -17.5F, -3F);

		drgcomboModel[554].addShapeBox(0F, 1.5F, 5F, 1, 7, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 564
		drgcomboModel[554].setRotationPoint(-43.75F, -17.5F, -3F);

		drgcomboModel[555].addShapeBox(0F, 1F, 5.5F, 1, 18, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 565
		drgcomboModel[555].setRotationPoint(-43.75F, -17.5F, -3F);

		drgcomboModel[556].addShapeBox(-0.25F, 9F, 4F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 566
		drgcomboModel[556].setRotationPoint(-43.75F, -17F, -3F);

		drgcomboModel[557].addShapeBox(0F, 18.5F, -1F, 1, 1, 7, 0F, 0F, -0.5F, -1F, -0.5F, -0.5F, -1F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 567
		drgcomboModel[557].setRotationPoint(-43.75F, -17.5F, -3F);

		drgcomboModel[558].addShapeBox(0F, 8F, -0.5F, 1, 11, 6, 0F, 0F, -0.5F, -1F, -0.5F, -0.5F, -1F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 568
		drgcomboModel[558].setRotationPoint(-43.75F, -17.5F, -3F);

		fixRotation(drgcomboModel, false, true, true);

	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		for(int i = 0; i < 559; i++)
		{
			drgcomboModel[i].render(f5);
		}
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
	{
	}

	public ModelRendererTurbo drgcomboModel[];
}