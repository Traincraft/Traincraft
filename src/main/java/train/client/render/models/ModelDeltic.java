//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2017 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator:
// Created on:13.08.2017 - 08:16:13
// Last changed on: 13.08.2017 - 08:16:13

package train.client.render.models;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import tmt.ModelBase;
import tmt.ModelRendererTurbo;
import tmt.Tessellator;
import train.common.library.Info;

public class ModelDeltic extends ModelBase
{
	int textureX = 512;
	int textureY = 512;

	public ModelDeltic()
	{
		deltic2Model = new ModelRendererTurbo[197];
		deltic2Model[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		deltic2Model[1] = new ModelRendererTurbo(this, 161, 9, textureX, textureY); // Box 1
		deltic2Model[2] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 2
		deltic2Model[3] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 5
		deltic2Model[4] = new ModelRendererTurbo(this, 369, 89, textureX, textureY); // Box 6
		deltic2Model[5] = new ModelRendererTurbo(this, 1, 121, textureX, textureY); // Box 8
		deltic2Model[6] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 9
		deltic2Model[7] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 10
		deltic2Model[8] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 11
		deltic2Model[9] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 12
		deltic2Model[10] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 13
		deltic2Model[11] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 14
		deltic2Model[12] = new ModelRendererTurbo(this, 185, 129, textureX, textureY); // Box 15
		deltic2Model[13] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 17
		deltic2Model[14] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 19
		deltic2Model[15] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 20
		deltic2Model[16] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 61
		deltic2Model[17] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 62
		deltic2Model[18] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 64
		deltic2Model[19] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 66
		deltic2Model[20] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 89
		deltic2Model[21] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 90
		deltic2Model[22] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 91
		deltic2Model[23] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 92
		deltic2Model[24] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 93
		deltic2Model[25] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 94
		deltic2Model[26] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 95
		deltic2Model[27] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 96
		deltic2Model[28] = new ModelRendererTurbo(this, 473, 99, textureX, textureY); // Box 97
		deltic2Model[29] = new ModelRendererTurbo(this, 437, 99, textureX, textureY); // Box 98
		deltic2Model[30] = new ModelRendererTurbo(this, 474, 172, textureX, textureY); // Box 65
		deltic2Model[31] = new ModelRendererTurbo(this, 97, 121, textureX, textureY); // Box 66
		deltic2Model[32] = new ModelRendererTurbo(this, 449, 155, textureX, textureY); // Box 67
		deltic2Model[33] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 68
		deltic2Model[34] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 69
		deltic2Model[35] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 70
		deltic2Model[36] = new ModelRendererTurbo(this, 161, 9, textureX, textureY); // Box 71
		deltic2Model[37] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 72
		deltic2Model[38] = new ModelRendererTurbo(this, 161, 9, textureX, textureY); // Box 73
		deltic2Model[39] = new ModelRendererTurbo(this, 185, 9, textureX, textureY); // Box 74
		deltic2Model[40] = new ModelRendererTurbo(this, 201, 9, textureX, textureY); // Box 106
		deltic2Model[41] = new ModelRendererTurbo(this, 217, 9, textureX, textureY); // Box 107
		deltic2Model[42] = new ModelRendererTurbo(this, 233, 9, textureX, textureY); // Box 108
		deltic2Model[43] = new ModelRendererTurbo(this, 249, 9, textureX, textureY); // Box 110
		deltic2Model[44] = new ModelRendererTurbo(this, 353, 9, textureX, textureY); // Box 111
		deltic2Model[45] = new ModelRendererTurbo(this, 369, 9, textureX, textureY); // Box 112
		deltic2Model[46] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 115
		deltic2Model[47] = new ModelRendererTurbo(this, 105, 9, textureX, textureY); // Box 116
		deltic2Model[48] = new ModelRendererTurbo(this, 385, 9, textureX, textureY); // Box 117
		deltic2Model[49] = new ModelRendererTurbo(this, 497, 9, textureX, textureY); // Box 118
		deltic2Model[50] = new ModelRendererTurbo(this, 201, 17, textureX, textureY); // Box 119
		deltic2Model[51] = new ModelRendererTurbo(this, 321, 17, textureX, textureY); // Box 120
		deltic2Model[52] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 121
		deltic2Model[53] = new ModelRendererTurbo(this, 49, 25, textureX, textureY); // Box 122
		deltic2Model[54] = new ModelRendererTurbo(this, 409, 9, textureX, textureY); // Box 123
		deltic2Model[55] = new ModelRendererTurbo(this, 457, 9, textureX, textureY); // Box 124
		deltic2Model[56] = new ModelRendererTurbo(this, 233, 17, textureX, textureY); // Box 125
		deltic2Model[57] = new ModelRendererTurbo(this, 265, 129, textureX, textureY); // Box 126
		deltic2Model[58] = new ModelRendererTurbo(this, 401, 25, textureX, textureY); // Box 178
		deltic2Model[59] = new ModelRendererTurbo(this, 449, 25, textureX, textureY); // Box 179
		deltic2Model[60] = new ModelRendererTurbo(this, 161, 33, textureX, textureY); // Box 180
		deltic2Model[61] = new ModelRendererTurbo(this, 209, 33, textureX, textureY); // Box 181
		deltic2Model[62] = new ModelRendererTurbo(this, 369, 161, textureX, textureY); // Box 182
		deltic2Model[63] = new ModelRendererTurbo(this, 97, 17, textureX, textureY); // Box 183
		deltic2Model[64] = new ModelRendererTurbo(this, 249, 17, textureX, textureY); // Box 185
		deltic2Model[65] = new ModelRendererTurbo(this, 369, 17, textureX, textureY); // Box 186
		deltic2Model[66] = new ModelRendererTurbo(this, 441, 17, textureX, textureY); // Box 187
		deltic2Model[67] = new ModelRendererTurbo(this, 489, 17, textureX, textureY); // Box 188
		deltic2Model[68] = new ModelRendererTurbo(this, 401, 25, textureX, textureY); // Box 189
		deltic2Model[69] = new ModelRendererTurbo(this, 433, 25, textureX, textureY); // Box 190
		deltic2Model[70] = new ModelRendererTurbo(this, 449, 25, textureX, textureY); // Box 191
		deltic2Model[71] = new ModelRendererTurbo(this, 73, 17, textureX, textureY); // Box 192
		deltic2Model[72] = new ModelRendererTurbo(this, 161, 17, textureX, textureY); // Box 193
		deltic2Model[73] = new ModelRendererTurbo(this, 185, 17, textureX, textureY); // Box 194
		deltic2Model[74] = new ModelRendererTurbo(this, 97, 33, textureX, textureY); // Box 195
		deltic2Model[75] = new ModelRendererTurbo(this, 481, 25, textureX, textureY); // Box 196
		deltic2Model[76] = new ModelRendererTurbo(this, 497, 25, textureX, textureY); // Box 197
		deltic2Model[77] = new ModelRendererTurbo(this, 161, 33, textureX, textureY); // Box 198
		deltic2Model[78] = new ModelRendererTurbo(this, 193, 33, textureX, textureY); // Box 199
		deltic2Model[79] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 200
		deltic2Model[80] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 201
		deltic2Model[81] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 202
		deltic2Model[82] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 203
		deltic2Model[83] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 204
		deltic2Model[84] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 205
		deltic2Model[85] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 207
		deltic2Model[86] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 208
		deltic2Model[87] = new ModelRendererTurbo(this, 265, 9, textureX, textureY); // Box 210
		deltic2Model[88] = new ModelRendererTurbo(this, 505, 9, textureX, textureY); // Box 211
		deltic2Model[89] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 212
		deltic2Model[90] = new ModelRendererTurbo(this, 321, 33, textureX, textureY); // Box 213
		deltic2Model[91] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 214
		deltic2Model[92] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 215
		deltic2Model[93] = new ModelRendererTurbo(this, 65, 9, textureX, textureY); // Box 216
		deltic2Model[94] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 217
		deltic2Model[95] = new ModelRendererTurbo(this, 169, 9, textureX, textureY); // Box 218
		deltic2Model[96] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 219
		deltic2Model[97] = new ModelRendererTurbo(this, 193, 9, textureX, textureY); // Box 220
		deltic2Model[98] = new ModelRendererTurbo(this, 209, 9, textureX, textureY); // Box 221
		deltic2Model[99] = new ModelRendererTurbo(this, 225, 9, textureX, textureY); // Box 222
		deltic2Model[100] = new ModelRendererTurbo(this, 161, 9, textureX, textureY); // Box 223
		deltic2Model[101] = new ModelRendererTurbo(this, 89, 17, textureX, textureY); // Box 224
		deltic2Model[102] = new ModelRendererTurbo(this, 241, 9, textureX, textureY); // Box 225
		deltic2Model[103] = new ModelRendererTurbo(this, 185, 9, textureX, textureY); // Box 226
		deltic2Model[104] = new ModelRendererTurbo(this, 201, 9, textureX, textureY); // Box 227
		deltic2Model[105] = new ModelRendererTurbo(this, 321, 9, textureX, textureY); // Box 228
		deltic2Model[106] = new ModelRendererTurbo(this, 257, 9, textureX, textureY); // Box 229
		deltic2Model[107] = new ModelRendererTurbo(this, 337, 9, textureX, textureY); // Box 230
		deltic2Model[108] = new ModelRendererTurbo(this, 9, 9, textureX, textureY); // Box 231
		deltic2Model[109] = new ModelRendererTurbo(this, 217, 9, textureX, textureY); // Box 232
		deltic2Model[110] = new ModelRendererTurbo(this, 265, 17, textureX, textureY); // Box 233
		deltic2Model[111] = new ModelRendererTurbo(this, 385, 17, textureX, textureY); // Box 234
		deltic2Model[112] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 235
		deltic2Model[113] = new ModelRendererTurbo(this, 377, 9, textureX, textureY); // Box 243
		deltic2Model[114] = new ModelRendererTurbo(this, 97, 17, textureX, textureY); // Box 244
		deltic2Model[115] = new ModelRendererTurbo(this, 249, 17, textureX, textureY); // Box 245
		deltic2Model[116] = new ModelRendererTurbo(this, 257, 17, textureX, textureY); // Box 246
		deltic2Model[117] = new ModelRendererTurbo(this, 369, 17, textureX, textureY); // Box 247
		deltic2Model[118] = new ModelRendererTurbo(this, 377, 17, textureX, textureY); // Box 248
		deltic2Model[119] = new ModelRendererTurbo(this, 241, 33, textureX, textureY); // Box 249
		deltic2Model[120] = new ModelRendererTurbo(this, 81, 17, textureX, textureY); // Box 250
		deltic2Model[121] = new ModelRendererTurbo(this, 497, 17, textureX, textureY); // Box 251
		deltic2Model[122] = new ModelRendererTurbo(this, 361, 33, textureX, textureY); // Box 253
		deltic2Model[123] = new ModelRendererTurbo(this, 105, 17, textureX, textureY); // Box 254
		deltic2Model[124] = new ModelRendererTurbo(this, 505, 17, textureX, textureY); // Box 255
		deltic2Model[125] = new ModelRendererTurbo(this, 169, 17, textureX, textureY); // Box 257
		deltic2Model[126] = new ModelRendererTurbo(this, 385, 25, textureX, textureY); // Box 258
		deltic2Model[127] = new ModelRendererTurbo(this, 401, 25, textureX, textureY); // Box 259
		deltic2Model[128] = new ModelRendererTurbo(this, 481, 33, textureX, textureY); // Box 260
		deltic2Model[129] = new ModelRendererTurbo(this, 409, 25, textureX, textureY); // Box 261
		deltic2Model[130] = new ModelRendererTurbo(this, 497, 33, textureX, textureY); // Box 262
		deltic2Model[131] = new ModelRendererTurbo(this, 433, 25, textureX, textureY); // Box 263
		deltic2Model[132] = new ModelRendererTurbo(this, 457, 25, textureX, textureY); // Box 264
		deltic2Model[133] = new ModelRendererTurbo(this, 257, 33, textureX, textureY); // Box 265
		deltic2Model[134] = new ModelRendererTurbo(this, 377, 33, textureX, textureY); // Box 266
		deltic2Model[135] = new ModelRendererTurbo(this, 73, 41, textureX, textureY); // Box 267
		deltic2Model[136] = new ModelRendererTurbo(this, 81, 41, textureX, textureY); // Box 268
		deltic2Model[137] = new ModelRendererTurbo(this, 89, 41, textureX, textureY); // Box 269
		deltic2Model[138] = new ModelRendererTurbo(this, 97, 41, textureX, textureY); // Box 270
		deltic2Model[139] = new ModelRendererTurbo(this, 505, 25, textureX, textureY); // Box 272
		deltic2Model[140] = new ModelRendererTurbo(this, 241, 33, textureX, textureY); // Box 273
		deltic2Model[141] = new ModelRendererTurbo(this, 161, 41, textureX, textureY); // Box 274
		deltic2Model[142] = new ModelRendererTurbo(this, 241, 41, textureX, textureY); // Box 275
		deltic2Model[143] = new ModelRendererTurbo(this, 169, 41, textureX, textureY); // Box 276
		deltic2Model[144] = new ModelRendererTurbo(this, 353, 41, textureX, textureY); // Box 277
		deltic2Model[145] = new ModelRendererTurbo(this, 385, 33, textureX, textureY); // Box 278
		deltic2Model[146] = new ModelRendererTurbo(this, 193, 41, textureX, textureY); // Box 279
		deltic2Model[147] = new ModelRendererTurbo(this, 41, 33, textureX, textureY); // Box 280
		deltic2Model[148] = new ModelRendererTurbo(this, 457, 33, textureX, textureY); // Box 281
		deltic2Model[149] = new ModelRendererTurbo(this, 369, 41, textureX, textureY); // Box 200
		deltic2Model[150] = new ModelRendererTurbo(this, 497, 41, textureX, textureY); // Box 201
		deltic2Model[151] = new ModelRendererTurbo(this, 81, 49, textureX, textureY); // Box 200
		deltic2Model[152] = new ModelRendererTurbo(this, 353, 49, textureX, textureY); // Box 201
		deltic2Model[153] = new ModelRendererTurbo(this, 33, 57, textureX, textureY); // Box 202
		deltic2Model[154] = new ModelRendererTurbo(this, 321, 57, textureX, textureY); // Box 203
		deltic2Model[155] = new ModelRendererTurbo(this, 57, 57, textureX, textureY); // Box 172
		deltic2Model[156] = new ModelRendererTurbo(this, 489, 49, textureX, textureY); // Box 174
		deltic2Model[157] = new ModelRendererTurbo(this, 465, 57, textureX, textureY); // Box 176
		deltic2Model[158] = new ModelRendererTurbo(this, 401, 57, textureX, textureY); // Box 172
		deltic2Model[159] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 173
		deltic2Model[160] = new ModelRendererTurbo(this, 417, 57, textureX, textureY); // Box 174
		deltic2Model[161] = new ModelRendererTurbo(this, 161, 65, textureX, textureY); // Box 175
		deltic2Model[162] = new ModelRendererTurbo(this, 441, 57, textureX, textureY); // Box 179
		deltic2Model[163] = new ModelRendererTurbo(this, 257, 49, textureX, textureY); // Box 182
		deltic2Model[164] = new ModelRendererTurbo(this, 25, 65, textureX, textureY); // Box 183
		deltic2Model[165] = new ModelRendererTurbo(this, 209, 65, textureX, textureY); // Box 184
		deltic2Model[166] = new ModelRendererTurbo(this, 345, 65, textureX, textureY); // Box 187
		deltic2Model[167] = new ModelRendererTurbo(this, 433, 57, textureX, textureY); // Box 192
		deltic2Model[168] = new ModelRendererTurbo(this, 457, 57, textureX, textureY); // Box 193
		deltic2Model[169] = new ModelRendererTurbo(this, 465, 73, textureX, textureY); // Box 194
		deltic2Model[170] = new ModelRendererTurbo(this, 33, 49, textureX, textureY); // Box 195
		deltic2Model[171] = new ModelRendererTurbo(this, 345, 57, textureX, textureY); // Box 197
		deltic2Model[172] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 198
		deltic2Model[173] = new ModelRendererTurbo(this, 49, 81, textureX, textureY); // Box 199
		deltic2Model[174] = new ModelRendererTurbo(this, 81, 65, textureX, textureY); // Box 200
		deltic2Model[175] = new ModelRendererTurbo(this, 65, 81, textureX, textureY); // Box 201
		deltic2Model[176] = new ModelRendererTurbo(this, 97, 65, textureX, textureY); // Box 202
		deltic2Model[177] = new ModelRendererTurbo(this, 161, 81, textureX, textureY); // Box 203
		deltic2Model[178] = new ModelRendererTurbo(this, 257, 65, textureX, textureY); // Box 204
		deltic2Model[179] = new ModelRendererTurbo(this, 177, 81, textureX, textureY); // Box 205
		deltic2Model[180] = new ModelRendererTurbo(this, 465, 81, textureX, textureY); // Box 206
		deltic2Model[181] = new ModelRendererTurbo(this, 249, 81, textureX, textureY); // Box 207
		deltic2Model[182] = new ModelRendererTurbo(this, 401, 57, textureX, textureY); // Box 208
		deltic2Model[183] = new ModelRendererTurbo(this, 321, 89, textureX, textureY); // Box 209
		deltic2Model[184] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 210
		deltic2Model[185] = new ModelRendererTurbo(this, 249, 201, textureX, textureY); // Box 212
		deltic2Model[186] = new ModelRendererTurbo(this, 1, 209, textureX, textureY); // Box 216
		deltic2Model[187] = new ModelRendererTurbo(this, 97, 217, textureX, textureY); // Box 217
		deltic2Model[188] = new ModelRendererTurbo(this, 193, 289, textureX, textureY); // Box 219
		deltic2Model[189] = new ModelRendererTurbo(this, 1, 297, textureX, textureY); // Box 220
		deltic2Model[190] = new ModelRendererTurbo(this, 366, 217, textureX, textureY); // Box 190
		deltic2Model[191] = new ModelRendererTurbo(this, 428, 217, textureX, textureY); // Box 191
		deltic2Model[192] = new ModelRendererTurbo(this, 366, 236, textureX, textureY); // Box 192
		deltic2Model[193] = new ModelRendererTurbo(this, 428, 236, textureX, textureY); // Box 193
		deltic2Model[194] = new ModelRendererTurbo(this, 412, 256, textureX, textureY); // Box 194
		deltic2Model[195] = new ModelRendererTurbo(this, 372, 267, textureX, textureY); // Box 195
		deltic2Model[196] = new ModelRendererTurbo(this, 372, 256, textureX, textureY); // Box 196

		deltic2Model[0].addBox(0F, 0F, 0F, 22, 2, 110, 0F); // Box 0
		deltic2Model[0].setRotationPoint(-11F, 9F, -55F);

		deltic2Model[1].addShapeBox(0F, 0F, 0F, 22, 8, 108, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		deltic2Model[1].setRotationPoint(-11F, 1F, -54F);

		deltic2Model[2].addShapeBox(0F, 0F, 0F, 1, 16, 70, 0F, -3F, -9F, 0F, 3F, -9F, 0F, 3F, -9F, -10F, -3F, -9F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -10F); // Box 2
		deltic2Model[2].setRotationPoint(-11F, -23F, -30F);

		deltic2Model[3].addShapeBox(0F, 0F, 0F, 22, 7, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		deltic2Model[3].setRotationPoint(-11F, -6F, 42F);

		deltic2Model[4].addShapeBox(0F, 0F, 0F, 1, 5, 60, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		deltic2Model[4].setRotationPoint(-11F, -4F, -30F);

		deltic2Model[5].addShapeBox(0F, 0F, 0F, 3, 1, 86, 0F, -1F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		deltic2Model[5].setRotationPoint(-8F, -15F, -43F);

		deltic2Model[6].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 9
		deltic2Model[6].setRotationPoint(-0.5F, -14F, 45F);

		deltic2Model[7].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 10
		deltic2Model[7].setRotationPoint(-0.5F, -14F, -46F);

		deltic2Model[8].addShapeBox(0F, 0F, 0F, 1, 6, 2, 0F, -3F, -1F, 0F, 3F, -1F, 0F, 3F, -1F, -1F, -3F, -1F, -1F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 11
		deltic2Model[8].setRotationPoint(-11F, -15F, -43F);

		deltic2Model[9].addShapeBox(0F, 0F, 0F, 1, 6, 2, 0F, -3F, -1F, 0F, 3F, -1F, 0F, 3F, -1F, -1F, -3F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 12
		deltic2Model[9].setRotationPoint(-11F, -15F, 42F);

		deltic2Model[10].addShapeBox(0F, 0F, 0F, 1, 6, 2, 0F, 3F, -1F, 0F, -3F, -1F, 0F, -3F, -1F, -1F, 3F, -1F, -1F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 13
		deltic2Model[10].setRotationPoint(10F, -15F, -43F);

		deltic2Model[11].addShapeBox(0F, 0F, 0F, 1, 6, 2, 0F, 3F, -1F, 0F, -3F, -1F, 0F, -3F, -1F, -1F, 3F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 14
		deltic2Model[11].setRotationPoint(10F, -15F, 42F);

		deltic2Model[12].addShapeBox(0F, 0F, 0F, 1, 16, 70, 0F, 3F, -9F, 0F, -3F, -9F, 0F, -3F, -9F, -10F, 3F, -9F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -10F); // Box 15
		deltic2Model[12].setRotationPoint(10F, -23F, -30F);

		deltic2Model[13].addShapeBox(0F, 0F, 0F, 22, 3, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		deltic2Model[13].setRotationPoint(-11F, -9F, 42F);

		deltic2Model[14].addShapeBox(0F, 0F, 0F, 22, 3, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 19
		deltic2Model[14].setRotationPoint(-11F, -9F, -46F);

		deltic2Model[15].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F, -2F, -1F, 0F, 2F, -1F, 0F, 2F, -1F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 20
		deltic2Model[15].setRotationPoint(-11F, -13F, 38F);

		deltic2Model[16].addShapeBox(0F, 0F, 0F, 1, 2, 12, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 61
		deltic2Model[16].setRotationPoint(-9F, -14F, 30F);

		deltic2Model[17].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F, -2F, -1F, 0F, 2F, -1F, 0F, 2F, -1F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 62
		deltic2Model[17].setRotationPoint(-11F, -13F, -39F);

		deltic2Model[18].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F, 2F, -1F, 0F, -2F, -1F, 0F, -2F, -1F, 0F, 2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 64
		deltic2Model[18].setRotationPoint(10F, -13F, -39F);

		deltic2Model[19].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F, 2F, -1F, 0F, -2F, -1F, 0F, -2F, -1F, 0F, 2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 66
		deltic2Model[19].setRotationPoint(10F, -13F, 38F);

		deltic2Model[20].addBox(0F, 0F, 0F, 10, 4, 1, 0F); // Box 89
		deltic2Model[20].setRotationPoint(-5F, -5F, 55.5F);

		deltic2Model[21].addBox(0F, 0F, 0F, 10, 4, 1, 0F); // Box 90
		deltic2Model[21].setRotationPoint(-5F, -4F, -56.5F);

		deltic2Model[22].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 91
		deltic2Model[22].setRotationPoint(-1F, 4.5F, 55.5F);

		deltic2Model[23].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 92
		deltic2Model[23].setRotationPoint(7F, 3.5F, 55.5F);

		deltic2Model[24].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 93
		deltic2Model[24].setRotationPoint(-8F, 3.5F, 55.5F);

		deltic2Model[25].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 94
		deltic2Model[25].setRotationPoint(-1F, 4.5F, -56.5F);

		deltic2Model[26].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 95
		deltic2Model[26].setRotationPoint(7F, 3.5F, -56.5F);

		deltic2Model[27].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 96
		deltic2Model[27].setRotationPoint(-8F, 3.5F, -56.5F);

		deltic2Model[28].addShapeBox(0F, 0F, 0F, 1, 16, 16, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, -8F, 0F, -8F, -8F); // Box 97
		deltic2Model[28].setRotationPoint(-11F, -7F, -42F);

		deltic2Model[29].addShapeBox(0F, 0F, 0F, 1, 16, 16, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, -8F, 0F, -8F, -8F); // Box 98
		deltic2Model[29].setRotationPoint(-11F, -7F, 34F);

		deltic2Model[30].addShapeBox(0F, 0F, 0F, 1, 16, 16, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, -8F, 0F, -8F, -8F); // Box 65
		deltic2Model[30].setRotationPoint(10F, -7F, -42F);

		deltic2Model[31].addShapeBox(0F, 0F, 0F, 1, 5, 60, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 66
		deltic2Model[31].setRotationPoint(10F, -4F, -30F);

		deltic2Model[32].addShapeBox(0F, 0F, 0F, 1, 16, 16, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, -8F, 0F, -8F, -8F); // Box 67
		deltic2Model[32].setRotationPoint(10F, -7F, 34F);

		deltic2Model[33].addBox(0F, 0F, 0F, 1, 3, 4, 0F); // Box 68
		deltic2Model[33].setRotationPoint(-11F, -7F, 26F);

		deltic2Model[34].addBox(0F, 0F, 0F, 1, 3, 4, 0F); // Box 69
		deltic2Model[34].setRotationPoint(-11F, -7F, 18F);

		deltic2Model[35].addBox(0F, 0F, 0F, 1, 3, 4, 0F); // Box 70
		deltic2Model[35].setRotationPoint(-11F, -7F, 10F);

		deltic2Model[36].addShapeBox(0F, 0F, 0F, 1, 7, 16, 0F, 0F, -4F, -4F, 0F, -4F, -4F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 71
		deltic2Model[36].setRotationPoint(-11F, -11F, -10F);

		deltic2Model[37].addBox(0F, 0F, 0F, 1, 3, 4, 0F); // Box 72
		deltic2Model[37].setRotationPoint(-11F, -7F, -30F);

		deltic2Model[38].addBox(0F, 0F, 0F, 1, 3, 4, 0F); // Box 73
		deltic2Model[38].setRotationPoint(-11F, -7F, -22F);

		deltic2Model[39].addBox(0F, 0F, 0F, 1, 3, 4, 0F); // Box 74
		deltic2Model[39].setRotationPoint(-11F, -7F, -14F);

		deltic2Model[40].addBox(0F, 0F, 0F, 1, 3, 4, 0F); // Box 106
		deltic2Model[40].setRotationPoint(10F, -7F, 26F);

		deltic2Model[41].addBox(0F, 0F, 0F, 1, 3, 4, 0F); // Box 107
		deltic2Model[41].setRotationPoint(10F, -7F, 18F);

		deltic2Model[42].addBox(0F, 0F, 0F, 1, 3, 4, 0F); // Box 108
		deltic2Model[42].setRotationPoint(10F, -7F, 10F);

		deltic2Model[43].addBox(0F, 0F, 0F, 1, 3, 4, 0F); // Box 110
		deltic2Model[43].setRotationPoint(10F, -7F, -14F);

		deltic2Model[44].addBox(0F, 0F, 0F, 1, 3, 4, 0F); // Box 111
		deltic2Model[44].setRotationPoint(10F, -7F, -22F);

		deltic2Model[45].addBox(0F, 0F, 0F, 1, 3, 4, 0F); // Box 112
		deltic2Model[45].setRotationPoint(10F, -7F, -30F);

		deltic2Model[46].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F, -2F, -1F, 0F, 2F, -1F, 0F, 2F, -1F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 115
		deltic2Model[46].setRotationPoint(-11F, -13F, 34F);

		deltic2Model[47].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F, -2F, -1F, 0F, 2F, -1F, 0F, 2F, -1F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 116
		deltic2Model[47].setRotationPoint(-11F, -13F, -35F);

		deltic2Model[48].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F, 2F, -1F, 0F, -2F, -1F, 0F, -2F, -1F, 0F, 2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 117
		deltic2Model[48].setRotationPoint(10F, -13F, 34F);

		deltic2Model[49].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F, 2F, -1F, 0F, -2F, -1F, 0F, -2F, -1F, 0F, 2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 118
		deltic2Model[49].setRotationPoint(10F, -13F, -35F);

		deltic2Model[50].addBox(0F, 0F, 0F, 20, 8, 1, 0F); // Box 119
		deltic2Model[50].setRotationPoint(-10F, -7F, 29F);

		deltic2Model[51].addShapeBox(0F, 0F, 0F, 20, 7, 1, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 120
		deltic2Model[51].setRotationPoint(-10F, -14F, 29F);

		deltic2Model[52].addBox(0F, 0F, 0F, 20, 8, 1, 0F); // Box 121
		deltic2Model[52].setRotationPoint(-10F, -7F, -30F);

		deltic2Model[53].addShapeBox(0F, 0F, 0F, 20, 7, 1, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 122
		deltic2Model[53].setRotationPoint(-10F, -14F, -30F);

		deltic2Model[54].addShapeBox(0F, 0F, 0F, 1, 2, 12, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 123
		deltic2Model[54].setRotationPoint(-9F, -14F, -42F);

		deltic2Model[55].addShapeBox(0F, 0F, 0F, 1, 2, 12, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 124
		deltic2Model[55].setRotationPoint(8F, -14F, 30F);

		deltic2Model[56].addShapeBox(0F, 0F, 0F, 1, 2, 12, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 125
		deltic2Model[56].setRotationPoint(8F, -14F, -42F);

		deltic2Model[57].addShapeBox(0F, 0F, 0F, 15, 10, 56, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 126
		deltic2Model[57].setRotationPoint(-7.5F, -9F, -28F);

		deltic2Model[58].addBox(0F, 0F, 0F, 3, 4, 20, 0F); // Box 178
		deltic2Model[58].setRotationPoint(-11F, 12F, 1F);

		deltic2Model[59].addBox(0F, 0F, 0F, 3, 4, 20, 0F); // Box 179
		deltic2Model[59].setRotationPoint(-11F, 12F, -21F);

		deltic2Model[60].addBox(0F, 0F, 0F, 3, 4, 20, 0F); // Box 180
		deltic2Model[60].setRotationPoint(8F, 12F, 1F);

		deltic2Model[61].addBox(0F, 0F, 0F, 3, 4, 20, 0F); // Box 181
		deltic2Model[61].setRotationPoint(8F, 12F, -21F);

		deltic2Model[62].addBox(0F, 0F, 0F, 16, 4, 46, 0F); // Box 182
		deltic2Model[62].setRotationPoint(-8F, 11F, -23F);

		deltic2Model[63].addShapeBox(0F, 0F, 0F, 0, 8, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 183
		deltic2Model[63].setRotationPoint(-10.5F, -7F, 30F);

		deltic2Model[64].addShapeBox(0F, 0F, 0F, 0, 6, 4, 0F, -2F, -1F, 0F, 2F, -1F, 0F, 2F, -1F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 185
		deltic2Model[64].setRotationPoint(-10.5F, -13F, 30F);

		deltic2Model[65].addShapeBox(0F, 0F, 0F, 0, 8, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 186
		deltic2Model[65].setRotationPoint(-10.5F, -7F, -34F);

		deltic2Model[66].addShapeBox(0F, 0F, 0F, 0, 6, 4, 0F, -2F, -1F, 0F, 2F, -1F, 0F, 2F, -1F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 187
		deltic2Model[66].setRotationPoint(-10.5F, -13F, -34F);

		deltic2Model[67].addShapeBox(0F, 0F, 0F, 0, 6, 4, 0F, 2F, -1F, 0F, -2F, -1F, 0F, -2F, -1F, 0F, 2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 188
		deltic2Model[67].setRotationPoint(10.5F, -13F, -34F);

		deltic2Model[68].addShapeBox(0F, 0F, 0F, 0, 8, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 189
		deltic2Model[68].setRotationPoint(10.5F, -7F, -34F);

		deltic2Model[69].addShapeBox(0F, 0F, 0F, 0, 8, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 190
		deltic2Model[69].setRotationPoint(10.5F, -7F, 30F);

		deltic2Model[70].addShapeBox(0F, 0F, 0F, 0, 6, 4, 0F, 2F, -1F, 0F, -2F, -1F, 0F, -2F, -1F, 0F, 2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 191
		deltic2Model[70].setRotationPoint(10.5F, -13F, 30F);

		deltic2Model[71].addBox(0F, 0F, 0F, 2, 2, 3, 0F); // Box 192
		deltic2Model[71].setRotationPoint(6.5F, 9F, 55F);

		deltic2Model[72].addBox(0F, 0F, 0F, 2, 2, 3, 0F); // Box 193
		deltic2Model[72].setRotationPoint(-8.5F, 9F, 55F);

		deltic2Model[73].addBox(0F, 0F, 0F, 4, 3, 1, 0F); // Box 194
		deltic2Model[73].setRotationPoint(5.5F, 8.5F, 58F);

		deltic2Model[74].addBox(0F, 0F, 0F, 4, 3, 1, 0F); // Box 195
		deltic2Model[74].setRotationPoint(-9.5F, 8.5F, 58F);

		deltic2Model[75].addBox(0F, 0F, 0F, 2, 2, 3, 0F); // Box 196
		deltic2Model[75].setRotationPoint(-8.5F, 9F, -58F);

		deltic2Model[76].addBox(0F, 0F, 0F, 2, 2, 3, 0F); // Box 197
		deltic2Model[76].setRotationPoint(6.5F, 9F, -58F);

		deltic2Model[77].addBox(0F, 0F, 0F, 4, 3, 1, 0F); // Box 198
		deltic2Model[77].setRotationPoint(5.5F, 8.5F, -59F);

		deltic2Model[78].addBox(0F, 0F, 0F, 4, 3, 1, 0F); // Box 199
		deltic2Model[78].setRotationPoint(-9.5F, 8.5F, -59F);

		deltic2Model[79].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 200
		deltic2Model[79].setRotationPoint(-1F, 9F, 55F);

		deltic2Model[80].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 201
		deltic2Model[80].setRotationPoint(-0.5F, 9F, 57F);

		deltic2Model[81].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 202
		deltic2Model[81].setRotationPoint(-0.5F, 10F, 58F);

		deltic2Model[82].addBox(0F, 0F, 0F, 1, 1, 0, 0F); // Box 203
		deltic2Model[82].setRotationPoint(-0.5F, 9F, 59F);

		deltic2Model[83].addBox(0F, 0F, 0F, 0, 2, 1, 0F); // Box 204
		deltic2Model[83].setRotationPoint(-2F, 9F, 55F);

		deltic2Model[84].addBox(0F, 0F, 0F, 0, 1, 1, 0F); // Box 205
		deltic2Model[84].setRotationPoint(-2F, 11F, 55.5F);

		deltic2Model[85].addBox(0F, 0F, 0F, 1, 0, 1, 0F); // Box 207
		deltic2Model[85].setRotationPoint(-3F, 12F, 55.5F);

		deltic2Model[86].addBox(0F, 0F, 0F, 0, 4, 1, 0F); // Box 208
		deltic2Model[86].setRotationPoint(-3F, 8F, 56F);

		deltic2Model[87].addBox(0F, 0F, 0F, 0, 4, 1, 0F); // Box 210
		deltic2Model[87].setRotationPoint(4F, 8F, 56F);

		deltic2Model[88].addBox(0F, 0F, 0F, 0, 3, 1, 0F); // Box 211
		deltic2Model[88].setRotationPoint(4F, 11F, 55F);

		deltic2Model[89].addBox(0F, 0F, 0F, 1, 3, 0, 0F); // Box 212
		deltic2Model[89].setRotationPoint(-0.5F, 11F, 58F);

		deltic2Model[90].addBox(0F, 0F, 0F, 21, 2, 1, 0F); // Box 213
		deltic2Model[90].setRotationPoint(-10.5F, 11F, 54F);

		deltic2Model[91].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 214
		deltic2Model[91].setRotationPoint(-4F, 11.5F, 55F);

		deltic2Model[92].addBox(0F, 0F, 0F, 0, 2, 1, 0F); // Box 215
		deltic2Model[92].setRotationPoint(-3.5F, 12F, 56F);

		deltic2Model[93].addBox(0F, 0F, 0F, 2, 0, 1, 0F); // Box 216
		deltic2Model[93].setRotationPoint(-5.5F, 14F, 56F);

		deltic2Model[94].addBox(0F, 0F, 0F, 0, 2, 1, 0F); // Box 217
		deltic2Model[94].setRotationPoint(-5.5F, 12F, 56F);

		deltic2Model[95].addBox(0F, 0F, 0F, 1, 0, 2, 0F); // Box 218
		deltic2Model[95].setRotationPoint(-5.5F, 12F, 55F);

		deltic2Model[96].addBox(0F, 0F, 0F, 0, 2, 1, 0F); // Box 219
		deltic2Model[96].setRotationPoint(5.5F, 12F, -57F);

		deltic2Model[97].addBox(0F, 0F, 0F, 1, 0, 2, 0F); // Box 220
		deltic2Model[97].setRotationPoint(4.5F, 12F, -57F);

		deltic2Model[98].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 221
		deltic2Model[98].setRotationPoint(3F, 11.5F, -56F);

		deltic2Model[99].addBox(0F, 0F, 0F, 2, 0, 1, 0F); // Box 222
		deltic2Model[99].setRotationPoint(3.5F, 14F, -57F);

		deltic2Model[100].addBox(0F, 0F, 0F, 0, 2, 1, 0F); // Box 223
		deltic2Model[100].setRotationPoint(3.5F, 12F, -57F);

		deltic2Model[101].addBox(0F, 0F, 0F, 0, 4, 1, 0F); // Box 224
		deltic2Model[101].setRotationPoint(3F, 8F, -57F);

		deltic2Model[102].addBox(0F, 0F, 0F, 1, 0, 1, 0F); // Box 225
		deltic2Model[102].setRotationPoint(2F, 12F, -56.5F);

		deltic2Model[103].addBox(0F, 0F, 0F, 0, 1, 1, 0F); // Box 226
		deltic2Model[103].setRotationPoint(2F, 11F, -56.5F);

		deltic2Model[104].addBox(0F, 0F, 0F, 0, 2, 1, 0F); // Box 227
		deltic2Model[104].setRotationPoint(2F, 9F, -56F);

		deltic2Model[105].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 228
		deltic2Model[105].setRotationPoint(-1F, 9F, -57F);

		deltic2Model[106].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 229
		deltic2Model[106].setRotationPoint(-0.5F, 9F, -58F);

		deltic2Model[107].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 230
		deltic2Model[107].setRotationPoint(-0.5F, 10F, -59F);

		deltic2Model[108].addBox(0F, 0F, 0F, 1, 1, 0, 0F); // Box 231
		deltic2Model[108].setRotationPoint(-0.5F, 9F, -59F);

		deltic2Model[109].addBox(0F, 0F, 0F, 1, 3, 0, 0F); // Box 232
		deltic2Model[109].setRotationPoint(-0.5F, 11F, -58F);

		deltic2Model[110].addBox(0F, 0F, 0F, 0, 3, 1, 0F); // Box 233
		deltic2Model[110].setRotationPoint(-4F, 11F, -56F);

		deltic2Model[111].addBox(0F, 0F, 0F, 0, 4, 1, 0F); // Box 234
		deltic2Model[111].setRotationPoint(-4F, 8F, -57F);

		deltic2Model[112].addBox(0F, 0F, 0F, 21, 2, 1, 0F); // Box 235
		deltic2Model[112].setRotationPoint(-10.5F, 11F, -55F);

		deltic2Model[113].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 243
		deltic2Model[113].setRotationPoint(-7.5F, -8F, 41F);

		deltic2Model[114].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 244
		deltic2Model[114].setRotationPoint(-5F, -8F, 41F);

		deltic2Model[115].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 245
		deltic2Model[115].setRotationPoint(-2.5F, -8F, 41F);

		deltic2Model[116].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 246
		deltic2Model[116].setRotationPoint(-7.5F, -5.5F, 41F);

		deltic2Model[117].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 247
		deltic2Model[117].setRotationPoint(-5F, -5.5F, 41F);

		deltic2Model[118].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 248
		deltic2Model[118].setRotationPoint(-2.5F, -5.5F, 41F);

		deltic2Model[119].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 249
		deltic2Model[119].setRotationPoint(-10F, -5F, 37F);

		deltic2Model[120].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 250
		deltic2Model[120].setRotationPoint(-9.5F, -6F, 37.5F);

		deltic2Model[121].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 251
		deltic2Model[121].setRotationPoint(-9.5F, -6.25F, 38.5F);

		deltic2Model[122].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 253
		deltic2Model[122].setRotationPoint(8F, -5F, 37F);

		deltic2Model[123].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 254
		deltic2Model[123].setRotationPoint(8.5F, -6F, 37.5F);

		deltic2Model[124].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 255
		deltic2Model[124].setRotationPoint(8.5F, -6.25F, 38.5F);

		deltic2Model[125].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 257
		deltic2Model[125].setRotationPoint(1.5F, -8F, 41F);

		deltic2Model[126].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 258
		deltic2Model[126].setRotationPoint(3F, -8F, 41F);

		deltic2Model[127].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 259
		deltic2Model[127].setRotationPoint(6F, -8F, 41F);

		deltic2Model[128].addShapeBox(0F, 0F, 0F, 6, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 260
		deltic2Model[128].setRotationPoint(0.5F, -5F, 39F);

		deltic2Model[129].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 261
		deltic2Model[129].setRotationPoint(1.5F, -6F, 40F);

		deltic2Model[130].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 262
		deltic2Model[130].setRotationPoint(8F, -5F, -42F);

		deltic2Model[131].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 263
		deltic2Model[131].setRotationPoint(8.5F, -6F, -38.5F);

		deltic2Model[132].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 264
		deltic2Model[132].setRotationPoint(8.5F, -6.25F, -40.5F);

		deltic2Model[133].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 265
		deltic2Model[133].setRotationPoint(5.5F, -5.5F, -42F);

		deltic2Model[134].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 266
		deltic2Model[134].setRotationPoint(5.5F, -8F, -42F);

		deltic2Model[135].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 267
		deltic2Model[135].setRotationPoint(3F, -5.5F, -42F);

		deltic2Model[136].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 268
		deltic2Model[136].setRotationPoint(3F, -8F, -42F);

		deltic2Model[137].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 269
		deltic2Model[137].setRotationPoint(0.5F, -5.5F, -42F);

		deltic2Model[138].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 270
		deltic2Model[138].setRotationPoint(0.5F, -8F, -42F);

		deltic2Model[139].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 272
		deltic2Model[139].setRotationPoint(-2.5F, -8F, -42F);

		deltic2Model[140].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 273
		deltic2Model[140].setRotationPoint(-4F, -8F, -42F);

		deltic2Model[141].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 274
		deltic2Model[141].setRotationPoint(-8F, -8F, -42F);

		deltic2Model[142].addShapeBox(0F, 0F, 0F, 6, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 275
		deltic2Model[142].setRotationPoint(-6.5F, -5F, -42F);

		deltic2Model[143].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 276
		deltic2Model[143].setRotationPoint(-5.5F, -6F, -41F);

		deltic2Model[144].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 277
		deltic2Model[144].setRotationPoint(-10F, -5F, -42F);

		deltic2Model[145].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 278
		deltic2Model[145].setRotationPoint(-9.5F, -6F, -38.5F);

		deltic2Model[146].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 279
		deltic2Model[146].setRotationPoint(-9.5F, -6.25F, -40.5F);

		deltic2Model[147].addBox(0F, 0F, 0F, 1, 1, 4, 0F); // Box 280
		deltic2Model[147].setRotationPoint(-12F, 3F, 30F);

		deltic2Model[148].addBox(0F, 0F, 0F, 1, 1, 4, 0F); // Box 281
		deltic2Model[148].setRotationPoint(-12F, 3F, -34F);

		deltic2Model[149].addBox(0F, 0F, 0F, 1, 1, 4, 0F); // Box 200
		deltic2Model[149].setRotationPoint(11F, 3F, -34F);

		deltic2Model[150].addBox(0F, 0F, 0F, 1, 1, 4, 0F); // Box 201
		deltic2Model[150].setRotationPoint(11F, 3F, 30F);

		deltic2Model[151].addBox(0F, 0F, 0F, 10, 9, 1, 0F); // Box 200
		deltic2Model[151].setRotationPoint(-5F, -10F, 32F);
		deltic2Model[151].rotateAngleX = 0.08726646F;

		deltic2Model[152].addBox(0F, 0F, 0F, 10, 1, 8, 0F); // Box 201
		deltic2Model[152].setRotationPoint(-5F, -1F, 33F);

		deltic2Model[153].addBox(0F, 0F, 0F, 10, 1, 8, 0F); // Box 202
		deltic2Model[153].setRotationPoint(-5F, -1F, -41F);

		deltic2Model[154].addBox(0F, 0F, 0F, 10, 9, 1, 0F); // Box 203
		deltic2Model[154].setRotationPoint(-5F, -10F, -33F);
		deltic2Model[154].rotateAngleX = -0.08726646F;

		deltic2Model[155].addShapeBox(0F, 0F, 0F, 1, 7, 16, 0F, 0F, -4F, -4F, 0F, -4F, -4F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 172
		deltic2Model[155].setRotationPoint(10F, -11F, -10F);

		deltic2Model[156].addBox(0F, 0F, 0F, 1, 4, 9, 0F); // Box 174
		deltic2Model[156].setRotationPoint(-11.25F, 1F, 44F);

		deltic2Model[157].addBox(0F, 0F, 0F, 1, 5, 9, 0F); // Box 176
		deltic2Model[157].setRotationPoint(-11.25F, -4F, 44F);

		deltic2Model[158].addBox(0F, 0F, 0F, 1, 4, 9, 0F); // Box 172
		deltic2Model[158].setRotationPoint(10.25F, 1F, -53.5F);

		deltic2Model[159].addBox(0F, 0F, 0F, 1, 5, 9, 0F); // Box 173
		deltic2Model[159].setRotationPoint(10.25F, -4F, -53.5F);

		deltic2Model[160].addShapeBox(0F, 0F, 0F, 3, 1, 7, 0F, -1F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 174
		deltic2Model[160].setRotationPoint(-11F, -7F, 46F);

		deltic2Model[161].addShapeBox(0F, 0F, 0F, 16, 2, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 175
		deltic2Model[161].setRotationPoint(-8F, -8F, 46F);

		deltic2Model[162].addShapeBox(0F, 0F, 0F, 3, 1, 7, 0F, 0F, 1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 179
		deltic2Model[162].setRotationPoint(8F, -7F, 46F);

		deltic2Model[163].addShapeBox(0F, 0F, 0F, 2, 13, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F); // Box 182
		deltic2Model[163].setRotationPoint(-11F, -6F, 54F);

		deltic2Model[164].addShapeBox(0F, 0F, 0F, 2, 13, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F); // Box 183
		deltic2Model[164].setRotationPoint(9F, -6F, 54F);

		deltic2Model[165].addShapeBox(0F, 0F, 0F, 18, 13, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 184
		deltic2Model[165].setRotationPoint(-9F, -6F, 54F);

		deltic2Model[166].addShapeBox(0F, 0F, 0F, 16, 1, 3, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 187
		deltic2Model[166].setRotationPoint(-8F, -7F, 53F);

		deltic2Model[167].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, -1F, -2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F); // Box 192
		deltic2Model[167].setRotationPoint(-11F, -8F, 53F);

		deltic2Model[168].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -2F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F); // Box 193
		deltic2Model[168].setRotationPoint(8F, -8F, 53F);

		deltic2Model[169].addShapeBox(0F, 0F, 0F, 18, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 194
		deltic2Model[169].setRotationPoint(-9F, 7F, 54F);

		deltic2Model[170].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, -2F); // Box 195
		deltic2Model[170].setRotationPoint(-11F, 7F, 54.1F);

		deltic2Model[171].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, -2F); // Box 197
		deltic2Model[171].setRotationPoint(9F, 7F, 54.1F);

		deltic2Model[172].addShapeBox(0F, 0F, 0F, 16, 2, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 198
		deltic2Model[172].setRotationPoint(-8F, -8F, -53F);

		deltic2Model[173].addShapeBox(0F, 0F, 0F, 3, 1, 7, 0F, -1F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 199
		deltic2Model[173].setRotationPoint(-11F, -7F, -53F);

		deltic2Model[174].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F, -1F, -2F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 200
		deltic2Model[174].setRotationPoint(-11F, -8F, -56F);

		deltic2Model[175].addShapeBox(0F, 0F, 0F, 16, 1, 3, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 201
		deltic2Model[175].setRotationPoint(-8F, -7F, -56F);

		deltic2Model[176].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F, 0F, -1F, -1F, -1F, -2F, -1F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 202
		deltic2Model[176].setRotationPoint(8F, -8F, -56F);

		deltic2Model[177].addShapeBox(0F, 0F, 0F, 3, 1, 7, 0F, 0F, 1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 203
		deltic2Model[177].setRotationPoint(8F, -7F, -53F);

		deltic2Model[178].addShapeBox(0F, 0F, 0F, 2, 13, 2, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 204
		deltic2Model[178].setRotationPoint(-11F, -6F, -56F);

		deltic2Model[179].addShapeBox(0F, 0F, 0F, 22, 7, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 205
		deltic2Model[179].setRotationPoint(-11F, -6F, -54F);

		deltic2Model[180].addShapeBox(0F, 0F, 0F, 18, 13, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 206
		deltic2Model[180].setRotationPoint(-9F, -6F, -56F);

		deltic2Model[181].addShapeBox(0F, 0F, 0F, 2, 13, 2, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 207
		deltic2Model[181].setRotationPoint(9F, -6F, -56F);

		deltic2Model[182].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 208
		deltic2Model[182].setRotationPoint(9F, 7F, -56.1F);

		deltic2Model[183].addShapeBox(0F, 0F, 0F, 18, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 209
		deltic2Model[183].setRotationPoint(-9F, 7F, -56F);

		deltic2Model[184].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 210
		deltic2Model[184].setRotationPoint(-11F, 7F, -56.1F);

		deltic2Model[185].addShapeBox(0F, 0F, 0F, 3, 1, 86, 0F, 0F, 1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 212
		deltic2Model[185].setRotationPoint(5F, -15F, -43F);

		deltic2Model[186].addShapeBox(0F, 0F, 0F, 4, 1, 86, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 216
		deltic2Model[186].setRotationPoint(1F, -17F, -43F);

		deltic2Model[187].addShapeBox(0F, 0F, 0F, 4, 1, 86, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 217
		deltic2Model[187].setRotationPoint(-5F, -17F, -43F);

		deltic2Model[188].addShapeBox(0F, 0F, 0F, 10, 2, 86, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 219
		deltic2Model[188].setRotationPoint(-5F, -16F, -43F);

		deltic2Model[189].addShapeBox(0F, 0F, 0F, 2, 1, 86, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 220
		deltic2Model[189].setRotationPoint(-1F, -17F, -43F);

		deltic2Model[190].addShapeBox(0F, 0F, 0F, 13, 1, 13, 0F, -7F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, -7F, 0F, 0F); // Box 190
		deltic2Model[190].setRotationPoint(-10F, -17.25F, 13F);

		deltic2Model[191].addShapeBox(0F, 0F, 0F, 13, 1, 13, 0F, -7F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, -7F, 0F, 0F); // Box 191
		deltic2Model[191].setRotationPoint(-10F, -17.25F, 0F);

		deltic2Model[192].addShapeBox(0F, 0F, 0F, 13, 1, 13, 0F, -7F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, -7F, 0F, 0F); // Box 192
		deltic2Model[192].setRotationPoint(-10F, -17.25F, -21F);

		deltic2Model[193].addShapeBox(0F, 0F, 0F, 13, 1, 13, 0F, -7F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, -7F, 0F, 0F); // Box 193
		deltic2Model[193].setRotationPoint(-10F, -17.25F, -34F);

		deltic2Model[194].addShapeBox(0F, 0F, 0F, 9, 1, 9, 0F, -7F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, -7F, 0F, 0F); // Box 194
		deltic2Model[194].setRotationPoint(-6F, -17.25F, -12F);

		deltic2Model[195].addShapeBox(0F, 0F, 0F, 9, 1, 9, 0F, -7F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, -7F, 0F, 0F); // Box 195
		deltic2Model[195].setRotationPoint(-10F, -17.25F, -12F);

		deltic2Model[196].addShapeBox(0F, 0F, 0F, 9, 1, 9, 0F, -7F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, -7F, 0F, 0F); // Box 196
		deltic2Model[196].setRotationPoint(-10F, -17.25F, -5F);


	}
	private ModelDeltic_Bogie fronttrucks = new ModelDeltic_Bogie();
	private ModelDeltic_Bogie backtrucks = new ModelDeltic_Bogie();

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		for(int i = 0; i < 197; i++)
		{

			if (i==22 || i==24 || i==23 || i== 27 || i==25 || i==26){
				Minecraft.getMinecraft().entityRenderer.disableLightmap(1D);
			}
			deltic2Model[i].render(f5);
			if (i==22 || i==24 || i==23 || i== 27 || i==25 || i==26){
				Minecraft.getMinecraft().entityRenderer.enableLightmap(1D);
			}
		}

		Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/deltic_bogie.png"));
		GL11.glPushMatrix();
		GL11.glTranslated(0.06, 0.25, -2.9);
		fronttrucks.render(entity,f,f1,f2,f3,f4,f5);
		GL11.glPopMatrix();

		GL11.glPushMatrix();
		GL11.glTranslated(0.06, 0.25, 1.9);
		backtrucks.render(entity,f,f1,f2,f3,f4,f5);
		GL11.glPopMatrix();
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
	{
	}

	public ModelRendererTurbo deltic2Model[];
}