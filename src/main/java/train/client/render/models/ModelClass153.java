//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2022 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator:
// Created on:11.09.2021 - 18:24:13
// Last changed on: 11.09.2021 - 18:24:13

package train.client.render.models;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import tmt.ModelBase;
import tmt.ModelRendererTurbo;
import tmt.Tessellator;
import train.common.library.Info;

public class ModelClass153 extends ModelBase
{
	int textureX = 512;
	int textureY = 256;

	public ModelClass153()
	{
		class153Model = new ModelRendererTurbo[371];
		class153Model[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 13
		class153Model[1] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 20
		class153Model[2] = new ModelRendererTurbo(this, 193, 9, textureX, textureY); // Box 26
		class153Model[3] = new ModelRendererTurbo(this, 201, 17, textureX, textureY); // Box 48
		class153Model[4] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 50
		class153Model[5] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 51
		class153Model[6] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 52
		class153Model[7] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 56
		class153Model[8] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 57
		class153Model[9] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 61
		class153Model[10] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 214
		class153Model[11] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 51
		class153Model[12] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 52
		class153Model[13] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 53
		class153Model[14] = new ModelRendererTurbo(this, 393, 17, textureX, textureY); // Box 54
		class153Model[15] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 55
		class153Model[16] = new ModelRendererTurbo(this, 121, 33, textureX, textureY); // Box 56
		class153Model[17] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 63
		class153Model[18] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 64
		class153Model[19] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 65
		class153Model[20] = new ModelRendererTurbo(this, 369, 17, textureX, textureY); // Box 66
		class153Model[21] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 85
		class153Model[22] = new ModelRendererTurbo(this, 377, 9, textureX, textureY); // Box 86
		class153Model[23] = new ModelRendererTurbo(this, 385, 9, textureX, textureY); // Box 87
		class153Model[24] = new ModelRendererTurbo(this, 393, 9, textureX, textureY); // Box 88
		class153Model[25] = new ModelRendererTurbo(this, 409, 9, textureX, textureY); // Box 89
		class153Model[26] = new ModelRendererTurbo(this, 457, 9, textureX, textureY); // Box 90
		class153Model[27] = new ModelRendererTurbo(this, 241, 33, textureX, textureY); // Box 91
		class153Model[28] = new ModelRendererTurbo(this, 257, 33, textureX, textureY); // Box 92
		class153Model[29] = new ModelRendererTurbo(this, 273, 33, textureX, textureY); // Box 93
		class153Model[30] = new ModelRendererTurbo(this, 281, 33, textureX, textureY); // Box 94
		class153Model[31] = new ModelRendererTurbo(this, 473, 9, textureX, textureY); // Box 95
		class153Model[32] = new ModelRendererTurbo(this, 297, 33, textureX, textureY); // Box 96
		class153Model[33] = new ModelRendererTurbo(this, 313, 33, textureX, textureY); // Box 97
		class153Model[34] = new ModelRendererTurbo(this, 329, 33, textureX, textureY); // Box 98
		class153Model[35] = new ModelRendererTurbo(this, 417, 33, textureX, textureY); // Box 99
		class153Model[36] = new ModelRendererTurbo(this, 353, 33, textureX, textureY); // Box 100
		class153Model[37] = new ModelRendererTurbo(this, 481, 9, textureX, textureY); // Box 101
		class153Model[38] = new ModelRendererTurbo(this, 489, 9, textureX, textureY); // Box 102
		class153Model[39] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 103
		class153Model[40] = new ModelRendererTurbo(this, 169, 25, textureX, textureY); // Box 104
		class153Model[41] = new ModelRendererTurbo(this, 441, 33, textureX, textureY); // Box 105
		class153Model[42] = new ModelRendererTurbo(this, 457, 33, textureX, textureY); // Box 106
		class153Model[43] = new ModelRendererTurbo(this, 185, 25, textureX, textureY); // Box 107
		class153Model[44] = new ModelRendererTurbo(this, 193, 17, textureX, textureY); // Box 108
		class153Model[45] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 109
		class153Model[46] = new ModelRendererTurbo(this, 121, 41, textureX, textureY); // Box 110
		class153Model[47] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 111
		class153Model[48] = new ModelRendererTurbo(this, 473, 33, textureX, textureY); // Box 112
		class153Model[49] = new ModelRendererTurbo(this, 489, 33, textureX, textureY); // Box 113
		class153Model[50] = new ModelRendererTurbo(this, 361, 33, textureX, textureY); // Box 114
		class153Model[51] = new ModelRendererTurbo(this, 121, 49, textureX, textureY); // Box 115
		class153Model[52] = new ModelRendererTurbo(this, 497, 9, textureX, textureY); // Box 116
		class153Model[53] = new ModelRendererTurbo(this, 377, 17, textureX, textureY); // Box 117
		class153Model[54] = new ModelRendererTurbo(this, 137, 49, textureX, textureY); // Box 118
		class153Model[55] = new ModelRendererTurbo(this, 153, 49, textureX, textureY); // Box 119
		class153Model[56] = new ModelRendererTurbo(this, 169, 49, textureX, textureY); // Box 120
		class153Model[57] = new ModelRendererTurbo(this, 201, 25, textureX, textureY); // Box 121
		class153Model[58] = new ModelRendererTurbo(this, 185, 49, textureX, textureY); // Box 79
		class153Model[59] = new ModelRendererTurbo(this, 201, 49, textureX, textureY); // Box 94
		class153Model[60] = new ModelRendererTurbo(this, 217, 33, textureX, textureY); // Box 140
		class153Model[61] = new ModelRendererTurbo(this, 289, 41, textureX, textureY); // Box 142
		class153Model[62] = new ModelRendererTurbo(this, 505, 41, textureX, textureY); // Box 143
		class153Model[63] = new ModelRendererTurbo(this, 393, 41, textureX, textureY); // Box 146
		class153Model[64] = new ModelRendererTurbo(this, 97, 49, textureX, textureY); // Box 147
		class153Model[65] = new ModelRendererTurbo(this, 193, 49, textureX, textureY); // Box 150
		class153Model[66] = new ModelRendererTurbo(this, 209, 49, textureX, textureY); // Box 151
		class153Model[67] = new ModelRendererTurbo(this, 257, 49, textureX, textureY); // Box 153
		class153Model[68] = new ModelRendererTurbo(this, 337, 49, textureX, textureY); // Box 154
		class153Model[69] = new ModelRendererTurbo(this, 353, 49, textureX, textureY); // Box 155
		class153Model[70] = new ModelRendererTurbo(this, 441, 49, textureX, textureY); // Box 156
		class153Model[71] = new ModelRendererTurbo(this, 281, 49, textureX, textureY); // Box 157
		class153Model[72] = new ModelRendererTurbo(this, 321, 49, textureX, textureY); // Box 158
		class153Model[73] = new ModelRendererTurbo(this, 129, 57, textureX, textureY); // Box 178
		class153Model[74] = new ModelRendererTurbo(this, 153, 57, textureX, textureY); // Box 179
		class153Model[75] = new ModelRendererTurbo(this, 505, 49, textureX, textureY); // Box 180
		class153Model[76] = new ModelRendererTurbo(this, 177, 57, textureX, textureY); // Box 181
		class153Model[77] = new ModelRendererTurbo(this, 201, 57, textureX, textureY); // Box 183
		class153Model[78] = new ModelRendererTurbo(this, 233, 57, textureX, textureY); // Box 184
		class153Model[79] = new ModelRendererTurbo(this, 129, 57, textureX, textureY); // Box 185
		class153Model[80] = new ModelRendererTurbo(this, 153, 57, textureX, textureY); // Box 186
		class153Model[81] = new ModelRendererTurbo(this, 177, 57, textureX, textureY); // Box 232
		class153Model[82] = new ModelRendererTurbo(this, 353, 57, textureX, textureY); // Box 233
		class153Model[83] = new ModelRendererTurbo(this, 185, 57, textureX, textureY); // Box 234
		class153Model[84] = new ModelRendererTurbo(this, 201, 57, textureX, textureY); // Box 235
		class153Model[85] = new ModelRendererTurbo(this, 225, 57, textureX, textureY); // Box 236
		class153Model[86] = new ModelRendererTurbo(this, 377, 57, textureX, textureY); // Box 239
		class153Model[87] = new ModelRendererTurbo(this, 465, 57, textureX, textureY); // Box 240
		class153Model[88] = new ModelRendererTurbo(this, 481, 57, textureX, textureY); // Box 241
		class153Model[89] = new ModelRendererTurbo(this, 497, 57, textureX, textureY); // Box 243
		class153Model[90] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 244
		class153Model[91] = new ModelRendererTurbo(this, 9, 65, textureX, textureY); // Box 245
		class153Model[92] = new ModelRendererTurbo(this, 9, 65, textureX, textureY); // Box 246
		class153Model[93] = new ModelRendererTurbo(this, 33, 65, textureX, textureY); // Box 247
		class153Model[94] = new ModelRendererTurbo(this, 33, 65, textureX, textureY); // Box 248
		class153Model[95] = new ModelRendererTurbo(this, 17, 65, textureX, textureY); // Box 249
		class153Model[96] = new ModelRendererTurbo(this, 57, 65, textureX, textureY); // Box 250
		class153Model[97] = new ModelRendererTurbo(this, 65, 65, textureX, textureY); // Box 251
		class153Model[98] = new ModelRendererTurbo(this, 297, 57, textureX, textureY); // Box 252
		class153Model[99] = new ModelRendererTurbo(this, 81, 65, textureX, textureY); // Box 253
		class153Model[100] = new ModelRendererTurbo(this, 153, 65, textureX, textureY); // Box 257
		class153Model[101] = new ModelRendererTurbo(this, 177, 65, textureX, textureY); // Box 258
		class153Model[102] = new ModelRendererTurbo(this, 265, 65, textureX, textureY); // Box 259
		class153Model[103] = new ModelRendererTurbo(this, 89, 65, textureX, textureY); // Box 262
		class153Model[104] = new ModelRendererTurbo(this, 385, 57, textureX, textureY); // Box 263
		class153Model[105] = new ModelRendererTurbo(this, 281, 65, textureX, textureY); // Box 264
		class153Model[106] = new ModelRendererTurbo(this, 225, 65, textureX, textureY); // Box 265
		class153Model[107] = new ModelRendererTurbo(this, 201, 65, textureX, textureY); // Box 266
		class153Model[108] = new ModelRendererTurbo(this, 257, 65, textureX, textureY); // Box 268
		class153Model[109] = new ModelRendererTurbo(this, 401, 57, textureX, textureY); // Box 269
		class153Model[110] = new ModelRendererTurbo(this, 289, 65, textureX, textureY); // Box 270
		class153Model[111] = new ModelRendererTurbo(this, 297, 65, textureX, textureY); // Box 271
		class153Model[112] = new ModelRendererTurbo(this, 313, 65, textureX, textureY); // Box 272
		class153Model[113] = new ModelRendererTurbo(this, 329, 65, textureX, textureY); // Box 225
		class153Model[114] = new ModelRendererTurbo(this, 425, 65, textureX, textureY); // Box 226
		class153Model[115] = new ModelRendererTurbo(this, 377, 65, textureX, textureY); // Box 227
		class153Model[116] = new ModelRendererTurbo(this, 417, 57, textureX, textureY); // Box 228
		class153Model[117] = new ModelRendererTurbo(this, 449, 65, textureX, textureY); // Box 229
		class153Model[118] = new ModelRendererTurbo(this, 465, 65, textureX, textureY); // Box 232
		class153Model[119] = new ModelRendererTurbo(this, 481, 65, textureX, textureY); // Box 233
		class153Model[120] = new ModelRendererTurbo(this, 497, 65, textureX, textureY); // Box 234
		class153Model[121] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 236
		class153Model[122] = new ModelRendererTurbo(this, 385, 65, textureX, textureY); // Box 237
		class153Model[123] = new ModelRendererTurbo(this, 33, 73, textureX, textureY); // Box 238
		class153Model[124] = new ModelRendererTurbo(this, 57, 73, textureX, textureY); // Box 239
		class153Model[125] = new ModelRendererTurbo(this, 81, 73, textureX, textureY); // Box 240
		class153Model[126] = new ModelRendererTurbo(this, 57, 73, textureX, textureY); // Box 241
		class153Model[127] = new ModelRendererTurbo(this, 17, 73, textureX, textureY); // Box 242
		class153Model[128] = new ModelRendererTurbo(this, 41, 73, textureX, textureY); // Box 243
		class153Model[129] = new ModelRendererTurbo(this, 81, 73, textureX, textureY); // Box 244
		class153Model[130] = new ModelRendererTurbo(this, 473, 57, textureX, textureY); // Box 245
		class153Model[131] = new ModelRendererTurbo(this, 105, 73, textureX, textureY); // Box 246
		class153Model[132] = new ModelRendererTurbo(this, 113, 73, textureX, textureY); // Box 250
		class153Model[133] = new ModelRendererTurbo(this, 217, 73, textureX, textureY); // Box 251
		class153Model[134] = new ModelRendererTurbo(this, 233, 73, textureX, textureY); // Box 252
		class153Model[135] = new ModelRendererTurbo(this, 249, 73, textureX, textureY); // Box 253
		class153Model[136] = new ModelRendererTurbo(this, 97, 65, textureX, textureY); // Box 254
		class153Model[137] = new ModelRendererTurbo(this, 257, 73, textureX, textureY); // Box 255
		class153Model[138] = new ModelRendererTurbo(this, 265, 73, textureX, textureY); // Box 256
		class153Model[139] = new ModelRendererTurbo(this, 281, 73, textureX, textureY); // Box 257
		class153Model[140] = new ModelRendererTurbo(this, 289, 73, textureX, textureY); // Box 258
		class153Model[141] = new ModelRendererTurbo(this, 121, 65, textureX, textureY); // Box 259
		class153Model[142] = new ModelRendererTurbo(this, 297, 73, textureX, textureY); // Box 260
		class153Model[143] = new ModelRendererTurbo(this, 305, 73, textureX, textureY); // Box 261
		class153Model[144] = new ModelRendererTurbo(this, 321, 73, textureX, textureY); // Box 262
		class153Model[145] = new ModelRendererTurbo(this, 337, 73, textureX, textureY); // 59
		class153Model[146] = new ModelRendererTurbo(this, 449, 73, textureX, textureY); // 60
		class153Model[147] = new ModelRendererTurbo(this, 457, 73, textureX, textureY); // 61
		class153Model[148] = new ModelRendererTurbo(this, 161, 65, textureX, textureY); // 62
		class153Model[149] = new ModelRendererTurbo(this, 473, 73, textureX, textureY); // 59
		class153Model[150] = new ModelRendererTurbo(this, 489, 73, textureX, textureY); // 60
		class153Model[151] = new ModelRendererTurbo(this, 497, 73, textureX, textureY); // 61
		class153Model[152] = new ModelRendererTurbo(this, 473, 65, textureX, textureY); // 62
		class153Model[153] = new ModelRendererTurbo(this, 105, 81, textureX, textureY); // 54
		class153Model[154] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 743
		class153Model[155] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 60
		class153Model[156] = new ModelRendererTurbo(this, 81, 81, textureX, textureY); // Box 48
		class153Model[157] = new ModelRendererTurbo(this, 105, 81, textureX, textureY); // Box 747
		class153Model[158] = new ModelRendererTurbo(this, 145, 81, textureX, textureY); // Box 748
		class153Model[159] = new ModelRendererTurbo(this, 161, 81, textureX, textureY); // Box 749
		class153Model[160] = new ModelRendererTurbo(this, 177, 81, textureX, textureY); // Box 750
		class153Model[161] = new ModelRendererTurbo(this, 193, 81, textureX, textureY); // Box 751
		class153Model[162] = new ModelRendererTurbo(this, 217, 81, textureX, textureY); // Box 752
		class153Model[163] = new ModelRendererTurbo(this, 225, 73, textureX, textureY); // Box 753
		class153Model[164] = new ModelRendererTurbo(this, 273, 81, textureX, textureY); // Box 955
		class153Model[165] = new ModelRendererTurbo(this, 369, 73, textureX, textureY); // Box 956
		class153Model[166] = new ModelRendererTurbo(this, 441, 81, textureX, textureY); // Box 957
		class153Model[167] = new ModelRendererTurbo(this, 249, 81, textureX, textureY); // Box 959
		class153Model[168] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Box 960
		class153Model[169] = new ModelRendererTurbo(this, 257, 81, textureX, textureY); // Box 961
		class153Model[170] = new ModelRendererTurbo(this, 201, 81, textureX, textureY); // Box 962
		class153Model[171] = new ModelRendererTurbo(this, 313, 81, textureX, textureY); // Box 963
		class153Model[172] = new ModelRendererTurbo(this, 337, 81, textureX, textureY); // Box 964
		class153Model[173] = new ModelRendererTurbo(this, 481, 81, textureX, textureY); // Box 965
		class153Model[174] = new ModelRendererTurbo(this, 257, 81, textureX, textureY); // Box 966
		class153Model[175] = new ModelRendererTurbo(this, 169, 89, textureX, textureY); // Box 967
		class153Model[176] = new ModelRendererTurbo(this, 417, 89, textureX, textureY); // Box 968
		class153Model[177] = new ModelRendererTurbo(this, 361, 81, textureX, textureY); // Box 969
		class153Model[178] = new ModelRendererTurbo(this, 49, 89, textureX, textureY); // Box 970
		class153Model[179] = new ModelRendererTurbo(this, 1, 121, textureX, textureY); // Box 972
		class153Model[180] = new ModelRendererTurbo(this, 177, 121, textureX, textureY); // Box 973
		class153Model[181] = new ModelRendererTurbo(this, 273, 105, textureX, textureY); // Box 974
		class153Model[182] = new ModelRendererTurbo(this, 65, 89, textureX, textureY); // Box 975
		class153Model[183] = new ModelRendererTurbo(this, 201, 97, textureX, textureY); // Box 977
		class153Model[184] = new ModelRendererTurbo(this, 489, 65, textureX, textureY); // Import Box277
		class153Model[185] = new ModelRendererTurbo(this, 225, 73, textureX, textureY); // Import Box278
		class153Model[186] = new ModelRendererTurbo(this, 393, 81, textureX, textureY); // Import Box174
		class153Model[187] = new ModelRendererTurbo(this, 441, 89, textureX, textureY); // Import Box175
		class153Model[188] = new ModelRendererTurbo(this, 281, 81, textureX, textureY); // Import Box182
		class153Model[189] = new ModelRendererTurbo(this, 313, 81, textureX, textureY); // Import Box183
		class153Model[190] = new ModelRendererTurbo(this, 329, 81, textureX, textureY); // Import Box184
		class153Model[191] = new ModelRendererTurbo(this, 353, 81, textureX, textureY); // Import Box185
		class153Model[192] = new ModelRendererTurbo(this, 409, 81, textureX, textureY); // Box 104
		class153Model[193] = new ModelRendererTurbo(this, 497, 81, textureX, textureY); // Box 105
		class153Model[194] = new ModelRendererTurbo(this, 337, 81, textureX, textureY); // Box 106
		class153Model[195] = new ModelRendererTurbo(this, 377, 81, textureX, textureY); // Box 109
		class153Model[196] = new ModelRendererTurbo(this, 481, 81, textureX, textureY); // Box 116
		class153Model[197] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 117
		class153Model[198] = new ModelRendererTurbo(this, 33, 89, textureX, textureY); // Box 994
		class153Model[199] = new ModelRendererTurbo(this, 113, 89, textureX, textureY); // Box 995
		class153Model[200] = new ModelRendererTurbo(this, 145, 89, textureX, textureY); // Box 1004
		class153Model[201] = new ModelRendererTurbo(this, 161, 89, textureX, textureY); // Box 1005
		class153Model[202] = new ModelRendererTurbo(this, 417, 89, textureX, textureY); // Box 1006
		class153Model[203] = new ModelRendererTurbo(this, 433, 89, textureX, textureY); // Box 1007
		class153Model[204] = new ModelRendererTurbo(this, 81, 97, textureX, textureY); // Box 1008
		class153Model[205] = new ModelRendererTurbo(this, 337, 97, textureX, textureY); // Box 1009
		class153Model[206] = new ModelRendererTurbo(this, 353, 97, textureX, textureY); // Box 1010
		class153Model[207] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 1011
		class153Model[208] = new ModelRendererTurbo(this, 409, 81, textureX, textureY); // Box 242
		class153Model[209] = new ModelRendererTurbo(this, 353, 97, textureX, textureY); // Box 243
		class153Model[210] = new ModelRendererTurbo(this, 145, 89, textureX, textureY); // Box 244
		class153Model[211] = new ModelRendererTurbo(this, 337, 97, textureX, textureY); // Box 245
		class153Model[212] = new ModelRendererTurbo(this, 81, 97, textureX, textureY); // Box 246
		class153Model[213] = new ModelRendererTurbo(this, 161, 89, textureX, textureY); // Box 247
		class153Model[214] = new ModelRendererTurbo(this, 417, 89, textureX, textureY); // Box 248
		class153Model[215] = new ModelRendererTurbo(this, 433, 89, textureX, textureY); // Box 249
		class153Model[216] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 250
		class153Model[217] = new ModelRendererTurbo(this, 481, 81, textureX, textureY); // Box 251
		class153Model[218] = new ModelRendererTurbo(this, 497, 81, textureX, textureY); // Box 252
		class153Model[219] = new ModelRendererTurbo(this, 337, 81, textureX, textureY); // Box 253
		class153Model[220] = new ModelRendererTurbo(this, 33, 89, textureX, textureY); // Box 254
		class153Model[221] = new ModelRendererTurbo(this, 113, 89, textureX, textureY); // Box 255
		class153Model[222] = new ModelRendererTurbo(this, 377, 81, textureX, textureY); // Box 256
		class153Model[223] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 257
		class153Model[224] = new ModelRendererTurbo(this, 409, 81, textureX, textureY); // Box 258
		class153Model[225] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 259
		class153Model[226] = new ModelRendererTurbo(this, 481, 81, textureX, textureY); // Box 260
		class153Model[227] = new ModelRendererTurbo(this, 497, 81, textureX, textureY); // Box 261
		class153Model[228] = new ModelRendererTurbo(this, 337, 81, textureX, textureY); // Box 262
		class153Model[229] = new ModelRendererTurbo(this, 33, 89, textureX, textureY); // Box 263
		class153Model[230] = new ModelRendererTurbo(this, 113, 89, textureX, textureY); // Box 264
		class153Model[231] = new ModelRendererTurbo(this, 377, 81, textureX, textureY); // Box 265
		class153Model[232] = new ModelRendererTurbo(this, 409, 81, textureX, textureY); // Box 266
		class153Model[233] = new ModelRendererTurbo(this, 481, 81, textureX, textureY); // Box 267
		class153Model[234] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 268
		class153Model[235] = new ModelRendererTurbo(this, 497, 81, textureX, textureY); // Box 269
		class153Model[236] = new ModelRendererTurbo(this, 337, 81, textureX, textureY); // Box 270
		class153Model[237] = new ModelRendererTurbo(this, 33, 89, textureX, textureY); // Box 271
		class153Model[238] = new ModelRendererTurbo(this, 113, 89, textureX, textureY); // Box 272
		class153Model[239] = new ModelRendererTurbo(this, 377, 81, textureX, textureY); // Box 273
		class153Model[240] = new ModelRendererTurbo(this, 409, 81, textureX, textureY); // Box 274
		class153Model[241] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 275
		class153Model[242] = new ModelRendererTurbo(this, 481, 81, textureX, textureY); // Box 276
		class153Model[243] = new ModelRendererTurbo(this, 497, 81, textureX, textureY); // Box 277
		class153Model[244] = new ModelRendererTurbo(this, 337, 81, textureX, textureY); // Box 278
		class153Model[245] = new ModelRendererTurbo(this, 33, 89, textureX, textureY); // Box 279
		class153Model[246] = new ModelRendererTurbo(this, 113, 89, textureX, textureY); // Box 280
		class153Model[247] = new ModelRendererTurbo(this, 377, 81, textureX, textureY); // Box 281
		class153Model[248] = new ModelRendererTurbo(this, 409, 81, textureX, textureY); // Box 282
		class153Model[249] = new ModelRendererTurbo(this, 481, 81, textureX, textureY); // Box 283
		class153Model[250] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 284
		class153Model[251] = new ModelRendererTurbo(this, 497, 81, textureX, textureY); // Box 285
		class153Model[252] = new ModelRendererTurbo(this, 337, 81, textureX, textureY); // Box 286
		class153Model[253] = new ModelRendererTurbo(this, 33, 89, textureX, textureY); // Box 287
		class153Model[254] = new ModelRendererTurbo(this, 113, 89, textureX, textureY); // Box 288
		class153Model[255] = new ModelRendererTurbo(this, 377, 81, textureX, textureY); // Box 289
		class153Model[256] = new ModelRendererTurbo(this, 409, 81, textureX, textureY); // Box 290
		class153Model[257] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 291
		class153Model[258] = new ModelRendererTurbo(this, 481, 81, textureX, textureY); // Box 292
		class153Model[259] = new ModelRendererTurbo(this, 497, 81, textureX, textureY); // Box 293
		class153Model[260] = new ModelRendererTurbo(this, 337, 81, textureX, textureY); // Box 294
		class153Model[261] = new ModelRendererTurbo(this, 33, 89, textureX, textureY); // Box 295
		class153Model[262] = new ModelRendererTurbo(this, 113, 89, textureX, textureY); // Box 296
		class153Model[263] = new ModelRendererTurbo(this, 377, 81, textureX, textureY); // Box 297
		class153Model[264] = new ModelRendererTurbo(this, 409, 81, textureX, textureY); // Box 298
		class153Model[265] = new ModelRendererTurbo(this, 481, 81, textureX, textureY); // Box 299
		class153Model[266] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 300
		class153Model[267] = new ModelRendererTurbo(this, 497, 81, textureX, textureY); // Box 301
		class153Model[268] = new ModelRendererTurbo(this, 337, 81, textureX, textureY); // Box 302
		class153Model[269] = new ModelRendererTurbo(this, 33, 89, textureX, textureY); // Box 303
		class153Model[270] = new ModelRendererTurbo(this, 113, 89, textureX, textureY); // Box 304
		class153Model[271] = new ModelRendererTurbo(this, 377, 81, textureX, textureY); // Box 305
		class153Model[272] = new ModelRendererTurbo(this, 353, 97, textureX, textureY); // Box 306
		class153Model[273] = new ModelRendererTurbo(this, 145, 89, textureX, textureY); // Box 307
		class153Model[274] = new ModelRendererTurbo(this, 161, 89, textureX, textureY); // Box 308
		class153Model[275] = new ModelRendererTurbo(this, 81, 97, textureX, textureY); // Box 309
		class153Model[276] = new ModelRendererTurbo(this, 337, 97, textureX, textureY); // Box 310
		class153Model[277] = new ModelRendererTurbo(this, 433, 89, textureX, textureY); // Box 311
		class153Model[278] = new ModelRendererTurbo(this, 417, 89, textureX, textureY); // Box 312
		class153Model[279] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 313
		class153Model[280] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 314
		class153Model[281] = new ModelRendererTurbo(this, 337, 97, textureX, textureY); // Box 315
		class153Model[282] = new ModelRendererTurbo(this, 81, 97, textureX, textureY); // Box 316
		class153Model[283] = new ModelRendererTurbo(this, 161, 89, textureX, textureY); // Box 317
		class153Model[284] = new ModelRendererTurbo(this, 145, 89, textureX, textureY); // Box 318
		class153Model[285] = new ModelRendererTurbo(this, 353, 97, textureX, textureY); // Box 319
		class153Model[286] = new ModelRendererTurbo(this, 433, 89, textureX, textureY); // Box 320
		class153Model[287] = new ModelRendererTurbo(this, 417, 89, textureX, textureY); // Box 321
		class153Model[288] = new ModelRendererTurbo(this, 353, 97, textureX, textureY); // Box 322
		class153Model[289] = new ModelRendererTurbo(this, 145, 89, textureX, textureY); // Box 323
		class153Model[290] = new ModelRendererTurbo(this, 161, 89, textureX, textureY); // Box 324
		class153Model[291] = new ModelRendererTurbo(this, 81, 97, textureX, textureY); // Box 325
		class153Model[292] = new ModelRendererTurbo(this, 337, 97, textureX, textureY); // Box 326
		class153Model[293] = new ModelRendererTurbo(this, 433, 89, textureX, textureY); // Box 327
		class153Model[294] = new ModelRendererTurbo(this, 417, 89, textureX, textureY); // Box 328
		class153Model[295] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 329
		class153Model[296] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 330
		class153Model[297] = new ModelRendererTurbo(this, 337, 97, textureX, textureY); // Box 331
		class153Model[298] = new ModelRendererTurbo(this, 81, 97, textureX, textureY); // Box 332
		class153Model[299] = new ModelRendererTurbo(this, 161, 89, textureX, textureY); // Box 333
		class153Model[300] = new ModelRendererTurbo(this, 145, 89, textureX, textureY); // Box 334
		class153Model[301] = new ModelRendererTurbo(this, 353, 97, textureX, textureY); // Box 335
		class153Model[302] = new ModelRendererTurbo(this, 433, 89, textureX, textureY); // Box 336
		class153Model[303] = new ModelRendererTurbo(this, 417, 89, textureX, textureY); // Box 337
		class153Model[304] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 338
		class153Model[305] = new ModelRendererTurbo(this, 497, 81, textureX, textureY); // Box 339
		class153Model[306] = new ModelRendererTurbo(this, 337, 81, textureX, textureY); // Box 340
		class153Model[307] = new ModelRendererTurbo(this, 409, 81, textureX, textureY); // Box 341
		class153Model[308] = new ModelRendererTurbo(this, 33, 89, textureX, textureY); // Box 342
		class153Model[309] = new ModelRendererTurbo(this, 377, 81, textureX, textureY); // Box 343
		class153Model[310] = new ModelRendererTurbo(this, 113, 89, textureX, textureY); // Box 344
		class153Model[311] = new ModelRendererTurbo(this, 409, 81, textureX, textureY); // Box 345
		class153Model[312] = new ModelRendererTurbo(this, 33, 89, textureX, textureY); // Box 346
		class153Model[313] = new ModelRendererTurbo(this, 113, 89, textureX, textureY); // Box 347
		class153Model[314] = new ModelRendererTurbo(this, 481, 81, textureX, textureY); // Box 348
		class153Model[315] = new ModelRendererTurbo(this, 337, 81, textureX, textureY); // Box 349
		class153Model[316] = new ModelRendererTurbo(this, 497, 81, textureX, textureY); // Box 350
		class153Model[317] = new ModelRendererTurbo(this, 377, 81, textureX, textureY); // Box 351
		class153Model[318] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 352
		class153Model[319] = new ModelRendererTurbo(this, 337, 97, textureX, textureY); // Box 353
		class153Model[320] = new ModelRendererTurbo(this, 145, 89, textureX, textureY); // Box 354
		class153Model[321] = new ModelRendererTurbo(this, 353, 97, textureX, textureY); // Box 355
		class153Model[322] = new ModelRendererTurbo(this, 161, 89, textureX, textureY); // Box 356
		class153Model[323] = new ModelRendererTurbo(this, 81, 97, textureX, textureY); // Box 357
		class153Model[324] = new ModelRendererTurbo(this, 433, 89, textureX, textureY); // Box 358
		class153Model[325] = new ModelRendererTurbo(this, 417, 89, textureX, textureY); // Box 359
		class153Model[326] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 360
		class153Model[327] = new ModelRendererTurbo(this, 337, 97, textureX, textureY); // Box 361
		class153Model[328] = new ModelRendererTurbo(this, 145, 89, textureX, textureY); // Box 362
		class153Model[329] = new ModelRendererTurbo(this, 353, 97, textureX, textureY); // Box 363
		class153Model[330] = new ModelRendererTurbo(this, 161, 89, textureX, textureY); // Box 364
		class153Model[331] = new ModelRendererTurbo(this, 81, 97, textureX, textureY); // Box 365
		class153Model[332] = new ModelRendererTurbo(this, 433, 89, textureX, textureY); // Box 366
		class153Model[333] = new ModelRendererTurbo(this, 417, 89, textureX, textureY); // Box 367
		class153Model[334] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 368
		class153Model[335] = new ModelRendererTurbo(this, 121, 135, textureX, textureY); // Box 369
		class153Model[336] = new ModelRendererTurbo(this, 489, 109, textureX, textureY, "lamp"); // Box 370
		class153Model[337] = new ModelRendererTurbo(this, 497, 109, textureX, textureY, "lamp"); // Box 371
		class153Model[338] = new ModelRendererTurbo(this, 473, 109, textureX, textureY, "lamp"); // Box 372
		class153Model[339] = new ModelRendererTurbo(this, 481, 109, textureX, textureY, "lamp"); // Box 373
		class153Model[340] = new ModelRendererTurbo(this, 481, 116, textureX, textureY, "lamp"); // Box 374
		class153Model[341] = new ModelRendererTurbo(this, 481, 116, textureX, textureY, "lamp"); // Box 375
		class153Model[342] = new ModelRendererTurbo(this, 481, 116, textureX, textureY, "lamp"); // Box 376
		class153Model[343] = new ModelRendererTurbo(this, 481, 116, textureX, textureY, "lamp"); // Box 377
		class153Model[344] = new ModelRendererTurbo(this, 121, 135, textureX, textureY, "lamp"); // Box 378
		class153Model[345] = new ModelRendererTurbo(this, 489, 109, textureX, textureY, "lamp"); // Box 379
		class153Model[346] = new ModelRendererTurbo(this, 473, 109, textureX, textureY, "lamp"); // Box 380
		class153Model[347] = new ModelRendererTurbo(this, 481, 109, textureX, textureY, "lamp"); // Box 381
		class153Model[348] = new ModelRendererTurbo(this, 497, 109, textureX, textureY, "lamp"); // Box 382
		class153Model[349] = new ModelRendererTurbo(this, 481, 116, textureX, textureY, "lamp"); // Box 383
		class153Model[350] = new ModelRendererTurbo(this, 481, 116, textureX, textureY, "lamp"); // Box 384
		class153Model[351] = new ModelRendererTurbo(this, 481, 116, textureX, textureY, "lamp"); // Box 385
		class153Model[352] = new ModelRendererTurbo(this, 481, 116, textureX, textureY); // Box 386
		class153Model[353] = new ModelRendererTurbo(this, 481, 116, textureX, textureY, "lamp"); // Box 405
		class153Model[354] = new ModelRendererTurbo(this, 481, 116, textureX, textureY, "lamp"); // Box 406
		class153Model[355] = new ModelRendererTurbo(this, 481, 116, textureX, textureY, "lamp"); // Box 407
		class153Model[356] = new ModelRendererTurbo(this, 481, 116, textureX, textureY, "lamp"); // Box 408
		class153Model[357] = new ModelRendererTurbo(this, 481, 109, textureX, textureY, "lamp"); // Box 409
		class153Model[358] = new ModelRendererTurbo(this, 473, 109, textureX, textureY, "lamp"); // Box 410
		class153Model[359] = new ModelRendererTurbo(this, 497, 109, textureX, textureY, "lamp"); // Box 411
		class153Model[360] = new ModelRendererTurbo(this, 489, 109, textureX, textureY, "lamp"); // Box 412
		class153Model[361] = new ModelRendererTurbo(this, 497, 109, textureX, textureY, "lamp"); // Box 413
		class153Model[362] = new ModelRendererTurbo(this, 489, 109, textureX, textureY, "lamp"); // Box 414
		class153Model[363] = new ModelRendererTurbo(this, 481, 109, textureX, textureY, "lamp"); // Box 415
		class153Model[364] = new ModelRendererTurbo(this, 473, 109, textureX, textureY, "lamp"); // Box 416
		class153Model[365] = new ModelRendererTurbo(this, 481, 116, textureX, textureY, "lamp"); // Box 417
		class153Model[366] = new ModelRendererTurbo(this, 481, 116, textureX, textureY, "lamp"); // Box 418
		class153Model[367] = new ModelRendererTurbo(this, 481, 116, textureX, textureY, "lamp"); // Box 419
		class153Model[368] = new ModelRendererTurbo(this, 481, 116, textureX, textureY, "lamp"); // Box 420
		class153Model[369] = new ModelRendererTurbo(this, 201, 128, textureX, textureY); // Box 369
		class153Model[370] = new ModelRendererTurbo(this, 236, 128, textureX, textureY); // Box 372

		class153Model[0].addShapeBox(0F, 0F, 0F, 82, 2, 21, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F); // Box 13
		class153Model[0].setRotationPoint(-41F, 3F, -10.5F);

		class153Model[1].addShapeBox(0F, 0F, -1F, 80, 1, 1, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 20
		class153Model[1].setRotationPoint(-40F, -17F, -9.5F);

		class153Model[2].addShapeBox(0F, 0F, -1F, 80, 2, 1, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		class153Model[2].setRotationPoint(-40F, -19F, -9.5F);

		class153Model[3].addShapeBox(0F, 0F, -1F, 80, 1, 12, 0F, -3F, 0.5F, -5F, -3F, 0.5F, -5F, -3F, 0.5F, 0F, -3F, 0.5F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 5F, -3F, 0F, 5F); // Box 48
		class153Model[3].setRotationPoint(-40F, -20F, -7.5F);

		class153Model[4].addShapeBox(0F, 0F, -1F, 6, 2, 1, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 1F, 0F, 0.5F); // Box 50
		class153Model[4].setRotationPoint(-40F, 1F, 10F);

		class153Model[5].addShapeBox(0F, 0F, -1F, 6, 11, 1, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 51
		class153Model[5].setRotationPoint(-40F, -16F, 11F);

		class153Model[6].addShapeBox(0F, 0F, -1F, 6, 6, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 52
		class153Model[6].setRotationPoint(-40F, -5F, 11F);

		class153Model[7].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 1F, 0F, -0.75F, 1F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 56
		class153Model[7].setRotationPoint(28F, 3F, 10.5F);

		class153Model[8].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 1F, 0F, -0.75F, 1F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 57
		class153Model[8].setRotationPoint(-34F, 3F, 10.5F);

		class153Model[9].addShapeBox(0F, 0F, -1F, 80, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 61
		class153Model[9].setRotationPoint(-40F, -17F, 10.5F);

		class153Model[10].addShapeBox(0F, 0F, 0F, 1, 3, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, -2F, -2F); // Box 214
		class153Model[10].setRotationPoint(-42F, 3F, 4F);

		class153Model[11].addShapeBox(0F, 0F, -1F, 6, 11, 1, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 51
		class153Model[11].setRotationPoint(-34F, -16F, 11F);

		class153Model[12].addBox(0F, 0F, -1F, 6, 6, 1, 0F); // Box 52
		class153Model[12].setRotationPoint(-34F, -5F, 11F);

		class153Model[13].addShapeBox(0F, 0F, -1F, 6, 2, 1, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 53
		class153Model[13].setRotationPoint(-34F, 1F, 10F);

		class153Model[14].addShapeBox(0F, 0F, -1F, 56, 11, 1, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 54
		class153Model[14].setRotationPoint(-28F, -16F, 11F);

		class153Model[15].addBox(0F, 0F, -1F, 56, 6, 1, 0F); // Box 55
		class153Model[15].setRotationPoint(-28F, -5F, 11F);

		class153Model[16].addShapeBox(0F, 0F, -1F, 56, 2, 1, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 56
		class153Model[16].setRotationPoint(-28F, 1F, 10F);

		class153Model[17].addShapeBox(0F, 0F, -1F, 2, 2, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0.5F, 0F, 0F, 0F); // Box 63
		class153Model[17].setRotationPoint(-42F, 1F, 10F);

		class153Model[18].addShapeBox(0F, 0F, -1F, 2, 6, 1, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 64
		class153Model[18].setRotationPoint(-42F, -5F, 11F);

		class153Model[19].addShapeBox(0F, 0F, -1F, 2, 11, 1, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 65
		class153Model[19].setRotationPoint(-42F, -16F, 11F);

		class153Model[20].addBox(0F, 0F, 0F, 1, 19, 19, 0F); // Box 66
		class153Model[20].setRotationPoint(-42F, -16F, -9.5F);

		class153Model[21].addShapeBox(0F, 0F, -1F, 6, 2, 1, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 1F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 85
		class153Model[21].setRotationPoint(34F, 1F, 10F);

		class153Model[22].addShapeBox(0F, 0F, -1F, 2, 2, 1, 0F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F, 0.5F); // Box 86
		class153Model[22].setRotationPoint(40F, 1F, 10F);

		class153Model[23].addShapeBox(0F, 0F, -1F, 2, 6, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 87
		class153Model[23].setRotationPoint(40F, -5F, 11F);

		class153Model[24].addShapeBox(0F, 0F, -1F, 6, 6, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 88
		class153Model[24].setRotationPoint(34F, -5F, 11F);

		class153Model[25].addBox(0F, 0F, -1F, 6, 6, 1, 0F); // Box 89
		class153Model[25].setRotationPoint(28F, -5F, 11F);

		class153Model[26].addShapeBox(0F, 0F, -1F, 6, 2, 1, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 90
		class153Model[26].setRotationPoint(28F, 1F, 10F);

		class153Model[27].addShapeBox(0F, 0F, -1F, 6, 11, 1, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 91
		class153Model[27].setRotationPoint(28F, -16F, 11F);

		class153Model[28].addShapeBox(0F, 0F, -1F, 6, 11, 1, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 92
		class153Model[28].setRotationPoint(34F, -16F, 11F);

		class153Model[29].addShapeBox(0F, 0F, -1F, 2, 11, 1, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 93
		class153Model[29].setRotationPoint(40F, -16F, 11F);

		class153Model[30].addShapeBox(0F, 0F, 0F, 1, 3, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 94
		class153Model[30].setRotationPoint(-42F, 3F, -10F);

		class153Model[31].addShapeBox(0F, 0F, -1F, 2, 1, 1, 0F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F); // Box 95
		class153Model[31].setRotationPoint(-42F, -17F, 10.5F);

		class153Model[32].addBox(0F, 0F, 0F, 2, 18, 2, 0F); // Box 96
		class153Model[32].setRotationPoint(-44F, -16F, -4.5F);

		class153Model[33].addBox(0F, 0F, 0F, 2, 18, 2, 0F); // Box 97
		class153Model[33].setRotationPoint(-44F, -16F, 2.5F);

		class153Model[34].addBox(0F, 0F, 0F, 2, 1, 9, 0F); // Box 98
		class153Model[34].setRotationPoint(-44F, 2F, -4.5F);

		class153Model[35].addShapeBox(0F, 0F, 0F, 2, 3, 9, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 99
		class153Model[35].setRotationPoint(-44F, -19F, -4.5F);

		class153Model[36].addShapeBox(0F, 0F, -1F, 2, 11, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0F); // Box 100
		class153Model[36].setRotationPoint(40F, -16F, -10F);

		class153Model[37].addShapeBox(0F, 0F, -1F, 2, 6, 1, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0F); // Box 101
		class153Model[37].setRotationPoint(40F, -5F, -10F);

		class153Model[38].addShapeBox(0F, 0F, -1F, 2, 2, 1, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1F, -1F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 102
		class153Model[38].setRotationPoint(40F, 1F, -9F);

		class153Model[39].addShapeBox(0F, 0F, -1F, 6, 2, 1, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 1F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 103
		class153Model[39].setRotationPoint(34F, 1F, -9F);

		class153Model[40].addShapeBox(0F, 0F, -1F, 6, 6, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 104
		class153Model[40].setRotationPoint(34F, -5F, -10F);

		class153Model[41].addShapeBox(0F, 0F, -1F, 6, 11, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 105
		class153Model[41].setRotationPoint(34F, -16F, -10F);

		class153Model[42].addShapeBox(0F, 0F, -1F, 6, 11, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 106
		class153Model[42].setRotationPoint(28F, -16F, -10F);

		class153Model[43].addBox(0F, 0F, -1F, 6, 6, 1, 0F); // Box 107
		class153Model[43].setRotationPoint(28F, -5F, -10F);

		class153Model[44].addShapeBox(0F, 0F, -1F, 6, 2, 1, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 108
		class153Model[44].setRotationPoint(28F, 1F, -9F);

		class153Model[45].addShapeBox(0F, 0F, -1F, 56, 2, 1, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 109
		class153Model[45].setRotationPoint(-28F, 1F, -9F);

		class153Model[46].addBox(0F, 0F, -1F, 56, 6, 1, 0F); // Box 110
		class153Model[46].setRotationPoint(-28F, -5F, -10F);

		class153Model[47].addShapeBox(0F, 0F, -1F, 56, 11, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 111
		class153Model[47].setRotationPoint(-28F, -16F, -10F);

		class153Model[48].addShapeBox(0F, 0F, -1F, 6, 11, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 112
		class153Model[48].setRotationPoint(-34F, -16F, -10F);

		class153Model[49].addShapeBox(0F, 0F, -1F, 6, 11, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 113
		class153Model[49].setRotationPoint(-40F, -16F, -10F);

		class153Model[50].addShapeBox(0F, 0F, -1F, 2, 11, 1, 0F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F); // Box 114
		class153Model[50].setRotationPoint(-42F, -16F, -10F);

		class153Model[51].addShapeBox(0F, 0F, -1F, 6, 6, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 115
		class153Model[51].setRotationPoint(-40F, -5F, -10F);

		class153Model[52].addShapeBox(0F, 0F, -1F, 2, 6, 1, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F); // Box 116
		class153Model[52].setRotationPoint(-42F, -5F, -10F);

		class153Model[53].addShapeBox(0F, 0F, -1F, 2, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 117
		class153Model[53].setRotationPoint(-42F, 1F, -9F);

		class153Model[54].addShapeBox(0F, 0F, -1F, 6, 2, 1, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 1F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 118
		class153Model[54].setRotationPoint(-40F, 1F, -9F);

		class153Model[55].addShapeBox(0F, 0F, -1F, 6, 2, 1, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 119
		class153Model[55].setRotationPoint(-34F, 1F, -9F);

		class153Model[56].addBox(0F, 0F, -1F, 6, 6, 1, 0F); // Box 120
		class153Model[56].setRotationPoint(-34F, -5F, -10F);

		class153Model[57].addShapeBox(0F, 0F, -1F, 2, 1, 1, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 121
		class153Model[57].setRotationPoint(-42F, -17F, -9.5F);

		class153Model[58].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 79
		class153Model[58].setRotationPoint(-42.1F, -0.5F, 5F);

		class153Model[59].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 94
		class153Model[59].setRotationPoint(-42.1F, -0.5F, -9F);

		class153Model[60].addShapeBox(0F, 0F, 0F, 2, 1, 19, 0F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 140
		class153Model[60].setRotationPoint(-42F, -17F, -9.5F);

		class153Model[61].addShapeBox(0F, 0F, 0F, 2, 2, 19, 0F, 0F, -0.25F, -2F, 0F, -0.25F, -2F, 0F, -0.25F, -2F, 0F, -0.25F, -2F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F); // Box 142
		class153Model[61].setRotationPoint(-42F, -19F, -9.5F);

		class153Model[62].addShapeBox(0F, 0F, -1F, 2, 2, 1, 0F, 0F, 0F, -2.5F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2.5F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0.25F); // Box 143
		class153Model[62].setRotationPoint(-42F, -19F, -9.5F);

		class153Model[63].addBox(0F, 0F, 0F, 1, 19, 19, 0F); // Box 146
		class153Model[63].setRotationPoint(41F, -16F, -9.5F);

		class153Model[64].addShapeBox(0F, 0F, 0F, 2, 1, 19, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 147
		class153Model[64].setRotationPoint(40F, -17F, -9.5F);

		class153Model[65].addShapeBox(0F, 0F, -1F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F); // Box 150
		class153Model[65].setRotationPoint(40F, -17F, 10.5F);

		class153Model[66].addShapeBox(0F, 0F, -1F, 2, 1, 1, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 151
		class153Model[66].setRotationPoint(40F, -17F, -9.5F);

		class153Model[67].addBox(0F, 0F, 0F, 2, 1, 9, 0F); // Box 153
		class153Model[67].setRotationPoint(42F, 2F, -4.5F);

		class153Model[68].addBox(0F, 0F, 0F, 2, 18, 2, 0F); // Box 154
		class153Model[68].setRotationPoint(42F, -16F, -4.5F);

		class153Model[69].addBox(0F, 0F, 0F, 2, 18, 2, 0F); // Box 155
		class153Model[69].setRotationPoint(42F, -16F, 2.5F);

		class153Model[70].addShapeBox(0F, 0F, 0F, 2, 3, 9, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 156
		class153Model[70].setRotationPoint(42F, -19F, -4.5F);

		class153Model[71].addShapeBox(0F, 0F, 0F, 1, 3, 6, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, -2F, -2F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 157
		class153Model[71].setRotationPoint(41F, 3F, -10F);

		class153Model[72].addShapeBox(0F, 0F, 0F, 1, 3, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -2F, 0F, 0F, -1.5F); // Box 158
		class153Model[72].setRotationPoint(41F, 3F, 4F);

		class153Model[73].addShapeBox(0F, 0F, 0F, 2, 1, 16, 0F, 0F, -0.75F, -1F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F); // Box 178
		class153Model[73].setRotationPoint(-42F, -19.75F, -8F);

		class153Model[74].addShapeBox(0F, 0F, 0F, 2, 2, 19, 0F, 0F, -0.25F, -2F, 0F, -0.25F, -2F, 0F, -0.25F, -2F, 0F, -0.25F, -2F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F); // Box 179
		class153Model[74].setRotationPoint(40F, -19F, -9.5F);

		class153Model[75].addShapeBox(0F, 0F, -1F, 2, 2, 1, 0F, 0F, 0F, -2F, 0F, 0F, -2.5F, 0F, 0F, 2.5F, 0F, 0F, 2F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, 0.25F, 0F, 0F, 0F); // Box 180
		class153Model[75].setRotationPoint(40F, -19F, -9.5F);

		class153Model[76].addShapeBox(0F, 0F, 0F, 2, 1, 16, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -1F, 0F, -0.75F, -1F, 0F, -0.75F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F); // Box 181
		class153Model[76].setRotationPoint(40F, -19.75F, -8F);

		class153Model[77].addShapeBox(0F, 0F, -1F, 2, 1, 12, 0F, -2F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 4.5F); // Box 183
		class153Model[77].setRotationPoint(-42F, -20F, -7.5F);

		class153Model[78].addShapeBox(0F, 0F, -1F, 2, 1, 12, 0F, 0F, 0F, -5F, -2F, 0F, -5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 4.5F, 0F, 0F, 5F); // Box 184
		class153Model[78].setRotationPoint(40F, -20F, -7.5F);

		class153Model[79].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 1F, 0F, -0.75F, 1F); // Box 185
		class153Model[79].setRotationPoint(28F, 3F, -11.5F);

		class153Model[80].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 1F, 0F, -0.75F, 1F); // Box 186
		class153Model[80].setRotationPoint(-34F, 3F, -11.5F);

		class153Model[81].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 232
		class153Model[81].setRotationPoint(-34F, 6.5F, -8F);

		class153Model[82].addBox(0F, 0F, 0F, 1, 1, 16, 0F); // Box 233
		class153Model[82].setRotationPoint(-35F, 7F, -8F);

		class153Model[83].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 234
		class153Model[83].setRotationPoint(-36F, 6.5F, -8F);

		class153Model[84].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 235
		class153Model[84].setRotationPoint(-36F, 5F, -8F);

		class153Model[85].addBox(0F, 0F, 0F, 5, 5, 0, 0F); // Box 236
		class153Model[85].setRotationPoint(-37F, 5F, -5F);

		class153Model[86].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F); // Box 239
		class153Model[86].setRotationPoint(-29F, 4.5F, -8.3F);

		class153Model[87].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 240
		class153Model[87].setRotationPoint(-28F, 4.5F, -8.3F);

		class153Model[88].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F); // Box 241
		class153Model[88].setRotationPoint(-27F, 4.5F, -8.3F);

		class153Model[89].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 243
		class153Model[89].setRotationPoint(-30F, 6F, -8F);

		class153Model[90].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F); // Box 244
		class153Model[90].setRotationPoint(-25F, 5F, -8F);

		class153Model[91].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 0F); // Box 245
		class153Model[91].setRotationPoint(-32F, 5F, -8F);

		class153Model[92].addBox(0F, 0F, 0F, 3, 1, 14, 0F); // Box 246
		class153Model[92].setRotationPoint(-29F, 6F, -7F);

		class153Model[93].addBox(0F, 0F, 0F, 1, 1, 16, 0F); // Box 247
		class153Model[93].setRotationPoint(-21F, 7F, -8F);

		class153Model[94].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 248
		class153Model[94].setRotationPoint(-29F, 4F, -1F);

		class153Model[95].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 249
		class153Model[95].setRotationPoint(-22F, 6.5F, 7F);

		class153Model[96].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 250
		class153Model[96].setRotationPoint(-20F, 6.5F, 7F);

		class153Model[97].addBox(0F, 0F, 0F, 5, 5, 0, 0F); // Box 251
		class153Model[97].setRotationPoint(-23F, 5F, 5F);

		class153Model[98].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 252
		class153Model[98].setRotationPoint(-23F, 5F, 7F);

		class153Model[99].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F); // Box 253
		class153Model[99].setRotationPoint(-25F, 5F, 7F);

		class153Model[100].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F); // Box 257
		class153Model[100].setRotationPoint(-27F, 4.5F, 6.7F);

		class153Model[101].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 258
		class153Model[101].setRotationPoint(-28F, 4.5F, 6.7F);

		class153Model[102].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F); // Box 259
		class153Model[102].setRotationPoint(-29F, 4.5F, 6.7F);

		class153Model[103].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 262
		class153Model[103].setRotationPoint(-34F, 6.5F, 7F);

		class153Model[104].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 263
		class153Model[104].setRotationPoint(-36F, 5F, 7F);

		class153Model[105].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 0F); // Box 264
		class153Model[105].setRotationPoint(-32F, 5F, 7F);

		class153Model[106].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 265
		class153Model[106].setRotationPoint(-30F, 6F, 7F);

		class153Model[107].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 266
		class153Model[107].setRotationPoint(-36F, 6.5F, 7F);

		class153Model[108].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 268
		class153Model[108].setRotationPoint(-20F, 6.5F, -8F);

		class153Model[109].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 269
		class153Model[109].setRotationPoint(-23F, 5F, -8F);

		class153Model[110].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 270
		class153Model[110].setRotationPoint(-22F, 6.5F, -8F);

		class153Model[111].addBox(0F, 0F, 0F, 5, 5, 0, 0F); // Box 271
		class153Model[111].setRotationPoint(-23F, 5F, -5F);

		class153Model[112].addBox(0F, 0F, 0F, 5, 5, 0, 0F); // Box 272
		class153Model[112].setRotationPoint(-37F, 5F, 5F);

		class153Model[113].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 225
		class153Model[113].setRotationPoint(21F, 6.5F, -8F);

		class153Model[114].addBox(0F, 0F, 0F, 1, 1, 16, 0F); // Box 226
		class153Model[114].setRotationPoint(20F, 7F, -8F);

		class153Model[115].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 227
		class153Model[115].setRotationPoint(19F, 6.5F, -8F);

		class153Model[116].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 228
		class153Model[116].setRotationPoint(19F, 5F, -8F);

		class153Model[117].addBox(0F, 0F, 0F, 5, 5, 0, 0F); // Box 229
		class153Model[117].setRotationPoint(18F, 5F, -5F);

		class153Model[118].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F); // Box 232
		class153Model[118].setRotationPoint(26F, 4.5F, -8.3F);

		class153Model[119].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 233
		class153Model[119].setRotationPoint(27F, 4.5F, -8.3F);

		class153Model[120].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F); // Box 234
		class153Model[120].setRotationPoint(28F, 4.5F, -8.3F);

		class153Model[121].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 236
		class153Model[121].setRotationPoint(25F, 6F, -8F);

		class153Model[122].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F); // Box 237
		class153Model[122].setRotationPoint(30F, 5F, -8F);

		class153Model[123].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 0F); // Box 238
		class153Model[123].setRotationPoint(23F, 5F, -8F);

		class153Model[124].addBox(0F, 0F, 0F, 3, 1, 14, 0F); // Box 239
		class153Model[124].setRotationPoint(26F, 6F, -7F);

		class153Model[125].addBox(0F, 0F, 0F, 1, 1, 16, 0F); // Box 240
		class153Model[125].setRotationPoint(34F, 7F, -8F);

		class153Model[126].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 241
		class153Model[126].setRotationPoint(26F, 4F, -1F);

		class153Model[127].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 242
		class153Model[127].setRotationPoint(33F, 6.5F, 7F);

		class153Model[128].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 243
		class153Model[128].setRotationPoint(35F, 6.5F, 7F);

		class153Model[129].addBox(0F, 0F, 0F, 5, 5, 0, 0F); // Box 244
		class153Model[129].setRotationPoint(32F, 5F, 5F);

		class153Model[130].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 245
		class153Model[130].setRotationPoint(32F, 5F, 7F);

		class153Model[131].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F); // Box 246
		class153Model[131].setRotationPoint(30F, 5F, 7F);

		class153Model[132].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F); // Box 250
		class153Model[132].setRotationPoint(28F, 4.5F, 6.7F);

		class153Model[133].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 251
		class153Model[133].setRotationPoint(27F, 4.5F, 6.7F);

		class153Model[134].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F); // Box 252
		class153Model[134].setRotationPoint(26F, 4.5F, 6.7F);

		class153Model[135].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 253
		class153Model[135].setRotationPoint(21F, 6.5F, 7F);

		class153Model[136].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 254
		class153Model[136].setRotationPoint(19F, 5F, 7F);

		class153Model[137].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 0F); // Box 255
		class153Model[137].setRotationPoint(23F, 5F, 7F);

		class153Model[138].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 256
		class153Model[138].setRotationPoint(25F, 6F, 7F);

		class153Model[139].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 257
		class153Model[139].setRotationPoint(19F, 6.5F, 7F);

		class153Model[140].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 258
		class153Model[140].setRotationPoint(35F, 6.5F, -8F);

		class153Model[141].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 259
		class153Model[141].setRotationPoint(32F, 5F, -8F);

		class153Model[142].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 260
		class153Model[142].setRotationPoint(33F, 6.5F, -8F);

		class153Model[143].addBox(0F, 0F, 0F, 5, 5, 0, 0F); // Box 261
		class153Model[143].setRotationPoint(32F, 5F, -5F);

		class153Model[144].addBox(0F, 0F, 0F, 5, 5, 0, 0F); // Box 262
		class153Model[144].setRotationPoint(18F, 5F, 5F);

		class153Model[145].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F, 0.5F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, -0.5F, 0.5F, -0.5F, -0.5F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F); // 59
		class153Model[145].setRotationPoint(-44F, 3F, -1F);

		class153Model[146].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F); // 60
		class153Model[146].setRotationPoint(-44F, 5F, -1F);

		class153Model[147].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F); // 61
		class153Model[147].setRotationPoint(-45F, 4F, 0F);

		class153Model[148].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // 62
		class153Model[148].setRotationPoint(-44F, 4F, -1F);

		class153Model[149].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F, 0.5F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, -0.5F, 0.5F, -0.5F, -0.5F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F); // 59
		class153Model[149].setRotationPoint(41F, 3F, -1F);

		class153Model[150].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F); // 60
		class153Model[150].setRotationPoint(42.5F, 5F, -1F);

		class153Model[151].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F); // 61
		class153Model[151].setRotationPoint(39.5F, 4F, 0F);

		class153Model[152].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // 62
		class153Model[152].setRotationPoint(41F, 4F, -1F);

		class153Model[153].addShapeBox(0F, 0F, 0F, 10, 6, 18, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, -1.5F, -2.5F, 0F, -1.5F, -2.5F, 0F, -1.5F, -2.5F, 0F, -1.5F, -2.5F); // 54
		class153Model[153].setRotationPoint(-5F, 4.5F, -9F);

		class153Model[154].addBox(0F, 0F, 0F, 5, 4, 16, 0F); // Box 743
		class153Model[154].setRotationPoint(-16F, 4.5F, -8F);

		class153Model[155].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 60
		class153Model[155].setRotationPoint(-10F, 4.5F, 7.5F);

		class153Model[156].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 48
		class153Model[156].setRotationPoint(-10F, 4.5F, 8.5F);

		class153Model[157].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 747
		class153Model[157].setRotationPoint(-10F, 4.5F, 6.5F);

		class153Model[158].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 748
		class153Model[158].setRotationPoint(6F, 4.5F, -8.5F);

		class153Model[159].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 749
		class153Model[159].setRotationPoint(6F, 4.5F, -7.5F);

		class153Model[160].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 750
		class153Model[160].setRotationPoint(6F, 4.5F, -6.5F);

		class153Model[161].addBox(0F, 0F, 0F, 5, 4, 3, 0F); // Box 751
		class153Model[161].setRotationPoint(12F, 4.5F, -8F);

		class153Model[162].addBox(0F, 0F, 0F, 5, 4, 3, 0F); // Box 752
		class153Model[162].setRotationPoint(10F, 4.5F, 6F);

		class153Model[163].addBox(0F, 0F, 0F, 1, 20, 20, 0F); // Box 753
		class153Model[163].setRotationPoint(34F, -17F, -10F);

		class153Model[164].addShapeBox(0F, 0F, 0F, 9, 2, 20, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 955
		class153Model[164].setRotationPoint(26.5F, -19F, -10F);

		class153Model[165].addBox(0F, 0F, 0F, 1, 20, 20, 0F); // Box 956
		class153Model[165].setRotationPoint(-35F, -17F, -10F);

		class153Model[166].addShapeBox(0F, 0F, 0F, 9, 2, 20, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 957
		class153Model[166].setRotationPoint(-35.5F, -19F, -10F);

		class153Model[167].addShapeBox(0F, 0F, -1F, 2, 2, 1, 0F, 0F, 0F, 2F, 0F, 0F, 2.5F, 0F, 0F, -2.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.25F); // Box 959
		class153Model[167].setRotationPoint(40F, -19F, 10.5F);

		class153Model[168].addShapeBox(0F, 0F, -1F, 80, 2, 1, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 960
		class153Model[168].setRotationPoint(-40F, -19F, 10.5F);

		class153Model[169].addShapeBox(0F, 0F, -1F, 2, 2, 1, 0F, 0F, 0F, 2.5F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2.5F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.75F); // Box 961
		class153Model[169].setRotationPoint(-42F, -19F, 10.5F);

		class153Model[170].addShapeBox(0F, 0F, 0F, 1, 3, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -1F, 0F, 3F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 3.5F, 0F, 0F); // Box 962
		class153Model[170].setRotationPoint(-40F, 5.7F, -9F);

		class153Model[171].addShapeBox(0F, 0F, 0F, 1, 3, 9, 0F, 3F, -1F, 0F, -3F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3.5F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 963
		class153Model[171].setRotationPoint(-40F, 5.7F, 0F);

		class153Model[172].addShapeBox(0F, 0F, 0F, 1, 3, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, -1F, 0F, -3F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3.5F, 0F, 0F, -3F, 0F, 0F); // Box 964
		class153Model[172].setRotationPoint(39F, 5.7F, -9F);

		class153Model[173].addShapeBox(0F, 0F, 0F, 1, 3, 9, 0F, -3F, -1F, 0F, 3F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 965
		class153Model[173].setRotationPoint(39F, 5.7F, 0F);

		class153Model[174].addShapeBox(0F, 0F, 0F, 5, 2, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 966
		class153Model[174].setRotationPoint(22.5F, -19F, 1F);

		class153Model[175].addBox(0F, 0F, 0F, 5, 20, 9, 0F); // Box 967
		class153Model[175].setRotationPoint(22.5F, -17F, 1F);

		class153Model[176].addShapeBox(0F, 0F, 0F, 2, 20, 9, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 968
		class153Model[176].setRotationPoint(20.5F, -17F, 1F);

		class153Model[177].addShapeBox(0F, 0F, 0F, 2, 2, 9, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 969
		class153Model[177].setRotationPoint(20.5F, -19F, 1F);

		class153Model[178].addBox(0F, 0F, 0F, 1, 20, 3, 0F); // Box 970
		class153Model[178].setRotationPoint(26.5F, -17F, -10F);

		class153Model[179].addShapeBox(0F, 0F, -1F, 80, 1, 12, 0F, 0F, -0.25F, -5F, 0F, -0.25F, -5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F); // Box 972
		class153Model[179].setRotationPoint(-40F, -19F, -7.5F);

		class153Model[180].addBox(0F, 0F, 0F, 51, 1, 4, 0F); // Box 973
		class153Model[180].setRotationPoint(-26F, -16F, -10F);

		class153Model[181].addBox(0F, 0F, 0F, 43, 1, 4, 0F); // Box 974
		class153Model[181].setRotationPoint(-26F, -16F, 6F);

		class153Model[182].addBox(0F, 0F, 0F, 1, 20, 3, 0F); // Box 975
		class153Model[182].setRotationPoint(-27.5F, -17F, -10F);

		class153Model[183].addBox(0F, 0F, 0F, 1, 20, 3, 0F); // Box 977
		class153Model[183].setRotationPoint(-27.5F, -17F, 7F);

		class153Model[184].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box277
		class153Model[184].setRotationPoint(-38F, -2F, -8F);

		class153Model[185].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box278
		class153Model[185].setRotationPoint(-38F, -2F, -5F);

		class153Model[186].addBox(0F, 0F, 0F, 3, 1, 7, 0F); // Import Box174
		class153Model[186].setRotationPoint(-41.6F, -3.75F, -10F);

		class153Model[187].addShapeBox(0F, 0F, 0F, 1, 3, 7, 0F, -0.5F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Import Box175
		class153Model[187].setRotationPoint(-41.7F, -6.5F, -10F);

		class153Model[188].addShapeBox(0F, 0F, 0F, 1, 5, 2, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F); // Import Box182
		class153Model[188].setRotationPoint(-35.5F, -7F, -7F);

		class153Model[189].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box183
		class153Model[189].setRotationPoint(-36F, -6F, -5F);

		class153Model[190].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F); // Import Box184
		class153Model[190].setRotationPoint(-36F, -6F, -8F);

		class153Model[191].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box185
		class153Model[191].setRotationPoint(-38F, -2F, -8F);

		class153Model[192].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 104
		class153Model[192].setRotationPoint(-26F, -0.5F, -5.5F);

		class153Model[193].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 105
		class153Model[193].setRotationPoint(-26F, -0.5F, -9.5F);

		class153Model[194].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F, 0F, 0F, 0.2F, -0.5F, 0F, 0.2F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 106
		class153Model[194].setRotationPoint(-26.5F, -4.5F, -9.25F);

		class153Model[195].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, 0F, -0.1F, -0.5F, 0F, -0.1F, -0.5F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0.5F, 0.25F, -0.5F, 0.5F, 0.25F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 109
		class153Model[195].setRotationPoint(-26.5F, -6F, -9.25F);

		class153Model[196].addBox(0F, 0F, 0F, 2, 3, 2, 0F); // Box 116
		class153Model[196].setRotationPoint(-25.5F, 0.5F, -5F);

		class153Model[197].addBox(0F, 0F, 0F, 2, 3, 2, 0F); // Box 117
		class153Model[197].setRotationPoint(-25.5F, 0.5F, -9F);

		class153Model[198].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F, 0F, 0F, 0.2F, -0.5F, 0F, 0.2F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 994
		class153Model[198].setRotationPoint(-26.5F, -4.5F, -5.5F);

		class153Model[199].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, 0F, -0.1F, -0.5F, 0F, -0.1F, -0.5F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0.5F, 0.25F, -0.5F, 0.5F, 0.25F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 995
		class153Model[199].setRotationPoint(-26.5F, -6F, -5.5F);

		class153Model[200].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 1004
		class153Model[200].setRotationPoint(-20F, -0.5F, -9.5F);

		class153Model[201].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F, -0.5F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 1005
		class153Model[201].setRotationPoint(-17.5F, -4.5F, -9.25F);

		class153Model[202].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, 0F, -0.1F, -0.5F, 0F, -0.1F, -0.5F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0.5F, 0.25F, -0.5F, 0.5F, 0.25F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 1006
		class153Model[202].setRotationPoint(-17F, -6F, -9.25F);

		class153Model[203].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, 0F, -0.1F, -0.5F, 0F, -0.1F, -0.5F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0.5F, 0.25F, -0.5F, 0.5F, 0.25F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 1007
		class153Model[203].setRotationPoint(-17F, -6F, -5.5F);

		class153Model[204].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F, -0.5F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 1008
		class153Model[204].setRotationPoint(-17.5F, -4.5F, -5.5F);

		class153Model[205].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1009
		class153Model[205].setRotationPoint(-20F, -0.5F, -5.5F);

		class153Model[206].addBox(0F, 0F, 0F, 2, 3, 2, 0F); // Box 1010
		class153Model[206].setRotationPoint(-19.5F, 0.5F, -9F);

		class153Model[207].addBox(0F, 0F, 0F, 2, 3, 2, 0F); // Box 1011
		class153Model[207].setRotationPoint(-19.5F, 0.5F, -5F);

		class153Model[208].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 242
		class153Model[208].setRotationPoint(-26F, -0.5F, 7F);

		class153Model[209].addBox(0F, 0F, 0F, 2, 3, 2, 0F); // Box 243
		class153Model[209].setRotationPoint(-19.5F, 0.5F, 3.5F);

		class153Model[210].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 244
		class153Model[210].setRotationPoint(-20F, -0.5F, 3F);

		class153Model[211].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 245
		class153Model[211].setRotationPoint(-20F, -0.5F, 7F);

		class153Model[212].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F, -0.5F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 246
		class153Model[212].setRotationPoint(-17.5F, -4.5F, 7F);

		class153Model[213].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F, -0.5F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 247
		class153Model[213].setRotationPoint(-17.5F, -4.5F, 3.25F);

		class153Model[214].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, 0F, -0.1F, -0.5F, 0F, -0.1F, -0.5F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0.5F, 0.25F, -0.5F, 0.5F, 0.25F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 248
		class153Model[214].setRotationPoint(-17F, -6F, 3.25F);

		class153Model[215].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, 0F, -0.1F, -0.5F, 0F, -0.1F, -0.5F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0.5F, 0.25F, -0.5F, 0.5F, 0.25F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 249
		class153Model[215].setRotationPoint(-17F, -6F, 7F);

		class153Model[216].addBox(0F, 0F, 0F, 2, 3, 2, 0F); // Box 250
		class153Model[216].setRotationPoint(-25.5F, 0.5F, 3.5F);

		class153Model[217].addBox(0F, 0F, 0F, 2, 3, 2, 0F); // Box 251
		class153Model[217].setRotationPoint(-25.5F, 0.5F, 7.5F);

		class153Model[218].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 252
		class153Model[218].setRotationPoint(-26F, -0.5F, 3F);

		class153Model[219].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F, 0F, 0F, 0.2F, -0.5F, 0F, 0.2F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 253
		class153Model[219].setRotationPoint(-26.5F, -4.5F, 3.25F);

		class153Model[220].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F, 0F, 0F, 0.2F, -0.5F, 0F, 0.2F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 254
		class153Model[220].setRotationPoint(-26.5F, -4.5F, 7F);

		class153Model[221].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, 0F, -0.1F, -0.5F, 0F, -0.1F, -0.5F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0.5F, 0.25F, -0.5F, 0.5F, 0.25F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 255
		class153Model[221].setRotationPoint(-26.5F, -6F, 7F);

		class153Model[222].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, 0F, -0.1F, -0.5F, 0F, -0.1F, -0.5F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0.5F, 0.25F, -0.5F, 0.5F, 0.25F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 256
		class153Model[222].setRotationPoint(-26.5F, -6F, 3.25F);

		class153Model[223].addBox(0F, 0F, 0F, 2, 3, 2, 0F); // Box 257
		class153Model[223].setRotationPoint(-19.5F, 0.5F, 7.5F);

		class153Model[224].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 258
		class153Model[224].setRotationPoint(-16F, -0.5F, 7F);

		class153Model[225].addBox(0F, 0F, 0F, 2, 3, 2, 0F); // Box 259
		class153Model[225].setRotationPoint(-15.5F, 0.5F, 3.5F);

		class153Model[226].addBox(0F, 0F, 0F, 2, 3, 2, 0F); // Box 260
		class153Model[226].setRotationPoint(-15.5F, 0.5F, 7.5F);

		class153Model[227].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 261
		class153Model[227].setRotationPoint(-16F, -0.5F, 3F);

		class153Model[228].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F, 0F, 0F, 0.2F, -0.5F, 0F, 0.2F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 262
		class153Model[228].setRotationPoint(-16.5F, -4.5F, 3.25F);

		class153Model[229].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F, 0F, 0F, 0.2F, -0.5F, 0F, 0.2F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 263
		class153Model[229].setRotationPoint(-16.5F, -4.5F, 7F);

		class153Model[230].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, 0F, -0.1F, -0.5F, 0F, -0.1F, -0.5F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0.5F, 0.25F, -0.5F, 0.5F, 0.25F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 264
		class153Model[230].setRotationPoint(-16.5F, -6F, 7F);

		class153Model[231].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, 0F, -0.1F, -0.5F, 0F, -0.1F, -0.5F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0.5F, 0.25F, -0.5F, 0.5F, 0.25F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 265
		class153Model[231].setRotationPoint(-16.5F, -6F, 3.25F);

		class153Model[232].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 266
		class153Model[232].setRotationPoint(-16F, -0.5F, -5.5F);

		class153Model[233].addBox(0F, 0F, 0F, 2, 3, 2, 0F); // Box 267
		class153Model[233].setRotationPoint(-15.5F, 0.5F, -5F);

		class153Model[234].addBox(0F, 0F, 0F, 2, 3, 2, 0F); // Box 268
		class153Model[234].setRotationPoint(-15.5F, 0.5F, -9F);

		class153Model[235].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 269
		class153Model[235].setRotationPoint(-16F, -0.5F, -9.5F);

		class153Model[236].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F, 0F, 0F, 0.2F, -0.5F, 0F, 0.2F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 270
		class153Model[236].setRotationPoint(-16.5F, -4.5F, -9.25F);

		class153Model[237].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F, 0F, 0F, 0.2F, -0.5F, 0F, 0.2F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 271
		class153Model[237].setRotationPoint(-16.5F, -4.5F, -5.5F);

		class153Model[238].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, 0F, -0.1F, -0.5F, 0F, -0.1F, -0.5F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0.5F, 0.25F, -0.5F, 0.5F, 0.25F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 272
		class153Model[238].setRotationPoint(-16.5F, -6F, -5.5F);

		class153Model[239].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, 0F, -0.1F, -0.5F, 0F, -0.1F, -0.5F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0.5F, 0.25F, -0.5F, 0.5F, 0.25F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 273
		class153Model[239].setRotationPoint(-16.5F, -6F, -9.25F);

		class153Model[240].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 274
		class153Model[240].setRotationPoint(-11F, -0.5F, 7F);

		class153Model[241].addBox(0F, 0F, 0F, 2, 3, 2, 0F); // Box 275
		class153Model[241].setRotationPoint(-10.5F, 0.5F, 3.5F);

		class153Model[242].addBox(0F, 0F, 0F, 2, 3, 2, 0F); // Box 276
		class153Model[242].setRotationPoint(-10.5F, 0.5F, 7.5F);

		class153Model[243].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 277
		class153Model[243].setRotationPoint(-11F, -0.5F, 3F);

		class153Model[244].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F, 0F, 0F, 0.2F, -0.5F, 0F, 0.2F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 278
		class153Model[244].setRotationPoint(-11.5F, -4.5F, 3.25F);

		class153Model[245].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F, 0F, 0F, 0.2F, -0.5F, 0F, 0.2F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 279
		class153Model[245].setRotationPoint(-11.5F, -4.5F, 7F);

		class153Model[246].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, 0F, -0.1F, -0.5F, 0F, -0.1F, -0.5F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0.5F, 0.25F, -0.5F, 0.5F, 0.25F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 280
		class153Model[246].setRotationPoint(-11.5F, -6F, 7F);

		class153Model[247].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, 0F, -0.1F, -0.5F, 0F, -0.1F, -0.5F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0.5F, 0.25F, -0.5F, 0.5F, 0.25F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 281
		class153Model[247].setRotationPoint(-11.5F, -6F, 3.25F);

		class153Model[248].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 282
		class153Model[248].setRotationPoint(-11F, -0.5F, -5.5F);

		class153Model[249].addBox(0F, 0F, 0F, 2, 3, 2, 0F); // Box 283
		class153Model[249].setRotationPoint(-10.5F, 0.5F, -5F);

		class153Model[250].addBox(0F, 0F, 0F, 2, 3, 2, 0F); // Box 284
		class153Model[250].setRotationPoint(-10.5F, 0.5F, -9F);

		class153Model[251].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 285
		class153Model[251].setRotationPoint(-11F, -0.5F, -9.5F);

		class153Model[252].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F, 0F, 0F, 0.2F, -0.5F, 0F, 0.2F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 286
		class153Model[252].setRotationPoint(-11.5F, -4.5F, -9.25F);

		class153Model[253].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F, 0F, 0F, 0.2F, -0.5F, 0F, 0.2F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 287
		class153Model[253].setRotationPoint(-11.5F, -4.5F, -5.5F);

		class153Model[254].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, 0F, -0.1F, -0.5F, 0F, -0.1F, -0.5F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0.5F, 0.25F, -0.5F, 0.5F, 0.25F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 288
		class153Model[254].setRotationPoint(-11.5F, -6F, -5.5F);

		class153Model[255].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, 0F, -0.1F, -0.5F, 0F, -0.1F, -0.5F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0.5F, 0.25F, -0.5F, 0.5F, 0.25F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 289
		class153Model[255].setRotationPoint(-11.5F, -6F, -9.25F);

		class153Model[256].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 290
		class153Model[256].setRotationPoint(-5F, -0.5F, 7F);

		class153Model[257].addBox(0F, 0F, 0F, 2, 3, 2, 0F); // Box 291
		class153Model[257].setRotationPoint(-4.5F, 0.5F, 3.5F);

		class153Model[258].addBox(0F, 0F, 0F, 2, 3, 2, 0F); // Box 292
		class153Model[258].setRotationPoint(-4.5F, 0.5F, 7.5F);

		class153Model[259].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 293
		class153Model[259].setRotationPoint(-5F, -0.5F, 3F);

		class153Model[260].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F, 0F, 0F, 0.2F, -0.5F, 0F, 0.2F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 294
		class153Model[260].setRotationPoint(-5.5F, -4.5F, 3.25F);

		class153Model[261].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F, 0F, 0F, 0.2F, -0.5F, 0F, 0.2F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 295
		class153Model[261].setRotationPoint(-5.5F, -4.5F, 7F);

		class153Model[262].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, 0F, -0.1F, -0.5F, 0F, -0.1F, -0.5F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0.5F, 0.25F, -0.5F, 0.5F, 0.25F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 296
		class153Model[262].setRotationPoint(-5.5F, -6F, 7F);

		class153Model[263].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, 0F, -0.1F, -0.5F, 0F, -0.1F, -0.5F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0.5F, 0.25F, -0.5F, 0.5F, 0.25F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 297
		class153Model[263].setRotationPoint(-5.5F, -6F, 3.25F);

		class153Model[264].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 298
		class153Model[264].setRotationPoint(-5F, -0.5F, -5.5F);

		class153Model[265].addBox(0F, 0F, 0F, 2, 3, 2, 0F); // Box 299
		class153Model[265].setRotationPoint(-4.5F, 0.5F, -5F);

		class153Model[266].addBox(0F, 0F, 0F, 2, 3, 2, 0F); // Box 300
		class153Model[266].setRotationPoint(-4.5F, 0.5F, -9F);

		class153Model[267].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 301
		class153Model[267].setRotationPoint(-5F, -0.5F, -9.5F);

		class153Model[268].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F, 0F, 0F, 0.2F, -0.5F, 0F, 0.2F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 302
		class153Model[268].setRotationPoint(-5.5F, -4.5F, -9.25F);

		class153Model[269].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F, 0F, 0F, 0.2F, -0.5F, 0F, 0.2F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 303
		class153Model[269].setRotationPoint(-5.5F, -4.5F, -5.5F);

		class153Model[270].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, 0F, -0.1F, -0.5F, 0F, -0.1F, -0.5F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0.5F, 0.25F, -0.5F, 0.5F, 0.25F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 304
		class153Model[270].setRotationPoint(-5.5F, -6F, -5.5F);

		class153Model[271].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, 0F, -0.1F, -0.5F, 0F, -0.1F, -0.5F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0.5F, 0.25F, -0.5F, 0.5F, 0.25F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 305
		class153Model[271].setRotationPoint(-5.5F, -6F, -9.25F);

		class153Model[272].addBox(0F, 0F, 0F, 2, 3, 2, 0F); // Box 306
		class153Model[272].setRotationPoint(2.5F, 0.5F, 3.5F);

		class153Model[273].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 307
		class153Model[273].setRotationPoint(2F, -0.5F, 3F);

		class153Model[274].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F, -0.5F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 308
		class153Model[274].setRotationPoint(4.5F, -4.5F, 3.25F);

		class153Model[275].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F, -0.5F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 309
		class153Model[275].setRotationPoint(4.5F, -4.5F, 7F);

		class153Model[276].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 310
		class153Model[276].setRotationPoint(2F, -0.5F, 7F);

		class153Model[277].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, 0F, -0.1F, -0.5F, 0F, -0.1F, -0.5F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0.5F, 0.25F, -0.5F, 0.5F, 0.25F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 311
		class153Model[277].setRotationPoint(5F, -6F, 7F);

		class153Model[278].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, 0F, -0.1F, -0.5F, 0F, -0.1F, -0.5F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0.5F, 0.25F, -0.5F, 0.5F, 0.25F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 312
		class153Model[278].setRotationPoint(5F, -6F, 3.25F);

		class153Model[279].addBox(0F, 0F, 0F, 2, 3, 2, 0F); // Box 313
		class153Model[279].setRotationPoint(2.5F, 0.5F, 7.5F);

		class153Model[280].addBox(0F, 0F, 0F, 2, 3, 2, 0F); // Box 314
		class153Model[280].setRotationPoint(2.5F, 0.5F, -5F);

		class153Model[281].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 315
		class153Model[281].setRotationPoint(2F, -0.5F, -5.5F);

		class153Model[282].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F, -0.5F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 316
		class153Model[282].setRotationPoint(4.5F, -4.5F, -5.5F);

		class153Model[283].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F, -0.5F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 317
		class153Model[283].setRotationPoint(4.5F, -4.5F, -9.25F);

		class153Model[284].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 318
		class153Model[284].setRotationPoint(2F, -0.5F, -9.5F);

		class153Model[285].addBox(0F, 0F, 0F, 2, 3, 2, 0F); // Box 319
		class153Model[285].setRotationPoint(2.5F, 0.5F, -9F);

		class153Model[286].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, 0F, -0.1F, -0.5F, 0F, -0.1F, -0.5F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0.5F, 0.25F, -0.5F, 0.5F, 0.25F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 320
		class153Model[286].setRotationPoint(5F, -6F, -5.5F);

		class153Model[287].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, 0F, -0.1F, -0.5F, 0F, -0.1F, -0.5F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0.5F, 0.25F, -0.5F, 0.5F, 0.25F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 321
		class153Model[287].setRotationPoint(5F, -6F, -9.25F);

		class153Model[288].addBox(0F, 0F, 0F, 2, 3, 2, 0F); // Box 322
		class153Model[288].setRotationPoint(13.5F, 0.5F, 3.5F);

		class153Model[289].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 323
		class153Model[289].setRotationPoint(13F, -0.5F, 3F);

		class153Model[290].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F, -0.5F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 324
		class153Model[290].setRotationPoint(15.5F, -4.5F, 3.25F);

		class153Model[291].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F, -0.5F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 325
		class153Model[291].setRotationPoint(15.5F, -4.5F, 7F);

		class153Model[292].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 326
		class153Model[292].setRotationPoint(13F, -0.5F, 7F);

		class153Model[293].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, 0F, -0.1F, -0.5F, 0F, -0.1F, -0.5F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0.5F, 0.25F, -0.5F, 0.5F, 0.25F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 327
		class153Model[293].setRotationPoint(16F, -6F, 7F);

		class153Model[294].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, 0F, -0.1F, -0.5F, 0F, -0.1F, -0.5F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0.5F, 0.25F, -0.5F, 0.5F, 0.25F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 328
		class153Model[294].setRotationPoint(16F, -6F, 3.25F);

		class153Model[295].addBox(0F, 0F, 0F, 2, 3, 2, 0F); // Box 329
		class153Model[295].setRotationPoint(13.5F, 0.5F, 7.5F);

		class153Model[296].addBox(0F, 0F, 0F, 2, 3, 2, 0F); // Box 330
		class153Model[296].setRotationPoint(13.5F, 0.5F, -5F);

		class153Model[297].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 331
		class153Model[297].setRotationPoint(13F, -0.5F, -5.5F);

		class153Model[298].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F, -0.5F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 332
		class153Model[298].setRotationPoint(15.5F, -4.5F, -5.5F);

		class153Model[299].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F, -0.5F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 333
		class153Model[299].setRotationPoint(15.5F, -4.5F, -9.25F);

		class153Model[300].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 334
		class153Model[300].setRotationPoint(13F, -0.5F, -9.5F);

		class153Model[301].addBox(0F, 0F, 0F, 2, 3, 2, 0F); // Box 335
		class153Model[301].setRotationPoint(13.5F, 0.5F, -9F);

		class153Model[302].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, 0F, -0.1F, -0.5F, 0F, -0.1F, -0.5F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0.5F, 0.25F, -0.5F, 0.5F, 0.25F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 336
		class153Model[302].setRotationPoint(16F, -6F, -5.5F);

		class153Model[303].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, 0F, -0.1F, -0.5F, 0F, -0.1F, -0.5F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0.5F, 0.25F, -0.5F, 0.5F, 0.25F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 337
		class153Model[303].setRotationPoint(16F, -6F, -9.25F);

		class153Model[304].addBox(0F, 0F, 0F, 2, 3, 2, 0F); // Box 338
		class153Model[304].setRotationPoint(6.5F, 0.5F, 3.5F);

		class153Model[305].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 339
		class153Model[305].setRotationPoint(6F, -0.5F, 3F);

		class153Model[306].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F, 0F, 0F, 0.2F, -0.5F, 0F, 0.2F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 340
		class153Model[306].setRotationPoint(5.5F, -4.5F, 3.25F);

		class153Model[307].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 341
		class153Model[307].setRotationPoint(6F, -0.5F, 7F);

		class153Model[308].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F, 0F, 0F, 0.2F, -0.5F, 0F, 0.2F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 342
		class153Model[308].setRotationPoint(5.5F, -4.5F, 7F);

		class153Model[309].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, 0F, -0.1F, -0.5F, 0F, -0.1F, -0.5F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0.5F, 0.25F, -0.5F, 0.5F, 0.25F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 343
		class153Model[309].setRotationPoint(5.5F, -6F, 3.25F);

		class153Model[310].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, 0F, -0.1F, -0.5F, 0F, -0.1F, -0.5F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0.5F, 0.25F, -0.5F, 0.5F, 0.25F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 344
		class153Model[310].setRotationPoint(5.5F, -6F, 7F);

		class153Model[311].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 345
		class153Model[311].setRotationPoint(6F, -0.5F, -5.5F);

		class153Model[312].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F, 0F, 0F, 0.2F, -0.5F, 0F, 0.2F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 346
		class153Model[312].setRotationPoint(5.5F, -4.5F, -5.5F);

		class153Model[313].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, 0F, -0.1F, -0.5F, 0F, -0.1F, -0.5F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0.5F, 0.25F, -0.5F, 0.5F, 0.25F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 347
		class153Model[313].setRotationPoint(5.5F, -6F, -5.5F);

		class153Model[314].addBox(0F, 0F, 0F, 2, 3, 2, 0F); // Box 348
		class153Model[314].setRotationPoint(6.5F, 0.5F, -5F);

		class153Model[315].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F, 0F, 0F, 0.2F, -0.5F, 0F, 0.2F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 349
		class153Model[315].setRotationPoint(5.5F, -4.5F, -9.25F);

		class153Model[316].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 350
		class153Model[316].setRotationPoint(6F, -0.5F, -9.5F);

		class153Model[317].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, 0F, -0.1F, -0.5F, 0F, -0.1F, -0.5F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0.5F, 0.25F, -0.5F, 0.5F, 0.25F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 351
		class153Model[317].setRotationPoint(5.5F, -6F, -9.25F);

		class153Model[318].addBox(0F, 0F, 0F, 2, 3, 2, 0F); // Box 352
		class153Model[318].setRotationPoint(6.5F, 0.5F, -9F);

		class153Model[319].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 353
		class153Model[319].setRotationPoint(23F, -0.5F, -5.5F);

		class153Model[320].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 354
		class153Model[320].setRotationPoint(23F, -0.5F, -9.5F);

		class153Model[321].addBox(0F, 0F, 0F, 2, 3, 2, 0F); // Box 355
		class153Model[321].setRotationPoint(23.5F, 0.5F, -9F);

		class153Model[322].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F, -0.5F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 356
		class153Model[322].setRotationPoint(25.5F, -4.5F, -9.25F);

		class153Model[323].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F, -0.5F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 357
		class153Model[323].setRotationPoint(25.5F, -4.5F, -5.5F);

		class153Model[324].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, 0F, -0.1F, -0.5F, 0F, -0.1F, -0.5F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0.5F, 0.25F, -0.5F, 0.5F, 0.25F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 358
		class153Model[324].setRotationPoint(26F, -6F, -5.5F);

		class153Model[325].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, 0F, -0.1F, -0.5F, 0F, -0.1F, -0.5F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0.5F, 0.25F, -0.5F, 0.5F, 0.25F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 359
		class153Model[325].setRotationPoint(26F, -6F, -9.25F);

		class153Model[326].addBox(0F, 0F, 0F, 2, 3, 2, 0F); // Box 360
		class153Model[326].setRotationPoint(23.5F, 0.5F, -5F);

		class153Model[327].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 361
		class153Model[327].setRotationPoint(18F, -0.5F, -5.5F);

		class153Model[328].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 362
		class153Model[328].setRotationPoint(18F, -0.5F, -9.5F);

		class153Model[329].addBox(0F, 0F, 0F, 2, 3, 2, 0F); // Box 363
		class153Model[329].setRotationPoint(18.5F, 0.5F, -9F);

		class153Model[330].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F, -0.5F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 364
		class153Model[330].setRotationPoint(20.5F, -4.5F, -9.25F);

		class153Model[331].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F, -0.5F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 365
		class153Model[331].setRotationPoint(20.5F, -4.5F, -5.5F);

		class153Model[332].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, 0F, -0.1F, -0.5F, 0F, -0.1F, -0.5F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0.5F, 0.25F, -0.5F, 0.5F, 0.25F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 366
		class153Model[332].setRotationPoint(21F, -6F, -5.5F);

		class153Model[333].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, 0F, -0.1F, -0.5F, 0F, -0.1F, -0.5F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0.5F, 0.25F, -0.5F, 0.5F, 0.25F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 367
		class153Model[333].setRotationPoint(21F, -6F, -9.25F);

		class153Model[334].addBox(0F, 0F, 0F, 2, 3, 2, 0F); // Box 368
		class153Model[334].setRotationPoint(18.5F, 0.5F, -5F);

		class153Model[335].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 369
		class153Model[335].setRotationPoint(41.2F, -4F, 5F);

		class153Model[336].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.6F, -0.5F, 0F, -0.6F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 370
		class153Model[336].setRotationPoint(41.25F, -4F, 7.5F);

		class153Model[337].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.6F, -0.5F, 0F, -0.6F, -0.5F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 371
		class153Model[337].setRotationPoint(41.25F, -4F, 6.5F);

		class153Model[338].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, -0.5F, 0F, -0.6F, -0.5F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 372
		class153Model[338].setRotationPoint(41.25F, -3F, 6.5F);

		class153Model[339].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.6F, -0.5F, 0F, -0.6F, -0.5F); // Box 373
		class153Model[339].setRotationPoint(41.25F, -3F, 7.5F);

		class153Model[340].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.6F, -0.5F, 0F, -0.6F, -0.5F); // Box 374
		class153Model[340].setRotationPoint(41.25F, -3F, 6F);

		class153Model[341].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, -0.5F, 0F, -0.6F, -0.5F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 375
		class153Model[341].setRotationPoint(41.25F, -3F, 5F);

		class153Model[342].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.6F, -0.5F, 0F, -0.6F, -0.5F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 376
		class153Model[342].setRotationPoint(41.25F, -4F, 5F);

		class153Model[343].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.6F, -0.5F, 0F, -0.6F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 377
		class153Model[343].setRotationPoint(41.25F, -4F, 6F);

		class153Model[344].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 378
		class153Model[344].setRotationPoint(41.2F, -4F, -9F);

		class153Model[345].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.6F, -0.5F, 0F, -0.6F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 379
		class153Model[345].setRotationPoint(41.25F, -4F, -7.5F);

		class153Model[346].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, -0.5F, 0F, -0.6F, -0.5F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 380
		class153Model[346].setRotationPoint(41.25F, -3F, -8.5F);

		class153Model[347].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.6F, -0.5F, 0F, -0.6F, -0.5F); // Box 381
		class153Model[347].setRotationPoint(41.25F, -3F, -7.5F);

		class153Model[348].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.6F, -0.5F, 0F, -0.6F, -0.5F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 382
		class153Model[348].setRotationPoint(41.25F, -4F, -8.5F);

		class153Model[349].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.6F, -0.5F, 0F, -0.6F, -0.5F); // Box 383
		class153Model[349].setRotationPoint(41.25F, -3F, -6F);

		class153Model[350].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, -0.5F, 0F, -0.6F, -0.5F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 384
		class153Model[350].setRotationPoint(41.25F, -3F, -7F);

		class153Model[351].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.6F, -0.5F, 0F, -0.6F, -0.5F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 385
		class153Model[351].setRotationPoint(41.25F, -4F, -7F);

		class153Model[352].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.6F, -0.5F, 0F, -0.6F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 386
		class153Model[352].setRotationPoint(41.25F, -4F, -6F);

		class153Model[353].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.6F, -0.5F, 0F, -0.6F, -0.5F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 405
		class153Model[353].setRotationPoint(-42.2F, -0.5F, -7F);

		class153Model[354].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.6F, -0.5F, 0F, -0.6F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 406
		class153Model[354].setRotationPoint(-42.2F, -0.5F, -6F);

		class153Model[355].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.6F, -0.5F, 0F, -0.6F, -0.5F); // Box 407
		class153Model[355].setRotationPoint(-42.2F, 0.5F, -6F);

		class153Model[356].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, -0.5F, 0F, -0.6F, -0.5F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 408
		class153Model[356].setRotationPoint(-42.2F, 0.5F, -7F);

		class153Model[357].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.6F, -0.5F, 0F, -0.6F, -0.5F); // Box 409
		class153Model[357].setRotationPoint(-42.2F, 0.5F, -7.5F);

		class153Model[358].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, -0.5F, 0F, -0.6F, -0.5F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 410
		class153Model[358].setRotationPoint(-42.2F, 0.5F, -8.5F);

		class153Model[359].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.6F, -0.5F, 0F, -0.6F, -0.5F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 411
		class153Model[359].setRotationPoint(-42.2F, -0.5F, -8.5F);

		class153Model[360].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.6F, -0.5F, 0F, -0.6F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 412
		class153Model[360].setRotationPoint(-42.2F, -0.5F, -7.5F);

		class153Model[361].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.6F, -0.5F, 0F, -0.6F, -0.5F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 413
		class153Model[361].setRotationPoint(-42.2F, -0.5F, 6.5F);

		class153Model[362].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.6F, -0.5F, 0F, -0.6F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 414
		class153Model[362].setRotationPoint(-42.2F, -0.5F, 7.5F);

		class153Model[363].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.6F, -0.5F, 0F, -0.6F, -0.5F); // Box 415
		class153Model[363].setRotationPoint(-42.2F, 0.5F, 7.5F);

		class153Model[364].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, -0.5F, 0F, -0.6F, -0.5F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 416
		class153Model[364].setRotationPoint(-42.2F, 0.5F, 6.5F);

		class153Model[365].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.6F, -0.5F, 0F, -0.6F, -0.5F); // Box 417
		class153Model[365].setRotationPoint(-42.2F, 0.5F, 6F);

		class153Model[366].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, -0.5F, 0F, -0.6F, -0.5F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 418
		class153Model[366].setRotationPoint(-42.2F, 0.5F, 5F);

		class153Model[367].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.6F, -0.5F, 0F, -0.6F, -0.5F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 419
		class153Model[367].setRotationPoint(-42.2F, -0.5F, 5F);

		class153Model[368].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.6F, -0.5F, 0F, -0.6F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 420
		class153Model[368].setRotationPoint(-42.2F, -0.5F, 6F);

		class153Model[369].addShapeBox(0F, 0F, -1F, 3, 1, 12, 0F, 0F, 0F, -5F, 0F, 0.5F, -5F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F); // Box 369
		class153Model[369].setRotationPoint(-40F, -20F, -7.5F);

		class153Model[370].addShapeBox(0F, 0F, -1F, 3, 1, 12, 0F, 0F, 0.5F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F); // Box 372
		class153Model[370].setRotationPoint(37F, -20F, -7.5F);


	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		for (int i = 0; i < 371; i++) {
			if (class153Model[i].boxName != null && class153Model[i].boxName.contains("lamp") ) {
				Minecraft.getMinecraft().entityRenderer.disableLightmap(1D);
				class153Model[i].render(f5);
				Minecraft.getMinecraft().entityRenderer.enableLightmap(1D);
			}else if (class153Model[i].boxName != null && class153Model[i].boxName.contains("cull")) {
				GL11.glDisable(GL11.GL_CULL_FACE);
				class153Model[i].render(f5);
				GL11.glEnable(GL11.GL_CULL_FACE);
			} else {
				class153Model[i].render(f5);
			}
		}
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
	{
	}

	public ModelRendererTurbo class153Model[];
}