//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2019 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator:
// Created on:14.01.2019 - 10:43:19
// Last changed on: 14.01.2019 - 10:43:19

package train.client.render.models;

import net.minecraft.entity.Entity;
import tmt.ModelBase;
import tmt.ModelRendererTurbo;

public class ModelBP4Bogie extends ModelBase
{
	int textureX = 512;
	int textureY = 512;

	public ModelBP4Bogie()
	{
		bp4bogieModel = new ModelRendererTurbo[109];
		bp4bogieModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 4
		bp4bogieModel[1] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 5
		bp4bogieModel[2] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 30
		bp4bogieModel[3] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 60
		bp4bogieModel[4] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 66
		bp4bogieModel[5] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 96
		bp4bogieModel[6] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 46
		bp4bogieModel[7] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 47
		bp4bogieModel[8] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 48
		bp4bogieModel[9] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 63
		bp4bogieModel[10] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 69
		bp4bogieModel[11] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 71
		bp4bogieModel[12] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 73
		bp4bogieModel[13] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 75
		bp4bogieModel[14] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 76
		bp4bogieModel[15] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 77
		bp4bogieModel[16] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 79
		bp4bogieModel[17] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 81
		bp4bogieModel[18] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 82
		bp4bogieModel[19] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 81
		bp4bogieModel[20] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 82
		bp4bogieModel[21] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 114
		bp4bogieModel[22] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 115
		bp4bogieModel[23] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 116
		bp4bogieModel[24] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 117
		bp4bogieModel[25] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 122
		bp4bogieModel[26] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 123
		bp4bogieModel[27] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 124
		bp4bogieModel[28] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 80
		bp4bogieModel[29] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 3
		bp4bogieModel[30] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 24
		bp4bogieModel[31] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 25
		bp4bogieModel[32] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 27
		bp4bogieModel[33] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 89
		bp4bogieModel[34] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 91
		bp4bogieModel[35] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 92
		bp4bogieModel[36] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 93
		bp4bogieModel[37] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 94
		bp4bogieModel[38] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 95
		bp4bogieModel[39] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 66
		bp4bogieModel[40] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 95
		bp4bogieModel[41] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 98
		bp4bogieModel[42] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 99
		bp4bogieModel[43] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 101
		bp4bogieModel[44] = new ModelRendererTurbo(this, 9, 9, textureX, textureY); // Box 102
		bp4bogieModel[45] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 103
		bp4bogieModel[46] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 104
		bp4bogieModel[47] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Box 105
		bp4bogieModel[48] = new ModelRendererTurbo(this, 105, 9, textureX, textureY); // Box 106
		bp4bogieModel[49] = new ModelRendererTurbo(this, 65, 9, textureX, textureY); // Box 93
		bp4bogieModel[50] = new ModelRendererTurbo(this, 97, 9, textureX, textureY); // Box 94
		bp4bogieModel[51] = new ModelRendererTurbo(this, 113, 9, textureX, textureY); // Box 109
		bp4bogieModel[52] = new ModelRendererTurbo(this, 153, 9, textureX, textureY); // Box 110
		bp4bogieModel[53] = new ModelRendererTurbo(this, 185, 9, textureX, textureY); // Box 111
		bp4bogieModel[54] = new ModelRendererTurbo(this, 201, 9, textureX, textureY); // Box 112
		bp4bogieModel[55] = new ModelRendererTurbo(this, 161, 9, textureX, textureY); // Box 113
		bp4bogieModel[56] = new ModelRendererTurbo(this, 329, 9, textureX, textureY); // Box 114
		bp4bogieModel[57] = new ModelRendererTurbo(this, 217, 9, textureX, textureY); // Box 115
		bp4bogieModel[58] = new ModelRendererTurbo(this, 225, 9, textureX, textureY); // Box 116
		bp4bogieModel[59] = new ModelRendererTurbo(this, 233, 9, textureX, textureY); // Box 117
		bp4bogieModel[60] = new ModelRendererTurbo(this, 121, 9, textureX, textureY); // Box 118
		bp4bogieModel[61] = new ModelRendererTurbo(this, 377, 9, textureX, textureY); // Box 119
		bp4bogieModel[62] = new ModelRendererTurbo(this, 241, 9, textureX, textureY); // Box 120
		bp4bogieModel[63] = new ModelRendererTurbo(this, 393, 9, textureX, textureY); // Box 121
		bp4bogieModel[64] = new ModelRendererTurbo(this, 401, 9, textureX, textureY); // Box 122
		bp4bogieModel[65] = new ModelRendererTurbo(this, 409, 9, textureX, textureY); // Box 123
		bp4bogieModel[66] = new ModelRendererTurbo(this, 249, 9, textureX, textureY); // Box 124
		bp4bogieModel[67] = new ModelRendererTurbo(this, 281, 9, textureX, textureY); // Box 125
		bp4bogieModel[68] = new ModelRendererTurbo(this, 417, 9, textureX, textureY); // Box 126
		bp4bogieModel[69] = new ModelRendererTurbo(this, 433, 9, textureX, textureY); // Box 127
		bp4bogieModel[70] = new ModelRendererTurbo(this, 449, 9, textureX, textureY); // Box 128
		bp4bogieModel[71] = new ModelRendererTurbo(this, 465, 9, textureX, textureY); // Box 129
		bp4bogieModel[72] = new ModelRendererTurbo(this, 489, 9, textureX, textureY); // Box 130
		bp4bogieModel[73] = new ModelRendererTurbo(this, 81, 17, textureX, textureY); // Box 134
		bp4bogieModel[74] = new ModelRendererTurbo(this, 97, 17, textureX, textureY); // Box 135
		bp4bogieModel[75] = new ModelRendererTurbo(this, 113, 17, textureX, textureY); // Box 136
		bp4bogieModel[76] = new ModelRendererTurbo(this, 137, 17, textureX, textureY); // Box 137
		bp4bogieModel[77] = new ModelRendererTurbo(this, 289, 9, textureX, textureY); // Box 60
		bp4bogieModel[78] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 61
		bp4bogieModel[79] = new ModelRendererTurbo(this, 145, 17, textureX, textureY); // Box 62
		bp4bogieModel[80] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 144
		bp4bogieModel[81] = new ModelRendererTurbo(this, 321, 9, textureX, textureY); // Box 145
		bp4bogieModel[82] = new ModelRendererTurbo(this, 153, 17, textureX, textureY); // Box 146
		bp4bogieModel[83] = new ModelRendererTurbo(this, 161, 17, textureX, textureY); // Box 147
		bp4bogieModel[84] = new ModelRendererTurbo(this, 169, 17, textureX, textureY); // Box 148
		bp4bogieModel[85] = new ModelRendererTurbo(this, 177, 17, textureX, textureY); // Box 149
		bp4bogieModel[86] = new ModelRendererTurbo(this, 369, 9, textureX, textureY); // Box 150
		bp4bogieModel[87] = new ModelRendererTurbo(this, 481, 9, textureX, textureY); // Box 151
		bp4bogieModel[88] = new ModelRendererTurbo(this, 185, 17, textureX, textureY); // Box 152
		bp4bogieModel[89] = new ModelRendererTurbo(this, 121, 17, textureX, textureY); // Box 153
		bp4bogieModel[90] = new ModelRendererTurbo(this, 193, 17, textureX, textureY); // Box 154
		bp4bogieModel[91] = new ModelRendererTurbo(this, 201, 17, textureX, textureY); // Box 155
		bp4bogieModel[92] = new ModelRendererTurbo(this, 209, 17, textureX, textureY); // Box 156
		bp4bogieModel[93] = new ModelRendererTurbo(this, 209, 17, textureX, textureY); // Box 157
		bp4bogieModel[94] = new ModelRendererTurbo(this, 233, 17, textureX, textureY); // Box 158
		bp4bogieModel[95] = new ModelRendererTurbo(this, 241, 17, textureX, textureY); // Box 159
		bp4bogieModel[96] = new ModelRendererTurbo(this, 257, 17, textureX, textureY); // Box 160
		bp4bogieModel[97] = new ModelRendererTurbo(this, 225, 17, textureX, textureY); // Box 161
		bp4bogieModel[98] = new ModelRendererTurbo(this, 265, 17, textureX, textureY); // Box 162
		bp4bogieModel[99] = new ModelRendererTurbo(this, 273, 17, textureX, textureY); // Box 163
		bp4bogieModel[100] = new ModelRendererTurbo(this, 281, 17, textureX, textureY); // Box 164
		bp4bogieModel[101] = new ModelRendererTurbo(this, 289, 17, textureX, textureY); // Box 166
		bp4bogieModel[102] = new ModelRendererTurbo(this, 297, 17, textureX, textureY); // Box 167
		bp4bogieModel[103] = new ModelRendererTurbo(this, 305, 17, textureX, textureY); // Box 168
		bp4bogieModel[104] = new ModelRendererTurbo(this, 313, 17, textureX, textureY); // Box 169
		bp4bogieModel[105] = new ModelRendererTurbo(this, 321, 17, textureX, textureY); // Box 170
		bp4bogieModel[106] = new ModelRendererTurbo(this, 329, 17, textureX, textureY); // Box 171
		bp4bogieModel[107] = new ModelRendererTurbo(this, 153, 9, textureX, textureY); // Box 172
		bp4bogieModel[108] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 173

		bp4bogieModel[0].addBox(0F, 0F, 0F, 2, 2, 16, 0F); // Box 4
		bp4bogieModel[0].setRotationPoint(-9F, 1.5F, -8F);

		bp4bogieModel[1].addBox(0F, 0F, 0F, 2, 2, 16, 0F); // Box 5
		bp4bogieModel[1].setRotationPoint(3F, 1.5F, -8F);

		bp4bogieModel[2].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 30
		bp4bogieModel[2].setRotationPoint(4F, 2.5F, 6F);

		bp4bogieModel[3].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 60
		bp4bogieModel[3].setRotationPoint(5F, 1F, -7.5F);

		bp4bogieModel[4].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 66
		bp4bogieModel[4].setRotationPoint(-4F, 1F, -7F);

		bp4bogieModel[5].addBox(0F, 0F, 0F, 6, 1, 13, 0F); // Box 96
		bp4bogieModel[5].setRotationPoint(-5F, 0.25F, -6.5F);

		bp4bogieModel[6].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 46
		bp4bogieModel[6].setRotationPoint(-8F, 2.5F, 6F);

		bp4bogieModel[7].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 47
		bp4bogieModel[7].setRotationPoint(-8F, 2.5F, -6F);

		bp4bogieModel[8].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 48
		bp4bogieModel[8].setRotationPoint(4F, 2.5F, -6F);

		bp4bogieModel[9].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 63
		bp4bogieModel[9].setRotationPoint(2.5F, 4.01F, -7.5F);

		bp4bogieModel[10].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 69
		bp4bogieModel[10].setRotationPoint(-9.5F, 4.01F, -7.5F);

		bp4bogieModel[11].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, -0.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 71
		bp4bogieModel[11].setRotationPoint(-12.5F, 0F, -7.5F);

		bp4bogieModel[12].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -0.5F, 0F, -1F); // Box 73
		bp4bogieModel[12].setRotationPoint(-12.5F, 1F, -3.5F);

