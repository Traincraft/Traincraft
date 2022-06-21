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
public class ModelSNCB_M6_TAIL extends ModelBase
{
	int textureX = 512;
	int textureY = 512;

	public ModelSNCB_M6_TAIL()
	{
		sncb_m6_tailModel = new ModelRendererTurbo[585];
		sncb_m6_tailModel[0] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 11
		sncb_m6_tailModel[1] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 12
		sncb_m6_tailModel[2] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 13
		sncb_m6_tailModel[3] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 14
		sncb_m6_tailModel[4] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 15
		sncb_m6_tailModel[5] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 19
		sncb_m6_tailModel[6] = new ModelRendererTurbo(this, 217, 9, textureX, textureY); // Box 20
		sncb_m6_tailModel[7] = new ModelRendererTurbo(this, 265, 9, textureX, textureY); // Box 27
		sncb_m6_tailModel[8] = new ModelRendererTurbo(this, 313, 9, textureX, textureY); // Box 28
		sncb_m6_tailModel[9] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 31
		sncb_m6_tailModel[10] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 32
		sncb_m6_tailModel[11] = new ModelRendererTurbo(this, 345, 25, textureX, textureY); // Box 9
		sncb_m6_tailModel[12] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 33
		sncb_m6_tailModel[13] = new ModelRendererTurbo(this, 265, 41, textureX, textureY); // Box 34
		sncb_m6_tailModel[14] = new ModelRendererTurbo(this, 265, 55, textureX, textureY); // Box 35
		sncb_m6_tailModel[15] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 36
		sncb_m6_tailModel[16] = new ModelRendererTurbo(this, 265, 48, textureX, textureY); // Box 37
		sncb_m6_tailModel[17] = new ModelRendererTurbo(this, 265, 65, textureX, textureY); // Box 38
		sncb_m6_tailModel[18] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 40
		sncb_m6_tailModel[19] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 41
		sncb_m6_tailModel[20] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 42
		sncb_m6_tailModel[21] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Box 44
		sncb_m6_tailModel[22] = new ModelRendererTurbo(this, 1, 121, textureX, textureY); // Box 45
		sncb_m6_tailModel[23] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Box 46
		sncb_m6_tailModel[24] = new ModelRendererTurbo(this, 1, 137, textureX, textureY); // Box 47
		sncb_m6_tailModel[25] = new ModelRendererTurbo(this, 1, 145, textureX, textureY); // Box 48
		sncb_m6_tailModel[26] = new ModelRendererTurbo(this, 265, 73, textureX, textureY); // Box 50
		sncb_m6_tailModel[27] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 51
		sncb_m6_tailModel[28] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 59
		sncb_m6_tailModel[29] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 61
		sncb_m6_tailModel[30] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 63
		sncb_m6_tailModel[31] = new ModelRendererTurbo(this, 193, 9, textureX, textureY); // Box 64
		sncb_m6_tailModel[32] = new ModelRendererTurbo(this, 217, 9, textureX, textureY); // Box 65
		sncb_m6_tailModel[33] = new ModelRendererTurbo(this, 249, 9, textureX, textureY); // Box 66
		sncb_m6_tailModel[34] = new ModelRendererTurbo(this, 265, 9, textureX, textureY); // Box 67
		sncb_m6_tailModel[35] = new ModelRendererTurbo(this, 289, 9, textureX, textureY); // Box 68
		sncb_m6_tailModel[36] = new ModelRendererTurbo(this, 305, 9, textureX, textureY); // Box 69
		sncb_m6_tailModel[37] = new ModelRendererTurbo(this, 345, 9, textureX, textureY); // Box 70
		sncb_m6_tailModel[38] = new ModelRendererTurbo(this, 361, 33, textureX, textureY); // Box 71
		sncb_m6_tailModel[39] = new ModelRendererTurbo(this, 473, 9, textureX, textureY); // Box 73
		sncb_m6_tailModel[40] = new ModelRendererTurbo(this, 73, 161, textureX, textureY); // Box 130
		sncb_m6_tailModel[41] = new ModelRendererTurbo(this, 73, 161, textureX, textureY); // Box 131
		sncb_m6_tailModel[42] = new ModelRendererTurbo(this, 297, 33, textureX, textureY); // Box 132
		sncb_m6_tailModel[43] = new ModelRendererTurbo(this, 497, 33, textureX, textureY); // Box 133
		sncb_m6_tailModel[44] = new ModelRendererTurbo(this, 177, 33, textureX, textureY); // Box 134
		sncb_m6_tailModel[45] = new ModelRendererTurbo(this, 433, 49, textureX, textureY); // Box 135
		sncb_m6_tailModel[46] = new ModelRendererTurbo(this, 449, 49, textureX, textureY); // Box 136
		sncb_m6_tailModel[47] = new ModelRendererTurbo(this, 465, 49, textureX, textureY); // Box 137
		sncb_m6_tailModel[48] = new ModelRendererTurbo(this, 177, 25, textureX, textureY); // Box 138
		sncb_m6_tailModel[49] = new ModelRendererTurbo(this, 193, 25, textureX, textureY); // Box 139
		sncb_m6_tailModel[50] = new ModelRendererTurbo(this, 225, 25, textureX, textureY); // Box 140
		sncb_m6_tailModel[51] = new ModelRendererTurbo(this, 489, 49, textureX, textureY); // Box 141
		sncb_m6_tailModel[52] = new ModelRendererTurbo(this, 457, 57, textureX, textureY); // Box 177
		sncb_m6_tailModel[53] = new ModelRendererTurbo(this, 473, 57, textureX, textureY); // Box 178
		sncb_m6_tailModel[54] = new ModelRendererTurbo(this, 441, 65, textureX, textureY); // Box 179
		sncb_m6_tailModel[55] = new ModelRendererTurbo(this, 457, 65, textureX, textureY); // Box 180
		sncb_m6_tailModel[56] = new ModelRendererTurbo(this, 473, 65, textureX, textureY); // Box 181
		sncb_m6_tailModel[57] = new ModelRendererTurbo(this, 489, 65, textureX, textureY); // Box 182
		sncb_m6_tailModel[58] = new ModelRendererTurbo(this, 417, 73, textureX, textureY); // Box 183
		sncb_m6_tailModel[59] = new ModelRendererTurbo(this, 433, 73, textureX, textureY); // Box 184
		sncb_m6_tailModel[60] = new ModelRendererTurbo(this, 449, 73, textureX, textureY); // Box 185
		sncb_m6_tailModel[61] = new ModelRendererTurbo(this, 465, 73, textureX, textureY); // Box 186
		sncb_m6_tailModel[62] = new ModelRendererTurbo(this, 481, 73, textureX, textureY); // Box 187
		sncb_m6_tailModel[63] = new ModelRendererTurbo(this, 497, 73, textureX, textureY); // Box 188
		sncb_m6_tailModel[64] = new ModelRendererTurbo(this, 417, 81, textureX, textureY); // Box 189
		sncb_m6_tailModel[65] = new ModelRendererTurbo(this, 433, 81, textureX, textureY); // Box 190
		sncb_m6_tailModel[66] = new ModelRendererTurbo(this, 449, 81, textureX, textureY); // Box 191
		sncb_m6_tailModel[67] = new ModelRendererTurbo(this, 465, 81, textureX, textureY); // Box 192
		sncb_m6_tailModel[68] = new ModelRendererTurbo(this, 481, 81, textureX, textureY); // Box 193
		sncb_m6_tailModel[69] = new ModelRendererTurbo(this, 497, 81, textureX, textureY); // Box 194
		sncb_m6_tailModel[70] = new ModelRendererTurbo(this, 265, 89, textureX, textureY); // Box 195
		sncb_m6_tailModel[71] = new ModelRendererTurbo(this, 281, 89, textureX, textureY); // Box 196
		sncb_m6_tailModel[72] = new ModelRendererTurbo(this, 297, 89, textureX, textureY); // Box 197
		sncb_m6_tailModel[73] = new ModelRendererTurbo(this, 294, 96, textureX, textureY); // Box 202
		sncb_m6_tailModel[74] = new ModelRendererTurbo(this, 481, 89, textureX, textureY); // Box 212
		sncb_m6_tailModel[75] = new ModelRendererTurbo(this, 465, 89, textureX, textureY); // Box 215
		sncb_m6_tailModel[76] = new ModelRendererTurbo(this, 273, 97, textureX, textureY); // Box 217
		sncb_m6_tailModel[77] = new ModelRendererTurbo(this, 289, 97, textureX, textureY); // Box 221
		sncb_m6_tailModel[78] = new ModelRendererTurbo(this, 145, 161, textureX, textureY); // Box 183
		sncb_m6_tailModel[79] = new ModelRendererTurbo(this, 145, 161, textureX, textureY); // Box 184
		sncb_m6_tailModel[80] = new ModelRendererTurbo(this, 465, 41, textureX, textureY); // Box 185
		sncb_m6_tailModel[81] = new ModelRendererTurbo(this, 481, 89, textureX, textureY); // Box 186
		sncb_m6_tailModel[82] = new ModelRendererTurbo(this, 441, 57, textureX, textureY); // Box 187
		sncb_m6_tailModel[83] = new ModelRendererTurbo(this, 497, 89, textureX, textureY); // Box 188
		sncb_m6_tailModel[84] = new ModelRendererTurbo(this, 345, 117, textureX, textureY); // Box 189
		sncb_m6_tailModel[85] = new ModelRendererTurbo(this, 257, 81, textureX, textureY); // Box 190
		sncb_m6_tailModel[86] = new ModelRendererTurbo(this, 273, 25, textureX, textureY); // Box 191
		sncb_m6_tailModel[87] = new ModelRendererTurbo(this, 305, 25, textureX, textureY); // Box 192
		sncb_m6_tailModel[88] = new ModelRendererTurbo(this, 489, 49, textureX, textureY); // Box 193
		sncb_m6_tailModel[89] = new ModelRendererTurbo(this, 97, 33, textureX, textureY); // Box 194
		sncb_m6_tailModel[90] = new ModelRendererTurbo(this, 257, 137, textureX, textureY); // Box 8
		sncb_m6_tailModel[91] = new ModelRendererTurbo(this, 273, 97, textureX, textureY); // Box 176
		sncb_m6_tailModel[92] = new ModelRendererTurbo(this, 25, 153, textureX, textureY); // Box 170
		sncb_m6_tailModel[93] = new ModelRendererTurbo(this, 73, 161, textureX, textureY); // Box 171
		sncb_m6_tailModel[94] = new ModelRendererTurbo(this, 57, 153, textureX, textureY); // Box 172
		sncb_m6_tailModel[95] = new ModelRendererTurbo(this, 73, 153, textureX, textureY); // Box 173
		sncb_m6_tailModel[96] = new ModelRendererTurbo(this, 89, 153, textureX, textureY); // Box 174
		sncb_m6_tailModel[97] = new ModelRendererTurbo(this, 105, 153, textureX, textureY); // Box 175
		sncb_m6_tailModel[98] = new ModelRendererTurbo(this, 394, 118, textureX, textureY); // Box 176
		sncb_m6_tailModel[99] = new ModelRendererTurbo(this, 113, 153, textureX, textureY); // Box 163
		sncb_m6_tailModel[100] = new ModelRendererTurbo(this, 145, 161, textureX, textureY); // Box 164
		sncb_m6_tailModel[101] = new ModelRendererTurbo(this, 145, 153, textureX, textureY); // Box 165
		sncb_m6_tailModel[102] = new ModelRendererTurbo(this, 73, 153, textureX, textureY); // Box 166
		sncb_m6_tailModel[103] = new ModelRendererTurbo(this, 177, 153, textureX, textureY); // Box 167
		sncb_m6_tailModel[104] = new ModelRendererTurbo(this, 193, 153, textureX, textureY); // Box 168
		sncb_m6_tailModel[105] = new ModelRendererTurbo(this, 394, 118, textureX, textureY); // Box 169
		sncb_m6_tailModel[106] = new ModelRendererTurbo(this, 193, 161, textureX, textureY); // Box 168
		sncb_m6_tailModel[107] = new ModelRendererTurbo(this, 345, 161, textureX, textureY); // Box 168
		sncb_m6_tailModel[108] = new ModelRendererTurbo(this, 1, 175, textureX, textureY); // Box 71
		sncb_m6_tailModel[109] = new ModelRendererTurbo(this, 137, 169, textureX, textureY); // Box 168
		sncb_m6_tailModel[110] = new ModelRendererTurbo(this, 281, 169, textureX, textureY); // Box 168
		sncb_m6_tailModel[111] = new ModelRendererTurbo(this, 489, 153, textureX, textureY); // Box 221
		sncb_m6_tailModel[112] = new ModelRendererTurbo(this, 425, 169, textureX, textureY); // Box 216
		sncb_m6_tailModel[113] = new ModelRendererTurbo(this, 1, 177, textureX, textureY); // Box 197
		sncb_m6_tailModel[114] = new ModelRendererTurbo(this, 449, 169, textureX, textureY); // Box 217
		sncb_m6_tailModel[115] = new ModelRendererTurbo(this, 209, 153, textureX, textureY); // Box 61
		sncb_m6_tailModel[116] = new ModelRendererTurbo(this, 465, 169, textureX, textureY); // Box 73
		sncb_m6_tailModel[117] = new ModelRendererTurbo(this, 1, 153, textureX, textureY); // Box 196
		sncb_m6_tailModel[118] = new ModelRendererTurbo(this, 153, 177, textureX, textureY); // Box 217
		sncb_m6_tailModel[119] = new ModelRendererTurbo(this, 425, 169, textureX, textureY); // Box 194
		sncb_m6_tailModel[120] = new ModelRendererTurbo(this, 169, 177, textureX, textureY); // Box 193
		sncb_m6_tailModel[121] = new ModelRendererTurbo(this, 113, 17, textureX, textureY); // Box 193
		sncb_m6_tailModel[122] = new ModelRendererTurbo(this, 209, 177, textureX, textureY); // Box 215
		sncb_m6_tailModel[123] = new ModelRendererTurbo(this, 505, 121, textureX, textureY); // Box 215
		sncb_m6_tailModel[124] = new ModelRendererTurbo(this, 169, 177, textureX, textureY); // Box 215
		sncb_m6_tailModel[125] = new ModelRendererTurbo(this, 169, 200, textureX, textureY); // Box 215
		sncb_m6_tailModel[126] = new ModelRendererTurbo(this, 233, 177, textureX, textureY); // Box 215
		sncb_m6_tailModel[127] = new ModelRendererTurbo(this, 193, 177, textureX, textureY); // Box 215
		sncb_m6_tailModel[128] = new ModelRendererTurbo(this, 273, 177, textureX, textureY); // Box 215
		sncb_m6_tailModel[129] = new ModelRendererTurbo(this, 273, 177, textureX, textureY); // Box 215
		sncb_m6_tailModel[130] = new ModelRendererTurbo(this, 337, 177, textureX, textureY); // Box 215
		sncb_m6_tailModel[131] = new ModelRendererTurbo(this, 33, 161, textureX, textureY); // Box 215
		sncb_m6_tailModel[132] = new ModelRendererTurbo(this, 105, 161, textureX, textureY); // Box 215
		sncb_m6_tailModel[133] = new ModelRendererTurbo(this, 321, 177, textureX, textureY); // Box 215
		sncb_m6_tailModel[134] = new ModelRendererTurbo(this, 369, 177, textureX, textureY); // Box 215
		sncb_m6_tailModel[135] = new ModelRendererTurbo(this, 225, 153, textureX, textureY); // Box 61
		sncb_m6_tailModel[136] = new ModelRendererTurbo(this, 369, 177, textureX, textureY); // Box 215
		sncb_m6_tailModel[137] = new ModelRendererTurbo(this, 473, 185, textureX, textureY); // Box 215
		sncb_m6_tailModel[138] = new ModelRendererTurbo(this, 409, 177, textureX, textureY); // Box 213
		sncb_m6_tailModel[139] = new ModelRendererTurbo(this, 177, 177, textureX, textureY); // Box 216
		sncb_m6_tailModel[140] = new ModelRendererTurbo(this, 1, 193, textureX, textureY); // Box 215
		sncb_m6_tailModel[141] = new ModelRendererTurbo(this, 393, 177, textureX, textureY); // Box 216
		sncb_m6_tailModel[142] = new ModelRendererTurbo(this, 457, 153, textureX, textureY); // Box 170
		sncb_m6_tailModel[143] = new ModelRendererTurbo(this, 73, 161, textureX, textureY); // Box 171
		sncb_m6_tailModel[144] = new ModelRendererTurbo(this, 137, 177, textureX, textureY); // Box 174
		sncb_m6_tailModel[145] = new ModelRendererTurbo(this, 249, 153, textureX, textureY); // Box 175
		sncb_m6_tailModel[146] = new ModelRendererTurbo(this, 424, 122, textureX, textureY); // Box 176
		sncb_m6_tailModel[147] = new ModelRendererTurbo(this, 473, 153, textureX, textureY); // Box 163
		sncb_m6_tailModel[148] = new ModelRendererTurbo(this, 145, 161, textureX, textureY); // Box 164
		sncb_m6_tailModel[149] = new ModelRendererTurbo(this, 497, 177, textureX, textureY); // Box 167
		sncb_m6_tailModel[150] = new ModelRendererTurbo(this, 169, 161, textureX, textureY); // Box 168
		sncb_m6_tailModel[151] = new ModelRendererTurbo(this, 424, 122, textureX, textureY); // Box 169
		sncb_m6_tailModel[152] = new ModelRendererTurbo(this, 17, 161, textureX, textureY); // Box 170
		sncb_m6_tailModel[153] = new ModelRendererTurbo(this, 73, 161, textureX, textureY); // Box 171
		sncb_m6_tailModel[154] = new ModelRendererTurbo(this, 473, 185, textureX, textureY); // Box 174
		sncb_m6_tailModel[155] = new ModelRendererTurbo(this, 185, 161, textureX, textureY); // Box 175
		sncb_m6_tailModel[156] = new ModelRendererTurbo(this, 424, 122, textureX, textureY); // Box 176
		sncb_m6_tailModel[157] = new ModelRendererTurbo(this, 145, 177, textureX, textureY); // Box 163
		sncb_m6_tailModel[158] = new ModelRendererTurbo(this, 145, 161, textureX, textureY); // Box 164
		sncb_m6_tailModel[159] = new ModelRendererTurbo(this, 73, 193, textureX, textureY); // Box 167
		sncb_m6_tailModel[160] = new ModelRendererTurbo(this, 337, 161, textureX, textureY); // Box 168
		sncb_m6_tailModel[161] = new ModelRendererTurbo(this, 424, 122, textureX, textureY); // Box 169
		sncb_m6_tailModel[162] = new ModelRendererTurbo(this, 345, 209, textureX, textureY); // Box 175
		sncb_m6_tailModel[163] = new ModelRendererTurbo(this, 409, 209, textureX, textureY); // Box 168
		sncb_m6_tailModel[164] = new ModelRendererTurbo(this, 441, 209, textureX, textureY); // Box 168
		sncb_m6_tailModel[165] = new ModelRendererTurbo(this, 313, 217, textureX, textureY); // Box 170
		sncb_m6_tailModel[166] = new ModelRendererTurbo(this, 73, 161, textureX, textureY); // Box 171
		sncb_m6_tailModel[167] = new ModelRendererTurbo(this, 473, 217, textureX, textureY); // Box 174
		sncb_m6_tailModel[168] = new ModelRendererTurbo(this, 401, 217, textureX, textureY); // Box 175
		sncb_m6_tailModel[169] = new ModelRendererTurbo(this, 65, 193, textureX, textureY); // Box 176
		sncb_m6_tailModel[170] = new ModelRendererTurbo(this, 73, 153, textureX, textureY); // Box 166
		sncb_m6_tailModel[171] = new ModelRendererTurbo(this, 57, 225, textureX, textureY); // Box 170
		sncb_m6_tailModel[172] = new ModelRendererTurbo(this, 113, 225, textureX, textureY); // Box 163
		sncb_m6_tailModel[173] = new ModelRendererTurbo(this, 145, 161, textureX, textureY); // Box 164
		sncb_m6_tailModel[174] = new ModelRendererTurbo(this, 89, 225, textureX, textureY); // Box 167
		sncb_m6_tailModel[175] = new ModelRendererTurbo(this, 153, 225, textureX, textureY); // Box 168
		sncb_m6_tailModel[176] = new ModelRendererTurbo(this, 105, 193, textureX, textureY); // Box 169
		sncb_m6_tailModel[177] = new ModelRendererTurbo(this, 161, 225, textureX, textureY); // Box 163
		sncb_m6_tailModel[178] = new ModelRendererTurbo(this, 73, 153, textureX, textureY); // Box 166
		sncb_m6_tailModel[179] = new ModelRendererTurbo(this, 129, 17, textureX, textureY); // Box 193
		sncb_m6_tailModel[180] = new ModelRendererTurbo(this, 9, 33, textureX, textureY); // Box 193
		sncb_m6_tailModel[181] = new ModelRendererTurbo(this, 193, 225, textureX, textureY); // Box 193
		sncb_m6_tailModel[182] = new ModelRendererTurbo(this, 209, 225, textureX, textureY); // Box 193
		sncb_m6_tailModel[183] = new ModelRendererTurbo(this, 217, 225, textureX, textureY); // Box 193
		sncb_m6_tailModel[184] = new ModelRendererTurbo(this, 145, 17, textureX, textureY); // Box 193
		sncb_m6_tailModel[185] = new ModelRendererTurbo(this, 305, 33, textureX, textureY); // Box 193
		sncb_m6_tailModel[186] = new ModelRendererTurbo(this, 225, 225, textureX, textureY); // Box 31
		sncb_m6_tailModel[187] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 31
		sncb_m6_tailModel[188] = new ModelRendererTurbo(this, 233, 225, textureX, textureY); // Box 31
		sncb_m6_tailModel[189] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 31
		sncb_m6_tailModel[190] = new ModelRendererTurbo(this, 257, 225, textureX, textureY); // Box 31
		sncb_m6_tailModel[191] = new ModelRendererTurbo(this, 217, 9, textureX, textureY); // Box 31
		sncb_m6_tailModel[192] = new ModelRendererTurbo(this, 265, 225, textureX, textureY); // Box 31
		sncb_m6_tailModel[193] = new ModelRendererTurbo(this, 105, 233, textureX, textureY); // Box 10
		sncb_m6_tailModel[194] = new ModelRendererTurbo(this, 273, 233, textureX, textureY); // Box 10
		sncb_m6_tailModel[195] = new ModelRendererTurbo(this, 1, 217, textureX, textureY); // Box 10
		sncb_m6_tailModel[196] = new ModelRendererTurbo(this, 425, 225, textureX, textureY); // Box 10
		sncb_m6_tailModel[197] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 10
		sncb_m6_tailModel[198] = new ModelRendererTurbo(this, 249, 9, textureX, textureY); // Box 10
		sncb_m6_tailModel[199] = new ModelRendererTurbo(this, 265, 9, textureX, textureY); // Box 10
		sncb_m6_tailModel[200] = new ModelRendererTurbo(this, 289, 9, textureX, textureY); // Box 10
		sncb_m6_tailModel[201] = new ModelRendererTurbo(this, 449, 225, textureX, textureY); // Box 215
		sncb_m6_tailModel[202] = new ModelRendererTurbo(this, 489, 225, textureX, textureY); // Box 215
		sncb_m6_tailModel[203] = new ModelRendererTurbo(this, 25, 233, textureX, textureY); // Box 193
		sncb_m6_tailModel[204] = new ModelRendererTurbo(this, 265, 113, textureX, textureY); // Box 193
		sncb_m6_tailModel[205] = new ModelRendererTurbo(this, 313, 129, textureX, textureY); // Box 193
		sncb_m6_tailModel[206] = new ModelRendererTurbo(this, 273, 225, textureX, textureY); // Box 193
		sncb_m6_tailModel[207] = new ModelRendererTurbo(this, 289, 225, textureX, textureY); // Box 193
		sncb_m6_tailModel[208] = new ModelRendererTurbo(this, 305, 225, textureX, textureY); // Box 193
		sncb_m6_tailModel[209] = new ModelRendererTurbo(this, 313, 225, textureX, textureY); // Box 193
		sncb_m6_tailModel[210] = new ModelRendererTurbo(this, 265, 97, textureX, textureY); // Box 193
		sncb_m6_tailModel[211] = new ModelRendererTurbo(this, 329, 129, textureX, textureY); // Box 193
		sncb_m6_tailModel[212] = new ModelRendererTurbo(this, 65, 233, textureX, textureY); // Box 193
		sncb_m6_tailModel[213] = new ModelRendererTurbo(this, 377, 129, textureX, textureY); // Box 193
		sncb_m6_tailModel[214] = new ModelRendererTurbo(this, 457, 129, textureX, textureY); // Box 193
		sncb_m6_tailModel[215] = new ModelRendererTurbo(this, 321, 225, textureX, textureY); // Box 193
		sncb_m6_tailModel[216] = new ModelRendererTurbo(this, 337, 225, textureX, textureY); // Box 193
		sncb_m6_tailModel[217] = new ModelRendererTurbo(this, 401, 225, textureX, textureY); // Box 193
		sncb_m6_tailModel[218] = new ModelRendererTurbo(this, 409, 225, textureX, textureY); // Box 193
		sncb_m6_tailModel[219] = new ModelRendererTurbo(this, 473, 137, textureX, textureY); // Box 193
		sncb_m6_tailModel[220] = new ModelRendererTurbo(this, 489, 137, textureX, textureY); // Box 193
		sncb_m6_tailModel[221] = new ModelRendererTurbo(this, 465, 225, textureX, textureY); // Box 216
		sncb_m6_tailModel[222] = new ModelRendererTurbo(this, 105, 241, textureX, textureY); // Box 73
		sncb_m6_tailModel[223] = new ModelRendererTurbo(this, 1, 241, textureX, textureY); // Box 215
		sncb_m6_tailModel[224] = new ModelRendererTurbo(this, 129, 241, textureX, textureY); // Box 215
		sncb_m6_tailModel[225] = new ModelRendererTurbo(this, 417, 225, textureX, textureY); // Box 163
		sncb_m6_tailModel[226] = new ModelRendererTurbo(this, 145, 161, textureX, textureY); // Box 164
		sncb_m6_tailModel[227] = new ModelRendererTurbo(this, 433, 225, textureX, textureY); // Box 166
		sncb_m6_tailModel[228] = new ModelRendererTurbo(this, 97, 233, textureX, textureY); // Box 167
		sncb_m6_tailModel[229] = new ModelRendererTurbo(this, 265, 233, textureX, textureY); // Box 168
		sncb_m6_tailModel[230] = new ModelRendererTurbo(this, 121, 193, textureX, textureY); // Box 169
		sncb_m6_tailModel[231] = new ModelRendererTurbo(this, 65, 233, textureX, textureY); // Box 163
		sncb_m6_tailModel[232] = new ModelRendererTurbo(this, 145, 161, textureX, textureY); // Box 164
		sncb_m6_tailModel[233] = new ModelRendererTurbo(this, 473, 233, textureX, textureY); // Box 166
		sncb_m6_tailModel[234] = new ModelRendererTurbo(this, 169, 241, textureX, textureY); // Box 167
		sncb_m6_tailModel[235] = new ModelRendererTurbo(this, 89, 241, textureX, textureY); // Box 168
		sncb_m6_tailModel[236] = new ModelRendererTurbo(this, 137, 193, textureX, textureY); // Box 169
		sncb_m6_tailModel[237] = new ModelRendererTurbo(this, 185, 241, textureX, textureY); // Box 215
		sncb_m6_tailModel[238] = new ModelRendererTurbo(this, 209, 241, textureX, textureY); // Box 215
		sncb_m6_tailModel[239] = new ModelRendererTurbo(this, 233, 241, textureX, textureY); // Box 215
		sncb_m6_tailModel[240] = new ModelRendererTurbo(this, 257, 241, textureX, textureY); // Box 213
		sncb_m6_tailModel[241] = new ModelRendererTurbo(this, 281, 241, textureX, textureY); // Box 213
		sncb_m6_tailModel[242] = new ModelRendererTurbo(this, 305, 241, textureX, textureY); // Box 213
		sncb_m6_tailModel[243] = new ModelRendererTurbo(this, 329, 241, textureX, textureY); // Box 213
		sncb_m6_tailModel[244] = new ModelRendererTurbo(this, 353, 241, textureX, textureY); // Box 215
		sncb_m6_tailModel[245] = new ModelRendererTurbo(this, 369, 241, textureX, textureY); // Box 215
		sncb_m6_tailModel[246] = new ModelRendererTurbo(this, 385, 241, textureX, textureY); // Box 215
		sncb_m6_tailModel[247] = new ModelRendererTurbo(this, 401, 241, textureX, textureY); // Box 215
		sncb_m6_tailModel[248] = new ModelRendererTurbo(this, 473, 241, textureX, textureY); // Box 213
		sncb_m6_tailModel[249] = new ModelRendererTurbo(this, 1, 249, textureX, textureY); // Box 213
		sncb_m6_tailModel[250] = new ModelRendererTurbo(this, 145, 249, textureX, textureY); // Box 221
		sncb_m6_tailModel[251] = new ModelRendererTurbo(this, 257, 249, textureX, textureY); // Box 213
		sncb_m6_tailModel[252] = new ModelRendererTurbo(this, 417, 249, textureX, textureY); // Box 213
		sncb_m6_tailModel[253] = new ModelRendererTurbo(this, 225, 241, textureX, textureY); // Box 221
		sncb_m6_tailModel[254] = new ModelRendererTurbo(this, 433, 265, textureX, textureY); // Box 221
		sncb_m6_tailModel[255] = new ModelRendererTurbo(this, 305, 9, textureX, textureY); // Box 215
		sncb_m6_tailModel[256] = new ModelRendererTurbo(this, 385, 9, textureX, textureY); // Box 215
		sncb_m6_tailModel[257] = new ModelRendererTurbo(this, 433, 233, textureX, textureY); // Box 215
		sncb_m6_tailModel[258] = new ModelRendererTurbo(this, 105, 241, textureX, textureY); // Box 215
		sncb_m6_tailModel[259] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 215
		sncb_m6_tailModel[260] = new ModelRendererTurbo(this, 17, 33, textureX, textureY); // Box 215
		sncb_m6_tailModel[261] = new ModelRendererTurbo(this, 201, 241, textureX, textureY); // Box 215
		sncb_m6_tailModel[262] = new ModelRendererTurbo(this, 497, 241, textureX, textureY); // Box 215
		sncb_m6_tailModel[263] = new ModelRendererTurbo(this, 233, 249, textureX, textureY); // Box 215
		sncb_m6_tailModel[264] = new ModelRendererTurbo(this, 497, 249, textureX, textureY); // Box 215
		sncb_m6_tailModel[265] = new ModelRendererTurbo(this, 505, 193, textureX, textureY); // Box 215
		sncb_m6_tailModel[266] = new ModelRendererTurbo(this, 49, 201, textureX, textureY); // Box 215
		sncb_m6_tailModel[267] = new ModelRendererTurbo(this, 489, 49, textureX, textureY); // Box 84
		sncb_m6_tailModel[268] = new ModelRendererTurbo(this, 41, 209, textureX, textureY); // Box 81
		sncb_m6_tailModel[269] = new ModelRendererTurbo(this, 489, 49, textureX, textureY); // Box 84
		sncb_m6_tailModel[270] = new ModelRendererTurbo(this, 65, 209, textureX, textureY); // Box 81
		sncb_m6_tailModel[271] = new ModelRendererTurbo(this, 361, 33, textureX, textureY); // Box 215
		sncb_m6_tailModel[272] = new ModelRendererTurbo(this, 473, 57, textureX, textureY); // Box 215
		sncb_m6_tailModel[273] = new ModelRendererTurbo(this, 185, 265, textureX, textureY); // doorFrontLeft1
		sncb_m6_tailModel[274] = new ModelRendererTurbo(this, 232, 265, textureX, textureY); // doorFrontLeft2
		sncb_m6_tailModel[275] = new ModelRendererTurbo(this, 185, 265, textureX, textureY); // doorBackLeft1
		sncb_m6_tailModel[276] = new ModelRendererTurbo(this, 201, 265, textureX, textureY); // doorBackRight1
		sncb_m6_tailModel[277] = new ModelRendererTurbo(this, 201, 265, textureX, textureY); // doorFrontRight1
		sncb_m6_tailModel[278] = new ModelRendererTurbo(this, 217, 265, textureX, textureY); // doorFrontRight2
		sncb_m6_tailModel[279] = new ModelRendererTurbo(this, 321, 265, textureX, textureY); // Box 215
		sncb_m6_tailModel[280] = new ModelRendererTurbo(this, 441, 257, textureX, textureY); // Box 215
		sncb_m6_tailModel[281] = new ModelRendererTurbo(this, 337, 265, textureX, textureY); // Box 215
		sncb_m6_tailModel[282] = new ModelRendererTurbo(this, 361, 265, textureX, textureY); // Box 215
		sncb_m6_tailModel[283] = new ModelRendererTurbo(this, 393, 265, textureX, textureY); // Box 215
		sncb_m6_tailModel[284] = new ModelRendererTurbo(this, 41, 257, textureX, textureY); // Box 215
		sncb_m6_tailModel[285] = new ModelRendererTurbo(this, 65, 257, textureX, textureY); // Box 215
		sncb_m6_tailModel[286] = new ModelRendererTurbo(this, 89, 257, textureX, textureY); // Box 527
		sncb_m6_tailModel[287] = new ModelRendererTurbo(this, 193, 209, textureX, textureY); // Box 528
		sncb_m6_tailModel[288] = new ModelRendererTurbo(this, 113, 257, textureX, textureY); // Box 529
		sncb_m6_tailModel[289] = new ModelRendererTurbo(this, 473, 265, textureX, textureY); // Box 530
		sncb_m6_tailModel[290] = new ModelRendererTurbo(this, 473, 265, textureX, textureY); // Box 531
		sncb_m6_tailModel[291] = new ModelRendererTurbo(this, 313, 257, textureX, textureY); // Box 532
		sncb_m6_tailModel[292] = new ModelRendererTurbo(this, 209, 211, textureX, textureY); // Box 533
		sncb_m6_tailModel[293] = new ModelRendererTurbo(this, 449, 265, textureX, textureY); // Box 534
		sncb_m6_tailModel[294] = new ModelRendererTurbo(this, 441, 65, textureX, textureY); // Box 535
		sncb_m6_tailModel[295] = new ModelRendererTurbo(this, 457, 65, textureX, textureY); // Box 536
		sncb_m6_tailModel[296] = new ModelRendererTurbo(this, 393, 257, textureX, textureY); // Box 537
		sncb_m6_tailModel[297] = new ModelRendererTurbo(this, 1, 273, textureX, textureY); // Box 538
		sncb_m6_tailModel[298] = new ModelRendererTurbo(this, 25, 273, textureX, textureY); // Box 539
		sncb_m6_tailModel[299] = new ModelRendererTurbo(this, 473, 65, textureX, textureY); // Box 543
		sncb_m6_tailModel[300] = new ModelRendererTurbo(this, 489, 65, textureX, textureY); // Box 544
		sncb_m6_tailModel[301] = new ModelRendererTurbo(this, 25, 273, textureX, textureY); // Box 545
		sncb_m6_tailModel[302] = new ModelRendererTurbo(this, 1, 273, textureX, textureY); // Box 547
		sncb_m6_tailModel[303] = new ModelRendererTurbo(this, 17, 265, textureX, textureY); // Box 549
		sncb_m6_tailModel[304] = new ModelRendererTurbo(this, 97, 273, textureX, textureY); // Box 550
		sncb_m6_tailModel[305] = new ModelRendererTurbo(this, 113, 273, textureX, textureY); // Box 551
		sncb_m6_tailModel[306] = new ModelRendererTurbo(this, 121, 273, textureX, textureY); // Box 552
		sncb_m6_tailModel[307] = new ModelRendererTurbo(this, 121, 273, textureX, textureY); // Box 553
		sncb_m6_tailModel[308] = new ModelRendererTurbo(this, 249, 273, textureX, textureY); // Box 554
		sncb_m6_tailModel[309] = new ModelRendererTurbo(this, 123, 275, textureX, textureY); // Box 555
		sncb_m6_tailModel[310] = new ModelRendererTurbo(this, 265, 273, textureX, textureY); // Box 556
		sncb_m6_tailModel[311] = new ModelRendererTurbo(this, 305, 273, textureX, textureY); // Box 557
		sncb_m6_tailModel[312] = new ModelRendererTurbo(this, 417, 273, textureX, textureY); // Box 558
		sncb_m6_tailModel[313] = new ModelRendererTurbo(this, 361, 273, textureX, textureY); // Box 559
		sncb_m6_tailModel[314] = new ModelRendererTurbo(this, 402, 276, textureX, textureY); // Box 560
		sncb_m6_tailModel[315] = new ModelRendererTurbo(this, 17, 273, textureX, textureY); // Box 561
		sncb_m6_tailModel[316] = new ModelRendererTurbo(this, 41, 273, textureX, textureY); // Box 562
		sncb_m6_tailModel[317] = new ModelRendererTurbo(this, 417, 73, textureX, textureY, "lamp"); // lamp
		sncb_m6_tailModel[318] = new ModelRendererTurbo(this, 433, 73, textureX, textureY, "lamp"); // lamp
		sncb_m6_tailModel[319] = new ModelRendererTurbo(this, 449, 73, textureX, textureY, "lamp"); // lamp
		sncb_m6_tailModel[320] = new ModelRendererTurbo(this, 465, 73, textureX, textureY, "lamp"); // lamp
		sncb_m6_tailModel[321] = new ModelRendererTurbo(this, 481, 73, textureX, textureY, "lamp"); // lamp
		sncb_m6_tailModel[322] = new ModelRendererTurbo(this, 497, 73, textureX, textureY, "lamp"); // lamp
		sncb_m6_tailModel[323] = new ModelRendererTurbo(this, 433, 81, textureX, textureY, "lamp"); // lamp
		sncb_m6_tailModel[324] = new ModelRendererTurbo(this, 449, 81, textureX, textureY, "lamp"); // lamp
		sncb_m6_tailModel[325] = new ModelRendererTurbo(this, 465, 81, textureX, textureY, "lamp"); // lamp
		sncb_m6_tailModel[326] = new ModelRendererTurbo(this, 481, 81, textureX, textureY, "lamp"); // lamp
		sncb_m6_tailModel[327] = new ModelRendererTurbo(this, 497, 81, textureX, textureY, "lamp"); // lamp
		sncb_m6_tailModel[328] = new ModelRendererTurbo(this, 281, 89, textureX, textureY, "lamp"); // lamp
		sncb_m6_tailModel[329] = new ModelRendererTurbo(this, 297, 89, textureX, textureY, "lamp"); // lamp
		sncb_m6_tailModel[330] = new ModelRendererTurbo(this, 1, 137, textureX, textureY, "lamp"); // lamp
		sncb_m6_tailModel[331] = new ModelRendererTurbo(this, 1, 145, textureX, textureY, "lamp"); // lamp
		sncb_m6_tailModel[332] = new ModelRendererTurbo(this, 225, 153, textureX, textureY, "lamp"); // lamp
		sncb_m6_tailModel[333] = new ModelRendererTurbo(this, 1, 281, textureX, textureY); // Box 215
		sncb_m6_tailModel[334] = new ModelRendererTurbo(this, 489, 273, textureX, textureY); // Box 215
		sncb_m6_tailModel[335] = new ModelRendererTurbo(this, 57, 281, textureX, textureY); // Box 215
		sncb_m6_tailModel[336] = new ModelRendererTurbo(this, 273, 209, textureX, textureY); // Box 215
		sncb_m6_tailModel[337] = new ModelRendererTurbo(this, 81, 281, textureX, textureY); // Box 215
		sncb_m6_tailModel[338] = new ModelRendererTurbo(this, 33, 281, textureX, textureY); // Box 215
		sncb_m6_tailModel[339] = new ModelRendererTurbo(this, 97, 281, textureX, textureY); // Box 215
		sncb_m6_tailModel[340] = new ModelRendererTurbo(this, 321, 209, textureX, textureY); // Box 215
		sncb_m6_tailModel[341] = new ModelRendererTurbo(this, 65, 281, textureX, textureY); // Box 215
		sncb_m6_tailModel[342] = new ModelRendererTurbo(this, 361, 281, textureX, textureY); // Box 215
		sncb_m6_tailModel[343] = new ModelRendererTurbo(this, 369, 281, textureX, textureY); // Box 215
		sncb_m6_tailModel[344] = new ModelRendererTurbo(this, 473, 153, textureX, textureY); // Box 163
		sncb_m6_tailModel[345] = new ModelRendererTurbo(this, 145, 161, textureX, textureY); // Box 164
		sncb_m6_tailModel[346] = new ModelRendererTurbo(this, 497, 177, textureX, textureY); // Box 167
		sncb_m6_tailModel[347] = new ModelRendererTurbo(this, 169, 161, textureX, textureY); // Box 168
		sncb_m6_tailModel[348] = new ModelRendererTurbo(this, 424, 122, textureX, textureY); // Box 169
		sncb_m6_tailModel[349] = new ModelRendererTurbo(this, 145, 177, textureX, textureY); // Box 163
		sncb_m6_tailModel[350] = new ModelRendererTurbo(this, 145, 161, textureX, textureY); // Box 164
		sncb_m6_tailModel[351] = new ModelRendererTurbo(this, 73, 193, textureX, textureY); // Box 167
		sncb_m6_tailModel[352] = new ModelRendererTurbo(this, 337, 161, textureX, textureY); // Box 168
		sncb_m6_tailModel[353] = new ModelRendererTurbo(this, 424, 122, textureX, textureY); // Box 169
		sncb_m6_tailModel[354] = new ModelRendererTurbo(this, 489, 49, textureX, textureY); // Box 84
		sncb_m6_tailModel[355] = new ModelRendererTurbo(this, 65, 209, textureX, textureY); // Box 81
		sncb_m6_tailModel[356] = new ModelRendererTurbo(this, 473, 153, textureX, textureY); // Box 163
		sncb_m6_tailModel[357] = new ModelRendererTurbo(this, 145, 161, textureX, textureY); // Box 164
		sncb_m6_tailModel[358] = new ModelRendererTurbo(this, 497, 177, textureX, textureY); // Box 167
		sncb_m6_tailModel[359] = new ModelRendererTurbo(this, 169, 161, textureX, textureY); // Box 168
		sncb_m6_tailModel[360] = new ModelRendererTurbo(this, 424, 122, textureX, textureY); // Box 169
		sncb_m6_tailModel[361] = new ModelRendererTurbo(this, 145, 177, textureX, textureY); // Box 163
		sncb_m6_tailModel[362] = new ModelRendererTurbo(this, 145, 161, textureX, textureY); // Box 164
		sncb_m6_tailModel[363] = new ModelRendererTurbo(this, 73, 193, textureX, textureY); // Box 167
		sncb_m6_tailModel[364] = new ModelRendererTurbo(this, 337, 161, textureX, textureY); // Box 168
		sncb_m6_tailModel[365] = new ModelRendererTurbo(this, 424, 122, textureX, textureY); // Box 169
		sncb_m6_tailModel[366] = new ModelRendererTurbo(this, 489, 49, textureX, textureY); // Box 84
		sncb_m6_tailModel[367] = new ModelRendererTurbo(this, 65, 209, textureX, textureY); // Box 81
		sncb_m6_tailModel[368] = new ModelRendererTurbo(this, 473, 153, textureX, textureY); // Box 163
		sncb_m6_tailModel[369] = new ModelRendererTurbo(this, 145, 161, textureX, textureY); // Box 164
		sncb_m6_tailModel[370] = new ModelRendererTurbo(this, 497, 177, textureX, textureY); // Box 167
		sncb_m6_tailModel[371] = new ModelRendererTurbo(this, 169, 161, textureX, textureY); // Box 168
		sncb_m6_tailModel[372] = new ModelRendererTurbo(this, 424, 122, textureX, textureY); // Box 169
		sncb_m6_tailModel[373] = new ModelRendererTurbo(this, 145, 177, textureX, textureY); // Box 163
		sncb_m6_tailModel[374] = new ModelRendererTurbo(this, 145, 161, textureX, textureY); // Box 164
		sncb_m6_tailModel[375] = new ModelRendererTurbo(this, 73, 193, textureX, textureY); // Box 167
		sncb_m6_tailModel[376] = new ModelRendererTurbo(this, 337, 161, textureX, textureY); // Box 168
		sncb_m6_tailModel[377] = new ModelRendererTurbo(this, 424, 122, textureX, textureY); // Box 169
		sncb_m6_tailModel[378] = new ModelRendererTurbo(this, 489, 49, textureX, textureY); // Box 84
		sncb_m6_tailModel[379] = new ModelRendererTurbo(this, 65, 209, textureX, textureY); // Box 81
		sncb_m6_tailModel[380] = new ModelRendererTurbo(this, 457, 153, textureX, textureY); // Box 170
		sncb_m6_tailModel[381] = new ModelRendererTurbo(this, 73, 161, textureX, textureY); // Box 171
		sncb_m6_tailModel[382] = new ModelRendererTurbo(this, 137, 177, textureX, textureY); // Box 174
		sncb_m6_tailModel[383] = new ModelRendererTurbo(this, 249, 153, textureX, textureY); // Box 175
		sncb_m6_tailModel[384] = new ModelRendererTurbo(this, 424, 122, textureX, textureY); // Box 176
		sncb_m6_tailModel[385] = new ModelRendererTurbo(this, 17, 161, textureX, textureY); // Box 170
		sncb_m6_tailModel[386] = new ModelRendererTurbo(this, 73, 161, textureX, textureY); // Box 171
		sncb_m6_tailModel[387] = new ModelRendererTurbo(this, 473, 185, textureX, textureY); // Box 174
		sncb_m6_tailModel[388] = new ModelRendererTurbo(this, 185, 161, textureX, textureY); // Box 175
		sncb_m6_tailModel[389] = new ModelRendererTurbo(this, 424, 122, textureX, textureY); // Box 176
		sncb_m6_tailModel[390] = new ModelRendererTurbo(this, 489, 49, textureX, textureY); // Box 84
		sncb_m6_tailModel[391] = new ModelRendererTurbo(this, 41, 209, textureX, textureY); // Box 81
		sncb_m6_tailModel[392] = new ModelRendererTurbo(this, 457, 153, textureX, textureY); // Box 170
		sncb_m6_tailModel[393] = new ModelRendererTurbo(this, 73, 161, textureX, textureY); // Box 171
		sncb_m6_tailModel[394] = new ModelRendererTurbo(this, 137, 177, textureX, textureY); // Box 174
		sncb_m6_tailModel[395] = new ModelRendererTurbo(this, 249, 153, textureX, textureY); // Box 175
		sncb_m6_tailModel[396] = new ModelRendererTurbo(this, 424, 122, textureX, textureY); // Box 176
		sncb_m6_tailModel[397] = new ModelRendererTurbo(this, 17, 161, textureX, textureY); // Box 170
		sncb_m6_tailModel[398] = new ModelRendererTurbo(this, 73, 161, textureX, textureY); // Box 171
		sncb_m6_tailModel[399] = new ModelRendererTurbo(this, 473, 185, textureX, textureY); // Box 174
		sncb_m6_tailModel[400] = new ModelRendererTurbo(this, 185, 161, textureX, textureY); // Box 175
		sncb_m6_tailModel[401] = new ModelRendererTurbo(this, 424, 122, textureX, textureY); // Box 176
		sncb_m6_tailModel[402] = new ModelRendererTurbo(this, 489, 49, textureX, textureY); // Box 84
		sncb_m6_tailModel[403] = new ModelRendererTurbo(this, 41, 209, textureX, textureY); // Box 81
		sncb_m6_tailModel[404] = new ModelRendererTurbo(this, 457, 153, textureX, textureY); // Box 170
		sncb_m6_tailModel[405] = new ModelRendererTurbo(this, 73, 161, textureX, textureY); // Box 171
		sncb_m6_tailModel[406] = new ModelRendererTurbo(this, 137, 177, textureX, textureY); // Box 174
		sncb_m6_tailModel[407] = new ModelRendererTurbo(this, 249, 153, textureX, textureY); // Box 175
		sncb_m6_tailModel[408] = new ModelRendererTurbo(this, 424, 122, textureX, textureY); // Box 176
		sncb_m6_tailModel[409] = new ModelRendererTurbo(this, 17, 161, textureX, textureY); // Box 170
		sncb_m6_tailModel[410] = new ModelRendererTurbo(this, 73, 161, textureX, textureY); // Box 171
		sncb_m6_tailModel[411] = new ModelRendererTurbo(this, 473, 185, textureX, textureY); // Box 174
		sncb_m6_tailModel[412] = new ModelRendererTurbo(this, 185, 161, textureX, textureY); // Box 175
		sncb_m6_tailModel[413] = new ModelRendererTurbo(this, 424, 122, textureX, textureY); // Box 176
		sncb_m6_tailModel[414] = new ModelRendererTurbo(this, 489, 49, textureX, textureY); // Box 84
		sncb_m6_tailModel[415] = new ModelRendererTurbo(this, 41, 209, textureX, textureY); // Box 81
		sncb_m6_tailModel[416] = new ModelRendererTurbo(this, 113, 225, textureX, textureY); // Box 163
		sncb_m6_tailModel[417] = new ModelRendererTurbo(this, 145, 161, textureX, textureY); // Box 164
		sncb_m6_tailModel[418] = new ModelRendererTurbo(this, 89, 225, textureX, textureY); // Box 167
		sncb_m6_tailModel[419] = new ModelRendererTurbo(this, 153, 225, textureX, textureY); // Box 168
		sncb_m6_tailModel[420] = new ModelRendererTurbo(this, 105, 193, textureX, textureY); // Box 169
		sncb_m6_tailModel[421] = new ModelRendererTurbo(this, 161, 225, textureX, textureY); // Box 163
		sncb_m6_tailModel[422] = new ModelRendererTurbo(this, 73, 153, textureX, textureY); // Box 166
		sncb_m6_tailModel[423] = new ModelRendererTurbo(this, 113, 225, textureX, textureY); // Box 163
		sncb_m6_tailModel[424] = new ModelRendererTurbo(this, 145, 161, textureX, textureY); // Box 164
		sncb_m6_tailModel[425] = new ModelRendererTurbo(this, 89, 225, textureX, textureY); // Box 167
		sncb_m6_tailModel[426] = new ModelRendererTurbo(this, 153, 225, textureX, textureY); // Box 168
		sncb_m6_tailModel[427] = new ModelRendererTurbo(this, 105, 193, textureX, textureY); // Box 169
		sncb_m6_tailModel[428] = new ModelRendererTurbo(this, 161, 225, textureX, textureY); // Box 163
		sncb_m6_tailModel[429] = new ModelRendererTurbo(this, 73, 153, textureX, textureY); // Box 166
		sncb_m6_tailModel[430] = new ModelRendererTurbo(this, 113, 225, textureX, textureY); // Box 163
		sncb_m6_tailModel[431] = new ModelRendererTurbo(this, 145, 161, textureX, textureY); // Box 164
		sncb_m6_tailModel[432] = new ModelRendererTurbo(this, 89, 225, textureX, textureY); // Box 167
		sncb_m6_tailModel[433] = new ModelRendererTurbo(this, 153, 225, textureX, textureY); // Box 168
		sncb_m6_tailModel[434] = new ModelRendererTurbo(this, 105, 193, textureX, textureY); // Box 169
		sncb_m6_tailModel[435] = new ModelRendererTurbo(this, 161, 225, textureX, textureY); // Box 163
		sncb_m6_tailModel[436] = new ModelRendererTurbo(this, 73, 153, textureX, textureY); // Box 166
		sncb_m6_tailModel[437] = new ModelRendererTurbo(this, 313, 217, textureX, textureY); // Box 170
		sncb_m6_tailModel[438] = new ModelRendererTurbo(this, 73, 161, textureX, textureY); // Box 171
		sncb_m6_tailModel[439] = new ModelRendererTurbo(this, 473, 217, textureX, textureY); // Box 174
		sncb_m6_tailModel[440] = new ModelRendererTurbo(this, 401, 217, textureX, textureY); // Box 175
		sncb_m6_tailModel[441] = new ModelRendererTurbo(this, 65, 193, textureX, textureY); // Box 176
		sncb_m6_tailModel[442] = new ModelRendererTurbo(this, 73, 153, textureX, textureY); // Box 166
		sncb_m6_tailModel[443] = new ModelRendererTurbo(this, 57, 225, textureX, textureY); // Box 170
		sncb_m6_tailModel[444] = new ModelRendererTurbo(this, 313, 217, textureX, textureY); // Box 170
		sncb_m6_tailModel[445] = new ModelRendererTurbo(this, 73, 161, textureX, textureY); // Box 171
		sncb_m6_tailModel[446] = new ModelRendererTurbo(this, 473, 217, textureX, textureY); // Box 174
		sncb_m6_tailModel[447] = new ModelRendererTurbo(this, 401, 217, textureX, textureY); // Box 175
		sncb_m6_tailModel[448] = new ModelRendererTurbo(this, 65, 193, textureX, textureY); // Box 176
		sncb_m6_tailModel[449] = new ModelRendererTurbo(this, 73, 153, textureX, textureY); // Box 166
		sncb_m6_tailModel[450] = new ModelRendererTurbo(this, 57, 225, textureX, textureY); // Box 170
		sncb_m6_tailModel[451] = new ModelRendererTurbo(this, 313, 217, textureX, textureY); // Box 170
		sncb_m6_tailModel[452] = new ModelRendererTurbo(this, 73, 161, textureX, textureY); // Box 171
		sncb_m6_tailModel[453] = new ModelRendererTurbo(this, 473, 217, textureX, textureY); // Box 174
		sncb_m6_tailModel[454] = new ModelRendererTurbo(this, 401, 217, textureX, textureY); // Box 175
		sncb_m6_tailModel[455] = new ModelRendererTurbo(this, 65, 193, textureX, textureY); // Box 176
		sncb_m6_tailModel[456] = new ModelRendererTurbo(this, 73, 153, textureX, textureY); // Box 166
		sncb_m6_tailModel[457] = new ModelRendererTurbo(this, 57, 225, textureX, textureY); // Box 170
		sncb_m6_tailModel[458] = new ModelRendererTurbo(this, 145, 161, textureX, textureY); // Box 183
		sncb_m6_tailModel[459] = new ModelRendererTurbo(this, 145, 161, textureX, textureY); // Box 184
		sncb_m6_tailModel[460] = new ModelRendererTurbo(this, 465, 41, textureX, textureY); // Box 185
		sncb_m6_tailModel[461] = new ModelRendererTurbo(this, 481, 89, textureX, textureY); // Box 186
		sncb_m6_tailModel[462] = new ModelRendererTurbo(this, 441, 57, textureX, textureY); // Box 187
		sncb_m6_tailModel[463] = new ModelRendererTurbo(this, 497, 89, textureX, textureY); // Box 188
		sncb_m6_tailModel[464] = new ModelRendererTurbo(this, 345, 117, textureX, textureY); // Box 189
		sncb_m6_tailModel[465] = new ModelRendererTurbo(this, 257, 81, textureX, textureY); // Box 190
		sncb_m6_tailModel[466] = new ModelRendererTurbo(this, 273, 25, textureX, textureY); // Box 191
		sncb_m6_tailModel[467] = new ModelRendererTurbo(this, 305, 25, textureX, textureY); // Box 192
		sncb_m6_tailModel[468] = new ModelRendererTurbo(this, 489, 49, textureX, textureY); // Box 193
		sncb_m6_tailModel[469] = new ModelRendererTurbo(this, 97, 33, textureX, textureY); // Box 194
		sncb_m6_tailModel[470] = new ModelRendererTurbo(this, 145, 161, textureX, textureY); // Box 183
		sncb_m6_tailModel[471] = new ModelRendererTurbo(this, 145, 161, textureX, textureY); // Box 184
		sncb_m6_tailModel[472] = new ModelRendererTurbo(this, 465, 41, textureX, textureY); // Box 185
		sncb_m6_tailModel[473] = new ModelRendererTurbo(this, 481, 89, textureX, textureY); // Box 186
		sncb_m6_tailModel[474] = new ModelRendererTurbo(this, 441, 57, textureX, textureY); // Box 187
		sncb_m6_tailModel[475] = new ModelRendererTurbo(this, 497, 89, textureX, textureY); // Box 188
		sncb_m6_tailModel[476] = new ModelRendererTurbo(this, 345, 117, textureX, textureY); // Box 189
		sncb_m6_tailModel[477] = new ModelRendererTurbo(this, 257, 81, textureX, textureY); // Box 190
		sncb_m6_tailModel[478] = new ModelRendererTurbo(this, 273, 25, textureX, textureY); // Box 191
		sncb_m6_tailModel[479] = new ModelRendererTurbo(this, 305, 25, textureX, textureY); // Box 192
		sncb_m6_tailModel[480] = new ModelRendererTurbo(this, 489, 49, textureX, textureY); // Box 193
		sncb_m6_tailModel[481] = new ModelRendererTurbo(this, 97, 33, textureX, textureY); // Box 194
		sncb_m6_tailModel[482] = new ModelRendererTurbo(this, 145, 161, textureX, textureY); // Box 183
		sncb_m6_tailModel[483] = new ModelRendererTurbo(this, 145, 161, textureX, textureY); // Box 184
		sncb_m6_tailModel[484] = new ModelRendererTurbo(this, 465, 41, textureX, textureY); // Box 185
		sncb_m6_tailModel[485] = new ModelRendererTurbo(this, 481, 89, textureX, textureY); // Box 186
		sncb_m6_tailModel[486] = new ModelRendererTurbo(this, 441, 57, textureX, textureY); // Box 187
		sncb_m6_tailModel[487] = new ModelRendererTurbo(this, 497, 89, textureX, textureY); // Box 188
		sncb_m6_tailModel[488] = new ModelRendererTurbo(this, 345, 117, textureX, textureY); // Box 189
		sncb_m6_tailModel[489] = new ModelRendererTurbo(this, 257, 81, textureX, textureY); // Box 190
		sncb_m6_tailModel[490] = new ModelRendererTurbo(this, 273, 25, textureX, textureY); // Box 191
		sncb_m6_tailModel[491] = new ModelRendererTurbo(this, 305, 25, textureX, textureY); // Box 192
		sncb_m6_tailModel[492] = new ModelRendererTurbo(this, 489, 49, textureX, textureY); // Box 193
		sncb_m6_tailModel[493] = new ModelRendererTurbo(this, 97, 33, textureX, textureY); // Box 194
		sncb_m6_tailModel[494] = new ModelRendererTurbo(this, 73, 161, textureX, textureY); // Box 130
		sncb_m6_tailModel[495] = new ModelRendererTurbo(this, 73, 161, textureX, textureY); // Box 131
		sncb_m6_tailModel[496] = new ModelRendererTurbo(this, 297, 33, textureX, textureY); // Box 132
		sncb_m6_tailModel[497] = new ModelRendererTurbo(this, 497, 33, textureX, textureY); // Box 133
		sncb_m6_tailModel[498] = new ModelRendererTurbo(this, 177, 33, textureX, textureY); // Box 134
		sncb_m6_tailModel[499] = new ModelRendererTurbo(this, 433, 49, textureX, textureY); // Box 135
		sncb_m6_tailModel[500] = new ModelRendererTurbo(this, 449, 49, textureX, textureY); // Box 136
		sncb_m6_tailModel[501] = new ModelRendererTurbo(this, 465, 49, textureX, textureY); // Box 137
		sncb_m6_tailModel[502] = new ModelRendererTurbo(this, 177, 25, textureX, textureY); // Box 138
		sncb_m6_tailModel[503] = new ModelRendererTurbo(this, 193, 25, textureX, textureY); // Box 139
		sncb_m6_tailModel[504] = new ModelRendererTurbo(this, 225, 25, textureX, textureY); // Box 140
		sncb_m6_tailModel[505] = new ModelRendererTurbo(this, 489, 49, textureX, textureY); // Box 141
		sncb_m6_tailModel[506] = new ModelRendererTurbo(this, 73, 161, textureX, textureY); // Box 130
		sncb_m6_tailModel[507] = new ModelRendererTurbo(this, 73, 161, textureX, textureY); // Box 131
		sncb_m6_tailModel[508] = new ModelRendererTurbo(this, 297, 33, textureX, textureY); // Box 132
		sncb_m6_tailModel[509] = new ModelRendererTurbo(this, 497, 33, textureX, textureY); // Box 133
		sncb_m6_tailModel[510] = new ModelRendererTurbo(this, 177, 33, textureX, textureY); // Box 134
		sncb_m6_tailModel[511] = new ModelRendererTurbo(this, 433, 49, textureX, textureY); // Box 135
		sncb_m6_tailModel[512] = new ModelRendererTurbo(this, 449, 49, textureX, textureY); // Box 136
		sncb_m6_tailModel[513] = new ModelRendererTurbo(this, 465, 49, textureX, textureY); // Box 137
		sncb_m6_tailModel[514] = new ModelRendererTurbo(this, 177, 25, textureX, textureY); // Box 138
		sncb_m6_tailModel[515] = new ModelRendererTurbo(this, 193, 25, textureX, textureY); // Box 139
		sncb_m6_tailModel[516] = new ModelRendererTurbo(this, 225, 25, textureX, textureY); // Box 140
		sncb_m6_tailModel[517] = new ModelRendererTurbo(this, 489, 49, textureX, textureY); // Box 141
		sncb_m6_tailModel[518] = new ModelRendererTurbo(this, 73, 161, textureX, textureY); // Box 130
		sncb_m6_tailModel[519] = new ModelRendererTurbo(this, 73, 161, textureX, textureY); // Box 131
		sncb_m6_tailModel[520] = new ModelRendererTurbo(this, 297, 33, textureX, textureY); // Box 132
		sncb_m6_tailModel[521] = new ModelRendererTurbo(this, 497, 33, textureX, textureY); // Box 133
		sncb_m6_tailModel[522] = new ModelRendererTurbo(this, 177, 33, textureX, textureY); // Box 134
		sncb_m6_tailModel[523] = new ModelRendererTurbo(this, 433, 49, textureX, textureY); // Box 135
		sncb_m6_tailModel[524] = new ModelRendererTurbo(this, 449, 49, textureX, textureY); // Box 136
		sncb_m6_tailModel[525] = new ModelRendererTurbo(this, 465, 49, textureX, textureY); // Box 137
		sncb_m6_tailModel[526] = new ModelRendererTurbo(this, 177, 25, textureX, textureY); // Box 138
		sncb_m6_tailModel[527] = new ModelRendererTurbo(this, 193, 25, textureX, textureY); // Box 139
		sncb_m6_tailModel[528] = new ModelRendererTurbo(this, 225, 25, textureX, textureY); // Box 140
		sncb_m6_tailModel[529] = new ModelRendererTurbo(this, 489, 49, textureX, textureY); // Box 141
		sncb_m6_tailModel[530] = new ModelRendererTurbo(this, 25, 153, textureX, textureY); // Box 170
		sncb_m6_tailModel[531] = new ModelRendererTurbo(this, 73, 161, textureX, textureY); // Box 171
		sncb_m6_tailModel[532] = new ModelRendererTurbo(this, 57, 153, textureX, textureY); // Box 172
		sncb_m6_tailModel[533] = new ModelRendererTurbo(this, 73, 153, textureX, textureY); // Box 173
		sncb_m6_tailModel[534] = new ModelRendererTurbo(this, 89, 153, textureX, textureY); // Box 174
		sncb_m6_tailModel[535] = new ModelRendererTurbo(this, 105, 153, textureX, textureY); // Box 175
		sncb_m6_tailModel[536] = new ModelRendererTurbo(this, 394, 118, textureX, textureY); // Box 176
		sncb_m6_tailModel[537] = new ModelRendererTurbo(this, 25, 153, textureX, textureY); // Box 170
		sncb_m6_tailModel[538] = new ModelRendererTurbo(this, 73, 161, textureX, textureY); // Box 171
		sncb_m6_tailModel[539] = new ModelRendererTurbo(this, 57, 153, textureX, textureY); // Box 172
		sncb_m6_tailModel[540] = new ModelRendererTurbo(this, 73, 153, textureX, textureY); // Box 173
		sncb_m6_tailModel[541] = new ModelRendererTurbo(this, 89, 153, textureX, textureY); // Box 174
		sncb_m6_tailModel[542] = new ModelRendererTurbo(this, 105, 153, textureX, textureY); // Box 175
		sncb_m6_tailModel[543] = new ModelRendererTurbo(this, 394, 118, textureX, textureY); // Box 176
		sncb_m6_tailModel[544] = new ModelRendererTurbo(this, 113, 153, textureX, textureY); // Box 163
		sncb_m6_tailModel[545] = new ModelRendererTurbo(this, 145, 161, textureX, textureY); // Box 164
		sncb_m6_tailModel[546] = new ModelRendererTurbo(this, 145, 153, textureX, textureY); // Box 165
		sncb_m6_tailModel[547] = new ModelRendererTurbo(this, 73, 153, textureX, textureY); // Box 166
		sncb_m6_tailModel[548] = new ModelRendererTurbo(this, 177, 153, textureX, textureY); // Box 167
		sncb_m6_tailModel[549] = new ModelRendererTurbo(this, 193, 153, textureX, textureY); // Box 168
		sncb_m6_tailModel[550] = new ModelRendererTurbo(this, 394, 118, textureX, textureY); // Box 169
		sncb_m6_tailModel[551] = new ModelRendererTurbo(this, 113, 153, textureX, textureY); // Box 163
		sncb_m6_tailModel[552] = new ModelRendererTurbo(this, 145, 161, textureX, textureY); // Box 164
		sncb_m6_tailModel[553] = new ModelRendererTurbo(this, 145, 153, textureX, textureY); // Box 165
		sncb_m6_tailModel[554] = new ModelRendererTurbo(this, 73, 153, textureX, textureY); // Box 166
		sncb_m6_tailModel[555] = new ModelRendererTurbo(this, 177, 153, textureX, textureY); // Box 167
		sncb_m6_tailModel[556] = new ModelRendererTurbo(this, 193, 153, textureX, textureY); // Box 168
		sncb_m6_tailModel[557] = new ModelRendererTurbo(this, 394, 118, textureX, textureY); // Box 169
		sncb_m6_tailModel[558] = new ModelRendererTurbo(this, 113, 153, textureX, textureY); // Box 163
		sncb_m6_tailModel[559] = new ModelRendererTurbo(this, 145, 161, textureX, textureY); // Box 164
		sncb_m6_tailModel[560] = new ModelRendererTurbo(this, 145, 153, textureX, textureY); // Box 165
		sncb_m6_tailModel[561] = new ModelRendererTurbo(this, 73, 153, textureX, textureY); // Box 166
		sncb_m6_tailModel[562] = new ModelRendererTurbo(this, 177, 153, textureX, textureY); // Box 167
		sncb_m6_tailModel[563] = new ModelRendererTurbo(this, 193, 153, textureX, textureY); // Box 168
		sncb_m6_tailModel[564] = new ModelRendererTurbo(this, 394, 118, textureX, textureY); // Box 169
		sncb_m6_tailModel[565] = new ModelRendererTurbo(this, 481, 73, textureX, textureY, "lamp"); // lamp
		sncb_m6_tailModel[566] = new ModelRendererTurbo(this, 497, 73, textureX, textureY, "lamp"); // lamp
		sncb_m6_tailModel[567] = new ModelRendererTurbo(this, 433, 81, textureX, textureY, "lamp"); // lamp
		sncb_m6_tailModel[568] = new ModelRendererTurbo(this, 449, 81, textureX, textureY, "lamp"); // lamp
		sncb_m6_tailModel[569] = new ModelRendererTurbo(this, 465, 81, textureX, textureY, "lamp"); // lamp
		sncb_m6_tailModel[570] = new ModelRendererTurbo(this, 497, 81, textureX, textureY, "lamp"); // lamp
		sncb_m6_tailModel[571] = new ModelRendererTurbo(this, 281, 89, textureX, textureY, "lamp"); // lamp
		sncb_m6_tailModel[572] = new ModelRendererTurbo(this, 497, 73, textureX, textureY, "lamp"); // lamp
		sncb_m6_tailModel[573] = new ModelRendererTurbo(this, 345, 25, textureX, textureY); // Box 9
		sncb_m6_tailModel[574] = new ModelRendererTurbo(this, 65, 233, textureX, textureY); // Box 193
		sncb_m6_tailModel[575] = new ModelRendererTurbo(this, 457, 129, textureX, textureY); // Box 193
		sncb_m6_tailModel[576] = new ModelRendererTurbo(this, 321, 225, textureX, textureY); // Box 193
		sncb_m6_tailModel[577] = new ModelRendererTurbo(this, 337, 225, textureX, textureY); // Box 193
		sncb_m6_tailModel[578] = new ModelRendererTurbo(this, 401, 225, textureX, textureY); // Box 193
		sncb_m6_tailModel[579] = new ModelRendererTurbo(this, 409, 225, textureX, textureY); // Box 193
		sncb_m6_tailModel[580] = new ModelRendererTurbo(this, 473, 137, textureX, textureY); // Box 193
		sncb_m6_tailModel[581] = new ModelRendererTurbo(this, 489, 137, textureX, textureY); // Box 193
		sncb_m6_tailModel[582] = new ModelRendererTurbo(this, 457, 129, textureX, textureY); // Box 193
		sncb_m6_tailModel[583] = new ModelRendererTurbo(this, 103, 302, textureX, textureY); // Box 31
		sncb_m6_tailModel[584] = new ModelRendererTurbo(this, 202, 302, textureX, textureY); // Box 31

		sncb_m6_tailModel[0].addBox(0F, 0F, 0F, 1, 1, 18, 0F); // Box 11
		sncb_m6_tailModel[0].setRotationPoint(40F, 7F, -9F);

		sncb_m6_tailModel[1].addBox(0F, 0F, 0F, 1, 1, 18, 0F); // Box 12
		sncb_m6_tailModel[1].setRotationPoint(-41F, 7F, -9F);

		sncb_m6_tailModel[2].addBox(0F, 0F, 0F, 82, 1, 1, 0F); // Box 13
		sncb_m6_tailModel[2].setRotationPoint(-41F, 6F, 10F);

		sncb_m6_tailModel[3].addBox(0F, 0F, 0F, 82, 1, 1, 0F); // Box 14
		sncb_m6_tailModel[3].setRotationPoint(-41F, 6F, -11F);

		sncb_m6_tailModel[4].addBox(0F, 0F, 0F, 26, 1, 22, 0F); // Box 15
		sncb_m6_tailModel[4].setRotationPoint(-69F, 1F, -11F);

		sncb_m6_tailModel[5].addBox(0F, 0F, 0F, 1, 1, 20, 0F); // Box 19
		sncb_m6_tailModel[5].setRotationPoint(-41F, 6F, -10F);

		sncb_m6_tailModel[6].addShapeBox(0F, 0F, 0F, 3, 4, 20, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 20
		sncb_m6_tailModel[6].setRotationPoint(-43F, 2F, -10F);

		sncb_m6_tailModel[7].addBox(0F, 0F, 0F, 1, 1, 20, 0F); // Box 27
		sncb_m6_tailModel[7].setRotationPoint(40F, 6F, -10F);

		sncb_m6_tailModel[8].addShapeBox(0F, 0F, 0F, 3, 4, 20, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 28
		sncb_m6_tailModel[8].setRotationPoint(40F, 2F, -10F);

		sncb_m6_tailModel[9].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 31
		sncb_m6_tailModel[9].setRotationPoint(40F, 2F, -11F);

		sncb_m6_tailModel[10].addBox(0F, 0F, 0F, 26, 1, 22, 0F); // Box 32
		sncb_m6_tailModel[10].setRotationPoint(43F, 1F, -11F);

		sncb_m6_tailModel[11].addShapeBox(0F, 0F, 0F, 82, 1, 1, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 9
		sncb_m6_tailModel[11].setRotationPoint(-41F, 7F, -10F);

		sncb_m6_tailModel[12].addBox(0F, 0F, 0F, 128, 18, 1, 0F); // Box 33
		sncb_m6_tailModel[12].setRotationPoint(-70F, -17F, -11F);

		sncb_m6_tailModel[13].addBox(0F, 0F, 0F, 86, 1, 1, 0F); // Box 34
		sncb_m6_tailModel[13].setRotationPoint(-43F, 1F, -11F);

		sncb_m6_tailModel[14].addBox(0F, 0F, 0F, 80, 4, 1, 0F); // Box 35
		sncb_m6_tailModel[14].setRotationPoint(-40F, 2F, -11F);

		sncb_m6_tailModel[15].addBox(0F, 0F, 0F, 128, 18, 1, 0F); // Box 36
		sncb_m6_tailModel[15].setRotationPoint(-70F, -17F, 10F);

		sncb_m6_tailModel[16].addBox(0F, 0F, 0F, 80, 4, 1, 0F); // Box 37
		sncb_m6_tailModel[16].setRotationPoint(-40F, 2F, 10F);

		sncb_m6_tailModel[17].addBox(0F, 0F, 0F, 86, 1, 1, 0F); // Box 38
		sncb_m6_tailModel[17].setRotationPoint(-43F, 1F, 10F);

		sncb_m6_tailModel[18].addShapeBox(0F, 0F, 0F, 131, 3, 1, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		sncb_m6_tailModel[18].setRotationPoint(-70F, -20F, 10F);

		sncb_m6_tailModel[19].addShapeBox(0F, 0F, 0F, 131, 3, 1, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		sncb_m6_tailModel[19].setRotationPoint(-70F, -20F, -11F);

		sncb_m6_tailModel[20].addShapeBox(0F, 0F, 0F, 131, 2, 3, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 42
		sncb_m6_tailModel[20].setRotationPoint(-70F, -23F, -8F);

		sncb_m6_tailModel[21].addShapeBox(0F, 0F, 0F, 131, 1, 1, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 44
		sncb_m6_tailModel[21].setRotationPoint(-70F, -21F, -9F);

		sncb_m6_tailModel[22].addShapeBox(0F, 0F, 0F, 131, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 45
		sncb_m6_tailModel[22].setRotationPoint(-70F, -21F, 8F);

		sncb_m6_tailModel[23].addShapeBox(0F, 0F, 0F, 131, 2, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 46
		sncb_m6_tailModel[23].setRotationPoint(-70F, -23F, 5F);

		sncb_m6_tailModel[24].addShapeBox(0F, 0F, 0F, 131, 2, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 47
		sncb_m6_tailModel[24].setRotationPoint(-70F, -23F, -5F);

		sncb_m6_tailModel[25].addShapeBox(0F, 0F, 0F, 131, 2, 5, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 48
		sncb_m6_tailModel[25].setRotationPoint(-70F, -23F, 0F);

		sncb_m6_tailModel[26].addBox(0F, 0F, 0F, 68, 1, 9, 0F); // Box 50
		sncb_m6_tailModel[26].setRotationPoint(-40F, 7F, 0F);

		sncb_m6_tailModel[27].addBox(0F, 0F, 0F, 1, 1, 8, 0F); // Box 51
		sncb_m6_tailModel[27].setRotationPoint(-43F, 1F, -10F);

		sncb_m6_tailModel[28].addShapeBox(0F, 0F, 0F, 7, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F); // Box 59
		sncb_m6_tailModel[28].setRotationPoint(-35F, 7F, -9F);

		sncb_m6_tailModel[29].addShapeBox(0F, 0F, 0F, 6, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 61
		sncb_m6_tailModel[29].setRotationPoint(-35F, 7F, -3F);

		sncb_m6_tailModel[30].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Box 63
		sncb_m6_tailModel[30].setRotationPoint(42F, 1F, 3F);

		sncb_m6_tailModel[31].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Box 64
		sncb_m6_tailModel[31].setRotationPoint(41F, 2F, 3F);

		sncb_m6_tailModel[32].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Box 65
		sncb_m6_tailModel[32].setRotationPoint(40F, 3F, 3F);

		sncb_m6_tailModel[33].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Box 66
		sncb_m6_tailModel[33].setRotationPoint(39F, 4F, 3F);

		sncb_m6_tailModel[34].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Box 67
		sncb_m6_tailModel[34].setRotationPoint(38F, 5F, 3F);

		sncb_m6_tailModel[35].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Box 68
		sncb_m6_tailModel[35].setRotationPoint(37F, 6F, 3F);

		sncb_m6_tailModel[36].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Box 69
		sncb_m6_tailModel[36].setRotationPoint(36F, 7F, 3F);

		sncb_m6_tailModel[37].addShapeBox(0F, 0F, 0F, 8, 1, 9, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 70
		sncb_m6_tailModel[37].setRotationPoint(28F, 7F, 0F);

		sncb_m6_tailModel[38].addBox(0F, 0F, 0F, 64, 1, 5, 0F); // Box 71
		sncb_m6_tailModel[38].setRotationPoint(-28F, 7F, -9F);

		sncb_m6_tailModel[39].addShapeBox(0F, 0F, 0F, 6, 1, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F); // Box 73
		sncb_m6_tailModel[39].setRotationPoint(30F, 7F, -4F);

		sncb_m6_tailModel[40].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 130
		sncb_m6_tailModel[40].setRotationPoint(-25F, 4F, 6F);

		sncb_m6_tailModel[41].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 131
		sncb_m6_tailModel[41].setRotationPoint(-25F, 4F, 1F);

		sncb_m6_tailModel[42].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 132
		sncb_m6_tailModel[42].setRotationPoint(-25F, 2F, 5F);

		sncb_m6_tailModel[43].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 133
		sncb_m6_tailModel[43].setRotationPoint(-25F, 2F, 0F);

		sncb_m6_tailModel[44].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 134
		sncb_m6_tailModel[44].setRotationPoint(-20F, -2F, 1F);

		sncb_m6_tailModel[45].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 135
		sncb_m6_tailModel[45].setRotationPoint(-21F, 0F, 1F);

		sncb_m6_tailModel[46].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 136
		sncb_m6_tailModel[46].setRotationPoint(-21F, 0F, 6F);

		sncb_m6_tailModel[47].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 137
		sncb_m6_tailModel[47].setRotationPoint(-20F, -2F, 6F);

		sncb_m6_tailModel[48].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 138
		sncb_m6_tailModel[48].setRotationPoint(-21F, 4F, 7F);

		sncb_m6_tailModel[49].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 139
		sncb_m6_tailModel[49].setRotationPoint(-21F, 4F, 2F);

		sncb_m6_tailModel[50].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 140
		sncb_m6_tailModel[50].setRotationPoint(-24F, 5F, 2F);

		sncb_m6_tailModel[51].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 141
		sncb_m6_tailModel[51].setRotationPoint(-24F, 5F, 3F);

		sncb_m6_tailModel[52].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Box 177
		sncb_m6_tailModel[52].setRotationPoint(-43F, 0F, 3F);

		sncb_m6_tailModel[53].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Box 178
		sncb_m6_tailModel[53].setRotationPoint(-42F, -1F, 3F);

		sncb_m6_tailModel[54].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Box 179
		sncb_m6_tailModel[54].setRotationPoint(-41F, -2F, 3F);

		sncb_m6_tailModel[55].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Box 180
		sncb_m6_tailModel[55].setRotationPoint(-40F, -3F, 3F);

		sncb_m6_tailModel[56].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Box 181
		sncb_m6_tailModel[56].setRotationPoint(-38F, -5F, 3F);

		sncb_m6_tailModel[57].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Box 182
		sncb_m6_tailModel[57].setRotationPoint(-39F, -4F, 3F);

		sncb_m6_tailModel[58].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Box 183
		sncb_m6_tailModel[58].setRotationPoint(-37F, -6F, 3F);

		sncb_m6_tailModel[59].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Box 184
		sncb_m6_tailModel[59].setRotationPoint(-36F, 7F, -9F);

		sncb_m6_tailModel[60].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Box 185
		sncb_m6_tailModel[60].setRotationPoint(-37F, 6F, -9F);

		sncb_m6_tailModel[61].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Box 186
		sncb_m6_tailModel[61].setRotationPoint(-38F, 5F, -9F);

		sncb_m6_tailModel[62].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Box 187
		sncb_m6_tailModel[62].setRotationPoint(-39F, 4F, -9F);

		sncb_m6_tailModel[63].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Box 188
		sncb_m6_tailModel[63].setRotationPoint(-40F, 3F, -9F);

		sncb_m6_tailModel[64].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Box 189
		sncb_m6_tailModel[64].setRotationPoint(-41F, 2F, -9F);

		sncb_m6_tailModel[65].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Box 190
		sncb_m6_tailModel[65].setRotationPoint(-42F, 1F, -9F);

		sncb_m6_tailModel[66].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Box 191
		sncb_m6_tailModel[66].setRotationPoint(42F, 0F, -9F);

		sncb_m6_tailModel[67].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Box 192
		sncb_m6_tailModel[67].setRotationPoint(41F, -1F, -9F);

		sncb_m6_tailModel[68].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Box 193
		sncb_m6_tailModel[68].setRotationPoint(40F, -2F, -9F);

		sncb_m6_tailModel[69].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Box 194
		sncb_m6_tailModel[69].setRotationPoint(39F, -3F, -9F);

		sncb_m6_tailModel[70].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Box 195
		sncb_m6_tailModel[70].setRotationPoint(38F, -4F, -9F);

		sncb_m6_tailModel[71].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Box 196
		sncb_m6_tailModel[71].setRotationPoint(37F, -5F, -9F);

		sncb_m6_tailModel[72].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Box 197
		sncb_m6_tailModel[72].setRotationPoint(36F, -6F, -9F);

		sncb_m6_tailModel[73].addBox(0F, 0F, 0F, 70, 1, 20, 0F); // Box 202
		sncb_m6_tailModel[73].setRotationPoint(-35F, -6F, -10F);

		sncb_m6_tailModel[74].addBox(0F, 0F, 0F, 1, 13, 13, 0F); // Box 212
		sncb_m6_tailModel[74].setRotationPoint(-36F, -6F, -3F);

		sncb_m6_tailModel[75].addShapeBox(0F, 0F, 0F, 3, 14, 2, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 215
		sncb_m6_tailModel[75].setRotationPoint(-46F, -13F, -3F);

		sncb_m6_tailModel[76].addBox(0F, 0F, 0F, 1, 13, 7, 0F); // Box 217
		sncb_m6_tailModel[76].setRotationPoint(35F, -6F, -10F);

		sncb_m6_tailModel[77].addShapeBox(0F, 0F, 0F, 7, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F); // Box 221
		sncb_m6_tailModel[77].setRotationPoint(36F, -4F, -3F);

		sncb_m6_tailModel[78].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 183
		sncb_m6_tailModel[78].setRotationPoint(16F, 4F, 1F);

		sncb_m6_tailModel[79].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 184
		sncb_m6_tailModel[79].setRotationPoint(16F, 4F, 6F);

		sncb_m6_tailModel[80].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 185
		sncb_m6_tailModel[80].setRotationPoint(15F, 2F, 0F);

		sncb_m6_tailModel[81].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 186
		sncb_m6_tailModel[81].setRotationPoint(15F, 2F, 5F);

		sncb_m6_tailModel[82].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 187
		sncb_m6_tailModel[82].setRotationPoint(14F, -2F, 6F);

		sncb_m6_tailModel[83].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 188
		sncb_m6_tailModel[83].setRotationPoint(15F, 0F, 6F);

		sncb_m6_tailModel[84].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 189
		sncb_m6_tailModel[84].setRotationPoint(15F, 0F, 1F);

		sncb_m6_tailModel[85].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 190
		sncb_m6_tailModel[85].setRotationPoint(14F, -2F, 1F);

		sncb_m6_tailModel[86].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 191
		sncb_m6_tailModel[86].setRotationPoint(15F, 4F, 7F);

		sncb_m6_tailModel[87].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 192
		sncb_m6_tailModel[87].setRotationPoint(15F, 4F, 2F);

		sncb_m6_tailModel[88].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 193
		sncb_m6_tailModel[88].setRotationPoint(17F, 5F, 3F);

		sncb_m6_tailModel[89].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 194
		sncb_m6_tailModel[89].setRotationPoint(17F, 5F, 2F);

		sncb_m6_tailModel[90].addBox(0F, 0F, 0F, 80, 1, 18, 0F); // Box 8
		sncb_m6_tailModel[90].setRotationPoint(-40F, 8F, -9F);

		sncb_m6_tailModel[91].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 176
		sncb_m6_tailModel[91].setRotationPoint(27F, 4F, -8F);

		sncb_m6_tailModel[92].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 170
		sncb_m6_tailModel[92].setRotationPoint(-9F, 2F, -10F);

		sncb_m6_tailModel[93].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 171
		sncb_m6_tailModel[93].setRotationPoint(-9F, 4F, -9F);

		sncb_m6_tailModel[94].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 172
		sncb_m6_tailModel[94].setRotationPoint(-9F, 2F, -5F);

		sncb_m6_tailModel[95].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 173
		sncb_m6_tailModel[95].setRotationPoint(-8F, 5F, -8F);

		sncb_m6_tailModel[96].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 174
		sncb_m6_tailModel[96].setRotationPoint(-5F, 0F, -9F);

		sncb_m6_tailModel[97].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 175
		sncb_m6_tailModel[97].setRotationPoint(-4F, -2F, -9F);

		sncb_m6_tailModel[98].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 176
		sncb_m6_tailModel[98].setRotationPoint(-5F, 4F, -8F);

		sncb_m6_tailModel[99].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 163
		sncb_m6_tailModel[99].setRotationPoint(-24F, 2F, -10F);

		sncb_m6_tailModel[100].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 164
		sncb_m6_tailModel[100].setRotationPoint(-23F, 4F, -9F);

		sncb_m6_tailModel[101].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 165
		sncb_m6_tailModel[101].setRotationPoint(-24F, 2F, -5F);

		sncb_m6_tailModel[102].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 166
		sncb_m6_tailModel[102].setRotationPoint(-22F, 5F, -8F);

		sncb_m6_tailModel[103].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 167
		sncb_m6_tailModel[103].setRotationPoint(-24F, 0F, -9F);

		sncb_m6_tailModel[104].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 168
		sncb_m6_tailModel[104].setRotationPoint(-25F, -2F, -9F);

		sncb_m6_tailModel[105].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 169
		sncb_m6_tailModel[105].setRotationPoint(-24F, 4F, -8F);

		sncb_m6_tailModel[106].addShapeBox(0F, 0F, 0F, 71, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 168
		sncb_m6_tailModel[106].setRotationPoint(-35F, 5F, -10F);

		sncb_m6_tailModel[107].addShapeBox(0F, 0F, 0F, 70, 2, 1, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 168
		sncb_m6_tailModel[107].setRotationPoint(-35F, 5F, 9F);

		sncb_m6_tailModel[108].addBox(0F, 0F, 0F, 64, 1, 5, 0F); // Box 71
		sncb_m6_tailModel[108].setRotationPoint(-29F, -7F, 4F);

		sncb_m6_tailModel[109].addShapeBox(0F, 0F, 0F, 70, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 168
		sncb_m6_tailModel[109].setRotationPoint(-35F, -9F, -10F);

		sncb_m6_tailModel[110].addShapeBox(0F, 0F, 0F, 70, 2, 1, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 168
		sncb_m6_tailModel[110].setRotationPoint(-35F, -9F, 9F);

		sncb_m6_tailModel[111].addBox(0F, 0F, 0F, 7, 19, 1, 0F); // Box 221
		sncb_m6_tailModel[111].setRotationPoint(36F, -17F, -10F);

		sncb_m6_tailModel[112].addBox(0F, 0F, 0F, 7, 18, 1, 0F); // Box 216
		sncb_m6_tailModel[112].setRotationPoint(-43F, -17F, 9F);

		sncb_m6_tailModel[113].addBox(0F, 0F, 0F, 63, 1, 9, 0F); // Box 197
		sncb_m6_tailModel[113].setRotationPoint(-35F, -7F, -9F);

		sncb_m6_tailModel[114].addShapeBox(0F, 0F, 0F, 1, 13, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 217
		sncb_m6_tailModel[114].setRotationPoint(35F, -6F, -3F);

		sncb_m6_tailModel[115].addShapeBox(0F, 0F, 0F, 6, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 61
		sncb_m6_tailModel[115].setRotationPoint(-35F, -7F, 0F);

		sncb_m6_tailModel[116].addShapeBox(0F, 0F, 0F, 6, 1, 7, 0F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		sncb_m6_tailModel[116].setRotationPoint(29F, -7F, -3F);

		sncb_m6_tailModel[117].addBox(0F, 0F, 0F, 1, 1, 12, 0F); // Box 196
		sncb_m6_tailModel[117].setRotationPoint(35F, -7F, -3F);

		sncb_m6_tailModel[118].addBox(0F, 0F, 0F, 1, 10, 6, 0F); // Box 217
		sncb_m6_tailModel[118].setRotationPoint(35F, -17F, -3F);

		sncb_m6_tailModel[119].addBox(0F, 0F, 0F, 1, 18, 20, 0F); // Box 194
		sncb_m6_tailModel[119].setRotationPoint(-69F, -17F, -10F);

		sncb_m6_tailModel[120].addBox(0F, 0F, 0F, 1, 3, 16, 0F); // Box 193
		sncb_m6_tailModel[120].setRotationPoint(-69F, -20F, -8F);

		sncb_m6_tailModel[121].addBox(0F, 0F, 0F, 1, 2, 5, 0F); // Box 193
		sncb_m6_tailModel[121].setRotationPoint(-69F, -22F, -5F);

		sncb_m6_tailModel[122].addShapeBox(0F, 0F, 0F, 5, 17, 16, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 215
		sncb_m6_tailModel[122].setRotationPoint(55F, -16F, -8F);

		sncb_m6_tailModel[123].addBox(0F, 0F, 0F, 1, 14, 1, 0F); // Box 215
		sncb_m6_tailModel[123].setRotationPoint(-70F, -13F, 4F);

		sncb_m6_tailModel[124].addBox(0F, 0F, 0F, 1, 14, 1, 0F); // Box 215
		sncb_m6_tailModel[124].setRotationPoint(-70F, -13F, -5F);

		sncb_m6_tailModel[125].addBox(0F, 0F, 0F, 1, 1, 8, 0F); // Box 215
		sncb_m6_tailModel[125].setRotationPoint(-70F, -13F, -4F);

		sncb_m6_tailModel[126].addBox(0F, 0F, 0F, 8, 4, 20, 0F); // Box 215
		sncb_m6_tailModel[126].setRotationPoint(-68F, -17F, -10F);

		sncb_m6_tailModel[127].addBox(0F, 0F, 0F, 4, 14, 1, 0F); // Box 215
		sncb_m6_tailModel[127].setRotationPoint(-47F, -13F, -10F);

		sncb_m6_tailModel[128].addBox(0F, 0F, 0F, 4, 14, 1, 0F); // Box 215
		sncb_m6_tailModel[128].setRotationPoint(-47F, -13F, 9F);

		sncb_m6_tailModel[129].addBox(0F, 0F, 0F, 14, 1, 16, 0F); // Box 215
		sncb_m6_tailModel[129].setRotationPoint(-60F, -17F, -8F);

		sncb_m6_tailModel[130].addShapeBox(0F, 0F, 0F, 8, 12, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F); // Box 215
		sncb_m6_tailModel[130].setRotationPoint(-43F, -17F, -9F);

		sncb_m6_tailModel[131].addBox(0F, 0F, 0F, 15, 4, 2, 0F); // Box 215
		sncb_m6_tailModel[131].setRotationPoint(43F, -17F, -10F);

		sncb_m6_tailModel[132].addBox(0F, 0F, 0F, 15, 4, 2, 0F); // Box 215
		sncb_m6_tailModel[132].setRotationPoint(43F, -17F, 8F);

		sncb_m6_tailModel[133].addBox(0F, 0F, 0F, 4, 14, 1, 0F); // Box 215
		sncb_m6_tailModel[133].setRotationPoint(43F, -13F, -10F);

		sncb_m6_tailModel[134].addBox(0F, 0F, 0F, 4, 14, 1, 0F); // Box 215
		sncb_m6_tailModel[134].setRotationPoint(43F, -13F, 9F);

		sncb_m6_tailModel[135].addShapeBox(0F, 0F, 0F, 6, 1, 5, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 61
		sncb_m6_tailModel[135].setRotationPoint(-35F, -7F, 4F);

		sncb_m6_tailModel[136].addBox(0F, 0F, 0F, 3, 4, 16, 0F); // Box 215
		sncb_m6_tailModel[136].setRotationPoint(43F, -17F, -8F);

		sncb_m6_tailModel[137].addBox(0F, 0F, 0F, 3, 4, 16, 0F); // Box 215
		sncb_m6_tailModel[137].setRotationPoint(-46F, -17F, -8F);

		sncb_m6_tailModel[138].addBox(0F, 0F, 0F, 1, 11, 6, 0F); // Box 213
		sncb_m6_tailModel[138].setRotationPoint(-36F, -17F, -3F);

		sncb_m6_tailModel[139].addBox(0F, 0F, 0F, 1, 11, 1, 0F); // Box 216
		sncb_m6_tailModel[139].setRotationPoint(-36F, -17F, 9F);

		sncb_m6_tailModel[140].addShapeBox(0F, 0F, 0F, 8, 12, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F); // Box 215
		sncb_m6_tailModel[140].setRotationPoint(35F, -17F, 3F);

		sncb_m6_tailModel[141].addBox(0F, 0F, 0F, 1, 11, 1, 0F); // Box 216
		sncb_m6_tailModel[141].setRotationPoint(35F, -17F, -10F);

		sncb_m6_tailModel[142].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 170
		sncb_m6_tailModel[142].setRotationPoint(-25F, -12F, -1F);

		sncb_m6_tailModel[143].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 171
		sncb_m6_tailModel[143].setRotationPoint(-25F, -10F, -5F);

		sncb_m6_tailModel[144].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 174
		sncb_m6_tailModel[144].setRotationPoint(-21F, -14F, -5F);

		sncb_m6_tailModel[145].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 175
		sncb_m6_tailModel[145].setRotationPoint(-20F, -16F, -5F);

		sncb_m6_tailModel[146].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 176
		sncb_m6_tailModel[146].setRotationPoint(-21F, -10F, -4F);

		sncb_m6_tailModel[147].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 163
		sncb_m6_tailModel[147].setRotationPoint(-34F, -12F, -1F);

		sncb_m6_tailModel[148].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 164
		sncb_m6_tailModel[148].setRotationPoint(-33F, -10F, -5F);

		sncb_m6_tailModel[149].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 167
		sncb_m6_tailModel[149].setRotationPoint(-34F, -14F, -5F);

		sncb_m6_tailModel[150].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 168
		sncb_m6_tailModel[150].setRotationPoint(-35F, -16F, -5F);

		sncb_m6_tailModel[151].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 169
		sncb_m6_tailModel[151].setRotationPoint(-34F, -10F, -4F);

		sncb_m6_tailModel[152].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 170
		sncb_m6_tailModel[152].setRotationPoint(-25F, -12F, -6F);

		sncb_m6_tailModel[153].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 171
		sncb_m6_tailModel[153].setRotationPoint(-25F, -10F, -10F);

		sncb_m6_tailModel[154].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 174
		sncb_m6_tailModel[154].setRotationPoint(-21F, -14F, -10F);

		sncb_m6_tailModel[155].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 175
		sncb_m6_tailModel[155].setRotationPoint(-20F, -16F, -10F);

		sncb_m6_tailModel[156].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 176
		sncb_m6_tailModel[156].setRotationPoint(-21F, -10F, -9F);

		sncb_m6_tailModel[157].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 163
		sncb_m6_tailModel[157].setRotationPoint(-34F, -12F, -6F);

		sncb_m6_tailModel[158].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 164
		sncb_m6_tailModel[158].setRotationPoint(-33F, -10F, -10F);

		sncb_m6_tailModel[159].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 167
		sncb_m6_tailModel[159].setRotationPoint(-34F, -14F, -10F);

		sncb_m6_tailModel[160].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 168
		sncb_m6_tailModel[160].setRotationPoint(-35F, -16F, -10F);

		sncb_m6_tailModel[161].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 169
		sncb_m6_tailModel[161].setRotationPoint(-34F, -10F, -9F);

		sncb_m6_tailModel[162].addBox(0F, 0F, 0F, 12, 1, 16, 0F); // Box 175
		sncb_m6_tailModel[162].setRotationPoint(46F, -17F, -8F);

		sncb_m6_tailModel[163].addShapeBox(0F, 0F, 0F, 8, 4, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 168
		sncb_m6_tailModel[163].setRotationPoint(-43F, -17F, 3F);

		sncb_m6_tailModel[164].addShapeBox(0F, 0F, 0F, 8, 4, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F); // Box 168
		sncb_m6_tailModel[164].setRotationPoint(35F, -17F, -9F);

		sncb_m6_tailModel[165].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 170
		sncb_m6_tailModel[165].setRotationPoint(-9F, -12F, 9F);

		sncb_m6_tailModel[166].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 171
		sncb_m6_tailModel[166].setRotationPoint(-9F, -10F, 5F);

		sncb_m6_tailModel[167].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 174
		sncb_m6_tailModel[167].setRotationPoint(-5F, -14F, 5F);

		sncb_m6_tailModel[168].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 175
		sncb_m6_tailModel[168].setRotationPoint(-4F, -16F, 5F);

		sncb_m6_tailModel[169].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 176
		sncb_m6_tailModel[169].setRotationPoint(-5F, -10F, 6F);

		sncb_m6_tailModel[170].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 166
		sncb_m6_tailModel[170].setRotationPoint(-8F, -9F, 6F);

		sncb_m6_tailModel[171].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 170
		sncb_m6_tailModel[171].setRotationPoint(-9F, -12F, 4F);

		sncb_m6_tailModel[172].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 163
		sncb_m6_tailModel[172].setRotationPoint(-24F, -12F, 9F);

		sncb_m6_tailModel[173].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 164
		sncb_m6_tailModel[173].setRotationPoint(-23F, -10F, 5F);

		sncb_m6_tailModel[174].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 167
		sncb_m6_tailModel[174].setRotationPoint(-24F, -14F, 5F);

		sncb_m6_tailModel[175].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 168
		sncb_m6_tailModel[175].setRotationPoint(-25F, -16F, 5F);

		sncb_m6_tailModel[176].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 169
		sncb_m6_tailModel[176].setRotationPoint(-24F, -10F, 6F);

		sncb_m6_tailModel[177].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 163
		sncb_m6_tailModel[177].setRotationPoint(-24F, -12F, 4F);

		sncb_m6_tailModel[178].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 166
		sncb_m6_tailModel[178].setRotationPoint(-22F, -9F, 6F);

		sncb_m6_tailModel[179].addBox(0F, 0F, 0F, 1, 2, 5, 0F); // Box 193
		sncb_m6_tailModel[179].setRotationPoint(-69F, -22F, 0F);

		sncb_m6_tailModel[180].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 193
		sncb_m6_tailModel[180].setRotationPoint(-69F, -22F, -8F);

		sncb_m6_tailModel[181].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 193
		sncb_m6_tailModel[181].setRotationPoint(-69F, -22F, 5F);

		sncb_m6_tailModel[182].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 193
		sncb_m6_tailModel[182].setRotationPoint(-69F, -20F, 8F);

		sncb_m6_tailModel[183].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 193
		sncb_m6_tailModel[183].setRotationPoint(-69F, -20F, -10F);

		sncb_m6_tailModel[184].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 193
		sncb_m6_tailModel[184].setRotationPoint(-69F, -23F, -5F);

		sncb_m6_tailModel[185].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 193
		sncb_m6_tailModel[185].setRotationPoint(-69F, -23F, 0F);

		sncb_m6_tailModel[186].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 31
		sncb_m6_tailModel[186].setRotationPoint(41F, 2F, -11F);

		sncb_m6_tailModel[187].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 31
		sncb_m6_tailModel[187].setRotationPoint(40F, 2F, 10F);

		sncb_m6_tailModel[188].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 31
		sncb_m6_tailModel[188].setRotationPoint(41F, 2F, 10F);

		sncb_m6_tailModel[189].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 31
		sncb_m6_tailModel[189].setRotationPoint(-41F, 2F, -11F);

		sncb_m6_tailModel[190].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 31
		sncb_m6_tailModel[190].setRotationPoint(-43F, 2F, -11F);

		sncb_m6_tailModel[191].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 31
		sncb_m6_tailModel[191].setRotationPoint(-41F, 2F, 10F);

		sncb_m6_tailModel[192].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 31
		sncb_m6_tailModel[192].setRotationPoint(-43F, 2F, 10F);

		sncb_m6_tailModel[193].addShapeBox(0F, 0F, 0F, 80, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 10
		sncb_m6_tailModel[193].setRotationPoint(-40F, 8F, 9F);

		sncb_m6_tailModel[194].addShapeBox(0F, 0F, 0F, 80, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 10
		sncb_m6_tailModel[194].setRotationPoint(-40F, 8F, -10F);

		sncb_m6_tailModel[195].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 10
		sncb_m6_tailModel[195].setRotationPoint(40F, 8F, -9F);

		sncb_m6_tailModel[196].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 10
		sncb_m6_tailModel[196].setRotationPoint(-41F, 8F, -9F);

		sncb_m6_tailModel[197].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 10
		sncb_m6_tailModel[197].setRotationPoint(-41F, 8F, -10F);

		sncb_m6_tailModel[198].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F); // Box 10
		sncb_m6_tailModel[198].setRotationPoint(-41F, 8F, 9F);

		sncb_m6_tailModel[199].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F); // Box 10
		sncb_m6_tailModel[199].setRotationPoint(40F, 8F, 9F);

		sncb_m6_tailModel[200].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 10
		sncb_m6_tailModel[200].setRotationPoint(40F, 8F, -10F);

		sncb_m6_tailModel[201].addBox(0F, 0F, 0F, 3, 14, 2, 0F); // Box 215
		sncb_m6_tailModel[201].setRotationPoint(-46F, -13F, -1F);

		sncb_m6_tailModel[202].addShapeBox(0F, 0F, 0F, 3, 14, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 215
		sncb_m6_tailModel[202].setRotationPoint(-46F, -13F, 1F);

		sncb_m6_tailModel[203].addBox(0F, 0F, 0F, 1, 3, 16, 0F); // Box 193
		sncb_m6_tailModel[203].setRotationPoint(-36F, -20F, -8F);

		sncb_m6_tailModel[204].addBox(0F, 0F, 0F, 1, 2, 5, 0F); // Box 193
		sncb_m6_tailModel[204].setRotationPoint(-36F, -22F, -5F);

		sncb_m6_tailModel[205].addBox(0F, 0F, 0F, 1, 2, 5, 0F); // Box 193
		sncb_m6_tailModel[205].setRotationPoint(-36F, -22F, 0F);

		sncb_m6_tailModel[206].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 193
		sncb_m6_tailModel[206].setRotationPoint(-36F, -22F, -8F);

		sncb_m6_tailModel[207].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 193
		sncb_m6_tailModel[207].setRotationPoint(-36F, -22F, 5F);

		sncb_m6_tailModel[208].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 193
		sncb_m6_tailModel[208].setRotationPoint(-36F, -20F, 8F);

		sncb_m6_tailModel[209].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 193
		sncb_m6_tailModel[209].setRotationPoint(-36F, -20F, -10F);

		sncb_m6_tailModel[210].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 193
		sncb_m6_tailModel[210].setRotationPoint(-36F, -23F, -5F);

		sncb_m6_tailModel[211].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 193
		sncb_m6_tailModel[211].setRotationPoint(-36F, -23F, 0F);

		sncb_m6_tailModel[212].addBox(0F, 0F, 0F, 1, 3, 16, 0F); // Box 193
		sncb_m6_tailModel[212].setRotationPoint(35F, -20F, -8F);

		sncb_m6_tailModel[213].addBox(0F, 0F, 0F, 1, 2, 5, 0F); // Box 193
		sncb_m6_tailModel[213].setRotationPoint(35F, -22F, -5F);

		sncb_m6_tailModel[214].addBox(0F, 0F, 0F, 1, 2, 5, 0F); // Box 193
		sncb_m6_tailModel[214].setRotationPoint(35F, -22F, 0F);

		sncb_m6_tailModel[215].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 193
		sncb_m6_tailModel[215].setRotationPoint(35F, -22F, -8F);

		sncb_m6_tailModel[216].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 193
		sncb_m6_tailModel[216].setRotationPoint(35F, -22F, 5F);

		sncb_m6_tailModel[217].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 193
		sncb_m6_tailModel[217].setRotationPoint(35F, -20F, 8F);

		sncb_m6_tailModel[218].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 193
		sncb_m6_tailModel[218].setRotationPoint(35F, -20F, -10F);

		sncb_m6_tailModel[219].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 193
		sncb_m6_tailModel[219].setRotationPoint(35F, -23F, -5F);

		sncb_m6_tailModel[220].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 193
		sncb_m6_tailModel[220].setRotationPoint(35F, -23F, 0F);

		sncb_m6_tailModel[221].addBox(0F, 0F, 0F, 1, 24, 1, 0F); // Box 216
		sncb_m6_tailModel[221].setRotationPoint(35F, -17F, 9F);

		sncb_m6_tailModel[222].addShapeBox(0F, 0F, 0F, 7, 1, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, 0F); // Box 73
		sncb_m6_tailModel[222].setRotationPoint(28F, -7F, -9F);

		sncb_m6_tailModel[223].addBox(0F, 0F, 0F, 17, 4, 2, 0F); // Box 215
		sncb_m6_tailModel[223].setRotationPoint(-60F, -17F, -10F);

		sncb_m6_tailModel[224].addBox(0F, 0F, 0F, 17, 4, 2, 0F); // Box 215
		sncb_m6_tailModel[224].setRotationPoint(-60F, -17F, 8F);

		sncb_m6_tailModel[225].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 163
		sncb_m6_tailModel[225].setRotationPoint(-67F, -4F, 5F);

		sncb_m6_tailModel[226].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 164
		sncb_m6_tailModel[226].setRotationPoint(-66F, -2F, 6F);

		sncb_m6_tailModel[227].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 166
		sncb_m6_tailModel[227].setRotationPoint(-65F, -1F, 7F);

		sncb_m6_tailModel[228].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 167
		sncb_m6_tailModel[228].setRotationPoint(-67F, -6F, 6F);

		sncb_m6_tailModel[229].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 168
		sncb_m6_tailModel[229].setRotationPoint(-68F, -8F, 6F);

		sncb_m6_tailModel[230].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 169
		sncb_m6_tailModel[230].setRotationPoint(-67F, -2F, 7F);

		sncb_m6_tailModel[231].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 163
		sncb_m6_tailModel[231].setRotationPoint(-67F, -4F, -6F);

		sncb_m6_tailModel[232].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 164
		sncb_m6_tailModel[232].setRotationPoint(-66F, -2F, -10F);

		sncb_m6_tailModel[233].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 166
		sncb_m6_tailModel[233].setRotationPoint(-65F, -1F, -9F);

		sncb_m6_tailModel[234].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 167
		sncb_m6_tailModel[234].setRotationPoint(-67F, -6F, -10F);

		sncb_m6_tailModel[235].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 168
		sncb_m6_tailModel[235].setRotationPoint(-68F, -8F, -10F);

		sncb_m6_tailModel[236].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 169
		sncb_m6_tailModel[236].setRotationPoint(-67F, -2F, -9F);

		sncb_m6_tailModel[237].addBox(0F, 0F, 0F, 1, 14, 7, 0F); // Box 215
		sncb_m6_tailModel[237].setRotationPoint(-60F, -13F, -10F);

		sncb_m6_tailModel[238].addBox(0F, 0F, 0F, 1, 14, 7, 0F); // Box 215
		sncb_m6_tailModel[238].setRotationPoint(-60F, -13F, 3F);

		sncb_m6_tailModel[239].addBox(0F, 0F, 0F, 1, 3, 16, 0F); // Box 215
		sncb_m6_tailModel[239].setRotationPoint(-60F, -16F, -8F);

		sncb_m6_tailModel[240].addShapeBox(0F, 0F, 0F, 8, 6, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F); // Box 213
		sncb_m6_tailModel[240].setRotationPoint(-43F, 2F, -10F);

		sncb_m6_tailModel[241].addBox(0F, 0F, 0F, 7, 18, 1, 0F); // Box 213
		sncb_m6_tailModel[241].setRotationPoint(36F, -17F, 9F);

		sncb_m6_tailModel[242].addShapeBox(0F, 0F, 0F, 8, 7, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F); // Box 213
		sncb_m6_tailModel[242].setRotationPoint(36F, 1F, 9F);

		sncb_m6_tailModel[243].addBox(0F, 0F, 0F, 8, 19, 1, 0F); // Box 213
		sncb_m6_tailModel[243].setRotationPoint(-43F, -17F, -10F);

		sncb_m6_tailModel[244].addBox(0F, 0F, 0F, 5, 14, 2, 0F); // Box 215
		sncb_m6_tailModel[244].setRotationPoint(53F, -13F, 8F);

		sncb_m6_tailModel[245].addShapeBox(0F, 0F, 0F, 3, 14, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 215
		sncb_m6_tailModel[245].setRotationPoint(43F, -13F, 1F);

		sncb_m6_tailModel[246].addBox(0F, 0F, 0F, 3, 14, 2, 0F); // Box 215
		sncb_m6_tailModel[246].setRotationPoint(43F, -13F, -1F);

		sncb_m6_tailModel[247].addShapeBox(0F, 0F, 0F, 3, 14, 2, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 215
		sncb_m6_tailModel[247].setRotationPoint(43F, -13F, -3F);

		sncb_m6_tailModel[248].addBox(0F, 0F, 0F, 7, 18, 1, 0F); // Box 213
		sncb_m6_tailModel[248].setRotationPoint(36F, -16F, 2F);

		sncb_m6_tailModel[249].addShapeBox(0F, 0F, 0F, 7, 6, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F); // Box 213
		sncb_m6_tailModel[249].setRotationPoint(36F, 2F, 2F);

		sncb_m6_tailModel[250].addBox(0F, 0F, 0F, 7, 13, 1, 0F); // Box 221
		sncb_m6_tailModel[250].setRotationPoint(36F, -17F, -3F);

		sncb_m6_tailModel[251].addShapeBox(0F, 0F, 0F, 8, 6, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F); // Box 213
		sncb_m6_tailModel[251].setRotationPoint(-43F, 2F, -3F);

		sncb_m6_tailModel[252].addBox(0F, 0F, 0F, 8, 19, 1, 0F); // Box 213
		sncb_m6_tailModel[252].setRotationPoint(-43F, -17F, -3F);

		sncb_m6_tailModel[253].addShapeBox(0F, 0F, 0F, 7, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F); // Box 221
		sncb_m6_tailModel[253].setRotationPoint(-43F, -4F, 2F);

		sncb_m6_tailModel[254].addBox(0F, 0F, 0F, 7, 13, 1, 0F); // Box 221
		sncb_m6_tailModel[254].setRotationPoint(-43F, -17F, 2F);

		sncb_m6_tailModel[255].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 215
		sncb_m6_tailModel[255].setRotationPoint(-70F, 1F, -8F);

		sncb_m6_tailModel[256].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 215
		sncb_m6_tailModel[256].setRotationPoint(-70F, 1F, 7F);

		sncb_m6_tailModel[257].addBox(0F, 0F, 0F, 1, 3, 3, 0F); // Box 215
		sncb_m6_tailModel[257].setRotationPoint(-71F, 0F, 6F);

		sncb_m6_tailModel[258].addBox(0F, 0F, 0F, 1, 3, 3, 0F); // Box 215
		sncb_m6_tailModel[258].setRotationPoint(-71F, 0F, -9F);

		sncb_m6_tailModel[259].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 215
		sncb_m6_tailModel[259].setRotationPoint(69F, 1F, -8F);

		sncb_m6_tailModel[260].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 215
		sncb_m6_tailModel[260].setRotationPoint(69F, 1F, 7F);

		sncb_m6_tailModel[261].addBox(0F, 0F, 0F, 1, 3, 3, 0F); // Box 215
		sncb_m6_tailModel[261].setRotationPoint(70F, 0F, 6F);

		sncb_m6_tailModel[262].addBox(0F, 0F, 0F, 1, 3, 3, 0F); // Box 215
		sncb_m6_tailModel[262].setRotationPoint(70F, 0F, -9F);

		sncb_m6_tailModel[263].addBox(0F, 0F, 0F, 4, 2, 2, 0F); // Box 215
		sncb_m6_tailModel[263].setRotationPoint(-73F, 1F, -1F);

		sncb_m6_tailModel[264].addBox(0F, 0F, 0F, 4, 2, 2, 0F); // Box 215
		sncb_m6_tailModel[264].setRotationPoint(69F, 1F, -1F);

		sncb_m6_tailModel[265].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 215
		sncb_m6_tailModel[265].setRotationPoint(68F, 2F, -1F);

		sncb_m6_tailModel[266].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 215
		sncb_m6_tailModel[266].setRotationPoint(-69F, 2F, -1F);

		sncb_m6_tailModel[267].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 84
		sncb_m6_tailModel[267].setRotationPoint(-24F, -9F, -10F);

		sncb_m6_tailModel[268].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 81
		sncb_m6_tailModel[268].setRotationPoint(-24F, -9F, -3F);

		sncb_m6_tailModel[269].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 84
		sncb_m6_tailModel[269].setRotationPoint(-32F, -9F, -10F);

		sncb_m6_tailModel[270].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 81
		sncb_m6_tailModel[270].setRotationPoint(-32F, -9F, -3F);

		sncb_m6_tailModel[271].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 215
		sncb_m6_tailModel[271].setRotationPoint(-70F, 1F, -11F);

		sncb_m6_tailModel[272].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 215
		sncb_m6_tailModel[272].setRotationPoint(-70F, 1F, 10F);

		sncb_m6_tailModel[273].addBox(0F, 0F, 0F, 6, 15, 1, 0F); // doorFrontLeft1
		sncb_m6_tailModel[273].setRotationPoint(-59F, -14F, 10F);

		sncb_m6_tailModel[274].addBox(0F, 0F, 0F, 6, 15, 1, 0F); // doorFrontLeft2
		sncb_m6_tailModel[274].setRotationPoint(-53F, -14F, 10F);

		sncb_m6_tailModel[275].addBox(0F, 0F, 0F, 6, 15, 1, 0F); // doorBackLeft1
		sncb_m6_tailModel[275].setRotationPoint(47F, -14F, 10F);

		sncb_m6_tailModel[276].addBox(0F, 0F, 0F, 6, 15, 1, 0F); // doorBackRight1
		sncb_m6_tailModel[276].setRotationPoint(47F, -14F, -11F);

		sncb_m6_tailModel[277].addBox(0F, 0F, 0F, 6, 15, 1, 0F); // doorFrontRight1
		sncb_m6_tailModel[277].setRotationPoint(-59F, -14F, -11F);

		sncb_m6_tailModel[278].addBox(0F, 0F, 0F, 6, 15, 1, 0F); // doorFrontRight2
		sncb_m6_tailModel[278].setRotationPoint(-53F, -14F, -11F);

		sncb_m6_tailModel[279].addBox(0F, 0F, 0F, 5, 14, 2, 0F); // Box 215
		sncb_m6_tailModel[279].setRotationPoint(53F, -13F, -10F);

		sncb_m6_tailModel[280].addBox(0F, 0F, 0F, 5, 3, 18, 0F); // Box 215
		sncb_m6_tailModel[280].setRotationPoint(63F, -2F, -9F);

		sncb_m6_tailModel[281].addBox(0F, 0F, 0F, 6, 18, 2, 0F); // Box 215
		sncb_m6_tailModel[281].setRotationPoint(58F, -17F, 9F);

		sncb_m6_tailModel[282].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 215
		sncb_m6_tailModel[282].setRotationPoint(69F, -2F, -11F);

		sncb_m6_tailModel[283].addBox(0F, 0F, 0F, 6, 18, 2, 0F); // Box 215
		sncb_m6_tailModel[283].setRotationPoint(58F, -17F, -11F);

		sncb_m6_tailModel[284].addBox(0F, 0F, 0F, 4, 2, 2, 0F); // Box 215
		sncb_m6_tailModel[284].setRotationPoint(64F, -1F, 9F);

		sncb_m6_tailModel[285].addBox(0F, 0F, 0F, 4, 3, 2, 0F); // Box 215
		sncb_m6_tailModel[285].setRotationPoint(64F, -2F, -11F);

		sncb_m6_tailModel[286].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 527
		sncb_m6_tailModel[286].setRotationPoint(61F, -20F, 10F);

		sncb_m6_tailModel[287].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 528
		sncb_m6_tailModel[287].setRotationPoint(61F, -21F, 8F);

		sncb_m6_tailModel[288].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 529
		sncb_m6_tailModel[288].setRotationPoint(61F, -23F, 5F);

		sncb_m6_tailModel[289].addShapeBox(0F, 0F, 0F, 3, 2, 5, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 530
		sncb_m6_tailModel[289].setRotationPoint(61F, -23F, 0F);

		sncb_m6_tailModel[290].addShapeBox(0F, 0F, 0F, 3, 2, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 531
		sncb_m6_tailModel[290].setRotationPoint(61F, -23F, -5F);

		sncb_m6_tailModel[291].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 532
		sncb_m6_tailModel[291].setRotationPoint(61F, -23F, -8F);

		sncb_m6_tailModel[292].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 533
		sncb_m6_tailModel[292].setRotationPoint(61F, -21F, -9F);

		sncb_m6_tailModel[293].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 534
		sncb_m6_tailModel[293].setRotationPoint(61F, -20F, -11F);

		sncb_m6_tailModel[294].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 535
		sncb_m6_tailModel[294].setRotationPoint(64F, -21F, 8F);

		sncb_m6_tailModel[295].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 2F, 0F, -1F, 2F, 0F, -1F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 536
		sncb_m6_tailModel[295].setRotationPoint(64F, -20F, 10F);

		sncb_m6_tailModel[296].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F, 0F, 0F, 0F, 0F, -2F, -1F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 1F, -1F, 0F, 2F, 0F, 0F, 1F, 0F); // Box 537
		sncb_m6_tailModel[296].setRotationPoint(64F, -23F, 5F);

		sncb_m6_tailModel[297].addShapeBox(0F, 0F, 0F, 8, 3, 1, 0F, 0F, 0F, 2F, -3F, -8F, 2F, -3F, -8F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -3F, 7F, 0F, -3F, 7F, 0F, 0F, 0F, 0F); // Box 538
		sncb_m6_tailModel[297].setRotationPoint(65F, -19F, 10F);

		sncb_m6_tailModel[298].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F, 0F, 0F, 0F, -3F, -8F, 0F, -3F, -9F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -3F, 8F, 0F, -3F, 8F, 0F, 0F, 0F, 0F); // Box 539
		sncb_m6_tailModel[298].setRotationPoint(65F, -20F, 8F);

		sncb_m6_tailModel[299].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, -2F, 0F, -1F, -2F, 0F, -1F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 543
		sncb_m6_tailModel[299].setRotationPoint(64F, -20F, -11F);

		sncb_m6_tailModel[300].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 544
		sncb_m6_tailModel[300].setRotationPoint(64F, -21F, -9F);

		sncb_m6_tailModel[301].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F, 0F, -1F, 0F, -3F, -9F, 0F, -3F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 8F, 0F, -3F, 8F, 0F, 0F, 0F, 0F); // Box 545
		sncb_m6_tailModel[301].setRotationPoint(65F, -20F, -9F);

		sncb_m6_tailModel[302].addShapeBox(0F, 0F, 0F, 8, 3, 1, 0F, 0F, 0F, -2F, -3F, -8F, -2F, -3F, -8F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, -3F, 7F, 0F, -3F, 7F, 0F, 0F, 0F, 0F); // Box 547
		sncb_m6_tailModel[302].setRotationPoint(65F, -19F, -11F);

		sncb_m6_tailModel[303].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F, 0F, -2F, 0F, 0F, -3F, 0F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, 1F, -1F, 0F, -1F, 0F); // Box 549
		sncb_m6_tailModel[303].setRotationPoint(64F, -23F, -8F);

		sncb_m6_tailModel[304].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F, 0F, 1F, 2F, -3F, -1F, 2F, -3F, -1F, -2.25F, 0F, 0F, -2F, 0F, -1F, 0F, -3.5F, 0F, 2F, -3.5F, 0F, -1F, 0F, -1F, 0F); // Box 550
		sncb_m6_tailModel[304].setRotationPoint(70F, -11F, 10F);

		sncb_m6_tailModel[305].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F, 0F, 0F, -2F, -3F, -1F, -2.25F, -3F, -1F, 2F, 0F, 1F, 2F, 0F, -1F, 0F, -3.5F, 0F, -1F, -3.5F, 0F, 2F, 0F, -1F, 0F); // Box 551
		sncb_m6_tailModel[305].setRotationPoint(70F, -11F, -11F);

		sncb_m6_tailModel[306].addShapeBox(0F, 0F, 0F, 4, 3, 6, 0F, 0F, 1F, 0F, -3F, -1F, 0F, -3F, -1.5F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, 0F, -1F, 0F); // Box 552
		sncb_m6_tailModel[306].setRotationPoint(70F, -11F, -8F);

		sncb_m6_tailModel[307].addShapeBox(0F, 0F, 0F, 4, 3, 6, 0F, 0F, 1F, 0F, -3F, -1.5F, 0F, -3F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, 0F, -1F, 0F); // Box 553
		sncb_m6_tailModel[307].setRotationPoint(70F, -11F, 2F);

		sncb_m6_tailModel[308].addShapeBox(0F, 0F, 0F, 1, 8, 6, 0F, -2F, 0F, 0F, 1.5F, -1F, -1F, 1.5F, -1F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 554
		sncb_m6_tailModel[308].setRotationPoint(68F, -9F, -11F);

		sncb_m6_tailModel[309].addShapeBox(0F, 0F, 0F, 4, 3, 4, 0F, 0F, 1F, 0F, -3F, -1.5F, 0F, -3F, -1.5F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, 0F, -1F, 0F); // Box 555
		sncb_m6_tailModel[309].setRotationPoint(70F, -11F, -2F);

		sncb_m6_tailModel[310].addShapeBox(0F, 0F, 0F, 1, 8, 6, 0F, -2F, 0F, 0F, 1.5F, -1F, 0F, 1.5F, -1F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 556
		sncb_m6_tailModel[310].setRotationPoint(68F, -9F, 5F);

		sncb_m6_tailModel[311].addShapeBox(0F, 0F, 0F, 1, 8, 10, 0F, -2F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 557
		sncb_m6_tailModel[311].setRotationPoint(67.5F, -9F, -5F);

		sncb_m6_tailModel[312].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 558
		sncb_m6_tailModel[312].setRotationPoint(69F, -2F, 5F);

		sncb_m6_tailModel[313].addBox(0F, 0F, 0F, 1, 2, 22, 0F); // Box 559
		sncb_m6_tailModel[313].setRotationPoint(68F, -1F, -11F);

		sncb_m6_tailModel[314].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F, 0F, 0F, 0F, 0F, -2F, 1F, 0F, -2F, 1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F, 0F); // Box 560
		sncb_m6_tailModel[314].setRotationPoint(64F, -23F, -5F);

		sncb_m6_tailModel[315].addShapeBox(0F, 0F, 0F, 1, 3, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, -0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 561
		sncb_m6_tailModel[315].setRotationPoint(69.7F, -8F, -10F);

		sncb_m6_tailModel[316].addShapeBox(0F, 0F, 0F, 1, 3, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.25F, -0.25F, 0F, 0F, 0F); // Box 562
		sncb_m6_tailModel[316].setRotationPoint(69.7F, -8F, 5F);

		sncb_m6_tailModel[317].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.075F, -0.3F, -0.35F, 0F, -0.3F, -0.35F, 0F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, 0F, 0F, 0F); // lamp
		sncb_m6_tailModel[317].setRotationPoint(69.8F, -7.75F, -8.75F);

		sncb_m6_tailModel[318].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.3F, -0.35F, -0.075F, -0.3F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, 0F, 0F, 0F); // lamp
		sncb_m6_tailModel[318].setRotationPoint(69.8F, -7.75F, -9.75F);

		sncb_m6_tailModel[319].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.15F, 0F, 0F, -0.075F, -0.3F, -0.35F, 0F, -0.3F, -0.35F); // lamp
		sncb_m6_tailModel[319].setRotationPoint(69.65F, -6.75F, -8.75F);

		sncb_m6_tailModel[320].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, -0.35F, -0.075F, -0.3F, -0.35F, -0.15F, 0F, 0F, 0F, 0F, 0F); // lamp
		sncb_m6_tailModel[320].setRotationPoint(69.65F, -6.75F, -9.75F);

		sncb_m6_tailModel[321].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, -0.35F, -0.075F, -0.3F, -0.35F, -0.15F, 0F, 0F, 0F, 0F, 0F); // lamp
		sncb_m6_tailModel[321].setRotationPoint(69.65F, -6.5F, -7.5F);

		sncb_m6_tailModel[322].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.075F, -0.3F, -0.35F, 0F, -0.3F, -0.35F, 0F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, 0F, 0F, 0F); // lamp
		sncb_m6_tailModel[322].setRotationPoint(69.8F, -7.5F, -6.5F);

		sncb_m6_tailModel[323].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.15F, 0F, 0F, -0.075F, -0.3F, -0.35F, 0F, -0.3F, -0.35F); // lamp
		sncb_m6_tailModel[323].setRotationPoint(69.65F, -6.5F, -6.5F);

		sncb_m6_tailModel[324].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.3F, -0.35F, -0.075F, -0.3F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, 0F, 0F, 0F); // lamp
		sncb_m6_tailModel[324].setRotationPoint(69.8F, -7.5F, -7.5F);

		sncb_m6_tailModel[325].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, -0.35F, -0.075F, -0.3F, -0.35F, -0.15F, 0F, 0F, 0F, 0F, 0F); // lamp
		sncb_m6_tailModel[325].setRotationPoint(69.65F, -6.5F, 5.5F);

		sncb_m6_tailModel[326].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.075F, -0.3F, -0.35F, 0F, -0.3F, -0.35F, 0F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, 0F, 0F, 0F); // lamp
		sncb_m6_tailModel[326].setRotationPoint(69.8F, -7.5F, 6.5F);

		sncb_m6_tailModel[327].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.15F, 0F, 0F, -0.075F, -0.3F, -0.35F, 0F, -0.3F, -0.35F); // lamp
		sncb_m6_tailModel[327].setRotationPoint(69.65F, -6.5F, 6.5F);

		sncb_m6_tailModel[328].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.3F, -0.35F, -0.075F, -0.3F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, 0F, 0F, 0F); // lamp
		sncb_m6_tailModel[328].setRotationPoint(69.8F, -7.5F, 5.5F);

		sncb_m6_tailModel[329].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.15F, 0F, 0F, -0.075F, -0.3F, -0.35F, 0F, -0.3F, -0.35F); // lamp
		sncb_m6_tailModel[329].setRotationPoint(69.65F, -6.75F, 8.75F);

		sncb_m6_tailModel[330].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.075F, -0.3F, -0.35F, 0F, -0.3F, -0.35F, 0F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, 0F, 0F, 0F); // lamp
		sncb_m6_tailModel[330].setRotationPoint(69.8F, -7.75F, 8.75F);

		sncb_m6_tailModel[331].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.3F, -0.35F, -0.075F, -0.3F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, 0F, 0F, 0F); // lamp
		sncb_m6_tailModel[331].setRotationPoint(69.8F, -7.75F, 7.75F);

		sncb_m6_tailModel[332].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, -0.35F, -0.075F, -0.3F, -0.35F, -0.15F, 0F, 0F, 0F, 0F, 0F); // lamp
		sncb_m6_tailModel[332].setRotationPoint(69.65F, -6.75F, 7.75F);

		sncb_m6_tailModel[333].addShapeBox(0F, 0F, 0F, 4, 8, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 215
		sncb_m6_tailModel[333].setRotationPoint(64F, -9F, 9F);

		sncb_m6_tailModel[334].addShapeBox(0F, 0F, 0F, 2, 8, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 215
		sncb_m6_tailModel[334].setRotationPoint(68F, -9F, 9F);

		sncb_m6_tailModel[335].addShapeBox(0F, 0F, 0F, 6, 7, 2, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 215
		sncb_m6_tailModel[335].setRotationPoint(64F, -16F, 9F);

		sncb_m6_tailModel[336].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 215
		sncb_m6_tailModel[336].setRotationPoint(64F, -17F, 9F);

		sncb_m6_tailModel[337].addShapeBox(0F, 0F, 0F, 4, 8, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 215
		sncb_m6_tailModel[337].setRotationPoint(64F, -9F, -11F);

		sncb_m6_tailModel[338].addShapeBox(0F, 0F, 0F, 2, 8, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 215
		sncb_m6_tailModel[338].setRotationPoint(68F, -9F, -11F);

		sncb_m6_tailModel[339].addShapeBox(0F, 0F, 0F, 6, 7, 2, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 215
		sncb_m6_tailModel[339].setRotationPoint(64F, -16F, -11F);

		sncb_m6_tailModel[340].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 215
		sncb_m6_tailModel[340].setRotationPoint(64F, -17F, -11F);

		sncb_m6_tailModel[341].addShapeBox(0F, 0F, 0F, 1, 9, 12, 0F, 5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 215
		sncb_m6_tailModel[341].setRotationPoint(69F, -21F, -6F);

		sncb_m6_tailModel[342].addShapeBox(0F, 0F, 0F, 1, 9, 2, 0F, 5F, 0F, 0F, -5F, 0F, 0F, -5F, -1F, 0F, 5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 215
		sncb_m6_tailModel[342].setRotationPoint(69F, -21F, 6F);

		sncb_m6_tailModel[343].addShapeBox(0F, 0F, 0F, 1, 9, 2, 0F, 5F, -1F, 0F, -5F, -1F, 0F, -5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 215
		sncb_m6_tailModel[343].setRotationPoint(69F, -21F, -8F);

		sncb_m6_tailModel[344].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 163
		sncb_m6_tailModel[344].setRotationPoint(-17F, -12F, -1F);

		sncb_m6_tailModel[345].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 164
		sncb_m6_tailModel[345].setRotationPoint(-16F, -10F, -5F);

		sncb_m6_tailModel[346].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 167
		sncb_m6_tailModel[346].setRotationPoint(-17F, -14F, -5F);

		sncb_m6_tailModel[347].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 168
		sncb_m6_tailModel[347].setRotationPoint(-18F, -16F, -5F);

		sncb_m6_tailModel[348].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 169
		sncb_m6_tailModel[348].setRotationPoint(-17F, -10F, -4F);

		sncb_m6_tailModel[349].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 163
		sncb_m6_tailModel[349].setRotationPoint(-17F, -12F, -6F);

		sncb_m6_tailModel[350].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 164
		sncb_m6_tailModel[350].setRotationPoint(-16F, -10F, -10F);

		sncb_m6_tailModel[351].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 167
		sncb_m6_tailModel[351].setRotationPoint(-17F, -14F, -10F);

		sncb_m6_tailModel[352].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 168
		sncb_m6_tailModel[352].setRotationPoint(-18F, -16F, -10F);

		sncb_m6_tailModel[353].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 169
		sncb_m6_tailModel[353].setRotationPoint(-17F, -10F, -9F);

		sncb_m6_tailModel[354].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 84
		sncb_m6_tailModel[354].setRotationPoint(-15F, -9F, -10F);

		sncb_m6_tailModel[355].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 81
		sncb_m6_tailModel[355].setRotationPoint(-15F, -9F, -3F);

		sncb_m6_tailModel[356].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 163
		sncb_m6_tailModel[356].setRotationPoint(-1F, -12F, -1F);

		sncb_m6_tailModel[357].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 164
		sncb_m6_tailModel[357].setRotationPoint(0F, -10F, -5F);

		sncb_m6_tailModel[358].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 167
		sncb_m6_tailModel[358].setRotationPoint(-1F, -14F, -5F);

		sncb_m6_tailModel[359].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 168
		sncb_m6_tailModel[359].setRotationPoint(-2F, -16F, -5F);

		sncb_m6_tailModel[360].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 169
		sncb_m6_tailModel[360].setRotationPoint(-1F, -10F, -4F);

		sncb_m6_tailModel[361].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 163
		sncb_m6_tailModel[361].setRotationPoint(-1F, -12F, -6F);

		sncb_m6_tailModel[362].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 164
		sncb_m6_tailModel[362].setRotationPoint(0F, -10F, -10F);

		sncb_m6_tailModel[363].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 167
		sncb_m6_tailModel[363].setRotationPoint(-1F, -14F, -10F);

		sncb_m6_tailModel[364].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 168
		sncb_m6_tailModel[364].setRotationPoint(-2F, -16F, -10F);

		sncb_m6_tailModel[365].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 169
		sncb_m6_tailModel[365].setRotationPoint(-1F, -10F, -9F);

		sncb_m6_tailModel[366].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 84
		sncb_m6_tailModel[366].setRotationPoint(1F, -9F, -10F);

		sncb_m6_tailModel[367].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 81
		sncb_m6_tailModel[367].setRotationPoint(1F, -9F, -3F);

		sncb_m6_tailModel[368].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 163
		sncb_m6_tailModel[368].setRotationPoint(15F, -12F, -1F);

		sncb_m6_tailModel[369].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 164
		sncb_m6_tailModel[369].setRotationPoint(16F, -10F, -5F);

		sncb_m6_tailModel[370].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 167
		sncb_m6_tailModel[370].setRotationPoint(15F, -14F, -5F);

		sncb_m6_tailModel[371].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 168
		sncb_m6_tailModel[371].setRotationPoint(14F, -16F, -5F);

		sncb_m6_tailModel[372].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 169
		sncb_m6_tailModel[372].setRotationPoint(15F, -10F, -4F);

		sncb_m6_tailModel[373].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 163
		sncb_m6_tailModel[373].setRotationPoint(15F, -12F, -6F);

		sncb_m6_tailModel[374].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 164
		sncb_m6_tailModel[374].setRotationPoint(16F, -10F, -10F);

		sncb_m6_tailModel[375].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 167
		sncb_m6_tailModel[375].setRotationPoint(15F, -14F, -10F);

		sncb_m6_tailModel[376].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 168
		sncb_m6_tailModel[376].setRotationPoint(14F, -16F, -10F);

		sncb_m6_tailModel[377].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 169
		sncb_m6_tailModel[377].setRotationPoint(15F, -10F, -9F);

		sncb_m6_tailModel[378].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 84
		sncb_m6_tailModel[378].setRotationPoint(17F, -9F, -10F);

		sncb_m6_tailModel[379].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 81
		sncb_m6_tailModel[379].setRotationPoint(17F, -9F, -3F);

		sncb_m6_tailModel[380].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 170
		sncb_m6_tailModel[380].setRotationPoint(-9F, -12F, -1F);

		sncb_m6_tailModel[381].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 171
		sncb_m6_tailModel[381].setRotationPoint(-9F, -10F, -5F);

		sncb_m6_tailModel[382].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 174
		sncb_m6_tailModel[382].setRotationPoint(-5F, -14F, -5F);

		sncb_m6_tailModel[383].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 175
		sncb_m6_tailModel[383].setRotationPoint(-4F, -16F, -5F);

		sncb_m6_tailModel[384].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 176
		sncb_m6_tailModel[384].setRotationPoint(-5F, -10F, -4F);

		sncb_m6_tailModel[385].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 170
		sncb_m6_tailModel[385].setRotationPoint(-9F, -12F, -6F);

		sncb_m6_tailModel[386].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 171
		sncb_m6_tailModel[386].setRotationPoint(-9F, -10F, -10F);

		sncb_m6_tailModel[387].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 174
		sncb_m6_tailModel[387].setRotationPoint(-5F, -14F, -10F);

		sncb_m6_tailModel[388].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 175
		sncb_m6_tailModel[388].setRotationPoint(-4F, -16F, -10F);

		sncb_m6_tailModel[389].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 176
		sncb_m6_tailModel[389].setRotationPoint(-5F, -10F, -9F);

		sncb_m6_tailModel[390].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 84
		sncb_m6_tailModel[390].setRotationPoint(-8F, -9F, -10F);

		sncb_m6_tailModel[391].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 81
		sncb_m6_tailModel[391].setRotationPoint(-8F, -9F, -3F);

		sncb_m6_tailModel[392].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 170
		sncb_m6_tailModel[392].setRotationPoint(7F, -12F, -1F);

		sncb_m6_tailModel[393].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 171
		sncb_m6_tailModel[393].setRotationPoint(7F, -10F, -5F);

		sncb_m6_tailModel[394].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 174
		sncb_m6_tailModel[394].setRotationPoint(11F, -14F, -5F);

		sncb_m6_tailModel[395].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 175
		sncb_m6_tailModel[395].setRotationPoint(12F, -16F, -5F);

		sncb_m6_tailModel[396].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 176
		sncb_m6_tailModel[396].setRotationPoint(11F, -10F, -4F);

		sncb_m6_tailModel[397].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 170
		sncb_m6_tailModel[397].setRotationPoint(7F, -12F, -6F);

		sncb_m6_tailModel[398].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 171
		sncb_m6_tailModel[398].setRotationPoint(7F, -10F, -10F);

		sncb_m6_tailModel[399].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 174
		sncb_m6_tailModel[399].setRotationPoint(11F, -14F, -10F);

		sncb_m6_tailModel[400].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 175
		sncb_m6_tailModel[400].setRotationPoint(12F, -16F, -10F);

		sncb_m6_tailModel[401].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 176
		sncb_m6_tailModel[401].setRotationPoint(11F, -10F, -9F);

		sncb_m6_tailModel[402].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 84
		sncb_m6_tailModel[402].setRotationPoint(8F, -9F, -10F);

		sncb_m6_tailModel[403].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 81
		sncb_m6_tailModel[403].setRotationPoint(8F, -9F, -3F);

		sncb_m6_tailModel[404].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 170
		sncb_m6_tailModel[404].setRotationPoint(23F, -12F, -1F);

		sncb_m6_tailModel[405].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 171
		sncb_m6_tailModel[405].setRotationPoint(23F, -10F, -5F);

		sncb_m6_tailModel[406].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 174
		sncb_m6_tailModel[406].setRotationPoint(27F, -14F, -5F);

		sncb_m6_tailModel[407].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 175
		sncb_m6_tailModel[407].setRotationPoint(28F, -16F, -5F);

		sncb_m6_tailModel[408].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 176
		sncb_m6_tailModel[408].setRotationPoint(27F, -10F, -4F);

		sncb_m6_tailModel[409].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 170
		sncb_m6_tailModel[409].setRotationPoint(23F, -12F, -6F);

		sncb_m6_tailModel[410].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 171
		sncb_m6_tailModel[410].setRotationPoint(23F, -10F, -10F);

		sncb_m6_tailModel[411].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 174
		sncb_m6_tailModel[411].setRotationPoint(27F, -14F, -10F);

		sncb_m6_tailModel[412].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 175
		sncb_m6_tailModel[412].setRotationPoint(28F, -16F, -10F);

		sncb_m6_tailModel[413].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 176
		sncb_m6_tailModel[413].setRotationPoint(27F, -10F, -9F);

		sncb_m6_tailModel[414].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 84
		sncb_m6_tailModel[414].setRotationPoint(24F, -9F, -10F);

		sncb_m6_tailModel[415].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 81
		sncb_m6_tailModel[415].setRotationPoint(24F, -9F, -3F);

		sncb_m6_tailModel[416].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 163
		sncb_m6_tailModel[416].setRotationPoint(-17F, -12F, 9F);

		sncb_m6_tailModel[417].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 164
		sncb_m6_tailModel[417].setRotationPoint(-16F, -10F, 5F);

		sncb_m6_tailModel[418].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 167
		sncb_m6_tailModel[418].setRotationPoint(-17F, -14F, 5F);

		sncb_m6_tailModel[419].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 168
		sncb_m6_tailModel[419].setRotationPoint(-18F, -16F, 5F);

		sncb_m6_tailModel[420].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 169
		sncb_m6_tailModel[420].setRotationPoint(-17F, -10F, 6F);

		sncb_m6_tailModel[421].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 163
		sncb_m6_tailModel[421].setRotationPoint(-17F, -12F, 4F);

		sncb_m6_tailModel[422].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 166
		sncb_m6_tailModel[422].setRotationPoint(-15F, -9F, 6F);

		sncb_m6_tailModel[423].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 163
		sncb_m6_tailModel[423].setRotationPoint(-1F, -12F, 9F);

		sncb_m6_tailModel[424].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 164
		sncb_m6_tailModel[424].setRotationPoint(0F, -10F, 5F);

		sncb_m6_tailModel[425].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 167
		sncb_m6_tailModel[425].setRotationPoint(-1F, -14F, 5F);

		sncb_m6_tailModel[426].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 168
		sncb_m6_tailModel[426].setRotationPoint(-2F, -16F, 5F);

		sncb_m6_tailModel[427].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 169
		sncb_m6_tailModel[427].setRotationPoint(-1F, -10F, 6F);

		sncb_m6_tailModel[428].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 163
		sncb_m6_tailModel[428].setRotationPoint(-1F, -12F, 4F);

		sncb_m6_tailModel[429].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 166
		sncb_m6_tailModel[429].setRotationPoint(1F, -9F, 6F);

		sncb_m6_tailModel[430].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 163
		sncb_m6_tailModel[430].setRotationPoint(15F, -12F, 9F);

		sncb_m6_tailModel[431].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 164
		sncb_m6_tailModel[431].setRotationPoint(16F, -10F, 5F);

		sncb_m6_tailModel[432].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 167
		sncb_m6_tailModel[432].setRotationPoint(15F, -14F, 5F);

		sncb_m6_tailModel[433].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 168
		sncb_m6_tailModel[433].setRotationPoint(14F, -16F, 5F);

		sncb_m6_tailModel[434].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 169
		sncb_m6_tailModel[434].setRotationPoint(15F, -10F, 6F);

		sncb_m6_tailModel[435].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 163
		sncb_m6_tailModel[435].setRotationPoint(15F, -12F, 4F);

		sncb_m6_tailModel[436].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 166
		sncb_m6_tailModel[436].setRotationPoint(17F, -9F, 6F);

		sncb_m6_tailModel[437].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 170
		sncb_m6_tailModel[437].setRotationPoint(7F, -12F, 9F);

		sncb_m6_tailModel[438].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 171
		sncb_m6_tailModel[438].setRotationPoint(7F, -10F, 5F);

		sncb_m6_tailModel[439].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 174
		sncb_m6_tailModel[439].setRotationPoint(11F, -14F, 5F);

		sncb_m6_tailModel[440].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 175
		sncb_m6_tailModel[440].setRotationPoint(12F, -16F, 5F);

		sncb_m6_tailModel[441].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 176
		sncb_m6_tailModel[441].setRotationPoint(11F, -10F, 6F);

		sncb_m6_tailModel[442].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 166
		sncb_m6_tailModel[442].setRotationPoint(8F, -9F, 6F);

		sncb_m6_tailModel[443].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 170
		sncb_m6_tailModel[443].setRotationPoint(7F, -12F, 4F);

		sncb_m6_tailModel[444].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 170
		sncb_m6_tailModel[444].setRotationPoint(23F, -12F, 9F);

		sncb_m6_tailModel[445].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 171
		sncb_m6_tailModel[445].setRotationPoint(23F, -10F, 5F);

		sncb_m6_tailModel[446].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 174
		sncb_m6_tailModel[446].setRotationPoint(27F, -14F, 5F);

		sncb_m6_tailModel[447].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 175
		sncb_m6_tailModel[447].setRotationPoint(28F, -16F, 5F);

		sncb_m6_tailModel[448].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 176
		sncb_m6_tailModel[448].setRotationPoint(27F, -10F, 6F);

		sncb_m6_tailModel[449].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 166
		sncb_m6_tailModel[449].setRotationPoint(24F, -9F, 6F);

		sncb_m6_tailModel[450].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 170
		sncb_m6_tailModel[450].setRotationPoint(23F, -12F, 4F);

		sncb_m6_tailModel[451].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 170
		sncb_m6_tailModel[451].setRotationPoint(29F, -12F, 9F);

		sncb_m6_tailModel[452].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 171
		sncb_m6_tailModel[452].setRotationPoint(29F, -10F, 5F);

		sncb_m6_tailModel[453].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 174
		sncb_m6_tailModel[453].setRotationPoint(33F, -14F, 5F);

		sncb_m6_tailModel[454].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 175
		sncb_m6_tailModel[454].setRotationPoint(34F, -16F, 5F);

		sncb_m6_tailModel[455].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 176
		sncb_m6_tailModel[455].setRotationPoint(33F, -10F, 6F);

		sncb_m6_tailModel[456].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 166
		sncb_m6_tailModel[456].setRotationPoint(30F, -9F, 6F);

		sncb_m6_tailModel[457].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 170
		sncb_m6_tailModel[457].setRotationPoint(29F, -12F, 4F);

		sncb_m6_tailModel[458].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 183
		sncb_m6_tailModel[458].setRotationPoint(0F, 4F, 1F);

		sncb_m6_tailModel[459].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 184
		sncb_m6_tailModel[459].setRotationPoint(0F, 4F, 6F);

		sncb_m6_tailModel[460].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 185
		sncb_m6_tailModel[460].setRotationPoint(-1F, 2F, 0F);

		sncb_m6_tailModel[461].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 186
		sncb_m6_tailModel[461].setRotationPoint(-1F, 2F, 5F);

		sncb_m6_tailModel[462].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 187
		sncb_m6_tailModel[462].setRotationPoint(-2F, -2F, 6F);

		sncb_m6_tailModel[463].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 188
		sncb_m6_tailModel[463].setRotationPoint(-1F, 0F, 6F);

		sncb_m6_tailModel[464].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 189
		sncb_m6_tailModel[464].setRotationPoint(-1F, 0F, 1F);

		sncb_m6_tailModel[465].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 190
		sncb_m6_tailModel[465].setRotationPoint(-2F, -2F, 1F);

		sncb_m6_tailModel[466].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 191
		sncb_m6_tailModel[466].setRotationPoint(-1F, 4F, 7F);

		sncb_m6_tailModel[467].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 192
		sncb_m6_tailModel[467].setRotationPoint(-1F, 4F, 2F);

		sncb_m6_tailModel[468].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 193
		sncb_m6_tailModel[468].setRotationPoint(1F, 5F, 3F);

		sncb_m6_tailModel[469].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 194
		sncb_m6_tailModel[469].setRotationPoint(1F, 5F, 2F);

		sncb_m6_tailModel[470].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 183
		sncb_m6_tailModel[470].setRotationPoint(-16F, 4F, 1F);

		sncb_m6_tailModel[471].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 184
		sncb_m6_tailModel[471].setRotationPoint(-16F, 4F, 6F);

		sncb_m6_tailModel[472].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 185
		sncb_m6_tailModel[472].setRotationPoint(-17F, 2F, 0F);

		sncb_m6_tailModel[473].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 186
		sncb_m6_tailModel[473].setRotationPoint(-17F, 2F, 5F);

		sncb_m6_tailModel[474].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 187
		sncb_m6_tailModel[474].setRotationPoint(-18F, -2F, 6F);

		sncb_m6_tailModel[475].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 188
		sncb_m6_tailModel[475].setRotationPoint(-17F, 0F, 6F);

		sncb_m6_tailModel[476].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 189
		sncb_m6_tailModel[476].setRotationPoint(-17F, 0F, 1F);

		sncb_m6_tailModel[477].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 190
		sncb_m6_tailModel[477].setRotationPoint(-18F, -2F, 1F);

		sncb_m6_tailModel[478].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 191
		sncb_m6_tailModel[478].setRotationPoint(-17F, 4F, 7F);

		sncb_m6_tailModel[479].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 192
		sncb_m6_tailModel[479].setRotationPoint(-17F, 4F, 2F);

		sncb_m6_tailModel[480].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 193
		sncb_m6_tailModel[480].setRotationPoint(-15F, 5F, 3F);

		sncb_m6_tailModel[481].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 194
		sncb_m6_tailModel[481].setRotationPoint(-15F, 5F, 2F);

		sncb_m6_tailModel[482].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 183
		sncb_m6_tailModel[482].setRotationPoint(-33F, 4F, 1F);

		sncb_m6_tailModel[483].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 184
		sncb_m6_tailModel[483].setRotationPoint(-33F, 4F, 6F);

		sncb_m6_tailModel[484].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 185
		sncb_m6_tailModel[484].setRotationPoint(-34F, 2F, 0F);

		sncb_m6_tailModel[485].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 186
		sncb_m6_tailModel[485].setRotationPoint(-34F, 2F, 5F);

		sncb_m6_tailModel[486].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 187
		sncb_m6_tailModel[486].setRotationPoint(-35F, -2F, 6F);

		sncb_m6_tailModel[487].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 188
		sncb_m6_tailModel[487].setRotationPoint(-34F, 0F, 6F);

		sncb_m6_tailModel[488].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 189
		sncb_m6_tailModel[488].setRotationPoint(-34F, 0F, 1F);

		sncb_m6_tailModel[489].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 190
		sncb_m6_tailModel[489].setRotationPoint(-35F, -2F, 1F);

		sncb_m6_tailModel[490].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 191
		sncb_m6_tailModel[490].setRotationPoint(-34F, 4F, 7F);

		sncb_m6_tailModel[491].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 192
		sncb_m6_tailModel[491].setRotationPoint(-34F, 4F, 2F);

		sncb_m6_tailModel[492].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 193
		sncb_m6_tailModel[492].setRotationPoint(-32F, 5F, 3F);

		sncb_m6_tailModel[493].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 194
		sncb_m6_tailModel[493].setRotationPoint(-32F, 5F, 2F);

		sncb_m6_tailModel[494].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 130
		sncb_m6_tailModel[494].setRotationPoint(-9F, 4F, 6F);

		sncb_m6_tailModel[495].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 131
		sncb_m6_tailModel[495].setRotationPoint(-9F, 4F, 1F);

		sncb_m6_tailModel[496].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 132
		sncb_m6_tailModel[496].setRotationPoint(-9F, 2F, 5F);

		sncb_m6_tailModel[497].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 133
		sncb_m6_tailModel[497].setRotationPoint(-9F, 2F, 0F);

		sncb_m6_tailModel[498].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 134
		sncb_m6_tailModel[498].setRotationPoint(-4F, -2F, 1F);

		sncb_m6_tailModel[499].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 135
		sncb_m6_tailModel[499].setRotationPoint(-5F, 0F, 1F);

		sncb_m6_tailModel[500].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 136
		sncb_m6_tailModel[500].setRotationPoint(-5F, 0F, 6F);

		sncb_m6_tailModel[501].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 137
		sncb_m6_tailModel[501].setRotationPoint(-4F, -2F, 6F);

		sncb_m6_tailModel[502].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 138
		sncb_m6_tailModel[502].setRotationPoint(-5F, 4F, 7F);

		sncb_m6_tailModel[503].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 139
		sncb_m6_tailModel[503].setRotationPoint(-5F, 4F, 2F);

		sncb_m6_tailModel[504].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 140
		sncb_m6_tailModel[504].setRotationPoint(-8F, 5F, 2F);

		sncb_m6_tailModel[505].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 141
		sncb_m6_tailModel[505].setRotationPoint(-8F, 5F, 3F);

		sncb_m6_tailModel[506].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 130
		sncb_m6_tailModel[506].setRotationPoint(7F, 4F, 6F);

		sncb_m6_tailModel[507].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 131
		sncb_m6_tailModel[507].setRotationPoint(7F, 4F, 1F);

		sncb_m6_tailModel[508].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 132
		sncb_m6_tailModel[508].setRotationPoint(7F, 2F, 5F);

		sncb_m6_tailModel[509].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 133
		sncb_m6_tailModel[509].setRotationPoint(7F, 2F, 0F);

		sncb_m6_tailModel[510].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 134
		sncb_m6_tailModel[510].setRotationPoint(12F, -2F, 1F);

		sncb_m6_tailModel[511].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 135
		sncb_m6_tailModel[511].setRotationPoint(11F, 0F, 1F);

		sncb_m6_tailModel[512].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 136
		sncb_m6_tailModel[512].setRotationPoint(11F, 0F, 6F);

		sncb_m6_tailModel[513].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 137
		sncb_m6_tailModel[513].setRotationPoint(12F, -2F, 6F);

		sncb_m6_tailModel[514].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 138
		sncb_m6_tailModel[514].setRotationPoint(11F, 4F, 7F);

		sncb_m6_tailModel[515].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 139
		sncb_m6_tailModel[515].setRotationPoint(11F, 4F, 2F);

		sncb_m6_tailModel[516].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 140
		sncb_m6_tailModel[516].setRotationPoint(8F, 5F, 2F);

		sncb_m6_tailModel[517].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 141
		sncb_m6_tailModel[517].setRotationPoint(8F, 5F, 3F);

		sncb_m6_tailModel[518].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 130
		sncb_m6_tailModel[518].setRotationPoint(23F, 4F, 6F);

		sncb_m6_tailModel[519].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 131
		sncb_m6_tailModel[519].setRotationPoint(23F, 4F, 1F);

		sncb_m6_tailModel[520].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 132
		sncb_m6_tailModel[520].setRotationPoint(23F, 2F, 5F);

		sncb_m6_tailModel[521].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 133
		sncb_m6_tailModel[521].setRotationPoint(23F, 2F, 0F);

		sncb_m6_tailModel[522].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 134
		sncb_m6_tailModel[522].setRotationPoint(28F, -2F, 1F);

		sncb_m6_tailModel[523].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 135
		sncb_m6_tailModel[523].setRotationPoint(27F, 0F, 1F);

		sncb_m6_tailModel[524].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 136
		sncb_m6_tailModel[524].setRotationPoint(27F, 0F, 6F);

		sncb_m6_tailModel[525].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 137
		sncb_m6_tailModel[525].setRotationPoint(28F, -2F, 6F);

		sncb_m6_tailModel[526].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 138
		sncb_m6_tailModel[526].setRotationPoint(27F, 4F, 7F);

		sncb_m6_tailModel[527].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 139
		sncb_m6_tailModel[527].setRotationPoint(27F, 4F, 2F);

		sncb_m6_tailModel[528].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 140
		sncb_m6_tailModel[528].setRotationPoint(24F, 5F, 2F);

		sncb_m6_tailModel[529].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 141
		sncb_m6_tailModel[529].setRotationPoint(24F, 5F, 3F);

		sncb_m6_tailModel[530].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 170
		sncb_m6_tailModel[530].setRotationPoint(7F, 2F, -10F);

		sncb_m6_tailModel[531].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 171
		sncb_m6_tailModel[531].setRotationPoint(7F, 4F, -9F);

		sncb_m6_tailModel[532].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 172
		sncb_m6_tailModel[532].setRotationPoint(7F, 2F, -5F);

		sncb_m6_tailModel[533].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 173
		sncb_m6_tailModel[533].setRotationPoint(8F, 5F, -8F);

		sncb_m6_tailModel[534].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 174
		sncb_m6_tailModel[534].setRotationPoint(11F, 0F, -9F);

		sncb_m6_tailModel[535].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 175
		sncb_m6_tailModel[535].setRotationPoint(12F, -2F, -9F);

		sncb_m6_tailModel[536].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 176
		sncb_m6_tailModel[536].setRotationPoint(11F, 4F, -8F);

		sncb_m6_tailModel[537].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 170
		sncb_m6_tailModel[537].setRotationPoint(23F, 2F, -10F);

		sncb_m6_tailModel[538].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 171
		sncb_m6_tailModel[538].setRotationPoint(23F, 4F, -9F);

		sncb_m6_tailModel[539].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 172
		sncb_m6_tailModel[539].setRotationPoint(23F, 2F, -5F);

		sncb_m6_tailModel[540].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 173
		sncb_m6_tailModel[540].setRotationPoint(24F, 5F, -8F);

		sncb_m6_tailModel[541].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 174
		sncb_m6_tailModel[541].setRotationPoint(27F, 0F, -9F);

		sncb_m6_tailModel[542].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 175
		sncb_m6_tailModel[542].setRotationPoint(28F, -2F, -9F);

		sncb_m6_tailModel[543].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 176
		sncb_m6_tailModel[543].setRotationPoint(27F, 4F, -8F);

		sncb_m6_tailModel[544].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 163
		sncb_m6_tailModel[544].setRotationPoint(-17F, 2F, -10F);

		sncb_m6_tailModel[545].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 164
		sncb_m6_tailModel[545].setRotationPoint(-16F, 4F, -9F);

		sncb_m6_tailModel[546].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 165
		sncb_m6_tailModel[546].setRotationPoint(-17F, 2F, -5F);

		sncb_m6_tailModel[547].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 166
		sncb_m6_tailModel[547].setRotationPoint(-15F, 5F, -8F);

		sncb_m6_tailModel[548].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 167
		sncb_m6_tailModel[548].setRotationPoint(-17F, 0F, -9F);

		sncb_m6_tailModel[549].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 168
		sncb_m6_tailModel[549].setRotationPoint(-18F, -2F, -9F);

		sncb_m6_tailModel[550].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 169
		sncb_m6_tailModel[550].setRotationPoint(-17F, 4F, -8F);

		sncb_m6_tailModel[551].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 163
		sncb_m6_tailModel[551].setRotationPoint(-1F, 2F, -10F);

		sncb_m6_tailModel[552].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 164
		sncb_m6_tailModel[552].setRotationPoint(0F, 4F, -9F);

		sncb_m6_tailModel[553].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 165
		sncb_m6_tailModel[553].setRotationPoint(-1F, 2F, -5F);

		sncb_m6_tailModel[554].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 166
		sncb_m6_tailModel[554].setRotationPoint(1F, 5F, -8F);

		sncb_m6_tailModel[555].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 167
		sncb_m6_tailModel[555].setRotationPoint(-1F, 0F, -9F);

		sncb_m6_tailModel[556].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 168
		sncb_m6_tailModel[556].setRotationPoint(-2F, -2F, -9F);

		sncb_m6_tailModel[557].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 169
		sncb_m6_tailModel[557].setRotationPoint(-1F, 4F, -8F);

		sncb_m6_tailModel[558].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 163
		sncb_m6_tailModel[558].setRotationPoint(15F, 2F, -10F);

		sncb_m6_tailModel[559].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 164
		sncb_m6_tailModel[559].setRotationPoint(16F, 4F, -9F);

		sncb_m6_tailModel[560].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 165
		sncb_m6_tailModel[560].setRotationPoint(15F, 2F, -5F);

		sncb_m6_tailModel[561].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 166
		sncb_m6_tailModel[561].setRotationPoint(17F, 5F, -8F);

		sncb_m6_tailModel[562].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 167
		sncb_m6_tailModel[562].setRotationPoint(15F, 0F, -9F);

		sncb_m6_tailModel[563].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 168
		sncb_m6_tailModel[563].setRotationPoint(14F, -2F, -9F);

		sncb_m6_tailModel[564].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 169
		sncb_m6_tailModel[564].setRotationPoint(15F, 4F, -8F);

		sncb_m6_tailModel[565].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, -0.35F, 0F, -0.3F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F); // lamp
		sncb_m6_tailModel[565].setRotationPoint(-70.5F, -6.5F, -9F);

		sncb_m6_tailModel[566].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, -0.35F, 0F, -0.3F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // lamp
		sncb_m6_tailModel[566].setRotationPoint(-70.5F, -7.5F, -8F);

		sncb_m6_tailModel[567].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, -0.35F, 0F, -0.3F, -0.35F); // lamp
		sncb_m6_tailModel[567].setRotationPoint(-70.5F, -6.5F, -8F);

		sncb_m6_tailModel[568].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.3F, -0.35F, 0F, -0.3F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // lamp
		sncb_m6_tailModel[568].setRotationPoint(-70.5F, -7.5F, -9F);

		sncb_m6_tailModel[569].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, -0.35F, 0F, -0.3F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F); // lamp
		sncb_m6_tailModel[569].setRotationPoint(-70.5F, -6.5F, 7F);

		sncb_m6_tailModel[570].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, -0.35F, 0F, -0.3F, -0.35F); // lamp
		sncb_m6_tailModel[570].setRotationPoint(-70.5F, -6.5F, 8F);

		sncb_m6_tailModel[571].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.3F, -0.35F, 0F, -0.3F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // lamp
		sncb_m6_tailModel[571].setRotationPoint(-70.5F, -7.5F, 7F);

		sncb_m6_tailModel[572].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.075F, -0.3F, -0.35F, 0F, -0.3F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // lamp
		sncb_m6_tailModel[572].setRotationPoint(-70.5F, -7.5F, 8F);

		sncb_m6_tailModel[573].addShapeBox(0F, 0F, 0F, 82, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 9
		sncb_m6_tailModel[573].setRotationPoint(-41F, 7F, 9F);

		sncb_m6_tailModel[574].addBox(0F, 0F, 0F, 1, 3, 16, 0F); // Box 193
		sncb_m6_tailModel[574].setRotationPoint(55F, -20F, -8F);

		sncb_m6_tailModel[575].addBox(0F, 0F, 0F, 1, 2, 5, 0F); // Box 193
		sncb_m6_tailModel[575].setRotationPoint(55F, -22F, 0F);

		sncb_m6_tailModel[576].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 193
		sncb_m6_tailModel[576].setRotationPoint(55F, -22F, -8F);

		sncb_m6_tailModel[577].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 193
		sncb_m6_tailModel[577].setRotationPoint(55F, -22F, 5F);

		sncb_m6_tailModel[578].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 193
		sncb_m6_tailModel[578].setRotationPoint(55F, -20F, 8F);

		sncb_m6_tailModel[579].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 193
		sncb_m6_tailModel[579].setRotationPoint(55F, -20F, -10F);

		sncb_m6_tailModel[580].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 193
		sncb_m6_tailModel[580].setRotationPoint(55F, -23F, -5F);

		sncb_m6_tailModel[581].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 193
		sncb_m6_tailModel[581].setRotationPoint(55F, -23F, 0F);

		sncb_m6_tailModel[582].addBox(0F, 0F, 0F, 1, 2, 5, 0F); // Box 193
		sncb_m6_tailModel[582].setRotationPoint(55F, -22F, -5F);

		sncb_m6_tailModel[583].addShapeBox(0F, 0F, 0F, 48, 12, 1, 0F, -36F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -36F, 0F, 0F, -36F, -9F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, -36F, -9F, 0F); // Box 31
		sncb_m6_tailModel[583].setRotationPoint(-42F, -10F, 10F);

		sncb_m6_tailModel[584].addShapeBox(0F, 0F, 0F, 48, 12, 1, 0F, -36F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -36F, 0F, 0F, -36F, -9F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, -36F, -9F, 0F); // Box 31
		sncb_m6_tailModel[584].setRotationPoint(-47F, -10F, -11F);


	}
	ModelSNCB_M6_Trucks theTrucks = new ModelSNCB_M6_Trucks();
	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		for (int i = 0; i < 585; i++) {
			if (sncb_m6_tailModel[i].boxName != null && sncb_m6_tailModel[i].boxName.contains("lamp") ) {
				Minecraft.getMinecraft().entityRenderer.disableLightmap(1D);
				sncb_m6_tailModel[i].render(f5);
				Minecraft.getMinecraft().entityRenderer.enableLightmap(1D);
			}else if (sncb_m6_tailModel[i].boxName != null && sncb_m6_tailModel[i].boxName.contains("cull")) {
				GL11.glDisable(GL11.GL_CULL_FACE);
				sncb_m6_tailModel[i].render(f5);
				GL11.glEnable(GL11.GL_CULL_FACE);
			} else {
				sncb_m6_tailModel[i].render(f5);
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

	public ModelRendererTurbo sncb_m6_tailModel[];
}