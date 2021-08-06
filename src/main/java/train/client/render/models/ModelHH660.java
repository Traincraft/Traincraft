//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 04.09.2020 - 18:07:24
// Last changed on: 04.09.2020 - 18:07:24

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

public class ModelHH660 extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 256;

	public ModelHH660() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[228];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 52
		bodyModel[2] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 2
		bodyModel[3] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 50
		bodyModel[4] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 175
		bodyModel[5] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 5
		bodyModel[6] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 6
		bodyModel[7] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 7
		bodyModel[8] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 8
		bodyModel[9] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 9
		bodyModel[10] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 10
		bodyModel[11] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 12
		bodyModel[12] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 13
		bodyModel[13] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 14
		bodyModel[14] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 15
		bodyModel[15] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 17
		bodyModel[16] = new ModelRendererTurbo(this, 337, 9, textureX, textureY); // Box 18
		bodyModel[17] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 19
		bodyModel[18] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 21
		bodyModel[19] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 22
		bodyModel[20] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 23
		bodyModel[21] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 24
		bodyModel[22] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 27
		bodyModel[23] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Box 31
		bodyModel[24] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 32
		bodyModel[25] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 33
		bodyModel[26] = new ModelRendererTurbo(this, 185, 9, textureX, textureY); // Box 34
		bodyModel[27] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 37
		bodyModel[28] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 38
		bodyModel[29] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Box 41
		bodyModel[30] = new ModelRendererTurbo(this, 441, 17, textureX, textureY); // Box 42
		bodyModel[31] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 43
		bodyModel[32] = new ModelRendererTurbo(this, 81, 9, textureX, textureY); // Box 44
		bodyModel[33] = new ModelRendererTurbo(this, 201, 25, textureX, textureY); // Box 45
		bodyModel[34] = new ModelRendererTurbo(this, 313, 25, textureX, textureY); // Box 46
		bodyModel[35] = new ModelRendererTurbo(this, 401, 25, textureX, textureY); // Box 48
		bodyModel[36] = new ModelRendererTurbo(this, 481, 25, textureX, textureY); // Box 49
		bodyModel[37] = new ModelRendererTurbo(this, 89, 9, textureX, textureY); // Box 129
		bodyModel[38] = new ModelRendererTurbo(this, 121, 9, textureX, textureY); // Box 130
		bodyModel[39] = new ModelRendererTurbo(this, 433, 25, textureX, textureY); // Box 132
		bodyModel[40] = new ModelRendererTurbo(this, 489, 9, textureX, textureY); // Box 135
		bodyModel[41] = new ModelRendererTurbo(this, 201, 33, textureX, textureY); // Box 57
		bodyModel[42] = new ModelRendererTurbo(this, 17, 25, textureX, textureY); // Box 58
		bodyModel[43] = new ModelRendererTurbo(this, 233, 33, textureX, textureY); // Box 59
		bodyModel[44] = new ModelRendererTurbo(this, 17, 33, textureX, textureY); // Box 315 door swing right
		bodyModel[45] = new ModelRendererTurbo(this, 241, 33, textureX, textureY); // Box 61
		bodyModel[46] = new ModelRendererTurbo(this, 177, 9, textureX, textureY); // Box 62
		bodyModel[47] = new ModelRendererTurbo(this, 377, 25, textureX, textureY); // Box 63
		bodyModel[48] = new ModelRendererTurbo(this, 313, 33, textureX, textureY); // Box 64
		bodyModel[49] = new ModelRendererTurbo(this, 337, 33, textureX, textureY); // Box 65
		bodyModel[50] = new ModelRendererTurbo(this, 417, 33, textureX, textureY); // Box 66
		bodyModel[51] = new ModelRendererTurbo(this, 289, 33, textureX, textureY); // Box 67
		bodyModel[52] = new ModelRendererTurbo(this, 449, 9, textureX, textureY); // Box 68
		bodyModel[53] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 69
		bodyModel[54] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 71
		bodyModel[55] = new ModelRendererTurbo(this, 17, 17, textureX, textureY, "lamp"); // Box 78 lamp rear
		bodyModel[56] = new ModelRendererTurbo(this, 33, 33, textureX, textureY); // Box 79
		bodyModel[57] = new ModelRendererTurbo(this, 457, 25, textureX, textureY); // Box 80
		bodyModel[58] = new ModelRendererTurbo(this, 145, 9, textureX, textureY); // Box 81
		bodyModel[59] = new ModelRendererTurbo(this, 161, 9, textureX, textureY); // Box 82
		bodyModel[60] = new ModelRendererTurbo(this, 89, 17, textureX, textureY); // Box 83
		bodyModel[61] = new ModelRendererTurbo(this, 201, 9, textureX, textureY); // Box 84
		bodyModel[62] = new ModelRendererTurbo(this, 337, 9, textureX, textureY); // Box 85
		bodyModel[63] = new ModelRendererTurbo(this, 177, 25, textureX, textureY); // Box 86
		bodyModel[64] = new ModelRendererTurbo(this, 9, 33, textureX, textureY); // Box 87
		bodyModel[65] = new ModelRendererTurbo(this, 9, 33, textureX, textureY); // Box 88
		bodyModel[66] = new ModelRendererTurbo(this, 305, 33, textureX, textureY); // Box 89
		bodyModel[67] = new ModelRendererTurbo(this, 457, 17, textureX, textureY, "lamp"); // Box 90 lamp front
		bodyModel[68] = new ModelRendererTurbo(this, 33, 41, textureX, textureY); // Box 92
		bodyModel[69] = new ModelRendererTurbo(this, 169, 41, textureX, textureY); // Box 93
		bodyModel[70] = new ModelRendererTurbo(this, 417, 57, textureX, textureY); // Box 102
		bodyModel[71] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 38
		bodyModel[72] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 104
		bodyModel[73] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Box 105
		bodyModel[74] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 106
		bodyModel[75] = new ModelRendererTurbo(this, 89, 65, textureX, textureY); // Box 107
		bodyModel[76] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Box 108
		bodyModel[77] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 109
		bodyModel[78] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 110
		bodyModel[79] = new ModelRendererTurbo(this, 97, 17, textureX, textureY); // Box 111
		bodyModel[80] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 112
		bodyModel[81] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 113
		bodyModel[82] = new ModelRendererTurbo(this, 361, 33, textureX, textureY); // Box 114
		bodyModel[83] = new ModelRendererTurbo(this, 205, 64, textureX, textureY); // Box 115
		bodyModel[84] = new ModelRendererTurbo(this, 497, 17, textureX, textureY); // Box 116
		bodyModel[85] = new ModelRendererTurbo(this, 329, 33, textureX, textureY); // Box 117
		bodyModel[86] = new ModelRendererTurbo(this, 369, 33, textureX, textureY); // Box 118
		bodyModel[87] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 119
		bodyModel[88] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 126
		bodyModel[89] = new ModelRendererTurbo(this, 377, 33, textureX, textureY); // Box 127
		bodyModel[90] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 128
		bodyModel[91] = new ModelRendererTurbo(this, 385, 33, textureX, textureY); // Box 129
		bodyModel[92] = new ModelRendererTurbo(this, 65, 41, textureX, textureY); // Box 130
		bodyModel[93] = new ModelRendererTurbo(this, 330, 59, textureX, textureY); // Box 131
		bodyModel[94] = new ModelRendererTurbo(this, 201, 41, textureX, textureY); // Box 134
		bodyModel[95] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 137
		bodyModel[96] = new ModelRendererTurbo(this, 161, 9, textureX, textureY); // Box 138
		bodyModel[97] = new ModelRendererTurbo(this, 201, 9, textureX, textureY); // Box 139
		bodyModel[98] = new ModelRendererTurbo(this, 81, 9, textureX, textureY, "lamp"); // Box 149 glow
		bodyModel[99] = new ModelRendererTurbo(this, 337, 9, textureX, textureY, "lamp"); // Box 150 glow
		bodyModel[100] = new ModelRendererTurbo(this, 217, 41, textureX, textureY); // Box 167
		bodyModel[101] = new ModelRendererTurbo(this, 233, 41, textureX, textureY); // Box 168
		bodyModel[102] = new ModelRendererTurbo(this, 249, 41, textureX, textureY); // Box 169
		bodyModel[103] = new ModelRendererTurbo(this, 361, 41, textureX, textureY); // Box 170
		bodyModel[104] = new ModelRendererTurbo(this, 353, 49, textureX, textureY); // Box 171
		bodyModel[105] = new ModelRendererTurbo(this, 137, 17, textureX, textureY); // Box 172
		bodyModel[106] = new ModelRendererTurbo(this, 417, 41, textureX, textureY); // Box 173
		bodyModel[107] = new ModelRendererTurbo(this, 497, 41, textureX, textureY); // Box 174
		bodyModel[108] = new ModelRendererTurbo(this, 441, 41, textureX, textureY); // Box 175
		bodyModel[109] = new ModelRendererTurbo(this, 65, 49, textureX, textureY); // Box 176
		bodyModel[110] = new ModelRendererTurbo(this, 505, 17, textureX, textureY); // Box 177
		bodyModel[111] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 67
		bodyModel[112] = new ModelRendererTurbo(this, 233, 57, textureX, textureY); // Box 70
		bodyModel[113] = new ModelRendererTurbo(this, 449, 49, textureX, textureY); // Box 71
		bodyModel[114] = new ModelRendererTurbo(this, 81, 25, textureX, textureY, "lamp"); // Box 78 lantern
		bodyModel[115] = new ModelRendererTurbo(this, 49, 25, textureX, textureY, "lamp"); // Box 211 ditchlight front
		bodyModel[116] = new ModelRendererTurbo(this, 465, 25, textureX, textureY); // Box 212
		bodyModel[117] = new ModelRendererTurbo(this, 473, 25, textureX, textureY); // Box 213
		bodyModel[118] = new ModelRendererTurbo(this, 313, 33, textureX, textureY, "lamp"); // Box 214 ditchlight front
		bodyModel[119] = new ModelRendererTurbo(this, 329, 33, textureX, textureY, "lamp"); // Box 160 ditchlight rear
		bodyModel[120] = new ModelRendererTurbo(this, 337, 33, textureX, textureY); // Box 161
		bodyModel[121] = new ModelRendererTurbo(this, 353, 33, textureX, textureY); // Box 162
		bodyModel[122] = new ModelRendererTurbo(this, 9, 41, textureX, textureY, "lamp"); // Box 163 ditchlight rear
		bodyModel[123] = new ModelRendererTurbo(this, 49, 41, textureX, textureY); // Box 191
		bodyModel[124] = new ModelRendererTurbo(this, 465, 49, textureX, textureY); // Box 192
		bodyModel[125] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 193
		bodyModel[126] = new ModelRendererTurbo(this, 177, 9, textureX, textureY); // Box 197
		bodyModel[127] = new ModelRendererTurbo(this, 209, 9, textureX, textureY); // Box 198
		bodyModel[128] = new ModelRendererTurbo(this, 481, 49, textureX, textureY); // Box 199
		bodyModel[129] = new ModelRendererTurbo(this, 81, 41, textureX, textureY); // Box 200
		bodyModel[130] = new ModelRendererTurbo(this, 449, 9, textureX, textureY); // Box 201
		bodyModel[131] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 202
		bodyModel[132] = new ModelRendererTurbo(this, 81, 49, textureX, textureY); // Box 203
		bodyModel[133] = new ModelRendererTurbo(this, 9, 17, textureX, textureY); // Box 164
		bodyModel[134] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 165
		bodyModel[135] = new ModelRendererTurbo(this, 89, 17, textureX, textureY); // Box 166
		bodyModel[136] = new ModelRendererTurbo(this, 177, 25, textureX, textureY); // Box 207
		bodyModel[137] = new ModelRendererTurbo(this, 201, 25, textureX, textureY); // Box 208
		bodyModel[138] = new ModelRendererTurbo(this, 433, 25, textureX, textureY); // Box 209
		bodyModel[139] = new ModelRendererTurbo(this, 25, 33, textureX, textureY, "lamp"); // Box 399 commander beacon
		bodyModel[140] = new ModelRendererTurbo(this, 305, 33, textureX, textureY); // Box 400
		bodyModel[141] = new ModelRendererTurbo(this, 489, 9, textureX, textureY); // Box 215
		bodyModel[142] = new ModelRendererTurbo(this, 233, 49, textureX, textureY); // Box 216
		bodyModel[143] = new ModelRendererTurbo(this, 361, 49, textureX, textureY); // Box 217
		bodyModel[144] = new ModelRendererTurbo(this, 65, 41, textureX, textureY); // box64
		bodyModel[145] = new ModelRendererTurbo(this, 201, 41, textureX, textureY); // box65
		bodyModel[146] = new ModelRendererTurbo(this, 225, 41, textureX, textureY); // Box 222
		bodyModel[147] = new ModelRendererTurbo(this, 449, 17, textureX, textureY); // Box 227
		bodyModel[148] = new ModelRendererTurbo(this, 241, 41, textureX, textureY); // Box 228
		bodyModel[149] = new ModelRendererTurbo(this, 449, 41, textureX, textureY); // Box 229
		bodyModel[150] = new ModelRendererTurbo(this, 425, 41, textureX, textureY); // Box 230
		bodyModel[151] = new ModelRendererTurbo(this, 465, 41, textureX, textureY); // Box 231
		bodyModel[152] = new ModelRendererTurbo(this, 401, 41, textureX, textureY); // Box 232
		bodyModel[153] = new ModelRendererTurbo(this, 481, 41, textureX, textureY); // Box 233
		bodyModel[154] = new ModelRendererTurbo(this, 489, 41, textureX, textureY); // Box 248
		bodyModel[155] = new ModelRendererTurbo(this, 9, 57, textureX, textureY); // Box 250
		bodyModel[156] = new ModelRendererTurbo(this, 217, 57, textureX, textureY); // Box 251
		bodyModel[157] = new ModelRendererTurbo(this, 201, 49, textureX, textureY); // Box 221
		bodyModel[158] = new ModelRendererTurbo(this, 217, 49, textureX, textureY); // Box 222
		bodyModel[159] = new ModelRendererTurbo(this, 249, 73, textureX, textureY); // Box 223
		bodyModel[160] = new ModelRendererTurbo(this, 329, 73, textureX, textureY); // Box 224
		bodyModel[161] = new ModelRendererTurbo(this, 409, 73, textureX, textureY); // Box 226
		bodyModel[162] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 227
		bodyModel[163] = new ModelRendererTurbo(this, 241, 49, textureX, textureY); // Box 228
		bodyModel[164] = new ModelRendererTurbo(this, 289, 49, textureX, textureY); // Box 229
		bodyModel[165] = new ModelRendererTurbo(this, 497, 57, textureX, textureY); // Box 230
		bodyModel[166] = new ModelRendererTurbo(this, 201, 33, textureX, textureY); // Box 231
		bodyModel[167] = new ModelRendererTurbo(this, 161, 65, textureX, textureY); // Box 232
		bodyModel[168] = new ModelRendererTurbo(this, 465, 49, textureX, textureY); // Box 233
		bodyModel[169] = new ModelRendererTurbo(this, 289, 33, textureX, textureY); // Box 234
		bodyModel[170] = new ModelRendererTurbo(this, 505, 57, textureX, textureY); // Box 235
		bodyModel[171] = new ModelRendererTurbo(this, 25, 57, textureX, textureY); // Box 236
		bodyModel[172] = new ModelRendererTurbo(this, 481, 49, textureX, textureY); // Box 237
		bodyModel[173] = new ModelRendererTurbo(this, 249, 49, textureX, textureY); // Box 238
		bodyModel[174] = new ModelRendererTurbo(this, 177, 73, textureX, textureY); // Box 239
		bodyModel[175] = new ModelRendererTurbo(this, 177, 73, textureX, textureY); // Box 240
		bodyModel[176] = new ModelRendererTurbo(this, 465, 73, textureX, textureY); // Box 241
		bodyModel[177] = new ModelRendererTurbo(this, 81, 81, textureX, textureY); // Box 242
		bodyModel[178] = new ModelRendererTurbo(this, 305, 57, textureX, textureY); // Box 243
		bodyModel[179] = new ModelRendererTurbo(this, 65, 57, textureX, textureY); // Box 244
		bodyModel[180] = new ModelRendererTurbo(this, 217, 41, textureX, textureY); // Box 245
		bodyModel[181] = new ModelRendererTurbo(this, 9, 49, textureX, textureY); // Box 246
		bodyModel[182] = new ModelRendererTurbo(this, 81, 57, textureX, textureY); // Box 247
		bodyModel[183] = new ModelRendererTurbo(this, 49, 49, textureX, textureY); // Box 248
		bodyModel[184] = new ModelRendererTurbo(this, 249, 41, textureX, textureY); // Box 249
		bodyModel[185] = new ModelRendererTurbo(this, 353, 57, textureX, textureY); // Box 325 extra stacc
		bodyModel[186] = new ModelRendererTurbo(this, 321, 57, textureX, textureY); // Box 326
		bodyModel[187] = new ModelRendererTurbo(this, 249, 65, textureX, textureY); // Box 327
		bodyModel[188] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 328
		bodyModel[189] = new ModelRendererTurbo(this, 153, 73, textureX, textureY); // Box 329
		bodyModel[190] = new ModelRendererTurbo(this, 209, 73, textureX, textureY); // Box 330
		bodyModel[191] = new ModelRendererTurbo(this, 9, 81, textureX, textureY); // Box 331
		bodyModel[192] = new ModelRendererTurbo(this, 273, 65, textureX, textureY); // Box 334
		bodyModel[193] = new ModelRendererTurbo(this, 73, 57, textureX, textureY); // Box 335
		bodyModel[194] = new ModelRendererTurbo(this, 73, 49, textureX, textureY); // Box 336
		bodyModel[195] = new ModelRendererTurbo(this, 289, 65, textureX, textureY); // Box 337
		bodyModel[196] = new ModelRendererTurbo(this, 25, 65, textureX, textureY); // Box 338
		bodyModel[197] = new ModelRendererTurbo(this, 297, 49, textureX, textureY); // Box 339
		bodyModel[198] = new ModelRendererTurbo(this, 257, 41, textureX, textureY); // Box 340
		bodyModel[199] = new ModelRendererTurbo(this, 417, 41, textureX, textureY); // Box 341
		bodyModel[200] = new ModelRendererTurbo(this, 441, 41, textureX, textureY); // Box 342
		bodyModel[201] = new ModelRendererTurbo(this, 497, 41, textureX, textureY); // Box 114
		bodyModel[202] = new ModelRendererTurbo(this, 65, 49, textureX, textureY); // Box 74
		bodyModel[203] = new ModelRendererTurbo(this, 305, 49, textureX, textureY); // Box 78
		bodyModel[204] = new ModelRendererTurbo(this, 409, 41, textureX, textureY); // Box 875
		bodyModel[205] = new ModelRendererTurbo(this, 209, 49, textureX, textureY); // Box 876
		bodyModel[206] = new ModelRendererTurbo(this, 217, 65, textureX, textureY); // Box 877
		bodyModel[207] = new ModelRendererTurbo(this, 457, 49, textureX, textureY); // Box 349
		bodyModel[208] = new ModelRendererTurbo(this, 473, 49, textureX, textureY); // Box 350
		bodyModel[209] = new ModelRendererTurbo(this, 49, 57, textureX, textureY); // Box 351
		bodyModel[210] = new ModelRendererTurbo(this, 385, 65, textureX, textureY); // Box 352
		bodyModel[211] = new ModelRendererTurbo(this, 401, 65, textureX, textureY); // Box 353
		bodyModel[212] = new ModelRendererTurbo(this, 345, 57, textureX, textureY); // Box 354
		bodyModel[213] = new ModelRendererTurbo(this, 225, 49, textureX, textureY); // Box 355
		bodyModel[214] = new ModelRendererTurbo(this, 305, 65, textureX, textureY); // Box 356
		bodyModel[215] = new ModelRendererTurbo(this, 41, 73, textureX, textureY); // Box 357
		bodyModel[216] = new ModelRendererTurbo(this, 49, 73, textureX, textureY); // Box 358
		bodyModel[217] = new ModelRendererTurbo(this, 65, 73, textureX, textureY); // Box 359
		bodyModel[218] = new ModelRendererTurbo(this, 233, 49, textureX, textureY); // Box 360
		bodyModel[219] = new ModelRendererTurbo(this, 225, 65, textureX, textureY); // Box 361
		bodyModel[220] = new ModelRendererTurbo(this, 73, 73, textureX, textureY); // Box 362
		bodyModel[221] = new ModelRendererTurbo(this, 89, 81, textureX, textureY); // Box 363
		bodyModel[222] = new ModelRendererTurbo(this, 81, 73, textureX, textureY); // Box 364
		bodyModel[223] = new ModelRendererTurbo(this, 113, 81, textureX, textureY); // Box 365
		bodyModel[224] = new ModelRendererTurbo(this, 137, 81, textureX, textureY); // Box 367
		bodyModel[225] = new ModelRendererTurbo(this, 133, 87, textureX, textureY); // Box 226 atsf bawx
		bodyModel[226] = new ModelRendererTurbo(this, 116, 90, textureX, textureY); // Box 227
		bodyModel[227] = new ModelRendererTurbo(this, 229, 75, textureX, textureY); // Box 228

		bodyModel[0].addBox(0F, 0F, 0F, 52, 2, 4, 0F); // Box 0
		bodyModel[0].setRotationPoint(-26F, -4F, -11F);

		bodyModel[1].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 52
		bodyModel[1].setRotationPoint(-33F, 0F, -1.5F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[2].setRotationPoint(-30F, -0.5F, -2F);

		bodyModel[3].addBox(0F, 0F, 0F, 3, 0, 7, 0F); // Box 50
		bodyModel[3].setRotationPoint(-32F, 5F, -11F);

		bodyModel[4].addBox(0F, 0F, 0F, 3, 0, 7, 0F); // Box 175
		bodyModel[4].setRotationPoint(-32F, 5F, 4F);

		bodyModel[5].addBox(0F, 0F, 0F, 0, 5, 14, 0F); // Box 5
		bodyModel[5].setRotationPoint(-29F, -2F, -7F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 0, 5, 3, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[6].setRotationPoint(-29F, -2F, -10F);

		bodyModel[7].addBox(0F, 0F, 0F, 0, 1, 22, 0F); // Box 7
		bodyModel[7].setRotationPoint(-29F, 4F, -11F);

		bodyModel[8].addBox(0F, 0F, 0F, 0, 1, 4, 0F); // Box 8
		bodyModel[8].setRotationPoint(-26F, 4F, -11F);

		bodyModel[9].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 9
		bodyModel[9].setRotationPoint(-29F, 5F, -11F);

		bodyModel[10].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 10
		bodyModel[10].setRotationPoint(-29F, 3F, -10F);

		bodyModel[11].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 12
		bodyModel[11].setRotationPoint(-29F, 0.5F, -9F);

		bodyModel[12].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 13
		bodyModel[12].setRotationPoint(-29F, -2F, -8F);

		bodyModel[13].addBox(0F, 0F, 0F, 58, 2, 14, 0F); // Box 14
		bodyModel[13].setRotationPoint(-29F, -4F, -7F);

		bodyModel[14].addBox(0F, 0F, 0F, 52, 2, 4, 0F); // Box 15
		bodyModel[14].setRotationPoint(-26F, -4F, 7F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 5, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 17
		bodyModel[15].setRotationPoint(-29F, -2F, -3F);

		bodyModel[16].addBox(0F, 0F, 0F, 48, 1, 10, 0F); // Box 18
		bodyModel[16].setRotationPoint(-24F, -2F, -5F);

		bodyModel[17].addBox(0F, 0F, 0F, 0, 5, 14, 0F); // Box 19
		bodyModel[17].setRotationPoint(29F, -2F, -7F);

		bodyModel[18].addBox(0F, 0F, 0F, 3, 0, 7, 0F); // Box 21
		bodyModel[18].setRotationPoint(29F, 5F, -11F);

		bodyModel[19].addBox(0F, 0F, 0F, 3, 0, 7, 0F); // Box 22
		bodyModel[19].setRotationPoint(29F, 5F, 4F);

		bodyModel[20].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 23
		bodyModel[20].setRotationPoint(30F, 0F, -1.5F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		bodyModel[21].setRotationPoint(29F, -0.5F, -2F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 5, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 27
		bodyModel[22].setRotationPoint(24F, -2F, -3F);

		bodyModel[23].addBox(0F, 0F, 0F, 6, 3, 22, 0F); // Box 31
		bodyModel[23].setRotationPoint(-4.5F, -2F, -11F);

		bodyModel[24].addBox(0F, 0F, 0F, 0, 2, 16, 0F); // Box 32
		bodyModel[24].setRotationPoint(-29F, -4F, -8F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 0, 5, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
		bodyModel[25].setRotationPoint(-29F, -2F, 7F);

		bodyModel[26].addBox(0F, 0F, 0F, 1, 21, 6, 0F); // Box 34
		bodyModel[26].setRotationPoint(-25F, -25F, -3F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 1, 21, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 37
		bodyModel[27].setRotationPoint(-25F, -25F, 3F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[28].setRotationPoint(-25F, -26F, -3F);

		bodyModel[29].addBox(0F, 0F, 0F, 36, 20, 14, 0F); // Box 41
		bodyModel[29].setRotationPoint(-23F, -24F, -7F);

		bodyModel[30].addBox(0F, 0F, 0F, 0, 2, 16, 0F); // Box 42
		bodyModel[30].setRotationPoint(29F, -4F, -8F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 0, 5, 3, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
		bodyModel[31].setRotationPoint(29F, -2F, -10F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 0, 5, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 44
		bodyModel[32].setRotationPoint(29F, -2F, 7F);

		bodyModel[33].addBox(0F, 0F, 0F, 49, 1, 6, 0F); // Box 45
		bodyModel[33].setRotationPoint(-24F, -26F, -3F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 37, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 46
		bodyModel[34].setRotationPoint(-24F, -26F, 3F);

		bodyModel[35].addBox(0F, 0F, 0F, 11, 14, 1, 0F); // Box 48
		bodyModel[35].setRotationPoint(14F, -22F, -11F);

		bodyModel[36].addBox(0F, 0F, 0F, 11, 14, 1, 0F); // Box 49
		bodyModel[36].setRotationPoint(14F, -22F, 10F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 12, 1, 2, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 129
		bodyModel[37].setRotationPoint(13F, -24F, 8F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 12, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 130
		bodyModel[38].setRotationPoint(13F, -23F, 10F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 12, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F); // Box 132
		bodyModel[39].setRotationPoint(13F, -26F, 3F);

		bodyModel[40].addBox(0F, 0F, 0F, 7, 1, 4, 0F); // Box 135
		bodyModel[40].setRotationPoint(-10F, -26.5F, -2F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 12, 1, 5, 0F,0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 57
		bodyModel[41].setRotationPoint(13F, -26F, -8F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 12, 1, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 58
		bodyModel[42].setRotationPoint(13F, -24F, -10F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 12, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 59
		bodyModel[43].setRotationPoint(13F, -23F, -11F);

		bodyModel[44].addBox(-0.5F, 0F, -0.5F, 1, 14, 4, 0F); // Box 315 door swing right
		bodyModel[44].setRotationPoint(13.5F, -22F, -10.5F);

		bodyModel[45].addBox(0F, 0F, 0F, 12, 4, 22, 0F); // Box 61
		bodyModel[45].setRotationPoint(13F, -8F, -11F);

		bodyModel[46].addBox(0F, 0F, 0F, 2, 0, 4, 0F); // Box 62
		bodyModel[46].setRotationPoint(25F, -6F, -2F);

		bodyModel[47].addBox(0F, 0F, 0F, 1, 14, 18, 0F); // Box 63
		bodyModel[47].setRotationPoint(13F, -22F, -7F);

		bodyModel[48].addBox(0F, 0F, 0F, 1, 14, 8, 0F); // Box 64
		bodyModel[48].setRotationPoint(24F, -22F, -10F);

		bodyModel[49].addBox(0F, 0F, 0F, 1, 14, 8, 0F); // Box 65
		bodyModel[49].setRotationPoint(24F, -22F, 2F);

		bodyModel[50].addBox(0F, 0F, 0F, 1, 1, 16, 0F); // Box 66
		bodyModel[50].setRotationPoint(24F, -23F, -8F);

		bodyModel[51].addBox(0F, 0F, 0F, 1, 2, 6, 0F); // Box 67
		bodyModel[51].setRotationPoint(24F, -25F, -3F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 68
		bodyModel[52].setRotationPoint(24F, -24.5F, -8F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 69
		bodyModel[53].setRotationPoint(24F, -23F, -10F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 71
		bodyModel[54].setRotationPoint(24F, -23F, 8F);

		bodyModel[55].addBox(0F, 0F, 0F, 1, 3, 3, 0F); // Box 78 lamp rear
		bodyModel[55].setRotationPoint(24.5F, -25F, -1.5F);

		bodyModel[56].addShapeBox(-0.5F, 0F, -0.5F, 1, 14, 4, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 79
		bodyModel[56].setRotationPoint(24.5F, -22F, -1.5F);

		bodyModel[57].addBox(0F, 0F, 0F, 0, 1, 20, 0F); // Box 80
		bodyModel[57].setRotationPoint(-29F, 3F, -10F);

		bodyModel[58].addBox(0F, 0F, 0F, 0, 6, 3, 0F); // Box 81
		bodyModel[58].setRotationPoint(-26F, -2F, -10F);

		bodyModel[59].addBox(0F, 0F, 0F, 0, 1, 4, 0F); // Box 82
		bodyModel[59].setRotationPoint(-26F, 4F, 7F);

		bodyModel[60].addBox(0F, 0F, 0F, 0, 6, 3, 0F); // Box 83
		bodyModel[60].setRotationPoint(-26F, -2F, 7F);

		bodyModel[61].addBox(0F, 0F, 0F, 0, 1, 4, 0F); // Box 84
		bodyModel[61].setRotationPoint(26F, 4F, 7F);

		bodyModel[62].addBox(0F, 0F, 0F, 0, 1, 4, 0F); // Box 85
		bodyModel[62].setRotationPoint(26F, 4F, -11F);

		bodyModel[63].addBox(0F, 0F, 0F, 0, 6, 3, 0F); // Box 86
		bodyModel[63].setRotationPoint(26F, -2F, -10F);

		bodyModel[64].addBox(0F, 0F, 0F, 0, 1, 22, 0F); // Box 87
		bodyModel[64].setRotationPoint(29F, 4F, -11F);

		bodyModel[65].addBox(0F, 0F, 0F, 0, 1, 20, 0F); // Box 88
		bodyModel[65].setRotationPoint(29F, 3F, -10F);

		bodyModel[66].addBox(0F, 0F, 0F, 0, 6, 3, 0F); // Box 89
		bodyModel[66].setRotationPoint(26F, -2F, 7F);

		bodyModel[67].addBox(0F, 0F, 0F, 1, 3, 3, 0F); // Box 90 lamp front
		bodyModel[67].setRotationPoint(-25.5F, -23F, -1.5F);

		bodyModel[68].addBox(0F, 0F, 0F, 2, 2, 23, 0F); // Box 92
		bodyModel[68].setRotationPoint(-17F, -3F, -11.5F);

		bodyModel[69].addBox(0F, 0F, 0F, 2, 2, 23, 0F); // Box 93
		bodyModel[69].setRotationPoint(12F, -3F, -11.5F);

		bodyModel[70].addBox(0F, 0F, 0F, 38, 8, 0, 0F); // Box 102
		bodyModel[70].setRotationPoint(-25F, -12F, -11F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 2, 2, 0, 0F,-2F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[71].setRotationPoint(-27F, -12F, -11F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 2, 2, 0, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -1F, 0F); // Box 104
		bodyModel[72].setRotationPoint(10F, -13F, -11F);

		bodyModel[73].addBox(0F, 0F, 0F, 1, 7, 0, 0F); // Box 105
		bodyModel[73].setRotationPoint(11F, -20F, -11F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 2, 2, 0, 0F,-2F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 106
		bodyModel[74].setRotationPoint(11F, -22F, -11F);

		bodyModel[75].addBox(0F, 0F, 0F, 32, 8, 0, 0F); // Box 107
		bodyModel[75].setRotationPoint(-25F, -12F, 11F);

		bodyModel[76].addBox(0F, 0F, 0F, 1, 10, 0, 0F); // Box 108
		bodyModel[76].setRotationPoint(-27F, -10F, -11F);

		bodyModel[77].addBox(0F, 0F, 0F, 0, 1, 1, 0F); // Box 109
		bodyModel[77].setRotationPoint(-26F, -1F, -11F);

		bodyModel[78].addBox(0F, 0F, 0F, 0, 1, 1, 0F); // Box 110
		bodyModel[78].setRotationPoint(-26F, -1F, 10F);

		bodyModel[79].addBox(0F, 0F, 0F, 1, 10, 0, 0F); // Box 111
		bodyModel[79].setRotationPoint(-27F, -10F, 11F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 2, 2, 0, 0F,-2F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 112
		bodyModel[80].setRotationPoint(-27F, -12F, 11F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 113
		bodyModel[81].setRotationPoint(-29F, 1F, -10F);

		bodyModel[82].addBox(0F, 0F, 0F, 0, 5, 1, 0F); // Box 114
		bodyModel[82].setRotationPoint(-29F, -4F, -10F);

		bodyModel[83].addBox(0F, 0F, 0F, 0, 8, 20, 0F); // Box 115
		bodyModel[83].setRotationPoint(-29F, -12F, -10F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 0, 1, 5, 0F,0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, -1F, 0F, 4F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 116
		bodyModel[84].setRotationPoint(-29F, -12F, -10F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 0, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, -1F, 0F, 4F, -1F); // Box 117
		bodyModel[85].setRotationPoint(-29F, -12F, 5F);

		bodyModel[86].addBox(0F, 0F, 0F, 0, 5, 1, 0F); // Box 118
		bodyModel[86].setRotationPoint(-29F, -4F, 9F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 119
		bodyModel[87].setRotationPoint(-29F, 1F, 9F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 126
		bodyModel[88].setRotationPoint(29F, 1F, -10F);

		bodyModel[89].addBox(0F, 0F, 0F, 0, 5, 1, 0F); // Box 127
		bodyModel[89].setRotationPoint(29F, -4F, -10F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 128
		bodyModel[90].setRotationPoint(29F, 1F, 9F);

		bodyModel[91].addBox(0F, 0F, 0F, 0, 5, 1, 0F); // Box 129
		bodyModel[91].setRotationPoint(29F, -4F, 9F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 0, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, -1F, 0F, 4F, -1F); // Box 130
		bodyModel[92].setRotationPoint(29F, -12F, 5F);

		bodyModel[93].addBox(0F, 0F, 0F, 0, 8, 20, 0F); // Box 131
		bodyModel[93].setRotationPoint(29F, -12F, -10F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 0, 1, 5, 0F,0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, -1F, 0F, 4F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 134
		bodyModel[94].setRotationPoint(29F, -12F, -10F);

		bodyModel[95].addBox(0F, 0F, 0F, 3, 2, 0, 0F); // Box 137
		bodyModel[95].setRotationPoint(-29F, 3F, -10F);

		bodyModel[96].addBox(0F, 0F, 0F, 3, 3, 0, 0F); // Box 138
		bodyModel[96].setRotationPoint(-29F, 0.5F, -8F);

		bodyModel[97].addBox(0F, 0F, 0F, 3, 3, 0, 0F); // Box 139
		bodyModel[97].setRotationPoint(-29F, -2F, -7F);

		bodyModel[98].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 149 glow
		bodyModel[98].setRotationPoint(-21F, -23.5F, -7.5F);

		bodyModel[99].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 150 glow
		bodyModel[99].setRotationPoint(-21F, -23.5F, 6.5F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 167
		bodyModel[100].setRotationPoint(24F, -24.5F, 3F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[101].setRotationPoint(24F, -24F, -8F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 169
		bodyModel[102].setRotationPoint(24F, -24F, 3F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 170
		bodyModel[103].setRotationPoint(13F, -24F, 3F);

		bodyModel[104].addBox(0F, 0F, 0F, 1, 1, 16, 0F); // Box 171
		bodyModel[104].setRotationPoint(13F, -23F, -8F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 172
		bodyModel[105].setRotationPoint(13F, -23F, 8F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 173
		bodyModel[106].setRotationPoint(13F, -24.5F, 3F);

		bodyModel[107].addBox(0F, 0F, 0F, 1, 2, 6, 0F); // Box 174
		bodyModel[107].setRotationPoint(13F, -25F, -3F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 175
		bodyModel[108].setRotationPoint(13F, -24.5F, -8F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 176
		bodyModel[109].setRotationPoint(13F, -24F, -8F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 177
		bodyModel[110].setRotationPoint(13F, -23F, -10F);

		bodyModel[111].addBox(0F, 0F, 0F, 6, 9, 4, 0F); // Box 67
		bodyModel[111].setRotationPoint(12F, -16.98F, -3.5F);
		bodyModel[111].rotateAngleY = -0.6981317F;

		bodyModel[112].addBox(0F, 0F, 0F, 1, 4, 4, 0F); // Box 70
		bodyModel[112].setRotationPoint(14F, -17F, 2F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, -1F, -1F); // Box 71
		bodyModel[113].setRotationPoint(14F, -25F, -1F);

		bodyModel[114].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 78 lantern
		bodyModel[114].setRotationPoint(19F, -25.5F, -1F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 211 ditchlight front
		bodyModel[115].setRotationPoint(-29.5F, -6F, 4.25F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 212
		bodyModel[116].setRotationPoint(-29F, -6F, 4F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 213
		bodyModel[117].setRotationPoint(-29F, -6F, -6F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 214 ditchlight front
		bodyModel[118].setRotationPoint(-29.5F, -6F, -5.75F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F); // Box 160 ditchlight rear
		bodyModel[119].setRotationPoint(30F, -6F, -4.25F);
		bodyModel[119].rotateAngleY = -3.14159265F;

		bodyModel[120].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 161
		bodyModel[120].setRotationPoint(29.5F, -6F, -4F);
		bodyModel[120].rotateAngleY = -3.14159265F;

		bodyModel[121].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 162
		bodyModel[121].setRotationPoint(29.5F, -6F, 6F);
		bodyModel[121].rotateAngleY = -3.14159265F;

		bodyModel[122].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F); // Box 163 ditchlight rear
		bodyModel[122].setRotationPoint(30F, -6F, 5.75F);
		bodyModel[122].rotateAngleY = -3.14159265F;

		bodyModel[123].addBox(0F, 0F, 0F, 0, 6, 1, 0F); // Box 191
		bodyModel[123].setRotationPoint(26F, -7F, 10.5F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 0, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, -1F, 0F, 4F, -1F); // Box 192
		bodyModel[124].setRotationPoint(26F, -12F, 6.5F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 193
		bodyModel[125].setRotationPoint(26F, -1F, 10.5F);

		bodyModel[126].addBox(0F, 0F, 0F, 1, 1, 0, 0F); // Box 197
		bodyModel[126].setRotationPoint(25F, -12F, 6.5F);

		bodyModel[127].addBox(0F, 0F, 0F, 1, 1, 0, 0F); // Box 198
		bodyModel[127].setRotationPoint(25F, -12F, -6.5F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 0, 1, 5, 0F,0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, -1F, 0F, 4F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 199
		bodyModel[128].setRotationPoint(26F, -12F, -11.5F);

		bodyModel[129].addBox(0F, 0F, 0F, 0, 6, 1, 0F); // Box 200
		bodyModel[129].setRotationPoint(26F, -7F, -11.5F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 201
		bodyModel[130].setRotationPoint(26F, -1F, -11.5F);

		bodyModel[131].addBox(0F, 0F, 0F, 1, 9, 0, 0F); // Box 202
		bodyModel[131].setRotationPoint(25F, -21F, -2.5F);

		bodyModel[132].addBox(0F, 0F, 0F, 1, 9, 0, 0F); // Box 203
		bodyModel[132].setRotationPoint(25F, -21F, 2.5F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.5F, 0.25F, 0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, 0.5F, 0.25F, 0.25F, 0.5F, 0.25F, 0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, 0.5F, 0.25F, 0.25F); // Box 164
		bodyModel[133].setRotationPoint(11.5F, -25F, 8F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.25F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F); // Box 165
		bodyModel[134].setRotationPoint(12.5F, -25F, 8F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 166
		bodyModel[135].setRotationPoint(13.5F, -25F, 8F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.5F, 0.25F, 0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, 0.5F, 0.25F, 0.25F, 0.5F, 0.25F, 0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, 0.5F, 0.25F, 0.25F); // Box 207
		bodyModel[136].setRotationPoint(14.5F, -27F, -0.5F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.25F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F); // Box 208
		bodyModel[137].setRotationPoint(15.5F, -27F, -0.5F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 209
		bodyModel[138].setRotationPoint(16.5F, -27F, -0.5F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 399 commander beacon
		bodyModel[139].setRotationPoint(18.32F, -27F, -0.5F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0.3F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, 0.3F, -0.5F, 0.1F, 0.3F, 0F, 0.1F, -1F, 0F, 0.1F, -1F, 0F, 0.1F, 0.3F, 0F, 0.1F); // Box 400
		bodyModel[140].setRotationPoint(18.5F, -27F, -0.5F);

		bodyModel[141].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 215
		bodyModel[141].setRotationPoint(20F, -26.5F, -6.5F);

		bodyModel[142].addBox(0F, 0F, 0F, 0, 5, 2, 0F); // Box 216
		bodyModel[142].setRotationPoint(14F, -20F, 10F);

		bodyModel[143].addBox(0F, 0F, 0F, 0, 5, 2, 0F); // Box 217
		bodyModel[143].setRotationPoint(14F, -20F, -12F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -1F, 1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // box64
		bodyModel[144].setRotationPoint(16F, -22F, 11F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,1F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // box65
		bodyModel[145].setRotationPoint(16F, -22F, -12F);

		bodyModel[146].addBox(0F, 0F, 0F, 3, 1, 3, 0F); // Box 222
		bodyModel[146].setRotationPoint(-18F, -26.5F, -1.5F);

		bodyModel[147].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 227
		bodyModel[147].setRotationPoint(-29F, 5F, 10F);

		bodyModel[148].addBox(0F, 0F, 0F, 3, 2, 0, 0F); // Box 228
		bodyModel[148].setRotationPoint(-29F, 3F, 10F);

		bodyModel[149].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 229
		bodyModel[149].setRotationPoint(-29F, 3F, 8F);

		bodyModel[150].addBox(0F, 0F, 0F, 3, 3, 0, 0F); // Box 230
		bodyModel[150].setRotationPoint(-29F, 0.5F, 8F);

		bodyModel[151].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 231
		bodyModel[151].setRotationPoint(-29F, 0.5F, 7F);

		bodyModel[152].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 232
		bodyModel[152].setRotationPoint(-29F, -2F, 7F);

		bodyModel[153].addBox(0F, 0F, 0F, 3, 3, 0, 0F); // Box 233
		bodyModel[153].setRotationPoint(-29F, -2F, 7F);

		bodyModel[154].addBox(0F, 0F, 0F, 3, 3, 0, 0F); // Box 248
		bodyModel[154].setRotationPoint(26F, -2F, -7F);

		bodyModel[155].addBox(0F, 0F, 0F, 0, 2, 14, 0F); // Box 250
		bodyModel[155].setRotationPoint(-29.01F, -5.5F, -7F);

		bodyModel[156].addBox(0F, 0F, 0F, 0, 2, 14, 0F); // Box 251
		bodyModel[156].setRotationPoint(29.01F, -5.5F, -7F);

		bodyModel[157].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 221
		bodyModel[157].setRotationPoint(-17F, -1F, -1F);

		bodyModel[158].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 222
		bodyModel[158].setRotationPoint(12F, -1F, -1F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 37, 1, 3, 0F,0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 223
		bodyModel[159].setRotationPoint(-24F, -26F, -6F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 36, 1, 1, 0F,0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 224
		bodyModel[160].setRotationPoint(-23F, -25F, 6F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 36, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 226
		bodyModel[161].setRotationPoint(-23F, -25F, -7F);

		bodyModel[162].addBox(0F, 0F, 0F, 37, 1, 12, 0F); // Box 227
		bodyModel[162].setRotationPoint(-24F, -25F, -6F);

		bodyModel[163].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 228
		bodyModel[163].setRotationPoint(-23F, -26.5F, -1F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0F, -1F, -0.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 229
		bodyModel[164].setRotationPoint(-25F, -26F, 3F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 1, 20, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 230
		bodyModel[165].setRotationPoint(-24F, -24F, 6F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 231
		bodyModel[166].setRotationPoint(-24F, -25F, 6F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 1, 21, 3, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 232
		bodyModel[167].setRotationPoint(-25F, -25F, -6F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-1F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 233
		bodyModel[168].setRotationPoint(-25F, -26F, -6F);

		bodyModel[169].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-1F, -1F, 0F, 0F, -1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 234
		bodyModel[169].setRotationPoint(-24F, -25F, -7F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 1, 20, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 235
		bodyModel[170].setRotationPoint(-24F, -24F, -7F);

		bodyModel[171].addBox(0F, 0F, 0F, 7, 1, 4, 0F); // Box 236
		bodyModel[171].setRotationPoint(-2F, -26.5F, -2F);

		bodyModel[172].addBox(-1.5F, 0F, -1.5F, 3, 1, 3, 0F); // Box 237
		bodyModel[172].setRotationPoint(8F, -26.5F, 0F);
		bodyModel[172].rotateAngleY = -0.78539816F;

		bodyModel[173].addBox(0F, 0F, 0F, 2, 1, 4, 0F); // Box 238
		bodyModel[173].setRotationPoint(11F, -26.5F, -2F);

		bodyModel[174].addBox(0F, 0F, 0F, 6, 8, 4, 0F); // Box 239
		bodyModel[174].setRotationPoint(7F, -12F, 7F);

		bodyModel[175].addBox(-1F, -1F, 0F, 2, 2, 21, 0F); // Box 240
		bodyModel[175].setRotationPoint(0.5F, 2F, -10.5F);
		bodyModel[175].rotateAngleZ = 0.78539816F;

		bodyModel[176].addBox(-1F, -1F, 0F, 2, 2, 21, 0F); // Box 241
		bodyModel[176].setRotationPoint(-3.5F, 2F, -10.5F);
		bodyModel[176].rotateAngleZ = 0.78539816F;

		bodyModel[177].addBox(-1F, -1F, 0F, 2, 2, 21, 0F); // Box 242
		bodyModel[177].setRotationPoint(-1.5F, 2F, -10.5F);
		bodyModel[177].rotateAngleZ = 0.78539816F;

		bodyModel[178].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Box 243
		bodyModel[178].setRotationPoint(25F, -26F, -3F);

		bodyModel[179].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 244
		bodyModel[179].setRotationPoint(25F, -26F, -8F);

		bodyModel[180].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 245
		bodyModel[180].setRotationPoint(25F, -23F, -11F);

		bodyModel[181].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 246
		bodyModel[181].setRotationPoint(25F, -24F, -10F);

		bodyModel[182].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F); // Box 247
		bodyModel[182].setRotationPoint(25F, -26F, 3F);

		bodyModel[183].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 248
		bodyModel[183].setRotationPoint(25F, -24F, 8F);

		bodyModel[184].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 249
		bodyModel[184].setRotationPoint(25F, -23F, 10F);

		bodyModel[185].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 325 extra stacc
		bodyModel[185].setRotationPoint(-18F, -28.5F, -1.5F);

		bodyModel[186].addBox(0F, 0F, 0F, 11, 2, 0, 0F); // Box 326
		bodyModel[186].setRotationPoint(14F, -2F, -11F);

		bodyModel[187].addBox(0F, 0F, 0F, 11, 2, 0, 0F); // Box 327
		bodyModel[187].setRotationPoint(14F, -2F, 11F);

		bodyModel[188].addShapeBox(0F, 0F, 0F, 0, 8, 1, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, -2F, 3F, 0F, -2F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 328
		bodyModel[188].setRotationPoint(-29F, -12F, -10F);

		bodyModel[189].addShapeBox(0F, 0F, 0F, 0, 8, 1, 0F,0F, -2F, 3F, 0F, -2F, 3F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 329
		bodyModel[189].setRotationPoint(-29F, -12F, 9F);

		bodyModel[190].addShapeBox(0F, 0F, 0F, 0, 8, 1, 0F,0F, -2F, 3F, 0F, -2F, 3F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 330
		bodyModel[190].setRotationPoint(29F, -12F, 9F);

		bodyModel[191].addShapeBox(0F, 0F, 0F, 0, 8, 1, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, -2F, 3F, 0F, -2F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 331
		bodyModel[191].setRotationPoint(29F, -12F, -10F);

		bodyModel[192].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F); // Box 334
		bodyModel[192].setRotationPoint(11F, -26F, 3F);

		bodyModel[193].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 335
		bodyModel[193].setRotationPoint(11F, -24F, 8F);

		bodyModel[194].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 336
		bodyModel[194].setRotationPoint(11F, -23F, 10F);

		bodyModel[195].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 337
		bodyModel[195].setRotationPoint(11F, -26F, -8F);

		bodyModel[196].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 338
		bodyModel[196].setRotationPoint(11F, -24F, -10F);

		bodyModel[197].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 339
		bodyModel[197].setRotationPoint(11F, -23F, -11F);

		bodyModel[198].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.5F, 0.25F, 0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, 0.5F, 0.25F, 0.25F, 0.5F, 0.25F, 0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, 0.5F, 0.25F, 0.25F); // Box 340
		bodyModel[198].setRotationPoint(9.5F, -23.5F, 7F);

		bodyModel[199].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.25F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F); // Box 341
		bodyModel[199].setRotationPoint(10.5F, -23.5F, 7F);

		bodyModel[200].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 342
		bodyModel[200].setRotationPoint(11.5F, -23.5F, 7F);

		bodyModel[201].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 114
		bodyModel[201].setRotationPoint(-27F, -24.5F, -0.5F);

		bodyModel[202].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[202].setRotationPoint(-27F, -25.5F, -0.5F);

		bodyModel[203].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 78
		bodyModel[203].setRotationPoint(-26.75F, -24F, -0.25F);

		bodyModel[204].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 875
		bodyModel[204].setRotationPoint(-27F, -25.5F, -1F);

		bodyModel[205].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 876
		bodyModel[205].setRotationPoint(-27F, -25.5F, 1F);

		bodyModel[206].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 877
		bodyModel[206].setRotationPoint(-26.75F, -25.75F, -1.5F);

		bodyModel[207].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.25F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F); // Box 349
		bodyModel[207].setRotationPoint(-14.5F, -23.5F, 7F);

		bodyModel[208].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 350
		bodyModel[208].setRotationPoint(-13.5F, -23.5F, 7F);

		bodyModel[209].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.5F, 0.25F, 0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, 0.5F, 0.25F, 0.25F, 0.5F, 0.25F, 0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, 0.5F, 0.25F, 0.25F); // Box 351
		bodyModel[209].setRotationPoint(-15.5F, -23.5F, 7F);

		bodyModel[210].addBox(0F, 0F, 0F, 5, 0, 4, 0F); // Box 352
		bodyModel[210].setRotationPoint(-25F, -14F, -7.5F);

		bodyModel[211].addBox(0F, 0F, 0F, 5, 0, 4, 0F); // Box 353
		bodyModel[211].setRotationPoint(-25F, -14F, 3.5F);

		bodyModel[212].addBox(0F, 0F, 0F, 3, 2, 0, 0F); // Box 354
		bodyModel[212].setRotationPoint(26F, 3F, 10F);

		bodyModel[213].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 355
		bodyModel[213].setRotationPoint(26F, 5F, 10F);

		bodyModel[214].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 356
		bodyModel[214].setRotationPoint(26F, 3F, 8F);

		bodyModel[215].addBox(0F, 0F, 0F, 3, 3, 0, 0F); // Box 357
		bodyModel[215].setRotationPoint(26F, 0.5F, 8F);

		bodyModel[216].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 358
		bodyModel[216].setRotationPoint(26F, 0.5F, 7F);

		bodyModel[217].addBox(0F, 0F, 0F, 3, 3, 0, 0F); // Box 359
		bodyModel[217].setRotationPoint(26F, -2F, 7F);

		bodyModel[218].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 360
		bodyModel[218].setRotationPoint(26F, -2F, 7F);

		bodyModel[219].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 361
		bodyModel[219].setRotationPoint(26F, 5F, -11F);

		bodyModel[220].addBox(0F, 0F, 0F, 3, 2, 0, 0F); // Box 362
		bodyModel[220].setRotationPoint(26F, 3F, -10F);

		bodyModel[221].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 363
		bodyModel[221].setRotationPoint(26F, 3F, -10F);

		bodyModel[222].addBox(0F, 0F, 0F, 3, 3, 0, 0F); // Box 364
		bodyModel[222].setRotationPoint(26F, 0.5F, -8F);

		bodyModel[223].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 365
		bodyModel[223].setRotationPoint(26F, 0.5F, -9F);

		bodyModel[224].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 367
		bodyModel[224].setRotationPoint(26F, -2F, -8F);

		bodyModel[225].addBox(0F, 0F, 0F, 6, 5, 4, 0F); // Box 226 atsf bawx
		bodyModel[225].setRotationPoint(7F, -9F, -11F);

		bodyModel[226].addBox(0F, 0F, 0F, 1, 4, 4, 0F); // Box 227
		bodyModel[226].setRotationPoint(12F, -8F, -11F);

		bodyModel[227].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 228
		bodyModel[227].setRotationPoint(11F, -6F, -11F);
	}

	ModelBluntTruck theTrucks = new ModelBluntTruck();

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		for(int i = 0; i < bodyModel.length; i++) {
			if (bodyModel[i].boxName != null && bodyModel[i].boxName.contains("lamp")) {
				Minecraft.getMinecraft().entityRenderer.disableLightmap(1D);
				bodyModel[i].render(f5);
				Minecraft.getMinecraft().entityRenderer.enableLightmap(1D);
			} else {
				bodyModel[i].render(f5);
			}
		}
		if(entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor()==1453){
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/blunttruck_Green.png"));
		} else {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/blunttruck_Black.png"));
		}
		GL11.glPushMatrix();
		GL11.glTranslatef(-0.95F ,0F,0F);
		theTrucks.render(entity,f,f1,f2,f3,f4,f5);
		GL11.glPopMatrix();

		GL11.glPushMatrix();
		GL11.glRotatef(180, 0, 1, 0);
		GL11.glTranslated(-0.75F,0F,0);
		theTrucks.render(entity,f,f1,f2,f3,f4,f5);
		GL11.glPopMatrix();
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
	{

	}

	public ModelRendererTurbo alcos2Model[];
}