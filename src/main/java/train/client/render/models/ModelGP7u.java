//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 21.08.2020 - 13:36:20
// Last changed on: 21.08.2020 - 13:36:20

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

public class ModelGP7u extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelGP7u() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[197];

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
		bodyModel[23] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 2
		bodyModel[24] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 3
		bodyModel[25] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 266
		bodyModel[26] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 271
		bodyModel[27] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 272
		bodyModel[28] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 273
		bodyModel[29] = new ModelRendererTurbo(this, 161, 9, textureX, textureY); // Box 274
		bodyModel[30] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 275
		bodyModel[31] = new ModelRendererTurbo(this, 209, 9, textureX, textureY); // Box 271
		bodyModel[32] = new ModelRendererTurbo(this, 185, 9, textureX, textureY); // Box 272
		bodyModel[33] = new ModelRendererTurbo(this, 233, 9, textureX, textureY); // Box 273
		bodyModel[34] = new ModelRendererTurbo(this, 249, 9, textureX, textureY); // Box 274
		bodyModel[35] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 275
		bodyModel[36] = new ModelRendererTurbo(this, 265, 9, textureX, textureY); // Box 276
		bodyModel[37] = new ModelRendererTurbo(this, 289, 9, textureX, textureY); // Box 5
		bodyModel[38] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 143
		bodyModel[39] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 61
		bodyModel[40] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 62
		bodyModel[41] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 63
		bodyModel[42] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 2
		bodyModel[43] = new ModelRendererTurbo(this, 337, 9, textureX, textureY); // Box 214
		bodyModel[44] = new ModelRendererTurbo(this, 9, 9, textureX, textureY); // Box 209
		bodyModel[45] = new ModelRendererTurbo(this, 201, 17, textureX, textureY); // Box 210
		bodyModel[46] = new ModelRendererTurbo(this, 217, 9, textureX, textureY); // Box 211
		bodyModel[47] = new ModelRendererTurbo(this, 433, 17, textureX, textureY); // Box 4
		bodyModel[48] = new ModelRendererTurbo(this, 305, 25, textureX, textureY); // Box 4
		bodyModel[49] = new ModelRendererTurbo(this, 441, 17, textureX, textureY); // Box 214
		bodyModel[50] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 215
		bodyModel[51] = new ModelRendererTurbo(this, 481, 25, textureX, textureY); // Box 216
		bodyModel[52] = new ModelRendererTurbo(this, 49, 33, textureX, textureY); // Box 217
		bodyModel[53] = new ModelRendererTurbo(this, 73, 33, textureX, textureY); // Box 218
		bodyModel[54] = new ModelRendererTurbo(this, 89, 33, textureX, textureY); // Box 219
		bodyModel[55] = new ModelRendererTurbo(this, 113, 33, textureX, textureY); // Box 220
		bodyModel[56] = new ModelRendererTurbo(this, 129, 33, textureX, textureY); // Box 221
		bodyModel[57] = new ModelRendererTurbo(this, 153, 33, textureX, textureY); // Box 223
		bodyModel[58] = new ModelRendererTurbo(this, 273, 41, textureX, textureY); // Box 333
		bodyModel[59] = new ModelRendererTurbo(this, 441, 48, textureX, textureY); // Box 9
		bodyModel[60] = new ModelRendererTurbo(this, 473, 48, textureX, textureY); // Box 10
		bodyModel[61] = new ModelRendererTurbo(this, 57, 48, textureX, textureY); // Box 15
		bodyModel[62] = new ModelRendererTurbo(this, 449, 48, textureX, textureY); // Box 21
		bodyModel[63] = new ModelRendererTurbo(this, 425, 32, textureX, textureY); // Box 314 door swing right
		bodyModel[64] = new ModelRendererTurbo(this, 105, 56, textureX, textureY); // Box 315 door swing right
		bodyModel[65] = new ModelRendererTurbo(this, 249, 57, textureX, textureY); // Box 344
		bodyModel[66] = new ModelRendererTurbo(this, 297, 57, textureX, textureY); // Box 345
		bodyModel[67] = new ModelRendererTurbo(this, 329, 57, textureX, textureY); // Box 346
		bodyModel[68] = new ModelRendererTurbo(this, 81, 65, textureX, textureY); // Box 358
		bodyModel[69] = new ModelRendererTurbo(this, 353, 65, textureX, textureY); // Box 362
		bodyModel[70] = new ModelRendererTurbo(this, 489, 65, textureX, textureY); // Box 363
		bodyModel[71] = new ModelRendererTurbo(this, 129, 65, textureX, textureY); // Box 364
		bodyModel[72] = new ModelRendererTurbo(this, 241, 9, textureX, textureY); // Box 365
		bodyModel[73] = new ModelRendererTurbo(this, 257, 9, textureX, textureY); // Box 366
		bodyModel[74] = new ModelRendererTurbo(this, 321, 9, textureX, textureY); // Box 239
		bodyModel[75] = new ModelRendererTurbo(this, 497, 9, textureX, textureY, "lamp"); // Box 240 lamp
		bodyModel[76] = new ModelRendererTurbo(this, 1, 17, textureX, textureY, "lamp"); // Box 241 lamp
		bodyModel[77] = new ModelRendererTurbo(this, 281, 17, textureX, textureY); // Box 242
		bodyModel[78] = new ModelRendererTurbo(this, 393, 33, textureX, textureY); // Box 484
		bodyModel[79] = new ModelRendererTurbo(this, 177, 73, textureX, textureY); // Box 486
		bodyModel[80] = new ModelRendererTurbo(this, 49, 81, textureX, textureY); // Box 487
		bodyModel[81] = new ModelRendererTurbo(this, 201, 73, textureX, textureY); // Box 488
		bodyModel[82] = new ModelRendererTurbo(this, 297, 73, textureX, textureY); // Box 489
		bodyModel[83] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 490
		bodyModel[84] = new ModelRendererTurbo(this, 233, 17, textureX, textureY); // Box 491
		bodyModel[85] = new ModelRendererTurbo(this, 273, 17, textureX, textureY); // Box 492
		bodyModel[86] = new ModelRendererTurbo(this, 401, 17, textureX, textureY); // Box 493
		bodyModel[87] = new ModelRendererTurbo(this, 353, 81, textureX, textureY); // Box 38R
		bodyModel[88] = new ModelRendererTurbo(this, 425, 81, textureX, textureY); // Box 176
		bodyModel[89] = new ModelRendererTurbo(this, 505, 17, textureX, textureY); // Box 243
		bodyModel[90] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 250
		bodyModel[91] = new ModelRendererTurbo(this, 73, 81, textureX, textureY); // Box 498
		bodyModel[92] = new ModelRendererTurbo(this, 145, 81, textureX, textureY); // Box 499
		bodyModel[93] = new ModelRendererTurbo(this, 153, 33, textureX, textureY); // Box 500
		bodyModel[94] = new ModelRendererTurbo(this, 457, 25, textureX, textureY); // Box 501
		bodyModel[95] = new ModelRendererTurbo(this, 273, 41, textureX, textureY); // Box 503
		bodyModel[96] = new ModelRendererTurbo(this, 425, 17, textureX, textureY); // Box 131
		bodyModel[97] = new ModelRendererTurbo(this, 49, 57, textureX, textureY); // Box 132
		bodyModel[98] = new ModelRendererTurbo(this, 329, 25, textureX, textureY); // Box 133
		bodyModel[99] = new ModelRendererTurbo(this, 9, 33, textureX, textureY); // Box 134
		bodyModel[100] = new ModelRendererTurbo(this, 473, 25, textureX, textureY); // Box 135
		bodyModel[101] = new ModelRendererTurbo(this, 105, 81, textureX, textureY); // Box 136
		bodyModel[102] = new ModelRendererTurbo(this, 369, 73, textureX, textureY); // Box 137
		bodyModel[103] = new ModelRendererTurbo(this, 417, 73, textureX, textureY); // Box 138
		bodyModel[104] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 139
		bodyModel[105] = new ModelRendererTurbo(this, 233, 9, textureX, textureY); // Box 140
		bodyModel[106] = new ModelRendererTurbo(this, 433, 17, textureX, textureY); // Box 141
		bodyModel[107] = new ModelRendererTurbo(this, 305, 25, textureX, textureY); // Box 142
		bodyModel[108] = new ModelRendererTurbo(this, 41, 33, textureX, textureY, "lamp"); // Box 149 lamp
		bodyModel[109] = new ModelRendererTurbo(this, 297, 33, textureX, textureY); // Box 150
		bodyModel[110] = new ModelRendererTurbo(this, 65, 33, textureX, textureY, "lamp"); // Box 151 lamp
		bodyModel[111] = new ModelRendererTurbo(this, 177, 81, textureX, textureY); // Box 152
		bodyModel[112] = new ModelRendererTurbo(this, 473, 41, textureX, textureY); // Box 160
		bodyModel[113] = new ModelRendererTurbo(this, 257, 41, textureX, textureY); // Box 161
		bodyModel[114] = new ModelRendererTurbo(this, 257, 89, textureX, textureY); // Box 89
		bodyModel[115] = new ModelRendererTurbo(this, 17, 97, textureX, textureY); // Box 91
		bodyModel[116] = new ModelRendererTurbo(this, 65, 89, textureX, textureY); // Box 101
		bodyModel[117] = new ModelRendererTurbo(this, 137, 65, textureX, textureY); // Box 105
		bodyModel[118] = new ModelRendererTurbo(this, 377, 65, textureX, textureY); // Box 172
		bodyModel[119] = new ModelRendererTurbo(this, 281, 89, textureX, textureY); // Box 173
		bodyModel[120] = new ModelRendererTurbo(this, 41, 73, textureX, textureY); // Box 176
		bodyModel[121] = new ModelRendererTurbo(this, 249, 73, textureX, textureY); // Box 177
		bodyModel[122] = new ModelRendererTurbo(this, 193, 97, textureX, textureY); // Box 178
		bodyModel[123] = new ModelRendererTurbo(this, 297, 73, textureX, textureY); // Box 179
		bodyModel[124] = new ModelRendererTurbo(this, 433, 73, textureX, textureY); // Box 180
		bodyModel[125] = new ModelRendererTurbo(this, 225, 97, textureX, textureY); // Box 181
		bodyModel[126] = new ModelRendererTurbo(this, 201, 81, textureX, textureY); // Box 182
		bodyModel[127] = new ModelRendererTurbo(this, 497, 81, textureX, textureY); // Box 183
		bodyModel[128] = new ModelRendererTurbo(this, 81, 57, textureX, textureY); // Box 184
		bodyModel[129] = new ModelRendererTurbo(this, 121, 57, textureX, textureY); // Box 185
		bodyModel[130] = new ModelRendererTurbo(this, 121, 97, textureX, textureY); // Box 186
		bodyModel[131] = new ModelRendererTurbo(this, 281, 97, textureX, textureY); // Box 187
		bodyModel[132] = new ModelRendererTurbo(this, 305, 97, textureX, textureY); // Box 188
		bodyModel[133] = new ModelRendererTurbo(this, 329, 97, textureX, textureY); // Box 189
		bodyModel[134] = new ModelRendererTurbo(this, 353, 57, textureX, textureY); // Box 191
		bodyModel[135] = new ModelRendererTurbo(this, 33, 89, textureX, textureY); // Box 202
		bodyModel[136] = new ModelRendererTurbo(this, 65, 97, textureX, textureY, "lamp"); // Box 221 lamp
		bodyModel[137] = new ModelRendererTurbo(this, 433, 97, textureX, textureY); // Box 222
		bodyModel[138] = new ModelRendererTurbo(this, 137, 97, textureX, textureY, "lamp"); // Box 223 lamp
		bodyModel[139] = new ModelRendererTurbo(this, 105, 97, textureX, textureY); // Box 230
		bodyModel[140] = new ModelRendererTurbo(this, 145, 97, textureX, textureY); // Box 231
		bodyModel[141] = new ModelRendererTurbo(this, 457, 97, textureX, textureY); // Box 232
		bodyModel[142] = new ModelRendererTurbo(this, 177, 97, textureX, textureY); // Box 233
		bodyModel[143] = new ModelRendererTurbo(this, 345, 97, textureX, textureY); // Box 234
		bodyModel[144] = new ModelRendererTurbo(this, 57, 105, textureX, textureY); // Box 235
		bodyModel[145] = new ModelRendererTurbo(this, 425, 57, textureX, textureY); // Box 237
		bodyModel[146] = new ModelRendererTurbo(this, 121, 65, textureX, textureY); // Box 238
		bodyModel[147] = new ModelRendererTurbo(this, 225, 113, textureX, textureY); // Box 272
		bodyModel[148] = new ModelRendererTurbo(this, 329, 113, textureX, textureY); // Box 86
		bodyModel[149] = new ModelRendererTurbo(this, 225, 113, textureX, textureY); // Box 87
		bodyModel[150] = new ModelRendererTurbo(this, 49, 113, textureX, textureY); // Box 86
		bodyModel[151] = new ModelRendererTurbo(this, 241, 113, textureX, textureY); // Box 87
		bodyModel[152] = new ModelRendererTurbo(this, 2, 114, textureX, textureY); // Box 68
		bodyModel[153] = new ModelRendererTurbo(this, 3, 90, textureX, textureY); // Box 69
		bodyModel[154] = new ModelRendererTurbo(this, 33, 64, textureX, textureY); // Box 74
		bodyModel[155] = new ModelRendererTurbo(this, 1, 61, textureX, textureY); // Box 75
		bodyModel[156] = new ModelRendererTurbo(this, 16, 61, textureX, textureY); // Box 76
		bodyModel[157] = new ModelRendererTurbo(this, 13, 71, textureX, textureY, "lamp"); // Box 117 liveryimg 2 glow
		bodyModel[158] = new ModelRendererTurbo(this, 2, 71, textureX, textureY, "lamp"); // Box 118 liveryimg 2 glow
		bodyModel[159] = new ModelRendererTurbo(this, 33, 80, textureX, textureY, "lamp"); // Box 186 lamp
		bodyModel[160] = new ModelRendererTurbo(this, 42, 66, textureX, textureY, "lamp"); // Box 187 lamp
		bodyModel[161] = new ModelRendererTurbo(this, 88, 106, textureX, textureY); // Box 332
		bodyModel[162] = new ModelRendererTurbo(this, 127, 106, textureX, textureY); // Box 333
		bodyModel[163] = new ModelRendererTurbo(this, 3, 82, textureX, textureY); // Box 67
		bodyModel[164] = new ModelRendererTurbo(this, 26, 73, textureX, textureY); // Box 297
		bodyModel[165] = new ModelRendererTurbo(this, 301, 9, textureX, textureY); // Box 73
		bodyModel[166] = new ModelRendererTurbo(this, 90, 28, textureX, textureY, "lamp"); // Box 162 rotating lamp?
		bodyModel[167] = new ModelRendererTurbo(this, 84, 32, textureX, textureY); // Box 165
		bodyModel[168] = new ModelRendererTurbo(this, 281, 11, textureX, textureY); // Box 179
		bodyModel[169] = new ModelRendererTurbo(this, 275, 9, textureX, textureY); // Box 180
		bodyModel[170] = new ModelRendererTurbo(this, 274, 4, textureX, textureY); // Box 181
		bodyModel[171] = new ModelRendererTurbo(this, 271, 13, textureX, textureY); // Box 182
		bodyModel[172] = new ModelRendererTurbo(this, 112, 109, textureX, textureY); // Box 184
		bodyModel[173] = new ModelRendererTurbo(this, 52, 94, textureX, textureY); // Box 271
		bodyModel[174] = new ModelRendererTurbo(this, 44, 90, textureX, textureY); // Box 272
		bodyModel[175] = new ModelRendererTurbo(this, 39, 85, textureX, textureY); // Box 273
		bodyModel[176] = new ModelRendererTurbo(this, 57, 90, textureX, textureY); // Box 274
		bodyModel[177] = new ModelRendererTurbo(this, 409, 57, textureX, textureY); // Box 298
		bodyModel[178] = new ModelRendererTurbo(this, 398, 57, textureX, textureY); // Box 299
		bodyModel[179] = new ModelRendererTurbo(this, 103, 31, textureX, textureY); // Box 207
		bodyModel[180] = new ModelRendererTurbo(this, 39, 40, textureX, textureY); // Box 208
		bodyModel[181] = new ModelRendererTurbo(this, 265, 41, textureX, textureY); // Box 209
		bodyModel[182] = new ModelRendererTurbo(this, 105, 34, textureX, textureY); // Box 210
		bodyModel[183] = new ModelRendererTurbo(this, 351, 29, textureX, textureY); // Box 132
		bodyModel[184] = new ModelRendererTurbo(this, 372, 29, textureX, textureY); // Box 133
		bodyModel[185] = new ModelRendererTurbo(this, 329, 12, textureX, textureY, "lamp"); // Box 300 lamp
		bodyModel[186] = new ModelRendererTurbo(this, 328, 7, textureX, textureY); // Box 301
		bodyModel[187] = new ModelRendererTurbo(this, 309, 17, textureX, textureY); // Box 302
		bodyModel[188] = new ModelRendererTurbo(this, 301, 17, textureX, textureY, "lamp"); // Box 303 lamp
		bodyModel[189] = new ModelRendererTurbo(this, 420, 66, textureX, textureY); // box64
		bodyModel[190] = new ModelRendererTurbo(this, 394, 72, textureX, textureY); // box65
		bodyModel[191] = new ModelRendererTurbo(this, 370, 94, textureX, textureY, "cull"); // Box 3 cull
		bodyModel[192] = new ModelRendererTurbo(this, 374, 108, textureX, textureY); // Box 5
		bodyModel[193] = new ModelRendererTurbo(this, 397, 107, textureX, textureY); // Box 304
		bodyModel[194] = new ModelRendererTurbo(this, 395, 93, textureX, textureY, "cull"); // Box 311 cull
		bodyModel[195] = new ModelRendererTurbo(this, 429, 57, textureX, textureY); // Box 195 eh eh, sorry, we only sell unhealthy salads here
		bodyModel[196] = new ModelRendererTurbo(this, 429, 57, textureX, textureY); // Box 196 helo, my names grEg, how may i heLP yOu

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

		bodyModel[23].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[23].setRotationPoint(-38F, -0.5F, -2F);

		bodyModel[24].addBox(0F, 0F, 0F, 0, 8, 20, 0F); // Box 3
		bodyModel[24].setRotationPoint(38.01F, -3F, -10F);

		bodyModel[25].addBox(0F, 0F, 0F, 4, 2, 14, 0F); // Box 266
		bodyModel[25].setRotationPoint(34F, -3F, -7F);

		bodyModel[26].addBox(0F, 0F, 0F, 4, 0, 1, 0F); // Box 271
		bodyModel[26].setRotationPoint(34F, -3F, -8F);

		bodyModel[27].addBox(0F, 0F, 0F, 4, 0, 3, 0F); // Box 272
		bodyModel[27].setRotationPoint(34F, 4F, -11F);

		bodyModel[28].addBox(0F, 0F, 0F, 4, 0, 3, 0F); // Box 273
		bodyModel[28].setRotationPoint(34F, 1F, -10F);

		bodyModel[29].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 274
		bodyModel[29].setRotationPoint(34F, -1F, -9F);

		bodyModel[30].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 275
		bodyModel[30].setRotationPoint(34F, 3F, -8F);

		bodyModel[31].addBox(0F, 0F, 0F, 4, 0, 1, 0F); // Box 271
		bodyModel[31].setRotationPoint(34F, -3F, 7F);

		bodyModel[32].addBox(0F, 0F, 0F, 4, 0, 3, 0F); // Box 272
		bodyModel[32].setRotationPoint(34F, 4F, 8F);

		bodyModel[33].addBox(0F, 0F, 0F, 4, 0, 3, 0F); // Box 273
		bodyModel[33].setRotationPoint(34F, 1F, 7F);

		bodyModel[34].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 274
		bodyModel[34].setRotationPoint(34F, -1F, 7F);

		bodyModel[35].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 275
		bodyModel[35].setRotationPoint(34F, 3F, 8F);

		bodyModel[36].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 276
		bodyModel[36].setRotationPoint(34F, 0F, 7F);

		bodyModel[37].addBox(0F, 0F, 0F, 4, 2, 3, 0F); // Box 5
		bodyModel[37].setRotationPoint(37F, 0F, -1.5F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 0, 6, 3, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 143
		bodyModel[38].setRotationPoint(38.01F, -11F, -8F);
		bodyModel[38].rotateAngleY = -3.14159265F;

		bodyModel[39].addBox(0F, 0F, 0F, 0, 7, 1, 0F); // Box 61
		bodyModel[39].setRotationPoint(38.02F, -5F, 10F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 0, 6, 3, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 62
		bodyModel[40].setRotationPoint(38.01F, -11F, 8F);

		bodyModel[41].addBox(0F, 0F, 0F, 0, 7, 1, 0F); // Box 63
		bodyModel[41].setRotationPoint(38.02F, -5F, -11F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[42].setRotationPoint(38F, -0.5F, -2F);

		bodyModel[43].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 214
		bodyModel[43].setRotationPoint(34F, 0F, -7F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 0, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 209
		bodyModel[44].setRotationPoint(-33F, -1F, -11F);

		bodyModel[45].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 210
		bodyModel[45].setRotationPoint(-37F, -1F, -9F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 0, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 211
		bodyModel[46].setRotationPoint(-33F, -1F, 6F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 5, 5, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[47].setRotationPoint(-37F, -1F, -3F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 5, 5, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); // Box 4
		bodyModel[48].setRotationPoint(33F, -1F, -3F);

		bodyModel[49].addBox(0F, 0F, 0F, 0, 8, 16, 0F); // Box 214
		bodyModel[49].setRotationPoint(-37F, -11F, -8F);

		bodyModel[50].addBox(0F, 0F, 0F, 9, 13, 14, 0F); // Box 215
		bodyModel[50].setRotationPoint(-31F, -16F, -7F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 3, 13, 6, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 216
		bodyModel[51].setRotationPoint(-34F, -16F, -7F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 3, 13, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 217
		bodyModel[52].setRotationPoint(-34F, -16F, 1F);

		bodyModel[53].addBox(0F, 0F, 0F, 3, 13, 2, 0F); // Box 218
		bodyModel[53].setRotationPoint(-34F, -16F, -1F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 3, 20, 6, 0F,0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 219
		bodyModel[54].setRotationPoint(32F, -23F, -7F);

		bodyModel[55].addBox(0F, 0F, 0F, 3, 20, 2, 0F); // Box 220
		bodyModel[55].setRotationPoint(32F, -23F, -1F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 3, 20, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 221
		bodyModel[56].setRotationPoint(32F, -23F, 1F);

		bodyModel[57].addBox(0F, 0F, 0F, 42, 20, 14, 0F); // Box 223
		bodyModel[57].setRotationPoint(-10F, -23F, -7F);

		bodyModel[58].addBox(0F, 0F, 0F, 67, 1, 14, 0F); // Box 333
		bodyModel[58].setRotationPoint(-33F, -1F, -7F);

		bodyModel[59].addBox(0F, 0F, 0F, 11, 13, 1, 0F); // Box 9
		bodyModel[59].setRotationPoint(-22F, -21F, 10F);

		bodyModel[60].addBox(0F, 0F, 0F, 11, 13, 1, 0F); // Box 10
		bodyModel[60].setRotationPoint(-21F, -21F, -11F);

		bodyModel[61].addBox(0F, 0F, 0F, 1, 13, 17, 0F); // Box 15
		bodyModel[61].setRotationPoint(-22F, -21F, -7F);

		bodyModel[62].addBox(0F, 0F, 0F, 1, 13, 17, 0F); // Box 21
		bodyModel[62].setRotationPoint(-11F, -21F, -10F);

		bodyModel[63].addBox(-0.5F, 0F, -3.5F, 1, 13, 4, 0F); // Box 314 door swing right
		bodyModel[63].setRotationPoint(-10.5F, -21F, 10.5F);

		bodyModel[64].addBox(-0.5F, 0F, -0.5F, 1, 13, 4, 0F); // Box 315 door swing right
		bodyModel[64].setRotationPoint(-21.5F, -21F, -10.5F);

		bodyModel[65].addBox(0F, 0F, 0F, 12, 5, 22, 0F); // Box 344
		bodyModel[65].setRotationPoint(-22F, -8F, -11F);

		bodyModel[66].addBox(0F, 0F, 0F, 8, 5, 4, 0F); // Box 345
		bodyModel[66].setRotationPoint(-30F, -8F, -11F);

		bodyModel[67].addBox(0F, 0F, 0F, 8, 5, 4, 0F); // Box 346
		bodyModel[67].setRotationPoint(-30F, -8F, 7F);

		bodyModel[68].addBox(0F, 0F, 0F, 1, 1, 14, 0F); // Box 358
		bodyModel[68].setRotationPoint(32F, -22F, -7F);

		bodyModel[69].addBox(0F, 0F, 0F, 6, 5, 4, 0F); // Box 362
		bodyModel[69].setRotationPoint(-10F, -8F, -11F);

		bodyModel[70].addBox(0F, 0F, 0F, 6, 5, 4, 0F); // Box 363
		bodyModel[70].setRotationPoint(-10F, -8F, 7F);

		bodyModel[71].addBox(0F, 0F, 0F, 0, 8, 16, 0F); // Box 364
		bodyModel[71].setRotationPoint(38F, -11F, -8F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 0, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 365
		bodyModel[72].setRotationPoint(34F, -1F, -11F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 0, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 366
		bodyModel[73].setRotationPoint(34F, -1F, 6F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 239
		bodyModel[74].setRotationPoint(37F, -5F, -6.75F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 240 lamp
		bodyModel[75].setRotationPoint(37.25F, -5F, -6.75F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 241 lamp
		bodyModel[76].setRotationPoint(37.25F, -5F, 4.75F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 242
		bodyModel[77].setRotationPoint(37F, -5F, 4.75F);

		bodyModel[78].addBox(0F, 0F, 0F, 16, 2, 1, 0F); // Box 484
		bodyModel[78].setRotationPoint(-8F, -1F, 10F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 15, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 486
		bodyModel[79].setRotationPoint(-11F, 2F, -10.5F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 15, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 487
		bodyModel[80].setRotationPoint(-11F, 2F, 7.5F);

		bodyModel[81].addBox(0F, 0F, 0F, 15, 3, 15, 0F); // Box 488
		bodyModel[81].setRotationPoint(-11F, 2F, -7.5F);

		bodyModel[82].addBox(0F, 0F, 0F, 15, 2, 21, 0F); // Box 489
		bodyModel[82].setRotationPoint(-11F, 0F, -10.5F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 3, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 490
		bodyModel[83].setRotationPoint(-14F, -1F, -11F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 3, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 491
		bodyModel[84].setRotationPoint(-14F, -1F, 11F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 3, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 492
		bodyModel[85].setRotationPoint(12F, -1F, 11F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 3, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 493
		bodyModel[86].setRotationPoint(12F, -1F, -11F);

		bodyModel[87].addBox(0F, 0F, 0F, 35, 8, 0, 0F); // Box 38R
		bodyModel[87].setRotationPoint(-1F, -11F, 11.01F);

		bodyModel[88].addBox(0F, 0F, 0F, 35, 8, 0, 0F); // Box 176
		bodyModel[88].setRotationPoint(-1F, -11F, -11.01F);

		bodyModel[89].addBox(0F, 0F, 0F, 0, 8, 2, 0F); // Box 243
		bodyModel[89].setRotationPoint(34F, -11F, 9F);

		bodyModel[90].addBox(0F, 0F, 0F, 0, 8, 2, 0F); // Box 250
		bodyModel[90].setRotationPoint(34F, -11F, -11F);

		bodyModel[91].addBox(0F, 0F, 0F, 3, 3, 20, 0F); // Box 498
		bodyModel[91].setRotationPoint(5F, 1F, -10F);

		bodyModel[92].addBox(0F, 0F, 0F, 3, 3, 20, 0F); // Box 499
		bodyModel[92].setRotationPoint(9F, 1F, -10F);

		bodyModel[93].addBox(0F, 0F, 0F, 5, 8, 0, 0F); // Box 500
		bodyModel[93].setRotationPoint(-10F, -16F, -11.01F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 4, 6, 0, 0F,0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -4F, 0F); // Box 501
		bodyModel[94].setRotationPoint(-5F, -16F, -11.01F);

		bodyModel[95].addBox(0F, 0F, 0F, 5, 8, 0, 0F); // Box 503
		bodyModel[95].setRotationPoint(-10F, -16F, 11.01F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 3, 6, 0, 0F,0F, -2F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 131
		bodyModel[96].setRotationPoint(-31.01F, -16F, -11.01F);
		bodyModel[96].rotateAngleY = -3.14159265F;

		bodyModel[97].addBox(0F, 0F, 0F, 9, 8, 0, 0F); // Box 132
		bodyModel[97].setRotationPoint(-31F, -16F, -11.01F);

		bodyModel[98].addBox(0F, 0F, 0F, 1, 10, 0, 0F); // Box 133
		bodyModel[98].setRotationPoint(-34F, -10F, -11.01F);

		bodyModel[99].addBox(0F, 0F, 0F, 1, 10, 0, 0F); // Box 134
		bodyModel[99].setRotationPoint(-34F, -10F, 11.01F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 3, 6, 0, 0F,0F, -2F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 135
		bodyModel[100].setRotationPoint(-31.01F, -16F, 11.02F);
		bodyModel[100].rotateAngleY = -3.14159265F;

		bodyModel[101].addBox(0F, 0F, 0F, 9, 8, 0, 0F); // Box 136
		bodyModel[101].setRotationPoint(-31F, -16F, 11.01F);

		bodyModel[102].addBox(0F, 0F, 0F, 2, 0, 6, 0F); // Box 137
		bodyModel[102].setRotationPoint(-32F, -5F, -11F);

		bodyModel[103].addBox(0F, 0F, 0F, 2, 0, 6, 0F); // Box 138
		bodyModel[103].setRotationPoint(-32F, -5F, 5F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 1, 5, 0, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 139
		bodyModel[104].setRotationPoint(-32F, -8F, -11.01F);

		bodyModel[105].addBox(0F, 0F, 0F, 1, 5, 0, 0F); // Box 140
		bodyModel[105].setRotationPoint(-31F, -8F, -11.01F);

		bodyModel[106].addBox(0F, 0F, 0F, 1, 5, 0, 0F); // Box 141
		bodyModel[106].setRotationPoint(-31F, -8F, 11.01F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 1, 5, 0, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 142
		bodyModel[107].setRotationPoint(-32F, -8F, 11.01F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 149 lamp
		bodyModel[108].setRotationPoint(-35.25F, -13.5F, -1F);

		bodyModel[109].addBox(0F, 0F, 0F, 1, 4, 2, 0F); // Box 150
		bodyModel[109].setRotationPoint(-34.5F, -15.5F, -1F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 151 lamp
		bodyModel[110].setRotationPoint(-35.25F, -15.5F, -1F);

		bodyModel[111].addBox(0F, 0F, 0F, 1, 1, 14, 0F); // Box 152
		bodyModel[111].setRotationPoint(-32F, -15F, -7F);

		bodyModel[112].addBox(0F, 0F, 0F, 1, 3, 4, 0F); // Box 160
		bodyModel[112].setRotationPoint(-37.5F, -6F, -2F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 161
		bodyModel[113].setRotationPoint(-37.5F, -7F, -2F);

		bodyModel[114].addBox(0F, 0F, 0F, 7, 1, 7, 0F); // Box 89
		bodyModel[114].setRotationPoint(7F, -24.5F, -3.5F);

		bodyModel[115].addBox(0F, 0F, 0F, 8, 1, 14, 0F); // Box 91
		bodyModel[115].setRotationPoint(6.5F, -24F, -7F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 8, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 101
		bodyModel[116].setRotationPoint(6.5F, -22F, 7F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 5, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1.5F, -2F); // Box 105
		bodyModel[117].setRotationPoint(1.5F, -22F, 7F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 5, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, -2F, 0F, 0F, -1F); // Box 172
		bodyModel[118].setRotationPoint(14.5F, -22F, 7F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 8, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 173
		bodyModel[119].setRotationPoint(6.5F, -24F, 7F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 5, 2, 2, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 176
		bodyModel[120].setRotationPoint(1.5F, -24F, 7F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 5, 2, 2, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -2F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 177
		bodyModel[121].setRotationPoint(14.5F, -24F, 7F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 8, 2, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 178
		bodyModel[122].setRotationPoint(6.5F, -24F, -9F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 5, 2, 2, 0F,0F, -1F, 0F, 0F, -1F, -2F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 179
		bodyModel[123].setRotationPoint(14.5F, -24F, -9F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 5, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1.5F, -2F, 0F, -1.5F, 0F, 0F, 0F, 0F); // Box 180
		bodyModel[124].setRotationPoint(14.5F, -22F, -9F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 8, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 181
		bodyModel[125].setRotationPoint(6.5F, -22F, -9F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 5, 2, 2, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1.5F, 0F); // Box 182
		bodyModel[126].setRotationPoint(1.5F, -22F, -9F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 5, 2, 2, 0F,0F, -1F, -2F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 183
		bodyModel[127].setRotationPoint(1.5F, -24F, -9F);

		bodyModel[128].addBox(0F, 0F, 0F, 2, 2, 3, 0F); // Box 184
		bodyModel[128].setRotationPoint(3F, -25F, -1.5F);

		bodyModel[129].addBox(0F, 0F, 0F, 2, 2, 3, 0F); // Box 185
		bodyModel[129].setRotationPoint(16F, -25F, -1.5F);

		bodyModel[130].addBox(0F, 0F, 0F, 5, 1, 5, 0F); // Box 186
		bodyModel[130].setRotationPoint(-3.5F, -24F, -2.5F);

		bodyModel[131].addBox(0F, 0F, 0F, 5, 1, 5, 0F); // Box 187
		bodyModel[131].setRotationPoint(-9.5F, -24F, -2.5F);

		bodyModel[132].addBox(0F, 0F, 0F, 5, 1, 5, 0F); // Box 188
		bodyModel[132].setRotationPoint(25.5F, -24F, -2.5F);

		bodyModel[133].addBox(0F, 0F, 0F, 5, 1, 5, 0F); // Box 189
		bodyModel[133].setRotationPoint(19.5F, -24F, -2.5F);

		bodyModel[134].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 191
		bodyModel[134].setRotationPoint(31F, -23.5F, -1F);

		bodyModel[135].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 202
		bodyModel[135].setRotationPoint(-32F, -16.5F, -1F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 221 lamp
		bodyModel[136].setRotationPoint(34.75F, -19F, -1F);

		bodyModel[137].addBox(0F, 0F, 0F, 1, 4, 2, 0F); // Box 222
		bodyModel[137].setRotationPoint(34.5F, -21F, -1F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 223 lamp
		bodyModel[138].setRotationPoint(34.75F, -21F, -1F);

		bodyModel[139].addBox(0F, 0F, 0F, 3, 2, 1, 0F); // Box 230
		bodyModel[139].setRotationPoint(-11F, -1F, 10F);

		bodyModel[140].addBox(0F, 0F, 0F, 4, 2, 1, 0F); // Box 231
		bodyModel[140].setRotationPoint(8F, -1F, 10F);

		bodyModel[141].addBox(0F, 0F, 0F, 16, 2, 1, 0F); // Box 232
		bodyModel[141].setRotationPoint(-8F, -1F, -11F);

		bodyModel[142].addBox(0F, 0F, 0F, 3, 2, 1, 0F); // Box 233
		bodyModel[142].setRotationPoint(-11F, -1F, -11F);

		bodyModel[143].addBox(0F, 0F, 0F, 4, 2, 1, 0F); // Box 234
		bodyModel[143].setRotationPoint(8F, -1F, -11F);

		bodyModel[144].addBox(0F, 0F, 0F, 9, 1, 14, 0F); // Box 235
		bodyModel[144].setRotationPoint(4F, 0F, -7F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 1, 5, 0, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 237
		bodyModel[145].setRotationPoint(-4F, -8F, -11.01F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 1, 5, 0, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 238
		bodyModel[146].setRotationPoint(-4F, -8F, 11.01F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 4, 6, 0, 0F,0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -4F, 0F); // Box 272
		bodyModel[147].setRotationPoint(-5F, -16F, 11.01F);

		bodyModel[148].addBox(0F, 0F, 0F, 7, 7, 3, 0F); // Box 86
		bodyModel[148].setRotationPoint(-21.5F, -15F, -5F);
		bodyModel[148].rotateAngleY = -0.38397244F;

		bodyModel[149].addBox(0F, 0F, 0F, 1, 7, 10, 0F); // Box 87
		bodyModel[149].setRotationPoint(-21.4F, -15F, -4F);

		bodyModel[150].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 86
		bodyModel[150].setRotationPoint(-18.4F, -17F, -5.5F);
		bodyModel[150].rotateAngleY = -0.38397244F;

		bodyModel[151].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 87
		bodyModel[151].setRotationPoint(-20.4F, -16.75F, -4F);
		bodyModel[151].rotateAngleY = -0.38397244F;

		bodyModel[152].addBox(0F, 0F, 0F, 12, 1, 18, 0F); // Box 68
		bodyModel[152].setRotationPoint(-22F, -25F, -9F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 12, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 69
		bodyModel[153].setRotationPoint(-22F, -25F, 9F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 74
		bodyModel[154].setRotationPoint(-25F, -25F, -1F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 2, 4, 5, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 75
		bodyModel[155].setRotationPoint(-24F, -25F, -6F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 2, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 76
		bodyModel[156].setRotationPoint(-24F, -25F, 1F);

		bodyModel[157].addBox(0F, 0F, 0F, 0, 2, 5, 0F); // Box 117 liveryimg 2 glow
		bodyModel[157].setRotationPoint(-22.05F, -24F, -6F);
		bodyModel[157].rotateAngleY = 0.38397244F;

		bodyModel[158].addBox(0F, 0F, -5F, 0, 2, 5, 0F); // Box 118 liveryimg 2 glow
		bodyModel[158].setRotationPoint(-22.05F, -24F, 6F);
		bodyModel[158].rotateAngleY = -0.38397244F;

		bodyModel[159].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 186 lamp
		bodyModel[159].setRotationPoint(-24.75F, -25F, -1F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 187 lamp
		bodyModel[160].setRotationPoint(-24.75F, -23F, -1F);

		bodyModel[161].addBox(0F, 0F, 0F, 1, 3, 18, 0F); // Box 332
		bodyModel[161].setRotationPoint(-22F, -24F, -9F);

		bodyModel[162].addBox(0F, 0F, 0F, 1, 3, 18, 0F); // Box 333
		bodyModel[162].setRotationPoint(-11F, -24F, -9F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 12, 4, 2, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 67
		bodyModel[163].setRotationPoint(-22F, -25F, -11F);

		bodyModel[164].addBox(0F, 0F, 0F, 2, 4, 2, 0F); // Box 297
		bodyModel[164].setRotationPoint(-24F, -25F, -1F);

		bodyModel[165].addBox(0F, 0F, 0F, 5, 0, 6, 0F); // Box 73
		bodyModel[165].setRotationPoint(-15F, -27F, -4F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 162 rotating lamp?
		bodyModel[166].setRotationPoint(-19F, -26F, -8.5F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0.3F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, 0.3F, -0.5F, 0.1F, 0.3F, 0F, 0.1F, -1F, 0F, 0.1F, -1F, 0F, 0.1F, 0.3F, 0F, 0.1F); // Box 165
		bodyModel[167].setRotationPoint(-18.85F, -26F, -8.5F);

		bodyModel[168].addBox(0F, 0F, 0F, 0, 2, 1, 0F); // Box 179
		bodyModel[168].setRotationPoint(-15F, -27F, -3F);

		bodyModel[169].addBox(0F, 0F, 0F, 0, 2, 1, 0F); // Box 180
		bodyModel[169].setRotationPoint(-15F, -27F, 0F);

		bodyModel[170].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 181
		bodyModel[170].setRotationPoint(-12F, -27F, 2F);

		bodyModel[171].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 182
		bodyModel[171].setRotationPoint(-12F, -27F, -4F);

		bodyModel[172].addBox(0F, 0F, 0F, 5, 2, 8, 0F); // Box 184
		bodyModel[172].setRotationPoint(-20.5F, -26.75F, -4F);

		bodyModel[173].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 271
		bodyModel[173].setRotationPoint(-26F, -27F, 0.5F);

		bodyModel[174].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 272
		bodyModel[174].setRotationPoint(-24F, -27F, -0.5F);

		bodyModel[175].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 273
		bodyModel[175].setRotationPoint(-25F, -27F, -1.5F);

		bodyModel[176].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 274
		bodyModel[176].setRotationPoint(-23F, -26F, -0.5F);

		bodyModel[177].addBox(0F, 0F, 0F, 2, 2, 3, 0F); // Box 298
		bodyModel[177].setRotationPoint(7F, -25F, -1.5F);

		bodyModel[178].addBox(0F, 0F, 0F, 2, 2, 3, 0F); // Box 299
		bodyModel[178].setRotationPoint(12F, -25F, -1.5F);

		bodyModel[179].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 207
		bodyModel[179].setRotationPoint(10F, -26F, -8F);

		bodyModel[180].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 208
		bodyModel[180].setRotationPoint(11.25F, -25.85F, -9F);

		bodyModel[181].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 209
		bodyModel[181].setRotationPoint(11.25F, -25.85F, -7F);

		bodyModel[182].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 210
		bodyModel[182].setRotationPoint(12F, -25F, -8F);

		bodyModel[183].addShapeBox(0F, 0F, 0F, 2, 3, 8, 0F,-2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 132
		bodyModel[183].setRotationPoint(-39F, 2F, -8F);

		bodyModel[184].addShapeBox(0F, 0F, 0F, 2, 3, 8, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -2F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 133
		bodyModel[184].setRotationPoint(-39F, 2F, 0F);

		bodyModel[185].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 300 lamp
		bodyModel[185].setRotationPoint(-37.75F, -2.5F, -8.75F);

		bodyModel[186].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 301
		bodyModel[186].setRotationPoint(-37.5F, -2.5F, -8.75F);

		bodyModel[187].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 302
		bodyModel[187].setRotationPoint(-37.5F, -2.5F, 6.75F);

		bodyModel[188].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 303 lamp
		bodyModel[188].setRotationPoint(-37.75F, -2.5F, 6.75F);

		bodyModel[189].addShapeBox(0F, 0F, 0F, 8, 2, 1, 0F,1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -1F, 1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // box64
		bodyModel[189].setRotationPoint(-20F, -21F, 11F);
		bodyModel[189].rotateAngleX = 0.26179939F;

		bodyModel[190].addShapeBox(0F, 0F, 0F, 8, 2, 1, 0F,1F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // box65
		bodyModel[190].setRotationPoint(-20F, -21.25F, -11.97F);
		bodyModel[190].rotateAngleX = -0.26179939F;

		bodyModel[191].addShapeBox(0F, 0F, 0F, 5, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F); // Box 3 cull
		bodyModel[191].setRotationPoint(-18.5F, -20F, 10F);

		bodyModel[192].addShapeBox(0F, 0F, 0F, 5, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 5
		bodyModel[192].setRotationPoint(-18.5F, -21F, 10F);

		bodyModel[193].addShapeBox(0F, 0F, 0F, 5, 1, 3, 0F,0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 304
		bodyModel[193].setRotationPoint(-18.5F, -21F, -13F);

		bodyModel[194].addShapeBox(0F, 0F, 0F, 5, 5, 5, 0F,0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 311 cull
		bodyModel[194].setRotationPoint(-18.5F, -20F, -15F);

		bodyModel[195].addBox(0F, 0F, 0F, 0, 4, 1, 0F); // Box 195 eh eh, sorry, we only sell unhealthy salads here
		bodyModel[195].setRotationPoint(-19F, -20F, 11F);

		bodyModel[196].addBox(0F, 0F, 0F, 0, 4, 1, 0F); // Box 196 helo, my names grEg, how may i heLP yOu
		bodyModel[196].setRotationPoint(-19F, -20F, -12F);
	}
	ModelBapBlombergB theTrucks2 = new ModelBapBlombergB();

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		for (int i = 0; i < 197; i++) {
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

		if (entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor() == 80) {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/typeb_Grey.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.55, 0.25, 0);
			theTrucks2.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(2.8, 0, 0);
			theTrucks2.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		}/* else if (entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor() == 11||entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor() == 7||entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor() == 5||entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor() == 6||entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor() == 13) {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/blombergB_Grey.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.28, -0.15, 0);
			theTrucks2.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(2.55, 0, 0);
			theTrucks2.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();

		} */else if (entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor() == 4) {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/blombergB_Black.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.4, -0.05, 0);
			theTrucks2.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(2.8, 0, 0);
			theTrucks2.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/blombergB_Grey.png"));
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

	public ModelRendererTurbo ModelGP7u[];

}