//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 02.05.2019 - 22:29:46
// Last changed on: 02.05.2019 - 22:29:46

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

public class ModelFOLM1B extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelFOLM1B() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[145];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 4
		bodyModel[2] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 5
		bodyModel[3] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 9
		bodyModel[4] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 11
		bodyModel[5] = new ModelRendererTurbo(this, 281, 17, textureX, textureY); // Box 15
		bodyModel[6] = new ModelRendererTurbo(this, 81, 17, textureX, textureY); // Box 18
		bodyModel[7] = new ModelRendererTurbo(this, 137, 33, textureX, textureY); // Box 19
		bodyModel[8] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 20
		bodyModel[9] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 23
		bodyModel[10] = new ModelRendererTurbo(this, 257, 41, textureX, textureY); // Box 24
		bodyModel[11] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 25
		bodyModel[12] = new ModelRendererTurbo(this, 353, 41, textureX, textureY); // Box 26
		bodyModel[13] = new ModelRendererTurbo(this, 409, 41, textureX, textureY); // Box 27
		bodyModel[14] = new ModelRendererTurbo(this, 113, 65, textureX, textureY); // Box 28
		bodyModel[15] = new ModelRendererTurbo(this, 41, 57, textureX, textureY); // Box 29
		bodyModel[16] = new ModelRendererTurbo(this, 201, 65, textureX, textureY); // Box 30
		bodyModel[17] = new ModelRendererTurbo(this, 441, 65, textureX, textureY); // Box 33
		bodyModel[18] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 34
		bodyModel[19] = new ModelRendererTurbo(this, 257, 81, textureX, textureY); // Box 35
		bodyModel[20] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 36
		bodyModel[21] = new ModelRendererTurbo(this, 97, 81, textureX, textureY); // Box 37
		bodyModel[22] = new ModelRendererTurbo(this, 385, 89, textureX, textureY); // Box 38
		bodyModel[23] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 40
		bodyModel[24] = new ModelRendererTurbo(this, 113, 17, textureX, textureY); // Box 41
		bodyModel[25] = new ModelRendererTurbo(this, 385, 41, textureX, textureY); // Box 42
		bodyModel[26] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 43
		bodyModel[27] = new ModelRendererTurbo(this, 273, 25, textureX, textureY); // Box 44
		bodyModel[28] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 45
		bodyModel[29] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 46
		bodyModel[30] = new ModelRendererTurbo(this, 113, 33, textureX, textureY); // Box 47
		bodyModel[31] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 48
		bodyModel[32] = new ModelRendererTurbo(this, 233, 33, textureX, textureY); // Box 44
		bodyModel[33] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 44
		bodyModel[34] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 45
		bodyModel[35] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 46
		bodyModel[36] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 47
		bodyModel[37] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 48
		bodyModel[38] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 49
		bodyModel[39] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 50
		bodyModel[40] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 51
		bodyModel[41] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 52
		bodyModel[42] = new ModelRendererTurbo(this, 265, 33, textureX, textureY); // Box 53
		bodyModel[43] = new ModelRendererTurbo(this, 41, 41, textureX, textureY); // Box 54
		bodyModel[44] = new ModelRendererTurbo(this, 233, 41, textureX, textureY); // Box 55
		bodyModel[45] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 56
		bodyModel[46] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 57
		bodyModel[47] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 58
		bodyModel[48] = new ModelRendererTurbo(this, 449, 9, textureX, textureY); // Box 59
		bodyModel[49] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 60
		bodyModel[50] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 61
		bodyModel[51] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 62
		bodyModel[52] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 63
		bodyModel[53] = new ModelRendererTurbo(this, 81, 9, textureX, textureY); // Box 64
		bodyModel[54] = new ModelRendererTurbo(this, 457, 9, textureX, textureY); // Box 65
		bodyModel[55] = new ModelRendererTurbo(this, 89, 17, textureX, textureY); // Box 66
		bodyModel[56] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 67
		bodyModel[57] = new ModelRendererTurbo(this, 145, 33, textureX, textureY); // Box 68
		bodyModel[58] = new ModelRendererTurbo(this, 465, 9, textureX, textureY); // Box 69
		bodyModel[59] = new ModelRendererTurbo(this, 505, 9, textureX, textureY); // Box 70
		bodyModel[60] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Box 71
		bodyModel[61] = new ModelRendererTurbo(this, 337, 41, textureX, textureY); // Box 72
		bodyModel[62] = new ModelRendererTurbo(this, 441, 41, textureX, textureY); // Box 73
		bodyModel[63] = new ModelRendererTurbo(this, 473, 41, textureX, textureY); // Box 74
		bodyModel[64] = new ModelRendererTurbo(this, 65, 17, textureX, textureY); // Box 75
		bodyModel[65] = new ModelRendererTurbo(this, 41, 49, textureX, textureY); // Box 80
		bodyModel[66] = new ModelRendererTurbo(this, 441, 49, textureX, textureY); // Box 82
		bodyModel[67] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 83
		bodyModel[68] = new ModelRendererTurbo(this, 113, 17, textureX, textureY); // Box 84
		bodyModel[69] = new ModelRendererTurbo(this, 353, 49, textureX, textureY); // Box 85
		bodyModel[70] = new ModelRendererTurbo(this, 385, 9, textureX, textureY); // Box 86
		bodyModel[71] = new ModelRendererTurbo(this, 385, 41, textureX, textureY); // Box 87
		bodyModel[72] = new ModelRendererTurbo(this, 417, 41, textureX, textureY); // Box 88
		bodyModel[73] = new ModelRendererTurbo(this, 481, 49, textureX, textureY); // Box 89
		bodyModel[74] = new ModelRendererTurbo(this, 497, 49, textureX, textureY); // Box 90
		bodyModel[75] = new ModelRendererTurbo(this, 177, 65, textureX, textureY); // Box 91
		bodyModel[76] = new ModelRendererTurbo(this, 145, 17, textureX, textureY); // Box 92
		bodyModel[77] = new ModelRendererTurbo(this, 505, 17, textureX, textureY); // Box 93
		bodyModel[78] = new ModelRendererTurbo(this, 161, 25, textureX, textureY); // Box 94
		bodyModel[79] = new ModelRendererTurbo(this, 177, 25, textureX, textureY); // Box 95
		bodyModel[80] = new ModelRendererTurbo(this, 233, 25, textureX, textureY); // Box 96
		bodyModel[81] = new ModelRendererTurbo(this, 505, 25, textureX, textureY); // Box 97
		bodyModel[82] = new ModelRendererTurbo(this, 385, 57, textureX, textureY); // Box 98
		bodyModel[83] = new ModelRendererTurbo(this, 17, 33, textureX, textureY); // Box 99
		bodyModel[84] = new ModelRendererTurbo(this, 41, 33, textureX, textureY); // Box 100
		bodyModel[85] = new ModelRendererTurbo(this, 49, 33, textureX, textureY); // Box 101
		bodyModel[86] = new ModelRendererTurbo(this, 505, 33, textureX, textureY); // Box 102
		bodyModel[87] = new ModelRendererTurbo(this, 137, 41, textureX, textureY); // Box 103
		bodyModel[88] = new ModelRendererTurbo(this, 17, 41, textureX, textureY); // Box 104
		bodyModel[89] = new ModelRendererTurbo(this, 369, 41, textureX, textureY); // Box 105
		bodyModel[90] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 106
		bodyModel[91] = new ModelRendererTurbo(this, 137, 49, textureX, textureY); // Box 107
		bodyModel[92] = new ModelRendererTurbo(this, 233, 49, textureX, textureY); // Box 263
		bodyModel[93] = new ModelRendererTurbo(this, 441, 57, textureX, textureY); // Box 265
		bodyModel[94] = new ModelRendererTurbo(this, 505, 41, textureX, textureY); // Box 266
		bodyModel[95] = new ModelRendererTurbo(this, 369, 49, textureX, textureY); // Box 267
		bodyModel[96] = new ModelRendererTurbo(this, 73, 73, textureX, textureY); // Box 268
		bodyModel[97] = new ModelRendererTurbo(this, 193, 65, textureX, textureY); // Box 269
		bodyModel[98] = new ModelRendererTurbo(this, 105, 97, textureX, textureY); // Box 271
		bodyModel[99] = new ModelRendererTurbo(this, 33, 121, textureX, textureY); // Box 272
		bodyModel[100] = new ModelRendererTurbo(this, 105, 73, textureX, textureY); // Box 275
		bodyModel[101] = new ModelRendererTurbo(this, 193, 73, textureX, textureY); // Box 305
		bodyModel[102] = new ModelRendererTurbo(this, 177, 81, textureX, textureY); // Box 309
		bodyModel[103] = new ModelRendererTurbo(this, 73, 65, textureX, textureY, "lamp"); // Box 311 lamp
		bodyModel[104] = new ModelRendererTurbo(this, 305, 81, textureX, textureY); // Box 313
		bodyModel[105] = new ModelRendererTurbo(this, 305, 89, textureX, textureY); // Box 314
		bodyModel[106] = new ModelRendererTurbo(this, 329, 97, textureX, textureY); // Box 316
		bodyModel[107] = new ModelRendererTurbo(this, 489, 65, textureX, textureY); // Box 119
		bodyModel[108] = new ModelRendererTurbo(this, 489, 73, textureX, textureY); // Box 120
		bodyModel[109] = new ModelRendererTurbo(this, 113, 81, textureX, textureY); // Box 182
		bodyModel[110] = new ModelRendererTurbo(this, 489, 81, textureX, textureY); // Box 183
		bodyModel[111] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 184
		bodyModel[112] = new ModelRendererTurbo(this, 361, 57, textureX, textureY); // Box 185
		bodyModel[113] = new ModelRendererTurbo(this, 193, 113, textureX, textureY); // Box 186
		bodyModel[114] = new ModelRendererTurbo(this, 305, 121, textureX, textureY); // Box 250
		bodyModel[115] = new ModelRendererTurbo(this, 257, 49, textureX, textureY); // Box 252 smoke
		bodyModel[116] = new ModelRendererTurbo(this, 377, 97, textureX, textureY); // Box 253
		bodyModel[117] = new ModelRendererTurbo(this, 425, 57, textureX, textureY); // Box 254
		bodyModel[118] = new ModelRendererTurbo(this, 57, 105, textureX, textureY); // Box 255
		bodyModel[119] = new ModelRendererTurbo(this, 193, 65, textureX, textureY); // Box 256
		bodyModel[120] = new ModelRendererTurbo(this, 233, 113, textureX, textureY); // Box 257
		bodyModel[121] = new ModelRendererTurbo(this, 441, 113, textureX, textureY); // Box 258
		bodyModel[122] = new ModelRendererTurbo(this, 329, 113, textureX, textureY); // Box 265
		bodyModel[123] = new ModelRendererTurbo(this, 329, 97, textureX, textureY); // Box 266
		bodyModel[124] = new ModelRendererTurbo(this, 353, 113, textureX, textureY); // Box 267 liveryimg 1
		bodyModel[125] = new ModelRendererTurbo(this, 137, 121, textureX, textureY); // Box 268 liveryimg 1
		bodyModel[126] = new ModelRendererTurbo(this, 161, 121, textureX, textureY); // Box 269 liveryimg 2
		bodyModel[127] = new ModelRendererTurbo(this, 185, 121, textureX, textureY); // Box 270 liveryimg 2
		bodyModel[128] = new ModelRendererTurbo(this, 57, 113, textureX, textureY); // Box 271
		bodyModel[129] = new ModelRendererTurbo(this, 193, 113, textureX, textureY); // Box 272
		bodyModel[130] = new ModelRendererTurbo(this, 233, 113, textureX, textureY); // Box 273
		bodyModel[131] = new ModelRendererTurbo(this, 497, 113, textureX, textureY); // Box 274
		bodyModel[132] = new ModelRendererTurbo(this, 450, 134, textureX, textureY); // Box 157
		bodyModel[133] = new ModelRendererTurbo(this, 450, 157, textureX, textureY); // Box 157
		bodyModel[134] = new ModelRendererTurbo(this, 397, 135, textureX, textureY); // Box 191
		bodyModel[135] = new ModelRendererTurbo(this, 30, 28, textureX, textureY, "lamp"); // Box 162 light
		bodyModel[136] = new ModelRendererTurbo(this, 430, 103, textureX, textureY); // Box 165
		bodyModel[137] = new ModelRendererTurbo(this, 163, 92, textureX, textureY, "lamp"); // Box 162 light
		bodyModel[138] = new ModelRendererTurbo(this, 126, 92, textureX, textureY); // Box 165
		bodyModel[139] = new ModelRendererTurbo(this, 6, 172, textureX, textureY); // Box 196
		bodyModel[140] = new ModelRendererTurbo(this, 97, 81, textureX, textureY); // Box 188
		bodyModel[141] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 189
		bodyModel[142] = new ModelRendererTurbo(this, 73, 65, textureX, textureY, "lamp"); // Box 190 lamp
		bodyModel[143] = new ModelRendererTurbo(this, 397, 135, textureX, textureY); // Box 191
		bodyModel[144] = new ModelRendererTurbo(this, 6, 172, textureX, textureY); // Box 192

		bodyModel[0].addBox(0F, 0F, 0F, 13, 2, 22, 0F); // Box 0
		bodyModel[0].setRotationPoint(-37F, -24F, -11F);

		bodyModel[1].addBox(0F, 0F, 0F, 4, 4, 1, 0F); // Box 4
		bodyModel[1].setRotationPoint(-28F, -22F, -11F);

		bodyModel[2].addBox(0F, 0F, 0F, 13, 18, 1, 0F); // Box 5
		bodyModel[2].setRotationPoint(-37F, -18F, -11F);

		bodyModel[3].addBox(0F, 0F, 0F, 13, 18, 1, 0F); // Box 9
		bodyModel[3].setRotationPoint(-37F, -18F, 10F);

		bodyModel[4].addBox(0F, 0F, 0F, 4, 4, 1, 0F); // Box 11
		bodyModel[4].setRotationPoint(-28F, -22F, 10F);

		bodyModel[5].addBox(0F, 0F, 0F, 83, 1, 22, 0F); // Box 15
		bodyModel[5].setRotationPoint(-37F, 0F, -11F);

		bodyModel[6].addBox(0F, 0F, 0F, 2, 25, 23, 0F); // Box 18
		bodyModel[6].setRotationPoint(-24F, -24.5F, -11.5F);

		bodyModel[7].addBox(0F, 0F, 0F, 36, 2, 22, 0F); // Box 19
		bodyModel[7].setRotationPoint(-22F, -24F, -11F);

		bodyModel[8].addBox(0F, 0F, 0F, 7, 18, 22, 0F); // Box 20
		bodyModel[8].setRotationPoint(-22F, -18F, -11F);

		bodyModel[9].addBox(0F, 0F, 0F, 20, 4, 5, 0F); // Box 23
		bodyModel[9].setRotationPoint(-22F, -22F, -11F);

		bodyModel[10].addBox(0F, 0F, 0F, 33, 22, 12, 0F); // Box 24
		bodyModel[10].setRotationPoint(-19F, -22F, -6F);

		bodyModel[11].addBox(0F, 0F, 0F, 20, 4, 5, 0F); // Box 25
		bodyModel[11].setRotationPoint(-22F, -22F, 6F);

		bodyModel[12].addBox(0F, 0F, 0F, 2, 25, 23, 0F); // Box 26
		bodyModel[12].setRotationPoint(14F, -24.5F, -11.5F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 2, 22, 22, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 27
		bodyModel[13].setRotationPoint(16F, -22F, -11F);

		bodyModel[14].addBox(0F, 0F, 0F, 18, 2, 22, 0F); // Box 28
		bodyModel[14].setRotationPoint(16F, -24F, -11F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 2, 22, 22, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 29
		bodyModel[15].setRotationPoint(18F, -22F, -11F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 2, 22, 22, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 30
		bodyModel[16].setRotationPoint(20F, -22F, -11F);

		bodyModel[17].addBox(0F, 0F, 0F, 12, 22, 22, 0F); // Box 33
		bodyModel[17].setRotationPoint(22F, -22F, -11F);

		bodyModel[18].addBox(0F, 0F, 0F, 2, 25, 23, 0F); // Box 34
		bodyModel[18].setRotationPoint(34F, -24.5F, -11.5F);

		bodyModel[19].addBox(0F, 0F, 0F, 10, 22, 22, 0F); // Box 35
		bodyModel[19].setRotationPoint(36F, -22F, -11F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 1, 25, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 36
		bodyModel[20].setRotationPoint(46F, -24F, -11F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 1, 25, 11, 0F,0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 37
		bodyModel[21].setRotationPoint(46F, -24F, 0F);

		bodyModel[22].addBox(0F, 0F, 0F, 10, 2, 22, 0F); // Box 38
		bodyModel[22].setRotationPoint(36F, -24F, -11F);

		bodyModel[23].addBox(0F, 0F, 0F, 10, 6, 1, 0F); // Box 40
		bodyModel[23].setRotationPoint(23F, -7F, 10.5F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 10, 1, 10, 0F,-9F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[24].setRotationPoint(1F, -25F, -10F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 10, 1, 10, 0F,0F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F); // Box 42
		bodyModel[25].setRotationPoint(1F, -25F, 0F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,-2F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -2F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, -1F, 0F); // Box 43
		bodyModel[26].setRotationPoint(-14F, -16F, -9F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 12, 3, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 44
		bodyModel[27].setRotationPoint(-11F, -16F, -9F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, -1F); // Box 45
		bodyModel[28].setRotationPoint(3F, -14F, -9F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 1, 6, 3, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 46
		bodyModel[29].setRotationPoint(1F, -22F, -9F);

		bodyModel[30].addBox(0F, 0F, 0F, 14, 3, 1, 0F); // Box 47
		bodyModel[30].setRotationPoint(-11F, -16F, -8F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 48
		bodyModel[31].setRotationPoint(-13F, -16F, -8F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 11, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 44
		bodyModel[32].setRotationPoint(-10F, -16F, -7F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 1, 8, 3, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 44
		bodyModel[33].setRotationPoint(3F, -22F, -9F);

		bodyModel[34].addBox(0F, 0F, 0F, 1, 6, 3, 0F); // Box 45
		bodyModel[34].setRotationPoint(2F, -22F, -9F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 46
		bodyModel[35].setRotationPoint(1F, -16F, -9F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 47
		bodyModel[36].setRotationPoint(2F, -16F, -9F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 48
		bodyModel[37].setRotationPoint(2F, -16F, -7F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 49
		bodyModel[38].setRotationPoint(1F, -16F, -7F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 50
		bodyModel[39].setRotationPoint(-11F, -16F, -7F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 51
		bodyModel[40].setRotationPoint(-12F, -16F, -9F);

		bodyModel[41].addBox(0F, 0F, 0F, 1, 3, 2, 0F); // Box 52
		bodyModel[41].setRotationPoint(-12F, -16F, -8F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 16, 3, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 53
		bodyModel[42].setRotationPoint(-11F, -12F, -9F);

		bodyModel[43].addBox(0F, 0F, 0F, 18, 3, 1, 0F); // Box 54
		bodyModel[43].setRotationPoint(-11F, -12F, -8F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 15, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 55
		bodyModel[44].setRotationPoint(-10F, -12F, -7F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 56
		bodyModel[45].setRotationPoint(-12F, -12F, -9F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 57
		bodyModel[46].setRotationPoint(-13F, -12F, -8F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,-2F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -2F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, -1F, 0F); // Box 58
		bodyModel[47].setRotationPoint(-14F, -12F, -9F);

		bodyModel[48].addBox(0F, 0F, 0F, 1, 3, 2, 0F); // Box 59
		bodyModel[48].setRotationPoint(-12F, -12F, -8F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 60
		bodyModel[49].setRotationPoint(-11F, -12F, -7F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 61
		bodyModel[50].setRotationPoint(5F, -12F, -9F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 62
		bodyModel[51].setRotationPoint(5F, -12F, -7F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 63
		bodyModel[52].setRotationPoint(6F, -12F, -7F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, -1F); // Box 64
		bodyModel[53].setRotationPoint(7F, -10F, -9F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 65
		bodyModel[54].setRotationPoint(6F, -12F, -9F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 1, 10, 3, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 66
		bodyModel[55].setRotationPoint(5F, -22F, -9F);

		bodyModel[56].addBox(0F, 0F, 0F, 1, 10, 3, 0F); // Box 67
		bodyModel[56].setRotationPoint(6F, -22F, -9F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 1, 12, 3, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 68
		bodyModel[57].setRotationPoint(7F, -22F, -9F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F); // Box 69
		bodyModel[58].setRotationPoint(-13F, -16F, 8F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 70
		bodyModel[59].setRotationPoint(-11F, -16F, 6F);

		bodyModel[60].addBox(0F, 0F, 0F, 1, 3, 2, 0F); // Box 71
		bodyModel[60].setRotationPoint(-12F, -16F, 6F);

		bodyModel[61].addBox(0F, 0F, 0F, 14, 3, 1, 0F); // Box 72
		bodyModel[61].setRotationPoint(-11F, -16F, 7F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 12, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 73
		bodyModel[62].setRotationPoint(-11F, -16F, 8F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 11, 3, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[63].setRotationPoint(-10F, -16F, 6F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 75
		bodyModel[64].setRotationPoint(-13F, -16F, 6F);

		bodyModel[65].addBox(0F, 0F, 0F, 18, 3, 1, 0F); // Box 80
		bodyModel[65].setRotationPoint(-11F, -12F, 7F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 15, 3, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 82
		bodyModel[66].setRotationPoint(-10F, -12F, 6F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 83
		bodyModel[67].setRotationPoint(1F, -16F, 6F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 84
		bodyModel[68].setRotationPoint(2F, -16F, 6F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 1, 8, 3, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 85
		bodyModel[69].setRotationPoint(3F, -22F, 6F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, -1F); // Box 86
		bodyModel[70].setRotationPoint(3F, -14F, 6F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 1, 6, 3, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 87
		bodyModel[71].setRotationPoint(1F, -22F, 6F);

		bodyModel[72].addBox(0F, 0F, 0F, 1, 6, 3, 0F); // Box 88
		bodyModel[72].setRotationPoint(2F, -22F, 6F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 1, 10, 3, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 89
		bodyModel[73].setRotationPoint(5F, -22F, 6F);

		bodyModel[74].addBox(0F, 0F, 0F, 1, 10, 3, 0F); // Box 90
		bodyModel[74].setRotationPoint(6F, -22F, 6F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 1, 12, 3, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 91
		bodyModel[75].setRotationPoint(7F, -22F, 6F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 92
		bodyModel[76].setRotationPoint(6F, -12F, 6F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 93
		bodyModel[77].setRotationPoint(5F, -12F, 6F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, -1F); // Box 94
		bodyModel[78].setRotationPoint(7F, -10F, 6F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 95
		bodyModel[79].setRotationPoint(5F, -12F, 8F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 96
		bodyModel[80].setRotationPoint(6F, -12F, 8F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 97
		bodyModel[81].setRotationPoint(-12F, -16F, 8F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 16, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 98
		bodyModel[82].setRotationPoint(-11F, -12F, 8F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 99
		bodyModel[83].setRotationPoint(1F, -16F, 8F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 100
		bodyModel[84].setRotationPoint(2F, -16F, 8F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F); // Box 101
		bodyModel[85].setRotationPoint(-13F, -12F, 8F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 102
		bodyModel[86].setRotationPoint(-13F, -12F, 6F);

		bodyModel[87].addBox(0F, 0F, 0F, 1, 3, 2, 0F); // Box 103
		bodyModel[87].setRotationPoint(-12F, -12F, 6F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 104
		bodyModel[88].setRotationPoint(-11F, -12F, 6F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 105
		bodyModel[89].setRotationPoint(-12F, -12F, 8F);

		bodyModel[90].addBox(0F, 0F, 0F, 8, 4, 1, 0F); // Box 106
		bodyModel[90].setRotationPoint(37F, -20F, 10.5F);

		bodyModel[91].addBox(0F, 0F, 0F, 8, 4, 1, 0F); // Box 107
		bodyModel[91].setRotationPoint(37F, -20F, -11.5F);

		bodyModel[92].addBox(0F, 0F, 0F, 8, 2, 3, 0F); // Box 263
		bodyModel[92].setRotationPoint(-43F, 1F, -1.5F);

		bodyModel[93].addBox(0F, 0F, 0F, 14, 2, 2, 0F); // Box 265
		bodyModel[93].setRotationPoint(-15F, -4F, -8F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 266
		bodyModel[94].setRotationPoint(-1F, -3.5F, -7.5F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 267
		bodyModel[95].setRotationPoint(-1F, -3.5F, 6.5F);

		bodyModel[96].addBox(0F, 0F, 0F, 14, 2, 2, 0F); // Box 268
		bodyModel[96].setRotationPoint(-15F, -4F, 6F);

		bodyModel[97].addBox(0F, 0F, 0F, 6, 1, 6, 0F); // Box 269
		bodyModel[97].setRotationPoint(6F, -24.5F, -3F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 30, 1, 22, 0F,-1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 271
		bodyModel[98].setRotationPoint(-11F, 1F, -11F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 30, 2, 22, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, -1F, 0F, -2F); // Box 272
		bodyModel[99].setRotationPoint(-11F, 5F, -11F);

		bodyModel[100].addBox(0F, 0F, 0F, 6, 1, 6, 0F); // Box 275
		bodyModel[100].setRotationPoint(-26F, 1F, -3F);

		bodyModel[101].addBox(0F, 0F, 0F, 6, 1, 6, 0F); // Box 305
		bodyModel[101].setRotationPoint(29F, 1F, -3F);

		bodyModel[102].addBox(0F, 0F, 0F, 9, 2, 3, 0F); // Box 309
		bodyModel[102].setRotationPoint(43F, 1F, -1.5F);

		bodyModel[103].addBox(0F, 0F, 0F, 1, 3, 3, 0F); // Box 311 lamp
		bodyModel[103].setRotationPoint(47.5F, -22F, -1.5F);

		bodyModel[104].addBox(0F, 0F, 0F, 21, 1, 2, 0F); // Box 313
		bodyModel[104].setRotationPoint(-36F, -25F, -8F);

		bodyModel[105].addBox(0F, 0F, 0F, 21, 1, 2, 0F); // Box 314
		bodyModel[105].setRotationPoint(-36F, -25F, 6F);

		bodyModel[106].addBox(0F, 0F, 0F, 16, 1, 10, 0F); // Box 316
		bodyModel[106].setRotationPoint(28F, -25F, -5F);

		bodyModel[107].addBox(0F, 0F, 0F, 9, 4, 1, 0F); // Box 119
		bodyModel[107].setRotationPoint(-37F, -22F, -11F);

		bodyModel[108].addBox(0F, 0F, 0F, 9, 4, 1, 0F); // Box 120
		bodyModel[108].setRotationPoint(-37F, -22F, 10F);

		bodyModel[109].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 182
		bodyModel[109].setRotationPoint(-34F, -25F, -2F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 8, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 6F, 0F, 0F, 0F); // Box 183
		bodyModel[110].setRotationPoint(-15F, -25F, -8F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 8, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, -6F, 0F, 0F, 0F); // Box 184
		bodyModel[111].setRotationPoint(-15F, -25F, 6F);

		bodyModel[112].addBox(0F, 0F, 0F, 2, 1, 4, 0F); // Box 185
		bodyModel[112].setRotationPoint(-7F, -25F, -2F);

		bodyModel[113].addBox(0F, 0F, 0F, 7, 3, 21, 0F); // Box 186
		bodyModel[113].setRotationPoint(7F, -3F, -10.5F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 30, 3, 22, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 250
		bodyModel[114].setRotationPoint(-11F, 2F, -11F);

		bodyModel[115].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 252 smoke
		bodyModel[115].setRotationPoint(8F, -24F, -1F);

		bodyModel[116].addBox(0F, 0F, 0F, 4, 2, 2, 0F); // Box 253
		bodyModel[116].setRotationPoint(10F, -7F, 6F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 254
		bodyModel[117].setRotationPoint(9F, -6.5F, 6.5F);

		bodyModel[118].addBox(0F, 0F, 0F, 4, 2, 2, 0F); // Box 255
		bodyModel[118].setRotationPoint(10F, -7F, -8F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 256
		bodyModel[119].setRotationPoint(9F, -6.5F, -7.5F);

		bodyModel[120].addBox(0F, 0F, 0F, 3, 3, 13, 0F); // Box 257
		bodyModel[120].setRotationPoint(2F, -4F, -6.5F);

		bodyModel[121].addBox(0F, 0F, 0F, 3, 3, 13, 0F); // Box 258
		bodyModel[121].setRotationPoint(2F, -8F, -6.5F);

		bodyModel[122].addBox(0F, 0F, 0F, 10, 6, 1, 0F); // Box 265
		bodyModel[122].setRotationPoint(23F, -7F, -11.5F);

		bodyModel[123].addBox(0F, 0F, 0F, 3, 2, 1, 0F); // Box 266
		bodyModel[123].setRotationPoint(-8F, 0.5F, -11.25F);

		bodyModel[124].addBox(0F, 0F, 0F, 11, 4, 0, 0F); // Box 267 liveryimg 1
		bodyModel[124].setRotationPoint(-36F, -17F, -11.01F);

		bodyModel[125].addBox(0F, 0F, 0F, 11, 4, 0, 0F); // Box 268 liveryimg 1
		bodyModel[125].setRotationPoint(-36F, -17F, 11.01F);

		bodyModel[126].addBox(0F, 0F, 0F, 10, 10, 0, 0F); // Box 269 liveryimg 2
		bodyModel[126].setRotationPoint(23F, -21F, 11.01F);

		bodyModel[127].addBox(0F, 0F, 0F, 10, 10, 0, 0F); // Box 270 liveryimg 2
		bodyModel[127].setRotationPoint(23F, -21F, -11.01F);

		bodyModel[128].addBox(0F, 0F, 0F, 5, 5, 0, 0F); // Box 271
		bodyModel[128].setRotationPoint(-29F, 1F, -11F);

		bodyModel[129].addBox(0F, 0F, 0F, 5, 5, 0, 0F); // Box 272
		bodyModel[129].setRotationPoint(-29F, 1F, 11F);

		bodyModel[130].addBox(0F, 0F, 0F, 5, 5, 0, 0F); // Box 273
		bodyModel[130].setRotationPoint(36F, 1F, 11F);

		bodyModel[131].addBox(0F, 0F, 0F, 5, 5, 0, 0F); // Box 274
		bodyModel[131].setRotationPoint(36F, 1F, -11F);

		bodyModel[132].addBox(0F, 0F, 0F, 29, 22, 0, 0F); // Box 157
		bodyModel[132].setRotationPoint(-15F, -22F, -10.99F);

		bodyModel[133].addBox(0F, 0F, 0F, 29, 22, 0, 0F); // Box 157
		bodyModel[133].setRotationPoint(-15F, -22F, 11.01F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 1, 4, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 191
		bodyModel[134].setRotationPoint(45F, 1F, -11F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 162 light
		bodyModel[135].setRotationPoint(-36.65F, -26F, -0.5F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0.3F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, 0.3F, -0.5F, 0.1F, 0.3F, 0F, 0.1F, -1F, 0F, 0.1F, -1F, 0F, 0.1F, 0.3F, 0F, 0.1F); // Box 165
		bodyModel[136].setRotationPoint(-36.5F, -25F, -0.5F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 162 light
		bodyModel[137].setRotationPoint(44.35F, -26F, -0.5F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0.3F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, 0.3F, -0.5F, 0.1F, 0.3F, 0F, 0.1F, -1F, 0F, 0.1F, -1F, 0F, 0.1F, 0.3F, 0F, 0.1F); // Box 165
		bodyModel[138].setRotationPoint(44.5F, -25F, -0.5F);

		bodyModel[139].addBox(0F, 0F, 0F, 2, 16, 7, 0F); // Box 196
		bodyModel[139].setRotationPoint(47F, -18F, 1F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 1, 25, 11, 0F,0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 188
		bodyModel[140].setRotationPoint(-37F, -24F, 0F);
		bodyModel[140].rotateAngleY = -3.14159265F;

		bodyModel[141].addShapeBox(0F, 0F, 0F, 1, 25, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 189
		bodyModel[141].setRotationPoint(-37F, -24F, 11F);
		bodyModel[141].rotateAngleY = -3.14159265F;

		bodyModel[142].addBox(0F, 0F, 0F, 1, 3, 3, 0F); // Box 190 lamp
		bodyModel[142].setRotationPoint(-38.5F, -22F, 1.5F);
		bodyModel[142].rotateAngleY = -3.14159265F;

		bodyModel[143].addShapeBox(0F, 0F, 0F, 1, 4, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 191
		bodyModel[143].setRotationPoint(-36F, 1F, 11F);
		bodyModel[143].rotateAngleY = -3.14159265F;

		bodyModel[144].addBox(0F, 0F, 0F, 2, 16, 7, 0F); // Box 192
		bodyModel[144].setRotationPoint(-38F, -18F, -1F);
		bodyModel[144].rotateAngleY = -3.14159265F;
	}
	ModelFOL_M1Bogie bogie = new ModelFOL_M1Bogie();

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		for (ModelRendererTurbo mrt : bodyModel){
			if(mrt.boxName.equals("lamp")){
				Minecraft.getMinecraft().entityRenderer.disableLightmap(1D);
				mrt.render(f5,false);
				Minecraft.getMinecraft().entityRenderer.enableLightmap(1D);
			} else {
				mrt.render(f5,false);
			}
		}


		if(entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor()==8){
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/FOL_M1_Bogie_grey.png"));
		} else {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/FOL_M1_Bogie.png"));
		}

		GL11.glPushMatrix();
		GL11.glTranslated(-0.725,0,0.11);
		bogie.render(entity,f,f1,f2,f3,f4,f5);

		GL11.glTranslated(3.425,0,0);
		bogie.render(entity,f,f1,f2,f3,f4,f5);
		GL11.glPopMatrix();


	}
}