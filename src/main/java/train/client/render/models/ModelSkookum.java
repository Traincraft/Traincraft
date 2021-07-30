//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 10.07.2019 - 17:40:11
// Last changed on: 10.07.2019 - 17:40:11

package train.client.render.models; //Path where the model is located


import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import org.lwjgl.opengl.GL11;
import tmt.ModelConverter;
import tmt.ModelRendererTurbo;

public class ModelSkookum extends ModelConverter //Same as Filename
{
	int textureX = 256;
	int textureY = 256;

	public ModelSkookum() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[220];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 88
		bodyModel[1] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 89
		bodyModel[2] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 93
		bodyModel[3] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 94
		bodyModel[4] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 95
		bodyModel[5] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 96
		bodyModel[6] = new ModelRendererTurbo(this, 73, 9, textureX, textureY); // Box 97
		bodyModel[7] = new ModelRendererTurbo(this, 105, 9, textureX, textureY); // Box 98
		bodyModel[8] = new ModelRendererTurbo(this, 137, 9, textureX, textureY); // Box 14
		bodyModel[9] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 15
		bodyModel[10] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 17
		bodyModel[11] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 18
		bodyModel[12] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 19
		bodyModel[13] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Box 20
		bodyModel[14] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 21
		bodyModel[15] = new ModelRendererTurbo(this, 137, 49, textureX, textureY); // Box 22
		bodyModel[16] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 23
		bodyModel[17] = new ModelRendererTurbo(this, 129, 65, textureX, textureY); // Box 24
		bodyModel[18] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 25
		bodyModel[19] = new ModelRendererTurbo(this, 113, 81, textureX, textureY); // Box 26
		bodyModel[20] = new ModelRendererTurbo(this, 225, 17, textureX, textureY); // Box 28
		bodyModel[21] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 29
		bodyModel[22] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Box 30
		bodyModel[23] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 31
		bodyModel[24] = new ModelRendererTurbo(this, 137, 17, textureX, textureY); // Box 32
		bodyModel[25] = new ModelRendererTurbo(this, 153, 17, textureX, textureY); // Box 33
		bodyModel[26] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 34
		bodyModel[27] = new ModelRendererTurbo(this, 193, 17, textureX, textureY); // Box 35
		bodyModel[28] = new ModelRendererTurbo(this, 41, 97, textureX, textureY); // Box 36
		bodyModel[29] = new ModelRendererTurbo(this, 41, 105, textureX, textureY); // Box 37
		bodyModel[30] = new ModelRendererTurbo(this, 249, 9, textureX, textureY); // Box 38
		bodyModel[31] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 39
		bodyModel[32] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Box 40
		bodyModel[33] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 41
		bodyModel[34] = new ModelRendererTurbo(this, 217, 17, textureX, textureY); // Box 42
		bodyModel[35] = new ModelRendererTurbo(this, 233, 41, textureX, textureY); // Box 43
		bodyModel[36] = new ModelRendererTurbo(this, 225, 81, textureX, textureY); // Box 44
		bodyModel[37] = new ModelRendererTurbo(this, 217, 89, textureX, textureY); // Box 45
		bodyModel[38] = new ModelRendererTurbo(this, 9, 17, textureX, textureY); // Box 46
		bodyModel[39] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Box 47
		bodyModel[40] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 114
		bodyModel[41] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 74
		bodyModel[42] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 78
		bodyModel[43] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 113
		bodyModel[44] = new ModelRendererTurbo(this, 137, 9, textureX, textureY); // Box 114
		bodyModel[45] = new ModelRendererTurbo(this, 185, 9, textureX, textureY); // Box 115
		bodyModel[46] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 116
		bodyModel[47] = new ModelRendererTurbo(this, 185, 17, textureX, textureY); // Box 117
		bodyModel[48] = new ModelRendererTurbo(this, 241, 33, textureX, textureY); // Box 56
		bodyModel[49] = new ModelRendererTurbo(this, 153, 97, textureX, textureY); // Box 57
		bodyModel[50] = new ModelRendererTurbo(this, 225, 89, textureX, textureY); // Box 58
		bodyModel[51] = new ModelRendererTurbo(this, 33, 113, textureX, textureY); // Box 59
		bodyModel[52] = new ModelRendererTurbo(this, 249, 49, textureX, textureY); // Box 60
		bodyModel[53] = new ModelRendererTurbo(this, 177, 97, textureX, textureY); // Box 61
		bodyModel[54] = new ModelRendererTurbo(this, 193, 97, textureX, textureY); // Box 62
		bodyModel[55] = new ModelRendererTurbo(this, 225, 121, textureX, textureY); // Box 63
		bodyModel[56] = new ModelRendererTurbo(this, 225, 121, textureX, textureY); // Box 64
		bodyModel[57] = new ModelRendererTurbo(this, 225, 121, textureX, textureY); // Box 65
		bodyModel[58] = new ModelRendererTurbo(this, 225, 121, textureX, textureY); // Box 66
		bodyModel[59] = new ModelRendererTurbo(this, 193, 113, textureX, textureY); // Box 67
		bodyModel[60] = new ModelRendererTurbo(this, 225, 121, textureX, textureY); // Box 68
		bodyModel[61] = new ModelRendererTurbo(this, 225, 121, textureX, textureY); // Box 69
		bodyModel[62] = new ModelRendererTurbo(this, 193, 129, textureX, textureY); // Box 70
		bodyModel[63] = new ModelRendererTurbo(this, 1, 137, textureX, textureY); // Box 71
		bodyModel[64] = new ModelRendererTurbo(this, 225, 121, textureX, textureY); // Box 72
		bodyModel[65] = new ModelRendererTurbo(this, 225, 121, textureX, textureY); // Box 73
		bodyModel[66] = new ModelRendererTurbo(this, 73, 137, textureX, textureY); // Box 74
		bodyModel[67] = new ModelRendererTurbo(this, 105, 137, textureX, textureY); // Box 75
		bodyModel[68] = new ModelRendererTurbo(this, 137, 137, textureX, textureY); // Box 76
		bodyModel[69] = new ModelRendererTurbo(this, 161, 137, textureX, textureY); // Box 77
		bodyModel[70] = new ModelRendererTurbo(this, 225, 137, textureX, textureY); // Box 78
		bodyModel[71] = new ModelRendererTurbo(this, 153, 105, textureX, textureY); // Box 79
		bodyModel[72] = new ModelRendererTurbo(this, 185, 145, textureX, textureY); // Box 80
		bodyModel[73] = new ModelRendererTurbo(this, 1, 153, textureX, textureY); // Box 82
		bodyModel[74] = new ModelRendererTurbo(this, 233, 81, textureX, textureY); // Box 83
		bodyModel[75] = new ModelRendererTurbo(this, 49, 153, textureX, textureY); // Box 84
		bodyModel[76] = new ModelRendererTurbo(this, 201, 145, textureX, textureY); // Box 85
		bodyModel[77] = new ModelRendererTurbo(this, 81, 153, textureX, textureY); // Box 86
		bodyModel[78] = new ModelRendererTurbo(this, 105, 153, textureX, textureY); // Box 87
		bodyModel[79] = new ModelRendererTurbo(this, 129, 153, textureX, textureY); // Box 88
		bodyModel[80] = new ModelRendererTurbo(this, 89, 33, textureX, textureY); // Box 89
		bodyModel[81] = new ModelRendererTurbo(this, 89, 33, textureX, textureY); // Box 90
		bodyModel[82] = new ModelRendererTurbo(this, 33, 33, textureX, textureY); // Box 91
		bodyModel[83] = new ModelRendererTurbo(this, 161, 153, textureX, textureY); // Box 92
		bodyModel[84] = new ModelRendererTurbo(this, 25, 145, textureX, textureY); // Box 93
		bodyModel[85] = new ModelRendererTurbo(this, 217, 153, textureX, textureY); // Box 94
		bodyModel[86] = new ModelRendererTurbo(this, 217, 97, textureX, textureY); // Box 95
		bodyModel[87] = new ModelRendererTurbo(this, 233, 97, textureX, textureY); // Box 96
		bodyModel[88] = new ModelRendererTurbo(this, 1, 161, textureX, textureY); // Box 97
		bodyModel[89] = new ModelRendererTurbo(this, 129, 49, textureX, textureY); // Box 98
		bodyModel[90] = new ModelRendererTurbo(this, 105, 153, textureX, textureY); // Box 99
		bodyModel[91] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 100
		bodyModel[92] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 101
		bodyModel[93] = new ModelRendererTurbo(this, 65, 161, textureX, textureY); // Box 102
		bodyModel[94] = new ModelRendererTurbo(this, 201, 161, textureX, textureY); // Box 103
		bodyModel[95] = new ModelRendererTurbo(this, 41, 169, textureX, textureY); // Box 104
		bodyModel[96] = new ModelRendererTurbo(this, 161, 129, textureX, textureY); // Box 105
		bodyModel[97] = new ModelRendererTurbo(this, 25, 169, textureX, textureY); // Box 106
		bodyModel[98] = new ModelRendererTurbo(this, 105, 81, textureX, textureY); // Box 107
		bodyModel[99] = new ModelRendererTurbo(this, 209, 17, textureX, textureY); // Box 108
		bodyModel[100] = new ModelRendererTurbo(this, 225, 17, textureX, textureY); // Box 109
		bodyModel[101] = new ModelRendererTurbo(this, 217, 81, textureX, textureY); // Box 110
		bodyModel[102] = new ModelRendererTurbo(this, 17, 41, textureX, textureY); // Box 102
		bodyModel[103] = new ModelRendererTurbo(this, 137, 17, textureX, textureY); // Box 103
		bodyModel[104] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 104
		bodyModel[105] = new ModelRendererTurbo(this, 177, 121, textureX, textureY); // Box 105
		bodyModel[106] = new ModelRendererTurbo(this, 17, 129, textureX, textureY); // Box 106
		bodyModel[107] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 107
		bodyModel[108] = new ModelRendererTurbo(this, 217, 129, textureX, textureY); // Box 108
		bodyModel[109] = new ModelRendererTurbo(this, 193, 17, textureX, textureY); // Box 109
		bodyModel[110] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 110
		bodyModel[111] = new ModelRendererTurbo(this, 153, 169, textureX, textureY); // Box 111
		bodyModel[112] = new ModelRendererTurbo(this, 177, 169, textureX, textureY); // Box 112
		bodyModel[113] = new ModelRendererTurbo(this, 217, 169, textureX, textureY); // Box 113
		bodyModel[114] = new ModelRendererTurbo(this, 1, 177, textureX, textureY); // Box 114
		bodyModel[115] = new ModelRendererTurbo(this, 25, 177, textureX, textureY); // Box 115
		bodyModel[116] = new ModelRendererTurbo(this, 233, 121, textureX, textureY); // Box 116
		bodyModel[117] = new ModelRendererTurbo(this, 73, 177, textureX, textureY); // Box 117
		bodyModel[118] = new ModelRendererTurbo(this, 169, 97, textureX, textureY); // Box 118
		bodyModel[119] = new ModelRendererTurbo(this, 169, 105, textureX, textureY); // Box 119
		bodyModel[120] = new ModelRendererTurbo(this, 233, 169, textureX, textureY); // Box 121
		bodyModel[121] = new ModelRendererTurbo(this, 121, 177, textureX, textureY); // Box 122
		bodyModel[122] = new ModelRendererTurbo(this, 153, 153, textureX, textureY); // Box 123
		bodyModel[123] = new ModelRendererTurbo(this, 153, 177, textureX, textureY); // Box 124
		bodyModel[124] = new ModelRendererTurbo(this, 177, 177, textureX, textureY); // Box 125
		bodyModel[125] = new ModelRendererTurbo(this, 249, 81, textureX, textureY); // Box 126
		bodyModel[126] = new ModelRendererTurbo(this, 201, 177, textureX, textureY); // Box 127
		bodyModel[127] = new ModelRendererTurbo(this, 1, 185, textureX, textureY); // Box 128
		bodyModel[128] = new ModelRendererTurbo(this, 25, 185, textureX, textureY); // Box 129
		bodyModel[129] = new ModelRendererTurbo(this, 57, 185, textureX, textureY); // Box 130
		bodyModel[130] = new ModelRendererTurbo(this, 249, 97, textureX, textureY); // Box 131
		bodyModel[131] = new ModelRendererTurbo(this, 81, 185, textureX, textureY); // Box 132
		bodyModel[132] = new ModelRendererTurbo(this, 105, 185, textureX, textureY); // Box 133
		bodyModel[133] = new ModelRendererTurbo(this, 129, 185, textureX, textureY); // Box 134
		bodyModel[134] = new ModelRendererTurbo(this, 161, 185, textureX, textureY); // Box 135
		bodyModel[135] = new ModelRendererTurbo(this, 217, 113, textureX, textureY); // Box 136
		bodyModel[136] = new ModelRendererTurbo(this, 185, 185, textureX, textureY); // Box 137
		bodyModel[137] = new ModelRendererTurbo(this, 209, 185, textureX, textureY); // Box 138
		bodyModel[138] = new ModelRendererTurbo(this, 233, 185, textureX, textureY); // Box 139
		bodyModel[139] = new ModelRendererTurbo(this, 1, 193, textureX, textureY); // Box 140
		bodyModel[140] = new ModelRendererTurbo(this, 33, 193, textureX, textureY); // Box 141
		bodyModel[141] = new ModelRendererTurbo(this, 249, 121, textureX, textureY); // Box 142
		bodyModel[142] = new ModelRendererTurbo(this, 57, 193, textureX, textureY); // Box 143
		bodyModel[143] = new ModelRendererTurbo(this, 81, 193, textureX, textureY); // Box 144
		bodyModel[144] = new ModelRendererTurbo(this, 105, 193, textureX, textureY); // Box 145
		bodyModel[145] = new ModelRendererTurbo(this, 57, 9, textureX, textureY, "lamp"); // Box 146 lamp
		bodyModel[146] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 147 smoke
		bodyModel[147] = new ModelRendererTurbo(this, 249, 41, textureX, textureY); // Box 148 steam
		bodyModel[148] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 149 steam
		bodyModel[149] = new ModelRendererTurbo(this, 153, 97, textureX, textureY); // Box 150 steam
		bodyModel[150] = new ModelRendererTurbo(this, 217, 105, textureX, textureY); // Box 151 steam
		bodyModel[151] = new ModelRendererTurbo(this, 89, 33, textureX, textureY); // Box 152
		bodyModel[152] = new ModelRendererTurbo(this, 137, 169, textureX, textureY); // Box 153
		bodyModel[153] = new ModelRendererTurbo(this, 89, 33, textureX, textureY); // Box 154
		bodyModel[154] = new ModelRendererTurbo(this, 129, 193, textureX, textureY); // Box 155
		bodyModel[155] = new ModelRendererTurbo(this, 153, 193, textureX, textureY); // Box 156
		bodyModel[156] = new ModelRendererTurbo(this, 193, 193, textureX, textureY); // Box 157
		bodyModel[157] = new ModelRendererTurbo(this, 241, 153, textureX, textureY); // Box 158
		bodyModel[158] = new ModelRendererTurbo(this, 185, 169, textureX, textureY); // Box 159
		bodyModel[159] = new ModelRendererTurbo(this, 217, 193, textureX, textureY); // Box 160
		bodyModel[160] = new ModelRendererTurbo(this, 1, 201, textureX, textureY); // Box 161
		bodyModel[161] = new ModelRendererTurbo(this, 1, 161, textureX, textureY); // Box 162
		bodyModel[162] = new ModelRendererTurbo(this, 89, 193, textureX, textureY); // Box 163
		bodyModel[163] = new ModelRendererTurbo(this, 25, 201, textureX, textureY); // Box 164
		bodyModel[164] = new ModelRendererTurbo(this, 105, 201, textureX, textureY); // Box 165
		bodyModel[165] = new ModelRendererTurbo(this, 57, 201, textureX, textureY); // Box 166
		bodyModel[166] = new ModelRendererTurbo(this, 137, 201, textureX, textureY); // Box 167
		bodyModel[167] = new ModelRendererTurbo(this, 233, 193, textureX, textureY); // Box 168
		bodyModel[168] = new ModelRendererTurbo(this, 129, 57, textureX, textureY); // Box 169
		bodyModel[169] = new ModelRendererTurbo(this, 217, 121, textureX, textureY); // Box 170
		bodyModel[170] = new ModelRendererTurbo(this, 105, 89, textureX, textureY); // Box 171
		bodyModel[171] = new ModelRendererTurbo(this, 41, 129, textureX, textureY); // Box 86
		bodyModel[172] = new ModelRendererTurbo(this, 73, 137, textureX, textureY); // Box 87
		bodyModel[173] = new ModelRendererTurbo(this, 193, 153, textureX, textureY, "lamp"); // Box 175 glow
		bodyModel[174] = new ModelRendererTurbo(this, 193, 201, textureX, textureY); // Box 176
		bodyModel[175] = new ModelRendererTurbo(this, 81, 201, textureX, textureY); // Box 177
		bodyModel[176] = new ModelRendererTurbo(this, 217, 145, textureX, textureY); // Box 178
		bodyModel[177] = new ModelRendererTurbo(this, 1, 209, textureX, textureY); // Box 179
		bodyModel[178] = new ModelRendererTurbo(this, 169, 177, textureX, textureY); // Box 180
		bodyModel[179] = new ModelRendererTurbo(this, 249, 137, textureX, textureY); // Box 181
		bodyModel[180] = new ModelRendererTurbo(this, 153, 161, textureX, textureY); // Box 182
		bodyModel[181] = new ModelRendererTurbo(this, 129, 137, textureX, textureY); // Box 183
		bodyModel[182] = new ModelRendererTurbo(this, 161, 137, textureX, textureY); // Box 184
		bodyModel[183] = new ModelRendererTurbo(this, 65, 145, textureX, textureY); // Box 185
		bodyModel[184] = new ModelRendererTurbo(this, 249, 161, textureX, textureY); // Box 186
		bodyModel[185] = new ModelRendererTurbo(this, 225, 137, textureX, textureY); // Box 187
		bodyModel[186] = new ModelRendererTurbo(this, 105, 153, textureX, textureY); // Box 188
		bodyModel[187] = new ModelRendererTurbo(this, 1, 145, textureX, textureY); // Box 189
		bodyModel[188] = new ModelRendererTurbo(this, 81, 161, textureX, textureY); // Box 190
		bodyModel[189] = new ModelRendererTurbo(this, 9, 209, textureX, textureY); // Box 191
		bodyModel[190] = new ModelRendererTurbo(this, 217, 137, textureX, textureY); // Box 192
		bodyModel[191] = new ModelRendererTurbo(this, 201, 209, textureX, textureY); // Box 193
		bodyModel[192] = new ModelRendererTurbo(this, 17, 217, textureX, textureY); // Box 195
		bodyModel[193] = new ModelRendererTurbo(this, 1, 169, textureX, textureY); // Box 197
		bodyModel[194] = new ModelRendererTurbo(this, 65, 209, textureX, textureY); // Box 198
		bodyModel[195] = new ModelRendererTurbo(this, 129, 153, textureX, textureY); // Box 199
		bodyModel[196] = new ModelRendererTurbo(this, 201, 145, textureX, textureY); // Box 200
		bodyModel[197] = new ModelRendererTurbo(this, 225, 177, textureX, textureY); // Box 201
		bodyModel[198] = new ModelRendererTurbo(this, 161, 193, textureX, textureY); // Box 202
		bodyModel[199] = new ModelRendererTurbo(this, 97, 209, textureX, textureY); // Box 203
		bodyModel[200] = new ModelRendererTurbo(this, 41, 217, textureX, textureY); // Box 204
		bodyModel[201] = new ModelRendererTurbo(this, 105, 217, textureX, textureY); // Box 205
		bodyModel[202] = new ModelRendererTurbo(this, 121, 217, textureX, textureY); // Box 206
		bodyModel[203] = new ModelRendererTurbo(this, 249, 193, textureX, textureY); // Box 207
		bodyModel[204] = new ModelRendererTurbo(this, 161, 201, textureX, textureY); // Box 208
		bodyModel[205] = new ModelRendererTurbo(this, 137, 217, textureX, textureY); // Box 209
		bodyModel[206] = new ModelRendererTurbo(this, 169, 217, textureX, textureY); // Box 210
		bodyModel[207] = new ModelRendererTurbo(this, 57, 169, textureX, textureY); // Box 211 steam
		bodyModel[208] = new ModelRendererTurbo(this, 193, 217, textureX, textureY); // Box 212
		bodyModel[209] = new ModelRendererTurbo(this, 201, 217, textureX, textureY); // Box 211
		bodyModel[210] = new ModelRendererTurbo(this, 217, 217, textureX, textureY); // Box 212
		bodyModel[211] = new ModelRendererTurbo(this, 9, 225, textureX, textureY); // Box 213
		bodyModel[212] = new ModelRendererTurbo(this, 49, 185, textureX, textureY); // Box 214
		bodyModel[213] = new ModelRendererTurbo(this, 225, 201, textureX, textureY); // Box 215
		bodyModel[214] = new ModelRendererTurbo(this, 145, 209, textureX, textureY); // Box 216 mountpoint
		bodyModel[215] = new ModelRendererTurbo(this, 201, 217, textureX, textureY); // Box 217 mountpoint
		bodyModel[216] = new ModelRendererTurbo(this, 241, 217, textureX, textureY); // Box 154 liveryimg 1
		bodyModel[217] = new ModelRendererTurbo(this, 249, 217, textureX, textureY); // Box 155 liveryimg 1
		bodyModel[218] = new ModelRendererTurbo(this, 33, 225, textureX, textureY); // Box 156 liveryimg 2
		bodyModel[219] = new ModelRendererTurbo(this, 57, 225, textureX, textureY); // Box 157 liveryimg 2

