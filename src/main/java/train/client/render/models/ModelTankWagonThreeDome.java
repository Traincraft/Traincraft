//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2018 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator:
// Created on:24.10.2017 - 17:50:09
// Last changed on: 24.10.2017 - 17:50:09

package train.client.render.models;

import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import tmt.ModelBase;
import tmt.ModelRendererTurbo;
import tmt.Tessellator;
import train.common.library.Info;

public class ModelTankWagonThreeDome extends ModelBase
{
	int textureX = 512;
	int textureY = 512;

	public ModelTankWagonThreeDome()
	{
		tankwagonthreedomeModel = new ModelRendererTurbo[131];
		tankwagonthreedomeModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 6
		tankwagonthreedomeModel[1] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 8
		tankwagonthreedomeModel[2] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 9
		tankwagonthreedomeModel[3] = new ModelRendererTurbo(this, 345, 17, textureX, textureY); // Box 12
		tankwagonthreedomeModel[4] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 81
		tankwagonthreedomeModel[5] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 82
		tankwagonthreedomeModel[6] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 83
		tankwagonthreedomeModel[7] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 84
		tankwagonthreedomeModel[8] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 85
		tankwagonthreedomeModel[9] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 110
		tankwagonthreedomeModel[10] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 111
		tankwagonthreedomeModel[11] = new ModelRendererTurbo(this, 153, 9, textureX, textureY); // Box 112
		tankwagonthreedomeModel[12] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 113
		tankwagonthreedomeModel[13] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 138
		tankwagonthreedomeModel[14] = new ModelRendererTurbo(this, 177, 9, textureX, textureY); // Box 139
		tankwagonthreedomeModel[15] = new ModelRendererTurbo(this, 473, 9, textureX, textureY); // Box 140
		tankwagonthreedomeModel[16] = new ModelRendererTurbo(this, 481, 9, textureX, textureY); // Box 141
		tankwagonthreedomeModel[17] = new ModelRendererTurbo(this, 489, 9, textureX, textureY); // Box 142
		tankwagonthreedomeModel[18] = new ModelRendererTurbo(this, 497, 9, textureX, textureY); // Box 143
		tankwagonthreedomeModel[19] = new ModelRendererTurbo(this, 481, 17, textureX, textureY); // Box 144
		tankwagonthreedomeModel[20] = new ModelRendererTurbo(this, 489, 17, textureX, textureY); // Box 145
		tankwagonthreedomeModel[21] = new ModelRendererTurbo(this, 497, 17, textureX, textureY); // Box 146
		tankwagonthreedomeModel[22] = new ModelRendererTurbo(this, 505, 17, textureX, textureY); // Box 147
		tankwagonthreedomeModel[23] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 148
		tankwagonthreedomeModel[24] = new ModelRendererTurbo(this, 9, 25, textureX, textureY); // Box 149
		tankwagonthreedomeModel[25] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 150
		tankwagonthreedomeModel[26] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 151
		tankwagonthreedomeModel[27] = new ModelRendererTurbo(this, 49, 25, textureX, textureY); // Box 152
		tankwagonthreedomeModel[28] = new ModelRendererTurbo(this, 57, 25, textureX, textureY); // Box 153
		tankwagonthreedomeModel[29] = new ModelRendererTurbo(this, 65, 25, textureX, textureY); // Box 154
		tankwagonthreedomeModel[30] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 155
		tankwagonthreedomeModel[31] = new ModelRendererTurbo(this, 81, 25, textureX, textureY); // Box 156
		tankwagonthreedomeModel[32] = new ModelRendererTurbo(this, 97, 25, textureX, textureY); // Box 157
		tankwagonthreedomeModel[33] = new ModelRendererTurbo(this, 113, 25, textureX, textureY); // Box 158
		tankwagonthreedomeModel[34] = new ModelRendererTurbo(this, 121, 25, textureX, textureY); // Box 159
		tankwagonthreedomeModel[35] = new ModelRendererTurbo(this, 129, 25, textureX, textureY); // Box 160
		tankwagonthreedomeModel[36] = new ModelRendererTurbo(this, 137, 25, textureX, textureY); // Box 161
		tankwagonthreedomeModel[37] = new ModelRendererTurbo(this, 345, 25, textureX, textureY); // Box 162
		tankwagonthreedomeModel[38] = new ModelRendererTurbo(this, 145, 25, textureX, textureY); // Box 163
		tankwagonthreedomeModel[39] = new ModelRendererTurbo(this, 369, 25, textureX, textureY); // Box 166
		tankwagonthreedomeModel[40] = new ModelRendererTurbo(this, 393, 25, textureX, textureY); // Box 167
		tankwagonthreedomeModel[41] = new ModelRendererTurbo(this, 369, 33, textureX, textureY); // Box 138
		tankwagonthreedomeModel[42] = new ModelRendererTurbo(this, 385, 33, textureX, textureY); // Box 139
		tankwagonthreedomeModel[43] = new ModelRendererTurbo(this, 449, 33, textureX, textureY); // Box 140
		tankwagonthreedomeModel[44] = new ModelRendererTurbo(this, 489, 33, textureX, textureY); // Box 141
		tankwagonthreedomeModel[45] = new ModelRendererTurbo(this, 497, 33, textureX, textureY); // Box 142
		tankwagonthreedomeModel[46] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 143
		tankwagonthreedomeModel[47] = new ModelRendererTurbo(this, 505, 33, textureX, textureY); // Box 144
		tankwagonthreedomeModel[48] = new ModelRendererTurbo(this, 17, 41, textureX, textureY); // Box 145
		tankwagonthreedomeModel[49] = new ModelRendererTurbo(this, 185, 41, textureX, textureY); // Box 146
		tankwagonthreedomeModel[50] = new ModelRendererTurbo(this, 193, 41, textureX, textureY); // Box 147
		tankwagonthreedomeModel[51] = new ModelRendererTurbo(this, 201, 41, textureX, textureY); // Box 148
		tankwagonthreedomeModel[52] = new ModelRendererTurbo(this, 209, 41, textureX, textureY); // Box 149
		tankwagonthreedomeModel[53] = new ModelRendererTurbo(this, 225, 41, textureX, textureY); // Box 150
		tankwagonthreedomeModel[54] = new ModelRendererTurbo(this, 233, 41, textureX, textureY); // Box 151
		tankwagonthreedomeModel[55] = new ModelRendererTurbo(this, 249, 41, textureX, textureY); // Box 152
		tankwagonthreedomeModel[56] = new ModelRendererTurbo(this, 257, 41, textureX, textureY); // Box 153
		tankwagonthreedomeModel[57] = new ModelRendererTurbo(this, 265, 41, textureX, textureY); // Box 154
		tankwagonthreedomeModel[58] = new ModelRendererTurbo(this, 273, 41, textureX, textureY); // Box 155
		tankwagonthreedomeModel[59] = new ModelRendererTurbo(this, 281, 41, textureX, textureY); // Box 156
		tankwagonthreedomeModel[60] = new ModelRendererTurbo(this, 297, 41, textureX, textureY); // Box 157
		tankwagonthreedomeModel[61] = new ModelRendererTurbo(this, 313, 41, textureX, textureY); // Box 158
		tankwagonthreedomeModel[62] = new ModelRendererTurbo(this, 321, 41, textureX, textureY); // Box 159
		tankwagonthreedomeModel[63] = new ModelRendererTurbo(this, 329, 41, textureX, textureY); // Box 160
		tankwagonthreedomeModel[64] = new ModelRendererTurbo(this, 337, 41, textureX, textureY); // Box 161
		tankwagonthreedomeModel[65] = new ModelRendererTurbo(this, 345, 41, textureX, textureY); // Box 138
		tankwagonthreedomeModel[66] = new ModelRendererTurbo(this, 361, 41, textureX, textureY); // Box 139
		tankwagonthreedomeModel[67] = new ModelRendererTurbo(this, 369, 41, textureX, textureY); // Box 140
		tankwagonthreedomeModel[68] = new ModelRendererTurbo(this, 377, 41, textureX, textureY); // Box 141
		tankwagonthreedomeModel[69] = new ModelRendererTurbo(this, 385, 41, textureX, textureY); // Box 142
		tankwagonthreedomeModel[70] = new ModelRendererTurbo(this, 393, 41, textureX, textureY); // Box 143
		tankwagonthreedomeModel[71] = new ModelRendererTurbo(this, 409, 41, textureX, textureY); // Box 144
		tankwagonthreedomeModel[72] = new ModelRendererTurbo(this, 417, 41, textureX, textureY); // Box 145
		tankwagonthreedomeModel[73] = new ModelRendererTurbo(this, 425, 41, textureX, textureY); // Box 146
		tankwagonthreedomeModel[74] = new ModelRendererTurbo(this, 433, 41, textureX, textureY); // Box 147
		tankwagonthreedomeModel[75] = new ModelRendererTurbo(this, 441, 41, textureX, textureY); // Box 148
		tankwagonthreedomeModel[76] = new ModelRendererTurbo(this, 449, 41, textureX, textureY); // Box 149
		tankwagonthreedomeModel[77] = new ModelRendererTurbo(this, 465, 41, textureX, textureY); // Box 150
		tankwagonthreedomeModel[78] = new ModelRendererTurbo(this, 473, 41, textureX, textureY); // Box 151
		tankwagonthreedomeModel[79] = new ModelRendererTurbo(this, 489, 41, textureX, textureY); // Box 152
		tankwagonthreedomeModel[80] = new ModelRendererTurbo(this, 497, 41, textureX, textureY); // Box 153
		tankwagonthreedomeModel[81] = new ModelRendererTurbo(this, 505, 41, textureX, textureY); // Box 154
		tankwagonthreedomeModel[82] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 155
		tankwagonthreedomeModel[83] = new ModelRendererTurbo(this, 9, 49, textureX, textureY); // Box 156
		tankwagonthreedomeModel[84] = new ModelRendererTurbo(this, 185, 49, textureX, textureY); // Box 157
		tankwagonthreedomeModel[85] = new ModelRendererTurbo(this, 201, 49, textureX, textureY); // Box 158
		tankwagonthreedomeModel[86] = new ModelRendererTurbo(this, 209, 49, textureX, textureY); // Box 159
		tankwagonthreedomeModel[87] = new ModelRendererTurbo(this, 217, 49, textureX, textureY); // Box 160
		tankwagonthreedomeModel[88] = new ModelRendererTurbo(this, 225, 49, textureX, textureY); // Box 161
		tankwagonthreedomeModel[89] = new ModelRendererTurbo(this, 73, 57, textureX, textureY); // Box 268
		tankwagonthreedomeModel[90] = new ModelRendererTurbo(this, 89, 57, textureX, textureY); // Box 268
		tankwagonthreedomeModel[91] = new ModelRendererTurbo(this, 97, 57, textureX, textureY); // Box 304
		tankwagonthreedomeModel[92] = new ModelRendererTurbo(this, 209, 57, textureX, textureY); // Box 153
		tankwagonthreedomeModel[93] = new ModelRendererTurbo(this, 361, 57, textureX, textureY); // Box 154
		tankwagonthreedomeModel[94] = new ModelRendererTurbo(this, 377, 73, textureX, textureY); // Box 155
		tankwagonthreedomeModel[95] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 175
		tankwagonthreedomeModel[96] = new ModelRendererTurbo(this, 129, 81, textureX, textureY); // Box 176
		tankwagonthreedomeModel[97] = new ModelRendererTurbo(this, 201, 57, textureX, textureY); // Box 177
		tankwagonthreedomeModel[98] = new ModelRendererTurbo(this, 209, 57, textureX, textureY); // Box 178
		tankwagonthreedomeModel[99] = new ModelRendererTurbo(this, 361, 57, textureX, textureY); // Box 179
		tankwagonthreedomeModel[100] = new ModelRendererTurbo(this, 505, 57, textureX, textureY); // Box 180
		tankwagonthreedomeModel[101] = new ModelRendererTurbo(this, 241, 81, textureX, textureY); // Box 171
		tankwagonthreedomeModel[102] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 6
		tankwagonthreedomeModel[103] = new ModelRendererTurbo(this, 25, 65, textureX, textureY); // Box 9
		tankwagonthreedomeModel[104] = new ModelRendererTurbo(this, 33, 65, textureX, textureY); // Box 6
		tankwagonthreedomeModel[105] = new ModelRendererTurbo(this, 57, 65, textureX, textureY); // Box 9
		tankwagonthreedomeModel[106] = new ModelRendererTurbo(this, 209, 57, textureX, textureY); // Box 9
		tankwagonthreedomeModel[107] = new ModelRendererTurbo(this, 73, 65, textureX, textureY); // Box 9
		tankwagonthreedomeModel[108] = new ModelRendererTurbo(this, 265, 81, textureX, textureY); // Box 186
		tankwagonthreedomeModel[109] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 187
		tankwagonthreedomeModel[110] = new ModelRendererTurbo(this, 81, 65, textureX, textureY); // Box 188
		tankwagonthreedomeModel[111] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 189
		tankwagonthreedomeModel[112] = new ModelRendererTurbo(this, 65, 73, textureX, textureY); // Box 190
		tankwagonthreedomeModel[113] = new ModelRendererTurbo(this, 81, 73, textureX, textureY); // Box 188
		tankwagonthreedomeModel[114] = new ModelRendererTurbo(this, 257, 33, textureX, textureY); // Box 189
		tankwagonthreedomeModel[115] = new ModelRendererTurbo(this, 281, 81, textureX, textureY); // Box 190
		tankwagonthreedomeModel[116] = new ModelRendererTurbo(this, 281, 81, textureX, textureY); // Box 171
		tankwagonthreedomeModel[117] = new ModelRendererTurbo(this, 305, 81, textureX, textureY); // Box 6
		tankwagonthreedomeModel[118] = new ModelRendererTurbo(this, 329, 81, textureX, textureY); // Box 9
		tankwagonthreedomeModel[119] = new ModelRendererTurbo(this, 337, 81, textureX, textureY); // Box 6
		tankwagonthreedomeModel[120] = new ModelRendererTurbo(this, 361, 81, textureX, textureY); // Box 9
		tankwagonthreedomeModel[121] = new ModelRendererTurbo(this, 97, 65, textureX, textureY); // Box 9
		tankwagonthreedomeModel[122] = new ModelRendererTurbo(this, 377, 81, textureX, textureY); // Box 9
		tankwagonthreedomeModel[123] = new ModelRendererTurbo(this, 385, 81, textureX, textureY); // Box 186
		tankwagonthreedomeModel[124] = new ModelRendererTurbo(this, 217, 65, textureX, textureY); // Box 187
		tankwagonthreedomeModel[125] = new ModelRendererTurbo(this, 401, 81, textureX, textureY); // Box 188
		tankwagonthreedomeModel[126] = new ModelRendererTurbo(this, 273, 33, textureX, textureY); // Box 189
		tankwagonthreedomeModel[127] = new ModelRendererTurbo(this, 417, 81, textureX, textureY); // Box 190
		tankwagonthreedomeModel[128] = new ModelRendererTurbo(this, 433, 81, textureX, textureY); // Box 188
		tankwagonthreedomeModel[129] = new ModelRendererTurbo(this, 289, 33, textureX, textureY); // Box 189
		tankwagonthreedomeModel[130] = new ModelRendererTurbo(this, 449, 81, textureX, textureY); // Box 190

		tankwagonthreedomeModel[0].addShapeBox(0F, 0F, 0F, 65, 4, 16, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 6
		tankwagonthreedomeModel[0].setRotationPoint(-32F, -15F, -8F);

		tankwagonthreedomeModel[1].addBox(0F, 0F, 0F, 65, 4, 20, 0F); // Box 8
		tankwagonthreedomeModel[1].setRotationPoint(-32F, -11F, -10F);

		tankwagonthreedomeModel[2].addShapeBox(0F, 0F, 0F, 65, 2, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F); // Box 9
		tankwagonthreedomeModel[2].setRotationPoint(-32F, -17F, -5F);

		tankwagonthreedomeModel[3].addShapeBox(0F, 0F, 0F, 65, 4, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 4F, 0F, -3F, 4F, 0F, -3F, 4F, 0F, -3F, 4F); // Box 12
		tankwagonthreedomeModel[3].setRotationPoint(-32F, -18F, -1F);

		tankwagonthreedomeModel[4].addBox(0F, 0F, 0F, 80, 1, 22, 0F); // Box 81
		tankwagonthreedomeModel[4].setRotationPoint(-40F, 1F, -11F);

		tankwagonthreedomeModel[5].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2.3F, -2F, 0F, 2.3F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 82
		tankwagonthreedomeModel[5].setRotationPoint(-27F, 0F, -9F);

		tankwagonthreedomeModel[6].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 83
		tankwagonthreedomeModel[6].setRotationPoint(-27F, 0F, -10F);

		tankwagonthreedomeModel[7].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 84
		tankwagonthreedomeModel[7].setRotationPoint(24F, 0F, -10F);

		tankwagonthreedomeModel[8].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2.3F, -2F, 0F, 2.3F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 85
		tankwagonthreedomeModel[8].setRotationPoint(24F, 0F, -9F);

		tankwagonthreedomeModel[9].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 110
		tankwagonthreedomeModel[9].setRotationPoint(-27F, 0F, 9F);

		tankwagonthreedomeModel[10].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F, 0F, 2.3F, -2F, 0F, 2.3F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 111
		tankwagonthreedomeModel[10].setRotationPoint(-27F, 0F, 5F);

		tankwagonthreedomeModel[11].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F, 0F, 2.3F, -2F, 0F, 2.3F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 112
		tankwagonthreedomeModel[11].setRotationPoint(24F, 0F, 5F);

		tankwagonthreedomeModel[12].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 113
		tankwagonthreedomeModel[12].setRotationPoint(24F, 0F, 9F);

		tankwagonthreedomeModel[13].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 138
		tankwagonthreedomeModel[13].setRotationPoint(22F, -21F, -3F);

		tankwagonthreedomeModel[14].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 139
		tankwagonthreedomeModel[14].setRotationPoint(25F, -21F, -3F);

		tankwagonthreedomeModel[15].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 140
		tankwagonthreedomeModel[15].setRotationPoint(26F, -21F, -3F);

		tankwagonthreedomeModel[16].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 141
		tankwagonthreedomeModel[16].setRotationPoint(26F, -22F, -2F);

		tankwagonthreedomeModel[17].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 142
		tankwagonthreedomeModel[17].setRotationPoint(25F, -22F, -2F);

		tankwagonthreedomeModel[18].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 143
		tankwagonthreedomeModel[18].setRotationPoint(22F, -22F, -2F);

		tankwagonthreedomeModel[19].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 144
		tankwagonthreedomeModel[19].setRotationPoint(21F, -22F, -2F);

		tankwagonthreedomeModel[20].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 145
		tankwagonthreedomeModel[20].setRotationPoint(20F, -22F, -2F);

		tankwagonthreedomeModel[21].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 146
		tankwagonthreedomeModel[21].setRotationPoint(20F, -21F, -3F);

		tankwagonthreedomeModel[22].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 147
		tankwagonthreedomeModel[22].setRotationPoint(21F, -21F, -3F);

		tankwagonthreedomeModel[23].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 148
		tankwagonthreedomeModel[23].setRotationPoint(20F, -21F, -1F);

		tankwagonthreedomeModel[24].addBox(0F, 0F, 0F, 5, 4, 1, 0F); // Box 149
		tankwagonthreedomeModel[24].setRotationPoint(21F, -22F, -1F);

		tankwagonthreedomeModel[25].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 150
		tankwagonthreedomeModel[25].setRotationPoint(26F, -21F, -1F);

		tankwagonthreedomeModel[26].addBox(0F, 0F, 0F, 5, 4, 1, 0F); // Box 151
		tankwagonthreedomeModel[26].setRotationPoint(21F, -22F, 0F);

		tankwagonthreedomeModel[27].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 152
		tankwagonthreedomeModel[27].setRotationPoint(26F, -21F, 2F);

		tankwagonthreedomeModel[28].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 153
		tankwagonthreedomeModel[28].setRotationPoint(25F, -21F, 2F);

		tankwagonthreedomeModel[29].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 154
		tankwagonthreedomeModel[29].setRotationPoint(25F, -22F, 1F);

		tankwagonthreedomeModel[30].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 155
		tankwagonthreedomeModel[30].setRotationPoint(26F, -22F, 1F);

		tankwagonthreedomeModel[31].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 156
		tankwagonthreedomeModel[31].setRotationPoint(22F, -21F, 2F);

		tankwagonthreedomeModel[32].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 157
		tankwagonthreedomeModel[32].setRotationPoint(22F, -22F, 1F);

		tankwagonthreedomeModel[33].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 158
		tankwagonthreedomeModel[33].setRotationPoint(21F, -22F, 1F);

		tankwagonthreedomeModel[34].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 159
		tankwagonthreedomeModel[34].setRotationPoint(20F, -22F, 1F);

		tankwagonthreedomeModel[35].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 160
		tankwagonthreedomeModel[35].setRotationPoint(20F, -21F, 2F);

		tankwagonthreedomeModel[36].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 161
		tankwagonthreedomeModel[36].setRotationPoint(21F, -21F, 2F);

		tankwagonthreedomeModel[37].addBox(0F, 0F, 0F, 8, 12, 0, 0F); // Box 162
		tankwagonthreedomeModel[37].setRotationPoint(-4F, -11F, -10.05F);

		tankwagonthreedomeModel[38].addShapeBox(0F, 0F, 0F, 8, 4, 0, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 163
		tankwagonthreedomeModel[38].setRotationPoint(-4F, -15F, -10.05F);

		tankwagonthreedomeModel[39].addShapeBox(0F, 0F, 0F, 8, 4, 0, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 166
		tankwagonthreedomeModel[39].setRotationPoint(-4F, -15F, 10.05F);

		tankwagonthreedomeModel[40].addBox(0F, 0F, 0F, 8, 12, 0, 0F); // Box 167
		tankwagonthreedomeModel[40].setRotationPoint(-4F, -11F, 10.05F);

		tankwagonthreedomeModel[41].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 138
		tankwagonthreedomeModel[41].setRotationPoint(-25F, -21F, -3F);

		tankwagonthreedomeModel[42].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 139
		tankwagonthreedomeModel[42].setRotationPoint(-22F, -21F, -3F);

		tankwagonthreedomeModel[43].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 140
		tankwagonthreedomeModel[43].setRotationPoint(-21F, -21F, -3F);

		tankwagonthreedomeModel[44].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 141
		tankwagonthreedomeModel[44].setRotationPoint(-21F, -22F, -2F);

		tankwagonthreedomeModel[45].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 142
		tankwagonthreedomeModel[45].setRotationPoint(-22F, -22F, -2F);

		tankwagonthreedomeModel[46].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 143
		tankwagonthreedomeModel[46].setRotationPoint(-25F, -22F, -2F);

		tankwagonthreedomeModel[47].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 144
		tankwagonthreedomeModel[47].setRotationPoint(-26F, -22F, -2F);

		tankwagonthreedomeModel[48].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 145
		tankwagonthreedomeModel[48].setRotationPoint(-27F, -22F, -2F);

		tankwagonthreedomeModel[49].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 146
		tankwagonthreedomeModel[49].setRotationPoint(-27F, -21F, -3F);

		tankwagonthreedomeModel[50].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 147
		tankwagonthreedomeModel[50].setRotationPoint(-26F, -21F, -3F);

		tankwagonthreedomeModel[51].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 148
		tankwagonthreedomeModel[51].setRotationPoint(-27F, -21F, -1F);

		tankwagonthreedomeModel[52].addBox(0F, 0F, 0F, 5, 4, 1, 0F); // Box 149
		tankwagonthreedomeModel[52].setRotationPoint(-26F, -22F, -1F);

		tankwagonthreedomeModel[53].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 150
		tankwagonthreedomeModel[53].setRotationPoint(-21F, -21F, -1F);

		tankwagonthreedomeModel[54].addBox(0F, 0F, 0F, 5, 4, 1, 0F); // Box 151
		tankwagonthreedomeModel[54].setRotationPoint(-26F, -22F, 0F);

		tankwagonthreedomeModel[55].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 152
		tankwagonthreedomeModel[55].setRotationPoint(-21F, -21F, 2F);

		tankwagonthreedomeModel[56].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 153
		tankwagonthreedomeModel[56].setRotationPoint(-22F, -21F, 2F);

		tankwagonthreedomeModel[57].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 154
		tankwagonthreedomeModel[57].setRotationPoint(-22F, -22F, 1F);

		tankwagonthreedomeModel[58].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 155
		tankwagonthreedomeModel[58].setRotationPoint(-21F, -22F, 1F);

		tankwagonthreedomeModel[59].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 156
		tankwagonthreedomeModel[59].setRotationPoint(-25F, -21F, 2F);

		tankwagonthreedomeModel[60].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 157
		tankwagonthreedomeModel[60].setRotationPoint(-25F, -22F, 1F);

		tankwagonthreedomeModel[61].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 158
		tankwagonthreedomeModel[61].setRotationPoint(-26F, -22F, 1F);

		tankwagonthreedomeModel[62].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 159
		tankwagonthreedomeModel[62].setRotationPoint(-27F, -22F, 1F);

		tankwagonthreedomeModel[63].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 160
		tankwagonthreedomeModel[63].setRotationPoint(-27F, -21F, 2F);

		tankwagonthreedomeModel[64].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 161
		tankwagonthreedomeModel[64].setRotationPoint(-26F, -21F, 2F);

		tankwagonthreedomeModel[65].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 138
		tankwagonthreedomeModel[65].setRotationPoint(-2F, -21F, -3F);

		tankwagonthreedomeModel[66].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 139
		tankwagonthreedomeModel[66].setRotationPoint(2F, -21F, -3F);

		tankwagonthreedomeModel[67].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 140
		tankwagonthreedomeModel[67].setRotationPoint(3F, -21F, -3F);

		tankwagonthreedomeModel[68].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 141
		tankwagonthreedomeModel[68].setRotationPoint(3F, -22F, -2F);

		tankwagonthreedomeModel[69].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 142
		tankwagonthreedomeModel[69].setRotationPoint(2F, -22F, -2F);

		tankwagonthreedomeModel[70].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 143
		tankwagonthreedomeModel[70].setRotationPoint(-2F, -22F, -2F);

		tankwagonthreedomeModel[71].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 144
		tankwagonthreedomeModel[71].setRotationPoint(-3F, -22F, -2F);

		tankwagonthreedomeModel[72].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 145
		tankwagonthreedomeModel[72].setRotationPoint(-4F, -22F, -2F);

		tankwagonthreedomeModel[73].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 146
		tankwagonthreedomeModel[73].setRotationPoint(-4F, -21F, -3F);

		tankwagonthreedomeModel[74].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 147
		tankwagonthreedomeModel[74].setRotationPoint(-3F, -21F, -3F);

		tankwagonthreedomeModel[75].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 148
		tankwagonthreedomeModel[75].setRotationPoint(-4F, -21F, -1F);

		tankwagonthreedomeModel[76].addBox(0F, 0F, 0F, 6, 4, 1, 0F); // Box 149
		tankwagonthreedomeModel[76].setRotationPoint(-3F, -22F, -1F);

		tankwagonthreedomeModel[77].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 150
		tankwagonthreedomeModel[77].setRotationPoint(3F, -21F, -1F);

		tankwagonthreedomeModel[78].addBox(0F, 0F, 0F, 6, 4, 1, 0F); // Box 151
		tankwagonthreedomeModel[78].setRotationPoint(-3F, -22F, 0F);

		tankwagonthreedomeModel[79].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 152
		tankwagonthreedomeModel[79].setRotationPoint(3F, -21F, 2F);

		tankwagonthreedomeModel[80].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 153
		tankwagonthreedomeModel[80].setRotationPoint(2F, -21F, 2F);

		tankwagonthreedomeModel[81].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 154
		tankwagonthreedomeModel[81].setRotationPoint(2F, -22F, 1F);

		tankwagonthreedomeModel[82].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 155
		tankwagonthreedomeModel[82].setRotationPoint(3F, -22F, 1F);

		tankwagonthreedomeModel[83].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 156
		tankwagonthreedomeModel[83].setRotationPoint(-2F, -21F, 2F);

		tankwagonthreedomeModel[84].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 157
		tankwagonthreedomeModel[84].setRotationPoint(-2F, -22F, 1F);

		tankwagonthreedomeModel[85].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 158
		tankwagonthreedomeModel[85].setRotationPoint(-3F, -22F, 1F);

		tankwagonthreedomeModel[86].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 159
		tankwagonthreedomeModel[86].setRotationPoint(-4F, -22F, 1F);

		tankwagonthreedomeModel[87].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 160
		tankwagonthreedomeModel[87].setRotationPoint(-4F, -21F, 2F);

		tankwagonthreedomeModel[88].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 161
		tankwagonthreedomeModel[88].setRotationPoint(-3F, -21F, 2F);

		tankwagonthreedomeModel[89].addBox(0F, 0F, 0F, 4, 2, 2, 0F); // Box 268
		tankwagonthreedomeModel[89].setRotationPoint(-44F, 0.5F, -1F);

		tankwagonthreedomeModel[90].addBox(0F, 0F, 0F, 4, 2, 2, 0F); // Box 268
		tankwagonthreedomeModel[90].setRotationPoint(40F, 0.5F, -1F);

		tankwagonthreedomeModel[91].addShapeBox(0F, 0F, 0F, 42, 6, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F); // Box 304
		tankwagonthreedomeModel[91].setRotationPoint(-20F, 2F, -6F);

		tankwagonthreedomeModel[92].addShapeBox(0F, 0F, 0F, 65, 4, 16, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 153
		tankwagonthreedomeModel[92].setRotationPoint(-32F, -7F, -8F);

		tankwagonthreedomeModel[93].addShapeBox(0F, 0F, 0F, 65, 2, 10, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 154
		tankwagonthreedomeModel[93].setRotationPoint(-32F, -3F, -5F);

		tankwagonthreedomeModel[94].addShapeBox(0F, 0F, 0F, 65, 4, 2, 0F, 0F, -3F, 4F, 0F, -3F, 4F, 0F, -3F, 4F, 0F, -3F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 155
		tankwagonthreedomeModel[94].setRotationPoint(-32F, -4F, -1F);

		tankwagonthreedomeModel[95].addShapeBox(0F, 0F, 0F, 60, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.65F, 0F, 0F, -0.65F, 0F); // Box 175
		tankwagonthreedomeModel[95].setRotationPoint(-30F, -16F, -8F);

		tankwagonthreedomeModel[96].addShapeBox(0F, 0F, 0F, 60, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.65F, 0F, 0F, -0.65F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 176
		tankwagonthreedomeModel[96].setRotationPoint(-30F, -16F, 7F);

		tankwagonthreedomeModel[97].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 177
		tankwagonthreedomeModel[97].setRotationPoint(39F, -10F, -1F);

		tankwagonthreedomeModel[98].addBox(0F, 0F, 0F, 0, 4, 4, 0F); // Box 178
		tankwagonthreedomeModel[98].setRotationPoint(40.01F, -11F, -2F);

		tankwagonthreedomeModel[99].addBox(0F, 0F, 0F, 0, 4, 4, 0F); // Box 179
		tankwagonthreedomeModel[99].setRotationPoint(-39.01F, -11F, -2F);

		tankwagonthreedomeModel[100].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 180
		tankwagonthreedomeModel[100].setRotationPoint(-39F, -10F, -1F);

		tankwagonthreedomeModel[101].addShapeBox(0F, -2F, 0F, 3, 4, 14, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F); // Box 171
		tankwagonthreedomeModel[101].setRotationPoint(-35F, -9F, -7F);

		tankwagonthreedomeModel[102].addShapeBox(0F, 0F, 0F, 3, 3, 10, 0F, 0F, 0F, 2F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 1F, 3F, 0F, 1F, 3F, 0F, 0F, 0F); // Box 6
		tankwagonthreedomeModel[102].setRotationPoint(-35F, -7F, -5F);

		tankwagonthreedomeModel[103].addShapeBox(0F, 0F, 0F, 3, 2, 4, 0F, 0F, 0F, 3F, 0F, -1F, 6F, 0F, -1F, 6F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 1F, 3F, 0F, 1F, 3F, 0F, 0F, 0F); // Box 9
		tankwagonthreedomeModel[103].setRotationPoint(-35F, -4F, -2F);

		tankwagonthreedomeModel[104].addShapeBox(0F, 0F, 0F, 3, 3, 10, 0F, 0F, 0F, 0F, 0F, 1F, 3F, 0F, 1F, 3F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 2F); // Box 6
		tankwagonthreedomeModel[104].setRotationPoint(-35F, -14F, -5F);

		tankwagonthreedomeModel[105].addShapeBox(0F, 0F, 0F, 3, 2, 4, 0F, 0F, 0F, 0F, 0F, 1F, 3F, 0F, 1F, 3F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, -1F, 6F, 0F, -1F, 6F, 0F, 0F, 3F); // Box 9
		tankwagonthreedomeModel[105].setRotationPoint(-35F, -16F, -2F);

		tankwagonthreedomeModel[106].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 1F, 1F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 1F, 1F); // Box 9
		tankwagonthreedomeModel[106].setRotationPoint(-35F, -18F, -1F);

		tankwagonthreedomeModel[107].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F, 0F, 1F, 1F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 1F, 1F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 9
		tankwagonthreedomeModel[107].setRotationPoint(-35F, -1F, -1F);

		tankwagonthreedomeModel[108].addShapeBox(0F, -2F, 0F, 2, 4, 8, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F); // Box 186
		tankwagonthreedomeModel[108].setRotationPoint(-37F, -9F, -4F);

		tankwagonthreedomeModel[109].addShapeBox(0F, -2F, 0F, 1, 4, 2, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F); // Box 187
		tankwagonthreedomeModel[109].setRotationPoint(-38F, -9F, -1F);

		tankwagonthreedomeModel[110].addShapeBox(0F, 0F, 0F, 2, 3, 4, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 2F); // Box 188
		tankwagonthreedomeModel[110].setRotationPoint(-37F, -14F, -2F);

		tankwagonthreedomeModel[111].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -1F); // Box 189
		tankwagonthreedomeModel[111].setRotationPoint(-38F, -14F, -2F);

		tankwagonthreedomeModel[112].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F); // Box 190
		tankwagonthreedomeModel[112].setRotationPoint(-37F, -16F, -2F);

		tankwagonthreedomeModel[113].addShapeBox(0F, 0F, 0F, 2, 3, 4, 0F, 0F, 0F, 2F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F); // Box 188
		tankwagonthreedomeModel[113].setRotationPoint(-37F, -7F, -2F);

		tankwagonthreedomeModel[114].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F, 0F, 0F, -1F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 189
		tankwagonthreedomeModel[114].setRotationPoint(-38F, -7F, -2F);

		tankwagonthreedomeModel[115].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 190
		tankwagonthreedomeModel[115].setRotationPoint(-37F, -4F, -2F);

		tankwagonthreedomeModel[116].addShapeBox(0F, -2F, 0F, 3, 4, 14, 0F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F); // Box 171
		tankwagonthreedomeModel[116].setRotationPoint(33F, -9F, -7F);

		tankwagonthreedomeModel[117].addShapeBox(0F, 0F, 0F, 3, 3, 10, 0F, 0F, 0F, 5F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 5F, 0F, 1F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 3F); // Box 6
		tankwagonthreedomeModel[117].setRotationPoint(33F, -7F, -5F);

		tankwagonthreedomeModel[118].addShapeBox(0F, 0F, 0F, 3, 2, 4, 0F, 0F, -1F, 6F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, -1F, 6F, 0F, 1F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 3F); // Box 9
		tankwagonthreedomeModel[118].setRotationPoint(33F, -4F, -2F);

		tankwagonthreedomeModel[119].addShapeBox(0F, 0F, 0F, 3, 3, 10, 0F, 0F, 1F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 3F, 0F, 0F, 5F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 5F); // Box 6
		tankwagonthreedomeModel[119].setRotationPoint(33F, -14F, -5F);

		tankwagonthreedomeModel[120].addShapeBox(0F, 0F, 0F, 3, 2, 4, 0F, 0F, 1F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 3F, 0F, -1F, 6F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, -1F, 6F); // Box 9
		tankwagonthreedomeModel[120].setRotationPoint(33F, -16F, -2F);

		tankwagonthreedomeModel[121].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 0F, 4F); // Box 9
		tankwagonthreedomeModel[121].setRotationPoint(33F, -18F, -1F);

		tankwagonthreedomeModel[122].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F, 0F, 0F, 4F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 9
		tankwagonthreedomeModel[122].setRotationPoint(33F, -1F, -1F);

		tankwagonthreedomeModel[123].addShapeBox(0F, -2F, 0F, 2, 4, 8, 0F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F); // Box 186
		tankwagonthreedomeModel[123].setRotationPoint(36F, -9F, -4F);

		tankwagonthreedomeModel[124].addShapeBox(0F, -2F, 0F, 1, 4, 2, 0F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F); // Box 187
		tankwagonthreedomeModel[124].setRotationPoint(38F, -9F, -1F);

		tankwagonthreedomeModel[125].addShapeBox(0F, 0F, 0F, 2, 3, 4, 0F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 5F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 5F); // Box 188
		tankwagonthreedomeModel[125].setRotationPoint(36F, -14F, -2F);

		tankwagonthreedomeModel[126].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 2F); // Box 189
		tankwagonthreedomeModel[126].setRotationPoint(38F, -14F, -2F);

		tankwagonthreedomeModel[127].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F); // Box 190
		tankwagonthreedomeModel[127].setRotationPoint(36F, -16F, -2F);

		tankwagonthreedomeModel[128].addShapeBox(0F, 0F, 0F, 2, 3, 4, 0F, 0F, 0F, 5F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 5F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F); // Box 188
		tankwagonthreedomeModel[128].setRotationPoint(36F, -7F, -2F);

		tankwagonthreedomeModel[129].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F, 0F, 0F, 2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 2F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 189
		tankwagonthreedomeModel[129].setRotationPoint(38F, -7F, -2F);

		tankwagonthreedomeModel[130].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 190
		tankwagonthreedomeModel[130].setRotationPoint(36F, -4F, -2F);


	}

	private ModelFreightTruckM fronttrucks = new ModelFreightTruckM();
	private ModelFreightTruckM backtrucks = new ModelFreightTruckM();

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		for(int i = 0; i < 131; i++)
		{
			tankwagonthreedomeModel[i].render(f5);
		}
		Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/freighttruckm.png"));

		GL11.glPushMatrix();
		GL11.glTranslated(-2.6,-0.0,-0.175);
		fronttrucks.render(entity,f,f1,f2,f3,f4,f5);
		GL11.glPopMatrix();

		GL11.glPushMatrix();
		GL11.glTranslated(1.2,-0.0,-0.175);
		backtrucks.render(entity,f,f1,f2,f3,f4,f5);
		GL11.glPopMatrix();

	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
	{
	}

	public ModelRendererTurbo tankwagonthreedomeModel[];
}