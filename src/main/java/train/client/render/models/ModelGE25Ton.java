//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2021 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: GE 23 Ton
// Model Creator: Bidahochi
// Created on: 13.02.2021 - 22:11:39
// Last changed on: 13.02.2021 - 22:11:39

package train.client.render.models; //Path where the model is located

import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import org.lwjgl.opengl.GL11;
import fexcraft.tmt.slim.ModelConverter;
import fexcraft.tmt.slim.ModelRendererTurbo;

import java.util.ArrayList;

public class ModelGE25Ton extends ModelConverter //Same as Filename
{
	int textureX = 128;
	int textureY = 128;

	public ModelGE25Ton() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[155];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 116, 38, textureX, textureY); // Box 48
		bodyModel[1] = new ModelRendererTurbo(this, 1, 116, textureX, textureY); // Box 59
		bodyModel[2] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Box 60
		bodyModel[3] = new ModelRendererTurbo(this, 0, 110, textureX, textureY); // Box 61
		bodyModel[4] = new ModelRendererTurbo(this, 0, 119, textureX, textureY); // Box 62 
		bodyModel[5] = new ModelRendererTurbo(this, 41, 52, textureX, textureY); // Box 30 wheel
		bodyModel[6] = new ModelRendererTurbo(this, 41, 52, textureX, textureY); // Box 46 wheel
		bodyModel[7] = new ModelRendererTurbo(this, 41, 52, textureX, textureY); // Box 47 wheel
		bodyModel[8] = new ModelRendererTurbo(this, 41, 52, textureX, textureY); // Box 48 wheel
		bodyModel[9] = new ModelRendererTurbo(this, 38, 22, textureX, textureY); // Box 4
		bodyModel[10] = new ModelRendererTurbo(this, 41, 48, textureX, textureY); // Box 104
		bodyModel[11] = new ModelRendererTurbo(this, 41, 48, textureX, textureY); // Box 110
		bodyModel[12] = new ModelRendererTurbo(this, 41, 48, textureX, textureY); // Box 172
		bodyModel[13] = new ModelRendererTurbo(this, 41, 48, textureX, textureY); // Box 173
		bodyModel[14] = new ModelRendererTurbo(this, 116, 44, textureX, textureY); // Box 156
		bodyModel[15] = new ModelRendererTurbo(this, 1, 12, textureX, textureY); // Box 157
		bodyModel[16] = new ModelRendererTurbo(this, 32, 1, textureX, textureY); // Box 159
		bodyModel[17] = new ModelRendererTurbo(this, 38, 6, textureX, textureY); // Box 160
		bodyModel[18] = new ModelRendererTurbo(this, 64, 10, textureX, textureY); // Box 171
		bodyModel[19] = new ModelRendererTurbo(this, 38, 22, textureX, textureY); // Box 173
		bodyModel[20] = new ModelRendererTurbo(this, 34, 10, textureX, textureY); // Box 174
		bodyModel[21] = new ModelRendererTurbo(this, 34, 10, textureX, textureY); // Box 175
		bodyModel[22] = new ModelRendererTurbo(this, 47, 10, textureX, textureY); // Box 176
		bodyModel[23] = new ModelRendererTurbo(this, 31, 7, textureX, textureY); // Box 177
		bodyModel[24] = new ModelRendererTurbo(this, 31, 7, textureX, textureY); // Box 178
		bodyModel[25] = new ModelRendererTurbo(this, 26, 8, textureX, textureY); // Box 179
		bodyModel[26] = new ModelRendererTurbo(this, 26, 8, textureX, textureY); // Box 180
		bodyModel[27] = new ModelRendererTurbo(this, 27, 5, textureX, textureY); // Box 181
		bodyModel[28] = new ModelRendererTurbo(this, 27, 5, textureX, textureY); // Box 182
		bodyModel[29] = new ModelRendererTurbo(this, 25, 2, textureX, textureY); // Box 183
		bodyModel[30] = new ModelRendererTurbo(this, 25, 2, textureX, textureY); // Box 184
		bodyModel[31] = new ModelRendererTurbo(this, 68, 6, textureX, textureY); // Box 185
		bodyModel[32] = new ModelRendererTurbo(this, 1, 12, textureX, textureY); // Box 186
		bodyModel[33] = new ModelRendererTurbo(this, 53, 6, textureX, textureY); // Box 187
		bodyModel[34] = new ModelRendererTurbo(this, 1, 106, textureX, textureY); // Box 188
		bodyModel[35] = new ModelRendererTurbo(this, 68, 6, textureX, textureY); // Box 189
		bodyModel[36] = new ModelRendererTurbo(this, 38, 6, textureX, textureY); // Box 190
		bodyModel[37] = new ModelRendererTurbo(this, 32, 1, textureX, textureY); // Box 191
		bodyModel[38] = new ModelRendererTurbo(this, 53, 6, textureX, textureY); // Box 192
		bodyModel[39] = new ModelRendererTurbo(this, 34, 10, textureX, textureY); // Box 193
		bodyModel[40] = new ModelRendererTurbo(this, 34, 10, textureX, textureY); // Box 194
		bodyModel[41] = new ModelRendererTurbo(this, 47, 10, textureX, textureY); // Box 195
		bodyModel[42] = new ModelRendererTurbo(this, 26, 8, textureX, textureY); // Box 196
		bodyModel[43] = new ModelRendererTurbo(this, 27, 5, textureX, textureY); // Box 197
		bodyModel[44] = new ModelRendererTurbo(this, 31, 7, textureX, textureY); // Box 198
		bodyModel[45] = new ModelRendererTurbo(this, 25, 2, textureX, textureY); // Box 199
		bodyModel[46] = new ModelRendererTurbo(this, 25, 2, textureX, textureY); // Box 200
		bodyModel[47] = new ModelRendererTurbo(this, 26, 8, textureX, textureY); // Box 201
		bodyModel[48] = new ModelRendererTurbo(this, 27, 5, textureX, textureY); // Box 202
		bodyModel[49] = new ModelRendererTurbo(this, 31, 7, textureX, textureY); // Box 203
		bodyModel[50] = new ModelRendererTurbo(this, 64, 10, textureX, textureY); // Box 204
		bodyModel[51] = new ModelRendererTurbo(this, 75, 63, textureX, textureY); // Box 205
		bodyModel[52] = new ModelRendererTurbo(this, 80, 110, textureX, textureY); // Box 206
		bodyModel[53] = new ModelRendererTurbo(this, 80, 118, textureX, textureY); // Box 207
		bodyModel[54] = new ModelRendererTurbo(this, 100, 31, textureX, textureY); // Box 208
		bodyModel[55] = new ModelRendererTurbo(this, 51, 62, textureX, textureY); // Box 209
		bodyModel[56] = new ModelRendererTurbo(this, 100, 34, textureX, textureY); // Box 210
		bodyModel[57] = new ModelRendererTurbo(this, 80, 102, textureX, textureY); // Box 211
		bodyModel[58] = new ModelRendererTurbo(this, 46, 82, textureX, textureY); // Box 212
		bodyModel[59] = new ModelRendererTurbo(this, 109, 65, textureX, textureY); // Box 213
		bodyModel[60] = new ModelRendererTurbo(this, 14, 81, textureX, textureY); // Box 219
		bodyModel[61] = new ModelRendererTurbo(this, 35, 80, textureX, textureY); // Box 52 door swing right
		bodyModel[62] = new ModelRendererTurbo(this, 1, 70, textureX, textureY); // Box 222
		bodyModel[63] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 223
		bodyModel[64] = new ModelRendererTurbo(this, 97, 19, textureX, textureY); // Box 224
		bodyModel[65] = new ModelRendererTurbo(this, 97, 10, textureX, textureY); // Box 225
		bodyModel[66] = new ModelRendererTurbo(this, 61, 42, textureX, textureY); // Box 226
		bodyModel[67] = new ModelRendererTurbo(this, 1, 38, textureX, textureY); // Box 227
		bodyModel[68] = new ModelRendererTurbo(this, 8, 20, textureX, textureY); // Box 228
		bodyModel[69] = new ModelRendererTurbo(this, 1, 20, textureX, textureY); // Box 229
		bodyModel[70] = new ModelRendererTurbo(this, 116, 109, textureX, textureY, "cull"); // Box 230 cull
		bodyModel[71] = new ModelRendererTurbo(this, 116, 117, textureX, textureY, "cull"); // Box 231 cull
		bodyModel[72] = new ModelRendererTurbo(this, 98, 66, textureX, textureY); // Box 232 door swing right
		bodyModel[73] = new ModelRendererTurbo(this, 18, 81, textureX, textureY); // Box 233
		bodyModel[74] = new ModelRendererTurbo(this, 125, 50, textureX, textureY); // Box 234
		bodyModel[75] = new ModelRendererTurbo(this, 125, 50, textureX, textureY); // Box 235
		bodyModel[76] = new ModelRendererTurbo(this, 87, -19, textureX, textureY); // Box 238
		bodyModel[77] = new ModelRendererTurbo(this, 94, 15, textureX, textureY); // Box 239
		bodyModel[78] = new ModelRendererTurbo(this, 94, 13, textureX, textureY); // Box 240
		bodyModel[79] = new ModelRendererTurbo(this, 88, 18, textureX, textureY); // Box 241
		bodyModel[80] = new ModelRendererTurbo(this, 14, 82, textureX, textureY); // Box 242
		bodyModel[81] = new ModelRendererTurbo(this, 14, 82, textureX, textureY); // Box 243
		bodyModel[82] = new ModelRendererTurbo(this, 90, 65, textureX, textureY); // Box 244
		bodyModel[83] = new ModelRendererTurbo(this, 1, 101, textureX, textureY); // Box 245
		bodyModel[84] = new ModelRendererTurbo(this, 6, 101, textureX, textureY); // Box 246
		bodyModel[85] = new ModelRendererTurbo(this, 1, 104, textureX, textureY); // Box 247
		bodyModel[86] = new ModelRendererTurbo(this, 1, 107, textureX, textureY); // Box 248
		bodyModel[87] = new ModelRendererTurbo(this, 77, 29, textureX, textureY); // Box 249
		bodyModel[88] = new ModelRendererTurbo(this, 38, 42, textureX, textureY); // Box 250
		bodyModel[89] = new ModelRendererTurbo(this, 4, 123, textureX, textureY, "lamp"); // Box 251 headlight front
		bodyModel[90] = new ModelRendererTurbo(this, 4, 121, textureX, textureY, "lamp"); // Box 252 headlight front
		bodyModel[91] = new ModelRendererTurbo(this, 4, 123, textureX, textureY, "lamp"); // Box 253 headlight front
		bodyModel[92] = new ModelRendererTurbo(this, 4, 121, textureX, textureY, "lamp"); // Box 254 headlight front
		bodyModel[93] = new ModelRendererTurbo(this, 1, 123, textureX, textureY, "lamp"); // Box 255 headlight rear
		bodyModel[94] = new ModelRendererTurbo(this, 1, 123, textureX, textureY, "lamp"); // Box 256 headlight rear
		bodyModel[95] = new ModelRendererTurbo(this, 1, 121, textureX, textureY, "lamp"); // Box 257 headlight rear
		bodyModel[96] = new ModelRendererTurbo(this, 1, 121, textureX, textureY, "lamp"); // Box 258 headlight rear
		bodyModel[97] = new ModelRendererTurbo(this, 73, 61, textureX, textureY); // Box 259
		bodyModel[98] = new ModelRendererTurbo(this, 123, 99, textureX, textureY); // Box 114
		bodyModel[99] = new ModelRendererTurbo(this, 123, 96, textureX, textureY); // Box 74
		bodyModel[100] = new ModelRendererTurbo(this, 123, 102, textureX, textureY); // Box 78
		bodyModel[101] = new ModelRendererTurbo(this, 89, 57, textureX, textureY); // Box 113
		bodyModel[102] = new ModelRendererTurbo(this, 118, 96, textureX, textureY); // Box 114
		bodyModel[103] = new ModelRendererTurbo(this, 118, 96, textureX, textureY); // Box 115
		bodyModel[104] = new ModelRendererTurbo(this, 118, 92, textureX, textureY); // Box 116
		bodyModel[105] = new ModelRendererTurbo(this, -6, 106, textureX, textureY); // Box 268
		bodyModel[106] = new ModelRendererTurbo(this, -13, 106, textureX, textureY); // Box 269
		bodyModel[107] = new ModelRendererTurbo(this, 123, 88, textureX, textureY); // Box 270
		bodyModel[108] = new ModelRendererTurbo(this, 123, 85, textureX, textureY); // Box 271
		bodyModel[109] = new ModelRendererTurbo(this, 123, 91, textureX, textureY); // Box 272
		bodyModel[110] = new ModelRendererTurbo(this, 118, 85, textureX, textureY); // Box 273
		bodyModel[111] = new ModelRendererTurbo(this, 118, 82, textureX, textureY); // Box 274
		bodyModel[112] = new ModelRendererTurbo(this, 1, 14, textureX, textureY); // Box 275
		bodyModel[113] = new ModelRendererTurbo(this, 1, 11, textureX, textureY); // Box 276
		bodyModel[114] = new ModelRendererTurbo(this, 18, 70, textureX, textureY); // Box 277
		bodyModel[115] = new ModelRendererTurbo(this, 43, 72, textureX, textureY); // Box 278
		bodyModel[116] = new ModelRendererTurbo(this, 46, 72, textureX, textureY); // Box 279
		bodyModel[117] = new ModelRendererTurbo(this, 84, 44, textureX, textureY); // Box 67
		bodyModel[118] = new ModelRendererTurbo(this, 108, 41, textureX, textureY); // Box 281
		bodyModel[119] = new ModelRendererTurbo(this, 55, 46, textureX, textureY); // Box 364 prime base
		bodyModel[120] = new ModelRendererTurbo(this, 48, 48, textureX, textureY, "lamp"); // Box 6 PRIME1-1
		bodyModel[121] = new ModelRendererTurbo(this, 48, 48, textureX, textureY, "lamp"); // Box 7 PRIME1-3
		bodyModel[122] = new ModelRendererTurbo(this, 48, 48, textureX, textureY, "lamp"); // Box 8 PRIME1-2
		bodyModel[123] = new ModelRendererTurbo(this, 48, 48, textureX, textureY, "lamp"); // Box 9 PRIME1-4
		bodyModel[124] = new ModelRendererTurbo(this, 1, 8, textureX, textureY); // Box 287
		bodyModel[125] = new ModelRendererTurbo(this, 1, 5, textureX, textureY); // Box 288
		bodyModel[126] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 289
		bodyModel[127] = new ModelRendererTurbo(this, 100, 52, textureX, textureY); // Box 290
		bodyModel[128] = new ModelRendererTurbo(this, 0, 51, textureX, textureY); // Box 292
		bodyModel[129] = new ModelRendererTurbo(this, 0, 51, textureX, textureY); // Box 293
		bodyModel[130] = new ModelRendererTurbo(this, 31, 10, textureX, textureY); // Box 294
		bodyModel[131] = new ModelRendererTurbo(this, 31, 10, textureX, textureY); // Box 295
		bodyModel[132] = new ModelRendererTurbo(this, 31, 10, textureX, textureY); // Box 296
		bodyModel[133] = new ModelRendererTurbo(this, 31, 10, textureX, textureY); // Box 297
		bodyModel[134] = new ModelRendererTurbo(this, 85, 65, textureX, textureY); // Box 298
		bodyModel[135] = new ModelRendererTurbo(this, 111, 103, textureX, textureY); // Box 299
		bodyModel[136] = new ModelRendererTurbo(this, 72, 60, textureX, textureY); // Box 300
		bodyModel[137] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 301
		bodyModel[138] = new ModelRendererTurbo(this, 1, 38, textureX, textureY); // Box 302
		bodyModel[139] = new ModelRendererTurbo(this, 105, 42, textureX, textureY); // Box 303
		bodyModel[140] = new ModelRendererTurbo(this, 76, 99, textureX, textureY); // Box 387
		bodyModel[141] = new ModelRendererTurbo(this, 51, 99, textureX, textureY); // Box 306
		bodyModel[142] = new ModelRendererTurbo(this, 15, 71, textureX, textureY); // Box 307
		bodyModel[143] = new ModelRendererTurbo(this, 15, 71, textureX, textureY); // Box 308
		bodyModel[144] = new ModelRendererTurbo(this, 15, 71, textureX, textureY); // Box 309
		bodyModel[145] = new ModelRendererTurbo(this, 20, 70, textureX, textureY); // Box 310
		bodyModel[146] = new ModelRendererTurbo(this, 20, 70, textureX, textureY); // Box 311
		bodyModel[147] = new ModelRendererTurbo(this, 17, 70, textureX, textureY); // Box 312
		bodyModel[148] = new ModelRendererTurbo(this, 12, 71, textureX, textureY); // Box 313
		bodyModel[149] = new ModelRendererTurbo(this, 12, 71, textureX, textureY); // Box 314
		bodyModel[150] = new ModelRendererTurbo(this, 12, 71, textureX, textureY); // Box 315
		bodyModel[151] = new ModelRendererTurbo(this, 17, 70, textureX, textureY); // Box 316
		bodyModel[152] = new ModelRendererTurbo(this, 116, 52, textureX, textureY); // Box 317
		bodyModel[153] = new ModelRendererTurbo(this, 11, 101, textureX, textureY); // Box 318
		bodyModel[154] = new ModelRendererTurbo(this, 50, 53, textureX, textureY); // Box 319

		bodyModel[0].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 48
		bodyModel[0].setRotationPoint(-17F, 3F, -1.5F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 59
		bodyModel[1].setRotationPoint(-14F, -8F, -1F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 60
		bodyModel[2].setRotationPoint(-14F, -8F, 0F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 61
		bodyModel[3].setRotationPoint(-14F, -9F, -1F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 62 
		bodyModel[4].setRotationPoint(-14F, -9F, 0F);

		bodyModel[5].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 30 wheel
		bodyModel[5].setRotationPoint(5.5F, 7F, 6F);

		bodyModel[6].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 46 wheel
		bodyModel[6].setRotationPoint(-5.5F, 7F, 6F);

		bodyModel[7].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 47 wheel
		bodyModel[7].setRotationPoint(-5.5F, 7F, -6F);

		bodyModel[8].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 48 wheel
		bodyModel[8].setRotationPoint(5.5F, 7F, -6F);

		bodyModel[9].addBox(0F, 0F, 0F, 2, 2, 17, 0F); // Box 4
		bodyModel[9].setRotationPoint(-6.5F, 6F, -8.5F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 104
		bodyModel[10].setRotationPoint(-6.5F, 6F, -8.75F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 110
		bodyModel[11].setRotationPoint(4.5F, 6F, -8.75F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 172
		bodyModel[12].setRotationPoint(4.5F, 6F, 7.75F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 173
		bodyModel[13].setRotationPoint(-6.5F, 6F, 7.75F);

		bodyModel[14].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 156
		bodyModel[14].setRotationPoint(14F, 3F, -1.5F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 1, 5, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 157
		bodyModel[15].setRotationPoint(-14F, 3F, -10F);

		bodyModel[16].addBox(0F, 0F, 0F, 26, 3, 1, 0F); // Box 159
		bodyModel[16].setRotationPoint(13F, 3F, -7F);
		bodyModel[16].rotateAngleY = -3.14159265F;

		bodyModel[17].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 160
		bodyModel[17].setRotationPoint(13F, 6F, -7F);
		bodyModel[17].rotateAngleY = -3.14159265F;

		bodyModel[18].addBox(0F, 0F, 0F, 15, 2, 1, 0F); // Box 171
		bodyModel[18].setRotationPoint(-7.5F, 6F, -7.5F);

		bodyModel[19].addBox(0F, 0F, 0F, 2, 2, 17, 0F); // Box 173
		bodyModel[19].setRotationPoint(4.5F, 6F, -8.5F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 174
		bodyModel[20].setRotationPoint(-3F, 8.5F, -7F);
		bodyModel[20].rotateAngleY = -3.14159265F;

		bodyModel[21].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 175
		bodyModel[21].setRotationPoint(8F, 8.5F, -7F);
		bodyModel[21].rotateAngleY = -3.14159265F;

		bodyModel[22].addBox(0F, 0F, 0F, 7, 1, 1, 0F); // Box 176
		bodyModel[22].setRotationPoint(-3.5F, 5.5F, -8.5F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 177
		bodyModel[23].setRotationPoint(-6.5F, 5F, -8.5F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 178
		bodyModel[24].setRotationPoint(4.5F, 5F, -8.5F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F); // Box 179
		bodyModel[25].setRotationPoint(-4.5F, 6F, -8.5F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 180
		bodyModel[26].setRotationPoint(3.5F, 6F, -8.5F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 181
		bodyModel[27].setRotationPoint(-4.5F, 5F, -8.5F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 182
		bodyModel[28].setRotationPoint(3.5F, 5F, -8.5F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 183
		bodyModel[29].setRotationPoint(-3.5F, 4.5F, -8.5F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 184
		bodyModel[30].setRotationPoint(1.5F, 4.5F, -8.5F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 8, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 185
		bodyModel[31].setRotationPoint(4F, 6F, -7F);
		bodyModel[31].rotateAngleY = -3.14159265F;

		bodyModel[32].addShapeBox(0F, 0F, 0F, 1, 5, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 186
		bodyModel[32].setRotationPoint(14F, 3F, 10F);
		bodyModel[32].rotateAngleY = -3.14159265F;

		bodyModel[33].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 187
		bodyModel[33].setRotationPoint(-7F, 6F, -7F);
		bodyModel[33].rotateAngleY = -3.14159265F;

		bodyModel[34].addBox(0F, 0F, 0F, 29, 1, 20, 0F); // Box 188
		bodyModel[34].setRotationPoint(-14.5F, 2F, -10F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 8, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 189
		bodyModel[35].setRotationPoint(-4F, 6F, 7F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 190
		bodyModel[36].setRotationPoint(-13F, 6F, 7F);

		bodyModel[37].addBox(0F, 0F, 0F, 26, 3, 1, 0F); // Box 191
		bodyModel[37].setRotationPoint(-13F, 3F, 7F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 192
		bodyModel[38].setRotationPoint(7F, 6F, 7F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 193
		bodyModel[39].setRotationPoint(3F, 8.5F, 7F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 194
		bodyModel[40].setRotationPoint(-8F, 8.5F, 7F);

		bodyModel[41].addBox(0F, 0F, 0F, 7, 1, 1, 0F); // Box 195
		bodyModel[41].setRotationPoint(-3.5F, 5.5F, 7.5F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 196
		bodyModel[42].setRotationPoint(3.5F, 6F, 7.5F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 197
		bodyModel[43].setRotationPoint(3.5F, 5F, 7.5F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 198
		bodyModel[44].setRotationPoint(4.5F, 5F, 7.5F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 199
		bodyModel[45].setRotationPoint(1.5F, 4.5F, 7.5F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 200
		bodyModel[46].setRotationPoint(-3.5F, 4.5F, 7.5F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F); // Box 201
		bodyModel[47].setRotationPoint(-4.5F, 6F, 7.5F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 202
		bodyModel[48].setRotationPoint(-4.5F, 5F, 7.5F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 203
		bodyModel[49].setRotationPoint(-6.5F, 5F, 7.5F);

		bodyModel[50].addBox(0F, 0F, 0F, 15, 2, 1, 0F); // Box 204
		bodyModel[50].setRotationPoint(-7.5F, 6F, 6.5F);

		bodyModel[51].addBox(0F, 0F, 0F, 1, 15, 20, 0F); // Box 205
		bodyModel[51].setRotationPoint(13F, -13F, -10F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 12, 1, 6, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 206
		bodyModel[52].setRotationPoint(2F, -15F, -3F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 12, 1, 6, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 207
		bodyModel[53].setRotationPoint(2F, -15F, 3F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 12, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 208
		bodyModel[54].setRotationPoint(2F, -14F, 9F);

		bodyModel[55].addBox(0F, 0F, 0F, 1, 1, 18, 0F); // Box 209
		bodyModel[55].setRotationPoint(13F, -14F, -9F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 12, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 210
		bodyModel[56].setRotationPoint(2F, -14F, -10F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 12, 1, 6, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 211
		bodyModel[57].setRotationPoint(2F, -15F, -9F);

		bodyModel[58].addBox(0F, 0F, 0F, 11, 15, 1, 0F); // Box 212
		bodyModel[58].setRotationPoint(2F, -13F, -10F);

		bodyModel[59].addBox(0F, 0F, 0F, 7, 15, 1, 0F); // Box 213
		bodyModel[59].setRotationPoint(2F, -13F, 9F);

		bodyModel[60].addBox(0F, 0F, 0F, 1, 2, 18, 0F); // Box 219
		bodyModel[60].setRotationPoint(2F, -14F, -9F);

		bodyModel[61].addBox(-0.5F, 0F, -0.5F, 1, 14, 4, 0F); // Box 52 door swing right
		bodyModel[61].setRotationPoint(2.5F, -12F, -8.5F);

		bodyModel[62].addBox(0F, 0F, 0F, 1, 14, 14, 0F); // Box 222
		bodyModel[62].setRotationPoint(2F, -12F, -5F);

		bodyModel[63].addBox(0F, 0F, 0F, 14, 10, 10, 0F); // Box 223
		bodyModel[63].setRotationPoint(-12F, -8F, -5F);

		bodyModel[64].addBox(0F, 0F, 0F, 15, 8, 0, 0F); // Box 224
		bodyModel[64].setRotationPoint(-13F, -6F, -10F);

		bodyModel[65].addBox(0F, 0F, 0F, 15, 8, 0, 0F); // Box 225
		bodyModel[65].setRotationPoint(-13F, -6F, 10F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 2, 10, 8, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 226
		bodyModel[66].setRotationPoint(-15F, -8F, -4F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 14, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 227
		bodyModel[67].setRotationPoint(-12F, -9F, -4F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 2, 10, 1, 0F,-2F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 228
		bodyModel[68].setRotationPoint(-15F, -8F, -5F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 2, 10, 1, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -2F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 229
		bodyModel[69].setRotationPoint(-15F, -8F, 4F);

		bodyModel[70].addBox(0F, 0F, 0F, 4, 5, 1, 0F); // Box 230 cull
		bodyModel[70].setRotationPoint(-11.5F, 3F, -10F);

		bodyModel[71].addBox(0F, 0F, 0F, 4, 5, 1, 0F); // Box 231 cull
		bodyModel[71].setRotationPoint(7.5F, 3F, 9F);

		bodyModel[72].addShapeBox(-3.5F, 0F, -0.5F, 4, 14, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 232 door swing right
		bodyModel[72].setRotationPoint(12.5F, -12F, 9.5F);

		bodyModel[73].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 233
		bodyModel[73].setRotationPoint(9F, -13F, 9F);

		bodyModel[74].addBox(0F, 0F, 0F, 0, 12, 1, 0F); // Box 234
		bodyModel[74].setRotationPoint(13.5F, -11F, 9.5F);

		bodyModel[75].addBox(0F, 0F, 0F, 0, 12, 1, 0F); // Box 235
		bodyModel[75].setRotationPoint(8.5F, -11F, 9.5F);

		bodyModel[76].addBox(0F, 0F, 0F, 0, 8, 20, 0F); // Box 238
		bodyModel[76].setRotationPoint(-13F, -6F, -10F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 239
		bodyModel[77].setRotationPoint(-12F, -6F, -10F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 240
		bodyModel[78].setRotationPoint(-12F, -6F, 9F);

		bodyModel[79].addBox(0F, 0F, 0F, 4, 6, 0, 0F); // Box 241
		bodyModel[79].setRotationPoint(-7.5F, 3F, 10F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 0, 2, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 242
		bodyModel[80].setRotationPoint(-15.5F, 0F, -10F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 0, 2, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 243
		bodyModel[81].setRotationPoint(15.5F, 0F, -10F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 244
		bodyModel[82].setRotationPoint(1.25F, -15F, 4F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 245
		bodyModel[83].setRotationPoint(13.5F, -11F, 0F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 246
		bodyModel[84].setRotationPoint(13.5F, -11F, -1F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 247
		bodyModel[85].setRotationPoint(13.5F, -12F, -1F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 248
		bodyModel[86].setRotationPoint(13.5F, -12F, 0F);

		bodyModel[87].addBox(0F, 0F, 0F, 7, 6, 8, 0F); // Box 249
		bodyModel[87].setRotationPoint(-10F, 3F, -4F);

		bodyModel[88].addBox(0F, 0F, 0F, 14, 3, 0, 0F); // Box 250
		bodyModel[88].setRotationPoint(-7F, 5.5F, -5F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 251 headlight front
		bodyModel[89].setRotationPoint(-14.01F, -9F, 0F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 252 headlight front
		bodyModel[90].setRotationPoint(-14.01F, -9F, -1F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 253 headlight front
		bodyModel[91].setRotationPoint(-14.01F, -8F, -1F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 254 headlight front
		bodyModel[92].setRotationPoint(-14.01F, -8F, 0F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 255 headlight rear
		bodyModel[93].setRotationPoint(14.51F, -11F, 0F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 256 headlight rear
		bodyModel[94].setRotationPoint(14.51F, -12F, -1F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 257 headlight rear
		bodyModel[95].setRotationPoint(14.51F, -11F, -1F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 258 headlight rear
		bodyModel[96].setRotationPoint(14.51F, -12F, 0F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 2, 6, 2, 0F,-0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 259
		bodyModel[97].setRotationPoint(0F, -14.5F, -1F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 114
		bodyModel[98].setRotationPoint(-12F, -11.25F, -0.5F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[99].setRotationPoint(-12F, -12.25F, -0.5F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 78
		bodyModel[100].setRotationPoint(-11.75F, -10.75F, -0.25F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 113
		bodyModel[101].setRotationPoint(-12F, -9.25F, -2F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 114
		bodyModel[102].setRotationPoint(-12F, -12.25F, -2F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 115
		bodyModel[103].setRotationPoint(-12F, -12.25F, 1F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 116
		bodyModel[104].setRotationPoint(-12F, -12.75F, -1F);

		bodyModel[105].addBox(0F, 0F, 0F, 3, 0, 20, 0F); // Box 268
		bodyModel[105].setRotationPoint(-17F, 8.5F, -10F);

		bodyModel[106].addBox(0F, 0F, 0F, 3, 0, 20, 0F); // Box 269
		bodyModel[106].setRotationPoint(14F, 8.5F, -10F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 270
		bodyModel[107].setRotationPoint(-14F, 0F, 7.5F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 271
		bodyModel[108].setRotationPoint(-14F, -1F, 7.5F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 272
		bodyModel[109].setRotationPoint(-13.75F, 0.5F, 7.75F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 273
		bodyModel[110].setRotationPoint(-12F, -1F, 7.5F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 274
		bodyModel[111].setRotationPoint(-14F, -1.5F, 7.5F);

		bodyModel[112].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 275
		bodyModel[112].setRotationPoint(-0.5F, -15.5F, 4F);

		bodyModel[113].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 276
		bodyModel[113].setRotationPoint(-0.5F, -13.5F, 5F);

		bodyModel[114].addBox(0F, 0F, 0F, 8, 1, 8, 0F); // Box 277
		bodyModel[114].setRotationPoint(-10F, -9.5F, -4F);

		bodyModel[115].addBox(0F, 0F, 0F, 0, 4, 1, 0F); // Box 278
		bodyModel[115].setRotationPoint(3F, -11F, 10F);

		bodyModel[116].addBox(0F, 0F, 0F, 0, 4, 1, 0F); // Box 279
		bodyModel[116].setRotationPoint(3F, -11F, -11F);

		bodyModel[117].addBox(0F, 0F, 0F, 6, 8, 4, 0F); // Box 67
		bodyModel[117].setRotationPoint(1F, -6F, 1F);
		bodyModel[117].rotateAngleY = -0.48869219F;

		bodyModel[118].addBox(0F, 0F, 0F, 1, 7, 1, 0F); // Box 281
		bodyModel[118].setRotationPoint(-9.5F, -15.5F, -0.5F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 364 prime base
		bodyModel[119].setRotationPoint(11F, -15.5F, -1F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F); // Box 6 PRIME1-1
		bodyModel[120].setRotationPoint(11F, -16F, -1F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F); // Box 7 PRIME1-3
		bodyModel[121].setRotationPoint(11F, -16F, -1F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 8 PRIME1-2
		bodyModel[122].setRotationPoint(11F, -16F, -1F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 9 PRIME1-4
		bodyModel[123].setRotationPoint(11F, -16F, -1F);

		bodyModel[124].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 287
		bodyModel[124].setRotationPoint(1.5F, -16F, 2.5F);

		bodyModel[125].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 288
		bodyModel[125].setRotationPoint(2.5F, -16F, 1.5F);

		bodyModel[126].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 289
		bodyModel[126].setRotationPoint(3.5F, -15F, 2F);

		bodyModel[127].addBox(0F, 0F, 0F, 5, 7, 5, 0F); // Box 290
		bodyModel[127].setRotationPoint(-3F, -5F, 5F);

		bodyModel[128].addBox(0F, 0F, 0F, 1, 3, 4, 0F); // Box 292
		bodyModel[128].setRotationPoint(-15F, 2.5F, -2F);

		bodyModel[129].addBox(0F, 0F, 0F, 1, 3, 4, 0F); // Box 293
		bodyModel[129].setRotationPoint(14F, 2.5F, -2F);

		bodyModel[130].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 294
		bodyModel[130].setRotationPoint(14F, 2F, 8F);

		bodyModel[131].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 295
		bodyModel[131].setRotationPoint(14F, 2F, -8F);

		bodyModel[132].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 296
		bodyModel[132].setRotationPoint(-15F, 2F, -8F);

		bodyModel[133].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 297
		bodyModel[133].setRotationPoint(-15F, 2F, 8F);

		bodyModel[134].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 298
		bodyModel[134].setRotationPoint(0.75F, -17.5F, -0.5F);

		bodyModel[135].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 299
		bodyModel[135].setRotationPoint(-10F, -11F, -1F);

		bodyModel[136].addBox(0F, 0F, 0F, 1, 9, 10, 0F); // Box 300
		bodyModel[136].setRotationPoint(-13F, -7F, -5F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 301
		bodyModel[137].setRotationPoint(-13F, -8F, -5F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 302
		bodyModel[138].setRotationPoint(-13F, -8F, 4F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 303
		bodyModel[139].setRotationPoint(-13F, -8F, -4F);

		bodyModel[140].addBox(0F, 0F, -2F, 12, 0, 2, 0F); // Box 387
		bodyModel[140].setRotationPoint(2F, -13F, -10F);
		bodyModel[140].rotateAngleX = 0.87266463F;

		bodyModel[141].addBox(0F, 0F, 0F, 12, 0, 2, 0F); // Box 306
		bodyModel[141].setRotationPoint(2F, -13F, 10F);
		bodyModel[141].rotateAngleX = -0.87266463F;

		bodyModel[142].addShapeBox(0F, 0F, 0F, 1, 0, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 307
		bodyModel[142].setRotationPoint(1F, -14F, -9F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 1, 0, 6, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 308
		bodyModel[143].setRotationPoint(1F, -14F, 3F);

		bodyModel[144].addBox(0F, 0F, 0F, 1, 0, 6, 0F); // Box 309
		bodyModel[144].setRotationPoint(1F, -14.5F, -3F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 1, 0, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 310
		bodyModel[145].setRotationPoint(1F, -13F, -10F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 1, 0, 1, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 311
		bodyModel[146].setRotationPoint(1F, -13F, 9F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 1, 0, 1, 0F,0F, 1F, 0F, 0F, 1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 312
		bodyModel[147].setRotationPoint(14F, -13F, 9F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 1, 0, 6, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 313
		bodyModel[148].setRotationPoint(14F, -14F, 3F);

		bodyModel[149].addBox(0F, 0F, 0F, 1, 0, 6, 0F); // Box 314
		bodyModel[149].setRotationPoint(14F, -14.5F, -3F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 1, 0, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 315
		bodyModel[150].setRotationPoint(14F, -14F, -9F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 1, 0, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 316
		bodyModel[151].setRotationPoint(14F, -13F, -10F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 317
		bodyModel[152].setRotationPoint(-13F, -9.5F, -3.5F);

		bodyModel[153].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 318
		bodyModel[153].setRotationPoint(8.5F, -16F, 7.5F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 1, 16, 8, 0F,-1.2F, 0F, 0F, 1.2F, 0F, 0F, 1.2F, 0F, 0F, -1.2F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F); // Box 319
		bodyModel[154].setRotationPoint(-14.5F, -7F, -4F);
	}
	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		for (int i = 0; i < 155; i++) {
			if (bodyModel[i].boxName != null && bodyModel[i].boxName.contains("lamp")) {
				Minecraft.getMinecraft().entityRenderer.disableLightmap(1D);
				bodyModel[i].render(f5);
				Minecraft.getMinecraft().entityRenderer.enableLightmap(1D);
			} else if (bodyModel[i].boxName != null && bodyModel[i].boxName.contains("cull")) {
				GL11.glDisable(GL11.GL_CULL_FACE);
				bodyModel[i].render(f5);
				GL11.glEnable(GL11.GL_CULL_FACE);
			} else {
				bodyModel[i].render(f5);
			}
		}
	}
	public float[] getTrans() {
		return new float[]{-0.5F, 0.15F, 0.00F};
	}

	public ArrayList<double[]> getSmokePosition() {
		return new ArrayList<double[]>() {
			{
				add(new double[]{0.425D, 0.9D, 0.0D});
			}
		};
	}
}