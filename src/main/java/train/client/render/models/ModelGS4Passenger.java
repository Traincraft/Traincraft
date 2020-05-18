//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2018 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator:
// Created on:29.03.2018 - 18:04:12
// Last changed on: 29.03.2018 - 18:04:12

package train.client.render.models;

import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import tmt.ModelBase;
import tmt.ModelRendererTurbo;
import tmt.Tessellator;
import train.common.api.AbstractTrains;
import train.common.library.Info;

public class ModelGS4Passenger extends ModelBase
{
	int textureX = 512;
	int textureY = 512;

	public ModelGS4Passenger()
	{
		gs4passengerModel = new ModelRendererTurbo[99];
		gs4passengerModel[0] = new ModelRendererTurbo(this, 5, 37, textureX, textureY); // Box 1
		gs4passengerModel[1] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 2
		gs4passengerModel[2] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 6
		gs4passengerModel[3] = new ModelRendererTurbo(this, 281, 33, textureX, textureY); // Box 9
		gs4passengerModel[4] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 10
		gs4passengerModel[5] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 11
		gs4passengerModel[6] = new ModelRendererTurbo(this, 329, 33, textureX, textureY); // Box 14
		gs4passengerModel[7] = new ModelRendererTurbo(this, 282, 106, textureX, textureY); // Box 70
		gs4passengerModel[8] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 72
		gs4passengerModel[9] = new ModelRendererTurbo(this, 95, 315, textureX, textureY); // Box 76
		gs4passengerModel[10] = new ModelRendererTurbo(this, 27, 230, textureX, textureY); // Box 80
		gs4passengerModel[11] = new ModelRendererTurbo(this, 385, 81, textureX, textureY); // Box 455
		gs4passengerModel[12] = new ModelRendererTurbo(this, 265, 73, textureX, textureY); // Box 456
		gs4passengerModel[13] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 457
		gs4passengerModel[14] = new ModelRendererTurbo(this, 417, 81, textureX, textureY); // Box 458
		gs4passengerModel[15] = new ModelRendererTurbo(this, 481, 73, textureX, textureY); // Box 459
		gs4passengerModel[16] = new ModelRendererTurbo(this, 401, 33, textureX, textureY); // Box 460
		gs4passengerModel[17] = new ModelRendererTurbo(this, 265, 73, textureX, textureY); // Box 87
		gs4passengerModel[18] = new ModelRendererTurbo(this, 385, 81, textureX, textureY); // Box 88
		gs4passengerModel[19] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 89
		gs4passengerModel[20] = new ModelRendererTurbo(this, 417, 81, textureX, textureY); // Box 90
		gs4passengerModel[21] = new ModelRendererTurbo(this, 481, 73, textureX, textureY); // Box 91
		gs4passengerModel[22] = new ModelRendererTurbo(this, 401, 33, textureX, textureY); // Box 92
		gs4passengerModel[23] = new ModelRendererTurbo(this, 265, 73, textureX, textureY); // Box 93
		gs4passengerModel[24] = new ModelRendererTurbo(this, 385, 81, textureX, textureY); // Box 94
		gs4passengerModel[25] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 95
		gs4passengerModel[26] = new ModelRendererTurbo(this, 417, 81, textureX, textureY); // Box 96
		gs4passengerModel[27] = new ModelRendererTurbo(this, 481, 73, textureX, textureY); // Box 97
		gs4passengerModel[28] = new ModelRendererTurbo(this, 401, 33, textureX, textureY); // Box 98
		gs4passengerModel[29] = new ModelRendererTurbo(this, 265, 73, textureX, textureY); // Box 99
		gs4passengerModel[30] = new ModelRendererTurbo(this, 385, 81, textureX, textureY); // Box 100
		gs4passengerModel[31] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 101
		gs4passengerModel[32] = new ModelRendererTurbo(this, 417, 81, textureX, textureY); // Box 102
		gs4passengerModel[33] = new ModelRendererTurbo(this, 481, 73, textureX, textureY); // Box 103
		gs4passengerModel[34] = new ModelRendererTurbo(this, 401, 33, textureX, textureY); // Box 104
		gs4passengerModel[35] = new ModelRendererTurbo(this, 265, 73, textureX, textureY); // Box 105
		gs4passengerModel[36] = new ModelRendererTurbo(this, 385, 81, textureX, textureY); // Box 106
		gs4passengerModel[37] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 107
		gs4passengerModel[38] = new ModelRendererTurbo(this, 417, 81, textureX, textureY); // Box 108
		gs4passengerModel[39] = new ModelRendererTurbo(this, 481, 73, textureX, textureY); // Box 109
		gs4passengerModel[40] = new ModelRendererTurbo(this, 401, 33, textureX, textureY); // Box 110
		gs4passengerModel[41] = new ModelRendererTurbo(this, 265, 73, textureX, textureY); // Box 111
		gs4passengerModel[42] = new ModelRendererTurbo(this, 385, 81, textureX, textureY); // Box 112
		gs4passengerModel[43] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 113
		gs4passengerModel[44] = new ModelRendererTurbo(this, 417, 81, textureX, textureY); // Box 114
		gs4passengerModel[45] = new ModelRendererTurbo(this, 481, 73, textureX, textureY); // Box 115
		gs4passengerModel[46] = new ModelRendererTurbo(this, 401, 33, textureX, textureY); // Box 116
		gs4passengerModel[47] = new ModelRendererTurbo(this, 265, 73, textureX, textureY); // Box 147
		gs4passengerModel[48] = new ModelRendererTurbo(this, 385, 81, textureX, textureY); // Box 148
		gs4passengerModel[49] = new ModelRendererTurbo(this, 265, 73, textureX, textureY); // Box 149
		gs4passengerModel[50] = new ModelRendererTurbo(this, 385, 81, textureX, textureY); // Box 150
		gs4passengerModel[51] = new ModelRendererTurbo(this, 265, 73, textureX, textureY); // Box 151
		gs4passengerModel[52] = new ModelRendererTurbo(this, 385, 81, textureX, textureY); // Box 152
		gs4passengerModel[53] = new ModelRendererTurbo(this, 481, 73, textureX, textureY); // Box 153
		gs4passengerModel[54] = new ModelRendererTurbo(this, 401, 33, textureX, textureY); // Box 154
		gs4passengerModel[55] = new ModelRendererTurbo(this, 481, 73, textureX, textureY); // Box 155
		gs4passengerModel[56] = new ModelRendererTurbo(this, 401, 33, textureX, textureY); // Box 156
		gs4passengerModel[57] = new ModelRendererTurbo(this, 481, 73, textureX, textureY); // Box 157
		gs4passengerModel[58] = new ModelRendererTurbo(this, 401, 33, textureX, textureY); // Box 158
		gs4passengerModel[59] = new ModelRendererTurbo(this, 481, 73, textureX, textureY); // Box 159
		gs4passengerModel[60] = new ModelRendererTurbo(this, 401, 33, textureX, textureY); // Box 160
		gs4passengerModel[61] = new ModelRendererTurbo(this, 481, 73, textureX, textureY); // Box 161
		gs4passengerModel[62] = new ModelRendererTurbo(this, 401, 33, textureX, textureY); // Box 162
		gs4passengerModel[63] = new ModelRendererTurbo(this, 481, 73, textureX, textureY); // Box 163
		gs4passengerModel[64] = new ModelRendererTurbo(this, 401, 33, textureX, textureY); // Box 164
		gs4passengerModel[65] = new ModelRendererTurbo(this, 385, 81, textureX, textureY); // Box 165
		gs4passengerModel[66] = new ModelRendererTurbo(this, 265, 73, textureX, textureY); // Box 166
		gs4passengerModel[67] = new ModelRendererTurbo(this, 385, 81, textureX, textureY); // Box 167
		gs4passengerModel[68] = new ModelRendererTurbo(this, 265, 73, textureX, textureY); // Box 168
		gs4passengerModel[69] = new ModelRendererTurbo(this, 265, 73, textureX, textureY); // Box 169
		gs4passengerModel[70] = new ModelRendererTurbo(this, 385, 81, textureX, textureY); // Box 170
		gs4passengerModel[71] = new ModelRendererTurbo(this, 417, 81, textureX, textureY); // Box 171
		gs4passengerModel[72] = new ModelRendererTurbo(this, 417, 81, textureX, textureY); // Box 172
		gs4passengerModel[73] = new ModelRendererTurbo(this, 417, 81, textureX, textureY); // Box 173
		gs4passengerModel[74] = new ModelRendererTurbo(this, 417, 81, textureX, textureY); // Box 174
		gs4passengerModel[75] = new ModelRendererTurbo(this, 417, 81, textureX, textureY); // Box 175
		gs4passengerModel[76] = new ModelRendererTurbo(this, 417, 81, textureX, textureY); // Box 176
		gs4passengerModel[77] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 177
		gs4passengerModel[78] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 178
		gs4passengerModel[79] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 179
		gs4passengerModel[80] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 180
		gs4passengerModel[81] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 181
		gs4passengerModel[82] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 182
		gs4passengerModel[83] = new ModelRendererTurbo(this, 505, 41, textureX, textureY); // Box 193
		gs4passengerModel[84] = new ModelRendererTurbo(this, 145, 129, textureX, textureY); // Box 194
		gs4passengerModel[85] = new ModelRendererTurbo(this, 393, 121, textureX, textureY); // Box 195
		gs4passengerModel[86] = new ModelRendererTurbo(this, 153, 129, textureX, textureY); // Box 197
		gs4passengerModel[87] = new ModelRendererTurbo(this, 185, 129, textureX, textureY); // Box 198
		gs4passengerModel[88] = new ModelRendererTurbo(this, 217, 129, textureX, textureY); // Box 199
		gs4passengerModel[89] = new ModelRendererTurbo(this, 225, 129, textureX, textureY); // Box 200
		gs4passengerModel[90] = new ModelRendererTurbo(this, 257, 129, textureX, textureY); // Box 201
		gs4passengerModel[91] = new ModelRendererTurbo(this, 169, 89, textureX, textureY); // Box 202
		gs4passengerModel[92] = new ModelRendererTurbo(this, 193, 89, textureX, textureY); // Box 203
		gs4passengerModel[93] = new ModelRendererTurbo(this, 12, 165, textureX, textureY); // Box 204
		gs4passengerModel[94] = new ModelRendererTurbo(this, 8, 213, textureX, textureY); // Box 102
		gs4passengerModel[95] = new ModelRendererTurbo(this, 8, 203, textureX, textureY); // Box 103
		gs4passengerModel[96] = new ModelRendererTurbo(this, 3, 4, textureX, textureY); // Box 99
		gs4passengerModel[97] = new ModelRendererTurbo(this, 53, 280, textureX, textureY); // Box 99
		gs4passengerModel[98] = new ModelRendererTurbo(this, 165, 280, textureX, textureY); // Box 100

		gs4passengerModel[0].addShapeBox(0F, 0F, 0F, 119, 2, 16, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		gs4passengerModel[0].setRotationPoint(-60F, -26F, -8F);

		gs4passengerModel[1].addBox(0F, 0F, 0F, 4, 22, 1, 0F); // Box 2
		gs4passengerModel[1].setRotationPoint(-60F, -22F, 10F);

		gs4passengerModel[2].addBox(0F, 0F, 0F, 4, 22, 1, 0F); // Box 6
		gs4passengerModel[2].setRotationPoint(-60F, -22F, -11F);

		gs4passengerModel[3].addBox(0F, 0F, 0F, 1, 22, 20, 0F); // Box 9
		gs4passengerModel[3].setRotationPoint(-60F, -22F, -10F);

		gs4passengerModel[4].addBox(0F, 0F, 0F, 7, 22, 1, 0F); // Box 10
		gs4passengerModel[4].setRotationPoint(-56F, -22F, 10F);

		gs4passengerModel[5].addBox(0F, 0F, 0F, 7, 22, 1, 0F); // Box 11
		gs4passengerModel[5].setRotationPoint(-56F, -22F, -11F);

		gs4passengerModel[6].addBox(0F, 0F, 0F, 1, 22, 20, 0F); // Box 14
		gs4passengerModel[6].setRotationPoint(-46F, -22F, -10F);

		gs4passengerModel[7].addBox(0F, 0F, 0F, 1, 22, 20, 0F); // Box 70
		gs4passengerModel[7].setRotationPoint(58F, -22F, -10F);

		gs4passengerModel[8].addBox(0F, 0F, 0F, 119, 1, 22, 0F); // Box 72
		gs4passengerModel[8].setRotationPoint(-60F, 0F, -11F);

		gs4passengerModel[9].addShapeBox(0F, 0F, 0F, 33, 2, 22, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 76
		gs4passengerModel[9].setRotationPoint(-17F, 1F, -11F);

		gs4passengerModel[10].addBox(0F, 0F, 0F, 108, 22, 1, 0F); // Box 80
		gs4passengerModel[10].setRotationPoint(-49F, -22F, 10F);

		gs4passengerModel[11].addBox(0F, 0F, 0F, 4, 2, 8, 0F); // Box 455
		gs4passengerModel[11].setRotationPoint(19F, -3F, 2F);

		gs4passengerModel[12].addBox(0F, 0F, 0F, 2, 1, 7, 0F); // Box 456
		gs4passengerModel[12].setRotationPoint(20F, -1F, 2.5F);

		gs4passengerModel[13].addBox(0F, 0F, 0F, 4, 3, 1, 0F); // Box 457
		gs4passengerModel[13].setRotationPoint(19.45F, -5F, 1.5F);

		gs4passengerModel[14].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 458
		gs4passengerModel[14].setRotationPoint(23F, -3F, 2F);

		gs4passengerModel[15].addShapeBox(0F, 0F, 0F, 1, 7, 8, 0F, -1.5F, 0F, 0F, 1.5F, -0.2F, 0F, 1.5F, -0.2F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 459
		gs4passengerModel[15].setRotationPoint(23F, -10F, 2F);

		gs4passengerModel[16].addBox(0F, 0F, 0F, 1, 2, 6, 0F); // Box 460
		gs4passengerModel[16].setRotationPoint(24F, -10.2F, 3F);

		gs4passengerModel[17].addBox(0F, 0F, 0F, 2, 1, 7, 0F); // Box 87
		gs4passengerModel[17].setRotationPoint(11F, -1F, 2.5F);

		gs4passengerModel[18].addBox(0F, 0F, 0F, 4, 2, 8, 0F); // Box 88
		gs4passengerModel[18].setRotationPoint(10F, -3F, 2F);

		gs4passengerModel[19].addBox(0F, 0F, 0F, 4, 3, 1, 0F); // Box 89
		gs4passengerModel[19].setRotationPoint(10.45F, -5F, 1.5F);

		gs4passengerModel[20].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 90
		gs4passengerModel[20].setRotationPoint(14F, -3F, 2F);

		gs4passengerModel[21].addShapeBox(0F, 0F, 0F, 1, 7, 8, 0F, -1.5F, 0F, 0F, 1.5F, -0.2F, 0F, 1.5F, -0.2F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 91
		gs4passengerModel[21].setRotationPoint(14F, -10F, 2F);

		gs4passengerModel[22].addBox(0F, 0F, 0F, 1, 2, 6, 0F); // Box 92
		gs4passengerModel[22].setRotationPoint(15F, -10.2F, 3F);

		gs4passengerModel[23].addBox(0F, 0F, 0F, 2, 1, 7, 0F); // Box 93
		gs4passengerModel[23].setRotationPoint(-7F, -1F, 2.5F);

		gs4passengerModel[24].addBox(0F, 0F, 0F, 4, 2, 8, 0F); // Box 94
		gs4passengerModel[24].setRotationPoint(-8F, -3F, 2F);

		gs4passengerModel[25].addBox(0F, 0F, 0F, 4, 3, 1, 0F); // Box 95
		gs4passengerModel[25].setRotationPoint(-7.55F, -5F, 1.5F);

		gs4passengerModel[26].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 96
		gs4passengerModel[26].setRotationPoint(-4F, -3F, 2F);

		gs4passengerModel[27].addShapeBox(0F, 0F, 0F, 1, 7, 8, 0F, -1.5F, 0F, 0F, 1.5F, -0.2F, 0F, 1.5F, -0.2F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 97
		gs4passengerModel[27].setRotationPoint(-4F, -10F, 2F);

		gs4passengerModel[28].addBox(0F, 0F, 0F, 1, 2, 6, 0F); // Box 98
		gs4passengerModel[28].setRotationPoint(-3F, -10.2F, 3F);

		gs4passengerModel[29].addBox(0F, 0F, 0F, 2, 1, 7, 0F); // Box 99
		gs4passengerModel[29].setRotationPoint(2F, -1F, 2.5F);

		gs4passengerModel[30].addBox(0F, 0F, 0F, 4, 2, 8, 0F); // Box 100
		gs4passengerModel[30].setRotationPoint(1F, -3F, 2F);

		gs4passengerModel[31].addBox(0F, 0F, 0F, 4, 3, 1, 0F); // Box 101
		gs4passengerModel[31].setRotationPoint(1.45F, -5F, 1.5F);

		gs4passengerModel[32].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 102
		gs4passengerModel[32].setRotationPoint(5F, -3F, 2F);

		gs4passengerModel[33].addShapeBox(0F, 0F, 0F, 1, 7, 8, 0F, -1.5F, 0F, 0F, 1.5F, -0.2F, 0F, 1.5F, -0.2F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 103
		gs4passengerModel[33].setRotationPoint(5F, -10F, 2F);

		gs4passengerModel[34].addBox(0F, 0F, 0F, 1, 2, 6, 0F); // Box 104
		gs4passengerModel[34].setRotationPoint(6F, -10.2F, 3F);

		gs4passengerModel[35].addBox(0F, 0F, 0F, 2, 1, 7, 0F); // Box 105
		gs4passengerModel[35].setRotationPoint(-25F, -1F, 2.5F);

		gs4passengerModel[36].addBox(0F, 0F, 0F, 4, 2, 8, 0F); // Box 106
		gs4passengerModel[36].setRotationPoint(-26F, -3F, 2F);

		gs4passengerModel[37].addBox(0F, 0F, 0F, 4, 3, 1, 0F); // Box 107
		gs4passengerModel[37].setRotationPoint(-25.55F, -5F, 1.5F);

		gs4passengerModel[38].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 108
		gs4passengerModel[38].setRotationPoint(-22F, -3F, 2F);

		gs4passengerModel[39].addShapeBox(0F, 0F, 0F, 1, 7, 8, 0F, -1.5F, 0F, 0F, 1.5F, -0.2F, 0F, 1.5F, -0.2F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 109
		gs4passengerModel[39].setRotationPoint(-22F, -10F, 2F);

		gs4passengerModel[40].addBox(0F, 0F, 0F, 1, 2, 6, 0F); // Box 110
		gs4passengerModel[40].setRotationPoint(-21F, -10.2F, 3F);

		gs4passengerModel[41].addBox(0F, 0F, 0F, 2, 1, 7, 0F); // Box 111
		gs4passengerModel[41].setRotationPoint(-16F, -1F, 2.5F);

		gs4passengerModel[42].addBox(0F, 0F, 0F, 4, 2, 8, 0F); // Box 112
		gs4passengerModel[42].setRotationPoint(-17F, -3F, 2F);

		gs4passengerModel[43].addBox(0F, 0F, 0F, 4, 3, 1, 0F); // Box 113
		gs4passengerModel[43].setRotationPoint(-16.55F, -5F, 1.5F);

		gs4passengerModel[44].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 114
		gs4passengerModel[44].setRotationPoint(-13F, -3F, 2F);

		gs4passengerModel[45].addShapeBox(0F, 0F, 0F, 1, 7, 8, 0F, -1.5F, 0F, 0F, 1.5F, -0.2F, 0F, 1.5F, -0.2F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 115
		gs4passengerModel[45].setRotationPoint(-13F, -10F, 2F);

		gs4passengerModel[46].addBox(0F, 0F, 0F, 1, 2, 6, 0F); // Box 116
		gs4passengerModel[46].setRotationPoint(-12F, -10.2F, 3F);

		gs4passengerModel[47].addBox(0F, 0F, 0F, 2, 1, 7, 0F); // Box 147
		gs4passengerModel[47].setRotationPoint(11F, -1F, -9.5F);

		gs4passengerModel[48].addBox(0F, 0F, 0F, 4, 2, 8, 0F); // Box 148
		gs4passengerModel[48].setRotationPoint(10F, -3F, -10F);

		gs4passengerModel[49].addBox(0F, 0F, 0F, 2, 1, 7, 0F); // Box 149
		gs4passengerModel[49].setRotationPoint(2F, -1F, -9.5F);

		gs4passengerModel[50].addBox(0F, 0F, 0F, 4, 2, 8, 0F); // Box 150
		gs4passengerModel[50].setRotationPoint(1F, -3F, -10F);

		gs4passengerModel[51].addBox(0F, 0F, 0F, 2, 1, 7, 0F); // Box 151
		gs4passengerModel[51].setRotationPoint(20F, -1F, -9.5F);

		gs4passengerModel[52].addBox(0F, 0F, 0F, 4, 2, 8, 0F); // Box 152
		gs4passengerModel[52].setRotationPoint(19F, -3F, -10F);

		gs4passengerModel[53].addShapeBox(0F, 0F, 0F, 1, 7, 8, 0F, -1.5F, 0F, 0F, 1.5F, -0.2F, 0F, 1.5F, -0.2F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 153
		gs4passengerModel[53].setRotationPoint(23F, -10F, -10F);

		gs4passengerModel[54].addBox(0F, 0F, 0F, 1, 2, 6, 0F); // Box 154
		gs4passengerModel[54].setRotationPoint(24F, -10.2F, -9F);

		gs4passengerModel[55].addShapeBox(0F, 0F, 0F, 1, 7, 8, 0F, -1.5F, 0F, 0F, 1.5F, -0.2F, 0F, 1.5F, -0.2F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 155
		gs4passengerModel[55].setRotationPoint(14F, -10F, -10F);

		gs4passengerModel[56].addBox(0F, 0F, 0F, 1, 2, 6, 0F); // Box 156
		gs4passengerModel[56].setRotationPoint(15F, -10.2F, -9F);

		gs4passengerModel[57].addShapeBox(0F, 0F, 0F, 1, 7, 8, 0F, -1.5F, 0F, 0F, 1.5F, -0.2F, 0F, 1.5F, -0.2F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 157
		gs4passengerModel[57].setRotationPoint(5F, -10F, -10F);

		gs4passengerModel[58].addBox(0F, 0F, 0F, 1, 2, 6, 0F); // Box 158
		gs4passengerModel[58].setRotationPoint(6F, -10.2F, -9F);

		gs4passengerModel[59].addShapeBox(0F, 0F, 0F, 1, 7, 8, 0F, -1.5F, 0F, 0F, 1.5F, -0.2F, 0F, 1.5F, -0.2F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 159
		gs4passengerModel[59].setRotationPoint(-4F, -10F, -10F);

		gs4passengerModel[60].addBox(0F, 0F, 0F, 1, 2, 6, 0F); // Box 160
		gs4passengerModel[60].setRotationPoint(-3F, -10.2F, -9F);

		gs4passengerModel[61].addShapeBox(0F, 0F, 0F, 1, 7, 8, 0F, -1.5F, 0F, 0F, 1.5F, -0.2F, 0F, 1.5F, -0.2F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 161
		gs4passengerModel[61].setRotationPoint(-13F, -10F, -10F);

		gs4passengerModel[62].addBox(0F, 0F, 0F, 1, 2, 6, 0F); // Box 162
		gs4passengerModel[62].setRotationPoint(-12F, -10.2F, -9F);

		gs4passengerModel[63].addShapeBox(0F, 0F, 0F, 1, 7, 8, 0F, -1.5F, 0F, 0F, 1.5F, -0.2F, 0F, 1.5F, -0.2F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 163
		gs4passengerModel[63].setRotationPoint(-22F, -10F, -10F);

		gs4passengerModel[64].addBox(0F, 0F, 0F, 1, 2, 6, 0F); // Box 164
		gs4passengerModel[64].setRotationPoint(-21F, -10.2F, -9F);

		gs4passengerModel[65].addBox(0F, 0F, 0F, 4, 2, 8, 0F); // Box 165
		gs4passengerModel[65].setRotationPoint(-26F, -3F, -10F);

		gs4passengerModel[66].addBox(0F, 0F, 0F, 2, 1, 7, 0F); // Box 166
		gs4passengerModel[66].setRotationPoint(-25F, -1F, -9.5F);

		gs4passengerModel[67].addBox(0F, 0F, 0F, 4, 2, 8, 0F); // Box 167
		gs4passengerModel[67].setRotationPoint(-17F, -3F, -10F);

		gs4passengerModel[68].addBox(0F, 0F, 0F, 2, 1, 7, 0F); // Box 168
		gs4passengerModel[68].setRotationPoint(-16F, -1F, -9.5F);

		gs4passengerModel[69].addBox(0F, 0F, 0F, 2, 1, 7, 0F); // Box 169
		gs4passengerModel[69].setRotationPoint(-7F, -1F, -9.5F);

		gs4passengerModel[70].addBox(0F, 0F, 0F, 4, 2, 8, 0F); // Box 170
		gs4passengerModel[70].setRotationPoint(-8F, -3F, -10F);

		gs4passengerModel[71].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 171
		gs4passengerModel[71].setRotationPoint(23F, -3F, -10F);

		gs4passengerModel[72].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 172
		gs4passengerModel[72].setRotationPoint(14F, -3F, -10F);

		gs4passengerModel[73].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 173
		gs4passengerModel[73].setRotationPoint(5F, -3F, -10F);

		gs4passengerModel[74].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 174
		gs4passengerModel[74].setRotationPoint(-4F, -3F, -10F);

		gs4passengerModel[75].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 175
		gs4passengerModel[75].setRotationPoint(-13F, -3F, -10F);

		gs4passengerModel[76].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 176
		gs4passengerModel[76].setRotationPoint(-22F, -3F, -10F);

		gs4passengerModel[77].addBox(0F, 0F, 0F, 4, 3, 1, 0F); // Box 177
		gs4passengerModel[77].setRotationPoint(19.45F, -5F, -2.5F);

		gs4passengerModel[78].addBox(0F, 0F, 0F, 4, 3, 1, 0F); // Box 178
		gs4passengerModel[78].setRotationPoint(10.45F, -5F, -2.5F);

		gs4passengerModel[79].addBox(0F, 0F, 0F, 4, 3, 1, 0F); // Box 179
		gs4passengerModel[79].setRotationPoint(1.45F, -5F, -2.5F);

		gs4passengerModel[80].addBox(0F, 0F, 0F, 4, 3, 1, 0F); // Box 180
		gs4passengerModel[80].setRotationPoint(-7.55F, -5F, -2.5F);

		gs4passengerModel[81].addBox(0F, 0F, 0F, 4, 3, 1, 0F); // Box 181
		gs4passengerModel[81].setRotationPoint(-16.55F, -5F, -2.5F);

		gs4passengerModel[82].addBox(0F, 0F, 0F, 4, 3, 1, 0F); // Box 182
		gs4passengerModel[82].setRotationPoint(-25.55F, -5F, -2.5F);

		gs4passengerModel[83].addBox(0F, 0F, 0F, 2, 18, 1, 0F); // Box 193
		gs4passengerModel[83].setRotationPoint(-62F, -20F, -6F);

		gs4passengerModel[84].addBox(0F, 0F, 0F, 2, 18, 1, 0F); // Box 194
		gs4passengerModel[84].setRotationPoint(-62F, -20F, 5F);

		gs4passengerModel[85].addShapeBox(0F, 0F, 0F, 2, 1, 10, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 195
		gs4passengerModel[85].setRotationPoint(-62F, -2F, -5F);

		gs4passengerModel[86].addShapeBox(0F, 0F, 0F, 2, 1, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 197
		gs4passengerModel[86].setRotationPoint(-62F, -21F, -5F);

		gs4passengerModel[87].addShapeBox(0F, 0F, 0F, 2, 1, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 198
		gs4passengerModel[87].setRotationPoint(59F, -21F, -5F);

		gs4passengerModel[88].addBox(0F, 0F, 0F, 2, 18, 1, 0F); // Box 199
		gs4passengerModel[88].setRotationPoint(59F, -20F, 5F);

		gs4passengerModel[89].addShapeBox(0F, 0F, 0F, 2, 1, 10, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 200
		gs4passengerModel[89].setRotationPoint(59F, -2F, -5F);

		gs4passengerModel[90].addBox(0F, 0F, 0F, 2, 18, 1, 0F); // Box 201
		gs4passengerModel[90].setRotationPoint(59F, -20F, -6F);

		gs4passengerModel[91].addBox(0F, 0F, 0F, 4, 2, 2, 0F); // Box 202
		gs4passengerModel[91].setRotationPoint(59F, 0F, -1F);

		gs4passengerModel[92].addBox(0F, 0F, 0F, 4, 2, 2, 0F); // Box 203
		gs4passengerModel[92].setRotationPoint(-64F, 0F, -1F);

		gs4passengerModel[93].addBox(0F, 0F, 0F, 108, 22, 1, 0F); // Box 204
		gs4passengerModel[93].setRotationPoint(-49F, -22F, -11F);

		gs4passengerModel[94].addShapeBox(0F, 0F, 0F, 54, 0, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 102
		gs4passengerModel[94].setRotationPoint(-28F, -16F, 6F);

		gs4passengerModel[95].addShapeBox(0F, 0F, 0F, 54, 0, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 103
		gs4passengerModel[95].setRotationPoint(-28F, -16F, -10F);

		gs4passengerModel[96].addShapeBox(0F, 0F, 0F, 119, 2, 22, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 99
		gs4passengerModel[96].setRotationPoint(-60F, -24F, -11F);

		gs4passengerModel[97].addShapeBox(0F, 0F, 0F, 16, 2, 22, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 99
		gs4passengerModel[97].setRotationPoint(-60F, 1F, -11F);

		gs4passengerModel[98].addShapeBox(0F, 0F, 0F, 16, 2, 22, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 100
		gs4passengerModel[98].setRotationPoint(43F, 1F, -11F);


	}
	ModelGs4Bogie bogie1 = new ModelGs4Bogie();
	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		for(int i = 0; i < 99; i++)
		{
			gs4passengerModel[i].render(f5);
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

	public ModelRendererTurbo gs4passengerModel[];
}