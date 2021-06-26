//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2018 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator:
// Created on:26.02.2018 - 18:03:56
// Last changed on: 26.02.2018 - 18:03:56

package train.client.render.models;

import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import tmt.ModelBase;
import tmt.ModelRendererTurbo;
import tmt.Tessellator;
import train.common.library.Info;

public class ModelBulkheadFlat extends ModelBase
{
	int textureX = 512;
	int textureY = 512;

	public ModelBulkheadFlat()
	{
		bulkheadflatModel = new ModelRendererTurbo[112];
		bulkheadflatModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 4
		bulkheadflatModel[1] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 39
		bulkheadflatModel[2] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 42
		bulkheadflatModel[3] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 43
		bulkheadflatModel[4] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 44
		bulkheadflatModel[5] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 45
		bulkheadflatModel[6] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 46
		bulkheadflatModel[7] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 47
		bulkheadflatModel[8] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 48
		bulkheadflatModel[9] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 49
		bulkheadflatModel[10] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 50
		bulkheadflatModel[11] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 51
		bulkheadflatModel[12] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 52
		bulkheadflatModel[13] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 53
		bulkheadflatModel[14] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 55
		bulkheadflatModel[15] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 57
		bulkheadflatModel[16] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 58
		bulkheadflatModel[17] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 59
		bulkheadflatModel[18] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 60
		bulkheadflatModel[19] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 61
		bulkheadflatModel[20] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 62
		bulkheadflatModel[21] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 63
		bulkheadflatModel[22] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 64
		bulkheadflatModel[23] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 65
		bulkheadflatModel[24] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 66
		bulkheadflatModel[25] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 67
		bulkheadflatModel[26] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 69
		bulkheadflatModel[27] = new ModelRendererTurbo(this, 153, 25, textureX, textureY); // Box 70
		bulkheadflatModel[28] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 71
		bulkheadflatModel[29] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 72
		bulkheadflatModel[30] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 73
		bulkheadflatModel[31] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 74
		bulkheadflatModel[32] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 75
		bulkheadflatModel[33] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 76
		bulkheadflatModel[34] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 77
		bulkheadflatModel[35] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 78
		bulkheadflatModel[36] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 79
		bulkheadflatModel[37] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 80
		bulkheadflatModel[38] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 81
		bulkheadflatModel[39] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 82
		bulkheadflatModel[40] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 83
		bulkheadflatModel[41] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 84
		bulkheadflatModel[42] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 85
		bulkheadflatModel[43] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 86
		bulkheadflatModel[44] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 87
		bulkheadflatModel[45] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 88
		bulkheadflatModel[46] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 89
		bulkheadflatModel[47] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 90
		bulkheadflatModel[48] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 91
		bulkheadflatModel[49] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 92
		bulkheadflatModel[50] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 93
		bulkheadflatModel[51] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 94
		bulkheadflatModel[52] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 95
		bulkheadflatModel[53] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 96
		bulkheadflatModel[54] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 97
		bulkheadflatModel[55] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 98
		bulkheadflatModel[56] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 99
		bulkheadflatModel[57] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 100
		bulkheadflatModel[58] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 101
		bulkheadflatModel[59] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 102
		bulkheadflatModel[60] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 103
		bulkheadflatModel[61] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 104
		bulkheadflatModel[62] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 105
		bulkheadflatModel[63] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 106
		bulkheadflatModel[64] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 107
		bulkheadflatModel[65] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 108
		bulkheadflatModel[66] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Box 109
		bulkheadflatModel[67] = new ModelRendererTurbo(this, 73, 9, textureX, textureY); // Box 110
		bulkheadflatModel[68] = new ModelRendererTurbo(this, 89, 9, textureX, textureY); // Box 111
		bulkheadflatModel[69] = new ModelRendererTurbo(this, 105, 9, textureX, textureY); // Box 112
		bulkheadflatModel[70] = new ModelRendererTurbo(this, 113, 9, textureX, textureY); // Box 113
		bulkheadflatModel[71] = new ModelRendererTurbo(this, 121, 9, textureX, textureY); // Box 114
		bulkheadflatModel[72] = new ModelRendererTurbo(this, 185, 9, textureX, textureY); // Box 115
		bulkheadflatModel[73] = new ModelRendererTurbo(this, 305, 49, textureX, textureY); // Box 116
		bulkheadflatModel[74] = new ModelRendererTurbo(this, 449, 9, textureX, textureY); // Box 117
		bulkheadflatModel[75] = new ModelRendererTurbo(this, 169, 17, textureX, textureY); // Box 118
		bulkheadflatModel[76] = new ModelRendererTurbo(this, 193, 9, textureX, textureY); // Box 120
		bulkheadflatModel[77] = new ModelRendererTurbo(this, 201, 9, textureX, textureY); // Box 121
		bulkheadflatModel[78] = new ModelRendererTurbo(this, 155, 35, textureX, textureY); // Box 122
		bulkheadflatModel[79] = new ModelRendererTurbo(this, 209, 9, textureX, textureY); // Box 123
		bulkheadflatModel[80] = new ModelRendererTurbo(this, 217, 9, textureX, textureY); // Box 124
		bulkheadflatModel[81] = new ModelRendererTurbo(this, 225, 9, textureX, textureY); // Box 125
		bulkheadflatModel[82] = new ModelRendererTurbo(this, 249, 9, textureX, textureY); // Box 126
		bulkheadflatModel[83] = new ModelRendererTurbo(this, 449, 17, textureX, textureY); // Box 127
		bulkheadflatModel[84] = new ModelRendererTurbo(this, 257, 9, textureX, textureY); // Box 128
		bulkheadflatModel[85] = new ModelRendererTurbo(this, 457, 17, textureX, textureY); // Box 129
		bulkheadflatModel[86] = new ModelRendererTurbo(this, 265, 9, textureX, textureY); // Box 130
		bulkheadflatModel[87] = new ModelRendererTurbo(this, 457, 17, textureX, textureY); // Box 131
		bulkheadflatModel[88] = new ModelRendererTurbo(this, 433, 33, textureX, textureY); // Box 132
		bulkheadflatModel[89] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 133
		bulkheadflatModel[90] = new ModelRendererTurbo(this, 129, 9, textureX, textureY); // Box 134
		bulkheadflatModel[91] = new ModelRendererTurbo(this, 329, 25, textureX, textureY); // Box 135
		bulkheadflatModel[92] = new ModelRendererTurbo(this, 465, 17, textureX, textureY); // Box 136
		bulkheadflatModel[93] = new ModelRendererTurbo(this, 273, 9, textureX, textureY); // Box 137
		bulkheadflatModel[94] = new ModelRendererTurbo(this, 281, 9, textureX, textureY); // Box 138
		bulkheadflatModel[95] = new ModelRendererTurbo(this, 449, 41, textureX, textureY); // Box 139
		bulkheadflatModel[96] = new ModelRendererTurbo(this, 297, 9, textureX, textureY); // Box 140
		bulkheadflatModel[97] = new ModelRendererTurbo(this, 337, 25, textureX, textureY); // Box 141
		bulkheadflatModel[98] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 142
		bulkheadflatModel[99] = new ModelRendererTurbo(this, 393, 49, textureX, textureY); // Box 144
		bulkheadflatModel[100] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 145
		bulkheadflatModel[101] = new ModelRendererTurbo(this, 465, 41, textureX, textureY); // Box 146
		bulkheadflatModel[102] = new ModelRendererTurbo(this, 345, 9, textureX, textureY); // Box 147
		bulkheadflatModel[103] = new ModelRendererTurbo(this, 345, 25, textureX, textureY); // Box 148
		bulkheadflatModel[104] = new ModelRendererTurbo(this, 377, 9, textureX, textureY); // Box 149
		bulkheadflatModel[105] = new ModelRendererTurbo(this, 409, 9, textureX, textureY); // Box 150
		bulkheadflatModel[106] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 151
		bulkheadflatModel[107] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 152
		bulkheadflatModel[108] = new ModelRendererTurbo(this, 105, 17, textureX, textureY); // Box 153
		bulkheadflatModel[109] = new ModelRendererTurbo(this, 457, 49, textureX, textureY); // Box 154
		bulkheadflatModel[110] = new ModelRendererTurbo(this, 489, 41, textureX, textureY); // Box 112
		bulkheadflatModel[111] = new ModelRendererTurbo(this, 169, 57, textureX, textureY); // Box 113

		bulkheadflatModel[0].addBox(0F, 0F, 0F, 7, 3, 22, 0F); // Box 4
		bulkheadflatModel[0].setRotationPoint(31F, 0F, -11F);

		bulkheadflatModel[1].addBox(0F, 0F, 0F, 5, 3, 0, 0F); // Box 39
		bulkheadflatModel[1].setRotationPoint(33F, 2F, -11.05F);

		bulkheadflatModel[2].addShapeBox(0F, 0F, 0F, 0, 21, 1, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, -5F, 0F, 0F); // Box 42
		bulkheadflatModel[2].setRotationPoint(33F, -21F, -11F);

		bulkheadflatModel[3].addBox(0F, 0F, 0F, 2, 16, 1, 0F); // Box 43
		bulkheadflatModel[3].setRotationPoint(31F, -17F, -12F);

		bulkheadflatModel[4].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 44
		bulkheadflatModel[4].setRotationPoint(31F, -1F, -12F);

		bulkheadflatModel[5].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 45
		bulkheadflatModel[5].setRotationPoint(31F, -21F, -12F);

		bulkheadflatModel[6].addBox(0F, 0F, 0F, 3, 1, 22, 0F); // Box 46
		bulkheadflatModel[6].setRotationPoint(31F, -22F, -11F);

		bulkheadflatModel[7].addShapeBox(0F, 0F, 0F, 1, 21, 6, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F); // Box 47
		bulkheadflatModel[7].setRotationPoint(33F, -21F, -11F);

		bulkheadflatModel[8].addBox(0F, 0F, 0F, 0, 3, 5, 0F); // Box 48
		bulkheadflatModel[8].setRotationPoint(38.05F, -0.0499999999999972F, -10F);

		bulkheadflatModel[9].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 49
		bulkheadflatModel[9].setRotationPoint(31F, -1F, 11F);

		bulkheadflatModel[10].addBox(0F, 0F, 0F, 2, 16, 1, 0F); // Box 50
		bulkheadflatModel[10].setRotationPoint(31F, -17F, 11F);

		bulkheadflatModel[11].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 51
		bulkheadflatModel[11].setRotationPoint(31F, -21F, 11F);

		bulkheadflatModel[12].addShapeBox(0F, 0F, 0F, 0, 21, 1, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, -5F, 0F, 0F); // Box 52
		bulkheadflatModel[12].setRotationPoint(33F, -21F, 10F);

		bulkheadflatModel[13].addShapeBox(0F, 0F, 0F, 1, 21, 6, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F); // Box 53
		bulkheadflatModel[13].setRotationPoint(33F, -21F, 5F);

		bulkheadflatModel[14].addBox(0F, 0F, 0F, 5, 3, 0, 0F); // Box 55
		bulkheadflatModel[14].setRotationPoint(33F, 2F, 11.05F);

		bulkheadflatModel[15].addBox(0F, 0F, 0F, 0, 3, 5, 0F); // Box 57
		bulkheadflatModel[15].setRotationPoint(38.05F, -0.0499999999999972F, 5F);

		bulkheadflatModel[16].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Box 58
		bulkheadflatModel[16].setRotationPoint(36F, -1F, -3F);

		bulkheadflatModel[17].addBox(0F, 0F, 0F, 3, 1, 6, 0F); // Box 59
		bulkheadflatModel[17].setRotationPoint(34F, -2F, -3F);

		bulkheadflatModel[18].addShapeBox(0F, 0F, 0F, 3, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 60
		bulkheadflatModel[18].setRotationPoint(37F, -2F, -3F);

		bulkheadflatModel[19].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 61
		bulkheadflatModel[19].setRotationPoint(41F, 0F, -1F);

		bulkheadflatModel[20].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0F); // Box 62
		bulkheadflatModel[20].setRotationPoint(38F, 0.5F, -0.5F);

		bulkheadflatModel[21].addBox(0F, 0F, 0F, 1, 1, 20, 0F); // Box 63
		bulkheadflatModel[21].setRotationPoint(33F, -2F, -10F);

		bulkheadflatModel[22].addBox(0F, 0F, 0F, 1, 1, 20, 0F); // Box 64
		bulkheadflatModel[22].setRotationPoint(33F, -8F, -10F);

		bulkheadflatModel[23].addBox(0F, 0F, 0F, 1, 1, 20, 0F); // Box 65
		bulkheadflatModel[23].setRotationPoint(33F, -14F, -10F);

		bulkheadflatModel[24].addShapeBox(0F, 0F, 0F, 1, 21, 2, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F); // Box 66
		bulkheadflatModel[24].setRotationPoint(33F, -21F, -1F);

		bulkheadflatModel[25].addBox(0F, 0F, 0F, 2, 21, 22, 0F); // Box 67
		bulkheadflatModel[25].setRotationPoint(31F, -21F, -11F);

		bulkheadflatModel[26].addShapeBox(0F, 0F, 0F, 0, 21, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, -5F, 0F, 0F); // Box 69
		bulkheadflatModel[26].setRotationPoint(33.05F, -21.05F, -10F);

		bulkheadflatModel[27].addBox(0F, 0F, 0F, 62, 2, 22, 0F); // Box 70
		bulkheadflatModel[27].setRotationPoint(-31F, 1F, -11F);

		bulkheadflatModel[28].addBox(0F, 0F, 0F, 62, 1, 24, 0F); // Box 71
		bulkheadflatModel[28].setRotationPoint(-31F, 0F, -12F);

		bulkheadflatModel[29].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 72
		bulkheadflatModel[29].setRotationPoint(-29F, 1F, 11F);

		bulkheadflatModel[30].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 73
		bulkheadflatModel[30].setRotationPoint(-26F, 1F, 11F);

		bulkheadflatModel[31].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 74
		bulkheadflatModel[31].setRotationPoint(-20F, 1F, 11F);

		bulkheadflatModel[32].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 75
		bulkheadflatModel[32].setRotationPoint(-23F, 1F, 11F);

		bulkheadflatModel[33].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 76
		bulkheadflatModel[33].setRotationPoint(-8F, 1F, 11F);

		bulkheadflatModel[34].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 77
		bulkheadflatModel[34].setRotationPoint(-11F, 1F, 11F);

		bulkheadflatModel[35].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 78
		bulkheadflatModel[35].setRotationPoint(-17F, 1F, 11F);

		bulkheadflatModel[36].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 79
		bulkheadflatModel[36].setRotationPoint(-14F, 1F, 11F);

		bulkheadflatModel[37].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 80
		bulkheadflatModel[37].setRotationPoint(16F, 1F, 11F);

		bulkheadflatModel[38].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 81
		bulkheadflatModel[38].setRotationPoint(13F, 1F, 11F);

		bulkheadflatModel[39].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 82
		bulkheadflatModel[39].setRotationPoint(7F, 1F, 11F);

		bulkheadflatModel[40].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 83
		bulkheadflatModel[40].setRotationPoint(10F, 1F, 11F);

		bulkheadflatModel[41].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 84
		bulkheadflatModel[41].setRotationPoint(-5F, 1F, 11F);

		bulkheadflatModel[42].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 85
		bulkheadflatModel[42].setRotationPoint(-2F, 1F, 11F);

		bulkheadflatModel[43].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 86
		bulkheadflatModel[43].setRotationPoint(1F, 1F, 11F);

		bulkheadflatModel[44].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 87
		bulkheadflatModel[44].setRotationPoint(4F, 1F, 11F);

		bulkheadflatModel[45].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 88
		bulkheadflatModel[45].setRotationPoint(28F, 1F, 11F);

		bulkheadflatModel[46].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 89
		bulkheadflatModel[46].setRotationPoint(25F, 1F, 11F);

		bulkheadflatModel[47].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 90
		bulkheadflatModel[47].setRotationPoint(22F, 1F, 11F);

		bulkheadflatModel[48].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 91
		bulkheadflatModel[48].setRotationPoint(19F, 1F, 11F);

		bulkheadflatModel[49].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 92
		bulkheadflatModel[49].setRotationPoint(28F, 1F, -12F);

		bulkheadflatModel[50].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 93
		bulkheadflatModel[50].setRotationPoint(25F, 1F, -12F);

		bulkheadflatModel[51].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 94
		bulkheadflatModel[51].setRotationPoint(22F, 1F, -12F);

		bulkheadflatModel[52].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 95
		bulkheadflatModel[52].setRotationPoint(19F, 1F, -12F);

		bulkheadflatModel[53].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 96
		bulkheadflatModel[53].setRotationPoint(16F, 1F, -12F);

		bulkheadflatModel[54].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 97
		bulkheadflatModel[54].setRotationPoint(13F, 1F, -12F);

		bulkheadflatModel[55].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 98
		bulkheadflatModel[55].setRotationPoint(10F, 1F, -12F);

		bulkheadflatModel[56].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 99
		bulkheadflatModel[56].setRotationPoint(7F, 1F, -12F);

		bulkheadflatModel[57].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 100
		bulkheadflatModel[57].setRotationPoint(4F, 1F, -12F);

		bulkheadflatModel[58].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 101
		bulkheadflatModel[58].setRotationPoint(1F, 1F, -12F);

		bulkheadflatModel[59].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 102
		bulkheadflatModel[59].setRotationPoint(-2F, 1F, -12F);

		bulkheadflatModel[60].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 103
		bulkheadflatModel[60].setRotationPoint(-5F, 1F, -12F);

		bulkheadflatModel[61].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 104
		bulkheadflatModel[61].setRotationPoint(-8F, 1F, -12F);

		bulkheadflatModel[62].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 105
		bulkheadflatModel[62].setRotationPoint(-11F, 1F, -12F);

		bulkheadflatModel[63].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 106
		bulkheadflatModel[63].setRotationPoint(-14F, 1F, -12F);

		bulkheadflatModel[64].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 107
		bulkheadflatModel[64].setRotationPoint(-17F, 1F, -12F);

		bulkheadflatModel[65].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 108
		bulkheadflatModel[65].setRotationPoint(-20F, 1F, -12F);

		bulkheadflatModel[66].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 109
		bulkheadflatModel[66].setRotationPoint(-23F, 1F, -12F);

		bulkheadflatModel[67].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 110
		bulkheadflatModel[67].setRotationPoint(-26F, 1F, -12F);

		bulkheadflatModel[68].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 111
		bulkheadflatModel[68].setRotationPoint(-29F, 1F, -12F);

		bulkheadflatModel[69].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 112
		bulkheadflatModel[69].setRotationPoint(-21.5F, 2F, -12F);

		bulkheadflatModel[70].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 113
		bulkheadflatModel[70].setRotationPoint(20.5F, 2F, -12F);

		bulkheadflatModel[71].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 114
		bulkheadflatModel[71].setRotationPoint(20.5F, 2F, 11F);

		bulkheadflatModel[72].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 115
		bulkheadflatModel[72].setRotationPoint(-21.5F, 2F, 11F);

		bulkheadflatModel[73].addShapeBox(0F, 0F, 0F, 34, 2, 18, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F); // Box 116
		bulkheadflatModel[73].setRotationPoint(-17F, 3F, -9F);

		bulkheadflatModel[74].addShapeBox(0F, 0F, 0F, 30, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F); // Box 117
		bulkheadflatModel[74].setRotationPoint(-15F, 3F, 9F);

		bulkheadflatModel[75].addShapeBox(0F, 0F, 0F, 30, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F); // Box 118
		bulkheadflatModel[75].setRotationPoint(-15F, 3F, -10F);

		bulkheadflatModel[76].addBox(0F, 0F, 0F, 1, 6, 1, 0F); // Box 120
		bulkheadflatModel[76].setRotationPoint(-36.5F, -8F, -0.5F);

		bulkheadflatModel[77].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 121
		bulkheadflatModel[77].setRotationPoint(-37.5F, -8.25F, -0.75F);

		bulkheadflatModel[78].addBox(0F, 0F, 0F, 0, 5, 5, 0F); // Box 122
		bulkheadflatModel[78].setRotationPoint(-37.05F, -10F, -2.5F);

		bulkheadflatModel[79].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 123
		bulkheadflatModel[79].setRotationPoint(38F, 0F, 10F);

		bulkheadflatModel[80].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 124
		bulkheadflatModel[80].setRotationPoint(38F, 0F, -11F);

		bulkheadflatModel[81].addBox(0F, 0F, 0F, 5, 3, 0, 0F); // Box 125
		bulkheadflatModel[81].setRotationPoint(-38F, 2F, 11.05F);

		bulkheadflatModel[82].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 126
		bulkheadflatModel[82].setRotationPoint(-39F, 0F, 10F);

		bulkheadflatModel[83].addShapeBox(0F, 0F, 0F, 0, 21, 1, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 6F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 6F, 0F, 0F); // Box 127
		bulkheadflatModel[83].setRotationPoint(-33F, -21F, 10F);

		bulkheadflatModel[84].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 128
		bulkheadflatModel[84].setRotationPoint(-33F, -1F, 11F);

		bulkheadflatModel[85].addBox(0F, 0F, 0F, 2, 16, 1, 0F); // Box 129
		bulkheadflatModel[85].setRotationPoint(-33F, -17F, 11F);

		bulkheadflatModel[86].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 130
		bulkheadflatModel[86].setRotationPoint(-33F, -21F, 11F);

		bulkheadflatModel[87].addBox(0F, 0F, 0F, 3, 1, 22, 0F); // Box 131
		bulkheadflatModel[87].setRotationPoint(-34F, -22F, -11F);

		bulkheadflatModel[88].addShapeBox(0F, 0F, 0F, 1, 21, 6, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F); // Box 132
		bulkheadflatModel[88].setRotationPoint(-34F, -21F, 5F);

		bulkheadflatModel[89].addBox(0F, 0F, 0F, 1, 1, 20, 0F); // Box 133
		bulkheadflatModel[89].setRotationPoint(-34F, -8F, -10F);

		bulkheadflatModel[90].addBox(0F, 0F, 0F, 1, 1, 20, 0F); // Box 134
		bulkheadflatModel[90].setRotationPoint(-34F, -14F, -10F);

		bulkheadflatModel[91].addShapeBox(0F, 0F, 0F, 1, 21, 2, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F); // Box 135
		bulkheadflatModel[91].setRotationPoint(-34F, -21F, -1F);

		bulkheadflatModel[92].addBox(0F, 0F, 0F, 2, 16, 1, 0F); // Box 136
		bulkheadflatModel[92].setRotationPoint(-33F, -17F, -12F);

		bulkheadflatModel[93].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 137
		bulkheadflatModel[93].setRotationPoint(-33F, -21F, -12F);

		bulkheadflatModel[94].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 138
		bulkheadflatModel[94].setRotationPoint(-33F, -1F, -12F);

		bulkheadflatModel[95].addShapeBox(0F, 0F, 0F, 1, 21, 6, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F); // Box 139
		bulkheadflatModel[95].setRotationPoint(-34F, -21F, -11F);

		bulkheadflatModel[96].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 140
		bulkheadflatModel[96].setRotationPoint(-39F, 0F, -11F);

		bulkheadflatModel[97].addShapeBox(0F, 0F, 0F, 0, 21, 1, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 6F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 6F, 0F, 0F); // Box 141
		bulkheadflatModel[97].setRotationPoint(-33F, -21F, -11F);

		bulkheadflatModel[98].addBox(0F, 0F, 0F, 0, 3, 5, 0F); // Box 142
		bulkheadflatModel[98].setRotationPoint(-38.05F, -0.0499999999999972F, -10F);

		bulkheadflatModel[99].addBox(0F, 0F, 0F, 7, 3, 22, 0F); // Box 144
		bulkheadflatModel[99].setRotationPoint(-38F, 0F, -11F);

		bulkheadflatModel[100].addBox(0F, 0F, 0F, 0, 3, 5, 0F); // Box 145
		bulkheadflatModel[100].setRotationPoint(-38.05F, -0.0499999999999972F, 5F);

		bulkheadflatModel[101].addShapeBox(0F, 0F, 0F, 0, 21, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 5F, 0F, 0F); // Box 146
		bulkheadflatModel[101].setRotationPoint(-33.05F, -21.05F, 5F);

		bulkheadflatModel[102].addBox(0F, 0F, 0F, 3, 1, 6, 0F); // Box 147
		bulkheadflatModel[102].setRotationPoint(-37F, -2F, -3F);

		bulkheadflatModel[103].addBox(0F, 0F, 0F, 1, 1, 20, 0F); // Box 148
		bulkheadflatModel[103].setRotationPoint(-34F, -2F, -10F);

		bulkheadflatModel[104].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Box 149
		bulkheadflatModel[104].setRotationPoint(-37F, -1F, -3F);

		bulkheadflatModel[105].addShapeBox(0F, 0F, 0F, 3, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 150
		bulkheadflatModel[105].setRotationPoint(-40F, -2F, -3F);

		bulkheadflatModel[106].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.5F); // Box 151
		bulkheadflatModel[106].setRotationPoint(-41F, 0.5F, -0.5F);

		bulkheadflatModel[107].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 152
		bulkheadflatModel[107].setRotationPoint(-43F, 0F, -1F);

		bulkheadflatModel[108].addBox(0F, 0F, 0F, 5, 3, 0, 0F); // Box 153
		bulkheadflatModel[108].setRotationPoint(-38F, 2F, -11.05F);

		bulkheadflatModel[109].addBox(0F, 0F, 0F, 2, 21, 22, 0F); // Box 154
		bulkheadflatModel[109].setRotationPoint(-33F, -21F, -11F);

		bulkheadflatModel[110].addShapeBox(0F, 0F, 0F, 0, 21, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, -5F, 0F, 0F); // Box 112
		bulkheadflatModel[110].setRotationPoint(33.05F, -21.05F, 5F);

		bulkheadflatModel[111].addShapeBox(0F, 0F, 0F, 0, 21, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 5F, 0F, 0F); // Box 113
		bulkheadflatModel[111].setRotationPoint(-33.05F, -21.05F, -10F);


	}

	private ModelWellcarBogie trucks = new ModelWellcarBogie();

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		for(int i = 0; i < 112; i++)
		{
			bulkheadflatModel[i].render(f5);
		}
		Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/wellcar_bogie.png"));
		GL11.glPushMatrix();
		GL11.glTranslated(-1.8,0.16,-0.35);
		GL11.glScalef(1.1f,1.1f,0.9f);
		trucks.render(entity,f,f1,f2,f3,f4,f5);
		GL11.glPopMatrix();

		GL11.glPushMatrix();
		GL11.glTranslated(1.6,0.15,-0.35);
		GL11.glScalef(1.1f,1.1f,0.9f);
		trucks.render(entity,f,f1,f2,f3,f4,f5);
		GL11.glPopMatrix();
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
	{
	}

	public ModelRendererTurbo bulkheadflatModel[];
}