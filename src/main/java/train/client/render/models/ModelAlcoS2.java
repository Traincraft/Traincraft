//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2021 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 29.04.2020 - 23:08:36
// Last changed on: 29.04.2020 - 23:08:36

package train.client.render.models; //Path where the model is located

import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import tmt.ModelConverter;
import tmt.ModelRendererTurbo;
import tmt.Tessellator;
import train.common.api.AbstractTrains;
import train.common.library.Info;

public class ModelAlcoS2 extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelAlcoS2() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[232];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 52
		bodyModel[2] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 2
		bodyModel[3] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 50
		bodyModel[4] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 175
		bodyModel[5] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 5
		bodyModel[6] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 6
		bodyModel[7] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 7
		bodyModel[8] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 8
		bodyModel[9] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 9
		bodyModel[10] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 10
		bodyModel[11] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 12
		bodyModel[12] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 13
		bodyModel[13] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 14
		bodyModel[14] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 15
		bodyModel[15] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 17
		bodyModel[16] = new ModelRendererTurbo(this, 337, 9, textureX, textureY); // Box 18
		bodyModel[17] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 19
		bodyModel[18] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 21
		bodyModel[19] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 22
		bodyModel[20] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 23
		bodyModel[21] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 24
		bodyModel[22] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 27
		bodyModel[23] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Box 31
		bodyModel[24] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 32
		bodyModel[25] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 33
		bodyModel[26] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 34
		bodyModel[27] = new ModelRendererTurbo(this, 81, 9, textureX, textureY); // Box 36
		bodyModel[28] = new ModelRendererTurbo(this, 185, 9, textureX, textureY); // Box 37
		bodyModel[29] = new ModelRendererTurbo(this, 449, 17, textureX, textureY); // Box 38
		bodyModel[30] = new ModelRendererTurbo(this, 97, 9, textureX, textureY); // Box 39
		bodyModel[31] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Box 41
		bodyModel[32] = new ModelRendererTurbo(this, 9, 25, textureX, textureY); // Box 42
		bodyModel[33] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 43
		bodyModel[34] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 44
		bodyModel[35] = new ModelRendererTurbo(this, 185, 25, textureX, textureY); // Box 45
		bodyModel[36] = new ModelRendererTurbo(this, 273, 25, textureX, textureY); // Box 46
		bodyModel[37] = new ModelRendererTurbo(this, 353, 25, textureX, textureY); // Box 47
		bodyModel[38] = new ModelRendererTurbo(this, 473, 25, textureX, textureY); // Box 48
		bodyModel[39] = new ModelRendererTurbo(this, 281, 33, textureX, textureY); // Box 49
		bodyModel[40] = new ModelRendererTurbo(this, 113, 9, textureX, textureY); // Box 129
		bodyModel[41] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 130
		bodyModel[42] = new ModelRendererTurbo(this, 313, 33, textureX, textureY); // Box 132
		bodyModel[43] = new ModelRendererTurbo(this, 353, 33, textureX, textureY); // Box 135
		bodyModel[44] = new ModelRendererTurbo(this, 393, 33, textureX, textureY); // Box 57
		bodyModel[45] = new ModelRendererTurbo(this, 425, 33, textureX, textureY); // Box 58
		bodyModel[46] = new ModelRendererTurbo(this, 49, 41, textureX, textureY); // Box 59
		bodyModel[47] = new ModelRendererTurbo(this, 457, 33, textureX, textureY); // Box 315 door swing right
		bodyModel[48] = new ModelRendererTurbo(this, 177, 41, textureX, textureY); // Box 61
		bodyModel[49] = new ModelRendererTurbo(this, 201, 9, textureX, textureY); // Box 62
		bodyModel[50] = new ModelRendererTurbo(this, 289, 33, textureX, textureY); // Box 63
		bodyModel[51] = new ModelRendererTurbo(this, 249, 41, textureX, textureY); // Box 64
		bodyModel[52] = new ModelRendererTurbo(this, 329, 41, textureX, textureY); // Box 65
		bodyModel[53] = new ModelRendererTurbo(this, 65, 41, textureX, textureY); // Box 66
		bodyModel[54] = new ModelRendererTurbo(this, 497, 17, textureX, textureY); // Box 67
		bodyModel[55] = new ModelRendererTurbo(this, 449, 9, textureX, textureY); // Box 68
		bodyModel[56] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 69
		bodyModel[57] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 71
		bodyModel[58] = new ModelRendererTurbo(this, 489, 9, textureX, textureY, "lamp"); // Box 78 lamp headlight r
		bodyModel[59] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 79
		bodyModel[60] = new ModelRendererTurbo(this, 449, 33, textureX, textureY); // Box 80
		bodyModel[61] = new ModelRendererTurbo(this, 145, 9, textureX, textureY); // Box 81
		bodyModel[62] = new ModelRendererTurbo(this, 161, 9, textureX, textureY); // Box 82
		bodyModel[63] = new ModelRendererTurbo(this, 465, 25, textureX, textureY); // Box 83
		bodyModel[64] = new ModelRendererTurbo(this, 337, 9, textureX, textureY); // Box 84
		bodyModel[65] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 85
		bodyModel[66] = new ModelRendererTurbo(this, 505, 33, textureX, textureY); // Box 86
		bodyModel[67] = new ModelRendererTurbo(this, 25, 41, textureX, textureY); // Box 87
		bodyModel[68] = new ModelRendererTurbo(this, 25, 41, textureX, textureY); // Box 88
		bodyModel[69] = new ModelRendererTurbo(this, 41, 41, textureX, textureY); // Box 89
		bodyModel[70] = new ModelRendererTurbo(this, 433, 25, textureX, textureY, "lamp"); // Box 90 lamp headlight f
		bodyModel[71] = new ModelRendererTurbo(this, 329, 41, textureX, textureY); // Box 92
		bodyModel[72] = new ModelRendererTurbo(this, 385, 41, textureX, textureY); // Box 93
		bodyModel[73] = new ModelRendererTurbo(this, 225, 41, textureX, textureY); // Box 94
		bodyModel[74] = new ModelRendererTurbo(this, 361, 41, textureX, textureY); // Box 95
		bodyModel[75] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 96
		bodyModel[76] = new ModelRendererTurbo(this, 137, 17, textureX, textureY); // Box 97
		bodyModel[77] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 98
		bodyModel[78] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Box 99
		bodyModel[79] = new ModelRendererTurbo(this, 265, 41, textureX, textureY); // Box 100
		bodyModel[80] = new ModelRendererTurbo(this, 313, 41, textureX, textureY); // Box 101 stack
		bodyModel[81] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 102
		bodyModel[82] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 38
		bodyModel[83] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 104
		bodyModel[84] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Box 105
		bodyModel[85] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 106
		bodyModel[86] = new ModelRendererTurbo(this, 81, 65, textureX, textureY); // Box 107
		bodyModel[87] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Box 108
		bodyModel[88] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 109
		bodyModel[89] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 110
		bodyModel[90] = new ModelRendererTurbo(this, 97, 17, textureX, textureY); // Box 111
		bodyModel[91] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 112
		bodyModel[92] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 113
		bodyModel[93] = new ModelRendererTurbo(this, 193, 41, textureX, textureY); // Box 114
		bodyModel[94] = new ModelRendererTurbo(this, 489, 33, textureX, textureY); // Box 115
		bodyModel[95] = new ModelRendererTurbo(this, 385, 41, textureX, textureY); // Box 116
		bodyModel[96] = new ModelRendererTurbo(this, 417, 41, textureX, textureY); // Box 117
		bodyModel[97] = new ModelRendererTurbo(this, 401, 41, textureX, textureY); // Box 118
		bodyModel[98] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 119
		bodyModel[99] = new ModelRendererTurbo(this, 433, 41, textureX, textureY); // Box 120
		bodyModel[100] = new ModelRendererTurbo(this, 473, 41, textureX, textureY); // Box 121
		bodyModel[101] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 122
		bodyModel[102] = new ModelRendererTurbo(this, 81, 9, textureX, textureY); // Box 123
		bodyModel[103] = new ModelRendererTurbo(this, 177, 9, textureX, textureY); // Box 124
		bodyModel[104] = new ModelRendererTurbo(this, 449, 9, textureX, textureY); // Box 125
		bodyModel[105] = new ModelRendererTurbo(this, 89, 9, textureX, textureY); // Box 126
		bodyModel[106] = new ModelRendererTurbo(this, 449, 41, textureX, textureY); // Box 127
		bodyModel[107] = new ModelRendererTurbo(this, 97, 9, textureX, textureY); // Box 128
		bodyModel[108] = new ModelRendererTurbo(this, 17, 49, textureX, textureY); // Box 129
		bodyModel[109] = new ModelRendererTurbo(this, 25, 49, textureX, textureY); // Box 130
		bodyModel[110] = new ModelRendererTurbo(this, 433, 41, textureX, textureY); // Box 131
		bodyModel[111] = new ModelRendererTurbo(this, 105, 9, textureX, textureY); // Box 132
		bodyModel[112] = new ModelRendererTurbo(this, 49, 49, textureX, textureY); // Box 133
		bodyModel[113] = new ModelRendererTurbo(this, 65, 49, textureX, textureY); // Box 134
		bodyModel[114] = new ModelRendererTurbo(this, 145, 9, textureX, textureY); // Box 135
		bodyModel[115] = new ModelRendererTurbo(this, 273, 49, textureX, textureY); // Box 136
		bodyModel[116] = new ModelRendererTurbo(this, 161, 9, textureX, textureY); // Box 137
		bodyModel[117] = new ModelRendererTurbo(this, 337, 9, textureX, textureY); // Box 138
		bodyModel[118] = new ModelRendererTurbo(this, 505, 9, textureX, textureY); // Box 139
		bodyModel[119] = new ModelRendererTurbo(this, 377, 49, textureX, textureY); // Box 140
		bodyModel[120] = new ModelRendererTurbo(this, 193, 9, textureX, textureY); // Box 114
		bodyModel[121] = new ModelRendererTurbo(this, 497, 9, textureX, textureY); // Box 74
		bodyModel[122] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 78
		bodyModel[123] = new ModelRendererTurbo(this, 417, 49, textureX, textureY); // Box 113
		bodyModel[124] = new ModelRendererTurbo(this, 313, 33, textureX, textureY); // Box 114
		bodyModel[125] = new ModelRendererTurbo(this, 345, 33, textureX, textureY); // Box 115
		bodyModel[126] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 116
		bodyModel[127] = new ModelRendererTurbo(this, 249, 41, textureX, textureY); // Box 117
		bodyModel[128] = new ModelRendererTurbo(this, 441, 25, textureX, textureY, "lamp"); // Box 149 glow
		bodyModel[129] = new ModelRendererTurbo(this, 505, 33, textureX, textureY, "lamp"); // Box 150 glow
		bodyModel[130] = new ModelRendererTurbo(this, 105, 57, textureX, textureY); // Box 1
		bodyModel[131] = new ModelRendererTurbo(this, 417, 41, textureX, textureY); // Box 2
		bodyModel[132] = new ModelRendererTurbo(this, 497, 49, textureX, textureY); // Box 3
		bodyModel[133] = new ModelRendererTurbo(this, 129, 57, textureX, textureY); // Box 5
		bodyModel[134] = new ModelRendererTurbo(this, 161, 57, textureX, textureY); // Box 6
		bodyModel[135] = new ModelRendererTurbo(this, 9, 57, textureX, textureY); // Box 167
		bodyModel[136] = new ModelRendererTurbo(this, 273, 57, textureX, textureY); // Box 168
		bodyModel[137] = new ModelRendererTurbo(this, 361, 57, textureX, textureY); // Box 169
		bodyModel[138] = new ModelRendererTurbo(this, 417, 57, textureX, textureY); // Box 170
		bodyModel[139] = new ModelRendererTurbo(this, 425, 57, textureX, textureY); // Box 171
		bodyModel[140] = new ModelRendererTurbo(this, 329, 41, textureX, textureY); // Box 172
		bodyModel[141] = new ModelRendererTurbo(this, 449, 57, textureX, textureY); // Box 173
		bodyModel[142] = new ModelRendererTurbo(this, 465, 57, textureX, textureY); // Box 174
		bodyModel[143] = new ModelRendererTurbo(this, 481, 57, textureX, textureY); // Box 175
		bodyModel[144] = new ModelRendererTurbo(this, 169, 65, textureX, textureY); // Box 176
		bodyModel[145] = new ModelRendererTurbo(this, 345, 41, textureX, textureY); // Box 177
		bodyModel[146] = new ModelRendererTurbo(this, 249, 65, textureX, textureY); // Box 67
		bodyModel[147] = new ModelRendererTurbo(this, 273, 65, textureX, textureY); // Box 70
		bodyModel[148] = new ModelRendererTurbo(this, 377, 65, textureX, textureY); // Box 71
		bodyModel[149] = new ModelRendererTurbo(this, 385, 41, textureX, textureY, "lamp"); // Box 78 lantern cab light
		bodyModel[150] = new ModelRendererTurbo(this, 25, 49, textureX, textureY, "lamp"); // Box 211 lamp ditchlight f1
		bodyModel[151] = new ModelRendererTurbo(this, 33, 49, textureX, textureY); // Box 212
		bodyModel[152] = new ModelRendererTurbo(this, 65, 49, textureX, textureY); // Box 213
		bodyModel[153] = new ModelRendererTurbo(this, 73, 49, textureX, textureY, "lamp"); // Box 214 lamp ditchlight f1
		bodyModel[154] = new ModelRendererTurbo(this, 497, 49, textureX, textureY, "lamp"); // Box 160 lamp ditchlight r1
		bodyModel[155] = new ModelRendererTurbo(this, 505, 49, textureX, textureY); // Box 161
		bodyModel[156] = new ModelRendererTurbo(this, 153, 57, textureX, textureY); // Box 162
		bodyModel[157] = new ModelRendererTurbo(this, 161, 57, textureX, textureY, "lamp"); // Box 163 lamp ditchlight r1
		bodyModel[158] = new ModelRendererTurbo(this, 481, 65, textureX, textureY); // Box 191
		bodyModel[159] = new ModelRendererTurbo(this, 449, 65, textureX, textureY); // Box 192
		bodyModel[160] = new ModelRendererTurbo(this, 185, 9, textureX, textureY); // Box 193
		bodyModel[161] = new ModelRendererTurbo(this, 177, 9, textureX, textureY); // Box 197
		bodyModel[162] = new ModelRendererTurbo(this, 201, 9, textureX, textureY); // Box 198
		bodyModel[163] = new ModelRendererTurbo(this, 489, 65, textureX, textureY); // Box 199
		bodyModel[164] = new ModelRendererTurbo(this, 505, 65, textureX, textureY); // Box 200
		bodyModel[165] = new ModelRendererTurbo(this, 489, 9, textureX, textureY); // Box 201
		bodyModel[166] = new ModelRendererTurbo(this, 161, 73, textureX, textureY); // Box 202
		bodyModel[167] = new ModelRendererTurbo(this, 169, 73, textureX, textureY); // Box 203
		bodyModel[168] = new ModelRendererTurbo(this, 353, 33, textureX, textureY); // Box 164
		bodyModel[169] = new ModelRendererTurbo(this, 393, 33, textureX, textureY); // Box 165
		bodyModel[170] = new ModelRendererTurbo(this, 441, 41, textureX, textureY); // Box 166
		bodyModel[171] = new ModelRendererTurbo(this, 473, 41, textureX, textureY); // Box 207
		bodyModel[172] = new ModelRendererTurbo(this, 481, 41, textureX, textureY); // Box 208
		bodyModel[173] = new ModelRendererTurbo(this, 49, 49, textureX, textureY); // Box 209
		bodyModel[174] = new ModelRendererTurbo(this, 57, 49, textureX, textureY); // Box 211
		bodyModel[175] = new ModelRendererTurbo(this, 273, 49, textureX, textureY); // Box 212
		bodyModel[176] = new ModelRendererTurbo(this, 281, 49, textureX, textureY, "lamp"); // Box 399 commander beacon
		bodyModel[177] = new ModelRendererTurbo(this, 425, 49, textureX, textureY); // Box 400
		bodyModel[178] = new ModelRendererTurbo(this, 137, 17, textureX, textureY); // Box 215
		bodyModel[179] = new ModelRendererTurbo(this, 177, 73, textureX, textureY); // Box 216
		bodyModel[180] = new ModelRendererTurbo(this, 185, 73, textureX, textureY); // Box 217
		bodyModel[181] = new ModelRendererTurbo(this, 473, 49, textureX, textureY); // box64
		bodyModel[182] = new ModelRendererTurbo(this, 25, 57, textureX, textureY); // box65
		bodyModel[183] = new ModelRendererTurbo(this, 193, 73, textureX, textureY); // Box 220 atsf stack
		bodyModel[184] = new ModelRendererTurbo(this, 201, 68, textureX, textureY, "cull"); // Box 221 cull
		bodyModel[185] = new ModelRendererTurbo(this, 41, 57, textureX, textureY); // Box 222
		bodyModel[186] = new ModelRendererTurbo(this, 449, 17, textureX, textureY); // Box 223
		bodyModel[187] = new ModelRendererTurbo(this, 185, 33, textureX, textureY); // Box 224
		bodyModel[188] = new ModelRendererTurbo(this, 273, 33, textureX, textureY); // Box 225
		bodyModel[189] = new ModelRendererTurbo(this, 321, 41, textureX, textureY); // Box 226
		bodyModel[190] = new ModelRendererTurbo(this, 169, 57, textureX, textureY); // Box 227
		bodyModel[191] = new ModelRendererTurbo(this, 489, 49, textureX, textureY); // Box 228
		bodyModel[192] = new ModelRendererTurbo(this, 185, 57, textureX, textureY); // Box 229
		bodyModel[193] = new ModelRendererTurbo(this, 57, 57, textureX, textureY); // Box 230
		bodyModel[194] = new ModelRendererTurbo(this, 225, 57, textureX, textureY); // Box 231
		bodyModel[195] = new ModelRendererTurbo(this, 489, 41, textureX, textureY); // Box 232
		bodyModel[196] = new ModelRendererTurbo(this, 241, 57, textureX, textureY); // Box 233
		bodyModel[197] = new ModelRendererTurbo(this, 233, 73, textureX, textureY, "lamp"); // Box 234 glow numberboard
		bodyModel[198] = new ModelRendererTurbo(this, 281, 73, textureX, textureY, "lamp"); // Box 235 glow numberboard
		bodyModel[199] = new ModelRendererTurbo(this, 169, 57, textureX, textureY); // Box 236
		bodyModel[200] = new ModelRendererTurbo(this, 489, 49, textureX, textureY); // Box 237
		bodyModel[201] = new ModelRendererTurbo(this, 185, 57, textureX, textureY); // Box 238
		bodyModel[202] = new ModelRendererTurbo(this, 57, 57, textureX, textureY); // Box 239
		bodyModel[203] = new ModelRendererTurbo(this, 225, 57, textureX, textureY); // Box 240
		bodyModel[204] = new ModelRendererTurbo(this, 241, 57, textureX, textureY); // Box 241
		bodyModel[205] = new ModelRendererTurbo(this, 489, 41, textureX, textureY); // Box 242
		bodyModel[206] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 243
		bodyModel[207] = new ModelRendererTurbo(this, 161, 9, textureX, textureY); // Box 244
		bodyModel[208] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 245
		bodyModel[209] = new ModelRendererTurbo(this, 337, 9, textureX, textureY); // Box 246
		bodyModel[210] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 247
		bodyModel[211] = new ModelRendererTurbo(this, 505, 9, textureX, textureY); // Box 248
		bodyModel[212] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 249
		bodyModel[213] = new ModelRendererTurbo(this, 195, 4, textureX, textureY); // Box 250
		bodyModel[214] = new ModelRendererTurbo(this, 195, 4, textureX, textureY); // Box 251
		bodyModel[215] = new ModelRendererTurbo(this, 452, 44, textureX, textureY); // Box 114
		bodyModel[216] = new ModelRendererTurbo(this, 505, 46, textureX, textureY); // Box 74
		bodyModel[217] = new ModelRendererTurbo(this, 345, 46, textureX, textureY); // Box 78
		bodyModel[218] = new ModelRendererTurbo(this, 153, 11, textureX, textureY); // Box 875
		bodyModel[219] = new ModelRendererTurbo(this, 504, 14, textureX, textureY); // Box 876
		bodyModel[220] = new ModelRendererTurbo(this, 429, 67, textureX, textureY); // Box 877
		bodyModel[221] = new ModelRendererTurbo(this, 322, 45, textureX, textureY); // Box 221
		bodyModel[222] = new ModelRendererTurbo(this, 322, 45, textureX, textureY); // Box 222
		bodyModel[223] = new ModelRendererTurbo(this, 51, 9, textureX, textureY); // Box 105
		bodyModel[224] = new ModelRendererTurbo(this, 25, 74, textureX, textureY); // Box 99
		bodyModel[225] = new ModelRendererTurbo(this, 200, 75, textureX, textureY, "cull"); // Box 221 cull
		bodyModel[226] = new ModelRendererTurbo(this, 378, 67, textureX, textureY); // Box 140
		bodyModel[227] = new ModelRendererTurbo(this, 16, 78, textureX, textureY); // Box 364 prime base
		bodyModel[228] = new ModelRendererTurbo(this, 7, 78, textureX, textureY, "lamp"); // Box 6 PRIME1-1
		bodyModel[229] = new ModelRendererTurbo(this, 7, 78, textureX, textureY, "lamp"); // Box 7 PRIME1-3
		bodyModel[230] = new ModelRendererTurbo(this, 7, 78, textureX, textureY, "lamp"); // Box 8 PRIME1-2
		bodyModel[231] = new ModelRendererTurbo(this, 7, 78, textureX, textureY, "lamp"); // Box 9 PRIME1-4

		bodyModel[0].addBox(0F, 0F, 0F, 52, 2, 4, 0F); // Box 0
		bodyModel[0].setRotationPoint(-26F, 0F, -11F);

		bodyModel[1].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 52
		bodyModel[1].setRotationPoint(-33F, 3F, -1.5F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[2].setRotationPoint(-30F, 2.5F, -2F);

		bodyModel[3].addBox(0F, 0F, 0F, 3, 0, 7, 0F); // Box 50
		bodyModel[3].setRotationPoint(-32F, 9F, -11F);

		bodyModel[4].addBox(0F, 0F, 0F, 3, 0, 7, 0F); // Box 175
		bodyModel[4].setRotationPoint(-32F, 9F, 4F);

		bodyModel[5].addBox(0F, 0F, 0F, 0, 5, 14, 0F); // Box 5
		bodyModel[5].setRotationPoint(-29F, 2F, -7F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 0, 5, 3, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[6].setRotationPoint(-29F, 2F, -10F);

		bodyModel[7].addBox(0F, 0F, 0F, 0, 1, 22, 0F); // Box 7
		bodyModel[7].setRotationPoint(-29F, 8F, -11F);

		bodyModel[8].addBox(0F, 0F, 0F, 0, 1, 4, 0F); // Box 8
		bodyModel[8].setRotationPoint(-26F, 8F, -11F);

		bodyModel[9].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 9
		bodyModel[9].setRotationPoint(-29F, 9F, -12F);

		bodyModel[10].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 10
		bodyModel[10].setRotationPoint(-29F, 7F, -10F);

		bodyModel[11].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 12
		bodyModel[11].setRotationPoint(-29F, 4.5F, -9F);

		bodyModel[12].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 13
		bodyModel[12].setRotationPoint(-29F, 2F, -8F);

		bodyModel[13].addBox(0F, 0F, 0F, 58, 2, 14, 0F); // Box 14
		bodyModel[13].setRotationPoint(-29F, 0F, -7F);

		bodyModel[14].addBox(0F, 0F, 0F, 52, 2, 4, 0F); // Box 15
		bodyModel[14].setRotationPoint(-26F, 0F, 7F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 5, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 17
		bodyModel[15].setRotationPoint(-29F, 2F, -3F);

		bodyModel[16].addBox(0F, 0F, 0F, 48, 1, 10, 0F); // Box 18
		bodyModel[16].setRotationPoint(-24F, 2F, -5F);

		bodyModel[17].addBox(0F, 0F, 0F, 0, 5, 14, 0F); // Box 19
		bodyModel[17].setRotationPoint(29F, 2F, -7F);

		bodyModel[18].addBox(0F, 0F, 0F, 3, 0, 7, 0F); // Box 21
		bodyModel[18].setRotationPoint(29F, 9F, -11F);

		bodyModel[19].addBox(0F, 0F, 0F, 3, 0, 7, 0F); // Box 22
		bodyModel[19].setRotationPoint(29F, 9F, 4F);

		bodyModel[20].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 23
		bodyModel[20].setRotationPoint(30F, 3F, -1.5F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		bodyModel[21].setRotationPoint(29F, 2.5F, -2F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 5, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 27
		bodyModel[22].setRotationPoint(24F, 2F, -3F);

		bodyModel[23].addBox(0F, 0F, 0F, 8, 6, 22, 0F); // Box 31
		bodyModel[23].setRotationPoint(-4F, 2F, -11F);

		bodyModel[24].addBox(0F, 0F, 0F, 0, 2, 16, 0F); // Box 32
		bodyModel[24].setRotationPoint(-29F, 0F, -8F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 0, 5, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
		bodyModel[25].setRotationPoint(-29F, 2F, 7F);

		bodyModel[26].addBox(0F, 0F, 0F, 1, 15, 8, 0F); // Box 34
		bodyModel[26].setRotationPoint(-25F, -15F, -4F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 1, 15, 3, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 36
		bodyModel[27].setRotationPoint(-25F, -15F, -7F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 1, 15, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 37
		bodyModel[28].setRotationPoint(-25F, -15F, 4F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[29].setRotationPoint(-25F, -16F, -4F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 39
		bodyModel[30].setRotationPoint(-25F, -16F, -7F);

		bodyModel[31].addBox(0F, 0F, 0F, 37, 15, 14, 0F); // Box 41
		bodyModel[31].setRotationPoint(-24F, -15F, -7F);

		bodyModel[32].addBox(0F, 0F, 0F, 0, 2, 16, 0F); // Box 42
		bodyModel[32].setRotationPoint(29F, 0F, -8F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 0, 5, 3, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
		bodyModel[33].setRotationPoint(29F, 2F, -10F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 0, 5, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 44
		bodyModel[34].setRotationPoint(29F, 2F, 7F);

		bodyModel[35].addBox(0F, 0F, 0F, 37, 1, 10, 0F); // Box 45
		bodyModel[35].setRotationPoint(-24F, -16F, -5F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 37, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 46
		bodyModel[36].setRotationPoint(-24F, -16F, 5F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 37, 1, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 47
		bodyModel[37].setRotationPoint(-24F, -16F, -7F);

		bodyModel[38].addBox(0F, 0F, 0F, 11, 14, 1, 0F); // Box 48
		bodyModel[38].setRotationPoint(14F, -18F, -11F);

		bodyModel[39].addBox(0F, 0F, 0F, 11, 14, 1, 0F); // Box 49
		bodyModel[39].setRotationPoint(14F, -18F, 10F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 13, 1, 2, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 129
		bodyModel[40].setRotationPoint(12F, -20F, 8F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 13, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 130
		bodyModel[41].setRotationPoint(12F, -19F, 10F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 13, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F); // Box 132
		bodyModel[42].setRotationPoint(12F, -22F, 3F);

		bodyModel[43].addBox(0F, 0F, 0F, 13, 1, 6, 0F); // Box 135
		bodyModel[43].setRotationPoint(12F, -22F, -3F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 13, 1, 5, 0F,0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 57
		bodyModel[44].setRotationPoint(12F, -22F, -8F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 13, 1, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 58
		bodyModel[45].setRotationPoint(12F, -20F, -10F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 13, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 59
		bodyModel[46].setRotationPoint(12F, -19F, -11F);

		bodyModel[47].addBox(-0.5F, 0F, -0.5F, 1, 14, 4, 0F); // Box 315 door swing right
		bodyModel[47].setRotationPoint(13.5F, -18F, -10.5F);

		bodyModel[48].addBox(0F, 0F, 0F, 12, 4, 22, 0F); // Box 61
		bodyModel[48].setRotationPoint(13F, -4F, -11F);

		bodyModel[49].addBox(0F, 0F, 0F, 2, 0, 4, 0F); // Box 62
		bodyModel[49].setRotationPoint(25F, -2F, -2F);

		bodyModel[50].addBox(0F, 0F, 0F, 1, 14, 18, 0F); // Box 63
		bodyModel[50].setRotationPoint(13F, -18F, -7F);

		bodyModel[51].addBox(0F, 0F, 0F, 1, 14, 8, 0F); // Box 64
		bodyModel[51].setRotationPoint(24F, -18F, -10F);

		bodyModel[52].addBox(0F, 0F, 0F, 1, 14, 8, 0F); // Box 65
		bodyModel[52].setRotationPoint(24F, -18F, 2F);

		bodyModel[53].addBox(0F, 0F, 0F, 1, 1, 16, 0F); // Box 66
		bodyModel[53].setRotationPoint(24F, -19F, -8F);

		bodyModel[54].addBox(0F, 0F, 0F, 1, 2, 6, 0F); // Box 67
		bodyModel[54].setRotationPoint(24F, -21F, -3F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 68
		bodyModel[55].setRotationPoint(24F, -20.5F, -8F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 69
		bodyModel[56].setRotationPoint(24F, -19F, -10F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 71
		bodyModel[57].setRotationPoint(24F, -19F, 8F);

		bodyModel[58].addBox(0F, 0F, 0F, 1, 3, 3, 0F); // Box 78 lamp headlight r
		bodyModel[58].setRotationPoint(24.5F, -21F, -1.5F);

		bodyModel[59].addShapeBox(-0.5F, 0F, -0.5F, 1, 14, 4, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 79
		bodyModel[59].setRotationPoint(24.5F, -18F, -1.5F);

		bodyModel[60].addBox(0F, 0F, 0F, 0, 1, 20, 0F); // Box 80
		bodyModel[60].setRotationPoint(-29F, 7F, -10F);

		bodyModel[61].addBox(0F, 0F, 0F, 0, 6, 3, 0F); // Box 81
		bodyModel[61].setRotationPoint(-26F, 2F, -10F);

		bodyModel[62].addBox(0F, 0F, 0F, 0, 1, 4, 0F); // Box 82
		bodyModel[62].setRotationPoint(-26F, 8F, 7F);

		bodyModel[63].addBox(0F, 0F, 0F, 0, 6, 3, 0F); // Box 83
		bodyModel[63].setRotationPoint(-26F, 2F, 7F);

		bodyModel[64].addBox(0F, 0F, 0F, 0, 1, 4, 0F); // Box 84
		bodyModel[64].setRotationPoint(26F, 8F, 7F);

		bodyModel[65].addBox(0F, 0F, 0F, 0, 1, 4, 0F); // Box 85
		bodyModel[65].setRotationPoint(26F, 8F, -11F);

		bodyModel[66].addBox(0F, 0F, 0F, 0, 6, 3, 0F); // Box 86
		bodyModel[66].setRotationPoint(26F, 2F, -10F);

		bodyModel[67].addBox(0F, 0F, 0F, 0, 1, 22, 0F); // Box 87
		bodyModel[67].setRotationPoint(29F, 8F, -11F);

		bodyModel[68].addBox(0F, 0F, 0F, 0, 1, 20, 0F); // Box 88
		bodyModel[68].setRotationPoint(29F, 7F, -10F);

		bodyModel[69].addBox(0F, 0F, 0F, 0, 6, 3, 0F); // Box 89
		bodyModel[69].setRotationPoint(26F, 2F, 7F);

		bodyModel[70].addBox(0F, 0F, 0F, 1, 3, 3, 0F); // Box 90 lamp headlight f
		bodyModel[70].setRotationPoint(-25.5F, -14F, -1.5F);

		bodyModel[71].addBox(0F, 0F, 0F, 2, 2, 23, 0F); // Box 92
		bodyModel[71].setRotationPoint(-15.5F, 1F, -11.5F);

		bodyModel[72].addBox(0F, 0F, 0F, 2, 2, 23, 0F); // Box 93
		bodyModel[72].setRotationPoint(13.5F, 1F, -11.5F);

		bodyModel[73].addBox(0F, 0F, 0F, 10, 10, 1, 0F); // Box 94
		bodyModel[73].setRotationPoint(-22F, -12F, -7.5F);

		bodyModel[74].addBox(0F, 0F, 0F, 10, 10, 1, 0F); // Box 95
		bodyModel[74].setRotationPoint(-22F, -12F, 6.5F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 96
		bodyModel[75].setRotationPoint(-25F, -16F, -5F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -1F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 97
		bodyModel[76].setRotationPoint(-25F, -16F, 4F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 98
		bodyModel[77].setRotationPoint(-25F, -16F, 4F);

		bodyModel[78].addBox(0F, 0F, 0F, 4, 1, 3, 0F); // Box 99
		bodyModel[78].setRotationPoint(3F, -17F, -4F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F,-1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 100
		bodyModel[79].setRotationPoint(3F, -18F, -4F);

		bodyModel[80].addBox(0F, 0F, 0F, 2, 3, 2, 0F); // Box 101 stack
		bodyModel[80].setRotationPoint(4F, -21F, -3.5F);

		bodyModel[81].addBox(0F, 0F, 0F, 38, 8, 0, 0F); // Box 102
		bodyModel[81].setRotationPoint(-25F, -8F, -11F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 2, 2, 0, 0F,-2F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[82].setRotationPoint(-27F, -8F, -11F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 2, 2, 0, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -1F, 0F); // Box 104
		bodyModel[83].setRotationPoint(10F, -9F, -11F);

		bodyModel[84].addBox(0F, 0F, 0F, 1, 7, 0, 0F); // Box 105
		bodyModel[84].setRotationPoint(11F, -16F, -11F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 2, 2, 0, 0F,-2F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 106
		bodyModel[85].setRotationPoint(11F, -18F, -11F);

		bodyModel[86].addBox(0F, 0F, 0F, 38, 8, 0, 0F); // Box 107
		bodyModel[86].setRotationPoint(-25F, -8F, 11F);

		bodyModel[87].addBox(0F, 0F, 0F, 1, 12, 0, 0F); // Box 108
		bodyModel[87].setRotationPoint(-27F, -6F, -11F);

		bodyModel[88].addBox(0F, 0F, 0F, 0, 1, 1, 0F); // Box 109
		bodyModel[88].setRotationPoint(-26F, 5F, -11F);

		bodyModel[89].addBox(0F, 0F, 0F, 0, 1, 1, 0F); // Box 110
		bodyModel[89].setRotationPoint(-26F, 5F, 10F);

		bodyModel[90].addBox(0F, 0F, 0F, 1, 12, 0, 0F); // Box 111
		bodyModel[90].setRotationPoint(-27F, -6F, 11F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 2, 2, 0, 0F,-2F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 112
		bodyModel[91].setRotationPoint(-27F, -8F, 11F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 113
		bodyModel[92].setRotationPoint(-29F, 5F, -10F);

		bodyModel[93].addBox(0F, 0F, 0F, 0, 8, 1, 0F); // Box 114
		bodyModel[93].setRotationPoint(-29F, -3F, -10F);

		bodyModel[94].addBox(0F, 0F, 0F, 0, 1, 10, 0F); // Box 115
		bodyModel[94].setRotationPoint(-29F, -8F, -5F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 0, 1, 5, 0F,0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, -1F, 0F, 4F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 116
		bodyModel[95].setRotationPoint(-29F, -8F, -10F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 0, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, -1F, 0F, 4F, -1F); // Box 117
		bodyModel[96].setRotationPoint(-29F, -8F, 5F);

		bodyModel[97].addBox(0F, 0F, 0F, 0, 8, 1, 0F); // Box 118
		bodyModel[97].setRotationPoint(-29F, -3F, 9F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 119
		bodyModel[98].setRotationPoint(-29F, 5F, 9F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F,0F, 4F, -1F, 0F, 4F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 120
		bodyModel[99].setRotationPoint(-29F, -2F, -5F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, -1F, 0F, 4F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F); // Box 121
		bodyModel[100].setRotationPoint(-29F, -2F, 1F);

		bodyModel[101].addBox(0F, 0F, 0F, 0, 1, 1, 0F); // Box 122
		bodyModel[101].setRotationPoint(-29F, -7F, -5F);

		bodyModel[102].addBox(0F, 0F, 0F, 0, 1, 1, 0F); // Box 123
		bodyModel[102].setRotationPoint(-29F, -7F, 4F);

		bodyModel[103].addBox(0F, 0F, 0F, 0, 2, 2, 0F); // Box 124
		bodyModel[103].setRotationPoint(-29F, -2F, -1F);

		bodyModel[104].addBox(0F, 0F, 0F, 0, 2, 2, 0F); // Box 125
		bodyModel[104].setRotationPoint(29F, -2F, -1F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 126
		bodyModel[105].setRotationPoint(29F, 5F, -10F);

		bodyModel[106].addBox(0F, 0F, 0F, 0, 8, 1, 0F); // Box 127
		bodyModel[106].setRotationPoint(29F, -3F, -10F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 128
		bodyModel[107].setRotationPoint(29F, 5F, 9F);

		bodyModel[108].addBox(0F, 0F, 0F, 0, 8, 1, 0F); // Box 129
		bodyModel[108].setRotationPoint(29F, -3F, 9F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 0, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, -1F, 0F, 4F, -1F); // Box 130
		bodyModel[109].setRotationPoint(29F, -8F, 5F);

		bodyModel[110].addBox(0F, 0F, 0F, 0, 1, 10, 0F); // Box 131
		bodyModel[110].setRotationPoint(29F, -8F, -5F);

		bodyModel[111].addBox(0F, 0F, 0F, 0, 1, 1, 0F); // Box 132
		bodyModel[111].setRotationPoint(29F, -7F, 4F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, -1F, 0F, 4F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F); // Box 133
		bodyModel[112].setRotationPoint(29F, -2F, 1F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 0, 1, 5, 0F,0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, -1F, 0F, 4F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 134
		bodyModel[113].setRotationPoint(29F, -8F, -10F);

		bodyModel[114].addBox(0F, 0F, 0F, 0, 1, 1, 0F); // Box 135
		bodyModel[114].setRotationPoint(29F, -7F, -5F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F,0F, 4F, -1F, 0F, 4F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 136
		bodyModel[115].setRotationPoint(29F, -2F, -5F);

		bodyModel[116].addBox(0F, 0F, 0F, 3, 2, 0, 0F); // Box 137
		bodyModel[116].setRotationPoint(-29F, 7F, -10F);

		bodyModel[117].addBox(0F, 0F, 0F, 3, 3, 0, 0F); // Box 138
		bodyModel[117].setRotationPoint(-29F, 4.5F, -8F);

		bodyModel[118].addBox(0F, 0F, 0F, 3, 3, 0, 0F); // Box 139
		bodyModel[118].setRotationPoint(-29F, 2F, -7F);

		bodyModel[119].addBox(0F, 0F, 0F, 6, 1, 8, 0F); // Box 140
		bodyModel[119].setRotationPoint(-21F, -17F, -4F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 114
		bodyModel[120].setRotationPoint(-13F, -19F, -0.5F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[121].setRotationPoint(-13F, -20F, -0.5F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 78
		bodyModel[122].setRotationPoint(-12.75F, -18.5F, -0.25F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 113
		bodyModel[123].setRotationPoint(-13F, -17F, -2F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 114
		bodyModel[124].setRotationPoint(-13F, -20F, -2F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 115
		bodyModel[125].setRotationPoint(-13F, -20F, 1F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 116
		bodyModel[126].setRotationPoint(-13F, -20.5F, -1F);

		bodyModel[127].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 117
		bodyModel[127].setRotationPoint(-13F, -16.5F, -1F);

		bodyModel[128].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 149 glow
		bodyModel[128].setRotationPoint(-22F, -14F, -7.5F);

		bodyModel[129].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 150 glow
		bodyModel[129].setRotationPoint(-22F, -14F, 6.5F);

		bodyModel[130].addBox(0F, 0F, 0F, 8, 5, 0, 0F); // Box 1
		bodyModel[130].setRotationPoint(15F, -16F, 12.5F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 8, 0, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 2
		bodyModel[131].setRotationPoint(15F, -11F, 10F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 0, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F); // Box 3
		bodyModel[132].setRotationPoint(15F, -16F, 10F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 8, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 5
		bodyModel[133].setRotationPoint(15F, -17F, 10F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 0, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F); // Box 6
		bodyModel[134].setRotationPoint(23F, -16F, 10F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 167
		bodyModel[135].setRotationPoint(24F, -20.5F, 3F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[136].setRotationPoint(24F, -20F, -8F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 169
		bodyModel[137].setRotationPoint(24F, -20F, 3F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 170
		bodyModel[138].setRotationPoint(13F, -20F, 3F);

		bodyModel[139].addBox(0F, 0F, 0F, 1, 1, 16, 0F); // Box 171
		bodyModel[139].setRotationPoint(13F, -19F, -8F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 172
		bodyModel[140].setRotationPoint(13F, -19F, 8F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 173
		bodyModel[141].setRotationPoint(13F, -20.5F, 3F);

		bodyModel[142].addBox(0F, 0F, 0F, 1, 2, 6, 0F); // Box 174
		bodyModel[142].setRotationPoint(13F, -21F, -3F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 175
		bodyModel[143].setRotationPoint(13F, -20.5F, -8F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 176
		bodyModel[144].setRotationPoint(13F, -20F, -8F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 177
		bodyModel[145].setRotationPoint(13F, -19F, -10F);

		bodyModel[146].addBox(0F, 0F, 0F, 6, 9, 4, 0F); // Box 67
		bodyModel[146].setRotationPoint(12F, -12.98F, -1.5F);
		bodyModel[146].rotateAngleY = -0.48869219F;

		bodyModel[147].addBox(0F, 0F, 0F, 1, 4, 4, 0F); // Box 70
		bodyModel[147].setRotationPoint(14F, -14F, 3F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, -1F, -1F); // Box 71
		bodyModel[148].setRotationPoint(14F, -21F, -1F);

		bodyModel[149].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 78 lantern cab light
		bodyModel[149].setRotationPoint(19F, -21.5F, -1F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 211 lamp ditchlight f1
		bodyModel[150].setRotationPoint(-29.5F, -2F, 4.25F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 212
		bodyModel[151].setRotationPoint(-29F, -2F, 4F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 213
		bodyModel[152].setRotationPoint(-29F, -2F, -6F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 214 lamp ditchlight f1
		bodyModel[153].setRotationPoint(-29.5F, -2F, -5.75F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F); // Box 160 lamp ditchlight r1
		bodyModel[154].setRotationPoint(30F, -2F, -4.25F);
		bodyModel[154].rotateAngleY = -3.14159265F;

		bodyModel[155].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 161
		bodyModel[155].setRotationPoint(29.5F, -2F, -4F);
		bodyModel[155].rotateAngleY = -3.14159265F;

		bodyModel[156].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 162
		bodyModel[156].setRotationPoint(29.5F, -2F, 6F);
		bodyModel[156].rotateAngleY = -3.14159265F;

		bodyModel[157].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F); // Box 163 lamp ditchlight r1
		bodyModel[157].setRotationPoint(30F, -2F, 5.75F);
		bodyModel[157].rotateAngleY = -3.14159265F;

		bodyModel[158].addBox(0F, 0F, 0F, 0, 8, 1, 0F); // Box 191
		bodyModel[158].setRotationPoint(26F, -3F, 10.5F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 0, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, -1F, 0F, 4F, -1F); // Box 192
		bodyModel[159].setRotationPoint(26F, -8F, 6.5F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 193
		bodyModel[160].setRotationPoint(26F, 5F, 10.5F);

		bodyModel[161].addBox(0F, 0F, 0F, 1, 1, 0, 0F); // Box 197
		bodyModel[161].setRotationPoint(25F, -8F, 6.5F);

		bodyModel[162].addBox(0F, 0F, 0F, 1, 1, 0, 0F); // Box 198
		bodyModel[162].setRotationPoint(25F, -8F, -6.5F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 0, 1, 5, 0F,0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, -1F, 0F, 4F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 199
		bodyModel[163].setRotationPoint(26F, -8F, -11.5F);

		bodyModel[164].addBox(0F, 0F, 0F, 0, 8, 1, 0F); // Box 200
		bodyModel[164].setRotationPoint(26F, -3F, -11.5F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 201
		bodyModel[165].setRotationPoint(26F, 5F, -11.5F);

		bodyModel[166].addBox(0F, 0F, 0F, 1, 9, 0, 0F); // Box 202
		bodyModel[166].setRotationPoint(24.5F, -17F, -2.5F);

		bodyModel[167].addBox(0F, 0F, 0F, 1, 9, 0, 0F); // Box 203
		bodyModel[167].setRotationPoint(24.5F, -17F, 2.5F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.5F, 0.25F, 0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, 0.5F, 0.25F, 0.25F, 0.5F, 0.25F, 0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, 0.5F, 0.25F, 0.25F); // Box 164
		bodyModel[168].setRotationPoint(10.5F, -21F, -0.5F);

		bodyModel[169].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.25F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F); // Box 165
		bodyModel[169].setRotationPoint(11.5F, -21F, -0.5F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 166
		bodyModel[170].setRotationPoint(12.5F, -21F, -0.5F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.5F, 0.25F, 0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, 0.5F, 0.25F, 0.25F, 0.5F, 0.25F, 0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, 0.5F, 0.25F, 0.25F); // Box 207
		bodyModel[171].setRotationPoint(10.5F, -23F, -0.5F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.25F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F); // Box 208
		bodyModel[172].setRotationPoint(11.5F, -23F, -0.5F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 209
		bodyModel[173].setRotationPoint(12.5F, -23F, -0.5F);

		bodyModel[174].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 211
		bodyModel[174].setRotationPoint(-24F, -16.5F, -5.5F);

		bodyModel[175].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 212
		bodyModel[175].setRotationPoint(-24F, -16.5F, 4.5F);

		bodyModel[176].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 399 commander beacon
		bodyModel[176].setRotationPoint(13.32F, -23F, -0.5F);

		bodyModel[177].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0.3F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, 0.3F, -0.5F, 0.1F, 0.3F, 0F, 0.1F, -1F, 0F, 0.1F, -1F, 0F, 0.1F, 0.3F, 0F, 0.1F); // Box 400
		bodyModel[177].setRotationPoint(13.5F, -23F, -0.5F);

		bodyModel[178].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 215
		bodyModel[178].setRotationPoint(16F, -24F, 0F);

		bodyModel[179].addBox(0F, 0F, 0F, 0, 5, 2, 0F); // Box 216
		bodyModel[179].setRotationPoint(14F, -16F, 10F);

		bodyModel[180].addBox(0F, 0F, 0F, 0, 5, 2, 0F); // Box 217
		bodyModel[180].setRotationPoint(14F, -16F, -12F);

		bodyModel[181].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -1F, 1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // box64
		bodyModel[181].setRotationPoint(16F, -18F, 11F);

		bodyModel[182].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,1F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // box65
		bodyModel[182].setRotationPoint(16F, -18F, -12F);

		bodyModel[183].addBox(0F, 0F, 0F, 2, 7, 1, 0F); // Box 220 atsf stack
		bodyModel[183].setRotationPoint(4F, -23F, -3.5F);

		bodyModel[184].addBox(0F, 0F, 0F, 9, 2, 4, 0F); // Box 221 cull
		bodyModel[184].setRotationPoint(-23F, -17.5F, -2F);

		bodyModel[185].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 222
		bodyModel[185].setRotationPoint(9F, -16.5F, -1F);

		bodyModel[186].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 223
		bodyModel[186].setRotationPoint(-32F, 8F, -4F);

		bodyModel[187].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 224
		bodyModel[187].setRotationPoint(-32F, 8F, 4F);

		bodyModel[188].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 225
		bodyModel[188].setRotationPoint(29F, 8F, 4F);

		bodyModel[189].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 226
		bodyModel[189].setRotationPoint(29F, 8F, -4F);

		bodyModel[190].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 227
		bodyModel[190].setRotationPoint(-29F, 9F, 10F);

		bodyModel[191].addBox(0F, 0F, 0F, 3, 2, 0, 0F); // Box 228
		bodyModel[191].setRotationPoint(-29F, 7F, 10F);

		bodyModel[192].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 229
		bodyModel[192].setRotationPoint(-29F, 7F, 8F);

		bodyModel[193].addBox(0F, 0F, 0F, 3, 3, 0, 0F); // Box 230
		bodyModel[193].setRotationPoint(-29F, 4.5F, 8F);

		bodyModel[194].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 231
		bodyModel[194].setRotationPoint(-29F, 4.5F, 7F);

		bodyModel[195].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 232
		bodyModel[195].setRotationPoint(-29F, 2F, 7F);

		bodyModel[196].addBox(0F, 0F, 0F, 3, 3, 0, 0F); // Box 233
		bodyModel[196].setRotationPoint(-29F, 2F, 7F);

		bodyModel[197].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 234 glow numberboard
		bodyModel[197].setRotationPoint(-25F, -18F, 3F);
		bodyModel[197].rotateAngleY = -0.52359878F;

		bodyModel[198].addBox(0F, 0F, -4F, 1, 2, 4, 0F); // Box 235 glow numberboard
		bodyModel[198].setRotationPoint(-25F, -18F, -3F);
		bodyModel[198].rotateAngleY = 0.52359878F;

		bodyModel[199].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 236
		bodyModel[199].setRotationPoint(26F, 9F, 10F);

		bodyModel[200].addBox(0F, 0F, 0F, 3, 2, 0, 0F); // Box 237
		bodyModel[200].setRotationPoint(26F, 7F, 10F);

		bodyModel[201].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 238
		bodyModel[201].setRotationPoint(26F, 7F, 8F);

		bodyModel[202].addBox(0F, 0F, 0F, 3, 3, 0, 0F); // Box 239
		bodyModel[202].setRotationPoint(26F, 4.5F, 8F);

		bodyModel[203].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 240
		bodyModel[203].setRotationPoint(26F, 4.5F, 7F);

		bodyModel[204].addBox(0F, 0F, 0F, 3, 3, 0, 0F); // Box 241
		bodyModel[204].setRotationPoint(26F, 2F, 7F);

		bodyModel[205].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 242
		bodyModel[205].setRotationPoint(26F, 2F, 7F);

		bodyModel[206].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 243
		bodyModel[206].setRotationPoint(26F, 9F, -12F);

		bodyModel[207].addBox(0F, 0F, 0F, 3, 2, 0, 0F); // Box 244
		bodyModel[207].setRotationPoint(26F, 7F, -10F);

		bodyModel[208].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 245
		bodyModel[208].setRotationPoint(26F, 7F, -10F);

		bodyModel[209].addBox(0F, 0F, 0F, 3, 3, 0, 0F); // Box 246
		bodyModel[209].setRotationPoint(26F, 4.5F, -8F);

		bodyModel[210].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 247
		bodyModel[210].setRotationPoint(26F, 4.5F, -9F);

		bodyModel[211].addBox(0F, 0F, 0F, 3, 3, 0, 0F); // Box 248
		bodyModel[211].setRotationPoint(26F, 2F, -7F);

		bodyModel[212].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 249
		bodyModel[212].setRotationPoint(26F, 2F, -8F);

		bodyModel[213].addBox(0F, 0F, 0F, 0, 2, 14, 0F); // Box 250
		bodyModel[213].setRotationPoint(-29.01F, -1.5F, -7F);

		bodyModel[214].addBox(0F, 0F, 0F, 0, 2, 14, 0F); // Box 251
		bodyModel[214].setRotationPoint(29.01F, -1.5F, -7F);

		bodyModel[215].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 114
		bodyModel[215].setRotationPoint(-27F, -16F, -0.5F);

		bodyModel[216].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[216].setRotationPoint(-27F, -17F, -0.5F);

		bodyModel[217].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 78
		bodyModel[217].setRotationPoint(-26.75F, -15.5F, -0.25F);

		bodyModel[218].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 875
		bodyModel[218].setRotationPoint(-27F, -17F, -1F);

		bodyModel[219].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 876
		bodyModel[219].setRotationPoint(-27F, -17F, 1F);

		bodyModel[220].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 877
		bodyModel[220].setRotationPoint(-26.75F, -17.25F, -1.5F);

		bodyModel[221].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 221
		bodyModel[221].setRotationPoint(-15.5F, 3F, -1F);

		bodyModel[222].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 222
		bodyModel[222].setRotationPoint(13.5F, 3F, -1F);

		bodyModel[223].addBox(0F, 0F, 0F, 1, 0, 3, 0F); // Box 105
		bodyModel[223].setRotationPoint(12F, -2F, -10F);

		bodyModel[224].addBox(0F, 0F, 0F, 4, 4, 3, 0F); // Box 99
		bodyModel[224].setRotationPoint(3F, -21F, -4F);

		bodyModel[225].addBox(0F, 0F, 0F, 8, 2, 6, 0F); // Box 221 cull
		bodyModel[225].setRotationPoint(-22F, -17.5F, -3F);

		bodyModel[226].addBox(0F, 0F, 0F, 6, 1, 8, 0F); // Box 140
		bodyModel[226].setRotationPoint(-21F, -18F, -4F);

		bodyModel[227].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 364 prime base
		bodyModel[227].setRotationPoint(21.5F, -23F, -1F);

		bodyModel[228].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F); // Box 6 PRIME1-1
		bodyModel[228].setRotationPoint(21.5F, -23.5F, -1F);

		bodyModel[229].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F); // Box 7 PRIME1-3
		bodyModel[229].setRotationPoint(21.5F, -23.5F, -1F);

		bodyModel[230].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 8 PRIME1-2
		bodyModel[230].setRotationPoint(21.5F, -23.5F, -1F);

		bodyModel[231].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 9 PRIME1-4
		bodyModel[231].setRotationPoint(21.5F, -23.5F, -1F);
	}
	ModelBluntTruck theTrucks = new ModelBluntTruck();
	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		for(int i = 0; i < bodyModel.length; i++) {
			if (bodyModel[i].boxName != null && bodyModel[i].boxName.contains("lamp")) {
				Minecraft.getMinecraft().entityRenderer.disableLightmap(1D);
				bodyModel[i].render(f5);
				Minecraft.getMinecraft().entityRenderer.enableLightmap(1D);
			}else if (bodyModel[i].boxName != null && bodyModel[i].boxName.contains("cull")) {
				GL11.glDisable(GL11.GL_CULL_FACE);
				bodyModel[i].render(f5);
				GL11.glEnable(GL11.GL_CULL_FACE);
			} else {
				bodyModel[i].render(f5);
			}
		}
		if(entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor()==15){
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/blunttruck_Green.png"));
		} else {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/blunttruck_Black.png"));
		}
		GL11.glPushMatrix();
		GL11.glTranslatef(-0.85F ,0.25F,0F);
		//GL11.glScalef(0.9f,0.9f,0.8f);
		theTrucks.render(entity,f,f1,f2,f3,f4,f5);
		GL11.glPopMatrix();

		GL11.glPushMatrix();
		GL11.glTranslated(0.98F,0.25F,0);
		theTrucks.render(entity,f,f1,f2,f3,f4,f5);
		GL11.glPopMatrix();
	}
	public float[] getTrans() {
		return new float[]{-1F, 0.15F, 0F};
	}
}