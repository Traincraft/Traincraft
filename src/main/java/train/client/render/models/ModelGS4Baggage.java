//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2018 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator:
// Created on:02.04.2018 - 22:12:32
// Last changed on: 02.04.2018 - 22:12:32

package train.client.render.models;

import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import tmt.ModelBase;
import tmt.ModelRendererTurbo;
import tmt.Tessellator;
import train.common.api.AbstractTrains;
import train.common.library.Info;

public class ModelGS4Baggage extends ModelBase
{
	int textureX = 512;
	int textureY = 512;

	public ModelGS4Baggage()
	{
		gs4baggageModel = new ModelRendererTurbo[92];
		gs4baggageModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 1
		gs4baggageModel[1] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 2
		gs4baggageModel[2] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 6
		gs4baggageModel[3] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 9
		gs4baggageModel[4] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 10
		gs4baggageModel[5] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 11
		gs4baggageModel[6] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 14
		gs4baggageModel[7] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 70
		gs4baggageModel[8] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 72
		gs4baggageModel[9] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 76
		gs4baggageModel[10] = new ModelRendererTurbo(this, 112, 49, textureX, textureY); // Box 80
		gs4baggageModel[11] = new ModelRendererTurbo(this, 465, 65, textureX, textureY); // Box 193
		gs4baggageModel[12] = new ModelRendererTurbo(this, 113, 73, textureX, textureY); // Box 194
		gs4baggageModel[13] = new ModelRendererTurbo(this, 121, 73, textureX, textureY); // Box 195
		gs4baggageModel[14] = new ModelRendererTurbo(this, 153, 73, textureX, textureY); // Box 197
		gs4baggageModel[15] = new ModelRendererTurbo(this, 185, 73, textureX, textureY); // Box 198
		gs4baggageModel[16] = new ModelRendererTurbo(this, 217, 73, textureX, textureY); // Box 199
		gs4baggageModel[17] = new ModelRendererTurbo(this, 225, 73, textureX, textureY); // Box 200
		gs4baggageModel[18] = new ModelRendererTurbo(this, 257, 73, textureX, textureY); // Box 201
		gs4baggageModel[19] = new ModelRendererTurbo(this, 385, 25, textureX, textureY); // Box 202
		gs4baggageModel[20] = new ModelRendererTurbo(this, 497, 33, textureX, textureY); // Box 203
		gs4baggageModel[21] = new ModelRendererTurbo(this, 265, 89, textureX, textureY); // Box 204
		gs4baggageModel[22] = new ModelRendererTurbo(this, 265, 73, textureX, textureY); // Box 102
		gs4baggageModel[23] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 103
		gs4baggageModel[24] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 99
		gs4baggageModel[25] = new ModelRendererTurbo(this, 265, 113, textureX, textureY); // Box 99
		gs4baggageModel[26] = new ModelRendererTurbo(this, 345, 113, textureX, textureY); // Box 100
		gs4baggageModel[27] = new ModelRendererTurbo(this, 465, 97, textureX, textureY); // Box 99
		gs4baggageModel[28] = new ModelRendererTurbo(this, 489, 81, textureX, textureY); // Box 106
		gs4baggageModel[29] = new ModelRendererTurbo(this, 321, 113, textureX, textureY); // Box 107
		gs4baggageModel[30] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 108
		gs4baggageModel[31] = new ModelRendererTurbo(this, 489, 97, textureX, textureY); // Box 109
		gs4baggageModel[32] = new ModelRendererTurbo(this, 265, 41, textureX, textureY); // Box 110
		gs4baggageModel[33] = new ModelRendererTurbo(this, 201, 73, textureX, textureY); // Box 111
		gs4baggageModel[34] = new ModelRendererTurbo(this, 241, 73, textureX, textureY); // Box 116
		gs4baggageModel[35] = new ModelRendererTurbo(this, 425, 12, textureX, textureY); // Box 117
		gs4baggageModel[36] = new ModelRendererTurbo(this, 425, 17, textureX, textureY); // Box 120
		gs4baggageModel[37] = new ModelRendererTurbo(this, 489, 57, textureX, textureY); // Box 121
		gs4baggageModel[38] = new ModelRendererTurbo(this, 489, 57, textureX, textureY); // Box 126
		gs4baggageModel[39] = new ModelRendererTurbo(this, 425, 17, textureX, textureY); // Box 127
		gs4baggageModel[40] = new ModelRendererTurbo(this, 241, 73, textureX, textureY); // Box 129
		gs4baggageModel[41] = new ModelRendererTurbo(this, 425, 12, textureX, textureY); // Box 130
		gs4baggageModel[42] = new ModelRendererTurbo(this, 489, 57, textureX, textureY); // Box 131
		gs4baggageModel[43] = new ModelRendererTurbo(this, 425, 17, textureX, textureY); // Box 132
		gs4baggageModel[44] = new ModelRendererTurbo(this, 489, 57, textureX, textureY); // Box 133
		gs4baggageModel[45] = new ModelRendererTurbo(this, 425, 17, textureX, textureY); // Box 134
		gs4baggageModel[46] = new ModelRendererTurbo(this, 241, 73, textureX, textureY); // Box 135
		gs4baggageModel[47] = new ModelRendererTurbo(this, 425, 12, textureX, textureY); // Box 136
		gs4baggageModel[48] = new ModelRendererTurbo(this, 489, 57, textureX, textureY); // Box 137
		gs4baggageModel[49] = new ModelRendererTurbo(this, 425, 17, textureX, textureY); // Box 138
		gs4baggageModel[50] = new ModelRendererTurbo(this, 489, 97, textureX, textureY); // Box 139
		gs4baggageModel[51] = new ModelRendererTurbo(this, 489, 81, textureX, textureY); // Box 140
		gs4baggageModel[52] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 141
		gs4baggageModel[53] = new ModelRendererTurbo(this, 321, 113, textureX, textureY); // Box 142
		gs4baggageModel[54] = new ModelRendererTurbo(this, 265, 41, textureX, textureY); // Box 143
		gs4baggageModel[55] = new ModelRendererTurbo(this, 201, 73, textureX, textureY); // Box 144
		gs4baggageModel[56] = new ModelRendererTurbo(this, 489, 97, textureX, textureY); // Box 145
		gs4baggageModel[57] = new ModelRendererTurbo(this, 489, 81, textureX, textureY); // Box 146
		gs4baggageModel[58] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 147
		gs4baggageModel[59] = new ModelRendererTurbo(this, 321, 113, textureX, textureY); // Box 148
		gs4baggageModel[60] = new ModelRendererTurbo(this, 265, 41, textureX, textureY); // Box 149
		gs4baggageModel[61] = new ModelRendererTurbo(this, 201, 73, textureX, textureY); // Box 150
		gs4baggageModel[62] = new ModelRendererTurbo(this, 489, 97, textureX, textureY); // Box 151
		gs4baggageModel[63] = new ModelRendererTurbo(this, 489, 81, textureX, textureY); // Box 152
		gs4baggageModel[64] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 153
		gs4baggageModel[65] = new ModelRendererTurbo(this, 321, 113, textureX, textureY); // Box 154
		gs4baggageModel[66] = new ModelRendererTurbo(this, 265, 41, textureX, textureY); // Box 155
		gs4baggageModel[67] = new ModelRendererTurbo(this, 201, 73, textureX, textureY); // Box 156
		gs4baggageModel[68] = new ModelRendererTurbo(this, 489, 97, textureX, textureY); // Box 157
		gs4baggageModel[69] = new ModelRendererTurbo(this, 489, 81, textureX, textureY); // Box 158
		gs4baggageModel[70] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 159
		gs4baggageModel[71] = new ModelRendererTurbo(this, 321, 113, textureX, textureY); // Box 160
		gs4baggageModel[72] = new ModelRendererTurbo(this, 201, 73, textureX, textureY); // Box 161
		gs4baggageModel[73] = new ModelRendererTurbo(this, 265, 41, textureX, textureY); // Box 162
		gs4baggageModel[74] = new ModelRendererTurbo(this, 265, 41, textureX, textureY); // Box 163
		gs4baggageModel[75] = new ModelRendererTurbo(this, 489, 81, textureX, textureY); // Box 164
		gs4baggageModel[76] = new ModelRendererTurbo(this, 321, 113, textureX, textureY); // Box 165
		gs4baggageModel[77] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 166
		gs4baggageModel[78] = new ModelRendererTurbo(this, 489, 97, textureX, textureY); // Box 167
		gs4baggageModel[79] = new ModelRendererTurbo(this, 201, 73, textureX, textureY); // Box 168
		gs4baggageModel[80] = new ModelRendererTurbo(this, 265, 41, textureX, textureY); // Box 169
		gs4baggageModel[81] = new ModelRendererTurbo(this, 489, 81, textureX, textureY); // Box 170
		gs4baggageModel[82] = new ModelRendererTurbo(this, 321, 113, textureX, textureY); // Box 171
		gs4baggageModel[83] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 172
		gs4baggageModel[84] = new ModelRendererTurbo(this, 489, 97, textureX, textureY); // Box 173
		gs4baggageModel[85] = new ModelRendererTurbo(this, 201, 73, textureX, textureY); // Box 174
		gs4baggageModel[86] = new ModelRendererTurbo(this, 265, 41, textureX, textureY); // Box 175
		gs4baggageModel[87] = new ModelRendererTurbo(this, 489, 81, textureX, textureY); // Box 176
		gs4baggageModel[88] = new ModelRendererTurbo(this, 321, 113, textureX, textureY); // Box 177
		gs4baggageModel[89] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 178
		gs4baggageModel[90] = new ModelRendererTurbo(this, 489, 97, textureX, textureY); // Box 179
		gs4baggageModel[91] = new ModelRendererTurbo(this, 201, 73, textureX, textureY); // Box 180

		gs4baggageModel[0].addShapeBox(0F, 0F, 0F, 119, 2, 16, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		gs4baggageModel[0].setRotationPoint(-60F, -26F, -8F);

		gs4baggageModel[1].addBox(0F, 0F, 0F, 4, 22, 1, 0F); // Box 2
		gs4baggageModel[1].setRotationPoint(-60F, -22F, 10F);

		gs4baggageModel[2].addBox(0F, 0F, 0F, 4, 22, 1, 0F); // Box 6
		gs4baggageModel[2].setRotationPoint(-60F, -22F, -11F);

		gs4baggageModel[3].addBox(0F, 0F, 0F, 1, 22, 20, 0F); // Box 9
		gs4baggageModel[3].setRotationPoint(-60F, -22F, -10F);

		gs4baggageModel[4].addBox(0F, 0F, 0F, 7, 22, 1, 0F); // Box 10
		gs4baggageModel[4].setRotationPoint(-56F, -22F, 10F);

		gs4baggageModel[5].addBox(0F, 0F, 0F, 7, 22, 1, 0F); // Box 11
		gs4baggageModel[5].setRotationPoint(-56F, -22F, -11F);

		gs4baggageModel[6].addBox(0F, 0F, 0F, 1, 22, 20, 0F); // Box 14
		gs4baggageModel[6].setRotationPoint(-46F, -22F, -10F);

		gs4baggageModel[7].addBox(0F, 0F, 0F, 1, 22, 20, 0F); // Box 70
		gs4baggageModel[7].setRotationPoint(9F, -22F, -10F);

		gs4baggageModel[8].addBox(0F, 0F, 0F, 119, 1, 22, 0F); // Box 72
		gs4baggageModel[8].setRotationPoint(-60F, 0F, -11F);

		gs4baggageModel[9].addShapeBox(0F, 0F, 0F, 33, 2, 22, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 76
		gs4baggageModel[9].setRotationPoint(-17F, 1F, -11F);

		gs4baggageModel[10].addBox(0F, 0F, 0F, 108, 22, 1, 0F); // Box 80
		gs4baggageModel[10].setRotationPoint(-49F, -22F, 10F);

		gs4baggageModel[11].addBox(0F, 0F, 0F, 2, 18, 1, 0F); // Box 193
		gs4baggageModel[11].setRotationPoint(-62F, -20F, -6F);

		gs4baggageModel[12].addBox(0F, 0F, 0F, 2, 18, 1, 0F); // Box 194
		gs4baggageModel[12].setRotationPoint(-62F, -20F, 5F);

		gs4baggageModel[13].addShapeBox(0F, 0F, 0F, 2, 1, 10, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 195
		gs4baggageModel[13].setRotationPoint(-62F, -2F, -5F);

		gs4baggageModel[14].addShapeBox(0F, 0F, 0F, 2, 1, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 197
		gs4baggageModel[14].setRotationPoint(-62F, -21F, -5F);

		gs4baggageModel[15].addShapeBox(0F, 0F, 0F, 2, 1, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 198
		gs4baggageModel[15].setRotationPoint(59F, -21F, -5F);

		gs4baggageModel[16].addBox(0F, 0F, 0F, 2, 18, 1, 0F); // Box 199
		gs4baggageModel[16].setRotationPoint(59F, -20F, 5F);

		gs4baggageModel[17].addShapeBox(0F, 0F, 0F, 2, 1, 10, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 200
		gs4baggageModel[17].setRotationPoint(59F, -2F, -5F);

		gs4baggageModel[18].addBox(0F, 0F, 0F, 2, 18, 1, 0F); // Box 201
		gs4baggageModel[18].setRotationPoint(59F, -20F, -6F);

		gs4baggageModel[19].addBox(0F, 0F, 0F, 4, 2, 2, 0F); // Box 202
		gs4baggageModel[19].setRotationPoint(59F, 0F, -1F);

		gs4baggageModel[20].addBox(0F, 0F, 0F, 4, 2, 2, 0F); // Box 203
		gs4baggageModel[20].setRotationPoint(-64F, 0F, -1F);

		gs4baggageModel[21].addBox(0F, 0F, 0F, 108, 22, 1, 0F); // Box 204
		gs4baggageModel[21].setRotationPoint(-49F, -22F, -11F);

		gs4baggageModel[22].addShapeBox(0F, 0F, 0F, 34, 0, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 102
		gs4baggageModel[22].setRotationPoint(-35F, -16F, 6F);

		gs4baggageModel[23].addShapeBox(0F, 0F, 0F, 34, 0, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 103
		gs4baggageModel[23].setRotationPoint(-35F, -16F, -10F);

		gs4baggageModel[24].addShapeBox(0F, 0F, 0F, 119, 2, 22, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 99
		gs4baggageModel[24].setRotationPoint(-60F, -24F, -11F);

		gs4baggageModel[25].addShapeBox(0F, 0F, 0F, 16, 2, 22, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 99
		gs4baggageModel[25].setRotationPoint(-60F, 1F, -11F);

		gs4baggageModel[26].addShapeBox(0F, 0F, 0F, 16, 2, 22, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 100
		gs4baggageModel[26].setRotationPoint(43F, 1F, -11F);

		gs4baggageModel[27].addBox(0F, 0F, 0F, 1, 22, 20, 0F); // Box 99
		gs4baggageModel[27].setRotationPoint(58F, -22F, -10F);

		gs4baggageModel[28].addBox(0F, 0F, 0F, 2, 1, 7, 0F); // Box 106
		gs4baggageModel[28].setRotationPoint(-34F, -1F, 2.5F);

		gs4baggageModel[29].addBox(0F, 0F, 0F, 4, 2, 8, 0F); // Box 107
		gs4baggageModel[29].setRotationPoint(-35F, -3F, 2F);

		gs4baggageModel[30].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 108
		gs4baggageModel[30].setRotationPoint(-31F, -3F, 2F);

		gs4baggageModel[31].addShapeBox(0F, 0F, 0F, 1, 7, 8, 0F, -1.5F, 0F, 0F, 1.5F, -0.2F, 0F, 1.5F, -0.2F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 109
		gs4baggageModel[31].setRotationPoint(-31F, -10F, 2F);

		gs4baggageModel[32].addBox(0F, 0F, 0F, 4, 3, 1, 0F); // Box 110
		gs4baggageModel[32].setRotationPoint(-34.55F, -5F, 1.5F);

		gs4baggageModel[33].addBox(0F, 0F, 0F, 1, 2, 6, 0F); // Box 111
		gs4baggageModel[33].setRotationPoint(-30F, -10.2F, 3F);

		gs4baggageModel[34].addBox(0F, 0F, 0F, 2, 3, 5, 0F); // Box 116
		gs4baggageModel[34].setRotationPoint(13F, -3F, -4F);

		gs4baggageModel[35].addBox(0F, 0F, 0F, 0, 2, 5, 0F); // Box 117
		gs4baggageModel[35].setRotationPoint(14F, -5F, -4F);

		gs4baggageModel[36].addBox(0F, 0F, 0F, 5, 2, 0, 0F); // Box 120
		gs4baggageModel[36].setRotationPoint(20.75F, -5F, -3.25F);
		gs4baggageModel[36].rotateAngleY = -0.78539816F;

		gs4baggageModel[37].addBox(0F, 0F, 0F, 5, 3, 2, 0F); // Box 121
		gs4baggageModel[37].setRotationPoint(20F, -3F, -4F);
		gs4baggageModel[37].rotateAngleY = -0.78539816F;

		gs4baggageModel[38].addBox(0F, 0F, 0F, 5, 3, 2, 0F); // Box 126
		gs4baggageModel[38].setRotationPoint(39F, -3F, -8F);

		gs4baggageModel[39].addBox(0F, 0F, 0F, 5, 2, 0, 0F); // Box 127
		gs4baggageModel[39].setRotationPoint(39F, -5F, -7F);

		gs4baggageModel[40].addBox(0F, 0F, 0F, 2, 3, 5, 0F); // Box 129
		gs4baggageModel[40].setRotationPoint(53F, -3F, 2F);
		gs4baggageModel[40].rotateAngleY = -0.78539816F;

		gs4baggageModel[41].addBox(0F, 0F, 0F, 0, 2, 5, 0F); // Box 130
		gs4baggageModel[41].setRotationPoint(53.75F, -5F, 1.25F);
		gs4baggageModel[41].rotateAngleY = -0.78539816F;

		gs4baggageModel[42].addBox(0F, 0F, 0F, 5, 3, 2, 0F); // Box 131
		gs4baggageModel[42].setRotationPoint(30F, -3F, -8F);

		gs4baggageModel[43].addBox(0F, 0F, 0F, 5, 2, 0, 0F); // Box 132
		gs4baggageModel[43].setRotationPoint(30F, -5F, -7F);

		gs4baggageModel[44].addBox(0F, 0F, 0F, 5, 3, 2, 0F); // Box 133
		gs4baggageModel[44].setRotationPoint(13F, -3F, -8F);

		gs4baggageModel[45].addBox(0F, 0F, 0F, 5, 2, 0, 0F); // Box 134
		gs4baggageModel[45].setRotationPoint(13F, -5F, -7F);

		gs4baggageModel[46].addBox(0F, 0F, 0F, 2, 3, 5, 0F); // Box 135
		gs4baggageModel[46].setRotationPoint(51F, 0F, -6F);
		gs4baggageModel[46].rotateAngleY = -0.78539816F;
		gs4baggageModel[46].rotateAngleZ = 1.57079633F;

		gs4baggageModel[47].addBox(0F, 0F, 0F, 0, 2, 5, 0F); // Box 136
		gs4baggageModel[47].setRotationPoint(49.6F, -1F, -4.6F);
		gs4baggageModel[47].rotateAngleY = -0.78539816F;
		gs4baggageModel[47].rotateAngleZ = 1.57079633F;

		gs4baggageModel[48].addBox(0F, 0F, 0F, 5, 3, 2, 0F); // Box 137
		gs4baggageModel[48].setRotationPoint(28F, -3F, 0F);
		gs4baggageModel[48].rotateAngleY = -0.78539816F;

		gs4baggageModel[49].addBox(0F, 0F, 0F, 5, 2, 0, 0F); // Box 138
		gs4baggageModel[49].setRotationPoint(28.75F, -5F, 0.75F);
		gs4baggageModel[49].rotateAngleY = -0.78539816F;

		gs4baggageModel[50].addShapeBox(0F, 0F, 0F, 1, 7, 8, 0F, -1.5F, 0F, 0F, 1.5F, -0.2F, 0F, 1.5F, -0.2F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 139
		gs4baggageModel[50].setRotationPoint(-22F, -10F, 2F);

		gs4baggageModel[51].addBox(0F, 0F, 0F, 2, 1, 7, 0F); // Box 140
		gs4baggageModel[51].setRotationPoint(-25F, -1F, 2.5F);

		gs4baggageModel[52].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 141
		gs4baggageModel[52].setRotationPoint(-22F, -3F, 2F);

		gs4baggageModel[53].addBox(0F, 0F, 0F, 4, 2, 8, 0F); // Box 142
		gs4baggageModel[53].setRotationPoint(-26F, -3F, 2F);

		gs4baggageModel[54].addBox(0F, 0F, 0F, 4, 3, 1, 0F); // Box 143
		gs4baggageModel[54].setRotationPoint(-25.55F, -5F, 1.5F);

		gs4baggageModel[55].addBox(0F, 0F, 0F, 1, 2, 6, 0F); // Box 144
		gs4baggageModel[55].setRotationPoint(-21F, -10.2F, 3F);

		gs4baggageModel[56].addShapeBox(0F, 0F, 0F, 1, 7, 8, 0F, -1.5F, 0F, 0F, 1.5F, -0.2F, 0F, 1.5F, -0.2F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 145
		gs4baggageModel[56].setRotationPoint(-13F, -10F, 2F);

		gs4baggageModel[57].addBox(0F, 0F, 0F, 2, 1, 7, 0F); // Box 146
		gs4baggageModel[57].setRotationPoint(-16F, -1F, 2.5F);

		gs4baggageModel[58].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 147
		gs4baggageModel[58].setRotationPoint(-13F, -3F, 2F);

		gs4baggageModel[59].addBox(0F, 0F, 0F, 4, 2, 8, 0F); // Box 148
		gs4baggageModel[59].setRotationPoint(-17F, -3F, 2F);

		gs4baggageModel[60].addBox(0F, 0F, 0F, 4, 3, 1, 0F); // Box 149
		gs4baggageModel[60].setRotationPoint(-16.55F, -5F, 1.5F);

		gs4baggageModel[61].addBox(0F, 0F, 0F, 1, 2, 6, 0F); // Box 150
		gs4baggageModel[61].setRotationPoint(-12F, -10.2F, 3F);

		gs4baggageModel[62].addShapeBox(0F, 0F, 0F, 1, 7, 8, 0F, -1.5F, 0F, 0F, 1.5F, -0.2F, 0F, 1.5F, -0.2F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 151
		gs4baggageModel[62].setRotationPoint(-4F, -10F, 2F);

		gs4baggageModel[63].addBox(0F, 0F, 0F, 2, 1, 7, 0F); // Box 152
		gs4baggageModel[63].setRotationPoint(-7F, -1F, 2.5F);

		gs4baggageModel[64].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 153
		gs4baggageModel[64].setRotationPoint(-4F, -3F, 2F);

		gs4baggageModel[65].addBox(0F, 0F, 0F, 4, 2, 8, 0F); // Box 154
		gs4baggageModel[65].setRotationPoint(-8F, -3F, 2F);

		gs4baggageModel[66].addBox(0F, 0F, 0F, 4, 3, 1, 0F); // Box 155
		gs4baggageModel[66].setRotationPoint(-7.55F, -5F, 1.5F);

		gs4baggageModel[67].addBox(0F, 0F, 0F, 1, 2, 6, 0F); // Box 156
		gs4baggageModel[67].setRotationPoint(-3F, -10.2F, 3F);

		gs4baggageModel[68].addShapeBox(0F, 0F, 0F, 1, 7, 8, 0F, -1.5F, 0F, 0F, 1.5F, -0.2F, 0F, 1.5F, -0.2F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 157
		gs4baggageModel[68].setRotationPoint(-4F, -10F, -10F);

		gs4baggageModel[69].addBox(0F, 0F, 0F, 2, 1, 7, 0F); // Box 158
		gs4baggageModel[69].setRotationPoint(-7F, -1F, -9.5F);

		gs4baggageModel[70].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 159
		gs4baggageModel[70].setRotationPoint(-4F, -3F, -10F);

		gs4baggageModel[71].addBox(0F, 0F, 0F, 4, 2, 8, 0F); // Box 160
		gs4baggageModel[71].setRotationPoint(-8F, -3F, -10F);

		gs4baggageModel[72].addBox(0F, 0F, 0F, 1, 2, 6, 0F); // Box 161
		gs4baggageModel[72].setRotationPoint(-3F, -10.2F, -9F);

		gs4baggageModel[73].addBox(0F, 0F, 0F, 4, 3, 1, 0F); // Box 162
		gs4baggageModel[73].setRotationPoint(-3.55F, -5F, -1.5F);
		gs4baggageModel[73].rotateAngleY = -3.14159265F;

		gs4baggageModel[74].addBox(0F, 0F, 0F, 4, 3, 1, 0F); // Box 163
		gs4baggageModel[74].setRotationPoint(-12.55F, -5F, -1.5F);
		gs4baggageModel[74].rotateAngleY = -3.14159265F;

		gs4baggageModel[75].addBox(0F, 0F, 0F, 2, 1, 7, 0F); // Box 164
		gs4baggageModel[75].setRotationPoint(-16F, -1F, -9.5F);

		gs4baggageModel[76].addBox(0F, 0F, 0F, 4, 2, 8, 0F); // Box 165
		gs4baggageModel[76].setRotationPoint(-17F, -3F, -10F);

		gs4baggageModel[77].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 166
		gs4baggageModel[77].setRotationPoint(-13F, -3F, -10F);

		gs4baggageModel[78].addShapeBox(0F, 0F, 0F, 1, 7, 8, 0F, -1.5F, 0F, 0F, 1.5F, -0.2F, 0F, 1.5F, -0.2F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 167
		gs4baggageModel[78].setRotationPoint(-13F, -10F, -10F);

		gs4baggageModel[79].addBox(0F, 0F, 0F, 1, 2, 6, 0F); // Box 168
		gs4baggageModel[79].setRotationPoint(-12F, -10.2F, -9F);

		gs4baggageModel[80].addBox(0F, 0F, 0F, 4, 3, 1, 0F); // Box 169
		gs4baggageModel[80].setRotationPoint(-21.55F, -5F, -1.5F);
		gs4baggageModel[80].rotateAngleY = -3.14159265F;

		gs4baggageModel[81].addBox(0F, 0F, 0F, 2, 1, 7, 0F); // Box 170
		gs4baggageModel[81].setRotationPoint(-25F, -1F, -9.5F);

		gs4baggageModel[82].addBox(0F, 0F, 0F, 4, 2, 8, 0F); // Box 171
		gs4baggageModel[82].setRotationPoint(-26F, -3F, -10F);

		gs4baggageModel[83].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 172
		gs4baggageModel[83].setRotationPoint(-22F, -3F, -10F);

		gs4baggageModel[84].addShapeBox(0F, 0F, 0F, 1, 7, 8, 0F, -1.5F, 0F, 0F, 1.5F, -0.2F, 0F, 1.5F, -0.2F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 173
		gs4baggageModel[84].setRotationPoint(-22F, -10F, -10F);

		gs4baggageModel[85].addBox(0F, 0F, 0F, 1, 2, 6, 0F); // Box 174
		gs4baggageModel[85].setRotationPoint(-21F, -10.2F, -9F);

		gs4baggageModel[86].addBox(0F, 0F, 0F, 4, 3, 1, 0F); // Box 175
		gs4baggageModel[86].setRotationPoint(-30.55F, -5F, -1.5F);
		gs4baggageModel[86].rotateAngleY = -3.14159265F;

		gs4baggageModel[87].addBox(0F, 0F, 0F, 2, 1, 7, 0F); // Box 176
		gs4baggageModel[87].setRotationPoint(-34F, -1F, -9.5F);

		gs4baggageModel[88].addBox(0F, 0F, 0F, 4, 2, 8, 0F); // Box 177
		gs4baggageModel[88].setRotationPoint(-35F, -3F, -10F);

		gs4baggageModel[89].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 178
		gs4baggageModel[89].setRotationPoint(-31F, -3F, -10F);

		gs4baggageModel[90].addShapeBox(0F, 0F, 0F, 1, 7, 8, 0F, -1.5F, 0F, 0F, 1.5F, -0.2F, 0F, 1.5F, -0.2F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 179
		gs4baggageModel[90].setRotationPoint(-31F, -10F, -10F);

		gs4baggageModel[91].addBox(0F, 0F, 0F, 1, 2, 6, 0F); // Box 180
		gs4baggageModel[91].setRotationPoint(-30F, -10.2F, -9F);

		fixRotation(gs4baggageModel, false, true, true);
	}
	ModelGs4Bogie bogie1 = new ModelGs4Bogie();
	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		for(int i = 0; i < 92; i++)
		{
			gs4baggageModel[i].render(f5);
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

	public ModelRendererTurbo gs4baggageModel[];
}