//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2018 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator:
// Created on:30.10.2018 - 10:29:06
// Last changed on: 30.10.2018 - 10:29:06

package train.render.models;

import fexcraft.tmt.slim.ModelConverter;
import fexcraft.tmt.slim.ModelRendererTurbo;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import org.lwjgl.opengl.GL11;

public class ModelBP4 extends ModelConverter
{
	int textureX = 512;
	int textureY = 512;

	public ModelBP4() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[225];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 1
		bodyModel[1] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 164
		bodyModel[2] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 114
		bodyModel[3] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 163
		bodyModel[4] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 166
		bodyModel[5] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 168
		bodyModel[6] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 169
		bodyModel[7] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 3
		bodyModel[8] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 246
		bodyModel[9] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 247
		bodyModel[10] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 259
		bodyModel[11] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 262
		bodyModel[12] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 263
		bodyModel[13] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 264
		bodyModel[14] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 265
		bodyModel[15] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 266
		bodyModel[16] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 271
		bodyModel[17] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 272
		bodyModel[18] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 273
		bodyModel[19] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 274
		bodyModel[20] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 275
		bodyModel[21] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 276
		bodyModel[22] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 277
		bodyModel[23] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 278
		bodyModel[24] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 292
		bodyModel[25] = new ModelRendererTurbo(this, 9, 9, textureX, textureY); // Box 271
		bodyModel[26] = new ModelRendererTurbo(this, 329, 9, textureX, textureY); // Box 272
		bodyModel[27] = new ModelRendererTurbo(this, 345, 9, textureX, textureY); // Box 273
		bodyModel[28] = new ModelRendererTurbo(this, 361, 9, textureX, textureY); // Box 274
		bodyModel[29] = new ModelRendererTurbo(this, 385, 9, textureX, textureY); // Box 277
		bodyModel[30] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 278
		bodyModel[31] = new ModelRendererTurbo(this, 393, 9, textureX, textureY); // Box 275
		bodyModel[32] = new ModelRendererTurbo(this, 409, 9, textureX, textureY); // Box 276
		bodyModel[33] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 292
		bodyModel[34] = new ModelRendererTurbo(this, 329, 9, textureX, textureY); // Box 3
		bodyModel[35] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 246
		bodyModel[36] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 247
		bodyModel[37] = new ModelRendererTurbo(this, 353, 9, textureX, textureY); // Box 164
		bodyModel[38] = new ModelRendererTurbo(this, 401, 9, textureX, textureY); // Box 259
		bodyModel[39] = new ModelRendererTurbo(this, 169, 9, textureX, textureY); // Box 261
		bodyModel[40] = new ModelRendererTurbo(this, 337, 9, textureX, textureY); // Box 262
		bodyModel[41] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 263
		bodyModel[42] = new ModelRendererTurbo(this, 337, 17, textureX, textureY); // Box 264
		bodyModel[43] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 265
		bodyModel[44] = new ModelRendererTurbo(this, 41, 25, textureX, textureY); // Box 266
		bodyModel[45] = new ModelRendererTurbo(this, 433, 9, textureX, textureY); // Box 271
		bodyModel[46] = new ModelRendererTurbo(this, 457, 9, textureX, textureY); // Box 272
		bodyModel[47] = new ModelRendererTurbo(this, 497, 9, textureX, textureY); // Box 273
		bodyModel[48] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 274
		bodyModel[49] = new ModelRendererTurbo(this, 345, 17, textureX, textureY); // Box 275
		bodyModel[50] = new ModelRendererTurbo(this, 473, 9, textureX, textureY); // Box 277
		bodyModel[51] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 278
		bodyModel[52] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 292
		bodyModel[53] = new ModelRendererTurbo(this, 361, 17, textureX, textureY); // Box 271
		bodyModel[54] = new ModelRendererTurbo(this, 385, 17, textureX, textureY); // Box 272
		bodyModel[55] = new ModelRendererTurbo(this, 401, 17, textureX, textureY); // Box 273
		bodyModel[56] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 274
		bodyModel[57] = new ModelRendererTurbo(this, 353, 17, textureX, textureY); // Box 277
		bodyModel[58] = new ModelRendererTurbo(this, 177, 9, textureX, textureY); // Box 278
		bodyModel[59] = new ModelRendererTurbo(this, 41, 25, textureX, textureY); // Box 275
		bodyModel[60] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 292
		bodyModel[61] = new ModelRendererTurbo(this, 65, 25, textureX, textureY); // Box 4
		bodyModel[62] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Box 4
		bodyModel[63] = new ModelRendererTurbo(this, 465, 9, textureX, textureY); // Box 261
		bodyModel[64] = new ModelRendererTurbo(this, 113, 25, textureX, textureY); // Box 276
		bodyModel[65] = new ModelRendererTurbo(this, 113, 25, textureX, textureY); // Box 19
		bodyModel[66] = new ModelRendererTurbo(this, 257, 25, textureX, textureY); // Box 25
		bodyModel[67] = new ModelRendererTurbo(this, 241, 25, textureX, textureY); // Box 27
		bodyModel[68] = new ModelRendererTurbo(this, 257, 25, textureX, textureY); // Box 28
		bodyModel[69] = new ModelRendererTurbo(this, 281, 25, textureX, textureY); // Box 29
		bodyModel[70] = new ModelRendererTurbo(this, 297, 25, textureX, textureY); // Box 30
		bodyModel[71] = new ModelRendererTurbo(this, 305, 25, textureX, textureY, "lamp"); // Box 31 lamp
		bodyModel[72] = new ModelRendererTurbo(this, 369, 25, textureX, textureY); // Box 40
		bodyModel[73] = new ModelRendererTurbo(this, 393, 25, textureX, textureY); // Box 41
		bodyModel[74] = new ModelRendererTurbo(this, 417, 33, textureX, textureY); // Box 101
		bodyModel[75] = new ModelRendererTurbo(this, 305, 25, textureX, textureY); // Box 102
		bodyModel[76] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 115 liveryimg 2
		bodyModel[77] = new ModelRendererTurbo(this, 249, 25, textureX, textureY); // Box 116 liveryimg 2
		bodyModel[78] = new ModelRendererTurbo(this, 73, 41, textureX, textureY); // Box 117
		bodyModel[79] = new ModelRendererTurbo(this, 385, 25, textureX, textureY); // Box 118
		bodyModel[80] = new ModelRendererTurbo(this, 409, 25, textureX, textureY); // Box 119
		bodyModel[81] = new ModelRendererTurbo(this, 9, 17, textureX, textureY); // Box 120
		bodyModel[82] = new ModelRendererTurbo(this, 425, 25, textureX, textureY); // Box 121
		bodyModel[83] = new ModelRendererTurbo(this, 489, 25, textureX, textureY); // Box 122
		bodyModel[84] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 123
		bodyModel[85] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 124
		bodyModel[86] = new ModelRendererTurbo(this, 345, 41, textureX, textureY); // Box 9
		bodyModel[87] = new ModelRendererTurbo(this, 33, 49, textureX, textureY); // Box 10
		bodyModel[88] = new ModelRendererTurbo(this, 257, 49, textureX, textureY); // Box 11
		bodyModel[89] = new ModelRendererTurbo(this, 281, 41, textureX, textureY); // Box 15
		bodyModel[90] = new ModelRendererTurbo(this, 81, 49, textureX, textureY); // Box 21
		bodyModel[91] = new ModelRendererTurbo(this, 321, 57, textureX, textureY); // Box 26
		bodyModel[92] = new ModelRendererTurbo(this, 57, 49, textureX, textureY); // Box 33
		bodyModel[93] = new ModelRendererTurbo(this, 305, 49, textureX, textureY); // Box 34
		bodyModel[94] = new ModelRendererTurbo(this, 361, 57, textureX, textureY); // Box 42
		bodyModel[95] = new ModelRendererTurbo(this, 385, 57, textureX, textureY); // Box 43
		bodyModel[96] = new ModelRendererTurbo(this, 417, 33, textureX, textureY, "lamp"); // Box 48 lamp
		bodyModel[97] = new ModelRendererTurbo(this, 425, 57, textureX, textureY); // Box 44
		bodyModel[98] = new ModelRendererTurbo(this, 409, 57, textureX, textureY); // Box 43
		bodyModel[99] = new ModelRendererTurbo(this, 449, 57, textureX, textureY); // Box 44
		bodyModel[100] = new ModelRendererTurbo(this, 465, 57, textureX, textureY); // Box 45
		bodyModel[101] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 64
		bodyModel[102] = new ModelRendererTurbo(this, 121, 65, textureX, textureY); // Box 65
		bodyModel[103] = new ModelRendererTurbo(this, 281, 33, textureX, textureY); // box64
		bodyModel[104] = new ModelRendererTurbo(this, 89, 41, textureX, textureY); // box65
		bodyModel[105] = new ModelRendererTurbo(this, 417, 9, textureX, textureY); // Box 162 light
		bodyModel[106] = new ModelRendererTurbo(this, 369, 25, textureX, textureY); // Box 165
		bodyModel[107] = new ModelRendererTurbo(this, 321, 49, textureX, textureY); // Box 108 liveryimg 1
		bodyModel[108] = new ModelRendererTurbo(this, 377, 57, textureX, textureY); // Box 109 liveryimg 1
		bodyModel[109] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 117 liveryimg 2
		bodyModel[110] = new ModelRendererTurbo(this, 385, 9, textureX, textureY); // Box 118 liveryimg 2
		bodyModel[111] = new ModelRendererTurbo(this, 441, 9, textureX, textureY); // Box 162 light
		bodyModel[112] = new ModelRendererTurbo(this, 441, 25, textureX, textureY); // Box 165
		bodyModel[113] = new ModelRendererTurbo(this, 393, 17, textureX, textureY); // Box 44
		bodyModel[114] = new ModelRendererTurbo(this, 73, 57, textureX, textureY); // Box 45
		bodyModel[115] = new ModelRendererTurbo(this, 409, 17, textureX, textureY); // Box 56
		bodyModel[116] = new ModelRendererTurbo(this, 505, 17, textureX, textureY); // Box 143
		bodyModel[117] = new ModelRendererTurbo(this, 505, 33, textureX, textureY); // Box 62
		bodyModel[118] = new ModelRendererTurbo(this, 121, 25, textureX, textureY); // Box 61
		bodyModel[119] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 63
		bodyModel[120] = new ModelRendererTurbo(this, 481, 57, textureX, textureY); // Box 4
		bodyModel[121] = new ModelRendererTurbo(this, 57, 65, textureX, textureY); // Box 98
		bodyModel[122] = new ModelRendererTurbo(this, 497, 57, textureX, textureY); // Box 5
		bodyModel[123] = new ModelRendererTurbo(this, 289, 41, textureX, textureY); // Box 143
		bodyModel[124] = new ModelRendererTurbo(this, 105, 49, textureX, textureY); // Box 61
		bodyModel[125] = new ModelRendererTurbo(this, 121, 65, textureX, textureY); // Box 62
		bodyModel[126] = new ModelRendererTurbo(this, 321, 57, textureX, textureY); // Box 63
		bodyModel[127] = new ModelRendererTurbo(this, 57, 65, textureX, textureY); // Box 80
		bodyModel[128] = new ModelRendererTurbo(this, 129, 65, textureX, textureY); // Box 81
		bodyModel[129] = new ModelRendererTurbo(this, 177, 65, textureX, textureY); // Box 40
		bodyModel[130] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 55
		bodyModel[131] = new ModelRendererTurbo(this, 273, 81, textureX, textureY); // Box 86
		bodyModel[132] = new ModelRendererTurbo(this, 321, 81, textureX, textureY); // Box 87
		bodyModel[133] = new ModelRendererTurbo(this, 425, 81, textureX, textureY); // Box 255
		bodyModel[134] = new ModelRendererTurbo(this, 81, 89, textureX, textureY); // Box 256
		bodyModel[135] = new ModelRendererTurbo(this, 273, 89, textureX, textureY); // Box 38R
		bodyModel[136] = new ModelRendererTurbo(this, 161, 65, textureX, textureY); // Box 97
		bodyModel[137] = new ModelRendererTurbo(this, 377, 89, textureX, textureY); // Box 176
		bodyModel[138] = new ModelRendererTurbo(this, 329, 25, textureX, textureY); // Box 177
		bodyModel[139] = new ModelRendererTurbo(this, 329, 9, textureX, textureY); // Box 178
		bodyModel[140] = new ModelRendererTurbo(this, 369, 17, textureX, textureY); // Box 177
		bodyModel[141] = new ModelRendererTurbo(this, 457, 9, textureX, textureY); // Box 178
		bodyModel[142] = new ModelRendererTurbo(this, 177, 65, textureX, textureY); // Box 179
		bodyModel[143] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Box 78
		bodyModel[144] = new ModelRendererTurbo(this, 113, 33, textureX, textureY, "lamp"); // Box 186 lamp
		bodyModel[145] = new ModelRendererTurbo(this, 241, 33, textureX, textureY, "lamp"); // Box 187 lamp
		bodyModel[146] = new ModelRendererTurbo(this, 305, 33, textureX, textureY); // Box 188
		bodyModel[147] = new ModelRendererTurbo(this, 33, 41, textureX, textureY, "lamp"); // Box 189 lamp
		bodyModel[148] = new ModelRendererTurbo(this, 417, 41, textureX, textureY, "lamp"); // Box 190 lamp
		bodyModel[149] = new ModelRendererTurbo(this, 473, 65, textureX, textureY); // Box 186
		bodyModel[150] = new ModelRendererTurbo(this, 49, 25, textureX, textureY); // Box 243
		bodyModel[151] = new ModelRendererTurbo(this, 25, 57, textureX, textureY); // Box 244
		bodyModel[152] = new ModelRendererTurbo(this, 425, 57, textureX, textureY); // Box 249
		bodyModel[153] = new ModelRendererTurbo(this, 177, 65, textureX, textureY); // Box 250
		bodyModel[154] = new ModelRendererTurbo(this, 441, 57, textureX, textureY); // Box 239
		bodyModel[155] = new ModelRendererTurbo(this, 465, 57, textureX, textureY, "lamp"); // Box 240 lamp
		bodyModel[156] = new ModelRendererTurbo(this, 249, 65, textureX, textureY, "lamp"); // Box 241 lamp
		bodyModel[157] = new ModelRendererTurbo(this, 257, 65, textureX, textureY); // Box 242
		bodyModel[158] = new ModelRendererTurbo(this, 265, 65, textureX, textureY, "lamp"); // Box 247 lamp
		bodyModel[159] = new ModelRendererTurbo(this, 273, 65, textureX, textureY, "lamp"); // Box 248 lamp
		bodyModel[160] = new ModelRendererTurbo(this, 113, 89, textureX, textureY); // Box 197
		bodyModel[161] = new ModelRendererTurbo(this, 9, 25, textureX, textureY); // Box 198
		bodyModel[162] = new ModelRendererTurbo(this, 129, 89, textureX, textureY); // Box 201
		bodyModel[163] = new ModelRendererTurbo(this, 65, 25, textureX, textureY); // Box 202
		bodyModel[164] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 314 door swing right
		bodyModel[165] = new ModelRendererTurbo(this, 169, 89, textureX, textureY); // Box 315 door swing right
		bodyModel[166] = new ModelRendererTurbo(this, 105, 57, textureX, textureY); // Box 206
		bodyModel[167] = new ModelRendererTurbo(this, 481, 89, textureX, textureY); // Box 234
		bodyModel[168] = new ModelRendererTurbo(this, 289, 25, textureX, textureY); // Box 236
		bodyModel[169] = new ModelRendererTurbo(this, 257, 33, textureX, textureY); // Box 237
		bodyModel[170] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 80
		bodyModel[171] = new ModelRendererTurbo(this, 505, 65, textureX, textureY); // Box 144
		bodyModel[172] = new ModelRendererTurbo(this, 497, 89, textureX, textureY); // Box 145
		bodyModel[173] = new ModelRendererTurbo(this, 249, 57, textureX, textureY); // Box 147
		bodyModel[174] = new ModelRendererTurbo(this, 185, 73, textureX, textureY); // Box 148
		bodyModel[175] = new ModelRendererTurbo(this, 345, 25, textureX, textureY); // Box 61
		bodyModel[176] = new ModelRendererTurbo(this, 265, 89, textureX, textureY); // Box 81
		bodyModel[177] = new ModelRendererTurbo(this, 33, 73, textureX, textureY); // Box 81
		bodyModel[178] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Box 174
		bodyModel[179] = new ModelRendererTurbo(this, 41, 73, textureX, textureY); // Box 176
		bodyModel[180] = new ModelRendererTurbo(this, 105, 97, textureX, textureY); // Box 177
		bodyModel[181] = new ModelRendererTurbo(this, 249, 73, textureX, textureY); // Box 191
		bodyModel[182] = new ModelRendererTurbo(this, 313, 33, textureX, textureY); // Box 227
		bodyModel[183] = new ModelRendererTurbo(this, 265, 33, textureX, textureY); // Box 228
		bodyModel[184] = new ModelRendererTurbo(this, 353, 25, textureX, textureY); // Box 229
		bodyModel[185] = new ModelRendererTurbo(this, 385, 17, textureX, textureY); // Box 230
		bodyModel[186] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 231
		bodyModel[187] = new ModelRendererTurbo(this, 177, 97, textureX, textureY); // Box 4
		bodyModel[188] = new ModelRendererTurbo(this, 201, 97, textureX, textureY); // Box 4
		bodyModel[189] = new ModelRendererTurbo(this, 217, 97, textureX, textureY); // Box 4
		bodyModel[190] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 4
		bodyModel[191] = new ModelRendererTurbo(this, 241, 97, textureX, textureY); // Box 4
		bodyModel[192] = new ModelRendererTurbo(this, 33, 105, textureX, textureY); // Box 4
		bodyModel[193] = new ModelRendererTurbo(this, 65, 105, textureX, textureY); // Box 4
		bodyModel[194] = new ModelRendererTurbo(this, 89, 105, textureX, textureY); // Box 4
		bodyModel[195] = new ModelRendererTurbo(this, 257, 105, textureX, textureY); // Box 4
		bodyModel[196] = new ModelRendererTurbo(this, 289, 105, textureX, textureY); // Box 4
		bodyModel[197] = new ModelRendererTurbo(this, 313, 105, textureX, textureY); // Box 4
		bodyModel[198] = new ModelRendererTurbo(this, 329, 105, textureX, textureY); // Box 4
		bodyModel[199] = new ModelRendererTurbo(this, 49, 73, textureX, textureY); // Box 2
		bodyModel[200] = new ModelRendererTurbo(this, 65, 73, textureX, textureY); // Box 2
		bodyModel[201] = new ModelRendererTurbo(this, 89, 57, textureX, textureY); // Box 894
		bodyModel[202] = new ModelRendererTurbo(this, 505, 33, textureX, textureY); // Box 895
		bodyModel[203] = new ModelRendererTurbo(this, 385, 65, textureX, textureY); // Box 202
		bodyModel[204] = new ModelRendererTurbo(this, 361, 25, textureX, textureY); // Box 891
		bodyModel[205] = new ModelRendererTurbo(this, 425, 41, textureX, textureY); // Box 114
		bodyModel[206] = new ModelRendererTurbo(this, 409, 57, textureX, textureY); // Box 74
		bodyModel[207] = new ModelRendererTurbo(this, 449, 57, textureX, textureY); // Box 78
		bodyModel[208] = new ModelRendererTurbo(this, 257, 73, textureX, textureY); // Box 26
		bodyModel[209] = new ModelRendererTurbo(this, 161, 73, textureX, textureY); // Box 894
		bodyModel[210] = new ModelRendererTurbo(this, 121, 65, textureX, textureY); // Box 895
		bodyModel[211] = new ModelRendererTurbo(this, 273, 73, textureX, textureY); // Box 202
		bodyModel[212] = new ModelRendererTurbo(this, 113, 25, textureX, textureY); // Box 214
		bodyModel[213] = new ModelRendererTurbo(this, 195, 95, textureX, textureY); // Box 333
		bodyModel[214] = new ModelRendererTurbo(this, 219, 97, textureX, textureY, "lamp"); // Box 334 lamp
		bodyModel[215] = new ModelRendererTurbo(this, 237, 97, textureX, textureY, "lamp"); // Box 335 lamp
		bodyModel[216] = new ModelRendererTurbo(this, 431, 1, textureX, textureY); // Box 219 light
		bodyModel[217] = new ModelRendererTurbo(this, 434, 12, textureX, textureY); // Box 220
		bodyModel[218] = new ModelRendererTurbo(this, 182, 92, textureX, textureY); // Box 221
		bodyModel[219] = new ModelRendererTurbo(this, 181, 98, textureX, textureY); // Box 222
		bodyModel[220] = new ModelRendererTurbo(this, 181, 98, textureX, textureY); // Box 223
		bodyModel[221] = new ModelRendererTurbo(this, 238, 29, textureX, textureY); // Box 221
		bodyModel[222] = new ModelRendererTurbo(this, 298, 31, textureX, textureY); // Box 222
		bodyModel[223] = new ModelRendererTurbo(this, 260, 29, textureX, textureY); // Box 223
		bodyModel[224] = new ModelRendererTurbo(this, 280, 29, textureX, textureY); // Box 224

