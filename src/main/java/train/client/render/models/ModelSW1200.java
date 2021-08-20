//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2021 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 17.02.2021 - 19:32:16
// Last changed on: 17.02.2021 - 19:32:16

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

import java.util.ArrayList;

public class ModelSW1200 extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 256;

	public ModelSW1200() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[400];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 8, 180, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 16, 164, textureX, textureY); // Box 1
		bodyModel[2] = new ModelRendererTurbo(this, 1, 134, textureX, textureY); // Box 5
		bodyModel[3] = new ModelRendererTurbo(this, 163, 202, textureX, textureY); // Box 6
		bodyModel[4] = new ModelRendererTurbo(this, 243, 177, textureX, textureY); // Box 7
		bodyModel[5] = new ModelRendererTurbo(this, 237, 202, textureX, textureY); // Box 8
		bodyModel[6] = new ModelRendererTurbo(this, 188, 196, textureX, textureY); // Box 9
		bodyModel[7] = new ModelRendererTurbo(this, 262, 185, textureX, textureY); // Box 10
		bodyModel[8] = new ModelRendererTurbo(this, 295, 200, textureX, textureY); // Box 11
		bodyModel[9] = new ModelRendererTurbo(this, 243, 186, textureX, textureY); // Box 13
		bodyModel[10] = new ModelRendererTurbo(this, 247, 195, textureX, textureY); // Box 14
		bodyModel[11] = new ModelRendererTurbo(this, 247, 163, textureX, textureY); // Box 15
		bodyModel[12] = new ModelRendererTurbo(this, 243, 168, textureX, textureY); // Box 16
		bodyModel[13] = new ModelRendererTurbo(this, 139, 158, textureX, textureY); // Box 18
		bodyModel[14] = new ModelRendererTurbo(this, 76, 125, textureX, textureY); // Box 19
		bodyModel[15] = new ModelRendererTurbo(this, 1, 125, textureX, textureY); // Box 20
		bodyModel[16] = new ModelRendererTurbo(this, 53, 90, textureX, textureY); // Box 35
		bodyModel[17] = new ModelRendererTurbo(this, 53, 76, textureX, textureY); // Box 36
		bodyModel[18] = new ModelRendererTurbo(this, 50, 87, textureX, textureY); // Box 38
		bodyModel[19] = new ModelRendererTurbo(this, 50, 90, textureX, textureY); // Box 40
		bodyModel[20] = new ModelRendererTurbo(this, 50, 76, textureX, textureY); // Box 41
		bodyModel[21] = new ModelRendererTurbo(this, 50, 73, textureX, textureY); // Box 42
		bodyModel[22] = new ModelRendererTurbo(this, 17, 169, textureX, textureY); // Box 43
		bodyModel[23] = new ModelRendererTurbo(this, 474, 168, textureX, textureY); // Box 50
		bodyModel[24] = new ModelRendererTurbo(this, 194, 174, textureX, textureY); // Box 52
		bodyModel[25] = new ModelRendererTurbo(this, 194, 166, textureX, textureY); // Box 53
		bodyModel[26] = new ModelRendererTurbo(this, 124, 121, textureX, textureY); // Box 58
		bodyModel[27] = new ModelRendererTurbo(this, 124, 121, textureX, textureY); // Box 59
		bodyModel[28] = new ModelRendererTurbo(this, 69, 111, textureX, textureY); // Box 67
		bodyModel[29] = new ModelRendererTurbo(this, 72, 111, textureX, textureY); // Box 68
		bodyModel[30] = new ModelRendererTurbo(this, 220, 196, textureX, textureY); // Box 71
		bodyModel[31] = new ModelRendererTurbo(this, 205, 197, textureX, textureY); // Box 61
		bodyModel[32] = new ModelRendererTurbo(this, 307, 190, textureX, textureY); // Box 70
		bodyModel[33] = new ModelRendererTurbo(this, 310, 183, textureX, textureY); // Box 71
		bodyModel[34] = new ModelRendererTurbo(this, 342, 141, textureX, textureY); // Box 72
		bodyModel[35] = new ModelRendererTurbo(this, 337, 141, textureX, textureY); // Box 73
		bodyModel[36] = new ModelRendererTurbo(this, 319, 196, textureX, textureY, "lamp"); // Box 78 glow
		bodyModel[37] = new ModelRendererTurbo(this, 435, 183, textureX, textureY); // Box 83
		bodyModel[38] = new ModelRendererTurbo(this, 435, 193, textureX, textureY); // Box 84
		bodyModel[39] = new ModelRendererTurbo(this, 435, 188, textureX, textureY); // Box 85
		bodyModel[40] = new ModelRendererTurbo(this, 458, 200, textureX, textureY); // Box 89
		bodyModel[41] = new ModelRendererTurbo(this, 235, 196, textureX, textureY); // Box 102
		bodyModel[42] = new ModelRendererTurbo(this, 235, 196, textureX, textureY); // Box 104
		bodyModel[43] = new ModelRendererTurbo(this, 91, 136, textureX, textureY); // Box 107
		bodyModel[44] = new ModelRendererTurbo(this, 14, 204, textureX, textureY); // Box 108
		bodyModel[45] = new ModelRendererTurbo(this, 289, 165, textureX, textureY); // Box 114
		bodyModel[46] = new ModelRendererTurbo(this, 289, 162, textureX, textureY); // Box 74
		bodyModel[47] = new ModelRendererTurbo(this, 289, 168, textureX, textureY); // Box 78
		bodyModel[48] = new ModelRendererTurbo(this, 297, 169, textureX, textureY); // Box 113
		bodyModel[49] = new ModelRendererTurbo(this, 295, 167, textureX, textureY); // Box 114
		bodyModel[50] = new ModelRendererTurbo(this, 305, 167, textureX, textureY); // Box 115
		bodyModel[51] = new ModelRendererTurbo(this, 299, 163, textureX, textureY); // Box 116
		bodyModel[52] = new ModelRendererTurbo(this, 299, 175, textureX, textureY); // Box 117
		bodyModel[53] = new ModelRendererTurbo(this, 222, 177, textureX, textureY); // Box 126
		bodyModel[54] = new ModelRendererTurbo(this, 222, 168, textureX, textureY); // Box 127
		bodyModel[55] = new ModelRendererTurbo(this, 21, 118, textureX, textureY); // Box 129
		bodyModel[56] = new ModelRendererTurbo(this, 27, 118, textureX, textureY); // Box 130
		bodyModel[57] = new ModelRendererTurbo(this, 24, 118, textureX, textureY); // Box 131
		bodyModel[58] = new ModelRendererTurbo(this, 124, 121, textureX, textureY); // Box 134
		bodyModel[59] = new ModelRendererTurbo(this, 99, 104, textureX, textureY); // Box 135
		bodyModel[60] = new ModelRendererTurbo(this, 1, 169, textureX, textureY); // Box 138
		bodyModel[61] = new ModelRendererTurbo(this, 3, 118, textureX, textureY); // Box 139
		bodyModel[62] = new ModelRendererTurbo(this, 3, 122, textureX, textureY); // Box 140
		bodyModel[63] = new ModelRendererTurbo(this, 6, 118, textureX, textureY); // Box 141
		bodyModel[64] = new ModelRendererTurbo(this, 9, 118, textureX, textureY); // Box 142
		bodyModel[65] = new ModelRendererTurbo(this, 142, 204, textureX, textureY); // Box 144
		bodyModel[66] = new ModelRendererTurbo(this, 204, 169, textureX, textureY); // Box 2
		bodyModel[67] = new ModelRendererTurbo(this, 204, 161, textureX, textureY); // Box 146
		bodyModel[68] = new ModelRendererTurbo(this, 175, 141, textureX, textureY); // Box 147
		bodyModel[69] = new ModelRendererTurbo(this, 146, 154, textureX, textureY); // Box 148
		bodyModel[70] = new ModelRendererTurbo(this, 301, 199, textureX, textureY); // Box 315 door swing right
		bodyModel[71] = new ModelRendererTurbo(this, 405, 130, textureX, textureY); // Box 166
		bodyModel[72] = new ModelRendererTurbo(this, 446, 147, textureX, textureY); // Box 167
		bodyModel[73] = new ModelRendererTurbo(this, 446, 149, textureX, textureY); // Box 168
		bodyModel[74] = new ModelRendererTurbo(this, 402, 149, textureX, textureY); // Box 169
		bodyModel[75] = new ModelRendererTurbo(this, 402, 147, textureX, textureY); // Box 170
		bodyModel[76] = new ModelRendererTurbo(this, 168, 143, textureX, textureY, "lamp"); // Box 171 lamp headlight front double
		bodyModel[77] = new ModelRendererTurbo(this, 168, 143, textureX, textureY, "lamp"); // Box 172 lamp headlight front double
		bodyModel[78] = new ModelRendererTurbo(this, 146, 154, textureX, textureY); // Box 173
		bodyModel[79] = new ModelRendererTurbo(this, 403, 143, textureX, textureY); // Box 174
		bodyModel[80] = new ModelRendererTurbo(this, 460, 130, textureX, textureY); // Box 176
		bodyModel[81] = new ModelRendererTurbo(this, 458, 143, textureX, textureY); // Box 177
		bodyModel[82] = new ModelRendererTurbo(this, 482, 168, textureX, textureY); // Box 179
		bodyModel[83] = new ModelRendererTurbo(this, 457, 149, textureX, textureY); // Box 180
		bodyModel[84] = new ModelRendererTurbo(this, 501, 147, textureX, textureY); // Box 181
		bodyModel[85] = new ModelRendererTurbo(this, 501, 149, textureX, textureY); // Box 182
		bodyModel[86] = new ModelRendererTurbo(this, 457, 147, textureX, textureY); // Box 183
		bodyModel[87] = new ModelRendererTurbo(this, 118, 164, textureX, textureY); // Box 184
		bodyModel[88] = new ModelRendererTurbo(this, 65, 104, textureX, textureY); // Box 131
		bodyModel[89] = new ModelRendererTurbo(this, 72, 104, textureX, textureY); // Box 187
		bodyModel[90] = new ModelRendererTurbo(this, 40, 104, textureX, textureY); // Box 188
		bodyModel[91] = new ModelRendererTurbo(this, 47, 104, textureX, textureY); // Box 190
		bodyModel[92] = new ModelRendererTurbo(this, 183, 154, textureX, textureY); // Box 196
		bodyModel[93] = new ModelRendererTurbo(this, 197, 143, textureX, textureY, "lamp"); // Box 197 lamp headlight rear double
		bodyModel[94] = new ModelRendererTurbo(this, 204, 141, textureX, textureY); // Box 198
		bodyModel[95] = new ModelRendererTurbo(this, 183, 154, textureX, textureY); // Box 199
		bodyModel[96] = new ModelRendererTurbo(this, 197, 143, textureX, textureY, "lamp"); // Box 200 lamp headlight rear double
		bodyModel[97] = new ModelRendererTurbo(this, 337, 144, textureX, textureY); // Box 164
		bodyModel[98] = new ModelRendererTurbo(this, 342, 144, textureX, textureY); // Box 165
		bodyModel[99] = new ModelRendererTurbo(this, 348, 144, textureX, textureY); // Box 166
		bodyModel[100] = new ModelRendererTurbo(this, 147, 152, textureX, textureY, "lamp"); // Box 167 liveryimg 2 glow
		bodyModel[101] = new ModelRendererTurbo(this, 147, 152, textureX, textureY, "lamp"); // Box 168 liveryimg 2 glow
		bodyModel[102] = new ModelRendererTurbo(this, 157, 141, textureX, textureY, "lamp"); // Box 169 lamp headlight front big
		bodyModel[103] = new ModelRendererTurbo(this, 186, 141, textureX, textureY, "lamp"); // Box 170 lamp headlight rear big
		bodyModel[104] = new ModelRendererTurbo(this, 137, 153, textureX, textureY, "lamp"); // Box 162 glow commander beacon
		bodyModel[105] = new ModelRendererTurbo(this, 136, 157, textureX, textureY); // Box 165
		bodyModel[106] = new ModelRendererTurbo(this, 205, 153, textureX, textureY, "lamp"); // Box 185 glow commander beacon
		bodyModel[107] = new ModelRendererTurbo(this, 204, 157, textureX, textureY); // Box 186
		bodyModel[108] = new ModelRendererTurbo(this, 184, 152, textureX, textureY, "lamp"); // Box 179 liveryimg 2 glow
		bodyModel[109] = new ModelRendererTurbo(this, 184, 152, textureX, textureY, "lamp"); // Box 180 liveryimg 2 glow
		bodyModel[110] = new ModelRendererTurbo(this, 355, 142, textureX, textureY); // Box 183
		bodyModel[111] = new ModelRendererTurbo(this, 355, 144, textureX, textureY); // Box 184
		bodyModel[112] = new ModelRendererTurbo(this, 422, 167, textureX, textureY); // Box 186
		bodyModel[113] = new ModelRendererTurbo(this, 427, 167, textureX, textureY); // Box 187
		bodyModel[114] = new ModelRendererTurbo(this, 482, 167, textureX, textureY); // Box 188
		bodyModel[115] = new ModelRendererTurbo(this, 477, 167, textureX, textureY); // Box 189
		bodyModel[116] = new ModelRendererTurbo(this, 324, 138, textureX, textureY); // Box 195
		bodyModel[117] = new ModelRendererTurbo(this, 324, 141, textureX, textureY); // Box 196
		bodyModel[118] = new ModelRendererTurbo(this, 324, 135, textureX, textureY); // Box 197
		bodyModel[119] = new ModelRendererTurbo(this, 415, 198, textureX, textureY); // Box 202
		bodyModel[120] = new ModelRendererTurbo(this, 376, 198, textureX, textureY); // Box 203
		bodyModel[121] = new ModelRendererTurbo(this, 126, 119, textureX, textureY); // Box 212
		bodyModel[122] = new ModelRendererTurbo(this, 126, 119, textureX, textureY); // Box 213
		bodyModel[123] = new ModelRendererTurbo(this, 126, 119, textureX, textureY); // Box 214
		bodyModel[124] = new ModelRendererTurbo(this, 134, 121, textureX, textureY); // Box 218
		bodyModel[125] = new ModelRendererTurbo(this, 134, 121, textureX, textureY); // Box 219
		bodyModel[126] = new ModelRendererTurbo(this, 134, 121, textureX, textureY); // Box 220
		bodyModel[127] = new ModelRendererTurbo(this, 136, 119, textureX, textureY); // Box 221
		bodyModel[128] = new ModelRendererTurbo(this, 136, 119, textureX, textureY); // Box 222
		bodyModel[129] = new ModelRendererTurbo(this, 136, 119, textureX, textureY); // Box 223
		bodyModel[130] = new ModelRendererTurbo(this, 16, 195, textureX, textureY); // Box 230
		bodyModel[131] = new ModelRendererTurbo(this, 75, 111, textureX, textureY); // Box 231
		bodyModel[132] = new ModelRendererTurbo(this, 66, 111, textureX, textureY); // Box 232
		bodyModel[133] = new ModelRendererTurbo(this, 395, 130, textureX, textureY); // Box 33
		bodyModel[134] = new ModelRendererTurbo(this, 382, 130, textureX, textureY); // Box 383
		bodyModel[135] = new ModelRendererTurbo(this, 195, 165, textureX, textureY); // Box 462
		bodyModel[136] = new ModelRendererTurbo(this, 195, 165, textureX, textureY); // Box 463
		bodyModel[137] = new ModelRendererTurbo(this, 139, 186, textureX, textureY); // Box 388
		bodyModel[138] = new ModelRendererTurbo(this, 139, 186, textureX, textureY); // Box 389
		bodyModel[139] = new ModelRendererTurbo(this, 38, 165, textureX, textureY); // Box 390
		bodyModel[140] = new ModelRendererTurbo(this, 38, 167, textureX, textureY); // Box 391
		bodyModel[141] = new ModelRendererTurbo(this, 99, 165, textureX, textureY); // Box 392
		bodyModel[142] = new ModelRendererTurbo(this, 99, 167, textureX, textureY); // Box 393
		bodyModel[143] = new ModelRendererTurbo(this, 55, 87, textureX, textureY); // Box 394
		bodyModel[144] = new ModelRendererTurbo(this, 55, 73, textureX, textureY); // Box 395
		bodyModel[145] = new ModelRendererTurbo(this, 121, 135, textureX, textureY); // Box 396
		bodyModel[146] = new ModelRendererTurbo(this, 76, 135, textureX, textureY); // Box 397
		bodyModel[147] = new ModelRendererTurbo(this, 6, 109, textureX, textureY); // Box 398
		bodyModel[148] = new ModelRendererTurbo(this, 6, 102, textureX, textureY); // Box 399
		bodyModel[149] = new ModelRendererTurbo(this, 29, 102, textureX, textureY); // Box 400
		bodyModel[150] = new ModelRendererTurbo(this, 29, 109, textureX, textureY); // Box 401
		bodyModel[151] = new ModelRendererTurbo(this, 212, 160, textureX, textureY); // Box 364 prime base
		bodyModel[152] = new ModelRendererTurbo(this, 212, 156, textureX, textureY, "lamp"); // Box 6 PRIME1-1
		bodyModel[153] = new ModelRendererTurbo(this, 212, 156, textureX, textureY, "lamp"); // Box 7 PRIME1-3
		bodyModel[154] = new ModelRendererTurbo(this, 212, 156, textureX, textureY, "lamp"); // Box 8 PRIME1-2
		bodyModel[155] = new ModelRendererTurbo(this, 212, 156, textureX, textureY, "lamp"); // Box 9 PRIME1-4
		bodyModel[156] = new ModelRendererTurbo(this, 195, 161, textureX, textureY, "cull"); // Box 478 cull
		bodyModel[157] = new ModelRendererTurbo(this, 212, 152, textureX, textureY); // Box 364 prime base
		bodyModel[158] = new ModelRendererTurbo(this, 212, 148, textureX, textureY, "lamp"); // Box 6 PRIME2-1
		bodyModel[159] = new ModelRendererTurbo(this, 212, 148, textureX, textureY, "lamp"); // Box 7 PRIME2-3
		bodyModel[160] = new ModelRendererTurbo(this, 212, 148, textureX, textureY, "lamp"); // Box 8 PRIME2-2
		bodyModel[161] = new ModelRendererTurbo(this, 212, 148, textureX, textureY, "lamp"); // Box 9 PRIME2-4
		bodyModel[162] = new ModelRendererTurbo(this, 112, 104, textureX, textureY); // Box 489
		bodyModel[163] = new ModelRendererTurbo(this, 112, 111, textureX, textureY); // Box 490
		bodyModel[164] = new ModelRendererTurbo(this, 99, 111, textureX, textureY); // Box 491
		bodyModel[165] = new ModelRendererTurbo(this, 395, 111, textureX, textureY); // Box 310 nasa cap
		bodyModel[166] = new ModelRendererTurbo(this, 382, 111, textureX, textureY); // Box 311 nasa cap
		bodyModel[167] = new ModelRendererTurbo(this, 161, 148, textureX, textureY); // Box 78
		bodyModel[168] = new ModelRendererTurbo(this, 161, 148, textureX, textureY); // Box 188
		bodyModel[169] = new ModelRendererTurbo(this, 168, 148, textureX, textureY, "lamp"); // Box 189 lamp ditchlight front up
		bodyModel[170] = new ModelRendererTurbo(this, 168, 148, textureX, textureY, "lamp"); // Box 190 lamp ditchlight front up
		bodyModel[171] = new ModelRendererTurbo(this, 197, 148, textureX, textureY, "lamp"); // Box 182 lamp ditchlight rear up
		bodyModel[172] = new ModelRendererTurbo(this, 190, 148, textureX, textureY); // Box 183
		bodyModel[173] = new ModelRendererTurbo(this, 197, 148, textureX, textureY, "lamp"); // Box 186 lamp ditchlight rear up
		bodyModel[174] = new ModelRendererTurbo(this, 190, 148, textureX, textureY); // Box 187
		bodyModel[175] = new ModelRendererTurbo(this, 41, 121, textureX, textureY); // Box 122
		bodyModel[176] = new ModelRendererTurbo(this, 62, 121, textureX, textureY); // Box 123
		bodyModel[177] = new ModelRendererTurbo(this, 15, 109, textureX, textureY); // Box 504
		bodyModel[178] = new ModelRendererTurbo(this, 15, 102, textureX, textureY); // Box 505
		bodyModel[179] = new ModelRendererTurbo(this, 24, 102, textureX, textureY); // Box 506
		bodyModel[180] = new ModelRendererTurbo(this, 24, 109, textureX, textureY); // Box 507
		bodyModel[181] = new ModelRendererTurbo(this, 348, 182, textureX, textureY, "cull"); // Box 3 cull aww
		bodyModel[182] = new ModelRendererTurbo(this, 350, 177, textureX, textureY); // Box 5 aww
		bodyModel[183] = new ModelRendererTurbo(this, 337, 135, textureX, textureY); // Box 385
		bodyModel[184] = new ModelRendererTurbo(this, 337, 132, textureX, textureY); // Box 386
		bodyModel[185] = new ModelRendererTurbo(this, 337, 138, textureX, textureY); // Box 512
		bodyModel[186] = new ModelRendererTurbo(this, 480, 93, textureX, textureY, "cull"); // Box 419 cull
		bodyModel[187] = new ModelRendererTurbo(this, 467, 93, textureX, textureY, "cull"); // Box 420 cull
		bodyModel[188] = new ModelRendererTurbo(this, 395, 105, textureX, textureY); // Box 515
		bodyModel[189] = new ModelRendererTurbo(this, 394, 188, textureX, textureY); // Box 517
		bodyModel[190] = new ModelRendererTurbo(this, 394, 193, textureX, textureY); // Box 518
		bodyModel[191] = new ModelRendererTurbo(this, 394, 183, textureX, textureY); // Box 519
		bodyModel[192] = new ModelRendererTurbo(this, 438, 104, textureX, textureY); // Box 381
		bodyModel[193] = new ModelRendererTurbo(this, 460, 105, textureX, textureY); // Box 521
		bodyModel[194] = new ModelRendererTurbo(this, 460, 105, textureX, textureY); // Box 522
		bodyModel[195] = new ModelRendererTurbo(this, 460, 98, textureX, textureY); // Box 523
		bodyModel[196] = new ModelRendererTurbo(this, 460, 98, textureX, textureY); // Box 524
		bodyModel[197] = new ModelRendererTurbo(this, 438, 97, textureX, textureY); // Box 525
		bodyModel[198] = new ModelRendererTurbo(this, 382, 105, textureX, textureY); // Box 526
		bodyModel[199] = new ModelRendererTurbo(this, 322, 172, textureX, textureY); // Box 114
		bodyModel[200] = new ModelRendererTurbo(this, 322, 169, textureX, textureY); // Box 74
		bodyModel[201] = new ModelRendererTurbo(this, 322, 175, textureX, textureY); // Box 78
		bodyModel[202] = new ModelRendererTurbo(this, 309, 173, textureX, textureY); // Box 113
		bodyModel[203] = new ModelRendererTurbo(this, 316, 172, textureX, textureY); // Box 114
		bodyModel[204] = new ModelRendererTurbo(this, 308, 172, textureX, textureY); // Box 115
		bodyModel[205] = new ModelRendererTurbo(this, 311, 168, textureX, textureY); // Box 116
		bodyModel[206] = new ModelRendererTurbo(this, 311, 179, textureX, textureY); // Box 117
		bodyModel[207] = new ModelRendererTurbo(this, 393, 119, textureX, textureY); // Box 535
		bodyModel[208] = new ModelRendererTurbo(this, 393, 125, textureX, textureY); // Box 536
		bodyModel[209] = new ModelRendererTurbo(this, 393, 114, textureX, textureY); // Box 537
		bodyModel[210] = new ModelRendererTurbo(this, 380, 119, textureX, textureY); // Box 538
		bodyModel[211] = new ModelRendererTurbo(this, 380, 114, textureX, textureY); // Box 539
		bodyModel[212] = new ModelRendererTurbo(this, 380, 125, textureX, textureY); // Box 540
		bodyModel[213] = new ModelRendererTurbo(this, 468, 134, textureX, textureY); // Box 541
		bodyModel[214] = new ModelRendererTurbo(this, 461, 145, textureX, textureY); // Box 543
		bodyModel[215] = new ModelRendererTurbo(this, 493, 145, textureX, textureY); // Box 544
		bodyModel[216] = new ModelRendererTurbo(this, 504, 149, textureX, textureY); // Box 545
		bodyModel[217] = new ModelRendererTurbo(this, 449, 149, textureX, textureY); // Box 546
		bodyModel[218] = new ModelRendererTurbo(this, 283, 191, textureX, textureY); // Box 413
		bodyModel[219] = new ModelRendererTurbo(this, 283, 184, textureX, textureY); // Box 86
		bodyModel[220] = new ModelRendererTurbo(this, 157, 116, textureX, textureY); // Box 550
		bodyModel[221] = new ModelRendererTurbo(this, 168, 115, textureX, textureY, "lamp"); // Box 551 tall front headlight
		bodyModel[222] = new ModelRendererTurbo(this, 168, 115, textureX, textureY, "lamp"); // Box 552 tall front headlight
		bodyModel[223] = new ModelRendererTurbo(this, 153, 154, textureX, textureY); // Box 553
		bodyModel[224] = new ModelRendererTurbo(this, 154, 152, textureX, textureY); // Box 554
		bodyModel[225] = new ModelRendererTurbo(this, 153, 154, textureX, textureY); // Box 555
		bodyModel[226] = new ModelRendererTurbo(this, 154, 152, textureX, textureY); // Box 556
		bodyModel[227] = new ModelRendererTurbo(this, 147, 159, textureX, textureY); // Box 557
		bodyModel[228] = new ModelRendererTurbo(this, 319, 144, textureX, textureY); // Box 383
		bodyModel[229] = new ModelRendererTurbo(this, 315, 141, textureX, textureY); // Box 384
		bodyModel[230] = new ModelRendererTurbo(this, 317, 138, textureX, textureY); // Box 385
		bodyModel[231] = new ModelRendererTurbo(this, 317, 135, textureX, textureY); // Box 386
		bodyModel[232] = new ModelRendererTurbo(this, 328, 144, textureX, textureY); // Box 562
		bodyModel[233] = new ModelRendererTurbo(this, 274, 173, textureX, textureY); // Box 563 some ac thing idk
		bodyModel[234] = new ModelRendererTurbo(this, 308, 163, textureX, textureY); // Box 136
		bodyModel[235] = new ModelRendererTurbo(this, 308, 152, textureX, textureY); // Box 287
		bodyModel[236] = new ModelRendererTurbo(this, 308, 156, textureX, textureY); // Box 288
		bodyModel[237] = new ModelRendererTurbo(this, 310, 160, textureX, textureY); // Box 289
		bodyModel[238] = new ModelRendererTurbo(this, 408, 125, textureX, textureY); // Box 171
		bodyModel[239] = new ModelRendererTurbo(this, 415, 120, textureX, textureY); // Box 172
		bodyModel[240] = new ModelRendererTurbo(this, 415, 120, textureX, textureY); // Box 173
		bodyModel[241] = new ModelRendererTurbo(this, 407, 120, textureX, textureY); // Box 174
		bodyModel[242] = new ModelRendererTurbo(this, 408, 133, textureX, textureY); // Box 580
		bodyModel[243] = new ModelRendererTurbo(this, 418, 120, textureX, textureY); // Box 581
		bodyModel[244] = new ModelRendererTurbo(this, 418, 120, textureX, textureY); // Box 582
		bodyModel[245] = new ModelRendererTurbo(this, 418, 120, textureX, textureY); // Box 583
		bodyModel[246] = new ModelRendererTurbo(this, 401, 171, textureX, textureY); // Box 160
		bodyModel[247] = new ModelRendererTurbo(this, 408, 175, textureX, textureY); // Box 161
		bodyModel[248] = new ModelRendererTurbo(this, 419, 141, textureX, textureY); // Box 586
		bodyModel[249] = new ModelRendererTurbo(this, 255, 156, textureX, textureY); // Box 364
		bodyModel[250] = new ModelRendererTurbo(this, 244, 151, textureX, textureY); // Box 365
		bodyModel[251] = new ModelRendererTurbo(this, 244, 157, textureX, textureY); // Box 366
		bodyModel[252] = new ModelRendererTurbo(this, 408, 143, textureX, textureY); // Box 590
		bodyModel[253] = new ModelRendererTurbo(this, 432, 143, textureX, textureY); // Box 591
		bodyModel[254] = new ModelRendererTurbo(this, 468, 139, textureX, textureY); // Box 592
		bodyModel[255] = new ModelRendererTurbo(this, 482, 139, textureX, textureY); // Box 593
		bodyModel[256] = new ModelRendererTurbo(this, 463, 174, textureX, textureY); // Box 594
		bodyModel[257] = new ModelRendererTurbo(this, 456, 170, textureX, textureY); // Box 595
		bodyModel[258] = new ModelRendererTurbo(this, 377, 147, textureX, textureY, "cull"); // Box 456 cull
		bodyModel[259] = new ModelRendererTurbo(this, 432, 147, textureX, textureY, "cull"); // Box 457 cull
		bodyModel[260] = new ModelRendererTurbo(this, 358, 144, textureX, textureY); // Box 598
		bodyModel[261] = new ModelRendererTurbo(this, 161, 153, textureX, textureY); // Box 599
		bodyModel[262] = new ModelRendererTurbo(this, 161, 153, textureX, textureY); // Box 600
		bodyModel[263] = new ModelRendererTurbo(this, 168, 153, textureX, textureY, "lamp"); // Box 601 lamp ditchlight front down
		bodyModel[264] = new ModelRendererTurbo(this, 168, 153, textureX, textureY, "lamp"); // Box 602 lamp ditchlight front down
		bodyModel[265] = new ModelRendererTurbo(this, 190, 153, textureX, textureY); // Box 603
		bodyModel[266] = new ModelRendererTurbo(this, 197, 153, textureX, textureY, "lamp"); // Box 604 lamp ditchlight rear down
		bodyModel[267] = new ModelRendererTurbo(this, 190, 153, textureX, textureY); // Box 605
		bodyModel[268] = new ModelRendererTurbo(this, 197, 153, textureX, textureY, "lamp"); // Box 606 lamp ditchlight rear down
		bodyModel[269] = new ModelRendererTurbo(this, 157, 123, textureX, textureY); // Box 607
		bodyModel[270] = new ModelRendererTurbo(this, 175, 134, textureX, textureY, "lamp"); // Box 385 headlight f SP
		bodyModel[271] = new ModelRendererTurbo(this, 175, 134, textureX, textureY, "lamp"); // Box 386 headlight f SP
		bodyModel[272] = new ModelRendererTurbo(this, 179, 123, textureX, textureY, "lamp"); // Box 610 gyralight double front sp
		bodyModel[273] = new ModelRendererTurbo(this, 179, 123, textureX, textureY, "lamp"); // Box 611 gyralight double front sp
		bodyModel[274] = new ModelRendererTurbo(this, 168, 121, textureX, textureY); // Box 612
		bodyModel[275] = new ModelRendererTurbo(this, 168, 128, textureX, textureY); // Box 613
		bodyModel[276] = new ModelRendererTurbo(this, 177, 129, textureX, textureY, "lamp"); // Box 614 gyralight red front sp
		bodyModel[277] = new ModelRendererTurbo(this, 186, 123, textureX, textureY); // Box 615
		bodyModel[278] = new ModelRendererTurbo(this, 204, 134, textureX, textureY, "lamp"); // Box 616 headlight r sp
		bodyModel[279] = new ModelRendererTurbo(this, 204, 134, textureX, textureY, "lamp"); // Box 617 headlight r sp
		bodyModel[280] = new ModelRendererTurbo(this, 206, 129, textureX, textureY, "lamp"); // Box 618 gyralight red sp rear
		bodyModel[281] = new ModelRendererTurbo(this, 197, 128, textureX, textureY); // Box 619
		bodyModel[282] = new ModelRendererTurbo(this, 197, 121, textureX, textureY); // Box 620
		bodyModel[283] = new ModelRendererTurbo(this, 208, 123, textureX, textureY, "lamp"); // Box 621 gyralight double sp rear
		bodyModel[284] = new ModelRendererTurbo(this, 208, 123, textureX, textureY, "lamp"); // Box 622 gyralight double sp rear
		bodyModel[285] = new ModelRendererTurbo(this, 292, 142, textureX, textureY); // Box 623
		bodyModel[286] = new ModelRendererTurbo(this, 294, 150, textureX, textureY); // Box 624
		bodyModel[287] = new ModelRendererTurbo(this, 294, 147, textureX, textureY, "lamp"); // Box 625 sp numerbboard
		bodyModel[288] = new ModelRendererTurbo(this, 294, 134, textureX, textureY, "lamp"); // Box 626 sp numberboard
		bodyModel[289] = new ModelRendererTurbo(this, 292, 137, textureX, textureY); // Box 627
		bodyModel[290] = new ModelRendererTurbo(this, 294, 132, textureX, textureY); // Box 628
		bodyModel[291] = new ModelRendererTurbo(this, 318, 195, textureX, textureY); // Box 629 dynamic brake
		bodyModel[292] = new ModelRendererTurbo(this, 21, 122, textureX, textureY); // Box 630
		bodyModel[293] = new ModelRendererTurbo(this, 35, 122, textureX, textureY); // Box 631
		bodyModel[294] = new ModelRendererTurbo(this, 17, 122, textureX, textureY); // Box 632
		bodyModel[295] = new ModelRendererTurbo(this, 318, 179, textureX, textureY); // Box 633 dynamic brake
		bodyModel[296] = new ModelRendererTurbo(this, 327, 171, textureX, textureY); // Box 278 dynamic brake fan
		bodyModel[297] = new ModelRendererTurbo(this, 348, 200, textureX, textureY); // Box 635 dynamic brake bit
		bodyModel[298] = new ModelRendererTurbo(this, 348, 200, textureX, textureY); // Box 636 dynamic brake bit
		bodyModel[299] = new ModelRendererTurbo(this, 355, 200, textureX, textureY); // Box 637 dynamic brake bit
		bodyModel[300] = new ModelRendererTurbo(this, 355, 200, textureX, textureY); // Box 638 dynamic brake bit
		bodyModel[301] = new ModelRendererTurbo(this, 466, 120, textureX, textureY); // Box 639 torpedo tube
		bodyModel[302] = new ModelRendererTurbo(this, 466, 115, textureX, textureY); // Box 640 torpedo tube
		bodyModel[303] = new ModelRendererTurbo(this, 466, 125, textureX, textureY); // Box 641 torpedo tube
		bodyModel[304] = new ModelRendererTurbo(this, 466, 105, textureX, textureY); // Box 642 torpedo tube
		bodyModel[305] = new ModelRendererTurbo(this, 467, 100, textureX, textureY); // Box 643 torpedo tube
		bodyModel[306] = new ModelRendererTurbo(this, 466, 110, textureX, textureY); // Box 644 torpedo tube
		bodyModel[307] = new ModelRendererTurbo(this, 469, 186, textureX, textureY); // Box 645
		bodyModel[308] = new ModelRendererTurbo(this, 469, 193, textureX, textureY); // Box 646
		bodyModel[309] = new ModelRendererTurbo(this, 503, 130, textureX, textureY); // Box 647
		bodyModel[310] = new ModelRendererTurbo(this, 503, 130, textureX, textureY); // Box 648
		bodyModel[311] = new ModelRendererTurbo(this, 496, 130, textureX, textureY); // Box 649
		bodyModel[312] = new ModelRendererTurbo(this, 496, 130, textureX, textureY); // Box 650
		bodyModel[313] = new ModelRendererTurbo(this, 417, 107, textureX, textureY); // Box 651 yes this is a real bit
		bodyModel[314] = new ModelRendererTurbo(this, 430, 130, textureX, textureY); // Box 561 canfor bit
		bodyModel[315] = new ModelRendererTurbo(this, 466, 131, textureX, textureY); // Box 654 canfor bit
		bodyModel[316] = new ModelRendererTurbo(this, 432, 119, textureX, textureY); // Box 655 re engineered
		bodyModel[317] = new ModelRendererTurbo(this, 436, 111, textureX, textureY); // Box 656 re engineered
		bodyModel[318] = new ModelRendererTurbo(this, 365, 138, textureX, textureY); // Box 336
		bodyModel[319] = new ModelRendererTurbo(this, 365, 141, textureX, textureY); // Box 337
		bodyModel[320] = new ModelRendererTurbo(this, 365, 135, textureX, textureY); // Box 338
		bodyModel[321] = new ModelRendererTurbo(this, 365, 144, textureX, textureY); // Box 339
		bodyModel[322] = new ModelRendererTurbo(this, 347, 132, textureX, textureY); // Box 340
		bodyModel[323] = new ModelRendererTurbo(this, 351, 135, textureX, textureY); // Box 341
		bodyModel[324] = new ModelRendererTurbo(this, 224, 155, textureX, textureY, "lamp"); // Box 162 commander beacon
		bodyModel[325] = new ModelRendererTurbo(this, 223, 159, textureX, textureY); // Box 165
		bodyModel[326] = new ModelRendererTurbo(this, 232, 159, textureX, textureY); // Box 344
		bodyModel[327] = new ModelRendererTurbo(this, 233, 155, textureX, textureY, "lamp"); // Box 345 commander beacon
		bodyModel[328] = new ModelRendererTurbo(this, 222, 162, textureX, textureY, "cull"); // Box 346 cull
		bodyModel[329] = new ModelRendererTurbo(this, 231, 162, textureX, textureY, "cull"); // Box 347 cull
		bodyModel[330] = new ModelRendererTurbo(this, 270, 125, textureX, textureY); // Box 260
		bodyModel[331] = new ModelRendererTurbo(this, 257, 126, textureX, textureY); // Box 264
		bodyModel[332] = new ModelRendererTurbo(this, 268, 128, textureX, textureY); // Box 268
		bodyModel[333] = new ModelRendererTurbo(this, 257, 129, textureX, textureY); // Box 274
		bodyModel[334] = new ModelRendererTurbo(this, 254, 133, textureX, textureY); // Box 283
		bodyModel[335] = new ModelRendererTurbo(this, 267, 133, textureX, textureY); // Box 284
		bodyModel[336] = new ModelRendererTurbo(this, 246, 129, textureX, textureY); // Box 293
		bodyModel[337] = new ModelRendererTurbo(this, 229, 128, textureX, textureY); // Box 294
		bodyModel[338] = new ModelRendererTurbo(this, 231, 125, textureX, textureY); // Box 295
		bodyModel[339] = new ModelRendererTurbo(this, 246, 126, textureX, textureY); // Box 296
		bodyModel[340] = new ModelRendererTurbo(this, 241, 133, textureX, textureY); // Box 360
		bodyModel[341] = new ModelRendererTurbo(this, 228, 133, textureX, textureY); // Box 361
		bodyModel[342] = new ModelRendererTurbo(this, 157, 134, textureX, textureY); // Box 362 ane shit
		bodyModel[343] = new ModelRendererTurbo(this, 168, 136, textureX, textureY, "lamp"); // Box 363 ane front light gyra
		bodyModel[344] = new ModelRendererTurbo(this, 168, 136, textureX, textureY, "lamp"); // Box 364 ane front light gyra
		bodyModel[345] = new ModelRendererTurbo(this, 186, 134, textureX, textureY); // Box 365 ane shit
		bodyModel[346] = new ModelRendererTurbo(this, 197, 136, textureX, textureY, "lamp"); // Box 366 ane rear light gyra
		bodyModel[347] = new ModelRendererTurbo(this, 197, 136, textureX, textureY, "lamp"); // Box 367 ane rear light gyra
		bodyModel[348] = new ModelRendererTurbo(this, 358, 135, textureX, textureY); // Box 368
		bodyModel[349] = new ModelRendererTurbo(this, 358, 126, textureX, textureY); // Box 369
		bodyModel[350] = new ModelRendererTurbo(this, 358, 129, textureX, textureY); // Box 370
		bodyModel[351] = new ModelRendererTurbo(this, 358, 132, textureX, textureY); // Box 371
		bodyModel[352] = new ModelRendererTurbo(this, 291, 156, textureX, textureY); // Box 114
		bodyModel[353] = new ModelRendererTurbo(this, 291, 153, textureX, textureY); // Box 74
		bodyModel[354] = new ModelRendererTurbo(this, 291, 159, textureX, textureY); // Box 78
		bodyModel[355] = new ModelRendererTurbo(this, 284, 157, textureX, textureY); // Box 245
		bodyModel[356] = new ModelRendererTurbo(this, 284, 140, textureX, textureY); // Box 376
		bodyModel[357] = new ModelRendererTurbo(this, 285, 144, textureX, textureY); // Box 377
		bodyModel[358] = new ModelRendererTurbo(this, 285, 147, textureX, textureY); // Box 378
		bodyModel[359] = new ModelRendererTurbo(this, 285, 150, textureX, textureY); // Box 379
		bodyModel[360] = new ModelRendererTurbo(this, 255, 148, textureX, textureY); // Box 380
		bodyModel[361] = new ModelRendererTurbo(this, 276, 157, textureX, textureY); // Box 381
		bodyModel[362] = new ModelRendererTurbo(this, 276, 151, textureX, textureY); // Box 382
		bodyModel[363] = new ModelRendererTurbo(this, 317, 152, textureX, textureY); // Box 280
		bodyModel[364] = new ModelRendererTurbo(this, 326, 152, textureX, textureY); // Box 281
		bodyModel[365] = new ModelRendererTurbo(this, 339, 154, textureX, textureY); // Box 282
		bodyModel[366] = new ModelRendererTurbo(this, 374, 154, textureX, textureY); // Box 283
		bodyModel[367] = new ModelRendererTurbo(this, 361, 152, textureX, textureY); // Box 284
		bodyModel[368] = new ModelRendererTurbo(this, 352, 152, textureX, textureY); // Box 285
		bodyModel[369] = new ModelRendererTurbo(this, 136, 119, textureX, textureY); // Box 389
		bodyModel[370] = new ModelRendererTurbo(this, 134, 121, textureX, textureY); // Box 390
		bodyModel[371] = new ModelRendererTurbo(this, 134, 121, textureX, textureY); // Box 391
		bodyModel[372] = new ModelRendererTurbo(this, 136, 119, textureX, textureY); // Box 392
		bodyModel[373] = new ModelRendererTurbo(this, 134, 121, textureX, textureY); // Box 393
		bodyModel[374] = new ModelRendererTurbo(this, 136, 119, textureX, textureY); // Box 394
		bodyModel[375] = new ModelRendererTurbo(this, 126, 119, textureX, textureY); // Box 395
		bodyModel[376] = new ModelRendererTurbo(this, 124, 121, textureX, textureY); // Box 396
		bodyModel[377] = new ModelRendererTurbo(this, 124, 121, textureX, textureY); // Box 397
		bodyModel[378] = new ModelRendererTurbo(this, 126, 119, textureX, textureY); // Box 398
		bodyModel[379] = new ModelRendererTurbo(this, 124, 121, textureX, textureY); // Box 399
		bodyModel[380] = new ModelRendererTurbo(this, 126, 119, textureX, textureY); // Box 400
		bodyModel[381] = new ModelRendererTurbo(this, 60, 88, textureX, textureY); // Box 401
		bodyModel[382] = new ModelRendererTurbo(this, 324, 128, textureX, textureY); // Box 202
		bodyModel[383] = new ModelRendererTurbo(this, 314, 128, textureX, textureY); // Box 405
		bodyModel[384] = new ModelRendererTurbo(this, 320, 128, textureX, textureY); // Box 406
		bodyModel[385] = new ModelRendererTurbo(this, 364, 193, textureX, textureY); // Box 407
		bodyModel[386] = new ModelRendererTurbo(this, 371, 182, textureX, textureY); // Box 408
		bodyModel[387] = new ModelRendererTurbo(this, 137, 107, textureX, textureY); // Box 191 skirt
		bodyModel[388] = new ModelRendererTurbo(this, 137, 109, textureX, textureY); // Box 192
		bodyModel[389] = new ModelRendererTurbo(this, 418, 201, textureX, textureY); // Box 389
		bodyModel[390] = new ModelRendererTurbo(this, 418, 201, textureX, textureY); // Box 390
		bodyModel[391] = new ModelRendererTurbo(this, 418, 201, textureX, textureY); // Box 391
		bodyModel[392] = new ModelRendererTurbo(this, 418, 201, textureX, textureY); // Box 392
		bodyModel[393] = new ModelRendererTurbo(this, -7, 165, textureX, textureY); // Box 393
		bodyModel[394] = new ModelRendererTurbo(this, 102, 171, textureX, textureY); // Box 394
		bodyModel[395] = new ModelRendererTurbo(this, 90, 171, textureX, textureY); // Box 396
		bodyModel[396] = new ModelRendererTurbo(this, 363, 200, textureX, textureY); // Box 397
		bodyModel[397] = new ModelRendererTurbo(this, 374, 204, textureX, textureY); // Box 398
		bodyModel[398] = new ModelRendererTurbo(this, 347, 139, textureX, textureY); // Box 398
		bodyModel[399] = new ModelRendererTurbo(this, 356, 139, textureX, textureY); // Box 399

		bodyModel[0].addBox(0F, 0F, 0F, 54, 1, 22, 0F); // Box 0
		bodyModel[0].setRotationPoint(-27F, 2F, -11F);

		bodyModel[1].addBox(0F, 0F, 0F, 3, 1, 14, 0F); // Box 1
		bodyModel[1].setRotationPoint(-30F, 2F, -7F);

		bodyModel[2].addBox(0F, 0F, 0F, 30, 15, 14, 0F); // Box 5
		bodyModel[2].setRotationPoint(-26F, -13F, -7F);

		bodyModel[3].addBox(0F, 0F, 0F, 11, 14, 1, 0F); // Box 6
		bodyModel[3].setRotationPoint(12F, -17F, -11F);

		bodyModel[4].addBox(0F, 0F, 0F, 12, 2, 6, 0F); // Box 7
		bodyModel[4].setRotationPoint(11F, -21F, -3F);

		bodyModel[5].addBox(0F, 0F, 0F, 11, 14, 1, 0F); // Box 8
		bodyModel[5].setRotationPoint(12F, -17F, 10F);

		bodyModel[6].addBox(0F, 0F, 0F, 1, 14, 7, 0F); // Box 9
		bodyModel[6].setRotationPoint(22F, -17F, -10F);

		bodyModel[7].addBox(0F, 0F, 0F, 1, 14, 18, 0F); // Box 10
		bodyModel[7].setRotationPoint(11F, -17F, -7F);

		bodyModel[8].addBox(0F, 0F, 0F, 1, 2, 18, 0F); // Box 11
		bodyModel[8].setRotationPoint(11F, -19F, -9F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 12, 2, 6, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[9].setRotationPoint(11F, -21F, -9F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 12, 2, 2, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		bodyModel[10].setRotationPoint(11F, -19F, -11F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 12, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		bodyModel[11].setRotationPoint(11F, -19F, 9F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 12, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 16
		bodyModel[12].setRotationPoint(11F, -21F, 3F);

		bodyModel[13].addBox(0F, 0F, 0F, 16, 5, 22, 0F); // Box 18
		bodyModel[13].setRotationPoint(11F, -3F, -11F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 30, 1, 7, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 19
		bodyModel[14].setRotationPoint(-26F, -14F, -7F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 30, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 20
		bodyModel[15].setRotationPoint(-26F, -14F, 0F);

		bodyModel[16].addBox(0F, 0F, 0F, 37, 8, 0, 0F); // Box 35
		bodyModel[16].setRotationPoint(-26F, -6F, -11.01F);

		bodyModel[17].addBox(0F, 0F, 0F, 37, 8, 0, 0F); // Box 36
		bodyModel[17].setRotationPoint(-26F, -6F, 11.01F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 2, 2, 0, 0F,-2F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[18].setRotationPoint(-28F, -6F, -11.01F);

		bodyModel[19].addBox(0F, 0F, 0F, 1, 9, 0, 0F); // Box 40
		bodyModel[19].setRotationPoint(-28F, -4F, -11.01F);

		bodyModel[20].addBox(0F, 0F, 0F, 1, 9, 0, 0F); // Box 41
		bodyModel[20].setRotationPoint(-28F, -4F, 11.01F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 2, 2, 0, 0F,-2F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 42
		bodyModel[21].setRotationPoint(-28F, -6F, 11.01F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F); // Box 43
		bodyModel[22].setRotationPoint(9F, -1F, -11F);

		bodyModel[23].addBox(0F, 0F, 0F, 3, 0, 22, 0F); // Box 50
		bodyModel[23].setRotationPoint(-33F, 9F, -11F);

		bodyModel[24].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 52
		bodyModel[24].setRotationPoint(-33.5F, 3F, -1.5F);

		bodyModel[25].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 53
		bodyModel[25].setRotationPoint(30.5F, 3F, -1.5F);

		bodyModel[26].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 58
		bodyModel[26].setRotationPoint(-27F, 9F, -9F);
		bodyModel[26].rotateAngleY = -3.14159265F;

		bodyModel[27].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 59
		bodyModel[27].setRotationPoint(-27F, 7F, -7.5F);
		bodyModel[27].rotateAngleY = -3.14159265F;

		bodyModel[28].addBox(0F, 0F, 0F, 1, 3, 0, 0F); // Box 67
		bodyModel[28].setRotationPoint(26F, -6F, -4F);

		bodyModel[29].addBox(0F, 0F, 0F, 1, 3, 0, 0F); // Box 68
		bodyModel[29].setRotationPoint(26F, -6F, 4F);

		bodyModel[30].addBox(0F, 0F, 0F, 1, 14, 7, 0F); // Box 71
		bodyModel[30].setRotationPoint(22F, -17F, 3F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 1, 14, 6, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 61
		bodyModel[31].setRotationPoint(22F, -17F, -3F);

		bodyModel[32].addBox(0F, 0F, 0F, 1, 4, 4, 0F); // Box 70
		bodyModel[32].setRotationPoint(12F, -11F, -0.5F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, -1F, -1F); // Box 71
		bodyModel[33].setRotationPoint(12F, -19F, -1F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.25F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F); // Box 72
		bodyModel[34].setRotationPoint(10F, -20F, -0.5F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.5F, 0.25F, 0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, 0.5F, 0.25F, 0.25F, 0.5F, 0.25F, 0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, 0.5F, 0.25F, 0.25F); // Box 73
		bodyModel[35].setRotationPoint(9F, -20F, -0.5F);

		bodyModel[36].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 78 glow
		bodyModel[36].setRotationPoint(16F, -19.5F, -1F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 9, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 83
		bodyModel[37].setRotationPoint(-4.5F, 4F, -11F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 9, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 84
		bodyModel[38].setRotationPoint(-4.5F, 6F, -11F);

		bodyModel[39].addBox(0F, 0F, 0F, 9, 1, 3, 0F); // Box 85
		bodyModel[39].setRotationPoint(-4.5F, 5F, -11F);

		bodyModel[40].addBox(0F, 0F, 0F, 10, 3, 16, 0F); // Box 89
		bodyModel[40].setRotationPoint(-5F, 4F, -8F);

		bodyModel[41].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 102
		bodyModel[41].setRotationPoint(-17F, 4F, -1F);

		bodyModel[42].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 104
		bodyModel[42].setRotationPoint(15F, 4F, -1F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 7, 13, 14, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 107
		bodyModel[43].setRotationPoint(4F, -11F, -7F);

		bodyModel[44].addBox(0F, 0F, 0F, 54, 1, 16, 0F); // Box 108
		bodyModel[44].setRotationPoint(-27F, 3F, -8F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 114
		bodyModel[45].setRotationPoint(-13F, -17F, -0.5F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[46].setRotationPoint(-13F, -18F, -0.5F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 78
		bodyModel[47].setRotationPoint(-12.75F, -16.5F, -0.25F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 113
		bodyModel[48].setRotationPoint(-13F, -15F, -2F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 114
		bodyModel[49].setRotationPoint(-13F, -18F, -2F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 115
		bodyModel[50].setRotationPoint(-13F, -18F, 1F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 116
		bodyModel[51].setRotationPoint(-13F, -18.5F, -1F);

		bodyModel[52].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 117
		bodyModel[52].setRotationPoint(-13F, -14.5F, -1F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 10, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 126
		bodyModel[53].setRotationPoint(12F, -19F, 6F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 10, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 127
		bodyModel[54].setRotationPoint(12F, -19F, -9F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 1, 0, 6, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 129
		bodyModel[55].setRotationPoint(10F, -21F, -9F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 1, 0, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F); // Box 130
		bodyModel[56].setRotationPoint(10F, -21F, 3F);

		bodyModel[57].addBox(0F, 0F, 0F, 1, 0, 6, 0F); // Box 131
		bodyModel[57].setRotationPoint(10F, -21F, -3F);

		bodyModel[58].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 134
		bodyModel[58].setRotationPoint(-27F, 5F, -6F);
		bodyModel[58].rotateAngleY = -3.14159265F;

		bodyModel[59].addShapeBox(0F, 0F, 0F, 0, 6, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 135
		bodyModel[59].setRotationPoint(-27F, 3F, -11F);

		bodyModel[60].addBox(0F, 0F, 0F, 1, 12, 12, 0F); // Box 138
		bodyModel[60].setRotationPoint(-26.75F, -10.5F, -6F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 1, 0, 6, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 139
		bodyModel[61].setRotationPoint(23F, -21F, -9F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 1, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 140
		bodyModel[62].setRotationPoint(23F, -17F, -11F);

		bodyModel[63].addBox(0F, 0F, 0F, 1, 0, 6, 0F); // Box 141
		bodyModel[63].setRotationPoint(23F, -21F, -3F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 1, 0, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F); // Box 142
		bodyModel[64].setRotationPoint(23F, -21F, 3F);

		bodyModel[65].addBox(0F, 0F, 0F, 1, 2, 18, 0F); // Box 144
		bodyModel[65].setRotationPoint(22F, -19F, -9F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[66].setRotationPoint(-31F, 3F, -2F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 146
		bodyModel[67].setRotationPoint(30F, 3F, -2F);

		bodyModel[68].addBox(0F, 0F, 0F, 2, 3, 3, 0F); // Box 147
		bodyModel[68].setRotationPoint(-28F, -14F, -1.5F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 148
		bodyModel[69].setRotationPoint(-27.5F, -13.5F, -2.5F);

		bodyModel[70].addBox(-0.5F, 0F, -0.5F, 1, 14, 4, 0F); // Box 315 door swing right
		bodyModel[70].setRotationPoint(11.5F, -17F, -10.5F);

		bodyModel[71].addBox(0F, 0F, 0F, 0, 14, 20, 0F); // Box 166
		bodyModel[71].setRotationPoint(-30.01F, -6F, -10F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 167
		bodyModel[72].setRotationPoint(-30.01F, -6F, -11F);

		bodyModel[73].addBox(0F, 0F, 0F, 0, 10, 1, 0F); // Box 168
		bodyModel[73].setRotationPoint(-30.01F, -5F, -11F);

		bodyModel[74].addBox(0F, 0F, 0F, 0, 10, 1, 0F); // Box 169
		bodyModel[74].setRotationPoint(-30.01F, -5F, 10F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 170
		bodyModel[75].setRotationPoint(-30.01F, -6F, 10F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.05F, 0F, -0.5F, -0.05F, 0F, -0.5F, -0.05F, -0.5F, 0F, -0.05F, -0.5F, 0F, -0.55F, 0F, -0.5F, -0.55F, 0F, -0.5F, -0.55F, -0.5F, 0F, -0.55F, -0.5F); // Box 171 lamp headlight front double
		bodyModel[76].setRotationPoint(-28.25F, -14F, -0.75F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.05F, 0F, -0.5F, -0.05F, 0F, -0.5F, -0.05F, -0.5F, 0F, -0.05F, -0.5F, 0F, -0.55F, 0F, -0.5F, -0.55F, 0F, -0.5F, -0.55F, -0.5F, 0F, -0.55F, -0.5F); // Box 172 lamp headlight front double
		bodyModel[77].setRotationPoint(-28.25F, -12.5F, -0.75F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 173
		bodyModel[78].setRotationPoint(-27.5F, -13.5F, 1.5F);

		bodyModel[79].addBox(0F, 0F, 0F, 0, 1, 22, 0F); // Box 174
		bodyModel[79].setRotationPoint(-30.01F, 8F, -11F);

		bodyModel[80].addBox(0F, 0F, 0F, 0, 14, 20, 0F); // Box 176
		bodyModel[80].setRotationPoint(30.01F, -6F, -10F);

		bodyModel[81].addBox(0F, 0F, 0F, 0, 1, 22, 0F); // Box 177
		bodyModel[81].setRotationPoint(30.01F, 8F, -11F);

		bodyModel[82].addBox(0F, 0F, 0F, 3, 0, 22, 0F); // Box 179
		bodyModel[82].setRotationPoint(30.01F, 9F, -11F);

		bodyModel[83].addBox(0F, 0F, 0F, 0, 10, 1, 0F); // Box 180
		bodyModel[83].setRotationPoint(30.01F, -5F, -11F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 181
		bodyModel[84].setRotationPoint(30.01F, -6F, 10F);

		bodyModel[85].addBox(0F, 0F, 0F, 0, 10, 1, 0F); // Box 182
		bodyModel[85].setRotationPoint(30.01F, -5F, 10F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 183
		bodyModel[86].setRotationPoint(30.01F, -6F, -11F);

		bodyModel[87].addBox(0F, 0F, 0F, 3, 1, 14, 0F); // Box 184
		bodyModel[87].setRotationPoint(27F, 2F, -7F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 3, 6, 0, 0F,-3F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 131
		bodyModel[88].setRotationPoint(27F, -12F, -4F);
		bodyModel[88].rotateAngleY = -3.14159265F;

		bodyModel[89].addShapeBox(0F, 0F, 0F, 3, 6, 0, 0F,-3F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 187
		bodyModel[89].setRotationPoint(27F, -12F, 4F);
		bodyModel[89].rotateAngleY = -3.14159265F;

		bodyModel[90].addBox(0F, 0F, 0F, 3, 11, 0, 0F); // Box 188
		bodyModel[90].setRotationPoint(25F, -6F, -11.01F);

		bodyModel[91].addBox(0F, 0F, 0F, 3, 11, 0, 0F); // Box 190
		bodyModel[91].setRotationPoint(25F, -6F, 11.01F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 196
		bodyModel[92].setRotationPoint(22.5F, -19.5F, -2.5F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, -0.5F, -0.5F, -0.05F, -0.5F, -0.5F, -0.55F, 0F, 0F, -0.55F, 0F, 0F, -0.55F, -0.5F, -0.5F, -0.55F, -0.5F); // Box 197 lamp headlight rear double
		bodyModel[93].setRotationPoint(24.25F, -18.5F, -0.75F);

		bodyModel[94].addBox(0F, 0F, 0F, 2, 3, 3, 0F); // Box 198
		bodyModel[94].setRotationPoint(23F, -20F, -1.5F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 199
		bodyModel[95].setRotationPoint(22.5F, -19.5F, 1.5F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, -0.5F, -0.5F, -0.05F, -0.5F, -0.5F, -0.55F, 0F, 0F, -0.55F, 0F, 0F, -0.55F, -0.5F, -0.5F, -0.55F, -0.5F); // Box 200 lamp headlight rear double
		bodyModel[96].setRotationPoint(24.25F, -20F, -0.75F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.5F, 0.25F, 0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, 0.5F, 0.25F, 0.25F, 0.5F, 0.25F, 0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, 0.5F, 0.25F, 0.25F); // Box 164
		bodyModel[97].setRotationPoint(9F, -22F, -0.5F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.25F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F); // Box 165
		bodyModel[98].setRotationPoint(10F, -22F, -0.5F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 166
		bodyModel[99].setRotationPoint(11F, -22F, -0.5F);

		bodyModel[100].addBox(0F, 0F, 0F, 2, 1, 0, 0F); // Box 167 liveryimg 2 glow
		bodyModel[100].setRotationPoint(-27.5F, -13F, -1.5F);
		bodyModel[100].rotateAngleY = -0.4712389F;

		bodyModel[101].addBox(0F, 0F, 0F, 2, 1, 0, 0F); // Box 168 liveryimg 2 glow
		bodyModel[101].setRotationPoint(-27.5F, -13F, 1.5F);
		bodyModel[101].rotateAngleY = 0.4712389F;

		bodyModel[102].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 169 lamp headlight front big
		bodyModel[102].setRotationPoint(-28.25F, -13.75F, -1.25F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 170 lamp headlight rear big
		bodyModel[103].setRotationPoint(23.75F, -19.75F, -1.25F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 162 glow commander beacon
		bodyModel[104].setRotationPoint(12.5F, -23F, -0.5F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0.3F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, 0.3F, -0.5F, 0.1F, 0.3F, 0F, 0.1F, -1F, 0F, 0.1F, -1F, 0F, 0.1F, 0.3F, 0F, 0.1F); // Box 165
		bodyModel[105].setRotationPoint(12.65F, -22F, -0.5F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 185 glow commander beacon
		bodyModel[106].setRotationPoint(22.5F, -23F, -0.5F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0.3F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, 0.3F, -0.5F, 0.1F, 0.3F, 0F, 0.1F, -1F, 0F, 0.1F, -1F, 0F, 0.1F, 0.3F, 0F, 0.1F); // Box 186
		bodyModel[107].setRotationPoint(22.65F, -22F, -0.5F);

		bodyModel[108].addBox(0F, 0F, 0F, 2, 1, 0, 0F); // Box 179 liveryimg 2 glow
		bodyModel[108].setRotationPoint(24.5F, -19F, -1.5F);
		bodyModel[108].rotateAngleY = -2.67035376F;

		bodyModel[109].addBox(0F, 0F, 0F, 2, 1, 0, 0F); // Box 180 liveryimg 2 glow
		bodyModel[109].setRotationPoint(24.5F, -19F, 1.5F);
		bodyModel[109].rotateAngleY = 2.67035376F;

		bodyModel[110].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 183
		bodyModel[110].setRotationPoint(12F, -22F, 0F);

		bodyModel[111].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 184
		bodyModel[111].setRotationPoint(18F, -23F, 0F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 2, 2, 0, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 186
		bodyModel[112].setRotationPoint(-32F, 7F, -2F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 2, 2, 0, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 187
		bodyModel[113].setRotationPoint(-32F, 7F, 2F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 2, 2, 0, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 188
		bodyModel[114].setRotationPoint(30F, 7F, 2F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 2, 2, 0, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 189
		bodyModel[115].setRotationPoint(30F, 7F, -2F);

		bodyModel[116].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 195
		bodyModel[116].setRotationPoint(9F, -23F, -0.5F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 196
		bodyModel[117].setRotationPoint(9.5F, -22.75F, -1.5F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 197
		bodyModel[118].setRotationPoint(9.5F, -22.75F, 0.5F);

		bodyModel[119].addBox(0F, 0F, 0F, 10, 1, 22, 0F); // Box 202
		bodyModel[119].setRotationPoint(-5F, 7F, -11F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 10, 1, 20, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 203
		bodyModel[120].setRotationPoint(-5F, 8F, -10F);

		bodyModel[121].addBox(0F, 0F, 0F, 3, 1, 0, 0F); // Box 212
		bodyModel[121].setRotationPoint(-27F, 8F, -9F);
		bodyModel[121].rotateAngleY = -3.14159265F;

		bodyModel[122].addBox(0F, 0F, 0F, 3, 1, 0, 0F); // Box 213
		bodyModel[122].setRotationPoint(-27F, 6F, -7.5F);
		bodyModel[122].rotateAngleY = -3.14159265F;

		bodyModel[123].addBox(0F, 0F, 0F, 3, 1, 0, 0F); // Box 214
		bodyModel[123].setRotationPoint(-27F, 4F, -6F);
		bodyModel[123].rotateAngleY = -3.14159265F;

		bodyModel[124].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 218
		bodyModel[124].setRotationPoint(27F, 5F, 6F);

		bodyModel[125].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 219
		bodyModel[125].setRotationPoint(27F, 7F, 7.5F);

		bodyModel[126].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 220
		bodyModel[126].setRotationPoint(27F, 9F, 9F);

		bodyModel[127].addBox(0F, 0F, 0F, 3, 1, 0, 0F); // Box 221
		bodyModel[127].setRotationPoint(30F, 8F, 9F);
		bodyModel[127].rotateAngleY = -3.14159265F;

		bodyModel[128].addBox(0F, 0F, 0F, 3, 1, 0, 0F); // Box 222
		bodyModel[128].setRotationPoint(30F, 6F, 7.5F);
		bodyModel[128].rotateAngleY = -3.14159265F;

		bodyModel[129].addBox(0F, 0F, 0F, 3, 1, 0, 0F); // Box 223
		bodyModel[129].setRotationPoint(30F, 4F, 6F);
		bodyModel[129].rotateAngleY = -3.14159265F;

		bodyModel[130].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F); // Box 230
		bodyModel[130].setRotationPoint(26.5F, -1F, -2F);

		bodyModel[131].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 231
		bodyModel[131].setRotationPoint(23F, -12F, 4F);

		bodyModel[132].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 232
		bodyModel[132].setRotationPoint(23F, -12F, -4F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 2, 7, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F); // Box 33
		bodyModel[133].setRotationPoint(1F, -20F, -1F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 2, 7, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F); // Box 383
		bodyModel[134].setRotationPoint(-11F, -20F, -1F);

		bodyModel[135].addBox(0F, 0F, 0F, 2, 1, 21, 0F); // Box 462
		bodyModel[135].setRotationPoint(-17F, 3F, -10.5F);

		bodyModel[136].addBox(0F, 0F, 0F, 2, 1, 21, 0F); // Box 463
		bodyModel[136].setRotationPoint(15F, 3F, -10.5F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 2, 3, 4, 0F,0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 388
		bodyModel[137].setRotationPoint(-30F, 3F, -2F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 2, 3, 4, 0F,2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 389
		bodyModel[138].setRotationPoint(28F, 3F, -2F);

		bodyModel[139].addBox(0F, 0F, 0F, 30, 0, 1, 0F); // Box 390
		bodyModel[139].setRotationPoint(-26F, -11F, -8F);

		bodyModel[140].addBox(0F, 0F, 0F, 30, 0, 1, 0F); // Box 391
		bodyModel[140].setRotationPoint(-26F, -11F, 7F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 7, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 392
		bodyModel[141].setRotationPoint(4F, -11F, -8F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 7, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 393
		bodyModel[142].setRotationPoint(4F, -11F, 7F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 2, 2, 0, 0F,0F, -1F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 394
		bodyModel[143].setRotationPoint(-25F, -6F, -11.01F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 2, 2, 0, 0F,0F, -1F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 395
		bodyModel[144].setRotationPoint(-25F, -6F, 11.01F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 7, 2, 7, 0F,0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 396
		bodyModel[145].setRotationPoint(4F, -13F, -7F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 7, 2, 7, 0F,0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 397
		bodyModel[146].setRotationPoint(4F, -13F, 0F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 4, 6, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Box 398
		bodyModel[147].setRotationPoint(-27F, 3F, -11F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 4, 6, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Box 399
		bodyModel[148].setRotationPoint(-27F, 3F, 11F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 4, 6, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); // Box 400
		bodyModel[149].setRotationPoint(23F, 3F, 11F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 4, 6, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); // Box 401
		bodyModel[150].setRotationPoint(23F, 3F, -11F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 364 prime base
		bodyModel[151].setRotationPoint(12F, -23F, -1F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F); // Box 6 PRIME1-1
		bodyModel[152].setRotationPoint(12F, -23.5F, -1F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F); // Box 7 PRIME1-3
		bodyModel[153].setRotationPoint(12F, -23.5F, -1F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 8 PRIME1-2
		bodyModel[154].setRotationPoint(12F, -23.5F, -1F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 9 PRIME1-4
		bodyModel[155].setRotationPoint(12F, -23.5F, -1F);

		bodyModel[156].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 478 cull
		bodyModel[156].setRotationPoint(12F, -22F, -1F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 364 prime base
		bodyModel[157].setRotationPoint(16F, -22F, -1F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F); // Box 6 PRIME2-1
		bodyModel[158].setRotationPoint(16F, -22.5F, -1F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F); // Box 7 PRIME2-3
		bodyModel[159].setRotationPoint(16F, -22.5F, -1F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 8 PRIME2-2
		bodyModel[160].setRotationPoint(16F, -22.5F, -1F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 9 PRIME2-4
		bodyModel[161].setRotationPoint(16F, -22.5F, -1F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 0, 6, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 489
		bodyModel[162].setRotationPoint(-27F, 3F, 5F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 0, 6, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 490
		bodyModel[163].setRotationPoint(27F, 3F, 5F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 0, 6, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 491
		bodyModel[164].setRotationPoint(27F, 3F, -11F);

		bodyModel[165].addBox(0F, 0F, 0F, 2, 0, 2, 0F); // Box 310 nasa cap
		bodyModel[165].setRotationPoint(1.75F, -21.5F, -1F);
		bodyModel[165].rotateAngleZ = -0.87266463F;

		bodyModel[166].addBox(0F, 0F, 0F, 2, 0, 2, 0F); // Box 311 nasa cap
		bodyModel[166].setRotationPoint(-10.25F, -21.5F, -1F);
		bodyModel[166].rotateAngleZ = -0.87266463F;

		bodyModel[167].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 78
		bodyModel[167].setRotationPoint(-30F, 0F, 4.75F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 188
		bodyModel[168].setRotationPoint(-30F, 0F, -6.75F);

		bodyModel[169].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 189 lamp ditchlight front up
		bodyModel[169].setRotationPoint(-30.25F, 0F, 4.75F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 190 lamp ditchlight front up
		bodyModel[170].setRotationPoint(-30.25F, 0F, -6.75F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 182 lamp ditchlight rear up
		bodyModel[171].setRotationPoint(29.25F, 0F, -6.75F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 183
		bodyModel[172].setRotationPoint(29F, 0F, -6.75F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 186 lamp ditchlight rear up
		bodyModel[173].setRotationPoint(29.25F, 0F, 4.75F);

		bodyModel[174].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 187
		bodyModel[174].setRotationPoint(29F, 0F, 4.75F);

		bodyModel[175].addShapeBox(0F, 0F, 0F, 9, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1.75F, -2F, 0F, -1.75F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F); // Box 122
		bodyModel[175].setRotationPoint(13F, -17F, 11F);

		bodyModel[176].addShapeBox(0F, 0F, 0F, 9, 2, 1, 0F,-1.75F, -2F, 0F, -1.75F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 123
		bodyModel[176].setRotationPoint(13F, -17F, -12F);

		bodyModel[177].addShapeBox(0F, 0F, 0F, 2, 6, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 504
		bodyModel[177].setRotationPoint(-27F, 3F, -11F);

		bodyModel[178].addShapeBox(0F, 0F, 0F, 2, 6, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 505
		bodyModel[178].setRotationPoint(-27F, 3F, 11F);

		bodyModel[179].addShapeBox(0F, 0F, 0F, 2, 6, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 506
		bodyModel[179].setRotationPoint(25F, 3F, 11F);

		bodyModel[180].addShapeBox(0F, 0F, 0F, 2, 6, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 507
		bodyModel[180].setRotationPoint(25F, 3F, -11F);

		bodyModel[181].addShapeBox(0F, 0F, 0F, 8, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F); // Box 3 cull aww
		bodyModel[181].setRotationPoint(13F, -16F, 10F);

		bodyModel[182].addShapeBox(0F, 0F, 0F, 8, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 5 aww
		bodyModel[182].setRotationPoint(13F, -17F, 10F);

		bodyModel[183].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 385
		bodyModel[183].setRotationPoint(9F, -20F, -1F);

		bodyModel[184].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 386
		bodyModel[184].setRotationPoint(8.25F, -20F, 0F);

		bodyModel[185].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 512
		bodyModel[185].setRotationPoint(9.25F, -19F, -0.5F);

		bodyModel[186].addBox(0F, 0F, 0F, 3, 3, 3, 0F); // Box 419 cull
		bodyModel[186].setRotationPoint(-11.5F, -21F, -1.5F);

		bodyModel[187].addBox(0F, 0F, 0F, 3, 3, 3, 0F); // Box 420 cull
		bodyModel[187].setRotationPoint(0.5F, -21F, -1.5F);

		bodyModel[188].addBox(0F, 0F, 0F, 2, 3, 2, 0F); // Box 515
		bodyModel[188].setRotationPoint(1F, -16F, -1F);

		bodyModel[189].addBox(0F, 0F, 0F, 9, 1, 3, 0F); // Box 517
		bodyModel[189].setRotationPoint(-4.5F, 5F, 8F);

		bodyModel[190].addShapeBox(0F, 0F, 0F, 9, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 518
		bodyModel[190].setRotationPoint(-4.5F, 6F, 8F);

		bodyModel[191].addShapeBox(0F, 0F, 0F, 9, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 519
		bodyModel[191].setRotationPoint(-4.5F, 4F, 8F);

		bodyModel[192].addShapeBox(0F, 0F, 0F, 7, 3, 3, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F); // Box 381
		bodyModel[192].setRotationPoint(-1.5F, -18F, -1.5F);

		bodyModel[193].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F); // Box 521
		bodyModel[193].setRotationPoint(-1F, -21F, -0.5F);

		bodyModel[194].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F); // Box 522
		bodyModel[194].setRotationPoint(4F, -21F, -0.5F);

		bodyModel[195].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F); // Box 523
		bodyModel[195].setRotationPoint(-8F, -21F, -0.5F);

		bodyModel[196].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F); // Box 524
		bodyModel[196].setRotationPoint(-13F, -21F, -0.5F);

		bodyModel[197].addShapeBox(0F, 0F, 0F, 7, 3, 3, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F); // Box 525
		bodyModel[197].setRotationPoint(-13.5F, -18F, -1.5F);

		bodyModel[198].addBox(0F, 0F, 0F, 2, 3, 2, 0F); // Box 526
		bodyModel[198].setRotationPoint(-11F, -16F, -1F);

		bodyModel[199].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 114
		bodyModel[199].setRotationPoint(-16F, -17F, -0.5F);

		bodyModel[200].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[200].setRotationPoint(-16F, -18F, -0.5F);

		bodyModel[201].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 78
		bodyModel[201].setRotationPoint(-15.75F, -16.5F, -0.25F);

		bodyModel[202].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 113
		bodyModel[202].setRotationPoint(-16F, -15F, -2F);

		bodyModel[203].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 114
		bodyModel[203].setRotationPoint(-16F, -18F, -2F);

		bodyModel[204].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 115
		bodyModel[204].setRotationPoint(-16F, -18F, 1F);

		bodyModel[205].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 116
		bodyModel[205].setRotationPoint(-16F, -18.5F, -1F);

		bodyModel[206].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 117
		bodyModel[206].setRotationPoint(-16F, -14.5F, -1F);

		bodyModel[207].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 535
		bodyModel[207].setRotationPoint(0.5F, -20F, -1.5F);

		bodyModel[208].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 536
		bodyModel[208].setRotationPoint(0.5F, -18F, -1.5F);

		bodyModel[209].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 537
		bodyModel[209].setRotationPoint(0.5F, -21F, -1.5F);

		bodyModel[210].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 538
		bodyModel[210].setRotationPoint(-11.5F, -20F, -1.5F);

		bodyModel[211].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 539
		bodyModel[211].setRotationPoint(-11.5F, -21F, -1.5F);

		bodyModel[212].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 540
		bodyModel[212].setRotationPoint(-11.5F, -18F, -1.5F);

		bodyModel[213].addBox(0F, 0F, 0F, 0, 3, 12, 0F); // Box 541
		bodyModel[213].setRotationPoint(30.01F, -9F, -6F);

		bodyModel[214].addShapeBox(0F, 0F, 0F, 0, 1, 3, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -1F, 0F, 2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 543
		bodyModel[214].setRotationPoint(30.01F, -9F, -9F);

		bodyModel[215].addShapeBox(0F, 0F, 0F, 0, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -1F, 0F, 2F, -1F); // Box 544
		bodyModel[215].setRotationPoint(30.01F, -9F, 6F);

		bodyModel[216].addBox(0F, 0F, 0F, 0, 11, 1, 0F); // Box 545
		bodyModel[216].setRotationPoint(30.01F, -9F, -0.5F);

		bodyModel[217].addBox(0F, 0F, 0F, 0, 10, 1, 0F); // Box 546
		bodyModel[217].setRotationPoint(-30.01F, -8F, -0.5F);

		bodyModel[218].addBox(0F, 0F, 0F, 7, 8, 3, 0F); // Box 413
		bodyModel[218].setRotationPoint(10.9F, -11F, -3F);
		bodyModel[218].rotateAngleY = -0.38397244F;

		bodyModel[219].addShapeBox(-1F, 0F, 0F, 11, 4, 2, 0F,0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -2F, 0F, -5F, -2F, 0F, -5F, -2F, 0F, 0F, -2F, 0F); // Box 86
		bodyModel[219].setRotationPoint(12.5F, -13F, -3F);
		bodyModel[219].rotateAngleY = -0.38397244F;

		bodyModel[220].addBox(0F, 0F, 0F, 2, 3, 3, 0F); // Box 550
		bodyModel[220].setRotationPoint(-28F, -21F, -1.5F);

		bodyModel[221].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, -0.05F, 0F, -0.5F, -0.05F, 0F, -0.5F, -0.05F, -0.5F, 0F, -0.05F, -0.5F, 0F, -0.55F, 0F, -0.5F, -0.55F, 0F, -0.5F, -0.55F, -0.5F, 0F, -0.55F, -0.5F); // Box 551 tall front headlight
		bodyModel[221].setRotationPoint(-28.25F, -21F, -0.75F);

		bodyModel[222].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, -0.05F, 0F, -0.5F, -0.05F, 0F, -0.5F, -0.05F, -0.5F, 0F, -0.05F, -0.5F, 0F, -0.55F, 0F, -0.5F, -0.55F, 0F, -0.5F, -0.55F, -0.5F, 0F, -0.55F, -0.5F); // Box 552 tall front headlight
		bodyModel[222].setRotationPoint(-28.25F, -19.5F, -0.75F);

		bodyModel[223].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 553
		bodyModel[223].setRotationPoint(-27.5F, -20.5F, -2.5F);

		bodyModel[224].addBox(0F, 0F, 0F, 2, 1, 0, 0F); // Box 554
		bodyModel[224].setRotationPoint(-27.5F, -20F, -1.5F);
		bodyModel[224].rotateAngleY = -0.4712389F;

		bodyModel[225].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 555
		bodyModel[225].setRotationPoint(-27.5F, -20.5F, 1.5F);

		bodyModel[226].addBox(0F, 0F, 0F, 2, 1, 0, 0F); // Box 556
		bodyModel[226].setRotationPoint(-27.5F, -20F, 1.5F);
		bodyModel[226].rotateAngleY = 0.4712389F;

		bodyModel[227].addShapeBox(0F, 0F, 0F, 1, 8, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 557
		bodyModel[227].setRotationPoint(-26F, -21F, -2.5F);

		bodyModel[228].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 383
		bodyModel[228].setRotationPoint(11F, -20F, 7.5F);

		bodyModel[229].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 384
		bodyModel[229].setRotationPoint(9.5F, -21F, 6.5F);

		bodyModel[230].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 385
		bodyModel[230].setRotationPoint(11F, -21F, 7.5F);

		bodyModel[231].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 386
		bodyModel[231].setRotationPoint(10.25F, -21F, 8.5F);

		bodyModel[232].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 562
		bodyModel[232].setRotationPoint(11F, -22F, -0.5F);

		bodyModel[233].addBox(0F, 0F, 0F, 7, 2, 7, 0F); // Box 563 some ac thing idk
		bodyModel[233].setRotationPoint(12F, -22F, -3.5F);

		bodyModel[234].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 136
		bodyModel[234].setRotationPoint(-13.5F, -16F, -1F);

		bodyModel[235].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 287
		bodyModel[235].setRotationPoint(-13.5F, -18F, -1F);

		bodyModel[236].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 288
		bodyModel[236].setRotationPoint(-13.5F, -17F, -1F);

		bodyModel[237].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 289
		bodyModel[237].setRotationPoint(-13F, -16F, -0.5F);

		bodyModel[238].addBox(0F, 0F, 0F, 7, 3, 3, 0F); // Box 171
		bodyModel[238].setRotationPoint(-3.5F, -18F, -1.5F);

		bodyModel[239].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 172
		bodyModel[239].setRotationPoint(-3.5F, -15.5F, -1.5F);

		bodyModel[240].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 173
		bodyModel[240].setRotationPoint(-3.5F, -15.5F, 1.5F);

		bodyModel[241].addBox(0F, 0F, 0F, 2, 1, 3, 0F); // Box 174
		bodyModel[241].setRotationPoint(-3.5F, -19F, -1.5F);

		bodyModel[242].addBox(0F, 0F, 0F, 7, 3, 3, 0F); // Box 580
		bodyModel[242].setRotationPoint(-11.5F, -18F, -1.5F);

		bodyModel[243].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 581
		bodyModel[243].setRotationPoint(-5.5F, -15.5F, -1.5F);

		bodyModel[244].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 582
		bodyModel[244].setRotationPoint(-5.5F, -15.5F, 1.5F);

		bodyModel[245].addBox(0F, 0F, 0F, 2, 1, 3, 0F); // Box 583
		bodyModel[245].setRotationPoint(-6.5F, -19F, -1.5F);

		bodyModel[246].addBox(0F, 0F, 0F, 1, 3, 4, 0F); // Box 160
		bodyModel[246].setRotationPoint(-30.5F, -3F, -2F);

		bodyModel[247].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 161
		bodyModel[247].setRotationPoint(-30.5F, -4F, -2F);

		bodyModel[248].addBox(0F, 0F, 0F, 0, 2, 6, 0F); // Box 586
		bodyModel[248].setRotationPoint(-30.01F, -8F, -3F);

		bodyModel[249].addBox(0F, 0F, 0F, 6, 2, 4, 0F); // Box 364
		bodyModel[249].setRotationPoint(16.5F, -23F, -2F);

		bodyModel[250].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 365
		bodyModel[250].setRotationPoint(15.5F, -23F, -2F);

		bodyModel[251].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 366
		bodyModel[251].setRotationPoint(15.5F, -22F, -2F);

		bodyModel[252].addShapeBox(0F, 0F, 0F, 0, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F); // Box 590
		bodyModel[252].setRotationPoint(-30.01F, -8F, 3F);

		bodyModel[253].addShapeBox(0F, 0F, 0F, 0, 1, 5, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 591
		bodyModel[253].setRotationPoint(-30.01F, -8F, -8F);

		bodyModel[254].addShapeBox(0F, 0F, 0F, 0, 1, 5, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 592
		bodyModel[254].setRotationPoint(30.01F, -8F, -8F);

		bodyModel[255].addShapeBox(0F, 0F, 0F, 0, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F); // Box 593
		bodyModel[255].setRotationPoint(30.01F, -8F, 3F);

		bodyModel[256].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 594
		bodyModel[256].setRotationPoint(29.5F, -4F, -2F);

		bodyModel[257].addBox(0F, 0F, 0F, 1, 3, 4, 0F); // Box 595
		bodyModel[257].setRotationPoint(29.5F, -3F, -2F);

		bodyModel[258].addBox(0F, 0F, 0F, 2, 2, 20, 0F); // Box 456 cull
		bodyModel[258].setRotationPoint(-32F, 7F, -10F);

		bodyModel[259].addBox(0F, 0F, 0F, 2, 2, 20, 0F); // Box 457 cull
		bodyModel[259].setRotationPoint(30F, 7F, -10F);

		bodyModel[260].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 598
		bodyModel[260].setRotationPoint(13F, -21F, -8F);

		bodyModel[261].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 599
		bodyModel[261].setRotationPoint(-30.5F, 2F, -5.75F);

		bodyModel[262].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 600
		bodyModel[262].setRotationPoint(-30.5F, 2F, 3.75F);

		bodyModel[263].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 601 lamp ditchlight front down
		bodyModel[263].setRotationPoint(-30.75F, 2F, -5.75F);

		bodyModel[264].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 602 lamp ditchlight front down
		bodyModel[264].setRotationPoint(-30.75F, 2F, 3.75F);

		bodyModel[265].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 603
		bodyModel[265].setRotationPoint(29.5F, 2F, -5.75F);

		bodyModel[266].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 604 lamp ditchlight rear down
		bodyModel[266].setRotationPoint(29.75F, 2F, -5.75F);

		bodyModel[267].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 605
		bodyModel[267].setRotationPoint(29.5F, 2F, 3.75F);

		bodyModel[268].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 606 lamp ditchlight rear down
		bodyModel[268].setRotationPoint(29.75F, 2F, 3.75F);

		bodyModel[269].addBox(0F, 0F, 0F, 1, 6, 4, 0F); // Box 607
		bodyModel[269].setRotationPoint(-27F, -18F, -2F);

		bodyModel[270].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 385 headlight f SP
		bodyModel[270].setRotationPoint(-27.25F, -14F, 0F);

		bodyModel[271].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 386 headlight f SP
		bodyModel[271].setRotationPoint(-27.25F, -14F, -2F);

		bodyModel[272].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 610 gyralight double front sp
		bodyModel[272].setRotationPoint(-28.25F, -18F, -2F);

		bodyModel[273].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 611 gyralight double front sp
		bodyModel[273].setRotationPoint(-28.25F, -18F, 0F);

		bodyModel[274].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 612
		bodyModel[274].setRotationPoint(-28F, -18F, -2F);

		bodyModel[275].addBox(0F, 0F, 0F, 1, 2, 3, 0F); // Box 613
		bodyModel[275].setRotationPoint(-27.75F, -16F, -1.5F);

		bodyModel[276].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 614 gyralight red front sp
		bodyModel[276].setRotationPoint(-28F, -16F, -1F);

		bodyModel[277].addBox(0F, 0F, 0F, 1, 6, 4, 0F); // Box 615
		bodyModel[277].setRotationPoint(23F, -23F, -2F);

		bodyModel[278].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 616 headlight r sp
		bodyModel[278].setRotationPoint(23.25F, -19F, -2F);

		bodyModel[279].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 617 headlight r sp
		bodyModel[279].setRotationPoint(23.25F, -19F, 0F);

		bodyModel[280].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 618 gyralight red sp rear
		bodyModel[280].setRotationPoint(24F, -21F, -1F);

		bodyModel[281].addBox(0F, 0F, 0F, 1, 2, 3, 0F); // Box 619
		bodyModel[281].setRotationPoint(23.75F, -21F, -1.5F);

		bodyModel[282].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 620
		bodyModel[282].setRotationPoint(24F, -23F, -2F);

		bodyModel[283].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 621 gyralight double sp rear
		bodyModel[283].setRotationPoint(24.25F, -23F, 0F);

		bodyModel[284].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 622 gyralight double sp rear
		bodyModel[284].setRotationPoint(24.25F, -23F, -2F);

		bodyModel[285].addBox(-2.5F, 0F, -1F, 5, 2, 2, 0F); // Box 623
		bodyModel[285].setRotationPoint(-13F, -16F, -4F);
		bodyModel[285].rotateAngleY = -0.78539816F;

		bodyModel[286].addBox(-2.5F, 2F, 0F, 5, 1, 0, 0F); // Box 624
		bodyModel[286].setRotationPoint(-13F, -16F, -4F);
		bodyModel[286].rotateAngleY = -0.78539816F;

		bodyModel[287].addBox(-2.5F, 0F, -1.01F, 5, 2, 0, 0F); // Box 625 sp numerbboard
		bodyModel[287].setRotationPoint(-13F, -16F, -4F);
		bodyModel[287].rotateAngleY = -0.78539816F;

		bodyModel[288].addBox(-2.5F, 0F, 1.01F, 5, 2, 0, 0F); // Box 626 sp numberboard
		bodyModel[288].setRotationPoint(-13F, -16F, 4F);
		bodyModel[288].rotateAngleY = 0.78539816F;

		bodyModel[289].addBox(-2.5F, 0F, -1F, 5, 2, 2, 0F); // Box 627
		bodyModel[289].setRotationPoint(-13F, -16F, 4F);
		bodyModel[289].rotateAngleY = 0.78539816F;

		bodyModel[290].addBox(-2.5F, 2F, 0F, 5, 1, 0, 0F); // Box 628
		bodyModel[290].setRotationPoint(-13F, -16F, 4F);
		bodyModel[290].rotateAngleY = 0.78539816F;

		bodyModel[291].addShapeBox(0F, 0F, 0F, 7, 8, 14, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 629 dynamic brake
		bodyModel[291].setRotationPoint(4F, -19F, -7F);

		bodyModel[292].addShapeBox(0F, 0F, 0F, 1, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 630
		bodyModel[292].setRotationPoint(10F, -17F, -11F);

		bodyModel[293].addShapeBox(0F, 0F, 0F, 1, 0, 2, 0F,0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 631
		bodyModel[293].setRotationPoint(10F, -17F, 9F);

		bodyModel[294].addShapeBox(0F, 0F, 0F, 1, 0, 2, 0F,0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 632
		bodyModel[294].setRotationPoint(23F, -17F, 9F);

		bodyModel[295].addShapeBox(0F, 0F, 0F, 7, 1, 14, 0F,0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 633 dynamic brake
		bodyModel[295].setRotationPoint(4F, -20F, -7F);

		bodyModel[296].addBox(0F, 0F, 0F, 6, 1, 6, 0F); // Box 278 dynamic brake fan
		bodyModel[296].setRotationPoint(4.5F, -20.75F, -3F);

		bodyModel[297].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F,0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F); // Box 635 dynamic brake bit
		bodyModel[297].setRotationPoint(4.5F, -19F, -7F);

		bodyModel[298].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F,0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F); // Box 636 dynamic brake bit
		bodyModel[298].setRotationPoint(8.5F, -19F, -6.5F);

		bodyModel[299].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F,0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F); // Box 637 dynamic brake bit
		bodyModel[299].setRotationPoint(8.5F, -19F, 5.5F);

		bodyModel[300].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F,0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F); // Box 638 dynamic brake bit
		bodyModel[300].setRotationPoint(4.5F, -19F, 6F);

		bodyModel[301].addBox(0F, 0F, 0F, 19, 1, 3, 0F); // Box 639 torpedo tube
		bodyModel[301].setRotationPoint(-15.5F, -16F, -6F);

		bodyModel[302].addShapeBox(0F, 0F, 0F, 19, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 640 torpedo tube
		bodyModel[302].setRotationPoint(-15.5F, -17F, -6F);

		bodyModel[303].addShapeBox(0F, 0F, 0F, 19, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 641 torpedo tube
		bodyModel[303].setRotationPoint(-15.5F, -15F, -6F);

		bodyModel[304].addBox(0F, 0F, 0F, 19, 1, 3, 0F); // Box 642 torpedo tube
		bodyModel[304].setRotationPoint(-15.5F, -16F, 3F);

		bodyModel[305].addShapeBox(0F, 0F, 0F, 19, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 643 torpedo tube
		bodyModel[305].setRotationPoint(-15.5F, -17F, 3F);

		bodyModel[306].addShapeBox(0F, 0F, 0F, 19, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 644 torpedo tube
		bodyModel[306].setRotationPoint(-15.5F, -15F, 3F);

		bodyModel[307].addShapeBox(0F, 0F, 0F, 10, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 645
		bodyModel[307].setRotationPoint(-5F, 4F, -11F);

		bodyModel[308].addShapeBox(0F, 0F, 0F, 10, 3, 3, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 646
		bodyModel[308].setRotationPoint(-5F, 4F, 8F);

		bodyModel[309].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 647
		bodyModel[309].setRotationPoint(-13.5F, -15F, -5.5F);

		bodyModel[310].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 648
		bodyModel[310].setRotationPoint(0.5F, -15F, -5.5F);

		bodyModel[311].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 649
		bodyModel[311].setRotationPoint(0.5F, -15F, 3.5F);

		bodyModel[312].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 650
		bodyModel[312].setRotationPoint(-13.5F, -15F, 3.5F);

		bodyModel[313].addBox(0F, 0F, 0F, 2, 3, 1, 0F); // Box 651 yes this is a real bit
		bodyModel[313].setRotationPoint(9F, -1F, 6F);

		bodyModel[314].addShapeBox(0F, 0F, 0F, 14, 3, 3, 0F,0F, 0.5F, -1.5F, 1F, 0.5F, -1.5F, 1F, -1.5F, 0.5F, 0F, -1.5F, 0.5F, 0F, -1.5F, 0.5F, 1F, -1.5F, 0.5F, 1F, 0.5F, -1.5F, 0F, 0.5F, -1.5F); // Box 561 canfor bit
		bodyModel[314].setRotationPoint(-11.5F, -20F, -1.5F);

		bodyModel[315].addBox(0F, 0F, 0F, 2, 3, 2, 0F); // Box 654 canfor bit
		bodyModel[315].setRotationPoint(-13.5F, -21F, -1F);

		bodyModel[316].addShapeBox(0F, 0F, 0F, 8, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 3F, 1F, 0F, 3F, 1F, 0F, 3F, 1F, 0F, 3F); // Box 655 re engineered
		bodyModel[316].setRotationPoint(-25F, -15F, -4F);

		bodyModel[317].addBox(0F, 0F, 0F, 6, 1, 6, 0F); // Box 656 re engineered
		bodyModel[317].setRotationPoint(-24F, -15.75F, -3F);

		bodyModel[318].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 336
		bodyModel[318].setRotationPoint(-11F, -15F, -6.5F);

		bodyModel[319].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 337
		bodyModel[319].setRotationPoint(-10F, -14.75F, -7.5F);

		bodyModel[320].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 338
		bodyModel[320].setRotationPoint(-10.5F, -14.75F, -5.5F);

		bodyModel[321].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 339
		bodyModel[321].setRotationPoint(-9F, -14F, -6.5F);

		bodyModel[322].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 340
		bodyModel[322].setRotationPoint(19F, -23F, -0.5F);

		bodyModel[323].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 341
		bodyModel[323].setRotationPoint(19F, -22F, -0.5F);

		bodyModel[324].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 162 commander beacon
		bodyModel[324].setRotationPoint(12F, -23F, -6.5F);

		bodyModel[325].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0.3F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, 0.3F, -0.5F, 0.1F, 0.3F, 0F, 0.1F, -1F, 0F, 0.1F, -1F, 0F, 0.1F, 0.3F, 0F, 0.1F); // Box 165
		bodyModel[325].setRotationPoint(12.15F, -22F, -6.5F);

		bodyModel[326].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0.3F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, 0.3F, -0.5F, 0.1F, 0.3F, 0F, 0.1F, -1F, 0F, 0.1F, -1F, 0F, 0.1F, 0.3F, 0F, 0.1F); // Box 344
		bodyModel[326].setRotationPoint(12.15F, -22F, 5.5F);

		bodyModel[327].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 345 commander beacon
		bodyModel[327].setRotationPoint(12F, -23F, 5.5F);

		bodyModel[328].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 346 cull
		bodyModel[328].setRotationPoint(11.5F, -21F, -7F);

		bodyModel[329].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 347 cull
		bodyModel[329].setRotationPoint(11.5F, -21F, 5F);

		bodyModel[330].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -1F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 260
		bodyModel[330].setRotationPoint(16F, -26F, 10F);

		bodyModel[331].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -1F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 264
		bodyModel[331].setRotationPoint(18F, -26F, 10F);

		bodyModel[332].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,-1F, 0F, -1.5F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 268
		bodyModel[332].setRotationPoint(15F, -25F, 9F);

		bodyModel[333].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 1F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 274
		bodyModel[333].setRotationPoint(18F, -25F, 10F);

		bodyModel[334].addShapeBox(0F, 0F, 0F, 3, 6, 3, 0F,-0.5F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 0F, -2F, 0F, 0F, -0.5F, -2F, 1F, 1F, 0F, -2F, 1F, 0F, 0F, -3F, 0F, 0F); // Box 283
		bodyModel[334].setRotationPoint(17F, -23F, 8F);

		bodyModel[335].addShapeBox(0F, 0F, 0F, 3, 6, 3, 0F,0F, 0F, -2F, -0.5F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -2F, -0.5F, -2F, 1F, -3F, 0F, 0F, 1F, 0F, 0F); // Box 284
		bodyModel[335].setRotationPoint(15F, -23F, 8F);

		bodyModel[336].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0.5F, 0F, 1F); // Box 293
		bodyModel[336].setRotationPoint(18F, -25F, -11F);

		bodyModel[337].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1.5F, 0F, 0F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -1F); // Box 294
		bodyModel[337].setRotationPoint(15F, -25F, -11F);

		bodyModel[338].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F); // Box 295
		bodyModel[338].setRotationPoint(16F, -26F, -11F);

		bodyModel[339].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F); // Box 296
		bodyModel[339].setRotationPoint(18F, -26F, -11F);

		bodyModel[340].addShapeBox(0F, 0F, 0F, 3, 6, 3, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -0.5F, 0F, -1F, -3F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -2F, -0.5F, -2F, 1F); // Box 360
		bodyModel[340].setRotationPoint(17F, -23F, -11F);

		bodyModel[341].addShapeBox(0F, 0F, 0F, 3, 6, 3, 0F,0F, 0F, 0F, -2F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -2F, 1F, 0F, 0F, -3F, 0F, 0F, -0.5F, -2F, 1F, 1F, 0F, -2F); // Box 361
		bodyModel[341].setRotationPoint(15F, -23F, -11F);

		bodyModel[342].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 362 ane shit
		bodyModel[342].setRotationPoint(-28F, -16F, -2F);

		bodyModel[343].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 363 ane front light gyra
		bodyModel[343].setRotationPoint(-28.25F, -16F, -2F);

		bodyModel[344].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 364 ane front light gyra
		bodyModel[344].setRotationPoint(-28.25F, -16F, 0F);

		bodyModel[345].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 365 ane shit
		bodyModel[345].setRotationPoint(24F, -22F, -2F);

		bodyModel[346].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 366 ane rear light gyra
		bodyModel[346].setRotationPoint(24.25F, -22F, -2F);

		bodyModel[347].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 367 ane rear light gyra
		bodyModel[347].setRotationPoint(24.25F, -22F, 0F);

		bodyModel[348].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 368
		bodyModel[348].setRotationPoint(-21F, -14F, -6.5F);

		bodyModel[349].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 369
		bodyModel[349].setRotationPoint(-22.5F, -14.75F, -5.5F);

		bodyModel[350].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 370
		bodyModel[350].setRotationPoint(-23F, -15F, -6.5F);

		bodyModel[351].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 371
		bodyModel[351].setRotationPoint(-22F, -14.75F, -7.5F);

		bodyModel[352].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 114
		bodyModel[352].setRotationPoint(-10F, -11.5F, 7.7F);

		bodyModel[353].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[353].setRotationPoint(-10F, -12.5F, 7.7F);

		bodyModel[354].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 78
		bodyModel[354].setRotationPoint(-9.75F, -11F, 7.95F);

		bodyModel[355].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 245
		bodyModel[355].setRotationPoint(-10F, -13.5F, 6.5F);

		bodyModel[356].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 376
		bodyModel[356].setRotationPoint(-22F, -13.5F, 6.5F);

		bodyModel[357].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 377
		bodyModel[357].setRotationPoint(-22F, -12.5F, 7.7F);

		bodyModel[358].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 378
		bodyModel[358].setRotationPoint(-22F, -11.5F, 7.7F);

		bodyModel[359].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 379
		bodyModel[359].setRotationPoint(-21.75F, -11F, 7.95F);

		bodyModel[360].addBox(0F, 0F, -2F, 6, 2, 4, 0F); // Box 380
		bodyModel[360].setRotationPoint(16.5F, -21.5F, -7F);
		bodyModel[360].rotateAngleX = 0.29670597F;

		bodyModel[361].addShapeBox(-1F, 1F, -2F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 381
		bodyModel[361].setRotationPoint(16.5F, -21.5F, -7F);
		bodyModel[361].rotateAngleX = 0.29670597F;

		bodyModel[362].addShapeBox(-1F, 0F, -2F, 1, 1, 4, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 382
		bodyModel[362].setRotationPoint(16.5F, -21.5F, -7F);
		bodyModel[362].rotateAngleX = 0.29670597F;

		bodyModel[363].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0.5F, 0F, 0F, -1F, 0F, 0F, 1F, 1F, 0F, -1.5F, 1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F); // Box 280
		bodyModel[363].setRotationPoint(-33F, 5F, 2F);

		bodyModel[364].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F); // Box 281
		bodyModel[364].setRotationPoint(-33F, 6F, 0F);

		bodyModel[365].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,-1F, 0F, 0F, 0.5F, 0F, 0F, 3F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, -1F, -2.5F, 0F, -1F); // Box 282
		bodyModel[365].setRotationPoint(-34F, 7F, 0F);

		bodyModel[366].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,-3.5F, 0F, 0F, 3F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -2.5F, 0F, -1F, 2F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 283
		bodyModel[366].setRotationPoint(-34F, 7F, -10F);

		bodyModel[367].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,-2.5F, 0F, 0F, 2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 284
		bodyModel[367].setRotationPoint(-33F, 6F, -10F);

		bodyModel[368].addShapeBox(0F, 0F, -2F, 1, 1, 8, 0F,-1.5F, 1F, 0F, 1F, 1F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 285
		bodyModel[368].setRotationPoint(-33F, 5F, -8F);

		bodyModel[369].addBox(0F, 0F, 0F, 3, 1, 0, 0F); // Box 389
		bodyModel[369].setRotationPoint(-27F, 8F, 9F);
		bodyModel[369].rotateAngleY = -3.14159265F;

		bodyModel[370].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 390
		bodyModel[370].setRotationPoint(-30F, 9F, 9F);

		bodyModel[371].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 391
		bodyModel[371].setRotationPoint(-30F, 7F, 7.5F);

		bodyModel[372].addBox(0F, 0F, 0F, 3, 1, 0, 0F); // Box 392
		bodyModel[372].setRotationPoint(-27F, 6F, 7.5F);
		bodyModel[372].rotateAngleY = -3.14159265F;

		bodyModel[373].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 393
		bodyModel[373].setRotationPoint(-30F, 5F, 6F);

		bodyModel[374].addBox(0F, 0F, 0F, 3, 1, 0, 0F); // Box 394
		bodyModel[374].setRotationPoint(-27F, 4F, 6F);
		bodyModel[374].rotateAngleY = -3.14159265F;

		bodyModel[375].addBox(0F, 0F, 0F, 3, 1, 0, 0F); // Box 395
		bodyModel[375].setRotationPoint(30F, 8F, -9F);
		bodyModel[375].rotateAngleY = -3.14159265F;

		bodyModel[376].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 396
		bodyModel[376].setRotationPoint(30F, 9F, -9F);
		bodyModel[376].rotateAngleY = -3.14159265F;

		bodyModel[377].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 397
		bodyModel[377].setRotationPoint(30F, 7F, -7.5F);
		bodyModel[377].rotateAngleY = -3.14159265F;

		bodyModel[378].addBox(0F, 0F, 0F, 3, 1, 0, 0F); // Box 398
		bodyModel[378].setRotationPoint(30F, 6F, -7.5F);
		bodyModel[378].rotateAngleY = -3.14159265F;

		bodyModel[379].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 399
		bodyModel[379].setRotationPoint(30F, 5F, -6F);
		bodyModel[379].rotateAngleY = -3.14159265F;

		bodyModel[380].addBox(0F, 0F, 0F, 3, 1, 0, 0F); // Box 400
		bodyModel[380].setRotationPoint(30F, 4F, -6F);
		bodyModel[380].rotateAngleY = -3.14159265F;

		bodyModel[381].addShapeBox(0F, 0F, 0F, 6, 1, 0, 0F,0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F); // Box 401
		bodyModel[381].setRotationPoint(5F, -10F, -11.01F);

		bodyModel[382].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, -0.5F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F); // Box 202
		bodyModel[382].setRotationPoint(20F, -23.5F, -1.5F);

		bodyModel[383].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,-0.25F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F); // Box 405
		bodyModel[383].setRotationPoint(9F, -20.5F, -1.5F);

		bodyModel[384].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 406
		bodyModel[384].setRotationPoint(8F, -20F, -0.5F);

		bodyModel[385].addShapeBox(0F, 0F, 0F, 8, 5, 5, 0F,0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 407
		bodyModel[385].setRotationPoint(13F, -16F, -15F);

		bodyModel[386].addShapeBox(0F, 0F, 0F, 8, 1, 3, 0F,0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 408
		bodyModel[386].setRotationPoint(13F, -17F, -13F);

		bodyModel[387].addBox(0F, 0F, 0F, 54, 1, 0, 0F); // Box 191 skirt
		bodyModel[387].setRotationPoint(-27F, 3F, 10.99F);

		bodyModel[388].addBox(0F, 0F, 0F, 54, 1, 0, 0F); // Box 192
		bodyModel[388].setRotationPoint(-27F, 3F, -10.99F);

		bodyModel[389].addBox(0F, 0F, 0F, 1, 4, 0, 0F); // Box 389
		bodyModel[389].setRotationPoint(-3F, 3F, 11F);

		bodyModel[390].addBox(0F, 0F, 0F, 1, 4, 0, 0F); // Box 390
		bodyModel[390].setRotationPoint(2F, 3F, 11F);

		bodyModel[391].addBox(0F, 0F, 0F, 1, 4, 0, 0F); // Box 391
		bodyModel[391].setRotationPoint(-3F, 3F, -11F);

		bodyModel[392].addBox(0F, 0F, 0F, 1, 4, 0, 0F); // Box 392
		bodyModel[392].setRotationPoint(2F, 3F, -11F);

		bodyModel[393].addBox(0F, 0F, 0F, 2, 0, 14, 0F); // Box 393
		bodyModel[393].setRotationPoint(-27.5F, -5F, -7F);

		bodyModel[394].addBox(0F, 0F, 0F, 3, 3, 4, 0F); // Box 394
		bodyModel[394].setRotationPoint(27F, -1F, -2F);

		bodyModel[395].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 396
		bodyModel[395].setRotationPoint(-29.5F, 0F, -2F);

		bodyModel[396].addShapeBox(0F, 0F, 0F, 0, 5, 5, 0F,0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F); // Box 397
		bodyModel[396].setRotationPoint(21.49F, -12F, 2F);

		bodyModel[397].addBox(0F, 0F, 0F, 1, 7, 1, 0F); // Box 398
		bodyModel[397].setRotationPoint(21.5F, -10F, 4F);

		bodyModel[398].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 398
		bodyModel[398].setRotationPoint(0F, -15F, 3F);

		bodyModel[399].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 399
		bodyModel[399].setRotationPoint(2F, -14F, 3F);
	}
	ModelFlexicoil2 theTrucks1 = new ModelFlexicoil2();
	ModelTypeA theTrucks2 = new ModelTypeA();

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		for (int i = 0; i < 400; i++) {
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

		if (entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor() == 6) {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/typeA_Silver.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.0F ,0.0F,0F);
			theTrucks2.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(2.0F,0.0F,0);
			theTrucks2.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();

		} else if (entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor() == 3 || entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor() == 2344 || entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor() == 42343227) {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/flexicoil2_Black.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.0, 0.33, 0);
			theTrucks1.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(2.0, 0, 0);
			theTrucks1.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else if (entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor() == 10) {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/flexicoil2_Silver.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.0, 0.33, 0);
			theTrucks1.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(2.0, 0, 0);
			theTrucks1.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else if (entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor() == 8) {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/typeA_SP.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.0F ,0.0F,0F);
			theTrucks2.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(2.0F,0.0F,0);
			theTrucks2.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/typeA_Black.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.0F ,0.0F,0F);
			theTrucks2.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(2.0F,0.0F,0);
			theTrucks2.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		}
	}
	public float[] getTrans() {
		return new float[]{-1.0F, 0.15F, 0.00F};
	}

	public float[] getRotate() {
		return new float[] { 0F, 180F, 180F };
	}

	public float[] getScale() {
		return null;
	}

	public ArrayList<double[]> getSmokePosition() {
		return new ArrayList<double[]>() {
			{
				add(new double[]{0.90D, 1.20D, 0.0D});
				add(new double[]{1.65D, 1.20D, 0.0D});
			}
		};
	}
}