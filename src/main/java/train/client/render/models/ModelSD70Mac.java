//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 21.11.2018 - 00:38:15
// Last changed on: 21.11.2018 - 00:38:15

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

public class ModelSD70Mac extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelSD70Mac() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[235];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 31
		bodyModel[1] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 34
		bodyModel[2] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 81
		bodyModel[3] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 83
		bodyModel[4] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 84
		bodyModel[5] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 96
		bodyModel[6] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 97
		bodyModel[7] = new ModelRendererTurbo(this, 73, 9, textureX, textureY); // Box 100
		bodyModel[8] = new ModelRendererTurbo(this, 113, 9, textureX, textureY); // Box 124
		bodyModel[9] = new ModelRendererTurbo(this, 137, 9, textureX, textureY); // Box 130
		bodyModel[10] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 138
		bodyModel[11] = new ModelRendererTurbo(this, 161, 9, textureX, textureY); // Box 122
		bodyModel[12] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 125
		bodyModel[13] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Box 128
		bodyModel[14] = new ModelRendererTurbo(this, 289, 9, textureX, textureY); // Box 76
		bodyModel[15] = new ModelRendererTurbo(this, 265, 17, textureX, textureY); // Box 85
		bodyModel[16] = new ModelRendererTurbo(this, 137, 25, textureX, textureY); // Box 85
		bodyModel[17] = new ModelRendererTurbo(this, 225, 41, textureX, textureY); // Box 138
		bodyModel[18] = new ModelRendererTurbo(this, 361, 9, textureX, textureY); // Box 170
		bodyModel[19] = new ModelRendererTurbo(this, 353, 17, textureX, textureY); // Box 177
		bodyModel[20] = new ModelRendererTurbo(this, 225, 25, textureX, textureY); // Box 187
		bodyModel[21] = new ModelRendererTurbo(this, 353, 25, textureX, textureY); // Box 188
		bodyModel[22] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 190
		bodyModel[23] = new ModelRendererTurbo(this, 377, 17, textureX, textureY); // Box 123
		bodyModel[24] = new ModelRendererTurbo(this, 393, 17, textureX, textureY); // Box 119
		bodyModel[25] = new ModelRendererTurbo(this, 297, 41, textureX, textureY); // Box 121
		bodyModel[26] = new ModelRendererTurbo(this, 353, 33, textureX, textureY); // Box 131
		bodyModel[27] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 69 door engineer side
		bodyModel[28] = new ModelRendererTurbo(this, 401, 41, textureX, textureY); // Box 134
		bodyModel[29] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 135
		bodyModel[30] = new ModelRendererTurbo(this, 97, 9, textureX, textureY); // Box 136
		bodyModel[31] = new ModelRendererTurbo(this, 129, 9, textureX, textureY); // Box 138
		bodyModel[32] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 139
		bodyModel[33] = new ModelRendererTurbo(this, 73, 49, textureX, textureY); // Box 137
		bodyModel[34] = new ModelRendererTurbo(this, 393, 9, textureX, textureY); // Box 136
		bodyModel[35] = new ModelRendererTurbo(this, 97, 17, textureX, textureY); // Box 138
		bodyModel[36] = new ModelRendererTurbo(this, 457, 41, textureX, textureY); // Box 143
		bodyModel[37] = new ModelRendererTurbo(this, 305, 41, textureX, textureY); // Box 148
		bodyModel[38] = new ModelRendererTurbo(this, 241, 49, textureX, textureY); // Box 154
		bodyModel[39] = new ModelRendererTurbo(this, 337, 41, textureX, textureY); // Box 155
		bodyModel[40] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 156
		bodyModel[41] = new ModelRendererTurbo(this, 145, 57, textureX, textureY); // Box 157
		bodyModel[42] = new ModelRendererTurbo(this, 385, 57, textureX, textureY); // Box 158
		bodyModel[43] = new ModelRendererTurbo(this, 257, 25, textureX, textureY); // Box 164
		bodyModel[44] = new ModelRendererTurbo(this, 225, 33, textureX, textureY); // Box 165
		bodyModel[45] = new ModelRendererTurbo(this, 113, 41, textureX, textureY); // Box 166
		bodyModel[46] = new ModelRendererTurbo(this, 249, 33, textureX, textureY); // Box 167
		bodyModel[47] = new ModelRendererTurbo(this, 377, 41, textureX, textureY); // Box 168
		bodyModel[48] = new ModelRendererTurbo(this, 377, 49, textureX, textureY); // Box 169
		bodyModel[49] = new ModelRendererTurbo(this, 201, 57, textureX, textureY); // Box 170
		bodyModel[50] = new ModelRendererTurbo(this, 449, 57, textureX, textureY); // Box 171
		bodyModel[51] = new ModelRendererTurbo(this, 209, 65, textureX, textureY); // Box 172
		bodyModel[52] = new ModelRendererTurbo(this, 401, 33, textureX, textureY); // Exhaust
		bodyModel[53] = new ModelRendererTurbo(this, 241, 65, textureX, textureY); // Box 174
		bodyModel[54] = new ModelRendererTurbo(this, 497, 25, textureX, textureY); // Box 176
		bodyModel[55] = new ModelRendererTurbo(this, 497, 41, textureX, textureY); // Box 177
		bodyModel[56] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 178
		bodyModel[57] = new ModelRendererTurbo(this, 129, 57, textureX, textureY); // Box 152
		bodyModel[58] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 123
		bodyModel[59] = new ModelRendererTurbo(this, 81, 49, textureX, textureY); // Box 124
		bodyModel[60] = new ModelRendererTurbo(this, 473, 57, textureX, textureY); // Box 125
		bodyModel[61] = new ModelRendererTurbo(this, 113, 9, textureX, textureY); // Box 190
		bodyModel[62] = new ModelRendererTurbo(this, 153, 9, textureX, textureY); // Box 130
		bodyModel[63] = new ModelRendererTurbo(this, 409, 9, textureX, textureY); // Box 132
		bodyModel[64] = new ModelRendererTurbo(this, 417, 9, textureX, textureY); // Box 190
		bodyModel[65] = new ModelRendererTurbo(this, 489, 57, textureX, textureY); // Box 119
		bodyModel[66] = new ModelRendererTurbo(this, 425, 9, textureX, textureY); // Box 156
		bodyModel[67] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 190
		bodyModel[68] = new ModelRendererTurbo(this, 353, 33, textureX, textureY); // Box 130
		bodyModel[69] = new ModelRendererTurbo(this, 9, 17, textureX, textureY); // Box 132
		bodyModel[70] = new ModelRendererTurbo(this, 353, 65, textureX, textureY); // Box 128
		bodyModel[71] = new ModelRendererTurbo(this, 281, 65, textureX, textureY); // Box 130
		bodyModel[72] = new ModelRendererTurbo(this, 137, 41, textureX, textureY); // Box 131
		bodyModel[73] = new ModelRendererTurbo(this, 41, 73, textureX, textureY); // Box 132
		bodyModel[74] = new ModelRendererTurbo(this, 281, 49, textureX, textureY); // Box 133
		bodyModel[75] = new ModelRendererTurbo(this, 145, 73, textureX, textureY); // Box 135
		bodyModel[76] = new ModelRendererTurbo(this, 161, 73, textureX, textureY); // Box 146
		bodyModel[77] = new ModelRendererTurbo(this, 185, 73, textureX, textureY); // Box 147
		bodyModel[78] = new ModelRendererTurbo(this, 497, 73, textureX, textureY); // Box 148
		bodyModel[79] = new ModelRendererTurbo(this, 33, 81, textureX, textureY); // Box 149
		bodyModel[80] = new ModelRendererTurbo(this, 41, 81, textureX, textureY); // Box 150
		bodyModel[81] = new ModelRendererTurbo(this, 73, 89, textureX, textureY); // Box 33
		bodyModel[82] = new ModelRendererTurbo(this, 369, 41, textureX, textureY); // Box 45
		bodyModel[83] = new ModelRendererTurbo(this, 465, 73, textureX, textureY); // Box 61
		bodyModel[84] = new ModelRendererTurbo(this, 153, 41, textureX, textureY); // Box 139
		bodyModel[85] = new ModelRendererTurbo(this, 457, 41, textureX, textureY); // Box 140
		bodyModel[86] = new ModelRendererTurbo(this, 297, 81, textureX, textureY); // Box 143
		bodyModel[87] = new ModelRendererTurbo(this, 313, 81, textureX, textureY); // Box 145
		bodyModel[88] = new ModelRendererTurbo(this, 313, 81, textureX, textureY); // Box 147
		bodyModel[89] = new ModelRendererTurbo(this, 297, 57, textureX, textureY); // Box 4
		bodyModel[90] = new ModelRendererTurbo(this, 129, 49, textureX, textureY); // Box 2
		bodyModel[91] = new ModelRendererTurbo(this, 329, 81, textureX, textureY); // Box 4
		bodyModel[92] = new ModelRendererTurbo(this, 353, 81, textureX, textureY); // Box 4
		bodyModel[93] = new ModelRendererTurbo(this, 473, 81, textureX, textureY); // Box 4
		bodyModel[94] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 4
		bodyModel[95] = new ModelRendererTurbo(this, 369, 89, textureX, textureY); // Box 4
		bodyModel[96] = new ModelRendererTurbo(this, 25, 97, textureX, textureY); // Box 4
		bodyModel[97] = new ModelRendererTurbo(this, 57, 97, textureX, textureY); // Box 170
		bodyModel[98] = new ModelRendererTurbo(this, 361, 97, textureX, textureY); // Box 171
		bodyModel[99] = new ModelRendererTurbo(this, 129, 65, textureX, textureY); // Box 173
		bodyModel[100] = new ModelRendererTurbo(this, 377, 65, textureX, textureY); // Box 174
		bodyModel[101] = new ModelRendererTurbo(this, 81, 81, textureX, textureY); // Box 175
		bodyModel[102] = new ModelRendererTurbo(this, 233, 57, textureX, textureY); // Box 176
		bodyModel[103] = new ModelRendererTurbo(this, 465, 41, textureX, textureY); // Box 188
		bodyModel[104] = new ModelRendererTurbo(this, 457, 89, textureX, textureY); // Box 189
		bodyModel[105] = new ModelRendererTurbo(this, 361, 33, textureX, textureY); // Box 191
		bodyModel[106] = new ModelRendererTurbo(this, 313, 57, textureX, textureY); // Box 192
		bodyModel[107] = new ModelRendererTurbo(this, 393, 97, textureX, textureY); // Box 346
		bodyModel[108] = new ModelRendererTurbo(this, 97, 81, textureX, textureY); // Box 218
		bodyModel[109] = new ModelRendererTurbo(this, 121, 81, textureX, textureY); // Box 219
		bodyModel[110] = new ModelRendererTurbo(this, 193, 81, textureX, textureY); // Box 220
		bodyModel[111] = new ModelRendererTurbo(this, 209, 81, textureX, textureY); // Box 221
		bodyModel[112] = new ModelRendererTurbo(this, 113, 81, textureX, textureY); // Box 162
		bodyModel[113] = new ModelRendererTurbo(this, 417, 97, textureX, textureY); // Box 163
		bodyModel[114] = new ModelRendererTurbo(this, 137, 81, textureX, textureY); // Box 164
		bodyModel[115] = new ModelRendererTurbo(this, 441, 97, textureX, textureY); // Box 172
		bodyModel[116] = new ModelRendererTurbo(this, 473, 97, textureX, textureY); // Box 173
		bodyModel[117] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Box 174
		bodyModel[118] = new ModelRendererTurbo(this, 49, 113, textureX, textureY); // Box 175
		bodyModel[119] = new ModelRendererTurbo(this, 97, 113, textureX, textureY); // Box 176
		bodyModel[120] = new ModelRendererTurbo(this, 497, 97, textureX, textureY); // Box 193
		bodyModel[121] = new ModelRendererTurbo(this, 369, 105, textureX, textureY); // Box 194
		bodyModel[122] = new ModelRendererTurbo(this, 337, 57, textureX, textureY); // Box 195
		bodyModel[123] = new ModelRendererTurbo(this, 457, 105, textureX, textureY); // Box 196
		bodyModel[124] = new ModelRendererTurbo(this, 289, 97, textureX, textureY); // Box 197
		bodyModel[125] = new ModelRendererTurbo(this, 249, 49, textureX, textureY); // Box 198
		bodyModel[126] = new ModelRendererTurbo(this, 449, 57, textureX, textureY); // Box 199
		bodyModel[127] = new ModelRendererTurbo(this, 65, 73, textureX, textureY); // Box 211
		bodyModel[128] = new ModelRendererTurbo(this, 201, 65, textureX, textureY); // Box 212
		bodyModel[129] = new ModelRendererTurbo(this, 121, 113, textureX, textureY); // Box 216
		bodyModel[130] = new ModelRendererTurbo(this, 145, 65, textureX, textureY); // Box 217
		bodyModel[131] = new ModelRendererTurbo(this, 137, 113, textureX, textureY); // Box 347
		bodyModel[132] = new ModelRendererTurbo(this, 225, 81, textureX, textureY); // Box 222
		bodyModel[133] = new ModelRendererTurbo(this, 249, 81, textureX, textureY); // Box 223
		bodyModel[134] = new ModelRendererTurbo(this, 273, 81, textureX, textureY); // Box 224
		bodyModel[135] = new ModelRendererTurbo(this, 289, 81, textureX, textureY); // Box 225
		bodyModel[136] = new ModelRendererTurbo(this, 65, 97, textureX, textureY); // Box 226
		bodyModel[137] = new ModelRendererTurbo(this, 297, 97, textureX, textureY); // Box 227
		bodyModel[138] = new ModelRendererTurbo(this, 321, 97, textureX, textureY); // Box 228
		bodyModel[139] = new ModelRendererTurbo(this, 337, 97, textureX, textureY); // Box 229
		bodyModel[140] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 199
		bodyModel[141] = new ModelRendererTurbo(this, 161, 113, textureX, textureY); // Box 200
		bodyModel[142] = new ModelRendererTurbo(this, 241, 81, textureX, textureY); // Box 31
		bodyModel[143] = new ModelRendererTurbo(this, 233, 65, textureX, textureY, "lamp"); // Box 247 lamp
		bodyModel[144] = new ModelRendererTurbo(this, 273, 65, textureX, textureY, "lamp"); // Box 248 lamp
		bodyModel[145] = new ModelRendererTurbo(this, 265, 81, textureX, textureY); // Box 204
		bodyModel[146] = new ModelRendererTurbo(this, 41, 113, textureX, textureY); // Box 205
		bodyModel[147] = new ModelRendererTurbo(this, 369, 81, textureX, textureY); // Box 206
		bodyModel[148] = new ModelRendererTurbo(this, 353, 105, textureX, textureY); // Box 207
		bodyModel[149] = new ModelRendererTurbo(this, 49, 81, textureX, textureY); // Box 208
		bodyModel[150] = new ModelRendererTurbo(this, 353, 65, textureX, textureY); // Box 209
		bodyModel[151] = new ModelRendererTurbo(this, 329, 81, textureX, textureY); // Box 210
		bodyModel[152] = new ModelRendererTurbo(this, 33, 73, textureX, textureY); // Box 211
		bodyModel[153] = new ModelRendererTurbo(this, 177, 113, textureX, textureY); // Box 212
		bodyModel[154] = new ModelRendererTurbo(this, 201, 113, textureX, textureY); // Box 232
		bodyModel[155] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 233
		bodyModel[156] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 234
		bodyModel[157] = new ModelRendererTurbo(this, 497, 81, textureX, textureY); // Box 155
		bodyModel[158] = new ModelRendererTurbo(this, 25, 89, textureX, textureY); // Box 172
		bodyModel[159] = new ModelRendererTurbo(this, 225, 113, textureX, textureY); // Box 31
		bodyModel[160] = new ModelRendererTurbo(this, 161, 73, textureX, textureY, "lamp"); // Box 247 lamp
		bodyModel[161] = new ModelRendererTurbo(this, 153, 81, textureX, textureY, "lamp"); // Box 248 lamp
		bodyModel[162] = new ModelRendererTurbo(this, 473, 81, textureX, textureY, "lamp"); // Box 241 glow liveryimg 2
		bodyModel[163] = new ModelRendererTurbo(this, 1, 89, textureX, textureY, "lamp"); // Box 242 glow liveryimg 2
		bodyModel[164] = new ModelRendererTurbo(this, 241, 113, textureX, textureY); // Box 223
		bodyModel[165] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 224
		bodyModel[166] = new ModelRendererTurbo(this, 249, 113, textureX, textureY); // Box 225
		bodyModel[167] = new ModelRendererTurbo(this, 337, 113, textureX, textureY); // Box 226 alaska bit
		bodyModel[168] = new ModelRendererTurbo(this, 377, 113, textureX, textureY); // Box 227 alaska bit
		bodyModel[169] = new ModelRendererTurbo(this, 401, 113, textureX, textureY); // Box 228
		bodyModel[170] = new ModelRendererTurbo(this, 401, 121, textureX, textureY); // Box 229
		bodyModel[171] = new ModelRendererTurbo(this, 425, 113, textureX, textureY); // Box 230
		bodyModel[172] = new ModelRendererTurbo(this, 473, 113, textureX, textureY); // Box 231
		bodyModel[173] = new ModelRendererTurbo(this, 177, 121, textureX, textureY); // Box 232
		bodyModel[174] = new ModelRendererTurbo(this, 201, 121, textureX, textureY); // Box 233
		bodyModel[175] = new ModelRendererTurbo(this, 225, 121, textureX, textureY); // Box 234
		bodyModel[176] = new ModelRendererTurbo(this, 353, 121, textureX, textureY); // Box 235
		bodyModel[177] = new ModelRendererTurbo(this, 97, 129, textureX, textureY); // Box 236 door fireman side
		bodyModel[178] = new ModelRendererTurbo(this, 113, 129, textureX, textureY); // Box 237
		bodyModel[179] = new ModelRendererTurbo(this, 169, 129, textureX, textureY); // Box 238
		bodyModel[180] = new ModelRendererTurbo(this, 137, 9, textureX, textureY); // Box 239
		bodyModel[181] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 240
		bodyModel[182] = new ModelRendererTurbo(this, 497, 113, textureX, textureY); // Box 241 alaska bit
		bodyModel[183] = new ModelRendererTurbo(this, 353, 81, textureX, textureY); // Box 122
		bodyModel[184] = new ModelRendererTurbo(this, 465, 89, textureX, textureY, "lamp"); // Box 154 lamp
		bodyModel[185] = new ModelRendererTurbo(this, 505, 89, textureX, textureY, "lamp"); // Box 155 lamp
		bodyModel[186] = new ModelRendererTurbo(this, 401, 9, textureX, textureY); // Box 250
		bodyModel[187] = new ModelRendererTurbo(this, 201, 129, textureX, textureY); // Box 251
		bodyModel[188] = new ModelRendererTurbo(this, 217, 129, textureX, textureY); // Box 314 door swing right
		bodyModel[189] = new ModelRendererTurbo(this, 233, 129, textureX, textureY); // Box 253
		bodyModel[190] = new ModelRendererTurbo(this, 257, 129, textureX, textureY); // Box 254
		bodyModel[191] = new ModelRendererTurbo(this, 49, 97, textureX, textureY); // Box 78
		bodyModel[192] = new ModelRendererTurbo(this, 409, 97, textureX, textureY, "lamp"); // Box 189 lamp
		bodyModel[193] = new ModelRendererTurbo(this, 433, 97, textureX, textureY, "lamp"); // Box 150 lamp
		bodyModel[194] = new ModelRendererTurbo(this, 17, 105, textureX, textureY); // Box 151
		bodyModel[195] = new ModelRendererTurbo(this, 361, 33, textureX, textureY); // Box 129
		bodyModel[196] = new ModelRendererTurbo(this, 249, 121, textureX, textureY); // Box 131
		bodyModel[197] = new ModelRendererTurbo(this, 457, 49, textureX, textureY); // Box 132
		bodyModel[198] = new ModelRendererTurbo(this, 313, 57, textureX, textureY); // Box 231
		bodyModel[199] = new ModelRendererTurbo(this, 345, 57, textureX, textureY); // Box 214
		bodyModel[200] = new ModelRendererTurbo(this, 33, 73, textureX, textureY); // Box 215
		bodyModel[201] = new ModelRendererTurbo(this, 49, 25, textureX, textureY); // Box 265
		bodyModel[202] = new ModelRendererTurbo(this, 313, 113, textureX, textureY); // Box 266
		bodyModel[203] = new ModelRendererTurbo(this, 377, 113, textureX, textureY); // Box 267
		bodyModel[204] = new ModelRendererTurbo(this, 377, 113, textureX, textureY); // Box 268
		bodyModel[205] = new ModelRendererTurbo(this, 273, 129, textureX, textureY); // Box 131
		bodyModel[206] = new ModelRendererTurbo(this, 345, 129, textureX, textureY); // Box 236
		bodyModel[207] = new ModelRendererTurbo(this, 425, 129, textureX, textureY); // Box 86
		bodyModel[208] = new ModelRendererTurbo(this, 89, 113, textureX, textureY); // Box 272
		bodyModel[209] = new ModelRendererTurbo(this, 153, 113, textureX, textureY); // Box 209
		bodyModel[210] = new ModelRendererTurbo(this, 281, 113, textureX, textureY); // Box 210
		bodyModel[211] = new ModelRendererTurbo(this, 385, 105, textureX, textureY, "lamp"); // Box 211 glow
		bodyModel[212] = new ModelRendererTurbo(this, 433, 105, textureX, textureY); // Box 212
		bodyModel[213] = new ModelRendererTurbo(this, 449, 113, textureX, textureY, "lamp"); // Box 213 glow
		bodyModel[214] = new ModelRendererTurbo(this, 281, 121, textureX, textureY); // Box 214
		bodyModel[215] = new ModelRendererTurbo(this, 29, 99, textureX, textureY, "lamp"); // Box 162 glowey boi
		bodyModel[216] = new ModelRendererTurbo(this, 26, 103, textureX, textureY); // Box 165
		bodyModel[217] = new ModelRendererTurbo(this, 1, 138, textureX, textureY); // Box 217 arr winterization hatch
		bodyModel[218] = new ModelRendererTurbo(this, 36, 139, textureX, textureY); // Box 218 FR
		bodyModel[219] = new ModelRendererTurbo(this, 114, 140, textureX, textureY); // Box 219 FR
		bodyModel[220] = new ModelRendererTurbo(this, 45, 147, textureX, textureY); // Box 220 FR
		bodyModel[221] = new ModelRendererTurbo(this, 114, 146, textureX, textureY); // Box 221 FR
		bodyModel[222] = new ModelRendererTurbo(this, 229, 144, textureX, textureY); // Box 222 FR
		bodyModel[223] = new ModelRendererTurbo(this, 167, 147, textureX, textureY); // Box 223 FR
		bodyModel[224] = new ModelRendererTurbo(this, 167, 141, textureX, textureY); // Box 224 FR
		bodyModel[225] = new ModelRendererTurbo(this, 167, 152, textureX, textureY); // Box 225 FR
		bodyModel[226] = new ModelRendererTurbo(this, 2, 151, textureX, textureY); // Box 226 FR
		bodyModel[227] = new ModelRendererTurbo(this, 22, 151, textureX, textureY); // Box 227 FR
		bodyModel[228] = new ModelRendererTurbo(this, 44, 157, textureX, textureY); // Box 228 FR
		bodyModel[229] = new ModelRendererTurbo(this, 67, 157, textureX, textureY); // Box 229 FR
		bodyModel[230] = new ModelRendererTurbo(this, 67, 164, textureX, textureY); // Box 230 FR
		bodyModel[231] = new ModelRendererTurbo(this, 44, 164, textureX, textureY); // Box 231 FR
		bodyModel[232] = new ModelRendererTurbo(this, 33, 164, textureX, textureY); // Box 355
		bodyModel[233] = new ModelRendererTurbo(this, 26, 165, textureX, textureY); // Box 356
		bodyModel[234] = new ModelRendererTurbo(this, 96, 152, textureX, textureY); // Box 234 atsf thing

		bodyModel[0].addBox(0F, 0F, 0F, 89, 2, 4, 0F); // Box 31
		bodyModel[0].setRotationPoint(-45F, -1F, -11F);

		bodyModel[1].addBox(0F, 0F, 0F, 89, 2, 4, 0F); // Box 34
		bodyModel[1].setRotationPoint(-45F, -1F, 7F);

		bodyModel[2].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 81
		bodyModel[2].setRotationPoint(31F, 1F, -11F);

		bodyModel[3].addBox(0F, 0F, 0F, 2, 2, 4, 0F); // Box 83
		bodyModel[3].setRotationPoint(-13F, 1F, -11F);

		bodyModel[4].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 84
		bodyModel[4].setRotationPoint(-33F, 1F, -11F);

		bodyModel[5].addBox(-1F, 0F, 0F, 24, 22, 14, 0F); // Box 96
		bodyModel[5].setRotationPoint(-22F, -23F, -7F);

		bodyModel[6].addBox(0F, 0F, 0F, 20, 21, 14, 0F); // Box 97
		bodyModel[6].setRotationPoint(1F, -22F, -7F);

		bodyModel[7].addShapeBox(3F, 0F, 0F, 1, 17, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 100
		bodyModel[7].setRotationPoint(-27F, -21F, -11F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 2, 22, 8, 0F,1F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -1F, 1F, 0F, -1F); // Box 124
		bodyModel[8].setRotationPoint(45F, -23F, -7F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 2, 22, 8, 0F,1F, 0F, -1F, 0F, 0F, -1F, -3F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -1F, 0F, 0F, -1F, -3F, 0F, 0F, 1F, 0F, 0F); // Box 130
		bodyModel[9].setRotationPoint(45F, -23F, -1F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 3, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 138
		bodyModel[10].setRotationPoint(-23F, -5F, 7F);

		bodyModel[11].addBox(0F, 0F, 0F, 61, 8, 0, 0F); // Box 122
		bodyModel[11].setRotationPoint(-17F, -9F, 11.01F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F); // Box 125
		bodyModel[12].setRotationPoint(-21F, -13F, 11.01F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 16, 8, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[13].setRotationPoint(28F, -9F, -11.01F);

		bodyModel[14].addBox(0F, 0F, -9F, 31, 2, 4, 0F); // Box 76
		bodyModel[14].setRotationPoint(-16F, 3F, -2F);

		bodyModel[15].addShapeBox(0F, -1F, -9F, 31, 2, 21, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 85
		bodyModel[15].setRotationPoint(-16F, 8F, -1.5F);

		bodyModel[16].addShapeBox(0F, -2F, -9F, 31, 2, 24, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F); // Box 85
		bodyModel[16].setRotationPoint(-16F, 7F, -3F);

		bodyModel[17].addBox(0F, 0F, 0F, 31, 2, 4, 0F); // Box 138
		bodyModel[17].setRotationPoint(-16F, 3F, 7F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 15, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 170
		bodyModel[18].setRotationPoint(-3F, 1F, 10F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 15, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 177
		bodyModel[19].setRotationPoint(-3F, 2F, 10F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 15, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 187
		bodyModel[20].setRotationPoint(-3F, 1F, 9F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 15, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 188
		bodyModel[21].setRotationPoint(-3F, 2F, 9F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0.25F, -0.35F, 0F); // Box 190
		bodyModel[22].setRotationPoint(-34.5F, -21F, -11F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 1, 8, 11, 0F,-1.5F, 0F, 0F, 1.5F, 0F, 0F, 4.5F, 0F, 0F, -4.5F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F); // Box 123
		bodyModel[23].setRotationPoint(-39F, -21F, 0F);

		bodyModel[24].addShapeBox(3F, 0F, 0F, 9, 8, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 119
		bodyModel[24].setRotationPoint(-36F, -21F, -11F);

		bodyModel[25].addBox(3F, 0F, 0F, 12, 9, 1, 0F); // Box 121
		bodyModel[25].setRotationPoint(-39F, -13F, 10F);

		bodyModel[26].addBox(0F, 0F, 0F, 1, 11, 20, 0F); // Box 131
		bodyModel[26].setRotationPoint(-36F, -15F, -10F);

		bodyModel[27].addTrapezoid(0F, 0F, 0.2F, 1, 15, 5, 0F, 0F, ModelRendererTurbo.MR_TOP); // Box 69 door engineer side
		bodyModel[27].setRotationPoint(-48.25F, -16F, 1.1F);
		bodyModel[27].rotateAngleY = -0.29670597F;

		bodyModel[28].addShapeBox(-1F, 0F, 0F, 19, 1, 14, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 134
		bodyModel[28].setRotationPoint(-22F, -24F, -7F);

		bodyModel[29].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 135
		bodyModel[29].setRotationPoint(-33F, 1F, 7F);

		bodyModel[30].addBox(0F, 0F, 0F, 2, 2, 4, 0F); // Box 136
		bodyModel[30].setRotationPoint(-13F, 1F, 7F);

		bodyModel[31].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 138
		bodyModel[31].setRotationPoint(31F, 1F, 7F);

		bodyModel[32].addBox(0F, 0F, -9F, 31, 2, 14, 0F); // Box 139
		bodyModel[32].setRotationPoint(-16F, 3F, 2F);

		bodyModel[33].addBox(0F, 0F, 0F, 13, 3, 22, 0F); // Box 137
		bodyModel[33].setRotationPoint(-36F, -4F, -11F);

		bodyModel[34].addShapeBox(3F, 0F, 0F, 1, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 136
		bodyModel[34].setRotationPoint(-27F, -6F, 7F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 3, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 138
		bodyModel[35].setRotationPoint(-20F, -3F, 7F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 11, 2, 11, 0F,0F, 0F, 0F, -2.75F, 0F, 0F, 0F, 0F, -1F, -2.72F, 0F, -2F, 0F, 0F, 0F, -3.5F, 0F, 0F, -0.5F, 0F, 0F, -3F, 0F, -1F); // Box 143
		bodyModel[36].setRotationPoint(-48F, -15F, 0F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 1, 12, 22, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 148
		bodyModel[37].setRotationPoint(-37F, -13F, -11F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 13, 3, 12, 0F,-0.13F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.13F, -0.5F, 0F, -0.13F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.13F, 0F, 0F); // Box 154
		bodyModel[38].setRotationPoint(-36F, -24F, -6F);

		bodyModel[39].addBox(3F, 0F, 0F, 12, 9, 1, 0F); // Box 155
		bodyModel[39].setRotationPoint(-39F, -13F, -11F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-1.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, -0.85F, 0F, 0F, 0F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.25F, 0F, 0F); // Box 156
		bodyModel[40].setRotationPoint(-36.5F, -16F, -11F);

		bodyModel[41].addShapeBox(-1F, 0F, 0F, 20, 1, 14, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 157
		bodyModel[41].setRotationPoint(2F, -23F, -7F);

		bodyModel[42].addBox(0F, 0F, 0F, 23, 22, 14, 0F); // Box 158
		bodyModel[42].setRotationPoint(21F, -23F, -7F);

		bodyModel[43].addBox(0F, 0F, 0F, 6, 1, 6, 0F); // Box 164
		bodyModel[43].setRotationPoint(36F, -24F, -3F);

		bodyModel[44].addBox(0F, 0F, 0F, 6, 1, 6, 0F); // Box 165
		bodyModel[44].setRotationPoint(29F, -24F, -3F);

		bodyModel[45].addBox(0F, 0F, 0F, 6, 1, 6, 0F); // Box 166
		bodyModel[45].setRotationPoint(22F, -24F, -3F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 15, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 167
		bodyModel[46].setRotationPoint(-3F, 1F, -10F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 15, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[47].setRotationPoint(-3F, 1F, -11F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 15, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 169
		bodyModel[48].setRotationPoint(-3F, 2F, -11F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 15, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 170
		bodyModel[49].setRotationPoint(-3F, 2F, -10F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 8, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 171
		bodyModel[50].setRotationPoint(-21F, -24F, -4F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 7, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 1F, 0F, 1F); // Box 172
		bodyModel[51].setRotationPoint(-11F, -24.5F, -4F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 3, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Exhaust
		bodyModel[52].setRotationPoint(-3F, -24.5F, -3F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 12, 6, 5, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -5F, -0.5F, -0.5F, -5F, -0.5F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -0.5F, -3F, 0F); // Box 174
		bodyModel[53].setRotationPoint(-35F, -24F, 6F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 1, 3, 6, 0F,0.63F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, 0.63F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 176
		bodyModel[54].setRotationPoint(-36.87F, -24F, 0F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 1, 3, 6, 0F,-1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.63F, -0.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.63F, 0F, 0F); // Box 177
		bodyModel[55].setRotationPoint(-36.87F, -24F, -6F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 11, 6, 5, 0F,0.5F, -0.5F, -5F, 0F, -0.5F, -5F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0.5F, -3F, 0F); // Box 178
		bodyModel[56].setRotationPoint(-34F, -24F, -11F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 8, 2, 4, 0F,1.79F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 3F, 0F, 0F, 1.79F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 3F, 0F, 0F); // Box 152
		bodyModel[57].setRotationPoint(-45F, -17F, -4F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 1, 6, 5, 0F,0.37F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -5F, 0.37F, -0.5F, -5F, 0.37F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -1F, -3F, 0F); // Box 123
		bodyModel[58].setRotationPoint(-35.5F, -24F, 6F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 1, 6, 5, 0F,0.37F, -0.5F, -5F, 0F, -0.5F, -5F, 0F, -0.5F, 0F, 0.37F, -0.5F, 0F, -1F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0.37F, -3F, 0F); // Box 124
		bodyModel[59].setRotationPoint(-35.5F, -24F, -11F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 1, 8, 11, 0F,-4.5F, 0F, 0F, 4.5F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F); // Box 125
		bodyModel[60].setRotationPoint(-39F, -21F, -11F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.73F, 0F, 0F, -0.125F, -0.65F, 0F, 0F, -0.65F, 0F, 0F, -0.65F, 0F, 0.17F, -0.65F, 0F); // Box 190
		bodyModel[61].setRotationPoint(-35.5F, -18.35F, -11F);

		bodyModel[62].addShapeBox(3F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, -0.13F, 0F, 0F, -0.13F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.13F, 0F, 0F, -0.13F, 0F, 0F, 0F, 0F, 0F); // Box 130
		bodyModel[62].setRotationPoint(-38.37F, -16F, -11F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.65F, 0F, 0F, -0.65F, 0F, 0F, -0.65F, 0F, 0F, -0.65F, 0F); // Box 132
		bodyModel[63].setRotationPoint(-34.5F, -18.35F, -11F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0.25F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F); // Box 190
		bodyModel[64].setRotationPoint(-34.5F, -21F, 10F);

		bodyModel[65].addShapeBox(3F, 0F, 0F, 9, 8, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 119
		bodyModel[65].setRotationPoint(-36F, -21F, 10F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.85F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, -1.125F, 0F, 0F, 0.25F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0F, 0F, 0F); // Box 156
		bodyModel[66].setRotationPoint(-36.5F, -16F, 10F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.73F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0.17F, -0.65F, 0F, 0F, -0.65F, 0F, 0F, -0.65F, 0F, -0.128F, -0.65F, 0F); // Box 190
		bodyModel[67].setRotationPoint(-35.5F, -18.35F, 10F);

		bodyModel[68].addShapeBox(3F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, -0.13F, 0F, 0F, -0.13F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.13F, 0F, 0F, -0.13F, 0F, 0F, 0F, 0F, 0F); // Box 130
		bodyModel[68].setRotationPoint(-38.37F, -16F, 10F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.65F, 0F, 0F, -0.65F, 0F, 0F, -0.65F, 0F, 0F, -0.65F, 0F); // Box 132
		bodyModel[69].setRotationPoint(-34.5F, -18.35F, 10F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 8, 5, 7, 0F,1.79F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -6F, 1.79F, 0F, -7F, 1.79F, -3F, 0F, 0F, -3F, -1F, 0F, -3F, -1F, 0.28F, -3F, -2F); // Box 128
		bodyModel[70].setRotationPoint(-45F, -17F, 4F);

		bodyModel[71].addShapeBox(3F, 0F, 0F, 6, 11, 4, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 130
		bodyModel[71].setRotationPoint(-13F, -17F, -11F);

		bodyModel[72].addShapeBox(3F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 131
		bodyModel[72].setRotationPoint(-13F, -18F, -8F);

		bodyModel[73].addShapeBox(3F, 0F, 0F, 6, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 132
		bodyModel[73].setRotationPoint(-13F, -6F, -11F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 2, 5, 5, 0F,0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F); // Box 133
		bodyModel[74].setRotationPoint(-37F, -17F, -10F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 2, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 135
		bodyModel[75].setRotationPoint(-37F, -17F, -5F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 8, 5, 7, 0F,1.79F, 0F, -7F, 0F, 0F, -6F, 0F, 0F, -1F, 1.79F, 0F, 0F, 0.28F, -3F, -2F, 0F, -3F, -1F, 0F, -3F, -1F, 1.79F, -3F, 0F); // Box 146
		bodyModel[76].setRotationPoint(-45F, -17F, -11F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 8, 2, 4, 0F,3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 1.79F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 1.79F, 0F, 0F); // Box 147
		bodyModel[77].setRotationPoint(-45F, -17F, 0F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 2, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 148
		bodyModel[78].setRotationPoint(-37F, -17F, 0F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 2, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F); // Box 149
		bodyModel[79].setRotationPoint(-37F, -17F, 5F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 11, 2, 11, 0F,-2.72F, 0F, -2F, 0F, 0F, -1F, -2.75F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -1F, -0.5F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F); // Box 150
		bodyModel[80].setRotationPoint(-48F, -15F, -11F);

		bodyModel[81].addBox(0F, 0F, 0F, 103, 4, 14, 0F); // Box 33
		bodyModel[81].setRotationPoint(-52F, -1F, -7F);

		bodyModel[82].addBox(0F, 0F, 0F, 0, 8, 1, 0F); // Box 45
		bodyModel[82].setRotationPoint(-52F, -9F, -7F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 1, 7, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 61
		bodyModel[83].setRotationPoint(-45F, 1F, -11F);

		bodyModel[84].addBox(0F, 0F, 0F, 0, 6, 1, 0F); // Box 139
		bodyModel[84].setRotationPoint(-52F, -1F, 10F);

		bodyModel[85].addBox(0F, 0F, 0F, 0, 6, 1, 0F); // Box 140
		bodyModel[85].setRotationPoint(-52F, -1F, -11F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 0, 8, 4, 0F,0F, -2F, 1F, 0F, -2F, 1F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 143
		bodyModel[86].setRotationPoint(-52F, -9F, 8F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 1, 9, 4, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 145
		bodyModel[87].setRotationPoint(-46F, -1F, -11F);

		bodyModel[88].addBox(0F, 0F, 0F, 0, 8, 20, 0F); // Box 147
		bodyModel[88].setRotationPoint(-52.01F, -1F, -10F);

		bodyModel[89].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 4
		bodyModel[89].setRotationPoint(-56F, 3F, -1.5F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[90].setRotationPoint(-53F, 2.5F, -2F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 3, 2, 10, 0F,0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F); // Box 4
		bodyModel[91].setRotationPoint(-55F, 5F, 0F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F,0.5F, 0F, 0F, -3F, 0F, 0F, -1F, 1F, 0F, -1.5F, 1F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F); // Box 4
		bodyModel[92].setRotationPoint(-55F, 3F, 2F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 3, 2, 10, 0F,0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 1F, 0F, 0F, -3.5F, 0F, 0F, -1F, 0F, -1F, -1.5F, 0F, -1F); // Box 4
		bodyModel[93].setRotationPoint(-55F, 7F, 0F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 3, 2, 10, 0F,-2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[94].setRotationPoint(-55F, 5F, -10F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F,-2F, 1F, 0F, -0.5F, 1F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 0F, 0F, -1F, 0F, 0F); // Box 4
		bodyModel[95].setRotationPoint(-55.5F, 3F, -10F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 3, 2, 10, 0F,-2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, -1F, -1F, 0F, -1F, -3.5F, 0F, 0F, 1F, 0F, 0F); // Box 4
		bodyModel[96].setRotationPoint(-55F, 7F, -10F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 1, 9, 4, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 170
		bodyModel[97].setRotationPoint(-46F, -1F, 7F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 1, 7, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 171
		bodyModel[98].setRotationPoint(-45F, 1F, 7F);

		bodyModel[99].addBox(0F, 0F, 0F, 7, 0, 3, 0F); // Box 173
		bodyModel[99].setRotationPoint(-52F, 8F, -11F);

		bodyModel[100].addBox(0F, 0F, 0F, 7, 0, 3, 0F); // Box 174
		bodyModel[100].setRotationPoint(-52F, 5.5F, -10F);

		bodyModel[101].addBox(0F, 0F, 0F, 7, 0, 2, 0F); // Box 175
		bodyModel[101].setRotationPoint(-52F, 3F, -9F);

		bodyModel[102].addBox(0F, 0F, 0F, 6, 0, 3, 0F); // Box 176
		bodyModel[102].setRotationPoint(-52F, 1F, -8F);

		bodyModel[103].addBox(0F, 0F, 0F, 0, 8, 1, 0F); // Box 188
		bodyModel[103].setRotationPoint(-52F, -9F, 6F);

		bodyModel[104].addBox(0F, 0F, 0F, 0, 8, 6, 0F); // Box 189
		bodyModel[104].setRotationPoint(-53.5F, -9F, -3F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 0, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F); // Box 191
		bodyModel[105].setRotationPoint(-52F, -9F, -6F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 0, 1, 3, 0F,1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 192
		bodyModel[106].setRotationPoint(-52F, -9F, 3F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 3, 7, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 346
		bodyModel[107].setRotationPoint(-52F, 1F, -3F);

		bodyModel[108].addBox(0F, 0F, 0F, 7, 0, 3, 0F); // Box 218
		bodyModel[108].setRotationPoint(-52F, 5.5F, 7F);

		bodyModel[109].addBox(0F, 0F, 0F, 7, 0, 3, 0F); // Box 219
		bodyModel[109].setRotationPoint(-52F, 8F, 8F);

		bodyModel[110].addBox(0F, 0F, 0F, 7, 0, 2, 0F); // Box 220
		bodyModel[110].setRotationPoint(-52F, 3F, 7F);

		bodyModel[111].addBox(0F, 0F, 0F, 6, 0, 3, 0F); // Box 221
		bodyModel[111].setRotationPoint(-52F, 1F, 5F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 162
		bodyModel[112].setRotationPoint(-54F, -1F, -7F);

		bodyModel[113].addShapeBox(0F, 0F, -1F, 2, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 163
		bodyModel[113].setRotationPoint(-54F, -1F, -2F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 164
		bodyModel[114].setRotationPoint(-54F, -1F, 3F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 0, 8, 4, 0F,0F, 0F, -5F, 0F, 0F, -5F, 0F, -2F, 1F, 0F, -2F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 172
		bodyModel[115].setRotationPoint(-52F, -9F, -12F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 8, 12, 1, 0F,-0.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 173
		bodyModel[116].setRotationPoint(-45.5F, -13F, -11F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 11, 12, 10, 0F,-3F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 174
		bodyModel[117].setRotationPoint(-48F, -13F, -10F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 11, 12, 10, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -3F, 0F, 0F); // Box 175
		bodyModel[118].setRotationPoint(-48F, -13F, 0F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 8, 12, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F); // Box 176
		bodyModel[119].setRotationPoint(-45.5F, -13F, 10F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 1, 9, 4, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 193
		bodyModel[120].setRotationPoint(44F, -1F, 7F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 1, 7, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 194
		bodyModel[121].setRotationPoint(43F, 1F, 7F);

		bodyModel[122].addBox(0F, 0F, 0F, 1, 1, 4, 0F); // Box 195
		bodyModel[122].setRotationPoint(43F, 0F, 7F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 1, 7, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 196
		bodyModel[123].setRotationPoint(43F, 1F, -11F);

		bodyModel[124].addBox(0F, 0F, 0F, 0, 8, 20, 0F); // Box 197
		bodyModel[124].setRotationPoint(51.01F, -1F, -10F);

		bodyModel[125].addBox(0F, 0F, 0F, 0, 6, 1, 0F); // Box 198
		bodyModel[125].setRotationPoint(51F, -1F, -11F);

		bodyModel[126].addBox(0F, 0F, 0F, 0, 6, 1, 0F); // Box 199
		bodyModel[126].setRotationPoint(51F, -1F, 10F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 211
		bodyModel[127].setRotationPoint(51F, 2.5F, -2F);

		bodyModel[128].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 212
		bodyModel[128].setRotationPoint(52F, 3F, -1.5F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 1, 9, 4, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 216
		bodyModel[129].setRotationPoint(44F, -1F, -11F);

		bodyModel[130].addBox(0F, 0F, 0F, 1, 1, 4, 0F); // Box 217
		bodyModel[130].setRotationPoint(43F, 0F, -11F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 3, 7, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 347
		bodyModel[131].setRotationPoint(48F, 1F, -3F);

		bodyModel[132].addBox(0F, 0F, 0F, 7, 0, 3, 0F); // Box 222
		bodyModel[132].setRotationPoint(44F, 8F, 8F);

		bodyModel[133].addBox(0F, 0F, 0F, 7, 0, 3, 0F); // Box 223
		bodyModel[133].setRotationPoint(44F, 5.5F, 7F);

		bodyModel[134].addBox(0F, 0F, 0F, 7, 0, 2, 0F); // Box 224
		bodyModel[134].setRotationPoint(44F, 3F, 7F);

		bodyModel[135].addBox(0F, 0F, 0F, 6, 0, 3, 0F); // Box 225
		bodyModel[135].setRotationPoint(45F, 1F, 5F);

		bodyModel[136].addBox(0F, 0F, 0F, 7, 0, 3, 0F); // Box 226
		bodyModel[136].setRotationPoint(44F, 8F, -11F);

		bodyModel[137].addBox(0F, 0F, 0F, 7, 0, 3, 0F); // Box 227
		bodyModel[137].setRotationPoint(44F, 5.5F, -10F);

		bodyModel[138].addBox(0F, 0F, 0F, 7, 0, 2, 0F); // Box 228
		bodyModel[138].setRotationPoint(44F, 3F, -9F);

		bodyModel[139].addBox(0F, 0F, 0F, 6, 0, 3, 0F); // Box 229
		bodyModel[139].setRotationPoint(45F, 1F, -8F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 0, 8, 4, 0F,0F, 0F, -5F, 0F, 0F, -5F, 0F, -2F, 1F, 0F, -2F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 199
		bodyModel[140].setRotationPoint(51F, -9F, -12F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 0, 8, 4, 0F,0F, -2F, 1F, 0F, -2F, 1F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 200
		bodyModel[141].setRotationPoint(51F, -9F, 8F);

		bodyModel[142].addBox(0F, 0F, 0F, 2, 2, 4, 0F); // Box 31
		bodyModel[142].setRotationPoint(45.25F, -20.05F, -2F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 247 lamp
		bodyModel[143].setRotationPoint(46.5F, -20.05F, -2F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 248 lamp
		bodyModel[144].setRotationPoint(46.5F, -20.05F, 0F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 204
		bodyModel[145].setRotationPoint(51F, -1F, 3F);

		bodyModel[146].addShapeBox(0F, 0F, -1F, 2, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 205
		bodyModel[146].setRotationPoint(51F, -1F, -2F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 206
		bodyModel[147].setRotationPoint(51F, -1F, -7F);

		bodyModel[148].addBox(0F, 0F, 0F, 0, 8, 6, 0F); // Box 207
		bodyModel[148].setRotationPoint(52.5F, -9F, -3F);

		bodyModel[149].addBox(0F, 0F, 0F, 0, 8, 1, 0F); // Box 208
		bodyModel[149].setRotationPoint(51F, -9F, -7F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 0, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F); // Box 209
		bodyModel[150].setRotationPoint(51F, -9F, -6F);

		bodyModel[151].addBox(0F, 0F, 0F, 0, 8, 1, 0F); // Box 210
		bodyModel[151].setRotationPoint(51F, -9F, 6F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 0, 1, 3, 0F,-1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 211
		bodyModel[152].setRotationPoint(51F, -9F, 3F);

		bodyModel[153].addBox(0F, 0F, 0F, 10, 5, 1, 0F); // Box 212
		bodyModel[153].setRotationPoint(-12F, -23F, -7.5F);

		bodyModel[154].addBox(0F, 0F, 0F, 5, 1, 4, 0F); // Box 232
		bodyModel[154].setRotationPoint(-33F, -24.5F, 1F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 233
		bodyModel[155].setRotationPoint(-33F, -24.5F, 6F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 234
		bodyModel[156].setRotationPoint(-33F, -24.5F, -6F);

		bodyModel[157].addBox(0F, 0F, 1F, 1, 2, 4, 0F); // Box 155
		bodyModel[157].setRotationPoint(-35.99F, -23F, -7.2F);
		bodyModel[157].rotateAngleY = 0.26179939F;

		bodyModel[158].addBox(0F, 0F, -5F, 1, 2, 4, 0F); // Box 172
		bodyModel[158].setRotationPoint(-35.99F, -23F, 7F);
		bodyModel[158].rotateAngleY = -0.26179939F;

		bodyModel[159].addBox(0F, 0F, 0F, 2, 2, 4, 0F); // Box 31
		bodyModel[159].setRotationPoint(-38F, -23F, -2F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 247 lamp
		bodyModel[160].setRotationPoint(-38.25F, -23F, -2F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 248 lamp
		bodyModel[161].setRotationPoint(-38.25F, -23F, 0F);

		bodyModel[162].addBox(0F, 0F, 1F, 0, 2, 4, 0F); // Box 241 glow liveryimg 2
		bodyModel[162].setRotationPoint(-36F, -23F, -7.2F);
		bodyModel[162].rotateAngleY = 0.26179939F;

		bodyModel[163].addBox(0F, 0F, -5F, 0, 2, 4, 0F); // Box 242 glow liveryimg 2
		bodyModel[163].setRotationPoint(-36F, -23F, 7F);
		bodyModel[163].rotateAngleY = -0.26179939F;

		bodyModel[164].addShapeBox(0F, 0F, 0F, 5, 1, 5, 0F,-0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 223
		bodyModel[164].setRotationPoint(-33F, -24.5F, -5F);

		bodyModel[165].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 224
		bodyModel[165].setRotationPoint(-28F, -24.5F, -6F);

		bodyModel[166].addBox(-1F, 0F, 0F, 5, 1, 14, 0F); // Box 225
		bodyModel[166].setRotationPoint(-3F, -24F, -7F);

		bodyModel[167].addBox(0F, 0F, 0F, 2, 10, 4, 0F); // Box 226 alaska bit
		bodyModel[167].setRotationPoint(-23F, -13F, -11F);

		bodyModel[168].addBox(0F, 0F, 0F, 5, 8, 4, 0F); // Box 227 alaska bit
		bodyModel[168].setRotationPoint(-21F, -11F, -11F);

		bodyModel[169].addBox(0F, 0F, 0F, 8, 4, 1, 0F); // Box 228
		bodyModel[169].setRotationPoint(-21F, -19F, -7.5F);

		bodyModel[170].addBox(0F, 0F, 0F, 49, 2, 4, 0F); // Box 229
		bodyModel[170].setRotationPoint(-23F, -3F, -11F);

		bodyModel[171].addBox(0F, 0F, 0F, 10, 6, 1, 0F); // Box 230
		bodyModel[171].setRotationPoint(21.5F, -22.5F, -7.5F);

		bodyModel[172].addBox(0F, 0F, 0F, 10, 6, 1, 0F); // Box 231
		bodyModel[172].setRotationPoint(32F, -22.5F, -7.5F);

		bodyModel[173].addBox(0F, 0F, 0F, 10, 6, 1, 0F); // Box 232
		bodyModel[173].setRotationPoint(32F, -22.5F, 6.5F);

		bodyModel[174].addBox(0F, 0F, 0F, 10, 6, 1, 0F); // Box 233
		bodyModel[174].setRotationPoint(21.5F, -22.5F, 6.5F);

		bodyModel[175].addBox(0F, 0F, 0F, 10, 5, 1, 0F); // Box 234
		bodyModel[175].setRotationPoint(-12F, -23F, 6.5F);

		bodyModel[176].addBox(0F, 0F, 0F, 8, 4, 1, 0F); // Box 235
		bodyModel[176].setRotationPoint(-21F, -19F, 6.5F);

		bodyModel[177].addTrapezoid(0F, 0F, -5.2F, 1, 15, 5, 0F, 0F, ModelRendererTurbo.MR_TOP); // Box 236 door fireman side
		bodyModel[177].setRotationPoint(-48.25F, -16F, -1.1F);
		bodyModel[177].rotateAngleY = 0.29670597F;

		bodyModel[178].addShapeBox(0F, 0F, 0F, 26, 8, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 237
		bodyModel[178].setRotationPoint(0F, -11F, -11.01F);

		bodyModel[179].addShapeBox(0F, 0F, 0F, 14, 11, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 238
		bodyModel[179].setRotationPoint(-17F, -14F, -11.01F);

		bodyModel[180].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F); // Box 239
		bodyModel[180].setRotationPoint(-3F, -14F, -11.01F);

		bodyModel[181].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 240
		bodyModel[181].setRotationPoint(26F, -11F, -11.01F);

		bodyModel[182].addShapeBox(0F, 0F, 0F, 6, 7, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 241 alaska bit
		bodyModel[182].setRotationPoint(-23F, -20F, -11.01F);

		bodyModel[183].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 122
		bodyModel[183].setRotationPoint(-48.5F, -16F, -1F);

		bodyModel[184].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 154 lamp
		bodyModel[184].setRotationPoint(-48.25F, -16F, -1F);

		bodyModel[185].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 155 lamp
		bodyModel[185].setRotationPoint(-48.25F, -14F, -1F);

		bodyModel[186].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F); // Box 250
		bodyModel[186].setRotationPoint(-14F, -14F, -11.01F);

		bodyModel[187].addShapeBox(0F, 0F, 0F, 6, 8, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 251
		bodyModel[187].setRotationPoint(-23F, -11F, -11.01F);

		bodyModel[188].addBox(-0.5F, 0F, -3.5F, 1, 15, 4, 0F); // Box 314 door swing right
		bodyModel[188].setRotationPoint(-23.5F, -21F, 10.5F);

		bodyModel[189].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F,-3F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 0F, 0F, -1F, 0F, 0F, -3F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 0F, 0F, -1F, 0F, 0F); // Box 253
		bodyModel[189].setRotationPoint(-55.5F, 4F, -10F);

		bodyModel[190].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F,-1F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, -3F, 0F, 0F); // Box 254
		bodyModel[190].setRotationPoint(-55.5F, 4F, 2F);

		bodyModel[191].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 78
		bodyModel[191].setRotationPoint(-53.25F, -3F, 4F);

		bodyModel[192].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 189 lamp
		bodyModel[192].setRotationPoint(-53.75F, -3F, 4F);

		bodyModel[193].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 150 lamp
		bodyModel[193].setRotationPoint(-53.75F, -3F, -6F);

		bodyModel[194].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 151
		bodyModel[194].setRotationPoint(-53.25F, -3F, -6F);

		bodyModel[195].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 129
		bodyModel[195].setRotationPoint(13.5F, -24.75F, -2F);

		bodyModel[196].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 131
		bodyModel[196].setRotationPoint(14F, -23F, -1.5F);

		bodyModel[197].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 132
		bodyModel[197].setRotationPoint(14F, -24.75F, 1F);

		bodyModel[198].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 231
		bodyModel[198].setRotationPoint(12.5F, -25F, -0.5F);

		bodyModel[199].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 214
		bodyModel[199].setRotationPoint(14F, -24F, -1.25F);

		bodyModel[200].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 215
		bodyModel[200].setRotationPoint(16.5F, -24F, 1F);
		bodyModel[200].rotateAngleY = -3.14159265F;

		bodyModel[201].addBox(0F, 0F, 0F, 0, 1, 22, 0F); // Box 265
		bodyModel[201].setRotationPoint(51.01F, 7F, -11F);

		bodyModel[202].addShapeBox(0F, 0F, 0F, 0, 1, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 266
		bodyModel[202].setRotationPoint(51.01F, 8F, -10F);

		bodyModel[203].addBox(0F, 0F, 0F, 0, 1, 22, 0F); // Box 267
		bodyModel[203].setRotationPoint(-52.01F, 7F, -11F);

		bodyModel[204].addShapeBox(0F, 0F, 0F, 0, 1, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 268
		bodyModel[204].setRotationPoint(-52.01F, 8F, -10F);

		bodyModel[205].addShapeBox(0F, 0F, 0F, 2, 2, 10, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 131
		bodyModel[205].setRotationPoint(-35F, -17F, -5F);

		bodyModel[206].addBox(0F, 0F, 0F, 4, 1, 12, 0F); // Box 236
		bodyModel[206].setRotationPoint(-35F, -15F, -6F);

		bodyModel[207].addBox(0F, 0F, 0F, 7, 10, 3, 0F); // Box 86
		bodyModel[207].setRotationPoint(-36.1F, -16F, -7F);
		bodyModel[207].rotateAngleY = -0.38397244F;

		bodyModel[208].addBox(0F, 0F, 0F, 2, 8, 0, 0F); // Box 272
		bodyModel[208].setRotationPoint(-23F, -13F, 11.01F);

		bodyModel[209].addBox(0F, 0F, -2F, 9, 0, 2, 0F); // Box 209
		bodyModel[209].setRotationPoint(-33F, -21F, -11F);
		bodyModel[209].rotateAngleX = 0.87266463F;

		bodyModel[210].addBox(0F, 0F, 0F, 9, 0, 2, 0F); // Box 210
		bodyModel[210].setRotationPoint(-33F, -21F, 11F);
		bodyModel[210].rotateAngleX = -0.87266463F;

		bodyModel[211].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 211 glow
		bodyModel[211].setRotationPoint(51.25F, -3F, -6F);

		bodyModel[212].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 212
		bodyModel[212].setRotationPoint(50.75F, -3F, -6F);

		bodyModel[213].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 213 glow
		bodyModel[213].setRotationPoint(51.25F, -3F, 4F);

		bodyModel[214].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 214
		bodyModel[214].setRotationPoint(50.75F, -3F, 4F);

		bodyModel[215].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 162 glowey boi
		bodyModel[215].setRotationPoint(-33.47F, -24.5F, -0.5F);

		bodyModel[216].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0.3F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, 0.3F, -0.5F, 0.1F, 0.3F, 0F, 0.1F, -1F, 0F, 0.1F, -1F, 0F, 0.1F, 0.3F, 0F, 0.1F); // Box 165
		bodyModel[216].setRotationPoint(-33.32F, -24.5F, -0.5F);

		bodyModel[217].addBox(0F, 0F, 0F, 11, 3, 8, 0F); // Box 217 arr winterization hatch
		bodyModel[217].setRotationPoint(17.5F, -25F, -4F);

		bodyModel[218].addBox(0F, 0F, 0F, 22, 1, 4, 0F); // Box 218 FR
		bodyModel[218].setRotationPoint(21F, -24F, -8F);

		bodyModel[219].addShapeBox(0F, 0F, 0F, 22, 2, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 219 FR
		bodyModel[219].setRotationPoint(21F, -24F, -9F);

		bodyModel[220].addShapeBox(0F, 0F, 0F, 22, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 220 FR
		bodyModel[220].setRotationPoint(21F, -22F, -9F);

		bodyModel[221].addBox(0F, 0F, 0F, 22, 1, 1, 0F); // Box 221 FR
		bodyModel[221].setRotationPoint(21F, -23F, -8F);

		bodyModel[222].addBox(0F, 0F, 0F, 22, 1, 4, 0F); // Box 222 FR
		bodyModel[222].setRotationPoint(21F, -24F, 4F);

		bodyModel[223].addBox(0F, 0F, 0F, 22, 1, 1, 0F); // Box 223 FR
		bodyModel[223].setRotationPoint(21F, -23F, 7F);

		bodyModel[224].addShapeBox(0F, 0F, 0F, 22, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 224 FR
		bodyModel[224].setRotationPoint(21F, -24F, 8F);

		bodyModel[225].addShapeBox(0F, 0F, 0F, 22, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 225 FR
		bodyModel[225].setRotationPoint(21F, -22F, 7F);

		bodyModel[226].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 226 FR
		bodyModel[226].setRotationPoint(21F, -24F, -4F);

		bodyModel[227].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 227 FR
		bodyModel[227].setRotationPoint(42F, -24F, -4F);

		bodyModel[228].addBox(0F, -6F, 0F, 10, 5, 1, 0F); // Box 228 FR
		bodyModel[228].setRotationPoint(32F, -16F, 6.25F);
		bodyModel[228].rotateAngleX = -0.33161256F;

		bodyModel[229].addBox(0F, -6F, 0F, 10, 5, 1, 0F); // Box 229 FR
		bodyModel[229].setRotationPoint(21.5F, -16F, 6.25F);
		bodyModel[229].rotateAngleX = -0.33161256F;

		bodyModel[230].addBox(0F, -6F, -1F, 10, 5, 1, 0F); // Box 230 FR
		bodyModel[230].setRotationPoint(21.5F, -16F, -6.25F);
		bodyModel[230].rotateAngleX = 0.33161256F;

		bodyModel[231].addBox(0F, -6F, -1F, 10, 5, 1, 0F); // Box 231 FR
		bodyModel[231].setRotationPoint(32F, -16F, -6.25F);
		bodyModel[231].rotateAngleX = 0.33161256F;

		bodyModel[232].addBox(0F, 0F, 0F, 3, 3, 0, 0F); // Box 355
		bodyModel[232].setRotationPoint(35F, -13F, 7.5F);

		bodyModel[233].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 356
		bodyModel[233].setRotationPoint(36F, -12F, 6.5F);

		bodyModel[234].addBox(0F, 0F, 0F, 6, 17, 2, 0F); // Box 234 atsf thing
		bodyModel[234].setRotationPoint(-9F, -18F, 6.5F);
	}
	ModelHTSCTruck theTrucks = new ModelHTSCTruck();
	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		for (int i = 0; i < 235; i++) {
			if (bodyModel[i].boxName != null && bodyModel[i].boxName.contains("lamp")) {
				Minecraft.getMinecraft().entityRenderer.disableLightmap(1D);
				bodyModel[i].render(f5);
				Minecraft.getMinecraft().entityRenderer.enableLightmap(1D);
			} else {
				bodyModel[i].render(f5);
			}
		}
		if (entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor() == 1||entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor() == 4
				||entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor() == 7||entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor() == 14) {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/htsctruck_LightGrey.png"));
		} /*else if (entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor() == 4) {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/flexicoil_c2h_Grey.png"));
		} */else {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/htsctruck_Black.png"));
		}
		GL11.glPushMatrix();
		GL11.glTranslatef(-1.9F, -0.03F, 0F);
		theTrucks.render(entity, f, f1, f2, f3, f4, f5);
		GL11.glPopMatrix();

		GL11.glPushMatrix();
		GL11.glRotatef(180, 0, 1, 0);
		GL11.glTranslated(-1.8F, -0.03F, 0);
		theTrucks.render(entity, f, f1, f2, f3, f4, f5);
		GL11.glPopMatrix();
	}
}