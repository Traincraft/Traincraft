//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2018 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator:
// Created on:28.03.2018 - 19:43:15
// Last changed on: 28.03.2018 - 19:43:15

package train.client.render.models;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import tmt.ModelBase;
import tmt.ModelRendererTurbo;

public class ModelMILWTender extends ModelBase
{
	int textureX = 512;
	int textureY = 512;

	public ModelMILWTender()
	{
		milwtenderModel = new ModelRendererTurbo[145];
		milwtenderModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		milwtenderModel[1] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 1
		milwtenderModel[2] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 2
		milwtenderModel[3] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 3
		milwtenderModel[4] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 4
		milwtenderModel[5] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 5
		milwtenderModel[6] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 6
		milwtenderModel[7] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 7
		milwtenderModel[8] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 8
		milwtenderModel[9] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 9
		milwtenderModel[10] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 10
		milwtenderModel[11] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 11
		milwtenderModel[12] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 12
		milwtenderModel[13] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 13
		milwtenderModel[14] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 15
		milwtenderModel[15] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 16
		milwtenderModel[16] = new ModelRendererTurbo(this, 297, 9, textureX, textureY); // Box 17
		milwtenderModel[17] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 18
		milwtenderModel[18] = new ModelRendererTurbo(this, 137, 41, textureX, textureY); // Box 20
		milwtenderModel[19] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 21
		milwtenderModel[20] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 22
		milwtenderModel[21] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 23
		milwtenderModel[22] = new ModelRendererTurbo(this, 449, 9, textureX, textureY); // Box 25
		milwtenderModel[23] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 34
		milwtenderModel[24] = new ModelRendererTurbo(this, 185, 17, textureX, textureY); // Box 37
		milwtenderModel[25] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 38
		milwtenderModel[26] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 40
		milwtenderModel[27] = new ModelRendererTurbo(this, 465, 9, textureX, textureY); // Box 41
		milwtenderModel[28] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 43
		milwtenderModel[29] = new ModelRendererTurbo(this, 161, 9, textureX, textureY); // Box 44
		milwtenderModel[30] = new ModelRendererTurbo(this, 449, 9, textureX, textureY); // Box 46
		milwtenderModel[31] = new ModelRendererTurbo(this, 185, 9, textureX, textureY); // Box 48
		milwtenderModel[32] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 49
		milwtenderModel[33] = new ModelRendererTurbo(this, 161, 17, textureX, textureY); // Box 50
		milwtenderModel[34] = new ModelRendererTurbo(this, 217, 17, textureX, textureY); // Box 51
		milwtenderModel[35] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 61
		milwtenderModel[36] = new ModelRendererTurbo(this, 225, 17, textureX, textureY); // Box 64
		milwtenderModel[37] = new ModelRendererTurbo(this, 249, 17, textureX, textureY); // Box 65
		milwtenderModel[38] = new ModelRendererTurbo(this, 273, 17, textureX, textureY); // Box 66
		milwtenderModel[39] = new ModelRendererTurbo(this, 297, 17, textureX, textureY); // Box 67
		milwtenderModel[40] = new ModelRendererTurbo(this, 465, 17, textureX, textureY); // Box 68
		milwtenderModel[41] = new ModelRendererTurbo(this, 489, 17, textureX, textureY); // Box 69
		milwtenderModel[42] = new ModelRendererTurbo(this, 193, 9, textureX, textureY); // Box 70
		milwtenderModel[43] = new ModelRendererTurbo(this, 225, 25, textureX, textureY); // Box 71
		milwtenderModel[44] = new ModelRendererTurbo(this, 297, 25, textureX, textureY); // Box 72
		milwtenderModel[45] = new ModelRendererTurbo(this, 449, 25, textureX, textureY); // Box 73
		milwtenderModel[46] = new ModelRendererTurbo(this, 465, 25, textureX, textureY); // Box 74
		milwtenderModel[47] = new ModelRendererTurbo(this, 185, 33, textureX, textureY); // Box 75
		milwtenderModel[48] = new ModelRendererTurbo(this, 281, 25, textureX, textureY); // Box 77
		milwtenderModel[49] = new ModelRendererTurbo(this, 297, 41, textureX, textureY); // Box 78
		milwtenderModel[50] = new ModelRendererTurbo(this, 217, 9, textureX, textureY); // Box 82
		milwtenderModel[51] = new ModelRendererTurbo(this, 225, 9, textureX, textureY); // Box 83
		milwtenderModel[52] = new ModelRendererTurbo(this, 249, 9, textureX, textureY); // Box 86
		milwtenderModel[53] = new ModelRendererTurbo(this, 257, 9, textureX, textureY); // Box 87
		milwtenderModel[54] = new ModelRendererTurbo(this, 329, 41, textureX, textureY); // Box 89
		milwtenderModel[55] = new ModelRendererTurbo(this, 233, 33, textureX, textureY); // Box 90
		milwtenderModel[56] = new ModelRendererTurbo(this, 281, 9, textureX, textureY); // Box 93
		milwtenderModel[57] = new ModelRendererTurbo(this, 353, 41, textureX, textureY); // Box 95
		milwtenderModel[58] = new ModelRendererTurbo(this, 289, 9, textureX, textureY); // Box 96
		milwtenderModel[59] = new ModelRendererTurbo(this, 497, 9, textureX, textureY); // Box 98
		milwtenderModel[60] = new ModelRendererTurbo(this, 505, 9, textureX, textureY); // Box 99
		milwtenderModel[61] = new ModelRendererTurbo(this, 257, 33, textureX, textureY); // Box 103
		milwtenderModel[62] = new ModelRendererTurbo(this, 489, 17, textureX, textureY); // Box 105
		milwtenderModel[63] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 97
		milwtenderModel[64] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 98
		milwtenderModel[65] = new ModelRendererTurbo(this, 185, 17, textureX, textureY); // Box 99
		milwtenderModel[66] = new ModelRendererTurbo(this, 313, 9, textureX, textureY); // Box 100
		milwtenderModel[67] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 101
		milwtenderModel[68] = new ModelRendererTurbo(this, 209, 17, textureX, textureY); // Box 102
		milwtenderModel[69] = new ModelRendererTurbo(this, 449, 17, textureX, textureY); // Box 105
		milwtenderModel[70] = new ModelRendererTurbo(this, 465, 17, textureX, textureY); // Box 107
		milwtenderModel[71] = new ModelRendererTurbo(this, 185, 25, textureX, textureY); // Box 108
		milwtenderModel[72] = new ModelRendererTurbo(this, 505, 17, textureX, textureY); // Box 109
		milwtenderModel[73] = new ModelRendererTurbo(this, 209, 25, textureX, textureY); // Box 110
		milwtenderModel[74] = new ModelRendererTurbo(this, 457, 25, textureX, textureY); // Box 111
		milwtenderModel[75] = new ModelRendererTurbo(this, 473, 25, textureX, textureY); // Box 112
		milwtenderModel[76] = new ModelRendererTurbo(this, 249, 33, textureX, textureY); // Box 113
		milwtenderModel[77] = new ModelRendererTurbo(this, 281, 33, textureX, textureY); // Box 114
		milwtenderModel[78] = new ModelRendererTurbo(this, 505, 33, textureX, textureY); // Box 115
		milwtenderModel[79] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 116
		milwtenderModel[80] = new ModelRendererTurbo(this, 9, 41, textureX, textureY); // Box 117
		milwtenderModel[81] = new ModelRendererTurbo(this, 145, 41, textureX, textureY); // Box 118
		milwtenderModel[82] = new ModelRendererTurbo(this, 297, 41, textureX, textureY); // Box 119
		milwtenderModel[83] = new ModelRendererTurbo(this, 313, 41, textureX, textureY); // Box 120
		milwtenderModel[84] = new ModelRendererTurbo(this, 313, 25, textureX, textureY); // Box 121
		milwtenderModel[85] = new ModelRendererTurbo(this, 409, 41, textureX, textureY); // Box 122
		milwtenderModel[86] = new ModelRendererTurbo(this, 417, 41, textureX, textureY); // Box 123
		milwtenderModel[87] = new ModelRendererTurbo(this, 425, 41, textureX, textureY); // Box 124
		milwtenderModel[88] = new ModelRendererTurbo(this, 433, 41, textureX, textureY); // Box 125
		milwtenderModel[89] = new ModelRendererTurbo(this, 441, 41, textureX, textureY); // Box 126
		milwtenderModel[90] = new ModelRendererTurbo(this, 457, 41, textureX, textureY); // Box 127
		milwtenderModel[91] = new ModelRendererTurbo(this, 465, 41, textureX, textureY); // Box 128
		milwtenderModel[92] = new ModelRendererTurbo(this, 481, 41, textureX, textureY); // Box 129
		milwtenderModel[93] = new ModelRendererTurbo(this, 489, 41, textureX, textureY); // Box 130
		milwtenderModel[94] = new ModelRendererTurbo(this, 497, 41, textureX, textureY); // Box 78
		milwtenderModel[95] = new ModelRendererTurbo(this, 505, 41, textureX, textureY); // Box 94
		milwtenderModel[96] = new ModelRendererTurbo(this, 441, 41, textureX, textureY); // Box 95
		milwtenderModel[97] = new ModelRendererTurbo(this, 353, 49, textureX, textureY); // Box 96
		milwtenderModel[98] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 135
		milwtenderModel[99] = new ModelRendererTurbo(this, 9, 49, textureX, textureY); // Box 136
		milwtenderModel[100] = new ModelRendererTurbo(this, 385, 49, textureX, textureY); // Box 137
		milwtenderModel[101] = new ModelRendererTurbo(this, 393, 49, textureX, textureY); // Box 138
		milwtenderModel[102] = new ModelRendererTurbo(this, 145, 49, textureX, textureY); // Box 139
		milwtenderModel[103] = new ModelRendererTurbo(this, 153, 49, textureX, textureY); // Box 140
		milwtenderModel[104] = new ModelRendererTurbo(this, 297, 49, textureX, textureY); // Box 141
		milwtenderModel[105] = new ModelRendererTurbo(this, 313, 49, textureX, textureY); // Box 142
		milwtenderModel[106] = new ModelRendererTurbo(this, 321, 49, textureX, textureY); // Box 143
		milwtenderModel[107] = new ModelRendererTurbo(this, 329, 49, textureX, textureY); // Box 144
		milwtenderModel[108] = new ModelRendererTurbo(this, 369, 49, textureX, textureY); // Box 154
		milwtenderModel[109] = new ModelRendererTurbo(this, 425, 49, textureX, textureY); // Box 155
		milwtenderModel[110] = new ModelRendererTurbo(this, 481, 49, textureX, textureY); // Box 156
		milwtenderModel[111] = new ModelRendererTurbo(this, 353, 49, textureX, textureY); // Box 159
		milwtenderModel[112] = new ModelRendererTurbo(this, 409, 49, textureX, textureY); // Box 160
		milwtenderModel[113] = new ModelRendererTurbo(this, 297, 57, textureX, textureY); // Box 161
		milwtenderModel[114] = new ModelRendererTurbo(this, 329, 57, textureX, textureY); // Box 162
		milwtenderModel[115] = new ModelRendererTurbo(this, 313, 57, textureX, textureY); // Box 163
		milwtenderModel[116] = new ModelRendererTurbo(this, 441, 57, textureX, textureY); // Box 164
		milwtenderModel[117] = new ModelRendererTurbo(this, 345, 57, textureX, textureY); // Box 165
		milwtenderModel[118] = new ModelRendererTurbo(this, 457, 57, textureX, textureY); // Box 166
		milwtenderModel[119] = new ModelRendererTurbo(this, 481, 57, textureX, textureY); // Box 167
		milwtenderModel[120] = new ModelRendererTurbo(this, 273, 65, textureX, textureY); // Box 168
		milwtenderModel[121] = new ModelRendererTurbo(this, 289, 65, textureX, textureY); // Box 169
		milwtenderModel[122] = new ModelRendererTurbo(this, 345, 65, textureX, textureY); // Box 170
		milwtenderModel[123] = new ModelRendererTurbo(this, 361, 65, textureX, textureY); // Box 171
		milwtenderModel[124] = new ModelRendererTurbo(this, 377, 65, textureX, textureY); // Box 172
		milwtenderModel[125] = new ModelRendererTurbo(this, 409, 65, textureX, textureY); // Box 173
		milwtenderModel[126] = new ModelRendererTurbo(this, 432, 64, textureX, textureY, "lamp"); // Box 131
		milwtenderModel[127] = new ModelRendererTurbo(this, 432, 64, textureX, textureY, "lamp"); // Box 135
		milwtenderModel[128] = new ModelRendererTurbo(this, 432, 64, textureX, textureY, "lamp"); // Box 136
		milwtenderModel[129] = new ModelRendererTurbo(this, 432, 64, textureX, textureY, "lamp"); // Box 137
		milwtenderModel[130] = new ModelRendererTurbo(this, 445, 65, textureX, textureY); // Box 134
		milwtenderModel[131] = new ModelRendererTurbo(this, 445, 65, textureX, textureY); // Box 135
		milwtenderModel[132] = new ModelRendererTurbo(this, 445, 65, textureX, textureY); // Box 139
		milwtenderModel[133] = new ModelRendererTurbo(this, 445, 65, textureX, textureY); // Box 140
		milwtenderModel[134] = new ModelRendererTurbo(this, 445, 65, textureX, textureY); // Box 141
		milwtenderModel[135] = new ModelRendererTurbo(this, 445, 65, textureX, textureY); // Box 142
		milwtenderModel[136] = new ModelRendererTurbo(this, 5, 150, textureX, textureY); // Box 136
		milwtenderModel[137] = new ModelRendererTurbo(this, 5, 150, textureX, textureY); // Box113
		milwtenderModel[138] = new ModelRendererTurbo(this, 5, 150, textureX, textureY); // Box114
		milwtenderModel[139] = new ModelRendererTurbo(this, 5, 150, textureX, textureY); // Box115
		milwtenderModel[140] = new ModelRendererTurbo(this, 5, 150, textureX, textureY); // Box 140
		milwtenderModel[141] = new ModelRendererTurbo(this, 5, 150, textureX, textureY); // Box 141
		milwtenderModel[142] = new ModelRendererTurbo(this, 5, 150, textureX, textureY); // Box 142
		milwtenderModel[143] = new ModelRendererTurbo(this, 5, 150, textureX, textureY); // Box 143
		milwtenderModel[144] = new ModelRendererTurbo(this, 5, 150, textureX, textureY); // Box 144

		milwtenderModel[0].addBox(0F, 0F, 0F, 67, 17, 22, 0F); // Box 0
		milwtenderModel[0].setRotationPoint(-35F, -17F, -10F);

		milwtenderModel[1].addBox(0F, 0F, 0F, 6, 6, 0, 0F); // Box 1
		milwtenderModel[1].setRotationPoint(-30F, 3F, -5F);

		milwtenderModel[2].addBox(0F, 0F, 0F, 2, 2, 12, 0F); // Box 2
		milwtenderModel[2].setRotationPoint(-28F, 5F, -5F);

		milwtenderModel[3].addBox(0F, 0F, 0F, 2, 2, 12, 0F); // Box 3
		milwtenderModel[3].setRotationPoint(-20F, 5F, -5F);

		milwtenderModel[4].addBox(0F, 0F, 0F, 2, 2, 12, 0F); // Box 4
		milwtenderModel[4].setRotationPoint(-12F, 5F, -5F);

		milwtenderModel[5].addBox(0F, 0F, 0F, 6, 6, 0, 0F); // Box 5
		milwtenderModel[5].setRotationPoint(-22F, 3F, -5F);

		milwtenderModel[6].addBox(0F, 0F, 0F, 6, 6, 0, 0F); // Box 6
		milwtenderModel[6].setRotationPoint(-14F, 3F, -5F);

		milwtenderModel[7].addBox(0F, 0F, 0F, 2, 2, 12, 0F); // Box 7
		milwtenderModel[7].setRotationPoint(22F, 5F, -5F);

		milwtenderModel[8].addBox(0F, 0F, 0F, 2, 2, 12, 0F); // Box 8
		milwtenderModel[8].setRotationPoint(9F, 5F, -5F);

		milwtenderModel[9].addBox(0F, 0F, 0F, 6, 6, 0, 0F); // Box 9
		milwtenderModel[9].setRotationPoint(20F, 3F, -5F);

		milwtenderModel[10].addBox(0F, 0F, 0F, 6, 6, 0, 0F); // Box 10
		milwtenderModel[10].setRotationPoint(7F, 3F, -5F);

		milwtenderModel[11].addBox(0F, 0F, 0F, 6, 6, 0, 0F); // Box 11
		milwtenderModel[11].setRotationPoint(20F, 3F, 7F);

		milwtenderModel[12].addBox(0F, 0F, 0F, 6, 6, 0, 0F); // Box 12
		milwtenderModel[12].setRotationPoint(7F, 3F, 7F);

		milwtenderModel[13].addBox(0F, 0F, 0F, 6, 6, 0, 0F); // Box 13
		milwtenderModel[13].setRotationPoint(-14F, 3F, 7F);

		milwtenderModel[14].addBox(0F, 0F, 0F, 6, 6, 0, 0F); // Box 15
		milwtenderModel[14].setRotationPoint(-30F, 3F, 7F);

		milwtenderModel[15].addBox(0F, 0F, 0F, 6, 6, 0, 0F); // Box 16
		milwtenderModel[15].setRotationPoint(-22F, 3F, 7F);

		milwtenderModel[16].addShapeBox(0F, 0F, 0F, 60, 2, 22, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		milwtenderModel[16].setRotationPoint(-35F, -19F, -10F);

		milwtenderModel[17].addShapeBox(0F, 0F, 0F, 60, 1, 18, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 18
		milwtenderModel[17].setRotationPoint(-35F, -20F, -8F);

		milwtenderModel[18].addShapeBox(0F, 0F, 0F, 67, 1, 22, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 20
		milwtenderModel[18].setRotationPoint(-35F, 0F, -10F);

		milwtenderModel[19].addBox(0F, 0F, 0F, 21, 2, 1, 0F); // Box 21
		milwtenderModel[19].setRotationPoint(6F, 3F, 7F);

		milwtenderModel[20].addBox(0F, 0F, 0F, 21, 2, 1, 0F); // Box 22
		milwtenderModel[20].setRotationPoint(6F, 3F, -6F);

		milwtenderModel[21].addShapeBox(0F, 0F, 0F, 1, 2, 12, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 23
		milwtenderModel[21].setRotationPoint(5F, 3F, -5F);

		milwtenderModel[22].addShapeBox(0F, 0F, 0F, 1, 2, 12, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 25
		milwtenderModel[22].setRotationPoint(27F, 3F, -5F);

		milwtenderModel[23].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 34
		milwtenderModel[23].setRotationPoint(15F, 5F, 7F);

		milwtenderModel[24].addBox(0F, 0F, 0F, 3, 1, 12, 0F); // Box 37
		milwtenderModel[24].setRotationPoint(15F, 3F, -5F);

		milwtenderModel[25].addBox(0F, 0F, 0F, 3, 2, 4, 0F); // Box 38
		milwtenderModel[25].setRotationPoint(15F, 1F, -1F);

		milwtenderModel[26].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 40
		milwtenderModel[26].setRotationPoint(11F, 5F, 7F);

		milwtenderModel[27].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 41
		milwtenderModel[27].setRotationPoint(12F, 7F, 7F);

		milwtenderModel[28].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 43
		milwtenderModel[28].setRotationPoint(19F, 5F, 7F);

		milwtenderModel[29].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 44
		milwtenderModel[29].setRotationPoint(20F, 5F, 7F);

		milwtenderModel[30].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 46
		milwtenderModel[30].setRotationPoint(24F, 5F, 7F);

		milwtenderModel[31].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 48
		milwtenderModel[31].setRotationPoint(9F, 5F, 7F);

		milwtenderModel[32].addBox(0F, 0F, 0F, 4, 2, 2, 0F); // Box 49
		milwtenderModel[32].setRotationPoint(31F, 1F, 0F);

		milwtenderModel[33].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 50
		milwtenderModel[33].setRotationPoint(29F, 1F, 0F);

		milwtenderModel[34].addShapeBox(0F, 0F, 0F, 1, 13, 1, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Box 51
		milwtenderModel[34].setRotationPoint(32F, -15F, 6F);

		milwtenderModel[35].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 61
		milwtenderModel[35].setRotationPoint(32F, -16F, 9F);

		milwtenderModel[36].addShapeBox(0F, 0F, 0F, 7, 2, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 64
		milwtenderModel[36].setRotationPoint(25F, -19F, 9F);

		milwtenderModel[37].addShapeBox(0F, 0F, 0F, 8, 1, 3, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -1F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F); // Box 65
		milwtenderModel[37].setRotationPoint(24F, -20F, 6F);

		milwtenderModel[38].addShapeBox(0F, 0F, 0F, 8, 1, 3, 0F, -1F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 66
		milwtenderModel[38].setRotationPoint(24F, -20F, -7F);

		milwtenderModel[39].addShapeBox(0F, 0F, 0F, 7, 2, 3, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 67
		milwtenderModel[39].setRotationPoint(25F, -19F, -10F);

		milwtenderModel[40].addBox(0F, 0F, 0F, 1, 2, 16, 0F); // Box 68
		milwtenderModel[40].setRotationPoint(31F, -19F, -7F);

		milwtenderModel[41].addBox(0F, 0F, 0F, 1, 1, 10, 0F); // Box 69
		milwtenderModel[41].setRotationPoint(31F, -20F, -4F);

		milwtenderModel[42].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 70
		milwtenderModel[42].setRotationPoint(32F, -16F, 6F);

		milwtenderModel[43].addShapeBox(0F, 0F, 0F, 28, 1, 4, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 71
		milwtenderModel[43].setRotationPoint(4F, -21F, -1F);

		milwtenderModel[44].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 72
		milwtenderModel[44].setRotationPoint(0F, -21F, -1F);

		milwtenderModel[45].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 73
		milwtenderModel[45].setRotationPoint(-1F, -21F, -1F);

		milwtenderModel[46].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 74
		milwtenderModel[46].setRotationPoint(2F, -21F, -1F);

		milwtenderModel[47].addBox(0F, 0F, 0F, 24, 2, 1, 0F); // Box 75
		milwtenderModel[47].setRotationPoint(-31F, 3F, -6F);

		milwtenderModel[48].addShapeBox(0F, 0F, 0F, 1, 2, 12, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 77
		milwtenderModel[48].setRotationPoint(-7F, 3F, -5F);

		milwtenderModel[49].addShapeBox(0F, 0F, 0F, 1, 2, 12, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 78
		milwtenderModel[49].setRotationPoint(-32F, 3F, -5F);

		milwtenderModel[50].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 82
		milwtenderModel[50].setRotationPoint(-14F, 5F, -6F);

		milwtenderModel[51].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 83
		milwtenderModel[51].setRotationPoint(-22F, 5F, -6F);

		milwtenderModel[52].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 86
		milwtenderModel[52].setRotationPoint(-18F, 5F, -6F);

		milwtenderModel[53].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 87
		milwtenderModel[53].setRotationPoint(-26F, 5F, -6F);

		milwtenderModel[54].addBox(0F, 0F, 0F, 4, 1, 12, 0F); // Box 89
		milwtenderModel[54].setRotationPoint(-20F, 3F, -5F);

		milwtenderModel[55].addBox(0F, 0F, 0F, 4, 2, 4, 0F); // Box 90
		milwtenderModel[55].setRotationPoint(-20F, 1F, 0F);

		milwtenderModel[56].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 93
		milwtenderModel[56].setRotationPoint(-26F, 5F, 7F);

		milwtenderModel[57].addBox(0F, 0F, 0F, 24, 2, 1, 0F); // Box 95
		milwtenderModel[57].setRotationPoint(-31F, 3F, 7F);

		milwtenderModel[58].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 96
		milwtenderModel[58].setRotationPoint(-22F, 5F, 7F);

		milwtenderModel[59].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 98
		milwtenderModel[59].setRotationPoint(-18F, 5F, 7F);

		milwtenderModel[60].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 99
		milwtenderModel[60].setRotationPoint(-14F, 5F, 7F);

		milwtenderModel[61].addBox(0F, 0F, 0F, 5, 2, 2, 0F); // Box 103
		milwtenderModel[61].setRotationPoint(-38F, 1F, 0F);

		milwtenderModel[62].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 105
		milwtenderModel[62].setRotationPoint(-33F, 1F, 0F);

		milwtenderModel[63].addShapeBox(0F, 0F, 0F, 134, 34, 0, 0F, 0F, 0F, 0F, -67F, 0F, 0F, -67F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, -17F, 0F, -67F, -17F, 0F, -67F, -17F, 0.2F, 0F, -17F, 0.2F); // Box 97
		milwtenderModel[63].setRotationPoint(-35F, -17F, -10.05F);

		milwtenderModel[64].addShapeBox(0F, 0F, 0F, 134, 34, 0, 0F, -67F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, -67F, 0F, 0.2F, -67F, -17F, 0F, 0F, -17F, 0F, 0F, -17F, 0.2F, -67F, -17F, 0.2F); // Box 98
		milwtenderModel[64].setRotationPoint(-102F, -17F, 12.05F);

		milwtenderModel[65].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 99
		milwtenderModel[65].setRotationPoint(15F, 6F, 7F);

		milwtenderModel[66].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 100
		milwtenderModel[66].setRotationPoint(18F, 5F, 7F);

		milwtenderModel[67].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 101
		milwtenderModel[67].setRotationPoint(14F, 5F, 7F);

		milwtenderModel[68].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 102
		milwtenderModel[68].setRotationPoint(13F, 5F, 7F);

		milwtenderModel[69].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 105
		milwtenderModel[69].setRotationPoint(22F, 5F, 7F);

		milwtenderModel[70].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 107
		milwtenderModel[70].setRotationPoint(21F, 7F, 7F);

		milwtenderModel[71].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 108
		milwtenderModel[71].setRotationPoint(9F, 7F, 7F);

		milwtenderModel[72].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F); // Box 109
		milwtenderModel[72].setRotationPoint(7F, 5F, 7F);

		milwtenderModel[73].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 110
		milwtenderModel[73].setRotationPoint(-12F, 5F, 7F);

		milwtenderModel[74].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 111
		milwtenderModel[74].setRotationPoint(-20F, 5F, 7F);

		milwtenderModel[75].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 112
		milwtenderModel[75].setRotationPoint(-28F, 5F, 7F);

		milwtenderModel[76].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 113
		milwtenderModel[76].setRotationPoint(-28F, 5F, -6F);

		milwtenderModel[77].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 114
		milwtenderModel[77].setRotationPoint(-20F, 5F, -6F);

		milwtenderModel[78].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 115
		milwtenderModel[78].setRotationPoint(-12F, 5F, -6F);

		milwtenderModel[79].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 116
		milwtenderModel[79].setRotationPoint(9F, 5F, -6F);

		milwtenderModel[80].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 117
		milwtenderModel[80].setRotationPoint(22F, 5F, -6F);

		milwtenderModel[81].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 118
		milwtenderModel[81].setRotationPoint(15F, 6F, -6F);

		milwtenderModel[82].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 119
		milwtenderModel[82].setRotationPoint(15F, 5F, -6F);

		milwtenderModel[83].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 120
		milwtenderModel[83].setRotationPoint(12F, 7F, -6F);

		milwtenderModel[84].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 121
		milwtenderModel[84].setRotationPoint(13F, 5F, -6F);

		milwtenderModel[85].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 122
		milwtenderModel[85].setRotationPoint(14F, 5F, -6F);

		milwtenderModel[86].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 123
		milwtenderModel[86].setRotationPoint(18F, 5F, -6F);

		milwtenderModel[87].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 124
		milwtenderModel[87].setRotationPoint(11F, 5F, -6F);

		milwtenderModel[88].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F); // Box 125
		milwtenderModel[88].setRotationPoint(7F, 5F, -6F);

		milwtenderModel[89].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 126
		milwtenderModel[89].setRotationPoint(9F, 7F, -6F);

		milwtenderModel[90].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 127
		milwtenderModel[90].setRotationPoint(24F, 5F, -6F);

		milwtenderModel[91].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 128
		milwtenderModel[91].setRotationPoint(21F, 7F, -6F);

		milwtenderModel[92].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 129
		milwtenderModel[92].setRotationPoint(20F, 5F, -6F);

		milwtenderModel[93].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 130
		milwtenderModel[93].setRotationPoint(19F, 5F, -6F);

		milwtenderModel[94].addBox(0F, 0F, 0F, 2, 17, 1, 0F); // Box 78
		milwtenderModel[94].setRotationPoint(32F, -17F, -4F);

		milwtenderModel[95].addBox(0F, 0F, 0F, 2, 17, 1, 0F); // Box 94
		milwtenderModel[95].setRotationPoint(32F, -17F, 5F);

		milwtenderModel[96].addShapeBox(0F, 0F, 0F, 2, 1, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 95
		milwtenderModel[96].setRotationPoint(32F, 0F, -4F);

		milwtenderModel[97].addShapeBox(0F, 0F, 0F, 2, 1, 10, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 96
		milwtenderModel[97].setRotationPoint(32F, -18F, -4F);

		milwtenderModel[98].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 135
		milwtenderModel[98].setRotationPoint(32F, -2F, 9F);

		milwtenderModel[99].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 136
		milwtenderModel[99].setRotationPoint(32F, -2F, 6F);

		milwtenderModel[100].addShapeBox(0F, 0F, 0F, 1, 13, 1, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Box 137
		milwtenderModel[100].setRotationPoint(32F, -15F, 9F);

		milwtenderModel[101].addShapeBox(0F, 0F, 0F, 0, 13, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 138
		milwtenderModel[101].setRotationPoint(33F, -15F, 7F);

		milwtenderModel[102].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 139
		milwtenderModel[102].setRotationPoint(32F, -17F, -9F);

		milwtenderModel[103].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.2F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.2F); // Box 140
		milwtenderModel[103].setRotationPoint(32F, -16F, -9F);

		milwtenderModel[104].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 141
		milwtenderModel[104].setRotationPoint(32F, -18F, -9F);

		milwtenderModel[105].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.2F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.2F); // Box 142
		milwtenderModel[105].setRotationPoint(32F, -16F, 10F);

		milwtenderModel[106].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 143
		milwtenderModel[106].setRotationPoint(32F, -17F, 10F);

		milwtenderModel[107].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 144
		milwtenderModel[107].setRotationPoint(32F, -18F, 10F);

		milwtenderModel[108].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 154
		milwtenderModel[108].setRotationPoint(-13F, 7F, 7F);

		milwtenderModel[109].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 155
		milwtenderModel[109].setRotationPoint(-21F, 7F, -6F);

		milwtenderModel[110].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 156
		milwtenderModel[110].setRotationPoint(-21F, 7F, 7F);

		milwtenderModel[111].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0.25F); // Box 159
		milwtenderModel[111].setRotationPoint(-10F, 5F, 7F);

		milwtenderModel[112].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, -0.25F, 0F, 0F); // Box 160
		milwtenderModel[112].setRotationPoint(-29F, 5F, 7F);

		milwtenderModel[113].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 161
		milwtenderModel[113].setRotationPoint(-29F, 7F, 7F);

		milwtenderModel[114].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 162
		milwtenderModel[114].setRotationPoint(-29F, 7F, -6F);

		milwtenderModel[115].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -0.25F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0.25F, 0F, 0F); // Box 163
		milwtenderModel[115].setRotationPoint(-29F, 5F, -6F);

		milwtenderModel[116].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 164
		milwtenderModel[116].setRotationPoint(-13F, 7F, -6F);

		milwtenderModel[117].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0.25F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F); // Box 165
		milwtenderModel[117].setRotationPoint(-10F, 5F, -6F);

		milwtenderModel[118].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 166
		milwtenderModel[118].setRotationPoint(-21F, 7F, -6F);

		milwtenderModel[119].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 167
		milwtenderModel[119].setRotationPoint(-21F, 7F, -6F);

		milwtenderModel[120].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, -1F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, -0.8F, -0.5F, 0F, -0.7F, -0.5F, 0F, -0.7F, -0.5F, 0F, -0.7F, -0.5F, 0F); // Box 168
		milwtenderModel[120].setRotationPoint(-17F, 5F, -6F);

		milwtenderModel[121].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.8F, -0.5F, 0F, -0.7F, -0.5F, 0F, -0.7F, -0.5F, 0F, -0.8F, -0.5F, 0F); // Box 169
		milwtenderModel[121].setRotationPoint(-25F, 5F, -6F);

		milwtenderModel[122].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.7F, -0.5F, 0F, -0.7F, -0.5F, 0F, -0.7F, -0.5F, 0F, -0.7F, -0.5F, 0F); // Box 170
		milwtenderModel[122].setRotationPoint(-25F, 5F, 7F);

		milwtenderModel[123].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, -1F, 0F, 0F, -0.8F, -0.5F, 0F, -0.8F, -0.5F, 0F, -0.8F, -0.5F, 0F, -0.7F, -0.5F, 0F); // Box 171
		milwtenderModel[123].setRotationPoint(-17F, 5F, 7F);

		milwtenderModel[124].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 172
		milwtenderModel[124].setRotationPoint(-23F, 2F, 7F);

		milwtenderModel[125].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 173
		milwtenderModel[125].setRotationPoint(-23F, 2F, -6F);

		milwtenderModel[126].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F); // Box 131
		milwtenderModel[126].setRotationPoint(32F, -17F, -9F);
		milwtenderModel[126].rotateAngleX = -1.57079633F;

		milwtenderModel[127].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F); // Box 135
		milwtenderModel[127].setRotationPoint(33F, -16F, -8F);
		milwtenderModel[127].rotateAngleX = 1.57079633F;
		milwtenderModel[127].rotateAngleY = -1.57079633F;

		milwtenderModel[128].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F); // Box 136
		milwtenderModel[128].setRotationPoint(33F, -16F, 11F);
		milwtenderModel[128].rotateAngleX = 1.57079633F;
		milwtenderModel[128].rotateAngleY = -1.57079633F;

		milwtenderModel[129].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F); // Box 137
		milwtenderModel[129].setRotationPoint(32F, -16F, 11F);
		milwtenderModel[129].rotateAngleX = 1.57079633F;

		milwtenderModel[130].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 134
		milwtenderModel[130].setRotationPoint(-1F, -21F, 1F);

		milwtenderModel[131].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 135
		milwtenderModel[131].setRotationPoint(-1F, -21F, 0F);

		milwtenderModel[132].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.6F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.5F, 0F, -0.6F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 139
		milwtenderModel[132].setRotationPoint(-2F, -21F, 0F);

		milwtenderModel[133].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.6F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0F, -0.6F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 140
		milwtenderModel[133].setRotationPoint(-2F, -21F, 1F);

		milwtenderModel[134].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 141
		milwtenderModel[134].setRotationPoint(1F, -21F, 1F);

		milwtenderModel[135].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 142
		milwtenderModel[135].setRotationPoint(1F, -21F, 0F);

		milwtenderModel[136].addShapeBox(0F, 0F, 0F, 1, 3, 22, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 136
		milwtenderModel[136].setRotationPoint(32F, 0F, -10F);

		milwtenderModel[137].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box113
		milwtenderModel[137].setRotationPoint(29F, 1F, 11F);

		milwtenderModel[138].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box114
		milwtenderModel[138].setRotationPoint(29F, 4F, 11F);

		milwtenderModel[139].addShapeBox(0F, 0F, 0F, 2, 0, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F); // Box115
		milwtenderModel[139].setRotationPoint(30F, 2F, 11F);

		milwtenderModel[140].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 140
		milwtenderModel[140].setRotationPoint(32F, 3F, 11F);

		milwtenderModel[141].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 141
		milwtenderModel[141].setRotationPoint(32F, 3F, -10F);

		milwtenderModel[142].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 142
		milwtenderModel[142].setRotationPoint(29F, 4F, -10F);

		milwtenderModel[143].addShapeBox(0F, 0F, 0F, 2, 0, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F); // Box 143
		milwtenderModel[143].setRotationPoint(30F, 2F, -10F);

		milwtenderModel[144].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 144
		milwtenderModel[144].setRotationPoint(29F, 1F, -10F);


	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		for(int i = 0; i < 145; i++)
		{
			if(milwtenderModel[i].boxName!= null && milwtenderModel[i].boxName.equals("lamp")){
				Minecraft.getMinecraft().entityRenderer.disableLightmap(1D);
				milwtenderModel[i].render(f5);
				Minecraft.getMinecraft().entityRenderer.enableLightmap(1D);

			} else {
				milwtenderModel[i].render(f5);
			}
		}
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
	{
	}

	public ModelRendererTurbo milwtenderModel[];
}