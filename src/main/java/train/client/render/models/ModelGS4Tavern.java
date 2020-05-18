//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2018 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator:
// Created on:30.03.2018 - 14:09:12
// Last changed on: 30.03.2018 - 14:09:12

package train.client.render.models;

import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import tmt.ModelBase;
import tmt.ModelRendererTurbo;
import tmt.Tessellator;
import train.common.api.AbstractTrains;
import train.common.library.Info;

public class ModelGS4Tavern extends ModelBase
{
	int textureX = 512;
	int textureY = 512;

	public ModelGS4Tavern()
	{
		gs4tavernModel = new ModelRendererTurbo[147];
		gs4tavernModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 1
		gs4tavernModel[1] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 9
		gs4tavernModel[2] = new ModelRendererTurbo(this, 306, 1, textureX, textureY); // Box 70
		gs4tavernModel[3] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 72
		gs4tavernModel[4] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 76
		gs4tavernModel[5] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 193
		gs4tavernModel[6] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 194
		gs4tavernModel[7] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 195
		gs4tavernModel[8] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 197
		gs4tavernModel[9] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 198
		gs4tavernModel[10] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 199
		gs4tavernModel[11] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 200
		gs4tavernModel[12] = new ModelRendererTurbo(this, 465, 17, textureX, textureY); // Box 201
		gs4tavernModel[13] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 202
		gs4tavernModel[14] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 203
		gs4tavernModel[15] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 204
		gs4tavernModel[16] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 99
		gs4tavernModel[17] = new ModelRendererTurbo(this, 329, 33, textureX, textureY); // Box 99
		gs4tavernModel[18] = new ModelRendererTurbo(this, 409, 33, textureX, textureY); // Box 100
		gs4tavernModel[19] = new ModelRendererTurbo(this, 474, 17, textureX, textureY); // Box 163
		gs4tavernModel[20] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 164
		gs4tavernModel[21] = new ModelRendererTurbo(this, 385, 33, textureX, textureY); // Box 165
		gs4tavernModel[22] = new ModelRendererTurbo(this, 465, 33, textureX, textureY); // Box 166
		gs4tavernModel[23] = new ModelRendererTurbo(this, 489, 25, textureX, textureY); // Box 163
		gs4tavernModel[24] = new ModelRendererTurbo(this, 409, 41, textureX, textureY); // Box 164
		gs4tavernModel[25] = new ModelRendererTurbo(this, 481, 41, textureX, textureY); // Box 165
		gs4tavernModel[26] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 166
		gs4tavernModel[27] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 182
		gs4tavernModel[28] = new ModelRendererTurbo(this, 257, 9, textureX, textureY); // Box 15
		gs4tavernModel[29] = new ModelRendererTurbo(this, 265, 49, textureX, textureY); // Box 16
		gs4tavernModel[30] = new ModelRendererTurbo(this, 265, 57, textureX, textureY); // Box 18
		gs4tavernModel[31] = new ModelRendererTurbo(this, 329, 17, textureX, textureY); // Box 19
		gs4tavernModel[32] = new ModelRendererTurbo(this, 313, 49, textureX, textureY); // Box 21
		gs4tavernModel[33] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 22
		gs4tavernModel[34] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 24
		gs4tavernModel[35] = new ModelRendererTurbo(this, 289, 57, textureX, textureY); // Box 25
		gs4tavernModel[36] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 26
		gs4tavernModel[37] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 27
		gs4tavernModel[38] = new ModelRendererTurbo(this, 449, 17, textureX, textureY); // Box 53
		gs4tavernModel[39] = new ModelRendererTurbo(this, 289, 65, textureX, textureY); // Box 56
		gs4tavernModel[40] = new ModelRendererTurbo(this, 473, 57, textureX, textureY); // Box 58
		gs4tavernModel[41] = new ModelRendererTurbo(this, 337, 65, textureX, textureY); // Box 62
		gs4tavernModel[42] = new ModelRendererTurbo(this, 497, 57, textureX, textureY); // Box 64
		gs4tavernModel[43] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 65
		gs4tavernModel[44] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 67
		gs4tavernModel[45] = new ModelRendererTurbo(this, 489, 17, textureX, textureY); // Box 68
		gs4tavernModel[46] = new ModelRendererTurbo(this, 369, 65, textureX, textureY); // Box 183
		gs4tavernModel[47] = new ModelRendererTurbo(this, 385, 65, textureX, textureY); // Box 184
		gs4tavernModel[48] = new ModelRendererTurbo(this, 409, 33, textureX, textureY); // Box 185
		gs4tavernModel[49] = new ModelRendererTurbo(this, 409, 65, textureX, textureY); // Box 186
		gs4tavernModel[50] = new ModelRendererTurbo(this, 265, 81, textureX, textureY); // Box 56
		gs4tavernModel[51] = new ModelRendererTurbo(this, 425, 65, textureX, textureY); // Box 71
		gs4tavernModel[52] = new ModelRendererTurbo(this, 441, 65, textureX, textureY); // Box 72
		gs4tavernModel[53] = new ModelRendererTurbo(this, 329, 73, textureX, textureY); // Box 75
		gs4tavernModel[54] = new ModelRendererTurbo(this, 321, 81, textureX, textureY); // Box 78
		gs4tavernModel[55] = new ModelRendererTurbo(this, 457, 65, textureX, textureY); // Box 79
		gs4tavernModel[56] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 120
		gs4tavernModel[57] = new ModelRendererTurbo(this, 265, 73, textureX, textureY); // Box 121
		gs4tavernModel[58] = new ModelRendererTurbo(this, 353, 81, textureX, textureY); // Box 122
		gs4tavernModel[59] = new ModelRendererTurbo(this, 425, 81, textureX, textureY); // Box 123
		gs4tavernModel[60] = new ModelRendererTurbo(this, 73, 113, textureX, textureY); // Box 190
		gs4tavernModel[61] = new ModelRendererTurbo(this, 129, 113, textureX, textureY); // Box 191
		gs4tavernModel[62] = new ModelRendererTurbo(this, 257, 105, textureX, textureY); // Box 192
		gs4tavernModel[63] = new ModelRendererTurbo(this, 273, 105, textureX, textureY); // Box 193
		gs4tavernModel[64] = new ModelRendererTurbo(this, 329, 105, textureX, textureY); // Box 194
		gs4tavernModel[65] = new ModelRendererTurbo(this, 353, 105, textureX, textureY); // Box 195
		gs4tavernModel[66] = new ModelRendererTurbo(this, 393, 105, textureX, textureY); // Box 196
		gs4tavernModel[67] = new ModelRendererTurbo(this, 417, 105, textureX, textureY); // Box 197
		gs4tavernModel[68] = new ModelRendererTurbo(this, 217, 113, textureX, textureY); // Box 233
		gs4tavernModel[69] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 234
		gs4tavernModel[70] = new ModelRendererTurbo(this, 401, 57, textureX, textureY); // Box 238
		gs4tavernModel[71] = new ModelRendererTurbo(this, 9, 81, textureX, textureY); // Box 239
		gs4tavernModel[72] = new ModelRendererTurbo(this, 249, 113, textureX, textureY); // Box 240
		gs4tavernModel[73] = new ModelRendererTurbo(this, 265, 113, textureX, textureY); // Box 241
		gs4tavernModel[74] = new ModelRendererTurbo(this, 281, 113, textureX, textureY); // Box 242
		gs4tavernModel[75] = new ModelRendererTurbo(this, 297, 113, textureX, textureY); // Box 243
		gs4tavernModel[76] = new ModelRendererTurbo(this, 1, 121, textureX, textureY); // Box 244
		gs4tavernModel[77] = new ModelRendererTurbo(this, 49, 121, textureX, textureY); // Box 147
		gs4tavernModel[78] = new ModelRendererTurbo(this, 465, 33, textureX, textureY); // Box 149
		gs4tavernModel[79] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 150
		gs4tavernModel[80] = new ModelRendererTurbo(this, 385, 33, textureX, textureY); // Box 151
		gs4tavernModel[81] = new ModelRendererTurbo(this, 449, 17, textureX, textureY); // Box 152
		gs4tavernModel[82] = new ModelRendererTurbo(this, 409, 33, textureX, textureY); // Box 153
		gs4tavernModel[83] = new ModelRendererTurbo(this, 474, 17, textureX, textureY); // Box 154
		gs4tavernModel[84] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 155
		gs4tavernModel[85] = new ModelRendererTurbo(this, 313, 49, textureX, textureY); // Box 156
		gs4tavernModel[86] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 157
		gs4tavernModel[87] = new ModelRendererTurbo(this, 265, 49, textureX, textureY); // Box 158
		gs4tavernModel[88] = new ModelRendererTurbo(this, 265, 57, textureX, textureY); // Box 159
		gs4tavernModel[89] = new ModelRendererTurbo(this, 329, 17, textureX, textureY); // Box 160
		gs4tavernModel[90] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 161
		gs4tavernModel[91] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 162
		gs4tavernModel[92] = new ModelRendererTurbo(this, 489, 25, textureX, textureY); // Box 163
		gs4tavernModel[93] = new ModelRendererTurbo(this, 409, 41, textureX, textureY); // Box 164
		gs4tavernModel[94] = new ModelRendererTurbo(this, 481, 41, textureX, textureY); // Box 165
		gs4tavernModel[95] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 166
		gs4tavernModel[96] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 167
		gs4tavernModel[97] = new ModelRendererTurbo(this, 257, 9, textureX, textureY); // Box 168
		gs4tavernModel[98] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 169
		gs4tavernModel[99] = new ModelRendererTurbo(this, 289, 57, textureX, textureY); // Box 170
		gs4tavernModel[100] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 171
		gs4tavernModel[101] = new ModelRendererTurbo(this, 497, 57, textureX, textureY); // Box 172
		gs4tavernModel[102] = new ModelRendererTurbo(this, 409, 65, textureX, textureY); // Box 173
		gs4tavernModel[103] = new ModelRendererTurbo(this, 489, 17, textureX, textureY); // Box 174
		gs4tavernModel[104] = new ModelRendererTurbo(this, 473, 57, textureX, textureY); // Box 175
		gs4tavernModel[105] = new ModelRendererTurbo(this, 337, 65, textureX, textureY); // Box 176
		gs4tavernModel[106] = new ModelRendererTurbo(this, 289, 65, textureX, textureY); // Box 177
		gs4tavernModel[107] = new ModelRendererTurbo(this, 369, 65, textureX, textureY); // Box 178
		gs4tavernModel[108] = new ModelRendererTurbo(this, 385, 65, textureX, textureY); // Box 179
		gs4tavernModel[109] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 180
		gs4tavernModel[110] = new ModelRendererTurbo(this, 217, 113, textureX, textureY); // Box 182
		gs4tavernModel[111] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 183
		gs4tavernModel[112] = new ModelRendererTurbo(this, 217, 113, textureX, textureY); // Box 185
		gs4tavernModel[113] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 186
		gs4tavernModel[114] = new ModelRendererTurbo(this, 217, 113, textureX, textureY); // Box 188
		gs4tavernModel[115] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 189
		gs4tavernModel[116] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 190
		gs4tavernModel[117] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 191
		gs4tavernModel[118] = new ModelRendererTurbo(this, 217, 113, textureX, textureY); // Box 192
		gs4tavernModel[119] = new ModelRendererTurbo(this, 217, 113, textureX, textureY); // Box 193
		gs4tavernModel[120] = new ModelRendererTurbo(this, 217, 113, textureX, textureY); // Box 194
		gs4tavernModel[121] = new ModelRendererTurbo(this, 217, 113, textureX, textureY); // Box 195
		gs4tavernModel[122] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 196
		gs4tavernModel[123] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 197
		gs4tavernModel[124] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 198
		gs4tavernModel[125] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 199
		gs4tavernModel[126] = new ModelRendererTurbo(this, 217, 113, textureX, textureY); // Box 200
		gs4tavernModel[127] = new ModelRendererTurbo(this, 217, 113, textureX, textureY); // Box 201
		gs4tavernModel[128] = new ModelRendererTurbo(this, 217, 113, textureX, textureY); // Box 202
		gs4tavernModel[129] = new ModelRendererTurbo(this, 217, 113, textureX, textureY); // Box 203
		gs4tavernModel[130] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 204
		gs4tavernModel[131] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 205
		gs4tavernModel[132] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 206
		gs4tavernModel[133] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 207
		gs4tavernModel[134] = new ModelRendererTurbo(this, 217, 113, textureX, textureY); // Box 208
		gs4tavernModel[135] = new ModelRendererTurbo(this, 217, 113, textureX, textureY); // Box 209
		gs4tavernModel[136] = new ModelRendererTurbo(this, 217, 113, textureX, textureY); // Box 210
		gs4tavernModel[137] = new ModelRendererTurbo(this, 217, 113, textureX, textureY); // Box 211
		gs4tavernModel[138] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 212
		gs4tavernModel[139] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 213
		gs4tavernModel[140] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 214
		gs4tavernModel[141] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 215
		gs4tavernModel[142] = new ModelRendererTurbo(this, 217, 113, textureX, textureY); // Box 216
		gs4tavernModel[143] = new ModelRendererTurbo(this, 217, 113, textureX, textureY); // Box 217
		gs4tavernModel[144] = new ModelRendererTurbo(this, 217, 113, textureX, textureY); // Box 218
		gs4tavernModel[145] = new ModelRendererTurbo(this, 217, 113, textureX, textureY); // Box 219
		gs4tavernModel[146] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 220

		gs4tavernModel[0].addShapeBox(0F, 0F, 0F, 119, 2, 16, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		gs4tavernModel[0].setRotationPoint(-60F, -26F, -8F);

		gs4tavernModel[1].addBox(0F, 0F, 0F, 1, 22, 20, 0F); // Box 9
		gs4tavernModel[1].setRotationPoint(-60F, -22F, -10F);

		gs4tavernModel[2].addBox(0F, 0F, 0F, 1, 22, 20, 0F); // Box 70
		gs4tavernModel[2].setRotationPoint(58F, -22F, -10F);

		gs4tavernModel[3].addBox(0F, 0F, 0F, 119, 1, 22, 0F); // Box 72
		gs4tavernModel[3].setRotationPoint(-60F, 0F, -11F);

		gs4tavernModel[4].addShapeBox(0F, 0F, 0F, 33, 2, 22, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 76
		gs4tavernModel[4].setRotationPoint(-17F, 1F, -11F);

		gs4tavernModel[5].addBox(0F, 0F, 0F, 2, 18, 1, 0F); // Box 193
		gs4tavernModel[5].setRotationPoint(-62F, -20F, -6F);

		gs4tavernModel[6].addBox(0F, 0F, 0F, 2, 18, 1, 0F); // Box 194
		gs4tavernModel[6].setRotationPoint(-62F, -20F, 5F);

		gs4tavernModel[7].addShapeBox(0F, 0F, 0F, 2, 1, 10, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 195
		gs4tavernModel[7].setRotationPoint(-62F, -2F, -5F);

		gs4tavernModel[8].addShapeBox(0F, 0F, 0F, 2, 1, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 197
		gs4tavernModel[8].setRotationPoint(-62F, -21F, -5F);

		gs4tavernModel[9].addShapeBox(0F, 0F, 0F, 2, 1, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 198
		gs4tavernModel[9].setRotationPoint(59F, -21F, -5F);

		gs4tavernModel[10].addBox(0F, 0F, 0F, 2, 18, 1, 0F); // Box 199
		gs4tavernModel[10].setRotationPoint(59F, -20F, 5F);

		gs4tavernModel[11].addShapeBox(0F, 0F, 0F, 2, 1, 10, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 200
		gs4tavernModel[11].setRotationPoint(59F, -2F, -5F);

		gs4tavernModel[12].addBox(0F, 0F, 0F, 2, 18, 1, 0F); // Box 201
		gs4tavernModel[12].setRotationPoint(59F, -20F, -6F);

		gs4tavernModel[13].addBox(0F, 0F, 0F, 4, 2, 2, 0F); // Box 202
		gs4tavernModel[13].setRotationPoint(59F, 0F, -1F);

		gs4tavernModel[14].addBox(0F, 0F, 0F, 4, 2, 2, 0F); // Box 203
		gs4tavernModel[14].setRotationPoint(-64F, 0F, -1F);

		gs4tavernModel[15].addBox(0F, 0F, 0F, 119, 22, 1, 0F); // Box 204
		gs4tavernModel[15].setRotationPoint(-60F, -22F, 10F);

		gs4tavernModel[16].addShapeBox(0F, 0F, 0F, 119, 2, 22, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 99
		gs4tavernModel[16].setRotationPoint(-60F, -24F, -11F);

		gs4tavernModel[17].addShapeBox(0F, 0F, 0F, 16, 2, 22, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 99
		gs4tavernModel[17].setRotationPoint(-60F, 1F, -11F);

		gs4tavernModel[18].addShapeBox(0F, 0F, 0F, 16, 2, 22, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 100
		gs4tavernModel[18].setRotationPoint(43F, 1F, -11F);

		gs4tavernModel[19].addShapeBox(0F, 0F, 0F, 1, 7, 8, 0F, 1.5F, -0.2F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 163
		gs4tavernModel[19].setRotationPoint(31F, -10F, -5F);

		gs4tavernModel[20].addBox(0F, 0F, 0F, 1, 2, 7, 0F); // Box 164
		gs4tavernModel[20].setRotationPoint(30F, -10.2F, -4F);

		gs4tavernModel[21].addBox(0F, 0F, 0F, 4, 2, 8, 0F); // Box 165
		gs4tavernModel[21].setRotationPoint(32F, -3F, -5F);

		gs4tavernModel[22].addBox(0F, 0F, 0F, 2, 1, 7, 0F); // Box 166
		gs4tavernModel[22].setRotationPoint(33F, -1F, -4.5F);

		gs4tavernModel[23].addShapeBox(0F, 0F, 0F, 1, 7, 8, 0F, -1.5F, 0F, 0F, 1.5F, -0.2F, 0F, 1.5F, -0.2F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 163
		gs4tavernModel[23].setRotationPoint(48F, -10F, -5F);

		gs4tavernModel[24].addBox(0F, 0F, 0F, 1, 2, 7, 0F); // Box 164
		gs4tavernModel[24].setRotationPoint(49F, -10.2F, -4F);

		gs4tavernModel[25].addBox(0F, 0F, 0F, 4, 2, 8, 0F); // Box 165
		gs4tavernModel[25].setRotationPoint(44F, -3F, -5F);

		gs4tavernModel[26].addBox(0F, 0F, 0F, 2, 1, 7, 0F); // Box 166
		gs4tavernModel[26].setRotationPoint(45F, -1F, -4.5F);

		gs4tavernModel[27].addBox(0F, 0F, 0F, 4, 3, 1, 0F); // Box 182
		gs4tavernModel[27].setRotationPoint(44.45F, -5F, -5.5F);

		gs4tavernModel[28].addBox(0F, 0F, 0F, 7, 1, 2, 0F); // Box 15
		gs4tavernModel[28].setRotationPoint(36.5F, -1F, 4F);

		gs4tavernModel[29].addShapeBox(0F, 0F, 0F, 16, 2, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 16
		gs4tavernModel[29].setRotationPoint(32F, -3F, 3F);

		gs4tavernModel[30].addShapeBox(0F, 0F, 0F, 8, 7, 1, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, -0.2F, 1.5F, 0F, -0.2F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 18
		gs4tavernModel[30].setRotationPoint(36F, -10F, 7F);

		gs4tavernModel[31].addBox(0F, 0F, 0F, 8, 2, 1, 0F); // Box 19
		gs4tavernModel[31].setRotationPoint(36F, -10.2F, 8F);

		gs4tavernModel[32].addShapeBox(0F, 0F, 0F, 1, 7, 4, 0F, 1.5F, -0.2F, 0F, -1.5F, 0F, 0F, 4F, 0F, 1.5F, -5F, -0.2F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, -5F, 0F, 1F); // Box 21
		gs4tavernModel[32].setRotationPoint(31F, -10F, 3F);

		gs4tavernModel[33].addShapeBox(0F, 0F, 0F, 4, 7, 1, 0F, 0F, 0F, -1.5F, 1.5F, 0F, 4F, 2.5F, -0.2F, -5F, 0F, -0.2F, 1.5F, 0F, 0F, 0F, 0F, 0F, 4F, 1F, 0F, -5F, 0F, 0F, 0F); // Box 22
		gs4tavernModel[33].setRotationPoint(44F, -10F, 7F);

		gs4tavernModel[34].addBox(0F, 0F, 0F, 2, 5, 2, 0F); // Box 24
		gs4tavernModel[34].setRotationPoint(39F, -5F, -2F);

		gs4tavernModel[35].addBox(0F, 0F, 0F, 6, 1, 6, 0F); // Box 25
		gs4tavernModel[35].setRotationPoint(37F, -6F, -4F);

		gs4tavernModel[36].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 1F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 1F, 0F, -6F, 0F, 0F, 0F); // Box 26
		gs4tavernModel[36].setRotationPoint(44F, -10.2F, 8F);

		gs4tavernModel[37].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, -6F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, -6F, 0F, 1F); // Box 27
		gs4tavernModel[37].setRotationPoint(30F, -10.2F, 3F);

		gs4tavernModel[38].addBox(0F, 0F, 0F, 4, 3, 1, 0F); // Box 53
		gs4tavernModel[38].setRotationPoint(31.55F, -5F, -5.5F);

		gs4tavernModel[39].addBox(0F, 0F, 0F, 20, 10, 1, 0F); // Box 56
		gs4tavernModel[39].setRotationPoint(30F, -10F, 9F);

		gs4tavernModel[40].addBox(0F, 0F, 0F, 1, 10, 15, 0F); // Box 58
		gs4tavernModel[40].setRotationPoint(50F, -10F, -5F);

		gs4tavernModel[41].addShapeBox(0F, 0F, 0F, 6, 1, 6, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 62
		gs4tavernModel[41].setRotationPoint(44F, -10F, 3F);

		gs4tavernModel[42].addBox(0F, 0F, 0F, 4, 8, 1, 0F); // Box 64
		gs4tavernModel[42].setRotationPoint(47F, -8F, -6F);

		gs4tavernModel[43].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 65
		gs4tavernModel[43].setRotationPoint(47F, -1F, -5F);

		gs4tavernModel[44].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 67
		gs4tavernModel[44].setRotationPoint(30F, -1F, -5F);

		gs4tavernModel[45].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 68
		gs4tavernModel[45].setRotationPoint(47F, -10F, -6F);

		gs4tavernModel[46].addShapeBox(0F, 0F, 0F, 6, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 183
		gs4tavernModel[46].setRotationPoint(30F, -10F, 3F);

		gs4tavernModel[47].addBox(0F, 0F, 0F, 1, 10, 15, 0F); // Box 184
		gs4tavernModel[47].setRotationPoint(29F, -10F, -5F);

		gs4tavernModel[48].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 185
		gs4tavernModel[48].setRotationPoint(29F, -10F, -6F);

		gs4tavernModel[49].addBox(0F, 0F, 0F, 4, 8, 1, 0F); // Box 186
		gs4tavernModel[49].setRotationPoint(29F, -8F, -6F);

		gs4tavernModel[50].addBox(0F, 0F, 0F, 23, 7, 1, 0F); // Box 56
		gs4tavernModel[50].setRotationPoint(-12F, -7F, -3F);

		gs4tavernModel[51].addShapeBox(0F, 0F, 0F, 5, 7, 1, 0F, 1F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 1F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F); // Box 71
		gs4tavernModel[51].setRotationPoint(-17F, -7F, -3F);

		gs4tavernModel[52].addBox(0F, 0F, 0F, 1, 7, 7, 0F); // Box 72
		gs4tavernModel[52].setRotationPoint(-18F, -7F, 3F);

		gs4tavernModel[53].addBox(0F, 0F, 0F, 23, 1, 5, 0F); // Box 75
		gs4tavernModel[53].setRotationPoint(-12F, -8F, -5F);

		gs4tavernModel[54].addBox(0F, 0F, 0F, 5, 1, 7, 0F); // Box 78
		gs4tavernModel[54].setRotationPoint(-20F, -8F, 3F);

		gs4tavernModel[55].addShapeBox(0F, 0F, 0F, 5, 1, 5, 0F, 3F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 3F, 3F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 3F); // Box 79
		gs4tavernModel[55].setRotationPoint(-17F, -8F, -5F);

		gs4tavernModel[56].addShapeBox(0F, 0F, 0F, 1, 7, 5, 0F, 5F, 0F, 0F, -6F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, -6F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 120
		gs4tavernModel[56].setRotationPoint(16F, -7F, -2F);

		gs4tavernModel[57].addShapeBox(0F, 0F, 0F, 5, 1, 5, 0F, 3F, 0F, -2F, -8F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, -2F, -8F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 121
		gs4tavernModel[57].setRotationPoint(14F, -8F, -2F);

		gs4tavernModel[58].addBox(0F, 0F, 0F, 1, 7, 7, 0F); // Box 122
		gs4tavernModel[58].setRotationPoint(16F, -7F, 3F);

		gs4tavernModel[59].addBox(0F, 0F, 0F, 5, 1, 7, 0F); // Box 123
		gs4tavernModel[59].setRotationPoint(14F, -8F, 3F);

		gs4tavernModel[60].addBox(0F, 0F, 0F, 21, 1, 5, 0F); // Box 190
		gs4tavernModel[60].setRotationPoint(-11F, -15F, 5F);

		gs4tavernModel[61].addBox(0F, 0F, 0F, 21, 1, 5, 0F); // Box 191
		gs4tavernModel[61].setRotationPoint(-11F, -19F, 5F);

		gs4tavernModel[62].addBox(0F, 0F, 0F, 1, 3, 5, 0F); // Box 192
		gs4tavernModel[62].setRotationPoint(-11F, -18F, 5F);

		gs4tavernModel[63].addBox(0F, 0F, 0F, 1, 3, 5, 0F); // Box 193
		gs4tavernModel[63].setRotationPoint(-7F, -18F, 5F);

		gs4tavernModel[64].addBox(0F, 0F, 0F, 1, 3, 5, 0F); // Box 194
		gs4tavernModel[64].setRotationPoint(1F, -18F, 5F);

		gs4tavernModel[65].addBox(0F, 0F, 0F, 1, 3, 5, 0F); // Box 195
		gs4tavernModel[65].setRotationPoint(-3F, -18F, 5F);

		gs4tavernModel[66].addBox(0F, 0F, 0F, 1, 3, 5, 0F); // Box 196
		gs4tavernModel[66].setRotationPoint(9F, -18F, 5F);

		gs4tavernModel[67].addBox(0F, 0F, 0F, 1, 3, 5, 0F); // Box 197
		gs4tavernModel[67].setRotationPoint(5F, -18F, 5F);

		gs4tavernModel[68].addBox(0F, 0F, 0F, 1, 1, 4, 0F); // Box 233
		gs4tavernModel[68].setRotationPoint(-9F, -17F, 6F);

		gs4tavernModel[69].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 234
		gs4tavernModel[69].setRotationPoint(-8.75F, -17.25F, 5F);

		gs4tavernModel[70].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 238
		gs4tavernModel[70].setRotationPoint(-11F, -14F, 5F);

		gs4tavernModel[71].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 239
		gs4tavernModel[71].setRotationPoint(-7F, -14F, 5F);

		gs4tavernModel[72].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 240
		gs4tavernModel[72].setRotationPoint(1F, -14F, 5F);

		gs4tavernModel[73].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 241
		gs4tavernModel[73].setRotationPoint(-3F, -14F, 5F);

		gs4tavernModel[74].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 242
		gs4tavernModel[74].setRotationPoint(9F, -14F, 5F);

		gs4tavernModel[75].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 243
		gs4tavernModel[75].setRotationPoint(5F, -14F, 5F);

		gs4tavernModel[76].addBox(0F, 0F, 0F, 19, 1, 1, 0F); // Box 244
		gs4tavernModel[76].setRotationPoint(-10F, -14F, 9F);

		gs4tavernModel[77].addBox(0F, 0F, 0F, 119, 22, 1, 0F); // Box 147
		gs4tavernModel[77].setRotationPoint(-60F, -22F, -11F);

		gs4tavernModel[78].addBox(0F, 0F, 0F, 2, 1, 7, 0F); // Box 149
		gs4tavernModel[78].setRotationPoint(-48F, -1F, -4.5F);

		gs4tavernModel[79].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 150
		gs4tavernModel[79].setRotationPoint(-51F, -1F, -5F);

		gs4tavernModel[80].addBox(0F, 0F, 0F, 4, 2, 8, 0F); // Box 151
		gs4tavernModel[80].setRotationPoint(-49F, -3F, -5F);

		gs4tavernModel[81].addBox(0F, 0F, 0F, 4, 3, 1, 0F); // Box 152
		gs4tavernModel[81].setRotationPoint(-49.45F, -5F, -5.5F);

		gs4tavernModel[82].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 153
		gs4tavernModel[82].setRotationPoint(-52F, -10F, -6F);

		gs4tavernModel[83].addShapeBox(0F, 0F, 0F, 1, 7, 8, 0F, 1.5F, -0.2F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 154
		gs4tavernModel[83].setRotationPoint(-50F, -10F, -5F);

		gs4tavernModel[84].addBox(0F, 0F, 0F, 1, 2, 7, 0F); // Box 155
		gs4tavernModel[84].setRotationPoint(-51F, -10.2F, -4F);

		gs4tavernModel[85].addShapeBox(0F, 0F, 0F, 1, 7, 4, 0F, 1.5F, -0.2F, 0F, -1.5F, 0F, 0F, 4F, 0F, 1.5F, -5F, -0.2F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, -5F, 0F, 1F); // Box 156
		gs4tavernModel[85].setRotationPoint(-50F, -10F, 3F);

		gs4tavernModel[86].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, -6F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, -6F, 0F, 1F); // Box 157
		gs4tavernModel[86].setRotationPoint(-51F, -10.2F, 3F);

		gs4tavernModel[87].addShapeBox(0F, 0F, 0F, 16, 2, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 158
		gs4tavernModel[87].setRotationPoint(-49F, -3F, 3F);

		gs4tavernModel[88].addShapeBox(0F, 0F, 0F, 8, 7, 1, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, -0.2F, 1.5F, 0F, -0.2F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 159
		gs4tavernModel[88].setRotationPoint(-45F, -10F, 7F);

		gs4tavernModel[89].addBox(0F, 0F, 0F, 8, 2, 1, 0F); // Box 160
		gs4tavernModel[89].setRotationPoint(-45F, -10.2F, 8F);

		gs4tavernModel[90].addShapeBox(0F, 0F, 0F, 4, 7, 1, 0F, 0F, 0F, -1.5F, 1.5F, 0F, 4F, 2.5F, -0.2F, -5F, 0F, -0.2F, 1.5F, 0F, 0F, 0F, 0F, 0F, 4F, 1F, 0F, -5F, 0F, 0F, 0F); // Box 161
		gs4tavernModel[90].setRotationPoint(-37F, -10F, 7F);

		gs4tavernModel[91].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 1F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 1F, 0F, -6F, 0F, 0F, 0F); // Box 162
		gs4tavernModel[91].setRotationPoint(-37F, -10.2F, 8F);

		gs4tavernModel[92].addShapeBox(0F, 0F, 0F, 1, 7, 8, 0F, -1.5F, 0F, 0F, 1.5F, -0.2F, 0F, 1.5F, -0.2F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 163
		gs4tavernModel[92].setRotationPoint(-33F, -10F, -5F);

		gs4tavernModel[93].addBox(0F, 0F, 0F, 1, 2, 7, 0F); // Box 164
		gs4tavernModel[93].setRotationPoint(-32F, -10.2F, -4F);

		gs4tavernModel[94].addBox(0F, 0F, 0F, 4, 2, 8, 0F); // Box 165
		gs4tavernModel[94].setRotationPoint(-37F, -3F, -5F);

		gs4tavernModel[95].addBox(0F, 0F, 0F, 4, 3, 1, 0F); // Box 166
		gs4tavernModel[95].setRotationPoint(-36.55F, -5F, -5.5F);

		gs4tavernModel[96].addBox(0F, 0F, 0F, 2, 1, 7, 0F); // Box 167
		gs4tavernModel[96].setRotationPoint(-36F, -1F, -4.5F);

		gs4tavernModel[97].addBox(0F, 0F, 0F, 7, 1, 2, 0F); // Box 168
		gs4tavernModel[97].setRotationPoint(-44.5F, -1F, 4F);

		gs4tavernModel[98].addBox(0F, 0F, 0F, 2, 5, 2, 0F); // Box 169
		gs4tavernModel[98].setRotationPoint(-42F, -5F, -2F);

		gs4tavernModel[99].addBox(0F, 0F, 0F, 6, 1, 6, 0F); // Box 170
		gs4tavernModel[99].setRotationPoint(-44F, -6F, -4F);

		gs4tavernModel[100].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 171
		gs4tavernModel[100].setRotationPoint(-34F, -1F, -5F);

		gs4tavernModel[101].addBox(0F, 0F, 0F, 4, 8, 1, 0F); // Box 172
		gs4tavernModel[101].setRotationPoint(-34F, -8F, -6F);

		gs4tavernModel[102].addBox(0F, 0F, 0F, 4, 8, 1, 0F); // Box 173
		gs4tavernModel[102].setRotationPoint(-52F, -8F, -6F);

		gs4tavernModel[103].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 174
		gs4tavernModel[103].setRotationPoint(-34F, -10F, -6F);

		gs4tavernModel[104].addBox(0F, 0F, 0F, 1, 10, 15, 0F); // Box 175
		gs4tavernModel[104].setRotationPoint(-31F, -10F, -5F);

		gs4tavernModel[105].addShapeBox(0F, 0F, 0F, 6, 1, 6, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 176
		gs4tavernModel[105].setRotationPoint(-37F, -10F, 3F);

		gs4tavernModel[106].addBox(0F, 0F, 0F, 20, 10, 1, 0F); // Box 177
		gs4tavernModel[106].setRotationPoint(-51F, -10F, 9F);

		gs4tavernModel[107].addShapeBox(0F, 0F, 0F, 6, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 178
		gs4tavernModel[107].setRotationPoint(-51F, -10F, 3F);

		gs4tavernModel[108].addBox(0F, 0F, 0F, 1, 10, 15, 0F); // Box 179
		gs4tavernModel[108].setRotationPoint(-52F, -10F, -5F);

		gs4tavernModel[109].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 180
		gs4tavernModel[109].setRotationPoint(-8.75F, -16.25F, 4F);

		gs4tavernModel[110].addBox(0F, 0F, 0F, 1, 1, 4, 0F); // Box 182
		gs4tavernModel[110].setRotationPoint(-9F, -16F, 5F);

		gs4tavernModel[111].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 183
		gs4tavernModel[111].setRotationPoint(-9.75F, -16.25F, 5F);

		gs4tavernModel[112].addBox(0F, 0F, 0F, 1, 1, 4, 0F); // Box 185
		gs4tavernModel[112].setRotationPoint(-10F, -16F, 6F);

		gs4tavernModel[113].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 186
		gs4tavernModel[113].setRotationPoint(-7.75F, -16.25F, 5F);

		gs4tavernModel[114].addBox(0F, 0F, 0F, 1, 1, 4, 0F); // Box 188
		gs4tavernModel[114].setRotationPoint(-8F, -16F, 6F);

		gs4tavernModel[115].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 189
		gs4tavernModel[115].setRotationPoint(-3.75F, -16.25F, 5F);

		gs4tavernModel[116].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 190
		gs4tavernModel[116].setRotationPoint(-4.75F, -16.25F, 4F);

		gs4tavernModel[117].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 191
		gs4tavernModel[117].setRotationPoint(-5.75F, -16.25F, 5F);

		gs4tavernModel[118].addBox(0F, 0F, 0F, 1, 1, 4, 0F); // Box 192
		gs4tavernModel[118].setRotationPoint(-5F, -16F, 5F);

		gs4tavernModel[119].addBox(0F, 0F, 0F, 1, 1, 4, 0F); // Box 193
		gs4tavernModel[119].setRotationPoint(-4F, -16F, 6F);

		gs4tavernModel[120].addBox(0F, 0F, 0F, 1, 1, 4, 0F); // Box 194
		gs4tavernModel[120].setRotationPoint(-5F, -17F, 6F);

		gs4tavernModel[121].addBox(0F, 0F, 0F, 1, 1, 4, 0F); // Box 195
		gs4tavernModel[121].setRotationPoint(-6F, -16F, 6F);

		gs4tavernModel[122].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 196
		gs4tavernModel[122].setRotationPoint(-4.75F, -17.25F, 5F);

		gs4tavernModel[123].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 197
		gs4tavernModel[123].setRotationPoint(0.25F, -16.25F, 5F);

		gs4tavernModel[124].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 198
		gs4tavernModel[124].setRotationPoint(-0.75F, -16.25F, 4F);

		gs4tavernModel[125].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 199
		gs4tavernModel[125].setRotationPoint(-1.75F, -16.25F, 5F);

		gs4tavernModel[126].addBox(0F, 0F, 0F, 1, 1, 4, 0F); // Box 200
		gs4tavernModel[126].setRotationPoint(-1F, -16F, 5F);

		gs4tavernModel[127].addBox(0F, 0F, 0F, 1, 1, 4, 0F); // Box 201
		gs4tavernModel[127].setRotationPoint(0F, -16F, 6F);

		gs4tavernModel[128].addBox(0F, 0F, 0F, 1, 1, 4, 0F); // Box 202
		gs4tavernModel[128].setRotationPoint(-1F, -17F, 6F);

		gs4tavernModel[129].addBox(0F, 0F, 0F, 1, 1, 4, 0F); // Box 203
		gs4tavernModel[129].setRotationPoint(-2F, -16F, 6F);

		gs4tavernModel[130].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 204
		gs4tavernModel[130].setRotationPoint(-0.75F, -17.25F, 5F);

		gs4tavernModel[131].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 205
		gs4tavernModel[131].setRotationPoint(4.25F, -16.25F, 5F);

		gs4tavernModel[132].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 206
		gs4tavernModel[132].setRotationPoint(3.25F, -16.25F, 4F);

		gs4tavernModel[133].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 207
		gs4tavernModel[133].setRotationPoint(2.25F, -16.25F, 5F);

		gs4tavernModel[134].addBox(0F, 0F, 0F, 1, 1, 4, 0F); // Box 208
		gs4tavernModel[134].setRotationPoint(3F, -16F, 5F);

		gs4tavernModel[135].addBox(0F, 0F, 0F, 1, 1, 4, 0F); // Box 209
		gs4tavernModel[135].setRotationPoint(4F, -16F, 6F);

		gs4tavernModel[136].addBox(0F, 0F, 0F, 1, 1, 4, 0F); // Box 210
		gs4tavernModel[136].setRotationPoint(3F, -17F, 6F);

		gs4tavernModel[137].addBox(0F, 0F, 0F, 1, 1, 4, 0F); // Box 211
		gs4tavernModel[137].setRotationPoint(2F, -16F, 6F);

		gs4tavernModel[138].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 212
		gs4tavernModel[138].setRotationPoint(3.25F, -17.25F, 5F);

		gs4tavernModel[139].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 213
		gs4tavernModel[139].setRotationPoint(8.25F, -16.25F, 5F);

		gs4tavernModel[140].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 214
		gs4tavernModel[140].setRotationPoint(7.25F, -16.25F, 4F);

		gs4tavernModel[141].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 215
		gs4tavernModel[141].setRotationPoint(6.25F, -16.25F, 5F);

		gs4tavernModel[142].addBox(0F, 0F, 0F, 1, 1, 4, 0F); // Box 216
		gs4tavernModel[142].setRotationPoint(7F, -16F, 5F);

		gs4tavernModel[143].addBox(0F, 0F, 0F, 1, 1, 4, 0F); // Box 217
		gs4tavernModel[143].setRotationPoint(8F, -16F, 6F);

		gs4tavernModel[144].addBox(0F, 0F, 0F, 1, 1, 4, 0F); // Box 218
		gs4tavernModel[144].setRotationPoint(7F, -17F, 6F);

		gs4tavernModel[145].addBox(0F, 0F, 0F, 1, 1, 4, 0F); // Box 219
		gs4tavernModel[145].setRotationPoint(6F, -16F, 6F);

		gs4tavernModel[146].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 220
		gs4tavernModel[146].setRotationPoint(7.25F, -17.25F, 5F);


	}
	ModelGs4Bogie bogie1 = new ModelGs4Bogie();
	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		for(int i = 0; i < 147; i++)
		{
			gs4tavernModel[i].render(f5);
		}
		if(entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor()==2){
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/gs4_bogie_Red.png"));
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

	public ModelRendererTurbo gs4tavernModel[];
}