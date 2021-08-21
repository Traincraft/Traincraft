//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 29.04.2019 - 10:04:52
// Last changed on: 29.04.2019 - 10:04:52

package train.client.render.models; //Path where the model is located



import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import tmt.ModelConverter;
import tmt.ModelRendererTurbo;
import tmt.Tessellator;
import train.common.library.Info;

public class ModelPEcoach extends ModelConverter//Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelPEcoach() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[284];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 1
		bodyModel[2] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 17
		bodyModel[3] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 21
		bodyModel[4] = new ModelRendererTurbo(this, 225, 9, textureX, textureY); // Box 22
		bodyModel[5] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 24
		bodyModel[6] = new ModelRendererTurbo(this, 233, 17, textureX, textureY); // Box 25
		bodyModel[7] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 82
		bodyModel[8] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 22
		bodyModel[9] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 24
		bodyModel[10] = new ModelRendererTurbo(this, 57, 25, textureX, textureY); // Box 25
		bodyModel[11] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Box 26
		bodyModel[12] = new ModelRendererTurbo(this, 105, 25, textureX, textureY); // Box 27
		bodyModel[13] = new ModelRendererTurbo(this, 137, 25, textureX, textureY); // Box 28
		bodyModel[14] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 29
		bodyModel[15] = new ModelRendererTurbo(this, 153, 25, textureX, textureY); // Box 30
		bodyModel[16] = new ModelRendererTurbo(this, 161, 25, textureX, textureY); // Box 31
		bodyModel[17] = new ModelRendererTurbo(this, 193, 25, textureX, textureY); // Box 32
		bodyModel[18] = new ModelRendererTurbo(this, 449, 9, textureX, textureY); // Box 33
		bodyModel[19] = new ModelRendererTurbo(this, 41, 25, textureX, textureY); // Box 34
		bodyModel[20] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 36
		bodyModel[21] = new ModelRendererTurbo(this, 225, 17, textureX, textureY); // Box 37
		bodyModel[22] = new ModelRendererTurbo(this, 465, 25, textureX, textureY); // Box 44
		bodyModel[23] = new ModelRendererTurbo(this, 217, 33, textureX, textureY); // Box 48
		bodyModel[24] = new ModelRendererTurbo(this, 25, 41, textureX, textureY); // Box 49
		bodyModel[25] = new ModelRendererTurbo(this, 41, 41, textureX, textureY); // Box 50
		bodyModel[26] = new ModelRendererTurbo(this, 17, 25, textureX, textureY); // Box 51
		bodyModel[27] = new ModelRendererTurbo(this, 177, 25, textureX, textureY); // Box 52
		bodyModel[28] = new ModelRendererTurbo(this, 209, 25, textureX, textureY); // Box 53
		bodyModel[29] = new ModelRendererTurbo(this, 65, 41, textureX, textureY); // Box 54
		bodyModel[30] = new ModelRendererTurbo(this, 89, 41, textureX, textureY); // Box 55
		bodyModel[31] = new ModelRendererTurbo(this, 145, 41, textureX, textureY); // Box 56
		bodyModel[32] = new ModelRendererTurbo(this, 193, 41, textureX, textureY); // Box 57
		bodyModel[33] = new ModelRendererTurbo(this, 233, 41, textureX, textureY); // Box 58
		bodyModel[34] = new ModelRendererTurbo(this, 249, 41, textureX, textureY); // Box 59
		bodyModel[35] = new ModelRendererTurbo(this, 273, 41, textureX, textureY); // Box 60
		bodyModel[36] = new ModelRendererTurbo(this, 121, 41, textureX, textureY); // Box 61
		bodyModel[37] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 62
		bodyModel[38] = new ModelRendererTurbo(this, 297, 41, textureX, textureY); // Box 63
		bodyModel[39] = new ModelRendererTurbo(this, 225, 25, textureX, textureY); // Box 64
		bodyModel[40] = new ModelRendererTurbo(this, 177, 41, textureX, textureY); // Box 65
		bodyModel[41] = new ModelRendererTurbo(this, 313, 41, textureX, textureY); // Box 66
		bodyModel[42] = new ModelRendererTurbo(this, 337, 41, textureX, textureY); // Box 67
		bodyModel[43] = new ModelRendererTurbo(this, 361, 41, textureX, textureY); // Box 68
		bodyModel[44] = new ModelRendererTurbo(this, 385, 41, textureX, textureY); // Box 69
		bodyModel[45] = new ModelRendererTurbo(this, 401, 41, textureX, textureY); // Box 70
		bodyModel[46] = new ModelRendererTurbo(this, 73, 41, textureX, textureY); // Box 71
		bodyModel[47] = new ModelRendererTurbo(this, 505, 25, textureX, textureY); // Box 72
		bodyModel[48] = new ModelRendererTurbo(this, 209, 41, textureX, textureY); // Box 73
		bodyModel[49] = new ModelRendererTurbo(this, 433, 41, textureX, textureY); // Box 74
		bodyModel[50] = new ModelRendererTurbo(this, 449, 41, textureX, textureY); // Box 75
		bodyModel[51] = new ModelRendererTurbo(this, 137, 49, textureX, textureY); // Box 76
		bodyModel[52] = new ModelRendererTurbo(this, 177, 49, textureX, textureY); // Box 77
		bodyModel[53] = new ModelRendererTurbo(this, 313, 49, textureX, textureY); // Box 78
		bodyModel[54] = new ModelRendererTurbo(this, 345, 41, textureX, textureY); // Box 79
		bodyModel[55] = new ModelRendererTurbo(this, 298, 65, textureX, textureY); // Box 80 wall left
		bodyModel[56] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 81 wall right
		bodyModel[57] = new ModelRendererTurbo(this, 369, 49, textureX, textureY); // Box 82
		bodyModel[58] = new ModelRendererTurbo(this, 465, 49, textureX, textureY); // Box 83
		bodyModel[59] = new ModelRendererTurbo(this, 497, 49, textureX, textureY); // Box 60
		bodyModel[60] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 61
		bodyModel[61] = new ModelRendererTurbo(this, 177, 33, textureX, textureY); // Box 62
		bodyModel[62] = new ModelRendererTurbo(this, 65, 49, textureX, textureY); // Box 63
		bodyModel[63] = new ModelRendererTurbo(this, 121, 49, textureX, textureY); // Box 64
		bodyModel[64] = new ModelRendererTurbo(this, 329, 49, textureX, textureY); // Box 65
		bodyModel[65] = new ModelRendererTurbo(this, 65, 57, textureX, textureY); // Box 66
		bodyModel[66] = new ModelRendererTurbo(this, 73, 57, textureX, textureY); // Box 67
		bodyModel[67] = new ModelRendererTurbo(this, 97, 57, textureX, textureY); // Box 68
		bodyModel[68] = new ModelRendererTurbo(this, 89, 57, textureX, textureY); // Box 69
		bodyModel[69] = new ModelRendererTurbo(this, 465, 9, textureX, textureY); // Box 70
		bodyModel[70] = new ModelRendererTurbo(this, 161, 25, textureX, textureY); // Box 71
		bodyModel[71] = new ModelRendererTurbo(this, 465, 25, textureX, textureY); // Box 72
		bodyModel[72] = new ModelRendererTurbo(this, 265, 41, textureX, textureY); // Box 73
		bodyModel[73] = new ModelRendererTurbo(this, 289, 41, textureX, textureY); // Box 74
		bodyModel[74] = new ModelRendererTurbo(this, 121, 57, textureX, textureY); // Box 75
		bodyModel[75] = new ModelRendererTurbo(this, 297, 57, textureX, textureY); // Box 76
		bodyModel[76] = new ModelRendererTurbo(this, 345, 57, textureX, textureY); // Box 77
		bodyModel[77] = new ModelRendererTurbo(this, 401, 57, textureX, textureY); // Box 78
		bodyModel[78] = new ModelRendererTurbo(this, 417, 57, textureX, textureY); // Box 79
		bodyModel[79] = new ModelRendererTurbo(this, 137, 57, textureX, textureY); // Box 80
		bodyModel[80] = new ModelRendererTurbo(this, 105, 65, textureX, textureY); // Box 81
		bodyModel[81] = new ModelRendererTurbo(this, 153, 65, textureX, textureY); // Box 82
		bodyModel[82] = new ModelRendererTurbo(this, 209, 65, textureX, textureY); // Box 83
		bodyModel[83] = new ModelRendererTurbo(this, 225, 73, textureX, textureY); // Box 84
		bodyModel[84] = new ModelRendererTurbo(this, 265, 65, textureX, textureY); // Box 85
		bodyModel[85] = new ModelRendererTurbo(this, 209, 81, textureX, textureY); // Box 86
		bodyModel[86] = new ModelRendererTurbo(this, 233, 81, textureX, textureY); // Box 87
		bodyModel[87] = new ModelRendererTurbo(this, 257, 81, textureX, textureY); // Box 88
		bodyModel[88] = new ModelRendererTurbo(this, 281, 73, textureX, textureY); // Box 89
		bodyModel[89] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 106
		bodyModel[90] = new ModelRendererTurbo(this, 209, 89, textureX, textureY); // Box 108
		bodyModel[91] = new ModelRendererTurbo(this, 121, 65, textureX, textureY); // Box 109
		bodyModel[92] = new ModelRendererTurbo(this, 249, 89, textureX, textureY); // Box 110
		bodyModel[93] = new ModelRendererTurbo(this, 289, 89, textureX, textureY); // Box 111
		bodyModel[94] = new ModelRendererTurbo(this, 345, 89, textureX, textureY); // Box 112
		bodyModel[95] = new ModelRendererTurbo(this, 377, 89, textureX, textureY); // Box 113
		bodyModel[96] = new ModelRendererTurbo(this, 489, 81, textureX, textureY); // Box 114
		bodyModel[97] = new ModelRendererTurbo(this, 193, 89, textureX, textureY); // Box 115
		bodyModel[98] = new ModelRendererTurbo(this, 409, 89, textureX, textureY); // Box 116
		bodyModel[99] = new ModelRendererTurbo(this, 433, 89, textureX, textureY); // Box 117
		bodyModel[100] = new ModelRendererTurbo(this, 169, 65, textureX, textureY); // Box 118
		bodyModel[101] = new ModelRendererTurbo(this, 425, 89, textureX, textureY); // Box 45
		bodyModel[102] = new ModelRendererTurbo(this, 449, 89, textureX, textureY); // Box 99
		bodyModel[103] = new ModelRendererTurbo(this, 465, 89, textureX, textureY); // Box 130
		bodyModel[104] = new ModelRendererTurbo(this, 353, 57, textureX, textureY); // Box 131
		bodyModel[105] = new ModelRendererTurbo(this, 209, 33, textureX, textureY); // Box 134
		bodyModel[106] = new ModelRendererTurbo(this, 57, 25, textureX, textureY); // Box 135
		bodyModel[107] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 136
		bodyModel[108] = new ModelRendererTurbo(this, 9, 65, textureX, textureY); // Box 137
		bodyModel[109] = new ModelRendererTurbo(this, 17, 97, textureX, textureY); // Box 141 door swing right
		bodyModel[110] = new ModelRendererTurbo(this, 41, 97, textureX, textureY); // Box 142
		bodyModel[111] = new ModelRendererTurbo(this, 81, 97, textureX, textureY); // Box 143
		bodyModel[112] = new ModelRendererTurbo(this, 105, 25, textureX, textureY); // Box 63
		bodyModel[113] = new ModelRendererTurbo(this, 113, 105, textureX, textureY); // Box 114
		bodyModel[114] = new ModelRendererTurbo(this, 121, 113, textureX, textureY); // Box 115
		bodyModel[115] = new ModelRendererTurbo(this, 465, 49, textureX, textureY, "lamp"); // Box 116 lantern
		bodyModel[116] = new ModelRendererTurbo(this, 489, 49, textureX, textureY, "lamp"); // Box 118 lantern
		bodyModel[117] = new ModelRendererTurbo(this, 9, 57, textureX, textureY, "lamp"); // Box 120 lantern
		bodyModel[118] = new ModelRendererTurbo(this, 217, 65, textureX, textureY, "lamp"); // Box 122 lantern
		bodyModel[119] = new ModelRendererTurbo(this, 249, 73, textureX, textureY, "lamp"); // Box 124 lantern
		bodyModel[120] = new ModelRendererTurbo(this, 369, 89, textureX, textureY, "lamp"); // Box 126 lantern
		bodyModel[121] = new ModelRendererTurbo(this, 401, 89, textureX, textureY, "lamp"); // Box 128 lantern
		bodyModel[122] = new ModelRendererTurbo(this, 41, 97, textureX, textureY, "lamp"); // Box 130 lantern
		bodyModel[123] = new ModelRendererTurbo(this, 329, 97, textureX, textureY); // Box 132
		bodyModel[124] = new ModelRendererTurbo(this, 449, 97, textureX, textureY); // Box 133
		bodyModel[125] = new ModelRendererTurbo(this, 481, 97, textureX, textureY); // Box 126
		bodyModel[126] = new ModelRendererTurbo(this, 353, 57, textureX, textureY); // Box 127
		bodyModel[127] = new ModelRendererTurbo(this, 465, 89, textureX, textureY); // Box 128
		bodyModel[128] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 129
		bodyModel[129] = new ModelRendererTurbo(this, 9, 65, textureX, textureY); // Box 130
		bodyModel[130] = new ModelRendererTurbo(this, 209, 33, textureX, textureY); // Box 131
		bodyModel[131] = new ModelRendererTurbo(this, 57, 25, textureX, textureY); // Box 132
		bodyModel[132] = new ModelRendererTurbo(this, 465, 89, textureX, textureY); // Box 133
		bodyModel[133] = new ModelRendererTurbo(this, 425, 89, textureX, textureY); // Box 134
		bodyModel[134] = new ModelRendererTurbo(this, 449, 89, textureX, textureY); // Box 135
		bodyModel[135] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 136
		bodyModel[136] = new ModelRendererTurbo(this, 9, 65, textureX, textureY); // Box 137
		bodyModel[137] = new ModelRendererTurbo(this, 353, 57, textureX, textureY); // Box 138
		bodyModel[138] = new ModelRendererTurbo(this, 465, 89, textureX, textureY); // Box 139
		bodyModel[139] = new ModelRendererTurbo(this, 425, 89, textureX, textureY); // Box 140
		bodyModel[140] = new ModelRendererTurbo(this, 449, 89, textureX, textureY); // Box 141
		bodyModel[141] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 142
		bodyModel[142] = new ModelRendererTurbo(this, 9, 65, textureX, textureY); // Box 143
		bodyModel[143] = new ModelRendererTurbo(this, 353, 57, textureX, textureY); // Box 144
		bodyModel[144] = new ModelRendererTurbo(this, 465, 89, textureX, textureY); // Box 145
		bodyModel[145] = new ModelRendererTurbo(this, 425, 89, textureX, textureY); // Box 146
		bodyModel[146] = new ModelRendererTurbo(this, 449, 89, textureX, textureY); // Box 147
		bodyModel[147] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 148
		bodyModel[148] = new ModelRendererTurbo(this, 9, 65, textureX, textureY); // Box 149
		bodyModel[149] = new ModelRendererTurbo(this, 353, 57, textureX, textureY); // Box 150
		bodyModel[150] = new ModelRendererTurbo(this, 465, 89, textureX, textureY); // Box 151
		bodyModel[151] = new ModelRendererTurbo(this, 425, 89, textureX, textureY); // Box 152
		bodyModel[152] = new ModelRendererTurbo(this, 449, 89, textureX, textureY); // Box 153
		bodyModel[153] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 154
		bodyModel[154] = new ModelRendererTurbo(this, 9, 65, textureX, textureY); // Box 155
		bodyModel[155] = new ModelRendererTurbo(this, 353, 57, textureX, textureY); // Box 156
		bodyModel[156] = new ModelRendererTurbo(this, 465, 89, textureX, textureY); // Box 157
		bodyModel[157] = new ModelRendererTurbo(this, 425, 89, textureX, textureY); // Box 158
		bodyModel[158] = new ModelRendererTurbo(this, 449, 89, textureX, textureY); // Box 159
		bodyModel[159] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 160
		bodyModel[160] = new ModelRendererTurbo(this, 9, 65, textureX, textureY); // Box 161
		bodyModel[161] = new ModelRendererTurbo(this, 353, 57, textureX, textureY); // Box 162
		bodyModel[162] = new ModelRendererTurbo(this, 465, 89, textureX, textureY); // Box 163
		bodyModel[163] = new ModelRendererTurbo(this, 425, 89, textureX, textureY); // Box 164
		bodyModel[164] = new ModelRendererTurbo(this, 449, 89, textureX, textureY); // Box 165
		bodyModel[165] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 166
		bodyModel[166] = new ModelRendererTurbo(this, 9, 65, textureX, textureY); // Box 167
		bodyModel[167] = new ModelRendererTurbo(this, 353, 57, textureX, textureY); // Box 168
		bodyModel[168] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 169
		bodyModel[169] = new ModelRendererTurbo(this, 353, 57, textureX, textureY); // Box 170
		bodyModel[170] = new ModelRendererTurbo(this, 465, 89, textureX, textureY); // Box 171
		bodyModel[171] = new ModelRendererTurbo(this, 9, 65, textureX, textureY); // Box 172
		bodyModel[172] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 173
		bodyModel[173] = new ModelRendererTurbo(this, 465, 89, textureX, textureY); // Box 174
		bodyModel[174] = new ModelRendererTurbo(this, 353, 57, textureX, textureY); // Box 175
		bodyModel[175] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 176
		bodyModel[176] = new ModelRendererTurbo(this, 9, 65, textureX, textureY); // Box 177
		bodyModel[177] = new ModelRendererTurbo(this, 465, 89, textureX, textureY); // Box 178
		bodyModel[178] = new ModelRendererTurbo(this, 353, 57, textureX, textureY); // Box 179
		bodyModel[179] = new ModelRendererTurbo(this, 9, 65, textureX, textureY); // Box 180
		bodyModel[180] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 181
		bodyModel[181] = new ModelRendererTurbo(this, 465, 89, textureX, textureY); // Box 182
		bodyModel[182] = new ModelRendererTurbo(this, 353, 57, textureX, textureY); // Box 183
		bodyModel[183] = new ModelRendererTurbo(this, 9, 65, textureX, textureY); // Box 184
		bodyModel[184] = new ModelRendererTurbo(this, 465, 89, textureX, textureY); // Box 185
		bodyModel[185] = new ModelRendererTurbo(this, 353, 57, textureX, textureY); // Box 186
		bodyModel[186] = new ModelRendererTurbo(this, 9, 65, textureX, textureY); // Box 187
		bodyModel[187] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 188
		bodyModel[188] = new ModelRendererTurbo(this, 465, 89, textureX, textureY); // Box 189
		bodyModel[189] = new ModelRendererTurbo(this, 353, 57, textureX, textureY); // Box 190
		bodyModel[190] = new ModelRendererTurbo(this, 9, 65, textureX, textureY); // Box 191
		bodyModel[191] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 192
		bodyModel[192] = new ModelRendererTurbo(this, 465, 89, textureX, textureY); // Box 193
		bodyModel[193] = new ModelRendererTurbo(this, 353, 57, textureX, textureY); // Box 194
		bodyModel[194] = new ModelRendererTurbo(this, 9, 65, textureX, textureY); // Box 195
		bodyModel[195] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 196
		bodyModel[196] = new ModelRendererTurbo(this, 465, 89, textureX, textureY); // Box 197
		bodyModel[197] = new ModelRendererTurbo(this, 353, 57, textureX, textureY); // Box 198
		bodyModel[198] = new ModelRendererTurbo(this, 9, 65, textureX, textureY); // Box 199
		bodyModel[199] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 200
		bodyModel[200] = new ModelRendererTurbo(this, 449, 89, textureX, textureY); // Box 201
		bodyModel[201] = new ModelRendererTurbo(this, 57, 25, textureX, textureY); // Box 202
		bodyModel[202] = new ModelRendererTurbo(this, 209, 33, textureX, textureY); // Box 203
		bodyModel[203] = new ModelRendererTurbo(this, 425, 89, textureX, textureY); // Box 204
		bodyModel[204] = new ModelRendererTurbo(this, 449, 89, textureX, textureY); // Box 205
		bodyModel[205] = new ModelRendererTurbo(this, 425, 89, textureX, textureY); // Box 206
		bodyModel[206] = new ModelRendererTurbo(this, 449, 89, textureX, textureY); // Box 207
		bodyModel[207] = new ModelRendererTurbo(this, 449, 89, textureX, textureY); // Box 208
		bodyModel[208] = new ModelRendererTurbo(this, 425, 89, textureX, textureY); // Box 209
		bodyModel[209] = new ModelRendererTurbo(this, 425, 89, textureX, textureY); // Box 210
		bodyModel[210] = new ModelRendererTurbo(this, 425, 89, textureX, textureY); // Box 211
		bodyModel[211] = new ModelRendererTurbo(this, 449, 89, textureX, textureY); // Box 212
		bodyModel[212] = new ModelRendererTurbo(this, 449, 89, textureX, textureY); // Box 213
		bodyModel[213] = new ModelRendererTurbo(this, 425, 89, textureX, textureY); // Box 214
		bodyModel[214] = new ModelRendererTurbo(this, 425, 89, textureX, textureY); // Box 215
		bodyModel[215] = new ModelRendererTurbo(this, 449, 89, textureX, textureY); // Box 216
		bodyModel[216] = new ModelRendererTurbo(this, 209, 33, textureX, textureY); // Box 217
		bodyModel[217] = new ModelRendererTurbo(this, 57, 25, textureX, textureY); // Box 218
		bodyModel[218] = new ModelRendererTurbo(this, 17, 97, textureX, textureY); // Box 219
		bodyModel[219] = new ModelRendererTurbo(this, 481, 97, textureX, textureY); // Box 220
		bodyModel[220] = new ModelRendererTurbo(this, 216, 97, textureX, textureY, "lamp"); // Box 81 wall right
		bodyModel[221] = new ModelRendererTurbo(this, 488, 129, textureX, textureY, "lamp"); // Glow
		bodyModel[222] = new ModelRendererTurbo(this, 242, 161, textureX, textureY, "lamp"); // Glow
		bodyModel[223] = new ModelRendererTurbo(this, 242, 161, textureX, textureY, "lamp"); // Glow
		bodyModel[224] = new ModelRendererTurbo(this, 488, 129, textureX, textureY, "lamp"); // Glow
		bodyModel[225] = new ModelRendererTurbo(this, 379, 108, textureX, textureY, "lamp"); // Box 81 wall right
		bodyModel[226] = new ModelRendererTurbo(this, 216, 97, textureX, textureY, "lamp"); // Box 81 wall right
		bodyModel[227] = new ModelRendererTurbo(this, 216, 97, textureX, textureY, "lamp"); // Box 81 wall right
		bodyModel[228] = new ModelRendererTurbo(this, 216, 97, textureX, textureY, "lamp"); // Box 81 wall right
		bodyModel[229] = new ModelRendererTurbo(this, 379, 108, textureX, textureY, "lamp"); // Box 81 wall right
		bodyModel[230] = new ModelRendererTurbo(this, 379, 108, textureX, textureY, "lamp"); // Box 81 wall right
		bodyModel[231] = new ModelRendererTurbo(this, 488, 129, textureX, textureY, "lamp"); // Glow
		bodyModel[232] = new ModelRendererTurbo(this, 488, 129, textureX, textureY, "lamp"); // Glow
		bodyModel[233] = new ModelRendererTurbo(this, 488, 129, textureX, textureY, "lamp"); // Glow
		bodyModel[234] = new ModelRendererTurbo(this, 488, 129, textureX, textureY, "lamp"); // Glow
		bodyModel[235] = new ModelRendererTurbo(this, 488, 129, textureX, textureY, "lamp"); // Glow
		bodyModel[236] = new ModelRendererTurbo(this, 488, 129, textureX, textureY, "lamp"); // Glow
		bodyModel[237] = new ModelRendererTurbo(this, 488, 129, textureX, textureY, "lamp"); // Glow
		bodyModel[238] = new ModelRendererTurbo(this, 488, 129, textureX, textureY, "lamp"); // Glow
		bodyModel[239] = new ModelRendererTurbo(this, 488, 129, textureX, textureY, "lamp"); // Glow
		bodyModel[240] = new ModelRendererTurbo(this, 488, 129, textureX, textureY, "lamp"); // Glow
		bodyModel[241] = new ModelRendererTurbo(this, 488, 129, textureX, textureY, "lamp"); // Glow
		bodyModel[242] = new ModelRendererTurbo(this, 488, 129, textureX, textureY, "lamp"); // Glow
		bodyModel[243] = new ModelRendererTurbo(this, 488, 129, textureX, textureY, "lamp"); // Glow
		bodyModel[244] = new ModelRendererTurbo(this, 488, 129, textureX, textureY, "lamp"); // Glow
		bodyModel[245] = new ModelRendererTurbo(this, 488, 129, textureX, textureY, "lamp"); // Glow
		bodyModel[246] = new ModelRendererTurbo(this, 488, 129, textureX, textureY, "lamp"); // Glow
		bodyModel[247] = new ModelRendererTurbo(this, 488, 129, textureX, textureY, "lamp"); // Glow
		bodyModel[248] = new ModelRendererTurbo(this, 488, 129, textureX, textureY, "lamp"); // Glow
		bodyModel[249] = new ModelRendererTurbo(this, 488, 129, textureX, textureY, "lamp"); // Glow
		bodyModel[250] = new ModelRendererTurbo(this, 488, 129, textureX, textureY, "lamp"); // Glow
		bodyModel[251] = new ModelRendererTurbo(this, 488, 129, textureX, textureY, "lamp"); // Glow
		bodyModel[252] = new ModelRendererTurbo(this, 488, 129, textureX, textureY, "lamp"); // Glow
		bodyModel[253] = new ModelRendererTurbo(this, 488, 129, textureX, textureY, "lamp"); // Glow
		bodyModel[254] = new ModelRendererTurbo(this, 488, 129, textureX, textureY, "lamp"); // Glow
		bodyModel[255] = new ModelRendererTurbo(this, 488, 129, textureX, textureY, "lamp"); // Glow
		bodyModel[256] = new ModelRendererTurbo(this, 488, 129, textureX, textureY, "lamp"); // Glow
		bodyModel[257] = new ModelRendererTurbo(this, 242, 161, textureX, textureY, "lamp"); // Glow
		bodyModel[258] = new ModelRendererTurbo(this, 242, 161, textureX, textureY, "lamp"); // Glow
		bodyModel[259] = new ModelRendererTurbo(this, 242, 161, textureX, textureY, "lamp"); // Glow
		bodyModel[260] = new ModelRendererTurbo(this, 242, 161, textureX, textureY, "lamp"); // Glow
		bodyModel[261] = new ModelRendererTurbo(this, 242, 161, textureX, textureY, "lamp"); // Glow
		bodyModel[262] = new ModelRendererTurbo(this, 242, 161, textureX, textureY, "lamp"); // Glow
		bodyModel[263] = new ModelRendererTurbo(this, 242, 161, textureX, textureY, "lamp"); // Glow
		bodyModel[264] = new ModelRendererTurbo(this, 242, 161, textureX, textureY, "lamp"); // Glow
		bodyModel[265] = new ModelRendererTurbo(this, 242, 161, textureX, textureY, "lamp"); // Glow
		bodyModel[266] = new ModelRendererTurbo(this, 242, 161, textureX, textureY, "lamp"); // Glow
		bodyModel[267] = new ModelRendererTurbo(this, 242, 161, textureX, textureY, "lamp"); // Glow
		bodyModel[268] = new ModelRendererTurbo(this, 242, 161, textureX, textureY, "lamp"); // Glow
		bodyModel[269] = new ModelRendererTurbo(this, 242, 161, textureX, textureY, "lamp"); // Glow
		bodyModel[270] = new ModelRendererTurbo(this, 242, 161, textureX, textureY, "lamp"); // Glow
		bodyModel[271] = new ModelRendererTurbo(this, 242, 161, textureX, textureY, "lamp"); // Glow
		bodyModel[272] = new ModelRendererTurbo(this, 242, 161, textureX, textureY, "lamp"); // Glow
		bodyModel[273] = new ModelRendererTurbo(this, 242, 161, textureX, textureY, "lamp"); // Glow
		bodyModel[274] = new ModelRendererTurbo(this, 242, 161, textureX, textureY, "lamp"); // Glow
		bodyModel[275] = new ModelRendererTurbo(this, 242, 161, textureX, textureY, "lamp"); // Glow
		bodyModel[276] = new ModelRendererTurbo(this, 242, 161, textureX, textureY, "lamp"); // Glow
		bodyModel[277] = new ModelRendererTurbo(this, 242, 161, textureX, textureY, "lamp"); // Glow
		bodyModel[278] = new ModelRendererTurbo(this, 242, 161, textureX, textureY, "lamp"); // Glow
		bodyModel[279] = new ModelRendererTurbo(this, 242, 161, textureX, textureY, "lamp"); // Glow
		bodyModel[280] = new ModelRendererTurbo(this, 242, 161, textureX, textureY, "lamp"); // Glow
		bodyModel[281] = new ModelRendererTurbo(this, 242, 161, textureX, textureY, "lamp"); // Glow
		bodyModel[282] = new ModelRendererTurbo(this, 242, 161, textureX, textureY, "lamp"); // Glow
		bodyModel[283] = new ModelRendererTurbo(this, 379, 108, textureX, textureY, "lamp"); // Box 81 wall right

		bodyModel[0].addBox(0F, 0F, 0F, 99, 1, 22, 0F); // Box 0
		bodyModel[0].setRotationPoint(-50F, 1F, -11F);

		bodyModel[1].addBox(0F, 0F, 0F, 6, 2, 3, 0F); // Box 1
		bodyModel[1].setRotationPoint(-64F, 2F, -1.5F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 5, 3, 4, 0F,-1.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -1.75F, -1F, -1.45F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -4F, -1F, 0F, 0F); // Box 17
		bodyModel[2].setRotationPoint(-59F, -21F, 7F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 107, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1.5F, 0F, -1F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 21
		bodyModel[3].setRotationPoint(-54F, -21F, 7F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 107, 3, 4, 0F,0F, -1F, -1.5F, 0F, -1F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		bodyModel[4].setRotationPoint(-54F, -21F, -11F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 5, 4, 14, 0F,-1.5F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		bodyModel[5].setRotationPoint(-59F, -23F, -7F);

		bodyModel[6].addBox(0F, 0F, 0F, 107, 2, 14, 0F); // Box 25
		bodyModel[6].setRotationPoint(-54F, -23F, -7F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 5, 3, 4, 0F,-5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1.5F, -1.75F, -1F, -1.45F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 82
		bodyModel[7].setRotationPoint(-59F, -21F, 7F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 2, 20, 6, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		bodyModel[8].setRotationPoint(-59F, -18F, -11F);

		bodyModel[9].addBox(0F, 0F, 0F, 2, 3, 10, 0F); // Box 24
		bodyModel[9].setRotationPoint(-59F, -19F, -5F);

		bodyModel[10].addBox(0F, 0F, 0F, 2, 1, 10, 0F); // Box 25
		bodyModel[10].setRotationPoint(-61F, -17F, -5F);

		bodyModel[11].addBox(0F, 0F, 0F, 4, 17, 1, 0F); // Box 26
		bodyModel[11].setRotationPoint(-61F, -16F, -5F);

		bodyModel[12].addBox(0F, 0F, 0F, 4, 1, 10, 0F); // Box 27
		bodyModel[12].setRotationPoint(-61F, 1F, -5F);

		bodyModel[13].addBox(0F, 0F, 0F, 4, 17, 1, 0F); // Box 28
		bodyModel[13].setRotationPoint(-61F, -16F, 4F);

		bodyModel[14].addBox(0F, 0F, 0F, 1, 17, 2, 0F); // Box 29
		bodyModel[14].setRotationPoint(-62F, -16F, -6F);

		bodyModel[15].addBox(0F, 0F, 0F, 1, 17, 2, 0F); // Box 30
		bodyModel[15].setRotationPoint(-62F, -16F, 4F);

		bodyModel[16].addBox(0F, 0F, 0F, 1, 1, 12, 0F); // Box 31
		bodyModel[16].setRotationPoint(-62F, 1F, -6F);

		bodyModel[17].addBox(0F, 0F, 0F, 1, 1, 12, 0F); // Box 32
		bodyModel[17].setRotationPoint(-62F, -17F, -6F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
		bodyModel[18].setRotationPoint(-62F, -18F, -6F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		bodyModel[19].setRotationPoint(-62F, -18F, 0F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 5, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.05F, 0F, 0F); // Box 36
		bodyModel[20].setRotationPoint(-59F, -19F, 7F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F); // Box 37
		bodyModel[21].setRotationPoint(-59F, -19F, 5F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 5, 4, 14, 0F,0F, 0F, 0F, -1.5F, -1.5F, 0F, -1.5F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 44
		bodyModel[22].setRotationPoint(53F, -23F, -7F);

		bodyModel[23].addBox(0F, 0F, 0F, 1, 19, 6, 0F); // Box 48
		bodyModel[23].setRotationPoint(-50F, -18F, -10F);

		bodyModel[24].addBox(0F, 0F, 0F, 1, 19, 6, 0F); // Box 49
		bodyModel[24].setRotationPoint(-50F, -18F, 4F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 2, 20, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 50
		bodyModel[25].setRotationPoint(-59F, -18F, 5F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 51
		bodyModel[26].setRotationPoint(-59F, -19F, -7F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 5, 1, 4, 0F,-1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F); // Box 52
		bodyModel[27].setRotationPoint(-59F, -19F, -11F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 5, 3, 4, 0F,-1.75F, -1F, -1.45F, 0F, 0F, -4F, 0F, 0F, 0F, -1.5F, -1F, 0F, -1F, 0F, 0F, 0F, -1F, -4F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 53
		bodyModel[28].setRotationPoint(-59F, -21F, -11F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 5, 3, 4, 0F,-1.75F, -1F, -1.45F, 0F, -1F, -1.5F, 0F, 0F, 0F, -5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F); // Box 54
		bodyModel[29].setRotationPoint(-59F, -21F, -11F);

		bodyModel[30].addBox(0F, 0F, 0F, 7, 1, 14, 0F); // Box 55
		bodyModel[30].setRotationPoint(-57F, 1F, -7F);

		bodyModel[31].addBox(0F, 0F, 0F, 7, 1, 16, 0F); // Box 56
		bodyModel[31].setRotationPoint(49F, 1F, -8F);

		bodyModel[32].addBox(0F, 0F, 0F, 1, 19, 6, 0F); // Box 57
		bodyModel[32].setRotationPoint(48F, -18F, -10F);

		bodyModel[33].addBox(0F, 0F, 0F, 1, 19, 6, 0F); // Box 58
		bodyModel[33].setRotationPoint(48F, -18F, 4F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 2, 20, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 59
		bodyModel[34].setRotationPoint(56F, -18F, 5F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 2, 20, 6, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 60
		bodyModel[35].setRotationPoint(56F, -18F, -11F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 5, 1, 4, 0F,0F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.05F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F); // Box 61
		bodyModel[36].setRotationPoint(53F, -19F, -11F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 62
		bodyModel[37].setRotationPoint(53F, -19F, -7F);

		bodyModel[38].addBox(0F, 0F, 0F, 2, 3, 10, 0F); // Box 63
		bodyModel[38].setRotationPoint(56F, -19F, -5F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F); // Box 64
		bodyModel[39].setRotationPoint(53F, -19F, 5F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 5, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -1.05F, 0F, 0F, 0F, 0F, 0F); // Box 65
		bodyModel[40].setRotationPoint(53F, -19F, 7F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 5, 3, 4, 0F,0F, 0F, -4F, -1.75F, -1F, -1.45F, -1.5F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, -4F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 66
		bodyModel[41].setRotationPoint(53F, -21F, -11F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 5, 3, 4, 0F,0F, -1F, -1.5F, -1.75F, -1F, -1.45F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F); // Box 67
		bodyModel[42].setRotationPoint(53F, -21F, -11F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 5, 3, 4, 0F,0F, 0F, 0F, -1.5F, -1F, 0F, -1.75F, -1F, -1.45F, 0F, 0F, -4F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, -1F, -4F); // Box 68
		bodyModel[43].setRotationPoint(53F, -21F, 7F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 5, 3, 4, 0F,0F, 0F, 0F, -5F, 0F, 0F, -1.75F, -1F, -1.45F, 0F, -1F, -1.5F, 0F, 0F, 0F, -5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 69
		bodyModel[44].setRotationPoint(53F, -21F, 7F);

		bodyModel[45].addBox(0F, 0F, 0F, 4, 1, 10, 0F); // Box 70
		bodyModel[45].setRotationPoint(56F, 1F, -5F);

		bodyModel[46].addBox(0F, 0F, 0F, 1, 1, 12, 0F); // Box 71
		bodyModel[46].setRotationPoint(60F, 1F, -6F);

		bodyModel[47].addBox(0F, 0F, 0F, 1, 17, 2, 0F); // Box 72
		bodyModel[47].setRotationPoint(60F, -16F, -6F);

		bodyModel[48].addBox(0F, 0F, 0F, 1, 17, 2, 0F); // Box 73
		bodyModel[48].setRotationPoint(60F, -16F, 4F);

		bodyModel[49].addBox(0F, 0F, 0F, 4, 17, 1, 0F); // Box 74
		bodyModel[49].setRotationPoint(56F, -16F, 4F);

		bodyModel[50].addBox(0F, 0F, 0F, 4, 17, 1, 0F); // Box 75
		bodyModel[50].setRotationPoint(56F, -16F, -5F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 76
		bodyModel[51].setRotationPoint(60F, -18F, -6F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 77
		bodyModel[52].setRotationPoint(60F, -18F, 0F);

		bodyModel[53].addBox(0F, 0F, 0F, 2, 1, 10, 0F); // Box 78
		bodyModel[53].setRotationPoint(58F, -17F, -5F);

		bodyModel[54].addBox(0F, 0F, 0F, 1, 1, 12, 0F); // Box 79
		bodyModel[54].setRotationPoint(60F, -17F, -6F);

		bodyModel[55].addBox(0F, 0F, 0F, 99, 19, 1, 0F); // Box 80 wall left
		bodyModel[55].setRotationPoint(-50F, -18F, -11F);

		bodyModel[56].addBox(0F, 0F, 0F, 99, 19, 1, 0F); // Box 81 wall right
		bodyModel[56].setRotationPoint(-50F, -18F, 10F);

		bodyModel[57].addBox(0F, 0F, 0F, 3, 1, 10, 0F); // Box 82
		bodyModel[57].setRotationPoint(-57F, -19F, -5F);

		bodyModel[58].addBox(0F, 0F, 0F, 3, 1, 10, 0F); // Box 83
		bodyModel[58].setRotationPoint(53F, -19F, -5F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 1, 5, 5, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 60
		bodyModel[59].setRotationPoint(-58F, 2F, -11F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 1, 5, 5, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 61
		bodyModel[60].setRotationPoint(-50F, 2F, -11F);

		bodyModel[61].addBox(0F, 0F, 0F, 7, 0, 2, 0F); // Box 62
		bodyModel[61].setRotationPoint(-57F, 7F, -11F);

		bodyModel[62].addBox(0F, 0F, 0F, 7, 0, 2, 0F); // Box 63
		bodyModel[62].setRotationPoint(-57F, 5F, -10F);

		bodyModel[63].addBox(0F, 0F, 0F, 7, 0, 2, 0F); // Box 64
		bodyModel[63].setRotationPoint(-57F, 3F, -9F);

		bodyModel[64].addBox(0F, 0F, 0F, 7, 0, 2, 0F); // Box 65
		bodyModel[64].setRotationPoint(-57F, 7F, 9F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 1, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 66
		bodyModel[65].setRotationPoint(-50F, 2F, 6F);

		bodyModel[66].addBox(0F, 0F, 0F, 7, 0, 2, 0F); // Box 67
		bodyModel[66].setRotationPoint(-57F, 5F, 8F);

		bodyModel[67].addBox(0F, 0F, 0F, 7, 0, 2, 0F); // Box 68
		bodyModel[67].setRotationPoint(-57F, 3F, 7F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 1, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 69
		bodyModel[68].setRotationPoint(-58F, 2F, 6F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 3, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 70
		bodyModel[69].setRotationPoint(-48F, -22.5F, -9F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 3, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 71
		bodyModel[70].setRotationPoint(30F, -22.5F, -9F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 3, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 72
		bodyModel[71].setRotationPoint(-31F, -22.5F, -9F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 3, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 73
		bodyModel[72].setRotationPoint(-10F, -22.5F, -9F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 3, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 74
		bodyModel[73].setRotationPoint(13F, -22.5F, -9F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 3, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 75
		bodyModel[74].setRotationPoint(-48F, -22.5F, 7F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 3, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 76
		bodyModel[75].setRotationPoint(-31F, -22.5F, 7F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 3, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 77
		bodyModel[76].setRotationPoint(-10F, -22.5F, 7F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 3, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 78
		bodyModel[77].setRotationPoint(13F, -22.5F, 7F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 3, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 79
		bodyModel[78].setRotationPoint(30F, -22.5F, 7F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 1, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 80
		bodyModel[79].setRotationPoint(48F, 2F, 6F);

		bodyModel[80].addBox(0F, 0F, 0F, 7, 0, 2, 0F); // Box 81
		bodyModel[80].setRotationPoint(49F, 3F, 7F);

		bodyModel[81].addBox(0F, 0F, 0F, 7, 0, 2, 0F); // Box 82
		bodyModel[81].setRotationPoint(49F, 5F, 8F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 1, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 83
		bodyModel[82].setRotationPoint(56F, 2F, 6F);

		bodyModel[83].addBox(0F, 0F, 0F, 7, 0, 2, 0F); // Box 84
		bodyModel[83].setRotationPoint(49F, 7F, 9F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 1, 5, 5, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 85
		bodyModel[84].setRotationPoint(48F, 2F, -11F);

		bodyModel[85].addBox(0F, 0F, 0F, 7, 0, 2, 0F); // Box 86
		bodyModel[85].setRotationPoint(49F, 3F, -9F);

		bodyModel[86].addBox(0F, 0F, 0F, 7, 0, 2, 0F); // Box 87
		bodyModel[86].setRotationPoint(49F, 5F, -10F);

		bodyModel[87].addBox(0F, 0F, 0F, 7, 0, 2, 0F); // Box 88
		bodyModel[87].setRotationPoint(49F, 7F, -11F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 1, 5, 5, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 89
		bodyModel[88].setRotationPoint(56F, 2F, -11F);

		bodyModel[89].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 106
		bodyModel[89].setRotationPoint(33F, 2F, -1F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 15, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F); // Box 108
		bodyModel[90].setRotationPoint(-29F, 2F, -1F);

		bodyModel[91].addBox(0F, 0F, 0F, 6, 2, 3, 0F); // Box 109
		bodyModel[91].setRotationPoint(57F, 2F, -1.5F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 15, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 110
		bodyModel[92].setRotationPoint(13F, 2F, -1F);

		bodyModel[93].addBox(0F, 0F, 0F, 27, 3, 2, 0F); // Box 111
		bodyModel[93].setRotationPoint(-14F, 2F, -1F);

		bodyModel[94].addBox(0F, 0F, 0F, 8, 4, 7, 0F); // Box 112
		bodyModel[94].setRotationPoint(-13F, 2F, -10F);

		bodyModel[95].addBox(0F, 0F, 0F, 8, 4, 7, 0F); // Box 113
		bodyModel[95].setRotationPoint(-4F, 2F, -10F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 1, 3, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 114
		bodyModel[96].setRotationPoint(-14F, 2F, -11F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 1, 3, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 115
		bodyModel[97].setRotationPoint(12F, 2F, -11F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 1, 3, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 116
		bodyModel[98].setRotationPoint(12F, 2F, 1F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 1, 3, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 117
		bodyModel[99].setRotationPoint(-14F, 2F, 1F);

		bodyModel[100].addBox(0F, 0F, 0F, 7, 3, 4, 0F); // Box 118
		bodyModel[100].setRotationPoint(2F, 2F, 6F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 7, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 45
		bodyModel[101].setRotationPoint(32F, -4F, -4F);

		bodyModel[102].addBox(0F, 0F, 0F, 9, 1, 1, 0F); // Box 99
		bodyModel[102].setRotationPoint(31F, -5F, -4F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 1, 5, 6, 0F,-0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 130
		bodyModel[103].setRotationPoint(46F, -8F, -10F);

		bodyModel[104].addBox(0F, 0F, 0F, 4, 1, 6, 0F); // Box 131
		bodyModel[104].setRotationPoint(43F, -3F, -10F);

		bodyModel[105].addBox(0F, 0F, 0F, 5, 1, 1, 0F); // Box 134
		bodyModel[105].setRotationPoint(43F, -5F, -4F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 3, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 135
		bodyModel[106].setRotationPoint(44F, -4F, -4F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 1, 5, 6, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 136
		bodyModel[107].setRotationPoint(-48F, -8F, -10F);

		bodyModel[108].addBox(0F, 0F, 0F, 4, 1, 6, 0F); // Box 137
		bodyModel[108].setRotationPoint(-48F, -3F, -10F);

		bodyModel[109].addBox(-6.5F, 0F, -0.5F, 7, 19, 1, 0F); // Box 141 door swing right
		bodyModel[109].setRotationPoint(-50.5F, -18F, -8.5F);

		bodyModel[110].addBox(0F, 0F, 0F, 5, 3, 14, 0F); // Box 142
		bodyModel[110].setRotationPoint(-54F, -21F, -7F);

		bodyModel[111].addBox(0F, 0F, 0F, 5, 3, 14, 0F); // Box 143
		bodyModel[111].setRotationPoint(48F, -21F, -7F);

		bodyModel[112].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 63
		bodyModel[112].setRotationPoint(-36F, 2F, -1F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 97, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 114
		bodyModel[113].setRotationPoint(-49F, -18F, -10F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 97, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 115
		bodyModel[114].setRotationPoint(-49F, -18F, 7F);

		bodyModel[115].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 116 lantern
		bodyModel[115].setRotationPoint(42F, -21F, -1F);

		bodyModel[116].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 118 lantern
		bodyModel[116].setRotationPoint(30F, -21F, -1F);

		bodyModel[117].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 120 lantern
		bodyModel[117].setRotationPoint(18F, -21F, -1F);

		bodyModel[118].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 122 lantern
		bodyModel[118].setRotationPoint(6F, -21F, -1F);

		bodyModel[119].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 124 lantern
		bodyModel[119].setRotationPoint(-45F, -21F, -1F);

		bodyModel[120].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 126 lantern
		bodyModel[120].setRotationPoint(-33F, -21F, -1F);

		bodyModel[121].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 128 lantern
		bodyModel[121].setRotationPoint(-21F, -21F, -1F);

		bodyModel[122].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 130 lantern
		bodyModel[122].setRotationPoint(-9F, -21F, -1F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 1, 19, 8, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 132
		bodyModel[123].setRotationPoint(48F, -18F, -4F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 1, 19, 8, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 133
		bodyModel[124].setRotationPoint(-50F, -18F, -4F);

		bodyModel[125].addBox(-6.5F, 0F, -0.5F, 7, 19, 1, 0F); // Box 126
		bodyModel[125].setRotationPoint(-50.5F, -18F, 8.5F);

		bodyModel[126].addBox(0F, 0F, 0F, 4, 1, 6, 0F); // Box 127
		bodyModel[126].setRotationPoint(31F, -3F, -10F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 1, 5, 6, 0F,-0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[127].setRotationPoint(34F, -8F, -10F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 1, 5, 6, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 129
		bodyModel[128].setRotationPoint(36F, -8F, -10F);

		bodyModel[129].addBox(0F, 0F, 0F, 4, 1, 6, 0F); // Box 130
		bodyModel[129].setRotationPoint(36F, -3F, -10F);

		bodyModel[130].addBox(0F, 0F, 0F, 5, 1, 1, 0F); // Box 131
		bodyModel[130].setRotationPoint(-49F, -5F, -4F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 3, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 132
		bodyModel[131].setRotationPoint(-48F, -4F, -4F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 1, 5, 6, 0F,-0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 133
		bodyModel[132].setRotationPoint(22F, -8F, -10F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 7, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 134
		bodyModel[133].setRotationPoint(20F, -4F, -4F);

		bodyModel[134].addBox(0F, 0F, 0F, 9, 1, 1, 0F); // Box 135
		bodyModel[134].setRotationPoint(19F, -5F, -4F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 1, 5, 6, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 136
		bodyModel[135].setRotationPoint(24F, -8F, -10F);

		bodyModel[136].addBox(0F, 0F, 0F, 4, 1, 6, 0F); // Box 137
		bodyModel[136].setRotationPoint(24F, -3F, -10F);

		bodyModel[137].addBox(0F, 0F, 0F, 4, 1, 6, 0F); // Box 138
		bodyModel[137].setRotationPoint(19F, -3F, -10F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 1, 5, 6, 0F,-0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 139
		bodyModel[138].setRotationPoint(10F, -8F, -10F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 7, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 140
		bodyModel[139].setRotationPoint(8F, -4F, -4F);

		bodyModel[140].addBox(0F, 0F, 0F, 9, 1, 1, 0F); // Box 141
		bodyModel[140].setRotationPoint(7F, -5F, -4F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 1, 5, 6, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 142
		bodyModel[141].setRotationPoint(12F, -8F, -10F);

		bodyModel[142].addBox(0F, 0F, 0F, 4, 1, 6, 0F); // Box 143
		bodyModel[142].setRotationPoint(12F, -3F, -10F);

		bodyModel[143].addBox(0F, 0F, 0F, 4, 1, 6, 0F); // Box 144
		bodyModel[143].setRotationPoint(7F, -3F, -10F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 1, 5, 6, 0F,-0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 145
		bodyModel[144].setRotationPoint(-38F, -8F, -10F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 7, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 146
		bodyModel[145].setRotationPoint(-40F, -4F, -4F);

		bodyModel[146].addBox(0F, 0F, 0F, 9, 1, 1, 0F); // Box 147
		bodyModel[146].setRotationPoint(-41F, -5F, -4F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 1, 5, 6, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 148
		bodyModel[147].setRotationPoint(-36F, -8F, -10F);

		bodyModel[148].addBox(0F, 0F, 0F, 4, 1, 6, 0F); // Box 149
		bodyModel[148].setRotationPoint(-36F, -3F, -10F);

		bodyModel[149].addBox(0F, 0F, 0F, 4, 1, 6, 0F); // Box 150
		bodyModel[149].setRotationPoint(-41F, -3F, -10F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 1, 5, 6, 0F,-0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 151
		bodyModel[150].setRotationPoint(-26F, -8F, -10F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 7, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 152
		bodyModel[151].setRotationPoint(-28F, -4F, -4F);

		bodyModel[152].addBox(0F, 0F, 0F, 9, 1, 1, 0F); // Box 153
		bodyModel[152].setRotationPoint(-29F, -5F, -4F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 1, 5, 6, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 154
		bodyModel[153].setRotationPoint(-24F, -8F, -10F);

		bodyModel[154].addBox(0F, 0F, 0F, 4, 1, 6, 0F); // Box 155
		bodyModel[154].setRotationPoint(-24F, -3F, -10F);

		bodyModel[155].addBox(0F, 0F, 0F, 4, 1, 6, 0F); // Box 156
		bodyModel[155].setRotationPoint(-29F, -3F, -10F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 1, 5, 6, 0F,-0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 157
		bodyModel[156].setRotationPoint(-14F, -8F, -10F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 7, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 158
		bodyModel[157].setRotationPoint(-16F, -4F, -4F);

		bodyModel[158].addBox(0F, 0F, 0F, 9, 1, 1, 0F); // Box 159
		bodyModel[158].setRotationPoint(-17F, -5F, -4F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 1, 5, 6, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 160
		bodyModel[159].setRotationPoint(-12F, -8F, -10F);

		bodyModel[160].addBox(0F, 0F, 0F, 4, 1, 6, 0F); // Box 161
		bodyModel[160].setRotationPoint(-12F, -3F, -10F);

		bodyModel[161].addBox(0F, 0F, 0F, 4, 1, 6, 0F); // Box 162
		bodyModel[161].setRotationPoint(-17F, -3F, -10F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 1, 5, 6, 0F,-0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 163
		bodyModel[162].setRotationPoint(-2F, -8F, -10F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 7, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 164
		bodyModel[163].setRotationPoint(-4F, -4F, -4F);

		bodyModel[164].addBox(0F, 0F, 0F, 9, 1, 1, 0F); // Box 165
		bodyModel[164].setRotationPoint(-5F, -5F, -4F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 1, 5, 6, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 166
		bodyModel[165].setRotationPoint(0F, -8F, -10F);

		bodyModel[166].addBox(0F, 0F, 0F, 4, 1, 6, 0F); // Box 167
		bodyModel[166].setRotationPoint(0F, -3F, -10F);

		bodyModel[167].addBox(0F, 0F, 0F, 4, 1, 6, 0F); // Box 168
		bodyModel[167].setRotationPoint(-5F, -3F, -10F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 1, 5, 6, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 169
		bodyModel[168].setRotationPoint(0F, -8F, 4F);

		bodyModel[169].addBox(0F, 0F, 0F, 4, 1, 6, 0F); // Box 170
		bodyModel[169].setRotationPoint(43F, -3F, 4F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 1, 5, 6, 0F,-0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 171
		bodyModel[170].setRotationPoint(46F, -8F, 4F);

		bodyModel[171].addBox(0F, 0F, 0F, 4, 1, 6, 0F); // Box 172
		bodyModel[171].setRotationPoint(36F, -3F, 4F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 1, 5, 6, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 173
		bodyModel[172].setRotationPoint(36F, -8F, 4F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 1, 5, 6, 0F,-0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 174
		bodyModel[173].setRotationPoint(34F, -8F, 4F);

		bodyModel[174].addBox(0F, 0F, 0F, 4, 1, 6, 0F); // Box 175
		bodyModel[174].setRotationPoint(31F, -3F, 4F);

		bodyModel[175].addShapeBox(0F, 0F, 0F, 1, 5, 6, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 176
		bodyModel[175].setRotationPoint(24F, -8F, 4F);

		bodyModel[176].addBox(0F, 0F, 0F, 4, 1, 6, 0F); // Box 177
		bodyModel[176].setRotationPoint(24F, -3F, 4F);

		bodyModel[177].addShapeBox(0F, 0F, 0F, 1, 5, 6, 0F,-0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 178
		bodyModel[177].setRotationPoint(22F, -8F, 4F);

		bodyModel[178].addBox(0F, 0F, 0F, 4, 1, 6, 0F); // Box 179
		bodyModel[178].setRotationPoint(19F, -3F, 4F);

		bodyModel[179].addBox(0F, 0F, 0F, 4, 1, 6, 0F); // Box 180
		bodyModel[179].setRotationPoint(12F, -3F, 4F);

		bodyModel[180].addShapeBox(0F, 0F, 0F, 1, 5, 6, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 181
		bodyModel[180].setRotationPoint(12F, -8F, 4F);

		bodyModel[181].addShapeBox(0F, 0F, 0F, 1, 5, 6, 0F,-0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 182
		bodyModel[181].setRotationPoint(10F, -8F, 4F);

		bodyModel[182].addBox(0F, 0F, 0F, 4, 1, 6, 0F); // Box 183
		bodyModel[182].setRotationPoint(7F, -3F, 4F);

		bodyModel[183].addBox(0F, 0F, 0F, 4, 1, 6, 0F); // Box 184
		bodyModel[183].setRotationPoint(0F, -3F, 4F);

		bodyModel[184].addShapeBox(0F, 0F, 0F, 1, 5, 6, 0F,-0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 185
		bodyModel[184].setRotationPoint(-2F, -8F, 4F);

		bodyModel[185].addBox(0F, 0F, 0F, 4, 1, 6, 0F); // Box 186
		bodyModel[185].setRotationPoint(-5F, -3F, 4F);

		bodyModel[186].addBox(0F, 0F, 0F, 4, 1, 6, 0F); // Box 187
		bodyModel[186].setRotationPoint(-12F, -3F, 4F);

		bodyModel[187].addShapeBox(0F, 0F, 0F, 1, 5, 6, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 188
		bodyModel[187].setRotationPoint(-12F, -8F, 4F);

		bodyModel[188].addShapeBox(0F, 0F, 0F, 1, 5, 6, 0F,-0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 189
		bodyModel[188].setRotationPoint(-14F, -8F, 4F);

		bodyModel[189].addBox(0F, 0F, 0F, 4, 1, 6, 0F); // Box 190
		bodyModel[189].setRotationPoint(-17F, -3F, 4F);

		bodyModel[190].addBox(0F, 0F, 0F, 4, 1, 6, 0F); // Box 191
		bodyModel[190].setRotationPoint(-24F, -3F, 4F);

		bodyModel[191].addShapeBox(0F, 0F, 0F, 1, 5, 6, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 192
		bodyModel[191].setRotationPoint(-24F, -8F, 4F);

		bodyModel[192].addShapeBox(0F, 0F, 0F, 1, 5, 6, 0F,-0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 193
		bodyModel[192].setRotationPoint(-26F, -8F, 4F);

		bodyModel[193].addBox(0F, 0F, 0F, 4, 1, 6, 0F); // Box 194
		bodyModel[193].setRotationPoint(-29F, -3F, 4F);

		bodyModel[194].addBox(0F, 0F, 0F, 4, 1, 6, 0F); // Box 195
		bodyModel[194].setRotationPoint(-36F, -3F, 4F);

		bodyModel[195].addShapeBox(0F, 0F, 0F, 1, 5, 6, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 196
		bodyModel[195].setRotationPoint(-36F, -8F, 4F);

		bodyModel[196].addShapeBox(0F, 0F, 0F, 1, 5, 6, 0F,-0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 197
		bodyModel[196].setRotationPoint(-38F, -8F, 4F);

		bodyModel[197].addBox(0F, 0F, 0F, 4, 1, 6, 0F); // Box 198
		bodyModel[197].setRotationPoint(-41F, -3F, 4F);

		bodyModel[198].addBox(0F, 0F, 0F, 4, 1, 6, 0F); // Box 199
		bodyModel[198].setRotationPoint(-48F, -3F, 4F);

		bodyModel[199].addShapeBox(0F, 0F, 0F, 1, 5, 6, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 200
		bodyModel[199].setRotationPoint(-48F, -8F, 4F);

		bodyModel[200].addBox(0F, 0F, 0F, 9, 1, 1, 0F); // Box 201
		bodyModel[200].setRotationPoint(-5F, -5F, 3F);

		bodyModel[201].addShapeBox(0F, 0F, 0F, 3, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 202
		bodyModel[201].setRotationPoint(-48F, -4F, 3F);

		bodyModel[202].addBox(0F, 0F, 0F, 5, 1, 1, 0F); // Box 203
		bodyModel[202].setRotationPoint(-49F, -5F, 3F);

		bodyModel[203].addShapeBox(0F, 0F, 0F, 7, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 204
		bodyModel[203].setRotationPoint(-40F, -4F, 3F);

		bodyModel[204].addBox(0F, 0F, 0F, 9, 1, 1, 0F); // Box 205
		bodyModel[204].setRotationPoint(-41F, -5F, 3F);

		bodyModel[205].addShapeBox(0F, 0F, 0F, 7, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 206
		bodyModel[205].setRotationPoint(-28F, -4F, 3F);

		bodyModel[206].addBox(0F, 0F, 0F, 9, 1, 1, 0F); // Box 207
		bodyModel[206].setRotationPoint(-29F, -5F, 3F);

		bodyModel[207].addBox(0F, 0F, 0F, 9, 1, 1, 0F); // Box 208
		bodyModel[207].setRotationPoint(-17F, -5F, 3F);

		bodyModel[208].addShapeBox(0F, 0F, 0F, 7, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 209
		bodyModel[208].setRotationPoint(-16F, -4F, 3F);

		bodyModel[209].addShapeBox(0F, 0F, 0F, 7, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 210
		bodyModel[209].setRotationPoint(-4F, -4F, 3F);

		bodyModel[210].addShapeBox(0F, 0F, 0F, 7, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 211
		bodyModel[210].setRotationPoint(8F, -4F, 3F);

		bodyModel[211].addBox(0F, 0F, 0F, 9, 1, 1, 0F); // Box 212
		bodyModel[211].setRotationPoint(7F, -5F, 3F);

		bodyModel[212].addBox(0F, 0F, 0F, 9, 1, 1, 0F); // Box 213
		bodyModel[212].setRotationPoint(19F, -5F, 3F);

		bodyModel[213].addShapeBox(0F, 0F, 0F, 7, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 214
		bodyModel[213].setRotationPoint(20F, -4F, 3F);

		bodyModel[214].addShapeBox(0F, 0F, 0F, 7, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 215
		bodyModel[214].setRotationPoint(32F, -4F, 3F);

		bodyModel[215].addBox(0F, 0F, 0F, 9, 1, 1, 0F); // Box 216
		bodyModel[215].setRotationPoint(31F, -5F, 3F);

		bodyModel[216].addBox(0F, 0F, 0F, 5, 1, 1, 0F); // Box 217
		bodyModel[216].setRotationPoint(43F, -5F, 3F);

		bodyModel[217].addShapeBox(0F, 0F, 0F, 3, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 218
		bodyModel[217].setRotationPoint(44F, -4F, 3F);

		bodyModel[218].addBox(-6.5F, 0F, -0.5F, 7, 19, 1, 0F); // Box 219
		bodyModel[218].setRotationPoint(55.5F, -18F, -8.5F);

		bodyModel[219].addBox(-6.5F, 0F, -0.5F, 7, 19, 1, 0F); // Box 220
		bodyModel[219].setRotationPoint(55.5F, -18F, 8.5F);

		bodyModel[220].addBox(0F, 0F, 0F, 5, 4, 1, 0F); // Box 81 wall right
		bodyModel[220].setRotationPoint(-56F, -15F, 8F);

		bodyModel[221].addBox(0F, 0F, 0F, 6, 4, 1, 0F); // Glow
		bodyModel[221].setRotationPoint(-49F, -15F, -11F);

		bodyModel[222].addBox(0F, 0F, 0F, 6, 4, 1, 0F); // Glow
		bodyModel[222].setRotationPoint(-49F, -15F, 10F);

		bodyModel[223].addBox(0F, 0F, 0F, 6, 4, 1, 0F); // Glow
		bodyModel[223].setRotationPoint(-49F, -10F, 10F);

		bodyModel[224].addBox(0F, 0F, 0F, 6, 4, 1, 0F); // Glow
		bodyModel[224].setRotationPoint(-49F, -10F, -11F);

		bodyModel[225].addBox(0F, 0F, 0F, 5, 4, 1, 0F); // Box 81 wall right
		bodyModel[225].setRotationPoint(-56F, -10F, -9F);

		bodyModel[226].addBox(0F, 0F, 0F, 5, 4, 1, 0F); // Box 81 wall right
		bodyModel[226].setRotationPoint(-56F, -10F, 8F);

		bodyModel[227].addBox(0F, 0F, 0F, 5, 4, 1, 0F); // Box 81 wall right
		bodyModel[227].setRotationPoint(50F, -15F, 8F);

		bodyModel[228].addBox(0F, 0F, 0F, 5, 4, 1, 0F); // Box 81 wall right
		bodyModel[228].setRotationPoint(50F, -10F, 8F);

		bodyModel[229].addBox(0F, 0F, -5F, 5, 4, 1, 0F); // Box 81 wall right
		bodyModel[229].setRotationPoint(50F, -15F, -4F);

		bodyModel[230].addBox(0F, 0F, -5F, 5, 4, 1, 0F); // Box 81 wall right
		bodyModel[230].setRotationPoint(50F, -10F, -4F);

		bodyModel[231].addBox(0F, 0F, 0F, 6, 4, 1, 0F); // Glow
		bodyModel[231].setRotationPoint(-42F, -15F, -11F);

		bodyModel[232].addBox(0F, 0F, 0F, 6, 4, 1, 0F); // Glow
		bodyModel[232].setRotationPoint(-42F, -10F, -11F);

		bodyModel[233].addBox(0F, 0F, 0F, 6, 4, 1, 0F); // Glow
		bodyModel[233].setRotationPoint(-35F, -15F, -11F);

		bodyModel[234].addBox(0F, 0F, 0F, 6, 4, 1, 0F); // Glow
		bodyModel[234].setRotationPoint(-35F, -10F, -11F);

		bodyModel[235].addBox(0F, 0F, 0F, 6, 4, 1, 0F); // Glow
		bodyModel[235].setRotationPoint(-28F, -15F, -11F);

		bodyModel[236].addBox(0F, 0F, 0F, 6, 4, 1, 0F); // Glow
		bodyModel[236].setRotationPoint(-28F, -10F, -11F);

		bodyModel[237].addBox(0F, 0F, 0F, 6, 4, 1, 0F); // Glow
		bodyModel[237].setRotationPoint(-21F, -15F, -11F);

		bodyModel[238].addBox(0F, 0F, 0F, 6, 4, 1, 0F); // Glow
		bodyModel[238].setRotationPoint(-21F, -10F, -11F);

		bodyModel[239].addBox(0F, 0F, 0F, 6, 4, 1, 0F); // Glow
		bodyModel[239].setRotationPoint(-14F, -15F, -11F);

		bodyModel[240].addBox(0F, 0F, 0F, 6, 4, 1, 0F); // Glow
		bodyModel[240].setRotationPoint(-14F, -10F, -11F);

		bodyModel[241].addBox(0F, 0F, 0F, 6, 4, 1, 0F); // Glow
		bodyModel[241].setRotationPoint(-7F, -15F, -11F);

		bodyModel[242].addBox(0F, 0F, 0F, 6, 4, 1, 0F); // Glow
		bodyModel[242].setRotationPoint(-7F, -10F, -11F);

		bodyModel[243].addBox(0F, 0F, 0F, 6, 4, 1, 0F); // Glow
		bodyModel[243].setRotationPoint(0F, -15F, -11F);

		bodyModel[244].addBox(0F, 0F, 0F, 6, 4, 1, 0F); // Glow
		bodyModel[244].setRotationPoint(0F, -10F, -11F);

		bodyModel[245].addBox(0F, 0F, 0F, 6, 4, 1, 0F); // Glow
		bodyModel[245].setRotationPoint(7F, -15F, -11F);

		bodyModel[246].addBox(0F, 0F, 0F, 6, 4, 1, 0F); // Glow
		bodyModel[246].setRotationPoint(7F, -10F, -11F);

		bodyModel[247].addBox(0F, 0F, 0F, 6, 4, 1, 0F); // Glow
		bodyModel[247].setRotationPoint(14F, -15F, -11F);

		bodyModel[248].addBox(0F, 0F, 0F, 6, 4, 1, 0F); // Glow
		bodyModel[248].setRotationPoint(14F, -10F, -11F);

		bodyModel[249].addBox(0F, 0F, 0F, 6, 4, 1, 0F); // Glow
		bodyModel[249].setRotationPoint(21F, -15F, -11F);

		bodyModel[250].addBox(0F, 0F, 0F, 6, 4, 1, 0F); // Glow
		bodyModel[250].setRotationPoint(21F, -10F, -11F);

		bodyModel[251].addBox(0F, 0F, 0F, 6, 4, 1, 0F); // Glow
		bodyModel[251].setRotationPoint(28F, -15F, -11F);

		bodyModel[252].addBox(0F, 0F, 0F, 6, 4, 1, 0F); // Glow
		bodyModel[252].setRotationPoint(28F, -10F, -11F);

		bodyModel[253].addBox(0F, 0F, 0F, 6, 4, 1, 0F); // Glow
		bodyModel[253].setRotationPoint(35F, -15F, -11F);

		bodyModel[254].addBox(0F, 0F, 0F, 6, 4, 1, 0F); // Glow
		bodyModel[254].setRotationPoint(35F, -10F, -11F);

		bodyModel[255].addBox(0F, 0F, 0F, 6, 4, 1, 0F); // Glow
		bodyModel[255].setRotationPoint(42F, -15F, -11F);

		bodyModel[256].addBox(0F, 0F, 0F, 6, 4, 1, 0F); // Glow
		bodyModel[256].setRotationPoint(42F, -10F, -11F);

		bodyModel[257].addBox(0F, 0F, 0F, 6, 4, 1, 0F); // Glow
		bodyModel[257].setRotationPoint(-42F, -15F, 10F);

		bodyModel[258].addBox(0F, 0F, 0F, 6, 4, 1, 0F); // Glow
		bodyModel[258].setRotationPoint(-42F, -10F, 10F);

		bodyModel[259].addBox(0F, 0F, 0F, 6, 4, 1, 0F); // Glow
		bodyModel[259].setRotationPoint(-35F, -15F, 10F);

		bodyModel[260].addBox(0F, 0F, 0F, 6, 4, 1, 0F); // Glow
		bodyModel[260].setRotationPoint(-35F, -10F, 10F);

		bodyModel[261].addBox(0F, 0F, 0F, 6, 4, 1, 0F); // Glow
		bodyModel[261].setRotationPoint(-28F, -15F, 10F);

		bodyModel[262].addBox(0F, 0F, 0F, 6, 4, 1, 0F); // Glow
		bodyModel[262].setRotationPoint(-28F, -10F, 10F);

		bodyModel[263].addBox(0F, 0F, 0F, 6, 4, 1, 0F); // Glow
		bodyModel[263].setRotationPoint(-21F, -15F, 10F);

		bodyModel[264].addBox(0F, 0F, 0F, 6, 4, 1, 0F); // Glow
		bodyModel[264].setRotationPoint(-21F, -10F, 10F);

		bodyModel[265].addBox(0F, 0F, 0F, 6, 4, 1, 0F); // Glow
		bodyModel[265].setRotationPoint(-14F, -15F, 10F);

		bodyModel[266].addBox(0F, 0F, 0F, 6, 4, 1, 0F); // Glow
		bodyModel[266].setRotationPoint(-14F, -10F, 10F);

		bodyModel[267].addBox(0F, 0F, 0F, 6, 4, 1, 0F); // Glow
		bodyModel[267].setRotationPoint(-7F, -15F, 10F);

		bodyModel[268].addBox(0F, 0F, 0F, 6, 4, 1, 0F); // Glow
		bodyModel[268].setRotationPoint(-7F, -10F, 10F);

		bodyModel[269].addBox(0F, 0F, 0F, 6, 4, 1, 0F); // Glow
		bodyModel[269].setRotationPoint(0F, -15F, 10F);

		bodyModel[270].addBox(0F, 0F, 0F, 6, 4, 1, 0F); // Glow
		bodyModel[270].setRotationPoint(0F, -10F, 10F);

		bodyModel[271].addBox(0F, 0F, 0F, 6, 4, 1, 0F); // Glow
		bodyModel[271].setRotationPoint(7F, -15F, 10F);

		bodyModel[272].addBox(0F, 0F, 0F, 6, 4, 1, 0F); // Glow
		bodyModel[272].setRotationPoint(7F, -10F, 10F);

		bodyModel[273].addBox(0F, 0F, 0F, 6, 4, 1, 0F); // Glow
		bodyModel[273].setRotationPoint(14F, -15F, 10F);

		bodyModel[274].addBox(0F, 0F, 0F, 6, 4, 1, 0F); // Glow
		bodyModel[274].setRotationPoint(14F, -10F, 10F);

		bodyModel[275].addBox(0F, 0F, 0F, 6, 4, 1, 0F); // Glow
		bodyModel[275].setRotationPoint(21F, -15F, 10F);

		bodyModel[276].addBox(0F, 0F, 0F, 6, 4, 1, 0F); // Glow
		bodyModel[276].setRotationPoint(21F, -10F, 10F);

		bodyModel[277].addBox(0F, 0F, 0F, 6, 4, 1, 0F); // Glow
		bodyModel[277].setRotationPoint(28F, -15F, 10F);

		bodyModel[278].addBox(0F, 0F, 0F, 6, 4, 1, 0F); // Glow
		bodyModel[278].setRotationPoint(28F, -10F, 10F);

		bodyModel[279].addBox(0F, 0F, 0F, 6, 4, 1, 0F); // Glow
		bodyModel[279].setRotationPoint(35F, -15F, 10F);

		bodyModel[280].addBox(0F, 0F, 0F, 6, 4, 1, 0F); // Glow
		bodyModel[280].setRotationPoint(35F, -10F, 10F);

		bodyModel[281].addBox(0F, 0F, 0F, 6, 4, 1, 0F); // Glow
		bodyModel[281].setRotationPoint(42F, -15F, 10F);

		bodyModel[282].addBox(0F, 0F, 0F, 6, 4, 1, 0F); // Glow
		bodyModel[282].setRotationPoint(42F, -10F, 10F);

		bodyModel[283].addBox(0F, 0F, 0F, 5, 4, 1, 0F); // Box 81 wall right
		bodyModel[283].setRotationPoint(-56F, -15F, -9F);
	}
	ModelPEtrucc theTrucc = new ModelPEtrucc();
	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		for (int i = 0; i < 284; i++) {
			if (bodyModel[i].boxName != null && bodyModel[i].boxName.contains("lamp")) {
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
		Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/pe_truccs.png"));
		GL11.glPushMatrix();
		GL11.glTranslated(-2.18, -0.1, 0);
		theTrucc.render(entity, f, f1, f2, f3, f4, f5);

		GL11.glTranslated(4.3, 0, 0);
		theTrucc.render(entity, f, f1, f2, f3, f4, f5);
		GL11.glPopMatrix();
	}
}