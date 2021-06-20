//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2021 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: SW8
// Model Creator: Bida
// Created on: 20.06.2021 - 01:42:00
// Last changed on: 20.06.2021 - 01:42:00

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

public class ModelSW8 extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 256;

	public ModelSW8() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[136];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 8, 180, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 16, 164, textureX, textureY); // Box 1
		bodyModel[2] = new ModelRendererTurbo(this, 1, 134, textureX, textureY); // Box 5
		bodyModel[3] = new ModelRendererTurbo(this, 163, 202, textureX, textureY); // Box 6
		bodyModel[4] = new ModelRendererTurbo(this, 243, 177, textureX, textureY); // Box 7
		bodyModel[5] = new ModelRendererTurbo(this, 237, 202, textureX, textureY); // Box 8
		bodyModel[6] = new ModelRendererTurbo(this, 188, 196, textureX, textureY); // Box 9
		bodyModel[7] = new ModelRendererTurbo(this, 262, 185, textureX, textureY); // Box 10
		bodyModel[8] = new ModelRendererTurbo(this, 295, 200, textureX, textureY); // Box 11
		bodyModel[9] = new ModelRendererTurbo(this, 243, 186, textureX, textureY); // Box 13
		bodyModel[10] = new ModelRendererTurbo(this, 247, 195, textureX, textureY); // Box 14
		bodyModel[11] = new ModelRendererTurbo(this, 247, 163, textureX, textureY); // Box 15
		bodyModel[12] = new ModelRendererTurbo(this, 243, 168, textureX, textureY); // Box 16
		bodyModel[13] = new ModelRendererTurbo(this, 139, 158, textureX, textureY); // Box 18
		bodyModel[14] = new ModelRendererTurbo(this, 76, 125, textureX, textureY); // Box 19
		bodyModel[15] = new ModelRendererTurbo(this, 1, 125, textureX, textureY); // Box 20
		bodyModel[16] = new ModelRendererTurbo(this, 53, 90, textureX, textureY); // Box 35
		bodyModel[17] = new ModelRendererTurbo(this, 53, 76, textureX, textureY); // Box 36
		bodyModel[18] = new ModelRendererTurbo(this, 474, 168, textureX, textureY); // Box 50
		bodyModel[19] = new ModelRendererTurbo(this, 194, 174, textureX, textureY); // Box 52
		bodyModel[20] = new ModelRendererTurbo(this, 194, 166, textureX, textureY); // Box 53
		bodyModel[21] = new ModelRendererTurbo(this, 124, 121, textureX, textureY); // Box 58
		bodyModel[22] = new ModelRendererTurbo(this, 69, 111, textureX, textureY); // Box 67
		bodyModel[23] = new ModelRendererTurbo(this, 72, 111, textureX, textureY); // Box 68
		bodyModel[24] = new ModelRendererTurbo(this, 220, 196, textureX, textureY); // Box 71
		bodyModel[25] = new ModelRendererTurbo(this, 205, 197, textureX, textureY); // Box 61
		bodyModel[26] = new ModelRendererTurbo(this, 435, 183, textureX, textureY); // Box 83
		bodyModel[27] = new ModelRendererTurbo(this, 435, 193, textureX, textureY); // Box 84
		bodyModel[28] = new ModelRendererTurbo(this, 435, 188, textureX, textureY); // Box 85
		bodyModel[29] = new ModelRendererTurbo(this, 458, 200, textureX, textureY); // Box 89
		bodyModel[30] = new ModelRendererTurbo(this, 235, 196, textureX, textureY); // Box 102
		bodyModel[31] = new ModelRendererTurbo(this, 235, 196, textureX, textureY); // Box 104
		bodyModel[32] = new ModelRendererTurbo(this, 91, 136, textureX, textureY); // Box 107
		bodyModel[33] = new ModelRendererTurbo(this, 14, 204, textureX, textureY); // Box 108
		bodyModel[34] = new ModelRendererTurbo(this, 289, 162, textureX, textureY); // Box 74
		bodyModel[35] = new ModelRendererTurbo(this, 289, 168, textureX, textureY); // Box 78
		bodyModel[36] = new ModelRendererTurbo(this, 297, 169, textureX, textureY); // Box 113
		bodyModel[37] = new ModelRendererTurbo(this, 295, 167, textureX, textureY); // Box 114
		bodyModel[38] = new ModelRendererTurbo(this, 305, 167, textureX, textureY); // Box 115
		bodyModel[39] = new ModelRendererTurbo(this, 299, 163, textureX, textureY); // Box 116
		bodyModel[40] = new ModelRendererTurbo(this, 299, 175, textureX, textureY); // Box 117
		bodyModel[41] = new ModelRendererTurbo(this, 222, 177, textureX, textureY); // Box 126
		bodyModel[42] = new ModelRendererTurbo(this, 222, 168, textureX, textureY); // Box 127
		bodyModel[43] = new ModelRendererTurbo(this, 21, 118, textureX, textureY); // Box 129
		bodyModel[44] = new ModelRendererTurbo(this, 27, 118, textureX, textureY); // Box 130
		bodyModel[45] = new ModelRendererTurbo(this, 24, 118, textureX, textureY); // Box 131
		bodyModel[46] = new ModelRendererTurbo(this, 124, 121, textureX, textureY); // Box 134
		bodyModel[47] = new ModelRendererTurbo(this, 99, 104, textureX, textureY); // Box 135
		bodyModel[48] = new ModelRendererTurbo(this, 1, 169, textureX, textureY); // Box 138
		bodyModel[49] = new ModelRendererTurbo(this, 3, 118, textureX, textureY); // Box 139
		bodyModel[50] = new ModelRendererTurbo(this, 3, 122, textureX, textureY); // Box 140
		bodyModel[51] = new ModelRendererTurbo(this, 6, 118, textureX, textureY); // Box 141
		bodyModel[52] = new ModelRendererTurbo(this, 9, 118, textureX, textureY); // Box 142
		bodyModel[53] = new ModelRendererTurbo(this, 142, 204, textureX, textureY); // Box 144
		bodyModel[54] = new ModelRendererTurbo(this, 174, 140, textureX, textureY, "lamp"); // Box 147 headlight front
		bodyModel[55] = new ModelRendererTurbo(this, 146, 154, textureX, textureY, "lamp"); // Box 148 numberboard part
		bodyModel[56] = new ModelRendererTurbo(this, 301, 199, textureX, textureY); // Box 315 door swing right
		bodyModel[57] = new ModelRendererTurbo(this, 403, 128, textureX, textureY); // Box 166
		bodyModel[58] = new ModelRendererTurbo(this, 146, 154, textureX, textureY, "lamp"); // Box 173 numberboard part
		bodyModel[59] = new ModelRendererTurbo(this, 458, 128, textureX, textureY); // Box 176
		bodyModel[60] = new ModelRendererTurbo(this, 482, 168, textureX, textureY); // Box 179
		bodyModel[61] = new ModelRendererTurbo(this, 118, 164, textureX, textureY); // Box 184
		bodyModel[62] = new ModelRendererTurbo(this, 40, 104, textureX, textureY); // Box 188
		bodyModel[63] = new ModelRendererTurbo(this, 47, 104, textureX, textureY); // Box 190
		bodyModel[64] = new ModelRendererTurbo(this, 183, 154, textureX, textureY, "lamp"); // Box 196 numberboard part
		bodyModel[65] = new ModelRendererTurbo(this, 203, 140, textureX, textureY, "lamp"); // Box 198 headlight rear
		bodyModel[66] = new ModelRendererTurbo(this, 183, 154, textureX, textureY, "lamp"); // Box 199 numberboard part
		bodyModel[67] = new ModelRendererTurbo(this, 137, 153, textureX, textureY, "lamp"); // Box 162 glow beacon
		bodyModel[68] = new ModelRendererTurbo(this, 136, 157, textureX, textureY); // Box 165
		bodyModel[69] = new ModelRendererTurbo(this, 205, 153, textureX, textureY, "lamp"); // Box 185 glow beacon
		bodyModel[70] = new ModelRendererTurbo(this, 204, 157, textureX, textureY); // Box 186
		bodyModel[71] = new ModelRendererTurbo(this, 355, 144, textureX, textureY); // Box 184
		bodyModel[72] = new ModelRendererTurbo(this, 324, 138, textureX, textureY); // Box 195
		bodyModel[73] = new ModelRendererTurbo(this, 324, 141, textureX, textureY); // Box 196
		bodyModel[74] = new ModelRendererTurbo(this, 324, 135, textureX, textureY); // Box 197
		bodyModel[75] = new ModelRendererTurbo(this, 134, 121, textureX, textureY); // Box 218
		bodyModel[76] = new ModelRendererTurbo(this, 134, 121, textureX, textureY); // Box 220
		bodyModel[77] = new ModelRendererTurbo(this, 75, 111, textureX, textureY); // Box 231
		bodyModel[78] = new ModelRendererTurbo(this, 66, 111, textureX, textureY); // Box 232
		bodyModel[79] = new ModelRendererTurbo(this, 382, 130, textureX, textureY); // Box 383
		bodyModel[80] = new ModelRendererTurbo(this, 195, 165, textureX, textureY); // Box 462
		bodyModel[81] = new ModelRendererTurbo(this, 195, 165, textureX, textureY); // Box 463
		bodyModel[82] = new ModelRendererTurbo(this, 38, 165, textureX, textureY); // Box 390
		bodyModel[83] = new ModelRendererTurbo(this, 38, 167, textureX, textureY); // Box 391
		bodyModel[84] = new ModelRendererTurbo(this, 99, 165, textureX, textureY); // Box 392
		bodyModel[85] = new ModelRendererTurbo(this, 99, 167, textureX, textureY); // Box 393
		bodyModel[86] = new ModelRendererTurbo(this, 121, 135, textureX, textureY); // Box 396
		bodyModel[87] = new ModelRendererTurbo(this, 76, 135, textureX, textureY); // Box 397
		bodyModel[88] = new ModelRendererTurbo(this, 6, 109, textureX, textureY); // Box 398
		bodyModel[89] = new ModelRendererTurbo(this, 6, 102, textureX, textureY); // Box 399
		bodyModel[90] = new ModelRendererTurbo(this, 29, 102, textureX, textureY); // Box 400
		bodyModel[91] = new ModelRendererTurbo(this, 29, 109, textureX, textureY); // Box 401
		bodyModel[92] = new ModelRendererTurbo(this, 112, 104, textureX, textureY); // Box 489
		bodyModel[93] = new ModelRendererTurbo(this, 112, 111, textureX, textureY); // Box 490
		bodyModel[94] = new ModelRendererTurbo(this, 99, 111, textureX, textureY); // Box 491
		bodyModel[95] = new ModelRendererTurbo(this, 41, 121, textureX, textureY); // Box 122
		bodyModel[96] = new ModelRendererTurbo(this, 62, 121, textureX, textureY); // Box 123
		bodyModel[97] = new ModelRendererTurbo(this, 337, 135, textureX, textureY); // Box 385
		bodyModel[98] = new ModelRendererTurbo(this, 337, 132, textureX, textureY); // Box 386
		bodyModel[99] = new ModelRendererTurbo(this, 394, 188, textureX, textureY); // Box 517
		bodyModel[100] = new ModelRendererTurbo(this, 394, 193, textureX, textureY); // Box 518
		bodyModel[101] = new ModelRendererTurbo(this, 394, 183, textureX, textureY); // Box 519
		bodyModel[102] = new ModelRendererTurbo(this, 319, 144, textureX, textureY); // Box 383
		bodyModel[103] = new ModelRendererTurbo(this, 315, 141, textureX, textureY); // Box 384
		bodyModel[104] = new ModelRendererTurbo(this, 317, 138, textureX, textureY); // Box 385
		bodyModel[105] = new ModelRendererTurbo(this, 317, 135, textureX, textureY); // Box 386
		bodyModel[106] = new ModelRendererTurbo(this, 328, 144, textureX, textureY); // Box 562
		bodyModel[107] = new ModelRendererTurbo(this, 21, 122, textureX, textureY); // Box 630
		bodyModel[108] = new ModelRendererTurbo(this, 35, 122, textureX, textureY); // Box 631
		bodyModel[109] = new ModelRendererTurbo(this, 17, 122, textureX, textureY); // Box 632
		bodyModel[110] = new ModelRendererTurbo(this, 224, 155, textureX, textureY, "lamp"); // Box 162 beacon
		bodyModel[111] = new ModelRendererTurbo(this, 223, 159, textureX, textureY); // Box 165
		bodyModel[112] = new ModelRendererTurbo(this, 232, 159, textureX, textureY); // Box 344
		bodyModel[113] = new ModelRendererTurbo(this, 233, 155, textureX, textureY, "lamp"); // Box 345 beacon
		bodyModel[114] = new ModelRendererTurbo(this, 222, 162, textureX, textureY); // Box 346 cull
		bodyModel[115] = new ModelRendererTurbo(this, 231, 162, textureX, textureY); // Box 347 cull
		bodyModel[116] = new ModelRendererTurbo(this, 134, 121, textureX, textureY); // Box 390
		bodyModel[117] = new ModelRendererTurbo(this, 134, 121, textureX, textureY); // Box 393
		bodyModel[118] = new ModelRendererTurbo(this, 124, 121, textureX, textureY); // Box 396
		bodyModel[119] = new ModelRendererTurbo(this, 124, 121, textureX, textureY); // Box 399
		bodyModel[120] = new ModelRendererTurbo(this, 60, 88, textureX, textureY); // Box 401
		bodyModel[121] = new ModelRendererTurbo(this, 418, 201, textureX, textureY); // Box 389
		bodyModel[122] = new ModelRendererTurbo(this, 418, 201, textureX, textureY); // Box 391
		bodyModel[123] = new ModelRendererTurbo(this, 472, 194, textureX, textureY); // Box 400
		bodyModel[124] = new ModelRendererTurbo(this, 146, 214, textureX, textureY, "lamp"); // Box 370 ditchlight front
		bodyModel[125] = new ModelRendererTurbo(this, 146, 214, textureX, textureY, "lamp"); // Box 370 ditchlight front
		bodyModel[126] = new ModelRendererTurbo(this, 139, 214, textureX, textureY, "lamp"); // Box 370 ditchlight rear
		bodyModel[127] = new ModelRendererTurbo(this, 139, 214, textureX, textureY, "lamp"); // Box 370 ditchlight rear
		bodyModel[128] = new ModelRendererTurbo(this, 448, 149, textureX, textureY); // Box 569
		bodyModel[129] = new ModelRendererTurbo(this, 455, 149, textureX, textureY); // Box 570
		bodyModel[130] = new ModelRendererTurbo(this, 472, 194, textureX, textureY); // Box 571
		bodyModel[131] = new ModelRendererTurbo(this, 65, 104, textureX, textureY); // Box 572
		bodyModel[132] = new ModelRendererTurbo(this, 65, 104, textureX, textureY); // Box 573
		bodyModel[133] = new ModelRendererTurbo(this, 245, 149, textureX, textureY); // Box 86
		bodyModel[134] = new ModelRendererTurbo(this, 266, 142, textureX, textureY); // Box 87
		bodyModel[135] = new ModelRendererTurbo(this, 60, 86, textureX, textureY); // Box 394

		bodyModel[0].addBox(0F, 0F, 0F, 54, 1, 22, 0F); // Box 0
		bodyModel[0].setRotationPoint(-27F, 2F, -11F);

		bodyModel[1].addBox(0F, 0F, 0F, 3, 1, 14, 0F); // Box 1
		bodyModel[1].setRotationPoint(-30F, 2F, -7F);

		bodyModel[2].addBox(0F, 0F, 0F, 30, 15, 14, 0F); // Box 5
		bodyModel[2].setRotationPoint(-26F, -13F, -7F);

		bodyModel[3].addBox(0F, 0F, 0F, 11, 14, 1, 0F); // Box 6
		bodyModel[3].setRotationPoint(12F, -17F, -11F);

		bodyModel[4].addBox(0F, 0F, 0F, 12, 2, 6, 0F); // Box 7
		bodyModel[4].setRotationPoint(11F, -21F, -3F);

		bodyModel[5].addBox(0F, 0F, 0F, 11, 14, 1, 0F); // Box 8
		bodyModel[5].setRotationPoint(12F, -17F, 10F);

		bodyModel[6].addBox(0F, 0F, 0F, 1, 14, 7, 0F); // Box 9
		bodyModel[6].setRotationPoint(22F, -17F, -10F);

		bodyModel[7].addBox(0F, 0F, 0F, 1, 14, 18, 0F); // Box 10
		bodyModel[7].setRotationPoint(11F, -17F, -7F);

		bodyModel[8].addBox(0F, 0F, 0F, 1, 2, 18, 0F); // Box 11
		bodyModel[8].setRotationPoint(11F, -19F, -9F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 12, 2, 6, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[9].setRotationPoint(11F, -21F, -9F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 12, 2, 2, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		bodyModel[10].setRotationPoint(11F, -19F, -11F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 12, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		bodyModel[11].setRotationPoint(11F, -19F, 9F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 12, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 16
		bodyModel[12].setRotationPoint(11F, -21F, 3F);

		bodyModel[13].addBox(0F, 0F, 0F, 16, 5, 22, 0F); // Box 18
		bodyModel[13].setRotationPoint(11F, -3F, -11F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 30, 1, 7, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 19
		bodyModel[14].setRotationPoint(-26F, -14F, -7F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 30, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 20
		bodyModel[15].setRotationPoint(-26F, -14F, 0F);

		bodyModel[16].addBox(0F, 0F, 0F, 38, 8, 0, 0F); // Box 35
		bodyModel[16].setRotationPoint(-27F, -6F, -11.01F);

		bodyModel[17].addBox(0F, 0F, 0F, 38, 8, 0, 0F); // Box 36
		bodyModel[17].setRotationPoint(-27F, -6F, 11.01F);

		bodyModel[18].addBox(0F, 0F, 0F, 3, 0, 22, 0F); // Box 50
		bodyModel[18].setRotationPoint(-33F, 9F, -11F);

		bodyModel[19].addBox(0F, 0F, 0F, 5, 2, 3, 0F); // Box 52
		bodyModel[19].setRotationPoint(-33.5F, 3F, -1.5F);

		bodyModel[20].addBox(0F, 0F, 0F, 5, 2, 3, 0F); // Box 53
		bodyModel[20].setRotationPoint(28.5F, 3F, -1.5F);

		bodyModel[21].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 58
		bodyModel[21].setRotationPoint(-27F, 8F, -9F);
		bodyModel[21].rotateAngleY = -3.14159265F;

		bodyModel[22].addBox(0F, 0F, 0F, 1, 3, 0, 0F); // Box 67
		bodyModel[22].setRotationPoint(26F, -6F, -4F);

		bodyModel[23].addBox(0F, 0F, 0F, 1, 3, 0, 0F); // Box 68
		bodyModel[23].setRotationPoint(26F, -6F, 4F);

		bodyModel[24].addBox(0F, 0F, 0F, 1, 14, 7, 0F); // Box 71
		bodyModel[24].setRotationPoint(22F, -17F, 3F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 1, 14, 6, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 61
		bodyModel[25].setRotationPoint(22F, -17F, -3F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 9, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 83
		bodyModel[26].setRotationPoint(-4.5F, 4.5F, -11F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 9, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 84
		bodyModel[27].setRotationPoint(-4.5F, 6.5F, -11F);

		bodyModel[28].addBox(0F, 0F, 0F, 9, 1, 3, 0F); // Box 85
		bodyModel[28].setRotationPoint(-4.5F, 5.5F, -11F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 10, 3, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 89
		bodyModel[29].setRotationPoint(-5F, 4F, -8F);

		bodyModel[30].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 102
		bodyModel[30].setRotationPoint(-17F, 4F, -1F);

		bodyModel[31].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 104
		bodyModel[31].setRotationPoint(15F, 4F, -1F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 7, 13, 14, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 107
		bodyModel[32].setRotationPoint(4F, -11F, -7F);

		bodyModel[33].addBox(0F, 0F, 0F, 54, 1, 16, 0F); // Box 108
		bodyModel[33].setRotationPoint(-27F, 3F, -8F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 74
		bodyModel[34].setRotationPoint(-9F, -18F, -0.5F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 78
		bodyModel[35].setRotationPoint(-8.75F, -16.5F, -0.35F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 113
		bodyModel[36].setRotationPoint(-9F, -15F, -2F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 114
		bodyModel[37].setRotationPoint(-9F, -18F, -2F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 115
		bodyModel[38].setRotationPoint(-9F, -18F, 1F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 116
		bodyModel[39].setRotationPoint(-9F, -18.5F, -1F);

		bodyModel[40].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 117
		bodyModel[40].setRotationPoint(-9F, -14.5F, -1F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 10, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 126
		bodyModel[41].setRotationPoint(12F, -19F, 6F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 10, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 127
		bodyModel[42].setRotationPoint(12F, -19F, -9F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 1, 0, 6, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 129
		bodyModel[43].setRotationPoint(10F, -21F, -9F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 1, 0, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F); // Box 130
		bodyModel[44].setRotationPoint(10F, -21F, 3F);

		bodyModel[45].addBox(0F, 0F, 0F, 1, 0, 6, 0F); // Box 131
		bodyModel[45].setRotationPoint(10F, -21F, -3F);

		bodyModel[46].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 134
		bodyModel[46].setRotationPoint(-27F, 5.5F, -6F);
		bodyModel[46].rotateAngleY = -3.14159265F;

		bodyModel[47].addShapeBox(0F, 0F, 0F, 0, 5, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 135
		bodyModel[47].setRotationPoint(-27F, 3F, -11F);

		bodyModel[48].addBox(0F, 0F, 0F, 1, 12, 12, 0F); // Box 138
		bodyModel[48].setRotationPoint(-26.75F, -10.5F, -6F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 1, 0, 6, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 139
		bodyModel[49].setRotationPoint(23F, -21F, -9F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 1, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 140
		bodyModel[50].setRotationPoint(23F, -17F, -11F);

		bodyModel[51].addBox(0F, 0F, 0F, 1, 0, 6, 0F); // Box 141
		bodyModel[51].setRotationPoint(23F, -21F, -3F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 1, 0, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F); // Box 142
		bodyModel[52].setRotationPoint(23F, -21F, 3F);

		bodyModel[53].addBox(0F, 0F, 0F, 1, 2, 18, 0F); // Box 144
		bodyModel[53].setRotationPoint(22F, -19F, -9F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 2, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 147 headlight front
		bodyModel[54].setRotationPoint(-28F, -14F, -1.5F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 148 numberboard part
		bodyModel[55].setRotationPoint(-27.5F, -13.5F, -2.5F);

		bodyModel[56].addBox(-0.5F, 0F, -0.5F, 1, 14, 4, 0F); // Box 315 door swing right
		bodyModel[56].setRotationPoint(11.5F, -17F, -10.5F);

		bodyModel[57].addBox(0F, 0F, 0F, 0, 15, 22, 0F); // Box 166
		bodyModel[57].setRotationPoint(-30.01F, -6F, -11F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 173 numberboard part
		bodyModel[58].setRotationPoint(-27.5F, -13.5F, 1.5F);

		bodyModel[59].addBox(0F, 0F, 0F, 0, 15, 22, 0F); // Box 176
		bodyModel[59].setRotationPoint(30.01F, -6F, -11F);

		bodyModel[60].addBox(0F, 0F, 0F, 3, 0, 22, 0F); // Box 179
		bodyModel[60].setRotationPoint(30.01F, 9F, -11F);

		bodyModel[61].addBox(0F, 0F, 0F, 3, 1, 14, 0F); // Box 184
		bodyModel[61].setRotationPoint(27F, 2F, -7F);

		bodyModel[62].addBox(0F, 0F, 0F, 3, 11, 0, 0F); // Box 188
		bodyModel[62].setRotationPoint(25F, -6F, -11.01F);

		bodyModel[63].addBox(0F, 0F, 0F, 3, 11, 0, 0F); // Box 190
		bodyModel[63].setRotationPoint(25F, -6F, 11.01F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 196 numberboard part
		bodyModel[64].setRotationPoint(22.5F, -19.5F, -2.5F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 2, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 198 headlight rear
		bodyModel[65].setRotationPoint(23F, -20F, -1.5F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 199 numberboard part
		bodyModel[66].setRotationPoint(22.5F, -19.5F, 1.5F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 162 glow beacon
		bodyModel[67].setRotationPoint(15.5F, -23F, -0.5F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0.3F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, 0.3F, -0.5F, 0.1F, 0.3F, 0F, 0.1F, -1F, 0F, 0.1F, -1F, 0F, 0.1F, 0.3F, 0F, 0.1F); // Box 165
		bodyModel[68].setRotationPoint(15.65F, -22F, -0.5F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 185 glow beacon
		bodyModel[69].setRotationPoint(21.5F, -23F, -0.5F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0.3F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, 0.3F, -0.5F, 0.1F, 0.3F, 0F, 0.1F, -1F, 0F, 0.1F, -1F, 0F, 0.1F, 0.3F, 0F, 0.1F); // Box 186
		bodyModel[70].setRotationPoint(21.65F, -22F, -0.5F);

		bodyModel[71].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 184
		bodyModel[71].setRotationPoint(18F, -23F, 0F);

		bodyModel[72].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 195
		bodyModel[72].setRotationPoint(9.5F, -22.5F, -0.5F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 196
		bodyModel[73].setRotationPoint(10F, -22.25F, -1.5F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 197
		bodyModel[74].setRotationPoint(10F, -22.25F, 0.5F);

		bodyModel[75].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 218
		bodyModel[75].setRotationPoint(27F, 5.5F, 6F);

		bodyModel[76].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 220
		bodyModel[76].setRotationPoint(27F, 8F, 9F);

		bodyModel[77].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 231
		bodyModel[77].setRotationPoint(23F, -12F, 4F);

		bodyModel[78].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 232
		bodyModel[78].setRotationPoint(23F, -12F, -4F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 2, 7, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 383
		bodyModel[79].setRotationPoint(-6F, -20F, -1F);

		bodyModel[80].addBox(0F, 0F, 0F, 2, 1, 21, 0F); // Box 462
		bodyModel[80].setRotationPoint(-17F, 3F, -10.5F);

		bodyModel[81].addBox(0F, 0F, 0F, 2, 1, 21, 0F); // Box 463
		bodyModel[81].setRotationPoint(15F, 3F, -10.5F);

		bodyModel[82].addBox(0F, 0F, 0F, 30, 0, 1, 0F); // Box 390
		bodyModel[82].setRotationPoint(-26F, -11F, -8F);

		bodyModel[83].addBox(0F, 0F, 0F, 30, 0, 1, 0F); // Box 391
		bodyModel[83].setRotationPoint(-26F, -11F, 7F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 7, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 392
		bodyModel[84].setRotationPoint(4F, -11F, -8F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 7, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 393
		bodyModel[85].setRotationPoint(4F, -11F, 7F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 7, 2, 7, 0F,0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 396
		bodyModel[86].setRotationPoint(4F, -13F, -7F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 7, 2, 7, 0F,0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 397
		bodyModel[87].setRotationPoint(4F, -13F, 0F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 4, 5, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Box 398
		bodyModel[88].setRotationPoint(-27F, 3F, -11F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 4, 5, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Box 399
		bodyModel[89].setRotationPoint(-27F, 3F, 11F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 4, 5, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); // Box 400
		bodyModel[90].setRotationPoint(23F, 3F, 11F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 4, 5, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); // Box 401
		bodyModel[91].setRotationPoint(23F, 3F, -11F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 0, 5, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 489
		bodyModel[92].setRotationPoint(-27F, 3F, 5F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 0, 5, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 490
		bodyModel[93].setRotationPoint(27F, 3F, 5F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 0, 5, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 491
		bodyModel[94].setRotationPoint(27F, 3F, -11F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 9, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1.75F, -2F, 0F, -1.75F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F); // Box 122
		bodyModel[95].setRotationPoint(13F, -17F, 11F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 9, 2, 1, 0F,-1.75F, -2F, 0F, -1.75F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 123
		bodyModel[96].setRotationPoint(13F, -17F, -12F);

		bodyModel[97].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 385
		bodyModel[97].setRotationPoint(9F, -20F, -1F);

		bodyModel[98].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 386
		bodyModel[98].setRotationPoint(8.25F, -20F, 0F);

		bodyModel[99].addBox(0F, 0F, 0F, 9, 1, 3, 0F); // Box 517
		bodyModel[99].setRotationPoint(-4.5F, 5.5F, 8F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 9, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 518
		bodyModel[100].setRotationPoint(-4.5F, 6.5F, 8F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 9, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 519
		bodyModel[101].setRotationPoint(-4.5F, 4.5F, 8F);

		bodyModel[102].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 383
		bodyModel[102].setRotationPoint(11.5F, -20F, 7.5F);

		bodyModel[103].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 384
		bodyModel[103].setRotationPoint(10F, -21F, 6.5F);

		bodyModel[104].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 385
		bodyModel[104].setRotationPoint(11.5F, -21F, 7.5F);

		bodyModel[105].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 386
		bodyModel[105].setRotationPoint(10.75F, -21F, 8.5F);

		bodyModel[106].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 562
		bodyModel[106].setRotationPoint(11.5F, -21.5F, -0.5F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 1, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 630
		bodyModel[107].setRotationPoint(10F, -17F, -11F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 1, 0, 2, 0F,0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 631
		bodyModel[108].setRotationPoint(10F, -17F, 9F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 1, 0, 2, 0F,0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 632
		bodyModel[109].setRotationPoint(23F, -17F, 9F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 162 beacon
		bodyModel[110].setRotationPoint(12F, -23F, -6.5F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0.3F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, 0.3F, -0.5F, 0.1F, 0.3F, 0F, 0.1F, -1F, 0F, 0.1F, -1F, 0F, 0.1F, 0.3F, 0F, 0.1F); // Box 165
		bodyModel[111].setRotationPoint(12.15F, -22F, -6.5F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0.3F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, 0.3F, -0.5F, 0.1F, 0.3F, 0F, 0.1F, -1F, 0F, 0.1F, -1F, 0F, 0.1F, 0.3F, 0F, 0.1F); // Box 344
		bodyModel[112].setRotationPoint(12.15F, -22F, 5.5F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 345 beacon
		bodyModel[113].setRotationPoint(12F, -23F, 5.5F);

		bodyModel[114].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 346 cull
		bodyModel[114].setRotationPoint(11.5F, -21F, -7F);

		bodyModel[115].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 347 cull
		bodyModel[115].setRotationPoint(11.5F, -21F, 5F);

		bodyModel[116].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 390
		bodyModel[116].setRotationPoint(-30F, 8F, 9F);

		bodyModel[117].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 393
		bodyModel[117].setRotationPoint(-30F, 5.5F, 6F);

		bodyModel[118].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 396
		bodyModel[118].setRotationPoint(30F, 8F, -9F);
		bodyModel[118].rotateAngleY = -3.14159265F;

		bodyModel[119].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 399
		bodyModel[119].setRotationPoint(30F, 5.5F, -6F);
		bodyModel[119].rotateAngleY = -3.14159265F;

		bodyModel[120].addShapeBox(0F, 0F, 0F, 5, 1, 0, 0F,0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F); // Box 401
		bodyModel[120].setRotationPoint(3F, -10F, -11.01F);

		bodyModel[121].addBox(0F, 0F, 0F, 6, 3, 0, 0F); // Box 389
		bodyModel[121].setRotationPoint(-3F, 3F, 11.01F);

		bodyModel[122].addBox(0F, 0F, 0F, 6, 3, 0, 0F); // Box 391
		bodyModel[122].setRotationPoint(-3F, 3F, -11.01F);

		bodyModel[123].addBox(0F, 0F, 0F, 10, 2, 2, 0F); // Box 400
		bodyModel[123].setRotationPoint(-5F, 3F, -10F);

		bodyModel[124].addBox(0F, 0F, 0F, 1, 3, 2, 0F); // Box 370 ditchlight front
		bodyModel[124].setRotationPoint(-30F, -1F, -6F);

		bodyModel[125].addBox(0F, 0F, 0F, 1, 3, 2, 0F); // Box 370 ditchlight front
		bodyModel[125].setRotationPoint(-30F, -1F, 4F);

		bodyModel[126].addBox(0F, 0F, 0F, 1, 3, 2, 0F); // Box 370 ditchlight rear
		bodyModel[126].setRotationPoint(29F, -1F, -6F);

		bodyModel[127].addBox(0F, 0F, 0F, 1, 3, 2, 0F); // Box 370 ditchlight rear
		bodyModel[127].setRotationPoint(29F, -1F, 4F);

		bodyModel[128].addBox(0F, 0F, 0F, 0, 8, 1, 0F); // Box 569
		bodyModel[128].setRotationPoint(-30F, -6F, -0.5F);

		bodyModel[129].addBox(0F, 0F, 0F, 0, 8, 1, 0F); // Box 570
		bodyModel[129].setRotationPoint(30F, -6F, -0.5F);

		bodyModel[130].addBox(0F, 0F, 0F, 10, 2, 2, 0F); // Box 571
		bodyModel[130].setRotationPoint(-5F, 3F, 8F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 1, 6, 0, 0F,-3F, 0F, 0F, 2F, -2F, 0F, 2F, -2F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 572
		bodyModel[131].setRotationPoint(27F, -12F, -4F);
		bodyModel[131].rotateAngleY = -3.14159265F;

		bodyModel[132].addShapeBox(0F, 0F, 0F, 1, 6, 0, 0F,-3F, 0F, 0F, 2F, -2F, 0F, 2F, -2F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 573
		bodyModel[132].setRotationPoint(27F, -12F, 4F);
		bodyModel[132].rotateAngleY = -3.14159265F;

		bodyModel[133].addBox(0F, 0F, 0F, 7, 8, 3, 0F); // Box 86
		bodyModel[133].setRotationPoint(11.9F, -11F, -5F);
		bodyModel[133].rotateAngleY = -0.38397244F;

		bodyModel[134].addBox(0F, 0F, 0F, 1, 9, 10, 0F); // Box 87
		bodyModel[134].setRotationPoint(12F, -12F, -4F);

		bodyModel[135].addBox(0F, 0F, 0F, 3, 1, 0, 0F); // Box 394
		bodyModel[135].setRotationPoint(8F, -10F, -11.01F);
	}
	ModelTypeA theTrucks = new ModelTypeA();

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		for (int i = 0; i < 135; i++) {
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
		if (entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor() == 16546455) {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/typeA_Black_Brown.png"));//this code is here for other truck colors once i get around to it
			GL11.glPushMatrix();
			GL11.glTranslated(-0.6, 0.0, 0);
			theTrucks.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glRotatef(180, 0, 1, 0);
			GL11.glTranslated(-1.95, 0.0, 0);
			theTrucks.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();

		} else if (entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor() == 4546) {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/typeA_Black.png"));//this code is here for other truck colors once i get around to it
			GL11.glPushMatrix();
			GL11.glTranslated(-0.6F ,0.0F,0F);
			theTrucks.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(1.95F,0.0F,0);
			theTrucks.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/typeA_Black.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.0F ,0.0F,0F);
			theTrucks.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(2.0F,0.0F,0);
			theTrucks.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		}
	}
}