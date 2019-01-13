//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2018 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator:ApocTheWanderer
// Created on:15.11.2017 - 19:11:37
// Last changed on: 15.11.2017 - 19:11:37

package train.client.render.models;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import tmt.ModelBase;
import tmt.ModelRendererTurbo;

public class ModelDD35A extends ModelBase
{
	int textureX = 512;
	int textureY = 256;

	public ModelDD35A()
	{
		dd35aModel = new ModelRendererTurbo[170];
		dd35aModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 5
		dd35aModel[1] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 7
		dd35aModel[2] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 11
		dd35aModel[3] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 31
		dd35aModel[4] = new ModelRendererTurbo(this, 161, 9, textureX, textureY); // Box 33
		dd35aModel[5] = new ModelRendererTurbo(this, 161, 25, textureX, textureY); // Box 34
		dd35aModel[6] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 35
		dd35aModel[7] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 36
		dd35aModel[8] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 38
		dd35aModel[9] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 58
		dd35aModel[10] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 59
		dd35aModel[11] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 60
		dd35aModel[12] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 61
		dd35aModel[13] = new ModelRendererTurbo(this, 449, 9, textureX, textureY); // Box 62
		dd35aModel[14] = new ModelRendererTurbo(this, 473, 9, textureX, textureY); // Box 63
		dd35aModel[15] = new ModelRendererTurbo(this, 497, 9, textureX, textureY); // Box 64
		dd35aModel[16] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 65
		dd35aModel[17] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 66
		dd35aModel[18] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 68
		dd35aModel[19] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 69
		dd35aModel[20] = new ModelRendererTurbo(this, 17, 25, textureX, textureY); // Box 70
		dd35aModel[21] = new ModelRendererTurbo(this, 417, 25, textureX, textureY); // Box 71
		dd35aModel[22] = new ModelRendererTurbo(this, 433, 25, textureX, textureY); // Box 72
		dd35aModel[23] = new ModelRendererTurbo(this, 449, 25, textureX, textureY); // Box 73
		dd35aModel[24] = new ModelRendererTurbo(this, 161, 33, textureX, textureY); // Box 66
		dd35aModel[25] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 67
		dd35aModel[26] = new ModelRendererTurbo(this, 337, 33, textureX, textureY); // Box 76
		dd35aModel[27] = new ModelRendererTurbo(this, 473, 17, textureX, textureY); // Box 81
		dd35aModel[28] = new ModelRendererTurbo(this, 9, 25, textureX, textureY); // Box 82
		dd35aModel[29] = new ModelRendererTurbo(this, 457, 41, textureX, textureY); // Box 83
		dd35aModel[30] = new ModelRendererTurbo(this, 177, 49, textureX, textureY); // Box 84
		dd35aModel[31] = new ModelRendererTurbo(this, 217, 49, textureX, textureY); // Box 85
		dd35aModel[32] = new ModelRendererTurbo(this, 9, 9, textureX, textureY); // Box 87
		dd35aModel[33] = new ModelRendererTurbo(this, 431, 15, textureX, textureY); // Box 88
		dd35aModel[34] = new ModelRendererTurbo(this, 361, 57, textureX, textureY); // Box 91
		dd35aModel[35] = new ModelRendererTurbo(this, 425, 57, textureX, textureY); // Box 92
		dd35aModel[36] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 93
		dd35aModel[37] = new ModelRendererTurbo(this, 41, 65, textureX, textureY); // Box 94
		dd35aModel[38] = new ModelRendererTurbo(this, 49, 41, textureX, textureY); // Box 118
		dd35aModel[39] = new ModelRendererTurbo(this, 65, 65, textureX, textureY); // Box 119
		dd35aModel[40] = new ModelRendererTurbo(this, 465, 25, textureX, textureY); // Box 123
		dd35aModel[41] = new ModelRendererTurbo(this, 497, 25, textureX, textureY); // Box 124
		dd35aModel[42] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 125
		dd35aModel[43] = new ModelRendererTurbo(this, 457, 33, textureX, textureY); // Box 126
		dd35aModel[44] = new ModelRendererTurbo(this, 121, 41, textureX, textureY); // Box 127
		dd35aModel[45] = new ModelRendererTurbo(this, 137, 41, textureX, textureY); // Box 128
		dd35aModel[46] = new ModelRendererTurbo(this, 161, 9, textureX, textureY); // Box 143
		dd35aModel[47] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 144
		dd35aModel[48] = new ModelRendererTurbo(this, 481, 25, textureX, textureY); // Box 145
		dd35aModel[49] = new ModelRendererTurbo(this, 17, 33, textureX, textureY); // Box 146
		dd35aModel[50] = new ModelRendererTurbo(this, 457, 41, textureX, textureY); // Box 159
		dd35aModel[51] = new ModelRendererTurbo(this, 121, 65, textureX, textureY); // Box 160
		dd35aModel[52] = new ModelRendererTurbo(this, 481, 41, textureX, textureY); // Box 161
		dd35aModel[53] = new ModelRendererTurbo(this, 153, 73, textureX, textureY); // Box 162
		dd35aModel[54] = new ModelRendererTurbo(this, 201, 49, textureX, textureY); // Box 163
		dd35aModel[55] = new ModelRendererTurbo(this, 481, 49, textureX, textureY); // Box 164
		dd35aModel[56] = new ModelRendererTurbo(this, 337, 57, textureX, textureY); // Box 165
		dd35aModel[57] = new ModelRendererTurbo(this, 457, 17, textureX, textureY); // Box 166
		dd35aModel[58] = new ModelRendererTurbo(this, 25, 65, textureX, textureY); // Box 167
		dd35aModel[59] = new ModelRendererTurbo(this, 145, 65, textureX, textureY); // Box 168
		dd35aModel[60] = new ModelRendererTurbo(this, 449, 65, textureX, textureY); // Box 169
		dd35aModel[61] = new ModelRendererTurbo(this, 481, 65, textureX, textureY); // Box 170
		dd35aModel[62] = new ModelRendererTurbo(this, 25, 73, textureX, textureY); // Box 171
		dd35aModel[63] = new ModelRendererTurbo(this, 265, 73, textureX, textureY); // Box 174
		dd35aModel[64] = new ModelRendererTurbo(this, 497, 41, textureX, textureY); // Box 175
		dd35aModel[65] = new ModelRendererTurbo(this, 161, 9, textureX, textureY); // Box 177
		dd35aModel[66] = new ModelRendererTurbo(this, 273, 81, textureX, textureY); // Box 178
		dd35aModel[67] = new ModelRendererTurbo(this, 9, 25, textureX, textureY); // Box 181
		dd35aModel[68] = new ModelRendererTurbo(this, 65, 73, textureX, textureY); // Box 182
		dd35aModel[69] = new ModelRendererTurbo(this, 481, 25, textureX, textureY); // Box 187
		dd35aModel[70] = new ModelRendererTurbo(this, 497, 57, textureX, textureY); // Box 188
		dd35aModel[71] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 189
		dd35aModel[72] = new ModelRendererTurbo(this, 273, 89, textureX, textureY); // Box 192
		dd35aModel[73] = new ModelRendererTurbo(this, 17, 33, textureX, textureY); // Box 193
		dd35aModel[74] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 194
		dd35aModel[75] = new ModelRendererTurbo(this, 473, 65, textureX, textureY); // Box 196
		dd35aModel[76] = new ModelRendererTurbo(this, 201, 49, textureX, textureY); // Box 197
		dd35aModel[77] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 119
		dd35aModel[78] = new ModelRendererTurbo(this, 425, 81, textureX, textureY); // Box 120
		dd35aModel[79] = new ModelRendererTurbo(this, 409, 89, textureX, textureY); // Box 121
		dd35aModel[80] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 122
		dd35aModel[81] = new ModelRendererTurbo(this, 89, 73, textureX, textureY); // Box 123
		dd35aModel[82] = new ModelRendererTurbo(this, 105, 73, textureX, textureY); // Box 124
		dd35aModel[83] = new ModelRendererTurbo(this, 449, 89, textureX, textureY); // Box 125
		dd35aModel[84] = new ModelRendererTurbo(this, 121, 73, textureX, textureY); // Box 126
		dd35aModel[85] = new ModelRendererTurbo(this, 113, 97, textureX, textureY); // Box 127
		dd35aModel[86] = new ModelRendererTurbo(this, 257, 97, textureX, textureY); // Box 128
		dd35aModel[87] = new ModelRendererTurbo(this, 73, 73, textureX, textureY); // Box 129
		dd35aModel[88] = new ModelRendererTurbo(this, 431, 87, textureX, textureY); // Box 130
		dd35aModel[89] = new ModelRendererTurbo(this, 281, 97, textureX, textureY); // Box 131
		dd35aModel[90] = new ModelRendererTurbo(this, 353, 97, textureX, textureY); // Box 132
		dd35aModel[91] = new ModelRendererTurbo(this, 145, 73, textureX, textureY); // Box 133
		dd35aModel[92] = new ModelRendererTurbo(this, 465, 73, textureX, textureY); // Box 134
		dd35aModel[93] = new ModelRendererTurbo(this, 481, 73, textureX, textureY); // Box 135
		dd35aModel[94] = new ModelRendererTurbo(this, 497, 73, textureX, textureY); // Box 136
		dd35aModel[95] = new ModelRendererTurbo(this, 345, 105, textureX, textureY); // Box 138
		dd35aModel[96] = new ModelRendererTurbo(this, 497, 81, textureX, textureY); // Box 139
		dd35aModel[97] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Box 140
		dd35aModel[98] = new ModelRendererTurbo(this, 393, 105, textureX, textureY); // Box 141
		dd35aModel[99] = new ModelRendererTurbo(this, 473, 89, textureX, textureY); // Box 143
		dd35aModel[100] = new ModelRendererTurbo(this, 369, 105, textureX, textureY); // Box 145
		dd35aModel[101] = new ModelRendererTurbo(this, 481, 105, textureX, textureY); // Box 146
		dd35aModel[102] = new ModelRendererTurbo(this, 49, 113, textureX, textureY); // Box 147
		dd35aModel[103] = new ModelRendererTurbo(this, 81, 113, textureX, textureY); // Box 148
		dd35aModel[104] = new ModelRendererTurbo(this, 145, 113, textureX, textureY); // Box 149
		dd35aModel[105] = new ModelRendererTurbo(this, 169, 113, textureX, textureY); // Box 150
		dd35aModel[106] = new ModelRendererTurbo(this, 137, 97, textureX, textureY); // Box 151
		dd35aModel[107] = new ModelRendererTurbo(this, 441, 105, textureX, textureY); // Box 152
		dd35aModel[108] = new ModelRendererTurbo(this, 153, 113, textureX, textureY); // Box 153
		dd35aModel[109] = new ModelRendererTurbo(this, 489, 89, textureX, textureY); // Box 154
		dd35aModel[110] = new ModelRendererTurbo(this, 505, 105, textureX, textureY); // Box 155
		dd35aModel[111] = new ModelRendererTurbo(this, 225, 49, textureX, textureY); // Box 156
		dd35aModel[112] = new ModelRendererTurbo(this, 433, 57, textureX, textureY); // Box 157
		dd35aModel[113] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 158
		dd35aModel[114] = new ModelRendererTurbo(this, 153, 41, textureX, textureY); // Box 159
		dd35aModel[115] = new ModelRendererTurbo(this, 449, 57, textureX, textureY); // Box 160
		dd35aModel[116] = new ModelRendererTurbo(this, 49, 65, textureX, textureY); // Box 161
		dd35aModel[117] = new ModelRendererTurbo(this, 417, 73, textureX, textureY); // Box 162
		dd35aModel[118] = new ModelRendererTurbo(this, 105, 81, textureX, textureY); // Box 163
		dd35aModel[119] = new ModelRendererTurbo(this, 193, 113, textureX, textureY); // Box 164
		dd35aModel[120] = new ModelRendererTurbo(this, 217, 113, textureX, textureY); // Box 165
		dd35aModel[121] = new ModelRendererTurbo(this, 433, 89, textureX, textureY); // Box 166
		dd35aModel[122] = new ModelRendererTurbo(this, 449, 89, textureX, textureY); // Box 167
		dd35aModel[123] = new ModelRendererTurbo(this, 457, 89, textureX, textureY); // Box 168
		dd35aModel[124] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 169
		dd35aModel[125] = new ModelRendererTurbo(this, 297, 113, textureX, textureY); // Box 170
		dd35aModel[126] = new ModelRendererTurbo(this, 201, 113, textureX, textureY); // Box 172
		dd35aModel[127] = new ModelRendererTurbo(this, 113, 81, textureX, textureY); // Box 173
		dd35aModel[128] = new ModelRendererTurbo(this, 233, 113, textureX, textureY); // Box 174
		dd35aModel[129] = new ModelRendererTurbo(this, 361, 57, textureX, textureY); // Box 175
		dd35aModel[130] = new ModelRendererTurbo(this, 441, 113, textureX, textureY); // Box 179
		dd35aModel[131] = new ModelRendererTurbo(this, 113, 97, textureX, textureY, "lamp"); // Box 180
		dd35aModel[132] = new ModelRendererTurbo(this, 241, 113, textureX, textureY, "lamp"); // Box 181
		dd35aModel[133] = new ModelRendererTurbo(this, 321, 113, textureX, textureY, "lamp"); // Box 182
		dd35aModel[134] = new ModelRendererTurbo(this, 409, 113, textureX, textureY); // Box 183
		dd35aModel[135] = new ModelRendererTurbo(this, 33, 81, textureX, textureY); // Box 184
		dd35aModel[136] = new ModelRendererTurbo(this, 337, 113, textureX, textureY); // Box 185
		dd35aModel[137] = new ModelRendererTurbo(this, 281, 97, textureX, textureY); // Box 186
		dd35aModel[138] = new ModelRendererTurbo(this, 113, 121, textureX, textureY); // Box 187
		dd35aModel[139] = new ModelRendererTurbo(this, 113, 105, textureX, textureY); // Box 188
		dd35aModel[140] = new ModelRendererTurbo(this, 185, 121, textureX, textureY); // Box 189
		dd35aModel[141] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 190
		dd35aModel[142] = new ModelRendererTurbo(this, 265, 121, textureX, textureY); // Box 191
		dd35aModel[143] = new ModelRendererTurbo(this, 433, 17, textureX, textureY); // Box 192
		dd35aModel[144] = new ModelRendererTurbo(this, 89, 81, textureX, textureY); // Box 193
		dd35aModel[145] = new ModelRendererTurbo(this, 385, 105, textureX, textureY); // Box 194
		dd35aModel[146] = new ModelRendererTurbo(this, 289, 113, textureX, textureY); // Box 195
		dd35aModel[147] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 196
		dd35aModel[148] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 198
		dd35aModel[149] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 199
		dd35aModel[150] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 200
		dd35aModel[151] = new ModelRendererTurbo(this, 281, 121, textureX, textureY); // Box 201
		dd35aModel[152] = new ModelRendererTurbo(this, 297, 121, textureX, textureY); // Box 202
		dd35aModel[153] = new ModelRendererTurbo(this, 1, 9, textureX, textureY, "lamp"); // Box 162
		dd35aModel[154] = new ModelRendererTurbo(this, 505, 9, textureX, textureY); // Box 165
		dd35aModel[155] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 166
		dd35aModel[156] = new ModelRendererTurbo(this, 1, 113, textureX, textureY, "lamp"); // Box 164
		dd35aModel[157] = new ModelRendererTurbo(this, 241, 121, textureX, textureY); // Box 165
		dd35aModel[158] = new ModelRendererTurbo(this, 297, 121, textureX, textureY); // Box 166
		dd35aModel[159] = new ModelRendererTurbo(this, 409, 121, textureX, textureY); // Box 167
		dd35aModel[160] = new ModelRendererTurbo(this, 425, 121, textureX, textureY); // Box 168
		dd35aModel[161] = new ModelRendererTurbo(this, 385, 105, textureX, textureY); // Box 161
		dd35aModel[162] = new ModelRendererTurbo(this, 289, 113, textureX, textureY); // Box 162
		dd35aModel[163] = new ModelRendererTurbo(this, 89, 81, textureX, textureY); // Box 163
		dd35aModel[164] = new ModelRendererTurbo(this, 71, 129, textureX, textureY); // Box 164
		dd35aModel[165] = new ModelRendererTurbo(this, 44, 129, textureX, textureY); // Box 165
		dd35aModel[166] = new ModelRendererTurbo(this, 16, 11, textureX, textureY); // Box 166
		dd35aModel[167] = new ModelRendererTurbo(this, 16, 19, textureX, textureY); // Box 167
		dd35aModel[168] = new ModelRendererTurbo(this, 9, 19, textureX, textureY); // Box 168
		dd35aModel[169] = new ModelRendererTurbo(this, 2, 19, textureX, textureY); // Box 169

		dd35aModel[0].addBox(0F, 0F, -1F, 8, 2, 2, 0F); // Box 5
		dd35aModel[0].setRotationPoint(-24F, 1F, 0F);

		dd35aModel[1].addBox(0F, 0F, -1F, 8, 2, 2, 0F); // Box 7
		dd35aModel[1].setRotationPoint(104F, 1F, 0F);

		dd35aModel[2].addBox(0F, 0F, 0F, 48, 23, 10, 0F); // Box 11
		dd35aModel[2].setRotationPoint(6F, -25F, -5F);

		dd35aModel[3].addBox(0F, 0F, 0F, 122, 2, 4, 0F); // Box 31
		dd35aModel[3].setRotationPoint(-17F, -2F, -9F);

		dd35aModel[4].addBox(0F, 0F, -5F, 128, 4, 10, 0F); // Box 33
		dd35aModel[4].setRotationPoint(-20F, -2F, 0F);

		dd35aModel[5].addBox(0F, 0F, 0F, 122, 2, 4, 0F); // Box 34
		dd35aModel[5].setRotationPoint(-17F, -2F, 5F);

		dd35aModel[6].addShapeBox(0F, 0F, -1F, 2, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 35
		dd35aModel[6].setRotationPoint(-22F, -2F, 0F);

		dd35aModel[7].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 36
		dd35aModel[7].setRotationPoint(-22F, -2F, 1F);

		dd35aModel[8].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		dd35aModel[8].setRotationPoint(-22F, -2F, -7F);

		dd35aModel[9].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 58
		dd35aModel[9].setRotationPoint(108F, -2F, 1F);

		dd35aModel[10].addShapeBox(0F, 0F, -1F, 2, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 59
		dd35aModel[10].setRotationPoint(108F, -2F, 0F);

		dd35aModel[11].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 60
		dd35aModel[11].setRotationPoint(108F, -2F, -7F);

		dd35aModel[12].addBox(0F, 0F, 0F, 1, 7, 4, 0F); // Box 61
		dd35aModel[12].setRotationPoint(-17F, 0F, -9F);

		dd35aModel[13].addBox(0F, 0F, 0F, 1, 7, 4, 0F); // Box 62
		dd35aModel[13].setRotationPoint(-17F, 0F, 5F);

		dd35aModel[14].addBox(0F, 0F, 0F, 1, 7, 4, 0F); // Box 63
		dd35aModel[14].setRotationPoint(104F, 0F, 5F);

		dd35aModel[15].addBox(0F, 0F, 0F, 1, 7, 4, 0F); // Box 64
		dd35aModel[15].setRotationPoint(104F, 0F, -9F);

		dd35aModel[16].addBox(0F, 0F, 0F, 3, 0, 3, 0F); // Box 65
		dd35aModel[16].setRotationPoint(-20F, 3F, -8F);

		dd35aModel[17].addBox(0F, 0F, 0F, 3, 0, 3, 0F); // Box 66
		dd35aModel[17].setRotationPoint(-20F, 7F, -8F);

		dd35aModel[18].addBox(0F, 0F, 0F, 3, 0, 3, 0F); // Box 68
		dd35aModel[18].setRotationPoint(-20F, 3F, 5F);

		dd35aModel[19].addBox(0F, 0F, 0F, 3, 0, 3, 0F); // Box 69
		dd35aModel[19].setRotationPoint(-20F, 7F, 5F);

		dd35aModel[20].addBox(0F, 0F, 0F, 3, 0, 3, 0F); // Box 70
		dd35aModel[20].setRotationPoint(105F, 3F, 5F);

		dd35aModel[21].addBox(0F, 0F, 0F, 3, 0, 3, 0F); // Box 71
		dd35aModel[21].setRotationPoint(105F, 7F, 5F);

		dd35aModel[22].addBox(0F, 0F, 0F, 3, 0, 3, 0F); // Box 72
		dd35aModel[22].setRotationPoint(105F, 7F, -8F);

		dd35aModel[23].addBox(0F, 0F, 0F, 3, 0, 3, 0F); // Box 73
		dd35aModel[23].setRotationPoint(105F, 3F, -8F);

		dd35aModel[24].addBox(0F, 0F, 0F, 95, 9, 0, 0F); // Box 66
		dd35aModel[24].setRotationPoint(10F, -11F, 9F);

		dd35aModel[25].addBox(0F, 0F, 0F, 95, 9, 0, 0F); // Box 67
		dd35aModel[25].setRotationPoint(10F, -11F, -9F);

		dd35aModel[26].addBox(0F, 0F, -9F, 50, 3, 18, 0F); // Box 76
		dd35aModel[26].setRotationPoint(19F, 1F, 0F);

		dd35aModel[27].addBox(0F, 0F, 0F, 1, 2, 18, 0F); // Box 81
		dd35aModel[27].setRotationPoint(86F, 0F, -9F);

		dd35aModel[28].addBox(0F, 0F, 0F, 1, 2, 18, 0F); // Box 82
		dd35aModel[28].setRotationPoint(69F, 0F, -9F);

		dd35aModel[29].addBox(0F, 0F, 0F, 1, 2, 18, 0F); // Box 83
		dd35aModel[29].setRotationPoint(18F, 0F, -9F);

		dd35aModel[30].addBox(0F, 0F, 0F, 1, 2, 18, 0F); // Box 84
		dd35aModel[30].setRotationPoint(1F, 0F, -9F);

		dd35aModel[31].addShapeBox(0F, 0F, -9F, 50, 4, 18, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 85
		dd35aModel[31].setRotationPoint(19F, 4F, 0F);

		dd35aModel[32].addBox(0F, 0F, -7F, 1, 2, 14, 0F); // Box 87
		dd35aModel[32].setRotationPoint(-15F, 4F, 0F);

		dd35aModel[33].addBox(0F, 0F, -7F, 1, 2, 14, 0F); // Box 88
		dd35aModel[33].setRotationPoint(17F, 4F, 0F);

		dd35aModel[34].addBox(0F, 0F, -5F, 29, 3, 10, 0F); // Box 91
		dd35aModel[34].setRotationPoint(-13F, 2F, 0F);

		dd35aModel[35].addBox(0F, 0F, -8F, 1, 1, 16, 0F); // Box 92
		dd35aModel[35].setRotationPoint(5F, 6F, 0F);

		dd35aModel[36].addBox(0F, 0F, -8F, 1, 1, 16, 0F); // Box 93
		dd35aModel[36].setRotationPoint(-3F, 6F, 0F);

		dd35aModel[37].addBox(0F, 0F, -8F, 1, 1, 16, 0F); // Box 94
		dd35aModel[37].setRotationPoint(-11F, 6F, 0F);

		dd35aModel[38].addBox(0F, 0F, 0F, 33, 4, 0, 0F); // Box 118
		dd35aModel[38].setRotationPoint(-15F, 3F, -7.01F);

		dd35aModel[39].addBox(0F, 0F, 0F, 33, 4, 0, 0F); // Box 119
		dd35aModel[39].setRotationPoint(-15F, 3F, 7.01F);

		dd35aModel[40].addBox(0F, 0F, 0F, 7, 7, 0, 0F); // Box 123
		dd35aModel[40].setRotationPoint(2F, 3F, -6F);

		dd35aModel[41].addBox(0F, 0F, 0F, 7, 7, 0, 0F); // Box 124
		dd35aModel[41].setRotationPoint(-6F, 3F, -6F);

		dd35aModel[42].addBox(0F, 0F, 0F, 7, 7, 0, 0F); // Box 125
		dd35aModel[42].setRotationPoint(-14F, 3F, -6F);

		dd35aModel[43].addBox(0F, 0F, 0F, 7, 7, 0, 0F); // Box 126
		dd35aModel[43].setRotationPoint(2F, 3F, 6F);

		dd35aModel[44].addBox(0F, 0F, 0F, 7, 7, 0, 0F); // Box 127
		dd35aModel[44].setRotationPoint(-6F, 3F, 6F);

		dd35aModel[45].addBox(0F, 0F, 0F, 7, 7, 0, 0F); // Box 128
		dd35aModel[45].setRotationPoint(-14F, 3F, 6F);

		dd35aModel[46].addShapeBox(0F, 0F, 0F, 0, 6, 3, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 143
		dd35aModel[46].setRotationPoint(-20.01F, -11F, 6F);

		dd35aModel[47].addShapeBox(0F, 0F, 0F, 0, 6, 3, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 144
		dd35aModel[47].setRotationPoint(-20.01F, -11F, -9F);

		dd35aModel[48].addShapeBox(0F, 0F, 0F, 0, 6, 3, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 145
		dd35aModel[48].setRotationPoint(108.01F, -11F, -9F);

		dd35aModel[49].addShapeBox(0F, 0F, 0F, 0, 6, 3, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 146
		dd35aModel[49].setRotationPoint(108.01F, -11F, 6F);

		dd35aModel[50].addBox(0F, 0F, 0F, 7, 7, 0, 0F); // Box 159
		dd35aModel[50].setRotationPoint(10F, 3F, 6F);

		dd35aModel[51].addBox(0F, 0F, -8F, 1, 1, 16, 0F); // Box 160
		dd35aModel[51].setRotationPoint(13F, 6F, 0F);

		dd35aModel[52].addBox(0F, 0F, 0F, 7, 7, 0, 0F); // Box 161
		dd35aModel[52].setRotationPoint(10F, 3F, -6F);

		dd35aModel[53].addBox(0F, 0F, 0F, 48, 23, 10, 0F); // Box 162
		dd35aModel[53].setRotationPoint(58F, -25F, -5F);

		dd35aModel[54].addBox(0F, 0F, 0F, 4, 5, 10, 0F); // Box 163
		dd35aModel[54].setRotationPoint(54F, -25F, -5F);

		dd35aModel[55].addBox(0F, 0F, 0F, 6, 1, 6, 0F); // Box 164
		dd35aModel[55].setRotationPoint(47.35F, -27F, -3F);

		dd35aModel[56].addBox(0F, 0F, 0F, 6, 1, 6, 0F); // Box 165
		dd35aModel[56].setRotationPoint(40.5F, -27F, -3F);

		dd35aModel[57].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 166
		dd35aModel[57].setRotationPoint(35.7F, -27F, -2F);

		dd35aModel[58].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 167
		dd35aModel[58].setRotationPoint(72.3F, -27F, -2F);

		dd35aModel[59].addBox(0F, 0F, 0F, 6, 1, 6, 0F); // Box 168
		dd35aModel[59].setRotationPoint(65.5F, -27F, -3F);

		dd35aModel[60].addBox(0F, 0F, 0F, 6, 1, 6, 0F); // Box 169
		dd35aModel[60].setRotationPoint(58.85F, -27F, -3F);

		dd35aModel[61].addBox(0F, 0F, 0F, 6, 1, 6, 0F); // Box 170
		dd35aModel[61].setRotationPoint(23F, -26F, -3F);

		dd35aModel[62].addBox(0F, 0F, 0F, 6, 1, 6, 0F); // Box 171
		dd35aModel[62].setRotationPoint(86F, -26F, -3F);

		dd35aModel[63].addShapeBox(0F, 0F, 0F, 71, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 174
		dd35aModel[63].setRotationPoint(22F, -25F, 5F);

		dd35aModel[64].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -2F); // Box 175
		dd35aModel[64].setRotationPoint(19F, -25F, 5F);

		dd35aModel[65].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 177
		dd35aModel[65].setRotationPoint(19F, -23F, 5F);

		dd35aModel[66].addShapeBox(0F, 0F, 0F, 71, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 178
		dd35aModel[66].setRotationPoint(22F, -23F, 5F);

		dd35aModel[67].addBox(0F, 0F, 0F, 2, 1, 6, 0F); // Box 181
		dd35aModel[67].setRotationPoint(18F, -26F, -3F);

		dd35aModel[68].addBox(0F, 0F, 0F, 2, 1, 6, 0F); // Box 182
		dd35aModel[68].setRotationPoint(95F, -26F, -3F);

		dd35aModel[69].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 187
		dd35aModel[69].setRotationPoint(93F, -23F, 5F);

		dd35aModel[70].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -0.5F); // Box 188
		dd35aModel[70].setRotationPoint(93F, -25F, 5F);

		dd35aModel[71].addShapeBox(0F, 0F, 0F, 71, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 189
		dd35aModel[71].setRotationPoint(22F, -25F, -7F);

		dd35aModel[72].addShapeBox(0F, 0F, 0F, 71, 1, 1, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 192
		dd35aModel[72].setRotationPoint(22F, -23F, -6F);

		dd35aModel[73].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 193
		dd35aModel[73].setRotationPoint(19F, -23F, -6F);

		dd35aModel[74].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 194
		dd35aModel[74].setRotationPoint(19F, -25F, -7F);

		dd35aModel[75].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 196
		dd35aModel[75].setRotationPoint(93F, -25F, -7F);

		dd35aModel[76].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 197
		dd35aModel[76].setRotationPoint(93F, -23F, -6F);

		dd35aModel[77].addShapeBox(0F, 0F, -7F, 46, 1, 14, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 119
		dd35aModel[77].setRotationPoint(33F, -26F, 0F);

		dd35aModel[78].addBox(0F, 0F, 0F, 33, 4, 0, 0F); // Box 120
		dd35aModel[78].setRotationPoint(70F, 3F, 7.01F);

		dd35aModel[79].addBox(0F, 0F, -8F, 1, 1, 16, 0F); // Box 121
		dd35aModel[79].setRotationPoint(90F, 6F, 0F);

		dd35aModel[80].addBox(0F, 0F, 0F, 7, 7, 0, 0F); // Box 122
		dd35aModel[80].setRotationPoint(95F, 3F, 6F);

		dd35aModel[81].addBox(0F, 0F, 0F, 7, 7, 0, 0F); // Box 123
		dd35aModel[81].setRotationPoint(87F, 3F, 6F);

		dd35aModel[82].addBox(0F, 0F, 0F, 7, 7, 0, 0F); // Box 124
		dd35aModel[82].setRotationPoint(79F, 3F, 6F);

		dd35aModel[83].addBox(0F, 0F, -8F, 1, 1, 16, 0F); // Box 125
		dd35aModel[83].setRotationPoint(82F, 6F, 0F);

		dd35aModel[84].addBox(0F, 0F, 0F, 7, 7, 0, 0F); // Box 126
		dd35aModel[84].setRotationPoint(71F, 3F, 6F);

		dd35aModel[85].addBox(0F, 0F, -8F, 1, 1, 16, 0F); // Box 127
		dd35aModel[85].setRotationPoint(74F, 6F, 0F);

		dd35aModel[86].addBox(0F, 0F, -8F, 1, 1, 16, 0F); // Box 128
		dd35aModel[86].setRotationPoint(98F, 6F, 0F);

		dd35aModel[87].addBox(0F, 0F, -7F, 1, 2, 14, 0F); // Box 129
		dd35aModel[87].setRotationPoint(70F, 4F, 0F);

		dd35aModel[88].addBox(0F, 0F, -7F, 1, 2, 14, 0F); // Box 130
		dd35aModel[88].setRotationPoint(102F, 4F, 0F);

		dd35aModel[89].addBox(0F, 0F, -5F, 29, 3, 10, 0F); // Box 131
		dd35aModel[89].setRotationPoint(72F, 2F, 0F);

		dd35aModel[90].addBox(0F, 0F, 0F, 33, 4, 0, 0F); // Box 132
		dd35aModel[90].setRotationPoint(70F, 3F, -7.01F);

		dd35aModel[91].addBox(0F, 0F, 0F, 7, 7, 0, 0F); // Box 133
		dd35aModel[91].setRotationPoint(71F, 3F, -6F);

		dd35aModel[92].addBox(0F, 0F, 0F, 7, 7, 0, 0F); // Box 134
		dd35aModel[92].setRotationPoint(79F, 3F, -6F);

		dd35aModel[93].addBox(0F, 0F, 0F, 7, 7, 0, 0F); // Box 135
		dd35aModel[93].setRotationPoint(87F, 3F, -6F);

		dd35aModel[94].addBox(0F, 0F, 0F, 7, 7, 0, 0F); // Box 136
		dd35aModel[94].setRotationPoint(95F, 3F, -6F);

		dd35aModel[95].addBox(0F, 0F, 0F, 2, 1, 18, 0F); // Box 138
		dd35aModel[95].setRotationPoint(44F, 0F, -9F);

		dd35aModel[96].addShapeBox(0F, 0F, 0F, 2, 15, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 139
		dd35aModel[96].setRotationPoint(-18F, -17F, 0F);

		dd35aModel[97].addBox(0F, 0F, -5F, 11, 15, 10, 0F); // Box 140
		dd35aModel[97].setRotationPoint(-16F, -17F, 0F);

		dd35aModel[98].addShapeBox(0F, 0F, 0F, 2, 15, 5, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 141
		dd35aModel[98].setRotationPoint(-18F, -17F, -5F);

		dd35aModel[99].addBox(0F, 0F, 0F, 6, 13, 0, 0F); // Box 143
		dd35aModel[99].setRotationPoint(-17F, -15F, 9F);

		dd35aModel[100].addBox(0F, 0F, 0F, 5, 6, 4, 0F); // Box 145
		dd35aModel[100].setRotationPoint(-11F, -8F, 5F);

		dd35aModel[101].addBox(0F, 0F, 0F, 4, 6, 4, 0F); // Box 146
		dd35aModel[101].setRotationPoint(6F, -8F, 5F);

		dd35aModel[102].addBox(0F, 0F, 0F, 12, 13, 1, 0F); // Box 147
		dd35aModel[102].setRotationPoint(-6F, -15F, 8F);

		dd35aModel[103].addBox(0F, 0F, 0F, 12, 13, 1, 0F); // Box 148
		dd35aModel[103].setRotationPoint(-6F, -15F, -9F);

		dd35aModel[104].addBox(0F, 0F, 0F, 4, 6, 4, 0F); // Box 149
		dd35aModel[104].setRotationPoint(6F, -8F, -9F);

		dd35aModel[105].addBox(0F, 0F, 0F, 5, 6, 4, 0F); // Box 150
		dd35aModel[105].setRotationPoint(-11F, -8F, -9F);

		dd35aModel[106].addBox(0F, 0F, 0F, 1, 12, 3, 0F); // Box 151
		dd35aModel[106].setRotationPoint(-6F, -14F, 5F);

		dd35aModel[107].addBox(0F, 0F, 0F, 1, 12, 3, 0F); // Box 152
		dd35aModel[107].setRotationPoint(-6F, -14F, -8F);

		dd35aModel[108].addBox(0F, 0F, -6F, 1, 22, 12, 0F); // Box 153
		dd35aModel[108].setRotationPoint(5F, -24F, 0F);

		dd35aModel[109].addBox(0F, 0F, 0F, 1, 12, 2, 0F); // Box 154
		dd35aModel[109].setRotationPoint(5F, -14F, 6F);

		dd35aModel[110].addBox(0F, 0F, 0F, 1, 12, 2, 0F); // Box 155
		dd35aModel[110].setRotationPoint(5F, -14F, -8F);

		dd35aModel[111].addBox(0F, 0F, 0F, 0, 7, 2, 0F); // Box 156
		dd35aModel[111].setRotationPoint(5.5F, -21F, 6F);

		dd35aModel[112].addBox(0F, 0F, 0F, 0, 7, 2, 0F); // Box 157
		dd35aModel[112].setRotationPoint(5.5F, -21F, -8F);

		dd35aModel[113].addBox(0F, 0F, 0F, 2, 6, 1, 0F); // Box 158
		dd35aModel[113].setRotationPoint(-6F, -21F, -9F);

		dd35aModel[114].addBox(0F, 0F, 0F, 2, 6, 1, 0F); // Box 159
		dd35aModel[114].setRotationPoint(4F, -21F, -9F);

		dd35aModel[115].addBox(0F, 0F, 0F, 1, 6, 1, 0F); // Box 160
		dd35aModel[115].setRotationPoint(-0.5F, -21F, -9F);

		dd35aModel[116].addBox(0F, 0F, 0F, 1, 6, 1, 0F); // Box 161
		dd35aModel[116].setRotationPoint(-0.5F, -21F, 8F);

		dd35aModel[117].addBox(0F, 0F, 0F, 2, 6, 1, 0F); // Box 162
		dd35aModel[117].setRotationPoint(-6F, -21F, 8F);

		dd35aModel[118].addBox(0F, 0F, 0F, 2, 6, 1, 0F); // Box 163
		dd35aModel[118].setRotationPoint(4F, -21F, 8F);

		dd35aModel[119].addBox(0F, 0F, 0F, 8, 6, 0, 0F); // Box 164
		dd35aModel[119].setRotationPoint(-4F, -21F, 8.5F);

		dd35aModel[120].addBox(0F, 0F, 0F, 8, 6, 0, 0F); // Box 165
		dd35aModel[120].setRotationPoint(-4F, -21F, -8.5F);

		dd35aModel[121].addBox(0F, 0F, 0F, 1, 7, 1, 0F); // Box 166
		dd35aModel[121].setRotationPoint(-6F, -21F, 5F);

		dd35aModel[122].addBox(0F, 0F, 0F, 0, 7, 2, 0F); // Box 167
		dd35aModel[122].setRotationPoint(-5.5F, -21F, 6F);

		dd35aModel[123].addBox(0F, 0F, 0F, 0, 7, 2, 0F); // Box 168
		dd35aModel[123].setRotationPoint(-5.5F, -21F, -8F);

		dd35aModel[124].addBox(0F, 0F, 0F, 1, 7, 1, 0F); // Box 169
		dd35aModel[124].setRotationPoint(-6F, -21F, -6F);

		dd35aModel[125].addShapeBox(0F, 0F, 0F, 10, 2, 1, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 170
		dd35aModel[125].setRotationPoint(-5F, -23F, 8F);

		dd35aModel[126].addBox(0F, 0F, -6F, 1, 3, 12, 0F); // Box 172
		dd35aModel[126].setRotationPoint(-6F, -24F, 0F);

		dd35aModel[127].addBox(0F, 0F, -1F, 1, 4, 2, 0F); // Box 173
		dd35aModel[127].setRotationPoint(-6F, -21F, 0F);

		dd35aModel[128].addBox(0F, 0F, -6F, 0, 4, 12, 0F); // Box 174
		dd35aModel[128].setRotationPoint(-5.5F, -21F, 0F);

		dd35aModel[129].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 175
		dd35aModel[129].setRotationPoint(-6F, -23F, 6F);

		dd35aModel[130].addBox(0F, 0F, -6F, 12, 1, 12, 0F); // Box 179
		dd35aModel[130].setRotationPoint(-6F, -25F, 0F);

		dd35aModel[131].addBox(0F, 0F, -1F, 4, 3, 2, 0F); // Box 180
		dd35aModel[131].setRotationPoint(-10F, -25F, 0F);

		dd35aModel[132].addShapeBox(0F, 0F, 0F, 3, 3, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 181
		dd35aModel[132].setRotationPoint(-9F, -25F, 1F);

		dd35aModel[133].addShapeBox(0F, 0F, 0F, 3, 3, 5, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 182
		dd35aModel[133].setRotationPoint(-9F, -25F, -6F);

		dd35aModel[134].addShapeBox(0F, 0F, 0F, 12, 3, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 183
		dd35aModel[134].setRotationPoint(-6F, -25F, 6F);

		dd35aModel[135].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 184
		dd35aModel[135].setRotationPoint(5F, -23F, 6F);

		dd35aModel[136].addShapeBox(0F, 0F, 0F, 10, 2, 1, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 185
		dd35aModel[136].setRotationPoint(-5F, -23F, -9F);

		dd35aModel[137].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 186
		dd35aModel[137].setRotationPoint(5F, -23F, -9F);

		dd35aModel[138].addShapeBox(0F, 0F, 0F, 12, 3, 3, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 187
		dd35aModel[138].setRotationPoint(-6F, -25F, -9F);

		dd35aModel[139].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 188
		dd35aModel[139].setRotationPoint(-6F, -23F, -9F);

		dd35aModel[140].addBox(0F, 0F, -4F, 1, 6, 8, 0F); // Box 189
		dd35aModel[140].setRotationPoint(-5F, -17F, 0F);

		dd35aModel[141].addBox(0F, 0F, 0F, 5, 1, 0, 0F); // Box 190
		dd35aModel[141].setRotationPoint(-11F, -15F, 9F);

		dd35aModel[142].addBox(0F, 0F, 0F, 6, 13, 0, 0F); // Box 191
		dd35aModel[142].setRotationPoint(-17F, -15F, -9F);

		dd35aModel[143].addBox(0F, 0F, 0F, 5, 1, 0, 0F); // Box 192
		dd35aModel[143].setRotationPoint(-11F, -15F, -9F);

		dd35aModel[144].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 193
		dd35aModel[144].setRotationPoint(35F, -28F, 5F);

		dd35aModel[145].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 194
		dd35aModel[145].setRotationPoint(34F, -28F, 3F);

		dd35aModel[146].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 195
		dd35aModel[146].setRotationPoint(36F, -27F, 3F);

		dd35aModel[147].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 196
		dd35aModel[147].setRotationPoint(6F, -15F, 9F);

		dd35aModel[148].addShapeBox(0F, 0F, 0F, 1, 4, 0, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, 2.5F, 0F, 0F, 2.5F, 0F, 0F, -2F, 0F, 0F); // Box 198
		dd35aModel[148].setRotationPoint(8F, -15F, 9F);

		dd35aModel[149].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 199
		dd35aModel[149].setRotationPoint(6F, -15F, -9F);

		dd35aModel[150].addShapeBox(0F, 0F, 0F, 1, 4, 0, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, 2.5F, 0F, 0F, 2.5F, 0F, 0F, -2F, 0F, 0F); // Box 200
		dd35aModel[150].setRotationPoint(8F, -15F, -9F);

		dd35aModel[151].addBox(0F, 0F, 0F, 5, 11, 1, 0F); // Box 201
		dd35aModel[151].setRotationPoint(99F, -13F, 5F);

		dd35aModel[152].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 202
		dd35aModel[152].setRotationPoint(99F, -16F, 5F);

		dd35aModel[153].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 162
		dd35aModel[153].setRotationPoint(-4F, -27F, -0.5F);

		dd35aModel[154].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0.3F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, 0.3F, -0.5F, 0.1F, 0.3F, 0F, 0.1F, -1F, 0F, 0.1F, -1F, 0F, 0.1F, 0.3F, 0F, 0.1F); // Box 165
		dd35aModel[154].setRotationPoint(-3.82F, -26F, -0.5F);

		dd35aModel[155].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 166
		dd35aModel[155].setRotationPoint(-12F, -18F, 1F);

		dd35aModel[156].addBox(0F, 0F, -1.5F, 1, 2, 3, 0F); // Box 164
		dd35aModel[156].setRotationPoint(106F, -24F, 0F);

		dd35aModel[157].addBox(0F, 0F, -9F, 0, 20, 18, 0F); // Box 165
		dd35aModel[157].setRotationPoint(-20.01F, -11F, 0F);

		dd35aModel[158].addBox(0F, 0F, -9F, 0, 20, 18, 0F); // Box 166
		dd35aModel[158].setRotationPoint(108.01F, -11F, 0F);

		dd35aModel[159].addBox(0F, 0F, 0F, 4, 7, 0, 0F); // Box 167
		dd35aModel[159].setRotationPoint(14F, 0F, 9F);

		dd35aModel[160].addBox(0F, 0F, 0F, 4, 7, 0, 0F); // Box 168
		dd35aModel[160].setRotationPoint(14F, 0F, -9F);

		dd35aModel[161].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 161
		dd35aModel[161].setRotationPoint(73F, -28F, -6F);

		dd35aModel[162].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 162
		dd35aModel[162].setRotationPoint(75F, -27F, -6F);

		dd35aModel[163].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 163
		dd35aModel[163].setRotationPoint(74F, -28F, -4F);

		dd35aModel[164].addShapeBox(0F, 0F, -3F, 9, 1, 6, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 164
		dd35aModel[164].setRotationPoint(8F, -26F, 0F);

		dd35aModel[165].addShapeBox(0F, 0F, -3F, 7, 1, 6, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 165
		dd35aModel[165].setRotationPoint(98F, -26F, 0F);

		dd35aModel[166].addShapeBox(0F, 0F, 0F, 3, 3, 0, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 166
		dd35aModel[166].setRotationPoint(-16F, -15F, -9F);

		dd35aModel[167].addShapeBox(0F, 0F, 0F, 3, 3, 0, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 167
		dd35aModel[167].setRotationPoint(-16F, -15F, 9F);

		dd35aModel[168].addShapeBox(0F, 0F, 0F, 3, 3, 0, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 168
		dd35aModel[168].setRotationPoint(101F, -11F, 9F);

		dd35aModel[169].addShapeBox(0F, 0F, 0F, 3, 3, 0, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 169
		dd35aModel[169].setRotationPoint(101F, -11F, -9F);


	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		for(int i = 0; i < 170; i++)
		{
			if(dd35aModel[i].boxName!= null && dd35aModel[i].boxName.equals("lamp")){
				Minecraft.getMinecraft().entityRenderer.disableLightmap(1D);
				dd35aModel[i].render(f5);
				Minecraft.getMinecraft().entityRenderer.enableLightmap(1D);

			} else {
				dd35aModel[i].render(f5);
			}
		}
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
	{
	}

	public ModelRendererTurbo dd35aModel[];
}