//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2023 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 21.09.2023 - 19:32:14
// Last changed on: 21.09.2023 - 19:32:14

package train.client.render.models;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import org.lwjgl.opengl.GL11;
import tmt.ModelConverter;
import tmt.ModelRendererTurbo;
import train.common.api.Locomotive;

public class ModelM8DNF1Middle2 extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 256;

	public ModelM8DNF1Middle2() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[118];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 385, 81, textureX, textureY); // Box 2
		bodyModel[1] = new ModelRendererTurbo(this, 473, 81, textureX, textureY); // Box 7
		bodyModel[2] = new ModelRendererTurbo(this, 481, 81, textureX, textureY); // Box 8
		bodyModel[3] = new ModelRendererTurbo(this, 97, 89, textureX, textureY); // Box 9
		bodyModel[4] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 15
		bodyModel[5] = new ModelRendererTurbo(this, 489, 81, textureX, textureY); // Box 18
		bodyModel[6] = new ModelRendererTurbo(this, 441, 81, textureX, textureY); // Box 19
		bodyModel[7] = new ModelRendererTurbo(this, 137, 89, textureX, textureY); // Box 21
		bodyModel[8] = new ModelRendererTurbo(this, 145, 89, textureX, textureY); // Box 23
		bodyModel[9] = new ModelRendererTurbo(this, 161, 89, textureX, textureY); // Box 47
		bodyModel[10] = new ModelRendererTurbo(this, 217, 89, textureX, textureY); // Box 48
		bodyModel[11] = new ModelRendererTurbo(this, 281, 89, textureX, textureY); // Box 55
		bodyModel[12] = new ModelRendererTurbo(this, 297, 89, textureX, textureY); // Box 56
		bodyModel[13] = new ModelRendererTurbo(this, 345, 89, textureX, textureY); // Box 57
		bodyModel[14] = new ModelRendererTurbo(this, 241, 89, textureX, textureY); // Box 179
		bodyModel[15] = new ModelRendererTurbo(this, 249, 89, textureX, textureY); // Box 180
		bodyModel[16] = new ModelRendererTurbo(this, 265, 89, textureX, textureY); // Box 181
		bodyModel[17] = new ModelRendererTurbo(this, 473, 89, textureX, textureY); // Box 182
		bodyModel[18] = new ModelRendererTurbo(this, 497, 81, textureX, textureY); // Box 183
		bodyModel[19] = new ModelRendererTurbo(this, 361, 89, textureX, textureY); // Box 184
		bodyModel[20] = new ModelRendererTurbo(this, 369, 89, textureX, textureY); // Box 185
		bodyModel[21] = new ModelRendererTurbo(this, 49, 97, textureX, textureY); // Box 187
		bodyModel[22] = new ModelRendererTurbo(this, 377, 89, textureX, textureY); // Box 188
		bodyModel[23] = new ModelRendererTurbo(this, 385, 89, textureX, textureY); // Box 189
		bodyModel[24] = new ModelRendererTurbo(this, 401, 89, textureX, textureY); // Box 190
		bodyModel[25] = new ModelRendererTurbo(this, 505, 81, textureX, textureY); // Box 191
		bodyModel[26] = new ModelRendererTurbo(this, 409, 89, textureX, textureY); // Box 192
		bodyModel[27] = new ModelRendererTurbo(this, 417, 89, textureX, textureY); // Box 193
		bodyModel[28] = new ModelRendererTurbo(this, 457, 89, textureX, textureY); // Box 194
		bodyModel[29] = new ModelRendererTurbo(this, 465, 89, textureX, textureY); // Box 195
		bodyModel[30] = new ModelRendererTurbo(this, 505, 89, textureX, textureY); // Box 196
		bodyModel[31] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 197
		bodyModel[32] = new ModelRendererTurbo(this, 313, 89, textureX, textureY); // Box 198
		bodyModel[33] = new ModelRendererTurbo(this, 89, 97, textureX, textureY); // Box 2
		bodyModel[34] = new ModelRendererTurbo(this, 321, 97, textureX, textureY); // Box 53
		bodyModel[35] = new ModelRendererTurbo(this, 145, 97, textureX, textureY); // Box 64
		bodyModel[36] = new ModelRendererTurbo(this, 273, 97, textureX, textureY); // Box 65
		bodyModel[37] = new ModelRendererTurbo(this, 385, 97, textureX, textureY); // Box 66
		bodyModel[38] = new ModelRendererTurbo(this, 297, 97, textureX, textureY); // Box 67
		bodyModel[39] = new ModelRendererTurbo(this, 417, 97, textureX, textureY); // Box 69
		bodyModel[40] = new ModelRendererTurbo(this, 449, 97, textureX, textureY); // Box 70
		bodyModel[41] = new ModelRendererTurbo(this, 473, 97, textureX, textureY); // Box 71
		bodyModel[42] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 72
		bodyModel[43] = new ModelRendererTurbo(this, 17, 105, textureX, textureY); // Box 98
		bodyModel[44] = new ModelRendererTurbo(this, 177, 105, textureX, textureY); // Box 139
		bodyModel[45] = new ModelRendererTurbo(this, 25, 113, textureX, textureY); // Box 139
		bodyModel[46] = new ModelRendererTurbo(this, 81, 113, textureX, textureY); // Box 133
		bodyModel[47] = new ModelRendererTurbo(this, 233, 113, textureX, textureY); // Box 134
		bodyModel[48] = new ModelRendererTurbo(this, 385, 113, textureX, textureY); // Box 47
		bodyModel[49] = new ModelRendererTurbo(this, 137, 113, textureX, textureY); // Box 114
		bodyModel[50] = new ModelRendererTurbo(this, 73, 105, textureX, textureY); // Box 115
		bodyModel[51] = new ModelRendererTurbo(this, 497, 105, textureX, textureY); // Box 98
		bodyModel[52] = new ModelRendererTurbo(this, 153, 113, textureX, textureY); // Box 99
		bodyModel[53] = new ModelRendererTurbo(this, 169, 113, textureX, textureY); // Box 100
		bodyModel[54] = new ModelRendererTurbo(this, 289, 113, textureX, textureY); // Box 101
		bodyModel[55] = new ModelRendererTurbo(this, 297, 113, textureX, textureY); // Box 102
		bodyModel[56] = new ModelRendererTurbo(this, 305, 113, textureX, textureY); // Box 105
		bodyModel[57] = new ModelRendererTurbo(this, 457, 113, textureX, textureY); // Box 106
		bodyModel[58] = new ModelRendererTurbo(this, 473, 113, textureX, textureY); // Box 107
		bodyModel[59] = new ModelRendererTurbo(this, 297, 113, textureX, textureY); // Box 137
		bodyModel[60] = new ModelRendererTurbo(this, 473, 113, textureX, textureY); // Box 141
		bodyModel[61] = new ModelRendererTurbo(this, 273, 17, textureX, textureY); // Box 142
		bodyModel[62] = new ModelRendererTurbo(this, 233, 105, textureX, textureY); // Box 143
		bodyModel[63] = new ModelRendererTurbo(this, 401, 17, textureX, textureY); // Box 144
		bodyModel[64] = new ModelRendererTurbo(this, 1, 121, textureX, textureY); // Box 145
		bodyModel[65] = new ModelRendererTurbo(this, 17, 121, textureX, textureY); // Box 144
		bodyModel[66] = new ModelRendererTurbo(this, 25, 121, textureX, textureY); // Box 145
		bodyModel[67] = new ModelRendererTurbo(this, 33, 121, textureX, textureY); // Box 74
		bodyModel[68] = new ModelRendererTurbo(this, 249, 105, textureX, textureY); // Box 75
		bodyModel[69] = new ModelRendererTurbo(this, 49, 121, textureX, textureY); // Box 76
		bodyModel[70] = new ModelRendererTurbo(this, 65, 121, textureX, textureY); // Box 77
		bodyModel[71] = new ModelRendererTurbo(this, 337, 121, textureX, textureY); // Box 78
		bodyModel[72] = new ModelRendererTurbo(this, 345, 121, textureX, textureY); // Box 79
		bodyModel[73] = new ModelRendererTurbo(this, 353, 121, textureX, textureY); // Box 80
		bodyModel[74] = new ModelRendererTurbo(this, 361, 121, textureX, textureY); // Box 81
		bodyModel[75] = new ModelRendererTurbo(this, 369, 121, textureX, textureY); // Box 82
		bodyModel[76] = new ModelRendererTurbo(this, 385, 121, textureX, textureY); // Box 83
		bodyModel[77] = new ModelRendererTurbo(this, 65, 129, textureX, textureY); // Box 84
		bodyModel[78] = new ModelRendererTurbo(this, 105, 129, textureX, textureY); // Box 85
		bodyModel[79] = new ModelRendererTurbo(this, 329, 89, textureX, textureY); // Box 86
		bodyModel[80] = new ModelRendererTurbo(this, 321, 105, textureX, textureY); // Box 87
		bodyModel[81] = new ModelRendererTurbo(this, 289, 97, textureX, textureY); // Box 88
		bodyModel[82] = new ModelRendererTurbo(this, 497, 121, textureX, textureY); // Box 89
		bodyModel[83] = new ModelRendererTurbo(this, 105, 129, textureX, textureY); // Box 90
		bodyModel[84] = new ModelRendererTurbo(this, 113, 129, textureX, textureY); // Box 91
		bodyModel[85] = new ModelRendererTurbo(this, 177, 129, textureX, textureY); // Box 40
		bodyModel[86] = new ModelRendererTurbo(this, 129, 137, textureX, textureY); // Box 142
		bodyModel[87] = new ModelRendererTurbo(this, 209, 137, textureX, textureY); // Box 129
		bodyModel[88] = new ModelRendererTurbo(this, 257, 137, textureX, textureY); // Box 130
		bodyModel[89] = new ModelRendererTurbo(this, 353, 137, textureX, textureY); // Box 131
		bodyModel[90] = new ModelRendererTurbo(this, 401, 137, textureX, textureY); // Box 132
		bodyModel[91] = new ModelRendererTurbo(this, 457, 129, textureX, textureY); // Box 122
		bodyModel[92] = new ModelRendererTurbo(this, 145, 129, textureX, textureY); // Box 127
		bodyModel[93] = new ModelRendererTurbo(this, 217, 129, textureX, textureY); // Box 128
		bodyModel[94] = new ModelRendererTurbo(this, 33, 137, textureX, textureY); // Box 102
		bodyModel[95] = new ModelRendererTurbo(this, 57, 137, textureX, textureY); // Box 103
		bodyModel[96] = new ModelRendererTurbo(this, 305, 137, textureX, textureY); // Box 104
		bodyModel[97] = new ModelRendererTurbo(this, 49, 121, textureX, textureY); // Box 8
		bodyModel[98] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Box 9
		bodyModel[99] = new ModelRendererTurbo(this, 169, 97, textureX, textureY); // Box 10
		bodyModel[100] = new ModelRendererTurbo(this, 409, 97, textureX, textureY); // Box 11
		bodyModel[101] = new ModelRendererTurbo(this, 145, 97, textureX, textureY); // Box 12
		bodyModel[102] = new ModelRendererTurbo(this, 273, 97, textureX, textureY); // Box 13
		bodyModel[103] = new ModelRendererTurbo(this, 297, 97, textureX, textureY); // Box 15
		bodyModel[104] = new ModelRendererTurbo(this, 441, 97, textureX, textureY); // Box 19
		bodyModel[105] = new ModelRendererTurbo(this, 465, 97, textureX, textureY); // Box 21
		bodyModel[106] = new ModelRendererTurbo(this, 385, 97, textureX, textureY); // Box 24
		bodyModel[107] = new ModelRendererTurbo(this, 313, 137, textureX, textureY); // Box 449
		bodyModel[108] = new ModelRendererTurbo(this, 1, 145, textureX, textureY); // Box 58
		bodyModel[109] = new ModelRendererTurbo(this, 121, 145, textureX, textureY); // Box 59
		bodyModel[110] = new ModelRendererTurbo(this, 129, 137, textureX, textureY); // Box 307
		bodyModel[111] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 310
		bodyModel[112] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 311
		bodyModel[113] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 312
		bodyModel[114] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 313
		bodyModel[115] = new ModelRendererTurbo(this, 491, 25, textureX, textureY); // Box 337
		bodyModel[116] = new ModelRendererTurbo(this, 498, 25, textureX, textureY); // Box 338
		bodyModel[117] = new ModelRendererTurbo(this, 505, 25, textureX, textureY); // Box 339

		bodyModel[0].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 2
		bodyModel[0].setRotationPoint(-7F, 7F, -6F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.8F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, 0F, -0.8F, 0F, 0F); // Box 7
		bodyModel[1].setRotationPoint(-9.2F, 6.5F, -8F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.8F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, 0F, -0.8F, 0F, 0F); // Box 8
		bodyModel[2].setRotationPoint(-5.8F, 6.5F, -8F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 17, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 9
		bodyModel[3].setRotationPoint(-8.5F, 8.5F, -8F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.8F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, 0F, -0.8F, 0F, 0F); // Box 15
		bodyModel[4].setRotationPoint(7.05F, 6.5F, -8F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.4F, 0.2F, 0F, 0.4F, 0.2F, 0F, 0.4F, 0.2F, 0F, 0.4F, 0.2F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F); // Box 18
		bodyModel[5].setRotationPoint(5.85F, 7F, -7.7F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 19
		bodyModel[6].setRotationPoint(5.85F, 7F, -6F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.8F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, 0F, -0.8F, 0F, 0F); // Box 21
		bodyModel[7].setRotationPoint(3.65F, 6.5F, -8F);

		bodyModel[8].addBox(-2.5F, -2.5F, 0F, 5, 5, 0, 0F); // Box 23
		bodyModel[8].setRotationPoint(-6.5F, 7.5F, 5F);

		bodyModel[9].addBox(0F, 0F, 0F, 6, 2, 1, 0F); // Box 47
		bodyModel[9].setRotationPoint(-3F, 7.7F, -6F);

		bodyModel[10].addBox(0F, 0F, 0F, 6, 2, 1, 0F); // Box 48
		bodyModel[10].setRotationPoint(-3F, 7.7F, 5F);

		bodyModel[11].addBox(-2.5F, -2.5F, 0F, 5, 5, 0, 0F); // Box 55
		bodyModel[11].setRotationPoint(-6.5F, 7.5F, -5F);

		bodyModel[12].addBox(-2.5F, -2.5F, 0F, 5, 5, 0, 0F); // Box 56
		bodyModel[12].setRotationPoint(6.25F, 7.5F, -5F);

		bodyModel[13].addBox(-2.5F, -2.5F, 0F, 5, 5, 0, 0F); // Box 57
		bodyModel[13].setRotationPoint(6.25F, 7.5F, 5F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 179
		bodyModel[14].setRotationPoint(1F, 8.5F, -9F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 180
		bodyModel[15].setRotationPoint(-2F, 8.5F, -9F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 181
		bodyModel[16].setRotationPoint(-1F, 8.5F, -9F);

		bodyModel[17].addBox(0F, 0F, 0F, 12, 1, 4, 0F); // Box 182
		bodyModel[17].setRotationPoint(-6F, 8F, -2F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.4F, 0.2F, 0F, 0.4F, 0.2F, 0F, 0.4F, 0.2F, 0F, 0.4F, 0.2F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F); // Box 183
		bodyModel[18].setRotationPoint(-6.95F, 7F, -7.7F);

		bodyModel[19].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 184
		bodyModel[19].setRotationPoint(-1.25F, 6.7F, -8.5F);

		bodyModel[20].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 185
		bodyModel[20].setRotationPoint(0.25F, 6.7F, -8.5F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 17, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 187
		bodyModel[21].setRotationPoint(-8.5F, 8.5F, 7F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, 0F); // Box 188
		bodyModel[22].setRotationPoint(1F, 8.5F, 7F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 189
		bodyModel[23].setRotationPoint(-1F, 8.5F, 7F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F); // Box 190
		bodyModel[24].setRotationPoint(-2F, 8.5F, 7F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.4F, 0.2F, 0F, 0.4F, 0.2F, 0F, 0.4F, 0.2F, 0F, 0.4F, 0.2F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F); // Box 191
		bodyModel[25].setRotationPoint(-6.95F, 7F, 6.8F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.8F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, 0F, -0.8F, 0F, 0F); // Box 192
		bodyModel[26].setRotationPoint(-9.2F, 6.5F, 6.5F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.8F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, 0F, -0.8F, 0F, 0F); // Box 193
		bodyModel[27].setRotationPoint(-5.8F, 6.5F, 6.5F);

		bodyModel[28].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 194
		bodyModel[28].setRotationPoint(-1.25F, 6.7F, 7.5F);

		bodyModel[29].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 195
		bodyModel[29].setRotationPoint(0.25F, 6.7F, 7.5F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.8F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, 0F, -0.8F, 0F, 0F); // Box 196
		bodyModel[30].setRotationPoint(3.65F, 6.5F, 6.5F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.8F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, 0F, -0.8F, 0F, 0F); // Box 197
		bodyModel[31].setRotationPoint(7.05F, 6.5F, 6.5F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.4F, 0.2F, 0F, 0.4F, 0.2F, 0F, 0.4F, 0.2F, 0F, 0.4F, 0.2F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F); // Box 198
		bodyModel[32].setRotationPoint(5.85F, 7F, 6.8F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 23, 8, 1, 0F,0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[33].setRotationPoint(-11.5F, 0F, -9.7F);

		bodyModel[34].addBox(0F, 0F, 0F, 23, 1, 17, 0F); // Box 53
		bodyModel[34].setRotationPoint(-11.5F, -17F, -8.5F);

		bodyModel[35].addBox(0F, 0F, 0F, 6, 3, 7, 0F); // Box 64
		bodyModel[35].setRotationPoint(2.8F, 3F, 2F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 1, 4, 7, 0F,-0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 65
		bodyModel[36].setRotationPoint(5.3F, -1F, -9F);

		bodyModel[37].addBox(0F, 0F, 0F, 6, 3, 7, 0F); // Box 66
		bodyModel[37].setRotationPoint(2.8F, 3F, -9F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 1, 4, 7, 0F,-0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 67
		bodyModel[38].setRotationPoint(5.3F, -1F, 2F);

		bodyModel[39].addBox(0F, 0F, 0F, 6, 3, 7, 0F); // Box 69
		bodyModel[39].setRotationPoint(-9F, 3F, -9F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 1, 4, 7, 0F,-0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 70
		bodyModel[40].setRotationPoint(-6.5F, -1F, -9F);

		bodyModel[41].addBox(0F, 0F, 0F, 6, 3, 7, 0F); // Box 71
		bodyModel[41].setRotationPoint(-9F, 3F, 2F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 1, 4, 7, 0F,-0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 72
		bodyModel[42].setRotationPoint(-6.5F, -1F, 2F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 23, 2, 1, 0F,0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 98
		bodyModel[43].setRotationPoint(-11.5F, -19F, -9.1F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 23, 17, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 139
		bodyModel[44].setRotationPoint(-11.5F, -17F, -9.5F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 23, 2, 1, 0F,0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, -0.1F, 0F, 0F, -0.1F, 0F); // Box 139
		bodyModel[45].setRotationPoint(-11.5F, -19F, 8.1F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 23, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F); // Box 133
		bodyModel[46].setRotationPoint(-11.5F, 0F, 8.7F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 23, 17, 1, 0F,0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0.3F, 0F, 0F, 0.3F); // Box 134
		bodyModel[47].setRotationPoint(-11.5F, -17F, 8.5F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 23, 1, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 47
		bodyModel[48].setRotationPoint(-11.5F, 6F, -9F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 4, 17, 0, 0F,0F, 0F, 0.6F, 0F, 0F, 0.9F, 0F, 0F, -0.9F, 0F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F); // Box 114
		bodyModel[49].setRotationPoint(11.5F, -17F, 9.5F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 4, 7, 0, 0F,0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F); // Box 115
		bodyModel[50].setRotationPoint(11.5F, 0F, 9.5F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 1, 6, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 98
		bodyModel[51].setRotationPoint(10.5F, 0F, 4.8F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 1, 6, 3, 0F,0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 99
		bodyModel[52].setRotationPoint(10.5F, 0F, -7.8F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 1, 22, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 100
		bodyModel[53].setRotationPoint(10.5F, -16F, 7.8F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 1, 22, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 101
		bodyModel[54].setRotationPoint(10.5F, -16F, -8.8F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 3, 14, 0, 0F,0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 102
		bodyModel[55].setRotationPoint(11.5F, -16F, -8.4F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 3, 14, 0, 0F,0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 105
		bodyModel[56].setRotationPoint(11.5F, -16F, 8.4F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 3, 6, 3, 0F,0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 106
		bodyModel[57].setRotationPoint(11.5F, 0F, -8.4F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 3, 6, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 107
		bodyModel[58].setRotationPoint(11.5F, 0F, 5.4F);

		bodyModel[59].addBox(0F, 0F, 0F, 1, 1, 16, 0F); // Box 137
		bodyModel[59].setRotationPoint(10.5F, -16F, -8F);

		bodyModel[60].addBox(0F, 0F, 0F, 3, 0, 16, 0F); // Box 141
		bodyModel[60].setRotationPoint(11.5F, -16F, -8.1F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1.3F, 0F, 0F, -1.3F, 0F, 0F, -1F); // Box 142
		bodyModel[61].setRotationPoint(11.5F, 7F, 9.5F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 4, 7, 0, 0F,0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, 0.3F, 0F, 0F, 0F); // Box 143
		bodyModel[62].setRotationPoint(11.5F, 0F, -9.5F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1.3F, 0F, 0F, 1.3F, 0F, 0F, 1F); // Box 144
		bodyModel[63].setRotationPoint(11.5F, 7F, -9.5F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 4, 17, 0, 0F,0F, 0F, -0.6F, 0F, 0F, -0.9F, 0F, 0F, 0.9F, 0F, 0F, 0.6F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, 0.3F, 0F, 0F, 0F); // Box 145
		bodyModel[64].setRotationPoint(11.5F, -17F, -9.5F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 0, 16, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 144
		bodyModel[65].setRotationPoint(11F, -15F, -5.3F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 0, 16, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 145
		bodyModel[66].setRotationPoint(11F, -15F, 3.8F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 4, 17, 0, 0F,0F, 0F, 0.9F, 0F, 0F, 0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.9F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F); // Box 74
		bodyModel[67].setRotationPoint(-15.5F, -17F, 9.5F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 4, 7, 0, 0F,0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F); // Box 75
		bodyModel[68].setRotationPoint(-15.5F, 0F, 9.5F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 1, 6, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 76
		bodyModel[69].setRotationPoint(-11.5F, 0F, 4.8F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 1, 6, 3, 0F,0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 77
		bodyModel[70].setRotationPoint(-11.5F, 0F, -7.8F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 1, 22, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 78
		bodyModel[71].setRotationPoint(-11.5F, -16F, 7.8F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 1, 22, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 79
		bodyModel[72].setRotationPoint(-11.5F, -16F, -8.8F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 3, 14, 0, 0F,0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 80
		bodyModel[73].setRotationPoint(-14.5F, -16F, -8.4F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 3, 14, 0, 0F,0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 81
		bodyModel[74].setRotationPoint(-14.5F, -16F, 8.4F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 3, 6, 3, 0F,0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 82
		bodyModel[75].setRotationPoint(-14.5F, 0F, -8.4F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 3, 6, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 83
		bodyModel[76].setRotationPoint(-14.5F, 0F, 5.4F);

		bodyModel[77].addBox(0F, 0F, 0F, 1, 1, 16, 0F); // Box 84
		bodyModel[77].setRotationPoint(-11.5F, -16F, -8F);

		bodyModel[78].addBox(0F, 0F, 0F, 3, 0, 16, 0F); // Box 85
		bodyModel[78].setRotationPoint(-14.5F, -16F, -8.1F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, 1.3F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1.3F); // Box 86
		bodyModel[79].setRotationPoint(-15.5F, 7F, 9.5F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 4, 7, 0, 0F,0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F); // Box 87
		bodyModel[80].setRotationPoint(-15.5F, 0F, -9.5F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, -1.3F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1.3F); // Box 88
		bodyModel[81].setRotationPoint(-15.5F, 7F, -9.5F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 4, 17, 0, 0F,0F, 0F, -0.9F, 0F, 0F, -0.6F, 0F, 0F, 0.6F, 0F, 0F, 0.9F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F); // Box 89
		bodyModel[82].setRotationPoint(-15.5F, -17F, -9.5F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 0, 16, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 90
		bodyModel[83].setRotationPoint(-11F, -15F, -5.3F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 0, 16, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 91
		bodyModel[84].setRotationPoint(-11F, -15F, 3.8F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 19, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 40
		bodyModel[85].setRotationPoint(-9.5F, -16F, -1.5F);

		bodyModel[86].addBox(0F, 0F, 0F, 17, 4, 0, 0F); // Box 142
		bodyModel[86].setRotationPoint(-9F, -16F, -3.75F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 21, 1, 2, 0F,0F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 129
		bodyModel[87].setRotationPoint(-10.5F, -15F, 6.5F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 21, 1, 2, 0F,0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 130
		bodyModel[88].setRotationPoint(-10.5F, -16F, 6.5F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 21, 1, 2, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 131
		bodyModel[89].setRotationPoint(-10.5F, -15F, -8.5F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 21, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F); // Box 132
		bodyModel[90].setRotationPoint(-10.5F, -16F, -8.5F);

		bodyModel[91].addBox(0F, 0F, 0F, 3, 1, 12, 0F); // Box 122
		bodyModel[91].setRotationPoint(-14.5F, 6F, -6F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 3, 1, 5, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 127
		bodyModel[92].setRotationPoint(-17.5F, 5.95F, -5F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 3, 1, 5, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 128
		bodyModel[93].setRotationPoint(-17.5F, 5.95F, 0F);

		bodyModel[94].addBox(0F, 0F, 0F, 3, 1, 12, 0F); // Box 102
		bodyModel[94].setRotationPoint(11.5F, 6F, -6F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 3, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, -2F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 103
		bodyModel[95].setRotationPoint(14.5F, 5.95F, -5F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 3, 1, 5, 0F,0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 104
		bodyModel[96].setRotationPoint(14.5F, 5.95F, 0F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 8
		bodyModel[97].setRotationPoint(0F, -31.75F, -4.75F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 9
		bodyModel[98].setRotationPoint(2F, -31.75F, -4.75F);

		bodyModel[99].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 10
		bodyModel[99].setRotationPoint(0F, -30.75F, -5F);

		bodyModel[100].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 11
		bodyModel[100].setRotationPoint(0F, -30.75F, 4F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 1F, 0F, -0.25F, 1F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 12
		bodyModel[101].setRotationPoint(2F, -31.75F, -6.75F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 1F, 0F, -0.25F, 1F, 0F); // Box 13
		bodyModel[102].setRotationPoint(0F, -31.75F, 5.25F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 1F, 0F, -0.25F, 1F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 15
		bodyModel[103].setRotationPoint(0F, -31.75F, -6.75F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 19
		bodyModel[104].setRotationPoint(-3F, -18F, -4.25F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 21
		bodyModel[105].setRotationPoint(-3F, -18F, 3.25F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 1F, 0F, -0.25F, 1F, 0F); // Box 24
		bodyModel[106].setRotationPoint(2F, -31.75F, 5.25F);

		bodyModel[107].addBox(0F, 0F, 0F, 1, 1, 10, 0F); // Box 449
		bodyModel[107].setRotationPoint(-1F, -19F, -5F);

		bodyModel[108].addShapeBox(-9F, -1F, -1F, 9, 1, 1, 0F,0F, 4F, 0F, 0F, -1F, 0F, 0F, -1F, 1F, 0F, 4F, 1F, 0F, -4F, 0F, 0F, 1F, 0F, 0F, 1F, 1F, 0F, -4F, 1F); // Box 58
		bodyModel[108].setRotationPoint(-1F, -19F, 0F);

		bodyModel[109].addShapeBox(1F, -1F, -3F, 19, 1, 12, 0F,1F, -2F, -1F, -9F, 4.5F, 1.5F, -9F, 4.5F, -4.5F, 1F, -2F, -7F, 1F, 2F, -1F, -9F, -4.5F, 1.5F, -9F, -4.5F, -4.5F, 1F, 2F, -7F); // Box 59
		bodyModel[109].setRotationPoint(-10.5F, -25F, 0F);

		bodyModel[110].addBox(0F, 0F, 0F, 17, 4, 0, 0F); // Box 307
		bodyModel[110].setRotationPoint(-9F, -16F, 3.75F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 0, 4, 3, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, -1.5F, 0F, -2F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F); // Box 310
		bodyModel[111].setRotationPoint(6F, -5F, 2F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 0, 4, 3, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, -1.5F, 0F, -2F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F); // Box 311
		bodyModel[112].setRotationPoint(-6F, -5F, -3.5F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 0, 4, 3, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, -1.5F, 0F, -2F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F); // Box 312
		bodyModel[113].setRotationPoint(-6F, -5F, 2F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 0, 4, 3, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, -1.5F, 0F, -2F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F); // Box 313
		bodyModel[114].setRotationPoint(6F, -5F, -3.5F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 0, 4, 3, 0F,0F, -2F, 0.2F, 0F, -2F, 0.2F, 0F, -2F, -1.3F, 0F, -2F, -1.3F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, -1.3F, 0F, 0.2F, -1.3F); // Box 337
		bodyModel[115].setRotationPoint(-4F, -14.5F, -4.5F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 0, 4, 3, 0F,0F, -2F, 0.2F, 0F, -2F, 0.2F, 0F, -2F, -1.3F, 0F, -2F, -1.3F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, -1.3F, 0F, 0.2F, -1.3F); // Box 338
		bodyModel[116].setRotationPoint(-2F, -14.5F, -4.5F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 0, 4, 3, 0F,0F, -2F, 0.2F, 0F, -2F, 0.2F, 0F, -2F, -1.3F, 0F, -2F, -1.3F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, -1.3F, 0F, 0.2F, -1.3F); // Box 339
		bodyModel[117].setRotationPoint(0F, -14.5F, -4.5F);
	}
}