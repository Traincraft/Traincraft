//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2021 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 02.05.2021 - 13:12:37
// Last changed on: 02.05.2021 - 13:12:37

package train.client.render.models; //Path where the model is located

import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import org.lwjgl.opengl.GL11;
import tmt.ModelConverter;
import tmt.ModelRendererTurbo;

public class ModelShay3Truck extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 256;

	public ModelShay3Truck() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[539];

		initbodyModel_1();
		initbodyModel_2();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 196, textureX, textureY); // Box 93
		bodyModel[1] = new ModelRendererTurbo(this, 33, 250, textureX, textureY); // Box coupler
		bodyModel[2] = new ModelRendererTurbo(this, 90, 206, textureX, textureY); // Box 99
		bodyModel[3] = new ModelRendererTurbo(this, 47, 248, textureX, textureY); // Box 2
		bodyModel[4] = new ModelRendererTurbo(this, 47, 248, textureX, textureY); // Box 5
		bodyModel[5] = new ModelRendererTurbo(this, 30, 214, textureX, textureY); // Box 6
		bodyModel[6] = new ModelRendererTurbo(this, 109, 206, textureX, textureY); // Box 13
		bodyModel[7] = new ModelRendererTurbo(this, 230, 208, textureX, textureY); // Box 14
		bodyModel[8] = new ModelRendererTurbo(this, 282, 218, textureX, textureY); // Box 15
		bodyModel[9] = new ModelRendererTurbo(this, 236, 181, textureX, textureY); // Box 16
		bodyModel[10] = new ModelRendererTurbo(this, 189, 159, textureX, textureY); // Box 17
		bodyModel[11] = new ModelRendererTurbo(this, 208, 186, textureX, textureY); // Box 18
		bodyModel[12] = new ModelRendererTurbo(this, 122, 183, textureX, textureY); // Box 19
		bodyModel[13] = new ModelRendererTurbo(this, 146, 186, textureX, textureY); // Box 20
		bodyModel[14] = new ModelRendererTurbo(this, 192, 145, textureX, textureY); // Box 21
		bodyModel[15] = new ModelRendererTurbo(this, 191, 148, textureX, textureY); // Box 22
		bodyModel[16] = new ModelRendererTurbo(this, 188, 152, textureX, textureY); // Box 23
		bodyModel[17] = new ModelRendererTurbo(this, 188, 165, textureX, textureY); // Box 24
		bodyModel[18] = new ModelRendererTurbo(this, 191, 172, textureX, textureY); // Box 25
		bodyModel[19] = new ModelRendererTurbo(this, 192, 176, textureX, textureY); // Box 26
		bodyModel[20] = new ModelRendererTurbo(this, 220, 181, textureX, textureY); // Box 27
		bodyModel[21] = new ModelRendererTurbo(this, 146, 181, textureX, textureY); // Box 28
		bodyModel[22] = new ModelRendererTurbo(this, 337, 179, textureX, textureY); // Box 29
		bodyModel[23] = new ModelRendererTurbo(this, 93, 170, textureX, textureY); // Box 30
		bodyModel[24] = new ModelRendererTurbo(this, 186, 159, textureX, textureY); // Box 31
		bodyModel[25] = new ModelRendererTurbo(this, 179, 149, textureX, textureY); // Box 32
		bodyModel[26] = new ModelRendererTurbo(this, 171, 147, textureX, textureY); // Box 33
		bodyModel[27] = new ModelRendererTurbo(this, 179, 159, textureX, textureY); // Box 34
		bodyModel[28] = new ModelRendererTurbo(this, 75, 162, textureX, textureY); // Box 35
		bodyModel[29] = new ModelRendererTurbo(this, 95, 155, textureX, textureY); // Box 46
		bodyModel[30] = new ModelRendererTurbo(this, 343, 201, textureX, textureY); // Box 53
		bodyModel[31] = new ModelRendererTurbo(this, 332, 194, textureX, textureY); // Box 54
		bodyModel[32] = new ModelRendererTurbo(this, 356, 194, textureX, textureY); // Box 55
		bodyModel[33] = new ModelRendererTurbo(this, 356, 172, textureX, textureY); // Box 56
		bodyModel[34] = new ModelRendererTurbo(this, 332, 172, textureX, textureY); // Box 57
		bodyModel[35] = new ModelRendererTurbo(this, 343, 164, textureX, textureY); // Box 58
		bodyModel[36] = new ModelRendererTurbo(this, 119, 168, textureX, textureY); // Box 102
		bodyModel[37] = new ModelRendererTurbo(this, 304, 175, textureX, textureY); // Box 110
		bodyModel[38] = new ModelRendererTurbo(this, 315, 177, textureX, textureY); // Box 111
		bodyModel[39] = new ModelRendererTurbo(this, 315, 170, textureX, textureY); // Box 112
		bodyModel[40] = new ModelRendererTurbo(this, 305, 177, textureX, textureY); // Box 113
		bodyModel[41] = new ModelRendererTurbo(this, 315, 187, textureX, textureY); // Box 114
		bodyModel[42] = new ModelRendererTurbo(this, 303, 170, textureX, textureY); // Box 115
		bodyModel[43] = new ModelRendererTurbo(this, 305, 187, textureX, textureY); // Box 116
		bodyModel[44] = new ModelRendererTurbo(this, 49, 193, textureX, textureY); // Box 130
		bodyModel[45] = new ModelRendererTurbo(this, 50, 200, textureX, textureY); // Box 131
		bodyModel[46] = new ModelRendererTurbo(this, 50, 189, textureX, textureY); // Box 132
		bodyModel[47] = new ModelRendererTurbo(this, 230, 216, textureX, textureY); // Box 133
		bodyModel[48] = new ModelRendererTurbo(this, 273, 212, textureX, textureY); // Box 134
		bodyModel[49] = new ModelRendererTurbo(this, 250, 227, textureX, textureY); // Box 136
		bodyModel[50] = new ModelRendererTurbo(this, 165, 166, textureX, textureY); // Box 137
		bodyModel[51] = new ModelRendererTurbo(this, 238, 237, textureX, textureY); // Box 112
		bodyModel[52] = new ModelRendererTurbo(this, 63, 206, textureX, textureY); // Box 113
		bodyModel[53] = new ModelRendererTurbo(this, 162, 215, textureX, textureY); // Box 56
		bodyModel[54] = new ModelRendererTurbo(this, 175, 215, textureX, textureY, "lamp"); // Box 146 headlight front
		bodyModel[55] = new ModelRendererTurbo(this, 238, 189, textureX, textureY); // Box 120
		bodyModel[56] = new ModelRendererTurbo(this, 2, 179, textureX, textureY); // Box 121
		bodyModel[57] = new ModelRendererTurbo(this, 446, 181, textureX, textureY); // Box 122
		bodyModel[58] = new ModelRendererTurbo(this, 428, 189, textureX, textureY); // Box 86
		bodyModel[59] = new ModelRendererTurbo(this, 434, 195, textureX, textureY); // Box 124
		bodyModel[60] = new ModelRendererTurbo(this, 428, 203, textureX, textureY); // Box 125
		bodyModel[61] = new ModelRendererTurbo(this, 468, 195, textureX, textureY); // Box 126
		bodyModel[62] = new ModelRendererTurbo(this, 468, 189, textureX, textureY); // Box 128
		bodyModel[63] = new ModelRendererTurbo(this, 389, 181, textureX, textureY); // Box 130
		bodyModel[64] = new ModelRendererTurbo(this, 383, 195, textureX, textureY); // Box 132
		bodyModel[65] = new ModelRendererTurbo(this, 383, 189, textureX, textureY); // Box 133
		bodyModel[66] = new ModelRendererTurbo(this, 405, 189, textureX, textureY); // Box 134
		bodyModel[67] = new ModelRendererTurbo(this, 405, 195, textureX, textureY); // Box 135
		bodyModel[68] = new ModelRendererTurbo(this, 383, 203, textureX, textureY); // Box 136
		bodyModel[69] = new ModelRendererTurbo(this, 405, 203, textureX, textureY); // Box 138
		bodyModel[70] = new ModelRendererTurbo(this, 80, 191, textureX, textureY); // Box 139
		bodyModel[71] = new ModelRendererTurbo(this, 251, 238, textureX, textureY); // Box 140
		bodyModel[72] = new ModelRendererTurbo(this, 262, 240, textureX, textureY); // Box 141
		bodyModel[73] = new ModelRendererTurbo(this, 238, 237, textureX, textureY); // Box 142
		bodyModel[74] = new ModelRendererTurbo(this, 251, 238, textureX, textureY); // Box 143
		bodyModel[75] = new ModelRendererTurbo(this, 262, 240, textureX, textureY); // Box 144
		bodyModel[76] = new ModelRendererTurbo(this, 238, 237, textureX, textureY); // Box 145
		bodyModel[77] = new ModelRendererTurbo(this, 251, 238, textureX, textureY); // Box 146
		bodyModel[78] = new ModelRendererTurbo(this, 262, 240, textureX, textureY); // Box 147
		bodyModel[79] = new ModelRendererTurbo(this, 117, 157, textureX, textureY); // Box 149
		bodyModel[80] = new ModelRendererTurbo(this, 109, 154, textureX, textureY); // Box 151
		bodyModel[81] = new ModelRendererTurbo(this, 129, 154, textureX, textureY); // Box 152
		bodyModel[82] = new ModelRendererTurbo(this, 125, 174, textureX, textureY); // Box 153
		bodyModel[83] = new ModelRendererTurbo(this, 109, 164, textureX, textureY); // Box 156
		bodyModel[84] = new ModelRendererTurbo(this, 98, 164, textureX, textureY); // Box 162
		bodyModel[85] = new ModelRendererTurbo(this, 67, 166, textureX, textureY); // Box 163
		bodyModel[86] = new ModelRendererTurbo(this, 217, 239, textureX, textureY); // Box 164
		bodyModel[87] = new ModelRendererTurbo(this, 228, 230, textureX, textureY); // Box 165
		bodyModel[88] = new ModelRendererTurbo(this, 217, 230, textureX, textureY); // Box 166
		bodyModel[89] = new ModelRendererTurbo(this, 219, 235, textureX, textureY); // Box 167
		bodyModel[90] = new ModelRendererTurbo(this, 228, 239, textureX, textureY); // Box 168
		bodyModel[91] = new ModelRendererTurbo(this, 80, 178, textureX, textureY); // Box 169
		bodyModel[92] = new ModelRendererTurbo(this, 236, 165, textureX, textureY); // Box 170
		bodyModel[93] = new ModelRendererTurbo(this, 249, 165, textureX, textureY); // Box 171
		bodyModel[94] = new ModelRendererTurbo(this, 40, 156, textureX, textureY); // Box 172
		bodyModel[95] = new ModelRendererTurbo(this, 1, 231, textureX, textureY); // Box 173
		bodyModel[96] = new ModelRendererTurbo(this, 2, 247, textureX, textureY); // Box 174
		bodyModel[97] = new ModelRendererTurbo(this, 19, 247, textureX, textureY); // Box 175
		bodyModel[98] = new ModelRendererTurbo(this, 54, 231, textureX, textureY); // Box 176
		bodyModel[99] = new ModelRendererTurbo(this, 4, 204, textureX, textureY); // Box 187
		bodyModel[100] = new ModelRendererTurbo(this, 159, 146, textureX, textureY); // Box 189
		bodyModel[101] = new ModelRendererTurbo(this, 286, 199, textureX, textureY); // Box 192
		bodyModel[102] = new ModelRendererTurbo(this, 119, 127, textureX, textureY); // Box 193
		bodyModel[103] = new ModelRendererTurbo(this, 130, 133, textureX, textureY); // Box 194
		bodyModel[104] = new ModelRendererTurbo(this, 114, 133, textureX, textureY); // Box 195
		bodyModel[105] = new ModelRendererTurbo(this, 128, 125, textureX, textureY); // Box 196
		bodyModel[106] = new ModelRendererTurbo(this, 116, 125, textureX, textureY); // Box 197
		bodyModel[107] = new ModelRendererTurbo(this, 121, 123, textureX, textureY); // Box 198
		bodyModel[108] = new ModelRendererTurbo(this, 119, 135, textureX, textureY); // Box 199
		bodyModel[109] = new ModelRendererTurbo(this, 90, 125, textureX, textureY); // Box 206
		bodyModel[110] = new ModelRendererTurbo(this, 83, 133, textureX, textureY); // Box 207
		bodyModel[111] = new ModelRendererTurbo(this, 105, 133, textureX, textureY); // Box 208
		bodyModel[112] = new ModelRendererTurbo(this, 101, 123, textureX, textureY); // Box 209
		bodyModel[113] = new ModelRendererTurbo(this, 87, 123, textureX, textureY); // Box 210
		bodyModel[114] = new ModelRendererTurbo(this, 94, 120, textureX, textureY); // Box 211
		bodyModel[115] = new ModelRendererTurbo(this, 90, 135, textureX, textureY); // Box 212
		bodyModel[116] = new ModelRendererTurbo(this, 267, 208, textureX, textureY); // Box 218
		bodyModel[117] = new ModelRendererTurbo(this, 47, 157, textureX, textureY); // Box 114
		bodyModel[118] = new ModelRendererTurbo(this, 52, 157, textureX, textureY); // Box 74
		bodyModel[119] = new ModelRendererTurbo(this, 47, 160, textureX, textureY); // Box 78
		bodyModel[120] = new ModelRendererTurbo(this, 46, 168, textureX, textureY); // Box 113
		bodyModel[121] = new ModelRendererTurbo(this, 53, 167, textureX, textureY); // Box 114
		bodyModel[122] = new ModelRendererTurbo(this, 53, 162, textureX, textureY); // Box 115
		bodyModel[123] = new ModelRendererTurbo(this, 46, 164, textureX, textureY); // Box 116
		bodyModel[124] = new ModelRendererTurbo(this, 43, 168, textureX, textureY); // Box 117
		bodyModel[125] = new ModelRendererTurbo(this, 23, 132, textureX, textureY); // Box 201
		bodyModel[126] = new ModelRendererTurbo(this, 30, 125, textureX, textureY); // Box 202
		bodyModel[127] = new ModelRendererTurbo(this, 25, 137, textureX, textureY); // Box 229
		bodyModel[128] = new ModelRendererTurbo(this, 17, 180, textureX, textureY); // Box 219
		bodyModel[129] = new ModelRendererTurbo(this, 1, 181, textureX, textureY); // Box 220
		bodyModel[130] = new ModelRendererTurbo(this, 27, 186, textureX, textureY); // Box 221
		bodyModel[131] = new ModelRendererTurbo(this, 184, 218, textureX, textureY); // Box 222
		bodyModel[132] = new ModelRendererTurbo(this, 158, 172, textureX, textureY); // Box 223
		bodyModel[133] = new ModelRendererTurbo(this, 158, 154, textureX, textureY); // Box 224
		bodyModel[134] = new ModelRendererTurbo(this, 155, 165, textureX, textureY); // Box 225
		bodyModel[135] = new ModelRendererTurbo(this, 155, 158, textureX, textureY); // Box 226
		bodyModel[136] = new ModelRendererTurbo(this, 68, 116, textureX, textureY); // Box 228
		bodyModel[137] = new ModelRendererTurbo(this, 38, 116, textureX, textureY); // Box 230
		bodyModel[138] = new ModelRendererTurbo(this, 63, 116, textureX, textureY); // Box 231
		bodyModel[139] = new ModelRendererTurbo(this, 291, 213, textureX, textureY); // Box 232
		bodyModel[140] = new ModelRendererTurbo(this, 241, 230, textureX, textureY); // Box 233
		bodyModel[141] = new ModelRendererTurbo(this, 309, 190, textureX, textureY); // Box 234
		bodyModel[142] = new ModelRendererTurbo(this, 38, 113, textureX, textureY); // Box 235
		bodyModel[143] = new ModelRendererTurbo(this, 61, 110, textureX, textureY); // Box 236
		bodyModel[144] = new ModelRendererTurbo(this, 251, 205, textureX, textureY); // Box 36
		bodyModel[145] = new ModelRendererTurbo(this, 251, 202, textureX, textureY); // Box 37
		bodyModel[146] = new ModelRendererTurbo(this, 217, 205, textureX, textureY); // Box 239
		bodyModel[147] = new ModelRendererTurbo(this, 217, 202, textureX, textureY); // Box 240
		bodyModel[148] = new ModelRendererTurbo(this, 232, 205, textureX, textureY); // Box 241
		bodyModel[149] = new ModelRendererTurbo(this, 232, 202, textureX, textureY); // Box 242
		bodyModel[150] = new ModelRendererTurbo(this, 38, 125, textureX, textureY); // Box 259
		bodyModel[151] = new ModelRendererTurbo(this, 38, 122, textureX, textureY); // Box 260
		bodyModel[152] = new ModelRendererTurbo(this, 49, 122, textureX, textureY); // Box 261
		bodyModel[153] = new ModelRendererTurbo(this, 70, 122, textureX, textureY); // Box 262
		bodyModel[154] = new ModelRendererTurbo(this, 76, 128, textureX, textureY); // Box 263
		bodyModel[155] = new ModelRendererTurbo(this, 75, 125, textureX, textureY); // Box 264
		bodyModel[156] = new ModelRendererTurbo(this, 72, 133, textureX, textureY); // Box 265
		bodyModel[157] = new ModelRendererTurbo(this, 38, 119, textureX, textureY); // Box 266
		bodyModel[158] = new ModelRendererTurbo(this, 80, 113, textureX, textureY); // Box 267
		bodyModel[159] = new ModelRendererTurbo(this, 85, 113, textureX, textureY); // Box 268
		bodyModel[160] = new ModelRendererTurbo(this, 56, 131, textureX, textureY); // Box 269
		bodyModel[161] = new ModelRendererTurbo(this, 67, 128, textureX, textureY); // Box 270
		bodyModel[162] = new ModelRendererTurbo(this, 38, 128, textureX, textureY); // Box 271
		bodyModel[163] = new ModelRendererTurbo(this, 111, 228, textureX, textureY); // Box 275
		bodyModel[164] = new ModelRendererTurbo(this, 120, 217, textureX, textureY); // Box 276
		bodyModel[165] = new ModelRendererTurbo(this, 145, 228, textureX, textureY); // Box 277
		bodyModel[166] = new ModelRendererTurbo(this, 258, 250, textureX, textureY); // Box 278
		bodyModel[167] = new ModelRendererTurbo(this, 2, 247, textureX, textureY); // Box 279
		bodyModel[168] = new ModelRendererTurbo(this, 19, 247, textureX, textureY); // Box 280
		bodyModel[169] = new ModelRendererTurbo(this, 111, 217, textureX, textureY); // Box 281
		bodyModel[170] = new ModelRendererTurbo(this, 111, 221, textureX, textureY); // Box 282
		bodyModel[171] = new ModelRendererTurbo(this, 258, 250, textureX, textureY); // Box 286
		bodyModel[172] = new ModelRendererTurbo(this, 258, 250, textureX, textureY); // Box 287
		bodyModel[173] = new ModelRendererTurbo(this, 263, 248, textureX, textureY); // Box 288
		bodyModel[174] = new ModelRendererTurbo(this, 263, 248, textureX, textureY); // Box 289
		bodyModel[175] = new ModelRendererTurbo(this, 263, 248, textureX, textureY); // Box 290
		bodyModel[176] = new ModelRendererTurbo(this, 285, 205, textureX, textureY); // Box 291 reverser
		bodyModel[177] = new ModelRendererTurbo(this, 270, 237, textureX, textureY); // Box 292
		bodyModel[178] = new ModelRendererTurbo(this, 274, 240, textureX, textureY); // Box 293
		bodyModel[179] = new ModelRendererTurbo(this, 324, 229, textureX, textureY); // Box 117 rod
		bodyModel[180] = new ModelRendererTurbo(this, 299, 229, textureX, textureY); // Box 295 rod
		bodyModel[181] = new ModelRendererTurbo(this, 299, 220, textureX, textureY); // Box 296 rod spinny
		bodyModel[182] = new ModelRendererTurbo(this, 269, 243, textureX, textureY); // Box 297
		bodyModel[183] = new ModelRendererTurbo(this, 281, 243, textureX, textureY); // Box 298
		bodyModel[184] = new ModelRendererTurbo(this, 291, 243, textureX, textureY); // Box 299
		bodyModel[185] = new ModelRendererTurbo(this, 286, 240, textureX, textureY); // Box 300
		bodyModel[186] = new ModelRendererTurbo(this, 296, 249, textureX, textureY); // Box 301 piston go brr
		bodyModel[187] = new ModelRendererTurbo(this, 296, 249, textureX, textureY); // Box 302 piston go brr
		bodyModel[188] = new ModelRendererTurbo(this, 296, 249, textureX, textureY); // Box 303 piston go brr
		bodyModel[189] = new ModelRendererTurbo(this, 312, 229, textureX, textureY); // Box 304 rod
		bodyModel[190] = new ModelRendererTurbo(this, 317, 229, textureX, textureY); // Box 305 rod
		bodyModel[191] = new ModelRendererTurbo(this, 308, 233, textureX, textureY); // Box 306 rod bit go rotate
		bodyModel[192] = new ModelRendererTurbo(this, 308, 233, textureX, textureY); // Box 307 rod bit go rotate
		bodyModel[193] = new ModelRendererTurbo(this, 318, 236, textureX, textureY); // Box 308 rod bit go rotate
		bodyModel[194] = new ModelRendererTurbo(this, 308, 233, textureX, textureY); // Box 309 rod bit go rotate
		bodyModel[195] = new ModelRendererTurbo(this, 318, 236, textureX, textureY); // Box 310 rod bit go rotate
		bodyModel[196] = new ModelRendererTurbo(this, 308, 233, textureX, textureY); // Box 311 rod bit go rotate
		bodyModel[197] = new ModelRendererTurbo(this, 308, 233, textureX, textureY); // Box 312 rod bit go rotate
		bodyModel[198] = new ModelRendererTurbo(this, 318, 236, textureX, textureY); // Box 313 rod bit go rotate
		bodyModel[199] = new ModelRendererTurbo(this, 308, 233, textureX, textureY); // Box 314 rod bit go rotate
		bodyModel[200] = new ModelRendererTurbo(this, 299, 220, textureX, textureY); // Box 315 rod spinny
		bodyModel[201] = new ModelRendererTurbo(this, 301, 248, textureX, textureY); // Box 316 piston part go rotate
		bodyModel[202] = new ModelRendererTurbo(this, 301, 248, textureX, textureY); // Box 317 piston part go rotate
		bodyModel[203] = new ModelRendererTurbo(this, 301, 248, textureX, textureY); // Box 318 piston part go rotate
		bodyModel[204] = new ModelRendererTurbo(this, 291, 236, textureX, textureY); // Box 319
		bodyModel[205] = new ModelRendererTurbo(this, 291, 236, textureX, textureY); // Box 320
		bodyModel[206] = new ModelRendererTurbo(this, 298, 238, textureX, textureY); // Box 321
		bodyModel[207] = new ModelRendererTurbo(this, 291, 236, textureX, textureY); // Box 322
		bodyModel[208] = new ModelRendererTurbo(this, 269, 248, textureX, textureY); // Box 323
		bodyModel[209] = new ModelRendererTurbo(this, 313, 233, textureX, textureY); // Box 326 rod bit go rotate
		bodyModel[210] = new ModelRendererTurbo(this, 318, 233, textureX, textureY); // Box 327 rod bit go rotate
		bodyModel[211] = new ModelRendererTurbo(this, 313, 233, textureX, textureY); // Box 328 rod bit go rotate
		bodyModel[212] = new ModelRendererTurbo(this, 318, 233, textureX, textureY); // Box 329 rod bit go rotate
		bodyModel[213] = new ModelRendererTurbo(this, 313, 233, textureX, textureY); // Box 330 rod bit go rotate
		bodyModel[214] = new ModelRendererTurbo(this, 318, 233, textureX, textureY); // Box 331 rod bit go rotate
		bodyModel[215] = new ModelRendererTurbo(this, 318, 233, textureX, textureY); // Box 332 rod bit go rotate
		bodyModel[216] = new ModelRendererTurbo(this, 313, 233, textureX, textureY); // Box 333 rod bit go rotate
		bodyModel[217] = new ModelRendererTurbo(this, 313, 233, textureX, textureY); // Box 334 rod bit go rotate
		bodyModel[218] = new ModelRendererTurbo(this, 318, 233, textureX, textureY); // Box 335 rod bit go rotate
		bodyModel[219] = new ModelRendererTurbo(this, 318, 233, textureX, textureY); // Box 336 rod bit go rotate
		bodyModel[220] = new ModelRendererTurbo(this, 313, 233, textureX, textureY); // Box 337 rod bit go rotate
		bodyModel[221] = new ModelRendererTurbo(this, 313, 233, textureX, textureY); // Box 338 rod bit go rotate
		bodyModel[222] = new ModelRendererTurbo(this, 318, 233, textureX, textureY); // Box 339 rod bit go rotate
		bodyModel[223] = new ModelRendererTurbo(this, 318, 233, textureX, textureY); // Box 340 rod bit go rotate
		bodyModel[224] = new ModelRendererTurbo(this, 313, 233, textureX, textureY); // Box 341 rod bit go rotate
		bodyModel[225] = new ModelRendererTurbo(this, 313, 233, textureX, textureY); // Box 342 rod bit go rotate
		bodyModel[226] = new ModelRendererTurbo(this, 313, 233, textureX, textureY); // Box 343 rod bit go rotate
		bodyModel[227] = new ModelRendererTurbo(this, 318, 233, textureX, textureY); // Box 344 rod bit go rotate
		bodyModel[228] = new ModelRendererTurbo(this, 318, 233, textureX, textureY); // Box 345 rod bit go rotate
		bodyModel[229] = new ModelRendererTurbo(this, 318, 233, textureX, textureY); // Box 346 rod bit go rotate
		bodyModel[230] = new ModelRendererTurbo(this, 313, 233, textureX, textureY); // Box 347 rod bit go rotate
		bodyModel[231] = new ModelRendererTurbo(this, 313, 233, textureX, textureY); // Box 348 rod bit go rotate
		bodyModel[232] = new ModelRendererTurbo(this, 318, 233, textureX, textureY); // Box 349 rod bit go rotate
		bodyModel[233] = new ModelRendererTurbo(this, 30, 119, textureX, textureY); // Box 350
		bodyModel[234] = new ModelRendererTurbo(this, 25, 124, textureX, textureY); // Box 351
		bodyModel[235] = new ModelRendererTurbo(this, 25, 124, textureX, textureY); // Box 352
		bodyModel[236] = new ModelRendererTurbo(this, 25, 129, textureX, textureY); // Box 353
		bodyModel[237] = new ModelRendererTurbo(this, 20, 140, textureX, textureY); // Box 354
		bodyModel[238] = new ModelRendererTurbo(this, 18, 137, textureX, textureY); // Box 355
		bodyModel[239] = new ModelRendererTurbo(this, 309, 223, textureX, textureY); // Box 356 eccentric
		bodyModel[240] = new ModelRendererTurbo(this, 309, 223, textureX, textureY); // Box 357 eccentric
		bodyModel[241] = new ModelRendererTurbo(this, 318, 204, textureX, textureY); // Box 358 reverser
		bodyModel[242] = new ModelRendererTurbo(this, 298, 204, textureX, textureY); // Box 361 reverser bit
		bodyModel[243] = new ModelRendererTurbo(this, 309, 223, textureX, textureY); // Box 366 eccentric
		bodyModel[244] = new ModelRendererTurbo(this, 309, 223, textureX, textureY); // Box 367 eccentric
		bodyModel[245] = new ModelRendererTurbo(this, 309, 223, textureX, textureY); // Box 368 eccentric
		bodyModel[246] = new ModelRendererTurbo(this, 309, 223, textureX, textureY); // Box 369 eccentric
		bodyModel[247] = new ModelRendererTurbo(this, 263, 251, textureX, textureY); // Box 372
		bodyModel[248] = new ModelRendererTurbo(this, 263, 251, textureX, textureY); // Box 373
		bodyModel[249] = new ModelRendererTurbo(this, 263, 251, textureX, textureY); // Box 374
		bodyModel[250] = new ModelRendererTurbo(this, 298, 204, textureX, textureY); // Box 375 reverser bit
		bodyModel[251] = new ModelRendererTurbo(this, 298, 204, textureX, textureY); // Box 376 reverser bit
		bodyModel[252] = new ModelRendererTurbo(this, 175, 240, textureX, textureY); // Box 377
		bodyModel[253] = new ModelRendererTurbo(this, 175, 243, textureX, textureY); // Box 378
		bodyModel[254] = new ModelRendererTurbo(this, 311, 215, textureX, textureY); // Box 379 eccentric bit up down
		bodyModel[255] = new ModelRendererTurbo(this, 311, 215, textureX, textureY); // Box 380 eccentric bit up down
		bodyModel[256] = new ModelRendererTurbo(this, 153, 243, textureX, textureY); // Box 381
		bodyModel[257] = new ModelRendererTurbo(this, 154, 243, textureX, textureY); // Box 382
		bodyModel[258] = new ModelRendererTurbo(this, 153, 243, textureX, textureY); // Box 383
		bodyModel[259] = new ModelRendererTurbo(this, 311, 215, textureX, textureY); // Box 384 eccentric bit up down
		bodyModel[260] = new ModelRendererTurbo(this, 311, 215, textureX, textureY); // Box 385 eccentric bit up down
		bodyModel[261] = new ModelRendererTurbo(this, 311, 215, textureX, textureY); // Box 386 eccentric bit up down
		bodyModel[262] = new ModelRendererTurbo(this, 311, 215, textureX, textureY); // Box 387 eccentric bit up down
		bodyModel[263] = new ModelRendererTurbo(this, 80, 109, textureX, textureY); // Box 388
		bodyModel[264] = new ModelRendererTurbo(this, 85, 109, textureX, textureY); // Box 389
		bodyModel[265] = new ModelRendererTurbo(this, 51, 135, textureX, textureY); // Box 390
		bodyModel[266] = new ModelRendererTurbo(this, 33, 143, textureX, textureY); // Box 391
		bodyModel[267] = new ModelRendererTurbo(this, 22, 142, textureX, textureY); // Box 392
		bodyModel[268] = new ModelRendererTurbo(this, 32, 135, textureX, textureY); // Box 393
		bodyModel[269] = new ModelRendererTurbo(this, 31, 139, textureX, textureY); // Box 394
		bodyModel[270] = new ModelRendererTurbo(this, 49, 119, textureX, textureY); // Box 395
		bodyModel[271] = new ModelRendererTurbo(this, 73, 118, textureX, textureY); // Box 396
		bodyModel[272] = new ModelRendererTurbo(this, 73, 118, textureX, textureY); // Box 397
		bodyModel[273] = new ModelRendererTurbo(this, 66, 119, textureX, textureY); // Box 398
		bodyModel[274] = new ModelRendererTurbo(this, 38, 131, textureX, textureY); // Box 399
		bodyModel[275] = new ModelRendererTurbo(this, 43, 131, textureX, textureY); // Box 400
		bodyModel[276] = new ModelRendererTurbo(this, 46, 140, textureX, textureY); // Box 401
		bodyModel[277] = new ModelRendererTurbo(this, 51, 143, textureX, textureY); // Box 402
		bodyModel[278] = new ModelRendererTurbo(this, 31, 134, textureX, textureY); // Box 404
		bodyModel[279] = new ModelRendererTurbo(this, 46, 143, textureX, textureY); // Box 405
		bodyModel[280] = new ModelRendererTurbo(this, 117, 247, textureX, textureY); // Box 586 drawbar
		bodyModel[281] = new ModelRendererTurbo(this, 24, 194, textureX, textureY); // Box 349
		bodyModel[282] = new ModelRendererTurbo(this, 18, 161, textureX, textureY); // Box 350
		bodyModel[283] = new ModelRendererTurbo(this, 18, 157, textureX, textureY); // Box 351
		bodyModel[284] = new ModelRendererTurbo(this, 26, 175, textureX, textureY); // Box 352
		bodyModel[285] = new ModelRendererTurbo(this, 19, 172, textureX, textureY); // Box 353
		bodyModel[286] = new ModelRendererTurbo(this, 7, 172, textureX, textureY); // Box 354
		bodyModel[287] = new ModelRendererTurbo(this, 1, 151, textureX, textureY); // Box 355
		bodyModel[288] = new ModelRendererTurbo(this, 18, 172, textureX, textureY); // Box 356
		bodyModel[289] = new ModelRendererTurbo(this, 18, 172, textureX, textureY); // Box 357
		bodyModel[290] = new ModelRendererTurbo(this, 8, 163, textureX, textureY); // Box 358
		bodyModel[291] = new ModelRendererTurbo(this, 8, 167, textureX, textureY); // Box 359
		bodyModel[292] = new ModelRendererTurbo(this, 1, 170, textureX, textureY); // Box 360
		bodyModel[293] = new ModelRendererTurbo(this, 1, 170, textureX, textureY); // Box 361
		bodyModel[294] = new ModelRendererTurbo(this, 1, 170, textureX, textureY); // Box 362
		bodyModel[295] = new ModelRendererTurbo(this, 1, 167, textureX, textureY); // Box 363
		bodyModel[296] = new ModelRendererTurbo(this, 1, 175, textureX, textureY); // Box 364
		bodyModel[297] = new ModelRendererTurbo(this, 23, 163, textureX, textureY); // Box 365
		bodyModel[298] = new ModelRendererTurbo(this, 25, 166, textureX, textureY); // Box 366
		bodyModel[299] = new ModelRendererTurbo(this, 134, 247, textureX, textureY); // Box 369
		bodyModel[300] = new ModelRendererTurbo(this, 134, 247, textureX, textureY); // Box 370
		bodyModel[301] = new ModelRendererTurbo(this, 134, 247, textureX, textureY); // Box 371
		bodyModel[302] = new ModelRendererTurbo(this, 134, 247, textureX, textureY); // Box 372
		bodyModel[303] = new ModelRendererTurbo(this, 14, 172, textureX, textureY); // Box 579
		bodyModel[304] = new ModelRendererTurbo(this, 40, 136, textureX, textureY); // Box 580 coal tile
		bodyModel[305] = new ModelRendererTurbo(this, 47, 148, textureX, textureY); // Box 581
		bodyModel[306] = new ModelRendererTurbo(this, 135, 189, textureX, textureY); // Box 329 door swing right
		bodyModel[307] = new ModelRendererTurbo(this, 227, 189, textureX, textureY); // Box 332 door swing left
		bodyModel[308] = new ModelRendererTurbo(this, 112, 168, textureX, textureY); // Box 179
		bodyModel[309] = new ModelRendererTurbo(this, 112, 168, textureX, textureY); // Box 180
		bodyModel[310] = new ModelRendererTurbo(this, 109, 168, textureX, textureY); // Box 587
		bodyModel[311] = new ModelRendererTurbo(this, 109, 168, textureX, textureY); // Box 588
		bodyModel[312] = new ModelRendererTurbo(this, 0, 197, textureX, textureY); // Box 589
		bodyModel[313] = new ModelRendererTurbo(this, 192, 203, textureX, textureY); // Box 591
		bodyModel[314] = new ModelRendererTurbo(this, 203, 206, textureX, textureY); // Box 592
		bodyModel[315] = new ModelRendererTurbo(this, 203, 206, textureX, textureY); // Box 593
		bodyModel[316] = new ModelRendererTurbo(this, 46, 136, textureX, textureY); // Box 597
		bodyModel[317] = new ModelRendererTurbo(this, 163, 222, textureX, textureY, "lamp"); // Box 598 marker glow
		bodyModel[318] = new ModelRendererTurbo(this, 163, 222, textureX, textureY, "lamp"); // Box 599 marker glow
		bodyModel[319] = new ModelRendererTurbo(this, 263, 237, textureX, textureY); // Box 600
		bodyModel[320] = new ModelRendererTurbo(this, 263, 237, textureX, textureY); // Box 601
		bodyModel[321] = new ModelRendererTurbo(this, 263, 237, textureX, textureY); // Box 602
		bodyModel[322] = new ModelRendererTurbo(this, 237, 248, textureX, textureY); // Box 603
		bodyModel[323] = new ModelRendererTurbo(this, 83, 142, textureX, textureY); // Box 388
		bodyModel[324] = new ModelRendererTurbo(this, 105, 142, textureX, textureY); // Box 389
		bodyModel[325] = new ModelRendererTurbo(this, 114, 140, textureX, textureY); // Box 390
		bodyModel[326] = new ModelRendererTurbo(this, 130, 140, textureX, textureY); // Box 391
		bodyModel[327] = new ModelRendererTurbo(this, 131, 164, textureX, textureY); // Box 392
		bodyModel[328] = new ModelRendererTurbo(this, 132, 169, textureX, textureY); // Box 393
		bodyModel[329] = new ModelRendererTurbo(this, 370, 154, textureX, textureY); // Box 370
		bodyModel[330] = new ModelRendererTurbo(this, 387, 152, textureX, textureY); // Box 371
		bodyModel[331] = new ModelRendererTurbo(this, 169, 222, textureX, textureY, "lamp"); // Box 154 headlight glow
		bodyModel[332] = new ModelRendererTurbo(this, 169, 222, textureX, textureY, "lamp"); // Box 155 headlight glow
		bodyModel[333] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 30 wheel
		bodyModel[334] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 46 wheel
		bodyModel[335] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 47 wheel
		bodyModel[336] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 48 wheel
		bodyModel[337] = new ModelRendererTurbo(this, 1, 14, textureX, textureY); // Box 11
		bodyModel[338] = new ModelRendererTurbo(this, 1, 14, textureX, textureY); // Box 12
		bodyModel[339] = new ModelRendererTurbo(this, 1, 20, textureX, textureY); // Box 13
		bodyModel[340] = new ModelRendererTurbo(this, 1, 23, textureX, textureY); // Box 18
		bodyModel[341] = new ModelRendererTurbo(this, 11, 1, textureX, textureY); // Box 4
		bodyModel[342] = new ModelRendererTurbo(this, 11, 1, textureX, textureY); // Box 24
		bodyModel[343] = new ModelRendererTurbo(this, 5, 24, textureX, textureY); // Box 34
		bodyModel[344] = new ModelRendererTurbo(this, 12, 21, textureX, textureY); // Box 35
		bodyModel[345] = new ModelRendererTurbo(this, 23, 21, textureX, textureY); // Box 36
		bodyModel[346] = new ModelRendererTurbo(this, 26, 24, textureX, textureY); // Box 37
		bodyModel[347] = new ModelRendererTurbo(this, 1, 29, textureX, textureY); // Box 38
		bodyModel[348] = new ModelRendererTurbo(this, 6, 14, textureX, textureY); // Box 39
		bodyModel[349] = new ModelRendererTurbo(this, 6, 14, textureX, textureY); // Box 40
		bodyModel[350] = new ModelRendererTurbo(this, 10, 29, textureX, textureY); // Box 41
		bodyModel[351] = new ModelRendererTurbo(this, 26, 27, textureX, textureY); // Box 42
		bodyModel[352] = new ModelRendererTurbo(this, 1, 20, textureX, textureY); // Box 43
		bodyModel[353] = new ModelRendererTurbo(this, 14, 1, textureX, textureY); // Box 44
		bodyModel[354] = new ModelRendererTurbo(this, 14, 1, textureX, textureY); // Box 45
		bodyModel[355] = new ModelRendererTurbo(this, 1, 23, textureX, textureY); // Box 46
		bodyModel[356] = new ModelRendererTurbo(this, 0, 40, textureX, textureY); // Box 47
		bodyModel[357] = new ModelRendererTurbo(this, 12, 7, textureX, textureY); // Box 48
		bodyModel[358] = new ModelRendererTurbo(this, 40, 14, textureX, textureY); // Box 53
		bodyModel[359] = new ModelRendererTurbo(this, 40, 10, textureX, textureY); // Box 54
		bodyModel[360] = new ModelRendererTurbo(this, 1, 35, textureX, textureY); // Box 57
		bodyModel[361] = new ModelRendererTurbo(this, 18, 42, textureX, textureY); // Box 58
		bodyModel[362] = new ModelRendererTurbo(this, 29, 42, textureX, textureY); // Box 59
		bodyModel[363] = new ModelRendererTurbo(this, 15, 9, textureX, textureY); // Box 60
		bodyModel[364] = new ModelRendererTurbo(this, 1, 8, textureX, textureY); // Box 154 wheel gear
		bodyModel[365] = new ModelRendererTurbo(this, 1, 8, textureX, textureY); // Box 62 wheel gear
		bodyModel[366] = new ModelRendererTurbo(this, 6, 32, textureX, textureY); // Box 63
		bodyModel[367] = new ModelRendererTurbo(this, 14, 32, textureX, textureY); // Box 64
		bodyModel[368] = new ModelRendererTurbo(this, 14, 32, textureX, textureY); // Box 65
		bodyModel[369] = new ModelRendererTurbo(this, 21, 14, textureX, textureY); // Box 116
		bodyModel[370] = new ModelRendererTurbo(this, 21, 14, textureX, textureY); // Box 69
		bodyModel[371] = new ModelRendererTurbo(this, 40, 14, textureX, textureY); // Box 70
		bodyModel[372] = new ModelRendererTurbo(this, 40, 10, textureX, textureY); // Box 73
		bodyModel[373] = new ModelRendererTurbo(this, 1, 42, textureX, textureY); // Box 74
		bodyModel[374] = new ModelRendererTurbo(this, 1, 26, textureX, textureY); // Box 75
		bodyModel[375] = new ModelRendererTurbo(this, 1, 32, textureX, textureY); // Box 76
		bodyModel[376] = new ModelRendererTurbo(this, 12, 7, textureX, textureY); // Box 77
		bodyModel[377] = new ModelRendererTurbo(this, 1, 42, textureX, textureY); // Box 78
		bodyModel[378] = new ModelRendererTurbo(this, 29, 42, textureX, textureY); // Box 79
		bodyModel[379] = new ModelRendererTurbo(this, 18, 42, textureX, textureY); // Box 80
		bodyModel[380] = new ModelRendererTurbo(this, 12, 21, textureX, textureY); // Box 81
		bodyModel[381] = new ModelRendererTurbo(this, 23, 21, textureX, textureY); // Box 82
		bodyModel[382] = new ModelRendererTurbo(this, 26, 24, textureX, textureY); // Box 83
		bodyModel[383] = new ModelRendererTurbo(this, 1, 29, textureX, textureY); // Box 84
		bodyModel[384] = new ModelRendererTurbo(this, 1, 32, textureX, textureY); // Box 85
		bodyModel[385] = new ModelRendererTurbo(this, 10, 29, textureX, textureY); // Box 86
		bodyModel[386] = new ModelRendererTurbo(this, 6, 32, textureX, textureY); // Box 87
		bodyModel[387] = new ModelRendererTurbo(this, 26, 27, textureX, textureY); // Box 88
		bodyModel[388] = new ModelRendererTurbo(this, 33, 12, textureX, textureY); // Box 89
		bodyModel[389] = new ModelRendererTurbo(this, 14, 14, textureX, textureY); // Box 90
		bodyModel[390] = new ModelRendererTurbo(this, 33, 15, textureX, textureY); // Box 92
		bodyModel[391] = new ModelRendererTurbo(this, 33, 15, textureX, textureY); // Box 94
		bodyModel[392] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 96
		bodyModel[393] = new ModelRendererTurbo(this, 33, 12, textureX, textureY); // Box 97
		bodyModel[394] = new ModelRendererTurbo(this, 14, 14, textureX, textureY); // Box 98
		bodyModel[395] = new ModelRendererTurbo(this, 0, 40, textureX, textureY); // Box 99
		bodyModel[396] = new ModelRendererTurbo(this, 12, 7, textureX, textureY); // Box 100
		bodyModel[397] = new ModelRendererTurbo(this, 12, 7, textureX, textureY); // Box 101
		bodyModel[398] = new ModelRendererTurbo(this, 1, 26, textureX, textureY); // Box 102
		bodyModel[399] = new ModelRendererTurbo(this, 14, 1, textureX, textureY); // Box 103
		bodyModel[400] = new ModelRendererTurbo(this, 14, 1, textureX, textureY); // Box 104
		bodyModel[401] = new ModelRendererTurbo(this, 14, 35, textureX, textureY); // Box 105
		bodyModel[402] = new ModelRendererTurbo(this, 14, 35, textureX, textureY); // Box 106
		bodyModel[403] = new ModelRendererTurbo(this, 1, 35, textureX, textureY); // Box 107
		bodyModel[404] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 108
		bodyModel[405] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 109
		bodyModel[406] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 110
		bodyModel[407] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 111
		bodyModel[408] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 112
		bodyModel[409] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 113
		bodyModel[410] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 114
		bodyModel[411] = new ModelRendererTurbo(this, 41, 6, textureX, textureY); // Box 115
		bodyModel[412] = new ModelRendererTurbo(this, 41, 6, textureX, textureY); // Box 116
		bodyModel[413] = new ModelRendererTurbo(this, 2, 50, textureX, textureY); // Box 117 rod
		bodyModel[414] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 118 rod gear
		bodyModel[415] = new ModelRendererTurbo(this, 43, 41, textureX, textureY); // Box 119
		bodyModel[416] = new ModelRendererTurbo(this, 42, 41, textureX, textureY); // Box 120
		bodyModel[417] = new ModelRendererTurbo(this, 43, 41, textureX, textureY); // Box 121
		bodyModel[418] = new ModelRendererTurbo(this, 42, 39, textureX, textureY); // Box 122
		bodyModel[419] = new ModelRendererTurbo(this, 42, 39, textureX, textureY); // Box 123
		bodyModel[420] = new ModelRendererTurbo(this, 42, 41, textureX, textureY); // Box 125
		bodyModel[421] = new ModelRendererTurbo(this, 43, 41, textureX, textureY); // Box 126
		bodyModel[422] = new ModelRendererTurbo(this, 42, 39, textureX, textureY); // Box 127
		bodyModel[423] = new ModelRendererTurbo(this, 43, 41, textureX, textureY); // Box 128
		bodyModel[424] = new ModelRendererTurbo(this, 42, 39, textureX, textureY); // Box 129
		bodyModel[425] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 130 rod gear
		bodyModel[426] = new ModelRendererTurbo(this, 34, 21, textureX, textureY); // Box 93
		bodyModel[427] = new ModelRendererTurbo(this, 34, 21, textureX, textureY); // Box 94
		bodyModel[428] = new ModelRendererTurbo(this, 33, 22, textureX, textureY); // Box 95
		bodyModel[429] = new ModelRendererTurbo(this, 35, 25, textureX, textureY); // Box 96
		bodyModel[430] = new ModelRendererTurbo(this, 35, 25, textureX, textureY); // Box 97
		bodyModel[431] = new ModelRendererTurbo(this, 33, 22, textureX, textureY); // Box 98
		bodyModel[432] = new ModelRendererTurbo(this, 34, 21, textureX, textureY); // Box 99
		bodyModel[433] = new ModelRendererTurbo(this, 35, 25, textureX, textureY); // Box 100
		bodyModel[434] = new ModelRendererTurbo(this, 35, 25, textureX, textureY); // Box 101
		bodyModel[435] = new ModelRendererTurbo(this, 34, 21, textureX, textureY); // Box 102
		bodyModel[436] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 30 wheel
		bodyModel[437] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 46 wheel
		bodyModel[438] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 47 wheel
		bodyModel[439] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 48 wheel
		bodyModel[440] = new ModelRendererTurbo(this, 1, 14, textureX, textureY); // Box 11
		bodyModel[441] = new ModelRendererTurbo(this, 1, 14, textureX, textureY); // Box 12
		bodyModel[442] = new ModelRendererTurbo(this, 1, 20, textureX, textureY); // Box 13
		bodyModel[443] = new ModelRendererTurbo(this, 1, 23, textureX, textureY); // Box 18
		bodyModel[444] = new ModelRendererTurbo(this, 11, 1, textureX, textureY); // Box 4
		bodyModel[445] = new ModelRendererTurbo(this, 11, 1, textureX, textureY); // Box 24
		bodyModel[446] = new ModelRendererTurbo(this, 5, 24, textureX, textureY); // Box 34
		bodyModel[447] = new ModelRendererTurbo(this, 12, 21, textureX, textureY); // Box 35
		bodyModel[448] = new ModelRendererTurbo(this, 23, 21, textureX, textureY); // Box 36
		bodyModel[449] = new ModelRendererTurbo(this, 26, 24, textureX, textureY); // Box 37
		bodyModel[450] = new ModelRendererTurbo(this, 1, 29, textureX, textureY); // Box 38
		bodyModel[451] = new ModelRendererTurbo(this, 6, 14, textureX, textureY); // Box 39
		bodyModel[452] = new ModelRendererTurbo(this, 6, 14, textureX, textureY); // Box 40
		bodyModel[453] = new ModelRendererTurbo(this, 10, 29, textureX, textureY); // Box 41
		bodyModel[454] = new ModelRendererTurbo(this, 26, 27, textureX, textureY); // Box 42
		bodyModel[455] = new ModelRendererTurbo(this, 1, 20, textureX, textureY); // Box 43
		bodyModel[456] = new ModelRendererTurbo(this, 14, 1, textureX, textureY); // Box 44
		bodyModel[457] = new ModelRendererTurbo(this, 14, 1, textureX, textureY); // Box 45
		bodyModel[458] = new ModelRendererTurbo(this, 1, 23, textureX, textureY); // Box 46
		bodyModel[459] = new ModelRendererTurbo(this, 0, 40, textureX, textureY); // Box 47
		bodyModel[460] = new ModelRendererTurbo(this, 12, 7, textureX, textureY); // Box 48
		bodyModel[461] = new ModelRendererTurbo(this, 40, 14, textureX, textureY); // Box 53
		bodyModel[462] = new ModelRendererTurbo(this, 40, 10, textureX, textureY); // Box 54
		bodyModel[463] = new ModelRendererTurbo(this, 1, 35, textureX, textureY); // Box 57
		bodyModel[464] = new ModelRendererTurbo(this, 18, 42, textureX, textureY); // Box 58
		bodyModel[465] = new ModelRendererTurbo(this, 29, 42, textureX, textureY); // Box 59
		bodyModel[466] = new ModelRendererTurbo(this, 15, 9, textureX, textureY); // Box 60
		bodyModel[467] = new ModelRendererTurbo(this, 1, 8, textureX, textureY); // Box 154 wheel gear
		bodyModel[468] = new ModelRendererTurbo(this, 1, 8, textureX, textureY); // Box 62 wheel gear
		bodyModel[469] = new ModelRendererTurbo(this, 6, 32, textureX, textureY); // Box 63
		bodyModel[470] = new ModelRendererTurbo(this, 14, 32, textureX, textureY); // Box 64
		bodyModel[471] = new ModelRendererTurbo(this, 14, 32, textureX, textureY); // Box 65
		bodyModel[472] = new ModelRendererTurbo(this, 21, 14, textureX, textureY); // Box 116
		bodyModel[473] = new ModelRendererTurbo(this, 21, 14, textureX, textureY); // Box 69
		bodyModel[474] = new ModelRendererTurbo(this, 40, 14, textureX, textureY); // Box 70
		bodyModel[475] = new ModelRendererTurbo(this, 40, 10, textureX, textureY); // Box 73
		bodyModel[476] = new ModelRendererTurbo(this, 1, 42, textureX, textureY); // Box 74
		bodyModel[477] = new ModelRendererTurbo(this, 1, 26, textureX, textureY); // Box 75
		bodyModel[478] = new ModelRendererTurbo(this, 1, 32, textureX, textureY); // Box 76
		bodyModel[479] = new ModelRendererTurbo(this, 12, 7, textureX, textureY); // Box 77
		bodyModel[480] = new ModelRendererTurbo(this, 1, 42, textureX, textureY); // Box 78
		bodyModel[481] = new ModelRendererTurbo(this, 29, 42, textureX, textureY); // Box 79
		bodyModel[482] = new ModelRendererTurbo(this, 18, 42, textureX, textureY); // Box 80
		bodyModel[483] = new ModelRendererTurbo(this, 12, 21, textureX, textureY); // Box 81
		bodyModel[484] = new ModelRendererTurbo(this, 23, 21, textureX, textureY); // Box 82
		bodyModel[485] = new ModelRendererTurbo(this, 26, 24, textureX, textureY); // Box 83
		bodyModel[486] = new ModelRendererTurbo(this, 1, 29, textureX, textureY); // Box 84
		bodyModel[487] = new ModelRendererTurbo(this, 1, 32, textureX, textureY); // Box 85
		bodyModel[488] = new ModelRendererTurbo(this, 10, 29, textureX, textureY); // Box 86
		bodyModel[489] = new ModelRendererTurbo(this, 6, 32, textureX, textureY); // Box 87
		bodyModel[490] = new ModelRendererTurbo(this, 26, 27, textureX, textureY); // Box 88
		bodyModel[491] = new ModelRendererTurbo(this, 33, 12, textureX, textureY); // Box 89
		bodyModel[492] = new ModelRendererTurbo(this, 14, 14, textureX, textureY); // Box 90
		bodyModel[493] = new ModelRendererTurbo(this, 33, 15, textureX, textureY); // Box 92
		bodyModel[494] = new ModelRendererTurbo(this, 33, 15, textureX, textureY); // Box 94
		bodyModel[495] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 96
		bodyModel[496] = new ModelRendererTurbo(this, 33, 12, textureX, textureY); // Box 97
		bodyModel[497] = new ModelRendererTurbo(this, 14, 14, textureX, textureY); // Box 98
		bodyModel[498] = new ModelRendererTurbo(this, 0, 40, textureX, textureY); // Box 99
		bodyModel[499] = new ModelRendererTurbo(this, 12, 7, textureX, textureY); // Box 100

		bodyModel[0].addBox(0F, 0F, 0F, 1, 5, 20, 0F); // Box 93
		bodyModel[0].setRotationPoint(-40F, -1F, -10F);

		bodyModel[1].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box coupler
		bodyModel[1].setRotationPoint(-44F, 3F, -1.5F);

		bodyModel[2].addBox(0F, 0F, 0F, 3, 1, 6, 0F); // Box 99
		bodyModel[2].setRotationPoint(-43F, 8F, -9F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[3].setRotationPoint(-41F, 2.5F, -2F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		bodyModel[4].setRotationPoint(-40F, 2.5F, -2F);

		bodyModel[5].addBox(0F, 0F, 0F, 32, 1, 14, 0F); // Box 6
		bodyModel[5].setRotationPoint(-39F, -1F, -10F);

		bodyModel[6].addBox(0F, 0F, 0F, 16, 1, 20, 0F); // Box 13
		bodyModel[6].setRotationPoint(-7F, -1F, -10F);

		bodyModel[7].addBox(0F, 0F, 0F, 15, 1, 6, 0F); // Box 14
		bodyModel[7].setRotationPoint(-39F, -3F, 4F);

		bodyModel[8].addBox(0F, 0F, 0F, 1, 2, 6, 0F); // Box 15
		bodyModel[8].setRotationPoint(-39F, -2F, 4F);

		bodyModel[9].addBox(0F, 0F, 0F, 5, 6, 1, 0F); // Box 16
		bodyModel[9].setRotationPoint(-8F, -14F, 9F);

		bodyModel[10].addBox(0F, 0F, 0F, 12, 1, 4, 0F); // Box 17
		bodyModel[10].setRotationPoint(-9F, -17F, -2F);

		bodyModel[11].addBox(0F, 0F, 0F, 8, 10, 1, 0F); // Box 18
		bodyModel[11].setRotationPoint(1F, -11F, 9F);

		bodyModel[12].addBox(0F, 0F, 0F, 5, 13, 1, 0F); // Box 19
		bodyModel[12].setRotationPoint(-8F, -14F, -10F);

		bodyModel[13].addBox(0F, 0F, 0F, 8, 10, 1, 0F); // Box 20
		bodyModel[13].setRotationPoint(1F, -11F, -10F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 12, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 21
		bodyModel[14].setRotationPoint(-9F, -15F, 9F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 12, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		bodyModel[15].setRotationPoint(-9F, -16F, 7F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 12, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 23
		bodyModel[16].setRotationPoint(-9F, -17F, 2F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 12, 1, 5, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		bodyModel[17].setRotationPoint(-9F, -17F, -7F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 12, 1, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25
		bodyModel[18].setRotationPoint(-9F, -16F, -9F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 12, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[19].setRotationPoint(-9F, -15F, -10F);

		bodyModel[20].addBox(0F, 0F, 0F, 2, 3, 1, 0F); // Box 27
		bodyModel[20].setRotationPoint(1F, -14F, 9F);

		bodyModel[21].addBox(0F, 0F, 0F, 2, 3, 1, 0F); // Box 28
		bodyModel[21].setRotationPoint(1F, -14F, -10F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 8, 4, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 29
		bodyModel[22].setRotationPoint(-39F, -6F, -8F);

		bodyModel[23].addBox(0F, 0F, 0F, 1, 14, 13, 0F); // Box 30
		bodyModel[23].setRotationPoint(-8F, -15F, -9F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 31
		bodyModel[24].setRotationPoint(-9F, -15F, -9F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 32
		bodyModel[25].setRotationPoint(-9F, -16F, -7F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
		bodyModel[26].setRotationPoint(-9F, -16F, 2F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		bodyModel[27].setRotationPoint(-9F, -15F, 7F);

		bodyModel[28].addBox(0F, 0F, 0F, 1, 1, 14, 0F); // Box 35
		bodyModel[28].setRotationPoint(-8F, -16F, -7F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 3, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 46
		bodyModel[29].setRotationPoint(-36F, -19F, -6.5F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 8, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 53
		bodyModel[30].setRotationPoint(-39F, -2F, -5F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 8, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 54
		bodyModel[31].setRotationPoint(-39F, -2F, -8F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 8, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 55
		bodyModel[32].setRotationPoint(-39F, -2F, -1F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 8, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 56
		bodyModel[33].setRotationPoint(-39F, -9F, -1F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 8, 3, 3, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 57
		bodyModel[34].setRotationPoint(-39F, -9F, -8F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 8, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 58
		bodyModel[35].setRotationPoint(-39F, -9F, -5F);

		bodyModel[36].addBox(0F, 0F, 0F, 3, 9, 3, 0F); // Box 102
		bodyModel[36].setRotationPoint(-36F, -18F, -4.5F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 1, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 110
		bodyModel[37].setRotationPoint(-39.5F, -5.5F, -7F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Box 111
		bodyModel[38].setRotationPoint(-39.5F, -8F, -1.5F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 112
		bodyModel[39].setRotationPoint(-39.5F, -8F, -4.5F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 113
		bodyModel[40].setRotationPoint(-39.5F, -8F, -6.5F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 114
		bodyModel[41].setRotationPoint(-39.5F, -3F, -6.5F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 115
		bodyModel[42].setRotationPoint(-39.5F, -3F, -4.5F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 116
		bodyModel[43].setRotationPoint(-39.5F, -3F, -1.5F);

		bodyModel[44].addBox(0F, 0F, 0F, 11, 4, 2, 0F); // Box 130
		bodyModel[44].setRotationPoint(-37F, -2F, 7F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 11, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 131
		bodyModel[45].setRotationPoint(-37F, -1F, 6F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 11, 2, 1, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 132
		bodyModel[46].setRotationPoint(-37F, -1F, 9F);

		bodyModel[47].addBox(0F, 0F, 0F, 17, 1, 8, 0F); // Box 133
		bodyModel[47].setRotationPoint(-24F, -8F, 2F);

		bodyModel[48].addBox(0F, 0F, 0F, 1, 5, 6, 0F); // Box 134
		bodyModel[48].setRotationPoint(-25F, -8F, 4F);

		bodyModel[49].addBox(0F, 0F, 0F, 17, 7, 1, 0F); // Box 136
		bodyModel[49].setRotationPoint(-24F, -7F, 4F);

		bodyModel[50].addBox(0F, 0F, 0F, 1, 11, 20, 0F); // Box 137
		bodyModel[50].setRotationPoint(9F, -11F, -10F);

		bodyModel[51].addBox(0F, 0F, 0F, 2, 6, 4, 0F); // Box 112
		bodyModel[51].setRotationPoint(-7F, -6.5F, 10F);
		bodyModel[51].rotateAngleY = -3.14159265F;

		bodyModel[52].addBox(0F, 0F, 0F, 3, 1, 6, 0F); // Box 113
		bodyModel[52].setRotationPoint(-43F, 8F, 3F);

		bodyModel[53].addBox(0F, 0F, 0F, 3, 3, 3, 0F); // Box 56
		bodyModel[53].setRotationPoint(-40F, -13F, -4.5F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 146 headlight front
		bodyModel[54].setRotationPoint(-40.5F, -13F, -4.5F);

		bodyModel[55].addBox(0F, 0F, 0F, 4, 7, 1, 0F); // Box 120
		bodyModel[55].setRotationPoint(-7F, -8F, 9F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 2, 6, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 121
		bodyModel[56].setRotationPoint(-7F, -7F, -8F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 15, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 122
		bodyModel[57].setRotationPoint(-23F, -11F, -6F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 15, 1, 4, 0F,0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, -1F, 0F, 3F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 86
		bodyModel[58].setRotationPoint(-23F, -11F, -10F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 15, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 124
		bodyModel[59].setRotationPoint(-23F, -7F, -10F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 15, 1, 4, 0F,0F, 3F, -1F, 0F, 3F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 125
		bodyModel[60].setRotationPoint(-23F, 2F, -10F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 15, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 126
		bodyModel[61].setRotationPoint(-23F, -7F, 3F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 15, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, -1F, 0F, 3F, -1F); // Box 128
		bodyModel[62].setRotationPoint(-23F, -11F, 0F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 9, 1, 6, 0F,0F, -1F, -1F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 130
		bodyModel[63].setRotationPoint(-32F, -10F, -6F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 9, 6, 1, 0F,0F, -1F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 132
		bodyModel[64].setRotationPoint(-32F, -7F, -9F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 9, 4, 1, 0F,0F, -2F, -4F, 0F, 0F, -3F, 0F, -1F, 2F, 0F, -2F, 3F, 0F, 1F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 1F, 0F); // Box 133
		bodyModel[65].setRotationPoint(-32F, -11F, -9F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 9, 4, 1, 0F,0F, -2F, 3F, 0F, -1F, 2F, 0F, 0F, -3F, 0F, -2F, -4F, 0F, 1F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 1F, -1F); // Box 134
		bodyModel[66].setRotationPoint(-32F, -11F, 2F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 9, 6, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -1F, -1F); // Box 135
		bodyModel[67].setRotationPoint(-32F, -7F, 2F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 9, 4, 1, 0F,0F, 1F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 1F, 0F, 0F, -2F, -4F, 0F, 0F, -3F, 0F, -1F, 2F, 0F, -2F, 3F); // Box 136
		bodyModel[68].setRotationPoint(-32F, -1F, -9F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 9, 4, 1, 0F,0F, 1F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 1F, -1F, 0F, -2F, 3F, 0F, -1F, 2F, 0F, 0F, -3F, 0F, -2F, -4F); // Box 138
		bodyModel[69].setRotationPoint(-32F, -1F, 2F);

		bodyModel[70].addBox(0F, 0F, 0F, 1, 7, 5, 0F); // Box 139
		bodyModel[70].setRotationPoint(-7F, -8F, 4F);

		bodyModel[71].addBox(0F, 0F, 0F, 1, 5, 4, 0F); // Box 140
		bodyModel[71].setRotationPoint(-10F, -6F, 6F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 1, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 141
		bodyModel[72].setRotationPoint(-11F, -6F, 7F);

		bodyModel[73].addBox(0F, 0F, 0F, 2, 6, 4, 0F); // Box 142
		bodyModel[73].setRotationPoint(-15.5F, -6.5F, 6F);

		bodyModel[74].addBox(0F, 0F, 0F, 1, 5, 4, 0F); // Box 143
		bodyModel[74].setRotationPoint(-13.5F, -6F, 6F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 1, 5, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 144
		bodyModel[75].setRotationPoint(-12.5F, -6F, 7F);

		bodyModel[76].addBox(0F, 0F, 0F, 2, 6, 4, 0F); // Box 145
		bodyModel[76].setRotationPoint(-20F, -6.5F, 6F);

		bodyModel[77].addBox(0F, 0F, 0F, 1, 5, 4, 0F); // Box 146
		bodyModel[77].setRotationPoint(-18F, -6F, 6F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 1, 5, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 147
		bodyModel[78].setRotationPoint(-17F, -6F, 7F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 3, 4, 5, 0F,0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 149
		bodyModel[79].setRotationPoint(-36F, -17F, -5.5F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 3, 4, 3, 0F,0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 151
		bodyModel[80].setRotationPoint(-33F, -17F, -4.5F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 3, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 152
		bodyModel[81].setRotationPoint(-39F, -17F, -4.5F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 3, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 153
		bodyModel[82].setRotationPoint(-36F, -18F, -6.5F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F); // Box 156
		bodyModel[83].setRotationPoint(-38F, -19F, -4.5F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F); // Box 162
		bodyModel[84].setRotationPoint(-33F, -19F, -4.5F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 7, 0, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 163
		bodyModel[85].setRotationPoint(-38F, -19.01F, -6.5F);

		bodyModel[86].addBox(0F, 0F, 0F, 3, 2, 4, 0F); // Box 164
		bodyModel[86].setRotationPoint(-23.5F, -5F, 6F);

		bodyModel[87].addBox(0F, 0F, 0F, 2, 2, 4, 0F); // Box 165
		bodyModel[87].setRotationPoint(-24F, -2F, 6F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 166
		bodyModel[88].setRotationPoint(-22F, -2F, 7F);

		bodyModel[89].addBox(0F, 0F, 0F, 3, 1, 2, 0F); // Box 167
		bodyModel[89].setRotationPoint(-23.5F, -3F, 7F);

		bodyModel[90].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 168
		bodyModel[90].setRotationPoint(-26F, -2F, 7.5F);

		bodyModel[91].addBox(0F, 0F, 0F, 1, 7, 5, 0F); // Box 169
		bodyModel[91].setRotationPoint(-8F, -15F, 4F);

		bodyModel[92].addBox(0F, 0F, 0F, 1, 1, 14, 0F); // Box 170
		bodyModel[92].setRotationPoint(2F, -16F, -7F);

		bodyModel[93].addBox(0F, 0F, 0F, 1, 14, 18, 0F); // Box 171
		bodyModel[93].setRotationPoint(2F, -15F, -9F);

		bodyModel[94].addBox(0F, 0F, 0F, 6, 1, 18, 0F); // Box 172
		bodyModel[94].setRotationPoint(3F, -10F, -9F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 22, 3, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 173
		bodyModel[95].setRotationPoint(-39F, 0F, -8F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 6, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F); // Box 174
		bodyModel[96].setRotationPoint(-23F, 3F, -8F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 6, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 175
		bodyModel[97].setRotationPoint(-7F, 3F, -8F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 17, 3, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 176
		bodyModel[98].setRotationPoint(-7F, 0F, -8F);

		bodyModel[99].addBox(0F, 0F, 0F, 0, 4, 18, 0F); // Box 187
		bodyModel[99].setRotationPoint(-40F, 4F, -9F);

		bodyModel[100].addShapeBox(0F, -0.5F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 189
		bodyModel[100].setRotationPoint(-6F, -17F, -2F);
		bodyModel[100].rotateAngleZ = 0.27925268F;

		bodyModel[101].addShapeBox(0F, 0F, 0F, 6, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 192
		bodyModel[101].setRotationPoint(4F, 0F, 8F);

		bodyModel[102].addBox(0F, 0F, 0F, 2, 3, 4, 0F); // Box 193
		bodyModel[102].setRotationPoint(-29F, -14F, -5F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 194
		bodyModel[103].setRotationPoint(-27F, -14F, -4F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 195
		bodyModel[104].setRotationPoint(-30F, -14F, -4F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 196
		bodyModel[105].setRotationPoint(-27F, -15F, -4F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 197
		bodyModel[106].setRotationPoint(-30F, -15F, -4F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 198
		bodyModel[107].setRotationPoint(-29F, -15F, -4F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 199
		bodyModel[108].setRotationPoint(-29F, -11F, -5F);

		bodyModel[109].addBox(0F, 0F, 0F, 2, 3, 6, 0F); // Box 206
		bodyModel[109].setRotationPoint(-19F, -15F, -6F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F); // Box 207
		bodyModel[110].setRotationPoint(-21F, -15F, -4F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F); // Box 208
		bodyModel[111].setRotationPoint(-17F, -15F, -4F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F); // Box 209
		bodyModel[112].setRotationPoint(-17F, -17F, -4F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F); // Box 210
		bodyModel[113].setRotationPoint(-21F, -17F, -4F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 211
		bodyModel[114].setRotationPoint(-19F, -17F, -4F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 212
		bodyModel[115].setRotationPoint(-19F, -12F, -6F);

		bodyModel[116].addBox(0F, 0F, 0F, 14, 2, 1, 0F); // Box 218
		bodyModel[116].setRotationPoint(-38F, -2F, 4F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 114
		bodyModel[117].setRotationPoint(-24F, -14F, -3.5F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[118].setRotationPoint(-24F, -15F, -3.5F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 78
		bodyModel[119].setRotationPoint(-23.75F, -13.5F, -3.25F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 113
		bodyModel[120].setRotationPoint(-24F, -12F, -5F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 114
		bodyModel[121].setRotationPoint(-24F, -15F, -5F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 115
		bodyModel[122].setRotationPoint(-24F, -15F, -2F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 116
		bodyModel[123].setRotationPoint(-24F, -15.5F, -4F);

		bodyModel[124].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 117
		bodyModel[124].setRotationPoint(-24F, -11.5F, -4F);

		bodyModel[125].addBox(-1F, -1F, 0F, 2, 2, 2, 0F); // Box 201
		bodyModel[125].setRotationPoint(-12F, -12.5F, -4F);
		bodyModel[125].rotateAngleZ = 0.78539816F;

		bodyModel[126].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 202
		bodyModel[126].setRotationPoint(-12F, -18F, -3.5F);

		bodyModel[127].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 229
		bodyModel[127].setRotationPoint(-12.5F, -11.5F, -4F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 2, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 219
		bodyModel[128].setRotationPoint(-7F, -11F, -5F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 2, 4, 3, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 220
		bodyModel[129].setRotationPoint(-7F, -11F, -8F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 2, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 221
		bodyModel[130].setRotationPoint(-7F, -11F, -1F);

		bodyModel[131].addBox(0F, 0F, 0F, 3, 1, 2, 0F); // Box 222
		bodyModel[131].setRotationPoint(-39F, -10F, -4F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 9, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 223
		bodyModel[132].setRotationPoint(-7F, -15F, -9F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 9, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 224
		bodyModel[133].setRotationPoint(-7F, -15F, 7F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 9, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 225
		bodyModel[134].setRotationPoint(-7F, -16F, -7F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 9, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 226
		bodyModel[135].setRotationPoint(-7F, -16F, 2F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F); // Box 228
		bodyModel[136].setRotationPoint(-35F, -8.5F, -0.5F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F,0.25F, 0.75F, 0.25F, 0.25F, -0.75F, -3.75F, 0.25F, -0.75F, 4.25F, 0.25F, 0.75F, 0.25F, 0.25F, -0.25F, 0.25F, 0.25F, 1.25F, -3.75F, 0.25F, 1.25F, 4.25F, 0.25F, -0.25F, 0.25F); // Box 230
		bodyModel[137].setRotationPoint(-33.5F, -8F, 1F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, -1.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, -1.25F); // Box 231
		bodyModel[138].setRotationPoint(-35F, -8.5F, 1F);

		bodyModel[139].addBox(0F, 0F, 0F, 1, 8, 2, 0F); // Box 232
		bodyModel[139].setRotationPoint(-25F, -8F, 2F);

		bodyModel[140].addBox(0F, 0F, 0F, 1, 2, 3, 0F); // Box 233
		bodyModel[140].setRotationPoint(-22.5F, -7F, 5F);

		bodyModel[141].addBox(0F, 0F, 0F, 1, 3, 3, 0F); // Box 234
		bodyModel[141].setRotationPoint(-40F, -5.5F, -4.5F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F); // Box 235
		bodyModel[142].setRotationPoint(-35F, -4F, 2.5F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 236
		bodyModel[143].setRotationPoint(-36F, -4F, 2.5F);

		bodyModel[144].addBox(0F, 0F, 0F, 15, 0, 2, 0F); // Box 36
		bodyModel[144].setRotationPoint(-23F, -10F, 1F);
		bodyModel[144].rotateAngleX = 0.78539816F;

		bodyModel[145].addBox(0F, 0F, -2F, 15, 0, 2, 0F); // Box 37
		bodyModel[145].setRotationPoint(-23F, -10F, -7F);
		bodyModel[145].rotateAngleX = -0.78539816F;

		bodyModel[146].addBox(0F, 0F, 0F, 7, 0, 2, 0F); // Box 239
		bodyModel[146].setRotationPoint(-39F, -8F, 0F);
		bodyModel[146].rotateAngleX = 0.78539816F;

		bodyModel[147].addBox(0F, 0F, -2F, 7, 0, 2, 0F); // Box 240
		bodyModel[147].setRotationPoint(-39F, -8F, -6F);
		bodyModel[147].rotateAngleX = -0.78539816F;

		bodyModel[148].addShapeBox(0F, 0F, 0F, 9, 0, 2, 0F,0F, 0F, 0F, 0F, 0.7F, -2.1F, 0F, 0.7F, 2.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, -2.1F, 0F, -0.7F, 2.1F, 0F, 0F, 0F); // Box 241
		bodyModel[148].setRotationPoint(-32F, -8F, 0F);
		bodyModel[148].rotateAngleX = 0.78539816F;

		bodyModel[149].addShapeBox(0F, 0F, -2F, 9, 0, 2, 0F,0F, 0F, 0F, 0F, 0.7F, 2.1F, 0F, 0.7F, -2.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 2.1F, 0F, -0.7F, -2.1F, 0F, 0F, 0F); // Box 242
		bodyModel[149].setRotationPoint(-32F, -8F, -6F);
		bodyModel[149].rotateAngleX = -0.78539816F;

		bodyModel[150].addBox(0F, 0F, 0F, 17, 1, 1, 0F); // Box 259
		bodyModel[150].setRotationPoint(-37F, 0.5F, -9F);

		bodyModel[151].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 260
		bodyModel[151].setRotationPoint(-36F, -3.5F, -8.5F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 261
		bodyModel[152].setRotationPoint(-32F, -3.5F, -8.5F);

		bodyModel[153].addBox(0F, 0F, 0F, 6, 1, 1, 0F); // Box 262
		bodyModel[153].setRotationPoint(-23F, -3.5F, -10.5F);

		bodyModel[154].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 263
		bodyModel[154].setRotationPoint(-16F, -7.5F, -10.5F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 264
		bodyModel[155].setRotationPoint(-17F, -3.5F, -10.5F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -2F, 0F, 0F, 0.25F, -1.5F, 0F, -0.5F, 1.25F, 0F, -2F, 0F, -1F, 1F, 0F, 0F, -0.5F, -0.75F, 0F, 0.25F, 0.5F, -1F, 1F, 0F); // Box 265
		bodyModel[156].setRotationPoint(-16F, -9.5F, -10.5F);

		bodyModel[157].addBox(0F, -0.5F, -0.5F, 4, 1, 1, 0F); // Box 266
		bodyModel[157].setRotationPoint(-14F, -9F, -9F);
		bodyModel[157].rotateAngleX = -0.78539816F;

		bodyModel[158].addBox(0F, 0F, 0F, 1, 7, 1, 0F); // Box 267
		bodyModel[158].setRotationPoint(-13F, -6.5F, -10.5F);

		bodyModel[159].addBox(0F, 0F, 0F, 1, 7, 1, 0F); // Box 268
		bodyModel[159].setRotationPoint(-11.5F, -6.5F, -10.5F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F); // Box 269
		bodyModel[160].setRotationPoint(-20F, 0.5F, -9F);

		bodyModel[161].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 270
		bodyModel[161].setRotationPoint(-13F, 0.5F, -10.5F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 13, 1, 1, 0F,0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F); // Box 271
		bodyModel[162].setRotationPoint(-10F, 0.5F, -9F);

		bodyModel[163].addBox(0F, 0F, 0F, 10, 6, 12, 0F); // Box 275
		bodyModel[163].setRotationPoint(-17F, 0F, -8F);

		bodyModel[164].addBox(0F, 0F, 0F, 4, 8, 0, 0F); // Box 276
		bodyModel[164].setRotationPoint(-3F, 0F, -10F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 10, 2, 8, 0F,0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 277
		bodyModel[165].setRotationPoint(-17F, 6F, -6F);

		bodyModel[166].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 278
		bodyModel[166].setRotationPoint(-10F, 0F, 9.25F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 6, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F); // Box 279
		bodyModel[167].setRotationPoint(-23F, 3F, 2F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 6, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 280
		bodyModel[168].setRotationPoint(-7F, 3F, 2F);

		bodyModel[169].addBox(0F, 0F, 0F, 4, 3, 0, 0F); // Box 281
		bodyModel[169].setRotationPoint(-3F, 0F, 10F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 4, 4, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 282
		bodyModel[170].setRotationPoint(-3F, 3F, 10F);

		bodyModel[171].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 286
		bodyModel[171].setRotationPoint(-18F, 0F, 9.25F);

		bodyModel[172].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 287
		bodyModel[172].setRotationPoint(-13.5F, 0F, 9.25F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 288
		bodyModel[173].setRotationPoint(-10F, -1F, 9.25F);

		bodyModel[174].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 289
		bodyModel[174].setRotationPoint(-18F, -1F, 9.25F);

		bodyModel[175].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 290
		bodyModel[175].setRotationPoint(-13.5F, -1F, 9.25F);

		bodyModel[176].addBox(-15F, -0.5F, 1.5F, 15, 1, 1, 0F); // Box 291 reverser
		bodyModel[176].setRotationPoint(-6F, 2.75F, 8F);

		bodyModel[177].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 292
		bodyModel[177].setRotationPoint(-19F, 3.5F, 10F);

		bodyModel[178].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -1F, -0.25F, 0F, -1F); // Box 293
		bodyModel[178].setRotationPoint(-12F, 4.5F, 9F);

		bodyModel[179].addShapeBox(0F, -0.5F, -0.5F, 4, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 117 rod
		bodyModel[179].setRotationPoint(-22F, 7F, 8.5F);
		bodyModel[179].rotateAngleX = 0.78539816F;

		bodyModel[180].addShapeBox(0F, -0.5F, -0.5F, 5, 1, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 295 rod
		bodyModel[180].setRotationPoint(-8F, 7F, 8.5F);
		bodyModel[180].rotateAngleX = 0.78539816F;

		bodyModel[181].addShapeBox(0F, -1.5F, -1.5F, 1, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 296 rod spinny
		bodyModel[181].setRotationPoint(-3.5F, 7F, 8.5F);
		bodyModel[181].rotateAngleX = 0.78539816F;

		bodyModel[182].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -1F, -0.5F, 0F, -1F); // Box 297
		bodyModel[182].setRotationPoint(-9F, 4.5F, 9F);

		bodyModel[183].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0.5F, 0F, -1F); // Box 298
		bodyModel[183].setRotationPoint(-14.5F, 4.5F, 9F);

		bodyModel[184].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0F, -1F, -0.5F); // Box 299
		bodyModel[184].setRotationPoint(-17F, 4.5F, 9F);

		bodyModel[185].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0.5F, 0F, -1F); // Box 300
		bodyModel[185].setRotationPoint(-19F, 4.5F, 9F);

		bodyModel[186].addBox(-0.5F, -4F, -0.5F, 1, 4, 1, 0F); // Box 301 piston go brr
		bodyModel[186].setRotationPoint(-9.5F, 3F, 7.5F);

		bodyModel[187].addBox(-0.5F, -4F, -0.5F, 1, 4, 1, 0F); // Box 302 piston go brr
		bodyModel[187].setRotationPoint(-13F, 1F, 7.5F);

		bodyModel[188].addBox(-0.5F, -4F, -0.5F, 1, 4, 1, 0F); // Box 303 piston go brr
		bodyModel[188].setRotationPoint(-17.5F, -1F, 7.5F);

		bodyModel[189].addShapeBox(0F, -0.5F, -0.5F, 1, 1, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 304 rod
		bodyModel[189].setRotationPoint(-11.5F, 7F, 8.5F);
		bodyModel[189].rotateAngleX = 0.78539816F;

		bodyModel[190].addShapeBox(0F, -0.5F, -0.5F, 2, 1, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 305 rod
		bodyModel[190].setRotationPoint(-16F, 7F, 8.5F);
		bodyModel[190].rotateAngleX = 0.78539816F;

		bodyModel[191].addShapeBox(0F, -2.5F, -0.5F, 1, 5, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 306 rod bit go rotate
		bodyModel[191].setRotationPoint(-9F, 7F, 8.5F);
		bodyModel[191].rotateAngleX = 0.78539816F;

		bodyModel[192].addShapeBox(0F, -2.5F, -0.5F, 1, 5, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 307 rod bit go rotate
		bodyModel[192].setRotationPoint(-11F, 7F, 8.5F);
		bodyModel[192].rotateAngleX = 0.78539816F;

		bodyModel[193].addShapeBox(0F, 1.5F, -0.5F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 308 rod bit go rotate
		bodyModel[193].setRotationPoint(-10F, 7F, 8.5F);
		bodyModel[193].rotateAngleX = 0.78539816F;

		bodyModel[194].addShapeBox(0F, -2.5F, -0.5F, 1, 5, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 309 rod bit go rotate
		bodyModel[194].setRotationPoint(-14F, 7F, 8.5F);
		bodyModel[194].rotateAngleX = -1.57079633F;

		bodyModel[195].addShapeBox(0F, 1.5F, -0.5F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 310 rod bit go rotate
		bodyModel[195].setRotationPoint(-13.5F, 7F, 8.5F);
		bodyModel[195].rotateAngleX = -1.57079633F;

		bodyModel[196].addShapeBox(0F, -2.5F, -0.5F, 1, 5, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 311 rod bit go rotate
		bodyModel[196].setRotationPoint(-13F, 7F, 8.5F);
		bodyModel[196].rotateAngleX = -1.57079633F;

		bodyModel[197].addShapeBox(0F, -2.5F, -0.5F, 1, 5, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 312 rod bit go rotate
		bodyModel[197].setRotationPoint(-18.5F, 7F, 8.5F);
		bodyModel[197].rotateAngleX = -3.14159265F;

		bodyModel[198].addShapeBox(0F, 1.5F, -0.5F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 313 rod bit go rotate
		bodyModel[198].setRotationPoint(-18F, 7F, 8.5F);
		bodyModel[198].rotateAngleX = -3.14159265F;

		bodyModel[199].addShapeBox(0F, -2.5F, -0.5F, 1, 5, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 314 rod bit go rotate
		bodyModel[199].setRotationPoint(-17.5F, 7F, 8.5F);
		bodyModel[199].rotateAngleX = -3.14159265F;

		bodyModel[200].addShapeBox(0F, -1.5F, -1.5F, 1, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 315 rod spinny
		bodyModel[200].setRotationPoint(-22.5F, 7F, 8.5F);
		bodyModel[200].rotateAngleX = 0.78539816F;

		bodyModel[201].addShapeBox(-0.5F, -6F, -0.5F, 1, 6, 1, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 316 piston part go rotate
		bodyModel[201].setRotationPoint(-9.5F, 3F, 7.5F);
		bodyModel[201].rotateAngleX = 3.56047167F;

		bodyModel[202].addShapeBox(-0.5F, -6F, -0.5F, 1, 6, 1, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 317 piston part go rotate
		bodyModel[202].setRotationPoint(-17.5F, -1F, 7.5F);
		bodyModel[202].rotateAngleX = 3.31612558F;

		bodyModel[203].addShapeBox(-0.5F, -6F, -0.5F, 1, 6, 1, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 318 piston part go rotate
		bodyModel[203].setRotationPoint(-13F, 1F, 7.5F);
		bodyModel[203].rotateAngleX = 2.98451302F;

		bodyModel[204].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 319
		bodyModel[204].setRotationPoint(-19F, 3.5F, 6F);

		bodyModel[205].addBox(0F, 0F, 0F, 1, 1, 4, 0F); // Box 320
		bodyModel[205].setRotationPoint(-15F, 3.5F, 6F);

		bodyModel[206].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 321
		bodyModel[206].setRotationPoint(-12F, 3.5F, 6F);

		bodyModel[207].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 322
		bodyModel[207].setRotationPoint(-9F, 3.5F, 6F);

		bodyModel[208].addBox(0F, 0F, 0F, 11, 1, 2, 0F); // Box 323
		bodyModel[208].setRotationPoint(-19F, 3.5F, 4F);

		bodyModel[209].addShapeBox(0F, -1.5F, 0.5F, 1, 3, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F); // Box 326 rod bit go rotate
		bodyModel[209].setRotationPoint(-9F, 7F, 8.5F);
		bodyModel[209].rotateAngleX = 0.78539816F;

		bodyModel[210].addShapeBox(0F, -2.5F, 0.5F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 327 rod bit go rotate
		bodyModel[210].setRotationPoint(-9F, 7F, 8.5F);
		bodyModel[210].rotateAngleX = 0.78539816F;

		bodyModel[211].addShapeBox(0F, -1.5F, -1.5F, 1, 3, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 328 rod bit go rotate
		bodyModel[211].setRotationPoint(-9F, 7F, 8.5F);
		bodyModel[211].rotateAngleX = 0.78539816F;

		bodyModel[212].addShapeBox(0F, -2.5F, -1.5F, 1, 1, 1, 0F,0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 329 rod bit go rotate
		bodyModel[212].setRotationPoint(-9F, 7F, 8.5F);
		bodyModel[212].rotateAngleX = 0.78539816F;

		bodyModel[213].addShapeBox(0F, -1.5F, -1.5F, 1, 3, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 330 rod bit go rotate
		bodyModel[213].setRotationPoint(-11F, 7F, 8.5F);
		bodyModel[213].rotateAngleX = 0.78539816F;

		bodyModel[214].addShapeBox(0F, -2.5F, -1.5F, 1, 1, 1, 0F,-0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 331 rod bit go rotate
		bodyModel[214].setRotationPoint(-11F, 7F, 8.5F);
		bodyModel[214].rotateAngleX = 0.78539816F;

		bodyModel[215].addShapeBox(0F, -2.5F, 0.5F, 1, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 332 rod bit go rotate
		bodyModel[215].setRotationPoint(-11F, 7F, 8.5F);
		bodyModel[215].rotateAngleX = 0.78539816F;

		bodyModel[216].addShapeBox(0F, -1.5F, 0.5F, 1, 3, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F); // Box 333 rod bit go rotate
		bodyModel[216].setRotationPoint(-11F, 7F, 8.5F);
		bodyModel[216].rotateAngleX = 0.78539816F;

		bodyModel[217].addShapeBox(0F, -1.5F, -1.5F, 1, 3, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 334 rod bit go rotate
		bodyModel[217].setRotationPoint(-19F, 7F, 8.5F);
		bodyModel[217].rotateAngleX = -3.14159265F;

		bodyModel[218].addShapeBox(0F, -2.5F, -1.5F, 1, 1, 1, 0F,-0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 335 rod bit go rotate
		bodyModel[218].setRotationPoint(-19F, 7F, 8.5F);
		bodyModel[218].rotateAngleX = -3.14159265F;

		bodyModel[219].addShapeBox(0F, -2.5F, 0.5F, 1, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 336 rod bit go rotate
		bodyModel[219].setRotationPoint(-19F, 7F, 8.5F);
		bodyModel[219].rotateAngleX = -3.14159265F;

		bodyModel[220].addShapeBox(0F, -1.5F, 0.5F, 1, 3, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F); // Box 337 rod bit go rotate
		bodyModel[220].setRotationPoint(-19F, 7F, 8.5F);
		bodyModel[220].rotateAngleX = -3.14159265F;

		bodyModel[221].addShapeBox(0F, -1.5F, 0.5F, 1, 3, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F); // Box 338 rod bit go rotate
		bodyModel[221].setRotationPoint(-17F, 7F, 8.5F);
		bodyModel[221].rotateAngleX = -3.14159265F;

		bodyModel[222].addShapeBox(0F, -2.5F, 0.5F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 339 rod bit go rotate
		bodyModel[222].setRotationPoint(-17F, 7F, 8.5F);
		bodyModel[222].rotateAngleX = -3.14159265F;

		bodyModel[223].addShapeBox(0F, -2.5F, -1.5F, 1, 1, 1, 0F,0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 340 rod bit go rotate
		bodyModel[223].setRotationPoint(-17F, 7F, 8.5F);
		bodyModel[223].rotateAngleX = -3.14159265F;

		bodyModel[224].addShapeBox(0F, -1.5F, -1.5F, 1, 3, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 341 rod bit go rotate
		bodyModel[224].setRotationPoint(-17F, 7F, 8.5F);
		bodyModel[224].rotateAngleX = -3.14159265F;

		bodyModel[225].addShapeBox(0F, -1.5F, -1.5F, 1, 3, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 342 rod bit go rotate
		bodyModel[225].setRotationPoint(-13F, 7F, 8.5F);
		bodyModel[225].rotateAngleX = -1.57079633F;

		bodyModel[226].addShapeBox(0F, -1.5F, 0.5F, 1, 3, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F); // Box 343 rod bit go rotate
		bodyModel[226].setRotationPoint(-13F, 7F, 8.5F);
		bodyModel[226].rotateAngleX = -1.57079633F;

		bodyModel[227].addShapeBox(0F, -2.5F, 0.5F, 1, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 344 rod bit go rotate
		bodyModel[227].setRotationPoint(-13F, 7F, 8.5F);
		bodyModel[227].rotateAngleX = -1.57079633F;

		bodyModel[228].addShapeBox(0F, -2.5F, -1.5F, 1, 1, 1, 0F,-0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 345 rod bit go rotate
		bodyModel[228].setRotationPoint(-13F, 7F, 8.5F);
		bodyModel[228].rotateAngleX = -1.57079633F;

		bodyModel[229].addShapeBox(0F, -2.5F, -1.5F, 1, 1, 1, 0F,0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 346 rod bit go rotate
		bodyModel[229].setRotationPoint(-14F, 7F, 8.5F);
		bodyModel[229].rotateAngleX = -1.57079633F;

		bodyModel[230].addShapeBox(0F, -1.5F, -1.5F, 1, 3, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 347 rod bit go rotate
		bodyModel[230].setRotationPoint(-14F, 7F, 8.5F);
		bodyModel[230].rotateAngleX = -1.57079633F;

		bodyModel[231].addShapeBox(0F, -1.5F, 0.5F, 1, 3, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F); // Box 348 rod bit go rotate
		bodyModel[231].setRotationPoint(-14F, 7F, 8.5F);
		bodyModel[231].rotateAngleX = -1.57079633F;

		bodyModel[232].addShapeBox(0F, -2.5F, 0.5F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 349 rod bit go rotate
		bodyModel[232].setRotationPoint(-14F, 7F, 8.5F);
		bodyModel[232].rotateAngleX = -1.57079633F;

		bodyModel[233].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 350
		bodyModel[233].setRotationPoint(-15F, -18F, -3.5F);

		bodyModel[234].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 351
		bodyModel[234].setRotationPoint(-15F, -16F, -2F);

		bodyModel[235].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 352
		bodyModel[235].setRotationPoint(-15F, -16F, -4F);

		bodyModel[236].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 353
		bodyModel[236].setRotationPoint(-15F, -13F, -3F);

		bodyModel[237].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 354
		bodyModel[237].setRotationPoint(-15F, -18F, -5.5F);

		bodyModel[238].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 355
		bodyModel[238].setRotationPoint(-17F, -13F, -5.5F);

		bodyModel[239].addShapeBox(0F, -1F, -1.5F, 1, 2, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 356 eccentric
		bodyModel[239].setRotationPoint(-8F, 7F, 8.5F);
		bodyModel[239].rotateAngleX = 0.78539816F;

		bodyModel[240].addShapeBox(0F, -1F, -0.5F, 1, 2, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 357 eccentric
		bodyModel[240].setRotationPoint(-7F, 7F, 8.5F);
		bodyModel[240].rotateAngleX = 0.78539816F;

		bodyModel[241].addShapeBox(-1F, -0.5F, -0.5F, 1, 1, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 358 reverser
		bodyModel[241].setRotationPoint(-6F, 2.75F, 8F);

		bodyModel[242].addShapeBox(-1F, -2.5F, -1.5F, 0, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 361 reverser bit
		bodyModel[242].setRotationPoint(-6.5F, 2.75F, 8F);

		bodyModel[243].addShapeBox(0F, -0.5F, -1F, 1, 2, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 366 eccentric
		bodyModel[243].setRotationPoint(-17F, 7F, 8.5F);

		bodyModel[244].addShapeBox(0F, -1.5F, -1F, 1, 2, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 367 eccentric
		bodyModel[244].setRotationPoint(-16F, 7F, 8.5F);

		bodyModel[245].addShapeBox(0F, -1F, -0.5F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 368 eccentric
		bodyModel[245].setRotationPoint(-21F, 7F, 8.5F);

		bodyModel[246].addShapeBox(0F, -1F, -1.5F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 369 eccentric
		bodyModel[246].setRotationPoint(-20F, 7F, 8.5F);

		bodyModel[247].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 372
		bodyModel[247].setRotationPoint(-20F, 0F, 9.25F);

		bodyModel[248].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 373
		bodyModel[248].setRotationPoint(-15.5F, 0F, 9.25F);

		bodyModel[249].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 374
		bodyModel[249].setRotationPoint(-9F, 0F, 9.25F);

		bodyModel[250].addShapeBox(-13F, -2.5F, -1.5F, 0, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 375 reverser bit
		bodyModel[250].setRotationPoint(-6.5F, 2.75F, 8F);

		bodyModel[251].addShapeBox(-8.5F, -2.5F, -1.5F, 0, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 376 reverser bit
		bodyModel[251].setRotationPoint(-6.5F, 2.75F, 8F);

		bodyModel[252].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 377
		bodyModel[252].setRotationPoint(-2F, 1F, 8F);

		bodyModel[253].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 378
		bodyModel[253].setRotationPoint(-2F, 2F, 8F);

		bodyModel[254].addShapeBox(0F, -0.5F, -0.5F, 0, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 379 eccentric bit up down
		bodyModel[254].setRotationPoint(-19.5F, 2F, 7.5F);

		bodyModel[255].addShapeBox(0F, -0.5F, -0.5F, 0, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 380 eccentric bit up down
		bodyModel[255].setRotationPoint(-20.5F, 2.5F, 7.5F);
		bodyModel[255].rotateAngleX = 0.41887902F;

		bodyModel[256].addBox(0F, 0F, 0F, 2, 2, 4, 0F); // Box 381
		bodyModel[256].setRotationPoint(-21F, 0F, 4F);

		bodyModel[257].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 382
		bodyModel[257].setRotationPoint(-8F, 0F, 4F);

		bodyModel[258].addBox(0F, 0F, 0F, 2, 2, 4, 0F); // Box 383
		bodyModel[258].setRotationPoint(-16.5F, 0F, 4F);

		bodyModel[259].addShapeBox(0F, -0.5F, -0.5F, 0, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 384 eccentric bit up down
		bodyModel[259].setRotationPoint(-6F, 2F, 7.5F);
		bodyModel[259].rotateAngleX = 0.40142573F;

		bodyModel[260].addShapeBox(0F, -0.5F, -0.5F, 0, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 385 eccentric bit up down
		bodyModel[260].setRotationPoint(-7F, 2.5F, 7.5F);

		bodyModel[261].addShapeBox(0F, -0.5F, -0.5F, 0, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 386 eccentric bit up down
		bodyModel[261].setRotationPoint(-15.5F, 1F, 7.5F);
		bodyModel[261].rotateAngleX = 0.15707963F;

		bodyModel[262].addShapeBox(0F, -0.5F, -0.5F, 0, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 387 eccentric bit up down
		bodyModel[262].setRotationPoint(-16F, 2.5F, 7.5F);

		bodyModel[263].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 388
		bodyModel[263].setRotationPoint(-13F, -8.5F, -10.5F);

		bodyModel[264].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 389
		bodyModel[264].setRotationPoint(-11.5F, -8.5F, -10.5F);

		bodyModel[265].addBox(0F, -3.5F, -0.5F, 1, 4, 1, 0F); // Box 390
		bodyModel[265].setRotationPoint(-10F, -9F, -9F);
		bodyModel[265].rotateAngleX = -0.83775804F;

		bodyModel[266].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 391
		bodyModel[266].setRotationPoint(-10F, -12F, -6.5F);

		bodyModel[267].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Box 392
		bodyModel[267].setRotationPoint(-10F, -12F, -5.5F);

		bodyModel[268].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 393
		bodyModel[268].setRotationPoint(-10F, -14F, -3.5F);

		bodyModel[269].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, -1F); // Box 394
		bodyModel[269].setRotationPoint(-10F, -12F, 0.5F);

		bodyModel[270].addBox(0F, 0F, 0F, 7, 1, 1, 0F); // Box 395
		bodyModel[270].setRotationPoint(-16F, -10F, 1.5F);

		bodyModel[271].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, -1F); // Box 396
		bodyModel[271].setRotationPoint(-11F, -10F, 2.5F);

		bodyModel[272].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, -1F); // Box 397
		bodyModel[272].setRotationPoint(-13F, -10F, 2.5F);

		bodyModel[273].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 1F, 0F); // Box 398
		bodyModel[273].setRotationPoint(-18F, -10F, 1.5F);

		bodyModel[274].addBox(0F, 0F, 0F, 1, 13, 1, 0F); // Box 399
		bodyModel[274].setRotationPoint(7F, -13F, -10.75F);

		bodyModel[275].addBox(0F, 0F, 0F, 5, 1, 1, 0F); // Box 400
		bodyModel[275].setRotationPoint(3F, 0.5F, -9F);

		bodyModel[276].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0.75F, 0F, -0.5F, 0.75F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0.75F, 0F, 0.5F, 0.75F); // Box 401
		bodyModel[276].setRotationPoint(7F, 0F, -10.75F);

		bodyModel[277].addShapeBox(-0.5F, 0F, -0.5F, 1, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 402
		bodyModel[277].setRotationPoint(7.5F, -14F, -10.25F);
		bodyModel[277].rotateAngleY = -0.08726646F;

		bodyModel[278].addBox(-0.5F, 0F, 0.5F, 1, 1, 12, 0F); // Box 404
		bodyModel[278].setRotationPoint(7.5F, -14F, -10.25F);
		bodyModel[278].rotateAngleY = -0.08726646F;

		bodyModel[279].addShapeBox(-0.5F, 0F, 12.5F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 405
		bodyModel[279].setRotationPoint(7.5F, -14F, -10.25F);
		bodyModel[279].rotateAngleY = -0.08726646F;

		bodyModel[280].addShapeBox(0F, 0F, 0F, 6, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 586 drawbar
		bodyModel[280].setRotationPoint(8F, 2F, -2F);

		bodyModel[281].addBox(0F, 0F, 0F, 3, 1, 5, 0F); // Box 349
		bodyModel[281].setRotationPoint(-6F, -2F, 4F);

		bodyModel[282].addShapeBox(-0.5F, -7F, -0.5F, 1, 7, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 350
		bodyModel[282].setRotationPoint(-4.5F, -3F, 3F);
		bodyModel[282].rotateAngleZ = -0.2268928F;

		bodyModel[283].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F); // Box 351
		bodyModel[283].setRotationPoint(-5F, -3F, 2.5F);

		bodyModel[284].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 352
		bodyModel[284].setRotationPoint(-5F, -5F, -5F);

		bodyModel[285].addShapeBox(-0.5F, -1F, -3.5F, 1, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 353
		bodyModel[285].setRotationPoint(-6F, -12F, 1F);
		bodyModel[285].rotateAngleY = 1.02974426F;

		bodyModel[286].addShapeBox(-0.5F, 0F, -0.5F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 354
		bodyModel[286].setRotationPoint(-6.5F, -12F, 0.5F);
		bodyModel[286].rotateAngleY = 0.01745329F;

		bodyModel[287].addShapeBox(-0.5F, 0F, -6.5F, 1, 4, 7, 0F,0.5F, 0F, -3F, -0.5F, 0F, -3F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -2F, -3F, 0F, -2F, -3F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 355
		bodyModel[287].setRotationPoint(-6.5F, -10F, 4F);
		bodyModel[287].rotateAngleY = 0.61086524F;

		bodyModel[288].addShapeBox(-0.5F, -2F, -1F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 356
		bodyModel[288].setRotationPoint(-6F, -12F, 1F);
		bodyModel[288].rotateAngleY = 1.02974426F;

		bodyModel[289].addShapeBox(-0.5F, -2F, -3F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 357
		bodyModel[289].setRotationPoint(-6F, -12F, 1F);
		bodyModel[289].rotateAngleY = 1.02974426F;

		bodyModel[290].addShapeBox(-0.5F, 0F, -0.5F, 1, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 358
		bodyModel[290].setRotationPoint(-3F, -9F, -1F);
		bodyModel[290].rotateAngleX = 0.34906585F;
		bodyModel[290].rotateAngleY = 0.45378561F;

		bodyModel[291].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 359
		bodyModel[291].setRotationPoint(-5F, -9F, -2F);

		bodyModel[292].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 360
		bodyModel[292].setRotationPoint(-5F, -8.5F, -7F);

		bodyModel[293].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 361
		bodyModel[293].setRotationPoint(-5F, -8.5F, -5.5F);

		bodyModel[294].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 362
		bodyModel[294].setRotationPoint(-4F, -8.5F, -6.5F);

		bodyModel[295].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 363
		bodyModel[295].setRotationPoint(-5.5F, -7.5F, -6F);

		bodyModel[296].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 364
		bodyModel[296].setRotationPoint(-5.5F, -9F, -4F);

		bodyModel[297].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F); // Box 365
		bodyModel[297].setRotationPoint(-4F, -6F, 1F);

		bodyModel[298].addShapeBox(-0.5F, 0F, -3.5F, 1, 1, 4, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 366
		bodyModel[298].setRotationPoint(-3.5F, -7F, 1.5F);
		bodyModel[298].rotateAngleY = 0.62831853F;

		bodyModel[299].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 369
		bodyModel[299].setRotationPoint(2F, 3F, -1F);

		bodyModel[300].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 370
		bodyModel[300].setRotationPoint(6F, 3F, -1F);

		bodyModel[301].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 371
		bodyModel[301].setRotationPoint(-33F, 3F, -1F);

		bodyModel[302].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 372
		bodyModel[302].setRotationPoint(-29F, 3F, -1F);

		bodyModel[303].addBox(-0.5F, -4F, -1F, 0, 4, 1, 0F); // Box 579
		bodyModel[303].setRotationPoint(-5F, -12F, 5F);
		bodyModel[303].rotateAngleY = 0.64577182F;

		bodyModel[304].addShapeBox(0F, 0F, 0F, 6, 1, 18, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 580 coal tile
		bodyModel[304].setRotationPoint(3F, -9.5F, -9F);

		bodyModel[305].addBox(0F, 0F, 0F, 2, 2, 3, 0F); // Box 581
		bodyModel[305].setRotationPoint(6F, -11.5F, -1.5F);

		bodyModel[306].addShapeBox(-3.5F, 0F, -0.5F, 4, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 329 door swing right
		bodyModel[306].setRotationPoint(0.5F, -8F, -9.5F);

		bodyModel[307].addShapeBox(-3.5F, 0F, -0.5F, 4, 7, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 332 door swing left
		bodyModel[307].setRotationPoint(0.5F, -8F, 9.5F);

		bodyModel[308].addBox(0F, 0F, 0F, 0, 13, 1, 0F); // Box 179
		bodyModel[308].setRotationPoint(1.5F, -11F, 9.5F);

		bodyModel[309].addBox(0F, 0F, 0F, 0, 13, 1, 0F); // Box 180
		bodyModel[309].setRotationPoint(-3.5F, -11F, 9.5F);

		bodyModel[310].addBox(0F, 0F, 0F, 0, 13, 1, 0F); // Box 587
		bodyModel[310].setRotationPoint(-3.5F, -11F, -10.5F);

		bodyModel[311].addBox(0F, 0F, 0F, 0, 13, 1, 0F); // Box 588
		bodyModel[311].setRotationPoint(1.5F, -11F, -10.5F);

		bodyModel[312].addBox(0F, 0F, 0F, 1, 0, 18, 0F); // Box 589
		bodyModel[312].setRotationPoint(-41F, 1F, -9F);

		bodyModel[313].addBox(0F, 0F, 0F, 3, 0, 4, 0F); // Box 591
		bodyModel[313].setRotationPoint(-40F, -10F, -5F);

		bodyModel[314].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 592
		bodyModel[314].setRotationPoint(-39F, -10F, -5F);

		bodyModel[315].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 593
		bodyModel[315].setRotationPoint(-39F, -10F, -1F);

		bodyModel[316].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 597
		bodyModel[316].setRotationPoint(5F, 0.5F, -8.5F);
		bodyModel[316].rotateAngleX = -0.78539816F;

		bodyModel[317].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 598 marker glow
		bodyModel[317].setRotationPoint(-39.5F, -8.5F, -7F);

		bodyModel[318].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 599 marker glow
		bodyModel[318].setRotationPoint(-39.5F, -8.5F, 0F);

		bodyModel[319].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 600
		bodyModel[319].setRotationPoint(-10.5F, -5.5F, 10F);
		bodyModel[319].rotateAngleX = -1.01229097F;

		bodyModel[320].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 601
		bodyModel[320].setRotationPoint(-13.5F, -5.5F, 10F);
		bodyModel[320].rotateAngleX = -1.01229097F;

		bodyModel[321].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 602
		bodyModel[321].setRotationPoint(-17.5F, -5.5F, 10F);
		bodyModel[321].rotateAngleX = -1.01229097F;

		bodyModel[322].addBox(0F, 0F, 0F, 12, 0, 1, 0F); // Box 603
		bodyModel[322].setRotationPoint(-18F, -3.5F, 9.5F);

		bodyModel[323].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 1F, 0F, 0F); // Box 388
		bodyModel[323].setRotationPoint(-21F, -12F, -4F);

		bodyModel[324].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 3F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 3F); // Box 389
		bodyModel[324].setRotationPoint(-17F, -12F, -4F);

		bodyModel[325].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 1F, 0F, 0F); // Box 390
		bodyModel[325].setRotationPoint(-30F, -11F, -4F);

		bodyModel[326].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 2F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 2F); // Box 391
		bodyModel[326].setRotationPoint(-27F, -11F, -4F);

		bodyModel[327].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,-1F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F); // Box 392
		bodyModel[327].setRotationPoint(-39F, -18F, -4.5F);

		bodyModel[328].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 2F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F); // Box 393
		bodyModel[328].setRotationPoint(-33F, -18F, -4.5F);

		bodyModel[329].addBox(0F, 0F, 0F, 0, 8, 8, 0F); // Box 370
		bodyModel[329].setRotationPoint(-39.52F, -8F, -7F);

		bodyModel[330].addBox(0F, 0F, 0F, 0, 10, 10, 0F); // Box 371
		bodyModel[330].setRotationPoint(-39.01F, -9F, -8F);

		bodyModel[331].addShapeBox(0F, 0F, 0F, 2, 2, 0, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 154 headlight glow
		bodyModel[331].setRotationPoint(-39.5F, -12.5F, -4.51F);

		bodyModel[332].addShapeBox(0F, 0F, 0F, 2, 2, 0, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 155 headlight glow
		bodyModel[332].setRotationPoint(-39.5F, -12.5F, -1.49F);

		bodyModel[333].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 30 wheel
		bodyModel[333].setRotationPoint(9F, 7F, 6F);

		bodyModel[334].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 46 wheel
		bodyModel[334].setRotationPoint(0F, 7F, 6F);

		bodyModel[335].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 47 wheel
		bodyModel[335].setRotationPoint(0F, 7F, -6F);

		bodyModel[336].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 48 wheel
		bodyModel[336].setRotationPoint(9F, 7F, -6F);

		bodyModel[337].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1.5F, -0.5F, 0F, 1F, -0.5F, 0F, 1F, -0.5F, 0F, -1.5F, -0.5F, 0F); // Box 11
		bodyModel[337].setRotationPoint(1F, 5F, -8F);

		bodyModel[338].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 1F, -0.5F, 0F, -1.5F, -0.5F, 0F, -1.5F, -0.5F, 0F, 1F, -0.5F, 0F); // Box 12
		bodyModel[338].setRotationPoint(7F, 5F, -8F);

		bodyModel[339].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 13
		bodyModel[339].setRotationPoint(2.5F, 8F, -8F);

		bodyModel[340].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0.1F, -0.5F, 0F, 0.1F, -0.5F, 0F, 0.1F, -0.5F, 0F, 0.1F, -0.5F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F); // Box 18
		bodyModel[340].setRotationPoint(2.5F, 6F, -8F);

		bodyModel[341].addBox(0F, 0F, 0F, 2, 2, 17, 0F); // Box 4
		bodyModel[341].setRotationPoint(-1F, 6F, -8.5F);

		bodyModel[342].addBox(0F, 0F, 0F, 2, 2, 17, 0F); // Box 24
		bodyModel[342].setRotationPoint(8F, 6F, -8.5F);

		bodyModel[343].addShapeBox(0F, 0F, 0F, 3, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		bodyModel[343].setRotationPoint(3F, 3.5F, -7F);

		bodyModel[344].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F); // Box 35
		bodyModel[344].setRotationPoint(4F, 3F, 7F);

		bodyModel[345].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F); // Box 36
		bodyModel[345].setRotationPoint(1F, 3F, 7F);

		bodyModel[346].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 37
		bodyModel[346].setRotationPoint(-2F, 3F, 7F);

		bodyModel[347].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[347].setRotationPoint(-2F, 4F, 7F);

		bodyModel[348].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1.5F, -0.5F, 0F, 1F, -0.5F, 0F, 1F, -0.5F, 0F, -1.5F, -0.5F, 0F); // Box 39
		bodyModel[348].setRotationPoint(1F, 5F, 7F);

		bodyModel[349].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 1F, -0.5F, 0F, -1.5F, -0.5F, 0F, -1.5F, -0.5F, 0F, 1F, -0.5F, 0F); // Box 40
		bodyModel[349].setRotationPoint(7F, 5F, 7F);

		bodyModel[350].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[350].setRotationPoint(8F, 4F, 7F);

		bodyModel[351].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 42
		bodyModel[351].setRotationPoint(8F, 3F, 7F);

		bodyModel[352].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 43
		bodyModel[352].setRotationPoint(2.5F, 8F, 7F);

		bodyModel[353].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -2.5F, -0.25F, -0.25F, -2.5F, -0.25F, -0.25F, -2.5F, -0.25F, -0.25F, -2.5F, -0.25F); // Box 44
		bodyModel[353].setRotationPoint(4.75F, 7F, 7F);

		bodyModel[354].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -2.5F, -0.25F, -0.25F, -2.5F, -0.25F, -0.25F, -2.5F, -0.25F, -0.25F, -2.5F, -0.25F); // Box 45
		bodyModel[354].setRotationPoint(3.25F, 7F, 7F);

		bodyModel[355].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0.1F, -0.5F, 0F, 0.1F, -0.5F, 0F, 0.1F, -0.5F, 0F, 0.1F, -0.5F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F); // Box 46
		bodyModel[355].setRotationPoint(2.5F, 6F, 7F);

		bodyModel[356].addShapeBox(0F, 0F, 0F, 15, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 47
		bodyModel[356].setRotationPoint(-3F, 9F, 7F);

		bodyModel[357].addShapeBox(0F, 0F, 0F, 0, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 48
		bodyModel[357].setRotationPoint(-3F, 4F, 7F);

		bodyModel[358].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 53
		bodyModel[358].setRotationPoint(8F, 5F, 7F);

		bodyModel[359].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 54
		bodyModel[359].setRotationPoint(8F, 8F, 7F);

		bodyModel[360].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 57
		bodyModel[360].setRotationPoint(2F, 5F, 7F);

		bodyModel[361].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 58
		bodyModel[361].setRotationPoint(4F, 3F, 7F);

		bodyModel[362].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 59
		bodyModel[362].setRotationPoint(1F, 3F, 7F);

		bodyModel[363].addBox(0F, 0F, 0F, 3, 1, 3, 0F); // Box 60
		bodyModel[363].setRotationPoint(3F, 2.5F, -1.6F);

		bodyModel[364].addBox(-2.5F, -2.5F, 0F, 5, 5, 0, 0F); // Box 154 wheel gear
		bodyModel[364].setRotationPoint(0F, 7F, 6.75F);

		bodyModel[365].addBox(-2.5F, -2.5F, 0F, 5, 5, 0, 0F); // Box 62 wheel gear
		bodyModel[365].setRotationPoint(9F, 7F, 6.75F);

		bodyModel[366].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 63
		bodyModel[366].setRotationPoint(11F, 4F, 7F);

		bodyModel[367].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 64
		bodyModel[367].setRotationPoint(7F, 4F, 7F);

		bodyModel[368].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 65
		bodyModel[368].setRotationPoint(1F, 4F, 7F);

		bodyModel[369].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 116
		bodyModel[369].setRotationPoint(8F, 6F, 9.5F);

		bodyModel[370].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 69
		bodyModel[370].setRotationPoint(-1F, 6F, 9.5F);

		bodyModel[371].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 70
		bodyModel[371].setRotationPoint(-1F, 5F, 7F);

		bodyModel[372].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 73
		bodyModel[372].setRotationPoint(-1F, 8F, 7F);

		bodyModel[373].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 74
		bodyModel[373].setRotationPoint(1F, 4F, 7F);

		bodyModel[374].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0.1F, -0.5F, 0F, -0.4F, -0.5F, 0F, -0.4F, -0.5F, 0F, 0.1F, -0.5F, 0F, -0.05F, 0F, 0F, -0.55F, 0F, 0F, -0.55F, 0F, 0F, -0.05F, 0F, 0F); // Box 75
		bodyModel[374].setRotationPoint(2.25F, 5F, 7F);

		bodyModel[375].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 76
		bodyModel[375].setRotationPoint(-3F, 4F, 7F);

		bodyModel[376].addShapeBox(0F, 0F, 0F, 0, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 77
		bodyModel[376].setRotationPoint(12F, 4F, 7F);

		bodyModel[377].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 78
		bodyModel[377].setRotationPoint(1F, 4F, -8F);

		bodyModel[378].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -1F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 79
		bodyModel[378].setRotationPoint(1F, 3F, -8F);

		bodyModel[379].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.5F, -0.5F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 80
		bodyModel[379].setRotationPoint(4F, 3F, -8F);

		bodyModel[380].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F); // Box 81
		bodyModel[380].setRotationPoint(4F, 3F, -8F);

		bodyModel[381].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F); // Box 82
		bodyModel[381].setRotationPoint(1F, 3F, -8F);

		bodyModel[382].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 83
		bodyModel[382].setRotationPoint(-2F, 3F, -8F);

		bodyModel[383].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 84
		bodyModel[383].setRotationPoint(-2F, 4F, -8F);

		bodyModel[384].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 85
		bodyModel[384].setRotationPoint(-3F, 4F, -8F);

		bodyModel[385].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 86
		bodyModel[385].setRotationPoint(8F, 4F, -8F);

		bodyModel[386].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 87
		bodyModel[386].setRotationPoint(11F, 4F, -8F);

		bodyModel[387].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 88
		bodyModel[387].setRotationPoint(8F, 3F, -8F);

		bodyModel[388].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 89
		bodyModel[388].setRotationPoint(8F, 8F, -8F);

		bodyModel[389].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 90
		bodyModel[389].setRotationPoint(8F, 6F, -9.5F);

		bodyModel[390].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 92
		bodyModel[390].setRotationPoint(8F, 5F, -8.5F);

		bodyModel[391].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 94
		bodyModel[391].setRotationPoint(-1F, 5F, -8.5F);

		bodyModel[392].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 96
		bodyModel[392].setRotationPoint(1F, 4F, -8.5F);

		bodyModel[393].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 97
		bodyModel[393].setRotationPoint(-1F, 8F, -8F);

		bodyModel[394].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 98
		bodyModel[394].setRotationPoint(-1F, 6F, -9.5F);

		bodyModel[395].addShapeBox(0F, 0F, 0F, 15, 0, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 99
		bodyModel[395].setRotationPoint(-3F, 9F, -8F);

		bodyModel[396].addShapeBox(0F, 0F, 0F, 0, 5, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 100
		bodyModel[396].setRotationPoint(-3F, 4F, -8F);

		bodyModel[397].addShapeBox(0F, 0F, 0F, 0, 5, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 101
		bodyModel[397].setRotationPoint(12F, 4F, -8F);

		bodyModel[398].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0.1F, -0.5F, 0F, -0.4F, -0.5F, 0F, -0.4F, -0.5F, 0F, 0.1F, -0.5F, 0F, -0.05F, 0F, 0F, -0.55F, 0F, 0F, -0.55F, 0F, 0F, -0.05F, 0F, 0F); // Box 102
		bodyModel[398].setRotationPoint(2.25F, 5F, -8F);

		bodyModel[399].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -2.5F, -0.25F, -0.25F, -2.5F, -0.25F, -0.25F, -2.5F, -0.25F, -0.25F, -2.5F, -0.25F); // Box 103
		bodyModel[399].setRotationPoint(3.25F, 7F, -8F);

		bodyModel[400].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -2.5F, -0.25F, -0.25F, -2.5F, -0.25F, -0.25F, -2.5F, -0.25F, -0.25F, -2.5F, -0.25F); // Box 104
		bodyModel[400].setRotationPoint(4.75F, 7F, -8F);

		bodyModel[401].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 105
		bodyModel[401].setRotationPoint(1F, 4F, -8F);

		bodyModel[402].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 106
		bodyModel[402].setRotationPoint(7F, 4F, -8F);

		bodyModel[403].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 107
		bodyModel[403].setRotationPoint(2F, 5F, -8F);

		bodyModel[404].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 108
		bodyModel[404].setRotationPoint(-1F, 4F, -8.5F);

		bodyModel[405].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 109
		bodyModel[405].setRotationPoint(8F, 4F, -8.5F);

		bodyModel[406].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 110
		bodyModel[406].setRotationPoint(10F, 4F, -8.5F);

		bodyModel[407].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 111
		bodyModel[407].setRotationPoint(8F, 4F, 7.5F);

		bodyModel[408].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 112
		bodyModel[408].setRotationPoint(10F, 4F, 7.5F);

		bodyModel[409].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 113
		bodyModel[409].setRotationPoint(-1F, 4F, 7.5F);

		bodyModel[410].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 114
		bodyModel[410].setRotationPoint(1F, 4F, 7.5F);

		bodyModel[411].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 115
		bodyModel[411].setRotationPoint(-1F, 6F, 8.5F);

		bodyModel[412].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 116
		bodyModel[412].setRotationPoint(8F, 6F, 8.5F);

		bodyModel[413].addShapeBox(0F, -0.5F, -0.5F, 15, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 117 rod
		bodyModel[413].setRotationPoint(-3F, 7F, 8.5F);
		bodyModel[413].rotateAngleX = 0.78539816F;

		bodyModel[414].addShapeBox(0F, -2F, -2F, 0, 4, 4, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 118 rod gear
		bodyModel[414].setRotationPoint(-1.5F, 7F, 8.5F);

		bodyModel[415].addShapeBox(0F, 0F, 0F, 1, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 119
		bodyModel[415].setRotationPoint(-2F, 5F, 7.5F);

		bodyModel[416].addShapeBox(0F, 0F, 0F, 1, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 120
		bodyModel[416].setRotationPoint(-2F, 6F, 10.5F);

		bodyModel[417].addShapeBox(0F, 0F, 0F, 1, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 121
		bodyModel[417].setRotationPoint(-2F, 9F, 7.5F);

		bodyModel[418].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 122
		bodyModel[418].setRotationPoint(-2F, 5F, 9.5F);

		bodyModel[419].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 123
		bodyModel[419].setRotationPoint(-2F, 8F, 9.5F);

		bodyModel[420].addShapeBox(0F, 0F, 0F, 1, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 125
		bodyModel[420].setRotationPoint(7F, 6F, 10.5F);

		bodyModel[421].addShapeBox(0F, 0F, 0F, 1, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 126
		bodyModel[421].setRotationPoint(7F, 5F, 7.5F);

		bodyModel[422].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 127
		bodyModel[422].setRotationPoint(7F, 5F, 9.5F);

		bodyModel[423].addShapeBox(0F, 0F, 0F, 1, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[423].setRotationPoint(7F, 9F, 7.5F);

		bodyModel[424].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 129
		bodyModel[424].setRotationPoint(7F, 8F, 9.5F);

		bodyModel[425].addShapeBox(0F, -2F, -2F, 0, 4, 4, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 130 rod gear
		bodyModel[425].setRotationPoint(7.5F, 7F, 8.5F);

		bodyModel[426].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 93
		bodyModel[426].setRotationPoint(-3F, 3F, -7F);

		bodyModel[427].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 94
		bodyModel[427].setRotationPoint(-3F, 3F, 5F);

		bodyModel[428].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 95
		bodyModel[428].setRotationPoint(-3F, 5F, -4F);

		bodyModel[429].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F); // Box 96
		bodyModel[429].setRotationPoint(-3F, 4F, -5F);

		bodyModel[430].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -1F, 0F, 0.5F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 97
		bodyModel[430].setRotationPoint(-3F, 4F, 4F);

		bodyModel[431].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 98
		bodyModel[431].setRotationPoint(11F, 5F, -4F);

		bodyModel[432].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 99
		bodyModel[432].setRotationPoint(11F, 3F, -7F);

		bodyModel[433].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F); // Box 100
		bodyModel[433].setRotationPoint(11F, 4F, -5F);

		bodyModel[434].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 101
		bodyModel[434].setRotationPoint(11F, 4F, 4F);

		bodyModel[435].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 102
		bodyModel[435].setRotationPoint(11F, 3F, 5F);

		bodyModel[436].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 30 wheel
		bodyModel[436].setRotationPoint(-26F, 7F, 6F);

		bodyModel[437].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 46 wheel
		bodyModel[437].setRotationPoint(-35F, 7F, 6F);

		bodyModel[438].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 47 wheel
		bodyModel[438].setRotationPoint(-35F, 7F, -6F);

		bodyModel[439].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 48 wheel
		bodyModel[439].setRotationPoint(-26F, 7F, -6F);

		bodyModel[440].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1.5F, -0.5F, 0F, 1F, -0.5F, 0F, 1F, -0.5F, 0F, -1.5F, -0.5F, 0F); // Box 11
		bodyModel[440].setRotationPoint(-34F, 5F, -8F);

		bodyModel[441].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 1F, -0.5F, 0F, -1.5F, -0.5F, 0F, -1.5F, -0.5F, 0F, 1F, -0.5F, 0F); // Box 12
		bodyModel[441].setRotationPoint(-28F, 5F, -8F);

		bodyModel[442].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 13
		bodyModel[442].setRotationPoint(-32.5F, 8F, -8F);

		bodyModel[443].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0.1F, -0.5F, 0F, 0.1F, -0.5F, 0F, 0.1F, -0.5F, 0F, 0.1F, -0.5F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F); // Box 18
		bodyModel[443].setRotationPoint(-32.5F, 6F, -8F);

		bodyModel[444].addBox(0F, 0F, 0F, 2, 2, 17, 0F); // Box 4
		bodyModel[444].setRotationPoint(-36F, 6F, -8.5F);

		bodyModel[445].addBox(0F, 0F, 0F, 2, 2, 17, 0F); // Box 24
		bodyModel[445].setRotationPoint(-27F, 6F, -8.5F);

		bodyModel[446].addShapeBox(0F, 0F, 0F, 3, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		bodyModel[446].setRotationPoint(-32F, 3.5F, -7F);

		bodyModel[447].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F); // Box 35
		bodyModel[447].setRotationPoint(-31F, 3F, 7F);

		bodyModel[448].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F); // Box 36
		bodyModel[448].setRotationPoint(-34F, 3F, 7F);

		bodyModel[449].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 37
		bodyModel[449].setRotationPoint(-37F, 3F, 7F);

		bodyModel[450].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[450].setRotationPoint(-37F, 4F, 7F);

		bodyModel[451].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1.5F, -0.5F, 0F, 1F, -0.5F, 0F, 1F, -0.5F, 0F, -1.5F, -0.5F, 0F); // Box 39
		bodyModel[451].setRotationPoint(-34F, 5F, 7F);

		bodyModel[452].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 1F, -0.5F, 0F, -1.5F, -0.5F, 0F, -1.5F, -0.5F, 0F, 1F, -0.5F, 0F); // Box 40
		bodyModel[452].setRotationPoint(-28F, 5F, 7F);

		bodyModel[453].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[453].setRotationPoint(-27F, 4F, 7F);

		bodyModel[454].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 42
		bodyModel[454].setRotationPoint(-27F, 3F, 7F);

		bodyModel[455].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 43
		bodyModel[455].setRotationPoint(-32.5F, 8F, 7F);

		bodyModel[456].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -2.5F, -0.25F, -0.25F, -2.5F, -0.25F, -0.25F, -2.5F, -0.25F, -0.25F, -2.5F, -0.25F); // Box 44
		bodyModel[456].setRotationPoint(-30.25F, 7F, 7F);

		bodyModel[457].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -2.5F, -0.25F, -0.25F, -2.5F, -0.25F, -0.25F, -2.5F, -0.25F, -0.25F, -2.5F, -0.25F); // Box 45
		bodyModel[457].setRotationPoint(-31.75F, 7F, 7F);

		bodyModel[458].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0.1F, -0.5F, 0F, 0.1F, -0.5F, 0F, 0.1F, -0.5F, 0F, 0.1F, -0.5F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F); // Box 46
		bodyModel[458].setRotationPoint(-32.5F, 6F, 7F);

		bodyModel[459].addShapeBox(0F, 0F, 0F, 15, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 47
		bodyModel[459].setRotationPoint(-38F, 9F, 7F);

		bodyModel[460].addShapeBox(0F, 0F, 0F, 0, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 48
		bodyModel[460].setRotationPoint(-38F, 4F, 7F);

		bodyModel[461].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 53
		bodyModel[461].setRotationPoint(-27F, 5F, 7F);

		bodyModel[462].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 54
		bodyModel[462].setRotationPoint(-27F, 8F, 7F);

		bodyModel[463].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 57
		bodyModel[463].setRotationPoint(-33F, 5F, 7F);

		bodyModel[464].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 58
		bodyModel[464].setRotationPoint(-31F, 3F, 7F);

		bodyModel[465].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 59
		bodyModel[465].setRotationPoint(-34F, 3F, 7F);

		bodyModel[466].addBox(0F, 0F, 0F, 3, 1, 3, 0F); // Box 60
		bodyModel[466].setRotationPoint(-32F, 2.5F, -1.6F);

		bodyModel[467].addBox(-2.5F, -2.5F, 0F, 5, 5, 0, 0F); // Box 154 wheel gear
		bodyModel[467].setRotationPoint(-35F, 7F, 6.75F);

		bodyModel[468].addBox(-2.5F, -2.5F, 0F, 5, 5, 0, 0F); // Box 62 wheel gear
		bodyModel[468].setRotationPoint(-26F, 7F, 6.75F);

		bodyModel[469].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 63
		bodyModel[469].setRotationPoint(-24F, 4F, 7F);

		bodyModel[470].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 64
		bodyModel[470].setRotationPoint(-28F, 4F, 7F);

		bodyModel[471].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 65
		bodyModel[471].setRotationPoint(-34F, 4F, 7F);

		bodyModel[472].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 116
		bodyModel[472].setRotationPoint(-27F, 6F, 9.5F);

		bodyModel[473].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 69
		bodyModel[473].setRotationPoint(-36F, 6F, 9.5F);

		bodyModel[474].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 70
		bodyModel[474].setRotationPoint(-36F, 5F, 7F);

		bodyModel[475].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 73
		bodyModel[475].setRotationPoint(-36F, 8F, 7F);

		bodyModel[476].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 74
		bodyModel[476].setRotationPoint(-34F, 4F, 7F);

		bodyModel[477].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0.1F, -0.5F, 0F, -0.4F, -0.5F, 0F, -0.4F, -0.5F, 0F, 0.1F, -0.5F, 0F, -0.05F, 0F, 0F, -0.55F, 0F, 0F, -0.55F, 0F, 0F, -0.05F, 0F, 0F); // Box 75
		bodyModel[477].setRotationPoint(-32.75F, 5F, 7F);

		bodyModel[478].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 76
		bodyModel[478].setRotationPoint(-38F, 4F, 7F);

		bodyModel[479].addShapeBox(0F, 0F, 0F, 0, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 77
		bodyModel[479].setRotationPoint(-23F, 4F, 7F);

		bodyModel[480].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 78
		bodyModel[480].setRotationPoint(-34F, 4F, -8F);

		bodyModel[481].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -1F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 79
		bodyModel[481].setRotationPoint(-34F, 3F, -8F);

		bodyModel[482].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.5F, -0.5F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 80
		bodyModel[482].setRotationPoint(-31F, 3F, -8F);

		bodyModel[483].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F); // Box 81
		bodyModel[483].setRotationPoint(-31F, 3F, -8F);

		bodyModel[484].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F); // Box 82
		bodyModel[484].setRotationPoint(-34F, 3F, -8F);

		bodyModel[485].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 83
		bodyModel[485].setRotationPoint(-37F, 3F, -8F);

		bodyModel[486].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 84
		bodyModel[486].setRotationPoint(-37F, 4F, -8F);

		bodyModel[487].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 85
		bodyModel[487].setRotationPoint(-38F, 4F, -8F);

		bodyModel[488].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 86
		bodyModel[488].setRotationPoint(-27F, 4F, -8F);

		bodyModel[489].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 87
		bodyModel[489].setRotationPoint(-24F, 4F, -8F);

		bodyModel[490].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 88
		bodyModel[490].setRotationPoint(-27F, 3F, -8F);

		bodyModel[491].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 89
		bodyModel[491].setRotationPoint(-27F, 8F, -8F);

		bodyModel[492].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 90
		bodyModel[492].setRotationPoint(-27F, 6F, -9.5F);

		bodyModel[493].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 92
		bodyModel[493].setRotationPoint(-27F, 5F, -8.5F);

		bodyModel[494].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 94
		bodyModel[494].setRotationPoint(-36F, 5F, -8.5F);

		bodyModel[495].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 96
		bodyModel[495].setRotationPoint(-34F, 4F, -8.5F);

		bodyModel[496].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 97
		bodyModel[496].setRotationPoint(-36F, 8F, -8F);

		bodyModel[497].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 98
		bodyModel[497].setRotationPoint(-36F, 6F, -9.5F);

		bodyModel[498].addShapeBox(0F, 0F, 0F, 15, 0, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 99
		bodyModel[498].setRotationPoint(-38F, 9F, -8F);

		bodyModel[499].addShapeBox(0F, 0F, 0F, 0, 5, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 100
		bodyModel[499].setRotationPoint(-38F, 4F, -8F);
	}

	private void initbodyModel_2()
	{
		bodyModel[500] = new ModelRendererTurbo(this, 12, 7, textureX, textureY); // Box 101
		bodyModel[501] = new ModelRendererTurbo(this, 1, 26, textureX, textureY); // Box 102
		bodyModel[502] = new ModelRendererTurbo(this, 14, 1, textureX, textureY); // Box 103
		bodyModel[503] = new ModelRendererTurbo(this, 14, 1, textureX, textureY); // Box 104
		bodyModel[504] = new ModelRendererTurbo(this, 14, 35, textureX, textureY); // Box 105
		bodyModel[505] = new ModelRendererTurbo(this, 14, 35, textureX, textureY); // Box 106
		bodyModel[506] = new ModelRendererTurbo(this, 1, 35, textureX, textureY); // Box 107
		bodyModel[507] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 108
		bodyModel[508] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 109
		bodyModel[509] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 110
		bodyModel[510] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 111
		bodyModel[511] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 112
		bodyModel[512] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 113
		bodyModel[513] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 114
		bodyModel[514] = new ModelRendererTurbo(this, 41, 6, textureX, textureY); // Box 115
		bodyModel[515] = new ModelRendererTurbo(this, 41, 6, textureX, textureY); // Box 116
		bodyModel[516] = new ModelRendererTurbo(this, 2, 53, textureX, textureY); // Box 117 rod
		bodyModel[517] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 118 rod gear
		bodyModel[518] = new ModelRendererTurbo(this, 43, 41, textureX, textureY); // Box 119
		bodyModel[519] = new ModelRendererTurbo(this, 42, 41, textureX, textureY); // Box 120
		bodyModel[520] = new ModelRendererTurbo(this, 43, 41, textureX, textureY); // Box 121
		bodyModel[521] = new ModelRendererTurbo(this, 42, 39, textureX, textureY); // Box 122
		bodyModel[522] = new ModelRendererTurbo(this, 42, 39, textureX, textureY); // Box 123
		bodyModel[523] = new ModelRendererTurbo(this, 42, 41, textureX, textureY); // Box 125
		bodyModel[524] = new ModelRendererTurbo(this, 43, 41, textureX, textureY); // Box 126
		bodyModel[525] = new ModelRendererTurbo(this, 42, 39, textureX, textureY); // Box 127
		bodyModel[526] = new ModelRendererTurbo(this, 43, 41, textureX, textureY); // Box 128
		bodyModel[527] = new ModelRendererTurbo(this, 42, 39, textureX, textureY); // Box 129
		bodyModel[528] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 130 rod gear
		bodyModel[529] = new ModelRendererTurbo(this, 34, 21, textureX, textureY); // Box 93
		bodyModel[530] = new ModelRendererTurbo(this, 34, 21, textureX, textureY); // Box 94
		bodyModel[531] = new ModelRendererTurbo(this, 33, 22, textureX, textureY); // Box 95
		bodyModel[532] = new ModelRendererTurbo(this, 35, 25, textureX, textureY); // Box 96
		bodyModel[533] = new ModelRendererTurbo(this, 35, 25, textureX, textureY); // Box 97
		bodyModel[534] = new ModelRendererTurbo(this, 33, 22, textureX, textureY); // Box 98
		bodyModel[535] = new ModelRendererTurbo(this, 34, 21, textureX, textureY); // Box 99
		bodyModel[536] = new ModelRendererTurbo(this, 35, 25, textureX, textureY); // Box 100
		bodyModel[537] = new ModelRendererTurbo(this, 35, 25, textureX, textureY); // Box 101
		bodyModel[538] = new ModelRendererTurbo(this, 34, 21, textureX, textureY); // Box 102

		bodyModel[500].addShapeBox(0F, 0F, 0F, 0, 5, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 101
		bodyModel[500].setRotationPoint(-23F, 4F, -8F);

		bodyModel[501].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0.1F, -0.5F, 0F, -0.4F, -0.5F, 0F, -0.4F, -0.5F, 0F, 0.1F, -0.5F, 0F, -0.05F, 0F, 0F, -0.55F, 0F, 0F, -0.55F, 0F, 0F, -0.05F, 0F, 0F); // Box 102
		bodyModel[501].setRotationPoint(-32.75F, 5F, -8F);

		bodyModel[502].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -2.5F, -0.25F, -0.25F, -2.5F, -0.25F, -0.25F, -2.5F, -0.25F, -0.25F, -2.5F, -0.25F); // Box 103
		bodyModel[502].setRotationPoint(-31.75F, 7F, -8F);

		bodyModel[503].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -2.5F, -0.25F, -0.25F, -2.5F, -0.25F, -0.25F, -2.5F, -0.25F, -0.25F, -2.5F, -0.25F); // Box 104
		bodyModel[503].setRotationPoint(-30.25F, 7F, -8F);

		bodyModel[504].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 105
		bodyModel[504].setRotationPoint(-34F, 4F, -8F);

		bodyModel[505].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 106
		bodyModel[505].setRotationPoint(-28F, 4F, -8F);

		bodyModel[506].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 107
		bodyModel[506].setRotationPoint(-33F, 5F, -8F);

		bodyModel[507].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 108
		bodyModel[507].setRotationPoint(-36F, 4F, -8.5F);

		bodyModel[508].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 109
		bodyModel[508].setRotationPoint(-27F, 4F, -8.5F);

		bodyModel[509].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 110
		bodyModel[509].setRotationPoint(-25F, 4F, -8.5F);

		bodyModel[510].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 111
		bodyModel[510].setRotationPoint(-27F, 4F, 7.5F);

		bodyModel[511].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 112
		bodyModel[511].setRotationPoint(-25F, 4F, 7.5F);

		bodyModel[512].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 113
		bodyModel[512].setRotationPoint(-36F, 4F, 7.5F);

		bodyModel[513].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 114
		bodyModel[513].setRotationPoint(-34F, 4F, 7.5F);

		bodyModel[514].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 115
		bodyModel[514].setRotationPoint(-36F, 6F, 8.5F);

		bodyModel[515].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 116
		bodyModel[515].setRotationPoint(-27F, 6F, 8.5F);

		bodyModel[516].addShapeBox(0F, -0.5F, -0.5F, 15, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 117 rod
		bodyModel[516].setRotationPoint(-37F, 7F, 8.5F);
		bodyModel[516].rotateAngleX = 0.78539816F;

		bodyModel[517].addShapeBox(0F, -2F, -2F, 0, 4, 4, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 118 rod gear
		bodyModel[517].setRotationPoint(-36.5F, 7F, 8.5F);

		bodyModel[518].addShapeBox(0F, 0F, 0F, 1, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 119
		bodyModel[518].setRotationPoint(-37F, 5F, 7.5F);

		bodyModel[519].addShapeBox(0F, 0F, 0F, 1, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 120
		bodyModel[519].setRotationPoint(-37F, 6F, 10.5F);

		bodyModel[520].addShapeBox(0F, 0F, 0F, 1, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 121
		bodyModel[520].setRotationPoint(-37F, 9F, 7.5F);

		bodyModel[521].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 122
		bodyModel[521].setRotationPoint(-37F, 5F, 9.5F);

		bodyModel[522].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 123
		bodyModel[522].setRotationPoint(-37F, 8F, 9.5F);

		bodyModel[523].addShapeBox(0F, 0F, 0F, 1, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 125
		bodyModel[523].setRotationPoint(-28F, 6F, 10.5F);

		bodyModel[524].addShapeBox(0F, 0F, 0F, 1, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 126
		bodyModel[524].setRotationPoint(-28F, 5F, 7.5F);

		bodyModel[525].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 127
		bodyModel[525].setRotationPoint(-28F, 5F, 9.5F);

		bodyModel[526].addShapeBox(0F, 0F, 0F, 1, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[526].setRotationPoint(-28F, 9F, 7.5F);

		bodyModel[527].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 129
		bodyModel[527].setRotationPoint(-28F, 8F, 9.5F);

		bodyModel[528].addShapeBox(0F, -2F, -2F, 0, 4, 4, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 130 rod gear
		bodyModel[528].setRotationPoint(-27.5F, 7F, 8.5F);

		bodyModel[529].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 93
		bodyModel[529].setRotationPoint(-38F, 3F, -7F);

		bodyModel[530].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 94
		bodyModel[530].setRotationPoint(-38F, 3F, 5F);

		bodyModel[531].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 95
		bodyModel[531].setRotationPoint(-38F, 5F, -4F);

		bodyModel[532].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F); // Box 96
		bodyModel[532].setRotationPoint(-38F, 4F, -5F);

		bodyModel[533].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -1F, 0F, 0.5F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 97
		bodyModel[533].setRotationPoint(-38F, 4F, 4F);

		bodyModel[534].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 98
		bodyModel[534].setRotationPoint(-24F, 5F, -4F);

		bodyModel[535].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 99
		bodyModel[535].setRotationPoint(-24F, 3F, -7F);

		bodyModel[536].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F); // Box 100
		bodyModel[536].setRotationPoint(-24F, 4F, -5F);

		bodyModel[537].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 101
		bodyModel[537].setRotationPoint(-24F, 4F, 4F);

		bodyModel[538].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 102
		bodyModel[538].setRotationPoint(-24F, 3F, 5F);
	}
	public float[] getTrans() {
		return new float[]{0F, 0.15F, 0.00F};
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