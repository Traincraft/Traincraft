//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2017 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator:
// Created on:13.09.2017 - 13:26:59
// Last changed on: 13.09.2017 - 13:26:59

package train.client.render.models;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import train.client.tmt.ModelBase;
import train.client.tmt.ModelRendererTurbo;
import train.client.tmt.Tessellator;
import train.common.library.Info;

public class BR185_EngineModel extends ModelBase
{
	int textureX = 256;
	int textureY = 256;
	private BR101_BogieModel fronttrucks = new BR101_BogieModel();
	private BR101_BogieModel backtrucks = new BR101_BogieModel();

	public BR185_EngineModel()
	{
		br185_EngineModel = new ModelRendererTurbo[167];
		br185_EngineModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 3
		br185_EngineModel[1] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 10
		br185_EngineModel[2] = new ModelRendererTurbo(this, 137, 33, textureX, textureY); // Box 14
		br185_EngineModel[3] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 96
		br185_EngineModel[4] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 99
		br185_EngineModel[5] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 101
		br185_EngineModel[6] = new ModelRendererTurbo(this, 201, 33, textureX, textureY); // Box 104
		br185_EngineModel[7] = new ModelRendererTurbo(this, 137, 9, textureX, textureY); // Box 106
		br185_EngineModel[8] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 108
		br185_EngineModel[9] = new ModelRendererTurbo(this, 49, 49, textureX, textureY); // Box 119
		br185_EngineModel[10] = new ModelRendererTurbo(this, 153, 9, textureX, textureY); // Box 124
		br185_EngineModel[11] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 125
		br185_EngineModel[12] = new ModelRendererTurbo(this, 161, 17, textureX, textureY); // Box 126
		br185_EngineModel[13] = new ModelRendererTurbo(this, 217, 17, textureX, textureY); // Box 127
		br185_EngineModel[14] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 128
		br185_EngineModel[15] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 129
		br185_EngineModel[16] = new ModelRendererTurbo(this, 241, 9, textureX, textureY); // Box 130
		br185_EngineModel[17] = new ModelRendererTurbo(this, 241, 17, textureX, textureY); // Box 131
		br185_EngineModel[18] = new ModelRendererTurbo(this, 177, 9, textureX, textureY); // Box 132
		br185_EngineModel[19] = new ModelRendererTurbo(this, 201, 33, textureX, textureY); // Box 135
		br185_EngineModel[20] = new ModelRendererTurbo(this, 225, 33, textureX, textureY); // Box 136
		br185_EngineModel[21] = new ModelRendererTurbo(this, 241, 25, textureX, textureY); // Box 137
		br185_EngineModel[22] = new ModelRendererTurbo(this, 137, 9, textureX, textureY); // Box 138
		br185_EngineModel[23] = new ModelRendererTurbo(this, 201, 41, textureX, textureY); // Box 139
		br185_EngineModel[24] = new ModelRendererTurbo(this, 225, 41, textureX, textureY); // Box 140
		br185_EngineModel[25] = new ModelRendererTurbo(this, 241, 41, textureX, textureY); // Box 141
		br185_EngineModel[26] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 160
		br185_EngineModel[27] = new ModelRendererTurbo(this, 25, 49, textureX, textureY); // Box 161
		br185_EngineModel[28] = new ModelRendererTurbo(this, 49, 49, textureX, textureY); // Box 164
		br185_EngineModel[29] = new ModelRendererTurbo(this, 89, 49, textureX, textureY); // Box 169
		br185_EngineModel[30] = new ModelRendererTurbo(this, 113, 49, textureX, textureY); // Box 170
		br185_EngineModel[31] = new ModelRendererTurbo(this, 113, 57, textureX, textureY); // Box 184
		br185_EngineModel[32] = new ModelRendererTurbo(this, 137, 49, textureX, textureY); // Box 190
		br185_EngineModel[33] = new ModelRendererTurbo(this, 153, 49, textureX, textureY); // Box 191
		br185_EngineModel[34] = new ModelRendererTurbo(this, 145, 49, textureX, textureY); // Box 192
		br185_EngineModel[35] = new ModelRendererTurbo(this, 201, 49, textureX, textureY); // Box 193
		br185_EngineModel[36] = new ModelRendererTurbo(this, 121, 65, textureX, textureY); // Box 194
		br185_EngineModel[37] = new ModelRendererTurbo(this, 177, 65, textureX, textureY); // Box 195
		br185_EngineModel[38] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 196
		br185_EngineModel[39] = new ModelRendererTurbo(this, 65, 73, textureX, textureY); // Box 214
		br185_EngineModel[40] = new ModelRendererTurbo(this, 217, 57, textureX, textureY); // Box 216
		br185_EngineModel[41] = new ModelRendererTurbo(this, 113, 97, textureX, textureY); // Box 218
		br185_EngineModel[42] = new ModelRendererTurbo(this, 225, 49, textureX, textureY); // Box 219
		br185_EngineModel[43] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 220
		br185_EngineModel[44] = new ModelRendererTurbo(this, 49, 57, textureX, textureY); // Box 221
		br185_EngineModel[45] = new ModelRendererTurbo(this, 9, 57, textureX, textureY); // Box 222
		br185_EngineModel[46] = new ModelRendererTurbo(this, 233, 25, textureX, textureY); // Box 225
		br185_EngineModel[47] = new ModelRendererTurbo(this, 249, 49, textureX, textureY); // Box 230
		br185_EngineModel[48] = new ModelRendererTurbo(this, 153, 65, textureX, textureY); // Box 234
		br185_EngineModel[49] = new ModelRendererTurbo(this, 209, 73, textureX, textureY); // Box 243
		br185_EngineModel[50] = new ModelRendererTurbo(this, 249, 33, textureX, textureY); // Box 256
		br185_EngineModel[51] = new ModelRendererTurbo(this, 89, 57, textureX, textureY); // Box 258
		br185_EngineModel[52] = new ModelRendererTurbo(this, 97, 57, textureX, textureY); // Box 260
		br185_EngineModel[53] = new ModelRendererTurbo(this, 233, 57, textureX, textureY); // Box 261
		br185_EngineModel[54] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 263
		br185_EngineModel[55] = new ModelRendererTurbo(this, 241, 57, textureX, textureY); // Box 264
		br185_EngineModel[56] = new ModelRendererTurbo(this, 137, 65, textureX, textureY); // Box 265
		br185_EngineModel[57] = new ModelRendererTurbo(this, 25, 65, textureX, textureY); // Box 266
		br185_EngineModel[58] = new ModelRendererTurbo(this, 153, 65, textureX, textureY); // Box 267
		br185_EngineModel[59] = new ModelRendererTurbo(this, 169, 65, textureX, textureY); // Box 269
		br185_EngineModel[60] = new ModelRendererTurbo(this, 41, 65, textureX, textureY); // Box 270
		br185_EngineModel[61] = new ModelRendererTurbo(this, 177, 65, textureX, textureY); // Box 272
		br185_EngineModel[62] = new ModelRendererTurbo(this, 41, 73, textureX, textureY); // Box 277
		br185_EngineModel[63] = new ModelRendererTurbo(this, 89, 57, textureX, textureY); // Box 279
		br185_EngineModel[64] = new ModelRendererTurbo(this, 113, 73, textureX, textureY); // Box 282
		br185_EngineModel[65] = new ModelRendererTurbo(this, 161, 97, textureX, textureY); // Box 283
		br185_EngineModel[66] = new ModelRendererTurbo(this, 193, 97, textureX, textureY); // Box 284
		br185_EngineModel[67] = new ModelRendererTurbo(this, 153, 81, textureX, textureY); // Box 285
		br185_EngineModel[68] = new ModelRendererTurbo(this, 233, 57, textureX, textureY); // Box 286
		br185_EngineModel[69] = new ModelRendererTurbo(this, 41, 89, textureX, textureY); // Box 288
		br185_EngineModel[70] = new ModelRendererTurbo(this, 217, 97, textureX, textureY); // Box 289
		br185_EngineModel[71] = new ModelRendererTurbo(this, 49, 97, textureX, textureY); // Box 290
		br185_EngineModel[72] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 199
		br185_EngineModel[73] = new ModelRendererTurbo(this, 185, 65, textureX, textureY); // Box 200
		br185_EngineModel[74] = new ModelRendererTurbo(this, 113, 73, textureX, textureY); // Box 203
		br185_EngineModel[75] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 207
		br185_EngineModel[76] = new ModelRendererTurbo(this, 81, 105, textureX, textureY); // Box 208
		br185_EngineModel[77] = new ModelRendererTurbo(this, 57, 57, textureX, textureY); // Box 193
		br185_EngineModel[78] = new ModelRendererTurbo(this, 209, 65, textureX, textureY); // Box 194
		br185_EngineModel[79] = new ModelRendererTurbo(this, 129, 73, textureX, textureY); // Box 195
		br185_EngineModel[80] = new ModelRendererTurbo(this, 209, 73, textureX, textureY); // Box 196
		br185_EngineModel[81] = new ModelRendererTurbo(this, 233, 73, textureX, textureY); // Box 197
		br185_EngineModel[82] = new ModelRendererTurbo(this, 89, 65, textureX, textureY); // Box 198
		br185_EngineModel[83] = new ModelRendererTurbo(this, 185, 73, textureX, textureY); // Box 199
		br185_EngineModel[84] = new ModelRendererTurbo(this, 161, 105, textureX, textureY); // Box 200
		br185_EngineModel[85] = new ModelRendererTurbo(this, 249, 65, textureX, textureY); // Box 201
		br185_EngineModel[86] = new ModelRendererTurbo(this, 57, 65, textureX, textureY); // Box 202
		br185_EngineModel[87] = new ModelRendererTurbo(this, 241, 81, textureX, textureY); // Box 205
		br185_EngineModel[88] = new ModelRendererTurbo(this, 233, 65, textureX, textureY); // Box 206
		br185_EngineModel[89] = new ModelRendererTurbo(this, 17, 73, textureX, textureY); // Box 207
		br185_EngineModel[90] = new ModelRendererTurbo(this, 81, 73, textureX, textureY); // Box 209
		br185_EngineModel[91] = new ModelRendererTurbo(this, 217, 105, textureX, textureY); // Box 188
		br185_EngineModel[92] = new ModelRendererTurbo(this, 161, 105, textureX, textureY); // Box 189
		br185_EngineModel[93] = new ModelRendererTurbo(this, 41, 113, textureX, textureY); // Box 190
		br185_EngineModel[94] = new ModelRendererTurbo(this, 41, 105, textureX, textureY); // Box 190
		br185_EngineModel[95] = new ModelRendererTurbo(this, 185, 113, textureX, textureY); // Box 191
		br185_EngineModel[96] = new ModelRendererTurbo(this, 185, 113, textureX, textureY); // Box 197
		br185_EngineModel[97] = new ModelRendererTurbo(this, 193, 113, textureX, textureY); // Box 199
		br185_EngineModel[98] = new ModelRendererTurbo(this, 225, 113, textureX, textureY); // Box 193
		br185_EngineModel[99] = new ModelRendererTurbo(this, 113, 89, textureX, textureY); // Box 197
		br185_EngineModel[100] = new ModelRendererTurbo(this, 81, 121, textureX, textureY); // Box 201
		br185_EngineModel[101] = new ModelRendererTurbo(this, 49, 113, textureX, textureY); // Box 202
		br185_EngineModel[102] = new ModelRendererTurbo(this, 73, 81, textureX, textureY); // Box 211
		br185_EngineModel[103] = new ModelRendererTurbo(this, 1, 121, textureX, textureY); // Box 212
		br185_EngineModel[104] = new ModelRendererTurbo(this, 97, 129, textureX, textureY); // Box 213
		br185_EngineModel[105] = new ModelRendererTurbo(this, 113, 129, textureX, textureY); // Box 215
		br185_EngineModel[106] = new ModelRendererTurbo(this, 249, 73, textureX, textureY); // Box 216
		br185_EngineModel[107] = new ModelRendererTurbo(this, 49, 137, textureX, textureY); // Box 217
		br185_EngineModel[108] = new ModelRendererTurbo(this, 25, 137, textureX, textureY); // Box 219
		br185_EngineModel[109] = new ModelRendererTurbo(this, 73, 137, textureX, textureY); // Box 222
		br185_EngineModel[110] = new ModelRendererTurbo(this, 137, 129, textureX, textureY); // Box 224
		br185_EngineModel[111] = new ModelRendererTurbo(this, 105, 105, textureX, textureY); // Box 225
		br185_EngineModel[112] = new ModelRendererTurbo(this, 225, 121, textureX, textureY); // Box 226
		br185_EngineModel[113] = new ModelRendererTurbo(this, 97, 137, textureX, textureY); // Box 227
		br185_EngineModel[114] = new ModelRendererTurbo(this, 1, 121, textureX, textureY); // Box 230
		br185_EngineModel[115] = new ModelRendererTurbo(this, 9, 121, textureX, textureY); // Box 231
		br185_EngineModel[116] = new ModelRendererTurbo(this, 137, 129, textureX, textureY); // Box 233
		br185_EngineModel[117] = new ModelRendererTurbo(this, 161, 113, textureX, textureY); // Box 234
		br185_EngineModel[118] = new ModelRendererTurbo(this, 161, 137, textureX, textureY); // Box 235
		br185_EngineModel[119] = new ModelRendererTurbo(this, 241, 121, textureX, textureY); // Box 238
		br185_EngineModel[120] = new ModelRendererTurbo(this, 201, 137, textureX, textureY); // Box 239
		br185_EngineModel[121] = new ModelRendererTurbo(this, 193, 137, textureX, textureY); // Box 240
		br185_EngineModel[122] = new ModelRendererTurbo(this, 1, 161, textureX, textureY); // Box 241
		br185_EngineModel[123] = new ModelRendererTurbo(this, 169, 89, textureX, textureY); // Box 197
		br185_EngineModel[124] = new ModelRendererTurbo(this, 33, 113, textureX, textureY); // Box 198
		br185_EngineModel[125] = new ModelRendererTurbo(this, 113, 137, textureX, textureY); // Box 199
		br185_EngineModel[126] = new ModelRendererTurbo(this, 225, 137, textureX, textureY); // Box 197
		br185_EngineModel[127] = new ModelRendererTurbo(this, 241, 137, textureX, textureY); // Box 198
		br185_EngineModel[128] = new ModelRendererTurbo(this, 1, 145, textureX, textureY); // Box 199
		br185_EngineModel[129] = new ModelRendererTurbo(this, 41, 161, textureX, textureY); // Box 201
		br185_EngineModel[130] = new ModelRendererTurbo(this, 105, 161, textureX, textureY); // Box 202
		br185_EngineModel[131] = new ModelRendererTurbo(this, 177, 161, textureX, textureY); // Box 203
		br185_EngineModel[132] = new ModelRendererTurbo(this, 249, 97, textureX, textureY); // Box 204
		br185_EngineModel[133] = new ModelRendererTurbo(this, 177, 113, textureX, textureY); // Box 175
		br185_EngineModel[134] = new ModelRendererTurbo(this, 201, 113, textureX, textureY); // Box 176
		br185_EngineModel[135] = new ModelRendererTurbo(this, 41, 161, textureX, textureY); // Box 151
		br185_EngineModel[136] = new ModelRendererTurbo(this, 81, 161, textureX, textureY); // Box 152
		br185_EngineModel[137] = new ModelRendererTurbo(this, 145, 161, textureX, textureY); // Box 153
		br185_EngineModel[138] = new ModelRendererTurbo(this, 169, 65, textureX, textureY); // Box 154
		br185_EngineModel[139] = new ModelRendererTurbo(this, 105, 121, textureX, textureY); // Box 155
		br185_EngineModel[140] = new ModelRendererTurbo(this, 241, 129, textureX, textureY); // Box 156
		br185_EngineModel[141] = new ModelRendererTurbo(this, 185, 137, textureX, textureY); // Box 163
		br185_EngineModel[142] = new ModelRendererTurbo(this, 17, 145, textureX, textureY); // Box 164
		br185_EngineModel[143] = new ModelRendererTurbo(this, 33, 145, textureX, textureY); // Box 165
		br185_EngineModel[144] = new ModelRendererTurbo(this, 209, 81, textureX, textureY); // Box 166
		br185_EngineModel[145] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 169
		br185_EngineModel[146] = new ModelRendererTurbo(this, 97, 169, textureX, textureY); // Box 170
		br185_EngineModel[147] = new ModelRendererTurbo(this, 1, 185, textureX, textureY); // Box 171
		br185_EngineModel[148] = new ModelRendererTurbo(this, 49, 145, textureX, textureY); // Box 172
		br185_EngineModel[149] = new ModelRendererTurbo(this, 65, 145, textureX, textureY); // Box 183
		br185_EngineModel[150] = new ModelRendererTurbo(this, 81, 145, textureX, textureY); // Box 184
		br185_EngineModel[151] = new ModelRendererTurbo(this, 185, 145, textureX, textureY); // Box 185
		br185_EngineModel[152] = new ModelRendererTurbo(this, 193, 145, textureX, textureY); // Box 186
		br185_EngineModel[153] = new ModelRendererTurbo(this, 185, 97, textureX, textureY); // Box 188
		br185_EngineModel[154] = new ModelRendererTurbo(this, 161, 169, textureX, textureY); // Box 190
		br185_EngineModel[155] = new ModelRendererTurbo(this, 33, 193, textureX, textureY); // Box 191
		br185_EngineModel[156] = new ModelRendererTurbo(this, 1, 161, textureX, textureY); // Box 192
		br185_EngineModel[157] = new ModelRendererTurbo(this, 105, 65, textureX, textureY); // Box 171
		br185_EngineModel[158] = new ModelRendererTurbo(this, 217, 65, textureX, textureY); // Box 174
		br185_EngineModel[159] = new ModelRendererTurbo(this, 153, 73, textureX, textureY); // Box 175
		br185_EngineModel[160] = new ModelRendererTurbo(this, 169, 73, textureX, textureY); // Box 176
		br185_EngineModel[161] = new ModelRendererTurbo(this, 177, 73, textureX, textureY); // Box 177
		br185_EngineModel[162] = new ModelRendererTurbo(this, 81, 81, textureX, textureY); // Box 178
		br185_EngineModel[163] = new ModelRendererTurbo(this, 113, 81, textureX, textureY); // Box 179
		br185_EngineModel[164] = new ModelRendererTurbo(this, 129, 81, textureX, textureY); // Box 180
		br185_EngineModel[165] = new ModelRendererTurbo(this, 137, 81, textureX, textureY); // Box 181
		br185_EngineModel[166] = new ModelRendererTurbo(this, 193, 81, textureX, textureY); // Box 182

		br185_EngineModel[0].addShapeBox(0F, 0F, 0F, 54, 20, 25, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		br185_EngineModel[0].setRotationPoint(-34F, -16F, -12.5F);

		br185_EngineModel[1].addShapeBox(0F, 0F, 0F, 13, 3, 25, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 10
		br185_EngineModel[1].setRotationPoint(-29F, -19F, -12.5F);

		br185_EngineModel[2].addShapeBox(0F, 0F, 0F, 18, 5, 25, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		br185_EngineModel[2].setRotationPoint(-16F, -21F, -12.5F);

		br185_EngineModel[3].addShapeBox(0F, 0F, 0F, 10, 13, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 96
		br185_EngineModel[3].setRotationPoint(-44F, -9F, -12.5F);

		br185_EngineModel[4].addShapeBox(0F, 0F, 0F, 16, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 99
		br185_EngineModel[4].setRotationPoint(-50F, 0F, -11.5F);

		br185_EngineModel[5].addShapeBox(0F, 0F, 0F, 10, 13, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 101
		br185_EngineModel[5].setRotationPoint(-44F, -9F, 11.5F);

		br185_EngineModel[6].addShapeBox(0F, 0F, 0F, 2, 3, 19, 0F, 0F, 0F, 0F, -2F, -0.25F, 0F, -2F, -0.25F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, -4.5F, 0F, 0F, -4.5F, 0F, 0F, 3F, 0F, 0F); // Box 104
		br185_EngineModel[6].setRotationPoint(-44F, -21F, -9.5F);

		br185_EngineModel[7].addShapeBox(0F, 0F, 0F, 2, 3, 8, 0F, 0.2F, 0F, 0F, -1.2F, 0F, 0F, -1.2F, 0F, 0.5F, 0.2F, 0F, 0.5F, 1.4F, 0F, 0F, -2.4F, 0F, 0F, -2.4F, 0F, 0.5F, 1.4F, 0F, 0.5F); // Box 106
		br185_EngineModel[7].setRotationPoint(-50F, -10F, -9.5F);

		br185_EngineModel[8].addShapeBox(0F, 0F, 0F, 1, 4, 19, 0F, 0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0.4F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F); // Box 108
		br185_EngineModel[8].setRotationPoint(-51F, -7F, -9.5F);

		br185_EngineModel[9].addShapeBox(0F, 0F, 0F, 10, 1, 19, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 119
		br185_EngineModel[9].setRotationPoint(-44F, -21F, -9.5F);

		br185_EngineModel[10].addShapeBox(0F, 0F, 0F, 7, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 124
		br185_EngineModel[10].setRotationPoint(-51F, -3F, 11.5F);

		br185_EngineModel[11].addShapeBox(0F, 0F, 0F, 7, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 125
		br185_EngineModel[11].setRotationPoint(-51F, -3F, -12.5F);

		br185_EngineModel[12].addShapeBox(0F, 0F, 0F, 7, 6, 1, 0F, -2.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 126
		br185_EngineModel[12].setRotationPoint(-51F, -9F, -12.5F);

		br185_EngineModel[13].addShapeBox(0F, 0F, 0F, 7, 4, 1, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F); // Box 127
		br185_EngineModel[13].setRotationPoint(-49F, -13F, -12.5F);

		br185_EngineModel[14].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		br185_EngineModel[14].setRotationPoint(-47F, -16F, -12.5F);

		br185_EngineModel[15].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 129
		br185_EngineModel[15].setRotationPoint(-42F, -16F, -12.5F);

		br185_EngineModel[16].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 130
		br185_EngineModel[16].setRotationPoint(-42F, -10F, -12.5F);

		br185_EngineModel[17].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 131
		br185_EngineModel[17].setRotationPoint(-41F, -16F, -12.5F);

		br185_EngineModel[18].addShapeBox(0F, 0F, 0F, 3, 7, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 132
		br185_EngineModel[18].setRotationPoint(-37F, -16F, -12.5F);

		br185_EngineModel[19].addShapeBox(0F, 0F, 0F, 7, 6, 1, 0F, -2.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 135
		br185_EngineModel[19].setRotationPoint(-51F, -9F, 11.5F);

		br185_EngineModel[20].addShapeBox(0F, 0F, 0F, 7, 4, 1, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F); // Box 136
		br185_EngineModel[20].setRotationPoint(-49F, -13F, 11.5F);

		br185_EngineModel[21].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 137
		br185_EngineModel[21].setRotationPoint(-47F, -16F, 11.5F);

		br185_EngineModel[22].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 138
		br185_EngineModel[22].setRotationPoint(-42F, -16F, 11.5F);

		br185_EngineModel[23].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 139
		br185_EngineModel[23].setRotationPoint(-42F, -10F, 11.5F);

		br185_EngineModel[24].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 140
		br185_EngineModel[24].setRotationPoint(-41F, -16F, 11.5F);

		br185_EngineModel[25].addShapeBox(0F, 0F, 0F, 3, 7, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 141
		br185_EngineModel[25].setRotationPoint(-37F, -16F, 11.5F);

		br185_EngineModel[26].addShapeBox(0F, 0F, 0F, 7, 6, 1, 0F, 0F, 0F, 0F, -2.4F, 0F, 0F, -2.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 160
		br185_EngineModel[26].setRotationPoint(30F, -9F, 11.5F);

		br185_EngineModel[27].addShapeBox(0F, 0F, 0F, 10, 13, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 161
		br185_EngineModel[27].setRotationPoint(20F, -9F, 11.5F);

		br185_EngineModel[28].addShapeBox(0F, 0F, 0F, 7, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 164
		br185_EngineModel[28].setRotationPoint(30F, -3F, 11.5F);

		br185_EngineModel[29].addShapeBox(0F, 0F, 0F, 7, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 169
		br185_EngineModel[29].setRotationPoint(30F, -3F, -12.5F);

		br185_EngineModel[30].addShapeBox(0F, 0F, 0F, 7, 6, 1, 0F, 0F, 0F, 0F, -2.4F, 0F, 0F, -2.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 170
		br185_EngineModel[30].setRotationPoint(30F, -9F, -12.5F);

		br185_EngineModel[31].addShapeBox(0F, 0F, 0F, 10, 13, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 184
		br185_EngineModel[31].setRotationPoint(20F, -9F, -12.5F);

		br185_EngineModel[32].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 190
		br185_EngineModel[32].setRotationPoint(40F, 0F, -8.5F);

		br185_EngineModel[33].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 191
		br185_EngineModel[33].setRotationPoint(40F, 0F, 5.5F);

		br185_EngineModel[34].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 192
		br185_EngineModel[34].setRotationPoint(37F, 1F, 6.5F);

		br185_EngineModel[35].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 193
		br185_EngineModel[35].setRotationPoint(37F, 1F, -7.5F);

		br185_EngineModel[36].addShapeBox(0F, 0F, 0F, 4, 3, 21, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 194
		br185_EngineModel[36].setRotationPoint(-3F, 4F, -10.5F);

		br185_EngineModel[37].addShapeBox(0F, 0F, 0F, 4, 3, 21, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 195
		br185_EngineModel[37].setRotationPoint(-15F, 4F, -10.5F);

		br185_EngineModel[38].addShapeBox(0F, 0F, 0F, 7, 4, 21, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 196
		br185_EngineModel[38].setRotationPoint(-10.5F, 4F, -10.5F);

		br185_EngineModel[39].addShapeBox(0F, 0F, 0F, 10, 3, 23, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 214
		br185_EngineModel[39].setRotationPoint(20F, 4F, -11.5F);

		br185_EngineModel[40].addShapeBox(0F, 0F, 0F, 1, 3, 11, 0F, 5F, 0F, 0.5F, -5F, 0F, 0.5F, 2F, 0F, 0F, -2F, 0F, 0F, 6F, 0F, 0.5F, -6F, 0F, 0.5F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 216
		br185_EngineModel[40].setRotationPoint(-49F, 5F, 0.5F);

		br185_EngineModel[41].addShapeBox(0F, 0F, 0F, 10, 3, 23, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 218
		br185_EngineModel[41].setRotationPoint(-44F, 4F, -11.5F);

		br185_EngineModel[42].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 219
		br185_EngineModel[42].setRotationPoint(-54F, 1F, -7.5F);

		br185_EngineModel[43].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 220
		br185_EngineModel[43].setRotationPoint(-55F, 0F, -8.5F);

		br185_EngineModel[44].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 221
		br185_EngineModel[44].setRotationPoint(-55F, 0F, 5.5F);

		br185_EngineModel[45].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 222
		br185_EngineModel[45].setRotationPoint(-54F, 1F, 6.5F);

		br185_EngineModel[46].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, 6F, 0F, 0.5F, -3F, 0F, 0.5F, -3F, 0F, 0F, 2F, 0F, 1F, 6F, 0F, 0.5F, -3F, 0F, 0.5F, -3F, 0F, 0F, 2F, 0F, 1F); // Box 225
		br185_EngineModel[46].setRotationPoint(-48F, 4F, 0.5F);

		br185_EngineModel[47].addShapeBox(0F, 0F, 0F, 2, 8, 1, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, 2.2F, 0F, 0F, -3.2F, 0F, 0F, -3.2F, 0F, 0F, 2.2F, 0F, 0F); // Box 230
		br185_EngineModel[47].setRotationPoint(-48F, -18F, -9.5F);

		br185_EngineModel[48].addShapeBox(0F, 0F, 0F, 1, 2, 11, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 234
		br185_EngineModel[48].setRotationPoint(-53F, -3F, -5.5F);

		br185_EngineModel[49].addShapeBox(0F, 0F, 0F, 1, 3, 19, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 243
		br185_EngineModel[49].setRotationPoint(-52F, -3F, -9.5F);

		br185_EngineModel[50].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 256
		br185_EngineModel[50].setRotationPoint(18F, 4F, 11.5F);

		br185_EngineModel[51].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 258
		br185_EngineModel[51].setRotationPoint(12F, 4F, 11.5F);

		br185_EngineModel[52].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 260
		br185_EngineModel[52].setRotationPoint(13F, 5F, 11.5F);

		br185_EngineModel[53].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 261
		br185_EngineModel[53].setRotationPoint(18F, 4F, -12.5F);

		br185_EngineModel[54].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 263
		br185_EngineModel[54].setRotationPoint(13F, 5F, -12.5F);

		br185_EngineModel[55].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 264
		br185_EngineModel[55].setRotationPoint(12F, 4F, -12.5F);

		br185_EngineModel[56].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 265
		br185_EngineModel[56].setRotationPoint(-33F, 4F, -12.5F);

		br185_EngineModel[57].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 266
		br185_EngineModel[57].setRotationPoint(-32F, 5F, -12.5F);

		br185_EngineModel[58].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 267
		br185_EngineModel[58].setRotationPoint(-27F, 4F, -12.5F);

		br185_EngineModel[59].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 269
		br185_EngineModel[59].setRotationPoint(-27F, 4F, 11.5F);

		br185_EngineModel[60].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 270
		br185_EngineModel[60].setRotationPoint(-32F, 5F, 11.5F);

		br185_EngineModel[61].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 272
		br185_EngineModel[61].setRotationPoint(-33F, 4F, 11.5F);

		br185_EngineModel[62].addShapeBox(0F, 0F, 0F, 16, 7, 1, 0F, -1F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, -1F, 0F, 0F, 0F, -7F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -7F, 0F); // Box 277
		br185_EngineModel[62].setRotationPoint(-2F, -27F, -0.5F);

		br185_EngineModel[63].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 279
		br185_EngineModel[63].setRotationPoint(-2F, -28F, -2.5F);

		br185_EngineModel[64].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 282
		br185_EngineModel[64].setRotationPoint(13F, -35.5F, -5.5F);

		br185_EngineModel[65].addShapeBox(0F, 0F, 0F, 9, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 283
		br185_EngineModel[65].setRotationPoint(5F, -20F, -2.5F);

		br185_EngineModel[66].addShapeBox(0F, 0F, 0F, 9, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 284
		br185_EngineModel[66].setRotationPoint(-28F, -20F, -2.5F);

		br185_EngineModel[67].addShapeBox(0F, 0F, 0F, 16, 3, 1, 0F, 0F, -3F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, -3F, 0F, 1F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 1F, 0F, 0F); // Box 285
		br185_EngineModel[67].setRotationPoint(-27F, -23F, -0.5F);

		br185_EngineModel[68].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 286
		br185_EngineModel[68].setRotationPoint(-11F, -24F, -2.5F);

		br185_EngineModel[69].addShapeBox(0F, 0F, 0F, 14, 1, 1, 0F, 1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 1F, 0F, 0F, 0F, -1F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, -1F, 0F); // Box 288
		br185_EngineModel[69].setRotationPoint(-25F, -24.5F, 1.5F);

		br185_EngineModel[70].addShapeBox(0F, 0F, 0F, 14, 1, 1, 0F, 1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 1F, 0F, 0F, 0F, -1F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, -1F, 0F); // Box 289
		br185_EngineModel[70].setRotationPoint(-25F, -24.5F, -2.5F);

		br185_EngineModel[71].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 290
		br185_EngineModel[71].setRotationPoint(-26F, -25.5F, -5.5F);

		br185_EngineModel[72].addShapeBox(0F, 0F, 0F, 2, 3, 8, 0F, 0.2F, 0F, 0.5F, -1.2F, 0F, 0.5F, -1.2F, 0F, 0F, 0.2F, 0F, 0F, 1.4F, 0F, 0.5F, -2.4F, 0F, 0.5F, -2.4F, 0F, 0F, 1.4F, 0F, 0F); // Box 199
		br185_EngineModel[72].setRotationPoint(-50F, -10F, 1.5F);

		br185_EngineModel[73].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, 0.2F, 0F, 0F, -1.2F, 0F, 0F, -1.2F, 0F, 0F, 0.2F, 0F, 0F, 0.6F, 0F, 0F, -1.6F, 0F, 0F, -1.6F, 0F, 0F, 0.6F, 0F, 0F); // Box 200
		br185_EngineModel[73].setRotationPoint(-50F, -10F, -1F);

		br185_EngineModel[74].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, -1.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, -1.2F, 0F, 0F, -1.6F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, -1.6F, 0F, 0F); // Box 203
		br185_EngineModel[74].setRotationPoint(34F, -10F, -1F);

		br185_EngineModel[75].addShapeBox(0F, 0F, 0F, 16, 7, 1, 0F, 0F, -7F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -7F, 0F, -1F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, -1F, 0F, 0F); // Box 207
		br185_EngineModel[75].setRotationPoint(-2F, -34.5F, 1.5F);

		br185_EngineModel[76].addShapeBox(0F, 0F, 0F, 16, 7, 1, 0F, 0F, -7F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -7F, 0F, -1F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, -1F, 0F, 0F); // Box 208
		br185_EngineModel[76].setRotationPoint(-2F, -34.5F, -2.5F);

		br185_EngineModel[77].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 193
		br185_EngineModel[77].setRotationPoint(23F, -16F, -12.5F);

		br185_EngineModel[78].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 194
		br185_EngineModel[78].setRotationPoint(27F, -16F, -12.5F);

		br185_EngineModel[79].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 195
		br185_EngineModel[79].setRotationPoint(28F, -16F, -12.5F);

		br185_EngineModel[80].addShapeBox(0F, 0F, 0F, 7, 4, 1, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F); // Box 196
		br185_EngineModel[80].setRotationPoint(28F, -13F, -12.5F);

		br185_EngineModel[81].addShapeBox(0F, 0F, 0F, 3, 7, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 197
		br185_EngineModel[81].setRotationPoint(20F, -16F, -12.5F);

		br185_EngineModel[82].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 198
		br185_EngineModel[82].setRotationPoint(23F, -10F, -12.5F);

		br185_EngineModel[83].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 199
		br185_EngineModel[83].setRotationPoint(28F, -16F, 11.5F);

		br185_EngineModel[84].addShapeBox(0F, 0F, 0F, 7, 4, 1, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F); // Box 200
		br185_EngineModel[84].setRotationPoint(28F, -13F, 11.5F);

		br185_EngineModel[85].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 201
		br185_EngineModel[85].setRotationPoint(27F, -16F, 11.5F);

		br185_EngineModel[86].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 202
		br185_EngineModel[86].setRotationPoint(23F, -16F, 11.5F);

		br185_EngineModel[87].addShapeBox(0F, 0F, 0F, 3, 7, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 205
		br185_EngineModel[87].setRotationPoint(20F, -16F, 11.5F);

		br185_EngineModel[88].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 206
		br185_EngineModel[88].setRotationPoint(23F, -10F, 11.5F);

		br185_EngineModel[89].addShapeBox(0F, 0F, 0F, 0, 2, 2, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0.4F, 0F, 0F); // Box 207
		br185_EngineModel[89].setRotationPoint(-50F, -9F, -1F);

		br185_EngineModel[90].addShapeBox(0F, 0F, 0F, 0, 2, 2, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, -0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, -0.4F, 0F, 0F); // Box 209
		br185_EngineModel[90].setRotationPoint(36F, -9F, -1F);

		br185_EngineModel[91].addShapeBox(0F, 0F, 0F, 16, 4, 1, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 188
		br185_EngineModel[91].setRotationPoint(-50F, 0F, 10.5F);

		br185_EngineModel[92].addShapeBox(0F, 0F, 0F, 1, 4, 21, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 189
		br185_EngineModel[92].setRotationPoint(-51F, 0F, -10.5F);

		br185_EngineModel[93].addShapeBox(0F, 0F, 0F, 6, 1, 21, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 190
		br185_EngineModel[93].setRotationPoint(-50F, 4F, -10.5F);

		br185_EngineModel[94].addShapeBox(0F, 0F, 0F, 2, 8, 1, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, 2.2F, 0F, 0F, -3.2F, 0F, 0F, -3.2F, 0F, 0F, 2.2F, 0F, 0F); // Box 190
		br185_EngineModel[94].setRotationPoint(-48F, -18F, -0.5F);

		br185_EngineModel[95].addShapeBox(0F, 0F, 0F, 2, 8, 1, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, 2.2F, 0F, 0F, -3.2F, 0F, 0F, -3.2F, 0F, 0F, 2.2F, 0F, 0F); // Box 191
		br185_EngineModel[95].setRotationPoint(-48F, -18F, 8.5F);

		br185_EngineModel[96].addShapeBox(0F, 0F, 0F, 6, 1, 21, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 197
		br185_EngineModel[96].setRotationPoint(30F, 4F, -10.5F);

		br185_EngineModel[97].addShapeBox(0F, 0F, 0F, 2, 8, 1, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -3.2F, 0F, 0F, 2.2F, 0F, 0F, 2.2F, 0F, 0F, -3.2F, 0F, 0F); // Box 199
		br185_EngineModel[97].setRotationPoint(32F, -18F, -0.5F);

		br185_EngineModel[98].addShapeBox(0F, 0F, 0F, 10, 1, 2, 0F, 0F, -5F, 1F, 0F, -5F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 193
		br185_EngineModel[98].setRotationPoint(-44F, -21F, -11.5F);

		br185_EngineModel[99].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F, 0F, -5F, 1F, -2F, -5F, 0F, -2F, -0.25F, 0F, 0F, 0F, 0F, 3F, 5F, 1F, -4.5F, 4.5F, 0F, -4.5F, 0F, 0F, 3F, 0F, 0F); // Box 197
		br185_EngineModel[99].setRotationPoint(-44F, -21F, -11.5F);

		br185_EngineModel[100].addShapeBox(0F, 0F, 0F, 10, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 1F, 0F, -5F, 1F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 4F, 0F, 0F, 4F, 0F); // Box 201
		br185_EngineModel[100].setRotationPoint(-44F, -21F, 9.5F);

		br185_EngineModel[101].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F, 0F, 0F, 0F, -2F, -0.25F, 0F, -2F, -5F, 0F, 0F, -5F, 1F, 3F, 0F, 0F, -4.5F, 0F, 0F, -4.5F, 4.5F, 0F, 3F, 5F, 1F); // Box 202
		br185_EngineModel[101].setRotationPoint(-44F, -21F, 9.5F);

		br185_EngineModel[102].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -2F, 0F, 0F); // Box 211
		br185_EngineModel[102].setRotationPoint(-53F, -3F, 9.5F);

		br185_EngineModel[103].addShapeBox(0F, 0F, 0F, 1, 1, 19, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 212
		br185_EngineModel[103].setRotationPoint(-53F, -1F, -9.5F);

		br185_EngineModel[104].addShapeBox(0F, 0F, 0F, 16, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 213
		br185_EngineModel[104].setRotationPoint(20F, 0F, -11.5F);

		br185_EngineModel[105].addShapeBox(0F, 0F, 0F, 1, 4, 21, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 215
		br185_EngineModel[105].setRotationPoint(36F, 0F, -10.5F);

		br185_EngineModel[106].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 216
		br185_EngineModel[106].setRotationPoint(-51F, 0F, 10.5F);

		br185_EngineModel[107].addShapeBox(0F, 0F, 0F, 16, 4, 1, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 217
		br185_EngineModel[107].setRotationPoint(20F, 0F, 10.5F);

		br185_EngineModel[108].addShapeBox(0F, 0F, 0F, 1, 3, 19, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 219
		br185_EngineModel[108].setRotationPoint(37F, -3F, -9.5F);

		br185_EngineModel[109].addShapeBox(0F, 0F, 0F, 1, 4, 19, 0F, -0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, -0.4F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F); // Box 222
		br185_EngineModel[109].setRotationPoint(36F, -7F, -9.5F);

		br185_EngineModel[110].addShapeBox(0F, 0F, 0F, 1, 1, 19, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 224
		br185_EngineModel[110].setRotationPoint(38F, -1F, -9.5F);

		br185_EngineModel[111].addShapeBox(0F, 0F, 0F, 1, 2, 11, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 225
		br185_EngineModel[111].setRotationPoint(38F, -3F, -5.5F);

		br185_EngineModel[112].addShapeBox(0F, 0F, 0F, 2, 3, 8, 0F, -1.2F, 0F, 0.5F, 0.2F, 0F, 0.5F, 0.2F, 0F, 0F, -1.2F, 0F, 0F, -2.4F, 0F, 0.5F, 1.4F, 0F, 0.5F, 1.4F, 0F, 0F, -2.4F, 0F, 0F); // Box 226
		br185_EngineModel[112].setRotationPoint(34F, -10F, 1.5F);

		br185_EngineModel[113].addShapeBox(0F, 0F, 0F, 2, 3, 8, 0F, -1.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0.5F, -1.2F, 0F, 0.5F, -2.4F, 0F, 0F, 1.4F, 0F, 0F, 1.4F, 0F, 0.5F, -2.4F, 0F, 0.5F); // Box 227
		br185_EngineModel[113].setRotationPoint(34F, -10F, -9.5F);

		br185_EngineModel[114].addShapeBox(0F, 0F, 0F, 2, 8, 1, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -3.2F, 0F, 0F, 2.2F, 0F, 0F, 2.2F, 0F, 0F, -3.2F, 0F, 0F); // Box 230
		br185_EngineModel[114].setRotationPoint(32F, -18F, 8.5F);

		br185_EngineModel[115].addShapeBox(0F, 0F, 0F, 2, 8, 1, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -3.2F, 0F, 0F, 2.2F, 0F, 0F, 2.2F, 0F, 0F, -3.2F, 0F, 0F); // Box 231
		br185_EngineModel[115].setRotationPoint(32F, -18F, -9.5F);

		br185_EngineModel[116].addShapeBox(0F, 0F, 0F, 2, 10, 2, 0F, -0.5F, -4.5F, 0F, -1F, -5F, 1F, -1F, 0F, 0F, -0.5F, 0F, 0F, -5F, 5F, 0F, 3F, 5F, 1F, 5F, 5F, 0F, -6F, 5F, 0F); // Box 233
		br185_EngineModel[116].setRotationPoint(32F, -18F, -11.5F);

		br185_EngineModel[117].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F, -2F, -5F, 0F, 0F, -5F, 1F, 0F, 0F, 0F, -2F, -0.25F, 0F, -4.5F, 4.5F, 0F, 3F, 5F, 1F, 3F, 0F, 0F, -4.5F, 0F, 0F); // Box 234
		br185_EngineModel[117].setRotationPoint(28F, -21F, -11.5F);

		br185_EngineModel[118].addShapeBox(0F, 0F, 0F, 10, 1, 2, 0F, 0F, -5F, 1F, 0F, -5F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 235
		br185_EngineModel[118].setRotationPoint(20F, -21F, -11.5F);

		br185_EngineModel[119].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F, -2F, -0.25F, 0F, 0F, 0F, 0F, 0F, -5F, 1F, -2F, -5F, 0F, -4.5F, 0F, 0F, 3F, 0F, 0F, 3F, 5F, 1F, -4.5F, 4.5F, 0F); // Box 238
		br185_EngineModel[119].setRotationPoint(28F, -21F, 9.5F);

		br185_EngineModel[120].addShapeBox(0F, 0F, 0F, 2, 3, 19, 0F, -2F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -0.25F, 0F, -4.5F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -4.5F, 0F, 0F); // Box 239
		br185_EngineModel[120].setRotationPoint(28F, -21F, -9.5F);

		br185_EngineModel[121].addShapeBox(0F, 0F, 0F, 10, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 1F, 0F, -5F, 1F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 4F, 0F, 0F, 4F, 0F); // Box 240
		br185_EngineModel[121].setRotationPoint(20F, -21F, 9.5F);

		br185_EngineModel[122].addShapeBox(0F, 0F, 0F, 10, 1, 19, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 241
		br185_EngineModel[122].setRotationPoint(20F, -21F, -9.5F);

		br185_EngineModel[123].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F, -2F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 197
		br185_EngineModel[123].setRotationPoint(-53F, -3F, -12.5F);

		br185_EngineModel[124].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F, 0F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 198
		br185_EngineModel[124].setRotationPoint(37F, -3F, -12.5F);

		br185_EngineModel[125].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -1F); // Box 199
		br185_EngineModel[125].setRotationPoint(37F, -3F, 9.5F);

		br185_EngineModel[126].addShapeBox(0F, 0F, 0F, 2, 10, 2, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, -5F, 1F, -0.5F, -4.5F, 0F, -6F, 5F, 0F, 5F, 5F, 0F, 3F, 5F, 1F, -5F, 5F, 0F); // Box 197
		br185_EngineModel[126].setRotationPoint(32F, -18F, 9.5F);

		br185_EngineModel[127].addShapeBox(0F, 0F, 0F, 2, 10, 2, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -4.5F, 0F, -1F, -5F, 1F, 5F, 5F, 0F, -6F, 5F, 0F, -5F, 5F, 0F, 3F, 5F, 1F); // Box 198
		br185_EngineModel[127].setRotationPoint(-48F, -18F, 9.5F);

		br185_EngineModel[128].addShapeBox(0F, 0F, 0F, 2, 10, 2, 0F, -1F, -5F, 1F, -0.5F, -4.5F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, 3F, 5F, 1F, -5F, 5F, 0F, -6F, 5F, 0F, 5F, 5F, 0F); // Box 199
		br185_EngineModel[128].setRotationPoint(-48F, -18F, -11.5F);

		br185_EngineModel[129].addShapeBox(0F, 0F, 0F, 5, 5, 25, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 201
		br185_EngineModel[129].setRotationPoint(-34F, -21F, -12.5F);

		br185_EngineModel[130].addShapeBox(0F, 0F, 0F, 5, 5, 25, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 202
		br185_EngineModel[130].setRotationPoint(15F, -21F, -12.5F);

		br185_EngineModel[131].addShapeBox(0F, 0F, 0F, 13, 3, 25, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 203
		br185_EngineModel[131].setRotationPoint(2F, -19F, -12.5F);

		br185_EngineModel[132].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 204
		br185_EngineModel[132].setRotationPoint(-51F, 0F, -11.5F);

		br185_EngineModel[133].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 175
		br185_EngineModel[133].setRotationPoint(36F, 0F, -11.5F);

		br185_EngineModel[134].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 176
		br185_EngineModel[134].setRotationPoint(36F, 0F, 10.5F);

		br185_EngineModel[135].addShapeBox(0F, 0F, 0F, 1, 3, 11, 0F, -2F, 0F, 0F, 2F, 0F, 0F, -5F, 0F, 0.5F, 5F, 0F, 0.5F, 1F, 0F, 0F, -1F, 0F, 0F, -6F, 0F, 0.5F, 6F, 0F, 0.5F); // Box 151
		br185_EngineModel[135].setRotationPoint(-49F, 5F, -11.5F);

		br185_EngineModel[136].addShapeBox(0F, 0F, 0F, 1, 3, 11, 0F, -5F, 0F, 0.5F, 5F, 0F, 0.5F, -2F, 0F, 0F, 2F, 0F, 0F, -6F, 0F, 0.5F, 6F, 0F, 0.5F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 152
		br185_EngineModel[136].setRotationPoint(34F, 5F, 0.5F);

		br185_EngineModel[137].addShapeBox(0F, 0F, 0F, 1, 3, 11, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 5F, 0F, 0.5F, -5F, 0F, 0.5F, -1F, 0F, 0F, 1F, 0F, 0F, 6F, 0F, 0.5F, -6F, 0F, 0.5F); // Box 153
		br185_EngineModel[137].setRotationPoint(34F, 5F, -11.5F);

		br185_EngineModel[138].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, 2F, 0F, 1F, -3F, 0F, 0F, -3F, 0F, 0.5F, 6F, 0F, 0.5F, 2F, 0F, 1F, -3F, 0F, 0F, -3F, 0F, 0.5F, 6F, 0F, 0.5F); // Box 154
		br185_EngineModel[138].setRotationPoint(-48F, 4F, -5.5F);

		br185_EngineModel[139].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, -3F, 0F, 0F, 2F, 0F, 1F, 6F, 0F, 0.5F, -3F, 0F, 0.5F, -3F, 0F, 0F, 2F, 0F, 1F, 6F, 0F, 0.5F, -3F, 0F, 0.5F); // Box 155
		br185_EngineModel[139].setRotationPoint(33F, 4F, -5.5F);

		br185_EngineModel[140].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, -3F, 0F, 0.5F, 6F, 0F, 0.5F, 2F, 0F, 1F, -3F, 0F, 0F, -3F, 0F, 0.5F, 6F, 0F, 0.5F, 2F, 0F, 1F, -3F, 0F, 0F); // Box 156
		br185_EngineModel[140].setRotationPoint(33F, 4F, 0.5F);

		br185_EngineModel[141].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F, 0.2F, 0F, 0F, 2.25F, 0F, 0F, -0.75F, 0F, 0F, 0.2F, 0F, 0F, 1.4F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 1.4F, 0F, 0F); // Box 163
		br185_EngineModel[141].setRotationPoint(-49F, -10F, -1.5F);

		br185_EngineModel[142].addShapeBox(0F, 0F, 0F, 1, 3, 5, 0F, 0.2F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0.2F, 0F, 0F, 1.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.4F, 0F, 0F); // Box 164
		br185_EngineModel[142].setRotationPoint(-49F, -10F, 2.5F);

		br185_EngineModel[143].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F, 0.2F, 0F, 0F, -0.75F, 0F, 0F, 2.25F, 0F, 0F, -1F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F); // Box 165
		br185_EngineModel[143].setRotationPoint(-49F, -10F, 7.5F);

		br185_EngineModel[144].addShapeBox(0F, 0F, 0F, 6, 1, 2, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 166
		br185_EngineModel[144].setRotationPoint(-50F, -7F, 9.5F);

		br185_EngineModel[145].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 169
		br185_EngineModel[145].setRotationPoint(-46F, -7F, 7.5F);

		br185_EngineModel[146].addShapeBox(0F, 0F, 0F, 2, 1, 11, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F); // Box 170
		br185_EngineModel[146].setRotationPoint(-46F, -7F, -9.5F);

		br185_EngineModel[147].addShapeBox(0F, 0F, 0F, 4, 1, 19, 0F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.4F, 0F, 0F, 0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.8F, 0F, 0F); // Box 171
		br185_EngineModel[147].setRotationPoint(-50F, -7F, -9.5F);

		br185_EngineModel[148].addShapeBox(0F, 0F, 0F, 6, 1, 2, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.75F, 0F, 0F); // Box 172
		br185_EngineModel[148].setRotationPoint(-50F, -7F, -11.5F);

		br185_EngineModel[149].addShapeBox(0F, 0F, 0F, 1, 3, 5, 0F, -0.75F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 1.4F, 0F, 0F, 1.4F, 0F, 0F, 0F, 0F, 0F); // Box 183
		br185_EngineModel[149].setRotationPoint(34F, -10F, -7.5F);

		br185_EngineModel[150].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F, -0.75F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 2.25F, 0F, 0F, 0F, 0F, 0F, 1.4F, 0F, 0F, 1.4F, 0F, 0F, 3F, 0F, 0F); // Box 184
		br185_EngineModel[150].setRotationPoint(34F, -10F, -2.5F);

		br185_EngineModel[151].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F, 2.25F, 0F, 0F, -1F, 0F, 0F, 0.2F, 0F, 0F, -0.75F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F); // Box 185
		br185_EngineModel[151].setRotationPoint(34F, -10F, -11.5F);

		br185_EngineModel[152].addShapeBox(0F, 0F, 0F, 6, 1, 2, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0.75F, 0F, 0F, 0F, 0F, 0F); // Box 186
		br185_EngineModel[152].setRotationPoint(30F, -7F, -11.5F);

		br185_EngineModel[153].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F); // Box 188
		br185_EngineModel[153].setRotationPoint(30F, -7F, -9.5F);

		br185_EngineModel[154].addShapeBox(0F, 0F, 0F, 2, 1, 11, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 190
		br185_EngineModel[154].setRotationPoint(30F, -7F, -1.5F);

		br185_EngineModel[155].addShapeBox(0F, 0F, 0F, 4, 1, 19, 0F, 0F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.8F, 0F, 0F, 0.8F, 0F, 0F, 0F, 0F, 0F); // Box 191
		br185_EngineModel[155].setRotationPoint(32F, -7F, -9.5F);

		br185_EngineModel[156].addShapeBox(0F, 0F, 0F, 6, 1, 2, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.75F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 192
		br185_EngineModel[156].setRotationPoint(30F, -7F, 9.5F);

		br185_EngineModel[157].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 171
		br185_EngineModel[157].setRotationPoint(38F, -2.5F, -7F);

		br185_EngineModel[158].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 174
		br185_EngineModel[158].setRotationPoint(38F, -2.5F, -9F);

		br185_EngineModel[159].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 175
		br185_EngineModel[159].setRotationPoint(38F, -2.5F, 6F);

		br185_EngineModel[160].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 176
		br185_EngineModel[160].setRotationPoint(38F, -2.5F, 8F);

		br185_EngineModel[161].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 177
		br185_EngineModel[161].setRotationPoint(36.5F, -8.5F, -0.5F);

		br185_EngineModel[162].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 178
		br185_EngineModel[162].setRotationPoint(-51.5F, -8.5F, -0.5F);

		br185_EngineModel[163].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 179
		br185_EngineModel[163].setRotationPoint(-53F, -2.5F, 6F);

		br185_EngineModel[164].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 180
		br185_EngineModel[164].setRotationPoint(-53F, -2.5F, 8F);

		br185_EngineModel[165].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 181
		br185_EngineModel[165].setRotationPoint(-53F, -2.5F, -7F);

		br185_EngineModel[166].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 182
		br185_EngineModel[166].setRotationPoint(-53F, -2.5F, -9F);

	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		for(int i = 0; i < 167; i++)
		{
			if (i==158 || i==160 || i==166 || i== 162 || i==164){
				Minecraft.getMinecraft().entityRenderer.disableLightmap(1D);
			}
			br185_EngineModel[i].render(f5);
			if (i==158 || i==160 || i==166 || i== 162 || i==164){
				Minecraft.getMinecraft().entityRenderer.enableLightmap(1D);
			}
		}

		GL11.glPushMatrix();
		Tessellator.bindTexture(new ResourceLocation(Info.modID, "textures/trains/BR185_Bogie.png"));
		GL11.glTranslated(-1.5,0.25,0.05);
		fronttrucks.render(entity,f,f1,f2,f3,f4,f5);
		GL11.glPopMatrix();

		GL11.glPushMatrix();
		Tessellator.bindTexture(new ResourceLocation(Info.modID, "textures/trains/BR185_Bogie.png"));
		GL11.glTranslated(0.75,0.25,0.05);
		backtrucks.render(entity,f,f1,f2,f3,f4,f5);
		GL11.glPopMatrix();
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
	{
	}

	public ModelRendererTurbo br185_EngineModel[];
}