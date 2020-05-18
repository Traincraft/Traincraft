//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2018 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator:
// Created on:02.04.2018 - 22:47:39
// Last changed on: 02.04.2018 - 22:47:39

package train.client.render.models;

import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import tmt.ModelBase;
import tmt.ModelRendererTurbo;
import tmt.Tessellator;
import train.common.api.AbstractTrains;
import train.common.library.Info;

public class ModelGS4Tail extends ModelBase
{
	int textureX = 512;
	int textureY = 512;

	public ModelGS4Tail()
	{
		gs4tailModel = new ModelRendererTurbo[158];
		gs4tailModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 1
		gs4tailModel[1] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 2
		gs4tailModel[2] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 6
		gs4tailModel[3] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 9
		gs4tailModel[4] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 10
		gs4tailModel[5] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 11
		gs4tailModel[6] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 14
		gs4tailModel[7] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 72
		gs4tailModel[8] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 76
		gs4tailModel[9] = new ModelRendererTurbo(this, 112, 49, textureX, textureY); // Box 80
		gs4tailModel[10] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 163
		gs4tailModel[11] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 164
		gs4tailModel[12] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 165
		gs4tailModel[13] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 166
		gs4tailModel[14] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 176
		gs4tailModel[15] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 182
		gs4tailModel[16] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 193
		gs4tailModel[17] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 194
		gs4tailModel[18] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 195
		gs4tailModel[19] = new ModelRendererTurbo(this, 361, 17, textureX, textureY); // Box 197
		gs4tailModel[20] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 203
		gs4tailModel[21] = new ModelRendererTurbo(this, 113, 73, textureX, textureY); // Box 204
		gs4tailModel[22] = new ModelRendererTurbo(this, 337, 49, textureX, textureY); // Box 102
		gs4tailModel[23] = new ModelRendererTurbo(this, 337, 57, textureX, textureY); // Box 103
		gs4tailModel[24] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 99
		gs4tailModel[25] = new ModelRendererTurbo(this, 337, 65, textureX, textureY); // Box 99
		gs4tailModel[26] = new ModelRendererTurbo(this, 417, 65, textureX, textureY); // Box 100
		gs4tailModel[27] = new ModelRendererTurbo(this, 457, 17, textureX, textureY); // Box 99
		gs4tailModel[28] = new ModelRendererTurbo(this, 265, 25, textureX, textureY); // Box 100
		gs4tailModel[29] = new ModelRendererTurbo(this, 473, 49, textureX, textureY); // Box 101
		gs4tailModel[30] = new ModelRendererTurbo(this, 449, 25, textureX, textureY); // Box 102
		gs4tailModel[31] = new ModelRendererTurbo(this, 497, 41, textureX, textureY); // Box 103
		gs4tailModel[32] = new ModelRendererTurbo(this, 497, 73, textureX, textureY); // Box 104
		gs4tailModel[33] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 105
		gs4tailModel[34] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 106
		gs4tailModel[35] = new ModelRendererTurbo(this, 289, 97, textureX, textureY); // Box 107
		gs4tailModel[36] = new ModelRendererTurbo(this, 305, 97, textureX, textureY); // Box 108
		gs4tailModel[37] = new ModelRendererTurbo(this, 321, 97, textureX, textureY); // Box 109
		gs4tailModel[38] = new ModelRendererTurbo(this, 337, 97, textureX, textureY); // Box 110
		gs4tailModel[39] = new ModelRendererTurbo(this, 353, 97, textureX, textureY); // Box 111
		gs4tailModel[40] = new ModelRendererTurbo(this, 369, 97, textureX, textureY); // Box 112
		gs4tailModel[41] = new ModelRendererTurbo(this, 329, 25, textureX, textureY); // Box 113
		gs4tailModel[42] = new ModelRendererTurbo(this, 393, 65, textureX, textureY); // Box 114
		gs4tailModel[43] = new ModelRendererTurbo(this, 17, 81, textureX, textureY); // Box 115
		gs4tailModel[44] = new ModelRendererTurbo(this, 401, 97, textureX, textureY); // Box 116
		gs4tailModel[45] = new ModelRendererTurbo(this, 441, 97, textureX, textureY); // Box 117
		gs4tailModel[46] = new ModelRendererTurbo(this, 49, 81, textureX, textureY); // Box 120
		gs4tailModel[47] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 121
		gs4tailModel[48] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 122
		gs4tailModel[49] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 123
		gs4tailModel[50] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 124
		gs4tailModel[51] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 125
		gs4tailModel[52] = new ModelRendererTurbo(this, 457, 97, textureX, textureY); // Box 118
		gs4tailModel[53] = new ModelRendererTurbo(this, 297, 121, textureX, textureY); // Box 119
		gs4tailModel[54] = new ModelRendererTurbo(this, 329, 121, textureX, textureY); // Box 120
		gs4tailModel[55] = new ModelRendererTurbo(this, 81, 81, textureX, textureY); // Box 121
		gs4tailModel[56] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 123
		gs4tailModel[57] = new ModelRendererTurbo(this, 265, 25, textureX, textureY); // Box 124
		gs4tailModel[58] = new ModelRendererTurbo(this, 361, 33, textureX, textureY); // Box 125
		gs4tailModel[59] = new ModelRendererTurbo(this, 257, 9, textureX, textureY); // Box 126
		gs4tailModel[60] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 127
		gs4tailModel[61] = new ModelRendererTurbo(this, 489, 17, textureX, textureY); // Box 128
		gs4tailModel[62] = new ModelRendererTurbo(this, 489, 17, textureX, textureY); // Box 129
		gs4tailModel[63] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 130
		gs4tailModel[64] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 131
		gs4tailModel[65] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 132
		gs4tailModel[66] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 133
		gs4tailModel[67] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 134
		gs4tailModel[68] = new ModelRendererTurbo(this, 257, 9, textureX, textureY); // Box 135
		gs4tailModel[69] = new ModelRendererTurbo(this, 361, 33, textureX, textureY); // Box 136
		gs4tailModel[70] = new ModelRendererTurbo(this, 265, 25, textureX, textureY); // Box 137
		gs4tailModel[71] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 138
		gs4tailModel[72] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 139
		gs4tailModel[73] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 140
		gs4tailModel[74] = new ModelRendererTurbo(this, 489, 17, textureX, textureY); // Box 141
		gs4tailModel[75] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 142
		gs4tailModel[76] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 143
		gs4tailModel[77] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 144
		gs4tailModel[78] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 145
		gs4tailModel[79] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 146
		gs4tailModel[80] = new ModelRendererTurbo(this, 257, 9, textureX, textureY); // Box 147
		gs4tailModel[81] = new ModelRendererTurbo(this, 361, 33, textureX, textureY); // Box 148
		gs4tailModel[82] = new ModelRendererTurbo(this, 265, 25, textureX, textureY); // Box 149
		gs4tailModel[83] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 150
		gs4tailModel[84] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 151
		gs4tailModel[85] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 152
		gs4tailModel[86] = new ModelRendererTurbo(this, 489, 17, textureX, textureY); // Box 153
		gs4tailModel[87] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 154
		gs4tailModel[88] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 155
		gs4tailModel[89] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 156
		gs4tailModel[90] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 157
		gs4tailModel[91] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 158
		gs4tailModel[92] = new ModelRendererTurbo(this, 257, 9, textureX, textureY); // Box 159
		gs4tailModel[93] = new ModelRendererTurbo(this, 361, 33, textureX, textureY); // Box 160
		gs4tailModel[94] = new ModelRendererTurbo(this, 265, 25, textureX, textureY); // Box 161
		gs4tailModel[95] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 162
		gs4tailModel[96] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 163
		gs4tailModel[97] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 164
		gs4tailModel[98] = new ModelRendererTurbo(this, 489, 17, textureX, textureY); // Box 165
		gs4tailModel[99] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 166
		gs4tailModel[100] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 167
		gs4tailModel[101] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 168
		gs4tailModel[102] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 169
		gs4tailModel[103] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 170
		gs4tailModel[104] = new ModelRendererTurbo(this, 257, 9, textureX, textureY); // Box 171
		gs4tailModel[105] = new ModelRendererTurbo(this, 361, 33, textureX, textureY); // Box 172
		gs4tailModel[106] = new ModelRendererTurbo(this, 265, 25, textureX, textureY); // Box 173
		gs4tailModel[107] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 174
		gs4tailModel[108] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 175
		gs4tailModel[109] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 176
		gs4tailModel[110] = new ModelRendererTurbo(this, 489, 17, textureX, textureY); // Box 177
		gs4tailModel[111] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 178
		gs4tailModel[112] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 179
		gs4tailModel[113] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 180
		gs4tailModel[114] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 181
		gs4tailModel[115] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 182
		gs4tailModel[116] = new ModelRendererTurbo(this, 257, 9, textureX, textureY); // Box 183
		gs4tailModel[117] = new ModelRendererTurbo(this, 361, 33, textureX, textureY); // Box 184
		gs4tailModel[118] = new ModelRendererTurbo(this, 265, 25, textureX, textureY); // Box 185
		gs4tailModel[119] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 186
		gs4tailModel[120] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 187
		gs4tailModel[121] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 188
		gs4tailModel[122] = new ModelRendererTurbo(this, 489, 17, textureX, textureY); // Box 189
		gs4tailModel[123] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 190
		gs4tailModel[124] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 191
		gs4tailModel[125] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 192
		gs4tailModel[126] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 193
		gs4tailModel[127] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 194
		gs4tailModel[128] = new ModelRendererTurbo(this, 257, 9, textureX, textureY); // Box 195
		gs4tailModel[129] = new ModelRendererTurbo(this, 361, 33, textureX, textureY); // Box 196
		gs4tailModel[130] = new ModelRendererTurbo(this, 265, 25, textureX, textureY); // Box 197
		gs4tailModel[131] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 198
		gs4tailModel[132] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 199
		gs4tailModel[133] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 200
		gs4tailModel[134] = new ModelRendererTurbo(this, 489, 17, textureX, textureY); // Box 201
		gs4tailModel[135] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 202
		gs4tailModel[136] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 203
		gs4tailModel[137] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 204
		gs4tailModel[138] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 205
		gs4tailModel[139] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 206
		gs4tailModel[140] = new ModelRendererTurbo(this, 257, 9, textureX, textureY); // Box 207
		gs4tailModel[141] = new ModelRendererTurbo(this, 361, 33, textureX, textureY); // Box 208
		gs4tailModel[142] = new ModelRendererTurbo(this, 265, 25, textureX, textureY); // Box 209
		gs4tailModel[143] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 210
		gs4tailModel[144] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 211
		gs4tailModel[145] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 212
		gs4tailModel[146] = new ModelRendererTurbo(this, 489, 17, textureX, textureY); // Box 213
		gs4tailModel[147] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 214
		gs4tailModel[148] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 215
		gs4tailModel[149] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 216
		gs4tailModel[150] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 217
		gs4tailModel[151] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 218
		gs4tailModel[152] = new ModelRendererTurbo(this, 257, 9, textureX, textureY); // Box 219
		gs4tailModel[153] = new ModelRendererTurbo(this, 361, 33, textureX, textureY); // Box 220
		gs4tailModel[154] = new ModelRendererTurbo(this, 265, 25, textureX, textureY); // Box 221
		gs4tailModel[155] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 222
		gs4tailModel[156] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 223
		gs4tailModel[157] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 224

		gs4tailModel[0].addShapeBox(0F, 0F, 0F, 119, 2, 16, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		gs4tailModel[0].setRotationPoint(-60F, -26F, -8F);

		gs4tailModel[1].addBox(0F, 0F, 0F, 4, 22, 1, 0F); // Box 2
		gs4tailModel[1].setRotationPoint(-60F, -22F, 10F);

		gs4tailModel[2].addBox(0F, 0F, 0F, 4, 22, 1, 0F); // Box 6
		gs4tailModel[2].setRotationPoint(-60F, -22F, -11F);

		gs4tailModel[3].addBox(0F, 0F, 0F, 1, 22, 20, 0F); // Box 9
		gs4tailModel[3].setRotationPoint(-60F, -22F, -10F);

		gs4tailModel[4].addBox(0F, 0F, 0F, 7, 22, 1, 0F); // Box 10
		gs4tailModel[4].setRotationPoint(-56F, -22F, 10F);

		gs4tailModel[5].addBox(0F, 0F, 0F, 7, 22, 1, 0F); // Box 11
		gs4tailModel[5].setRotationPoint(-56F, -22F, -11F);

		gs4tailModel[6].addBox(0F, 0F, 0F, 1, 22, 20, 0F); // Box 14
		gs4tailModel[6].setRotationPoint(-46F, -22F, -10F);

		gs4tailModel[7].addBox(0F, 0F, 0F, 119, 1, 22, 0F); // Box 72
		gs4tailModel[7].setRotationPoint(-60F, 0F, -11F);

		gs4tailModel[8].addShapeBox(0F, 0F, 0F, 33, 2, 22, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 76
		gs4tailModel[8].setRotationPoint(-17F, 1F, -11F);

		gs4tailModel[9].addBox(0F, 0F, 0F, 108, 22, 1, 0F); // Box 80
		gs4tailModel[9].setRotationPoint(-49F, -22F, 10F);

		gs4tailModel[10].addShapeBox(0F, 0F, 0F, 1, 7, 8, 0F, -1.5F, 0F, 0F, 1.5F, -0.2F, 0F, 1.5F, -0.2F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 163
		gs4tailModel[10].setRotationPoint(-22F, -10F, -10F);

		gs4tailModel[11].addBox(0F, 0F, 0F, 1, 2, 6, 0F); // Box 164
		gs4tailModel[11].setRotationPoint(-21F, -10.2F, -9F);

		gs4tailModel[12].addBox(0F, 0F, 0F, 4, 2, 8, 0F); // Box 165
		gs4tailModel[12].setRotationPoint(-26F, -3F, -10F);

		gs4tailModel[13].addBox(0F, 0F, 0F, 2, 1, 7, 0F); // Box 166
		gs4tailModel[13].setRotationPoint(-25F, -1F, -9.5F);

		gs4tailModel[14].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 176
		gs4tailModel[14].setRotationPoint(-22F, -3F, -10F);

		gs4tailModel[15].addBox(0F, 0F, 0F, 4, 3, 1, 0F); // Box 182
		gs4tailModel[15].setRotationPoint(-25.55F, -5F, -2.5F);

		gs4tailModel[16].addBox(0F, 0F, 0F, 2, 18, 1, 0F); // Box 193
		gs4tailModel[16].setRotationPoint(-62F, -20F, -6F);

		gs4tailModel[17].addBox(0F, 0F, 0F, 2, 18, 1, 0F); // Box 194
		gs4tailModel[17].setRotationPoint(-62F, -20F, 5F);

		gs4tailModel[18].addShapeBox(0F, 0F, 0F, 2, 1, 10, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 195
		gs4tailModel[18].setRotationPoint(-62F, -2F, -5F);

		gs4tailModel[19].addShapeBox(0F, 0F, 0F, 2, 1, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 197
		gs4tailModel[19].setRotationPoint(-62F, -21F, -5F);

		gs4tailModel[20].addBox(0F, 0F, 0F, 4, 2, 2, 0F); // Box 203
		gs4tailModel[20].setRotationPoint(-64F, 0F, -1F);

		gs4tailModel[21].addBox(0F, 0F, 0F, 108, 22, 1, 0F); // Box 204
		gs4tailModel[21].setRotationPoint(-49F, -22F, -11F);

		gs4tailModel[22].addShapeBox(0F, 0F, 0F, 72, 0, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 102
		gs4tailModel[22].setRotationPoint(-24F, -16F, 6F);

		gs4tailModel[23].addShapeBox(0F, 0F, 0F, 72, 0, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 103
		gs4tailModel[23].setRotationPoint(-24F, -16F, -10F);

		gs4tailModel[24].addShapeBox(0F, 0F, 0F, 119, 2, 22, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 99
		gs4tailModel[24].setRotationPoint(-60F, -24F, -11F);

		gs4tailModel[25].addShapeBox(0F, 0F, 0F, 16, 2, 22, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 99
		gs4tailModel[25].setRotationPoint(-60F, 1F, -11F);

		gs4tailModel[26].addShapeBox(0F, 0F, 0F, 16, 2, 22, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 100
		gs4tailModel[26].setRotationPoint(43F, 1F, -11F);

		gs4tailModel[27].addShapeBox(0F, 0F, 0F, 3, 1, 22, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 99
		gs4tailModel[27].setRotationPoint(59F, 0F, -11F);

		gs4tailModel[28].addShapeBox(0F, 0F, 0F, 3, 1, 20, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 100
		gs4tailModel[28].setRotationPoint(62F, 0F, -10F);

		gs4tailModel[29].addShapeBox(0F, 0F, 0F, 3, 1, 16, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 101
		gs4tailModel[29].setRotationPoint(65F, 0F, -8F);

		gs4tailModel[30].addShapeBox(0F, 0F, 0F, 2, 1, 10, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F); // Box 102
		gs4tailModel[30].setRotationPoint(68F, 0F, -5F);

		gs4tailModel[31].addShapeBox(0F, 0F, 0F, 3, 22, 1, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 103
		gs4tailModel[31].setRotationPoint(59F, -22F, -11F);

		gs4tailModel[32].addShapeBox(0F, 0F, 0F, 3, 22, 1, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F); // Box 104
		gs4tailModel[32].setRotationPoint(62F, -22F, -10F);

		gs4tailModel[33].addShapeBox(0F, 0F, 0F, 3, 22, 1, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 0F); // Box 105
		gs4tailModel[33].setRotationPoint(65F, -22F, -8F);

		gs4tailModel[34].addBox(0F, 0F, 0F, 1, 22, 2, 0F); // Box 106
		gs4tailModel[34].setRotationPoint(69F, -22F, -1F);

		gs4tailModel[35].addShapeBox(0F, 0F, 0F, 1, 22, 4, 0F, 1F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 107
		gs4tailModel[35].setRotationPoint(69F, -22F, -5F);

		gs4tailModel[36].addShapeBox(0F, 0F, 0F, 1, 22, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, -1F); // Box 108
		gs4tailModel[36].setRotationPoint(69F, -22F, 1F);

		gs4tailModel[37].addShapeBox(0F, 0F, 0F, 3, 22, 1, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 109
		gs4tailModel[37].setRotationPoint(65F, -22F, 7F);

		gs4tailModel[38].addShapeBox(0F, 0F, 0F, 3, 22, 1, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 110
		gs4tailModel[38].setRotationPoint(62F, -22F, 9F);

		gs4tailModel[39].addShapeBox(0F, 0F, 0F, 3, 22, 1, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 111
		gs4tailModel[39].setRotationPoint(59F, -22F, 10F);

		gs4tailModel[40].addShapeBox(0F, 0F, 0F, 3, 2, 22, 0F, 0F, 0F, -3F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 112
		gs4tailModel[40].setRotationPoint(59F, -24F, -11F);

		gs4tailModel[41].addShapeBox(0F, 0F, 0F, 3, 2, 20, 0F, 0F, 0F, -3F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 113
		gs4tailModel[41].setRotationPoint(62F, -24F, -10F);

		gs4tailModel[42].addShapeBox(0F, 0F, 0F, 3, 2, 16, 0F, 0F, 0F, -3F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 114
		gs4tailModel[42].setRotationPoint(65F, -24F, -8F);

		gs4tailModel[43].addShapeBox(0F, 0F, 0F, 2, 2, 10, 0F, 0F, 0F, -2F, -1F, 0F, -4.5F, -1F, 0F, -4.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F); // Box 115
		gs4tailModel[43].setRotationPoint(68F, -24F, -5F);

		gs4tailModel[44].addShapeBox(0F, 0F, 0F, 3, 2, 16, 0F, 0F, 0F, -4F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 116
		gs4tailModel[44].setRotationPoint(59F, -26F, -8F);

		gs4tailModel[45].addShapeBox(0F, 0F, 0F, 3, 2, 14, 0F, 0F, 0F, -4F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 117
		gs4tailModel[45].setRotationPoint(62F, -26F, -7F);

		gs4tailModel[46].addShapeBox(0F, 0F, 0F, 2, 2, 10, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -1.32F, -1F, 0F, -4.5F, -1F, 0F, -4.5F, 0F, 0F, -1.32F); // Box 120
		gs4tailModel[46].setRotationPoint(65F, -24F, -5F);
		gs4tailModel[46].rotateAngleZ = 1.57079633F;

		gs4tailModel[47].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 121
		gs4tailModel[47].setRotationPoint(67F, -25F, -0.5F);

		gs4tailModel[48].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 2.2F); // Box 122
		gs4tailModel[48].setRotationPoint(67F, -25F, 0.5F);

		gs4tailModel[49].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 2.2F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 123
		gs4tailModel[49].setRotationPoint(67F, -25F, -1.5F);

		gs4tailModel[50].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1.5F); // Box 124
		gs4tailModel[50].setRotationPoint(68F, -25F, 0.5F);

		gs4tailModel[51].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 1.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 125
		gs4tailModel[51].setRotationPoint(68F, -25F, -1.5F);

		gs4tailModel[52].addShapeBox(0F, 0F, 0F, 3, 2, 22, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -3F); // Box 118
		gs4tailModel[52].setRotationPoint(59F, 1F, -11F);

		gs4tailModel[53].addShapeBox(0F, 0F, 0F, 3, 2, 20, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -3F); // Box 119
		gs4tailModel[53].setRotationPoint(62F, 1F, -10F);

		gs4tailModel[54].addShapeBox(0F, 0F, 0F, 3, 2, 16, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -3F); // Box 120
		gs4tailModel[54].setRotationPoint(65F, 1F, -8F);

		gs4tailModel[55].addShapeBox(0F, 0F, 0F, 2, 2, 10, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -3F, -1.5F, 0F, -4.5F, -1.5F, 0F, -4.5F, 0F, 0F, -3F); // Box 121
		gs4tailModel[55].setRotationPoint(68F, 1F, -5F);

		gs4tailModel[56].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 123
		gs4tailModel[56].setRotationPoint(-22F, -3F, 2F);

		gs4tailModel[57].addBox(0F, 0F, 0F, 2, 1, 7, 0F); // Box 124
		gs4tailModel[57].setRotationPoint(-25F, -1F, 2.5F);

		gs4tailModel[58].addBox(0F, 0F, 0F, 4, 2, 8, 0F); // Box 125
		gs4tailModel[58].setRotationPoint(-26F, -3F, 2F);

		gs4tailModel[59].addBox(0F, 0F, 0F, 4, 3, 1, 0F); // Box 126
		gs4tailModel[59].setRotationPoint(-25.55F, -5F, 1.5F);

		gs4tailModel[60].addShapeBox(0F, 0F, 0F, 1, 7, 8, 0F, -1.5F, 0F, 0F, 1.5F, -0.2F, 0F, 1.5F, -0.2F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 127
		gs4tailModel[60].setRotationPoint(-22F, -10F, 2F);

		gs4tailModel[61].addBox(0F, 0F, 0F, 1, 2, 6, 0F); // Box 128
		gs4tailModel[61].setRotationPoint(-21F, -10.2F, 3F);

		gs4tailModel[62].addBox(0F, 0F, 0F, 1, 2, 6, 0F); // Box 129
		gs4tailModel[62].setRotationPoint(-12F, -10.2F, 3F);

		gs4tailModel[63].addBox(0F, 0F, 0F, 1, 2, 6, 0F); // Box 130
		gs4tailModel[63].setRotationPoint(-12F, -10.2F, -9F);

		gs4tailModel[64].addShapeBox(0F, 0F, 0F, 1, 7, 8, 0F, -1.5F, 0F, 0F, 1.5F, -0.2F, 0F, 1.5F, -0.2F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 131
		gs4tailModel[64].setRotationPoint(-13F, -10F, 2F);

		gs4tailModel[65].addShapeBox(0F, 0F, 0F, 1, 7, 8, 0F, -1.5F, 0F, 0F, 1.5F, -0.2F, 0F, 1.5F, -0.2F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 132
		gs4tailModel[65].setRotationPoint(-13F, -10F, -10F);

		gs4tailModel[66].addBox(0F, 0F, 0F, 4, 2, 8, 0F); // Box 133
		gs4tailModel[66].setRotationPoint(-17F, -3F, -10F);

		gs4tailModel[67].addBox(0F, 0F, 0F, 4, 3, 1, 0F); // Box 134
		gs4tailModel[67].setRotationPoint(-16.55F, -5F, -2.5F);

		gs4tailModel[68].addBox(0F, 0F, 0F, 4, 3, 1, 0F); // Box 135
		gs4tailModel[68].setRotationPoint(-16.55F, -5F, 1.5F);

		gs4tailModel[69].addBox(0F, 0F, 0F, 4, 2, 8, 0F); // Box 136
		gs4tailModel[69].setRotationPoint(-17F, -3F, 2F);

		gs4tailModel[70].addBox(0F, 0F, 0F, 2, 1, 7, 0F); // Box 137
		gs4tailModel[70].setRotationPoint(-16F, -1F, 2.5F);

		gs4tailModel[71].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 138
		gs4tailModel[71].setRotationPoint(-13F, -3F, 2F);

		gs4tailModel[72].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 139
		gs4tailModel[72].setRotationPoint(-13F, -3F, -10F);

		gs4tailModel[73].addBox(0F, 0F, 0F, 2, 1, 7, 0F); // Box 140
		gs4tailModel[73].setRotationPoint(-16F, -1F, -9.5F);

		gs4tailModel[74].addBox(0F, 0F, 0F, 1, 2, 6, 0F); // Box 141
		gs4tailModel[74].setRotationPoint(-3F, -10.2F, 3F);

		gs4tailModel[75].addBox(0F, 0F, 0F, 1, 2, 6, 0F); // Box 142
		gs4tailModel[75].setRotationPoint(-3F, -10.2F, -9F);

		gs4tailModel[76].addShapeBox(0F, 0F, 0F, 1, 7, 8, 0F, -1.5F, 0F, 0F, 1.5F, -0.2F, 0F, 1.5F, -0.2F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 143
		gs4tailModel[76].setRotationPoint(-4F, -10F, 2F);

		gs4tailModel[77].addShapeBox(0F, 0F, 0F, 1, 7, 8, 0F, -1.5F, 0F, 0F, 1.5F, -0.2F, 0F, 1.5F, -0.2F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 144
		gs4tailModel[77].setRotationPoint(-4F, -10F, -10F);

		gs4tailModel[78].addBox(0F, 0F, 0F, 4, 2, 8, 0F); // Box 145
		gs4tailModel[78].setRotationPoint(-8F, -3F, -10F);

		gs4tailModel[79].addBox(0F, 0F, 0F, 4, 3, 1, 0F); // Box 146
		gs4tailModel[79].setRotationPoint(-7.55F, -5F, -2.5F);

		gs4tailModel[80].addBox(0F, 0F, 0F, 4, 3, 1, 0F); // Box 147
		gs4tailModel[80].setRotationPoint(-7.55F, -5F, 1.5F);

		gs4tailModel[81].addBox(0F, 0F, 0F, 4, 2, 8, 0F); // Box 148
		gs4tailModel[81].setRotationPoint(-8F, -3F, 2F);

		gs4tailModel[82].addBox(0F, 0F, 0F, 2, 1, 7, 0F); // Box 149
		gs4tailModel[82].setRotationPoint(-7F, -1F, 2.5F);

		gs4tailModel[83].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 150
		gs4tailModel[83].setRotationPoint(-4F, -3F, 2F);

		gs4tailModel[84].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 151
		gs4tailModel[84].setRotationPoint(-4F, -3F, -10F);

		gs4tailModel[85].addBox(0F, 0F, 0F, 2, 1, 7, 0F); // Box 152
		gs4tailModel[85].setRotationPoint(-7F, -1F, -9.5F);

		gs4tailModel[86].addBox(0F, 0F, 0F, 1, 2, 6, 0F); // Box 153
		gs4tailModel[86].setRotationPoint(5F, -10.2F, 3F);

		gs4tailModel[87].addBox(0F, 0F, 0F, 1, 2, 6, 0F); // Box 154
		gs4tailModel[87].setRotationPoint(5F, -10.2F, -9F);

		gs4tailModel[88].addShapeBox(0F, 0F, 0F, 1, 7, 8, 0F, -1.5F, 0F, 0F, 1.5F, -0.2F, 0F, 1.5F, -0.2F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 155
		gs4tailModel[88].setRotationPoint(4F, -10F, 2F);

		gs4tailModel[89].addShapeBox(0F, 0F, 0F, 1, 7, 8, 0F, -1.5F, 0F, 0F, 1.5F, -0.2F, 0F, 1.5F, -0.2F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 156
		gs4tailModel[89].setRotationPoint(4F, -10F, -10F);

		gs4tailModel[90].addBox(0F, 0F, 0F, 4, 2, 8, 0F); // Box 157
		gs4tailModel[90].setRotationPoint(0F, -3F, -10F);

		gs4tailModel[91].addBox(0F, 0F, 0F, 4, 3, 1, 0F); // Box 158
		gs4tailModel[91].setRotationPoint(0.449999999999999F, -5F, -2.5F);

		gs4tailModel[92].addBox(0F, 0F, 0F, 4, 3, 1, 0F); // Box 159
		gs4tailModel[92].setRotationPoint(0.449999999999999F, -5F, 1.5F);

		gs4tailModel[93].addBox(0F, 0F, 0F, 4, 2, 8, 0F); // Box 160
		gs4tailModel[93].setRotationPoint(0F, -3F, 2F);

		gs4tailModel[94].addBox(0F, 0F, 0F, 2, 1, 7, 0F); // Box 161
		gs4tailModel[94].setRotationPoint(1F, -1F, 2.5F);

		gs4tailModel[95].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 162
		gs4tailModel[95].setRotationPoint(4F, -3F, 2F);

		gs4tailModel[96].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 163
		gs4tailModel[96].setRotationPoint(4F, -3F, -10F);

		gs4tailModel[97].addBox(0F, 0F, 0F, 2, 1, 7, 0F); // Box 164
		gs4tailModel[97].setRotationPoint(1F, -1F, -9.5F);

		gs4tailModel[98].addBox(0F, 0F, 0F, 1, 2, 6, 0F); // Box 165
		gs4tailModel[98].setRotationPoint(14F, -10.2F, 3F);

		gs4tailModel[99].addBox(0F, 0F, 0F, 1, 2, 6, 0F); // Box 166
		gs4tailModel[99].setRotationPoint(14F, -10.2F, -9F);

		gs4tailModel[100].addShapeBox(0F, 0F, 0F, 1, 7, 8, 0F, -1.5F, 0F, 0F, 1.5F, -0.2F, 0F, 1.5F, -0.2F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 167
		gs4tailModel[100].setRotationPoint(13F, -10F, 2F);

		gs4tailModel[101].addShapeBox(0F, 0F, 0F, 1, 7, 8, 0F, -1.5F, 0F, 0F, 1.5F, -0.2F, 0F, 1.5F, -0.2F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 168
		gs4tailModel[101].setRotationPoint(13F, -10F, -10F);

		gs4tailModel[102].addBox(0F, 0F, 0F, 4, 2, 8, 0F); // Box 169
		gs4tailModel[102].setRotationPoint(9F, -3F, -10F);

		gs4tailModel[103].addBox(0F, 0F, 0F, 4, 3, 1, 0F); // Box 170
		gs4tailModel[103].setRotationPoint(9.45F, -5F, -2.5F);

		gs4tailModel[104].addBox(0F, 0F, 0F, 4, 3, 1, 0F); // Box 171
		gs4tailModel[104].setRotationPoint(9.45F, -5F, 1.5F);

		gs4tailModel[105].addBox(0F, 0F, 0F, 4, 2, 8, 0F); // Box 172
		gs4tailModel[105].setRotationPoint(9F, -3F, 2F);

		gs4tailModel[106].addBox(0F, 0F, 0F, 2, 1, 7, 0F); // Box 173
		gs4tailModel[106].setRotationPoint(10F, -1F, 2.5F);

		gs4tailModel[107].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 174
		gs4tailModel[107].setRotationPoint(13F, -3F, 2F);

		gs4tailModel[108].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 175
		gs4tailModel[108].setRotationPoint(13F, -3F, -10F);

		gs4tailModel[109].addBox(0F, 0F, 0F, 2, 1, 7, 0F); // Box 176
		gs4tailModel[109].setRotationPoint(10F, -1F, -9.5F);

		gs4tailModel[110].addBox(0F, 0F, 0F, 1, 2, 6, 0F); // Box 177
		gs4tailModel[110].setRotationPoint(23F, -10.2F, 3F);

		gs4tailModel[111].addBox(0F, 0F, 0F, 1, 2, 6, 0F); // Box 178
		gs4tailModel[111].setRotationPoint(23F, -10.2F, -9F);

		gs4tailModel[112].addShapeBox(0F, 0F, 0F, 1, 7, 8, 0F, -1.5F, 0F, 0F, 1.5F, -0.2F, 0F, 1.5F, -0.2F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 179
		gs4tailModel[112].setRotationPoint(22F, -10F, 2F);

		gs4tailModel[113].addShapeBox(0F, 0F, 0F, 1, 7, 8, 0F, -1.5F, 0F, 0F, 1.5F, -0.2F, 0F, 1.5F, -0.2F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 180
		gs4tailModel[113].setRotationPoint(22F, -10F, -10F);

		gs4tailModel[114].addBox(0F, 0F, 0F, 4, 2, 8, 0F); // Box 181
		gs4tailModel[114].setRotationPoint(18F, -3F, -10F);

		gs4tailModel[115].addBox(0F, 0F, 0F, 4, 3, 1, 0F); // Box 182
		gs4tailModel[115].setRotationPoint(18.45F, -5F, -2.5F);

		gs4tailModel[116].addBox(0F, 0F, 0F, 4, 3, 1, 0F); // Box 183
		gs4tailModel[116].setRotationPoint(18.45F, -5F, 1.5F);

		gs4tailModel[117].addBox(0F, 0F, 0F, 4, 2, 8, 0F); // Box 184
		gs4tailModel[117].setRotationPoint(18F, -3F, 2F);

		gs4tailModel[118].addBox(0F, 0F, 0F, 2, 1, 7, 0F); // Box 185
		gs4tailModel[118].setRotationPoint(19F, -1F, 2.5F);

		gs4tailModel[119].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 186
		gs4tailModel[119].setRotationPoint(22F, -3F, 2F);

		gs4tailModel[120].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 187
		gs4tailModel[120].setRotationPoint(22F, -3F, -10F);

		gs4tailModel[121].addBox(0F, 0F, 0F, 2, 1, 7, 0F); // Box 188
		gs4tailModel[121].setRotationPoint(19F, -1F, -9.5F);

		gs4tailModel[122].addBox(0F, 0F, 0F, 1, 2, 6, 0F); // Box 189
		gs4tailModel[122].setRotationPoint(32F, -10.2F, 3F);

		gs4tailModel[123].addBox(0F, 0F, 0F, 1, 2, 6, 0F); // Box 190
		gs4tailModel[123].setRotationPoint(32F, -10.2F, -9F);

		gs4tailModel[124].addShapeBox(0F, 0F, 0F, 1, 7, 8, 0F, -1.5F, 0F, 0F, 1.5F, -0.2F, 0F, 1.5F, -0.2F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 191
		gs4tailModel[124].setRotationPoint(31F, -10F, 2F);

		gs4tailModel[125].addShapeBox(0F, 0F, 0F, 1, 7, 8, 0F, -1.5F, 0F, 0F, 1.5F, -0.2F, 0F, 1.5F, -0.2F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 192
		gs4tailModel[125].setRotationPoint(31F, -10F, -10F);

		gs4tailModel[126].addBox(0F, 0F, 0F, 4, 2, 8, 0F); // Box 193
		gs4tailModel[126].setRotationPoint(27F, -3F, -10F);

		gs4tailModel[127].addBox(0F, 0F, 0F, 4, 3, 1, 0F); // Box 194
		gs4tailModel[127].setRotationPoint(27.45F, -5F, -2.5F);

		gs4tailModel[128].addBox(0F, 0F, 0F, 4, 3, 1, 0F); // Box 195
		gs4tailModel[128].setRotationPoint(27.45F, -5F, 1.5F);

		gs4tailModel[129].addBox(0F, 0F, 0F, 4, 2, 8, 0F); // Box 196
		gs4tailModel[129].setRotationPoint(27F, -3F, 2F);

		gs4tailModel[130].addBox(0F, 0F, 0F, 2, 1, 7, 0F); // Box 197
		gs4tailModel[130].setRotationPoint(28F, -1F, 2.5F);

		gs4tailModel[131].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 198
		gs4tailModel[131].setRotationPoint(31F, -3F, 2F);

		gs4tailModel[132].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 199
		gs4tailModel[132].setRotationPoint(31F, -3F, -10F);

		gs4tailModel[133].addBox(0F, 0F, 0F, 2, 1, 7, 0F); // Box 200
		gs4tailModel[133].setRotationPoint(28F, -1F, -9.5F);

		gs4tailModel[134].addBox(0F, 0F, 0F, 1, 2, 6, 0F); // Box 201
		gs4tailModel[134].setRotationPoint(41F, -10.2F, 3F);

		gs4tailModel[135].addBox(0F, 0F, 0F, 1, 2, 6, 0F); // Box 202
		gs4tailModel[135].setRotationPoint(41F, -10.2F, -9F);

		gs4tailModel[136].addShapeBox(0F, 0F, 0F, 1, 7, 8, 0F, -1.5F, 0F, 0F, 1.5F, -0.2F, 0F, 1.5F, -0.2F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 203
		gs4tailModel[136].setRotationPoint(40F, -10F, 2F);

		gs4tailModel[137].addShapeBox(0F, 0F, 0F, 1, 7, 8, 0F, -1.5F, 0F, 0F, 1.5F, -0.2F, 0F, 1.5F, -0.2F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 204
		gs4tailModel[137].setRotationPoint(40F, -10F, -10F);

		gs4tailModel[138].addBox(0F, 0F, 0F, 4, 2, 8, 0F); // Box 205
		gs4tailModel[138].setRotationPoint(36F, -3F, -10F);

		gs4tailModel[139].addBox(0F, 0F, 0F, 4, 3, 1, 0F); // Box 206
		gs4tailModel[139].setRotationPoint(36.45F, -5F, -2.5F);

		gs4tailModel[140].addBox(0F, 0F, 0F, 4, 3, 1, 0F); // Box 207
		gs4tailModel[140].setRotationPoint(36.45F, -5F, 1.5F);

		gs4tailModel[141].addBox(0F, 0F, 0F, 4, 2, 8, 0F); // Box 208
		gs4tailModel[141].setRotationPoint(36F, -3F, 2F);

		gs4tailModel[142].addBox(0F, 0F, 0F, 2, 1, 7, 0F); // Box 209
		gs4tailModel[142].setRotationPoint(37F, -1F, 2.5F);

		gs4tailModel[143].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 210
		gs4tailModel[143].setRotationPoint(40F, -3F, 2F);

		gs4tailModel[144].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 211
		gs4tailModel[144].setRotationPoint(40F, -3F, -10F);

		gs4tailModel[145].addBox(0F, 0F, 0F, 2, 1, 7, 0F); // Box 212
		gs4tailModel[145].setRotationPoint(37F, -1F, -9.5F);

		gs4tailModel[146].addBox(0F, 0F, 0F, 1, 2, 6, 0F); // Box 213
		gs4tailModel[146].setRotationPoint(50F, -10.2F, 3F);

		gs4tailModel[147].addBox(0F, 0F, 0F, 1, 2, 6, 0F); // Box 214
		gs4tailModel[147].setRotationPoint(50F, -10.2F, -9F);

		gs4tailModel[148].addShapeBox(0F, 0F, 0F, 1, 7, 8, 0F, -1.5F, 0F, 0F, 1.5F, -0.2F, 0F, 1.5F, -0.2F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 215
		gs4tailModel[148].setRotationPoint(49F, -10F, 2F);

		gs4tailModel[149].addShapeBox(0F, 0F, 0F, 1, 7, 8, 0F, -1.5F, 0F, 0F, 1.5F, -0.2F, 0F, 1.5F, -0.2F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 216
		gs4tailModel[149].setRotationPoint(49F, -10F, -10F);

		gs4tailModel[150].addBox(0F, 0F, 0F, 4, 2, 8, 0F); // Box 217
		gs4tailModel[150].setRotationPoint(45F, -3F, -10F);

		gs4tailModel[151].addBox(0F, 0F, 0F, 4, 3, 1, 0F); // Box 218
		gs4tailModel[151].setRotationPoint(45.45F, -5F, -2.5F);

		gs4tailModel[152].addBox(0F, 0F, 0F, 4, 3, 1, 0F); // Box 219
		gs4tailModel[152].setRotationPoint(45.45F, -5F, 1.5F);

		gs4tailModel[153].addBox(0F, 0F, 0F, 4, 2, 8, 0F); // Box 220
		gs4tailModel[153].setRotationPoint(45F, -3F, 2F);

		gs4tailModel[154].addBox(0F, 0F, 0F, 2, 1, 7, 0F); // Box 221
		gs4tailModel[154].setRotationPoint(46F, -1F, 2.5F);

		gs4tailModel[155].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 222
		gs4tailModel[155].setRotationPoint(49F, -3F, 2F);

		gs4tailModel[156].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 223
		gs4tailModel[156].setRotationPoint(49F, -3F, -10F);

		gs4tailModel[157].addBox(0F, 0F, 0F, 2, 1, 7, 0F); // Box 224
		gs4tailModel[157].setRotationPoint(46F, -1F, -9.5F);
		fixRotation(gs4tailModel, false, true, true);

	}


	ModelGs4Bogie bogie1 = new ModelGs4Bogie();
	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		for(int i = 0; i < 158; i++)
		{
			gs4tailModel[i].render(f5);
		}
		if(entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor()==2){
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/GS4_bogie_Red.png"));
		} else {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/GS4_bogie.png"));
		}

		GL11.glPushMatrix();
		GL11.glTranslated(-3.1,0,0);
		bogie1.render(entity,f,f1,f2,f3,f4,f5);

		GL11.glTranslated(3.7,0,0);
		bogie1.render(entity,f,f1,f2,f3,f4,f5);
		GL11.glPopMatrix();
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
	{
	}

	public ModelRendererTurbo gs4tailModel[];
}