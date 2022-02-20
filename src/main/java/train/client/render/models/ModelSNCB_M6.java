//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2022 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator:
// Created on:16.08.2021 - 15:45:05
// Last changed on: 16.08.2021 - 15:45:05


package train.client.render.models;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import tmt.ModelBase;
import tmt.ModelRendererTurbo;
import tmt.Tessellator;
import train.common.library.Info;

public class ModelSNCB_M6 extends ModelBase
{
	int textureX = 512;
	int textureY = 512;

	public ModelSNCB_M6()
	{
		sncb_m6Model = new ModelRendererTurbo[543];
		sncb_m6Model[0] = new ModelRendererTurbo(this, 168, 132, textureX, textureY); // Box 10
		sncb_m6Model[1] = new ModelRendererTurbo(this, 74, 180, textureX, textureY); // Box 11
		sncb_m6Model[2] = new ModelRendererTurbo(this, 54, 178, textureX, textureY); // Box 12
		sncb_m6Model[3] = new ModelRendererTurbo(this, 168, 129, textureX, textureY); // Box 13
		sncb_m6Model[4] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Box 14
		sncb_m6Model[5] = new ModelRendererTurbo(this, 303, 26, textureX, textureY); // Box 15
		sncb_m6Model[6] = new ModelRendererTurbo(this, 31, 178, textureX, textureY); // Box 19
		sncb_m6Model[7] = new ModelRendererTurbo(this, 319, 147, textureX, textureY); // Box 20
		sncb_m6Model[8] = new ModelRendererTurbo(this, 8, 176, textureX, textureY); // Box 27
		sncb_m6Model[9] = new ModelRendererTurbo(this, 366, 147, textureX, textureY); // Box 28
		sncb_m6Model[10] = new ModelRendererTurbo(this, 308, 156, textureX, textureY); // Box 31
		sncb_m6Model[11] = new ModelRendererTurbo(this, 303, 1, textureX, textureY); // Box 32
		sncb_m6Model[12] = new ModelRendererTurbo(this, 1, 132, textureX, textureY); // Box 9
		sncb_m6Model[13] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 33
		sncb_m6Model[14] = new ModelRendererTurbo(this, 1, 120, textureX, textureY); // Box 34
		sncb_m6Model[15] = new ModelRendererTurbo(this, 1, 123, textureX, textureY); // Box 35
		sncb_m6Model[16] = new ModelRendererTurbo(this, 1, 21, textureX, textureY); // Box 36
		sncb_m6Model[17] = new ModelRendererTurbo(this, 164, 123, textureX, textureY); // Box 37
		sncb_m6Model[18] = new ModelRendererTurbo(this, 176, 120, textureX, textureY); // Box 38
		sncb_m6Model[19] = new ModelRendererTurbo(this, 1, 46, textureX, textureY); // Box 40
		sncb_m6Model[20] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 41
		sncb_m6Model[21] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 42
		sncb_m6Model[22] = new ModelRendererTurbo(this, 1, 51, textureX, textureY); // Box 44
		sncb_m6Model[23] = new ModelRendererTurbo(this, 1, 54, textureX, textureY); // Box 45
		sncb_m6Model[24] = new ModelRendererTurbo(this, 1, 63, textureX, textureY); // Box 46
		sncb_m6Model[25] = new ModelRendererTurbo(this, 1, 69, textureX, textureY); // Box 47
		sncb_m6Model[26] = new ModelRendererTurbo(this, 1, 77, textureX, textureY); // Box 48
		sncb_m6Model[27] = new ModelRendererTurbo(this, 146, 109, textureX, textureY); // Box 50
		sncb_m6Model[28] = new ModelRendererTurbo(this, 256, 159, textureX, textureY); // Box 51
		sncb_m6Model[29] = new ModelRendererTurbo(this, 171, 171, textureX, textureY); // Box 59
		sncb_m6Model[30] = new ModelRendererTurbo(this, 1, 167, textureX, textureY); // Box 61
		sncb_m6Model[31] = new ModelRendererTurbo(this, 210, 165, textureX, textureY); // Box 63
		sncb_m6Model[32] = new ModelRendererTurbo(this, 210, 165, textureX, textureY); // Box 64
		sncb_m6Model[33] = new ModelRendererTurbo(this, 210, 165, textureX, textureY); // Box 65
		sncb_m6Model[34] = new ModelRendererTurbo(this, 210, 165, textureX, textureY); // Box 66
		sncb_m6Model[35] = new ModelRendererTurbo(this, 210, 165, textureX, textureY); // Box 67
		sncb_m6Model[36] = new ModelRendererTurbo(this, 210, 165, textureX, textureY); // Box 68
		sncb_m6Model[37] = new ModelRendererTurbo(this, 210, 165, textureX, textureY); // Box 69
		sncb_m6Model[38] = new ModelRendererTurbo(this, 171, 187, textureX, textureY); // Box 70
		sncb_m6Model[39] = new ModelRendererTurbo(this, 2, 153, textureX, textureY); // Box 71
		sncb_m6Model[40] = new ModelRendererTurbo(this, 13, 167, textureX, textureY); // Box 73
		sncb_m6Model[41] = new ModelRendererTurbo(this, 226, 174, textureX, textureY); // Box 81
		sncb_m6Model[42] = new ModelRendererTurbo(this, 234, 173, textureX, textureY); // Box 82
		sncb_m6Model[43] = new ModelRendererTurbo(this, 234, 173, textureX, textureY); // Box 83
		sncb_m6Model[44] = new ModelRendererTurbo(this, 219, 162, textureX, textureY); // Box 84
		sncb_m6Model[45] = new ModelRendererTurbo(this, 210, 178, textureX, textureY); // Box 85
		sncb_m6Model[46] = new ModelRendererTurbo(this, 210, 178, textureX, textureY); // Box 86
		sncb_m6Model[47] = new ModelRendererTurbo(this, 219, 174, textureX, textureY); // Box 87
		sncb_m6Model[48] = new ModelRendererTurbo(this, 219, 174, textureX, textureY); // Box 88
		sncb_m6Model[49] = new ModelRendererTurbo(this, 221, 187, textureX, textureY); // Box 89
		sncb_m6Model[50] = new ModelRendererTurbo(this, 221, 187, textureX, textureY); // Box 90
		sncb_m6Model[51] = new ModelRendererTurbo(this, 232, 179, textureX, textureY); // Box 91
		sncb_m6Model[52] = new ModelRendererTurbo(this, 232, 179, textureX, textureY); // Box 92
		sncb_m6Model[53] = new ModelRendererTurbo(this, 232, 179, textureX, textureY); // Box 94
		sncb_m6Model[54] = new ModelRendererTurbo(this, 219, 162, textureX, textureY); // Box 95
		sncb_m6Model[55] = new ModelRendererTurbo(this, 226, 174, textureX, textureY); // Box 96
		sncb_m6Model[56] = new ModelRendererTurbo(this, 234, 173, textureX, textureY); // Box 97
		sncb_m6Model[57] = new ModelRendererTurbo(this, 234, 173, textureX, textureY); // Box 98
		sncb_m6Model[58] = new ModelRendererTurbo(this, 210, 178, textureX, textureY); // Box 99
		sncb_m6Model[59] = new ModelRendererTurbo(this, 210, 178, textureX, textureY); // Box 100
		sncb_m6Model[60] = new ModelRendererTurbo(this, 221, 187, textureX, textureY); // Box 101
		sncb_m6Model[61] = new ModelRendererTurbo(this, 221, 187, textureX, textureY); // Box 102
		sncb_m6Model[62] = new ModelRendererTurbo(this, 232, 179, textureX, textureY); // Box 103
		sncb_m6Model[63] = new ModelRendererTurbo(this, 219, 174, textureX, textureY); // Box 104
		sncb_m6Model[64] = new ModelRendererTurbo(this, 219, 174, textureX, textureY); // Box 105
		sncb_m6Model[65] = new ModelRendererTurbo(this, 232, 179, textureX, textureY); // Box 106
		sncb_m6Model[66] = new ModelRendererTurbo(this, 219, 162, textureX, textureY); // Box 107
		sncb_m6Model[67] = new ModelRendererTurbo(this, 226, 174, textureX, textureY); // Box 108
		sncb_m6Model[68] = new ModelRendererTurbo(this, 234, 167, textureX, textureY); // Box 109
		sncb_m6Model[69] = new ModelRendererTurbo(this, 234, 167, textureX, textureY); // Box 110
		sncb_m6Model[70] = new ModelRendererTurbo(this, 221, 178, textureX, textureY); // Box 111
		sncb_m6Model[71] = new ModelRendererTurbo(this, 221, 178, textureX, textureY); // Box 112
		sncb_m6Model[72] = new ModelRendererTurbo(this, 210, 187, textureX, textureY); // Box 113
		sncb_m6Model[73] = new ModelRendererTurbo(this, 210, 187, textureX, textureY); // Box 114
		sncb_m6Model[74] = new ModelRendererTurbo(this, 232, 179, textureX, textureY); // Box 115
		sncb_m6Model[75] = new ModelRendererTurbo(this, 219, 174, textureX, textureY); // Box 116
		sncb_m6Model[76] = new ModelRendererTurbo(this, 219, 174, textureX, textureY); // Box 117
		sncb_m6Model[77] = new ModelRendererTurbo(this, 210, 187, textureX, textureY); // Box 118
		sncb_m6Model[78] = new ModelRendererTurbo(this, 210, 187, textureX, textureY); // Box 119
		sncb_m6Model[79] = new ModelRendererTurbo(this, 221, 178, textureX, textureY); // Box 120
		sncb_m6Model[80] = new ModelRendererTurbo(this, 221, 178, textureX, textureY); // Box 121
		sncb_m6Model[81] = new ModelRendererTurbo(this, 234, 167, textureX, textureY); // Box 122
		sncb_m6Model[82] = new ModelRendererTurbo(this, 234, 167, textureX, textureY); // Box 123
		sncb_m6Model[83] = new ModelRendererTurbo(this, 232, 179, textureX, textureY); // Box 124
		sncb_m6Model[84] = new ModelRendererTurbo(this, 232, 179, textureX, textureY); // Box 125
		sncb_m6Model[85] = new ModelRendererTurbo(this, 219, 174, textureX, textureY); // Box 126
		sncb_m6Model[86] = new ModelRendererTurbo(this, 219, 162, textureX, textureY); // Box 127
		sncb_m6Model[87] = new ModelRendererTurbo(this, 226, 174, textureX, textureY); // Box 128
		sncb_m6Model[88] = new ModelRendererTurbo(this, 219, 174, textureX, textureY); // Box 129
		sncb_m6Model[89] = new ModelRendererTurbo(this, 234, 173, textureX, textureY); // Box 130
		sncb_m6Model[90] = new ModelRendererTurbo(this, 234, 173, textureX, textureY); // Box 131
		sncb_m6Model[91] = new ModelRendererTurbo(this, 232, 179, textureX, textureY); // Box 132
		sncb_m6Model[92] = new ModelRendererTurbo(this, 232, 179, textureX, textureY); // Box 133
		sncb_m6Model[93] = new ModelRendererTurbo(this, 221, 187, textureX, textureY); // Box 134
		sncb_m6Model[94] = new ModelRendererTurbo(this, 210, 178, textureX, textureY); // Box 135
		sncb_m6Model[95] = new ModelRendererTurbo(this, 210, 178, textureX, textureY); // Box 136
		sncb_m6Model[96] = new ModelRendererTurbo(this, 221, 187, textureX, textureY); // Box 137
		sncb_m6Model[97] = new ModelRendererTurbo(this, 219, 174, textureX, textureY); // Box 138
		sncb_m6Model[98] = new ModelRendererTurbo(this, 219, 174, textureX, textureY); // Box 139
		sncb_m6Model[99] = new ModelRendererTurbo(this, 226, 174, textureX, textureY); // Box 140
		sncb_m6Model[100] = new ModelRendererTurbo(this, 219, 162, textureX, textureY); // Box 141
		sncb_m6Model[101] = new ModelRendererTurbo(this, 210, 165, textureX, textureY); // Box 177
		sncb_m6Model[102] = new ModelRendererTurbo(this, 210, 165, textureX, textureY); // Box 178
		sncb_m6Model[103] = new ModelRendererTurbo(this, 210, 165, textureX, textureY); // Box 179
		sncb_m6Model[104] = new ModelRendererTurbo(this, 210, 165, textureX, textureY); // Box 180
		sncb_m6Model[105] = new ModelRendererTurbo(this, 210, 165, textureX, textureY); // Box 181
		sncb_m6Model[106] = new ModelRendererTurbo(this, 210, 165, textureX, textureY); // Box 182
		sncb_m6Model[107] = new ModelRendererTurbo(this, 210, 165, textureX, textureY); // Box 183
		sncb_m6Model[108] = new ModelRendererTurbo(this, 210, 165, textureX, textureY); // Box 184
		sncb_m6Model[109] = new ModelRendererTurbo(this, 210, 165, textureX, textureY); // Box 185
		sncb_m6Model[110] = new ModelRendererTurbo(this, 210, 165, textureX, textureY); // Box 186
		sncb_m6Model[111] = new ModelRendererTurbo(this, 210, 165, textureX, textureY); // Box 187
		sncb_m6Model[112] = new ModelRendererTurbo(this, 210, 165, textureX, textureY); // Box 188
		sncb_m6Model[113] = new ModelRendererTurbo(this, 210, 165, textureX, textureY); // Box 189
		sncb_m6Model[114] = new ModelRendererTurbo(this, 210, 165, textureX, textureY); // Box 190
		sncb_m6Model[115] = new ModelRendererTurbo(this, 210, 165, textureX, textureY); // Box 191
		sncb_m6Model[116] = new ModelRendererTurbo(this, 210, 165, textureX, textureY); // Box 192
		sncb_m6Model[117] = new ModelRendererTurbo(this, 210, 165, textureX, textureY); // Box 193
		sncb_m6Model[118] = new ModelRendererTurbo(this, 210, 165, textureX, textureY); // Box 194
		sncb_m6Model[119] = new ModelRendererTurbo(this, 210, 165, textureX, textureY); // Box 195
		sncb_m6Model[120] = new ModelRendererTurbo(this, 210, 165, textureX, textureY); // Box 196
		sncb_m6Model[121] = new ModelRendererTurbo(this, 210, 165, textureX, textureY); // Box 197
		sncb_m6Model[122] = new ModelRendererTurbo(this, 198, 87, textureX, textureY); // Box 202
		sncb_m6Model[123] = new ModelRendererTurbo(this, 379, 92, textureX, textureY); // Box 212
		sncb_m6Model[124] = new ModelRendererTurbo(this, 437, 110, textureX, textureY); // Box 215
		sncb_m6Model[125] = new ModelRendererTurbo(this, 472, 91, textureX, textureY); // Box 217
		sncb_m6Model[126] = new ModelRendererTurbo(this, 284, 17, textureX, textureY); // Box 221
		sncb_m6Model[127] = new ModelRendererTurbo(this, 234, 167, textureX, textureY); // Box 183
		sncb_m6Model[128] = new ModelRendererTurbo(this, 234, 167, textureX, textureY); // Box 184
		sncb_m6Model[129] = new ModelRendererTurbo(this, 232, 179, textureX, textureY); // Box 185
		sncb_m6Model[130] = new ModelRendererTurbo(this, 232, 179, textureX, textureY); // Box 186
		sncb_m6Model[131] = new ModelRendererTurbo(this, 210, 187, textureX, textureY); // Box 187
		sncb_m6Model[132] = new ModelRendererTurbo(this, 221, 178, textureX, textureY); // Box 188
		sncb_m6Model[133] = new ModelRendererTurbo(this, 221, 178, textureX, textureY); // Box 189
		sncb_m6Model[134] = new ModelRendererTurbo(this, 210, 187, textureX, textureY); // Box 190
		sncb_m6Model[135] = new ModelRendererTurbo(this, 219, 174, textureX, textureY); // Box 191
		sncb_m6Model[136] = new ModelRendererTurbo(this, 219, 174, textureX, textureY); // Box 192
		sncb_m6Model[137] = new ModelRendererTurbo(this, 219, 162, textureX, textureY); // Box 193
		sncb_m6Model[138] = new ModelRendererTurbo(this, 226, 174, textureX, textureY); // Box 194
		sncb_m6Model[139] = new ModelRendererTurbo(this, 226, 174, textureX, textureY); // Box 81
		sncb_m6Model[140] = new ModelRendererTurbo(this, 234, 173, textureX, textureY); // Box 82
		sncb_m6Model[141] = new ModelRendererTurbo(this, 234, 173, textureX, textureY); // Box 83
		sncb_m6Model[142] = new ModelRendererTurbo(this, 219, 162, textureX, textureY); // Box 84
		sncb_m6Model[143] = new ModelRendererTurbo(this, 210, 178, textureX, textureY); // Box 86
		sncb_m6Model[144] = new ModelRendererTurbo(this, 219, 174, textureX, textureY); // Box 87
		sncb_m6Model[145] = new ModelRendererTurbo(this, 219, 174, textureX, textureY); // Box 88
		sncb_m6Model[146] = new ModelRendererTurbo(this, 221, 187, textureX, textureY); // Box 89
		sncb_m6Model[147] = new ModelRendererTurbo(this, 221, 187, textureX, textureY); // Box 90
		sncb_m6Model[148] = new ModelRendererTurbo(this, 232, 179, textureX, textureY); // Box 91
		sncb_m6Model[149] = new ModelRendererTurbo(this, 232, 179, textureX, textureY); // Box 92
		sncb_m6Model[150] = new ModelRendererTurbo(this, 234, 167, textureX, textureY); // Box 183
		sncb_m6Model[151] = new ModelRendererTurbo(this, 234, 167, textureX, textureY); // Box 184
		sncb_m6Model[152] = new ModelRendererTurbo(this, 232, 179, textureX, textureY); // Box 185
		sncb_m6Model[153] = new ModelRendererTurbo(this, 232, 179, textureX, textureY); // Box 186
		sncb_m6Model[154] = new ModelRendererTurbo(this, 210, 187, textureX, textureY); // Box 187
		sncb_m6Model[155] = new ModelRendererTurbo(this, 221, 178, textureX, textureY); // Box 188
		sncb_m6Model[156] = new ModelRendererTurbo(this, 221, 178, textureX, textureY); // Box 189
		sncb_m6Model[157] = new ModelRendererTurbo(this, 210, 187, textureX, textureY); // Box 190
		sncb_m6Model[158] = new ModelRendererTurbo(this, 219, 174, textureX, textureY); // Box 191
		sncb_m6Model[159] = new ModelRendererTurbo(this, 219, 174, textureX, textureY); // Box 192
		sncb_m6Model[160] = new ModelRendererTurbo(this, 219, 162, textureX, textureY); // Box 193
		sncb_m6Model[161] = new ModelRendererTurbo(this, 226, 174, textureX, textureY); // Box 194
		sncb_m6Model[162] = new ModelRendererTurbo(this, 210, 178, textureX, textureY); // Box 86
		sncb_m6Model[163] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 8
		sncb_m6Model[164] = new ModelRendererTurbo(this, 232, 179, textureX, textureY); // Box 163
		sncb_m6Model[165] = new ModelRendererTurbo(this, 234, 167, textureX, textureY); // Box 164
		sncb_m6Model[166] = new ModelRendererTurbo(this, 232, 179, textureX, textureY); // Box 165
		sncb_m6Model[167] = new ModelRendererTurbo(this, 210, 173, textureX, textureY); // Box 166
		sncb_m6Model[168] = new ModelRendererTurbo(this, 221, 178, textureX, textureY); // Box 167
		sncb_m6Model[169] = new ModelRendererTurbo(this, 210, 187, textureX, textureY); // Box 168
		sncb_m6Model[170] = new ModelRendererTurbo(this, 219, 174, textureX, textureY); // Box 169
		sncb_m6Model[171] = new ModelRendererTurbo(this, 232, 179, textureX, textureY); // Box 163
		sncb_m6Model[172] = new ModelRendererTurbo(this, 234, 167, textureX, textureY); // Box 164
		sncb_m6Model[173] = new ModelRendererTurbo(this, 232, 179, textureX, textureY); // Box 165
		sncb_m6Model[174] = new ModelRendererTurbo(this, 210, 173, textureX, textureY); // Box 166
		sncb_m6Model[175] = new ModelRendererTurbo(this, 221, 178, textureX, textureY); // Box 167
		sncb_m6Model[176] = new ModelRendererTurbo(this, 210, 187, textureX, textureY); // Box 168
		sncb_m6Model[177] = new ModelRendererTurbo(this, 219, 174, textureX, textureY); // Box 169
		sncb_m6Model[178] = new ModelRendererTurbo(this, 232, 179, textureX, textureY); // Box 163
		sncb_m6Model[179] = new ModelRendererTurbo(this, 234, 167, textureX, textureY); // Box 164
		sncb_m6Model[180] = new ModelRendererTurbo(this, 232, 179, textureX, textureY); // Box 165
		sncb_m6Model[181] = new ModelRendererTurbo(this, 210, 173, textureX, textureY); // Box 166
		sncb_m6Model[182] = new ModelRendererTurbo(this, 221, 178, textureX, textureY); // Box 167
		sncb_m6Model[183] = new ModelRendererTurbo(this, 210, 187, textureX, textureY); // Box 168
		sncb_m6Model[184] = new ModelRendererTurbo(this, 219, 174, textureX, textureY); // Box 169
		sncb_m6Model[185] = new ModelRendererTurbo(this, 232, 179, textureX, textureY); // Box 170
		sncb_m6Model[186] = new ModelRendererTurbo(this, 234, 173, textureX, textureY); // Box 171
		sncb_m6Model[187] = new ModelRendererTurbo(this, 232, 179, textureX, textureY); // Box 172
		sncb_m6Model[188] = new ModelRendererTurbo(this, 210, 173, textureX, textureY); // Box 173
		sncb_m6Model[189] = new ModelRendererTurbo(this, 210, 178, textureX, textureY); // Box 174
		sncb_m6Model[190] = new ModelRendererTurbo(this, 221, 187, textureX, textureY); // Box 175
		sncb_m6Model[191] = new ModelRendererTurbo(this, 219, 174, textureX, textureY); // Box 176
		sncb_m6Model[192] = new ModelRendererTurbo(this, 232, 179, textureX, textureY); // Box 170
		sncb_m6Model[193] = new ModelRendererTurbo(this, 234, 173, textureX, textureY); // Box 171
		sncb_m6Model[194] = new ModelRendererTurbo(this, 232, 179, textureX, textureY); // Box 172
		sncb_m6Model[195] = new ModelRendererTurbo(this, 210, 173, textureX, textureY); // Box 173
		sncb_m6Model[196] = new ModelRendererTurbo(this, 210, 178, textureX, textureY); // Box 174
		sncb_m6Model[197] = new ModelRendererTurbo(this, 221, 187, textureX, textureY); // Box 175
		sncb_m6Model[198] = new ModelRendererTurbo(this, 219, 174, textureX, textureY); // Box 176
		sncb_m6Model[199] = new ModelRendererTurbo(this, 232, 179, textureX, textureY); // Box 170
		sncb_m6Model[200] = new ModelRendererTurbo(this, 234, 173, textureX, textureY); // Box 171
		sncb_m6Model[201] = new ModelRendererTurbo(this, 232, 179, textureX, textureY); // Box 172
		sncb_m6Model[202] = new ModelRendererTurbo(this, 210, 173, textureX, textureY); // Box 173
		sncb_m6Model[203] = new ModelRendererTurbo(this, 210, 178, textureX, textureY); // Box 174
		sncb_m6Model[204] = new ModelRendererTurbo(this, 221, 187, textureX, textureY); // Box 175
		sncb_m6Model[205] = new ModelRendererTurbo(this, 219, 174, textureX, textureY); // Box 176
		sncb_m6Model[206] = new ModelRendererTurbo(this, 232, 179, textureX, textureY); // Box 163
		sncb_m6Model[207] = new ModelRendererTurbo(this, 234, 173, textureX, textureY); // Box 164
		sncb_m6Model[208] = new ModelRendererTurbo(this, 232, 179, textureX, textureY); // Box 165
		sncb_m6Model[209] = new ModelRendererTurbo(this, 210, 173, textureX, textureY); // Box 166
		sncb_m6Model[210] = new ModelRendererTurbo(this, 221, 178, textureX, textureY); // Box 167
		sncb_m6Model[211] = new ModelRendererTurbo(this, 210, 187, textureX, textureY); // Box 168
		sncb_m6Model[212] = new ModelRendererTurbo(this, 219, 174, textureX, textureY); // Box 169
		sncb_m6Model[213] = new ModelRendererTurbo(this, 144, 142, textureX, textureY); // Box 168
		sncb_m6Model[214] = new ModelRendererTurbo(this, 1, 142, textureX, textureY); // Box 168
		sncb_m6Model[215] = new ModelRendererTurbo(this, 2, 146, textureX, textureY); // Box 71
		sncb_m6Model[216] = new ModelRendererTurbo(this, 144, 138, textureX, textureY); // Box 168
		sncb_m6Model[217] = new ModelRendererTurbo(this, 1, 138, textureX, textureY); // Box 168
		sncb_m6Model[218] = new ModelRendererTurbo(this, 335, 50, textureX, textureY); // Box 221
		sncb_m6Model[219] = new ModelRendererTurbo(this, 388, 50, textureX, textureY); // Box 216
		sncb_m6Model[220] = new ModelRendererTurbo(this, 1, 109, textureX, textureY); // Box 197
		sncb_m6Model[221] = new ModelRendererTurbo(this, 480, 53, textureX, textureY); // Box 217
		sncb_m6Model[222] = new ModelRendererTurbo(this, 1, 160, textureX, textureY); // Box 61
		sncb_m6Model[223] = new ModelRendererTurbo(this, 171, 178, textureX, textureY); // Box 73
		sncb_m6Model[224] = new ModelRendererTurbo(this, 1, 177, textureX, textureY); // Box 196
		sncb_m6Model[225] = new ModelRendererTurbo(this, 489, 95, textureX, textureY); // Box 217
		sncb_m6Model[226] = new ModelRendererTurbo(this, 382, 8, textureX, textureY); // Box 194
		sncb_m6Model[227] = new ModelRendererTurbo(this, 425, 8, textureX, textureY); // Box 194
		sncb_m6Model[228] = new ModelRendererTurbo(this, 126, 146, textureX, textureY); // Box 193
		sncb_m6Model[229] = new ModelRendererTurbo(this, 196, 146, textureX, textureY); // Box 193
		sncb_m6Model[230] = new ModelRendererTurbo(this, 465, 70, textureX, textureY); // Box 215
		sncb_m6Model[231] = new ModelRendererTurbo(this, 446, 70, textureX, textureY); // Box 215
		sncb_m6Model[232] = new ModelRendererTurbo(this, 404, 71, textureX, textureY); // Box 215
		sncb_m6Model[233] = new ModelRendererTurbo(this, 425, 71, textureX, textureY); // Box 215
		sncb_m6Model[234] = new ModelRendererTurbo(this, 351, 125, textureX, textureY); // Box 215
		sncb_m6Model[235] = new ModelRendererTurbo(this, 356, 125, textureX, textureY); // Box 215
		sncb_m6Model[236] = new ModelRendererTurbo(this, 433, 127, textureX, textureY); // Box 215
		sncb_m6Model[237] = new ModelRendererTurbo(this, 356, 109, textureX, textureY); // Box 215
		sncb_m6Model[238] = new ModelRendererTurbo(this, 351, 109, textureX, textureY); // Box 215
		sncb_m6Model[239] = new ModelRendererTurbo(this, 452, 127, textureX, textureY); // Box 215
		sncb_m6Model[240] = new ModelRendererTurbo(this, 448, 27, textureX, textureY); // Box 215
		sncb_m6Model[241] = new ModelRendererTurbo(this, 308, 69, textureX, textureY); // Box 215
		sncb_m6Model[242] = new ModelRendererTurbo(this, 321, 69, textureX, textureY); // Box 215
		sncb_m6Model[243] = new ModelRendererTurbo(this, 449, 8, textureX, textureY); // Box 215
		sncb_m6Model[244] = new ModelRendererTurbo(this, 410, 6, textureX, textureY); // Box 215
		sncb_m6Model[245] = new ModelRendererTurbo(this, 320, 124, textureX, textureY); // Box 215
		sncb_m6Model[246] = new ModelRendererTurbo(this, 374, 133, textureX, textureY); // Box 215
		sncb_m6Model[247] = new ModelRendererTurbo(this, 374, 140, textureX, textureY); // Box 215
		sncb_m6Model[248] = new ModelRendererTurbo(this, 308, 51, textureX, textureY); // Box 215
		sncb_m6Model[249] = new ModelRendererTurbo(this, 321, 51, textureX, textureY); // Box 215
		sncb_m6Model[250] = new ModelRendererTurbo(this, 15, 160, textureX, textureY); // Box 61
		sncb_m6Model[251] = new ModelRendererTurbo(this, 404, 127, textureX, textureY); // Box 215
		sncb_m6Model[252] = new ModelRendererTurbo(this, 280, 151, textureX, textureY); // Box 215
		sncb_m6Model[253] = new ModelRendererTurbo(this, 413, 152, textureX, textureY); // Box 215
		sncb_m6Model[254] = new ModelRendererTurbo(this, 484, 74, textureX, textureY); // Box 213
		sncb_m6Model[255] = new ModelRendererTurbo(this, 361, 128, textureX, textureY); // Box 216
		sncb_m6Model[256] = new ModelRendererTurbo(this, 408, 100, textureX, textureY); // Box 215
		sncb_m6Model[257] = new ModelRendererTurbo(this, 361, 115, textureX, textureY); // Box 216
		sncb_m6Model[258] = new ModelRendererTurbo(this, 232, 179, textureX, textureY); // Box 170
		sncb_m6Model[259] = new ModelRendererTurbo(this, 234, 173, textureX, textureY); // Box 171
		sncb_m6Model[260] = new ModelRendererTurbo(this, 210, 178, textureX, textureY); // Box 174
		sncb_m6Model[261] = new ModelRendererTurbo(this, 221, 187, textureX, textureY); // Box 175
		sncb_m6Model[262] = new ModelRendererTurbo(this, 219, 174, textureX, textureY); // Box 176
		sncb_m6Model[263] = new ModelRendererTurbo(this, 232, 179, textureX, textureY); // Box 163
		sncb_m6Model[264] = new ModelRendererTurbo(this, 234, 167, textureX, textureY); // Box 164
		sncb_m6Model[265] = new ModelRendererTurbo(this, 221, 178, textureX, textureY); // Box 167
		sncb_m6Model[266] = new ModelRendererTurbo(this, 210, 187, textureX, textureY); // Box 168
		sncb_m6Model[267] = new ModelRendererTurbo(this, 219, 174, textureX, textureY); // Box 169
		sncb_m6Model[268] = new ModelRendererTurbo(this, 232, 179, textureX, textureY); // Box 170
		sncb_m6Model[269] = new ModelRendererTurbo(this, 234, 173, textureX, textureY); // Box 171
		sncb_m6Model[270] = new ModelRendererTurbo(this, 210, 178, textureX, textureY); // Box 174
		sncb_m6Model[271] = new ModelRendererTurbo(this, 221, 187, textureX, textureY); // Box 175
		sncb_m6Model[272] = new ModelRendererTurbo(this, 219, 174, textureX, textureY); // Box 176
		sncb_m6Model[273] = new ModelRendererTurbo(this, 232, 179, textureX, textureY); // Box 163
		sncb_m6Model[274] = new ModelRendererTurbo(this, 234, 167, textureX, textureY); // Box 164
		sncb_m6Model[275] = new ModelRendererTurbo(this, 221, 178, textureX, textureY); // Box 167
		sncb_m6Model[276] = new ModelRendererTurbo(this, 210, 187, textureX, textureY); // Box 168
		sncb_m6Model[277] = new ModelRendererTurbo(this, 219, 174, textureX, textureY); // Box 169
		sncb_m6Model[278] = new ModelRendererTurbo(this, 232, 179, textureX, textureY); // Box 170
		sncb_m6Model[279] = new ModelRendererTurbo(this, 234, 173, textureX, textureY); // Box 171
		sncb_m6Model[280] = new ModelRendererTurbo(this, 210, 178, textureX, textureY); // Box 174
		sncb_m6Model[281] = new ModelRendererTurbo(this, 221, 187, textureX, textureY); // Box 175
		sncb_m6Model[282] = new ModelRendererTurbo(this, 219, 174, textureX, textureY); // Box 176
		sncb_m6Model[283] = new ModelRendererTurbo(this, 232, 179, textureX, textureY); // Box 163
		sncb_m6Model[284] = new ModelRendererTurbo(this, 234, 167, textureX, textureY); // Box 164
		sncb_m6Model[285] = new ModelRendererTurbo(this, 221, 178, textureX, textureY); // Box 167
		sncb_m6Model[286] = new ModelRendererTurbo(this, 210, 187, textureX, textureY); // Box 168
		sncb_m6Model[287] = new ModelRendererTurbo(this, 219, 174, textureX, textureY); // Box 169
		sncb_m6Model[288] = new ModelRendererTurbo(this, 232, 179, textureX, textureY); // Box 170
		sncb_m6Model[289] = new ModelRendererTurbo(this, 234, 173, textureX, textureY); // Box 171
		sncb_m6Model[290] = new ModelRendererTurbo(this, 210, 178, textureX, textureY); // Box 174
		sncb_m6Model[291] = new ModelRendererTurbo(this, 221, 187, textureX, textureY); // Box 175
		sncb_m6Model[292] = new ModelRendererTurbo(this, 219, 174, textureX, textureY); // Box 176
		sncb_m6Model[293] = new ModelRendererTurbo(this, 232, 179, textureX, textureY); // Box 163
		sncb_m6Model[294] = new ModelRendererTurbo(this, 234, 167, textureX, textureY); // Box 164
		sncb_m6Model[295] = new ModelRendererTurbo(this, 221, 178, textureX, textureY); // Box 167
		sncb_m6Model[296] = new ModelRendererTurbo(this, 210, 187, textureX, textureY); // Box 168
		sncb_m6Model[297] = new ModelRendererTurbo(this, 219, 174, textureX, textureY); // Box 169
		sncb_m6Model[298] = new ModelRendererTurbo(this, 232, 179, textureX, textureY); // Box 170
		sncb_m6Model[299] = new ModelRendererTurbo(this, 234, 173, textureX, textureY); // Box 171
		sncb_m6Model[300] = new ModelRendererTurbo(this, 210, 178, textureX, textureY); // Box 174
		sncb_m6Model[301] = new ModelRendererTurbo(this, 221, 187, textureX, textureY); // Box 175
		sncb_m6Model[302] = new ModelRendererTurbo(this, 219, 174, textureX, textureY); // Box 176
		sncb_m6Model[303] = new ModelRendererTurbo(this, 232, 179, textureX, textureY); // Box 163
		sncb_m6Model[304] = new ModelRendererTurbo(this, 234, 167, textureX, textureY); // Box 164
		sncb_m6Model[305] = new ModelRendererTurbo(this, 221, 178, textureX, textureY); // Box 167
		sncb_m6Model[306] = new ModelRendererTurbo(this, 210, 187, textureX, textureY); // Box 168
		sncb_m6Model[307] = new ModelRendererTurbo(this, 219, 174, textureX, textureY); // Box 169
		sncb_m6Model[308] = new ModelRendererTurbo(this, 232, 179, textureX, textureY); // Box 170
		sncb_m6Model[309] = new ModelRendererTurbo(this, 234, 173, textureX, textureY); // Box 171
		sncb_m6Model[310] = new ModelRendererTurbo(this, 210, 178, textureX, textureY); // Box 174
		sncb_m6Model[311] = new ModelRendererTurbo(this, 221, 187, textureX, textureY); // Box 175
		sncb_m6Model[312] = new ModelRendererTurbo(this, 219, 174, textureX, textureY); // Box 176
		sncb_m6Model[313] = new ModelRendererTurbo(this, 232, 179, textureX, textureY); // Box 163
		sncb_m6Model[314] = new ModelRendererTurbo(this, 234, 167, textureX, textureY); // Box 164
		sncb_m6Model[315] = new ModelRendererTurbo(this, 221, 178, textureX, textureY); // Box 167
		sncb_m6Model[316] = new ModelRendererTurbo(this, 210, 187, textureX, textureY); // Box 168
		sncb_m6Model[317] = new ModelRendererTurbo(this, 219, 174, textureX, textureY); // Box 169
		sncb_m6Model[318] = new ModelRendererTurbo(this, 232, 179, textureX, textureY); // Box 170
		sncb_m6Model[319] = new ModelRendererTurbo(this, 234, 173, textureX, textureY); // Box 171
		sncb_m6Model[320] = new ModelRendererTurbo(this, 210, 178, textureX, textureY); // Box 174
		sncb_m6Model[321] = new ModelRendererTurbo(this, 221, 187, textureX, textureY); // Box 175
		sncb_m6Model[322] = new ModelRendererTurbo(this, 219, 174, textureX, textureY); // Box 176
		sncb_m6Model[323] = new ModelRendererTurbo(this, 232, 179, textureX, textureY); // Box 163
		sncb_m6Model[324] = new ModelRendererTurbo(this, 234, 167, textureX, textureY); // Box 164
		sncb_m6Model[325] = new ModelRendererTurbo(this, 221, 178, textureX, textureY); // Box 167
		sncb_m6Model[326] = new ModelRendererTurbo(this, 210, 187, textureX, textureY); // Box 168
		sncb_m6Model[327] = new ModelRendererTurbo(this, 219, 174, textureX, textureY); // Box 169
		sncb_m6Model[328] = new ModelRendererTurbo(this, 232, 179, textureX, textureY); // Box 170
		sncb_m6Model[329] = new ModelRendererTurbo(this, 234, 173, textureX, textureY); // Box 171
		sncb_m6Model[330] = new ModelRendererTurbo(this, 210, 178, textureX, textureY); // Box 174
		sncb_m6Model[331] = new ModelRendererTurbo(this, 221, 187, textureX, textureY); // Box 175
		sncb_m6Model[332] = new ModelRendererTurbo(this, 219, 174, textureX, textureY); // Box 176
		sncb_m6Model[333] = new ModelRendererTurbo(this, 232, 179, textureX, textureY); // Box 163
		sncb_m6Model[334] = new ModelRendererTurbo(this, 234, 167, textureX, textureY); // Box 164
		sncb_m6Model[335] = new ModelRendererTurbo(this, 221, 178, textureX, textureY); // Box 167
		sncb_m6Model[336] = new ModelRendererTurbo(this, 210, 187, textureX, textureY); // Box 168
		sncb_m6Model[337] = new ModelRendererTurbo(this, 219, 174, textureX, textureY); // Box 169
		sncb_m6Model[338] = new ModelRendererTurbo(this, 405, 52, textureX, textureY); // Box 175
		sncb_m6Model[339] = new ModelRendererTurbo(this, 66, 160, textureX, textureY); // Box 168
		sncb_m6Model[340] = new ModelRendererTurbo(this, 95, 160, textureX, textureY); // Box 168
		sncb_m6Model[341] = new ModelRendererTurbo(this, 232, 179, textureX, textureY); // Box 170
		sncb_m6Model[342] = new ModelRendererTurbo(this, 234, 173, textureX, textureY); // Box 171
		sncb_m6Model[343] = new ModelRendererTurbo(this, 210, 178, textureX, textureY); // Box 174
		sncb_m6Model[344] = new ModelRendererTurbo(this, 221, 187, textureX, textureY); // Box 175
		sncb_m6Model[345] = new ModelRendererTurbo(this, 219, 174, textureX, textureY); // Box 176
		sncb_m6Model[346] = new ModelRendererTurbo(this, 232, 179, textureX, textureY); // Box 163
		sncb_m6Model[347] = new ModelRendererTurbo(this, 234, 167, textureX, textureY); // Box 164
		sncb_m6Model[348] = new ModelRendererTurbo(this, 210, 173, textureX, textureY); // Box 166
		sncb_m6Model[349] = new ModelRendererTurbo(this, 221, 178, textureX, textureY); // Box 167
		sncb_m6Model[350] = new ModelRendererTurbo(this, 210, 187, textureX, textureY); // Box 168
		sncb_m6Model[351] = new ModelRendererTurbo(this, 219, 174, textureX, textureY); // Box 169
		sncb_m6Model[352] = new ModelRendererTurbo(this, 232, 179, textureX, textureY); // Box 170
		sncb_m6Model[353] = new ModelRendererTurbo(this, 232, 179, textureX, textureY); // Box 163
		sncb_m6Model[354] = new ModelRendererTurbo(this, 210, 173, textureX, textureY); // Box 166
		sncb_m6Model[355] = new ModelRendererTurbo(this, 232, 179, textureX, textureY); // Box 170
		sncb_m6Model[356] = new ModelRendererTurbo(this, 234, 173, textureX, textureY); // Box 171
		sncb_m6Model[357] = new ModelRendererTurbo(this, 210, 178, textureX, textureY); // Box 174
		sncb_m6Model[358] = new ModelRendererTurbo(this, 221, 187, textureX, textureY); // Box 175
		sncb_m6Model[359] = new ModelRendererTurbo(this, 219, 174, textureX, textureY); // Box 176
		sncb_m6Model[360] = new ModelRendererTurbo(this, 232, 179, textureX, textureY); // Box 163
		sncb_m6Model[361] = new ModelRendererTurbo(this, 234, 167, textureX, textureY); // Box 164
		sncb_m6Model[362] = new ModelRendererTurbo(this, 210, 173, textureX, textureY); // Box 166
		sncb_m6Model[363] = new ModelRendererTurbo(this, 221, 178, textureX, textureY); // Box 167
		sncb_m6Model[364] = new ModelRendererTurbo(this, 210, 187, textureX, textureY); // Box 168
		sncb_m6Model[365] = new ModelRendererTurbo(this, 219, 174, textureX, textureY); // Box 169
		sncb_m6Model[366] = new ModelRendererTurbo(this, 232, 179, textureX, textureY); // Box 170
		sncb_m6Model[367] = new ModelRendererTurbo(this, 232, 179, textureX, textureY); // Box 163
		sncb_m6Model[368] = new ModelRendererTurbo(this, 210, 173, textureX, textureY); // Box 166
		sncb_m6Model[369] = new ModelRendererTurbo(this, 232, 179, textureX, textureY); // Box 170
		sncb_m6Model[370] = new ModelRendererTurbo(this, 234, 173, textureX, textureY); // Box 171
		sncb_m6Model[371] = new ModelRendererTurbo(this, 210, 178, textureX, textureY); // Box 174
		sncb_m6Model[372] = new ModelRendererTurbo(this, 221, 187, textureX, textureY); // Box 175
		sncb_m6Model[373] = new ModelRendererTurbo(this, 219, 174, textureX, textureY); // Box 176
		sncb_m6Model[374] = new ModelRendererTurbo(this, 232, 179, textureX, textureY); // Box 163
		sncb_m6Model[375] = new ModelRendererTurbo(this, 234, 167, textureX, textureY); // Box 164
		sncb_m6Model[376] = new ModelRendererTurbo(this, 210, 173, textureX, textureY); // Box 166
		sncb_m6Model[377] = new ModelRendererTurbo(this, 221, 178, textureX, textureY); // Box 167
		sncb_m6Model[378] = new ModelRendererTurbo(this, 210, 187, textureX, textureY); // Box 168
		sncb_m6Model[379] = new ModelRendererTurbo(this, 219, 174, textureX, textureY); // Box 169
		sncb_m6Model[380] = new ModelRendererTurbo(this, 232, 179, textureX, textureY); // Box 170
		sncb_m6Model[381] = new ModelRendererTurbo(this, 232, 179, textureX, textureY); // Box 163
		sncb_m6Model[382] = new ModelRendererTurbo(this, 210, 173, textureX, textureY); // Box 166
		sncb_m6Model[383] = new ModelRendererTurbo(this, 232, 179, textureX, textureY); // Box 163
		sncb_m6Model[384] = new ModelRendererTurbo(this, 234, 167, textureX, textureY); // Box 164
		sncb_m6Model[385] = new ModelRendererTurbo(this, 221, 178, textureX, textureY); // Box 167
		sncb_m6Model[386] = new ModelRendererTurbo(this, 210, 187, textureX, textureY); // Box 168
		sncb_m6Model[387] = new ModelRendererTurbo(this, 219, 174, textureX, textureY); // Box 169
		sncb_m6Model[388] = new ModelRendererTurbo(this, 232, 179, textureX, textureY); // Box 163
		sncb_m6Model[389] = new ModelRendererTurbo(this, 210, 173, textureX, textureY); // Box 166
		sncb_m6Model[390] = new ModelRendererTurbo(this, 209, 146, textureX, textureY); // Box 193
		sncb_m6Model[391] = new ModelRendererTurbo(this, 248, 147, textureX, textureY); // Box 193
		sncb_m6Model[392] = new ModelRendererTurbo(this, 257, 147, textureX, textureY); // Box 193
		sncb_m6Model[393] = new ModelRendererTurbo(this, 296, 138, textureX, textureY); // Box 193
		sncb_m6Model[394] = new ModelRendererTurbo(this, 289, 138, textureX, textureY); // Box 193
		sncb_m6Model[395] = new ModelRendererTurbo(this, 144, 146, textureX, textureY); // Box 193
		sncb_m6Model[396] = new ModelRendererTurbo(this, 157, 146, textureX, textureY); // Box 193
		sncb_m6Model[397] = new ModelRendererTurbo(this, 114, 166, textureX, textureY); // Box 193
		sncb_m6Model[398] = new ModelRendererTurbo(this, 222, 154, textureX, textureY); // Box 193
		sncb_m6Model[399] = new ModelRendererTurbo(this, 235, 154, textureX, textureY); // Box 193
		sncb_m6Model[400] = new ModelRendererTurbo(this, 266, 153, textureX, textureY); // Box 193
		sncb_m6Model[401] = new ModelRendererTurbo(this, 275, 153, textureX, textureY); // Box 193
		sncb_m6Model[402] = new ModelRendererTurbo(this, 310, 144, textureX, textureY); // Box 193
		sncb_m6Model[403] = new ModelRendererTurbo(this, 303, 144, textureX, textureY); // Box 193
		sncb_m6Model[404] = new ModelRendererTurbo(this, 170, 153, textureX, textureY); // Box 193
		sncb_m6Model[405] = new ModelRendererTurbo(this, 183, 153, textureX, textureY); // Box 193
		sncb_m6Model[406] = new ModelRendererTurbo(this, 322, 160, textureX, textureY); // Box 31
		sncb_m6Model[407] = new ModelRendererTurbo(this, 303, 156, textureX, textureY); // Box 31
		sncb_m6Model[408] = new ModelRendererTurbo(this, 329, 160, textureX, textureY); // Box 31
		sncb_m6Model[409] = new ModelRendererTurbo(this, 308, 150, textureX, textureY); // Box 31
		sncb_m6Model[410] = new ModelRendererTurbo(this, 322, 153, textureX, textureY); // Box 31
		sncb_m6Model[411] = new ModelRendererTurbo(this, 303, 150, textureX, textureY); // Box 31
		sncb_m6Model[412] = new ModelRendererTurbo(this, 329, 153, textureX, textureY); // Box 31
		sncb_m6Model[413] = new ModelRendererTurbo(this, 164, 135, textureX, textureY); // Box 10
		sncb_m6Model[414] = new ModelRendererTurbo(this, 1, 135, textureX, textureY); // Box 10
		sncb_m6Model[415] = new ModelRendererTurbo(this, 189, 180, textureX, textureY); // Box 10
		sncb_m6Model[416] = new ModelRendererTurbo(this, 150, 180, textureX, textureY); // Box 10
		sncb_m6Model[417] = new ModelRendererTurbo(this, 196, 162, textureX, textureY); // Box 10
		sncb_m6Model[418] = new ModelRendererTurbo(this, 201, 162, textureX, textureY); // Box 10
		sncb_m6Model[419] = new ModelRendererTurbo(this, 211, 162, textureX, textureY); // Box 10
		sncb_m6Model[420] = new ModelRendererTurbo(this, 206, 162, textureX, textureY); // Box 10
		sncb_m6Model[421] = new ModelRendererTurbo(this, 448, 110, textureX, textureY); // Box 215
		sncb_m6Model[422] = new ModelRendererTurbo(this, 459, 110, textureX, textureY); // Box 215
		sncb_m6Model[423] = new ModelRendererTurbo(this, 452, 153, textureX, textureY); // Box 193
		sncb_m6Model[424] = new ModelRendererTurbo(this, 196, 154, textureX, textureY); // Box 193
		sncb_m6Model[425] = new ModelRendererTurbo(this, 209, 154, textureX, textureY); // Box 193
		sncb_m6Model[426] = new ModelRendererTurbo(this, 248, 153, textureX, textureY); // Box 193
		sncb_m6Model[427] = new ModelRendererTurbo(this, 257, 153, textureX, textureY); // Box 193
		sncb_m6Model[428] = new ModelRendererTurbo(this, 296, 144, textureX, textureY); // Box 193
		sncb_m6Model[429] = new ModelRendererTurbo(this, 289, 144, textureX, textureY); // Box 193
		sncb_m6Model[430] = new ModelRendererTurbo(this, 144, 153, textureX, textureY); // Box 193
		sncb_m6Model[431] = new ModelRendererTurbo(this, 157, 153, textureX, textureY); // Box 193
		sncb_m6Model[432] = new ModelRendererTurbo(this, 95, 178, textureX, textureY); // Box 193
		sncb_m6Model[433] = new ModelRendererTurbo(this, 222, 145, textureX, textureY); // Box 193
		sncb_m6Model[434] = new ModelRendererTurbo(this, 235, 145, textureX, textureY); // Box 193
		sncb_m6Model[435] = new ModelRendererTurbo(this, 266, 147, textureX, textureY); // Box 193
		sncb_m6Model[436] = new ModelRendererTurbo(this, 275, 147, textureX, textureY); // Box 193
		sncb_m6Model[437] = new ModelRendererTurbo(this, 310, 138, textureX, textureY); // Box 193
		sncb_m6Model[438] = new ModelRendererTurbo(this, 303, 138, textureX, textureY); // Box 193
		sncb_m6Model[439] = new ModelRendererTurbo(this, 170, 146, textureX, textureY); // Box 193
		sncb_m6Model[440] = new ModelRendererTurbo(this, 183, 146, textureX, textureY); // Box 193
		sncb_m6Model[441] = new ModelRendererTurbo(this, 369, 120, textureX, textureY); // Box 216
		sncb_m6Model[442] = new ModelRendererTurbo(this, 33, 160, textureX, textureY); // Box 73
		sncb_m6Model[443] = new ModelRendererTurbo(this, 374, 119, textureX, textureY); // Box 215
		sncb_m6Model[444] = new ModelRendererTurbo(this, 374, 126, textureX, textureY); // Box 215
		sncb_m6Model[445] = new ModelRendererTurbo(this, 232, 179, textureX, textureY); // Box 163
		sncb_m6Model[446] = new ModelRendererTurbo(this, 234, 167, textureX, textureY); // Box 164
		sncb_m6Model[447] = new ModelRendererTurbo(this, 210, 173, textureX, textureY); // Box 166
		sncb_m6Model[448] = new ModelRendererTurbo(this, 221, 178, textureX, textureY); // Box 167
		sncb_m6Model[449] = new ModelRendererTurbo(this, 210, 187, textureX, textureY); // Box 168
		sncb_m6Model[450] = new ModelRendererTurbo(this, 219, 174, textureX, textureY); // Box 169
		sncb_m6Model[451] = new ModelRendererTurbo(this, 232, 179, textureX, textureY); // Box 163
		sncb_m6Model[452] = new ModelRendererTurbo(this, 234, 167, textureX, textureY); // Box 164
		sncb_m6Model[453] = new ModelRendererTurbo(this, 210, 173, textureX, textureY); // Box 166
		sncb_m6Model[454] = new ModelRendererTurbo(this, 221, 178, textureX, textureY); // Box 167
		sncb_m6Model[455] = new ModelRendererTurbo(this, 210, 187, textureX, textureY); // Box 168
		sncb_m6Model[456] = new ModelRendererTurbo(this, 219, 174, textureX, textureY); // Box 169
		sncb_m6Model[457] = new ModelRendererTurbo(this, 489, 112, textureX, textureY); // Box 215
		sncb_m6Model[458] = new ModelRendererTurbo(this, 472, 112, textureX, textureY); // Box 215
		sncb_m6Model[459] = new ModelRendererTurbo(this, 133, 178, textureX, textureY); // Box 215
		sncb_m6Model[460] = new ModelRendererTurbo(this, 284, 24, textureX, textureY); // Box 213
		sncb_m6Model[461] = new ModelRendererTurbo(this, 371, 50, textureX, textureY); // Box 213
		sncb_m6Model[462] = new ModelRendererTurbo(this, 284, 1, textureX, textureY); // Box 213
		sncb_m6Model[463] = new ModelRendererTurbo(this, 352, 50, textureX, textureY); // Box 213
		sncb_m6Model[464] = new ModelRendererTurbo(this, 293, 50, textureX, textureY); // Box 215
		sncb_m6Model[465] = new ModelRendererTurbo(this, 293, 68, textureX, textureY); // Box 215
		sncb_m6Model[466] = new ModelRendererTurbo(this, 459, 93, textureX, textureY); // Box 215
		sncb_m6Model[467] = new ModelRendererTurbo(this, 448, 93, textureX, textureY); // Box 215
		sncb_m6Model[468] = new ModelRendererTurbo(this, 437, 93, textureX, textureY); // Box 215
		sncb_m6Model[469] = new ModelRendererTurbo(this, 368, 71, textureX, textureY); // Box 213
		sncb_m6Model[470] = new ModelRendererTurbo(this, 284, 9, textureX, textureY); // Box 213
		sncb_m6Model[471] = new ModelRendererTurbo(this, 334, 71, textureX, textureY); // Box 221
		sncb_m6Model[472] = new ModelRendererTurbo(this, 284, 32, textureX, textureY); // Box 213
		sncb_m6Model[473] = new ModelRendererTurbo(this, 385, 71, textureX, textureY); // Box 213
		sncb_m6Model[474] = new ModelRendererTurbo(this, 284, 40, textureX, textureY); // Box 221
		sncb_m6Model[475] = new ModelRendererTurbo(this, 351, 71, textureX, textureY); // Box 221
		sncb_m6Model[476] = new ModelRendererTurbo(this, 187, 160, textureX, textureY); // Box 215
		sncb_m6Model[477] = new ModelRendererTurbo(this, 187, 160, textureX, textureY); // Box 215
		sncb_m6Model[478] = new ModelRendererTurbo(this, 165, 161, textureX, textureY); // Box 215
		sncb_m6Model[479] = new ModelRendererTurbo(this, 165, 161, textureX, textureY); // Box 215
		sncb_m6Model[480] = new ModelRendererTurbo(this, 187, 160, textureX, textureY); // Box 215
		sncb_m6Model[481] = new ModelRendererTurbo(this, 187, 160, textureX, textureY); // Box 215
		sncb_m6Model[482] = new ModelRendererTurbo(this, 165, 161, textureX, textureY); // Box 215
		sncb_m6Model[483] = new ModelRendererTurbo(this, 165, 161, textureX, textureY); // Box 215
		sncb_m6Model[484] = new ModelRendererTurbo(this, 174, 160, textureX, textureY); // Box 215
		sncb_m6Model[485] = new ModelRendererTurbo(this, 174, 165, textureX, textureY); // Box 215
		sncb_m6Model[486] = new ModelRendererTurbo(this, 161, 160, textureX, textureY); // Box 215
		sncb_m6Model[487] = new ModelRendererTurbo(this, 161, 160, textureX, textureY); // Box 215
		sncb_m6Model[488] = new ModelRendererTurbo(this, 219, 162, textureX, textureY); // Box 84
		sncb_m6Model[489] = new ModelRendererTurbo(this, 226, 174, textureX, textureY); // Box 81
		sncb_m6Model[490] = new ModelRendererTurbo(this, 219, 162, textureX, textureY); // Box 84
		sncb_m6Model[491] = new ModelRendererTurbo(this, 226, 174, textureX, textureY); // Box 81
		sncb_m6Model[492] = new ModelRendererTurbo(this, 219, 162, textureX, textureY); // Box 84
		sncb_m6Model[493] = new ModelRendererTurbo(this, 226, 174, textureX, textureY); // Box 81
		sncb_m6Model[494] = new ModelRendererTurbo(this, 219, 162, textureX, textureY); // Box 84
		sncb_m6Model[495] = new ModelRendererTurbo(this, 226, 174, textureX, textureY); // Box 81
		sncb_m6Model[496] = new ModelRendererTurbo(this, 219, 162, textureX, textureY); // Box 84
		sncb_m6Model[497] = new ModelRendererTurbo(this, 226, 174, textureX, textureY); // Box 81
		sncb_m6Model[498] = new ModelRendererTurbo(this, 219, 162, textureX, textureY); // Box 84
		sncb_m6Model[499] = new ModelRendererTurbo(this, 226, 174, textureX, textureY); // Box 81
		sncb_m6Model[500] = new ModelRendererTurbo(this, 219, 162, textureX, textureY); // Box 84
		sncb_m6Model[501] = new ModelRendererTurbo(this, 226, 174, textureX, textureY); // Box 81
		sncb_m6Model[502] = new ModelRendererTurbo(this, 219, 162, textureX, textureY); // Box 84
		sncb_m6Model[503] = new ModelRendererTurbo(this, 226, 174, textureX, textureY); // Box 81
		sncb_m6Model[504] = new ModelRendererTurbo(this, 219, 162, textureX, textureY); // Box 84
		sncb_m6Model[505] = new ModelRendererTurbo(this, 226, 174, textureX, textureY); // Box 81
		sncb_m6Model[506] = new ModelRendererTurbo(this, 187, 163, textureX, textureY); // Box 215
		sncb_m6Model[507] = new ModelRendererTurbo(this, 187, 163, textureX, textureY); // Box 215
		sncb_m6Model[508] = new ModelRendererTurbo(this, 187, 163, textureX, textureY); // Box 215
		sncb_m6Model[509] = new ModelRendererTurbo(this, 187, 163, textureX, textureY); // Box 215
		sncb_m6Model[510] = new ModelRendererTurbo(this, 296, 172, textureX, textureY); // doorFrontLeft1
		sncb_m6Model[511] = new ModelRendererTurbo(this, 281, 172, textureX, textureY); // doorFrontLeft2
		sncb_m6Model[512] = new ModelRendererTurbo(this, 296, 172, textureX, textureY); // doorBackLeft1
		sncb_m6Model[513] = new ModelRendererTurbo(this, 281, 172, textureX, textureY); // doorBackLeft2
		sncb_m6Model[514] = new ModelRendererTurbo(this, 251, 172, textureX, textureY); // doorBackRight1
		sncb_m6Model[515] = new ModelRendererTurbo(this, 266, 172, textureX, textureY); // doorBackRight2
		sncb_m6Model[516] = new ModelRendererTurbo(this, 251, 172, textureX, textureY); // doorFrontRight1
		sncb_m6Model[517] = new ModelRendererTurbo(this, 266, 172, textureX, textureY); // doorFrontRight2
		sncb_m6Model[518] = new ModelRendererTurbo(this, 232, 179, textureX, textureY); // Box 170
		sncb_m6Model[519] = new ModelRendererTurbo(this, 234, 173, textureX, textureY); // Box 171
		sncb_m6Model[520] = new ModelRendererTurbo(this, 210, 178, textureX, textureY); // Box 174
		sncb_m6Model[521] = new ModelRendererTurbo(this, 221, 187, textureX, textureY); // Box 175
		sncb_m6Model[522] = new ModelRendererTurbo(this, 219, 174, textureX, textureY); // Box 176
		sncb_m6Model[523] = new ModelRendererTurbo(this, 210, 173, textureX, textureY); // Box 166
		sncb_m6Model[524] = new ModelRendererTurbo(this, 232, 179, textureX, textureY); // Box 170
		sncb_m6Model[525] = new ModelRendererTurbo(this, 52, 201, textureX, textureY); // Box 31
		sncb_m6Model[526] = new ModelRendererTurbo(this, 3, 201, textureX, textureY); // Box 31
		sncb_m6Model[527] = new ModelRendererTurbo(this, 204, 175, textureX, textureY, "lamp"); // lamp
		sncb_m6Model[528] = new ModelRendererTurbo(this, 204, 175, textureX, textureY, "lamp"); // lamp
		sncb_m6Model[529] = new ModelRendererTurbo(this, 204, 175, textureX, textureY, "lamp"); // lamp
		sncb_m6Model[530] = new ModelRendererTurbo(this, 204, 175, textureX, textureY, "lamp"); // lamp
		sncb_m6Model[531] = new ModelRendererTurbo(this, 204, 175, textureX, textureY, "lamp"); // lamp
		sncb_m6Model[532] = new ModelRendererTurbo(this, 204, 175, textureX, textureY, "lamp"); // lamp
		sncb_m6Model[533] = new ModelRendererTurbo(this, 204, 175, textureX, textureY, "lamp"); // lamp
		sncb_m6Model[534] = new ModelRendererTurbo(this, 204, 175, textureX, textureY, "lamp"); // lamp
		sncb_m6Model[535] = new ModelRendererTurbo(this, 204, 175, textureX, textureY, "lamp"); // lamp
		sncb_m6Model[536] = new ModelRendererTurbo(this, 204, 175, textureX, textureY, "lamp"); // lamp
		sncb_m6Model[537] = new ModelRendererTurbo(this, 204, 175, textureX, textureY, "lamp"); // lamp
		sncb_m6Model[538] = new ModelRendererTurbo(this, 204, 175, textureX, textureY, "lamp"); // lamp
		sncb_m6Model[539] = new ModelRendererTurbo(this, 204, 175, textureX, textureY, "lamp"); // lamp
		sncb_m6Model[540] = new ModelRendererTurbo(this, 204, 175, textureX, textureY, "lamp"); // lamp
		sncb_m6Model[541] = new ModelRendererTurbo(this, 204, 175, textureX, textureY, "lamp"); // lamp
		sncb_m6Model[542] = new ModelRendererTurbo(this, 204, 175, textureX, textureY, "lamp"); // lamp

		sncb_m6Model[0].addShapeBox(0F, 0F, 0F, 82, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 10
		sncb_m6Model[0].setRotationPoint(-41F, 7F, 9F);

		sncb_m6Model[1].addBox(0F, 0F, 0F, 1, 1, 18, 0F); // Box 11
		sncb_m6Model[1].setRotationPoint(40F, 7F, -9F);

		sncb_m6Model[2].addBox(0F, 0F, 0F, 1, 1, 18, 0F); // Box 12
		sncb_m6Model[2].setRotationPoint(-41F, 7F, -9F);

		sncb_m6Model[3].addBox(0F, 0F, 0F, 82, 1, 1, 0F); // Box 13
		sncb_m6Model[3].setRotationPoint(-41F, 6F, 10F);

		sncb_m6Model[4].addBox(0F, 0F, 0F, 82, 1, 1, 0F); // Box 14
		sncb_m6Model[4].setRotationPoint(-41F, 6F, -11F);

		sncb_m6Model[5].addBox(0F, 0F, 0F, 26, 1, 22, 0F); // Box 15
		sncb_m6Model[5].setRotationPoint(-69F, 1F, -11F);

		sncb_m6Model[6].addBox(0F, 0F, 0F, 1, 1, 20, 0F); // Box 19
		sncb_m6Model[6].setRotationPoint(-41F, 6F, -10F);

		sncb_m6Model[7].addShapeBox(0F, 0F, 0F, 3, 4, 20, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 20
		sncb_m6Model[7].setRotationPoint(-43F, 2F, -10F);

		sncb_m6Model[8].addBox(0F, 0F, 0F, 1, 1, 20, 0F); // Box 27
		sncb_m6Model[8].setRotationPoint(40F, 6F, -10F);

		sncb_m6Model[9].addShapeBox(0F, 0F, 0F, 3, 4, 20, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 28
		sncb_m6Model[9].setRotationPoint(40F, 2F, -10F);

		sncb_m6Model[10].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 31
		sncb_m6Model[10].setRotationPoint(40F, 2F, -11F);

		sncb_m6Model[11].addBox(0F, 0F, 0F, 26, 1, 22, 0F); // Box 32
		sncb_m6Model[11].setRotationPoint(43F, 1F, -11F);

		sncb_m6Model[12].addShapeBox(0F, 0F, 0F, 82, 1, 1, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 9
		sncb_m6Model[12].setRotationPoint(-41F, 7F, -10F);

		sncb_m6Model[13].addBox(0F, 0F, 0F, 140, 18, 1, 0F); // Box 33
		sncb_m6Model[13].setRotationPoint(-70F, -17F, -11F);

		sncb_m6Model[14].addBox(0F, 0F, 0F, 86, 1, 1, 0F); // Box 34
		sncb_m6Model[14].setRotationPoint(-43F, 1F, -11F);

		sncb_m6Model[15].addBox(0F, 0F, 0F, 80, 4, 1, 0F); // Box 35
		sncb_m6Model[15].setRotationPoint(-40F, 2F, -11F);

		sncb_m6Model[16].addBox(0F, 0F, 0F, 140, 18, 1, 0F); // Box 36
		sncb_m6Model[16].setRotationPoint(-70F, -17F, 10F);

		sncb_m6Model[17].addBox(0F, 0F, 0F, 80, 4, 1, 0F); // Box 37
		sncb_m6Model[17].setRotationPoint(-40F, 2F, 10F);

		sncb_m6Model[18].addBox(0F, 0F, 0F, 86, 1, 1, 0F); // Box 38
		sncb_m6Model[18].setRotationPoint(-43F, 1F, 10F);

		sncb_m6Model[19].addShapeBox(0F, 0F, 0F, 140, 3, 1, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		sncb_m6Model[19].setRotationPoint(-70F, -20F, 10F);

		sncb_m6Model[20].addShapeBox(0F, 0F, 0F, 140, 3, 1, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		sncb_m6Model[20].setRotationPoint(-70F, -20F, -11F);

		sncb_m6Model[21].addShapeBox(0F, 0F, 0F, 140, 2, 3, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 42
		sncb_m6Model[21].setRotationPoint(-70F, -23F, -8F);

		sncb_m6Model[22].addShapeBox(0F, 0F, 0F, 140, 1, 1, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 44
		sncb_m6Model[22].setRotationPoint(-70F, -21F, -9F);

		sncb_m6Model[23].addShapeBox(0F, 0F, 0F, 140, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 45
		sncb_m6Model[23].setRotationPoint(-70F, -21F, 8F);

		sncb_m6Model[24].addShapeBox(0F, 0F, 0F, 140, 2, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 46
		sncb_m6Model[24].setRotationPoint(-70F, -23F, 5F);

		sncb_m6Model[25].addShapeBox(0F, 0F, 0F, 140, 2, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 47
		sncb_m6Model[25].setRotationPoint(-70F, -23F, -5F);

		sncb_m6Model[26].addShapeBox(0F, 0F, 0F, 140, 2, 5, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 48
		sncb_m6Model[26].setRotationPoint(-70F, -23F, 0F);

		sncb_m6Model[27].addBox(0F, 0F, 0F, 68, 1, 9, 0F); // Box 50
		sncb_m6Model[27].setRotationPoint(-40F, 7F, 0F);

		sncb_m6Model[28].addBox(0F, 0F, 0F, 1, 1, 8, 0F); // Box 51
		sncb_m6Model[28].setRotationPoint(-43F, 1F, -10F);

		sncb_m6Model[29].addShapeBox(0F, 0F, 0F, 7, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F); // Box 59
		sncb_m6Model[29].setRotationPoint(-35F, 7F, -9F);

		sncb_m6Model[30].addShapeBox(0F, 0F, 0F, 6, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 61
		sncb_m6Model[30].setRotationPoint(-35F, 7F, -3F);

		sncb_m6Model[31].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Box 63
		sncb_m6Model[31].setRotationPoint(42F, 1F, 3F);

		sncb_m6Model[32].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Box 64
		sncb_m6Model[32].setRotationPoint(41F, 2F, 3F);

		sncb_m6Model[33].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Box 65
		sncb_m6Model[33].setRotationPoint(40F, 3F, 3F);

		sncb_m6Model[34].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Box 66
		sncb_m6Model[34].setRotationPoint(39F, 4F, 3F);

		sncb_m6Model[35].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Box 67
		sncb_m6Model[35].setRotationPoint(38F, 5F, 3F);

		sncb_m6Model[36].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Box 68
		sncb_m6Model[36].setRotationPoint(37F, 6F, 3F);

		sncb_m6Model[37].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Box 69
		sncb_m6Model[37].setRotationPoint(36F, 7F, 3F);

		sncb_m6Model[38].addShapeBox(0F, 0F, 0F, 8, 1, 9, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 70
		sncb_m6Model[38].setRotationPoint(28F, 7F, 0F);

		sncb_m6Model[39].addBox(0F, 0F, 0F, 64, 1, 5, 0F); // Box 71
		sncb_m6Model[39].setRotationPoint(-28F, 7F, -9F);

		sncb_m6Model[40].addShapeBox(0F, 0F, 0F, 6, 1, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F); // Box 73
		sncb_m6Model[40].setRotationPoint(30F, 7F, -4F);

		sncb_m6Model[41].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 81
		sncb_m6Model[41].setRotationPoint(24F, 5F, 2F);

		sncb_m6Model[42].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 82
		sncb_m6Model[42].setRotationPoint(23F, 4F, 1F);

		sncb_m6Model[43].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 83
		sncb_m6Model[43].setRotationPoint(23F, 4F, 6F);

		sncb_m6Model[44].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 84
		sncb_m6Model[44].setRotationPoint(24F, 5F, 3F);

		sncb_m6Model[45].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 85
		sncb_m6Model[45].setRotationPoint(27F, 0F, 1F);

		sncb_m6Model[46].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 86
		sncb_m6Model[46].setRotationPoint(27F, 0F, 6F);

		sncb_m6Model[47].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 87
		sncb_m6Model[47].setRotationPoint(27F, 4F, 2F);

		sncb_m6Model[48].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 88
		sncb_m6Model[48].setRotationPoint(27F, 4F, 7F);

		sncb_m6Model[49].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 89
		sncb_m6Model[49].setRotationPoint(28F, -2F, 1F);

		sncb_m6Model[50].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 90
		sncb_m6Model[50].setRotationPoint(28F, -2F, 6F);

		sncb_m6Model[51].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 91
		sncb_m6Model[51].setRotationPoint(23F, 2F, 0F);

		sncb_m6Model[52].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 92
		sncb_m6Model[52].setRotationPoint(23F, 2F, 5F);

		sncb_m6Model[53].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 94
		sncb_m6Model[53].setRotationPoint(-9F, 2F, 0F);

		sncb_m6Model[54].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 95
		sncb_m6Model[54].setRotationPoint(-8F, 5F, 3F);

		sncb_m6Model[55].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 96
		sncb_m6Model[55].setRotationPoint(-8F, 5F, 2F);

		sncb_m6Model[56].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 97
		sncb_m6Model[56].setRotationPoint(-9F, 4F, 1F);

		sncb_m6Model[57].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 98
		sncb_m6Model[57].setRotationPoint(-9F, 4F, 6F);

		sncb_m6Model[58].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 99
		sncb_m6Model[58].setRotationPoint(-5F, 0F, 6F);

		sncb_m6Model[59].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 100
		sncb_m6Model[59].setRotationPoint(-5F, 0F, 1F);

		sncb_m6Model[60].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 101
		sncb_m6Model[60].setRotationPoint(-4F, -2F, 1F);

		sncb_m6Model[61].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 102
		sncb_m6Model[61].setRotationPoint(-4F, -2F, 6F);

		sncb_m6Model[62].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 103
		sncb_m6Model[62].setRotationPoint(-9F, 2F, 5F);

		sncb_m6Model[63].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 104
		sncb_m6Model[63].setRotationPoint(-5F, 4F, 2F);

		sncb_m6Model[64].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 105
		sncb_m6Model[64].setRotationPoint(-5F, 4F, 7F);

		sncb_m6Model[65].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 106
		sncb_m6Model[65].setRotationPoint(-17F, 2F, 0F);

		sncb_m6Model[66].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 107
		sncb_m6Model[66].setRotationPoint(-15F, 5F, 3F);

		sncb_m6Model[67].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 108
		sncb_m6Model[67].setRotationPoint(-15F, 5F, 2F);

		sncb_m6Model[68].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 109
		sncb_m6Model[68].setRotationPoint(-16F, 4F, 1F);

		sncb_m6Model[69].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 110
		sncb_m6Model[69].setRotationPoint(-16F, 4F, 6F);

		sncb_m6Model[70].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 111
		sncb_m6Model[70].setRotationPoint(-17F, 0F, 6F);

		sncb_m6Model[71].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 112
		sncb_m6Model[71].setRotationPoint(-17F, 0F, 1F);

		sncb_m6Model[72].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 113
		sncb_m6Model[72].setRotationPoint(-18F, -2F, 1F);

		sncb_m6Model[73].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 114
		sncb_m6Model[73].setRotationPoint(-18F, -2F, 6F);

		sncb_m6Model[74].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 115
		sncb_m6Model[74].setRotationPoint(-17F, 2F, 5F);

		sncb_m6Model[75].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 116
		sncb_m6Model[75].setRotationPoint(-17F, 4F, 2F);

		sncb_m6Model[76].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 117
		sncb_m6Model[76].setRotationPoint(-17F, 4F, 7F);

		sncb_m6Model[77].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 118
		sncb_m6Model[77].setRotationPoint(-35F, -2F, 1F);

		sncb_m6Model[78].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 119
		sncb_m6Model[78].setRotationPoint(-35F, -2F, 6F);

		sncb_m6Model[79].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 120
		sncb_m6Model[79].setRotationPoint(-34F, 0F, 6F);

		sncb_m6Model[80].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 121
		sncb_m6Model[80].setRotationPoint(-34F, 0F, 1F);

		sncb_m6Model[81].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 122
		sncb_m6Model[81].setRotationPoint(-33F, 4F, 1F);

		sncb_m6Model[82].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 123
		sncb_m6Model[82].setRotationPoint(-33F, 4F, 6F);

		sncb_m6Model[83].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 124
		sncb_m6Model[83].setRotationPoint(-34F, 2F, 5F);

		sncb_m6Model[84].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 125
		sncb_m6Model[84].setRotationPoint(-34F, 2F, 0F);

		sncb_m6Model[85].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 126
		sncb_m6Model[85].setRotationPoint(-34F, 4F, 7F);

		sncb_m6Model[86].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 127
		sncb_m6Model[86].setRotationPoint(-32F, 5F, 3F);

		sncb_m6Model[87].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 128
		sncb_m6Model[87].setRotationPoint(-32F, 5F, 2F);

		sncb_m6Model[88].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 129
		sncb_m6Model[88].setRotationPoint(-34F, 4F, 2F);

		sncb_m6Model[89].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 130
		sncb_m6Model[89].setRotationPoint(-25F, 4F, 6F);

		sncb_m6Model[90].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 131
		sncb_m6Model[90].setRotationPoint(-25F, 4F, 1F);

		sncb_m6Model[91].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 132
		sncb_m6Model[91].setRotationPoint(-25F, 2F, 5F);

		sncb_m6Model[92].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 133
		sncb_m6Model[92].setRotationPoint(-25F, 2F, 0F);

		sncb_m6Model[93].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 134
		sncb_m6Model[93].setRotationPoint(-20F, -2F, 1F);

		sncb_m6Model[94].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 135
		sncb_m6Model[94].setRotationPoint(-21F, 0F, 1F);

		sncb_m6Model[95].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 136
		sncb_m6Model[95].setRotationPoint(-21F, 0F, 6F);

		sncb_m6Model[96].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 137
		sncb_m6Model[96].setRotationPoint(-20F, -2F, 6F);

		sncb_m6Model[97].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 138
		sncb_m6Model[97].setRotationPoint(-21F, 4F, 7F);

		sncb_m6Model[98].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 139
		sncb_m6Model[98].setRotationPoint(-21F, 4F, 2F);

		sncb_m6Model[99].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 140
		sncb_m6Model[99].setRotationPoint(-24F, 5F, 2F);

		sncb_m6Model[100].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 141
		sncb_m6Model[100].setRotationPoint(-24F, 5F, 3F);

		sncb_m6Model[101].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Box 177
		sncb_m6Model[101].setRotationPoint(-43F, 0F, 3F);

		sncb_m6Model[102].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Box 178
		sncb_m6Model[102].setRotationPoint(-42F, -1F, 3F);

		sncb_m6Model[103].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Box 179
		sncb_m6Model[103].setRotationPoint(-41F, -2F, 3F);

		sncb_m6Model[104].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Box 180
		sncb_m6Model[104].setRotationPoint(-40F, -3F, 3F);

		sncb_m6Model[105].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Box 181
		sncb_m6Model[105].setRotationPoint(-38F, -5F, 3F);

		sncb_m6Model[106].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Box 182
		sncb_m6Model[106].setRotationPoint(-39F, -4F, 3F);

		sncb_m6Model[107].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Box 183
		sncb_m6Model[107].setRotationPoint(-37F, -6F, 3F);

		sncb_m6Model[108].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Box 184
		sncb_m6Model[108].setRotationPoint(-36F, 7F, -9F);

		sncb_m6Model[109].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Box 185
		sncb_m6Model[109].setRotationPoint(-37F, 6F, -9F);

		sncb_m6Model[110].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Box 186
		sncb_m6Model[110].setRotationPoint(-38F, 5F, -9F);

		sncb_m6Model[111].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Box 187
		sncb_m6Model[111].setRotationPoint(-39F, 4F, -9F);

		sncb_m6Model[112].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Box 188
		sncb_m6Model[112].setRotationPoint(-40F, 3F, -9F);

		sncb_m6Model[113].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Box 189
		sncb_m6Model[113].setRotationPoint(-41F, 2F, -9F);

		sncb_m6Model[114].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Box 190
		sncb_m6Model[114].setRotationPoint(-42F, 1F, -9F);

		sncb_m6Model[115].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Box 191
		sncb_m6Model[115].setRotationPoint(42F, 0F, -9F);

		sncb_m6Model[116].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Box 192
		sncb_m6Model[116].setRotationPoint(41F, -1F, -9F);

		sncb_m6Model[117].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Box 193
		sncb_m6Model[117].setRotationPoint(40F, -2F, -9F);

		sncb_m6Model[118].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Box 194
		sncb_m6Model[118].setRotationPoint(39F, -3F, -9F);

		sncb_m6Model[119].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Box 195
		sncb_m6Model[119].setRotationPoint(38F, -4F, -9F);

		sncb_m6Model[120].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Box 196
		sncb_m6Model[120].setRotationPoint(37F, -5F, -9F);

		sncb_m6Model[121].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Box 197
		sncb_m6Model[121].setRotationPoint(36F, -6F, -9F);

		sncb_m6Model[122].addBox(0F, 0F, 0F, 70, 1, 20, 0F); // Box 202
		sncb_m6Model[122].setRotationPoint(-35F, -6F, -10F);

		sncb_m6Model[123].addBox(0F, 0F, 0F, 1, 13, 13, 0F); // Box 212
		sncb_m6Model[123].setRotationPoint(-36F, -6F, -3F);

		sncb_m6Model[124].addShapeBox(0F, 0F, 0F, 3, 14, 2, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 215
		sncb_m6Model[124].setRotationPoint(-46F, -13F, -3F);

		sncb_m6Model[125].addBox(0F, 0F, 0F, 1, 13, 7, 0F); // Box 217
		sncb_m6Model[125].setRotationPoint(35F, -6F, -10F);

		sncb_m6Model[126].addShapeBox(0F, 0F, 0F, 7, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F); // Box 221
		sncb_m6Model[126].setRotationPoint(36F, -4F, -3F);

		sncb_m6Model[127].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 183
		sncb_m6Model[127].setRotationPoint(16F, 4F, 1F);

		sncb_m6Model[128].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 184
		sncb_m6Model[128].setRotationPoint(16F, 4F, 6F);

		sncb_m6Model[129].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 185
		sncb_m6Model[129].setRotationPoint(15F, 2F, 0F);

		sncb_m6Model[130].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 186
		sncb_m6Model[130].setRotationPoint(15F, 2F, 5F);

		sncb_m6Model[131].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 187
		sncb_m6Model[131].setRotationPoint(14F, -2F, 6F);

		sncb_m6Model[132].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 188
		sncb_m6Model[132].setRotationPoint(15F, 0F, 6F);

		sncb_m6Model[133].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 189
		sncb_m6Model[133].setRotationPoint(15F, 0F, 1F);

		sncb_m6Model[134].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 190
		sncb_m6Model[134].setRotationPoint(14F, -2F, 1F);

		sncb_m6Model[135].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 191
		sncb_m6Model[135].setRotationPoint(15F, 4F, 7F);

		sncb_m6Model[136].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 192
		sncb_m6Model[136].setRotationPoint(15F, 4F, 2F);

		sncb_m6Model[137].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 193
		sncb_m6Model[137].setRotationPoint(17F, 5F, 3F);

		sncb_m6Model[138].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 194
		sncb_m6Model[138].setRotationPoint(17F, 5F, 2F);

		sncb_m6Model[139].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 81
		sncb_m6Model[139].setRotationPoint(8F, 5F, 2F);

		sncb_m6Model[140].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 82
		sncb_m6Model[140].setRotationPoint(7F, 4F, 1F);

		sncb_m6Model[141].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 83
		sncb_m6Model[141].setRotationPoint(7F, 4F, 6F);

		sncb_m6Model[142].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 84
		sncb_m6Model[142].setRotationPoint(8F, 5F, 3F);

		sncb_m6Model[143].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 86
		sncb_m6Model[143].setRotationPoint(11F, 0F, 6F);

		sncb_m6Model[144].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 87
		sncb_m6Model[144].setRotationPoint(11F, 4F, 2F);

		sncb_m6Model[145].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 88
		sncb_m6Model[145].setRotationPoint(11F, 4F, 7F);

		sncb_m6Model[146].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 89
		sncb_m6Model[146].setRotationPoint(12F, -2F, 1F);

		sncb_m6Model[147].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 90
		sncb_m6Model[147].setRotationPoint(12F, -2F, 6F);

		sncb_m6Model[148].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 91
		sncb_m6Model[148].setRotationPoint(7F, 2F, 0F);

		sncb_m6Model[149].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 92
		sncb_m6Model[149].setRotationPoint(7F, 2F, 5F);

		sncb_m6Model[150].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 183
		sncb_m6Model[150].setRotationPoint(0F, 4F, 1F);

		sncb_m6Model[151].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 184
		sncb_m6Model[151].setRotationPoint(0F, 4F, 6F);

		sncb_m6Model[152].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 185
		sncb_m6Model[152].setRotationPoint(-1F, 2F, 0F);

		sncb_m6Model[153].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 186
		sncb_m6Model[153].setRotationPoint(-1F, 2F, 5F);

		sncb_m6Model[154].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 187
		sncb_m6Model[154].setRotationPoint(-2F, -2F, 6F);

		sncb_m6Model[155].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 188
		sncb_m6Model[155].setRotationPoint(-1F, 0F, 6F);

		sncb_m6Model[156].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 189
		sncb_m6Model[156].setRotationPoint(-1F, 0F, 1F);

		sncb_m6Model[157].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 190
		sncb_m6Model[157].setRotationPoint(-2F, -2F, 1F);

		sncb_m6Model[158].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 191
		sncb_m6Model[158].setRotationPoint(-1F, 4F, 7F);

		sncb_m6Model[159].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 192
		sncb_m6Model[159].setRotationPoint(-1F, 4F, 2F);

		sncb_m6Model[160].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 193
		sncb_m6Model[160].setRotationPoint(1F, 5F, 3F);

		sncb_m6Model[161].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 194
		sncb_m6Model[161].setRotationPoint(1F, 5F, 2F);

		sncb_m6Model[162].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 86
		sncb_m6Model[162].setRotationPoint(11F, 0F, 1F);

		sncb_m6Model[163].addBox(0F, 0F, 0F, 80, 1, 18, 0F); // Box 8
		sncb_m6Model[163].setRotationPoint(-40F, 8F, -9F);

		sncb_m6Model[164].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 163
		sncb_m6Model[164].setRotationPoint(-17F, 2F, -10F);

		sncb_m6Model[165].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 164
		sncb_m6Model[165].setRotationPoint(-16F, 4F, -9F);

		sncb_m6Model[166].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 165
		sncb_m6Model[166].setRotationPoint(-17F, 2F, -5F);

		sncb_m6Model[167].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 166
		sncb_m6Model[167].setRotationPoint(-15F, 5F, -8F);

		sncb_m6Model[168].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 167
		sncb_m6Model[168].setRotationPoint(-17F, 0F, -9F);

		sncb_m6Model[169].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 168
		sncb_m6Model[169].setRotationPoint(-18F, -2F, -9F);

		sncb_m6Model[170].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 169
		sncb_m6Model[170].setRotationPoint(-17F, 4F, -8F);

		sncb_m6Model[171].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 163
		sncb_m6Model[171].setRotationPoint(-1F, 2F, -10F);

		sncb_m6Model[172].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 164
		sncb_m6Model[172].setRotationPoint(0F, 4F, -9F);

		sncb_m6Model[173].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 165
		sncb_m6Model[173].setRotationPoint(-1F, 2F, -5F);

		sncb_m6Model[174].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 166
		sncb_m6Model[174].setRotationPoint(1F, 5F, -8F);

		sncb_m6Model[175].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 167
		sncb_m6Model[175].setRotationPoint(-1F, 0F, -9F);

		sncb_m6Model[176].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 168
		sncb_m6Model[176].setRotationPoint(-2F, -2F, -9F);

		sncb_m6Model[177].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 169
		sncb_m6Model[177].setRotationPoint(-1F, 4F, -8F);

		sncb_m6Model[178].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 163
		sncb_m6Model[178].setRotationPoint(15F, 2F, -10F);

		sncb_m6Model[179].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 164
		sncb_m6Model[179].setRotationPoint(16F, 4F, -9F);

		sncb_m6Model[180].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 165
		sncb_m6Model[180].setRotationPoint(15F, 2F, -5F);

		sncb_m6Model[181].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 166
		sncb_m6Model[181].setRotationPoint(17F, 5F, -8F);

		sncb_m6Model[182].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 167
		sncb_m6Model[182].setRotationPoint(15F, 0F, -9F);

		sncb_m6Model[183].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 168
		sncb_m6Model[183].setRotationPoint(14F, -2F, -9F);

		sncb_m6Model[184].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 169
		sncb_m6Model[184].setRotationPoint(15F, 4F, -8F);

		sncb_m6Model[185].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 170
		sncb_m6Model[185].setRotationPoint(23F, 2F, -10F);

		sncb_m6Model[186].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 171
		sncb_m6Model[186].setRotationPoint(23F, 4F, -9F);

		sncb_m6Model[187].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 172
		sncb_m6Model[187].setRotationPoint(23F, 2F, -5F);

		sncb_m6Model[188].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 173
		sncb_m6Model[188].setRotationPoint(24F, 5F, -8F);

		sncb_m6Model[189].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 174
		sncb_m6Model[189].setRotationPoint(27F, 0F, -9F);

		sncb_m6Model[190].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 175
		sncb_m6Model[190].setRotationPoint(28F, -2F, -9F);

		sncb_m6Model[191].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 176
		sncb_m6Model[191].setRotationPoint(27F, 4F, -8F);

		sncb_m6Model[192].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 170
		sncb_m6Model[192].setRotationPoint(7F, 2F, -10F);

		sncb_m6Model[193].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 171
		sncb_m6Model[193].setRotationPoint(7F, 4F, -9F);

		sncb_m6Model[194].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 172
		sncb_m6Model[194].setRotationPoint(7F, 2F, -5F);

		sncb_m6Model[195].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 173
		sncb_m6Model[195].setRotationPoint(8F, 5F, -8F);

		sncb_m6Model[196].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 174
		sncb_m6Model[196].setRotationPoint(11F, 0F, -9F);

		sncb_m6Model[197].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 175
		sncb_m6Model[197].setRotationPoint(12F, -2F, -9F);

		sncb_m6Model[198].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 176
		sncb_m6Model[198].setRotationPoint(11F, 4F, -8F);

		sncb_m6Model[199].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 170
		sncb_m6Model[199].setRotationPoint(-9F, 2F, -10F);

		sncb_m6Model[200].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 171
		sncb_m6Model[200].setRotationPoint(-9F, 4F, -9F);

		sncb_m6Model[201].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 172
		sncb_m6Model[201].setRotationPoint(-9F, 2F, -5F);

		sncb_m6Model[202].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 173
		sncb_m6Model[202].setRotationPoint(-8F, 5F, -8F);

		sncb_m6Model[203].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 174
		sncb_m6Model[203].setRotationPoint(-5F, 0F, -9F);

		sncb_m6Model[204].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 175
		sncb_m6Model[204].setRotationPoint(-4F, -2F, -9F);

		sncb_m6Model[205].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 176
		sncb_m6Model[205].setRotationPoint(-5F, 4F, -8F);

		sncb_m6Model[206].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 163
		sncb_m6Model[206].setRotationPoint(-24F, 2F, -10F);

		sncb_m6Model[207].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 164
		sncb_m6Model[207].setRotationPoint(-23F, 4F, -9F);

		sncb_m6Model[208].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 165
		sncb_m6Model[208].setRotationPoint(-24F, 2F, -5F);

		sncb_m6Model[209].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 166
		sncb_m6Model[209].setRotationPoint(-22F, 5F, -8F);

		sncb_m6Model[210].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 167
		sncb_m6Model[210].setRotationPoint(-24F, 0F, -9F);

		sncb_m6Model[211].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 168
		sncb_m6Model[211].setRotationPoint(-25F, -2F, -9F);

		sncb_m6Model[212].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 169
		sncb_m6Model[212].setRotationPoint(-24F, 4F, -8F);

		sncb_m6Model[213].addShapeBox(0F, 0F, 0F, 71, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 168
		sncb_m6Model[213].setRotationPoint(-35F, 5F, -10F);

		sncb_m6Model[214].addShapeBox(0F, 0F, 0F, 70, 2, 1, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 168
		sncb_m6Model[214].setRotationPoint(-35F, 5F, 9F);

		sncb_m6Model[215].addBox(0F, 0F, 0F, 64, 1, 5, 0F); // Box 71
		sncb_m6Model[215].setRotationPoint(-29F, -7F, 4F);

		sncb_m6Model[216].addShapeBox(0F, 0F, 0F, 70, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 168
		sncb_m6Model[216].setRotationPoint(-35F, -9F, -10F);

		sncb_m6Model[217].addShapeBox(0F, 0F, 0F, 70, 2, 1, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 168
		sncb_m6Model[217].setRotationPoint(-35F, -9F, 9F);

		sncb_m6Model[218].addBox(0F, 0F, 0F, 7, 19, 1, 0F); // Box 221
		sncb_m6Model[218].setRotationPoint(36F, -17F, -10F);

		sncb_m6Model[219].addBox(0F, 0F, 0F, 7, 18, 1, 0F); // Box 216
		sncb_m6Model[219].setRotationPoint(-43F, -17F, 9F);

		sncb_m6Model[220].addBox(0F, 0F, 0F, 63, 1, 9, 0F); // Box 197
		sncb_m6Model[220].setRotationPoint(-35F, -7F, -9F);

		sncb_m6Model[221].addShapeBox(0F, 0F, 0F, 1, 13, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 217
		sncb_m6Model[221].setRotationPoint(35F, -6F, -3F);

		sncb_m6Model[222].addShapeBox(0F, 0F, 0F, 6, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 61
		sncb_m6Model[222].setRotationPoint(-35F, -7F, 0F);

		sncb_m6Model[223].addShapeBox(0F, 0F, 0F, 6, 1, 7, 0F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		sncb_m6Model[223].setRotationPoint(29F, -7F, -3F);

		sncb_m6Model[224].addBox(0F, 0F, 0F, 1, 1, 12, 0F); // Box 196
		sncb_m6Model[224].setRotationPoint(35F, -7F, -3F);

		sncb_m6Model[225].addBox(0F, 0F, 0F, 1, 10, 6, 0F); // Box 217
		sncb_m6Model[225].setRotationPoint(35F, -17F, -3F);

		sncb_m6Model[226].addBox(0F, 0F, 0F, 1, 18, 20, 0F); // Box 194
		sncb_m6Model[226].setRotationPoint(68F, -17F, -10F);

		sncb_m6Model[227].addBox(0F, 0F, 0F, 1, 18, 20, 0F); // Box 194
		sncb_m6Model[227].setRotationPoint(-69F, -17F, -10F);

		sncb_m6Model[228].addBox(0F, 0F, 0F, 1, 3, 16, 0F); // Box 193
		sncb_m6Model[228].setRotationPoint(-69F, -20F, -8F);

		sncb_m6Model[229].addBox(0F, 0F, 0F, 1, 2, 5, 0F); // Box 193
		sncb_m6Model[229].setRotationPoint(-69F, -22F, -5F);

		sncb_m6Model[230].addShapeBox(0F, 0F, 0F, 5, 17, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F); // Box 215
		sncb_m6Model[230].setRotationPoint(59F, -16F, -8F);

		sncb_m6Model[231].addShapeBox(0F, 0F, 0F, 5, 17, 4, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 215
		sncb_m6Model[231].setRotationPoint(59F, -16F, 4F);

		sncb_m6Model[232].addBox(0F, 0F, 0F, 4, 14, 6, 0F); // Box 215
		sncb_m6Model[232].setRotationPoint(64F, -13F, 4F);

		sncb_m6Model[233].addBox(0F, 0F, 0F, 4, 14, 6, 0F); // Box 215
		sncb_m6Model[233].setRotationPoint(64F, -13F, -10F);

		sncb_m6Model[234].addBox(0F, 0F, 0F, 1, 14, 1, 0F); // Box 215
		sncb_m6Model[234].setRotationPoint(69F, -13F, 4F);

		sncb_m6Model[235].addBox(0F, 0F, 0F, 1, 14, 1, 0F); // Box 215
		sncb_m6Model[235].setRotationPoint(69F, -13F, -5F);

		sncb_m6Model[236].addBox(0F, 0F, 0F, 1, 1, 8, 0F); // Box 215
		sncb_m6Model[236].setRotationPoint(69F, -13F, -4F);

		sncb_m6Model[237].addBox(0F, 0F, 0F, 1, 14, 1, 0F); // Box 215
		sncb_m6Model[237].setRotationPoint(-70F, -13F, 4F);

		sncb_m6Model[238].addBox(0F, 0F, 0F, 1, 14, 1, 0F); // Box 215
		sncb_m6Model[238].setRotationPoint(-70F, -13F, -5F);

		sncb_m6Model[239].addBox(0F, 0F, 0F, 1, 1, 8, 0F); // Box 215
		sncb_m6Model[239].setRotationPoint(-70F, -13F, -4F);

		sncb_m6Model[240].addBox(0F, 0F, 0F, 8, 4, 20, 0F); // Box 215
		sncb_m6Model[240].setRotationPoint(-68F, -17F, -10F);

		sncb_m6Model[241].addBox(0F, 0F, 0F, 4, 14, 1, 0F); // Box 215
		sncb_m6Model[241].setRotationPoint(-47F, -13F, -10F);

		sncb_m6Model[242].addBox(0F, 0F, 0F, 4, 14, 1, 0F); // Box 215
		sncb_m6Model[242].setRotationPoint(-47F, -13F, 9F);

		sncb_m6Model[243].addBox(0F, 0F, 0F, 14, 1, 16, 0F); // Box 215
		sncb_m6Model[243].setRotationPoint(-60F, -17F, -8F);

		sncb_m6Model[244].addShapeBox(0F, 0F, 0F, 8, 12, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F); // Box 215
		sncb_m6Model[244].setRotationPoint(-43F, -17F, -9F);

		sncb_m6Model[245].addShapeBox(0F, 0F, 0F, 5, 3, 17, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F); // Box 215
		sncb_m6Model[245].setRotationPoint(59F, -16F, -8F);

		sncb_m6Model[246].addBox(0F, 0F, 0F, 21, 4, 2, 0F); // Box 215
		sncb_m6Model[246].setRotationPoint(43F, -17F, -10F);

		sncb_m6Model[247].addBox(0F, 0F, 0F, 21, 4, 2, 0F); // Box 215
		sncb_m6Model[247].setRotationPoint(43F, -17F, 8F);

		sncb_m6Model[248].addBox(0F, 0F, 0F, 4, 14, 1, 0F); // Box 215
		sncb_m6Model[248].setRotationPoint(43F, -13F, -10F);

		sncb_m6Model[249].addBox(0F, 0F, 0F, 4, 14, 1, 0F); // Box 215
		sncb_m6Model[249].setRotationPoint(43F, -13F, 9F);

		sncb_m6Model[250].addShapeBox(0F, 0F, 0F, 6, 1, 5, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 61
		sncb_m6Model[250].setRotationPoint(-35F, -7F, 4F);

		sncb_m6Model[251].addBox(0F, 0F, 0F, 4, 4, 20, 0F); // Box 215
		sncb_m6Model[251].setRotationPoint(64F, -17F, -10F);

		sncb_m6Model[252].addBox(0F, 0F, 0F, 3, 4, 16, 0F); // Box 215
		sncb_m6Model[252].setRotationPoint(43F, -17F, -8F);

		sncb_m6Model[253].addBox(0F, 0F, 0F, 3, 4, 16, 0F); // Box 215
		sncb_m6Model[253].setRotationPoint(-46F, -17F, -8F);

		sncb_m6Model[254].addBox(0F, 0F, 0F, 1, 11, 6, 0F); // Box 213
		sncb_m6Model[254].setRotationPoint(-36F, -17F, -3F);

		sncb_m6Model[255].addBox(0F, 0F, 0F, 1, 11, 1, 0F); // Box 216
		sncb_m6Model[255].setRotationPoint(-36F, -17F, 9F);

		sncb_m6Model[256].addShapeBox(0F, 0F, 0F, 8, 12, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F); // Box 215
		sncb_m6Model[256].setRotationPoint(35F, -17F, 3F);

		sncb_m6Model[257].addBox(0F, 0F, 0F, 1, 11, 1, 0F); // Box 216
		sncb_m6Model[257].setRotationPoint(35F, -17F, -10F);

		sncb_m6Model[258].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 170
		sncb_m6Model[258].setRotationPoint(-25F, -12F, -1F);

		sncb_m6Model[259].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 171
		sncb_m6Model[259].setRotationPoint(-25F, -10F, -5F);

		sncb_m6Model[260].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 174
		sncb_m6Model[260].setRotationPoint(-21F, -14F, -5F);

		sncb_m6Model[261].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 175
		sncb_m6Model[261].setRotationPoint(-20F, -16F, -5F);

		sncb_m6Model[262].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 176
		sncb_m6Model[262].setRotationPoint(-21F, -10F, -4F);

		sncb_m6Model[263].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 163
		sncb_m6Model[263].setRotationPoint(-34F, -12F, -1F);

		sncb_m6Model[264].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 164
		sncb_m6Model[264].setRotationPoint(-33F, -10F, -5F);

		sncb_m6Model[265].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 167
		sncb_m6Model[265].setRotationPoint(-34F, -14F, -5F);

		sncb_m6Model[266].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 168
		sncb_m6Model[266].setRotationPoint(-35F, -16F, -5F);

		sncb_m6Model[267].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 169
		sncb_m6Model[267].setRotationPoint(-34F, -10F, -4F);

		sncb_m6Model[268].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 170
		sncb_m6Model[268].setRotationPoint(-25F, -12F, -6F);

		sncb_m6Model[269].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 171
		sncb_m6Model[269].setRotationPoint(-25F, -10F, -10F);

		sncb_m6Model[270].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 174
		sncb_m6Model[270].setRotationPoint(-21F, -14F, -10F);

		sncb_m6Model[271].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 175
		sncb_m6Model[271].setRotationPoint(-20F, -16F, -10F);

		sncb_m6Model[272].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 176
		sncb_m6Model[272].setRotationPoint(-21F, -10F, -9F);

		sncb_m6Model[273].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 163
		sncb_m6Model[273].setRotationPoint(-34F, -12F, -6F);

		sncb_m6Model[274].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 164
		sncb_m6Model[274].setRotationPoint(-33F, -10F, -10F);

		sncb_m6Model[275].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 167
		sncb_m6Model[275].setRotationPoint(-34F, -14F, -10F);

		sncb_m6Model[276].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 168
		sncb_m6Model[276].setRotationPoint(-35F, -16F, -10F);

		sncb_m6Model[277].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 169
		sncb_m6Model[277].setRotationPoint(-34F, -10F, -9F);

		sncb_m6Model[278].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 170
		sncb_m6Model[278].setRotationPoint(-9F, -12F, -1F);

		sncb_m6Model[279].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 171
		sncb_m6Model[279].setRotationPoint(-9F, -10F, -5F);

		sncb_m6Model[280].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 174
		sncb_m6Model[280].setRotationPoint(-5F, -14F, -5F);

		sncb_m6Model[281].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 175
		sncb_m6Model[281].setRotationPoint(-4F, -16F, -5F);

		sncb_m6Model[282].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 176
		sncb_m6Model[282].setRotationPoint(-5F, -10F, -4F);

		sncb_m6Model[283].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 163
		sncb_m6Model[283].setRotationPoint(-17F, -12F, -1F);

		sncb_m6Model[284].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 164
		sncb_m6Model[284].setRotationPoint(-16F, -10F, -5F);

		sncb_m6Model[285].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 167
		sncb_m6Model[285].setRotationPoint(-17F, -14F, -5F);

		sncb_m6Model[286].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 168
		sncb_m6Model[286].setRotationPoint(-18F, -16F, -5F);

		sncb_m6Model[287].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 169
		sncb_m6Model[287].setRotationPoint(-17F, -10F, -4F);

		sncb_m6Model[288].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 170
		sncb_m6Model[288].setRotationPoint(-9F, -12F, -6F);

		sncb_m6Model[289].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 171
		sncb_m6Model[289].setRotationPoint(-9F, -10F, -10F);

		sncb_m6Model[290].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 174
		sncb_m6Model[290].setRotationPoint(-5F, -14F, -10F);

		sncb_m6Model[291].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 175
		sncb_m6Model[291].setRotationPoint(-4F, -16F, -10F);

		sncb_m6Model[292].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 176
		sncb_m6Model[292].setRotationPoint(-5F, -10F, -9F);

		sncb_m6Model[293].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 163
		sncb_m6Model[293].setRotationPoint(-17F, -12F, -6F);

		sncb_m6Model[294].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 164
		sncb_m6Model[294].setRotationPoint(-16F, -10F, -10F);

		sncb_m6Model[295].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 167
		sncb_m6Model[295].setRotationPoint(-17F, -14F, -10F);

		sncb_m6Model[296].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 168
		sncb_m6Model[296].setRotationPoint(-18F, -16F, -10F);

		sncb_m6Model[297].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 169
		sncb_m6Model[297].setRotationPoint(-17F, -10F, -9F);

		sncb_m6Model[298].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 170
		sncb_m6Model[298].setRotationPoint(7F, -12F, -1F);

		sncb_m6Model[299].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 171
		sncb_m6Model[299].setRotationPoint(7F, -10F, -5F);

		sncb_m6Model[300].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 174
		sncb_m6Model[300].setRotationPoint(11F, -14F, -5F);

		sncb_m6Model[301].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 175
		sncb_m6Model[301].setRotationPoint(12F, -16F, -5F);

		sncb_m6Model[302].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 176
		sncb_m6Model[302].setRotationPoint(11F, -10F, -4F);

		sncb_m6Model[303].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 163
		sncb_m6Model[303].setRotationPoint(-1F, -12F, -1F);

		sncb_m6Model[304].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 164
		sncb_m6Model[304].setRotationPoint(0F, -10F, -5F);

		sncb_m6Model[305].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 167
		sncb_m6Model[305].setRotationPoint(-1F, -14F, -5F);

		sncb_m6Model[306].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 168
		sncb_m6Model[306].setRotationPoint(-2F, -16F, -5F);

		sncb_m6Model[307].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 169
		sncb_m6Model[307].setRotationPoint(-1F, -10F, -4F);

		sncb_m6Model[308].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 170
		sncb_m6Model[308].setRotationPoint(7F, -12F, -6F);

		sncb_m6Model[309].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 171
		sncb_m6Model[309].setRotationPoint(7F, -10F, -10F);

		sncb_m6Model[310].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 174
		sncb_m6Model[310].setRotationPoint(11F, -14F, -10F);

		sncb_m6Model[311].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 175
		sncb_m6Model[311].setRotationPoint(12F, -16F, -10F);

		sncb_m6Model[312].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 176
		sncb_m6Model[312].setRotationPoint(11F, -10F, -9F);

		sncb_m6Model[313].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 163
		sncb_m6Model[313].setRotationPoint(-1F, -12F, -6F);

		sncb_m6Model[314].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 164
		sncb_m6Model[314].setRotationPoint(0F, -10F, -10F);

		sncb_m6Model[315].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 167
		sncb_m6Model[315].setRotationPoint(-1F, -14F, -10F);

		sncb_m6Model[316].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 168
		sncb_m6Model[316].setRotationPoint(-2F, -16F, -10F);

		sncb_m6Model[317].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 169
		sncb_m6Model[317].setRotationPoint(-1F, -10F, -9F);

		sncb_m6Model[318].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 170
		sncb_m6Model[318].setRotationPoint(23F, -12F, -1F);

		sncb_m6Model[319].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 171
		sncb_m6Model[319].setRotationPoint(23F, -10F, -5F);

		sncb_m6Model[320].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 174
		sncb_m6Model[320].setRotationPoint(27F, -14F, -5F);

		sncb_m6Model[321].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 175
		sncb_m6Model[321].setRotationPoint(28F, -16F, -5F);

		sncb_m6Model[322].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 176
		sncb_m6Model[322].setRotationPoint(27F, -10F, -4F);

		sncb_m6Model[323].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 163
		sncb_m6Model[323].setRotationPoint(15F, -12F, -1F);

		sncb_m6Model[324].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 164
		sncb_m6Model[324].setRotationPoint(16F, -10F, -5F);

		sncb_m6Model[325].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 167
		sncb_m6Model[325].setRotationPoint(15F, -14F, -5F);

		sncb_m6Model[326].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 168
		sncb_m6Model[326].setRotationPoint(14F, -16F, -5F);

		sncb_m6Model[327].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 169
		sncb_m6Model[327].setRotationPoint(15F, -10F, -4F);

		sncb_m6Model[328].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 170
		sncb_m6Model[328].setRotationPoint(23F, -12F, -6F);

		sncb_m6Model[329].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 171
		sncb_m6Model[329].setRotationPoint(23F, -10F, -10F);

		sncb_m6Model[330].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 174
		sncb_m6Model[330].setRotationPoint(27F, -14F, -10F);

		sncb_m6Model[331].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 175
		sncb_m6Model[331].setRotationPoint(28F, -16F, -10F);

		sncb_m6Model[332].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 176
		sncb_m6Model[332].setRotationPoint(27F, -10F, -9F);

		sncb_m6Model[333].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 163
		sncb_m6Model[333].setRotationPoint(15F, -12F, -6F);

		sncb_m6Model[334].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 164
		sncb_m6Model[334].setRotationPoint(16F, -10F, -10F);

		sncb_m6Model[335].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 167
		sncb_m6Model[335].setRotationPoint(15F, -14F, -10F);

		sncb_m6Model[336].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 168
		sncb_m6Model[336].setRotationPoint(14F, -16F, -10F);

		sncb_m6Model[337].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 169
		sncb_m6Model[337].setRotationPoint(15F, -10F, -9F);

		sncb_m6Model[338].addBox(0F, 0F, 0F, 18, 1, 16, 0F); // Box 175
		sncb_m6Model[338].setRotationPoint(46F, -17F, -8F);

		sncb_m6Model[339].addShapeBox(0F, 0F, 0F, 8, 4, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 168
		sncb_m6Model[339].setRotationPoint(-43F, -17F, 3F);

		sncb_m6Model[340].addShapeBox(0F, 0F, 0F, 8, 4, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F); // Box 168
		sncb_m6Model[340].setRotationPoint(35F, -17F, -9F);

		sncb_m6Model[341].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 170
		sncb_m6Model[341].setRotationPoint(23F, -12F, 9F);

		sncb_m6Model[342].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 171
		sncb_m6Model[342].setRotationPoint(23F, -10F, 5F);

		sncb_m6Model[343].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 174
		sncb_m6Model[343].setRotationPoint(27F, -14F, 5F);

		sncb_m6Model[344].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 175
		sncb_m6Model[344].setRotationPoint(28F, -16F, 5F);

		sncb_m6Model[345].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 176
		sncb_m6Model[345].setRotationPoint(27F, -10F, 6F);

		sncb_m6Model[346].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 163
		sncb_m6Model[346].setRotationPoint(15F, -12F, 9F);

		sncb_m6Model[347].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 164
		sncb_m6Model[347].setRotationPoint(16F, -10F, 5F);

		sncb_m6Model[348].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 166
		sncb_m6Model[348].setRotationPoint(24F, -9F, 6F);

		sncb_m6Model[349].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 167
		sncb_m6Model[349].setRotationPoint(15F, -14F, 5F);

		sncb_m6Model[350].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 168
		sncb_m6Model[350].setRotationPoint(14F, -16F, 5F);

		sncb_m6Model[351].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 169
		sncb_m6Model[351].setRotationPoint(15F, -10F, 6F);

		sncb_m6Model[352].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 170
		sncb_m6Model[352].setRotationPoint(23F, -12F, 4F);

		sncb_m6Model[353].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 163
		sncb_m6Model[353].setRotationPoint(15F, -12F, 4F);

		sncb_m6Model[354].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 166
		sncb_m6Model[354].setRotationPoint(17F, -9F, 6F);

		sncb_m6Model[355].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 170
		sncb_m6Model[355].setRotationPoint(7F, -12F, 9F);

		sncb_m6Model[356].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 171
		sncb_m6Model[356].setRotationPoint(7F, -10F, 5F);

		sncb_m6Model[357].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 174
		sncb_m6Model[357].setRotationPoint(11F, -14F, 5F);

		sncb_m6Model[358].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 175
		sncb_m6Model[358].setRotationPoint(12F, -16F, 5F);

		sncb_m6Model[359].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 176
		sncb_m6Model[359].setRotationPoint(11F, -10F, 6F);

		sncb_m6Model[360].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 163
		sncb_m6Model[360].setRotationPoint(-1F, -12F, 9F);

		sncb_m6Model[361].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 164
		sncb_m6Model[361].setRotationPoint(0F, -10F, 5F);

		sncb_m6Model[362].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 166
		sncb_m6Model[362].setRotationPoint(8F, -9F, 6F);

		sncb_m6Model[363].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 167
		sncb_m6Model[363].setRotationPoint(-1F, -14F, 5F);

		sncb_m6Model[364].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 168
		sncb_m6Model[364].setRotationPoint(-2F, -16F, 5F);

		sncb_m6Model[365].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 169
		sncb_m6Model[365].setRotationPoint(-1F, -10F, 6F);

		sncb_m6Model[366].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 170
		sncb_m6Model[366].setRotationPoint(7F, -12F, 4F);

		sncb_m6Model[367].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 163
		sncb_m6Model[367].setRotationPoint(-1F, -12F, 4F);

		sncb_m6Model[368].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 166
		sncb_m6Model[368].setRotationPoint(1F, -9F, 6F);

		sncb_m6Model[369].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 170
		sncb_m6Model[369].setRotationPoint(-9F, -12F, 9F);

		sncb_m6Model[370].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 171
		sncb_m6Model[370].setRotationPoint(-9F, -10F, 5F);

		sncb_m6Model[371].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 174
		sncb_m6Model[371].setRotationPoint(-5F, -14F, 5F);

		sncb_m6Model[372].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 175
		sncb_m6Model[372].setRotationPoint(-4F, -16F, 5F);

		sncb_m6Model[373].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 176
		sncb_m6Model[373].setRotationPoint(-5F, -10F, 6F);

		sncb_m6Model[374].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 163
		sncb_m6Model[374].setRotationPoint(-17F, -12F, 9F);

		sncb_m6Model[375].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 164
		sncb_m6Model[375].setRotationPoint(-16F, -10F, 5F);

		sncb_m6Model[376].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 166
		sncb_m6Model[376].setRotationPoint(-8F, -9F, 6F);

		sncb_m6Model[377].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 167
		sncb_m6Model[377].setRotationPoint(-17F, -14F, 5F);

		sncb_m6Model[378].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 168
		sncb_m6Model[378].setRotationPoint(-18F, -16F, 5F);

		sncb_m6Model[379].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 169
		sncb_m6Model[379].setRotationPoint(-17F, -10F, 6F);

		sncb_m6Model[380].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 170
		sncb_m6Model[380].setRotationPoint(-9F, -12F, 4F);

		sncb_m6Model[381].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 163
		sncb_m6Model[381].setRotationPoint(-17F, -12F, 4F);

		sncb_m6Model[382].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 166
		sncb_m6Model[382].setRotationPoint(-15F, -9F, 6F);

		sncb_m6Model[383].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 163
		sncb_m6Model[383].setRotationPoint(-24F, -12F, 9F);

		sncb_m6Model[384].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 164
		sncb_m6Model[384].setRotationPoint(-23F, -10F, 5F);

		sncb_m6Model[385].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 167
		sncb_m6Model[385].setRotationPoint(-24F, -14F, 5F);

		sncb_m6Model[386].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 168
		sncb_m6Model[386].setRotationPoint(-25F, -16F, 5F);

		sncb_m6Model[387].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 169
		sncb_m6Model[387].setRotationPoint(-24F, -10F, 6F);

		sncb_m6Model[388].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 163
		sncb_m6Model[388].setRotationPoint(-24F, -12F, 4F);

		sncb_m6Model[389].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 166
		sncb_m6Model[389].setRotationPoint(-22F, -9F, 6F);

		sncb_m6Model[390].addBox(0F, 0F, 0F, 1, 2, 5, 0F); // Box 193
		sncb_m6Model[390].setRotationPoint(-69F, -22F, 0F);

		sncb_m6Model[391].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 193
		sncb_m6Model[391].setRotationPoint(-69F, -22F, -8F);

		sncb_m6Model[392].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 193
		sncb_m6Model[392].setRotationPoint(-69F, -22F, 5F);

		sncb_m6Model[393].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 193
		sncb_m6Model[393].setRotationPoint(-69F, -20F, 8F);

		sncb_m6Model[394].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 193
		sncb_m6Model[394].setRotationPoint(-69F, -20F, -10F);

		sncb_m6Model[395].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 193
		sncb_m6Model[395].setRotationPoint(-69F, -23F, -5F);

		sncb_m6Model[396].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 193
		sncb_m6Model[396].setRotationPoint(-69F, -23F, 0F);

		sncb_m6Model[397].addBox(0F, 0F, 0F, 1, 3, 16, 0F); // Box 193
		sncb_m6Model[397].setRotationPoint(68F, -20F, -8F);

		sncb_m6Model[398].addBox(0F, 0F, 0F, 1, 2, 5, 0F); // Box 193
		sncb_m6Model[398].setRotationPoint(68F, -22F, -5F);

		sncb_m6Model[399].addBox(0F, 0F, 0F, 1, 2, 5, 0F); // Box 193
		sncb_m6Model[399].setRotationPoint(68F, -22F, 0F);

		sncb_m6Model[400].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 193
		sncb_m6Model[400].setRotationPoint(68F, -22F, -8F);

		sncb_m6Model[401].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 193
		sncb_m6Model[401].setRotationPoint(68F, -22F, 5F);

		sncb_m6Model[402].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 193
		sncb_m6Model[402].setRotationPoint(68F, -20F, 8F);

		sncb_m6Model[403].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 193
		sncb_m6Model[403].setRotationPoint(68F, -20F, -10F);

		sncb_m6Model[404].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 193
		sncb_m6Model[404].setRotationPoint(68F, -23F, -5F);

		sncb_m6Model[405].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 193
		sncb_m6Model[405].setRotationPoint(68F, -23F, 0F);

		sncb_m6Model[406].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 31
		sncb_m6Model[406].setRotationPoint(41F, 2F, -11F);

		sncb_m6Model[407].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 31
		sncb_m6Model[407].setRotationPoint(40F, 2F, 10F);

		sncb_m6Model[408].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 31
		sncb_m6Model[408].setRotationPoint(41F, 2F, 10F);

		sncb_m6Model[409].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 31
		sncb_m6Model[409].setRotationPoint(-41F, 2F, -11F);

		sncb_m6Model[410].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 31
		sncb_m6Model[410].setRotationPoint(-43F, 2F, -11F);

		sncb_m6Model[411].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 31
		sncb_m6Model[411].setRotationPoint(-41F, 2F, 10F);

		sncb_m6Model[412].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 31
		sncb_m6Model[412].setRotationPoint(-43F, 2F, 10F);

		sncb_m6Model[413].addShapeBox(0F, 0F, 0F, 80, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 10
		sncb_m6Model[413].setRotationPoint(-40F, 8F, 9F);

		sncb_m6Model[414].addShapeBox(0F, 0F, 0F, 80, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 10
		sncb_m6Model[414].setRotationPoint(-40F, 8F, -10F);

		sncb_m6Model[415].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 10
		sncb_m6Model[415].setRotationPoint(40F, 8F, -9F);

		sncb_m6Model[416].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 10
		sncb_m6Model[416].setRotationPoint(-41F, 8F, -9F);

		sncb_m6Model[417].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 10
		sncb_m6Model[417].setRotationPoint(-41F, 8F, -10F);

		sncb_m6Model[418].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F); // Box 10
		sncb_m6Model[418].setRotationPoint(-41F, 8F, 9F);

		sncb_m6Model[419].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F); // Box 10
		sncb_m6Model[419].setRotationPoint(40F, 8F, 9F);

		sncb_m6Model[420].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 10
		sncb_m6Model[420].setRotationPoint(40F, 8F, -10F);

		sncb_m6Model[421].addBox(0F, 0F, 0F, 3, 14, 2, 0F); // Box 215
		sncb_m6Model[421].setRotationPoint(-46F, -13F, -1F);

		sncb_m6Model[422].addShapeBox(0F, 0F, 0F, 3, 14, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 215
		sncb_m6Model[422].setRotationPoint(-46F, -13F, 1F);

		sncb_m6Model[423].addBox(0F, 0F, 0F, 1, 3, 16, 0F); // Box 193
		sncb_m6Model[423].setRotationPoint(-36F, -20F, -8F);

		sncb_m6Model[424].addBox(0F, 0F, 0F, 1, 2, 5, 0F); // Box 193
		sncb_m6Model[424].setRotationPoint(-36F, -22F, -5F);

		sncb_m6Model[425].addBox(0F, 0F, 0F, 1, 2, 5, 0F); // Box 193
		sncb_m6Model[425].setRotationPoint(-36F, -22F, 0F);

		sncb_m6Model[426].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 193
		sncb_m6Model[426].setRotationPoint(-36F, -22F, -8F);

		sncb_m6Model[427].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 193
		sncb_m6Model[427].setRotationPoint(-36F, -22F, 5F);

		sncb_m6Model[428].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 193
		sncb_m6Model[428].setRotationPoint(-36F, -20F, 8F);

		sncb_m6Model[429].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 193
		sncb_m6Model[429].setRotationPoint(-36F, -20F, -10F);

		sncb_m6Model[430].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 193
		sncb_m6Model[430].setRotationPoint(-36F, -23F, -5F);

		sncb_m6Model[431].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 193
		sncb_m6Model[431].setRotationPoint(-36F, -23F, 0F);

		sncb_m6Model[432].addBox(0F, 0F, 0F, 1, 3, 16, 0F); // Box 193
		sncb_m6Model[432].setRotationPoint(35F, -20F, -8F);

		sncb_m6Model[433].addBox(0F, 0F, 0F, 1, 2, 5, 0F); // Box 193
		sncb_m6Model[433].setRotationPoint(35F, -22F, -5F);

		sncb_m6Model[434].addBox(0F, 0F, 0F, 1, 2, 5, 0F); // Box 193
		sncb_m6Model[434].setRotationPoint(35F, -22F, 0F);

		sncb_m6Model[435].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 193
		sncb_m6Model[435].setRotationPoint(35F, -22F, -8F);

		sncb_m6Model[436].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 193
		sncb_m6Model[436].setRotationPoint(35F, -22F, 5F);

		sncb_m6Model[437].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 193
		sncb_m6Model[437].setRotationPoint(35F, -20F, 8F);

		sncb_m6Model[438].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 193
		sncb_m6Model[438].setRotationPoint(35F, -20F, -10F);

		sncb_m6Model[439].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 193
		sncb_m6Model[439].setRotationPoint(35F, -23F, -5F);

		sncb_m6Model[440].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 193
		sncb_m6Model[440].setRotationPoint(35F, -23F, 0F);

		sncb_m6Model[441].addBox(0F, 0F, 0F, 1, 24, 1, 0F); // Box 216
		sncb_m6Model[441].setRotationPoint(35F, -17F, 9F);

		sncb_m6Model[442].addShapeBox(0F, 0F, 0F, 7, 1, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, 0F); // Box 73
		sncb_m6Model[442].setRotationPoint(28F, -7F, -9F);

		sncb_m6Model[443].addBox(0F, 0F, 0F, 17, 4, 2, 0F); // Box 215
		sncb_m6Model[443].setRotationPoint(-60F, -17F, -10F);

		sncb_m6Model[444].addBox(0F, 0F, 0F, 17, 4, 2, 0F); // Box 215
		sncb_m6Model[444].setRotationPoint(-60F, -17F, 8F);

		sncb_m6Model[445].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 163
		sncb_m6Model[445].setRotationPoint(-67F, -4F, 5F);

		sncb_m6Model[446].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 164
		sncb_m6Model[446].setRotationPoint(-66F, -2F, 6F);

		sncb_m6Model[447].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 166
		sncb_m6Model[447].setRotationPoint(-65F, -1F, 7F);

		sncb_m6Model[448].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 167
		sncb_m6Model[448].setRotationPoint(-67F, -6F, 6F);

		sncb_m6Model[449].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 168
		sncb_m6Model[449].setRotationPoint(-68F, -8F, 6F);

		sncb_m6Model[450].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 169
		sncb_m6Model[450].setRotationPoint(-67F, -2F, 7F);

		sncb_m6Model[451].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 163
		sncb_m6Model[451].setRotationPoint(-67F, -4F, -6F);

		sncb_m6Model[452].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 164
		sncb_m6Model[452].setRotationPoint(-66F, -2F, -10F);

		sncb_m6Model[453].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 166
		sncb_m6Model[453].setRotationPoint(-65F, -1F, -9F);

		sncb_m6Model[454].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 167
		sncb_m6Model[454].setRotationPoint(-67F, -6F, -10F);

		sncb_m6Model[455].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 168
		sncb_m6Model[455].setRotationPoint(-68F, -8F, -10F);

		sncb_m6Model[456].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 169
		sncb_m6Model[456].setRotationPoint(-67F, -2F, -9F);

		sncb_m6Model[457].addBox(0F, 0F, 0F, 1, 14, 7, 0F); // Box 215
		sncb_m6Model[457].setRotationPoint(-60F, -13F, -10F);

		sncb_m6Model[458].addBox(0F, 0F, 0F, 1, 14, 7, 0F); // Box 215
		sncb_m6Model[458].setRotationPoint(-60F, -13F, 3F);

		sncb_m6Model[459].addBox(0F, 0F, 0F, 1, 3, 16, 0F); // Box 215
		sncb_m6Model[459].setRotationPoint(-60F, -16F, -8F);

		sncb_m6Model[460].addShapeBox(0F, 0F, 0F, 8, 6, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F); // Box 213
		sncb_m6Model[460].setRotationPoint(-43F, 2F, -10F);

		sncb_m6Model[461].addBox(0F, 0F, 0F, 7, 18, 1, 0F); // Box 213
		sncb_m6Model[461].setRotationPoint(36F, -17F, 9F);

		sncb_m6Model[462].addShapeBox(0F, 0F, 0F, 8, 7, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F); // Box 213
		sncb_m6Model[462].setRotationPoint(36F, 1F, 9F);

		sncb_m6Model[463].addBox(0F, 0F, 0F, 8, 19, 1, 0F); // Box 213
		sncb_m6Model[463].setRotationPoint(-43F, -17F, -10F);

		sncb_m6Model[464].addBox(0F, 0F, 0F, 5, 14, 2, 0F); // Box 215
		sncb_m6Model[464].setRotationPoint(59F, -13F, 8F);

		sncb_m6Model[465].addBox(0F, 0F, 0F, 5, 14, 2, 0F); // Box 215
		sncb_m6Model[465].setRotationPoint(59F, -13F, -10F);

		sncb_m6Model[466].addShapeBox(0F, 0F, 0F, 3, 14, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 215
		sncb_m6Model[466].setRotationPoint(43F, -13F, 1F);

		sncb_m6Model[467].addBox(0F, 0F, 0F, 3, 14, 2, 0F); // Box 215
		sncb_m6Model[467].setRotationPoint(43F, -13F, -1F);

		sncb_m6Model[468].addShapeBox(0F, 0F, 0F, 3, 14, 2, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 215
		sncb_m6Model[468].setRotationPoint(43F, -13F, -3F);

		sncb_m6Model[469].addBox(0F, 0F, 0F, 7, 18, 1, 0F); // Box 213
		sncb_m6Model[469].setRotationPoint(36F, -16F, 2F);

		sncb_m6Model[470].addShapeBox(0F, 0F, 0F, 7, 6, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F); // Box 213
		sncb_m6Model[470].setRotationPoint(36F, 2F, 2F);

		sncb_m6Model[471].addBox(0F, 0F, 0F, 7, 13, 1, 0F); // Box 221
		sncb_m6Model[471].setRotationPoint(36F, -17F, -3F);

		sncb_m6Model[472].addShapeBox(0F, 0F, 0F, 8, 6, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F); // Box 213
		sncb_m6Model[472].setRotationPoint(-43F, 2F, -3F);

		sncb_m6Model[473].addBox(0F, 0F, 0F, 8, 19, 1, 0F); // Box 213
		sncb_m6Model[473].setRotationPoint(-43F, -17F, -3F);

		sncb_m6Model[474].addShapeBox(0F, 0F, 0F, 7, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F); // Box 221
		sncb_m6Model[474].setRotationPoint(-43F, -4F, 2F);

		sncb_m6Model[475].addBox(0F, 0F, 0F, 7, 13, 1, 0F); // Box 221
		sncb_m6Model[475].setRotationPoint(-43F, -17F, 2F);

		sncb_m6Model[476].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 215
		sncb_m6Model[476].setRotationPoint(-70F, 1F, -8F);

		sncb_m6Model[477].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 215
		sncb_m6Model[477].setRotationPoint(-70F, 1F, 7F);

		sncb_m6Model[478].addBox(0F, 0F, 0F, 1, 3, 3, 0F); // Box 215
		sncb_m6Model[478].setRotationPoint(-71F, 0F, 6F);

		sncb_m6Model[479].addBox(0F, 0F, 0F, 1, 3, 3, 0F); // Box 215
		sncb_m6Model[479].setRotationPoint(-71F, 0F, -9F);

		sncb_m6Model[480].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 215
		sncb_m6Model[480].setRotationPoint(69F, 1F, -8F);

		sncb_m6Model[481].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 215
		sncb_m6Model[481].setRotationPoint(69F, 1F, 7F);

		sncb_m6Model[482].addBox(0F, 0F, 0F, 1, 3, 3, 0F); // Box 215
		sncb_m6Model[482].setRotationPoint(70F, 0F, 6F);

		sncb_m6Model[483].addBox(0F, 0F, 0F, 1, 3, 3, 0F); // Box 215
		sncb_m6Model[483].setRotationPoint(70F, 0F, -9F);

		sncb_m6Model[484].addBox(0F, 0F, 0F, 4, 2, 2, 0F); // Box 215
		sncb_m6Model[484].setRotationPoint(-73F, 1F, -1F);

		sncb_m6Model[485].addBox(0F, 0F, 0F, 4, 2, 2, 0F); // Box 215
		sncb_m6Model[485].setRotationPoint(69F, 1F, -1F);

		sncb_m6Model[486].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 215
		sncb_m6Model[486].setRotationPoint(68F, 2F, -1F);

		sncb_m6Model[487].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 215
		sncb_m6Model[487].setRotationPoint(-69F, 2F, -1F);

		sncb_m6Model[488].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 84
		sncb_m6Model[488].setRotationPoint(24F, -9F, -10F);

		sncb_m6Model[489].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 81
		sncb_m6Model[489].setRotationPoint(24F, -9F, -3F);

		sncb_m6Model[490].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 84
		sncb_m6Model[490].setRotationPoint(17F, -9F, -10F);

		sncb_m6Model[491].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 81
		sncb_m6Model[491].setRotationPoint(17F, -9F, -3F);

		sncb_m6Model[492].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 84
		sncb_m6Model[492].setRotationPoint(8F, -9F, -10F);

		sncb_m6Model[493].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 81
		sncb_m6Model[493].setRotationPoint(8F, -9F, -3F);

		sncb_m6Model[494].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 84
		sncb_m6Model[494].setRotationPoint(1F, -9F, -10F);

		sncb_m6Model[495].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 81
		sncb_m6Model[495].setRotationPoint(1F, -9F, -3F);

		sncb_m6Model[496].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 84
		sncb_m6Model[496].setRotationPoint(-8F, -9F, -10F);

		sncb_m6Model[497].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 81
		sncb_m6Model[497].setRotationPoint(-8F, -9F, -3F);

		sncb_m6Model[498].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 84
		sncb_m6Model[498].setRotationPoint(-8F, -9F, -10F);

		sncb_m6Model[499].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 81
		sncb_m6Model[499].setRotationPoint(-8F, -9F, -3F);

		sncb_m6Model[500].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 84
		sncb_m6Model[500].setRotationPoint(-15F, -9F, -10F);

		sncb_m6Model[501].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 81
		sncb_m6Model[501].setRotationPoint(-15F, -9F, -3F);

		sncb_m6Model[502].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 84
		sncb_m6Model[502].setRotationPoint(-24F, -9F, -10F);

		sncb_m6Model[503].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 81
		sncb_m6Model[503].setRotationPoint(-24F, -9F, -3F);

		sncb_m6Model[504].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 84
		sncb_m6Model[504].setRotationPoint(-32F, -9F, -10F);

		sncb_m6Model[505].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 81
		sncb_m6Model[505].setRotationPoint(-32F, -9F, -3F);

		sncb_m6Model[506].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 215
		sncb_m6Model[506].setRotationPoint(-70F, 1F, -11F);

		sncb_m6Model[507].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 215
		sncb_m6Model[507].setRotationPoint(-70F, 1F, 10F);

		sncb_m6Model[508].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 215
		sncb_m6Model[508].setRotationPoint(69F, 1F, 10F);

		sncb_m6Model[509].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 215
		sncb_m6Model[509].setRotationPoint(69F, 1F, -11F);

		sncb_m6Model[510].addBox(0F, 0F, 0F, 6, 15, 1, 0F); // doorFrontLeft1
		sncb_m6Model[510].setRotationPoint(-59F, -14F, 10F);

		sncb_m6Model[511].addBox(0F, 0F, 0F, 6, 15, 1, 0F); // doorFrontLeft2
		sncb_m6Model[511].setRotationPoint(-53F, -14F, 10F);

		sncb_m6Model[512].addBox(0F, 0F, 0F, 6, 15, 1, 0F); // doorBackLeft1
		sncb_m6Model[512].setRotationPoint(47F, -14F, 10F);

		sncb_m6Model[513].addBox(0F, 0F, 0F, 6, 15, 1, 0F); // doorBackLeft2
		sncb_m6Model[513].setRotationPoint(53F, -14F, 10F);

		sncb_m6Model[514].addBox(0F, 0F, 0F, 6, 15, 1, 0F); // doorBackRight1
		sncb_m6Model[514].setRotationPoint(47F, -14F, -11F);

		sncb_m6Model[515].addBox(0F, 0F, 0F, 6, 15, 1, 0F); // doorBackRight2
		sncb_m6Model[515].setRotationPoint(53F, -14F, -11F);

		sncb_m6Model[516].addBox(0F, 0F, 0F, 6, 15, 1, 0F); // doorFrontRight1
		sncb_m6Model[516].setRotationPoint(-59F, -14F, -11F);

		sncb_m6Model[517].addBox(0F, 0F, 0F, 6, 15, 1, 0F); // doorFrontRight2
		sncb_m6Model[517].setRotationPoint(-53F, -14F, -11F);

		sncb_m6Model[518].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 170
		sncb_m6Model[518].setRotationPoint(29F, -12F, 9F);

		sncb_m6Model[519].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 171
		sncb_m6Model[519].setRotationPoint(29F, -10F, 5F);

		sncb_m6Model[520].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 174
		sncb_m6Model[520].setRotationPoint(33F, -14F, 5F);

		sncb_m6Model[521].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 175
		sncb_m6Model[521].setRotationPoint(34F, -16F, 5F);

		sncb_m6Model[522].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 176
		sncb_m6Model[522].setRotationPoint(33F, -10F, 6F);

		sncb_m6Model[523].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 166
		sncb_m6Model[523].setRotationPoint(30F, -9F, 6F);

		sncb_m6Model[524].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 170
		sncb_m6Model[524].setRotationPoint(29F, -12F, 4F);

		sncb_m6Model[525].addShapeBox(0F, 0F, 0F, 48, 12, 1, 0F, -36F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -36F, 0F, 0F, -36F, -9F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, -36F, -9F, 0F); // Box 31
		sncb_m6Model[525].setRotationPoint(-47F, -10F, -11F);

		sncb_m6Model[526].addShapeBox(0F, 0F, 0F, 48, 12, 1, 0F, -36F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -36F, 0F, 0F, -36F, -9F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, -36F, -9F, 0F); // Box 31
		sncb_m6Model[526].setRotationPoint(-42F, -10F, 10F);

		sncb_m6Model[527].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, -0.35F, 0F, -0.3F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F); // lamp
		sncb_m6Model[527].setRotationPoint(-70F, -7F, -9F);

		sncb_m6Model[528].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, -0.35F, 0F, -0.3F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // lamp
		sncb_m6Model[528].setRotationPoint(-70F, -8F, -8F);

		sncb_m6Model[529].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, -0.35F, 0F, -0.3F, -0.35F); // lamp
		sncb_m6Model[529].setRotationPoint(-70F, -7F, -8F);

		sncb_m6Model[530].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.3F, -0.35F, 0F, -0.3F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // lamp
		sncb_m6Model[530].setRotationPoint(-70F, -8F, -9F);

		sncb_m6Model[531].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, -0.35F, 0F, -0.3F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F); // lamp
		sncb_m6Model[531].setRotationPoint(-70F, -7F, 7F);

		sncb_m6Model[532].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, -0.35F, 0F, -0.3F, -0.35F); // lamp
		sncb_m6Model[532].setRotationPoint(-70F, -7F, 8F);

		sncb_m6Model[533].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.3F, -0.35F, 0F, -0.3F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // lamp
		sncb_m6Model[533].setRotationPoint(-70F, -8F, 7F);

		sncb_m6Model[534].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, -0.35F, 0F, -0.3F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // lamp
		sncb_m6Model[534].setRotationPoint(-70F, -8F, 8F);

		sncb_m6Model[535].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, -0.35F, 0F, -0.3F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F); // lamp
		sncb_m6Model[535].setRotationPoint(69F, -7F, -9F);

		sncb_m6Model[536].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, -0.35F, 0F, -0.3F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // lamp
		sncb_m6Model[536].setRotationPoint(69F, -8F, -8F);

		sncb_m6Model[537].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, -0.35F, 0F, -0.3F, -0.35F); // lamp
		sncb_m6Model[537].setRotationPoint(69F, -7F, -8F);

		sncb_m6Model[538].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, -0.35F, 0F, -0.3F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F); // lamp
		sncb_m6Model[538].setRotationPoint(69F, -7F, 7F);

		sncb_m6Model[539].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, -0.35F, 0F, -0.3F, -0.35F); // lamp
		sncb_m6Model[539].setRotationPoint(69F, -7F, 8F);

		sncb_m6Model[540].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.3F, -0.35F, 0F, -0.3F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // lamp
		sncb_m6Model[540].setRotationPoint(69F, -8F, 7F);

		sncb_m6Model[541].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, -0.35F, 0F, -0.3F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // lamp
		sncb_m6Model[541].setRotationPoint(69F, -8F, 8F);

		sncb_m6Model[542].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.3F, -0.35F, 0F, -0.3F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // lamp
		sncb_m6Model[542].setRotationPoint(69F, -8F, -9F);


	}
	ModelSNCB_M6_Trucks theTrucks = new ModelSNCB_M6_Trucks();


	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		for (int i = 0; i < 543; i++) {
			if (sncb_m6Model[i].boxName != null && sncb_m6Model[i].boxName.contains("lamp") ) {
				Minecraft.getMinecraft().entityRenderer.disableLightmap(1D);
				sncb_m6Model[i].render(f5);
				Minecraft.getMinecraft().entityRenderer.enableLightmap(1D);
			}else if (sncb_m6Model[i].boxName != null && sncb_m6Model[i].boxName.contains("cull")) {
				GL11.glDisable(GL11.GL_CULL_FACE);
				sncb_m6Model[i].render(f5);
				GL11.glEnable(GL11.GL_CULL_FACE);
			} else {
				sncb_m6Model[i].render(f5);
			}
		}

		Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/sncb_m6_trucks.png"));
		GL11.glPushMatrix();
		GL11.glScalef(1f,1f,1f);
		GL11.glTranslatef(-3.75f, 0f,-.05f);
		theTrucks.render(entity, f, f1, f2, f3, f4, f5);

		GL11.glTranslatef(6.63f, 0f,0f);
		theTrucks.render(entity, f, f1, f2, f3, f4, f5);
		GL11.glPopMatrix();
		GL11.glColor4f(1.0f, 1.0f, 1.0f, 0.5f);
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
	{
	}

	public ModelRendererTurbo sncb_m6Model[];
}