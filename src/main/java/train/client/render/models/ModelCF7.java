//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2021 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: CF7
// Model Creator: bidahochi
// Created on: 12.06.2021 - 10:18:33
// Last changed on: 12.06.2021 - 10:18:33

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

public class ModelCF7 extends ModelConverter //Same as Filename
{
	int textureX = 256;
	int textureY = 256;

	public ModelCF7() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[148];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 54, 204, textureX, textureY); // Box 7
		bodyModel[1] = new ModelRendererTurbo(this, 121, 207, textureX, textureY); // Box 37
		bodyModel[2] = new ModelRendererTurbo(this, 59, 229, textureX, textureY); // Box 38
		bodyModel[3] = new ModelRendererTurbo(this, 117, 235, textureX, textureY); // Box 39
		bodyModel[4] = new ModelRendererTurbo(this, 67, 232, textureX, textureY); // Box 40
		bodyModel[5] = new ModelRendererTurbo(this, 190, 212, textureX, textureY); // Box 42
		bodyModel[6] = new ModelRendererTurbo(this, 40, 231, textureX, textureY); // Box 44
		bodyModel[7] = new ModelRendererTurbo(this, 118, 244, textureX, textureY); // Box 45
		bodyModel[8] = new ModelRendererTurbo(this, 189, 188, textureX, textureY); // Box 46
		bodyModel[9] = new ModelRendererTurbo(this, 141, 185, textureX, textureY); // Box 48
		bodyModel[10] = new ModelRendererTurbo(this, 118, 240, textureX, textureY); // Box 50
		bodyModel[11] = new ModelRendererTurbo(this, 2, 113, textureX, textureY); // Box 51
		bodyModel[12] = new ModelRendererTurbo(this, 68, 173, textureX, textureY); // Box 52 door swing right
		bodyModel[13] = new ModelRendererTurbo(this, 186, 151, textureX, textureY); // Box 53
		bodyModel[14] = new ModelRendererTurbo(this, 199, 154, textureX, textureY); // Box 54
		bodyModel[15] = new ModelRendererTurbo(this, 219, 144, textureX, textureY); // Box 55
		bodyModel[16] = new ModelRendererTurbo(this, 46, 86, textureX, textureY); // Box 59
		bodyModel[17] = new ModelRendererTurbo(this, 52, 153, textureX, textureY); // Box 68
		bodyModel[18] = new ModelRendererTurbo(this, 2, 149, textureX, textureY); // Box 69
		bodyModel[19] = new ModelRendererTurbo(this, 112, 160, textureX, textureY); // Box 70
		bodyModel[20] = new ModelRendererTurbo(this, 2, 201, textureX, textureY); // Box 73
		bodyModel[21] = new ModelRendererTurbo(this, 52, 158, textureX, textureY, "lamp"); // Box 74 headlight front
		bodyModel[22] = new ModelRendererTurbo(this, 55, 148, textureX, textureY); // Box 75
		bodyModel[23] = new ModelRendererTurbo(this, 40, 148, textureX, textureY); // Box 76
		bodyModel[24] = new ModelRendererTurbo(this, 2, 176, textureX, textureY); // Box 72
		bodyModel[25] = new ModelRendererTurbo(this, 122, 137, textureX, textureY); // Box 78
		bodyModel[26] = new ModelRendererTurbo(this, 94, 148, textureX, textureY); // Box 82 stack 1
		bodyModel[27] = new ModelRendererTurbo(this, 87, 148, textureX, textureY); // Box 83 stack 2
		bodyModel[28] = new ModelRendererTurbo(this, 87, 148, textureX, textureY); // Box 84 stack 3
		bodyModel[29] = new ModelRendererTurbo(this, 94, 148, textureX, textureY); // Box 85 stack 4
		bodyModel[30] = new ModelRendererTurbo(this, 166, 135, textureX, textureY); // Box 86
		bodyModel[31] = new ModelRendererTurbo(this, 153, 137, textureX, textureY); // Box 87
		bodyModel[32] = new ModelRendererTurbo(this, 165, 157, textureX, textureY); // Box 88
		bodyModel[33] = new ModelRendererTurbo(this, 12, 211, textureX, textureY); // Box 90
		bodyModel[34] = new ModelRendererTurbo(this, 175, 106, textureX, textureY); // Box 91
		bodyModel[35] = new ModelRendererTurbo(this, 165, 117, textureX, textureY); // Box 92
		bodyModel[36] = new ModelRendererTurbo(this, 117, 232, textureX, textureY); // Box 93
		bodyModel[37] = new ModelRendererTurbo(this, 41, 246, textureX, textureY); // Box 94
		bodyModel[38] = new ModelRendererTurbo(this, 41, 243, textureX, textureY); // Box 95
		bodyModel[39] = new ModelRendererTurbo(this, 165, 126, textureX, textureY); // Box 99
		bodyModel[40] = new ModelRendererTurbo(this, 79, 176, textureX, textureY); // Box 190
		bodyModel[41] = new ModelRendererTurbo(this, 54, 195, textureX, textureY); // Box 69
		bodyModel[42] = new ModelRendererTurbo(this, 54, 195, textureX, textureY); // Box 143
		bodyModel[43] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 48
		bodyModel[44] = new ModelRendererTurbo(this, 22, 83, textureX, textureY); // Box 132
		bodyModel[45] = new ModelRendererTurbo(this, 1, 83, textureX, textureY); // Box 133
		bodyModel[46] = new ModelRendererTurbo(this, 176, 172, textureX, textureY); // Box 184
		bodyModel[47] = new ModelRendererTurbo(this, 206, 151, textureX, textureY); // Box 235
		bodyModel[48] = new ModelRendererTurbo(this, 14, 83, textureX, textureY); // Box 259
		bodyModel[49] = new ModelRendererTurbo(this, 23, 85, textureX, textureY); // Box 260
		bodyModel[50] = new ModelRendererTurbo(this, 149, 165, textureX, textureY); // Box 261
		bodyModel[51] = new ModelRendererTurbo(this, 146, 109, textureX, textureY); // Box 262
		bodyModel[52] = new ModelRendererTurbo(this, 135, 113, textureX, textureY); // Box 263
		bodyModel[53] = new ModelRendererTurbo(this, 116, 109, textureX, textureY); // Box 264
		bodyModel[54] = new ModelRendererTurbo(this, 63, 158, textureX, textureY, "lamp"); // Box 265 headlight rear
		bodyModel[55] = new ModelRendererTurbo(this, 122, 137, textureX, textureY); // Box 319
		bodyModel[56] = new ModelRendererTurbo(this, 122, 137, textureX, textureY); // Box 320
		bodyModel[57] = new ModelRendererTurbo(this, 122, 137, textureX, textureY); // Box 321
		bodyModel[58] = new ModelRendererTurbo(this, 43, 159, textureX, textureY, "lamp"); // Box 162 beacon light
		bodyModel[59] = new ModelRendererTurbo(this, 42, 162, textureX, textureY); // Box 165
		bodyModel[60] = new ModelRendererTurbo(this, 1, 233, textureX, textureY); // Box 324
		bodyModel[61] = new ModelRendererTurbo(this, 40, 237, textureX, textureY); // Box 325
		bodyModel[62] = new ModelRendererTurbo(this, 184, 137, textureX, textureY); // Box 125
		bodyModel[63] = new ModelRendererTurbo(this, 176, 235, textureX, textureY); // Box 131
		bodyModel[64] = new ModelRendererTurbo(this, 101, 152, textureX, textureY); // Box 143
		bodyModel[65] = new ModelRendererTurbo(this, 115, 192, textureX, textureY); // Box 150
		bodyModel[66] = new ModelRendererTurbo(this, 165, 104, textureX, textureY); // Box 61
		bodyModel[67] = new ModelRendererTurbo(this, 175, 111, textureX, textureY); // Box 174
		bodyModel[68] = new ModelRendererTurbo(this, 175, 114, textureX, textureY); // Box 175
		bodyModel[69] = new ModelRendererTurbo(this, 170, 104, textureX, textureY); // Box 178
		bodyModel[70] = new ModelRendererTurbo(this, 123, 145, textureX, textureY); // Box 184 o2 generator
		bodyModel[71] = new ModelRendererTurbo(this, 54, 210, textureX, textureY); // Box 193
		bodyModel[72] = new ModelRendererTurbo(this, 201, 237, textureX, textureY); // Box 204
		bodyModel[73] = new ModelRendererTurbo(this, 46, 73, textureX, textureY); // Box 209
		bodyModel[74] = new ModelRendererTurbo(this, 23, 81, textureX, textureY); // Box 246
		bodyModel[75] = new ModelRendererTurbo(this, 71, 86, textureX, textureY); // Box 271
		bodyModel[76] = new ModelRendererTurbo(this, 71, 83, textureX, textureY); // Box 272
		bodyModel[77] = new ModelRendererTurbo(this, 71, 80, textureX, textureY); // Box 273
		bodyModel[78] = new ModelRendererTurbo(this, 66, 83, textureX, textureY); // Box 274
		bodyModel[79] = new ModelRendererTurbo(this, 87, 80, textureX, textureY); // Box 278
		bodyModel[80] = new ModelRendererTurbo(this, 87, 83, textureX, textureY); // Box 279
		bodyModel[81] = new ModelRendererTurbo(this, 87, 86, textureX, textureY); // Box 280
		bodyModel[82] = new ModelRendererTurbo(this, 82, 83, textureX, textureY); // Box 281
		bodyModel[83] = new ModelRendererTurbo(this, 71, 92, textureX, textureY); // Box 301
		bodyModel[84] = new ModelRendererTurbo(this, 66, 92, textureX, textureY); // Box 302
		bodyModel[85] = new ModelRendererTurbo(this, 33, 161, textureX, textureY); // Box 313
		bodyModel[86] = new ModelRendererTurbo(this, 149, 173, textureX, textureY); // Box 314 door swing right
		bodyModel[87] = new ModelRendererTurbo(this, 1, 198, textureX, textureY); // Box 316
		bodyModel[88] = new ModelRendererTurbo(this, 1, 213, textureX, textureY); // Box 318
		bodyModel[89] = new ModelRendererTurbo(this, 184, 115, textureX, textureY); // Box 321
		bodyModel[90] = new ModelRendererTurbo(this, 71, 77, textureX, textureY); // Box 346
		bodyModel[91] = new ModelRendererTurbo(this, 66, 77, textureX, textureY); // Box 347
		bodyModel[92] = new ModelRendererTurbo(this, 132, 142, textureX, textureY); // Box 332
		bodyModel[93] = new ModelRendererTurbo(this, 101, 138, textureX, textureY); // Box 333
		bodyModel[94] = new ModelRendererTurbo(this, 4, 156, textureX, textureY); // Box 334
		bodyModel[95] = new ModelRendererTurbo(this, 4, 162, textureX, textureY); // Box 335
		bodyModel[96] = new ModelRendererTurbo(this, 54, 202, textureX, textureY); // Box 343
		bodyModel[97] = new ModelRendererTurbo(this, 55, 86, textureX, textureY); // Box 356
		bodyModel[98] = new ModelRendererTurbo(this, 189, 109, textureX, textureY); // Box 374
		bodyModel[99] = new ModelRendererTurbo(this, 184, 112, textureX, textureY); // Box 375
		bodyModel[100] = new ModelRendererTurbo(this, 189, 112, textureX, textureY); // Box 376
		bodyModel[101] = new ModelRendererTurbo(this, 184, 109, textureX, textureY); // Box 377
		bodyModel[102] = new ModelRendererTurbo(this, 126, 235, textureX, textureY); // Box 599
		bodyModel[103] = new ModelRendererTurbo(this, 67, 237, textureX, textureY); // Box 600
		bodyModel[104] = new ModelRendererTurbo(this, 126, 221, textureX, textureY); // Box 580
		bodyModel[105] = new ModelRendererTurbo(this, 126, 221, textureX, textureY); // Box 582
		bodyModel[106] = new ModelRendererTurbo(this, 2, 168, textureX, textureY); // Box 67
		bodyModel[107] = new ModelRendererTurbo(this, 71, 89, textureX, textureY); // Box 401
		bodyModel[108] = new ModelRendererTurbo(this, 66, 89, textureX, textureY); // Box 402
		bodyModel[109] = new ModelRendererTurbo(this, 110, 152, textureX, textureY); // Box 402
		bodyModel[110] = new ModelRendererTurbo(this, 94, 119, textureX, textureY); // Box 73
		bodyModel[111] = new ModelRendererTurbo(this, 112, 118, textureX, textureY); // Box 179
		bodyModel[112] = new ModelRendererTurbo(this, 112, 121, textureX, textureY); // Box 180
		bodyModel[113] = new ModelRendererTurbo(this, 104, 116, textureX, textureY); // Box 181
		bodyModel[114] = new ModelRendererTurbo(this, 101, 116, textureX, textureY); // Box 182
		bodyModel[115] = new ModelRendererTurbo(this, 95, 109, textureX, textureY); // Box 282
		bodyModel[116] = new ModelRendererTurbo(this, 110, 116, textureX, textureY); // Box 283
		bodyModel[117] = new ModelRendererTurbo(this, 112, 111, textureX, textureY); // Box 284
		bodyModel[118] = new ModelRendererTurbo(this, 112, 108, textureX, textureY); // Box 285
		bodyModel[119] = new ModelRendererTurbo(this, 107, 116, textureX, textureY); // Box 286
		bodyModel[120] = new ModelRendererTurbo(this, 149, 165, textureX, textureY); // Box 424
		bodyModel[121] = new ModelRendererTurbo(this, 43, 86, textureX, textureY); // Box 425
		bodyModel[122] = new ModelRendererTurbo(this, 117, 221, textureX, textureY); // Box 427
		bodyModel[123] = new ModelRendererTurbo(this, 117, 221, textureX, textureY); // Box 428
		bodyModel[124] = new ModelRendererTurbo(this, 126, 192, textureX, textureY); // Box 429
		bodyModel[125] = new ModelRendererTurbo(this, 209, 136, textureX, textureY); // Box 338
		bodyModel[126] = new ModelRendererTurbo(this, 222, 136, textureX, textureY); // Box 340
		bodyModel[127] = new ModelRendererTurbo(this, 117, 221, textureX, textureY); // Box 432
		bodyModel[128] = new ModelRendererTurbo(this, 137, 192, textureX, textureY); // Box 433
		bodyModel[129] = new ModelRendererTurbo(this, 119, 218, textureX, textureY); // Box 434
		bodyModel[130] = new ModelRendererTurbo(this, 117, 221, textureX, textureY); // Box 435
		bodyModel[131] = new ModelRendererTurbo(this, 126, 221, textureX, textureY); // Box 436
		bodyModel[132] = new ModelRendererTurbo(this, 126, 221, textureX, textureY); // Box 437
		bodyModel[133] = new ModelRendererTurbo(this, 128, 218, textureX, textureY); // Box 438
		bodyModel[134] = new ModelRendererTurbo(this, 148, 192, textureX, textureY); // Box 439
		bodyModel[135] = new ModelRendererTurbo(this, 250, 125, textureX, textureY); // Box 440
		bodyModel[136] = new ModelRendererTurbo(this, 240, 116, textureX, textureY); // Box 441
		bodyModel[137] = new ModelRendererTurbo(this, 176, 172, textureX, textureY); // Box 144
		bodyModel[138] = new ModelRendererTurbo(this, 128, 218, textureX, textureY); // Box 145
		bodyModel[139] = new ModelRendererTurbo(this, 119, 218, textureX, textureY); // Box 146
		bodyModel[140] = new ModelRendererTurbo(this, 1, 111, textureX, textureY); // Box 516
		bodyModel[141] = new ModelRendererTurbo(this, 4, 111, textureX, textureY); // Box 148
		bodyModel[142] = new ModelRendererTurbo(this, 1, 118, textureX, textureY); // Box 149
		bodyModel[143] = new ModelRendererTurbo(this, 4, 118, textureX, textureY); // Box 150
		bodyModel[144] = new ModelRendererTurbo(this, 56, 165, textureX, textureY, "lamp"); // Box 370 ditchlight front
		bodyModel[145] = new ModelRendererTurbo(this, 56, 165, textureX, textureY, "lamp"); // Box 370 ditchlight front
		bodyModel[146] = new ModelRendererTurbo(this, 63, 165, textureX, textureY, "lamp"); // Box 370 ditchlight rear
		bodyModel[147] = new ModelRendererTurbo(this, 63, 165, textureX, textureY, "lamp"); // Box 370 ditchlight rear

		bodyModel[0].addBox(0F, 0F, 0F, 22, 2, 22, 0F); // Box 7
		bodyModel[0].setRotationPoint(-31F, 0F, -11F);

		bodyModel[1].addBox(0F, 0F, 0F, 22, 2, 22, 0F); // Box 37
		bodyModel[1].setRotationPoint(9F, 0F, -11F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 18, 3, 21, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 38
		bodyModel[2].setRotationPoint(-9F, 0F, -10.5F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 39
		bodyModel[3].setRotationPoint(9F, 2F, -11F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 40
		bodyModel[4].setRotationPoint(-11F, 2F, -11F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 11, 2, 20, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 42
		bodyModel[5].setRotationPoint(-2F, 3F, -10F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 11, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -2F, 0F, -0.25F, -2F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 44
		bodyModel[6].setRotationPoint(-2F, 5F, -10F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 7, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 45
		bodyModel[7].setRotationPoint(-9F, 3.5F, -10.5F);

		bodyModel[8].addBox(0F, 0F, 0F, 7, 3, 19, 0F); // Box 46
		bodyModel[8].setRotationPoint(-9F, 3.5F, -9.5F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 7, 1, 19, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, 0.5F, -1F); // Box 48
		bodyModel[9].setRotationPoint(-9F, 6.5F, -9.5F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 7, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 50
		bodyModel[10].setRotationPoint(-9F, 3.5F, 9.5F);

		bodyModel[11].addBox(0F, 0F, 0F, 42, 20, 14, 0F); // Box 51
		bodyModel[11].setRotationPoint(-11F, -20F, -7F);

		bodyModel[12].addBox(-0.5F, 0F, -0.5F, 1, 14, 4, 0F); // Box 52 door swing right
		bodyModel[12].setRotationPoint(-25.5F, -18F, -9.5F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 1, 14, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 53
		bodyModel[13].setRotationPoint(-33F, -13F, 1F);

		bodyModel[14].addBox(0F, 0F, 0F, 1, 14, 2, 0F); // Box 54
		bodyModel[14].setRotationPoint(-33F, -13F, -1F);

		bodyModel[15].addBox(0F, 0F, 0F, 6, 14, 12, 0F); // Box 55
		bodyModel[15].setRotationPoint(-32F, -13F, -6F);

		bodyModel[16].addBox(0F, 0F, 0F, 1, 2, 6, 0F); // Box 59
		bodyModel[16].setRotationPoint(-37F, 1F, -3F);

		bodyModel[17].addBox(0F, 0F, 0F, 15, 1, 18, 0F); // Box 68
		bodyModel[17].setRotationPoint(-26F, -22F, -9F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 15, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 69
		bodyModel[18].setRotationPoint(-26F, -22F, 9F);

		bodyModel[19].addBox(0F, 0F, 0F, 1, 14, 17, 0F); // Box 70
		bodyModel[19].setRotationPoint(-12F, -18F, -10F);

		bodyModel[20].addBox(0F, 0F, 0F, 5, 4, 5, 0F); // Box 73
		bodyModel[20].setRotationPoint(-31F, -4F, 6F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 3, 4, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 74 headlight front
		bodyModel[21].setRotationPoint(-29F, -22F, -1F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 2, 4, 5, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 75
		bodyModel[22].setRotationPoint(-28F, -22F, -6F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 2, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 76
		bodyModel[23].setRotationPoint(-28F, -22F, 1F);

		bodyModel[24].addBox(0F, 0F, 0F, 14, 14, 1, 0F); // Box 72
		bodyModel[24].setRotationPoint(-26F, -18F, 10F);

		bodyModel[25].addBox(0F, 0F, 0F, 6, 1, 6, 0F); // Box 78
		bodyModel[25].setRotationPoint(-10F, -21F, -3F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F); // Box 82 stack 1
		bodyModel[26].setRotationPoint(6F, -22F, -1F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F); // Box 83 stack 2
		bodyModel[27].setRotationPoint(8.75F, -22F, -1F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F); // Box 84 stack 3
		bodyModel[28].setRotationPoint(11.25F, -22F, -1F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F); // Box 85 stack 4
		bodyModel[29].setRotationPoint(14F, -22F, -1F);

		bodyModel[30].addBox(0F, 0F, 0F, 7, 8, 3, 0F); // Box 86
		bodyModel[30].setRotationPoint(-25.1F, -12F, -5F);
		bodyModel[30].rotateAngleY = -0.38397244F;

		bodyModel[31].addBox(0F, 0F, 0F, 1, 9, 10, 0F); // Box 87
		bodyModel[31].setRotationPoint(-25F, -13F, -4F);

		bodyModel[32].addBox(0F, 0F, 0F, 1, 17, 9, 0F); // Box 88
		bodyModel[32].setRotationPoint(-13F, -21F, -4.5F);

		bodyModel[33].addBox(0F, 0F, 0F, 1, 4, 4, 0F); // Box 90
		bodyModel[33].setRotationPoint(-11F, -4F, 7F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 1, 4, 0, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 91
		bodyModel[34].setRotationPoint(-10F, -4F, 11.01F);

		bodyModel[35].addBox(0F, 0F, 0F, 37, 8, 0, 0F); // Box 92
		bodyModel[35].setRotationPoint(-6F, -8F, 11F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 18, 1, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 93
		bodyModel[36].setRotationPoint(-9F, 0F, -11F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 18, 1, 1, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 94
		bodyModel[37].setRotationPoint(-9F, 3.5F, -11F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 18, 1, 1, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 95
		bodyModel[38].setRotationPoint(-9F, 3.5F, 10F);

		bodyModel[39].addBox(0F, 0F, 0F, 42, 8, 0, 0F); // Box 99
		bodyModel[39].setRotationPoint(-11F, -8F, -11F);

		bodyModel[40].addBox(0F, 0F, 0F, 15, 14, 1, 0F); // Box 190
		bodyModel[40].setRotationPoint(-26F, -18F, -11F);

		bodyModel[41].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 69
		bodyModel[41].setRotationPoint(-22.5F, 3F, -2F);

		bodyModel[42].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 143
		bodyModel[42].setRotationPoint(18.5F, 3F, -2F);

		bodyModel[43].addBox(0F, 0F, 0F, 0, 16, 22, 0F); // Box 48
		bodyModel[43].setRotationPoint(-36.01F, -7F, -11F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 2, 3, 8, 0F,-2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 132
		bodyModel[44].setRotationPoint(-38.01F, 6F, -8F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 2, 3, 8, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -2F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 133
		bodyModel[45].setRotationPoint(-38.01F, 6F, 0F);

		bodyModel[46].addBox(0F, 0F, 0F, 27, 1, 12, 0F); // Box 184
		bodyModel[46].setRotationPoint(-36F, 2F, -6F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 1, 14, 5, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 235
		bodyModel[47].setRotationPoint(-33F, -13F, -6F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 259
		bodyModel[48].setRotationPoint(36F, 1F, -3F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -1F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 260
		bodyModel[49].setRotationPoint(36F, 1F, -5F);

		bodyModel[50].addBox(0F, 0F, 0F, 4, 2, 3, 0F); // Box 261
		bodyModel[50].setRotationPoint(35F, 3F, -1.5F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 3, 21, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 262
		bodyModel[51].setRotationPoint(31F, -20F, 1F);

		bodyModel[52].addBox(0F, 0F, 0F, 3, 21, 2, 0F); // Box 263
		bodyModel[52].setRotationPoint(31F, -20F, -1F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 3, 21, 6, 0F,0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 264
		bodyModel[53].setRotationPoint(31F, -20F, -7F);

		bodyModel[54].addBox(0F, 0F, 0F, 1, 4, 2, 0F); // Box 265 headlight rear
		bodyModel[54].setRotationPoint(34F, -18.5F, -1F);

		bodyModel[55].addBox(0F, 0F, 0F, 6, 1, 6, 0F); // Box 319
		bodyModel[55].setRotationPoint(-3F, -21F, -3F);

		bodyModel[56].addBox(0F, 0F, 0F, 6, 1, 6, 0F); // Box 320
		bodyModel[56].setRotationPoint(16F, -21F, -3F);

		bodyModel[57].addBox(0F, 0F, 0F, 6, 1, 6, 0F); // Box 321
		bodyModel[57].setRotationPoint(23F, -21F, -3F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 162 beacon light
		bodyModel[58].setRotationPoint(-24.5F, -23F, -8.5F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0.3F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, 0.3F, -0.5F, 0.1F, 0.3F, 0F, 0.1F, -1F, 0F, 0.1F, -1F, 0F, 0.1F, 0.3F, 0F, 0.1F); // Box 165
		bodyModel[59].setRotationPoint(-24.35F, -23F, -8.5F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 11, 3, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 324
		bodyModel[60].setRotationPoint(-2F, 5F, -8F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 11, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -2F, 0F, -0.25F, -2F); // Box 325
		bodyModel[61].setRotationPoint(-2F, 5F, 8F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 6, 1, 12, 0F,0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 125
		bodyModel[62].setRotationPoint(-32F, -14F, -6F);

		bodyModel[63].addBox(0F, 0F, 0F, 5, 1, 14, 0F); // Box 131
		bodyModel[63].setRotationPoint(-36F, 1F, -7F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 143
		bodyModel[64].setRotationPoint(-32.5F, -13.5F, -1F);

		bodyModel[65].addBox(0F, 0F, 0F, 1, 7, 4, 0F); // Box 150
		bodyModel[65].setRotationPoint(-32F, 1F, -11F);

		bodyModel[66].addBox(0F, 0F, 0F, 2, 12, 0, 0F); // Box 61
		bodyModel[66].setRotationPoint(-32F, -11F, -11.01F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 4, 2, 0, 0F,0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 174
		bodyModel[67].setRotationPoint(-30F, -12F, -11.01F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 4, 2, 0, 0F,0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 175
		bodyModel[68].setRotationPoint(-30F, -12F, 11.01F);

		bodyModel[69].addBox(0F, 0F, 0F, 2, 12, 0, 0F); // Box 178
		bodyModel[69].setRotationPoint(-32F, -11F, 11.01F);

		bodyModel[70].addBox(0F, 0F, 0F, 5, 2, 6, 0F); // Box 184 o2 generator
		bodyModel[70].setRotationPoint(-21.5F, -23.75F, -3F);

		bodyModel[71].addBox(0F, 0F, 0F, 3, 4, 5, 0F); // Box 193
		bodyModel[71].setRotationPoint(-29F, -4F, -11F);

		bodyModel[72].addBox(0F, 0F, 0F, 5, 1, 14, 0F); // Box 204
		bodyModel[72].setRotationPoint(31F, 1F, -7F);

		bodyModel[73].addBox(0F, 0F, 0F, 0, 16, 22, 0F); // Box 209
		bodyModel[73].setRotationPoint(36.01F, -7F, -11F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, 0F, -1F, 0F); // Box 246
		bodyModel[74].setRotationPoint(36F, 1F, 3F);

		bodyModel[75].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 271
		bodyModel[75].setRotationPoint(-28F, -24F, 7F);

		bodyModel[76].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 272
		bodyModel[76].setRotationPoint(-25F, -24F, 6F);

		bodyModel[77].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 273
		bodyModel[77].setRotationPoint(-27F, -24F, 5F);

		bodyModel[78].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 274
		bodyModel[78].setRotationPoint(-25F, -23F, 6F);

		bodyModel[79].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 278
		bodyModel[79].setRotationPoint(-30F, -25F, -1.5F);

		bodyModel[80].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 279
		bodyModel[80].setRotationPoint(-29F, -25F, -0.5F);

		bodyModel[81].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 280
		bodyModel[81].setRotationPoint(-31F, -25F, 0.5F);

		bodyModel[82].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 281
		bodyModel[82].setRotationPoint(-28F, -24F, -0.5F);

		bodyModel[83].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 301
		bodyModel[83].setRotationPoint(-20F, -24F, 7F);

		bodyModel[84].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 302
		bodyModel[84].setRotationPoint(-18F, -23F, 7F);

		bodyModel[85].addBox(0F, 0F, 0F, 1, 14, 16, 0F); // Box 313
		bodyModel[85].setRotationPoint(-26F, -18F, -6F);

		bodyModel[86].addBox(-0.5F, 0F, -3.5F, 1, 14, 4, 0F); // Box 314 door swing right
		bodyModel[86].setRotationPoint(-11.5F, -18F, 10.5F);

		bodyModel[87].addBox(0F, 0F, 0F, 15, 4, 22, 0F); // Box 316
		bodyModel[87].setRotationPoint(-26F, -4F, -11F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 318
		bodyModel[88].setRotationPoint(-10F, -2F, 7F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 5, 1, 0, 0F,0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F); // Box 321
		bodyModel[89].setRotationPoint(-11F, -13F, 11F);

		bodyModel[90].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 346
		bodyModel[90].setRotationPoint(-26F, -24F, 7.5F);

		bodyModel[91].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 347
		bodyModel[91].setRotationPoint(-24F, -23F, 7.5F);

		bodyModel[92].addBox(0F, 0F, 0F, 1, 3, 18, 0F); // Box 332
		bodyModel[92].setRotationPoint(-26F, -21F, -9F);

		bodyModel[93].addBox(0F, 0F, 0F, 1, 3, 18, 0F); // Box 333
		bodyModel[93].setRotationPoint(-12F, -21F, -9F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 13, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 334
		bodyModel[94].setRotationPoint(-25F, -21F, 7F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 13, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 335
		bodyModel[95].setRotationPoint(-25F, -21F, -9F);

		bodyModel[96].addBox(0F, 0F, 0F, 1, 2, 5, 0F); // Box 343
		bodyModel[96].setRotationPoint(-30F, -2F, -11F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 356
		bodyModel[97].setRotationPoint(-37F, 1F, -6F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 2, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 374
		bodyModel[98].setRotationPoint(-31F, 2F, -11F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 2, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 375
		bodyModel[99].setRotationPoint(-31F, 2F, 11F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 2, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 376
		bodyModel[100].setRotationPoint(29F, 2F, 11F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 2, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 377
		bodyModel[101].setRotationPoint(29F, 2F, -11F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 599
		bodyModel[102].setRotationPoint(9F, 2F, 9F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 600
		bodyModel[103].setRotationPoint(-11F, 2F, 9F);

		bodyModel[104].addBox(0F, 0F, 0F, 4, 0, 4, 0F); // Box 580
		bodyModel[104].setRotationPoint(-36F, 5F, -10F);

		bodyModel[105].addBox(0F, 0F, 0F, 4, 0, 4, 0F); // Box 582
		bodyModel[105].setRotationPoint(-36F, 8F, -11F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 15, 4, 2, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 67
		bodyModel[106].setRotationPoint(-26F, -22F, -11F);

		bodyModel[107].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 401
		bodyModel[107].setRotationPoint(-15F, -24F, -8F);

		bodyModel[108].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 402
		bodyModel[108].setRotationPoint(-15F, -23F, -8F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 402
		bodyModel[109].setRotationPoint(30.5F, -20.5F, -1F);

		bodyModel[110].addBox(0F, 0F, 0F, 5, 0, 7, 0F); // Box 73
		bodyModel[110].setRotationPoint(-27F, -24F, -5F);

		bodyModel[111].addBox(0F, 0F, 0F, 0, 2, 1, 0F); // Box 179
		bodyModel[111].setRotationPoint(-27F, -24F, -3F);

		bodyModel[112].addBox(0F, 0F, 0F, 0, 2, 1, 0F); // Box 180
		bodyModel[112].setRotationPoint(-27F, -24F, 0F);

		bodyModel[113].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 181
		bodyModel[113].setRotationPoint(-24F, -24F, 2F);

		bodyModel[114].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 182
		bodyModel[114].setRotationPoint(-24F, -24F, -5F);

		bodyModel[115].addBox(0F, 0F, 0F, 5, 0, 6, 0F); // Box 282
		bodyModel[115].setRotationPoint(-16F, -24F, -6F);

		bodyModel[116].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 283
		bodyModel[116].setRotationPoint(-13F, -24F, 0F);

		bodyModel[117].addBox(0F, 0F, 0F, 0, 2, 1, 0F); // Box 284
		bodyModel[117].setRotationPoint(-16F, -24F, -5F);

		bodyModel[118].addBox(0F, 0F, 0F, 0, 2, 1, 0F); // Box 285
		bodyModel[118].setRotationPoint(-16F, -24F, -2F);

		bodyModel[119].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 286
		bodyModel[119].setRotationPoint(-13F, -24F, -6F);

		bodyModel[120].addBox(0F, 0F, 0F, 4, 2, 3, 0F); // Box 424
		bodyModel[120].setRotationPoint(-39F, 3F, -1.5F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F); // Box 425
		bodyModel[121].setRotationPoint(-37F, 1F, 3F);

		bodyModel[122].addBox(0F, 0F, 0F, 4, 0, 4, 0F); // Box 427
		bodyModel[122].setRotationPoint(-36F, 5F, 6F);

		bodyModel[123].addBox(0F, 0F, 0F, 4, 0, 4, 0F); // Box 428
		bodyModel[123].setRotationPoint(-36F, 8F, 7F);

		bodyModel[124].addBox(0F, 0F, 0F, 1, 7, 4, 0F); // Box 429
		bodyModel[124].setRotationPoint(-32F, 1F, 7F);

		bodyModel[125].addBox(0F, 0F, 0F, 6, 12, 0, 0F); // Box 338
		bodyModel[125].setRotationPoint(-32.5F, -14F, -5.5F);

		bodyModel[126].addBox(0F, 0F, 0F, 2, 12, 0, 0F); // Box 340
		bodyModel[126].setRotationPoint(-32.5F, -14F, 5.5F);

		bodyModel[127].addBox(0F, 0F, 0F, 4, 0, 4, 0F); // Box 432
		bodyModel[127].setRotationPoint(32F, 5F, 6F);

		bodyModel[128].addBox(0F, 0F, 0F, 1, 7, 4, 0F); // Box 433
		bodyModel[128].setRotationPoint(31F, 1F, 7F);

		bodyModel[129].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 434
		bodyModel[129].setRotationPoint(32F, 2F, 7F);

		bodyModel[130].addBox(0F, 0F, 0F, 4, 0, 4, 0F); // Box 435
		bodyModel[130].setRotationPoint(32F, 8F, 7F);

		bodyModel[131].addBox(0F, 0F, 0F, 4, 0, 4, 0F); // Box 436
		bodyModel[131].setRotationPoint(32F, 8F, -11F);

		bodyModel[132].addBox(0F, 0F, 0F, 4, 0, 4, 0F); // Box 437
		bodyModel[132].setRotationPoint(32F, 5F, -10F);

		bodyModel[133].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 438
		bodyModel[133].setRotationPoint(32F, 2F, -9F);

		bodyModel[134].addBox(0F, 0F, 0F, 1, 7, 4, 0F); // Box 439
		bodyModel[134].setRotationPoint(31F, 1F, -11F);

		bodyModel[135].addBox(0F, 0F, 0F, 1, 9, 0, 0F); // Box 440
		bodyModel[135].setRotationPoint(31F, -8F, -11F);

		bodyModel[136].addBox(0F, 0F, 0F, 1, 9, 0, 0F); // Box 441
		bodyModel[136].setRotationPoint(31F, -8F, 11F);

		bodyModel[137].addBox(0F, 0F, 0F, 27, 1, 12, 0F); // Box 144
		bodyModel[137].setRotationPoint(9F, 2F, -6F);

		bodyModel[138].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 145
		bodyModel[138].setRotationPoint(-36F, 2F, -9F);

		bodyModel[139].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 146
		bodyModel[139].setRotationPoint(-36F, 2F, 7F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, -2F, 2F, 0F, -2F, 2F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 516
		bodyModel[140].setRotationPoint(-36F, -7F, -10F);
		bodyModel[140].rotateAngleY = -3.14159265F;

		bodyModel[141].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, -2F, 2F, 0F, -2F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 148
		bodyModel[141].setRotationPoint(-36F, -7F, 11F);
		bodyModel[141].rotateAngleY = -3.14159265F;

		bodyModel[142].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, -2F, 2F, 0F, -2F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 149
		bodyModel[142].setRotationPoint(36F, -7F, 11F);
		bodyModel[142].rotateAngleY = -3.14159265F;

		bodyModel[143].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, -2F, 2F, 0F, -2F, 2F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 150
		bodyModel[143].setRotationPoint(36F, -7F, -10F);
		bodyModel[143].rotateAngleY = -3.14159265F;

		bodyModel[144].addBox(0F, 0F, 0F, 1, 3, 2, 0F); // Box 370 ditchlight front
		bodyModel[144].setRotationPoint(-36F, -1.5F, -6F);

		bodyModel[145].addBox(0F, 0F, 0F, 1, 3, 2, 0F); // Box 370 ditchlight front
		bodyModel[145].setRotationPoint(-36F, -1.5F, 4F);

		bodyModel[146].addBox(0F, 0F, 0F, 1, 3, 2, 0F); // Box 370 ditchlight rear
		bodyModel[146].setRotationPoint(35F, -1.5F, -6F);

		bodyModel[147].addBox(0F, 0F, 0F, 1, 3, 2, 0F); // Box 370 ditchlight rear
		bodyModel[147].setRotationPoint(35F, -1.5F, 4F);
	}
	ModelBlombergB theTrucks = new ModelBlombergB();

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{

		for(ModelRendererTurbo m :bodyModel)
		{
			if(m.boxName.equals("lamp")){
				Minecraft.getMinecraft().entityRenderer.disableLightmap(1D);
			}
			m.render(f5);
			if(m.boxName.equals("lamp")){
				Minecraft.getMinecraft().entityRenderer.enableLightmap(1D);
				GL11.glBlendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
				GL11.glEnable(GL11.GL_BLEND);
			}
		}


		if(entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor()==5465){
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/classic_blomberg_b_black.png"));
		} else {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/classic_blomberg_b_lightgrey.png"));
		}

		GL11.glPushMatrix();
		GL11.glScalef(1f,1f,1f);
		GL11.glTranslatef(-1.28f, -0.03f,0.0f);
		theTrucks.render(entity, f, f1, f2, f3, f4, f5);

		GL11.glTranslatef(2.55f, 0f,0);
		theTrucks.render(entity, f, f1, f2, f3, f4, f5);
		GL11.glPopMatrix();
		GL11.glColor4f(1.0f, 1.0f, 1.0f, 0.5f);


	}

}