		bodyModel[0].addBox(0F, 0F, 0F, 70, 1, 22, 0F); // Box 1
		bodyModel[0].setRotationPoint(-34F, 0F, -9F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,-1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 164
		bodyModel[1].setRotationPoint(-35F, 1F, -9F);

		bodyModel[2].addBox(0F, 0F, 0F, 70, 2, 14, 0F); // Box 114
		bodyModel[2].setRotationPoint(-34F, 1F, -5F);

		bodyModel[3].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 163
		bodyModel[3].setRotationPoint(-26F, 2.5F, 0F);

		bodyModel[4].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 166
		bodyModel[4].setRotationPoint(24F, 2.5F, 0F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 2, 1, 21, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 168
		bodyModel[5].setRotationPoint(-25F, 1F, -8.5F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 2, 1, 21, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 169
		bodyModel[6].setRotationPoint(25F, 1F, -8.5F);

		bodyModel[7].addBox(0F, 0F, 0F, 0, 9, 18, 0F); // Box 3
		bodyModel[7].setRotationPoint(-39.01F, 0F, -7F);

		bodyModel[8].addBox(0F, 0F, 0F, 0, 7, 1, 0F); // Box 246
		bodyModel[8].setRotationPoint(-39F, 2F, -8F);

		bodyModel[9].addBox(0F, 0F, 0F, 0, 7, 1, 0F); // Box 247
		bodyModel[9].setRotationPoint(-39F, 2F, 11F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 259
		bodyModel[10].setRotationPoint(-35F, 1F, 9F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 262
		bodyModel[11].setRotationPoint(-35F, 0F, 9F);

		bodyModel[12].addBox(0F, 0F, 0F, 2, 3, 14, 0F); // Box 263
		bodyModel[12].setRotationPoint(-36F, 0F, -5F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,-1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, -2F); // Box 264
		bodyModel[13].setRotationPoint(-35F, 4F, -9F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -2F, -1F, 0F, -2F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 265
		bodyModel[14].setRotationPoint(-35F, 4F, 9F);

		bodyModel[15].addBox(0F, 0F, 0F, 3, 2, 14, 0F); // Box 266
		bodyModel[15].setRotationPoint(-39F, 0F, -5F);

		bodyModel[16].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 271
		bodyModel[16].setRotationPoint(-39F, 0F, -6F);

		bodyModel[17].addBox(0F, 0F, 0F, 4, 0, 3, 0F); // Box 272
		bodyModel[17].setRotationPoint(-39F, 7F, -9F);

		bodyModel[18].addBox(0F, 0F, 0F, 4, 0, 3, 0F); // Box 273
		bodyModel[18].setRotationPoint(-39F, 4F, -8F);

		bodyModel[19].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 274
		bodyModel[19].setRotationPoint(-39F, 2F, -7F);

		bodyModel[20].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 275
		bodyModel[20].setRotationPoint(-39F, 6F, -6F);

		bodyModel[21].addBox(0F, 0F, 0F, 3, 1, 0, 0F); // Box 276
		bodyModel[21].setRotationPoint(-39F, 3F, -5F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 1, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 277
		bodyModel[22].setRotationPoint(-35F, 7F, -9F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 1, 0, 1, 0F,0F, 0F, 0F, -0.3F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 278
		bodyModel[23].setRotationPoint(-35F, 4F, -8F);

		bodyModel[24].addBox(0F, 0F, 0F, 0, 1, 1, 0F); // Box 292
		bodyModel[24].setRotationPoint(-35F, 6F, -7F);

		bodyModel[25].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 271
		bodyModel[25].setRotationPoint(-39F, 0F, 9F);

		bodyModel[26].addBox(0F, 0F, 0F, 4, 0, 3, 0F); // Box 272
		bodyModel[26].setRotationPoint(-39F, 7F, 10F);

		bodyModel[27].addBox(0F, 0F, 0F, 4, 0, 3, 0F); // Box 273
		bodyModel[27].setRotationPoint(-39F, 4F, 9F);

		bodyModel[28].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 274
		bodyModel[28].setRotationPoint(-39F, 2F, 9F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 1, 0, 2, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 277
		bodyModel[29].setRotationPoint(-35F, 7F, 11F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 1, 0, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F); // Box 278
		bodyModel[30].setRotationPoint(-35F, 4F, 11F);

		bodyModel[31].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 275
		bodyModel[31].setRotationPoint(-39F, 6F, 10F);

		bodyModel[32].addBox(0F, 0F, 0F, 3, 1, 0, 0F); // Box 276
		bodyModel[32].setRotationPoint(-39F, 3F, 9F);

		bodyModel[33].addBox(0F, 0F, 0F, 0, 1, 1, 0F); // Box 292
		bodyModel[33].setRotationPoint(-35F, 6F, 10F);

		bodyModel[34].addBox(0F, 0F, 0F, 0, 9, 18, 0F); // Box 3
		bodyModel[34].setRotationPoint(41.01F, 0F, -7F);

		bodyModel[35].addBox(0F, 0F, 0F, 0, 7, 1, 0F); // Box 246
		bodyModel[35].setRotationPoint(41.02F, 2F, -8F);

		bodyModel[36].addBox(0F, 0F, 0F, 0, 7, 1, 0F); // Box 247
		bodyModel[36].setRotationPoint(41.02F, 2F, 11F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 164
		bodyModel[37].setRotationPoint(36F, 1F, -9F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,-1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 259
		bodyModel[38].setRotationPoint(36F, 1F, 9F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 261
		bodyModel[39].setRotationPoint(36F, 0F, -9F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 262
		bodyModel[40].setRotationPoint(36F, 0F, 9F);

		bodyModel[41].addBox(0F, 0F, 0F, 2, 3, 14, 0F); // Box 263
		bodyModel[41].setRotationPoint(36F, 0F, -5F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -2F, -1F, 0F, -2F); // Box 264
		bodyModel[42].setRotationPoint(36F, 4F, -9F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,-1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 265
		bodyModel[43].setRotationPoint(36F, 4F, 9F);

		bodyModel[44].addBox(0F, 0F, 0F, 3, 2, 14, 0F); // Box 266
		bodyModel[44].setRotationPoint(38F, 0F, -5F);

		bodyModel[45].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 271
		bodyModel[45].setRotationPoint(38F, 0F, -6F);

		bodyModel[46].addBox(0F, 0F, 0F, 4, 0, 3, 0F); // Box 272
		bodyModel[46].setRotationPoint(37F, 7F, -9F);

		bodyModel[47].addBox(0F, 0F, 0F, 4, 0, 3, 0F); // Box 273
		bodyModel[47].setRotationPoint(37F, 4F, -8F);

		bodyModel[48].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 274
		bodyModel[48].setRotationPoint(37F, 2F, -7F);

		bodyModel[49].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 275
		bodyModel[49].setRotationPoint(37F, 6F, -6F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 1, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 277
		bodyModel[50].setRotationPoint(36F, 7F, -9F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 1, 0, 1, 0F,-0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 278
		bodyModel[51].setRotationPoint(36F, 4F, -8F);

		bodyModel[52].addBox(0F, 0F, 0F, 0, 1, 1, 0F); // Box 292
		bodyModel[52].setRotationPoint(37F, 6F, -7F);

		bodyModel[53].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 271
		bodyModel[53].setRotationPoint(38F, 0F, 9F);

		bodyModel[54].addBox(0F, 0F, 0F, 4, 0, 3, 0F); // Box 272
		bodyModel[54].setRotationPoint(37F, 7F, 10F);

		bodyModel[55].addBox(0F, 0F, 0F, 4, 0, 3, 0F); // Box 273
		bodyModel[55].setRotationPoint(37F, 4F, 9F);

		bodyModel[56].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 274
		bodyModel[56].setRotationPoint(37F, 2F, 9F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 1, 0, 2, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 277
		bodyModel[57].setRotationPoint(36F, 7F, 11F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 1, 0, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F); // Box 278
		bodyModel[58].setRotationPoint(36F, 4F, 11F);

		bodyModel[59].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 275
		bodyModel[59].setRotationPoint(37F, 6F, 10F);

		bodyModel[60].addBox(0F, 0F, 0F, 0, 1, 1, 0F); // Box 292
		bodyModel[60].setRotationPoint(37F, 6F, 10F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 5, 7, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[61].setRotationPoint(-39F, 2F, -1F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 5, 7, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); // Box 4
		bodyModel[62].setRotationPoint(36F, 2F, -1F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 261
		bodyModel[63].setRotationPoint(-35F, 0F, -9F);

		bodyModel[64].addBox(0F, 0F, 0F, 3, 1, 0, 0F); // Box 276
		bodyModel[64].setRotationPoint(38F, 3F, 9F);

		bodyModel[65].addBox(0F, 0F, 0F, 55, 21, 14, 0F); // Box 19
		bodyModel[65].setRotationPoint(-19F, -21F, -5F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 3, 3, 14, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25
		bodyModel[66].setRotationPoint(20F, -24F, -5F);

		bodyModel[67].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 27
		bodyModel[67].setRotationPoint(32F, -22.5F, 6F);

		bodyModel[68].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 28
		bodyModel[68].setRotationPoint(32F, -23F, 5F);

		bodyModel[69].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 29
		bodyModel[69].setRotationPoint(32F, -22.5F, 4F);

		bodyModel[70].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 30
		bodyModel[70].setRotationPoint(33F, -22F, 5F);

		bodyModel[71].addBox(0F, 0F, 0F, 2, 2, 4, 0F); // Box 31 lamp
		bodyModel[71].setRotationPoint(37.25F, -18F, 0F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 3, 21, 7, 0F,0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		bodyModel[72].setRotationPoint(36F, -21F, -5F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 3, 21, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[73].setRotationPoint(36F, -21F, 2F);

		bodyModel[74].addBox(0F, 0F, 0F, 33, 3, 14, 0F); // Box 101
		bodyModel[74].setRotationPoint(-13F, -24F, -5F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 3, 3, 14, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 102
		bodyModel[75].setRotationPoint(-16F, -24F, -5F);

		bodyModel[76].addBox(0F, 0F, 0F, 0, 3, 5, 0F); // Box 115 liveryimg 2
		bodyModel[76].setRotationPoint(36.45F, -16F, -4F);
		bodyModel[76].rotateAngleY = -0.41887902F;

		bodyModel[77].addBox(0F, 0F, -5F, 0, 3, 5, 0F); // Box 116 liveryimg 2
		bodyModel[77].setRotationPoint(36.45F, -16F, 8F);
		bodyModel[77].rotateAngleY = 0.41887902F;

		bodyModel[78].addBox(0F, 0F, 0F, 2, 1, 8, 0F); // Box 117
		bodyModel[78].setRotationPoint(26F, -21.5F, -2F);

		bodyModel[79].addBox(0F, 0F, 0F, 3, 1, 2, 0F); // Box 118
		bodyModel[79].setRotationPoint(23F, -21.5F, 1F);

		bodyModel[80].addBox(0F, 0F, 0F, 3, 1, 2, 0F); // Box 119
		bodyModel[80].setRotationPoint(28F, -21.5F, 1F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 120
		bodyModel[81].setRotationPoint(23F, -21.5F, -2F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 121
		bodyModel[82].setRotationPoint(23F, -21.5F, 3F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 122
		bodyModel[83].setRotationPoint(28F, -21.5F, 3F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 123
		bodyModel[84].setRotationPoint(28F, -21.5F, -2F);

		bodyModel[85].addBox(0F, 0F, 0F, 8, 0, 8, 0F); // Box 124
		bodyModel[85].setRotationPoint(23F, -21.51F, -2F);

		bodyModel[86].addBox(0F, 0F, 0F, 10, 17, 1, 0F); // Box 9
		bodyModel[86].setRotationPoint(-30F, -17F, 12F);

		bodyModel[87].addBox(0F, 0F, 0F, 10, 17, 1, 0F); // Box 10
		bodyModel[87].setRotationPoint(-29F, -17F, -9F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 11, 4, 4, 0F,0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[88].setRotationPoint(-30F, -21F, -9F);

		bodyModel[89].addBox(0F, 0F, 0F, 1, 17, 17, 0F); // Box 15
		bodyModel[89].setRotationPoint(-30F, -17F, -5F);

		bodyModel[90].addBox(0F, 0F, 0F, 1, 17, 17, 0F); // Box 21
		bodyModel[90].setRotationPoint(-20F, -17F, -8F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 6, 2, 9, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[91].setRotationPoint(-27F, -23F, -2.5F);

		bodyModel[92].addBox(0F, 0F, 0F, 5, 7, 4, 0F); // Box 33
		bodyModel[92].setRotationPoint(-19F, -7F, -9F);

		bodyModel[93].addBox(0F, 0F, 0F, 3, 4, 4, 0F); // Box 34
		bodyModel[93].setRotationPoint(-20F, -4F, 9F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 3, 13, 7, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 42
		bodyModel[94].setRotationPoint(-37F, -13F, -5F);

		bodyModel[95].addBox(0F, 0F, 0F, 4, 13, 14, 0F); // Box 43
		bodyModel[95].setRotationPoint(-34F, -13F, -5F);

		bodyModel[96].addBox(0F, 0F, 0F, 2, 4, 2, 0F); // Box 48 lamp
		bodyModel[96].setRotationPoint(-32F, -21F, 1F);

		bodyModel[97].addBox(0F, 0F, 0F, 1, 9, 8, 0F); // Box 44
		bodyModel[97].setRotationPoint(-29F, -13F, -2F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 2, 4, 5, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
		bodyModel[98].setRotationPoint(-32F, -21F, -4F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 2, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 44
		bodyModel[99].setRotationPoint(-32F, -21F, 3F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 3, 13, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 45
		bodyModel[100].setRotationPoint(-37F, -13F, 2F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 11, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 64
		bodyModel[101].setRotationPoint(-30F, -21F, 9F);

		bodyModel[102].addBox(0F, 0F, 0F, 11, 4, 14, 0F); // Box 65
		bodyModel[102].setRotationPoint(-30F, -21F, -5F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 7, 2, 1, 0F,1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -1F, 1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // box64
		bodyModel[103].setRotationPoint(-28F, -17F, 13F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 7, 2, 1, 0F,1F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // box65
		bodyModel[104].setRotationPoint(-28F, -17F, -10F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 162 light
		bodyModel[105].setRotationPoint(-28.68F, -23F, 7.5F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0.3F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, 0.3F, -0.5F, 0.1F, 0.3F, 0F, 0.1F, -1F, 0F, 0.1F, -1F, 0F, 0.1F, 0.3F, 0F, 0.1F); // Box 165
		bodyModel[106].setRotationPoint(-28.5F, -22F, 7.5F);

		bodyModel[107].addBox(0F, 0F, 0F, 9, 5, 0, 0F); // Box 108 liveryimg 1
		bodyModel[107].setRotationPoint(-29F, -10F, -9.01F);

		bodyModel[108].addBox(0F, 0F, 0F, 9, 5, 0, 0F); // Box 109 liveryimg 1
		bodyModel[108].setRotationPoint(-29F, -10F, 13.01F);

		bodyModel[109].addBox(0F, 0F, 0F, 0, 2, 5, 0F); // Box 117 liveryimg 2
		bodyModel[109].setRotationPoint(-30.05F, -19.5F, -4F);
		bodyModel[109].rotateAngleY = 0.38397244F;

		bodyModel[110].addBox(0F, 0F, -5F, 0, 2, 5, 0F); // Box 118 liveryimg 2
		bodyModel[110].setRotationPoint(-30.05F, -19.5F, 8F);
		bodyModel[110].rotateAngleY = -0.38397244F;

		bodyModel[111].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 162 light
		bodyModel[111].setRotationPoint(-28.68F, -23F, -4.5F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0.3F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, 0.3F, -0.5F, 0.1F, 0.3F, 0F, 0.1F, -1F, 0F, 0.1F, -1F, 0F, 0.1F, 0.3F, 0F, 0.1F); // Box 165
		bodyModel[112].setRotationPoint(-28.5F, -22F, -4.5F);

		bodyModel[113].addBox(0F, 0F, 0F, 3, 0, 4, 0F); // Box 44
		bodyModel[113].setRotationPoint(-33F, -2F, -9F);

		bodyModel[114].addBox(0F, 0F, 0F, 4, 4, 4, 0F); // Box 45
		bodyModel[114].setRotationPoint(-34F, -4F, 9F);

		bodyModel[115].addBox(0F, 0F, 0F, 2, 0, 4, 0F); // Box 56
		bodyModel[115].setRotationPoint(-32F, -4F, -9F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 0, 6, 3, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 143
		bodyModel[116].setRotationPoint(-39.01F, -8F, -6F);
		bodyModel[116].rotateAngleY = -3.14159265F;

		bodyModel[117].addShapeBox(0F, 0F, 0F, 0, 6, 3, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 62
		bodyModel[117].setRotationPoint(-39.01F, -8F, 10F);

		bodyModel[118].addBox(0F, 0F, 0F, 0, 7, 1, 0F); // Box 61
		bodyModel[118].setRotationPoint(-39F, -2F, 12F);

		bodyModel[119].addBox(0F, 0F, 0F, 0, 7, 1, 0F); // Box 63
		bodyModel[119].setRotationPoint(-39F, -2F, -9F);

		bodyModel[120].addBox(0F, 0F, 0F, 4, 2, 3, 0F); // Box 4
		bodyModel[120].setRotationPoint(-42F, 3F, 0.5F);

		bodyModel[121].addBox(0F, 0F, 0F, 2, 0, 6, 0F); // Box 98
		bodyModel[121].setRotationPoint(-42F, 0F, -1F);

		bodyModel[122].addBox(0F, 0F, 0F, 4, 2, 3, 0F); // Box 5
		bodyModel[122].setRotationPoint(40F, 3F, 0.5F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 0, 6, 3, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 143
		bodyModel[123].setRotationPoint(41.01F, -8F, -6F);
		bodyModel[123].rotateAngleY = -3.14159265F;

		bodyModel[124].addBox(0F, 0F, 0F, 0, 7, 1, 0F); // Box 61
		bodyModel[124].setRotationPoint(41.02F, -2F, 12F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 0, 6, 3, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 62
		bodyModel[125].setRotationPoint(41.01F, -8F, 10F);

		bodyModel[126].addBox(0F, 0F, 0F, 0, 7, 1, 0F); // Box 63
		bodyModel[126].setRotationPoint(41.02F, -2F, -9F);

		bodyModel[127].addBox(0F, 0F, 0F, 0, 8, 1, 0F); // Box 80
		bodyModel[127].setRotationPoint(41.02F, -8F, -6F);

		bodyModel[128].addBox(0F, 0F, 0F, 0, 8, 1, 0F); // Box 81
		bodyModel[128].setRotationPoint(41.02F, -8F, 9F);

		bodyModel[129].addBox(0F, 0F, 0F, 26, 6, 18, 0F); // Box 40
		bodyModel[129].setRotationPoint(-12F, 2F, -7F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 30, 1, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 55
		bodyModel[130].setRotationPoint(-14F, 1F, -7F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 18, 1, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 86
		bodyModel[131].setRotationPoint(-3F, 1F, 11F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 18, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 87
		bodyModel[132].setRotationPoint(-3F, 2F, 11F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 18, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 255
		bodyModel[133].setRotationPoint(-3F, 2F, -9F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 18, 1, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 256
		bodyModel[134].setRotationPoint(-3F, 1F, -9F);

		bodyModel[135].addBox(0F, 0F, 0F, 51, 8, 0, 0F); // Box 38R
		bodyModel[135].setRotationPoint(-14F, -8F, 13.01F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 5, 6, 0, 0F,0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F); // Box 97
		bodyModel[136].setRotationPoint(-19F, -13F, 13.01F);

		bodyModel[137].addBox(0F, 0F, 0F, 50, 8, 0, 0F); // Box 176
		bodyModel[137].setRotationPoint(-13F, -8F, -9.01F);

		bodyModel[138].addBox(0F, 0F, 0F, 7, 1, 0, 0F); // Box 177
		bodyModel[138].setRotationPoint(-19F, -13F, -9.01F);

		bodyModel[139].addBox(0F, 0F, 0F, 1, 4, 0, 0F); // Box 178
		bodyModel[139].setRotationPoint(-13F, -12F, -9.01F);

		bodyModel[140].addBox(0F, 0F, 0F, 2, 4, 0, 0F); // Box 177
		bodyModel[140].setRotationPoint(-32F, -4F, -9F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 1, 4, 0, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 178
		bodyModel[141].setRotationPoint(-33F, -4F, -9F);

		bodyModel[142].addBox(0F, 0F, 0F, 2, 0, 6, 0F); // Box 179
		bodyModel[142].setRotationPoint(42F, 0F, -1F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 78
		bodyModel[143].setRotationPoint(-40F, -2F, 6.75F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 186 lamp
		bodyModel[144].setRotationPoint(-32.5F, -21F, 1F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 187 lamp
		bodyModel[145].setRotationPoint(-32.5F, -19F, 1F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 188
		bodyModel[146].setRotationPoint(-40F, -2F, -4.75F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 189 lamp
		bodyModel[147].setRotationPoint(-40.25F, -2F, 6.75F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 190 lamp
		bodyModel[148].setRotationPoint(-40.25F, -2F, -4.75F);

		bodyModel[149].addBox(0F, 0F, 0F, 1, 2, 14, 0F); // Box 186
		bodyModel[149].setRotationPoint(41F, 0F, -5F);

		bodyModel[150].addBox(0F, 0F, 0F, 0, 11, 2, 0F); // Box 243
		bodyModel[150].setRotationPoint(37F, -8F, 11F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 244
		bodyModel[151].setRotationPoint(37F, -7F, 12.5F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 249
		bodyModel[152].setRotationPoint(37F, -7F, -9.5F);

		bodyModel[153].addBox(0F, 0F, 0F, 0, 11, 2, 0F); // Box 250
		bodyModel[153].setRotationPoint(37F, -8F, -9F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 239
		bodyModel[154].setRotationPoint(41F, -2F, -4.75F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 240 lamp
		bodyModel[155].setRotationPoint(41.25F, -2F, -4.75F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 241 lamp
		bodyModel[156].setRotationPoint(41.25F, -2F, 6.75F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 242
		bodyModel[157].setRotationPoint(41F, -2F, 6.75F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 247 lamp
		bodyModel[158].setRotationPoint(38.5F, -18F, 0F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 248 lamp
		bodyModel[159].setRotationPoint(38.5F, -18F, 2F);

		bodyModel[160].addBox(0F, 0F, 0F, 1, 2, 14, 0F); // Box 197
		bodyModel[160].setRotationPoint(-40F, 0F, -5F);

		bodyModel[161].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 198
		bodyModel[161].setRotationPoint(37F, -21.5F, 1.5F);

		bodyModel[162].addBox(0F, 0F, 0F, 9, 4, 20, 0F); // Box 201
		bodyModel[162].setRotationPoint(-29F, -4F, -8F);

		bodyModel[163].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 202
		bodyModel[163].setRotationPoint(-32F, -12F, 8.5F);

		bodyModel[164].addBox(-0.5F, 0F, -3.5F, 1, 13, 4, 0F); // Box 314 door swing right
		bodyModel[164].setRotationPoint(-19.5F, -17F, 12.5F);

		bodyModel[165].addBox(-0.5F, 0F, -0.5F, 1, 13, 4, 0F); // Box 315 door swing right
		bodyModel[165].setRotationPoint(-29.5F, -17F, -8.5F);

		bodyModel[166].addBox(0F, 0F, 0F, 1, 4, 4, 0F); // Box 206
		bodyModel[166].setRotationPoint(-30F, -4F, -9F);

		bodyModel[167].addBox(0F, 0F, 0F, 0, 8, 6, 0F); // Box 234
		bodyModel[167].setRotationPoint(42F, -8F, -1F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 236
		bodyModel[168].setRotationPoint(41F, -8F, -5F);

		bodyModel[169].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F,-1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 237
		bodyModel[169].setRotationPoint(41F, -8F, 5F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 80
		bodyModel[170].setRotationPoint(-39F, -8F, -5F);

		bodyModel[171].addBox(0F, 0F, 0F, 0, 8, 1, 0F); // Box 144
		bodyModel[171].setRotationPoint(-39F, -8F, -6F);

		bodyModel[172].addBox(0F, 0F, 0F, 0, 8, 6, 0F); // Box 145
		bodyModel[172].setRotationPoint(-40F, -8F, -1F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F,1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 147
		bodyModel[173].setRotationPoint(-39F, -8F, 5F);

		bodyModel[174].addBox(0F, 0F, 0F, 0, 8, 1, 0F); // Box 148
		bodyModel[174].setRotationPoint(-39F, -8F, 9F);

		bodyModel[175].addBox(0F, 0F, 0F, 3, 1, 0, 0F); // Box 61
		bodyModel[175].setRotationPoint(-35.25F, -10F, -9F);

		bodyModel[176].addBox(0F, 0F, 0F, 0, 13, 2, 0F); // Box 81
		bodyModel[176].setRotationPoint(-35.25F, -10F, -9F);

		bodyModel[177].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 81
		bodyModel[177].setRotationPoint(-35.25F, -8F, -9.5F);

		bodyModel[178].addShapeBox(0F, 0F, 0F, 2, 2, 0, 0F,0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 174
		bodyModel[178].setRotationPoint(-32.25F, -11F, -9F);

		bodyModel[179].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 176
		bodyModel[179].setRotationPoint(-35.25F, -8F, 12.5F);

		bodyModel[180].addBox(0F, 0F, 0F, 0, 13, 2, 0F); // Box 177
		bodyModel[180].setRotationPoint(-35.25F, -10F, 11F);

		bodyModel[181].addBox(0F, 0F, 0F, 1, 9, 0, 0F); // Box 191
		bodyModel[181].setRotationPoint(-34F, -9F, -9F);

		bodyModel[182].addBox(0F, 0F, 0F, 1, 5, 0, 0F); // Box 227
		bodyModel[182].setRotationPoint(-34F, -9F, 13F);

		bodyModel[183].addShapeBox(0F, 0F, 0F, 2, 2, 0, 0F,0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 228
		bodyModel[183].setRotationPoint(-32.25F, -11F, 13F);

		bodyModel[184].addBox(0F, 0F, 0F, 3, 1, 0, 0F); // Box 229
		bodyModel[184].setRotationPoint(-35.25F, -10F, 13F);

		bodyModel[185].addShapeBox(0F, 0F, 0F, 1, 4, 0, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 230
		bodyModel[185].setRotationPoint(-17F, -4F, 13F);

		bodyModel[186].addBox(0F, 0F, 0F, 1, 0, 4, 0F); // Box 231
		bodyModel[186].setRotationPoint(-17F, -2F, 9F);

		bodyModel[187].addShapeBox(0F, 0F, 0F, 3, 1, 10, 0F,0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F); // Box 4
		bodyModel[187].setRotationPoint(-42F, 6F, 2F);

		bodyModel[188].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F,0.5F, 0F, 0F, -3F, 0F, 0F, -1F, 1F, 0F, -1.5F, 1F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F); // Box 4
		bodyModel[188].setRotationPoint(-42F, 5F, 4F);

		bodyModel[189].addShapeBox(0F, 0F, 0F, 3, 2, 10, 0F,0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 1F, 0F, 0F, -3.5F, 0F, 0F, -1F, 0F, -1F, -1.5F, 0F, -1F); // Box 4
		bodyModel[189].setRotationPoint(-42F, 7F, 2F);

		bodyModel[190].addShapeBox(0F, 0F, 0F, 3, 1, 10, 0F,-2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[190].setRotationPoint(-42F, 6F, -8F);

		bodyModel[191].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F,-2F, 1F, 0F, -0.5F, 1F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 0F, 0F, -1F, 0F, 0F); // Box 4
		bodyModel[191].setRotationPoint(-42.5F, 5F, -8F);

		bodyModel[192].addShapeBox(0F, 0F, 0F, 3, 2, 10, 0F,-2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, -1F, -1F, 0F, -1F, -3.5F, 0F, 0F, 1F, 0F, 0F); // Box 4
		bodyModel[192].setRotationPoint(-42F, 7F, -8F);

		bodyModel[193].addShapeBox(0F, 0F, 0F, 3, 1, 10, 0F,-2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[193].setRotationPoint(41F, 6F, 2F);

		bodyModel[194].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F,-3F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 1F, 0F, -1F, 1F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[194].setRotationPoint(41F, 5F, 4F);

		bodyModel[195].addShapeBox(0F, 0F, 0F, 3, 2, 10, 0F,-2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, 1F, 0F, 0F, -1.5F, 0F, -1F, -1F, 0F, -1F); // Box 4
		bodyModel[195].setRotationPoint(41F, 7F, 2F);

		bodyModel[196].addShapeBox(0F, 0F, 0F, 3, 1, 10, 0F,0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F); // Box 4
		bodyModel[196].setRotationPoint(41F, 6F, -8F);

		bodyModel[197].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F,-0.5F, 1F, 0F, -2F, 1F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0.5F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, -1.5F, 0F, 0F); // Box 4
		bodyModel[197].setRotationPoint(41.5F, 5F, -8F);

		bodyModel[198].addShapeBox(0F, 0F, 0F, 3, 2, 10, 0F,0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -1F, 0F, -1F, -1.5F, 0F, -1F, 1F, 0F, 0F, -3.5F, 0F, 0F); // Box 4
		bodyModel[198].setRotationPoint(41F, 7F, -8F);

		bodyModel[199].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[199].setRotationPoint(-40F, 2.5F, 0F);

		bodyModel[200].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[200].setRotationPoint(41F, 2.5F, 0F);

		bodyModel[201].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 894
		bodyModel[201].setRotationPoint(-20F, -23F, -4F);

		bodyModel[202].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 895
		bodyModel[202].setRotationPoint(-18F, -22F, -4F);

		bodyModel[203].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,-0.25F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F); // Box 202
		bodyModel[203].setRotationPoint(-19F, -23.5F, -5F);

		bodyModel[204].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 891
		bodyModel[204].setRotationPoint(-24F, -19F, 12.25F);
		bodyModel[204].rotateAngleX = -0.78539816F;
		bodyModel[204].rotateAngleY = -0.01745329F;
		bodyModel[204].rotateAngleZ = 0.01745329F;

		bodyModel[205].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 114
		bodyModel[205].setRotationPoint(-13F, 2F, -8.5F);

		bodyModel[206].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[206].setRotationPoint(-13F, 1F, -8.5F);

		bodyModel[207].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 78
		bodyModel[207].setRotationPoint(-12.75F, 2.5F, -8.25F);

		bodyModel[208].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[208].setRotationPoint(-16.5F, -24F, 0.5F);

		bodyModel[209].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 894
		bodyModel[209].setRotationPoint(33F, -23F, -2F);

		bodyModel[210].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 895
		bodyModel[210].setRotationPoint(33F, -22F, -2F);

		bodyModel[211].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, -0.5F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F); // Box 202
		bodyModel[211].setRotationPoint(34F, -23.5F, -3F);

		bodyModel[212].addBox(0F, 0F, 0F, 3, 1, 0, 0F); // Box 214
		bodyModel[212].setRotationPoint(38F, 3F, -5F);

		bodyModel[213].addBox(0F, 0F, 0F, 2, 2, 4, 0F); // Box 333
		bodyModel[213].setRotationPoint(-31.5F, -23F, 0F);

		bodyModel[214].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 334 lamp
		bodyModel[214].setRotationPoint(-32.5F, -23F, 0F);

		bodyModel[215].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 335 lamp
		bodyModel[215].setRotationPoint(-32.5F, -23F, 2F);

		bodyModel[216].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 219 light
		bodyModel[216].setRotationPoint(-28.68F, -25F, 1.5F);

		bodyModel[217].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0.3F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, 0.3F, -0.5F, 0.1F, 0.3F, 0F, 0.1F, -1F, 0F, 0.1F, -1F, 0F, 0.1F, 0.3F, 0F, 0.1F); // Box 220
		bodyModel[217].setRotationPoint(-28.5F, -24F, 1.5F);

		bodyModel[218].addBox(0F, 0F, 0F, 2, 0, 2, 0F); // Box 221
		bodyModel[218].setRotationPoint(-29.25F, -23F, 1F);

		bodyModel[219].addBox(0F, 0F, 0F, 0, 2, 2, 0F); // Box 222
		bodyModel[219].setRotationPoint(-27.25F, -23F, 1F);

		bodyModel[220].addBox(0F, 0F, 0F, 0, 2, 2, 0F); // Box 223
		bodyModel[220].setRotationPoint(-29.25F, -23F, 1F);

		bodyModel[221].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 221
		bodyModel[221].setRotationPoint(-20F, -22.5F, 8F);

		bodyModel[222].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 222
		bodyModel[222].setRotationPoint(-18F, -22F, 7F);

		bodyModel[223].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 223
		bodyModel[223].setRotationPoint(-19F, -23F, 7F);

		bodyModel[224].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 224
		bodyModel[224].setRotationPoint(-20F, -22.5F, 6F);
	}

	ModelBP4Bogie bogie = new ModelBP4Bogie();//bloombergB trucks

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		super.render(entity, f, f1, f2, f3, f4, f5);

		//todo: this should be handled by TiM's skin system
		/*if(entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor()==5){
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/bp4bogie_purple.png"));
		} else {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/bp4bogie.png"));
		}*/

		GL11.glPushMatrix();
		GL11.glScalef(1f,1f,0.9f);
		GL11.glTranslatef(-1.35f,0.26f,0.1f);
		bogie.render(entity, f, f1, f2, f3, f4, f5);

		GL11.glTranslatef(3.025f,0f,0);
		bogie.render(entity, f, f1, f2, f3, f4, f5);
		GL11.glPopMatrix();
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
	{
	}

}