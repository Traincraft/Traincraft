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
import train.common.library.Info;

public class ModelRheingoldPassenger_Dining2 extends ModelBase
{
	int textureX = 512;
	int textureY = 256;

	public ModelRheingoldPassenger_Dining2()
	{
		rheingoldpassenger_dining2Model = new ModelRendererTurbo[149];
		rheingoldpassenger_dining2Model[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		rheingoldpassenger_dining2Model[1] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 2
		rheingoldpassenger_dining2Model[2] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 3
		rheingoldpassenger_dining2Model[3] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 4
		rheingoldpassenger_dining2Model[4] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 7
		rheingoldpassenger_dining2Model[5] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 8
		rheingoldpassenger_dining2Model[6] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 12
		rheingoldpassenger_dining2Model[7] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 16
		rheingoldpassenger_dining2Model[8] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 18
		rheingoldpassenger_dining2Model[9] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 19
		rheingoldpassenger_dining2Model[10] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 21
		rheingoldpassenger_dining2Model[11] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 23
		rheingoldpassenger_dining2Model[12] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 24
		rheingoldpassenger_dining2Model[13] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 25
		rheingoldpassenger_dining2Model[14] = new ModelRendererTurbo(this, 465, 9, textureX, textureY); // Box 26
		rheingoldpassenger_dining2Model[15] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 28
		rheingoldpassenger_dining2Model[16] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 29
		rheingoldpassenger_dining2Model[17] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 35
		rheingoldpassenger_dining2Model[18] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 36
		rheingoldpassenger_dining2Model[19] = new ModelRendererTurbo(this, 337, 9, textureX, textureY); // Box 37
		rheingoldpassenger_dining2Model[20] = new ModelRendererTurbo(this, 369, 25, textureX, textureY); // Box 39
		rheingoldpassenger_dining2Model[21] = new ModelRendererTurbo(this, 257, 73, textureX, textureY); // Box 40
		rheingoldpassenger_dining2Model[22] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 41
		rheingoldpassenger_dining2Model[23] = new ModelRendererTurbo(this, 305, 9, textureX, textureY); // Box 42
		rheingoldpassenger_dining2Model[24] = new ModelRendererTurbo(this, 377, 9, textureX, textureY); // Box 43
		rheingoldpassenger_dining2Model[25] = new ModelRendererTurbo(this, 401, 9, textureX, textureY); // Box 44
		rheingoldpassenger_dining2Model[26] = new ModelRendererTurbo(this, 393, 25, textureX, textureY); // Box 45
		rheingoldpassenger_dining2Model[27] = new ModelRendererTurbo(this, 417, 25, textureX, textureY); // Box 46
		rheingoldpassenger_dining2Model[28] = new ModelRendererTurbo(this, 457, 9, textureX, textureY); // Box 47
		rheingoldpassenger_dining2Model[29] = new ModelRendererTurbo(this, 441, 25, textureX, textureY); // Box 48
		rheingoldpassenger_dining2Model[30] = new ModelRendererTurbo(this, 377, 73, textureX, textureY); // Box 49
		rheingoldpassenger_dining2Model[31] = new ModelRendererTurbo(this, 401, 73, textureX, textureY); // Box 50
		rheingoldpassenger_dining2Model[32] = new ModelRendererTurbo(this, 297, 33, textureX, textureY); // Box 51
		rheingoldpassenger_dining2Model[33] = new ModelRendererTurbo(this, 393, 73, textureX, textureY); // Box 52
		rheingoldpassenger_dining2Model[34] = new ModelRendererTurbo(this, 274, 104, textureX, textureY); // Box 53
		rheingoldpassenger_dining2Model[35] = new ModelRendererTurbo(this, 409, 73, textureX, textureY); // Box 54
		rheingoldpassenger_dining2Model[36] = new ModelRendererTurbo(this, 417, 9, textureX, textureY); // Box 55
		rheingoldpassenger_dining2Model[37] = new ModelRendererTurbo(this, 305, 17, textureX, textureY); // Box 56
		rheingoldpassenger_dining2Model[38] = new ModelRendererTurbo(this, 497, 17, textureX, textureY); // Box 57
		rheingoldpassenger_dining2Model[39] = new ModelRendererTurbo(this, 441, 9, textureX, textureY); // Box 58
		rheingoldpassenger_dining2Model[40] = new ModelRendererTurbo(this, 401, 33, textureX, textureY); // Box 61
		rheingoldpassenger_dining2Model[41] = new ModelRendererTurbo(this, 457, 25, textureX, textureY); // Box 54
		rheingoldpassenger_dining2Model[42] = new ModelRendererTurbo(this, 473, 25, textureX, textureY); // Box 55
		rheingoldpassenger_dining2Model[43] = new ModelRendererTurbo(this, 49, 88, textureX, textureY); // Box 59
		rheingoldpassenger_dining2Model[44] = new ModelRendererTurbo(this, 146, 142, textureX, textureY); // Box 60
		rheingoldpassenger_dining2Model[45] = new ModelRendererTurbo(this, 186, 155, textureX, textureY); // Box 73
		rheingoldpassenger_dining2Model[46] = new ModelRendererTurbo(this, 204, 90, textureX, textureY); // Box 75
		rheingoldpassenger_dining2Model[47] = new ModelRendererTurbo(this, 449, 73, textureX, textureY); // Box 76
		rheingoldpassenger_dining2Model[48] = new ModelRendererTurbo(this, 2, 135, textureX, textureY); // Box 77
		rheingoldpassenger_dining2Model[49] = new ModelRendererTurbo(this, 79, 135, textureX, textureY); // Box 78
		rheingoldpassenger_dining2Model[50] = new ModelRendererTurbo(this, 220, 127, textureX, textureY); // Box 80
		rheingoldpassenger_dining2Model[51] = new ModelRendererTurbo(this, 293, 106, textureX, textureY); // Box 66
		rheingoldpassenger_dining2Model[52] = new ModelRendererTurbo(this, 29, 133, textureX, textureY); // Box 67
		rheingoldpassenger_dining2Model[53] = new ModelRendererTurbo(this, 18, 57, textureX, textureY); // Box 68
		rheingoldpassenger_dining2Model[54] = new ModelRendererTurbo(this, 185, 65, textureX, textureY); // Box 70
		rheingoldpassenger_dining2Model[55] = new ModelRendererTurbo(this, 345, 33, textureX, textureY); // Box 72
		rheingoldpassenger_dining2Model[56] = new ModelRendererTurbo(this, 193, 129, textureX, textureY); // Box 73
		rheingoldpassenger_dining2Model[57] = new ModelRendererTurbo(this, 164, 118, textureX, textureY); // Box 74
		rheingoldpassenger_dining2Model[58] = new ModelRendererTurbo(this, 241, 106, textureX, textureY); // Box 75
		rheingoldpassenger_dining2Model[59] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 76
		rheingoldpassenger_dining2Model[60] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 77
		rheingoldpassenger_dining2Model[61] = new ModelRendererTurbo(this, 117, 120, textureX, textureY); // Box 78
		rheingoldpassenger_dining2Model[62] = new ModelRendererTurbo(this, 103, 139, textureX, textureY); // Box 79
		rheingoldpassenger_dining2Model[63] = new ModelRendererTurbo(this, 71, 159, textureX, textureY); // Box 81
		rheingoldpassenger_dining2Model[64] = new ModelRendererTurbo(this, 403, 176, textureX, textureY); // Box 0
		rheingoldpassenger_dining2Model[65] = new ModelRendererTurbo(this, 398, 131, textureX, textureY); // Box 1
		rheingoldpassenger_dining2Model[66] = new ModelRendererTurbo(this, 349, 138, textureX, textureY); // Box 2
		rheingoldpassenger_dining2Model[67] = new ModelRendererTurbo(this, 369, 121, textureX, textureY); // Box 0
		rheingoldpassenger_dining2Model[68] = new ModelRendererTurbo(this, 437, 129, textureX, textureY); // Box 1
		rheingoldpassenger_dining2Model[69] = new ModelRendererTurbo(this, 397, 116, textureX, textureY); // Box 2
		rheingoldpassenger_dining2Model[70] = new ModelRendererTurbo(this, 369, 121, textureX, textureY); // Box 0
		rheingoldpassenger_dining2Model[71] = new ModelRendererTurbo(this, 437, 129, textureX, textureY); // Box 1
		rheingoldpassenger_dining2Model[72] = new ModelRendererTurbo(this, 397, 116, textureX, textureY); // Box 2
		rheingoldpassenger_dining2Model[73] = new ModelRendererTurbo(this, 403, 176, textureX, textureY); // Box 0
		rheingoldpassenger_dining2Model[74] = new ModelRendererTurbo(this, 398, 131, textureX, textureY); // Box 1
		rheingoldpassenger_dining2Model[75] = new ModelRendererTurbo(this, 349, 138, textureX, textureY); // Box 2
		rheingoldpassenger_dining2Model[76] = new ModelRendererTurbo(this, 434, 180, textureX, textureY); // Box 0
		rheingoldpassenger_dining2Model[77] = new ModelRendererTurbo(this, 453, 175, textureX, textureY); // Box 1
		rheingoldpassenger_dining2Model[78] = new ModelRendererTurbo(this, 466, 117, textureX, textureY); // Box 2
		rheingoldpassenger_dining2Model[79] = new ModelRendererTurbo(this, 434, 180, textureX, textureY); // Box 0
		rheingoldpassenger_dining2Model[80] = new ModelRendererTurbo(this, 453, 175, textureX, textureY); // Box 1
		rheingoldpassenger_dining2Model[81] = new ModelRendererTurbo(this, 466, 117, textureX, textureY); // Box 2
		rheingoldpassenger_dining2Model[82] = new ModelRendererTurbo(this, 386, 182, textureX, textureY); // Box 0
		rheingoldpassenger_dining2Model[83] = new ModelRendererTurbo(this, 475, 150, textureX, textureY); // Box 1
		rheingoldpassenger_dining2Model[84] = new ModelRendererTurbo(this, 448, 155, textureX, textureY); // Box 2
		rheingoldpassenger_dining2Model[85] = new ModelRendererTurbo(this, 386, 182, textureX, textureY); // Box 0
		rheingoldpassenger_dining2Model[86] = new ModelRendererTurbo(this, 475, 150, textureX, textureY); // Box 1
		rheingoldpassenger_dining2Model[87] = new ModelRendererTurbo(this, 448, 155, textureX, textureY); // Box 2
		rheingoldpassenger_dining2Model[88] = new ModelRendererTurbo(this, 12, 172, textureX, textureY); // Box 104
		rheingoldpassenger_dining2Model[89] = new ModelRendererTurbo(this, 12, 172, textureX, textureY); // Box 105
		rheingoldpassenger_dining2Model[90] = new ModelRendererTurbo(this, 12, 172, textureX, textureY); // Box 106
		rheingoldpassenger_dining2Model[91] = new ModelRendererTurbo(this, 12, 172, textureX, textureY); // Box 107
		rheingoldpassenger_dining2Model[92] = new ModelRendererTurbo(this, 12, 172, textureX, textureY); // Box 108
		rheingoldpassenger_dining2Model[93] = new ModelRendererTurbo(this, 12, 172, textureX, textureY); // Box 109
		rheingoldpassenger_dining2Model[94] = new ModelRendererTurbo(this, 35, 182, textureX, textureY); // Box 110
		rheingoldpassenger_dining2Model[95] = new ModelRendererTurbo(this, 35, 182, textureX, textureY); // Box 111
		rheingoldpassenger_dining2Model[96] = new ModelRendererTurbo(this, 35, 182, textureX, textureY); // Box 112
		rheingoldpassenger_dining2Model[97] = new ModelRendererTurbo(this, 7, 190, textureX, textureY); // Box 113
		rheingoldpassenger_dining2Model[98] = new ModelRendererTurbo(this, 7, 190, textureX, textureY); // Box 114
		rheingoldpassenger_dining2Model[99] = new ModelRendererTurbo(this, 7, 190, textureX, textureY); // Box 115
		rheingoldpassenger_dining2Model[100] = new ModelRendererTurbo(this, 92, 157, textureX, textureY); // Box 86
		rheingoldpassenger_dining2Model[101] = new ModelRendererTurbo(this, 311, 59, textureX, textureY); // Box 117
		rheingoldpassenger_dining2Model[102] = new ModelRendererTurbo(this, 185, 102, textureX, textureY); // Box55
		rheingoldpassenger_dining2Model[103] = new ModelRendererTurbo(this, 191, 122, textureX, textureY); // Box56
		rheingoldpassenger_dining2Model[104] = new ModelRendererTurbo(this, 191, 117, textureX, textureY); // Box58
		rheingoldpassenger_dining2Model[105] = new ModelRendererTurbo(this, 263, 122, textureX, textureY); // Box59
		rheingoldpassenger_dining2Model[106] = new ModelRendererTurbo(this, 241, 92, textureX, textureY); // Box60
		rheingoldpassenger_dining2Model[107] = new ModelRendererTurbo(this, 242, 96, textureX, textureY); // Box63
		rheingoldpassenger_dining2Model[108] = new ModelRendererTurbo(this, 229, 96, textureX, textureY); // Box65
		rheingoldpassenger_dining2Model[109] = new ModelRendererTurbo(this, 98, 60, textureX, textureY); // Box 102
		rheingoldpassenger_dining2Model[110] = new ModelRendererTurbo(this, 92, 162, textureX, textureY); // Box 126
		rheingoldpassenger_dining2Model[111] = new ModelRendererTurbo(this, 229, 91, textureX, textureY); // Box 127
		rheingoldpassenger_dining2Model[112] = new ModelRendererTurbo(this, 260, 102, textureX, textureY); // Box 128
		rheingoldpassenger_dining2Model[113] = new ModelRendererTurbo(this, 239, 101, textureX, textureY); // Box 129
		rheingoldpassenger_dining2Model[114] = new ModelRendererTurbo(this, 230, 101, textureX, textureY); // Box 130
		rheingoldpassenger_dining2Model[115] = new ModelRendererTurbo(this, 9, 216, textureX, textureY); // Box 91
		rheingoldpassenger_dining2Model[116] = new ModelRendererTurbo(this, 9, 216, textureX, textureY); // Box 133
		rheingoldpassenger_dining2Model[117] = new ModelRendererTurbo(this, 9, 216, textureX, textureY); // Box 134
		rheingoldpassenger_dining2Model[118] = new ModelRendererTurbo(this, 9, 216, textureX, textureY); // Box 135
		rheingoldpassenger_dining2Model[119] = new ModelRendererTurbo(this, 9, 216, textureX, textureY); // Box 137
		rheingoldpassenger_dining2Model[120] = new ModelRendererTurbo(this, 9, 216, textureX, textureY); // Box 138
		rheingoldpassenger_dining2Model[121] = new ModelRendererTurbo(this, 9, 216, textureX, textureY); // Box 139
		rheingoldpassenger_dining2Model[122] = new ModelRendererTurbo(this, 9, 216, textureX, textureY); // Box 140
		rheingoldpassenger_dining2Model[123] = new ModelRendererTurbo(this, 382, 150, textureX, textureY); // Box 108
		rheingoldpassenger_dining2Model[124] = new ModelRendererTurbo(this, 382, 150, textureX, textureY); // Box 128
		rheingoldpassenger_dining2Model[125] = new ModelRendererTurbo(this, 382, 150, textureX, textureY); // Box 129
		rheingoldpassenger_dining2Model[126] = new ModelRendererTurbo(this, 382, 150, textureX, textureY); // Box 130
		rheingoldpassenger_dining2Model[127] = new ModelRendererTurbo(this, 382, 150, textureX, textureY); // Box 131
		rheingoldpassenger_dining2Model[128] = new ModelRendererTurbo(this, 382, 150, textureX, textureY); // Box 132
		rheingoldpassenger_dining2Model[129] = new ModelRendererTurbo(this, 382, 150, textureX, textureY); // Box 133
		rheingoldpassenger_dining2Model[130] = new ModelRendererTurbo(this, 382, 150, textureX, textureY); // Box 134
		rheingoldpassenger_dining2Model[131] = new ModelRendererTurbo(this, 382, 150, textureX, textureY); // Box 135
		rheingoldpassenger_dining2Model[132] = new ModelRendererTurbo(this, 382, 150, textureX, textureY); // Box 136
		rheingoldpassenger_dining2Model[133] = new ModelRendererTurbo(this, 382, 150, textureX, textureY); // Box 137
		rheingoldpassenger_dining2Model[134] = new ModelRendererTurbo(this, 382, 150, textureX, textureY); // Box 138
		rheingoldpassenger_dining2Model[135] = new ModelRendererTurbo(this, 120, 167, textureX, textureY); // Box 13
		rheingoldpassenger_dining2Model[136] = new ModelRendererTurbo(this, 221, 58, textureX, textureY); // Box 173
		rheingoldpassenger_dining2Model[137] = new ModelRendererTurbo(this, 120, 167, textureX, textureY); // Box 177
		rheingoldpassenger_dining2Model[138] = new ModelRendererTurbo(this, 120, 167, textureX, textureY); // Box 178
		rheingoldpassenger_dining2Model[139] = new ModelRendererTurbo(this, 221, 58, textureX, textureY); // Box 179
		rheingoldpassenger_dining2Model[140] = new ModelRendererTurbo(this, 120, 167, textureX, textureY); // Box 180
		rheingoldpassenger_dining2Model[141] = new ModelRendererTurbo(this, 13, 98, textureX, textureY); // Box 128
		rheingoldpassenger_dining2Model[142] = new ModelRendererTurbo(this, 267, 49, textureX, textureY); // Box 145
		rheingoldpassenger_dining2Model[143] = new ModelRendererTurbo(this, 20, 68, textureX, textureY); // Box 177
		rheingoldpassenger_dining2Model[144] = new ModelRendererTurbo(this, 42, 68, textureX, textureY); // Box 178
		rheingoldpassenger_dining2Model[145] = new ModelRendererTurbo(this, 21, 62, textureX, textureY); // Box 179
		rheingoldpassenger_dining2Model[146] = new ModelRendererTurbo(this, 38, 63, textureX, textureY); // Box 180
		rheingoldpassenger_dining2Model[147] = new ModelRendererTurbo(this, 419, 26, textureX, textureY); // Box 181
		rheingoldpassenger_dining2Model[148] = new ModelRendererTurbo(this, 419, 26, textureX, textureY); // Box 182

		rheingoldpassenger_dining2Model[0].addBox(0F, 0F, 0F, 125, 18, 1, 0F); // Box 0
		rheingoldpassenger_dining2Model[0].setRotationPoint(-69F, -16F, 10F);

		rheingoldpassenger_dining2Model[1].addBox(0F, 0F, 0F, 133, 1, 22, 0F); // Box 2
		rheingoldpassenger_dining2Model[1].setRotationPoint(-69F, 2F, -11F);

		rheingoldpassenger_dining2Model[2].addBox(-5F, 0F, -1F, 5, 17, 1, 0F); // Box 3
		rheingoldpassenger_dining2Model[2].setRotationPoint(61F, -15F, 11F);

		rheingoldpassenger_dining2Model[3].addBox(0F, 0F, 0F, 3, 18, 1, 0F); // Box 4
		rheingoldpassenger_dining2Model[3].setRotationPoint(61F, -16F, 10F);

		rheingoldpassenger_dining2Model[4].addBox(0F, 0F, 0F, 5, 1, 1, 0F); // Box 7
		rheingoldpassenger_dining2Model[4].setRotationPoint(56F, -16F, 10F);

		rheingoldpassenger_dining2Model[5].addShapeBox(0F, 0F, 0F, 7, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F); // Box 8
		rheingoldpassenger_dining2Model[5].setRotationPoint(-33F, 3F, 10F);

		rheingoldpassenger_dining2Model[6].addShapeBox(0F, 0F, 0F, 131, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		rheingoldpassenger_dining2Model[6].setRotationPoint(-68F, -19F, 9F);

		rheingoldpassenger_dining2Model[7].addShapeBox(0F, 0F, 0F, 131, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 16
		rheingoldpassenger_dining2Model[7].setRotationPoint(63F, -19F, -9F);
		rheingoldpassenger_dining2Model[7].rotateAngleY = -3.14159265F;

		rheingoldpassenger_dining2Model[8].addBox(0F, 0F, 0F, 1, 3, 18, 0F); // Box 18
		rheingoldpassenger_dining2Model[8].setRotationPoint(-69F, -19F, -9F);

		rheingoldpassenger_dining2Model[9].addBox(0F, 0F, 0F, 1, 3, 18, 0F); // Box 19
		rheingoldpassenger_dining2Model[9].setRotationPoint(63F, -19F, -9F);

		rheingoldpassenger_dining2Model[10].addBox(0F, 0F, 0F, 3, 0, 12, 0F); // Box 21
		rheingoldpassenger_dining2Model[10].setRotationPoint(-72F, 2F, -6F);

		rheingoldpassenger_dining2Model[11].addShapeBox(0F, 0F, 0F, 3, 2, 14, 0F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 23
		rheingoldpassenger_dining2Model[11].setRotationPoint(-72F, -17F, -7F);

		rheingoldpassenger_dining2Model[12].addBox(0F, 0F, 0F, 3, 17, 1, 0F); // Box 24
		rheingoldpassenger_dining2Model[12].setRotationPoint(-72F, -15F, 6F);

		rheingoldpassenger_dining2Model[13].addBox(0F, 0F, 0F, 3, 17, 1, 0F); // Box 25
		rheingoldpassenger_dining2Model[13].setRotationPoint(-72F, -15F, -7F);

		rheingoldpassenger_dining2Model[14].addBox(0F, 0F, 0F, 1, 18, 20, 0F); // Box 26
		rheingoldpassenger_dining2Model[14].setRotationPoint(-69F, -16F, -10F);

		rheingoldpassenger_dining2Model[15].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 28
		rheingoldpassenger_dining2Model[15].setRotationPoint(-71F, 2F, 8F);

		rheingoldpassenger_dining2Model[16].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 29
		rheingoldpassenger_dining2Model[16].setRotationPoint(-71F, 2F, -9F);

		rheingoldpassenger_dining2Model[17].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 35
		rheingoldpassenger_dining2Model[17].setRotationPoint(-72F, 1F, -10F);

		rheingoldpassenger_dining2Model[18].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 36
		rheingoldpassenger_dining2Model[18].setRotationPoint(-72F, 1F, 7F);

		rheingoldpassenger_dining2Model[19].addShapeBox(0F, 0F, 0F, 5, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 37
		rheingoldpassenger_dining2Model[19].setRotationPoint(56F, 2F, 11F);

		rheingoldpassenger_dining2Model[20].addShapeBox(0F, 0F, 0F, 7, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F); // Box 39
		rheingoldpassenger_dining2Model[20].setRotationPoint(28F, 3F, -10F);
		rheingoldpassenger_dining2Model[20].rotateAngleY = -3.14159265F;

		rheingoldpassenger_dining2Model[21].addBox(0F, 0F, 0F, 47, 5, 22, 0F); // Box 40
		rheingoldpassenger_dining2Model[21].setRotationPoint(-26F, 3F, -11F);

		rheingoldpassenger_dining2Model[22].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		rheingoldpassenger_dining2Model[22].setRotationPoint(-69F, -19F, 9F);

		rheingoldpassenger_dining2Model[23].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 42
		rheingoldpassenger_dining2Model[23].setRotationPoint(63F, -19F, 9F);

		rheingoldpassenger_dining2Model[24].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
		rheingoldpassenger_dining2Model[24].setRotationPoint(64F, -19F, -9F);
		rheingoldpassenger_dining2Model[24].rotateAngleY = -3.14159265F;

		rheingoldpassenger_dining2Model[25].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 44
		rheingoldpassenger_dining2Model[25].setRotationPoint(-68F, -19F, -9F);
		rheingoldpassenger_dining2Model[25].rotateAngleY = -3.14159265F;

		rheingoldpassenger_dining2Model[26].addShapeBox(0F, 0F, 0F, 7, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F); // Box 45
		rheingoldpassenger_dining2Model[26].setRotationPoint(21F, 3F, 10F);

		rheingoldpassenger_dining2Model[27].addShapeBox(0F, 0F, 0F, 7, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F); // Box 46
		rheingoldpassenger_dining2Model[27].setRotationPoint(-26F, 3F, -10F);
		rheingoldpassenger_dining2Model[27].rotateAngleY = -3.14159265F;

		rheingoldpassenger_dining2Model[28].addBox(0F, 0F, 0F, 5, 1, 1, 0F); // Box 47
		rheingoldpassenger_dining2Model[28].setRotationPoint(56F, -16F, -11F);

		rheingoldpassenger_dining2Model[29].addBox(-5F, 0F, 0F, 5, 17, 1, 0F); // Box 48
		rheingoldpassenger_dining2Model[29].setRotationPoint(61F, -15F, -11F);

		rheingoldpassenger_dining2Model[30].addBox(0F, 0F, 0F, 3, 18, 1, 0F); // Box 49
		rheingoldpassenger_dining2Model[30].setRotationPoint(61F, -16F, -11F);

		rheingoldpassenger_dining2Model[31].addBox(0F, 0F, 0F, 1, 18, 20, 0F); // Box 50
		rheingoldpassenger_dining2Model[31].setRotationPoint(63F, -16F, -10F);

		rheingoldpassenger_dining2Model[32].addBox(0F, 0F, 0F, 3, 0, 12, 0F); // Box 51
		rheingoldpassenger_dining2Model[32].setRotationPoint(64F, 2F, -6F);

		rheingoldpassenger_dining2Model[33].addBox(0F, 0F, 0F, 3, 17, 1, 0F); // Box 52
		rheingoldpassenger_dining2Model[33].setRotationPoint(64F, -15F, 6F);

		rheingoldpassenger_dining2Model[34].addShapeBox(0F, 0F, 0F, 3, 2, 14, 0F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 53
		rheingoldpassenger_dining2Model[34].setRotationPoint(64F, -17F, -7F);

		rheingoldpassenger_dining2Model[35].addBox(0F, 0F, 0F, 3, 17, 1, 0F); // Box 54
		rheingoldpassenger_dining2Model[35].setRotationPoint(64F, -15F, -7F);

		rheingoldpassenger_dining2Model[36].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 55
		rheingoldpassenger_dining2Model[36].setRotationPoint(64F, 2F, -9F);

		rheingoldpassenger_dining2Model[37].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 56
		rheingoldpassenger_dining2Model[37].setRotationPoint(65.5F, 1F, -10F);

		rheingoldpassenger_dining2Model[38].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 57
		rheingoldpassenger_dining2Model[38].setRotationPoint(65.5F, 1F, 7F);

		rheingoldpassenger_dining2Model[39].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 58
		rheingoldpassenger_dining2Model[39].setRotationPoint(64F, 2F, 8F);

		rheingoldpassenger_dining2Model[40].addShapeBox(0F, 0F, 0F, 5, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 61
		rheingoldpassenger_dining2Model[40].setRotationPoint(61F, 2F, -11F);
		rheingoldpassenger_dining2Model[40].rotateAngleY = -3.14159265F;

		rheingoldpassenger_dining2Model[41].addBox(0F, 0F, 0F, 3, 1, 2, 0F); // Box 54
		rheingoldpassenger_dining2Model[41].setRotationPoint(38F, 3F, -1F);

		rheingoldpassenger_dining2Model[42].addBox(0F, 0F, 0F, 3, 1, 2, 0F); // Box 55
		rheingoldpassenger_dining2Model[42].setRotationPoint(-47F, 3F, -1F);

		rheingoldpassenger_dining2Model[43].addBox(0F, 0F, 0F, 1, 18, 5, 0F); // Box 59
		rheingoldpassenger_dining2Model[43].setRotationPoint(54F, -16F, 5F);

		rheingoldpassenger_dining2Model[44].addBox(0F, 0F, 0F, 1, 18, 10, 0F); // Box 60
		rheingoldpassenger_dining2Model[44].setRotationPoint(54F, -16F, -10F);

		rheingoldpassenger_dining2Model[45].addBox(0F, 0F, 0F, 125, 18, 1, 0F); // Box 73
		rheingoldpassenger_dining2Model[45].setRotationPoint(-69F, -16F, -11F);

		rheingoldpassenger_dining2Model[46].addShapeBox(0F, 0F, 0F, 1, 3, 20, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 75
		rheingoldpassenger_dining2Model[46].setRotationPoint(54F, -19F, -10F);

		rheingoldpassenger_dining2Model[47].addBox(0F, 0F, 0F, 1, 18, 13, 0F); // Box 76
		rheingoldpassenger_dining2Model[47].setRotationPoint(-62F, -16F, -10F);

		rheingoldpassenger_dining2Model[48].addBox(0F, 0F, 0F, 1, 18, 10, 0F); // Box 77
		rheingoldpassenger_dining2Model[48].setRotationPoint(-23F, -16F, -10F);

		rheingoldpassenger_dining2Model[49].addBox(0F, 0F, 0F, 1, 18, 5, 0F); // Box 78
		rheingoldpassenger_dining2Model[49].setRotationPoint(-23F, -16F, 5F);

		rheingoldpassenger_dining2Model[50].addBox(0F, 0F, 0F, 19, 21, 1, 0F); // Box 80
		rheingoldpassenger_dining2Model[50].setRotationPoint(-61F, -19F, 2F);

		rheingoldpassenger_dining2Model[51].addShapeBox(0F, 0F, 0F, 1, 3, 20, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 66
		rheingoldpassenger_dining2Model[51].setRotationPoint(-62F, -19F, -10F);

		rheingoldpassenger_dining2Model[52].addShapeBox(0F, 0F, 0F, 1, 3, 20, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 67
		rheingoldpassenger_dining2Model[52].setRotationPoint(-23F, -19F, -10F);

		rheingoldpassenger_dining2Model[53].addShapeBox(0F, 0F, 0F, 25, 1, 18, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 68
		rheingoldpassenger_dining2Model[53].setRotationPoint(31F, -20F, -9F);

		rheingoldpassenger_dining2Model[54].addBox(0F, 0F, 0F, 11, 8, 5, 0F); // Box 70
		rheingoldpassenger_dining2Model[54].setRotationPoint(-61F, -6F, -3F);

		rheingoldpassenger_dining2Model[55].addBox(0F, 0F, 0F, 18, 4, 1, 0F); // Box 72
		rheingoldpassenger_dining2Model[55].setRotationPoint(-61F, -16F, -10F);

		rheingoldpassenger_dining2Model[56].addBox(0F, 0F, 0F, 7, 16, 3, 0F); // Box 73
		rheingoldpassenger_dining2Model[56].setRotationPoint(-50F, -14F, -1F);

		rheingoldpassenger_dining2Model[57].addShapeBox(0F, 0F, 0F, 1, 18, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		rheingoldpassenger_dining2Model[57].setRotationPoint(-43F, -16F, -10F);

		rheingoldpassenger_dining2Model[58].addShapeBox(0F, 0F, 0F, 1, 3, 12, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 75
		rheingoldpassenger_dining2Model[58].setRotationPoint(-43F, -19F, -10F);

		rheingoldpassenger_dining2Model[59].addBox(0F, 0F, 0F, 5, 3, 1, 0F); // Box 76
		rheingoldpassenger_dining2Model[59].setRotationPoint(-42F, -19F, 2F);

		rheingoldpassenger_dining2Model[60].addBox(0F, 0F, 0F, 5, 0, 1, 0F); // Box 77
		rheingoldpassenger_dining2Model[60].setRotationPoint(-42F, -7F, 2F);

		rheingoldpassenger_dining2Model[61].addShapeBox(0F, 0F, 0F, 14, 3, 3, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 78
		rheingoldpassenger_dining2Model[61].setRotationPoint(-37F, -19F, 0F);

		rheingoldpassenger_dining2Model[62].addShapeBox(0F, 0F, 0F, 14, 9, 3, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 79
		rheingoldpassenger_dining2Model[62].setRotationPoint(-37F, -7F, 0F);

		rheingoldpassenger_dining2Model[63].addShapeBox(0F, 0F, 0F, 1, 9, 2, 0F, 0F, 0F, -1F, 0F, 0F, -0.85F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.85F, 0F, 0F, -0.2F, 0F, 0F, 0F); // Box 81
		rheingoldpassenger_dining2Model[63].setRotationPoint(-37F, -16F, 1F);

		rheingoldpassenger_dining2Model[64].addShapeBox(0F, 0F, 0F, 2, 7, 10, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		rheingoldpassenger_dining2Model[64].setRotationPoint(51F, -9F, -10F);

		rheingoldpassenger_dining2Model[65].addBox(0F, 0F, 0F, 7, 1, 10, 0F); // Box 1
		rheingoldpassenger_dining2Model[65].setRotationPoint(46F, -2F, -10F);

		rheingoldpassenger_dining2Model[66].addBox(0F, 0F, 0F, 4, 3, 10, 0F); // Box 2
		rheingoldpassenger_dining2Model[66].setRotationPoint(48F, -1F, -10F);

		rheingoldpassenger_dining2Model[67].addShapeBox(0F, 0F, 0F, 4, 7, 10, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		rheingoldpassenger_dining2Model[67].setRotationPoint(27F, -9F, -10F);

		rheingoldpassenger_dining2Model[68].addBox(0F, 0F, 0F, 14, 1, 10, 0F); // Box 1
		rheingoldpassenger_dining2Model[68].setRotationPoint(22F, -2F, -10F);

		rheingoldpassenger_dining2Model[69].addBox(0F, 0F, 0F, 8, 3, 10, 0F); // Box 2
		rheingoldpassenger_dining2Model[69].setRotationPoint(25F, -1F, -10F);

		rheingoldpassenger_dining2Model[70].addShapeBox(0F, 0F, 0F, 4, 7, 10, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		rheingoldpassenger_dining2Model[70].setRotationPoint(3F, -9F, -10F);

		rheingoldpassenger_dining2Model[71].addBox(0F, 0F, 0F, 14, 1, 10, 0F); // Box 1
		rheingoldpassenger_dining2Model[71].setRotationPoint(-2F, -2F, -10F);

		rheingoldpassenger_dining2Model[72].addBox(0F, 0F, 0F, 8, 3, 10, 0F); // Box 2
		rheingoldpassenger_dining2Model[72].setRotationPoint(1F, -1F, -10F);

		rheingoldpassenger_dining2Model[73].addShapeBox(0F, 0F, 0F, 2, 7, 10, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		rheingoldpassenger_dining2Model[73].setRotationPoint(-19F, -9F, -10F);

		rheingoldpassenger_dining2Model[74].addBox(0F, 0F, 0F, 7, 1, 10, 0F); // Box 1
		rheingoldpassenger_dining2Model[74].setRotationPoint(-19F, -2F, -10F);

		rheingoldpassenger_dining2Model[75].addBox(0F, 0F, 0F, 4, 3, 10, 0F); // Box 2
		rheingoldpassenger_dining2Model[75].setRotationPoint(-18F, -1F, -10F);

		rheingoldpassenger_dining2Model[76].addShapeBox(0F, 0F, 0F, 4, 7, 5, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		rheingoldpassenger_dining2Model[76].setRotationPoint(27F, -9F, 5F);

		rheingoldpassenger_dining2Model[77].addBox(0F, 0F, 0F, 14, 1, 5, 0F); // Box 1
		rheingoldpassenger_dining2Model[77].setRotationPoint(22F, -2F, 5F);

		rheingoldpassenger_dining2Model[78].addBox(0F, 0F, 0F, 8, 3, 5, 0F); // Box 2
		rheingoldpassenger_dining2Model[78].setRotationPoint(25F, -1F, 5F);

		rheingoldpassenger_dining2Model[79].addShapeBox(0F, 0F, 0F, 4, 7, 5, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		rheingoldpassenger_dining2Model[79].setRotationPoint(3F, -9F, 5F);

		rheingoldpassenger_dining2Model[80].addBox(0F, 0F, 0F, 14, 1, 5, 0F); // Box 1
		rheingoldpassenger_dining2Model[80].setRotationPoint(-2F, -2F, 5F);

		rheingoldpassenger_dining2Model[81].addBox(0F, 0F, 0F, 8, 3, 5, 0F); // Box 2
		rheingoldpassenger_dining2Model[81].setRotationPoint(1F, -1F, 5F);

		rheingoldpassenger_dining2Model[82].addShapeBox(0F, 0F, 0F, 2, 7, 5, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		rheingoldpassenger_dining2Model[82].setRotationPoint(51F, -9F, 5F);

		rheingoldpassenger_dining2Model[83].addBox(0F, 0F, 0F, 7, 1, 5, 0F); // Box 1
		rheingoldpassenger_dining2Model[83].setRotationPoint(46F, -2F, 5F);

		rheingoldpassenger_dining2Model[84].addBox(0F, 0F, 0F, 4, 3, 5, 0F); // Box 2
		rheingoldpassenger_dining2Model[84].setRotationPoint(48F, -1F, 5F);

		rheingoldpassenger_dining2Model[85].addShapeBox(0F, 0F, 0F, 2, 7, 5, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		rheingoldpassenger_dining2Model[85].setRotationPoint(-19F, -9F, 5F);

		rheingoldpassenger_dining2Model[86].addBox(0F, 0F, 0F, 7, 1, 5, 0F); // Box 1
		rheingoldpassenger_dining2Model[86].setRotationPoint(-19F, -2F, 5F);

		rheingoldpassenger_dining2Model[87].addBox(4F, 0F, 0F, 4, 3, 5, 0F); // Box 2
		rheingoldpassenger_dining2Model[87].setRotationPoint(-22F, -1F, 5F);

		rheingoldpassenger_dining2Model[88].addBox(0F, 0F, 0F, 2, 8, 1, 0F); // Box 104
		rheingoldpassenger_dining2Model[88].setRotationPoint(16F, -6F, 7F);

		rheingoldpassenger_dining2Model[89].addBox(0F, 0F, 0F, 2, 8, 1, 0F); // Box 105
		rheingoldpassenger_dining2Model[89].setRotationPoint(40F, -6F, 7F);

		rheingoldpassenger_dining2Model[90].addBox(0F, 0F, 0F, 2, 8, 1, 0F); // Box 106
		rheingoldpassenger_dining2Model[90].setRotationPoint(-8F, -6F, 7F);

		rheingoldpassenger_dining2Model[91].addBox(0F, 0F, 0F, 2, 8, 2, 0F); // Box 107
		rheingoldpassenger_dining2Model[91].setRotationPoint(-8F, -6F, -6F);

		rheingoldpassenger_dining2Model[92].addBox(0F, 0F, 0F, 2, 8, 2, 0F); // Box 108
		rheingoldpassenger_dining2Model[92].setRotationPoint(16F, -6F, -6F);

		rheingoldpassenger_dining2Model[93].addBox(0F, 0F, 0F, 2, 8, 2, 0F); // Box 109
		rheingoldpassenger_dining2Model[93].setRotationPoint(40F, -6F, -6F);

		rheingoldpassenger_dining2Model[94].addBox(0F, 0F, 0F, 8, 0, 5, 0F); // Box 110
		rheingoldpassenger_dining2Model[94].setRotationPoint(13F, -6.05F, 5F);

		rheingoldpassenger_dining2Model[95].addBox(0F, 0F, 0F, 8, 0, 5, 0F); // Box 111
		rheingoldpassenger_dining2Model[95].setRotationPoint(37F, -6.05F, 5F);

		rheingoldpassenger_dining2Model[96].addBox(0F, 0F, 0F, 8, 0, 5, 0F); // Box 112
		rheingoldpassenger_dining2Model[96].setRotationPoint(-11F, -6.05F, 5F);

		rheingoldpassenger_dining2Model[97].addBox(0F, 0F, 0F, 8, 0, 10, 0F); // Box 113
		rheingoldpassenger_dining2Model[97].setRotationPoint(-11F, -6.05F, -10F);

		rheingoldpassenger_dining2Model[98].addBox(0F, 0F, 0F, 8, 0, 10, 0F); // Box 114
		rheingoldpassenger_dining2Model[98].setRotationPoint(13F, -6.05F, -10F);

		rheingoldpassenger_dining2Model[99].addBox(0F, 0F, 0F, 8, 0, 10, 0F); // Box 115
		rheingoldpassenger_dining2Model[99].setRotationPoint(37F, -6.05F, -10F);

		rheingoldpassenger_dining2Model[100].addBox(0F, 0F, 0F, 25, 0, 1, 0F); // Box 86
		rheingoldpassenger_dining2Model[100].setRotationPoint(31F, -20.75F, 6F);

		rheingoldpassenger_dining2Model[101].addShapeBox(0F, 0F, 0F, 4, 3, 2, 0F, 0.75F, -2.25F, -1F, 0F, -0.3F, 0F, 0F, -0.3F, -1F, 0.75F, -2.25F, 0F, 0.75F, -0.75F, -1F, 0F, -2.7F, 0F, 0F, -2.7F, -1F, 0.75F, -0.75F, 0F); // Box 117
		rheingoldpassenger_dining2Model[101].setRotationPoint(46F, -22.25F, -1F);

		rheingoldpassenger_dining2Model[102].addShapeBox(0F, 0F, 0F, 11, 1, 2, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 1F, 0F, 0F); // Box55
		rheingoldpassenger_dining2Model[102].setRotationPoint(45F, -20.25F, 1F);
		rheingoldpassenger_dining2Model[102].rotateAngleY = -3.14159265F;

		rheingoldpassenger_dining2Model[103].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, -2F, 2F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 2F, -2F, 0F, 2F, 2F, -1F, 0F, 0F); // Box56
		rheingoldpassenger_dining2Model[103].setRotationPoint(45F, -23.75F, 3F);
		rheingoldpassenger_dining2Model[103].rotateAngleY = -3.14159265F;

		rheingoldpassenger_dining2Model[104].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F, 0F, 0F, 0F, 0F, -2F, 2F, 0F, -2F, -2F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 2F, 2F, 0F, 2F, -2F, -1F, 0F, 0F); // Box58
		rheingoldpassenger_dining2Model[104].setRotationPoint(45F, -23.75F, -2F);
		rheingoldpassenger_dining2Model[104].rotateAngleY = -3.14159265F;

		rheingoldpassenger_dining2Model[105].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box59
		rheingoldpassenger_dining2Model[105].setRotationPoint(44F, -24.75F, -5F);

		rheingoldpassenger_dining2Model[106].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box60
		rheingoldpassenger_dining2Model[106].setRotationPoint(44F, -24.75F, 5F);

		rheingoldpassenger_dining2Model[107].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box63
		rheingoldpassenger_dining2Model[107].setRotationPoint(44F, -24.75F, -7F);

		rheingoldpassenger_dining2Model[108].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box65
		rheingoldpassenger_dining2Model[108].setRotationPoint(44F, -23.75F, 4F);

		rheingoldpassenger_dining2Model[109].addBox(0F, 0F, 0F, 5, 3, 6, 0F); // Box 102
		rheingoldpassenger_dining2Model[109].setRotationPoint(50F, -22.25F, -3F);

		rheingoldpassenger_dining2Model[110].addBox(0F, 0F, 0F, 25, 0, 1, 0F); // Box 126
		rheingoldpassenger_dining2Model[110].setRotationPoint(31F, -20.75F, -7F);

		rheingoldpassenger_dining2Model[111].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 127
		rheingoldpassenger_dining2Model[111].setRotationPoint(44F, -23.75F, -5F);

		rheingoldpassenger_dining2Model[112].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		rheingoldpassenger_dining2Model[112].setRotationPoint(47F, -24.75F, -5F);

		rheingoldpassenger_dining2Model[113].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 129
		rheingoldpassenger_dining2Model[113].setRotationPoint(47F, -24.75F, -7F);

		rheingoldpassenger_dining2Model[114].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 130
		rheingoldpassenger_dining2Model[114].setRotationPoint(47F, -24.75F, 5F);

		rheingoldpassenger_dining2Model[115].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.52F, 0F, 0F, -0.52F, 0F, 0F, -0.52F, 0F, 0F, -0.52F, 0F); // Box 91
		rheingoldpassenger_dining2Model[115].setRotationPoint(52F, -20.74F, 6F);

		rheingoldpassenger_dining2Model[116].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.52F, 0F, 0F, -0.52F, 0F, 0F, -0.52F, 0F, 0F, -0.52F, 0F); // Box 133
		rheingoldpassenger_dining2Model[116].setRotationPoint(35F, -20.74F, 6F);

		rheingoldpassenger_dining2Model[117].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.52F, 0F, 0F, -0.52F, 0F, 0F, -0.52F, 0F, 0F, -0.52F, 0F); // Box 134
		rheingoldpassenger_dining2Model[117].setRotationPoint(40F, -20.74F, 6F);

		rheingoldpassenger_dining2Model[118].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.52F, 0F, 0F, -0.52F, 0F, 0F, -0.52F, 0F, 0F, -0.52F, 0F); // Box 135
		rheingoldpassenger_dining2Model[118].setRotationPoint(47F, -20.74F, 6F);

		rheingoldpassenger_dining2Model[119].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.52F, 0F, 0F, -0.52F, 0F, 0F, -0.52F, 0F, 0F, -0.52F, 0F); // Box 137
		rheingoldpassenger_dining2Model[119].setRotationPoint(47F, -20.74F, -7F);

		rheingoldpassenger_dining2Model[120].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.52F, 0F, 0F, -0.52F, 0F, 0F, -0.52F, 0F, 0F, -0.52F, 0F); // Box 138
		rheingoldpassenger_dining2Model[120].setRotationPoint(52F, -20.74F, -7F);

		rheingoldpassenger_dining2Model[121].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.52F, 0F, 0F, -0.52F, 0F, 0F, -0.52F, 0F, 0F, -0.52F, 0F); // Box 139
		rheingoldpassenger_dining2Model[121].setRotationPoint(40F, -20.74F, -7F);

		rheingoldpassenger_dining2Model[122].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.52F, 0F, 0F, -0.52F, 0F, 0F, -0.52F, 0F, 0F, -0.52F, 0F); // Box 140
		rheingoldpassenger_dining2Model[122].setRotationPoint(35F, -20.74F, -7F);

		rheingoldpassenger_dining2Model[123].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F); // Box 108
		rheingoldpassenger_dining2Model[123].setRotationPoint(55F, -21.75F, 1.5F);

		rheingoldpassenger_dining2Model[124].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F); // Box 128
		rheingoldpassenger_dining2Model[124].setRotationPoint(55F, -21.75F, -2.5F);

		rheingoldpassenger_dining2Model[125].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F); // Box 129
		rheingoldpassenger_dining2Model[125].setRotationPoint(55F, -21.75F, -0.5F);

		rheingoldpassenger_dining2Model[126].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F); // Box 130
		rheingoldpassenger_dining2Model[126].setRotationPoint(50F, -21.75F, -1.5F);
		rheingoldpassenger_dining2Model[126].rotateAngleY = -3.14159265F;

		rheingoldpassenger_dining2Model[127].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F); // Box 131
		rheingoldpassenger_dining2Model[127].setRotationPoint(50F, -21.75F, 2.5F);
		rheingoldpassenger_dining2Model[127].rotateAngleY = -3.14159265F;

		rheingoldpassenger_dining2Model[128].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F); // Box 132
		rheingoldpassenger_dining2Model[128].setRotationPoint(50F, -21.75F, 0.5F);
		rheingoldpassenger_dining2Model[128].rotateAngleY = -3.14159265F;

		rheingoldpassenger_dining2Model[129].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F); // Box 133
		rheingoldpassenger_dining2Model[129].setRotationPoint(51.5F, -21.75F, 3F);
		rheingoldpassenger_dining2Model[129].rotateAngleY = -4.71238898F;

		rheingoldpassenger_dining2Model[130].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F); // Box 134
		rheingoldpassenger_dining2Model[130].setRotationPoint(54.5F, -21.75F, 3F);
		rheingoldpassenger_dining2Model[130].rotateAngleY = -4.71238898F;

		rheingoldpassenger_dining2Model[131].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F); // Box 135
		rheingoldpassenger_dining2Model[131].setRotationPoint(53F, -21.75F, 3F);
		rheingoldpassenger_dining2Model[131].rotateAngleY = -4.71238898F;

		rheingoldpassenger_dining2Model[132].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F); // Box 136
		rheingoldpassenger_dining2Model[132].setRotationPoint(52F, -21.75F, -3F);
		rheingoldpassenger_dining2Model[132].rotateAngleY = -1.57079633F;

		rheingoldpassenger_dining2Model[133].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F); // Box 137
		rheingoldpassenger_dining2Model[133].setRotationPoint(53.5F, -21.75F, -3F);
		rheingoldpassenger_dining2Model[133].rotateAngleY = -1.57079633F;

		rheingoldpassenger_dining2Model[134].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F); // Box 138
		rheingoldpassenger_dining2Model[134].setRotationPoint(50.5F, -21.75F, -3F);
		rheingoldpassenger_dining2Model[134].rotateAngleY = -1.57079633F;

		rheingoldpassenger_dining2Model[135].addShapeBox(0F, 0F, 0F, 5, 4, 4, 0F, -5F, -1F, -4F, 0F, -1F, -4F, 0F, -1F, 0F, -5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		rheingoldpassenger_dining2Model[135].setRotationPoint(-69F, -23F, -9F);

		rheingoldpassenger_dining2Model[136].addShapeBox(0F, 0F, 0F, 5, 4, 10, 0F, -5F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 173
		rheingoldpassenger_dining2Model[136].setRotationPoint(-69F, -23F, -5F);

		rheingoldpassenger_dining2Model[137].addShapeBox(0F, 0F, 0F, 5, 4, 4, 0F, -5F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -4F, -5F, -1F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 177
		rheingoldpassenger_dining2Model[137].setRotationPoint(-69F, -23F, 5F);

		rheingoldpassenger_dining2Model[138].addShapeBox(0F, 0F, 0F, 5, 4, 4, 0F, 0F, -1F, 0F, -5F, -1F, 0F, -5F, -1F, -4F, 0F, -1F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 178
		rheingoldpassenger_dining2Model[138].setRotationPoint(59F, -23F, 5F);

		rheingoldpassenger_dining2Model[139].addShapeBox(0F, 0F, 0F, 5, 4, 10, 0F, 0F, -1F, 0F, -5F, -1F, 0F, -5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 179
		rheingoldpassenger_dining2Model[139].setRotationPoint(59F, -23F, -5F);

		rheingoldpassenger_dining2Model[140].addShapeBox(0F, 0F, 0F, 5, 4, 4, 0F, 0F, -1F, -4F, -5F, -1F, -4F, -5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 180
		rheingoldpassenger_dining2Model[140].setRotationPoint(59F, -23F, -9F);

		rheingoldpassenger_dining2Model[141].addShapeBox(0F, 0F, 0F, 3, 4, 18, 0F, 0F, -1F, -4F, 0F, -1F, -4F, 0F, -1F, -4F, 0F, -1F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		rheingoldpassenger_dining2Model[141].setRotationPoint(56F, -23F, -9F);

		rheingoldpassenger_dining2Model[142].addShapeBox(0F, 0F, 0F, 95, 4, 18, 0F, 0F, -1F, -4F, 0F, -1F, -4F, 0F, -1F, -4F, 0F, -1F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 145
		rheingoldpassenger_dining2Model[142].setRotationPoint(-64F, -23F, -9F);

		rheingoldpassenger_dining2Model[143].addShapeBox(0F, 0F, 0F, 6, 4, 1, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 177
		rheingoldpassenger_dining2Model[143].setRotationPoint(-68F, -5F, -12F);

		rheingoldpassenger_dining2Model[144].addShapeBox(0F, 0F, 0F, 6, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 178
		rheingoldpassenger_dining2Model[144].setRotationPoint(-68F, -5F, 11F);

		rheingoldpassenger_dining2Model[145].addShapeBox(0F, 0F, 0F, 6, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 179
		rheingoldpassenger_dining2Model[145].setRotationPoint(47F, -5F, 11F);

		rheingoldpassenger_dining2Model[146].addShapeBox(0F, 0F, 0F, 6, 4, 1, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 180
		rheingoldpassenger_dining2Model[146].setRotationPoint(47F, -5F, -12F);

		rheingoldpassenger_dining2Model[147].addBox(0F, 0F, 0F, 4, 2, 2, 0F); // Box 181
		rheingoldpassenger_dining2Model[147].setRotationPoint(64F, 2.1F, -1F);

		rheingoldpassenger_dining2Model[148].addBox(0F, 0F, 0F, 4, 2, 2, 0F); // Box 182
		rheingoldpassenger_dining2Model[148].setRotationPoint(-73F, 2.1F, -1F);

		fixRotation(rheingoldpassenger_dining2Model, false, true, true);
	}

	private ModelRheingoldBogie bogie1 = new ModelRheingoldBogie();

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		for(int i = 0; i < 149; i++)
		{
			rheingoldpassenger_dining2Model[i].render(f5);
		}

		Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/Rheingold_Bogie.png"));
		GL11.glPushMatrix();
		GL11.glTranslated(-3,0.20,-0.375);
		bogie1.render(entity,f,f1,f2,f3,f4,f5);

		GL11.glTranslated(5.30,0,-0.00);
		bogie1.render(entity,f,f1,f2,f3,f4,f5);
		GL11.glPopMatrix();
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
	{
	}

	public ModelRendererTurbo rheingoldpassenger_dining2Model[];
}