//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2017 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator:
// Created on:17.11.2017 - 22:21:03
// Last changed on: 17.11.2017 - 22:21:03

package train.client.render.models;

import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import tmt.ModelBase;
import tmt.ModelRendererTurbo;
import tmt.Tessellator;
import train.common.library.Info;

public class ModelSnowPlow extends ModelBase
{
	int textureX = 512;
	int textureY = 256;

	public ModelSnowPlow()
	{
		snowplowModel = new ModelRendererTurbo[120];
		snowplowModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		snowplowModel[1] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 1
		snowplowModel[2] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 3
		snowplowModel[3] = new ModelRendererTurbo(this, 249, 25, textureX, textureY); // Box 4
		snowplowModel[4] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 5
		snowplowModel[5] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 6
		snowplowModel[6] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 7
		snowplowModel[7] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 8
		snowplowModel[8] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 9
		snowplowModel[9] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 10
		snowplowModel[10] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 12
		snowplowModel[11] = new ModelRendererTurbo(this, 33, 33, textureX, textureY); // Box 13
		snowplowModel[12] = new ModelRendererTurbo(this, 249, 25, textureX, textureY); // Box 14
		snowplowModel[13] = new ModelRendererTurbo(this, 473, 17, textureX, textureY); // Box 15
		snowplowModel[14] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 16
		snowplowModel[15] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 17
		snowplowModel[16] = new ModelRendererTurbo(this, 193, 17, textureX, textureY); // Box 18
		snowplowModel[17] = new ModelRendererTurbo(this, 489, 9, textureX, textureY); // Box 19
		snowplowModel[18] = new ModelRendererTurbo(this, 33, 33, textureX, textureY); // Box 20
		snowplowModel[19] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 21
		snowplowModel[20] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 22
		snowplowModel[21] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 23
		snowplowModel[22] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 24
		snowplowModel[23] = new ModelRendererTurbo(this, 225, 9, textureX, textureY); // Box 25
		snowplowModel[24] = new ModelRendererTurbo(this, 433, 25, textureX, textureY); // Box 26
		snowplowModel[25] = new ModelRendererTurbo(this, 449, 9, textureX, textureY); // Box 27
		snowplowModel[26] = new ModelRendererTurbo(this, 497, 17, textureX, textureY); // Box 28
		snowplowModel[27] = new ModelRendererTurbo(this, 65, 33, textureX, textureY); // Box 30
		snowplowModel[28] = new ModelRendererTurbo(this, 105, 33, textureX, textureY); // Box 32
		snowplowModel[29] = new ModelRendererTurbo(this, 113, 33, textureX, textureY); // Box 33
		snowplowModel[30] = new ModelRendererTurbo(this, 145, 33, textureX, textureY); // Box 35
		snowplowModel[31] = new ModelRendererTurbo(this, 161, 33, textureX, textureY); // Box 36
		snowplowModel[32] = new ModelRendererTurbo(this, 409, 9, textureX, textureY); // Box 37
		snowplowModel[33] = new ModelRendererTurbo(this, 225, 25, textureX, textureY); // Box 39
		snowplowModel[34] = new ModelRendererTurbo(this, 433, 41, textureX, textureY); // Box 40
		snowplowModel[35] = new ModelRendererTurbo(this, 65, 49, textureX, textureY); // Box 41
		snowplowModel[36] = new ModelRendererTurbo(this, 33, 41, textureX, textureY); // Box 43
		snowplowModel[37] = new ModelRendererTurbo(this, 249, 49, textureX, textureY); // Box 44
		snowplowModel[38] = new ModelRendererTurbo(this, 241, 25, textureX, textureY); // Box 45
		snowplowModel[39] = new ModelRendererTurbo(this, 89, 33, textureX, textureY); // Box 46
		snowplowModel[40] = new ModelRendererTurbo(this, 265, 49, textureX, textureY); // Box 47
		snowplowModel[41] = new ModelRendererTurbo(this, 281, 49, textureX, textureY); // Box 48
		snowplowModel[42] = new ModelRendererTurbo(this, 177, 33, textureX, textureY); // Box 49
		snowplowModel[43] = new ModelRendererTurbo(this, 505, 33, textureX, textureY); // Box 50
		snowplowModel[44] = new ModelRendererTurbo(this, 273, 49, textureX, textureY); // Box 45
		snowplowModel[45] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 46
		snowplowModel[46] = new ModelRendererTurbo(this, 417, 17, textureX, textureY); // Box 47
		snowplowModel[47] = new ModelRendererTurbo(this, 65, 33, textureX, textureY); // Box 48
		snowplowModel[48] = new ModelRendererTurbo(this, 105, 33, textureX, textureY); // Box 49
		snowplowModel[49] = new ModelRendererTurbo(this, 129, 33, textureX, textureY); // Box 50
		snowplowModel[50] = new ModelRendererTurbo(this, 465, 49, textureX, textureY); // Box 51
		snowplowModel[51] = new ModelRendererTurbo(this, 489, 49, textureX, textureY); // Box 52
		snowplowModel[52] = new ModelRendererTurbo(this, 129, 49, textureX, textureY); // Box 53
		snowplowModel[53] = new ModelRendererTurbo(this, 89, 57, textureX, textureY); // Box 54
		snowplowModel[54] = new ModelRendererTurbo(this, 105, 57, textureX, textureY); // Box 55
		snowplowModel[55] = new ModelRendererTurbo(this, 89, 41, textureX, textureY); // Box 56
		snowplowModel[56] = new ModelRendererTurbo(this, 121, 57, textureX, textureY); // Box 57
		snowplowModel[57] = new ModelRendererTurbo(this, 185, 57, textureX, textureY); // Box 58
		snowplowModel[58] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 59
		snowplowModel[59] = new ModelRendererTurbo(this, 225, 65, textureX, textureY); // Box 60
		snowplowModel[60] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 61
		snowplowModel[61] = new ModelRendererTurbo(this, 217, 81, textureX, textureY); // Box 62
		snowplowModel[62] = new ModelRendererTurbo(this, 297, 81, textureX, textureY); // Box 63
		snowplowModel[63] = new ModelRendererTurbo(this, 65, 65, textureX, textureY); // Box 64
		snowplowModel[64] = new ModelRendererTurbo(this, 465, 57, textureX, textureY); // Box 65
		snowplowModel[65] = new ModelRendererTurbo(this, 369, 81, textureX, textureY); // Box 66
		snowplowModel[66] = new ModelRendererTurbo(this, 497, 33, textureX, textureY); // Box 67
		snowplowModel[67] = new ModelRendererTurbo(this, 49, 41, textureX, textureY); // Box 68
		snowplowModel[68] = new ModelRendererTurbo(this, 233, 25, textureX, textureY); // Box 69
		snowplowModel[69] = new ModelRendererTurbo(this, 49, 49, textureX, textureY); // Box 70
		snowplowModel[70] = new ModelRendererTurbo(this, 161, 57, textureX, textureY); // Box 71
		snowplowModel[71] = new ModelRendererTurbo(this, 177, 49, textureX, textureY); // Box 72
		snowplowModel[72] = new ModelRendererTurbo(this, 177, 57, textureX, textureY); // Box 73
		snowplowModel[73] = new ModelRendererTurbo(this, 481, 73, textureX, textureY); // Box 74
		snowplowModel[74] = new ModelRendererTurbo(this, 81, 80, textureX, textureY); // Box 75
		snowplowModel[75] = new ModelRendererTurbo(this, 225, 73, textureX, textureY); // Box 76
		snowplowModel[76] = new ModelRendererTurbo(this, 217, 57, textureX, textureY); // Box 77
		snowplowModel[77] = new ModelRendererTurbo(this, 65, 41, textureX, textureY); // Box 78
		snowplowModel[78] = new ModelRendererTurbo(this, 497, 57, textureX, textureY); // Box 79
		snowplowModel[79] = new ModelRendererTurbo(this, 97, 65, textureX, textureY); // Box 80
		snowplowModel[80] = new ModelRendererTurbo(this, 33, 33, textureX, textureY); // Box 81
		snowplowModel[81] = new ModelRendererTurbo(this, 73, 33, textureX, textureY); // Box 82
		snowplowModel[82] = new ModelRendererTurbo(this, 113, 33, textureX, textureY); // Box 83
		snowplowModel[83] = new ModelRendererTurbo(this, 137, 33, textureX, textureY); // Box 84
		snowplowModel[84] = new ModelRendererTurbo(this, 505, 49, textureX, textureY); // Box 85
		snowplowModel[85] = new ModelRendererTurbo(this, 409, 81, textureX, textureY); // Box 86
		snowplowModel[86] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 87
		snowplowModel[87] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 88
		snowplowModel[88] = new ModelRendererTurbo(this, 73, 41, textureX, textureY); // Box 89
		snowplowModel[89] = new ModelRendererTurbo(this, 177, 97, textureX, textureY); // Box 90
		snowplowModel[90] = new ModelRendererTurbo(this, 345, 97, textureX, textureY); // Box 91
		snowplowModel[91] = new ModelRendererTurbo(this, 185, 89, textureX, textureY); // Box 92
		snowplowModel[92] = new ModelRendererTurbo(this, 417, 89, textureX, textureY); // Box 93
		snowplowModel[93] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 94
		snowplowModel[94] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Box 95
		snowplowModel[95] = new ModelRendererTurbo(this, 449, 89, textureX, textureY); // Box 96
		snowplowModel[96] = new ModelRendererTurbo(this, 233, 57, textureX, textureY); // Box 97
		snowplowModel[97] = new ModelRendererTurbo(this, 281, 81, textureX, textureY); // Box 98
		snowplowModel[98] = new ModelRendererTurbo(this, 241, 57, textureX, textureY); // Box 99
		snowplowModel[99] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 100
		snowplowModel[100] = new ModelRendererTurbo(this, 33, 97, textureX, textureY); // Box 101
		snowplowModel[101] = new ModelRendererTurbo(this, 265, 73, textureX, textureY); // Box 102
		snowplowModel[102] = new ModelRendererTurbo(this, 57, 89, textureX, textureY); // Box 103
		snowplowModel[103] = new ModelRendererTurbo(this, 97, 81, textureX, textureY); // Box 104
		snowplowModel[104] = new ModelRendererTurbo(this, 169, 113, textureX, textureY); // Box 105
		snowplowModel[105] = new ModelRendererTurbo(this, 177, 113, textureX, textureY); // Box 106
		snowplowModel[106] = new ModelRendererTurbo(this, 105, 81, textureX, textureY); // Box 107
		snowplowModel[107] = new ModelRendererTurbo(this, 209, 113, textureX, textureY); // Box 108
		snowplowModel[108] = new ModelRendererTurbo(this, 217, 113, textureX, textureY); // Box 109
		snowplowModel[109] = new ModelRendererTurbo(this, 249, 113, textureX, textureY); // Box 110
		snowplowModel[110] = new ModelRendererTurbo(this, 465, 81, textureX, textureY); // Box 111
		snowplowModel[111] = new ModelRendererTurbo(this, 489, 89, textureX, textureY); // Box 112
		snowplowModel[112] = new ModelRendererTurbo(this, 217, 113, textureX, textureY); // Box 113
		snowplowModel[113] = new ModelRendererTurbo(this, 241, 113, textureX, textureY); // Box 114
		snowplowModel[114] = new ModelRendererTurbo(this, 273, 113, textureX, textureY); // Box 115
		snowplowModel[115] = new ModelRendererTurbo(this, 289, 113, textureX, textureY); // Box 116
		snowplowModel[116] = new ModelRendererTurbo(this, 305, 113, textureX, textureY); // Box 117
		snowplowModel[117] = new ModelRendererTurbo(this, 321, 113, textureX, textureY); // Box 118
		snowplowModel[118] = new ModelRendererTurbo(this, 337, 113, textureX, textureY); // Box 119
		snowplowModel[119] = new ModelRendererTurbo(this, 353, 113, textureX, textureY); // Box 120

		snowplowModel[0].addBox(0F, 0F, 0F, 80, 1, 24, 0F); // Box 0
		snowplowModel[0].setRotationPoint(-38F, 1F, -12F);

		snowplowModel[1].addBox(0F, 0F, 0F, 1, 22, 30, 0F); // Box 1
		snowplowModel[1].setRotationPoint(-39F, -22F, -15F);

		snowplowModel[2].addShapeBox(0F, 0F, 0F, 81, 1, 16, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		snowplowModel[2].setRotationPoint(-39F, -25F, -8F);

		snowplowModel[3].addShapeBox(0F, 0F, 0F, 80, 2, 20, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F); // Box 4
		snowplowModel[3].setRotationPoint(-38F, 2F, -10F);

		snowplowModel[4].addShapeBox(0F, 0F, 0F, 7, 3, 2, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, -4F, 0F, 0F, -1F); // Box 5
		snowplowModel[4].setRotationPoint(-46F, 6F, 11F);

		snowplowModel[5].addShapeBox(0F, 0F, 0F, 1, 6, 30, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 6
		snowplowModel[5].setRotationPoint(-39F, 0F, -15F);

		snowplowModel[6].addShapeBox(0F, 0F, 0F, 1, 3, 26, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F); // Box 7
		snowplowModel[6].setRotationPoint(-39F, 6F, -13F);

		snowplowModel[7].addShapeBox(0F, 0F, 0F, 7, 6, 2, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, -1F); // Box 8
		snowplowModel[7].setRotationPoint(-46F, 0F, 14F);

		snowplowModel[8].addShapeBox(0F, 0F, 0F, 7, 14, 2, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 2F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 2F); // Box 9
		snowplowModel[8].setRotationPoint(-46F, -14F, 14F);

		snowplowModel[9].addShapeBox(0F, 0F, 0F, 7, 6, 2, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 2F); // Box 10
		snowplowModel[9].setRotationPoint(-46F, -20F, 14F);

		snowplowModel[10].addShapeBox(0F, 0F, 0F, 7, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, -5F, 0F, 0F, -1F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F); // Box 12
		snowplowModel[10].setRotationPoint(-46F, -23F, 11F);

		snowplowModel[11].addShapeBox(0F, 0F, 0F, 2, 1, 24, 0F, 0F, 0F, -2F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 13
		snowplowModel[11].setRotationPoint(-46F, -24F, -12F);

		snowplowModel[12].addShapeBox(0F, 0F, 0F, 7, 14, 2, 0F, 0F, 0F, 2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 14
		snowplowModel[12].setRotationPoint(-46F, -14F, -16F);

		snowplowModel[13].addShapeBox(0F, 0F, 0F, 7, 6, 2, 0F, 0F, 0F, 2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 0F); // Box 15
		snowplowModel[13].setRotationPoint(-46F, 0F, -16F);

		snowplowModel[14].addShapeBox(0F, 0F, 0F, 7, 3, 2, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, -4F, 0F, 0F, 3F, 0F, 0F, 0F); // Box 16
		snowplowModel[14].setRotationPoint(-46F, 6F, -13F);

		snowplowModel[15].addShapeBox(0F, 0F, 0F, 7, 6, 2, 0F, 0F, 0F, -1F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 17
		snowplowModel[15].setRotationPoint(-46F, -20F, -16F);

		snowplowModel[16].addShapeBox(0F, 0F, 0F, 7, 3, 2, 0F, 0F, 0F, -1F, 0F, 0F, -5F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 18
		snowplowModel[16].setRotationPoint(-46F, -23F, -13F);

		snowplowModel[17].addShapeBox(0F, 0F, 0F, 5, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 19
		snowplowModel[17].setRotationPoint(-44F, -24F, 5F);

		snowplowModel[18].addShapeBox(0F, 0F, 0F, 5, 1, 6, 0F, 0F, 0F, -2F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 20
		snowplowModel[18].setRotationPoint(-44F, -24F, -11F);

		snowplowModel[19].addShapeBox(0F, 0F, 0F, 5, 4, 1, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 21
		snowplowModel[19].setRotationPoint(-44F, -28F, -5F);

		snowplowModel[20].addBox(0F, 0F, 0F, 5, 1, 1, 0F); // Box 22
		snowplowModel[20].setRotationPoint(-44F, -24F, -5F);

		snowplowModel[21].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 23
		snowplowModel[21].setRotationPoint(-47F, -26F, -1F);

		snowplowModel[22].addShapeBox(0F, 0F, 0F, 5, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 24
		snowplowModel[22].setRotationPoint(-38F, 4F, -5F);

		snowplowModel[23].addShapeBox(0F, 0F, 0F, 5, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 25
		snowplowModel[23].setRotationPoint(-38F, 4F, 4F);

		snowplowModel[24].addBox(0F, 0F, 0F, 10, 2, 2, 0F); // Box 26
		snowplowModel[24].setRotationPoint(-44F, -8F, -1F);

		snowplowModel[25].addShapeBox(0F, 0F, 0F, 4, 13, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 8F, 0F, 0F, 8F); // Box 27
		snowplowModel[25].setRotationPoint(-43F, -6F, 0F);

		snowplowModel[26].addShapeBox(0F, 0F, 0F, 4, 13, 1, 0F, 0F, 0F, 8F, 0F, 0F, 8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 28
		snowplowModel[26].setRotationPoint(-43F, -21F, -1F);

		snowplowModel[27].addShapeBox(0F, 0F, 0F, 4, 1, 13, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 2F, 0F); // Box 30
		snowplowModel[27].setRotationPoint(-43F, -8F, 1F);

		snowplowModel[28].addShapeBox(0F, 0F, 0F, 4, 1, 13, 0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 32
		snowplowModel[28].setRotationPoint(-43F, -7F, -14F);

		snowplowModel[29].addBox(0F, 0F, 0F, 0, 32, 32, 0F); // Box 33
		snowplowModel[29].setRotationPoint(-42F, -23F, -16F);

		snowplowModel[30].addShapeBox(0F, 0F, 0F, 5, 17, 2, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 35
		snowplowModel[30].setRotationPoint(-38F, -19F, -14F);

		snowplowModel[31].addShapeBox(0F, 0F, 0F, 5, 17, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 36
		snowplowModel[31].setRotationPoint(-38F, -19F, 12F);

		snowplowModel[32].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 37
		snowplowModel[32].setRotationPoint(-21F, 4F, -1F);

		snowplowModel[33].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 39
		snowplowModel[33].setRotationPoint(29F, 4F, -1F);

		snowplowModel[34].addBox(0F, 0F, 0F, 35, 3, 0, 0F); // Box 40
		snowplowModel[34].setRotationPoint(-12F, 4F, -3F);

		snowplowModel[35].addBox(0F, 0F, 0F, 35, 3, 0, 0F); // Box 41
		snowplowModel[35].setRotationPoint(-12F, 4F, 3F);

		snowplowModel[36].addShapeBox(0F, 0F, 0F, 5, 12, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 43
		snowplowModel[36].setRotationPoint(-21F, -26F, 0F);

		snowplowModel[37].addShapeBox(0F, 0F, 0F, 5, 12, 2, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 44
		snowplowModel[37].setRotationPoint(-21F, -26F, -2F);

		snowplowModel[38].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 45
		snowplowModel[38].setRotationPoint(-36F, -27F, 0F);

		snowplowModel[39].addShapeBox(0F, 0F, 0F, 5, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 46
		snowplowModel[39].setRotationPoint(40F, 3F, -1F);

		snowplowModel[40].addShapeBox(0F, 0F, 0F, 4, 13, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 12F, 0F, -3F, 12F, 0F, -3F, -13F, 0F, -3F, -12F); // Box 47
		snowplowModel[40].setRotationPoint(-43F, -6F, -1F);

		snowplowModel[41].addShapeBox(0F, 0F, 0F, 4, 13, 1, 0F, 0F, -1F, -9F, 0F, -1F, -9F, 0F, -1F, 9F, 0F, -1F, 9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 48
		snowplowModel[41].setRotationPoint(-43F, -20F, 0F);

		snowplowModel[42].addBox(0F, 0F, 0F, 1, 14, 1, 0F); // Box 49
		snowplowModel[42].setRotationPoint(-43F, -22F, 0F);

		snowplowModel[43].addBox(0F, 0F, 0F, 1, 14, 1, 0F); // Box 50
		snowplowModel[43].setRotationPoint(-43F, -6F, -1F);

		snowplowModel[44].addShapeBox(0F, 0F, 0F, 81, 2, 24, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 45
		snowplowModel[44].setRotationPoint(-39F, -24F, -12F);

		snowplowModel[45].addBox(0F, 0F, 0F, 5, 3, 3, 0F); // Box 46
		snowplowModel[45].setRotationPoint(-26F, -4F, 5F);

		snowplowModel[46].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F); // Box 47
		snowplowModel[46].setRotationPoint(-26F, -1F, 5F);

		snowplowModel[47].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F); // Box 48
		snowplowModel[47].setRotationPoint(-22F, -1F, 5F);

		snowplowModel[48].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F); // Box 49
		snowplowModel[48].setRotationPoint(-22F, -1F, -7F);

		snowplowModel[49].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F); // Box 50
		snowplowModel[49].setRotationPoint(-26F, -1F, -7F);

		snowplowModel[50].addBox(0F, 0F, 0F, 5, 3, 3, 0F); // Box 51
		snowplowModel[50].setRotationPoint(-26F, -4F, -7F);

		snowplowModel[51].addBox(0F, 0F, 0F, 2, 9, 2, 0F); // Box 52
		snowplowModel[51].setRotationPoint(-34F, -8F, -1F);

		snowplowModel[52].addShapeBox(0F, 0F, 0F, 2, 2, 11, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F); // Box 53
		snowplowModel[52].setRotationPoint(-34F, -4F, -5F);

		snowplowModel[53].addBox(0F, 0F, 0F, 6, 6, 0, 0F); // Box 54
		snowplowModel[53].setRotationPoint(-36F, -6F, -5F);

		snowplowModel[54].addBox(0F, 0F, 0F, 6, 6, 0, 0F); // Box 55
		snowplowModel[54].setRotationPoint(-36F, -6F, 6F);

		snowplowModel[55].addBox(0F, 0F, 0F, 6, 1, 1, 0F); // Box 56
		snowplowModel[55].setRotationPoint(-32F, -3F, 6F);

		snowplowModel[56].addBox(0F, 0F, 0F, 8, 1, 1, 0F); // Box 57
		snowplowModel[56].setRotationPoint(-34F, -3F, -6F);

		snowplowModel[57].addBox(0F, 0F, 0F, 9, 15, 10, 0F); // Box 58
		snowplowModel[57].setRotationPoint(4F, -15F, -5F);

		snowplowModel[58].addShapeBox(0F, 0F, 0F, 26, 1, 6, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 59
		snowplowModel[58].setRotationPoint(-22F, -15F, -3F);

		snowplowModel[59].addShapeBox(0F, 0F, 0F, 26, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 60
		snowplowModel[59].setRotationPoint(-22F, -8F, -3F);

		snowplowModel[60].addShapeBox(0F, 0F, 2F, 26, 1, 10, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 61
		snowplowModel[60].setRotationPoint(-22F, -9F, -7F);

		snowplowModel[61].addShapeBox(0F, 0F, 2F, 26, 1, 10, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 62
		snowplowModel[61].setRotationPoint(-22F, -14F, -7F);

		snowplowModel[62].addBox(0F, 0F, 0F, 26, 4, 8, 0F); // Box 63
		snowplowModel[62].setRotationPoint(-22F, -13F, -4F);

		snowplowModel[63].addShapeBox(0F, 0F, 2F, 9, 1, 12, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 64
		snowplowModel[63].setRotationPoint(4F, -16F, -8F);

		snowplowModel[64].addBox(0F, 0F, 0F, 6, 6, 6, 0F); // Box 65
		snowplowModel[64].setRotationPoint(35F, -5F, 5F);

		snowplowModel[65].addBox(0F, 0F, 0F, 16, 2, 6, 0F); // Box 66
		snowplowModel[65].setRotationPoint(24F, -2F, -11F);

		snowplowModel[66].addBox(0F, 0F, 0F, 1, 5, 1, 0F); // Box 67
		snowplowModel[66].setRotationPoint(23F, -4F, -6F);

		snowplowModel[67].addBox(0F, 0F, 0F, 1, 5, 1, 0F); // Box 68
		snowplowModel[67].setRotationPoint(23F, -4F, -11F);

		snowplowModel[68].addBox(0F, 0F, 0F, 1, 1, 4, 0F); // Box 69
		snowplowModel[68].setRotationPoint(23F, -2F, -10F);

		snowplowModel[69].addBox(0F, 0F, 0F, 1, 5, 1, 0F); // Box 70
		snowplowModel[69].setRotationPoint(40F, -4F, -11F);

		snowplowModel[70].addBox(0F, 0F, 0F, 1, 3, 4, 0F); // Box 71
		snowplowModel[70].setRotationPoint(40F, -3F, -10F);

		snowplowModel[71].addBox(0F, 0F, 0F, 1, 5, 1, 0F); // Box 72
		snowplowModel[71].setRotationPoint(40F, -4F, -6F);

		snowplowModel[72].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F, 0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, 0.4F, -0.4F, 0F, 0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0.4F, 0F, 0F); // Box 73
		snowplowModel[72].setRotationPoint(38F, -3F, -10F);

		snowplowModel[73].addBox(0F, 0F, 0F, 6, 6, 6, 0F); // Box 74
		snowplowModel[73].setRotationPoint(28F, -5F, 5F);

		snowplowModel[74].addBox(0F, 0F, 0F, 2, 21, 2, 0F); // Box 75
		snowplowModel[74].setRotationPoint(30F, -26F, 8F);

		snowplowModel[75].addBox(0F, 0F, 0F, 11, 1, 6, 0F); // Box 76
		snowplowModel[75].setRotationPoint(17F, -5F, 5F);

		snowplowModel[76].addBox(0F, 0F, 0F, 1, 5, 4, 0F); // Box 77
		snowplowModel[76].setRotationPoint(18F, -4F, 6F);

		snowplowModel[77].addBox(0F, 0F, 0F, 2, 1, 3, 0F); // Box 78
		snowplowModel[77].setRotationPoint(19F, -6F, 6F);
		snowplowModel[77].rotateAngleY = 0.55850536F;

		snowplowModel[78].addBox(0F, 0F, 0F, 1, 5, 4, 0F); // Box 79
		snowplowModel[78].setRotationPoint(13F, -7F, -2F);

		snowplowModel[79].addBox(0F, 0F, 0F, 2, 8, 2, 0F); // Box 80
		snowplowModel[79].setRotationPoint(-20F, -7F, -1F);

		snowplowModel[80].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 81
		snowplowModel[80].setRotationPoint(11F, 0F, -4F);

		snowplowModel[81].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 82
		snowplowModel[81].setRotationPoint(11F, 0F, 3F);

		snowplowModel[82].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 83
		snowplowModel[82].setRotationPoint(5F, 0F, 3F);

		snowplowModel[83].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 84
		snowplowModel[83].setRotationPoint(5F, 0F, -4F);

		snowplowModel[84].addBox(0F, 0F, 0F, 1, 7, 1, 0F); // Box 85
		snowplowModel[84].setRotationPoint(1F, -11F, -5F);

		snowplowModel[85].addBox(0F, 0F, 0F, 23, 1, 1, 0F); // Box 86
		snowplowModel[85].setRotationPoint(-21F, -4F, -5F);

		snowplowModel[86].addBox(0F, 0F, 0F, 23, 1, 1, 0F); // Box 87
		snowplowModel[86].setRotationPoint(-21F, -4F, 5F);

		snowplowModel[87].addBox(0F, 0F, 0F, 1, 7, 1, 0F); // Box 88
		snowplowModel[87].setRotationPoint(1F, -11F, 5F);

		snowplowModel[88].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 89
		snowplowModel[88].setRotationPoint(1F, -11F, 4F);

		snowplowModel[89].addBox(0F, 0F, 0F, 80, 12, 1, 0F); // Box 90
		snowplowModel[89].setRotationPoint(-38F, -11F, 11F);

		snowplowModel[90].addBox(0F, 0F, 0F, 80, 12, 1, 0F); // Box 91
		snowplowModel[90].setRotationPoint(-38F, -11F, -12F);

		snowplowModel[91].addBox(0F, 0F, 0F, 11, 6, 1, 0F); // Box 92
		snowplowModel[91].setRotationPoint(-38F, -17F, -12F);

		snowplowModel[92].addBox(0F, 0F, 0F, 11, 6, 1, 0F); // Box 93
		snowplowModel[92].setRotationPoint(-38F, -17F, 11F);

		snowplowModel[93].addBox(0F, 0F, 0F, 80, 5, 1, 0F); // Box 94
		snowplowModel[93].setRotationPoint(-38F, -22F, 11F);

		snowplowModel[94].addBox(0F, 0F, 0F, 80, 5, 1, 0F); // Box 95
		snowplowModel[94].setRotationPoint(-38F, -22F, -12F);

		snowplowModel[95].addBox(0F, 0F, 0F, 18, 6, 1, 0F); // Box 96
		snowplowModel[95].setRotationPoint(-22F, -17F, 11F);

		snowplowModel[96].addBox(0F, 0F, 0F, 1, 6, 1, 0F); // Box 97
		snowplowModel[96].setRotationPoint(2F, -17F, 11F);

		snowplowModel[97].addBox(0F, 0F, 0F, 9, 6, 1, 0F); // Box 98
		snowplowModel[97].setRotationPoint(9F, -17F, 11F);

		snowplowModel[98].addBox(0F, 0F, 0F, 1, 6, 1, 0F); // Box 99
		snowplowModel[98].setRotationPoint(24F, -17F, 11F);

		snowplowModel[99].addBox(0F, 0F, 0F, 11, 6, 1, 0F); // Box 100
		snowplowModel[99].setRotationPoint(31F, -17F, 11F);

		snowplowModel[100].addBox(0F, 0F, 0F, 18, 6, 1, 0F); // Box 101
		snowplowModel[100].setRotationPoint(-22F, -17F, -12F);

		snowplowModel[101].addBox(0F, 0F, 0F, 1, 6, 1, 0F); // Box 102
		snowplowModel[101].setRotationPoint(2F, -17F, -12F);

		snowplowModel[102].addBox(0F, 0F, 0F, 9, 6, 1, 0F); // Box 103
		snowplowModel[102].setRotationPoint(9F, -17F, -12F);

		snowplowModel[103].addBox(0F, 0F, 0F, 1, 6, 1, 0F); // Box 104
		snowplowModel[103].setRotationPoint(24F, -17F, -12F);

		snowplowModel[104].addBox(0F, 0F, 0F, 11, 6, 1, 0F); // Box 105
		snowplowModel[104].setRotationPoint(31F, -17F, -12F);

		snowplowModel[105].addBox(0F, 0F, 0F, 1, 23, 22, 0F); // Box 106
		snowplowModel[105].setRotationPoint(41F, -22F, -11F);

		snowplowModel[106].addBox(0F, 0F, 0F, 2, 16, 1, 0F); // Box 107
		snowplowModel[106].setRotationPoint(42F, -19F, 5F);

		snowplowModel[107].addBox(0F, 0F, 0F, 2, 16, 1, 0F); // Box 108
		snowplowModel[107].setRotationPoint(42F, -19F, -6F);

		snowplowModel[108].addShapeBox(0F, 0F, 0F, 2, 1, 12, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 109
		snowplowModel[108].setRotationPoint(42F, -20F, -6F);

		snowplowModel[109].addShapeBox(0F, 0F, 0F, 2, 1, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 110
		snowplowModel[109].setRotationPoint(42F, -3F, -6F);

		snowplowModel[110].addBox(0F, 0F, 0F, 6, 6, 0, 0F); // Box 111
		snowplowModel[110].setRotationPoint(3F, -17F, 11F);

		snowplowModel[111].addBox(0F, 0F, 0F, 6, 6, 0, 0F); // Box 112
		snowplowModel[111].setRotationPoint(-4F, -17F, 11F);

		snowplowModel[112].addBox(0F, 0F, 0F, 5, 6, 0, 0F); // Box 113
		snowplowModel[112].setRotationPoint(-27F, -17F, 11F);

		snowplowModel[113].addBox(0F, 0F, 0F, 6, 6, 0, 0F); // Box 114
		snowplowModel[113].setRotationPoint(18F, -17F, 11F);

		snowplowModel[114].addBox(0F, 0F, 0F, 6, 6, 0, 0F); // Box 115
		snowplowModel[114].setRotationPoint(25F, -17F, 11F);

		snowplowModel[115].addBox(0F, 0F, 0F, 6, 6, 0, 0F); // Box 116
		snowplowModel[115].setRotationPoint(25F, -17F, -11F);

		snowplowModel[116].addBox(0F, 0F, 0F, 6, 6, 0, 0F); // Box 117
		snowplowModel[116].setRotationPoint(18F, -17F, -11F);

		snowplowModel[117].addBox(0F, 0F, 0F, 6, 6, 0, 0F); // Box 118
		snowplowModel[117].setRotationPoint(3F, -17F, -11F);

		snowplowModel[118].addBox(0F, 0F, 0F, 6, 6, 0, 0F); // Box 119
		snowplowModel[118].setRotationPoint(-4F, -17F, -11F);

		snowplowModel[119].addBox(0F, 0F, 0F, 5, 6, 0, 0F); // Box 120
		snowplowModel[119].setRotationPoint(-27F, -17F, -11F);


	}

	private ModelMILW_H1044_Bogie fronttrucks = new ModelMILW_H1044_Bogie();
	private ModelMILW_H1044_Bogie backtrucks = new ModelMILW_H1044_Bogie();

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		for(int i = 0; i < 120; i++)
		{
			snowplowModel[i].render(f5);
		}
		Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/MILW_H1044_bogie.png"));

		GL11.glPushMatrix();
		GL11.glTranslated(-1.5,0.6,0);
		GL11.glScalef(0.8F, 1.3F, 0.8F);
		fronttrucks.render(entity,f,f1,f2,f3,f4,f5);
		GL11.glPopMatrix();

		GL11.glPushMatrix();
		GL11.glTranslated(1.5,0.6,0);
		GL11.glScalef(0.8F, 1.3F, 0.8F);
		backtrucks.render(entity,f,f1,f2,f3,f4,f5);
		GL11.glPopMatrix();
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
	{
	}

	public ModelRendererTurbo snowplowModel[];
}