		bp4bogieModel[13].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 75
		bp4bogieModel[13].setRotationPoint(-12.5F, 0F, -3.5F);

		bp4bogieModel[14].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 76
		bp4bogieModel[14].setRotationPoint(-12.5F, 0F, 2.5F);

		bp4bogieModel[15].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 77
		bp4bogieModel[15].setRotationPoint(7.5F, 0F, -7.5F);

		bp4bogieModel[16].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 79
		bp4bogieModel[16].setRotationPoint(7.5F, 0F, 2.5F);

		bp4bogieModel[17].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, -1F); // Box 81
		bp4bogieModel[17].setRotationPoint(7.5F, 1F, -3.5F);

		bp4bogieModel[18].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 82
		bp4bogieModel[18].setRotationPoint(7.5F, 0F, -3.5F);

		bp4bogieModel[19].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 81
		bp4bogieModel[19].setRotationPoint(3F, 1.5F, -9F);

		bp4bogieModel[20].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 82
		bp4bogieModel[20].setRotationPoint(-9F, 1.5F, -9F);

		bp4bogieModel[21].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 114
		bp4bogieModel[21].setRotationPoint(-9F, 1.5F, 8F);

		bp4bogieModel[22].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 115
		bp4bogieModel[22].setRotationPoint(3F, 1.5F, 8F);

		bp4bogieModel[23].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F); // Box 116
		bp4bogieModel[23].setRotationPoint(-12.5F, 0F, 3.5F);

		bp4bogieModel[24].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, 0F); // Box 117
		bp4bogieModel[24].setRotationPoint(7.5F, 0F, 3.5F);

		bp4bogieModel[25].addBox(0F, 0F, 0F, 7, 3, 10, 0F); // Box 122
		bp4bogieModel[25].setRotationPoint(-10F, 1F, -5F);

		bp4bogieModel[26].addBox(0F, 0F, 0F, 7, 3, 10, 0F); // Box 123
		bp4bogieModel[26].setRotationPoint(-1F, 1F, -5F);

		bp4bogieModel[27].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 124
		bp4bogieModel[27].setRotationPoint(-4F, -0.5F, -2F);

		bp4bogieModel[28].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 80
		bp4bogieModel[28].setRotationPoint(-7F, 2F, -7.5F);

		bp4bogieModel[29].addBox(0F, 0F, 0F, 19, 1, 1, 0F); // Box 3
		bp4bogieModel[29].setRotationPoint(-11.5F, 0F, -7.5F);

		bp4bogieModel[30].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 24
		bp4bogieModel[30].setRotationPoint(-4.5F, -1F, -7.5F);

		bp4bogieModel[31].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F); // Box 25
		bp4bogieModel[31].setRotationPoint(-5F, 1F, -7.5F);

		bp4bogieModel[32].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 27
		bp4bogieModel[32].setRotationPoint(-4.5F, 1F, -7.5F);

		bp4bogieModel[33].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 89
		bp4bogieModel[33].setRotationPoint(-7F, 1F, -7.5F);

		bp4bogieModel[34].addBox(0F, 0F, 0F, 8, 1, 0, 0F); // Box 91
		bp4bogieModel[34].setRotationPoint(-11.5F, 3.5F, -6.5F);

		bp4bogieModel[35].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 92
		bp4bogieModel[35].setRotationPoint(1F, 1F, -7.5F);

		bp4bogieModel[36].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 93
		bp4bogieModel[36].setRotationPoint(1F, 2F, -7.5F);

		bp4bogieModel[37].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F); // Box 94
		bp4bogieModel[37].setRotationPoint(0F, 1F, -7.5F);

		bp4bogieModel[38].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F); // Box 95
		bp4bogieModel[38].setRotationPoint(-4F, 3F, -7F);

		bp4bogieModel[39].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 66
		bp4bogieModel[39].setRotationPoint(-1F, 1F, -7F);

		bp4bogieModel[40].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 95
		bp4bogieModel[40].setRotationPoint(-1F, 3F, -7F);

		bp4bogieModel[41].addBox(0F, 0F, 0F, 8, 1, 0, 0F); // Box 98
		bp4bogieModel[41].setRotationPoint(-0.5F, 3.5F, -6.5F);

		bp4bogieModel[42].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 1F, -0.5F, 0F, 1F, -0.5F, 0F, -1.5F, 0F, 0F, -1.5F); // Box 99
		bp4bogieModel[42].setRotationPoint(-3.75F, 0F, -8F);

		bp4bogieModel[43].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1.5F, -0.5F, 0F, -1.5F); // Box 101
		bp4bogieModel[43].setRotationPoint(-1.25F, 0F, -8F);

		bp4bogieModel[44].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 102
		bp4bogieModel[44].setRotationPoint(-4F, -0.25F, -7.75F);

		bp4bogieModel[45].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 103
		bp4bogieModel[45].setRotationPoint(-1F, -0.25F, -7.75F);

		bp4bogieModel[46].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 104
		bp4bogieModel[46].setRotationPoint(-9F, 1.5F, -8.5F);

		bp4bogieModel[47].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F); // Box 105
		bp4bogieModel[47].setRotationPoint(-3.75F, 4F, -9F);

		bp4bogieModel[48].addShapeBox(0F, 0F, 0F, 3, 1, 5, 0F, 0F, -0.4F, 0F, -0.25F, -0.4F, 0F, -0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 106
		bp4bogieModel[48].setRotationPoint(-3.5F, 3.5F, -9.5F);

		bp4bogieModel[49].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 93
		bp4bogieModel[49].setRotationPoint(-3.25F, 2.75F, -9F);

		bp4bogieModel[50].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F, 0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 94
		bp4bogieModel[50].setRotationPoint(-3.25F, 1.75F, -9F);

		bp4bogieModel[51].addShapeBox(0F, 0F, 0F, 3, 2, 14, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 109
		bp4bogieModel[51].setRotationPoint(-3.25F, 1.75F, -7F);

		bp4bogieModel[52].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 110
		bp4bogieModel[52].setRotationPoint(3F, 1.5F, -8.5F);

		bp4bogieModel[53].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, -1.5F, -0.25F, 0F, -1.5F, -0.25F, 0F, -1.5F, -0.25F, 0F, -1.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 111
		bp4bogieModel[53].setRotationPoint(-11F, -1F, -7.5F);

		bp4bogieModel[54].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, -1.5F, -0.25F, 0F, -1.5F, -0.25F, 0F, -1.5F, -0.25F, 0F, -1.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 112
		bp4bogieModel[54].setRotationPoint(1F, -1F, -7.5F);

		bp4bogieModel[55].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 113
		bp4bogieModel[55].setRotationPoint(-11F, 1F, -7.5F);

		bp4bogieModel[56].addBox(0F, 0F, 0F, 19, 1, 1, 0F); // Box 114
		bp4bogieModel[56].setRotationPoint(-11.5F, 0F, 6.5F);

		bp4bogieModel[57].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 115
		bp4bogieModel[57].setRotationPoint(-7F, 2F, 6.5F);

		bp4bogieModel[58].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 116
		bp4bogieModel[58].setRotationPoint(-7F, 1F, 6.5F);

		bp4bogieModel[59].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 117
		bp4bogieModel[59].setRotationPoint(-11F, 1F, 6.5F);

		bp4bogieModel[60].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F); // Box 118
		bp4bogieModel[60].setRotationPoint(-5F, 1F, 6.5F);

		bp4bogieModel[61].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 119
		bp4bogieModel[61].setRotationPoint(-4.5F, 1F, 6.5F);

		bp4bogieModel[62].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F); // Box 120
		bp4bogieModel[62].setRotationPoint(0F, 1F, 6.5F);

		bp4bogieModel[63].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 121
		bp4bogieModel[63].setRotationPoint(1F, 1F, 6.5F);

		bp4bogieModel[64].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 122
		bp4bogieModel[64].setRotationPoint(1F, 2F, 6.5F);

		bp4bogieModel[65].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 123
		bp4bogieModel[65].setRotationPoint(5F, 1F, 6.5F);

		bp4bogieModel[66].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 124
		bp4bogieModel[66].setRotationPoint(2.5F, 4.01F, 6.5F);

		bp4bogieModel[67].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 125
		bp4bogieModel[67].setRotationPoint(-9.5F, 4.01F, 6.5F);

		bp4bogieModel[68].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, -1.5F, -0.25F, 0F, -1.5F, -0.25F, 0F, -1.5F, -0.25F, 0F, -1.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 126
		bp4bogieModel[68].setRotationPoint(1F, -1F, 6.5F);

		bp4bogieModel[69].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 127
		bp4bogieModel[69].setRotationPoint(-4.5F, -1F, 6.5F);

		bp4bogieModel[70].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, -1.5F, -0.25F, 0F, -1.5F, -0.25F, 0F, -1.5F, -0.25F, 0F, -1.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bp4bogieModel[70].setRotationPoint(-11F, -1F, 6.5F);

		bp4bogieModel[71].addBox(0F, 0F, 0F, 8, 1, 0, 0F); // Box 129
		bp4bogieModel[71].setRotationPoint(-0.5F, 3.5F, 6.5F);

		bp4bogieModel[72].addBox(0F, 0F, 0F, 8, 1, 0, 0F); // Box 130
		bp4bogieModel[72].setRotationPoint(-11.5F, 3.5F, 6.5F);

		bp4bogieModel[73].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 134
		bp4bogieModel[73].setRotationPoint(-3.25F, 1.75F, 7F);

		bp4bogieModel[74].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F); // Box 135
		bp4bogieModel[74].setRotationPoint(-3.25F, 2.75F, 7F);

		bp4bogieModel[75].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 136
		bp4bogieModel[75].setRotationPoint(3F, 1.5F, 5.5F);

		bp4bogieModel[76].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 137
		bp4bogieModel[76].setRotationPoint(-9F, 1.5F, 5.5F);

		bp4bogieModel[77].addBox(0F, 0F, 0F, 2, 0, 1, 0F); // Box 60
		bp4bogieModel[77].setRotationPoint(1F, -0.5F, 7.5F);

		bp4bogieModel[78].addShapeBox(0F, 0F, 0F, 1, 0, 4, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F); // Box 61
		bp4bogieModel[78].setRotationPoint(0F, -0.5F, 4.5F);

		bp4bogieModel[79].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 62
		bp4bogieModel[79].setRotationPoint(2.5F, -0.95F, 7.5F);

		bp4bogieModel[80].addShapeBox(0F, 0F, 0F, 1, 0, 4, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F); // Box 144
		bp4bogieModel[80].setRotationPoint(-5F, -0.5F, 4.5F);

		bp4bogieModel[81].addBox(0F, 0F, 0F, 2, 0, 1, 0F); // Box 145
		bp4bogieModel[81].setRotationPoint(-7F, -0.5F, 7.5F);

		bp4bogieModel[82].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 146
		bp4bogieModel[82].setRotationPoint(-8.5F, -0.95F, 7.5F);

		bp4bogieModel[83].addBox(0F, 0F, 0F, 2, 0, 1, 0F); // Box 147
		bp4bogieModel[83].setRotationPoint(-7F, -0.5F, -8.5F);

		bp4bogieModel[84].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 148
		bp4bogieModel[84].setRotationPoint(2.5F, -0.95F, -8.5F);

		bp4bogieModel[85].addBox(0F, 0F, 0F, 2, 0, 1, 0F); // Box 149
		bp4bogieModel[85].setRotationPoint(1F, -0.5F, -8.5F);

		bp4bogieModel[86].addShapeBox(0F, 0F, 0F, 1, 0, 4, 0F, -1F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 150
		bp4bogieModel[86].setRotationPoint(0F, -0.5F, -8.5F);

		bp4bogieModel[87].addShapeBox(0F, 0F, 0F, 1, 0, 4, 0F, 0F, 0F, -1F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 151
		bp4bogieModel[87].setRotationPoint(-5F, -0.5F, -8.5F);

		bp4bogieModel[88].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 152
		bp4bogieModel[88].setRotationPoint(-8.5F, -0.95F, -8.5F);

		bp4bogieModel[89].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 153
		bp4bogieModel[89].setRotationPoint(-1F, 1F, 6F);

		bp4bogieModel[90].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 154
		bp4bogieModel[90].setRotationPoint(-1F, 3F, 6F);

		bp4bogieModel[91].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 155
		bp4bogieModel[91].setRotationPoint(-4F, 1F, 6F);

		bp4bogieModel[92].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 156
		bp4bogieModel[92].setRotationPoint(-4F, 3F, 6F);

		bp4bogieModel[93].addShapeBox(0F, 0F, 0F, 3, 1, 5, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 157
		bp4bogieModel[93].setRotationPoint(-3.5F, 3.5F, 4.5F);

		bp4bogieModel[94].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1F, -0.5F, 0F, 1F); // Box 158
		bp4bogieModel[94].setRotationPoint(-1.25F, 0F, 7F);

		bp4bogieModel[95].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, -1F, -0.5F, -0.5F, -1F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 159
		bp4bogieModel[95].setRotationPoint(-3.75F, 4F, 8F);

		bp4bogieModel[96].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -0.5F, 0F, -1.5F, -0.5F, 0F, 1F, 0F, 0F, 1F); // Box 160
		bp4bogieModel[96].setRotationPoint(-3.75F, 0F, 7F);

		bp4bogieModel[97].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 161
		bp4bogieModel[97].setRotationPoint(-4F, -0.25F, 6.75F);

		bp4bogieModel[98].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 162
		bp4bogieModel[98].setRotationPoint(-1F, -0.25F, 6.75F);

		bp4bogieModel[99].addShapeBox(0F, 0F, 0F, 1, 4, 0, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 163
		bp4bogieModel[99].setRotationPoint(3.5F, -0.75F, -8F);

		bp4bogieModel[100].addShapeBox(0F, 0F, 0F, 1, 4, 0, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 164
		bp4bogieModel[100].setRotationPoint(3.5F, -0.75F, 8F);

		bp4bogieModel[101].addBox(0F, 0F, 0F, 2, 1, 0, 0F); // Box 166
		bp4bogieModel[101].setRotationPoint(-8F, 2F, 8.51F);

		bp4bogieModel[102].addShapeBox(0F, 0F, 0F, 2, 2, 0, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -1F, 0F); // Box 167
		bp4bogieModel[102].setRotationPoint(-6F, 1F, 8.51F);

		bp4bogieModel[103].addBox(0F, 0F, 0F, 1, 4, 0, 0F); // Box 168
		bp4bogieModel[103].setRotationPoint(-5F, -3F, 8.51F);

		bp4bogieModel[104].addBox(0F, 0F, 0F, 1, 4, 0, 0F); // Box 169
		bp4bogieModel[104].setRotationPoint(-5F, -3F, -8.51F);

		bp4bogieModel[105].addBox(0F, 0F, 0F, 2, 1, 0, 0F); // Box 170
		bp4bogieModel[105].setRotationPoint(-8F, 2F, -8.51F);

		bp4bogieModel[106].addShapeBox(0F, 0F, 0F, 2, 2, 0, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -1F, 0F); // Box 171
		bp4bogieModel[106].setRotationPoint(-6F, 1F, -8.51F);

		bp4bogieModel[107].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 172
		bp4bogieModel[107].setRotationPoint(3F, 1.5F, 7.5F);

		bp4bogieModel[108].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 173
		bp4bogieModel[108].setRotationPoint(-9F, 1.5F, 7.5F);

	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		for(ModelRendererTurbo m : bp4bogieModel)
		{
			m.render(f5);
		}
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
	{
	}

	public ModelRendererTurbo bp4bogieModel[];
}