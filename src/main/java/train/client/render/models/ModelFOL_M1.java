//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2018 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: FOL-m1
// Model Creator:
// Created on:05.12.2018 - 10:46:56
// Last changed on: 05.12.2018 - 10:46:56

package train.client.render.models;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import tmt.ModelBase;
import tmt.ModelRendererTurbo;
import tmt.Tessellator;
import train.common.api.AbstractTrains;
import train.common.library.Info;

public class ModelFOL_M1 extends ModelBase
{
	int textureX = 512;
	int textureY = 512;

	public ModelFOL_M1()
	{
		fol_m1Model = new ModelRendererTurbo[188];
		fol_m1Model[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		fol_m1Model[1] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 1
		fol_m1Model[2] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 2
		fol_m1Model[3] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 3
		fol_m1Model[4] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 4
		fol_m1Model[5] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 5
		fol_m1Model[6] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 6
		fol_m1Model[7] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 7
		fol_m1Model[8] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 8
		fol_m1Model[9] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 9
		fol_m1Model[10] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 11
		fol_m1Model[11] = new ModelRendererTurbo(this, 113, 1, textureX, textureY, "lamp"); // Box 12 lamp
		fol_m1Model[12] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 14
		fol_m1Model[13] = new ModelRendererTurbo(this, 281, 17, textureX, textureY); // Box 15
		fol_m1Model[14] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Box 17
		fol_m1Model[15] = new ModelRendererTurbo(this, 81, 17, textureX, textureY); // Box 18
		fol_m1Model[16] = new ModelRendererTurbo(this, 137, 33, textureX, textureY); // Box 19
		fol_m1Model[17] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 20
		fol_m1Model[18] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 23
		fol_m1Model[19] = new ModelRendererTurbo(this, 257, 41, textureX, textureY); // Box 24
		fol_m1Model[20] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 25
		fol_m1Model[21] = new ModelRendererTurbo(this, 353, 41, textureX, textureY); // Box 26
		fol_m1Model[22] = new ModelRendererTurbo(this, 409, 41, textureX, textureY); // Box 27
		fol_m1Model[23] = new ModelRendererTurbo(this, 113, 65, textureX, textureY); // Box 28
		fol_m1Model[24] = new ModelRendererTurbo(this, 41, 57, textureX, textureY); // Box 29
		fol_m1Model[25] = new ModelRendererTurbo(this, 201, 65, textureX, textureY); // Box 30
		fol_m1Model[26] = new ModelRendererTurbo(this, 441, 65, textureX, textureY); // Box 33
		fol_m1Model[27] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 34
		fol_m1Model[28] = new ModelRendererTurbo(this, 257, 81, textureX, textureY); // Box 35
		fol_m1Model[29] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 36
		fol_m1Model[30] = new ModelRendererTurbo(this, 97, 81, textureX, textureY); // Box 37
		fol_m1Model[31] = new ModelRendererTurbo(this, 385, 89, textureX, textureY); // Box 38
		fol_m1Model[32] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 40
		fol_m1Model[33] = new ModelRendererTurbo(this, 113, 17, textureX, textureY); // Box 41
		fol_m1Model[34] = new ModelRendererTurbo(this, 385, 41, textureX, textureY); // Box 42
		fol_m1Model[35] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 43
		fol_m1Model[36] = new ModelRendererTurbo(this, 273, 25, textureX, textureY); // Box 44
		fol_m1Model[37] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 45
		fol_m1Model[38] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 46
		fol_m1Model[39] = new ModelRendererTurbo(this, 113, 33, textureX, textureY); // Box 47
		fol_m1Model[40] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 48
		fol_m1Model[41] = new ModelRendererTurbo(this, 233, 33, textureX, textureY); // Box 44
		fol_m1Model[42] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 44
		fol_m1Model[43] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 45
		fol_m1Model[44] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 46
		fol_m1Model[45] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 47
		fol_m1Model[46] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 48
		fol_m1Model[47] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 49
		fol_m1Model[48] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 50
		fol_m1Model[49] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 51
		fol_m1Model[50] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 52
		fol_m1Model[51] = new ModelRendererTurbo(this, 265, 33, textureX, textureY); // Box 53
		fol_m1Model[52] = new ModelRendererTurbo(this, 41, 41, textureX, textureY); // Box 54
		fol_m1Model[53] = new ModelRendererTurbo(this, 233, 41, textureX, textureY); // Box 55
		fol_m1Model[54] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 56
		fol_m1Model[55] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 57
		fol_m1Model[56] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 58
		fol_m1Model[57] = new ModelRendererTurbo(this, 449, 9, textureX, textureY); // Box 59
		fol_m1Model[58] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 60
		fol_m1Model[59] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 61
		fol_m1Model[60] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 62
		fol_m1Model[61] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 63
		fol_m1Model[62] = new ModelRendererTurbo(this, 81, 9, textureX, textureY); // Box 64
		fol_m1Model[63] = new ModelRendererTurbo(this, 457, 9, textureX, textureY); // Box 65
		fol_m1Model[64] = new ModelRendererTurbo(this, 89, 17, textureX, textureY); // Box 66
		fol_m1Model[65] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 67
		fol_m1Model[66] = new ModelRendererTurbo(this, 145, 33, textureX, textureY); // Box 68
		fol_m1Model[67] = new ModelRendererTurbo(this, 465, 9, textureX, textureY); // Box 69
		fol_m1Model[68] = new ModelRendererTurbo(this, 505, 9, textureX, textureY); // Box 70
		fol_m1Model[69] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Box 71
		fol_m1Model[70] = new ModelRendererTurbo(this, 337, 41, textureX, textureY); // Box 72
		fol_m1Model[71] = new ModelRendererTurbo(this, 441, 41, textureX, textureY); // Box 73
		fol_m1Model[72] = new ModelRendererTurbo(this, 473, 41, textureX, textureY); // Box 74
		fol_m1Model[73] = new ModelRendererTurbo(this, 65, 17, textureX, textureY); // Box 75
		fol_m1Model[74] = new ModelRendererTurbo(this, 41, 49, textureX, textureY); // Box 80
		fol_m1Model[75] = new ModelRendererTurbo(this, 441, 49, textureX, textureY); // Box 82
		fol_m1Model[76] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 83
		fol_m1Model[77] = new ModelRendererTurbo(this, 113, 17, textureX, textureY); // Box 84
		fol_m1Model[78] = new ModelRendererTurbo(this, 353, 49, textureX, textureY); // Box 85
		fol_m1Model[79] = new ModelRendererTurbo(this, 385, 9, textureX, textureY); // Box 86
		fol_m1Model[80] = new ModelRendererTurbo(this, 385, 41, textureX, textureY); // Box 87
		fol_m1Model[81] = new ModelRendererTurbo(this, 417, 41, textureX, textureY); // Box 88
		fol_m1Model[82] = new ModelRendererTurbo(this, 481, 49, textureX, textureY); // Box 89
		fol_m1Model[83] = new ModelRendererTurbo(this, 497, 49, textureX, textureY); // Box 90
		fol_m1Model[84] = new ModelRendererTurbo(this, 177, 65, textureX, textureY); // Box 91
		fol_m1Model[85] = new ModelRendererTurbo(this, 145, 17, textureX, textureY); // Box 92
		fol_m1Model[86] = new ModelRendererTurbo(this, 505, 17, textureX, textureY); // Box 93
		fol_m1Model[87] = new ModelRendererTurbo(this, 161, 25, textureX, textureY); // Box 94
		fol_m1Model[88] = new ModelRendererTurbo(this, 177, 25, textureX, textureY); // Box 95
		fol_m1Model[89] = new ModelRendererTurbo(this, 233, 25, textureX, textureY); // Box 96
		fol_m1Model[90] = new ModelRendererTurbo(this, 505, 25, textureX, textureY); // Box 97
		fol_m1Model[91] = new ModelRendererTurbo(this, 385, 57, textureX, textureY); // Box 98
		fol_m1Model[92] = new ModelRendererTurbo(this, 17, 33, textureX, textureY); // Box 99
		fol_m1Model[93] = new ModelRendererTurbo(this, 41, 33, textureX, textureY); // Box 100
		fol_m1Model[94] = new ModelRendererTurbo(this, 49, 33, textureX, textureY); // Box 101
		fol_m1Model[95] = new ModelRendererTurbo(this, 505, 33, textureX, textureY); // Box 102
		fol_m1Model[96] = new ModelRendererTurbo(this, 137, 41, textureX, textureY); // Box 103
		fol_m1Model[97] = new ModelRendererTurbo(this, 17, 41, textureX, textureY); // Box 104
		fol_m1Model[98] = new ModelRendererTurbo(this, 369, 41, textureX, textureY); // Box 105
		fol_m1Model[99] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 106
		fol_m1Model[100] = new ModelRendererTurbo(this, 137, 49, textureX, textureY); // Box 107
		fol_m1Model[101] = new ModelRendererTurbo(this, 233, 49, textureX, textureY); // Box 263
		fol_m1Model[102] = new ModelRendererTurbo(this, 441, 57, textureX, textureY); // Box 265
		fol_m1Model[103] = new ModelRendererTurbo(this, 505, 41, textureX, textureY); // Box 266
		fol_m1Model[104] = new ModelRendererTurbo(this, 369, 49, textureX, textureY); // Box 267
		fol_m1Model[105] = new ModelRendererTurbo(this, 73, 73, textureX, textureY); // Box 268
		fol_m1Model[106] = new ModelRendererTurbo(this, 193, 65, textureX, textureY); // Box 269
		fol_m1Model[107] = new ModelRendererTurbo(this, 233, 65, textureX, textureY); // Box 270
		fol_m1Model[108] = new ModelRendererTurbo(this, 105, 97, textureX, textureY); // Box 271
		fol_m1Model[109] = new ModelRendererTurbo(this, 33, 121, textureX, textureY); // Box 272
		fol_m1Model[110] = new ModelRendererTurbo(this, 105, 73, textureX, textureY); // Box 275
		fol_m1Model[111] = new ModelRendererTurbo(this, 193, 73, textureX, textureY); // Box 305
		fol_m1Model[112] = new ModelRendererTurbo(this, 177, 81, textureX, textureY); // Box 309
		fol_m1Model[113] = new ModelRendererTurbo(this, 73, 57, textureX, textureY, "lamp"); // Box 310 lamp
		fol_m1Model[114] = new ModelRendererTurbo(this, 73, 65, textureX, textureY, "lamp"); // Box 311 lamp
		fol_m1Model[115] = new ModelRendererTurbo(this, 305, 81, textureX, textureY); // Box 313
		fol_m1Model[116] = new ModelRendererTurbo(this, 305, 89, textureX, textureY); // Box 314
		fol_m1Model[117] = new ModelRendererTurbo(this, 329, 97, textureX, textureY); // Box 316
		fol_m1Model[118] = new ModelRendererTurbo(this, 489, 65, textureX, textureY); // Box 119
		fol_m1Model[119] = new ModelRendererTurbo(this, 489, 73, textureX, textureY); // Box 120
		fol_m1Model[120] = new ModelRendererTurbo(this, 241, 73, textureX, textureY); // Box 121 Fr
		fol_m1Model[121] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 122 FL
		fol_m1Model[122] = new ModelRendererTurbo(this, 257, 81, textureX, textureY); // Box 123 F
		fol_m1Model[123] = new ModelRendererTurbo(this, 113, 81, textureX, textureY); // Box 182
		fol_m1Model[124] = new ModelRendererTurbo(this, 489, 81, textureX, textureY); // Box 183
		fol_m1Model[125] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 184
		fol_m1Model[126] = new ModelRendererTurbo(this, 361, 57, textureX, textureY); // Box 185
		fol_m1Model[127] = new ModelRendererTurbo(this, 193, 113, textureX, textureY); // Box 186
		fol_m1Model[128] = new ModelRendererTurbo(this, 5, 155, textureX, textureY); // Box 187
		fol_m1Model[129] = new ModelRendererTurbo(this, 257, 97, textureX, textureY); // Box 188
		fol_m1Model[130] = new ModelRendererTurbo(this, 24, 133, textureX, textureY); // Box 189
		fol_m1Model[131] = new ModelRendererTurbo(this, 44, 134, textureX, textureY); // Box 190
		fol_m1Model[132] = new ModelRendererTurbo(this, 305, 97, textureX, textureY); // Box 191
		fol_m1Model[133] = new ModelRendererTurbo(this, 305, 121, textureX, textureY); // Box 250
		fol_m1Model[134] = new ModelRendererTurbo(this, 257, 49, textureX, textureY); // Box 252 smoke
		fol_m1Model[135] = new ModelRendererTurbo(this, 377, 97, textureX, textureY); // Box 253
		fol_m1Model[136] = new ModelRendererTurbo(this, 425, 57, textureX, textureY); // Box 254
		fol_m1Model[137] = new ModelRendererTurbo(this, 57, 105, textureX, textureY); // Box 255
		fol_m1Model[138] = new ModelRendererTurbo(this, 193, 65, textureX, textureY); // Box 256
		fol_m1Model[139] = new ModelRendererTurbo(this, 233, 113, textureX, textureY); // Box 257
		fol_m1Model[140] = new ModelRendererTurbo(this, 441, 113, textureX, textureY); // Box 258
		fol_m1Model[141] = new ModelRendererTurbo(this, 465, 113, textureX, textureY); // Box 259
		fol_m1Model[142] = new ModelRendererTurbo(this, 121, 121, textureX, textureY); // Box 260
		fol_m1Model[143] = new ModelRendererTurbo(this, 73, 105, textureX, textureY); // Box 261
		fol_m1Model[144] = new ModelRendererTurbo(this, 337, 49, textureX, textureY); // Box 262
		fol_m1Model[145] = new ModelRendererTurbo(this, 489, 49, textureX, textureY); // Box 263
		fol_m1Model[146] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 264
		fol_m1Model[147] = new ModelRendererTurbo(this, 329, 113, textureX, textureY); // Box 265
		fol_m1Model[148] = new ModelRendererTurbo(this, 329, 97, textureX, textureY); // Box 266
		fol_m1Model[149] = new ModelRendererTurbo(this, 353, 113, textureX, textureY); // Box 267 liveryimg 1
		fol_m1Model[150] = new ModelRendererTurbo(this, 137, 121, textureX, textureY); // Box 268 liveryimg 1
		fol_m1Model[151] = new ModelRendererTurbo(this, 161, 121, textureX, textureY); // Box 269 liveryimg 2
		fol_m1Model[152] = new ModelRendererTurbo(this, 185, 121, textureX, textureY); // Box 270 liveryimg 2
		fol_m1Model[153] = new ModelRendererTurbo(this, 57, 113, textureX, textureY); // Box 271
		fol_m1Model[154] = new ModelRendererTurbo(this, 193, 113, textureX, textureY); // Box 272
		fol_m1Model[155] = new ModelRendererTurbo(this, 233, 113, textureX, textureY); // Box 273
		fol_m1Model[156] = new ModelRendererTurbo(this, 497, 113, textureX, textureY); // Box 274
		fol_m1Model[157] = new ModelRendererTurbo(this, 450, 134, textureX, textureY); // Box 157
		fol_m1Model[158] = new ModelRendererTurbo(this, 450, 157, textureX, textureY); // Box 157
		fol_m1Model[159] = new ModelRendererTurbo(this, 32, 82, textureX, textureY, "lamp"); // Box 310 lamp
		fol_m1Model[160] = new ModelRendererTurbo(this, 32, 96, textureX, textureY, "lamp"); // Box 310 lamp
		fol_m1Model[161] = new ModelRendererTurbo(this, 385, 97, textureX, textureY); // Box 161
		fol_m1Model[162] = new ModelRendererTurbo(this, 220, 139, textureX, textureY, "lamp"); // Box 176 lamp
		fol_m1Model[163] = new ModelRendererTurbo(this, 235, 139, textureX, textureY, "lamp"); // Box 177 lamp
		fol_m1Model[164] = new ModelRendererTurbo(this, 0, 10, textureX, textureY); // Box 188
		fol_m1Model[165] = new ModelRendererTurbo(this, 270, 5, textureX, textureY); // Box 189
		fol_m1Model[166] = new ModelRendererTurbo(this, 207, 29, textureX, textureY); // Box 190
		fol_m1Model[167] = new ModelRendererTurbo(this, 204, 29, textureX, textureY); // Box 191
		fol_m1Model[168] = new ModelRendererTurbo(this, 294, 21, textureX, textureY); // Box 192
		fol_m1Model[169] = new ModelRendererTurbo(this, 303, 1, textureX, textureY); // Box 193
		fol_m1Model[170] = new ModelRendererTurbo(this, 26, 149, textureX, textureY); // Box 170
		fol_m1Model[171] = new ModelRendererTurbo(this, 192, 29, textureX, textureY); // Box 171
		fol_m1Model[172] = new ModelRendererTurbo(this, 204, 139, textureX, textureY, "lamp"); // Box 172 lamp
		fol_m1Model[173] = new ModelRendererTurbo(this, 299, 22, textureX, textureY); // Box 173
		fol_m1Model[174] = new ModelRendererTurbo(this, 310, 1, textureX, textureY); // Box 174
		fol_m1Model[175] = new ModelRendererTurbo(this, 195, 141, textureX, textureY, "lamp"); // Box 175 lamp
		fol_m1Model[176] = new ModelRendererTurbo(this, 270, 1, textureX, textureY); // Box 176
		fol_m1Model[177] = new ModelRendererTurbo(this, 186, 29, textureX, textureY); // Box 177
		fol_m1Model[178] = new ModelRendererTurbo(this, 0, 7, textureX, textureY); // Box 178
		fol_m1Model[179] = new ModelRendererTurbo(this, 8, 135, textureX, textureY); // Box 179
		fol_m1Model[180] = new ModelRendererTurbo(this, 463, 113, textureX, textureY, "lamp"); // Box 189 lamp
		fol_m1Model[181] = new ModelRendererTurbo(this, 87, 67, textureX, textureY, "lamp"); // Box 190 lamp
		fol_m1Model[182] = new ModelRendererTurbo(this, 397, 135, textureX, textureY); // Box 191
		fol_m1Model[183] = new ModelRendererTurbo(this, 30, 28, textureX, textureY); // Box 162 light
		fol_m1Model[184] = new ModelRendererTurbo(this, 430, 103, textureX, textureY); // Box 165
		fol_m1Model[185] = new ModelRendererTurbo(this, 163, 92, textureX, textureY); // Box 162 light
		fol_m1Model[186] = new ModelRendererTurbo(this, 126, 92, textureX, textureY); // Box 165
		fol_m1Model[187] = new ModelRendererTurbo(this, 6, 172, textureX, textureY); // Box 196

		fol_m1Model[0].addBox(0F, 0F, 0F, 13, 2, 22, 0F); // Box 0
		fol_m1Model[0].setRotationPoint(-24F, -24F, 3F);

		fol_m1Model[1].addBox(0F, 0F, 0F, 7, 2, 6, 0F); // Box 1
		fol_m1Model[1].setRotationPoint(-31F, -24F, 11F);

		fol_m1Model[2].addShapeBox(0F, 0F, 0F, 6, 2, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F); // Box 2
		fol_m1Model[2].setRotationPoint(-30F, -24F, 17F);

		fol_m1Model[3].addShapeBox(0F, 0F, 0F, 6, 2, 8, 0F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		fol_m1Model[3].setRotationPoint(-30F, -24F, 3F);

		fol_m1Model[4].addBox(0F, 0F, 0F, 4, 4, 1, 0F); // Box 4
		fol_m1Model[4].setRotationPoint(-15F, -22F, 3F);

		fol_m1Model[5].addBox(0F, 0F, 0F, 13, 18, 1, 0F); // Box 5
		fol_m1Model[5].setRotationPoint(-24F, -18F, 3F);

		fol_m1Model[6].addShapeBox(0F, 0F, 0F, 6, 18, 8, 0F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, -7F, -1F, 0F, 0F, 1F, 0F, -6.5F, 0F, 0F, 0F, 0F, 0F, -7F, -1F, 0F, -0.5F); // Box 6
		fol_m1Model[6].setRotationPoint(-30F, -18F, 3F);

		fol_m1Model[7].addShapeBox(0F, 0F, 0F, 2, 18, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 1F, 0F, 1.5F); // Box 7
		fol_m1Model[7].setRotationPoint(-31F, -18F, 11F);

		fol_m1Model[8].addShapeBox(0F, 0F, 0F, 6, 18, 8, 0F, -1F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, -8F, -1F, 0F, -1.5F, 0F, 0F, -7F, 0F, 0F, 0F, 1F, 0F, -6.5F); // Box 8
		fol_m1Model[8].setRotationPoint(-30F, -18F, 17F);

		fol_m1Model[9].addBox(0F, 0F, 0F, 13, 18, 1, 0F); // Box 9
		fol_m1Model[9].setRotationPoint(-24F, -18F, 24F);

		fol_m1Model[10].addBox(0F, 0F, 0F, 4, 4, 1, 0F); // Box 11
		fol_m1Model[10].setRotationPoint(-15F, -22F, 24F);

		fol_m1Model[11].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 12 lamp
		fol_m1Model[11].setRotationPoint(-32F, -15F, 13F);

		fol_m1Model[12].addShapeBox(0F, 0F, 0F, 6, 1, 8, 0F, 2F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 2F, 0F, -6.5F, 2F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 2F, 0F, -6.5F); // Box 14
		fol_m1Model[12].setRotationPoint(-30F, 0F, 17F);

		fol_m1Model[13].addBox(0F, 0F, 0F, 83, 1, 22, 0F); // Box 15
		fol_m1Model[13].setRotationPoint(-24F, 0F, 3F);

		fol_m1Model[14].addShapeBox(0F, 0F, 0F, 6, 1, 15, 0F, 2F, 0F, -6.5F, 0F, 0F, 0F, 0F, 0F, 0.5F, 2F, 0F, 0.5F, 2F, 0F, -6.5F, 0F, 0F, 0F, 0F, 0F, 0.5F, 2F, 0F, 0.5F); // Box 17
		fol_m1Model[14].setRotationPoint(-30F, 0F, 3F);

		fol_m1Model[15].addBox(0F, 0F, 0F, 2, 25, 23, 0F); // Box 18
		fol_m1Model[15].setRotationPoint(-11F, -24.5F, 2.5F);

		fol_m1Model[16].addBox(0F, 0F, 0F, 36, 2, 22, 0F); // Box 19
		fol_m1Model[16].setRotationPoint(-9F, -24F, 3F);

		fol_m1Model[17].addBox(0F, 0F, 0F, 7, 18, 22, 0F); // Box 20
		fol_m1Model[17].setRotationPoint(-9F, -18F, 3F);

		fol_m1Model[18].addBox(0F, 0F, 0F, 20, 4, 5, 0F); // Box 23
		fol_m1Model[18].setRotationPoint(-9F, -22F, 3F);

		fol_m1Model[19].addBox(0F, 0F, 0F, 33, 22, 12, 0F); // Box 24
		fol_m1Model[19].setRotationPoint(-6F, -22F, 8F);

		fol_m1Model[20].addBox(0F, 0F, 0F, 20, 4, 5, 0F); // Box 25
		fol_m1Model[20].setRotationPoint(-9F, -22F, 20F);

		fol_m1Model[21].addBox(0F, 0F, 0F, 2, 25, 23, 0F); // Box 26
		fol_m1Model[21].setRotationPoint(27F, -24.5F, 2.5F);

		fol_m1Model[22].addShapeBox(0F, 0F, 0F, 2, 22, 22, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 27
		fol_m1Model[22].setRotationPoint(29F, -22F, 3F);

		fol_m1Model[23].addBox(0F, 0F, 0F, 18, 2, 22, 0F); // Box 28
		fol_m1Model[23].setRotationPoint(29F, -24F, 3F);

		fol_m1Model[24].addShapeBox(0F, 0F, 0F, 2, 22, 22, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 29
		fol_m1Model[24].setRotationPoint(31F, -22F, 3F);

		fol_m1Model[25].addShapeBox(0F, 0F, 0F, 2, 22, 22, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 30
		fol_m1Model[25].setRotationPoint(33F, -22F, 3F);

		fol_m1Model[26].addBox(0F, 0F, 0F, 12, 22, 22, 0F); // Box 33
		fol_m1Model[26].setRotationPoint(35F, -22F, 3F);

		fol_m1Model[27].addBox(0F, 0F, 0F, 2, 25, 23, 0F); // Box 34
		fol_m1Model[27].setRotationPoint(47F, -24.5F, 2.5F);

		fol_m1Model[28].addBox(0F, 0F, 0F, 10, 22, 22, 0F); // Box 35
		fol_m1Model[28].setRotationPoint(49F, -22F, 3F);

		fol_m1Model[29].addShapeBox(0F, 0F, 0F, 1, 25, 11, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 36
		fol_m1Model[29].setRotationPoint(59F, -24F, 3F);

		fol_m1Model[30].addShapeBox(0F, 0F, 0F, 1, 25, 11, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 37
		fol_m1Model[30].setRotationPoint(59F, -24F, 14F);

		fol_m1Model[31].addBox(0F, 0F, 0F, 10, 2, 22, 0F); // Box 38
		fol_m1Model[31].setRotationPoint(49F, -24F, 3F);

		fol_m1Model[32].addBox(0F, 0F, 0F, 10, 6, 1, 0F); // Box 40
		fol_m1Model[32].setRotationPoint(36F, -7F, 24.5F);

		fol_m1Model[33].addShapeBox(0F, 0F, 0F, 10, 1, 10, 0F, -9F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F); // Box 41
		fol_m1Model[33].setRotationPoint(14F, -25F, 4F);

		fol_m1Model[34].addShapeBox(0F, 0F, 0F, 10, 1, 10, 0F, 0F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F); // Box 42
		fol_m1Model[34].setRotationPoint(14F, -25F, 14F);

		fol_m1Model[35].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F, -2F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -2F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, -1F, 0F); // Box 43
		fol_m1Model[35].setRotationPoint(-1F, -16F, 5F);

		fol_m1Model[36].addShapeBox(0F, 0F, 0F, 12, 3, 1, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 44
		fol_m1Model[36].setRotationPoint(2F, -16F, 5F);

		fol_m1Model[37].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, -1F); // Box 45
		fol_m1Model[37].setRotationPoint(16F, -14F, 5F);

		fol_m1Model[38].addShapeBox(0F, 0F, 0F, 1, 6, 3, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 46
		fol_m1Model[38].setRotationPoint(14F, -22F, 5F);

		fol_m1Model[39].addBox(0F, 0F, 0F, 14, 3, 1, 0F); // Box 47
		fol_m1Model[39].setRotationPoint(2F, -16F, 6F);

		fol_m1Model[40].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 48
		fol_m1Model[40].setRotationPoint(0F, -16F, 6F);

		fol_m1Model[41].addShapeBox(0F, 0F, 0F, 11, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 44
		fol_m1Model[41].setRotationPoint(3F, -16F, 7F);

		fol_m1Model[42].addShapeBox(0F, 0F, 0F, 1, 8, 3, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 44
		fol_m1Model[42].setRotationPoint(16F, -22F, 5F);

		fol_m1Model[43].addBox(0F, 0F, 0F, 1, 6, 3, 0F); // Box 45
		fol_m1Model[43].setRotationPoint(15F, -22F, 5F);

		fol_m1Model[44].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 46
		fol_m1Model[44].setRotationPoint(14F, -16F, 5F);

		fol_m1Model[45].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 47
		fol_m1Model[45].setRotationPoint(15F, -16F, 5F);

		fol_m1Model[46].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 48
		fol_m1Model[46].setRotationPoint(15F, -16F, 7F);

		fol_m1Model[47].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 49
		fol_m1Model[47].setRotationPoint(14F, -16F, 7F);

		fol_m1Model[48].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 50
		fol_m1Model[48].setRotationPoint(2F, -16F, 7F);

		fol_m1Model[49].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 51
		fol_m1Model[49].setRotationPoint(1F, -16F, 5F);

		fol_m1Model[50].addBox(0F, 0F, 0F, 1, 3, 2, 0F); // Box 52
		fol_m1Model[50].setRotationPoint(1F, -16F, 6F);

		fol_m1Model[51].addShapeBox(0F, 0F, 0F, 16, 3, 1, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 53
		fol_m1Model[51].setRotationPoint(2F, -12F, 5F);

		fol_m1Model[52].addBox(0F, 0F, 0F, 18, 3, 1, 0F); // Box 54
		fol_m1Model[52].setRotationPoint(2F, -12F, 6F);

		fol_m1Model[53].addShapeBox(0F, 0F, 0F, 15, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 55
		fol_m1Model[53].setRotationPoint(3F, -12F, 7F);

		fol_m1Model[54].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 56
		fol_m1Model[54].setRotationPoint(1F, -12F, 5F);

		fol_m1Model[55].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 57
		fol_m1Model[55].setRotationPoint(0F, -12F, 6F);

		fol_m1Model[56].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F, -2F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -2F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, -1F, 0F); // Box 58
		fol_m1Model[56].setRotationPoint(-1F, -12F, 5F);

		fol_m1Model[57].addBox(0F, 0F, 0F, 1, 3, 2, 0F); // Box 59
		fol_m1Model[57].setRotationPoint(1F, -12F, 6F);

		fol_m1Model[58].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 60
		fol_m1Model[58].setRotationPoint(2F, -12F, 7F);

		fol_m1Model[59].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 61
		fol_m1Model[59].setRotationPoint(18F, -12F, 5F);

		fol_m1Model[60].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 62
		fol_m1Model[60].setRotationPoint(18F, -12F, 7F);

		fol_m1Model[61].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 63
		fol_m1Model[61].setRotationPoint(19F, -12F, 7F);

		fol_m1Model[62].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, -1F); // Box 64
		fol_m1Model[62].setRotationPoint(20F, -10F, 5F);

		fol_m1Model[63].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 65
		fol_m1Model[63].setRotationPoint(19F, -12F, 5F);

		fol_m1Model[64].addShapeBox(0F, 0F, 0F, 1, 10, 3, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 66
		fol_m1Model[64].setRotationPoint(18F, -22F, 5F);

		fol_m1Model[65].addBox(0F, 0F, 0F, 1, 10, 3, 0F); // Box 67
		fol_m1Model[65].setRotationPoint(19F, -22F, 5F);

		fol_m1Model[66].addShapeBox(0F, 0F, 0F, 1, 12, 3, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 68
		fol_m1Model[66].setRotationPoint(20F, -22F, 5F);

		fol_m1Model[67].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F); // Box 69
		fol_m1Model[67].setRotationPoint(0F, -16F, 22F);

		fol_m1Model[68].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 70
		fol_m1Model[68].setRotationPoint(2F, -16F, 20F);

		fol_m1Model[69].addBox(0F, 0F, 0F, 1, 3, 2, 0F); // Box 71
		fol_m1Model[69].setRotationPoint(1F, -16F, 20F);

		fol_m1Model[70].addBox(0F, 0F, 0F, 14, 3, 1, 0F); // Box 72
		fol_m1Model[70].setRotationPoint(2F, -16F, 21F);

		fol_m1Model[71].addShapeBox(0F, 0F, 0F, 12, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 73
		fol_m1Model[71].setRotationPoint(2F, -16F, 22F);

		fol_m1Model[72].addShapeBox(0F, 0F, 0F, 11, 3, 1, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		fol_m1Model[72].setRotationPoint(3F, -16F, 20F);

		fol_m1Model[73].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 75
		fol_m1Model[73].setRotationPoint(0F, -16F, 20F);

		fol_m1Model[74].addBox(0F, 0F, 0F, 18, 3, 1, 0F); // Box 80
		fol_m1Model[74].setRotationPoint(2F, -12F, 21F);

		fol_m1Model[75].addShapeBox(0F, 0F, 0F, 15, 3, 1, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 82
		fol_m1Model[75].setRotationPoint(3F, -12F, 20F);

		fol_m1Model[76].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 83
		fol_m1Model[76].setRotationPoint(14F, -16F, 20F);

		fol_m1Model[77].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 84
		fol_m1Model[77].setRotationPoint(15F, -16F, 20F);

		fol_m1Model[78].addShapeBox(0F, 0F, 0F, 1, 8, 3, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 85
		fol_m1Model[78].setRotationPoint(16F, -22F, 20F);

		fol_m1Model[79].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, -1F); // Box 86
		fol_m1Model[79].setRotationPoint(16F, -14F, 20F);

		fol_m1Model[80].addShapeBox(0F, 0F, 0F, 1, 6, 3, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 87
		fol_m1Model[80].setRotationPoint(14F, -22F, 20F);

		fol_m1Model[81].addBox(0F, 0F, 0F, 1, 6, 3, 0F); // Box 88
		fol_m1Model[81].setRotationPoint(15F, -22F, 20F);

		fol_m1Model[82].addShapeBox(0F, 0F, 0F, 1, 10, 3, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 89
		fol_m1Model[82].setRotationPoint(18F, -22F, 20F);

		fol_m1Model[83].addBox(0F, 0F, 0F, 1, 10, 3, 0F); // Box 90
		fol_m1Model[83].setRotationPoint(19F, -22F, 20F);

		fol_m1Model[84].addShapeBox(0F, 0F, 0F, 1, 12, 3, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 91
		fol_m1Model[84].setRotationPoint(20F, -22F, 20F);

		fol_m1Model[85].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 92
		fol_m1Model[85].setRotationPoint(19F, -12F, 20F);

		fol_m1Model[86].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 93
		fol_m1Model[86].setRotationPoint(18F, -12F, 20F);

		fol_m1Model[87].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, -1F); // Box 94
		fol_m1Model[87].setRotationPoint(20F, -10F, 20F);

		fol_m1Model[88].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 95
		fol_m1Model[88].setRotationPoint(18F, -12F, 22F);

		fol_m1Model[89].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 96
		fol_m1Model[89].setRotationPoint(19F, -12F, 22F);

		fol_m1Model[90].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 97
		fol_m1Model[90].setRotationPoint(1F, -16F, 22F);

		fol_m1Model[91].addShapeBox(0F, 0F, 0F, 16, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 98
		fol_m1Model[91].setRotationPoint(2F, -12F, 22F);

		fol_m1Model[92].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 99
		fol_m1Model[92].setRotationPoint(14F, -16F, 22F);

		fol_m1Model[93].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 100
		fol_m1Model[93].setRotationPoint(15F, -16F, 22F);

		fol_m1Model[94].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F); // Box 101
		fol_m1Model[94].setRotationPoint(0F, -12F, 22F);

		fol_m1Model[95].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 102
		fol_m1Model[95].setRotationPoint(0F, -12F, 20F);

		fol_m1Model[96].addBox(0F, 0F, 0F, 1, 3, 2, 0F); // Box 103
		fol_m1Model[96].setRotationPoint(1F, -12F, 20F);

		fol_m1Model[97].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 104
		fol_m1Model[97].setRotationPoint(2F, -12F, 20F);

		fol_m1Model[98].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 105
		fol_m1Model[98].setRotationPoint(1F, -12F, 22F);

		fol_m1Model[99].addBox(0F, 0F, 0F, 8, 4, 1, 0F); // Box 106
		fol_m1Model[99].setRotationPoint(50F, -20F, 24.5F);

		fol_m1Model[100].addBox(0F, 0F, 0F, 8, 4, 1, 0F); // Box 107
		fol_m1Model[100].setRotationPoint(50F, -20F, 2.5F);

		fol_m1Model[101].addBox(0F, 0F, 0F, 8, 2, 3, 0F); // Box 263
		fol_m1Model[101].setRotationPoint(-36F, 1F, 12.5F);

		fol_m1Model[102].addBox(0F, 0F, 0F, 14, 2, 2, 0F); // Box 265
		fol_m1Model[102].setRotationPoint(-2F, -4F, 6F);

		fol_m1Model[103].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 266
		fol_m1Model[103].setRotationPoint(12F, -3.5F, 6.5F);

		fol_m1Model[104].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 267
		fol_m1Model[104].setRotationPoint(12F, -3.5F, 20.5F);

		fol_m1Model[105].addBox(0F, 0F, 0F, 14, 2, 2, 0F); // Box 268
		fol_m1Model[105].setRotationPoint(-2F, -4F, 20F);

		fol_m1Model[106].addBox(0F, 0F, 0F, 6, 1, 6, 0F); // Box 269
		fol_m1Model[106].setRotationPoint(19F, -24.5F, 11F);

		fol_m1Model[107].addBox(0F, 0F, 0F, 1, 6, 6, 0F); // Box 270
		fol_m1Model[107].setRotationPoint(-29F, -16F, 11F);

		fol_m1Model[108].addShapeBox(0F, 0F, 0F, 30, 1, 22, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 271
		fol_m1Model[108].setRotationPoint(-1F, 1F, 3F);

		fol_m1Model[109].addShapeBox(0F, 0F, 0F, 30, 2, 22, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 272
		fol_m1Model[109].setRotationPoint(-1F, 5F, 3F);

		fol_m1Model[110].addBox(0F, 0F, 0F, 6, 1, 6, 0F); // Box 275
		fol_m1Model[110].setRotationPoint(-17F, 1F, 11F);

		fol_m1Model[111].addBox(0F, 0F, 0F, 6, 1, 6, 0F); // Box 305
		fol_m1Model[111].setRotationPoint(41F, 1F, 11F);

		fol_m1Model[112].addBox(0F, 0F, 0F, 9, 2, 3, 0F); // Box 309
		fol_m1Model[112].setRotationPoint(56F, 1F, 12.5F);

		fol_m1Model[113].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 310 lamp
		fol_m1Model[113].setRotationPoint(-32F, -12F, 13F);

		fol_m1Model[114].addBox(0F, 0F, 0F, 1, 3, 3, 0F); // Box 311 lamp
		fol_m1Model[114].setRotationPoint(60.5F, -22F, 12.5F);

		fol_m1Model[115].addBox(0F, 0F, 0F, 21, 1, 2, 0F); // Box 313
		fol_m1Model[115].setRotationPoint(-23F, -25F, 6F);

		fol_m1Model[116].addBox(0F, 0F, 0F, 21, 1, 2, 0F); // Box 314
		fol_m1Model[116].setRotationPoint(-23F, -25F, 20F);

		fol_m1Model[117].addBox(0F, 0F, 0F, 16, 1, 10, 0F); // Box 316
		fol_m1Model[117].setRotationPoint(41F, -25F, 9F);

		fol_m1Model[118].addBox(0F, 0F, 0F, 9, 4, 1, 0F); // Box 119
		fol_m1Model[118].setRotationPoint(-24F, -22F, 3F);

		fol_m1Model[119].addBox(0F, 0F, 0F, 9, 4, 1, 0F); // Box 120
		fol_m1Model[119].setRotationPoint(-24F, -22F, 24F);

		fol_m1Model[120].addShapeBox(0F, 0F, 0F, 1, 4, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, -1F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, -1F, -6F, 0F, 0F); // Box 121 Fr
		fol_m1Model[120].setRotationPoint(-30F, -22F, 17F);

		fol_m1Model[121].addShapeBox(0F, 0F, 0F, 1, 4, 8, 0F, -1F, 0F, 0F, 0F, 0F, -1F, -5F, 0F, 0F, 5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, -5F, 0F, 0F, 5F, 0F, 0F); // Box 122 FL
		fol_m1Model[121].setRotationPoint(-25F, -22F, 3F);

		fol_m1Model[122].addBox(0F, 0F, 0F, 1, 4, 6, 0F); // Box 123 F
		fol_m1Model[122].setRotationPoint(-30F, -22F, 11F);

		fol_m1Model[123].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 182
		fol_m1Model[123].setRotationPoint(-21F, -25F, 12F);

		fol_m1Model[124].addShapeBox(0F, 0F, 0F, 8, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 6F, 0F, 0F, 0F); // Box 183
		fol_m1Model[124].setRotationPoint(-2F, -25F, 6F);

		fol_m1Model[125].addShapeBox(0F, 0F, 0F, 8, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, -6F, 0F, 0F, 0F); // Box 184
		fol_m1Model[125].setRotationPoint(-2F, -25F, 20F);

		fol_m1Model[126].addBox(0F, 0F, 0F, 2, 1, 4, 0F); // Box 185
		fol_m1Model[126].setRotationPoint(6F, -25F, 12F);

		fol_m1Model[127].addBox(0F, 0F, 0F, 7, 3, 21, 0F); // Box 186
		fol_m1Model[127].setRotationPoint(20F, -3F, 3.5F);

		fol_m1Model[128].addBox(0F, 0F, 0F, 1, 2, 10, 0F); // Box 187
		fol_m1Model[128].setRotationPoint(-29F, 1F, 9F);

		fol_m1Model[129].addShapeBox(0F, 0F, 0F, 8, 3, 1, 0F, -2F, 0F, -1F, 0F, 0F, 5F, 0F, 0F, -5F, -3F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 5F, 0F, 0F, -5F, -1F, 0F, 0F); // Box 188
		fol_m1Model[129].setRotationPoint(-32F, 3F, 8.5F);

		fol_m1Model[130].addShapeBox(0F, 0F, 0F, 3, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 189
		fol_m1Model[130].setRotationPoint(-24F, 1F, 3.5F);

		fol_m1Model[131].addShapeBox(0F, 0F, 0F, 3, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 190
		fol_m1Model[131].setRotationPoint(-24F, 1F, 23.5F);

		fol_m1Model[132].addShapeBox(0F, 0F, 0F, 8, 3, 1, 0F, -3F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 5F, -2F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 5F, 0F, 0F, -1F); // Box 191
		fol_m1Model[132].setRotationPoint(-32F, 3F, 18.5F);

		fol_m1Model[133].addBox(0F, 0F, 0F, 30, 3, 22, 0F); // Box 250
		fol_m1Model[133].setRotationPoint(-1F, 2F, 3F);

		fol_m1Model[134].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 252 smoke
		fol_m1Model[134].setRotationPoint(21F, -24F, 13F);

		fol_m1Model[135].addBox(0F, 0F, 0F, 4, 2, 2, 0F); // Box 253
		fol_m1Model[135].setRotationPoint(23F, -7F, 20F);

		fol_m1Model[136].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 254
		fol_m1Model[136].setRotationPoint(22F, -6.5F, 20.5F);

		fol_m1Model[137].addBox(0F, 0F, 0F, 4, 2, 2, 0F); // Box 255
		fol_m1Model[137].setRotationPoint(23F, -7F, 6F);

		fol_m1Model[138].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 256
		fol_m1Model[138].setRotationPoint(22F, -6.5F, 6.5F);

		fol_m1Model[139].addBox(0F, 0F, 0F, 3, 3, 13, 0F); // Box 257
		fol_m1Model[139].setRotationPoint(15F, -4F, 7.5F);

		fol_m1Model[140].addBox(0F, 0F, 0F, 3, 3, 13, 0F); // Box 258
		fol_m1Model[140].setRotationPoint(15F, -8F, 7.5F);

		fol_m1Model[141].addBox(0F, 0F, 0F, 9, 1, 10, 0F); // Box 259
		fol_m1Model[141].setRotationPoint(-25F, -5F, 9F);

		fol_m1Model[142].addBox(0F, 0F, 0F, 1, 11, 10, 0F); // Box 260
		fol_m1Model[142].setRotationPoint(-16F, -16F, 9F);
		fol_m1Model[142].rotateAngleZ = -0.10471976F;

		fol_m1Model[143].addBox(0F, 0F, 0F, 4, 4, 4, 0F); // Box 261
		fol_m1Model[143].setRotationPoint(-22F, -4F, 12F);

		fol_m1Model[144].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 262
		fol_m1Model[144].setRotationPoint(-27F, -26F, 17F);

		fol_m1Model[145].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 263
		fol_m1Model[145].setRotationPoint(-26.5F, -26F, 18.5F);

		fol_m1Model[146].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 264
		fol_m1Model[146].setRotationPoint(-26F, -25F, 18F);

		fol_m1Model[147].addBox(0F, 0F, 0F, 10, 6, 1, 0F); // Box 265
		fol_m1Model[147].setRotationPoint(36F, -7F, 2.5F);

		fol_m1Model[148].addBox(0F, 0F, 0F, 3, 2, 1, 0F); // Box 266
		fol_m1Model[148].setRotationPoint(2F, 0.5F, 2.75F);

		fol_m1Model[149].addBox(0F, 0F, 0F, 11, 4, 0, 0F); // Box 267 liveryimg 1
		fol_m1Model[149].setRotationPoint(-23F, -17F, 2.99F);

		fol_m1Model[150].addBox(0F, 0F, 0F, 11, 4, 0, 0F); // Box 268 liveryimg 1
		fol_m1Model[150].setRotationPoint(-23F, -17F, 25.01F);

		fol_m1Model[151].addBox(0F, 0F, 0F, 10, 10, 0, 0F); // Box 269 liveryimg 2
		fol_m1Model[151].setRotationPoint(36F, -21F, 25.01F);

		fol_m1Model[152].addBox(0F, 0F, 0F, 10, 10, 0, 0F); // Box 270 liveryimg 2
		fol_m1Model[152].setRotationPoint(36F, -21F, 2.99F);

		fol_m1Model[153].addBox(0F, 0F, 0F, 5, 5, 0, 0F); // Box 271
		fol_m1Model[153].setRotationPoint(-16F, 1F, 3F);

		fol_m1Model[154].addBox(0F, 0F, 0F, 5, 5, 0, 0F); // Box 272
		fol_m1Model[154].setRotationPoint(-16F, 1F, 25F);

		fol_m1Model[155].addBox(0F, 0F, 0F, 5, 5, 0, 0F); // Box 273
		fol_m1Model[155].setRotationPoint(49F, 1F, 25F);

		fol_m1Model[156].addBox(0F, 0F, 0F, 5, 5, 0, 0F); // Box 274
		fol_m1Model[156].setRotationPoint(49F, 1F, 3F);

		fol_m1Model[157].addBox(0F, 0F, 0F, 29, 22, 0, 0F); // Box 157
		fol_m1Model[157].setRotationPoint(-2F, -22F, 3.01F);

		fol_m1Model[158].addBox(0F, 0F, 0F, 29, 22, 0, 0F); // Box 157
		fol_m1Model[158].setRotationPoint(-2F, -22F, 25.01F);

		fol_m1Model[159].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 310 lamp
		fol_m1Model[159].setRotationPoint(-29F, 1F, 7F);

		fol_m1Model[160].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 310 lamp
		fol_m1Model[160].setRotationPoint(-29F, 1F, 19F);

		fol_m1Model[161].addShapeBox(0F, 0F, 0F, 1, 3, 9, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 161
		fol_m1Model[161].setRotationPoint(-32F, 3F, 9.5F);

		fol_m1Model[162].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 176 lamp
		fol_m1Model[162].setRotationPoint(-31.75F, -24.25F, 13.5F);

		fol_m1Model[163].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 177 lamp
		fol_m1Model[163].setRotationPoint(-31.75F, -22.75F, 13.5F);

		fol_m1Model[164].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F, -0.5F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 188
		fol_m1Model[164].setRotationPoint(-32.75F, -22.75F, 14.51F);

		fol_m1Model[165].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F, -0.5F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 189
		fol_m1Model[165].setRotationPoint(-32.75F, -22.75F, 13.49F);

		fol_m1Model[166].addShapeBox(0F, 0F, 0F, 1, 0, 1, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 190
		fol_m1Model[166].setRotationPoint(-32.75F, -21.75F, 13.5F);

		fol_m1Model[167].addShapeBox(0F, 0F, 0F, 1, 0, 1, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 191
		fol_m1Model[167].setRotationPoint(-32.75F, -23.25F, 13.5F);

		fol_m1Model[168].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F, -0.5F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 192
		fol_m1Model[168].setRotationPoint(-32.75F, -24.25F, 13.49F);

		fol_m1Model[169].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F, -0.5F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 193
		fol_m1Model[169].setRotationPoint(-32.75F, -24.25F, 14.51F);

		fol_m1Model[170].addBox(0F, 0F, 0F, 11, 3, 2, 0F); // Box 170
		fol_m1Model[170].setRotationPoint(-31.5F, -24.5F, 13F);

		fol_m1Model[171].addShapeBox(0F, 0F, 0F, 1, 0, 1, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 171
		fol_m1Model[171].setRotationPoint(-32.75F, -24.75F, 14.5F);

		fol_m1Model[172].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 172 lamp
		fol_m1Model[172].setRotationPoint(-31.75F, -25.75F, 14.5F);

		fol_m1Model[173].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F, -0.5F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 173
		fol_m1Model[173].setRotationPoint(-32.75F, -25.75F, 14.49F);

		fol_m1Model[174].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F, -0.5F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 174
		fol_m1Model[174].setRotationPoint(-32.75F, -25.75F, 15.51F);

		fol_m1Model[175].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 175 lamp
		fol_m1Model[175].setRotationPoint(-31.75F, -25.75F, 12.5F);

		fol_m1Model[176].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F, -0.5F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 176
		fol_m1Model[176].setRotationPoint(-32.75F, -25.75F, 12.49F);

		fol_m1Model[177].addShapeBox(0F, 0F, 0F, 1, 0, 1, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 177
		fol_m1Model[177].setRotationPoint(-32.75F, -24.75F, 12.5F);

		fol_m1Model[178].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F, -0.5F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 178
		fol_m1Model[178].setRotationPoint(-32.75F, -25.75F, 13.51F);

		fol_m1Model[179].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 179
		fol_m1Model[179].setRotationPoint(-31.5F, -26.5F, 12F);

		fol_m1Model[180].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 189 lamp
		fol_m1Model[180].setRotationPoint(59F, 1F, 5F);

		fol_m1Model[181].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 190 lamp
		fol_m1Model[181].setRotationPoint(59F, 1F, 21F);

		fol_m1Model[182].addShapeBox(0F, 0F, 0F, 1, 4, 22, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 191
		fol_m1Model[182].setRotationPoint(58F, 1F, 3F);

		fol_m1Model[183].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 162 light
		fol_m1Model[183].setRotationPoint(-22.68F, -27F, 20.5F);

		fol_m1Model[184].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0.3F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, 0.3F, -0.5F, 0.1F, 0.3F, 0F, 0.1F, -1F, 0F, 0.1F, -1F, 0F, 0.1F, 0.3F, 0F, 0.1F); // Box 165
		fol_m1Model[184].setRotationPoint(-22.5F, -26F, 20.5F);

		fol_m1Model[185].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 162 light
		fol_m1Model[185].setRotationPoint(-22.68F, -27F, 6.5F);

		fol_m1Model[186].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0.3F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, 0.3F, -0.5F, 0.1F, 0.3F, 0F, 0.1F, -1F, 0F, 0.1F, -1F, 0F, 0.1F, 0.3F, 0F, 0.1F); // Box 165
		fol_m1Model[186].setRotationPoint(-22.5F, -26F, 6.5F);

		fol_m1Model[187].addBox(0F, 0F, 0F, 2, 16, 7, 0F); // Box 196
		fol_m1Model[187].setRotationPoint(60F, -18F, 15F);


	}
	ModelFOL_M1Bogie bogie = new ModelFOL_M1Bogie();

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		for (ModelRendererTurbo mrt : fol_m1Model){
			if(mrt.boxName.equals("lamp")){
				Minecraft.getMinecraft().entityRenderer.disableLightmap(1D);
				mrt.render(f5,false);
				Minecraft.getMinecraft().entityRenderer.enableLightmap(1D);
			} else {
				mrt.render(f5,false);
			}
		}


		if(entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor()==8){
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/FOL_M1_Bogie_grey.png"));
		} else {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/FOL_M1_Bogie.png"));
		}

		GL11.glPushMatrix();
		GL11.glTranslated(-0.2,0,1.0);
		bogie.render(entity,f,f1,f2,f3,f4,f5);

		GL11.glTranslated(3.65,0,0);
		bogie.render(entity,f,f1,f2,f3,f4,f5);
		GL11.glPopMatrix();


	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
	{
	}

	public ModelRendererTurbo fol_m1Model[];
}