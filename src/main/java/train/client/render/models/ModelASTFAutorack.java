//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2019 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator:
// Created on:02.10.2018 - 22:34:17
// Last changed on: 02.10.2018 - 22:34:17

package train.client.render.models;

import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import tmt.ModelBase;
import tmt.ModelRendererTurbo;
import tmt.Tessellator;
import train.common.library.Info;

public class ModelASTFAutorack extends ModelBase
{
	int textureX = 512;
	int textureY = 512;

	public ModelASTFAutorack()
	{
		astfautorackModel = new ModelRendererTurbo[148];
		astfautorackModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 1
		astfautorackModel[1] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 2
		astfautorackModel[2] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 3
		astfautorackModel[3] = new ModelRendererTurbo(this, 41, 25, textureX, textureY); // Box 4
		astfautorackModel[4] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 5
		astfautorackModel[5] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 6
		astfautorackModel[6] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 7
		astfautorackModel[7] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 8
		astfautorackModel[8] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 9
		astfautorackModel[9] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 10
		astfautorackModel[10] = new ModelRendererTurbo(this, 297, 9, textureX, textureY); // Box 11
		astfautorackModel[11] = new ModelRendererTurbo(this, 81, 25, textureX, textureY); // Box 12
		astfautorackModel[12] = new ModelRendererTurbo(this, 481, 9, textureX, textureY); // Box 13
		astfautorackModel[13] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 14
		astfautorackModel[14] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Box 15
		astfautorackModel[15] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 16
		astfautorackModel[16] = new ModelRendererTurbo(this, 41, 25, textureX, textureY); // Box 17
		astfautorackModel[17] = new ModelRendererTurbo(this, 97, 25, textureX, textureY); // Box 18
		astfautorackModel[18] = new ModelRendererTurbo(this, 65, 25, textureX, textureY); // Box 19
		astfautorackModel[19] = new ModelRendererTurbo(this, 105, 25, textureX, textureY); // Box 20
		astfautorackModel[20] = new ModelRendererTurbo(this, 121, 25, textureX, textureY); // Box 21
		astfautorackModel[21] = new ModelRendererTurbo(this, 129, 25, textureX, textureY); // Box 22
		astfautorackModel[22] = new ModelRendererTurbo(this, 145, 25, textureX, textureY); // Box 23
		astfautorackModel[23] = new ModelRendererTurbo(this, 161, 25, textureX, textureY); // Box 24
		astfautorackModel[24] = new ModelRendererTurbo(this, 169, 25, textureX, textureY); // Box 25
		astfautorackModel[25] = new ModelRendererTurbo(this, 185, 25, textureX, textureY); // Box 26
		astfautorackModel[26] = new ModelRendererTurbo(this, 201, 25, textureX, textureY); // Box 27
		astfautorackModel[27] = new ModelRendererTurbo(this, 209, 25, textureX, textureY); // Box 28
		astfautorackModel[28] = new ModelRendererTurbo(this, 225, 25, textureX, textureY); // Box 29
		astfautorackModel[29] = new ModelRendererTurbo(this, 241, 25, textureX, textureY); // Box 30
		astfautorackModel[30] = new ModelRendererTurbo(this, 249, 25, textureX, textureY); // Box 31
		astfautorackModel[31] = new ModelRendererTurbo(this, 265, 25, textureX, textureY); // Box 32
		astfautorackModel[32] = new ModelRendererTurbo(this, 281, 25, textureX, textureY); // Box 33
		astfautorackModel[33] = new ModelRendererTurbo(this, 289, 25, textureX, textureY); // Box 34
		astfautorackModel[34] = new ModelRendererTurbo(this, 305, 25, textureX, textureY); // Box 35
		astfautorackModel[35] = new ModelRendererTurbo(this, 321, 25, textureX, textureY); // Box 36
		astfautorackModel[36] = new ModelRendererTurbo(this, 329, 25, textureX, textureY); // Box 37
		astfautorackModel[37] = new ModelRendererTurbo(this, 345, 25, textureX, textureY); // Box 38
		astfautorackModel[38] = new ModelRendererTurbo(this, 361, 25, textureX, textureY); // Box 39
		astfautorackModel[39] = new ModelRendererTurbo(this, 369, 25, textureX, textureY); // Box 40
		astfautorackModel[40] = new ModelRendererTurbo(this, 385, 25, textureX, textureY); // Box 41
		astfautorackModel[41] = new ModelRendererTurbo(this, 401, 25, textureX, textureY); // Box 42
		astfautorackModel[42] = new ModelRendererTurbo(this, 417, 25, textureX, textureY); // Box 43
		astfautorackModel[43] = new ModelRendererTurbo(this, 433, 25, textureX, textureY); // Box 44
		astfautorackModel[44] = new ModelRendererTurbo(this, 449, 25, textureX, textureY); // Box 45
		astfautorackModel[45] = new ModelRendererTurbo(this, 465, 25, textureX, textureY); // Box 46
		astfautorackModel[46] = new ModelRendererTurbo(this, 481, 25, textureX, textureY); // Box 47
		astfautorackModel[47] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 48
		astfautorackModel[48] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Box 49
		astfautorackModel[49] = new ModelRendererTurbo(this, 41, 33, textureX, textureY); // Box 50
		astfautorackModel[50] = new ModelRendererTurbo(this, 65, 33, textureX, textureY); // Box 51
		astfautorackModel[51] = new ModelRendererTurbo(this, 105, 33, textureX, textureY); // Box 52
		astfautorackModel[52] = new ModelRendererTurbo(this, 129, 33, textureX, textureY); // Box 56
		astfautorackModel[53] = new ModelRendererTurbo(this, 137, 33, textureX, textureY); // Box 57
		astfautorackModel[54] = new ModelRendererTurbo(this, 169, 33, textureX, textureY); // Box 58
		astfautorackModel[55] = new ModelRendererTurbo(this, 185, 33, textureX, textureY); // Box 59
		astfautorackModel[56] = new ModelRendererTurbo(this, 153, 33, textureX, textureY); // Box 60
		astfautorackModel[57] = new ModelRendererTurbo(this, 209, 33, textureX, textureY); // Box 61
		astfautorackModel[58] = new ModelRendererTurbo(this, 225, 33, textureX, textureY); // Box 62
		astfautorackModel[59] = new ModelRendererTurbo(this, 249, 33, textureX, textureY); // Box 63
		astfautorackModel[60] = new ModelRendererTurbo(this, 257, 33, textureX, textureY); // Box 64
		astfautorackModel[61] = new ModelRendererTurbo(this, 289, 33, textureX, textureY); // Box 65
		astfautorackModel[62] = new ModelRendererTurbo(this, 273, 33, textureX, textureY); // Box 66
		astfautorackModel[63] = new ModelRendererTurbo(this, 305, 33, textureX, textureY); // Box 67
		astfautorackModel[64] = new ModelRendererTurbo(this, 329, 33, textureX, textureY); // Box 68
		astfautorackModel[65] = new ModelRendererTurbo(this, 345, 33, textureX, textureY); // Box 69
		astfautorackModel[66] = new ModelRendererTurbo(this, 369, 33, textureX, textureY); // Box 70
		astfautorackModel[67] = new ModelRendererTurbo(this, 385, 33, textureX, textureY); // Box 71
		astfautorackModel[68] = new ModelRendererTurbo(this, 353, 33, textureX, textureY); // Box 72
		astfautorackModel[69] = new ModelRendererTurbo(this, 401, 33, textureX, textureY); // Box 73
		astfautorackModel[70] = new ModelRendererTurbo(this, 417, 33, textureX, textureY); // Box 74
		astfautorackModel[71] = new ModelRendererTurbo(this, 433, 33, textureX, textureY); // Box 75
		astfautorackModel[72] = new ModelRendererTurbo(this, 441, 33, textureX, textureY); // Box 76
		astfautorackModel[73] = new ModelRendererTurbo(this, 457, 33, textureX, textureY); // Box 77
		astfautorackModel[74] = new ModelRendererTurbo(this, 473, 33, textureX, textureY); // Box 78
		astfautorackModel[75] = new ModelRendererTurbo(this, 481, 33, textureX, textureY); // Box 79
		astfautorackModel[76] = new ModelRendererTurbo(this, 497, 33, textureX, textureY); // Box 80
		astfautorackModel[77] = new ModelRendererTurbo(this, 105, 41, textureX, textureY); // Box 81
		astfautorackModel[78] = new ModelRendererTurbo(this, 137, 41, textureX, textureY); // Box 82
		astfautorackModel[79] = new ModelRendererTurbo(this, 169, 41, textureX, textureY); // Box 83
		astfautorackModel[80] = new ModelRendererTurbo(this, 113, 41, textureX, textureY); // Box 84
		astfautorackModel[81] = new ModelRendererTurbo(this, 185, 41, textureX, textureY); // Box 85
		astfautorackModel[82] = new ModelRendererTurbo(this, 209, 41, textureX, textureY); // Box 86
		astfautorackModel[83] = new ModelRendererTurbo(this, 225, 41, textureX, textureY); // Box 87
		astfautorackModel[84] = new ModelRendererTurbo(this, 257, 41, textureX, textureY); // Box 88
		astfautorackModel[85] = new ModelRendererTurbo(this, 289, 41, textureX, textureY); // Box 89
		astfautorackModel[86] = new ModelRendererTurbo(this, 233, 41, textureX, textureY); // Box 90
		astfautorackModel[87] = new ModelRendererTurbo(this, 305, 41, textureX, textureY); // Box 91
		astfautorackModel[88] = new ModelRendererTurbo(this, 329, 41, textureX, textureY); // Box 92
		astfautorackModel[89] = new ModelRendererTurbo(this, 369, 41, textureX, textureY); // Box 93
		astfautorackModel[90] = new ModelRendererTurbo(this, 385, 41, textureX, textureY); // Box 94
		astfautorackModel[91] = new ModelRendererTurbo(this, 401, 41, textureX, textureY); // Box 95
		astfautorackModel[92] = new ModelRendererTurbo(this, 417, 41, textureX, textureY); // Box 96
		astfautorackModel[93] = new ModelRendererTurbo(this, 441, 41, textureX, textureY); // Box 97
		astfautorackModel[94] = new ModelRendererTurbo(this, 457, 41, textureX, textureY); // Box 98
		astfautorackModel[95] = new ModelRendererTurbo(this, 481, 41, textureX, textureY); // Box 99
		astfautorackModel[96] = new ModelRendererTurbo(this, 497, 41, textureX, textureY); // Box 100
		astfautorackModel[97] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 101
		astfautorackModel[98] = new ModelRendererTurbo(this, 17, 49, textureX, textureY); // Box 102
		astfautorackModel[99] = new ModelRendererTurbo(this, 33, 49, textureX, textureY); // Box 103
		astfautorackModel[100] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 104
		astfautorackModel[101] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 105
		astfautorackModel[102] = new ModelRendererTurbo(this, 297, 49, textureX, textureY); // Box 106
		astfautorackModel[103] = new ModelRendererTurbo(this, 329, 49, textureX, textureY); // Box 107
		astfautorackModel[104] = new ModelRendererTurbo(this, 49, 49, textureX, textureY); // Box 108
		astfautorackModel[105] = new ModelRendererTurbo(this, 169, 49, textureX, textureY); // Box 109
		astfautorackModel[106] = new ModelRendererTurbo(this, 369, 49, textureX, textureY); // Box 110
		astfautorackModel[107] = new ModelRendererTurbo(this, 65, 49, textureX, textureY); // Box 111
		astfautorackModel[108] = new ModelRendererTurbo(this, 393, 49, textureX, textureY); // Box 112
		astfautorackModel[109] = new ModelRendererTurbo(this, 441, 49, textureX, textureY); // Box 113
		astfautorackModel[110] = new ModelRendererTurbo(this, 481, 49, textureX, textureY); // Box 114
		astfautorackModel[111] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 115
		astfautorackModel[112] = new ModelRendererTurbo(this, 137, 49, textureX, textureY); // Box 116
		astfautorackModel[113] = new ModelRendererTurbo(this, 25, 57, textureX, textureY); // Box 117
		astfautorackModel[114] = new ModelRendererTurbo(this, 57, 57, textureX, textureY); // Box 118
		astfautorackModel[115] = new ModelRendererTurbo(this, 209, 49, textureX, textureY); // Box 119
		astfautorackModel[116] = new ModelRendererTurbo(this, 257, 49, textureX, textureY); // Box 120
		astfautorackModel[117] = new ModelRendererTurbo(this, 193, 57, textureX, textureY); // Box 121
		astfautorackModel[118] = new ModelRendererTurbo(this, 345, 65, textureX, textureY); // Box 122
		astfautorackModel[119] = new ModelRendererTurbo(this, 89, 57, textureX, textureY); // Box 123
		astfautorackModel[120] = new ModelRendererTurbo(this, 369, 65, textureX, textureY); // Box 124
		astfautorackModel[121] = new ModelRendererTurbo(this, 401, 65, textureX, textureY); // Box 125
		astfautorackModel[122] = new ModelRendererTurbo(this, 433, 65, textureX, textureY); // Box 126
		astfautorackModel[123] = new ModelRendererTurbo(this, 457, 65, textureX, textureY); // Box 127
		astfautorackModel[124] = new ModelRendererTurbo(this, 137, 57, textureX, textureY); // Box 128
		astfautorackModel[125] = new ModelRendererTurbo(this, 481, 65, textureX, textureY); // Box 129
		astfautorackModel[126] = new ModelRendererTurbo(this, 321, 81, textureX, textureY); // Box 130
		astfautorackModel[127] = new ModelRendererTurbo(this, 257, 57, textureX, textureY); // Box 131
		astfautorackModel[128] = new ModelRendererTurbo(this, 353, 81, textureX, textureY); // Box 132
		astfautorackModel[129] = new ModelRendererTurbo(this, 385, 81, textureX, textureY); // Box 133
		astfautorackModel[130] = new ModelRendererTurbo(this, 417, 81, textureX, textureY); // Box 134
		astfautorackModel[131] = new ModelRendererTurbo(this, 449, 81, textureX, textureY); // Box 135
		astfautorackModel[132] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Company Logo
		astfautorackModel[133] = new ModelRendererTurbo(this, 1, 121, textureX, textureY); // Box 137
		astfautorackModel[134] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Box 138
		astfautorackModel[135] = new ModelRendererTurbo(this, 1, 137, textureX, textureY); // Box 139
		astfautorackModel[136] = new ModelRendererTurbo(this, 1, 145, textureX, textureY); // Box 140
		astfautorackModel[137] = new ModelRendererTurbo(this, 297, 97, textureX, textureY); // Box 141
		astfautorackModel[138] = new ModelRendererTurbo(this, 297, 105, textureX, textureY); // Box 142
		astfautorackModel[139] = new ModelRendererTurbo(this, 281, 57, textureX, textureY); // Box 143
		astfautorackModel[140] = new ModelRendererTurbo(this, 313, 57, textureX, textureY); // Box 144
		astfautorackModel[141] = new ModelRendererTurbo(this, 89, 65, textureX, textureY); // Box 145
		astfautorackModel[142] = new ModelRendererTurbo(this, 121, 65, textureX, textureY); // Box 146
		astfautorackModel[143] = new ModelRendererTurbo(this, 297, 81, textureX, textureY); // Company Logo
		astfautorackModel[144] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 148
		astfautorackModel[145] = new ModelRendererTurbo(this, 137, 65, textureX, textureY); // Box 149
		astfautorackModel[146] = new ModelRendererTurbo(this, 153, 65, textureX, textureY); // Box 150
		astfautorackModel[147] = new ModelRendererTurbo(this, 169, 65, textureX, textureY); // Box 151

		astfautorackModel[0].addBox(0F, 0F, 0F, 137, 2, 20, 0F); // Box 1
		astfautorackModel[0].setRotationPoint(-53F, 3F, -10F);

		astfautorackModel[1].addBox(0F, 0F, 0F, 80, 2, 16, 0F); // Box 2
		astfautorackModel[1].setRotationPoint(-26F, 5F, -8F);

		astfautorackModel[2].addShapeBox(0F, 0F, 0F, 3, 2, 16, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 3
		astfautorackModel[2].setRotationPoint(-29F, 5F, -8F);

		astfautorackModel[3].addShapeBox(0F, 0F, 0F, 3, 2, 16, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 4
		astfautorackModel[3].setRotationPoint(54F, 5F, -8F);

		astfautorackModel[4].addShapeBox(0F, 0F, 0F, 1, 28, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		astfautorackModel[4].setRotationPoint(-38F, -27F, -10F);

		astfautorackModel[5].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		astfautorackModel[5].setRotationPoint(-38.5F, 1F, -10.5F);

		astfautorackModel[6].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 7
		astfautorackModel[6].setRotationPoint(-39F, -24F, -9.5F);

		astfautorackModel[7].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		astfautorackModel[7].setRotationPoint(78F, 1F, -10.5F);

		astfautorackModel[8].addShapeBox(0F, 0F, 0F, 1, 28, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 9
		astfautorackModel[8].setRotationPoint(78.5F, -27F, -10F);

		astfautorackModel[9].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 10
		astfautorackModel[9].setRotationPoint(77.5F, -24F, -9.5F);

		astfautorackModel[10].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		astfautorackModel[10].setRotationPoint(65F, 1F, -10.5F);

		astfautorackModel[11].addShapeBox(0F, 0F, 0F, 1, 28, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		astfautorackModel[11].setRotationPoint(65.5F, -27F, -10F);

		astfautorackModel[12].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 13
		astfautorackModel[12].setRotationPoint(64.5F, -24F, -9.5F);

		astfautorackModel[13].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		astfautorackModel[13].setRotationPoint(54F, 1F, -10.5F);

		astfautorackModel[14].addShapeBox(0F, 0F, 0F, 1, 28, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		astfautorackModel[14].setRotationPoint(54.5F, -27F, -10F);

		astfautorackModel[15].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 16
		astfautorackModel[15].setRotationPoint(53.5F, -24F, -9.5F);

		astfautorackModel[16].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		astfautorackModel[16].setRotationPoint(42F, 1F, -10.5F);

		astfautorackModel[17].addShapeBox(0F, 0F, 0F, 1, 28, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 18
		astfautorackModel[17].setRotationPoint(42.5F, -27F, -10F);

		astfautorackModel[18].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 19
		astfautorackModel[18].setRotationPoint(41.5F, -24F, -9.5F);

		astfautorackModel[19].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 20
		astfautorackModel[19].setRotationPoint(31F, 1F, -10.5F);

		astfautorackModel[20].addShapeBox(0F, 0F, 0F, 1, 28, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 21
		astfautorackModel[20].setRotationPoint(31.5F, -27F, -10F);

		astfautorackModel[21].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 22
		astfautorackModel[21].setRotationPoint(30.5F, -24F, -9.5F);

		astfautorackModel[22].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 23
		astfautorackModel[22].setRotationPoint(19.5F, 1F, -10.5F);

		astfautorackModel[23].addShapeBox(0F, 0F, 0F, 1, 28, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		astfautorackModel[23].setRotationPoint(20F, -27F, -10F);

		astfautorackModel[24].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 25
		astfautorackModel[24].setRotationPoint(19F, -24F, -9.5F);

		astfautorackModel[25].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		astfautorackModel[25].setRotationPoint(7.5F, 1F, -10.5F);

		astfautorackModel[26].addShapeBox(0F, 0F, 0F, 1, 28, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
		astfautorackModel[26].setRotationPoint(8F, -27F, -10F);

		astfautorackModel[27].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 28
		astfautorackModel[27].setRotationPoint(7F, -24F, -9.5F);

		astfautorackModel[28].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 29
		astfautorackModel[28].setRotationPoint(-3.5F, 1F, -10.5F);

		astfautorackModel[29].addShapeBox(0F, 0F, 0F, 1, 28, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 30
		astfautorackModel[29].setRotationPoint(-3F, -27F, -10F);

		astfautorackModel[30].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 31
		astfautorackModel[30].setRotationPoint(-4F, -24F, -9.5F);

		astfautorackModel[31].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 32
		astfautorackModel[31].setRotationPoint(-15F, 1F, -10.5F);

		astfautorackModel[32].addShapeBox(0F, 0F, 0F, 1, 28, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
		astfautorackModel[32].setRotationPoint(-14.5F, -27F, -10F);

		astfautorackModel[33].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 34
		astfautorackModel[33].setRotationPoint(-15.5F, -24F, -9.5F);

		astfautorackModel[34].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 35
		astfautorackModel[34].setRotationPoint(-27F, 1F, -10.5F);

		astfautorackModel[35].addShapeBox(0F, 0F, 0F, 1, 28, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 36
		astfautorackModel[35].setRotationPoint(-26.5F, -27F, -10F);

		astfautorackModel[36].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 37
		astfautorackModel[36].setRotationPoint(-27.5F, -24F, -9.5F);

		astfautorackModel[37].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		astfautorackModel[37].setRotationPoint(-50F, 1F, -10.5F);

		astfautorackModel[38].addShapeBox(0F, 0F, 0F, 1, 28, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39
		astfautorackModel[38].setRotationPoint(-49.5F, -27F, -10F);

		astfautorackModel[39].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 40
		astfautorackModel[39].setRotationPoint(-50.5F, -24F, -9.5F);

		astfautorackModel[40].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 41
		astfautorackModel[40].setRotationPoint(-39F, -11F, -9.5F);

		astfautorackModel[41].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 42
		astfautorackModel[41].setRotationPoint(-50.5F, -11F, -9.5F);

		astfautorackModel[42].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 43
		astfautorackModel[42].setRotationPoint(-27.5F, -11F, -9.5F);

		astfautorackModel[43].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 44
		astfautorackModel[43].setRotationPoint(-15.5F, -11F, -9.5F);

		astfautorackModel[44].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 45
		astfautorackModel[44].setRotationPoint(-4F, -11F, -9.5F);

		astfautorackModel[45].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 46
		astfautorackModel[45].setRotationPoint(7F, -11F, -9.5F);

		astfautorackModel[46].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 47
		astfautorackModel[46].setRotationPoint(19F, -11F, -9.5F);

		astfautorackModel[47].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 48
		astfautorackModel[47].setRotationPoint(30.5F, -11F, -9.5F);

		astfautorackModel[48].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 49
		astfautorackModel[48].setRotationPoint(41.5F, -11F, -9.5F);

		astfautorackModel[49].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 50
		astfautorackModel[49].setRotationPoint(53.5F, -11F, -9.5F);

		astfautorackModel[50].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 51
		astfautorackModel[50].setRotationPoint(64.5F, -11F, -9.5F);

		astfautorackModel[51].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 52
		astfautorackModel[51].setRotationPoint(77.5F, -11F, -9.5F);

		astfautorackModel[52].addShapeBox(0F, 0F, 0F, 1, 28, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 56
		astfautorackModel[52].setRotationPoint(-38F, -27F, 9F);

		astfautorackModel[53].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 57
		astfautorackModel[53].setRotationPoint(-38.5F, 1F, 8.5F);

		astfautorackModel[54].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 58
		astfautorackModel[54].setRotationPoint(-39F, -24F, 8.5F);

		astfautorackModel[55].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 59
		astfautorackModel[55].setRotationPoint(78F, 1F, 8.5F);

		astfautorackModel[56].addShapeBox(0F, 0F, 0F, 1, 28, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 60
		astfautorackModel[56].setRotationPoint(78.5F, -27F, 9F);

		astfautorackModel[57].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 61
		astfautorackModel[57].setRotationPoint(77.5F, -24F, 8.5F);

		astfautorackModel[58].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 62
		astfautorackModel[58].setRotationPoint(65F, 1F, 8.5F);

		astfautorackModel[59].addShapeBox(0F, 0F, 0F, 1, 28, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 63
		astfautorackModel[59].setRotationPoint(65.5F, -27F, 9F);

		astfautorackModel[60].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 64
		astfautorackModel[60].setRotationPoint(64.5F, -24F, 8.5F);

		astfautorackModel[61].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 65
		astfautorackModel[61].setRotationPoint(54F, 1F, 8.5F);

		astfautorackModel[62].addShapeBox(0F, 0F, 0F, 1, 28, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 66
		astfautorackModel[62].setRotationPoint(54.5F, -27F, 9F);

		astfautorackModel[63].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 67
		astfautorackModel[63].setRotationPoint(53.5F, -24F, 8.5F);

		astfautorackModel[64].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 68
		astfautorackModel[64].setRotationPoint(42F, 1F, 8.5F);

		astfautorackModel[65].addShapeBox(0F, 0F, 0F, 1, 28, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 69
		astfautorackModel[65].setRotationPoint(42.5F, -27F, 9F);

		astfautorackModel[66].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 70
		astfautorackModel[66].setRotationPoint(41.5F, -24F, 8.5F);

		astfautorackModel[67].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 71
		astfautorackModel[67].setRotationPoint(31F, 1F, 8.5F);

		astfautorackModel[68].addShapeBox(0F, 0F, 0F, 1, 28, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 72
		astfautorackModel[68].setRotationPoint(31.5F, -27F, 9F);

		astfautorackModel[69].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 73
		astfautorackModel[69].setRotationPoint(30.5F, -24F, 8.5F);

		astfautorackModel[70].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 74
		astfautorackModel[70].setRotationPoint(19.5F, 1F, 8.5F);

		astfautorackModel[71].addShapeBox(0F, 0F, 0F, 1, 28, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 75
		astfautorackModel[71].setRotationPoint(20F, -27F, 9F);

		astfautorackModel[72].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 76
		astfautorackModel[72].setRotationPoint(19F, -24F, 8.5F);

		astfautorackModel[73].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 77
		astfautorackModel[73].setRotationPoint(7.5F, 1F, 8.5F);

		astfautorackModel[74].addShapeBox(0F, 0F, 0F, 1, 28, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 78
		astfautorackModel[74].setRotationPoint(8F, -27F, 9F);

		astfautorackModel[75].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 79
		astfautorackModel[75].setRotationPoint(7F, -24F, 8.5F);

		astfautorackModel[76].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 80
		astfautorackModel[76].setRotationPoint(-3.5F, 1F, 8.5F);

		astfautorackModel[77].addShapeBox(0F, 0F, 0F, 1, 28, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 81
		astfautorackModel[77].setRotationPoint(-3F, -27F, 9F);

		astfautorackModel[78].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 82
		astfautorackModel[78].setRotationPoint(-4F, -24F, 8.5F);

		astfautorackModel[79].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 83
		astfautorackModel[79].setRotationPoint(-15F, 1F, 8.5F);

		astfautorackModel[80].addShapeBox(0F, 0F, 0F, 1, 28, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 84
		astfautorackModel[80].setRotationPoint(-14.5F, -27F, 9F);

		astfautorackModel[81].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 85
		astfautorackModel[81].setRotationPoint(-15.5F, -24F, 8.5F);

		astfautorackModel[82].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 86
		astfautorackModel[82].setRotationPoint(-27F, 1F, 8.5F);

		astfautorackModel[83].addShapeBox(0F, 0F, 0F, 1, 28, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 87
		astfautorackModel[83].setRotationPoint(-26.5F, -27F, 9F);

		astfautorackModel[84].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 88
		astfautorackModel[84].setRotationPoint(-27.5F, -24F, 8.5F);

		astfautorackModel[85].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 89
		astfautorackModel[85].setRotationPoint(-50F, 1F, 8.5F);

		astfautorackModel[86].addShapeBox(0F, 0F, 0F, 1, 28, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 90
		astfautorackModel[86].setRotationPoint(-49.5F, -27F, 9F);

		astfautorackModel[87].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 91
		astfautorackModel[87].setRotationPoint(-50.5F, -24F, 8.5F);

		astfautorackModel[88].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 92
		astfautorackModel[88].setRotationPoint(-39F, -11F, 8.5F);

		astfautorackModel[89].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 93
		astfautorackModel[89].setRotationPoint(-50.5F, -11F, 8.5F);

		astfautorackModel[90].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 94
		astfautorackModel[90].setRotationPoint(-27.5F, -11F, 8.5F);

		astfautorackModel[91].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 95
		astfautorackModel[91].setRotationPoint(-15.5F, -11F, 8.5F);

		astfautorackModel[92].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 96
		astfautorackModel[92].setRotationPoint(-4F, -11F, 8.5F);

		astfautorackModel[93].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 97
		astfautorackModel[93].setRotationPoint(7F, -11F, 8.5F);

		astfautorackModel[94].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 98
		astfautorackModel[94].setRotationPoint(19F, -11F, 8.5F);

		astfautorackModel[95].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 99
		astfautorackModel[95].setRotationPoint(30.5F, -11F, 8.5F);

		astfautorackModel[96].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 100
		astfautorackModel[96].setRotationPoint(41.5F, -11F, 8.5F);

		astfautorackModel[97].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 101
		astfautorackModel[97].setRotationPoint(53.5F, -11F, 8.5F);

		astfautorackModel[98].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 102
		astfautorackModel[98].setRotationPoint(64.5F, -11F, 8.5F);

		astfautorackModel[99].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 103
		astfautorackModel[99].setRotationPoint(77.5F, -11F, 8.5F);

		astfautorackModel[100].addShapeBox(0F, 0F, 0F, 137, 1, 19, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 104
		astfautorackModel[100].setRotationPoint(-53F, -11.5F, -9.5F);

		astfautorackModel[101].addShapeBox(0F, 0F, 0F, 137, 1, 19, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 105
		astfautorackModel[101].setRotationPoint(-53F, -24.5F, -9.5F);

		astfautorackModel[102].addShapeBox(0F, 0F, 0F, 4, 28, 1, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 106
		astfautorackModel[102].setRotationPoint(-53.5F, -27F, -10.5F);

		astfautorackModel[103].addShapeBox(0F, 0F, 0F, 4, 28, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F); // Box 107
		astfautorackModel[103].setRotationPoint(79.5F, -27F, 9.5F);

		astfautorackModel[104].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 108
		astfautorackModel[104].setRotationPoint(1.5F, -5F, -10F);

		astfautorackModel[105].addShapeBox(0F, 0F, 0F, 10, 13, 1, 0F, 0F, 0F, -0.2F, 0F, -12F, -0.2F, 0F, -12F, -0.2F, 0F, 0F, -0.2F, 0F, -12F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -12F, -0.2F); // Box 109
		astfautorackModel[105].setRotationPoint(-2F, -10.25F, -10F);

		astfautorackModel[106].addShapeBox(0F, 0F, 0F, 10, 13, 1, 0F, 0F, -12F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -12F, -0.2F, 0F, 0F, -0.2F, 0F, -12F, -0.2F, 0F, -12F, -0.2F, 0F, 0F, -0.2F); // Box 110
		astfautorackModel[106].setRotationPoint(-2F, -10.25F, -10F);

		astfautorackModel[107].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 111
		astfautorackModel[107].setRotationPoint(-22F, -5F, -10F);

		astfautorackModel[108].addShapeBox(0F, 0F, 0F, 11, 13, 1, 0F, 0F, -12F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -12F, -0.2F, 0F, 0F, -0.2F, 0F, -12F, -0.2F, 0F, -12F, -0.2F, 0F, 0F, -0.2F); // Box 112
		astfautorackModel[108].setRotationPoint(-25.5F, -10.25F, -10F);

		astfautorackModel[109].addShapeBox(0F, 0F, 0F, 11, 13, 1, 0F, 0F, 0F, -0.2F, 0F, -12F, -0.2F, 0F, -12F, -0.2F, 0F, 0F, -0.2F, 0F, -12F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -12F, -0.2F); // Box 113
		astfautorackModel[109].setRotationPoint(-25.5F, -10.25F, -10F);

		astfautorackModel[110].addShapeBox(0F, 0F, 0F, 10, 13, 1, 0F, 0F, -12F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -12F, -0.2F, 0F, 0F, -0.2F, 0F, -12F, -0.2F, 0F, -12F, -0.2F, 0F, 0F, -0.2F); // Box 114
		astfautorackModel[110].setRotationPoint(32.5F, -10.25F, -10F);

		astfautorackModel[111].addShapeBox(0F, 0F, 0F, 10, 13, 1, 0F, 0F, 0F, -0.2F, 0F, -12F, -0.2F, 0F, -12F, -0.2F, 0F, 0F, -0.2F, 0F, -12F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -12F, -0.2F); // Box 115
		astfautorackModel[111].setRotationPoint(32.5F, -10.25F, -10F);

		astfautorackModel[112].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 116
		astfautorackModel[112].setRotationPoint(36F, -5F, -10F);

		astfautorackModel[113].addShapeBox(0F, 0F, 0F, 11, 13, 1, 0F, 0F, -12F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -12F, -0.2F, 0F, 0F, -0.2F, 0F, -12F, -0.2F, 0F, -12F, -0.2F, 0F, 0F, -0.2F); // Box 117
		astfautorackModel[113].setRotationPoint(43.5F, -23.25F, -10F);

		astfautorackModel[114].addShapeBox(0F, 0F, 0F, 11, 13, 1, 0F, 0F, 0F, -0.2F, 0F, -12F, -0.2F, 0F, -12F, -0.2F, 0F, 0F, -0.2F, 0F, -12F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -12F, -0.2F); // Box 118
		astfautorackModel[114].setRotationPoint(43.5F, -23.25F, -10F);

		astfautorackModel[115].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 119
		astfautorackModel[115].setRotationPoint(47F, -18F, -10F);

		astfautorackModel[116].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 120
		astfautorackModel[116].setRotationPoint(1.5F, -5F, 9F);

		astfautorackModel[117].addShapeBox(0F, 0F, 0F, 10, 13, 1, 0F, 0F, 0F, -0.2F, 0F, -12F, -0.2F, 0F, -12F, -0.2F, 0F, 0F, -0.2F, 0F, -12F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -12F, -0.2F); // Box 121
		astfautorackModel[117].setRotationPoint(-2F, -10.25F, 9F);

		astfautorackModel[118].addShapeBox(0F, 0F, 0F, 10, 13, 1, 0F, 0F, -12F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -12F, -0.2F, 0F, 0F, -0.2F, 0F, -12F, -0.2F, 0F, -12F, -0.2F, 0F, 0F, -0.2F); // Box 122
		astfautorackModel[118].setRotationPoint(-2F, -10.25F, 9F);

		astfautorackModel[119].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 123
		astfautorackModel[119].setRotationPoint(-22F, -5F, 9F);

		astfautorackModel[120].addShapeBox(0F, 0F, 0F, 11, 13, 1, 0F, 0F, -12F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -12F, -0.2F, 0F, 0F, -0.2F, 0F, -12F, -0.2F, 0F, -12F, -0.2F, 0F, 0F, -0.2F); // Box 124
		astfautorackModel[120].setRotationPoint(-25.5F, -10.25F, 9F);

		astfautorackModel[121].addShapeBox(0F, 0F, 0F, 11, 13, 1, 0F, 0F, 0F, -0.2F, 0F, -12F, -0.2F, 0F, -12F, -0.2F, 0F, 0F, -0.2F, 0F, -12F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -12F, -0.2F); // Box 125
		astfautorackModel[121].setRotationPoint(-25.5F, -10.25F, 9F);

		astfautorackModel[122].addShapeBox(0F, 0F, 0F, 10, 13, 1, 0F, 0F, -12F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -12F, -0.2F, 0F, 0F, -0.2F, 0F, -12F, -0.2F, 0F, -12F, -0.2F, 0F, 0F, -0.2F); // Box 126
		astfautorackModel[122].setRotationPoint(32.5F, -10.25F, 9F);

		astfautorackModel[123].addShapeBox(0F, 0F, 0F, 10, 13, 1, 0F, 0F, 0F, -0.2F, 0F, -12F, -0.2F, 0F, -12F, -0.2F, 0F, 0F, -0.2F, 0F, -12F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -12F, -0.2F); // Box 127
		astfautorackModel[123].setRotationPoint(32.5F, -10.25F, 9F);

		astfautorackModel[124].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		astfautorackModel[124].setRotationPoint(36F, -5F, 9F);

		astfautorackModel[125].addShapeBox(0F, 0F, 0F, 11, 13, 1, 0F, 0F, -12F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -12F, -0.2F, 0F, 0F, -0.2F, 0F, -12F, -0.2F, 0F, -12F, -0.2F, 0F, 0F, -0.2F); // Box 129
		astfautorackModel[125].setRotationPoint(43.5F, -23.25F, 9F);

		astfautorackModel[126].addShapeBox(0F, 0F, 0F, 11, 13, 1, 0F, 0F, 0F, -0.2F, 0F, -12F, -0.2F, 0F, -12F, -0.2F, 0F, 0F, -0.2F, 0F, -12F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -12F, -0.2F); // Box 130
		astfautorackModel[126].setRotationPoint(43.5F, -23.25F, 9F);

		astfautorackModel[127].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 131
		astfautorackModel[127].setRotationPoint(47F, -18F, 9F);

		astfautorackModel[128].addShapeBox(0F, 0F, 0F, 11, 13, 1, 0F, 0F, -12F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -12F, -0.2F, 0F, 0F, -0.2F, 0F, -12F, -0.2F, 0F, -12F, -0.2F, 0F, 0F, -0.2F); // Box 132
		astfautorackModel[128].setRotationPoint(9F, -23.25F, -10F);

		astfautorackModel[129].addShapeBox(0F, 0F, 0F, 11, 13, 1, 0F, 0F, 0F, -0.2F, 0F, -12F, -0.2F, 0F, -12F, -0.2F, 0F, 0F, -0.2F, 0F, -12F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -12F, -0.2F); // Box 133
		astfautorackModel[129].setRotationPoint(9F, -23.25F, -10F);

		astfautorackModel[130].addShapeBox(0F, 0F, 0F, 11, 13, 1, 0F, 0F, 0F, -0.2F, 0F, -12F, -0.2F, 0F, -12F, -0.2F, 0F, 0F, -0.2F, 0F, -12F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -12F, -0.2F); // Box 134
		astfautorackModel[130].setRotationPoint(9F, -23.25F, 9F);

		astfautorackModel[131].addShapeBox(0F, 0F, 0F, 11, 13, 1, 0F, 0F, -12F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -12F, -0.2F, 0F, 0F, -0.2F, 0F, -12F, -0.2F, 0F, -12F, -0.2F, 0F, 0F, -0.2F); // Box 135
		astfautorackModel[131].setRotationPoint(9F, -23.25F, 9F);

		astfautorackModel[132].addShapeBox(0F, 0F, 0F, 8, 8, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Company Logo
		astfautorackModel[132].setRotationPoint(10.5F, -21F, -10F);

		astfautorackModel[133].addShapeBox(0F, 0F, 0F, 127, 3, 1, 0F, 0F, -0.5F, -0.8F, 0F, -0.5F, -0.8F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 137
		astfautorackModel[133].setRotationPoint(-48.5F, -27F, -10.25F);

		astfautorackModel[134].addShapeBox(0F, 0F, 0F, 127, 3, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.8F, 0F, -0.5F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F); // Box 138
		astfautorackModel[134].setRotationPoint(-48.5F, -27F, 9.25F);

		astfautorackModel[135].addShapeBox(0F, 0F, 0F, 127, 3, 1, 0F, 0F, -0.5F, -0.8F, 0F, -0.5F, -0.8F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 139
		astfautorackModel[135].setRotationPoint(-48.5F, -14F, -10.3F);

		astfautorackModel[136].addShapeBox(0F, 0F, 0F, 127, 3, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.8F, 0F, -0.5F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F); // Box 140
		astfautorackModel[136].setRotationPoint(-48.5F, -14F, 9.3F);

		astfautorackModel[137].addShapeBox(0F, 0F, 0F, 80, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 141
		astfautorackModel[137].setRotationPoint(-26F, 5F, 8F);

		astfautorackModel[138].addShapeBox(0F, 0F, 0F, 80, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 142
		astfautorackModel[138].setRotationPoint(-26F, 5F, -10F);

		astfautorackModel[139].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -3F, 0F, -2F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 143
		astfautorackModel[139].setRotationPoint(54F, 5F, -10F);

		astfautorackModel[140].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -2F, 0F, 0F, -2F); // Box 144
		astfautorackModel[140].setRotationPoint(54F, 5F, 8F);

		astfautorackModel[141].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -3F, 0F, -2F); // Box 145
		astfautorackModel[141].setRotationPoint(-29F, 5F, 8F);

		astfautorackModel[142].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 146
		astfautorackModel[142].setRotationPoint(-29F, 5F, -10F);

		astfautorackModel[143].addShapeBox(0F, 0F, 0F, 8, 8, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Company Logo
		astfautorackModel[143].setRotationPoint(10.5F, -21F, 9F);

		astfautorackModel[144].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 148
		astfautorackModel[144].setRotationPoint(-42F, 5F, -1F);

		astfautorackModel[145].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 149
		astfautorackModel[145].setRotationPoint(67.5F, 5F, -1F);

		astfautorackModel[146].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F, -0.5F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -0.5F, -0.2F, 0F); // Box 150
		astfautorackModel[146].setRotationPoint(-56F, 3F, -1F);

		astfautorackModel[147].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F, 0F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 151
		astfautorackModel[147].setRotationPoint(84F, 3F, -1F);


	}

	ModelAmericanFreightTrucks bogie = new ModelAmericanFreightTrucks();

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		for(int i = 0; i < 148; i++)
		{
			astfautorackModel[i].render(f5);
		}
		Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/AmericanFreightTrucks.png"));
		GL11.glPushMatrix();
		GL11.glTranslatef(-2.65f,0.6f,-0.35f);
		bogie.render(entity, f, f1, f2, f3, f4, f5);

		GL11.glTranslatef(6.9f,0f,0);
		bogie.render(entity, f, f1, f2, f3, f4, f5);
		GL11.glPopMatrix();
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
	{
	}

	public ModelRendererTurbo astfautorackModel[];
}