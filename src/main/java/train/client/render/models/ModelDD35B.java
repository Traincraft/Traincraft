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

public class ModelDD35B extends ModelBase
{
	int textureX = 512;
	int textureY = 128;

	public ModelDD35B()
	{
		dd35bModel = new ModelRendererTurbo[116];
		dd35bModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 5
		dd35bModel[1] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 7
		dd35bModel[2] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 11
		dd35bModel[3] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 31
		dd35bModel[4] = new ModelRendererTurbo(this, 161, 9, textureX, textureY); // Box 33
		dd35bModel[5] = new ModelRendererTurbo(this, 161, 25, textureX, textureY); // Box 34
		dd35bModel[6] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 35
		dd35bModel[7] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 36
		dd35bModel[8] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 38
		dd35bModel[9] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 58
		dd35bModel[10] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 59
		dd35bModel[11] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 60
		dd35bModel[12] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 61
		dd35bModel[13] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 62
		dd35bModel[14] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 63
		dd35bModel[15] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 64
		dd35bModel[16] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 65
		dd35bModel[17] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 66
		dd35bModel[18] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 68
		dd35bModel[19] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 69
		dd35bModel[20] = new ModelRendererTurbo(this, 425, 17, textureX, textureY); // Box 70
		dd35bModel[21] = new ModelRendererTurbo(this, 441, 17, textureX, textureY); // Box 71
		dd35bModel[22] = new ModelRendererTurbo(this, 457, 17, textureX, textureY); // Box 72
		dd35bModel[23] = new ModelRendererTurbo(this, 473, 17, textureX, textureY); // Box 73
		dd35bModel[24] = new ModelRendererTurbo(this, 409, 9, textureX, textureY); // Box 74
		dd35bModel[25] = new ModelRendererTurbo(this, 161, 33, textureX, textureY); // Box 66
		dd35bModel[26] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 67
		dd35bModel[27] = new ModelRendererTurbo(this, 185, 49, textureX, textureY); // Box 76
		dd35bModel[28] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 81
		dd35bModel[29] = new ModelRendererTurbo(this, 449, 17, textureX, textureY); // Box 82
		dd35bModel[30] = new ModelRendererTurbo(this, 353, 25, textureX, textureY); // Box 83
		dd35bModel[31] = new ModelRendererTurbo(this, 473, 25, textureX, textureY); // Box 84
		dd35bModel[32] = new ModelRendererTurbo(this, 281, 49, textureX, textureY); // Box 85
		dd35bModel[33] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 87
		dd35bModel[34] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 88
		dd35bModel[35] = new ModelRendererTurbo(this, 353, 49, textureX, textureY); // Box 91
		dd35bModel[36] = new ModelRendererTurbo(this, 433, 41, textureX, textureY); // Box 92
		dd35bModel[37] = new ModelRendererTurbo(this, 257, 49, textureX, textureY); // Box 93
		dd35bModel[38] = new ModelRendererTurbo(this, 457, 49, textureX, textureY); // Box 94
		dd35bModel[39] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 118
		dd35bModel[40] = new ModelRendererTurbo(this, 73, 41, textureX, textureY); // Box 119
		dd35bModel[41] = new ModelRendererTurbo(this, 489, 17, textureX, textureY); // Box 126
		dd35bModel[42] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 127
		dd35bModel[43] = new ModelRendererTurbo(this, 17, 25, textureX, textureY); // Box 128
		dd35bModel[44] = new ModelRendererTurbo(this, 161, 9, textureX, textureY); // Box 143
		dd35bModel[45] = new ModelRendererTurbo(this, 505, 17, textureX, textureY); // Box 144
		dd35bModel[46] = new ModelRendererTurbo(this, 377, 25, textureX, textureY); // Box 145
		dd35bModel[47] = new ModelRendererTurbo(this, 385, 25, textureX, textureY); // Box 146
		dd35bModel[48] = new ModelRendererTurbo(this, 393, 25, textureX, textureY); // Box 159
		dd35bModel[49] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 160
		dd35bModel[50] = new ModelRendererTurbo(this, 41, 65, textureX, textureY); // Box 162
		dd35bModel[51] = new ModelRendererTurbo(this, 481, 49, textureX, textureY); // Box 163
		dd35bModel[52] = new ModelRendererTurbo(this, 137, 41, textureX, textureY); // Box 164
		dd35bModel[53] = new ModelRendererTurbo(this, 25, 65, textureX, textureY); // Box 165
		dd35bModel[54] = new ModelRendererTurbo(this, 473, 25, textureX, textureY); // Box 166
		dd35bModel[55] = new ModelRendererTurbo(this, 281, 49, textureX, textureY); // Box 167
		dd35bModel[56] = new ModelRendererTurbo(this, 153, 65, textureX, textureY); // Box 168
		dd35bModel[57] = new ModelRendererTurbo(this, 377, 65, textureX, textureY); // Box 169
		dd35bModel[58] = new ModelRendererTurbo(this, 409, 65, textureX, textureY); // Box 170
		dd35bModel[59] = new ModelRendererTurbo(this, 161, 73, textureX, textureY); // Box 171
		dd35bModel[60] = new ModelRendererTurbo(this, 425, 49, textureX, textureY); // Box 174
		dd35bModel[61] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 175
		dd35bModel[62] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 177
		dd35bModel[63] = new ModelRendererTurbo(this, 433, 65, textureX, textureY); // Box 178
		dd35bModel[64] = new ModelRendererTurbo(this, 393, 33, textureX, textureY); // Box 179
		dd35bModel[65] = new ModelRendererTurbo(this, 161, 9, textureX, textureY); // Box 180
		dd35bModel[66] = new ModelRendererTurbo(this, 433, 17, textureX, textureY); // Box 181
		dd35bModel[67] = new ModelRendererTurbo(this, 457, 41, textureX, textureY); // Box 182
		dd35bModel[68] = new ModelRendererTurbo(this, 401, 9, textureX, textureY); // Box 183
		dd35bModel[69] = new ModelRendererTurbo(this, 497, 33, textureX, textureY); // Box 184
		dd35bModel[70] = new ModelRendererTurbo(this, 185, 73, textureX, textureY); // Box 185
		dd35bModel[71] = new ModelRendererTurbo(this, 209, 73, textureX, textureY); // Box 186
		dd35bModel[72] = new ModelRendererTurbo(this, 449, 9, textureX, textureY); // Box 187
		dd35bModel[73] = new ModelRendererTurbo(this, 393, 41, textureX, textureY); // Box 188
		dd35bModel[74] = new ModelRendererTurbo(this, 233, 73, textureX, textureY); // Box 189
		dd35bModel[75] = new ModelRendererTurbo(this, 257, 49, textureX, textureY); // Box 190
		dd35bModel[76] = new ModelRendererTurbo(this, 377, 25, textureX, textureY); // Box 191
		dd35bModel[77] = new ModelRendererTurbo(this, 257, 73, textureX, textureY); // Box 192
		dd35bModel[78] = new ModelRendererTurbo(this, 361, 33, textureX, textureY); // Box 193
		dd35bModel[79] = new ModelRendererTurbo(this, 457, 49, textureX, textureY); // Box 194
		dd35bModel[80] = new ModelRendererTurbo(this, 281, 73, textureX, textureY); // Box 195
		dd35bModel[81] = new ModelRendererTurbo(this, 257, 57, textureX, textureY); // Box 196
		dd35bModel[82] = new ModelRendererTurbo(this, 353, 49, textureX, textureY); // Box 197
		dd35bModel[83] = new ModelRendererTurbo(this, 305, 73, textureX, textureY); // Box 198
		dd35bModel[84] = new ModelRendererTurbo(this, 481, 49, textureX, textureY); // Box 199
		dd35bModel[85] = new ModelRendererTurbo(this, 281, 57, textureX, textureY); // Box 200
		dd35bModel[86] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 119
		dd35bModel[87] = new ModelRendererTurbo(this, 401, 65, textureX, textureY); // Box 120
		dd35bModel[88] = new ModelRendererTurbo(this, 329, 73, textureX, textureY); // Box 121
		dd35bModel[89] = new ModelRendererTurbo(this, 385, 73, textureX, textureY); // Box 122
		dd35bModel[90] = new ModelRendererTurbo(this, 497, 65, textureX, textureY); // Box 123
		dd35bModel[91] = new ModelRendererTurbo(this, 425, 73, textureX, textureY); // Box 124
		dd35bModel[92] = new ModelRendererTurbo(this, 25, 73, textureX, textureY); // Box 125
		dd35bModel[93] = new ModelRendererTurbo(this, 465, 73, textureX, textureY); // Box 126
		dd35bModel[94] = new ModelRendererTurbo(this, 409, 73, textureX, textureY); // Box 127
		dd35bModel[95] = new ModelRendererTurbo(this, 425, 73, textureX, textureY); // Box 128
		dd35bModel[96] = new ModelRendererTurbo(this, 161, 81, textureX, textureY); // Box 129
		dd35bModel[97] = new ModelRendererTurbo(this, 265, 73, textureX, textureY); // Box 130
		dd35bModel[98] = new ModelRendererTurbo(this, 313, 73, textureX, textureY); // Box 131
		dd35bModel[99] = new ModelRendererTurbo(this, 225, 81, textureX, textureY); // Box 132
		dd35bModel[100] = new ModelRendererTurbo(this, 249, 89, textureX, textureY); // Box 133
		dd35bModel[101] = new ModelRendererTurbo(this, 449, 73, textureX, textureY); // Box 134
		dd35bModel[102] = new ModelRendererTurbo(this, 465, 73, textureX, textureY); // Box 135
		dd35bModel[103] = new ModelRendererTurbo(this, 489, 73, textureX, textureY); // Box 136
		dd35bModel[104] = new ModelRendererTurbo(this, 249, 81, textureX, textureY); // Box 137
		dd35bModel[105] = new ModelRendererTurbo(this, 297, 81, textureX, textureY); // Box 138
		dd35bModel[106] = new ModelRendererTurbo(this, 345, 81, textureX, textureY); // Box 139
		dd35bModel[107] = new ModelRendererTurbo(this, 361, 81, textureX, textureY); // Box 140
		dd35bModel[108] = new ModelRendererTurbo(this, 377, 81, textureX, textureY); // Box 141
		dd35bModel[109] = new ModelRendererTurbo(this, 449, 25, textureX, textureY, "lamp"); // Box 116
		dd35bModel[110] = new ModelRendererTurbo(this, 497, 25, textureX, textureY, "lamp"); // Box 117
		dd35bModel[111] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 118
		dd35bModel[112] = new ModelRendererTurbo(this, 28, 17, textureX, textureY); // Box 112
		dd35bModel[113] = new ModelRendererTurbo(this, 37, 7, textureX, textureY); // Box 113
		dd35bModel[114] = new ModelRendererTurbo(this, 44, 7, textureX, textureY); // Box 114
		dd35bModel[115] = new ModelRendererTurbo(this, 28, 13, textureX, textureY); // Box 115

		dd35bModel[0].addBox(0F, 0F, -1F, 8, 2, 2, 0F); // Box 5
		dd35bModel[0].setRotationPoint(-56F, 1F, 0F);

		dd35bModel[1].addBox(0F, 0F, -1F, 8, 2, 2, 0F); // Box 7
		dd35bModel[1].setRotationPoint(48F, 1F, 0F);

		dd35bModel[2].addBox(0F, 0F, 0F, 48, 23, 10, 0F); // Box 11
		dd35bModel[2].setRotationPoint(-50F, -25F, -5F);

		dd35bModel[3].addBox(0F, 0F, 0F, 98, 2, 4, 0F); // Box 31
		dd35bModel[3].setRotationPoint(-49F, -2F, -9F);

		dd35bModel[4].addBox(0F, 0F, -5F, 104, 4, 10, 0F); // Box 33
		dd35bModel[4].setRotationPoint(-52F, -2F, 0F);

		dd35bModel[5].addBox(0F, 0F, 0F, 98, 2, 4, 0F); // Box 34
		dd35bModel[5].setRotationPoint(-49F, -2F, 5F);

		dd35bModel[6].addShapeBox(0F, 0F, -1F, 2, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 35
		dd35bModel[6].setRotationPoint(-54F, -2F, 0F);

		dd35bModel[7].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 36
		dd35bModel[7].setRotationPoint(-54F, -2F, 1F);

		dd35bModel[8].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		dd35bModel[8].setRotationPoint(-54F, -2F, -7F);

		dd35bModel[9].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 58
		dd35bModel[9].setRotationPoint(52F, -2F, 1F);

		dd35bModel[10].addShapeBox(0F, 0F, -1F, 2, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 59
		dd35bModel[10].setRotationPoint(52F, -2F, 0F);

		dd35bModel[11].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 60
		dd35bModel[11].setRotationPoint(52F, -2F, -7F);

		dd35bModel[12].addBox(0F, 0F, 0F, 1, 7, 4, 0F); // Box 61
		dd35bModel[12].setRotationPoint(-49F, 0F, -9F);

		dd35bModel[13].addBox(0F, 0F, 0F, 1, 7, 4, 0F); // Box 62
		dd35bModel[13].setRotationPoint(-49F, 0F, 5F);

		dd35bModel[14].addBox(0F, 0F, 0F, 1, 7, 4, 0F); // Box 63
		dd35bModel[14].setRotationPoint(48F, 0F, 5F);

		dd35bModel[15].addBox(0F, 0F, 0F, 1, 7, 4, 0F); // Box 64
		dd35bModel[15].setRotationPoint(48F, 0F, -9F);

		dd35bModel[16].addBox(0F, 0F, 0F, 3, 0, 3, 0F); // Box 65
		dd35bModel[16].setRotationPoint(-52F, 3F, -8F);

		dd35bModel[17].addBox(0F, 0F, 0F, 3, 0, 3, 0F); // Box 66
		dd35bModel[17].setRotationPoint(-52F, 7F, -8F);

		dd35bModel[18].addBox(0F, 0F, 0F, 3, 0, 3, 0F); // Box 68
		dd35bModel[18].setRotationPoint(-52F, 3F, 5F);

		dd35bModel[19].addBox(0F, 0F, 0F, 3, 0, 3, 0F); // Box 69
		dd35bModel[19].setRotationPoint(-52F, 7F, 5F);

		dd35bModel[20].addBox(0F, 0F, 0F, 3, 0, 3, 0F); // Box 70
		dd35bModel[20].setRotationPoint(49F, 3F, 5F);

		dd35bModel[21].addBox(0F, 0F, 0F, 3, 0, 3, 0F); // Box 71
		dd35bModel[21].setRotationPoint(49F, 7F, 5F);

		dd35bModel[22].addBox(0F, 0F, 0F, 3, 0, 3, 0F); // Box 72
		dd35bModel[22].setRotationPoint(49F, 7F, -8F);

		dd35bModel[23].addBox(0F, 0F, 0F, 3, 0, 3, 0F); // Box 73
		dd35bModel[23].setRotationPoint(49F, 3F, -8F);

		dd35bModel[24].addBox(0F, 0F, -9F, 0, 20, 18, 0F); // Box 74
		dd35bModel[24].setRotationPoint(-52.01F, -11F, 0F);

		dd35bModel[25].addBox(0F, 0F, 0F, 98, 9, 0, 0F); // Box 66
		dd35bModel[25].setRotationPoint(-49F, -11F, 9F);

		dd35bModel[26].addBox(0F, 0F, 0F, 98, 9, 0, 0F); // Box 67
		dd35bModel[26].setRotationPoint(-49F, -11F, -9F);

		dd35bModel[27].addBox(0F, 0F, -9F, 26, 3, 18, 0F); // Box 76
		dd35bModel[27].setRotationPoint(-13F, 1F, 0F);

		dd35bModel[28].addBox(0F, 0F, 0F, 1, 2, 18, 0F); // Box 81
		dd35bModel[28].setRotationPoint(30F, 0F, -9F);

		dd35bModel[29].addBox(0F, 0F, 0F, 1, 2, 18, 0F); // Box 82
		dd35bModel[29].setRotationPoint(13F, 0F, -9F);

		dd35bModel[30].addBox(0F, 0F, 0F, 1, 2, 18, 0F); // Box 83
		dd35bModel[30].setRotationPoint(-14F, 0F, -9F);

		dd35bModel[31].addBox(0F, 0F, 0F, 1, 2, 18, 0F); // Box 84
		dd35bModel[31].setRotationPoint(-31F, 0F, -9F);

		dd35bModel[32].addShapeBox(0F, 0F, -9F, 26, 4, 18, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 85
		dd35bModel[32].setRotationPoint(-13F, 4F, 0F);

		dd35bModel[33].addBox(0F, 0F, -7F, 1, 2, 14, 0F); // Box 87
		dd35bModel[33].setRotationPoint(-47F, 4F, 0F);

		dd35bModel[34].addBox(0F, 0F, -7F, 1, 2, 14, 0F); // Box 88
		dd35bModel[34].setRotationPoint(-15F, 4F, 0F);

		dd35bModel[35].addBox(0F, 0F, -5F, 29, 3, 10, 0F); // Box 91
		dd35bModel[35].setRotationPoint(-45F, 2F, 0F);

		dd35bModel[36].addBox(0F, 0F, -8F, 1, 1, 16, 0F); // Box 92
		dd35bModel[36].setRotationPoint(-27F, 6F, 0F);

		dd35bModel[37].addBox(0F, 0F, -8F, 1, 1, 16, 0F); // Box 93
		dd35bModel[37].setRotationPoint(-35F, 6F, 0F);

		dd35bModel[38].addBox(0F, 0F, -8F, 1, 1, 16, 0F); // Box 94
		dd35bModel[38].setRotationPoint(-43F, 6F, 0F);

		dd35bModel[39].addBox(0F, 0F, 0F, 33, 4, 0, 0F); // Box 118
		dd35bModel[39].setRotationPoint(-47F, 3F, -7.01F);

		dd35bModel[40].addBox(0F, 0F, 0F, 33, 4, 0, 0F); // Box 119
		dd35bModel[40].setRotationPoint(-47F, 3F, 7.01F);

		dd35bModel[41].addBox(0F, 0F, 0F, 7, 7, 0, 0F); // Box 126
		dd35bModel[41].setRotationPoint(-30F, 3F, 6F);

		dd35bModel[42].addBox(0F, 0F, 0F, 7, 7, 0, 0F); // Box 127
		dd35bModel[42].setRotationPoint(-38F, 3F, 6F);

		dd35bModel[43].addBox(0F, 0F, 0F, 7, 7, 0, 0F); // Box 128
		dd35bModel[43].setRotationPoint(-46F, 3F, 6F);

		dd35bModel[44].addShapeBox(0F, 0F, 0F, 0, 6, 3, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 143
		dd35bModel[44].setRotationPoint(-52.01F, -11F, 6F);

		dd35bModel[45].addShapeBox(0F, 0F, 0F, 0, 6, 3, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 144
		dd35bModel[45].setRotationPoint(-52.01F, -11F, -9F);

		dd35bModel[46].addShapeBox(0F, 0F, 0F, 0, 6, 3, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 145
		dd35bModel[46].setRotationPoint(52.01F, -11F, -9F);

		dd35bModel[47].addShapeBox(0F, 0F, 0F, 0, 6, 3, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 146
		dd35bModel[47].setRotationPoint(52.01F, -11F, 6F);

		dd35bModel[48].addBox(0F, 0F, 0F, 7, 7, 0, 0F); // Box 159
		dd35bModel[48].setRotationPoint(-22F, 3F, 6F);

		dd35bModel[49].addBox(0F, 0F, -8F, 1, 1, 16, 0F); // Box 160
		dd35bModel[49].setRotationPoint(-19F, 6F, 0F);

		dd35bModel[50].addBox(0F, 0F, 0F, 48, 23, 10, 0F); // Box 162
		dd35bModel[50].setRotationPoint(2F, -25F, -5F);

		dd35bModel[51].addBox(0F, 0F, 0F, 4, 5, 10, 0F); // Box 163
		dd35bModel[51].setRotationPoint(-2F, -25F, -5F);

		dd35bModel[52].addBox(0F, 0F, 0F, 6, 1, 6, 0F); // Box 164
		dd35bModel[52].setRotationPoint(-9F, -26F, -3F);

		dd35bModel[53].addBox(0F, 0F, 0F, 6, 1, 6, 0F); // Box 165
		dd35bModel[53].setRotationPoint(-21F, -26F, -3F);

		dd35bModel[54].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 166
		dd35bModel[54].setRotationPoint(-14F, -26F, -2F);

		dd35bModel[55].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 167
		dd35bModel[55].setRotationPoint(10F, -26F, -2F);

		dd35bModel[56].addBox(0F, 0F, 0F, 6, 1, 6, 0F); // Box 168
		dd35bModel[56].setRotationPoint(15F, -26F, -3F);

		dd35bModel[57].addBox(0F, 0F, 0F, 6, 1, 6, 0F); // Box 169
		dd35bModel[57].setRotationPoint(3F, -26F, -3F);

		dd35bModel[58].addBox(0F, 0F, 0F, 6, 1, 6, 0F); // Box 170
		dd35bModel[58].setRotationPoint(-33F, -26F, -3F);

		dd35bModel[59].addBox(0F, 0F, 0F, 6, 1, 6, 0F); // Box 171
		dd35bModel[59].setRotationPoint(30F, -26F, -3F);

		dd35bModel[60].addShapeBox(0F, 0F, 0F, 8, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 174
		dd35bModel[60].setRotationPoint(-34F, -25F, 5F);

		dd35bModel[61].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -2F); // Box 175
		dd35bModel[61].setRotationPoint(-37F, -25F, 5F);

		dd35bModel[62].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 177
		dd35bModel[62].setRotationPoint(-37F, -23F, 5F);

		dd35bModel[63].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 178
		dd35bModel[63].setRotationPoint(-34F, -23F, 5F);

		dd35bModel[64].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -0.5F); // Box 179
		dd35bModel[64].setRotationPoint(-26F, -25F, 5F);

		dd35bModel[65].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 180
		dd35bModel[65].setRotationPoint(-26F, -23F, 5F);

		dd35bModel[66].addBox(0F, 0F, 0F, 2, 1, 6, 0F); // Box 181
		dd35bModel[66].setRotationPoint(-38F, -26F, -3F);

		dd35bModel[67].addBox(0F, 0F, 0F, 2, 1, 6, 0F); // Box 182
		dd35bModel[67].setRotationPoint(39F, -26F, -3F);

		dd35bModel[68].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 183
		dd35bModel[68].setRotationPoint(26F, -23F, 5F);

		dd35bModel[69].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -2F); // Box 184
		dd35bModel[69].setRotationPoint(26F, -25F, 5F);

		dd35bModel[70].addShapeBox(0F, 0F, 0F, 8, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 185
		dd35bModel[70].setRotationPoint(29F, -25F, 5F);

		dd35bModel[71].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 186
		dd35bModel[71].setRotationPoint(29F, -23F, 5F);

		dd35bModel[72].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 187
		dd35bModel[72].setRotationPoint(37F, -23F, 5F);

		dd35bModel[73].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -0.5F); // Box 188
		dd35bModel[73].setRotationPoint(37F, -25F, 5F);

		dd35bModel[74].addShapeBox(0F, 0F, 0F, 8, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 189
		dd35bModel[74].setRotationPoint(-34F, -25F, -7F);

		dd35bModel[75].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 190
		dd35bModel[75].setRotationPoint(-26F, -25F, -7F);

		dd35bModel[76].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 191
		dd35bModel[76].setRotationPoint(-26F, -23F, -6F);

		dd35bModel[77].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 192
		dd35bModel[77].setRotationPoint(-34F, -23F, -6F);

		dd35bModel[78].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 193
		dd35bModel[78].setRotationPoint(-37F, -23F, -6F);

		dd35bModel[79].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 194
		dd35bModel[79].setRotationPoint(-37F, -25F, -7F);

		dd35bModel[80].addShapeBox(0F, 0F, 0F, 8, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 195
		dd35bModel[80].setRotationPoint(29F, -25F, -7F);

		dd35bModel[81].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 196
		dd35bModel[81].setRotationPoint(37F, -25F, -7F);

		dd35bModel[82].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 197
		dd35bModel[82].setRotationPoint(37F, -23F, -6F);

		dd35bModel[83].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 198
		dd35bModel[83].setRotationPoint(29F, -23F, -6F);

		dd35bModel[84].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 199
		dd35bModel[84].setRotationPoint(26F, -23F, -6F);

		dd35bModel[85].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 200
		dd35bModel[85].setRotationPoint(26F, -25F, -7F);

		dd35bModel[86].addBox(0F, 0F, 0F, 5, 11, 1, 0F); // Box 119
		dd35bModel[86].setRotationPoint(43F, -13F, 5F);

		dd35bModel[87].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 120
		dd35bModel[87].setRotationPoint(43F, -16F, 5F);

		dd35bModel[88].addBox(0F, 0F, 0F, 33, 4, 0, 0F); // Box 121
		dd35bModel[88].setRotationPoint(14F, 3F, 7.01F);

		dd35bModel[89].addBox(0F, 0F, -8F, 1, 1, 16, 0F); // Box 122
		dd35bModel[89].setRotationPoint(42F, 6F, 0F);

		dd35bModel[90].addBox(0F, 0F, 0F, 7, 7, 0, 0F); // Box 123
		dd35bModel[90].setRotationPoint(39F, 3F, 6F);

		dd35bModel[91].addBox(0F, 0F, -8F, 1, 1, 16, 0F); // Box 124
		dd35bModel[91].setRotationPoint(34F, 6F, 0F);

		dd35bModel[92].addBox(0F, 0F, 0F, 7, 7, 0, 0F); // Box 125
		dd35bModel[92].setRotationPoint(31F, 3F, 6F);

		dd35bModel[93].addBox(0F, 0F, -8F, 1, 1, 16, 0F); // Box 126
		dd35bModel[93].setRotationPoint(26F, 6F, 0F);

		dd35bModel[94].addBox(0F, 0F, 0F, 7, 7, 0, 0F); // Box 127
		dd35bModel[94].setRotationPoint(23F, 3F, 6F);

		dd35bModel[95].addBox(0F, 0F, 0F, 7, 7, 0, 0F); // Box 128
		dd35bModel[95].setRotationPoint(15F, 3F, 6F);

		dd35bModel[96].addBox(0F, 0F, -5F, 29, 3, 10, 0F); // Box 129
		dd35bModel[96].setRotationPoint(16F, 2F, 0F);

		dd35bModel[97].addBox(0F, 0F, -7F, 1, 2, 14, 0F); // Box 130
		dd35bModel[97].setRotationPoint(14F, 4F, 0F);

		dd35bModel[98].addBox(0F, 0F, -7F, 1, 2, 14, 0F); // Box 131
		dd35bModel[98].setRotationPoint(46F, 4F, 0F);

		dd35bModel[99].addBox(0F, 0F, -8F, 1, 1, 16, 0F); // Box 132
		dd35bModel[99].setRotationPoint(18F, 6F, 0F);

		dd35bModel[100].addBox(0F, 0F, 0F, 33, 4, 0, 0F); // Box 133
		dd35bModel[100].setRotationPoint(14F, 3F, -7.01F);

		dd35bModel[101].addBox(0F, 0F, 0F, 7, 7, 0, 0F); // Box 134
		dd35bModel[101].setRotationPoint(39F, 3F, -6F);

		dd35bModel[102].addBox(0F, 0F, 0F, 7, 7, 0, 0F); // Box 135
		dd35bModel[102].setRotationPoint(31F, 3F, -6F);

		dd35bModel[103].addBox(0F, 0F, 0F, 7, 7, 0, 0F); // Box 136
		dd35bModel[103].setRotationPoint(23F, 3F, -6F);

		dd35bModel[104].addBox(0F, 0F, 0F, 7, 7, 0, 0F); // Box 137
		dd35bModel[104].setRotationPoint(15F, 3F, -6F);

		dd35bModel[105].addBox(0F, 0F, 0F, 7, 7, 0, 0F); // Box 138
		dd35bModel[105].setRotationPoint(-46F, 3F, -6F);

		dd35bModel[106].addBox(0F, 0F, 0F, 7, 7, 0, 0F); // Box 139
		dd35bModel[106].setRotationPoint(-38F, 3F, -6F);

		dd35bModel[107].addBox(0F, 0F, 0F, 7, 7, 0, 0F); // Box 140
		dd35bModel[107].setRotationPoint(-30F, 3F, -6F);

		dd35bModel[108].addBox(0F, 0F, 0F, 7, 7, 0, 0F); // Box 141
		dd35bModel[108].setRotationPoint(-22F, 3F, -6F);

		dd35bModel[109].addBox(0F, 0F, -1.5F, 1, 2, 3, 0F); // Box 116
		dd35bModel[109].setRotationPoint(50F, -24F, 0F);

		dd35bModel[110].addBox(0F, 0F, -1.5F, 1, 2, 3, 0F); // Box 117
		dd35bModel[110].setRotationPoint(-51F, -24F, 0F);

		dd35bModel[111].addBox(0F, 0F, -9F, 0, 20, 18, 0F); // Box 118
		dd35bModel[111].setRotationPoint(52.01F, -11F, 0F);

		dd35bModel[112].addShapeBox(0F, 0F, 0F, 3, 3, 0, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 112
		dd35bModel[112].setRotationPoint(45F, -11F, 9F);

		dd35bModel[113].addShapeBox(0F, 0F, 0F, 3, 3, 0, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 113
		dd35bModel[113].setRotationPoint(45F, -11F, -9F);

		dd35bModel[114].addShapeBox(0F, 0F, 0F, 3, 3, 0, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 114
		dd35bModel[114].setRotationPoint(-48F, -11F, -9F);

		dd35bModel[115].addShapeBox(0F, 0F, 0F, 3, 3, 0, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 115
		dd35bModel[115].setRotationPoint(-48F, -11F, 9F);


	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		for(int i = 0; i < 116; i++)
		{
			if(dd35bModel[i].boxName!= null && dd35bModel[i].boxName.equals("lamp")){
				Minecraft.getMinecraft().entityRenderer.disableLightmap(1D);
				dd35bModel[i].render(f5);
				Minecraft.getMinecraft().entityRenderer.enableLightmap(1D);

			} else {
				dd35bModel[i].render(f5);
			}
		}
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
	{
	}

	public ModelRendererTurbo dd35bModel[];
}