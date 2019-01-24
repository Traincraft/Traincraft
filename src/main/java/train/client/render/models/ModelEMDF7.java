//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2017 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model:
// Model Creator: Apoc The Wanderer
// Created on:28.07.2017 - 12:22:41
// Last changed on: 28.07.2017 - 12:22:41
package train.client.render.models;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import tmt.ModelBase;
import tmt.ModelRendererTurbo;
import tmt.Tessellator;
import train.common.library.Info;

public class ModelEMDF7 extends ModelBase
{
	int textureX = 256;
	int textureY = 256;

	public ModelEMDF7()
	{
		emdf7Model = new ModelRendererTurbo[176];
		emdf7Model[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 001
		emdf7Model[1] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 002
		emdf7Model[2] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 003
		emdf7Model[3] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 005
		emdf7Model[4] = new ModelRendererTurbo(this, 113, 25, textureX, textureY); // Box 007
		emdf7Model[5] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 008
		emdf7Model[6] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 009
		emdf7Model[7] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 010
		emdf7Model[8] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 011
		emdf7Model[9] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 012
		emdf7Model[10] = new ModelRendererTurbo(this, 185, 9, textureX, textureY); // Box 013
		emdf7Model[11] = new ModelRendererTurbo(this, 201, 9, textureX, textureY); // Box 014
		emdf7Model[12] = new ModelRendererTurbo(this, 241, 9, textureX, textureY); // Box 015
		emdf7Model[13] = new ModelRendererTurbo(this, 137, 33, textureX, textureY); // Box 020
		emdf7Model[14] = new ModelRendererTurbo(this, 249, 9, textureX, textureY); // Box 023
		emdf7Model[15] = new ModelRendererTurbo(this, 241, 17, textureX, textureY); // Box 025
		emdf7Model[16] = new ModelRendererTurbo(this, 113, 33, textureX, textureY); // Box 028
		emdf7Model[17] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 033
		emdf7Model[18] = new ModelRendererTurbo(this, 185, 17, textureX, textureY); // Box 037
		emdf7Model[19] = new ModelRendererTurbo(this, 209, 17, textureX, textureY); // Box 039
		emdf7Model[20] = new ModelRendererTurbo(this, 225, 41, textureX, textureY); // Box 040
		emdf7Model[21] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 043
		emdf7Model[22] = new ModelRendererTurbo(this, 137, 57, textureX, textureY); // Box 045
		emdf7Model[23] = new ModelRendererTurbo(this, 161, 57, textureX, textureY); // Box 049
		emdf7Model[24] = new ModelRendererTurbo(this, 225, 33, textureX, textureY); // Box 050
		emdf7Model[25] = new ModelRendererTurbo(this, 137, 33, textureX, textureY); // Box 052
		emdf7Model[26] = new ModelRendererTurbo(this, 233, 17, textureX, textureY); // Box 053
		emdf7Model[27] = new ModelRendererTurbo(this, 113, 57, textureX, textureY); // Box 054
		emdf7Model[28] = new ModelRendererTurbo(this, 137, 41, textureX, textureY); // Box 057
		emdf7Model[29] = new ModelRendererTurbo(this, 185, 57, textureX, textureY); // Box 058
		emdf7Model[30] = new ModelRendererTurbo(this, 9, 9, textureX, textureY); // Box 062
		emdf7Model[31] = new ModelRendererTurbo(this, 241, 49, textureX, textureY); // Box 065
		emdf7Model[32] = new ModelRendererTurbo(this, 209, 57, textureX, textureY); // Box 066
		emdf7Model[33] = new ModelRendererTurbo(this, 209, 57, textureX, textureY); // Box 068
		emdf7Model[34] = new ModelRendererTurbo(this, 225, 57, textureX, textureY); // Box 072
		emdf7Model[35] = new ModelRendererTurbo(this, 241, 57, textureX, textureY); // Box 088
		emdf7Model[36] = new ModelRendererTurbo(this, 137, 65, textureX, textureY); // Box 089
		emdf7Model[37] = new ModelRendererTurbo(this, 193, 65, textureX, textureY); // Box 090
		emdf7Model[38] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 096
		emdf7Model[39] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 107
		emdf7Model[40] = new ModelRendererTurbo(this, 161, 81, textureX, textureY); // Box 108
		emdf7Model[41] = new ModelRendererTurbo(this, 233, 65, textureX, textureY); // Box 111
		emdf7Model[42] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 116
		emdf7Model[43] = new ModelRendererTurbo(this, 177, 17, textureX, textureY); // Box 118
		emdf7Model[44] = new ModelRendererTurbo(this, 153, 89, textureX, textureY); // Box 119
		emdf7Model[45] = new ModelRendererTurbo(this, 185, 89, textureX, textureY); // Box 120
		emdf7Model[46] = new ModelRendererTurbo(this, 209, 89, textureX, textureY); // Box 121
		emdf7Model[47] = new ModelRendererTurbo(this, 121, 97, textureX, textureY); // Box 122
		emdf7Model[48] = new ModelRendererTurbo(this, 249, 41, textureX, textureY); // Box 128
		emdf7Model[49] = new ModelRendererTurbo(this, 161, 73, textureX, textureY); // Box 130
		emdf7Model[50] = new ModelRendererTurbo(this, 225, 73, textureX, textureY); // Box 156
		emdf7Model[51] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 168
		emdf7Model[52] = new ModelRendererTurbo(this, 113, 25, textureX, textureY); // Box 170
		emdf7Model[53] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 202
		emdf7Model[54] = new ModelRendererTurbo(this, 233, 89, textureX, textureY); // Box 210
		emdf7Model[55] = new ModelRendererTurbo(this, 33, 105, textureX, textureY); // Box 219
		emdf7Model[56] = new ModelRendererTurbo(this, 89, 73, textureX, textureY); // Box 221
		emdf7Model[57] = new ModelRendererTurbo(this, 153, 65, textureX, textureY); // Box 227
		emdf7Model[58] = new ModelRendererTurbo(this, 249, 65, textureX, textureY); // Box 344
		emdf7Model[59] = new ModelRendererTurbo(this, 57, 105, textureX, textureY); // Box 349
		emdf7Model[60] = new ModelRendererTurbo(this, 225, 17, textureX, textureY); // Box 354
		emdf7Model[61] = new ModelRendererTurbo(this, 185, 73, textureX, textureY); // Box 249
		emdf7Model[62] = new ModelRendererTurbo(this, 89, 105, textureX, textureY); // Box 221
		emdf7Model[63] = new ModelRendererTurbo(this, 97, 105, textureX, textureY); // Box 222
		emdf7Model[64] = new ModelRendererTurbo(this, 105, 105, textureX, textureY); // Box 223
		emdf7Model[65] = new ModelRendererTurbo(this, 113, 105, textureX, textureY); // Box 224
		emdf7Model[66] = new ModelRendererTurbo(this, 153, 105, textureX, textureY); // Box 225
		emdf7Model[67] = new ModelRendererTurbo(this, 161, 105, textureX, textureY); // Box 226
		emdf7Model[68] = new ModelRendererTurbo(this, 169, 105, textureX, textureY); // Box 227
		emdf7Model[69] = new ModelRendererTurbo(this, 177, 105, textureX, textureY); // Box 228
		emdf7Model[70] = new ModelRendererTurbo(this, 185, 105, textureX, textureY); // Box 229
		emdf7Model[71] = new ModelRendererTurbo(this, 193, 105, textureX, textureY); // Box 230
		emdf7Model[72] = new ModelRendererTurbo(this, 201, 105, textureX, textureY); // Box 231
		emdf7Model[73] = new ModelRendererTurbo(this, 169, 89, textureX, textureY); // Box 232
		emdf7Model[74] = new ModelRendererTurbo(this, 137, 65, textureX, textureY); // Box 234
		emdf7Model[75] = new ModelRendererTurbo(this, 201, 89, textureX, textureY); // Box 235
		emdf7Model[76] = new ModelRendererTurbo(this, 209, 105, textureX, textureY); // Box 255
		emdf7Model[77] = new ModelRendererTurbo(this, 57, 113, textureX, textureY); // Box 256
		emdf7Model[78] = new ModelRendererTurbo(this, 121, 113, textureX, textureY); // Box 257
		emdf7Model[79] = new ModelRendererTurbo(this, 209, 113, textureX, textureY); // Box 258
		emdf7Model[80] = new ModelRendererTurbo(this, 233, 113, textureX, textureY); // Box 259
		emdf7Model[81] = new ModelRendererTurbo(this, 25, 121, textureX, textureY); // Box 262
		emdf7Model[82] = new ModelRendererTurbo(this, 41, 121, textureX, textureY); // Box 264
		emdf7Model[83] = new ModelRendererTurbo(this, 225, 89, textureX, textureY); // Box 267
		emdf7Model[84] = new ModelRendererTurbo(this, 137, 97, textureX, textureY); // Box 269
		emdf7Model[85] = new ModelRendererTurbo(this, 145, 97, textureX, textureY); // Box 270
		emdf7Model[86] = new ModelRendererTurbo(this, 249, 105, textureX, textureY); // Box 271
		emdf7Model[87] = new ModelRendererTurbo(this, 81, 113, textureX, textureY); // Box 272
		emdf7Model[88] = new ModelRendererTurbo(this, 65, 121, textureX, textureY); // Box 273
		emdf7Model[89] = new ModelRendererTurbo(this, 89, 121, textureX, textureY); // Box 274
		emdf7Model[90] = new ModelRendererTurbo(this, 113, 121, textureX, textureY); // Box 275
		emdf7Model[91] = new ModelRendererTurbo(this, 137, 121, textureX, textureY); // Box 276
		emdf7Model[92] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Box 162
		emdf7Model[93] = new ModelRendererTurbo(this, 113, 73, textureX, textureY); // Box 168
		emdf7Model[94] = new ModelRendererTurbo(this, 209, 89, textureX, textureY); // Box 169
		emdf7Model[95] = new ModelRendererTurbo(this, 225, 113, textureX, textureY); // Box 170
		emdf7Model[96] = new ModelRendererTurbo(this, 161, 121, textureX, textureY); // Box 171
		emdf7Model[97] = new ModelRendererTurbo(this, 209, 121, textureX, textureY); // Box 172
		emdf7Model[98] = new ModelRendererTurbo(this, 225, 121, textureX, textureY); // Box 173
		emdf7Model[99] = new ModelRendererTurbo(this, 129, 129, textureX, textureY); // Box 174
		emdf7Model[100] = new ModelRendererTurbo(this, 145, 129, textureX, textureY); // Box 175
		emdf7Model[101] = new ModelRendererTurbo(this, 161, 129, textureX, textureY); // Box 176
		emdf7Model[102] = new ModelRendererTurbo(this, 209, 129, textureX, textureY); // Box 177
		emdf7Model[103] = new ModelRendererTurbo(this, 225, 129, textureX, textureY); // Box 178
		emdf7Model[104] = new ModelRendererTurbo(this, 241, 129, textureX, textureY); // Box 179
		emdf7Model[105] = new ModelRendererTurbo(this, 1, 137, textureX, textureY); // Box 180
		emdf7Model[106] = new ModelRendererTurbo(this, 17, 137, textureX, textureY); // Box 181
		emdf7Model[107] = new ModelRendererTurbo(this, 33, 137, textureX, textureY); // Box 182
		emdf7Model[108] = new ModelRendererTurbo(this, 49, 137, textureX, textureY); // Box 183
		emdf7Model[109] = new ModelRendererTurbo(this, 81, 137, textureX, textureY); // Box 184
		emdf7Model[110] = new ModelRendererTurbo(this, 113, 137, textureX, textureY); // Box 185
		emdf7Model[111] = new ModelRendererTurbo(this, 145, 137, textureX, textureY); // Box 186
		emdf7Model[112] = new ModelRendererTurbo(this, 177, 137, textureX, textureY); // Box 187
		emdf7Model[113] = new ModelRendererTurbo(this, 249, 49, textureX, textureY); // Box 188
		emdf7Model[114] = new ModelRendererTurbo(this, 145, 113, textureX, textureY); // Box 189
		emdf7Model[115] = new ModelRendererTurbo(this, 209, 137, textureX, textureY); // Box 190
		emdf7Model[116] = new ModelRendererTurbo(this, 177, 57, textureX, textureY); // Box 191
		emdf7Model[117] = new ModelRendererTurbo(this, 217, 57, textureX, textureY); // Box 192
		emdf7Model[118] = new ModelRendererTurbo(this, 249, 89, textureX, textureY); // Box 193
		emdf7Model[119] = new ModelRendererTurbo(this, 217, 137, textureX, textureY); // Box 194
		emdf7Model[120] = new ModelRendererTurbo(this, 73, 113, textureX, textureY); // Box 195
		emdf7Model[121] = new ModelRendererTurbo(this, 225, 137, textureX, textureY); // Box 196
		emdf7Model[122] = new ModelRendererTurbo(this, 233, 137, textureX, textureY); // Box 197
		emdf7Model[123] = new ModelRendererTurbo(this, 249, 113, textureX, textureY); // Box 198
		emdf7Model[124] = new ModelRendererTurbo(this, 241, 137, textureX, textureY); // Box 199
		emdf7Model[125] = new ModelRendererTurbo(this, 249, 137, textureX, textureY); // Box 200
		emdf7Model[126] = new ModelRendererTurbo(this, 145, 121, textureX, textureY); // Box 201
		emdf7Model[127] = new ModelRendererTurbo(this, 1, 145, textureX, textureY); // Box 202
		emdf7Model[128] = new ModelRendererTurbo(this, 9, 145, textureX, textureY); // Box 203
		emdf7Model[129] = new ModelRendererTurbo(this, 113, 145, textureX, textureY); // Box 204
		emdf7Model[130] = new ModelRendererTurbo(this, 1, 169, textureX, textureY); // Box 205
		emdf7Model[131] = new ModelRendererTurbo(this, 9, 145, textureX, textureY); // Box 206
		emdf7Model[132] = new ModelRendererTurbo(this, 97, 145, textureX, textureY); // Box 207
		emdf7Model[133] = new ModelRendererTurbo(this, 113, 145, textureX, textureY); // Box 208
		emdf7Model[134] = new ModelRendererTurbo(this, 201, 145, textureX, textureY); // Box 209
		emdf7Model[135] = new ModelRendererTurbo(this, 121, 169, textureX, textureY); // Box 210
		emdf7Model[136] = new ModelRendererTurbo(this, 217, 145, textureX, textureY); // Box 211
		emdf7Model[137] = new ModelRendererTurbo(this, 233, 145, textureX, textureY); // Box 214
		emdf7Model[138] = new ModelRendererTurbo(this, 217, 153, textureX, textureY); // Box 218
		emdf7Model[139] = new ModelRendererTurbo(this, 9, 153, textureX, textureY); // Box 219
		emdf7Model[140] = new ModelRendererTurbo(this, 97, 153, textureX, textureY); // Box 220
		emdf7Model[141] = new ModelRendererTurbo(this, 1, 177, textureX, textureY); // Box 223
		emdf7Model[142] = new ModelRendererTurbo(this, 201, 153, textureX, textureY); // Box 224
		emdf7Model[143] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 226
		emdf7Model[144] = new ModelRendererTurbo(this, 241, 153, textureX, textureY); // Box 227
		emdf7Model[145] = new ModelRendererTurbo(this, 233, 9, textureX, textureY); // Box 229
		emdf7Model[146] = new ModelRendererTurbo(this, 113, 153, textureX, textureY); // Box 230
		emdf7Model[147] = new ModelRendererTurbo(this, 233, 169, textureX, textureY); // Box 234
		emdf7Model[148] = new ModelRendererTurbo(this, 17, 177, textureX, textureY); // Box 235
		emdf7Model[149] = new ModelRendererTurbo(this, 33, 177, textureX, textureY); // Box 155
		emdf7Model[150] = new ModelRendererTurbo(this, 153, 177, textureX, textureY, "lamp"); // Box 156 lamp
		emdf7Model[151] = new ModelRendererTurbo(this, 177, 177, textureX, textureY, "lamp"); // Box 158 lamp
		emdf7Model[152] = new ModelRendererTurbo(this, 241, 161, textureX, textureY); // Box 157
		emdf7Model[153] = new ModelRendererTurbo(this, 241, 169, textureX, textureY); // Box 158
		emdf7Model[154] = new ModelRendererTurbo(this, 217, 121, textureX, textureY); // Box 160
		emdf7Model[155] = new ModelRendererTurbo(this, 41, 185, textureX, textureY); // Box 163
		emdf7Model[156] = new ModelRendererTurbo(this, 1, 193, textureX, textureY); // Box 164
		emdf7Model[157] = new ModelRendererTurbo(this, 89, 193, textureX, textureY); // Box 165
		emdf7Model[158] = new ModelRendererTurbo(this, 1, 209, textureX, textureY); // Box 167
		emdf7Model[159] = new ModelRendererTurbo(this, 193, 9, textureX, textureY); // Box 161
		emdf7Model[160] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 164
		emdf7Model[161] = new ModelRendererTurbo(this, 201, 177, textureX, textureY); // Box 167
		emdf7Model[162] = new ModelRendererTurbo(this, 177, 97, textureX, textureY); // Box 168
		emdf7Model[163] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 169
		emdf7Model[164] = new ModelRendererTurbo(this, 214, 190, textureX, textureY, "lamp"); // Box 164 lamp
		emdf7Model[165] = new ModelRendererTurbo(this, 214, 190, textureX, textureY, "lamp"); // Box 165 lamp
		emdf7Model[166] = new ModelRendererTurbo(this, 214, 190, textureX, textureY, "lamp"); // Box 166 lamp
		emdf7Model[167] = new ModelRendererTurbo(this, 214, 190, textureX, textureY, "lamp"); // Box 167 lamp
		emdf7Model[168] = new ModelRendererTurbo(this, 214, 190, textureX, textureY, "lamp"); // Box 168 lamp
		emdf7Model[169] = new ModelRendererTurbo(this, 214, 190, textureX, textureY, "lamp"); // Box 169 lamp
		emdf7Model[170] = new ModelRendererTurbo(this, 214, 190, textureX, textureY, "lamp"); // Box 170 lamp
		emdf7Model[171] = new ModelRendererTurbo(this, 214, 190, textureX, textureY, "lamp"); // Box 171 lamp
		emdf7Model[172] = new ModelRendererTurbo(this, 234, 200, textureX, textureY); // Box 173
		emdf7Model[173] = new ModelRendererTurbo(this, 218, 200, textureX, textureY); // Box 176
		emdf7Model[174] = new ModelRendererTurbo(this, 218, 194, textureX, textureY); // Box 177
		emdf7Model[175] = new ModelRendererTurbo(this, 234, 194, textureX, textureY); // Box 178

		emdf7Model[0].addBox(0F, 0F, 0F, 62, 1, 22, 0F); // Box 001
		emdf7Model[0].setRotationPoint(-8F, 1F, -11F);

		emdf7Model[1].addBox(0F, 0F, -11F, 43, 23, 22, 0F); // Box 002
		emdf7Model[1].setRotationPoint(11F, -22F, 0F);

		emdf7Model[2].addBox(0F, 0F, 0F, 11, 16, 2, 0F); // Box 003
		emdf7Model[2].setRotationPoint(-8F, -15F, -11F);

		emdf7Model[3].addShapeBox(0F, 0F, 0F, 1, 5, 2, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 5F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 4F, 0F, 0F); // Box 005
		emdf7Model[3].setRotationPoint(-4F, -20F, 9F);

		emdf7Model[4].addShapeBox(0F, 0F, 0F, 59, 0, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 007
		emdf7Model[4].setRotationPoint(-3F, -24.9F, -3F);

		emdf7Model[5].addBox(0F, 0F, 0F, 14, 2, 2, 0F); // Box 008
		emdf7Model[5].setRotationPoint(-3F, -22F, -11F);

		emdf7Model[6].addBox(0F, 0F, 0F, 2, 5, 1, 0F); // Box 009
		emdf7Model[6].setRotationPoint(1F, -20F, -11F);

		emdf7Model[7].addBox(0F, 0F, 0F, 2, 5, 1, 0F); // Box 010
		emdf7Model[7].setRotationPoint(1F, -20F, 10F);

		emdf7Model[8].addBox(0F, 0F, 0F, 7, 2, 3, 0F); // Box 011
		emdf7Model[8].setRotationPoint(-26F, 2F, -1.5F);

		emdf7Model[9].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 012
		emdf7Model[9].setRotationPoint(-3F, -25.91F, 1F);

		emdf7Model[10].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 013
		emdf7Model[10].setRotationPoint(-2F, -25.91F, -2F);

		emdf7Model[11].addBox(0F, 0F, 0F, 14, 2, 2, 0F); // Box 014
		emdf7Model[11].setRotationPoint(-3F, -22F, 9F);

		emdf7Model[12].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 015
		emdf7Model[12].setRotationPoint(-23F, -9F, -2F);

		emdf7Model[13].addBox(0F, 0F, -11F, 33, 3, 18, 0F); // Box 020
		emdf7Model[13].setRotationPoint(3F, 2F, 2F);

		emdf7Model[14].addShapeBox(0F, 0F, 0F, 1, 5, 2, 0F, -0.15F, -0.05F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, -0.15F, -0.05F, 0F, 0.9F, 0.05F, 0F, -0.15F, -0.2F, 0F, -0.15F, -0.2F, 0F, 0.9F, 0.05F, 0F); // Box 023
		emdf7Model[14].setRotationPoint(-5.85F, -22.7F, -1F);
		emdf7Model[14].rotateAngleZ = -0.26179939F;

		emdf7Model[15].addShapeBox(0F, 0F, -2F, 2, 12, 4, 0F, -0.75F, 0F, 0F, -0.5F, 2F, 0F, -0.5F, 2F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 025
		emdf7Model[15].setRotationPoint(-23F, -10F, 0F);

		emdf7Model[16].addShapeBox(0F, 0F, 0F, 10, 12, 1, 0F, -2.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Box 028
		emdf7Model[16].setRotationPoint(-18F, -10F, -11F);

		emdf7Model[17].addShapeBox(0F, 0F, 0F, 4, 12, 4, 0F, -5F, 0F, 0F, 2F, 0F, 0F, -4.25F, 0F, 4F, -1F, 0F, 0F, -4.25F, 0F, 0F, 2F, 0F, 0F, -5F, 0F, 4F, -0.25F, 0F, 0F); // Box 033
		emdf7Model[17].setRotationPoint(-22F, -10F, -10F);

		emdf7Model[18].addShapeBox(0F, 0F, 0F, 10, 2, 1, 0F, -3.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -2.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 037
		emdf7Model[18].setRotationPoint(-18F, -12F, -11F);

		emdf7Model[19].addShapeBox(0F, 0F, 0F, 4, 2, 4, 0F, -6.5F, 0F, 0F, 3F, 0F, 0F, -2.5F, 0F, 4F, -2.5F, 0F, 0F, -5.5F, 0F, 0F, 2F, 0F, 0F, -3.5F, 0F, 4F, -1.5F, 0F, 0F); // Box 039
		emdf7Model[19].setRotationPoint(-22F, -14F, -10F);

		emdf7Model[20].addShapeBox(0F, 0F, 0F, 10, 2, 1, 0F, -4.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -3.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F); // Box 040
		emdf7Model[20].setRotationPoint(-18F, -14F, -11F);

		emdf7Model[21].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F, -6.5F, 0F, 0F, 3F, 0F, 0F, -2.5F, 0F, 4F, -2.55F, 0F, 0F, -5.5F, 0F, 0F, 2F, 0F, 0F, -3.5F, 0F, 4F, -1.5F, 0F, 0F); // Box 043
		emdf7Model[21].setRotationPoint(-21F, -15F, -10F);

		emdf7Model[22].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F, -4.3F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -2.5F, 0F, 0F, -3.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F); // Box 045
		emdf7Model[22].setRotationPoint(-17F, -15F, -11F);

		emdf7Model[23].addShapeBox(0F, 0F, 0F, 5, 5, 4, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.45F, 0F, 0F, 0.45F, 0F, 2.75F, -4.25F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 4F, -5.25F, 0F); // Box 049
		emdf7Model[23].setRotationPoint(-12F, -17F, -6F);

		emdf7Model[24].addShapeBox(0F, 0F, 0F, 5, 2, 5, 0F, 0F, -0.75F, -3F, 0F, -0.75F, -2.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -1F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 050
		emdf7Model[24].setRotationPoint(-12F, -17F, -11F);

		emdf7Model[25].addBox(0F, 0F, 0F, 4, 0, 4, 0F); // Box 052
		emdf7Model[25].setRotationPoint(-12F, -17.45F, -2F);

		emdf7Model[26].addShapeBox(0F, 0F, 0F, 1, 5, 2, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 4F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 5F, 0F, 0F); // Box 053
		emdf7Model[26].setRotationPoint(-4F, -20F, -11F);

		emdf7Model[27].addBox(0F, 0F, -10F, 1, 16, 20, 0F); // Box 054
		emdf7Model[27].setRotationPoint(-8F, -15F, 0F);

		emdf7Model[28].addShapeBox(0F, 0F, -2F, 3, 2, 4, 0F, -1.95F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -1.95F, -0.25F, 0F, 0.5F, 0F, 0F, 4F, -2.45F, 0F, 4F, -2.45F, 0F, 0.5F, 0F, 0F); // Box 057
		emdf7Model[28].setRotationPoint(-19F, -17F, 0F);

		emdf7Model[29].addBox(0F, 0F, 0F, 8, 15, 0, 0F); // Box 058
		emdf7Model[29].setRotationPoint(3F, -20F, -11F);

		emdf7Model[30].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F, -4.4F, -1F, 0F, 4.25F, -0.75F, 0F, 3F, 0.25F, 0F, -2.95F, -0.25F, 0F, -1.55F, -1F, 0F, 4.25F, -0.5F, 0F, 3F, -1F, 0F, -0.5F, -1F, 0F); // Box 062
		emdf7Model[30].setRotationPoint(-20F, -17F, -6F);

		emdf7Model[31].addBox(0F, 0F, -1.5F, 1, 2, 3, 0F); // Box 065
		emdf7Model[31].setRotationPoint(29F, -26.75F, 0F);

		emdf7Model[32].addBox(0F, 0F, -1.5F, 1, 2, 3, 0F); // Box 066
		emdf7Model[32].setRotationPoint(41F, -26.75F, 0F);

		emdf7Model[33].addBox(0F, 0F, 0F, 0, 7, 9, 0F); // Box 068
		emdf7Model[33].setRotationPoint(-4.5F, -22.25F, -9F);
		emdf7Model[33].rotateAngleX = 0.06981317F;
		emdf7Model[33].rotateAngleY = 0.12217305F;
		emdf7Model[33].rotateAngleZ = -0.43633231F;

		emdf7Model[34].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 072
		emdf7Model[34].setRotationPoint(25F, -25.75F, -2F);

		emdf7Model[35].addShapeBox(0F, -1F, 0F, 3, 3, 2, 0F, -2F, 0F, 0F, 0F, 0.25F, 0F, 0F, -1F, 0F, -2.4F, -1.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 088
		emdf7Model[35].setRotationPoint(-6F, -22F, 9F);

		emdf7Model[36].addShapeBox(0F, 0F, 0F, 2, 2, 9, 0F, -0.35F, -0.7F, 0F, 0F, -0.7F, 0F, -0.25F, 0.85F, 0F, 0F, 1.05F, 0F, 0.35F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.35F, 0F, 0F); // Box 089
		emdf7Model[36].setRotationPoint(-8F, -17F, -10F);

		emdf7Model[37].addShapeBox(0F, 0F, 0F, 2, 2, 9, 0F, 0F, 1.05F, 0F, -0.25F, 0.85F, 0F, 0F, -0.7F, 0F, -0.35F, -0.7F, 0F, 0.35F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.35F, 0F, 0F); // Box 090
		emdf7Model[37].setRotationPoint(-8F, -17F, 1F);

		emdf7Model[38].addShapeBox(0F, 0F, -10F, 43, 1, 18, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 096
		emdf7Model[38].setRotationPoint(11F, -23F, 1F);

		emdf7Model[39].addShapeBox(0F, 0F, 0F, 43, 1, 2, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 3.75F, 0F, 0F, 3.9F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 107
		emdf7Model[39].setRotationPoint(11F, -24.25F, -5F);

		emdf7Model[40].addShapeBox(0F, 0F, 0F, 43, 1, 2, 0F, 0F, -0.65F, -2F, 0F, -0.65F, -2F, 0F, -0.65F, 0F, 0F, -0.65F, 0F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 108
		emdf7Model[40].setRotationPoint(11F, -25.5F, -5F);

		emdf7Model[41].addShapeBox(0F, 0F, 0F, 6, 5, 0, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 111
		emdf7Model[41].setRotationPoint(-5F, -20F, -10.5F);

		emdf7Model[42].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F, -0.65F, 1.25F, 0F, 0F, 1.9F, 0F, 0F, 1.9F, 0F, -0.65F, 1.25F, 0F, 0.75F, -1.6F, 0F, -1.9F, -1.6F, 0F, -1.9F, -1.6F, 0F, 0.75F, -1.6F, 0F); // Box 116
		emdf7Model[42].setRotationPoint(-5F, -23F, -3F);

		emdf7Model[43].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 118
		emdf7Model[43].setRotationPoint(-24F, 5F, -2F);

		emdf7Model[44].addShapeBox(0F, 0F, 0F, 3, 3, 9, 0F, -3F, 0F, 0F, 5F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -4F, 0F, 0F, 2.75F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 119
		emdf7Model[44].setRotationPoint(-23F, 2F, -11F);

		emdf7Model[45].addShapeBox(0F, 0F, 0F, 2, 3, 9, 0F, -4F, 0F, 0F, 3.75F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 1.75F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, 0F); // Box 120
		emdf7Model[45].setRotationPoint(-23F, 5F, -11F);

		emdf7Model[46].addShapeBox(0F, 0F, 0F, 2, 3, 9, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 3.75F, 0F, 0F, -4F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, 1.75F, 0F, 0F, -2F, 0F, 0F); // Box 121
		emdf7Model[46].setRotationPoint(-23F, 5F, 2F);

		emdf7Model[47].addShapeBox(0F, 0F, 0F, 3, 3, 9, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 5F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 2.75F, 0F, 0F, -4F, 0F, 0F); // Box 122
		emdf7Model[47].setRotationPoint(-23F, 2F, 2F);

		emdf7Model[48].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F, -0.2F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, -0.2F, -0.8F, -0.4F); // Box 128
		emdf7Model[48].setRotationPoint(-23.5F, -10F, -3.5F);

		emdf7Model[49].addBox(0F, 0F, 0F, 8, 6, 0, 0F); // Box 130
		emdf7Model[49].setRotationPoint(3F, -5F, -11F);

		emdf7Model[50].addBox(0F, 0F, 0F, 7, 2, 3, 0F); // Box 156
		emdf7Model[50].setRotationPoint(48F, 2F, -1.5F);

		emdf7Model[51].addBox(0F, 0F, 0F, 1, 5, 1, 0F); // Box 168
		emdf7Model[51].setRotationPoint(43F, 2F, -11F);

		emdf7Model[52].addBox(0F, 0F, 0F, 1, 5, 1, 0F); // Box 170
		emdf7Model[52].setRotationPoint(46F, 2F, -11F);

		emdf7Model[53].addBox(0F, 0F, 0F, 11, 16, 2, 0F); // Box 202
		emdf7Model[53].setRotationPoint(-8F, -15F, 9F);

		emdf7Model[54].addShapeBox(0F, 0F, 0F, 4, 12, 4, 0F, -1F, 0F, 0F, -4.25F, 0F, 4F, 2F, 0F, 0F, -5F, 0F, 0F, -0.25F, 0F, 0F, -5F, 0F, 4F, 2F, 0F, 0F, -4.25F, 0F, 0F); // Box 210
		emdf7Model[54].setRotationPoint(-22F, -10F, 6F);

		emdf7Model[55].addShapeBox(0F, 0F, 0F, 10, 12, 1, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.75F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.75F, 0F, 0F); // Box 219
		emdf7Model[55].setRotationPoint(-18F, -10F, 10F);

		emdf7Model[56].addShapeBox(0F, 0F, 0F, 6, 2, 4, 0F, -1.5F, 0F, 0F, -5.5F, 0F, 4F, 0F, 0F, 0F, -5.5F, 0F, 0F, -1F, 0F, 0F, -6.25F, 0F, 4F, 0F, 0F, 0F, -5F, 0F, 0F); // Box 221
		emdf7Model[56].setRotationPoint(-22F, -12F, 6F);

		emdf7Model[57].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F, -1F, 0F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 227
		emdf7Model[57].setRotationPoint(-21.5F, -14F, -2F);

		emdf7Model[58].addShapeBox(0F, 0F, 0F, 1, 12, 2, 0F, 0F, 0F, -0.4F, -0.8F, 0F, -0.4F, -0.8F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -0.8F, 0F, -0.4F, -0.8F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 344
		emdf7Model[58].setRotationPoint(47F, -11F, 10.5F);

		emdf7Model[59].addShapeBox(0F, 0F, 0F, 12, 4, 1, 0F, 0F, -0.5F, 0F, -9F, -0.5F, 0F, -9F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -3F, 0F, -9F, -3F, 0F, -9F, -3F, 0F, 0F, -3F, 0F); // Box 349
		emdf7Model[59].setRotationPoint(5.5F, -4F, 11F);

		emdf7Model[60].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 354
		emdf7Model[60].setRotationPoint(44F, 3.5F, -11.5F);

		emdf7Model[61].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 249
		emdf7Model[61].setRotationPoint(-17F, -13F, -10F);
		emdf7Model[61].rotateAngleY = 0.78539816F;

		emdf7Model[62].addShapeBox(0F, 0F, 0F, 1, 12, 2, 0F, 0F, 0F, -0.4F, -0.8F, 0F, -0.4F, -0.8F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -0.8F, 0F, -0.4F, -0.8F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 221
		emdf7Model[62].setRotationPoint(42.75F, -11F, 10.5F);

		emdf7Model[63].addShapeBox(0F, 0F, 0F, 1, 12, 2, 0F, 0F, 0F, -0.4F, -0.8F, 0F, -0.4F, -0.8F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -0.8F, 0F, -0.4F, -0.8F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 222
		emdf7Model[63].setRotationPoint(42.75F, -11F, -12.5F);

		emdf7Model[64].addShapeBox(0F, 0F, 0F, 1, 12, 2, 0F, 0F, 0F, -0.4F, -0.8F, 0F, -0.4F, -0.8F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -0.8F, 0F, -0.4F, -0.8F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 223
		emdf7Model[64].setRotationPoint(47F, -11F, -12.5F);

		emdf7Model[65].addShapeBox(0F, 0F, 0F, 1, 8, 2, 0F, 0F, 0F, -0.4F, -0.8F, 0F, -0.4F, -0.8F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -0.8F, 0F, -0.4F, -0.8F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 224
		emdf7Model[65].setRotationPoint(53.5F, -7F, -12.5F);

		emdf7Model[66].addShapeBox(0F, 0F, 0F, 1, 8, 2, 0F, 0F, 0F, -0.4F, -0.8F, 0F, -0.4F, -0.8F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -0.8F, 0F, -0.4F, -0.8F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 225
		emdf7Model[66].setRotationPoint(51.5F, -7F, -12.5F);

		emdf7Model[67].addShapeBox(0F, 0F, 0F, 1, 8, 2, 0F, 0F, 0F, -0.4F, -0.8F, 0F, -0.4F, -0.8F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -0.8F, 0F, -0.4F, -0.8F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 226
		emdf7Model[67].setRotationPoint(51.5F, -7F, 10.5F);

		emdf7Model[68].addShapeBox(0F, 0F, 0F, 1, 8, 2, 0F, 0F, 0F, -0.4F, -0.8F, 0F, -0.4F, -0.8F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -0.8F, 0F, -0.4F, -0.8F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 227
		emdf7Model[68].setRotationPoint(53.5F, -7F, 10.5F);

		emdf7Model[69].addShapeBox(0F, 0F, 0F, 1, 22, 2, 0F, 0F, 0F, -0.4F, -0.8F, 0F, -0.4F, -0.8F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -0.8F, 0F, -0.4F, -0.8F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 228
		emdf7Model[69].setRotationPoint(2.5F, -21F, 10.5F);

		emdf7Model[70].addShapeBox(0F, 0F, 0F, 1, 22, 2, 0F, 0F, 0F, -0.4F, -0.8F, 0F, -0.4F, -0.8F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -0.8F, 0F, -0.4F, -0.8F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 229
		emdf7Model[70].setRotationPoint(11.25F, -21F, 10.5F);

		emdf7Model[71].addShapeBox(0F, 0F, 0F, 1, 22, 2, 0F, 0F, 0F, -0.4F, -0.8F, 0F, -0.4F, -0.8F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -0.8F, 0F, -0.4F, -0.8F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 230
		emdf7Model[71].setRotationPoint(11.25F, -21F, -12.5F);

		emdf7Model[72].addShapeBox(0F, 0F, 0F, 1, 22, 2, 0F, 0F, 0F, -0.4F, -0.8F, 0F, -0.4F, -0.8F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -0.8F, 0F, -0.4F, -0.8F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 231
		emdf7Model[72].setRotationPoint(2.5F, -21F, -12.5F);

		emdf7Model[73].addShapeBox(0F, 0F, 0F, 6, 2, 4, 0F, -5.5F, 0F, 0F, 0F, 0F, 0F, -5.5F, 0F, 4F, -1.5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -6.25F, 0F, 4F, -1F, 0F, 0F); // Box 232
		emdf7Model[73].setRotationPoint(-22F, -12F, -10F);

		emdf7Model[74].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F, -0.2F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, -0.2F, -0.8F, -0.4F); // Box 234
		emdf7Model[74].setRotationPoint(-23.5F, -10F, 2.5F);

		emdf7Model[75].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 235
		emdf7Model[75].setRotationPoint(-20F, -13F, 7F);
		emdf7Model[75].rotateAngleY = -0.78539816F;

		emdf7Model[76].addShapeBox(0F, 0F, 0F, 10, 2, 1, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.25F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.75F, 0F, 0F); // Box 255
		emdf7Model[76].setRotationPoint(-18F, -12F, 10F);

		emdf7Model[77].addShapeBox(0F, 0F, 0F, 4, 2, 4, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 4F, 3F, 0F, 0F, -6.5F, 0F, 0F, -1.5F, 0F, 0F, -3.5F, 0F, 4F, 2F, 0F, 0F, -5.5F, 0F, 0F); // Box 256
		emdf7Model[77].setRotationPoint(-22F, -14F, 6F);

		emdf7Model[78].addShapeBox(0F, 0F, 0F, 10, 2, 1, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4.25F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.25F, 0F, 0F); // Box 257
		emdf7Model[78].setRotationPoint(-18F, -14F, 10F);

		emdf7Model[79].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F, -2.55F, 0F, 0F, -2.5F, 0F, 4F, 3F, 0F, 0F, -6.5F, 0F, 0F, -1.5F, 0F, 0F, -3.5F, 0F, 4F, 2F, 0F, 0F, -5.5F, 0F, 0F); // Box 258
		emdf7Model[79].setRotationPoint(-21F, -15F, 6F);

		emdf7Model[80].addShapeBox(0F, 0F, 0F, 5, 5, 4, 0F, 0F, 0.45F, 0F, 0F, 0.45F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 4F, -5.25F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 2.75F, -4.25F, 0F); // Box 259
		emdf7Model[80].setRotationPoint(-12F, -17F, 2F);

		emdf7Model[81].addShapeBox(0F, 0F, 0F, 4, 2, 4, 0F, -0.4F, 0F, 0F, -2.75F, 0.25F, 0F, -0.9F, -0.7F, 0F, -3.05F, -0.7F, 0F, 2.45F, -1F, 0F, -3F, -1.25F, 0F, -0.7F, -1F, 0.75F, -1.5F, -1F, 0F); // Box 262
		emdf7Model[81].setRotationPoint(-16F, -16F, 6F);

		emdf7Model[82].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -4.3F, 0F, -0.25F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.25F, 0F, 0F); // Box 264
		emdf7Model[82].setRotationPoint(-17F, -15F, 10F);

		emdf7Model[83].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F, -0.2F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, -0.2F, -0.8F, -0.4F); // Box 267
		emdf7Model[83].setRotationPoint(-22F, -2.5F, 8F);
		emdf7Model[83].rotateAngleX = 1.57079633F;
		emdf7Model[83].rotateAngleY = -0.78539816F;

		emdf7Model[84].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F, -0.2F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, -0.2F, -0.8F, -0.4F); // Box 269
		emdf7Model[84].setRotationPoint(-19.5F, -2.5F, -10.5F);
		emdf7Model[84].rotateAngleX = 1.57079633F;
		emdf7Model[84].rotateAngleY = 0.78539816F;

		emdf7Model[85].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 270
		emdf7Model[85].setRotationPoint(-23F, -9F, 0F);

		emdf7Model[86].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 271
		emdf7Model[86].setRotationPoint(-23F, -7F, -2F);

		emdf7Model[87].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 272
		emdf7Model[87].setRotationPoint(-23F, -7F, 0F);

		emdf7Model[88].addShapeBox(0F, 0F, 0F, 6, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 273
		emdf7Model[88].setRotationPoint(-21F, -15.25F, -2F);

		emdf7Model[89].addShapeBox(0F, 0F, 0F, 6, 2, 2, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 274
		emdf7Model[89].setRotationPoint(-21F, -17.25F, -2F);

		emdf7Model[90].addShapeBox(0F, 0F, 0F, 6, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 275
		emdf7Model[90].setRotationPoint(-21F, -17.25F, 0F);

		emdf7Model[91].addShapeBox(0F, 0F, 0F, 6, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 276
		emdf7Model[91].setRotationPoint(-21F, -15.25F, 0F);

		emdf7Model[92].addShapeBox(0F, 0F, 0F, 58, 2, 2, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 2F, -0.5F, -0.25F, 2F, 1F, -1.9F, 2F, 0F, -1.9F, 2F); // Box 162
		emdf7Model[92].setRotationPoint(-3F, -25F, -7F);

		emdf7Model[93].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 0F); // Box 168
		emdf7Model[93].setRotationPoint(25F, -25.75F, 0F);

		emdf7Model[94].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 169
		emdf7Model[94].setRotationPoint(23F, -25.75F, -2F);

		emdf7Model[95].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F); // Box 170
		emdf7Model[95].setRotationPoint(23F, -25.75F, 0F);

		emdf7Model[96].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F); // Box 171
		emdf7Model[96].setRotationPoint(31F, -25.75F, 0F);

		emdf7Model[97].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 172
		emdf7Model[97].setRotationPoint(31F, -25.75F, -2F);

		emdf7Model[98].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 0F); // Box 173
		emdf7Model[98].setRotationPoint(33F, -25.75F, 0F);

		emdf7Model[99].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 174
		emdf7Model[99].setRotationPoint(33F, -25.75F, -2F);

		emdf7Model[100].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F); // Box 175
		emdf7Model[100].setRotationPoint(36F, -25.75F, 0F);

		emdf7Model[101].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 176
		emdf7Model[101].setRotationPoint(36F, -25.75F, -2F);

		emdf7Model[102].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 0F); // Box 177
		emdf7Model[102].setRotationPoint(38F, -25.75F, 0F);

		emdf7Model[103].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 178
		emdf7Model[103].setRotationPoint(38F, -25.75F, -2F);

		emdf7Model[104].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F); // Box 179
		emdf7Model[104].setRotationPoint(44F, -25.75F, 0F);

		emdf7Model[105].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 180
		emdf7Model[105].setRotationPoint(44F, -25.75F, -2F);

		emdf7Model[106].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 0F); // Box 181
		emdf7Model[106].setRotationPoint(46F, -25.75F, 0F);

		emdf7Model[107].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 182
		emdf7Model[107].setRotationPoint(46F, -25.75F, -2F);

		emdf7Model[108].addShapeBox(0F, 0F, 0F, 12, 4, 1, 0F, 0F, -0.5F, 0F, -9F, -0.5F, 0F, -9F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -3F, 0F, -9F, -3F, 0F, -9F, -3F, 0F, 0F, -3F, 0F); // Box 183
		emdf7Model[108].setRotationPoint(5.5F, -1F, 11F);

		emdf7Model[109].addShapeBox(0F, 0F, 0F, 12, 4, 1, 0F, 0F, -0.5F, 0F, -9F, -0.5F, 0F, -9F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -3F, 0F, -9F, -3F, 0F, -9F, -3F, 0F, 0F, -3F, 0F); // Box 184
		emdf7Model[109].setRotationPoint(5.5F, -1F, -12F);

		emdf7Model[110].addShapeBox(0F, 0F, 0F, 12, 4, 1, 0F, 0F, -0.5F, 0F, -9F, -0.5F, 0F, -9F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -3F, 0F, -9F, -3F, 0F, -9F, -3F, 0F, 0F, -3F, 0F); // Box 185
		emdf7Model[110].setRotationPoint(5.5F, -4F, -12F);

		emdf7Model[111].addShapeBox(0F, 0F, 0F, 12, 4, 1, 0F, 0F, -0.5F, 0F, -9F, -0.5F, 0F, -9F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -3F, 0F, -9F, -3F, 0F, -9F, -3F, 0F, 0F, -3F, 0F); // Box 186
		emdf7Model[111].setRotationPoint(43.5F, 0F, 11F);

		emdf7Model[112].addShapeBox(0F, 0F, 0F, 12, 4, 1, 0F, 0F, -0.5F, 0F, -9F, -0.5F, 0F, -9F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -3F, 0F, -9F, -3F, 0F, -9F, -3F, 0F, 0F, -3F, 0F); // Box 187
		emdf7Model[112].setRotationPoint(43.5F, 0F, -12F);

		emdf7Model[113].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 188
		emdf7Model[113].setRotationPoint(44F, 6F, -11.5F);

		emdf7Model[114].addBox(0F, 0F, 0F, 1, 5, 1, 0F); // Box 189
		emdf7Model[114].setRotationPoint(43F, 2F, 10F);

		emdf7Model[115].addBox(0F, 0F, 0F, 1, 5, 1, 0F); // Box 190
		emdf7Model[115].setRotationPoint(46F, 2F, 10F);

		emdf7Model[116].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 191
		emdf7Model[116].setRotationPoint(44F, 3.5F, 10.5F);

		emdf7Model[117].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 192
		emdf7Model[117].setRotationPoint(44F, 6F, 10.5F);

		emdf7Model[118].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 193
		emdf7Model[118].setRotationPoint(6F, 3.5F, 10.5F);

		emdf7Model[119].addBox(0F, 0F, 0F, 1, 5, 1, 0F); // Box 194
		emdf7Model[119].setRotationPoint(5F, 2F, 10F);

		emdf7Model[120].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 195
		emdf7Model[120].setRotationPoint(6F, 6F, 10.5F);

		emdf7Model[121].addBox(0F, 0F, 0F, 1, 5, 1, 0F); // Box 196
		emdf7Model[121].setRotationPoint(8F, 2F, 10F);

		emdf7Model[122].addBox(0F, 0F, 0F, 1, 5, 1, 0F); // Box 197
		emdf7Model[122].setRotationPoint(8F, 2F, -11F);

		emdf7Model[123].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 198
		emdf7Model[123].setRotationPoint(6F, 3.5F, -11.5F);

		emdf7Model[124].addBox(0F, 0F, 0F, 1, 5, 1, 0F); // Box 199
		emdf7Model[124].setRotationPoint(5F, 2F, -11F);

		emdf7Model[125].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 200
		emdf7Model[125].setRotationPoint(6F, 6F, -11.5F);

		emdf7Model[126].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 201
		emdf7Model[126].setRotationPoint(54F, 0F, -6F);

		emdf7Model[127].addShapeBox(0F, 0F, 0F, 1, 18, 2, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 202
		emdf7Model[127].setRotationPoint(54F, -18F, 4F);

		emdf7Model[128].addShapeBox(0F, 0F, -11F, 33, 1, 18, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 203
		emdf7Model[128].setRotationPoint(3F, 5F, 2F);

		emdf7Model[129].addShapeBox(0F, 0F, -11F, 33, 1, 17, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 204
		emdf7Model[129].setRotationPoint(3F, 6F, 2.5F);

		emdf7Model[130].addShapeBox(0F, 0F, 0F, 57, 1, 2, 0F, 0F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.25F, -0.4F, -1F, 0F, -0.4F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 205
		emdf7Model[130].setRotationPoint(-3F, -23F, 9F);

		emdf7Model[131].addShapeBox(0F, -1F, 0F, 3, 3, 2, 0F, -2.4F, -1.25F, 0F, 0F, -1F, 0F, 0F, 0.25F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 206
		emdf7Model[131].setRotationPoint(-6F, -22F, -11F);

		emdf7Model[132].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, -1F, 0F, 0F, 0F, 0.25F, 0F, 0F, 1F, 0F, -0.75F, 0.5F, 0F, -0.15F, 0.3F, 0F, -1.35F, 0.3F, 0F, -1.5F, -0.15F, 0F, 0.3F, -0.15F, 0F); // Box 207
		emdf7Model[132].setRotationPoint(-5F, -23F, -9F);

		emdf7Model[133].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, -0.75F, 0.5F, 0F, 0F, 1F, 0F, 0F, 1.5F, 0F, -0.65F, 0.9F, 0F, 0.3F, -1.15F, 0F, -1.5F, -1.15F, 0F, -1.7F, -1.4F, 0F, 0.55F, -1.45F, 0F); // Box 208
		emdf7Model[133].setRotationPoint(-5F, -23F, -7F);

		emdf7Model[134].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, -0.65F, 0.9F, 0F, 0F, 1.5F, 0F, 0F, 1.9F, 0F, -0.65F, 1.25F, 0F, 0.55F, -1.45F, 0F, -1.7F, -1.4F, 0F, -1.9F, -1.6F, 0F, 0.75F, -1.6F, 0F); // Box 209
		emdf7Model[134].setRotationPoint(-5F, -23F, -5F);

		emdf7Model[135].addShapeBox(0F, 0F, 0F, 57, 1, 2, 0F, 0F, -0.4F, -1F, 0.25F, -0.4F, -1F, 0.5F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 210
		emdf7Model[135].setRotationPoint(-3F, -23F, -11F);

		emdf7Model[136].addShapeBox(0F, 0F, 0F, 6, 5, 0, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 211
		emdf7Model[136].setRotationPoint(-5F, -20F, 10.5F);

		emdf7Model[137].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F, -0.2F, 0F, 0F, -0.05F, 0.25F, 0F, -0.05F, 0.25F, 0F, -0.2F, 0F, 0F, -0.75F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.75F, 0F, 0F); // Box 214
		emdf7Model[137].setRotationPoint(-8.2F, -18.1F, -1F);
		emdf7Model[137].rotateAngleZ = -0.26179939F;

		emdf7Model[138].addBox(0F, 0F, 0F, 8, 15, 0, 0F); // Box 218
		emdf7Model[138].setRotationPoint(3F, -20F, 11F);

		emdf7Model[139].addBox(0F, 0F, 0F, 8, 6, 0, 0F); // Box 219
		emdf7Model[139].setRotationPoint(3F, -5F, 11F);

		emdf7Model[140].addShapeBox(0F, 0F, 0F, 5, 2, 5, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, -2.5F, 0F, -0.75F, -3F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, -0.25F, -1F, 0F, -0.25F); // Box 220
		emdf7Model[140].setRotationPoint(-12F, -17F, 6F);

		emdf7Model[141].addShapeBox(0F, 0F, 0F, 4, 2, 4, 0F, -3.05F, -0.7F, 0F, -0.9F, -0.7F, 0F, -2.75F, 0.25F, 0F, -0.4F, 0F, 0F, -1.5F, -1F, 0F, -0.7F, -1F, 0.75F, -3F, -1.25F, 0F, 2.45F, -1F, 0F); // Box 223
		emdf7Model[141].setRotationPoint(-16F, -16F, -10F);

		emdf7Model[142].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F, 0.75F, 0.25F, 0F, 0F, 0.75F, 0F, 0F, 0.25F, -2F, -0.05F, -0.15F, -2.3F, -1.25F, 0F, -3.75F, 1F, 0F, -3.75F, 0.7F, -0.35F, 0F, -1.1F, -0.3F, 0F); // Box 224
		emdf7Model[142].setRotationPoint(-14F, -16F, 6F);

		emdf7Model[143].addShapeBox(0F, 0F, 0F, 2, 0, 1, 0F, -0.1F, 0.3F, 0F, -0.3F, 0.35F, 0F, 0F, 0F, -0.25F, -0.3F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.3F, 0F, -0.25F); // Box 226
		emdf7Model[143].setRotationPoint(-13F, -15F, 10F);

		emdf7Model[144].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F, -0.05F, -0.15F, -2.3F, 0F, 0.25F, -2F, 0F, 0.75F, 0F, 0.75F, 0.25F, 0F, -1.1F, -0.3F, 0F, 0.7F, -0.35F, 0F, 1F, 0F, -3.75F, -1.25F, 0F, -3.75F); // Box 227
		emdf7Model[144].setRotationPoint(-14F, -16F, -10F);

		emdf7Model[145].addShapeBox(0F, 0F, 0F, 2, 0, 1, 0F, -0.3F, 0F, -0.25F, 0F, 0F, -0.25F, -0.3F, 0.35F, 0F, -0.1F, 0.3F, 0F, -0.3F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 229
		emdf7Model[145].setRotationPoint(-13F, -15F, -11F);

		emdf7Model[146].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, -0.75F, 0.5F, 0F, 0F, 1F, 0F, 0F, 0.25F, 0F, -1F, 0F, 0F, 0.3F, -0.15F, 0F, -1.5F, -0.15F, 0F, -1.35F, 0.3F, 0F, -0.15F, 0.3F, 0F); // Box 230
		emdf7Model[146].setRotationPoint(-5F, -23F, 7F);

		emdf7Model[147].addBox(0F, 0F, 0F, 0, 7, 9, 0F); // Box 234
		emdf7Model[147].setRotationPoint(-5.15F, -23.25F, 0.1F);
		emdf7Model[147].rotateAngleX = -0.06981317F;
		emdf7Model[147].rotateAngleY = -0.13962634F;
		emdf7Model[147].rotateAngleZ = -0.43633231F;

		emdf7Model[148].addBox(0F, 0F, 0F, 1, 6, 8, 0F); // Box 235
		emdf7Model[148].setRotationPoint(-7F, -15F, -4F);

		emdf7Model[149].addShapeBox(0F, 0F, 0F, 58, 2, 2, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1.9F, 2F, 1F, -1.9F, 2F, -0.5F, -0.25F, 2F, 0F, -0.25F, 2F); // Box 155
		emdf7Model[149].setRotationPoint(-3F, -25F, 5F);

		emdf7Model[150].addShapeBox(0F, 0F, 0F, 0, 6, 8, 0F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F, -2F); // Box 156 lamp
		emdf7Model[150].setRotationPoint(-15.61F, -15F, -11.4F);
		emdf7Model[150].rotateAngleY = 0.78539816F;

		emdf7Model[151].addShapeBox(0F, 0F, 0F, 0, 6, 8, 0F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F, -2F); // Box 158 lamp
		emdf7Model[151].setRotationPoint(-21.41F, -15F, 5.6F);
		emdf7Model[151].rotateAngleY = -0.78539816F;

		emdf7Model[152].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, -0.65F, 0.9F, 0F, 0F, 1.5F, 0F, 0F, 1F, 0F, -0.75F, 0.5F, 0F, 0.55F, -1.45F, 0F, -1.7F, -1.4F, 0F, -1.5F, -1.15F, 0F, 0.3F, -1.15F, 0F); // Box 157
		emdf7Model[152].setRotationPoint(-5F, -23F, 5F);

		emdf7Model[153].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, -0.65F, 1.25F, 0F, 0F, 1.9F, 0F, 0F, 1.5F, 0F, -0.65F, 0.9F, 0F, 0.75F, -1.6F, 0F, -1.9F, -1.6F, 0F, -1.7F, -1.4F, 0F, 0.55F, -1.45F, 0F); // Box 158
		emdf7Model[153].setRotationPoint(-5F, -23F, 3F);

		emdf7Model[154].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F, -2.95F, -0.25F, 0F, 3F, 0.25F, 0F, 4.25F, -0.75F, 0F, -4.4F, -1F, 0F, -0.5F, -1F, 0F, 3F, -1F, 0F, 4.25F, -0.5F, 0F, -1.55F, -1F, 0F); // Box 160
		emdf7Model[154].setRotationPoint(-20F, -17F, 2F);

		emdf7Model[155].addShapeBox(0F, 0F, 0F, 43, 1, 2, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 3.9F, 0F, 0F, 3.75F); // Box 163
		emdf7Model[155].setRotationPoint(11F, -24.25F, 3F);

		emdf7Model[156].addShapeBox(0F, 0F, 0F, 43, 1, 2, 0F, 0F, -0.65F, 0F, 0F, -0.65F, 0F, 0F, -0.65F, -2F, 0F, -0.65F, -2F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F); // Box 164
		emdf7Model[156].setRotationPoint(11F, -25.5F, 3F);

		emdf7Model[157].addBox(0F, 0F, -10F, 43, 1, 10, 0F); // Box 165
		emdf7Model[157].setRotationPoint(11F, -24.25F, 5F);

		emdf7Model[158].addShapeBox(0F, 0F, 0F, 43, 1, 6, 0F, 0F, -0.65F, 0F, 0F, -0.65F, 0F, 0F, -0.65F, 0F, 0F, -0.65F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 167
		emdf7Model[158].setRotationPoint(11F, -25.5F, -3F);

		emdf7Model[159].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 161
		emdf7Model[159].setRotationPoint(54F, -20F, 1F);

		emdf7Model[160].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 164
		emdf7Model[160].setRotationPoint(54F, -21F, 0F);

		emdf7Model[161].addShapeBox(0F, 0F, 0F, 1, 18, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 167
		emdf7Model[161].setRotationPoint(54F, -18F, -6F);

		emdf7Model[162].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 168
		emdf7Model[162].setRotationPoint(54F, -20F, -6F);

		emdf7Model[163].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F); // Box 169
		emdf7Model[163].setRotationPoint(54F, -21F, -1F);

		emdf7Model[164].addShapeBox(0F, 0F, 0F, 0, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 164 lamp
		emdf7Model[164].setRotationPoint(-21.01F, -17.25F, 0F);

		emdf7Model[165].addShapeBox(0F, 0F, 0F, 0, 2, 2, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 165 lamp
		emdf7Model[165].setRotationPoint(-21.01F, -17.25F, -2F);

		emdf7Model[166].addShapeBox(0F, 0F, 0F, 0, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 166 lamp
		emdf7Model[166].setRotationPoint(-21.01F, -15.25F, -2F);

		emdf7Model[167].addShapeBox(0F, 0F, 0F, 0, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 167 lamp
		emdf7Model[167].setRotationPoint(-21.01F, -15.25F, 0F);

		emdf7Model[168].addShapeBox(0F, 0F, 0F, 0, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 168 lamp
		emdf7Model[168].setRotationPoint(-23.01F, -7F, 0F);

		emdf7Model[169].addShapeBox(0F, 0F, 0F, 0, 2, 2, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 169 lamp
		emdf7Model[169].setRotationPoint(-23.01F, -9F, -2F);

		emdf7Model[170].addShapeBox(0F, 0F, 0F, 0, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 170 lamp
		emdf7Model[170].setRotationPoint(-23.01F, -7F, -2F);

		emdf7Model[171].addShapeBox(0F, 0F, 0F, 0, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 171 lamp
		emdf7Model[171].setRotationPoint(-23.01F, -9F, 0F);

		emdf7Model[172].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F, 0F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 173
		emdf7Model[172].setRotationPoint(15F, -25.75F, -3F);

		emdf7Model[173].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, 0F, 0F); // Box 176
		emdf7Model[173].setRotationPoint(15F, -25.75F, 0F);

		emdf7Model[174].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, -0.75F); // Box 177
		emdf7Model[174].setRotationPoint(12F, -25.75F, 0F);

		emdf7Model[175].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F, -0.75F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 178
		emdf7Model[175].setRotationPoint(12F, -25.75F, -3F);
		fixRotation(emdf7Model, false, true, true);

	}

    private ModelBloombergTrucks fronttrucks = new ModelBloombergTrucks();
    private ModelBloombergTrucks backtrucks = new ModelBloombergTrucks();
    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
    {
		for (int i = 0; i < 176; i++)
        {
        	if (emdf7Model[i].boxName != null && emdf7Model[i].boxName.equals("lamp")) {
				Minecraft.getMinecraft().entityRenderer.disableLightmap(1D);
				emdf7Model[i].render(f5);
				Minecraft.getMinecraft().entityRenderer.enableLightmap(1D);
			} else {
				emdf7Model[i].render(f5);
			}
        }

		Tessellator.bindTexture(new ResourceLocation(Info.modID, "textures/trains/Blomberg_b_trucks.png"));
        GL11.glPushMatrix();
		GL11.glTranslated(2.9, 0, 0);
        GL11.glScalef(0.9F, 0.9F, 0.9F);
        fronttrucks.render(entity,f,f1,f2,f3,f4,f5);
        GL11.glPopMatrix();
        GL11.glPushMatrix();
		GL11.glTranslated(-0.4, 0, 0);
		GL11.glScalef(0.9F, 0.9F, 0.9F);
        backtrucks.render(entity,f,f1,f2,f3,f4,f5);
        GL11.glPopMatrix();
    }

    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
    {
    }

    public ModelRendererTurbo emdf7Model[];
}