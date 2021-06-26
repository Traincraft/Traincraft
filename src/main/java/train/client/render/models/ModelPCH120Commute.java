//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator:
// Created on:05.06.2020 - 13:20:15
// Last changed on: 05.06.2020 - 13:20:15

package train.client.render.models;



import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import tmt.ModelConverter;
import tmt.ModelRendererTurbo;
import tmt.Tessellator;


public class ModelPCH120Commute extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelPCH120Commute() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[112];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 67
		bodyModel[2] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 68
		bodyModel[3] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 70
		bodyModel[4] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 71
		bodyModel[5] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 72
		bodyModel[6] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 73
		bodyModel[7] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 74
		bodyModel[8] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 75
		bodyModel[9] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 76
		bodyModel[10] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 77
		bodyModel[11] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 182
		bodyModel[12] = new ModelRendererTurbo(this, 377, 9, textureX, textureY); // Box 183
		bodyModel[13] = new ModelRendererTurbo(this, 225, 17, textureX, textureY); // Box 184
		bodyModel[14] = new ModelRendererTurbo(this, 369, 17, textureX, textureY); // Box 185
		bodyModel[15] = new ModelRendererTurbo(this, 41, 25, textureX, textureY); // Box 186
		bodyModel[16] = new ModelRendererTurbo(this, 225, 25, textureX, textureY); // Box 187
		bodyModel[17] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 189
		bodyModel[18] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 190
		bodyModel[19] = new ModelRendererTurbo(this, 377, 25, textureX, textureY); // Box 191 door slide right
		bodyModel[20] = new ModelRendererTurbo(this, 401, 25, textureX, textureY); // Box 192
		bodyModel[21] = new ModelRendererTurbo(this, 481, 25, textureX, textureY); // Box 193
		bodyModel[22] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 195
		bodyModel[23] = new ModelRendererTurbo(this, 145, 33, textureX, textureY); // Box 196
		bodyModel[24] = new ModelRendererTurbo(this, 289, 33, textureX, textureY); // Box 197
		bodyModel[25] = new ModelRendererTurbo(this, 313, 33, textureX, textureY); // Box 198
		bodyModel[26] = new ModelRendererTurbo(this, 497, 25, textureX, textureY); // Box 199
		bodyModel[27] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 200
		bodyModel[28] = new ModelRendererTurbo(this, 337, 33, textureX, textureY); // Box 201
		bodyModel[29] = new ModelRendererTurbo(this, 361, 33, textureX, textureY); // Box 202
		bodyModel[30] = new ModelRendererTurbo(this, 81, 49, textureX, textureY); // Box 203
		bodyModel[31] = new ModelRendererTurbo(this, 105, 49, textureX, textureY); // Box 204
		bodyModel[32] = new ModelRendererTurbo(this, 129, 49, textureX, textureY); // Box 205
		bodyModel[33] = new ModelRendererTurbo(this, 145, 49, textureX, textureY); // Box 206
		bodyModel[34] = new ModelRendererTurbo(this, 161, 49, textureX, textureY); // Box 207
		bodyModel[35] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 208
		bodyModel[36] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 209
		bodyModel[37] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 210
		bodyModel[38] = new ModelRendererTurbo(this, 65, 9, textureX, textureY); // Box 211
		bodyModel[39] = new ModelRendererTurbo(this, 201, 57, textureX, textureY); // Box 212
		bodyModel[40] = new ModelRendererTurbo(this, 81, 9, textureX, textureY); // Box 279
		bodyModel[41] = new ModelRendererTurbo(this, 97, 9, textureX, textureY); // Box 280
		bodyModel[42] = new ModelRendererTurbo(this, 377, 49, textureX, textureY, "light"); // Box 281 glow
		bodyModel[43] = new ModelRendererTurbo(this, 345, 57, textureX, textureY, "light"); // Box 282 glow
		bodyModel[44] = new ModelRendererTurbo(this, 353, 65, textureX, textureY, "light"); // Box 283 glow
		bodyModel[45] = new ModelRendererTurbo(this, 161, 73, textureX, textureY, "light"); // Box 284 glow
		bodyModel[46] = new ModelRendererTurbo(this, 113, 9, textureX, textureY); // Box 357
		bodyModel[47] = new ModelRendererTurbo(this, 145, 9, textureX, textureY); // Box 358
		bodyModel[48] = new ModelRendererTurbo(this, 185, 49, textureX, textureY); // Box 359
		bodyModel[49] = new ModelRendererTurbo(this, 465, 57, textureX, textureY); // Box 360
		bodyModel[50] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 361
		bodyModel[51] = new ModelRendererTurbo(this, 273, 73, textureX, textureY); // Box 362
		bodyModel[52] = new ModelRendererTurbo(this, 329, 73, textureX, textureY); // Box 363
		bodyModel[53] = new ModelRendererTurbo(this, 377, 73, textureX, textureY); // Box 364
		bodyModel[54] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 206
		bodyModel[55] = new ModelRendererTurbo(this, 73, 17, textureX, textureY); // Box 366
		bodyModel[56] = new ModelRendererTurbo(this, 41, 73, textureX, textureY); // Box 186
		bodyModel[57] = new ModelRendererTurbo(this, 89, 17, textureX, textureY); // Box 109
		bodyModel[58] = new ModelRendererTurbo(this, 201, 49, textureX, textureY); // Box 110
		bodyModel[59] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Box 118
		bodyModel[60] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 119
		bodyModel[61] = new ModelRendererTurbo(this, 73, 9, textureX, textureY); // Box 149
		bodyModel[62] = new ModelRendererTurbo(this, 369, 9, textureX, textureY); // Box 150
		bodyModel[63] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 227
		bodyModel[64] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 228
		bodyModel[65] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 229
		bodyModel[66] = new ModelRendererTurbo(this, 505, 17, textureX, textureY); // Box 230
		bodyModel[67] = new ModelRendererTurbo(this, 225, 49, textureX, textureY); // Box 231
		bodyModel[68] = new ModelRendererTurbo(this, 249, 49, textureX, textureY); // Box 232
		bodyModel[69] = new ModelRendererTurbo(this, 185, 25, textureX, textureY); // Box 383
		bodyModel[70] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 384
		bodyModel[71] = new ModelRendererTurbo(this, 161, 49, textureX, textureY); // Box 385
		bodyModel[72] = new ModelRendererTurbo(this, 137, 33, textureX, textureY); // Box 387
		bodyModel[73] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 388
		bodyModel[74] = new ModelRendererTurbo(this, 65, 9, textureX, textureY); // Box 389
		bodyModel[75] = new ModelRendererTurbo(this, 305, 73, textureX, textureY); // Box 390
		bodyModel[76] = new ModelRendererTurbo(this, 497, 17, textureX, textureY); // Box 391
		bodyModel[77] = new ModelRendererTurbo(this, 97, 49, textureX, textureY); // Box 77
		bodyModel[78] = new ModelRendererTurbo(this, 273, 49, textureX, textureY); // Box 78
		bodyModel[79] = new ModelRendererTurbo(this, 59, 87, textureX, textureY); // Box 80
		bodyModel[80] = new ModelRendererTurbo(this, 79, 90, textureX, textureY); // Box 81
		bodyModel[81] = new ModelRendererTurbo(this, 109, 78, textureX, textureY); // Box 82
		bodyModel[82] = new ModelRendererTurbo(this, 109, 78, textureX, textureY); // Box 84
		bodyModel[83] = new ModelRendererTurbo(this, 124, 78, textureX, textureY); // Box 85
		bodyModel[84] = new ModelRendererTurbo(this, 124, 78, textureX, textureY); // Box 86
		bodyModel[85] = new ModelRendererTurbo(this, 59, 87, textureX, textureY); // Box 87
		bodyModel[86] = new ModelRendererTurbo(this, 79, 90, textureX, textureY); // Box 88
		bodyModel[87] = new ModelRendererTurbo(this, 109, 78, textureX, textureY); // Box 89
		bodyModel[88] = new ModelRendererTurbo(this, 124, 78, textureX, textureY); // Box 90
		bodyModel[89] = new ModelRendererTurbo(this, 59, 87, textureX, textureY); // Box 91
		bodyModel[90] = new ModelRendererTurbo(this, 79, 90, textureX, textureY); // Box 92
		bodyModel[91] = new ModelRendererTurbo(this, 109, 78, textureX, textureY); // Box 93
		bodyModel[92] = new ModelRendererTurbo(this, 124, 78, textureX, textureY); // Box 94
		bodyModel[93] = new ModelRendererTurbo(this, 79, 90, textureX, textureY); // Box 95
		bodyModel[94] = new ModelRendererTurbo(this, 79, 90, textureX, textureY); // Box 96
		bodyModel[95] = new ModelRendererTurbo(this, 79, 90, textureX, textureY); // Box 97
		bodyModel[96] = new ModelRendererTurbo(this, 59, 87, textureX, textureY); // Box 98
		bodyModel[97] = new ModelRendererTurbo(this, 59, 87, textureX, textureY); // Box 99
		bodyModel[98] = new ModelRendererTurbo(this, 59, 87, textureX, textureY); // Box 100
		bodyModel[99] = new ModelRendererTurbo(this, 109, 78, textureX, textureY); // Box 101
		bodyModel[100] = new ModelRendererTurbo(this, 109, 78, textureX, textureY); // Box 102
		bodyModel[101] = new ModelRendererTurbo(this, 109, 78, textureX, textureY); // Box 103
		bodyModel[102] = new ModelRendererTurbo(this, 109, 78, textureX, textureY); // Box 104
		bodyModel[103] = new ModelRendererTurbo(this, 124, 78, textureX, textureY); // Box 105
		bodyModel[104] = new ModelRendererTurbo(this, 124, 78, textureX, textureY); // Box 106
		bodyModel[105] = new ModelRendererTurbo(this, 124, 78, textureX, textureY); // Box 107
		bodyModel[106] = new ModelRendererTurbo(this, 124, 78, textureX, textureY); // Box 108
		bodyModel[107] = new ModelRendererTurbo(this, 4, 73, textureX, textureY); // Box 109
		bodyModel[108] = new ModelRendererTurbo(this, 94, 78, textureX, textureY); // Box 110
		bodyModel[109] = new ModelRendererTurbo(this, 79, 80, textureX, textureY); // Box 111
		bodyModel[110] = new ModelRendererTurbo(this, 163, 77, textureX, textureY); // Box 112
		bodyModel[111] = new ModelRendererTurbo(this, 163, 77, textureX, textureY); // Box 113

		bodyModel[0].addBox(0F, 0F, 0F, 64, 1, 1, 0F); // Box 0
		bodyModel[0].setRotationPoint(-31F, 0F, -11F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 2, 1, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 67
		bodyModel[1].setRotationPoint(-33F, 0F, -10F);

		bodyModel[2].addBox(0F, 0F, 0F, 6, 19, 1, 0F); // Box 68
		bodyModel[2].setRotationPoint(-31F, -20F, -11F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 2, 20, 1, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 70
		bodyModel[3].setRotationPoint(-33F, -20F, -11F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 2, 20, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 71
		bodyModel[4].setRotationPoint(-33F, -20F, 10F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 72
		bodyModel[5].setRotationPoint(-33F, 0F, -11F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F); // Box 73
		bodyModel[6].setRotationPoint(-33F, 0F, 10F);

		bodyModel[7].addBox(0F, 0F, 0F, 1, 20, 6, 0F); // Box 74
		bodyModel[7].setRotationPoint(-33F, -20F, -10F);

		bodyModel[8].addBox(0F, 0F, 0F, 1, 20, 6, 0F); // Box 75
		bodyModel[8].setRotationPoint(-33F, -20F, 4F);

		bodyModel[9].addBox(0F, 0F, 0F, 66, 1, 8, 0F); // Box 76
		bodyModel[9].setRotationPoint(-33F, -1F, -4F);

		bodyModel[10].addBox(0F, 0F, 0F, 64, 1, 1, 0F); // Box 77
		bodyModel[10].setRotationPoint(-31F, 0F, 10F);

		bodyModel[11].addBox(0F, 0F, 0F, 1, 2, 18, 0F); // Box 182
		bodyModel[11].setRotationPoint(-33F, -22F, -9F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 64, 2, 2, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 183
		bodyModel[12].setRotationPoint(-31F, -22F, -11F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 66, 1, 6, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 184
		bodyModel[13].setRotationPoint(-33F, -23F, -9F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 64, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 185
		bodyModel[14].setRotationPoint(-31F, -22F, 9F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 66, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 186
		bodyModel[15].setRotationPoint(-33F, -23F, 3F);

		bodyModel[16].addBox(0F, 0F, 0F, 66, 1, 6, 0F); // Box 187
		bodyModel[16].setRotationPoint(-33F, -23F, -3F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, -2F, -1F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 189
		bodyModel[17].setRotationPoint(-33F, -22F, -11F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 190
		bodyModel[18].setRotationPoint(-33F, -22F, 9F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 8, 19, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 191 door slide right
		bodyModel[19].setRotationPoint(-25F, -20F, -11F);

		bodyModel[20].addBox(0F, 0F, 0F, 37, 19, 1, 0F); // Box 192
		bodyModel[20].setRotationPoint(-17F, -20F, -11F);

		bodyModel[21].addBox(0F, 0F, 0F, 5, 19, 1, 0F); // Box 193
		bodyModel[21].setRotationPoint(28F, -20F, -11F);

		bodyModel[22].addBox(0F, 0F, 0F, 64, 1, 7, 0F); // Box 195
		bodyModel[22].setRotationPoint(-31F, -1F, -11F);

		bodyModel[23].addBox(0F, 0F, 0F, 64, 1, 7, 0F); // Box 196
		bodyModel[23].setRotationPoint(-31F, -1F, 4F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 8, 19, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 197
		bodyModel[24].setRotationPoint(20F, -20F, -11F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 8, 19, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 198
		bodyModel[25].setRotationPoint(20F, -20F, 10F);

		bodyModel[26].addBox(0F, 0F, 0F, 5, 19, 1, 0F); // Box 199
		bodyModel[26].setRotationPoint(28F, -20F, 10F);

		bodyModel[27].addBox(0F, 0F, 0F, 37, 19, 1, 0F); // Box 200
		bodyModel[27].setRotationPoint(-17F, -20F, 10F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 8, 19, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 201
		bodyModel[28].setRotationPoint(-25F, -20F, 10F);

		bodyModel[29].addBox(0F, 0F, 0F, 6, 19, 1, 0F); // Box 202
		bodyModel[29].setRotationPoint(-31F, -20F, 10F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 1, 19, 8, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 203
		bodyModel[30].setRotationPoint(-33F, -20F, -4F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 1, 19, 8, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 204
		bodyModel[31].setRotationPoint(32F, -20F, -4F);

		bodyModel[32].addBox(0F, 0F, 0F, 1, 19, 6, 0F); // Box 205
		bodyModel[32].setRotationPoint(32F, -20F, -10F);

		bodyModel[33].addBox(0F, 0F, 0F, 1, 19, 6, 0F); // Box 206
		bodyModel[33].setRotationPoint(32F, -20F, 4F);

		bodyModel[34].addBox(0F, 0F, 0F, 1, 2, 18, 0F); // Box 207
		bodyModel[34].setRotationPoint(32F, -22F, -9F);

		bodyModel[35].addBox(0F, 0F, 0F, 1, 9, 5, 0F); // Box 208
		bodyModel[35].setRotationPoint(-33.5F, -18F, -9.5F);

		bodyModel[36].addBox(0F, -1F, 0F, 1, 2, 5, 0F); // Box 209
		bodyModel[36].setRotationPoint(-33.25F, -3F, -9.5F);
		bodyModel[36].rotateAngleX = -0.31415927F;

		bodyModel[37].addBox(0F, 0F, 0F, 1, 2, 9, 0F); // Box 210
		bodyModel[37].setRotationPoint(-33.5F, -22.5F, -4.5F);

		bodyModel[38].addBox(0F, -1F, 0F, 1, 2, 5, 0F); // Box 211
		bodyModel[38].setRotationPoint(-33.25F, -1.5F, 4.5F);
		bodyModel[38].rotateAngleX = 0.31415927F;

		bodyModel[39].addShapeBox(0F, 0F, 0F, 64, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 212
		bodyModel[39].setRotationPoint(-31F, 0F, -4F);

		bodyModel[40].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Box 279
		bodyModel[40].setRotationPoint(32F, 0F, 4F);

		bodyModel[41].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Box 280
		bodyModel[41].setRotationPoint(32F, 0F, -10F);

		bodyModel[42].addBox(0F, 0F, 0F, 64, 1, 1, 0F); // Box 281 glow
		bodyModel[42].setRotationPoint(-32F, -22F, -9F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 64, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 282 glow
		bodyModel[43].setRotationPoint(-32F, -21F, -9F);

		bodyModel[44].addBox(0F, 0F, 0F, 64, 1, 1, 0F); // Box 283 glow
		bodyModel[44].setRotationPoint(-32F, -22F, 8F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 64, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 284 glow
		bodyModel[45].setRotationPoint(-32F, -21F, 8F);

		bodyModel[46].addBox(0F, 0F, 0F, 1, 3, 6, 0F); // Box 357
		bodyModel[46].setRotationPoint(-31F, 0F, -10F);

		bodyModel[47].addBox(0F, 0F, 0F, 1, 3, 6, 0F); // Box 358
		bodyModel[47].setRotationPoint(-31F, 0F, 4F);

		bodyModel[48].addBox(0F, 0F, 0F, 1, 1, 8, 0F); // Box 359
		bodyModel[48].setRotationPoint(-31F, 2F, -4F);

		bodyModel[49].addBox(0F, 0F, 0F, 2, 0, 20, 0F); // Box 360
		bodyModel[49].setRotationPoint(-33F, 3F, -10F);

		bodyModel[50].addBox(0F, 0F, 0F, 7, 3, 20, 0F); // Box 361
		bodyModel[50].setRotationPoint(-6F, 1F, -10F);

		bodyModel[51].addBox(0F, 0F, 0F, 4, 3, 20, 0F); // Box 362
		bodyModel[51].setRotationPoint(5F, 1F, -10F);

		bodyModel[52].addBox(0F, 0F, 0F, 2, 1, 20, 0F); // Box 363
		bodyModel[52].setRotationPoint(-18F, 0F, -10F);

		bodyModel[53].addBox(0F, 0F, 0F, 2, 1, 20, 0F); // Box 364
		bodyModel[53].setRotationPoint(19F, 0F, -10F);

		bodyModel[54].addBox(0F, 0F, 0F, 4, 2, 3, 0F); // Box 206
		bodyModel[54].setRotationPoint(-35F, 0F, -1.5F);

		bodyModel[55].addBox(0F, 0F, 0F, 2, 2, 3, 0F); // Box 366
		bodyModel[55].setRotationPoint(33F, 0F, -1.5F);

		bodyModel[56].addBox(0F, 0F, 0F, 12, 1, 8, 0F); // Box 186
		bodyModel[56].setRotationPoint(18F, -24F, -4F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 10, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 109
		bodyModel[57].setRotationPoint(32.3F, -27.5F, 1F);
		bodyModel[57].rotateAngleY = -3.14159265F;
		bodyModel[57].rotateAngleZ = -0.27925268F;

		bodyModel[58].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, -0.5F, -2F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F); // Box 110
		bodyModel[58].setRotationPoint(33F, -27.5F, 3F);
		bodyModel[58].rotateAngleY = -3.14159265F;
		bodyModel[58].rotateAngleZ = 0.78539816F;

		bodyModel[59].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 118
		bodyModel[59].setRotationPoint(24F, -34F, 2.5F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 119
		bodyModel[60].setRotationPoint(24F, -33.5F, -5.5F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 149
		bodyModel[61].setRotationPoint(24F, -34F, -5.5F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 150
		bodyModel[62].setRotationPoint(24F, -34.5F, -2.5F);

		bodyModel[63].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 227
		bodyModel[63].setRotationPoint(17F, -24.5F, -5F);

		bodyModel[64].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 228
		bodyModel[64].setRotationPoint(29F, -24.5F, -5F);

		bodyModel[65].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 229
		bodyModel[65].setRotationPoint(29F, -24.5F, 4F);

		bodyModel[66].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 230
		bodyModel[66].setRotationPoint(17F, -24.5F, 4F);

		bodyModel[67].addBox(0F, 0F, 0F, 10, 1, 1, 0F); // Box 231
		bodyModel[67].setRotationPoint(19F, -24.5F, 4F);

		bodyModel[68].addBox(0F, 0F, 0F, 10, 1, 1, 0F); // Box 232
		bodyModel[68].setRotationPoint(19F, -24.5F, -5F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 383
		bodyModel[69].setRotationPoint(26F, -34F, -6.5F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 384
		bodyModel[70].setRotationPoint(26F, -33.5F, -6.5F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 385
		bodyModel[71].setRotationPoint(26F, -34.5F, -3.5F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 387
		bodyModel[72].setRotationPoint(26F, -34F, 3.5F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 388
		bodyModel[73].setRotationPoint(24F, -33.5F, 4.5F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 389
		bodyModel[74].setRotationPoint(26F, -33.5F, 5.5F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, -0.5F, 2F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 390
		bodyModel[75].setRotationPoint(33F, -27.5F, -2F);
		bodyModel[75].rotateAngleY = -3.14159265F;
		bodyModel[75].rotateAngleZ = 0.78539816F;

		bodyModel[76].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 391
		bodyModel[76].setRotationPoint(25F, -34.5F, -2.5F);

		bodyModel[77].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Box 77
		bodyModel[77].setRotationPoint(-32F, -1F, -10F);

		bodyModel[78].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Box 78
		bodyModel[78].setRotationPoint(-32F, -1F, 4F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 11, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 80
		bodyModel[79].setRotationPoint(-16F, -10F, -10F);

		bodyModel[80].addBox(0F, 0F, 0F, 11, 1, 6, 0F); // Box 81
		bodyModel[80].setRotationPoint(-16F, -4F, -10F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 1, 6, 6, 0F,0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 82
		bodyModel[81].setRotationPoint(-17F, -9F, -10F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 1, 6, 6, 0F,0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 84
		bodyModel[82].setRotationPoint(-5F, -9F, -10F);

		bodyModel[83].addBox(0F, 0F, 0F, 1, 21, 0, 0F); // Box 85
		bodyModel[83].setRotationPoint(-17F, -22F, -3.99F);

		bodyModel[84].addBox(0F, 0F, 0F, 1, 21, 0, 0F); // Box 86
		bodyModel[84].setRotationPoint(-5F, -22F, -3.99F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 11, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 87
		bodyModel[85].setRotationPoint(-4F, -10F, -10F);

		bodyModel[86].addBox(0F, 0F, 0F, 11, 1, 6, 0F); // Box 88
		bodyModel[86].setRotationPoint(-4F, -4F, -10F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 1, 6, 6, 0F,0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 89
		bodyModel[87].setRotationPoint(7F, -9F, -10F);

		bodyModel[88].addBox(0F, 0F, 0F, 1, 21, 0, 0F); // Box 90
		bodyModel[88].setRotationPoint(7F, -22F, -3.99F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 11, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 91
		bodyModel[89].setRotationPoint(8F, -10F, -10F);

		bodyModel[90].addBox(0F, 0F, 0F, 11, 1, 6, 0F); // Box 92
		bodyModel[90].setRotationPoint(8F, -4F, -10F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 1, 6, 6, 0F,0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 93
		bodyModel[91].setRotationPoint(19F, -9F, -10F);

		bodyModel[92].addBox(0F, 0F, 0F, 1, 21, 0, 0F); // Box 94
		bodyModel[92].setRotationPoint(19F, -22F, -3.99F);

		bodyModel[93].addBox(0F, 0F, 0F, 11, 1, 6, 0F); // Box 95
		bodyModel[93].setRotationPoint(-4F, -4F, 4F);

		bodyModel[94].addBox(0F, 0F, 0F, 11, 1, 6, 0F); // Box 96
		bodyModel[94].setRotationPoint(8F, -4F, 4F);

		bodyModel[95].addBox(0F, 0F, 0F, 11, 1, 6, 0F); // Box 97
		bodyModel[95].setRotationPoint(-16F, -4F, 4F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 11, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 98
		bodyModel[96].setRotationPoint(-16F, -10F, 9F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 11, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 99
		bodyModel[97].setRotationPoint(-4F, -10F, 9F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 11, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 100
		bodyModel[98].setRotationPoint(8F, -10F, 9F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 1, 6, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 101
		bodyModel[99].setRotationPoint(7F, -9F, 4F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 1, 6, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 102
		bodyModel[100].setRotationPoint(19F, -9F, 4F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 1, 6, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 103
		bodyModel[101].setRotationPoint(-5F, -9F, 4F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 1, 6, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 104
		bodyModel[102].setRotationPoint(-17F, -9F, 4F);

		bodyModel[103].addBox(0F, 0F, 0F, 1, 21, 0, 0F); // Box 105
		bodyModel[103].setRotationPoint(7F, -22F, 3.99F);

		bodyModel[104].addBox(0F, 0F, 0F, 1, 21, 0, 0F); // Box 106
		bodyModel[104].setRotationPoint(19F, -22F, 3.99F);

		bodyModel[105].addBox(0F, 0F, 0F, 1, 21, 0, 0F); // Box 107
		bodyModel[105].setRotationPoint(-17F, -22F, 3.99F);

		bodyModel[106].addBox(0F, 0F, 0F, 1, 21, 0, 0F); // Box 108
		bodyModel[106].setRotationPoint(-5F, -22F, 3.99F);

		bodyModel[107].addBox(0F, 0F, 0F, 2, 13, 4, 0F); // Box 109
		bodyModel[107].setRotationPoint(-32F, -17F, -9F);

		bodyModel[108].addBox(0F, 0F, 0F, 2, 5, 4, 0F); // Box 110
		bodyModel[108].setRotationPoint(-32F, -8F, 5.5F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 111
		bodyModel[109].setRotationPoint(-32F, -9F, 5.5F);

		bodyModel[110].addBox(0F, 0F, 0F, 64, 2, 0, 0F); // Box 112
		bodyModel[110].setRotationPoint(-32F, -22F, -3F);

		bodyModel[111].addBox(0F, 0F, 0F, 64, 2, 0, 0F); // Box 113
		bodyModel[111].setRotationPoint(-32F, -22F, 3F);
	}

	ModelPCHBogie theBogie = new ModelPCHBogie();

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		for(ModelRendererTurbo m :bodyModel) {
			if(m.boxName.equals("light")){
				Minecraft.getMinecraft().entityRenderer.disableLightmap(1D);
			}
			m.render(f5);
			if(m.boxName.equals("light")){
				Minecraft.getMinecraft().entityRenderer.enableLightmap(1D);
			}
		}
		for(int i = 0; i < 112; i++)
		{
			if (i == 109) {

			}
			bodyModel[i].render(f5);
		}
		Tessellator.bindTexture(new ResourceLocation("tc:textures/trains/pch120_bogie.png"));
		GL11.glPushMatrix();
		GL11.glTranslatef(1.3F ,0.1F,0F);
		//GL11.glScalef(0.9f,0.9f,0.8f);
		theBogie.render(entity,f,f1,f2,f3,f4,f5);
		GL11.glPopMatrix();

		GL11.glPushMatrix();
		GL11.glTranslated(-1F,0.1F,0);
		theBogie.render(entity,f,f1,f2,f3,f4,f5);
		GL11.glPopMatrix();
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
	{
	}

	public ModelRendererTurbo pch120commuteModel[];
}