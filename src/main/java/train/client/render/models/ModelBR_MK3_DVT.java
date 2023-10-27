//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2023 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 14.10.2021 - 00:55:19
// Last changed on: 14.10.2021 - 00:55:19

package train.client.render.models; //Path where the model is located

import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import org.lwjgl.opengl.GL11;
import tmt.ModelConverter;
import tmt.ModelRendererTurbo;

public class ModelBR_MK3_DVT extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelBR_MK3_DVT() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[202];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // 01
		bodyModel[1] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // 02
		bodyModel[2] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // 03
		bodyModel[3] = new ModelRendererTurbo(this, 193, 9, textureX, textureY); // 04
		bodyModel[4] = new ModelRendererTurbo(this, 353, 9, textureX, textureY); // 05
		bodyModel[5] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // 06
		bodyModel[6] = new ModelRendererTurbo(this, 153, 25, textureX, textureY); // 07
		bodyModel[7] = new ModelRendererTurbo(this, 297, 25, textureX, textureY); // 08
		bodyModel[8] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // 09
		bodyModel[9] = new ModelRendererTurbo(this, 145, 33, textureX, textureY); // 10
		bodyModel[10] = new ModelRendererTurbo(this, 305, 33, textureX, textureY); // 11
		bodyModel[11] = new ModelRendererTurbo(this, 441, 25, textureX, textureY); // 12
		bodyModel[12] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // 13
		bodyModel[13] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // 14
		bodyModel[14] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // 15
		bodyModel[15] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // 16
		bodyModel[16] = new ModelRendererTurbo(this, 177, 9, textureX, textureY); // 17
		bodyModel[17] = new ModelRendererTurbo(this, 449, 25, textureX, textureY); // 18
		bodyModel[18] = new ModelRendererTurbo(this, 49, 41, textureX, textureY); // 19
		bodyModel[19] = new ModelRendererTurbo(this, 473, 25, textureX, textureY); // 20
		bodyModel[20] = new ModelRendererTurbo(this, 481, 25, textureX, textureY); // 21
		bodyModel[21] = new ModelRendererTurbo(this, 489, 25, textureX, textureY); // 22
		bodyModel[22] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // 23
		bodyModel[23] = new ModelRendererTurbo(this, 9, 41, textureX, textureY); // 24
		bodyModel[24] = new ModelRendererTurbo(this, 33, 41, textureX, textureY); // 25
		bodyModel[25] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // 26
		bodyModel[26] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // 27
		bodyModel[27] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // 28
		bodyModel[28] = new ModelRendererTurbo(this, 177, 9, textureX, textureY); // 29
		bodyModel[29] = new ModelRendererTurbo(this, 457, 25, textureX, textureY); // 30
		bodyModel[30] = new ModelRendererTurbo(this, 489, 25, textureX, textureY); // 31
		bodyModel[31] = new ModelRendererTurbo(this, 505, 25, textureX, textureY); // 32
		bodyModel[32] = new ModelRendererTurbo(this, 297, 33, textureX, textureY); // 33
		bodyModel[33] = new ModelRendererTurbo(this, 49, 41, textureX, textureY); // 34
		bodyModel[34] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // 35
		bodyModel[35] = new ModelRendererTurbo(this, 305, 33, textureX, textureY); // 36
		bodyModel[36] = new ModelRendererTurbo(this, 457, 33, textureX, textureY); // 37
		bodyModel[37] = new ModelRendererTurbo(this, 81, 41, textureX, textureY); // 38
		bodyModel[38] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // 39
		bodyModel[39] = new ModelRendererTurbo(this, 17, 41, textureX, textureY); // 40
		bodyModel[40] = new ModelRendererTurbo(this, 33, 41, textureX, textureY); // 41
		bodyModel[41] = new ModelRendererTurbo(this, 97, 41, textureX, textureY); // 42
		bodyModel[42] = new ModelRendererTurbo(this, 113, 41, textureX, textureY); // 43
		bodyModel[43] = new ModelRendererTurbo(this, 129, 41, textureX, textureY); // 44
		bodyModel[44] = new ModelRendererTurbo(this, 489, 41, textureX, textureY); // 45
		bodyModel[45] = new ModelRendererTurbo(this, 81, 49, textureX, textureY); // 46
		bodyModel[46] = new ModelRendererTurbo(this, 97, 49, textureX, textureY); // 47
		bodyModel[47] = new ModelRendererTurbo(this, 97, 49, textureX, textureY); // 48
		bodyModel[48] = new ModelRendererTurbo(this, 137, 49, textureX, textureY); // 49
		bodyModel[49] = new ModelRendererTurbo(this, 57, 49, textureX, textureY); // 50
		bodyModel[50] = new ModelRendererTurbo(this, 121, 49, textureX, textureY); // 51
		bodyModel[51] = new ModelRendererTurbo(this, 137, 49, textureX, textureY); // 52
		bodyModel[52] = new ModelRendererTurbo(this, 161, 49, textureX, textureY); // 53
		bodyModel[53] = new ModelRendererTurbo(this, 505, 41, textureX, textureY); // 54
		bodyModel[54] = new ModelRendererTurbo(this, 17, 49, textureX, textureY); // 55
		bodyModel[55] = new ModelRendererTurbo(this, 177, 49, textureX, textureY); // 56
		bodyModel[56] = new ModelRendererTurbo(this, 217, 49, textureX, textureY); // 57
		bodyModel[57] = new ModelRendererTurbo(this, 225, 49, textureX, textureY); // 58
		bodyModel[58] = new ModelRendererTurbo(this, 241, 49, textureX, textureY); // 59
		bodyModel[59] = new ModelRendererTurbo(this, 257, 49, textureX, textureY); // 60
		bodyModel[60] = new ModelRendererTurbo(this, 273, 49, textureX, textureY); // 61
		bodyModel[61] = new ModelRendererTurbo(this, 289, 49, textureX, textureY); // 62
		bodyModel[62] = new ModelRendererTurbo(this, 297, 49, textureX, textureY); // 63
		bodyModel[63] = new ModelRendererTurbo(this, 305, 49, textureX, textureY); // 64
		bodyModel[64] = new ModelRendererTurbo(this, 313, 49, textureX, textureY); // 65
		bodyModel[65] = new ModelRendererTurbo(this, 305, 49, textureX, textureY); // 66
		bodyModel[66] = new ModelRendererTurbo(this, 329, 49, textureX, textureY); // 67
		bodyModel[67] = new ModelRendererTurbo(this, 337, 49, textureX, textureY); // 68
		bodyModel[68] = new ModelRendererTurbo(this, 353, 49, textureX, textureY); // 69
		bodyModel[69] = new ModelRendererTurbo(this, 361, 49, textureX, textureY); // 70
		bodyModel[70] = new ModelRendererTurbo(this, 377, 49, textureX, textureY); // 71
		bodyModel[71] = new ModelRendererTurbo(this, 153, 57, textureX, textureY); // 72
		bodyModel[72] = new ModelRendererTurbo(this, 377, 49, textureX, textureY); // 73
		bodyModel[73] = new ModelRendererTurbo(this, 401, 49, textureX, textureY); // 74
		bodyModel[74] = new ModelRendererTurbo(this, 409, 49, textureX, textureY); // 75
		bodyModel[75] = new ModelRendererTurbo(this, 417, 49, textureX, textureY); // 76
		bodyModel[76] = new ModelRendererTurbo(this, 425, 49, textureX, textureY); // 77
		bodyModel[77] = new ModelRendererTurbo(this, 489, 49, textureX, textureY); // 78
		bodyModel[78] = new ModelRendererTurbo(this, 433, 49, textureX, textureY); // 79
		bodyModel[79] = new ModelRendererTurbo(this, 257, 57, textureX, textureY); // 80
		bodyModel[80] = new ModelRendererTurbo(this, 321, 57, textureX, textureY); // 81
		bodyModel[81] = new ModelRendererTurbo(this, 385, 57, textureX, textureY); // 82
		bodyModel[82] = new ModelRendererTurbo(this, 113, 49, textureX, textureY); // 83
		bodyModel[83] = new ModelRendererTurbo(this, 233, 57, textureX, textureY); // 84
		bodyModel[84] = new ModelRendererTurbo(this, 33, 57, textureX, textureY); // 85
		bodyModel[85] = new ModelRendererTurbo(this, 81, 57, textureX, textureY); // 86
		bodyModel[86] = new ModelRendererTurbo(this, 505, 49, textureX, textureY); // 87
		bodyModel[87] = new ModelRendererTurbo(this, 17, 57, textureX, textureY); // 88
		bodyModel[88] = new ModelRendererTurbo(this, 57, 57, textureX, textureY); // 89
		bodyModel[89] = new ModelRendererTurbo(this, 97, 57, textureX, textureY); // 90
		bodyModel[90] = new ModelRendererTurbo(this, 105, 57, textureX, textureY); // 91
		bodyModel[91] = new ModelRendererTurbo(this, 257, 57, textureX, textureY); // 92
		bodyModel[92] = new ModelRendererTurbo(this, 137, 57, textureX, textureY); // 93
		bodyModel[93] = new ModelRendererTurbo(this, 289, 57, textureX, textureY); // 94
		bodyModel[94] = new ModelRendererTurbo(this, 353, 57, textureX, textureY); // 95
		bodyModel[95] = new ModelRendererTurbo(this, 121, 57, textureX, textureY); // 96
		bodyModel[96] = new ModelRendererTurbo(this, 161, 57, textureX, textureY); // 97
		bodyModel[97] = new ModelRendererTurbo(this, 233, 57, textureX, textureY); // 98
		bodyModel[98] = new ModelRendererTurbo(this, 329, 57, textureX, textureY); // 99
		bodyModel[99] = new ModelRendererTurbo(this, 417, 57, textureX, textureY); // 100
		bodyModel[100] = new ModelRendererTurbo(this, 433, 57, textureX, textureY); // 101
		bodyModel[101] = new ModelRendererTurbo(this, 449, 57, textureX, textureY); // 102
		bodyModel[102] = new ModelRendererTurbo(this, 465, 57, textureX, textureY); // 103
		bodyModel[103] = new ModelRendererTurbo(this, 481, 57, textureX, textureY); // 104
		bodyModel[104] = new ModelRendererTurbo(this, 497, 57, textureX, textureY); // 105
		bodyModel[105] = new ModelRendererTurbo(this, 33, 65, textureX, textureY); // 106
		bodyModel[106] = new ModelRendererTurbo(this, 73, 65, textureX, textureY); // 107
		bodyModel[107] = new ModelRendererTurbo(this, 57, 65, textureX, textureY); // 108
		bodyModel[108] = new ModelRendererTurbo(this, 73, 65, textureX, textureY); // 109
		bodyModel[109] = new ModelRendererTurbo(this, 233, 65, textureX, textureY); // 110
		bodyModel[110] = new ModelRendererTurbo(this, 257, 65, textureX, textureY); // 111
		bodyModel[111] = new ModelRendererTurbo(this, 241, 57, textureX, textureY); // 112
		bodyModel[112] = new ModelRendererTurbo(this, 313, 57, textureX, textureY); // 113
		bodyModel[113] = new ModelRendererTurbo(this, 289, 65, textureX, textureY); // 114
		bodyModel[114] = new ModelRendererTurbo(this, 329, 65, textureX, textureY); // 115
		bodyModel[115] = new ModelRendererTurbo(this, 353, 65, textureX, textureY); // 116
		bodyModel[116] = new ModelRendererTurbo(this, 369, 65, textureX, textureY); // 117
		bodyModel[117] = new ModelRendererTurbo(this, 385, 65, textureX, textureY); // 118
		bodyModel[118] = new ModelRendererTurbo(this, 417, 65, textureX, textureY); // 119
		bodyModel[119] = new ModelRendererTurbo(this, 337, 57, textureX, textureY); // 120
		bodyModel[120] = new ModelRendererTurbo(this, 401, 57, textureX, textureY); // 121
		bodyModel[121] = new ModelRendererTurbo(this, 273, 65, textureX, textureY); // 122
		bodyModel[122] = new ModelRendererTurbo(this, 337, 65, textureX, textureY); // 123
		bodyModel[123] = new ModelRendererTurbo(this, 433, 65, textureX, textureY); // 124
		bodyModel[124] = new ModelRendererTurbo(this, 401, 65, textureX, textureY); // 125
		bodyModel[125] = new ModelRendererTurbo(this, 433, 65, textureX, textureY); // 126
		bodyModel[126] = new ModelRendererTurbo(this, 457, 65, textureX, textureY); // 127
		bodyModel[127] = new ModelRendererTurbo(this, 465, 65, textureX, textureY); // 128
		bodyModel[128] = new ModelRendererTurbo(this, 481, 65, textureX, textureY); // 129
		bodyModel[129] = new ModelRendererTurbo(this, 489, 65, textureX, textureY); // 130
		bodyModel[130] = new ModelRendererTurbo(this, 57, 73, textureX, textureY); // 131
		bodyModel[131] = new ModelRendererTurbo(this, 73, 73, textureX, textureY); // 132
		bodyModel[132] = new ModelRendererTurbo(this, 81, 73, textureX, textureY); // 133
		bodyModel[133] = new ModelRendererTurbo(this, 97, 73, textureX, textureY); // 134
		bodyModel[134] = new ModelRendererTurbo(this, 105, 73, textureX, textureY); // 135
		bodyModel[135] = new ModelRendererTurbo(this, 113, 73, textureX, textureY); // 136
		bodyModel[136] = new ModelRendererTurbo(this, 121, 73, textureX, textureY); // 137
		bodyModel[137] = new ModelRendererTurbo(this, 145, 73, textureX, textureY); // 138
		bodyModel[138] = new ModelRendererTurbo(this, 289, 73, textureX, textureY); // 139
		bodyModel[139] = new ModelRendererTurbo(this, 313, 73, textureX, textureY); // 140
		bodyModel[140] = new ModelRendererTurbo(this, 449, 73, textureX, textureY); // 141
		bodyModel[141] = new ModelRendererTurbo(this, 89, 81, textureX, textureY); // 142
		bodyModel[142] = new ModelRendererTurbo(this, 353, 73, textureX, textureY); // 143
		bodyModel[143] = new ModelRendererTurbo(this, 377, 73, textureX, textureY); // 144
		bodyModel[144] = new ModelRendererTurbo(this, 417, 73, textureX, textureY); // 145
		bodyModel[145] = new ModelRendererTurbo(this, 489, 73, textureX, textureY); // 146
		bodyModel[146] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // 147
		bodyModel[147] = new ModelRendererTurbo(this, 369, 81, textureX, textureY); // 148
		bodyModel[148] = new ModelRendererTurbo(this, 401, 81, textureX, textureY); // 149
		bodyModel[149] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // 150
		bodyModel[150] = new ModelRendererTurbo(this, 409, 81, textureX, textureY); // 151
		bodyModel[151] = new ModelRendererTurbo(this, 289, 81, textureX, textureY); // 152
		bodyModel[152] = new ModelRendererTurbo(this, 34, 101, textureX, textureY); // 153
		bodyModel[153] = new ModelRendererTurbo(this, 129, 89, textureX, textureY); // 154
		bodyModel[154] = new ModelRendererTurbo(this, 129, 81, textureX, textureY); // 155
		bodyModel[155] = new ModelRendererTurbo(this, 449, 81, textureX, textureY); // 156
		bodyModel[156] = new ModelRendererTurbo(this, 489, 81, textureX, textureY); // 157
		bodyModel[157] = new ModelRendererTurbo(this, 41, 89, textureX, textureY); // 158
		bodyModel[158] = new ModelRendererTurbo(this, 65, 89, textureX, textureY); // 159
		bodyModel[159] = new ModelRendererTurbo(this, 89, 89, textureX, textureY); // 160
		bodyModel[160] = new ModelRendererTurbo(this, 129, 89, textureX, textureY); // 161
		bodyModel[161] = new ModelRendererTurbo(this, 169, 89, textureX, textureY); // 162
		bodyModel[162] = new ModelRendererTurbo(this, 185, 89, textureX, textureY); // 163
		bodyModel[163] = new ModelRendererTurbo(this, 185, 89, textureX, textureY); // 164
		bodyModel[164] = new ModelRendererTurbo(this, 217, 89, textureX, textureY); // 165
		bodyModel[165] = new ModelRendererTurbo(this, 233, 89, textureX, textureY); // 166
		bodyModel[166] = new ModelRendererTurbo(this, 241, 89, textureX, textureY); // 167
		bodyModel[167] = new ModelRendererTurbo(this, 265, 89, textureX, textureY); // 168
		bodyModel[168] = new ModelRendererTurbo(this, 145, 25, textureX, textureY); // 169
		bodyModel[169] = new ModelRendererTurbo(this, 161, 73, textureX, textureY); // 170
		bodyModel[170] = new ModelRendererTurbo(this, 265, 73, textureX, textureY); // 171
		bodyModel[171] = new ModelRendererTurbo(this, 457, 73, textureX, textureY); // 172
		bodyModel[172] = new ModelRendererTurbo(this, 57, 41, textureX, textureY); // 173
		bodyModel[173] = new ModelRendererTurbo(this, 49, 49, textureX, textureY); // 174
		bodyModel[174] = new ModelRendererTurbo(this, 337, 73, textureX, textureY); // 175
		bodyModel[175] = new ModelRendererTurbo(this, 401, 73, textureX, textureY); // 176
		bodyModel[176] = new ModelRendererTurbo(this, 257, 89, textureX, textureY); // 177
		bodyModel[177] = new ModelRendererTurbo(this, 441, 73, textureX, textureY); // 178
		bodyModel[178] = new ModelRendererTurbo(this, 281, 89, textureX, textureY); // 179
		bodyModel[179] = new ModelRendererTurbo(this, 297, 89, textureX, textureY); // 180
		bodyModel[180] = new ModelRendererTurbo(this, 65, 65, textureX, textureY); // 181
		bodyModel[181] = new ModelRendererTurbo(this, 137, 73, textureX, textureY); // 182
		bodyModel[182] = new ModelRendererTurbo(this, 361, 89, textureX, textureY); // 183
		bodyModel[183] = new ModelRendererTurbo(this, 377, 89, textureX, textureY); // 184
		bodyModel[184] = new ModelRendererTurbo(this, 169, 97, textureX, textureY); // 185
		bodyModel[185] = new ModelRendererTurbo(this, 449, 89, textureX, textureY); // 186
		bodyModel[186] = new ModelRendererTurbo(this, 217, 97, textureX, textureY); // 187
		bodyModel[187] = new ModelRendererTurbo(this, 337, 97, textureX, textureY); // 188
		bodyModel[188] = new ModelRendererTurbo(this, 393, 97, textureX, textureY); // 189
		bodyModel[189] = new ModelRendererTurbo(this, 457, 97, textureX, textureY); // 190
		bodyModel[190] = new ModelRendererTurbo(this, 481, 97, textureX, textureY); // 191
		bodyModel[191] = new ModelRendererTurbo(this, 289, 89, textureX, textureY); // 192
		bodyModel[192] = new ModelRendererTurbo(this, 185, 97, textureX, textureY); // 193
		bodyModel[193] = new ModelRendererTurbo(this, 57, 105, textureX, textureY); // 194
		bodyModel[194] = new ModelRendererTurbo(this, 73, 105, textureX, textureY); // 195
		bodyModel[195] = new ModelRendererTurbo(this, 473, 97, textureX, textureY); // 196
		bodyModel[196] = new ModelRendererTurbo(this, 89, 105, textureX, textureY); // 197
		bodyModel[197] = new ModelRendererTurbo(this, 145, 81, textureX, textureY); // 192
		bodyModel[198] = new ModelRendererTurbo(this, 489, 81, textureX, textureY); // 192
		bodyModel[199] = new ModelRendererTurbo(this, 41, 89, textureX, textureY); // 192
		bodyModel[200] = new ModelRendererTurbo(this, 22, 102, textureX, textureY, "Lamp"); // Lamp
		bodyModel[201] = new ModelRendererTurbo(this, 9, 102, textureX, textureY, "Lamp"); // Lamp

		bodyModel[0].addShapeBox(0F, 0F, 0F, 75, 1, 20, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0.4F, 0F, -0.5F, 0.4F, 0F, -0.5F, 0.4F, 0F, -0.5F, 0.4F); // 01
		bodyModel[0].setRotationPoint(-41F, 0F, -10F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 75, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F); // 02
		bodyModel[1].setRotationPoint(-41F, -3F, -11F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 75, 4, 1, 0F,0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // 03
		bodyModel[2].setRotationPoint(-41F, -3F, 10F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 75, 14, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0F, 0F, -0.9F); // 04
		bodyModel[3].setRotationPoint(-41F, -17F, -11F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 75, 14, 1, 0F,0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F, 0F); // 05
		bodyModel[4].setRotationPoint(-41F, -17F, 10F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 71, 1, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0F, 0F, -0.9F); // 06
		bodyModel[5].setRotationPoint(-37F, -18F, -11F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 71, 1, 1, 0F,0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F, 0F); // 07
		bodyModel[6].setRotationPoint(-37F, -18F, 10F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 71, 2, 3, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, -3F, 0F, 0.1F, -3F); // 08
		bodyModel[7].setRotationPoint(-37F, -20F, -10F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 71, 2, 3, 0F,0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0.1F, -3F, 0F, 0.1F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // 09
		bodyModel[8].setRotationPoint(-37F, -20F, 7F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 71, 2, 7, 0F,0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, -7F, 0F, 0.1F, -7F); // 10
		bodyModel[9].setRotationPoint(-37F, -22F, -7F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 71, 2, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0.1F, -7F, 0F, 0.1F, -7F, 0F, 0F, 0F, 0F, 0F, 0F); // 11
		bodyModel[10].setRotationPoint(-37F, -22F, 0F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 1, 4, 22, 0F,0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -0.5F); // 12
		bodyModel[11].setRotationPoint(34F, -3F, -11F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 1, 14, 22, 0F,0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F); // 13
		bodyModel[12].setRotationPoint(34F, -17F, -11F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, -2F, -1F, 0F, -3F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // 14
		bodyModel[13].setRotationPoint(34F, -20F, -11F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, -3F, -0.5F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F); // 15
		bodyModel[14].setRotationPoint(34F, -20F, 7F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 1, 5, 6, 0F,0F, -2F, 0F, -1F, -2F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // 16
		bodyModel[15].setRotationPoint(34F, -22F, -7F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 1, 5, 6, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // 17
		bodyModel[16].setRotationPoint(34F, -22F, 1F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 1, 5, 2, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // 18
		bodyModel[17].setRotationPoint(34F, -22F, -1F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 2, 2, 20, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -0.5F, 0F, -1F); // 19
		bodyModel[18].setRotationPoint(33F, 0F, -10F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 1, 18, 1, 0F,0.4F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // 20
		bodyModel[19].setRotationPoint(35F, -18F, -5F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 1, 18, 1, 0F,0.4F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // 21
		bodyModel[20].setRotationPoint(35F, -18F, 4F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F,0.6F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.6F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // 22
		bodyModel[21].setRotationPoint(35F, -19F, -4F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 1, 18, 1, 0F,0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F); // 23
		bodyModel[22].setRotationPoint(35F, -18F, -5F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 1, 18, 1, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // 24
		bodyModel[23].setRotationPoint(35F, -18F, 4F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // 25
		bodyModel[24].setRotationPoint(35F, 0F, -4F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.75F, 0F, -1F, -0.75F, 0F, 0F, 0F, 0F, 0F); // 26
		bodyModel[25].setRotationPoint(35F, 0F, -5F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -1F, 0F, 0F, -1F); // 27
		bodyModel[26].setRotationPoint(35F, 0F, 4F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0.5F, 0F, -1F, 0.5F, 0F, 0F, 0F, 0F, 0F); // 28
		bodyModel[27].setRotationPoint(35F, 0F, -5F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -1F, 0F, 0F, -1F); // 29
		bodyModel[28].setRotationPoint(35F, 0F, 4F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.5F, 0F, -1F, -0.75F, 0F, -1F, -0.75F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0.5F, 0F, 0F); // 30
		bodyModel[29].setRotationPoint(35F, -19F, -5F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.5F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -1F, 0.5F, 0F, -1F, 0.5F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0.5F, 0F, 0F); // 31
		bodyModel[30].setRotationPoint(35F, -19F, 4F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -1F, 0.5F, 0F, -1F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F); // 32
		bodyModel[31].setRotationPoint(35F, -19F, -5F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // 33
		bodyModel[32].setRotationPoint(35F, -19F, 4F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.8F, 0.5F, 0F, -0.8F, 0.5F, 0F, -0.8F, -0.5F, 0F, -0.8F, -0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F); // 34
		bodyModel[33].setRotationPoint(34F, 1F, 0F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0.1F, -0.4F, 0.7F, 0F, -0.4F, 0.7F, 0F, -0.4F, -0.3F, 0.1F, -0.4F, -0.3F, 0.1F, 0.8F, 0.7F, 0F, 0.8F, 0.7F, 0F, 0.8F, -0.3F, 0.1F, 0.8F, -0.3F); // 35
		bodyModel[34].setRotationPoint(37F, 1F, 0F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F, -0.5F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F); // 36
		bodyModel[35].setRotationPoint(37F, 1F, 0F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.2F, 0.25F, -0.5F, -0.2F, 0.25F, -0.5F, -0.2F, -0.75F, 0F, -0.2F, -0.75F, 0F, -0.3F, 0.25F, -0.5F, -0.3F, 0.25F, -0.5F, -0.3F, -0.75F, 0F, -0.3F, -0.75F); // 37
		bodyModel[36].setRotationPoint(37F, 2F, 0F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.8F, 0.5F, 0F, -0.8F, 0.5F, 0F, -0.8F, -0.5F, 0F, -0.8F, -0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F); // 38
		bodyModel[37].setRotationPoint(-53F, 0F, 0F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0.1F, -0.4F, 0.7F, 0F, -0.4F, 0.7F, 0F, -0.4F, -0.3F, 0.1F, -0.4F, -0.3F, 0.1F, 0.8F, 0.7F, 0F, 0.8F, 0.7F, 0F, 0.8F, -0.3F, 0.1F, 0.8F, -0.3F); // 39
		bodyModel[38].setRotationPoint(-53F, 0F, 0F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F); // 40
		bodyModel[39].setRotationPoint(-54F, 0F, 0F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, -0.2F, 0.25F, 0F, -0.2F, 0.25F, 0F, -0.2F, -0.75F, -0.5F, -0.2F, -0.75F, -0.5F, -0.3F, 0.25F, 0F, -0.3F, 0.25F, 0F, -0.3F, -0.75F, -0.5F, -0.3F, -0.75F); // 41
		bodyModel[40].setRotationPoint(-54F, 1F, 0F);

		bodyModel[41].addBox(0F, 0F, 0F, 5, 5, 0, 0F); // 42
		bodyModel[41].setRotationPoint(-41F, 2F, -6F);

		bodyModel[42].addBox(0F, 0F, 0F, 5, 5, 0, 0F); // 43
		bodyModel[42].setRotationPoint(-41F, 2F, 6F);

		bodyModel[43].addBox(0F, 0F, 0F, 5, 5, 0, 0F); // 44
		bodyModel[43].setRotationPoint(-27F, 2F, -6F);

		bodyModel[44].addBox(0F, 0F, 0F, 5, 5, 0, 0F); // 45
		bodyModel[44].setRotationPoint(-27F, 2F, 6F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0.2F, 0F, 1F, 0.2F, 0F, 1F, 0.2F, 0F, 0.5F, 0.2F, 0F); // 46
		bodyModel[45].setRotationPoint(-41F, 2F, -8F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0.2F, 0F, 1F, 0.2F, 0F, 1F, 0.2F, 0F, 0.5F, 0.2F, 0F); // 47
		bodyModel[46].setRotationPoint(-41F, 2F, 7F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 1, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // 48
		bodyModel[47].setRotationPoint(-39F, 4F, -8F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 1, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // 49
		bodyModel[48].setRotationPoint(-25F, 4F, -8F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.5F, 0F, -0.2F, 0.5F, 0F, -0.2F, 0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, -1F, -0.7F, -0.2F, 0F, -0.7F, -0.2F, 0F, -0.7F, -0.2F, -1F, -0.7F, -0.2F); // 50
		bodyModel[49].setRotationPoint(-41F, 5F, -8F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.5F, 0F, -0.2F, 0.5F, 0F, -0.2F, 0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, -1F, -0.7F, -0.2F, 0F, -0.7F, -0.2F, 0F, -0.7F, -0.2F, -1F, -0.7F, -0.2F); // 51
		bodyModel[50].setRotationPoint(-41F, 5F, 7F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0.5F, 0F, -0.2F, 0F, -0.7F, -0.2F, -1F, -0.7F, -0.2F, -1F, -0.7F, -0.2F, 0F, -0.7F, -0.2F); // 52
		bodyModel[51].setRotationPoint(-26F, 5F, -8F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0.5F, 0F, -0.2F, 0F, -0.7F, -0.2F, -1F, -0.7F, -0.2F, -1F, -0.7F, -0.2F, 0F, -0.7F, -0.2F); // 53
		bodyModel[52].setRotationPoint(-26F, 5F, 7F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F); // 54
		bodyModel[53].setRotationPoint(-41F, 3F, -8F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F); // 55
		bodyModel[54].setRotationPoint(-24F, 3F, -8F);

		bodyModel[55].addBox(0F, 0F, 0F, 15, 1, 2, 0F); // 56
		bodyModel[55].setRotationPoint(-39F, 3F, -1F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0.5F, -0.1F, 0F, 0.5F, -0.1F, 0F, 0.5F, -0.1F, 0F, 0.5F, -0.1F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // 57
		bodyModel[56].setRotationPoint(-32F, 0F, -1F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0.5F, 0.5F, -0.7F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0.5F, 0.5F, -0.7F, 0.5F, -0.5F, -0.7F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0.5F, -0.5F, -0.7F); // 58
		bodyModel[57].setRotationPoint(-33F, 2F, -9F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.5F, 0.5F, 0F, 0.5F, 0.5F, -0.7F, 0.5F, 0.5F, -0.7F, -0.5F, 0.5F, 0F, -0.5F, -0.5F, 0F, 0.5F, -0.5F, -0.7F, 0.5F, -0.5F, -0.7F, -0.5F, -0.5F, 0F); // 59
		bodyModel[58].setRotationPoint(-32F, 2F, -9F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0.5F, 0.5F, -0.7F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0.5F, 0.5F, -0.7F, 0.5F, -0.5F, -0.7F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0.5F, -0.5F, -0.7F); // 60
		bodyModel[59].setRotationPoint(-33F, 2F, 7F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.5F, 0.5F, 0F, 0.5F, 0.5F, -0.7F, 0.5F, 0.5F, -0.7F, -0.5F, 0.5F, 0F, -0.5F, -0.5F, 0F, 0.5F, -0.5F, -0.7F, 0.5F, -0.5F, -0.7F, -0.5F, -0.5F, 0F); // 61
		bodyModel[60].setRotationPoint(-32F, 2F, 7F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // 62
		bodyModel[61].setRotationPoint(-32F, 3F, -8F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F); // 63
		bodyModel[62].setRotationPoint(-32F, 3F, 7F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F); // 64
		bodyModel[63].setRotationPoint(-41F, 3F, 7F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F); // 65
		bodyModel[64].setRotationPoint(-24F, 3F, 7F);

		bodyModel[65].addBox(0F, 0F, 0F, 1, 1, 14, 0F); // 66
		bodyModel[65].setRotationPoint(-32F, 3F, -7F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // 67
		bodyModel[66].setRotationPoint(-31F, 0F, -10F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, -1.3F, -1F, 0.9F, -0.8F, -0.3F, 0.9F, -0.8F, -0.5F, 0F, -1.3F, 0.2F, 0F, -0.5F, -1F, 0.9F, -1F, -0.3F, 0.9F, -1F, -0.5F, 0F, -0.5F, 0.2F); // 68
		bodyModel[67].setRotationPoint(-34F, 3F, -9F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.1F, 0F, 1F, -0.6F, 0F, 1F, -0.6F, 0F, -1.8F, -0.1F, 0F, -1.8F, -0.1F, 0F, -0.3F, -0.6F, 0F, -0.3F, -0.6F, 0F, -0.3F, -0.1F, 0F, -0.3F); // 69
		bodyModel[68].setRotationPoint(-29F, 1F, 9F);
		bodyModel[68].rotateAngleY = 3.14159265F;

		bodyModel[69].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0.9F, -1.3F, 0.2F, 0F, -0.8F, -0.5F, 0F, -0.8F, -0.3F, 0.9F, -1.3F, -1F, 0.9F, -0.5F, 0.2F, 0F, -1F, -0.5F, 0F, -1F, -0.3F, 0.9F, -0.5F, -1F); // 70
		bodyModel[69].setRotationPoint(-32F, 3F, 8F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.1F, 0F, -1.8F, -0.6F, 0F, -1.8F, -0.6F, 0F, 1F, -0.1F, 0F, 1F, -0.1F, 0F, -0.3F, -0.6F, 0F, -0.3F, -0.6F, 0F, -0.3F, -0.1F, 0F, -0.3F); // 71
		bodyModel[70].setRotationPoint(-30F, 1F, -8F);
		bodyModel[70].rotateAngleY = -3.14159265F;

		bodyModel[71].addShapeBox(0F, 0F, 0F, 28, 5, 20, 0F,0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, -1F, 0F, -2F, -1F, 0F, -2F, -1F, 0F, -2F, -1F, 0F, -2F); // 72
		bodyModel[71].setRotationPoint(-21F, 0F, -10F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 5, 5, 6, 0F,0.2F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0.1F, -5F, 0F, 0.2F, 0F, 0F, -4F, 0F, 0F, -5F, 0F, 0F, 0.1F, 0F, 0F); // 73
		bodyModel[72].setRotationPoint(-42F, -22F, 1F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-0.8F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, -0.5F, -0.8F, -0.1F, -0.5F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, -0.8F, 0F, -0.8F); // 74
		bodyModel[73].setRotationPoint(30F, 0F, 8F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, -0.1F, 0F, -0.8F, -0.1F, 0F, -0.8F, -0.1F, -0.5F, 0F, -0.1F, -0.5F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, -0.8F, 0F, 0F, -0.8F); // 75
		bodyModel[74].setRotationPoint(29F, 0F, 8F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F); // 76
		bodyModel[75].setRotationPoint(29F, 4F, 8F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.7F, 0F, -0.6F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F); // 77
		bodyModel[76].setRotationPoint(29F, 2F, 8F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, -0.5F, 0.5F, -0.5F, -0.5F, 0.5F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.2F, 0.5F, -0.5F, -0.2F, 0.5F, -0.5F, -0.2F, -0.5F, 0F, -0.2F, -0.5F); // 78
		bodyModel[77].setRotationPoint(31F, 1F, -8F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0.7F, -1F, 0F, -1.3F, -1F, 0F, -1.3F, 0.2F, 0F, 0.7F, 0.2F, 0F, -2.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0.2F, 0F, -2.5F, 0.2F); // 79
		bodyModel[78].setRotationPoint(29F, 1F, -9F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 1, 3, 22, 0F,0F, 0F, -0.1F, -0.8F, 0F, -0.1F, -0.8F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.5F, -0.8F, 0F, -0.5F, -0.8F, 0F, -0.5F, 0F, 0F, -0.5F); // 80
		bodyModel[79].setRotationPoint(-34F, -3F, -11F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 1, 14, 22, 0F,0F, 0F, -0.1F, -0.8F, 0F, -0.1F, -0.8F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, -0.8F, 0F, -0.1F, -0.8F, 0F, -0.1F, 0F, 0F, -0.1F); // 81
		bodyModel[80].setRotationPoint(-34F, -17F, -11F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 1, 1, 22, 0F,0F, 0F, -1.1F, -0.8F, 0F, -1.1F, -0.8F, 0F, -1.1F, 0F, 0F, -1.1F, 0F, 0F, -0.1F, -0.8F, 0F, -0.1F, -0.8F, 0F, -0.1F, 0F, 0F, -0.1F); // 82
		bodyModel[81].setRotationPoint(-34F, -18F, -11F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 1, 2, 20, 0F,0F, 0F, -3.1F, -0.8F, 0F, -3.1F, -0.8F, 0F, -3.1F, 0F, 0F, -3.1F, 0F, 0F, -0.1F, -0.8F, 0F, -0.1F, -0.8F, 0F, -0.1F, 0F, 0F, -0.1F); // 83
		bodyModel[82].setRotationPoint(-34F, -20F, -10F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 1, 2, 14, 0F,0F, -0.05F, -6.1F, -0.8F, -0.05F, -6.1F, -0.8F, -0.05F, -6.1F, 0F, -0.05F, -6.1F, 0F, 0F, -0.1F, -0.8F, 0F, -0.1F, -0.8F, 0F, -0.1F, 0F, 0F, -0.1F); // 84
		bodyModel[83].setRotationPoint(-34F, -22F, -7F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, -1F, 0.7F, 0F, -1F, 0.7F, 0F, -1F, 0.7F, 0F, -1F, 0.7F, 0F); // 85
		bodyModel[84].setRotationPoint(-35F, 3F, -8F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 1F, 0.2F, 0F, 0.5F, 0.2F, 0F, 0.5F, 0.2F, 0F, 1F, 0.2F, 0F); // 86
		bodyModel[85].setRotationPoint(-28F, 2F, -8F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F); // 87
		bodyModel[86].setRotationPoint(-38F, 3F, -8F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F); // 88
		bodyModel[87].setRotationPoint(-38F, 3F, 7F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F); // 89
		bodyModel[88].setRotationPoint(-27F, 3F, -8F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F); // 90
		bodyModel[89].setRotationPoint(-27F, 3F, 7F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // 91
		bodyModel[90].setRotationPoint(-29F, 0F, 10F);
		bodyModel[90].rotateAngleY = 3.14159265F;

		bodyModel[91].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, -1F, 0.7F, 0F, -1F, 0.7F, 0F, -1F, 0.7F, 0F, -1F, 0.7F, 0F); // 92
		bodyModel[91].setRotationPoint(-35F, 3F, 7F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 1F, 0.2F, 0F, 0.5F, 0.2F, 0F, 0.5F, 0.2F, 0F, 1F, 0.2F, 0F); // 93
		bodyModel[92].setRotationPoint(-28F, 2F, 7F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,-0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, -0.7F, -0.5F, 1F, -0.7F, -0.5F, 1F, -0.7F, -0.2F, 0F, -0.7F, -0.2F); // 94
		bodyModel[93].setRotationPoint(-37F, 5F, -8F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,-0.5F, 0F, -0.2F, 0.5F, 0F, -0.2F, 0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.7F, -0.2F, 1F, -0.7F, -0.2F, 1F, -0.7F, -0.5F, 0F, -0.7F, -0.5F); // 95
		bodyModel[94].setRotationPoint(-37F, 5F, 7F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.5F, -0.5F, -0.8F, -0.5F, -1.2F, -0.8F, -0.5F, -1.2F, 0F, -0.5F, -0.5F, 0F, 1F, 0F, -0.8F, -1.8F, 0F, -0.8F, -1.8F, 0F, 0F, 1F, 0F, 0F); // 96
		bodyModel[95].setRotationPoint(-42F, 2F, -7F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, -0.4F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0.2F, 0F, 0F, 0.2F, 0F, -0.4F, 0.2F, 0F, -0.5F, 0.2F, 0F); // 97
		bodyModel[96].setRotationPoint(-42F, 2F, -8F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.5F, -0.5F, -1F, -0.5F, -1.2F, -1F, -0.5F, -1.2F, 0.2F, -0.5F, -0.5F, 0.2F, 1F, 0F, -1F, -1.8F, 0F, -1F, -1.8F, 0F, 0.2F, 1F, 0F, 0.2F); // 98
		bodyModel[97].setRotationPoint(-42F, 2F, 5F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.5F, -0.5F, 0F, -0.4F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0.2F, 0F, -0.4F, 0.2F, 0F, 0F, 0.2F, 0F, -0.5F, 0.2F, 0F); // 99
		bodyModel[98].setRotationPoint(-42F, 2F, 6F);

		bodyModel[99].addBox(0F, 0F, 0F, 5, 5, 0, 0F); // 100
		bodyModel[99].setRotationPoint(8F, 2F, -6F);

		bodyModel[100].addBox(0F, 0F, 0F, 5, 5, 0, 0F); // 101
		bodyModel[100].setRotationPoint(8F, 2F, 6F);

		bodyModel[101].addBox(0F, 0F, 0F, 5, 5, 0, 0F); // 102
		bodyModel[101].setRotationPoint(22F, 2F, -6F);

		bodyModel[102].addBox(0F, 0F, 0F, 5, 5, 0, 0F); // 103
		bodyModel[102].setRotationPoint(22F, 2F, 6F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0.2F, 0F, 1F, 0.2F, 0F, 1F, 0.2F, 0F, 0.5F, 0.2F, 0F); // 104
		bodyModel[103].setRotationPoint(8F, 2F, -8F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0.2F, 0F, 1F, 0.2F, 0F, 1F, 0.2F, 0F, 0.5F, 0.2F, 0F); // 105
		bodyModel[104].setRotationPoint(8F, 2F, 7F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 1, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // 106
		bodyModel[105].setRotationPoint(10F, 4F, -8F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 1, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // 107
		bodyModel[106].setRotationPoint(24F, 4F, -8F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.5F, 0F, -0.2F, 0.5F, 0F, -0.2F, 0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, -1F, -0.7F, -0.2F, 0F, -0.7F, -0.2F, 0F, -0.7F, -0.2F, -1F, -0.7F, -0.2F); // 108
		bodyModel[107].setRotationPoint(8F, 5F, -8F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.5F, 0F, -0.2F, 0.5F, 0F, -0.2F, 0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, -1F, -0.7F, -0.2F, 0F, -0.7F, -0.2F, 0F, -0.7F, -0.2F, -1F, -0.7F, -0.2F); // 109
		bodyModel[108].setRotationPoint(8F, 5F, 7F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0.5F, 0F, -0.2F, 0F, -0.7F, -0.2F, -1F, -0.7F, -0.2F, -1F, -0.7F, -0.2F, 0F, -0.7F, -0.2F); // 110
		bodyModel[109].setRotationPoint(23F, 5F, -8F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0.5F, 0F, -0.2F, 0F, -0.7F, -0.2F, -1F, -0.7F, -0.2F, -1F, -0.7F, -0.2F, 0F, -0.7F, -0.2F); // 111
		bodyModel[110].setRotationPoint(23F, 5F, 7F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F); // 112
		bodyModel[111].setRotationPoint(8F, 3F, -8F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F); // 113
		bodyModel[112].setRotationPoint(25F, 3F, -8F);

		bodyModel[113].addBox(0F, 0F, 0F, 15, 1, 2, 0F); // 114
		bodyModel[113].setRotationPoint(10F, 3F, -1F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0.5F, -0.1F, 0F, 0.5F, -0.1F, 0F, 0.5F, -0.1F, 0F, 0.5F, -0.1F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // 115
		bodyModel[114].setRotationPoint(17F, 0F, -1F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0.5F, 0.5F, -0.7F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0.5F, 0.5F, -0.7F, 0.5F, -0.5F, -0.7F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0.5F, -0.5F, -0.7F); // 116
		bodyModel[115].setRotationPoint(16F, 2F, -9F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.5F, 0.5F, 0F, 0.5F, 0.5F, -0.7F, 0.5F, 0.5F, -0.7F, -0.5F, 0.5F, 0F, -0.5F, -0.5F, 0F, 0.5F, -0.5F, -0.7F, 0.5F, -0.5F, -0.7F, -0.5F, -0.5F, 0F); // 117
		bodyModel[116].setRotationPoint(17F, 2F, -9F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0.5F, 0.5F, -0.7F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0.5F, 0.5F, -0.7F, 0.5F, -0.5F, -0.7F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0.5F, -0.5F, -0.7F); // 118
		bodyModel[117].setRotationPoint(16F, 2F, 7F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.5F, 0.5F, 0F, 0.5F, 0.5F, -0.7F, 0.5F, 0.5F, -0.7F, -0.5F, 0.5F, 0F, -0.5F, -0.5F, 0F, 0.5F, -0.5F, -0.7F, 0.5F, -0.5F, -0.7F, -0.5F, -0.5F, 0F); // 119
		bodyModel[118].setRotationPoint(17F, 2F, 7F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // 120
		bodyModel[119].setRotationPoint(17F, 3F, -8F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F); // 121
		bodyModel[120].setRotationPoint(17F, 3F, 7F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F); // 122
		bodyModel[121].setRotationPoint(8F, 3F, 7F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F); // 123
		bodyModel[122].setRotationPoint(25F, 3F, 7F);

		bodyModel[123].addBox(0F, 0F, 0F, 1, 1, 14, 0F); // 124
		bodyModel[123].setRotationPoint(17F, 3F, -7F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // 125
		bodyModel[124].setRotationPoint(15F, 0F, 9F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0.9F, -0.8F, -0.5F, 0F, -1.3F, 0.2F, 0F, -1.3F, -1F, 0.9F, -0.8F, -0.3F, 0.9F, -1F, -0.5F, 0F, -0.5F, 0.2F, 0F, -0.5F, -1F, 0.9F, -1F, -0.3F); // 126
		bodyModel[125].setRotationPoint(16F, 3F, 8F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.6F, 0F, -1.8F, -0.1F, 0F, -1.8F, -0.1F, 0F, 1F, -0.6F, 0F, 1F, -0.6F, 0F, -0.3F, -0.1F, 0F, -0.3F, -0.1F, 0F, -0.3F, -0.6F, 0F, -0.3F); // 127
		bodyModel[126].setRotationPoint(16F, 1F, -8F);
		bodyModel[126].rotateAngleY = 3.14159265F;

		bodyModel[127].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, -0.8F, -0.3F, 0.9F, -1.3F, -1F, 0.9F, -1.3F, 0.2F, 0F, -0.8F, -0.5F, 0F, -1F, -0.3F, 0.9F, -0.5F, -1F, 0.9F, -0.5F, 0.2F, 0F, -1F, -0.5F); // 128
		bodyModel[127].setRotationPoint(15F, 3F, -9F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.6F, 0F, 1F, -0.1F, 0F, 1F, -0.1F, 0F, -1.8F, -0.6F, 0F, -1.8F, -0.6F, 0F, -0.3F, -0.1F, 0F, -0.3F, -0.1F, 0F, -0.3F, -0.6F, 0F, -0.3F); // 129
		bodyModel[128].setRotationPoint(16F, 1F, 9F);
		bodyModel[128].rotateAngleY = -3.14159265F;

		bodyModel[129].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, -1F, 0.7F, 0F, -1F, 0.7F, 0F, -1F, 0.7F, 0F, -1F, 0.7F, 0F); // 130
		bodyModel[129].setRotationPoint(14F, 3F, -8F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 1F, 0.2F, 0F, 0.5F, 0.2F, 0F, 0.5F, 0.2F, 0F, 1F, 0.2F, 0F); // 131
		bodyModel[130].setRotationPoint(21F, 2F, -8F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F); // 132
		bodyModel[131].setRotationPoint(11F, 3F, -8F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F); // 133
		bodyModel[132].setRotationPoint(11F, 3F, 7F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F); // 134
		bodyModel[133].setRotationPoint(22F, 3F, -8F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F); // 135
		bodyModel[134].setRotationPoint(22F, 3F, 7F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // 136
		bodyModel[135].setRotationPoint(16F, 0F, -9F);
		bodyModel[135].rotateAngleY = 3.14159265F;

		bodyModel[136].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, -1F, 0.7F, 0F, -1F, 0.7F, 0F, -1F, 0.7F, 0F, -1F, 0.7F, 0F); // 137
		bodyModel[136].setRotationPoint(14F, 3F, 7F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 1F, 0.2F, 0F, 0.5F, 0.2F, 0F, 0.5F, 0.2F, 0F, 1F, 0.2F, 0F); // 138
		bodyModel[137].setRotationPoint(21F, 2F, 7F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,-0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, -0.7F, -0.5F, 1F, -0.7F, -0.5F, 1F, -0.7F, -0.2F, 0F, -0.7F, -0.2F); // 139
		bodyModel[138].setRotationPoint(12F, 5F, -8F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,-0.5F, 0F, -0.2F, 0.5F, 0F, -0.2F, 0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.7F, -0.2F, 1F, -0.7F, -0.2F, 1F, -0.7F, -0.5F, 0F, -0.7F, -0.5F); // 140
		bodyModel[139].setRotationPoint(12F, 5F, 7F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 7, 2, 20, 0F,0F, -0.5F, -0.4F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.4F, 0F, -0.5F, -0.4F, 1F, 0F, -0.5F, -1.5F, 0F, -0.1F, -1.5F, 0F, -0.1F, 1F, 0F, -0.5F); // 141
		bodyModel[140].setRotationPoint(-48F, 0F, -10F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 7, 1, 20, 0F,0F, 0F, -0.5F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0.4F, 0F, -0.5F, 0.4F, 0F, -0.5F, -0.5F); // 142
		bodyModel[141].setRotationPoint(-48F, 0F, -10F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 7, 4, 1, 0F,3.05F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -0.9F, 3.05F, 0F, 0.1F, 0F, -0.5F, -1.4F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.4F, 0F, -0.5F, 0.5F); // 143
		bodyModel[142].setRotationPoint(-48F, -3F, -11F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 7, 4, 1, 0F,3.05F, 0F, 0.1F, 0F, 0F, -0.9F, 0F, 0F, 0F, 3.05F, 0F, -1F, 0F, -0.5F, 0.5F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.5F, 0F, -0.5F, -1.4F); // 144
		bodyModel[143].setRotationPoint(-48F, -3F, 10F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,1F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F, -0.9F, 1F, 0F, 0F, 0.05F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0.05F, 0F, 0.1F); // 145
		bodyModel[144].setRotationPoint(-51F, -4F, -11F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,1F, 0F, 0F, 0F, 0F, -0.9F, 0F, 0F, 0F, 1F, 0F, -0.9F, 0.05F, 0F, 0.1F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0.05F, 0F, -1F); // 146
		bodyModel[145].setRotationPoint(-51F, -4F, 10F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 11, 2, 1, 0F,0F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0F, 0F, 0F); // 147
		bodyModel[146].setRotationPoint(-52F, -6F, -11F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 11, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F, -0.9F); // 148
		bodyModel[147].setRotationPoint(-52F, -6F, 10F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 11, 11, 1, 0F,-10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, -10F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0F, 0F, 0F); // 149
		bodyModel[148].setRotationPoint(-52F, -17F, -11F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 11, 11, 1, 0F,-10F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F, -0.9F); // 150
		bodyModel[149].setRotationPoint(-52F, -17F, 10F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 6, 2, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.85F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, -1.85F, 0F, -0.2F); // 151
		bodyModel[150].setRotationPoint(-52F, -4F, -10F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 4, 4, 19, 0F,0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.4F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.8F); // 152
		bodyModel[151].setRotationPoint(-50F, -2F, -9F);

		bodyModel[152].addBox(0F, 0F, 0F, 2, 2, 6, 0F); // 153
		bodyModel[152].setRotationPoint(-52F, -6F, -3F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 6, 6, 20, 0F,-5F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, -5F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F); // 154
		bodyModel[153].setRotationPoint(-52F, -12F, -10F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 5, 3, 4, 0F,0F, -3F, 0F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, -3F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, -4F); // 155
		bodyModel[154].setRotationPoint(-42F, -20F, -11F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 5, 3, 4, 0F,0F, -3F, 0F, -5F, -3F, 0F, 0F, 0F, 0F, 0.1F, -3F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -4F, 0F, 0F, 0.1F, 0F, 0F); // 156
		bodyModel[155].setRotationPoint(-42F, -20F, -11F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 5, 5, 6, 0F,0.1F, -5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0.1F, -5F, -6F, 0.1F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0.1F, 0F, -6F); // 157
		bodyModel[156].setRotationPoint(-42F, -22F, -7F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 5, 5, 6, 0F,0.1F, -5F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0.2F, -5F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -4F, 0F, 0F, 0.2F, 0F, 0F); // 158
		bodyModel[157].setRotationPoint(-42F, -22F, -7F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 5, 5, 6, 0F,0.1F, -5F, -6F, 0F, 0F, 0F, 0F, -2F, 0F, 0.1F, -5F, 0F, 0.1F, 0F, -6F, -4F, 0F, 0F, -4F, 0F, 0F, 0.1F, 0F, 0F); // 159
		bodyModel[158].setRotationPoint(-42F, -22F, 1F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 5, 5, 4, 0F,0.1F, -5F, 0F, 0F, -2F, 0F, 0F, -2F, -4F, 0F, -5F, 0F, 0.1F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -4F, 0F, 0F, 0F); // 160
		bodyModel[159].setRotationPoint(-42F, -22F, 7F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 5, 3, 4, 0F,0F, -3F, -4F, 0F, 0F, 0F, 0F, -2F, -1F, 0F, -3F, 0F, 0F, 0F, -4F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // 161
		bodyModel[160].setRotationPoint(-42F, -20F, 7F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 5, 5, 2, 0F,0.2F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, -5F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // 162
		bodyModel[161].setRotationPoint(-42F, -22F, -1F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 1, 1, 22, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0.5F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0.5F, -0.5F, -0.1F); // 163
		bodyModel[162].setRotationPoint(-42F, -17F, -11F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 5, 6, 1, 0F,-5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, -5F, 0F, -0.1F, 0F, -0.5F, 0.5F, -4F, -0.5F, 0.5F, -4F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // 164
		bodyModel[163].setRotationPoint(-47F, -17F, 10F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 5, 6, 1, 0F,-5F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, -0.5F, -0.55F, -4F, -0.5F, -0.6F, -4F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // 165
		bodyModel[164].setRotationPoint(-47F, -17F, -11F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 5, 6, 2, 0F,-5F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -5F, 0F, -0.6F, 0F, -0.5F, -0.6F, -4.5F, -0.5F, -0.6F, -4.5F, -0.5F, -0.6F, 0F, -0.5F, -0.6F); // 166
		bodyModel[165].setRotationPoint(-47F, -17F, -1F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 1, 3, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0.4F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0.5F, 0.4F, 0F); // 167
		bodyModel[166].setRotationPoint(-47F, 2F, -9F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 1, 3, 9, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0.4F, -1F); // 168
		bodyModel[167].setRotationPoint(-47F, 2F, 0F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // 169
		bodyModel[168].setRotationPoint(-51F, -1F, -2F);

		bodyModel[169].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0.4F, 0F, -0.8F, -1F, 0F, -0.8F, -1F, 0F, 0.2F, 0.4F, 0F, 0.2F, 0.4F, 0F, -0.8F, -1F, 0F, -0.8F, -1F, 0F, 0.2F, 0.4F, 0F, 0.2F); // 170
		bodyModel[169].setRotationPoint(-52F, 1F, -1F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // 171
		bodyModel[170].setRotationPoint(-53F, 0F, -8F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // 172
		bodyModel[171].setRotationPoint(-53F, 0F, 7F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,-0.8F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.8F, 0.5F, 0F, -0.8F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, -0.8F, -1.5F, 0F); // 173
		bodyModel[172].setRotationPoint(-54.5F, 0F, -9F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,-0.8F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.8F, 0.5F, 0F, -0.8F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, -0.8F, -1.5F, 0F); // 174
		bodyModel[173].setRotationPoint(-54.5F, 0F, 6F);

		bodyModel[174].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // 175
		bodyModel[174].setRotationPoint(-51F, 0F, -4F);

		bodyModel[175].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // 176
		bodyModel[175].setRotationPoint(-51F, 0F, 3F);

		bodyModel[176].addShapeBox(0F, 0F, 0F, 4, 4, 2, 0F,-0.5F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.5F, 0F, -0.2F); // 177
		bodyModel[176].setRotationPoint(-50F, -2F, -10F);

		bodyModel[177].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0.1F, -0.2F, -0.7F, 0F, -0.2F, -0.7F, 0F, -0.2F, 0.3F, 0.1F, -0.2F, 0.3F, 0.1F, -0.5F, -0.7F, 0F, -0.5F, -0.7F, 0F, -0.5F, 0.3F, 0.1F, -0.5F, 0.3F); // 178
		bodyModel[177].setRotationPoint(-50F, -2F, -10F);

		bodyModel[178].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F); // 179
		bodyModel[178].setRotationPoint(35F, 0F, -8F);

		bodyModel[179].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F); // 180
		bodyModel[179].setRotationPoint(35F, 0F, 7F);

		bodyModel[180].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0.5F, 0F, 0F, -1.3F, 0F, 0F, -1.3F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -1F, 0F, -1.3F, -1F, 0F, -1.3F, -1F, 0F, 0.5F, -1F, 0F); // 181
		bodyModel[180].setRotationPoint(38F, 0F, -9F);

		bodyModel[181].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0.5F, 0F, 0F, -1.3F, 0F, 0F, -1.3F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -1F, 0F, -1.3F, -1F, 0F, -1.3F, -1F, 0F, 0.5F, -1F, 0F); // 182
		bodyModel[181].setRotationPoint(38F, 0F, 6F);

		bodyModel[182].addShapeBox(0F, 0F, 0F, 2, 3, 11, 0F,0F, 0F, -0.4F, -1.5F, 0F, -0.4F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, 0F, 0F, 0F, 0F); // 183
		bodyModel[182].setRotationPoint(-46F, -11F, -11F);

		bodyModel[183].addShapeBox(0F, 0F, 0F, 2, 3, 4, 0F,0F, 0F, 0F, -1.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // 184
		bodyModel[183].setRotationPoint(-46F, -11F, 0F);

		bodyModel[184].addShapeBox(0F, 0F, 0F, 2, 3, 7, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.5F); // 185
		bodyModel[184].setRotationPoint(-46F, -11F, 4F);

		bodyModel[185].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,0F, 0F, -0.45F, 0F, 0F, -0.05F, 0F, 0F, -0.7F, 0F, 0F, -0.5F, 0F, 0F, -0.55F, 0F, 0F, -0.05F, 0F, 0F, 0F, 0F, 0F, 0F); // 186
		bodyModel[185].setRotationPoint(-46F, -10F, -11F);

		bodyModel[186].addShapeBox(0F, 0F, 0F, 6, 8, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.05F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // 187
		bodyModel[186].setRotationPoint(-46F, -8F, -11F);

		bodyModel[187].addShapeBox(0F, 0F, 0F, 6, 8, 4, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // 188
		bodyModel[187].setRotationPoint(-46F, -8F, 0F);

		bodyModel[188].addShapeBox(0F, 0F, 0F, 6, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.05F, 0F, 0F, -0.5F, -0.5F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, -0.45F, -0.5F, 0F, -1.05F); // 189
		bodyModel[188].setRotationPoint(-46F, -8F, 10F);

		bodyModel[189].addShapeBox(0F, 0F, 0F, 2, 7, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F); // 190
		bodyModel[189].setRotationPoint(-46F, -8F, -9F);

		bodyModel[190].addShapeBox(0F, 0F, 0F, 2, 7, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F); // 191
		bodyModel[190].setRotationPoint(-46F, -8F, 3F);

		bodyModel[191].addBox(0F, 0F, 0F, 1, 6, 4, 0F); // 192
		bodyModel[191].setRotationPoint(-41F, -6F, -7F);

		bodyModel[192].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // 193
		bodyModel[192].setRotationPoint(-43F, -7F, -7F);

		bodyModel[193].addShapeBox(0F, 0F, 0F, 2, 6, 4, 0F,-1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // 194
		bodyModel[193].setRotationPoint(-40F, -12F, -7F);

		bodyModel[194].addBox(0F, 0F, 0F, 1, 6, 4, 0F); // 195
		bodyModel[194].setRotationPoint(-41F, -6F, 5F);

		bodyModel[195].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // 196
		bodyModel[195].setRotationPoint(-43F, -7F, 5F);

		bodyModel[196].addShapeBox(0F, 0F, 0F, 2, 5, 4, 0F,-1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // 197
		bodyModel[196].setRotationPoint(-40F, -11F, 5F);

		bodyModel[197].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.5F, -0.4F, -0.3F, -1.1F, -0.4F, -0.3F, -1.1F, -0.4F, -0.3F, -0.5F, -0.4F, -0.3F, 0F, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, -0.3F, 0F, 0F, -0.3F); // 192
		bodyModel[197].setRotationPoint(-43F, -9F, -10F);

		bodyModel[198].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.6F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.6F, 0F, -0.4F, -0.6F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.6F, 0F, -0.4F); // 192
		bodyModel[198].setRotationPoint(-43F, -9F, -10F);

		bodyModel[199].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.6F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.6F, 0F, -0.4F, -0.6F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.6F, 0F, -0.4F); // 192
		bodyModel[199].setRotationPoint(-43F, -9F, 0F);

		bodyModel[200].addBox(0F, 0F, 0F, 2, 2, 7, 0F); // Lamp
		bodyModel[200].setRotationPoint(-52F, -6F, -10F);

		bodyModel[201].addBox(0F, 0F, 0F, 2, 2, 7, 0F); // Lamp
		bodyModel[201].setRotationPoint(-52F, -6F, 3F);
	}
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {

		for (int i = 0; i < 202; i++) {
			if (bodyModel[i].boxName != null && bodyModel[i].boxName.contains("Lamp")) {
				Minecraft.getMinecraft().entityRenderer.disableLightmap(1D);
				bodyModel[i].render(f5);
				Minecraft.getMinecraft().entityRenderer.enableLightmap(1D);
			} else if (bodyModel[i].boxName != null && bodyModel[i].boxName.contains("cull")) {
				GL11.glDisable(GL11.GL_CULL_FACE);
				bodyModel[i].render(f5);
				GL11.glEnable(GL11.GL_CULL_FACE);
			} else {
				bodyModel[i].render(f5);
			}
		}
	}
}