		bodyModel[0].addBox(0F, 0F, 0F, 21, 1, 8, 0F); // Box 88
		bodyModel[0].setRotationPoint(27F, -20F, -3F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 19, 2, 5, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 89
		bodyModel[1].setRotationPoint(28F, -20F, -8F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 21, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 93
		bodyModel[2].setRotationPoint(27F, -18F, 10F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 21, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 94
		bodyModel[3].setRotationPoint(27F, -18F, -9F);

		bodyModel[4].addBox(0F, 0F, 0F, 19, 1, 8, 0F); // Box 95
		bodyModel[4].setRotationPoint(28F, -19F, -3F);

		bodyModel[5].addBox(0F, 0F, 0F, 1, 15, 18, 0F); // Box 96
		bodyModel[5].setRotationPoint(28F, -18F, -8F);

		bodyModel[6].addBox(0F, 0F, 0F, 13, 14, 1, 0F); // Box 97
		bodyModel[6].setRotationPoint(28F, -17F, -9F);

		bodyModel[7].addBox(0F, 0F, 0F, 13, 14, 1, 0F); // Box 98
		bodyModel[7].setRotationPoint(28F, -17F, 10F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 19, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		bodyModel[8].setRotationPoint(28F, -20F, 5F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F); // Box 15
		bodyModel[9].setRotationPoint(27F, -20F, 5F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		bodyModel[10].setRotationPoint(27F, -20F, -8F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F); // Box 18
		bodyModel[11].setRotationPoint(47F, -20F, 5F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 19
		bodyModel[12].setRotationPoint(47F, -20F, -8F);

		bodyModel[13].addBox(0F, 0F, 0F, 59, 6, 14, 0F); // Box 20
		bodyModel[13].setRotationPoint(-27F, -11F, -6F);

		bodyModel[14].addBox(0F, 0F, 0F, 59, 4, 6, 0F); // Box 21
		bodyModel[14].setRotationPoint(-27F, -15F, -2F);

		bodyModel[15].addBox(0F, 0F, 0F, 49, 4, 6, 0F); // Box 22
		bodyModel[15].setRotationPoint(-27F, -5F, -2F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 59, 4, 4, 0F,0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 23
		bodyModel[16].setRotationPoint(-27F, -15F, -6F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 59, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		bodyModel[17].setRotationPoint(-27F, -15F, 4F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 49, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F); // Box 25
		bodyModel[18].setRotationPoint(-27F, -5F, 4F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 49, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[19].setRotationPoint(-27F, -5F, -6F);

		bodyModel[20].addBox(0F, 0F, 0F, 5, 7, 8, 0F); // Box 28
		bodyModel[20].setRotationPoint(-3F, -2F, -3F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 10, 7, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 29
		bodyModel[21].setRotationPoint(22F, -5F, -6F);

		bodyModel[22].addBox(0F, 0F, 0F, 3, 6, 3, 0F); // Box 30
		bodyModel[22].setRotationPoint(-21.5F, -21F, -0.5F);

		bodyModel[23].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 31
		bodyModel[23].setRotationPoint(-22F, -22F, -1F);

		bodyModel[24].addBox(0F, 0F, 0F, 4, 1, 6, 0F); // Box 32
		bodyModel[24].setRotationPoint(34F, -21F, -2F);

		bodyModel[25].addBox(0F, 0F, 0F, 13, 1, 4, 0F); // Box 33
		bodyModel[25].setRotationPoint(28F, -3F, -9F);

		bodyModel[26].addBox(0F, 0F, 0F, 5, 2, 8, 0F); // Box 34
		bodyModel[26].setRotationPoint(-3F, -16F, -3F);

		bodyModel[27].addBox(0F, 0F, 0F, 5, 2, 5, 0F); // Box 35
		bodyModel[27].setRotationPoint(-3F, -18F, -1.5F);

		bodyModel[28].addBox(0F, 0F, 0F, 54, 0, 2, 0F); // Box 36
		bodyModel[28].setRotationPoint(-27F, -13.5F, 5.5F);
		bodyModel[28].rotateAngleX = 0.78539816F;

		bodyModel[29].addBox(0F, 0F, -2F, 54, 0, 2, 0F); // Box 37
		bodyModel[29].setRotationPoint(-27F, -13.5F, -3.5F);
		bodyModel[29].rotateAngleX = -0.78539816F;

		bodyModel[30].addBox(0F, 0F, 0F, 1, 12, 1, 0F); // Box 38
		bodyModel[30].setRotationPoint(-1F, -11F, -7F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39
		bodyModel[31].setRotationPoint(-1F, -17F, -7F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		bodyModel[32].setRotationPoint(-1F, -18F, -3F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 5, 2, 5, 0F,-1F, -0.5F, -1F, -1F, -0.5F, -1F, -1F, -0.5F, -1F, -1F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[33].setRotationPoint(-3F, -20F, -1.5F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 42
		bodyModel[34].setRotationPoint(-1F, -17F, 8F);

		bodyModel[35].addBox(0F, 0F, 0F, 5, 1, 5, 0F); // Box 43
		bodyModel[35].setRotationPoint(8F, -16F, -1.5F);

		bodyModel[36].addBox(0F, 0F, 0F, 4, 2, 4, 0F); // Box 44
		bodyModel[36].setRotationPoint(8.5F, -18F, -1F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 4, 2, 4, 0F,-1F, -0.5F, -1F, -1F, -0.5F, -1F, -1F, -0.5F, -1F, -1F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 45
		bodyModel[37].setRotationPoint(8.5F, -20F, -1F);

		bodyModel[38].addBox(0F, 0F, 0F, 3, 1, 3, 0F); // Box 46
		bodyModel[38].setRotationPoint(18F, -16F, -0.5F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,-1F, -0.5F, -1F, -1F, -0.5F, -1F, -1F, -0.5F, -1F, -1F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 47
		bodyModel[39].setRotationPoint(18F, -17F, -0.5F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 114
		bodyModel[40].setRotationPoint(-11F, -18F, 0.5F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[41].setRotationPoint(-11F, -19F, 0.5F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 78
		bodyModel[42].setRotationPoint(-10.75F, -17.5F, 0.75F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 113
		bodyModel[43].setRotationPoint(-11F, -16F, -1F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 114
		bodyModel[44].setRotationPoint(-11F, -19F, -1F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 115
		bodyModel[45].setRotationPoint(-11F, -19F, 2F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 116
		bodyModel[46].setRotationPoint(-11F, -19.5F, 0F);

		bodyModel[47].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 117
		bodyModel[47].setRotationPoint(-11F, -15.5F, 0F);

		bodyModel[48].addBox(0F, 0F, 0F, 4, 3, 3, 0F); // Box 56
		bodyModel[48].setRotationPoint(-27F, -19F, -0.5F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 3, 1, 5, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 57
		bodyModel[49].setRotationPoint(-26.5F, -16F, -1.5F);

		bodyModel[50].addBox(0F, 0F, 0F, 0, 14, 14, 0F); // Box 58
		bodyModel[50].setRotationPoint(-27.01F, -15F, -6F);

		bodyModel[51].addBox(0F, 0F, 0F, 53, 1, 20, 0F); // Box 59
		bodyModel[51].setRotationPoint(-25F, -6F, -9F);

		bodyModel[52].addBox(0F, 0F, 0F, 1, 12, 1, 0F); // Box 60
		bodyModel[52].setRotationPoint(-1F, -11F, 8F);

		bodyModel[53].addBox(0F, 0F, 0F, 7, 4, 4, 0F); // Box 61
		bodyModel[53].setRotationPoint(-4F, 3F, -9F);

		bodyModel[54].addBox(0F, 0F, 0F, 2, 2, 12, 0F); // Box 62
		bodyModel[54].setRotationPoint(6.5F, 4.5F, -5F);

		bodyModel[55].addBox(-4F, -4F, 0F, 8, 8, 0, 0F); // Box 63
		bodyModel[55].setRotationPoint(7.5F, 5.5F, -5F);

		bodyModel[56].addBox(-4F, -4F, 0F, 8, 8, 0, 0F); // Box 64
		bodyModel[56].setRotationPoint(7.5F, 5.5F, 7F);

		bodyModel[57].addBox(-4F, -4F, 0F, 8, 8, 0, 0F); // Box 65
		bodyModel[57].setRotationPoint(17.5F, 5.5F, 7F);

		bodyModel[58].addBox(-4F, -4F, 0F, 8, 8, 0, 0F); // Box 66
		bodyModel[58].setRotationPoint(17.5F, 5.5F, -5F);

		bodyModel[59].addBox(0F, 0F, 0F, 2, 2, 12, 0F); // Box 67
		bodyModel[59].setRotationPoint(16.5F, 4.5F, -5F);

		bodyModel[60].addBox(-4F, -4F, 0F, 8, 8, 0, 0F); // Box 68
		bodyModel[60].setRotationPoint(-19.5F, 5.5F, -5F);

		bodyModel[61].addBox(-4F, -4F, 0F, 8, 8, 0, 0F); // Box 69
		bodyModel[61].setRotationPoint(-9.5F, 5.5F, -5F);

		bodyModel[62].addBox(0F, 0F, 0F, 2, 2, 12, 0F); // Box 70
		bodyModel[62].setRotationPoint(-10.5F, 4.5F, -5F);

		bodyModel[63].addBox(0F, 0F, 0F, 2, 2, 12, 0F); // Box 71
		bodyModel[63].setRotationPoint(-20.5F, 4.5F, -5F);

		bodyModel[64].addBox(-4F, -4F, 0F, 8, 8, 0, 0F); // Box 72
		bodyModel[64].setRotationPoint(-19.5F, 5.5F, 7F);

		bodyModel[65].addBox(-4F, -4F, 0F, 8, 8, 0, 0F); // Box 73
		bodyModel[65].setRotationPoint(-9.5F, 5.5F, 7F);

		bodyModel[66].addBox(0F, 0F, 0F, 7, 6, 6, 0F); // Box 74
		bodyModel[66].setRotationPoint(-31F, 2F, -9F);

		bodyModel[67].addBox(0F, 0F, 0F, 7, 6, 6, 0F); // Box 75
		bodyModel[67].setRotationPoint(-31F, 2F, 5F);

		bodyModel[68].addBox(0F, 0F, 0F, 7, 4, 4, 0F); // Box 76
		bodyModel[68].setRotationPoint(-4F, 3F, 7F);

		bodyModel[69].addBox(0F, 0F, 0F, 5, 2, 6, 0F); // Box 77
		bodyModel[69].setRotationPoint(-30F, 0F, -9F);

		bodyModel[70].addBox(0F, 0F, 0F, 5, 2, 6, 0F); // Box 78
		bodyModel[70].setRotationPoint(-30F, 0F, 5F);

		bodyModel[71].addBox(0F, 0F, 0F, 5, 2, 4, 0F); // Box 79
		bodyModel[71].setRotationPoint(-3F, 1F, -9F);

		bodyModel[72].addBox(0F, 0F, 0F, 5, 2, 4, 0F); // Box 80
		bodyModel[72].setRotationPoint(-3F, 1F, 7F);

		bodyModel[73].addBox(0F, 0F, 0F, 19, 3, 1, 0F); // Box 82
		bodyModel[73].setRotationPoint(-24F, 3.75F, 5.5F);

		bodyModel[74].addBox(0F, 0F, 0F, 1, 2, 9, 0F); // Box 83
		bodyModel[74].setRotationPoint(-6F, 4F, -3.5F);

		bodyModel[75].addBox(0F, 0F, 0F, 19, 3, 1, 0F); // Box 84
		bodyModel[75].setRotationPoint(-24F, 3.75F, -4.5F);

		bodyModel[76].addBox(0F, 0F, 0F, 3, 3, 8, 0F); // Box 85
		bodyModel[76].setRotationPoint(-16F, -1F, -3F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 3, 5, 11, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 86
		bodyModel[77].setRotationPoint(-16F, 2F, -4.5F);

		bodyModel[78].addBox(0F, 0F, 0F, 1, 1, 7, 0F); // Box 87
		bodyModel[78].setRotationPoint(-15F, -2F, -2.5F);

		bodyModel[79].addBox(0F, 0F, 0F, 5, 2, 8, 0F); // Box 88
		bodyModel[79].setRotationPoint(-31F, 2F, -3F);

		bodyModel[80].addBox(-2.5F, -2.5F, 0F, 5, 5, 0, 0F); // Box 89
		bodyModel[80].setRotationPoint(-35.5F, 7F, -5F);

		bodyModel[81].addBox(-2.5F, -2.5F, 0F, 5, 5, 0, 0F); // Box 90
		bodyModel[81].setRotationPoint(-35.5F, 7F, 7F);

		bodyModel[82].addBox(0F, 0F, 0F, 1, 1, 12, 0F); // Box 91
		bodyModel[82].setRotationPoint(-36F, 6.5F, -5F);

		bodyModel[83].addBox(0F, 0F, 0F, 9, 1, 10, 0F); // Box 92
		bodyModel[83].setRotationPoint(-40F, 2F, -4F);

		bodyModel[84].addBox(0F, 0F, 0F, 1, 4, 18, 0F); // Box 93
		bodyModel[84].setRotationPoint(-41F, 2F, -8F);

		bodyModel[85].addBox(0F, 0F, 0F, 7, 1, 8, 0F); // Box 94
		bodyModel[85].setRotationPoint(-40F, 3F, -3F);

		bodyModel[86].addBox(0F, 0F, 0F, 6, 1, 1, 0F); // Box 95
		bodyModel[86].setRotationPoint(-37F, 4.5F, -6.5F);

		bodyModel[87].addBox(0F, 0F, 0F, 6, 1, 1, 0F); // Box 96
		bodyModel[87].setRotationPoint(-37F, 4.5F, 7.5F);

		bodyModel[88].addBox(0F, 0F, 0F, 5, 2, 12, 0F); // Box 97
		bodyModel[88].setRotationPoint(-3F, 5F, -5F);

		bodyModel[89].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 98
		bodyModel[89].setRotationPoint(-44F, 3F, -0.5F);

		bodyModel[90].addBox(0F, 0F, 0F, 2, 1, 18, 0F); // Box 99
		bodyModel[90].setRotationPoint(-43F, 7F, -8F);

		bodyModel[91].addBox(0F, 0F, 0F, 0, 2, 1, 0F); // Box 100
		bodyModel[91].setRotationPoint(-41F, 6F, -4F);

		bodyModel[92].addBox(0F, 0F, 0F, 0, 2, 1, 0F); // Box 101
		bodyModel[92].setRotationPoint(-41F, 6F, 5F);

		bodyModel[93].addBox(0F, 0F, 0F, 4, 5, 3, 0F); // Box 102
		bodyModel[93].setRotationPoint(-31.5F, -5F, -6F);

		bodyModel[94].addBox(0F, 0F, 0F, 4, 5, 3, 0F); // Box 103
		bodyModel[94].setRotationPoint(-31.5F, -5F, 5F);

		bodyModel[95].addBox(0F, 0F, 0F, 5, 1, 4, 0F); // Box 104
		bodyModel[95].setRotationPoint(-40F, 1.5F, -1F);

		bodyModel[96].addBox(0F, 0F, 0F, 8, 1, 1, 0F); // Box 105
		bodyModel[96].setRotationPoint(-34F, 1F, -2F);

		bodyModel[97].addBox(0F, 0F, 0F, 8, 1, 1, 0F); // Box 106
		bodyModel[97].setRotationPoint(-34F, 1F, 3F);

		bodyModel[98].addBox(0F, 0F, 0F, 3, 1, 2, 0F); // Box 107
		bodyModel[98].setRotationPoint(-27F, -3F, -8.5F);

		bodyModel[99].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 108
		bodyModel[99].setRotationPoint(-25F, -5F, -8.5F);

		bodyModel[100].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 109
		bodyModel[100].setRotationPoint(-25F, -5F, 8.5F);

		bodyModel[101].addBox(0F, 0F, 0F, 3, 1, 2, 0F); // Box 110
		bodyModel[101].setRotationPoint(-27F, -3F, 8.5F);

		bodyModel[102].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 102
		bodyModel[102].setRotationPoint(-22F, -1.5F, 0F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 103
		bodyModel[103].setRotationPoint(-21.5F, -1F, 0.5F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F); // Box 104
		bodyModel[104].setRotationPoint(-26.5F, 0F, 0.5F);

		bodyModel[105].addBox(0F, 0F, 0F, 2, 4, 2, 0F); // Box 105
		bodyModel[105].setRotationPoint(10F, -8F, -8F);

		bodyModel[106].addBox(0F, 0F, 0F, 2, 4, 2, 0F); // Box 106
		bodyModel[106].setRotationPoint(12.5F, -8F, -8F);

		bodyModel[107].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 107
		bodyModel[107].setRotationPoint(12.5F, -11F, -8F);

		bodyModel[108].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 108
		bodyModel[108].setRotationPoint(10F, -11F, -8F);

		bodyModel[109].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 109
		bodyModel[109].setRotationPoint(10.5F, -9F, -7.5F);

		bodyModel[110].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 110
		bodyModel[110].setRotationPoint(13F, -9F, -7.5F);

		bodyModel[111].addBox(0F, -1F, -1F, 9, 2, 2, 0F); // Box 111
		bodyModel[111].setRotationPoint(-11F, -4F, -6F);
		bodyModel[111].rotateAngleX = 0.78539816F;

		bodyModel[112].addBox(0F, -1F, -1F, 7, 2, 2, 0F); // Box 112
		bodyModel[112].setRotationPoint(1F, -4F, -6F);
		bodyModel[112].rotateAngleX = 0.78539816F;

		bodyModel[113].addBox(0F, -1F, -1F, 7, 2, 2, 0F); // Box 113
		bodyModel[113].setRotationPoint(1F, -4F, 8F);
		bodyModel[113].rotateAngleX = 0.78539816F;

		bodyModel[114].addBox(0F, -1F, -1F, 9, 2, 2, 0F); // Box 114
		bodyModel[114].setRotationPoint(-11F, -4F, 8F);
		bodyModel[114].rotateAngleX = 0.78539816F;

		bodyModel[115].addBox(0F, 0F, 0F, 20, 3, 1, 0F); // Box 115
		bodyModel[115].setRotationPoint(2F, 3.75F, -4.5F);

		bodyModel[116].addBox(0F, 0F, 0F, 1, 2, 9, 0F); // Box 116
		bodyModel[116].setRotationPoint(21F, 4F, -3.5F);

		bodyModel[117].addBox(0F, 0F, 0F, 20, 3, 1, 0F); // Box 117
		bodyModel[117].setRotationPoint(2F, 3.75F, 5.5F);

		bodyModel[118].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 118
		bodyModel[118].setRotationPoint(-2F, -4.5F, -6F);

		bodyModel[119].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 119
		bodyModel[119].setRotationPoint(-2F, -4.5F, 7F);

		bodyModel[120].addBox(0F, 0F, 0F, 1, 1, 8, 0F); // Box 121
		bodyModel[120].setRotationPoint(-31.5F, -5F, -3F);

		bodyModel[121].addBox(0F, 0F, 0F, 11, 1, 1, 0F); // Box 122
		bodyModel[121].setRotationPoint(7.5F, 7F, -6F);

		bodyModel[122].addBox(-7F, 0F, 0F, 7, 1, 1, 0F); // Box 123
		bodyModel[122].setRotationPoint(10F, 4.5F, -7F);

		bodyModel[123].addBox(-7F, 0F, 0F, 8, 1, 1, 0F); // Box 124
		bodyModel[123].setRotationPoint(10F, 3F, -7F);

		bodyModel[124].addBox(-7F, 0F, 0F, 8, 1, 1, 0F); // Box 125
		bodyModel[124].setRotationPoint(10F, 6F, -7F);

		bodyModel[125].addBox(0F, 0F, 0F, 2, 4, 1, 0F); // Box 126
		bodyModel[125].setRotationPoint(8F, 3F, -7.25F);

		bodyModel[126].addBox(0F, 0F, 0F, 9, 1, 1, 0F); // Box 127
		bodyModel[126].setRotationPoint(10F, 4.5F, -7F);
		bodyModel[126].rotateAngleZ = -0.27925268F;

		bodyModel[127].addBox(0F, 0F, 0F, 9, 1, 1, 0F); // Box 128
		bodyModel[127].setRotationPoint(-17F, 4.5F, -7F);
		bodyModel[127].rotateAngleZ = -0.27925268F;

		bodyModel[128].addBox(0F, 0F, 0F, 11, 1, 1, 0F); // Box 129
		bodyModel[128].setRotationPoint(-19.5F, 7F, -6F);

		bodyModel[129].addBox(-7F, 0F, 0F, 8, 1, 1, 0F); // Box 130
		bodyModel[129].setRotationPoint(-17F, 6F, -7F);

		bodyModel[130].addBox(0F, 0F, 0F, 2, 4, 1, 0F); // Box 131
		bodyModel[130].setRotationPoint(-19F, 3F, -7.25F);

		bodyModel[131].addBox(-7F, 0F, 0F, 7, 1, 1, 0F); // Box 132
		bodyModel[131].setRotationPoint(-17F, 4.5F, -7F);

		bodyModel[132].addBox(-7F, 0F, 0F, 8, 1, 1, 0F); // Box 133
		bodyModel[132].setRotationPoint(-17F, 3F, -7F);

		bodyModel[133].addBox(0F, 0F, 0F, 11, 1, 1, 0F); // Box 134
		bodyModel[133].setRotationPoint(-19.5F, 7F, 7F);

		bodyModel[134].addBox(0F, 0F, 0F, 9, 1, 1, 0F); // Box 135
		bodyModel[134].setRotationPoint(-17F, 4.5F, 8F);
		bodyModel[134].rotateAngleZ = -0.27925268F;

		bodyModel[135].addBox(0F, 0F, 0F, 2, 4, 1, 0F); // Box 136
		bodyModel[135].setRotationPoint(-19F, 3F, 8.25F);

		bodyModel[136].addBox(-7F, 0F, 0F, 7, 1, 1, 0F); // Box 137
		bodyModel[136].setRotationPoint(-17F, 4.5F, 8F);

		bodyModel[137].addBox(-7F, 0F, 0F, 8, 1, 1, 0F); // Box 138
		bodyModel[137].setRotationPoint(-17F, 3F, 8F);

		bodyModel[138].addBox(-7F, 0F, 0F, 8, 1, 1, 0F); // Box 139
		bodyModel[138].setRotationPoint(-17F, 6F, 8F);

		bodyModel[139].addBox(0F, 0F, 0F, 11, 1, 1, 0F); // Box 140
		bodyModel[139].setRotationPoint(7.5F, 7F, 7F);

		bodyModel[140].addBox(0F, 0F, 0F, 9, 1, 1, 0F); // Box 141
		bodyModel[140].setRotationPoint(10F, 4.5F, 8F);
		bodyModel[140].rotateAngleZ = -0.27925268F;

		bodyModel[141].addBox(0F, 0F, 0F, 2, 4, 1, 0F); // Box 142
		bodyModel[141].setRotationPoint(8F, 3F, 8.25F);

		bodyModel[142].addBox(-7F, 0F, 0F, 8, 1, 1, 0F); // Box 143
		bodyModel[142].setRotationPoint(10F, 6F, 8F);

		bodyModel[143].addBox(-7F, 0F, 0F, 7, 1, 1, 0F); // Box 144
		bodyModel[143].setRotationPoint(10F, 4.5F, 8F);

		bodyModel[144].addBox(-7F, 0F, 0F, 8, 1, 1, 0F); // Box 145
		bodyModel[144].setRotationPoint(10F, 3F, 8F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 146 lamp
		bodyModel[145].setRotationPoint(-27.5F, -19F, -0.5F);

		bodyModel[146].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 147 smoke
		bodyModel[146].setRotationPoint(-20.5F, -22F, 0.5F);

		bodyModel[147].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 148 steam
		bodyModel[147].setRotationPoint(-26F, 1F, -7F);

		bodyModel[148].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 149 steam
		bodyModel[148].setRotationPoint(-26F, 1F, 8F);

		bodyModel[149].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 150 steam
		bodyModel[149].setRotationPoint(1F, 2F, 8F);

		bodyModel[150].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 151 steam
		bodyModel[150].setRotationPoint(1F, 2F, -7F);

		bodyModel[151].addBox(-2.5F, -2.5F, 0F, 5, 5, 0, 0F); // Box 152
		bodyModel[151].setRotationPoint(32.5F, 7F, -5F);

		bodyModel[152].addBox(0F, 0F, 0F, 1, 1, 12, 0F); // Box 153
		bodyModel[152].setRotationPoint(32F, 6.5F, -5F);

		bodyModel[153].addBox(-2.5F, -2.5F, 0F, 5, 5, 0, 0F); // Box 154
		bodyModel[153].setRotationPoint(32.5F, 7F, 7F);

		bodyModel[154].addBox(0F, 0F, 0F, 14, 1, 1, 0F); // Box 155
		bodyModel[154].setRotationPoint(23F, 2.75F, 5.5F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 10, 2, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 156
		bodyModel[155].setRotationPoint(32F, -2F, -6F);

		bodyModel[156].addBox(0F, 0F, 0F, 10, 1, 1, 0F); // Box 157
		bodyModel[156].setRotationPoint(27F, 3.75F, 5.5F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 158
		bodyModel[157].setRotationPoint(23F, 3.75F, 5.5F);

		bodyModel[158].addBox(0F, 0F, 0F, 1, 4, 11, 0F); // Box 159
		bodyModel[158].setRotationPoint(22F, 2.75F, -4.5F);

		bodyModel[159].addBox(0F, 0F, 0F, 10, 1, 1, 0F); // Box 160
		bodyModel[159].setRotationPoint(27F, 3.75F, -4.5F);

		bodyModel[160].addBox(0F, 0F, 0F, 14, 1, 1, 0F); // Box 161
		bodyModel[160].setRotationPoint(23F, 2.75F, -4.5F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 162
		bodyModel[161].setRotationPoint(23F, 3.75F, -4.5F);

		bodyModel[162].addBox(0F, 0F, 0F, 1, 2, 9, 0F); // Box 163
		bodyModel[162].setRotationPoint(36F, 2.75F, -3.5F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 10, 6, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 164
		bodyModel[163].setRotationPoint(25F, -1F, -3F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 9, 7, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 165
		bodyModel[164].setRotationPoint(16F, -2F, -3F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 7, 1, 4, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 166
		bodyModel[165].setRotationPoint(25F, 5.75F, -3.5F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 7, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 167
		bodyModel[166].setRotationPoint(25F, 5.75F, 1.5F);

		bodyModel[167].addBox(0F, 0F, 0F, 2, 2, 9, 0F); // Box 168
		bodyModel[167].setRotationPoint(32F, 5.75F, -3.5F);

		bodyModel[168].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 169
		bodyModel[168].setRotationPoint(24F, 5.75F, -0.5F);

		bodyModel[169].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 170
		bodyModel[169].setRotationPoint(24F, 4.75F, 0.5F);

		bodyModel[170].addBox(0F, 0F, 0F, 1, 2, 5, 0F); // Box 171
		bodyModel[170].setRotationPoint(32.5F, 3.75F, -1.5F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 86
		bodyModel[171].setRotationPoint(19F, -18F, 0.5F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F); // Box 87
		bodyModel[172].setRotationPoint(19F, -17F, 0.5F);

		bodyModel[173].addBox(0F, 0F, 0F, 1, 4, 4, 0F); // Box 175 glow
		bodyModel[173].setRotationPoint(31.5F, -7F, -1F);

		bodyModel[174].addBox(0F, 0F, 0F, 13, 1, 4, 0F); // Box 176
		bodyModel[174].setRotationPoint(28F, -3F, 7F);

		bodyModel[175].addBox(0F, 0F, 0F, 1, 15, 4, 0F); // Box 177
		bodyModel[175].setRotationPoint(41F, -17F, -9F);

		bodyModel[176].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 178
		bodyModel[176].setRotationPoint(41F, -18F, -8F);

		bodyModel[177].addBox(0F, 0F, 0F, 1, 15, 4, 0F); // Box 179
		bodyModel[177].setRotationPoint(41F, -17F, 7F);

		bodyModel[178].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 180
		bodyModel[178].setRotationPoint(41F, -18F, 7F);

		bodyModel[179].addBox(0F, 0F, 0F, 1, 8, 1, 0F); // Box 181
		bodyModel[179].setRotationPoint(31.5F, -10F, 4F);

		bodyModel[180].addBox(0F, 0F, 0F, 1, 1, 4, 0F); // Box 182
		bodyModel[180].setRotationPoint(31.5F, -10F, 0F);

		bodyModel[181].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 183
		bodyModel[181].setRotationPoint(31.5F, -14F, 0F);

		bodyModel[182].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 184
		bodyModel[182].setRotationPoint(31.5F, -13F, 2F);

		bodyModel[183].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 185
		bodyModel[183].setRotationPoint(31F, -17F, 1F);
		bodyModel[183].rotateAngleY = 0.52359878F;

		bodyModel[184].addBox(0F, 0F, 0F, 1, 8, 1, 0F); // Box 186
		bodyModel[184].setRotationPoint(31.5F, -10F, 6F);

		bodyModel[185].addBox(0F, 0F, 0F, 0, 2, 2, 0F); // Box 187
		bodyModel[185].setRotationPoint(32.51F, -13.5F, 1.5F);

		bodyModel[186].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 188
		bodyModel[186].setRotationPoint(-11F, -9F, -7F);

		bodyModel[187].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 189
		bodyModel[187].setRotationPoint(-4F, -7F, -7F);

		bodyModel[188].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 190
		bodyModel[188].setRotationPoint(0F, -7F, -7F);

		bodyModel[189].addBox(0F, 0F, 0F, 6, 1, 1, 0F); // Box 191
		bodyModel[189].setRotationPoint(-10F, -7F, -7F);

		bodyModel[190].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 192
		bodyModel[190].setRotationPoint(-1F, -7F, -8F);

		bodyModel[191].addBox(0F, 0F, 0F, 25, 1, 1, 0F); // Box 193
		bodyModel[191].setRotationPoint(3F, -7F, -7F);

		bodyModel[192].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 195
		bodyModel[192].setRotationPoint(0F, -7F, 8F);

		bodyModel[193].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 197
		bodyModel[193].setRotationPoint(-4F, -7F, 8F);

		bodyModel[194].addBox(0F, 0F, 0F, 6, 1, 1, 0F); // Box 198
		bodyModel[194].setRotationPoint(-10F, -7F, 8F);

		bodyModel[195].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 199
		bodyModel[195].setRotationPoint(-11F, -9F, 8F);

		bodyModel[196].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 200
		bodyModel[196].setRotationPoint(-1F, -7F, 9F);

		bodyModel[197].addBox(-1F, -1F, 0F, 2, 2, 2, 0F); // Box 201
		bodyModel[197].setRotationPoint(27F, -16F, 0F);
		bodyModel[197].rotateAngleZ = 0.78539816F;

		bodyModel[198].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 202
		bodyModel[198].setRotationPoint(26F, -21F, 0.5F);

		bodyModel[199].addBox(0F, 0F, 0F, 1, 8, 1, 0F); // Box 203
		bodyModel[199].setRotationPoint(9F, -14F, 8F);

		bodyModel[200].addShapeBox(0F, 0F, 0F, 18, 1, 1, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F); // Box 204
		bodyModel[200].setRotationPoint(10F, -14F, 6F);

		bodyModel[201].addBox(0F, 0F, 0F, 4, 2, 2, 0F); // Box 205
		bodyModel[201].setRotationPoint(22F, -6.5F, 8F);

		bodyModel[202].addBox(0F, 0F, 0F, 4, 2, 2, 0F); // Box 206
		bodyModel[202].setRotationPoint(22F, -9F, 8F);

		bodyModel[203].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 207
		bodyModel[203].setRotationPoint(22.25F, -9.01F, 9.5F);

		bodyModel[204].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 208
		bodyModel[204].setRotationPoint(24.75F, -9.01F, 9.5F);

		bodyModel[205].addBox(0F, 0F, 0F, 12, 1, 1, 0F); // Box 209
		bodyModel[205].setRotationPoint(12F, -8F, 8F);

		bodyModel[206].addBox(0F, 0F, 0F, 9, 1, 2, 0F); // Box 210
		bodyModel[206].setRotationPoint(35F, 3F, 0F);

		bodyModel[207].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 211 steam
		bodyModel[207].setRotationPoint(26F, -21F, 0.5F);

		bodyModel[208].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 212
		bodyModel[208].setRotationPoint(31.5F, -11F, 9F);

		bodyModel[209].addBox(0F, 0F, 0F, 2, 2, 9, 0F); // Box 211
		bodyModel[209].setRotationPoint(-36.5F, 5.75F, -3.5F);

		bodyModel[210].addShapeBox(0F, 0F, 0F, 7, 1, 4, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 212
		bodyModel[210].setRotationPoint(-34.5F, 5.75F, 1.5F);

		bodyModel[211].addShapeBox(0F, 0F, 0F, 7, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 213
		bodyModel[211].setRotationPoint(-34.5F, 5.75F, -3.5F);

		bodyModel[212].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 214
		bodyModel[212].setRotationPoint(-27.5F, 5.75F, -0.5F);

		bodyModel[213].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 215
		bodyModel[213].setRotationPoint(-27.5F, 4.75F, 0.5F);

		bodyModel[214].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 216 mountpoint
		bodyModel[214].setRotationPoint(-27.5F, 3.75F, 0.5F);

		bodyModel[215].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 217 mountpoint
		bodyModel[215].setRotationPoint(24F, 3.75F, 0.5F);

		bodyModel[216].addBox(0F, 0F, 0F, 2, 2, 0, 0F); // Box 154 liveryimg 1
		bodyModel[216].setRotationPoint(-26F, -18.5F, -0.51F);

		bodyModel[217].addBox(0F, 0F, 0F, 2, 2, 0, 0F); // Box 155 liveryimg 1
		bodyModel[217].setRotationPoint(-26F, -18.5F, 2.51F);

		bodyModel[218].addBox(0F, 0F, 0F, 10, 3, 0, 0F); // Box 156 liveryimg 2
		bodyModel[218].setRotationPoint(30F, -7F, -9.01F);

		bodyModel[219].addBox(0F, 0F, 0F, 10, 3, 0, 0F); // Box 157 liveryimg 2
		bodyModel[219].setRotationPoint(30F, -7F, 11.01F);
	}

	public float[] getTrans() {
		return new float[]{-1.15F, 0.15F, 0.07F};
	}

	public float[] getRotate() {
		return new float[] { 0F, 180F, 180F };
	}

	public float[] getScale() {
		return null;
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {

		for(ModelRendererTurbo m :bodyModel) {
			if(m.boxName.equals("lamp")){
				Minecraft.getMinecraft().entityRenderer.disableLightmap(1D);
			}
			m.render(f5);
			if(m.boxName.equals("lamp")){
				Minecraft.getMinecraft().entityRenderer.enableLightmap(1D);

			}
			if(m.boxName.equals("cull")){
				GL11.glDisable(GL11.GL_CULL_FACE);
				m.render(f5);
			}
			if(m.boxName.equals("cull")){
				GL11.glEnable(GL11.GL_CULL_FACE);
			}
		}
	}
}
