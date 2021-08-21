//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 04.03.2020 - 23:04:42
// Last changed on: 04.03.2020 - 23:04:42

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

public class ModelGP7BAP extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 256;

	public ModelGP7BAP() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[304];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 1
		bodyModel[1] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 3
		bodyModel[2] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 266
		bodyModel[3] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 271
		bodyModel[4] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 272
		bodyModel[5] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 273
		bodyModel[6] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 275
		bodyModel[7] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 276
		bodyModel[8] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 271
		bodyModel[9] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 272
		bodyModel[10] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 273
		bodyModel[11] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 274
		bodyModel[12] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 275
		bodyModel[13] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 276
		bodyModel[14] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 143
		bodyModel[15] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 62
		bodyModel[16] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 61
		bodyModel[17] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 63
		bodyModel[18] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 4
		bodyModel[19] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 78
		bodyModel[20] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 188
		bodyModel[21] = new ModelRendererTurbo(this, 329, 1, textureX, textureY, "lamp"); // Box 189 lamp
		bodyModel[22] = new ModelRendererTurbo(this, 337, 1, textureX, textureY, "lamp"); // Box 190 lamp
		bodyModel[23] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 4
		bodyModel[24] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 4
		bodyModel[25] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 4
		bodyModel[26] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 4
		bodyModel[27] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 4
		bodyModel[28] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 4
		bodyModel[29] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 2
		bodyModel[30] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 3
		bodyModel[31] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 266
		bodyModel[32] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 271
		bodyModel[33] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 272
		bodyModel[34] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 273
		bodyModel[35] = new ModelRendererTurbo(this, 161, 9, textureX, textureY); // Box 274
		bodyModel[36] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 275
		bodyModel[37] = new ModelRendererTurbo(this, 209, 9, textureX, textureY); // Box 271
		bodyModel[38] = new ModelRendererTurbo(this, 185, 9, textureX, textureY); // Box 272
		bodyModel[39] = new ModelRendererTurbo(this, 233, 9, textureX, textureY); // Box 273
		bodyModel[40] = new ModelRendererTurbo(this, 249, 9, textureX, textureY); // Box 274
		bodyModel[41] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 275
		bodyModel[42] = new ModelRendererTurbo(this, 265, 9, textureX, textureY); // Box 276
		bodyModel[43] = new ModelRendererTurbo(this, 289, 9, textureX, textureY); // Box 5
		bodyModel[44] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 143
		bodyModel[45] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 61
		bodyModel[46] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 62
		bodyModel[47] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 63
		bodyModel[48] = new ModelRendererTurbo(this, 474, 108, textureX, textureY); // Box 4
		bodyModel[49] = new ModelRendererTurbo(this, 321, 9, textureX, textureY); // Box 4
		bodyModel[50] = new ModelRendererTurbo(this, 337, 17, textureX, textureY); // Box 4
		bodyModel[51] = new ModelRendererTurbo(this, 369, 17, textureX, textureY); // Box 4
		bodyModel[52] = new ModelRendererTurbo(this, 281, 17, textureX, textureY); // Box 4
		bodyModel[53] = new ModelRendererTurbo(this, 401, 17, textureX, textureY); // Box 4
		bodyModel[54] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 2
		bodyModel[55] = new ModelRendererTurbo(this, 337, 9, textureX, textureY); // Box 214
		bodyModel[56] = new ModelRendererTurbo(this, 9, 9, textureX, textureY); // Box 209
		bodyModel[57] = new ModelRendererTurbo(this, 201, 17, textureX, textureY); // Box 210
		bodyModel[58] = new ModelRendererTurbo(this, 217, 9, textureX, textureY); // Box 211
		bodyModel[59] = new ModelRendererTurbo(this, 433, 17, textureX, textureY); // Box 4
		bodyModel[60] = new ModelRendererTurbo(this, 305, 25, textureX, textureY); // Box 4
		bodyModel[61] = new ModelRendererTurbo(this, 441, 17, textureX, textureY); // Box 214
		bodyModel[62] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 215
		bodyModel[63] = new ModelRendererTurbo(this, 481, 25, textureX, textureY); // Box 216
		bodyModel[64] = new ModelRendererTurbo(this, 49, 33, textureX, textureY); // Box 217
		bodyModel[65] = new ModelRendererTurbo(this, 73, 33, textureX, textureY); // Box 218
		bodyModel[66] = new ModelRendererTurbo(this, 89, 33, textureX, textureY); // Box 219
		bodyModel[67] = new ModelRendererTurbo(this, 113, 33, textureX, textureY); // Box 220
		bodyModel[68] = new ModelRendererTurbo(this, 129, 33, textureX, textureY); // Box 221
		bodyModel[69] = new ModelRendererTurbo(this, 153, 33, textureX, textureY); // Box 223
		bodyModel[70] = new ModelRendererTurbo(this, 273, 41, textureX, textureY); // Box 333
		bodyModel[71] = new ModelRendererTurbo(this, 257, 33, textureX, textureY); // Box 39
		bodyModel[72] = new ModelRendererTurbo(this, 254, 126, textureX, textureY); // Box 119
		bodyModel[73] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 125
		bodyModel[74] = new ModelRendererTurbo(this, 441, 49, textureX, textureY); // Box 9
		bodyModel[75] = new ModelRendererTurbo(this, 473, 49, textureX, textureY); // Box 10
		bodyModel[76] = new ModelRendererTurbo(this, 57, 49, textureX, textureY); // Box 15
		bodyModel[77] = new ModelRendererTurbo(this, 449, 49, textureX, textureY); // Box 21
		bodyModel[78] = new ModelRendererTurbo(this, 425, 33, textureX, textureY); // Box 314 door swing right
		bodyModel[79] = new ModelRendererTurbo(this, 105, 57, textureX, textureY); // Box 315 door swing right
		bodyModel[80] = new ModelRendererTurbo(this, 249, 57, textureX, textureY); // Box 344
		bodyModel[81] = new ModelRendererTurbo(this, 297, 57, textureX, textureY); // Box 345
		bodyModel[82] = new ModelRendererTurbo(this, 329, 57, textureX, textureY); // Box 346
		bodyModel[83] = new ModelRendererTurbo(this, 397, 123, textureX, textureY); // Box 347
		bodyModel[84] = new ModelRendererTurbo(this, 361, 57, textureX, textureY); // Box 348
		bodyModel[85] = new ModelRendererTurbo(this, 205, 118, textureX, textureY); // Box 349
		bodyModel[86] = new ModelRendererTurbo(this, 51, 122, textureX, textureY); // Box 350
		bodyModel[87] = new ModelRendererTurbo(this, 452, 112, textureX, textureY); // Box 351
		bodyModel[88] = new ModelRendererTurbo(this, 361, 17, textureX, textureY); // Box 352
		bodyModel[89] = new ModelRendererTurbo(this, 121, 65, textureX, textureY); // Box 353
		bodyModel[90] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 265
		bodyModel[91] = new ModelRendererTurbo(this, 433, 1, textureX, textureY, "lamp"); // Box 247 lamp
		bodyModel[92] = new ModelRendererTurbo(this, 479, 91, textureX, textureY); // Box 357
		bodyModel[93] = new ModelRendererTurbo(this, 81, 65, textureX, textureY); // Box 358
		bodyModel[94] = new ModelRendererTurbo(this, 217, 9, textureX, textureY, "lamp"); // Box 359 lamp
		bodyModel[95] = new ModelRendererTurbo(this, 136, 110, textureX, textureY); // Box 360
		bodyModel[96] = new ModelRendererTurbo(this, 353, 65, textureX, textureY); // Box 362
		bodyModel[97] = new ModelRendererTurbo(this, 489, 65, textureX, textureY); // Box 363
		bodyModel[98] = new ModelRendererTurbo(this, 129, 65, textureX, textureY); // Box 364
		bodyModel[99] = new ModelRendererTurbo(this, 241, 9, textureX, textureY); // Box 365
		bodyModel[100] = new ModelRendererTurbo(this, 257, 9, textureX, textureY); // Box 366
		bodyModel[101] = new ModelRendererTurbo(this, 321, 9, textureX, textureY); // Box 239
		bodyModel[102] = new ModelRendererTurbo(this, 497, 9, textureX, textureY, "lamp"); // Box 240 lamp
		bodyModel[103] = new ModelRendererTurbo(this, 1, 17, textureX, textureY, "lamp"); // Box 241 lamp
		bodyModel[104] = new ModelRendererTurbo(this, 281, 17, textureX, textureY); // Box 242
		bodyModel[105] = new ModelRendererTurbo(this, 201, 9, textureX, textureY); // Box 371
		bodyModel[106] = new ModelRendererTurbo(this, 393, 17, textureX, textureY); // Box 372
		bodyModel[107] = new ModelRendererTurbo(this, 457, 17, textureX, textureY); // Box 373
		bodyModel[108] = new ModelRendererTurbo(this, 145, 73, textureX, textureY); // Box 374
		bodyModel[109] = new ModelRendererTurbo(this, 393, 33, textureX, textureY); // Box 484
		bodyModel[110] = new ModelRendererTurbo(this, 177, 73, textureX, textureY); // Box 486
		bodyModel[111] = new ModelRendererTurbo(this, 49, 81, textureX, textureY); // Box 487
		bodyModel[112] = new ModelRendererTurbo(this, 201, 73, textureX, textureY); // Box 488
		bodyModel[113] = new ModelRendererTurbo(this, 297, 73, textureX, textureY); // Box 489
		bodyModel[114] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 490
		bodyModel[115] = new ModelRendererTurbo(this, 233, 17, textureX, textureY); // Box 491
		bodyModel[116] = new ModelRendererTurbo(this, 273, 17, textureX, textureY); // Box 492
		bodyModel[117] = new ModelRendererTurbo(this, 401, 17, textureX, textureY); // Box 493
		bodyModel[118] = new ModelRendererTurbo(this, 353, 81, textureX, textureY); // Box 38R
		bodyModel[119] = new ModelRendererTurbo(this, 425, 81, textureX, textureY); // Box 176
		bodyModel[120] = new ModelRendererTurbo(this, 505, 17, textureX, textureY); // Box 243
		bodyModel[121] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 250
		bodyModel[122] = new ModelRendererTurbo(this, 73, 81, textureX, textureY); // Box 498
		bodyModel[123] = new ModelRendererTurbo(this, 145, 81, textureX, textureY); // Box 499
		bodyModel[124] = new ModelRendererTurbo(this, 153, 33, textureX, textureY); // Box 500
		bodyModel[125] = new ModelRendererTurbo(this, 273, 41, textureX, textureY); // Box 503
		bodyModel[126] = new ModelRendererTurbo(this, 425, 17, textureX, textureY); // Box 131
		bodyModel[127] = new ModelRendererTurbo(this, 49, 57, textureX, textureY); // Box 132
		bodyModel[128] = new ModelRendererTurbo(this, 329, 25, textureX, textureY); // Box 133
		bodyModel[129] = new ModelRendererTurbo(this, 9, 33, textureX, textureY); // Box 134
		bodyModel[130] = new ModelRendererTurbo(this, 473, 25, textureX, textureY); // Box 135
		bodyModel[131] = new ModelRendererTurbo(this, 105, 81, textureX, textureY); // Box 136
		bodyModel[132] = new ModelRendererTurbo(this, 369, 73, textureX, textureY); // Box 137
		bodyModel[133] = new ModelRendererTurbo(this, 417, 73, textureX, textureY); // Box 138
		bodyModel[134] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 139
		bodyModel[135] = new ModelRendererTurbo(this, 233, 9, textureX, textureY); // Box 140
		bodyModel[136] = new ModelRendererTurbo(this, 433, 17, textureX, textureY); // Box 141
		bodyModel[137] = new ModelRendererTurbo(this, 305, 25, textureX, textureY); // Box 142
		bodyModel[138] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 114
		bodyModel[139] = new ModelRendererTurbo(this, 481, 25, textureX, textureY); // Box 74
		bodyModel[140] = new ModelRendererTurbo(this, 497, 25, textureX, textureY); // Box 78
		bodyModel[141] = new ModelRendererTurbo(this, 401, 9, textureX, textureY); // Box 875
		bodyModel[142] = new ModelRendererTurbo(this, 297, 17, textureX, textureY); // Box 876
		bodyModel[143] = new ModelRendererTurbo(this, 257, 9, textureX, textureY); // Box 877
		bodyModel[144] = new ModelRendererTurbo(this, 41, 33, textureX, textureY, "lamp"); // Box 149 lamp
		bodyModel[145] = new ModelRendererTurbo(this, 297, 33, textureX, textureY); // Box 150
		bodyModel[146] = new ModelRendererTurbo(this, 65, 33, textureX, textureY, "lamp"); // Box 151 lamp
		bodyModel[147] = new ModelRendererTurbo(this, 177, 81, textureX, textureY); // Box 152
		bodyModel[148] = new ModelRendererTurbo(this, 157, 113, textureX, textureY); // Box 154
		bodyModel[149] = new ModelRendererTurbo(this, 150, 111, textureX, textureY); // Box 155
		bodyModel[150] = new ModelRendererTurbo(this, 473, 41, textureX, textureY); // Box 160
		bodyModel[151] = new ModelRendererTurbo(this, 257, 41, textureX, textureY); // Box 161
		bodyModel[152] = new ModelRendererTurbo(this, 257, 89, textureX, textureY); // Box 89
		bodyModel[153] = new ModelRendererTurbo(this, 17, 97, textureX, textureY); // Box 91
		bodyModel[154] = new ModelRendererTurbo(this, 65, 89, textureX, textureY); // Box 101
		bodyModel[155] = new ModelRendererTurbo(this, 137, 65, textureX, textureY); // Box 105
		bodyModel[156] = new ModelRendererTurbo(this, 377, 65, textureX, textureY); // Box 172
		bodyModel[157] = new ModelRendererTurbo(this, 281, 89, textureX, textureY); // Box 173
		bodyModel[158] = new ModelRendererTurbo(this, 41, 73, textureX, textureY); // Box 176
		bodyModel[159] = new ModelRendererTurbo(this, 249, 73, textureX, textureY); // Box 177
		bodyModel[160] = new ModelRendererTurbo(this, 193, 97, textureX, textureY); // Box 178
		bodyModel[161] = new ModelRendererTurbo(this, 297, 73, textureX, textureY); // Box 179
		bodyModel[162] = new ModelRendererTurbo(this, 433, 73, textureX, textureY); // Box 180
		bodyModel[163] = new ModelRendererTurbo(this, 225, 97, textureX, textureY); // Box 181
		bodyModel[164] = new ModelRendererTurbo(this, 201, 81, textureX, textureY); // Box 182
		bodyModel[165] = new ModelRendererTurbo(this, 497, 81, textureX, textureY); // Box 183
		bodyModel[166] = new ModelRendererTurbo(this, 81, 57, textureX, textureY); // Box 184
		bodyModel[167] = new ModelRendererTurbo(this, 121, 57, textureX, textureY); // Box 185
		bodyModel[168] = new ModelRendererTurbo(this, 121, 97, textureX, textureY); // Box 186
		bodyModel[169] = new ModelRendererTurbo(this, 281, 97, textureX, textureY); // Box 187
		bodyModel[170] = new ModelRendererTurbo(this, 305, 97, textureX, textureY); // Box 188
		bodyModel[171] = new ModelRendererTurbo(this, 329, 97, textureX, textureY); // Box 189
		bodyModel[172] = new ModelRendererTurbo(this, 321, 57, textureX, textureY); // Box 190
		bodyModel[173] = new ModelRendererTurbo(this, 353, 57, textureX, textureY); // Box 191
		bodyModel[174] = new ModelRendererTurbo(this, 3, 112, textureX, textureY); // Box 192
		bodyModel[175] = new ModelRendererTurbo(this, 113, 57, textureX, textureY); // Box 193
		bodyModel[176] = new ModelRendererTurbo(this, 51, 124, textureX, textureY); // Box 194
		bodyModel[177] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 195
		bodyModel[178] = new ModelRendererTurbo(this, 353, 97, textureX, textureY); // Box 196 winterization hatch
		bodyModel[179] = new ModelRendererTurbo(this, 177, 81, textureX, textureY); // Box 197
		bodyModel[180] = new ModelRendererTurbo(this, 7, 122, textureX, textureY); // Box 198
		bodyModel[181] = new ModelRendererTurbo(this, 321, 65, textureX, textureY); // Box 199
		bodyModel[182] = new ModelRendererTurbo(this, 105, 33, textureX, textureY); // Box 200
		bodyModel[183] = new ModelRendererTurbo(this, 145, 33, textureX, textureY); // Box 201
		bodyModel[184] = new ModelRendererTurbo(this, 33, 89, textureX, textureY); // Box 202
		bodyModel[185] = new ModelRendererTurbo(this, 177, 89, textureX, textureY); // Box 203
		bodyModel[186] = new ModelRendererTurbo(this, 49, 33, textureX, textureY); // Box 204
		bodyModel[187] = new ModelRendererTurbo(this, 89, 33, textureX, textureY); // Box 205
		bodyModel[188] = new ModelRendererTurbo(this, 497, 89, textureX, textureY); // Box 206
		bodyModel[189] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 207
		bodyModel[190] = new ModelRendererTurbo(this, 289, 33, textureX, textureY); // Box 208
		bodyModel[191] = new ModelRendererTurbo(this, 433, 33, textureX, textureY); // Box 209
		bodyModel[192] = new ModelRendererTurbo(this, 129, 33, textureX, textureY); // Box 210
		bodyModel[193] = new ModelRendererTurbo(this, 385, 97, textureX, textureY, "lamp"); // Box 211 erie large headlight
		bodyModel[194] = new ModelRendererTurbo(this, 505, 33, textureX, textureY, "lamp"); // Box 212 lamp
		bodyModel[195] = new ModelRendererTurbo(this, 401, 97, textureX, textureY, "lamp"); // Box 213 erie large headlight
		bodyModel[196] = new ModelRendererTurbo(this, 41, 41, textureX, textureY, "lamp"); // Box 214 lamp
		bodyModel[197] = new ModelRendererTurbo(this, 505, 41, textureX, textureY, "lamp"); // Box 215 lamp
		bodyModel[198] = new ModelRendererTurbo(this, 81, 49, textureX, textureY); // Box 216
		bodyModel[199] = new ModelRendererTurbo(this, 505, 49, textureX, textureY, "lamp"); // Box 217 lamp
		bodyModel[200] = new ModelRendererTurbo(this, 505, 57, textureX, textureY, "lamp"); // Box 218 lamp
		bodyModel[201] = new ModelRendererTurbo(this, 417, 97, textureX, textureY); // Box 219
		bodyModel[202] = new ModelRendererTurbo(this, 441, 65, textureX, textureY, "lamp"); // Box 220 lamp
		bodyModel[203] = new ModelRendererTurbo(this, 65, 97, textureX, textureY, "lamp"); // Box 221 lamp
		bodyModel[204] = new ModelRendererTurbo(this, 433, 97, textureX, textureY); // Box 222
		bodyModel[205] = new ModelRendererTurbo(this, 137, 97, textureX, textureY, "lamp"); // Box 223 lamp
		bodyModel[206] = new ModelRendererTurbo(this, 297, 97, textureX, textureY, "lamp"); // Box 224 lamp
		bodyModel[207] = new ModelRendererTurbo(this, 441, 97, textureX, textureY); // Box 225
		bodyModel[208] = new ModelRendererTurbo(this, 321, 97, textureX, textureY, "lamp"); // Box 226 lamp
		bodyModel[209] = new ModelRendererTurbo(this, 73, 97, textureX, textureY); // Box 227
		bodyModel[210] = new ModelRendererTurbo(this, 257, 33, textureX, textureY); // Box 228
		bodyModel[211] = new ModelRendererTurbo(this, 105, 97, textureX, textureY); // Box 230
		bodyModel[212] = new ModelRendererTurbo(this, 145, 97, textureX, textureY); // Box 231
		bodyModel[213] = new ModelRendererTurbo(this, 457, 97, textureX, textureY); // Box 232
		bodyModel[214] = new ModelRendererTurbo(this, 177, 97, textureX, textureY); // Box 233
		bodyModel[215] = new ModelRendererTurbo(this, 345, 97, textureX, textureY); // Box 234
		bodyModel[216] = new ModelRendererTurbo(this, 57, 105, textureX, textureY); // Box 235
		bodyModel[217] = new ModelRendererTurbo(this, 377, 97, textureX, textureY); // Box 236
		bodyModel[218] = new ModelRendererTurbo(this, 265, 41, textureX, textureY); // Box 237
		bodyModel[219] = new ModelRendererTurbo(this, 497, 97, textureX, textureY); // Box 238
		bodyModel[220] = new ModelRendererTurbo(this, 393, 57, textureX, textureY); // Box 239
		bodyModel[221] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 240
		bodyModel[222] = new ModelRendererTurbo(this, 97, 105, textureX, textureY); // Box 241
		bodyModel[223] = new ModelRendererTurbo(this, 113, 105, textureX, textureY); // Box 242
		bodyModel[224] = new ModelRendererTurbo(this, 10, 115, textureX, textureY); // Box 243
		bodyModel[225] = new ModelRendererTurbo(this, 129, 105, textureX, textureY); // Box 244
		bodyModel[226] = new ModelRendererTurbo(this, 137, 105, textureX, textureY); // Box 245
		bodyModel[227] = new ModelRendererTurbo(this, 94, 113, textureX, textureY); // Box 246
		bodyModel[228] = new ModelRendererTurbo(this, 409, 57, textureX, textureY); // Box 247
		bodyModel[229] = new ModelRendererTurbo(this, 153, 105, textureX, textureY); // Box 233 some other steam gen thing
		bodyModel[230] = new ModelRendererTurbo(this, 169, 105, textureX, textureY); // Box 234  steam gen exhaust
		bodyModel[231] = new ModelRendererTurbo(this, 185, 105, textureX, textureY); // Box 235 steam gen exhaust
		bodyModel[232] = new ModelRendererTurbo(this, 201, 105, textureX, textureY); // Box 236 steam gen exhaust
		bodyModel[233] = new ModelRendererTurbo(this, 425, 57, textureX, textureY); // Box 237
		bodyModel[234] = new ModelRendererTurbo(this, 121, 65, textureX, textureY); // Box 238
		bodyModel[235] = new ModelRendererTurbo(this, 217, 105, textureX, textureY); // Box 239
		bodyModel[236] = new ModelRendererTurbo(this, 233, 105, textureX, textureY); // Box 240
		bodyModel[237] = new ModelRendererTurbo(this, 11, 127, textureX, textureY); // Box 241
		bodyModel[238] = new ModelRendererTurbo(this, 241, 105, textureX, textureY); // Box 242 extended tank
		bodyModel[239] = new ModelRendererTurbo(this, 249, 105, textureX, textureY); // Box 243 extended tank
		bodyModel[240] = new ModelRendererTurbo(this, 281, 105, textureX, textureY); // Box 244 extended tank
		bodyModel[241] = new ModelRendererTurbo(this, 289, 105, textureX, textureY); // Box 245 extended tank
		bodyModel[242] = new ModelRendererTurbo(this, 385, 105, textureX, textureY); // Box 246 roof air tank
		bodyModel[243] = new ModelRendererTurbo(this, 121, 89, textureX, textureY); // Box 247 extra stack
		bodyModel[244] = new ModelRendererTurbo(this, 9, 97, textureX, textureY); // Box 248 extra stack
		bodyModel[245] = new ModelRendererTurbo(this, 433, 105, textureX, textureY); // Box 249 roof air tank
		bodyModel[246] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 250
		bodyModel[247] = new ModelRendererTurbo(this, 393, 17, textureX, textureY); // Box 251
		bodyModel[248] = new ModelRendererTurbo(this, 457, 17, textureX, textureY); // Box 252
		bodyModel[249] = new ModelRendererTurbo(this, 352, 112, textureX, textureY); // Box 253
		bodyModel[250] = new ModelRendererTurbo(this, 329, 105, textureX, textureY); // Box 254
		bodyModel[251] = new ModelRendererTurbo(this, 337, 105, textureX, textureY); // Box 255
		bodyModel[252] = new ModelRendererTurbo(this, 393, 65, textureX, textureY); // Box 256
		bodyModel[253] = new ModelRendererTurbo(this, 289, 9, textureX, textureY); // Box 259
		bodyModel[254] = new ModelRendererTurbo(this, 329, 113, textureX, textureY); // Box 86
		bodyModel[255] = new ModelRendererTurbo(this, 225, 113, textureX, textureY); // Box 87
		bodyModel[256] = new ModelRendererTurbo(this, 49, 113, textureX, textureY); // Box 86
		bodyModel[257] = new ModelRendererTurbo(this, 241, 113, textureX, textureY); // Box 87
		bodyModel[258] = new ModelRendererTurbo(this, 281, 113, textureX, textureY); // Box 74
		bodyModel[259] = new ModelRendererTurbo(this, 257, 113, textureX, textureY, "lamp"); // Box 186 lamp
		bodyModel[260] = new ModelRendererTurbo(this, 297, 113, textureX, textureY, "lamp"); // Box 187 lamp
		bodyModel[261] = new ModelRendererTurbo(this, 353, 113, textureX, textureY); // Box 644
		bodyModel[262] = new ModelRendererTurbo(this, 377, 113, textureX, textureY); // Box 645
		bodyModel[263] = new ModelRendererTurbo(this, 121, 97, textureX, textureY); // Box 646
		bodyModel[264] = new ModelRendererTurbo(this, 401, 113, textureX, textureY); // Box 647
		bodyModel[265] = new ModelRendererTurbo(this, 425, 113, textureX, textureY); // Box 648
		bodyModel[266] = new ModelRendererTurbo(this, 305, 97, textureX, textureY); // Box 649
		bodyModel[267] = new ModelRendererTurbo(this, 177, 25, textureX, textureY, "lamp"); // Box 363 liveryimg 3 glow
		bodyModel[268] = new ModelRendererTurbo(this, 225, 25, textureX, textureY, "lamp"); // Box 364 liveryimg 3 glow
		bodyModel[269] = new ModelRendererTurbo(this, 433, 113, textureX, textureY); // Box 627
		bodyModel[270] = new ModelRendererTurbo(this, 369, 113, textureX, textureY); // Box 287
		bodyModel[271] = new ModelRendererTurbo(this, 329, 97, textureX, textureY, "lamp"); // Box 288 glow
		bodyModel[272] = new ModelRendererTurbo(this, 65, 105, textureX, textureY, "lamp"); // Box 162 rotating lamp?
		bodyModel[273] = new ModelRendererTurbo(this, 393, 113, textureX, textureY); // Box 165
		bodyModel[274] = new ModelRendererTurbo(this, 305, 105, textureX, textureY, "lamp"); // Box 162 rotating lamp?
		bodyModel[275] = new ModelRendererTurbo(this, 417, 113, textureX, textureY); // Box 165
		bodyModel[276] = new ModelRendererTurbo(this, 348, 125, textureX, textureY, "cull"); // Box 3 cull
		bodyModel[277] = new ModelRendererTurbo(this, 372, 125, textureX, textureY, "cull"); // Box 306
		bodyModel[278] = new ModelRendererTurbo(this, 44, 23, textureX, textureY, "lamp"); // Box 117 liveryimg 2
		bodyModel[279] = new ModelRendererTurbo(this, 55, 23, textureX, textureY, "lamp"); // Box 118 liveryimg 2
		bodyModel[280] = new ModelRendererTurbo(this, 22, 23, textureX, textureY, "lamp"); // Box 115 liveryimg 2
		bodyModel[281] = new ModelRendererTurbo(this, 33, 23, textureX, textureY, "lamp"); // Box 116 liveryimg 2
		bodyModel[282] = new ModelRendererTurbo(this, 67, 51, textureX, textureY); // Box 311
		bodyModel[283] = new ModelRendererTurbo(this, 467, 112, textureX, textureY); // Box 312
		bodyModel[284] = new ModelRendererTurbo(this, 457, 25, textureX, textureY); // Box 313
		bodyModel[285] = new ModelRendererTurbo(this, 225, 113, textureX, textureY); // Box 314
		bodyModel[286] = new ModelRendererTurbo(this, 184, 112, textureX, textureY, "cull"); // Box 286 antenna plate cull
		bodyModel[287] = new ModelRendererTurbo(this, 184, 112, textureX, textureY); // Box 287
		bodyModel[288] = new ModelRendererTurbo(this, 60, 126, textureX, textureY); // Box 114
		bodyModel[289] = new ModelRendererTurbo(this, 60, 122, textureX, textureY); // Box 74
		bodyModel[290] = new ModelRendererTurbo(this, 57, 129, textureX, textureY); // Box 78
		bodyModel[291] = new ModelRendererTurbo(this, 49, 128, textureX, textureY); // Box 245
		bodyModel[292] = new ModelRendererTurbo(this, 35, 149, textureX, textureY); // Box 260
		bodyModel[293] = new ModelRendererTurbo(this, 32, 154, textureX, textureY); // Box 264
		bodyModel[294] = new ModelRendererTurbo(this, 9, 105, textureX, textureY); // Box 268
		bodyModel[295] = new ModelRendererTurbo(this, 29, 149, textureX, textureY); // Box 274
		bodyModel[296] = new ModelRendererTurbo(this, 17, 150, textureX, textureY); // Box 283
		bodyModel[297] = new ModelRendererTurbo(this, 32, 138, textureX, textureY); // Box 284
		bodyModel[298] = new ModelRendererTurbo(this, 19, 138, textureX, textureY); // Box 291
		bodyModel[299] = new ModelRendererTurbo(this, 6, 138, textureX, textureY); // Box 292
		bodyModel[300] = new ModelRendererTurbo(this, 39, 154, textureX, textureY); // Box 293
		bodyModel[301] = new ModelRendererTurbo(this, 5, 151, textureX, textureY); // Box 294
		bodyModel[302] = new ModelRendererTurbo(this, 9, 158, textureX, textureY); // Box 295
		bodyModel[303] = new ModelRendererTurbo(this, 2, 158, textureX, textureY); // Box 296

		bodyModel[0].addBox(0F, 0F, 0F, 67, 2, 22, 0F); // Box 1
		bodyModel[0].setRotationPoint(-33F, -3F, -11F);

		bodyModel[1].addBox(0F, 0F, 0F, 0, 8, 20, 0F); // Box 3
		bodyModel[1].setRotationPoint(-37.01F, -3F, -10F);

		bodyModel[2].addBox(0F, 0F, 0F, 4, 2, 14, 0F); // Box 266
		bodyModel[2].setRotationPoint(-37F, -3F, -7F);

		bodyModel[3].addBox(0F, 0F, 0F, 4, 0, 1, 0F); // Box 271
		bodyModel[3].setRotationPoint(-37F, -3F, -8F);

		bodyModel[4].addBox(0F, 0F, 0F, 4, 0, 3, 0F); // Box 272
		bodyModel[4].setRotationPoint(-37F, 4F, -11F);

		bodyModel[5].addBox(0F, 0F, 0F, 4, 0, 3, 0F); // Box 273
		bodyModel[5].setRotationPoint(-37F, 1F, -10F);

		bodyModel[6].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 275
		bodyModel[6].setRotationPoint(-37F, 3F, -8F);

		bodyModel[7].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 276
		bodyModel[7].setRotationPoint(-37F, 0F, -7F);

		bodyModel[8].addBox(0F, 0F, 0F, 4, 0, 1, 0F); // Box 271
		bodyModel[8].setRotationPoint(-37F, -3F, 7F);

		bodyModel[9].addBox(0F, 0F, 0F, 4, 0, 3, 0F); // Box 272
		bodyModel[9].setRotationPoint(-37F, 4F, 8F);

		bodyModel[10].addBox(0F, 0F, 0F, 4, 0, 3, 0F); // Box 273
		bodyModel[10].setRotationPoint(-37F, 1F, 7F);

		bodyModel[11].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 274
		bodyModel[11].setRotationPoint(-37F, -1F, 7F);

		bodyModel[12].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 275
		bodyModel[12].setRotationPoint(-37F, 3F, 8F);

		bodyModel[13].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 276
		bodyModel[13].setRotationPoint(-37F, 0F, 7F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 0, 6, 3, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 143
		bodyModel[14].setRotationPoint(-37.01F, -11F, -8F);
		bodyModel[14].rotateAngleY = -3.14159265F;

		bodyModel[15].addShapeBox(0F, 0F, 0F, 0, 6, 3, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 62
		bodyModel[15].setRotationPoint(-37.01F, -11F, 8F);

		bodyModel[16].addBox(0F, 0F, 0F, 0, 7, 1, 0F); // Box 61
		bodyModel[16].setRotationPoint(-37F, -5F, 10F);

		bodyModel[17].addBox(0F, 0F, 0F, 0, 7, 1, 0F); // Box 63
		bodyModel[17].setRotationPoint(-37F, -5F, -11F);

		bodyModel[18].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 4
		bodyModel[18].setRotationPoint(-40F, 0F, -1.5F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 78
		bodyModel[19].setRotationPoint(-37F, -5F, 4.75F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 188
		bodyModel[20].setRotationPoint(-37F, -5F, -6.75F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 189 lamp
		bodyModel[21].setRotationPoint(-37.25F, -5F, 4.75F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 190 lamp
		bodyModel[22].setRotationPoint(-37.25F, -5F, -6.75F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 3, 1, 10, 0F,0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F); // Box 4
		bodyModel[23].setRotationPoint(-40F, 3F, 0F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F,0.5F, 0F, 0F, -3F, 0F, 0F, -1F, 1F, 0F, -1.5F, 1F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F); // Box 4
		bodyModel[24].setRotationPoint(-40F, 2F, 2F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 3, 2, 10, 0F,0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 1F, 0F, 0F, -3.5F, 0F, 0F, -1F, 0F, -1F, -1.5F, 0F, -1F); // Box 4
		bodyModel[25].setRotationPoint(-40F, 4F, 0F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 3, 1, 10, 0F,-2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[26].setRotationPoint(-40F, 3F, -10F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F,-2F, 1F, 0F, -0.5F, 1F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 0F, 0F, -1F, 0F, 0F); // Box 4
		bodyModel[27].setRotationPoint(-40.5F, 2F, -10F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 3, 2, 10, 0F,-2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, -1F, -1F, 0F, -1F, -3.5F, 0F, 0F, 1F, 0F, 0F); // Box 4
		bodyModel[28].setRotationPoint(-40F, 4F, -10F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[29].setRotationPoint(-38F, -0.5F, -2F);

		bodyModel[30].addBox(0F, 0F, 0F, 0, 8, 20, 0F); // Box 3
		bodyModel[30].setRotationPoint(38.01F, -3F, -10F);

		bodyModel[31].addBox(0F, 0F, 0F, 4, 2, 14, 0F); // Box 266
		bodyModel[31].setRotationPoint(34F, -3F, -7F);

		bodyModel[32].addBox(0F, 0F, 0F, 4, 0, 1, 0F); // Box 271
		bodyModel[32].setRotationPoint(34F, -3F, -8F);

		bodyModel[33].addBox(0F, 0F, 0F, 4, 0, 3, 0F); // Box 272
		bodyModel[33].setRotationPoint(34F, 4F, -11F);

		bodyModel[34].addBox(0F, 0F, 0F, 4, 0, 3, 0F); // Box 273
		bodyModel[34].setRotationPoint(34F, 1F, -10F);

		bodyModel[35].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 274
		bodyModel[35].setRotationPoint(34F, -1F, -9F);

		bodyModel[36].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 275
		bodyModel[36].setRotationPoint(34F, 3F, -8F);

		bodyModel[37].addBox(0F, 0F, 0F, 4, 0, 1, 0F); // Box 271
		bodyModel[37].setRotationPoint(34F, -3F, 7F);

		bodyModel[38].addBox(0F, 0F, 0F, 4, 0, 3, 0F); // Box 272
		bodyModel[38].setRotationPoint(34F, 4F, 8F);

		bodyModel[39].addBox(0F, 0F, 0F, 4, 0, 3, 0F); // Box 273
		bodyModel[39].setRotationPoint(34F, 1F, 7F);

		bodyModel[40].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 274
		bodyModel[40].setRotationPoint(34F, -1F, 7F);

		bodyModel[41].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 275
		bodyModel[41].setRotationPoint(34F, 3F, 8F);

		bodyModel[42].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 276
		bodyModel[42].setRotationPoint(34F, 0F, 7F);

		bodyModel[43].addBox(0F, 0F, 0F, 4, 2, 3, 0F); // Box 5
		bodyModel[43].setRotationPoint(37F, 0F, -1.5F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 0, 6, 3, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 143
		bodyModel[44].setRotationPoint(38.01F, -11F, -8F);
		bodyModel[44].rotateAngleY = -3.14159265F;

		bodyModel[45].addBox(0F, 0F, 0F, 0, 7, 1, 0F); // Box 61
		bodyModel[45].setRotationPoint(38.02F, -5F, 10F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 0, 6, 3, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 62
		bodyModel[46].setRotationPoint(38.01F, -11F, 8F);

		bodyModel[47].addBox(0F, 0F, 0F, 0, 7, 1, 0F); // Box 63
		bodyModel[47].setRotationPoint(38.02F, -5F, -11F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 3, 1, 10, 0F,-2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[48].setRotationPoint(38F, 3F, 0F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F,-3F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 1F, 0F, -1F, 1F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[49].setRotationPoint(38F, 2F, 2F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 3, 2, 10, 0F,-2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, 1F, 0F, 0F, -1.5F, 0F, -1F, -1F, 0F, -1F); // Box 4
		bodyModel[50].setRotationPoint(38F, 4F, 0F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 3, 1, 10, 0F,0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F); // Box 4
		bodyModel[51].setRotationPoint(38F, 3F, -10F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F,-0.5F, 1F, 0F, -2F, 1F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0.5F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, -1.5F, 0F, 0F); // Box 4
		bodyModel[52].setRotationPoint(38.5F, 2F, -10F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 3, 2, 10, 0F,0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -1F, 0F, -1F, -1.5F, 0F, -1F, 1F, 0F, 0F, -3.5F, 0F, 0F); // Box 4
		bodyModel[53].setRotationPoint(38F, 4F, -10F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[54].setRotationPoint(38F, -0.5F, -2F);

		bodyModel[55].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 214
		bodyModel[55].setRotationPoint(34F, 0F, -7F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 0, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 209
		bodyModel[56].setRotationPoint(-33F, -1F, -11F);

		bodyModel[57].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 210
		bodyModel[57].setRotationPoint(-37F, -1F, -9F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 0, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 211
		bodyModel[58].setRotationPoint(-33F, -1F, 6F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 5, 5, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[59].setRotationPoint(-37F, -1F, -3F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 5, 5, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); // Box 4
		bodyModel[60].setRotationPoint(33F, -1F, -3F);

		bodyModel[61].addBox(0F, 0F, 0F, 0, 8, 16, 0F); // Box 214
		bodyModel[61].setRotationPoint(-37F, -11F, -8F);

		bodyModel[62].addBox(0F, 0F, 0F, 9, 13, 14, 0F); // Box 215
		bodyModel[62].setRotationPoint(-31F, -16F, -7F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 3, 13, 6, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 216
		bodyModel[63].setRotationPoint(-34F, -16F, -7F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 3, 13, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 217
		bodyModel[64].setRotationPoint(-34F, -16F, 1F);

		bodyModel[65].addBox(0F, 0F, 0F, 3, 13, 2, 0F); // Box 218
		bodyModel[65].setRotationPoint(-34F, -16F, -1F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 3, 20, 6, 0F,0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 219
		bodyModel[66].setRotationPoint(32F, -23F, -7F);

		bodyModel[67].addBox(0F, 0F, 0F, 3, 20, 2, 0F); // Box 220
		bodyModel[67].setRotationPoint(32F, -23F, -1F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 3, 20, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 221
		bodyModel[68].setRotationPoint(32F, -23F, 1F);

		bodyModel[69].addBox(0F, 0F, 0F, 42, 20, 14, 0F); // Box 223
		bodyModel[69].setRotationPoint(-10F, -23F, -7F);

		bodyModel[70].addBox(0F, 0F, 0F, 67, 1, 14, 0F); // Box 333
		bodyModel[70].setRotationPoint(-33F, -1F, -7F);

		bodyModel[71].addShapeBox(0F, 0F, 2F, 12, 2, 5, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39
		bodyModel[71].setRotationPoint(-22F, -25F, -9F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 10, 3, 4, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 119
		bodyModel[72].setRotationPoint(-21F, -23F, -11F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 125
		bodyModel[73].setRotationPoint(-22F, -23F, 7F);

		bodyModel[74].addBox(0F, 0F, 0F, 11, 12, 1, 0F); // Box 9
		bodyModel[74].setRotationPoint(-22F, -20F, 10F);

		bodyModel[75].addBox(0F, 0F, 0F, 11, 12, 1, 0F); // Box 10
		bodyModel[75].setRotationPoint(-21F, -20F, -11F);

		bodyModel[76].addBox(0F, 0F, 0F, 1, 12, 17, 0F); // Box 15
		bodyModel[76].setRotationPoint(-22F, -20F, -7F);

		bodyModel[77].addBox(0F, 0F, 0F, 1, 12, 17, 0F); // Box 21
		bodyModel[77].setRotationPoint(-11F, -20F, -10F);

		bodyModel[78].addBox(-0.5F, 0F, -3.5F, 1, 12, 4, 0F); // Box 314 door swing right
		bodyModel[78].setRotationPoint(-10.5F, -20F, 10.5F);

		bodyModel[79].addBox(-0.5F, 0F, -0.5F, 1, 12, 4, 0F); // Box 315 door swing right
		bodyModel[79].setRotationPoint(-21.5F, -20F, -10.5F);

		bodyModel[80].addBox(0F, 0F, 0F, 12, 5, 22, 0F); // Box 344
		bodyModel[80].setRotationPoint(-22F, -8F, -11F);

		bodyModel[81].addBox(0F, 0F, 0F, 8, 5, 4, 0F); // Box 345
		bodyModel[81].setRotationPoint(-30F, -8F, -11F);

		bodyModel[82].addBox(0F, 0F, 0F, 8, 5, 4, 0F); // Box 346
		bodyModel[82].setRotationPoint(-30F, -8F, 7F);

		bodyModel[83].addShapeBox(0F, 0F, 2F, 12, 2, 4, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 347
		bodyModel[83].setRotationPoint(-22F, -25F, -4F);

		bodyModel[84].addShapeBox(0F, 0F, 2F, 12, 2, 5, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 348
		bodyModel[84].setRotationPoint(-22F, -25F, 0F);

		bodyModel[85].addBox(0F, 0F, 0F, 1, 3, 14, 0F); // Box 349
		bodyModel[85].setRotationPoint(-22F, -23F, -7F);

		bodyModel[86].addBox(0F, 0F, 0F, 9, 7, 14, 0F); // Box 350
		bodyModel[86].setRotationPoint(-31F, -23F, -7F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 3, 7, 6, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 351
		bodyModel[87].setRotationPoint(-34F, -23F, -7F);

		bodyModel[88].addBox(0F, 0F, 0F, 3, 7, 2, 0F); // Box 352
		bodyModel[88].setRotationPoint(-34F, -23F, -1F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 3, 7, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 353
		bodyModel[89].setRotationPoint(-34F, -23F, 1F);

		bodyModel[90].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 265
		bodyModel[90].setRotationPoint(-34.5F, -17F, -1F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 247 lamp
		bodyModel[91].setRotationPoint(-35.25F, -17F, -1F);

		bodyModel[92].addBox(0F, 0F, 0F, 1, 1, 14, 0F); // Box 357
		bodyModel[92].setRotationPoint(-32F, -22F, -7F);

		bodyModel[93].addBox(0F, 0F, 0F, 1, 1, 14, 0F); // Box 358
		bodyModel[93].setRotationPoint(32F, -22F, -7F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 359 lamp
		bodyModel[94].setRotationPoint(34.75F, -21F, -1F);

		bodyModel[95].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 360
		bodyModel[95].setRotationPoint(34.5F, -21F, -1F);

		bodyModel[96].addBox(0F, 0F, 0F, 6, 5, 4, 0F); // Box 362
		bodyModel[96].setRotationPoint(-10F, -8F, -11F);

		bodyModel[97].addBox(0F, 0F, 0F, 6, 5, 4, 0F); // Box 363
		bodyModel[97].setRotationPoint(-10F, -8F, 7F);

		bodyModel[98].addBox(0F, 0F, 0F, 0, 8, 16, 0F); // Box 364
		bodyModel[98].setRotationPoint(38F, -11F, -8F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 0, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 365
		bodyModel[99].setRotationPoint(34F, -1F, -11F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 0, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 366
		bodyModel[100].setRotationPoint(34F, -1F, 6F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 239
		bodyModel[101].setRotationPoint(37F, -5F, -6.75F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 240 lamp
		bodyModel[102].setRotationPoint(37.25F, -5F, -6.75F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 241 lamp
		bodyModel[103].setRotationPoint(37.25F, -5F, 4.75F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 242
		bodyModel[104].setRotationPoint(37F, -5F, 4.75F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 371
		bodyModel[105].setRotationPoint(-11F, -23F, 7F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 372
		bodyModel[106].setRotationPoint(-22F, -23F, -11F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 373
		bodyModel[107].setRotationPoint(-11F, -23F, -11F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 10, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 374
		bodyModel[108].setRotationPoint(-21F, -23F, 7F);

		bodyModel[109].addBox(0F, 0F, 0F, 16, 2, 1, 0F); // Box 484
		bodyModel[109].setRotationPoint(-8F, -1F, 10F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 15, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 486
		bodyModel[110].setRotationPoint(-11F, 2F, -10.5F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 15, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 487
		bodyModel[111].setRotationPoint(-11F, 2F, 7.5F);

		bodyModel[112].addBox(0F, 0F, 0F, 15, 3, 15, 0F); // Box 488
		bodyModel[112].setRotationPoint(-11F, 2F, -7.5F);

		bodyModel[113].addBox(0F, 0F, 0F, 15, 2, 21, 0F); // Box 489
		bodyModel[113].setRotationPoint(-11F, 0F, -10.5F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 3, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 490
		bodyModel[114].setRotationPoint(-14F, -1F, -11F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 3, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 491
		bodyModel[115].setRotationPoint(-14F, -1F, 11F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 3, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 492
		bodyModel[116].setRotationPoint(12F, -1F, 11F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 3, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 493
		bodyModel[117].setRotationPoint(12F, -1F, -11F);

		bodyModel[118].addBox(0F, 0F, 0F, 35, 8, 0, 0F); // Box 38R
		bodyModel[118].setRotationPoint(-1F, -11F, 11.01F);

		bodyModel[119].addBox(0F, 0F, 0F, 35, 8, 0, 0F); // Box 176
		bodyModel[119].setRotationPoint(-1F, -11F, -11.01F);

		bodyModel[120].addBox(0F, 0F, 0F, 0, 8, 2, 0F); // Box 243
		bodyModel[120].setRotationPoint(34F, -11F, 9F);

		bodyModel[121].addBox(0F, 0F, 0F, 0, 8, 2, 0F); // Box 250
		bodyModel[121].setRotationPoint(34F, -11F, -11F);

		bodyModel[122].addBox(0F, 0F, 0F, 3, 3, 20, 0F); // Box 498
		bodyModel[122].setRotationPoint(5F, 1F, -10F);

		bodyModel[123].addBox(0F, 0F, 0F, 3, 3, 20, 0F); // Box 499
		bodyModel[123].setRotationPoint(9F, 1F, -10F);

		bodyModel[124].addBox(0F, 0F, 0F, 5, 8, 0, 0F); // Box 500
		bodyModel[124].setRotationPoint(-10F, -16F, -11.01F);

		bodyModel[125].addBox(0F, 0F, 0F, 5, 8, 0, 0F); // Box 503
		bodyModel[125].setRotationPoint(-10F, -16F, 11.01F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 3, 6, 0, 0F,0F, -2F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 131
		bodyModel[126].setRotationPoint(-31.01F, -16F, -11.01F);
		bodyModel[126].rotateAngleY = -3.14159265F;

		bodyModel[127].addBox(0F, 0F, 0F, 9, 8, 0, 0F); // Box 132
		bodyModel[127].setRotationPoint(-31F, -16F, -11.01F);

		bodyModel[128].addBox(0F, 0F, 0F, 1, 10, 0, 0F); // Box 133
		bodyModel[128].setRotationPoint(-34F, -10F, -11.01F);

		bodyModel[129].addBox(0F, 0F, 0F, 1, 10, 0, 0F); // Box 134
		bodyModel[129].setRotationPoint(-34F, -10F, 11.01F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 3, 6, 0, 0F,0F, -2F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 135
		bodyModel[130].setRotationPoint(-31.01F, -16F, 11.02F);
		bodyModel[130].rotateAngleY = -3.14159265F;

		bodyModel[131].addBox(0F, 0F, 0F, 9, 8, 0, 0F); // Box 136
		bodyModel[131].setRotationPoint(-31F, -16F, 11.01F);

		bodyModel[132].addBox(0F, 0F, 0F, 2, 0, 6, 0F); // Box 137
		bodyModel[132].setRotationPoint(-32F, -5F, -11F);

		bodyModel[133].addBox(0F, 0F, 0F, 2, 0, 6, 0F); // Box 138
		bodyModel[133].setRotationPoint(-32F, -5F, 5F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 1, 5, 0, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 139
		bodyModel[134].setRotationPoint(-32F, -8F, -11.01F);

		bodyModel[135].addBox(0F, 0F, 0F, 1, 5, 0, 0F); // Box 140
		bodyModel[135].setRotationPoint(-31F, -8F, -11.01F);

		bodyModel[136].addBox(0F, 0F, 0F, 1, 5, 0, 0F); // Box 141
		bodyModel[136].setRotationPoint(-31F, -8F, 11.01F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 1, 5, 0, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 142
		bodyModel[137].setRotationPoint(-32F, -8F, 11.01F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 114
		bodyModel[138].setRotationPoint(-36.5F, -23F, -0.5F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[139].setRotationPoint(-36.5F, -24F, -0.5F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 78
		bodyModel[140].setRotationPoint(-36.25F, -22.5F, -0.25F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 875
		bodyModel[141].setRotationPoint(-36.5F, -24F, -1F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 876
		bodyModel[142].setRotationPoint(-36.5F, -24F, 1F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 877
		bodyModel[143].setRotationPoint(-36.25F, -24.25F, -1.5F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 149 lamp
		bodyModel[144].setRotationPoint(-35.25F, -12.5F, -1F);

		bodyModel[145].addBox(0F, 0F, 0F, 1, 4, 2, 0F); // Box 150
		bodyModel[145].setRotationPoint(-34.5F, -14.5F, -1F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 151 lamp
		bodyModel[146].setRotationPoint(-35.25F, -14.5F, -1F);

		bodyModel[147].addBox(0F, 0F, 0F, 1, 1, 14, 0F); // Box 152
		bodyModel[147].setRotationPoint(-32F, -15F, -7F);

		bodyModel[148].addBox(0F, 0F, 0F, 2, 0, 20, 0F); // Box 154
		bodyModel[148].setRotationPoint(-39F, 5F, -10F);

		bodyModel[149].addBox(0F, 0F, 0F, 2, 0, 20, 0F); // Box 155
		bodyModel[149].setRotationPoint(38F, 5F, -10F);

		bodyModel[150].addBox(0F, 0F, 0F, 1, 3, 4, 0F); // Box 160
		bodyModel[150].setRotationPoint(-37.5F, -6F, -2F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 161
		bodyModel[151].setRotationPoint(-37.5F, -7F, -2F);

		bodyModel[152].addBox(0F, 0F, 0F, 7, 1, 7, 0F); // Box 89
		bodyModel[152].setRotationPoint(7F, -24.5F, -3.5F);

		bodyModel[153].addBox(0F, 0F, 0F, 8, 1, 14, 0F); // Box 91
		bodyModel[153].setRotationPoint(6.5F, -24F, -7F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 8, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 101
		bodyModel[154].setRotationPoint(6.5F, -22F, 7F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 5, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1.5F, -2F); // Box 105
		bodyModel[155].setRotationPoint(1.5F, -22F, 7F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 5, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, -2F, 0F, 0F, -1F); // Box 172
		bodyModel[156].setRotationPoint(14.5F, -22F, 7F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 8, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 173
		bodyModel[157].setRotationPoint(6.5F, -24F, 7F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 5, 2, 2, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 176
		bodyModel[158].setRotationPoint(1.5F, -24F, 7F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 5, 2, 2, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -2F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 177
		bodyModel[159].setRotationPoint(14.5F, -24F, 7F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 8, 2, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 178
		bodyModel[160].setRotationPoint(6.5F, -24F, -9F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 5, 2, 2, 0F,0F, -1F, 0F, 0F, -1F, -2F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 179
		bodyModel[161].setRotationPoint(14.5F, -24F, -9F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 5, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1.5F, -2F, 0F, -1.5F, 0F, 0F, 0F, 0F); // Box 180
		bodyModel[162].setRotationPoint(14.5F, -22F, -9F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 8, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 181
		bodyModel[163].setRotationPoint(6.5F, -22F, -9F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 5, 2, 2, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1.5F, 0F); // Box 182
		bodyModel[164].setRotationPoint(1.5F, -22F, -9F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 5, 2, 2, 0F,0F, -1F, -2F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 183
		bodyModel[165].setRotationPoint(1.5F, -24F, -9F);

		bodyModel[166].addBox(0F, 0F, 0F, 2, 2, 3, 0F); // Box 184
		bodyModel[166].setRotationPoint(3F, -25F, -1.5F);

		bodyModel[167].addBox(0F, 0F, 0F, 2, 2, 3, 0F); // Box 185
		bodyModel[167].setRotationPoint(16F, -25F, -1.5F);

		bodyModel[168].addBox(0F, 0F, 0F, 5, 1, 5, 0F); // Box 186
		bodyModel[168].setRotationPoint(-3.5F, -24F, -2.5F);

		bodyModel[169].addBox(0F, 0F, 0F, 5, 1, 5, 0F); // Box 187
		bodyModel[169].setRotationPoint(-9.5F, -24F, -2.5F);

		bodyModel[170].addBox(0F, 0F, 0F, 5, 1, 5, 0F); // Box 188
		bodyModel[170].setRotationPoint(25.5F, -24F, -2.5F);

		bodyModel[171].addBox(0F, 0F, 0F, 5, 1, 5, 0F); // Box 189
		bodyModel[171].setRotationPoint(19.5F, -24F, -2.5F);

		bodyModel[172].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 190
		bodyModel[172].setRotationPoint(-32F, -23.5F, -1F);

		bodyModel[173].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 191
		bodyModel[173].setRotationPoint(31F, -23.5F, -1F);

		bodyModel[174].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 192
		bodyModel[174].setRotationPoint(-29F, -24F, -6F);

		bodyModel[175].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 193
		bodyModel[175].setRotationPoint(-31F, -25F, -6F);

		bodyModel[176].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 194
		bodyModel[176].setRotationPoint(-30.5F, -25F, -4F);

		bodyModel[177].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 195
		bodyModel[177].setRotationPoint(-29.5F, -25F, -5F);

		bodyModel[178].addBox(0F, 0F, 0F, 7, 3, 6, 0F); // Box 196 winterization hatch
		bodyModel[178].setRotationPoint(18F, -26F, -3F);

		bodyModel[179].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 197
		bodyModel[179].setRotationPoint(-16.5F, -26F, 0F);

		bodyModel[180].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 198
		bodyModel[180].setRotationPoint(-15.5F, -26F, -1F);

		bodyModel[181].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 199
		bodyModel[181].setRotationPoint(-15F, -25F, -1.5F);

		bodyModel[182].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 200
		bodyModel[182].setRotationPoint(-16F, -25.75F, -2F);

		bodyModel[183].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 201
		bodyModel[183].setRotationPoint(-15.5F, -25.75F, 1F);

		bodyModel[184].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 202
		bodyModel[184].setRotationPoint(-32F, -16.5F, -1F);

		bodyModel[185].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 203
		bodyModel[185].setRotationPoint(-12F, -23F, -10F);

		bodyModel[186].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 204
		bodyModel[186].setRotationPoint(-11.5F, -22F, -10F);

		bodyModel[187].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 205
		bodyModel[187].setRotationPoint(-21.5F, -22F, 9F);

		bodyModel[188].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 206
		bodyModel[188].setRotationPoint(-23F, -23F, 9F);

		bodyModel[189].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 207
		bodyModel[189].setRotationPoint(10F, -26F, -8F);

		bodyModel[190].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 208
		bodyModel[190].setRotationPoint(11.25F, -25.85F, -9F);

		bodyModel[191].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 209
		bodyModel[191].setRotationPoint(11.25F, -25.85F, -7F);

		bodyModel[192].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 210
		bodyModel[192].setRotationPoint(12F, -25F, -8F);

		bodyModel[193].addBox(0F, 0F, 0F, 3, 3, 3, 0F); // Box 211 erie large headlight
		bodyModel[193].setRotationPoint(34F, -22F, -1.5F);

		bodyModel[194].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 212 lamp
		bodyModel[194].setRotationPoint(36.25F, -21.5F, -1F);

		bodyModel[195].addBox(0F, 0F, 0F, 3, 3, 3, 0F); // Box 213 erie large headlight
		bodyModel[195].setRotationPoint(-36F, -22F, -1.5F);

		bodyModel[196].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 214 lamp
		bodyModel[196].setRotationPoint(-36.35F, -21.5F, -1F);

		bodyModel[197].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 215 lamp
		bodyModel[197].setRotationPoint(-35.25F, -21F, -1F);

		bodyModel[198].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 216
		bodyModel[198].setRotationPoint(-34.5F, -21F, -1F);

		bodyModel[199].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 217 lamp
		bodyModel[199].setRotationPoint(-35.25F, -19F, -1F);

		bodyModel[200].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 218 lamp
		bodyModel[200].setRotationPoint(-36.25F, -22F, -1F);

		bodyModel[201].addBox(0F, 0F, 0F, 2, 4, 2, 0F); // Box 219
		bodyModel[201].setRotationPoint(-35.5F, -22F, -1F);

		bodyModel[202].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 220 lamp
		bodyModel[202].setRotationPoint(-36.25F, -20F, -1F);

		bodyModel[203].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 221 lamp
		bodyModel[203].setRotationPoint(34.75F, -17F, -1F);

		bodyModel[204].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 222
		bodyModel[204].setRotationPoint(34.5F, -19F, -1F);

		bodyModel[205].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 223 lamp
		bodyModel[205].setRotationPoint(34.75F, -19F, -1F);

		bodyModel[206].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 224 lamp
		bodyModel[206].setRotationPoint(35.75F, -22F, -1F);

		bodyModel[207].addBox(0F, 0F, 0F, 2, 4, 2, 0F); // Box 225
		bodyModel[207].setRotationPoint(34.5F, -22F, -1F);

		bodyModel[208].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 226 lamp
		bodyModel[208].setRotationPoint(35.75F, -20F, -1F);

		bodyModel[209].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 227
		bodyModel[209].setRotationPoint(-2F, -22F, -9F);

		bodyModel[210].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 228
		bodyModel[210].setRotationPoint(-1.75F, -22F, -8F);

		bodyModel[211].addBox(0F, 0F, 0F, 3, 2, 1, 0F); // Box 230
		bodyModel[211].setRotationPoint(-11F, -1F, 10F);

		bodyModel[212].addBox(0F, 0F, 0F, 4, 2, 1, 0F); // Box 231
		bodyModel[212].setRotationPoint(8F, -1F, 10F);

		bodyModel[213].addBox(0F, 0F, 0F, 16, 2, 1, 0F); // Box 232
		bodyModel[213].setRotationPoint(-8F, -1F, -11F);

		bodyModel[214].addBox(0F, 0F, 0F, 3, 2, 1, 0F); // Box 233
		bodyModel[214].setRotationPoint(-11F, -1F, -11F);

		bodyModel[215].addBox(0F, 0F, 0F, 4, 2, 1, 0F); // Box 234
		bodyModel[215].setRotationPoint(8F, -1F, -11F);

		bodyModel[216].addBox(0F, 0F, 0F, 9, 1, 14, 0F); // Box 235
		bodyModel[216].setRotationPoint(4F, 0F, -7F);

		bodyModel[217].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 236
		bodyModel[217].setRotationPoint(30F, -25F, 5F);

		bodyModel[218].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 237
		bodyModel[218].setRotationPoint(30.25F, -24F, 5F);

		bodyModel[219].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 238
		bodyModel[219].setRotationPoint(-26F, -22F, 7.5F);

		bodyModel[220].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 239
		bodyModel[220].setRotationPoint(-24F, -22F, 6.5F);

		bodyModel[221].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 240
		bodyModel[221].setRotationPoint(-29F, -25F, -1F);

		bodyModel[222].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 241
		bodyModel[222].setRotationPoint(-27.5F, -25F, 0F);

		bodyModel[223].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 242
		bodyModel[223].setRotationPoint(-28.5F, -25F, 1F);

		bodyModel[224].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 243
		bodyModel[224].setRotationPoint(-27F, -24F, -1F);

		bodyModel[225].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 244
		bodyModel[225].setRotationPoint(-25.25F, -23F, 7.25F);

		bodyModel[226].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 245
		bodyModel[226].setRotationPoint(-25.25F, -21F, 7.25F);

		bodyModel[227].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 246
		bodyModel[227].setRotationPoint(-25F, -25F, 5F);

		bodyModel[228].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 247
		bodyModel[228].setRotationPoint(-23.25F, -24F, 5F);

		bodyModel[229].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,-0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 233 some other steam gen thing
		bodyModel[229].setRotationPoint(-25F, -24F, -3F);

		bodyModel[230].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,-0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 234  steam gen exhaust
		bodyModel[230].setRotationPoint(-31F, -24F, 3F);

		bodyModel[231].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 235 steam gen exhaust
		bodyModel[231].setRotationPoint(-30.5F, -26F, 3.5F);

		bodyModel[232].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 236 steam gen exhaust
		bodyModel[232].setRotationPoint(-30.5F, -28F, 3.5F);

		bodyModel[233].addShapeBox(0F, 0F, 0F, 1, 5, 0, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 237
		bodyModel[233].setRotationPoint(-4F, -8F, -11.01F);

		bodyModel[234].addShapeBox(0F, 0F, 0F, 1, 5, 0, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 238
		bodyModel[234].setRotationPoint(-4F, -8F, 11.01F);

		bodyModel[235].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 239
		bodyModel[235].setRotationPoint(19.5F, -28F, -1F);

		bodyModel[236].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 240
		bodyModel[236].setRotationPoint(18F, -28F, 0F);

		bodyModel[237].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 241
		bodyModel[237].setRotationPoint(19.5F, -27F, -0.5F);

		bodyModel[238].addShapeBox(0F, 0F, 0F, 8, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 242 extended tank
		bodyModel[238].setRotationPoint(4F, 2F, -10.5F);

		bodyModel[239].addBox(0F, 0F, 0F, 8, 3, 15, 0F); // Box 243 extended tank
		bodyModel[239].setRotationPoint(4F, 2F, -7.5F);

		bodyModel[240].addShapeBox(0F, 0F, 0F, 8, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 244 extended tank
		bodyModel[240].setRotationPoint(4F, 2F, 7.5F);

		bodyModel[241].addBox(0F, 0F, 0F, 8, 2, 21, 0F); // Box 245 extended tank
		bodyModel[241].setRotationPoint(4F, 0F, -10.5F);

		bodyModel[242].addBox(0F, 0F, 0F, 19, 2, 2, 0F); // Box 246 roof air tank
		bodyModel[242].setRotationPoint(1F, -25.5F, -7F);

		bodyModel[243].addBox(0F, 0F, 0F, 2, 2, 3, 0F); // Box 247 extra stack
		bodyModel[243].setRotationPoint(3F, -27F, -1.5F);

		bodyModel[244].addBox(0F, 0F, 0F, 2, 2, 3, 0F); // Box 248 extra stack
		bodyModel[244].setRotationPoint(16F, -27F, -1.5F);

		bodyModel[245].addBox(0F, 0F, 0F, 19, 2, 2, 0F); // Box 249 roof air tank
		bodyModel[245].setRotationPoint(1F, -25.5F, 5F);

		bodyModel[246].addBox(0F, 0F, 0F, 0, 2, 1, 0F); // Box 250
		bodyModel[246].setRotationPoint(0.989999999999998F, -25F, -6.5F);

		bodyModel[247].addBox(0F, 0F, 0F, 0, 2, 1, 0F); // Box 251
		bodyModel[247].setRotationPoint(0.989999999999998F, -25F, 5.5F);

		bodyModel[248].addBox(0F, 0F, 0F, 0, 2, 1, 0F); // Box 252
		bodyModel[248].setRotationPoint(20.01F, -25F, 5.5F);

		bodyModel[249].addBox(0F, 0F, 0F, 0, 2, 1, 0F); // Box 253
		bodyModel[249].setRotationPoint(20.01F, -25F, -6.5F);

		bodyModel[250].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 254
		bodyModel[250].setRotationPoint(1F, -25.5F, -1F);

		bodyModel[251].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 255
		bodyModel[251].setRotationPoint(0.5F, -25.5F, 0F);

		bodyModel[252].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 256
		bodyModel[252].setRotationPoint(1.5F, -24.5F, -0.5F);

		bodyModel[253].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 259
		bodyModel[253].setRotationPoint(-30F, -25F, -2F);

		bodyModel[254].addBox(0F, 0F, 0F, 7, 7, 3, 0F); // Box 86
		bodyModel[254].setRotationPoint(-21.5F, -15F, -5F);
		bodyModel[254].rotateAngleY = -0.38397244F;

		bodyModel[255].addBox(0F, 0F, 0F, 1, 7, 10, 0F); // Box 87
		bodyModel[255].setRotationPoint(-21.4F, -15F, -4F);

		bodyModel[256].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 86
		bodyModel[256].setRotationPoint(-18.4F, -17F, -5.5F);
		bodyModel[256].rotateAngleY = -0.38397244F;

		bodyModel[257].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 87
		bodyModel[257].setRotationPoint(-20.4F, -16.75F, -4F);
		bodyModel[257].rotateAngleY = -0.38397244F;

		bodyModel[258].addBox(0F, 0F, 0F, 2, 4, 2, 0F); // Box 74
		bodyModel[258].setRotationPoint(-24F, -24.5F, -1F);

		bodyModel[259].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 186 lamp
		bodyModel[259].setRotationPoint(-24.25F, -24.5F, -1F);

		bodyModel[260].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 187 lamp
		bodyModel[260].setRotationPoint(-24.25F, -22.5F, -1F);

		bodyModel[261].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 644
		bodyModel[261].setRotationPoint(-24F, -22.5F, -7F);

		bodyModel[262].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F,-2F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 645
		bodyModel[262].setRotationPoint(-24F, -24.5F, -7F);

		bodyModel[263].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 646
		bodyModel[263].setRotationPoint(-23F, -24.5F, -2F);

		bodyModel[264].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, -1.5F, 0F, -2F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 647
		bodyModel[264].setRotationPoint(-24F, -24.5F, 1F);

		bodyModel[265].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 648
		bodyModel[265].setRotationPoint(-24F, -22.5F, 1F);

		bodyModel[266].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 649
		bodyModel[266].setRotationPoint(-23F, -24.5F, 1F);

		bodyModel[267].addBox(0F, 0F, 0F, 0, 2, 5, 0F); // Box 363 liveryimg 3 glow
		bodyModel[267].setRotationPoint(-22.35F, -22.5F, -6F);
		bodyModel[267].rotateAngleY = 0.32288591F;

		bodyModel[268].addBox(0F, 0F, -5F, 0, 2, 5, 0F); // Box 364 liveryimg 3 glow
		bodyModel[268].setRotationPoint(-22.4F, -22.5F, 6F);
		bodyModel[268].rotateAngleY = -0.31415927F;

		bodyModel[269].addBox(0F, 0F, 0F, 1, 3, 14, 0F); // Box 627
		bodyModel[269].setRotationPoint(-11F, -23F, -7F);

		bodyModel[270].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0.3F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, 0.3F, -0.5F, 0.1F, 0.3F, 0F, 0.1F, -1F, 0F, 0.1F, -1F, 0F, 0.1F, 0.3F, 0F, 0.1F); // Box 287
		bodyModel[270].setRotationPoint(-29.32F, -24F, -0.5F);

		bodyModel[271].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 288 glow
		bodyModel[271].setRotationPoint(-29.47F, -24F, -0.5F);

		bodyModel[272].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 162 rotating lamp?
		bodyModel[272].setRotationPoint(-21.53F, -25.5F, -0.5F);

		bodyModel[273].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0.3F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, 0.3F, -0.5F, 0.1F, 0.3F, 0F, 0.1F, -1F, 0F, 0.1F, -1F, 0F, 0.1F, 0.3F, 0F, 0.1F); // Box 165
		bodyModel[273].setRotationPoint(-21.37F, -25.5F, -0.5F);

		bodyModel[274].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 162 rotating lamp?
		bodyModel[274].setRotationPoint(-11.53F, -25.5F, -0.5F);

		bodyModel[275].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0.3F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, 0.3F, -0.5F, 0.1F, 0.3F, 0F, 0.1F, -1F, 0F, 0.1F, -1F, 0F, 0.1F, 0.3F, 0F, 0.1F); // Box 165
		bodyModel[275].setRotationPoint(-11.37F, -25.5F, -0.5F);

		bodyModel[276].addShapeBox(0F, 0F, 0F, 6, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F); // Box 3 cull
		bodyModel[276].setRotationPoint(-19F, -20F, 10F);

		bodyModel[277].addShapeBox(0F, 0F, 0F, 6, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F); // Box 306
		bodyModel[277].setRotationPoint(-19F, -20F, -12.5F);

		bodyModel[278].addBox(0F, 0F, 0F, 0, 2, 5, 0F); // Box 117 liveryimg 2
		bodyModel[278].setRotationPoint(-31.51F, -20.5F, -6F);
		bodyModel[278].rotateAngleY = 0.4712389F;

		bodyModel[279].addBox(0F, 0F, -5F, 0, 2, 5, 0F); // Box 118 liveryimg 2
		bodyModel[279].setRotationPoint(-31.51F, -20.5F, 6F);
		bodyModel[279].rotateAngleY = -0.4712389F;

		bodyModel[280].addBox(0F, 0F, 0F, 0, 2, 5, 0F); // Box 115 liveryimg 2
		bodyModel[280].setRotationPoint(32.51F, -20.5F, -6F);
		bodyModel[280].rotateAngleY = -0.4712389F;

		bodyModel[281].addBox(0F, 0F, -5F, 0, 2, 5, 0F); // Box 116 liveryimg 2
		bodyModel[281].setRotationPoint(32.51F, -20.5F, 6F);
		bodyModel[281].rotateAngleY = 0.4712389F;

		bodyModel[282].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 311
		bodyModel[282].setRotationPoint(-34.5F, -19F, -1F);

		bodyModel[283].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 312
		bodyModel[283].setRotationPoint(34.5F, -17F, -1F);

		bodyModel[284].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F); // Box 313
		bodyModel[284].setRotationPoint(-5F, -16F, -11.01F);

		bodyModel[285].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F); // Box 314
		bodyModel[285].setRotationPoint(-5F, -16F, 11.01F);

		bodyModel[286].addBox(0F, 0F, 0F, 4, 3, 5, 0F); // Box 286 antenna plate cull
		bodyModel[286].setRotationPoint(-21F, -24F, -9F);

		bodyModel[287].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 287
		bodyModel[287].setRotationPoint(-20F, -26F, -7F);

		bodyModel[288].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 114
		bodyModel[288].setRotationPoint(0.5F, -21.5F, 7.7F);

		bodyModel[289].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[289].setRotationPoint(0.5F, -22.5F, 7.7F);

		bodyModel[290].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 78
		bodyModel[290].setRotationPoint(0.75F, -21F, 7.95F);

		bodyModel[291].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 245
		bodyModel[291].setRotationPoint(0.5F, -23.5F, 6.5F);

		bodyModel[292].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -1F, 0F, -0.5F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 260
		bodyModel[292].setRotationPoint(-16F, -30F, 6F);

		bodyModel[293].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 264
		bodyModel[293].setRotationPoint(-16F, -30F, 8F);

		bodyModel[294].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0F, 0F, -1F, -1.5F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -2F); // Box 268
		bodyModel[294].setRotationPoint(-16F, -29F, 5F);

		bodyModel[295].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 1F, 0F, 0.5F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 274
		bodyModel[295].setRotationPoint(-16F, -29F, 8F);

		bodyModel[296].addShapeBox(0F, 0F, 0F, 3, 7, 3, 0F,0F, 0F, -2F, -1F, 0F, -0.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 1F, -2F, -0.5F, -2F, 0F, 1F, 0F, 0F, 1F); // Box 283
		bodyModel[296].setRotationPoint(-16F, -27F, 7F);

		bodyModel[297].addShapeBox(0F, 0F, 0F, 3, 7, 3, 0F,0F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -2F, 0F, -3F, 1F, -2F, -3F, 1F, 1F, -2F, -0.5F, 0F, -3F, -3F); // Box 284
		bodyModel[297].setRotationPoint(-16F, -27F, 5F);

		bodyModel[298].addShapeBox(0F, 0F, 0F, 3, 7, 3, 0F,0F, 0F, -2F, -1F, 0F, -0.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -3F, 1F, -2F, -0.5F, -2F, -3F, 1F, 0F, -3F, 1F); // Box 291
		bodyModel[298].setRotationPoint(-16F, -27F, -8F);

		bodyModel[299].addShapeBox(0F, 0F, 0F, 3, 7, 3, 0F,0F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, 1F, -2F, 0F, 1F, 1F, -2F, -0.5F, 0F, 0F, -3F); // Box 292
		bodyModel[299].setRotationPoint(-16F, -27F, -10F);

		bodyModel[300].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 1F, 0F, 0.5F, 0F, 0F, -1F); // Box 293
		bodyModel[300].setRotationPoint(-16F, -29F, -9F);

		bodyModel[301].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 294
		bodyModel[301].setRotationPoint(-16F, -29F, -8F);

		bodyModel[302].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, -1F, 0F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 295
		bodyModel[302].setRotationPoint(-16F, -30F, -8F);

		bodyModel[303].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, 0F, -0.5F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 296
		bodyModel[303].setRotationPoint(-16F, -30F, -9F);
	}
	ModelBapBlombergB theTrucks2 = new ModelBapBlombergB();
	ModelTypeB theTrucks1 = new ModelTypeB();
	ModelTypeA theTrucks3 = new ModelTypeA();

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		for (int i = 0; i < 304; i++) {
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

		if (entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor() == 15) {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/typeb_Black.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.4, 0.11, 0);
			theTrucks1.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(2.85, 0, 0);
			theTrucks1.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		}/* else if (entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor() == 11||entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor() == 7||entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor() == 5||entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor() == 6||entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor() == 13) {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/blombergB_Grey.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.28, -0.15, 0);
			theTrucks2.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(2.55, 0, 0);
			theTrucks2.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();

		} */else if (entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor() == 89) {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/blombergB_Grey.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.65, 0.15, 0);
			theTrucks2.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(3, 0, 0);
			theTrucks2.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();

		} else if (entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor() == 7) {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/typeA_Black.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.4, -0.25, 0);
			theTrucks3.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(2.9, 0, 0);
			theTrucks3.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/blombergB_Black.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.4, -0.05, 0);
			theTrucks2.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(2.8, 0, 0);
			theTrucks2.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		}

	}
	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
	{
	}

	public ModelRendererTurbo ModelGP7[];

}